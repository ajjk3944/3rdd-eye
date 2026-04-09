.class public final Lxj2;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lov1;
.implements Len2;
.implements Lye4;
.implements Ldn2;


# instance fields
.field public final f:Lqj2;

.field public final g:Lrj2;

.field public final h:Ljava/util/HashSet;

.field public final i:Lp62;

.field public final j:Ljava/util/concurrent/Executor;

.field public final k:Lym;

.field public final l:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final m:Lwj2;

.field public n:Z

.field public o:Ljava/lang/ref/WeakReference;


# direct methods
.method public constructor <init>(Ll62;Lrj2;Ljava/util/concurrent/Executor;Lqj2;Lym;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/HashSet;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lxj2;->h:Ljava/util/HashSet;

    .line 10
    .line 11
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Lxj2;->l:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 18
    .line 19
    new-instance v0, Lwj2;

    .line 20
    .line 21
    invoke-direct {v0}, Lwj2;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object v0, p0, Lxj2;->m:Lwj2;

    .line 25
    .line 26
    iput-boolean v1, p0, Lxj2;->n:Z

    .line 27
    .line 28
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 29
    .line 30
    invoke-direct {v0, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    iput-object v0, p0, Lxj2;->o:Ljava/lang/ref/WeakReference;

    .line 34
    .line 35
    iput-object p4, p0, Lxj2;->f:Lqj2;

    .line 36
    .line 37
    sget-object p4, Lh62;->a:Ljava/nio/charset/Charset;

    .line 38
    .line 39
    invoke-virtual {p1}, Ll62;->a()V

    .line 40
    .line 41
    .line 42
    new-instance p4, Lp62;

    .line 43
    .line 44
    iget-object p1, p1, Ll62;->b:Ln70;

    .line 45
    .line 46
    invoke-direct {p4, v1, p1}, Lp62;-><init>(ILn70;)V

    .line 47
    .line 48
    .line 49
    iput-object p4, p0, Lxj2;->i:Lp62;

    .line 50
    .line 51
    iput-object p2, p0, Lxj2;->g:Lrj2;

    .line 52
    .line 53
    iput-object p3, p0, Lxj2;->j:Ljava/util/concurrent/Executor;

    .line 54
    .line 55
    iput-object p5, p0, Lxj2;->k:Lym;

    .line 56
    .line 57
    return-void
.end method


# virtual methods
.method public final declared-synchronized B1()V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lxj2;->m:Lwj2;

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    iput-boolean v1, v0, Lwj2;->b:Z

    .line 6
    .line 7
    invoke-virtual {p0}, Lxj2;->i()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    .line 9
    .line 10
    monitor-exit p0

    .line 11
    return-void

    .line 12
    :catchall_0
    move-exception v0

    .line 13
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 14
    throw v0
.end method

.method public final declared-synchronized D0()V
    .locals 8

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lxj2;->l:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    const/4 v2, 0x1

    .line 6
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, Lxj2;->f:Lqj2;

    .line 13
    .line 14
    iget-object v1, v0, Lqj2;->b:Ll62;

    .line 15
    .line 16
    const-string v2, "/updateActiveView"

    .line 17
    .line 18
    iget-object v3, v0, Lqj2;->e:Lpj2;

    .line 19
    .line 20
    invoke-virtual {v1}, Ll62;->a()V

    .line 21
    .line 22
    .line 23
    iget-object v4, v1, Ll62;->b:Ln70;

    .line 24
    .line 25
    new-instance v5, Lz02;

    .line 26
    .line 27
    const/4 v6, 0x1

    .line 28
    invoke-direct {v5, v2, v3, v6}, Lz02;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 29
    .line 30
    .line 31
    sget-object v2, Lmd2;->g:Lld2;

    .line 32
    .line 33
    invoke-static {v4, v5, v2}, Lpu1;->O(Ln70;Lyp3;Ljava/util/concurrent/Executor;)Lqp3;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    iput-object v3, v1, Ll62;->b:Ln70;

    .line 38
    .line 39
    const-string v3, "/untrackActiveViewUnit"

    .line 40
    .line 41
    iget-object v4, v0, Lqj2;->f:Lpj2;

    .line 42
    .line 43
    invoke-virtual {v1}, Ll62;->a()V

    .line 44
    .line 45
    .line 46
    iget-object v5, v1, Ll62;->b:Ln70;

    .line 47
    .line 48
    new-instance v6, Lz02;

    .line 49
    .line 50
    const/4 v7, 0x1

    .line 51
    invoke-direct {v6, v3, v4, v7}, Lz02;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 52
    .line 53
    .line 54
    invoke-static {v5, v6, v2}, Lpu1;->O(Ln70;Lyp3;Ljava/util/concurrent/Executor;)Lqp3;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    iput-object v2, v1, Ll62;->b:Ln70;

    .line 59
    .line 60
    iput-object p0, v0, Lqj2;->d:Lxj2;

    .line 61
    .line 62
    invoke-virtual {p0}, Lxj2;->i()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 63
    .line 64
    .line 65
    monitor-exit p0

    .line 66
    return-void

    .line 67
    :catchall_0
    move-exception v0

    .line 68
    goto :goto_0

    .line 69
    :cond_0
    monitor-exit p0

    .line 70
    return-void

    .line 71
    :goto_0
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 72
    throw v0
.end method

.method public final E1()V
    .locals 0

    .line 1
    return-void
.end method

.method public final G1(I)V
    .locals 0

    .line 1
    return-void
.end method

.method public final M1()V
    .locals 0

    .line 1
    return-void
.end method

.method public final R2()V
    .locals 0

    .line 1
    return-void
.end method

.method public final declared-synchronized S0(Lnv1;)V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lxj2;->m:Lwj2;

    .line 3
    .line 4
    iget-boolean v1, p1, Lnv1;->j:Z

    .line 5
    .line 6
    iput-boolean v1, v0, Lwj2;->a:Z

    .line 7
    .line 8
    iput-object p1, v0, Lwj2;->e:Lnv1;

    .line 9
    .line 10
    invoke-virtual {p0}, Lxj2;->i()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    .line 12
    .line 13
    monitor-exit p0

    .line 14
    return-void

    .line 15
    :catchall_0
    move-exception p1

    .line 16
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 17
    throw p1
.end method

.method public final declared-synchronized U()V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lxj2;->m:Lwj2;

    .line 3
    .line 4
    const/4 v1, 0x1

    .line 5
    iput-boolean v1, v0, Lwj2;->b:Z

    .line 6
    .line 7
    invoke-virtual {p0}, Lxj2;->i()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    .line 9
    .line 10
    monitor-exit p0

    .line 11
    return-void

    .line 12
    :catchall_0
    move-exception v0

    .line 13
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 14
    throw v0
.end method

.method public final Y()V
    .locals 0

    .line 1
    return-void
.end method

.method public final a()V
    .locals 8

    .line 1
    iget-object v0, p0, Lxj2;->h:Ljava/util/HashSet;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const-string v2, "/untrackActiveViewUnit"

    .line 12
    .line 13
    const-string v3, "/updateActiveView"

    .line 14
    .line 15
    iget-object v4, p0, Lxj2;->f:Lqj2;

    .line 16
    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    check-cast v1, Lag2;

    .line 24
    .line 25
    iget-object v5, v4, Lqj2;->e:Lpj2;

    .line 26
    .line 27
    invoke-interface {v1, v3, v5}, Lag2;->f1(Ljava/lang/String;Ly32;)V

    .line 28
    .line 29
    .line 30
    iget-object v3, v4, Lqj2;->f:Lpj2;

    .line 31
    .line 32
    invoke-interface {v1, v2, v3}, Lag2;->f1(Ljava/lang/String;Ly32;)V

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    iget-object v0, v4, Lqj2;->b:Ll62;

    .line 37
    .line 38
    iget-object v1, v4, Lqj2;->e:Lpj2;

    .line 39
    .line 40
    iget-object v5, v0, Ll62;->b:Ln70;

    .line 41
    .line 42
    new-instance v6, Ldn1;

    .line 43
    .line 44
    const/4 v7, 0x1

    .line 45
    invoke-direct {v6, v3, v1, v7}, Ldn1;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 46
    .line 47
    .line 48
    sget-object v1, Lmd2;->g:Lld2;

    .line 49
    .line 50
    invoke-static {v5, v6, v1}, Lpu1;->P(Ln70;Lzk3;Ljava/util/concurrent/Executor;)Lrp3;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    iput-object v3, v0, Ll62;->b:Ln70;

    .line 55
    .line 56
    iget-object v4, v4, Lqj2;->f:Lpj2;

    .line 57
    .line 58
    new-instance v5, Ldn1;

    .line 59
    .line 60
    const/4 v6, 0x1

    .line 61
    invoke-direct {v5, v2, v4, v6}, Ldn1;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 62
    .line 63
    .line 64
    invoke-static {v3, v5, v1}, Lpu1;->P(Ln70;Lzk3;Ljava/util/concurrent/Executor;)Lrp3;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    iput-object v1, v0, Ll62;->b:Ln70;

    .line 69
    .line 70
    return-void
.end method

.method public final f()V
    .locals 0

    .line 1
    return-void
.end method

.method public final f3()V
    .locals 0

    .line 1
    return-void
.end method

.method public final declared-synchronized h(Landroid/content/Context;)V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object p1, p0, Lxj2;->m:Lwj2;

    .line 3
    .line 4
    const-string v0, "u"

    .line 5
    .line 6
    iput-object v0, p1, Lwj2;->d:Ljava/lang/String;

    .line 7
    .line 8
    invoke-virtual {p0}, Lxj2;->i()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lxj2;->a()V

    .line 12
    .line 13
    .line 14
    const/4 p1, 0x1

    .line 15
    iput-boolean p1, p0, Lxj2;->n:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    .line 17
    monitor-exit p0

    .line 18
    return-void

    .line 19
    :catchall_0
    move-exception p1

    .line 20
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 21
    throw p1
.end method

.method public final h3()V
    .locals 0

    .line 1
    return-void
.end method

.method public final declared-synchronized i()V
    .locals 5

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lxj2;->o:Ljava/lang/ref/WeakReference;

    .line 3
    .line 4
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    if-eqz v0, :cond_2

    .line 9
    .line 10
    iget-boolean v0, p0, Lxj2;->n:Z

    .line 11
    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    iget-object v0, p0, Lxj2;->l:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 17
    .line 18
    .line 19
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    :try_start_1
    iget-object v0, p0, Lxj2;->m:Lwj2;

    .line 23
    .line 24
    iget-object v1, p0, Lxj2;->k:Lym;

    .line 25
    .line 26
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 30
    .line 31
    .line 32
    move-result-wide v1

    .line 33
    iput-wide v1, v0, Lwj2;->c:J

    .line 34
    .line 35
    iget-object v1, p0, Lxj2;->g:Lrj2;

    .line 36
    .line 37
    invoke-virtual {v1, v0}, Lrj2;->a(Lwj2;)Lorg/json/JSONObject;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    iget-object v1, p0, Lxj2;->h:Ljava/util/HashSet;

    .line 42
    .line 43
    invoke-virtual {v1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    if-eqz v2, :cond_0

    .line 52
    .line 53
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    check-cast v2, Lag2;

    .line 58
    .line 59
    iget-object v3, p0, Lxj2;->j:Ljava/util/concurrent/Executor;

    .line 60
    .line 61
    new-instance v4, Ltj2;

    .line 62
    .line 63
    invoke-direct {v4, v0, v2}, Ltj2;-><init>(Lorg/json/JSONObject;Lag2;)V

    .line 64
    .line 65
    .line 66
    invoke-interface {v3, v4}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 67
    .line 68
    .line 69
    goto :goto_0

    .line 70
    :catchall_0
    move-exception v0

    .line 71
    goto :goto_1

    .line 72
    :cond_0
    iget-object v1, p0, Lxj2;->i:Lp62;

    .line 73
    .line 74
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    new-instance v2, Lz02;

    .line 78
    .line 79
    const/4 v3, 0x2

    .line 80
    invoke-direct {v2, v1, v0, v3}, Lz02;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 81
    .line 82
    .line 83
    iget-object v0, v1, Lp62;->b:Ln70;

    .line 84
    .line 85
    sget-object v1, Lmd2;->g:Lld2;

    .line 86
    .line 87
    invoke-static {v0, v2, v1}, Lpu1;->O(Ln70;Lyp3;Ljava/util/concurrent/Executor;)Lqp3;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    const-string v2, "ActiveViewListener.callActiveViewJs"

    .line 92
    .line 93
    new-instance v3, Lbs3;

    .line 94
    .line 95
    const/4 v4, 0x2

    .line 96
    invoke-direct {v3, v2, v4}, Lbs3;-><init>(Ljava/lang/String;I)V

    .line 97
    .line 98
    .line 99
    new-instance v2, Ljq3;

    .line 100
    .line 101
    const/4 v4, 0x0

    .line 102
    invoke-direct {v2, v0, v3, v4}, Ljq3;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v0, v2, v1}, Lgp3;->c(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 106
    .line 107
    .line 108
    monitor-exit p0

    .line 109
    return-void

    .line 110
    :catch_0
    :try_start_2
    invoke-static {}, Lgi2;->R()Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 111
    .line 112
    .line 113
    monitor-exit p0

    .line 114
    return-void

    .line 115
    :cond_1
    monitor-exit p0

    .line 116
    return-void

    .line 117
    :cond_2
    :try_start_3
    monitor-enter p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 118
    :try_start_4
    invoke-virtual {p0}, Lxj2;->a()V

    .line 119
    .line 120
    .line 121
    const/4 v0, 0x1

    .line 122
    iput-boolean v0, p0, Lxj2;->n:Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 123
    .line 124
    :try_start_5
    monitor-exit p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 125
    monitor-exit p0

    .line 126
    return-void

    .line 127
    :catchall_1
    move-exception v0

    .line 128
    :try_start_6
    monitor-exit p0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 129
    :try_start_7
    throw v0

    .line 130
    :goto_1
    monitor-exit p0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 131
    throw v0
.end method

.method public final declared-synchronized l(Landroid/content/Context;)V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object p1, p0, Lxj2;->m:Lwj2;

    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p1, Lwj2;->b:Z

    .line 6
    .line 7
    invoke-virtual {p0}, Lxj2;->i()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    .line 9
    .line 10
    monitor-exit p0

    .line 11
    return-void

    .line 12
    :catchall_0
    move-exception p1

    .line 13
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 14
    throw p1
.end method

.method public final m2()V
    .locals 0

    .line 1
    return-void
.end method

.method public final declared-synchronized p(Landroid/content/Context;)V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object p1, p0, Lxj2;->m:Lwj2;

    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p1, Lwj2;->b:Z

    .line 6
    .line 7
    invoke-virtual {p0}, Lxj2;->i()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    .line 9
    .line 10
    monitor-exit p0

    .line 11
    return-void

    .line 12
    :catchall_0
    move-exception p1

    .line 13
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 14
    throw p1
.end method
