import requests
import webbrowser

# asks for certain data and returns photo of the day from NASA with explanation of the photo


API_ID = 'YbD5Be859uvVOSyDnyQJp5TxNag357wMho1Qg9Ik'
BASE_URL = 'https://api.nasa.gov/planetary/apod'

date = input('Input a date in this form YYYY-MM-DD: ')
request_url = f'{BASE_URL}?date={date}&api_key={API_ID}'
nasa_data = requests.get(request_url)

if nasa_data.status_code == 200:
    nasa = nasa_data.json(", explanation")
    url = nasa['url']
    print('Photo url: ', url)
    webbrowser.open_new_tab(url)
else:
    print('An error occured.')