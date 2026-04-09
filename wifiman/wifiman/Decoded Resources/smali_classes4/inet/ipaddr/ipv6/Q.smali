.class public Linet/ipaddr/ipv6/Q;
.super Linet/ipaddr/j;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Iterable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Linet/ipaddr/ipv6/Q$j;,
        Linet/ipaddr/ipv6/Q$i;,
        Linet/ipaddr/ipv6/Q$d;,
        Linet/ipaddr/ipv6/Q$h;,
        Linet/ipaddr/ipv6/Q$g;,
        Linet/ipaddr/ipv6/Q$c;,
        Linet/ipaddr/ipv6/Q$e;,
        Linet/ipaddr/ipv6/Q$f;
    }
.end annotation


# static fields
.field private static y:[Linet/ipaddr/ipv6/e$a;

.field private static final z:[Ljava/math/BigInteger;


# instance fields
.field private transient r:Linet/ipaddr/ipv6/Q$f;

.field private transient s:Lbg/d$g;

.field transient t:Linet/ipaddr/ipv4/I;

.field transient u:Linet/ipaddr/ipv6/Q$i;

.field public final v:I

.field private transient w:Lbg/f$c;

.field private transient x:Lbg/f$c;


# direct methods
.method static constructor <clinit>()V
    .locals 12

    const/16 v0, 0x8

    new-array v0, v0, [Linet/ipaddr/ipv6/e$a;

    sput-object v0, Linet/ipaddr/ipv6/Q;->y:[Linet/ipaddr/ipv6/e$a;

    sget-object v1, Ljava/math/BigInteger;->ZERO:Ljava/math/BigInteger;

    const-wide/32 v2, 0xffff

    invoke-static {v2, v3}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v2

    const-wide v3, 0xffffffffL

    invoke-static {v3, v4}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v3

    const-wide v4, 0xffffffffffffL

    invoke-static {v4, v5}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v4

    const-wide/16 v5, 0x1

    invoke-static {v5, v6}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v0

    const/16 v7, 0x40

    invoke-virtual {v0, v7}, Ljava/math/BigInteger;->shiftLeft(I)Ljava/math/BigInteger;

    move-result-object v0

    sget-object v7, Ljava/math/BigInteger;->ONE:Ljava/math/BigInteger;

    invoke-virtual {v0, v7}, Ljava/math/BigInteger;->subtract(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v0

    invoke-static {v5, v6}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v8

    const/16 v9, 0x50

    invoke-virtual {v8, v9}, Ljava/math/BigInteger;->shiftLeft(I)Ljava/math/BigInteger;

    move-result-object v8

    invoke-virtual {v8, v7}, Ljava/math/BigInteger;->subtract(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v8

    invoke-static {v5, v6}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v9

    const/16 v10, 0x60

    invoke-virtual {v9, v10}, Ljava/math/BigInteger;->shiftLeft(I)Ljava/math/BigInteger;

    move-result-object v9

    invoke-virtual {v9, v7}, Ljava/math/BigInteger;->subtract(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v9

    invoke-static {v5, v6}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v10

    const/16 v11, 0x70

    invoke-virtual {v10, v11}, Ljava/math/BigInteger;->shiftLeft(I)Ljava/math/BigInteger;

    move-result-object v10

    invoke-virtual {v10, v7}, Ljava/math/BigInteger;->subtract(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v10

    invoke-static {v5, v6}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v5

    const/16 v6, 0x80

    invoke-virtual {v5, v6}, Ljava/math/BigInteger;->shiftLeft(I)Ljava/math/BigInteger;

    move-result-object v5

    invoke-virtual {v5, v7}, Ljava/math/BigInteger;->subtract(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v11

    move-object v5, v0

    move-object v6, v8

    move-object v7, v9

    move-object v8, v10

    move-object v9, v11

    filled-new-array/range {v1 .. v9}, [Ljava/math/BigInteger;

    move-result-object v0

    sput-object v0, Linet/ipaddr/ipv6/Q;->z:[Ljava/math/BigInteger;

    return-void
.end method

.method protected constructor <init>([BIIILjava/lang/Integer;ZZ)V
    .locals 13

    move-object v0, p0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-ltz p4, :cond_0

    move/from16 v3, p4

    goto :goto_0

    :cond_0
    sub-int v3, p3, p2

    .line 30
    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    move-result v3

    add-int/2addr v3, v1

    shr-int/2addr v3, v1

    :goto_0
    new-array v3, v3, [Linet/ipaddr/ipv6/V;

    invoke-direct {p0, v3, v2, v2}, Linet/ipaddr/j;-><init>([Linet/ipaddr/k;ZZ)V

    .line 31
    invoke-virtual {p0}, Linet/ipaddr/ipv6/Q;->F3()[Linet/ipaddr/ipv6/V;

    move-result-object v11

    .line 32
    invoke-virtual {p0}, Linet/ipaddr/ipv6/Q;->B3()Linet/ipaddr/ipv6/e;

    move-result-object v12

    .line 33
    invoke-virtual {p0}, Linet/ipaddr/ipv6/Q;->e0()I

    move-result v7

    .line 34
    invoke-virtual {p0}, Linet/ipaddr/ipv6/Q;->m0()I

    move-result v8

    move-object v3, v11

    move-object v4, p1

    move v5, p2

    move/from16 v6, p3

    move-object v9, v12

    move-object/from16 v10, p5

    .line 35
    invoke-static/range {v3 .. v10}, Lbg/d;->F1([LZf/d;[BIIIILinet/ipaddr/c;Ljava/lang/Integer;)[LZf/d;

    move-object v3, p1

    .line 36
    array-length v4, v3

    array-length v5, v11

    shl-int/2addr v5, v1

    if-ne v4, v5, :cond_1

    goto :goto_1

    :cond_1
    move v1, v2

    :goto_1
    if-eqz p5, :cond_d

    .line 37
    invoke-virtual/range {p5 .. p5}, Ljava/lang/Integer;->intValue()I

    move-result v4

    if-ltz v4, :cond_c

    .line 38
    array-length v4, v11

    shl-int/lit8 v4, v4, 0x4

    .line 39
    invoke-virtual/range {p5 .. p5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    if-le v5, v4, :cond_3

    .line 40
    invoke-virtual/range {p5 .. p5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    const/16 v6, 0x80

    if-gt v5, v6, :cond_2

    .line 41
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    goto :goto_2

    .line 42
    :cond_2
    new-instance v1, Linet/ipaddr/PrefixLenException;

    invoke-virtual/range {p5 .. p5}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-direct {v1, v2}, Linet/ipaddr/PrefixLenException;-><init>(I)V

    throw v1

    :cond_3
    move-object/from16 v4, p5

    .line 43
    :goto_2
    array-length v5, v11

    if-lez v5, :cond_a

    .line 44
    invoke-virtual {v12}, Linet/ipaddr/ipv6/e;->d()Linet/ipaddr/c$b;

    move-result-object v5

    invoke-virtual {v5}, Linet/ipaddr/c$b;->zeroHostsAreSubnets()Z

    move-result v5

    if-eqz v5, :cond_6

    if-nez p7, :cond_6

    .line 45
    invoke-static {v11, v4, v12, v2}, Linet/ipaddr/j;->l2([Linet/ipaddr/k;Ljava/lang/Integer;Linet/ipaddr/i;Z)Z

    move-result v5

    if-eqz v5, :cond_4

    .line 46
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v1

    .line 47
    invoke-virtual {p0}, Linet/ipaddr/ipv6/Q;->m0()I

    move-result v3

    .line 48
    invoke-virtual {p0}, Linet/ipaddr/ipv6/Q;->e0()I

    move-result v5

    .line 49
    invoke-virtual {v12}, Linet/ipaddr/ipv6/e;->T()Linet/ipaddr/ipv6/e$a;

    move-result-object v6

    new-instance v7, Linet/ipaddr/ipv6/O;

    invoke-direct {v7}, Linet/ipaddr/ipv6/O;-><init>()V

    move-object p1, v12

    move p2, v1

    move-object/from16 p3, v11

    move/from16 p4, v3

    move/from16 p5, v5

    move-object/from16 p6, v6

    move-object/from16 p7, v7

    .line 50
    invoke-static/range {p1 .. p7}, Lbg/d;->D1(Linet/ipaddr/c;I[LZf/d;IILinet/ipaddr/c$a;Ljava/util/function/BiFunction;)[LZf/d;

    goto :goto_5

    :cond_4
    if-eqz v1, :cond_b

    .line 51
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {p0}, Linet/ipaddr/ipv6/Q;->f()I

    move-result v5

    if-lt v1, v5, :cond_b

    if-eqz p6, :cond_5

    .line 52
    invoke-virtual {p1}, [B->clone()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [B

    goto :goto_3

    :cond_5
    move-object v1, v3

    :goto_3
    invoke-virtual {p0, v1}, Lag/d;->e1([B)V

    goto :goto_5

    :cond_6
    if-eqz v1, :cond_7

    .line 53
    invoke-virtual {v12}, Linet/ipaddr/ipv6/e;->d()Linet/ipaddr/c$b;

    move-result-object v1

    invoke-virtual {v1}, Linet/ipaddr/c$b;->prefixedSubnetsAreExplicit()Z

    move-result v1

    if-nez v1, :cond_8

    :cond_7
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {p0}, Linet/ipaddr/ipv6/Q;->f()I

    move-result v5

    if-lt v1, v5, :cond_b

    :cond_8
    if-eqz p6, :cond_9

    .line 54
    invoke-virtual {p1}, [B->clone()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [B

    goto :goto_4

    :cond_9
    move-object v1, v3

    :goto_4
    invoke-virtual {p0, v1}, Lag/d;->e1([B)V

    goto :goto_5

    :cond_a
    if-eqz v1, :cond_b

    .line 55
    invoke-virtual {p0, p1}, Lag/d;->e1([B)V

    .line 56
    :cond_b
    :goto_5
    iput-object v4, v0, Lag/d;->c:Ljava/lang/Integer;

    goto :goto_7

    .line 57
    :cond_c
    new-instance v1, Linet/ipaddr/PrefixLenException;

    invoke-virtual/range {p5 .. p5}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-direct {v1, v2}, Linet/ipaddr/PrefixLenException;-><init>(I)V

    throw v1

    .line 58
    :cond_d
    sget-object v4, Lag/d;->g:Ljava/lang/Integer;

    iput-object v4, v0, Lag/d;->c:Ljava/lang/Integer;

    if-eqz v1, :cond_f

    if-eqz p6, :cond_e

    .line 59
    invoke-virtual {p1}, [B->clone()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [B

    goto :goto_6

    :cond_e
    move-object v1, v3

    :goto_6
    invoke-virtual {p0, v1}, Lag/d;->e1([B)V

    .line 60
    :cond_f
    :goto_7
    iput v2, v0, Linet/ipaddr/ipv6/Q;->v:I

    return-void
.end method

.method protected constructor <init>([BILjava/lang/Integer;ZZ)V
    .locals 8

    .line 29
    array-length v3, p1

    const/4 v2, 0x0

    move-object v0, p0

    move-object v1, p1

    move v4, p2

    move-object v5, p3

    move v6, p4

    move v7, p5

    invoke-direct/range {v0 .. v7}, Linet/ipaddr/ipv6/Q;-><init>([BIIILjava/lang/Integer;ZZ)V

    return-void
.end method

.method protected constructor <init>([Linet/ipaddr/ipv6/V;IZ)V
    .locals 1

    const/4 v0, 0x1

    .line 21
    invoke-direct {p0, p1, p2, p3, v0}, Linet/ipaddr/ipv6/Q;-><init>([Linet/ipaddr/ipv6/V;IZZ)V

    return-void
.end method

.method protected constructor <init>([Linet/ipaddr/ipv6/V;IZLjava/lang/Integer;Z)V
    .locals 8

    const/4 v0, 0x0

    if-nez p4, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    move v1, v0

    .line 1
    :goto_0
    invoke-direct {p0, p1, p2, p3, v1}, Linet/ipaddr/ipv6/Q;-><init>([Linet/ipaddr/ipv6/V;IZZ)V

    if-eqz p4, :cond_7

    .line 2
    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    move-result p2

    if-ltz p2, :cond_6

    .line 3
    array-length p2, p1

    shl-int/lit8 p2, p2, 0x4

    .line 4
    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    move-result p3

    if-le p3, p2, :cond_2

    .line 5
    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    move-result p3

    const/16 v1, 0x80

    if-gt p3, v1, :cond_1

    .line 6
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p4

    goto :goto_1

    .line 7
    :cond_1
    new-instance p1, Linet/ipaddr/PrefixLenException;

    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-direct {p1, p2}, Linet/ipaddr/PrefixLenException;-><init>(I)V

    throw p1

    .line 8
    :cond_2
    :goto_1
    array-length p2, p1

    if-lez p2, :cond_5

    .line 9
    iget-object p2, p0, Lag/d;->c:Ljava/lang/Integer;

    sget-object p3, Lag/d;->g:Ljava/lang/Integer;

    if-eq p2, p3, :cond_3

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    move-result p3

    if-ge p2, p3, :cond_3

    .line 10
    iget-object p4, p0, Lag/d;->c:Ljava/lang/Integer;

    .line 11
    :cond_3
    invoke-virtual {p0}, Linet/ipaddr/ipv6/Q;->B3()Linet/ipaddr/ipv6/e;

    move-result-object v1

    .line 12
    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    move-result v2

    .line 13
    invoke-virtual {p0}, Linet/ipaddr/ipv6/Q;->F3()[Linet/ipaddr/ipv6/V;

    move-result-object v3

    .line 14
    invoke-virtual {p0}, Linet/ipaddr/ipv6/Q;->m0()I

    move-result v4

    .line 15
    invoke-virtual {p0}, Linet/ipaddr/ipv6/Q;->e0()I

    move-result v5

    .line 16
    invoke-virtual {v1}, Linet/ipaddr/ipv6/e;->T()Linet/ipaddr/ipv6/e$a;

    move-result-object v6

    if-nez p5, :cond_4

    .line 17
    invoke-static {p1, p4, v1, v0}, Linet/ipaddr/j;->l2([Linet/ipaddr/k;Ljava/lang/Integer;Linet/ipaddr/i;Z)Z

    move-result p1

    if-eqz p1, :cond_4

    new-instance p1, Linet/ipaddr/ipv6/O;

    invoke-direct {p1}, Linet/ipaddr/ipv6/O;-><init>()V

    :goto_2
    move-object v7, p1

    goto :goto_3

    :cond_4
    new-instance p1, Linet/ipaddr/ipv6/P;

    invoke-direct {p1}, Linet/ipaddr/ipv6/P;-><init>()V

    goto :goto_2

    .line 18
    :goto_3
    invoke-static/range {v1 .. v7}, Lbg/d;->D1(Linet/ipaddr/c;I[LZf/d;IILinet/ipaddr/c$a;Ljava/util/function/BiFunction;)[LZf/d;

    .line 19
    :cond_5
    iput-object p4, p0, Lag/d;->c:Ljava/lang/Integer;

    goto :goto_4

    .line 20
    :cond_6
    new-instance p1, Linet/ipaddr/PrefixLenException;

    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-direct {p1, p2}, Linet/ipaddr/PrefixLenException;-><init>(I)V

    throw p1

    :cond_7
    :goto_4
    return-void
.end method

.method constructor <init>([Linet/ipaddr/ipv6/V;IZZ)V
    .locals 3

    const/4 v0, 0x1

    .line 22
    invoke-direct {p0, p1, p3, v0}, Linet/ipaddr/j;-><init>([Linet/ipaddr/k;ZZ)V

    if-eqz p4, :cond_0

    .line 23
    invoke-virtual {p0}, Lag/d;->i()Z

    move-result p3

    if-eqz p3, :cond_0

    .line 24
    invoke-virtual {p0}, Lbg/f;->F0()Ljava/lang/Integer;

    move-result-object p3

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    invoke-virtual {p0}, Linet/ipaddr/ipv6/Q;->F3()[Linet/ipaddr/ipv6/V;

    move-result-object p4

    new-instance v0, Linet/ipaddr/ipv6/w;

    invoke-direct {v0}, Linet/ipaddr/ipv6/w;-><init>()V

    const/16 v1, 0x10

    const/4 v2, 0x2

    invoke-static {p3, p4, v1, v2, v0}, Lbg/d;->A1(I[Linet/ipaddr/k;IILjava/util/function/Function;)V

    .line 25
    :cond_0
    iput p2, p0, Linet/ipaddr/ipv6/Q;->v:I

    if-ltz p2, :cond_2

    .line 26
    array-length p3, p1

    add-int/2addr p3, p2

    const/16 p4, 0x8

    if-gt p3, p4, :cond_1

    return-void

    .line 27
    :cond_1
    new-instance p3, Linet/ipaddr/AddressValueException;

    array-length p1, p1

    add-int/2addr p2, p1

    int-to-long p1, p2

    invoke-direct {p3, p1, p2}, Linet/ipaddr/AddressValueException;-><init>(J)V

    throw p3

    .line 28
    :cond_2
    new-instance p1, Linet/ipaddr/AddressPositionException;

    invoke-direct {p1, p2}, Linet/ipaddr/AddressPositionException;-><init>(I)V

    throw p1
.end method

.method private D3()Linet/ipaddr/c$a;
    .locals 1

    invoke-virtual {p0}, Linet/ipaddr/ipv6/Q;->B3()Linet/ipaddr/ipv6/e;

    move-result-object v0

    invoke-virtual {v0}, Linet/ipaddr/ipv6/e;->T()Linet/ipaddr/ipv6/e$a;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic G2(Linet/ipaddr/ipv6/Q;)Z
    .locals 0

    invoke-static {p0}, Linet/ipaddr/ipv6/Q;->g4(Linet/ipaddr/ipv6/Q;)Z

    move-result p0

    return p0
.end method

.method public static synthetic H2(Linet/ipaddr/ipv6/b;I)I
    .locals 0

    invoke-static {p0, p1}, Linet/ipaddr/ipv6/Q;->O3(Linet/ipaddr/ipv6/b;I)I

    move-result p0

    return p0
.end method

.method public static synthetic I2(Linet/ipaddr/ipv6/Q;I[Linet/ipaddr/ipv6/V;)Z
    .locals 0

    invoke-direct {p0, p1, p2}, Linet/ipaddr/ipv6/Q;->P3(I[Linet/ipaddr/ipv6/V;)Z

    move-result p0

    return p0
.end method

.method public static synthetic J2(Linet/ipaddr/ipv6/e$a;Ljava/lang/Integer;[Linet/ipaddr/ipv6/V;)Linet/ipaddr/ipv6/Q;
    .locals 0

    invoke-static {p0, p1, p2}, Linet/ipaddr/ipv6/Q;->e4(Linet/ipaddr/ipv6/e$a;Ljava/lang/Integer;[Linet/ipaddr/ipv6/V;)Linet/ipaddr/ipv6/Q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic K2(IILinet/ipaddr/ipv6/b;)Ljava/math/BigInteger;
    .locals 0

    invoke-static {p0, p1, p2}, Linet/ipaddr/ipv6/Q;->k4(IILinet/ipaddr/ipv6/b;)Ljava/math/BigInteger;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic L2(IILinet/ipaddr/ipv6/b;)J
    .locals 0

    invoke-static {p0, p1, p2}, Linet/ipaddr/ipv6/Q;->j4(IILinet/ipaddr/ipv6/b;)J

    move-result-wide p0

    return-wide p0
.end method

.method public static synthetic M2(Linet/ipaddr/ipv6/Q;I)I
    .locals 0

    invoke-direct {p0, p1}, Linet/ipaddr/ipv6/Q;->Q3(I)I

    move-result p0

    return p0
.end method

.method public static synthetic N2(Linet/ipaddr/ipv6/Q;IZZLinet/ipaddr/ipv6/Q;)Ljava/util/Iterator;
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Linet/ipaddr/ipv6/Q;->Z3(IZZLinet/ipaddr/ipv6/Q;)Ljava/util/Iterator;

    move-result-object p0

    return-object p0
.end method

.method private N3(Ljava/util/function/Predicate;)Ljava/util/Iterator;
    .locals 5

    invoke-virtual {p0}, Linet/ipaddr/ipv6/Q;->B3()Linet/ipaddr/ipv6/e;

    move-result-object v0

    invoke-virtual {v0}, Linet/ipaddr/ipv6/e;->d()Linet/ipaddr/c$b;

    move-result-object v0

    invoke-virtual {v0}, Linet/ipaddr/c$b;->allPrefixedAddressesAreSubnets()Z

    move-result v0

    invoke-virtual {p0}, Lag/d;->A0()Z

    move-result v1

    if-nez v1, :cond_1

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lag/d;->i()Z

    move-result v1

    if-nez v1, :cond_1

    :cond_0
    const/4 v1, 0x1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    const/4 v2, 0x0

    if-eqz v1, :cond_3

    if-eqz p1, :cond_2

    invoke-virtual {p0}, Linet/ipaddr/ipv6/Q;->F3()[Linet/ipaddr/ipv6/V;

    move-result-object v3

    invoke-interface {p1, v3}, Ljava/util/function/Predicate;->test(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    goto :goto_1

    :cond_2
    move-object v3, p0

    goto :goto_2

    :cond_3
    :goto_1
    move-object v3, v2

    :goto_2
    invoke-direct {p0}, Linet/ipaddr/ipv6/Q;->r3()Linet/ipaddr/ipv6/e$a;

    move-result-object v4

    if-eqz v1, :cond_4

    move-object p1, v2

    goto :goto_3

    :cond_4
    invoke-direct {p0, p1}, Linet/ipaddr/ipv6/Q;->t4(Ljava/util/function/Predicate;)Ljava/util/Iterator;

    move-result-object p1

    :goto_3
    if-eqz v0, :cond_5

    goto :goto_4

    :cond_5
    invoke-virtual {p0}, Lbg/f;->A()Ljava/lang/Integer;

    move-result-object v2

    :goto_4
    invoke-static {v1, v3, v4, p1, v2}, Lbg/d;->v1(ZLZf/c;Lbg/a;Ljava/util/Iterator;Ljava/lang/Integer;)Ljava/util/Iterator;

    move-result-object p1

    return-object p1
.end method

.method public static synthetic O2(Linet/ipaddr/ipv6/e$a;Ljava/lang/Integer;IILag/d$e;)Z
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Linet/ipaddr/ipv6/Q;->o4(Linet/ipaddr/ipv6/e$a;Ljava/lang/Integer;IILag/d$e;)Z

    move-result p0

    return p0
.end method

.method private static synthetic O3(Linet/ipaddr/ipv6/b;I)I
    .locals 0

    invoke-virtual {p0, p1}, Linet/ipaddr/ipv6/b;->J1(I)Linet/ipaddr/ipv6/V;

    move-result-object p0

    invoke-virtual {p0}, Linet/ipaddr/k;->Q()I

    move-result p0

    return p0
.end method

.method public static synthetic P2(Linet/ipaddr/ipv6/Q;Ljava/lang/Integer;I)Linet/ipaddr/ipv6/V;
    .locals 0

    invoke-direct {p0, p1, p2}, Linet/ipaddr/ipv6/Q;->q4(Ljava/lang/Integer;I)Linet/ipaddr/ipv6/V;

    move-result-object p0

    return-object p0
.end method

.method private synthetic P3(I[Linet/ipaddr/ipv6/V;)Z
    .locals 0

    invoke-virtual {p0, p2, p1}, Linet/ipaddr/ipv6/Q;->L3([Linet/ipaddr/ipv6/V;I)Z

    move-result p1

    return p1
.end method

.method public static synthetic Q2(ILinet/ipaddr/ipv6/Q;)J
    .locals 0

    invoke-static {p0, p1}, Linet/ipaddr/ipv6/Q;->d4(ILinet/ipaddr/ipv6/Q;)J

    move-result-wide p0

    return-wide p0
.end method

.method private synthetic Q3(I)I
    .locals 0

    invoke-virtual {p0, p1}, Linet/ipaddr/ipv6/Q;->C3(I)Linet/ipaddr/ipv6/V;

    move-result-object p1

    invoke-virtual {p1}, Linet/ipaddr/k;->C2()I

    move-result p1

    return p1
.end method

.method public static synthetic R2(Linet/ipaddr/ipv6/Q;ZI)Ljava/util/Iterator;
    .locals 0

    invoke-direct {p0, p1, p2}, Linet/ipaddr/ipv6/Q;->U3(ZI)Ljava/util/Iterator;

    move-result-object p0

    return-object p0
.end method

.method private synthetic R3(ZI)Linet/ipaddr/ipv6/V;
    .locals 0

    if-eqz p1, :cond_0

    invoke-virtual {p0, p2}, Linet/ipaddr/ipv6/Q;->C3(I)Linet/ipaddr/ipv6/V;

    move-result-object p1

    invoke-virtual {p1}, Linet/ipaddr/ipv6/V;->b3()Linet/ipaddr/ipv6/V;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p2}, Linet/ipaddr/ipv6/Q;->C3(I)Linet/ipaddr/ipv6/V;

    move-result-object p1

    invoke-virtual {p1}, Linet/ipaddr/ipv6/V;->g3()Linet/ipaddr/ipv6/V;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public static synthetic S2(IILinet/ipaddr/ipv6/Q;)J
    .locals 0

    invoke-static {p0, p1, p2}, Linet/ipaddr/ipv6/Q;->a4(IILinet/ipaddr/ipv6/Q;)J

    move-result-wide p0

    return-wide p0
.end method

.method private synthetic S3(III)I
    .locals 2

    if-ne p3, p1, :cond_0

    invoke-virtual {p0, p3}, Linet/ipaddr/ipv6/Q;->C3(I)Linet/ipaddr/ipv6/V;

    move-result-object p1

    invoke-interface {p1}, Lag/g;->f()I

    move-result v0

    invoke-virtual {p0}, Linet/ipaddr/ipv6/Q;->m0()I

    move-result v1

    invoke-static {v1, p2, p3}, Linet/ipaddr/j;->q1(III)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    sub-int/2addr v0, p2

    invoke-virtual {p1}, Linet/ipaddr/k;->w0()I

    move-result p2

    ushr-int/2addr p2, v0

    invoke-virtual {p1}, Linet/ipaddr/k;->Q()I

    move-result p1

    ushr-int/2addr p1, v0

    sub-int/2addr p2, p1

    add-int/lit8 p2, p2, 0x1

    return p2

    :cond_0
    invoke-virtual {p0, p3}, Linet/ipaddr/ipv6/Q;->C3(I)Linet/ipaddr/ipv6/V;

    move-result-object p1

    invoke-virtual {p1}, Linet/ipaddr/k;->C2()I

    move-result p1

    return p1
.end method

.method public static synthetic T2(Linet/ipaddr/ipv6/Q;IZZLinet/ipaddr/ipv6/b;)Ljava/util/Iterator;
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Linet/ipaddr/ipv6/Q;->i4(IZZLinet/ipaddr/ipv6/b;)Ljava/util/Iterator;

    move-result-object p0

    return-object p0
.end method

.method private synthetic T3()[Linet/ipaddr/ipv6/V;
    .locals 1

    invoke-virtual {p0}, Linet/ipaddr/ipv6/Q;->y3()Linet/ipaddr/ipv6/Q;

    move-result-object v0

    invoke-virtual {v0}, Linet/ipaddr/ipv6/Q;->F3()[Linet/ipaddr/ipv6/V;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic U2(Linet/ipaddr/ipv6/Q;)[Linet/ipaddr/ipv6/V;
    .locals 0

    invoke-direct {p0}, Linet/ipaddr/ipv6/Q;->W3()[Linet/ipaddr/ipv6/V;

    move-result-object p0

    return-object p0
.end method

.method private synthetic U3(ZI)Ljava/util/Iterator;
    .locals 0

    invoke-virtual {p0, p2}, Linet/ipaddr/ipv6/Q;->C3(I)Linet/ipaddr/ipv6/V;

    move-result-object p2

    xor-int/lit8 p1, p1, 0x1

    invoke-virtual {p2, p1}, Linet/ipaddr/ipv6/V;->h3(Z)Ljava/util/Iterator;

    move-result-object p1

    return-object p1
.end method

.method public static synthetic V2(IILinet/ipaddr/ipv6/Q;)Ljava/math/BigInteger;
    .locals 0

    invoke-static {p0, p1, p2}, Linet/ipaddr/ipv6/Q;->b4(IILinet/ipaddr/ipv6/Q;)Ljava/math/BigInteger;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic V3(Linet/ipaddr/ipv6/Q;I)I
    .locals 0

    invoke-virtual {p0, p1}, Linet/ipaddr/ipv6/Q;->C3(I)Linet/ipaddr/ipv6/V;

    move-result-object p0

    invoke-virtual {p0}, Linet/ipaddr/k;->Q()I

    move-result p0

    return p0
.end method

.method public static synthetic W2(ZZLinet/ipaddr/ipv6/Q;)Ljava/util/Iterator;
    .locals 0

    invoke-static {p0, p1, p2}, Linet/ipaddr/ipv6/Q;->c4(ZZLinet/ipaddr/ipv6/Q;)Ljava/util/Iterator;

    move-result-object p0

    return-object p0
.end method

.method private synthetic W3()[Linet/ipaddr/ipv6/V;
    .locals 1

    invoke-virtual {p0}, Linet/ipaddr/ipv6/Q;->y3()Linet/ipaddr/ipv6/Q;

    move-result-object v0

    invoke-virtual {v0}, Linet/ipaddr/ipv6/Q;->E3()[Linet/ipaddr/ipv6/V;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic X2(Linet/ipaddr/ipv6/b;)Z
    .locals 0

    invoke-static {p0}, Linet/ipaddr/ipv6/Q;->p4(Linet/ipaddr/ipv6/b;)Z

    move-result p0

    return p0
.end method

.method private synthetic X3(ZI)Ljava/util/Iterator;
    .locals 0

    invoke-virtual {p0, p2}, Linet/ipaddr/ipv6/Q;->C3(I)Linet/ipaddr/ipv6/V;

    move-result-object p2

    xor-int/lit8 p1, p1, 0x1

    invoke-virtual {p2, p1}, Linet/ipaddr/ipv6/V;->h3(Z)Ljava/util/Iterator;

    move-result-object p1

    return-object p1
.end method

.method public static synthetic Y2(Linet/ipaddr/ipv6/Q;III)I
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Linet/ipaddr/ipv6/Q;->S3(III)I

    move-result p0

    return p0
.end method

.method private synthetic Y3(I[Linet/ipaddr/ipv6/V;)Z
    .locals 0

    invoke-virtual {p0, p2, p1}, Linet/ipaddr/ipv6/Q;->L3([Linet/ipaddr/ipv6/V;I)Z

    move-result p1

    return p1
.end method

.method public static synthetic Z2(ZZLinet/ipaddr/ipv6/b;)Ljava/util/Iterator;
    .locals 0

    invoke-static {p0, p1, p2}, Linet/ipaddr/ipv6/Q;->l4(ZZLinet/ipaddr/ipv6/b;)Ljava/util/Iterator;

    move-result-object p0

    return-object p0
.end method

.method private synthetic Z3(IZZLinet/ipaddr/ipv6/Q;)Ljava/util/Iterator;
    .locals 0

    new-instance p2, Linet/ipaddr/ipv6/I;

    invoke-direct {p2, p0, p1}, Linet/ipaddr/ipv6/I;-><init>(Linet/ipaddr/ipv6/Q;I)V

    invoke-direct {p4, p2}, Linet/ipaddr/ipv6/Q;->N3(Ljava/util/function/Predicate;)Ljava/util/Iterator;

    move-result-object p1

    return-object p1
.end method

.method public static synthetic a3(Linet/ipaddr/ipv6/Q;I)I
    .locals 0

    invoke-static {p0, p1}, Linet/ipaddr/ipv6/Q;->V3(Linet/ipaddr/ipv6/Q;I)I

    move-result p0

    return p0
.end method

.method private static synthetic a4(IILinet/ipaddr/ipv6/Q;)J
    .locals 2

    invoke-static {p2, p0}, Lbg/d;->y1(LZf/c;I)J

    move-result-wide v0

    invoke-virtual {p2, p1, p0}, Linet/ipaddr/j;->x2(II)J

    move-result-wide p0

    sub-long/2addr v0, p0

    return-wide v0
.end method

.method public static synthetic b3(Linet/ipaddr/ipv6/Q;ZI)Linet/ipaddr/ipv6/V;
    .locals 0

    invoke-direct {p0, p1, p2}, Linet/ipaddr/ipv6/Q;->R3(ZI)Linet/ipaddr/ipv6/V;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic b4(IILinet/ipaddr/ipv6/Q;)Ljava/math/BigInteger;
    .locals 1

    invoke-virtual {p2}, Lag/d;->getCount()Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {p2, p0, p1}, Linet/ipaddr/ipv6/Q;->J3(II)Ljava/math/BigInteger;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/math/BigInteger;->subtract(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c3(Linet/ipaddr/ipv6/e$a;Ljava/lang/Integer;[Linet/ipaddr/ipv6/V;)Linet/ipaddr/ipv6/b;
    .locals 0

    invoke-static {p0, p1, p2}, Linet/ipaddr/ipv6/Q;->n4(Linet/ipaddr/ipv6/e$a;Ljava/lang/Integer;[Linet/ipaddr/ipv6/V;)Linet/ipaddr/ipv6/b;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic c4(ZZLinet/ipaddr/ipv6/Q;)Ljava/util/Iterator;
    .locals 0

    invoke-virtual {p2}, Linet/ipaddr/ipv6/Q;->iterator()Ljava/util/Iterator;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d3(Linet/ipaddr/ipv6/Q;)[Linet/ipaddr/ipv6/V;
    .locals 0

    invoke-direct {p0}, Linet/ipaddr/ipv6/Q;->T3()[Linet/ipaddr/ipv6/V;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic d4(ILinet/ipaddr/ipv6/Q;)J
    .locals 0

    invoke-static {p1, p0}, Lbg/d;->y1(LZf/c;I)J

    move-result-wide p0

    return-wide p0
.end method

.method public static synthetic e3(Linet/ipaddr/ipv6/Q;I[Linet/ipaddr/ipv6/V;)Z
    .locals 0

    invoke-direct {p0, p1, p2}, Linet/ipaddr/ipv6/Q;->h4(I[Linet/ipaddr/ipv6/V;)Z

    move-result p0

    return p0
.end method

.method private static synthetic e4(Linet/ipaddr/ipv6/e$a;Ljava/lang/Integer;[Linet/ipaddr/ipv6/V;)Linet/ipaddr/ipv6/Q;
    .locals 0

    invoke-static {p2, p0, p1}, Lbg/d;->k1([LZf/d;Lbg/a;Ljava/lang/Integer;)LZf/c;

    move-result-object p0

    check-cast p0, Linet/ipaddr/ipv6/Q;

    return-object p0
.end method

.method public static synthetic f3(Linet/ipaddr/ipv6/Q;ZI)Ljava/util/Iterator;
    .locals 0

    invoke-direct {p0, p1, p2}, Linet/ipaddr/ipv6/Q;->X3(ZI)Ljava/util/Iterator;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic f4(Linet/ipaddr/ipv6/e$a;Ljava/lang/Integer;IILag/d$e;)Z
    .locals 7

    new-instance v1, Linet/ipaddr/ipv6/F;

    invoke-direct {v1, p0, p1}, Linet/ipaddr/ipv6/F;-><init>(Linet/ipaddr/ipv6/e$a;Ljava/lang/Integer;)V

    invoke-interface {p4}, Lag/d$e;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Linet/ipaddr/ipv6/Q;

    invoke-virtual {v0}, Linet/ipaddr/ipv6/Q;->F3()[Linet/ipaddr/ipv6/V;

    move-result-object v3

    move-object v0, p4

    move-object v2, p0

    move v4, p2

    move v5, p3

    move-object v6, p1

    invoke-static/range {v0 .. v6}, Lbg/d;->E1(Lag/d$e;Ljava/util/function/Function;Linet/ipaddr/c$a;[LZf/d;IILjava/lang/Integer;)Z

    move-result p0

    return p0
.end method

.method public static synthetic g3(Linet/ipaddr/ipv6/e$a;Ljava/lang/Integer;IILag/d$e;)Z
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Linet/ipaddr/ipv6/Q;->f4(Linet/ipaddr/ipv6/e$a;Ljava/lang/Integer;IILag/d$e;)Z

    move-result p0

    return p0
.end method

.method private static synthetic g4(Linet/ipaddr/ipv6/Q;)Z
    .locals 1

    invoke-virtual {p0}, Lag/d;->getCount()Ljava/math/BigInteger;

    move-result-object p0

    sget-object v0, Lag/d;->i:Ljava/math/BigInteger;

    invoke-virtual {p0, v0}, Ljava/math/BigInteger;->compareTo(Ljava/math/BigInteger;)I

    move-result p0

    if-gtz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static synthetic h3(ILinet/ipaddr/ipv6/b;)J
    .locals 0

    invoke-static {p0, p1}, Linet/ipaddr/ipv6/Q;->m4(ILinet/ipaddr/ipv6/b;)J

    move-result-wide p0

    return-wide p0
.end method

.method private synthetic h4(I[Linet/ipaddr/ipv6/V;)Z
    .locals 0

    invoke-virtual {p0, p2, p1}, Linet/ipaddr/ipv6/Q;->L3([Linet/ipaddr/ipv6/V;I)Z

    move-result p1

    return p1
.end method

.method public static synthetic i3(Linet/ipaddr/ipv6/Q;I[Linet/ipaddr/ipv6/V;)Z
    .locals 0

    invoke-direct {p0, p1, p2}, Linet/ipaddr/ipv6/Q;->Y3(I[Linet/ipaddr/ipv6/V;)Z

    move-result p0

    return p0
.end method

.method private synthetic i4(IZZLinet/ipaddr/ipv6/b;)Ljava/util/Iterator;
    .locals 1

    invoke-virtual {p4}, Linet/ipaddr/ipv6/b;->I1()Linet/ipaddr/ipv6/Q;

    move-result-object p2

    invoke-virtual {p4}, Linet/ipaddr/ipv6/b;->A1()Linet/ipaddr/ipv6/e$a;

    move-result-object p3

    new-instance v0, Linet/ipaddr/ipv6/H;

    invoke-direct {v0, p0, p1}, Linet/ipaddr/ipv6/H;-><init>(Linet/ipaddr/ipv6/Q;I)V

    invoke-virtual {p2, p4, p3, v0}, Linet/ipaddr/ipv6/Q;->M3(Linet/ipaddr/ipv6/b;Lbg/a;Ljava/util/function/Predicate;)Ljava/util/Iterator;

    move-result-object p1

    return-object p1
.end method

.method static synthetic j3(Linet/ipaddr/ipv6/Q;Linet/ipaddr/ipv6/Q$c;Z)[I
    .locals 0

    invoke-direct {p0, p1, p2}, Linet/ipaddr/ipv6/Q;->t3(Linet/ipaddr/ipv6/Q$c;Z)[I

    move-result-object p0

    return-object p0
.end method

.method private static synthetic j4(IILinet/ipaddr/ipv6/b;)J
    .locals 2

    invoke-virtual {p2}, Linet/ipaddr/ipv6/b;->I1()Linet/ipaddr/ipv6/Q;

    move-result-object v0

    invoke-static {v0, p0}, Lbg/d;->y1(LZf/c;I)J

    move-result-wide v0

    invoke-virtual {p2}, Linet/ipaddr/ipv6/b;->I1()Linet/ipaddr/ipv6/Q;

    move-result-object p2

    invoke-virtual {p2, p1, p0}, Linet/ipaddr/j;->x2(II)J

    move-result-wide p0

    sub-long/2addr v0, p0

    return-wide v0
.end method

.method static synthetic k3(III)I
    .locals 0

    invoke-static {p0, p1, p2}, Linet/ipaddr/j;->b2(III)I

    move-result p0

    return p0
.end method

.method private static synthetic k4(IILinet/ipaddr/ipv6/b;)Ljava/math/BigInteger;
    .locals 1

    invoke-virtual {p2}, Linet/ipaddr/ipv6/b;->I1()Linet/ipaddr/ipv6/Q;

    move-result-object v0

    invoke-virtual {v0}, Lag/d;->getCount()Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {p2}, Linet/ipaddr/ipv6/b;->I1()Linet/ipaddr/ipv6/Q;

    move-result-object p2

    invoke-virtual {p2, p0, p1}, Linet/ipaddr/ipv6/Q;->J3(II)Ljava/math/BigInteger;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/math/BigInteger;->subtract(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object p0

    return-object p0
.end method

.method static synthetic l3(Linet/ipaddr/j$c;)Lag/d$c;
    .locals 0

    invoke-static {p0}, Linet/ipaddr/j;->B2(Linet/ipaddr/j$c;)Lag/d$c;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic l4(ZZLinet/ipaddr/ipv6/b;)Ljava/util/Iterator;
    .locals 0

    invoke-virtual {p2}, Linet/ipaddr/ipv6/b;->iterator()Ljava/util/Iterator;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic m4(ILinet/ipaddr/ipv6/b;)J
    .locals 0

    invoke-virtual {p1}, Linet/ipaddr/ipv6/b;->I1()Linet/ipaddr/ipv6/Q;

    move-result-object p1

    invoke-static {p1, p0}, Lbg/d;->y1(LZf/c;I)J

    move-result-wide p0

    return-wide p0
.end method

.method private static synthetic n4(Linet/ipaddr/ipv6/e$a;Ljava/lang/Integer;[Linet/ipaddr/ipv6/V;)Linet/ipaddr/ipv6/b;
    .locals 0

    invoke-static {p2, p0, p1}, Lbg/d;->j1([LZf/d;Lbg/a;Ljava/lang/Integer;)Linet/ipaddr/a;

    move-result-object p0

    check-cast p0, Linet/ipaddr/ipv6/b;

    return-object p0
.end method

.method public static o3(Linet/ipaddr/ipv6/e$a;[Linet/ipaddr/ipv6/V;Linet/ipaddr/ipv4/b;)Linet/ipaddr/ipv6/Q;
    .locals 7

    invoke-virtual {p2}, Linet/ipaddr/ipv4/b;->F1()Linet/ipaddr/ipv4/I;

    move-result-object p2

    array-length v0, p1

    const/4 v1, 0x2

    add-int/2addr v0, v1

    invoke-virtual {p0, v0}, Linet/ipaddr/ipv6/e$a;->h1(I)[Linet/ipaddr/ipv6/V;

    move-result-object v0

    const/4 v2, 0x0

    aget-object v3, p1, v2

    aput-object v3, v0, v2

    const/4 v3, 0x1

    aget-object v4, p1, v3

    aput-object v4, v0, v3

    aget-object v4, p1, v1

    aput-object v4, v0, v1

    const/4 v4, 0x3

    aget-object v5, p1, v4

    aput-object v5, v0, v4

    const/4 v5, 0x4

    aget-object v6, p1, v5

    aput-object v6, v0, v5

    const/4 v5, 0x5

    aget-object p1, p1, v5

    aput-object p1, v0, v5

    invoke-virtual {p2, v2}, Linet/ipaddr/ipv4/I;->r3(I)Linet/ipaddr/ipv4/M;

    move-result-object p1

    invoke-virtual {p2, v3}, Linet/ipaddr/ipv4/I;->r3(I)Linet/ipaddr/ipv4/M;

    move-result-object v2

    invoke-virtual {p1, p0, v2}, Linet/ipaddr/ipv4/M;->h3(Linet/ipaddr/ipv6/e$a;Linet/ipaddr/ipv4/M;)Linet/ipaddr/ipv6/V;

    move-result-object p1

    const/4 v2, 0x6

    aput-object p1, v0, v2

    invoke-virtual {p2, v1}, Linet/ipaddr/ipv4/I;->r3(I)Linet/ipaddr/ipv4/M;

    move-result-object p1

    invoke-virtual {p2, v4}, Linet/ipaddr/ipv4/I;->r3(I)Linet/ipaddr/ipv4/M;

    move-result-object v1

    invoke-virtual {p1, p0, v1}, Linet/ipaddr/ipv4/M;->h3(Linet/ipaddr/ipv6/e$a;Linet/ipaddr/ipv4/M;)Linet/ipaddr/ipv6/V;

    move-result-object p1

    const/4 v1, 0x7

    aput-object p1, v0, v1

    invoke-virtual {p0, v0}, Linet/ipaddr/ipv6/e$a;->c1([Linet/ipaddr/ipv6/V;)Linet/ipaddr/ipv6/Q;

    move-result-object p0

    iput-object p2, p0, Linet/ipaddr/ipv6/Q;->t:Linet/ipaddr/ipv4/I;

    return-object p0
.end method

.method private static synthetic o4(Linet/ipaddr/ipv6/e$a;Ljava/lang/Integer;IILag/d$e;)Z
    .locals 7

    new-instance v1, Linet/ipaddr/ipv6/C;

    invoke-direct {v1, p0, p1}, Linet/ipaddr/ipv6/C;-><init>(Linet/ipaddr/ipv6/e$a;Ljava/lang/Integer;)V

    invoke-interface {p4}, Lag/d$e;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Linet/ipaddr/ipv6/b;

    invoke-virtual {v0}, Linet/ipaddr/ipv6/b;->I1()Linet/ipaddr/ipv6/Q;

    move-result-object v0

    invoke-virtual {v0}, Linet/ipaddr/ipv6/Q;->F3()[Linet/ipaddr/ipv6/V;

    move-result-object v3

    move-object v0, p4

    move-object v2, p0

    move v4, p2

    move v5, p3

    move-object v6, p1

    invoke-static/range {v0 .. v6}, Lbg/d;->E1(Lag/d$e;Ljava/util/function/Function;Linet/ipaddr/c$a;[LZf/d;IILjava/lang/Integer;)Z

    move-result p0

    return p0
.end method

.method private static synthetic p4(Linet/ipaddr/ipv6/b;)Z
    .locals 1

    invoke-virtual {p0}, Linet/ipaddr/a;->getCount()Ljava/math/BigInteger;

    move-result-object p0

    sget-object v0, Lag/d;->i:Ljava/math/BigInteger;

    invoke-virtual {p0, v0}, Ljava/math/BigInteger;->compareTo(Ljava/math/BigInteger;)I

    move-result p0

    if-gtz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private q3()Ljava/util/function/Predicate;
    .locals 2

    invoke-virtual {p0}, Lag/d;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lbg/f;->F0()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    new-instance v1, Linet/ipaddr/ipv6/G;

    invoke-direct {v1, p0, v0}, Linet/ipaddr/ipv6/G;-><init>(Linet/ipaddr/ipv6/Q;I)V

    return-object v1

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method private synthetic q4(Ljava/lang/Integer;I)Linet/ipaddr/ipv6/V;
    .locals 1

    invoke-virtual {p0, p2}, Linet/ipaddr/ipv6/Q;->C3(I)Linet/ipaddr/ipv6/V;

    move-result-object p2

    const/4 v0, 0x1

    invoke-virtual {p2, p1, v0}, Linet/ipaddr/ipv6/V;->m3(Ljava/lang/Integer;Z)Linet/ipaddr/ipv6/V;

    move-result-object p1

    return-object p1
.end method

.method private r3()Linet/ipaddr/ipv6/e$a;
    .locals 1

    iget v0, p0, Linet/ipaddr/ipv6/Q;->v:I

    invoke-virtual {p0, v0}, Linet/ipaddr/ipv6/Q;->s3(I)Linet/ipaddr/ipv6/e$a;

    move-result-object v0

    return-object v0
.end method

.method protected static s(I)Ljava/lang/Integer;
    .locals 0

    invoke-static {p0}, Linet/ipaddr/j;->s(I)Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method

.method private t3(Linet/ipaddr/ipv6/Q$c;Z)[I
    .locals 13

    if-eqz p1, :cond_b

    iget-object v0, p1, Linet/ipaddr/ipv6/Q$c;->b:Linet/ipaddr/ipv6/Q$c$a;

    invoke-virtual {v0}, Linet/ipaddr/ipv6/Q$c$a;->compressHost()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Linet/ipaddr/ipv6/Q;->J1()Lbg/f$c;

    move-result-object v1

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Linet/ipaddr/ipv6/Q;->K1()Lbg/f$c;

    move-result-object v1

    :goto_0
    invoke-virtual {p0}, Linet/ipaddr/j;->Z()I

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz p2, :cond_1

    iget-object v5, p1, Linet/ipaddr/ipv6/Q$c;->c:Linet/ipaddr/ipv6/Q$c$b;

    invoke-virtual {v5, p0}, Linet/ipaddr/ipv6/Q$c$b;->compressMixed(Linet/ipaddr/ipv6/Q;)Z

    move-result v5

    if-eqz v5, :cond_1

    move v5, v4

    goto :goto_1

    :cond_1
    move v5, v3

    :goto_1
    sget-object v6, Linet/ipaddr/ipv6/Q$c$a;->HOST_PREFERRED:Linet/ipaddr/ipv6/Q$c$a;

    if-ne v0, v6, :cond_2

    move v6, v4

    goto :goto_2

    :cond_2
    move v6, v3

    :goto_2
    if-eqz p2, :cond_3

    sget-object v7, Linet/ipaddr/ipv6/Q$c$a;->MIXED_PREFERRED:Linet/ipaddr/ipv6/Q$c$a;

    if-ne v0, v7, :cond_3

    move v0, v4

    goto :goto_3

    :cond_3
    move v0, v3

    :goto_3
    invoke-virtual {v1}, Lbg/f$c;->b()I

    move-result v7

    sub-int/2addr v7, v4

    const/4 v8, -0x1

    :goto_4
    if-ltz v7, :cond_a

    invoke-virtual {v1, v7}, Lbg/f$c;->a(I)Lbg/f$a;

    move-result-object v9

    iget v10, v9, Lbg/f$a;->a:I

    iget v9, v9, Lbg/f$a;->b:I

    if-eqz p2, :cond_5

    iget v11, p0, Linet/ipaddr/ipv6/Q;->v:I

    rsub-int/lit8 v11, v11, 0x6

    if-eqz v5, :cond_4

    if-gt v10, v11, :cond_4

    add-int v12, v10, v9

    if-ge v12, v2, :cond_5

    :cond_4
    sub-int/2addr v11, v10

    invoke-static {v9, v11}, Ljava/lang/Math;->min(II)I

    move-result v9

    :cond_5
    if-lez v9, :cond_7

    if-lt v9, v3, :cond_7

    iget-boolean v11, p1, Linet/ipaddr/ipv6/Q$c;->a:Z

    if-nez v11, :cond_6

    if-le v9, v4, :cond_7

    :cond_6
    move v3, v9

    move v8, v10

    :cond_7
    if-eqz v6, :cond_8

    invoke-virtual {p0}, Lag/d;->i()Z

    move-result v11

    if-eqz v11, :cond_8

    add-int v11, v10, v9

    invoke-virtual {p0}, Linet/ipaddr/ipv6/Q;->m0()I

    move-result v12

    mul-int/2addr v11, v12

    invoke-virtual {p0}, Lbg/f;->F0()Ljava/lang/Integer;

    move-result-object v12

    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    move-result v12

    if-le v11, v12, :cond_8

    goto :goto_5

    :cond_8
    if-eqz v0, :cond_9

    add-int/2addr v10, v9

    if-lt v10, v2, :cond_9

    goto :goto_5

    :cond_9
    add-int/lit8 v7, v7, -0x1

    goto :goto_4

    :cond_a
    :goto_5
    if-ltz v8, :cond_b

    filled-new-array {v8, v3}, [I

    move-result-object p1

    return-object p1

    :cond_b
    const/4 p1, 0x0

    return-object p1
.end method

.method private t4(Ljava/util/function/Predicate;)Ljava/util/Iterator;
    .locals 5

    invoke-virtual {p0}, Linet/ipaddr/ipv6/Q;->B3()Linet/ipaddr/ipv6/e;

    move-result-object v0

    invoke-virtual {v0}, Linet/ipaddr/ipv6/e;->d()Linet/ipaddr/c$b;

    move-result-object v0

    invoke-virtual {v0}, Linet/ipaddr/c$b;->allPrefixedAddressesAreSubnets()Z

    move-result v0

    invoke-virtual {p0}, Linet/ipaddr/j;->Z()I

    move-result v1

    invoke-direct {p0}, Linet/ipaddr/ipv6/Q;->D3()Linet/ipaddr/c$a;

    move-result-object v2

    invoke-virtual {p0}, Lag/d;->A0()Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x0

    goto :goto_0

    :cond_0
    new-instance v3, Linet/ipaddr/ipv6/u;

    invoke-direct {v3, p0}, Linet/ipaddr/ipv6/u;-><init>(Linet/ipaddr/ipv6/Q;)V

    :goto_0
    new-instance v4, Linet/ipaddr/ipv6/v;

    invoke-direct {v4, p0, v0}, Linet/ipaddr/ipv6/v;-><init>(Linet/ipaddr/ipv6/Q;Z)V

    invoke-static {v1, v2, v3, v4, p1}, Lbg/d;->B1(ILinet/ipaddr/c$a;Ljava/util/function/Supplier;Ljava/util/function/IntFunction;Ljava/util/function/Predicate;)Ljava/util/Iterator;

    move-result-object p1

    return-object p1
.end method

.method private static u3(Ljava/util/function/IntUnaryOperator;I)Ljava/math/BigInteger;
    .locals 3

    if-ltz p1, :cond_0

    const/4 v0, 0x2

    const-wide v1, 0x7fffffffffffL

    invoke-static {p0, p1, v0, v1, v2}, Lbg/d;->i1(Ljava/util/function/IntUnaryOperator;IIJ)Ljava/math/BigInteger;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p0
.end method

.method private y4(Linet/ipaddr/ipv6/Q$j;Ljava/lang/CharSequence;)Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Linet/ipaddr/ipv6/Q;->A3()Linet/ipaddr/ipv6/Q$i;

    move-result-object v0

    invoke-virtual {p1, v0, p2}, Linet/ipaddr/ipv6/Q$j;->l(Linet/ipaddr/ipv6/Q$i;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public A3()Linet/ipaddr/ipv6/Q$i;
    .locals 4

    iget-object v0, p0, Linet/ipaddr/ipv6/Q;->u:Linet/ipaddr/ipv6/Q$i;

    if-nez v0, :cond_1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Linet/ipaddr/ipv6/Q;->u:Linet/ipaddr/ipv6/Q$i;

    if-nez v0, :cond_0

    new-instance v0, Linet/ipaddr/ipv6/Q$i;

    invoke-virtual {p0}, Linet/ipaddr/ipv6/Q;->n3()Linet/ipaddr/ipv6/Q;

    move-result-object v1

    invoke-virtual {p0}, Linet/ipaddr/ipv6/Q;->w3()Linet/ipaddr/ipv4/I;

    move-result-object v2

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Linet/ipaddr/ipv6/Q$i;-><init>(Linet/ipaddr/ipv6/Q;Linet/ipaddr/ipv4/I;Linet/ipaddr/ipv6/Q$a;)V

    iput-object v0, p0, Linet/ipaddr/ipv6/Q;->u:Linet/ipaddr/ipv6/Q$i;

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
    iget-object v0, p0, Linet/ipaddr/ipv6/Q;->u:Linet/ipaddr/ipv6/Q$i;

    return-object v0
.end method

.method public A4(Linet/ipaddr/ipv6/Q$g;Ljava/lang/CharSequence;)Ljava/lang/String;
    .locals 3

    invoke-virtual {p1}, Linet/ipaddr/ipv6/Q$g;->c()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {p1}, Lag/d;->K0(Lag/d$f;)Ldg/c;

    move-result-object v0

    check-cast v0, Ldg/e;

    if-nez v0, :cond_1

    invoke-static {p1, p0}, Linet/ipaddr/ipv6/Q$g;->a(Linet/ipaddr/ipv6/Q$g;Linet/ipaddr/ipv6/Q;)Linet/ipaddr/ipv6/Q$h;

    move-result-object v0

    invoke-virtual {p1}, Linet/ipaddr/ipv6/Q$g;->d()Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v1, Linet/ipaddr/ipv6/Q$j;

    iget-object v2, p1, Linet/ipaddr/ipv6/Q$g;->n:Linet/ipaddr/j$c;

    invoke-direct {v1, v0, v2}, Linet/ipaddr/ipv6/Q$j;-><init>(Linet/ipaddr/ipv6/Q$h;Linet/ipaddr/j$c;)V

    invoke-static {p1, v1}, Lag/d;->f1(Lag/d$f;Ldg/c;)V

    invoke-direct {p0, v1, p2}, Linet/ipaddr/ipv6/Q;->y4(Linet/ipaddr/ipv6/Q$j;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-static {p1, v0}, Lag/d;->f1(Lag/d$f;Ldg/c;)V

    goto :goto_0

    :cond_1
    instance-of p1, v0, Linet/ipaddr/ipv6/Q$j;

    if-eqz p1, :cond_2

    check-cast v0, Linet/ipaddr/ipv6/Q$j;

    invoke-direct {p0, v0, p2}, Linet/ipaddr/ipv6/Q;->y4(Linet/ipaddr/ipv6/Q$j;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_2
    check-cast v0, Linet/ipaddr/ipv6/Q$h;

    goto :goto_0

    :cond_3
    invoke-static {p1, p0}, Linet/ipaddr/ipv6/Q$g;->a(Linet/ipaddr/ipv6/Q$g;Linet/ipaddr/ipv6/Q;)Linet/ipaddr/ipv6/Q$h;

    move-result-object v0

    invoke-virtual {p1}, Linet/ipaddr/ipv6/Q$g;->d()Z

    move-result v1

    if-eqz v1, :cond_4

    iget v1, v0, Linet/ipaddr/ipv6/Q$h;->q:I

    iget v2, p0, Linet/ipaddr/ipv6/Q;->v:I

    rsub-int/lit8 v2, v2, 0x6

    if-gt v1, v2, :cond_4

    new-instance v1, Linet/ipaddr/ipv6/Q$j;

    iget-object p1, p1, Linet/ipaddr/ipv6/Q$g;->n:Linet/ipaddr/j$c;

    invoke-direct {v1, v0, p1}, Linet/ipaddr/ipv6/Q$j;-><init>(Linet/ipaddr/ipv6/Q$h;Linet/ipaddr/j$c;)V

    invoke-direct {p0, v1, p2}, Linet/ipaddr/ipv6/Q;->y4(Linet/ipaddr/ipv6/Q$j;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_4
    :goto_0
    invoke-virtual {v0, p0, p2}, Lag/d$b;->R(Lcg/b;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public B3()Linet/ipaddr/ipv6/e;
    .locals 1

    invoke-static {}, Linet/ipaddr/a;->s()Linet/ipaddr/ipv6/e;

    move-result-object v0

    return-object v0
.end method

.method public B4()Linet/ipaddr/ipv6/Q;
    .locals 2

    invoke-virtual {p0}, Lbg/f;->F0()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Linet/ipaddr/ipv6/Q;->B3()Linet/ipaddr/ipv6/e;

    move-result-object v1

    invoke-virtual {v1}, Linet/ipaddr/ipv6/e;->d()Linet/ipaddr/c$b;

    move-result-object v1

    invoke-virtual {v1}, Linet/ipaddr/c$b;->allPrefixedAddressesAreSubnets()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p0, v0}, Linet/ipaddr/ipv6/Q;->C4(I)Linet/ipaddr/ipv6/Q;

    move-result-object v0

    return-object v0

    :cond_1
    :goto_0
    return-object p0
.end method

.method public C3(I)Linet/ipaddr/ipv6/V;
    .locals 0

    invoke-super {p0, p1}, Linet/ipaddr/j;->q(I)Linet/ipaddr/k;

    move-result-object p1

    check-cast p1, Linet/ipaddr/ipv6/V;

    return-object p1
.end method

.method public C4(I)Linet/ipaddr/ipv6/Q;
    .locals 2

    invoke-direct {p0}, Linet/ipaddr/ipv6/Q;->r3()Linet/ipaddr/ipv6/e$a;

    move-result-object v0

    new-instance v1, Linet/ipaddr/ipv6/E;

    invoke-direct {v1, p0}, Linet/ipaddr/ipv6/E;-><init>(Linet/ipaddr/ipv6/Q;)V

    invoke-static {p0, p1, v0, v1}, Linet/ipaddr/j;->F2(Linet/ipaddr/j;ILinet/ipaddr/i$a;Linet/ipaddr/j$e;)Linet/ipaddr/j;

    move-result-object p1

    check-cast p1, Linet/ipaddr/ipv6/Q;

    return-object p1
.end method

.method public D4()Linet/ipaddr/ipv6/Q;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Linet/ipaddr/ipv6/Q;->s4(Z)Linet/ipaddr/ipv6/Q;

    move-result-object v0

    return-object v0
.end method

.method public E3()[Linet/ipaddr/ipv6/V;
    .locals 1

    invoke-virtual {p0}, Lag/d;->X0()[Lag/b;

    move-result-object v0

    invoke-virtual {v0}, [Lag/b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Linet/ipaddr/ipv6/V;

    return-object v0
.end method

.method protected F3()[Linet/ipaddr/ipv6/V;
    .locals 1

    invoke-super {p0}, Lag/d;->X0()[Lag/b;

    move-result-object v0

    check-cast v0, [Linet/ipaddr/ipv6/V;

    return-object v0
.end method

.method public bridge synthetic G1(I)Lbg/e;
    .locals 0

    invoke-virtual {p0, p1}, Linet/ipaddr/ipv6/Q;->v3(I)Linet/ipaddr/ipv6/V;

    move-result-object p1

    return-object p1
.end method

.method protected G3()Linet/ipaddr/ipv6/Q;
    .locals 1

    invoke-static {p0}, Lbg/d;->t1(LZf/e;)LZf/e;

    move-result-object v0

    check-cast v0, Linet/ipaddr/ipv6/Q;

    return-object v0
.end method

.method protected H3()Linet/ipaddr/ipv6/Q$f;
    .locals 1

    iget-object v0, p0, Linet/ipaddr/ipv6/Q;->r:Linet/ipaddr/ipv6/Q$f;

    return-object v0
.end method

.method public I3()Linet/ipaddr/ipv6/Q;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0, v0}, Linet/ipaddr/ipv6/Q;->z3(ZZ)Linet/ipaddr/ipv6/Q;

    move-result-object v0

    return-object v0
.end method

.method public J1()Lbg/f$c;
    .locals 1

    iget-object v0, p0, Linet/ipaddr/ipv6/Q;->x:Lbg/f$c;

    if-nez v0, :cond_0

    invoke-super {p0}, Lbg/f;->J1()Lbg/f$c;

    move-result-object v0

    iput-object v0, p0, Linet/ipaddr/ipv6/Q;->x:Lbg/f$c;

    :cond_0
    iget-object v0, p0, Linet/ipaddr/ipv6/Q;->x:Lbg/f$c;

    return-object v0
.end method

.method protected J3(II)Ljava/math/BigInteger;
    .locals 1

    invoke-virtual {p0, p1}, Linet/ipaddr/j;->i2(I)Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-virtual {p0}, Lag/d;->A0()Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-virtual {p0}, Linet/ipaddr/ipv6/Q;->e0()I

    move-result p2

    invoke-virtual {p0}, Linet/ipaddr/ipv6/Q;->m0()I

    move-result v0

    invoke-static {p1, p2, v0}, Linet/ipaddr/j;->p1(III)I

    move-result p2

    new-instance v0, Linet/ipaddr/ipv6/D;

    invoke-direct {v0, p0, p2, p1}, Linet/ipaddr/ipv6/D;-><init>(Linet/ipaddr/ipv6/Q;II)V

    add-int/lit8 p2, p2, 0x1

    invoke-static {v0, p2}, Linet/ipaddr/ipv6/Q;->u3(Ljava/util/function/IntUnaryOperator;I)Ljava/math/BigInteger;

    move-result-object p1

    return-object p1

    :cond_0
    sget-object p1, Ljava/math/BigInteger;->ONE:Ljava/math/BigInteger;

    return-object p1

    :cond_1
    sget-object p1, Ljava/math/BigInteger;->ZERO:Ljava/math/BigInteger;

    return-object p1
.end method

.method public K1()Lbg/f$c;
    .locals 1

    iget-object v0, p0, Linet/ipaddr/ipv6/Q;->w:Lbg/f$c;

    if-nez v0, :cond_0

    invoke-super {p0}, Lbg/f;->K1()Lbg/f$c;

    move-result-object v0

    iput-object v0, p0, Linet/ipaddr/ipv6/Q;->w:Lbg/f$c;

    :cond_0
    iget-object v0, p0, Linet/ipaddr/ipv6/Q;->w:Lbg/f$c;

    return-object v0
.end method

.method protected K3()Z
    .locals 1

    iget-object v0, p0, Linet/ipaddr/ipv6/Q;->r:Linet/ipaddr/ipv6/Q$f;

    if-nez v0, :cond_1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Linet/ipaddr/ipv6/Q;->r:Linet/ipaddr/ipv6/Q$f;

    if-nez v0, :cond_0

    new-instance v0, Linet/ipaddr/ipv6/Q$f;

    invoke-direct {v0}, Linet/ipaddr/ipv6/Q$f;-><init>()V

    iput-object v0, p0, Linet/ipaddr/ipv6/Q;->r:Linet/ipaddr/ipv6/Q$f;

    monitor-exit p0

    const/4 v0, 0x1

    return v0

    :catchall_0
    move-exception v0

    goto :goto_0

    :cond_0
    monitor-exit p0

    goto :goto_1

    :goto_0
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_1
    :goto_1
    const/4 v0, 0x0

    return v0
.end method

.method protected L3([Linet/ipaddr/ipv6/V;I)Z
    .locals 0

    invoke-super {p0, p1, p2}, Linet/ipaddr/j;->o2([Linet/ipaddr/k;I)Z

    move-result p1

    return p1
.end method

.method protected M3(Linet/ipaddr/ipv6/b;Lbg/a;Ljava/util/function/Predicate;)Ljava/util/Iterator;
    .locals 6

    invoke-virtual {p0}, Linet/ipaddr/ipv6/Q;->B3()Linet/ipaddr/ipv6/e;

    move-result-object v0

    invoke-virtual {v0}, Linet/ipaddr/ipv6/e;->d()Linet/ipaddr/c$b;

    move-result-object v0

    invoke-virtual {v0}, Linet/ipaddr/c$b;->allPrefixedAddressesAreSubnets()Z

    move-result v0

    invoke-virtual {p0}, Lag/d;->A0()Z

    move-result v1

    if-nez v1, :cond_1

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lag/d;->i()Z

    move-result v1

    if-nez v1, :cond_1

    :cond_0
    const/4 v1, 0x1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    const/4 v2, 0x0

    if-eqz v1, :cond_2

    if-eqz p3, :cond_3

    invoke-virtual {p0}, Linet/ipaddr/ipv6/Q;->F3()[Linet/ipaddr/ipv6/V;

    move-result-object v3

    invoke-interface {p3, v3}, Ljava/util/function/Predicate;->test(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    :cond_2
    move-object p1, v2

    :cond_3
    if-eqz v1, :cond_4

    move-object p3, v2

    goto :goto_2

    :cond_4
    invoke-virtual {p0}, Linet/ipaddr/j;->Z()I

    move-result v3

    invoke-virtual {p0}, Lag/d;->A0()Z

    move-result v4

    if-eqz v4, :cond_5

    move-object v4, v2

    goto :goto_1

    :cond_5
    new-instance v4, Linet/ipaddr/ipv6/x;

    invoke-direct {v4, p0}, Linet/ipaddr/ipv6/x;-><init>(Linet/ipaddr/ipv6/Q;)V

    :goto_1
    new-instance v5, Linet/ipaddr/ipv6/y;

    invoke-direct {v5, p0, v0}, Linet/ipaddr/ipv6/y;-><init>(Linet/ipaddr/ipv6/Q;Z)V

    invoke-static {v3, p2, v4, v5, p3}, Lbg/d;->B1(ILinet/ipaddr/c$a;Ljava/util/function/Supplier;Ljava/util/function/IntFunction;Ljava/util/function/Predicate;)Ljava/util/Iterator;

    move-result-object p3

    :goto_2
    if-eqz v0, :cond_6

    goto :goto_3

    :cond_6
    invoke-virtual {p0}, Lbg/f;->A()Ljava/lang/Integer;

    move-result-object v2

    :goto_3
    invoke-static {v1, p1, p2, p3, v2}, Lbg/d;->w1(ZLinet/ipaddr/a;Lbg/a;Ljava/util/Iterator;Ljava/lang/Integer;)Ljava/util/Iterator;

    move-result-object p1

    return-object p1
.end method

.method public V()Ljava/lang/String;
    .locals 2

    invoke-virtual {p0}, Linet/ipaddr/ipv6/Q;->K3()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Linet/ipaddr/ipv6/Q;->H3()Linet/ipaddr/ipv6/Q$f;

    move-result-object v0

    iget-object v0, v0, Linet/ipaddr/j$b;->b:Ljava/lang/String;

    if-nez v0, :cond_1

    :cond_0
    invoke-virtual {p0}, Linet/ipaddr/ipv6/Q;->H3()Linet/ipaddr/ipv6/Q$f;

    move-result-object v0

    sget-object v1, Linet/ipaddr/ipv6/Q$f;->r:Linet/ipaddr/ipv6/Q$g;

    invoke-virtual {p0, v1}, Linet/ipaddr/ipv6/Q;->z4(Linet/ipaddr/ipv6/Q$g;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Linet/ipaddr/j$b;->b:Ljava/lang/String;

    move-object v0, v1

    :cond_1
    return-object v0
.end method

.method public bridge synthetic V0(I)Lag/b;
    .locals 0

    invoke-virtual {p0, p1}, Linet/ipaddr/ipv6/Q;->v3(I)Linet/ipaddr/ipv6/V;

    move-result-object p1

    return-object p1
.end method

.method public X()Ljava/lang/String;
    .locals 2

    invoke-virtual {p0}, Linet/ipaddr/ipv6/Q;->K3()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Linet/ipaddr/ipv6/Q;->H3()Linet/ipaddr/ipv6/Q$f;

    move-result-object v0

    iget-object v0, v0, Linet/ipaddr/ipv6/Q$f;->k:Ljava/lang/String;

    if-nez v0, :cond_1

    :cond_0
    invoke-virtual {p0}, Linet/ipaddr/ipv6/Q;->H3()Linet/ipaddr/ipv6/Q$f;

    move-result-object v0

    sget-object v1, Linet/ipaddr/ipv6/Q$f;->s:Linet/ipaddr/ipv6/Q$g;

    invoke-virtual {p0, v1}, Linet/ipaddr/ipv6/Q;->z4(Linet/ipaddr/ipv6/Q$g;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Linet/ipaddr/ipv6/Q$f;->k:Ljava/lang/String;

    move-object v0, v1

    :cond_1
    return-object v0
.end method

.method public Y()Ljava/lang/String;
    .locals 2

    invoke-virtual {p0}, Linet/ipaddr/ipv6/Q;->K3()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Linet/ipaddr/ipv6/Q;->r:Linet/ipaddr/ipv6/Q$f;

    iget-object v0, v0, Lbg/d$h;->a:Ljava/lang/String;

    if-nez v0, :cond_1

    :cond_0
    iget-object v0, p0, Linet/ipaddr/ipv6/Q;->r:Linet/ipaddr/ipv6/Q$f;

    sget-object v1, Linet/ipaddr/ipv6/Q$f;->o:Linet/ipaddr/ipv6/Q$g;

    invoke-virtual {p0, v1}, Linet/ipaddr/ipv6/Q;->z4(Linet/ipaddr/ipv6/Q$g;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lbg/d$h;->a:Ljava/lang/String;

    move-object v0, v1

    :cond_1
    return-object v0
.end method

.method protected Z1(I)Ljava/math/BigInteger;
    .locals 1

    invoke-virtual {p0}, Lag/d;->A0()Z

    move-result v0

    if-nez v0, :cond_0

    sget-object p1, Ljava/math/BigInteger;->ONE:Ljava/math/BigInteger;

    return-object p1

    :cond_0
    new-instance v0, Linet/ipaddr/ipv6/g;

    invoke-direct {v0, p0}, Linet/ipaddr/ipv6/g;-><init>(Linet/ipaddr/ipv6/Q;)V

    invoke-static {v0, p1}, Linet/ipaddr/ipv6/Q;->u3(Ljava/util/function/IntUnaryOperator;I)Ljava/math/BigInteger;

    move-result-object p1

    return-object p1
.end method

.method public a0()Ljava/lang/String;
    .locals 2

    invoke-virtual {p0}, Linet/ipaddr/ipv6/Q;->K3()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Linet/ipaddr/ipv6/Q;->H3()Linet/ipaddr/ipv6/Q$f;

    move-result-object v0

    iget-object v0, v0, Linet/ipaddr/ipv6/Q$f;->j:Ljava/lang/String;

    if-nez v0, :cond_1

    :cond_0
    invoke-virtual {p0}, Linet/ipaddr/ipv6/Q;->H3()Linet/ipaddr/ipv6/Q$f;

    move-result-object v0

    sget-object v1, Linet/ipaddr/ipv6/Q$f;->n:Linet/ipaddr/ipv6/Q$g;

    invoke-virtual {p0, v1}, Linet/ipaddr/ipv6/Q;->z4(Linet/ipaddr/ipv6/Q$g;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Linet/ipaddr/ipv6/Q$f;->j:Ljava/lang/String;

    move-object v0, v1

    :cond_1
    return-object v0
.end method

.method public bridge synthetic a2(I)Linet/ipaddr/k;
    .locals 0

    invoke-virtual {p0, p1}, Linet/ipaddr/ipv6/Q;->v3(I)Linet/ipaddr/ipv6/V;

    move-result-object p1

    return-object p1
.end method

.method protected b0(Z)[B
    .locals 6

    invoke-virtual {p0}, Linet/ipaddr/ipv6/Q;->v0()I

    move-result v0

    new-array v0, v0, [B

    invoke-virtual {p0}, Linet/ipaddr/j;->Z()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    invoke-virtual {p0, v2}, Linet/ipaddr/ipv6/Q;->C3(I)Linet/ipaddr/ipv6/V;

    move-result-object v3

    shl-int/lit8 v4, v2, 0x1

    if-eqz p1, :cond_0

    invoke-virtual {v3}, Linet/ipaddr/k;->Q()I

    move-result v3

    goto :goto_1

    :cond_0
    invoke-virtual {v3}, Linet/ipaddr/k;->w0()I

    move-result v3

    :goto_1
    ushr-int/lit8 v5, v3, 0x8

    int-to-byte v5, v5

    aput-byte v5, v0, v4

    add-int/lit8 v4, v4, 0x1

    int-to-byte v3, v3

    aput-byte v3, v0, v4

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public c0()Z
    .locals 4

    invoke-virtual {p0}, Linet/ipaddr/ipv6/Q;->K1()Lbg/f$c;

    move-result-object v0

    invoke-virtual {v0}, Lbg/f$c;->b()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-ne v1, v3, :cond_0

    invoke-virtual {v0, v2}, Lbg/f$c;->a(I)Lbg/f$a;

    move-result-object v0

    iget v0, v0, Lbg/f$a;->b:I

    invoke-virtual {p0}, Linet/ipaddr/j;->Z()I

    move-result v1

    if-ne v0, v1, :cond_0

    move v2, v3

    :cond_0
    return v2
.end method

.method protected c1(Lag/d;)Z
    .locals 1

    instance-of v0, p1, Linet/ipaddr/ipv6/Q;

    if-eqz v0, :cond_0

    invoke-super {p0, p1}, Lbg/f;->c1(Lag/d;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public bridge synthetic e()Linet/ipaddr/c;
    .locals 1

    .line 1
    invoke-virtual {p0}, Linet/ipaddr/ipv6/Q;->B3()Linet/ipaddr/ipv6/e;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic e()Linet/ipaddr/i;
    .locals 1

    .line 2
    invoke-virtual {p0}, Linet/ipaddr/ipv6/Q;->B3()Linet/ipaddr/ipv6/e;

    move-result-object v0

    return-object v0
.end method

.method public e0()I
    .locals 1

    const/4 v0, 0x2

    return v0
.end method

.method protected bridge synthetic e2()[Linet/ipaddr/k;
    .locals 1

    invoke-virtual {p0}, Linet/ipaddr/ipv6/Q;->F3()[Linet/ipaddr/ipv6/V;

    move-result-object v0

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Linet/ipaddr/ipv6/Q;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    check-cast p1, Linet/ipaddr/ipv6/Q;

    iget v1, p0, Linet/ipaddr/ipv6/Q;->v:I

    iget v3, p1, Linet/ipaddr/ipv6/Q;->v:I

    if-ne v1, v3, :cond_1

    invoke-virtual {p1, p0}, Linet/ipaddr/ipv6/Q;->c1(Lag/d;)Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    move v0, v2

    :goto_0
    return v0

    :cond_2
    return v2
.end method

.method public f()I
    .locals 1

    invoke-virtual {p0}, Linet/ipaddr/j;->Z()I

    move-result v0

    shl-int/lit8 v0, v0, 0x4

    return v0
.end method

.method protected g1(Ljava/net/InetAddress;)V
    .locals 0

    invoke-super {p0, p1}, Lag/d;->g1(Ljava/net/InetAddress;)V

    return-void
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Linet/ipaddr/ipv6/Q;->N3(Ljava/util/function/Predicate;)Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method

.method protected j2(Ljava/lang/Integer;ZLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/math/BigInteger;Lbg/f$c;Lbg/f$c;)V
    .locals 0

    invoke-super/range {p0 .. p8}, Linet/ipaddr/j;->j2(Ljava/lang/Integer;ZLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/math/BigInteger;Lbg/f$c;Lbg/f$c;)V

    iput-object p7, p0, Linet/ipaddr/ipv6/Q;->w:Lbg/f$c;

    iput-object p8, p0, Linet/ipaddr/ipv6/Q;->x:Lbg/f$c;

    return-void
.end method

.method public bridge synthetic k(I)Lag/f;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Linet/ipaddr/ipv6/Q;->v3(I)Linet/ipaddr/ipv6/V;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic k(I)Lag/l;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Linet/ipaddr/ipv6/Q;->v3(I)Linet/ipaddr/ipv6/V;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic k(I)Lcg/c;
    .locals 0

    .line 3
    invoke-virtual {p0, p1}, Linet/ipaddr/ipv6/Q;->v3(I)Linet/ipaddr/ipv6/V;

    move-result-object p1

    return-object p1
.end method

.method public m0()I
    .locals 1

    const/16 v0, 0x10

    return v0
.end method

.method public bridge synthetic m1(I)Lbg/b;
    .locals 0

    invoke-virtual {p0, p1}, Linet/ipaddr/ipv6/Q;->v3(I)Linet/ipaddr/ipv6/V;

    move-result-object p1

    return-object p1
.end method

.method m3(Linet/ipaddr/ipv6/Q;Linet/ipaddr/ipv6/Q;)V
    .locals 2

    iget-object v0, p0, Linet/ipaddr/ipv6/Q;->s:Lbg/d$g;

    if-nez p1, :cond_0

    if-eqz p2, :cond_6

    :cond_0
    if-eqz v0, :cond_2

    if-eqz p1, :cond_1

    iget-object v1, v0, Lbg/d$g;->a:LZf/e;

    if-eqz v1, :cond_2

    :cond_1
    if-eqz p2, :cond_6

    iget-object v0, v0, Lbg/d$g;->c:LZf/e;

    if-nez v0, :cond_6

    :cond_2
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Linet/ipaddr/ipv6/Q;->s:Lbg/d$g;

    if-nez v0, :cond_3

    new-instance v0, Lbg/d$g;

    invoke-direct {v0}, Lbg/d$g;-><init>()V

    iput-object v0, p0, Linet/ipaddr/ipv6/Q;->s:Lbg/d$g;

    iput-object p1, v0, Lbg/d$g;->a:LZf/e;

    iput-object p2, v0, Lbg/d$g;->c:LZf/e;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_3
    iget-object v1, v0, Lbg/d$g;->a:LZf/e;

    if-nez v1, :cond_4

    iput-object p1, v0, Lbg/d$g;->a:LZf/e;

    :cond_4
    iget-object p1, v0, Lbg/d$g;->c:LZf/e;

    if-nez p1, :cond_5

    iput-object p2, v0, Lbg/d$g;->c:LZf/e;

    :cond_5
    :goto_0
    monitor-exit p0

    :cond_6
    return-void

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public n0()Linet/ipaddr/g$a;
    .locals 1

    sget-object v0, Linet/ipaddr/g$a;->IPV6:Linet/ipaddr/g$a;

    return-object v0
.end method

.method public n3()Linet/ipaddr/ipv6/Q;
    .locals 4

    invoke-virtual {p0}, Linet/ipaddr/j;->Z()I

    move-result v0

    iget v1, p0, Linet/ipaddr/ipv6/Q;->v:I

    rsub-int/lit8 v1, v1, 0x6

    const/4 v2, 0x0

    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v1

    sub-int/2addr v0, v1

    if-gtz v0, :cond_0

    return-object p0

    :cond_0
    invoke-virtual {p0}, Linet/ipaddr/j;->Z()I

    move-result v1

    sub-int/2addr v1, v0

    invoke-static {v2, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    invoke-virtual {p0}, Linet/ipaddr/ipv6/Q;->B3()Linet/ipaddr/ipv6/e;

    move-result-object v1

    invoke-virtual {v1}, Linet/ipaddr/ipv6/e;->T()Linet/ipaddr/ipv6/e$a;

    move-result-object v1

    invoke-virtual {v1, v0}, Linet/ipaddr/ipv6/e$a;->h1(I)[Linet/ipaddr/ipv6/V;

    move-result-object v3

    invoke-virtual {p0, v2, v0, v3, v2}, Linet/ipaddr/j;->d2(II[LZf/d;I)V

    iget v0, p0, Linet/ipaddr/ipv6/Q;->v:I

    invoke-virtual {v1, p0, v3, v0}, Linet/ipaddr/ipv6/e$a;->Y0(Linet/ipaddr/ipv6/Q;[Linet/ipaddr/ipv6/V;I)Linet/ipaddr/ipv6/Q;

    move-result-object v0

    return-object v0
.end method

.method p3(Z)Linet/ipaddr/ipv6/Q;
    .locals 10

    invoke-virtual {p0}, Lbg/f;->F0()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p0}, Linet/ipaddr/ipv6/Q;->B3()Linet/ipaddr/ipv6/e;

    move-result-object v1

    invoke-virtual {v1, v0}, Linet/ipaddr/i;->r(I)Linet/ipaddr/g;

    move-result-object v2

    check-cast v2, Linet/ipaddr/ipv6/b;

    invoke-virtual {v1}, Linet/ipaddr/ipv6/e;->d()Linet/ipaddr/c$b;

    move-result-object v1

    invoke-virtual {v1}, Linet/ipaddr/c$b;->allPrefixedAddressesAreSubnets()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, 0x0

    :goto_0
    move-object v4, v0

    goto :goto_1

    :cond_0
    invoke-static {v0}, Linet/ipaddr/ipv6/Q;->s(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_0

    :goto_1
    invoke-direct {p0}, Linet/ipaddr/ipv6/Q;->r3()Linet/ipaddr/ipv6/e$a;

    move-result-object v5

    xor-int/lit8 v6, p1, 0x1

    new-instance v7, Linet/ipaddr/ipv6/h;

    invoke-direct {v7, p0}, Linet/ipaddr/ipv6/h;-><init>(Linet/ipaddr/ipv6/Q;)V

    new-instance v8, Linet/ipaddr/ipv6/i;

    invoke-direct {v8, v2}, Linet/ipaddr/ipv6/i;-><init>(Linet/ipaddr/ipv6/b;)V

    const/4 v9, 0x1

    move-object v3, p0

    invoke-static/range {v3 .. v9}, Linet/ipaddr/j;->f2(Linet/ipaddr/j;Ljava/lang/Integer;Linet/ipaddr/i$a;ZLjava/util/function/IntFunction;Ljava/util/function/IntUnaryOperator;Z)Linet/ipaddr/j;

    move-result-object p1

    check-cast p1, Linet/ipaddr/ipv6/Q;

    return-object p1
.end method

.method public bridge synthetic q(I)LZf/d;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Linet/ipaddr/ipv6/Q;->C3(I)Linet/ipaddr/ipv6/V;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic q(I)Linet/ipaddr/k;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Linet/ipaddr/ipv6/Q;->C3(I)Linet/ipaddr/ipv6/V;

    move-result-object p1

    return-object p1
.end method

.method protected q0()[B
    .locals 1

    invoke-super {p0}, Linet/ipaddr/j;->q0()[B

    move-result-object v0

    return-object v0
.end method

.method public r0()Ljava/lang/String;
    .locals 2

    invoke-virtual {p0}, Linet/ipaddr/ipv6/Q;->K3()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Linet/ipaddr/ipv6/Q;->H3()Linet/ipaddr/ipv6/Q$f;

    move-result-object v0

    iget-object v0, v0, Linet/ipaddr/j$b;->c:Ljava/lang/String;

    if-nez v0, :cond_1

    :cond_0
    invoke-virtual {p0}, Linet/ipaddr/ipv6/Q;->H3()Linet/ipaddr/ipv6/Q$f;

    move-result-object v0

    sget-object v1, Linet/ipaddr/ipv6/Q$f;->m:Linet/ipaddr/ipv6/Q$g;

    invoke-virtual {p0, v1}, Linet/ipaddr/ipv6/Q;->z4(Linet/ipaddr/ipv6/Q$g;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Linet/ipaddr/j$b;->c:Ljava/lang/String;

    move-object v0, v1

    :cond_1
    return-object v0
.end method

.method public r4(Linet/ipaddr/ipv6/Q;Z)Linet/ipaddr/ipv6/Q;
    .locals 7

    invoke-virtual {p0, p1}, Linet/ipaddr/j;->V1(Linet/ipaddr/j;)V

    if-eqz p2, :cond_0

    invoke-virtual {p0}, Lbg/f;->A()Ljava/lang/Integer;

    move-result-object p2

    :goto_0
    move-object v1, p2

    goto :goto_1

    :cond_0
    const/4 p2, 0x0

    goto :goto_0

    :goto_1
    invoke-direct {p0}, Linet/ipaddr/ipv6/Q;->r3()Linet/ipaddr/ipv6/e$a;

    move-result-object v2

    new-instance v4, Linet/ipaddr/ipv6/h;

    invoke-direct {v4, p0}, Linet/ipaddr/ipv6/h;-><init>(Linet/ipaddr/ipv6/Q;)V

    new-instance v5, Linet/ipaddr/ipv6/A;

    invoke-direct {v5, p1}, Linet/ipaddr/ipv6/A;-><init>(Linet/ipaddr/ipv6/Q;)V

    const/4 v6, 0x0

    const/4 v3, 0x1

    move-object v0, p0

    invoke-static/range {v0 .. v6}, Linet/ipaddr/j;->f2(Linet/ipaddr/j;Ljava/lang/Integer;Linet/ipaddr/i$a;ZLjava/util/function/IntFunction;Ljava/util/function/IntUnaryOperator;Z)Linet/ipaddr/j;

    move-result-object p1

    check-cast p1, Linet/ipaddr/ipv6/Q;

    return-object p1
.end method

.method protected s3(I)Linet/ipaddr/ipv6/e$a;
    .locals 5

    invoke-virtual {p0}, Linet/ipaddr/ipv6/Q;->B3()Linet/ipaddr/ipv6/e;

    move-result-object v0

    invoke-virtual {v0}, Linet/ipaddr/ipv6/e;->T()Linet/ipaddr/ipv6/e$a;

    move-result-object v0

    const/16 v1, 0x8

    if-ge p1, v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_1

    sget-object v2, Linet/ipaddr/ipv6/Q;->y:[Linet/ipaddr/ipv6/e$a;

    aget-object v2, v2, p1

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    :goto_1
    if-eqz v2, :cond_2

    invoke-virtual {v2}, Linet/ipaddr/ipv6/e$a;->j1()Linet/ipaddr/ipv6/e;

    move-result-object v3

    invoke-virtual {p0}, Linet/ipaddr/ipv6/Q;->B3()Linet/ipaddr/ipv6/e;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v1, v3

    if-eqz v1, :cond_2

    return-object v2

    :cond_2
    new-instance v2, Linet/ipaddr/ipv6/Q$a;

    invoke-virtual {p0}, Linet/ipaddr/ipv6/Q;->B3()Linet/ipaddr/ipv6/e;

    move-result-object v3

    iget-object v4, v0, Linet/ipaddr/ipv6/e$a;->b:Linet/ipaddr/ipv6/e$a$a;

    invoke-direct {v2, p0, v3, v4, p1}, Linet/ipaddr/ipv6/Q$a;-><init>(Linet/ipaddr/ipv6/Q;Linet/ipaddr/ipv6/e;Linet/ipaddr/ipv6/e$a$a;I)V

    iget-boolean v0, v0, Linet/ipaddr/ipv6/e$a;->c:Z

    iput-boolean v0, v2, Linet/ipaddr/ipv6/e$a;->c:Z

    if-eqz v1, :cond_3

    sget-object v0, Linet/ipaddr/ipv6/Q;->y:[Linet/ipaddr/ipv6/e$a;

    aput-object v2, v0, p1

    :cond_3
    return-object v2
.end method

.method public s4(Z)Linet/ipaddr/ipv6/Q;
    .locals 2

    invoke-direct {p0}, Linet/ipaddr/ipv6/Q;->r3()Linet/ipaddr/ipv6/e$a;

    move-result-object v0

    new-instance v1, Linet/ipaddr/ipv6/z;

    invoke-direct {v1}, Linet/ipaddr/ipv6/z;-><init>()V

    invoke-static {p0, p1, v0, v1}, Linet/ipaddr/j;->y2(Linet/ipaddr/j;ZLinet/ipaddr/i$a;Linet/ipaddr/j$e;)Linet/ipaddr/j;

    move-result-object p1

    check-cast p1, Linet/ipaddr/ipv6/Q;

    return-object p1
.end method

.method public bridge synthetic spliterator()Ljava/util/Spliterator;
    .locals 1

    invoke-virtual {p0}, Linet/ipaddr/ipv6/Q;->v4()Ldg/b;

    move-result-object v0

    return-object v0
.end method

.method public u4()Ljava/util/Iterator;
    .locals 1

    invoke-direct {p0}, Linet/ipaddr/ipv6/Q;->q3()Ljava/util/function/Predicate;

    move-result-object v0

    invoke-direct {p0, v0}, Linet/ipaddr/ipv6/Q;->t4(Ljava/util/function/Predicate;)Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method

.method public v0()I
    .locals 1

    invoke-virtual {p0}, Linet/ipaddr/j;->Z()I

    move-result v0

    shl-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public v3(I)Linet/ipaddr/ipv6/V;
    .locals 0

    invoke-super {p0, p1}, Linet/ipaddr/j;->a2(I)Linet/ipaddr/k;

    move-result-object p1

    check-cast p1, Linet/ipaddr/ipv6/V;

    return-object p1
.end method

.method public v4()Ldg/b;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Linet/ipaddr/ipv6/Q;->x4(Z)Ldg/b;

    move-result-object v0

    return-object v0
.end method

.method public w3()Linet/ipaddr/ipv4/I;
    .locals 6

    iget-object v0, p0, Linet/ipaddr/ipv6/Q;->t:Linet/ipaddr/ipv4/I;

    if-nez v0, :cond_3

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Linet/ipaddr/ipv6/Q;->t:Linet/ipaddr/ipv4/I;

    if-nez v0, :cond_2

    invoke-virtual {p0}, Linet/ipaddr/j;->Z()I

    move-result v0

    iget v1, p0, Linet/ipaddr/ipv6/Q;->v:I

    rsub-int/lit8 v1, v1, 0x6

    const/4 v2, 0x0

    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v1

    sub-int/2addr v0, v1

    invoke-virtual {p0}, Linet/ipaddr/j;->Z()I

    move-result v1

    add-int/lit8 v3, v1, -0x1

    invoke-virtual {p0}, Linet/ipaddr/ipv6/Q;->x3()Linet/ipaddr/ipv4/e;

    move-result-object v4

    invoke-virtual {v4}, Linet/ipaddr/ipv4/e;->d0()Linet/ipaddr/ipv4/e$a;

    move-result-object v4

    if-nez v0, :cond_0

    invoke-virtual {v4, v2}, Linet/ipaddr/ipv4/e$a;->d1(I)[Linet/ipaddr/ipv4/M;

    move-result-object v0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    const/4 v5, 0x1

    if-ne v0, v5, :cond_1

    invoke-virtual {p0}, Linet/ipaddr/ipv6/Q;->e0()I

    move-result v0

    invoke-virtual {v4, v0}, Linet/ipaddr/ipv4/e$a;->d1(I)[Linet/ipaddr/ipv4/M;

    move-result-object v0

    invoke-virtual {p0, v3}, Linet/ipaddr/ipv6/Q;->C3(I)Linet/ipaddr/ipv6/V;

    move-result-object v1

    invoke-virtual {v1, v0, v2, v4}, Linet/ipaddr/ipv6/V;->e3([LZf/d;ILinet/ipaddr/c$a;)V

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Linet/ipaddr/ipv6/Q;->e0()I

    move-result v0

    shl-int/2addr v0, v5

    invoke-virtual {v4, v0}, Linet/ipaddr/ipv4/e$a;->d1(I)[Linet/ipaddr/ipv4/M;

    move-result-object v0

    invoke-virtual {p0, v3}, Linet/ipaddr/ipv6/Q;->C3(I)Linet/ipaddr/ipv6/V;

    move-result-object v3

    add-int/lit8 v1, v1, -0x2

    invoke-virtual {p0, v1}, Linet/ipaddr/ipv6/Q;->C3(I)Linet/ipaddr/ipv6/V;

    move-result-object v1

    invoke-virtual {v1, v0, v2, v4}, Linet/ipaddr/ipv6/V;->e3([LZf/d;ILinet/ipaddr/c$a;)V

    invoke-virtual {p0}, Linet/ipaddr/ipv6/Q;->e0()I

    move-result v1

    invoke-virtual {v3, v0, v1, v4}, Linet/ipaddr/ipv6/V;->e3([LZf/d;ILinet/ipaddr/c$a;)V

    :goto_0
    invoke-static {v4, v0, p0}, Linet/ipaddr/j;->W1(Linet/ipaddr/i$a;[Linet/ipaddr/k;Linet/ipaddr/j;)Linet/ipaddr/j;

    move-result-object v0

    check-cast v0, Linet/ipaddr/ipv4/I;

    iput-object v0, p0, Linet/ipaddr/ipv6/Q;->t:Linet/ipaddr/ipv4/I;

    :cond_2
    monitor-exit p0

    goto :goto_2

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_3
    :goto_2
    iget-object v0, p0, Linet/ipaddr/ipv6/Q;->t:Linet/ipaddr/ipv4/I;

    return-object v0
.end method

.method protected w4(Linet/ipaddr/ipv6/b;Linet/ipaddr/ipv6/e$a;Z)Ldg/b;
    .locals 9

    invoke-virtual {p0}, Linet/ipaddr/j;->Z()I

    move-result v0

    invoke-virtual {p0}, Lbg/f;->F0()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p0}, Linet/ipaddr/ipv6/Q;->B3()Linet/ipaddr/ipv6/e;

    move-result-object v2

    invoke-virtual {v2}, Linet/ipaddr/ipv6/e;->d()Linet/ipaddr/c$b;

    move-result-object v2

    invoke-virtual {v2}, Linet/ipaddr/c$b;->allPrefixedAddressesAreSubnets()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {p1}, Linet/ipaddr/ipv6/b;->h2()Linet/ipaddr/ipv6/b;

    move-result-object p1

    const/4 v2, 0x0

    move-object v3, p1

    goto :goto_0

    :cond_0
    move-object v3, p1

    move-object v2, v1

    :goto_0
    if-eqz p3, :cond_1

    invoke-virtual {p0}, Linet/ipaddr/j;->h2()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    new-instance p3, Linet/ipaddr/ipv6/j;

    invoke-direct {p3, p0, p1}, Linet/ipaddr/ipv6/j;-><init>(Linet/ipaddr/ipv6/Q;I)V

    new-instance v1, Linet/ipaddr/ipv6/k;

    invoke-direct {v1, v0, p1}, Linet/ipaddr/ipv6/k;-><init>(II)V

    new-instance v4, Linet/ipaddr/ipv6/l;

    invoke-direct {v4, p1, v0}, Linet/ipaddr/ipv6/l;-><init>(II)V

    move-object v5, p3

    move-object v8, v1

    move-object v6, v4

    goto :goto_1

    :cond_1
    new-instance p1, Linet/ipaddr/ipv6/m;

    invoke-direct {p1}, Linet/ipaddr/ipv6/m;-><init>()V

    new-instance p3, Linet/ipaddr/ipv6/n;

    invoke-direct {p3, v0}, Linet/ipaddr/ipv6/n;-><init>(I)V

    new-instance v1, Linet/ipaddr/ipv6/o;

    invoke-direct {v1}, Linet/ipaddr/ipv6/o;-><init>()V

    move-object v5, p1

    move-object v8, p3

    move-object v6, v1

    :goto_1
    add-int/lit8 p1, v0, -0x1

    new-instance v4, Linet/ipaddr/ipv6/p;

    invoke-direct {v4, p2, v2, p1, v0}, Linet/ipaddr/ipv6/p;-><init>(Linet/ipaddr/ipv6/e$a;Ljava/lang/Integer;II)V

    new-instance v7, Linet/ipaddr/ipv6/r;

    invoke-direct {v7}, Linet/ipaddr/ipv6/r;-><init>()V

    invoke-static/range {v3 .. v8}, Lag/d;->T(LZf/b;Ljava/util/function/Predicate;Lag/d$d;Ljava/util/function/Function;Ljava/util/function/Predicate;Ljava/util/function/ToLongFunction;)Ldg/b;

    move-result-object p1

    return-object p1
.end method

.method public x0(LZf/c;)Z
    .locals 2

    instance-of v0, p1, Linet/ipaddr/ipv6/Q;

    if-eqz v0, :cond_0

    iget v0, p0, Linet/ipaddr/ipv6/Q;->v:I

    move-object v1, p1

    check-cast v1, Linet/ipaddr/ipv6/Q;

    iget v1, v1, Linet/ipaddr/ipv6/Q;->v:I

    if-ne v0, v1, :cond_0

    invoke-super {p0, p1}, Linet/ipaddr/j;->x0(LZf/c;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public x3()Linet/ipaddr/ipv4/e;
    .locals 1

    invoke-static {}, Linet/ipaddr/a;->j()Linet/ipaddr/ipv4/e;

    move-result-object v0

    return-object v0
.end method

.method protected x4(Z)Ldg/b;
    .locals 11

    invoke-virtual {p0}, Linet/ipaddr/j;->Z()I

    move-result v0

    invoke-virtual {p0}, Lbg/f;->F0()Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {p0}, Linet/ipaddr/ipv6/Q;->r3()Linet/ipaddr/ipv6/e$a;

    move-result-object v2

    invoke-virtual {p0}, Linet/ipaddr/ipv6/Q;->B3()Linet/ipaddr/ipv6/e;

    move-result-object v3

    invoke-virtual {v3}, Linet/ipaddr/ipv6/e;->d()Linet/ipaddr/c$b;

    move-result-object v3

    invoke-virtual {v3}, Linet/ipaddr/c$b;->allPrefixedAddressesAreSubnets()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {p0}, Linet/ipaddr/ipv6/Q;->D4()Linet/ipaddr/ipv6/Q;

    move-result-object v3

    const/4 v4, 0x0

    move-object v5, v3

    goto :goto_0

    :cond_0
    move-object v5, p0

    move-object v4, v1

    :goto_0
    if-eqz p1, :cond_1

    invoke-virtual {p0}, Linet/ipaddr/j;->h2()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    new-instance v1, Linet/ipaddr/ipv6/f;

    invoke-direct {v1, p0, p1}, Linet/ipaddr/ipv6/f;-><init>(Linet/ipaddr/ipv6/Q;I)V

    new-instance v3, Linet/ipaddr/ipv6/q;

    invoke-direct {v3, v0, p1}, Linet/ipaddr/ipv6/q;-><init>(II)V

    new-instance v6, Linet/ipaddr/ipv6/B;

    invoke-direct {v6, p1, v0}, Linet/ipaddr/ipv6/B;-><init>(II)V

    move-object v7, v1

    move-object v10, v3

    move-object v8, v6

    goto :goto_1

    :cond_1
    new-instance p1, Linet/ipaddr/ipv6/J;

    invoke-direct {p1}, Linet/ipaddr/ipv6/J;-><init>()V

    new-instance v1, Linet/ipaddr/ipv6/K;

    invoke-direct {v1, v0}, Linet/ipaddr/ipv6/K;-><init>(I)V

    new-instance v3, Linet/ipaddr/ipv6/L;

    invoke-direct {v3}, Linet/ipaddr/ipv6/L;-><init>()V

    move-object v7, p1

    move-object v10, v1

    move-object v8, v3

    :goto_1
    add-int/lit8 p1, v0, -0x1

    new-instance v6, Linet/ipaddr/ipv6/M;

    invoke-direct {v6, v2, v4, p1, v0}, Linet/ipaddr/ipv6/M;-><init>(Linet/ipaddr/ipv6/e$a;Ljava/lang/Integer;II)V

    new-instance v9, Linet/ipaddr/ipv6/N;

    invoke-direct {v9}, Linet/ipaddr/ipv6/N;-><init>()V

    invoke-static/range {v5 .. v10}, Lag/d;->T(LZf/b;Ljava/util/function/Predicate;Lag/d$d;Ljava/util/function/Function;Ljava/util/function/Predicate;Ljava/util/function/ToLongFunction;)Ldg/b;

    move-result-object p1

    return-object p1
.end method

.method public y3()Linet/ipaddr/ipv6/Q;
    .locals 2

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Linet/ipaddr/ipv6/Q;->z3(ZZ)Linet/ipaddr/ipv6/Q;

    move-result-object v0

    return-object v0
.end method

.method z3(ZZ)Linet/ipaddr/ipv6/Q;
    .locals 11

    invoke-virtual {p0}, Linet/ipaddr/ipv6/Q;->G3()Linet/ipaddr/ipv6/Q;

    move-result-object v0

    if-nez v0, :cond_c

    iget-object v1, p0, Linet/ipaddr/ipv6/Q;->s:Lbg/d$g;

    if-eqz v1, :cond_2

    if-eqz p1, :cond_1

    if-eqz p2, :cond_0

    iget-object v0, v1, Lbg/d$g;->b:LZf/e;

    check-cast v0, Linet/ipaddr/ipv6/Q;

    if-nez v0, :cond_d

    iget-boolean v1, v1, Lbg/d$g;->d:Z

    if-nez v1, :cond_d

    goto :goto_0

    :cond_0
    iget-object v0, v1, Lbg/d$g;->a:LZf/e;

    check-cast v0, Linet/ipaddr/ipv6/Q;

    if-nez v0, :cond_d

    goto :goto_0

    :cond_1
    iget-object v0, v1, Lbg/d$g;->c:LZf/e;

    check-cast v0, Linet/ipaddr/ipv6/Q;

    if-nez v0, :cond_d

    :cond_2
    :goto_0
    monitor-enter p0

    :try_start_0
    iget-object v1, p0, Linet/ipaddr/ipv6/Q;->s:Lbg/d$g;

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-nez v1, :cond_3

    move v4, v3

    goto :goto_1

    :cond_3
    move v4, v2

    :goto_1
    if-eqz v4, :cond_4

    new-instance v1, Lbg/d$g;

    invoke-direct {v1}, Lbg/d$g;-><init>()V

    iput-object v1, p0, Linet/ipaddr/ipv6/Q;->s:Lbg/d$g;

    goto :goto_3

    :catchall_0
    move-exception p1

    goto :goto_5

    :cond_4
    if-eqz p1, :cond_7

    if-eqz p2, :cond_6

    iget-object v0, v1, Lbg/d$g;->b:LZf/e;

    check-cast v0, Linet/ipaddr/ipv6/Q;

    if-nez v0, :cond_5

    iget-boolean v4, v1, Lbg/d$g;->d:Z

    if-nez v4, :cond_5

    :goto_2
    move v2, v3

    :cond_5
    move v4, v2

    goto :goto_3

    :cond_6
    iget-object v0, v1, Lbg/d$g;->a:LZf/e;

    check-cast v0, Linet/ipaddr/ipv6/Q;

    if-nez v0, :cond_5

    goto :goto_2

    :cond_7
    iget-object v0, v1, Lbg/d$g;->c:LZf/e;

    check-cast v0, Linet/ipaddr/ipv6/Q;

    if-nez v0, :cond_5

    goto :goto_2

    :goto_3
    if-eqz v4, :cond_b

    invoke-direct {p0}, Linet/ipaddr/ipv6/Q;->r3()Linet/ipaddr/ipv6/e$a;

    move-result-object v6

    new-instance v7, Linet/ipaddr/ipv6/s;

    invoke-direct {v7, p0}, Linet/ipaddr/ipv6/s;-><init>(Linet/ipaddr/ipv6/Q;)V

    new-instance v8, Linet/ipaddr/ipv6/t;

    invoke-direct {v8, p0, p1}, Linet/ipaddr/ipv6/t;-><init>(Linet/ipaddr/ipv6/Q;Z)V

    move-object v5, p0

    move v9, p1

    move v10, p2

    invoke-static/range {v5 .. v10}, Linet/ipaddr/j;->X1(Linet/ipaddr/j;Linet/ipaddr/i$a;Ljava/util/function/Supplier;Ljava/util/function/IntFunction;ZZ)Linet/ipaddr/j;

    move-result-object v0

    check-cast v0, Linet/ipaddr/ipv6/Q;

    if-nez v0, :cond_8

    iput-boolean v3, v1, Lbg/d$g;->d:Z

    goto :goto_4

    :cond_8
    if-eqz p1, :cond_a

    if-eqz p2, :cond_9

    iput-object v0, v1, Lbg/d$g;->b:LZf/e;

    goto :goto_4

    :cond_9
    iput-object v0, v1, Lbg/d$g;->a:LZf/e;

    goto :goto_4

    :cond_a
    iput-object v0, v1, Lbg/d$g;->c:LZf/e;

    :cond_b
    :goto_4
    monitor-exit p0

    goto :goto_6

    :goto_5
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_c
    if-eqz p2, :cond_d

    invoke-virtual {p0}, Linet/ipaddr/j;->h2()Z

    move-result p1

    if-eqz p1, :cond_d

    const/4 p1, 0x0

    return-object p1

    :cond_d
    :goto_6
    return-object v0
.end method

.method public z4(Linet/ipaddr/ipv6/Q$g;)Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Linet/ipaddr/ipv6/Q;->A4(Linet/ipaddr/ipv6/Q$g;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
