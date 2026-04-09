.class final Lcom/google/android/gms/measurement/internal/P5;
.super Lcom/google/android/gms/measurement/internal/x2;
.source "SourceFile"


# instance fields
.field private final synthetic a:Ljava/util/concurrent/atomic/AtomicReference;

.field private final synthetic b:Lcom/google/android/gms/measurement/internal/C5;


# direct methods
.method constructor <init>(Lcom/google/android/gms/measurement/internal/C5;Ljava/util/concurrent/atomic/AtomicReference;)V
    .locals 0

    iput-object p2, p0, Lcom/google/android/gms/measurement/internal/P5;->a:Ljava/util/concurrent/atomic/AtomicReference;

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/P5;->b:Lcom/google/android/gms/measurement/internal/C5;

    invoke-direct {p0}, Lcom/google/android/gms/measurement/internal/x2;-><init>()V

    return-void
.end method


# virtual methods
.method public final k(Lcom/google/android/gms/measurement/internal/S6;)V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/P5;->a:Ljava/util/concurrent/atomic/AtomicReference;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/P5;->b:Lcom/google/android/gms/measurement/internal/C5;

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/a4;->zzj()Lcom/google/android/gms/measurement/internal/L2;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/L2;->G()Lcom/google/android/gms/measurement/internal/N2;

    move-result-object v1

    const-string v2, "[sgtm] Got upload batches from service. count"

    iget-object v3, p1, Lcom/google/android/gms/measurement/internal/S6;->a:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/measurement/internal/N2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/P5;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v1, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/google/android/gms/measurement/internal/P5;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {p1}, Ljava/lang/Object;->notifyAll()V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method
