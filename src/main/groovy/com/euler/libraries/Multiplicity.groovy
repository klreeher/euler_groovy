package com.euler.libraries

class Multiple {

    Integer target
    Integer min
    Integer max

    Multiple(Integer target, Integer min, Integer max) {
        this.target = target
        this.min = min
        this.max = max
    }

    ArrayList<Integer> getMultiplesOf() {
        return (this.min..this.max - 1).findAll { it % this.target == 0 }
    }
}

