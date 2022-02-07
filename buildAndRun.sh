#!/bin/sh
mvn clean package && docker build -t com.company.yostane.gaming/amangousse .
docker rm -f amangousse || true && docker run -d -p 9080:9080 -p 9443:9443 --name amangousse com.company.yostane.gaming/amangousse