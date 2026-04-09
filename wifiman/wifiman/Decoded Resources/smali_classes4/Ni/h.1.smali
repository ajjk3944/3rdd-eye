.class public abstract LNi/h;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:LNi/C;

.field public static final b:LNi/C;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LNi/C;

    const-string v1, "UNDEFINED"

    invoke-direct {v0, v1}, LNi/C;-><init>(Ljava/lang/String;)V

    sput-object v0, LNi/h;->a:LNi/C;

    new-instance v0, LNi/C;

    const-string v1, "REUSABLE_CLAIMED"

    invoke-direct {v0, v1}, LNi/C;-><init>(Ljava/lang/String;)V

    sput-object v0, LNi/h;->b:LNi/C;

    return-void
.end method

.method public static final synthetic a()LNi/C;
    .locals 1

    sget-object v0, LNi/h;->a:LNi/C;

    return-object v0
.end method

.method public static final b(Ldh/e;Ljava/lang/Object;)V
    .locals 6

    instance-of v0, p0, LNi/g;

    if-eqz v0, :cond_8

    check-cast p0, LNi/g;

    invoke-static {p1}, LIi/D;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, LNi/g;->d:LIi/J;

    invoke-virtual {p0}, LNi/g;->getContext()Ldh/i;

    move-result-object v2

    invoke-static {v1, v2}, LNi/h;->d(LIi/J;Ldh/i;)Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    iput-object v0, p0, LNi/g;->f:Ljava/lang/Object;

    iput v2, p0, LIi/a0;->c:I

    iget-object p1, p0, LNi/g;->d:LIi/J;

    invoke-virtual {p0}, LNi/g;->getContext()Ldh/i;

    move-result-object v0

    invoke-static {p1, v0, p0}, LNi/h;->c(LIi/J;Ldh/i;Ljava/lang/Runnable;)V

    goto/16 :goto_4

    :cond_0
    sget-object v1, LIi/U0;->a:LIi/U0;

    invoke-virtual {v1}, LIi/U0;->b()LIi/i0;

    move-result-object v1

    invoke-virtual {v1}, LIi/i0;->w0()Z

    move-result v3

    if-eqz v3, :cond_1

    iput-object v0, p0, LNi/g;->f:Ljava/lang/Object;

    iput v2, p0, LIi/a0;->c:I

    invoke-virtual {v1, p0}, LIi/i0;->s0(LIi/a0;)V

    goto/16 :goto_4

    :cond_1
    invoke-virtual {v1, v2}, LIi/i0;->u0(Z)V

    :try_start_0
    invoke-virtual {p0}, LNi/g;->getContext()Ldh/i;

    move-result-object v3

    sget-object v4, LIi/y0;->O:LIi/y0$b;

    invoke-interface {v3, v4}, Ldh/i;->get(Ldh/i$c;)Ldh/i$b;

    move-result-object v3

    check-cast v3, LIi/y0;

    if-eqz v3, :cond_2

    invoke-interface {v3}, LIi/y0;->isActive()Z

    move-result v4

    if-nez v4, :cond_2

    invoke-interface {v3}, LIi/y0;->getCancellationException()Ljava/util/concurrent/CancellationException;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, LIi/a0;->a(Ljava/lang/Object;Ljava/lang/Throwable;)V

    sget-object v0, LYg/u;->b:LYg/u$a;

    invoke-static {p1}, LYg/v;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, LYg/u;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {p0, p1}, Ldh/e;->resumeWith(Ljava/lang/Object;)V

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_3

    :cond_2
    iget-object v0, p0, LNi/g;->e:Ldh/e;

    iget-object v3, p0, LNi/g;->g:Ljava/lang/Object;

    invoke-interface {v0}, Ldh/e;->getContext()Ldh/i;

    move-result-object v4

    invoke-static {v4, v3}, LNi/J;->i(Ldh/i;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    sget-object v5, LNi/J;->a:LNi/C;

    if-eq v3, v5, :cond_3

    invoke-static {v0, v4, v3}, LIi/H;->m(Ldh/e;Ldh/i;Ljava/lang/Object;)LIi/Y0;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :cond_3
    const/4 v0, 0x0

    :goto_0
    :try_start_1
    iget-object v5, p0, LNi/g;->e:Ldh/e;

    invoke-interface {v5, p1}, Ldh/e;->resumeWith(Ljava/lang/Object;)V

    sget-object p1, LYg/J;->a:LYg/J;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-eqz v0, :cond_4

    :try_start_2
    invoke-virtual {v0}, LIi/Y0;->S0()Z

    move-result p1

    if-eqz p1, :cond_5

    :cond_4
    invoke-static {v4, v3}, LNi/J;->f(Ldh/i;Ljava/lang/Object;)V

    :cond_5
    :goto_1
    invoke-virtual {v1}, LIi/i0;->z0()Z

    move-result p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-nez p1, :cond_5

    :goto_2
    invoke-virtual {v1, v2}, LIi/i0;->p0(Z)V

    goto :goto_4

    :catchall_1
    move-exception p1

    if-eqz v0, :cond_6

    :try_start_3
    invoke-virtual {v0}, LIi/Y0;->S0()Z

    move-result v0

    if-eqz v0, :cond_7

    :cond_6
    invoke-static {v4, v3}, LNi/J;->f(Ldh/i;Ljava/lang/Object;)V

    :cond_7
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :goto_3
    :try_start_4
    invoke-virtual {p0, p1}, LIi/a0;->f(Ljava/lang/Throwable;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    goto :goto_2

    :catchall_2
    move-exception p0

    invoke-virtual {v1, v2}, LIi/i0;->p0(Z)V

    throw p0

    :cond_8
    invoke-interface {p0, p1}, Ldh/e;->resumeWith(Ljava/lang/Object;)V

    :goto_4
    return-void
.end method

.method public static final c(LIi/J;Ldh/i;Ljava/lang/Runnable;)V
    .locals 1

    :try_start_0
    invoke-virtual {p0, p1, p2}, LIi/J;->Y(Ldh/i;Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p2

    new-instance v0, Lkotlinx/coroutines/DispatchException;

    invoke-direct {v0, p2, p0, p1}, Lkotlinx/coroutines/DispatchException;-><init>(Ljava/lang/Throwable;LIi/J;Ldh/i;)V

    throw v0
.end method

.method public static final d(LIi/J;Ldh/i;)Z
    .locals 2

    :try_start_0
    invoke-virtual {p0, p1}, LIi/J;->m0(Ldh/i;)Z

    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return p0

    :catchall_0
    move-exception v0

    new-instance v1, Lkotlinx/coroutines/DispatchException;

    invoke-direct {v1, v0, p0, p1}, Lkotlinx/coroutines/DispatchException;-><init>(Ljava/lang/Throwable;LIi/J;Ldh/i;)V

    throw v1
.end method

.method public static final e(LNi/g;)Z
    .locals 5

    sget-object v0, LYg/J;->a:LYg/J;

    sget-object v1, LIi/U0;->a:LIi/U0;

    invoke-virtual {v1}, LIi/U0;->b()LIi/i0;

    move-result-object v1

    invoke-virtual {v1}, LIi/i0;->x0()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {v1}, LIi/i0;->w0()Z

    move-result v2

    const/4 v4, 0x1

    if-eqz v2, :cond_1

    iput-object v0, p0, LNi/g;->f:Ljava/lang/Object;

    iput v4, p0, LIi/a0;->c:I

    invoke-virtual {v1, p0}, LIi/i0;->s0(LIi/a0;)V

    move v3, v4

    goto :goto_1

    :cond_1
    invoke-virtual {v1, v4}, LIi/i0;->u0(Z)V

    :try_start_0
    invoke-virtual {p0}, LIi/a0;->run()V

    :cond_2
    invoke-virtual {v1}, LIi/i0;->z0()Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_2

    :goto_0
    invoke-virtual {v1, v4}, LIi/i0;->p0(Z)V

    goto :goto_1

    :catchall_0
    move-exception v0

    :try_start_1
    invoke-virtual {p0, v0}, LIi/a0;->f(Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :goto_1
    return v3

    :catchall_1
    move-exception p0

    invoke-virtual {v1, v4}, LIi/i0;->p0(Z)V

    throw p0
.end method
