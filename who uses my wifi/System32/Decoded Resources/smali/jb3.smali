.class public final Ljb3;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final a:Lcom/google/android/gms/ads/internal/ClientApi;

.field public final b:Landroid/content/Context;

.field public final c:I

.field public final d:Lt83;

.field public e:Lae3;

.field public final f:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final g:Lod2;

.field public final h:Lbf2;

.field public final i:Ljava/util/PriorityQueue;

.field public final j:Lkb3;

.field public final k:Ljava/lang/String;

.field public final l:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final m:Ljava/util/concurrent/ScheduledExecutorService;

.field public final n:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final o:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public p:Lsq0;

.field public final q:Lym;

.field public final r:Lqb3;

.field public final synthetic s:I


# direct methods
.method public constructor <init>(Lcom/google/android/gms/ads/internal/ClientApi;Landroid/content/Context;ILt83;Lae3;Lod2;Ljava/util/concurrent/ScheduledExecutorService;Lkb3;Lym;I)V
    .locals 10

    move/from16 v0, p10

    iput v0, p0, Ljb3;->s:I

    .line 1
    const-string v1, "none"

    move-object v0, p0

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    move-object/from16 v9, p9

    invoke-direct/range {v0 .. v9}, Ljb3;-><init>(Ljava/lang/String;Lcom/google/android/gms/ads/internal/ClientApi;Landroid/content/Context;ILt83;Lae3;Ljava/util/concurrent/ScheduledExecutorService;Lkb3;Lym;)V

    move-object/from16 p1, p6

    iput-object p1, p0, Ljb3;->g:Lod2;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/google/android/gms/ads/internal/ClientApi;Landroid/content/Context;ILt83;Lae3;Lbf2;Ljava/util/concurrent/ScheduledExecutorService;Lkb3;Lym;I)V
    .locals 10

    move/from16 v0, p11

    iput v0, p0, Ljb3;->s:I

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v4, p4

    move-object v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p8

    move-object/from16 v8, p9

    move-object/from16 v9, p10

    .line 2
    invoke-direct/range {v0 .. v9}, Ljb3;-><init>(Ljava/lang/String;Lcom/google/android/gms/ads/internal/ClientApi;Landroid/content/Context;ILt83;Lae3;Ljava/util/concurrent/ScheduledExecutorService;Lkb3;Lym;)V

    move-object/from16 p1, p7

    iput-object p1, p0, Ljb3;->h:Lbf2;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/google/android/gms/ads/internal/ClientApi;Landroid/content/Context;ILt83;Lae3;Ljava/util/concurrent/ScheduledExecutorService;Lkb3;Lym;)V
    .locals 1

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ljb3;->k:Ljava/lang/String;

    iput-object p2, p0, Ljb3;->a:Lcom/google/android/gms/ads/internal/ClientApi;

    iput-object p3, p0, Ljb3;->b:Landroid/content/Context;

    iput p4, p0, Ljb3;->c:I

    iput-object p5, p0, Ljb3;->d:Lt83;

    iput-object p6, p0, Ljb3;->e:Lae3;

    iget p2, p6, Lae3;->i:I

    const/4 p3, 0x1

    invoke-static {p3, p2}, Ljava/lang/Math;->max(II)I

    move-result p2

    new-instance p4, Ljava/util/PriorityQueue;

    new-instance p5, Lsb3;

    const/4 v0, 0x0

    .line 4
    invoke-direct {p5, v0, p0}, Lsb3;-><init>(ILjava/lang/Object;)V

    invoke-direct {p4, p2, p5}, Ljava/util/PriorityQueue;-><init>(ILjava/util/Comparator;)V

    iput-object p4, p0, Ljb3;->i:Ljava/util/PriorityQueue;

    new-instance p2, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 5
    invoke-direct {p2, p3}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object p2, p0, Ljb3;->f:Ljava/util/concurrent/atomic/AtomicBoolean;

    new-instance p2, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 p4, 0x0

    .line 6
    invoke-direct {p2, p4}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object p2, p0, Ljb3;->l:Ljava/util/concurrent/atomic/AtomicBoolean;

    iput-object p7, p0, Ljb3;->m:Ljava/util/concurrent/ScheduledExecutorService;

    iput-object p8, p0, Ljb3;->j:Lkb3;

    new-instance p2, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 7
    invoke-direct {p2, p3}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object p2, p0, Ljb3;->n:Ljava/util/concurrent/atomic/AtomicBoolean;

    new-instance p2, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 8
    invoke-direct {p2, p4}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object p2, p0, Ljb3;->o:Ljava/util/concurrent/atomic/AtomicBoolean;

    iput-object p9, p0, Ljb3;->q:Lym;

    new-instance p2, Lpb3;

    .line 9
    iget-object p3, p6, Lae3;->f:Ljava/lang/String;

    iget-object p4, p0, Ljb3;->e:Lae3;

    iget p4, p4, Lae3;->g:I

    .line 10
    invoke-static {p4}, Ls2;->a(I)Ls2;

    move-result-object p4

    invoke-direct {p2, p3, p4}, Lpb3;-><init>(Ljava/lang/String;Ls2;)V

    .line 11
    iput-object p1, p2, Lpb3;->h:Ljava/lang/Object;

    .line 12
    new-instance p1, Lqb3;

    invoke-direct {p1, p2}, Lqb3;-><init>(Lpb3;)V

    iput-object p1, p0, Ljb3;->r:Lqb3;

    return-void
.end method


