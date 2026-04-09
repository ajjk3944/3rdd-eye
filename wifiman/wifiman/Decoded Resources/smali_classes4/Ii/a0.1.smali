.class public abstract LIi/a0;
.super LRi/h;
.source "SourceFile"


# instance fields
.field public c:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, LRi/h;-><init>()V

    iput p1, p0, LIi/a0;->c:I

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;Ljava/lang/Throwable;)V
    .locals 0

    return-void
.end method

.method public abstract c()Ldh/e;
.end method

.method public d(Ljava/lang/Object;)Ljava/lang/Throwable;
    .locals 2

    instance-of v0, p1, LIi/C;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, LIi/C;

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    if-eqz p1, :cond_1

    iget-object v1, p1, LIi/C;->a:Ljava/lang/Throwable;

    :cond_1
    return-object v1
.end method

.method public e(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    return-object p1
.end method

.method public final f(Ljava/lang/Throwable;)V
    .locals 3

    new-instance v0, LIi/Q;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Fatal exception in coroutines machinery for "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ". Please read KDoc to \'handleFatalException\' method and report this incident to maintainers"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p1}, LIi/Q;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-virtual {p0}, LIi/a0;->c()Ldh/e;

    move-result-object p1

    invoke-interface {p1}, Ldh/e;->getContext()Ldh/i;

    move-result-object p1

    invoke-static {p1, v0}, LIi/L;->a(Ldh/i;Ljava/lang/Throwable;)V

    return-void
.end method

.method public abstract g()Ljava/lang/Object;
.end method

.method public final run()V
    .locals 9

    :try_start_0
    invoke-virtual {p0}, LIi/a0;->c()Ldh/e;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, LNi/g;

    iget-object v1, v0, LNi/g;->e:Ldh/e;

    iget-object v0, v0, LNi/g;->g:Ljava/lang/Object;

    invoke-interface {v1}, Ldh/e;->getContext()Ldh/i;

    move-result-object v2

    invoke-static {v2, v0}, LNi/J;->i(Ldh/i;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    sget-object v3, LNi/J;->a:LNi/C;

    const/4 v4, 0x0

    if-eq v0, v3, :cond_0

    invoke-static {v1, v2, v0}, LIi/H;->m(Ldh/e;Ldh/i;Ljava/lang/Object;)LIi/Y0;

    move-result-object v3
    :try_end_0
    .catch Lkotlinx/coroutines/DispatchException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto/16 :goto_4

    :catch_0
    move-exception v0

    goto/16 :goto_5

    :cond_0
    move-object v3, v4

    :goto_0
    :try_start_1
    invoke-interface {v1}, Ldh/e;->getContext()Ldh/i;

    move-result-object v5

    invoke-virtual {p0}, LIi/a0;->g()Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {p0, v6}, LIi/a0;->d(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v7

    if-nez v7, :cond_1

    iget v8, p0, LIi/a0;->c:I

    invoke-static {v8}, LIi/b0;->b(I)Z

    move-result v8

    if-eqz v8, :cond_1

    sget-object v4, LIi/y0;->O:LIi/y0$b;

    invoke-interface {v5, v4}, Ldh/i;->get(Ldh/i$c;)Ldh/i$b;

    move-result-object v4

    check-cast v4, LIi/y0;

    goto :goto_1

    :catchall_1
    move-exception v1

    goto :goto_3

    :cond_1
    :goto_1
    if-eqz v4, :cond_2

    invoke-interface {v4}, LIi/y0;->isActive()Z

    move-result v5

    if-nez v5, :cond_2

    invoke-interface {v4}, LIi/y0;->getCancellationException()Ljava/util/concurrent/CancellationException;

    move-result-object v4

    invoke-virtual {p0, v6, v4}, LIi/a0;->a(Ljava/lang/Object;Ljava/lang/Throwable;)V

    sget-object v5, LYg/u;->b:LYg/u$a;

    invoke-static {v4}, LYg/v;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v4}, LYg/u;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    invoke-interface {v1, v4}, Ldh/e;->resumeWith(Ljava/lang/Object;)V

    goto :goto_2

    :cond_2
    if-eqz v7, :cond_3

    sget-object v4, LYg/u;->b:LYg/u$a;

    invoke-static {v7}, LYg/v;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v4}, LYg/u;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    invoke-interface {v1, v4}, Ldh/e;->resumeWith(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    sget-object v4, LYg/u;->b:LYg/u$a;

    invoke-virtual {p0, v6}, LIi/a0;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v4}, LYg/u;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    invoke-interface {v1, v4}, Ldh/e;->resumeWith(Ljava/lang/Object;)V

    :goto_2
    sget-object v1, LYg/J;->a:LYg/J;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-eqz v3, :cond_4

    :try_start_2
    invoke-virtual {v3}, LIi/Y0;->S0()Z

    move-result v1

    if-eqz v1, :cond_7

    :cond_4
    invoke-static {v2, v0}, LNi/J;->f(Ldh/i;Ljava/lang/Object;)V

    goto :goto_6

    :goto_3
    if-eqz v3, :cond_5

    invoke-virtual {v3}, LIi/Y0;->S0()Z

    move-result v3

    if-eqz v3, :cond_6

    :cond_5
    invoke-static {v2, v0}, LNi/J;->f(Ldh/i;Ljava/lang/Object;)V

    :cond_6
    throw v1
    :try_end_2
    .catch Lkotlinx/coroutines/DispatchException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :goto_4
    invoke-virtual {p0, v0}, LIi/a0;->f(Ljava/lang/Throwable;)V

    goto :goto_6

    :goto_5
    invoke-virtual {p0}, LIi/a0;->c()Ldh/e;

    move-result-object v1

    invoke-interface {v1}, Ldh/e;->getContext()Ldh/i;

    move-result-object v1

    invoke-virtual {v0}, Lkotlinx/coroutines/DispatchException;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    invoke-static {v1, v0}, LIi/L;->a(Ldh/i;Ljava/lang/Throwable;)V

    :cond_7
    :goto_6
    return-void
.end method
