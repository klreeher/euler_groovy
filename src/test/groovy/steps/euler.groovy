package steps

this.metaClass.mixin(cucumber.api.groovy.Hooks)
this.metaClass.mixin(cucumber.api.groovy.EN)

Given(~/^all natural numbers below (\d+)$/) { int limit ->
    int minimum = 0
    int maximum = limit
    // create an instance of the euler class with the bounds prescribed
}
When(~/^I list all the multiples of (\d+) or (\d+)$/) { int arg1, int arg2 ->
    // take in the arguments and pass to the euler instance
}
Then(~/^I have the values list:(.+)$/) { List<Integer> expectedMultiples ->

    println(expectedMultiples)
    // assert that the euler instance returns == the expectedMultiples list
}
