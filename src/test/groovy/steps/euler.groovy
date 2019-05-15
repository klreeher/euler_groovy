package steps

import cucumber.api.PendingException

this.metaClass.mixin(cucumber.api.groovy.Hooks)
this.metaClass.mixin(cucumber.api.groovy.EN)

Given(~/^all natural numbers below (\d+)$/) { int limit ->
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException()
}
When(~/^I list all the multiples of (\d+) or (\d+)$/) { int arg1, int arg2 ->
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException()
}
Then(~/^I have the values list:(.+)$/) { List<Integer> expectedMultiples ->
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException()
}
