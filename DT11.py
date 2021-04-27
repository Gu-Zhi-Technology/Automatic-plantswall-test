import Adafruit_DHT

DHT = Adafruit_DHT.DHT11
PIN = 4

while True:
    humidity, temperature = Adafruit_DHT.read_retry(DHT, PIN)
    if humidity is not None and temperature is not None:
        print("{0:0.2f}*C  {1:0.2f}%".format(temperature, humidity))
    else:
        print("Failed")