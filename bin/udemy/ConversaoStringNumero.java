����   < Q  udemy/ConversaoStringNumero  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this Ludemy/ConversaoStringNumero; main ([Ljava/lang/String;)V  Digite o primeiro valor: 
    javax/swing/JOptionPane   showInputDialog &(Ljava/lang/Object;)Ljava/lang/String;  Digite o segundo valor: 	    java/lang/System   out Ljava/io/PrintStream; ! java/lang/StringBuilder
 # % $ java/lang/String &  valueOf
   (  ) (Ljava/lang/String;)V
   + , - append -(Ljava/lang/String;)Ljava/lang/StringBuilder;
   / 0 1 toString ()Ljava/lang/String;
 3 5 4 java/io/PrintStream 6 ) println
 8 : 9 java/lang/Double ; < parseDouble (Ljava/lang/String;)D > a soma é :
   @ , A (D)Ljava/lang/StringBuilder; C a media é : @        args [Ljava/lang/String; valor1 Ljava/lang/String; valor2 numero1 D numero2 soma 
SourceFile ConversaoStringNumero.java !               /     *� �    
                    	       �  	   h� L� M� �  Y+� "� ',� *� .� 2+� 7J,� 79)c9� �  Y=� '� ?� .� 2� �  YB� ' Do� ?� .� 2�    
   .      
       $  )  /  5  L  g     >    h F G    b H I   \ J I  ) ? K L  / 9 M L  5 3 N L   O    P