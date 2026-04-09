.class public Linet/ipaddr/ipv4/I;
.super Linet/ipaddr/j;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Iterable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Linet/ipaddr/ipv4/I$d;,
        Linet/ipaddr/ipv4/I$a;,
        Linet/ipaddr/ipv4/I$b;,
        Linet/ipaddr/ipv4/I$c;
    }
.end annotation


# static fields
.field private static final u:[J


# instance fields
.field transient r:Linet/ipaddr/ipv4/I$c;

.field private transient s:Lbg/d$g;

.field private transient t:Ljava/lang/Integer;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x5

    new-array v0, v0, [J

    fill-array-data v0, :array_0

    sput-object v0, Linet/ipaddr/ipv4/I;->u:[J

    return-void

    nop

    :array_0
    .array-data 8
        0x0
        0xff
        0xffff
        0xffffff
        0xffffffffL
    .end array-data
.end method

.method protected constructor <init>([BIIILjava/lang/Integer;)V
    .locals 8

    const/4 v6, 0x1

    const/4 v7, 0x0

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move-object v5, p5

    .line 59
    invoke-direct/range {v0 .. v7}, Linet/ipaddr/ipv4/I;-><init>([BIIILjava/lang/Integer;ZZ)V

    return-void
.end method

.method protected constructor <init>([BIIILjava/lang/Integer;ZZ)V
    .locals 12

    move-object v0, p0

    const/4 v1, 0x0

    if-ltz p4, :cond_0

    move/from16 v2, p4

    goto :goto_0

    :cond_0
    sub-int v2, p3, p2

    .line 28
    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v2

    :goto_0
    new-array v2, v2, [Linet/ipaddr/ipv4/M;

    invoke-direct {p0, v2, v1, v1}, Linet/ipaddr/j;-><init>([Linet/ipaddr/k;ZZ)V

    .line 29
    invoke-virtual {p0}, Linet/ipaddr/ipv4/I;->u3()[Linet/ipaddr/ipv4/M;

    move-result-object v10

    .line 30
    invoke-virtual {p0}, Linet/ipaddr/ipv4/I;->p3()Linet/ipaddr/ipv4/e;

    move-result-object v11

    .line 31
    invoke-virtual {p0}, Linet/ipaddr/ipv4/I;->e0()I

    move-result v6

    .line 32
    invoke-virtual {p0}, Linet/ipaddr/ipv4/I;->m0()I

    move-result v7

    move-object v2, v10

    move-object v3, p1

    move v4, p2

    move v5, p3

    move-object v8, v11

    move-object/from16 v9, p5

    .line 33
    invoke-static/range {v2 .. v9}, Lbg/d;->F1([LZf/d;[BIIIILinet/ipaddr/c;Ljava/lang/Integer;)[LZf/d;

    move-object v2, p1

    .line 34
    array-length v3, v2

    array-length v4, v10

    if-ne v3, v4, :cond_1

    const/4 v3, 0x1

    goto :goto_1

    :cond_1
    move v3, v1

    :goto_1
    if-eqz p5, :cond_c

    .line 35
    invoke-virtual/range {p5 .. p5}, Ljava/lang/Integer;->intValue()I

    move-result v4

    if-ltz v4, :cond_b

    .line 36
    array-length v4, v10

    shl-int/lit8 v4, v4, 0x3

    .line 37
    invoke-virtual/range {p5 .. p5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    if-le v5, v4, :cond_3

    .line 38
    invoke-virtual/range {p5 .. p5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    const/16 v6, 0x20

    if-gt v5, v6, :cond_2

    .line 39
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    goto :goto_2

    .line 40
    :cond_2
    new-instance v1, Linet/ipaddr/PrefixLenException;

    invoke-virtual/range {p5 .. p5}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-direct {v1, v2}, Linet/ipaddr/PrefixLenException;-><init>(I)V

    throw v1

    :cond_3
    move-object/from16 v4, p5

    .line 41
    :goto_2
    array-length v5, v10

    if-lez v5, :cond_9

    .line 42
    invoke-virtual {v11}, Linet/ipaddr/ipv4/e;->d()Linet/ipaddr/c$b;

    move-result-object v5

    .line 43
    invoke-virtual {v5}, Linet/ipaddr/c$b;->zeroHostsAreSubnets()Z

    move-result v6

    if-eqz v6, :cond_6

    .line 44
    invoke-static {v10, v4, v11, v1}, Linet/ipaddr/j;->l2([Linet/ipaddr/k;Ljava/lang/Integer;Linet/ipaddr/i;Z)Z

    move-result v1

    if-eqz v1, :cond_4

    if-nez p7, :cond_4

    .line 45
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v1

    .line 46
    invoke-virtual {p0}, Linet/ipaddr/ipv4/I;->m0()I

    move-result v2

    .line 47
    invoke-virtual {p0}, Linet/ipaddr/ipv4/I;->e0()I

    move-result v3

    .line 48
    invoke-virtual {v11}, Linet/ipaddr/ipv4/e;->d0()Linet/ipaddr/ipv4/e$a;

    move-result-object v5

    new-instance v6, Linet/ipaddr/ipv4/n;

    invoke-direct {v6}, Linet/ipaddr/ipv4/n;-><init>()V

    move-object p1, v11

    move p2, v1

    move-object p3, v10

    move/from16 p4, v2

    move/from16 p5, v3

    move-object/from16 p6, v5

    move-object/from16 p7, v6

    .line 49
    invoke-static/range {p1 .. p7}, Lbg/d;->D1(Linet/ipaddr/c;I[LZf/d;IILinet/ipaddr/c$a;Ljava/util/function/BiFunction;)[LZf/d;

    goto :goto_5

    :cond_4
    if-eqz v3, :cond_a

    .line 50
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {p0}, Linet/ipaddr/ipv4/I;->f()I

    move-result v3

    if-lt v1, v3, :cond_a

    if-eqz p6, :cond_5

    .line 51
    invoke-virtual {p1}, [B->clone()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [B

    goto :goto_3

    :cond_5
    move-object v1, v2

    :goto_3
    invoke-virtual {p0, v1}, Lag/d;->e1([B)V

    goto :goto_5

    :cond_6
    if-eqz v3, :cond_a

    .line 52
    invoke-virtual {v5}, Linet/ipaddr/c$b;->prefixedSubnetsAreExplicit()Z

    move-result v1

    if-nez v1, :cond_7

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {p0}, Linet/ipaddr/ipv4/I;->f()I

    move-result v3

    if-lt v1, v3, :cond_a

    :cond_7
    if-eqz p6, :cond_8

    .line 53
    invoke-virtual {p1}, [B->clone()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [B

    goto :goto_4

    :cond_8
    move-object v1, v2

    :goto_4
    invoke-virtual {p0, v1}, Lag/d;->e1([B)V

    goto :goto_5

    :cond_9
    if-eqz v3, :cond_a

    .line 54
    invoke-virtual {p0, p1}, Lag/d;->e1([B)V

    .line 55
    :cond_a
    :goto_5
    iput-object v4, v0, Lag/d;->c:Ljava/lang/Integer;

    goto :goto_7

    .line 56
    :cond_b
    new-instance v1, Linet/ipaddr/PrefixLenException;

    invoke-virtual/range {p5 .. p5}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-direct {v1, v2}, Linet/ipaddr/PrefixLenException;-><init>(I)V

    throw v1

    .line 57
    :cond_c
    sget-object v1, Lag/d;->g:Ljava/lang/Integer;

    iput-object v1, v0, Lag/d;->c:Ljava/lang/Integer;

    if-eqz v3, :cond_e

    if-eqz p6, :cond_d

    .line 58
    invoke-virtual {p1}, [B->clone()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [B

    goto :goto_6

    :cond_d
    move-object v1, v2

    :goto_6
    invoke-virtual {p0, v1}, Lag/d;->e1([B)V

    :cond_e
    :goto_7
    return-void
.end method

.method protected constructor <init>([BILjava/lang/Integer;ZZ)V
    .locals 8

    .line 27
    array-length v3, p1

    const/4 v2, 0x0

    move-object v0, p0

    move-object v1, p1

    move v4, p2

    move-object v5, p3

    move v6, p4

    move v7, p5

    invoke-direct/range {v0 .. v7}, Linet/ipaddr/ipv4/I;-><init>([BIIILjava/lang/Integer;ZZ)V

    return-void
.end method

.method protected constructor <init>([Linet/ipaddr/ipv4/M;Z)V
    .locals 1

    const/4 v0, 0x1

    .line 21
    invoke-direct {p0, p1, p2, v0}, Linet/ipaddr/ipv4/I;-><init>([Linet/ipaddr/ipv4/M;ZZ)V

    return-void
.end method

.method protected constructor <init>([Linet/ipaddr/ipv4/M;ZLjava/lang/Integer;Z)V
    .locals 8

    const/4 v0, 0x0

    if-nez p3, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    move v1, v0

    .line 1
    :goto_0
    invoke-direct {p0, p1, p2, v1}, Linet/ipaddr/ipv4/I;-><init>([Linet/ipaddr/ipv4/M;ZZ)V

    if-eqz p3, :cond_7

    .line 2
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p2

    if-ltz p2, :cond_6

    .line 3
    array-length p2, p1

    shl-int/lit8 p2, p2, 0x3

    .line 4
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-le v1, p2, :cond_2

    .line 5
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const/16 v2, 0x20

    if-gt v1, v2, :cond_1

    .line 6
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    goto :goto_1

    .line 7
    :cond_1
    new-instance p1, Linet/ipaddr/PrefixLenException;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

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

    sget-object v1, Lag/d;->g:Ljava/lang/Integer;

    if-eq p2, v1, :cond_3

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-ge p2, v1, :cond_3

    .line 10
    iget-object p3, p0, Lag/d;->c:Ljava/lang/Integer;

    .line 11
    :cond_3
    invoke-virtual {p0}, Linet/ipaddr/ipv4/I;->p3()Linet/ipaddr/ipv4/e;

    move-result-object v1

    .line 12
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v2

    .line 13
    invoke-virtual {p0}, Linet/ipaddr/ipv4/I;->u3()[Linet/ipaddr/ipv4/M;

    move-result-object v3

    .line 14
    invoke-virtual {p0}, Linet/ipaddr/ipv4/I;->m0()I

    move-result v4

    .line 15
    invoke-virtual {p0}, Linet/ipaddr/ipv4/I;->e0()I

    move-result v5

    .line 16
    invoke-virtual {v1}, Linet/ipaddr/ipv4/e;->d0()Linet/ipaddr/ipv4/e$a;

    move-result-object v6

    if-nez p4, :cond_4

    .line 17
    invoke-static {p1, p3, v1, v0}, Linet/ipaddr/j;->l2([Linet/ipaddr/k;Ljava/lang/Integer;Linet/ipaddr/i;Z)Z

    move-result p1

    if-eqz p1, :cond_4

    new-instance p1, Linet/ipaddr/ipv4/n;

    invoke-direct {p1}, Linet/ipaddr/ipv4/n;-><init>()V

    :goto_2
    move-object v7, p1

    goto :goto_3

    :cond_4
    new-instance p1, Linet/ipaddr/ipv4/o;

    invoke-direct {p1}, Linet/ipaddr/ipv4/o;-><init>()V

    goto :goto_2

    .line 18
    :goto_3
    invoke-static/range {v1 .. v7}, Lbg/d;->D1(Linet/ipaddr/c;I[LZf/d;IILinet/ipaddr/c$a;Ljava/util/function/BiFunction;)[LZf/d;

    .line 19
    :cond_5
    iput-object p3, p0, Lag/d;->c:Ljava/lang/Integer;

    goto :goto_4

    .line 20
    :cond_6
    new-instance p1, Linet/ipaddr/PrefixLenException;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-direct {p1, p2}, Linet/ipaddr/PrefixLenException;-><init>(I)V

    throw p1

    :cond_7
    :goto_4
    return-void
.end method

.method constructor <init>([Linet/ipaddr/ipv4/M;ZZ)V
    .locals 3

    const/4 v0, 0x1

    .line 22
    invoke-direct {p0, p1, p2, v0}, Linet/ipaddr/j;-><init>([Linet/ipaddr/k;ZZ)V

    if-eqz p3, :cond_0

    .line 23
    invoke-virtual {p0}, Lag/d;->i()Z

    move-result p2

    if-eqz p2, :cond_0

    .line 24
    invoke-virtual {p0}, Lbg/f;->F0()Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-virtual {p0}, Linet/ipaddr/ipv4/I;->u3()[Linet/ipaddr/ipv4/M;

    move-result-object p3

    new-instance v1, Linet/ipaddr/ipv4/f;

    invoke-direct {v1}, Linet/ipaddr/ipv4/f;-><init>()V

    const/16 v2, 0x8

    invoke-static {p2, p3, v2, v0, v1}, Lbg/d;->A1(I[Linet/ipaddr/k;IILjava/util/function/Function;)V

    .line 25
    :cond_0
    array-length p2, p1

    const/4 p3, 0x4

    if-gt p2, p3, :cond_1

    return-void

    .line 26
    :cond_1
    new-instance p2, Linet/ipaddr/AddressValueException;

    array-length p1, p1

    int-to-long v0, p1

    invoke-direct {p2, v0, v1}, Linet/ipaddr/AddressValueException;-><init>(J)V

    throw p2
.end method

.method private A3(Ljava/util/function/Predicate;)Ljava/util/Iterator;
    .locals 5

    invoke-virtual {p0}, Linet/ipaddr/ipv4/I;->p3()Linet/ipaddr/ipv4/e;

    move-result-object v0

    invoke-virtual {v0}, Linet/ipaddr/ipv4/e;->d()Linet/ipaddr/c$b;

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

    invoke-virtual {p0}, Linet/ipaddr/ipv4/I;->u3()[Linet/ipaddr/ipv4/M;

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
    invoke-direct {p0}, Linet/ipaddr/ipv4/I;->i3()Linet/ipaddr/ipv4/e$a;

    move-result-object v4

    if-eqz v1, :cond_4

    move-object p1, v2

    goto :goto_3

    :cond_4
    invoke-direct {p0, p1}, Linet/ipaddr/ipv4/I;->b4(Ljava/util/function/Predicate;)Ljava/util/Iterator;

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

.method private static synthetic B3(Linet/ipaddr/ipv4/b;I)I
    .locals 0

    invoke-virtual {p0, p1}, Linet/ipaddr/ipv4/b;->G1(I)Linet/ipaddr/ipv4/M;

    move-result-object p0

    invoke-virtual {p0}, Linet/ipaddr/k;->Q()I

    move-result p0

    return p0
.end method

.method private synthetic C3(I[Linet/ipaddr/ipv4/M;)Z
    .locals 0

    invoke-virtual {p0, p2, p1}, Linet/ipaddr/ipv4/I;->y3([Linet/ipaddr/ipv4/M;I)Z

    move-result p1

    return p1
.end method

.method private synthetic D3(ZI)Linet/ipaddr/ipv4/M;
    .locals 0

    if-eqz p1, :cond_0

    invoke-virtual {p0, p2}, Linet/ipaddr/ipv4/I;->r3(I)Linet/ipaddr/ipv4/M;

    move-result-object p1

    invoke-virtual {p1}, Linet/ipaddr/ipv4/M;->c3()Linet/ipaddr/ipv4/M;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p2}, Linet/ipaddr/ipv4/I;->r3(I)Linet/ipaddr/ipv4/M;

    move-result-object p1

    invoke-virtual {p1}, Linet/ipaddr/ipv4/M;->f3()Linet/ipaddr/ipv4/M;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method private synthetic E3()[Linet/ipaddr/ipv4/M;
    .locals 1

    invoke-virtual {p0}, Linet/ipaddr/ipv4/I;->m3()Linet/ipaddr/ipv4/I;

    move-result-object v0

    invoke-virtual {v0}, Linet/ipaddr/ipv4/I;->u3()[Linet/ipaddr/ipv4/M;

    move-result-object v0

    return-object v0
.end method

.method private synthetic F3(ZI)Ljava/util/Iterator;
    .locals 0

    invoke-virtual {p0, p2}, Linet/ipaddr/ipv4/I;->r3(I)Linet/ipaddr/ipv4/M;

    move-result-object p2

    xor-int/lit8 p1, p1, 0x1

    invoke-virtual {p2, p1}, Linet/ipaddr/ipv4/M;->g3(Z)Ljava/util/Iterator;

    move-result-object p1

    return-object p1
.end method

.method public static synthetic G2(Linet/ipaddr/ipv4/I;)[Linet/ipaddr/ipv4/M;
    .locals 0

    invoke-direct {p0}, Linet/ipaddr/ipv4/I;->H3()[Linet/ipaddr/ipv4/M;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic G3(Linet/ipaddr/ipv4/I;I)I
    .locals 0

    invoke-virtual {p0, p1}, Linet/ipaddr/ipv4/I;->r3(I)Linet/ipaddr/ipv4/M;

    move-result-object p0

    invoke-virtual {p0}, Linet/ipaddr/k;->Q()I

    move-result p0

    return p0
.end method

.method public static synthetic H2(Linet/ipaddr/ipv4/I;ZI)Ljava/util/Iterator;
    .locals 0

    invoke-direct {p0, p1, p2}, Linet/ipaddr/ipv4/I;->F3(ZI)Ljava/util/Iterator;

    move-result-object p0

    return-object p0
.end method

.method private synthetic H3()[Linet/ipaddr/ipv4/M;
    .locals 1

    invoke-virtual {p0}, Linet/ipaddr/ipv4/I;->m3()Linet/ipaddr/ipv4/I;

    move-result-object v0

    invoke-virtual {v0}, Linet/ipaddr/ipv4/I;->t3()[Linet/ipaddr/ipv4/M;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic I2(Linet/ipaddr/ipv4/e$a;Ljava/lang/Integer;[Linet/ipaddr/ipv4/M;)Linet/ipaddr/ipv4/I;
    .locals 0

    invoke-static {p0, p1, p2}, Linet/ipaddr/ipv4/I;->V3(Linet/ipaddr/ipv4/e$a;Ljava/lang/Integer;[Linet/ipaddr/ipv4/M;)Linet/ipaddr/ipv4/I;

    move-result-object p0

    return-object p0
.end method

.method private synthetic I3(ZI)Ljava/util/Iterator;
    .locals 0

    invoke-virtual {p0, p2}, Linet/ipaddr/ipv4/I;->r3(I)Linet/ipaddr/ipv4/M;

    move-result-object p2

    xor-int/lit8 p1, p1, 0x1

    invoke-virtual {p2, p1}, Linet/ipaddr/ipv4/M;->g3(Z)Ljava/util/Iterator;

    move-result-object p1

    return-object p1
.end method

.method public static synthetic J2(Linet/ipaddr/ipv4/I;Ljava/lang/Integer;ZZLinet/ipaddr/ipv4/b;)Ljava/util/Iterator;
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Linet/ipaddr/ipv4/I;->L3(Ljava/lang/Integer;ZZLinet/ipaddr/ipv4/b;)Ljava/util/Iterator;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic J3(ILjava/lang/Integer;Linet/ipaddr/ipv4/b;)J
    .locals 2

    invoke-virtual {p2}, Linet/ipaddr/ipv4/b;->F1()Linet/ipaddr/ipv4/I;

    move-result-object v0

    invoke-static {v0, p0}, Lbg/d;->y1(LZf/c;I)J

    move-result-wide v0

    invoke-virtual {p2}, Linet/ipaddr/ipv4/b;->F1()Linet/ipaddr/ipv4/I;

    move-result-object p2

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {p2, p1, p0}, Linet/ipaddr/j;->x2(II)J

    move-result-wide p0

    sub-long/2addr v0, p0

    return-wide v0
.end method

.method public static synthetic K2(Linet/ipaddr/ipv4/e$a;Ljava/lang/Integer;IILag/d$e;)Z
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Linet/ipaddr/ipv4/I;->P3(Linet/ipaddr/ipv4/e$a;Ljava/lang/Integer;IILag/d$e;)Z

    move-result p0

    return p0
.end method

.method private synthetic K3(Ljava/lang/Integer;[Linet/ipaddr/ipv4/M;)Z
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {p0, p2, p1}, Linet/ipaddr/ipv4/I;->y3([Linet/ipaddr/ipv4/M;I)Z

    move-result p1

    return p1
.end method

.method public static synthetic L2(Linet/ipaddr/ipv4/I;Ljava/lang/Integer;[Linet/ipaddr/ipv4/M;)Z
    .locals 0

    invoke-direct {p0, p1, p2}, Linet/ipaddr/ipv4/I;->K3(Ljava/lang/Integer;[Linet/ipaddr/ipv4/M;)Z

    move-result p0

    return p0
.end method

.method private synthetic L3(Ljava/lang/Integer;ZZLinet/ipaddr/ipv4/b;)Ljava/util/Iterator;
    .locals 1

    invoke-virtual {p4}, Linet/ipaddr/ipv4/b;->F1()Linet/ipaddr/ipv4/I;

    move-result-object p2

    invoke-virtual {p4}, Linet/ipaddr/ipv4/b;->y1()Linet/ipaddr/ipv4/e$a;

    move-result-object p3

    new-instance v0, Linet/ipaddr/ipv4/t;

    invoke-direct {v0, p0, p1}, Linet/ipaddr/ipv4/t;-><init>(Linet/ipaddr/ipv4/I;Ljava/lang/Integer;)V

    invoke-virtual {p2, p4, p3, v0}, Linet/ipaddr/ipv4/I;->z3(Linet/ipaddr/ipv4/b;Lbg/a;Ljava/util/function/Predicate;)Ljava/util/Iterator;

    move-result-object p1

    return-object p1
.end method

.method public static synthetic M2(Linet/ipaddr/ipv4/I;I)I
    .locals 0

    invoke-static {p0, p1}, Linet/ipaddr/ipv4/I;->G3(Linet/ipaddr/ipv4/I;I)I

    move-result p0

    return p0
.end method

.method private static synthetic M3(ILinet/ipaddr/ipv4/b;)J
    .locals 0

    invoke-virtual {p1}, Linet/ipaddr/ipv4/b;->F1()Linet/ipaddr/ipv4/I;

    move-result-object p1

    invoke-static {p1, p0}, Lbg/d;->y1(LZf/c;I)J

    move-result-wide p0

    return-wide p0
.end method

.method public static synthetic N2(ZZLinet/ipaddr/ipv4/b;)Ljava/util/Iterator;
    .locals 0

    invoke-static {p0, p1, p2}, Linet/ipaddr/ipv4/I;->N3(ZZLinet/ipaddr/ipv4/b;)Ljava/util/Iterator;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic N3(ZZLinet/ipaddr/ipv4/b;)Ljava/util/Iterator;
    .locals 0

    invoke-virtual {p2}, Linet/ipaddr/ipv4/b;->iterator()Ljava/util/Iterator;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O2(Linet/ipaddr/ipv4/e$a;Ljava/lang/Integer;[Linet/ipaddr/ipv4/M;)Linet/ipaddr/ipv4/b;
    .locals 0

    invoke-static {p0, p1, p2}, Linet/ipaddr/ipv4/I;->O3(Linet/ipaddr/ipv4/e$a;Ljava/lang/Integer;[Linet/ipaddr/ipv4/M;)Linet/ipaddr/ipv4/b;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic O3(Linet/ipaddr/ipv4/e$a;Ljava/lang/Integer;[Linet/ipaddr/ipv4/M;)Linet/ipaddr/ipv4/b;
    .locals 0

    invoke-static {p2, p0, p1}, Lbg/d;->j1([LZf/d;Lbg/a;Ljava/lang/Integer;)Linet/ipaddr/a;

    move-result-object p0

    check-cast p0, Linet/ipaddr/ipv4/b;

    return-object p0
.end method

.method public static synthetic P2(ZZLinet/ipaddr/ipv4/I;)Ljava/util/Iterator;
    .locals 0

    invoke-static {p0, p1, p2}, Linet/ipaddr/ipv4/I;->U3(ZZLinet/ipaddr/ipv4/I;)Ljava/util/Iterator;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic P3(Linet/ipaddr/ipv4/e$a;Ljava/lang/Integer;IILag/d$e;)Z
    .locals 7

    new-instance v1, Linet/ipaddr/ipv4/v;

    invoke-direct {v1, p0, p1}, Linet/ipaddr/ipv4/v;-><init>(Linet/ipaddr/ipv4/e$a;Ljava/lang/Integer;)V

    invoke-interface {p4}, Lag/d$e;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Linet/ipaddr/ipv4/b;

    invoke-virtual {v0}, Linet/ipaddr/ipv4/b;->F1()Linet/ipaddr/ipv4/I;

    move-result-object v0

    invoke-virtual {v0}, Linet/ipaddr/ipv4/I;->u3()[Linet/ipaddr/ipv4/M;

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

.method public static synthetic Q2(Linet/ipaddr/ipv4/I;Ljava/lang/Integer;ZZLinet/ipaddr/ipv4/I;)Ljava/util/Iterator;
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Linet/ipaddr/ipv4/I;->S3(Ljava/lang/Integer;ZZLinet/ipaddr/ipv4/I;)Ljava/util/Iterator;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic Q3(ILjava/lang/Integer;Linet/ipaddr/ipv4/I;)J
    .locals 2

    invoke-static {p2, p0}, Lbg/d;->y1(LZf/c;I)J

    move-result-wide v0

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {p2, p1, p0}, Linet/ipaddr/j;->x2(II)J

    move-result-wide p0

    sub-long/2addr v0, p0

    return-wide v0
.end method

.method public static synthetic R2(ILjava/lang/Integer;Linet/ipaddr/ipv4/I;)J
    .locals 0

    invoke-static {p0, p1, p2}, Linet/ipaddr/ipv4/I;->Q3(ILjava/lang/Integer;Linet/ipaddr/ipv4/I;)J

    move-result-wide p0

    return-wide p0
.end method

.method private synthetic R3(Ljava/lang/Integer;[Linet/ipaddr/ipv4/M;)Z
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {p0, p2, p1}, Linet/ipaddr/ipv4/I;->y3([Linet/ipaddr/ipv4/M;I)Z

    move-result p1

    return p1
.end method

.method public static synthetic S2(Linet/ipaddr/ipv4/I;ZI)Linet/ipaddr/ipv4/M;
    .locals 0

    invoke-direct {p0, p1, p2}, Linet/ipaddr/ipv4/I;->D3(ZI)Linet/ipaddr/ipv4/M;

    move-result-object p0

    return-object p0
.end method

.method private synthetic S3(Ljava/lang/Integer;ZZLinet/ipaddr/ipv4/I;)Ljava/util/Iterator;
    .locals 0

    new-instance p2, Linet/ipaddr/ipv4/x;

    invoke-direct {p2, p0, p1}, Linet/ipaddr/ipv4/x;-><init>(Linet/ipaddr/ipv4/I;Ljava/lang/Integer;)V

    invoke-direct {p4, p2}, Linet/ipaddr/ipv4/I;->A3(Ljava/util/function/Predicate;)Ljava/util/Iterator;

    move-result-object p1

    return-object p1
.end method

.method public static synthetic T2(Linet/ipaddr/ipv4/e$a;Ljava/lang/Integer;IILag/d$e;)Z
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Linet/ipaddr/ipv4/I;->W3(Linet/ipaddr/ipv4/e$a;Ljava/lang/Integer;IILag/d$e;)Z

    move-result p0

    return p0
.end method

.method private static synthetic T3(ILinet/ipaddr/ipv4/I;)J
    .locals 0

    invoke-static {p1, p0}, Lbg/d;->y1(LZf/c;I)J

    move-result-wide p0

    return-wide p0
.end method

.method public static synthetic U2(Linet/ipaddr/ipv4/I;ZI)Ljava/util/Iterator;
    .locals 0

    invoke-direct {p0, p1, p2}, Linet/ipaddr/ipv4/I;->I3(ZI)Ljava/util/Iterator;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic U3(ZZLinet/ipaddr/ipv4/I;)Ljava/util/Iterator;
    .locals 0

    invoke-virtual {p2}, Linet/ipaddr/ipv4/I;->iterator()Ljava/util/Iterator;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic V2(Linet/ipaddr/ipv4/I;I[Linet/ipaddr/ipv4/M;)Z
    .locals 0

    invoke-direct {p0, p1, p2}, Linet/ipaddr/ipv4/I;->C3(I[Linet/ipaddr/ipv4/M;)Z

    move-result p0

    return p0
.end method

.method private static synthetic V3(Linet/ipaddr/ipv4/e$a;Ljava/lang/Integer;[Linet/ipaddr/ipv4/M;)Linet/ipaddr/ipv4/I;
    .locals 0

    invoke-static {p2, p0, p1}, Lbg/d;->k1([LZf/d;Lbg/a;Ljava/lang/Integer;)LZf/c;

    move-result-object p0

    check-cast p0, Linet/ipaddr/ipv4/I;

    return-object p0
.end method

.method public static synthetic W2(Linet/ipaddr/ipv4/b;I)I
    .locals 0

    invoke-static {p0, p1}, Linet/ipaddr/ipv4/I;->B3(Linet/ipaddr/ipv4/b;I)I

    move-result p0

    return p0
.end method

.method private static synthetic W3(Linet/ipaddr/ipv4/e$a;Ljava/lang/Integer;IILag/d$e;)Z
    .locals 7

    new-instance v1, Linet/ipaddr/ipv4/z;

    invoke-direct {v1, p0, p1}, Linet/ipaddr/ipv4/z;-><init>(Linet/ipaddr/ipv4/e$a;Ljava/lang/Integer;)V

    invoke-interface {p4}, Lag/d$e;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Linet/ipaddr/ipv4/I;

    invoke-virtual {v0}, Linet/ipaddr/ipv4/I;->u3()[Linet/ipaddr/ipv4/M;

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

.method public static synthetic X2(ILinet/ipaddr/ipv4/I;)J
    .locals 0

    invoke-static {p0, p1}, Linet/ipaddr/ipv4/I;->T3(ILinet/ipaddr/ipv4/I;)J

    move-result-wide p0

    return-wide p0
.end method

.method private synthetic X3(Ljava/lang/Integer;I)Linet/ipaddr/ipv4/M;
    .locals 1

    invoke-virtual {p0, p2}, Linet/ipaddr/ipv4/I;->r3(I)Linet/ipaddr/ipv4/M;

    move-result-object p2

    const/4 v0, 0x1

    invoke-virtual {p2, p1, v0}, Linet/ipaddr/ipv4/M;->m3(Ljava/lang/Integer;Z)Linet/ipaddr/ipv4/M;

    move-result-object p1

    return-object p1
.end method

.method public static synthetic Y2(Linet/ipaddr/ipv4/I;Ljava/lang/Integer;[Linet/ipaddr/ipv4/M;)Z
    .locals 0

    invoke-direct {p0, p1, p2}, Linet/ipaddr/ipv4/I;->R3(Ljava/lang/Integer;[Linet/ipaddr/ipv4/M;)Z

    move-result p0

    return p0
.end method

.method public static synthetic Z2(Linet/ipaddr/ipv4/I;Ljava/lang/Integer;I)Linet/ipaddr/ipv4/M;
    .locals 0

    invoke-direct {p0, p1, p2}, Linet/ipaddr/ipv4/I;->X3(Ljava/lang/Integer;I)Linet/ipaddr/ipv4/M;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic a3(ILinet/ipaddr/ipv4/b;)J
    .locals 0

    invoke-static {p0, p1}, Linet/ipaddr/ipv4/I;->M3(ILinet/ipaddr/ipv4/b;)J

    move-result-wide p0

    return-wide p0
.end method

.method public static synthetic b3(Linet/ipaddr/ipv4/I;)[Linet/ipaddr/ipv4/M;
    .locals 0

    invoke-direct {p0}, Linet/ipaddr/ipv4/I;->E3()[Linet/ipaddr/ipv4/M;

    move-result-object p0

    return-object p0
.end method

.method private b4(Ljava/util/function/Predicate;)Ljava/util/Iterator;
    .locals 5

    invoke-virtual {p0}, Linet/ipaddr/ipv4/I;->p3()Linet/ipaddr/ipv4/e;

    move-result-object v0

    invoke-virtual {v0}, Linet/ipaddr/ipv4/e;->d()Linet/ipaddr/c$b;

    move-result-object v0

    invoke-virtual {v0}, Linet/ipaddr/c$b;->allPrefixedAddressesAreSubnets()Z

    move-result v0

    invoke-virtual {p0}, Linet/ipaddr/j;->Z()I

    move-result v1

    invoke-direct {p0}, Linet/ipaddr/ipv4/I;->s3()Linet/ipaddr/ipv4/e$a;

    move-result-object v2

    invoke-virtual {p0}, Lag/d;->A0()Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x0

    goto :goto_0

    :cond_0
    new-instance v3, Linet/ipaddr/ipv4/D;

    invoke-direct {v3, p0}, Linet/ipaddr/ipv4/D;-><init>(Linet/ipaddr/ipv4/I;)V

    :goto_0
    new-instance v4, Linet/ipaddr/ipv4/E;

    invoke-direct {v4, p0, v0}, Linet/ipaddr/ipv4/E;-><init>(Linet/ipaddr/ipv4/I;Z)V

    invoke-static {v1, v2, v3, v4, p1}, Lbg/d;->B1(ILinet/ipaddr/c$a;Ljava/util/function/Supplier;Ljava/util/function/IntFunction;Ljava/util/function/Predicate;)Ljava/util/Iterator;

    move-result-object p1

    return-object p1
.end method

.method public static synthetic c3(ILjava/lang/Integer;Linet/ipaddr/ipv4/b;)J
    .locals 0

    invoke-static {p0, p1, p2}, Linet/ipaddr/ipv4/I;->J3(ILjava/lang/Integer;Linet/ipaddr/ipv4/b;)J

    move-result-wide p0

    return-wide p0
.end method

.method private f3(Z)I
    .locals 5

    invoke-virtual {p0}, Linet/ipaddr/j;->Z()I

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    invoke-virtual {p0, v1}, Linet/ipaddr/ipv4/I;->r3(I)Linet/ipaddr/ipv4/M;

    move-result-object v1

    if-eqz p1, :cond_0

    invoke-virtual {v1}, Linet/ipaddr/k;->Q()I

    move-result v1

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Linet/ipaddr/k;->w0()I

    move-result v1

    :goto_0
    const/4 v2, 0x1

    if-eq v0, v2, :cond_2

    invoke-virtual {p0}, Linet/ipaddr/ipv4/I;->m0()I

    move-result v3

    :goto_1
    if-ge v2, v0, :cond_2

    invoke-virtual {p0, v2}, Linet/ipaddr/ipv4/I;->r3(I)Linet/ipaddr/ipv4/M;

    move-result-object v4

    shl-int/2addr v1, v3

    if-eqz p1, :cond_1

    invoke-virtual {v4}, Linet/ipaddr/k;->Q()I

    move-result v4

    goto :goto_2

    :cond_1
    invoke-virtual {v4}, Linet/ipaddr/k;->w0()I

    move-result v4

    :goto_2
    or-int/2addr v1, v4

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_2
    return v1
.end method

.method private h3()Ljava/util/function/Predicate;
    .locals 2

    invoke-virtual {p0}, Lag/d;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lbg/f;->F0()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    new-instance v1, Linet/ipaddr/ipv4/u;

    invoke-direct {v1, p0, v0}, Linet/ipaddr/ipv4/u;-><init>(Linet/ipaddr/ipv4/I;I)V

    return-object v1

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method private i3()Linet/ipaddr/ipv4/e$a;
    .locals 1

    invoke-direct {p0}, Linet/ipaddr/ipv4/I;->k3()Linet/ipaddr/ipv4/e$a;

    move-result-object v0

    return-object v0
.end method

.method private k3()Linet/ipaddr/ipv4/e$a;
    .locals 1

    invoke-virtual {p0}, Linet/ipaddr/ipv4/I;->p3()Linet/ipaddr/ipv4/e;

    move-result-object v0

    invoke-virtual {v0}, Linet/ipaddr/ipv4/e;->d0()Linet/ipaddr/ipv4/e$a;

    move-result-object v0

    return-object v0
.end method

.method private l3(Z)I
    .locals 1

    if-eqz p1, :cond_1

    iget-object p1, p0, Linet/ipaddr/ipv4/I;->t:Ljava/lang/Integer;

    if-nez p1, :cond_0

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Linet/ipaddr/ipv4/I;->f3(Z)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Linet/ipaddr/ipv4/I;->t:Ljava/lang/Integer;

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    invoke-direct {p0, p1}, Linet/ipaddr/ipv4/I;->f3(Z)I

    move-result p1

    :goto_0
    return p1
.end method

.method private o3(ZZ)Linet/ipaddr/ipv4/I;
    .locals 11

    invoke-static {p0}, Lbg/d;->t1(LZf/e;)LZf/e;

    move-result-object v0

    check-cast v0, Linet/ipaddr/ipv4/I;

    if-nez v0, :cond_c

    iget-object v1, p0, Linet/ipaddr/ipv4/I;->s:Lbg/d$g;

    if-eqz v1, :cond_2

    if-eqz p1, :cond_1

    if-eqz p2, :cond_0

    iget-object v0, v1, Lbg/d$g;->b:LZf/e;

    check-cast v0, Linet/ipaddr/ipv4/I;

    if-nez v0, :cond_d

    iget-boolean v1, v1, Lbg/d$g;->d:Z

    if-nez v1, :cond_d

    goto :goto_0

    :cond_0
    iget-object v0, v1, Lbg/d$g;->a:LZf/e;

    check-cast v0, Linet/ipaddr/ipv4/I;

    if-nez v0, :cond_d

    goto :goto_0

    :cond_1
    iget-object v0, v1, Lbg/d$g;->c:LZf/e;

    check-cast v0, Linet/ipaddr/ipv4/I;

    if-nez v0, :cond_d

    :cond_2
    :goto_0
    monitor-enter p0

    :try_start_0
    iget-object v1, p0, Linet/ipaddr/ipv4/I;->s:Lbg/d$g;

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

    iput-object v1, p0, Linet/ipaddr/ipv4/I;->s:Lbg/d$g;

    goto :goto_3

    :catchall_0
    move-exception p1

    goto :goto_5

    :cond_4
    if-eqz p1, :cond_7

    if-eqz p2, :cond_6

    iget-object v0, v1, Lbg/d$g;->b:LZf/e;

    check-cast v0, Linet/ipaddr/ipv4/I;

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

    check-cast v0, Linet/ipaddr/ipv4/I;

    if-nez v0, :cond_5

    goto :goto_2

    :cond_7
    iget-object v0, v1, Lbg/d$g;->c:LZf/e;

    check-cast v0, Linet/ipaddr/ipv4/I;

    if-nez v0, :cond_5

    goto :goto_2

    :goto_3
    if-eqz v4, :cond_b

    invoke-direct {p0}, Linet/ipaddr/ipv4/I;->i3()Linet/ipaddr/ipv4/e$a;

    move-result-object v6

    new-instance v7, Linet/ipaddr/ipv4/p;

    invoke-direct {v7, p0}, Linet/ipaddr/ipv4/p;-><init>(Linet/ipaddr/ipv4/I;)V

    new-instance v8, Linet/ipaddr/ipv4/r;

    invoke-direct {v8, p0, p1}, Linet/ipaddr/ipv4/r;-><init>(Linet/ipaddr/ipv4/I;Z)V

    move-object v5, p0

    move v9, p1

    move v10, p2

    invoke-static/range {v5 .. v10}, Linet/ipaddr/j;->X1(Linet/ipaddr/j;Linet/ipaddr/i$a;Ljava/util/function/Supplier;Ljava/util/function/IntFunction;ZZ)Linet/ipaddr/j;

    move-result-object v0

    check-cast v0, Linet/ipaddr/ipv4/I;

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

.method protected static s(I)Ljava/lang/Integer;
    .locals 0

    invoke-static {p0}, Linet/ipaddr/j;->s(I)Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method

.method private s3()Linet/ipaddr/ipv4/e$a;
    .locals 1

    invoke-direct {p0}, Linet/ipaddr/ipv4/I;->k3()Linet/ipaddr/ipv4/e$a;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public bridge synthetic G1(I)Lbg/e;
    .locals 0

    invoke-virtual {p0, p1}, Linet/ipaddr/ipv4/I;->j3(I)Linet/ipaddr/ipv4/M;

    move-result-object p1

    return-object p1
.end method

.method public V()Ljava/lang/String;
    .locals 2

    invoke-virtual {p0}, Linet/ipaddr/ipv4/I;->w3()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Linet/ipaddr/ipv4/I;->r:Linet/ipaddr/ipv4/I$c;

    iget-object v0, v0, Linet/ipaddr/j$b;->b:Ljava/lang/String;

    if-nez v0, :cond_1

    :cond_0
    iget-object v0, p0, Linet/ipaddr/ipv4/I;->r:Linet/ipaddr/ipv4/I$c;

    sget-object v1, Linet/ipaddr/ipv4/I$c;->k:Linet/ipaddr/j$c;

    invoke-virtual {p0, v1}, Linet/ipaddr/j;->D2(Linet/ipaddr/j$c;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Linet/ipaddr/j$b;->b:Ljava/lang/String;

    move-object v0, v1

    :cond_1
    return-object v0
.end method

.method public bridge synthetic V0(I)Lag/b;
    .locals 0

    invoke-virtual {p0, p1}, Linet/ipaddr/ipv4/I;->j3(I)Linet/ipaddr/ipv4/M;

    move-result-object p1

    return-object p1
.end method

.method public X()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Linet/ipaddr/ipv4/I;->V()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public Y()Ljava/lang/String;
    .locals 2

    invoke-virtual {p0}, Linet/ipaddr/ipv4/I;->w3()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Linet/ipaddr/ipv4/I;->r:Linet/ipaddr/ipv4/I$c;

    iget-object v0, v0, Lbg/d$h;->a:Ljava/lang/String;

    if-nez v0, :cond_1

    :cond_0
    iget-object v0, p0, Linet/ipaddr/ipv4/I;->r:Linet/ipaddr/ipv4/I$c;

    sget-object v1, Linet/ipaddr/ipv4/I$c;->o:Linet/ipaddr/j$c;

    invoke-virtual {p0, v1}, Linet/ipaddr/j;->D2(Linet/ipaddr/j$c;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lbg/d$h;->a:Ljava/lang/String;

    move-object v0, v1

    :cond_1
    return-object v0
.end method

.method public Y3()J
    .locals 4

    invoke-virtual {p0}, Linet/ipaddr/ipv4/I;->x3()I

    move-result v0

    int-to-long v0, v0

    const-wide v2, 0xffffffffL

    and-long/2addr v0, v2

    return-wide v0
.end method

.method protected Z1(I)Ljava/math/BigInteger;
    .locals 2

    invoke-virtual {p0}, Lag/d;->A0()Z

    move-result v0

    if-nez v0, :cond_0

    sget-object p1, Ljava/math/BigInteger;->ONE:Ljava/math/BigInteger;

    return-object p1

    :cond_0
    invoke-static {p0, p1}, Lbg/d;->y1(LZf/c;I)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object p1

    return-object p1
.end method

.method public Z3(Linet/ipaddr/ipv4/I;Z)Linet/ipaddr/ipv4/I;
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
    invoke-direct {p0}, Linet/ipaddr/ipv4/I;->i3()Linet/ipaddr/ipv4/e$a;

    move-result-object v2

    new-instance v4, Linet/ipaddr/ipv4/q;

    invoke-direct {v4, p0}, Linet/ipaddr/ipv4/q;-><init>(Linet/ipaddr/ipv4/I;)V

    new-instance v5, Linet/ipaddr/ipv4/w;

    invoke-direct {v5, p1}, Linet/ipaddr/ipv4/w;-><init>(Linet/ipaddr/ipv4/I;)V

    const/4 v6, 0x0

    const/4 v3, 0x1

    move-object v0, p0

    invoke-static/range {v0 .. v6}, Linet/ipaddr/j;->f2(Linet/ipaddr/j;Ljava/lang/Integer;Linet/ipaddr/i$a;ZLjava/util/function/IntFunction;Ljava/util/function/IntUnaryOperator;Z)Linet/ipaddr/j;

    move-result-object p1

    check-cast p1, Linet/ipaddr/ipv4/I;

    return-object p1
.end method

.method public a0()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Linet/ipaddr/ipv4/I;->Y()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic a2(I)Linet/ipaddr/k;
    .locals 0

    invoke-virtual {p0, p1}, Linet/ipaddr/ipv4/I;->j3(I)Linet/ipaddr/ipv4/M;

    move-result-object p1

    return-object p1
.end method

.method public a4(Z)Linet/ipaddr/ipv4/I;
    .locals 2

    invoke-direct {p0}, Linet/ipaddr/ipv4/I;->i3()Linet/ipaddr/ipv4/e$a;

    move-result-object v0

    new-instance v1, Linet/ipaddr/ipv4/s;

    invoke-direct {v1}, Linet/ipaddr/ipv4/s;-><init>()V

    invoke-static {p0, p1, v0, v1}, Linet/ipaddr/j;->y2(Linet/ipaddr/j;ZLinet/ipaddr/i$a;Linet/ipaddr/j$e;)Linet/ipaddr/j;

    move-result-object p1

    check-cast p1, Linet/ipaddr/ipv4/I;

    return-object p1
.end method

.method protected b0(Z)[B
    .locals 4

    invoke-virtual {p0}, Linet/ipaddr/j;->Z()I

    move-result v0

    new-array v1, v0, [B

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_1

    invoke-virtual {p0, v2}, Linet/ipaddr/ipv4/I;->r3(I)Linet/ipaddr/ipv4/M;

    move-result-object v3

    if-eqz p1, :cond_0

    invoke-virtual {v3}, Linet/ipaddr/k;->Q()I

    move-result v3

    goto :goto_1

    :cond_0
    invoke-virtual {v3}, Linet/ipaddr/k;->w0()I

    move-result v3

    :goto_1
    int-to-byte v3, v3

    aput-byte v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-object v1
.end method

.method protected c1(Lag/d;)Z
    .locals 1

    instance-of v0, p1, Linet/ipaddr/ipv4/I;

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

.method public c4()Ljava/util/Iterator;
    .locals 1

    invoke-direct {p0}, Linet/ipaddr/ipv4/I;->h3()Ljava/util/function/Predicate;

    move-result-object v0

    invoke-direct {p0, v0}, Linet/ipaddr/ipv4/I;->b4(Ljava/util/function/Predicate;)Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method

.method d3(Linet/ipaddr/ipv4/b;Linet/ipaddr/ipv4/b;Linet/ipaddr/ipv4/b;)V
    .locals 3

    if-nez p2, :cond_0

    if-eqz p3, :cond_8

    :cond_0
    invoke-static {p0}, Lbg/d;->t1(LZf/e;)LZf/e;

    move-result-object v0

    if-nez v0, :cond_8

    invoke-virtual {p0}, Linet/ipaddr/ipv4/I;->q3()Linet/ipaddr/ipv4/I;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz p2, :cond_1

    invoke-virtual {p2}, Linet/ipaddr/ipv4/b;->F1()Linet/ipaddr/ipv4/I;

    move-result-object v2

    goto :goto_0

    :cond_1
    move-object v2, v1

    :goto_0
    if-eqz p3, :cond_2

    invoke-virtual {p3}, Linet/ipaddr/ipv4/b;->F1()Linet/ipaddr/ipv4/I;

    move-result-object v1

    :cond_2
    invoke-virtual {v0, v2, v1}, Linet/ipaddr/ipv4/I;->e3(Linet/ipaddr/ipv4/I;Linet/ipaddr/ipv4/I;)V

    iget-object v0, p1, Linet/ipaddr/ipv4/b;->p:Linet/ipaddr/ipv4/I$b;

    if-eqz v0, :cond_4

    if-eqz p2, :cond_3

    iget-object v1, v0, Lbg/d$g;->a:LZf/e;

    if-eqz v1, :cond_4

    :cond_3
    if-eqz p3, :cond_8

    iget-object v0, v0, Lbg/d$g;->c:LZf/e;

    if-nez v0, :cond_8

    :cond_4
    monitor-enter p0

    :try_start_0
    iget-object v0, p1, Linet/ipaddr/ipv4/b;->p:Linet/ipaddr/ipv4/I$b;

    if-nez v0, :cond_5

    new-instance v0, Linet/ipaddr/ipv4/I$b;

    invoke-direct {v0}, Linet/ipaddr/ipv4/I$b;-><init>()V

    iput-object v0, p1, Linet/ipaddr/ipv4/b;->p:Linet/ipaddr/ipv4/I$b;

    iput-object p2, v0, Lbg/d$g;->a:LZf/e;

    iput-object p3, v0, Lbg/d$g;->c:LZf/e;

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_5
    iget-object p1, v0, Lbg/d$g;->a:LZf/e;

    if-nez p1, :cond_6

    iput-object p2, v0, Lbg/d$g;->a:LZf/e;

    :cond_6
    iget-object p1, v0, Lbg/d$g;->c:LZf/e;

    if-nez p1, :cond_7

    iput-object p3, v0, Lbg/d$g;->c:LZf/e;

    :cond_7
    :goto_1
    monitor-exit p0

    goto :goto_3

    :goto_2
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_8
    :goto_3
    return-void
.end method

.method public d4()Ldg/b;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Linet/ipaddr/ipv4/I;->f4(Z)Ldg/b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic e()Linet/ipaddr/c;
    .locals 1

    .line 1
    invoke-virtual {p0}, Linet/ipaddr/ipv4/I;->p3()Linet/ipaddr/ipv4/e;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic e()Linet/ipaddr/i;
    .locals 1

    .line 2
    invoke-virtual {p0}, Linet/ipaddr/ipv4/I;->p3()Linet/ipaddr/ipv4/e;

    move-result-object v0

    return-object v0
.end method

.method public e0()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method protected bridge synthetic e2()[Linet/ipaddr/k;
    .locals 1

    invoke-virtual {p0}, Linet/ipaddr/ipv4/I;->u3()[Linet/ipaddr/ipv4/M;

    move-result-object v0

    return-object v0
.end method

.method e3(Linet/ipaddr/ipv4/I;Linet/ipaddr/ipv4/I;)V
    .locals 2

    iget-object v0, p0, Linet/ipaddr/ipv4/I;->s:Lbg/d$g;

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
    iget-object v0, p0, Linet/ipaddr/ipv4/I;->s:Lbg/d$g;

    if-nez v0, :cond_3

    new-instance v0, Lbg/d$g;

    invoke-direct {v0}, Lbg/d$g;-><init>()V

    iput-object v0, p0, Linet/ipaddr/ipv4/I;->s:Lbg/d$g;

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

.method e4(Linet/ipaddr/ipv4/b;Linet/ipaddr/ipv4/e$a;Z)Ldg/b;
    .locals 9

    invoke-virtual {p0}, Linet/ipaddr/j;->Z()I

    move-result v0

    invoke-virtual {p0}, Lbg/f;->F0()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p0}, Linet/ipaddr/ipv4/I;->p3()Linet/ipaddr/ipv4/e;

    move-result-object v2

    invoke-virtual {v2}, Linet/ipaddr/ipv4/e;->d()Linet/ipaddr/c$b;

    move-result-object v2

    invoke-virtual {v2}, Linet/ipaddr/c$b;->allPrefixedAddressesAreSubnets()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {p1}, Linet/ipaddr/ipv4/b;->U1()Linet/ipaddr/ipv4/b;

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

    new-instance p1, Linet/ipaddr/ipv4/i;

    invoke-direct {p1, v0, v1}, Linet/ipaddr/ipv4/i;-><init>(ILjava/lang/Integer;)V

    new-instance p3, Linet/ipaddr/ipv4/j;

    invoke-direct {p3, p0, v1}, Linet/ipaddr/ipv4/j;-><init>(Linet/ipaddr/ipv4/I;Ljava/lang/Integer;)V

    :goto_1
    move-object v8, p1

    move-object v5, p3

    goto :goto_2

    :cond_1
    new-instance p1, Linet/ipaddr/ipv4/k;

    invoke-direct {p1, v0}, Linet/ipaddr/ipv4/k;-><init>(I)V

    new-instance p3, Linet/ipaddr/ipv4/l;

    invoke-direct {p3}, Linet/ipaddr/ipv4/l;-><init>()V

    goto :goto_1

    :goto_2
    add-int/lit8 p1, v0, -0x1

    new-instance v4, Linet/ipaddr/ipv4/m;

    invoke-direct {v4, p2, v2, p1, v0}, Linet/ipaddr/ipv4/m;-><init>(Linet/ipaddr/ipv4/e$a;Ljava/lang/Integer;II)V

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v3 .. v8}, Lag/d;->T(LZf/b;Ljava/util/function/Predicate;Lag/d$d;Ljava/util/function/Function;Ljava/util/function/Predicate;Ljava/util/function/ToLongFunction;)Ldg/b;

    move-result-object p1

    return-object p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    if-eq p1, p0, :cond_1

    instance-of v0, p1, Linet/ipaddr/ipv4/I;

    if-eqz v0, :cond_0

    check-cast p1, Linet/ipaddr/ipv4/I;

    invoke-virtual {p1, p0}, Linet/ipaddr/ipv4/I;->c1(Lag/d;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method public f()I
    .locals 1

    invoke-virtual {p0}, Linet/ipaddr/j;->Z()I

    move-result v0

    shl-int/lit8 v0, v0, 0x3

    return v0
.end method

.method f4(Z)Ldg/b;
    .locals 11

    invoke-virtual {p0}, Linet/ipaddr/j;->Z()I

    move-result v0

    invoke-virtual {p0}, Lbg/f;->F0()Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {p0}, Linet/ipaddr/ipv4/I;->i3()Linet/ipaddr/ipv4/e$a;

    move-result-object v2

    invoke-virtual {p0}, Linet/ipaddr/ipv4/I;->p3()Linet/ipaddr/ipv4/e;

    move-result-object v3

    invoke-virtual {v3}, Linet/ipaddr/ipv4/e;->d()Linet/ipaddr/c$b;

    move-result-object v3

    invoke-virtual {v3}, Linet/ipaddr/c$b;->allPrefixedAddressesAreSubnets()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {p0}, Linet/ipaddr/ipv4/I;->i4()Linet/ipaddr/ipv4/I;

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

    new-instance p1, Linet/ipaddr/ipv4/F;

    invoke-direct {p1, v0, v1}, Linet/ipaddr/ipv4/F;-><init>(ILjava/lang/Integer;)V

    new-instance v3, Linet/ipaddr/ipv4/G;

    invoke-direct {v3, p0, v1}, Linet/ipaddr/ipv4/G;-><init>(Linet/ipaddr/ipv4/I;Ljava/lang/Integer;)V

    move-object v10, p1

    move-object v7, v3

    goto :goto_1

    :cond_1
    new-instance p1, Linet/ipaddr/ipv4/H;

    invoke-direct {p1, v0}, Linet/ipaddr/ipv4/H;-><init>(I)V

    new-instance v1, Linet/ipaddr/ipv4/g;

    invoke-direct {v1}, Linet/ipaddr/ipv4/g;-><init>()V

    move-object v10, p1

    move-object v7, v1

    :goto_1
    add-int/lit8 p1, v0, -0x1

    new-instance v6, Linet/ipaddr/ipv4/h;

    invoke-direct {v6, v2, v4, p1, v0}, Linet/ipaddr/ipv4/h;-><init>(Linet/ipaddr/ipv4/e$a;Ljava/lang/Integer;II)V

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v5 .. v10}, Lag/d;->T(LZf/b;Ljava/util/function/Predicate;Lag/d$d;Ljava/util/function/Function;Ljava/util/function/Predicate;Ljava/util/function/ToLongFunction;)Ldg/b;

    move-result-object p1

    return-object p1
.end method

.method protected g1(Ljava/net/InetAddress;)V
    .locals 0

    invoke-super {p0, p1}, Lag/d;->g1(Ljava/net/InetAddress;)V

    return-void
.end method

.method g3(Z)Linet/ipaddr/ipv4/I;
    .locals 10

    invoke-virtual {p0}, Lbg/f;->F0()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p0}, Linet/ipaddr/ipv4/I;->p3()Linet/ipaddr/ipv4/e;

    move-result-object v1

    invoke-virtual {v1, v0}, Linet/ipaddr/i;->r(I)Linet/ipaddr/g;

    move-result-object v2

    check-cast v2, Linet/ipaddr/ipv4/b;

    invoke-virtual {v1}, Linet/ipaddr/ipv4/e;->d()Linet/ipaddr/c$b;

    move-result-object v1

    invoke-virtual {v1}, Linet/ipaddr/c$b;->allPrefixedAddressesAreSubnets()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, 0x0

    :goto_0
    move-object v4, v0

    goto :goto_1

    :cond_0
    invoke-static {v0}, Linet/ipaddr/ipv4/I;->s(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_0

    :goto_1
    invoke-direct {p0}, Linet/ipaddr/ipv4/I;->i3()Linet/ipaddr/ipv4/e$a;

    move-result-object v5

    xor-int/lit8 v6, p1, 0x1

    new-instance v7, Linet/ipaddr/ipv4/q;

    invoke-direct {v7, p0}, Linet/ipaddr/ipv4/q;-><init>(Linet/ipaddr/ipv4/I;)V

    new-instance v8, Linet/ipaddr/ipv4/A;

    invoke-direct {v8, v2}, Linet/ipaddr/ipv4/A;-><init>(Linet/ipaddr/ipv4/b;)V

    const/4 v9, 0x1

    move-object v3, p0

    invoke-static/range {v3 .. v9}, Linet/ipaddr/j;->f2(Linet/ipaddr/j;Ljava/lang/Integer;Linet/ipaddr/i$a;ZLjava/util/function/IntFunction;Ljava/util/function/IntUnaryOperator;Z)Linet/ipaddr/j;

    move-result-object p1

    check-cast p1, Linet/ipaddr/ipv4/I;

    return-object p1
.end method

.method public g4()Linet/ipaddr/ipv4/I;
    .locals 2

    invoke-virtual {p0}, Lbg/f;->F0()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Linet/ipaddr/ipv4/I;->p3()Linet/ipaddr/ipv4/e;

    move-result-object v1

    invoke-virtual {v1}, Linet/ipaddr/ipv4/e;->d()Linet/ipaddr/c$b;

    move-result-object v1

    invoke-virtual {v1}, Linet/ipaddr/c$b;->allPrefixedAddressesAreSubnets()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p0, v0}, Linet/ipaddr/ipv4/I;->h4(I)Linet/ipaddr/ipv4/I;

    move-result-object v0

    return-object v0

    :cond_1
    :goto_0
    return-object p0
.end method

.method public h4(I)Linet/ipaddr/ipv4/I;
    .locals 2

    invoke-direct {p0}, Linet/ipaddr/ipv4/I;->i3()Linet/ipaddr/ipv4/e$a;

    move-result-object v0

    new-instance v1, Linet/ipaddr/ipv4/y;

    invoke-direct {v1, p0}, Linet/ipaddr/ipv4/y;-><init>(Linet/ipaddr/ipv4/I;)V

    invoke-static {p0, p1, v0, v1}, Linet/ipaddr/j;->F2(Linet/ipaddr/j;ILinet/ipaddr/i$a;Linet/ipaddr/j$e;)Linet/ipaddr/j;

    move-result-object p1

    check-cast p1, Linet/ipaddr/ipv4/I;

    return-object p1
.end method

.method public i4()Linet/ipaddr/ipv4/I;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Linet/ipaddr/ipv4/I;->a4(Z)Linet/ipaddr/ipv4/I;

    move-result-object v0

    return-object v0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Linet/ipaddr/ipv4/I;->A3(Ljava/util/function/Predicate;)Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method

.method public j3(I)Linet/ipaddr/ipv4/M;
    .locals 0

    invoke-super {p0, p1}, Linet/ipaddr/j;->a2(I)Linet/ipaddr/k;

    move-result-object p1

    check-cast p1, Linet/ipaddr/ipv4/M;

    return-object p1
.end method

.method public bridge synthetic k(I)Lag/f;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Linet/ipaddr/ipv4/I;->j3(I)Linet/ipaddr/ipv4/M;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic k(I)Lag/l;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Linet/ipaddr/ipv4/I;->j3(I)Linet/ipaddr/ipv4/M;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic k(I)Lcg/c;
    .locals 0

    .line 3
    invoke-virtual {p0, p1}, Linet/ipaddr/ipv4/I;->j3(I)Linet/ipaddr/ipv4/M;

    move-result-object p1

    return-object p1
.end method

.method public m0()I
    .locals 1

    const/16 v0, 0x8

    return v0
.end method

.method public bridge synthetic m1(I)Lbg/b;
    .locals 0

    invoke-virtual {p0, p1}, Linet/ipaddr/ipv4/I;->j3(I)Linet/ipaddr/ipv4/M;

    move-result-object p1

    return-object p1
.end method

.method public m3()Linet/ipaddr/ipv4/I;
    .locals 2

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Linet/ipaddr/ipv4/I;->o3(ZZ)Linet/ipaddr/ipv4/I;

    move-result-object v0

    return-object v0
.end method

.method public n0()Linet/ipaddr/g$a;
    .locals 1

    sget-object v0, Linet/ipaddr/g$a;->IPV4:Linet/ipaddr/g$a;

    return-object v0
.end method

.method n3(Linet/ipaddr/ipv4/b;ZZ)Linet/ipaddr/ipv4/b;
    .locals 6

    invoke-direct {p0, p2, p3}, Linet/ipaddr/ipv4/I;->o3(ZZ)Linet/ipaddr/ipv4/I;

    move-result-object v0

    if-ne v0, p0, :cond_0

    return-object p1

    :cond_0
    const/4 v1, 0x0

    if-nez v0, :cond_1

    return-object v1

    :cond_1
    iget-object v2, p1, Linet/ipaddr/ipv4/b;->p:Linet/ipaddr/ipv4/I$b;

    if-eqz v2, :cond_4

    if-eqz p2, :cond_3

    if-eqz p3, :cond_2

    iget-object v1, v2, Lbg/d$g;->b:LZf/e;

    :goto_0
    check-cast v1, Linet/ipaddr/ipv4/b;

    goto :goto_1

    :cond_2
    iget-object v1, v2, Lbg/d$g;->a:LZf/e;

    goto :goto_0

    :cond_3
    iget-object v1, v2, Lbg/d$g;->c:LZf/e;

    goto :goto_0

    :goto_1
    if-nez v1, :cond_d

    :cond_4
    monitor-enter p0

    :try_start_0
    iget-object v2, p1, Linet/ipaddr/ipv4/b;->p:Linet/ipaddr/ipv4/I$b;

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-nez v2, :cond_5

    move v5, v4

    goto :goto_2

    :cond_5
    move v5, v3

    :goto_2
    if-eqz v5, :cond_6

    new-instance v2, Linet/ipaddr/ipv4/I$b;

    invoke-direct {v2}, Linet/ipaddr/ipv4/I$b;-><init>()V

    iput-object v2, p1, Linet/ipaddr/ipv4/b;->p:Linet/ipaddr/ipv4/I$b;

    goto :goto_4

    :catchall_0
    move-exception p1

    goto :goto_6

    :cond_6
    if-eqz p2, :cond_9

    if-eqz p3, :cond_8

    iget-object p1, v2, Lbg/d$g;->b:LZf/e;

    move-object v1, p1

    check-cast v1, Linet/ipaddr/ipv4/b;

    if-nez v1, :cond_7

    :goto_3
    move v3, v4

    :cond_7
    move v5, v3

    goto :goto_4

    :cond_8
    iget-object p1, v2, Lbg/d$g;->a:LZf/e;

    move-object v1, p1

    check-cast v1, Linet/ipaddr/ipv4/b;

    if-nez v1, :cond_7

    goto :goto_3

    :cond_9
    iget-object p1, v2, Lbg/d$g;->c:LZf/e;

    move-object v1, p1

    check-cast v1, Linet/ipaddr/ipv4/b;

    if-nez v1, :cond_7

    goto :goto_3

    :goto_4
    if-eqz v5, :cond_c

    invoke-direct {p0}, Linet/ipaddr/ipv4/I;->i3()Linet/ipaddr/ipv4/e$a;

    move-result-object p1

    invoke-virtual {p1, v0}, Linet/ipaddr/ipv4/e$a;->N0(Linet/ipaddr/ipv4/I;)Linet/ipaddr/ipv4/b;

    move-result-object p1

    if-eqz p2, :cond_b

    if-eqz p3, :cond_a

    iput-object p1, v2, Lbg/d$g;->b:LZf/e;

    goto :goto_5

    :cond_a
    iput-object p1, v2, Lbg/d$g;->a:LZf/e;

    goto :goto_5

    :cond_b
    iput-object p1, v2, Lbg/d$g;->c:LZf/e;

    :goto_5
    move-object v1, p1

    :cond_c
    monitor-exit p0

    :cond_d
    return-object v1

    :goto_6
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public p3()Linet/ipaddr/ipv4/e;
    .locals 1

    invoke-static {}, Linet/ipaddr/a;->j()Linet/ipaddr/ipv4/e;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic q(I)LZf/d;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Linet/ipaddr/ipv4/I;->r3(I)Linet/ipaddr/ipv4/M;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic q(I)Linet/ipaddr/k;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Linet/ipaddr/ipv4/I;->r3(I)Linet/ipaddr/ipv4/M;

    move-result-object p1

    return-object p1
.end method

.method public q3()Linet/ipaddr/ipv4/I;
    .locals 0

    return-object p0
.end method

.method public r0()Ljava/lang/String;
    .locals 2

    invoke-virtual {p0}, Linet/ipaddr/ipv4/I;->w3()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Linet/ipaddr/ipv4/I;->r:Linet/ipaddr/ipv4/I$c;

    iget-object v0, v0, Linet/ipaddr/j$b;->c:Ljava/lang/String;

    if-nez v0, :cond_1

    :cond_0
    iget-object v0, p0, Linet/ipaddr/ipv4/I;->r:Linet/ipaddr/ipv4/I$c;

    sget-object v1, Linet/ipaddr/ipv4/I$c;->j:Linet/ipaddr/j$c;

    invoke-virtual {p0, v1}, Linet/ipaddr/j;->D2(Linet/ipaddr/j$c;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Linet/ipaddr/j$b;->c:Ljava/lang/String;

    move-object v0, v1

    :cond_1
    return-object v0
.end method

.method public r3(I)Linet/ipaddr/ipv4/M;
    .locals 0

    invoke-super {p0, p1}, Linet/ipaddr/j;->q(I)Linet/ipaddr/k;

    move-result-object p1

    check-cast p1, Linet/ipaddr/ipv4/M;

    return-object p1
.end method

.method public bridge synthetic spliterator()Ljava/util/Spliterator;
    .locals 1

    invoke-virtual {p0}, Linet/ipaddr/ipv4/I;->d4()Ldg/b;

    move-result-object v0

    return-object v0
.end method

.method public t3()[Linet/ipaddr/ipv4/M;
    .locals 1

    invoke-virtual {p0}, Lag/d;->X0()[Lag/b;

    move-result-object v0

    invoke-virtual {v0}, [Lag/b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Linet/ipaddr/ipv4/M;

    return-object v0
.end method

.method protected u3()[Linet/ipaddr/ipv4/M;
    .locals 1

    invoke-super {p0}, Lag/d;->X0()[Lag/b;

    move-result-object v0

    check-cast v0, [Linet/ipaddr/ipv4/M;

    return-object v0
.end method

.method public v0()I
    .locals 1

    invoke-virtual {p0}, Linet/ipaddr/j;->Z()I

    move-result v0

    return v0
.end method

.method public v3()Linet/ipaddr/ipv4/I;
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0, v0}, Linet/ipaddr/ipv4/I;->o3(ZZ)Linet/ipaddr/ipv4/I;

    move-result-object v0

    return-object v0
.end method

.method protected w3()Z
    .locals 1

    iget-object v0, p0, Linet/ipaddr/ipv4/I;->r:Linet/ipaddr/ipv4/I$c;

    if-nez v0, :cond_1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Linet/ipaddr/ipv4/I;->r:Linet/ipaddr/ipv4/I$c;

    if-nez v0, :cond_0

    new-instance v0, Linet/ipaddr/ipv4/I$c;

    invoke-direct {v0}, Linet/ipaddr/ipv4/I$c;-><init>()V

    iput-object v0, p0, Linet/ipaddr/ipv4/I;->r:Linet/ipaddr/ipv4/I$c;

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

.method public x0(LZf/c;)Z
    .locals 1

    instance-of v0, p1, Linet/ipaddr/ipv4/I;

    if-eqz v0, :cond_0

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

.method public x3()I
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Linet/ipaddr/ipv4/I;->l3(Z)I

    move-result v0

    return v0
.end method

.method protected y3([Linet/ipaddr/ipv4/M;I)Z
    .locals 0

    invoke-super {p0, p1, p2}, Linet/ipaddr/j;->o2([Linet/ipaddr/k;I)Z

    move-result p1

    return p1
.end method

.method z3(Linet/ipaddr/ipv4/b;Lbg/a;Ljava/util/function/Predicate;)Ljava/util/Iterator;
    .locals 6

    invoke-virtual {p0}, Linet/ipaddr/ipv4/I;->p3()Linet/ipaddr/ipv4/e;

    move-result-object v0

    invoke-virtual {v0}, Linet/ipaddr/ipv4/e;->d()Linet/ipaddr/c$b;

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

    if-eqz p3, :cond_2

    invoke-virtual {p1}, Linet/ipaddr/ipv4/b;->F1()Linet/ipaddr/ipv4/I;

    move-result-object v3

    invoke-virtual {v3}, Linet/ipaddr/ipv4/I;->u3()[Linet/ipaddr/ipv4/M;

    move-result-object v3

    invoke-interface {p3, v3}, Ljava/util/function/Predicate;->test(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    move-object p1, v2

    :cond_2
    if-eqz v1, :cond_3

    move-object p3, v2

    goto :goto_2

    :cond_3
    invoke-virtual {p0}, Linet/ipaddr/j;->Z()I

    move-result v3

    invoke-virtual {p0}, Lag/d;->A0()Z

    move-result v4

    if-eqz v4, :cond_4

    move-object v4, v2

    goto :goto_1

    :cond_4
    new-instance v4, Linet/ipaddr/ipv4/B;

    invoke-direct {v4, p0}, Linet/ipaddr/ipv4/B;-><init>(Linet/ipaddr/ipv4/I;)V

    :goto_1
    new-instance v5, Linet/ipaddr/ipv4/C;

    invoke-direct {v5, p0, v0}, Linet/ipaddr/ipv4/C;-><init>(Linet/ipaddr/ipv4/I;Z)V

    invoke-static {v3, p2, v4, v5, p3}, Lbg/d;->B1(ILinet/ipaddr/c$a;Ljava/util/function/Supplier;Ljava/util/function/IntFunction;Ljava/util/function/Predicate;)Ljava/util/Iterator;

    move-result-object p3

    :goto_2
    if-eqz v0, :cond_5

    goto :goto_3

    :cond_5
    invoke-virtual {p0}, Lbg/f;->A()Ljava/lang/Integer;

    move-result-object v2

    :goto_3
    invoke-static {v1, p1, p2, p3, v2}, Lbg/d;->w1(ZLinet/ipaddr/a;Lbg/a;Ljava/util/Iterator;Ljava/lang/Integer;)Ljava/util/Iterator;

    move-result-object p1

    return-object p1
.end method
