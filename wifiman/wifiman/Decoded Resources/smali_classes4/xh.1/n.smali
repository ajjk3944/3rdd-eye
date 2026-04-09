.class public final Lxh/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lxh/h;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lxh/n$a;,
        Lxh/n$b;
    }
.end annotation


# instance fields
.field private final a:Z

.field private final b:Lxh/h;

.field private final c:Ljava/lang/reflect/Member;

.field private final d:Lxh/n$a;

.field private final e:[Lsh/i;

.field private final f:Z


# direct methods
.method public constructor <init>(LBh/b;Lxh/h;Z)V
    .locals 10

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "oldCaller"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p3, p0, Lxh/n;->a:Z

    instance-of v0, p2, Lxh/i$h$c;

    const/4 v1, 0x0

    const/4 v2, 0x0

    if-eqz v0, :cond_6

    invoke-interface {p1}, LBh/a;->k0()LBh/b0;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-interface {p1}, LBh/a;->d0()LBh/b0;

    move-result-object v0

    :cond_0
    if-eqz v0, :cond_1

    invoke-interface {v0}, LBh/r0;->getType()Lpi/S;

    move-result-object v0

    goto :goto_0

    :cond_1
    move-object v0, v1

    :goto_0
    if-eqz v0, :cond_6

    invoke-static {v0}, Lbi/k;->i(Lpi/S;)Z

    move-result v3

    if-eqz v3, :cond_6

    if-eqz p3, :cond_4

    invoke-interface {p1}, LBh/a;->i()Ljava/util/List;

    move-result-object p3

    const-string v3, "getValueParameters(...)"

    invoke-static {p3, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p3, Ljava/lang/Iterable;

    instance-of v3, p3, Ljava/util/Collection;

    if-eqz v3, :cond_2

    move-object v3, p3

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_2

    goto :goto_2

    :cond_2
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :cond_3
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LBh/s0;

    invoke-interface {v3}, LBh/s0;->s0()Z

    move-result v3

    if-eqz v3, :cond_3

    :cond_4
    invoke-static {v0}, Lpi/F0;->a(Lpi/S;)Lpi/d0;

    move-result-object p3

    invoke-static {p3}, Lxh/o;->n(Lpi/d0;)Ljava/util/List;

    move-result-object p3

    invoke-static {p3}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    check-cast p3, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {p3, v3}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v0, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_1
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/reflect/Method;

    move-object v4, p2

    check-cast v4, Lxh/i$h$c;

    invoke-virtual {v4}, Lxh/i$h$c;->g()Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v3, v4, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_5
    new-array p3, v2, [Ljava/lang/Object;

    invoke-interface {v0, p3}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p3

    new-instance v0, Lxh/i$h$d;

    check-cast p2, Lxh/i$h;

    invoke-virtual {p2}, Lxh/i;->b()Ljava/lang/reflect/Member;

    move-result-object p2

    check-cast p2, Ljava/lang/reflect/Method;

    invoke-direct {v0, p2, p3}, Lxh/i$h$d;-><init>(Ljava/lang/reflect/Method;[Ljava/lang/Object;)V

    move-object p2, v0

    :cond_6
    :goto_2
    iput-object p2, p0, Lxh/n;->b:Lxh/h;

    invoke-interface {p2}, Lxh/h;->b()Ljava/lang/reflect/Member;

    move-result-object p3

    iput-object p3, p0, Lxh/n;->c:Ljava/lang/reflect/Member;

    invoke-interface {p1}, LBh/a;->getReturnType()Lpi/S;

    move-result-object p3

    invoke-static {p3}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    instance-of v0, p1, LBh/z;

    const/4 v3, 0x1

    if-eqz v0, :cond_8

    move-object v4, p1

    check-cast v4, LBh/z;

    invoke-interface {v4}, LBh/z;->isSuspend()Z

    move-result v4

    if-eqz v4, :cond_8

    invoke-static {p3}, Lbi/k;->j(Lpi/S;)Lpi/S;

    move-result-object v4

    if-eqz v4, :cond_8

    invoke-static {v4}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->s0(Lpi/S;)Z

    move-result v4

    if-ne v4, v3, :cond_8

    :cond_7
    move-object p3, v1

    goto :goto_3

    :cond_8
    invoke-static {p3}, Lxh/o;->f(Lpi/S;)Ljava/lang/Class;

    move-result-object p3

    if-eqz p3, :cond_7

    invoke-static {p3, p1}, Lxh/o;->c(Ljava/lang/Class;LBh/b;)Ljava/lang/reflect/Method;

    move-result-object p3

    :goto_3
    invoke-static {p1}, Lbi/k;->a(LBh/a;)Z

    move-result v4

    if-eqz v4, :cond_9

    new-instance p1, Lxh/n$a;

    sget-object p2, Lsh/i;->e:Lsh/i$a;

    invoke-virtual {p2}, Lsh/i$a;->a()Lsh/i;

    move-result-object p2

    new-array v0, v2, [Ljava/util/List;

    invoke-direct {p1, p2, v0, p3}, Lxh/n$a;-><init>(Lsh/i;[Ljava/util/List;Ljava/lang/reflect/Method;)V

    goto/16 :goto_d

    :cond_9
    instance-of v4, p2, Lxh/i$h$c;

    const/4 v5, -0x1

    if-nez v4, :cond_e

    instance-of v4, p2, Lxh/i$h$d;

    if-eqz v4, :cond_a

    goto :goto_5

    :cond_a
    instance-of v4, p1, LBh/l;

    if-eqz v4, :cond_c

    instance-of v4, p2, Lxh/g;

    if-eqz v4, :cond_b

    goto :goto_5

    :cond_b
    :goto_4
    move v5, v2

    goto :goto_5

    :cond_c
    invoke-interface {p1}, LBh/a;->d0()LBh/b0;

    move-result-object v4

    if-eqz v4, :cond_b

    instance-of v4, p2, Lxh/g;

    if-nez v4, :cond_b

    invoke-interface {p1}, LBh/n;->b()LBh/m;

    move-result-object v4

    const-string v5, "getContainingDeclaration(...)"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v4}, Lbi/k;->g(LBh/m;)Z

    move-result v4

    if-eqz v4, :cond_d

    goto :goto_4

    :cond_d
    move v5, v3

    :cond_e
    :goto_5
    instance-of v4, p2, Lxh/i$h$d;

    if-eqz v4, :cond_f

    move-object v4, p2

    check-cast v4, Lxh/i$h$d;

    invoke-virtual {v4}, Lxh/i$h$d;->h()I

    move-result v4

    neg-int v4, v4

    goto :goto_6

    :cond_f
    move v4, v5

    :goto_6
    invoke-interface {p2}, Lxh/h;->b()Ljava/lang/reflect/Member;

    move-result-object p2

    sget-object v6, Lxh/m;->a:Lxh/m;

    invoke-static {p1, p2, v6}, Lxh/o;->e(LBh/b;Ljava/lang/reflect/Member;Lmh/l;)Ljava/util/List;

    move-result-object p2

    iget-boolean v6, p0, Lxh/n;->a:Z

    if-eqz v6, :cond_11

    move-object v6, p2

    check-cast v6, Ljava/lang/Iterable;

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    move v7, v2

    :goto_7
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_10

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lpi/S;

    invoke-static {v8}, Lxh/n;->e(Lpi/S;)I

    move-result v8

    add-int/2addr v7, v8

    goto :goto_7

    :cond_10
    add-int/lit8 v7, v7, 0x1f

    div-int/lit8 v7, v7, 0x20

    add-int/2addr v7, v3

    goto :goto_8

    :cond_11
    move v7, v2

    :goto_8
    if-eqz v0, :cond_12

    move-object v0, p1

    check-cast v0, LBh/z;

    invoke-interface {v0}, LBh/z;->isSuspend()Z

    move-result v0

    if-eqz v0, :cond_12

    move v0, v3

    goto :goto_9

    :cond_12
    move v0, v2

    :goto_9
    add-int/2addr v7, v0

    move-object v0, p2

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    move v6, v2

    :goto_a
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_13

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lpi/S;

    invoke-static {v8}, Lxh/n;->e(Lpi/S;)I

    move-result v8

    add-int/2addr v6, v8

    goto :goto_a

    :cond_13
    add-int/2addr v6, v4

    add-int/2addr v6, v7

    iget-boolean v0, p0, Lxh/n;->a:Z

    invoke-static {p0, v6, p1, v0}, Lxh/o;->b(Lxh/h;ILBh/b;Z)V

    invoke-static {v5, v2}, Ljava/lang/Math;->max(II)I

    move-result v0

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v4

    add-int/2addr v4, v5

    invoke-static {v0, v4}, Lsh/m;->s(II)Lsh/i;

    move-result-object v0

    new-array v4, v6, [Ljava/util/List;

    move v7, v2

    :goto_b
    if-ge v7, v6, :cond_15

    invoke-virtual {v0}, Lsh/g;->i()I

    move-result v8

    invoke-virtual {v0}, Lsh/g;->j()I

    move-result v9

    if-gt v7, v9, :cond_14

    if-gt v8, v7, :cond_14

    sub-int v8, v7, v5

    invoke-interface {p2, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lpi/S;

    invoke-static {v8}, Lpi/F0;->a(Lpi/S;)Lpi/d0;

    move-result-object v8

    invoke-static {v8, p1}, Lxh/o;->d(Lpi/d0;LBh/b;)Ljava/util/List;

    move-result-object v8

    goto :goto_c

    :cond_14
    move-object v8, v1

    :goto_c
    aput-object v8, v4, v7

    add-int/lit8 v7, v7, 0x1

    goto :goto_b

    :cond_15
    new-instance p1, Lxh/n$a;

    invoke-direct {p1, v0, v4, p3}, Lxh/n$a;-><init>(Lsh/i;[Ljava/util/List;Ljava/lang/reflect/Method;)V

    :goto_d
    iput-object p1, p0, Lxh/n;->d:Lxh/n$a;

    invoke-static {}, LZg/v;->c()Ljava/util/List;

    move-result-object p2

    iget-object p3, p0, Lxh/n;->b:Lxh/h;

    instance-of v0, p3, Lxh/i$h$d;

    if-eqz v0, :cond_16

    check-cast p3, Lxh/i$h$d;

    invoke-virtual {p3}, Lxh/i$h$d;->g()[Ljava/lang/Object;

    move-result-object p3

    array-length p3, p3

    goto :goto_e

    :cond_16
    instance-of p3, p3, Lxh/i$h$c;

    if-eqz p3, :cond_17

    move p3, v3

    goto :goto_e

    :cond_17
    move p3, v2

    :goto_e
    if-lez p3, :cond_18

    invoke-static {v2, p3}, Lsh/m;->s(II)Lsh/i;

    move-result-object v0

    invoke-interface {p2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_18
    invoke-virtual {p1}, Lxh/n$a;->c()[Ljava/util/List;

    move-result-object p1

    array-length v0, p1

    move v1, v2

    :goto_f
    if-ge v1, v0, :cond_1a

    aget-object v4, p1, v1

    if-eqz v4, :cond_19

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    goto :goto_10

    :cond_19
    move v4, v3

    :goto_10
    add-int/2addr v4, p3

    invoke-static {p3, v4}, Lsh/m;->s(II)Lsh/i;

    move-result-object p3

    invoke-interface {p2, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    move p3, v4

    goto :goto_f

    :cond_1a
    invoke-static {p2}, LZg/v;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    new-array p2, v2, [Lsh/i;

    invoke-interface {p1, p2}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Lsh/i;

    iput-object p1, p0, Lxh/n;->e:[Lsh/i;

    iget-object p1, p0, Lxh/n;->d:Lxh/n$a;

    invoke-virtual {p1}, Lxh/n$a;->a()Lsh/i;

    move-result-object p1

    instance-of p2, p1, Ljava/util/Collection;

    if-eqz p2, :cond_1b

    move-object p2, p1

    check-cast p2, Ljava/util/Collection;

    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    move-result p2

    if-eqz p2, :cond_1b

    goto :goto_12

    :cond_1b
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1c
    :goto_11
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_1e

    move-object p2, p1

    check-cast p2, LZg/Q;

    invoke-virtual {p2}, LZg/Q;->d()I

    move-result p2

    iget-object p3, p0, Lxh/n;->d:Lxh/n$a;

    invoke-virtual {p3}, Lxh/n$a;->c()[Ljava/util/List;

    move-result-object p3

    aget-object p2, p3, p2

    if-nez p2, :cond_1d

    goto :goto_11

    :cond_1d
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p2

    if-le p2, v3, :cond_1c

    move v2, v3

    :cond_1e
    :goto_12
    iput-boolean v2, p0, Lxh/n;->f:Z

    return-void
.end method

.method static synthetic c(LBh/e;)Z
    .locals 0

    invoke-static {p0}, Lxh/n;->d(LBh/e;)Z

    move-result p0

    return p0
.end method

.method private static final d(LBh/e;)Z
    .locals 1

    const-string v0, "$this$makeKotlinParameterTypes"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lbi/k;->g(LBh/m;)Z

    move-result p0

    return p0
.end method

.method private static final e(Lpi/S;)I
    .locals 0

    invoke-static {p0}, Lpi/F0;->a(Lpi/S;)Lpi/d0;

    move-result-object p0

    invoke-static {p0}, Lxh/o;->n(Lpi/d0;)Ljava/util/List;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x1

    :goto_0
    return p0
.end method


# virtual methods
.method public a()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lxh/n;->b:Lxh/h;

    invoke-interface {v0}, Lxh/h;->a()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public b()Ljava/lang/reflect/Member;
    .locals 1

    iget-object v0, p0, Lxh/n;->c:Ljava/lang/reflect/Member;

    return-object v0
.end method

.method public call([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    const-string v0, "args"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lxh/n;->d:Lxh/n$a;

    invoke-virtual {v0}, Lxh/n$a;->a()Lsh/i;

    move-result-object v0

    iget-object v1, p0, Lxh/n;->d:Lxh/n$a;

    invoke-virtual {v1}, Lxh/n$a;->c()[Ljava/util/List;

    move-result-object v1

    iget-object v2, p0, Lxh/n;->d:Lxh/n$a;

    invoke-virtual {v2}, Lxh/n$a;->b()Ljava/lang/reflect/Method;

    move-result-object v2

    invoke-virtual {v0}, Lsh/i;->isEmpty()Z

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_0

    goto/16 :goto_9

    :cond_0
    iget-boolean v3, p0, Lxh/n;->f:Z

    const-string v5, "getReturnType(...)"

    const/4 v6, 0x0

    if-eqz v3, :cond_7

    array-length v3, p1

    invoke-static {v3}, LZg/v;->d(I)Ljava/util/List;

    move-result-object v3

    invoke-virtual {v0}, Lsh/g;->i()I

    move-result v7

    move v8, v6

    :goto_0
    if-ge v8, v7, :cond_1

    aget-object v9, p1, v8

    invoke-interface {v3, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Lsh/g;->i()I

    move-result v7

    invoke-virtual {v0}, Lsh/g;->j()I

    move-result v8

    if-gt v7, v8, :cond_5

    :goto_1
    aget-object v9, v1, v7

    aget-object v10, p1, v7

    if-eqz v9, :cond_4

    check-cast v9, Ljava/lang/Iterable;

    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_2
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_3

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    move-object v12, v3

    check-cast v12, Ljava/util/Collection;

    check-cast v11, Ljava/lang/reflect/Method;

    if-eqz v10, :cond_2

    invoke-virtual {v11, v10, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    goto :goto_3

    :cond_2
    invoke-virtual {v11}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object v11

    invoke-static {v11, v5}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v11}, Lwh/j1;->g(Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object v11

    :goto_3
    invoke-interface {v12, v11}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_3
    move-object v9, v3

    check-cast v9, Ljava/util/Collection;

    goto :goto_4

    :cond_4
    invoke-interface {v3, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_4
    if-eq v7, v8, :cond_5

    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    :cond_5
    invoke-virtual {v0}, Lsh/g;->j()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    invoke-static {p1}, LZg/n;->g0([Ljava/lang/Object;)I

    move-result v1

    if-gt v0, v1, :cond_6

    :goto_5
    aget-object v5, p1, v0

    invoke-interface {v3, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    if-eq v0, v1, :cond_6

    add-int/lit8 v0, v0, 0x1

    goto :goto_5

    :cond_6
    invoke-static {v3}, LZg/v;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    new-array v0, v6, [Ljava/lang/Object;

    invoke-interface {p1, v0}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    goto :goto_9

    :cond_7
    array-length v3, p1

    new-array v7, v3, [Ljava/lang/Object;

    :goto_6
    if-ge v6, v3, :cond_c

    invoke-virtual {v0}, Lsh/g;->i()I

    move-result v8

    invoke-virtual {v0}, Lsh/g;->j()I

    move-result v9

    if-gt v6, v9, :cond_b

    if-gt v8, v6, :cond_b

    aget-object v8, v1, v6

    if-eqz v8, :cond_8

    invoke-static {v8}, LZg/v;->R0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/reflect/Method;

    goto :goto_7

    :cond_8
    move-object v8, v4

    :goto_7
    aget-object v9, p1, v6

    if-nez v8, :cond_9

    goto :goto_8

    :cond_9
    if-eqz v9, :cond_a

    invoke-virtual {v8, v9, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    goto :goto_8

    :cond_a
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object v8

    invoke-static {v8, v5}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v8}, Lwh/j1;->g(Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object v9

    goto :goto_8

    :cond_b
    aget-object v9, p1, v6

    :goto_8
    aput-object v9, v7, v6

    add-int/lit8 v6, v6, 0x1

    goto :goto_6

    :cond_c
    move-object p1, v7

    :goto_9
    iget-object v0, p0, Lxh/n;->b:Lxh/h;

    invoke-interface {v0, p1}, Lxh/h;->call([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    if-ne p1, v0, :cond_d

    return-object p1

    :cond_d
    if-eqz v2, :cond_f

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v2, v4, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_e

    goto :goto_a

    :cond_e
    move-object p1, v0

    :cond_f
    :goto_a
    return-object p1
.end method

.method public final f(I)Lsh/i;
    .locals 2

    if-ltz p1, :cond_0

    iget-object v0, p0, Lxh/n;->e:[Lsh/i;

    array-length v1, v0

    if-ge p1, v1, :cond_0

    aget-object p1, v0, p1

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lxh/n;->e:[Lsh/i;

    array-length v1, v0

    if-nez v1, :cond_1

    new-instance v0, Lsh/i;

    invoke-direct {v0, p1, p1}, Lsh/i;-><init>(II)V

    :goto_0
    move-object p1, v0

    goto :goto_1

    :cond_1
    array-length v1, v0

    sub-int/2addr p1, v1

    invoke-static {v0}, LZg/n;->K0([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lsh/i;

    invoke-virtual {v0}, Lsh/g;->j()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    add-int/2addr p1, v0

    new-instance v0, Lsh/i;

    invoke-direct {v0, p1, p1}, Lsh/i;-><init>(II)V

    goto :goto_0

    :goto_1
    return-object p1
.end method

.method public getReturnType()Ljava/lang/reflect/Type;
    .locals 1

    iget-object v0, p0, Lxh/n;->b:Lxh/h;

    invoke-interface {v0}, Lxh/h;->getReturnType()Ljava/lang/reflect/Type;

    move-result-object v0

    return-object v0
.end method
