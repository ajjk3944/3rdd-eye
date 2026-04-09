.class public abstract LOi/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method private static final a(Ldh/e;Ljava/lang/Throwable;)V
    .locals 1

    instance-of v0, p1, Lkotlinx/coroutines/DispatchException;

    if-eqz v0, :cond_0

    check-cast p1, Lkotlinx/coroutines/DispatchException;

    invoke-virtual {p1}, Lkotlinx/coroutines/DispatchException;->getCause()Ljava/lang/Throwable;

    move-result-object p1

    :cond_0
    sget-object v0, LYg/u;->b:LYg/u$a;

    invoke-static {p1}, LYg/v;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, LYg/u;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p0, v0}, Ldh/e;->resumeWith(Ljava/lang/Object;)V

    throw p1
.end method

.method public static final b(Ldh/e;Ldh/e;)V
    .locals 1

    :try_start_0
    invoke-static {p0}, Leh/b;->d(Ldh/e;)Ldh/e;

    move-result-object p0

    sget-object v0, LYg/u;->b:LYg/u$a;

    sget-object v0, LYg/J;->a:LYg/J;

    invoke-static {v0}, LYg/u;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {p0, v0}, LNi/h;->b(Ldh/e;Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    invoke-static {p1, p0}, LOi/a;->a(Ldh/e;Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public static final c(Lmh/l;Ldh/e;)V
    .locals 1

    :try_start_0
    invoke-static {p0, p1}, Leh/b;->a(Lmh/l;Ldh/e;)Ldh/e;

    move-result-object p0

    invoke-static {p0}, Leh/b;->d(Ldh/e;)Ldh/e;

    move-result-object p0

    sget-object v0, LYg/u;->b:LYg/u$a;

    sget-object v0, LYg/J;->a:LYg/J;

    invoke-static {v0}, LYg/u;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {p0, v0}, LNi/h;->b(Ldh/e;Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    invoke-static {p1, p0}, LOi/a;->a(Ldh/e;Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public static final d(Lmh/p;Ljava/lang/Object;Ldh/e;)V
    .locals 0

    :try_start_0
    invoke-static {p0, p1, p2}, Leh/b;->b(Lmh/p;Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p0

    invoke-static {p0}, Leh/b;->d(Ldh/e;)Ldh/e;

    move-result-object p0

    sget-object p1, LYg/u;->b:LYg/u$a;

    sget-object p1, LYg/J;->a:LYg/J;

    invoke-static {p1}, LYg/u;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p0, p1}, LNi/h;->b(Ldh/e;Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    invoke-static {p2, p0}, LOi/a;->a(Ldh/e;Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method
