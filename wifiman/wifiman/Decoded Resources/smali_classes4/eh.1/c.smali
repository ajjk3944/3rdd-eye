.class abstract Leh/c;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Lmh/l;Ldh/e;)Ldh/e;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "completion"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/h;->a(Ldh/e;)Ldh/e;

    move-result-object p1

    instance-of v0, p0, Lkotlin/coroutines/jvm/internal/a;

    if-eqz v0, :cond_0

    check-cast p0, Lkotlin/coroutines/jvm/internal/a;

    invoke-virtual {p0, p1}, Lkotlin/coroutines/jvm/internal/a;->create(Ldh/e;)Ldh/e;

    move-result-object p0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, Ldh/e;->getContext()Ldh/i;

    move-result-object v0

    sget-object v1, Ldh/j;->a:Ldh/j;

    if-ne v0, v1, :cond_1

    new-instance v0, Leh/c$a;

    invoke-direct {v0, p1, p0}, Leh/c$a;-><init>(Ldh/e;Lmh/l;)V

    move-object p0, v0

    goto :goto_0

    :cond_1
    new-instance v1, Leh/c$b;

    invoke-direct {v1, p1, v0, p0}, Leh/c$b;-><init>(Ldh/e;Ldh/i;Lmh/l;)V

    move-object p0, v1

    :goto_0
    return-object p0
.end method

.method public static b(Lmh/p;Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "completion"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2}, Lkotlin/coroutines/jvm/internal/h;->a(Ldh/e;)Ldh/e;

    move-result-object p2

    instance-of v0, p0, Lkotlin/coroutines/jvm/internal/a;

    if-eqz v0, :cond_0

    check-cast p0, Lkotlin/coroutines/jvm/internal/a;

    invoke-virtual {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/a;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p0

    goto :goto_0

    :cond_0
    invoke-interface {p2}, Ldh/e;->getContext()Ldh/i;

    move-result-object v0

    sget-object v1, Ldh/j;->a:Ldh/j;

    if-ne v0, v1, :cond_1

    new-instance v0, Leh/c$c;

    invoke-direct {v0, p2, p0, p1}, Leh/c$c;-><init>(Ldh/e;Lmh/p;Ljava/lang/Object;)V

    move-object p0, v0

    goto :goto_0

    :cond_1
    new-instance v1, Leh/c$d;

    invoke-direct {v1, p2, v0, p0, p1}, Leh/c$d;-><init>(Ldh/e;Ldh/i;Lmh/p;Ljava/lang/Object;)V

    move-object p0, v1

    :goto_0
    return-object p0
.end method

.method private static final c(Ldh/e;)Ldh/e;
    .locals 2

    invoke-interface {p0}, Ldh/e;->getContext()Ldh/i;

    move-result-object v0

    sget-object v1, Ldh/j;->a:Ldh/j;

    if-ne v0, v1, :cond_0

    new-instance v0, Leh/c$e;

    invoke-direct {v0, p0}, Leh/c$e;-><init>(Ldh/e;)V

    goto :goto_0

    :cond_0
    new-instance v1, Leh/c$f;

    invoke-direct {v1, p0, v0}, Leh/c$f;-><init>(Ldh/e;Ldh/i;)V

    move-object v0, v1

    :goto_0
    return-object v0
.end method

.method public static d(Ldh/e;)Ldh/e;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Lkotlin/coroutines/jvm/internal/d;

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, Lkotlin/coroutines/jvm/internal/d;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lkotlin/coroutines/jvm/internal/d;->intercepted()Ldh/e;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    move-object p0, v0

    :cond_2
    :goto_1
    return-object p0
.end method

.method public static e(Lmh/p;Ljava/lang/Object;Ldh/e;)Ljava/lang/Object;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "completion"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2}, Lkotlin/coroutines/jvm/internal/h;->a(Ldh/e;)Ldh/e;

    move-result-object p2

    invoke-static {p2}, Leh/c;->c(Ldh/e;)Ldh/e;

    move-result-object p2

    const/4 v0, 0x2

    invoke-static {p0, v0}, Lkotlin/jvm/internal/V;->f(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lmh/p;

    invoke-interface {p0, p1, p2}, Lmh/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static f(Lmh/q;Ljava/lang/Object;Ljava/lang/Object;Ldh/e;)Ljava/lang/Object;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "completion"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p3}, Lkotlin/coroutines/jvm/internal/h;->a(Ldh/e;)Ldh/e;

    move-result-object p3

    invoke-static {p3}, Leh/c;->c(Ldh/e;)Ldh/e;

    move-result-object p3

    const/4 v0, 0x3

    invoke-static {p0, v0}, Lkotlin/jvm/internal/V;->f(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lmh/q;

    invoke-interface {p0, p1, p2, p3}, Lmh/q;->s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
