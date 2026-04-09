.class public abstract Lti/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lti/c$a;
    }
.end annotation


# direct methods
.method static synthetic a(Lpi/M0;)Ljava/lang/Boolean;
    .locals 0

    invoke-static {p0}, Lti/c;->e(Lpi/M0;)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Lpi/S;)Lti/a;
    .locals 6

    const-string v0, "type"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lpi/L;->b(Lpi/S;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0}, Lpi/L;->c(Lpi/S;)Lpi/d0;

    move-result-object v0

    invoke-static {v0}, Lti/c;->b(Lpi/S;)Lti/a;

    move-result-object v0

    invoke-static {p0}, Lpi/L;->d(Lpi/S;)Lpi/d0;

    move-result-object v1

    invoke-static {v1}, Lti/c;->b(Lpi/S;)Lti/a;

    move-result-object v1

    new-instance v2, Lti/a;

    invoke-virtual {v0}, Lti/a;->c()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lpi/S;

    invoke-static {v3}, Lpi/L;->c(Lpi/S;)Lpi/d0;

    move-result-object v3

    invoke-virtual {v1}, Lti/a;->c()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lpi/S;

    invoke-static {v4}, Lpi/L;->d(Lpi/S;)Lpi/d0;

    move-result-object v4

    invoke-static {v3, v4}, Lpi/V;->e(Lpi/d0;Lpi/d0;)Lpi/M0;

    move-result-object v3

    invoke-static {v3, p0}, Lpi/L0;->b(Lpi/M0;Lpi/S;)Lpi/M0;

    move-result-object v3

    invoke-virtual {v0}, Lti/a;->d()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpi/S;

    invoke-static {v0}, Lpi/L;->c(Lpi/S;)Lpi/d0;

    move-result-object v0

    invoke-virtual {v1}, Lti/a;->d()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lpi/S;

    invoke-static {v1}, Lpi/L;->d(Lpi/S;)Lpi/d0;

    move-result-object v1

    invoke-static {v0, v1}, Lpi/V;->e(Lpi/d0;Lpi/d0;)Lpi/M0;

    move-result-object v0

    invoke-static {v0, p0}, Lpi/L0;->b(Lpi/M0;Lpi/S;)Lpi/M0;

    move-result-object p0

    invoke-direct {v2, v3, p0}, Lti/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v2

    :cond_0
    invoke-virtual {p0}, Lpi/S;->N0()Lpi/v0;

    move-result-object v0

    invoke-static {p0}, Lci/e;->f(Lpi/S;)Z

    move-result v1

    const-string v2, "getNothingType(...)"

    if-eqz v1, :cond_3

    const-string v1, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.calls.inference.CapturedTypeConstructor"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lci/b;

    invoke-interface {v0}, Lci/b;->e()Lpi/B0;

    move-result-object v0

    invoke-interface {v0}, Lpi/B0;->getType()Lpi/S;

    move-result-object v1

    const-string v3, "getType(...)"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1, p0}, Lti/c;->c(Lpi/S;Lpi/S;)Lpi/S;

    move-result-object v1

    invoke-interface {v0}, Lpi/B0;->a()Lpi/N0;

    move-result-object v3

    sget-object v4, Lti/c$a;->a:[I

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v3, v4, v3

    const/4 v4, 0x2

    if-eq v3, v4, :cond_2

    const/4 v4, 0x3

    if-ne v3, v4, :cond_1

    new-instance v0, Lti/a;

    invoke-static {p0}, Lsi/d;->n(Lpi/S;)Lkotlin/reflect/jvm/internal/impl/builtins/i;

    move-result-object v3

    invoke-virtual {v3}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->H()Lpi/d0;

    move-result-object v3

    invoke-static {v3, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v3, p0}, Lti/c;->c(Lpi/S;Lpi/S;)Lpi/S;

    move-result-object p0

    invoke-direct {v0, p0, v1}, Lti/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    new-instance p0, Ljava/lang/AssertionError;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Only nontrivial projections should have been captured, not: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p0

    :cond_2
    new-instance v0, Lti/a;

    invoke-static {p0}, Lsi/d;->n(Lpi/S;)Lkotlin/reflect/jvm/internal/impl/builtins/i;

    move-result-object p0

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->I()Lpi/d0;

    move-result-object p0

    invoke-direct {v0, v1, p0}, Lti/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_0
    return-object v0

    :cond_3
    invoke-virtual {p0}, Lpi/S;->L0()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_b

    invoke-virtual {p0}, Lpi/S;->L0()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    invoke-interface {v0}, Lpi/v0;->getParameters()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-eq v1, v3, :cond_4

    goto/16 :goto_4

    :cond_4
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p0}, Lpi/S;->L0()Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/lang/Iterable;

    invoke-interface {v0}, Lpi/v0;->getParameters()Ljava/util/List;

    move-result-object v0

    const-string v5, "getParameters(...)"

    invoke-static {v0, v5}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v4, v0}, LZg/v;->s1(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_6

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LYg/s;

    invoke-virtual {v4}, LYg/s;->a()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lpi/B0;

    invoke-virtual {v4}, LYg/s;->c()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LBh/l0;

    invoke-static {v4}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-static {v5, v4}, Lti/c;->i(Lpi/B0;LBh/l0;)Lti/d;

    move-result-object v4

    invoke-interface {v5}, Lpi/B0;->c()Z

    move-result v5

    if-eqz v5, :cond_5

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_5
    invoke-static {v4}, Lti/c;->f(Lti/d;)Lti/a;

    move-result-object v4

    invoke-virtual {v4}, Lti/a;->a()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lti/d;

    invoke-virtual {v4}, Lti/a;->b()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lti/d;

    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_6
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    const/4 v4, 0x0

    if-eqz v0, :cond_7

    goto :goto_2

    :cond_7
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_8
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_9

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lti/d;

    invoke-virtual {v5}, Lti/d;->d()Z

    move-result v5

    if-nez v5, :cond_8

    const/4 v4, 0x1

    :cond_9
    :goto_2
    new-instance v0, Lti/a;

    if-eqz v4, :cond_a

    invoke-static {p0}, Lsi/d;->n(Lpi/S;)Lkotlin/reflect/jvm/internal/impl/builtins/i;

    move-result-object v1

    invoke-virtual {v1}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->H()Lpi/d0;

    move-result-object v1

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_3

    :cond_a
    invoke-static {p0, v1}, Lti/c;->g(Lpi/S;Ljava/util/List;)Lpi/S;

    move-result-object v1

    :goto_3
    invoke-static {p0, v3}, Lti/c;->g(Lpi/S;Ljava/util/List;)Lpi/S;

    move-result-object p0

    invoke-direct {v0, v1, p0}, Lti/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0

    :cond_b
    :goto_4
    new-instance v0, Lti/a;

    invoke-direct {v0, p0, p0}, Lti/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method

.method private static final c(Lpi/S;Lpi/S;)Lpi/S;
    .locals 0

    invoke-virtual {p1}, Lpi/S;->O0()Z

    move-result p1

    invoke-static {p0, p1}, Lpi/J0;->q(Lpi/S;Z)Lpi/S;

    move-result-object p0

    const-string p1, "makeNullableIfNeeded(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static final d(Lpi/B0;Z)Lpi/B0;
    .locals 3

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    invoke-interface {p0}, Lpi/B0;->c()Z

    move-result v0

    if-eqz v0, :cond_1

    return-object p0

    :cond_1
    invoke-interface {p0}, Lpi/B0;->getType()Lpi/S;

    move-result-object v0

    const-string v1, "getType(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lti/b;->a:Lti/b;

    invoke-static {v0, v1}, Lpi/J0;->c(Lpi/S;Lmh/l;)Z

    move-result v1

    if-nez v1, :cond_2

    return-object p0

    :cond_2
    invoke-interface {p0}, Lpi/B0;->a()Lpi/N0;

    move-result-object v1

    const-string v2, "getProjectionKind(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Lpi/N0;->OUT_VARIANCE:Lpi/N0;

    if-ne v1, v2, :cond_3

    invoke-static {v0}, Lti/c;->b(Lpi/S;)Lti/a;

    move-result-object p0

    new-instance p1, Lpi/D0;

    invoke-virtual {p0}, Lti/a;->d()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lpi/S;

    invoke-direct {p1, v1, p0}, Lpi/D0;-><init>(Lpi/N0;Lpi/S;)V

    return-object p1

    :cond_3
    if-eqz p1, :cond_4

    invoke-static {v0}, Lti/c;->b(Lpi/S;)Lti/a;

    move-result-object p0

    invoke-virtual {p0}, Lti/a;->c()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lpi/S;

    new-instance p1, Lpi/D0;

    invoke-direct {p1, v1, p0}, Lpi/D0;-><init>(Lpi/N0;Lpi/S;)V

    return-object p1

    :cond_4
    invoke-static {p0}, Lti/c;->h(Lpi/B0;)Lpi/B0;

    move-result-object p0

    return-object p0
.end method

.method private static final e(Lpi/M0;)Ljava/lang/Boolean;
    .locals 0

    invoke-static {p0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-static {p0}, Lci/e;->f(Lpi/S;)Z

    move-result p0

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method private static final f(Lti/d;)Lti/a;
    .locals 7

    invoke-virtual {p0}, Lti/d;->a()Lpi/S;

    move-result-object v0

    invoke-static {v0}, Lti/c;->b(Lpi/S;)Lti/a;

    move-result-object v0

    invoke-virtual {v0}, Lti/a;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lpi/S;

    invoke-virtual {v0}, Lti/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpi/S;

    invoke-virtual {p0}, Lti/d;->b()Lpi/S;

    move-result-object v2

    invoke-static {v2}, Lti/c;->b(Lpi/S;)Lti/a;

    move-result-object v2

    invoke-virtual {v2}, Lti/a;->a()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lpi/S;

    invoke-virtual {v2}, Lti/a;->b()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lpi/S;

    new-instance v4, Lti/a;

    new-instance v5, Lti/d;

    invoke-virtual {p0}, Lti/d;->c()LBh/l0;

    move-result-object v6

    invoke-direct {v5, v6, v0, v3}, Lti/d;-><init>(LBh/l0;Lpi/S;Lpi/S;)V

    new-instance v0, Lti/d;

    invoke-virtual {p0}, Lti/d;->c()LBh/l0;

    move-result-object p0

    invoke-direct {v0, p0, v1, v2}, Lti/d;-><init>(LBh/l0;Lpi/S;Lpi/S;)V

    invoke-direct {v4, v5, v0}, Lti/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v4
.end method

.method private static final g(Lpi/S;Ljava/util/List;)Lpi/S;
    .locals 6

    invoke-virtual {p0}, Lpi/S;->L0()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    invoke-interface {p1}, Ljava/util/List;->size()I

    check-cast p1, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v0, 0xa

    invoke-static {p1, v0}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v0

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lti/d;

    invoke-static {v0}, Lti/c;->j(Lti/d;)Lpi/B0;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v5}, Lpi/F0;->e(Lpi/S;Ljava/util/List;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;Ljava/util/List;ILjava/lang/Object;)Lpi/S;

    move-result-object p0

    return-object p0
.end method

.method private static final h(Lpi/B0;)Lpi/B0;
    .locals 2

    new-instance v0, Lti/c$b;

    invoke-direct {v0}, Lti/c$b;-><init>()V

    invoke-static {v0}, Lpi/G0;->g(Lpi/E0;)Lpi/G0;

    move-result-object v0

    const-string v1, "create(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Lpi/G0;->t(Lpi/B0;)Lpi/B0;

    move-result-object p0

    return-object p0
.end method

.method private static final i(Lpi/B0;LBh/l0;)Lti/d;
    .locals 4

    invoke-interface {p1}, LBh/l0;->p()Lpi/N0;

    move-result-object v0

    invoke-static {v0, p0}, Lpi/G0;->c(Lpi/N0;Lpi/B0;)Lpi/N0;

    move-result-object v0

    sget-object v1, Lti/c$a;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x1

    const-string v2, "getType(...)"

    if-eq v0, v1, :cond_2

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    new-instance v0, Lti/d;

    invoke-static {p1}, Lfi/e;->m(LBh/m;)Lkotlin/reflect/jvm/internal/impl/builtins/i;

    move-result-object v1

    invoke-virtual {v1}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->H()Lpi/d0;

    move-result-object v1

    const-string v3, "getNothingType(...)"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lpi/B0;->getType()Lpi/S;

    move-result-object p0

    invoke-static {p0, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, p1, v1, p0}, Lti/d;-><init>(LBh/l0;Lpi/S;Lpi/S;)V

    goto :goto_0

    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_1
    new-instance v0, Lti/d;

    invoke-interface {p0}, Lpi/B0;->getType()Lpi/S;

    move-result-object p0

    invoke-static {p0, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lfi/e;->m(LBh/m;)Lkotlin/reflect/jvm/internal/impl/builtins/i;

    move-result-object v1

    invoke-virtual {v1}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->I()Lpi/d0;

    move-result-object v1

    const-string v2, "getNullableAnyType(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, p1, p0, v1}, Lti/d;-><init>(LBh/l0;Lpi/S;Lpi/S;)V

    goto :goto_0

    :cond_2
    new-instance v0, Lti/d;

    invoke-interface {p0}, Lpi/B0;->getType()Lpi/S;

    move-result-object v1

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lpi/B0;->getType()Lpi/S;

    move-result-object p0

    invoke-static {p0, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, p1, v1, p0}, Lti/d;-><init>(LBh/l0;Lpi/S;Lpi/S;)V

    :goto_0
    return-object v0
.end method

.method private static final j(Lti/d;)Lpi/B0;
    .locals 2

    invoke-virtual {p0}, Lti/d;->d()Z

    invoke-virtual {p0}, Lti/d;->a()Lpi/S;

    move-result-object v0

    invoke-virtual {p0}, Lti/d;->b()Lpi/S;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    invoke-virtual {p0}, Lti/d;->c()LBh/l0;

    move-result-object v0

    invoke-interface {v0}, LBh/l0;->p()Lpi/N0;

    move-result-object v0

    sget-object v1, Lpi/N0;->IN_VARIANCE:Lpi/N0;

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lti/d;->a()Lpi/S;

    move-result-object v0

    invoke-static {v0}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->n0(Lpi/S;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lti/d;->c()LBh/l0;

    move-result-object v0

    invoke-interface {v0}, LBh/l0;->p()Lpi/N0;

    move-result-object v0

    if-eq v0, v1, :cond_1

    new-instance v0, Lpi/D0;

    sget-object v1, Lpi/N0;->OUT_VARIANCE:Lpi/N0;

    invoke-static {p0, v1}, Lti/c;->k(Lti/d;Lpi/N0;)Lpi/N0;

    move-result-object v1

    invoke-virtual {p0}, Lti/d;->b()Lpi/S;

    move-result-object p0

    invoke-direct {v0, v1, p0}, Lpi/D0;-><init>(Lpi/N0;Lpi/S;)V

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Lti/d;->b()Lpi/S;

    move-result-object v0

    invoke-static {v0}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->p0(Lpi/S;)Z

    move-result v0

    if-eqz v0, :cond_2

    new-instance v0, Lpi/D0;

    invoke-static {p0, v1}, Lti/c;->k(Lti/d;Lpi/N0;)Lpi/N0;

    move-result-object v1

    invoke-virtual {p0}, Lti/d;->a()Lpi/S;

    move-result-object p0

    invoke-direct {v0, v1, p0}, Lpi/D0;-><init>(Lpi/N0;Lpi/S;)V

    goto :goto_1

    :cond_2
    new-instance v0, Lpi/D0;

    sget-object v1, Lpi/N0;->OUT_VARIANCE:Lpi/N0;

    invoke-static {p0, v1}, Lti/c;->k(Lti/d;Lpi/N0;)Lpi/N0;

    move-result-object v1

    invoke-virtual {p0}, Lti/d;->b()Lpi/S;

    move-result-object p0

    invoke-direct {v0, v1, p0}, Lpi/D0;-><init>(Lpi/N0;Lpi/S;)V

    goto :goto_1

    :cond_3
    :goto_0
    new-instance v0, Lpi/D0;

    invoke-virtual {p0}, Lti/d;->a()Lpi/S;

    move-result-object p0

    invoke-direct {v0, p0}, Lpi/D0;-><init>(Lpi/S;)V

    :goto_1
    return-object v0
.end method

.method private static final k(Lti/d;Lpi/N0;)Lpi/N0;
    .locals 0

    invoke-virtual {p0}, Lti/d;->c()LBh/l0;

    move-result-object p0

    invoke-interface {p0}, LBh/l0;->p()Lpi/N0;

    move-result-object p0

    if-ne p1, p0, :cond_0

    sget-object p1, Lpi/N0;->INVARIANT:Lpi/N0;

    :cond_0
    return-object p1
.end method
