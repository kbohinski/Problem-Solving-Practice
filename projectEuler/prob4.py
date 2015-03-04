'''
Kevin Bohinski
bohinsk1@tcnj.edu
2015-3-2

Problem-Solving-Practice
projectEuler
prob4.py
Copyright (c) 2015 Kevin Bohinski. All rights reserved.
'''

'''
A palindromic number reads the same both ways.
The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
Find the largest palindrome made from the product of two 3-digit numbers.
'''

lpal = 0
temp = 0
tempStr = ""
strLen = 0
check = True

for i in range(100, 999):
    for u in range(100, 999):
        temp = i * u
        tempStr = str(temp)
        strLen = len(tempStr)
        strLen = strLen - 1
        check = True
        if (strLen % 2 == 0):
            ''' Even '''
            for j in range(0, int(strLen / 2)):
                if (tempStr[j] != tempStr[(strLen - j)]):
                    check = False
                    break
            if (check and (temp > lpal)):
                lpal = temp
        else:
            ''' Odd '''
            for j in range(0, int((strLen / 2)) + 1):
                if (tempStr[j] != tempStr[(strLen - j)]):
                    check = False
                    break
            if (check and (temp > lpal)):
                lpal = temp

print(lpal)
