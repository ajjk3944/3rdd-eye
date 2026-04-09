.class abstract synthetic LIi/B0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LIi/y0;)LIi/A;
    .locals 1

    new-instance v0, LIi/z0;

    invoke-direct {v0, p0}, LIi/z0;-><init>(LIi/y0;)V

    return-object v0
.end method

.method public static synthetic b(LIi/y0;ILjava/lang/Object;)LIi/A;
    .locals 0

    and-int/lit8 p1, p1, 0x1

    if-eqz p1, :cond_0

    const/4 p0, 0x0

    :cond_0
    invoke-static {p0}, LIi/A0;->a(LIi/y0;)LIi/A;

    move-result-object p0

    return-object p0
.end method

.method public static final c(LIi/y0;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p1, p2}, LIi/n0;->a(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/util/concurrent/CancellationException;

    move-result-object p1

    invoke-interface {p0, p1}, LIi/y0;->cancel(Ljava/util/concurrent/CancellationException;)V

    return-void
.end method

.method public static final d(Ldh/i;Ljava/util/concurrent/CancellationException;)V
    .locals 1

    sget-object v0, LIi/y0;->O:LIi/y0$b;

    invoke-interface {p0, v0}, Ldh/i;->get(Ldh/i$c;)Ldh/i$b;

    move-result-object p0

    check-cast p0, LIi/y0;

    if-eqz p0, :cond_0

    invoke-interface {p0, p1}, LIi/y0;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_0
    return-void
.end method

.method public static synthetic e(LIi/y0;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-static {p0, p1, p2}, LIi/A0;->c(LIi/y0;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic f(Ldh/i;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-static {p0, p1}, LIi/A0;->d(Ldh/i;Ljava/util/concurrent/CancellationException;)V

    return-void
.end method

.method public static final g(LIi/y0;Ldh/e;)Ljava/lang/Object;
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {p0, v0, v1, v0}, LIi/y0$a;->b(LIi/y0;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    invoke-interface {p0, p1}, LIi/y0;->join(Ldh/e;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_0

    return-object p0

    :cond_0
    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method public static final h(Ldh/i;Ljava/util/concurrent/CancellationException;)V
    .locals 1

    sget-object v0, LIi/y0;->O:LIi/y0$b;

    invoke-interface {p0, v0}, Ldh/i;->get(Ldh/i$c;)Ldh/i$b;

    move-result-object p0

    check-cast p0, LIi/y0;

    if-eqz p0, :cond_0

    invoke-interface {p0}, LIi/y0;->getChildren()Lzi/j;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-interface {p0}, Lzi/j;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LIi/y0;

    invoke-interface {v0, p1}, LIi/y0;->cancel(Ljava/util/concurrent/CancellationException;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static synthetic i(Ldh/i;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-static {p0, p1}, LIi/A0;->h(Ldh/i;Ljava/util/concurrent/CancellationException;)V

    return-void
.end method

.method public static final j(LIi/y0;LIi/e0;)LIi/e0;
    .locals 3

    new-instance v0, LIi/g0;

    invoke-direct {v0, p1}, LIi/g0;-><init>(LIi/e0;)V

    const/4 p1, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p0, v2, v0, p1, v1}, LIi/A0;->o(LIi/y0;ZLIi/C0;ILjava/lang/Object;)LIi/e0;

    move-result-object p0

    return-object p0
.end method

.method public static final k(LIi/y0;)V
    .locals 1

    invoke-interface {p0}, LIi/y0;->isActive()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-interface {p0}, LIi/y0;->getCancellationException()Ljava/util/concurrent/CancellationException;

    move-result-object p0

    throw p0
.end method

.method public static final l(Ldh/i;)V
    .locals 1

    sget-object v0, LIi/y0;->O:LIi/y0$b;

    invoke-interface {p0, v0}, Ldh/i;->get(Ldh/i$c;)Ldh/i$b;

    move-result-object p0

    check-cast p0, LIi/y0;

    if-eqz p0, :cond_0

    invoke-static {p0}, LIi/A0;->k(LIi/y0;)V

    :cond_0
    return-void
.end method

.method public static final m(Ldh/i;)LIi/y0;
    .locals 3

    sget-object v0, LIi/y0;->O:LIi/y0$b;

    invoke-interface {p0, v0}, Ldh/i;->get(Ldh/i$c;)Ldh/i$b;

    move-result-object v0

    check-cast v0, LIi/y0;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Current context doesn\'t contain Job in it: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static final n(LIi/y0;ZLIi/C0;)LIi/e0;
    .locals 2

    instance-of v0, p0, LIi/D0;

    if-eqz v0, :cond_0

    check-cast p0, LIi/D0;

    invoke-virtual {p0, p1, p2}, LIi/D0;->h0(ZLIi/C0;)LIi/e0;

    move-result-object p0

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, LIi/C0;->u()Z

    move-result v0

    new-instance v1, LIi/B0$a;

    invoke-direct {v1, p2}, LIi/B0$a;-><init>(Ljava/lang/Object;)V

    invoke-interface {p0, v0, p1, v1}, LIi/y0;->invokeOnCompletion(ZZLmh/l;)LIi/e0;

    move-result-object p0

    :goto_0
    return-object p0
.end method

.method public static synthetic o(LIi/y0;ZLIi/C0;ILjava/lang/Object;)LIi/e0;
    .locals 0

    const/4 p4, 0x1

    and-int/2addr p3, p4

    if-eqz p3, :cond_0

    move p1, p4

    :cond_0
    invoke-static {p0, p1, p2}, LIi/A0;->n(LIi/y0;ZLIi/C0;)LIi/e0;

    move-result-object p0

    return-object p0
.end method

.method public static final p(Ldh/i;)Z
    .locals 1

    sget-object v0, LIi/y0;->O:LIi/y0$b;

    invoke-interface {p0, v0}, Ldh/i;->get(Ldh/i$c;)Ldh/i$b;

    move-result-object p0

    check-cast p0, LIi/y0;

    if-eqz p0, :cond_0

    invoke-interface {p0}, LIi/y0;->isActive()Z

    move-result p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x1

    :goto_0
    return p0
.end method
