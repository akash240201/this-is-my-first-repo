def pallindrome_checker(word):
    if len(word) == 0 or len(word) == 1:
        print('The word is a pallindrome')
        return True
    elif word[0] != word[-1]:
        print('The word is not a pallindrome')
        return False
    else:
        pallindrome_checker(word = word[1:-1])

pallindrome_checker('ramakantnakamar')
