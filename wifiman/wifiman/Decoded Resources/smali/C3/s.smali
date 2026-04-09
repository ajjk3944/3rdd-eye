.class public final LC3/s;
.super Ls3/g;
.source "SourceFile"


# instance fields
.field private final I:Lo/V;

.field private final J:Lo/V;

.field private final K:Lo/V;

.field private final L:Lo/V;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/os/Looper;Ls3/d;Lcom/google/android/gms/common/api/internal/d;Lcom/google/android/gms/common/api/internal/k;)V
    .locals 7

    const/16 v3, 0x17

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v0 .. v6}, Ls3/g;-><init>(Landroid/content/Context;Landroid/os/Looper;ILs3/d;Lcom/google/android/gms/common/api/internal/d;Lcom/google/android/gms/common/api/internal/k;)V

    new-instance p1, Lo/V;

    invoke-direct {p1}, Lo/V;-><init>()V

    iput-object p1, p0, LC3/s;->I:Lo/V;

    new-instance p1, Lo/V;

    invoke-direct {p1}, Lo/V;-><init>()V

    iput-object p1, p0, LC3/s;->J:Lo/V;

    new-instance p1, Lo/V;

    invoke-direct {p1}, Lo/V;-><init>()V

    iput-object p1, p0, LC3/s;->K:Lo/V;

    new-instance p1, Lo/V;

    invoke-direct {p1}, Lo/V;-><init>()V

    iput-object p1, p0, LC3/s;->L:Lo/V;

    return-void
.end method

.method private final j0(Lr3/d;)Z
    .locals 6

    invoke-virtual {p0}, Ls3/c;->j()[Lr3/d;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    move v2, v1

    :goto_0
    array-length v3, v0

    if-ge v2, v3, :cond_1

    aget-object v3, v0, v2

    invoke-virtual {p1}, Lr3/d;->b()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3}, Lr3/d;->b()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    :goto_1
    if-nez v3, :cond_2

    return v1

    :cond_2
    invoke-virtual {v3}, Lr3/d;->e()J

    move-result-wide v2

    invoke-virtual {p1}, Lr3/d;->e()J

    move-result-wide v4

    cmp-long p1, v2, v4

    if-ltz p1, :cond_3

    const/4 p1, 0x1

    return p1

    :cond_3
    return v1
.end method


# virtual methods
.method protected final C()Ljava/lang/String;
    .locals 1

    const-string v0, "com.google.android.gms.location.internal.IGoogleLocationManagerService"

    return-object v0
.end method

.method protected final D()Ljava/lang/String;
    .locals 1

    const-string v0, "com.google.android.location.internal.GoogleLocationManagerService.START"

    return-object v0
.end method

.method public final K(I)V
    .locals 1

    invoke-super {p0, p1}, Ls3/c;->K(I)V

    iget-object p1, p0, LC3/s;->I:Lo/V;

    monitor-enter p1

    :try_start_0
    iget-object v0, p0, LC3/s;->I:Lo/V;

    invoke-virtual {v0}, Lo/V;->clear()V

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    iget-object v0, p0, LC3/s;->J:Lo/V;

    monitor-enter v0

    :try_start_1
    iget-object p1, p0, LC3/s;->J:Lo/V;

    invoke-virtual {p1}, Lo/V;->clear()V

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    iget-object p1, p0, LC3/s;->K:Lo/V;

    monitor-enter p1

    :try_start_2
    iget-object v0, p0, LC3/s;->K:Lo/V;

    invoke-virtual {v0}, Lo/V;->clear()V

    monitor-exit p1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0

    :catchall_1
    move-exception p1

    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw p1

    :catchall_2
    move-exception v0

    :try_start_4
    monitor-exit p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    throw v0
.end method

.method public final Q()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final h()I
    .locals 1

    const v0, 0xb2c988

    return v0
.end method

.method public final k0(LI3/n;Lcom/google/android/gms/tasks/TaskCompletionSource;)V
    .locals 7

    sget-object v0, LI3/w;->j:Lr3/d;

    invoke-direct {p0, v0}, LC3/s;->j0(Lr3/d;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ls3/c;->B()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, LC3/L;

    new-instance v4, LC3/r;

    invoke-direct {v4, p2}, LC3/r;-><init>(Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    new-instance p2, LC3/u;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v2, 0x5

    const/4 v3, 0x0

    move-object v1, p2

    invoke-direct/range {v1 .. v6}, LC3/u;-><init>(ILandroid/os/IBinder;Landroid/os/IBinder;Landroid/app/PendingIntent;Ljava/lang/String;)V

    invoke-interface {v0, p1, p2}, LC3/L;->F(LI3/n;LC3/u;)V

    return-void

    :cond_0
    invoke-virtual {p0}, Ls3/c;->B()Landroid/os/IInterface;

    move-result-object p1

    check-cast p1, LC3/L;

    invoke-virtual {p0}, Ls3/c;->w()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, LC3/L;->L(Ljava/lang/String;)Lcom/google/android/gms/location/LocationAvailability;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V

    return-void
.end method

.method public final l0(LI3/d;Lcom/google/android/gms/tasks/TaskCompletionSource;)V
    .locals 2

    sget-object v0, LI3/w;->j:Lr3/d;

    invoke-direct {p0, v0}, LC3/s;->j0(Lr3/d;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ls3/c;->B()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, LC3/L;

    new-instance v1, LC3/q;

    invoke-direct {v1, p2}, LC3/q;-><init>(Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    invoke-static {v1}, LC3/u;->b(LC3/P;)LC3/u;

    move-result-object p2

    invoke-interface {v0, p1, p2}, LC3/L;->e0(LI3/d;LC3/u;)V

    return-void

    :cond_0
    sget-object v0, LI3/w;->f:Lr3/d;

    invoke-direct {p0, v0}, LC3/s;->j0(Lr3/d;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Ls3/c;->B()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, LC3/L;

    new-instance v1, LC3/q;

    invoke-direct {v1, p2}, LC3/q;-><init>(Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    invoke-interface {v0, p1, v1}, LC3/L;->R(LI3/d;LC3/P;)V

    return-void

    :cond_1
    invoke-virtual {p0}, Ls3/c;->B()Landroid/os/IInterface;

    move-result-object p1

    check-cast p1, LC3/L;

    invoke-interface {p1}, LC3/L;->zzs()Landroid/location/Location;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V

    return-void
.end method

.method protected final synthetic q(Landroid/os/IBinder;)Landroid/os/IInterface;
    .locals 2

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const-string v0, "com.google.android.gms.location.internal.IGoogleLocationManagerService"

    invoke-interface {p1, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v0

    instance-of v1, v0, LC3/L;

    if-eqz v1, :cond_1

    move-object p1, v0

    check-cast p1, LC3/L;

    goto :goto_0

    :cond_1
    new-instance v0, LC3/K;

    invoke-direct {v0, p1}, LC3/K;-><init>(Landroid/os/IBinder;)V

    move-object p1, v0

    :goto_0
    return-object p1
.end method

.method public final t()[Lr3/d;
    .locals 1

    sget-object v0, LI3/w;->p:[Lr3/d;

    return-object v0
.end method
