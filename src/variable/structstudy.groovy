package variable

/***
 * ========================================================逻辑控制===============================================================
 */

def  x = 1.23
def result

/**
 * switc case 可以是任意类型
 */
switch (x){
    case  'foo':
        result  = 'found foo'
        break
    case  'bar':
        result = 'bar'
        break
    case  [1.23,4,5,6,'inlist']:
        result = 'list'
        break
    case 12 .. 30:
        result = 'range'
        break
    case Integer:
        result = 'Integer'
        break
    case BigDecimal:
        result = 'BigDecimal'
        break
    default:result ='default'

}


//println result //BigDecimal


/**
 * for 循环
 */

//对范围的循环
//def sum = 0
//
//for(i in 0..9){
//    sum +=i
//}
//
//println sum
//


//对list的循环
//def sum = 0
//for (i in [1,2,3,4,5,6,7,8,9]){
//    sum +=i
//}
//
//println sum
//对map的循环
def sum = 0
for(i in ['ss':1,'sh':2,'hh':3]){
    sum +=i.value
}
println sum

