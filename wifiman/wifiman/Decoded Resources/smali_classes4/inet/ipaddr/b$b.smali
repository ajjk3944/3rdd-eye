.class public Linet/ipaddr/b$b;
.super Linet/ipaddr/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Linet/ipaddr/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field private final b:Z

.field private final c:Z


# direct methods
.method public constructor <init>(ZZ)V
    .locals 1

    const/4 p1, 0x1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, p2, v0}, Linet/ipaddr/b$b;-><init>(ZZZ)V

    return-void
.end method

.method public constructor <init>(ZZZ)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Linet/ipaddr/b;-><init>(Z)V

    .line 3
    iput-boolean p2, p0, Linet/ipaddr/b$b;->b:Z

    .line 4
    iput-boolean p3, p0, Linet/ipaddr/b$b;->c:Z

    return-void
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
    .locals 6

    invoke-interface {p1}, Lag/g;->v0()I

    move-result v0

    invoke-interface {p2}, Lag/g;->v0()I

    move-result v1

    sub-int/2addr v0, v1

    if-eqz v0, :cond_0

    return v0

    :cond_0
    iget-boolean v0, p0, Linet/ipaddr/b$b;->b:Z

    :cond_1
    invoke-interface {p1}, LZf/e;->Z()I

    move-result v1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_5

    invoke-interface {p1, v3}, LZf/e;->q(I)LZf/d;

    move-result-object v4

    invoke-interface {p2, v3}, LZf/e;->q(I)LZf/d;

    move-result-object v5

    if-eqz v0, :cond_2

    invoke-interface {v4}, LZf/d;->w0()I

    move-result v4

    invoke-interface {v5}, LZf/d;->w0()I

    move-result v5

    :goto_1
    sub-int/2addr v4, v5

    goto :goto_2

    :cond_2
    invoke-interface {v4}, LZf/d;->Q()I

    move-result v4

    invoke-interface {v5}, LZf/d;->Q()I

    move-result v5

    goto :goto_1

    :goto_2
    if-eqz v4, :cond_4

    iget-boolean p1, p0, Linet/ipaddr/b$b;->c:Z

    if-eqz p1, :cond_3

    iget-boolean p1, p0, Linet/ipaddr/b$b;->b:Z

    if-eq v0, p1, :cond_3

    neg-int p1, v4

    return p1

    :cond_3
    return v4

    :cond_4
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_5
    xor-int/lit8 v0, v0, 0x1

    iget-boolean v1, p0, Linet/ipaddr/b$b;->b:Z

    if-ne v0, v1, :cond_1

    return v2
.end method

