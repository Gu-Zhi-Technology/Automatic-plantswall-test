# -*- coding: utf-8 -*-
import socket
HOST = '127.0.0.1'
PORT = 2337

server = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
server.bind((HOST, PORT))
server.listen(10)
conn, addr = server.accept()
while True:
    serverMessage = input()
    serverMessage = serverMessage+'\n'
    conn.sendall(serverMessage.encode())
    print("ok")
    print("ok")

