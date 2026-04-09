.class public abstract Lkotlin/reflect/jvm/internal/impl/types/checker/f;
.super Lpi/q;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkotlin/reflect/jvm/internal/impl/types/checker/f$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lpi/q;-><init>()V

    return-void
.end method

.method private final c(Lpi/d0;)Lpi/d0;
    .locals 14

    invoke-virtual {p1}, Lpi/S;->N0()Lpi/v0;

    move-result-object v0

    instance-of v1, v0, Lci/c;

    const/16 v2, 0xa

    const/4 v3, 0x0

    if-eqz v1, :cond_4

    check-cast v0, Lci/c;

    invoke-virtual {v0}, Lci/c;->e()Lpi/B0;

    move-result-object v1

    invoke-interface {v1}, Lpi/B0;->a()Lpi/N0;

    move-result-object v4

    sget-object v5, Lpi/N0;->IN_VARIANCE:Lpi/N0;

    if-ne v4, v5, :cond_0

    goto :goto_0

    :cond_0
    move-object v1, v3

    :goto_0
    if-eqz v1, :cond_1

    invoke-interface {v1}, Lpi/B0;->getType()Lpi/S;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lpi/S;->Q0()Lpi/M0;

    move-result-object v3

    :cond_1
    move-object v7, v3

    invoke-virtual {v0}, Lci/c;->g()Lkotlin/reflect/jvm/internal/impl/types/checker/n;

    move-result-object v1

    if-nez v1, :cond_3

    invoke-virtual {v0}, Lci/c;->e()Lpi/B0;

    move-result-object v9

    invoke-virtual {v0}, Lci/c;->a()Ljava/util/Collection;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v10, Ljava/util/ArrayList;

    invoke-static {v1, v2}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v10, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lpi/S;

    invoke-virtual {v2}, Lpi/S;->Q0()Lpi/M0;

    move-result-object v2

    invoke-interface {v10, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    new-instance v1, Lkotlin/reflect/jvm/internal/impl/types/checker/n;

    const/4 v11, 0x0

    const/4 v12, 0x4

    const/4 v13, 0x0

    move-object v8, v1

    invoke-direct/range {v8 .. v13}, Lkotlin/reflect/jvm/internal/impl/types/checker/n;-><init>(Lpi/B0;Ljava/util/List;Lkotlin/reflect/jvm/internal/impl/types/checker/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v0, v1}, Lci/c;->i(Lkotlin/reflect/jvm/internal/impl/types/checker/n;)V

    :cond_3
    new-instance v1, Lkotlin/reflect/jvm/internal/impl/types/checker/i;

    sget-object v5, Lri/b;->FOR_SUBTYPING:Lri/b;

    invoke-virtual {v0}, Lci/c;->g()Lkotlin/reflect/jvm/internal/impl/types/checker/n;

    move-result-object v6

    invoke-static {v6}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {p1}, Lpi/S;->M0()Lpi/r0;

    move-result-object v8

    invoke-virtual {p1}, Lpi/S;->O0()Z

    move-result v9

    const/16 v11, 0x20

    const/4 v12, 0x0

    const/4 v10, 0x0

    move-object v4, v1

    invoke-direct/range {v4 .. v12}, Lkotlin/reflect/jvm/internal/impl/types/checker/i;-><init>(Lri/b;Lkotlin/reflect/jvm/internal/impl/types/checker/n;Lpi/M0;Lpi/r0;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_4
    instance-of v1, v0, Lpi/Q;

    if-eqz v1, :cond_9

    invoke-virtual {p1}, Lpi/S;->O0()Z

    move-result v1

    if-eqz v1, :cond_9

    check-cast v0, Lpi/Q;

    invoke-virtual {v0}, Lpi/Q;->a()Ljava/util/Collection;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-static {p1, v2}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v2, 0x0

    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lpi/S;

    invoke-static {v2}, Lsi/d;->B(Lpi/S;)Lpi/S;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    const/4 v2, 0x1

    goto :goto_2

    :cond_5
    if-nez v2, :cond_6

    goto :goto_3

    :cond_6
    invoke-virtual {v0}, Lpi/Q;->l()Lpi/S;

    move-result-object p1

    if-eqz p1, :cond_7

    invoke-static {p1}, Lsi/d;->B(Lpi/S;)Lpi/S;

    move-result-object v3

    :cond_7
    new-instance p1, Lpi/Q;

    invoke-direct {p1, v1}, Lpi/Q;-><init>(Ljava/util/Collection;)V

    invoke-virtual {p1, v3}, Lpi/Q;->s(Lpi/S;)Lpi/Q;

    move-result-object v3

    :goto_3
    if-nez v3, :cond_8

    goto :goto_4

    :cond_8
    move-object v0, v3

    :goto_4
    invoke-virtual {v0}, Lpi/Q;->j()Lpi/d0;

    move-result-object p1

    :cond_9
    return-object p1
.end method


# virtual methods
.method public bridge synthetic a(Lri/i;)Lri/i;
    .locals 0

    invoke-virtual {p0, p1}, Lkotlin/reflect/jvm/internal/impl/types/checker/f;->b(Lri/i;)Lpi/M0;

    move-result-object p1

    return-object p1
.end method

.method public b(Lri/i;)Lpi/M0;
    .locals 4

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lpi/S;

    if-eqz v0, :cond_4

    check-cast p1, Lpi/S;

    invoke-virtual {p1}, Lpi/S;->Q0()Lpi/M0;

    move-result-object p1

    instance-of v0, p1, Lpi/d0;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lpi/d0;

    invoke-direct {p0, v0}, Lkotlin/reflect/jvm/internal/impl/types/checker/f;->c(Lpi/d0;)Lpi/d0;

    move-result-object v0

    goto :goto_1

    :cond_0
    instance-of v0, p1, Lpi/I;

    if-eqz v0, :cond_3

    move-object v0, p1

    check-cast v0, Lpi/I;

    invoke-virtual {v0}, Lpi/I;->V0()Lpi/d0;

    move-result-object v1

    invoke-direct {p0, v1}, Lkotlin/reflect/jvm/internal/impl/types/checker/f;->c(Lpi/d0;)Lpi/d0;

    move-result-object v1

    invoke-virtual {v0}, Lpi/I;->W0()Lpi/d0;

    move-result-object v2

    invoke-direct {p0, v2}, Lkotlin/reflect/jvm/internal/impl/types/checker/f;->c(Lpi/d0;)Lpi/d0;

    move-result-object v2

    invoke-virtual {v0}, Lpi/I;->V0()Lpi/d0;

    move-result-object v3

    if-ne v1, v3, :cond_2

    invoke-virtual {v0}, Lpi/I;->W0()Lpi/d0;

    move-result-object v0

    if-eq v2, v0, :cond_1

    goto :goto_0

    :cond_1
    move-object v0, p1

    goto :goto_1

    :cond_2
    :goto_0
    invoke-static {v1, v2}, Lpi/V;->e(Lpi/d0;Lpi/d0;)Lpi/M0;

    move-result-object v0

    :goto_1
    new-instance v1, Lkotlin/reflect/jvm/internal/impl/types/checker/f$b;

    invoke-direct {v1, p0}, Lkotlin/reflect/jvm/internal/impl/types/checker/f$b;-><init>(Ljava/lang/Object;)V

    invoke-static {v0, p1, v1}, Lpi/L0;->c(Lpi/M0;Lpi/S;Lmh/l;)Lpi/M0;

    move-result-object p1

    return-object p1

    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Failed requirement."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
