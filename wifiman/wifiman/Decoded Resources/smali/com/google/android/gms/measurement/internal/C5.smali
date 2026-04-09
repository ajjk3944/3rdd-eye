.class public final Lcom/google/android/gms/measurement/internal/C5;
.super Lcom/google/android/gms/measurement/internal/I2;
.source "SourceFile"


# instance fields
.field private final c:Lcom/google/android/gms/measurement/internal/h6;

.field private d:Lcom/google/android/gms/measurement/internal/s2;

.field private volatile e:Ljava/lang/Boolean;

.field private final f:Lcom/google/android/gms/measurement/internal/A;

.field private final g:Lcom/google/android/gms/measurement/internal/H6;

.field private final h:Ljava/util/List;

.field private final i:Lcom/google/android/gms/measurement/internal/A;


# direct methods
.method protected constructor <init>(Lcom/google/android/gms/measurement/internal/v3;)V
    .locals 2

    invoke-direct {p0, p1}, Lcom/google/android/gms/measurement/internal/I2;-><init>(Lcom/google/android/gms/measurement/internal/v3;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/measurement/internal/C5;->h:Ljava/util/List;

    new-instance v0, Lcom/google/android/gms/measurement/internal/H6;

    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/v3;->zzb()Lcom/google/android/gms/common/util/d;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/android/gms/measurement/internal/H6;-><init>(Lcom/google/android/gms/common/util/d;)V

    iput-object v0, p0, Lcom/google/android/gms/measurement/internal/C5;->g:Lcom/google/android/gms/measurement/internal/H6;

    new-instance v0, Lcom/google/android/gms/measurement/internal/h6;

    invoke-direct {v0, p0}, Lcom/google/android/gms/measurement/internal/h6;-><init>(Lcom/google/android/gms/measurement/internal/C5;)V

    iput-object v0, p0, Lcom/google/android/gms/measurement/internal/C5;->c:Lcom/google/android/gms/measurement/internal/h6;

    new-instance v0, Lcom/google/android/gms/measurement/internal/I5;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/measurement/internal/I5;-><init>(Lcom/google/android/gms/measurement/internal/C5;Lcom/google/android/gms/measurement/internal/c4;)V

    iput-object v0, p0, Lcom/google/android/gms/measurement/internal/C5;->f:Lcom/google/android/gms/measurement/internal/A;

    new-instance v0, Lcom/google/android/gms/measurement/internal/V5;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/measurement/internal/V5;-><init>(Lcom/google/android/gms/measurement/internal/C5;Lcom/google/android/gms/measurement/internal/c4;)V

    iput-object v0, p0, Lcom/google/android/gms/measurement/internal/C5;->i:Lcom/google/android/gms/measurement/internal/A;

    return-void
.end method

.method static synthetic K(Lcom/google/android/gms/measurement/internal/C5;Landroid/content/ComponentName;)V
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a4;->j()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/C5;->d:Lcom/google/android/gms/measurement/internal/s2;

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/measurement/internal/C5;->d:Lcom/google/android/gms/measurement/internal/s2;

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a4;->zzj()Lcom/google/android/gms/measurement/internal/L2;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/L2;->G()Lcom/google/android/gms/measurement/internal/N2;

    move-result-object v0

    const-string v1, "Disconnected from device MeasurementService"

    invoke-virtual {v0, v1, p1}, Lcom/google/android/gms/measurement/internal/N2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a4;->j()V

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/C5;->b0()V

    :cond_0
    return-void
.end method

.method static bridge synthetic L(Lcom/google/android/gms/measurement/internal/C5;Lcom/google/android/gms/measurement/internal/s2;)V
    .locals 0

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/C5;->d:Lcom/google/android/gms/measurement/internal/s2;

    return-void
.end method

.method public static synthetic M(Lcom/google/android/gms/measurement/internal/C5;Lcom/google/android/gms/measurement/internal/t7;Lcom/google/android/gms/measurement/internal/h;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/C5;->d:Lcom/google/android/gms/measurement/internal/s2;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a4;->zzj()Lcom/google/android/gms/measurement/internal/L2;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/L2;->C()Lcom/google/android/gms/measurement/internal/N2;

    move-result-object p0

    const-string p1, "[sgtm] Discarding data. Failed to update batch upload status."

    invoke-virtual {p0, p1}, Lcom/google/android/gms/measurement/internal/N2;->a(Ljava/lang/String;)V

    return-void

    :cond_0
    :try_start_0
    invoke-interface {v0, p1, p2}, Lcom/google/android/gms/measurement/internal/s2;->N(Lcom/google/android/gms/measurement/internal/t7;Lcom/google/android/gms/measurement/internal/h;)V

    invoke-direct {p0}, Lcom/google/android/gms/measurement/internal/C5;->m0()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a4;->zzj()Lcom/google/android/gms/measurement/internal/L2;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/L2;->C()Lcom/google/android/gms/measurement/internal/N2;

    move-result-object p0

    iget-wide v0, p2, Lcom/google/android/gms/measurement/internal/h;->a:J

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    const-string v0, "[sgtm] Failed to update batch upload status, rowId, exception"

    invoke-virtual {p0, v0, p2, p1}, Lcom/google/android/gms/measurement/internal/N2;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic N(Lcom/google/android/gms/measurement/internal/C5;Ljava/util/concurrent/atomic/AtomicReference;Lcom/google/android/gms/measurement/internal/t7;Landroid/os/Bundle;)V
    .locals 2

    monitor-enter p1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/C5;->d:Lcom/google/android/gms/measurement/internal/s2;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a4;->zzj()Lcom/google/android/gms/measurement/internal/L2;

    move-result-object p2

    invoke-virtual {p2}, Lcom/google/android/gms/measurement/internal/L2;->C()Lcom/google/android/gms/measurement/internal/N2;

    move-result-object p2

    const-string p3, "Failed to request trigger URIs; not connected to service"

    invoke-virtual {p2, p3}, Lcom/google/android/gms/measurement/internal/N2;->a(Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    return-void

    :catchall_0
    move-exception p0

    goto :goto_2

    :catch_0
    move-exception p2

    goto :goto_0

    :cond_0
    :try_start_2
    invoke-static {p2}, Ls3/p;->l(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lcom/google/android/gms/measurement/internal/N5;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/measurement/internal/N5;-><init>(Lcom/google/android/gms/measurement/internal/C5;Ljava/util/concurrent/atomic/AtomicReference;)V

    invoke-interface {v0, p2, p3, v1}, Lcom/google/android/gms/measurement/internal/s2;->g0(Lcom/google/android/gms/measurement/internal/t7;Landroid/os/Bundle;Lcom/google/android/gms/measurement/internal/t2;)V

    invoke-direct {p0}, Lcom/google/android/gms/measurement/internal/C5;->m0()V
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_1

    :goto_0
    :try_start_3
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a4;->zzj()Lcom/google/android/gms/measurement/internal/L2;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/L2;->C()Lcom/google/android/gms/measurement/internal/N2;

    move-result-object p0

    const-string p3, "Failed to request trigger URIs; remote exception"

    invoke-virtual {p0, p3, p2}, Lcom/google/android/gms/measurement/internal/N2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p1}, Ljava/lang/Object;->notifyAll()V

    :goto_1
    monitor-exit p1

    return-void

    :goto_2
    monitor-exit p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw p0
.end method

.method public static synthetic O(Lcom/google/android/gms/measurement/internal/C5;Ljava/util/concurrent/atomic/AtomicReference;Lcom/google/android/gms/measurement/internal/t7;Lcom/google/android/gms/measurement/internal/Q6;)V
    .locals 2

    monitor-enter p1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/C5;->d:Lcom/google/android/gms/measurement/internal/s2;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a4;->zzj()Lcom/google/android/gms/measurement/internal/L2;

    move-result-object p2

    invoke-virtual {p2}, Lcom/google/android/gms/measurement/internal/L2;->C()Lcom/google/android/gms/measurement/internal/N2;

    move-result-object p2

    const-string p3, "[sgtm] Failed to get upload batches; not connected to service"

    invoke-virtual {p2, p3}, Lcom/google/android/gms/measurement/internal/N2;->a(Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    return-void

    :catchall_0
    move-exception p0

    goto :goto_2

    :catch_0
    move-exception p2

    goto :goto_0

    :cond_0
    :try_start_2
    invoke-static {p2}, Ls3/p;->l(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lcom/google/android/gms/measurement/internal/P5;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/measurement/internal/P5;-><init>(Lcom/google/android/gms/measurement/internal/C5;Ljava/util/concurrent/atomic/AtomicReference;)V

    invoke-interface {v0, p2, p3, v1}, Lcom/google/android/gms/measurement/internal/s2;->O(Lcom/google/android/gms/measurement/internal/t7;Lcom/google/android/gms/measurement/internal/Q6;Lcom/google/android/gms/measurement/internal/y2;)V

    invoke-direct {p0}, Lcom/google/android/gms/measurement/internal/C5;->m0()V
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_1

    :goto_0
    :try_start_3
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a4;->zzj()Lcom/google/android/gms/measurement/internal/L2;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/L2;->C()Lcom/google/android/gms/measurement/internal/N2;

    move-result-object p0

    const-string p3, "[sgtm] Failed to get upload batches; remote exception"

    invoke-virtual {p0, p3, p2}, Lcom/google/android/gms/measurement/internal/N2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p1}, Ljava/lang/Object;->notifyAll()V

    :goto_1
    monitor-exit p1

    return-void

    :goto_2
    monitor-exit p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw p0
.end method

.method private final Q(Ljava/lang/Runnable;)V
    .locals 4

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a4;->j()V

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/C5;->g0()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/C5;->h:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    int-to-long v0, v0

    const-wide/16 v2, 0x3e8

    cmp-long v0, v0, v2

    if-ltz v0, :cond_1

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a4;->zzj()Lcom/google/android/gms/measurement/internal/L2;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/L2;->C()Lcom/google/android/gms/measurement/internal/N2;

    move-result-object p1

    const-string v0, "Discarding data. Max runnable queue size reached"

    invoke-virtual {p1, v0}, Lcom/google/android/gms/measurement/internal/N2;->a(Ljava/lang/String;)V

    return-void

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/C5;->h:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object p1, p0, Lcom/google/android/gms/measurement/internal/C5;->i:Lcom/google/android/gms/measurement/internal/A;

    const-wide/32 v0, 0xea60

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/measurement/internal/A;->b(J)V

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/C5;->b0()V

    return-void
.end method

.method private final l0()V
    .locals 4

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a4;->j()V

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a4;->zzj()Lcom/google/android/gms/measurement/internal/L2;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/L2;->G()Lcom/google/android/gms/measurement/internal/N2;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/C5;->h:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "Processing queued up service tasks"

    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/measurement/internal/N2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/C5;->h:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Runnable;

    :try_start_0
    invoke-interface {v1}, Ljava/lang/Runnable;->run()V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a4;->zzj()Lcom/google/android/gms/measurement/internal/L2;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/L2;->C()Lcom/google/android/gms/measurement/internal/N2;

    move-result-object v2

    const-string v3, "Task exception while flushing queue"

    invoke-virtual {v2, v3, v1}, Lcom/google/android/gms/measurement/internal/N2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/C5;->h:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/C5;->i:Lcom/google/android/gms/measurement/internal/A;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/A;->a()V

    return-void
.end method

.method private final m0()V
    .locals 3

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a4;->j()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/C5;->g:Lcom/google/android/gms/measurement/internal/H6;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/H6;->c()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/C5;->f:Lcom/google/android/gms/measurement/internal/A;

    sget-object v1, Lcom/google/android/gms/measurement/internal/N;->Y:Lcom/google/android/gms/measurement/internal/q2;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lcom/google/android/gms/measurement/internal/q2;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/measurement/internal/A;->b(J)V

    return-void
.end method

.method static bridge synthetic n0(Lcom/google/android/gms/measurement/internal/C5;)Lcom/google/android/gms/measurement/internal/h6;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/measurement/internal/C5;->c:Lcom/google/android/gms/measurement/internal/h6;

    return-object p0
.end method

.method private final p0(Z)Lcom/google/android/gms/measurement/internal/t7;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/f1;->l()Lcom/google/android/gms/measurement/internal/z2;

    move-result-object v0

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a4;->zzj()Lcom/google/android/gms/measurement/internal/L2;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/L2;->K()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {v0, p1}, Lcom/google/android/gms/measurement/internal/z2;->y(Ljava/lang/String;)Lcom/google/android/gms/measurement/internal/t7;

    move-result-object p1

    return-object p1
.end method

.method public static synthetic q0(Lcom/google/android/gms/measurement/internal/C5;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/C5;->d:Lcom/google/android/gms/measurement/internal/s2;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a4;->zzj()Lcom/google/android/gms/measurement/internal/L2;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/L2;->C()Lcom/google/android/gms/measurement/internal/N2;

    move-result-object p0

    const-string v0, "Failed to send storage consent settings to service"

    invoke-virtual {p0, v0}, Lcom/google/android/gms/measurement/internal/N2;->a(Ljava/lang/String;)V

    return-void

    :cond_0
    const/4 v1, 0x0

    :try_start_0
    invoke-direct {p0, v1}, Lcom/google/android/gms/measurement/internal/C5;->p0(Z)Lcom/google/android/gms/measurement/internal/t7;

    move-result-object v1

    invoke-static {v1}, Ls3/p;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v0, v1}, Lcom/google/android/gms/measurement/internal/s2;->D(Lcom/google/android/gms/measurement/internal/t7;)V

    invoke-direct {p0}, Lcom/google/android/gms/measurement/internal/C5;->m0()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a4;->zzj()Lcom/google/android/gms/measurement/internal/L2;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/L2;->C()Lcom/google/android/gms/measurement/internal/N2;

    move-result-object p0

    const-string v1, "Failed to send storage consent settings to the service"

    invoke-virtual {p0, v1, v0}, Lcom/google/android/gms/measurement/internal/N2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic r0(Lcom/google/android/gms/measurement/internal/C5;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/C5;->d:Lcom/google/android/gms/measurement/internal/s2;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a4;->zzj()Lcom/google/android/gms/measurement/internal/L2;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/L2;->C()Lcom/google/android/gms/measurement/internal/N2;

    move-result-object p0

    const-string v0, "Failed to send Dma consent settings to service"

    invoke-virtual {p0, v0}, Lcom/google/android/gms/measurement/internal/N2;->a(Ljava/lang/String;)V

    return-void

    :cond_0
    const/4 v1, 0x0

    :try_start_0
    invoke-direct {p0, v1}, Lcom/google/android/gms/measurement/internal/C5;->p0(Z)Lcom/google/android/gms/measurement/internal/t7;

    move-result-object v1

    invoke-static {v1}, Ls3/p;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v0, v1}, Lcom/google/android/gms/measurement/internal/s2;->Q(Lcom/google/android/gms/measurement/internal/t7;)V

    invoke-direct {p0}, Lcom/google/android/gms/measurement/internal/C5;->m0()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a4;->zzj()Lcom/google/android/gms/measurement/internal/L2;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/L2;->C()Lcom/google/android/gms/measurement/internal/N2;

    move-result-object p0

    const-string v1, "Failed to send Dma consent settings to the service"

    invoke-virtual {p0, v1, v0}, Lcom/google/android/gms/measurement/internal/N2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method static synthetic s0(Lcom/google/android/gms/measurement/internal/C5;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/measurement/internal/C5;->l0()V

    return-void
.end method

.method static synthetic t0(Lcom/google/android/gms/measurement/internal/C5;)V
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a4;->j()V

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/C5;->g0()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a4;->zzj()Lcom/google/android/gms/measurement/internal/L2;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/L2;->G()Lcom/google/android/gms/measurement/internal/N2;

    move-result-object v0

    const-string v1, "Inactivity, disconnecting from the service"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/N2;->a(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/C5;->c0()V

    :cond_0
    return-void
.end method

.method static synthetic u0(Lcom/google/android/gms/measurement/internal/C5;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/measurement/internal/C5;->m0()V

    return-void
.end method

.method static bridge synthetic y(Lcom/google/android/gms/measurement/internal/C5;)Lcom/google/android/gms/measurement/internal/s2;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/measurement/internal/C5;->d:Lcom/google/android/gms/measurement/internal/s2;

    return-object p0
.end method


# virtual methods
.method public final A(Lcom/google/android/gms/internal/measurement/U0;)V
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a4;->j()V

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/I2;->u()V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/google/android/gms/measurement/internal/C5;->p0(Z)Lcom/google/android/gms/measurement/internal/t7;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/measurement/internal/T5;

    invoke-direct {v1, p0, v0, p1}, Lcom/google/android/gms/measurement/internal/T5;-><init>(Lcom/google/android/gms/measurement/internal/C5;Lcom/google/android/gms/measurement/internal/t7;Lcom/google/android/gms/internal/measurement/U0;)V

    invoke-direct {p0, v1}, Lcom/google/android/gms/measurement/internal/C5;->Q(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final B(Lcom/google/android/gms/internal/measurement/U0;Lcom/google/android/gms/measurement/internal/L;Ljava/lang/String;)V
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a4;->j()V

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/I2;->u()V

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a4;->g()Lcom/google/android/gms/measurement/internal/x7;

    move-result-object v0

    const v1, 0xbdfcb8

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/x7;->q(I)I

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a4;->zzj()Lcom/google/android/gms/measurement/internal/L2;

    move-result-object p2

    invoke-virtual {p2}, Lcom/google/android/gms/measurement/internal/L2;->H()Lcom/google/android/gms/measurement/internal/N2;

    move-result-object p2

    const-string p3, "Not bundling data. Service unavailable or out of date"

    invoke-virtual {p2, p3}, Lcom/google/android/gms/measurement/internal/N2;->a(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a4;->g()Lcom/google/android/gms/measurement/internal/x7;

    move-result-object p2

    const/4 p3, 0x0

    new-array p3, p3, [B

    invoke-virtual {p2, p1, p3}, Lcom/google/android/gms/measurement/internal/x7;->R(Lcom/google/android/gms/internal/measurement/U0;[B)V

    return-void

    :cond_0
    new-instance v0, Lcom/google/android/gms/measurement/internal/Z5;

    invoke-direct {v0, p0, p2, p3, p1}, Lcom/google/android/gms/measurement/internal/Z5;-><init>(Lcom/google/android/gms/measurement/internal/C5;Lcom/google/android/gms/measurement/internal/L;Ljava/lang/String;Lcom/google/android/gms/internal/measurement/U0;)V

    invoke-direct {p0, v0}, Lcom/google/android/gms/measurement/internal/C5;->Q(Ljava/lang/Runnable;)V

    return-void
.end method

.method protected final C(Lcom/google/android/gms/internal/measurement/U0;Ljava/lang/String;Ljava/lang/String;)V
    .locals 7

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a4;->j()V

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/I2;->u()V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/google/android/gms/measurement/internal/C5;->p0(Z)Lcom/google/android/gms/measurement/internal/t7;

    move-result-object v5

    new-instance v0, Lcom/google/android/gms/measurement/internal/f6;

    move-object v1, v0

    move-object v2, p0

    move-object v3, p2

    move-object v4, p3

    move-object v6, p1

    invoke-direct/range {v1 .. v6}, Lcom/google/android/gms/measurement/internal/f6;-><init>(Lcom/google/android/gms/measurement/internal/C5;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/measurement/internal/t7;Lcom/google/android/gms/internal/measurement/U0;)V

    invoke-direct {p0, v0}, Lcom/google/android/gms/measurement/internal/C5;->Q(Ljava/lang/Runnable;)V

    return-void
.end method

.method protected final D(Lcom/google/android/gms/internal/measurement/U0;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 8

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a4;->j()V

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/I2;->u()V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/google/android/gms/measurement/internal/C5;->p0(Z)Lcom/google/android/gms/measurement/internal/t7;

    move-result-object v5

    new-instance v0, Lcom/google/android/gms/measurement/internal/K5;

    move-object v1, v0

    move-object v2, p0

    move-object v3, p2

    move-object v4, p3

    move v6, p4

    move-object v7, p1

    invoke-direct/range {v1 .. v7}, Lcom/google/android/gms/measurement/internal/K5;-><init>(Lcom/google/android/gms/measurement/internal/C5;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/measurement/internal/t7;ZLcom/google/android/gms/internal/measurement/U0;)V

    invoke-direct {p0, v0}, Lcom/google/android/gms/measurement/internal/C5;->Q(Ljava/lang/Runnable;)V

    return-void
.end method

.method protected final E(Lcom/google/android/gms/measurement/internal/h;)V
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a4;->j()V

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/I2;->u()V

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/google/android/gms/measurement/internal/C5;->p0(Z)Lcom/google/android/gms/measurement/internal/t7;

    move-result-object v0

    invoke-static {v0}, Ls3/p;->l(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lcom/google/android/gms/measurement/internal/H5;

    invoke-direct {v1, p0, v0, p1}, Lcom/google/android/gms/measurement/internal/H5;-><init>(Lcom/google/android/gms/measurement/internal/C5;Lcom/google/android/gms/measurement/internal/t7;Lcom/google/android/gms/measurement/internal/h;)V

    invoke-direct {p0, v1}, Lcom/google/android/gms/measurement/internal/C5;->Q(Ljava/lang/Runnable;)V

    return-void
.end method

.method protected final F(Lcom/google/android/gms/measurement/internal/j;)V
    .locals 8

    invoke-static {p1}, Ls3/p;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a4;->j()V

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/I2;->u()V

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/f1;->m()Lcom/google/android/gms/measurement/internal/C2;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/measurement/internal/C2;->B(Lcom/google/android/gms/measurement/internal/j;)Z

    move-result v5

    new-instance v6, Lcom/google/android/gms/measurement/internal/j;

    invoke-direct {v6, p1}, Lcom/google/android/gms/measurement/internal/j;-><init>(Lcom/google/android/gms/measurement/internal/j;)V

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/google/android/gms/measurement/internal/C5;->p0(Z)Lcom/google/android/gms/measurement/internal/t7;

    move-result-object v4

    new-instance v0, Lcom/google/android/gms/measurement/internal/d6;

    const/4 v3, 0x1

    move-object v1, v0

    move-object v2, p0

    move-object v7, p1

    invoke-direct/range {v1 .. v7}, Lcom/google/android/gms/measurement/internal/d6;-><init>(Lcom/google/android/gms/measurement/internal/C5;ZLcom/google/android/gms/measurement/internal/t7;ZLcom/google/android/gms/measurement/internal/j;Lcom/google/android/gms/measurement/internal/j;)V

    invoke-direct {p0, v0}, Lcom/google/android/gms/measurement/internal/C5;->Q(Ljava/lang/Runnable;)V

    return-void
.end method

.method protected final G(Lcom/google/android/gms/measurement/internal/L;Ljava/lang/String;)V
    .locals 8

    invoke-static {p1}, Ls3/p;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a4;->j()V

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/I2;->u()V

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/f1;->m()Lcom/google/android/gms/measurement/internal/C2;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/measurement/internal/C2;->D(Lcom/google/android/gms/measurement/internal/L;)Z

    move-result v5

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/google/android/gms/measurement/internal/C5;->p0(Z)Lcom/google/android/gms/measurement/internal/t7;

    move-result-object v4

    new-instance v0, Lcom/google/android/gms/measurement/internal/a6;

    const/4 v3, 0x1

    move-object v1, v0

    move-object v2, p0

    move-object v6, p1

    move-object v7, p2

    invoke-direct/range {v1 .. v7}, Lcom/google/android/gms/measurement/internal/a6;-><init>(Lcom/google/android/gms/measurement/internal/C5;ZLcom/google/android/gms/measurement/internal/t7;ZLcom/google/android/gms/measurement/internal/L;Ljava/lang/String;)V

    invoke-direct {p0, v0}, Lcom/google/android/gms/measurement/internal/C5;->Q(Ljava/lang/Runnable;)V

    return-void
.end method

.method protected final H(Lcom/google/android/gms/measurement/internal/s2;)V
    .locals 0

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a4;->j()V

    invoke-static {p1}, Ls3/p;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/C5;->d:Lcom/google/android/gms/measurement/internal/s2;

    invoke-direct {p0}, Lcom/google/android/gms/measurement/internal/C5;->m0()V

    invoke-direct {p0}, Lcom/google/android/gms/measurement/internal/C5;->l0()V

    return-void
.end method

.method final I(Lcom/google/android/gms/measurement/internal/s2;Lt3/a;Lcom/google/android/gms/measurement/internal/t7;)V
    .locals 36

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a4;->j()V

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/I2;->u()V

    const/16 v5, 0x64

    move v0, v5

    const/4 v7, 0x0

    :goto_0
    const/16 v8, 0x3e9

    if-ge v7, v8, :cond_9

    if-ne v0, v5, :cond_9

    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/f1;->m()Lcom/google/android/gms/measurement/internal/C2;

    move-result-object v0

    invoke-virtual {v0, v5}, Lcom/google/android/gms/measurement/internal/C2;->z(I)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v8, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    move v9, v0

    goto :goto_1

    :cond_0
    const/4 v9, 0x0

    :goto_1
    const-wide/16 v10, 0x0

    if-eqz v3, :cond_1

    if-ge v9, v5, :cond_1

    new-instance v0, Lcom/google/android/gms/measurement/internal/E2;

    const-string v12, ""

    invoke-direct {v0, v3, v12, v10, v11}, Lcom/google/android/gms/measurement/internal/E2;-><init>(Lt3/a;Ljava/lang/String;J)V

    invoke-interface {v8, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a4;->a()Lcom/google/android/gms/measurement/internal/l;

    move-result-object v0

    sget-object v12, Lcom/google/android/gms/measurement/internal/N;->U0:Lcom/google/android/gms/measurement/internal/q2;

    invoke-virtual {v0, v12}, Lcom/google/android/gms/measurement/internal/l;->p(Lcom/google/android/gms/measurement/internal/q2;)Z

    move-result v12

    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v13

    const/4 v0, 0x0

    :goto_2
    if-ge v0, v13, :cond_8

    invoke-virtual {v8, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v14

    add-int/lit8 v15, v0, 0x1

    check-cast v14, Lcom/google/android/gms/measurement/internal/E2;

    iget-object v0, v14, Lcom/google/android/gms/measurement/internal/E2;->a:Lt3/a;

    instance-of v14, v0, Lcom/google/android/gms/measurement/internal/L;

    if-eqz v14, :cond_3

    if-eqz v12, :cond_2

    :try_start_0
    iget-object v14, v1, Lcom/google/android/gms/measurement/internal/a4;->a:Lcom/google/android/gms/measurement/internal/v3;

    invoke-virtual {v14}, Lcom/google/android/gms/measurement/internal/v3;->zzb()Lcom/google/android/gms/common/util/d;

    move-result-object v14

    invoke-interface {v14}, Lcom/google/android/gms/common/util/d;->a()J

    move-result-wide v16
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_1

    :try_start_1
    iget-object v14, v1, Lcom/google/android/gms/measurement/internal/a4;->a:Lcom/google/android/gms/measurement/internal/v3;

    invoke-virtual {v14}, Lcom/google/android/gms/measurement/internal/v3;->zzb()Lcom/google/android/gms/common/util/d;

    move-result-object v14

    invoke-interface {v14}, Lcom/google/android/gms/common/util/d;->c()J

    move-result-wide v18
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_4

    :catch_0
    move-exception v0

    move-wide/from16 v18, v10

    :goto_3
    move-wide/from16 v31, v16

    goto :goto_5

    :catch_1
    move-exception v0

    move-wide/from16 v18, v10

    move-wide/from16 v31, v18

    goto :goto_5

    :cond_2
    move-wide/from16 v16, v10

    move-wide/from16 v18, v16

    :goto_4
    :try_start_2
    check-cast v0, Lcom/google/android/gms/measurement/internal/L;

    invoke-interface {v2, v0, v4}, Lcom/google/android/gms/measurement/internal/s2;->X(Lcom/google/android/gms/measurement/internal/L;Lcom/google/android/gms/measurement/internal/t7;)V

    if-eqz v12, :cond_7

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a4;->zzj()Lcom/google/android/gms/measurement/internal/L2;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/L2;->G()Lcom/google/android/gms/measurement/internal/N2;

    move-result-object v0

    const-string v14, "Logging telemetry for logEvent from database"

    invoke-virtual {v0, v14}, Lcom/google/android/gms/measurement/internal/N2;->a(Ljava/lang/String;)V

    iget-object v0, v1, Lcom/google/android/gms/measurement/internal/a4;->a:Lcom/google/android/gms/measurement/internal/v3;

    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/J2;->a(Lcom/google/android/gms/measurement/internal/v3;)Lcom/google/android/gms/measurement/internal/J2;

    move-result-object v20

    iget-object v0, v1, Lcom/google/android/gms/measurement/internal/a4;->a:Lcom/google/android/gms/measurement/internal/v3;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/v3;->zzb()Lcom/google/android/gms/common/util/d;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/common/util/d;->a()J

    move-result-wide v25

    iget-object v0, v1, Lcom/google/android/gms/measurement/internal/a4;->a:Lcom/google/android/gms/measurement/internal/v3;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/v3;->zzb()Lcom/google/android/gms/common/util/d;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/common/util/d;->c()J

    move-result-wide v21

    sub-long v5, v21, v18

    long-to-int v0, v5

    const v21, 0x8dcd

    const/16 v22, 0x0

    move-wide/from16 v23, v16

    move/from16 v27, v0

    invoke-virtual/range {v20 .. v27}, Lcom/google/android/gms/measurement/internal/J2;->b(IIJJI)V
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_2

    goto/16 :goto_6

    :catch_2
    move-exception v0

    goto :goto_3

    :goto_5
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a4;->zzj()Lcom/google/android/gms/measurement/internal/L2;

    move-result-object v5

    invoke-virtual {v5}, Lcom/google/android/gms/measurement/internal/L2;->C()Lcom/google/android/gms/measurement/internal/N2;

    move-result-object v5

    const-string v6, "Failed to send event to the service"

    invoke-virtual {v5, v6, v0}, Lcom/google/android/gms/measurement/internal/N2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    if-eqz v12, :cond_7

    cmp-long v0, v31, v10

    if-eqz v0, :cond_7

    iget-object v0, v1, Lcom/google/android/gms/measurement/internal/a4;->a:Lcom/google/android/gms/measurement/internal/v3;

    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/J2;->a(Lcom/google/android/gms/measurement/internal/v3;)Lcom/google/android/gms/measurement/internal/J2;

    move-result-object v28

    iget-object v0, v1, Lcom/google/android/gms/measurement/internal/a4;->a:Lcom/google/android/gms/measurement/internal/v3;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/v3;->zzb()Lcom/google/android/gms/common/util/d;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/common/util/d;->a()J

    move-result-wide v33

    iget-object v0, v1, Lcom/google/android/gms/measurement/internal/a4;->a:Lcom/google/android/gms/measurement/internal/v3;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/v3;->zzb()Lcom/google/android/gms/common/util/d;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/common/util/d;->c()J

    move-result-wide v5

    sub-long v5, v5, v18

    long-to-int v0, v5

    const v29, 0x8dcd

    const/16 v30, 0xd

    move/from16 v35, v0

    invoke-virtual/range {v28 .. v35}, Lcom/google/android/gms/measurement/internal/J2;->b(IIJJI)V

    goto :goto_6

    :cond_3
    instance-of v5, v0, Lcom/google/android/gms/measurement/internal/r7;

    if-eqz v5, :cond_4

    :try_start_3
    check-cast v0, Lcom/google/android/gms/measurement/internal/r7;

    invoke-interface {v2, v0, v4}, Lcom/google/android/gms/measurement/internal/s2;->o(Lcom/google/android/gms/measurement/internal/r7;Lcom/google/android/gms/measurement/internal/t7;)V
    :try_end_3
    .catch Landroid/os/RemoteException; {:try_start_3 .. :try_end_3} :catch_3

    goto :goto_6

    :catch_3
    move-exception v0

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a4;->zzj()Lcom/google/android/gms/measurement/internal/L2;

    move-result-object v5

    invoke-virtual {v5}, Lcom/google/android/gms/measurement/internal/L2;->C()Lcom/google/android/gms/measurement/internal/N2;

    move-result-object v5

    const-string v6, "Failed to send user property to the service"

    invoke-virtual {v5, v6, v0}, Lcom/google/android/gms/measurement/internal/N2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_6

    :cond_4
    instance-of v5, v0, Lcom/google/android/gms/measurement/internal/j;

    if-eqz v5, :cond_5

    :try_start_4
    check-cast v0, Lcom/google/android/gms/measurement/internal/j;

    invoke-interface {v2, v0, v4}, Lcom/google/android/gms/measurement/internal/s2;->i(Lcom/google/android/gms/measurement/internal/j;Lcom/google/android/gms/measurement/internal/t7;)V
    :try_end_4
    .catch Landroid/os/RemoteException; {:try_start_4 .. :try_end_4} :catch_4

    goto :goto_6

    :catch_4
    move-exception v0

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a4;->zzj()Lcom/google/android/gms/measurement/internal/L2;

    move-result-object v5

    invoke-virtual {v5}, Lcom/google/android/gms/measurement/internal/L2;->C()Lcom/google/android/gms/measurement/internal/N2;

    move-result-object v5

    const-string v6, "Failed to send conditional user property to the service"

    invoke-virtual {v5, v6, v0}, Lcom/google/android/gms/measurement/internal/N2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_6

    :cond_5
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a4;->a()Lcom/google/android/gms/measurement/internal/l;

    move-result-object v5

    sget-object v6, Lcom/google/android/gms/measurement/internal/N;->n1:Lcom/google/android/gms/measurement/internal/q2;

    invoke-virtual {v5, v6}, Lcom/google/android/gms/measurement/internal/l;->p(Lcom/google/android/gms/measurement/internal/q2;)Z

    move-result v5

    if-eqz v5, :cond_6

    instance-of v5, v0, Lcom/google/android/gms/measurement/internal/K;

    if-eqz v5, :cond_6

    :try_start_5
    check-cast v0, Lcom/google/android/gms/measurement/internal/K;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/K;->g()Landroid/os/Bundle;

    move-result-object v0

    invoke-interface {v2, v0, v4}, Lcom/google/android/gms/measurement/internal/s2;->J(Landroid/os/Bundle;Lcom/google/android/gms/measurement/internal/t7;)V
    :try_end_5
    .catch Landroid/os/RemoteException; {:try_start_5 .. :try_end_5} :catch_5

    goto :goto_6

    :catch_5
    move-exception v0

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a4;->zzj()Lcom/google/android/gms/measurement/internal/L2;

    move-result-object v5

    invoke-virtual {v5}, Lcom/google/android/gms/measurement/internal/L2;->C()Lcom/google/android/gms/measurement/internal/N2;

    move-result-object v5

    const-string v6, "Failed to send default event parameters to the service"

    invoke-virtual {v5, v6, v0}, Lcom/google/android/gms/measurement/internal/N2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_6

    :cond_6
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a4;->zzj()Lcom/google/android/gms/measurement/internal/L2;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/L2;->C()Lcom/google/android/gms/measurement/internal/N2;

    move-result-object v0

    const-string v5, "Discarding data. Unrecognized parcel type."

    invoke-virtual {v0, v5}, Lcom/google/android/gms/measurement/internal/N2;->a(Ljava/lang/String;)V

    :cond_7
    :goto_6
    move v0, v15

    const/16 v5, 0x64

    goto/16 :goto_2

    :cond_8
    add-int/lit8 v7, v7, 0x1

    move v0, v9

    const/16 v5, 0x64

    goto/16 :goto_0

    :cond_9
    return-void
.end method

.method protected final J(Lcom/google/android/gms/measurement/internal/u5;)V
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a4;->j()V

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/I2;->u()V

    new-instance v0, Lcom/google/android/gms/measurement/internal/X5;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/measurement/internal/X5;-><init>(Lcom/google/android/gms/measurement/internal/C5;Lcom/google/android/gms/measurement/internal/u5;)V

    invoke-direct {p0, v0}, Lcom/google/android/gms/measurement/internal/C5;->Q(Ljava/lang/Runnable;)V

    return-void
.end method

.method protected final P(Lcom/google/android/gms/measurement/internal/r7;)V
    .locals 3

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a4;->j()V

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/I2;->u()V

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/f1;->m()Lcom/google/android/gms/measurement/internal/C2;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/measurement/internal/C2;->E(Lcom/google/android/gms/measurement/internal/r7;)Z

    move-result v0

    const/4 v1, 0x1

    invoke-direct {p0, v1}, Lcom/google/android/gms/measurement/internal/C5;->p0(Z)Lcom/google/android/gms/measurement/internal/t7;

    move-result-object v1

    new-instance v2, Lcom/google/android/gms/measurement/internal/O5;

    invoke-direct {v2, p0, v1, v0, p1}, Lcom/google/android/gms/measurement/internal/O5;-><init>(Lcom/google/android/gms/measurement/internal/C5;Lcom/google/android/gms/measurement/internal/t7;ZLcom/google/android/gms/measurement/internal/r7;)V

    invoke-direct {p0, v2}, Lcom/google/android/gms/measurement/internal/C5;->Q(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final R(Ljava/util/concurrent/atomic/AtomicReference;)V
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a4;->j()V

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/I2;->u()V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/google/android/gms/measurement/internal/C5;->p0(Z)Lcom/google/android/gms/measurement/internal/t7;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/measurement/internal/Q5;

    invoke-direct {v1, p0, p1, v0}, Lcom/google/android/gms/measurement/internal/Q5;-><init>(Lcom/google/android/gms/measurement/internal/C5;Ljava/util/concurrent/atomic/AtomicReference;Lcom/google/android/gms/measurement/internal/t7;)V

    invoke-direct {p0, v1}, Lcom/google/android/gms/measurement/internal/C5;->Q(Ljava/lang/Runnable;)V

    return-void
.end method

.method protected final S(Ljava/util/concurrent/atomic/AtomicReference;Landroid/os/Bundle;)V
    .locals 3

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a4;->j()V

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/I2;->u()V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/google/android/gms/measurement/internal/C5;->p0(Z)Lcom/google/android/gms/measurement/internal/t7;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a4;->a()Lcom/google/android/gms/measurement/internal/l;

    move-result-object v1

    sget-object v2, Lcom/google/android/gms/measurement/internal/N;->j1:Lcom/google/android/gms/measurement/internal/q2;

    invoke-virtual {v1, v2}, Lcom/google/android/gms/measurement/internal/l;->p(Lcom/google/android/gms/measurement/internal/q2;)Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v1, Lcom/google/android/gms/measurement/internal/G5;

    invoke-direct {v1, p0, p1, v0, p2}, Lcom/google/android/gms/measurement/internal/G5;-><init>(Lcom/google/android/gms/measurement/internal/C5;Ljava/util/concurrent/atomic/AtomicReference;Lcom/google/android/gms/measurement/internal/t7;Landroid/os/Bundle;)V

    invoke-direct {p0, v1}, Lcom/google/android/gms/measurement/internal/C5;->Q(Ljava/lang/Runnable;)V

    return-void

    :cond_0
    new-instance v1, Lcom/google/android/gms/measurement/internal/L5;

    invoke-direct {v1, p0, p1, v0, p2}, Lcom/google/android/gms/measurement/internal/L5;-><init>(Lcom/google/android/gms/measurement/internal/C5;Ljava/util/concurrent/atomic/AtomicReference;Lcom/google/android/gms/measurement/internal/t7;Landroid/os/Bundle;)V

    invoke-direct {p0, v1}, Lcom/google/android/gms/measurement/internal/C5;->Q(Ljava/lang/Runnable;)V

    return-void
.end method

.method protected final T(Ljava/util/concurrent/atomic/AtomicReference;Lcom/google/android/gms/measurement/internal/Q6;)V
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a4;->j()V

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/I2;->u()V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/google/android/gms/measurement/internal/C5;->p0(Z)Lcom/google/android/gms/measurement/internal/t7;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/measurement/internal/J5;

    invoke-direct {v1, p0, p1, v0, p2}, Lcom/google/android/gms/measurement/internal/J5;-><init>(Lcom/google/android/gms/measurement/internal/C5;Ljava/util/concurrent/atomic/AtomicReference;Lcom/google/android/gms/measurement/internal/t7;Lcom/google/android/gms/measurement/internal/Q6;)V

    invoke-direct {p0, v1}, Lcom/google/android/gms/measurement/internal/C5;->Q(Ljava/lang/Runnable;)V

    return-void
.end method

.method protected final U(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 8

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a4;->j()V

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/I2;->u()V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/google/android/gms/measurement/internal/C5;->p0(Z)Lcom/google/android/gms/measurement/internal/t7;

    move-result-object v7

    new-instance v0, Lcom/google/android/gms/measurement/internal/c6;

    move-object v1, v0

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    invoke-direct/range {v1 .. v7}, Lcom/google/android/gms/measurement/internal/c6;-><init>(Lcom/google/android/gms/measurement/internal/C5;Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/measurement/internal/t7;)V

    invoke-direct {p0, v0}, Lcom/google/android/gms/measurement/internal/C5;->Q(Ljava/lang/Runnable;)V

    return-void
.end method

.method protected final V(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 9

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a4;->j()V

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/I2;->u()V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/google/android/gms/measurement/internal/C5;->p0(Z)Lcom/google/android/gms/measurement/internal/t7;

    move-result-object v7

    new-instance v0, Lcom/google/android/gms/measurement/internal/e6;

    move-object v1, v0

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    move v8, p5

    invoke-direct/range {v1 .. v8}, Lcom/google/android/gms/measurement/internal/e6;-><init>(Lcom/google/android/gms/measurement/internal/C5;Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/measurement/internal/t7;Z)V

    invoke-direct {p0, v0}, Lcom/google/android/gms/measurement/internal/C5;->Q(Ljava/lang/Runnable;)V

    return-void
.end method

.method protected final W(Z)V
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a4;->j()V

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/I2;->u()V

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/C5;->i0()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lcom/google/android/gms/measurement/internal/C5;->p0(Z)Lcom/google/android/gms/measurement/internal/t7;

    move-result-object p1

    new-instance v0, Lcom/google/android/gms/measurement/internal/b6;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/measurement/internal/b6;-><init>(Lcom/google/android/gms/measurement/internal/C5;Lcom/google/android/gms/measurement/internal/t7;)V

    invoke-direct {p0, v0}, Lcom/google/android/gms/measurement/internal/C5;->Q(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method protected final X()Lcom/google/android/gms/measurement/internal/o;
    .locals 4

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a4;->j()V

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/I2;->u()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/C5;->d:Lcom/google/android/gms/measurement/internal/s2;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/C5;->b0()V

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a4;->zzj()Lcom/google/android/gms/measurement/internal/L2;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/L2;->B()Lcom/google/android/gms/measurement/internal/N2;

    move-result-object v0

    const-string v2, "Failed to get consents; not connected to service yet."

    invoke-virtual {v0, v2}, Lcom/google/android/gms/measurement/internal/N2;->a(Ljava/lang/String;)V

    return-object v1

    :cond_0
    const/4 v2, 0x0

    invoke-direct {p0, v2}, Lcom/google/android/gms/measurement/internal/C5;->p0(Z)Lcom/google/android/gms/measurement/internal/t7;

    move-result-object v2

    invoke-static {v2}, Ls3/p;->l(Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_0
    invoke-interface {v0, v2}, Lcom/google/android/gms/measurement/internal/s2;->H(Lcom/google/android/gms/measurement/internal/t7;)Lcom/google/android/gms/measurement/internal/o;

    move-result-object v0

    invoke-direct {p0}, Lcom/google/android/gms/measurement/internal/C5;->m0()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a4;->zzj()Lcom/google/android/gms/measurement/internal/L2;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/L2;->C()Lcom/google/android/gms/measurement/internal/N2;

    move-result-object v2

    const-string v3, "Failed to get consents; remote exception"

    invoke-virtual {v2, v3, v0}, Lcom/google/android/gms/measurement/internal/N2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    return-object v1
.end method

.method final Y()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/C5;->e:Ljava/lang/Boolean;

    return-object v0
.end method

.method protected final Z()V
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a4;->j()V

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/I2;->u()V

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/google/android/gms/measurement/internal/C5;->p0(Z)Lcom/google/android/gms/measurement/internal/t7;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/measurement/internal/U5;

    invoke-direct {v1, p0, v0}, Lcom/google/android/gms/measurement/internal/U5;-><init>(Lcom/google/android/gms/measurement/internal/C5;Lcom/google/android/gms/measurement/internal/t7;)V

    invoke-direct {p0, v1}, Lcom/google/android/gms/measurement/internal/C5;->Q(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final bridge synthetic a()Lcom/google/android/gms/measurement/internal/l;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/measurement/internal/a4;->a()Lcom/google/android/gms/measurement/internal/l;

    move-result-object v0

    return-object v0
.end method

.method protected final a0()V
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a4;->j()V

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/I2;->u()V

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/google/android/gms/measurement/internal/C5;->p0(Z)Lcom/google/android/gms/measurement/internal/t7;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/f1;->m()Lcom/google/android/gms/measurement/internal/C2;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/C2;->G()Z

    new-instance v1, Lcom/google/android/gms/measurement/internal/S5;

    invoke-direct {v1, p0, v0}, Lcom/google/android/gms/measurement/internal/S5;-><init>(Lcom/google/android/gms/measurement/internal/C5;Lcom/google/android/gms/measurement/internal/t7;)V

    invoke-direct {p0, v1}, Lcom/google/android/gms/measurement/internal/C5;->Q(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final bridge synthetic b()Lcom/google/android/gms/measurement/internal/F;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/measurement/internal/a4;->b()Lcom/google/android/gms/measurement/internal/F;

    move-result-object v0

    return-object v0
.end method

.method final b0()V
    .locals 4

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a4;->j()V

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/I2;->u()V

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/C5;->g0()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/C5;->k0()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/C5;->c:Lcom/google/android/gms/measurement/internal/h6;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/h6;->a()V

    return-void

    :cond_1
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a4;->a()Lcom/google/android/gms/measurement/internal/l;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/l;->V()Z

    move-result v0

    if-nez v0, :cond_3

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a4;->zza()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a4;->zza()Landroid/content/Context;

    move-result-object v2

    const-string v3, "com.google.android.gms.measurement.AppMeasurementService"

    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->setClassName(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v1

    const/high16 v2, 0x10000

    invoke-virtual {v0, v1, v2}, Landroid/content/pm/PackageManager;->queryIntentServices(Landroid/content/Intent;I)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    new-instance v0, Landroid/content/Intent;

    const-string v1, "com.google.android.gms.measurement.START"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    new-instance v1, Landroid/content/ComponentName;

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a4;->zza()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v2, v3}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/C5;->c:Lcom/google/android/gms/measurement/internal/h6;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/measurement/internal/h6;->d(Landroid/content/Intent;)V

    return-void

    :cond_2
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a4;->zzj()Lcom/google/android/gms/measurement/internal/L2;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/L2;->C()Lcom/google/android/gms/measurement/internal/N2;

    move-result-object v0

    const-string v1, "Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/N2;->a(Ljava/lang/String;)V

    :cond_3
    return-void
.end method

.method public final bridge synthetic c()Lcom/google/android/gms/measurement/internal/D2;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/measurement/internal/a4;->c()Lcom/google/android/gms/measurement/internal/D2;

    move-result-object v0

    return-object v0
.end method

.method public final c0()V
    .locals 3

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a4;->j()V

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/I2;->u()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/C5;->c:Lcom/google/android/gms/measurement/internal/h6;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/h6;->g()V

    :try_start_0
    invoke-static {}, Lv3/b;->b()Lv3/b;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a4;->zza()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/C5;->c:Lcom/google/android/gms/measurement/internal/h6;

    invoke-virtual {v0, v1, v2}, Lv3/b;->c(Landroid/content/Context;Landroid/content/ServiceConnection;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/measurement/internal/C5;->d:Lcom/google/android/gms/measurement/internal/s2;

    return-void
.end method

.method protected final d0()V
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a4;->j()V

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/I2;->u()V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/google/android/gms/measurement/internal/C5;->p0(Z)Lcom/google/android/gms/measurement/internal/t7;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/f1;->m()Lcom/google/android/gms/measurement/internal/C2;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/C2;->F()V

    new-instance v1, Lcom/google/android/gms/measurement/internal/R5;

    invoke-direct {v1, p0, v0}, Lcom/google/android/gms/measurement/internal/R5;-><init>(Lcom/google/android/gms/measurement/internal/C5;Lcom/google/android/gms/measurement/internal/t7;)V

    invoke-direct {p0, v1}, Lcom/google/android/gms/measurement/internal/C5;->Q(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final bridge synthetic e()Lcom/google/android/gms/measurement/internal/X2;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/measurement/internal/a4;->e()Lcom/google/android/gms/measurement/internal/X2;

    move-result-object v0

    return-object v0
.end method

.method protected final e0()V
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a4;->j()V

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/I2;->u()V

    new-instance v0, Lcom/google/android/gms/measurement/internal/E5;

    invoke-direct {v0, p0}, Lcom/google/android/gms/measurement/internal/E5;-><init>(Lcom/google/android/gms/measurement/internal/C5;)V

    invoke-direct {p0, v0}, Lcom/google/android/gms/measurement/internal/C5;->Q(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final bridge synthetic f()Lcom/google/android/gms/measurement/internal/n5;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/measurement/internal/a4;->f()Lcom/google/android/gms/measurement/internal/n5;

    move-result-object v0

    return-object v0
.end method

.method protected final f0()V
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a4;->j()V

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/I2;->u()V

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/google/android/gms/measurement/internal/C5;->p0(Z)Lcom/google/android/gms/measurement/internal/t7;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/measurement/internal/Y5;

    invoke-direct {v1, p0, v0}, Lcom/google/android/gms/measurement/internal/Y5;-><init>(Lcom/google/android/gms/measurement/internal/C5;Lcom/google/android/gms/measurement/internal/t7;)V

    invoke-direct {p0, v1}, Lcom/google/android/gms/measurement/internal/C5;->Q(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final bridge synthetic g()Lcom/google/android/gms/measurement/internal/x7;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/measurement/internal/a4;->g()Lcom/google/android/gms/measurement/internal/x7;

    move-result-object v0

    return-object v0
.end method

.method public final g0()Z
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a4;->j()V

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/I2;->u()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/C5;->d:Lcom/google/android/gms/measurement/internal/s2;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final bridge synthetic h()V
    .locals 0

    invoke-super {p0}, Lcom/google/android/gms/measurement/internal/f1;->h()V

    return-void
.end method

.method final h0()Z
    .locals 3

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a4;->j()V

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/I2;->u()V

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/C5;->k0()Z

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a4;->g()Lcom/google/android/gms/measurement/internal/x7;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/x7;->E0()I

    move-result v0

    const v2, 0x310c4

    if-lt v0, v2, :cond_1

    return v1

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public final bridge synthetic i()V
    .locals 0

    invoke-super {p0}, Lcom/google/android/gms/measurement/internal/f1;->i()V

    return-void
.end method

.method final i0()Z
    .locals 4

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a4;->j()V

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/I2;->u()V

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/C5;->k0()Z

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a4;->g()Lcom/google/android/gms/measurement/internal/x7;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/x7;->E0()I

    move-result v0

    sget-object v2, Lcom/google/android/gms/measurement/internal/N;->I0:Lcom/google/android/gms/measurement/internal/q2;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Lcom/google/android/gms/measurement/internal/q2;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-lt v0, v2, :cond_1

    return v1

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public final bridge synthetic j()V
    .locals 0

    invoke-super {p0}, Lcom/google/android/gms/measurement/internal/f1;->j()V

    return-void
.end method

.method final j0()Z
    .locals 3

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a4;->j()V

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/I2;->u()V

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/C5;->k0()Z

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a4;->g()Lcom/google/android/gms/measurement/internal/x7;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/x7;->E0()I

    move-result v0

    const v2, 0x3ae30

    if-lt v0, v2, :cond_1

    return v1

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public final bridge synthetic k()Lcom/google/android/gms/measurement/internal/B;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/measurement/internal/f1;->k()Lcom/google/android/gms/measurement/internal/B;

    move-result-object v0

    return-object v0
.end method

.method final k0()Z
    .locals 5

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a4;->j()V

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/I2;->u()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/C5;->e:Ljava/lang/Boolean;

    if-nez v0, :cond_c

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a4;->j()V

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/I2;->u()V

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a4;->e()Lcom/google/android/gms/measurement/internal/X2;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/X2;->K()Ljava/lang/Boolean;

    move-result-object v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_0

    goto/16 :goto_6

    :cond_0
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/f1;->l()Lcom/google/android/gms/measurement/internal/z2;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/z2;->z()I

    move-result v2

    const/4 v3, 0x0

    if-ne v2, v1, :cond_1

    :goto_0
    move v0, v1

    goto/16 :goto_4

    :cond_1
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a4;->zzj()Lcom/google/android/gms/measurement/internal/L2;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/L2;->G()Lcom/google/android/gms/measurement/internal/N2;

    move-result-object v2

    const-string v4, "Checking service availability"

    invoke-virtual {v2, v4}, Lcom/google/android/gms/measurement/internal/N2;->a(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a4;->g()Lcom/google/android/gms/measurement/internal/x7;

    move-result-object v2

    const v4, 0xbdfcb8

    invoke-virtual {v2, v4}, Lcom/google/android/gms/measurement/internal/x7;->q(I)I

    move-result v2

    if-eqz v2, :cond_9

    if-eq v2, v1, :cond_8

    const/4 v4, 0x2

    if-eq v2, v4, :cond_5

    const/4 v0, 0x3

    if-eq v2, v0, :cond_4

    const/16 v0, 0x9

    if-eq v2, v0, :cond_3

    const/16 v0, 0x12

    if-eq v2, v0, :cond_2

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a4;->zzj()Lcom/google/android/gms/measurement/internal/L2;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/L2;->H()Lcom/google/android/gms/measurement/internal/N2;

    move-result-object v0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "Unexpected service status"

    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/measurement/internal/N2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    :goto_1
    move v0, v3

    move v1, v0

    goto/16 :goto_4

    :cond_2
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a4;->zzj()Lcom/google/android/gms/measurement/internal/L2;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/L2;->H()Lcom/google/android/gms/measurement/internal/N2;

    move-result-object v0

    const-string v2, "Service updating"

    invoke-virtual {v0, v2}, Lcom/google/android/gms/measurement/internal/N2;->a(Ljava/lang/String;)V

    goto :goto_0

    :cond_3
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a4;->zzj()Lcom/google/android/gms/measurement/internal/L2;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/L2;->H()Lcom/google/android/gms/measurement/internal/N2;

    move-result-object v0

    const-string v1, "Service invalid"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/N2;->a(Ljava/lang/String;)V

    goto :goto_1

    :cond_4
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a4;->zzj()Lcom/google/android/gms/measurement/internal/L2;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/L2;->H()Lcom/google/android/gms/measurement/internal/N2;

    move-result-object v0

    const-string v1, "Service disabled"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/N2;->a(Ljava/lang/String;)V

    goto :goto_1

    :cond_5
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a4;->zzj()Lcom/google/android/gms/measurement/internal/L2;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/L2;->B()Lcom/google/android/gms/measurement/internal/N2;

    move-result-object v2

    const-string v4, "Service container out of date"

    invoke-virtual {v2, v4}, Lcom/google/android/gms/measurement/internal/N2;->a(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a4;->g()Lcom/google/android/gms/measurement/internal/x7;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/x7;->E0()I

    move-result v2

    const/16 v4, 0x4423

    if-ge v2, v4, :cond_6

    :goto_2
    move v0, v1

    move v1, v3

    goto :goto_4

    :cond_6
    if-nez v0, :cond_7

    goto :goto_3

    :cond_7
    move v1, v3

    :goto_3
    move v0, v3

    goto :goto_4

    :cond_8
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a4;->zzj()Lcom/google/android/gms/measurement/internal/L2;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/L2;->G()Lcom/google/android/gms/measurement/internal/N2;

    move-result-object v0

    const-string v2, "Service missing"

    invoke-virtual {v0, v2}, Lcom/google/android/gms/measurement/internal/N2;->a(Ljava/lang/String;)V

    goto :goto_2

    :cond_9
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a4;->zzj()Lcom/google/android/gms/measurement/internal/L2;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/L2;->G()Lcom/google/android/gms/measurement/internal/N2;

    move-result-object v0

    const-string v2, "Service available"

    invoke-virtual {v0, v2}, Lcom/google/android/gms/measurement/internal/N2;->a(Ljava/lang/String;)V

    goto/16 :goto_0

    :goto_4
    if-nez v1, :cond_a

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a4;->a()Lcom/google/android/gms/measurement/internal/l;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/l;->V()Z

    move-result v2

    if-eqz v2, :cond_a

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a4;->zzj()Lcom/google/android/gms/measurement/internal/L2;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/L2;->C()Lcom/google/android/gms/measurement/internal/N2;

    move-result-object v0

    const-string v2, "No way to upload. Consider using the full version of Analytics"

    invoke-virtual {v0, v2}, Lcom/google/android/gms/measurement/internal/N2;->a(Ljava/lang/String;)V

    goto :goto_5

    :cond_a
    move v3, v0

    :goto_5
    if-eqz v3, :cond_b

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a4;->e()Lcom/google/android/gms/measurement/internal/X2;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/X2;->s(Z)V

    :cond_b
    :goto_6
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/measurement/internal/C5;->e:Ljava/lang/Boolean;

    :cond_c
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/C5;->e:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final bridge synthetic l()Lcom/google/android/gms/measurement/internal/z2;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/measurement/internal/f1;->l()Lcom/google/android/gms/measurement/internal/z2;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic m()Lcom/google/android/gms/measurement/internal/C2;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/measurement/internal/f1;->m()Lcom/google/android/gms/measurement/internal/C2;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic n()Lcom/google/android/gms/measurement/internal/r4;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/measurement/internal/f1;->n()Lcom/google/android/gms/measurement/internal/r4;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic o()Lcom/google/android/gms/measurement/internal/q5;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/measurement/internal/f1;->o()Lcom/google/android/gms/measurement/internal/q5;

    move-result-object v0

    return-object v0
.end method

.method protected final o0(Z)V
    .locals 0

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a4;->j()V

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/I2;->u()V

    new-instance p1, Lcom/google/android/gms/measurement/internal/F5;

    invoke-direct {p1, p0}, Lcom/google/android/gms/measurement/internal/F5;-><init>(Lcom/google/android/gms/measurement/internal/C5;)V

    invoke-direct {p0, p1}, Lcom/google/android/gms/measurement/internal/C5;->Q(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final bridge synthetic p()Lcom/google/android/gms/measurement/internal/x5;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/measurement/internal/f1;->p()Lcom/google/android/gms/measurement/internal/x5;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic q()Lcom/google/android/gms/measurement/internal/C5;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/measurement/internal/f1;->q()Lcom/google/android/gms/measurement/internal/C5;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic r()Lcom/google/android/gms/measurement/internal/w6;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/measurement/internal/f1;->r()Lcom/google/android/gms/measurement/internal/w6;

    move-result-object v0

    return-object v0
.end method

.method protected final t()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final z(Landroid/os/Bundle;)V
    .locals 8

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a4;->j()V

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/I2;->u()V

    new-instance v5, Lcom/google/android/gms/measurement/internal/K;

    invoke-direct {v5, p1}, Lcom/google/android/gms/measurement/internal/K;-><init>(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a4;->a()Lcom/google/android/gms/measurement/internal/l;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/measurement/internal/N;->n1:Lcom/google/android/gms/measurement/internal/q2;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/l;->p(Lcom/google/android/gms/measurement/internal/q2;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/f1;->m()Lcom/google/android/gms/measurement/internal/C2;

    move-result-object v0

    invoke-virtual {v0, v5}, Lcom/google/android/gms/measurement/internal/C2;->C(Lcom/google/android/gms/measurement/internal/K;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    move v4, v0

    goto :goto_0

    :cond_0
    move v4, v1

    :goto_0
    invoke-direct {p0, v1}, Lcom/google/android/gms/measurement/internal/C5;->p0(Z)Lcom/google/android/gms/measurement/internal/t7;

    move-result-object v3

    new-instance v7, Lcom/google/android/gms/measurement/internal/W5;

    const/4 v2, 0x1

    move-object v0, v7

    move-object v1, p0

    move-object v6, p1

    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/measurement/internal/W5;-><init>(Lcom/google/android/gms/measurement/internal/C5;ZLcom/google/android/gms/measurement/internal/t7;ZLcom/google/android/gms/measurement/internal/K;Landroid/os/Bundle;)V

    invoke-direct {p0, v7}, Lcom/google/android/gms/measurement/internal/C5;->Q(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final bridge synthetic zza()Landroid/content/Context;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/measurement/internal/a4;->zza()Landroid/content/Context;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic zzb()Lcom/google/android/gms/common/util/d;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/measurement/internal/a4;->zzb()Lcom/google/android/gms/common/util/d;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic zzd()Lcom/google/android/gms/measurement/internal/e;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/measurement/internal/a4;->zzd()Lcom/google/android/gms/measurement/internal/e;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic zzj()Lcom/google/android/gms/measurement/internal/L2;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/measurement/internal/a4;->zzj()Lcom/google/android/gms/measurement/internal/L2;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic zzl()Lcom/google/android/gms/measurement/internal/s3;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/measurement/internal/a4;->zzl()Lcom/google/android/gms/measurement/internal/s3;

    move-result-object v0

    return-object v0
.end method
