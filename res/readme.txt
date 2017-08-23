1、res文件夹放在工程目录下
2、通过调用Util_pr类下的静态方法getStr_LicensePlate返回车牌识别颜色与字符串，该方法有个字符串类型参数（图片路径），
比如 
String imgPath = "res/image/test/plate_recognize.jpg"; 
String str=Util_pr.getStr_LicensePlate(imgPath); 

返回的是"BLUE 苏EUK722"