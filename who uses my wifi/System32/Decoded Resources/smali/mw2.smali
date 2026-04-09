.class public final Lmw2;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public a:Z

.field public b:Z

.field public c:Z

.field public final d:J

.field public final e:Lpd2;

.field public final f:Landroid/content/Context;

.field public final g:Ljava/lang/ref/WeakReference;

.field public final h:Lyu2;

.field public final i:Ljava/util/concurrent/Executor;

.field public final j:Ljava/util/concurrent/Executor;

.field public final k:Ljava/util/concurrent/ScheduledExecutorService;

.field public final l:Lrv2;

.field public final m:Le51;

.field public final n:Ljava/util/concurrent/ConcurrentHashMap;

.field public final o:Lkp2;

.field public final p:Lea3;

.field public q:Z


# direct methods
.method public constructor <init>(Ljava/util/concurrent/Executor;Landroid/content/Context;Ljava/lang/ref/WeakReference;Lld2;Lyu2;Ljava/util/concurrent/ScheduledExecutorService;Lrv2;Le51;Lkp2;Lea3;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lmw2;->a:Z

    .line 6
    .line 7
    iput-boolean v0, p0, Lmw2;->b:Z

    .line 8
    .line 9
    iput-boolean v0, p0, Lmw2;->c:Z

    .line 10
    .line 11
    new-instance v1, Lpd2;

    .line 12
    .line 13
    invoke-direct {v1}, Lpd2;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v1, p0, Lmw2;->e:Lpd2;

    .line 17
    .line 18
    new-instance v1, Ljava/util/concurrent/ConcurrentHashMap;

    .line 19
    .line 20
    invoke-direct {v1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v1, p0, Lmw2;->n:Ljava/util/concurrent/ConcurrentHashMap;

    .line 24
    .line 25
    const/4 v1, 0x1

    .line 26
    iput-boolean v1, p0, Lmw2;->q:Z

    .line 27
    .line 28
    iput-object p5, p0, Lmw2;->h:Lyu2;

    .line 29
    .line 30
    iput-object p2, p0, Lmw2;->f:Landroid/content/Context;

    .line 31
    .line 32
    iput-object p3, p0, Lmw2;->g:Ljava/lang/ref/WeakReference;

    .line 33
    .line 34
    iput-object p4, p0, Lmw2;->i:Ljava/util/concurrent/Executor;

    .line 35
    .line 36
    iput-object p6, p0, Lmw2;->k:Ljava/util/concurrent/ScheduledExecutorService;

    .line 37
    .line 38
    iput-object p1, p0, Lmw2;->j:Ljava/util/concurrent/Executor;

    .line 39
    .line 40
    iput-object p7, p0, Lmw2;->l:Lrv2;

    .line 41
    .line 42
    iput-object p8, p0, Lmw2;->m:Le51;

    .line 43
    .line 44
    iput-object p9, p0, Lmw2;->o:Lkp2;

    .line 45
    .line 46
    iput-object p10, p0, Lmw2;->p:Lea3;

    .line 47
    .line 48
    sget-object p1, Lhg4;->C:Lhg4;

    .line 49
    .line 50
    iget-object p1, p1, Lhg4;->k:Lym;

    .line 51
    .line 52
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 56
    .line 57
    .line 58
    move-result-wide p1

    .line 59
    iput-wide p1, p0, Lmw2;->d:J

    .line 60
    .line 61
    const-string p1, ""

    .line 62
    .line 63
    const-string p2, "com.google.android.gms.ads.MobileAds"

    .line 64
    .line 65
    invoke-virtual {p0, p2, v0, p1, v0}, Lmw2;->d(Ljava/lang/String;ILjava/lang/String;Z)V

    .line 66
    .line 67
    .line 68
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 7

    .line 1
    sget-object v0, Lc12;->a:Lso1;

    .line 2
    .line 3
    invoke-virtual {v0}, Lso1;->w()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v1, 0x1

    .line 14
    if-nez v0, :cond_2

    .line 15
    .line 16
    iget-object v0, p0, Lmw2;->m:Le51;

    .line 17
    .line 18
    iget v0, v0, Le51;->h:I

    .line 19
    .line 20
    sget-object v2, Lmz1;->V1:Liz1;

    .line 21
    .line 22
    sget-object v3, Ltw1;->e:Ltw1;

    .line 23
    .line 24
    iget-object v4, v3, Ltw1;->c:Lkz1;

    .line 25
    .line 26
    invoke-virtual {v4, v2}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    check-cast v2, Ljava/lang/Integer;

    .line 31
    .line 32
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    if-lt v0, v2, :cond_2

    .line 37
    .line 38
    iget-boolean v0, p0, Lmw2;->q:Z

    .line 39
    .line 40
    if-nez v0, :cond_0

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_0
    iget-boolean v0, p0, Lmw2;->a:Z

    .line 44
    .line 45
    if-nez v0, :cond_3

    .line 46
    .line 47
    monitor-enter p0

    .line 48
    :try_start_0
    iget-boolean v0, p0, Lmw2;->a:Z

    .line 49
    .line 50
    if-eqz v0, :cond_1

    .line 51
    .line 52
    monitor-exit p0

    .line 53
    return-void

    .line 54
    :catchall_0
    move-exception v0

    .line 55
    goto :goto_0

    .line 56
    :cond_1
    iget-object v0, p0, Lmw2;->l:Lrv2;

    .line 57
    .line 58
    invoke-virtual {v0}, Lrv2;->d()V

    .line 59
    .line 60
    .line 61
    iget-object v0, p0, Lmw2;->o:Lkp2;

    .line 62
    .line 63
    invoke-virtual {v0}, Lkp2;->b()V

    .line 64
    .line 65
    .line 66
    iget-object v0, p0, Lmw2;->e:Lpd2;

    .line 67
    .line 68
    new-instance v2, Lkw2;

    .line 69
    .line 70
    const/4 v4, 0x0

    .line 71
    invoke-direct {v2, p0, v4}, Lkw2;-><init>(Lmw2;I)V

    .line 72
    .line 73
    .line 74
    iget-object v4, p0, Lmw2;->i:Ljava/util/concurrent/Executor;

    .line 75
    .line 76
    iget-object v0, v0, Lpd2;->f:Lwq3;

    .line 77
    .line 78
    invoke-virtual {v0, v2, v4}, Lgp3;->c(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 79
    .line 80
    .line 81
    iput-boolean v1, p0, Lmw2;->a:Z

    .line 82
    .line 83
    invoke-virtual {p0}, Lmw2;->c()Ln70;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    iget-object v1, p0, Lmw2;->k:Ljava/util/concurrent/ScheduledExecutorService;

    .line 88
    .line 89
    new-instance v2, Lkw2;

    .line 90
    .line 91
    const/4 v5, 0x1

    .line 92
    invoke-direct {v2, p0, v5}, Lkw2;-><init>(Lmw2;I)V

    .line 93
    .line 94
    .line 95
    sget-object v5, Lmz1;->X1:Liz1;

    .line 96
    .line 97
    iget-object v3, v3, Ltw1;->c:Lkz1;

    .line 98
    .line 99
    invoke-virtual {v3, v5}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v3

    .line 103
    check-cast v3, Ljava/lang/Long;

    .line 104
    .line 105
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 106
    .line 107
    .line 108
    move-result-wide v5

    .line 109
    sget-object v3, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 110
    .line 111
    invoke-interface {v1, v2, v5, v6, v3}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 112
    .line 113
    .line 114
    new-instance v1, Lug0;

    .line 115
    .line 116
    invoke-direct {v1, p0}, Lug0;-><init>(Lmw2;)V

    .line 117
    .line 118
    .line 119
    new-instance v2, Ljq3;

    .line 120
    .line 121
    const/4 v3, 0x0

    .line 122
    invoke-direct {v2, v0, v1, v3}, Ljq3;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 123
    .line 124
    .line 125
    invoke-interface {v0, v2, v4}, Ln70;->c(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 126
    .line 127
    .line 128
    monitor-exit p0

    .line 129
    return-void

    .line 130
    :goto_0
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 131
    throw v0

    .line 132
    :cond_2
    :goto_1
    iget-boolean v0, p0, Lmw2;->a:Z

    .line 133
    .line 134
    if-nez v0, :cond_3

    .line 135
    .line 136
    const-string v0, ""

    .line 137
    .line 138
    const-string v2, "com.google.android.gms.ads.MobileAds"

    .line 139
    .line 140
    const/4 v3, 0x0

    .line 141
    invoke-virtual {p0, v2, v3, v0, v1}, Lmw2;->d(Ljava/lang/String;ILjava/lang/String;Z)V

    .line 142
    .line 143
    .line 144
    iget-object v0, p0, Lmw2;->e:Lpd2;

    .line 145
    .line 146
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 147
    .line 148
    invoke-virtual {v0, v2}, Lpd2;->a(Ljava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    iput-boolean v1, p0, Lmw2;->a:Z

    .line 152
    .line 153
    iput-boolean v1, p0, Lmw2;->b:Z

    .line 154
    .line 155
    :cond_3
    return-void
.end method

.method public final b()Ljava/util/ArrayList;
    .locals 8

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lmw2;->n:Ljava/util/concurrent/ConcurrentHashMap;

    .line 7
    .line 8
    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentHashMap;->keySet()Ljava/util/Set;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    if-eqz v3, :cond_0

    .line 21
    .line 22
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    check-cast v3, Ljava/lang/String;

    .line 27
    .line 28
    invoke-virtual {v1, v3}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    check-cast v4, Lw42;

    .line 33
    .line 34
    new-instance v5, Lw42;

    .line 35
    .line 36
    iget-boolean v6, v4, Lw42;->g:Z

    .line 37
    .line 38
    iget v7, v4, Lw42;->h:I

    .line 39
    .line 40
    iget-object v4, v4, Lw42;->i:Ljava/lang/String;

    .line 41
    .line 42
    invoke-direct {v5, v3, v7, v4, v6}, Lw42;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_0
    return-object v0
.end method

.method public final declared-synchronized c()Ln70;
    .locals 4

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    sget-object v0, Lhg4;->C:Lhg4;

    .line 3
    .line 4
    iget-object v1, v0, Lhg4;->h:Lgd2;

    .line 5
    .line 6
    invoke-virtual {v1}, Lgd2;->g()Lra4;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v1}, Lra4;->m()Led2;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    iget-object v1, v1, Led2;->e:Ljava/lang/String;

    .line 15
    .line 16
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-nez v2, :cond_0

    .line 21
    .line 22
    invoke-static {v1}, Lpu1;->r(Ljava/lang/Object;)Llq3;

    .line 23
    .line 24
    .line 25
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    monitor-exit p0

    .line 27
    return-object v0

    .line 28
    :catchall_0
    move-exception v0

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    :try_start_1
    new-instance v1, Lpd2;

    .line 31
    .line 32
    invoke-direct {v1}, Lpd2;-><init>()V

    .line 33
    .line 34
    .line 35
    iget-object v0, v0, Lhg4;->h:Lgd2;

    .line 36
    .line 37
    invoke-virtual {v0}, Lgd2;->g()Lra4;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    new-instance v2, Ln62;

    .line 42
    .line 43
    const/16 v3, 0x17

    .line 44
    .line 45
    invoke-direct {v2, p0, v1, v3}, Ln62;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 46
    .line 47
    .line 48
    iget-object v0, v0, Lra4;->c:Ljava/util/ArrayList;

    .line 49
    .line 50
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 51
    .line 52
    .line 53
    monitor-exit p0

    .line 54
    return-object v1

    .line 55
    :goto_0
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 56
    throw v0
.end method

.method public final d(Ljava/lang/String;ILjava/lang/String;Z)V
    .locals 1

    .line 1
    new-instance v0, Lw42;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2, p3, p4}, Lw42;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    .line 4
    .line 5
    .line 6
    iget-object p2, p0, Lmw2;->n:Ljava/util/concurrent/ConcurrentHashMap;

    .line 7
    .line 8
    invoke-virtual {p2, p1, v0}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    return-void
.end method
