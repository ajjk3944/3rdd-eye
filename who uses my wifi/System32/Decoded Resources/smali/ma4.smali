.class public final synthetic Lma4;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic f:Landroid/content/Context;

.field public final synthetic g:Z

.field public final synthetic h:Lya4;

.field public final synthetic i:Lxd4;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;ZLya4;Lxd4;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lma4;->f:Landroid/content/Context;

    .line 5
    .line 6
    iput-boolean p2, p0, Lma4;->g:Z

    .line 7
    .line 8
    iput-object p3, p0, Lma4;->h:Lya4;

    .line 9
    .line 10
    iput-object p4, p0, Lma4;->i:Lxd4;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget-object v0, p0, Lma4;->f:Landroid/content/Context;

    .line 2
    .line 3
    const-string v1, "media_metrics"

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-static {v1}, Llb;->i(Ljava/lang/Object;)Landroid/media/metrics/MediaMetricsManager;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    const/4 v2, 0x0

    .line 14
    if-nez v1, :cond_0

    .line 15
    .line 16
    move-object v3, v2

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    new-instance v3, Lrd4;

    .line 19
    .line 20
    invoke-static {v1}, Lpd4;->f(Landroid/media/metrics/MediaMetricsManager;)Landroid/media/metrics/PlaybackSession;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-direct {v3, v0, v1}, Lrd4;-><init>(Landroid/content/Context;Landroid/media/metrics/PlaybackSession;)V

    .line 25
    .line 26
    .line 27
    :goto_0
    if-nez v3, :cond_1

    .line 28
    .line 29
    const-string v0, "MediaMetricsService unavailable."

    .line 30
    .line 31
    invoke-static {v0}, La30;->x(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :cond_1
    iget-boolean v0, p0, Lma4;->g:Z

    .line 36
    .line 37
    if-eqz v0, :cond_2

    .line 38
    .line 39
    iget-object v0, p0, Lma4;->h:Lya4;

    .line 40
    .line 41
    invoke-virtual {v0, v3}, Lya4;->V1(Lbd4;)V

    .line 42
    .line 43
    .line 44
    :cond_2
    iget-object v0, p0, Lma4;->i:Lxd4;

    .line 45
    .line 46
    iget-object v1, v3, Lrd4;->i:Landroid/media/metrics/PlaybackSession;

    .line 47
    .line 48
    invoke-static {v1}, Lpd4;->a(Landroid/media/metrics/PlaybackSession;)Landroid/media/metrics/LogSessionId;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    monitor-enter v0

    .line 53
    :try_start_0
    iget-object v3, v0, Lxd4;->b:Lx34;

    .line 54
    .line 55
    if-eqz v3, :cond_3

    .line 56
    .line 57
    iget-object v2, v3, Lx34;->f:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v2, Landroid/media/metrics/LogSessionId;

    .line 60
    .line 61
    invoke-static {}, Lqd4;->d()Landroid/media/metrics/LogSessionId;

    .line 62
    .line 63
    .line 64
    invoke-static {v2}, Lqd4;->y(Landroid/media/metrics/LogSessionId;)Z

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    invoke-static {v2}, Lzt0;->b0(Z)V

    .line 69
    .line 70
    .line 71
    iput-object v1, v3, Lx34;->f:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 72
    .line 73
    monitor-exit v0

    .line 74
    return-void

    .line 75
    :catchall_0
    move-exception v1

    .line 76
    goto :goto_1

    .line 77
    :cond_3
    :try_start_1
    throw v2

    .line 78
    :goto_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 79
    throw v1
.end method
