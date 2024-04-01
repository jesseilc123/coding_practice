var isPalindrome = function(x) {
    // edge case for negative number
    if (x < 0) {
        return false
    }

    // variables to for ease 
    const num_str = x.toString()
    const length = num_str.length

    // iterate
    let i = 0
    while (i <= length) {
        if (num_str[i] !== num_str[length - i - 1]) {
            return false
        }
        i++
    }
    return true
};