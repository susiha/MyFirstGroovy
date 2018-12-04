package variable

/***
 * ========================================================闭包基础===============================================================
 */

/**
 * 闭包就是一段代码块
 */
//def clouser ={ println 'Hello Groovy'}

/**
 * 闭包的调用 1 clouser.call()  2 clouser()
 */



//clouser.call()

//clouser()


/**
 * 闭包参数
 */

//def clouser ={ String name->println "Hello Groovy ${name}"}


//clouser.call("susiha")

//clouser('susiha')

/**
 * 多个参数
 */
//def clouser ={ String name,int age->println "name = ${name},age = ${age}"}

//clouser.call("susiha",32)
//
//clouser('susiha',32)

/**
 * 默认参数 it
 */

//
//def clouser ={ println "Hello Groovy ${it}"}
//
//
//clouser.call('sunshihai')


/**
 * 闭包返回值，闭包一定会有返回值
 */
//def clouser ={ return  "Hello Groovy ${it}"}
//
//
//println clouser.call('sunshihai')

/**
 * 闭包中没有定义返回值的话 返回的是null
 */
//def clouser ={ println "Hello Groovy ${it}"}
//
//
//println clouser.call('sunshihai')
/***
 * ========================================================闭包基础===============================================================
 */

/**
 * 与基本类型的结合使用
 */
//def x = fab2(5)
//println x
///**
// * 使用闭包来实现number的阶乘 使用了upto 表示 从1 到number的循环 相当于for循环的i++ 闭包可以放在参数位置也就是小括号内
// * @param number
// * @return
// */
//int fab(int number){
//    int result = 1
//    1.upto(number,{num -> result *= num})
//    return  result
//}
//
///**
// * 使用闭包来实现number的阶乘 downto 表示 从number到1的循环,相当于for循环的i-- 闭包可以放在小括号外
// * @param number
// * @return
// */
//int fab2(int number){
//    int result = 1
//    number.downto(1)
//            {num -> result *= num}
//    return  result
//}


/**
 * times 方法起始值是从0 开始 for 循环每一个值都会调用闭包
 * @param number
 * @return
 */
//int cal(int number){
//    int result =0
//
//
//    number.times {num -> result +=num}
//    return result
//}
//
//println cal(101)
//



/**
 * 与String的结合使用
 */




