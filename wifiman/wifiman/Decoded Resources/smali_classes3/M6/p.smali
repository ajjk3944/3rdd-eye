.class public abstract LM6/p;
.super LI6/j;
.source "SourceFile"


# instance fields
.field final a:LP6/G;


# direct methods
.method constructor <init>(LP6/G;)V
    .locals 0

    invoke-direct {p0}, LI6/j;-><init>()V

    iput-object p1, p0, LM6/p;->a:LP6/G;

    return-void
.end method


# virtual methods
.method protected final b(Lgg/t;LO6/i;)V
    .locals 4

    invoke-virtual {p0, p1}, LM6/p;->d(Lgg/t;)Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    :try_start_0
    new-instance v2, LM6/p$a;

    invoke-direct {v2, p0, v0}, LM6/p$a;-><init>(LM6/p;Ljava/lang/Object;)V

    invoke-interface {p1, v2}, Lgg/t;->d(Lkg/e;)V

    const-string/jumbo v2, "Scan operation is requested to start."

    new-array v3, v1, [Ljava/lang/Object;

    invoke-static {v2, v3}, LI6/q;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v2, p0, LM6/p;->a:LP6/G;

    invoke-virtual {p0, v2, v0}, LM6/p;->g(LP6/G;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Lcom/polidea/rxandroidble3/exceptions/BleScanException;

    invoke-direct {v0, v1}, Lcom/polidea/rxandroidble3/exceptions/BleScanException;-><init>(I)V

    invoke-interface {p1, v0}, Lgg/t;->c(Ljava/lang/Throwable;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    invoke-interface {p2}, LO6/i;->release()V

    goto :goto_2

    :goto_1
    :try_start_1
    const-string/jumbo v2, "Error while calling the start scan function"

    new-array v3, v1, [Ljava/lang/Object;

    invoke-static {v0, v2, v3}, LI6/q;->r(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    new-instance v2, Lcom/polidea/rxandroidble3/exceptions/BleScanException;

    invoke-direct {v2, v1, v0}, Lcom/polidea/rxandroidble3/exceptions/BleScanException;-><init>(ILjava/lang/Throwable;)V

    invoke-interface {p1, v2}, Lgg/t;->c(Ljava/lang/Throwable;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :goto_2
    return-void

    :catchall_1
    move-exception p1

    invoke-interface {p2}, LO6/i;->release()V

    throw p1
.end method

.method protected c(Landroid/os/DeadObjectException;)Lcom/polidea/rxandroidble3/exceptions/BleException;
    .locals 2

    new-instance v0, Lcom/polidea/rxandroidble3/exceptions/BleScanException;

    const/4 v1, 0x1

    invoke-direct {v0, v1, p1}, Lcom/polidea/rxandroidble3/exceptions/BleScanException;-><init>(ILjava/lang/Throwable;)V

    return-object v0
.end method

.method abstract d(Lgg/t;)Ljava/lang/Object;
.end method

.method abstract g(LP6/G;Ljava/lang/Object;)Z
.end method

.method abstract h(LP6/G;Ljava/lang/Object;)V
.end method
