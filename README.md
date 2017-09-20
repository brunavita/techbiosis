# Introduction
This is a Techbiosis Test - Sorting Balls and Spell it out exercises made by Java project.

Exercise 1: Sorting Balls. 
In the Pragmatic Lottery (motto: There’s One Born Every Minute, and it Might Just Be You!), we select each week’s winning combination by drawing balls. There are sixty balls, numbered (not surprisingly, as we are programmers) 0 to 59. The balls are drawn by the personable, but somewhat distracted, Daisy Mae. As a result, some weeks five numbers are drawn, while other weeks seven, nine, or even fifteen balls make it to the winner’s rack. Regardless of the number of balls drawn, our viewers need to see the list of winning numbers in sorted order just as soon as possible. 
So, your challenge is to come up with some code that accepts each number as it is drawn and presents the sorted list of numbers so far. The tests might look something like:
	 rack = Rack.new
	 assert_equal([], rack.balls)
	 rack.add(20)
	 assert_equal([ 20 ], rack.balls)
	 rack.add(10)
	 assert_equal([ 10, 20 ], rack.balls)
	 rack.add(30)
	 assert_equal([ 10, 20, 30 ], rack.balls)

Exercise 2: Spell it out
Write a program which given a whole number between 0 and 1 billion; writes it out in words. E.g.
542: five hundred forty-two
23212 twenty-three thousand two hundred twelve
1049875: one million forty-nine thousand eight hundred seventy-five

# Running the tests
There are two JUnit classes for each exercise: SortTest and ConvertNumberToWordTest.

# Thanks
Thanks to Techbiosis for giving me an opportunity to prove myself that I can do something I don't know.

# Authors
Bruna Vita Ashton