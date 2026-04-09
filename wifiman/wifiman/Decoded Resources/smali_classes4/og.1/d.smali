.class public final Log/d;
.super Ljava/util/concurrent/CountDownLatch;
.source "SourceFile"

# interfaces
.implements Lgg/B;
.implements Lgg/d;
.implements Lgg/p;


# instance fields
.field a:Ljava/lang/Object;

.field b:Ljava/lang/Throwable;

.field c:Lhg/c;

.field volatile d:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    invoke-virtual {p0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    return-void
.end method

.method public b()Ljava/lang/Object;
    .locals 4

    invoke-virtual {p0}, Ljava/util/concurrent/CountDownLatch;->getCount()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    :try_start_0
    invoke-static {}, Lzg/e;->a()V

    invoke-virtual {p0}, Ljava/util/concurrent/CountDownLatch;->await()V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-virtual {p0}, Log/d;->d()V

    invoke-static {v0}, Lzg/h;->h(Ljava/lang/Throwable;)Ljava/lang/RuntimeException;

    move-result-object v0

    throw v0

    :cond_0
    :goto_0
    iget-object v0, p0, Log/d;->b:Ljava/lang/Throwable;

    if-nez v0, :cond_1

    iget-object v0, p0, Log/d;->a:Ljava/lang/Object;

    return-object v0

    :cond_1
    invoke-static {v0}, Lzg/h;->h(Ljava/lang/Throwable;)Ljava/lang/RuntimeException;

    move-result-object v0

    throw v0
.end method

.method public c(Lhg/c;)V
    .locals 1

    iput-object p1, p0, Log/d;->c:Lhg/c;

    iget-boolean v0, p0, Log/d;->d:Z

    if-eqz v0, :cond_0

    invoke-interface {p1}, Lhg/c;->dispose()V

    :cond_0
    return-void
.end method

.method d()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Log/d;->d:Z

    iget-object v0, p0, Log/d;->c:Lhg/c;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lhg/c;->dispose()V

    :cond_0
    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 0

    iput-object p1, p0, Log/d;->b:Ljava/lang/Throwable;

    invoke-virtual {p0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    return-void
.end method

.method public onSuccess(Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, Log/d;->a:Ljava/lang/Object;

    invoke-virtual {p0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    return-void
.end method
