#!/usr/bin/env python

"""
Digunakan untuk mendapatkan hasil dari spreadsheet --> markdown table --> update readm.md bagian ## nilai tugas
 """

import pandas as pd
from gspread_pandas import Spread, Client
import subprocess
from tqdm import tqdm
from fire import Fire


def get_sheet(SHEET, CSV_SPREADSHEET='Asistensi PBO Jumat 2019'):
    spread = Spread(CSV_SPREADSHEET)
    spread.open_sheet(SHEET)
    df = spread.sheet_to_df()
    df['Nilai'] = pd.to_numeric(df['Nilai'], errors='coerce')
    links = []
    for link in tqdm(df.REPO, desc='issue'):
        try:
            links.append(get_issues(link))
        except:
            links.append(None)
    df['Issues'] = links
    spread.update_cells('H2', 'H28', links)
    df.drop(['Catatan', 'REPO'], axis=1, inplace=True)
    return df


def get_details(csv):
    df = pd.read_csv(csv)
    return df.Nilai.mean()


def update_md(file_name, df='tugas3-pbo.csv', md=r'../readme.md'):
    readme = open(md).read().split('## nilai tugas')
    readme[-1] = '## nilai tugas\n'+get_latest_csv(file_name)+'\n\n\n'
    readme.append(f'Rata-rata: {get_details(df)}')
    file_md = " ".join(readme)
    with open(md, 'w+') as f:
        f.write(file_md)


def get_latest_csv(file_name):
    table = subprocess.check_output(
        f'csv2md {file_name}', shell=True).decode("utf-8")
    return table


def get_issues(link):
    import requests
    from bs4 import BeautifulSoup
    r = requests.get(link)
    s = BeautifulSoup(r.content, 'lxml')
    counter = s.find('span', class_='Counter').text
    return counter


def main(file_name, SHEET):
    df = get_sheet(SHEET)
    df.to_csv(f'{file_name}', index=False)
    update_md(file_name, df=file_name)
    print(f'successfully saved to {file_name} ')


if __name__ == "__main__":
    Fire()
