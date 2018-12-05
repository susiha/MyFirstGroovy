package variable

/**
 *
 * 列表
 *
 */

/***
 * 定义方式
 */

//def list = new ArrayList() //java的 定义方式

//def list = [1,2,3,4,5] //groovy 定义方式  类型class java.util.ArrayList
//
//println list.class

/**
 * 定义数组的方式 1 使用as 关键字  2 不再使用def 而是使用强类型
 */
//def array = [1,2,3,4,5] as int[]
//
//int[] array2 = [1,2,3,4,6]
//
//println array.class
//
//println  array2.class

/**
 * 列表的排序
 */

// 数字的排序
//def list = [1,9,8,5,6,3,-1]
//
//Comparator ms = {
//    a,b -> a == b ? 0: Math.abs(a)<Math.abs(b) ? 1:-1
//}
//
////Collections.sort(list) //默认的排序
//
//Collections.sort(list,ms) //指定排序规则的排序
//
//
//println list

//字符串的排序
//def sortStringList = ['abc','z','Hello','hello','groovy']
//
//
////sortStringList.sort {it -> return it.size()}
//sortStringList.sort {a,b -> return a[0]  > b[0] ? 1 : -1 }
//
//
//println sortStringList


/**
 * ====================================================列表的查找===========================================================
 */

// find  findall
//def list = [0,1,2,3,4,5,6]

//
//def result = list.findAll{it -> return it % 2 ==0}
//
//println result
//
//println list


// any every
//def reslt1 = list.any{ it -> return it % 2 ==0}
//
//def reslt2 = list.every{ it -> return it % 2 ==0}
//
//
//println reslt1
//
//println reslt2

// min max 函数
//def min = list.min() // 查找最小值
//def max = list.max() //查找最大值
//
//println min
//
//println max

/**
 *  min 和 max 也可以结合闭包使用 用于查找满足特定条件的最大值和最小值
 */



def list  = [-5,0,13,20,78,9]

//// 查找被3取余之后的最大值和最小值
//
//def min5 = list.min {it -> return it % 3  }
//
//
//def max5 = list.max {return it % 3  }
//
//
//
//// 查找绝对值最小的值
//
//
//def absmin = list.min{ return  Math.abs(it)}
//
//
//println  "被3 取余最小的值 ${min5}"
//
//println  "被3 取余的最大的值 ${max5}"
//println  "绝对值最小的值 ${absmin}"


/***
 *  count 统计
 */

////统计能被5 整除的个数
// def result =list.count {it -> return it % 5 == 0}
//
//println result



/**
 *
 * 映射 map
 *
 */

//定义
//
//def colors = [red:'ff0000', green:'00ff00',blue:'0000ff']
//
////索引读取
////println colors['red']
////println colors.red
////添加元素
////colors.yellow = '00ffff'
////println colors.toMapString()
//colors.complu = [a:'1',b:'2']
//println colors.toMapString()
//
//
//println colors.getClass()


/**
 *
 * ============================================================ 映射常用的操作  ============================================================
 *
 */


def students = [1:[number:'0001',name:'Bob',score:55,sex:'male'],
                2:[number:'0002',name:'Johony',score:62,sex:'female'],
                3:[number:'0003',name:'Clair',score:73,sex:'female'],
                4:[number:'0004',name:'Amy',score:66,sex:'male']]


/**
 * 遍历
 */
//students.each {def student -> println "student.key is ${student.key},student.value is ${student.value}"}

/**
 * 带索引的遍历
 */
//students.eachWithIndex{ def student, int i ->
//
//    println "index is ${i},student.key is ${student.key},student.value is ${student.value}"
//}


students.each{key,value -> println "key is ${key},value is ${value}"}