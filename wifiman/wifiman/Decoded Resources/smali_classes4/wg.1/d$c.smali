.class public final Lwg/d$c;
.super Lgg/y$c;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lwg/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lwg/d$c$b;,
        Lwg/d$c$c;,
        Lwg/d$c$a;
    }
.end annotation


# instance fields
.field final a:Z

.field final b:Z

.field final c:Ljava/util/concurrent/Executor;

.field final d:Lvg/a;

.field volatile e:Z

.field final f:Ljava/util/concurrent/atomic/AtomicInteger;

.field final g:Lhg/b;


# direct methods
.method public constructor <init>(Ljava/util/concurrent/Executor;ZZ)V
    .locals 1

    invoke-direct {p0}, Lgg/y$c;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object v0, p0, Lwg/d$c;->f:Ljava/util/concurrent/atomic/AtomicInteger;

    new-instance v0, Lhg/b;

    invoke-direct {v0}, Lhg/b;-><init>()V

    iput-object v0, p0, Lwg/d$c;->g:Lhg/b;

    iput-object p1, p0, Lwg/d$c;->c:Ljava/util/concurrent/Executor;

    new-instance p1, Lvg/a;

    invoke-direct {p1}, Lvg/a;-><init>()V

    iput-object p1, p0, Lwg/d$c;->d:Lvg/a;

    iput-boolean p2, p0, Lwg/d$c;->a:Z

    iput-boolean p3, p0, Lwg/d$c;->b:Z

    return-void
.end method


