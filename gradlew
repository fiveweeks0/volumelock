#!/bin/sh
#
# Copyright © 2015-2021 the original authors.
#
# Gradle start up script for POSIX compatible shells
#

# Attempt to set APP_HOME
APP_HOME="${APP_HOME:-$(cd "$(dirname "$0")" && pwd)}"

exec java -jar "$APP_HOME/gradle/wrapper/gradle-wrapper.jar" "$@"
