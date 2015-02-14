# CricketWorldCup 2015

Android app to show schedule of upcoming World Cup Matches

Developed Using TDD

## What you’ll need
* Android Studio or IDE
* JDK 6 or later
* Android SDK
* An Android device or Emulator
* Ruby 2.1.1 and Bundler Gem

## Steps
1. Setup Android environment (http://spring.io/guides/gs/android/)
2. Install Gradle (http://www.gradle.org/downloads)
3. Run command './gradlew build'

## Unit Tests
Run command: './gradlew test'

## Automation tests

1. ./gradlew build
2. bundle exec calabash-android build app/build/outputs/apk/app-debug.apk
3. bundle exec calabash-android run app/build/outputs/apk/app-debug.apk

NOTE: You have to generate your own keystore using this command 'keytool -genkey -v -keystore ~/.android/debug.keystore -alias androiddebugkey -storepass android -keypass android -keyalg RSA -keysize 2048 -validity 10000 -dname "CN=Android Debug,O=Android,C=US"' 

and then change its path in build.gradle of app
