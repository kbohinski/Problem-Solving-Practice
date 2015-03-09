'''
Kevin Bohinski
bohinsk1@tcnj.edu
2015-3-7

Problem-Solving-Practice
projectEuler
prob6.py
Copyright (c) 2015 Kevin Bohinski. All rights reserved.
'''

'''
The sum of the squares of the first ten natural numbers is,
12 + 22 + ... + 102 = 385

The square of the sum of the first ten natural numbers is,
(1 + 2 + ... + 10)2 = 552 = 3025

Hence the difference between the sum of the squares of the first ten natural numbers
and the square of the sum is 3025 − 385 = 2640.
Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
'''

squares = 0
sum = 0

for i in range (1, 101):
    squares = squares + (i * i)
    sum = sum + i

sum = (sum * sum)
diff = sum - squares

print(diff)