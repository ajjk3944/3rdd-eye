.class final Lcom/google/android/play/integrity/internal/K;
.super Lcom/google/android/play/integrity/internal/G;
.source "SourceFile"


# instance fields
.field final synthetic g:Lcom/google/android/play/integrity/internal/f;


# direct methods
.method constructor <init>(Lcom/google/android/play/integrity/internal/f;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/play/integrity/internal/K;->g:Lcom/google/android/play/integrity/internal/f;

    invoke-direct {p0}, Lcom/google/android/play/integrity/internal/G;-><init>()V

    return-void
.end method


# virtual methods
.method public final b()V
    .locals 5

    iget-object v0, p0, Lcom/google/android/play/integrity/internal/K;->g:Lcom/google/android/play/integrity/internal/f;

    invoke-static {v0}, Lcom/google/android/play/integrity/internal/f;->h(Lcom/google/android/play/integrity/internal/f;)Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/play/integrity/internal/K;->g:Lcom/google/android/play/integrity/internal/f;

    invoke-static {v1}, Lcom/google/android/play/integrity/internal/f;->j(Lcom/google/android/play/integrity/internal/f;)Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v1

    const/4 v2, 0x0

    if-lez v1, :cond_0

    iget-object v1, p0, Lcom/google/android/play/integrity/internal/K;->g:Lcom/google/android/play/integrity/internal/f;

    invoke-static {v1}, Lcom/google/android/play/integrity/internal/f;->j(Lcom/google/android/play/integrity/internal/f;)Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    move-result v1

    if-lez v1, :cond_0

    iget-object v1, p0, Lcom/google/android/play/integrity/internal/K;->g:Lcom/google/android/play/integrity/internal/f;

    invoke-static {v1}, Lcom/google/android/play/integrity/internal/f;->f(Lcom/google/android/play/integrity/internal/f;)Lcom/google/android/play/integrity/internal/F;

    move-result-object v1

    const-string/jumbo v3, "Leaving the connection open for other ongoing calls."

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v1, v3, v2}, Lcom/google/android/play/integrity/internal/F;->d(Ljava/lang/String;[Ljava/lang/Object;)I

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/google/android/play/integrity/internal/K;->g:Lcom/google/android/play/integrity/internal/f;

    invoke-static {v1}, Lcom/google/android/play/integrity/internal/f;->d(Lcom/google/android/play/integrity/internal/f;)Landroid/os/IInterface;

    move-result-object v3

    if-eqz v3, :cond_1

    invoke-static {v1}, Lcom/google/android/play/integrity/internal/f;->f(Lcom/google/android/play/integrity/internal/f;)Lcom/google/android/play/integrity/internal/F;

    move-result-object v1

    const-string/jumbo v3, "Unbind from service."

    new-array v4, v2, [Ljava/lang/Object;

    invoke-virtual {v1, v3, v4}, Lcom/google/android/play/integrity/internal/F;->d(Ljava/lang/String;[Ljava/lang/Object;)I

    iget-object v1, p0, Lcom/google/android/play/integrity/internal/K;->g:Lcom/google/android/play/integrity/internal/f;

    invoke-static {v1}, Lcom/google/android/play/integrity/internal/f;->a(Lcom/google/android/play/integrity/internal/f;)Landroid/content/Context;

    move-result-object v3

    invoke-static {v1}, Lcom/google/android/play/integrity/internal/f;->b(Lcom/google/android/play/integrity/internal/f;)Landroid/content/ServiceConnection;

    move-result-object v1

    invoke-virtual {v3, v1}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V

    iget-object v1, p0, Lcom/google/android/play/integrity/internal/K;->g:Lcom/google/android/play/integrity/internal/f;

    invoke-static {v1, v2}, Lcom/google/android/play/integrity/internal/f;->m(Lcom/google/android/play/integrity/internal/f;Z)V

    iget-object v1, p0, Lcom/google/android/play/integrity/internal/K;->g:Lcom/google/android/play/integrity/internal/f;

    const/4 v2, 0x0

    invoke-static {v1, v2}, Lcom/google/android/play/integrity/internal/f;->n(Lcom/google/android/play/integrity/internal/f;Landroid/os/IInterface;)V

    iget-object v1, p0, Lcom/google/android/play/integrity/internal/K;->g:Lcom/google/android/play/integrity/internal/f;

    invoke-static {v1, v2}, Lcom/google/android/play/integrity/internal/f;->l(Lcom/google/android/play/integrity/internal/f;Landroid/content/ServiceConnection;)V

    :cond_1
    iget-object v1, p0, Lcom/google/android/play/integrity/internal/K;->g:Lcom/google/android/play/integrity/internal/f;

    invoke-static {v1}, Lcom/google/android/play/integrity/internal/f;->p(Lcom/google/android/play/integrity/internal/f;)V

    monitor-exit v0

    return-void

    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
