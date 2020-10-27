import string
alphastr = list(string.ascii_lowercase)
def is_pangram(s):
    a = s.lower()
    count = 0 
    for i in alphastr:
        if i not in list(a):
            return False
    return True