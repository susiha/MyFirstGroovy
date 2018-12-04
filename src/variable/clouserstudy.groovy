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
 * ========================================================闭包使用===============================================================
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


String str = 'the 2 and 3 is 5'

/**
 * each的遍历 each 使用的是while循环遍历  multiply方法是把temp变成指定的倍数 each 方法的返回值是调用者本身
 */

//str.each {
//    String temp -> print temp.multiply(2)
//}

/**
 *  find 查找符合条件的的第一个，必须有返回值
 */


//str.find {
//    String s -> s.isNumber()
//        return s
//}

/**
 *  findAll 查找符合条件的所有值，返回值是集合
 */

//str.findAll {
//    String s -> s.isNumber()
//        return s
//}


/**
 * any 方法返回boolean 类型 ，只要有一项满足闭包条件的就会返回true
 */
//str.any {
//
//    String s -> s.isNumber()
//        return s
//}

/**
 *  every 方法与any基本类似 都满足闭包条件的时候 才会返回true
 */
//str.every {
//    String s -> s.isNumber()
//        return s
//}

/**
 *  返回值是List ,该方法是将str的字符遍历然后按照闭包的规则转换之后 放入到ArrayList中返回
 */
//str.collect {
//    it.toUpperCase()
//}


/***
 * ========================================================闭包进阶===============================================================
 */

/**
 * 闭包三个关键变量 this,owner,delegate
 *
 * this 代表闭包定义处的类
 *
 * owner 代表闭包定义处的类或者对象
 *
 * delegate 代表任意对象 默认与owner一致
 */

//def scriptClouser = {
//    println "scriptClouser this :" +this
//    println "scriptClouser owner :" +owner
//    println "scriptClouser delegate :" +delegate
//
//}
//scriptClouser.call()
//返回值
///scriptClouser this :variable.clouserstudy@6f46426d
//scriptClouser owner :variable.clouserstudy@6f46426d
//scriptClouser delegate :variable.clouserstudy@6f46426d


//class Person{
//
//    def static classClouser ={
//        println "classClouser this :" +this
//        println "classClouser owner :" +owner
//        println "classClouser delegate :" +delegate
//    }
//
//
//    def static say(){
//        def  classClouser ={
//            println "MethodclassClouser this :" +this
//            println "MethodclassClouser owner :" +owner
//            println "MethodclassClouser delegate :" +delegate
//        }
//
//        classClouser.call()
//    }
//
//}
//
//Person.classClouser.call()
//Person.say()


class Person{

    def  classClouser ={
        println "classClouser this :" +this
        println "classClouser owner :" +owner
        println "classClouser delegate :" +delegate
    }


    def  say(){
        def  classClouser ={
            println "MethodclassClouser this :" +this
            println "MethodclassClouser owner :" +owner
            println "MethodclassClouser delegate :" +delegate
        }

        classClouser.call()
    }

}
//
Person person = new Person()
//person.classClouser.call()
//person.say()
//

// 在闭包中定义闭包


def clouser = {



    def innerClouser ={

        println "innerClouser this :" +this
        println "innerClouser owner :" +owner
        println "innerClouser delegate :" +delegate
    }
    innerClouser.delegate = person //修改默认的delegate

    innerClouser.call()
    println "outerClouser this :" +this
    println "outerClouser owner :" +owner
    println "outerClouser delegate :" +delegate

}

clouser.call()