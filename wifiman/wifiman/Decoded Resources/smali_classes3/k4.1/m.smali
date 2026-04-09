.class final Lk4/m;
.super Lk4/j;
.source "SourceFile"


# instance fields
.field final synthetic b:Lcom/google/android/gms/tasks/TaskCompletionSource;

.field final synthetic c:Lk4/j;

.field final synthetic d:Lk4/t;


# direct methods
.method constructor <init>(Lk4/t;Lcom/google/android/gms/tasks/TaskCompletionSource;Lcom/google/android/gms/tasks/TaskCompletionSource;Lk4/j;)V
    .locals 0

    iput-object p3, p0, Lk4/m;->b:Lcom/google/android/gms/tasks/TaskCompletionSource;

    iput-object p4, p0, Lk4/m;->c:Lk4/j;

    iput-object p1, p0, Lk4/m;->d:Lk4/t;

    invoke-direct {p0, p2}, Lk4/j;-><init>(Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 4

    iget-object v0, p0, Lk4/m;->d:Lk4/t;

    invoke-static {v0}, Lk4/t;->g(Lk4/t;)Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lk4/m;->d:Lk4/t;

    iget-object v2, p0, Lk4/m;->b:Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-static {v1, v2}, Lk4/t;->n(Lk4/t;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    iget-object v1, p0, Lk4/m;->d:Lk4/t;

    invoke-static {v1}, Lk4/t;->i(Lk4/t;)Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result v1

    if-lez v1, :cond_0

    iget-object v1, p0, Lk4/m;->d:Lk4/t;

    invoke-static {v1}, Lk4/t;->f(Lk4/t;)Lk4/i;

    move-result-object v1

    const-string v2, "Already connected to the service."

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {v1, v2, v3}, Lk4/i;->c(Ljava/lang/String;[Ljava/lang/Object;)I

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    iget-object v1, p0, Lk4/m;->d:Lk4/t;

    iget-object v2, p0, Lk4/m;->c:Lk4/j;

    invoke-static {v1, v2}, Lk4/t;->p(Lk4/t;Lk4/j;)V

    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