.method protected j(Lag/e;Lag/e;)I
    .locals 31

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    invoke-interface/range {p1 .. p1}, Lag/e;->f()I

    move-result v3

    invoke-interface/range {p2 .. p2}, Lag/e;->f()I

    move-result v4

    sub-int/2addr v3, v4

    if-eqz v3, :cond_0

    return v3

    :cond_0
    iget-boolean v3, v0, Linet/ipaddr/b;->a:Z

    if-nez v3, :cond_1

    invoke-interface/range {p1 .. p1}, Lag/g;->A0()Z

    move-result v3

    if-nez v3, :cond_1

    invoke-interface/range {p2 .. p2}, Lag/g;->A0()Z

    move-result v3

    if-eqz v3, :cond_2

    :cond_1
    invoke-static/range {p1 .. p2}, Linet/ipaddr/b;->h(Lag/e;Lag/e;)I

    move-result v3

    if-eqz v3, :cond_2

    return v3

    :cond_2
    iget-boolean v3, v0, Linet/ipaddr/b$b;->b:Z

    instance-of v4, v1, Lbg/d;

    if-eqz v4, :cond_3

    instance-of v4, v2, Lbg/d;

    if-eqz v4, :cond_3

    move-object v4, v1

    check-cast v4, Lbg/d;

    move-object v5, v2

    check-cast v5, Lbg/d;

    goto :goto_0

    :cond_3
    const/4 v4, 0x0

    move-object v5, v4

    :goto_0
    invoke-interface/range {p1 .. p1}, Lag/g;->v0()I

    move-result v6

    invoke-interface/range {p2 .. p2}, Lag/g;->v0()I

    move-result v7

    new-array v6, v6, [B

    new-array v7, v7, [B

    :cond_4
    const/4 v10, 0x0

    move v11, v10

    move v12, v11

    move v13, v12

    move v14, v13

    move v15, v14

    move/from16 v16, v15

    move/from16 v17, v16

    move/from16 v18, v17

    move/from16 v19, v18

    move/from16 v20, v19

    const-wide/16 v21, 0x0

    const-wide/16 v23, 0x0

    :goto_1
    invoke-interface/range {p1 .. p1}, Lcg/b;->H()I

    move-result v8

    if-lt v11, v8, :cond_6

    invoke-interface/range {p2 .. p2}, Lcg/b;->H()I

    move-result v8

    if-ge v12, v8, :cond_5

    goto :goto_2

    :cond_5
    xor-int/lit8 v3, v3, 0x1

    iget-boolean v8, v0, Linet/ipaddr/b$b;->b:Z

    if-ne v3, v8, :cond_4

    return v10

    :cond_6
    :goto_2
    if-eqz v4, :cond_b

    if-nez v13, :cond_8

    add-int/lit8 v8, v11, 0x1

    invoke-virtual {v4, v11}, Lbg/d;->m1(I)Lbg/b;

    move-result-object v9

    invoke-interface {v9}, Lag/g;->f()I

    move-result v13

    if-eqz v3, :cond_7

    invoke-virtual {v9}, Lbg/b;->a2()J

    move-result-wide v21

    goto :goto_3

    :cond_7
    invoke-virtual {v9}, Lbg/b;->W1()J

    move-result-wide v21

    :goto_3
    move v11, v8

    :cond_8
    if-nez v15, :cond_a

    add-int/lit8 v8, v12, 0x1

    invoke-virtual {v5, v12}, Lbg/d;->m1(I)Lbg/b;

    move-result-object v9

    invoke-interface {v9}, Lag/g;->f()I

    move-result v15

    if-eqz v3, :cond_9

    invoke-virtual {v9}, Lbg/b;->a2()J

    move-result-wide v23

    goto :goto_4

    :cond_9
    invoke-virtual {v9}, Lbg/b;->W1()J

    move-result-wide v23

    :goto_4
    move-object/from16 v28, v4

    move-object/from16 v29, v5

    move v12, v8

    goto/16 :goto_e

    :cond_a
    move-object/from16 v28, v4

    move-object/from16 v29, v5

    goto/16 :goto_e

    :cond_b
    const/4 v9, 0x7

    const/16 v25, 0x8

    if-nez v13, :cond_11

    if-nez v14, :cond_d

    add-int/lit8 v13, v11, 0x1

    invoke-interface {v1, v11}, Lag/e;->k(I)Lag/f;

    move-result-object v11

    if-eqz v3, :cond_c

    invoke-interface {v11, v6}, Lag/g;->G([B)[B

    move-result-object v6

    goto :goto_5

    :cond_c
    invoke-interface {v11, v6}, Lag/g;->R0([B)[B

    move-result-object v6

    :goto_5
    invoke-interface {v11}, Lag/g;->f()I

    move-result v14

    invoke-interface {v11}, Lag/g;->v0()I

    move-result v11

    move/from16 v17, v10

    move/from16 v30, v14

    move v14, v11

    move v11, v13

    move/from16 v13, v30

    goto :goto_6

    :cond_d
    move/from16 v13, v16

    :goto_6
    if-ge v9, v14, :cond_f

    add-int/lit8 v16, v13, -0x38

    add-int/lit8 v14, v14, -0x7

    move v13, v9

    const-wide/16 v21, 0x0

    :goto_7
    add-int/lit8 v26, v13, -0x1

    if-lez v13, :cond_e

    shl-long v21, v21, v25

    add-int/lit8 v13, v17, 0x1

    aget-byte v8, v6, v17

    move/from16 v27, v11

    int-to-long v10, v8

    or-long v21, v21, v10

    move/from16 v17, v13

    move/from16 v13, v26

    move/from16 v11, v27

    const/4 v10, 0x0

    goto :goto_7

    :cond_e
    move/from16 v27, v11

    move-object/from16 v28, v4

    move-object/from16 v29, v5

    const/16 v13, 0x38

    goto :goto_9

    :cond_f
    move/from16 v27, v11

    add-int/lit8 v14, v14, -0x1

    shl-int/lit8 v8, v14, 0x3

    sub-int v8, v13, v8

    const-wide/16 v10, 0x0

    :goto_8
    add-int/lit8 v16, v14, -0x1

    if-lez v14, :cond_10

    shl-long v10, v10, v25

    add-int/lit8 v14, v17, 0x1

    aget-byte v9, v6, v17

    move-object/from16 v28, v4

    move-object/from16 v29, v5

    int-to-long v4, v9

    or-long/2addr v10, v4

    move/from16 v17, v14

    move/from16 v14, v16

    move-object/from16 v4, v28

    move-object/from16 v5, v29

    const/4 v9, 0x7

    goto :goto_8

    :cond_10
    move-object/from16 v28, v4

    move-object/from16 v29, v5

    shl-long v4, v10, v8

    add-int/lit8 v9, v17, 0x1

    aget-byte v10, v6, v17

    rsub-int/lit8 v8, v8, 0x8

    ushr-int v8, v10, v8

    int-to-long v10, v8

    or-long v21, v4, v10

    move/from16 v17, v9

    move/from16 v11, v27

    const/4 v14, 0x0

    const/16 v16, 0x0

    goto :goto_9

    :cond_11
    move-object/from16 v28, v4

    move-object/from16 v29, v5

    :goto_9
    if-nez v15, :cond_17

    if-nez v19, :cond_13

    add-int/lit8 v4, v12, 0x1

    invoke-interface {v2, v12}, Lag/e;->k(I)Lag/f;

    move-result-object v5

    if-eqz v3, :cond_12

    invoke-interface {v5, v7}, Lag/g;->G([B)[B

    move-result-object v7

    goto :goto_a

    :cond_12
    invoke-interface {v5, v7}, Lag/g;->R0([B)[B

    move-result-object v7

    :goto_a
    invoke-interface {v5}, Lag/g;->f()I

    move-result v8

    invoke-interface {v5}, Lag/g;->v0()I

    move-result v19

    move v12, v4

    move v15, v8

    move/from16 v4, v19

    const/4 v5, 0x7

    const/16 v20, 0x0

    goto :goto_b

    :cond_13
    move/from16 v15, v18

    move/from16 v4, v19

    const/4 v5, 0x7

    :goto_b
    if-ge v5, v4, :cond_15

    add-int/lit8 v18, v15, -0x38

    add-int/lit8 v19, v4, -0x7

    move v9, v5

    const-wide/16 v23, 0x0

    :goto_c
    add-int/lit8 v4, v9, -0x1

    if-lez v9, :cond_14

    shl-long v8, v23, v25

    add-int/lit8 v5, v20, 0x1

    aget-byte v10, v7, v20

    int-to-long v1, v10

    or-long v23, v8, v1

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move v9, v4

    move/from16 v20, v5

    goto :goto_c

    :cond_14
    const/16 v15, 0x38

    goto :goto_e

    :cond_15
    add-int/lit8 v4, v4, -0x1

    shl-int/lit8 v1, v4, 0x3

    sub-int v1, v15, v1

    const-wide/16 v8, 0x0

    :goto_d
    add-int/lit8 v2, v4, -0x1

    if-lez v4, :cond_16

    shl-long v4, v8, v25

    add-int/lit8 v8, v20, 0x1

    aget-byte v9, v7, v20

    int-to-long v9, v9

    or-long/2addr v4, v9

    move/from16 v20, v8

    move-wide v8, v4

    move v4, v2

    goto :goto_d

    :cond_16
    shl-long v4, v8, v1

    add-int/lit8 v2, v20, 0x1

    aget-byte v8, v7, v20

    rsub-int/lit8 v25, v1, 0x8

    ushr-int v1, v8, v25

    int-to-long v8, v1

    or-long v23, v4, v8

    move/from16 v20, v2

    const/16 v18, 0x0

    const/16 v19, 0x0

    :cond_17
    :goto_e
    if-ne v15, v13, :cond_18

    move-wide/from16 v1, v21

    move-wide/from16 v4, v23

    const/4 v13, 0x0

    :goto_f
    const/4 v15, 0x0

    goto :goto_10

    :cond_18
    sub-int/2addr v15, v13

    const-wide/16 v1, -0x1

    if-lez v15, :cond_19

    shr-long v4, v23, v15

    shl-long/2addr v1, v15

    not-long v1, v1

    and-long v1, v23, v1

    move-wide/from16 v23, v4

    const/4 v13, 0x0

    move-wide v4, v1

    move-wide/from16 v1, v21

    goto :goto_10

    :cond_19
    neg-int v4, v15

    shr-long v8, v21, v4

    shl-long/2addr v1, v4

    not-long v1, v1

    and-long v1, v21, v1

    move v13, v4

    move-wide/from16 v21, v8

    move-wide/from16 v4, v23

    goto :goto_f

    :goto_10
    sub-long v8, v21, v23

    const-wide/16 v21, 0x0

    cmp-long v10, v8, v21

    if-eqz v10, :cond_1b

    iget-boolean v1, v0, Linet/ipaddr/b$b;->c:Z

    if-eqz v1, :cond_1a

    iget-boolean v1, v0, Linet/ipaddr/b$b;->b:Z

    if-eq v3, v1, :cond_1a

    neg-long v8, v8

    :cond_1a
    invoke-static {v8, v9}, Linet/ipaddr/b;->n(J)I

    move-result v1

    return v1

    :cond_1b
    move-wide/from16 v21, v1

    move-wide/from16 v23, v4

    move-object/from16 v4, v28

    move-object/from16 v5, v29

    const/4 v10, 0x0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    goto/16 :goto_1
.end method

.method protected k(IIII)I
    .locals 1

    iget-boolean v0, p0, Linet/ipaddr/b$b;->b:Z

    if-eqz v0, :cond_0

    sub-int/2addr p1, p3

    if-nez p1, :cond_2

    sub-int p1, p2, p4

    iget-boolean p2, p0, Linet/ipaddr/b$b;->c:Z

    if-eqz p2, :cond_2

    :goto_0
    neg-int p1, p1

    goto :goto_1

    :cond_0
    sub-int/2addr p2, p4

    if-nez p2, :cond_1

    sub-int/2addr p1, p3

    iget-boolean p2, p0, Linet/ipaddr/b$b;->c:Z

    if-eqz p2, :cond_2

    goto :goto_0

    :cond_1
    move p1, p2

    :cond_2
    :goto_1
    return p1
.end method

.method protected l(JJJJ)I
    .locals 3

    iget-boolean v0, p0, Linet/ipaddr/b$b;->b:Z

    const-wide/16 v1, 0x0

    if-eqz v0, :cond_0

    sub-long/2addr p1, p5

    cmp-long p5, p1, v1

    if-nez p5, :cond_2

    sub-long p1, p3, p7

    iget-boolean p3, p0, Linet/ipaddr/b$b;->c:Z

    if-eqz p3, :cond_2

    :goto_0
    neg-long p1, p1

    goto :goto_1

    :cond_0
    sub-long/2addr p3, p7

    cmp-long p7, p3, v1

    if-nez p7, :cond_1

    sub-long/2addr p1, p5

    iget-boolean p3, p0, Linet/ipaddr/b$b;->c:Z

    if-eqz p3, :cond_2

    goto :goto_0

    :cond_1
    move-wide p1, p3

    :cond_2
    :goto_1
    invoke-static {p1, p2}, Linet/ipaddr/b;->n(J)I

    move-result p1

    return p1
.end method

.method protected m(Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;)I
    .locals 1

    iget-boolean v0, p0, Linet/ipaddr/b$b;->b:Z

    if-eqz v0, :cond_0

    invoke-virtual {p1, p3}, Ljava/math/BigInteger;->compareTo(Ljava/math/BigInteger;)I

    move-result p1

    if-nez p1, :cond_2

    invoke-virtual {p2, p4}, Ljava/math/BigInteger;->compareTo(Ljava/math/BigInteger;)I

    move-result p1

    iget-boolean p2, p0, Linet/ipaddr/b$b;->c:Z

    if-eqz p2, :cond_2

    :goto_0
    neg-int p1, p1

    goto :goto_1

    :cond_0
    invoke-virtual {p2, p4}, Ljava/math/BigInteger;->compareTo(Ljava/math/BigInteger;)I

    move-result p2

    if-nez p2, :cond_1

    invoke-virtual {p1, p3}, Ljava/math/BigInteger;->compareTo(Ljava/math/BigInteger;)I

    move-result p1

    iget-boolean p2, p0, Linet/ipaddr/b$b;->c:Z

    if-eqz p2, :cond_2

    goto :goto_0

    :cond_1
    move p1, p2

    :cond_2
    :goto_1
    int-to-long p1, p1

    invoke-static {p1, p2}, Linet/ipaddr/b;->n(J)I

    move-result p1

    return p1
.end method
