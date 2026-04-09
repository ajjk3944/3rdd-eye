.class abstract Linet/ipaddr/format/validate/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field private a:[I

.field private b:I

.field private c:Z

.field private d:Z

.field private e:Z

.field private f:Z

.field private g:I

.field private h:I

.field private i:I

.field protected final j:Ljava/lang/CharSequence;


# direct methods
.method constructor <init>(Ljava/lang/CharSequence;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Linet/ipaddr/format/validate/a;->g:I

    iput v0, p0, Linet/ipaddr/format/validate/a;->h:I

    iput-object p1, p0, Linet/ipaddr/format/validate/a;->j:Ljava/lang/CharSequence;

    return-void
.end method

.method private static K0(I[IIIIIIIIIIIIIIIIJIJ)V
    .locals 8

    move-wide/from16 v0, p17

    move-wide/from16 v2, p20

    or-int v4, p0, p2

    aput p3, p1, v4

    or-int v4, p0, p4

    aput p5, p1, v4

    or-int v4, p0, p6

    aput p7, p1, v4

    or-int v4, p0, p8

    aput p9, p1, v4

    or-int v4, p0, p10

    aput p11, p1, v4

    or-int v4, p0, p12

    aput p13, p1, v4

    or-int v4, p0, p14

    aput p15, p1, v4

    or-int v4, p0, p16

    const/16 v5, 0x20

    ushr-long v6, v0, v5

    long-to-int v6, v6

    aput v6, p1, v4

    or-int/lit8 v4, v4, 0x1

    long-to-int v0, v0

    aput v0, p1, v4

    or-int v0, p0, p19

    ushr-long v4, v2, v5

    long-to-int v1, v4

    aput v1, p1, v0

    or-int/lit8 v0, v0, 0x1

    long-to-int v1, v2

    aput v1, p1, v0

    return-void
.end method

.method static j(II[I)I
    .locals 0

    shl-int/lit8 p0, p0, 0x4

    or-int/2addr p0, p1

    aget p0, p2, p0

    return p0
.end method

.method protected static p(II[I)J
    .locals 4

    shl-int/lit8 p0, p0, 0x4

    or-int/2addr p0, p1

    aget p1, p2, p0

    int-to-long v0, p1

    or-int/lit8 p0, p0, 0x1

    aget p0, p2, p0

    int-to-long p0, p0

    const-wide v2, 0xffffffffL

    and-long/2addr p0, v2

    const/16 p2, 0x20

    shl-long/2addr v0, p2

    or-long/2addr p0, v0

    return-wide p0
.end method


# virtual methods
.method B()Z
    .locals 1

    iget-boolean v0, p0, Linet/ipaddr/format/validate/a;->f:Z

    return v0
.end method

.method C(I)Z
    .locals 1

    const/high16 v0, 0x10000

    invoke-virtual {p0, p1, v0}, Linet/ipaddr/format/validate/a;->g(II)Z

    move-result p1

    return p1
.end method

.method C0(Z)V
    .locals 0

    iput-boolean p1, p0, Linet/ipaddr/format/validate/a;->d:Z

    return-void
.end method

.method E()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Linet/ipaddr/format/validate/a;->a:[I

    return-void
.end method

.method E0()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Linet/ipaddr/format/validate/a;->c:Z

    return-void
.end method

.method F(IIIIIIIIIIIIIIIIJIJ)V
    .locals 22

    move/from16 v2, p2

    move/from16 v3, p3

    move/from16 v4, p4

    move/from16 v5, p5

    move/from16 v6, p6

    move/from16 v7, p7

    move/from16 v8, p8

    move/from16 v9, p9

    move/from16 v10, p10

    move/from16 v11, p11

    move/from16 v12, p12

    move/from16 v13, p13

    move/from16 v14, p14

    move/from16 v15, p15

    move/from16 v16, p16

    move-wide/from16 v17, p17

    move/from16 v19, p19

    move-wide/from16 v20, p20

    shl-int/lit8 v0, p1, 0x4

    invoke-virtual/range {p0 .. p0}, Linet/ipaddr/format/validate/a;->m()[I

    move-result-object v1

    invoke-static/range {v0 .. v21}, Linet/ipaddr/format/validate/a;->K0(I[IIIIIIIIIIIIIIIIJIJ)V

    return-void
.end method

.method G0(IIIIIIIIIIIII)V
    .locals 1

    shl-int/lit8 p1, p1, 0x4

    invoke-virtual {p0}, Linet/ipaddr/format/validate/a;->m()[I

    move-result-object v0

    or-int/2addr p2, p1

    aput p3, v0, p2

    or-int p2, p1, p4

    aput p5, v0, p2

    or-int p2, p1, p6

    aput p7, v0, p2

    or-int p2, p1, p8

    aput p9, v0, p2

    or-int p2, p1, p10

    aput p11, v0, p2

    or-int/2addr p1, p12

    aput p13, v0, p1

    return-void
.end method

.method J(IIIIIIIIIIIIIIIIJIJIJIJ)V
    .locals 28

    move-wide/from16 v0, p23

    move-wide/from16 v2, p26

    move/from16 v6, p2

    move/from16 v7, p3

    move/from16 v8, p4

    move/from16 v9, p5

    move/from16 v10, p6

    move/from16 v11, p7

    move/from16 v12, p8

    move/from16 v13, p9

    move/from16 v14, p10

    move/from16 v15, p11

    move/from16 v16, p12

    move/from16 v17, p13

    move/from16 v18, p14

    move/from16 v19, p15

    move/from16 v20, p16

    move-wide/from16 v21, p17

    move/from16 v23, p19

    move-wide/from16 v24, p20

    shl-int/lit8 v26, p1, 0x4

    move/from16 v4, v26

    invoke-virtual/range {p0 .. p0}, Linet/ipaddr/format/validate/a;->m()[I

    move-result-object v27

    move-object/from16 v5, v27

    invoke-static/range {v4 .. v25}, Linet/ipaddr/format/validate/a;->K0(I[IIIIIIIIIIIIIIIIJIJ)V

    or-int v4, v26, p22

    const/16 v5, 0x20

    ushr-long v6, v0, v5

    long-to-int v6, v6

    aput v6, v27, v4

    or-int/lit8 v4, v4, 0x1

    long-to-int v0, v0

    aput v0, v27, v4

    or-int v0, v26, p25

    ushr-long v4, v2, v5

    long-to-int v1, v4

    aput v1, v27, v0

    or-int/lit8 v0, v0, 0x1

    long-to-int v1, v2

    aput v1, v27, v0

    return-void
.end method

.method K(IIIIIIIIIIIIIII)V
    .locals 3

    shl-int/lit8 v0, p1, 0x4

    invoke-virtual {p0}, Linet/ipaddr/format/validate/a;->m()[I

    move-result-object v1

    or-int v2, v0, p2

    aput p3, v1, v2

    or-int v2, v0, p4

    aput p5, v1, v2

    or-int v2, v0, p6

    aput p7, v1, v2

    or-int v2, v0, p8

    aput p9, v1, v2

    or-int v2, v0, p10

    aput p11, v1, v2

    or-int v2, v0, p12

    aput p13, v1, v2

    or-int v0, v0, p14

    aput p15, v1, v0

    return-void
.end method

.method M0()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Linet/ipaddr/format/validate/a;->f:Z

    return-void
.end method

.method N0(IIJ)V
    .locals 2

    shl-int/lit8 p1, p1, 0x4

    or-int/2addr p1, p2

    const/16 p2, 0x20

    ushr-long v0, p3, p2

    long-to-int p2, v0

    long-to-int p3, p3

    invoke-virtual {p0}, Linet/ipaddr/format/validate/a;->m()[I

    move-result-object p4

    aput p2, p4, p1

    or-int/lit8 p1, p1, 0x1

    aput p3, p4, p1

    return-void
.end method

.method P(IIIIIIIIIIIIIIIIIIJIJ)V
    .locals 24

    move/from16 v2, p2

    move/from16 v3, p3

    move/from16 v4, p4

    move/from16 v5, p5

    move/from16 v6, p6

    move/from16 v7, p7

    move/from16 v8, p8

    move/from16 v9, p9

    move/from16 v10, p10

    move/from16 v11, p11

    move/from16 v12, p12

    move/from16 v13, p13

    move/from16 v14, p14

    move/from16 v15, p15

    move/from16 v16, p18

    move-wide/from16 v17, p19

    move/from16 v19, p21

    move-wide/from16 v20, p22

    shl-int/lit8 v22, p1, 0x4

    move/from16 v0, v22

    invoke-virtual/range {p0 .. p0}, Linet/ipaddr/format/validate/a;->m()[I

    move-result-object v23

    move-object/from16 v1, v23

    invoke-static/range {v0 .. v21}, Linet/ipaddr/format/validate/a;->K0(I[IIIIIIIIIIIIIIIIJIJ)V

    or-int v0, v22, p16

    aput p17, v23, v0

    return-void
.end method

.method P0(Ljava/lang/StringBuilder;)V
    .locals 21

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-virtual/range {p0 .. p0}, Linet/ipaddr/format/validate/a;->n()Ljava/lang/CharSequence;

    move-result-object v2

    const-string v3, "address string: "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    const/16 v3, 0xa

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual/range {p0 .. p0}, Linet/ipaddr/format/validate/a;->a()I

    move-result v4

    if-lez v4, :cond_0

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v5

    if-ge v4, v5, :cond_0

    const-string v5, "address end: "

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v5

    invoke-interface {v2, v4, v5}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_0
    invoke-virtual/range {p0 .. p0}, Linet/ipaddr/format/validate/a;->Z()I

    move-result v4

    const-string v5, "segment count: "

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    if-lez v4, :cond_9

    const/4 v6, 0x0

    :goto_0
    if-ge v6, v4, :cond_7

    const-string v7, "segment "

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v7, ":\n"

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Linet/ipaddr/format/validate/a;->C(I)Z

    move-result v7

    if-eqz v7, :cond_1

    const-string v7, "\tis wildcard"

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move v11, v3

    move/from16 v18, v4

    goto/16 :goto_3

    :cond_1
    const/4 v7, 0x2

    invoke-virtual {v0, v6, v7}, Linet/ipaddr/format/validate/a;->o(II)J

    move-result-wide v7

    invoke-virtual {v0, v6, v3}, Linet/ipaddr/format/validate/a;->o(II)J

    move-result-wide v9

    const/16 v11, 0xc

    invoke-virtual {v0, v6, v11}, Linet/ipaddr/format/validate/a;->o(II)J

    move-result-wide v11

    const/4 v13, 0x4

    invoke-virtual {v0, v6, v13}, Linet/ipaddr/format/validate/a;->o(II)J

    move-result-wide v13

    const-wide/16 v15, 0x0

    cmp-long v17, v13, v15

    const-string v5, "\tvalue in hex: "

    const-string v15, "\tvalue: "

    const/16 v3, 0x40

    if-eqz v17, :cond_2

    invoke-static {v13, v14}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v13

    invoke-virtual {v13, v3}, Ljava/math/BigInteger;->shiftLeft(I)Ljava/math/BigInteger;

    move-result-object v13

    invoke-static {v7, v8}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v14

    invoke-virtual {v13, v14}, Ljava/math/BigInteger;->or(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v13

    invoke-virtual {v1, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v14, 0xa

    invoke-virtual {v1, v14}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v5, 0x10

    invoke-virtual {v13, v5}, Ljava/math/BigInteger;->toString(I)Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v1, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v14}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_2
    const/16 v14, 0xa

    invoke-virtual {v1, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v14}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v7, v8}, Ljava/lang/Long;->toHexString(J)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v14}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/4 v13, 0x0

    :goto_1
    const-string v5, "\tstring: "

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v5, 0x6

    invoke-virtual {v0, v6, v5}, Linet/ipaddr/format/validate/a;->h(II)I

    move-result v5

    const/4 v15, 0x7

    invoke-virtual {v0, v6, v15}, Linet/ipaddr/format/validate/a;->h(II)I

    move-result v15

    invoke-interface {v2, v5, v15}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v5

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v14}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v5, "\tradix: "

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v5, 0x0

    invoke-virtual {v0, v6, v5}, Linet/ipaddr/format/validate/a;->l(II)I

    move-result v15

    invoke-virtual {v1, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v14}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v15, "\tis standard: "

    invoke-virtual {v1, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/high16 v15, 0x40000

    invoke-virtual {v0, v6, v15}, Linet/ipaddr/format/validate/a;->g(II)Z

    move-result v15

    invoke-virtual {v1, v15}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v14}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-wide/16 v14, 0x0

    cmp-long v14, v11, v14

    const-string v5, "\tis standard range: "

    const-string v15, "\tupper radix: "

    const-string v3, "\tupper string: "

    move/from16 v18, v4

    const-string v4, "\tupper value in hex: "

    move-wide/from16 v19, v7

    const-string v7, "\tupper value: "

    if-eqz v14, :cond_4

    invoke-static {v11, v12}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v8

    const/16 v11, 0x40

    invoke-virtual {v8, v11}, Ljava/math/BigInteger;->shiftLeft(I)Ljava/math/BigInteger;

    move-result-object v8

    invoke-static {v9, v10}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/math/BigInteger;->or(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v8

    invoke-virtual {v8, v13}, Ljava/math/BigInteger;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_3

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v11, 0xa

    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v4, 0x10

    invoke-virtual {v8, v4}, Ljava/math/BigInteger;->toString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v3, 0xe

    invoke-virtual {v0, v6, v3}, Linet/ipaddr/format/validate/a;->h(II)I

    move-result v3

    const/16 v4, 0xf

    invoke-virtual {v0, v6, v4}, Linet/ipaddr/format/validate/a;->h(II)I

    move-result v4

    invoke-interface {v2, v3, v4}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v3, 0x8

    invoke-virtual {v0, v6, v3}, Linet/ipaddr/format/validate/a;->l(II)I

    move-result v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/high16 v3, 0x80000

    invoke-virtual {v0, v6, v3}, Linet/ipaddr/format/validate/a;->g(II)Z

    move-result v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_2

    :cond_3
    const/16 v11, 0xa

    goto :goto_2

    :cond_4
    const/16 v11, 0xa

    cmp-long v8, v9, v19

    if-eqz v8, :cond_5

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v9, v10}, Ljava/lang/Long;->toHexString(J)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v3, 0xe

    invoke-virtual {v0, v6, v3}, Linet/ipaddr/format/validate/a;->h(II)I

    move-result v3

    const/16 v4, 0xf

    invoke-virtual {v0, v6, v4}, Linet/ipaddr/format/validate/a;->h(II)I

    move-result v4

    invoke-interface {v2, v3, v4}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v3, 0x8

    invoke-virtual {v0, v6, v3}, Linet/ipaddr/format/validate/a;->l(II)I

    move-result v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/high16 v3, 0x80000

    invoke-virtual {v0, v6, v3}, Linet/ipaddr/format/validate/a;->g(II)Z

    move-result v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_5
    :goto_2
    const/high16 v3, 0x20000

    invoke-virtual {v0, v6, v3}, Linet/ipaddr/format/validate/a;->g(II)Z

    move-result v3

    if-eqz v3, :cond_6

    const-string v3, "\thas single wildcard: "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_6
    :goto_3
    add-int/lit8 v6, v6, 0x1

    move v3, v11

    move/from16 v4, v18

    goto/16 :goto_0

    :cond_7
    move v11, v3

    const-string v2, "has a wildcard segment: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual/range {p0 .. p0}, Linet/ipaddr/format/validate/a;->r()Z

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual/range {p0 .. p0}, Linet/ipaddr/format/validate/a;->c()I

    move-result v2

    if-ltz v2, :cond_8

    const-string v3, "has compressed segment(s) at character "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v2, v2, 0x1

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_8
    invoke-virtual/range {p0 .. p0}, Linet/ipaddr/format/validate/a;->B()Z

    move-result v2

    if-eqz v2, :cond_b

    const-string v2, "is single segment"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_4

    :cond_9
    move v11, v3

    invoke-virtual/range {p0 .. p0}, Linet/ipaddr/format/validate/a;->y0()Z

    move-result v2

    if-eqz v2, :cond_a

    const-string v2, "is empty"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_4

    :cond_a
    invoke-virtual/range {p0 .. p0}, Linet/ipaddr/format/validate/a;->v()Z

    move-result v2

    if-eqz v2, :cond_b

    const-string v2, "is all addresses"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_b
    :goto_4
    return-void
.end method

.method S(IIIIIIIIIIIIIIIIIIJIJIJIJ)V
    .locals 28

    move-wide/from16 v0, p25

    move-wide/from16 v2, p28

    move/from16 v6, p2

    move/from16 v7, p3

    move/from16 v8, p4

    move/from16 v9, p5

    move/from16 v10, p6

    move/from16 v11, p7

    move/from16 v12, p8

    move/from16 v13, p9

    move/from16 v14, p10

    move/from16 v15, p11

    move/from16 v16, p12

    move/from16 v17, p13

    move/from16 v18, p14

    move/from16 v19, p15

    move/from16 v20, p18

    move-wide/from16 v21, p19

    move/from16 v23, p21

    move-wide/from16 v24, p22

    shl-int/lit8 v26, p1, 0x4

    move/from16 v4, v26

    invoke-virtual/range {p0 .. p0}, Linet/ipaddr/format/validate/a;->m()[I

    move-result-object v27

    move-object/from16 v5, v27

    invoke-static/range {v4 .. v25}, Linet/ipaddr/format/validate/a;->K0(I[IIIIIIIIIIIIIIIIJIJ)V

    or-int v4, v26, p16

    aput p17, v27, v4

    or-int v4, v26, p24

    const/16 v5, 0x20

    ushr-long v6, v0, v5

    long-to-int v6, v6

    aput v6, v27, v4

    or-int/lit8 v4, v4, 0x1

    long-to-int v0, v0

    aput v0, v27, v4

    or-int v0, v26, p27

    ushr-long v4, v2, v5

    long-to-int v1, v4

    aput v1, v27, v0

    or-int/lit8 v0, v0, 0x1

    long-to-int v1, v2

    aput v1, v27, v0

    return-void
.end method

.method T(I)V
    .locals 0

    iput p1, p0, Linet/ipaddr/format/validate/a;->i:I

    return-void
.end method

.method public Z()I
    .locals 1

    iget v0, p0, Linet/ipaddr/format/validate/a;->b:I

    return v0
.end method

.method a()I
    .locals 1

    iget v0, p0, Linet/ipaddr/format/validate/a;->i:I

    return v0
.end method

.method b0()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Linet/ipaddr/format/validate/a;->e:Z

    return-void
.end method

.method c()I
    .locals 1

    iget v0, p0, Linet/ipaddr/format/validate/a;->g:I

    return v0
.end method

.method d()I
    .locals 1

    iget v0, p0, Linet/ipaddr/format/validate/a;->h:I

    return v0
.end method

.method d0(II)V
    .locals 3

    invoke-virtual {p0}, Linet/ipaddr/format/validate/a;->m()[I

    move-result-object v0

    shl-int/lit8 p1, p1, 0x4

    aget v1, v0, p1

    shl-int/lit8 p2, p2, 0x8

    const v2, 0xff00

    and-int/2addr p2, v2

    or-int/2addr p2, v1

    aput p2, v0, p1

    return-void
.end method

.method f0(I)V
    .locals 0

    iput p1, p0, Linet/ipaddr/format/validate/a;->g:I

    return-void
.end method

.method g(II)Z
    .locals 1

    invoke-virtual {p0}, Linet/ipaddr/format/validate/a;->m()[I

    move-result-object v0

    shl-int/lit8 p1, p1, 0x4

    aget p1, v0, p1

    and-int/2addr p1, p2

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method h(II)I
    .locals 1

    invoke-virtual {p0}, Linet/ipaddr/format/validate/a;->m()[I

    move-result-object v0

    invoke-static {p1, p2, v0}, Linet/ipaddr/format/validate/a;->j(II[I)I

    move-result p1

    return p1
.end method

.method l(II)I
    .locals 1

    invoke-virtual {p0}, Linet/ipaddr/format/validate/a;->m()[I

    move-result-object v0

    shl-int/lit8 p1, p1, 0x4

    or-int/2addr p1, p2

    aget p1, v0, p1

    and-int/lit16 p1, p1, 0xff

    if-nez p1, :cond_0

    const/16 p1, 0x10

    :cond_0
    return p1
.end method

.method m()[I
    .locals 1

    iget-object v0, p0, Linet/ipaddr/format/validate/a;->a:[I

    return-object v0
.end method

.method n()Ljava/lang/CharSequence;
    .locals 1

    iget-object v0, p0, Linet/ipaddr/format/validate/a;->j:Ljava/lang/CharSequence;

    return-object v0
.end method

.method o(II)J
    .locals 1

    invoke-virtual {p0}, Linet/ipaddr/format/validate/a;->m()[I

    move-result-object v0

    invoke-static {p1, p2, v0}, Linet/ipaddr/format/validate/a;->p(II[I)J

    move-result-wide p1

    return-wide p1
.end method

.method q0(I)V
    .locals 0

    iput p1, p0, Linet/ipaddr/format/validate/a;->h:I

    return-void
.end method

.method r()Z
    .locals 1

    iget-boolean v0, p0, Linet/ipaddr/format/validate/a;->c:Z

    return v0
.end method

.method s()V
    .locals 1

    iget v0, p0, Linet/ipaddr/format/validate/a;->b:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Linet/ipaddr/format/validate/a;->b:I

    return-void
.end method

.method t(I)V
    .locals 2

    const/4 v0, 0x4

    if-ne p1, v0, :cond_0

    const/16 p1, 0x40

    goto :goto_0

    :cond_0
    const/16 v0, 0x8

    if-ne p1, v0, :cond_1

    const/16 p1, 0x80

    goto :goto_0

    :cond_1
    const/4 v0, 0x1

    const/16 v1, 0x10

    if-ne p1, v0, :cond_2

    move p1, v1

    goto :goto_0

    :cond_2
    mul-int/2addr p1, v1

    :goto_0
    new-array p1, p1, [I

    iput-object p1, p0, Linet/ipaddr/format/validate/a;->a:[I

    return-void
.end method

.method v()Z
    .locals 1

    iget-boolean v0, p0, Linet/ipaddr/format/validate/a;->e:Z

    return v0
.end method

.method y(I)Z
    .locals 1

    const/high16 v0, 0x400000

    invoke-virtual {p0, p1, v0}, Linet/ipaddr/format/validate/a;->g(II)Z

    move-result p1

    return p1
.end method

.method public y0()Z
    .locals 1

    iget-boolean v0, p0, Linet/ipaddr/format/validate/a;->d:Z

    return v0
.end method
