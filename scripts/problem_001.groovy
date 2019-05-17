/*
    If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.

    Find the sum of all the multiples of 3 or 5 below 1000.

 */

static ArrayList<Integer> getMultiplesOf(Integer start, Integer stop, Integer target) {
    return (start..stop - 1).findAll { it % target == 0 }
}

static def getSumOf(List<Integer> arg1, List<Integer> arg2) {
    return (arg1 + arg2).unique().sum()
}

def targets = [3, 5]

def targetMultiples = targets.collect {
    getMultiplesOf(1, 10, it)
}

print(targetMultiples)

println($/
            All the natural numbers below 10 that are multiples of 3 or 5: ${targetMultiples}
            The sum of these multiples is ${getSumOf(targetMultiples)}
        /$)

def targetMultiples2 = targets.collect {
    getMultiplesOf(1, 1000, it)
}

print(targetMultiples)

println($/
            All the natural numbers below 10 that are multiples of 3 or 5: ${targetMultiples2}
            The sum of these multiples is ${getSumOf(targetMultiples2)}
        /$)