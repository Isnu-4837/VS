import requests as rs

def weather(state):
    apiKey="85dff6786bc26330e6cb7f3fa5ffe37e"
    url="https://api.openweathermap.org/data/2.5/weather"
    params={
        "q":state,
        "appid":apiKey,
        "units":"metric"
    }
    response=rs.get(url,params=params)
    print(response.json())
weather("Kolkata")