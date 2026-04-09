.class final Lwg/o$a;
.super Lgg/y$c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lwg/o;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation


# instance fields
.field final a:Ljava/util/concurrent/ScheduledExecutorService;

.field final b:Lhg/b;

.field volatile c:Z


# direct methods
.method constructor <init>(Ljava/util/concurrent/ScheduledExecutorService;)V
    .locals 0

    invoke-direct {p0}, Lgg/y$c;-><init>()V

    iput-object p1, p0, Lwg/o$a;->a:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance p1, Lhg/b;

    invoke-direct {p1}, Lhg/b;-><init>()V

    iput-object p1, p0, Lwg/o$a;->b:Lhg/b;

    return-void
.end method


# virtual methods
.method public c(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Lhg/c;
    .locals 3

    iget-boolean v0, p0, Lwg/o$a;->c:Z

    if-eqz v0, :cond_0

    sget-object p1, Llg/c;->INSTANCE:Llg/c;

    return-object p1

    :cond_0
    invoke-static {p1}, LEg/a;->x(Ljava/lang/Runnable;)Ljava/lang/Runnable;

    move-result-object p1

    new-instance v0, Lwg/m;

    iget-object v1, p0, Lwg/o$a;->b:Lhg/b;

    invoke-direct {v0, p1, v1}, Lwg/m;-><init>(Ljava/lang/Runnable;Lhg/d;)V

    iget-object p1, p0, Lwg/o$a;->b:Lhg/b;

    invoke-virtual {p1, v0}, Lhg/b;->a(Lhg/c;)Z

    const-wide/16 v1, 0x0

    cmp-long p1, p2, v1

    if-gtz p1, :cond_1

    :try_start_0
    iget-object p1, p0, Lwg/o$a;->a:Ljava/util/concurrent/ScheduledExecutorService;

    invoke-interface {p1, v0}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object p1

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_1

    :cond_1
    iget-object p1, p0, Lwg/o$a;->a:Ljava/util/concurrent/ScheduledExecutorService;

    invoke-interface {p1, v0, p2, p3, p4}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/util/concurrent/Callable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object p1

    :goto_0
    invoke-virtual {v0, p1}, Lwg/m;->a(Ljava/util/concurrent/Future;)V
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :goto_1
    invoke-virtual {p0}, Lwg/o$a;->dispose()V

    invoke-static {p1}, LEg/a;->v(Ljava/lang/Throwable;)V

    sget-object p1, Llg/c;->INSTANCE:Llg/c;

    return-object p1
.end method

.method public dispose()V
    .locals 1

    iget-boolean v0, p0, Lwg/o$a;->c:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lwg/o$a;->c:Z

    iget-object v0, p0, Lwg/o$a;->b:Lhg/b;

    invoke-virtual {v0}, Lhg/b;->dispose()V

    :cond_0
    return-void
.end method

.method public isDisposed()Z
    .locals 1

    iget-boolean v0, p0, Lwg/o$a;->c:Z

    return v0
.end method
