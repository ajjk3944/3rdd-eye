.class public abstract Lpi/p;
.super Lpi/v;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpi/p$a;,
        Lpi/p$b;
    }
.end annotation


# instance fields
.field private final b:Loi/i;

.field private final c:Z


# direct methods
.method public constructor <init>(Loi/n;)V
    .locals 3

    const-string v0, "storageManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lpi/v;-><init>()V

    new-instance v0, Lpi/h;

    invoke-direct {v0, p0}, Lpi/h;-><init>(Lpi/p;)V

    sget-object v1, Lpi/i;->a:Lpi/i;

    new-instance v2, Lpi/j;

    invoke-direct {v2, p0}, Lpi/j;-><init>(Lpi/p;)V

    invoke-interface {p1, v0, v1, v2}, Loi/n;->h(Lmh/a;Lmh/l;Lmh/l;)Loi/i;

    move-result-object p1

    iput-object p1, p0, Lpi/p;->b:Loi/i;

    return-void
.end method

.method private static final A(Lpi/p;)Lpi/p$b;
    .locals 1

    new-instance v0, Lpi/p$b;

    invoke-virtual {p0}, Lpi/p;->r()Ljava/util/Collection;

    move-result-object p0

    invoke-direct {v0, p0}, Lpi/p$b;-><init>(Ljava/util/Collection;)V

    return-object v0
.end method

.method private static final B(Z)Lpi/p$b;
    .locals 1

    new-instance p0, Lpi/p$b;

    sget-object v0, Lkotlin/reflect/jvm/internal/impl/types/error/l;->a:Lkotlin/reflect/jvm/internal/impl/types/error/l;

    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/impl/types/error/l;->l()Lpi/S;

    move-result-object v0

    invoke-static {v0}, LZg/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-direct {p0, v0}, Lpi/p$b;-><init>(Ljava/util/Collection;)V

    return-object p0
.end method

