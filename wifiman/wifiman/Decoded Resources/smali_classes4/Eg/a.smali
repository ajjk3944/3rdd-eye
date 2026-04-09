.class public abstract LEg/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field static volatile a:Lkg/f;

.field static volatile b:Lkg/n;

.field static volatile c:Lkg/n;

.field static volatile d:Lkg/n;

.field static volatile e:Lkg/n;

.field static volatile f:Lkg/n;

.field static volatile g:Lkg/n;

.field static volatile h:Lkg/n;

.field static volatile i:Lkg/n;

.field static volatile j:Lkg/n;

.field static volatile k:Lkg/n;

.field static volatile l:Lkg/n;

.field static volatile m:Lkg/n;

.field static volatile n:Lkg/n;

.field static volatile o:Lkg/n;

.field static volatile p:Lkg/n;

.field static volatile q:Lkg/b;

.field static volatile r:Lkg/b;

.field static volatile s:Lkg/b;

.field static volatile t:Lkg/b;

.field static volatile u:Lkg/b;

.field static volatile v:Lkg/d;

.field static volatile w:Z

.field static volatile x:Z


# direct methods
.method public static A(Lgg/b;Lgg/d;)Lgg/d;
    .locals 1

    sget-object v0, LEg/a;->u:Lkg/b;

    if-eqz v0, :cond_0

    invoke-static {v0, p0, p1}, LEg/a;->a(Lkg/b;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lgg/d;

    return-object p0

    :cond_0
    return-object p1
.end method

.method public static B(Lgg/n;Lgg/p;)Lgg/p;
    .locals 1

    sget-object v0, LEg/a;->r:Lkg/b;

    if-eqz v0, :cond_0

    invoke-static {v0, p0, p1}, LEg/a;->a(Lkg/b;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lgg/p;

    return-object p0

    :cond_0
    return-object p1
.end method

.method public static C(Lgg/s;Lgg/x;)Lgg/x;
    .locals 1

    sget-object v0, LEg/a;->s:Lkg/b;

    if-eqz v0, :cond_0

    invoke-static {v0, p0, p1}, LEg/a;->a(Lkg/b;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lgg/x;

    return-object p0

    :cond_0
    return-object p1
.end method

.method public static D(Lgg/z;Lgg/B;)Lgg/B;
    .locals 1

    sget-object v0, LEg/a;->t:Lkg/b;

    if-eqz v0, :cond_0

    invoke-static {v0, p0, p1}, LEg/a;->a(Lkg/b;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lgg/B;

    return-object p0

    :cond_0
    return-object p1
.end method

.method public static E(Lkg/f;)V
    .locals 1

    sget-boolean v0, LEg/a;->w:Z

    if-nez v0, :cond_0

    sput-object p0, LEg/a;->a:Lkg/f;

    return-void

    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "Plugins can\'t be changed anymore"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method static F(Ljava/lang/Throwable;)V
    .locals 2

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->getUncaughtExceptionHandler()Ljava/lang/Thread$UncaughtExceptionHandler;

    move-result-object v1

    invoke-interface {v1, v0, p0}, Ljava/lang/Thread$UncaughtExceptionHandler;->uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V

    return-void
.end method

.method static a(Lkg/b;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    :try_start_0
    invoke-interface {p0, p1, p2}, Lkg/b;->apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p0

    :catchall_0
    move-exception p0

    invoke-static {p0}, Lzg/h;->h(Ljava/lang/Throwable;)Ljava/lang/RuntimeException;

    move-result-object p0

    throw p0
.end method

.method static b(Lkg/n;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    :try_start_0
    invoke-interface {p0, p1}, Lkg/n;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p0

    :catchall_0
    move-exception p0

    invoke-static {p0}, Lzg/h;->h(Ljava/lang/Throwable;)Ljava/lang/RuntimeException;

    move-result-object p0

    throw p0
.end method

.method static c(Lkg/n;Lkg/q;)Lgg/y;
    .locals 0

    invoke-static {p0, p1}, LEg/a;->b(Lkg/n;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    const-string p1, "Scheduler Supplier result can\'t be null"

    invoke-static {p0, p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    check-cast p0, Lgg/y;

    return-object p0
.end method

.method static d(Lkg/q;)Lgg/y;
    .locals 1

    :try_start_0
    invoke-interface {p0}, Lkg/q;->get()Ljava/lang/Object;

    move-result-object p0

    const-string v0, "Scheduler Supplier result can\'t be null"

    invoke-static {p0, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    check-cast p0, Lgg/y;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p0

    :catchall_0
    move-exception p0

    invoke-static {p0}, Lzg/h;->h(Ljava/lang/Throwable;)Ljava/lang/RuntimeException;

    move-result-object p0

    throw p0
.end method

.method public static e(Ljava/util/concurrent/Executor;ZZ)Lgg/y;
    .locals 1

    new-instance v0, Lwg/d;

    invoke-direct {v0, p0, p1, p2}, Lwg/d;-><init>(Ljava/util/concurrent/Executor;ZZ)V

    return-object v0
.end method

.method public static f(Ljava/util/concurrent/ThreadFactory;)Lgg/y;
    .locals 2

    new-instance v0, Lwg/o;

    const-string v1, "threadFactory is null"

    invoke-static {p0, v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    check-cast p0, Ljava/util/concurrent/ThreadFactory;

    invoke-direct {v0, p0}, Lwg/o;-><init>(Ljava/util/concurrent/ThreadFactory;)V

    return-object v0
.end method

.method public static g(Lkg/q;)Lgg/y;
    .locals 1

    const-string v0, "Scheduler Supplier can\'t be null"

    invoke-static {p0, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    sget-object v0, LEg/a;->c:Lkg/n;

    if-nez v0, :cond_0

    invoke-static {p0}, LEg/a;->d(Lkg/q;)Lgg/y;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-static {v0, p0}, LEg/a;->c(Lkg/n;Lkg/q;)Lgg/y;

    move-result-object p0

    return-object p0
.end method

.method public static h(Lkg/q;)Lgg/y;
    .locals 1

    const-string v0, "Scheduler Supplier can\'t be null"

    invoke-static {p0, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    sget-object v0, LEg/a;->e:Lkg/n;

    if-nez v0, :cond_0

    invoke-static {p0}, LEg/a;->d(Lkg/q;)Lgg/y;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-static {v0, p0}, LEg/a;->c(Lkg/n;Lkg/q;)Lgg/y;

    move-result-object p0

    return-object p0
.end method

.method public static i(Lkg/q;)Lgg/y;
    .locals 1

    const-string v0, "Scheduler Supplier can\'t be null"

    invoke-static {p0, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    sget-object v0, LEg/a;->f:Lkg/n;

    if-nez v0, :cond_0

    invoke-static {p0}, LEg/a;->d(Lkg/q;)Lgg/y;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-static {v0, p0}, LEg/a;->c(Lkg/n;Lkg/q;)Lgg/y;

    move-result-object p0

    return-object p0
.end method

.method public static j(Lkg/q;)Lgg/y;
    .locals 1

    const-string v0, "Scheduler Supplier can\'t be null"

    invoke-static {p0, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    sget-object v0, LEg/a;->d:Lkg/n;

    if-nez v0, :cond_0

    invoke-static {p0}, LEg/a;->d(Lkg/q;)Lgg/y;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-static {v0, p0}, LEg/a;->c(Lkg/n;Lkg/q;)Lgg/y;

    move-result-object p0

    return-object p0
.end method

.method static k(Ljava/lang/Throwable;)Z
    .locals 2

    instance-of v0, p0, Lio/reactivex/rxjava3/exceptions/OnErrorNotImplementedException;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    instance-of v0, p0, Lio/reactivex/rxjava3/exceptions/MissingBackpressureException;

    if-eqz v0, :cond_1

    return v1

    :cond_1
    instance-of v0, p0, Lio/reactivex/rxjava3/exceptions/QueueOverflowException;

    if-eqz v0, :cond_2

    return v1

    :cond_2
    instance-of v0, p0, Ljava/lang/IllegalStateException;

    if-eqz v0, :cond_3

    return v1

    :cond_3
    instance-of v0, p0, Ljava/lang/NullPointerException;

    if-eqz v0, :cond_4

    return v1

    :cond_4
    instance-of v0, p0, Ljava/lang/IllegalArgumentException;

    if-eqz v0, :cond_5

    return v1

    :cond_5
    instance-of p0, p0, Lio/reactivex/rxjava3/exceptions/CompositeException;

    if-eqz p0, :cond_6

    return v1

    :cond_6
    const/4 p0, 0x0

    return p0
.end method

.method public static l()Z
    .locals 1

    sget-boolean v0, LEg/a;->x:Z

    return v0
.end method

.method public static m(LBg/a;)LBg/a;
    .locals 1

    sget-object v0, LEg/a;->m:Lkg/n;

    if-eqz v0, :cond_0

    invoke-static {v0, p0}, LEg/a;->b(Lkg/n;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LBg/a;

    :cond_0
    return-object p0
.end method

.method public static n(Lgg/b;)Lgg/b;
    .locals 1

    sget-object v0, LEg/a;->p:Lkg/n;

    if-eqz v0, :cond_0

    invoke-static {v0, p0}, LEg/a;->b(Lkg/n;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lgg/b;

    :cond_0
    return-object p0
.end method

.method public static o(Lgg/i;)Lgg/i;
    .locals 1

    sget-object v0, LEg/a;->j:Lkg/n;

    if-eqz v0, :cond_0

    invoke-static {v0, p0}, LEg/a;->b(Lkg/n;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lgg/i;

    :cond_0
    return-object p0
.end method

.method public static p(Lgg/n;)Lgg/n;
    .locals 1

    sget-object v0, LEg/a;->n:Lkg/n;

    if-eqz v0, :cond_0

    invoke-static {v0, p0}, LEg/a;->b(Lkg/n;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lgg/n;

    :cond_0
    return-object p0
.end method

.method public static q(Lgg/s;)Lgg/s;
    .locals 1

    sget-object v0, LEg/a;->l:Lkg/n;

    if-eqz v0, :cond_0

    invoke-static {v0, p0}, LEg/a;->b(Lkg/n;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lgg/s;

    :cond_0
    return-object p0
.end method

.method public static r(Lgg/z;)Lgg/z;
    .locals 1

    sget-object v0, LEg/a;->o:Lkg/n;

    if-eqz v0, :cond_0

    invoke-static {v0, p0}, LEg/a;->b(Lkg/n;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lgg/z;

    :cond_0
    return-object p0
.end method

.method public static s(Ljg/a;)Ljg/a;
    .locals 1

    sget-object v0, LEg/a;->k:Lkg/n;

    if-eqz v0, :cond_0

    invoke-static {v0, p0}, LEg/a;->b(Lkg/n;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljg/a;

    :cond_0
    return-object p0
.end method

.method public static t()Z
    .locals 1

    sget-object v0, LEg/a;->v:Lkg/d;

    if-eqz v0, :cond_0

    :try_start_0
    invoke-interface {v0}, Lkg/d;->a()Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return v0

    :catchall_0
    move-exception v0

    invoke-static {v0}, Lzg/h;->h(Ljava/lang/Throwable;)Ljava/lang/RuntimeException;

    move-result-object v0

    throw v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public static u(Lgg/y;)Lgg/y;
    .locals 1

    sget-object v0, LEg/a;->g:Lkg/n;

    if-nez v0, :cond_0

    return-object p0

    :cond_0
    invoke-static {v0, p0}, LEg/a;->b(Lkg/n;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lgg/y;

    return-object p0
.end method

.method public static v(Ljava/lang/Throwable;)V
    .locals 2

    sget-object v0, LEg/a;->a:Lkg/f;

    if-nez p0, :cond_0

    const-string p0, "onError called with a null Throwable."

    invoke-static {p0}, Lzg/h;->b(Ljava/lang/String;)Ljava/lang/NullPointerException;

    move-result-object p0

    goto :goto_0

    :cond_0
    invoke-static {p0}, LEg/a;->k(Ljava/lang/Throwable;)Z

    move-result v1

    if-nez v1, :cond_1

    new-instance v1, Lio/reactivex/rxjava3/exceptions/UndeliverableException;

    invoke-direct {v1, p0}, Lio/reactivex/rxjava3/exceptions/UndeliverableException;-><init>(Ljava/lang/Throwable;)V

    move-object p0, v1

    :cond_1
    :goto_0
    if-eqz v0, :cond_2

    :try_start_0
    invoke-interface {v0, p0}, Lkg/f;->accept(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    invoke-static {v0}, LEg/a;->F(Ljava/lang/Throwable;)V

    :cond_2
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    invoke-static {p0}, LEg/a;->F(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static w(Lgg/y;)Lgg/y;
    .locals 1

    sget-object v0, LEg/a;->i:Lkg/n;

    if-nez v0, :cond_0

    return-object p0

    :cond_0
    invoke-static {v0, p0}, LEg/a;->b(Lkg/n;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lgg/y;

    return-object p0
.end method

.method public static x(Ljava/lang/Runnable;)Ljava/lang/Runnable;
    .locals 1

    const-string v0, "run is null"

    invoke-static {p0, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    sget-object v0, LEg/a;->b:Lkg/n;

    if-nez v0, :cond_0

    return-object p0

    :cond_0
    invoke-static {v0, p0}, LEg/a;->b(Lkg/n;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Runnable;

    return-object p0
.end method

.method public static y(Lgg/y;)Lgg/y;
    .locals 1

    sget-object v0, LEg/a;->h:Lkg/n;

    if-nez v0, :cond_0

    return-object p0

    :cond_0
    invoke-static {v0, p0}, LEg/a;->b(Lkg/n;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lgg/y;

    return-object p0
.end method

.method public static z(Lgg/i;LDj/b;)LDj/b;
    .locals 1

    sget-object v0, LEg/a;->q:Lkg/b;

    if-eqz v0, :cond_0

    invoke-static {v0, p0, p1}, LEg/a;->a(Lkg/b;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LDj/b;

    return-object p0

    :cond_0
    return-object p1
.end method
