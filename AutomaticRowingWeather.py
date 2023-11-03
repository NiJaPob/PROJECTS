import smtplib
import time
import requests


# Takes weather data from api and determiens if it is good weather to row in.
# automated to send at a designated time

# creates function for getting weather from API
def getWeather(): 
    API_KEY = "c70eaf7682d33660f841d89c984445c5"
    BASE_URL = "http://api.openweathermap.org/data/2.5/weather"


    # can change city varibale for whatever location
    city = "Ridgefield Park" 
    request_url = f"{BASE_URL}?appid={API_KEY}&units=imperial&q={city}"
    response = requests.get(request_url)

    data = response.json()
    weather = data['weather'][0]['description']
    temp = str(data['main']['temp'])
    wind = data['wind']['speed']
    
    
    if wind >= 13:
        goodToRow = "It is not good to row!"

    else:
        goodToRow = "It is good to row!"

    wind = str(wind)

    actWeather ="In " + city + " it is: " + weather + "\n" + "The temperature is: " + temp + " degrees Farenheit" + "\n" + "The wind speeds are: " + wind + " miles per hour" + "\n" + goodToRow

    return actWeather

# sets return value of weather fucntion to variable
weather = getWeather()


# function to check the time for whe nto send weather email
def checkTime():
    localTime = time.localtime()
    actualTime =  time.strftime("%H:%M", localTime)

    if actualTime != "07:15":
        print("It's not time yet")
    else:
        print("ITS TIME")
        return actualTime


    
# function for actualy sending weather email to my phone
def sendEmail(weather):
    sender = "nick95222@gmail.com"
    receiver = "pobjnick@gmail.com"
    password = ""
    subject = "Morning condtions"
    body = weather

    
    message = f"""From: {sender}
    To: {receiver}
    Subject: {subject}\n
    {body}
    """

    server = smtplib.SMTP("smtp.gmail.com", 587)
    server.starttls()

    server.login(sender, password)
    server.sendmail(sender, receiver, message)
    print("Email has been sent!")


# creates loop that checks the time every 60 seconds and runs send email function when it is finally time to send the weather info
while True:
    localTime = time.localtime()
    actualTime =  time.strftime("%H:%M", localTime)

    if actualTime != "08:50":
        pass
    else:
        print("ITS TIME")
        sendEmail(weather)
    
    time.sleep(60)