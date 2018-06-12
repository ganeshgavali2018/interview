Story: The Berlin Clock

Meta:
@scope interview

Narrative:
    As a clock enthusiast
    I want to tell the time using the Berlin Clock
    So that I can increase then number of ways that I can read the time
    
Scenario: Null Time1
When the time is NULL
Then the clock should look like
Invalid Time

Scenario: Invalid Time2
When the time is 25:00:00
Then the clock should look like
Invalid Time

Scenario: Invalid Time3
When the time is -1:00:00
Then the clock should look like
Invalid Time

Scenario: Invalid Time4
When the time is 20:500:00
Then the clock should look like
Invalid Time

Scenario: Invalid Time5
When the time is 20:500:300
Then the clock should look like
Invalid Time

Scenario: Midnight
When the time is 00:00:00
Then the clock should look like
Y
OOOO
OOOO
OOOOOOOOOOO
OOOO

Scenario: Middle of the afternoon
When the time is 13:17:01
Then the clock should look like
O
RROO
RRRO
YYROOOOOOOO
YYOO

Scenario: Afternoon
When the time is 12:00:00
Then the clock should look like
Y
RROO
RROO
OOOOOOOOOOO
OOOO

Scenario: Evening
When the time is 18:00:00
Then the clock should look like
Y
RRRO
RRRO
OOOOOOOOOOO
OOOO

Scenario: 4.15 hours before midnight
When the time is 19:45:00
Then the clock should look like
Y
RRRO
RRRR
YYRYYRYYROO
OOOO

Scenario: 3.45 hours before midnight
When the time is 20:15:00
Then the clock should look like
Y
RRRR
OOOO
YYROOOOOOOO
OOOO

Scenario: 2.30 hours before midnight
When the time is 21:30:45
Then the clock should look like
O
RRRR
ROOO
YYRYYROOOOO
OOOO

Scenario: Just before midnight
When the time is 23:59:59
Then the clock should look like
O
RRRR
RRRO
YYRYYRYYRYY
YYYY

Scenario: Midnight
When the time is 24:00:00
Then the clock should look like
Y
RRRR
RRRR
OOOOOOOOOOO
OOOO



