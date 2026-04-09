.class public abstract Linet/ipaddr/j;
.super Lbg/f;
.source "SourceFile"

# interfaces
.implements Linet/ipaddr/l;
.implements LZf/c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Linet/ipaddr/j$c;,
        Linet/ipaddr/j$g;,
        Linet/ipaddr/j$b;,
        Linet/ipaddr/j$a;,
        Linet/ipaddr/j$f;,
        Linet/ipaddr/j$e;,
        Linet/ipaddr/j$d;
    }
.end annotation


# static fields
.field private static final n:[Lcg/d;

.field static final o:Ljava/util/Comparator;

.field private static final p:Linet/ipaddr/b$b;

.field private static final q:Linet/ipaddr/b$b;


# instance fields
.field private transient m:Linet/ipaddr/j$d;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const/4 v0, 0x0

    new-array v1, v0, [Lcg/d;

    sput-object v1, Linet/ipaddr/j;->n:[Lcg/d;

    new-instance v1, LZf/g;

    invoke-direct {v1}, LZf/g;-><init>()V

    sput-object v1, Linet/ipaddr/j;->o:Ljava/util/Comparator;

    new-instance v1, Linet/ipaddr/b$b;

    const/4 v2, 0x1

    invoke-direct {v1, v2, v0, v2}, Linet/ipaddr/b$b;-><init>(ZZZ)V

    sput-object v1, Linet/ipaddr/j;->p:Linet/ipaddr/b$b;

    new-instance v0, Linet/ipaddr/b$b;

    invoke-direct {v0, v2, v2, v2}, Linet/ipaddr/b$b;-><init>(ZZZ)V

    sput-object v0, Linet/ipaddr/j;->q:Linet/ipaddr/b$b;

    return-void
.end method

.method protected constructor <init>([Linet/ipaddr/k;ZZ)V
    .locals 4

    if-eqz p2, :cond_0

    invoke-virtual {p1}, [Linet/ipaddr/k;->clone()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [Lbg/e;

    goto :goto_0

    :cond_0
    move-object p2, p1

    :goto_0
    const/4 v0, 0x0

    invoke-direct {p0, p2, v0}, Lbg/f;-><init>([Lbg/e;Z)V

    if-eqz p3, :cond_6

    invoke-virtual {p0}, Lbg/f;->e()Linet/ipaddr/i;

    move-result-object p2

    invoke-interface {p0}, LZf/e;->m0()I

    move-result p3

    const/4 v1, 0x0

    :goto_1
    array-length v2, p1

    if-ge v0, v2, :cond_5

    aget-object v2, p1, v0

    invoke-virtual {v2}, Linet/ipaddr/k;->e()Linet/ipaddr/i;

    move-result-object v3

    invoke-virtual {p2, v3}, Linet/ipaddr/c;->g(Linet/ipaddr/c;)Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-virtual {v2}, Linet/ipaddr/k;->A2()Ljava/lang/Integer;

    move-result-object v3

    if-nez v1, :cond_1

    if-eqz v3, :cond_2

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-static {p3, v1, v0}, Lbg/d;->o1(III)I

    move-result v1

    invoke-static {v1}, Linet/ipaddr/j;->s(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, p0, Lag/d;->c:Ljava/lang/Integer;

    goto :goto_2

    :cond_1
    if-eqz v3, :cond_3

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-nez v1, :cond_3

    :cond_2
    :goto_2
    add-int/lit8 v0, v0, 0x1

    move-object v1, v3

    goto :goto_1

    :cond_3
    new-instance p2, Linet/ipaddr/InconsistentPrefixException;

    add-int/lit8 v0, v0, -0x1

    aget-object p1, p1, v0

    invoke-direct {p2, p1, v2, v3}, Linet/ipaddr/InconsistentPrefixException;-><init>(Lag/g;Lag/g;Ljava/lang/Integer;)V

    throw p2

    :cond_4
    new-instance p1, Linet/ipaddr/NetworkMismatchException;

    invoke-direct {p1, v2}, Linet/ipaddr/NetworkMismatchException;-><init>(Lag/g;)V

    throw p1

    :cond_5
    if-nez v1, :cond_6

    sget-object p1, Lag/d;->g:Ljava/lang/Integer;

    iput-object p1, p0, Lag/d;->c:Ljava/lang/Integer;

    :cond_6
    return-void
.end method

.method private A2(Ljava/lang/Integer;)Ljava/lang/Integer;
    .locals 2

    if-nez p1, :cond_0

    iget-object p1, p0, Linet/ipaddr/j;->m:Linet/ipaddr/j$d;

    sget-object v0, Lag/d;->g:Ljava/lang/Integer;

    invoke-static {p1, v0}, Linet/ipaddr/j$d;->f(Linet/ipaddr/j$d;Ljava/lang/Integer;)Ljava/lang/Integer;

    move-result-object p1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Linet/ipaddr/j;->m:Linet/ipaddr/j$d;

    invoke-static {v0, p1}, Linet/ipaddr/j$d;->f(Linet/ipaddr/j$d;Ljava/lang/Integer;)Ljava/lang/Integer;

    iget-object v0, p0, Linet/ipaddr/j;->m:Linet/ipaddr/j$d;

    sget-object v1, Lag/d;->g:Ljava/lang/Integer;

    invoke-static {v0, v1}, Linet/ipaddr/j$d;->h(Linet/ipaddr/j$d;Ljava/lang/Integer;)Ljava/lang/Integer;

    :goto_0
    return-object p1
.end method

.method protected static B2(Linet/ipaddr/j$c;)Lag/d$c;
    .locals 4

    invoke-static {p0}, Lag/d;->K0(Lag/d$f;)Ldg/c;

    move-result-object v0

    check-cast v0, Lag/d$c;

    if-nez v0, :cond_0

    new-instance v0, Lag/d$c;

    iget v1, p0, Lbg/d$i;->d:I

    iget-object v2, p0, Lbg/d$i;->f:Ljava/lang/Character;

    iget-boolean v3, p0, Lbg/d$i;->j:Z

    invoke-direct {v0, v1, v2, v3}, Lag/d$c;-><init>(ILjava/lang/Character;Z)V

    iget-boolean v1, p0, Lbg/d$i;->c:Z

    invoke-virtual {v0, v1}, Lag/d$b;->u(Z)V

    iget-object v1, p0, Lbg/d$i;->b:Lbg/d$i$b;

    invoke-virtual {v0, v1}, Lag/d$b;->O(Lbg/d$i$b;)V

    iget-object v1, p0, Linet/ipaddr/j$c;->l:Linet/ipaddr/j$g$a;

    invoke-virtual {v0, v1}, Lag/d$c;->g0(Linet/ipaddr/j$g$a;)V

    iget-object v1, p0, Lbg/d$i;->e:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lag/d$b;->K(Ljava/lang/String;)V

    iget-object v1, p0, Linet/ipaddr/j$c;->k:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lag/d$c;->f0(Ljava/lang/String;)V

    iget-object v1, p0, Lbg/d$i;->g:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lag/d$b;->G(Ljava/lang/String;)V

    iget-boolean v1, p0, Lbg/d$i;->h:Z

    invoke-virtual {v0, v1}, Lag/d$b;->I(Z)V

    iget-boolean v1, p0, Lbg/d$i;->i:Z

    invoke-virtual {v0, v1}, Lag/d$b;->M(Z)V

    iget-char v1, p0, Linet/ipaddr/j$c;->m:C

    invoke-virtual {v0, v1}, Lag/d$b;->P(C)V

    invoke-static {p0, v0}, Lag/d;->f1(Lag/d$f;Ldg/c;)V

    :cond_0
    return-object v0
.end method

.method public static E2(Linet/ipaddr/j$c;Lcg/d;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Linet/ipaddr/j;->B2(Linet/ipaddr/j$c;)Lag/d$c;

    move-result-object p0

    invoke-virtual {p0, p1}, Lag/d$b;->Q(Lcg/b;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method protected static F2(Linet/ipaddr/j;ILinet/ipaddr/i$a;Linet/ipaddr/j$e;)Linet/ipaddr/j;
    .locals 4

    if-ltz p1, :cond_2

    invoke-virtual {p0}, Linet/ipaddr/j;->f()I

    move-result v0

    if-gt p1, v0, :cond_2

    invoke-virtual {p0, p1}, Linet/ipaddr/j;->k2(I)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p0

    :cond_0
    invoke-interface {p0}, LZf/e;->m0()I

    move-result v0

    invoke-virtual {p0}, Linet/ipaddr/j;->Z()I

    move-result p0

    invoke-virtual {p2, p0}, Linet/ipaddr/format/validate/f;->d(I)[LZf/d;

    move-result-object v1

    check-cast v1, [Linet/ipaddr/k;

    const/4 v2, 0x0

    :goto_0
    if-ge v2, p0, :cond_1

    invoke-static {v0, p1, v2}, Linet/ipaddr/j;->q1(III)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {p3, v3, v2}, Linet/ipaddr/j$e;->a(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Linet/ipaddr/k;

    aput-object v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {p2, v1}, Linet/ipaddr/i$a;->G0([Linet/ipaddr/k;)Linet/ipaddr/j;

    move-result-object p0

    return-object p0

    :cond_2
    new-instance p2, Linet/ipaddr/PrefixLenException;

    invoke-direct {p2, p0, p1}, Linet/ipaddr/PrefixLenException;-><init>(Lag/g;I)V

    throw p2
.end method

.method protected static H1()Lbg/f$c;
    .locals 1

    invoke-static {}, Lbg/f;->H1()Lbg/f$c;

    move-result-object v0

    return-object v0
.end method

.method protected static I1(II)Lbg/f$c;
    .locals 0

    invoke-static {p0, p1}, Lbg/f;->I1(II)Lbg/f$c;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic M1(Linet/ipaddr/j$e;Linet/ipaddr/j;I)I
    .locals 0

    invoke-static {p0, p1, p2}, Linet/ipaddr/j;->u2(Linet/ipaddr/j$e;Linet/ipaddr/j;I)I

    move-result p0

    return p0
.end method

.method public static synthetic N1([Linet/ipaddr/k;I)I
    .locals 0

    invoke-static {p0, p1}, Linet/ipaddr/j;->r2([Linet/ipaddr/k;I)I

    move-result p0

    return p0
.end method

.method public static synthetic O1(Linet/ipaddr/l;Linet/ipaddr/l;)I
    .locals 0

    invoke-static {p0, p1}, Linet/ipaddr/j;->w2(Linet/ipaddr/l;Linet/ipaddr/l;)I

    move-result p0

    return p0
.end method

.method public static synthetic P1(Linet/ipaddr/j$e;Linet/ipaddr/j;I)Linet/ipaddr/k;
    .locals 0

    invoke-static {p0, p1, p2}, Linet/ipaddr/j;->v2(Linet/ipaddr/j$e;Linet/ipaddr/j;I)Linet/ipaddr/k;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic Q1([Linet/ipaddr/k;I)I
    .locals 0

    invoke-static {p0, p1}, Linet/ipaddr/j;->s2([Linet/ipaddr/k;I)I

    move-result p0

    return p0
.end method

.method public static synthetic R1(Linet/ipaddr/j;IIII)I
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Linet/ipaddr/j;->t2(IIII)I

    move-result p0

    return p0
.end method

.method public static S1(Linet/ipaddr/g$a;)I
    .locals 0

    invoke-static {p0}, Linet/ipaddr/k;->u2(Linet/ipaddr/g$a;)I

    move-result p0

    return p0
.end method

.method public static T1(Linet/ipaddr/g$a;)I
    .locals 0

    invoke-static {p0}, Linet/ipaddr/k;->u2(Linet/ipaddr/g$a;)I

    move-result p0

    return p0
.end method

.method private U1(Z)Ljava/lang/Integer;
    .locals 8

    invoke-virtual {p0}, Linet/ipaddr/j;->Z()I

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    const/4 v2, 0x0

    invoke-virtual {p0, v2}, Linet/ipaddr/j;->q(I)Linet/ipaddr/k;

    move-result-object v3

    invoke-interface {v3}, LZf/d;->I0()I

    move-result v3

    if-eqz p1, :cond_1

    move v4, v2

    goto :goto_0

    :cond_1
    move v4, v3

    move v3, v2

    :goto_0
    move v5, v2

    :goto_1
    if-ge v2, v0, :cond_6

    invoke-virtual {p0, v2}, Linet/ipaddr/j;->q(I)Linet/ipaddr/k;

    move-result-object v6

    invoke-virtual {v6}, Linet/ipaddr/k;->Q()I

    move-result v7

    if-eq v7, v3, :cond_4

    invoke-virtual {v6, p1}, Lbg/e;->l2(Z)Ljava/lang/Integer;

    move-result-object v6

    if-nez v6, :cond_2

    return-object v1

    :cond_2
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v6

    add-int/2addr v5, v6

    :cond_3
    add-int/lit8 v2, v2, 0x1

    if-ge v2, v0, :cond_5

    invoke-virtual {p0, v2}, Linet/ipaddr/j;->q(I)Linet/ipaddr/k;

    move-result-object v6

    invoke-virtual {v6}, Linet/ipaddr/k;->Q()I

    move-result v6

    if-eq v6, v4, :cond_3

    return-object v1

    :cond_4
    invoke-interface {v6}, Lag/g;->f()I

    move-result v6

    add-int/2addr v5, v6

    :cond_5
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_6
    invoke-static {v5}, Linet/ipaddr/j;->s(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method

.method protected static W1(Linet/ipaddr/i$a;[Linet/ipaddr/k;Linet/ipaddr/j;)Linet/ipaddr/j;
    .locals 0

    invoke-virtual {p0, p2, p1}, Linet/ipaddr/i$a;->d0(Linet/ipaddr/j;[Linet/ipaddr/k;)Linet/ipaddr/j;

    move-result-object p0

    return-object p0
.end method

.method protected static X1(Linet/ipaddr/j;Linet/ipaddr/i$a;Ljava/util/function/Supplier;Ljava/util/function/IntFunction;ZZ)Linet/ipaddr/j;
    .locals 2

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eqz p4, :cond_1

    if-eqz p5, :cond_1

    invoke-virtual {p0}, Linet/ipaddr/j;->h2()Z

    move-result p4

    if-eqz p4, :cond_1

    invoke-interface {p2}, Ljava/util/function/Supplier;->get()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/Iterator;

    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-nez p3, :cond_0

    const/4 p2, 0x0

    move-object p3, v1

    goto :goto_1

    :cond_0
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [Linet/ipaddr/k;

    move-object p3, p2

    goto :goto_0

    :cond_1
    invoke-static {p0, p1, p3}, Lbg/d;->l1(LZf/c;Linet/ipaddr/c$a;Ljava/util/function/IntFunction;)[LZf/d;

    move-result-object p2

    move-object p3, p2

    check-cast p3, [Linet/ipaddr/k;

    :goto_0
    move p2, v0

    :goto_1
    if-eqz p2, :cond_4

    invoke-virtual {p0}, Lbg/f;->e()Linet/ipaddr/i;

    move-result-object p2

    invoke-virtual {p2}, Linet/ipaddr/c;->d()Linet/ipaddr/c$b;

    move-result-object p2

    invoke-virtual {p2}, Linet/ipaddr/c$b;->allPrefixedAddressesAreSubnets()Z

    move-result p2

    if-nez p2, :cond_3

    invoke-virtual {p0}, Lbg/f;->F0()Ljava/lang/Integer;

    move-result-object p0

    if-nez p0, :cond_2

    goto :goto_3

    :cond_2
    invoke-virtual {p1, p3, p0, v0}, Linet/ipaddr/i$a;->q0([Linet/ipaddr/k;Ljava/lang/Integer;Z)Linet/ipaddr/j;

    move-result-object p0

    :goto_2
    move-object v1, p0

    goto :goto_4

    :cond_3
    :goto_3
    invoke-virtual {p1, p3}, Linet/ipaddr/i$a;->G0([Linet/ipaddr/k;)Linet/ipaddr/j;

    move-result-object p0

    goto :goto_2

    :cond_4
    :goto_4
    return-object v1
.end method

.method protected static b2(III)I
    .locals 0

    invoke-static {p0, p1, p2}, Linet/ipaddr/format/validate/g;->c(III)I

    move-result p0

    return p0
.end method

.method protected static f2(Linet/ipaddr/j;Ljava/lang/Integer;Linet/ipaddr/i$a;ZLjava/util/function/IntFunction;Ljava/util/function/IntUnaryOperator;Z)Linet/ipaddr/j;
    .locals 26

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p4

    move-object/from16 v4, p5

    move/from16 v5, p6

    if-eqz v1, :cond_1

    invoke-virtual/range {p1 .. p1}, Ljava/lang/Integer;->intValue()I

    move-result v6

    if-ltz v6, :cond_0

    invoke-virtual/range {p1 .. p1}, Ljava/lang/Integer;->intValue()I

    move-result v6

    invoke-virtual/range {p0 .. p0}, Linet/ipaddr/j;->f()I

    move-result v7

    if-gt v6, v7, :cond_0

    goto :goto_0

    :cond_0
    new-instance v2, Linet/ipaddr/PrefixLenException;

    invoke-virtual/range {p1 .. p1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-direct {v2, v0, v1}, Linet/ipaddr/PrefixLenException;-><init>(Lag/g;I)V

    throw v2

    :cond_1
    :goto_0
    invoke-interface/range {p0 .. p0}, LZf/e;->m0()I

    move-result v6

    invoke-virtual/range {p0 .. p0}, Linet/ipaddr/j;->Z()I

    move-result v7

    invoke-virtual/range {p0 .. p0}, Lbg/f;->e()Linet/ipaddr/i;

    move-result-object v8

    invoke-virtual {v8}, Linet/ipaddr/c;->d()Linet/ipaddr/c$b;

    move-result-object v8

    invoke-virtual {v8}, Linet/ipaddr/c$b;->allPrefixedAddressesAreSubnets()Z

    move-result v8

    if-eqz v8, :cond_2

    if-nez v5, :cond_2

    const/4 v8, 0x1

    goto :goto_1

    :cond_2
    const/4 v8, 0x0

    :goto_1
    const/4 v11, 0x0

    :goto_2
    if-ge v11, v7, :cond_e

    invoke-static {v6, v1, v11}, Linet/ipaddr/j;->s1(ILjava/lang/Integer;I)Ljava/lang/Integer;

    move-result-object v12

    invoke-interface {v3, v11}, Ljava/util/function/IntFunction;->apply(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Linet/ipaddr/k;

    invoke-interface {v4, v11}, Ljava/util/function/IntUnaryOperator;->applyAsInt(I)I

    move-result v14

    invoke-virtual {v13}, Linet/ipaddr/k;->Q()I

    move-result v15

    invoke-virtual {v13}, Linet/ipaddr/k;->w0()I

    move-result v9

    const-string v10, "ipaddress.error.maskMismatch"

    if-eqz p3, :cond_5

    if-eqz v8, :cond_3

    if-eqz v12, :cond_3

    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    move-result v5

    invoke-virtual {v13, v5}, Linet/ipaddr/k;->y2(I)I

    move-result v5

    or-int/2addr v14, v5

    :cond_3
    int-to-long v4, v15

    move/from16 v24, v6

    move/from16 v25, v7

    int-to-long v6, v9

    int-to-long v14, v14

    invoke-virtual {v13}, Linet/ipaddr/k;->X1()J

    move-result-wide v22

    move-wide/from16 v16, v4

    move-wide/from16 v18, v6

    move-wide/from16 v20, v14

    invoke-static/range {v16 .. v23}, Linet/ipaddr/k;->d2(JJJJ)Linet/ipaddr/format/validate/r$j;

    move-result-object v9

    invoke-virtual {v9}, Linet/ipaddr/format/validate/r$j;->d()Z

    move-result v16

    if-eqz v16, :cond_4

    invoke-virtual {v9, v4, v5, v14, v15}, Linet/ipaddr/format/validate/r$j;->a(JJ)J

    move-result-wide v4

    long-to-int v4, v4

    invoke-virtual {v9, v6, v7, v14, v15}, Linet/ipaddr/format/validate/r$j;->c(JJ)J

    move-result-wide v5

    long-to-int v5, v5

    goto :goto_3

    :cond_4
    new-instance v0, Linet/ipaddr/IncompatibleAddressException;

    invoke-direct {v0, v13, v10}, Linet/ipaddr/IncompatibleAddressException;-><init>(Lag/g;Ljava/lang/String;)V

    throw v0

    :cond_5
    move/from16 v24, v6

    move/from16 v25, v7

    and-int v4, v15, v14

    and-int v5, v9, v14

    :goto_3
    invoke-virtual {v13, v4, v5, v12}, Linet/ipaddr/k;->G2(IILjava/lang/Integer;)Z

    move-result v6

    if-eqz v6, :cond_d

    invoke-virtual/range {p0 .. p0}, Linet/ipaddr/j;->Z()I

    move-result v6

    invoke-virtual {v2, v6}, Linet/ipaddr/format/validate/f;->d(I)[LZf/d;

    move-result-object v6

    check-cast v6, [Linet/ipaddr/k;

    const/4 v7, 0x0

    invoke-virtual {v0, v7, v11, v6, v7}, Linet/ipaddr/j;->d2(II[LZf/d;I)V

    invoke-virtual {v2, v4, v5, v12}, Linet/ipaddr/format/validate/f;->c(IILjava/lang/Integer;)LZf/d;

    move-result-object v0

    check-cast v0, Linet/ipaddr/k;

    aput-object v0, v6, v11

    if-eqz v8, :cond_7

    if-eqz v12, :cond_7

    const/4 v0, 0x1

    add-int/2addr v11, v0

    move/from16 v4, v25

    if-ge v11, v4, :cond_6

    invoke-static {v7}, Linet/ipaddr/j;->s(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v2, v7, v0}, Linet/ipaddr/c$a;->g(ILjava/lang/Integer;)LZf/d;

    move-result-object v0

    check-cast v0, Linet/ipaddr/k;

    invoke-static {v6, v11, v4, v0}, Ljava/util/Arrays;->fill([Ljava/lang/Object;IILjava/lang/Object;)V

    :cond_6
    :goto_4
    move/from16 v8, p6

    goto/16 :goto_8

    :cond_7
    move/from16 v4, v25

    const/4 v0, 0x1

    add-int/2addr v11, v0

    :goto_5
    if-ge v11, v4, :cond_6

    move/from16 v5, v24

    invoke-static {v5, v1, v11}, Linet/ipaddr/j;->s1(ILjava/lang/Integer;I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v3, v11}, Ljava/util/function/IntFunction;->apply(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Linet/ipaddr/k;

    move-object/from16 v9, p5

    invoke-interface {v9, v11}, Ljava/util/function/IntUnaryOperator;->applyAsInt(I)I

    move-result v12

    invoke-virtual {v7}, Linet/ipaddr/k;->Q()I

    move-result v13

    invoke-virtual {v7}, Linet/ipaddr/k;->w0()I

    move-result v14

    if-eqz p3, :cond_a

    if-eqz v8, :cond_8

    if-eqz v0, :cond_8

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v15

    invoke-virtual {v7, v15}, Linet/ipaddr/k;->y2(I)I

    move-result v15

    or-int/2addr v12, v15

    :cond_8
    move/from16 v25, v4

    int-to-long v3, v13

    int-to-long v13, v14

    move v15, v8

    int-to-long v8, v12

    invoke-virtual {v7}, Linet/ipaddr/k;->X1()J

    move-result-wide v22

    move-wide/from16 v16, v3

    move-wide/from16 v18, v13

    move-wide/from16 v20, v8

    invoke-static/range {v16 .. v23}, Linet/ipaddr/k;->d2(JJJJ)Linet/ipaddr/format/validate/r$j;

    move-result-object v12

    invoke-virtual {v12}, Linet/ipaddr/format/validate/r$j;->d()Z

    move-result v16

    if-eqz v16, :cond_9

    invoke-virtual {v12, v3, v4, v8, v9}, Linet/ipaddr/format/validate/r$j;->a(JJ)J

    move-result-wide v3

    long-to-int v3, v3

    invoke-virtual {v12, v13, v14, v8, v9}, Linet/ipaddr/format/validate/r$j;->c(JJ)J

    move-result-wide v8

    long-to-int v4, v8

    goto :goto_6

    :cond_9
    new-instance v0, Linet/ipaddr/IncompatibleAddressException;

    invoke-direct {v0, v7, v10}, Linet/ipaddr/IncompatibleAddressException;-><init>(Lag/g;Ljava/lang/String;)V

    throw v0

    :cond_a
    move/from16 v25, v4

    move v15, v8

    and-int v3, v13, v12

    and-int v4, v14, v12

    :goto_6
    invoke-virtual {v7, v3, v4, v0}, Linet/ipaddr/k;->G2(IILjava/lang/Integer;)Z

    move-result v8

    if-eqz v8, :cond_b

    invoke-virtual {v2, v3, v4, v0}, Linet/ipaddr/format/validate/f;->c(IILjava/lang/Integer;)LZf/d;

    move-result-object v3

    check-cast v3, Linet/ipaddr/k;

    aput-object v3, v6, v11

    goto :goto_7

    :cond_b
    aput-object v7, v6, v11

    :goto_7
    if-eqz v15, :cond_c

    if-eqz v0, :cond_c

    const/4 v3, 0x1

    add-int/2addr v11, v3

    move/from16 v4, v25

    if-ge v11, v4, :cond_6

    const/4 v7, 0x0

    invoke-static {v7}, Linet/ipaddr/j;->s(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v2, v7, v0}, Linet/ipaddr/c$a;->g(ILjava/lang/Integer;)LZf/d;

    move-result-object v0

    check-cast v0, Linet/ipaddr/k;

    invoke-static {v6, v11, v4, v0}, Ljava/util/Arrays;->fill([Ljava/lang/Object;IILjava/lang/Object;)V

    goto/16 :goto_4

    :cond_c
    move/from16 v4, v25

    const/4 v3, 0x1

    const/4 v7, 0x0

    add-int/lit8 v11, v11, 0x1

    move-object/from16 v3, p4

    move/from16 v24, v5

    move v8, v15

    goto/16 :goto_5

    :goto_8
    invoke-virtual {v2, v6, v1, v8}, Linet/ipaddr/i$a;->q0([Linet/ipaddr/k;Ljava/lang/Integer;Z)Linet/ipaddr/j;

    move-result-object v0

    return-object v0

    :cond_d
    move v15, v8

    move/from16 v5, v24

    move/from16 v4, v25

    const/4 v3, 0x1

    const/4 v7, 0x0

    move/from16 v8, p6

    add-int/lit8 v11, v11, 0x1

    move-object/from16 v3, p4

    move v7, v4

    move v6, v5

    move v5, v8

    move v8, v15

    move-object/from16 v4, p5

    goto/16 :goto_2

    :cond_e
    return-object v0
.end method

.method private g2()Z
    .locals 1

    iget-object v0, p0, Linet/ipaddr/j;->m:Linet/ipaddr/j$d;

    if-nez v0, :cond_1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Linet/ipaddr/j;->m:Linet/ipaddr/j$d;

    if-nez v0, :cond_0

    new-instance v0, Linet/ipaddr/j$d;

    invoke-direct {v0}, Linet/ipaddr/j$d;-><init>()V

    iput-object v0, p0, Linet/ipaddr/j;->m:Linet/ipaddr/j$d;

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

.method protected static l2([Linet/ipaddr/k;Ljava/lang/Integer;Linet/ipaddr/i;Z)Z
    .locals 9

    array-length v2, p0

    const/4 v0, 0x0

    if-nez v2, :cond_0

    return v0

    :cond_0
    aget-object v0, p0, v0

    new-instance v1, LZf/j;

    invoke-direct {v1, p0}, LZf/j;-><init>([Linet/ipaddr/k;)V

    new-instance v3, LZf/k;

    invoke-direct {v3, p0}, LZf/k;-><init>([Linet/ipaddr/k;)V

    invoke-interface {v0}, Lag/g;->v0()I

    move-result p0

    invoke-interface {v0}, Lag/g;->f()I

    move-result v4

    invoke-interface {v0}, LZf/d;->I0()I

    move-result v5

    invoke-virtual {p2}, Linet/ipaddr/c;->d()Linet/ipaddr/c$b;

    move-result-object v7

    move-object v0, v1

    move-object v1, v3

    move v3, p0

    move-object v6, p1

    move v8, p3

    invoke-static/range {v0 .. v8}, Linet/ipaddr/format/validate/g;->h(Linet/ipaddr/a$a;Linet/ipaddr/a$a;IIIILjava/lang/Integer;Linet/ipaddr/c$b;Z)Z

    move-result p0

    return p0
.end method

.method protected static n2(I[Linet/ipaddr/k;III)Z
    .locals 6

    array-length v0, p1

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    if-lt p0, p4, :cond_1

    return v1

    :cond_1
    array-length p4, p1

    invoke-static {p0, p2, p3}, Linet/ipaddr/j;->b2(III)I

    move-result p2

    move v0, p2

    :goto_0
    const/4 v2, 0x1

    if-ge v0, p4, :cond_5

    invoke-static {p3, p0, p2}, Linet/ipaddr/j;->q1(III)Ljava/lang/Integer;

    move-result-object v3

    aget-object v4, p1, v0

    if-eqz v3, :cond_4

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-virtual {v4, v3}, Linet/ipaddr/k;->y2(I)I

    move-result v3

    invoke-virtual {v4}, Linet/ipaddr/k;->A0()Z

    move-result v5

    if-nez v5, :cond_3

    invoke-virtual {v4}, Linet/ipaddr/k;->Q()I

    move-result v4

    and-int/2addr v3, v4

    if-eqz v3, :cond_2

    goto :goto_1

    :cond_2
    add-int/lit8 v0, v0, 0x1

    if-ge v0, p4, :cond_4

    aget-object v3, p1, v0

    invoke-virtual {v3}, Lbg/b;->c0()Z

    move-result v3

    if-nez v3, :cond_2

    :cond_3
    :goto_1
    return v1

    :cond_4
    add-int/2addr v0, v2

    goto :goto_0

    :cond_5
    return v2
.end method

.method protected static p1(III)I
    .locals 0

    invoke-static {p0, p1, p2}, Linet/ipaddr/format/validate/g;->e(III)I

    move-result p0

    return p0
.end method

.method static p2(ILinet/ipaddr/c$a;Ljava/util/function/IntFunction;IILjava/util/function/IntFunction;)Ljava/util/Iterator;
    .locals 8

    const/4 v2, 0x0

    const/4 v4, 0x0

    move v0, p0

    move-object v1, p1

    move-object v3, p2

    move v5, p3

    move v6, p4

    move-object v7, p5

    invoke-static/range {v0 .. v7}, Lbg/d;->C1(ILinet/ipaddr/c$a;Ljava/util/function/Supplier;Ljava/util/function/IntFunction;Ljava/util/function/Predicate;IILjava/util/function/IntFunction;)Ljava/util/Iterator;

    move-result-object p0

    return-object p0
.end method

.method protected static q1(III)Ljava/lang/Integer;
    .locals 0

    invoke-static {p0, p1, p2}, Lbg/d;->q1(III)Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method

.method static q2(Linet/ipaddr/a;Lbg/a;Ljava/util/Iterator;)Ljava/util/Iterator;
    .locals 2

    if-eqz p0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const/4 v1, 0x0

    invoke-static {v0, p0, p1, p2, v1}, Lbg/d;->w1(ZLinet/ipaddr/a;Lbg/a;Ljava/util/Iterator;Ljava/lang/Integer;)Ljava/util/Iterator;

    move-result-object p0

    return-object p0
.end method

.method protected static r1(II)Ljava/lang/Integer;
    .locals 0

    invoke-static {p0, p1}, Lbg/d;->r1(II)Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic r2([Linet/ipaddr/k;I)I
    .locals 0

    aget-object p0, p0, p1

    invoke-virtual {p0}, Linet/ipaddr/k;->Q()I

    move-result p0

    return p0
.end method

.method protected static s(I)Ljava/lang/Integer;
    .locals 0

    invoke-static {p0}, Lbg/d;->s(I)Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method

.method protected static s1(ILjava/lang/Integer;I)Ljava/lang/Integer;
    .locals 0

    invoke-static {p0, p1, p2}, Lbg/d;->s1(ILjava/lang/Integer;I)Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic s2([Linet/ipaddr/k;I)I
    .locals 0

    aget-object p0, p0, p1

    invoke-virtual {p0}, Linet/ipaddr/k;->w0()I

    move-result p0

    return p0
.end method

.method private synthetic t2(IIII)I
    .locals 1

    if-ne p4, p1, :cond_0

    invoke-virtual {p0, p4}, Linet/ipaddr/j;->q(I)Linet/ipaddr/k;

    move-result-object p1

    invoke-interface {p1}, Lag/g;->f()I

    move-result v0

    invoke-static {p2, p3, p4}, Linet/ipaddr/j;->q1(III)Ljava/lang/Integer;

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
    invoke-virtual {p0, p4}, Linet/ipaddr/j;->q(I)Linet/ipaddr/k;

    move-result-object p1

    invoke-virtual {p1}, Linet/ipaddr/k;->C2()I

    move-result p1

    return p1
.end method

.method protected static u1(Linet/ipaddr/c;Linet/ipaddr/c;)Z
    .locals 0

    invoke-static {p0, p1}, Lbg/d;->u1(Linet/ipaddr/c;Linet/ipaddr/c;)Z

    move-result p0

    return p0
.end method

.method private static synthetic u2(Linet/ipaddr/j$e;Linet/ipaddr/j;I)I
    .locals 0

    invoke-interface {p0, p1, p2}, Linet/ipaddr/j$e;->a(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Linet/ipaddr/k;

    invoke-virtual {p0}, Linet/ipaddr/k;->Q()I

    move-result p0

    return p0
.end method

.method private static synthetic v2(Linet/ipaddr/j$e;Linet/ipaddr/j;I)Linet/ipaddr/k;
    .locals 0

    invoke-interface {p0, p1, p2}, Linet/ipaddr/j$e;->a(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Linet/ipaddr/k;

    return-object p0
.end method

.method private static synthetic w2(Linet/ipaddr/l;Linet/ipaddr/l;)I
    .locals 8

    invoke-interface {p0}, Lag/e;->A()Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1}, Lag/e;->A()Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-ne v0, v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    if-nez v0, :cond_1

    const/4 v1, -0x1

    goto :goto_0

    :cond_1
    if-nez v1, :cond_2

    move v1, v3

    goto :goto_0

    :cond_2
    invoke-virtual {v1, v0}, Ljava/lang/Integer;->compareTo(Ljava/lang/Integer;)I

    move-result v1

    :goto_0
    if-eqz v1, :cond_3

    return v1

    :cond_3
    if-eqz v0, :cond_4

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v4

    if-eqz v4, :cond_a

    :cond_4
    if-nez v0, :cond_5

    invoke-interface {p0}, LZf/e;->Z()I

    move-result v4

    sub-int/2addr v4, v3

    goto :goto_1

    :cond_5
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-interface {p0}, LZf/e;->e0()I

    move-result v4

    invoke-interface {p0}, LZf/e;->m0()I

    move-result v5

    invoke-static {v3, v4, v5}, Linet/ipaddr/j;->p1(III)I

    move-result v4

    :goto_1
    if-nez v0, :cond_6

    invoke-interface {p0}, LZf/e;->Z()I

    move-result v0

    goto :goto_2

    :cond_6
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-interface {p0}, LZf/e;->e0()I

    move-result v3

    invoke-interface {p0}, LZf/e;->m0()I

    move-result v5

    invoke-static {v0, v3, v5}, Linet/ipaddr/j;->b2(III)I

    move-result v0

    :goto_2
    move v3, v2

    :goto_3
    if-ge v3, v0, :cond_8

    invoke-interface {p0, v3}, Linet/ipaddr/l;->q(I)Linet/ipaddr/k;

    move-result-object v1

    invoke-interface {p1, v3}, Linet/ipaddr/l;->q(I)Linet/ipaddr/k;

    move-result-object v5

    invoke-interface {v1}, LZf/d;->Q()I

    move-result v6

    invoke-interface {v5}, LZf/d;->Q()I

    move-result v7

    invoke-interface {v1}, LZf/d;->w0()I

    move-result v1

    invoke-interface {v5}, LZf/d;->w0()I

    move-result v5

    sub-int/2addr v1, v6

    sub-int/2addr v5, v7

    sub-int/2addr v1, v5

    if-eqz v1, :cond_7

    return v1

    :cond_7
    add-int/lit8 v3, v3, 0x1

    goto :goto_3

    :cond_8
    :goto_4
    if-gt v2, v4, :cond_a

    invoke-interface {p0, v2}, Linet/ipaddr/l;->q(I)Linet/ipaddr/k;

    move-result-object v0

    invoke-interface {p1, v2}, Linet/ipaddr/l;->q(I)Linet/ipaddr/k;

    move-result-object v1

    invoke-interface {v0}, LZf/d;->Q()I

    move-result v0

    invoke-interface {v1}, LZf/d;->Q()I

    move-result v1

    sub-int v1, v0, v1

    if-eqz v1, :cond_9

    return v1

    :cond_9
    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    :cond_a
    return v1
.end method

.method protected static y(Lag/e;I)V
    .locals 0

    invoke-static {p0, p1}, Lag/d;->y(Lag/e;I)V

    return-void
.end method

.method protected static y2(Linet/ipaddr/j;ZLinet/ipaddr/i$a;Linet/ipaddr/j$e;)Linet/ipaddr/j;
    .locals 8

    invoke-virtual {p0}, Lag/d;->i()Z

    move-result v0

    if-nez v0, :cond_0

    return-object p0

    :cond_0
    invoke-virtual {p2}, Linet/ipaddr/i$a;->e()Linet/ipaddr/i;

    move-result-object v0

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Lbg/f;->A()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Linet/ipaddr/j;->f()I

    move-result v1

    :goto_0
    invoke-virtual {v0, v1}, Linet/ipaddr/i;->t(I)Linet/ipaddr/j;

    move-result-object v0

    new-instance v5, LZf/h;

    invoke-direct {v5, p3, p0}, LZf/h;-><init>(Linet/ipaddr/j$e;Linet/ipaddr/j;)V

    new-instance v6, LZf/i;

    invoke-direct {v6, p3, v0}, LZf/i;-><init>(Linet/ipaddr/j$e;Linet/ipaddr/j;)V

    const/4 v7, 0x0

    const/4 v2, 0x0

    move-object v1, p0

    move-object v3, p2

    move v4, p1

    invoke-static/range {v1 .. v7}, Linet/ipaddr/j;->f2(Linet/ipaddr/j;Ljava/lang/Integer;Linet/ipaddr/i$a;ZLjava/util/function/IntFunction;Ljava/util/function/IntUnaryOperator;Z)Linet/ipaddr/j;

    move-result-object p0

    return-object p0
.end method

.method private z2(Ljava/lang/Integer;)Ljava/lang/Integer;
    .locals 2

    if-nez p1, :cond_0

    iget-object p1, p0, Linet/ipaddr/j;->m:Linet/ipaddr/j$d;

    sget-object v0, Lag/d;->g:Ljava/lang/Integer;

    invoke-static {p1, v0}, Linet/ipaddr/j$d;->h(Linet/ipaddr/j$d;Ljava/lang/Integer;)Ljava/lang/Integer;

    move-result-object p1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Linet/ipaddr/j;->m:Linet/ipaddr/j$d;

    invoke-static {v0, p1}, Linet/ipaddr/j$d;->h(Linet/ipaddr/j$d;Ljava/lang/Integer;)Ljava/lang/Integer;

    iget-object v0, p0, Linet/ipaddr/j;->m:Linet/ipaddr/j$d;

    sget-object v1, Lag/d;->g:Ljava/lang/Integer;

    invoke-static {v0, v1}, Linet/ipaddr/j$d;->f(Linet/ipaddr/j$d;Ljava/lang/Integer;)Ljava/lang/Integer;

    :goto_0
    return-object p1
.end method


# virtual methods
.method public B0(I)Z
    .locals 6

    invoke-static {p0, p1}, Linet/ipaddr/j;->y(Lag/e;I)V

    invoke-virtual {p0}, Lbg/f;->e()Linet/ipaddr/i;

    move-result-object v0

    invoke-virtual {v0}, Linet/ipaddr/c;->d()Linet/ipaddr/c$b;

    move-result-object v0

    invoke-virtual {v0}, Linet/ipaddr/c$b;->allPrefixedAddressesAreSubnets()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lag/d;->i()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {p0}, Lbg/f;->F0()Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-gt v2, p1, :cond_0

    return v1

    :cond_0
    invoke-virtual {p0}, Lag/d;->H()I

    move-result v2

    invoke-interface {p0}, LZf/e;->m0()I

    move-result v3

    invoke-interface {p0}, LZf/e;->e0()I

    move-result v4

    invoke-static {p1, v4, v3}, Linet/ipaddr/j;->b2(III)I

    move-result v4

    if-ge v4, v2, :cond_5

    invoke-virtual {p0, v4}, Linet/ipaddr/j;->a2(I)Linet/ipaddr/k;

    move-result-object v5

    invoke-static {v3, p1, v4}, Linet/ipaddr/j;->q1(III)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {v5, p1}, Lbg/e;->B0(I)Z

    move-result p1

    const/4 v3, 0x0

    if-nez p1, :cond_1

    return v3

    :cond_1
    if-eqz v0, :cond_2

    invoke-virtual {v5}, Lbg/e;->i()Z

    move-result p1

    if-eqz p1, :cond_2

    return v1

    :cond_2
    add-int/2addr v4, v1

    :goto_0
    if-ge v4, v2, :cond_5

    invoke-virtual {p0, v4}, Linet/ipaddr/j;->a2(I)Linet/ipaddr/k;

    move-result-object p1

    invoke-interface {p1}, Lag/l;->w()Z

    move-result v5

    if-nez v5, :cond_3

    return v3

    :cond_3
    if-eqz v0, :cond_4

    invoke-virtual {p1}, Lbg/e;->i()Z

    move-result p1

    if-eqz p1, :cond_4

    return v1

    :cond_4
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_5
    return v1
.end method

.method C2(Linet/ipaddr/g;)Ljava/net/InetAddress;
    .locals 1

    invoke-virtual {p0}, Lag/d;->a1()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lag/d;->a:Lag/d$g;

    iget-object v0, v0, Lag/d$g;->e:Ljava/net/InetAddress;

    if-nez v0, :cond_1

    :cond_0
    iget-object v0, p0, Lag/d;->a:Lag/d$g;

    invoke-virtual {p1}, Linet/ipaddr/g;->q1()Ljava/net/InetAddress;

    move-result-object p1

    iput-object p1, v0, Lag/d$g;->e:Ljava/net/InetAddress;

    move-object v0, p1

    :cond_1
    return-object v0
.end method

.method public D2(Linet/ipaddr/j$c;)Ljava/lang/String;
    .locals 0

    invoke-static {p1, p0}, Linet/ipaddr/j;->E2(Linet/ipaddr/j$c;Lcg/d;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public U0()Ljava/math/BigInteger;
    .locals 1

    invoke-virtual {p0}, Linet/ipaddr/j;->Z()I

    move-result v0

    invoke-virtual {p0, v0}, Linet/ipaddr/j;->Z1(I)Ljava/math/BigInteger;

    move-result-object v0

    return-object v0
.end method

.method protected V1(Linet/ipaddr/j;)V
    .locals 2

    invoke-virtual {p1}, Linet/ipaddr/j;->Z()I

    move-result v0

    invoke-virtual {p0}, Linet/ipaddr/j;->Z()I

    move-result v1

    if-lt v0, v1, :cond_0

    return-void

    :cond_0
    new-instance v0, Linet/ipaddr/SizeMismatchException;

    invoke-direct {v0, p0, p1}, Linet/ipaddr/SizeMismatchException;-><init>(Lag/g;Lag/g;)V

    throw v0
.end method

.method public Y1(Z)Ljava/lang/Integer;
    .locals 1

    if-eqz p1, :cond_1

    invoke-direct {p0}, Linet/ipaddr/j;->g2()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Linet/ipaddr/j;->m:Linet/ipaddr/j$d;

    invoke-static {v0}, Linet/ipaddr/j$d;->e(Linet/ipaddr/j$d;)Ljava/lang/Integer;

    move-result-object v0

    if-nez v0, :cond_3

    :cond_0
    invoke-direct {p0, p1}, Linet/ipaddr/j;->U1(Z)Ljava/lang/Integer;

    move-result-object p1

    invoke-direct {p0, p1}, Linet/ipaddr/j;->A2(Ljava/lang/Integer;)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_0

    :cond_1
    invoke-direct {p0}, Linet/ipaddr/j;->g2()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Linet/ipaddr/j;->m:Linet/ipaddr/j$d;

    invoke-static {v0}, Linet/ipaddr/j$d;->g(Linet/ipaddr/j$d;)Ljava/lang/Integer;

    move-result-object v0

    if-nez v0, :cond_3

    :cond_2
    invoke-direct {p0, p1}, Linet/ipaddr/j;->U1(Z)Ljava/lang/Integer;

    move-result-object p1

    invoke-direct {p0, p1}, Linet/ipaddr/j;->z2(Ljava/lang/Integer;)Ljava/lang/Integer;

    move-result-object v0

    :cond_3
    :goto_0
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result p1

    if-gez p1, :cond_4

    const/4 p1, 0x0

    return-object p1

    :cond_4
    return-object v0
.end method

.method public Z()I
    .locals 1

    invoke-virtual {p0}, Lag/d;->H()I

    move-result v0

    return v0
.end method

.method protected abstract Z1(I)Ljava/math/BigInteger;
.end method

.method public a2(I)Linet/ipaddr/k;
    .locals 1

    invoke-virtual {p0}, Linet/ipaddr/j;->e2()[Linet/ipaddr/k;

    move-result-object v0

    aget-object p1, v0, p1

    return-object p1
.end method

.method public c2()[Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lag/d;->W0()[Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public d2(II[LZf/d;I)V
    .locals 1

    invoke-virtual {p0}, Lag/d;->X0()[Lag/b;

    move-result-object v0

    sub-int/2addr p2, p1

    invoke-static {v0, p1, p3, p4, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-void
.end method

.method protected abstract e2()[Linet/ipaddr/k;
.end method

.method public abstract f()I
.end method

.method public h2()Z
    .locals 3

    invoke-virtual {p0}, Lbg/f;->F0()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {p0}, Linet/ipaddr/j;->f()I

    move-result v2

    if-lt v1, v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p0, v0}, Linet/ipaddr/j;->i2(I)Z

    move-result v0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x0

    return v0
.end method

.method public i2(I)Z
    .locals 9

    if-ltz p1, :cond_4

    invoke-virtual {p0}, Linet/ipaddr/j;->f()I

    move-result v0

    if-gt p1, v0, :cond_4

    invoke-virtual {p0}, Lbg/f;->e()Linet/ipaddr/i;

    move-result-object v0

    invoke-virtual {v0}, Linet/ipaddr/c;->d()Linet/ipaddr/c$b;

    move-result-object v0

    invoke-virtual {v0}, Linet/ipaddr/c$b;->allPrefixedAddressesAreSubnets()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lag/d;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lbg/f;->F0()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-gt v0, p1, :cond_0

    return v1

    :cond_0
    invoke-interface {p0}, LZf/e;->m0()I

    move-result v0

    invoke-interface {p0}, LZf/e;->e0()I

    move-result v2

    invoke-static {p1, v2, v0}, Linet/ipaddr/j;->b2(III)I

    move-result v2

    invoke-virtual {p0}, Linet/ipaddr/j;->Z()I

    move-result v3

    :goto_0
    if-ge v2, v3, :cond_3

    invoke-virtual {p0, v2}, Linet/ipaddr/j;->q(I)Linet/ipaddr/k;

    move-result-object v4

    invoke-static {v0, p1, v2}, Linet/ipaddr/j;->q1(III)Ljava/lang/Integer;

    move-result-object v5

    if-eqz v5, :cond_2

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    invoke-virtual {v4, v5}, Linet/ipaddr/k;->y2(I)I

    move-result v5

    int-to-long v5, v5

    invoke-virtual {v4}, Linet/ipaddr/k;->W1()J

    move-result-wide v7

    and-long v4, v5, v7

    const-wide/16 v6, 0x0

    cmp-long v4, v4, v6

    const/4 v5, 0x0

    if-eqz v4, :cond_1

    return v5

    :cond_1
    add-int/lit8 v2, v2, 0x1

    if-ge v2, v3, :cond_2

    invoke-virtual {p0, v2}, Linet/ipaddr/j;->q(I)Linet/ipaddr/k;

    move-result-object v4

    invoke-virtual {v4}, Linet/ipaddr/k;->L()Z

    move-result v4

    if-nez v4, :cond_1

    return v5

    :cond_2
    add-int/2addr v2, v1

    goto :goto_0

    :cond_3
    return v1

    :cond_4
    new-instance v0, Linet/ipaddr/PrefixLenException;

    invoke-direct {v0, p0, p1}, Linet/ipaddr/PrefixLenException;-><init>(Lag/g;I)V

    throw v0
.end method

.method protected j2(Ljava/lang/Integer;ZLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/math/BigInteger;Lbg/f$c;Lbg/f$c;)V
    .locals 0

    iget-object p7, p0, Linet/ipaddr/j;->m:Linet/ipaddr/j$d;

    if-nez p7, :cond_0

    new-instance p7, Linet/ipaddr/j$d;

    invoke-direct {p7}, Linet/ipaddr/j$d;-><init>()V

    iput-object p7, p0, Linet/ipaddr/j;->m:Linet/ipaddr/j$d;

    :cond_0
    if-eqz p2, :cond_1

    invoke-direct {p0, p1}, Linet/ipaddr/j;->A2(Ljava/lang/Integer;)Ljava/lang/Integer;

    goto :goto_0

    :cond_1
    invoke-direct {p0, p1}, Linet/ipaddr/j;->z2(Ljava/lang/Integer;)Ljava/lang/Integer;

    :goto_0
    invoke-super {p0, p3, p6}, Lag/d;->b1(Ljava/lang/Integer;Ljava/math/BigInteger;)V

    iget-object p1, p0, Linet/ipaddr/j;->m:Linet/ipaddr/j$d;

    invoke-static {p1, p4}, Linet/ipaddr/j$d;->a(Linet/ipaddr/j$d;Ljava/lang/Integer;)Ljava/lang/Integer;

    iget-object p1, p0, Linet/ipaddr/j;->m:Linet/ipaddr/j$d;

    invoke-static {p5, p3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-static {p1, p2}, Linet/ipaddr/j$d;->c(Linet/ipaddr/j$d;Ljava/lang/Boolean;)Ljava/lang/Boolean;

    iget-object p1, p0, Linet/ipaddr/j;->m:Linet/ipaddr/j$d;

    invoke-static {p1, p5}, Linet/ipaddr/j$d;->d(Linet/ipaddr/j$d;Ljava/lang/Integer;)Ljava/lang/Integer;

    return-void
.end method

.method protected k2(I)Z
    .locals 4

    invoke-virtual {p0}, Linet/ipaddr/j;->Z()I

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-interface {p0}, LZf/e;->m0()I

    move-result v2

    invoke-interface {p0}, LZf/e;->e0()I

    move-result v3

    invoke-static {p1, v3, v2}, Linet/ipaddr/j;->b2(III)I

    move-result v3

    if-lt v3, v0, :cond_2

    invoke-virtual {p0}, Linet/ipaddr/j;->f()I

    move-result v2

    if-ne p1, v2, :cond_1

    sub-int/2addr v0, v1

    invoke-virtual {p0, v0}, Linet/ipaddr/j;->q(I)Linet/ipaddr/k;

    move-result-object p1

    invoke-interface {p1}, Lag/g;->f()I

    move-result v0

    invoke-virtual {p1, v0}, Linet/ipaddr/k;->J2(I)Z

    move-result p1

    xor-int/2addr p1, v1

    return p1

    :cond_1
    return v1

    :cond_2
    invoke-static {v2, p1, v3}, Linet/ipaddr/j;->q1(III)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {p0, v3}, Linet/ipaddr/j;->q(I)Linet/ipaddr/k;

    move-result-object v2

    invoke-virtual {v2, p1}, Linet/ipaddr/k;->J2(I)Z

    move-result p1

    const/4 v2, 0x0

    if-eqz p1, :cond_3

    return v2

    :cond_3
    invoke-virtual {p0}, Lbg/f;->e()Linet/ipaddr/i;

    move-result-object p1

    invoke-virtual {p1}, Linet/ipaddr/c;->d()Linet/ipaddr/c$b;

    move-result-object p1

    invoke-virtual {p1}, Linet/ipaddr/c$b;->allPrefixedAddressesAreSubnets()Z

    move-result p1

    if-nez p1, :cond_5

    add-int/2addr v3, v1

    :goto_0
    if-ge v3, v0, :cond_5

    invoke-virtual {p0, v3}, Linet/ipaddr/j;->q(I)Linet/ipaddr/k;

    move-result-object p1

    invoke-interface {p1}, Lag/l;->w()Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_5
    return v1
.end method

.method public m2()Z
    .locals 7

    invoke-virtual {p0}, Lbg/f;->F0()Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x1

    if-eqz v0, :cond_6

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-virtual {p0}, Linet/ipaddr/j;->f()I

    move-result v3

    if-lt v2, v3, :cond_0

    goto :goto_2

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-interface {p0}, LZf/e;->e0()I

    move-result v3

    invoke-interface {p0}, LZf/e;->m0()I

    move-result v4

    invoke-static {v2, v3, v4}, Linet/ipaddr/j;->p1(III)I

    move-result v2

    if-gez v2, :cond_1

    return v1

    :cond_1
    const/4 v3, 0x0

    move v4, v3

    :goto_0
    if-ge v4, v2, :cond_3

    invoke-virtual {p0, v4}, Linet/ipaddr/j;->q(I)Linet/ipaddr/k;

    move-result-object v5

    invoke-virtual {v5}, Linet/ipaddr/k;->A0()Z

    move-result v5

    if-eqz v5, :cond_2

    return v3

    :cond_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_3
    invoke-virtual {p0, v2}, Linet/ipaddr/j;->q(I)Linet/ipaddr/k;

    move-result-object v4

    invoke-virtual {v4}, Linet/ipaddr/k;->Q()I

    move-result v5

    invoke-virtual {v4}, Linet/ipaddr/k;->w0()I

    move-result v6

    xor-int/2addr v5, v6

    if-nez v5, :cond_4

    return v1

    :cond_4
    invoke-interface {v4}, Lag/g;->f()I

    move-result v4

    invoke-static {v5}, Ljava/lang/Integer;->numberOfLeadingZeros(I)I

    move-result v5

    rsub-int/lit8 v6, v4, 0x20

    sub-int/2addr v5, v6

    invoke-static {v4, v0, v2}, Linet/ipaddr/j;->s1(ILjava/lang/Integer;I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-gt v0, v5, :cond_5

    goto :goto_1

    :cond_5
    move v1, v3

    :goto_1
    return v1

    :cond_6
    :goto_2
    invoke-virtual {p0}, Lag/d;->A0()Z

    move-result v0

    xor-int/2addr v0, v1

    return v0
.end method

.method protected o2([Linet/ipaddr/k;I)Z
    .locals 3

    invoke-interface {p0}, LZf/e;->e0()I

    move-result v0

    invoke-interface {p0}, LZf/e;->m0()I

    move-result v1

    invoke-virtual {p0}, Linet/ipaddr/j;->f()I

    move-result v2

    invoke-static {p2, p1, v0, v1, v2}, Linet/ipaddr/j;->n2(I[Linet/ipaddr/k;III)Z

    move-result p1

    return p1
.end method

.method public q(I)Linet/ipaddr/k;
    .locals 1

    invoke-virtual {p0}, Linet/ipaddr/j;->e2()[Linet/ipaddr/k;

    move-result-object v0

    aget-object p1, v0, p1

    return-object p1
.end method

.method protected q0()[B
    .locals 1

    invoke-super {p0}, Lag/d;->q0()[B

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    invoke-interface {p0}, LZf/b;->a0()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public u()Z
    .locals 3

    invoke-direct {p0}, Linet/ipaddr/j;->g2()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Linet/ipaddr/j;->m:Linet/ipaddr/j$d;

    invoke-static {v0}, Linet/ipaddr/j$d;->b(Linet/ipaddr/j$d;)Ljava/lang/Boolean;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Linet/ipaddr/j;->m:Linet/ipaddr/j$d;

    invoke-static {v0}, Linet/ipaddr/j$d;->b(Linet/ipaddr/j$d;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0

    :cond_0
    invoke-super {p0}, Lbg/f;->u()Z

    move-result v0

    iget-object v1, p0, Linet/ipaddr/j;->m:Linet/ipaddr/j$d;

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-static {v1, v2}, Linet/ipaddr/j$d;->c(Linet/ipaddr/j$d;Ljava/lang/Boolean;)Ljava/lang/Boolean;

    if-eqz v0, :cond_1

    iget-object v1, p0, Linet/ipaddr/j;->m:Linet/ipaddr/j$d;

    invoke-virtual {p0}, Lbg/f;->F0()Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v1, v2}, Linet/ipaddr/j$d;->d(Linet/ipaddr/j$d;Ljava/lang/Integer;)Ljava/lang/Integer;

    :cond_1
    return v0
.end method

.method public w()Z
    .locals 5

    invoke-virtual {p0}, Lag/d;->H()I

    move-result v0

    invoke-virtual {p0}, Lbg/f;->e()Linet/ipaddr/i;

    move-result-object v1

    invoke-virtual {v1}, Linet/ipaddr/c;->d()Linet/ipaddr/c$b;

    move-result-object v1

    invoke-virtual {v1}, Linet/ipaddr/c$b;->allPrefixedAddressesAreSubnets()Z

    move-result v1

    if-eqz v1, :cond_3

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_2

    invoke-virtual {p0, v2}, Linet/ipaddr/j;->q(I)Linet/ipaddr/k;

    move-result-object v3

    invoke-interface {v3}, Lag/l;->w()Z

    move-result v4

    if-nez v4, :cond_0

    return v1

    :cond_0
    invoke-virtual {v3}, Linet/ipaddr/k;->A2()Ljava/lang/Integer;

    move-result-object v3

    if-eqz v3, :cond_1

    goto :goto_1

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    const/4 v0, 0x1

    return v0

    :cond_3
    invoke-super {p0}, Lag/d;->w()Z

    move-result v0

    return v0
.end method

.method public x0(LZf/c;)Z
    .locals 5

    invoke-virtual {p0}, Linet/ipaddr/j;->Z()I

    move-result v0

    invoke-interface {p1}, LZf/e;->Z()I

    move-result v1

    const/4 v2, 0x0

    if-eq v0, v1, :cond_0

    return v2

    :cond_0
    invoke-virtual {p0}, Lag/d;->i()Z

    move-result v1

    const/4 v3, 0x1

    if-eqz v1, :cond_1

    invoke-virtual {p0}, Lbg/f;->e()Linet/ipaddr/i;

    move-result-object v1

    invoke-virtual {v1}, Linet/ipaddr/c;->d()Linet/ipaddr/c$b;

    move-result-object v1

    invoke-virtual {v1}, Linet/ipaddr/c$b;->allPrefixedAddressesAreSubnets()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p0}, Lbg/f;->F0()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-interface {p0}, LZf/e;->e0()I

    move-result v1

    invoke-interface {p0}, LZf/e;->m0()I

    move-result v4

    invoke-static {v0, v1, v4}, Linet/ipaddr/j;->p1(III)I

    move-result v0

    goto :goto_0

    :cond_1
    sub-int/2addr v0, v3

    :goto_0
    if-ltz v0, :cond_3

    invoke-virtual {p0, v0}, Linet/ipaddr/j;->q(I)Linet/ipaddr/k;

    move-result-object v1

    invoke-interface {p1, v0}, LZf/e;->q(I)LZf/d;

    move-result-object v4

    invoke-interface {v1, v4}, LZf/d;->L0(LZf/d;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_3
    return v3
.end method

.method protected x2(II)J
    .locals 2

    invoke-virtual {p0, p1}, Linet/ipaddr/j;->i2(I)Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-virtual {p0}, Lag/d;->A0()Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-interface {p0}, LZf/e;->m0()I

    move-result p2

    invoke-interface {p0}, LZf/e;->e0()I

    move-result v0

    invoke-static {p1, v0, p2}, Linet/ipaddr/j;->p1(III)I

    move-result v0

    new-instance v1, LZf/l;

    invoke-direct {v1, p0, v0, p2, p1}, LZf/l;-><init>(Linet/ipaddr/j;III)V

    add-int/lit8 v0, v0, 0x1

    invoke-static {v1, v0}, Lbg/d;->n1(Ljava/util/function/IntUnaryOperator;I)J

    move-result-wide p1

    return-wide p1

    :cond_0
    const-wide/16 p1, 0x1

    return-wide p1

    :cond_1
    const-wide/16 p1, 0x0

    return-wide p1
.end method
