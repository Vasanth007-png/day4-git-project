#!/bin/bash
TARGET_URL="https://github.com"
sudo wget -O /usr/libexec/docker/cli-plugins/docker-buildx "$TARGET_URL"
sudo chmod +x /usr/libexec/docker/cli-plugins/docker-buildx
