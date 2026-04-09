.class public Lwh/b1;
.super Lkotlin/jvm/internal/P;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lkotlin/jvm/internal/P;-><init>()V

    return-void
.end method

.method private static l(Lkotlin/jvm/internal/f;)Lwh/d0;
    .locals 1

    invoke-virtual {p0}, Lkotlin/jvm/internal/f;->getOwner()Lth/f;

    move-result-object p0

    instance-of v0, p0, Lwh/d0;

    if-eqz v0, :cond_0

    check-cast p0, Lwh/d0;

    goto :goto_0

    :cond_0
    sget-object p0, Lwh/k;->d:Lwh/k;

    :goto_0
    return-object p0
.end method


# virtual methods
.method public a(Lkotlin/jvm/internal/o;)Lth/g;
    .locals 4

    new-instance v0, Lwh/i0;

    invoke-static {p1}, Lwh/b1;->l(Lkotlin/jvm/internal/f;)Lwh/d0;

    move-result-object v1

    invoke-virtual {p1}, Lkotlin/jvm/internal/f;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lkotlin/jvm/internal/f;->getSignature()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lkotlin/jvm/internal/f;->getBoundReceiver()Ljava/lang/Object;

    move-result-object p1

    invoke-direct {v0, v1, v2, v3, p1}, Lwh/i0;-><init>(Lwh/d0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    return-object v0
.end method

.method public b(Ljava/lang/Class;)Lth/d;
    .locals 0

    invoke-static {p1}, Lwh/h;->m(Ljava/lang/Class;)Lwh/X;

    move-result-object p1

    return-object p1
.end method

.method public c(Ljava/lang/Class;Ljava/lang/String;)Lth/f;
    .locals 0

    invoke-static {p1}, Lwh/h;->n(Ljava/lang/Class;)Lth/f;

    move-result-object p1

    return-object p1
.end method

.method public d(Lkotlin/jvm/internal/w;)Lth/i;
    .locals 4

    new-instance v0, Lwh/k0;

    invoke-static {p1}, Lwh/b1;->l(Lkotlin/jvm/internal/f;)Lwh/d0;

    move-result-object v1

    invoke-virtual {p1}, Lkotlin/jvm/internal/f;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lkotlin/jvm/internal/f;->getSignature()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lkotlin/jvm/internal/f;->getBoundReceiver()Ljava/lang/Object;

    move-result-object p1

    invoke-direct {v0, v1, v2, v3, p1}, Lwh/k0;-><init>(Lwh/d0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    return-object v0
.end method

.method public e(Lkotlin/jvm/internal/y;)Lth/j;
    .locals 4

    new-instance v0, Lwh/m0;

    invoke-static {p1}, Lwh/b1;->l(Lkotlin/jvm/internal/f;)Lwh/d0;

    move-result-object v1

    invoke-virtual {p1}, Lkotlin/jvm/internal/f;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lkotlin/jvm/internal/f;->getSignature()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lkotlin/jvm/internal/f;->getBoundReceiver()Ljava/lang/Object;

    move-result-object p1

    invoke-direct {v0, v1, v2, v3, p1}, Lwh/m0;-><init>(Lwh/d0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    return-object v0
.end method

.method public f(Lkotlin/jvm/internal/C;)Lth/m;
    .locals 4

    new-instance v0, Lwh/B0;

    invoke-static {p1}, Lwh/b1;->l(Lkotlin/jvm/internal/f;)Lwh/d0;

    move-result-object v1

    invoke-virtual {p1}, Lkotlin/jvm/internal/f;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lkotlin/jvm/internal/f;->getSignature()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lkotlin/jvm/internal/f;->getBoundReceiver()Ljava/lang/Object;

    move-result-object p1

    invoke-direct {v0, v1, v2, v3, p1}, Lwh/B0;-><init>(Lwh/d0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    return-object v0
.end method

.method public g(Lkotlin/jvm/internal/E;)Lth/n;
    .locals 4

    new-instance v0, Lwh/E0;

    invoke-static {p1}, Lwh/b1;->l(Lkotlin/jvm/internal/f;)Lwh/d0;

    move-result-object v1

    invoke-virtual {p1}, Lkotlin/jvm/internal/f;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lkotlin/jvm/internal/f;->getSignature()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lkotlin/jvm/internal/f;->getBoundReceiver()Ljava/lang/Object;

    move-result-object p1

    invoke-direct {v0, v1, v2, v3, p1}, Lwh/E0;-><init>(Lwh/d0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    return-object v0
.end method

.method public h(Lkotlin/jvm/internal/G;)Lth/o;
    .locals 3

    new-instance v0, Lwh/H0;

    invoke-static {p1}, Lwh/b1;->l(Lkotlin/jvm/internal/f;)Lwh/d0;

    move-result-object v1

    invoke-virtual {p1}, Lkotlin/jvm/internal/f;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lkotlin/jvm/internal/f;->getSignature()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v1, v2, p1}, Lwh/H0;-><init>(Lwh/d0;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public i(Lkotlin/jvm/internal/n;)Ljava/lang/String;
    .locals 1

    invoke-static {p1}, Lvh/d;->a(LYg/i;)Lth/g;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {v0}, Lwh/j1;->c(Ljava/lang/Object;)Lwh/i0;

    move-result-object v0

    if-eqz v0, :cond_0

    sget-object p1, Lwh/e1;->a:Lwh/e1;

    invoke-virtual {v0}, Lwh/i0;->o0()LBh/z;

    move-result-object v0

    invoke-virtual {p1, v0}, Lwh/e1;->h(LBh/z;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-super {p0, p1}, Lkotlin/jvm/internal/P;->i(Lkotlin/jvm/internal/n;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public j(Lkotlin/jvm/internal/u;)Ljava/lang/String;
    .locals 0

    invoke-virtual {p0, p1}, Lwh/b1;->i(Lkotlin/jvm/internal/n;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public k(Lth/e;Ljava/util/List;Z)Lth/p;
    .locals 1

    instance-of v0, p1, Lkotlin/jvm/internal/h;

    if-eqz v0, :cond_0

    check-cast p1, Lkotlin/jvm/internal/h;

    invoke-interface {p1}, Lkotlin/jvm/internal/h;->b()Ljava/lang/Class;

    move-result-object p1

    invoke-static {p1, p2, p3}, Lwh/h;->k(Ljava/lang/Class;Ljava/util/List;Z)Lth/p;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    invoke-static {p1, p2, p3, v0}, Luh/a;->b(Lth/e;Ljava/util/List;ZLjava/util/List;)Lth/p;

    move-result-object p1

    return-object p1
.end method
