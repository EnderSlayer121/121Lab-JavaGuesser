# 121Lab-JavaGuesser

## public static void main(String[], args)
```
set a boolean keepGoing to true
create a String variable named response
while keepGoing:
  call Menu method to return userChoice into response
  if response == "0":
    set keepGoing to false
  if response == "1":
    call HumanGuesser method
  if response == "2":
    call ComputerGuesser method
  else:
    prompt user to try again, choosing a number between 0-2
```

## String Menu()
```
create a string variable called userChoice
prompt user whether to (0) Quit, (1) Human Guesser, or (2) Computer Guesser
record user's input into userChoice
return userChoice
```

## void HumanGuesser()
```
create Integer variables named random and userGuess
generate a random number between 1 and 100 to put into random
set a boolean keepGoing to true
while keepGoing:
  prompt user to choose a number between 1 and 100
  record user's input into userGuess
  if userGuess > random:
    prompt user that guess was too high
  if userGuess < random:
    prompt user that guess was too low
  if userGuess == random:
    prompt user that they have guessed correctly
    set keepGoing to false
  else:
    prompt user that their input was invalid
```

## void ComputerGuesser()
```
create Integer variables named count, computerGuess, and binarySearch
create a String named userResponse
create a boolean keepGoing
set computerGuess to 50
set binarySearch and count to 0
while keepGoing:
  binarySearch = computerGuess / 2
  count += 1
  asks user if number is computerGuess and if it's too high, too low, or correct
  record user's response to userResponse
  if userResponse == "l"
    computerGuess += binarySearch
  if userResponse == "h"
    computerGuess -= binarySearch
  if userResponse == "c"
    keepGoing = false
    output count to show number of attempts until guessed
```
