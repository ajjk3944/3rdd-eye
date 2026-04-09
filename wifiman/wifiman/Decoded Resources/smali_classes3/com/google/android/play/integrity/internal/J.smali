.class final Lcom/google/android/play/integrity/internal/J;
.super Lcom/google/android/play/integrity/internal/G;
.source "SourceFile"


# instance fields
.field final synthetic g:Lcom/google/android/gms/tasks/TaskCompletionSource;

.field final synthetic h:Lcom/google/android/play/integrity/internal/G;

.field final synthetic i:Lcom/google/android/play/integrity/internal/f;


# direct methods
.method constructor <init>(Lcom/google/android/play/integrity/internal/f;Lcom/google/android/gms/tasks/TaskCompletionSource;Lcom/google/android/gms/tasks/TaskCompletionSource;Lcom/google/android/play/integrity/internal/G;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/play/integrity/internal/J;->i:Lcom/google/android/play/integrity/internal/f;

    iput-object p3, p0, Lcom/google/android/play/integrity/internal/J;->g:Lcom/google/android/gms/tasks/TaskCompletionSource;

    iput-object p4, p0, Lcom/google/android/play/integrity/internal/J;->h:Lcom/google/android/play/integrity/internal/G;

    invoke-direct {p0, p2}, Lcom/google/android/play/integrity/internal/G;-><init>(Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    return-void
.end method


# virtual methods
.method public final b()V
    .locals 4

    iget-object v0, p0, Lcom/google/android/play/integrity/internal/J;->i:Lcom/google/android/play/integrity/internal/f;

    invoke-static {v0}, Lcom/google/android/play/integrity/internal/f;->h(Lcom/google/android/play/integrity/internal/f;)Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/play/integrity/internal/J;->i:Lcom/google/android/play/integrity/internal/f;

    iget-object v2, p0, Lcom/google/android/play/integrity/internal/J;->g:Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-static {v1, v2}, Lcom/google/android/play/integrity/internal/f;->o(Lcom/google/android/play/integrity/internal/f;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    iget-object v1, p0, Lcom/google/android/play/integrity/internal/J;->i:Lcom/google/android/play/integrity/internal/f;

    invoke-static {v1}, Lcom/google/android/play/integrity/internal/f;->j(Lcom/google/android/play/integrity/internal/f;)Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result v1

    if-lez v1, :cond_0

    iget-object v1, p0, Lcom/google/android/play/integrity/internal/J;->i:Lcom/google/android/play/integrity/internal/f;

    invoke-static {v1}, Lcom/google/android/play/integrity/internal/f;->f(Lcom/google/android/play/integrity/internal/f;)Lcom/google/android/play/integrity/internal/F;

    move-result-object v1

    const-string v2, "Already connected to the service."

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {v1, v2, v3}, Lcom/google/android/play/integrity/internal/F;->d(Ljava/lang/String;[Ljava/lang/Object;)I

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    iget-object v1, p0, Lcom/google/android/play/integrity/internal/J;->i:Lcom/google/android/play/integrity/internal/f;

    iget-object v2, p0, Lcom/google/android/play/integrity/internal/J;->h:Lcom/google/android/play/integrity/internal/G;

    invoke-static {v1, v2}, Lcom/google/android/play/integrity/internal/f;->q(Lcom/google/android/play/integrity/internal/f;Lcom/google/android/play/integrity/internal/G;)V

    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
