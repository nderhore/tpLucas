@echo off
call mvn clean package
call docker build -t com.company.yostane.gaming/amangousse .
call docker rm -f amangousse
call docker run -d -p 9080:9080 -p 9443:9443 --name amangousse com.company.yostane.gaming/amangousse