.class public final Lsj0;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# static fields
.field public static final c:Lrj0;

.field public static final d:Lqj0;


# instance fields
.field public final a:Lnf0;

.field public final b:Lou0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lrj0;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lsj0;->c:Lrj0;

    .line 7
    .line 8
    new-instance v0, Lqj0;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lsj0;->d:Lqj0;

    .line 14
    .line 15
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lnf0;

    .line 5
    .line 6
    invoke-direct {v0}, Lnf0;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lsj0;->a:Lnf0;

    .line 10
    .line 11
    new-instance v0, Lou0;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lsj0;->b:Lou0;

    .line 17
    .line 18
    sget-object v0, Lsj0;->d:Lqj0;

    .line 19
    .line 20
    invoke-virtual {p0, v0}, Lsj0;->a(Lyc0;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public final a(Lyc0;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lsj0;->a:Lnf0;

    .line 2
    .line 3
    iget-object v1, v0, Lnf0;->a:Ljava/lang/Object;

    .line 4
    .line 5
    monitor-enter v1

    .line 6
    :try_start_0
    iget-object v2, v0, Lnf0;->f:Ljava/lang/Object;

    .line 7
    .line 8
    sget-object v3, Lnf0;->k:Ljava/lang/Object;

    .line 9
    .line 10
    if-ne v2, v3, :cond_0

    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v2, 0x0

    .line 15
    :goto_0
    iput-object p1, v0, Lnf0;->f:Ljava/lang/Object;

    .line 16
    .line 17
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 18
    if-nez v2, :cond_1

    .line 19
    .line 20
    goto :goto_4

    .line 21
    :cond_1
    invoke-static {}, Lj8;->T()Lj8;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    iget-object v0, v0, Lnf0;->j:La9;

    .line 26
    .line 27
    iget-object v1, v1, Lj8;->D:Lwn;

    .line 28
    .line 29
    iget-object v2, v1, Lwn;->F:Landroid/os/Handler;

    .line 30
    .line 31
    if-nez v2, :cond_3

    .line 32
    .line 33
    iget-object v2, v1, Lwn;->D:Ljava/lang/Object;

    .line 34
    .line 35
    monitor-enter v2

    .line 36
    :try_start_1
    iget-object v3, v1, Lwn;->F:Landroid/os/Handler;

    .line 37
    .line 38
    if-nez v3, :cond_2

    .line 39
    .line 40
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    invoke-static {v3}, Lwn;->T(Landroid/os/Looper;)Landroid/os/Handler;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    iput-object v3, v1, Lwn;->F:Landroid/os/Handler;

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :catchall_0
    move-exception p1

    .line 52
    goto :goto_2

    .line 53
    :cond_2
    :goto_1
    monitor-exit v2

    .line 54
    goto :goto_3

    .line 55
    :goto_2
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 56
    throw p1

    .line 57
    :cond_3
    :goto_3
    iget-object v1, v1, Lwn;->F:Landroid/os/Handler;

    .line 58
    .line 59
    invoke-virtual {v1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 60
    .line 61
    .line 62
    :goto_4
    instance-of v0, p1, Lrj0;

    .line 63
    .line 64
    if-eqz v0, :cond_4

    .line 65
    .line 66
    iget-object v0, p0, Lsj0;->b:Lou0;

    .line 67
    .line 68
    check-cast p1, Lrj0;

    .line 69
    .line 70
    invoke-virtual {v0, p1}, Lou0;->i(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    return-void

    .line 74
    :cond_4
    instance-of v0, p1, Lpj0;

    .line 75
    .line 76
    if-eqz v0, :cond_5

    .line 77
    .line 78
    check-cast p1, Lpj0;

    .line 79
    .line 80
    iget-object v0, p0, Lsj0;->b:Lou0;

    .line 81
    .line 82
    iget-object p1, p1, Lpj0;->n:Ljava/lang/Throwable;

    .line 83
    .line 84
    invoke-virtual {v0, p1}, Lou0;->j(Ljava/lang/Throwable;)Z

    .line 85
    .line 86
    .line 87
    :cond_5
    return-void

    .line 88
    :catchall_1
    move-exception p1

    .line 89
    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 90
    throw p1
.end method
