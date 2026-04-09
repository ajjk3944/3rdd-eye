.class public Linet/ipaddr/format/validate/r;
.super Linet/ipaddr/format/validate/c;
.source "SourceFile"

# interfaces
.implements Linet/ipaddr/format/validate/d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Linet/ipaddr/format/validate/r$m;,
        Linet/ipaddr/format/validate/r$g;,
        Linet/ipaddr/format/validate/r$e;,
        Linet/ipaddr/format/validate/r$f;,
        Linet/ipaddr/format/validate/r$k;,
        Linet/ipaddr/format/validate/r$i;,
        Linet/ipaddr/format/validate/r$j;,
        Linet/ipaddr/format/validate/r$h;,
        Linet/ipaddr/format/validate/r$c;,
        Linet/ipaddr/format/validate/r$l;,
        Linet/ipaddr/format/validate/r$d;
    }
.end annotation


# static fields
.field private static final B:Linet/ipaddr/format/validate/r$f;

.field private static final C:Linet/ipaddr/format/validate/r$f;

.field private static final D:[Linet/ipaddr/format/validate/r$e;

.field private static final E:[Linet/ipaddr/format/validate/r$e;

.field private static final F:[Linet/ipaddr/format/validate/r$m;

.field private static final G:[Linet/ipaddr/format/validate/r$m;

.field private static final H:[Linet/ipaddr/format/validate/r$i;

.field private static final I:[Linet/ipaddr/format/validate/r$i;

.field private static final J:Linet/ipaddr/format/validate/r$c;

.field private static final N:Linet/ipaddr/format/validate/r$c;

.field private static final X:[Linet/ipaddr/format/validate/r$h;

.field private static final Y:[Linet/ipaddr/format/validate/r$h;

.field private static final Z:Ljava/math/BigInteger;

.field private static final f1:Ljava/math/BigInteger;

.field private static final g1:[Ljava/math/BigInteger;

.field private static final h1:[Ljava/math/BigInteger;

.field private static final i1:[Ljava/math/BigInteger;

.field private static final j1:[Ljava/math/BigInteger;


# instance fields
.field private A:[Linet/ipaddr/format/validate/r$j;

.field private final w:Linet/ipaddr/o;

.field private final x:LZf/f;

.field private y:Linet/ipaddr/format/validate/r$l;

.field private z:[Linet/ipaddr/format/validate/r$j;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Linet/ipaddr/format/validate/r$f;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Linet/ipaddr/format/validate/r$f;-><init>(Z)V

    sput-object v0, Linet/ipaddr/format/validate/r;->B:Linet/ipaddr/format/validate/r$f;

    new-instance v0, Linet/ipaddr/format/validate/r$f;

    const/4 v2, 0x0

    invoke-direct {v0, v2}, Linet/ipaddr/format/validate/r$f;-><init>(Z)V

    sput-object v0, Linet/ipaddr/format/validate/r;->C:Linet/ipaddr/format/validate/r$f;

    const/16 v0, 0x81

    new-array v3, v0, [Linet/ipaddr/format/validate/r$e;

    sput-object v3, Linet/ipaddr/format/validate/r;->D:[Linet/ipaddr/format/validate/r$e;

    new-array v0, v0, [Linet/ipaddr/format/validate/r$e;

    sput-object v0, Linet/ipaddr/format/validate/r;->E:[Linet/ipaddr/format/validate/r$e;

    const/16 v0, 0x41

    new-array v3, v0, [Linet/ipaddr/format/validate/r$m;

    sput-object v3, Linet/ipaddr/format/validate/r;->F:[Linet/ipaddr/format/validate/r$m;

    new-array v3, v0, [Linet/ipaddr/format/validate/r$m;

    sput-object v3, Linet/ipaddr/format/validate/r;->G:[Linet/ipaddr/format/validate/r$m;

    new-array v3, v0, [Linet/ipaddr/format/validate/r$i;

    sput-object v3, Linet/ipaddr/format/validate/r;->H:[Linet/ipaddr/format/validate/r$i;

    new-array v3, v0, [Linet/ipaddr/format/validate/r$i;

    sput-object v3, Linet/ipaddr/format/validate/r;->I:[Linet/ipaddr/format/validate/r$i;

    new-instance v3, Linet/ipaddr/format/validate/r$c;

    invoke-direct {v3, v1}, Linet/ipaddr/format/validate/r$c;-><init>(Z)V

    sput-object v3, Linet/ipaddr/format/validate/r;->J:Linet/ipaddr/format/validate/r$c;

    new-instance v3, Linet/ipaddr/format/validate/r$c;

    invoke-direct {v3, v2}, Linet/ipaddr/format/validate/r$c;-><init>(Z)V

    sput-object v3, Linet/ipaddr/format/validate/r;->N:Linet/ipaddr/format/validate/r$c;

    new-array v2, v0, [Linet/ipaddr/format/validate/r$h;

    sput-object v2, Linet/ipaddr/format/validate/r;->X:[Linet/ipaddr/format/validate/r$h;

    new-array v0, v0, [Linet/ipaddr/format/validate/r$h;

    sput-object v0, Linet/ipaddr/format/validate/r;->Y:[Linet/ipaddr/format/validate/r$h;

    new-instance v0, Ljava/math/BigInteger;

    const/16 v2, 0x9

    new-array v2, v2, [B

    fill-array-data v2, :array_0

    invoke-direct {v0, v1, v2}, Ljava/math/BigInteger;-><init>(I[B)V

    sput-object v0, Linet/ipaddr/format/validate/r;->Z:Ljava/math/BigInteger;

    new-instance v0, Ljava/math/BigInteger;

    const/16 v2, 0x8

    new-array v2, v2, [B

    fill-array-data v2, :array_1

    invoke-direct {v0, v1, v2}, Ljava/math/BigInteger;-><init>(I[B)V

    sput-object v0, Linet/ipaddr/format/validate/r;->f1:Ljava/math/BigInteger;

    const/16 v0, 0x40

    new-array v1, v0, [Ljava/math/BigInteger;

    sput-object v1, Linet/ipaddr/format/validate/r;->g1:[Ljava/math/BigInteger;

    new-array v1, v0, [Ljava/math/BigInteger;

    sput-object v1, Linet/ipaddr/format/validate/r;->h1:[Ljava/math/BigInteger;

    new-array v1, v0, [Ljava/math/BigInteger;

    sput-object v1, Linet/ipaddr/format/validate/r;->i1:[Ljava/math/BigInteger;

    new-array v0, v0, [Ljava/math/BigInteger;

    sput-object v0, Linet/ipaddr/format/validate/r;->j1:[Ljava/math/BigInteger;

    return-void

    nop

    :array_0
    .array-data 1
        0x1t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
    .end array-data

    nop

    :array_1
    .array-data 1
        -0x80t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
    .end array-data
.end method

.method constructor <init>(LZf/f;Ljava/lang/CharSequence;Linet/ipaddr/o;)V
    .locals 0

    invoke-direct {p0, p2}, Linet/ipaddr/format/validate/c;-><init>(Ljava/lang/CharSequence;)V

    iput-object p3, p0, Linet/ipaddr/format/validate/r;->w:Linet/ipaddr/o;

    iput-object p1, p0, Linet/ipaddr/format/validate/r;->x:LZf/f;

    return-void
.end method

.method public static synthetic A1([Linet/ipaddr/ipv4/M;I)I
    .locals 0

    invoke-static {p0, p1}, Linet/ipaddr/format/validate/r;->g2([Linet/ipaddr/ipv4/M;I)I

    move-result p0

    return p0
.end method

.method public static synthetic B1([Linet/ipaddr/ipv6/V;I)I
    .locals 0

    invoke-static {p0, p1}, Linet/ipaddr/format/validate/r;->i2([Linet/ipaddr/ipv6/V;I)I

    move-result p0

    return p0
.end method

.method public static synthetic C1([II)I
    .locals 0

    invoke-static {p0, p1}, Linet/ipaddr/format/validate/r;->l2([II)I

    move-result p0

    return p0
.end method

.method public static synthetic D1([Linet/ipaddr/ipv4/M;I)I
    .locals 0

    invoke-static {p0, p1}, Linet/ipaddr/format/validate/r;->f2([Linet/ipaddr/ipv4/M;I)I

    move-result p0

    return p0
.end method

.method static synthetic E1(Linet/ipaddr/format/validate/r;)LZf/f;
    .locals 0

    iget-object p0, p0, Linet/ipaddr/format/validate/r;->x:LZf/f;

    return-object p0
.end method

.method static synthetic F1(Linet/ipaddr/format/validate/r;)Linet/ipaddr/ipv6/e$a;
    .locals 0

    invoke-direct {p0}, Linet/ipaddr/format/validate/r;->W1()Linet/ipaddr/ipv6/e$a;

    move-result-object p0

    return-object p0
.end method

.method static synthetic G1(Linet/ipaddr/format/validate/r;)Linet/ipaddr/ipv4/e$a;
    .locals 0

    invoke-direct {p0}, Linet/ipaddr/format/validate/r;->V1()Linet/ipaddr/ipv4/e$a;

    move-result-object p0

    return-object p0
.end method

.method private static H1([Linet/ipaddr/k;[Linet/ipaddr/k;Linet/ipaddr/c$a;II)[Linet/ipaddr/k;
    .locals 0

    if-nez p0, :cond_0

    invoke-interface {p2, p3}, Linet/ipaddr/c$a;->d(I)[LZf/d;

    move-result-object p0

    check-cast p0, [Linet/ipaddr/k;

    if-lez p4, :cond_0

    const/4 p2, 0x0

    invoke-static {p1, p2, p0, p2, p4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_0
    return-object p0
.end method

.method private static I1(I)Ljava/lang/Integer;
    .locals 0

    invoke-static {p0}, Linet/ipaddr/format/validate/g;->a(I)Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method

.method private static J1(Linet/ipaddr/j;II)Z
    .locals 3

    if-eqz p0, :cond_3

    if-ge p1, p2, :cond_3

    invoke-virtual {p0, p1}, Linet/ipaddr/j;->q(I)Linet/ipaddr/k;

    move-result-object v0

    invoke-virtual {v0}, Linet/ipaddr/k;->A0()Z

    move-result v0

    :cond_0
    const/4 v1, 0x1

    add-int/2addr p1, v1

    invoke-virtual {p0, p1}, Linet/ipaddr/j;->q(I)Linet/ipaddr/k;

    move-result-object v2

    if-eqz v0, :cond_1

    invoke-interface {v2}, Lag/l;->w()Z

    move-result v2

    if-nez v2, :cond_2

    return v1

    :cond_1
    invoke-virtual {v2}, Linet/ipaddr/k;->A0()Z

    move-result v0

    :cond_2
    if-lt p1, p2, :cond_0

    :cond_3
    const/4 p0, 0x0

    return p0
.end method

.method private K1(Linet/ipaddr/format/validate/r;ZZ)Ljava/lang/Boolean;
    .locals 36

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-virtual/range {p0 .. p0}, Linet/ipaddr/format/validate/c;->U0()Linet/ipaddr/format/validate/a;

    move-result-object v2

    invoke-virtual/range {p1 .. p1}, Linet/ipaddr/format/validate/c;->U0()Linet/ipaddr/format/validate/a;

    move-result-object v3

    invoke-virtual {v2}, Linet/ipaddr/format/validate/a;->m()[I

    move-result-object v4

    invoke-virtual {v3}, Linet/ipaddr/format/validate/a;->m()[I

    move-result-object v5

    if-eqz v4, :cond_0

    if-nez v5, :cond_1

    :cond_0
    move-object v7, v0

    const/4 v0, 0x0

    goto/16 :goto_14

    :cond_1
    invoke-virtual/range {p0 .. p0}, Linet/ipaddr/format/validate/r;->g0()Ljava/lang/Integer;

    move-result-object v7

    if-eqz p2, :cond_3

    if-eqz v7, :cond_3

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v10

    const/16 v11, 0x60

    if-le v10, v11, :cond_2

    goto :goto_0

    :cond_2
    const/4 v10, 0x0

    goto :goto_1

    :cond_3
    :goto_0
    const/4 v10, 0x1

    :goto_1
    invoke-direct {v0, v10}, Linet/ipaddr/format/validate/r;->p2(Z)Z

    move-result v11

    if-nez v11, :cond_4

    invoke-direct {v1, v10}, Linet/ipaddr/format/validate/r;->p2(Z)Z

    move-result v10

    if-eqz v10, :cond_5

    :cond_4
    move-object v7, v0

    const/4 v0, 0x0

    goto/16 :goto_14

    :cond_5
    invoke-virtual/range {p0 .. p0}, Linet/ipaddr/format/validate/r;->o0()Linet/ipaddr/g$a;

    move-result-object v10

    invoke-virtual/range {p1 .. p1}, Linet/ipaddr/format/validate/r;->o0()Linet/ipaddr/g$a;

    move-result-object v11

    invoke-virtual {v10, v11}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_6

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object v1

    :cond_6
    invoke-virtual/range {p0 .. p0}, Linet/ipaddr/format/validate/r;->getParameters()Linet/ipaddr/o;

    move-result-object v10

    invoke-virtual {v2}, Linet/ipaddr/format/validate/a;->Z()I

    move-result v2

    invoke-virtual {v3}, Linet/ipaddr/format/validate/a;->Z()I

    move-result v3

    invoke-virtual/range {p0 .. p0}, Linet/ipaddr/format/validate/r;->e1()Z

    move-result v11

    const/16 v12, 0x8

    if-eqz v11, :cond_7

    invoke-virtual {v10}, Linet/ipaddr/o;->p()Linet/ipaddr/ipv4/Z;

    move-result-object v10

    invoke-virtual {v10}, Linet/ipaddr/ipv4/Z;->r()Linet/ipaddr/ipv4/e;

    move-result-object v10

    const/16 v11, 0xff

    const/4 v14, 0x4

    move v15, v14

    const/4 v8, 0x1

    const/16 v16, 0x1

    const/16 v17, 0x1

    goto :goto_5

    :cond_7
    invoke-virtual/range {p0 .. p0}, Linet/ipaddr/format/validate/r;->g1()Z

    move-result v11

    const/4 v14, 0x6

    if-eqz v11, :cond_8

    move v11, v14

    goto :goto_2

    :cond_8
    move v11, v12

    :goto_2
    invoke-virtual/range {p1 .. p1}, Linet/ipaddr/format/validate/r;->g1()Z

    move-result v15

    if-eqz v15, :cond_9

    move v12, v14

    :cond_9
    invoke-virtual {v10}, Linet/ipaddr/o;->r()Linet/ipaddr/ipv6/j0;

    move-result-object v10

    invoke-virtual {v10}, Linet/ipaddr/ipv6/j0;->t()Linet/ipaddr/ipv6/e;

    move-result-object v10

    if-ne v11, v2, :cond_a

    const/4 v14, 0x1

    goto :goto_3

    :cond_a
    const/4 v14, 0x0

    :goto_3
    if-ne v12, v3, :cond_b

    const/4 v15, 0x1

    goto :goto_4

    :cond_b
    const/4 v15, 0x0

    :goto_4
    const v16, 0xffff

    const/16 v17, 0x10

    const/4 v8, 0x2

    move/from16 v34, v14

    move v14, v11

    move/from16 v11, v16

    move/from16 v16, v34

    move/from16 v35, v15

    move v15, v12

    move/from16 v12, v17

    move/from16 v17, v35

    :goto_5
    invoke-virtual {v10}, Linet/ipaddr/c;->d()Linet/ipaddr/c$b;

    move-result-object v19

    invoke-virtual/range {v19 .. v19}, Linet/ipaddr/c$b;->zeroHostsAreSubnets()Z

    move-result v20

    invoke-virtual/range {v19 .. v19}, Linet/ipaddr/c$b;->allPrefixedAddressesAreSubnets()Z

    move-result v19

    invoke-virtual/range {p1 .. p1}, Linet/ipaddr/format/validate/r;->g0()Ljava/lang/Integer;

    move-result-object v9

    if-nez v7, :cond_c

    add-int/lit8 v21, v14, -0x1

    move/from16 v23, v3

    move v3, v14

    move v13, v15

    move/from16 v24, v13

    move/from16 v15, v21

    const/4 v6, 0x0

    const/16 v22, 0x0

    goto :goto_7

    :cond_c
    if-eqz p2, :cond_d

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v6

    invoke-static {v6, v8, v12}, Linet/ipaddr/format/validate/g;->c(III)I

    move-result v6

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v13

    invoke-static {v13, v8, v12}, Linet/ipaddr/format/validate/g;->e(III)I

    move-result v13

    move/from16 v23, v3

    move v3, v6

    move-object/from16 v22, v7

    move/from16 v24, v15

    move v15, v13

    move/from16 v6, p2

    move v13, v3

    goto :goto_7

    :cond_d
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v13

    invoke-static {v13, v8, v12}, Linet/ipaddr/format/validate/g;->c(III)I

    move-result v13

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v6

    invoke-static {v6, v8, v12}, Linet/ipaddr/format/validate/g;->e(III)I

    move-result v6

    if-nez v19, :cond_10

    if-eqz v20, :cond_e

    invoke-virtual {v0, v7, v10, v4}, Linet/ipaddr/format/validate/r;->e2(Ljava/lang/Integer;Linet/ipaddr/i;[I)Z

    move-result v23

    if-eqz v23, :cond_e

    goto :goto_6

    :cond_e
    move/from16 v23, v3

    move v3, v14

    move v13, v15

    move/from16 v24, v13

    const/16 v22, 0x0

    move v15, v6

    :cond_f
    move/from16 v6, p2

    goto :goto_7

    :cond_10
    :goto_6
    move/from16 v23, v3

    move v3, v13

    move v13, v15

    move/from16 v24, v13

    const/16 v22, 0x0

    move v15, v6

    if-nez p3, :cond_f

    const/4 v6, 0x1

    :goto_7
    if-eqz v9, :cond_13

    move/from16 v25, v14

    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    move-result v14

    if-eqz v22, :cond_11

    invoke-virtual/range {v22 .. v22}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-ge v14, v0, :cond_14

    :cond_11
    invoke-static {v14, v8, v12}, Linet/ipaddr/format/validate/g;->c(III)I

    move-result v0

    if-ge v0, v13, :cond_15

    if-nez v19, :cond_12

    if-eqz v20, :cond_15

    invoke-virtual {v1, v9, v10, v5}, Linet/ipaddr/format/validate/r;->e2(Ljava/lang/Integer;Linet/ipaddr/i;[I)Z

    move-result v8

    if-eqz v8, :cond_15

    :cond_12
    move v13, v0

    goto :goto_8

    :cond_13
    move/from16 v25, v14

    :cond_14
    move-object/from16 v9, v22

    :cond_15
    :goto_8
    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v8, 0x0

    const/4 v14, 0x0

    const/16 v18, 0x0

    :goto_9
    if-lt v8, v2, :cond_16

    if-lez v18, :cond_17

    :cond_16
    if-eqz v6, :cond_18

    if-le v0, v15, :cond_18

    :cond_17
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object v0

    :cond_18
    move/from16 p2, v6

    const/16 v6, 0xa

    const-wide/16 v19, 0x0

    if-lez v18, :cond_19

    move/from16 v22, v15

    move-wide/from16 v26, v19

    move-wide/from16 v28, v26

    goto :goto_a

    :cond_19
    move/from16 v22, v15

    const/4 v15, 0x2

    invoke-static {v8, v15, v4}, Linet/ipaddr/format/validate/a;->p(II[I)J

    move-result-wide v26

    invoke-static {v8, v6, v4}, Linet/ipaddr/format/validate/a;->p(II[I)J

    move-result-wide v28

    :goto_a
    if-lt v0, v3, :cond_1a

    invoke-static {v12, v7, v0}, Linet/ipaddr/format/validate/g;->g(ILjava/lang/Integer;I)Ljava/lang/Integer;

    move-result-object v15

    invoke-virtual {v15}, Ljava/lang/Integer;->intValue()I

    move-result v6

    invoke-virtual {v10, v6}, Linet/ipaddr/i;->C(I)I

    move-result v6

    move-object/from16 v31, v7

    int-to-long v6, v6

    and-long v26, v26, v6

    invoke-virtual {v15}, Ljava/lang/Integer;->intValue()I

    move-result v6

    invoke-virtual {v10, v6}, Linet/ipaddr/i;->B(I)I

    move-result v6

    int-to-long v6, v6

    or-long v28, v28, v6

    goto :goto_b

    :cond_1a
    move-object/from16 v31, v7

    :goto_b
    if-le v0, v13, :cond_1b

    int-to-long v6, v11

    move-wide/from16 v32, v6

    move/from16 v21, v11

    move/from16 v30, v12

    const/4 v6, 0x2

    goto :goto_d

    :cond_1b
    if-lez v14, :cond_1c

    move-wide/from16 v32, v19

    const/4 v6, 0x2

    goto :goto_c

    :cond_1c
    const/4 v6, 0x2

    invoke-static {v1, v6, v5}, Linet/ipaddr/format/validate/a;->p(II[I)J

    move-result-wide v19

    const/16 v7, 0xa

    invoke-static {v1, v7, v5}, Linet/ipaddr/format/validate/a;->p(II[I)J

    move-result-wide v32

    :goto_c
    if-ne v0, v13, :cond_1d

    invoke-static {v12, v9, v0}, Linet/ipaddr/format/validate/g;->g(ILjava/lang/Integer;I)Ljava/lang/Integer;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v15

    invoke-virtual {v10, v15}, Linet/ipaddr/i;->C(I)I

    move-result v15

    move/from16 v21, v11

    move/from16 v30, v12

    int-to-long v11, v15

    and-long v19, v19, v11

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v7

    invoke-virtual {v10, v7}, Linet/ipaddr/i;->B(I)I

    move-result v7

    int-to-long v11, v7

    or-long v11, v32, v11

    move-wide/from16 v32, v11

    goto :goto_d

    :cond_1d
    move/from16 v21, v11

    move/from16 v30, v12

    :goto_d
    cmp-long v7, v26, v19

    if-eqz p3, :cond_1f

    if-nez v7, :cond_1e

    cmp-long v7, v28, v32

    if-eqz v7, :cond_20

    :cond_1e
    :goto_e
    move-object/from16 v7, p0

    goto/16 :goto_13

    :cond_1f
    if-gtz v7, :cond_1e

    cmp-long v7, v28, v32

    if-gez v7, :cond_20

    goto :goto_e

    :cond_20
    if-nez v16, :cond_24

    if-lez v18, :cond_22

    add-int/lit8 v18, v18, -0x1

    if-nez v18, :cond_21

    const/16 v16, 0x1

    :cond_21
    move-object/from16 v7, p0

    goto :goto_10

    :cond_22
    move-object/from16 v7, p0

    invoke-virtual {v7, v8, v4}, Linet/ipaddr/format/validate/c;->c1(I[I)Z

    move-result v11

    if-eqz v11, :cond_23

    add-int/lit8 v8, v8, 0x1

    sub-int v11, v25, v2

    move/from16 v18, v11

    goto :goto_10

    :cond_23
    :goto_f
    add-int/lit8 v8, v8, 0x1

    goto :goto_10

    :cond_24
    move-object/from16 v7, p0

    goto :goto_f

    :goto_10
    if-nez v17, :cond_28

    if-lez v14, :cond_26

    add-int/lit8 v14, v14, -0x1

    move v11, v1

    if-nez v14, :cond_25

    const/16 v17, 0x1

    :cond_25
    move-object/from16 v1, p1

    goto :goto_12

    :cond_26
    move v11, v1

    move-object/from16 v1, p1

    invoke-virtual {v1, v11, v5}, Linet/ipaddr/format/validate/c;->c1(I[I)Z

    move-result v12

    if-eqz v12, :cond_27

    add-int/lit8 v11, v11, 0x1

    sub-int v15, v24, v23

    move v14, v15

    goto :goto_12

    :cond_27
    :goto_11
    add-int/lit8 v11, v11, 0x1

    goto :goto_12

    :cond_28
    move v11, v1

    move-object/from16 v1, p1

    goto :goto_11

    :goto_12
    add-int/lit8 v0, v0, 0x1

    move/from16 v6, p2

    move v1, v11

    move/from16 v11, v21

    move/from16 v15, v22

    move/from16 v12, v30

    move-object/from16 v7, v31

    goto/16 :goto_9

    :goto_13
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    :goto_14
    return-object v0
.end method

.method static L1(Linet/ipaddr/g$a;Linet/ipaddr/format/validate/i;LZf/f;Linet/ipaddr/o;)Linet/ipaddr/g;
    .locals 18

    move-object/from16 v7, p0

    move-object/from16 v8, p1

    move-object/from16 v9, p2

    invoke-static/range {p0 .. p0}, Linet/ipaddr/g;->c1(Linet/ipaddr/g$a;)I

    move-result v10

    invoke-virtual/range {p1 .. p1}, Linet/ipaddr/format/validate/i;->l()Linet/ipaddr/g;

    move-result-object v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    invoke-virtual {v0, v1}, Linet/ipaddr/g;->W0(Z)Ljava/lang/Integer;

    move-result-object v2

    if-eqz v2, :cond_0

    const/4 v12, 0x0

    goto :goto_0

    :cond_0
    move-object v12, v0

    :goto_0
    const/4 v0, 0x0

    if-eqz v12, :cond_1

    move v13, v1

    goto :goto_1

    :cond_1
    move v13, v0

    :goto_1
    invoke-static/range {p1 .. p1}, Linet/ipaddr/format/validate/r;->X1(Linet/ipaddr/format/validate/i;)Ljava/lang/Integer;

    move-result-object v14

    invoke-virtual/range {p0 .. p0}, Linet/ipaddr/g$a;->isIPv4()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-virtual/range {p3 .. p3}, Linet/ipaddr/o;->p()Linet/ipaddr/ipv4/Z;

    move-result-object v1

    invoke-virtual {v1}, Linet/ipaddr/ipv4/Z;->r()Linet/ipaddr/ipv4/e;

    move-result-object v1

    invoke-virtual {v1}, Linet/ipaddr/ipv4/e;->d0()Linet/ipaddr/ipv4/e$a;

    move-result-object v15

    invoke-virtual {v15, v10}, Linet/ipaddr/format/validate/f;->d(I)[LZf/d;

    move-result-object v1

    move-object v6, v1

    check-cast v6, [Linet/ipaddr/ipv4/M;

    move v5, v0

    :goto_2
    if-ge v5, v10, :cond_3

    if-eqz v13, :cond_2

    invoke-interface {v12, v5}, Linet/ipaddr/l;->q(I)Linet/ipaddr/k;

    move-result-object v0

    invoke-virtual {v0}, Linet/ipaddr/k;->Q()I

    move-result v0

    invoke-static {v0}, Linet/ipaddr/format/validate/r;->I1(I)Ljava/lang/Integer;

    move-result-object v0

    move-object/from16 v16, v0

    goto :goto_3

    :cond_2
    const/16 v16, 0x0

    :goto_3
    const/16 v2, 0xff

    invoke-static {v5, v7, v8}, Linet/ipaddr/format/validate/r;->b2(ILinet/ipaddr/g$a;Linet/ipaddr/format/validate/i;)Ljava/lang/Integer;

    move-result-object v4

    const/4 v1, 0x0

    move-object/from16 v0, p0

    move v3, v5

    move/from16 v17, v5

    move-object/from16 v5, v16

    move-object v11, v6

    move-object v6, v15

    invoke-static/range {v0 .. v6}, Linet/ipaddr/format/validate/r;->M1(Linet/ipaddr/g$a;IIILjava/lang/Integer;Ljava/lang/Integer;Linet/ipaddr/format/validate/f;)Linet/ipaddr/k;

    move-result-object v0

    check-cast v0, Linet/ipaddr/ipv4/M;

    aput-object v0, v11, v17

    add-int/lit8 v5, v17, 0x1

    move-object v6, v11

    goto :goto_2

    :cond_3
    move-object v11, v6

    invoke-virtual {v15, v11, v9, v14}, Linet/ipaddr/format/validate/f;->n([LZf/d;LZf/f;Ljava/lang/Integer;)Linet/ipaddr/a;

    move-result-object v0

    check-cast v0, Linet/ipaddr/g;

    return-object v0

    :cond_4
    invoke-virtual/range {p3 .. p3}, Linet/ipaddr/o;->r()Linet/ipaddr/ipv6/j0;

    move-result-object v1

    invoke-virtual {v1}, Linet/ipaddr/ipv6/j0;->t()Linet/ipaddr/ipv6/e;

    move-result-object v1

    invoke-virtual {v1}, Linet/ipaddr/ipv6/e;->T()Linet/ipaddr/ipv6/e$a;

    move-result-object v11

    invoke-virtual {v11, v10}, Linet/ipaddr/format/validate/f;->d(I)[LZf/d;

    move-result-object v1

    move-object v15, v1

    check-cast v15, [Linet/ipaddr/ipv6/V;

    move v6, v0

    :goto_4
    if-ge v6, v10, :cond_6

    if-eqz v13, :cond_5

    invoke-interface {v12, v6}, Linet/ipaddr/l;->q(I)Linet/ipaddr/k;

    move-result-object v0

    invoke-virtual {v0}, Linet/ipaddr/k;->Q()I

    move-result v0

    invoke-static {v0}, Linet/ipaddr/format/validate/r;->I1(I)Ljava/lang/Integer;

    move-result-object v0

    move-object v5, v0

    goto :goto_5

    :cond_5
    const/4 v5, 0x0

    :goto_5
    const v2, 0xffff

    invoke-static {v6, v7, v8}, Linet/ipaddr/format/validate/r;->b2(ILinet/ipaddr/g$a;Linet/ipaddr/format/validate/i;)Ljava/lang/Integer;

    move-result-object v4

    const/4 v1, 0x0

    move-object/from16 v0, p0

    move v3, v6

    move/from16 v17, v6

    move-object v6, v11

    invoke-static/range {v0 .. v6}, Linet/ipaddr/format/validate/r;->M1(Linet/ipaddr/g$a;IIILjava/lang/Integer;Ljava/lang/Integer;Linet/ipaddr/format/validate/f;)Linet/ipaddr/k;

    move-result-object v0

    check-cast v0, Linet/ipaddr/ipv6/V;

    aput-object v0, v15, v17

    add-int/lit8 v6, v17, 0x1

    goto :goto_4

    :cond_6
    invoke-virtual/range {p1 .. p1}, Linet/ipaddr/format/validate/i;->o()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {v11, v15, v0, v9, v14}, Linet/ipaddr/format/validate/f;->o([LZf/d;Ljava/lang/CharSequence;LZf/f;Ljava/lang/Integer;)Linet/ipaddr/a;

    move-result-object v0

    check-cast v0, Linet/ipaddr/g;

    return-object v0
.end method

.method private static M1(Linet/ipaddr/g$a;IIILjava/lang/Integer;Ljava/lang/Integer;Linet/ipaddr/format/validate/f;)Linet/ipaddr/k;
    .locals 24

    if-eqz p5, :cond_1

    invoke-virtual/range {p5 .. p5}, Ljava/lang/Integer;->intValue()I

    move-result v0

    move/from16 v1, p1

    int-to-long v9, v1

    move/from16 v2, p2

    int-to-long v11, v2

    int-to-long v13, v0

    invoke-virtual/range {p6 .. p6}, Linet/ipaddr/format/validate/f;->y()I

    move-result v0

    int-to-long v7, v0

    move-wide v1, v9

    move-wide v3, v11

    move-wide v5, v13

    invoke-static/range {v1 .. v8}, Linet/ipaddr/format/validate/r;->o2(JJJJ)Linet/ipaddr/format/validate/r$j;

    move-result-object v0

    invoke-virtual {v0}, Linet/ipaddr/format/validate/r$j;->d()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0, v9, v10, v13, v14}, Linet/ipaddr/format/validate/r$j;->a(JJ)J

    move-result-wide v1

    long-to-int v1, v1

    invoke-virtual {v0, v11, v12, v13, v14}, Linet/ipaddr/format/validate/r$j;->c(JJ)J

    move-result-wide v2

    long-to-int v0, v2

    move/from16 v18, v0

    move/from16 v17, v1

    goto :goto_0

    :cond_0
    new-instance v0, Linet/ipaddr/IncompatibleAddressException;

    const-string v8, "ipaddress.error.maskMismatch"

    move-object v1, v0

    move-wide v2, v9

    move-wide v4, v11

    move-wide v6, v13

    invoke-direct/range {v1 .. v8}, Linet/ipaddr/IncompatibleAddressException;-><init>(JJJLjava/lang/String;)V

    throw v0

    :cond_1
    move/from16 v1, p1

    move/from16 v2, p2

    move/from16 v17, v1

    move/from16 v18, v2

    :goto_0
    const/16 v19, 0x0

    const/16 v20, 0x0

    const/4 v15, 0x0

    move-object/from16 v16, p0

    move/from16 v21, p3

    move-object/from16 v22, p4

    move-object/from16 v23, p6

    invoke-static/range {v15 .. v23}, Linet/ipaddr/format/validate/r;->R1(Ljava/lang/CharSequence;Linet/ipaddr/g$a;IIZLinet/ipaddr/format/validate/a;ILjava/lang/Integer;Linet/ipaddr/format/validate/f;)Linet/ipaddr/k;

    move-result-object v0

    return-object v0
.end method

.method private N1(ZZZ)V
    .locals 55

    move-object/from16 v9, p0

    invoke-virtual/range {p0 .. p0}, Linet/ipaddr/format/validate/c;->V0()Linet/ipaddr/format/validate/i;

    move-result-object v10

    invoke-virtual/range {p0 .. p0}, Linet/ipaddr/format/validate/r;->Y1()Linet/ipaddr/g;

    move-result-object v0

    const/4 v12, 0x1

    if-eqz v0, :cond_0

    invoke-virtual {v0, v12}, Linet/ipaddr/g;->W0(Z)Ljava/lang/Integer;

    move-result-object v1

    if-eqz v1, :cond_0

    const/4 v13, 0x0

    goto :goto_0

    :cond_0
    move-object v13, v0

    :goto_0
    if-eqz v13, :cond_1

    move v15, v12

    goto :goto_1

    :cond_1
    const/4 v15, 0x0

    :goto_1
    invoke-virtual/range {p0 .. p0}, Linet/ipaddr/format/validate/c;->U0()Linet/ipaddr/format/validate/a;

    move-result-object v8

    invoke-virtual {v8}, Linet/ipaddr/format/validate/a;->Z()I

    move-result v7

    if-eqz v15, :cond_2

    iget-object v0, v9, Linet/ipaddr/format/validate/r;->z:[Linet/ipaddr/format/validate/r$j;

    if-nez v0, :cond_2

    new-array v0, v7, [Linet/ipaddr/format/validate/r$j;

    iput-object v0, v9, Linet/ipaddr/format/validate/r;->z:[Linet/ipaddr/format/validate/r$j;

    :cond_2
    invoke-direct/range {p0 .. p0}, Linet/ipaddr/format/validate/r;->V1()Linet/ipaddr/ipv4/e$a;

    move-result-object v6

    rsub-int/lit8 v5, v7, 0x4

    const/4 v4, 0x4

    if-eqz p1, :cond_3

    invoke-virtual {v6, v4}, Linet/ipaddr/ipv4/e$a;->d1(I)[Linet/ipaddr/ipv4/M;

    move-result-object v0

    move-object v3, v0

    const/4 v0, 0x0

    goto :goto_2

    :cond_3
    if-eqz p2, :cond_42

    invoke-virtual {v6, v4}, Linet/ipaddr/ipv4/e$a;->d1(I)[Linet/ipaddr/ipv4/M;

    move-result-object v0

    const/4 v3, 0x0

    :goto_2
    iget-object v1, v9, Linet/ipaddr/format/validate/r;->y:Linet/ipaddr/format/validate/r$l;

    if-nez v1, :cond_4

    new-instance v1, Linet/ipaddr/format/validate/r$a;

    invoke-direct {v1, v9}, Linet/ipaddr/format/validate/r$a;-><init>(Linet/ipaddr/format/validate/r;)V

    iput-object v1, v9, Linet/ipaddr/format/validate/r;->y:Linet/ipaddr/format/validate/r$l;

    :cond_4
    move-object v2, v1

    if-gtz v5, :cond_5

    move v1, v12

    goto :goto_3

    :cond_5
    const/4 v1, 0x0

    :goto_3
    iget-object v11, v9, Linet/ipaddr/format/validate/a;->j:Ljava/lang/CharSequence;

    const/16 v16, -0x1

    move/from16 v17, v16

    move/from16 v18, v17

    const/4 v4, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    const/16 v19, 0x0

    const/16 v21, 0x0

    move/from16 v54, v1

    move-object v1, v0

    move/from16 v0, v54

    :goto_4
    if-ge v14, v7, :cond_36

    move-object/from16 v22, v1

    const/4 v1, 0x2

    move-object/from16 v31, v11

    move-object/from16 v32, v12

    invoke-virtual {v8, v14, v1}, Linet/ipaddr/format/validate/a;->o(II)J

    move-result-wide v11

    const/16 v1, 0xa

    move-object/from16 v33, v2

    invoke-virtual {v8, v14, v1}, Linet/ipaddr/format/validate/a;->o(II)J

    move-result-wide v1

    move-wide/from16 v34, v1

    if-nez v0, :cond_23

    add-int/lit8 v0, v7, -0x1

    if-ne v14, v0, :cond_6

    const/4 v0, 0x1

    goto :goto_5

    :cond_6
    const/4 v0, 0x0

    :goto_5
    invoke-virtual {v8, v14}, Linet/ipaddr/format/validate/a;->C(I)Z

    move-result v1

    if-nez v0, :cond_9

    invoke-virtual/range {p0 .. p0}, Linet/ipaddr/format/validate/c;->i1()Z

    move-result v0

    if-nez v0, :cond_7

    if-eqz v1, :cond_7

    const/4 v0, 0x1

    goto :goto_6

    :cond_7
    const/4 v0, 0x0

    :goto_6
    if-eqz v0, :cond_9

    add-int/lit8 v23, v14, 0x1

    move/from16 v2, v23

    :goto_7
    if-ge v2, v7, :cond_9

    invoke-virtual {v8, v2}, Linet/ipaddr/format/validate/a;->C(I)Z

    move-result v23

    if-eqz v23, :cond_8

    const/16 v37, 0x0

    goto :goto_8

    :cond_8
    add-int/lit8 v2, v2, 0x1

    goto :goto_7

    :cond_9
    move/from16 v37, v0

    :goto_8
    if-eqz v37, :cond_22

    if-eqz v1, :cond_a

    rsub-int/lit8 v0, v5, 0x3

    shl-int/lit8 v0, v0, 0x3

    ushr-int v0, v16, v0

    int-to-long v1, v0

    goto :goto_9

    :cond_a
    add-int v18, v14, v5

    move/from16 v17, v14

    move-wide/from16 v1, v34

    :goto_9
    rsub-int/lit8 v0, v7, 0x5

    const/16 v23, 0x8

    mul-int/lit8 v0, v0, 0x8

    if-eqz v15, :cond_11

    const-wide/16 v24, 0x0

    move-object/from16 v40, v3

    move/from16 v39, v7

    move-object/from16 v38, v8

    move-wide/from16 v7, v24

    const/4 v3, 0x0

    :goto_a
    if-gt v3, v5, :cond_b

    shl-long v7, v7, v23

    move/from16 v41, v5

    add-int v5, v4, v3

    invoke-interface {v13, v5}, Linet/ipaddr/l;->q(I)Linet/ipaddr/k;

    move-result-object v5

    invoke-virtual {v5}, Linet/ipaddr/k;->Q()I

    move-result v5

    move/from16 v42, v4

    int-to-long v4, v5

    or-long/2addr v7, v4

    add-int/lit8 v3, v3, 0x1

    move/from16 v5, v41

    move/from16 v4, v42

    const/16 v23, 0x8

    goto :goto_a

    :cond_b
    move/from16 v42, v4

    move/from16 v41, v5

    iget-object v3, v9, Linet/ipaddr/format/validate/r;->z:[Linet/ipaddr/format/validate/r$j;

    aget-object v4, v3, v14

    if-nez v4, :cond_d

    const/16 v4, 0x20

    if-ne v0, v4, :cond_c

    const-wide v4, 0xffffffffL

    :goto_b
    move-wide/from16 v29, v4

    goto :goto_c

    :cond_c
    shl-int v4, v16, v0

    not-int v4, v4

    int-to-long v4, v4

    goto :goto_b

    :goto_c
    move-wide/from16 v23, v11

    move-wide/from16 v25, v1

    move-wide/from16 v27, v7

    invoke-static/range {v23 .. v30}, Linet/ipaddr/format/validate/r;->o2(JJJJ)Linet/ipaddr/format/validate/r$j;

    move-result-object v4

    aput-object v4, v3, v14

    :cond_d
    invoke-virtual {v4}, Linet/ipaddr/format/validate/r$j;->d()Z

    move-result v3

    if-nez v3, :cond_e

    invoke-static/range {v33 .. v33}, Linet/ipaddr/format/validate/r$l;->n(Linet/ipaddr/format/validate/r$l;)Linet/ipaddr/IncompatibleAddressException;

    move-result-object v3

    if-nez v3, :cond_e

    new-instance v3, Linet/ipaddr/IncompatibleAddressException;

    const-string v30, "ipaddress.error.maskMismatch"

    move-object/from16 v23, v3

    move-wide/from16 v24, v11

    move-wide/from16 v26, v1

    move-wide/from16 v28, v7

    invoke-direct/range {v23 .. v30}, Linet/ipaddr/IncompatibleAddressException;-><init>(JJJLjava/lang/String;)V

    move-object/from16 v5, v33

    invoke-static {v5, v3}, Linet/ipaddr/format/validate/r$l;->o(Linet/ipaddr/format/validate/r$l;Linet/ipaddr/IncompatibleAddressException;)Linet/ipaddr/IncompatibleAddressException;

    goto :goto_d

    :cond_e
    move-object/from16 v5, v33

    :goto_d
    invoke-virtual {v4, v11, v12, v7, v8}, Linet/ipaddr/format/validate/r$j;->a(JJ)J

    move-result-wide v23

    invoke-virtual {v4, v1, v2, v7, v8}, Linet/ipaddr/format/validate/r$j;->c(JJ)J

    move-result-wide v3

    if-nez v21, :cond_10

    cmp-long v7, v23, v11

    if-nez v7, :cond_10

    cmp-long v7, v3, v1

    if-eqz v7, :cond_f

    goto :goto_e

    :cond_f
    const/16 v21, 0x0

    goto :goto_f

    :cond_10
    :goto_e
    const/16 v21, 0x1

    :goto_f
    move-wide/from16 v25, v23

    move-wide/from16 v23, v3

    goto :goto_10

    :cond_11
    move-object/from16 v40, v3

    move/from16 v42, v4

    move/from16 v41, v5

    move/from16 v39, v7

    move-object/from16 v38, v8

    move-object/from16 v5, v33

    move-wide/from16 v23, v1

    move-wide/from16 v25, v11

    :goto_10
    move-object/from16 v4, v19

    move-object/from16 v8, v22

    move-object/from16 v3, v32

    move/from16 v19, v41

    move/from16 v7, v42

    move/from16 v22, v0

    :goto_11
    if-ltz v19, :cond_21

    add-int/lit8 v22, v22, -0x8

    move-object/from16 v27, v4

    const/16 v4, 0x8

    invoke-static {v7, v4, v10}, Linet/ipaddr/format/validate/r;->a2(IILinet/ipaddr/format/validate/i;)Ljava/lang/Integer;

    move-result-object v28

    move-object/from16 v33, v5

    ushr-long v4, v11, v22

    long-to-int v4, v4

    and-int/lit16 v4, v4, 0xff

    cmp-long v5, v11, v1

    if-nez v5, :cond_12

    move v5, v4

    move-object/from16 v43, v10

    move-wide/from16 v44, v11

    goto :goto_12

    :cond_12
    move-object/from16 v43, v10

    move-wide/from16 v44, v11

    ushr-long v10, v1, v22

    long-to-int v5, v10

    and-int/lit16 v5, v5, 0xff

    :goto_12
    if-eqz v15, :cond_14

    ushr-long v10, v25, v22

    long-to-int v10, v10

    and-int/lit16 v10, v10, 0xff

    cmp-long v11, v25, v23

    if-nez v11, :cond_13

    move v11, v10

    goto :goto_13

    :cond_13
    ushr-long v11, v23, v22

    long-to-int v11, v11

    and-int/lit16 v11, v11, 0xff

    goto :goto_13

    :cond_14
    move v10, v4

    move v11, v5

    :goto_13
    if-eqz p1, :cond_17

    if-nez v21, :cond_15

    if-eqz v28, :cond_16

    :cond_15
    move-object/from16 v20, v8

    move-object/from16 v8, v40

    const/4 v12, 0x4

    goto :goto_14

    :cond_16
    move v12, v0

    move-wide/from16 v46, v1

    move-object/from16 v29, v3

    move-object/from16 v36, v6

    move/from16 v20, v15

    move-object/from16 v48, v27

    move-object/from16 v9, v38

    move-object/from16 v15, v40

    move-object/from16 v40, v33

    move/from16 v33, v41

    move-object/from16 v41, v13

    move-object v13, v8

    move v8, v7

    goto :goto_15

    :goto_14
    invoke-static {v3, v8, v6, v12, v7}, Linet/ipaddr/format/validate/r;->H1([Linet/ipaddr/k;[Linet/ipaddr/k;Linet/ipaddr/c$a;II)[Linet/ipaddr/k;

    move-result-object v3

    move-object/from16 v29, v3

    check-cast v29, [Linet/ipaddr/ipv4/M;

    sget-object v3, Linet/ipaddr/g$a;->IPV4:Linet/ipaddr/g$a;

    const/16 v30, 0x0

    const/16 v32, 0x0

    move v12, v0

    move-object/from16 v0, p0

    move-wide/from16 v46, v1

    move-object/from16 v1, v31

    move-object/from16 v40, v33

    move-object v2, v3

    move v3, v4

    move-object/from16 v48, v27

    move v4, v5

    move/from16 v33, v41

    move/from16 v5, v30

    move-object/from16 v36, v6

    move v6, v14

    move/from16 v49, v7

    move-object/from16 v7, v32

    move-object/from16 v41, v13

    move-object/from16 v13, v20

    move-object/from16 v9, v38

    move/from16 v20, v15

    move-object v15, v8

    move-object/from16 v8, v36

    invoke-direct/range {v0 .. v8}, Linet/ipaddr/format/validate/r;->T1(Ljava/lang/CharSequence;Linet/ipaddr/g$a;IIZILjava/lang/Integer;Linet/ipaddr/format/validate/f;)Linet/ipaddr/k;

    move-result-object v0

    check-cast v0, Linet/ipaddr/ipv4/M;

    move/from16 v8, v49

    aput-object v0, v29, v8

    :goto_15
    sget-object v2, Linet/ipaddr/g$a;->IPV4:Linet/ipaddr/g$a;

    const/4 v5, 0x0

    move-object/from16 v0, p0

    move-object/from16 v1, v31

    move v3, v10

    move v4, v11

    move v6, v14

    move-object/from16 v7, v28

    move-object/from16 v38, v9

    move v9, v8

    move-object/from16 v8, v36

    invoke-direct/range {v0 .. v8}, Linet/ipaddr/format/validate/r;->T1(Ljava/lang/CharSequence;Linet/ipaddr/g$a;IIZILjava/lang/Integer;Linet/ipaddr/format/validate/f;)Linet/ipaddr/k;

    move-result-object v0

    check-cast v0, Linet/ipaddr/ipv4/M;

    aput-object v0, v15, v9

    goto :goto_16

    :cond_17
    move v12, v0

    move-wide/from16 v46, v1

    move-object/from16 v36, v6

    move v9, v7

    move/from16 v20, v15

    move-object/from16 v48, v27

    move-object/from16 v15, v40

    move-object/from16 v40, v33

    move/from16 v33, v41

    move-object/from16 v41, v13

    move-object v13, v8

    move-object/from16 v29, v3

    :goto_16
    if-eqz p2, :cond_20

    if-eq v10, v11, :cond_18

    const/16 v27, 0x1

    goto :goto_17

    :cond_18
    const/16 v27, 0x0

    :goto_17
    if-eqz p1, :cond_1b

    if-eqz v27, :cond_19

    goto :goto_18

    :cond_19
    if-eqz v13, :cond_1a

    aget-object v0, v15, v9

    aput-object v0, v13, v9

    :cond_1a
    const/4 v10, 0x4

    goto :goto_19

    :cond_1b
    :goto_18
    move-object/from16 v8, v36

    const/4 v7, 0x4

    if-eqz p1, :cond_1c

    invoke-static {v13, v15, v8, v7, v9}, Linet/ipaddr/format/validate/r;->H1([Linet/ipaddr/k;[Linet/ipaddr/k;Linet/ipaddr/c$a;II)[Linet/ipaddr/k;

    move-result-object v0

    check-cast v0, [Linet/ipaddr/ipv4/M;

    move-object v13, v0

    :cond_1c
    sget-object v2, Linet/ipaddr/g$a;->IPV4:Linet/ipaddr/g$a;

    const/4 v5, 0x0

    move-object/from16 v0, p0

    move-object/from16 v1, v31

    move v3, v10

    move v4, v10

    move v6, v14

    move v10, v7

    move-object/from16 v7, v28

    move-object/from16 v36, v8

    invoke-direct/range {v0 .. v8}, Linet/ipaddr/format/validate/r;->T1(Ljava/lang/CharSequence;Linet/ipaddr/g$a;IIZILjava/lang/Integer;Linet/ipaddr/format/validate/f;)Linet/ipaddr/k;

    move-result-object v0

    check-cast v0, Linet/ipaddr/ipv4/M;

    aput-object v0, v13, v9

    :goto_19
    if-eqz p3, :cond_1e

    if-eqz v27, :cond_1d

    move-object/from16 v8, v36

    move-object/from16 v0, v48

    invoke-static {v0, v13, v8, v10, v9}, Linet/ipaddr/format/validate/r;->H1([Linet/ipaddr/k;[Linet/ipaddr/k;Linet/ipaddr/c$a;II)[Linet/ipaddr/k;

    move-result-object v0

    move-object/from16 v27, v0

    check-cast v27, [Linet/ipaddr/ipv4/M;

    sget-object v2, Linet/ipaddr/g$a;->IPV4:Linet/ipaddr/g$a;

    const/4 v5, 0x0

    move-object/from16 v0, p0

    move-object/from16 v1, v31

    move v3, v11

    move v4, v11

    move v6, v14

    move-object/from16 v7, v28

    move-object v11, v8

    invoke-direct/range {v0 .. v8}, Linet/ipaddr/format/validate/r;->T1(Ljava/lang/CharSequence;Linet/ipaddr/g$a;IIZILjava/lang/Integer;Linet/ipaddr/format/validate/f;)Linet/ipaddr/k;

    move-result-object v0

    check-cast v0, Linet/ipaddr/ipv4/M;

    aput-object v0, v27, v9

    move-object v8, v13

    move-object/from16 v4, v27

    goto :goto_1b

    :cond_1d
    move-object/from16 v11, v36

    move-object/from16 v0, v48

    if-eqz v0, :cond_1f

    aget-object v1, v13, v9

    aput-object v1, v0, v9

    goto :goto_1a

    :cond_1e
    move-object/from16 v11, v36

    move-object/from16 v0, v48

    :cond_1f
    :goto_1a
    move-object v4, v0

    move-object v8, v13

    goto :goto_1b

    :cond_20
    move-object/from16 v11, v36

    move-object/from16 v0, v48

    const/4 v10, 0x4

    goto :goto_1a

    :goto_1b
    add-int/lit8 v7, v9, 0x1

    add-int/lit8 v19, v19, -0x1

    move-object/from16 v9, p0

    move-object v6, v11

    move v0, v12

    move-object/from16 v3, v29

    move-object/from16 v5, v40

    move-object/from16 v13, v41

    move-object/from16 v10, v43

    move-wide/from16 v11, v44

    move-wide/from16 v1, v46

    move-object/from16 v40, v15

    move/from16 v15, v20

    move/from16 v41, v33

    goto/16 :goto_11

    :cond_21
    move v12, v0

    move-object v0, v4

    move-object v11, v6

    move v9, v7

    move-object/from16 v43, v10

    move/from16 v20, v15

    move-object/from16 v1, v38

    move-object/from16 v15, v40

    move/from16 v33, v41

    const/4 v10, 0x4

    move-object/from16 v40, v5

    move-object/from16 v41, v13

    move-object v13, v8

    invoke-virtual {v1, v14, v12}, Linet/ipaddr/format/validate/a;->d0(II)V

    move-object/from16 v19, v0

    move-object v12, v3

    move v4, v9

    move-object v9, v11

    move/from16 v0, v37

    move-object/from16 v22, v43

    move-object v3, v1

    move-object v1, v13

    goto/16 :goto_2c

    :cond_22
    move/from16 v42, v4

    move/from16 v39, v7

    move-object v1, v8

    move-object/from16 v43, v10

    move-wide/from16 v44, v11

    move-object/from16 v41, v13

    move/from16 v20, v15

    move-object/from16 v40, v33

    const/4 v10, 0x4

    move-object v15, v3

    move/from16 v33, v5

    move-object v11, v6

    goto :goto_1c

    :cond_23
    move/from16 v42, v4

    move/from16 v39, v7

    move-object v1, v8

    move-object/from16 v43, v10

    move-wide/from16 v44, v11

    move-object/from16 v41, v13

    move/from16 v20, v15

    move-object/from16 v40, v33

    const/4 v10, 0x4

    move-object v15, v3

    move/from16 v33, v5

    move-object v11, v6

    move/from16 v37, v0

    :goto_1c
    move-object/from16 v9, p0

    move-object v12, v1

    if-eqz v20, :cond_29

    iget-object v0, v9, Linet/ipaddr/format/validate/r;->z:[Linet/ipaddr/format/validate/r$j;

    aget-object v0, v0, v14

    move-object/from16 v13, v41

    move/from16 v4, v42

    invoke-interface {v13, v4}, Linet/ipaddr/l;->q(I)Linet/ipaddr/k;

    move-result-object v1

    invoke-virtual {v1}, Linet/ipaddr/k;->Q()I

    move-result v1

    if-nez v0, :cond_24

    iget-object v0, v9, Linet/ipaddr/format/validate/r;->z:[Linet/ipaddr/format/validate/r$j;

    int-to-long v2, v1

    invoke-virtual {v11}, Linet/ipaddr/ipv4/e$a;->y()I

    move-result v5

    int-to-long v5, v5

    move-wide/from16 v23, v44

    move-wide/from16 v25, v34

    move-wide/from16 v27, v2

    move-wide/from16 v29, v5

    invoke-static/range {v23 .. v30}, Linet/ipaddr/format/validate/r;->o2(JJJJ)Linet/ipaddr/format/validate/r$j;

    move-result-object v2

    aput-object v2, v0, v14

    move-object v0, v2

    :cond_24
    invoke-virtual {v0}, Linet/ipaddr/format/validate/r$j;->d()Z

    move-result v2

    if-nez v2, :cond_25

    invoke-static/range {v40 .. v40}, Linet/ipaddr/format/validate/r$l;->n(Linet/ipaddr/format/validate/r$l;)Linet/ipaddr/IncompatibleAddressException;

    move-result-object v2

    if-nez v2, :cond_25

    new-instance v2, Linet/ipaddr/IncompatibleAddressException;

    int-to-long v5, v1

    const-string v30, "ipaddress.error.maskMismatch"

    move-object/from16 v23, v2

    move-wide/from16 v24, v44

    move-wide/from16 v26, v34

    move-wide/from16 v28, v5

    invoke-direct/range {v23 .. v30}, Linet/ipaddr/IncompatibleAddressException;-><init>(JJJLjava/lang/String;)V

    move-object/from16 v8, v40

    invoke-static {v8, v2}, Linet/ipaddr/format/validate/r$l;->o(Linet/ipaddr/format/validate/r$l;Linet/ipaddr/IncompatibleAddressException;)Linet/ipaddr/IncompatibleAddressException;

    goto :goto_1d

    :cond_25
    move-object/from16 v8, v40

    :goto_1d
    int-to-long v1, v1

    move-object/from16 v36, v11

    move-wide/from16 v5, v44

    invoke-virtual {v0, v5, v6, v1, v2}, Linet/ipaddr/format/validate/r$j;->a(JJ)J

    move-result-wide v10

    long-to-int v3, v10

    int-to-long v10, v3

    move-object/from16 v40, v8

    move-wide/from16 v7, v34

    invoke-virtual {v0, v7, v8, v1, v2}, Linet/ipaddr/format/validate/r$j;->c(JJ)J

    move-result-wide v0

    long-to-int v0, v0

    int-to-long v0, v0

    cmp-long v2, v5, v10

    if-nez v2, :cond_26

    cmp-long v2, v7, v0

    if-nez v2, :cond_26

    const/4 v2, 0x1

    goto :goto_1e

    :cond_26
    const/4 v2, 0x0

    :goto_1e
    if-nez v21, :cond_28

    if-nez v2, :cond_27

    goto :goto_1f

    :cond_27
    const/16 v21, 0x0

    goto :goto_20

    :cond_28
    :goto_1f
    const/16 v21, 0x1

    :goto_20
    move/from16 v23, v21

    move/from16 v21, v2

    move-wide v2, v10

    move-wide v10, v0

    move-object/from16 v1, v43

    const/16 v0, 0x8

    goto :goto_21

    :cond_29
    move-object/from16 v36, v11

    move-wide/from16 v7, v34

    move-object/from16 v13, v41

    move/from16 v4, v42

    move-wide/from16 v5, v44

    move-wide v2, v5

    move-wide v10, v7

    move/from16 v23, v21

    move-object/from16 v1, v43

    const/16 v0, 0x8

    const/16 v21, 0x1

    :goto_21
    invoke-static {v4, v0, v1}, Linet/ipaddr/format/validate/r;->a2(IILinet/ipaddr/format/validate/i;)Ljava/lang/Integer;

    move-result-object v24

    if-eqz p1, :cond_2c

    if-nez v23, :cond_2a

    if-eqz v24, :cond_2b

    :cond_2a
    move-object/from16 v43, v1

    move-object/from16 v1, v32

    move-object/from16 v9, v36

    const/4 v0, 0x4

    goto :goto_22

    :cond_2b
    move-wide/from16 v51, v2

    move v8, v4

    move-object/from16 v41, v13

    move-object/from16 v50, v22

    move-object/from16 v25, v32

    move-object/from16 v9, v36

    move-object/from16 v13, v40

    move-object/from16 v22, v1

    goto :goto_23

    :goto_22
    invoke-static {v1, v15, v9, v0, v4}, Linet/ipaddr/format/validate/r;->H1([Linet/ipaddr/k;[Linet/ipaddr/k;Linet/ipaddr/c$a;II)[Linet/ipaddr/k;

    move-result-object v1

    move-object/from16 v25, v1

    check-cast v25, [Linet/ipaddr/ipv4/M;

    sget-object v26, Linet/ipaddr/g$a;->IPV4:Linet/ipaddr/g$a;

    long-to-int v5, v5

    long-to-int v6, v7

    const/4 v7, 0x1

    const/4 v8, 0x0

    const/16 v1, 0x8

    move-object/from16 v0, p0

    move-object/from16 v50, v22

    move-object/from16 v22, v43

    move-object/from16 v1, v31

    move-wide/from16 v51, v2

    move-object/from16 v2, v26

    move v3, v5

    move v5, v4

    move v4, v6

    move v6, v5

    move v5, v7

    move v7, v6

    move v6, v14

    move/from16 v53, v7

    move-object v7, v8

    move-object/from16 v41, v13

    move-object/from16 v13, v40

    move-object v8, v9

    invoke-direct/range {v0 .. v8}, Linet/ipaddr/format/validate/r;->T1(Ljava/lang/CharSequence;Linet/ipaddr/g$a;IIZILjava/lang/Integer;Linet/ipaddr/format/validate/f;)Linet/ipaddr/k;

    move-result-object v0

    check-cast v0, Linet/ipaddr/ipv4/M;

    move/from16 v8, v53

    aput-object v0, v25, v8

    :goto_23
    sget-object v2, Linet/ipaddr/g$a;->IPV4:Linet/ipaddr/g$a;

    move-wide/from16 v6, v51

    long-to-int v3, v6

    long-to-int v4, v10

    move-object/from16 v0, p0

    move-object/from16 v1, v31

    move/from16 v5, v21

    move-object/from16 v38, v12

    move-object/from16 v40, v13

    move-wide v12, v6

    move v6, v14

    move-object/from16 v7, v24

    move/from16 v21, v14

    move v14, v8

    move-object v8, v9

    invoke-direct/range {v0 .. v8}, Linet/ipaddr/format/validate/r;->T1(Ljava/lang/CharSequence;Linet/ipaddr/g$a;IIZILjava/lang/Integer;Linet/ipaddr/format/validate/f;)Linet/ipaddr/k;

    move-result-object v0

    check-cast v0, Linet/ipaddr/ipv4/M;

    aput-object v0, v15, v14

    goto :goto_24

    :cond_2c
    move-object/from16 v38, v12

    move-object/from16 v41, v13

    move/from16 v21, v14

    move-object/from16 v50, v22

    move-object/from16 v9, v36

    move-object/from16 v22, v1

    move-wide v12, v2

    move v14, v4

    move-object/from16 v1, v32

    move-object/from16 v25, v1

    :goto_24
    if-eqz p2, :cond_35

    cmp-long v0, v12, v10

    if-eqz v0, :cond_2d

    const/16 v26, 0x1

    goto :goto_25

    :cond_2d
    const/16 v26, 0x0

    :goto_25
    if-eqz p1, :cond_2e

    if-eqz v26, :cond_2f

    :cond_2e
    move-object/from16 v0, v50

    goto :goto_26

    :cond_2f
    move-object/from16 v0, v50

    if-eqz v0, :cond_30

    aget-object v1, v15, v14

    aput-object v1, v0, v14

    :cond_30
    move-object v12, v0

    goto :goto_28

    :goto_26
    if-eqz p1, :cond_31

    const/4 v1, 0x4

    invoke-static {v0, v15, v9, v1, v14}, Linet/ipaddr/format/validate/r;->H1([Linet/ipaddr/k;[Linet/ipaddr/k;Linet/ipaddr/c$a;II)[Linet/ipaddr/k;

    move-result-object v0

    move-object v1, v0

    check-cast v1, [Linet/ipaddr/ipv4/M;

    move-object/from16 v27, v1

    goto :goto_27

    :cond_31
    move-object/from16 v27, v0

    :goto_27
    sget-object v2, Linet/ipaddr/g$a;->IPV4:Linet/ipaddr/g$a;

    long-to-int v4, v12

    const/4 v5, 0x0

    move-object/from16 v0, p0

    move-object/from16 v1, v31

    move v3, v4

    move/from16 v6, v21

    move-object/from16 v7, v24

    move-object v8, v9

    invoke-direct/range {v0 .. v8}, Linet/ipaddr/format/validate/r;->T1(Ljava/lang/CharSequence;Linet/ipaddr/g$a;IIZILjava/lang/Integer;Linet/ipaddr/format/validate/f;)Linet/ipaddr/k;

    move-result-object v0

    check-cast v0, Linet/ipaddr/ipv4/M;

    aput-object v0, v27, v14

    move-object/from16 v12, v27

    :goto_28
    if-eqz p3, :cond_33

    if-eqz v26, :cond_32

    move-object/from16 v2, v19

    const/4 v0, 0x4

    invoke-static {v2, v12, v9, v0, v14}, Linet/ipaddr/format/validate/r;->H1([Linet/ipaddr/k;[Linet/ipaddr/k;Linet/ipaddr/c$a;II)[Linet/ipaddr/k;

    move-result-object v1

    move-object/from16 v19, v1

    check-cast v19, [Linet/ipaddr/ipv4/M;

    sget-object v2, Linet/ipaddr/g$a;->IPV4:Linet/ipaddr/g$a;

    long-to-int v4, v10

    const/4 v5, 0x0

    move-object/from16 v0, p0

    move-object/from16 v1, v31

    move v3, v4

    move/from16 v6, v21

    move-object/from16 v7, v24

    move-object v8, v9

    invoke-direct/range {v0 .. v8}, Linet/ipaddr/format/validate/r;->T1(Ljava/lang/CharSequence;Linet/ipaddr/g$a;IIZILjava/lang/Integer;Linet/ipaddr/format/validate/f;)Linet/ipaddr/k;

    move-result-object v0

    check-cast v0, Linet/ipaddr/ipv4/M;

    aput-object v0, v19, v14

    :goto_29
    move-object v1, v12

    goto :goto_2b

    :cond_32
    move-object/from16 v2, v19

    if-eqz v2, :cond_34

    aget-object v0, v12, v14

    aput-object v0, v2, v14

    goto :goto_2a

    :cond_33
    move-object/from16 v2, v19

    :cond_34
    :goto_2a
    move-object/from16 v19, v2

    goto :goto_29

    :cond_35
    move-object/from16 v2, v19

    move-object/from16 v0, v50

    move-object v1, v0

    :goto_2b
    add-int/lit8 v4, v14, 0x1

    move/from16 v14, v21

    move-object/from16 v3, v38

    const/16 v0, 0x8

    invoke-virtual {v3, v14, v0}, Linet/ipaddr/format/validate/a;->d0(II)V

    move/from16 v21, v23

    move-object/from16 v12, v25

    move/from16 v0, v37

    :goto_2c
    add-int/lit8 v14, v14, 0x1

    move-object v8, v3

    move-object v6, v9

    move-object v3, v15

    move/from16 v15, v20

    move-object/from16 v10, v22

    move-object/from16 v11, v31

    move/from16 v5, v33

    move/from16 v7, v39

    move-object/from16 v2, v40

    move-object/from16 v13, v41

    move-object/from16 v9, p0

    goto/16 :goto_4

    :cond_36
    move-object v0, v1

    move-object/from16 v40, v2

    move-object v15, v3

    move-object v9, v6

    move-object/from16 v22, v10

    move-object/from16 v31, v11

    move-object v1, v12

    move-object/from16 v2, v19

    invoke-static/range {v22 .. v22}, Linet/ipaddr/format/validate/r;->X1(Linet/ipaddr/format/validate/i;)Ljava/lang/Integer;

    move-result-object v3

    if-eqz p1, :cond_39

    invoke-virtual {v9, v15, v3}, Linet/ipaddr/format/validate/f;->p([LZf/d;Ljava/lang/Integer;)LZf/c;

    move-result-object v4

    check-cast v4, Linet/ipaddr/ipv4/I;

    move-object/from16 v5, v40

    invoke-static {v5, v4}, Linet/ipaddr/format/validate/r$l;->s(Linet/ipaddr/format/validate/r$l;Linet/ipaddr/j;)Linet/ipaddr/j;

    const-string v6, "ipaddress.error.invalid.joined.ranges"

    if-eqz v1, :cond_38

    invoke-virtual {v9, v1}, Linet/ipaddr/format/validate/f;->t([LZf/d;)LZf/c;

    move-result-object v1

    move-object v11, v1

    check-cast v11, Linet/ipaddr/ipv4/I;

    invoke-static {v5, v11}, Linet/ipaddr/format/validate/r$l;->t(Linet/ipaddr/format/validate/r$l;Linet/ipaddr/j;)Linet/ipaddr/j;

    move/from16 v1, v17

    move/from16 v7, v18

    invoke-static {v11, v1, v7}, Linet/ipaddr/format/validate/r;->J1(Linet/ipaddr/j;II)Z

    move-result v8

    if-eqz v8, :cond_37

    new-instance v8, Linet/ipaddr/IncompatibleAddressException;

    move-object/from16 v10, v31

    invoke-direct {v8, v10, v6}, Linet/ipaddr/IncompatibleAddressException;-><init>(Ljava/lang/CharSequence;Ljava/lang/String;)V

    invoke-static {v5, v8}, Linet/ipaddr/format/validate/r$l;->m(Linet/ipaddr/format/validate/r$l;Linet/ipaddr/IncompatibleAddressException;)Linet/ipaddr/IncompatibleAddressException;

    goto :goto_2d

    :cond_37
    move-object/from16 v10, v31

    goto :goto_2d

    :cond_38
    move/from16 v1, v17

    move/from16 v7, v18

    move-object/from16 v10, v31

    const/4 v11, 0x0

    :goto_2d
    invoke-static {v4, v1, v7}, Linet/ipaddr/format/validate/r;->J1(Linet/ipaddr/j;II)Z

    move-result v1

    if-eqz v1, :cond_3a

    new-instance v1, Linet/ipaddr/IncompatibleAddressException;

    invoke-direct {v1, v10, v6}, Linet/ipaddr/IncompatibleAddressException;-><init>(Ljava/lang/CharSequence;Ljava/lang/String;)V

    invoke-static {v5, v1}, Linet/ipaddr/format/validate/r$l;->r(Linet/ipaddr/format/validate/r$l;Linet/ipaddr/IncompatibleAddressException;)Linet/ipaddr/IncompatibleAddressException;

    if-nez v11, :cond_3a

    invoke-static {v5}, Linet/ipaddr/format/validate/r$l;->p(Linet/ipaddr/format/validate/r$l;)Linet/ipaddr/IncompatibleAddressException;

    move-result-object v1

    invoke-static {v5, v1}, Linet/ipaddr/format/validate/r$l;->m(Linet/ipaddr/format/validate/r$l;Linet/ipaddr/IncompatibleAddressException;)Linet/ipaddr/IncompatibleAddressException;

    goto :goto_2e

    :cond_39
    move-object/from16 v5, v40

    :cond_3a
    :goto_2e
    if-eqz p2, :cond_42

    invoke-static/range {v22 .. v22}, Linet/ipaddr/format/validate/r;->X1(Linet/ipaddr/format/validate/i;)Ljava/lang/Integer;

    move-result-object v29

    if-eqz v29, :cond_3f

    invoke-virtual/range {p0 .. p0}, Linet/ipaddr/format/validate/r;->getParameters()Linet/ipaddr/o;

    move-result-object v1

    invoke-virtual {v1}, Linet/ipaddr/o;->p()Linet/ipaddr/ipv4/Z;

    move-result-object v1

    invoke-virtual {v1}, Linet/ipaddr/ipv4/Z;->r()Linet/ipaddr/ipv4/e;

    move-result-object v1

    if-eqz p1, :cond_3b

    move-object v4, v15

    move-object v6, v4

    goto :goto_30

    :cond_3b
    if-nez v2, :cond_3c

    move-object v4, v0

    goto :goto_2f

    :cond_3c
    move-object v4, v2

    :goto_2f
    move-object v6, v4

    move-object v4, v0

    :goto_30
    new-instance v7, Linet/ipaddr/format/validate/l;

    invoke-direct {v7, v4}, Linet/ipaddr/format/validate/l;-><init>([Linet/ipaddr/ipv4/M;)V

    new-instance v8, Linet/ipaddr/format/validate/m;

    invoke-direct {v8, v6}, Linet/ipaddr/format/validate/m;-><init>([Linet/ipaddr/ipv4/M;)V

    array-length v4, v4

    invoke-virtual {v1}, Linet/ipaddr/c;->d()Linet/ipaddr/c$b;

    move-result-object v30

    const/16 v31, 0x0

    const/16 v26, 0x1

    const/16 v27, 0x8

    const/16 v28, 0xff

    move-object/from16 v23, v7

    move-object/from16 v24, v8

    move/from16 v25, v4

    invoke-static/range {v23 .. v31}, Linet/ipaddr/format/validate/g;->h(Linet/ipaddr/a$a;Linet/ipaddr/a$a;IIIILjava/lang/Integer;Linet/ipaddr/c$b;Z)Z

    move-result v14

    if-eqz v14, :cond_3e

    const/4 v1, 0x4

    if-nez v0, :cond_3d

    invoke-static {v0, v15, v9, v1, v1}, Linet/ipaddr/format/validate/r;->H1([Linet/ipaddr/k;[Linet/ipaddr/k;Linet/ipaddr/c$a;II)[Linet/ipaddr/k;

    move-result-object v0

    check-cast v0, [Linet/ipaddr/ipv4/M;

    :cond_3d
    if-nez v2, :cond_3e

    invoke-static {v2, v0, v9, v1, v1}, Linet/ipaddr/format/validate/r;->H1([Linet/ipaddr/k;[Linet/ipaddr/k;Linet/ipaddr/c$a;II)[Linet/ipaddr/k;

    move-result-object v1

    move-object/from16 v19, v1

    check-cast v19, [Linet/ipaddr/ipv4/M;

    move-object v1, v0

    goto :goto_31

    :cond_3e
    move-object v1, v0

    move-object/from16 v19, v2

    :goto_31
    move-object/from16 v2, v19

    goto :goto_32

    :cond_3f
    move-object v1, v0

    const/4 v14, 0x0

    :goto_32
    if-eqz v1, :cond_40

    const/4 v0, 0x1

    invoke-virtual {v9, v1, v3, v0}, Linet/ipaddr/format/validate/f;->r([LZf/d;Ljava/lang/Integer;Z)LZf/c;

    move-result-object v0

    check-cast v0, Linet/ipaddr/ipv4/I;

    invoke-virtual {v0}, Linet/ipaddr/ipv4/I;->m3()Linet/ipaddr/ipv4/I;

    move-result-object v0

    invoke-static {v5, v0}, Linet/ipaddr/format/validate/r$l;->d(Linet/ipaddr/format/validate/r$l;Linet/ipaddr/j;)Linet/ipaddr/j;

    :cond_40
    if-eqz v2, :cond_42

    invoke-virtual {v9, v2, v3}, Linet/ipaddr/format/validate/f;->p([LZf/d;Ljava/lang/Integer;)LZf/c;

    move-result-object v0

    check-cast v0, Linet/ipaddr/ipv4/I;

    if-eqz v14, :cond_41

    invoke-virtual {v0}, Linet/ipaddr/ipv4/I;->g4()Linet/ipaddr/ipv4/I;

    move-result-object v0

    :cond_41
    invoke-virtual {v0}, Linet/ipaddr/ipv4/I;->v3()Linet/ipaddr/ipv4/I;

    move-result-object v0

    invoke-static {v5, v0}, Linet/ipaddr/format/validate/r$l;->h(Linet/ipaddr/format/validate/r$l;Linet/ipaddr/j;)Linet/ipaddr/j;

    :cond_42
    return-void
.end method

.method private static O1(Linet/ipaddr/format/validate/r$l;Lag/g;IIIILjava/lang/Integer;Linet/ipaddr/ipv6/e$a;)Linet/ipaddr/ipv6/V;
    .locals 5

    const/16 v0, 0x8

    if-eq p2, p3, :cond_6

    const-string v1, "ipaddress.error.invalidMixedRange"

    const/16 v2, 0xff

    if-eqz p6, :cond_3

    invoke-virtual {p7}, Linet/ipaddr/ipv6/e$a;->j1()Linet/ipaddr/ipv6/e;

    move-result-object v3

    invoke-virtual {v3}, Linet/ipaddr/ipv6/e;->d()Linet/ipaddr/c$b;

    move-result-object v3

    invoke-virtual {v3}, Linet/ipaddr/c$b;->allPrefixedAddressesAreSubnets()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-virtual {p6}, Ljava/lang/Integer;->intValue()I

    move-result v3

    if-le v3, v0, :cond_2

    invoke-virtual {p6}, Ljava/lang/Integer;->intValue()I

    move-result v3

    sub-int/2addr v3, v0

    rsub-int/lit8 v3, v3, 0x8

    shl-int v3, v2, v3

    and-int/2addr v3, v2

    not-int v4, v3

    and-int/2addr v4, v2

    and-int/2addr p4, v3

    or-int/2addr p5, v4

    invoke-static {p0}, Linet/ipaddr/format/validate/r$l;->j(Linet/ipaddr/format/validate/r$l;)Linet/ipaddr/IncompatibleAddressException;

    move-result-object v3

    if-nez v3, :cond_0

    if-nez p4, :cond_1

    :cond_0
    if-eq p5, v2, :cond_6

    :cond_1
    new-instance v2, Linet/ipaddr/IncompatibleAddressException;

    invoke-direct {v2, p1, v1}, Linet/ipaddr/IncompatibleAddressException;-><init>(Lag/g;Ljava/lang/String;)V

    invoke-static {p0, v2}, Linet/ipaddr/format/validate/r$l;->l(Linet/ipaddr/format/validate/r$l;Linet/ipaddr/IncompatibleAddressException;)Linet/ipaddr/IncompatibleAddressException;

    goto :goto_0

    :cond_2
    const/4 p4, 0x0

    move p5, v2

    goto :goto_0

    :cond_3
    invoke-static {p0}, Linet/ipaddr/format/validate/r$l;->j(Linet/ipaddr/format/validate/r$l;)Linet/ipaddr/IncompatibleAddressException;

    move-result-object v3

    if-nez v3, :cond_4

    if-nez p4, :cond_5

    :cond_4
    if-eq p5, v2, :cond_6

    :cond_5
    new-instance v2, Linet/ipaddr/IncompatibleAddressException;

    invoke-direct {v2, p1, v1}, Linet/ipaddr/IncompatibleAddressException;-><init>(Lag/g;Ljava/lang/String;)V

    invoke-static {p0, v2}, Linet/ipaddr/format/validate/r$l;->l(Linet/ipaddr/format/validate/r$l;Linet/ipaddr/IncompatibleAddressException;)Linet/ipaddr/IncompatibleAddressException;

    :cond_6
    :goto_0
    shl-int/lit8 p0, p2, 0x8

    or-int/2addr p0, p4

    shl-int/lit8 p1, p3, 0x8

    or-int/2addr p1, p5

    invoke-virtual {p7, p0, p1, p6}, Linet/ipaddr/ipv6/e$a;->f1(IILjava/lang/Integer;)Linet/ipaddr/ipv6/V;

    move-result-object p0

    return-object p0
.end method

.method private P1(ZZZ)V
    .locals 76

    move-object/from16 v9, p0

    invoke-virtual/range {p0 .. p0}, Linet/ipaddr/format/validate/c;->V0()Linet/ipaddr/format/validate/i;

    move-result-object v10

    invoke-virtual/range {p0 .. p0}, Linet/ipaddr/format/validate/r;->Y1()Linet/ipaddr/g;

    move-result-object v0

    const/4 v12, 0x1

    if-eqz v0, :cond_0

    invoke-virtual {v0, v12}, Linet/ipaddr/g;->W0(Z)Ljava/lang/Integer;

    move-result-object v1

    if-eqz v1, :cond_0

    const/4 v13, 0x0

    goto :goto_0

    :cond_0
    move-object v13, v0

    :goto_0
    if-eqz v13, :cond_1

    move v15, v12

    goto :goto_1

    :cond_1
    const/4 v15, 0x0

    :goto_1
    invoke-virtual/range {p0 .. p0}, Linet/ipaddr/format/validate/c;->U0()Linet/ipaddr/format/validate/a;

    move-result-object v8

    invoke-virtual {v8}, Linet/ipaddr/format/validate/a;->Z()I

    move-result v7

    if-eqz v15, :cond_2

    iget-object v0, v9, Linet/ipaddr/format/validate/r;->z:[Linet/ipaddr/format/validate/r$j;

    if-nez v0, :cond_2

    new-array v0, v7, [Linet/ipaddr/format/validate/r$j;

    iput-object v0, v9, Linet/ipaddr/format/validate/r;->z:[Linet/ipaddr/format/validate/r$j;

    :cond_2
    invoke-direct/range {p0 .. p0}, Linet/ipaddr/format/validate/r;->W1()Linet/ipaddr/ipv6/e$a;

    move-result-object v6

    const/16 v5, 0x8

    if-eqz p1, :cond_3

    invoke-virtual {v6, v5}, Linet/ipaddr/ipv6/e$a;->h1(I)[Linet/ipaddr/ipv6/V;

    move-result-object v0

    move-object v4, v0

    const/4 v0, 0x0

    goto :goto_2

    :cond_3
    if-eqz p2, :cond_7a

    invoke-virtual {v6, v5}, Linet/ipaddr/ipv6/e$a;->h1(I)[Linet/ipaddr/ipv6/V;

    move-result-object v0

    const/4 v4, 0x0

    :goto_2
    iget-object v1, v9, Linet/ipaddr/format/validate/r;->y:Linet/ipaddr/format/validate/r$l;

    if-nez v1, :cond_4

    new-instance v1, Linet/ipaddr/format/validate/r$b;

    invoke-direct {v1, v9}, Linet/ipaddr/format/validate/r$b;-><init>(Linet/ipaddr/format/validate/r;)V

    iput-object v1, v9, Linet/ipaddr/format/validate/r;->y:Linet/ipaddr/format/validate/r$l;

    :cond_4
    move-object v3, v1

    invoke-virtual/range {p0 .. p0}, Linet/ipaddr/format/validate/r;->g1()Z

    move-result v16

    if-eqz v16, :cond_5

    const/4 v1, 0x6

    goto :goto_3

    :cond_5
    move v1, v5

    :goto_3
    sub-int v2, v1, v7

    if-gtz v2, :cond_6

    move v1, v12

    goto :goto_4

    :cond_6
    const/4 v1, 0x0

    :goto_4
    iget-object v14, v9, Linet/ipaddr/format/validate/a;->j:Ljava/lang/CharSequence;

    const/16 v17, -0x1

    move/from16 v24, v17

    move/from16 v25, v24

    const/4 v5, 0x0

    const/4 v11, 0x0

    const/16 v18, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    move/from16 v74, v1

    move-object v1, v0

    move/from16 v0, v74

    :goto_5
    if-ge v11, v7, :cond_51

    move-object/from16 v21, v3

    move-object/from16 v20, v4

    const/4 v12, 0x2

    invoke-virtual {v8, v11, v12}, Linet/ipaddr/format/validate/a;->o(II)J

    move-result-wide v3

    const/16 v12, 0xa

    move-object/from16 v39, v13

    invoke-virtual {v8, v11, v12}, Linet/ipaddr/format/validate/a;->o(II)J

    move-result-wide v12

    if-nez v0, :cond_3e

    add-int/lit8 v0, v7, -0x1

    if-ne v11, v0, :cond_7

    const/4 v0, 0x1

    goto :goto_6

    :cond_7
    const/4 v0, 0x0

    :goto_6
    invoke-virtual {v8, v11}, Linet/ipaddr/format/validate/a;->C(I)Z

    move-result v22

    invoke-virtual {v9, v11}, Linet/ipaddr/format/validate/c;->b1(I)Z

    move-result v23

    if-nez v0, :cond_9

    if-eqz v23, :cond_8

    goto :goto_7

    :cond_8
    const/4 v0, 0x0

    goto :goto_8

    :cond_9
    :goto_7
    const/4 v0, 0x1

    :goto_8
    if-nez v0, :cond_d

    if-eqz v22, :cond_c

    add-int/lit8 v0, v11, 0x1

    :goto_9
    if-ge v0, v7, :cond_c

    invoke-virtual {v8, v0}, Linet/ipaddr/format/validate/a;->C(I)Z

    move-result v29

    if-nez v29, :cond_b

    invoke-virtual {v9, v0}, Linet/ipaddr/format/validate/c;->b1(I)Z

    move-result v29

    if-eqz v29, :cond_a

    goto :goto_a

    :cond_a
    add-int/lit8 v0, v0, 0x1

    goto :goto_9

    :cond_b
    :goto_a
    const/16 v29, 0x0

    goto :goto_b

    :cond_c
    move/from16 v29, v22

    goto :goto_b

    :cond_d
    move/from16 v29, v0

    :goto_b
    if-eqz v29, :cond_3d

    const-wide/16 v31, -0x1

    const-wide/16 v33, 0x0

    if-eqz v23, :cond_e

    move-object/from16 v22, v1

    move/from16 v35, v24

    move/from16 v36, v25

    move-wide/from16 v0, v33

    move-wide v3, v0

    move-wide v12, v3

    move-wide/from16 v24, v12

    const/16 v37, 0x0

    goto/16 :goto_10

    :cond_e
    const/4 v0, 0x3

    if-eqz v22, :cond_10

    if-le v2, v0, :cond_f

    rsub-int/lit8 v0, v2, 0x7

    const/4 v3, 0x4

    shl-int/2addr v0, v3

    ushr-long v12, v31, v0

    move-wide/from16 v35, v31

    goto :goto_c

    :cond_f
    const/4 v3, 0x4

    rsub-int/lit8 v0, v2, 0x3

    shl-int/2addr v0, v3

    ushr-long v12, v31, v0

    move-wide/from16 v35, v12

    move-wide/from16 v12, v33

    :goto_c
    move-object/from16 v22, v1

    move-wide v3, v12

    move-wide/from16 v12, v33

    move-wide/from16 v0, v35

    const/16 v37, 0x1

    move/from16 v35, v24

    move/from16 v36, v25

    move-wide/from16 v24, v12

    goto :goto_10

    :cond_10
    move-object/from16 v22, v1

    const/4 v1, 0x4

    if-le v2, v0, :cond_13

    invoke-virtual {v8, v11, v1}, Linet/ipaddr/format/validate/a;->o(II)J

    move-result-wide v24

    const/16 v0, 0xc

    invoke-virtual {v8, v11, v0}, Linet/ipaddr/format/validate/a;->o(II)J

    move-result-wide v0

    cmp-long v35, v3, v12

    if-nez v35, :cond_12

    cmp-long v35, v24, v0

    if-eqz v35, :cond_11

    goto :goto_d

    :cond_11
    const/16 v35, 0x0

    goto :goto_f

    :cond_12
    :goto_d
    const/16 v35, 0x1

    goto :goto_f

    :cond_13
    cmp-long v0, v3, v12

    if-eqz v0, :cond_14

    const/4 v0, 0x1

    goto :goto_e

    :cond_14
    const/4 v0, 0x0

    :goto_e
    move/from16 v35, v0

    move-wide/from16 v0, v33

    move-wide/from16 v24, v0

    :goto_f
    add-int v36, v11, v2

    move/from16 v37, v35

    move/from16 v35, v11

    move-wide/from16 v74, v0

    move-wide v0, v12

    move-wide v12, v3

    move-wide/from16 v3, v74

    :goto_10
    add-int/lit8 v38, v2, 0x1

    move/from16 v56, v7

    mul-int/lit8 v7, v38, 0x10

    if-eqz v15, :cond_27

    if-eqz v23, :cond_15

    move-object/from16 v57, v8

    iget-object v8, v9, Linet/ipaddr/format/validate/r;->z:[Linet/ipaddr/format/validate/r$j;

    sget-object v31, Linet/ipaddr/format/validate/r;->B:Linet/ipaddr/format/validate/r$f;

    aput-object v31, v8, v11

    move/from16 v49, v2

    move-wide/from16 v63, v3

    move-object/from16 v59, v6

    move-object/from16 v60, v10

    move/from16 v61, v11

    move-object/from16 v58, v14

    move/from16 v62, v15

    move-wide/from16 v31, v33

    move-wide/from16 v40, v31

    move-object/from16 v48, v39

    const/4 v10, 0x0

    move/from16 v39, v5

    move-wide v14, v12

    move-object/from16 v5, v21

    move v12, v7

    move-wide/from16 v7, v24

    move-wide/from16 v24, v40

    goto/16 :goto_21

    :cond_15
    move-object/from16 v57, v8

    const/4 v8, 0x4

    if-lt v2, v8, :cond_1f

    iget-object v8, v9, Linet/ipaddr/format/validate/r;->z:[Linet/ipaddr/format/validate/r$j;

    aget-object v8, v8, v11

    check-cast v8, Linet/ipaddr/format/validate/r$f;

    move-object/from16 v58, v14

    add-int/lit8 v14, v2, -0x3

    move-object/from16 v59, v6

    move-object/from16 v60, v10

    move/from16 v61, v11

    move-wide/from16 v10, v33

    const/4 v6, 0x0

    :goto_11
    if-ge v6, v14, :cond_16

    const/16 v30, 0x10

    shl-long v10, v10, v30

    move/from16 v41, v14

    add-int v14, v5, v6

    move/from16 v62, v15

    move-object/from16 v15, v39

    invoke-interface {v15, v14}, Linet/ipaddr/l;->q(I)Linet/ipaddr/k;

    move-result-object v14

    invoke-virtual {v14}, Linet/ipaddr/k;->Q()I

    move-result v14

    move-wide/from16 v63, v3

    int-to-long v3, v14

    or-long/2addr v10, v3

    add-int/lit8 v6, v6, 0x1

    move/from16 v14, v41

    move/from16 v15, v62

    move-wide/from16 v3, v63

    goto :goto_11

    :cond_16
    move-wide/from16 v63, v3

    move/from16 v41, v14

    move/from16 v62, v15

    move-object/from16 v15, v39

    const/16 v30, 0x10

    move-wide/from16 v3, v33

    :goto_12
    if-gt v14, v2, :cond_17

    shl-long v3, v3, v30

    add-int v6, v5, v14

    invoke-interface {v15, v6}, Linet/ipaddr/l;->q(I)Linet/ipaddr/k;

    move-result-object v6

    invoke-virtual {v6}, Linet/ipaddr/k;->Q()I

    move-result v6

    move/from16 v39, v5

    int-to-long v5, v6

    or-long/2addr v3, v5

    add-int/lit8 v14, v14, 0x1

    move/from16 v5, v39

    const/16 v30, 0x10

    goto :goto_12

    :cond_17
    move/from16 v39, v5

    if-nez v8, :cond_19

    const/16 v5, 0x40

    if-ne v7, v5, :cond_18

    move-wide/from16 v54, v31

    goto :goto_13

    :cond_18
    add-int/lit8 v5, v7, -0x40

    shl-long v5, v31, v5

    not-long v5, v5

    move-wide/from16 v54, v5

    :goto_13
    iget-object v5, v9, Linet/ipaddr/format/validate/r;->z:[Linet/ipaddr/format/validate/r$j;

    const-wide/16 v52, -0x1

    move-wide/from16 v40, v12

    move-wide/from16 v42, v24

    move-wide/from16 v44, v0

    move-wide/from16 v46, v63

    move-wide/from16 v48, v3

    move-wide/from16 v50, v10

    invoke-static/range {v40 .. v55}, Linet/ipaddr/format/validate/r;->n2(JJJJJJJJ)Linet/ipaddr/format/validate/r$f;

    move-result-object v8

    aput-object v8, v5, v61

    :cond_19
    invoke-virtual {v8}, Linet/ipaddr/format/validate/r$j;->d()Z

    move-result v5

    if-nez v5, :cond_1a

    invoke-static/range {v21 .. v21}, Linet/ipaddr/format/validate/r$l;->n(Linet/ipaddr/format/validate/r$l;)Linet/ipaddr/IncompatibleAddressException;

    move-result-object v5

    if-nez v5, :cond_1a

    mul-int/lit8 v5, v38, 0x2

    new-instance v6, Linet/ipaddr/IncompatibleAddressException;

    new-instance v14, Ljava/math/BigInteger;

    move/from16 v38, v7

    move-object/from16 v31, v8

    move-object/from16 v48, v15

    move-wide/from16 v7, v24

    invoke-static {v12, v13, v7, v8, v5}, Linet/ipaddr/format/validate/r;->r2(JJI)[B

    move-result-object v15

    move/from16 v49, v2

    const/4 v2, 0x1

    invoke-direct {v14, v2, v15}, Ljava/math/BigInteger;-><init>(I[B)V

    invoke-virtual {v14}, Ljava/math/BigInteger;->toString()Ljava/lang/String;

    move-result-object v14

    new-instance v15, Ljava/math/BigInteger;

    move-wide/from16 v24, v12

    move-wide/from16 v12, v63

    invoke-static {v0, v1, v12, v13, v5}, Linet/ipaddr/format/validate/r;->r2(JJI)[B

    move-result-object v9

    invoke-direct {v15, v2, v9}, Ljava/math/BigInteger;-><init>(I[B)V

    invoke-virtual {v15}, Ljava/math/BigInteger;->toString()Ljava/lang/String;

    move-result-object v9

    new-instance v15, Ljava/math/BigInteger;

    invoke-static {v3, v4, v10, v11, v5}, Linet/ipaddr/format/validate/r;->r2(JJI)[B

    move-result-object v5

    invoke-direct {v15, v2, v5}, Ljava/math/BigInteger;-><init>(I[B)V

    invoke-virtual {v15}, Ljava/math/BigInteger;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v5, "ipaddress.error.maskMismatch"

    invoke-direct {v6, v14, v9, v2, v5}, Linet/ipaddr/IncompatibleAddressException;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object/from16 v5, v21

    invoke-static {v5, v6}, Linet/ipaddr/format/validate/r$l;->o(Linet/ipaddr/format/validate/r$l;Linet/ipaddr/IncompatibleAddressException;)Linet/ipaddr/IncompatibleAddressException;

    :goto_14
    move-object/from16 v2, v31

    goto :goto_15

    :cond_1a
    move/from16 v49, v2

    move/from16 v38, v7

    move-object/from16 v31, v8

    move-object/from16 v48, v15

    move-object/from16 v5, v21

    move-wide/from16 v7, v24

    move-wide/from16 v24, v12

    move-wide/from16 v12, v63

    goto :goto_14

    :goto_15
    invoke-virtual {v2, v7, v8, v10, v11}, Linet/ipaddr/format/validate/r$f;->g(JJ)J

    move-result-wide v33

    invoke-virtual {v2, v12, v13, v10, v11}, Linet/ipaddr/format/validate/r$f;->h(JJ)J

    move-result-wide v9

    move-wide/from16 v14, v24

    invoke-virtual {v2, v14, v15, v3, v4}, Linet/ipaddr/format/validate/r$j;->a(JJ)J

    move-result-wide v24

    invoke-virtual {v2, v0, v1, v3, v4}, Linet/ipaddr/format/validate/r$j;->c(JJ)J

    move-result-wide v2

    cmp-long v4, v24, v2

    if-nez v4, :cond_1c

    cmp-long v4, v33, v9

    if-eqz v4, :cond_1b

    goto :goto_16

    :cond_1b
    const/4 v4, 0x0

    goto :goto_17

    :cond_1c
    :goto_16
    const/4 v4, 0x1

    :goto_17
    if-nez v18, :cond_1e

    cmp-long v6, v24, v14

    if-nez v6, :cond_1e

    cmp-long v6, v2, v0

    if-nez v6, :cond_1e

    cmp-long v6, v33, v7

    if-nez v6, :cond_1e

    cmp-long v6, v9, v12

    if-eqz v6, :cond_1d

    goto :goto_18

    :cond_1d
    const/4 v6, 0x0

    goto :goto_19

    :cond_1e
    :goto_18
    const/4 v6, 0x1

    :goto_19
    move/from16 v18, v6

    move-wide/from16 v63, v12

    move/from16 v12, v38

    move-wide/from16 v74, v9

    move-object/from16 v9, p0

    move-wide/from16 v10, v33

    move-wide/from16 v33, v24

    move-wide/from16 v24, v74

    goto/16 :goto_20

    :cond_1f
    move/from16 v49, v2

    move-object/from16 v59, v6

    move/from16 v38, v7

    move-object/from16 v60, v10

    move/from16 v61, v11

    move-object/from16 v58, v14

    move/from16 v62, v15

    move-wide/from16 v7, v24

    move-object/from16 v48, v39

    move/from16 v39, v5

    move-wide v14, v12

    move-object/from16 v5, v21

    move-wide v12, v3

    iget-object v2, v9, Linet/ipaddr/format/validate/r;->z:[Linet/ipaddr/format/validate/r$j;

    aget-object v2, v2, v61

    move-wide/from16 v10, v33

    move/from16 v3, v49

    const/4 v4, 0x0

    :goto_1a
    if-gt v4, v3, :cond_20

    const/16 v6, 0x10

    shl-long/2addr v10, v6

    add-int v6, v39, v4

    move/from16 v49, v3

    move-object/from16 v3, v48

    invoke-interface {v3, v6}, Linet/ipaddr/l;->q(I)Linet/ipaddr/k;

    move-result-object v6

    invoke-virtual {v6}, Linet/ipaddr/k;->Q()I

    move-result v6

    move-wide/from16 v63, v12

    int-to-long v12, v6

    or-long/2addr v10, v12

    add-int/lit8 v4, v4, 0x1

    move/from16 v3, v49

    move-wide/from16 v12, v63

    goto :goto_1a

    :cond_20
    move/from16 v49, v3

    move-wide/from16 v63, v12

    move-object/from16 v3, v48

    if-nez v2, :cond_22

    move/from16 v12, v38

    const/16 v4, 0x40

    move-object/from16 v48, v3

    if-ne v12, v4, :cond_21

    move-wide/from16 v46, v31

    goto :goto_1b

    :cond_21
    shl-long v2, v31, v12

    not-long v2, v2

    move-wide/from16 v46, v2

    :goto_1b
    iget-object v2, v9, Linet/ipaddr/format/validate/r;->z:[Linet/ipaddr/format/validate/r$j;

    move-wide/from16 v40, v14

    move-wide/from16 v42, v0

    move-wide/from16 v44, v10

    invoke-static/range {v40 .. v47}, Linet/ipaddr/format/validate/r;->o2(JJJJ)Linet/ipaddr/format/validate/r$j;

    move-result-object v3

    aput-object v3, v2, v61

    move-object v2, v3

    goto :goto_1c

    :cond_22
    move-object/from16 v48, v3

    move/from16 v12, v38

    :goto_1c
    invoke-virtual {v2}, Linet/ipaddr/format/validate/r$j;->d()Z

    move-result v3

    if-nez v3, :cond_23

    invoke-static {v5}, Linet/ipaddr/format/validate/r$l;->n(Linet/ipaddr/format/validate/r$l;)Linet/ipaddr/IncompatibleAddressException;

    move-result-object v3

    if-nez v3, :cond_23

    new-instance v3, Linet/ipaddr/IncompatibleAddressException;

    const-string v47, "ipaddress.error.maskMismatch"

    move-object/from16 v40, v3

    move-wide/from16 v41, v14

    move-wide/from16 v43, v0

    move-wide/from16 v45, v10

    invoke-direct/range {v40 .. v47}, Linet/ipaddr/IncompatibleAddressException;-><init>(JJJLjava/lang/String;)V

    invoke-static {v5, v3}, Linet/ipaddr/format/validate/r$l;->o(Linet/ipaddr/format/validate/r$l;Linet/ipaddr/IncompatibleAddressException;)Linet/ipaddr/IncompatibleAddressException;

    :cond_23
    invoke-virtual {v2, v14, v15, v10, v11}, Linet/ipaddr/format/validate/r$j;->a(JJ)J

    move-result-wide v3

    invoke-virtual {v2, v0, v1, v10, v11}, Linet/ipaddr/format/validate/r$j;->c(JJ)J

    move-result-wide v10

    cmp-long v2, v3, v10

    if-eqz v2, :cond_24

    const/4 v2, 0x1

    goto :goto_1d

    :cond_24
    const/4 v2, 0x0

    :goto_1d
    if-nez v18, :cond_26

    cmp-long v6, v3, v14

    if-nez v6, :cond_26

    cmp-long v6, v10, v0

    if-eqz v6, :cond_25

    goto :goto_1e

    :cond_25
    const/4 v6, 0x0

    goto :goto_1f

    :cond_26
    :goto_1e
    const/4 v6, 0x1

    :goto_1f
    move/from16 v18, v6

    move-wide/from16 v24, v33

    move-wide/from16 v33, v3

    move v4, v2

    move-wide v2, v10

    move-wide/from16 v10, v24

    :goto_20
    move-wide/from16 v31, v2

    move-wide/from16 v40, v24

    move-wide/from16 v24, v10

    move v10, v4

    goto :goto_21

    :cond_27
    move/from16 v49, v2

    move-wide/from16 v63, v3

    move-object/from16 v59, v6

    move-object/from16 v57, v8

    move-object/from16 v60, v10

    move/from16 v61, v11

    move-object/from16 v58, v14

    move/from16 v62, v15

    move-object/from16 v48, v39

    move/from16 v39, v5

    move-wide v14, v12

    move-object/from16 v5, v21

    move v12, v7

    move-wide/from16 v7, v24

    move-wide/from16 v31, v0

    move-wide/from16 v33, v14

    move/from16 v10, v37

    move-wide/from16 v40, v63

    :goto_21
    move v3, v12

    move-object/from16 v11, v22

    move-object/from16 v2, v27

    move-object/from16 v6, v28

    move/from16 v13, v39

    move/from16 v4, v49

    :goto_22
    if-ltz v4, :cond_3c

    move-object/from16 v21, v5

    move-object/from16 v22, v6

    move-object/from16 v5, v60

    const/16 v6, 0x10

    invoke-static {v13, v6, v5}, Linet/ipaddr/format/validate/r;->a2(IILinet/ipaddr/format/validate/i;)Ljava/lang/Integer;

    move-result-object v27

    if-eqz v23, :cond_28

    move-wide/from16 v42, v0

    move/from16 v28, v3

    move/from16 v38, v4

    move-object/from16 v60, v5

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    goto/16 :goto_26

    :cond_28
    add-int/lit8 v6, v3, -0x10

    const v28, 0xffff

    move-object/from16 v60, v5

    const/4 v5, 0x4

    if-lt v4, v5, :cond_2c

    add-int/lit8 v3, v3, -0x50

    move/from16 v38, v4

    ushr-long v4, v7, v3

    long-to-int v4, v4

    and-int v4, v4, v28

    move/from16 v39, v4

    if-eqz v37, :cond_29

    ushr-long v4, v63, v3

    long-to-int v4, v4

    and-int v4, v4, v28

    :cond_29
    if-eqz v62, :cond_2b

    move/from16 v42, v4

    ushr-long v4, v24, v3

    long-to-int v4, v4

    and-int v4, v4, v28

    move v5, v4

    if-eqz v10, :cond_2a

    ushr-long v3, v40, v3

    long-to-int v3, v3

    and-int v3, v3, v28

    goto :goto_23

    :cond_2a
    move v3, v5

    :goto_23
    move v4, v5

    goto :goto_24

    :cond_2b
    move/from16 v42, v4

    move/from16 v4, v39

    move/from16 v3, v42

    :goto_24
    move v5, v3

    move/from16 v28, v6

    move/from16 v3, v39

    move v6, v4

    move/from16 v4, v42

    move-wide/from16 v42, v0

    goto :goto_26

    :cond_2c
    move/from16 v38, v4

    ushr-long v3, v14, v6

    long-to-int v3, v3

    and-int v3, v3, v28

    if-eqz v37, :cond_2d

    ushr-long v4, v0, v6

    long-to-int v4, v4

    and-int v4, v4, v28

    goto :goto_25

    :cond_2d
    move v4, v3

    :goto_25
    if-eqz v62, :cond_2f

    move-wide/from16 v42, v0

    ushr-long v0, v33, v6

    long-to-int v0, v0

    and-int v0, v0, v28

    move v5, v0

    if-eqz v10, :cond_2e

    ushr-long v0, v31, v6

    long-to-int v0, v0

    and-int v0, v0, v28

    :cond_2e
    move/from16 v28, v6

    move v6, v5

    move v5, v0

    goto :goto_26

    :cond_2f
    move-wide/from16 v42, v0

    move v5, v4

    move/from16 v28, v6

    move v6, v3

    :goto_26
    if-eqz p1, :cond_32

    if-nez v18, :cond_30

    if-eqz v27, :cond_31

    :cond_30
    move/from16 v17, v5

    move-object/from16 v5, v20

    move-object/from16 v1, v59

    const/16 v0, 0x8

    goto :goto_27

    :cond_31
    move/from16 v17, v5

    move-object/from16 v67, v20

    move-object/from16 v68, v22

    move-wide/from16 v45, v42

    move-object/from16 v65, v48

    move/from16 v47, v49

    move/from16 v42, v56

    move-object/from16 v66, v60

    move-wide/from16 v49, v63

    move-object/from16 v20, v2

    move/from16 v22, v6

    move/from16 v43, v10

    move-object/from16 v48, v21

    move/from16 v21, v38

    move-object/from16 v10, v57

    move-wide/from16 v38, v7

    goto :goto_28

    :goto_27
    invoke-static {v2, v5, v1, v0, v13}, Linet/ipaddr/format/validate/r;->H1([Linet/ipaddr/k;[Linet/ipaddr/k;Linet/ipaddr/c$a;II)[Linet/ipaddr/k;

    move-result-object v2

    move-object/from16 v20, v2

    check-cast v20, [Linet/ipaddr/ipv6/V;

    sget-object v2, Linet/ipaddr/g$a;->IPV6:Linet/ipaddr/g$a;

    const/16 v39, 0x0

    const/16 v44, 0x0

    move-wide/from16 v45, v42

    move/from16 v42, v0

    move-object/from16 v0, p0

    move-object/from16 v43, v1

    move-object/from16 v1, v58

    move/from16 v47, v49

    move-object/from16 v65, v48

    move-wide/from16 v49, v63

    move-object/from16 v48, v21

    move/from16 v21, v38

    move-object/from16 v67, v5

    move-object/from16 v66, v60

    move/from16 v5, v39

    move-object/from16 v68, v22

    move-object/from16 v59, v43

    move/from16 v22, v6

    move/from16 v6, v61

    move-wide/from16 v38, v7

    move/from16 v42, v56

    move-object/from16 v7, v44

    move/from16 v43, v10

    move-object/from16 v10, v57

    move-object/from16 v8, v59

    invoke-direct/range {v0 .. v8}, Linet/ipaddr/format/validate/r;->T1(Ljava/lang/CharSequence;Linet/ipaddr/g$a;IIZILjava/lang/Integer;Linet/ipaddr/format/validate/f;)Linet/ipaddr/k;

    move-result-object v0

    check-cast v0, Linet/ipaddr/ipv6/V;

    aput-object v0, v20, v13

    :goto_28
    sget-object v2, Linet/ipaddr/g$a;->IPV6:Linet/ipaddr/g$a;

    const/4 v5, 0x0

    move-object/from16 v0, p0

    move-object/from16 v1, v58

    move/from16 v3, v22

    move/from16 v4, v17

    move/from16 v6, v61

    move-object/from16 v7, v27

    move-object/from16 v8, v59

    invoke-direct/range {v0 .. v8}, Linet/ipaddr/format/validate/r;->T1(Ljava/lang/CharSequence;Linet/ipaddr/g$a;IIZILjava/lang/Integer;Linet/ipaddr/format/validate/f;)Linet/ipaddr/k;

    move-result-object v0

    check-cast v0, Linet/ipaddr/ipv6/V;

    move-object/from16 v8, v67

    aput-object v0, v8, v13

    goto :goto_29

    :cond_32
    move/from16 v17, v5

    move-object/from16 v68, v22

    move-wide/from16 v45, v42

    move-object/from16 v65, v48

    move/from16 v47, v49

    move/from16 v42, v56

    move-object/from16 v66, v60

    move-wide/from16 v49, v63

    move/from16 v22, v6

    move/from16 v43, v10

    move-object/from16 v48, v21

    move/from16 v21, v38

    move-object/from16 v10, v57

    move-wide/from16 v38, v7

    move-object/from16 v8, v20

    move-object/from16 v20, v2

    :goto_29
    if-eqz p2, :cond_3b

    move/from16 v7, v17

    move/from16 v4, v22

    if-eq v4, v7, :cond_33

    const/16 v17, 0x1

    goto :goto_2a

    :cond_33
    const/16 v17, 0x0

    :goto_2a
    if-eqz p1, :cond_36

    if-eqz v17, :cond_34

    goto :goto_2b

    :cond_34
    if-eqz v11, :cond_35

    aget-object v0, v8, v13

    aput-object v0, v11, v13

    :cond_35
    move/from16 v22, v7

    move-object/from16 v69, v8

    move-wide/from16 v51, v14

    move-object/from16 v15, v59

    const/16 v14, 0x8

    goto :goto_2c

    :cond_36
    :goto_2b
    move-object/from16 v6, v59

    const/16 v5, 0x8

    if-eqz p1, :cond_37

    invoke-static {v11, v8, v6, v5, v13}, Linet/ipaddr/format/validate/r;->H1([Linet/ipaddr/k;[Linet/ipaddr/k;Linet/ipaddr/c$a;II)[Linet/ipaddr/k;

    move-result-object v0

    move-object v11, v0

    check-cast v11, [Linet/ipaddr/ipv6/V;

    :cond_37
    sget-object v2, Linet/ipaddr/g$a;->IPV6:Linet/ipaddr/g$a;

    const/16 v22, 0x0

    move-object/from16 v0, p0

    move-object/from16 v1, v58

    move v3, v4

    move-wide/from16 v51, v14

    move v14, v5

    move/from16 v5, v22

    move-object v15, v6

    move/from16 v6, v61

    move/from16 v22, v7

    move-object/from16 v7, v27

    move-object/from16 v69, v8

    move-object v8, v15

    invoke-direct/range {v0 .. v8}, Linet/ipaddr/format/validate/r;->T1(Ljava/lang/CharSequence;Linet/ipaddr/g$a;IIZILjava/lang/Integer;Linet/ipaddr/format/validate/f;)Linet/ipaddr/k;

    move-result-object v0

    check-cast v0, Linet/ipaddr/ipv6/V;

    aput-object v0, v11, v13

    :goto_2c
    if-eqz p3, :cond_39

    if-eqz v17, :cond_38

    move-object/from16 v0, v68

    invoke-static {v0, v11, v15, v14, v13}, Linet/ipaddr/format/validate/r;->H1([Linet/ipaddr/k;[Linet/ipaddr/k;Linet/ipaddr/c$a;II)[Linet/ipaddr/k;

    move-result-object v0

    move-object/from16 v17, v0

    check-cast v17, [Linet/ipaddr/ipv6/V;

    sget-object v2, Linet/ipaddr/g$a;->IPV6:Linet/ipaddr/g$a;

    const/4 v5, 0x0

    move-object/from16 v0, p0

    move-object/from16 v1, v58

    move/from16 v3, v22

    move/from16 v4, v22

    move/from16 v6, v61

    move-object/from16 v7, v27

    move-object v8, v15

    invoke-direct/range {v0 .. v8}, Linet/ipaddr/format/validate/r;->T1(Ljava/lang/CharSequence;Linet/ipaddr/g$a;IIZILjava/lang/Integer;Linet/ipaddr/format/validate/f;)Linet/ipaddr/k;

    move-result-object v0

    check-cast v0, Linet/ipaddr/ipv6/V;

    aput-object v0, v17, v13

    move-object/from16 v6, v17

    goto :goto_2e

    :cond_38
    move-object/from16 v0, v68

    if-eqz v0, :cond_3a

    aget-object v1, v11, v13

    aput-object v1, v0, v13

    goto :goto_2d

    :cond_39
    move-object/from16 v0, v68

    :cond_3a
    :goto_2d
    move-object v6, v0

    goto :goto_2e

    :cond_3b
    move-object/from16 v69, v8

    move-wide/from16 v51, v14

    move-object/from16 v15, v59

    move-object/from16 v0, v68

    const/16 v14, 0x8

    goto :goto_2d

    :goto_2e
    add-int/lit8 v13, v13, 0x1

    add-int/lit8 v4, v21, -0x1

    move-object/from16 v57, v10

    move-object/from16 v59, v15

    move-object/from16 v2, v20

    move/from16 v3, v28

    move-wide/from16 v7, v38

    move/from16 v56, v42

    move/from16 v10, v43

    move-wide/from16 v0, v45

    move-object/from16 v5, v48

    move-wide/from16 v63, v49

    move-wide/from16 v14, v51

    move-object/from16 v48, v65

    move-object/from16 v60, v66

    move-object/from16 v20, v69

    move/from16 v49, v47

    goto/16 :goto_22

    :cond_3c
    move-object v0, v6

    move-object/from16 v69, v20

    move-object/from16 v65, v48

    move/from16 v47, v49

    move/from16 v42, v56

    move-object/from16 v10, v57

    move-object/from16 v15, v59

    move-object/from16 v66, v60

    move/from16 v8, v61

    const/16 v14, 0x8

    move-object/from16 v48, v5

    invoke-virtual {v10, v8, v12}, Linet/ipaddr/format/validate/a;->d0(II)V

    move-object/from16 v28, v0

    move-object/from16 v27, v2

    move-object v3, v10

    move-object v1, v11

    move v5, v13

    move-object v14, v15

    move/from16 v0, v29

    move/from16 v24, v35

    move/from16 v25, v36

    move-object/from16 v11, v65

    move-object/from16 v15, v69

    move v13, v8

    goto/16 :goto_40

    :cond_3d
    move-object/from16 v22, v1

    move/from16 v47, v2

    move/from16 v42, v7

    move-object/from16 v66, v10

    move-object/from16 v58, v14

    move/from16 v62, v15

    move-object/from16 v69, v20

    move-object/from16 v48, v21

    move-object/from16 v65, v39

    const/16 v14, 0x8

    move/from16 v39, v5

    move-object v15, v6

    move-object v10, v8

    move v8, v11

    goto :goto_2f

    :cond_3e
    move-object/from16 v22, v1

    move/from16 v47, v2

    move/from16 v42, v7

    move-object/from16 v66, v10

    move-object/from16 v58, v14

    move/from16 v62, v15

    move-object/from16 v69, v20

    move-object/from16 v48, v21

    move-object/from16 v65, v39

    const/16 v14, 0x8

    move/from16 v39, v5

    move-object v15, v6

    move-object v10, v8

    move v8, v11

    move/from16 v29, v0

    :goto_2f
    if-eqz v62, :cond_44

    iget-object v0, v9, Linet/ipaddr/format/validate/r;->z:[Linet/ipaddr/format/validate/r$j;

    aget-object v0, v0, v8

    move/from16 v5, v39

    move-object/from16 v11, v65

    invoke-interface {v11, v5}, Linet/ipaddr/l;->q(I)Linet/ipaddr/k;

    move-result-object v1

    invoke-virtual {v1}, Linet/ipaddr/k;->Q()I

    move-result v1

    if-nez v0, :cond_3f

    iget-object v0, v9, Linet/ipaddr/format/validate/r;->z:[Linet/ipaddr/format/validate/r$j;

    int-to-long v6, v1

    invoke-virtual {v15}, Linet/ipaddr/ipv6/e$a;->y()I

    move-result v2

    move-object/from16 v59, v15

    int-to-long v14, v2

    move-wide/from16 v31, v3

    move-wide/from16 v33, v12

    move-wide/from16 v35, v6

    move-wide/from16 v37, v14

    invoke-static/range {v31 .. v38}, Linet/ipaddr/format/validate/r;->o2(JJJJ)Linet/ipaddr/format/validate/r$j;

    move-result-object v2

    aput-object v2, v0, v8

    move-object v0, v2

    goto :goto_30

    :cond_3f
    move-object/from16 v59, v15

    :goto_30
    invoke-virtual {v0}, Linet/ipaddr/format/validate/r$j;->d()Z

    move-result v2

    if-nez v2, :cond_40

    invoke-static/range {v48 .. v48}, Linet/ipaddr/format/validate/r$l;->n(Linet/ipaddr/format/validate/r$l;)Linet/ipaddr/IncompatibleAddressException;

    move-result-object v2

    if-nez v2, :cond_40

    new-instance v2, Linet/ipaddr/IncompatibleAddressException;

    int-to-long v6, v1

    const-string v38, "ipaddress.error.maskMismatch"

    move-object/from16 v31, v2

    move-wide/from16 v32, v3

    move-wide/from16 v34, v12

    move-wide/from16 v36, v6

    invoke-direct/range {v31 .. v38}, Linet/ipaddr/IncompatibleAddressException;-><init>(JJJLjava/lang/String;)V

    move-object/from16 v14, v48

    invoke-static {v14, v2}, Linet/ipaddr/format/validate/r$l;->o(Linet/ipaddr/format/validate/r$l;Linet/ipaddr/IncompatibleAddressException;)Linet/ipaddr/IncompatibleAddressException;

    goto :goto_31

    :cond_40
    move-object/from16 v14, v48

    :goto_31
    int-to-long v1, v1

    invoke-virtual {v0, v3, v4, v1, v2}, Linet/ipaddr/format/validate/r$j;->a(JJ)J

    move-result-wide v6

    long-to-int v6, v6

    int-to-long v6, v6

    invoke-virtual {v0, v12, v13, v1, v2}, Linet/ipaddr/format/validate/r$j;->c(JJ)J

    move-result-wide v0

    long-to-int v0, v0

    int-to-long v0, v0

    cmp-long v2, v3, v6

    if-nez v2, :cond_41

    cmp-long v2, v12, v0

    if-nez v2, :cond_41

    const/4 v2, 0x1

    goto :goto_32

    :cond_41
    const/4 v2, 0x0

    :goto_32
    if-nez v18, :cond_43

    if-nez v2, :cond_42

    goto :goto_33

    :cond_42
    const/16 v18, 0x0

    goto :goto_34

    :cond_43
    :goto_33
    const/16 v18, 0x1

    :goto_34
    move v15, v2

    move-wide/from16 v19, v6

    move-wide v6, v0

    move-object/from16 v0, v66

    const/16 v1, 0x10

    goto :goto_35

    :cond_44
    move-object/from16 v59, v15

    move/from16 v5, v39

    move-object/from16 v14, v48

    move-object/from16 v11, v65

    move-wide/from16 v19, v3

    move-wide v6, v12

    move-object/from16 v0, v66

    const/16 v1, 0x10

    const/4 v15, 0x1

    :goto_35
    invoke-static {v5, v1, v0}, Linet/ipaddr/format/validate/r;->a2(IILinet/ipaddr/format/validate/i;)Ljava/lang/Integer;

    move-result-object v17

    if-eqz p1, :cond_47

    if-nez v18, :cond_45

    if-eqz v17, :cond_46

    :cond_45
    move-object/from16 v60, v0

    move-wide/from16 v31, v6

    move-object/from16 v1, v27

    move-object/from16 v2, v59

    move-object/from16 v7, v69

    const/16 v0, 0x8

    goto :goto_36

    :cond_46
    move-object/from16 v60, v0

    move v12, v5

    move v13, v8

    move-object/from16 v57, v10

    move-wide/from16 v71, v19

    move-object/from16 v70, v22

    move-object/from16 v73, v69

    move-wide v9, v6

    goto :goto_37

    :goto_36
    invoke-static {v1, v7, v2, v0, v5}, Linet/ipaddr/format/validate/r;->H1([Linet/ipaddr/k;[Linet/ipaddr/k;Linet/ipaddr/c$a;II)[Linet/ipaddr/k;

    move-result-object v1

    move-object/from16 v27, v1

    check-cast v27, [Linet/ipaddr/ipv6/V;

    sget-object v6, Linet/ipaddr/g$a;->IPV6:Linet/ipaddr/g$a;

    long-to-int v3, v3

    long-to-int v4, v12

    const/4 v12, 0x1

    const/4 v13, 0x0

    move-object/from16 v1, v60

    move-object/from16 v0, p0

    move-wide/from16 v71, v19

    move-object/from16 v70, v22

    move-object/from16 v1, v58

    move-object/from16 v59, v2

    move-object v2, v6

    move v6, v5

    move v5, v12

    move v12, v6

    move-object/from16 v57, v10

    move-wide/from16 v9, v31

    move v6, v8

    move-object/from16 v73, v7

    move-object v7, v13

    move v13, v8

    move-object/from16 v8, v59

    invoke-direct/range {v0 .. v8}, Linet/ipaddr/format/validate/r;->T1(Ljava/lang/CharSequence;Linet/ipaddr/g$a;IIZILjava/lang/Integer;Linet/ipaddr/format/validate/f;)Linet/ipaddr/k;

    move-result-object v0

    check-cast v0, Linet/ipaddr/ipv6/V;

    aput-object v0, v27, v12

    :goto_37
    sget-object v2, Linet/ipaddr/g$a;->IPV6:Linet/ipaddr/g$a;

    move-wide/from16 v7, v71

    long-to-int v3, v7

    long-to-int v4, v9

    move-object/from16 v0, p0

    move-object/from16 v1, v58

    move v5, v15

    move v6, v13

    move-object/from16 v48, v14

    move-wide v14, v7

    move-object/from16 v7, v17

    move-object/from16 v8, v59

    invoke-direct/range {v0 .. v8}, Linet/ipaddr/format/validate/r;->T1(Ljava/lang/CharSequence;Linet/ipaddr/g$a;IIZILjava/lang/Integer;Linet/ipaddr/format/validate/f;)Linet/ipaddr/k;

    move-result-object v0

    check-cast v0, Linet/ipaddr/ipv6/V;

    move-object/from16 v8, v73

    aput-object v0, v8, v12

    goto :goto_38

    :cond_47
    move-object/from16 v60, v0

    move v12, v5

    move v13, v8

    move-object/from16 v57, v10

    move-object/from16 v48, v14

    move-wide/from16 v14, v19

    move-object/from16 v70, v22

    move-object/from16 v1, v27

    move-object/from16 v8, v69

    move-wide v9, v6

    :goto_38
    if-eqz p2, :cond_50

    cmp-long v0, v14, v9

    if-eqz v0, :cond_48

    const/16 v19, 0x1

    goto :goto_39

    :cond_48
    const/16 v19, 0x0

    :goto_39
    if-eqz p1, :cond_49

    if-eqz v19, :cond_4a

    :cond_49
    move-object/from16 v0, v70

    goto :goto_3a

    :cond_4a
    move-object/from16 v0, v70

    if-eqz v0, :cond_4b

    aget-object v1, v8, v12

    aput-object v1, v0, v12

    :cond_4b
    move-object v15, v8

    move-object/from16 v14, v59

    move-object v8, v0

    goto :goto_3c

    :goto_3a
    move-object/from16 v7, v59

    if-eqz p1, :cond_4c

    const/16 v1, 0x8

    invoke-static {v0, v8, v7, v1, v12}, Linet/ipaddr/format/validate/r;->H1([Linet/ipaddr/k;[Linet/ipaddr/k;Linet/ipaddr/c$a;II)[Linet/ipaddr/k;

    move-result-object v0

    move-object v1, v0

    check-cast v1, [Linet/ipaddr/ipv6/V;

    move-object/from16 v20, v1

    goto :goto_3b

    :cond_4c
    move-object/from16 v20, v0

    :goto_3b
    sget-object v2, Linet/ipaddr/g$a;->IPV6:Linet/ipaddr/g$a;

    long-to-int v4, v14

    const/4 v5, 0x0

    move-object/from16 v0, p0

    move-object/from16 v1, v58

    move v3, v4

    move v6, v13

    move-object v14, v7

    move-object/from16 v7, v17

    move-object v15, v8

    move-object v8, v14

    invoke-direct/range {v0 .. v8}, Linet/ipaddr/format/validate/r;->T1(Ljava/lang/CharSequence;Linet/ipaddr/g$a;IIZILjava/lang/Integer;Linet/ipaddr/format/validate/f;)Linet/ipaddr/k;

    move-result-object v0

    check-cast v0, Linet/ipaddr/ipv6/V;

    aput-object v0, v20, v12

    move-object/from16 v8, v20

    :goto_3c
    if-eqz p3, :cond_4e

    if-eqz v19, :cond_4d

    move-object/from16 v2, v28

    const/16 v0, 0x8

    invoke-static {v2, v8, v14, v0, v12}, Linet/ipaddr/format/validate/r;->H1([Linet/ipaddr/k;[Linet/ipaddr/k;Linet/ipaddr/c$a;II)[Linet/ipaddr/k;

    move-result-object v1

    move-object/from16 v28, v1

    check-cast v28, [Linet/ipaddr/ipv6/V;

    sget-object v2, Linet/ipaddr/g$a;->IPV6:Linet/ipaddr/g$a;

    long-to-int v4, v9

    const/4 v5, 0x0

    move-object/from16 v0, p0

    move-object/from16 v1, v58

    move v3, v4

    move v6, v13

    move-object/from16 v7, v17

    move-object/from16 v20, v8

    move-object v8, v14

    invoke-direct/range {v0 .. v8}, Linet/ipaddr/format/validate/r;->T1(Ljava/lang/CharSequence;Linet/ipaddr/g$a;IIZILjava/lang/Integer;Linet/ipaddr/format/validate/f;)Linet/ipaddr/k;

    move-result-object v0

    check-cast v0, Linet/ipaddr/ipv6/V;

    aput-object v0, v28, v12

    :goto_3d
    move-object/from16 v1, v20

    goto :goto_3f

    :cond_4d
    move-object/from16 v20, v8

    move-object/from16 v2, v28

    if-eqz v2, :cond_4f

    aget-object v0, v20, v12

    aput-object v0, v2, v12

    goto :goto_3e

    :cond_4e
    move-object/from16 v20, v8

    move-object/from16 v2, v28

    :cond_4f
    :goto_3e
    move-object/from16 v28, v2

    goto :goto_3d

    :cond_50
    move-object v15, v8

    move-object/from16 v2, v28

    move-object/from16 v14, v59

    move-object/from16 v0, v70

    move-object v1, v0

    :goto_3f
    add-int/lit8 v5, v12, 0x1

    move-object/from16 v3, v57

    const/16 v0, 0x10

    invoke-virtual {v3, v13, v0}, Linet/ipaddr/format/validate/a;->d0(II)V

    move/from16 v0, v29

    :goto_40
    add-int/lit8 v2, v13, 0x1

    move-object/from16 v9, p0

    move-object v8, v3

    move-object v13, v11

    move-object v6, v14

    move-object v4, v15

    move/from16 v7, v42

    move-object/from16 v3, v48

    move-object/from16 v14, v58

    move-object/from16 v10, v60

    move/from16 v15, v62

    move v11, v2

    move/from16 v2, v47

    goto/16 :goto_5

    :cond_51
    move-object v0, v1

    move-object/from16 v48, v3

    move v12, v5

    move-object/from16 v60, v10

    move-object v11, v13

    move-object/from16 v58, v14

    move/from16 v62, v15

    move-object/from16 v1, v27

    move-object/from16 v2, v28

    move-object v15, v4

    move-object v14, v6

    invoke-static/range {v60 .. v60}, Linet/ipaddr/format/validate/r;->X1(Linet/ipaddr/format/validate/i;)Ljava/lang/Integer;

    move-result-object v3

    if-eqz v16, :cond_6d

    move-object/from16 v4, p0

    iget-object v5, v4, Linet/ipaddr/format/validate/c;->t:Linet/ipaddr/format/validate/r;

    invoke-virtual {v5}, Linet/ipaddr/format/validate/r;->Z1()Linet/ipaddr/m;

    move-result-object v5

    check-cast v5, Linet/ipaddr/ipv4/Y;

    if-eqz v62, :cond_52

    iget-object v6, v4, Linet/ipaddr/format/validate/r;->A:[Linet/ipaddr/format/validate/r$j;

    if-nez v6, :cond_52

    const/4 v6, 0x4

    new-array v6, v6, [Linet/ipaddr/format/validate/r$j;

    iput-object v6, v4, Linet/ipaddr/format/validate/r;->A:[Linet/ipaddr/format/validate/r$j;

    :cond_52
    const/4 v6, 0x2

    const/4 v7, 0x0

    move-object/from16 v74, v1

    move-object v1, v0

    move-object/from16 v0, v74

    :goto_41
    if-ge v7, v6, :cond_6c

    shl-int/lit8 v8, v7, 0x1

    move-object/from16 v9, v60

    const/16 v10, 0x10

    invoke-static {v12, v10, v9}, Linet/ipaddr/format/validate/r;->a2(IILinet/ipaddr/format/validate/i;)Ljava/lang/Integer;

    move-result-object v13

    invoke-virtual {v5}, Linet/ipaddr/ipv4/Y;->l1()Linet/ipaddr/ipv4/b;

    move-result-object v6

    invoke-virtual {v6, v8}, Linet/ipaddr/ipv4/b;->G1(I)Linet/ipaddr/ipv4/M;

    move-result-object v6

    add-int/lit8 v10, v8, 0x1

    invoke-virtual {v5}, Linet/ipaddr/ipv4/Y;->l1()Linet/ipaddr/ipv4/b;

    move-result-object v9

    invoke-virtual {v9, v10}, Linet/ipaddr/ipv4/b;->G1(I)Linet/ipaddr/ipv4/M;

    move-result-object v9

    move-object/from16 v27, v3

    invoke-virtual {v5}, Linet/ipaddr/ipv4/Y;->m1()Linet/ipaddr/ipv4/b;

    move-result-object v3

    invoke-virtual {v3, v8}, Linet/ipaddr/ipv4/b;->G1(I)Linet/ipaddr/ipv4/M;

    move-result-object v3

    move/from16 v28, v7

    invoke-virtual {v5}, Linet/ipaddr/ipv4/Y;->m1()Linet/ipaddr/ipv4/b;

    move-result-object v7

    invoke-virtual {v7, v10}, Linet/ipaddr/ipv4/b;->G1(I)Linet/ipaddr/ipv4/M;

    move-result-object v7

    invoke-virtual {v6}, Linet/ipaddr/k;->Q()I

    move-result v6

    invoke-virtual {v9}, Linet/ipaddr/k;->Q()I

    move-result v9

    invoke-virtual {v3}, Linet/ipaddr/k;->Q()I

    move-result v3

    invoke-virtual {v7}, Linet/ipaddr/k;->Q()I

    move-result v7

    if-eqz v62, :cond_5a

    invoke-interface {v11, v12}, Linet/ipaddr/l;->q(I)Linet/ipaddr/k;

    move-result-object v16

    move-object/from16 v39, v11

    invoke-virtual/range {v16 .. v16}, Linet/ipaddr/k;->Q()I

    move-result v11

    move-object/from16 v31, v2

    shr-int/lit8 v2, v11, 0x8

    move-object/from16 v32, v1

    iget-object v1, v4, Linet/ipaddr/format/validate/r;->A:[Linet/ipaddr/format/validate/r$j;

    aget-object v16, v1, v8

    if-nez v16, :cond_53

    move-object/from16 v59, v14

    move-object/from16 v67, v15

    int-to-long v14, v6

    move/from16 v33, v12

    move-object/from16 v34, v13

    int-to-long v12, v3

    move/from16 v20, v9

    move/from16 v17, v10

    int-to-long v9, v2

    const-wide/16 v46, 0xff

    move-wide/from16 v40, v14

    move-wide/from16 v42, v12

    move-wide/from16 v44, v9

    invoke-static/range {v40 .. v47}, Linet/ipaddr/format/validate/r;->o2(JJJJ)Linet/ipaddr/format/validate/r$j;

    move-result-object v16

    aput-object v16, v1, v8

    :goto_42
    move-object/from16 v1, v16

    goto :goto_43

    :cond_53
    move/from16 v20, v9

    move/from16 v17, v10

    move/from16 v33, v12

    move-object/from16 v34, v13

    move-object/from16 v59, v14

    move-object/from16 v67, v15

    goto :goto_42

    :goto_43
    invoke-virtual {v1}, Linet/ipaddr/format/validate/r$j;->d()Z

    move-result v8

    if-nez v8, :cond_54

    invoke-static/range {v48 .. v48}, Linet/ipaddr/format/validate/r$l;->n(Linet/ipaddr/format/validate/r$l;)Linet/ipaddr/IncompatibleAddressException;

    move-result-object v8

    if-nez v8, :cond_54

    new-instance v8, Linet/ipaddr/IncompatibleAddressException;

    int-to-long v9, v6

    int-to-long v12, v3

    int-to-long v14, v2

    const-string v47, "ipaddress.error.maskMismatch"

    move-object/from16 v40, v8

    move-wide/from16 v41, v9

    move-wide/from16 v43, v12

    move-wide/from16 v45, v14

    invoke-direct/range {v40 .. v47}, Linet/ipaddr/IncompatibleAddressException;-><init>(JJJLjava/lang/String;)V

    move-object/from16 v9, v48

    invoke-static {v9, v8}, Linet/ipaddr/format/validate/r$l;->o(Linet/ipaddr/format/validate/r$l;Linet/ipaddr/IncompatibleAddressException;)Linet/ipaddr/IncompatibleAddressException;

    goto :goto_44

    :cond_54
    move-object/from16 v9, v48

    :goto_44
    int-to-long v12, v6

    int-to-long v14, v2

    invoke-virtual {v1, v12, v13, v14, v15}, Linet/ipaddr/format/validate/r$j;->a(JJ)J

    move-result-wide v12

    long-to-int v2, v12

    int-to-long v12, v3

    invoke-virtual {v1, v12, v13, v14, v15}, Linet/ipaddr/format/validate/r$j;->c(JJ)J

    move-result-wide v12

    long-to-int v1, v12

    iget-object v8, v4, Linet/ipaddr/format/validate/r;->A:[Linet/ipaddr/format/validate/r$j;

    aget-object v10, v8, v17

    if-nez v10, :cond_55

    move/from16 v12, v20

    int-to-long v13, v12

    move-object v15, v5

    int-to-long v4, v7

    move-object/from16 v16, v0

    move/from16 v19, v1

    int-to-long v0, v11

    const-wide/16 v46, 0xff

    move-wide/from16 v40, v13

    move-wide/from16 v42, v4

    move-wide/from16 v44, v0

    invoke-static/range {v40 .. v47}, Linet/ipaddr/format/validate/r;->o2(JJJJ)Linet/ipaddr/format/validate/r$j;

    move-result-object v10

    aput-object v10, v8, v17

    goto :goto_45

    :cond_55
    move-object/from16 v16, v0

    move/from16 v19, v1

    move-object v15, v5

    move/from16 v12, v20

    :goto_45
    invoke-virtual {v10}, Linet/ipaddr/format/validate/r$j;->d()Z

    move-result v0

    if-nez v0, :cond_56

    invoke-static {v9}, Linet/ipaddr/format/validate/r$l;->n(Linet/ipaddr/format/validate/r$l;)Linet/ipaddr/IncompatibleAddressException;

    move-result-object v0

    if-nez v0, :cond_56

    new-instance v0, Linet/ipaddr/IncompatibleAddressException;

    int-to-long v4, v12

    int-to-long v13, v7

    move v8, v2

    int-to-long v1, v11

    const-string v47, "ipaddress.error.maskMismatch"

    move-object/from16 v40, v0

    move-wide/from16 v41, v4

    move-wide/from16 v43, v13

    move-wide/from16 v45, v1

    invoke-direct/range {v40 .. v47}, Linet/ipaddr/IncompatibleAddressException;-><init>(JJJLjava/lang/String;)V

    invoke-static {v9, v0}, Linet/ipaddr/format/validate/r$l;->o(Linet/ipaddr/format/validate/r$l;Linet/ipaddr/IncompatibleAddressException;)Linet/ipaddr/IncompatibleAddressException;

    goto :goto_46

    :cond_56
    move v8, v2

    :goto_46
    int-to-long v0, v12

    int-to-long v4, v11

    invoke-virtual {v10, v0, v1, v4, v5}, Linet/ipaddr/format/validate/r$j;->a(JJ)J

    move-result-wide v0

    long-to-int v0, v0

    int-to-long v1, v7

    invoke-virtual {v10, v1, v2, v4, v5}, Linet/ipaddr/format/validate/r$j;->c(JJ)J

    move-result-wide v1

    long-to-int v1, v1

    if-nez v18, :cond_58

    if-ne v8, v6, :cond_58

    move/from16 v2, v19

    if-ne v2, v3, :cond_59

    if-ne v0, v12, :cond_59

    if-eq v1, v7, :cond_57

    goto :goto_47

    :cond_57
    const/4 v4, 0x0

    goto :goto_48

    :cond_58
    move/from16 v2, v19

    :cond_59
    :goto_47
    const/4 v4, 0x1

    :goto_48
    move/from16 v74, v2

    move v2, v1

    move/from16 v1, v74

    goto :goto_49

    :cond_5a
    move-object/from16 v16, v0

    move-object/from16 v32, v1

    move-object/from16 v31, v2

    move-object/from16 v39, v11

    move/from16 v33, v12

    move-object/from16 v34, v13

    move-object/from16 v59, v14

    move-object/from16 v67, v15

    move-object v15, v5

    move v12, v9

    move-object/from16 v9, v48

    move v1, v3

    move v8, v6

    move v2, v7

    move v0, v12

    move/from16 v4, v18

    :goto_49
    if-ne v8, v1, :cond_5c

    if-eq v0, v2, :cond_5b

    goto :goto_4a

    :cond_5b
    const/4 v5, 0x0

    goto :goto_4b

    :cond_5c
    :goto_4a
    const/4 v5, 0x1

    :goto_4b
    if-eqz p1, :cond_63

    if-nez v4, :cond_5e

    if-eqz v34, :cond_5d

    goto :goto_4c

    :cond_5d
    const/4 v10, 0x0

    goto :goto_4d

    :cond_5e
    :goto_4c
    const/4 v10, 0x1

    :goto_4d
    move/from16 v35, v2

    move/from16 v2, v33

    move-object/from16 v11, v59

    move-object/from16 v14, v67

    if-eqz v10, :cond_5f

    const/16 v13, 0x8

    move/from16 v33, v4

    move-object/from16 v4, v16

    invoke-static {v4, v14, v11, v13, v2}, Linet/ipaddr/format/validate/r;->H1([Linet/ipaddr/k;[Linet/ipaddr/k;Linet/ipaddr/c$a;II)[Linet/ipaddr/k;

    move-result-object v4

    check-cast v4, [Linet/ipaddr/ipv6/V;

    goto :goto_4e

    :cond_5f
    move/from16 v33, v4

    move-object/from16 v4, v16

    :goto_4e
    if-nez v5, :cond_61

    const/4 v3, 0x0

    move-object/from16 v13, p0

    if-eqz v10, :cond_60

    invoke-direct {v13, v6, v12, v3, v11}, Linet/ipaddr/format/validate/r;->Q1(IILjava/lang/Integer;Linet/ipaddr/ipv6/e$a;)Linet/ipaddr/ipv6/V;

    move-result-object v6

    aput-object v6, v4, v2

    :cond_60
    move-object/from16 v6, v34

    invoke-direct {v13, v8, v0, v6, v11}, Linet/ipaddr/format/validate/r;->Q1(IILjava/lang/Integer;Linet/ipaddr/ipv6/e$a;)Linet/ipaddr/ipv6/V;

    move-result-object v7

    aput-object v7, v14, v2

    move-object/from16 v26, v3

    move-object/from16 v34, v6

    goto :goto_4f

    :cond_61
    const/16 v26, 0x0

    move-object/from16 v13, p0

    if-eqz v10, :cond_62

    const/16 v22, 0x0

    move-object/from16 v16, v9

    move-object/from16 v17, v15

    move/from16 v18, v6

    move/from16 v19, v3

    move/from16 v20, v12

    move/from16 v21, v7

    move-object/from16 v23, v11

    invoke-static/range {v16 .. v23}, Linet/ipaddr/format/validate/r;->O1(Linet/ipaddr/format/validate/r$l;Lag/g;IIIILjava/lang/Integer;Linet/ipaddr/ipv6/e$a;)Linet/ipaddr/ipv6/V;

    move-result-object v3

    aput-object v3, v4, v2

    :cond_62
    move-object/from16 v16, v9

    move-object/from16 v17, v15

    move/from16 v18, v8

    move/from16 v19, v1

    move/from16 v20, v0

    move/from16 v21, v35

    move-object/from16 v22, v34

    move-object/from16 v23, v11

    invoke-static/range {v16 .. v23}, Linet/ipaddr/format/validate/r;->O1(Linet/ipaddr/format/validate/r$l;Lag/g;IIIILjava/lang/Integer;Linet/ipaddr/ipv6/e$a;)Linet/ipaddr/ipv6/V;

    move-result-object v3

    aput-object v3, v14, v2

    goto :goto_4f

    :cond_63
    move-object/from16 v13, p0

    move/from16 v35, v2

    move/from16 v2, v33

    move-object/from16 v11, v59

    move-object/from16 v14, v67

    const/16 v26, 0x0

    move/from16 v33, v4

    move-object/from16 v4, v16

    :goto_4f
    if-eqz p2, :cond_6b

    if-eqz p1, :cond_66

    if-eqz v5, :cond_64

    goto :goto_50

    :cond_64
    if-eqz v32, :cond_65

    aget-object v0, v14, v2

    aput-object v0, v32, v2

    :cond_65
    move-object/from16 v6, v32

    move-object/from16 v7, v34

    const/16 v3, 0x8

    goto :goto_51

    :cond_66
    :goto_50
    move-object/from16 v6, v32

    const/16 v3, 0x8

    if-eqz p1, :cond_67

    invoke-static {v6, v14, v11, v3, v2}, Linet/ipaddr/format/validate/r;->H1([Linet/ipaddr/k;[Linet/ipaddr/k;Linet/ipaddr/c$a;II)[Linet/ipaddr/k;

    move-result-object v6

    check-cast v6, [Linet/ipaddr/ipv6/V;

    :cond_67
    move-object/from16 v7, v34

    invoke-direct {v13, v8, v0, v7, v11}, Linet/ipaddr/format/validate/r;->Q1(IILjava/lang/Integer;Linet/ipaddr/ipv6/e$a;)Linet/ipaddr/ipv6/V;

    move-result-object v0

    aput-object v0, v6, v2

    :goto_51
    if-eqz p3, :cond_6a

    if-eqz v5, :cond_69

    move-object/from16 v0, v31

    invoke-static {v0, v6, v11, v3, v2}, Linet/ipaddr/format/validate/r;->H1([Linet/ipaddr/k;[Linet/ipaddr/k;Linet/ipaddr/c$a;II)[Linet/ipaddr/k;

    move-result-object v0

    check-cast v0, [Linet/ipaddr/ipv6/V;

    move/from16 v3, v35

    invoke-direct {v13, v1, v3, v7, v11}, Linet/ipaddr/format/validate/r;->Q1(IILjava/lang/Integer;Linet/ipaddr/ipv6/e$a;)Linet/ipaddr/ipv6/V;

    move-result-object v1

    aput-object v1, v0, v2

    :cond_68
    :goto_52
    move-object v1, v6

    goto :goto_53

    :cond_69
    move-object/from16 v0, v31

    if-eqz v0, :cond_68

    aget-object v1, v6, v2

    aput-object v1, v0, v2

    goto :goto_52

    :cond_6a
    move-object/from16 v0, v31

    goto :goto_52

    :cond_6b
    move-object/from16 v0, v31

    move-object/from16 v6, v32

    goto :goto_52

    :goto_53
    add-int/lit8 v12, v2, 0x1

    add-int/lit8 v7, v28, 0x1

    move-object v2, v0

    move-object v0, v4

    move-object/from16 v48, v9

    move-object v4, v13

    move-object v5, v15

    move-object/from16 v3, v27

    move/from16 v18, v33

    const/4 v6, 0x2

    move-object v15, v14

    move-object v14, v11

    move-object/from16 v11, v39

    goto/16 :goto_41

    :cond_6c
    move-object v6, v1

    move-object/from16 v27, v3

    move-object v13, v4

    move-object v11, v14

    move-object v14, v15

    move-object/from16 v9, v48

    const/16 v26, 0x0

    move-object v4, v0

    move-object v0, v2

    move-object v1, v4

    move-object v4, v6

    goto :goto_54

    :cond_6d
    move-object/from16 v13, p0

    move-object/from16 v27, v3

    move-object v11, v14

    move-object v14, v15

    move-object/from16 v9, v48

    const/16 v26, 0x0

    move-object v4, v0

    move-object v0, v2

    :goto_54
    if-eqz p1, :cond_70

    const-string v2, "ipaddress.error.invalid.joined.ranges"

    if-eqz v1, :cond_6f

    invoke-virtual {v11, v1}, Linet/ipaddr/format/validate/f;->t([LZf/d;)LZf/c;

    move-result-object v1

    check-cast v1, Linet/ipaddr/ipv6/Q;

    invoke-static {v9, v1}, Linet/ipaddr/format/validate/r$l;->t(Linet/ipaddr/format/validate/r$l;Linet/ipaddr/j;)Linet/ipaddr/j;

    move/from16 v3, v24

    move/from16 v5, v25

    invoke-static {v1, v3, v5}, Linet/ipaddr/format/validate/r;->J1(Linet/ipaddr/j;II)Z

    move-result v6

    if-eqz v6, :cond_6e

    new-instance v6, Linet/ipaddr/IncompatibleAddressException;

    move-object/from16 v7, v58

    invoke-direct {v6, v7, v2}, Linet/ipaddr/IncompatibleAddressException;-><init>(Ljava/lang/CharSequence;Ljava/lang/String;)V

    invoke-static {v9, v6}, Linet/ipaddr/format/validate/r$l;->m(Linet/ipaddr/format/validate/r$l;Linet/ipaddr/IncompatibleAddressException;)Linet/ipaddr/IncompatibleAddressException;

    goto :goto_55

    :cond_6e
    move-object/from16 v7, v58

    :goto_55
    move-object/from16 v6, v27

    goto :goto_56

    :cond_6f
    move/from16 v3, v24

    move/from16 v5, v25

    move-object/from16 v7, v58

    move-object/from16 v1, v26

    goto :goto_55

    :goto_56
    invoke-virtual {v11, v14, v6}, Linet/ipaddr/format/validate/f;->p([LZf/d;Ljava/lang/Integer;)LZf/c;

    move-result-object v8

    check-cast v8, Linet/ipaddr/ipv6/Q;

    invoke-static {v9, v8}, Linet/ipaddr/format/validate/r$l;->s(Linet/ipaddr/format/validate/r$l;Linet/ipaddr/j;)Linet/ipaddr/j;

    invoke-static {v8, v3, v5}, Linet/ipaddr/format/validate/r;->J1(Linet/ipaddr/j;II)Z

    move-result v3

    if-eqz v3, :cond_71

    new-instance v3, Linet/ipaddr/IncompatibleAddressException;

    invoke-direct {v3, v7, v2}, Linet/ipaddr/IncompatibleAddressException;-><init>(Ljava/lang/CharSequence;Ljava/lang/String;)V

    invoke-static {v9, v3}, Linet/ipaddr/format/validate/r$l;->r(Linet/ipaddr/format/validate/r$l;Linet/ipaddr/IncompatibleAddressException;)Linet/ipaddr/IncompatibleAddressException;

    if-nez v1, :cond_71

    invoke-static {v9}, Linet/ipaddr/format/validate/r$l;->p(Linet/ipaddr/format/validate/r$l;)Linet/ipaddr/IncompatibleAddressException;

    move-result-object v1

    invoke-static {v9, v1}, Linet/ipaddr/format/validate/r$l;->m(Linet/ipaddr/format/validate/r$l;Linet/ipaddr/IncompatibleAddressException;)Linet/ipaddr/IncompatibleAddressException;

    goto :goto_57

    :cond_70
    move-object/from16 v6, v27

    :cond_71
    :goto_57
    if-eqz p2, :cond_79

    invoke-static/range {v60 .. v60}, Linet/ipaddr/format/validate/r;->X1(Linet/ipaddr/format/validate/i;)Ljava/lang/Integer;

    move-result-object v21

    if-eqz v21, :cond_76

    invoke-virtual/range {p0 .. p0}, Linet/ipaddr/format/validate/r;->getParameters()Linet/ipaddr/o;

    move-result-object v1

    invoke-virtual {v1}, Linet/ipaddr/o;->r()Linet/ipaddr/ipv6/j0;

    move-result-object v1

    invoke-virtual {v1}, Linet/ipaddr/ipv6/j0;->t()Linet/ipaddr/ipv6/e;

    move-result-object v1

    if-eqz p1, :cond_72

    move-object v2, v14

    move-object v3, v2

    goto :goto_59

    :cond_72
    if-nez v0, :cond_73

    move-object v2, v4

    goto :goto_58

    :cond_73
    move-object v2, v0

    :goto_58
    move-object v3, v2

    move-object v2, v4

    :goto_59
    new-instance v15, Linet/ipaddr/format/validate/j;

    invoke-direct {v15, v2}, Linet/ipaddr/format/validate/j;-><init>([Linet/ipaddr/ipv6/V;)V

    new-instance v5, Linet/ipaddr/format/validate/k;

    invoke-direct {v5, v3}, Linet/ipaddr/format/validate/k;-><init>([Linet/ipaddr/ipv6/V;)V

    array-length v2, v2

    invoke-virtual {v1}, Linet/ipaddr/c;->d()Linet/ipaddr/c$b;

    move-result-object v22

    const/16 v23, 0x0

    const/16 v18, 0x2

    const/16 v19, 0x10

    const v20, 0xffff

    move-object/from16 v16, v5

    move/from16 v17, v2

    invoke-static/range {v15 .. v23}, Linet/ipaddr/format/validate/g;->h(Linet/ipaddr/a$a;Linet/ipaddr/a$a;IIIILjava/lang/Integer;Linet/ipaddr/c$b;Z)Z

    move-result v1

    if-eqz v1, :cond_75

    const/16 v2, 0x8

    if-nez v4, :cond_74

    invoke-static {v4, v14, v11, v2, v2}, Linet/ipaddr/format/validate/r;->H1([Linet/ipaddr/k;[Linet/ipaddr/k;Linet/ipaddr/c$a;II)[Linet/ipaddr/k;

    move-result-object v3

    move-object v4, v3

    check-cast v4, [Linet/ipaddr/ipv6/V;

    :cond_74
    if-nez v0, :cond_75

    invoke-static {v0, v4, v11, v2, v2}, Linet/ipaddr/format/validate/r;->H1([Linet/ipaddr/k;[Linet/ipaddr/k;Linet/ipaddr/c$a;II)[Linet/ipaddr/k;

    move-result-object v0

    check-cast v0, [Linet/ipaddr/ipv6/V;

    :cond_75
    move v14, v1

    goto :goto_5a

    :cond_76
    const/4 v14, 0x0

    :goto_5a
    if-eqz v4, :cond_77

    const/4 v1, 0x1

    invoke-virtual {v11, v4, v6, v1}, Linet/ipaddr/format/validate/f;->r([LZf/d;Ljava/lang/Integer;Z)LZf/c;

    move-result-object v1

    check-cast v1, Linet/ipaddr/ipv6/Q;

    invoke-virtual {v1}, Linet/ipaddr/ipv6/Q;->y3()Linet/ipaddr/ipv6/Q;

    move-result-object v1

    invoke-static {v9, v1}, Linet/ipaddr/format/validate/r$l;->d(Linet/ipaddr/format/validate/r$l;Linet/ipaddr/j;)Linet/ipaddr/j;

    :cond_77
    if-eqz v0, :cond_79

    invoke-virtual {v11, v0, v6}, Linet/ipaddr/format/validate/f;->p([LZf/d;Ljava/lang/Integer;)LZf/c;

    move-result-object v0

    check-cast v0, Linet/ipaddr/ipv6/Q;

    if-eqz v14, :cond_78

    invoke-virtual {v0}, Linet/ipaddr/ipv6/Q;->B4()Linet/ipaddr/ipv6/Q;

    move-result-object v0

    :cond_78
    invoke-virtual {v0}, Linet/ipaddr/ipv6/Q;->I3()Linet/ipaddr/ipv6/Q;

    move-result-object v0

    invoke-static {v9, v0}, Linet/ipaddr/format/validate/r$l;->h(Linet/ipaddr/format/validate/r$l;Linet/ipaddr/j;)Linet/ipaddr/j;

    :cond_79
    return-void

    :cond_7a
    move-object v13, v9

    return-void
.end method

.method private Q1(IILjava/lang/Integer;Linet/ipaddr/ipv6/e$a;)Linet/ipaddr/ipv6/V;
    .locals 0

    shl-int/lit8 p1, p1, 0x8

    or-int/2addr p1, p2

    invoke-virtual {p4, p1, p3}, Linet/ipaddr/ipv6/e$a;->g1(ILjava/lang/Integer;)Linet/ipaddr/ipv6/V;

    move-result-object p1

    return-object p1
.end method

.method private static R1(Ljava/lang/CharSequence;Linet/ipaddr/g$a;IIZLinet/ipaddr/format/validate/a;ILjava/lang/Integer;Linet/ipaddr/format/validate/f;)Linet/ipaddr/k;
    .locals 12

    move-object/from16 v0, p5

    move/from16 v1, p6

    if-nez p4, :cond_0

    move v5, p2

    move v6, p3

    move-object/from16 v3, p7

    move-object/from16 v2, p8

    invoke-virtual {v2, p2, p3, v3}, Linet/ipaddr/format/validate/f;->c(IILjava/lang/Integer;)LZf/d;

    move-result-object v0

    check-cast v0, Linet/ipaddr/k;

    goto :goto_0

    :cond_0
    move v5, p2

    move v6, p3

    move-object/from16 v3, p7

    move-object/from16 v2, p8

    const/high16 v4, 0x40000

    invoke-virtual {v0, v1, v4}, Linet/ipaddr/format/validate/a;->g(II)Z

    move-result v7

    const/high16 v4, 0x80000

    invoke-virtual {v0, v1, v4}, Linet/ipaddr/format/validate/a;->g(II)Z

    move-result v8

    const/4 v4, 0x6

    invoke-virtual {v0, v1, v4}, Linet/ipaddr/format/validate/a;->h(II)I

    move-result v9

    const/4 v4, 0x7

    invoke-virtual {v0, v1, v4}, Linet/ipaddr/format/validate/a;->h(II)I

    move-result v10

    const/16 v4, 0xf

    invoke-virtual {v0, v1, v4}, Linet/ipaddr/format/validate/a;->h(II)I

    move-result v11

    move-object/from16 v0, p8

    move v1, p2

    move v2, p3

    move-object v4, p0

    invoke-virtual/range {v0 .. v11}, Linet/ipaddr/format/validate/f;->s(IILjava/lang/Integer;Ljava/lang/CharSequence;IIZZIII)LZf/d;

    move-result-object v0

    check-cast v0, Linet/ipaddr/k;

    :goto_0
    return-object v0
.end method

.method private T1(Ljava/lang/CharSequence;Linet/ipaddr/g$a;IIZILjava/lang/Integer;Linet/ipaddr/format/validate/f;)Linet/ipaddr/k;
    .locals 10

    move v4, p3

    move/from16 v6, p6

    invoke-virtual {p0}, Linet/ipaddr/format/validate/c;->U0()Linet/ipaddr/format/validate/a;

    move-result-object v5

    move v3, p4

    if-eq v4, v3, :cond_0

    move-object v0, p1

    move-object v1, p2

    move v2, p3

    move v3, p4

    move v4, p5

    move/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    invoke-static/range {v0 .. v8}, Linet/ipaddr/format/validate/r;->R1(Ljava/lang/CharSequence;Linet/ipaddr/g$a;IIZLinet/ipaddr/format/validate/a;ILjava/lang/Integer;Linet/ipaddr/format/validate/f;)Linet/ipaddr/k;

    move-result-object v0

    return-object v0

    :cond_0
    if-nez p5, :cond_1

    move-object/from16 v2, p7

    move-object/from16 v0, p8

    invoke-virtual {v0, p3, p3, v2}, Linet/ipaddr/format/validate/f;->c(IILjava/lang/Integer;)LZf/d;

    move-result-object v0

    check-cast v0, Linet/ipaddr/k;

    goto :goto_0

    :cond_1
    move-object/from16 v2, p7

    move-object/from16 v0, p8

    const/high16 v1, 0x40000

    invoke-virtual {v5, v6, v1}, Linet/ipaddr/format/validate/a;->g(II)Z

    move-result v7

    const/4 v1, 0x6

    invoke-virtual {v5, v6, v1}, Linet/ipaddr/format/validate/a;->h(II)I

    move-result v8

    const/4 v1, 0x7

    invoke-virtual {v5, v6, v1}, Linet/ipaddr/format/validate/a;->h(II)I

    move-result v9

    move v1, p3

    move-object v3, p1

    move v4, p3

    move v5, v7

    move v6, v8

    move v7, v9

    invoke-virtual/range {v0 .. v7}, Linet/ipaddr/format/validate/f;->v(ILjava/lang/Integer;Ljava/lang/CharSequence;IZII)LZf/d;

    move-result-object v0

    check-cast v0, Linet/ipaddr/k;

    :goto_0
    return-object v0
.end method

.method private V1()Linet/ipaddr/ipv4/e$a;
    .locals 1

    invoke-virtual {p0}, Linet/ipaddr/format/validate/r;->getParameters()Linet/ipaddr/o;

    move-result-object v0

    invoke-virtual {v0}, Linet/ipaddr/o;->p()Linet/ipaddr/ipv4/Z;

    move-result-object v0

    invoke-virtual {v0}, Linet/ipaddr/ipv4/Z;->r()Linet/ipaddr/ipv4/e;

    move-result-object v0

    invoke-virtual {v0}, Linet/ipaddr/ipv4/e;->d0()Linet/ipaddr/ipv4/e$a;

    move-result-object v0

    return-object v0
.end method

.method private W1()Linet/ipaddr/ipv6/e$a;
    .locals 1

    invoke-virtual {p0}, Linet/ipaddr/format/validate/r;->getParameters()Linet/ipaddr/o;

    move-result-object v0

    invoke-virtual {v0}, Linet/ipaddr/o;->r()Linet/ipaddr/ipv6/j0;

    move-result-object v0

    invoke-virtual {v0}, Linet/ipaddr/ipv6/j0;->t()Linet/ipaddr/ipv6/e;

    move-result-object v0

    invoke-virtual {v0}, Linet/ipaddr/ipv6/e;->T()Linet/ipaddr/ipv6/e$a;

    move-result-object v0

    return-object v0
.end method

.method private static X1(Linet/ipaddr/format/validate/i;)Ljava/lang/Integer;
    .locals 0

    invoke-virtual {p0}, Linet/ipaddr/format/validate/i;->h()Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method

.method private static a2(IILinet/ipaddr/format/validate/i;)Ljava/lang/Integer;
    .locals 0

    invoke-static {p2}, Linet/ipaddr/format/validate/r;->X1(Linet/ipaddr/format/validate/i;)Ljava/lang/Integer;

    move-result-object p2

    invoke-static {p1, p2, p0}, Linet/ipaddr/format/validate/g;->g(ILjava/lang/Integer;I)Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method

.method private static b2(ILinet/ipaddr/g$a;Linet/ipaddr/format/validate/i;)Ljava/lang/Integer;
    .locals 0

    invoke-static {p1}, Linet/ipaddr/j;->S1(Linet/ipaddr/g$a;)I

    move-result p1

    invoke-static {p0, p1, p2}, Linet/ipaddr/format/validate/r;->a2(IILinet/ipaddr/format/validate/i;)Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic f2([Linet/ipaddr/ipv4/M;I)I
    .locals 0

    aget-object p0, p0, p1

    invoke-virtual {p0}, Linet/ipaddr/k;->Q()I

    move-result p0

    return p0
.end method

.method private static synthetic g2([Linet/ipaddr/ipv4/M;I)I
    .locals 0

    aget-object p0, p0, p1

    invoke-virtual {p0}, Linet/ipaddr/k;->w0()I

    move-result p0

    return p0
.end method

.method private static synthetic h2([Linet/ipaddr/ipv6/V;I)I
    .locals 0

    aget-object p0, p0, p1

    invoke-virtual {p0}, Linet/ipaddr/k;->Q()I

    move-result p0

    return p0
.end method

.method private static synthetic i2([Linet/ipaddr/ipv6/V;I)I
    .locals 0

    aget-object p0, p0, p1

    invoke-virtual {p0}, Linet/ipaddr/k;->w0()I

    move-result p0

    return p0
.end method

.method private static synthetic j2(II[II)I
    .locals 0

    if-lt p3, p0, :cond_1

    sub-int p0, p3, p0

    if-ge p0, p1, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    sub-int/2addr p3, p1

    :cond_1
    const/4 p0, 0x2

    invoke-static {p3, p0, p2}, Linet/ipaddr/format/validate/a;->p(II[I)J

    move-result-wide p0

    long-to-int p0, p0

    return p0
.end method

.method private static synthetic k2(II[II)I
    .locals 0

    if-lt p3, p0, :cond_1

    sub-int p0, p3, p0

    if-ge p0, p1, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    sub-int/2addr p3, p1

    :cond_1
    const/16 p0, 0xa

    invoke-static {p3, p0, p2}, Linet/ipaddr/format/validate/a;->p(II[I)J

    move-result-wide p0

    long-to-int p0, p0

    return p0
.end method

.method private static synthetic l2([II)I
    .locals 1

    const/4 v0, 0x2

    invoke-static {p1, v0, p0}, Linet/ipaddr/format/validate/a;->p(II[I)J

    move-result-wide p0

    long-to-int p0, p0

    return p0
.end method

.method private static synthetic m2([II)I
    .locals 1

    const/16 v0, 0xa

    invoke-static {p1, v0, p0}, Linet/ipaddr/format/validate/a;->p(II[I)J

    move-result-wide p0

    long-to-int p0, p0

    return p0
.end method

.method public static n2(JJJJJJJJ)Linet/ipaddr/format/validate/r$f;
    .locals 27

    move-wide/from16 v0, p0

    move-wide/from16 v2, p2

    move-wide/from16 v4, p4

    move-wide/from16 v6, p6

    move-wide/from16 v8, p8

    move-wide/from16 v10, p10

    const/4 v12, 0x1

    xor-long v14, v2, v6

    const-wide/16 v16, 0x0

    cmp-long v18, v14, v16

    if-nez v18, :cond_4

    move-wide/from16 v0, p0

    move-wide/from16 v2, p4

    move-wide/from16 v4, p8

    move-wide/from16 v6, p12

    invoke-static/range {v0 .. v7}, Linet/ipaddr/format/validate/r;->o2(JJJJ)Linet/ipaddr/format/validate/r$j;

    move-result-object v0

    sget-object v1, Linet/ipaddr/format/validate/r;->B:Linet/ipaddr/format/validate/r$f;

    if-ne v0, v1, :cond_0

    return-object v1

    :cond_0
    instance-of v1, v0, Linet/ipaddr/format/validate/r$i;

    if-eqz v1, :cond_3

    move-object v1, v0

    check-cast v1, Linet/ipaddr/format/validate/r$i;

    iget v1, v1, Linet/ipaddr/format/validate/r$i;->c:I

    invoke-virtual {v0}, Linet/ipaddr/format/validate/r$j;->d()Z

    move-result v2

    if-eqz v2, :cond_1

    sget-object v2, Linet/ipaddr/format/validate/r;->G:[Linet/ipaddr/format/validate/r$m;

    goto :goto_0

    :cond_1
    sget-object v2, Linet/ipaddr/format/validate/r;->F:[Linet/ipaddr/format/validate/r$m;

    :goto_0
    aget-object v3, v2, v1

    if-nez v3, :cond_2

    new-instance v3, Linet/ipaddr/format/validate/r$m;

    invoke-direct {v3, v0}, Linet/ipaddr/format/validate/r$m;-><init>(Linet/ipaddr/format/validate/r$j;)V

    aput-object v3, v2, v1

    :cond_2
    return-object v3

    :cond_3
    new-instance v1, Linet/ipaddr/format/validate/r$m;

    invoke-direct {v1, v0}, Linet/ipaddr/format/validate/r$m;-><init>(Linet/ipaddr/format/validate/r$j;)V

    return-object v1

    :cond_4
    cmp-long v18, v2, v6

    if-gtz v18, :cond_24

    cmp-long v18, v8, p12

    if-nez v18, :cond_5

    cmp-long v19, v10, p14

    if-eqz v19, :cond_6

    :cond_5
    cmp-long v19, v8, v16

    if-nez v19, :cond_7

    cmp-long v20, v10, v16

    if-nez v20, :cond_7

    :cond_6
    sget-object v0, Linet/ipaddr/format/validate/r;->B:Linet/ipaddr/format/validate/r$f;

    return-object v0

    :cond_7
    invoke-static {v14, v15}, Ljava/lang/Long;->numberOfLeadingZeros(J)I

    move-result v14

    const-wide/16 v20, -0x1

    ushr-long v22, v20, v14

    and-long v22, v10, v22

    cmp-long v15, v22, v16

    const-wide/16 v24, 0x1

    const/16 v26, 0x0

    if-eqz v15, :cond_19

    cmp-long v15, v22, v24

    if-nez v15, :cond_8

    move v15, v12

    goto :goto_1

    :cond_8
    move/from16 v15, v26

    :goto_1
    invoke-static/range {v22 .. v23}, Ljava/lang/Long;->numberOfLeadingZeros(J)I

    move-result v13

    add-int/lit8 v19, v13, 0x1

    ushr-long v20, v20, v19

    if-nez v15, :cond_a

    and-long v22, v10, v20

    cmp-long v15, v22, v20

    if-nez v15, :cond_9

    if-nez v18, :cond_9

    :goto_2
    move v15, v12

    goto :goto_3

    :cond_9
    move/from16 v15, v26

    goto :goto_3

    :cond_a
    if-nez v18, :cond_9

    goto :goto_2

    :goto_3
    cmp-long v18, v0, v16

    if-nez v18, :cond_c

    cmp-long v16, v2, v16

    if-nez v16, :cond_c

    cmp-long v16, v4, p12

    if-nez v16, :cond_c

    cmp-long v16, v6, p14

    if-nez v16, :cond_c

    if-eqz v15, :cond_b

    sget-object v0, Linet/ipaddr/format/validate/r;->B:Linet/ipaddr/format/validate/r$f;

    return-object v0

    :cond_b
    sget-object v0, Linet/ipaddr/format/validate/r;->C:Linet/ipaddr/format/validate/r$f;

    return-object v0

    :cond_c
    if-le v13, v14, :cond_12

    if-eqz v15, :cond_f

    const/16 v8, 0x40

    rsub-int/lit8 v9, v13, 0x40

    sget-object v10, Linet/ipaddr/format/validate/r;->h1:[Ljava/math/BigInteger;

    aget-object v11, v10, v9

    if-nez v11, :cond_d

    shl-long v14, v24, v9

    invoke-static {v14, v15}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v11

    invoke-virtual {v11, v8}, Ljava/math/BigInteger;->shiftLeft(I)Ljava/math/BigInteger;

    move-result-object v11

    aput-object v11, v10, v9

    :cond_d
    new-instance v8, Ljava/math/BigInteger;

    const/16 v9, 0x10

    invoke-static {v4, v5, v6, v7, v9}, Linet/ipaddr/format/validate/r;->r2(JJI)[B

    move-result-object v4

    invoke-direct {v8, v12, v4}, Ljava/math/BigInteger;-><init>(I[B)V

    new-instance v4, Ljava/math/BigInteger;

    invoke-static {v0, v1, v2, v3, v9}, Linet/ipaddr/format/validate/r;->r2(JJI)[B

    move-result-object v0

    invoke-direct {v4, v12, v0}, Ljava/math/BigInteger;-><init>(I[B)V

    invoke-virtual {v8, v4}, Ljava/math/BigInteger;->subtract(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v0

    sget-object v1, Ljava/math/BigInteger;->ONE:Ljava/math/BigInteger;

    invoke-virtual {v0, v1}, Ljava/math/BigInteger;->add(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {v0, v11}, Ljava/math/BigInteger;->compareTo(Ljava/math/BigInteger;)I

    move-result v0

    if-ltz v0, :cond_e

    goto :goto_4

    :cond_e
    move/from16 v12, v26

    :goto_4
    move v15, v12

    :cond_f
    if-eqz v15, :cond_10

    sget-object v0, Linet/ipaddr/format/validate/r;->E:[Linet/ipaddr/format/validate/r$e;

    goto :goto_5

    :cond_10
    sget-object v0, Linet/ipaddr/format/validate/r;->D:[Linet/ipaddr/format/validate/r$e;

    :goto_5
    aget-object v1, v0, v13

    if-nez v1, :cond_11

    new-instance v1, Linet/ipaddr/format/validate/r$e;

    invoke-direct {v1, v13, v15}, Linet/ipaddr/format/validate/r$e;-><init>(IZ)V

    aput-object v1, v0, v13

    :cond_11
    return-object v1

    :cond_12
    if-nez v15, :cond_18

    sget-object v14, Linet/ipaddr/format/validate/r;->j1:[Ljava/math/BigInteger;

    aget-object v15, v14, v13

    if-nez v15, :cond_13

    invoke-static/range {v20 .. v21}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v15

    const/16 v12, 0x40

    invoke-virtual {v15, v12}, Ljava/math/BigInteger;->shiftLeft(I)Ljava/math/BigInteger;

    move-result-object v15

    new-instance v12, Ljava/math/BigInteger;

    const/16 v8, 0x8

    new-array v8, v8, [B

    fill-array-data v8, :array_0

    const/4 v9, 0x1

    invoke-direct {v12, v9, v8}, Ljava/math/BigInteger;-><init>(I[B)V

    invoke-virtual {v15, v12}, Ljava/math/BigInteger;->or(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v15

    aput-object v15, v14, v13

    :cond_13
    sget-object v8, Linet/ipaddr/format/validate/r;->i1:[Ljava/math/BigInteger;

    aget-object v9, v8, v13

    if-nez v9, :cond_14

    invoke-virtual {v15}, Ljava/math/BigInteger;->not()Ljava/math/BigInteger;

    move-result-object v9

    aput-object v9, v8, v13

    :cond_14
    new-instance v8, Ljava/math/BigInteger;

    const/16 v12, 0x10

    invoke-static {v4, v5, v6, v7, v12}, Linet/ipaddr/format/validate/r;->r2(JJI)[B

    move-result-object v4

    const/4 v5, 0x1

    invoke-direct {v8, v5, v4}, Ljava/math/BigInteger;-><init>(I[B)V

    new-instance v4, Ljava/math/BigInteger;

    invoke-static {v0, v1, v2, v3, v12}, Linet/ipaddr/format/validate/r;->r2(JJI)[B

    move-result-object v0

    invoke-direct {v4, v5, v0}, Ljava/math/BigInteger;-><init>(I[B)V

    invoke-virtual {v8, v9}, Ljava/math/BigInteger;->and(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {v4, v15}, Ljava/math/BigInteger;->or(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v1

    new-instance v2, Ljava/math/BigInteger;

    move-wide/from16 v13, p8

    invoke-static {v13, v14, v10, v11, v12}, Linet/ipaddr/format/validate/r;->r2(JJI)[B

    move-result-object v3

    invoke-direct {v2, v5, v3}, Ljava/math/BigInteger;-><init>(I[B)V

    rsub-int/lit8 v3, v19, 0x7f

    :goto_6
    if-ltz v3, :cond_17

    invoke-virtual {v2, v3}, Ljava/math/BigInteger;->testBit(I)Z

    move-result v5

    if-eqz v5, :cond_16

    invoke-virtual {v0, v3}, Ljava/math/BigInteger;->setBit(I)Ljava/math/BigInteger;

    move-result-object v5

    invoke-virtual {v5, v8}, Ljava/math/BigInteger;->compareTo(Ljava/math/BigInteger;)I

    move-result v6

    if-gtz v6, :cond_15

    move-object v0, v5

    :cond_15
    invoke-virtual {v1, v3}, Ljava/math/BigInteger;->clearBit(I)Ljava/math/BigInteger;

    move-result-object v5

    invoke-virtual {v5, v4}, Ljava/math/BigInteger;->compareTo(Ljava/math/BigInteger;)I

    move-result v6

    if-ltz v6, :cond_16

    move-object v1, v5

    :cond_16
    add-int/lit8 v3, v3, -0x1

    goto :goto_6

    :cond_17
    new-instance v2, Linet/ipaddr/format/validate/r$g;

    const/16 v3, 0x40

    invoke-virtual {v1, v3}, Ljava/math/BigInteger;->shiftRight(I)Ljava/math/BigInteger;

    move-result-object v4

    invoke-virtual {v4}, Ljava/math/BigInteger;->longValue()J

    move-result-wide v4

    invoke-virtual {v1}, Ljava/math/BigInteger;->longValue()J

    move-result-wide v6

    invoke-virtual {v0, v3}, Ljava/math/BigInteger;->shiftRight(I)Ljava/math/BigInteger;

    move-result-object v1

    invoke-virtual {v1}, Ljava/math/BigInteger;->longValue()J

    move-result-wide v8

    invoke-virtual {v0}, Ljava/math/BigInteger;->longValue()J

    move-result-wide v0

    move-object/from16 p0, v2

    move-wide/from16 p1, v4

    move-wide/from16 p3, v6

    move-wide/from16 p5, v8

    move-wide/from16 p7, v0

    invoke-direct/range {p0 .. p8}, Linet/ipaddr/format/validate/r$g;-><init>(JJJJ)V

    return-object v2

    :cond_18
    sget-object v0, Linet/ipaddr/format/validate/r;->B:Linet/ipaddr/format/validate/r$f;

    return-object v0

    :cond_19
    move-wide v13, v8

    if-nez v19, :cond_1a

    sget-object v0, Linet/ipaddr/format/validate/r;->B:Linet/ipaddr/format/validate/r$f;

    return-object v0

    :cond_1a
    invoke-static/range {p8 .. p9}, Ljava/lang/Long;->numberOfLeadingZeros(J)I

    move-result v8

    if-eqz v18, :cond_1c

    const/16 v9, 0x3f

    if-ge v8, v9, :cond_1c

    const/4 v9, 0x1

    add-int/lit8 v12, v8, 0x1

    ushr-long v9, v20, v12

    and-long v11, v13, v9

    cmp-long v9, v11, v9

    if-nez v9, :cond_1b

    goto :goto_7

    :cond_1b
    move/from16 v9, v26

    goto :goto_8

    :cond_1c
    :goto_7
    const/4 v9, 0x1

    :goto_8
    if-eqz v9, :cond_21

    if-nez v8, :cond_1d

    sget-object v9, Linet/ipaddr/format/validate/r;->Z:Ljava/math/BigInteger;

    goto :goto_9

    :cond_1d
    const/4 v9, 0x1

    if-ne v8, v9, :cond_1e

    sget-object v9, Linet/ipaddr/format/validate/r;->f1:Ljava/math/BigInteger;

    goto :goto_9

    :cond_1e
    const/16 v9, 0x40

    rsub-int/lit8 v13, v8, 0x40

    sget-object v9, Linet/ipaddr/format/validate/r;->g1:[Ljava/math/BigInteger;

    aget-object v10, v9, v13

    if-nez v10, :cond_1f

    shl-long v10, v24, v13

    invoke-static {v10, v11}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v10

    aput-object v10, v9, v13

    :cond_1f
    move-object v9, v10

    :goto_9
    new-instance v10, Ljava/math/BigInteger;

    const/16 v11, 0x10

    invoke-static {v4, v5, v6, v7, v11}, Linet/ipaddr/format/validate/r;->r2(JJI)[B

    move-result-object v4

    const/4 v5, 0x1

    invoke-direct {v10, v5, v4}, Ljava/math/BigInteger;-><init>(I[B)V

    new-instance v4, Ljava/math/BigInteger;

    invoke-static {v0, v1, v2, v3, v11}, Linet/ipaddr/format/validate/r;->r2(JJI)[B

    move-result-object v0

    invoke-direct {v4, v5, v0}, Ljava/math/BigInteger;-><init>(I[B)V

    invoke-virtual {v10, v4}, Ljava/math/BigInteger;->subtract(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v0

    sget-object v1, Ljava/math/BigInteger;->ONE:Ljava/math/BigInteger;

    invoke-virtual {v0, v1}, Ljava/math/BigInteger;->add(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {v0, v9}, Ljava/math/BigInteger;->compareTo(Ljava/math/BigInteger;)I

    move-result v0

    if-ltz v0, :cond_20

    move v12, v5

    goto :goto_a

    :cond_20
    move/from16 v12, v26

    :goto_a
    move v9, v12

    :cond_21
    const/16 v0, 0x40

    add-int/2addr v8, v0

    if-eqz v9, :cond_22

    sget-object v0, Linet/ipaddr/format/validate/r;->E:[Linet/ipaddr/format/validate/r$e;

    goto :goto_b

    :cond_22
    sget-object v0, Linet/ipaddr/format/validate/r;->D:[Linet/ipaddr/format/validate/r$e;

    :goto_b
    aget-object v1, v0, v8

    if-nez v1, :cond_23

    new-instance v1, Linet/ipaddr/format/validate/r$e;

    invoke-direct {v1, v8, v9}, Linet/ipaddr/format/validate/r$e;-><init>(IZ)V

    aput-object v1, v0, v8

    :cond_23
    return-object v1

    :cond_24
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "value > upper value"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    nop

    :array_0
    .array-data 1
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
    .end array-data
.end method

.method public static o2(JJJJ)Linet/ipaddr/format/validate/r$j;
    .locals 15

    cmp-long v0, p0, p2

    if-nez v0, :cond_0

    sget-object v0, Linet/ipaddr/format/validate/r;->B:Linet/ipaddr/format/validate/r$f;

    return-object v0

    :cond_0
    if-gtz v0, :cond_11

    const-wide/16 v0, 0x0

    cmp-long v2, p4, v0

    if-eqz v2, :cond_10

    cmp-long v2, p4, p6

    if-nez v2, :cond_1

    goto/16 :goto_6

    :cond_1
    xor-long v2, p0, p2

    const-wide/16 v4, 0x1

    cmp-long v6, v2, v4

    if-eqz v6, :cond_f

    invoke-static {v2, v3}, Ljava/lang/Long;->numberOfLeadingZeros(J)I

    move-result v2

    const-wide/16 v6, -0x1

    ushr-long v8, v6, v2

    and-long v8, p4, v8

    cmp-long v3, v8, v0

    if-eqz v3, :cond_f

    invoke-static {v8, v9}, Ljava/lang/Long;->numberOfLeadingZeros(J)I

    move-result v3

    const/16 v8, 0x3f

    if-ne v3, v8, :cond_2

    move-wide v9, v0

    goto :goto_0

    :cond_2
    add-int/lit8 v9, v3, 0x1

    ushr-long v9, v6, v9

    :goto_0
    and-long v11, p4, v9

    cmp-long v11, v11, v9

    const/4 v12, 0x0

    const/4 v13, 0x1

    if-nez v11, :cond_3

    move v11, v13

    goto :goto_1

    :cond_3
    move v11, v12

    :goto_1
    cmp-long v14, p6, v6

    if-nez v14, :cond_5

    if-eqz v11, :cond_4

    if-le v3, v2, :cond_5

    :cond_4
    invoke-static/range {p2 .. p3}, Ljava/lang/Long;->numberOfLeadingZeros(J)I

    move-result v14

    ushr-long/2addr v6, v14

    goto :goto_2

    :cond_5
    move-wide/from16 v6, p6

    :goto_2
    cmp-long v14, p0, v0

    if-nez v14, :cond_7

    cmp-long v6, p2, v6

    if-nez v6, :cond_7

    if-eqz v11, :cond_6

    sget-object v0, Linet/ipaddr/format/validate/r;->B:Linet/ipaddr/format/validate/r$f;

    return-object v0

    :cond_6
    sget-object v0, Linet/ipaddr/format/validate/r;->C:Linet/ipaddr/format/validate/r$f;

    return-object v0

    :cond_7
    if-le v3, v2, :cond_b

    if-eqz v11, :cond_8

    if-ge v3, v8, :cond_8

    sub-long v0, p2, p0

    add-long/2addr v0, v4

    rsub-int/lit8 v2, v3, 0x40

    shl-long/2addr v4, v2

    cmp-long v0, v0, v4

    if-gez v0, :cond_8

    goto :goto_3

    :cond_8
    move v12, v11

    :goto_3
    if-eqz v12, :cond_9

    sget-object v0, Linet/ipaddr/format/validate/r;->I:[Linet/ipaddr/format/validate/r$i;

    goto :goto_4

    :cond_9
    sget-object v0, Linet/ipaddr/format/validate/r;->H:[Linet/ipaddr/format/validate/r$i;

    :goto_4
    aget-object v1, v0, v3

    if-nez v1, :cond_a

    new-instance v1, Linet/ipaddr/format/validate/r$i;

    invoke-direct {v1, v3, v12}, Linet/ipaddr/format/validate/r$i;-><init>(IZ)V

    aput-object v1, v0, v3

    :cond_a
    return-object v1

    :cond_b
    if-nez v11, :cond_f

    not-long v4, v9

    and-long v4, p2, v4

    or-long v6, p0, v9

    add-int/2addr v3, v13

    sub-int/2addr v8, v3

    shl-int v2, v13, v8

    int-to-long v2, v2

    :goto_5
    cmp-long v8, v2, v0

    if-eqz v8, :cond_e

    and-long v8, p4, v2

    cmp-long v8, v8, v0

    if-eqz v8, :cond_d

    or-long v8, v4, v2

    cmp-long v10, v8, p2

    if-gtz v10, :cond_c

    move-wide v4, v8

    :cond_c
    not-long v8, v2

    and-long/2addr v8, v6

    cmp-long v10, v8, p0

    if-ltz v10, :cond_d

    move-wide v6, v8

    :cond_d
    ushr-long/2addr v2, v13

    goto :goto_5

    :cond_e
    new-instance v0, Linet/ipaddr/format/validate/r$k;

    invoke-direct {v0, v6, v7, v4, v5}, Linet/ipaddr/format/validate/r$k;-><init>(JJ)V

    return-object v0

    :cond_f
    sget-object v0, Linet/ipaddr/format/validate/r;->B:Linet/ipaddr/format/validate/r$f;

    return-object v0

    :cond_10
    :goto_6
    sget-object v0, Linet/ipaddr/format/validate/r;->B:Linet/ipaddr/format/validate/r$f;

    return-object v0

    :cond_11
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "value > upper value"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private p2(Z)Z
    .locals 3

    invoke-virtual {p0}, Linet/ipaddr/format/validate/c;->U0()Linet/ipaddr/format/validate/a;

    move-result-object v0

    invoke-virtual {v0}, Linet/ipaddr/format/validate/a;->Z()I

    move-result v0

    invoke-virtual {p0}, Linet/ipaddr/format/validate/r;->e1()Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    const/4 p1, 0x4

    if-eq v0, p1, :cond_3

    return v2

    :cond_0
    invoke-virtual {p0}, Linet/ipaddr/format/validate/r;->g1()Z

    move-result v1

    if-eqz v1, :cond_2

    if-eqz p1, :cond_1

    return v2

    :cond_1
    const/4 p1, 0x6

    goto :goto_0

    :cond_2
    const/16 p1, 0x8

    :goto_0
    if-eq v0, p1, :cond_3

    invoke-virtual {p0}, Linet/ipaddr/format/validate/c;->a1()Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    invoke-virtual {p0}, Linet/ipaddr/format/validate/r;->Y1()Linet/ipaddr/g;

    move-result-object p1

    if-eqz p1, :cond_4

    invoke-virtual {p1, v2}, Linet/ipaddr/g;->W0(Z)Ljava/lang/Integer;

    move-result-object p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    const/4 p1, 0x0

    return p1
.end method

.method static q2(JJI)[B
    .locals 5

    new-array v0, p4, [B

    add-int/lit8 v1, p4, -0x1

    const/16 v2, 0x8

    sub-int/2addr p4, v2

    :goto_0
    if-ltz v1, :cond_1

    const-wide/16 v3, 0xff

    if-lt v1, p4, :cond_0

    and-long/2addr v3, p0

    long-to-int v3, v3

    int-to-byte v3, v3

    aput-byte v3, v0, v1

    ushr-long/2addr p0, v2

    goto :goto_1

    :cond_0
    and-long/2addr v3, p2

    long-to-int v3, v3

    int-to-byte v3, v3

    aput-byte v3, v0, v1

    ushr-long/2addr p2, v2

    :goto_1
    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method static r2(JJI)[B
    .locals 6

    add-int/lit8 v0, p4, -0x8

    add-int v1, p4, v0

    const/4 v2, 0x1

    move v3, p4

    :goto_0
    if-gt v2, p4, :cond_2

    if-gt v2, v0, :cond_0

    sub-int v4, p4, v2

    shl-int/lit8 v4, v4, 0x3

    ushr-long v4, p2, v4

    :goto_1
    long-to-int v4, v4

    int-to-byte v4, v4

    goto :goto_2

    :cond_0
    sub-int v4, v1, v2

    shl-int/lit8 v4, v4, 0x3

    ushr-long v4, p0, v4

    goto :goto_1

    :goto_2
    if-eqz v4, :cond_1

    goto :goto_3

    :cond_1
    add-int/lit8 v3, v3, -0x1

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    :goto_3
    invoke-static {p0, p1, p2, p3, v3}, Linet/ipaddr/format/validate/r;->q2(JJI)[B

    move-result-object p0

    return-object p0
.end method

.method public static synthetic w1([Linet/ipaddr/ipv6/V;I)I
    .locals 0

    invoke-static {p0, p1}, Linet/ipaddr/format/validate/r;->h2([Linet/ipaddr/ipv6/V;I)I

    move-result p0

    return p0
.end method

.method public static synthetic x1([II)I
    .locals 0

    invoke-static {p0, p1}, Linet/ipaddr/format/validate/r;->m2([II)I

    move-result p0

    return p0
.end method

.method public static synthetic y1(II[II)I
    .locals 0

    invoke-static {p0, p1, p2, p3}, Linet/ipaddr/format/validate/r;->j2(II[II)I

    move-result p0

    return p0
.end method

.method public static synthetic z1(II[II)I
    .locals 0

    invoke-static {p0, p1, p2, p3}, Linet/ipaddr/format/validate/r;->k2(II[II)I

    move-result p0

    return p0
.end method


# virtual methods
.method public M()Linet/ipaddr/g;
    .locals 2

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Linet/ipaddr/format/validate/r;->U1(Z)Linet/ipaddr/format/validate/r$l;

    move-result-object v0

    invoke-static {v0}, Linet/ipaddr/format/validate/r$l;->j(Linet/ipaddr/format/validate/r$l;)Linet/ipaddr/IncompatibleAddressException;

    move-result-object v1

    if-nez v1, :cond_2

    invoke-static {v0}, Linet/ipaddr/format/validate/r$l;->n(Linet/ipaddr/format/validate/r$l;)Linet/ipaddr/IncompatibleAddressException;

    move-result-object v1

    if-nez v1, :cond_1

    invoke-static {v0}, Linet/ipaddr/format/validate/r$l;->p(Linet/ipaddr/format/validate/r$l;)Linet/ipaddr/IncompatibleAddressException;

    move-result-object v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, Linet/ipaddr/format/validate/r$l;->a()Linet/ipaddr/g;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-static {v0}, Linet/ipaddr/format/validate/r$l;->p(Linet/ipaddr/format/validate/r$l;)Linet/ipaddr/IncompatibleAddressException;

    move-result-object v0

    throw v0

    :cond_1
    invoke-static {v0}, Linet/ipaddr/format/validate/r$l;->n(Linet/ipaddr/format/validate/r$l;)Linet/ipaddr/IncompatibleAddressException;

    move-result-object v0

    throw v0

    :cond_2
    invoke-static {v0}, Linet/ipaddr/format/validate/r$l;->j(Linet/ipaddr/format/validate/r$l;)Linet/ipaddr/IncompatibleAddressException;

    move-result-object v0

    throw v0
.end method

.method public S0()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method S1(ZZZ)V
    .locals 2

    invoke-virtual {p0}, Linet/ipaddr/format/validate/r;->o0()Linet/ipaddr/g$a;

    move-result-object v0

    invoke-virtual {v0}, Linet/ipaddr/g$a;->isIPv4()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-direct {p0, p1, p2, p3}, Linet/ipaddr/format/validate/r;->N1(ZZZ)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Linet/ipaddr/g$a;->isIPv6()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-direct {p0, p1, p2, p3}, Linet/ipaddr/format/validate/r;->P1(ZZZ)V

    :cond_1
    :goto_0
    return-void
.end method

.method U1(Z)Linet/ipaddr/format/validate/r$l;
    .locals 2

    iget-object v0, p0, Linet/ipaddr/format/validate/r;->y:Linet/ipaddr/format/validate/r$l;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Linet/ipaddr/format/validate/r$l;->b0()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_3

    :cond_0
    if-eqz p1, :cond_1

    invoke-virtual {v0}, Linet/ipaddr/format/validate/r$l;->J()Z

    move-result v1

    if-nez v1, :cond_7

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Linet/ipaddr/format/validate/r$l;->F()Z

    move-result v1

    if-nez v1, :cond_7

    :goto_0
    monitor-enter p0

    if-eqz p1, :cond_2

    :try_start_0
    invoke-virtual {v0}, Linet/ipaddr/format/validate/r$l;->B()Linet/ipaddr/g;

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_2
    invoke-virtual {v0}, Linet/ipaddr/format/validate/r$l;->a()Linet/ipaddr/g;

    :goto_1
    monitor-exit p0

    goto :goto_6

    :goto_2
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_3
    :goto_3
    monitor-enter p0

    :try_start_1
    iget-object v0, p0, Linet/ipaddr/format/validate/r;->y:Linet/ipaddr/format/validate/r$l;

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Linet/ipaddr/format/validate/r$l;->b0()Z

    move-result v1

    if-eqz v1, :cond_5

    goto :goto_4

    :catchall_1
    move-exception p1

    goto :goto_7

    :cond_4
    :goto_4
    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1, v1}, Linet/ipaddr/format/validate/r;->S1(ZZZ)V

    iget-object v0, p0, Linet/ipaddr/format/validate/r;->y:Linet/ipaddr/format/validate/r$l;

    invoke-virtual {p0}, Linet/ipaddr/format/validate/r;->d2()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-virtual {p0}, Linet/ipaddr/format/validate/a;->E()V

    :cond_5
    if-eqz p1, :cond_6

    invoke-virtual {v0}, Linet/ipaddr/format/validate/r$l;->B()Linet/ipaddr/g;

    goto :goto_5

    :cond_6
    invoke-virtual {v0}, Linet/ipaddr/format/validate/r$l;->a()Linet/ipaddr/g;

    :goto_5
    monitor-exit p0

    :cond_7
    :goto_6
    return-object v0

    :goto_7
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    throw p1
.end method

.method public bridge synthetic X0()Z
    .locals 1

    invoke-super {p0}, Linet/ipaddr/format/validate/c;->X0()Z

    move-result v0

    return v0
.end method

.method public Y1()Linet/ipaddr/g;
    .locals 1

    invoke-virtual {p0}, Linet/ipaddr/format/validate/c;->V0()Linet/ipaddr/format/validate/i;

    move-result-object v0

    invoke-virtual {v0}, Linet/ipaddr/format/validate/i;->l()Linet/ipaddr/g;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic Z()I
    .locals 1

    invoke-super {p0}, Linet/ipaddr/format/validate/a;->Z()I

    move-result v0

    return v0
.end method

.method public Z1()Linet/ipaddr/m;
    .locals 2

    iget-object v0, p0, Linet/ipaddr/format/validate/r;->y:Linet/ipaddr/format/validate/r$l;

    if-eqz v0, :cond_0

    invoke-static {v0}, Linet/ipaddr/format/validate/r$l;->c(Linet/ipaddr/format/validate/r$l;)Linet/ipaddr/m;

    move-result-object v1

    if-nez v1, :cond_4

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Linet/ipaddr/format/validate/r;->y:Linet/ipaddr/format/validate/r$l;

    if-eqz v0, :cond_1

    invoke-static {v0}, Linet/ipaddr/format/validate/r$l;->c(Linet/ipaddr/format/validate/r$l;)Linet/ipaddr/m;

    move-result-object v1

    if-nez v1, :cond_3

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_2

    :cond_1
    :goto_0
    if-eqz v0, :cond_2

    invoke-virtual {v0}, Linet/ipaddr/format/validate/r$l;->b0()Z

    move-result v1

    if-nez v1, :cond_2

    invoke-virtual {v0}, Linet/ipaddr/format/validate/r$l;->P()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {v0}, Linet/ipaddr/format/validate/r$l;->a()Linet/ipaddr/g;

    move-result-object v1

    invoke-virtual {v1}, Linet/ipaddr/g;->r1()Linet/ipaddr/m;

    move-result-object v1

    invoke-static {v0, v1}, Linet/ipaddr/format/validate/r$l;->g(Linet/ipaddr/format/validate/r$l;Linet/ipaddr/m;)Linet/ipaddr/m;

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1, v1}, Linet/ipaddr/format/validate/r;->S1(ZZZ)V

    iget-object v0, p0, Linet/ipaddr/format/validate/r;->y:Linet/ipaddr/format/validate/r$l;

    invoke-virtual {v0}, Linet/ipaddr/format/validate/r$l;->v()Linet/ipaddr/m;

    invoke-virtual {p0}, Linet/ipaddr/format/validate/r;->d2()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-virtual {p0}, Linet/ipaddr/format/validate/a;->E()V

    :cond_3
    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_4
    invoke-static {v0}, Linet/ipaddr/format/validate/r$l;->c(Linet/ipaddr/format/validate/r$l;)Linet/ipaddr/m;

    move-result-object v0

    return-object v0

    :goto_2
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method c2()Linet/ipaddr/g;
    .locals 2

    iget-object v0, p0, Linet/ipaddr/format/validate/r;->y:Linet/ipaddr/format/validate/r$l;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Linet/ipaddr/format/validate/r$l;->K()Z

    move-result v1

    if-nez v1, :cond_3

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Linet/ipaddr/format/validate/r;->y:Linet/ipaddr/format/validate/r$l;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Linet/ipaddr/format/validate/r$l;->K()Z

    move-result v1

    if-nez v1, :cond_2

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, v1}, Linet/ipaddr/format/validate/r;->S1(ZZZ)V

    iget-object v0, p0, Linet/ipaddr/format/validate/r;->y:Linet/ipaddr/format/validate/r$l;

    invoke-virtual {p0}, Linet/ipaddr/format/validate/a;->E()V

    :cond_2
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_3
    invoke-virtual {v0}, Linet/ipaddr/format/validate/r$l;->C()Linet/ipaddr/g;

    move-result-object v0

    return-object v0

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public bridge synthetic d1()Z
    .locals 1

    invoke-super {p0}, Linet/ipaddr/format/validate/c;->d1()Z

    move-result v0

    return v0
.end method

.method d2()Z
    .locals 2

    iget-object v0, p0, Linet/ipaddr/format/validate/r;->y:Linet/ipaddr/format/validate/r$l;

    invoke-virtual {v0}, Linet/ipaddr/format/validate/r$l;->b0()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {v0}, Linet/ipaddr/format/validate/r$l;->P()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, Linet/ipaddr/format/validate/r$l;->T()Z

    move-result v1

    if-nez v1, :cond_1

    :cond_0
    invoke-virtual {v0}, Linet/ipaddr/format/validate/r$l;->S()Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public bridge synthetic e1()Z
    .locals 1

    invoke-super {p0}, Linet/ipaddr/format/validate/c;->e1()Z

    move-result v0

    return v0
.end method

.method protected e2(Ljava/lang/Integer;Linet/ipaddr/i;[I)Z
    .locals 10

    invoke-virtual {p2}, Linet/ipaddr/i;->n0()Linet/ipaddr/g$a;

    move-result-object v0

    invoke-static {v0}, Linet/ipaddr/j;->T1(Linet/ipaddr/g$a;)I

    move-result v4

    invoke-static {v0}, Linet/ipaddr/j;->S1(Linet/ipaddr/g$a;)I

    move-result v5

    invoke-static {v0}, Linet/ipaddr/k;->x2(Linet/ipaddr/g$a;)I

    move-result v6

    invoke-virtual {p2}, Linet/ipaddr/c;->d()Linet/ipaddr/c$b;

    move-result-object v8

    invoke-virtual {p0}, Linet/ipaddr/format/validate/c;->U0()Linet/ipaddr/format/validate/a;

    move-result-object p2

    invoke-virtual {p2}, Linet/ipaddr/format/validate/a;->Z()I

    move-result v3

    invoke-virtual {p0}, Linet/ipaddr/format/validate/c;->a1()Z

    move-result v0

    if-eqz v0, :cond_0

    rsub-int/lit8 v0, v3, 0x8

    invoke-virtual {p2}, Linet/ipaddr/format/validate/a;->d()I

    move-result p2

    new-instance v1, Linet/ipaddr/format/validate/n;

    invoke-direct {v1, p2, v0, p3}, Linet/ipaddr/format/validate/n;-><init>(II[I)V

    new-instance v2, Linet/ipaddr/format/validate/o;

    invoke-direct {v2, p2, v0, p3}, Linet/ipaddr/format/validate/o;-><init>(II[I)V

    add-int/2addr v3, v0

    const/4 v9, 0x0

    move-object v7, p1

    invoke-static/range {v1 .. v9}, Linet/ipaddr/format/validate/g;->h(Linet/ipaddr/a$a;Linet/ipaddr/a$a;IIIILjava/lang/Integer;Linet/ipaddr/c$b;Z)Z

    move-result p1

    return p1

    :cond_0
    new-instance v1, Linet/ipaddr/format/validate/p;

    invoke-direct {v1, p3}, Linet/ipaddr/format/validate/p;-><init>([I)V

    new-instance v2, Linet/ipaddr/format/validate/q;

    invoke-direct {v2, p3}, Linet/ipaddr/format/validate/q;-><init>([I)V

    const/4 v9, 0x0

    move-object v7, p1

    invoke-static/range {v1 .. v9}, Linet/ipaddr/format/validate/g;->h(Linet/ipaddr/a$a;Linet/ipaddr/a$a;IIIILjava/lang/Integer;Linet/ipaddr/c$b;Z)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic f1()Z
    .locals 1

    invoke-super {p0}, Linet/ipaddr/format/validate/c;->f1()Z

    move-result v0

    return v0
.end method

.method public g0()Ljava/lang/Integer;
    .locals 1

    invoke-virtual {p0}, Linet/ipaddr/format/validate/c;->V0()Linet/ipaddr/format/validate/i;

    move-result-object v0

    invoke-virtual {v0}, Linet/ipaddr/format/validate/i;->h()Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic g1()Z
    .locals 1

    invoke-super {p0}, Linet/ipaddr/format/validate/c;->g1()Z

    move-result v0

    return v0
.end method

.method public getParameters()Linet/ipaddr/o;
    .locals 1

    iget-object v0, p0, Linet/ipaddr/format/validate/r;->w:Linet/ipaddr/o;

    return-object v0
.end method

.method public getType()Linet/ipaddr/format/validate/d$h;
    .locals 1

    invoke-virtual {p0}, Linet/ipaddr/format/validate/r;->o0()Linet/ipaddr/g$a;

    move-result-object v0

    invoke-static {v0}, Linet/ipaddr/format/validate/d$h;->from(Linet/ipaddr/g$a;)Linet/ipaddr/format/validate/d$h;

    move-result-object v0

    return-object v0
.end method

.method public k0(Linet/ipaddr/format/validate/d;)Ljava/lang/Boolean;
    .locals 3

    instance-of v0, p1, Linet/ipaddr/format/validate/r;

    if-eqz v0, :cond_2

    iget-object v0, p0, Linet/ipaddr/format/validate/r;->y:Linet/ipaddr/format/validate/r$l;

    if-eqz v0, :cond_0

    if-nez v0, :cond_2

    :cond_0
    check-cast p1, Linet/ipaddr/format/validate/r;

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p0, p1, v0, v1}, Linet/ipaddr/format/validate/r;->K1(Linet/ipaddr/format/validate/r;ZZ)Ljava/lang/Boolean;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {p0}, Linet/ipaddr/format/validate/c;->V0()Linet/ipaddr/format/validate/i;

    move-result-object v2

    invoke-virtual {v2}, Linet/ipaddr/format/validate/i;->o()Ljava/lang/CharSequence;

    move-result-object v2

    invoke-virtual {p1}, Linet/ipaddr/format/validate/c;->V0()Linet/ipaddr/format/validate/i;

    move-result-object p1

    invoke-virtual {p1}, Linet/ipaddr/format/validate/i;->o()Ljava/lang/CharSequence;

    move-result-object p1

    invoke-static {v2, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    move v0, v1

    :cond_1
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :cond_2
    const/4 p1, 0x0

    return-object p1
.end method

.method public bridge synthetic o0()Linet/ipaddr/g$a;
    .locals 1

    invoke-super {p0}, Linet/ipaddr/format/validate/c;->o0()Linet/ipaddr/g$a;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic toString()Ljava/lang/String;
    .locals 1

    invoke-super {p0}, Linet/ipaddr/format/validate/c;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic y0()Z
    .locals 1

    invoke-super {p0}, Linet/ipaddr/format/validate/a;->y0()Z

    move-result v0

    return v0
.end method
