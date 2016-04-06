# makeorbreak-android


#Inspiration

Sometimes, people break things. But it's often expensive and inconvenient to track down or hire a professional. What if you could find someone right in your college dorm who knows how to fix your broken stuff? Or if you could make a quick buck fixing things for other people?
What it does

Make or Break allows you to be a maker or a breaker, or both. It matches people who have broken stuff and nearby people who just might know how to fix them. Just post a request and set a price. Based on your text and photos, Make or Break will tag your problem and try to pair you with the right handyman. As a maker, the app will help you find relevant jobs for you within the correct geographic region.
How we built it

On the front end, we built mobile apps for iOS and Android.

On the back end, we wrote a RESTful API in Flask. Sign-in is handled by unique usernames. The user may define areas of expertise and maximum range within which they are willing to accept jobs. All user data is stored in a SQL database. After they have registered, they may submit jobs.

When submitting a job request, the user may send a text description, a photo, and a price. Clarifai and a Python implementation of the Rapid Automatic Keyword Extraction (RAKE) algorithm are used to generate tags for the job. The user may revise these at any time. Images are stored on Amazon S3.

When looking for jobs to accept, the user browses through a list filtered by distance calculated by the haversine formula and by tag matching. When the user accepts a job, a chat instance is opened between maker and breaker through SimpleChat and Firebase. When a job is completed, we use the Capital One Nessie API to simulate a bank transfer between the two parties according to the agreed-upon price.
Challenges we ran into

    we initially intended to use the Twilio IP Messaging service for our chat, but we had issues with the SDK and with accounts being banned for suspicious activity
    conflicting python distributions and environments
    converting between base64 and urls for Clarifai and Amazon S3
    building a native Android app for the first time

#Accomplishments that we're proud of

    Building an end-to-end functional product
    Successfully integrating a bunch of APIs

#What we learned

    How to write Android apps
    How to work with the CapitalOne API
    How to work with the Clarifai API

#What's next for Make or Break

    Actual authentication
    "similar" tags as opposed to identical matching (more NLP)
    Maker ratings

#Built With

    ios
    swift
    android
    java
    flask
    python
    capital-one
    clarifai
    natural-language-processing
    firebase
    sqlalchemy
    amazon-web-services

