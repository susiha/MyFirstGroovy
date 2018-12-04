package variable

//单引号定义的字符串与Java 双引号一样 也是不能动态修改
def name = 'a signal \'or \' String'


//println name.class

def thupleName = '''three signal String'''

//三引号字符串可以定义格式

def thupleLine = '''
three 
signal 
     String'''

/**
 * 双引号
 */
//def doubelName = "this si a common String"
//
//println doubelName.class


/**
 * 双引号 如果是是扩展表达式 类型是GString
 */
//def myName  = "susiha"
//
//def sayHello  = "Hello : ${myName}"
//
//println sayHello
//println myName.class
//
//println sayHello.class


/***
 *
 * 可扩展任意的表达式
 */

def sum = "The sum of 2 and 3 equals ${2+3}"
//
//println sum
//


/**
 * String 与GString 可以相互转换
 * @param code
 * @return
 */
//String echo(String code){
//    return  code;
//}
//
//
//def result = echo(sum)
//
//println result
//
//
//println sum.class
//println result.class


/***
 * ========================================================Strng 常用方法===============================================================
 */

def str = "groovy"
def str2 = "Hello"
/**
 * center 对已有字符串的填充,把已有字符串置中 第一个参数是填充后字符串的长度 第二个是需要填充的字符 如果第二参数不填写 使用的是空格填充
 */
//println str.center(8,'a')
//println str.center(8)

/**
 * 如果填充的长度左右不是对称的，先填充右边再填充左边
 */
//println str.center(7,'a')
//println str.center(9,'a')

/**
 * 如果填充后的长度小于 当前字符串的长度，参数长度无意义
 */
//
//println str.center(4,'aaa')
//println('----------------------------------')
//println str.center(4)

/**
 * padLeft 填充左边 参数与center 一样 同理 padRight 是填充右边
 */
//println str.padLeft(8,'a')
//println str.padRight(8,'a')

/**
 * 字符串 比较
 */

//println str.compareTo(str2) //Java 方法

//Groovy 中可以直接使用操作符
//println str > str2

/**
 * 字符串的索引
 */
//1. 可以使用java 中getAt
//println str.getAt(0)
//2. Groovy 可以使用数组下标

//println str[0]

// 3. Groovy 也可以使用数组范围

//println str[1..3]

/**
 * minus 字符串减法 在当前字符串中减去指定的字符串 如果当前字符串中不包含 指定的字符串  返回当前字符串本身
 */

//println str.minus(str2)
//
//println str.minus("oo")

/**
 * reverse 对String 进行倒叙操作
 */

//println str.reverse()

/**
 * capitalize 对String 首字母大写
 */

//println str.capitalize()

/**
 * 判断字符串是否是数字
 */
//println str.isNumber() //false
//println "12342".isNumber() //true

