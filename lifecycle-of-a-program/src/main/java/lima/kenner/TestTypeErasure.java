package lima.kenner;

import java.util.ArrayList;
import java.util.List;

public class TestTypeErasure {
  public static void main(String[] args) {

    // Generics no código fonte
    List<String> nomes = new ArrayList<>();
    nomes.add("Java");
    // O compilador garante que isso é String aqui
    String s = nomes.get(0);

    // Compile: javac TestTypeErasure.java
    // Desmonte (Disassemble) o bytecode: javap -c -p TestTypeErasure

    /*
    Result:
    public static main([Ljava/lang/String;)V
     L0
      LINENUMBER 10 L0
      NEW java/util/ArrayList
      DUP
      INVOKESPECIAL java/util/ArrayList.<init> ()V
      ASTORE 1
     L1
      LINENUMBER 11 L1
      ALOAD 1
      LDC "Java"
      INVOKEINTERFACE java/util/List.add (Ljava/lang/Object;)Z (itf)
      POP
     L2
      LINENUMBER 13 L2
      ALOAD 1
      ICONST_0
      INVOKEINTERFACE java/util/List.get (I)Ljava/lang/Object; (itf)
      CHECKCAST java/lang/String
      ASTORE 2
     L3
      LINENUMBER 17 L3
      RETURN
     L4
      LOCALVARIABLE args [Ljava/lang/String; L0 L4 0
      LOCALVARIABLE nomes Ljava/util/List; L1 L4 1
      // signature Ljava/util/List<Ljava/lang/String;>;
      // declaration: nomes extends java.util.List<java.lang.String>
      LOCALVARIABLE s Ljava/lang/String; L3 L4 2
      MAXSTACK = 2
      MAXLOCALS = 3
     */
  }
}