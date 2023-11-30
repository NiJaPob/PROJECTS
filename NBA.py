import requests

url = "https://api-nba-v1.p.rapidapi.com/players/statistics"

querystring = {"id":"236", "season":"2022"}

headers = {
	"X-RapidAPI-Key": "271ad58b4amshb8b64f539e659fbp1de4e1jsn0f595ea95d29",
	"X-RapidAPI-Host": "api-nba-v1.p.rapidapi.com"
}

response = requests.get(url, headers=headers, params=querystring)

print(response.json())