# virtual methods
.method public b(Ljava/lang/Runnable;)Lhg/c;
    .locals 2

    iget-boolean v0, p0, Lwg/d$c;->e:Z

    if-eqz v0, :cond_0

    sget-object p1, Llg/c;->INSTANCE:Llg/c;

    return-object p1

    :cond_0
    invoke-static {p1}, LEg/a;->x(Ljava/lang/Runnable;)Ljava/lang/Runnable;

    move-result-object p1

    iget-boolean v0, p0, Lwg/d$c;->a:Z

    if-eqz v0, :cond_1

    new-instance v0, Lwg/d$c$b;

    iget-object v1, p0, Lwg/d$c;->g:Lhg/b;

    invoke-direct {v0, p1, v1}, Lwg/d$c$b;-><init>(Ljava/lang/Runnable;Lhg/d;)V

    iget-object p1, p0, Lwg/d$c;->g:Lhg/b;

    invoke-virtual {p1, v0}, Lhg/b;->a(Lhg/c;)Z

    goto :goto_0

    :cond_1
    new-instance v0, Lwg/d$c$a;

    invoke-direct {v0, p1}, Lwg/d$c$a;-><init>(Ljava/lang/Runnable;)V

    :goto_0
    iget-object p1, p0, Lwg/d$c;->d:Lvg/a;

    invoke-virtual {p1, v0}, Lvg/a;->offer(Ljava/lang/Object;)Z

    iget-object p1, p0, Lwg/d$c;->f:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result p1

    if-nez p1, :cond_2

    :try_start_0
    iget-object p1, p0, Lwg/d$c;->c:Ljava/util/concurrent/Executor;

    invoke-interface {p1, p0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lwg/d$c;->e:Z

    iget-object v0, p0, Lwg/d$c;->d:Lvg/a;

    invoke-virtual {v0}, Lvg/a;->clear()V

    invoke-static {p1}, LEg/a;->v(Ljava/lang/Throwable;)V

    sget-object p1, Llg/c;->INSTANCE:Llg/c;

    return-object p1

    :cond_2
    :goto_1
    return-object v0
.end method

.method public c(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Lhg/c;
    .locals 5

    const-wide/16 v0, 0x0

    cmp-long v0, p2, v0

    if-gtz v0, :cond_0

    invoke-virtual {p0, p1}, Lwg/d$c;->b(Ljava/lang/Runnable;)Lhg/c;

    move-result-object p1

    return-object p1

    :cond_0
    iget-boolean v0, p0, Lwg/d$c;->e:Z

    if-eqz v0, :cond_1

    sget-object p1, Llg/c;->INSTANCE:Llg/c;

    return-object p1

    :cond_1
    new-instance v0, Llg/e;

    invoke-direct {v0}, Llg/e;-><init>()V

    new-instance v1, Llg/e;

    invoke-direct {v1, v0}, Llg/e;-><init>(Lhg/c;)V

    invoke-static {p1}, LEg/a;->x(Ljava/lang/Runnable;)Ljava/lang/Runnable;

    move-result-object p1

    new-instance v2, Lwg/m;

    new-instance v3, Lwg/d$c$c;

    invoke-direct {v3, p0, v1, p1}, Lwg/d$c$c;-><init>(Lwg/d$c;Llg/e;Ljava/lang/Runnable;)V

    iget-object p1, p0, Lwg/d$c;->g:Lhg/b;

    iget-boolean v4, p0, Lwg/d$c;->a:Z

    invoke-direct {v2, v3, p1, v4}, Lwg/m;-><init>(Ljava/lang/Runnable;Lhg/d;Z)V

    iget-object p1, p0, Lwg/d$c;->g:Lhg/b;

    invoke-virtual {p1, v2}, Lhg/b;->a(Lhg/c;)Z

    iget-object p1, p0, Lwg/d$c;->c:Ljava/util/concurrent/Executor;

    instance-of v3, p1, Ljava/util/concurrent/ScheduledExecutorService;

    if-eqz v3, :cond_2

    :try_start_0
    check-cast p1, Ljava/util/concurrent/ScheduledExecutorService;

    invoke-interface {p1, v2, p2, p3, p4}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/util/concurrent/Callable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object p1

    invoke-virtual {v2, p1}, Lwg/m;->a(Ljava/util/concurrent/Future;)V
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const/4 p2, 0x1

    iput-boolean p2, p0, Lwg/d$c;->e:Z

    invoke-static {p1}, LEg/a;->v(Ljava/lang/Throwable;)V

    sget-object p1, Llg/c;->INSTANCE:Llg/c;

    return-object p1

    :cond_2
    sget-object p1, Lwg/d$d;->a:Lgg/y;

    invoke-virtual {p1, v2, p2, p3, p4}, Lgg/y;->f(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Lhg/c;

    move-result-object p1

    new-instance p2, Lwg/c;

    invoke-direct {p2, p1}, Lwg/c;-><init>(Lhg/c;)V

    invoke-virtual {v2, p2}, Lwg/m;->a(Ljava/util/concurrent/Future;)V

    :goto_0
    invoke-virtual {v0, v2}, Llg/e;->a(Lhg/c;)Z

    return-object v1
.end method

.method public dispose()V
    .locals 1

    iget-boolean v0, p0, Lwg/d$c;->e:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lwg/d$c;->e:Z

    iget-object v0, p0, Lwg/d$c;->g:Lhg/b;

    invoke-virtual {v0}, Lhg/b;->dispose()V

    iget-object v0, p0, Lwg/d$c;->f:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lwg/d$c;->d:Lvg/a;

    invoke-virtual {v0}, Lvg/a;->clear()V

    :cond_0
    return-void
.end method

.method e()V
    .locals 3

    iget-object v0, p0, Lwg/d$c;->d:Lvg/a;

    const/4 v1, 0x1

    :cond_0
    iget-boolean v2, p0, Lwg/d$c;->e:Z

    if-eqz v2, :cond_1

    invoke-virtual {v0}, Lvg/a;->clear()V

    return-void

    :cond_1
    invoke-virtual {v0}, Lvg/a;->poll()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Runnable;

    if-nez v2, :cond_3

    iget-boolean v2, p0, Lwg/d$c;->e:Z

    if-eqz v2, :cond_2

    invoke-virtual {v0}, Lvg/a;->clear()V

    return-void

    :cond_2
    iget-object v2, p0, Lwg/d$c;->f:Ljava/util/concurrent/atomic/AtomicInteger;

    neg-int v1, v1

    invoke-virtual {v2, v1}, Ljava/util/concurrent/atomic/AtomicInteger;->addAndGet(I)I

    move-result v1

    if-nez v1, :cond_0

    return-void

    :cond_3
    invoke-interface {v2}, Ljava/lang/Runnable;->run()V

    iget-boolean v2, p0, Lwg/d$c;->e:Z

    if-eqz v2, :cond_1

    invoke-virtual {v0}, Lvg/a;->clear()V

    return-void
.end method

.method f()V
    .locals 2

    iget-object v0, p0, Lwg/d$c;->d:Lvg/a;

    iget-boolean v1, p0, Lwg/d$c;->e:Z

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lvg/a;->clear()V

    return-void

    :cond_0
    invoke-virtual {v0}, Lvg/a;->poll()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Runnable;

    invoke-interface {v1}, Ljava/lang/Runnable;->run()V

    iget-boolean v1, p0, Lwg/d$c;->e:Z

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Lvg/a;->clear()V

    return-void

    :cond_1
    iget-object v0, p0, Lwg/d$c;->f:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lwg/d$c;->c:Ljava/util/concurrent/Executor;

    invoke-interface {v0, p0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    :cond_2
    return-void
.end method

.method public isDisposed()Z
    .locals 1

    iget-boolean v0, p0, Lwg/d$c;->e:Z

    return v0
.end method

.method public run()V
    .locals 1

    iget-boolean v0, p0, Lwg/d$c;->b:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lwg/d$c;->f()V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lwg/d$c;->e()V

    :goto_0
    return-void
.end method
