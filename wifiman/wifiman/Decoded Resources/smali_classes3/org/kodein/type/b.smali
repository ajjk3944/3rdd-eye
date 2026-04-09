.class public abstract Lorg/kodein/type/b;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final synthetic a(Ljava/lang/Class;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lorg/kodein/type/b;->d(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b(Ljava/lang/Class;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lorg/kodein/type/b;->e(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic c(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lorg/kodein/type/b;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static final d(Ljava/lang/Class;)Ljava/lang/String;
    .locals 2

    sget-object v0, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    const-class v0, Ljava/lang/Boolean;

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    :goto_0
    if-eqz v0, :cond_1

    const-string p0, "Boolean"

    goto/16 :goto_8

    :cond_1
    sget-object v0, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    move v0, v1

    goto :goto_1

    :cond_2
    const-class v0, Ljava/lang/Byte;

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    :goto_1
    if-eqz v0, :cond_3

    const-string p0, "Byte"

    goto/16 :goto_8

    :cond_3
    sget-object v0, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    move v0, v1

    goto :goto_2

    :cond_4
    const-class v0, Ljava/lang/Character;

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    :goto_2
    if-eqz v0, :cond_5

    const-string p0, "Char"

    goto/16 :goto_8

    :cond_5
    sget-object v0, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    move v0, v1

    goto :goto_3

    :cond_6
    const-class v0, Ljava/lang/Short;

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    :goto_3
    if-eqz v0, :cond_7

    const-string/jumbo p0, "Short"

    goto/16 :goto_8

    :cond_7
    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    move v0, v1

    goto :goto_4

    :cond_8
    const-class v0, Ljava/lang/Integer;

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    :goto_4
    if-eqz v0, :cond_9

    const-string/jumbo p0, "Int"

    goto :goto_8

    :cond_9
    sget-object v0, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a

    move v0, v1

    goto :goto_5

    :cond_a
    const-class v0, Ljava/lang/Long;

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    :goto_5
    if-eqz v0, :cond_b

    const-string/jumbo p0, "Long"

    goto :goto_8

    :cond_b
    sget-object v0, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_c

    move v0, v1

    goto :goto_6

    :cond_c
    const-class v0, Ljava/lang/Float;

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    :goto_6
    if-eqz v0, :cond_d

    const-string/jumbo p0, "Float"

    goto :goto_8

    :cond_d
    sget-object v0, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_e

    goto :goto_7

    :cond_e
    const-class v0, Ljava/lang/Double;

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    :goto_7
    if-eqz v1, :cond_f

    const-string p0, "Double"

    goto :goto_8

    :cond_f
    const-class v0, Ljava/lang/Object;

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_10

    const-string p0, "Any"

    goto :goto_8

    :cond_10
    const/4 p0, 0x0

    :goto_8
    return-object p0
.end method

.method private static final e(Ljava/lang/Class;)Ljava/lang/String;
    .locals 9

    invoke-virtual {p0}, Ljava/lang/Class;->getTypeParameters()[Ljava/lang/reflect/TypeVariable;

    move-result-object v0

    const-string/jumbo v1, "typeParameters"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v0, v0

    if-nez v0, :cond_0

    const-string p0, ""

    return-object p0

    :cond_0
    invoke-virtual {p0}, Ljava/lang/Class;->getTypeParameters()[Ljava/lang/reflect/TypeVariable;

    move-result-object p0

    array-length p0, p0

    new-array v0, p0, [Ljava/lang/String;

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p0, :cond_1

    const-string v2, "*"

    aput-object v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const/16 v7, 0x38

    const/4 v8, 0x0

    const-string v1, ", "

    const-string v2, "<"

    const-string v3, ">"

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v0 .. v8}, LZg/n;->I0([Ljava/lang/Object;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lmh/l;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static final f(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    const/4 v0, 0x2

    const/4 v1, 0x0

    const-string/jumbo v2, "java."

    const/4 v3, 0x0

    invoke-static {p0, v2, v3, v0, v1}, Lkotlin/text/t;->P(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_18

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    :sswitch_0
    const-string/jumbo v0, "java.lang.NullPointerException"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_0

    :cond_0
    const-string/jumbo p0, "kotlin.NullPointerException"

    goto/16 :goto_0

    :sswitch_1
    const-string/jumbo v0, "java.lang.NumberFormatException"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto/16 :goto_0

    :cond_1
    const-string/jumbo p0, "kotlin.NumberFormatException"

    goto/16 :goto_0

    :sswitch_2
    const-string/jumbo v0, "java.lang.Throwable"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto/16 :goto_0

    :cond_2
    const-string/jumbo p0, "kotlin.Throwable"

    goto/16 :goto_0

    :sswitch_3
    const-string/jumbo v0, "java.lang.IndexOutOfBoundsException"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto/16 :goto_0

    :cond_3
    const-string/jumbo p0, "kotlin.IndexOutOfBoundsException"

    goto/16 :goto_0

    :sswitch_4
    const-string/jumbo v0, "java.util.LinkedHashSet"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    goto/16 :goto_0

    :cond_4
    const-string/jumbo p0, "kotlin.collections.LinkedHashSet"

    goto/16 :goto_0

    :sswitch_5
    const-string/jumbo v0, "java.util.LinkedHashMap"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    goto/16 :goto_0

    :cond_5
    const-string/jumbo p0, "kotlin.collections.LinkedHashMap"

    goto/16 :goto_0

    :sswitch_6
    const-string/jumbo v0, "java.lang.String"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    goto/16 :goto_0

    :cond_6
    const-string/jumbo p0, "kotlin.String"

    goto/16 :goto_0

    :sswitch_7
    const-string/jumbo v0, "java.lang.Object"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    goto/16 :goto_0

    :cond_7
    const-string/jumbo p0, "kotlin.Any"

    goto/16 :goto_0

    :sswitch_8
    const-string/jumbo v0, "java.util.Comparator"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8

    goto/16 :goto_0

    :cond_8
    const-string/jumbo p0, "kotlin.Comparator"

    goto/16 :goto_0

    :sswitch_9
    const-string/jumbo v0, "java.lang.IllegalStateException"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_9

    goto/16 :goto_0

    :cond_9
    const-string/jumbo p0, "kotlin.IllegalStateException"

    goto/16 :goto_0

    :sswitch_a
    const-string/jumbo v0, "java.lang.Exception"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_a

    goto/16 :goto_0

    :cond_a
    const-string/jumbo p0, "kotlin.Exception"

    goto/16 :goto_0

    :sswitch_b
    const-string/jumbo v0, "java.util.List"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_b

    goto/16 :goto_0

    :cond_b
    const-string/jumbo p0, "kotlin.collections.List"

    goto/16 :goto_0

    :sswitch_c
    const-string/jumbo v0, "java.lang.ClassCastException"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_c

    goto/16 :goto_0

    :cond_c
    const-string/jumbo p0, "kotlin.ClassCastException"

    goto/16 :goto_0

    :sswitch_d
    const-string/jumbo v0, "java.lang.IllegalArgumentException"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_d

    goto/16 :goto_0

    :cond_d
    const-string/jumbo p0, "kotlin.IllegalArgumentException"

    goto/16 :goto_0

    :sswitch_e
    const-string/jumbo v0, "java.lang.Error"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_e

    goto/16 :goto_0

    :cond_e
    const-string/jumbo p0, "kotlin.Error"

    goto/16 :goto_0

    :sswitch_f
    const-string/jumbo v0, "java.util.ArrayList"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_f

    goto/16 :goto_0

    :cond_f
    const-string/jumbo p0, "kotlin.collections.ArrayList"

    goto/16 :goto_0

    :sswitch_10
    const-string/jumbo v0, "java.lang.UnsupportedOperationException"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_10

    goto :goto_0

    :cond_10
    const-string/jumbo p0, "kotlin.UnsupportedOperationException"

    goto :goto_0

    :sswitch_11
    const-string/jumbo v0, "java.util.Set"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_11

    goto :goto_0

    :cond_11
    const-string/jumbo p0, "kotlin.collections.Set"

    goto :goto_0

    :sswitch_12
    const-string/jumbo v0, "java.util.Map"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_12

    goto :goto_0

    :cond_12
    const-string/jumbo p0, "kotlin.collections.Map"

    goto :goto_0

    :sswitch_13
    const-string/jumbo v0, "java.util.HashSet"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_13

    goto :goto_0

    :cond_13
    const-string/jumbo p0, "kotlin.collections.HashSet"

    goto :goto_0

    :sswitch_14
    const-string/jumbo v0, "java.util.HashMap"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_14

    goto :goto_0

    :cond_14
    const-string/jumbo p0, "kotlin.collections.HashMap"

    goto :goto_0

    :sswitch_15
    const-string/jumbo v0, "java.util.NoSuchElementException"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_15

    goto :goto_0

    :cond_15
    const-string/jumbo p0, "kotlin.NoSuchElementException"

    goto :goto_0

    :sswitch_16
    const-string/jumbo v0, "java.lang.AssertionError"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_16

    goto :goto_0

    :cond_16
    const-string/jumbo p0, "kotlin.AssertionError"

    goto :goto_0

    :sswitch_17
    const-string/jumbo v0, "java.lang.RuntimeException"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_17

    goto :goto_0

    :cond_17
    const-string/jumbo p0, "kotlin.RuntimeException"

    :cond_18
    :goto_0
    return-object p0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7a3f8f55 -> :sswitch_17
        -0x60cee186 -> :sswitch_16
        -0x5518a1c5 -> :sswitch_15
        -0x539bd852 -> :sswitch_14
        -0x539bc14c -> :sswitch_13
        -0x52743c64 -> :sswitch_12
        -0x5274255e -> :sswitch_11
        -0x4c77db17 -> :sswitch_10
        -0x4267cf29 -> :sswitch_f
        -0x1f821ecc -> :sswitch_e
        -0x1283f970 -> :sswitch_d
        -0x23eb274 -> :sswitch_c
        0x3ec5a5e -> :sswitch_b
        0x455697b -> :sswitch_a
        0x4818f00 -> :sswitch_9
        0xc6aa696 -> :sswitch_8
        0x3f697993 -> :sswitch_7
        0x473e3665 -> :sswitch_6
        0x4b050b55 -> :sswitch_5
        0x4b05225b -> :sswitch_4
        0x4bb2edb3 -> :sswitch_3
        0x612cf26c -> :sswitch_2
        0x61d1f6bb -> :sswitch_1
        0x7003b58d -> :sswitch_0
    .end sparse-switch
.end method

.method public static final g(Ljava/lang/reflect/Type;)Ljava/lang/String;
    .locals 4

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lorg/kodein/type/m;->a:Lorg/kodein/type/m;

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, p0, v3, v1, v2}, Lorg/kodein/type/p;->c(Lorg/kodein/type/p;Ljava/lang/reflect/Type;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final h(Ljava/lang/reflect/Type;)Ljava/lang/String;
    .locals 4

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lorg/kodein/type/n;->a:Lorg/kodein/type/n;

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, p0, v3, v1, v2}, Lorg/kodein/type/p;->c(Lorg/kodein/type/p;Ljava/lang/reflect/Type;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final i(Ljava/lang/reflect/Type;)Ljava/lang/String;
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Ljava/lang/Class;

    if-eqz v0, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    check-cast p0, Ljava/lang/Class;

    invoke-virtual {p0}, Ljava/lang/Class;->getEnclosingClass()Ljava/lang/Class;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-static {v1}, Lorg/kodein/type/b;->i(Ljava/lang/reflect/Type;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x2e

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const-string v1, ""

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    goto :goto_1

    :cond_1
    instance-of v0, p0, Ljava/lang/reflect/ParameterizedType;

    if-eqz v0, :cond_2

    check-cast p0, Ljava/lang/reflect/ParameterizedType;

    invoke-static {p0}, Lorg/kodein/type/j;->f(Ljava/lang/reflect/ParameterizedType;)Ljava/lang/Class;

    move-result-object p0

    invoke-static {p0}, Lorg/kodein/type/b;->i(Ljava/lang/reflect/Type;)Ljava/lang/String;

    move-result-object p0

    goto :goto_1

    :cond_2
    instance-of v0, p0, Ljava/lang/reflect/GenericArrayType;

    if-eqz v0, :cond_3

    check-cast p0, Ljava/lang/reflect/GenericArrayType;

    invoke-interface {p0}, Ljava/lang/reflect/GenericArrayType;->getGenericComponentType()Ljava/lang/reflect/Type;

    move-result-object p0

    const-string/jumbo v0, "genericComponentType"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lorg/kodein/type/b;->i(Ljava/lang/reflect/Type;)Ljava/lang/String;

    move-result-object p0

    goto :goto_1

    :cond_3
    instance-of v0, p0, Ljava/lang/reflect/WildcardType;

    if-eqz v0, :cond_4

    const-string p0, "*"

    goto :goto_1

    :cond_4
    instance-of v0, p0, Ljava/lang/reflect/TypeVariable;

    if-eqz v0, :cond_5

    check-cast p0, Ljava/lang/reflect/TypeVariable;

    invoke-interface {p0}, Ljava/lang/reflect/TypeVariable;->getName()Ljava/lang/String;

    move-result-object p0

    const-string/jumbo v0, "name"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_1
    return-object p0

    :cond_5
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "Unknown type "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v2, 0x20

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
