.class public final Lwg/d;
.super Lgg/y;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lwg/d$a;,
        Lwg/d$b;,
        Lwg/d$c;,
        Lwg/d$d;
    }
.end annotation


# instance fields
.field final c:Z

.field final d:Z

.field final e:Ljava/util/concurrent/Executor;


# direct methods
.method public constructor <init>(Ljava/util/concurrent/Executor;ZZ)V
    .locals 0

    invoke-direct {p0}, Lgg/y;-><init>()V

    iput-object p1, p0, Lwg/d;->e:Ljava/util/concurrent/Executor;

    iput-boolean p2, p0, Lwg/d;->c:Z

    iput-boolean p3, p0, Lwg/d;->d:Z

    return-void
.end method


# virtual methods
.method public c()Lgg/y$c;
    .locals 4

    new-instance v0, Lwg/d$c;

    iget-object v1, p0, Lwg/d;->e:Ljava/util/concurrent/Executor;

    iget-boolean v2, p0, Lwg/d;->c:Z

    iget-boolean v3, p0, Lwg/d;->d:Z

    invoke-direct {v0, v1, v2, v3}, Lwg/d$c;-><init>(Ljava/util/concurrent/Executor;ZZ)V

    return-object v0
.end method

.method public e(Ljava/lang/Runnable;)Lhg/c;
    .locals 2

    invoke-static {p1}, LEg/a;->x(Ljava/lang/Runnable;)Ljava/lang/Runnable;

    move-result-object p1

    :try_start_0
    iget-object v0, p0, Lwg/d;->e:Ljava/util/concurrent/Executor;

    instance-of v0, v0, Ljava/util/concurrent/ExecutorService;

    if-eqz v0, :cond_0

    new-instance v0, Lwg/l;

    iget-boolean v1, p0, Lwg/d;->c:Z

    invoke-direct {v0, p1, v1}, Lwg/l;-><init>(Ljava/lang/Runnable;Z)V

    iget-object p1, p0, Lwg/d;->e:Ljava/util/concurrent/Executor;

    check-cast p1, Ljava/util/concurrent/ExecutorService;

    invoke-interface {p1, v0}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object p1

    invoke-virtual {v0, p1}, Lwg/a;->c(Ljava/util/concurrent/Future;)V

    return-object v0

    :catch_0
    move-exception p1

    goto :goto_0

    :cond_0
    iget-boolean v0, p0, Lwg/d;->c:Z

    if-eqz v0, :cond_1

    new-instance v0, Lwg/d$c$b;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lwg/d$c$b;-><init>(Ljava/lang/Runnable;Lhg/d;)V

    iget-object p1, p0, Lwg/d;->e:Ljava/util/concurrent/Executor;

    invoke-interface {p1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-object v0

    :cond_1
    new-instance v0, Lwg/d$c$a;

    invoke-direct {v0, p1}, Lwg/d$c$a;-><init>(Ljava/lang/Runnable;)V

    iget-object p1, p0, Lwg/d;->e:Ljava/util/concurrent/Executor;

    invoke-interface {p1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :goto_0
    invoke-static {p1}, LEg/a;->v(Ljava/lang/Throwable;)V

    sget-object p1, Llg/c;->INSTANCE:Llg/c;

    return-object p1
.end method

.method public f(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Lhg/c;
    .locals 2

    invoke-static {p1}, LEg/a;->x(Ljava/lang/Runnable;)Ljava/lang/Runnable;

    move-result-object p1

    iget-object v0, p0, Lwg/d;->e:Ljava/util/concurrent/Executor;

    instance-of v0, v0, Ljava/util/concurrent/ScheduledExecutorService;

    if-eqz v0, :cond_0

    :try_start_0
    new-instance v0, Lwg/l;

    iget-boolean v1, p0, Lwg/d;->c:Z

    invoke-direct {v0, p1, v1}, Lwg/l;-><init>(Ljava/lang/Runnable;Z)V

    iget-object p1, p0, Lwg/d;->e:Ljava/util/concurrent/Executor;

    check-cast p1, Ljava/util/concurrent/ScheduledExecutorService;

    invoke-interface {p1, v0, p2, p3, p4}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/util/concurrent/Callable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object p1

    invoke-virtual {v0, p1}, Lwg/a;->c(Ljava/util/concurrent/Future;)V
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p1

    invoke-static {p1}, LEg/a;->v(Ljava/lang/Throwable;)V

    sget-object p1, Llg/c;->INSTANCE:Llg/c;

    return-object p1

    :cond_0
    new-instance v0, Lwg/d$b;

    invoke-direct {v0, p1}, Lwg/d$b;-><init>(Ljava/lang/Runnable;)V

    sget-object p1, Lwg/d$d;->a:Lgg/y;

    new-instance v1, Lwg/d$a;

    invoke-direct {v1, p0, v0}, Lwg/d$a;-><init>(Lwg/d;Lwg/d$b;)V

    invoke-virtual {p1, v1, p2, p3, p4}, Lgg/y;->f(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Lhg/c;

    move-result-object p1

    iget-object p2, v0, Lwg/d$b;->a:Llg/e;

    invoke-virtual {p2, p1}, Llg/e;->a(Lhg/c;)Z

    return-object v0
.end method

.method public g(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Lhg/c;
    .locals 8

    iget-object v0, p0, Lwg/d;->e:Ljava/util/concurrent/Executor;

    instance-of v0, v0, Ljava/util/concurrent/ScheduledExecutorService;

    if-eqz v0, :cond_0

    invoke-static {p1}, LEg/a;->x(Ljava/lang/Runnable;)Ljava/lang/Runnable;

    move-result-object p1

    :try_start_0
    new-instance v7, Lwg/k;

    iget-boolean v0, p0, Lwg/d;->c:Z

    invoke-direct {v7, p1, v0}, Lwg/k;-><init>(Ljava/lang/Runnable;Z)V

    iget-object p1, p0, Lwg/d;->e:Ljava/util/concurrent/Executor;

    move-object v0, p1

    check-cast v0, Ljava/util/concurrent/ScheduledExecutorService;

    move-object v1, v7

    move-wide v2, p2

    move-wide v4, p4

    move-object v6, p6

    invoke-interface/range {v0 .. v6}, Ljava/util/concurrent/ScheduledExecutorService;->scheduleAtFixedRate(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object p1

    invoke-virtual {v7, p1}, Lwg/a;->c(Ljava/util/concurrent/Future;)V
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v7

    :catch_0
    move-exception p1

    invoke-static {p1}, LEg/a;->v(Ljava/lang/Throwable;)V

    sget-object p1, Llg/c;->INSTANCE:Llg/c;

    return-object p1

    :cond_0
    invoke-super/range {p0 .. p6}, Lgg/y;->g(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Lhg/c;

    move-result-object p1

    return-object p1
.end method
