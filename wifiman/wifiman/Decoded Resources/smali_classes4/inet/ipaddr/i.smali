.class public abstract Linet/ipaddr/i;
.super Linet/ipaddr/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Linet/ipaddr/i$a;
    }
.end annotation


# instance fields
.field private final b:[Linet/ipaddr/g;

.field private final c:[Linet/ipaddr/g;

.field private final d:[Linet/ipaddr/g;

.field private final e:[Linet/ipaddr/g;

.field private final f:[I

.field private final g:[I

.field private transient h:Linet/ipaddr/g;

.field private i:Linet/ipaddr/i$a;


# direct methods
.method protected constructor <init>(Ljava/lang/Class;)V
    .locals 4

    invoke-direct {p0}, Linet/ipaddr/c;-><init>()V

    invoke-virtual {p0}, Linet/ipaddr/i;->n0()Linet/ipaddr/g$a;

    move-result-object v0

    invoke-static {v0}, Linet/ipaddr/g;->U0(Linet/ipaddr/g$a;)I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    invoke-static {p1, v1}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Linet/ipaddr/g;

    iput-object p1, p0, Linet/ipaddr/i;->b:[Linet/ipaddr/g;

    invoke-virtual {p1}, [Linet/ipaddr/g;->clone()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Linet/ipaddr/g;

    iput-object v1, p0, Linet/ipaddr/i;->c:[Linet/ipaddr/g;

    invoke-virtual {p1}, [Linet/ipaddr/g;->clone()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Linet/ipaddr/g;

    iput-object v1, p0, Linet/ipaddr/i;->d:[Linet/ipaddr/g;

    invoke-virtual {p1}, [Linet/ipaddr/g;->clone()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Linet/ipaddr/g;

    iput-object p1, p0, Linet/ipaddr/i;->e:[Linet/ipaddr/g;

    invoke-virtual {p0}, Linet/ipaddr/i;->j()Linet/ipaddr/i$a;

    move-result-object p1

    iput-object p1, p0, Linet/ipaddr/i;->i:Linet/ipaddr/i$a;

    invoke-static {v0}, Linet/ipaddr/k;->u2(Linet/ipaddr/g$a;)I

    move-result p1

    const/4 v0, -0x1

    shl-int/2addr v0, p1

    not-int v0, v0

    add-int/lit8 v1, p1, 0x1

    new-array v1, v1, [I

    iput-object v1, p0, Linet/ipaddr/i;->f:[I

    invoke-virtual {v1}, [I->clone()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [I

    iput-object v1, p0, Linet/ipaddr/i;->g:[I

    const/4 v1, 0x0

    :goto_0
    if-gt v1, p1, :cond_0

    iget-object v2, p0, Linet/ipaddr/i;->f:[I

    sub-int v3, p1, v1

    shl-int v3, v0, v3

    and-int/2addr v3, v0

    aput v3, v2, v1

    iget-object v2, p0, Linet/ipaddr/i;->g:[I

    not-int v3, v3

    and-int/2addr v3, v0

    aput v3, v2, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method private F(Linet/ipaddr/j;ZZZIIIII)V
    .locals 9

    move v0, p6

    move/from16 v1, p8

    move/from16 v2, p9

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz p2, :cond_1

    sub-int v5, p5, v0

    if-lt v5, v1, :cond_0

    :goto_0
    move v5, v4

    goto :goto_1

    :cond_0
    move v5, v3

    goto :goto_1

    :cond_1
    if-lt v0, v1, :cond_0

    goto :goto_0

    :goto_1
    invoke-static {}, Linet/ipaddr/j;->H1()Lbg/f$c;

    move-result-object v6

    if-eqz v5, :cond_4

    if-eqz p2, :cond_2

    invoke-static {p6, v2, v1}, Linet/ipaddr/j;->p1(III)I

    move-result v1

    add-int/lit8 v3, v1, 0x1

    sub-int v1, p7, v3

    goto :goto_2

    :cond_2
    invoke-static {p6, v2, v1}, Linet/ipaddr/j;->b2(III)I

    move-result v1

    :goto_2
    invoke-static {v3, v1}, Linet/ipaddr/j;->I1(II)Lbg/f$c;

    move-result-object v1

    if-eqz p2, :cond_3

    if-eqz p3, :cond_3

    invoke-virtual {p0}, Linet/ipaddr/c;->d()Linet/ipaddr/c$b;

    move-result-object v2

    invoke-virtual {v2}, Linet/ipaddr/c$b;->prefixedSubnetsAreExplicit()Z

    move-result v2

    if-nez v2, :cond_3

    goto :goto_3

    :cond_3
    move-object v6, v1

    :goto_3
    move-object v8, v1

    move-object v7, v6

    goto :goto_4

    :cond_4
    move-object v7, v6

    move-object v8, v7

    :goto_4
    invoke-static {p6}, Linet/ipaddr/i;->h(I)Ljava/lang/Integer;

    move-result-object v1

    if-eqz p2, :cond_7

    if-eqz p3, :cond_7

    invoke-virtual {p0}, Linet/ipaddr/c;->d()Linet/ipaddr/c$b;

    move-result-object v2

    invoke-virtual {v2}, Linet/ipaddr/c$b;->prefixedSubnetsAreExplicit()Z

    move-result v2

    if-nez v2, :cond_6

    invoke-virtual {p0}, Linet/ipaddr/c;->d()Linet/ipaddr/c$b;

    move-result-object v2

    invoke-virtual {v2}, Linet/ipaddr/c$b;->zeroHostsAreSubnets()Z

    move-result v2

    if-eqz v2, :cond_5

    if-nez p4, :cond_5

    goto :goto_5

    :cond_5
    const-wide/16 v2, 0x2

    invoke-static {v2, v3}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v2

    sub-int v0, p5, v0

    invoke-virtual {v2, v0}, Ljava/math/BigInteger;->pow(I)Ljava/math/BigInteger;

    move-result-object v0

    move-object v6, v0

    move-object v3, v1

    move-object v5, v3

    goto :goto_7

    :cond_6
    :goto_5
    invoke-static {p5}, Linet/ipaddr/i;->h(I)Ljava/lang/Integer;

    move-result-object v0

    sget-object v2, Ljava/math/BigInteger;->ONE:Ljava/math/BigInteger;

    move-object v5, v0

    move-object v3, v1

    :goto_6
    move-object v6, v2

    goto :goto_7

    :cond_7
    invoke-static {p5}, Linet/ipaddr/i;->h(I)Ljava/lang/Integer;

    move-result-object v0

    sget-object v2, Ljava/math/BigInteger;->ONE:Ljava/math/BigInteger;

    const/4 v3, 0x0

    move-object v5, v0

    goto :goto_6

    :goto_7
    move-object v0, p1

    move v2, p2

    move-object v4, v5

    invoke-virtual/range {v0 .. v8}, Linet/ipaddr/j;->j2(Ljava/lang/Integer;ZLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/math/BigInteger;Lbg/f$c;Lbg/f$c;)V

    return-void
.end method

.method protected static h(I)Ljava/lang/Integer;
    .locals 0

    invoke-static {p0}, Linet/ipaddr/j;->s(I)Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method

.method private o(I[Linet/ipaddr/g;ZZZ)Linet/ipaddr/g;
    .locals 20

    move-object/from16 v11, p0

    move/from16 v0, p1

    invoke-virtual/range {p0 .. p0}, Linet/ipaddr/i;->n0()Linet/ipaddr/g$a;

    move-result-object v12

    invoke-static {v12}, Linet/ipaddr/g;->U0(Linet/ipaddr/g$a;)I

    move-result v13

    if-ltz v0, :cond_16

    if-gt v0, v13, :cond_16

    aget-object v1, p2, v0

    if-nez v1, :cond_15

    const/4 v14, 0x0

    if-eqz p3, :cond_0

    move v15, v13

    move/from16 v16, v14

    goto :goto_0

    :cond_0
    move/from16 v16, v13

    move v15, v14

    :goto_0
    aget-object v1, p2, v15

    aget-object v2, p2, v16

    if-eqz v1, :cond_1

    if-nez v2, :cond_7

    :cond_1
    monitor-enter p2

    :try_start_0
    invoke-static {v12}, Linet/ipaddr/g;->c1(Linet/ipaddr/g$a;)I

    move-result v10

    invoke-static {v12}, Linet/ipaddr/g;->V0(Linet/ipaddr/g$a;)I

    move-result v9

    invoke-static {v12}, Linet/ipaddr/g;->X0(Linet/ipaddr/g$a;)I

    move-result v17

    aget-object v1, p2, v15

    if-nez v1, :cond_3

    invoke-virtual/range {p0 .. p0}, Linet/ipaddr/i;->m()Linet/ipaddr/i$a;

    move-result-object v1

    invoke-virtual {v1, v10}, Linet/ipaddr/format/validate/f;->d(I)[LZf/d;

    move-result-object v2

    check-cast v2, [Linet/ipaddr/k;

    invoke-static {v12}, Linet/ipaddr/g;->Z0(Linet/ipaddr/g$a;)I

    move-result v3

    if-eqz p3, :cond_2

    if-eqz p4, :cond_2

    invoke-static {v9, v13}, Linet/ipaddr/j;->r1(II)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v1, v3, v4}, Linet/ipaddr/c$a;->g(ILjava/lang/Integer;)LZf/d;

    move-result-object v4

    check-cast v4, Linet/ipaddr/k;

    array-length v5, v2

    add-int/lit8 v5, v5, -0x1

    invoke-static {v2, v14, v5, v4}, Ljava/util/Arrays;->fill([Ljava/lang/Object;IILjava/lang/Object;)V

    invoke-static {v9, v9}, Linet/ipaddr/j;->r1(II)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v1, v3, v4}, Linet/ipaddr/c$a;->g(ILjava/lang/Integer;)LZf/d;

    move-result-object v3

    check-cast v3, Linet/ipaddr/k;

    array-length v4, v2

    add-int/lit8 v4, v4, -0x1

    aput-object v3, v2, v4

    invoke-static {v13}, Linet/ipaddr/i;->h(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Linet/ipaddr/i$a;->T([Linet/ipaddr/k;Ljava/lang/Integer;)Linet/ipaddr/g;

    move-result-object v1

    :goto_1
    move-object/from16 v18, v1

    goto :goto_2

    :catchall_0
    move-exception v0

    goto/16 :goto_13

    :cond_2
    invoke-interface {v1, v3}, Linet/ipaddr/c$a;->a(I)LZf/d;

    move-result-object v3

    check-cast v3, Linet/ipaddr/k;

    invoke-static {v2, v3}, Ljava/util/Arrays;->fill([Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v1, v2}, Linet/ipaddr/i$a;->S([Linet/ipaddr/k;)Linet/ipaddr/g;

    move-result-object v1

    goto :goto_1

    :goto_2
    invoke-virtual/range {v18 .. v18}, Linet/ipaddr/g;->b1()Linet/ipaddr/j;

    move-result-object v2

    move-object/from16 v1, p0

    move/from16 v3, p3

    move/from16 v4, p4

    move/from16 v5, p5

    move v6, v13

    move v7, v15

    move v8, v10

    move/from16 v19, v9

    move v14, v10

    move/from16 v10, v17

    invoke-direct/range {v1 .. v10}, Linet/ipaddr/i;->F(Linet/ipaddr/j;ZZZIIIII)V

    aput-object v18, p2, v15

    goto :goto_3

    :cond_3
    move/from16 v19, v9

    move v14, v10

    move-object/from16 v18, v1

    :goto_3
    aget-object v1, p2, v16

    if-nez v1, :cond_6

    invoke-virtual/range {p0 .. p0}, Linet/ipaddr/i;->m()Linet/ipaddr/i$a;

    move-result-object v1

    invoke-virtual {v1, v14}, Linet/ipaddr/format/validate/f;->d(I)[LZf/d;

    move-result-object v2

    check-cast v2, [Linet/ipaddr/k;

    if-eqz p3, :cond_5

    if-eqz p4, :cond_5

    move/from16 v9, v19

    const/4 v3, 0x0

    invoke-static {v9, v3}, Linet/ipaddr/j;->r1(II)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v1, v3, v4}, Linet/ipaddr/c$a;->g(ILjava/lang/Integer;)LZf/d;

    move-result-object v4

    check-cast v4, Linet/ipaddr/k;

    invoke-static {v2, v4}, Ljava/util/Arrays;->fill([Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v3}, Linet/ipaddr/i;->h(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v1, v2, v4}, Linet/ipaddr/i$a;->T([Linet/ipaddr/k;Ljava/lang/Integer;)Linet/ipaddr/g;

    move-result-object v1

    invoke-virtual/range {p0 .. p0}, Linet/ipaddr/c;->d()Linet/ipaddr/c$b;

    move-result-object v2

    invoke-virtual {v2}, Linet/ipaddr/c$b;->zeroHostsAreSubnets()Z

    move-result v2

    if-eqz v2, :cond_4

    if-nez p5, :cond_4

    invoke-virtual {v1}, Linet/ipaddr/g;->Y0()Linet/ipaddr/g;

    move-result-object v1

    :cond_4
    :goto_4
    move-object v15, v1

    goto :goto_5

    :cond_5
    move/from16 v9, v19

    const/4 v3, 0x0

    invoke-interface {v1, v3}, Linet/ipaddr/c$a;->a(I)LZf/d;

    move-result-object v4

    check-cast v4, Linet/ipaddr/k;

    invoke-static {v2, v4}, Ljava/util/Arrays;->fill([Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v1, v2}, Linet/ipaddr/i$a;->S([Linet/ipaddr/k;)Linet/ipaddr/g;

    move-result-object v1

    goto :goto_4

    :goto_5
    invoke-virtual {v15}, Linet/ipaddr/g;->b1()Linet/ipaddr/j;

    move-result-object v2

    move-object/from16 v1, p0

    move/from16 v3, p3

    move/from16 v4, p4

    move/from16 v5, p5

    move v6, v13

    move/from16 v7, v16

    move v8, v14

    move/from16 v10, v17

    invoke-direct/range {v1 .. v10}, Linet/ipaddr/i;->F(Linet/ipaddr/j;ZZZIIIII)V

    aput-object v15, p2, v16

    move-object v2, v15

    goto :goto_6

    :cond_6
    move-object v2, v1

    :goto_6
    monitor-exit p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object/from16 v1, v18

    :cond_7
    monitor-enter p2

    :try_start_1
    aget-object v3, p2, v0

    if-nez v3, :cond_14

    invoke-virtual/range {p0 .. p0}, Linet/ipaddr/i;->E()Ljava/util/function/BiFunction;

    move-result-object v3

    invoke-static {v12}, Linet/ipaddr/g;->c1(Linet/ipaddr/g$a;)I

    move-result v8

    invoke-static {v12}, Linet/ipaddr/g;->V0(Linet/ipaddr/g$a;)I

    move-result v9

    invoke-static {v12}, Linet/ipaddr/g;->X0(Linet/ipaddr/g$a;)I

    move-result v10

    const/4 v4, 0x0

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v3, v1, v5}, Ljava/util/function/BiFunction;->apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Linet/ipaddr/k;

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v3, v2, v5}, Ljava/util/function/BiFunction;->apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Linet/ipaddr/k;

    invoke-virtual/range {p0 .. p0}, Linet/ipaddr/i;->m()Linet/ipaddr/i$a;

    move-result-object v5

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6, v8}, Ljava/util/ArrayList;-><init>(I)V

    move v12, v0

    move v7, v4

    :goto_7
    if-lez v12, :cond_f

    if-gt v12, v9, :cond_d

    add-int/lit8 v14, v12, -0x1

    rem-int/2addr v14, v9

    add-int/lit8 v14, v14, 0x1

    move v15, v14

    move v14, v4

    :goto_8
    if-ge v14, v8, :cond_9

    if-eq v15, v0, :cond_8

    aget-object v4, p2, v15

    if-eqz v4, :cond_8

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-interface {v3, v4, v14}, Ljava/util/function/BiFunction;->apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Linet/ipaddr/k;

    goto :goto_9

    :catchall_1
    move-exception v0

    goto/16 :goto_12

    :cond_8
    add-int/lit8 v14, v14, 0x1

    add-int/2addr v15, v9

    const/4 v4, 0x0

    goto :goto_8

    :cond_9
    const/4 v4, 0x0

    :goto_9
    if-nez v4, :cond_c

    invoke-virtual {v11, v12}, Linet/ipaddr/i;->C(I)I

    move-result v4

    if-eqz p3, :cond_b

    if-eqz p4, :cond_a

    invoke-static {v9, v12}, Linet/ipaddr/j;->r1(II)Ljava/lang/Integer;

    move-result-object v14

    invoke-interface {v5, v4, v14}, Linet/ipaddr/c$a;->g(ILjava/lang/Integer;)LZf/d;

    move-result-object v4

    check-cast v4, Linet/ipaddr/k;

    goto :goto_a

    :cond_a
    invoke-interface {v5, v4}, Linet/ipaddr/c$a;->a(I)LZf/d;

    move-result-object v4

    check-cast v4, Linet/ipaddr/k;

    goto :goto_a

    :cond_b
    invoke-virtual {v11, v12}, Linet/ipaddr/i;->B(I)I

    move-result v4

    invoke-interface {v5, v4}, Linet/ipaddr/c$a;->a(I)LZf/d;

    move-result-object v4

    check-cast v4, Linet/ipaddr/k;

    :cond_c
    :goto_a
    invoke-virtual {v6, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_c

    :cond_d
    if-eqz p3, :cond_e

    move-object v4, v1

    goto :goto_b

    :cond_e
    move-object v4, v2

    :goto_b
    invoke-virtual {v6, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_c
    add-int/lit8 v7, v7, 0x1

    sub-int/2addr v12, v9

    const/4 v4, 0x0

    goto :goto_7

    :cond_f
    :goto_d
    if-ge v7, v8, :cond_11

    if-eqz p3, :cond_10

    move-object v3, v2

    goto :goto_e

    :cond_10
    move-object v3, v1

    :goto_e
    invoke-virtual {v6, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v7, v7, 0x1

    goto :goto_d

    :cond_11
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-virtual {v5, v1}, Linet/ipaddr/format/validate/f;->d(I)[LZf/d;

    move-result-object v1

    check-cast v1, [Linet/ipaddr/k;

    invoke-virtual {v6, v1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    if-eqz p3, :cond_13

    if-eqz p4, :cond_13

    invoke-static/range {p1 .. p1}, Linet/ipaddr/i;->h(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v5, v1, v2}, Linet/ipaddr/i$a;->T([Linet/ipaddr/k;Ljava/lang/Integer;)Linet/ipaddr/g;

    move-result-object v1

    invoke-virtual/range {p0 .. p0}, Linet/ipaddr/c;->d()Linet/ipaddr/c$b;

    move-result-object v2

    invoke-virtual {v2}, Linet/ipaddr/c$b;->zeroHostsAreSubnets()Z

    move-result v2

    if-eqz v2, :cond_12

    if-nez p5, :cond_12

    invoke-virtual {v1}, Linet/ipaddr/g;->Y0()Linet/ipaddr/g;

    move-result-object v1

    :cond_12
    :goto_f
    move-object v12, v1

    goto :goto_10

    :cond_13
    invoke-virtual {v5, v1}, Linet/ipaddr/i$a;->S([Linet/ipaddr/k;)Linet/ipaddr/g;

    move-result-object v1

    goto :goto_f

    :goto_10
    invoke-virtual {v12}, Linet/ipaddr/g;->b1()Linet/ipaddr/j;

    move-result-object v2

    move-object/from16 v1, p0

    move/from16 v3, p3

    move/from16 v4, p4

    move/from16 v5, p5

    move v6, v13

    move/from16 v7, p1

    invoke-direct/range {v1 .. v10}, Linet/ipaddr/i;->F(Linet/ipaddr/j;ZZZIIIII)V

    aput-object v12, p2, v0

    move-object v1, v12

    goto :goto_11

    :cond_14
    move-object v1, v3

    :goto_11
    monitor-exit p2

    goto :goto_14

    :goto_12
    monitor-exit p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    throw v0

    :goto_13
    :try_start_2
    monitor-exit p2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0

    :cond_15
    :goto_14
    return-object v1

    :cond_16
    new-instance v1, Linet/ipaddr/PrefixLenException;

    invoke-direct {v1, v0, v12}, Linet/ipaddr/PrefixLenException;-><init>(ILinet/ipaddr/g$a;)V

    throw v1
.end method

.method public static v(I)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    sget v1, Linet/ipaddr/format/validate/b;->a:I

    add-int/lit8 v1, v1, 0x1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const/16 v1, 0x2f

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public B(I)I
    .locals 1

    iget-object v0, p0, Linet/ipaddr/i;->g:[I

    aget p1, v0, p1

    return p1
.end method

.method public C(I)I
    .locals 1

    iget-object v0, p0, Linet/ipaddr/i;->f:[I

    aget p1, v0, p1

    return p1
.end method

.method protected abstract E()Ljava/util/function/BiFunction;
.end method

.method protected abstract j()Linet/ipaddr/i$a;
.end method

.method protected abstract l()Linet/ipaddr/g;
.end method

.method public m()Linet/ipaddr/i$a;
    .locals 1

    iget-object v0, p0, Linet/ipaddr/i;->i:Linet/ipaddr/i$a;

    return-object v0
.end method

.method public n()Linet/ipaddr/g;
    .locals 1

    iget-object v0, p0, Linet/ipaddr/i;->h:Linet/ipaddr/g;

    if-nez v0, :cond_1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Linet/ipaddr/i;->h:Linet/ipaddr/g;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Linet/ipaddr/i;->l()Linet/ipaddr/g;

    move-result-object v0

    iput-object v0, p0, Linet/ipaddr/i;->h:Linet/ipaddr/g;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit p0

    goto :goto_2

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_1
    :goto_2
    iget-object v0, p0, Linet/ipaddr/i;->h:Linet/ipaddr/g;

    return-object v0
.end method

.method public abstract n0()Linet/ipaddr/g$a;
.end method

.method public p(I)Linet/ipaddr/g;
    .locals 6

    iget-object v2, p0, Linet/ipaddr/i;->d:[Linet/ipaddr/g;

    const/4 v4, 0x1

    const/4 v5, 0x1

    const/4 v3, 0x1

    move-object v0, p0

    move v1, p1

    invoke-direct/range {v0 .. v5}, Linet/ipaddr/i;->o(I[Linet/ipaddr/g;ZZZ)Linet/ipaddr/g;

    move-result-object p1

    return-object p1
.end method

.method public r(I)Linet/ipaddr/g;
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Linet/ipaddr/i;->s(IZ)Linet/ipaddr/g;

    move-result-object p1

    return-object p1
.end method

.method public s(IZ)Linet/ipaddr/g;
    .locals 7

    if-eqz p2, :cond_0

    iget-object v0, p0, Linet/ipaddr/i;->b:[Linet/ipaddr/g;

    :goto_0
    move-object v3, v0

    goto :goto_1

    :cond_0
    iget-object v0, p0, Linet/ipaddr/i;->c:[Linet/ipaddr/g;

    goto :goto_0

    :goto_1
    const/4 v4, 0x1

    const/4 v6, 0x0

    move-object v1, p0

    move v2, p1

    move v5, p2

    invoke-direct/range {v1 .. v6}, Linet/ipaddr/i;->o(I[Linet/ipaddr/g;ZZZ)Linet/ipaddr/g;

    move-result-object p1

    return-object p1
.end method

.method public t(I)Linet/ipaddr/j;
    .locals 2

    invoke-virtual {p0}, Linet/ipaddr/i;->y()Ljava/util/function/Function;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {p0, p1, v1}, Linet/ipaddr/i;->s(IZ)Linet/ipaddr/g;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Linet/ipaddr/j;

    return-object p1
.end method

.method protected abstract y()Ljava/util/function/Function;
.end method
