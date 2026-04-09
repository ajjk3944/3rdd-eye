.class public Lcom/google/android/gms/ads/internal/offline/buffering/OfflinePingSender;
.super Landroidx/work/Worker;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final l:Lw82;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V
    .locals 2

    .line 1
    invoke-direct {p0, p1, p2}, Landroidx/work/Worker;-><init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V

    .line 2
    .line 3
    .line 4
    sget-object p2, Lsv1;->f:Lsv1;

    .line 5
    .line 6
    iget-object p2, p2, Lsv1;->b:Lbu1;

    .line 7
    .line 8
    new-instance v0, Ls62;

    .line 9
    .line 10
    invoke-direct {v0}, Ls62;-><init>()V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    new-instance v1, Laj1;

    .line 17
    .line 18
    invoke-direct {v1, p2, p1, v0}, Laj1;-><init>(Lbu1;Landroid/content/Context;Ls62;)V

    .line 19
    .line 20
    .line 21
    const/4 p2, 0x0

    .line 22
    invoke-virtual {v1, p1, p2}, Lzu1;->d(Landroid/content/Context;Z)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    check-cast p1, Lw82;

    .line 27
    .line 28
    iput-object p1, p0, Lcom/google/android/gms/ads/internal/offline/buffering/OfflinePingSender;->l:Lw82;

    .line 29
    .line 30
    return-void
.end method


# virtual methods
.method public final doWork()Lr70;
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/offline/buffering/OfflinePingSender;->l:Lw82;

    .line 2
    .line 3
    invoke-interface {v0}, Lw82;->e()V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lq70;

    .line 7
    .line 8
    sget-object v1, Lim;->c:Lim;

    .line 9
    .line 10
    invoke-direct {v0, v1}, Lq70;-><init>(Lim;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 11
    .line 12
    .line 13
    return-object v0

    .line 14
    :catch_0
    new-instance v0, Lo70;

    .line 15
    .line 16
    invoke-direct {v0}, Lo70;-><init>()V

    .line 17
    .line 18
    .line 19
    return-object v0
.end method