.method private static final C(Lpi/p;Lpi/p$b;)LYg/J;
    .locals 5

    const-string v0, "supertypes"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lpi/p;->v()LBh/j0;

    move-result-object v0

    invoke-virtual {p1}, Lpi/p$b;->a()Ljava/util/Collection;

    move-result-object v1

    new-instance v2, Lpi/k;

    invoke-direct {v2, p0}, Lpi/k;-><init>(Lpi/p;)V

    new-instance v3, Lpi/l;

    invoke-direct {v3, p0}, Lpi/l;-><init>(Lpi/p;)V

    invoke-interface {v0, p0, v1, v2, v3}, LBh/j0;->a(Lpi/v0;Ljava/util/Collection;Lmh/l;Lmh/l;)Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    invoke-virtual {p0}, Lpi/p;->s()Lpi/S;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {v0}, LZg/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    if-nez v0, :cond_1

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v0

    :cond_1
    check-cast v0, Ljava/util/Collection;

    :cond_2
    invoke-virtual {p0}, Lpi/p;->u()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-virtual {p0}, Lpi/p;->v()LBh/j0;

    move-result-object v1

    new-instance v3, Lpi/m;

    invoke-direct {v3, p0}, Lpi/m;-><init>(Lpi/p;)V

    new-instance v4, Lpi/n;

    invoke-direct {v4, p0}, Lpi/n;-><init>(Lpi/p;)V

    invoke-interface {v1, p0, v0, v3, v4}, LBh/j0;->a(Lpi/v0;Ljava/util/Collection;Lmh/l;Lmh/l;)Ljava/util/Collection;

    :cond_3
    instance-of v1, v0, Ljava/util/List;

    if-eqz v1, :cond_4

    move-object v2, v0

    check-cast v2, Ljava/util/List;

    :cond_4
    if-nez v2, :cond_5

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, LZg/v;->i1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v2

    :cond_5
    invoke-virtual {p0, v2}, Lpi/p;->x(Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    invoke-virtual {p1, p0}, Lpi/p$b;->c(Ljava/util/List;)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final D(Lpi/p;Lpi/v0;)Ljava/lang/Iterable;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lpi/p;->p(Lpi/v0;Z)Ljava/util/Collection;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    return-object p0
.end method

.method private static final E(Lpi/p;Lpi/S;)LYg/J;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lpi/p;->z(Lpi/S;)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final F(Lpi/p;Lpi/v0;)Ljava/lang/Iterable;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    invoke-direct {p0, p1, v0}, Lpi/p;->p(Lpi/v0;Z)Ljava/util/Collection;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    return-object p0
.end method

.method private static final G(Lpi/p;Lpi/S;)LYg/J;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lpi/p;->y(Lpi/S;)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method static synthetic i(Lpi/p;)Lpi/p$b;
    .locals 0

    invoke-static {p0}, Lpi/p;->A(Lpi/p;)Lpi/p$b;

    move-result-object p0

    return-object p0
.end method

.method static synthetic j(Z)Lpi/p$b;
    .locals 0

    invoke-static {p0}, Lpi/p;->B(Z)Lpi/p$b;

    move-result-object p0

    return-object p0
.end method

.method static synthetic k(Lpi/p;Lpi/p$b;)LYg/J;
    .locals 0

    invoke-static {p0, p1}, Lpi/p;->C(Lpi/p;Lpi/p$b;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method static synthetic l(Lpi/p;Lpi/v0;)Ljava/lang/Iterable;
    .locals 0

    invoke-static {p0, p1}, Lpi/p;->D(Lpi/p;Lpi/v0;)Ljava/lang/Iterable;

    move-result-object p0

    return-object p0
.end method

.method static synthetic m(Lpi/p;Lpi/S;)LYg/J;
    .locals 0

    invoke-static {p0, p1}, Lpi/p;->E(Lpi/p;Lpi/S;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method static synthetic n(Lpi/p;Lpi/v0;)Ljava/lang/Iterable;
    .locals 0

    invoke-static {p0, p1}, Lpi/p;->F(Lpi/p;Lpi/v0;)Ljava/lang/Iterable;

    move-result-object p0

    return-object p0
.end method

.method static synthetic o(Lpi/p;Lpi/S;)LYg/J;
    .locals 0

    invoke-static {p0, p1}, Lpi/p;->G(Lpi/p;Lpi/S;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method private final p(Lpi/v0;Z)Ljava/util/Collection;
    .locals 2

    instance-of v0, p1, Lpi/p;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lpi/p;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    iget-object v1, v0, Lpi/p;->b:Loi/i;

    invoke-interface {v1}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lpi/p$b;

    invoke-virtual {v1}, Lpi/p$b;->a()Ljava/util/Collection;

    move-result-object v1

    invoke-virtual {v0, p2}, Lpi/p;->t(Z)Ljava/util/Collection;

    move-result-object p2

    check-cast p2, Ljava/lang/Iterable;

    invoke-static {v1, p2}, LZg/v;->M0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p2

    if-eqz p2, :cond_1

    check-cast p2, Ljava/util/Collection;

    goto :goto_1

    :cond_1
    invoke-interface {p1}, Lpi/v0;->a()Ljava/util/Collection;

    move-result-object p2

    const-string p1, "getSupertypes(...)"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_1
    return-object p2
.end method


# virtual methods
.method public bridge synthetic a()Ljava/util/Collection;
    .locals 1

    invoke-virtual {p0}, Lpi/p;->w()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    return-object v0
.end method

.method public b(Lkotlin/reflect/jvm/internal/impl/types/checker/g;)Lpi/v0;
    .locals 1

    const-string v0, "kotlinTypeRefiner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lpi/p$a;

    invoke-direct {v0, p0, p1}, Lpi/p$a;-><init>(Lpi/p;Lkotlin/reflect/jvm/internal/impl/types/checker/g;)V

    return-object v0
.end method

.method protected abstract r()Ljava/util/Collection;
.end method

.method protected abstract s()Lpi/S;
.end method

.method protected t(Z)Ljava/util/Collection;
    .locals 0

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    return-object p1
.end method

.method protected u()Z
    .locals 1

    iget-boolean v0, p0, Lpi/p;->c:Z

    return v0
.end method

.method protected abstract v()LBh/j0;
.end method

.method public w()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lpi/p;->b:Loi/i;

    invoke-interface {v0}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpi/p$b;

    invoke-virtual {v0}, Lpi/p$b;->b()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method protected x(Ljava/util/List;)Ljava/util/List;
    .locals 1

    const-string v0, "supertypes"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method protected y(Lpi/S;)V
    .locals 1

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method protected z(Lpi/S;)V
    .locals 1

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method