# virtual methods
.method public final declared-synchronized a(Ljava/lang/Object;)V
    .locals 9

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    new-instance v0, Lrb3;

    .line 3
    .line 4
    iget-object v1, p0, Ljb3;->q:Lym;

    .line 5
    .line 6
    invoke-direct {v0, p1, v1}, Lrb3;-><init>(Ljava/lang/Object;Lym;)V

    .line 7
    .line 8
    .line 9
    iget-object v2, p0, Ljb3;->i:Ljava/util/PriorityQueue;

    .line 10
    .line 11
    invoke-virtual {v2, v0}, Ljava/util/PriorityQueue;->add(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, p1}, Ljb3;->g(Ljava/lang/Object;)Ltx2;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 22
    .line 23
    .line 24
    move-result-wide v2

    .line 25
    iget-object v4, p0, Ljb3;->n:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 26
    .line 27
    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    if-eqz v4, :cond_0

    .line 32
    .line 33
    sget-object v4, Llf4;->l:Li63;

    .line 34
    .line 35
    new-instance v5, Lsz2;

    .line 36
    .line 37
    const/16 v6, 0xb

    .line 38
    .line 39
    const/4 v7, 0x0

    .line 40
    invoke-direct {v5, p0, p1, v6, v7}, Lsz2;-><init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v4, v5}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :catchall_0
    move-exception p1

    .line 48
    goto :goto_1

    .line 49
    :cond_0
    :goto_0
    iget-object v4, p0, Ljb3;->m:Ljava/util/concurrent/ScheduledExecutorService;

    .line 50
    .line 51
    new-instance v5, Lle1;

    .line 52
    .line 53
    invoke-direct {v5, p0, v2, v3, p1}, Lle1;-><init>(Ljb3;JLtx2;)V

    .line 54
    .line 55
    .line 56
    invoke-interface {v4, v5}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 57
    .line 58
    .line 59
    new-instance p1, Ltb3;

    .line 60
    .line 61
    const/4 v2, 0x0

    .line 62
    invoke-direct {p1, p0, v2}, Ltb3;-><init>(Ljb3;I)V

    .line 63
    .line 64
    .line 65
    sget-object v2, Lmz1;->C:Liz1;

    .line 66
    .line 67
    sget-object v3, Ltw1;->e:Ltw1;

    .line 68
    .line 69
    iget-object v3, v3, Ltw1;->c:Lkz1;

    .line 70
    .line 71
    invoke-virtual {v3, v2}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    check-cast v2, Ljava/lang/Long;

    .line 76
    .line 77
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 78
    .line 79
    .line 80
    move-result-wide v2

    .line 81
    const-wide/32 v5, -0xdbba0

    .line 82
    .line 83
    .line 84
    invoke-static {v2, v3, v5, v6}, Ljava/lang/Math;->max(JJ)J

    .line 85
    .line 86
    .line 87
    move-result-wide v2

    .line 88
    const-wide/16 v5, 0x2710

    .line 89
    .line 90
    invoke-static {v2, v3, v5, v6}, Ljava/lang/Math;->min(JJ)J

    .line 91
    .line 92
    .line 93
    move-result-wide v2

    .line 94
    iget-wide v5, v0, Lrb3;->d:J

    .line 95
    .line 96
    add-long/2addr v5, v2

    .line 97
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 101
    .line 102
    .line 103
    move-result-wide v1

    .line 104
    iget-wide v7, v0, Lrb3;->b:J

    .line 105
    .line 106
    sub-long/2addr v1, v7

    .line 107
    sub-long/2addr v5, v1

    .line 108
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 109
    .line 110
    invoke-interface {v4, p1, v5, v6, v0}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 111
    .line 112
    .line 113
    monitor-exit p0

    .line 114
    return-void

    .line 115
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 116
    throw p1
.end method

.method public final declared-synchronized b(Z)V
    .locals 10

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Ljb3;->j:Lkb3;

    .line 3
    .line 4
    invoke-virtual {v0}, Lkb3;->a()Z

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    const-wide/16 v1, 0x1

    .line 11
    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    iget-wide v3, v0, Lkb3;->e:J

    .line 15
    .line 16
    long-to-double v3, v3

    .line 17
    add-double/2addr v3, v3

    .line 18
    double-to-long v3, v3

    .line 19
    iget-wide v5, v0, Lkb3;->b:J

    .line 20
    .line 21
    invoke-static {v3, v4, v5, v6}, Ljava/lang/Math;->min(JJ)J

    .line 22
    .line 23
    .line 24
    move-result-wide v3

    .line 25
    iput-wide v3, v0, Lkb3;->e:J

    .line 26
    .line 27
    iget-wide v3, v0, Lkb3;->c:J

    .line 28
    .line 29
    add-long/2addr v3, v1

    .line 30
    iput-wide v3, v0, Lkb3;->c:J

    .line 31
    .line 32
    :cond_0
    iget-object p1, p0, Ljb3;->m:Ljava/util/concurrent/ScheduledExecutorService;

    .line 33
    .line 34
    new-instance v3, Ltb3;

    .line 35
    .line 36
    const/4 v4, 0x0

    .line 37
    invoke-direct {v3, p0, v4}, Ltb3;-><init>(Ljb3;I)V

    .line 38
    .line 39
    .line 40
    iget-wide v4, v0, Lkb3;->e:J

    .line 41
    .line 42
    long-to-double v4, v4

    .line 43
    const-wide v6, 0x3fc999999999999aL    # 0.2

    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    mul-double/2addr v6, v4

    .line 49
    add-double v8, v4, v6

    .line 50
    .line 51
    double-to-long v8, v8

    .line 52
    sub-double/2addr v4, v6

    .line 53
    double-to-long v4, v4

    .line 54
    sub-long/2addr v8, v4

    .line 55
    add-long/2addr v8, v1

    .line 56
    iget-object v0, v0, Lkb3;->f:Ljava/util/Random;

    .line 57
    .line 58
    invoke-virtual {v0}, Ljava/util/Random;->nextDouble()D

    .line 59
    .line 60
    .line 61
    move-result-wide v0

    .line 62
    long-to-double v6, v8

    .line 63
    mul-double/2addr v0, v6

    .line 64
    double-to-long v0, v0

    .line 65
    add-long/2addr v4, v0

    .line 66
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 67
    .line 68
    invoke-interface {p1, v3, v4, v5, v0}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 69
    .line 70
    .line 71
    monitor-exit p0

    .line 72
    return-void

    .line 73
    :catchall_0
    move-exception p1

    .line 74
    goto :goto_0

    .line 75
    :cond_1
    monitor-exit p0

    .line 76
    return-void

    .line 77
    :goto_0
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 78
    throw p1
.end method

.method public final declared-synchronized c()V
    .locals 8

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Ljb3;->i:Ljava/util/PriorityQueue;

    .line 3
    .line 4
    invoke-virtual {v0}, Ljava/util/PriorityQueue;->iterator()Ljava/util/Iterator;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-eqz v1, :cond_1

    .line 13
    .line 14
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    check-cast v1, Lrb3;

    .line 19
    .line 20
    iget-wide v2, v1, Lrb3;->b:J

    .line 21
    .line 22
    iget-wide v4, v1, Lrb3;->d:J

    .line 23
    .line 24
    iget-object v1, v1, Lrb3;->c:Lym;

    .line 25
    .line 26
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 30
    .line 31
    .line 32
    move-result-wide v6

    .line 33
    add-long/2addr v2, v4

    .line 34
    cmp-long v1, v6, v2

    .line 35
    .line 36
    if-ltz v1, :cond_0

    .line 37
    .line 38
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :catchall_0
    move-exception v0

    .line 43
    goto :goto_1

    .line 44
    :cond_1
    monitor-exit p0

    .line 45
    return-void

    .line 46
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 47
    throw v0
.end method

