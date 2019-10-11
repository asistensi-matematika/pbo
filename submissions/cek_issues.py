import requests
from bs4 import BeautifulSoup

link = 'https://github.com/asistensi-matematika/tugas3-pbo-angelaanathania'
r = requests.get(link) 
s = BeautifulSoup(r.content,'lxml')

counter = s.find('span',class_='Counter').text
print(counter)
