# seleniumParaller
TestNG与selenium grid的一个例子
1.把所有的driver写入环境变量path
2.hub：
java -jar selenium-server-standalone-2.53.0.jar -role hub
node：
java -jar selenium-server-standalone-2.53.0.jar -role node -hub http://localhost:4444/grid/register  -browser browserName=chrome  -port 6666 
java -jar selenium-server-standalone-2.53.0.jar -role node -hub http://localhost:4444/grid/register  -browser browserName=IE  -port 7777
java -jar selenium-server-standalone-2.53.0.jar -role node -hub http://localhost:4444/grid/register  -browser browserName=firefox  -port 5555
3.使用selenium的pageObject模式（使用注解标注page）
参考org.wsc.pageobject.baidu.java
4.testng xml指示并行
<suite thread-count="2" name="Suite" parallel="methods">

