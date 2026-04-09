.class public final Lpi/m0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpi/m0$a;
    }
.end annotation


# static fields
.field public static final c:Lpi/m0$a;

.field private static final d:Lpi/m0;


# instance fields
.field private final a:Lpi/o0;

.field private final b:Z


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lpi/m0$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lpi/m0$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lpi/m0;->c:Lpi/m0$a;

    new-instance v0, Lpi/m0;

    sget-object v1, Lpi/o0$a;->a:Lpi/o0$a;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lpi/m0;-><init>(Lpi/o0;Z)V

    sput-object v0, Lpi/m0;->d:Lpi/m0;

    return-void
.end method

.method public constructor <init>(Lpi/o0;Z)V
    .locals 1

    const-string v0, "reportStrategy"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpi/m0;->a:Lpi/o0;

    iput-boolean p2, p0, Lpi/m0;->b:Z

    return-void
.end method

.method private final a(Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;)V
    .locals 2

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/c;

    invoke-interface {v1}, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/c;->e()LZh/c;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/c;

    invoke-interface {p2}, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/c;->e()LZh/c;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lpi/m0;->a:Lpi/o0;

    invoke-interface {v1, p2}, Lpi/o0;->c(Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/c;)V

    goto :goto_1

    :cond_2
    return-void
.end method

.method private final b(Lpi/S;Lpi/S;)V
    .locals 7

    invoke-static {p2}, Lpi/G0;->f(Lpi/S;)Lpi/G0;

    move-result-object v0

    const-string v1, "create(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Lpi/S;->L0()Ljava/util/List;

    move-result-object p2

    check-cast p2, Ljava/lang/Iterable;

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    const/4 v1, 0x0

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    add-int/lit8 v3, v1, 0x1

    if-gez v1, :cond_0

    invoke-static {}, LZg/v;->v()V

    :cond_0
    check-cast v2, Lpi/B0;

    invoke-interface {v2}, Lpi/B0;->c()Z

    move-result v4

    if-nez v4, :cond_1

    invoke-interface {v2}, Lpi/B0;->getType()Lpi/S;

    move-result-object v4

    const-string v5, "getType(...)"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v4}, Lsi/d;->g(Lpi/S;)Z

    move-result v4

    if-nez v4, :cond_1

    invoke-virtual {p1}, Lpi/S;->L0()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lpi/B0;

    invoke-virtual {p1}, Lpi/S;->N0()Lpi/v0;

    move-result-object v6

    invoke-interface {v6}, Lpi/v0;->getParameters()Ljava/util/List;

    move-result-object v6

    invoke-interface {v6, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LBh/l0;

    iget-boolean v6, p0, Lpi/m0;->b:Z

    if-eqz v6, :cond_1

    iget-object v6, p0, Lpi/m0;->a:Lpi/o0;

    invoke-interface {v4}, Lpi/B0;->getType()Lpi/S;

    move-result-object v4

    invoke-static {v4, v5}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v2}, Lpi/B0;->getType()Lpi/S;

    move-result-object v2

    invoke-static {v2, v5}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-interface {v6, v0, v4, v2, v1}, Lpi/o0;->b(Lpi/G0;Lpi/S;Lpi/S;LBh/l0;)V

    :cond_1
    move v1, v3

    goto :goto_0

    :cond_2
    return-void
.end method

