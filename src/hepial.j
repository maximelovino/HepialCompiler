.class public hepial
.super java/lang/Object
.method public <init>()V
aload_0 
invokespecial java/lang/Object/<init>()V 
return
.end method
.method public static read()I
    .limit locals 10 
    .limit stack 10 
    ldc 0 
    istore 1
Label1: 
    getstatic java/lang/System/in Ljava/io/InputStream; 
    invokevirtual java/io/InputStream/read()I 
    istore 2 
    iload 2 
    ldc 10
    isub 
    ifeq Label2 
    iload 2 
    ldc 32
    isub 
    ifeq Label2 
    iload 2 
    ldc 48
    isub 
    ldc 10 
    iload 1 
    imul 
    iadd 
    istore 1 
    goto Label1 
Label2: 
    iload 1 
    ireturn 
.end method 
.method public static facto(I)I
.limit stack 5
.limit locals 10
ldc 0
istore 1
iload 0
ldc 0
isub
ifeq if1956725890_then
goto if1956725890_else
if1956725890_then:
ldc 1
ireturn
goto endif1956725890
if1956725890_else:
iload 0
ldc 1
isub
invokestatic hepial.facto(I)I
iload 0
imul
ireturn
endif1956725890:
ldc 0
ireturn
.end method
.method public static main([Ljava/lang/String;)V
.limit stack 9
.limit locals 20
invokestatic hepial.read()I
istore 0
iload 0
ldc 20
isub
iflt if356573597_then
goto if356573597_else
if356573597_then:
iload 0
invokestatic hepial.facto(I)I
istore 1
ldc "factorielle de "
getstatic java/lang/System/out Ljava/io/PrintStream;
swap
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V
iload 0
getstatic java/lang/System/out Ljava/io/PrintStream;
swap
invokevirtual java/io/PrintStream/print(I)V
ldc " est égale à : "
getstatic java/lang/System/out Ljava/io/PrintStream;
swap
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V
iload 1
getstatic java/lang/System/out Ljava/io/PrintStream;
swap
invokevirtual java/io/PrintStream/print(I)V
goto endif356573597
if356573597_else:
ldc " votre nombre est trop grand ! "
getstatic java/lang/System/out Ljava/io/PrintStream;
swap
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V
endif356573597:
return
.end method
