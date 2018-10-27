# Spectacular

## Idea
Did you ever find yourself hungry and wanted to cook something but don't know what to cook? Now you can satisfy your tummy as "Make a Recipe" is here. We plan to make an app where the user can take photos of the ingredients which the user has and the app recommends all the possible dishes which can be made with those ingredients by recognizing them.

## Tools and technologies used
1. Django - Backend Server.
2. Android - Client Side.
3. CNN using Keras - For recognising the ingredients in the images.
4. Scraping - For scraping the web and fetching the reicpes.

## Instructions

## Description

1. The user opens his/her app and takes a photo of an ingredient and hits the submit button.
2. The image is then sent to backend which is written with Django and deployed to Heroku.
3. The server takes the image, predicts what ingredient is present in the image witht the help of CNN and sends it back to the client.
4. The client can verify it and he/she will be asked if there are more ingredients to take photos of.
5. If the answer is yes, steps 2 to 4 are repeated.
6. If answer is no, The list of all the ingredients which are detected will be shown on screen.
7. After that, The scraping algorithms will come in and searches the web for the dishes that can be made with the ingredients detected in the earlier step.
8. Two of the top most popular dishes will be shown.
9. The app will also recommend, the best combination for each of the displayed item.
    ex: if you have all the ingredients to make Biryani. It would suggest you to add Kuchember to it.
10. The app is not complete if it doesn't show you how to make the recommended dishes. It shows you some youtube videos on how to make the recipes which are possible with the ingredients you have.

## Copyright

