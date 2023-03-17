
var matriz = Array(5){IntArray(5)}
var increase = 1

for(i in 0 until matriz.size){
    for(j in 0 until matriz[i].size){
        matriz[i][j] = increase
        increase++
    }
}

for (i in 0 until matriz.size){
    for(j in 0 until matriz[i].size){
        print("${matriz[i][j]}\t")
    }
    println()
}

var diagonalMain = IntArray(matriz.size)
var diagonalSecond = IntArray(matriz.size)
for(i in 0 until matriz.size){
    for(j in 0 until matriz[i].size){
        if(i==j){
            diagonalMain[i] = matriz[i][j]
        }
        if ((i+j)==matriz.size-1){
            diagonalSecond[i] = matriz[i][j]
        }
    }
}

var sum = 0
diagonalMain.forEach {
    sum = sum + it
}
println("= $sum")

sum = 0
diagonalSecond.forEach {
    sum = sum + it
}
println("= $sum\t")

//Programmed by Juan Luis Coutino Lopez