.method public final declared-synchronized d()V
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Ljb3;->o:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 3
    .line 4
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    iget-object v0, p0, Ljb3;->i:Ljava/util/PriorityQueue;

    .line 11
    .line 12
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    iget-object v0, p0, Ljb3;->o:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, Ljb3;->n:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-eqz v0, :cond_0

    .line 31
    .line 32
    sget-object v0, Llf4;->l:Li63;

    .line 33
    .line 34
    new-instance v1, Ltb3;

    .line 35
    .line 36
    const/4 v2, 0x1

    .line 37
    invoke-direct {v1, p0, v2}, Ltb3;-><init>(Ljb3;I)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :catchall_0
    move-exception v0

    .line 45
    goto :goto_1

    .line 46
    :cond_0
    :goto_0
    iget-object v0, p0, Ljb3;->m:Ljava/util/concurrent/ScheduledExecutorService;

    .line 47
    .line 48
    new-instance v1, Ltb3;

    .line 49
    .line 50
    const/4 v2, 0x2

    .line 51
    invoke-direct {v1, p0, v2}, Ltb3;-><init>(Ljb3;I)V

    .line 52
    .line 53
    .line 54
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 55
    .line 56
    .line 57
    monitor-exit p0

    .line 58
    return-void

    .line 59
    :cond_1
    monitor-exit p0

    .line 60
    return-void

    .line 61
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 62
    throw v0
.end method

.method public final e()Ljava/lang/String;
    .locals 2

    .line 1
    const-string v0, "none"

    .line 2
    .line 3
    iget-object v1, p0, Ljb3;->k:Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x1

    .line 10
    if-eq v1, v0, :cond_0

    .line 11
    .line 12
    const-string v0, "2"

    .line 13
    .line 14
    return-object v0

    .line 15
    :cond_0
    const-string v0, "1"

    .line 16
    .line 17
    return-object v0
.end method

