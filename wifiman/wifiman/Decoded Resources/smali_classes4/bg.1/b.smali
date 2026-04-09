.class public abstract Lbg/b;
.super Lag/b;
.source "SourceFile"


# direct methods
.method protected constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lag/b;-><init>()V

    return-void
.end method

.method private O1(IJI)I
    .locals 0

    if-gez p1, :cond_0

    invoke-static {p2, p3, p4}, Lag/b;->d1(JI)I

    move-result p1

    invoke-virtual {p0, p4}, Lbg/b;->s(I)I

    move-result p2

    sub-int/2addr p2, p1

    const/4 p1, 0x0

    invoke-static {p1, p2}, Ljava/lang/Math;->max(II)I

    move-result p1

    :cond_0
    return p1
.end method

.method private static P1(JIIZCLjava/lang/String;Ljava/lang/StringBuilder;)V
    .locals 18

    move-wide/from16 v0, p0

    move/from16 v2, p2

    move-object/from16 v3, p6

    move-object/from16 v4, p7

    const/4 v5, 0x2

    if-lt v2, v5, :cond_b

    const/16 v5, 0x55

    if-gt v2, v5, :cond_b

    const-wide/32 v5, 0x7fffffff

    cmp-long v7, v0, v5

    if-gtz v7, :cond_0

    const/4 v7, 0x1

    goto :goto_0

    :cond_0
    const/4 v7, 0x0

    :goto_0
    if-eqz v7, :cond_1

    long-to-int v9, v0

    goto :goto_1

    :cond_1
    move v9, v2

    :goto_1
    if-eqz p4, :cond_2

    sget-object v10, Lag/b;->l:[C

    goto :goto_2

    :cond_2
    sget-object v10, Lag/b;->h:[C

    :goto_2
    invoke-virtual/range {p6 .. p6}, Ljava/lang/String;->length()I

    move-result v11

    move v12, v9

    move v9, v7

    move/from16 v7, p3

    :goto_3
    if-lt v12, v2, :cond_8

    if-eqz v9, :cond_4

    div-int v13, v12, v2

    if-lez v7, :cond_3

    add-int/lit8 v7, v7, -0x1

    move v12, v13

    goto :goto_3

    :cond_3
    rem-int/2addr v12, v2

    move v8, v12

    move v12, v13

    goto :goto_5

    :cond_4
    int-to-long v13, v2

    move/from16 p0, v9

    div-long v8, v0, v13

    cmp-long v15, v8, v5

    if-gtz v15, :cond_5

    long-to-int v12, v8

    move v15, v12

    const/4 v12, 0x1

    goto :goto_4

    :cond_5
    move v15, v12

    move/from16 v12, p0

    :goto_4
    if-lez v7, :cond_6

    add-int/lit8 v7, v7, -0x1

    move-wide v0, v8

    move v9, v12

    move v12, v15

    goto :goto_3

    :cond_6
    rem-long/2addr v0, v13

    long-to-int v0, v0

    move-wide/from16 v16, v8

    move v8, v0

    move-wide/from16 v0, v16

    move v9, v12

    move v12, v15

    :goto_5
    if-lez v11, :cond_7

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_7
    aget-char v8, v10, v8

    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move/from16 v8, p5

    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_3

    :cond_8
    if-nez v7, :cond_a

    if-lez v11, :cond_9

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_9
    aget-char v0, v10, v12

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_a
    return-void

    :cond_b
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0
.end method

.method private static Q1(JJLjava/lang/String;Ljava/lang/String;IZCZLjava/lang/String;Ljava/lang/StringBuilder;)V
    .locals 25

    move-wide/from16 v0, p2

    move-object/from16 v2, p4

    move-object/from16 v3, p5

    move/from16 v4, p6

    move-object/from16 v5, p10

    move-object/from16 v6, p11

    const/4 v7, 0x2

    if-lt v4, v7, :cond_13

    const/16 v7, 0x55

    if-gt v4, v7, :cond_13

    if-eqz p7, :cond_0

    sget-object v7, Lag/b;->l:[C

    goto :goto_0

    :cond_0
    sget-object v7, Lag/b;->h:[C

    :goto_0
    const-wide/32 v8, 0x7fffffff

    cmp-long v10, v0, v8

    if-gtz v10, :cond_1

    const/4 v10, 0x1

    goto :goto_1

    :cond_1
    const/4 v10, 0x0

    :goto_1
    if-eqz v10, :cond_2

    long-to-int v13, v0

    move-wide/from16 v14, p0

    long-to-int v11, v14

    goto :goto_2

    :cond_2
    move-wide/from16 v14, p0

    move v11, v4

    move v13, v11

    :goto_2
    invoke-virtual/range {p10 .. p10}, Ljava/lang/String;->length()I

    move-result v16

    const/16 v17, 0x1

    :goto_3
    if-eqz v10, :cond_4

    rem-int v18, v13, v4

    div-int v19, v13, v4

    if-ne v13, v11, :cond_3

    move/from16 v13, v18

    move/from16 v11, v19

    goto :goto_4

    :cond_3
    rem-int v13, v11, v4

    div-int/2addr v11, v4

    :goto_4
    move-wide/from16 v22, v0

    move-wide v0, v8

    move-wide/from16 v20, v14

    move/from16 v8, v18

    goto :goto_8

    :cond_4
    move/from16 p0, v13

    int-to-long v12, v4

    rem-long v8, v0, v12

    long-to-int v8, v8

    move/from16 p1, v8

    div-long v8, v0, v12

    cmp-long v0, v0, v14

    if-nez v0, :cond_5

    move/from16 v13, p1

    move-wide v14, v8

    :goto_5
    const-wide/32 v0, 0x7fffffff

    goto :goto_6

    :cond_5
    rem-long v0, v14, v12

    long-to-int v0, v0

    div-long/2addr v14, v12

    move v13, v0

    goto :goto_5

    :goto_6
    cmp-long v12, v8, v0

    if-gtz v12, :cond_6

    long-to-int v10, v8

    long-to-int v11, v14

    move-wide/from16 v22, v8

    move/from16 v19, v10

    move-wide/from16 v20, v14

    const/4 v10, 0x1

    :goto_7
    move/from16 v8, p1

    goto :goto_8

    :cond_6
    move/from16 v19, p0

    move-wide/from16 v22, v8

    move-wide/from16 v20, v14

    goto :goto_7

    :goto_8
    if-ne v13, v8, :cond_a

    if-eqz p9, :cond_8

    if-lez v16, :cond_7

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_7
    aget-char v8, v7, v13

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_a

    :cond_8
    aget-char v8, v7, v13

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v8, v16, -0x1

    :goto_9
    if-ltz v8, :cond_9

    invoke-virtual {v5, v8}, Ljava/lang/String;->charAt(I)C

    move-result v9

    invoke-virtual {v6, v9}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v8, v8, -0x1

    goto :goto_9

    :cond_9
    :goto_a
    const/4 v12, 0x1

    const/16 v17, 0x0

    goto :goto_f

    :cond_a
    if-eqz v17, :cond_12

    if-nez v13, :cond_b

    add-int/lit8 v9, v4, -0x1

    if-ne v8, v9, :cond_b

    const/4 v9, 0x1

    goto :goto_b

    :cond_b
    const/4 v9, 0x0

    :goto_b
    if-eqz v9, :cond_d

    if-eqz v3, :cond_d

    if-eqz p9, :cond_c

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v12, 0x1

    goto :goto_e

    :cond_c
    invoke-virtual/range {p5 .. p5}, Ljava/lang/String;->length()I

    move-result v8

    const/4 v12, 0x1

    sub-int/2addr v8, v12

    :goto_c
    if-ltz v8, :cond_10

    invoke-virtual {v3, v8}, Ljava/lang/String;->charAt(I)C

    move-result v13

    invoke-virtual {v6, v13}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v8, v8, -0x1

    goto :goto_c

    :cond_d
    const/4 v12, 0x1

    if-eqz p9, :cond_f

    if-lez v16, :cond_e

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_e
    aget-char v13, v7, v13

    invoke-virtual {v6, v13}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    aget-char v8, v7, v8

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_e

    :cond_f
    aget-char v8, v7, v8

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    aget-char v8, v7, v13

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v8, v16, -0x1

    :goto_d
    if-ltz v8, :cond_10

    invoke-virtual {v5, v8}, Ljava/lang/String;->charAt(I)C

    move-result v13

    invoke-virtual {v6, v13}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v8, v8, -0x1

    goto :goto_d

    :cond_10
    :goto_e
    move/from16 v17, v9

    :goto_f
    if-nez v19, :cond_11

    return-void

    :cond_11
    move/from16 v8, p8

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-wide v8, v0

    move/from16 v13, v19

    move-wide/from16 v14, v20

    move-wide/from16 v0, v22

    goto/16 :goto_3

    :cond_12
    new-instance v0, Linet/ipaddr/IncompatibleAddressException;

    const-string v24, "ipaddress.error.splitMismatch"

    move-object/from16 v19, v0

    invoke-direct/range {v19 .. v24}, Linet/ipaddr/IncompatibleAddressException;-><init>(JJLjava/lang/String;)V

    throw v0

    :cond_13
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0
.end method

.method private R1(I)Ljava/lang/String;
    .locals 10

    new-instance v9, Ljava/lang/StringBuilder;

    const/16 v0, 0x14

    invoke-direct {v9, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    sget-object v1, Linet/ipaddr/a;->c:Ljava/lang/String;

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const-string v4, ""

    move-object v0, p0

    move v5, p1

    move-object v8, v9

    invoke-virtual/range {v0 .. v8}, Lag/b;->q1(Ljava/lang/String;IILjava/lang/String;IZZLjava/lang/StringBuilder;)I

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private static S1(IJJJ)I
    .locals 8

    const/4 v0, 0x1

    move v1, p0

    :goto_0
    int-to-long v2, v1

    rem-long v4, p1, v2

    const-wide/16 v6, 0x0

    cmp-long v4, v4, v6

    if-nez v4, :cond_2

    div-long v4, p5, v2

    div-long v6, p3, v2

    cmp-long v4, v4, v6

    if-nez v4, :cond_0

    rem-long v4, p5, v2

    goto :goto_1

    :cond_0
    add-int/lit8 v4, v1, -0x1

    int-to-long v4, v4

    :goto_1
    rem-long v2, p3, v2

    cmp-long v4, v2, v4

    if-nez v4, :cond_2

    sub-long v2, p3, v2

    cmp-long v2, v2, p1

    if-nez v2, :cond_1

    return v0

    :cond_1
    add-int/lit8 v0, v0, 0x1

    mul-int/2addr v1, p0

    goto :goto_0

    :cond_2
    const/4 p0, 0x0

    return p0
.end method

.method protected static b2(LZf/d;IIILinet/ipaddr/c$a;Ljava/lang/Integer;ZZ)Ljava/util/Iterator;
    .locals 14

    if-eqz p6, :cond_0

    invoke-virtual/range {p5 .. p5}, Ljava/lang/Integer;->intValue()I

    move-result v0

    sub-int v0, p3, v0

    const/4 v1, -0x1

    shl-int/2addr v1, v0

    not-int v2, v1

    move v4, v0

    move v9, v1

    move v11, v2

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    move v4, v0

    move v9, v4

    move v11, v9

    :goto_0
    if-eqz p0, :cond_1

    invoke-interface {p0}, Lag/g;->A0()Z

    move-result v0

    if-nez v0, :cond_1

    new-instance v0, Lbg/b$a;

    move-object v5, v0

    move/from16 v6, p7

    move-object/from16 v7, p4

    move v8, p1

    move/from16 v10, p2

    move-object/from16 v12, p5

    move-object v13, p0

    invoke-direct/range {v5 .. v13}, Lbg/b$a;-><init>(ZLinet/ipaddr/c$a;IIIILjava/lang/Integer;LZf/d;)V

    return-object v0

    :cond_1
    if-eqz p6, :cond_3

    if-eqz p7, :cond_2

    new-instance v0, Lbg/b$b;

    move-object v1, v0

    move v2, p1

    move/from16 v3, p2

    move-object/from16 v5, p4

    move v6, v11

    move-object/from16 v7, p5

    invoke-direct/range {v1 .. v7}, Lbg/b$b;-><init>(IIILinet/ipaddr/c$a;ILjava/lang/Integer;)V

    return-object v0

    :cond_2
    new-instance v0, Lbg/b$c;

    move-object v1, v0

    move v2, p1

    move/from16 v3, p2

    move v5, v11

    move-object/from16 v6, p4

    move-object/from16 v7, p5

    invoke-direct/range {v1 .. v7}, Lbg/b$c;-><init>(IIIILinet/ipaddr/c$a;Ljava/lang/Integer;)V

    return-object v0

    :cond_3
    new-instance v0, Lbg/b$d;

    move v1, p1

    move/from16 v2, p2

    move-object/from16 v3, p4

    move-object/from16 v4, p5

    invoke-direct {v0, p1, v2, v3, v4}, Lbg/b$d;-><init>(IILinet/ipaddr/c$a;Ljava/lang/Integer;)V

    return-object v0
.end method

.method protected static c2(LZf/d;Linet/ipaddr/c$a;Ljava/lang/Integer;ZZ)Ljava/util/Iterator;
    .locals 8

    invoke-interface {p0}, LZf/d;->Q()I

    move-result v1

    invoke-interface {p0}, LZf/d;->w0()I

    move-result v2

    invoke-interface {p0}, Lag/g;->f()I

    move-result v3

    move-object v0, p0

    move-object v4, p1

    move-object v5, p2

    move v6, p3

    move v7, p4

    invoke-static/range {v0 .. v7}, Lbg/b;->b2(LZf/d;IIILinet/ipaddr/c$a;Ljava/lang/Integer;ZZ)Ljava/util/Iterator;

    move-result-object p0

    return-object p0
.end method

.method protected static d2(JJJJ)Linet/ipaddr/format/validate/r$j;
    .locals 0

    invoke-static/range {p0 .. p7}, Linet/ipaddr/format/validate/r;->o2(JJJJ)Linet/ipaddr/format/validate/r$j;

    move-result-object p0

    return-object p0
.end method

.method static g2(JJJJJ)Z
    .locals 0

    and-long/2addr p6, p0

    cmp-long p0, p0, p6

    if-nez p0, :cond_0

    or-long p0, p2, p8

    cmp-long p0, p4, p0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method protected static h2(JI)Ljava/lang/String;
    .locals 6

    const/4 v0, 0x2

    if-lt p2, v0, :cond_e

    const/16 v1, 0x55

    if-gt p2, v1, :cond_e

    const-wide/16 v1, 0x0

    cmp-long v1, p0, v1

    if-ltz v1, :cond_e

    if-nez v1, :cond_0

    const-string p0, "0"

    return-object p0

    :cond_0
    const-wide/16 v1, 0x1

    cmp-long v1, p0, v1

    if-nez v1, :cond_1

    const-string p0, "1"

    return-object p0

    :cond_1
    const/16 v1, 0xa

    const/4 v2, 0x3

    const/4 v3, 0x1

    if-ne p2, v1, :cond_6

    const-wide/16 v4, 0xa

    cmp-long v1, p0, v4

    if-gez v1, :cond_2

    sget-object p2, Lag/b;->h:[C

    long-to-int p0, p0

    invoke-static {p2, p0, v3}, Ljava/lang/String;->valueOf([CII)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_2
    const-wide/16 v3, 0x64

    cmp-long v1, p0, v3

    if-gez v1, :cond_3

    long-to-int p0, p0

    goto :goto_0

    :cond_3
    const-wide/16 v0, 0x3e8

    cmp-long v0, p0, v0

    if-gez v0, :cond_5

    long-to-int p0, p0

    move v0, v2

    :goto_0
    new-array v1, v0, [C

    sget-object v2, Lag/b;->h:[C

    :goto_1
    const p1, 0xcccd

    mul-int/2addr p1, p0

    ushr-int/lit8 p1, p1, 0x13

    shl-int/lit8 p2, p1, 0x3

    shl-int/lit8 v3, p1, 0x1

    add-int/2addr p2, v3

    sub-int/2addr p0, p2

    add-int/lit8 v0, v0, -0x1

    aget-char p0, v2, p0

    aput-char p0, v1, v0

    if-nez p1, :cond_4

    new-instance p0, Ljava/lang/String;

    invoke-direct {p0, v1}, Ljava/lang/String;-><init>([C)V

    return-object p0

    :cond_4
    move p0, p1

    goto :goto_1

    :cond_5
    invoke-static {p0, p1, p2}, Ljava/lang/Long;->toString(JI)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_6
    const/16 v1, 0x10

    if-ne p2, v1, :cond_d

    const-wide/16 v4, 0x10

    cmp-long v1, p0, v4

    if-gez v1, :cond_7

    sget-object p2, Lag/b;->h:[C

    long-to-int p0, p0

    invoke-static {p2, p0, v3}, Ljava/lang/String;->valueOf([CII)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_7
    const-wide/16 v3, 0x100

    cmp-long v1, p0, v3

    if-gez v1, :cond_8

    long-to-int p0, p0

    goto :goto_2

    :cond_8
    const-wide/16 v0, 0x1000

    cmp-long v0, p0, v0

    if-gez v0, :cond_9

    long-to-int p0, p0

    move v0, v2

    goto :goto_2

    :cond_9
    const-wide/32 v0, 0x10000

    cmp-long v0, p0, v0

    if-gez v0, :cond_c

    const-wide/32 v0, 0xffff

    cmp-long p2, p0, v0

    if-nez p2, :cond_a

    const-string p0, "ffff"

    return-object p0

    :cond_a
    long-to-int p0, p0

    const/4 v0, 0x4

    :goto_2
    new-array v1, v0, [C

    sget-object v2, Lag/b;->h:[C

    :goto_3
    ushr-int/lit8 p1, p0, 0x4

    shl-int/lit8 p2, p1, 0x4

    sub-int/2addr p0, p2

    add-int/lit8 v0, v0, -0x1

    aget-char p0, v2, p0

    aput-char p0, v1, v0

    if-nez p1, :cond_b

    new-instance p0, Ljava/lang/String;

    invoke-direct {p0, v1}, Ljava/lang/String;-><init>([C)V

    return-object p0

    :cond_b
    move p0, p1

    goto :goto_3

    :cond_c
    invoke-static {p0, p1, p2}, Ljava/lang/Long;->toString(JI)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_d
    invoke-static {p0, p1, p2}, Ljava/lang/Long;->toString(JI)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_e
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p0
.end method

.method private static i2(JIIZCZLjava/lang/String;Ljava/lang/StringBuilder;)V
    .locals 10

    move-object/from16 v8, p8

    invoke-virtual/range {p8 .. p8}, Ljava/lang/StringBuilder;->length()I

    move-result v9

    move-wide v0, p0

    move v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    move-object/from16 v6, p7

    move-object/from16 v7, p8

    invoke-static/range {v0 .. v7}, Lbg/b;->P1(JIIZCLjava/lang/String;Ljava/lang/StringBuilder;)V

    if-nez p6, :cond_0

    invoke-virtual/range {p8 .. p8}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual/range {p7 .. p7}, Ljava/lang/String;->length()I

    move-result v1

    add-int/2addr v9, v1

    :goto_0
    if-ge v9, v0, :cond_0

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->charAt(I)C

    move-result v2

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->charAt(I)C

    move-result v3

    invoke-virtual {v8, v9, v3}, Ljava/lang/StringBuilder;->setCharAt(IC)V

    invoke-virtual {v8, v0, v2}, Ljava/lang/StringBuilder;->setCharAt(IC)V

    add-int/lit8 v9, v9, 0x2

    add-int/lit8 v0, v0, -0x2

    add-int/2addr v9, v1

    sub-int/2addr v0, v1

    goto :goto_0

    :cond_0
    return-void
.end method

.method private static j2(JJLjava/lang/String;Ljava/lang/String;IZCZLjava/lang/String;Ljava/lang/StringBuilder;)V
    .locals 1

    invoke-virtual {p11}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    invoke-static/range {p0 .. p11}, Lbg/b;->Q1(JJLjava/lang/String;Ljava/lang/String;IZCZLjava/lang/String;Ljava/lang/StringBuilder;)V

    if-nez p9, :cond_0

    invoke-virtual {p11}, Ljava/lang/StringBuilder;->length()I

    move-result p0

    add-int/lit8 p0, p0, -0x1

    :goto_0
    if-ge v0, p0, :cond_0

    invoke-virtual {p11, v0}, Ljava/lang/StringBuilder;->charAt(I)C

    move-result p1

    add-int/lit8 p2, v0, 0x1

    invoke-virtual {p11, p0}, Ljava/lang/StringBuilder;->charAt(I)C

    move-result p3

    invoke-virtual {p11, v0, p3}, Ljava/lang/StringBuilder;->setCharAt(IC)V

    add-int/lit8 p3, p0, -0x1

    invoke-virtual {p11, p0, p1}, Ljava/lang/StringBuilder;->setCharAt(IC)V

    move v0, p2

    move p0, p3

    goto :goto_0

    :cond_0
    return-void
.end method

.method private static k2(JJLjava/lang/String;Ljava/lang/String;IIZCZLjava/lang/String;)I
    .locals 3

    const/4 p4, 0x2

    if-lt p7, p4, :cond_4

    const/16 p8, 0x55

    if-gt p7, p8, :cond_4

    invoke-virtual {p11}, Ljava/lang/String;->length()I

    move-result p8

    const/4 p9, -0x1

    :cond_0
    int-to-long p10, p7

    rem-long v0, p2, p10

    long-to-int v0, v0

    rem-long v1, p0, p10

    long-to-int v1, v1

    if-nez v1, :cond_1

    add-int/lit8 v1, p7, -0x1

    if-ne v0, v1, :cond_1

    invoke-virtual {p5}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    :goto_0
    add-int/2addr p9, v0

    goto :goto_1

    :cond_1
    shl-int/lit8 v0, p8, 0x1

    add-int/lit8 v0, v0, 0x4

    goto :goto_0

    :goto_1
    div-long/2addr p2, p10

    div-long/2addr p0, p10

    cmp-long p10, p2, p0

    if-nez p10, :cond_0

    const-wide/16 p0, 0x0

    cmp-long p0, p2, p0

    if-nez p0, :cond_2

    const/4 p0, 0x0

    goto :goto_2

    :cond_2
    invoke-static {p2, p3, p7}, Lag/b;->K1(JI)I

    move-result p0

    :goto_2
    add-int/2addr p0, p6

    if-lez p0, :cond_3

    add-int/2addr p8, p4

    mul-int/2addr p0, p8

    add-int/2addr p9, p0

    :cond_3
    return p9

    :cond_4
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p0
.end method


# virtual methods
.method public abstract A0()Z
.end method

.method protected B1(IZLjava/lang/StringBuilder;)V
    .locals 6

    invoke-virtual {p0}, Lbg/b;->a2()J

    move-result-wide v0

    const/4 v3, 0x0

    move v2, p1

    move v4, p2

    move-object v5, p3

    invoke-static/range {v0 .. v5}, Lag/b;->H1(JIIZLjava/lang/StringBuilder;)Ljava/lang/StringBuilder;

    return-void
.end method

.method protected C1(I)I
    .locals 2

    invoke-virtual {p0}, Lbg/b;->a2()J

    move-result-wide v0

    invoke-static {v0, v1, p1}, Lag/b;->K1(JI)I

    move-result p1

    return p1
.end method

.method public H0()Z
    .locals 1

    invoke-virtual {p0}, Lbg/b;->A0()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lbg/b;->O()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method protected J(II)I
    .locals 2

    invoke-virtual {p0}, Lbg/b;->W1()J

    move-result-wide v0

    invoke-direct {p0, p1, v0, v1, p2}, Lbg/b;->O1(IJI)I

    move-result p1

    return p1
.end method

.method public abstract L()Z
.end method

.method public abstract O()Z
.end method

.method public R()Ljava/math/BigInteger;
    .locals 2

    invoke-virtual {p0}, Lbg/b;->a2()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v0

    return-object v0
.end method

.method protected T1()Ljava/lang/String;
    .locals 3

    invoke-virtual {p0}, Lbg/b;->W1()J

    move-result-wide v0

    invoke-virtual {p0}, Lag/b;->b1()I

    move-result v2

    invoke-static {v0, v1, v2}, Lbg/b;->h2(JI)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected U1()Ljava/lang/String;
    .locals 6

    invoke-virtual {p0}, Lbg/b;->W1()J

    move-result-wide v1

    invoke-virtual {p0}, Lbg/b;->a2()J

    move-result-wide v3

    invoke-virtual {p0}, Lag/b;->b1()I

    move-result v5

    move-object v0, p0

    invoke-virtual/range {v0 .. v5}, Lbg/b;->V1(JJI)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected V1(JJI)Ljava/lang/String;
    .locals 20

    move-object/from16 v0, p0

    move-wide/from16 v1, p1

    move-wide/from16 v3, p3

    move/from16 v5, p5

    const/16 v6, 0xa

    const/16 v7, 0x2d

    const/4 v8, 0x2

    const/4 v9, 0x3

    const/4 v10, 0x1

    if-ne v5, v6, :cond_8

    const-wide/16 v11, 0xa

    cmp-long v6, v3, v11

    const-wide/16 v13, 0x3e8

    const-wide/16 v15, 0x64

    if-gez v6, :cond_0

    move v6, v10

    goto :goto_0

    :cond_0
    cmp-long v6, v3, v15

    if-gez v6, :cond_1

    move v6, v8

    goto :goto_0

    :cond_1
    cmp-long v6, v3, v13

    if-gez v6, :cond_7

    move v6, v9

    :goto_0
    long-to-int v3, v3

    cmp-long v4, v1, v11

    if-gez v4, :cond_2

    move v8, v10

    goto :goto_1

    :cond_2
    cmp-long v4, v1, v15

    if-gez v4, :cond_3

    goto :goto_1

    :cond_3
    cmp-long v4, v1, v13

    if-gez v4, :cond_6

    move v8, v9

    :goto_1
    long-to-int v1, v1

    add-int/lit8 v2, v8, 0x1

    add-int/2addr v6, v2

    new-array v2, v6, [C

    aput-char v7, v2, v8

    sget-object v4, Lag/b;->h:[C

    :goto_2
    const v5, 0xcccd

    mul-int v7, v1, v5

    ushr-int/lit8 v7, v7, 0x13

    shl-int/lit8 v9, v7, 0x3

    shl-int/lit8 v10, v7, 0x1

    add-int/2addr v9, v10

    sub-int/2addr v1, v9

    add-int/lit8 v8, v8, -0x1

    aget-char v1, v4, v1

    aput-char v1, v2, v8

    if-nez v7, :cond_5

    :goto_3
    mul-int v1, v3, v5

    ushr-int/lit8 v1, v1, 0x13

    shl-int/lit8 v7, v1, 0x3

    shl-int/lit8 v8, v1, 0x1

    add-int/2addr v7, v8

    sub-int/2addr v3, v7

    add-int/lit8 v6, v6, -0x1

    aget-char v3, v4, v3

    aput-char v3, v2, v6

    if-nez v1, :cond_4

    new-instance v1, Ljava/lang/String;

    invoke-direct {v1, v2}, Ljava/lang/String;-><init>([C)V

    return-object v1

    :cond_4
    move v3, v1

    goto :goto_3

    :cond_5
    move v1, v7

    goto :goto_2

    :cond_6
    invoke-direct {v0, v5}, Lbg/b;->R1(I)Ljava/lang/String;

    move-result-object v1

    return-object v1

    :cond_7
    invoke-direct {v0, v5}, Lbg/b;->R1(I)Ljava/lang/String;

    move-result-object v1

    return-object v1

    :cond_8
    const/16 v6, 0x10

    if-ne v5, v6, :cond_13

    const-wide/16 v11, 0x10

    cmp-long v6, v3, v11

    const-wide/32 v13, 0x10000

    const-wide/16 v15, 0x1000

    const-wide/16 v17, 0x100

    const/16 v19, 0x4

    if-gez v6, :cond_9

    move v6, v10

    goto :goto_4

    :cond_9
    cmp-long v6, v3, v17

    if-gez v6, :cond_a

    move v6, v8

    goto :goto_4

    :cond_a
    cmp-long v6, v3, v15

    if-gez v6, :cond_b

    move v6, v9

    goto :goto_4

    :cond_b
    cmp-long v6, v3, v13

    if-gez v6, :cond_12

    move/from16 v6, v19

    :goto_4
    long-to-int v3, v3

    cmp-long v4, v1, v11

    if-gez v4, :cond_c

    move v8, v10

    goto :goto_5

    :cond_c
    cmp-long v4, v1, v17

    if-gez v4, :cond_d

    goto :goto_5

    :cond_d
    cmp-long v4, v1, v15

    if-gez v4, :cond_e

    move v8, v9

    goto :goto_5

    :cond_e
    cmp-long v4, v1, v13

    if-gez v4, :cond_11

    move/from16 v8, v19

    :goto_5
    long-to-int v1, v1

    add-int/lit8 v2, v8, 0x1

    add-int/2addr v6, v2

    new-array v2, v6, [C

    aput-char v7, v2, v8

    sget-object v4, Lag/b;->h:[C

    :goto_6
    ushr-int/lit8 v5, v1, 0x4

    shl-int/lit8 v7, v5, 0x4

    sub-int/2addr v1, v7

    add-int/lit8 v8, v8, -0x1

    aget-char v1, v4, v1

    aput-char v1, v2, v8

    if-nez v5, :cond_10

    :goto_7
    ushr-int/lit8 v1, v3, 0x4

    shl-int/lit8 v5, v1, 0x4

    sub-int/2addr v3, v5

    add-int/lit8 v6, v6, -0x1

    aget-char v3, v4, v3

    aput-char v3, v2, v6

    if-nez v1, :cond_f

    new-instance v1, Ljava/lang/String;

    invoke-direct {v1, v2}, Ljava/lang/String;-><init>([C)V

    return-object v1

    :cond_f
    move v3, v1

    goto :goto_7

    :cond_10
    move v1, v5

    goto :goto_6

    :cond_11
    invoke-direct {v0, v5}, Lbg/b;->R1(I)Ljava/lang/String;

    move-result-object v1

    return-object v1

    :cond_12
    invoke-direct {v0, v5}, Lbg/b;->R1(I)Ljava/lang/String;

    move-result-object v1

    return-object v1

    :cond_13
    invoke-direct {v0, v5}, Lbg/b;->R1(I)Ljava/lang/String;

    move-result-object v1

    return-object v1
.end method

.method public abstract W1()J
.end method

.method public abstract X1()J
.end method

.method public Y1()I
    .locals 4

    invoke-interface {p0}, Lag/g;->f()I

    move-result v0

    invoke-virtual {p0}, Lbg/b;->A0()Z

    move-result v1

    if-nez v1, :cond_0

    return v0

    :cond_0
    invoke-interface {p0}, Lag/g;->w()Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v0, 0x0

    return v0

    :cond_1
    invoke-virtual {p0}, Lbg/b;->W1()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->numberOfTrailingZeros(J)I

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p0}, Lbg/b;->a2()J

    move-result-wide v2

    not-long v2, v2

    invoke-static {v2, v3}, Ljava/lang/Long;->numberOfTrailingZeros(J)I

    move-result v2

    if-eqz v2, :cond_2

    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v1

    sub-int/2addr v0, v1

    :cond_2
    return v0
.end method

.method protected Z0()Ljava/lang/String;
    .locals 1

    sget-object v0, Linet/ipaddr/a;->c:Ljava/lang/String;

    return-object v0
.end method

.method protected Z1()I
    .locals 7

    invoke-virtual {p0}, Lag/b;->b1()I

    move-result v0

    invoke-virtual {p0}, Lbg/b;->W1()J

    move-result-wide v1

    invoke-virtual {p0}, Lbg/b;->a2()J

    move-result-wide v3

    invoke-virtual {p0}, Lbg/b;->X1()J

    move-result-wide v5

    invoke-static/range {v0 .. v6}, Lbg/b;->S1(IJJJ)I

    move-result v0

    return v0
.end method

.method public abstract a2()J
.end method

.method protected b0(II)I
    .locals 2

    invoke-virtual {p0}, Lbg/b;->a2()J

    move-result-wide v0

    invoke-direct {p0, p1, v0, v1, p2}, Lbg/b;->O1(IJI)I

    move-result p1

    return p1
.end method

.method public c0()Z
    .locals 1

    invoke-virtual {p0}, Lbg/b;->A0()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lbg/b;->L()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public e2(J)Z
    .locals 2

    invoke-virtual {p0}, Lbg/b;->A0()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lbg/b;->W1()J

    move-result-wide v0

    cmp-long p1, p1, v0

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public f2(JJ)Z
    .locals 6

    invoke-virtual {p0}, Lbg/b;->A0()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lbg/b;->W1()J

    move-result-wide v2

    invoke-virtual {p0}, Lbg/b;->a2()J

    move-result-wide v4

    xor-long/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/Long;->numberOfLeadingZeros(J)I

    move-result v0

    const-wide/16 v2, -0x1

    ushr-long/2addr v2, v0

    and-long/2addr v2, p3

    const-wide/16 v4, 0x0

    cmp-long v0, v2, v4

    if-eqz v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {p0}, Lbg/b;->W1()J

    move-result-wide v2

    and-long/2addr p3, v2

    cmp-long p1, p1, p3

    if-nez p1, :cond_1

    const/4 v1, 0x1

    :cond_1
    return v1
.end method

.method public getValue()Ljava/math/BigInteger;
    .locals 2

    invoke-virtual {p0}, Lbg/b;->W1()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v0

    return-object v0
.end method

.method protected h1(IIZLjava/lang/StringBuilder;)V
    .locals 6

    invoke-virtual {p0}, Lbg/b;->W1()J

    move-result-wide v0

    move v2, p1

    move v3, p2

    move v4, p3

    move-object v5, p4

    invoke-static/range {v0 .. v5}, Lag/b;->H1(JIIZLjava/lang/StringBuilder;)Ljava/lang/StringBuilder;

    return-void
.end method

.method protected i1(IZLjava/lang/StringBuilder;)V
    .locals 6

    invoke-virtual {p0}, Lbg/b;->W1()J

    move-result-wide v0

    const/4 v3, 0x0

    move v2, p1

    move v4, p2

    move-object v5, p3

    invoke-static/range {v0 .. v5}, Lag/b;->H1(JIIZLjava/lang/StringBuilder;)Ljava/lang/StringBuilder;

    return-void
.end method

.method protected j1(I)I
    .locals 2

    invoke-virtual {p0}, Lbg/b;->W1()J

    move-result-wide v0

    invoke-static {v0, v1, p1}, Lag/b;->K1(JI)I

    move-result p1

    return p1
.end method

.method protected m1(I)I
    .locals 8

    invoke-virtual {p0}, Lbg/b;->A0()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-virtual {p0}, Lag/b;->b1()I

    move-result v0

    if-ne p1, v0, :cond_1

    invoke-virtual {p0}, Lbg/b;->Z1()I

    move-result p1

    return p1

    :cond_1
    const/4 v0, 0x2

    if-lt p1, v0, :cond_2

    const/16 v0, 0x55

    if-gt p1, v0, :cond_2

    invoke-virtual {p0}, Lbg/b;->W1()J

    move-result-wide v2

    invoke-virtual {p0}, Lbg/b;->a2()J

    move-result-wide v4

    invoke-virtual {p0}, Lbg/b;->X1()J

    move-result-wide v6

    move v1, p1

    invoke-static/range {v1 .. v7}, Lbg/b;->S1(IJJJ)I

    move-result p1

    return p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1
.end method

.method public s(I)I
    .locals 3

    invoke-virtual {p0}, Lag/b;->b1()I

    move-result v0

    if-ne p1, v0, :cond_0

    invoke-virtual {p0}, Lag/b;->k1()I

    move-result p1

    return p1

    :cond_0
    invoke-interface {p0}, Lag/g;->f()I

    move-result v0

    invoke-virtual {p0}, Lbg/b;->X1()J

    move-result-wide v1

    invoke-static {p1, v0, v1, v2}, Lag/b;->l1(IIJ)I

    move-result p1

    return p1
.end method

.method protected u1(IIZCZLjava/lang/String;Ljava/lang/StringBuilder;)V
    .locals 9

    invoke-virtual {p0}, Lbg/b;->W1()J

    move-result-wide v0

    move v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    move v6, p5

    move-object v7, p6

    move-object/from16 v8, p7

    invoke-static/range {v0 .. v8}, Lbg/b;->i2(JIIZCZLjava/lang/String;Ljava/lang/StringBuilder;)V

    return-void
.end method

.method protected x1(Ljava/lang/String;Ljava/lang/String;IZCZLjava/lang/String;Ljava/lang/StringBuilder;)V
    .locals 12

    invoke-virtual {p0}, Lbg/b;->W1()J

    move-result-wide v0

    invoke-virtual {p0}, Lbg/b;->a2()J

    move-result-wide v2

    move-object v4, p1

    move-object v5, p2

    move v6, p3

    move/from16 v7, p4

    move/from16 v8, p5

    move/from16 v9, p6

    move-object/from16 v10, p7

    move-object/from16 v11, p8

    invoke-static/range {v0 .. v11}, Lbg/b;->j2(JJLjava/lang/String;Ljava/lang/String;IZCZLjava/lang/String;Ljava/lang/StringBuilder;)V

    return-void
.end method

.method protected y1(Ljava/lang/String;Ljava/lang/String;IIZCZLjava/lang/String;)I
    .locals 12

    invoke-virtual {p0}, Lbg/b;->W1()J

    move-result-wide v0

    invoke-virtual {p0}, Lbg/b;->a2()J

    move-result-wide v2

    move-object v4, p1

    move-object v5, p2

    move v6, p3

    move/from16 v7, p4

    move/from16 v8, p5

    move/from16 v9, p6

    move/from16 v10, p7

    move-object/from16 v11, p8

    invoke-static/range {v0 .. v11}, Lbg/b;->k2(JJLjava/lang/String;Ljava/lang/String;IIZCZLjava/lang/String;)I

    move-result v0

    return v0
.end method
