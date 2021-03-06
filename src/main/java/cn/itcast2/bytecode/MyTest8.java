package cn.itcast2.bytecode;

/**
 *    解释执行/编译执行
 *
 * @author YJ Lan
 * @create 2020-02-06-14:30
 */
/*
    现代JVM在执行Java代码的时候，通常会将解释执行和编译执行二者结合起来进行。

    所谓解释执行：就是通过解释器来读取字节码，遇到相应的指令就去执行该指令。
    所谓编译执行：就是通过即时编译器（Just In Time，JIT）将字节码转化为本地机器码来执行；
    现代JVM会根据代码热点来生成相应的本地机器码。

 */
/*
    基于栈的指令集 与 基于寄存器的指令集之间的关系。

    1.JVM执行指令所采取方式是基于栈的指令集
    2.基于栈的指令集主要的操作是入栈和出栈两种。
    3.基于栈的指令集优势在于它可以在不同的平台之间移植，而基于寄存器的指令集是与硬件架构紧密关联的，无法做到可移植。
    4.基于栈的指令集的缺点在于完成相同的操作，指令数量通常要比基于寄存器的指令集数量要多，
      基于栈的指令实在内存上完成操作的，而基于寄存器的指令通常是直接由CPU执行的，他是在高速缓冲区进行执行的，速度要快很多。
      虽然JVM可以采用一些优化手段，但总体来说，基于栈的指令集速度要慢一些。

 */
public class MyTest8 {
}
