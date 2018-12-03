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
String echo(String code){
    return  code;
}


def result = echo(sum)

println result


println sum.class
println result.class