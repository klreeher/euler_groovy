/*
    The prime factors of 13195 are 5, 7, 13 and 29.

    What is the largest prime factor of the number 600851475143 ?

    The quickest way to find the factors of a number is to divide it by the smallest prime number (bigger than 1) that goes into it evenly with no remainder.
    Continue this process with each number you get, until you reach 1.

    The prime factors of 13195 are 5, 7, 13 and 29.
 */



def factors = (1..30).collect{
    if (!(13195 % it)){
        it
    }

}

println(factors.unique())