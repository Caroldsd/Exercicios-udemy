????   < Y  udemy/DesafioConversao  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this Ludemy/DesafioConversao; main ([Ljava/lang/String;)V  java/util/Scanner	    java/lang/System   in Ljava/io/InputStream;
     (Ljava/io/InputStream;)V	     out Ljava/io/PrintStream;   Informe o primeiro salário: 
 " $ # java/io/PrintStream % & println (Ljava/lang/String;)V
  ( ) * nextLine ()Ljava/lang/String;
 , . - java/lang/String / 0 replace (CC)Ljava/lang/String; 2 Informe o segundo salário:  4 Informe o terceiro salário: 
 6 8 7 java/lang/Double 9 : parseDouble (Ljava/lang/String;)D@       > %.2f
 6 @ A B valueOf (D)Ljava/lang/Double;
 " D E F printf <(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream;
  H I  close args [Ljava/lang/String; teclado Ljava/util/Scanner; num1 Ljava/lang/String; num2 num3 salario1 D salario2 salario3 media 
SourceFile DesafioConversao.java !               /     *? ?    
                    	      1     ?? Y? ? L? ? !+? ',.? +M? 1? !+? ',.? +N? 3? !+? ',.? +:,? 59-? 59? 59	c	c ;o9? =? Y? ?S? CW+? G?    
   :      
     '  3  ;  H  N  T  [  i  ~  ?     \ 	   ? J K    x L M   d N O  3 P P O  H ; Q O  N 5 R S  T / T S  [ ( U S 	 i  V S   W    X