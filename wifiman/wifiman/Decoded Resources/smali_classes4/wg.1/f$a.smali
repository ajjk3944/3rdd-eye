.class final Lwg/f$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lwg/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation


# instance fields
.field private final a:J

.field private final b:Ljava/util/concurrent/ConcurrentLinkedQueue;

.field final c:Lhg/b;

.field private final d:Ljava/util/concurrent/ScheduledExecutorService;

.field private final e:Ljava/util/concurrent/Future;

.field private final f:Ljava/util/concurrent/ThreadFactory;


# direct methods
.method constructor <init>(JLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/ThreadFactory;)V
    .locals 7

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p3, :cond_0

    invoke-virtual {p3, p1, p2}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide p1

    :goto_0
    move-wide v4, p1

    goto :goto_1

    :cond_0
    const-wide/16 p1, 0x0

    goto :goto_0

    :goto_1
    iput-wide v4, p0, Lwg/f$a;->a:J

    new-instance p1, Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentLinkedQueue;-><init>()V

    iput-object p1, p0, Lwg/f$a;->b:Ljava/util/concurrent/ConcurrentLinkedQueue;

    new-instance p1, Lhg/b;

    invoke-direct {p1}, Lhg/b;-><init>()V

    iput-object p1, p0, Lwg/f$a;->c:Lhg/b;

    iput-object p4, p0, Lwg/f$a;->f:Ljava/util/concurrent/ThreadFactory;

    if-eqz p3, :cond_1

    const/4 p1, 0x1

    sget-object p2, Lwg/f;->f:Lwg/j;

    invoke-static {p1, p2}, Ljava/util/concurrent/Executors;->newScheduledThreadPool(ILjava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object p1

    sget-object v6, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    move-object v0, p1

    move-object v1, p0

    move-wide v2, v4

    invoke-interface/range {v0 .. v6}, Ljava/util/concurrent/ScheduledExecutorService;->scheduleWithFixedDelay(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object p2

    goto :goto_2

    :cond_1
    const/4 p1, 0x0

    move-object p2, p1

    :goto_2
    iput-object p1, p0, Lwg/f$a;->d:Ljava/util/concurrent/ScheduledExecutorService;

    iput-object p2, p0, Lwg/f$a;->e:Ljava/util/concurrent/Future;

    return-void
.end method

.method static a(Ljava/util/concurrent/ConcurrentLinkedQueue;Lhg/b;)V
    .locals 6

    invoke-virtual {p0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {}, Lwg/f$a;->c()J

    move-result-wide v0

    invoke-virtual {p0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lwg/f$c;

    invoke-virtual {v3}, Lwg/f$c;->i()J

    move-result-wide v4

    cmp-long v4, v4, v0

    if-gtz v4, :cond_1

    invoke-virtual {p0, v3}, Ljava/util/concurrent/ConcurrentLinkedQueue;->remove(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-virtual {p1, v3}, Lhg/b;->b(Lhg/c;)Z

    goto :goto_0

    :cond_1
    return-void
.end method

.method static c()J
    .locals 2

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    return-wide v0
.end method


# virtual methods
.method b()Lwg/f$c;
    .locals 2

    iget-object v0, p0, Lwg/f$a;->c:Lhg/b;

    invoke-virtual {v0}, Lhg/b;->isDisposed()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lwg/f;->i:Lwg/f$c;

    return-object v0

    :cond_0
    iget-object v0, p0, Lwg/f$a;->b:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lwg/f$a;->b:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->poll()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwg/f$c;

    if-eqz v0, :cond_0

    return-object v0

    :cond_1
    new-instance v0, Lwg/f$c;

    iget-object v1, p0, Lwg/f$a;->f:Ljava/util/concurrent/ThreadFactory;

    invoke-direct {v0, v1}, Lwg/f$c;-><init>(Ljava/util/concurrent/ThreadFactory;)V

    iget-object v1, p0, Lwg/f$a;->c:Lhg/b;

    invoke-virtual {v1, v0}, Lhg/b;->a(Lhg/c;)Z

    return-object v0
.end method

.method d(Lwg/f$c;)V
    .locals 4

    invoke-static {}, Lwg/f$a;->c()J

    move-result-wide v0

    iget-wide v2, p0, Lwg/f$a;->a:J

    add-long/2addr v0, v2

    invoke-virtual {p1, v0, v1}, Lwg/f$c;->j(J)V

    iget-object v0, p0, Lwg/f$a;->b:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->offer(Ljava/lang/Object;)Z

    return-void
.end method

.method e()V
    .locals 2

    iget-object v0, p0, Lwg/f$a;->c:Lhg/b;

    invoke-virtual {v0}, Lhg/b;->dispose()V

    iget-object v0, p0, Lwg/f$a;->e:Ljava/util/concurrent/Future;

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Ljava/util/concurrent/Future;->cancel(Z)Z

    :cond_0
    iget-object v0, p0, Lwg/f$a;->d:Ljava/util/concurrent/ScheduledExecutorService;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdownNow()Ljava/util/List;

    :cond_1
    return-void
.end method

.method public run()V
    .locals 2

    iget-object v0, p0, Lwg/f$a;->b:Ljava/util/concurrent/ConcurrentLinkedQueue;

    iget-object v1, p0, Lwg/f$a;->c:Lhg/b;

    invoke-static {v0, v1}, Lwg/f$a;->a(Ljava/util/concurrent/ConcurrentLinkedQueue;Lhg/b;)V

    return-void
.end method
