.class public abstract Lbg/d;
.super Lag/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lbg/d$i;,
        Lbg/d$h;,
        Lbg/d$g;
    }
.end annotation


# direct methods
.method public constructor <init>([Lbg/b;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lag/d;-><init>([Lag/b;)V

    return-void
.end method

.method public constructor <init>([Lbg/b;Z)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2}, Lag/d;-><init>([Lag/b;Z)V

    return-void
.end method

.method protected static A1(I[Linet/ipaddr/k;IILjava/util/function/Function;)V
    .locals 0

    invoke-static {p0, p3, p2}, Lbg/d;->p1(III)I

    move-result p0

    if-ltz p0, :cond_0

    aget-object p2, p1, p0

    invoke-virtual {p2}, Lbg/e;->i()Z

    move-result p3

    if-nez p3, :cond_0

    invoke-interface {p4, p2}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Linet/ipaddr/k;

    aput-object p2, p1, p0

    :cond_0
    return-void
.end method

.method protected static B1(ILinet/ipaddr/c$a;Ljava/util/function/Supplier;Ljava/util/function/IntFunction;Ljava/util/function/Predicate;)Ljava/util/Iterator;
    .locals 8

    add-int/lit8 v5, p0, -0x1

    const/4 v7, 0x0

    move v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move v6, p0

    invoke-static/range {v0 .. v7}, Lbg/d;->C1(ILinet/ipaddr/c$a;Ljava/util/function/Supplier;Ljava/util/function/IntFunction;Ljava/util/function/Predicate;IILjava/util/function/IntFunction;)Ljava/util/Iterator;

    move-result-object p0

    return-object p0
.end method

.method protected static C1(ILinet/ipaddr/c$a;Ljava/util/function/Supplier;Ljava/util/function/IntFunction;Ljava/util/function/Predicate;IILjava/util/function/IntFunction;)Ljava/util/Iterator;
    .locals 8

    if-eqz p2, :cond_0

    new-instance p0, Lbg/d$c;

    invoke-direct {p0, p2, p4}, Lbg/d$c;-><init>(Ljava/util/function/Supplier;Ljava/util/function/Predicate;)V

    return-object p0

    :cond_0
    new-instance p2, Lbg/d$d;

    move-object v0, p2

    move v1, p0

    move-object v2, p1

    move v3, p5

    move-object v4, p7

    move-object v5, p4

    move v6, p6

    move-object v7, p3

    invoke-direct/range {v0 .. v7}, Lbg/d$d;-><init>(ILinet/ipaddr/c$a;ILjava/util/function/IntFunction;Ljava/util/function/Predicate;ILjava/util/function/IntFunction;)V

    return-object p2
.end method

.method protected static D1(Linet/ipaddr/c;I[LZf/d;IILinet/ipaddr/c$a;Ljava/util/function/BiFunction;)[LZf/d;
    .locals 3

    invoke-virtual {p0}, Linet/ipaddr/c;->d()Linet/ipaddr/c$b;

    move-result-object p0

    invoke-virtual {p0}, Linet/ipaddr/c$b;->allPrefixedAddressesAreSubnets()Z

    move-result p0

    const/4 v0, 0x0

    if-nez p1, :cond_0

    move p4, v0

    goto :goto_0

    :cond_0
    invoke-static {p1, p4, p3}, Lbg/d;->p1(III)I

    move-result p4

    :goto_0
    array-length v1, p2

    if-ge p4, v1, :cond_2

    invoke-static {p3, p1, p4}, Lbg/d;->q1(III)Ljava/lang/Integer;

    move-result-object v1

    if-eqz v1, :cond_1

    aget-object v2, p2, p4

    invoke-interface {p6, v2, v1}, Ljava/util/function/BiFunction;->apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LZf/d;

    aput-object v1, p2, p4

    if-eqz p0, :cond_1

    add-int/lit8 p4, p4, 0x1

    array-length v1, p2

    if-ge p4, v1, :cond_1

    invoke-static {v0}, Lbg/d;->s(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p5, v0, v1}, Linet/ipaddr/c$a;->g(ILjava/lang/Integer;)LZf/d;

    move-result-object v1

    array-length v2, p2

    invoke-static {p2, p4, v2, v1}, Ljava/util/Arrays;->fill([Ljava/lang/Object;IILjava/lang/Object;)V

    :cond_1
    add-int/lit8 p4, p4, 0x1

    goto :goto_0

    :cond_2
    return-object p2
.end method

.method protected static E1(Lag/d$e;Ljava/util/function/Function;Linet/ipaddr/c$a;[LZf/d;IILjava/lang/Integer;)Z
    .locals 9

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    const/4 v2, 0x1

    if-ge v1, p5, :cond_1

    aget-object v3, p3, v1

    invoke-interface {v3}, Lag/g;->A0()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v3}, LZf/d;->Q()I

    move-result p5

    invoke-interface {v3}, LZf/d;->w0()I

    move-result v4

    sub-int v5, v4, p5

    ushr-int/2addr v5, v2

    add-int/2addr v5, p5

    invoke-interface {v3}, Lag/g;->f()I

    move-result v3

    invoke-static {v3, p6, v1}, Lbg/d;->s1(ILjava/lang/Integer;I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {p2, p5, v5, v3}, Linet/ipaddr/c$a;->c(IILjava/lang/Integer;)LZf/d;

    move-result-object p5

    add-int/2addr v5, v2

    invoke-interface {p2, v5, v4, v3}, Linet/ipaddr/c$a;->c(IILjava/lang/Integer;)LZf/d;

    move-result-object v3

    move v4, v2

    goto :goto_1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const/4 p5, 0x0

    move-object v3, p5

    move v4, v0

    :goto_1
    if-ne v1, p4, :cond_2

    if-nez v4, :cond_2

    aget-object p4, p3, v1

    invoke-interface {p4}, Lag/g;->f()I

    move-result v5

    invoke-static {v5, p6, v1}, Lbg/d;->s1(ILjava/lang/Integer;I)Ljava/lang/Integer;

    move-result-object p6

    invoke-virtual {p6}, Ljava/lang/Integer;->intValue()I

    move-result v6

    sub-int/2addr v5, v6

    invoke-interface {p4}, LZf/d;->Q()I

    move-result v6

    invoke-interface {p4}, LZf/d;->w0()I

    move-result p4

    ushr-int v7, v6, v5

    ushr-int v8, p4, v5

    if-eq v7, v8, :cond_2

    sub-int/2addr v8, v7

    ushr-int/lit8 p5, v8, 0x1

    add-int/2addr v7, p5

    add-int/lit8 p5, v7, 0x1

    shl-int v3, v7, v5

    const/4 v4, -0x1

    shl-int/2addr v4, v5

    not-int v4, v4

    or-int/2addr v3, v4

    shl-int/2addr p5, v5

    invoke-interface {p2, v6, v3, p6}, Linet/ipaddr/c$a;->c(IILjava/lang/Integer;)LZf/d;

    move-result-object v3

    invoke-interface {p2, p5, p4, p6}, Linet/ipaddr/c$a;->c(IILjava/lang/Integer;)LZf/d;

    move-result-object p4

    move-object p5, v3

    move-object v3, p4

    goto :goto_2

    :cond_2
    move v2, v4

    :goto_2
    if-eqz v2, :cond_3

    array-length p4, p3

    invoke-interface {p2, p4}, Linet/ipaddr/c$a;->d(I)[LZf/d;

    move-result-object p6

    invoke-interface {p2, p4}, Linet/ipaddr/c$a;->d(I)[LZf/d;

    move-result-object p2

    invoke-static {p3, v0, p6, v0, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-static {p3, v0, p2, v0, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/lit8 v0, v1, 0x1

    aput-object p5, p6, v1

    aput-object v3, p2, v1

    sub-int/2addr p4, v0

    invoke-static {p3, v0, p6, v0, p4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-static {p3, v0, p2, v0, p4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-interface {p1, p6}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, LZf/e;

    invoke-interface {p1, p2}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LZf/e;

    invoke-interface {p0, p3, p1}, Lag/d$e;->b(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_3
    return v2
.end method

.method protected static F1([LZf/d;[BIIIILinet/ipaddr/c;Ljava/lang/Integer;)[LZf/d;
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p2

    move/from16 v3, p3

    move-object/from16 v4, p6

    if-ltz v3, :cond_f

    array-length v5, v1

    if-gt v3, v5, :cond_f

    if-ltz v2, :cond_e

    if-gt v2, v3, :cond_e

    invoke-virtual/range {p6 .. p6}, Linet/ipaddr/c;->a()Lbg/a;

    move-result-object v5

    array-length v6, v0

    mul-int v7, v6, p4

    add-int v8, v7, v2

    sub-int/2addr v8, v3

    const/4 v9, 0x0

    if-gez v8, :cond_5

    sub-int/2addr v3, v7

    add-int/lit8 v8, v3, -0x1

    aget-byte v10, v1, v8

    if-eqz v10, :cond_2

    aget-byte v11, v1, v3

    ushr-int/lit8 v11, v11, 0x7

    if-eqz v11, :cond_1

    const/4 v11, -0x1

    if-ne v10, v11, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Linet/ipaddr/AddressValueException;

    int-to-long v1, v10

    invoke-direct {v0, v1, v2}, Linet/ipaddr/AddressValueException;-><init>(J)V

    throw v0

    :cond_1
    new-instance v0, Linet/ipaddr/AddressValueException;

    int-to-long v1, v10

    invoke-direct {v0, v1, v2}, Linet/ipaddr/AddressValueException;-><init>(J)V

    throw v0

    :cond_2
    :goto_0
    if-ge v2, v8, :cond_4

    add-int/lit8 v8, v8, -0x1

    aget-byte v11, v1, v8

    if-ne v11, v10, :cond_3

    goto :goto_0

    :cond_3
    new-instance v0, Linet/ipaddr/AddressValueException;

    int-to-long v1, v10

    invoke-direct {v0, v1, v2}, Linet/ipaddr/AddressValueException;-><init>(J)V

    throw v0

    :cond_4
    move v2, v3

    move v8, v9

    :cond_5
    invoke-virtual/range {p6 .. p6}, Linet/ipaddr/c;->d()Linet/ipaddr/c$b;

    move-result-object v3

    invoke-virtual {v3}, Linet/ipaddr/c$b;->allPrefixedAddressesAreSubnets()Z

    move-result v3

    move v10, v9

    move v11, v10

    :goto_1
    if-ge v10, v7, :cond_d

    move/from16 v12, p5

    move-object/from16 v13, p7

    invoke-static {v12, v13, v11}, Lbg/d;->s1(ILjava/lang/Integer;I)Ljava/lang/Integer;

    move-result-object v14

    if-eqz v3, :cond_7

    if-eqz v14, :cond_7

    invoke-virtual {v14}, Ljava/lang/Integer;->intValue()I

    move-result v15

    if-nez v15, :cond_7

    invoke-static {v9}, Lbg/d;->s(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v5, v9, v1}, Linet/ipaddr/c$a;->g(ILjava/lang/Integer;)LZf/d;

    move-result-object v1

    invoke-interface {v1}, LZf/b;->e()Linet/ipaddr/c;

    move-result-object v2

    invoke-static {v4, v2}, Lbg/d;->u1(Linet/ipaddr/c;Linet/ipaddr/c;)Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-static {v0, v11, v6, v1}, Ljava/util/Arrays;->fill([Ljava/lang/Object;IILjava/lang/Object;)V

    goto :goto_4

    :cond_6
    new-instance v0, Linet/ipaddr/NetworkMismatchException;

    invoke-direct {v0, v1}, Linet/ipaddr/NetworkMismatchException;-><init>(Lag/g;)V

    throw v0

    :cond_7
    add-int v15, p4, v10

    if-ge v10, v8, :cond_a

    aget-byte v16, v1, v2

    ushr-int/lit8 v16, v16, 0x7

    if-nez v16, :cond_8

    move/from16 p2, v3

    move v10, v8

    goto :goto_3

    :cond_8
    invoke-static {v8, v15}, Ljava/lang/Math;->min(II)I

    move-result v9

    const/16 v17, 0x0

    :goto_2
    if-ge v10, v9, :cond_9

    move/from16 p2, v3

    shl-int/lit8 v3, v17, 0x8

    or-int/lit16 v3, v3, 0xff

    add-int/lit8 v10, v10, 0x1

    move/from16 v17, v3

    move/from16 v3, p2

    goto :goto_2

    :cond_9
    move/from16 p2, v3

    move/from16 v9, v17

    goto :goto_3

    :cond_a
    move/from16 p2, v3

    const/4 v9, 0x0

    :goto_3
    if-ge v10, v15, :cond_b

    add-int v3, v2, v10

    sub-int/2addr v3, v8

    aget-byte v3, v1, v3

    and-int/lit16 v3, v3, 0xff

    shl-int/lit8 v9, v9, 0x8

    or-int/2addr v9, v3

    add-int/lit8 v10, v10, 0x1

    goto :goto_3

    :cond_b
    invoke-interface {v5, v9, v14}, Linet/ipaddr/c$a;->g(ILjava/lang/Integer;)LZf/d;

    move-result-object v3

    invoke-interface {v3}, LZf/b;->e()Linet/ipaddr/c;

    move-result-object v9

    invoke-static {v4, v9}, Lbg/d;->u1(Linet/ipaddr/c;Linet/ipaddr/c;)Z

    move-result v9

    if-eqz v9, :cond_c

    aput-object v3, v0, v11

    add-int/lit8 v11, v11, 0x1

    move/from16 v3, p2

    move v10, v15

    const/4 v9, 0x0

    goto/16 :goto_1

    :cond_c
    new-instance v0, Linet/ipaddr/NetworkMismatchException;

    invoke-direct {v0, v3}, Linet/ipaddr/NetworkMismatchException;-><init>(Lag/g;)V

    throw v0

    :cond_d
    :goto_4
    return-object v0

    :cond_e
    new-instance v0, Linet/ipaddr/AddressValueException;

    int-to-long v1, v2

    invoke-direct {v0, v1, v2}, Linet/ipaddr/AddressValueException;-><init>(J)V

    throw v0

    :cond_f
    new-instance v0, Linet/ipaddr/AddressValueException;

    int-to-long v1, v3

    invoke-direct {v0, v1, v2}, Linet/ipaddr/AddressValueException;-><init>(J)V

    throw v0
.end method

.method public static synthetic h1(LZf/c;I)I
    .locals 0

    invoke-static {p0, p1}, Lbg/d;->x1(LZf/c;I)I

    move-result p0

    return p0
.end method

.method protected static i1(Ljava/util/function/IntUnaryOperator;IIJ)Ljava/math/BigInteger;
    .locals 8

    sget-object v0, Ljava/math/BigInteger;->ONE:Ljava/math/BigInteger;

    if-nez p1, :cond_0

    return-object v0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    add-int/lit8 v2, v1, 0x1

    invoke-interface {p0, v1}, Ljava/util/function/IntUnaryOperator;->applyAsInt(I)I

    move-result v1

    int-to-long v3, v1

    if-ne v2, p1, :cond_1

    invoke-static {v0, v3, v4}, Lbg/d;->z1(Ljava/math/BigInteger;J)Ljava/math/BigInteger;

    move-result-object p0

    return-object p0

    :cond_1
    add-int v1, v2, p2

    if-gt p1, v1, :cond_3

    :goto_1
    if-ge v2, p1, :cond_2

    add-int/lit8 p2, v2, 0x1

    invoke-interface {p0, v2}, Ljava/util/function/IntUnaryOperator;->applyAsInt(I)I

    move-result p3

    int-to-long p3, p3

    mul-long/2addr v3, p3

    move v2, p2

    goto :goto_1

    :cond_2
    invoke-static {v0, v3, v4}, Lbg/d;->z1(Ljava/math/BigInteger;J)Ljava/math/BigInteger;

    move-result-object p0

    return-object p0

    :cond_3
    :goto_2
    if-ge v2, v1, :cond_4

    add-int/lit8 v5, v2, 0x1

    invoke-interface {p0, v2}, Ljava/util/function/IntUnaryOperator;->applyAsInt(I)I

    move-result v2

    int-to-long v6, v2

    mul-long/2addr v3, v6

    move v2, v5

    goto :goto_2

    :cond_4
    move v1, v2

    cmp-long v2, v3, p3

    if-gtz v2, :cond_5

    add-int/lit8 v2, v1, 0x1

    invoke-interface {p0, v1}, Ljava/util/function/IntUnaryOperator;->applyAsInt(I)I

    move-result v1

    int-to-long v5, v1

    mul-long/2addr v3, v5

    if-ne v2, p1, :cond_4

    invoke-static {v0, v3, v4}, Lbg/d;->z1(Ljava/math/BigInteger;J)Ljava/math/BigInteger;

    move-result-object p0

    return-object p0

    :cond_5
    invoke-static {v0, v3, v4}, Lbg/d;->z1(Ljava/math/BigInteger;J)Ljava/math/BigInteger;

    move-result-object v0

    goto :goto_0
.end method

.method protected static j1([LZf/d;Lbg/a;Ljava/lang/Integer;)Linet/ipaddr/a;
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p1, p0, p2, v0}, Lbg/a;->B([LZf/d;Ljava/lang/Integer;Z)Linet/ipaddr/a;

    move-result-object p0

    return-object p0
.end method

.method protected static k1([LZf/d;Lbg/a;Ljava/lang/Integer;)LZf/c;
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p1, p0, p2, v0}, Lbg/a;->r([LZf/d;Ljava/lang/Integer;Z)LZf/c;

    move-result-object p0

    return-object p0
.end method

.method protected static l1(LZf/c;Linet/ipaddr/c$a;Ljava/util/function/IntFunction;)[LZf/d;
    .locals 2

    invoke-interface {p0}, LZf/e;->Z()I

    move-result p0

    invoke-interface {p1, p0}, Linet/ipaddr/c$a;->d(I)[LZf/d;

    move-result-object p1

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p0, :cond_0

    invoke-interface {p2, v0}, Ljava/util/function/IntFunction;->apply(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LZf/d;

    aput-object v1, p1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-object p1
.end method

.method protected static n1(Ljava/util/function/IntUnaryOperator;I)J
    .locals 5

    if-nez p1, :cond_0

    const-wide/16 p0, 0x1

    return-wide p0

    :cond_0
    const/4 v0, 0x0

    invoke-interface {p0, v0}, Ljava/util/function/IntUnaryOperator;->applyAsInt(I)I

    move-result v0

    int-to-long v0, v0

    const/4 v2, 0x1

    :goto_0
    if-ge v2, p1, :cond_1

    invoke-interface {p0, v2}, Ljava/util/function/IntUnaryOperator;->applyAsInt(I)I

    move-result v3

    int-to-long v3, v3

    mul-long/2addr v0, v3

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-wide v0
.end method

.method protected static o1(III)I
    .locals 0

    invoke-static {p0, p1, p2}, Linet/ipaddr/format/validate/g;->d(III)Ljava/lang/Integer;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    return p0
.end method

.method protected static p1(III)I
    .locals 0

    invoke-static {p0, p1, p2}, Linet/ipaddr/format/validate/g;->e(III)I

    move-result p0

    return p0
.end method

.method protected static q1(III)Ljava/lang/Integer;
    .locals 0

    invoke-static {p0, p1, p2}, Linet/ipaddr/format/validate/g;->f(III)Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method

.method protected static r1(II)Ljava/lang/Integer;
    .locals 0

    invoke-static {p0, p1}, Linet/ipaddr/format/validate/g;->b(II)Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method

.method protected static s(I)Ljava/lang/Integer;
    .locals 0

    invoke-static {p0}, Linet/ipaddr/format/validate/g;->a(I)Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method

.method protected static s1(ILjava/lang/Integer;I)Ljava/lang/Integer;
    .locals 0

    invoke-static {p0, p1, p2}, Linet/ipaddr/format/validate/g;->g(ILjava/lang/Integer;I)Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method

.method protected static t1(LZf/e;)LZf/e;
    .locals 1

    invoke-interface {p0}, Lag/g;->A0()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-interface {p0}, Lag/e;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p0}, LZf/b;->e()Linet/ipaddr/c;

    move-result-object v0

    invoke-virtual {v0}, Linet/ipaddr/c;->d()Linet/ipaddr/c$b;

    move-result-object v0

    invoke-virtual {v0}, Linet/ipaddr/c$b;->allPrefixedAddressesAreSubnets()Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    return-object p0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method protected static u1(Linet/ipaddr/c;Linet/ipaddr/c;)Z
    .locals 0

    invoke-virtual {p0}, Linet/ipaddr/c;->d()Linet/ipaddr/c$b;

    move-result-object p0

    invoke-virtual {p1}, Linet/ipaddr/c;->d()Linet/ipaddr/c$b;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method protected static v1(ZLZf/c;Lbg/a;Ljava/util/Iterator;Ljava/lang/Integer;)Ljava/util/Iterator;
    .locals 0

    if-eqz p0, :cond_0

    new-instance p0, Lbg/d$a;

    invoke-direct {p0, p1}, Lbg/d$a;-><init>(LZf/c;)V

    return-object p0

    :cond_0
    new-instance p0, Lbg/d$b;

    invoke-direct {p0, p3, p2, p4}, Lbg/d$b;-><init>(Ljava/util/Iterator;Lbg/a;Ljava/lang/Integer;)V

    return-object p0
.end method

.method protected static w1(ZLinet/ipaddr/a;Lbg/a;Ljava/util/Iterator;Ljava/lang/Integer;)Ljava/util/Iterator;
    .locals 0

    if-eqz p0, :cond_0

    new-instance p0, Lbg/d$e;

    invoke-direct {p0, p1}, Lbg/d$e;-><init>(Linet/ipaddr/a;)V

    return-object p0

    :cond_0
    new-instance p0, Lbg/d$f;

    invoke-direct {p0, p3, p2, p4}, Lbg/d$f;-><init>(Ljava/util/Iterator;Lbg/a;Ljava/lang/Integer;)V

    return-object p0
.end method

.method private static synthetic x1(LZf/c;I)I
    .locals 0

    invoke-interface {p0, p1}, LZf/e;->q(I)LZf/d;

    move-result-object p0

    invoke-interface {p0}, LZf/d;->w0()I

    move-result p1

    invoke-interface {p0}, LZf/d;->Q()I

    move-result p0

    sub-int/2addr p1, p0

    add-int/lit8 p1, p1, 0x1

    return p1
.end method

.method protected static y1(LZf/c;I)J
    .locals 1

    new-instance v0, Lbg/c;

    invoke-direct {v0, p0}, Lbg/c;-><init>(LZf/c;)V

    invoke-static {v0, p1}, Lbg/d;->n1(Ljava/util/function/IntUnaryOperator;I)J

    move-result-wide p0

    return-wide p0
.end method

.method private static z1(Ljava/math/BigInteger;J)Ljava/math/BigInteger;
    .locals 2

    const-wide/16 v0, 0x1

    cmp-long v0, p1, v0

    if-nez v0, :cond_0

    return-object p0

    :cond_0
    invoke-static {p1, p2}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object p1

    sget-object p2, Ljava/math/BigInteger;->ONE:Ljava/math/BigInteger;

    if-ne p0, p2, :cond_1

    return-object p1

    :cond_1
    invoke-virtual {p0, p1}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method protected b0(Z)[B
    .locals 12

    invoke-interface {p0}, Lag/e;->f()I

    move-result v0

    add-int/lit8 v0, v0, 0x7

    shr-int/lit8 v0, v0, 0x3

    new-array v1, v0, [B

    invoke-virtual {p0}, Lag/d;->H()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    add-int/lit8 v0, v0, -0x1

    const/16 v3, 0x8

    move v4, v3

    :goto_0
    if-ltz v2, :cond_3

    invoke-virtual {p0, v2}, Lbg/d;->m1(I)Lbg/b;

    move-result-object v5

    if-eqz p1, :cond_0

    invoke-virtual {v5}, Lbg/b;->W1()J

    move-result-wide v6

    goto :goto_1

    :cond_0
    invoke-virtual {v5}, Lbg/b;->a2()J

    move-result-wide v6

    :goto_1
    invoke-interface {v5}, Lag/g;->f()I

    move-result v5

    :goto_2
    if-lez v5, :cond_2

    aget-byte v8, v1, v0

    int-to-long v8, v8

    rsub-int/lit8 v10, v4, 0x8

    shl-long v10, v6, v10

    or-long/2addr v8, v10

    long-to-int v8, v8

    int-to-byte v8, v8

    aput-byte v8, v1, v0

    ushr-long/2addr v6, v4

    if-ge v5, v4, :cond_1

    sub-int/2addr v4, v5

    goto :goto_3

    :cond_1
    sub-int/2addr v5, v4

    add-int/lit8 v0, v0, -0x1

    move v4, v3

    goto :goto_2

    :cond_2
    :goto_3
    add-int/lit8 v2, v2, -0x1

    goto :goto_0

    :cond_3
    return-object v1
.end method

.method protected c1(Lag/d;)Z
    .locals 1

    instance-of v0, p1, Lbg/d;

    if-eqz v0, :cond_0

    invoke-super {p0, p1}, Lag/d;->c1(Lag/d;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public hashCode()I
    .locals 8

    iget v0, p0, Lag/d;->f:I

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lag/d;->H()I

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_0

    invoke-virtual {p0, v2}, Lbg/d;->m1(I)Lbg/b;

    move-result-object v3

    invoke-virtual {v3}, Lbg/b;->W1()J

    move-result-wide v4

    invoke-virtual {v3}, Lbg/b;->a2()J

    move-result-wide v6

    invoke-static {v1, v4, v5, v6, v7}, Lag/d;->j(IJJ)I

    move-result v1

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    iput v1, p0, Lag/d;->f:I

    move v0, v1

    :cond_1
    return v0
.end method

.method public m1(I)Lbg/b;
    .locals 0

    invoke-super {p0, p1}, Lag/d;->V0(I)Lag/b;

    move-result-object p1

    check-cast p1, Lbg/b;

    return-object p1
.end method
