.class public final Lhi4;
.super Lpg4;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final h:Lhh3;

.field public final i:Lyf3;

.field public final j:Lpz;

.field public final k:I

.field public l:Z

.field public m:J

.field public n:Z

.field public o:Z

.field public p:Lws3;

.field public q:Lfk1;


# direct methods
.method public synthetic constructor <init>(Lfk1;Lhh3;Lyf3;Lhd4;I)V
    .locals 0

    .line 1
    sget-object p4, Lpz;->q:Lpz;

    .line 2
    .line 3
    invoke-direct {p0}, Lpg4;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lhi4;->q:Lfk1;

    .line 7
    .line 8
    iput-object p2, p0, Lhi4;->h:Lhh3;

    .line 9
    .line 10
    iput-object p3, p0, Lhi4;->i:Lyf3;

    .line 11
    .line 12
    iput-object p4, p0, Lhi4;->j:Lpz;

    .line 13
    .line 14
    iput p5, p0, Lhi4;->k:I

    .line 15
    .line 16
    const/4 p1, 0x1

    .line 17
    iput-boolean p1, p0, Lhi4;->l:Z

    .line 18
    .line 19
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    iput-wide p1, p0, Lhi4;->m:J

    .line 25
    .line 26
    return-void
.end method


# virtual methods
.method public final declared-synchronized a(Lfk1;)V
    .locals 0

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iput-object p1, p0, Lhi4;->q:Lfk1;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    monitor-exit p0

    .line 5
    return-void

    .line 6
    :catchall_0
    move-exception p1

    .line 7
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 8
    throw p1
.end method

