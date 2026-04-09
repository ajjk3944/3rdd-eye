.class abstract Lzi/t;
.super Lzi/o;
.source "SourceFile"


# direct methods
.method public static synthetic c(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0}, Lzi/t;->r(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lzi/j;)Ljava/util/Iterator;
    .locals 0

    invoke-static {p0}, Lzi/t;->l(Lzi/j;)Ljava/util/Iterator;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lmh/a;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1}, Lzi/t;->q(Lmh/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0}, Lzi/t;->m(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static g(Ljava/util/Iterator;)Lzi/j;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lzi/t$a;

    invoke-direct {v0, p0}, Lzi/t$a;-><init>(Ljava/util/Iterator;)V

    invoke-static {v0}, Lzi/m;->h(Lzi/j;)Lzi/j;

    move-result-object p0

    return-object p0
.end method

.method public static h(Lzi/j;)Lzi/j;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Lzi/a;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Lzi/a;

    invoke-direct {v0, p0}, Lzi/a;-><init>(Lzi/j;)V

    move-object p0, v0

    :goto_0
    return-object p0
.end method

.method public static i()Lzi/j;
    .locals 1

    sget-object v0, Lzi/f;->a:Lzi/f;

    return-object v0
.end method

.method public static j(Lzi/j;)Lzi/j;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lzi/r;

    invoke-direct {v0}, Lzi/r;-><init>()V

    invoke-static {p0, v0}, Lzi/t;->k(Lzi/j;Lmh/l;)Lzi/j;

    move-result-object p0

    return-object p0
.end method

.method private static final k(Lzi/j;Lmh/l;)Lzi/j;
    .locals 2

    instance-of v0, p0, Lzi/B;

    if-eqz v0, :cond_0

    check-cast p0, Lzi/B;

    invoke-virtual {p0, p1}, Lzi/B;->e(Lmh/l;)Lzi/j;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance v0, Lzi/h;

    new-instance v1, Lzi/s;

    invoke-direct {v1}, Lzi/s;-><init>()V

    invoke-direct {v0, p0, v1, p1}, Lzi/h;-><init>(Lzi/j;Lmh/l;Lmh/l;)V

    return-object v0
.end method

.method private static final l(Lzi/j;)Ljava/util/Iterator;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lzi/j;->iterator()Ljava/util/Iterator;

    move-result-object p0

    return-object p0
.end method

.method private static final m(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    return-object p0
.end method

.method public static n(Ljava/lang/Object;Lmh/l;)Lzi/j;
    .locals 2

    const-string v0, "nextFunction"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p0, :cond_0

    sget-object p0, Lzi/f;->a:Lzi/f;

    goto :goto_0

    :cond_0
    new-instance v0, Lzi/i;

    new-instance v1, Lzi/p;

    invoke-direct {v1, p0}, Lzi/p;-><init>(Ljava/lang/Object;)V

    invoke-direct {v0, v1, p1}, Lzi/i;-><init>(Lmh/a;Lmh/l;)V

    move-object p0, v0

    :goto_0
    return-object p0
.end method

.method public static o(Lmh/a;)Lzi/j;
    .locals 2

    const-string v0, "nextFunction"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lzi/i;

    new-instance v1, Lzi/q;

    invoke-direct {v1, p0}, Lzi/q;-><init>(Lmh/a;)V

    invoke-direct {v0, p0, v1}, Lzi/i;-><init>(Lmh/a;Lmh/l;)V

    invoke-static {v0}, Lzi/m;->h(Lzi/j;)Lzi/j;

    move-result-object p0

    return-object p0
.end method

.method public static p(Lmh/a;Lmh/l;)Lzi/j;
    .locals 1

    const-string v0, "seedFunction"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nextFunction"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lzi/i;

    invoke-direct {v0, p0, p1}, Lzi/i;-><init>(Lmh/a;Lmh/l;)V

    return-object v0
.end method

.method private static final q(Lmh/a;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private static final r(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    return-object p0
.end method

.method public static varargs s([Ljava/lang/Object;)Lzi/j;
    .locals 1

    const-string v0, "elements"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, LZg/n;->Q([Ljava/lang/Object;)Lzi/j;

    move-result-object p0

    return-object p0
.end method
