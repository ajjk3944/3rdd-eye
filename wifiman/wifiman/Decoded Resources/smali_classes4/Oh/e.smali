.class public final LOh/e;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:LMh/k;

.field private final b:LMh/p;

.field private final c:LOh/g;

.field private final d:Lpi/A0;


# direct methods
.method public constructor <init>(LMh/k;LMh/p;)V
    .locals 2

    const-string v0, "c"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "typeParameterResolver"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LOh/e;->a:LMh/k;

    iput-object p2, p0, LOh/e;->b:LMh/p;

    new-instance p1, LOh/g;

    invoke-direct {p1}, LOh/g;-><init>()V

    iput-object p1, p0, LOh/e;->c:LOh/g;

    new-instance p2, Lpi/A0;

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-direct {p2, p1, v0, v1, v0}, Lpi/A0;-><init>(Lpi/F;Lpi/x0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p2, p0, LOh/e;->d:Lpi/A0;

    return-void
.end method

.method static synthetic a(LOh/e;LBh/l0;LOh/a;Lpi/v0;LQh/j;)Lpi/S;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, LOh/e;->e(LOh/e;LBh/l0;LOh/a;Lpi/v0;LQh/j;)Lpi/S;

    move-result-object p0

    return-object p0
.end method

.method private final b(LQh/j;LBh/e;)Z
    .locals 1

    invoke-interface {p1}, LQh/j;->F()Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, LZg/v;->D0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LQh/x;

    invoke-static {p1}, LQh/A;->a(LQh/x;)Z

    move-result p1

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    sget-object p1, LAh/d;->a:LAh/d;

    invoke-virtual {p1, p2}, LAh/d;->b(LBh/e;)LBh/e;

    move-result-object p1

    invoke-interface {p1}, LBh/h;->k()Lpi/v0;

    move-result-object p1

    invoke-interface {p1}, Lpi/v0;->getParameters()Ljava/util/List;

    move-result-object p1

    const-string p2, "getParameters(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LZg/v;->D0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LBh/l0;

    if-eqz p1, :cond_1

    invoke-interface {p1}, LBh/l0;->p()Lpi/N0;

    move-result-object p1

    if-eqz p1, :cond_1

    sget-object p2, Lpi/N0;->OUT_VARIANCE:Lpi/N0;

    if-eq p1, p2, :cond_1

    const/4 v0, 0x1

    :cond_1
    return v0
.end method

.method private final c(LQh/j;LOh/a;Lpi/v0;)Ljava/util/List;
    .locals 9

    invoke-interface {p1}, LQh/j;->w()Z

    move-result v0

    const-string v1, "getParameters(...)"

    if-nez v0, :cond_1

    invoke-interface {p1}, LQh/j;->F()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p3}, Lpi/v0;->getParameters()Ljava/util/List;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    invoke-interface {p3}, Lpi/v0;->getParameters()Ljava/util/List;

    move-result-object v2

    invoke-static {v2, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz v0, :cond_2

    invoke-direct {p0, p1, v2, p3, p2}, LOh/e;->d(LQh/j;Ljava/util/List;Lpi/v0;LOh/a;)Ljava/util/List;

    move-result-object p1

    return-object p1

    :cond_2
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result p2

    invoke-interface {p1}, LQh/j;->F()Ljava/util/List;

    move-result-object p3

    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result p3

    const/16 v0, 0xa

    if-eq p2, p3, :cond_4

    check-cast v2, Ljava/lang/Iterable;

    new-instance p1, Ljava/util/ArrayList;

    invoke-static {v2, v0}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result p2

    invoke-direct {p1, p2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_3

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, LBh/l0;

    new-instance v0, Lpi/D0;

    sget-object v1, Lkotlin/reflect/jvm/internal/impl/types/error/k;->MISSED_TYPE_ARGUMENT_FOR_TYPE_PARAMETER:Lkotlin/reflect/jvm/internal/impl/types/error/k;

    invoke-interface {p3}, LBh/I;->getName()LZh/f;

    move-result-object p3

    invoke-virtual {p3}, LZh/f;->b()Ljava/lang/String;

    move-result-object p3

    filled-new-array {p3}, [Ljava/lang/String;

    move-result-object p3

    invoke-static {v1, p3}, Lkotlin/reflect/jvm/internal/impl/types/error/l;->d(Lkotlin/reflect/jvm/internal/impl/types/error/k;[Ljava/lang/String;)Lkotlin/reflect/jvm/internal/impl/types/error/i;

    move-result-object p3

    invoke-direct {v0, p3}, Lpi/D0;-><init>(Lpi/S;)V

    invoke-interface {p1, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_3
    invoke-static {p1}, LZg/v;->i1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-interface {p1}, LQh/j;->F()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, LZg/v;->q1(Ljava/lang/Iterable;)Ljava/lang/Iterable;

    move-result-object p1

    new-instance p2, Ljava/util/ArrayList;

    invoke-static {p1, v0}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result p3

    invoke-direct {p2, p3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, LZg/N;

    invoke-virtual {p3}, LZg/N;->a()I

    move-result v0

    invoke-virtual {p3}, LZg/N;->b()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, LQh/x;

    invoke-interface {v2}, Ljava/util/List;->size()I

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LBh/l0;

    sget-object v3, Lpi/I0;->COMMON:Lpi/I0;

    const/4 v7, 0x7

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, LOh/b;->b(Lpi/I0;ZZLBh/l0;ILjava/lang/Object;)LOh/a;

    move-result-object v1

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-direct {p0, p3, v1, v0}, LOh/e;->q(LQh/x;LOh/a;LBh/l0;)Lpi/B0;

    move-result-object p3

    invoke-interface {p2, p3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_5
    invoke-static {p2}, LZg/v;->i1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method private final d(LQh/j;Ljava/util/List;Lpi/v0;LOh/a;)Ljava/util/List;
    .locals 11

    check-cast p2, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p2, v1}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LBh/l0;

    invoke-virtual {p4}, LOh/a;->c()Ljava/util/Set;

    move-result-object v2

    const/4 v3, 0x0

    invoke-static {v1, v3, v2}, Lsi/d;->q(LBh/l0;Lpi/v0;Ljava/util/Set;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-static {v1, p4}, Lpi/J0;->t(LBh/l0;Lpi/G;)Lpi/B0;

    move-result-object v1

    goto :goto_1

    :cond_0
    new-instance v8, Lpi/Y;

    iget-object v2, p0, LOh/e;->a:LMh/k;

    invoke-virtual {v2}, LMh/k;->e()Loi/n;

    move-result-object v9

    new-instance v10, LOh/d;

    move-object v2, v10

    move-object v3, p0

    move-object v4, v1

    move-object v5, p4

    move-object v6, p3

    move-object v7, p1

    invoke-direct/range {v2 .. v7}, LOh/d;-><init>(LOh/e;LBh/l0;LOh/a;Lpi/v0;LQh/j;)V

    invoke-direct {v8, v9, v10}, Lpi/Y;-><init>(Loi/n;Lmh/a;)V

    iget-object v2, p0, LOh/e;->c:LOh/g;

    invoke-interface {p1}, LQh/j;->w()Z

    move-result v3

    invoke-virtual {p4, v3}, LOh/a;->j(Z)LOh/a;

    move-result-object v3

    iget-object v4, p0, LOh/e;->d:Lpi/A0;

    invoke-virtual {v2, v1, v3, v4, v8}, LOh/g;->a(LBh/l0;Lpi/G;Lpi/A0;Lpi/S;)Lpi/B0;

    move-result-object v1

    :goto_1
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method private static final e(LOh/e;LBh/l0;LOh/a;Lpi/v0;LQh/j;)Lpi/S;
    .locals 0

    iget-object p0, p0, LOh/e;->d:Lpi/A0;

    invoke-interface {p3}, Lpi/v0;->c()LBh/h;

    move-result-object p3

    if-eqz p3, :cond_0

    invoke-interface {p3}, LBh/h;->u()Lpi/d0;

    move-result-object p3

    goto :goto_0

    :cond_0
    const/4 p3, 0x0

    :goto_0
    invoke-virtual {p2, p3}, LOh/a;->k(Lpi/d0;)LOh/a;

    move-result-object p2

    invoke-interface {p4}, LQh/j;->w()Z

    move-result p3

    invoke-virtual {p2, p3}, LOh/a;->j(Z)LOh/a;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lpi/A0;->e(LBh/l0;Lpi/G;)Lpi/S;

    move-result-object p0

    return-object p0
.end method

.method private final f(LQh/j;LOh/a;Lpi/d0;)Lpi/d0;
    .locals 8

    if-eqz p3, :cond_1

    invoke-virtual {p3}, Lpi/S;->M0()Lpi/r0;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    :goto_0
    move-object v1, v0

    goto :goto_2

    :cond_1
    :goto_1
    new-instance v0, LMh/g;

    iget-object v2, p0, LOh/e;->a:LMh/k;

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, v0

    move-object v3, p1

    invoke-direct/range {v1 .. v6}, LMh/g;-><init>(LMh/k;LQh/d;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v0}, Lpi/s0;->b(Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;)Lpi/r0;

    move-result-object v0

    goto :goto_0

    :goto_2
    invoke-direct {p0, p1, p2}, LOh/e;->g(LQh/j;LOh/a;)Lpi/v0;

    move-result-object v2

    const/4 v0, 0x0

    if-nez v2, :cond_2

    return-object v0

    :cond_2
    invoke-direct {p0, p2}, LOh/e;->j(LOh/a;)Z

    move-result v4

    if-eqz p3, :cond_3

    invoke-virtual {p3}, Lpi/S;->N0()Lpi/v0;

    move-result-object v0

    :cond_3
    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {p1}, LQh/j;->w()Z

    move-result v0

    if-nez v0, :cond_4

    if-eqz v4, :cond_4

    const/4 p1, 0x1

    invoke-virtual {p3, p1}, Lpi/d0;->U0(Z)Lpi/d0;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-direct {p0, p1, p2, v2}, LOh/e;->c(LQh/j;LOh/a;Lpi/v0;)Ljava/util/List;

    move-result-object v3

    const/16 v6, 0x10

    const/4 v7, 0x0

    const/4 v5, 0x0

    invoke-static/range {v1 .. v7}, Lpi/V;->k(Lpi/r0;Lpi/v0;Ljava/util/List;ZLkotlin/reflect/jvm/internal/impl/types/checker/g;ILjava/lang/Object;)Lpi/d0;

    move-result-object p1

    return-object p1
.end method

.method private final g(LQh/j;LOh/a;)Lpi/v0;
    .locals 3

    invoke-interface {p1}, LQh/j;->r()LQh/i;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-direct {p0, p1}, LOh/e;->h(LQh/j;)Lpi/v0;

    move-result-object p1

    return-object p1

    :cond_0
    instance-of v1, v0, LQh/g;

    if-eqz v1, :cond_4

    move-object v1, v0

    check-cast v1, LQh/g;

    invoke-interface {v1}, LQh/g;->e()LZh/c;

    move-result-object v2

    if-eqz v2, :cond_3

    invoke-direct {p0, p1, p2, v2}, LOh/e;->k(LQh/j;LOh/a;LZh/c;)LBh/e;

    move-result-object p2

    if-nez p2, :cond_1

    iget-object p2, p0, LOh/e;->a:LMh/k;

    invoke-virtual {p2}, LMh/k;->a()LMh/d;

    move-result-object p2

    invoke-virtual {p2}, LMh/d;->n()LMh/n;

    move-result-object p2

    invoke-interface {p2, v1}, LMh/n;->a(LQh/g;)LBh/e;

    move-result-object p2

    :cond_1
    if-eqz p2, :cond_2

    invoke-interface {p2}, LBh/h;->k()Lpi/v0;

    move-result-object p2

    if-nez p2, :cond_6

    :cond_2
    invoke-direct {p0, p1}, LOh/e;->h(LQh/j;)Lpi/v0;

    move-result-object p2

    goto :goto_0

    :cond_3
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "Class type should have a FQ name: "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/AssertionError;

    invoke-direct {p2, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p2

    :cond_4
    instance-of p1, v0, LQh/y;

    if-eqz p1, :cond_7

    iget-object p1, p0, LOh/e;->b:LMh/p;

    check-cast v0, LQh/y;

    invoke-interface {p1, v0}, LMh/p;->a(LQh/y;)LBh/l0;

    move-result-object p1

    if-eqz p1, :cond_5

    invoke-interface {p1}, LBh/l0;->k()Lpi/v0;

    move-result-object p2

    goto :goto_0

    :cond_5
    const/4 p2, 0x0

    :cond_6
    :goto_0
    return-object p2

    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unknown classifier kind: "

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private final h(LQh/j;)Lpi/v0;
    .locals 2

    sget-object v0, LZh/b;->d:LZh/b$a;

    new-instance v1, LZh/c;

    invoke-interface {p1}, LQh/j;->x()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, LZh/c;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, LZh/b$a;->c(LZh/c;)LZh/b;

    move-result-object p1

    iget-object v0, p0, LOh/e;->a:LMh/k;

    invoke-virtual {v0}, LMh/k;->a()LMh/d;

    move-result-object v0

    invoke-virtual {v0}, LMh/d;->b()LSh/n;

    move-result-object v0

    invoke-virtual {v0}, LSh/n;->f()Lli/n;

    move-result-object v0

    invoke-virtual {v0}, Lli/n;->r()LBh/L;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v1}, LZg/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, LBh/L;->d(LZh/b;Ljava/util/List;)LBh/e;

    move-result-object p1

    invoke-interface {p1}, LBh/h;->k()Lpi/v0;

    move-result-object p1

    const-string v0, "getTypeConstructor(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private final i(Lpi/N0;LBh/l0;)Z
    .locals 3

    invoke-interface {p2}, LBh/l0;->p()Lpi/N0;

    move-result-object v0

    sget-object v1, Lpi/N0;->INVARIANT:Lpi/N0;

    const/4 v2, 0x0

    if-ne v0, v1, :cond_0

    return v2

    :cond_0
    invoke-interface {p2}, LBh/l0;->p()Lpi/N0;

    move-result-object p2

    if-eq p1, p2, :cond_1

    const/4 v2, 0x1

    :cond_1
    return v2
.end method

.method private final j(LOh/a;)Z
    .locals 3

    invoke-virtual {p1}, LOh/a;->g()LOh/c;

    move-result-object v0

    sget-object v1, LOh/c;->FLEXIBLE_LOWER_BOUND:LOh/c;

    const/4 v2, 0x0

    if-ne v0, v1, :cond_0

    return v2

    :cond_0
    invoke-virtual {p1}, LOh/a;->h()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p1}, LOh/a;->b()Lpi/I0;

    move-result-object p1

    sget-object v0, Lpi/I0;->SUPERTYPE:Lpi/I0;

    if-eq p1, v0, :cond_1

    const/4 v2, 0x1

    :cond_1
    return v2
.end method

.method private final k(LQh/j;LOh/a;LZh/c;)LBh/e;
    .locals 7

    invoke-virtual {p2}, LOh/a;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, LOh/f;->a()LZh/c;

    move-result-object v0

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p0, LOh/e;->a:LMh/k;

    invoke-virtual {p1}, LMh/k;->a()LMh/d;

    move-result-object p1

    invoke-virtual {p1}, LMh/d;->p()Lkotlin/reflect/jvm/internal/impl/builtins/n;

    move-result-object p1

    invoke-virtual {p1}, Lkotlin/reflect/jvm/internal/impl/builtins/n;->d()LBh/e;

    move-result-object p1

    return-object p1

    :cond_0
    sget-object v6, LAh/d;->a:LAh/d;

    iget-object v0, p0, LOh/e;->a:LMh/k;

    invoke-virtual {v0}, LMh/k;->d()LBh/G;

    move-result-object v0

    invoke-interface {v0}, LBh/G;->q()Lkotlin/reflect/jvm/internal/impl/builtins/i;

    move-result-object v2

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v3, 0x0

    move-object v0, v6

    move-object v1, p3

    invoke-static/range {v0 .. v5}, LAh/d;->f(LAh/d;LZh/c;Lkotlin/reflect/jvm/internal/impl/builtins/i;Ljava/lang/Integer;ILjava/lang/Object;)LBh/e;

    move-result-object p3

    if-nez p3, :cond_1

    const/4 p1, 0x0

    return-object p1

    :cond_1
    invoke-virtual {v6, p3}, LAh/d;->d(LBh/e;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p2}, LOh/a;->g()LOh/c;

    move-result-object v0

    sget-object v1, LOh/c;->FLEXIBLE_LOWER_BOUND:LOh/c;

    if-eq v0, v1, :cond_2

    invoke-virtual {p2}, LOh/a;->b()Lpi/I0;

    move-result-object p2

    sget-object v0, Lpi/I0;->SUPERTYPE:Lpi/I0;

    if-eq p2, v0, :cond_2

    invoke-direct {p0, p1, p3}, LOh/e;->b(LQh/j;LBh/e;)Z

    move-result p1

    if-eqz p1, :cond_3

    :cond_2
    invoke-virtual {v6, p3}, LAh/d;->b(LBh/e;)LBh/e;

    move-result-object p1

    return-object p1

    :cond_3
    return-object p3
.end method

.method public static synthetic m(LOh/e;LQh/f;LOh/a;ZILjava/lang/Object;)Lpi/S;
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, LOh/e;->l(LQh/f;LOh/a;Z)Lpi/S;

    move-result-object p0

    return-object p0
.end method

.method private final n(LQh/j;LOh/a;)Lpi/S;
    .locals 3

    invoke-virtual {p2}, LOh/a;->h()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p2}, LOh/a;->b()Lpi/I0;

    move-result-object v0

    sget-object v1, Lpi/I0;->SUPERTYPE:Lpi/I0;

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-interface {p1}, LQh/j;->w()Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_2

    if-nez v0, :cond_2

    invoke-direct {p0, p1, p2, v2}, LOh/e;->f(LQh/j;LOh/a;Lpi/d0;)Lpi/d0;

    move-result-object p2

    if-eqz p2, :cond_1

    goto :goto_1

    :cond_1
    invoke-static {p1}, LOh/e;->o(LQh/j;)Lkotlin/reflect/jvm/internal/impl/types/error/i;

    move-result-object p2

    :goto_1
    return-object p2

    :cond_2
    sget-object v0, LOh/c;->FLEXIBLE_LOWER_BOUND:LOh/c;

    invoke-virtual {p2, v0}, LOh/a;->l(LOh/c;)LOh/a;

    move-result-object v0

    invoke-direct {p0, p1, v0, v2}, LOh/e;->f(LQh/j;LOh/a;Lpi/d0;)Lpi/d0;

    move-result-object v0

    if-nez v0, :cond_3

    invoke-static {p1}, LOh/e;->o(LQh/j;)Lkotlin/reflect/jvm/internal/impl/types/error/i;

    move-result-object p1

    return-object p1

    :cond_3
    sget-object v2, LOh/c;->FLEXIBLE_UPPER_BOUND:LOh/c;

    invoke-virtual {p2, v2}, LOh/a;->l(LOh/c;)LOh/a;

    move-result-object p2

    invoke-direct {p0, p1, p2, v0}, LOh/e;->f(LQh/j;LOh/a;Lpi/d0;)Lpi/d0;

    move-result-object p2

    if-nez p2, :cond_4

    invoke-static {p1}, LOh/e;->o(LQh/j;)Lkotlin/reflect/jvm/internal/impl/types/error/i;

    move-result-object p1

    return-object p1

    :cond_4
    if-eqz v1, :cond_5

    new-instance p1, LOh/k;

    invoke-direct {p1, v0, p2}, LOh/k;-><init>(Lpi/d0;Lpi/d0;)V

    goto :goto_2

    :cond_5
    invoke-static {v0, p2}, Lpi/V;->e(Lpi/d0;Lpi/d0;)Lpi/M0;

    move-result-object p1

    :goto_2
    return-object p1
.end method

.method private static final o(LQh/j;)Lkotlin/reflect/jvm/internal/impl/types/error/i;
    .locals 1

    sget-object v0, Lkotlin/reflect/jvm/internal/impl/types/error/k;->UNRESOLVED_JAVA_CLASS:Lkotlin/reflect/jvm/internal/impl/types/error/k;

    invoke-interface {p0}, LQh/j;->s()Ljava/lang/String;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/String;

    move-result-object p0

    invoke-static {v0, p0}, Lkotlin/reflect/jvm/internal/impl/types/error/l;->d(Lkotlin/reflect/jvm/internal/impl/types/error/k;[Ljava/lang/String;)Lkotlin/reflect/jvm/internal/impl/types/error/i;

    move-result-object p0

    return-object p0
.end method

.method private final q(LQh/x;LOh/a;LBh/l0;)Lpi/B0;
    .locals 8

    instance-of v0, p1, LQh/C;

    if-eqz v0, :cond_4

    check-cast p1, LQh/C;

    invoke-interface {p1}, LQh/C;->B()LQh/x;

    move-result-object v0

    invoke-interface {p1}, LQh/C;->J()Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v1, Lpi/N0;->OUT_VARIANCE:Lpi/N0;

    goto :goto_0

    :cond_0
    sget-object v1, Lpi/N0;->IN_VARIANCE:Lpi/N0;

    :goto_0
    if-eqz v0, :cond_3

    invoke-direct {p0, v1, p3}, LOh/e;->i(Lpi/N0;LBh/l0;)Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_1

    :cond_1
    iget-object p2, p0, LOh/e;->a:LMh/k;

    invoke-static {p2, p1}, LJh/V;->a(LMh/k;LQh/C;)Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/c;

    move-result-object p1

    sget-object v2, Lpi/I0;->COMMON:Lpi/I0;

    const/4 v6, 0x7

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, LOh/b;->b(Lpi/I0;ZZLBh/l0;ILjava/lang/Object;)LOh/a;

    move-result-object p2

    invoke-virtual {p0, v0, p2}, LOh/e;->p(LQh/x;LOh/a;)Lpi/S;

    move-result-object p2

    if-eqz p1, :cond_2

    sget-object v0, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;->c1:Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h$a;

    invoke-virtual {p2}, Lpi/S;->getAnnotations()Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    move-result-object v2

    invoke-static {v2, p1}, LZg/v;->L0(Ljava/lang/Iterable;Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {v0, p1}, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h$a;->a(Ljava/util/List;)Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    move-result-object p1

    invoke-static {p2, p1}, Lsi/d;->C(Lpi/S;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;)Lpi/S;

    move-result-object p2

    :cond_2
    invoke-static {p2, v1, p3}, Lsi/d;->k(Lpi/S;Lpi/N0;LBh/l0;)Lpi/B0;

    move-result-object p1

    goto :goto_2

    :cond_3
    :goto_1
    invoke-static {p3, p2}, Lpi/J0;->t(LBh/l0;Lpi/G;)Lpi/B0;

    move-result-object p1

    const-string p2, "makeStarProjection(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_2

    :cond_4
    new-instance p3, Lpi/D0;

    sget-object v0, Lpi/N0;->INVARIANT:Lpi/N0;

    invoke-virtual {p0, p1, p2}, LOh/e;->p(LQh/x;LOh/a;)Lpi/S;

    move-result-object p1

    invoke-direct {p3, v0, p1}, Lpi/D0;-><init>(Lpi/N0;Lpi/S;)V

    move-object p1, p3

    :goto_2
    return-object p1
.end method


# virtual methods
.method public final l(LQh/f;LOh/a;Z)Lpi/S;
    .locals 9

    const/4 v0, 0x1

    const-string v1, "arrayType"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "attr"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, LQh/f;->k()LQh/x;

    move-result-object v1

    instance-of v2, v1, LQh/v;

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, LQh/v;

    goto :goto_0

    :cond_0
    move-object v2, v3

    :goto_0
    if-eqz v2, :cond_1

    invoke-interface {v2}, LQh/v;->getType()Lkotlin/reflect/jvm/internal/impl/builtins/l;

    move-result-object v3

    :cond_1
    new-instance v2, LMh/g;

    iget-object v4, p0, LOh/e;->a:LMh/k;

    invoke-direct {v2, v4, p1, v0}, LMh/g;-><init>(LMh/k;LQh/d;Z)V

    if-eqz v3, :cond_3

    iget-object p1, p0, LOh/e;->a:LMh/k;

    invoke-virtual {p1}, LMh/k;->d()LBh/G;

    move-result-object p1

    invoke-interface {p1}, LBh/G;->q()Lkotlin/reflect/jvm/internal/impl/builtins/i;

    move-result-object p1

    invoke-virtual {p1, v3}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->O(Lkotlin/reflect/jvm/internal/impl/builtins/l;)Lpi/d0;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    new-instance p3, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/o;

    invoke-virtual {p1}, Lpi/S;->getAnnotations()Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    move-result-object v1

    const/4 v3, 0x2

    new-array v3, v3, [Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    const/4 v4, 0x0

    aput-object v1, v3, v4

    aput-object v2, v3, v0

    invoke-direct {p3, v3}, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/o;-><init>([Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;)V

    invoke-static {p1, p3}, Lsi/d;->C(Lpi/S;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;)Lpi/S;

    move-result-object p1

    const-string p3, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lpi/d0;

    invoke-virtual {p2}, LOh/a;->h()Z

    move-result p2

    if-eqz p2, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {p1, v0}, Lpi/d0;->U0(Z)Lpi/d0;

    move-result-object p2

    invoke-static {p1, p2}, Lpi/V;->e(Lpi/d0;Lpi/d0;)Lpi/M0;

    move-result-object p1

    :goto_1
    return-object p1

    :cond_3
    sget-object v3, Lpi/I0;->COMMON:Lpi/I0;

    invoke-virtual {p2}, LOh/a;->h()Z

    move-result v4

    const/4 v7, 0x6

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, LOh/b;->b(Lpi/I0;ZZLBh/l0;ILjava/lang/Object;)LOh/a;

    move-result-object p1

    invoke-virtual {p0, v1, p1}, LOh/e;->p(LQh/x;LOh/a;)Lpi/S;

    move-result-object p1

    invoke-virtual {p2}, LOh/a;->h()Z

    move-result p2

    const-string v1, "getArrayType(...)"

    if-eqz p2, :cond_5

    if-eqz p3, :cond_4

    sget-object p2, Lpi/N0;->OUT_VARIANCE:Lpi/N0;

    goto :goto_2

    :cond_4
    sget-object p2, Lpi/N0;->INVARIANT:Lpi/N0;

    :goto_2
    iget-object p3, p0, LOh/e;->a:LMh/k;

    invoke-virtual {p3}, LMh/k;->d()LBh/G;

    move-result-object p3

    invoke-interface {p3}, LBh/G;->q()Lkotlin/reflect/jvm/internal/impl/builtins/i;

    move-result-object p3

    invoke-virtual {p3, p2, p1, v2}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->m(Lpi/N0;Lpi/S;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;)Lpi/d0;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    :cond_5
    iget-object p2, p0, LOh/e;->a:LMh/k;

    invoke-virtual {p2}, LMh/k;->d()LBh/G;

    move-result-object p2

    invoke-interface {p2}, LBh/G;->q()Lkotlin/reflect/jvm/internal/impl/builtins/i;

    move-result-object p2

    sget-object p3, Lpi/N0;->INVARIANT:Lpi/N0;

    invoke-virtual {p2, p3, p1, v2}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->m(Lpi/N0;Lpi/S;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;)Lpi/d0;

    move-result-object p2

    invoke-static {p2, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p3, p0, LOh/e;->a:LMh/k;

    invoke-virtual {p3}, LMh/k;->d()LBh/G;

    move-result-object p3

    invoke-interface {p3}, LBh/G;->q()Lkotlin/reflect/jvm/internal/impl/builtins/i;

    move-result-object p3

    sget-object v1, Lpi/N0;->OUT_VARIANCE:Lpi/N0;

    invoke-virtual {p3, v1, p1, v2}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->m(Lpi/N0;Lpi/S;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;)Lpi/d0;

    move-result-object p1

    invoke-virtual {p1, v0}, Lpi/d0;->U0(Z)Lpi/d0;

    move-result-object p1

    invoke-static {p2, p1}, Lpi/V;->e(Lpi/d0;Lpi/d0;)Lpi/M0;

    move-result-object p1

    return-object p1
.end method

.method public final p(LQh/x;LOh/a;)Lpi/S;
    .locals 7

    const-string v0, "attr"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, LQh/v;

    if-eqz v0, :cond_1

    check-cast p1, LQh/v;

    invoke-interface {p1}, LQh/v;->getType()Lkotlin/reflect/jvm/internal/impl/builtins/l;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p2, p0, LOh/e;->a:LMh/k;

    invoke-virtual {p2}, LMh/k;->d()LBh/G;

    move-result-object p2

    invoke-interface {p2}, LBh/G;->q()Lkotlin/reflect/jvm/internal/impl/builtins/i;

    move-result-object p2

    invoke-virtual {p2, p1}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->R(Lkotlin/reflect/jvm/internal/impl/builtins/l;)Lpi/d0;

    move-result-object p1

    goto :goto_0

    :cond_0
    iget-object p1, p0, LOh/e;->a:LMh/k;

    invoke-virtual {p1}, LMh/k;->d()LBh/G;

    move-result-object p1

    invoke-interface {p1}, LBh/G;->q()Lkotlin/reflect/jvm/internal/impl/builtins/i;

    move-result-object p1

    invoke-virtual {p1}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->Z()Lpi/d0;

    move-result-object p1

    :goto_0
    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    instance-of v0, p1, LQh/j;

    if-eqz v0, :cond_2

    check-cast p1, LQh/j;

    invoke-direct {p0, p1, p2}, LOh/e;->n(LQh/j;LOh/a;)Lpi/S;

    move-result-object p1

    goto :goto_1

    :cond_2
    instance-of v0, p1, LQh/f;

    if-eqz v0, :cond_3

    move-object v2, p1

    check-cast v2, LQh/f;

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v3, p2

    invoke-static/range {v1 .. v6}, LOh/e;->m(LOh/e;LQh/f;LOh/a;ZILjava/lang/Object;)Lpi/S;

    move-result-object p1

    goto :goto_1

    :cond_3
    instance-of v0, p1, LQh/C;

    const-string v1, "getDefaultBound(...)"

    if-eqz v0, :cond_5

    check-cast p1, LQh/C;

    invoke-interface {p1}, LQh/C;->B()LQh/x;

    move-result-object p1

    if-eqz p1, :cond_4

    invoke-virtual {p0, p1, p2}, LOh/e;->p(LQh/x;LOh/a;)Lpi/S;

    move-result-object p1

    if-nez p1, :cond_6

    :cond_4
    iget-object p1, p0, LOh/e;->a:LMh/k;

    invoke-virtual {p1}, LMh/k;->d()LBh/G;

    move-result-object p1

    invoke-interface {p1}, LBh/G;->q()Lkotlin/reflect/jvm/internal/impl/builtins/i;

    move-result-object p1

    invoke-virtual {p1}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->y()Lpi/d0;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_1

    :cond_5
    if-nez p1, :cond_7

    iget-object p1, p0, LOh/e;->a:LMh/k;

    invoke-virtual {p1}, LMh/k;->d()LBh/G;

    move-result-object p1

    invoke-interface {p1}, LBh/G;->q()Lkotlin/reflect/jvm/internal/impl/builtins/i;

    move-result-object p1

    invoke-virtual {p1}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->y()Lpi/d0;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_6
    :goto_1
    return-object p1

    :cond_7
    new-instance p2, Ljava/lang/UnsupportedOperationException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unsupported type: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p2
.end method
