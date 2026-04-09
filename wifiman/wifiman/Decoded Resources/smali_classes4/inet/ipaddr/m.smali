.class public abstract Linet/ipaddr/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lag/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Linet/ipaddr/m$e;,
        Linet/ipaddr/m$c;,
        Linet/ipaddr/m$d;
    }
.end annotation


# static fields
.field private static final e:[Linet/ipaddr/m;


# instance fields
.field protected final a:Linet/ipaddr/g;

.field protected final b:Linet/ipaddr/g;

.field private transient c:Ljava/math/BigInteger;

.field private transient d:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [Linet/ipaddr/m;

    sput-object v0, Linet/ipaddr/m;->e:[Linet/ipaddr/m;

    return-void
.end method

.method protected constructor <init>(Linet/ipaddr/g;Linet/ipaddr/g;Ljava/util/function/UnaryOperator;Ljava/util/function/UnaryOperator;Ljava/util/function/UnaryOperator;)V
    .locals 2

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    invoke-virtual {p1, p2}, Linet/ipaddr/g;->b0(Linet/ipaddr/g;)Z

    move-result v0

    if-nez v0, :cond_3

    invoke-virtual {p2, p1}, Linet/ipaddr/g;->b0(Linet/ipaddr/g;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    .line 6
    :cond_0
    invoke-interface {p3, p1}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Linet/ipaddr/g;

    .line 7
    invoke-interface {p3, p2}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Linet/ipaddr/g;

    .line 8
    invoke-interface {p4, p1}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Linet/ipaddr/g;

    .line 9
    invoke-interface {p4, p2}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Linet/ipaddr/g;

    .line 10
    invoke-static {v0, p3}, Linet/ipaddr/m;->C(Linet/ipaddr/g;Linet/ipaddr/g;)I

    move-result p4

    if-lez p4, :cond_1

    move-object v0, p3

    .line 11
    :cond_1
    invoke-static {p1, p2}, Linet/ipaddr/m;->C(Linet/ipaddr/g;Linet/ipaddr/g;)I

    move-result p3

    if-gez p3, :cond_2

    move-object p1, p2

    .line 12
    :cond_2
    invoke-interface {p5, v0}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Linet/ipaddr/g;

    iput-object p2, p0, Linet/ipaddr/m;->a:Linet/ipaddr/g;

    .line 13
    invoke-interface {p5, p1}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Linet/ipaddr/g;

    iput-object p1, p0, Linet/ipaddr/m;->b:Linet/ipaddr/g;

    goto :goto_3

    :cond_3
    :goto_0
    if-eqz v0, :cond_4

    .line 14
    invoke-interface {p5, p1}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    :goto_1
    check-cast p1, Linet/ipaddr/g;

    goto :goto_2

    :cond_4
    invoke-interface {p5, p2}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_1

    .line 15
    :goto_2
    invoke-interface {p3, p1}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Linet/ipaddr/g;

    iput-object p2, p0, Linet/ipaddr/m;->a:Linet/ipaddr/g;

    .line 16
    invoke-interface {p4, p1}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Linet/ipaddr/g;

    iput-object p1, p0, Linet/ipaddr/m;->b:Linet/ipaddr/g;

    :goto_3
    return-void
.end method

.method protected constructor <init>(Linet/ipaddr/g;Linet/ipaddr/g;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Linet/ipaddr/m;->a:Linet/ipaddr/g;

    .line 3
    iput-object p2, p0, Linet/ipaddr/m;->b:Linet/ipaddr/g;

    return-void
.end method

.method private static C(Linet/ipaddr/g;Linet/ipaddr/g;)I
    .locals 0

    invoke-static {p0, p1}, Linet/ipaddr/g;->T(Linet/ipaddr/g;Linet/ipaddr/g;)I

    move-result p0

    return p0
.end method

.method protected static J(Lag/a;Ljava/util/function/Predicate;Linet/ipaddr/m$c;Ljava/util/function/Function;Ljava/util/function/Predicate;Ljava/util/function/ToLongFunction;)Ldg/a;
    .locals 8

    new-instance v7, Linet/ipaddr/j$a;

    move-object v0, v7

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v0 .. v6}, Linet/ipaddr/j$a;-><init>(Lag/a;Ljava/util/function/Predicate;Linet/ipaddr/j$f;Ljava/util/function/Function;Ljava/util/function/Predicate;Ljava/util/function/ToLongFunction;)V

    return-object v7
.end method

.method protected static T(Lag/a;Ljava/util/function/Predicate;Linet/ipaddr/m$c;Ljava/util/function/ToLongFunction;)Ldg/a;
    .locals 1

    new-instance v0, Linet/ipaddr/j$a;

    invoke-direct {v0, p0, p1, p2, p3}, Linet/ipaddr/j$a;-><init>(Lag/a;Ljava/util/function/Predicate;Linet/ipaddr/j$f;Ljava/util/function/ToLongFunction;)V

    return-object v0
.end method

.method protected static U0(Linet/ipaddr/a;Lbg/a;)Ljava/util/Iterator;
    .locals 1

    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Linet/ipaddr/j;->q2(Linet/ipaddr/a;Lbg/a;Ljava/util/Iterator;)Ljava/util/Iterator;

    move-result-object p0

    return-object p0
.end method

.method protected static V0(Linet/ipaddr/g;Linet/ipaddr/g;Lbg/a;Linet/ipaddr/j$e;Linet/ipaddr/j$e;Linet/ipaddr/m$e;IILinet/ipaddr/j$e;)Ljava/util/Iterator;
    .locals 20

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v6, p2

    invoke-virtual/range {p0 .. p0}, Linet/ipaddr/a;->Z()I

    move-result v2

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3, v2}, Ljava/util/ArrayList;-><init>(I)V

    add-int/lit8 v4, v2, 0x1

    new-array v4, v4, [Z

    const/4 v5, 0x0

    const/4 v13, 0x1

    aput-boolean v13, v4, v5

    const/4 v14, 0x0

    move v15, v5

    move/from16 v16, v13

    move-object v7, v14

    :goto_0
    if-ge v15, v2, :cond_4

    move/from16 v12, p6

    if-eqz p8, :cond_0

    if-lt v15, v12, :cond_0

    move-object/from16 v10, p3

    move-object/from16 v11, p8

    goto :goto_1

    :cond_0
    move-object/from16 v10, p3

    move-object/from16 v11, p4

    :goto_1
    invoke-interface {v10, v0, v15}, Linet/ipaddr/j$e;->a(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Linet/ipaddr/k;

    if-eqz v16, :cond_2

    move-object/from16 v9, p5

    invoke-interface {v9, v0, v1, v15}, Linet/ipaddr/m$e;->a(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v16

    if-eqz v16, :cond_1

    add-int/lit8 v17, v15, 0x1

    aput-boolean v13, v4, v17

    invoke-interface {v11, v8, v15}, Linet/ipaddr/j$e;->a(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/Iterator;

    new-instance v11, LZf/n;

    invoke-direct {v11, v8}, LZf/n;-><init>(Ljava/util/Iterator;)V

    invoke-virtual {v3, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_1
    invoke-virtual {v8}, Linet/ipaddr/k;->Q()I

    move-result v8

    invoke-interface {v1, v15}, Linet/ipaddr/l;->q(I)Linet/ipaddr/k;

    move-result-object v17

    invoke-virtual/range {v17 .. v17}, Linet/ipaddr/k;->Q()I

    move-result v13

    invoke-virtual {v6, v8, v13, v14}, Linet/ipaddr/format/validate/f;->c(IILjava/lang/Integer;)LZf/d;

    move-result-object v8

    check-cast v8, Linet/ipaddr/k;

    invoke-interface {v11, v8, v15}, Linet/ipaddr/j$e;->a(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/Iterator;

    new-instance v11, Linet/ipaddr/m$a;

    invoke-direct {v11, v8, v4, v15}, Linet/ipaddr/m$a;-><init>(Ljava/util/Iterator;[ZI)V

    new-instance v8, LZf/o;

    invoke-direct {v8, v11}, LZf/o;-><init>(Ljava/util/Iterator;)V

    invoke-virtual {v3, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_2
    move/from16 v19, v5

    goto :goto_5

    :cond_2
    move-object/from16 v9, p5

    invoke-virtual {v8}, Linet/ipaddr/k;->Q()I

    move-result v8

    invoke-virtual/range {p0 .. p0}, Linet/ipaddr/g;->I0()I

    move-result v13

    invoke-virtual {v6, v8, v13, v14}, Linet/ipaddr/format/validate/f;->c(IILjava/lang/Integer;)LZf/d;

    move-result-object v8

    check-cast v8, Linet/ipaddr/k;

    invoke-interface {v11, v8, v15}, Linet/ipaddr/j$e;->a(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v8

    move-object v13, v8

    check-cast v13, Ljava/util/Iterator;

    invoke-interface {v1, v15}, Linet/ipaddr/l;->q(I)Linet/ipaddr/k;

    move-result-object v8

    invoke-virtual {v8}, Linet/ipaddr/k;->Q()I

    move-result v8

    invoke-virtual {v6, v5, v8, v14}, Linet/ipaddr/format/validate/f;->c(IILjava/lang/Integer;)LZf/d;

    move-result-object v8

    check-cast v8, Linet/ipaddr/k;

    invoke-interface {v11, v8, v15}, Linet/ipaddr/j$e;->a(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/Iterator;

    new-instance v5, Linet/ipaddr/m$b;

    invoke-direct {v5, v8, v4, v15}, Linet/ipaddr/m$b;-><init>(Ljava/util/Iterator;[ZI)V

    if-nez v7, :cond_3

    invoke-virtual/range {p0 .. p0}, Linet/ipaddr/g;->I0()I

    move-result v7

    const/4 v8, 0x0

    invoke-virtual {v6, v8, v7, v14}, Linet/ipaddr/format/validate/f;->c(IILjava/lang/Integer;)LZf/d;

    move-result-object v7

    check-cast v7, Linet/ipaddr/k;

    :goto_3
    move-object/from16 v17, v7

    goto :goto_4

    :cond_3
    const/4 v8, 0x0

    goto :goto_3

    :goto_4
    new-instance v7, LZf/p;

    move-object/from16 v18, v7

    move/from16 v19, v8

    move-object v8, v4

    move v9, v15

    move-object v10, v5

    move-object/from16 v12, v17

    invoke-direct/range {v7 .. v12}, LZf/p;-><init>([ZILjava/util/Iterator;Linet/ipaddr/j$e;Linet/ipaddr/k;)V

    new-instance v5, LZf/q;

    invoke-direct {v5, v3, v15, v7, v13}, LZf/q;-><init>(Ljava/util/ArrayList;ILjava/util/function/Supplier;Ljava/util/Iterator;)V

    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object/from16 v7, v17

    :goto_5
    add-int/lit8 v15, v15, 0x1

    move/from16 v5, v19

    const/4 v13, 0x1

    goto/16 :goto_0

    :cond_4
    new-instance v5, LZf/r;

    invoke-direct {v5, v3}, LZf/r;-><init>(Ljava/util/ArrayList;)V

    invoke-virtual/range {p0 .. p0}, Linet/ipaddr/a;->Z()I

    move-result v0

    move-object/from16 v1, p2

    move-object v2, v5

    move/from16 v3, p6

    move/from16 v4, p7

    invoke-static/range {v0 .. v5}, Linet/ipaddr/j;->p2(ILinet/ipaddr/c$a;Ljava/util/function/IntFunction;IILjava/util/function/IntFunction;)Ljava/util/Iterator;

    move-result-object v0

    invoke-static {v14, v6, v0}, Linet/ipaddr/j;->q2(Linet/ipaddr/a;Lbg/a;Ljava/util/Iterator;)Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method

.method private static synthetic W0(Ljava/util/Iterator;)Ljava/util/Iterator;
    .locals 0

    return-object p0
.end method

.method private static synthetic X0(Ljava/util/Iterator;)Ljava/util/Iterator;
    .locals 0

    return-object p0
.end method

.method private static synthetic Y0([ZILjava/util/Iterator;Linet/ipaddr/j$e;Linet/ipaddr/k;)Ljava/util/Iterator;
    .locals 0

    aget-boolean p0, p0, p1

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p3, p4, p1}, Linet/ipaddr/j$e;->a(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object p0

    move-object p2, p0

    check-cast p2, Ljava/util/Iterator;

    :goto_0
    return-object p2
.end method

.method private static synthetic Z0(Ljava/util/ArrayList;ILjava/util/function/Supplier;Ljava/util/Iterator;)Ljava/util/Iterator;
    .locals 0

    invoke-virtual {p0, p1, p2}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    return-object p3
.end method

.method private static synthetic a1(Ljava/util/ArrayList;I)Ljava/util/Iterator;
    .locals 0

    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/function/Supplier;

    invoke-interface {p0}, Ljava/util/function/Supplier;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/Iterator;

    return-object p0
.end method

.method protected static b1(Linet/ipaddr/m$d;Ljava/util/function/BiFunction;Linet/ipaddr/c$a;[LZf/d;[LZf/d;IILjava/lang/Integer;)Z
    .locals 7

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    const/4 v2, 0x1

    if-ge v1, p6, :cond_1

    aget-object v3, p3, v1

    aget-object v4, p4, v1

    invoke-interface {v3}, LZf/d;->Q()I

    move-result v3

    invoke-interface {v4}, LZf/d;->Q()I

    move-result v4

    if-eq v3, v4, :cond_0

    sub-int/2addr v4, v3

    ushr-int/lit8 p6, v4, 0x1

    add-int/2addr v3, p6

    invoke-interface {p2, v3}, Linet/ipaddr/c$a;->a(I)LZf/d;

    move-result-object p6

    add-int/2addr v3, v2

    invoke-interface {p2, v3}, Linet/ipaddr/c$a;->a(I)LZf/d;

    move-result-object v3

    move v4, v2

    goto :goto_1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const/4 p6, 0x0

    move-object v3, p6

    move v4, v0

    :goto_1
    if-ne v1, p5, :cond_2

    if-nez v4, :cond_2

    aget-object p5, p3, v1

    aget-object v5, p4, v1

    invoke-interface {p5}, Lag/g;->f()I

    move-result v6

    invoke-static {v6, p7, v1}, Linet/ipaddr/j;->s1(ILjava/lang/Integer;I)Ljava/lang/Integer;

    move-result-object p7

    invoke-virtual {p7}, Ljava/lang/Integer;->intValue()I

    move-result p7

    sub-int/2addr v6, p7

    invoke-interface {p5}, LZf/d;->Q()I

    move-result p5

    invoke-interface {v5}, LZf/d;->Q()I

    move-result p7

    ushr-int/2addr p5, v6

    ushr-int/2addr p7, v6

    if-eq p5, p7, :cond_2

    sub-int/2addr p7, p5

    ushr-int/lit8 p6, p7, 0x1

    add-int/2addr p5, p6

    add-int/lit8 p6, p5, 0x1

    shl-int/2addr p5, v6

    const/4 p7, -0x1

    shl-int/2addr p7, v6

    not-int p7, p7

    or-int/2addr p5, p7

    shl-int/2addr p6, v6

    invoke-interface {p2, p5}, Linet/ipaddr/c$a;->a(I)LZf/d;

    move-result-object p5

    invoke-interface {p2, p6}, Linet/ipaddr/c$a;->a(I)LZf/d;

    move-result-object v3

    move-object p6, p5

    goto :goto_2

    :cond_2
    move v2, v4

    :goto_2
    if-eqz v2, :cond_3

    array-length p5, p3

    invoke-interface {p2, p5}, Linet/ipaddr/c$a;->d(I)[LZf/d;

    move-result-object p7

    invoke-interface {p2, p5}, Linet/ipaddr/c$a;->d(I)[LZf/d;

    move-result-object p5

    invoke-static {p3, v0, p7, v0, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-static {p3, v0, p5, v0, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/lit8 v4, v1, 0x1

    aput-object p6, p7, v1

    aput-object v3, p5, v1

    array-length v1, p7

    invoke-interface {p6}, LZf/d;->I0()I

    move-result p6

    invoke-interface {p2, p6}, Linet/ipaddr/c$a;->a(I)LZf/d;

    move-result-object p6

    invoke-static {p7, v4, v1, p6}, Ljava/util/Arrays;->fill([Ljava/lang/Object;IILjava/lang/Object;)V

    array-length p6, p5

    invoke-interface {p2, v0}, Linet/ipaddr/c$a;->a(I)LZf/d;

    move-result-object p2

    invoke-static {p5, v4, p6, p2}, Ljava/util/Arrays;->fill([Ljava/lang/Object;IILjava/lang/Object;)V

    invoke-interface {p1, p3, p7}, Ljava/util/function/BiFunction;->apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Linet/ipaddr/m;

    invoke-interface {p1, p5, p4}, Ljava/util/function/BiFunction;->apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Linet/ipaddr/m;

    invoke-interface {p0, p2, p1}, Linet/ipaddr/m$d;->b(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_3
    return v2
.end method

.method public static synthetic g(Ljava/util/ArrayList;ILjava/util/function/Supplier;Ljava/util/Iterator;)Ljava/util/Iterator;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Linet/ipaddr/m;->Z0(Ljava/util/ArrayList;ILjava/util/function/Supplier;Ljava/util/Iterator;)Ljava/util/Iterator;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j([ZILjava/util/Iterator;Linet/ipaddr/j$e;Linet/ipaddr/k;)Ljava/util/Iterator;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Linet/ipaddr/m;->Y0([ZILjava/util/Iterator;Linet/ipaddr/j$e;Linet/ipaddr/k;)Ljava/util/Iterator;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic s(Ljava/util/Iterator;)Ljava/util/Iterator;
    .locals 0

    invoke-static {p0}, Linet/ipaddr/m;->X0(Ljava/util/Iterator;)Ljava/util/Iterator;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic v(Ljava/util/ArrayList;I)Ljava/util/Iterator;
    .locals 0

    invoke-static {p0, p1}, Linet/ipaddr/m;->a1(Ljava/util/ArrayList;I)Ljava/util/Iterator;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic y(Ljava/util/Iterator;)Ljava/util/Iterator;
    .locals 0

    invoke-static {p0}, Linet/ipaddr/m;->W0(Ljava/util/Iterator;)Ljava/util/Iterator;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public A0()Z
    .locals 2

    iget-object v0, p0, Linet/ipaddr/m;->c:Ljava/math/BigInteger;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Linet/ipaddr/m;->q0()Linet/ipaddr/g;

    move-result-object v0

    invoke-virtual {p0}, Linet/ipaddr/m;->K0()Linet/ipaddr/g;

    move-result-object v1

    invoke-virtual {v0, v1}, Linet/ipaddr/a;->equals(Ljava/lang/Object;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0

    :cond_0
    invoke-super {p0}, Lag/g;->A0()Z

    move-result v0

    return v0
.end method

.method public K0()Linet/ipaddr/g;
    .locals 1

    iget-object v0, p0, Linet/ipaddr/m;->b:Linet/ipaddr/g;

    return-object v0
.end method

.method public L()Z
    .locals 1

    invoke-virtual {p0}, Linet/ipaddr/m;->q0()Linet/ipaddr/g;

    move-result-object v0

    invoke-virtual {v0}, Linet/ipaddr/a;->c0()Z

    move-result v0

    return v0
.end method

.method public O()Z
    .locals 1

    invoke-virtual {p0}, Linet/ipaddr/m;->K0()Linet/ipaddr/g;

    move-result-object v0

    invoke-virtual {v0}, Linet/ipaddr/a;->H0()Z

    move-result v0

    return v0
.end method

.method public R()Ljava/math/BigInteger;
    .locals 1

    invoke-virtual {p0}, Linet/ipaddr/m;->K0()Linet/ipaddr/g;

    move-result-object v0

    invoke-virtual {v0}, Linet/ipaddr/a;->getValue()Ljava/math/BigInteger;

    move-result-object v0

    return-object v0
.end method

.method public Y()Ljava/lang/String;
    .locals 1

    const-string v0, " -> "

    invoke-virtual {p0, v0}, Linet/ipaddr/m;->c1(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected b0()Ljava/math/BigInteger;
    .locals 1

    invoke-super {p0}, Lag/g;->getCount()Ljava/math/BigInteger;

    move-result-object v0

    return-object v0
.end method

.method public c1(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    new-instance v0, LZf/m;

    invoke-direct {v0}, LZf/m;-><init>()V

    invoke-virtual {p0, v0, p1, v0}, Linet/ipaddr/m;->d1(Ljava/util/function/Function;Ljava/lang/String;Ljava/util/function/Function;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public d1(Ljava/util/function/Function;Ljava/lang/String;Ljava/util/function/Function;)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Linet/ipaddr/m;->q0()Linet/ipaddr/g;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Linet/ipaddr/m;->K0()Linet/ipaddr/g;

    move-result-object p1

    invoke-interface {p3, p1}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Linet/ipaddr/m;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, Linet/ipaddr/m;

    invoke-virtual {p0}, Linet/ipaddr/m;->q0()Linet/ipaddr/g;

    move-result-object v0

    invoke-virtual {p1}, Linet/ipaddr/m;->q0()Linet/ipaddr/g;

    move-result-object v2

    invoke-virtual {v0, v2}, Linet/ipaddr/a;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Linet/ipaddr/m;->K0()Linet/ipaddr/g;

    move-result-object v0

    invoke-virtual {p1}, Linet/ipaddr/m;->K0()Linet/ipaddr/g;

    move-result-object p1

    invoke-virtual {v0, p1}, Linet/ipaddr/a;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1
.end method

.method public f()I
    .locals 1

    invoke-virtual {p0}, Linet/ipaddr/m;->q0()Linet/ipaddr/g;

    move-result-object v0

    invoke-virtual {v0}, Linet/ipaddr/a;->f()I

    move-result v0

    return v0
.end method

.method public getCount()Ljava/math/BigInteger;
    .locals 1

    iget-object v0, p0, Linet/ipaddr/m;->c:Ljava/math/BigInteger;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Linet/ipaddr/m;->b0()Ljava/math/BigInteger;

    move-result-object v0

    iput-object v0, p0, Linet/ipaddr/m;->c:Ljava/math/BigInteger;

    :cond_0
    return-object v0
.end method

.method public getValue()Ljava/math/BigInteger;
    .locals 1

    invoke-virtual {p0}, Linet/ipaddr/m;->q0()Linet/ipaddr/g;

    move-result-object v0

    invoke-virtual {v0}, Linet/ipaddr/a;->getValue()Ljava/math/BigInteger;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Linet/ipaddr/m;->d:I

    if-nez v0, :cond_0

    invoke-virtual {p0}, Linet/ipaddr/m;->q0()Linet/ipaddr/g;

    move-result-object v0

    invoke-virtual {v0}, Linet/ipaddr/a;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Linet/ipaddr/m;->K0()Linet/ipaddr/g;

    move-result-object v1

    invoke-virtual {v1}, Linet/ipaddr/a;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    iput v0, p0, Linet/ipaddr/m;->d:I

    :cond_0
    return v0
.end method

.method public q0()Linet/ipaddr/g;
    .locals 1

    iget-object v0, p0, Linet/ipaddr/m;->a:Linet/ipaddr/g;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Linet/ipaddr/m;->Y()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