.method public final b(Ljh4;)V
    .locals 6

    .line 1
    check-cast p1, Lbi4;

    .line 2
    .line 3
    iget-boolean v0, p1, Lbi4;->z:Z

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    iget-object v0, p1, Lbi4;->w:[Lki4;

    .line 9
    .line 10
    array-length v2, v0

    .line 11
    const/4 v3, 0x0

    .line 12
    :goto_0
    if-ge v3, v2, :cond_1

    .line 13
    .line 14
    aget-object v4, v0, v3

    .line 15
    .line 16
    invoke-virtual {v4}, Lki4;->l()V

    .line 17
    .line 18
    .line 19
    iget-object v5, v4, Lki4;->g:Lci3;

    .line 20
    .line 21
    if-eqz v5, :cond_0

    .line 22
    .line 23
    iput-object v1, v4, Lki4;->g:Lci3;

    .line 24
    .line 25
    iput-object v1, v4, Lki4;->f:Lph4;

    .line 26
    .line 27
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    iget-object v0, p1, Lbi4;->o:Lt83;

    .line 31
    .line 32
    iget-object v2, v0, Lt83;->h:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v2, Lyj4;

    .line 35
    .line 36
    const/4 v3, 0x1

    .line 37
    if-eqz v2, :cond_2

    .line 38
    .line 39
    invoke-virtual {v2, v3}, Lyj4;->a(Z)V

    .line 40
    .line 41
    .line 42
    :cond_2
    iget-object v0, v0, Lt83;->g:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v0, Lia1;

    .line 45
    .line 46
    new-instance v2, Lbh3;

    .line 47
    .line 48
    const/16 v4, 0x10

    .line 49
    .line 50
    invoke-direct {v2, v4, p1}, Lbh3;-><init>(ILjava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0, v2}, Lia1;->execute(Ljava/lang/Runnable;)V

    .line 54
    .line 55
    .line 56
    iget-object v0, v0, Lia1;->g:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v0, Ljava/util/concurrent/Executor;

    .line 59
    .line 60
    check-cast v0, Ljava/util/concurrent/ExecutorService;

    .line 61
    .line 62
    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 63
    .line 64
    .line 65
    iget-object v0, p1, Lbi4;->t:Landroid/os/Handler;

    .line 66
    .line 67
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    iput-object v1, p1, Lbi4;->u:Lih4;

    .line 71
    .line 72
    iput-boolean v3, p1, Lbi4;->R:Z

    .line 73
    .line 74
    return-void
.end method

.method public final c(Lkh4;Lrj4;J)Ljh4;
    .locals 12

    .line 1
    iget-object v1, p0, Lhi4;->h:Lhh3;

    .line 2
    .line 3
    invoke-interface {v1}, Lhh3;->a()Lth3;

    .line 4
    .line 5
    .line 6
    move-result-object v2

    .line 7
    iget-object v1, p0, Lhi4;->p:Lws3;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-interface {v2, v1}, Lth3;->b(Lws3;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    invoke-virtual {p0}, Lhi4;->f()Lfk1;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    iget-object v1, v1, Lfk1;->b:Lkh1;

    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    iget-object v1, v1, Lkh1;->a:Landroid/net/Uri;

    .line 24
    .line 25
    new-instance v3, Lbi4;

    .line 26
    .line 27
    iget-object v4, p0, Lpg4;->g:Lxd4;

    .line 28
    .line 29
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    move-object v4, v3

    .line 33
    new-instance v3, Ljr3;

    .line 34
    .line 35
    iget-object v5, p0, Lhi4;->i:Lyf3;

    .line 36
    .line 37
    iget-object v5, v5, Lyf3;->f:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v5, Lof1;

    .line 40
    .line 41
    invoke-direct {v3, v5}, Ljr3;-><init>(Lof1;)V

    .line 42
    .line 43
    .line 44
    new-instance v5, Llv2;

    .line 45
    .line 46
    iget-object v6, p0, Lpg4;->d:Llv2;

    .line 47
    .line 48
    iget-object v6, v6, Llv2;->h:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v6, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 51
    .line 52
    const/16 v8, 0x12

    .line 53
    .line 54
    const/4 v9, 0x0

    .line 55
    invoke-direct {v5, v6, p1, v8, v9}, Llv2;-><init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 56
    .line 57
    .line 58
    new-instance v6, Lwt2;

    .line 59
    .line 60
    iget-object v8, p0, Lpg4;->c:Lwt2;

    .line 61
    .line 62
    iget-object v8, v8, Lwt2;->h:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v8, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 65
    .line 66
    const/16 v9, 0xe

    .line 67
    .line 68
    invoke-direct {v6, v8, p1, v9}, Lwt2;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 69
    .line 70
    .line 71
    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    invoke-static {v8, v9}, Lv23;->r(J)J

    .line 77
    .line 78
    .line 79
    move-result-wide v10

    .line 80
    move-object v0, v4

    .line 81
    iget-object v4, p0, Lhi4;->j:Lpz;

    .line 82
    .line 83
    iget v9, p0, Lhi4;->k:I

    .line 84
    .line 85
    move-object v7, p0

    .line 86
    move-object v8, p2

    .line 87
    invoke-direct/range {v0 .. v11}, Lbi4;-><init>(Landroid/net/Uri;Lth3;Ljr3;Lpz;Llv2;Lwt2;Lhi4;Lrj4;IJ)V

    .line 88
    .line 89
    .line 90
    return-object v0
.end method

.method public final declared-synchronized f()Lfk1;
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lhi4;->q:Lfk1;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    monitor-exit p0

    .line 5
    return-object v0

    .line 6
    :catchall_0
    move-exception v0

    .line 7
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 8
    throw v0
.end method

.method public final h(Lws3;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lhi4;->p:Lws3;

    .line 2
    .line 3
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    iget-object p1, p0, Lpg4;->g:Lxd4;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Lhi4;->t()V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final j()V
    .locals 0

    .line 1
    return-void
.end method

.method public final r()V
    .locals 0

    .line 1
    return-void
.end method

.method public final s(JLcg1;Z)V
    .locals 2

    .line 1
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    cmp-long v0, p1, v0

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    iget-wide p1, p0, Lhi4;->m:J

    .line 11
    .line 12
    :cond_0
    invoke-interface {p3}, Lcg1;->d()Z

    .line 13
    .line 14
    .line 15
    move-result p3

    .line 16
    iget-boolean v0, p0, Lhi4;->l:Z

    .line 17
    .line 18
    if-nez v0, :cond_1

    .line 19
    .line 20
    iget-wide v0, p0, Lhi4;->m:J

    .line 21
    .line 22
    cmp-long v0, v0, p1

    .line 23
    .line 24
    if-nez v0, :cond_1

    .line 25
    .line 26
    iget-boolean v0, p0, Lhi4;->n:Z

    .line 27
    .line 28
    if-ne v0, p3, :cond_1

    .line 29
    .line 30
    iget-boolean v0, p0, Lhi4;->o:Z

    .line 31
    .line 32
    if-ne v0, p4, :cond_1

    .line 33
    .line 34
    return-void

    .line 35
    :cond_1
    iput-wide p1, p0, Lhi4;->m:J

    .line 36
    .line 37
    iput-boolean p3, p0, Lhi4;->n:Z

    .line 38
    .line 39
    iput-boolean p4, p0, Lhi4;->o:Z

    .line 40
    .line 41
    const/4 p1, 0x0

    .line 42
    iput-boolean p1, p0, Lhi4;->l:Z

    .line 43
    .line 44
    invoke-virtual {p0}, Lhi4;->t()V

    .line 45
    .line 46
    .line 47
    return-void
.end method

.method public final t()V
    .locals 8

    .line 1
    new-instance v0, Loi4;

    .line 2
    .line 3
    iget-wide v1, p0, Lhi4;->m:J

    .line 4
    .line 5
    iget-boolean v5, p0, Lhi4;->n:Z

    .line 6
    .line 7
    iget-boolean v3, p0, Lhi4;->o:Z

    .line 8
    .line 9
    invoke-virtual {p0}, Lhi4;->f()Lfk1;

    .line 10
    .line 11
    .line 12
    move-result-object v6

    .line 13
    if-eqz v3, :cond_0

    .line 14
    .line 15
    iget-object v3, v6, Lfk1;->c:Lqg1;

    .line 16
    .line 17
    :goto_0
    move-object v7, v3

    .line 18
    goto :goto_1

    .line 19
    :cond_0
    const/4 v3, 0x0

    .line 20
    goto :goto_0

    .line 21
    :goto_1
    move-wide v3, v1

    .line 22
    invoke-direct/range {v0 .. v7}, Loi4;-><init>(JJZLfk1;Lqg1;)V

    .line 23
    .line 24
    .line 25
    iget-boolean v1, p0, Lhi4;->l:Z

    .line 26
    .line 27
    if-eqz v1, :cond_1

    .line 28
    .line 29
    new-instance v1, Lci4;

    .line 30
    .line 31
    invoke-direct {v1, v0}, Lah4;-><init>(Loz1;)V

    .line 32
    .line 33
    .line 34
    move-object v0, v1

    .line 35
    :cond_1
    invoke-virtual {p0, v0}, Lpg4;->k(Loz1;)V

    .line 36
    .line 37
    .line 38
    return-void
.end method
