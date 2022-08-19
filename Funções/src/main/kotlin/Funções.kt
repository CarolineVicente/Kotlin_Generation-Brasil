fun operacao(n1: Double, n2: Double, resp: Double): Double {

    return if (resp == 1.0) {

        n1 + n2

    } else if (resp == 2.0) {

       n1 - n2

    } else if (resp == 3.0) {

        n1 * n2

    } else {

       n1 / n2

    }
}

