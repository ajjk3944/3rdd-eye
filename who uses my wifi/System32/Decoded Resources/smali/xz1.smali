.class public final Lxz1;
.super Ltl;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final b:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public c:Landroid/content/Context;

.field public d:Lmv2;

.field public e:Lmc2;

.field public f:Lsl;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lxz1;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final a(Lsl;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lxz1;->f:Lsl;

    .line 2
    .line 3
    :try_start_0
    iget-object v0, p1, Lsl;->a:Lp10;

    .line 4
    .line 5
    check-cast v0, Ln10;

    .line 6
    .line 7
    invoke-virtual {v0}, Ln10;->X0()Z
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 8
    .line 9
    .line 10
    :catch_0
    new-instance v0, Lwz1;

    .line 11
    .line 12
    invoke-direct {v0, p0}, Lwz1;-><init>(Lxz1;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1, v0}, Lsl;->b(Lil;)Lmc2;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    iput-object p1, p0, Lxz1;->e:Lmc2;

    .line 20
    .line 21
    return-void
.end method

.method public final onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    iput-object p1, p0, Lxz1;->f:Lsl;

    .line 3
    .line 4
    iput-object p1, p0, Lxz1;->e:Lmc2;

    .line 5
    .line 6
    return-void
.end method