.method public final f(Landroid/content/Context;)Lfp3;
    .locals 7

    .line 1
    iget v0, p0, Ljb3;->s:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ljb3;->d:Lt83;

    .line 7
    .line 8
    iget-object v0, v0, Lt83;->i:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Ljava/util/concurrent/atomic/AtomicReference;

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    check-cast v0, Lu62;

    .line 17
    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    new-instance p1, Lfb3;

    .line 21
    .line 22
    invoke-direct {p1}, Lfb3;-><init>()V

    .line 23
    .line 24
    .line 25
    invoke-static {p1}, Lpu1;->B(Ljava/lang/Throwable;)Lkq3;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    new-instance v1, Loi0;

    .line 31
    .line 32
    invoke-direct {v1, p1}, Loi0;-><init>(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    iget-object p1, p0, Ljb3;->e:Lae3;

    .line 36
    .line 37
    iget-object p1, p1, Lae3;->f:Ljava/lang/String;

    .line 38
    .line 39
    iget v2, p0, Ljb3;->c:I

    .line 40
    .line 41
    iget-object v3, p0, Ljb3;->a:Lcom/google/android/gms/ads/internal/ClientApi;

    .line 42
    .line 43
    invoke-virtual {v3, v1, p1, v0, v2}, Lcom/google/android/gms/ads/internal/ClientApi;->s2(Lu10;Ljava/lang/String;Lu62;I)Lya2;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    if-nez p1, :cond_1

    .line 48
    .line 49
    new-instance p1, Lfb3;

    .line 50
    .line 51
    invoke-direct {p1}, Lfb3;-><init>()V

    .line 52
    .line 53
    .line 54
    invoke-static {p1}, Lpu1;->B(Ljava/lang/Throwable;)Lkq3;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    goto :goto_0

    .line 59
    :cond_1
    new-instance v0, Lwq3;

    .line 60
    .line 61
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 62
    .line 63
    .line 64
    :try_start_0
    iget-object v1, p0, Ljb3;->e:Lae3;

    .line 65
    .line 66
    iget-object v1, v1, Lae3;->h:Lpc4;

    .line 67
    .line 68
    invoke-virtual {p0, v1}, Ljb3;->p(Lpc4;)V

    .line 69
    .line 70
    .line 71
    iget-object v1, p0, Ljb3;->e:Lae3;

    .line 72
    .line 73
    iget-object v1, v1, Lae3;->h:Lpc4;

    .line 74
    .line 75
    new-instance v2, Lvb3;

    .line 76
    .line 77
    move-object v3, p1

    .line 78
    check-cast v3, Lx73;

    .line 79
    .line 80
    invoke-direct {v2, p0, v0, v3}, Lvb3;-><init>(Ljb3;Lwq3;Lx73;)V

    .line 81
    .line 82
    .line 83
    check-cast p1, Lx73;

    .line 84
    .line 85
    invoke-virtual {p1, v1, v2}, Lx73;->q2(Lpc4;Lfb2;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 86
    .line 87
    .line 88
    move-object p1, v0

    .line 89
    goto :goto_0

    .line 90
    :catch_0
    const-string p1, "Failed to load rewarded ad."

    .line 91
    .line 92
    invoke-static {p1}, Lgi2;->i0(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    new-instance p1, Lfb3;

    .line 96
    .line 97
    invoke-direct {p1}, Lfb3;-><init>()V

    .line 98
    .line 99
    .line 100
    invoke-static {p1}, Lpu1;->B(Ljava/lang/Throwable;)Lkq3;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    :goto_0
    return-object p1

    .line 105
    :pswitch_0
    iget-object v0, p0, Ljb3;->d:Lt83;

    .line 106
    .line 107
    iget-object v0, v0, Lt83;->i:Ljava/lang/Object;

    .line 108
    .line 109
    check-cast v0, Ljava/util/concurrent/atomic/AtomicReference;

    .line 110
    .line 111
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    move-object v5, v0

    .line 116
    check-cast v5, Lu62;

    .line 117
    .line 118
    if-nez v5, :cond_2

    .line 119
    .line 120
    new-instance p1, Lfb3;

    .line 121
    .line 122
    invoke-direct {p1}, Lfb3;-><init>()V

    .line 123
    .line 124
    .line 125
    invoke-static {p1}, Lpu1;->B(Ljava/lang/Throwable;)Lkq3;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    goto :goto_1

    .line 130
    :cond_2
    new-instance v2, Loi0;

    .line 131
    .line 132
    invoke-direct {v2, p1}, Loi0;-><init>(Ljava/lang/Object;)V

    .line 133
    .line 134
    .line 135
    new-instance v3, Lxe4;

    .line 136
    .line 137
    invoke-direct {v3}, Lxe4;-><init>()V

    .line 138
    .line 139
    .line 140
    iget-object p1, p0, Ljb3;->e:Lae3;

    .line 141
    .line 142
    iget-object v4, p1, Lae3;->f:Ljava/lang/String;

    .line 143
    .line 144
    iget v6, p0, Ljb3;->c:I

    .line 145
    .line 146
    iget-object v1, p0, Ljb3;->a:Lcom/google/android/gms/ads/internal/ClientApi;

    .line 147
    .line 148
    invoke-virtual/range {v1 .. v6}, Lcom/google/android/gms/ads/internal/ClientApi;->E2(Lu10;Lxe4;Ljava/lang/String;Lu62;I)Lba2;

    .line 149
    .line 150
    .line 151
    move-result-object p1

    .line 152
    if-nez p1, :cond_3

    .line 153
    .line 154
    new-instance p1, Lfb3;

    .line 155
    .line 156
    invoke-direct {p1}, Lfb3;-><init>()V

    .line 157
    .line 158
    .line 159
    invoke-static {p1}, Lpu1;->B(Ljava/lang/Throwable;)Lkq3;

    .line 160
    .line 161
    .line 162
    move-result-object p1

    .line 163
    goto :goto_1

    .line 164
    :cond_3
    new-instance v0, Lwq3;

    .line 165
    .line 166
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 167
    .line 168
    .line 169
    :try_start_1
    iget-object v1, p0, Ljb3;->e:Lae3;

    .line 170
    .line 171
    iget-object v1, v1, Lae3;->h:Lpc4;

    .line 172
    .line 173
    invoke-virtual {p0, v1}, Ljb3;->p(Lpc4;)V

    .line 174
    .line 175
    .line 176
    iget-object v1, p0, Ljb3;->e:Lae3;

    .line 177
    .line 178
    iget-object v1, v1, Lae3;->h:Lpc4;

    .line 179
    .line 180
    new-instance v2, Llb3;

    .line 181
    .line 182
    move-object v3, p1

    .line 183
    check-cast v3, Lw23;

    .line 184
    .line 185
    invoke-direct {v2, p0, v0, v3}, Llb3;-><init>(Ljb3;Lwq3;Lw23;)V

    .line 186
    .line 187
    .line 188
    check-cast p1, Lw23;

    .line 189
    .line 190
    invoke-virtual {p1, v1, v2}, Lw23;->a1(Lpc4;Lp42;)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_1

    .line 191
    .line 192
    .line 193
    move-object p1, v0

    .line 194
    goto :goto_1

    .line 195
    :catch_1
    const/4 p1, 0x5

    .line 196
    invoke-static {p1}, Lgi2;->q0(I)Z

    .line 197
    .line 198
    .line 199
    new-instance p1, Lfb3;

    .line 200
    .line 201
    invoke-direct {p1}, Lfb3;-><init>()V

    .line 202
    .line 203
    .line 204
    invoke-static {p1}, Lpu1;->B(Ljava/lang/Throwable;)Lkq3;

    .line 205
    .line 206
    .line 207
    move-result-object p1

    .line 208
    :goto_1
    return-object p1

    .line 209
    :pswitch_1
    iget-object v0, p0, Ljb3;->d:Lt83;

    .line 210
    .line 211
    iget-object v0, v0, Lt83;->i:Ljava/lang/Object;

    .line 212
    .line 213
    check-cast v0, Ljava/util/concurrent/atomic/AtomicReference;

    .line 214
    .line 215
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object v0

    .line 219
    move-object v5, v0

    .line 220
    check-cast v5, Lu62;

    .line 221
    .line 222
    if-nez v5, :cond_4

    .line 223
    .line 224
    new-instance p1, Lfb3;

    .line 225
    .line 226
    invoke-direct {p1}, Lfb3;-><init>()V

    .line 227
    .line 228
    .line 229
    invoke-static {p1}, Lpu1;->B(Ljava/lang/Throwable;)Lkq3;

    .line 230
    .line 231
    .line 232
    move-result-object p1

    .line 233
    goto :goto_2

    .line 234
    :cond_4
    new-instance v2, Loi0;

    .line 235
    .line 236
    invoke-direct {v2, p1}, Loi0;-><init>(Ljava/lang/Object;)V

    .line 237
    .line 238
    .line 239
    invoke-static {}, Lxe4;->b()Lxe4;

    .line 240
    .line 241
    .line 242
    move-result-object v3

    .line 243
    iget-object p1, p0, Ljb3;->e:Lae3;

    .line 244
    .line 245
    iget-object v4, p1, Lae3;->f:Ljava/lang/String;

    .line 246
    .line 247
    iget v6, p0, Ljb3;->c:I

    .line 248
    .line 249
    iget-object v1, p0, Ljb3;->a:Lcom/google/android/gms/ads/internal/ClientApi;

    .line 250
    .line 251
    invoke-virtual/range {v1 .. v6}, Lcom/google/android/gms/ads/internal/ClientApi;->Y2(Lu10;Lxe4;Ljava/lang/String;Lu62;I)Lba2;

    .line 252
    .line 253
    .line 254
    move-result-object p1

    .line 255
    if-nez p1, :cond_5

    .line 256
    .line 257
    new-instance p1, Lfb3;

    .line 258
    .line 259
    invoke-direct {p1}, Lfb3;-><init>()V

    .line 260
    .line 261
    .line 262
    invoke-static {p1}, Lpu1;->B(Ljava/lang/Throwable;)Lkq3;

    .line 263
    .line 264
    .line 265
    move-result-object p1

    .line 266
    goto :goto_2

    .line 267
    :cond_5
    new-instance v0, Lwq3;

    .line 268
    .line 269
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 270
    .line 271
    .line 272
    :try_start_2
    iget-object v1, p0, Ljb3;->e:Lae3;

    .line 273
    .line 274
    iget-object v1, v1, Lae3;->h:Lpc4;

    .line 275
    .line 276
    invoke-virtual {p0, v1}, Ljb3;->p(Lpc4;)V

    .line 277
    .line 278
    .line 279
    iget-object v1, p0, Ljb3;->e:Lae3;

    .line 280
    .line 281
    new-instance v2, Lib3;

    .line 282
    .line 283
    invoke-direct {v2, p0, v0, v1}, Lib3;-><init>(Ljb3;Lwq3;Lae3;)V

    .line 284
    .line 285
    .line 286
    check-cast p1, Ly63;

    .line 287
    .line 288
    invoke-virtual {p1, v2}, Ly63;->K2(Lnw1;)V

    .line 289
    .line 290
    .line 291
    iget-object v1, p0, Ljb3;->e:Lae3;

    .line 292
    .line 293
    iget-object v1, v1, Lae3;->h:Lpc4;

    .line 294
    .line 295
    invoke-virtual {p1, v1}, Ly63;->Z(Lpc4;)Z
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_2

    .line 296
    .line 297
    .line 298
    move-object p1, v0

    .line 299
    goto :goto_2

    .line 300
    :catch_2
    const/4 p1, 0x5

    .line 301
    invoke-static {p1}, Lgi2;->q0(I)Z

    .line 302
    .line 303
    .line 304
    new-instance p1, Lfb3;

    .line 305
    .line 306
    invoke-direct {p1}, Lfb3;-><init>()V

    .line 307
    .line 308
    .line 309
    invoke-static {p1}, Lpu1;->B(Ljava/lang/Throwable;)Lkq3;

    .line 310
    .line 311
    .line 312
    move-result-object p1

    .line 313
    :goto_2
    return-object p1

    .line 314
    nop

    .line 315
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final g(Ljava/lang/Object;)Ltx2;
    .locals 1

    .line 1
    iget v0, p0, Ljb3;->s:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lya2;

    .line 7
    .line 8
    :try_start_0
    invoke-interface {p1}, Lya2;->n()Ltx2;

    .line 9
    .line 10
    .line 11
    move-result-object p1
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    goto :goto_0

    .line 13
    :catch_0
    const/4 p1, 0x3

    .line 14
    invoke-static {p1}, Lgi2;->q0(I)Z

    .line 15
    .line 16
    .line 17
    const/4 p1, 0x0

    .line 18
    :goto_0
    return-object p1

    .line 19
    :pswitch_0
    check-cast p1, Lba2;

    .line 20
    .line 21
    :try_start_1
    invoke-interface {p1}, Lba2;->N()Ltx2;

    .line 22
    .line 23
    .line 24
    move-result-object p1
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_1

    .line 25
    goto :goto_1

    .line 26
    :catch_1
    const/4 p1, 0x3

    .line 27
    invoke-static {p1}, Lgi2;->q0(I)Z

    .line 28
    .line 29
    .line 30
    const/4 p1, 0x0

    .line 31
    :goto_1
    return-object p1

    .line 32
    :pswitch_1
    check-cast p1, Lkw1;

    .line 33
    .line 34
    :try_start_2
    invoke-interface {p1}, Lkw1;->e()Ltx2;

    .line 35
    .line 36
    .line 37
    move-result-object p1
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_2

    .line 38
    goto :goto_2

    .line 39
    :catch_2
    const/4 p1, 0x3

    .line 40
    invoke-static {p1}, Lgi2;->q0(I)Z

    .line 41
    .line 42
    .line 43
    const/4 p1, 0x0

    .line 44
    :goto_2
    return-object p1

    .line 45
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final declared-synchronized h()Z
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    sget-object v0, Lmz1;->H:Liz1;

    .line 3
    .line 4
    sget-object v1, Ltw1;->e:Ltw1;

    .line 5
    .line 6
    iget-object v1, v1, Ltw1;->c:Lkz1;

    .line 7
    .line 8
    invoke-virtual {v1, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Ljava/lang/Boolean;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    iget-object v0, p0, Ljb3;->j:Lkb3;

    .line 21
    .line 22
    iget-wide v1, v0, Lkb3;->a:J

    .line 23
    .line 24
    iput-wide v1, v0, Lkb3;->e:J

    .line 25
    .line 26
    const-wide/16 v1, 0x0

    .line 27
    .line 28
    iput-wide v1, v0, Lkb3;->c:J

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :catchall_0
    move-exception v0

    .line 32
    goto :goto_1

    .line 33
    :cond_0
    :goto_0
    invoke-virtual {p0}, Ljb3;->c()V

    .line 34
    .line 35
    .line 36
    iget-object v0, p0, Ljb3;->i:Ljava/util/PriorityQueue;

    .line 37
    .line 38
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 39
    .line 40
    .line 41
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 42
    monitor-exit p0

    .line 43
    if-nez v0, :cond_1

    .line 44
    .line 45
    const/4 v0, 0x1

    .line 46
    return v0

    .line 47
    :cond_1
    const/4 v0, 0x0

    .line 48
    return v0

    .line 49
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 50
    throw v0
.end method

.method public final declared-synchronized i()Ljava/lang/Object;
    .locals 15

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Ljb3;->j:Lkb3;

    .line 3
    .line 4
    iget-wide v1, v0, Lkb3;->a:J

    .line 5
    .line 6
    iput-wide v1, v0, Lkb3;->e:J

    .line 7
    .line 8
    const-wide/16 v1, 0x0

    .line 9
    .line 10
    iput-wide v1, v0, Lkb3;->c:J

    .line 11
    .line 12
    iget-object v0, p0, Ljb3;->i:Ljava/util/PriorityQueue;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/util/PriorityQueue;->poll()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    check-cast v1, Lrb3;

    .line 19
    .line 20
    iget-object v2, p0, Ljb3;->o:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 21
    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    const/4 v3, 0x1

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 v3, 0x0

    .line 27
    :goto_0
    invoke-virtual {v2, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 28
    .line 29
    .line 30
    const/4 v2, 0x0

    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    if-nez v3, :cond_3

    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/util/PriorityQueue;->peek()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    check-cast v0, Lrb3;

    .line 44
    .line 45
    iget-object v3, p0, Ljb3;->e:Lae3;

    .line 46
    .line 47
    iget v3, v3, Lae3;->g:I

    .line 48
    .line 49
    invoke-static {v3}, Ls2;->a(I)Ls2;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    iget-object v4, v1, Lrb3;->a:Ljava/lang/Object;

    .line 54
    .line 55
    invoke-virtual {p0, v4}, Ljb3;->g(Ljava/lang/Object;)Ltx2;

    .line 56
    .line 57
    .line 58
    move-result-object v4

    .line 59
    instance-of v5, v4, Lrm2;

    .line 60
    .line 61
    if-nez v5, :cond_1

    .line 62
    .line 63
    move-object v12, v2

    .line 64
    goto :goto_1

    .line 65
    :cond_1
    check-cast v4, Lrm2;

    .line 66
    .line 67
    iget-object v4, v4, Lrm2;->i:Ljava/lang/String;

    .line 68
    .line 69
    move-object v12, v4

    .line 70
    :goto_1
    if-eqz v0, :cond_3

    .line 71
    .line 72
    if-eqz v3, :cond_3

    .line 73
    .line 74
    if-eqz v12, :cond_3

    .line 75
    .line 76
    iget-wide v3, v0, Lrb3;->b:J

    .line 77
    .line 78
    iget-wide v5, v1, Lrb3;->b:J

    .line 79
    .line 80
    cmp-long v0, v3, v5

    .line 81
    .line 82
    if-gez v0, :cond_3

    .line 83
    .line 84
    iget-object v5, p0, Ljb3;->p:Lsq0;

    .line 85
    .line 86
    iget-object v0, p0, Ljb3;->q:Lym;

    .line 87
    .line 88
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 92
    .line 93
    .line 94
    move-result-wide v8

    .line 95
    iget-object v0, p0, Ljb3;->e:Lae3;

    .line 96
    .line 97
    iget v10, v0, Lae3;->i:I

    .line 98
    .line 99
    invoke-virtual {p0}, Ljb3;->m()I

    .line 100
    .line 101
    .line 102
    move-result v11

    .line 103
    iget-object v13, p0, Ljb3;->r:Lqb3;

    .line 104
    .line 105
    invoke-virtual {p0}, Ljb3;->e()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v14

    .line 109
    const-string v6, "poll_ad"

    .line 110
    .line 111
    const-string v7, "psvroc_ts"

    .line 112
    .line 113
    invoke-virtual/range {v5 .. v14}, Lsq0;->z(Ljava/lang/String;Ljava/lang/String;JIILjava/lang/String;Lqb3;Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    goto :goto_2

    .line 117
    :catchall_0
    move-exception v0

    .line 118
    goto :goto_3

    .line 119
    :cond_2
    move-object v1, v2

    .line 120
    :cond_3
    :goto_2
    invoke-virtual {p0}, Ljb3;->n()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 121
    .line 122
    .line 123
    if-nez v1, :cond_4

    .line 124
    .line 125
    monitor-exit p0

    .line 126
    return-object v2

    .line 127
    :cond_4
    :try_start_1
    iget-object v0, v1, Lrb3;->a:Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 128
    .line 129
    monitor-exit p0

    .line 130
    return-object v0

    .line 131
    :goto_3
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 132
    throw v0
.end method

.method public final declared-synchronized j()V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Ljb3;->f:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 3
    .line 4
    const/4 v1, 0x1

    .line 5
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Ljb3;->n:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 11
    .line 12
    .line 13
    new-instance v0, Ltb3;

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    invoke-direct {v0, p0, v1}, Ltb3;-><init>(Ljb3;I)V

    .line 17
    .line 18
    .line 19
    iget-object v1, p0, Ljb3;->m:Ljava/util/concurrent/ScheduledExecutorService;

    .line 20
    .line 21
    invoke-interface {v1, v0}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    .line 23
    .line 24
    monitor-exit p0

    .line 25
    return-void

    .line 26
    :catchall_0
    move-exception v0

    .line 27
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 28
    throw v0
.end method

.method public final declared-synchronized k()Ljava/lang/String;
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    monitor-enter p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    :try_start_1
    iget-object v0, p0, Ljb3;->i:Ljava/util/PriorityQueue;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/PriorityQueue;->peek()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Lrb3;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 15
    move-object v0, v1

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    :try_start_3
    iget-object v0, v0, Lrb3;->a:Ljava/lang/Object;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 18
    .line 19
    :try_start_4
    monitor-exit p0

    .line 20
    :goto_0
    if-nez v0, :cond_1

    .line 21
    .line 22
    move-object v0, v1

    .line 23
    goto :goto_1

    .line 24
    :cond_1
    invoke-virtual {p0, v0}, Ljb3;->g(Ljava/lang/Object;)Ltx2;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    :goto_1
    instance-of v2, v0, Lrm2;

    .line 29
    .line 30
    if-nez v2, :cond_2

    .line 31
    .line 32
    goto :goto_2

    .line 33
    :cond_2
    check-cast v0, Lrm2;

    .line 34
    .line 35
    iget-object v1, v0, Lrm2;->i:Ljava/lang/String;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 36
    .line 37
    :goto_2
    monitor-exit p0

    .line 38
    return-object v1

    .line 39
    :catchall_0
    move-exception v0

    .line 40
    goto :goto_3

    .line 41
    :catchall_1
    move-exception v0

    .line 42
    :try_start_5
    monitor-exit p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 43
    :try_start_6
    throw v0

    .line 44
    :goto_3
    monitor-exit p0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 45
    throw v0
.end method

.method public final declared-synchronized l(I)V
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    const/4 v0, 0x5

    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-lt p1, v0, :cond_0

    .line 6
    .line 7
    move v0, v2

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move v0, v1

    .line 10
    :goto_0
    :try_start_0
    invoke-static {v0}, Lou1;->f(Z)V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Ljb3;->j:Lkb3;

    .line 14
    .line 15
    monitor-enter v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 16
    if-lez p1, :cond_1

    .line 17
    .line 18
    move v1, v2

    .line 19
    :cond_1
    :try_start_1
    invoke-static {v1}, Lou1;->f(Z)V

    .line 20
    .line 21
    .line 22
    int-to-long v1, p1

    .line 23
    iput-wide v1, v0, Lkb3;->d:J
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 24
    .line 25
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 26
    monitor-exit p0

    .line 27
    return-void

    .line 28
    :catchall_0
    move-exception p1

    .line 29
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 30
    :try_start_4
    throw p1

    .line 31
    :catchall_1
    move-exception p1

    .line 32
    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 33
    throw p1
.end method

.method public final declared-synchronized m()I
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Ljb3;->i:Ljava/util/PriorityQueue;

    .line 3
    .line 4
    invoke-virtual {v0}, Ljava/util/PriorityQueue;->size()I

    .line 5
    .line 6
    .line 7
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    monitor-exit p0

    .line 9
    return v0

    .line 10
    :catchall_0
    move-exception v0

    .line 11
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 12
    throw v0
.end method

.method public final declared-synchronized n()V
    .locals 5

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-virtual {p0}, Ljb3;->c()V

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Ljb3;->d()V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Ljb3;->l:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-nez v0, :cond_2

    .line 15
    .line 16
    iget-object v0, p0, Ljb3;->f:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_2

    .line 23
    .line 24
    iget-object v0, p0, Ljb3;->i:Ljava/util/PriorityQueue;

    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/util/PriorityQueue;->size()I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    iget-object v1, p0, Ljb3;->e:Lae3;

    .line 31
    .line 32
    iget v1, v1, Lae3;->i:I

    .line 33
    .line 34
    if-lt v0, v1, :cond_0

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_0
    iget-object v0, p0, Ljb3;->l:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 38
    .line 39
    const/4 v1, 0x1

    .line 40
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 41
    .line 42
    .line 43
    sget-object v0, Lhg4;->C:Lhg4;

    .line 44
    .line 45
    iget-object v0, v0, Lhg4;->g:Lwy0;

    .line 46
    .line 47
    invoke-virtual {v0}, Lwy0;->i()Landroid/app/Activity;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    if-nez v0, :cond_1

    .line 52
    .line 53
    iget-object v0, p0, Ljb3;->e:Lae3;

    .line 54
    .line 55
    iget-object v0, v0, Lae3;->f:Ljava/lang/String;

    .line 56
    .line 57
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    const-string v1, "Empty activity context at preloading: "

    .line 62
    .line 63
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    invoke-static {v0}, Lgi2;->i0(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    iget-object v0, p0, Ljb3;->b:Landroid/content/Context;

    .line 71
    .line 72
    invoke-virtual {p0, v0}, Ljb3;->f(Landroid/content/Context;)Lfp3;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    goto :goto_0

    .line 77
    :catchall_0
    move-exception v0

    .line 78
    goto :goto_2

    .line 79
    :cond_1
    invoke-virtual {p0, v0}, Ljb3;->f(Landroid/content/Context;)Lfp3;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    :goto_0
    new-instance v1, Lf20;

    .line 84
    .line 85
    const/16 v2, 0x1b

    .line 86
    .line 87
    invoke-direct {v1, v2, p0}, Lf20;-><init>(ILjava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    iget-object v2, p0, Ljb3;->m:Ljava/util/concurrent/ScheduledExecutorService;

    .line 91
    .line 92
    new-instance v3, Ljq3;

    .line 93
    .line 94
    const/4 v4, 0x0

    .line 95
    invoke-direct {v3, v0, v1, v4}, Ljq3;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v0, v3, v2}, Lgp3;->c(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 99
    .line 100
    .line 101
    monitor-exit p0

    .line 102
    return-void

    .line 103
    :cond_2
    :goto_1
    monitor-exit p0

    .line 104
    return-void

    .line 105
    :goto_2
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 106
    throw v0
.end method

.method public final o(I)V
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    if-lez p1, :cond_0

    .line 3
    .line 4
    const/4 v1, 0x1

    .line 5
    goto :goto_0

    .line 6
    :cond_0
    move v1, v0

    .line 7
    :goto_0
    invoke-static {v1}, Lou1;->f(Z)V

    .line 8
    .line 9
    .line 10
    iget-object v1, p0, Ljb3;->e:Lae3;

    .line 11
    .line 12
    iget v1, v1, Lae3;->g:I

    .line 13
    .line 14
    invoke-static {v1}, Ls2;->a(I)Ls2;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    iget-object v2, p0, Ljb3;->e:Lae3;

    .line 19
    .line 20
    iget v2, v2, Lae3;->i:I

    .line 21
    .line 22
    monitor-enter p0

    .line 23
    :try_start_0
    iget-object v3, p0, Ljb3;->e:Lae3;

    .line 24
    .line 25
    new-instance v4, Lae3;

    .line 26
    .line 27
    iget-object v5, v3, Lae3;->f:Ljava/lang/String;

    .line 28
    .line 29
    iget v6, v3, Lae3;->g:I

    .line 30
    .line 31
    iget-object v7, v3, Lae3;->h:Lpc4;

    .line 32
    .line 33
    if-lez p1, :cond_1

    .line 34
    .line 35
    move v3, p1

    .line 36
    goto :goto_1

    .line 37
    :cond_1
    iget v3, v3, Lae3;->i:I

    .line 38
    .line 39
    :goto_1
    invoke-direct {v4, v5, v6, v7, v3}, Lae3;-><init>(Ljava/lang/String;ILpc4;I)V

    .line 40
    .line 41
    .line 42
    iput-object v4, p0, Ljb3;->e:Lae3;

    .line 43
    .line 44
    iget-object v3, p0, Ljb3;->i:Ljava/util/PriorityQueue;

    .line 45
    .line 46
    invoke-virtual {v3}, Ljava/util/PriorityQueue;->size()I

    .line 47
    .line 48
    .line 49
    move-result v4

    .line 50
    if-le v4, p1, :cond_4

    .line 51
    .line 52
    sget-object v4, Lmz1;->w:Liz1;

    .line 53
    .line 54
    sget-object v5, Ltw1;->e:Ltw1;

    .line 55
    .line 56
    iget-object v5, v5, Ltw1;->c:Lkz1;

    .line 57
    .line 58
    invoke-virtual {v5, v4}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    check-cast v4, Ljava/lang/Boolean;

    .line 63
    .line 64
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 65
    .line 66
    .line 67
    move-result v4

    .line 68
    if-eqz v4, :cond_4

    .line 69
    .line 70
    new-instance v4, Ljava/util/ArrayList;

    .line 71
    .line 72
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 73
    .line 74
    .line 75
    :goto_2
    if-ge v0, p1, :cond_3

    .line 76
    .line 77
    invoke-virtual {v3}, Ljava/util/PriorityQueue;->poll()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v5

    .line 81
    check-cast v5, Lrb3;

    .line 82
    .line 83
    if-eqz v5, :cond_2

    .line 84
    .line 85
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    goto :goto_3

    .line 89
    :catchall_0
    move-exception p1

    .line 90
    goto :goto_4

    .line 91
    :cond_2
    :goto_3
    add-int/lit8 v0, v0, 0x1

    .line 92
    .line 93
    goto :goto_2

    .line 94
    :cond_3
    invoke-virtual {v3}, Ljava/util/PriorityQueue;->clear()V

    .line 95
    .line 96
    .line 97
    invoke-interface {v3, v4}, Ljava/util/Collection;->addAll(Ljava/util/Collection;)Z

    .line 98
    .line 99
    .line 100
    :cond_4
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 101
    iget-object v0, p0, Ljb3;->p:Lsq0;

    .line 102
    .line 103
    if-eqz v0, :cond_5

    .line 104
    .line 105
    if-eqz v1, :cond_5

    .line 106
    .line 107
    iget-object v3, p0, Ljb3;->q:Lym;

    .line 108
    .line 109
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 113
    .line 114
    .line 115
    move-result-wide v3

    .line 116
    iget-object v5, p0, Ljb3;->e:Lae3;

    .line 117
    .line 118
    iget-object v5, v5, Lae3;->f:Ljava/lang/String;

    .line 119
    .line 120
    iget-object v0, v0, Lsq0;->g:Ljava/lang/Object;

    .line 121
    .line 122
    check-cast v0, Lmv2;

    .line 123
    .line 124
    invoke-virtual {v0}, Lmv2;->a()Llv2;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    const-string v6, "action"

    .line 129
    .line 130
    const-string v7, "cache_resize"

    .line 131
    .line 132
    invoke-virtual {v0, v6, v7}, Llv2;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    const-string v6, "cs_ts"

    .line 136
    .line 137
    invoke-static {v3, v4}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v3

    .line 141
    invoke-virtual {v0, v6, v3}, Llv2;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    const-string v3, "orig_ma"

    .line 145
    .line 146
    invoke-static {v2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object v2

    .line 150
    invoke-virtual {v0, v3, v2}, Llv2;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    const-string v2, "max_ads"

    .line 154
    .line 155
    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object p1

    .line 159
    invoke-virtual {v0, v2, p1}, Llv2;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 160
    .line 161
    .line 162
    const-string p1, "ad_format"

    .line 163
    .line 164
    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v1

    .line 168
    sget-object v2, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 169
    .line 170
    invoke-virtual {v1, v2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object v1

    .line 174
    invoke-virtual {v0, p1, v1}, Llv2;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 175
    .line 176
    .line 177
    const-string p1, "ad_unit_id"

    .line 178
    .line 179
    invoke-virtual {v0, p1, v5}, Llv2;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    const-string p1, "pid"

    .line 183
    .line 184
    const/4 v1, 0x0

    .line 185
    invoke-virtual {v0, p1, v1}, Llv2;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 186
    .line 187
    .line 188
    const-string p1, "pv"

    .line 189
    .line 190
    const-string v1, "1"

    .line 191
    .line 192
    invoke-virtual {v0, p1, v1}, Llv2;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 193
    .line 194
    .line 195
    invoke-virtual {v0}, Llv2;->m()V

    .line 196
    .line 197
    .line 198
    :cond_5
    return-void

    .line 199
    :goto_4
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 200
    throw p1
.end method

.method public final p(Lpc4;)V
    .locals 2

    .line 1
    sget-object v0, Lmz1;->B:Liz1;

    .line 2
    .line 3
    sget-object v1, Ltw1;->e:Ltw1;

    .line 4
    .line 5
    iget-object v1, v1, Ltw1;->c:Lkz1;

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Ljava/lang/Boolean;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    iget-object p1, p1, Lpc4;->G:Landroid/os/Bundle;

    .line 20
    .line 21
    invoke-virtual {p0}, Ljb3;->m()I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    const-string v1, "plcs"

    .line 26
    .line 27
    invoke-virtual {p1, v1, v0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 28
    .line 29
    .line 30
    iget-object v0, p0, Ljb3;->e:Lae3;

    .line 31
    .line 32
    iget v0, v0, Lae3;->i:I

    .line 33
    .line 34
    const-string v1, "plbs"

    .line 35
    .line 36
    invoke-virtual {p1, v1, v0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 37
    .line 38
    .line 39
    iget-object v0, p0, Ljb3;->k:Ljava/lang/String;

    .line 40
    .line 41
    const-string v1, "plid"

    .line 42
    .line 43
    invoke-virtual {p1, v1, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    :cond_0
    return-void
.end method

.method public final q(Lnx2;)V
    .locals 10

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Ljb3;->n:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 3
    .line 4
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    sget-object v0, Llf4;->l:Li63;

    .line 11
    .line 12
    new-instance v1, Lsz2;

    .line 13
    .line 14
    const/16 v2, 0xc

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    invoke-direct {v1, p0, p1, v2, v3}, Lsz2;-><init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :catchall_0
    move-exception v0

    .line 25
    move-object p1, v0

    .line 26
    goto/16 :goto_1

    .line 27
    .line 28
    :cond_0
    :goto_0
    iget-object v0, p0, Ljb3;->l:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 29
    .line 30
    const/4 v1, 0x0

    .line 31
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 32
    .line 33
    .line 34
    iget v0, p1, Lnx2;->f:I

    .line 35
    .line 36
    const/4 v2, 0x1

    .line 37
    if-eq v0, v2, :cond_1

    .line 38
    .line 39
    const/16 v3, 0x8

    .line 40
    .line 41
    if-eq v0, v3, :cond_1

    .line 42
    .line 43
    const/16 v3, 0xa

    .line 44
    .line 45
    if-eq v0, v3, :cond_1

    .line 46
    .line 47
    const/16 v3, 0xb

    .line 48
    .line 49
    if-eq v0, v3, :cond_1

    .line 50
    .line 51
    invoke-virtual {p0, v2}, Ljb3;->b(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 52
    .line 53
    .line 54
    monitor-exit p0

    .line 55
    return-void

    .line 56
    :cond_1
    :try_start_1
    iget-object v0, p0, Ljb3;->e:Lae3;

    .line 57
    .line 58
    iget v2, v0, Lae3;->g:I

    .line 59
    .line 60
    iget-object v0, v0, Lae3;->f:Ljava/lang/String;

    .line 61
    .line 62
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 67
    .line 68
    .line 69
    move-result v3

    .line 70
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v4

    .line 74
    add-int/lit8 v3, v3, 0x1a

    .line 75
    .line 76
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 77
    .line 78
    .line 79
    move-result v4

    .line 80
    add-int/2addr v3, v4

    .line 81
    new-instance v4, Ljava/lang/StringBuilder;

    .line 82
    .line 83
    add-int/lit8 v3, v3, 0x3d

    .line 84
    .line 85
    invoke-direct {v4, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 86
    .line 87
    .line 88
    const-string v3, "Preloading "

    .line 89
    .line 90
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    const-string v2, ", for adUnitId:"

    .line 97
    .line 98
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    const-string v0, ", Ad load failed. Stop preloading due to non-retriable error:"

    .line 105
    .line 106
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    invoke-static {v0}, Lgi2;->f0(Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    iget-object v0, p0, Ljb3;->f:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 117
    .line 118
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 119
    .line 120
    .line 121
    new-instance v0, Lpb3;

    .line 122
    .line 123
    iget-object v1, p0, Ljb3;->e:Lae3;

    .line 124
    .line 125
    iget-object v2, v1, Lae3;->f:Ljava/lang/String;

    .line 126
    .line 127
    iget v1, v1, Lae3;->g:I

    .line 128
    .line 129
    invoke-static {v1}, Ls2;->a(I)Ls2;

    .line 130
    .line 131
    .line 132
    move-result-object v1

    .line 133
    invoke-direct {v0, v2, v1}, Lpb3;-><init>(Ljava/lang/String;Ls2;)V

    .line 134
    .line 135
    .line 136
    iget-object v1, p0, Ljb3;->k:Ljava/lang/String;

    .line 137
    .line 138
    iput-object v1, v0, Lpb3;->h:Ljava/lang/Object;

    .line 139
    .line 140
    new-instance v5, Lqb3;

    .line 141
    .line 142
    invoke-direct {v5, v0}, Lqb3;-><init>(Lpb3;)V

    .line 143
    .line 144
    .line 145
    iget-object v2, p0, Ljb3;->p:Lsq0;

    .line 146
    .line 147
    iget-object v0, p0, Ljb3;->q:Lym;

    .line 148
    .line 149
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 150
    .line 151
    .line 152
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 153
    .line 154
    .line 155
    move-result-wide v3

    .line 156
    iget-object v0, p0, Ljb3;->e:Lae3;

    .line 157
    .line 158
    iget v7, v0, Lae3;->i:I

    .line 159
    .line 160
    invoke-virtual {p0}, Ljb3;->m()I

    .line 161
    .line 162
    .line 163
    move-result v8

    .line 164
    invoke-virtual {p0}, Ljb3;->e()Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v9

    .line 168
    move-object v6, p1

    .line 169
    invoke-virtual/range {v2 .. v9}, Lsq0;->x(JLqb3;Lnx2;IILjava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 170
    .line 171
    .line 172
    monitor-exit p0

    .line 173
    return-void

    .line 174
    :goto_1
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 175
    throw p1
.end method