.method private final c(Lpi/d0;Lpi/r0;)Lpi/d0;
    .locals 2

    invoke-static {p1}, Lpi/W;->a(Lpi/S;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-direct {p0, p1, p2}, Lpi/m0;->g(Lpi/S;Lpi/r0;)Lpi/r0;

    move-result-object p2

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-static {p1, v1, p2, v0, v1}, Lpi/F0;->f(Lpi/d0;Ljava/util/List;Lpi/r0;ILjava/lang/Object;)Lpi/d0;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method private final d(Lpi/d0;Lpi/S;)Lpi/d0;
    .locals 0

    invoke-virtual {p2}, Lpi/S;->O0()Z

    move-result p2

    invoke-static {p1, p2}, Lpi/J0;->r(Lpi/d0;Z)Lpi/d0;

    move-result-object p1

    const-string p2, "makeNullableIfNeeded(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private final e(Lpi/d0;Lpi/S;)Lpi/d0;
    .locals 0

    invoke-direct {p0, p1, p2}, Lpi/m0;->d(Lpi/d0;Lpi/S;)Lpi/d0;

    move-result-object p1

    invoke-virtual {p2}, Lpi/S;->M0()Lpi/r0;

    move-result-object p2

    invoke-direct {p0, p1, p2}, Lpi/m0;->c(Lpi/d0;Lpi/r0;)Lpi/d0;

    move-result-object p1

    return-object p1
.end method

.method private final f(Lpi/n0;Lpi/r0;Z)Lpi/d0;
    .locals 2

    invoke-virtual {p1}, Lpi/n0;->b()LBh/k0;

    move-result-object v0

    invoke-interface {v0}, LBh/h;->k()Lpi/v0;

    move-result-object v0

    const-string v1, "getTypeConstructor(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lpi/n0;->a()Ljava/util/List;

    move-result-object p1

    sget-object v1, Lii/k$b;->b:Lii/k$b;

    invoke-static {p2, v0, p1, p3, v1}, Lpi/V;->m(Lpi/r0;Lpi/v0;Ljava/util/List;ZLii/k;)Lpi/d0;

    move-result-object p1

    return-object p1
.end method

.method private final g(Lpi/S;Lpi/r0;)Lpi/r0;
    .locals 1

    invoke-static {p1}, Lpi/W;->a(Lpi/S;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lpi/S;->M0()Lpi/r0;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {p1}, Lpi/S;->M0()Lpi/r0;

    move-result-object p1

    invoke-virtual {p2, p1}, Lpi/r0;->j(Lpi/r0;)Lpi/r0;

    move-result-object p1

    return-object p1
.end method

.method private final i(Lpi/B0;Lpi/n0;I)Lpi/B0;
    .locals 11

    invoke-interface {p1}, Lpi/B0;->getType()Lpi/S;

    move-result-object v0

    invoke-virtual {v0}, Lpi/S;->Q0()Lpi/M0;

    move-result-object v0

    invoke-static {v0}, Lpi/E;->a(Lpi/S;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-object p1

    :cond_0
    invoke-static {v0}, Lpi/F0;->a(Lpi/S;)Lpi/d0;

    move-result-object v0

    invoke-static {v0}, Lpi/W;->a(Lpi/S;)Z

    move-result v1

    if-nez v1, :cond_8

    invoke-static {v0}, Lsi/d;->E(Lpi/S;)Z

    move-result v1

    if-nez v1, :cond_1

    goto/16 :goto_2

    :cond_1
    invoke-virtual {v0}, Lpi/S;->N0()Lpi/v0;

    move-result-object v1

    invoke-interface {v1}, Lpi/v0;->c()LBh/h;

    move-result-object v2

    invoke-interface {v1}, Lpi/v0;->getParameters()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->size()I

    invoke-virtual {v0}, Lpi/S;->L0()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->size()I

    instance-of v3, v2, LBh/l0;

    if-eqz v3, :cond_2

    goto/16 :goto_2

    :cond_2
    instance-of v3, v2, LBh/k0;

    if-eqz v3, :cond_7

    check-cast v2, LBh/k0;

    invoke-virtual {p2, v2}, Lpi/n0;->d(LBh/k0;)Z

    move-result v3

    if-eqz v3, :cond_3

    iget-object p1, p0, Lpi/m0;->a:Lpi/o0;

    invoke-interface {p1, v2}, Lpi/o0;->d(LBh/k0;)V

    new-instance p1, Lpi/D0;

    sget-object p2, Lpi/N0;->INVARIANT:Lpi/N0;

    sget-object p3, Lkotlin/reflect/jvm/internal/impl/types/error/k;->RECURSIVE_TYPE_ALIAS:Lkotlin/reflect/jvm/internal/impl/types/error/k;

    invoke-interface {v2}, LBh/I;->getName()LZh/f;

    move-result-object v0

    invoke-virtual {v0}, LZh/f;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {p3, v0}, Lkotlin/reflect/jvm/internal/impl/types/error/l;->d(Lkotlin/reflect/jvm/internal/impl/types/error/k;[Ljava/lang/String;)Lkotlin/reflect/jvm/internal/impl/types/error/i;

    move-result-object p3

    invoke-direct {p1, p2, p3}, Lpi/D0;-><init>(Lpi/N0;Lpi/S;)V

    return-object p1

    :cond_3
    invoke-virtual {v0}, Lpi/S;->L0()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    const/16 v5, 0xa

    invoke-static {v3, v5}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    const/4 v5, 0x0

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_5

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    add-int/lit8 v7, v5, 0x1

    if-gez v5, :cond_4

    invoke-static {}, LZg/v;->v()V

    :cond_4
    check-cast v6, Lpi/B0;

    invoke-interface {v1}, Lpi/v0;->getParameters()Ljava/util/List;

    move-result-object v8

    invoke-interface {v8, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LBh/l0;

    add-int/lit8 v8, p3, 0x1

    invoke-direct {p0, v6, p2, v5, v8}, Lpi/m0;->k(Lpi/B0;Lpi/n0;LBh/l0;I)Lpi/B0;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move v5, v7

    goto :goto_0

    :cond_5
    sget-object v1, Lpi/n0;->e:Lpi/n0$a;

    invoke-virtual {v1, p2, v2, v4}, Lpi/n0$a;->a(Lpi/n0;LBh/k0;Ljava/util/List;)Lpi/n0;

    move-result-object v6

    invoke-virtual {v0}, Lpi/S;->M0()Lpi/r0;

    move-result-object v7

    invoke-virtual {v0}, Lpi/S;->O0()Z

    move-result v8

    add-int/lit8 v9, p3, 0x1

    const/4 v10, 0x0

    move-object v5, p0

    invoke-direct/range {v5 .. v10}, Lpi/m0;->j(Lpi/n0;Lpi/r0;ZIZ)Lpi/d0;

    move-result-object v1

    invoke-direct {p0, v0, p2, p3}, Lpi/m0;->l(Lpi/d0;Lpi/n0;I)Lpi/d0;

    move-result-object p2

    invoke-static {v1}, Lpi/E;->a(Lpi/S;)Z

    move-result p3

    if-eqz p3, :cond_6

    goto :goto_1

    :cond_6
    invoke-static {v1, p2}, Lpi/h0;->j(Lpi/d0;Lpi/d0;)Lpi/d0;

    move-result-object v1

    :goto_1
    new-instance p2, Lpi/D0;

    invoke-interface {p1}, Lpi/B0;->a()Lpi/N0;

    move-result-object p1

    invoke-direct {p2, p1, v1}, Lpi/D0;-><init>(Lpi/N0;Lpi/S;)V

    move-object p1, p2

    goto :goto_2

    :cond_7
    invoke-direct {p0, v0, p2, p3}, Lpi/m0;->l(Lpi/d0;Lpi/n0;I)Lpi/d0;

    move-result-object p2

    invoke-direct {p0, v0, p2}, Lpi/m0;->b(Lpi/S;Lpi/S;)V

    new-instance p3, Lpi/D0;

    invoke-interface {p1}, Lpi/B0;->a()Lpi/N0;

    move-result-object p1

    invoke-direct {p3, p1, p2}, Lpi/D0;-><init>(Lpi/N0;Lpi/S;)V

    move-object p1, p3

    :cond_8
    :goto_2
    return-object p1
.end method

.method private final j(Lpi/n0;Lpi/r0;ZIZ)Lpi/d0;
    .locals 3

    new-instance v0, Lpi/D0;

    sget-object v1, Lpi/N0;->INVARIANT:Lpi/N0;

    invoke-virtual {p1}, Lpi/n0;->b()LBh/k0;

    move-result-object v2

    invoke-interface {v2}, LBh/k0;->f0()Lpi/d0;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lpi/D0;-><init>(Lpi/N0;Lpi/S;)V

    const/4 v1, 0x0

    invoke-direct {p0, v0, p1, v1, p4}, Lpi/m0;->k(Lpi/B0;Lpi/n0;LBh/l0;I)Lpi/B0;

    move-result-object p4

    invoke-interface {p4}, Lpi/B0;->getType()Lpi/S;

    move-result-object v0

    const-string v1, "getType(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lpi/F0;->a(Lpi/S;)Lpi/d0;

    move-result-object v0

    invoke-static {v0}, Lpi/W;->a(Lpi/S;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    :cond_0
    invoke-interface {p4}, Lpi/B0;->a()Lpi/N0;

    invoke-virtual {v0}, Lpi/S;->getAnnotations()Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    move-result-object p4

    invoke-static {p2}, Lpi/t;->a(Lpi/r0;)Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    move-result-object v1

    invoke-direct {p0, p4, v1}, Lpi/m0;->a(Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;)V

    invoke-direct {p0, v0, p2}, Lpi/m0;->c(Lpi/d0;Lpi/r0;)Lpi/d0;

    move-result-object p4

    invoke-static {p4, p3}, Lpi/J0;->r(Lpi/d0;Z)Lpi/d0;

    move-result-object p4

    const-string v0, "let(...)"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p5, :cond_1

    invoke-direct {p0, p1, p2, p3}, Lpi/m0;->f(Lpi/n0;Lpi/r0;Z)Lpi/d0;

    move-result-object p1

    invoke-static {p4, p1}, Lpi/h0;->j(Lpi/d0;Lpi/d0;)Lpi/d0;

    move-result-object p4

    :cond_1
    return-object p4
.end method

.method private final k(Lpi/B0;Lpi/n0;LBh/l0;I)Lpi/B0;
    .locals 3

    sget-object v0, Lpi/m0;->c:Lpi/m0$a;

    invoke-virtual {p2}, Lpi/n0;->b()LBh/k0;

    move-result-object v1

    invoke-static {v0, p4, v1}, Lpi/m0$a;->a(Lpi/m0$a;ILBh/k0;)V

    invoke-interface {p1}, Lpi/B0;->c()Z

    move-result v0

    const-string v1, "makeStarProjection(...)"

    if-eqz v0, :cond_0

    invoke-static {p3}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-static {p3}, Lpi/J0;->s(LBh/l0;)Lpi/B0;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    :cond_0
    invoke-interface {p1}, Lpi/B0;->getType()Lpi/S;

    move-result-object v0

    const-string v2, "getType(...)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lpi/S;->N0()Lpi/v0;

    move-result-object v2

    invoke-virtual {p2, v2}, Lpi/n0;->c(Lpi/v0;)Lpi/B0;

    move-result-object v2

    if-nez v2, :cond_1

    invoke-direct {p0, p1, p2, p4}, Lpi/m0;->i(Lpi/B0;Lpi/n0;I)Lpi/B0;

    move-result-object p1

    return-object p1

    :cond_1
    invoke-interface {v2}, Lpi/B0;->c()Z

    move-result p4

    if-eqz p4, :cond_2

    invoke-static {p3}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-static {p3}, Lpi/J0;->s(LBh/l0;)Lpi/B0;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    :cond_2
    invoke-interface {v2}, Lpi/B0;->getType()Lpi/S;

    move-result-object p4

    invoke-virtual {p4}, Lpi/S;->Q0()Lpi/M0;

    move-result-object p4

    invoke-interface {v2}, Lpi/B0;->a()Lpi/N0;

    move-result-object v1

    const-string v2, "getProjectionKind(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lpi/B0;->a()Lpi/N0;

    move-result-object p1

    invoke-static {p1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    if-ne p1, v1, :cond_3

    goto :goto_0

    :cond_3
    sget-object v2, Lpi/N0;->INVARIANT:Lpi/N0;

    if-ne p1, v2, :cond_4

    goto :goto_0

    :cond_4
    if-ne v1, v2, :cond_5

    move-object v1, p1

    goto :goto_0

    :cond_5
    iget-object p1, p0, Lpi/m0;->a:Lpi/o0;

    invoke-virtual {p2}, Lpi/n0;->b()LBh/k0;

    move-result-object v2

    invoke-interface {p1, v2, p3, p4}, Lpi/o0;->a(LBh/k0;LBh/l0;Lpi/S;)V

    :goto_0
    if-eqz p3, :cond_6

    invoke-interface {p3}, LBh/l0;->p()Lpi/N0;

    move-result-object p1

    if-nez p1, :cond_7

    :cond_6
    sget-object p1, Lpi/N0;->INVARIANT:Lpi/N0;

    :cond_7
    if-ne p1, v1, :cond_8

    goto :goto_1

    :cond_8
    sget-object v2, Lpi/N0;->INVARIANT:Lpi/N0;

    if-ne p1, v2, :cond_9

    goto :goto_1

    :cond_9
    if-ne v1, v2, :cond_a

    move-object v1, v2

    goto :goto_1

    :cond_a
    iget-object p1, p0, Lpi/m0;->a:Lpi/o0;

    invoke-virtual {p2}, Lpi/n0;->b()LBh/k0;

    move-result-object p2

    invoke-interface {p1, p2, p3, p4}, Lpi/o0;->a(LBh/k0;LBh/l0;Lpi/S;)V

    :goto_1
    invoke-virtual {v0}, Lpi/S;->getAnnotations()Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    move-result-object p1

    invoke-virtual {p4}, Lpi/S;->getAnnotations()Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    move-result-object p2

    invoke-direct {p0, p1, p2}, Lpi/m0;->a(Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;)V

    invoke-static {p4}, Lpi/F0;->a(Lpi/S;)Lpi/d0;

    move-result-object p1

    invoke-direct {p0, p1, v0}, Lpi/m0;->e(Lpi/d0;Lpi/S;)Lpi/d0;

    move-result-object p1

    new-instance p2, Lpi/D0;

    invoke-direct {p2, v1, p1}, Lpi/D0;-><init>(Lpi/N0;Lpi/S;)V

    return-object p2
.end method

.method private final l(Lpi/d0;Lpi/n0;I)Lpi/d0;
    .locals 8

    invoke-virtual {p1}, Lpi/S;->N0()Lpi/v0;

    move-result-object v0

    invoke-virtual {p1}, Lpi/S;->L0()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v1, v3}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v3, 0x0

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    add-int/lit8 v5, v3, 0x1

    if-gez v3, :cond_0

    invoke-static {}, LZg/v;->v()V

    :cond_0
    check-cast v4, Lpi/B0;

    invoke-interface {v0}, Lpi/v0;->getParameters()Ljava/util/List;

    move-result-object v6

    invoke-interface {v6, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LBh/l0;

    add-int/lit8 v6, p3, 0x1

    invoke-direct {p0, v4, p2, v3, v6}, Lpi/m0;->k(Lpi/B0;Lpi/n0;LBh/l0;I)Lpi/B0;

    move-result-object v3

    invoke-interface {v3}, Lpi/B0;->c()Z

    move-result v6

    if-eqz v6, :cond_1

    goto :goto_1

    :cond_1
    new-instance v6, Lpi/D0;

    invoke-interface {v3}, Lpi/B0;->a()Lpi/N0;

    move-result-object v7

    invoke-interface {v3}, Lpi/B0;->getType()Lpi/S;

    move-result-object v3

    invoke-interface {v4}, Lpi/B0;->getType()Lpi/S;

    move-result-object v4

    invoke-virtual {v4}, Lpi/S;->O0()Z

    move-result v4

    invoke-static {v3, v4}, Lpi/J0;->q(Lpi/S;Z)Lpi/S;

    move-result-object v3

    invoke-direct {v6, v7, v3}, Lpi/D0;-><init>(Lpi/N0;Lpi/S;)V

    move-object v3, v6

    :goto_1
    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move v3, v5

    goto :goto_0

    :cond_2
    const/4 p2, 0x2

    const/4 p3, 0x0

    invoke-static {p1, v2, p3, p2, p3}, Lpi/F0;->f(Lpi/d0;Ljava/util/List;Lpi/r0;ILjava/lang/Object;)Lpi/d0;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public final h(Lpi/n0;Lpi/r0;)Lpi/d0;
    .locals 7

    const-string v0, "typeAliasExpansion"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "attributes"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x0

    const/4 v6, 0x1

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v6}, Lpi/m0;->j(Lpi/n0;Lpi/r0;ZIZ)Lpi/d0;

    move-result-object p1

    return-object p1
.end method
