.class public final synthetic Llw2;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic f:Lmw2;

.field public final synthetic g:Ljava/lang/Object;

.field public final synthetic h:Lpd2;

.field public final synthetic i:Ljava/lang/String;

.field public final synthetic j:J

.field public final synthetic k:Laa3;


# direct methods
.method public synthetic constructor <init>(JLjava/lang/Object;Ljava/lang/String;Lpd2;Lmw2;Laa3;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p6, p0, Llw2;->f:Lmw2;

    .line 5
    .line 6
    iput-object p3, p0, Llw2;->g:Ljava/lang/Object;

    .line 7
    .line 8
    iput-object p5, p0, Llw2;->h:Lpd2;

    .line 9
    .line 10
    iput-object p4, p0, Llw2;->i:Ljava/lang/String;

    .line 11
    .line 12
    iput-wide p1, p0, Llw2;->j:J

    .line 13
    .line 14
    iput-object p7, p0, Llw2;->k:Laa3;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 10

    .line 1
    iget-object v0, p0, Llw2;->f:Lmw2;

    .line 2
    .line 3
    iget-object v1, p0, Llw2;->g:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v2, p0, Llw2;->h:Lpd2;

    .line 6
    .line 7
    iget-object v3, p0, Llw2;->i:Ljava/lang/String;

    .line 8
    .line 9
    iget-wide v4, p0, Llw2;->j:J

    .line 10
    .line 11
    iget-object v6, p0, Llw2;->k:Laa3;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    monitor-enter v1

    .line 17
    :try_start_0
    iget-object v7, v2, Lpd2;->f:Lwq3;

    .line 18
    .line 19
    invoke-virtual {v7}, Lgp3;->isDone()Z

    .line 20
    .line 21
    .line 22
    move-result v7

    .line 23
    if-nez v7, :cond_0

    .line 24
    .line 25
    const-string v7, "Timeout."

    .line 26
    .line 27
    sget-object v8, Lhg4;->C:Lhg4;

    .line 28
    .line 29
    iget-object v8, v8, Lhg4;->k:Lym;

    .line 30
    .line 31
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 35
    .line 36
    .line 37
    move-result-wide v8

    .line 38
    sub-long/2addr v8, v4

    .line 39
    long-to-int v4, v8

    .line 40
    const/4 v5, 0x0

    .line 41
    invoke-virtual {v0, v3, v4, v7, v5}, Lmw2;->d(Ljava/lang/String;ILjava/lang/String;Z)V

    .line 42
    .line 43
    .line 44
    iget-object v4, v0, Lmw2;->l:Lrv2;

    .line 45
    .line 46
    const-string v7, "timeout"

    .line 47
    .line 48
    invoke-virtual {v4, v3, v7}, Lrv2;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    iget-object v4, v0, Lmw2;->o:Lkp2;

    .line 52
    .line 53
    const-string v7, "timeout"

    .line 54
    .line 55
    invoke-virtual {v4, v3, v7}, Lkp2;->s(Ljava/lang/String;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    iget-object v0, v0, Lmw2;->p:Lea3;

    .line 59
    .line 60
    const-string v3, "Timeout"

    .line 61
    .line 62
    invoke-interface {v6, v3}, Laa3;->m(Ljava/lang/String;)Laa3;

    .line 63
    .line 64
    .line 65
    invoke-interface {v6, v5}, Laa3;->b(Z)Laa3;

    .line 66
    .line 67
    .line 68
    invoke-interface {v6}, Laa3;->n()Lca3;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    invoke-virtual {v0, v3}, Lea3;->b(Lca3;)V

    .line 73
    .line 74
    .line 75
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 76
    .line 77
    invoke-virtual {v2, v0}, Lpd2;->a(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    goto :goto_0

    .line 81
    :catchall_0
    move-exception v0

    .line 82
    goto :goto_1

    .line 83
    :cond_0
    :goto_0
    monitor-exit v1

    .line 84
    return-void

    .line 85
    :goto_1
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 86
    throw v0
.end method
