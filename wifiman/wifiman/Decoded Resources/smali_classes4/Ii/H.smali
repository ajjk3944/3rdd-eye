.class public abstract LIi/H;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Lkotlin/jvm/internal/N;ZLdh/i;Ldh/i$b;)Ldh/i;
    .locals 0

    invoke-static {p0, p1, p2, p3}, LIi/H;->e(Lkotlin/jvm/internal/N;ZLdh/i;Ldh/i$b;)Ldh/i;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ldh/i;Ldh/i$b;)Ldh/i;
    .locals 0

    invoke-static {p0, p1}, LIi/H;->f(Ldh/i;Ldh/i$b;)Ldh/i;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(ZLdh/i$b;)Z
    .locals 0

    invoke-static {p0, p1}, LIi/H;->i(ZLdh/i$b;)Z

    move-result p0

    return p0
.end method

.method private static final d(Ldh/i;Ldh/i;Z)Ldh/i;
    .locals 3

    invoke-static {p0}, LIi/H;->h(Ldh/i;)Z

    move-result v0

    invoke-static {p1}, LIi/H;->h(Ldh/i;)Z

    move-result v1

    if-nez v0, :cond_0

    if-nez v1, :cond_0

    invoke-interface {p0, p1}, Ldh/i;->plus(Ldh/i;)Ldh/i;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance v0, Lkotlin/jvm/internal/N;

    invoke-direct {v0}, Lkotlin/jvm/internal/N;-><init>()V

    iput-object p1, v0, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    sget-object p1, Ldh/j;->a:Ldh/j;

    new-instance v2, LIi/F;

    invoke-direct {v2, v0, p2}, LIi/F;-><init>(Lkotlin/jvm/internal/N;Z)V

    invoke-interface {p0, p1, v2}, Ldh/i;->fold(Ljava/lang/Object;Lmh/p;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ldh/i;

    if-eqz v1, :cond_1

    iget-object p2, v0, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    check-cast p2, Ldh/i;

    new-instance v1, LIi/G;

    invoke-direct {v1}, LIi/G;-><init>()V

    invoke-interface {p2, p1, v1}, Ldh/i;->fold(Ljava/lang/Object;Lmh/p;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, v0, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    :cond_1
    iget-object p1, v0, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    check-cast p1, Ldh/i;

    invoke-interface {p0, p1}, Ldh/i;->plus(Ldh/i;)Ldh/i;

    move-result-object p0

    return-object p0
.end method

.method private static final e(Lkotlin/jvm/internal/N;ZLdh/i;Ldh/i$b;)Ldh/i;
    .locals 0

    invoke-interface {p2, p3}, Ldh/i;->plus(Ldh/i;)Ldh/i;

    move-result-object p0

    return-object p0
.end method

.method private static final f(Ldh/i;Ldh/i$b;)Ldh/i;
    .locals 0

    invoke-interface {p0, p1}, Ldh/i;->plus(Ldh/i;)Ldh/i;

    move-result-object p0

    return-object p0
.end method

.method public static final g(Ldh/i;)Ljava/lang/String;
    .locals 0

    const/4 p0, 0x0

    return-object p0
.end method

.method private static final h(Ldh/i;)Z
    .locals 2

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    new-instance v1, LIi/E;

    invoke-direct {v1}, LIi/E;-><init>()V

    invoke-interface {p0, v0, v1}, Ldh/i;->fold(Ljava/lang/Object;Lmh/p;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method private static final i(ZLdh/i$b;)Z
    .locals 0

    return p0
.end method

.method public static final j(LIi/N;Ldh/i;)Ldh/i;
    .locals 1

    invoke-interface {p0}, LIi/N;->getCoroutineContext()Ldh/i;

    move-result-object p0

    const/4 v0, 0x1

    invoke-static {p0, p1, v0}, LIi/H;->d(Ldh/i;Ldh/i;Z)Ldh/i;

    move-result-object p0

    invoke-static {}, LIi/c0;->a()LIi/J;

    move-result-object p1

    if-eq p0, p1, :cond_0

    sget-object p1, Ldh/f;->m0:Ldh/f$b;

    invoke-interface {p0, p1}, Ldh/i;->get(Ldh/i$c;)Ldh/i$b;

    move-result-object p1

    if-nez p1, :cond_0

    invoke-static {}, LIi/c0;->a()LIi/J;

    move-result-object p1

    invoke-interface {p0, p1}, Ldh/i;->plus(Ldh/i;)Ldh/i;

    move-result-object p0

    :cond_0
    return-object p0
.end method

.method public static final k(Ldh/i;Ldh/i;)Ldh/i;
    .locals 1

    invoke-static {p1}, LIi/H;->h(Ldh/i;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-interface {p0, p1}, Ldh/i;->plus(Ldh/i;)Ldh/i;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, LIi/H;->d(Ldh/i;Ldh/i;Z)Ldh/i;

    move-result-object p0

    return-object p0
.end method

.method public static final l(Lkotlin/coroutines/jvm/internal/e;)LIi/Y0;
    .locals 2

    :cond_0
    instance-of v0, p0, LIi/Z;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    return-object v1

    :cond_1
    invoke-interface {p0}, Lkotlin/coroutines/jvm/internal/e;->getCallerFrame()Lkotlin/coroutines/jvm/internal/e;

    move-result-object p0

    if-nez p0, :cond_2

    return-object v1

    :cond_2
    instance-of v0, p0, LIi/Y0;

    if-eqz v0, :cond_0

    check-cast p0, LIi/Y0;

    return-object p0
.end method

.method public static final m(Ldh/e;Ldh/i;Ljava/lang/Object;)LIi/Y0;
    .locals 2

    instance-of v0, p0, Lkotlin/coroutines/jvm/internal/e;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    sget-object v0, LIi/Z0;->a:LIi/Z0;

    invoke-interface {p1, v0}, Ldh/i;->get(Ldh/i$c;)Ldh/i$b;

    move-result-object v0

    if-eqz v0, :cond_2

    check-cast p0, Lkotlin/coroutines/jvm/internal/e;

    invoke-static {p0}, LIi/H;->l(Lkotlin/coroutines/jvm/internal/e;)LIi/Y0;

    move-result-object p0

    if-eqz p0, :cond_1

    invoke-virtual {p0, p1, p2}, LIi/Y0;->U0(Ldh/i;Ljava/lang/Object;)V

    :cond_1
    return-object p0

    :cond_2
    return-object v1
.end method
