package com.euler.test.steps

import com.euler.libraries.Multiple
import com.euler.test.WorldState

this.metaClass.mixin(cucumber.api.groovy.Hooks)
this.metaClass.mixin(cucumber.api.groovy.EN)

WorldState currentWorld = new WorldState()

Given(~/^the natural numbers below (\d+)$/) { int limit ->

    int min = 0
    currentWorld.min = min
    currentWorld.max = limit
    //println("current world state has range ${currentWorld.min .. currentWorld.max}")
}
When(~/^we collect all that are multiples of (\d+) or (\d+)$/) { int arg1, int arg2 ->
    Multiple first = new Multiple(arg1, currentWorld.getMin(), currentWorld.getMax())
    Multiple second = new Multiple(arg2, currentWorld.getMin(), currentWorld.getMax())

    currentWorld.multiples = [first, second]

    println("\nMultiples of ${first.target}: ${first.multiplesOf}")

    println("\nMultiples of ${second.target}: ${second.multiplesOf}")
}
Then(~/^the sum of these numbers is (\d+)$/) { int arg1 ->


    def summation = (currentWorld.getMultiples().get(0).multiplesOf + currentWorld.getMultiples().get(1).multiplesOf).unique().sum()

    assert summation == arg1
}