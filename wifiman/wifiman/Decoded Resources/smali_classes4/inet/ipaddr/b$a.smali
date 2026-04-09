.class public Linet/ipaddr/b$a;
.super Linet/ipaddr/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Linet/ipaddr/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# direct methods
.method public constructor <init>(Z)V
    .locals 0

    invoke-direct {p0, p1}, Linet/ipaddr/b;-><init>(Z)V

    return-void
.end method

.method private static r(Lag/e;Lag/e;)I
    .locals 0

    invoke-interface {p0, p1}, Lag/e;->l0(Lag/e;)I

    move-result p0

    return p0
.end method

.method private s(Lag/e;Lag/e;)I
    .locals 41

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    instance-of v2, v0, Lbg/d;

    if-eqz v2, :cond_0

    instance-of v2, v1, Lbg/d;

    if-eqz v2, :cond_0

    move-object v2, v0

    check-cast v2, Lbg/d;

    move-object v3, v1

    check-cast v3, Lbg/d;

    move-object/from16 v13, p0

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    move-object/from16 v13, p0

    move-object v3, v2

    :goto_0
    iget-boolean v4, v13, Linet/ipaddr/b;->a:Z

    if-nez v4, :cond_1

    invoke-interface/range {p1 .. p1}, Lag/g;->A0()Z

    move-result v4

    if-nez v4, :cond_1

    invoke-interface/range {p2 .. p2}, Lag/g;->A0()Z

    move-result v4

    if-eqz v4, :cond_2

    :cond_1
    invoke-static/range {p1 .. p2}, Linet/ipaddr/b;->h(Lag/e;Lag/e;)I

    move-result v4

    if-eqz v4, :cond_2

    return v4

    :cond_2
    invoke-interface/range {p1 .. p1}, Lag/g;->v0()I

    move-result v4

    invoke-interface/range {p2 .. p2}, Lag/g;->v0()I

    move-result v5

    new-array v6, v4, [B

    new-array v4, v4, [B

    new-array v7, v5, [B

    new-array v5, v5, [B

    const/16 v16, 0x0

    move/from16 v8, v16

    move v9, v8

    move v10, v9

    move v11, v10

    move v12, v11

    move/from16 v17, v12

    move/from16 v18, v17

    move/from16 v19, v18

    move/from16 v20, v19

    move/from16 v21, v20

    const-wide/16 v22, 0x0

    const-wide/16 v24, 0x0

    const-wide/16 v26, 0x0

    const-wide/16 v28, 0x0

    :goto_1
    invoke-interface/range {p1 .. p1}, Lcg/b;->H()I

    move-result v14

    if-lt v8, v14, :cond_4

    invoke-interface/range {p2 .. p2}, Lcg/b;->H()I

    move-result v14

    if-ge v9, v14, :cond_3

    goto :goto_2

    :cond_3
    return v16

    :cond_4
    :goto_2
    if-eqz v2, :cond_8

    if-nez v10, :cond_5

    add-int/lit8 v10, v8, 0x1

    invoke-virtual {v2, v8}, Lbg/d;->m1(I)Lbg/b;

    move-result-object v8

    invoke-interface {v8}, Lag/g;->f()I

    move-result v14

    invoke-virtual {v8}, Lbg/b;->a2()J

    move-result-wide v22

    invoke-virtual {v8}, Lbg/b;->W1()J

    move-result-wide v24

    move v8, v10

    move v10, v14

    :cond_5
    if-nez v12, :cond_6

    add-int/lit8 v12, v9, 0x1

    invoke-virtual {v3, v9}, Lbg/d;->m1(I)Lbg/b;

    move-result-object v9

    invoke-interface {v9}, Lag/g;->f()I

    move-result v14

    invoke-virtual {v9}, Lbg/b;->a2()J

    move-result-wide v26

    invoke-virtual {v9}, Lbg/b;->W1()J

    move-result-wide v28

    move-object/from16 v34, v2

    move-object/from16 v35, v3

    move-object/from16 v31, v4

    move-object v0, v5

    move-object v1, v6

    move-object v2, v7

    move v3, v8

    move v13, v12

    move v12, v14

    :goto_3
    move v14, v11

    goto/16 :goto_b

    :cond_6
    move-object/from16 v34, v2

    move-object/from16 v35, v3

    :cond_7
    move-object/from16 v31, v4

    move-object v0, v5

    move-object v1, v6

    move-object v2, v7

    move v3, v8

    move v13, v9

    goto :goto_3

    :cond_8
    const/4 v15, 0x7

    const/16 v30, 0x8

    if-nez v10, :cond_d

    if-nez v11, :cond_9

    add-int/lit8 v10, v8, 0x1

    invoke-interface {v0, v8}, Lag/e;->k(I)Lag/f;

    move-result-object v8

    invoke-interface {v8, v6}, Lag/g;->G([B)[B

    move-result-object v6

    invoke-interface {v8, v4}, Lag/g;->R0([B)[B

    move-result-object v4

    invoke-interface {v8}, Lag/g;->f()I

    move-result v11

    invoke-interface {v8}, Lag/g;->v0()I

    move-result v8

    move/from16 v18, v16

    move/from16 v37, v11

    move v11, v8

    move v8, v10

    move/from16 v10, v37

    goto :goto_4

    :cond_9
    move/from16 v10, v17

    :goto_4
    if-ge v15, v11, :cond_b

    add-int/lit8 v17, v10, -0x38

    add-int/lit8 v11, v11, -0x7

    move v10, v15

    const-wide/16 v22, 0x0

    const-wide/16 v24, 0x0

    :goto_5
    add-int/lit8 v31, v10, -0x1

    if-lez v10, :cond_a

    aget-byte v10, v6, v18

    add-int/lit8 v32, v18, 0x1

    aget-byte v14, v4, v18

    shl-long v22, v22, v30

    move-object/from16 v34, v2

    move-object/from16 v35, v3

    int-to-long v2, v10

    or-long v22, v22, v2

    shl-long v2, v24, v30

    move/from16 v36, v11

    int-to-long v10, v14

    or-long v24, v2, v10

    move/from16 v10, v31

    move/from16 v18, v32

    move-object/from16 v2, v34

    move-object/from16 v3, v35

    move/from16 v11, v36

    goto :goto_5

    :cond_a
    move-object/from16 v34, v2

    move-object/from16 v35, v3

    move/from16 v36, v11

    const/16 v10, 0x38

    goto :goto_7

    :cond_b
    move-object/from16 v34, v2

    move-object/from16 v35, v3

    add-int/lit8 v11, v11, -0x1

    shl-int/lit8 v2, v11, 0x3

    sub-int v2, v10, v2

    const-wide/16 v22, 0x0

    const-wide/16 v24, 0x0

    :goto_6
    add-int/lit8 v3, v11, -0x1

    if-lez v11, :cond_c

    aget-byte v11, v6, v18

    add-int/lit8 v14, v18, 0x1

    aget-byte v15, v4, v18

    shl-long v17, v22, v30

    move/from16 v32, v10

    int-to-long v10, v11

    or-long v22, v17, v10

    shl-long v10, v24, v30

    move/from16 v17, v14

    int-to-long v13, v15

    or-long v24, v10, v13

    const/4 v15, 0x7

    move-object/from16 v13, p0

    move v11, v3

    move/from16 v18, v17

    move/from16 v10, v32

    goto :goto_6

    :cond_c
    move/from16 v32, v10

    aget-byte v3, v6, v18

    add-int/lit8 v10, v18, 0x1

    aget-byte v11, v4, v18

    shl-long v13, v22, v2

    rsub-int/lit8 v15, v2, 0x8

    ushr-int/2addr v3, v15

    move-object/from16 v17, v4

    int-to-long v3, v3

    or-long v22, v13, v3

    shl-long v2, v24, v2

    ushr-int v4, v11, v15

    int-to-long v13, v4

    or-long v24, v2, v13

    move/from16 v18, v10

    move/from16 v11, v16

    move-object/from16 v4, v17

    move/from16 v10, v32

    move/from16 v17, v11

    goto :goto_7

    :cond_d
    move-object/from16 v34, v2

    move-object/from16 v35, v3

    :goto_7
    if-nez v12, :cond_7

    if-nez v20, :cond_e

    add-int/lit8 v2, v9, 0x1

    invoke-interface {v1, v9}, Lag/e;->k(I)Lag/f;

    move-result-object v3

    invoke-interface {v3, v7}, Lag/g;->G([B)[B

    move-result-object v7

    invoke-interface {v3, v5}, Lag/g;->R0([B)[B

    move-result-object v5

    invoke-interface {v3}, Lag/g;->f()I

    move-result v9

    invoke-interface {v3}, Lag/g;->v0()I

    move-result v20

    move v12, v9

    move/from16 v21, v16

    const/4 v3, 0x7

    move v9, v2

    move/from16 v2, v20

    goto :goto_8

    :cond_e
    move/from16 v12, v19

    move/from16 v2, v20

    const/4 v3, 0x7

    :goto_8
    if-ge v3, v2, :cond_10

    add-int/lit8 v19, v12, -0x38

    add-int/lit8 v20, v2, -0x7

    move v15, v3

    const-wide/16 v26, 0x0

    const-wide/16 v28, 0x0

    :goto_9
    add-int/lit8 v2, v15, -0x1

    if-lez v15, :cond_f

    aget-byte v3, v7, v21

    add-int/lit8 v12, v21, 0x1

    aget-byte v13, v5, v21

    shl-long v14, v26, v30

    int-to-long v0, v3

    or-long v26, v14, v0

    shl-long v0, v28, v30

    int-to-long v13, v13

    or-long v28, v0, v13

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    move v15, v2

    move/from16 v21, v12

    goto :goto_9

    :cond_f
    move-object/from16 v31, v4

    move-object v0, v5

    move-object v1, v6

    move-object v2, v7

    move v3, v8

    move v13, v9

    move v14, v11

    const/16 v12, 0x38

    goto :goto_b

    :cond_10
    add-int/lit8 v2, v2, -0x1

    shl-int/lit8 v0, v2, 0x3

    sub-int v0, v12, v0

    const-wide/16 v13, 0x0

    const-wide/16 v19, 0x0

    :goto_a
    add-int/lit8 v1, v2, -0x1

    if-lez v2, :cond_11

    aget-byte v2, v7, v21

    add-int/lit8 v3, v21, 0x1

    aget-byte v15, v5, v21

    shl-long v13, v13, v30

    move/from16 v26, v1

    int-to-long v1, v2

    or-long/2addr v13, v1

    shl-long v1, v19, v30

    move/from16 v27, v3

    move-object/from16 v31, v4

    int-to-long v3, v15

    or-long v19, v1, v3

    move/from16 v2, v26

    move/from16 v21, v27

    move-object/from16 v4, v31

    goto :goto_a

    :cond_11
    move-object/from16 v31, v4

    aget-byte v1, v7, v21

    add-int/lit8 v2, v21, 0x1

    aget-byte v3, v5, v21

    shl-long/2addr v13, v0

    rsub-int/lit8 v4, v0, 0x8

    ushr-int/2addr v1, v4

    move v15, v2

    int-to-long v1, v1

    or-long v26, v13, v1

    shl-long v0, v19, v0

    ushr-int v2, v3, v4

    int-to-long v2, v2

    or-long v28, v0, v2

    move-object v0, v5

    move-object v1, v6

    move-object v2, v7

    move v3, v8

    move v13, v9

    move v14, v11

    move/from16 v21, v15

    move/from16 v19, v16

    move/from16 v20, v19

    :goto_b
    if-ne v12, v10, :cond_12

    move/from16 v15, v16

    move-wide/from16 v5, v22

    move-wide/from16 v7, v24

    move-wide/from16 v9, v26

    move-wide/from16 v11, v28

    move-wide/from16 v32, v11

    move-wide/from16 v27, v9

    move/from16 v22, v15

    :goto_c
    move-wide/from16 v25, v7

    move-wide/from16 v23, v5

    goto :goto_d

    :cond_12
    sub-int/2addr v12, v10

    const-wide/16 v4, -0x1

    if-lez v12, :cond_13

    ushr-long v6, v26, v12

    ushr-long v8, v28, v12

    shl-long/2addr v4, v12

    not-long v4, v4

    and-long v10, v26, v4

    and-long v4, v28, v4

    move-wide/from16 v32, v4

    move-wide/from16 v27, v10

    move/from16 v15, v16

    move-wide/from16 v37, v22

    move-wide/from16 v39, v37

    move/from16 v22, v12

    move-wide v11, v8

    move-wide v9, v6

    move-wide/from16 v5, v39

    move-wide/from16 v7, v24

    goto :goto_c

    :cond_13
    neg-int v6, v12

    ushr-long v7, v22, v6

    ushr-long v9, v24, v6

    shl-long/2addr v4, v6

    not-long v4, v4

    and-long v11, v22, v4

    and-long v4, v24, v4

    move v15, v6

    move-wide/from16 v23, v11

    move/from16 v22, v16

    move-wide/from16 v11, v28

    move-wide/from16 v32, v11

    move-wide/from16 v37, v26

    move-wide/from16 v27, v37

    move-wide/from16 v25, v4

    move-wide v5, v7

    move-wide v7, v9

    move-wide/from16 v9, v27

    :goto_d
    move-object/from16 v4, p0

    invoke-virtual/range {v4 .. v12}, Linet/ipaddr/b$a;->l(JJJJ)I

    move-result v4

    if-eqz v4, :cond_14

    return v4

    :cond_14
    move-object v5, v0

    move-object v6, v1

    move-object v7, v2

    move v8, v3

    move v9, v13

    move v11, v14

    move v10, v15

    move/from16 v12, v22

    move-wide/from16 v22, v23

    move-wide/from16 v24, v25

    move-wide/from16 v26, v27

    move-object/from16 v4, v31

    move-wide/from16 v28, v32

    move-object/from16 v2, v34

    move-object/from16 v3, v35

    move-object/from16 v13, p0

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    goto/16 :goto_1
.end method


# virtual methods
.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lag/g;

    check-cast p2, Lag/g;

    invoke-super {p0, p1, p2}, Linet/ipaddr/b;->e(Lag/g;Lag/g;)I

    move-result p1

    return p1
.end method

.method protected i(LZf/c;LZf/c;)I
    .locals 2

    invoke-interface {p1}, Lag/e;->f()I

    move-result v0

    invoke-interface {p2}, Lag/e;->f()I

    move-result v1

    sub-int/2addr v0, v1

    if-nez v0, :cond_0

    invoke-static {p1, p2}, Linet/ipaddr/b$a;->r(Lag/e;Lag/e;)I

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0, p1, p2}, Linet/ipaddr/b$a;->t(LZf/c;LZf/c;)I

    move-result v0

    :cond_0
    return v0
.end method

.method protected j(Lag/e;Lag/e;)I
    .locals 2

    invoke-interface {p1}, Lag/e;->f()I

    move-result v0

    invoke-interface {p2}, Lag/e;->f()I

    move-result v1

    sub-int/2addr v0, v1

    if-nez v0, :cond_0

    invoke-static {p1, p2}, Linet/ipaddr/b$a;->r(Lag/e;Lag/e;)I

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0, p1, p2}, Linet/ipaddr/b$a;->s(Lag/e;Lag/e;)I

    move-result v0

    :cond_0
    return v0
.end method

.method protected k(IIII)I
    .locals 0

    sub-int/2addr p1, p2

    sub-int/2addr p3, p4

    sub-int/2addr p1, p3

    if-nez p1, :cond_0

    sub-int p1, p2, p4

    :cond_0
    return p1
.end method

.method protected l(JJJJ)I
    .locals 0

    sub-long/2addr p1, p3

    sub-long/2addr p5, p7

    cmp-long p1, p1, p5

    const/4 p2, 0x1

    if-nez p1, :cond_1

    cmp-long p1, p3, p7

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    if-lez p1, :cond_2

    return p2

    :cond_1
    if-lez p1, :cond_2

    return p2

    :cond_2
    const/4 p1, -0x1

    return p1
.end method

.method protected m(Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;)I
    .locals 0

    invoke-virtual {p1, p2}, Ljava/math/BigInteger;->subtract(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object p1

    invoke-virtual {p3, p4}, Ljava/math/BigInteger;->subtract(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object p3

    invoke-virtual {p1, p3}, Ljava/math/BigInteger;->compareTo(Ljava/math/BigInteger;)I

    move-result p1

    if-nez p1, :cond_0

    invoke-virtual {p2, p4}, Ljava/math/BigInteger;->compareTo(Ljava/math/BigInteger;)I

    move-result p1

    :cond_0
    return p1
.end method

.method protected t(LZf/c;LZf/c;)I
    .locals 7

    invoke-interface {p1}, LZf/e;->Z()I

    move-result v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_1

    invoke-interface {p1, v2}, LZf/e;->q(I)LZf/d;

    move-result-object v3

    invoke-interface {p2, v2}, LZf/e;->q(I)LZf/d;

    move-result-object v4

    invoke-interface {v3}, LZf/d;->w0()I

    move-result v5

    invoke-interface {v4}, LZf/d;->w0()I

    move-result v6

    invoke-interface {v3}, LZf/d;->Q()I

    move-result v3

    invoke-interface {v4}, LZf/d;->Q()I

    move-result v4

    invoke-virtual {p0, v5, v3, v6, v4}, Linet/ipaddr/b$a;->k(IIII)I

    move-result v3

    if-eqz v3, :cond_0

    return v3

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return v1
.end method
