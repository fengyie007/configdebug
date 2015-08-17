display configFile info what current request action on console

一、功能列表

1.用户进行一个操作，如果经过struts2处理，就会在控制台打印相应的信息，信息如下：

> 该操作的访问方式：例如POST或GET

> 调试url地址：url及参数(POST方式的参数被转为GET方式)，便于用url直接调试

> POST或GET参数的多行显示：每行显示一个键值对，参数名称=参数值

> 执行的action以及方法：便于快速找到该操作对应的action及方法

> 该操作的执行时间（单位毫秒）：便于确定该操作的执行效率

> 该action配置信息所在配置文件的路径以及名称：便于快速找到对应的配置文件

> 该action配置信息在配置文件中的行数：便于快速找到配置该action的位置

> 该action返回的结果名称：便于快速确定action中方法返回的结果名称

> 该action返回的视图位置：便于快速找到该操作返回的视图资源的实际位置

> Session范围中的信息：便于观察session中的信息

2.方便的开关控制台信息的显示
> 通过配置struts.xml文件中的devMode的值为true或false，来启用或停用控制台的提示信息，从而达到在开发的时候，设置devMode=true(打印信息)，在程序上线的时候，设置devMode=false(不打印信息)，不会造成效率的影响。

> 或者在struts.xml中去掉该插件相关的拦截器配置（在项目发布时，可以不包含该插件包），来关闭调试信息。

3.可自定义提示前缀和提示信息

> 在configdebug.properties属性文件中进行配置。


二、使用效果

########################################struts2 debug info begin########################################

## 1.accessMethod：POST

## 2.debugUrl：http://localhost:1987/configdebug/userAdd.shtml?favorite=java&address=bj&password=123&sex=男&username=sl

## 3.parameters(Multirows)：

##   favorite=java

##   address=bj

##   password=123

##   sex=男

##   username=sl

## 4.actionAndMethod:com.demo.action.UserAction.add()

## 5.executeTime:62ms

## 6.configFilePath:file:/D:/apache-tomcat-6.0.20-new/webapps/configdebug/WEB-INF/classes/struts.xml

## 7.configFileLineNumber:47

## 8.actionReturnResult:success

## 9.actionReturnView:{location=/app/user/user\_list.jsp}

## 10.sessionInfo:

########################################struts2 debug info end##########################################


三、变更列表

(v1.1)2011-06-15:

  1. 该插件的属性文件可以放在项目中任意位置，并且随意命名

> 感谢iteye网友xugq035 提出的意见，非常感谢

> 2.修改了bug：java.lang.StringIndexOutOfBoundsException:String index out of range: -1

> 该异常发生的情况是：在POST方式提交的时候，没有携带任何参数

> 感谢iteye网友thc1987 和yuanjzh 提出该异常，非常感谢