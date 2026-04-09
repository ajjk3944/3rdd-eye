.class public final Lx52;
.super Le6;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final c:Ljava/lang/Object;

.field public final d:Lb62;

.field public e:Z


# direct methods
.method public constructor <init>(Lb62;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Le6;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/Object;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lx52;->c:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p1, p0, Lx52;->d:Lb62;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final w()V
    .locals 4

    .line 1
    const-string v0, "release: Trying to acquire lock"

    .line 2
    .line 3
    invoke-static {v0}, Lgi2;->G(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lx52;->c:Ljava/lang/Object;

    .line 7
    .line 8
    monitor-enter v0

    .line 9
    :try_start_0
    const-string v1, "release: Lock acquired"

    .line 10
    .line 11
    invoke-static {v1}, Lgi2;->G(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    iget-boolean v1, p0, Lx52;->e:Z

    .line 15
    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    const-string v1, "release: Lock already released"

    .line 19
    .line 20
    invoke-static {v1}, Lgi2;->G(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    monitor-exit v0

    .line 24
    return-void

    .line 25
    :catchall_0
    move-exception v1

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const/4 v1, 0x1

    .line 28
    iput-boolean v1, p0, Lx52;->e:Z

    .line 29
    .line 30
    new-instance v1, Lus0;

    .line 31
    .line 32
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 33
    .line 34
    .line 35
    new-instance v2, Lsd2;

    .line 36
    .line 37
    const/4 v3, 0x0

    .line 38
    invoke-direct {v2, v3}, Lsd2;-><init>(I)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0, v1, v2}, Le6;->t(Ltd2;Lrd2;)V

    .line 42
    .line 43
    .line 44
    new-instance v1, Lzs1;

    .line 45
    .line 46
    invoke-direct {v1, p0}, Lzs1;-><init>(Lx52;)V

    .line 47
    .line 48
    .line 49
    new-instance v2, Lf23;

    .line 50
    .line 51
    invoke-direct {v2, p0}, Lf23;-><init>(Lx52;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0, v1, v2}, Le6;->t(Ltd2;Lrd2;)V

    .line 55
    .line 56
    .line 57
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 58
    const-string v0, "release: Lock released"

    .line 59
    .line 60
    invoke-static {v0}, Lgi2;->G(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    return-void

    .line 64
    :goto_0
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 65
    throw v1
.end method
