.class public final Lmu2;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public a:Z

.field public b:Z

.field public final c:Ljava/lang/Object;

.field public final d:Ljava/lang/Object;

.field public final e:Ljava/lang/Object;

.field public final f:Ljava/lang/Object;

.field public g:Ljava/lang/Cloneable;

.field public final h:Ljava/lang/Object;

.field public final i:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroid/os/Looper;Lpz;Lvs2;)V
    .locals 6

    .line 12
    new-instance v1, Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {v1}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    const/4 v5, 0x1

    move-object v0, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    invoke-direct/range {v0 .. v5}, Lmu2;-><init>(Ljava/util/concurrent/CopyOnWriteArraySet;Landroid/os/Looper;Lpz;Lvs2;Z)V

    return-void
.end method

.method public constructor <init>(Ljava/util/concurrent/CopyOnWriteArraySet;Landroid/os/Looper;Lpz;Lvs2;Z)V
    .locals 0

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p3, p0, Lmu2;->c:Ljava/lang/Object;

    iput-object p1, p0, Lmu2;->f:Ljava/lang/Object;

    iput-object p4, p0, Lmu2;->e:Ljava/lang/Object;

    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmu2;->i:Ljava/lang/Object;

    new-instance p1, Ljava/util/ArrayDeque;

    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    iput-object p1, p0, Lmu2;->g:Ljava/lang/Cloneable;

    new-instance p1, Ljava/util/ArrayDeque;

    .line 14
    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    iput-object p1, p0, Lmu2;->h:Ljava/lang/Object;

    new-instance p1, Lzw0;

    const/4 p4, 0x1

    invoke-direct {p1, p4, p0}, Lzw0;-><init>(ILjava/lang/Object;)V

    .line 15
    invoke-virtual {p3, p2, p1}, Lpz;->p(Landroid/os/Looper;Landroid/os/Handler$Callback;)Ld13;

    move-result-object p1

    iput-object p1, p0, Lmu2;->d:Ljava/lang/Object;

    iput-boolean p5, p0, Lmu2;->b:Z

    return-void
.end method

.method public constructor <init>(Lpm;Lkf3;Lvu2;Ltv2;)V
    .locals 0

    const-string p4, "adQualityDataStore"

    invoke-static {p1, p4}, Li30;->m(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p4, "dataPinger"

    invoke-static {p3, p4}, Li30;->m(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p3, p0, Lmu2;->i:Ljava/lang/Object;

    .line 2
    iget-object p2, p2, Lkf3;->g:Ljava/lang/Object;

    check-cast p2, Ljava/util/concurrent/ExecutorService;

    .line 3
    new-instance p3, Ljt;

    invoke-direct {p3, p2}, Ljt;-><init>(Ljava/util/concurrent/Executor;)V

    .line 4
    invoke-static {p3}, Lwl2;->a(Lhk;)Lmj;

    move-result-object p2

    .line 5
    iput-object p2, p0, Lmu2;->c:Ljava/lang/Object;

    .line 6
    new-instance p2, Ltf0;

    invoke-direct {p2}, Ltf0;-><init>()V

    .line 7
    iput-object p2, p0, Lmu2;->d:Ljava/lang/Object;

    .line 8
    new-instance p2, Ltf0;

    invoke-direct {p2}, Ltf0;-><init>()V

    .line 9
    iput-object p2, p0, Lmu2;->e:Ljava/lang/Object;

    .line 10
    new-instance p2, Ltf0;

    invoke-direct {p2}, Ltf0;-><init>()V

    .line 11
    iput-object p2, p0, Lmu2;->f:Ljava/lang/Object;

    iput-object p1, p0, Lmu2;->h:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lmu2;->i:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-boolean v1, p0, Lmu2;->a:Z

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    monitor-exit v0

    .line 9
    return-void

    .line 10
    :catchall_0
    move-exception p1

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget-object v1, p0, Lmu2;->f:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v1, Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 15
    .line 16
    new-instance v2, Lht2;

    .line 17
    .line 18
    invoke-direct {v2, p1}, Lht2;-><init>(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1, v2}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    monitor-exit v0

    .line 25
    return-void

    .line 26
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    throw p1
.end method

.method public b(Ljava/lang/Object;)V
    .locals 6

    .line 1
    invoke-virtual {p0}, Lmu2;->g()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lmu2;->f:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v0, Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-eqz v2, :cond_2

    .line 17
    .line 18
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    check-cast v2, Lht2;

    .line 23
    .line 24
    iget-object v3, v2, Lht2;->a:Ljava/lang/Object;

    .line 25
    .line 26
    invoke-virtual {v3, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    if-eqz v3, :cond_0

    .line 31
    .line 32
    iget-object v3, p0, Lmu2;->e:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v3, Lvs2;

    .line 35
    .line 36
    const/4 v4, 0x1

    .line 37
    iput-boolean v4, v2, Lht2;->d:Z

    .line 38
    .line 39
    iget-boolean v4, v2, Lht2;->c:Z

    .line 40
    .line 41
    if-eqz v4, :cond_1

    .line 42
    .line 43
    const/4 v4, 0x0

    .line 44
    iput-boolean v4, v2, Lht2;->c:Z

    .line 45
    .line 46
    iget-object v4, v2, Lht2;->a:Ljava/lang/Object;

    .line 47
    .line 48
    iget-object v5, v2, Lht2;->b:Lnb;

    .line 49
    .line 50
    invoke-virtual {v5}, Lnb;->g()Lof4;

    .line 51
    .line 52
    .line 53
    move-result-object v5

    .line 54
    invoke-interface {v3, v4, v5}, Lvs2;->e(Ljava/lang/Object;Lof4;)V

    .line 55
    .line 56
    .line 57
    :cond_1
    invoke-virtual {v0, v2}, Ljava/util/concurrent/CopyOnWriteArraySet;->remove(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_2
    return-void
.end method

.method public c(ILks2;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lmu2;->g()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 5
    .line 6
    iget-object v1, p0, Lmu2;->f:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v1, Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 9
    .line 10
    invoke-direct {v0, v1}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>(Ljava/util/Collection;)V

    .line 11
    .line 12
    .line 13
    new-instance v1, Lk7;

    .line 14
    .line 15
    const/4 v2, 0x5

    .line 16
    invoke-direct {v1, v0, p1, p2, v2}, Lk7;-><init>(Ljava/lang/Object;ILjava/lang/Object;I)V

    .line 17
    .line 18
    .line 19
    iget-object p1, p0, Lmu2;->h:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast p1, Ljava/util/ArrayDeque;

    .line 22
    .line 23
    invoke-virtual {p1, v1}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public d()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lmu2;->g()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lmu2;->h:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v0, Ljava/util/ArrayDeque;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    goto :goto_1

    .line 15
    :cond_0
    iget-object v1, p0, Lmu2;->d:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v1, Ld13;

    .line 18
    .line 19
    iget-object v2, v1, Ld13;->a:Landroid/os/Handler;

    .line 20
    .line 21
    iget-object v1, v1, Ld13;->a:Landroid/os/Handler;

    .line 22
    .line 23
    const/4 v3, 0x1

    .line 24
    invoke-virtual {v2, v3}, Landroid/os/Handler;->hasMessages(I)Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-nez v2, :cond_1

    .line 29
    .line 30
    invoke-static {}, Ld13;->f()Lv03;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    invoke-virtual {v1, v3}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    iput-object v3, v2, Lv03;->a:Landroid/os/Message;

    .line 39
    .line 40
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1, v3}, Landroid/os/Handler;->sendMessageAtFrontOfQueue(Landroid/os/Message;)Z

    .line 44
    .line 45
    .line 46
    const/4 v1, 0x0

    .line 47
    iput-object v1, v2, Lv03;->a:Landroid/os/Message;

    .line 48
    .line 49
    invoke-static {v2}, Ld13;->e(Lv03;)V

    .line 50
    .line 51
    .line 52
    :cond_1
    iget-object v1, p0, Lmu2;->g:Ljava/lang/Cloneable;

    .line 53
    .line 54
    check-cast v1, Ljava/util/ArrayDeque;

    .line 55
    .line 56
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    invoke-virtual {v1, v0}, Ljava/util/ArrayDeque;->addAll(Ljava/util/Collection;)Z

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->clear()V

    .line 64
    .line 65
    .line 66
    if-eqz v2, :cond_2

    .line 67
    .line 68
    :goto_0
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    if-nez v0, :cond_2

    .line 73
    .line 74
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->peekFirst()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    check-cast v0, Ljava/lang/Runnable;

    .line 79
    .line 80
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->removeFirst()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_2
    :goto_1
    return-void
.end method

.method public e()V
    .locals 6

    .line 1
    invoke-virtual {p0}, Lmu2;->g()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lmu2;->i:Ljava/lang/Object;

    .line 5
    .line 6
    monitor-enter v0

    .line 7
    const/4 v1, 0x1

    .line 8
    :try_start_0
    iput-boolean v1, p0, Lmu2;->a:Z

    .line 9
    .line 10
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    iget-object v0, p0, Lmu2;->f:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    if-eqz v3, :cond_1

    .line 24
    .line 25
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    check-cast v3, Lht2;

    .line 30
    .line 31
    iget-object v4, p0, Lmu2;->e:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v4, Lvs2;

    .line 34
    .line 35
    iput-boolean v1, v3, Lht2;->d:Z

    .line 36
    .line 37
    iget-boolean v5, v3, Lht2;->c:Z

    .line 38
    .line 39
    if-eqz v5, :cond_0

    .line 40
    .line 41
    const/4 v5, 0x0

    .line 42
    iput-boolean v5, v3, Lht2;->c:Z

    .line 43
    .line 44
    iget-object v5, v3, Lht2;->a:Ljava/lang/Object;

    .line 45
    .line 46
    iget-object v3, v3, Lht2;->b:Lnb;

    .line 47
    .line 48
    invoke-virtual {v3}, Lnb;->g()Lof4;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    invoke-interface {v4, v5, v3}, Lvs2;->e(Ljava/lang/Object;Lof4;)V

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_1
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->clear()V

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    :catchall_0
    move-exception v1

    .line 61
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 62
    throw v1
.end method

.method public f(Lqj;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    instance-of v2, v0, Lhf3;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v0

    .line 10
    check-cast v2, Lhf3;

    .line 11
    .line 12
    iget v3, v2, Lhf3;->l:I

    .line 13
    .line 14
    const/high16 v4, -0x80000000

    .line 15
    .line 16
    and-int v5, v3, v4

    .line 17
    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    sub-int/2addr v3, v4

    .line 21
    iput v3, v2, Lhf3;->l:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, Lhf3;

    .line 25
    .line 26
    invoke-direct {v2, v1, v0}, Lhf3;-><init>(Lmu2;Lqj;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v0, v2, Lhf3;->j:Ljava/lang/Object;

    .line 30
    .line 31
    iget v3, v2, Lhf3;->l:I

    .line 32
    .line 33
    sget-object v4, Lz31;->a:Lz31;

    .line 34
    .line 35
    const/4 v5, 0x3

    .line 36
    const/4 v6, 0x2

    .line 37
    const/4 v7, 0x1

    .line 38
    sget-object v8, Lrk;->f:Lrk;

    .line 39
    .line 40
    if-eqz v3, :cond_4

    .line 41
    .line 42
    if-eq v3, v7, :cond_3

    .line 43
    .line 44
    if-eq v3, v6, :cond_2

    .line 45
    .line 46
    if-ne v3, v5, :cond_1

    .line 47
    .line 48
    invoke-static {v0}, Lbd2;->x(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    return-object v4

    .line 52
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 53
    .line 54
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 55
    .line 56
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    throw v0

    .line 60
    :cond_2
    iget-object v3, v2, Lhf3;->i:Lqf0;

    .line 61
    .line 62
    :try_start_0
    invoke-static {v0}, Lbd2;->x(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 63
    .line 64
    .line 65
    goto :goto_2

    .line 66
    :catchall_0
    move-exception v0

    .line 67
    goto/16 :goto_7

    .line 68
    .line 69
    :cond_3
    iget-object v3, v2, Lhf3;->i:Lqf0;

    .line 70
    .line 71
    invoke-static {v0}, Lbd2;->x(Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_4
    invoke-static {v0}, Lbd2;->x(Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    iget-object v0, v1, Lmu2;->f:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast v0, Ltf0;

    .line 81
    .line 82
    iput-object v0, v2, Lhf3;->i:Lqf0;

    .line 83
    .line 84
    iput v7, v2, Lhf3;->l:I

    .line 85
    .line 86
    invoke-virtual {v0, v2}, Ltf0;->c(Lqj;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v3

    .line 90
    if-eq v3, v8, :cond_e

    .line 91
    .line 92
    move-object v3, v0

    .line 93
    :goto_1
    :try_start_1
    iget-object v0, v1, Lmu2;->h:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast v0, Lpm;

    .line 96
    .line 97
    check-cast v0, Lyw0;

    .line 98
    .line 99
    iget-object v0, v0, Lyw0;->b:Lf20;

    .line 100
    .line 101
    iput-object v3, v2, Lhf3;->i:Lqf0;

    .line 102
    .line 103
    iput v6, v2, Lhf3;->l:I

    .line 104
    .line 105
    invoke-static {v0, v2}, Lm54;->f(Lyu;Lqj;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    if-eq v0, v8, :cond_e

    .line 110
    .line 111
    :goto_2
    check-cast v0, Lte3;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 112
    .line 113
    check-cast v3, Ltf0;

    .line 114
    .line 115
    invoke-virtual {v3}, Ltf0;->d()V

    .line 116
    .line 117
    .line 118
    if-eqz v0, :cond_d

    .line 119
    .line 120
    invoke-virtual {v0}, Lte3;->A()I

    .line 121
    .line 122
    .line 123
    move-result v3

    .line 124
    if-nez v3, :cond_5

    .line 125
    .line 126
    goto/16 :goto_6

    .line 127
    .line 128
    :cond_5
    invoke-virtual {v0}, Lte3;->B()Ljava/util/Map;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 141
    .line 142
    .line 143
    move-result v3

    .line 144
    const/4 v6, 0x0

    .line 145
    if-eqz v3, :cond_c

    .line 146
    .line 147
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v3

    .line 151
    check-cast v3, Ljava/util/Map$Entry;

    .line 152
    .line 153
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v9

    .line 157
    check-cast v9, Lqe3;

    .line 158
    .line 159
    invoke-virtual {v9}, Lp54;->s()Ln54;

    .line 160
    .line 161
    .line 162
    move-result-object v9

    .line 163
    check-cast v9, Lpe3;

    .line 164
    .line 165
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object v3

    .line 169
    const-string v10, "<get-value>(...)"

    .line 170
    .line 171
    invoke-static {v3, v10}, Li30;->l(Ljava/lang/Object;Ljava/lang/String;)V

    .line 172
    .line 173
    .line 174
    check-cast v3, Lqe3;

    .line 175
    .line 176
    invoke-virtual {v3}, Lqe3;->M()Lv54;

    .line 177
    .line 178
    .line 179
    move-result-object v10

    .line 180
    if-eqz v10, :cond_7

    .line 181
    .line 182
    invoke-interface {v10}, Ljava/util/List;->isEmpty()Z

    .line 183
    .line 184
    .line 185
    move-result v11

    .line 186
    if-eqz v11, :cond_6

    .line 187
    .line 188
    goto :goto_4

    .line 189
    :cond_6
    check-cast v10, Le64;

    .line 190
    .line 191
    iget v6, v10, Le64;->h:I

    .line 192
    .line 193
    sub-int/2addr v6, v7

    .line 194
    invoke-virtual {v10, v6}, Le64;->get(I)Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object v6

    .line 198
    :goto_4
    check-cast v6, Ljava/lang/Long;

    .line 199
    .line 200
    :cond_7
    invoke-virtual {v3}, Lqe3;->N()I

    .line 201
    .line 202
    .line 203
    move-result v10

    .line 204
    invoke-virtual {v3}, Lqe3;->O()I

    .line 205
    .line 206
    .line 207
    move-result v11

    .line 208
    const/4 v12, 0x0

    .line 209
    if-le v10, v11, :cond_8

    .line 210
    .line 211
    invoke-virtual {v3}, Lqe3;->G()Z

    .line 212
    .line 213
    .line 214
    move-result v10

    .line 215
    if-nez v10, :cond_8

    .line 216
    .line 217
    move v10, v7

    .line 218
    goto :goto_5

    .line 219
    :cond_8
    move v10, v12

    .line 220
    :goto_5
    if-eqz v6, :cond_9

    .line 221
    .line 222
    invoke-virtual {v6}, Ljava/lang/Number;->longValue()J

    .line 223
    .line 224
    .line 225
    move-result-wide v13

    .line 226
    invoke-virtual {v3}, Lqe3;->K()J

    .line 227
    .line 228
    .line 229
    move-result-wide v15

    .line 230
    sub-long/2addr v15, v13

    .line 231
    const-wide/16 v13, 0x1388

    .line 232
    .line 233
    cmp-long v3, v15, v13

    .line 234
    .line 235
    if-lez v3, :cond_9

    .line 236
    .line 237
    move v12, v7

    .line 238
    :cond_9
    if-nez v10, :cond_a

    .line 239
    .line 240
    if-eqz v12, :cond_b

    .line 241
    .line 242
    :cond_a
    invoke-virtual {v9}, Ln54;->b()V

    .line 243
    .line 244
    .line 245
    iget-object v3, v9, Ln54;->g:Lp54;

    .line 246
    .line 247
    check-cast v3, Lqe3;

    .line 248
    .line 249
    invoke-virtual {v3, v7}, Lqe3;->W(Z)V

    .line 250
    .line 251
    .line 252
    :cond_b
    iget-object v3, v1, Lmu2;->i:Ljava/lang/Object;

    .line 253
    .line 254
    check-cast v3, Lvu2;

    .line 255
    .line 256
    invoke-virtual {v9}, Ln54;->d()Lp54;

    .line 257
    .line 258
    .line 259
    move-result-object v6

    .line 260
    check-cast v6, Lqe3;

    .line 261
    .line 262
    invoke-virtual {v3, v6}, Lvu2;->a(Lqe3;)Z

    .line 263
    .line 264
    .line 265
    goto :goto_3

    .line 266
    :cond_c
    iput-object v6, v2, Lhf3;->i:Lqf0;

    .line 267
    .line 268
    iput v5, v2, Lhf3;->l:I

    .line 269
    .line 270
    invoke-virtual {v1, v2}, Lmu2;->o(Lqj;)Ljava/lang/Object;

    .line 271
    .line 272
    .line 273
    move-result-object v0

    .line 274
    if-ne v0, v8, :cond_d

    .line 275
    .line 276
    goto :goto_8

    .line 277
    :cond_d
    :goto_6
    return-object v4

    .line 278
    :goto_7
    check-cast v3, Ltf0;

    .line 279
    .line 280
    invoke-virtual {v3}, Ltf0;->d()V

    .line 281
    .line 282
    .line 283
    throw v0

    .line 284
    :cond_e
    :goto_8
    return-object v8
.end method

.method public g()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lmu2;->b:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, p0, Lmu2;->d:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Ld13;

    .line 9
    .line 10
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    iget-object v0, v0, Ld13;->a:Landroid/os/Handler;

    .line 15
    .line 16
    invoke-virtual {v0}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {v0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    if-ne v1, v0, :cond_1

    .line 25
    .line 26
    const/4 v0, 0x1

    .line 27
    goto :goto_0

    .line 28
    :cond_1
    const/4 v0, 0x0

    .line 29
    :goto_0
    invoke-static {v0}, Lzt0;->b0(Z)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public h(Ljava/lang/String;Lqj;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p2, Lef3;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lef3;

    .line 7
    .line 8
    iget v1, v0, Lef3;->m:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lef3;->m:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lef3;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lef3;-><init>(Lmu2;Lqj;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lef3;->k:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lef3;->m:I

    .line 28
    .line 29
    const/4 v2, 0x1

    .line 30
    if-eqz v1, :cond_2

    .line 31
    .line 32
    if-ne v1, v2, :cond_1

    .line 33
    .line 34
    iget-wide v3, v0, Lef3;->j:J

    .line 35
    .line 36
    iget-object p1, v0, Lef3;->i:Ltf0;

    .line 37
    .line 38
    iget-object v0, v0, Lef3;->n:Ljava/lang/String;

    .line 39
    .line 40
    invoke-static {p2}, Lbd2;->x(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 45
    .line 46
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 47
    .line 48
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    throw p1

    .line 52
    :cond_2
    invoke-static {p2}, Lbd2;->x(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    iget-object p2, p0, Lmu2;->d:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast p2, Ltf0;

    .line 58
    .line 59
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 60
    .line 61
    .line 62
    move-result-wide v3

    .line 63
    iput-object p1, v0, Lef3;->n:Ljava/lang/String;

    .line 64
    .line 65
    iput-object p2, v0, Lef3;->i:Ltf0;

    .line 66
    .line 67
    iput-wide v3, v0, Lef3;->j:J

    .line 68
    .line 69
    iput v2, v0, Lef3;->m:I

    .line 70
    .line 71
    invoke-virtual {p2, v0}, Ltf0;->c(Lqj;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    sget-object v1, Lrk;->f:Lrk;

    .line 76
    .line 77
    if-eq v0, v1, :cond_4

    .line 78
    .line 79
    move-object v0, p1

    .line 80
    move-object p1, p2

    .line 81
    :goto_1
    :try_start_0
    iget-boolean p2, p0, Lmu2;->a:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 82
    .line 83
    sget-object v1, Lz31;->a:Lz31;

    .line 84
    .line 85
    if-eqz p2, :cond_3

    .line 86
    .line 87
    invoke-virtual {p1}, Ltf0;->d()V

    .line 88
    .line 89
    .line 90
    return-object v1

    .line 91
    :cond_3
    :try_start_1
    iput-boolean v2, p0, Lmu2;->a:Z

    .line 92
    .line 93
    invoke-static {}, Lqe3;->R()Lqe3;

    .line 94
    .line 95
    .line 96
    move-result-object p2

    .line 97
    invoke-virtual {p2}, Lp54;->s()Ln54;

    .line 98
    .line 99
    .line 100
    move-result-object p2

    .line 101
    check-cast p2, Lpe3;

    .line 102
    .line 103
    iput-object p2, p0, Lmu2;->g:Ljava/lang/Cloneable;

    .line 104
    .line 105
    invoke-virtual {p2}, Ln54;->b()V

    .line 106
    .line 107
    .line 108
    iget-object v2, p2, Ln54;->g:Lp54;

    .line 109
    .line 110
    check-cast v2, Lqe3;

    .line 111
    .line 112
    invoke-virtual {v2, v0}, Lqe3;->S(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {p2}, Ln54;->b()V

    .line 116
    .line 117
    .line 118
    iget-object p2, p2, Ln54;->g:Lp54;

    .line 119
    .line 120
    check-cast p2, Lqe3;

    .line 121
    .line 122
    invoke-virtual {p2, v3, v4}, Lqe3;->Y(J)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 123
    .line 124
    .line 125
    invoke-virtual {p1}, Ltf0;->d()V

    .line 126
    .line 127
    .line 128
    return-object v1

    .line 129
    :catchall_0
    move-exception p2

    .line 130
    invoke-virtual {p1}, Ltf0;->d()V

    .line 131
    .line 132
    .line 133
    throw p2

    .line 134
    :cond_4
    return-object v1
.end method

.method public i(Lqj;)Ljava/lang/Object;
    .locals 10

    .line 1
    instance-of v0, p1, Laf3;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Laf3;

    .line 7
    .line 8
    iget v1, v0, Laf3;->m:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Laf3;->m:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Laf3;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Laf3;-><init>(Lmu2;Lqj;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Laf3;->k:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Laf3;->m:I

    .line 28
    .line 29
    sget-object v2, Lz31;->a:Lz31;

    .line 30
    .line 31
    const/4 v3, 0x4

    .line 32
    const/4 v4, 0x3

    .line 33
    const/4 v5, 0x2

    .line 34
    const/4 v6, 0x1

    .line 35
    sget-object v7, Lrk;->f:Lrk;

    .line 36
    .line 37
    if-eqz v1, :cond_5

    .line 38
    .line 39
    if-eq v1, v6, :cond_4

    .line 40
    .line 41
    if-eq v1, v5, :cond_3

    .line 42
    .line 43
    if-eq v1, v4, :cond_2

    .line 44
    .line 45
    if-ne v1, v3, :cond_1

    .line 46
    .line 47
    invoke-static {p1}, Lbd2;->x(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    return-object v2

    .line 51
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 52
    .line 53
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 54
    .line 55
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    throw p1

    .line 59
    :cond_2
    invoke-static {p1}, Lbd2;->x(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    goto :goto_3

    .line 63
    :cond_3
    iget-wide v5, v0, Laf3;->j:J

    .line 64
    .line 65
    iget-object v1, v0, Laf3;->i:Ltf0;

    .line 66
    .line 67
    invoke-static {p1}, Lbd2;->x(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    goto :goto_2

    .line 71
    :cond_4
    iget-object v1, v0, Laf3;->i:Ltf0;

    .line 72
    .line 73
    invoke-static {p1}, Lbd2;->x(Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_5
    invoke-static {p1}, Lbd2;->x(Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    iget-object p1, p0, Lmu2;->e:Ljava/lang/Object;

    .line 81
    .line 82
    move-object v1, p1

    .line 83
    check-cast v1, Ltf0;

    .line 84
    .line 85
    iput-object v1, v0, Laf3;->i:Ltf0;

    .line 86
    .line 87
    iput v6, v0, Laf3;->m:I

    .line 88
    .line 89
    invoke-virtual {v1, v0}, Ltf0;->c(Lqj;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    if-eq p1, v7, :cond_9

    .line 94
    .line 95
    :goto_1
    :try_start_0
    iget-boolean p1, p0, Lmu2;->b:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 96
    .line 97
    if-eqz p1, :cond_6

    .line 98
    .line 99
    invoke-virtual {v1}, Ltf0;->d()V

    .line 100
    .line 101
    .line 102
    return-object v2

    .line 103
    :cond_6
    :try_start_1
    iput-boolean v6, p0, Lmu2;->b:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 104
    .line 105
    invoke-virtual {v1}, Ltf0;->d()V

    .line 106
    .line 107
    .line 108
    iget-object p1, p0, Lmu2;->d:Ljava/lang/Object;

    .line 109
    .line 110
    move-object v1, p1

    .line 111
    check-cast v1, Ltf0;

    .line 112
    .line 113
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 114
    .line 115
    .line 116
    move-result-wide v8

    .line 117
    iput-object v1, v0, Laf3;->i:Ltf0;

    .line 118
    .line 119
    iput-wide v8, v0, Laf3;->j:J

    .line 120
    .line 121
    iput v5, v0, Laf3;->m:I

    .line 122
    .line 123
    invoke-virtual {v1, v0}, Ltf0;->c(Lqj;)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    if-eq p1, v7, :cond_9

    .line 128
    .line 129
    move-wide v5, v8

    .line 130
    :goto_2
    :try_start_2
    iget-object p1, p0, Lmu2;->g:Ljava/lang/Cloneable;

    .line 131
    .line 132
    check-cast p1, Lpe3;

    .line 133
    .line 134
    const/4 v8, 0x0

    .line 135
    if-eqz p1, :cond_8

    .line 136
    .line 137
    invoke-virtual {p1}, Ln54;->b()V

    .line 138
    .line 139
    .line 140
    iget-object p1, p1, Ln54;->g:Lp54;

    .line 141
    .line 142
    check-cast p1, Lqe3;

    .line 143
    .line 144
    invoke-virtual {p1, v5, v6}, Lqe3;->b0(J)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 145
    .line 146
    .line 147
    invoke-virtual {v1}, Ltf0;->d()V

    .line 148
    .line 149
    .line 150
    iput-object v8, v0, Laf3;->i:Ltf0;

    .line 151
    .line 152
    iput v4, v0, Laf3;->m:I

    .line 153
    .line 154
    invoke-virtual {p0, v5, v6, v0}, Lmu2;->p(JLqj;)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object p1

    .line 158
    if-eq p1, v7, :cond_9

    .line 159
    .line 160
    :goto_3
    iput v3, v0, Laf3;->m:I

    .line 161
    .line 162
    invoke-virtual {p0, v0}, Lmu2;->q(Lqj;)Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object p1

    .line 166
    if-ne p1, v7, :cond_7

    .line 167
    .line 168
    goto :goto_4

    .line 169
    :cond_7
    return-object v2

    .line 170
    :cond_8
    :try_start_3
    const-string p1, "adQualityDataBuilder"

    .line 171
    .line 172
    invoke-static {p1}, Li30;->S(Ljava/lang/String;)V

    .line 173
    .line 174
    .line 175
    throw v8
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 176
    :catchall_0
    move-exception p1

    .line 177
    invoke-virtual {v1}, Ltf0;->d()V

    .line 178
    .line 179
    .line 180
    throw p1

    .line 181
    :catchall_1
    move-exception p1

    .line 182
    invoke-virtual {v1}, Ltf0;->d()V

    .line 183
    .line 184
    .line 185
    throw p1

    .line 186
    :cond_9
    :goto_4
    return-object v7
.end method

.method public j(Lqj;)Ljava/lang/Object;
    .locals 12

    .line 1
    instance-of v0, p1, Ljf3;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Ljf3;

    .line 7
    .line 8
    iget v1, v0, Ljf3;->m:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Ljf3;->m:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Ljf3;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Ljf3;-><init>(Lmu2;Lqj;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Ljf3;->k:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Ljf3;->m:I

    .line 28
    .line 29
    sget-object v2, Lz31;->a:Lz31;

    .line 30
    .line 31
    const/4 v3, 0x2

    .line 32
    const/4 v4, 0x1

    .line 33
    sget-object v5, Lrk;->f:Lrk;

    .line 34
    .line 35
    if-eqz v1, :cond_3

    .line 36
    .line 37
    if-eq v1, v4, :cond_2

    .line 38
    .line 39
    if-ne v1, v3, :cond_1

    .line 40
    .line 41
    iget-wide v5, v0, Ljf3;->j:J

    .line 42
    .line 43
    iget-object v0, v0, Ljf3;->i:Ltf0;

    .line 44
    .line 45
    invoke-static {p1}, Lbd2;->x(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    goto :goto_2

    .line 49
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 50
    .line 51
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 52
    .line 53
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    throw p1

    .line 57
    :cond_2
    iget-object v1, v0, Ljf3;->i:Ltf0;

    .line 58
    .line 59
    invoke-static {p1}, Lbd2;->x(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_3
    invoke-static {p1}, Lbd2;->x(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    iget-object p1, p0, Lmu2;->e:Ljava/lang/Object;

    .line 67
    .line 68
    move-object v1, p1

    .line 69
    check-cast v1, Ltf0;

    .line 70
    .line 71
    iput-object v1, v0, Ljf3;->i:Ltf0;

    .line 72
    .line 73
    iput v4, v0, Ljf3;->m:I

    .line 74
    .line 75
    invoke-virtual {v1, v0}, Ltf0;->c(Lqj;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    if-eq p1, v5, :cond_f

    .line 80
    .line 81
    :goto_1
    :try_start_0
    iget-boolean p1, p0, Lmu2;->b:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 82
    .line 83
    if-nez p1, :cond_4

    .line 84
    .line 85
    invoke-virtual {v1}, Ltf0;->d()V

    .line 86
    .line 87
    .line 88
    return-object v2

    .line 89
    :cond_4
    const/4 p1, 0x0

    .line 90
    :try_start_1
    iput-boolean p1, p0, Lmu2;->b:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 91
    .line 92
    invoke-virtual {v1}, Ltf0;->d()V

    .line 93
    .line 94
    .line 95
    iget-object p1, p0, Lmu2;->d:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast p1, Ltf0;

    .line 98
    .line 99
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 100
    .line 101
    .line 102
    move-result-wide v6

    .line 103
    iput-object p1, v0, Ljf3;->i:Ltf0;

    .line 104
    .line 105
    iput-wide v6, v0, Ljf3;->j:J

    .line 106
    .line 107
    iput v3, v0, Ljf3;->m:I

    .line 108
    .line 109
    invoke-virtual {p1, v0}, Ltf0;->c(Lqj;)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    if-eq v0, v5, :cond_f

    .line 114
    .line 115
    move-object v0, p1

    .line 116
    move-wide v5, v6

    .line 117
    :goto_2
    :try_start_2
    iget-object p1, p0, Lmu2;->g:Ljava/lang/Cloneable;

    .line 118
    .line 119
    check-cast p1, Lpe3;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 120
    .line 121
    const/4 v1, 0x0

    .line 122
    const-string v3, "adQualityDataBuilder"

    .line 123
    .line 124
    if-eqz p1, :cond_e

    .line 125
    .line 126
    :try_start_3
    iget-object p1, p1, Ln54;->g:Lp54;

    .line 127
    .line 128
    check-cast p1, Lqe3;

    .line 129
    .line 130
    invoke-virtual {p1}, Lqe3;->Q()I

    .line 131
    .line 132
    .line 133
    move-result p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 134
    const-string v7, "last(...)"

    .line 135
    .line 136
    if-lez p1, :cond_8

    .line 137
    .line 138
    :try_start_4
    iget-object p1, p0, Lmu2;->g:Ljava/lang/Cloneable;

    .line 139
    .line 140
    check-cast p1, Lpe3;

    .line 141
    .line 142
    if-eqz p1, :cond_7

    .line 143
    .line 144
    iget-object p1, p1, Ln54;->g:Lp54;

    .line 145
    .line 146
    check-cast p1, Lqe3;

    .line 147
    .line 148
    invoke-virtual {p1}, Lqe3;->P()Lv54;

    .line 149
    .line 150
    .line 151
    move-result-object p1

    .line 152
    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 153
    .line 154
    .line 155
    move-result-object p1

    .line 156
    const-string v8, "getAdClickTimestampsMsList(...)"

    .line 157
    .line 158
    invoke-static {p1, v8}, Li30;->l(Ljava/lang/Object;Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    invoke-static {p1}, Lyf;->n0(Ljava/util/List;)Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object p1

    .line 165
    invoke-static {p1, v7}, Li30;->l(Ljava/lang/Object;Ljava/lang/String;)V

    .line 166
    .line 167
    .line 168
    check-cast p1, Ljava/lang/Number;

    .line 169
    .line 170
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 171
    .line 172
    .line 173
    move-result-wide v8

    .line 174
    sub-long v8, v5, v8

    .line 175
    .line 176
    iget-object p1, p0, Lmu2;->g:Ljava/lang/Cloneable;

    .line 177
    .line 178
    check-cast p1, Lpe3;

    .line 179
    .line 180
    if-eqz p1, :cond_6

    .line 181
    .line 182
    invoke-virtual {p1}, Ln54;->b()V

    .line 183
    .line 184
    .line 185
    iget-object p1, p1, Ln54;->g:Lp54;

    .line 186
    .line 187
    check-cast p1, Lqe3;

    .line 188
    .line 189
    invoke-virtual {p1}, Lqe3;->C()V

    .line 190
    .line 191
    .line 192
    const-wide/16 v10, 0x1388

    .line 193
    .line 194
    cmp-long p1, v8, v10

    .line 195
    .line 196
    if-gez p1, :cond_8

    .line 197
    .line 198
    iget-object p1, p0, Lmu2;->g:Ljava/lang/Cloneable;

    .line 199
    .line 200
    check-cast p1, Lpe3;

    .line 201
    .line 202
    if-eqz p1, :cond_5

    .line 203
    .line 204
    iget-object v8, p1, Ln54;->g:Lp54;

    .line 205
    .line 206
    check-cast v8, Lqe3;

    .line 207
    .line 208
    invoke-virtual {v8}, Lqe3;->F()I

    .line 209
    .line 210
    .line 211
    move-result v8

    .line 212
    add-int/2addr v8, v4

    .line 213
    invoke-virtual {p1}, Ln54;->b()V

    .line 214
    .line 215
    .line 216
    iget-object p1, p1, Ln54;->g:Lp54;

    .line 217
    .line 218
    check-cast p1, Lqe3;

    .line 219
    .line 220
    invoke-virtual {p1, v8}, Lqe3;->U(I)V

    .line 221
    .line 222
    .line 223
    goto :goto_3

    .line 224
    :cond_5
    invoke-static {v3}, Li30;->S(Ljava/lang/String;)V

    .line 225
    .line 226
    .line 227
    throw v1

    .line 228
    :cond_6
    invoke-static {v3}, Li30;->S(Ljava/lang/String;)V

    .line 229
    .line 230
    .line 231
    throw v1

    .line 232
    :catchall_0
    move-exception p1

    .line 233
    goto/16 :goto_5

    .line 234
    .line 235
    :cond_7
    invoke-static {v3}, Li30;->S(Ljava/lang/String;)V

    .line 236
    .line 237
    .line 238
    throw v1

    .line 239
    :cond_8
    :goto_3
    iget-object p1, p0, Lmu2;->g:Ljava/lang/Cloneable;

    .line 240
    .line 241
    check-cast p1, Lpe3;

    .line 242
    .line 243
    if-eqz p1, :cond_d

    .line 244
    .line 245
    iget-object p1, p1, Ln54;->g:Lp54;

    .line 246
    .line 247
    check-cast p1, Lqe3;

    .line 248
    .line 249
    invoke-virtual {p1}, Lqe3;->N()I

    .line 250
    .line 251
    .line 252
    move-result p1

    .line 253
    if-lez p1, :cond_b

    .line 254
    .line 255
    iget-object p1, p0, Lmu2;->g:Ljava/lang/Cloneable;

    .line 256
    .line 257
    check-cast p1, Lpe3;

    .line 258
    .line 259
    if-eqz p1, :cond_a

    .line 260
    .line 261
    iget-object p1, p1, Ln54;->g:Lp54;

    .line 262
    .line 263
    check-cast p1, Lqe3;

    .line 264
    .line 265
    invoke-virtual {p1}, Lqe3;->M()Lv54;

    .line 266
    .line 267
    .line 268
    move-result-object p1

    .line 269
    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 270
    .line 271
    .line 272
    move-result-object p1

    .line 273
    const-string v4, "getAppBackgroundTimestampsMsList(...)"

    .line 274
    .line 275
    invoke-static {p1, v4}, Li30;->l(Ljava/lang/Object;Ljava/lang/String;)V

    .line 276
    .line 277
    .line 278
    invoke-static {p1}, Lyf;->n0(Ljava/util/List;)Ljava/lang/Object;

    .line 279
    .line 280
    .line 281
    move-result-object p1

    .line 282
    invoke-static {p1, v7}, Li30;->l(Ljava/lang/Object;Ljava/lang/String;)V

    .line 283
    .line 284
    .line 285
    check-cast p1, Ljava/lang/Number;

    .line 286
    .line 287
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 288
    .line 289
    .line 290
    move-result-wide v7

    .line 291
    sub-long v7, v5, v7

    .line 292
    .line 293
    iget-object p1, p0, Lmu2;->g:Ljava/lang/Cloneable;

    .line 294
    .line 295
    check-cast p1, Lpe3;

    .line 296
    .line 297
    if-eqz p1, :cond_9

    .line 298
    .line 299
    iget-object v4, p1, Ln54;->g:Lp54;

    .line 300
    .line 301
    check-cast v4, Lqe3;

    .line 302
    .line 303
    invoke-virtual {v4}, Lqe3;->I()J

    .line 304
    .line 305
    .line 306
    move-result-wide v9

    .line 307
    add-long/2addr v9, v7

    .line 308
    invoke-virtual {p1}, Ln54;->b()V

    .line 309
    .line 310
    .line 311
    iget-object p1, p1, Ln54;->g:Lp54;

    .line 312
    .line 313
    check-cast p1, Lqe3;

    .line 314
    .line 315
    invoke-virtual {p1, v9, v10}, Lqe3;->X(J)V

    .line 316
    .line 317
    .line 318
    goto :goto_4

    .line 319
    :cond_9
    invoke-static {v3}, Li30;->S(Ljava/lang/String;)V

    .line 320
    .line 321
    .line 322
    throw v1

    .line 323
    :cond_a
    invoke-static {v3}, Li30;->S(Ljava/lang/String;)V

    .line 324
    .line 325
    .line 326
    throw v1

    .line 327
    :cond_b
    :goto_4
    iget-object p1, p0, Lmu2;->g:Ljava/lang/Cloneable;

    .line 328
    .line 329
    check-cast p1, Lpe3;

    .line 330
    .line 331
    if-eqz p1, :cond_c

    .line 332
    .line 333
    invoke-virtual {p1}, Ln54;->b()V

    .line 334
    .line 335
    .line 336
    iget-object p1, p1, Ln54;->g:Lp54;

    .line 337
    .line 338
    check-cast p1, Lqe3;

    .line 339
    .line 340
    invoke-virtual {p1, v5, v6}, Lqe3;->A(J)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 341
    .line 342
    .line 343
    invoke-virtual {v0}, Ltf0;->d()V

    .line 344
    .line 345
    .line 346
    return-object v2

    .line 347
    :cond_c
    :try_start_5
    invoke-static {v3}, Li30;->S(Ljava/lang/String;)V

    .line 348
    .line 349
    .line 350
    throw v1

    .line 351
    :cond_d
    invoke-static {v3}, Li30;->S(Ljava/lang/String;)V

    .line 352
    .line 353
    .line 354
    throw v1

    .line 355
    :cond_e
    invoke-static {v3}, Li30;->S(Ljava/lang/String;)V

    .line 356
    .line 357
    .line 358
    throw v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 359
    :goto_5
    invoke-virtual {v0}, Ltf0;->d()V

    .line 360
    .line 361
    .line 362
    throw p1

    .line 363
    :catchall_1
    move-exception p1

    .line 364
    invoke-virtual {v1}, Ltf0;->d()V

    .line 365
    .line 366
    .line 367
    throw p1

    .line 368
    :cond_f
    return-object v5
.end method

.method public k(Lqj;)Ljava/lang/Object;
    .locals 14

    .line 1
    iget-object v0, p0, Lmu2;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ltf0;

    .line 4
    .line 5
    instance-of v1, p1, Lgf3;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    move-object v1, p1

    .line 10
    check-cast v1, Lgf3;

    .line 11
    .line 12
    iget v2, v1, Lgf3;->m:I

    .line 13
    .line 14
    const/high16 v3, -0x80000000

    .line 15
    .line 16
    and-int v4, v2, v3

    .line 17
    .line 18
    if-eqz v4, :cond_0

    .line 19
    .line 20
    sub-int/2addr v2, v3

    .line 21
    iput v2, v1, Lgf3;->m:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v1, Lgf3;

    .line 25
    .line 26
    invoke-direct {v1, p0, p1}, Lgf3;-><init>(Lmu2;Lqj;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object p1, v1, Lgf3;->k:Ljava/lang/Object;

    .line 30
    .line 31
    iget v2, v1, Lgf3;->m:I

    .line 32
    .line 33
    sget-object v3, Lz31;->a:Lz31;

    .line 34
    .line 35
    const/4 v4, 0x4

    .line 36
    const/4 v5, 0x3

    .line 37
    const/4 v6, 0x2

    .line 38
    const/4 v7, 0x1

    .line 39
    const/4 v8, 0x0

    .line 40
    sget-object v9, Lrk;->f:Lrk;

    .line 41
    .line 42
    if-eqz v2, :cond_5

    .line 43
    .line 44
    if-eq v2, v7, :cond_4

    .line 45
    .line 46
    if-eq v2, v6, :cond_3

    .line 47
    .line 48
    if-eq v2, v5, :cond_2

    .line 49
    .line 50
    if-ne v2, v4, :cond_1

    .line 51
    .line 52
    invoke-static {p1}, Lbd2;->x(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    return-object v3

    .line 56
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 57
    .line 58
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 59
    .line 60
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    throw p1

    .line 64
    :cond_2
    iget-object v0, v1, Lgf3;->i:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v0, Lqe3;

    .line 67
    .line 68
    invoke-static {p1}, Lbd2;->x(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    goto/16 :goto_3

    .line 72
    .line 73
    :cond_3
    iget-wide v6, v1, Lgf3;->j:J

    .line 74
    .line 75
    iget-object v0, v1, Lgf3;->i:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast v0, Lqf0;

    .line 78
    .line 79
    invoke-static {p1}, Lbd2;->x(Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    goto :goto_2

    .line 83
    :cond_4
    iget-object v2, v1, Lgf3;->i:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast v2, Lqf0;

    .line 86
    .line 87
    invoke-static {p1}, Lbd2;->x(Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_5
    invoke-static {p1}, Lbd2;->x(Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    iput-object v0, v1, Lgf3;->i:Ljava/lang/Object;

    .line 95
    .line 96
    iput v7, v1, Lgf3;->m:I

    .line 97
    .line 98
    invoke-virtual {v0, v1}, Ltf0;->c(Lqj;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    if-eq p1, v9, :cond_c

    .line 103
    .line 104
    move-object v2, v0

    .line 105
    :goto_1
    :try_start_0
    iget-boolean p1, p0, Lmu2;->a:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 106
    .line 107
    if-nez p1, :cond_6

    .line 108
    .line 109
    check-cast v2, Ltf0;

    .line 110
    .line 111
    invoke-virtual {v2}, Ltf0;->d()V

    .line 112
    .line 113
    .line 114
    return-object v3

    .line 115
    :cond_6
    const/4 p1, 0x0

    .line 116
    :try_start_1
    iput-boolean p1, p0, Lmu2;->a:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 117
    .line 118
    check-cast v2, Ltf0;

    .line 119
    .line 120
    invoke-virtual {v2}, Ltf0;->d()V

    .line 121
    .line 122
    .line 123
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 124
    .line 125
    .line 126
    move-result-wide v10

    .line 127
    iput-object v0, v1, Lgf3;->i:Ljava/lang/Object;

    .line 128
    .line 129
    iput-wide v10, v1, Lgf3;->j:J

    .line 130
    .line 131
    iput v6, v1, Lgf3;->m:I

    .line 132
    .line 133
    invoke-virtual {v0, v1}, Ltf0;->c(Lqj;)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object p1

    .line 137
    if-eq p1, v9, :cond_c

    .line 138
    .line 139
    move-wide v6, v10

    .line 140
    :goto_2
    :try_start_2
    iget-object p1, p0, Lmu2;->g:Ljava/lang/Cloneable;

    .line 141
    .line 142
    check-cast p1, Lpe3;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 143
    .line 144
    const-string v2, "adQualityDataBuilder"

    .line 145
    .line 146
    if-eqz p1, :cond_b

    .line 147
    .line 148
    :try_start_3
    iget-object v10, p1, Ln54;->g:Lp54;

    .line 149
    .line 150
    check-cast v10, Lqe3;

    .line 151
    .line 152
    invoke-virtual {v10}, Lqe3;->J()J

    .line 153
    .line 154
    .line 155
    move-result-wide v10

    .line 156
    sub-long v10, v6, v10

    .line 157
    .line 158
    iget-object v12, p0, Lmu2;->g:Ljava/lang/Cloneable;

    .line 159
    .line 160
    check-cast v12, Lpe3;

    .line 161
    .line 162
    if-eqz v12, :cond_a

    .line 163
    .line 164
    iget-object v12, v12, Ln54;->g:Lp54;

    .line 165
    .line 166
    check-cast v12, Lqe3;

    .line 167
    .line 168
    invoke-virtual {v12}, Lqe3;->I()J

    .line 169
    .line 170
    .line 171
    move-result-wide v12

    .line 172
    sub-long/2addr v10, v12

    .line 173
    invoke-virtual {p1}, Ln54;->b()V

    .line 174
    .line 175
    .line 176
    iget-object p1, p1, Ln54;->g:Lp54;

    .line 177
    .line 178
    check-cast p1, Lqe3;

    .line 179
    .line 180
    invoke-virtual {p1, v10, v11}, Lqe3;->T(J)V

    .line 181
    .line 182
    .line 183
    iget-object p1, p0, Lmu2;->g:Ljava/lang/Cloneable;

    .line 184
    .line 185
    check-cast p1, Lpe3;

    .line 186
    .line 187
    if-eqz p1, :cond_9

    .line 188
    .line 189
    invoke-virtual {p1}, Ln54;->b()V

    .line 190
    .line 191
    .line 192
    iget-object p1, p1, Ln54;->g:Lp54;

    .line 193
    .line 194
    check-cast p1, Lqe3;

    .line 195
    .line 196
    invoke-virtual {p1, v6, v7}, Lqe3;->a0(J)V

    .line 197
    .line 198
    .line 199
    iget-object p1, p0, Lmu2;->g:Ljava/lang/Cloneable;

    .line 200
    .line 201
    check-cast p1, Lpe3;

    .line 202
    .line 203
    if-eqz p1, :cond_8

    .line 204
    .line 205
    invoke-virtual {p1}, Ln54;->d()Lp54;

    .line 206
    .line 207
    .line 208
    move-result-object p1

    .line 209
    check-cast p1, Lqe3;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 210
    .line 211
    check-cast v0, Ltf0;

    .line 212
    .line 213
    invoke-virtual {v0}, Ltf0;->d()V

    .line 214
    .line 215
    .line 216
    iput-object p1, v1, Lgf3;->i:Ljava/lang/Object;

    .line 217
    .line 218
    iput v5, v1, Lgf3;->m:I

    .line 219
    .line 220
    invoke-virtual {p0, v1}, Lmu2;->q(Lqj;)Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object v0

    .line 224
    if-eq v0, v9, :cond_c

    .line 225
    .line 226
    move-object v0, p1

    .line 227
    :goto_3
    iget-object p1, p0, Lmu2;->i:Ljava/lang/Object;

    .line 228
    .line 229
    check-cast p1, Lvu2;

    .line 230
    .line 231
    invoke-virtual {p1, v0}, Lvu2;->a(Lqe3;)Z

    .line 232
    .line 233
    .line 234
    move-result p1

    .line 235
    if-eqz p1, :cond_7

    .line 236
    .line 237
    invoke-virtual {v0}, Lqe3;->D()Ljava/lang/String;

    .line 238
    .line 239
    .line 240
    move-result-object p1

    .line 241
    const-string v0, "getGwsQueryId(...)"

    .line 242
    .line 243
    invoke-static {p1, v0}, Li30;->l(Ljava/lang/Object;Ljava/lang/String;)V

    .line 244
    .line 245
    .line 246
    iput-object v8, v1, Lgf3;->i:Ljava/lang/Object;

    .line 247
    .line 248
    iput v4, v1, Lgf3;->m:I

    .line 249
    .line 250
    invoke-virtual {p0, p1, v1}, Lmu2;->n(Ljava/lang/String;Lqj;)Ljava/lang/Object;

    .line 251
    .line 252
    .line 253
    move-result-object p1

    .line 254
    if-ne p1, v9, :cond_7

    .line 255
    .line 256
    goto :goto_5

    .line 257
    :cond_7
    return-object v3

    .line 258
    :catchall_0
    move-exception p1

    .line 259
    goto :goto_4

    .line 260
    :cond_8
    :try_start_4
    invoke-static {v2}, Li30;->S(Ljava/lang/String;)V

    .line 261
    .line 262
    .line 263
    throw v8

    .line 264
    :cond_9
    invoke-static {v2}, Li30;->S(Ljava/lang/String;)V

    .line 265
    .line 266
    .line 267
    throw v8

    .line 268
    :cond_a
    invoke-static {v2}, Li30;->S(Ljava/lang/String;)V

    .line 269
    .line 270
    .line 271
    throw v8

    .line 272
    :cond_b
    invoke-static {v2}, Li30;->S(Ljava/lang/String;)V

    .line 273
    .line 274
    .line 275
    throw v8
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 276
    :goto_4
    check-cast v0, Ltf0;

    .line 277
    .line 278
    invoke-virtual {v0}, Ltf0;->d()V

    .line 279
    .line 280
    .line 281
    throw p1

    .line 282
    :catchall_1
    move-exception p1

    .line 283
    check-cast v2, Ltf0;

    .line 284
    .line 285
    invoke-virtual {v2}, Ltf0;->d()V

    .line 286
    .line 287
    .line 288
    throw p1

    .line 289
    :cond_c
    :goto_5
    return-object v9
.end method

.method public l(Lqj;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    iget-object v2, v1, Lmu2;->d:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v2, Ltf0;

    .line 8
    .line 9
    instance-of v3, v0, Lif3;

    .line 10
    .line 11
    if-eqz v3, :cond_0

    .line 12
    .line 13
    move-object v3, v0

    .line 14
    check-cast v3, Lif3;

    .line 15
    .line 16
    iget v4, v3, Lif3;->m:I

    .line 17
    .line 18
    const/high16 v5, -0x80000000

    .line 19
    .line 20
    and-int v6, v4, v5

    .line 21
    .line 22
    if-eqz v6, :cond_0

    .line 23
    .line 24
    sub-int/2addr v4, v5

    .line 25
    iput v4, v3, Lif3;->m:I

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    new-instance v3, Lif3;

    .line 29
    .line 30
    invoke-direct {v3, v1, v0}, Lif3;-><init>(Lmu2;Lqj;)V

    .line 31
    .line 32
    .line 33
    :goto_0
    iget-object v0, v3, Lif3;->k:Ljava/lang/Object;

    .line 34
    .line 35
    iget v4, v3, Lif3;->m:I

    .line 36
    .line 37
    sget-object v5, Lz31;->a:Lz31;

    .line 38
    .line 39
    const/4 v6, 0x4

    .line 40
    const/4 v7, 0x3

    .line 41
    const/4 v8, 0x2

    .line 42
    const/4 v9, 0x1

    .line 43
    const/4 v10, 0x0

    .line 44
    sget-object v11, Lrk;->f:Lrk;

    .line 45
    .line 46
    if-eqz v4, :cond_5

    .line 47
    .line 48
    if-eq v4, v9, :cond_4

    .line 49
    .line 50
    if-eq v4, v8, :cond_3

    .line 51
    .line 52
    if-eq v4, v7, :cond_2

    .line 53
    .line 54
    if-ne v4, v6, :cond_1

    .line 55
    .line 56
    invoke-static {v0}, Lbd2;->x(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    return-object v5

    .line 60
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 61
    .line 62
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 63
    .line 64
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    throw v0

    .line 68
    :cond_2
    iget-object v2, v3, Lif3;->i:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v2, Lqe3;

    .line 71
    .line 72
    invoke-static {v0}, Lbd2;->x(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    goto/16 :goto_3

    .line 76
    .line 77
    :cond_3
    iget-wide v12, v3, Lif3;->j:J

    .line 78
    .line 79
    iget-object v2, v3, Lif3;->i:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast v2, Lqf0;

    .line 82
    .line 83
    invoke-static {v0}, Lbd2;->x(Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    goto :goto_2

    .line 87
    :cond_4
    iget-object v4, v3, Lif3;->i:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast v4, Lqf0;

    .line 90
    .line 91
    invoke-static {v0}, Lbd2;->x(Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_5
    invoke-static {v0}, Lbd2;->x(Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    iput-object v2, v3, Lif3;->i:Ljava/lang/Object;

    .line 99
    .line 100
    iput v9, v3, Lif3;->m:I

    .line 101
    .line 102
    invoke-virtual {v2, v3}, Ltf0;->c(Lqj;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    if-eq v0, v11, :cond_d

    .line 107
    .line 108
    move-object v4, v2

    .line 109
    :goto_1
    :try_start_0
    iget-boolean v0, v1, Lmu2;->a:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 110
    .line 111
    if-nez v0, :cond_6

    .line 112
    .line 113
    check-cast v4, Ltf0;

    .line 114
    .line 115
    invoke-virtual {v4}, Ltf0;->d()V

    .line 116
    .line 117
    .line 118
    return-object v5

    .line 119
    :cond_6
    const/4 v0, 0x0

    .line 120
    :try_start_1
    iput-boolean v0, v1, Lmu2;->a:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 121
    .line 122
    check-cast v4, Ltf0;

    .line 123
    .line 124
    invoke-virtual {v4}, Ltf0;->d()V

    .line 125
    .line 126
    .line 127
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 128
    .line 129
    .line 130
    move-result-wide v12

    .line 131
    iput-object v2, v3, Lif3;->i:Ljava/lang/Object;

    .line 132
    .line 133
    iput-wide v12, v3, Lif3;->j:J

    .line 134
    .line 135
    iput v8, v3, Lif3;->m:I

    .line 136
    .line 137
    invoke-virtual {v2, v3}, Ltf0;->c(Lqj;)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    if-eq v0, v11, :cond_d

    .line 142
    .line 143
    :goto_2
    :try_start_2
    iget-object v0, v1, Lmu2;->g:Ljava/lang/Cloneable;

    .line 144
    .line 145
    check-cast v0, Lpe3;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 146
    .line 147
    const-string v4, "adQualityDataBuilder"

    .line 148
    .line 149
    if-eqz v0, :cond_c

    .line 150
    .line 151
    :try_start_3
    iget-object v8, v0, Ln54;->g:Lp54;

    .line 152
    .line 153
    check-cast v8, Lqe3;

    .line 154
    .line 155
    invoke-virtual {v8}, Lqe3;->J()J

    .line 156
    .line 157
    .line 158
    move-result-wide v14

    .line 159
    sub-long v14, v12, v14

    .line 160
    .line 161
    iget-object v8, v1, Lmu2;->g:Ljava/lang/Cloneable;

    .line 162
    .line 163
    check-cast v8, Lpe3;

    .line 164
    .line 165
    if-eqz v8, :cond_b

    .line 166
    .line 167
    iget-object v8, v8, Ln54;->g:Lp54;

    .line 168
    .line 169
    check-cast v8, Lqe3;

    .line 170
    .line 171
    invoke-virtual {v8}, Lqe3;->I()J

    .line 172
    .line 173
    .line 174
    move-result-wide v16

    .line 175
    sub-long v14, v14, v16

    .line 176
    .line 177
    invoke-virtual {v0}, Ln54;->b()V

    .line 178
    .line 179
    .line 180
    iget-object v0, v0, Ln54;->g:Lp54;

    .line 181
    .line 182
    check-cast v0, Lqe3;

    .line 183
    .line 184
    invoke-virtual {v0, v14, v15}, Lqe3;->T(J)V

    .line 185
    .line 186
    .line 187
    iget-object v0, v1, Lmu2;->g:Ljava/lang/Cloneable;

    .line 188
    .line 189
    check-cast v0, Lpe3;

    .line 190
    .line 191
    if-eqz v0, :cond_a

    .line 192
    .line 193
    invoke-virtual {v0}, Ln54;->b()V

    .line 194
    .line 195
    .line 196
    iget-object v0, v0, Ln54;->g:Lp54;

    .line 197
    .line 198
    check-cast v0, Lqe3;

    .line 199
    .line 200
    invoke-virtual {v0, v12, v13}, Lqe3;->Z(J)V

    .line 201
    .line 202
    .line 203
    iget-object v0, v1, Lmu2;->g:Ljava/lang/Cloneable;

    .line 204
    .line 205
    check-cast v0, Lpe3;

    .line 206
    .line 207
    if-eqz v0, :cond_9

    .line 208
    .line 209
    invoke-virtual {v0}, Ln54;->b()V

    .line 210
    .line 211
    .line 212
    iget-object v0, v0, Ln54;->g:Lp54;

    .line 213
    .line 214
    check-cast v0, Lqe3;

    .line 215
    .line 216
    invoke-virtual {v0, v9}, Lqe3;->V(Z)V

    .line 217
    .line 218
    .line 219
    iget-object v0, v1, Lmu2;->g:Ljava/lang/Cloneable;

    .line 220
    .line 221
    check-cast v0, Lpe3;

    .line 222
    .line 223
    if-eqz v0, :cond_8

    .line 224
    .line 225
    invoke-virtual {v0}, Ln54;->d()Lp54;

    .line 226
    .line 227
    .line 228
    move-result-object v0

    .line 229
    check-cast v0, Lqe3;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 230
    .line 231
    check-cast v2, Ltf0;

    .line 232
    .line 233
    invoke-virtual {v2}, Ltf0;->d()V

    .line 234
    .line 235
    .line 236
    iput-object v0, v3, Lif3;->i:Ljava/lang/Object;

    .line 237
    .line 238
    iput v7, v3, Lif3;->m:I

    .line 239
    .line 240
    invoke-virtual {v1, v3}, Lmu2;->q(Lqj;)Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    move-result-object v2

    .line 244
    if-eq v2, v11, :cond_d

    .line 245
    .line 246
    move-object v2, v0

    .line 247
    :goto_3
    iget-object v0, v1, Lmu2;->i:Ljava/lang/Object;

    .line 248
    .line 249
    check-cast v0, Lvu2;

    .line 250
    .line 251
    invoke-virtual {v0, v2}, Lvu2;->a(Lqe3;)Z

    .line 252
    .line 253
    .line 254
    move-result v0

    .line 255
    if-eqz v0, :cond_7

    .line 256
    .line 257
    invoke-virtual {v2}, Lqe3;->D()Ljava/lang/String;

    .line 258
    .line 259
    .line 260
    move-result-object v0

    .line 261
    const-string v2, "getGwsQueryId(...)"

    .line 262
    .line 263
    invoke-static {v0, v2}, Li30;->l(Ljava/lang/Object;Ljava/lang/String;)V

    .line 264
    .line 265
    .line 266
    iput-object v10, v3, Lif3;->i:Ljava/lang/Object;

    .line 267
    .line 268
    iput v6, v3, Lif3;->m:I

    .line 269
    .line 270
    invoke-virtual {v1, v0, v3}, Lmu2;->n(Ljava/lang/String;Lqj;)Ljava/lang/Object;

    .line 271
    .line 272
    .line 273
    move-result-object v0

    .line 274
    if-ne v0, v11, :cond_7

    .line 275
    .line 276
    goto :goto_5

    .line 277
    :cond_7
    return-object v5

    .line 278
    :catchall_0
    move-exception v0

    .line 279
    goto :goto_4

    .line 280
    :cond_8
    :try_start_4
    invoke-static {v4}, Li30;->S(Ljava/lang/String;)V

    .line 281
    .line 282
    .line 283
    throw v10

    .line 284
    :cond_9
    invoke-static {v4}, Li30;->S(Ljava/lang/String;)V

    .line 285
    .line 286
    .line 287
    throw v10

    .line 288
    :cond_a
    invoke-static {v4}, Li30;->S(Ljava/lang/String;)V

    .line 289
    .line 290
    .line 291
    throw v10

    .line 292
    :cond_b
    invoke-static {v4}, Li30;->S(Ljava/lang/String;)V

    .line 293
    .line 294
    .line 295
    throw v10

    .line 296
    :cond_c
    invoke-static {v4}, Li30;->S(Ljava/lang/String;)V

    .line 297
    .line 298
    .line 299
    throw v10
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 300
    :goto_4
    check-cast v2, Ltf0;

    .line 301
    .line 302
    invoke-virtual {v2}, Ltf0;->d()V

    .line 303
    .line 304
    .line 305
    throw v0

    .line 306
    :catchall_1
    move-exception v0

    .line 307
    check-cast v4, Ltf0;

    .line 308
    .line 309
    invoke-virtual {v4}, Ltf0;->d()V

    .line 310
    .line 311
    .line 312
    throw v0

    .line 313
    :cond_d
    :goto_5
    return-object v11
.end method

.method public m(Lqj;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p1, Lff3;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lff3;

    .line 7
    .line 8
    iget v1, v0, Lff3;->m:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lff3;->m:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lff3;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lff3;-><init>(Lmu2;Lqj;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lff3;->k:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lff3;->m:I

    .line 28
    .line 29
    const/4 v2, 0x1

    .line 30
    if-eqz v1, :cond_2

    .line 31
    .line 32
    if-ne v1, v2, :cond_1

    .line 33
    .line 34
    iget-wide v1, v0, Lff3;->i:J

    .line 35
    .line 36
    iget-object v0, v0, Lff3;->j:Ltf0;

    .line 37
    .line 38
    invoke-static {p1}, Lbd2;->x(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 43
    .line 44
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 45
    .line 46
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    throw p1

    .line 50
    :cond_2
    invoke-static {p1}, Lbd2;->x(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    iget-object p1, p0, Lmu2;->d:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast p1, Ltf0;

    .line 56
    .line 57
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 58
    .line 59
    .line 60
    move-result-wide v3

    .line 61
    iput-object p1, v0, Lff3;->j:Ltf0;

    .line 62
    .line 63
    iput-wide v3, v0, Lff3;->i:J

    .line 64
    .line 65
    iput v2, v0, Lff3;->m:I

    .line 66
    .line 67
    invoke-virtual {p1, v0}, Ltf0;->c(Lqj;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    sget-object v1, Lrk;->f:Lrk;

    .line 72
    .line 73
    if-eq v0, v1, :cond_4

    .line 74
    .line 75
    move-object v0, p1

    .line 76
    move-wide v1, v3

    .line 77
    :goto_1
    :try_start_0
    iget-object p1, p0, Lmu2;->g:Ljava/lang/Cloneable;

    .line 78
    .line 79
    check-cast p1, Lpe3;

    .line 80
    .line 81
    if-eqz p1, :cond_3

    .line 82
    .line 83
    invoke-virtual {p1}, Ln54;->b()V

    .line 84
    .line 85
    .line 86
    iget-object p1, p1, Ln54;->g:Lp54;

    .line 87
    .line 88
    check-cast p1, Lqe3;

    .line 89
    .line 90
    invoke-virtual {p1, v1, v2}, Lqe3;->B(J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 91
    .line 92
    .line 93
    invoke-virtual {v0}, Ltf0;->d()V

    .line 94
    .line 95
    .line 96
    sget-object p1, Lz31;->a:Lz31;

    .line 97
    .line 98
    return-object p1

    .line 99
    :cond_3
    :try_start_1
    const-string p1, "adQualityDataBuilder"

    .line 100
    .line 101
    invoke-static {p1}, Li30;->S(Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    const/4 p1, 0x0

    .line 105
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 106
    :catchall_0
    move-exception p1

    .line 107
    invoke-virtual {v0}, Ltf0;->d()V

    .line 108
    .line 109
    .line 110
    throw p1

    .line 111
    :cond_4
    return-object v1
.end method

.method public n(Ljava/lang/String;Lqj;)Ljava/lang/Object;
    .locals 8

    .line 1
    instance-of v0, p2, Lwe3;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lwe3;

    .line 7
    .line 8
    iget v1, v0, Lwe3;->m:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lwe3;->m:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lwe3;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lwe3;-><init>(Lmu2;Lqj;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lwe3;->k:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lwe3;->m:I

    .line 28
    .line 29
    const/4 v2, 0x2

    .line 30
    const/4 v3, 0x1

    .line 31
    sget-object v4, Lrk;->f:Lrk;

    .line 32
    .line 33
    if-eqz v1, :cond_3

    .line 34
    .line 35
    if-eq v1, v3, :cond_2

    .line 36
    .line 37
    if-ne v1, v2, :cond_1

    .line 38
    .line 39
    iget-object p1, v0, Lwe3;->i:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast p1, Lqf0;

    .line 42
    .line 43
    :try_start_0
    invoke-static {p2}, Lbd2;->x(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 44
    .line 45
    .line 46
    goto :goto_2

    .line 47
    :catchall_0
    move-exception p2

    .line 48
    goto :goto_3

    .line 49
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 50
    .line 51
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 52
    .line 53
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    throw p1

    .line 57
    :cond_2
    iget-object p1, v0, Lwe3;->j:Ltf0;

    .line 58
    .line 59
    iget-object v1, v0, Lwe3;->i:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v1, Ljava/lang/String;

    .line 62
    .line 63
    invoke-static {p2}, Lbd2;->x(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    move-object p2, p1

    .line 67
    move-object p1, v1

    .line 68
    goto :goto_1

    .line 69
    :cond_3
    invoke-static {p2}, Lbd2;->x(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    iget-object p2, p0, Lmu2;->f:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast p2, Ltf0;

    .line 75
    .line 76
    iput-object p1, v0, Lwe3;->i:Ljava/lang/Object;

    .line 77
    .line 78
    iput-object p2, v0, Lwe3;->j:Ltf0;

    .line 79
    .line 80
    iput v3, v0, Lwe3;->m:I

    .line 81
    .line 82
    invoke-virtual {p2, v0}, Ltf0;->c(Lqj;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    if-eq v1, v4, :cond_4

    .line 87
    .line 88
    :goto_1
    :try_start_1
    iget-object v1, p0, Lmu2;->h:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v1, Lpm;

    .line 91
    .line 92
    new-instance v3, Lpa0;

    .line 93
    .line 94
    const/4 v5, 0x4

    .line 95
    const/4 v6, 0x0

    .line 96
    invoke-direct {v3, p1, v6, v5}, Lpa0;-><init>(Ljava/lang/Object;Loj;I)V

    .line 97
    .line 98
    .line 99
    iput-object p2, v0, Lwe3;->i:Ljava/lang/Object;

    .line 100
    .line 101
    iput-object v6, v0, Lwe3;->j:Ltf0;

    .line 102
    .line 103
    iput v2, v0, Lwe3;->m:I

    .line 104
    .line 105
    check-cast v1, Lyw0;

    .line 106
    .line 107
    invoke-virtual {v1, v3, v0}, Lyw0;->i(Lhy;Lqj;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 111
    if-eq p1, v4, :cond_4

    .line 112
    .line 113
    move-object v7, p2

    .line 114
    move-object p2, p1

    .line 115
    move-object p1, v7

    .line 116
    :goto_2
    :try_start_2
    check-cast p2, Lte3;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 117
    .line 118
    check-cast p1, Ltf0;

    .line 119
    .line 120
    invoke-virtual {p1}, Ltf0;->d()V

    .line 121
    .line 122
    .line 123
    sget-object p1, Lz31;->a:Lz31;

    .line 124
    .line 125
    return-object p1

    .line 126
    :catchall_1
    move-exception p1

    .line 127
    move-object v7, p2

    .line 128
    move-object p2, p1

    .line 129
    move-object p1, v7

    .line 130
    :goto_3
    check-cast p1, Ltf0;

    .line 131
    .line 132
    invoke-virtual {p1}, Ltf0;->d()V

    .line 133
    .line 134
    .line 135
    throw p2

    .line 136
    :cond_4
    return-object v4
.end method

.method public o(Lqj;)Ljava/lang/Object;
    .locals 7

    .line 1
    instance-of v0, p1, Lye3;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lye3;

    .line 7
    .line 8
    iget v1, v0, Lye3;->l:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lye3;->l:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lye3;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lye3;-><init>(Lmu2;Lqj;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lye3;->j:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lye3;->l:I

    .line 28
    .line 29
    const/4 v2, 0x1

    .line 30
    const/4 v3, 0x2

    .line 31
    sget-object v4, Lrk;->f:Lrk;

    .line 32
    .line 33
    if-eqz v1, :cond_3

    .line 34
    .line 35
    if-eq v1, v2, :cond_2

    .line 36
    .line 37
    if-ne v1, v3, :cond_1

    .line 38
    .line 39
    iget-object v0, v0, Lye3;->i:Lqf0;

    .line 40
    .line 41
    :try_start_0
    invoke-static {p1}, Lbd2;->x(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 42
    .line 43
    .line 44
    goto :goto_2

    .line 45
    :catchall_0
    move-exception p1

    .line 46
    goto :goto_3

    .line 47
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 48
    .line 49
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 50
    .line 51
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    throw p1

    .line 55
    :cond_2
    iget-object v1, v0, Lye3;->i:Lqf0;

    .line 56
    .line 57
    invoke-static {p1}, Lbd2;->x(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    move-object p1, v1

    .line 61
    goto :goto_1

    .line 62
    :cond_3
    invoke-static {p1}, Lbd2;->x(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    iget-object p1, p0, Lmu2;->f:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast p1, Ltf0;

    .line 68
    .line 69
    iput-object p1, v0, Lye3;->i:Lqf0;

    .line 70
    .line 71
    iput v2, v0, Lye3;->l:I

    .line 72
    .line 73
    invoke-virtual {p1, v0}, Ltf0;->c(Lqj;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    if-eq v1, v4, :cond_4

    .line 78
    .line 79
    :goto_1
    :try_start_1
    iget-object v1, p0, Lmu2;->h:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast v1, Lpm;

    .line 82
    .line 83
    new-instance v2, Lze3;

    .line 84
    .line 85
    const/4 v5, 0x0

    .line 86
    invoke-direct {v2, v3, v5}, Lmz0;-><init>(ILoj;)V

    .line 87
    .line 88
    .line 89
    iput-object p1, v0, Lye3;->i:Lqf0;

    .line 90
    .line 91
    iput v3, v0, Lye3;->l:I

    .line 92
    .line 93
    check-cast v1, Lyw0;

    .line 94
    .line 95
    invoke-virtual {v1, v2, v0}, Lyw0;->i(Lhy;Lqj;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 99
    if-eq v0, v4, :cond_4

    .line 100
    .line 101
    move-object v6, v0

    .line 102
    move-object v0, p1

    .line 103
    move-object p1, v6

    .line 104
    :goto_2
    :try_start_2
    check-cast p1, Lte3;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 105
    .line 106
    check-cast v0, Ltf0;

    .line 107
    .line 108
    invoke-virtual {v0}, Ltf0;->d()V

    .line 109
    .line 110
    .line 111
    sget-object p1, Lz31;->a:Lz31;

    .line 112
    .line 113
    return-object p1

    .line 114
    :catchall_1
    move-exception v0

    .line 115
    move-object v6, v0

    .line 116
    move-object v0, p1

    .line 117
    move-object p1, v6

    .line 118
    :goto_3
    check-cast v0, Ltf0;

    .line 119
    .line 120
    invoke-virtual {v0}, Ltf0;->d()V

    .line 121
    .line 122
    .line 123
    throw p1

    .line 124
    :cond_4
    return-object v4
.end method

.method public p(JLqj;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p3, Lxe3;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lxe3;

    .line 7
    .line 8
    iget v1, v0, Lxe3;->m:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lxe3;->m:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lxe3;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, Lxe3;-><init>(Lmu2;Lqj;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Lxe3;->k:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lxe3;->m:I

    .line 28
    .line 29
    const/4 v2, 0x1

    .line 30
    if-eqz v1, :cond_2

    .line 31
    .line 32
    if-ne v1, v2, :cond_1

    .line 33
    .line 34
    iget-wide p1, v0, Lxe3;->i:J

    .line 35
    .line 36
    iget-object v0, v0, Lxe3;->j:Ltf0;

    .line 37
    .line 38
    invoke-static {p3}, Lbd2;->x(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 43
    .line 44
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 45
    .line 46
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    throw p1

    .line 50
    :cond_2
    invoke-static {p3}, Lbd2;->x(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    iget-object p3, p0, Lmu2;->d:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast p3, Ltf0;

    .line 56
    .line 57
    iput-object p3, v0, Lxe3;->j:Ltf0;

    .line 58
    .line 59
    iput-wide p1, v0, Lxe3;->i:J

    .line 60
    .line 61
    iput v2, v0, Lxe3;->m:I

    .line 62
    .line 63
    invoke-virtual {p3, v0}, Ltf0;->c(Lqj;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    sget-object v1, Lrk;->f:Lrk;

    .line 68
    .line 69
    if-eq v0, v1, :cond_5

    .line 70
    .line 71
    move-object v0, p3

    .line 72
    :goto_1
    :try_start_0
    iget-object p3, p0, Lmu2;->g:Ljava/lang/Cloneable;

    .line 73
    .line 74
    check-cast p3, Lpe3;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 75
    .line 76
    const/4 v1, 0x0

    .line 77
    const-string v2, "adQualityDataBuilder"

    .line 78
    .line 79
    if-eqz p3, :cond_4

    .line 80
    .line 81
    :try_start_1
    iget-object v3, p3, Ln54;->g:Lp54;

    .line 82
    .line 83
    check-cast v3, Lqe3;

    .line 84
    .line 85
    invoke-virtual {v3}, Lqe3;->J()J

    .line 86
    .line 87
    .line 88
    move-result-wide v3

    .line 89
    sub-long/2addr p1, v3

    .line 90
    iget-object v3, p0, Lmu2;->g:Ljava/lang/Cloneable;

    .line 91
    .line 92
    check-cast v3, Lpe3;

    .line 93
    .line 94
    if-eqz v3, :cond_3

    .line 95
    .line 96
    iget-object v1, v3, Ln54;->g:Lp54;

    .line 97
    .line 98
    check-cast v1, Lqe3;

    .line 99
    .line 100
    invoke-virtual {v1}, Lqe3;->I()J

    .line 101
    .line 102
    .line 103
    move-result-wide v1

    .line 104
    sub-long/2addr p1, v1

    .line 105
    invoke-virtual {p3}, Ln54;->b()V

    .line 106
    .line 107
    .line 108
    iget-object p3, p3, Ln54;->g:Lp54;

    .line 109
    .line 110
    check-cast p3, Lqe3;

    .line 111
    .line 112
    invoke-virtual {p3, p1, p2}, Lqe3;->T(J)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 113
    .line 114
    .line 115
    invoke-virtual {v0}, Ltf0;->d()V

    .line 116
    .line 117
    .line 118
    sget-object p1, Lz31;->a:Lz31;

    .line 119
    .line 120
    return-object p1

    .line 121
    :catchall_0
    move-exception p1

    .line 122
    goto :goto_2

    .line 123
    :cond_3
    :try_start_2
    invoke-static {v2}, Li30;->S(Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    throw v1

    .line 127
    :cond_4
    invoke-static {v2}, Li30;->S(Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    throw v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 131
    :goto_2
    invoke-virtual {v0}, Ltf0;->d()V

    .line 132
    .line 133
    .line 134
    throw p1

    .line 135
    :cond_5
    return-object v1
.end method

.method public q(Lqj;)Ljava/lang/Object;
    .locals 8

    .line 1
    instance-of v0, p1, Ldf3;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Ldf3;

    .line 7
    .line 8
    iget v1, v0, Ldf3;->m:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Ldf3;->m:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Ldf3;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Ldf3;-><init>(Lmu2;Lqj;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Ldf3;->k:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Ldf3;->m:I

    .line 28
    .line 29
    const/4 v2, 0x3

    .line 30
    const/4 v3, 0x2

    .line 31
    const/4 v4, 0x1

    .line 32
    const/4 v5, 0x0

    .line 33
    sget-object v6, Lrk;->f:Lrk;

    .line 34
    .line 35
    if-eqz v1, :cond_4

    .line 36
    .line 37
    if-eq v1, v4, :cond_3

    .line 38
    .line 39
    if-eq v1, v3, :cond_2

    .line 40
    .line 41
    if-ne v1, v2, :cond_1

    .line 42
    .line 43
    iget-object v0, v0, Ldf3;->i:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v0, Lqf0;

    .line 46
    .line 47
    :try_start_0
    invoke-static {p1}, Lbd2;->x(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 48
    .line 49
    .line 50
    goto :goto_3

    .line 51
    :catchall_0
    move-exception p1

    .line 52
    goto/16 :goto_4

    .line 53
    .line 54
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 55
    .line 56
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 57
    .line 58
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    throw p1

    .line 62
    :cond_2
    iget-object v1, v0, Ldf3;->j:Ltf0;

    .line 63
    .line 64
    iget-object v3, v0, Ldf3;->i:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v3, Lqe3;

    .line 67
    .line 68
    invoke-static {p1}, Lbd2;->x(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    goto :goto_2

    .line 72
    :cond_3
    iget-object v1, v0, Ldf3;->i:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v1, Lqf0;

    .line 75
    .line 76
    invoke-static {p1}, Lbd2;->x(Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_4
    invoke-static {p1}, Lbd2;->x(Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    iget-object p1, p0, Lmu2;->d:Ljava/lang/Object;

    .line 84
    .line 85
    move-object v1, p1

    .line 86
    check-cast v1, Ltf0;

    .line 87
    .line 88
    iput-object v1, v0, Ldf3;->i:Ljava/lang/Object;

    .line 89
    .line 90
    iput v4, v0, Ldf3;->m:I

    .line 91
    .line 92
    invoke-virtual {v1, v0}, Ltf0;->c(Lqj;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    if-eq p1, v6, :cond_6

    .line 97
    .line 98
    :goto_1
    :try_start_1
    iget-object p1, p0, Lmu2;->g:Ljava/lang/Cloneable;

    .line 99
    .line 100
    check-cast p1, Lpe3;

    .line 101
    .line 102
    if-eqz p1, :cond_5

    .line 103
    .line 104
    invoke-virtual {p1}, Ln54;->d()Lp54;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    check-cast p1, Lqe3;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 109
    .line 110
    check-cast v1, Ltf0;

    .line 111
    .line 112
    invoke-virtual {v1}, Ltf0;->d()V

    .line 113
    .line 114
    .line 115
    iget-object v1, p0, Lmu2;->f:Ljava/lang/Object;

    .line 116
    .line 117
    check-cast v1, Ltf0;

    .line 118
    .line 119
    iput-object p1, v0, Ldf3;->i:Ljava/lang/Object;

    .line 120
    .line 121
    iput-object v1, v0, Ldf3;->j:Ltf0;

    .line 122
    .line 123
    iput v3, v0, Ldf3;->m:I

    .line 124
    .line 125
    invoke-virtual {v1, v0}, Ltf0;->c(Lqj;)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v3

    .line 129
    if-eq v3, v6, :cond_6

    .line 130
    .line 131
    move-object v3, p1

    .line 132
    :goto_2
    :try_start_2
    iget-object p1, p0, Lmu2;->h:Ljava/lang/Object;

    .line 133
    .line 134
    check-cast p1, Lpm;

    .line 135
    .line 136
    new-instance v4, Lpa0;

    .line 137
    .line 138
    const/4 v7, 0x5

    .line 139
    invoke-direct {v4, v3, v5, v7}, Lpa0;-><init>(Ljava/lang/Object;Loj;I)V

    .line 140
    .line 141
    .line 142
    iput-object v1, v0, Ldf3;->i:Ljava/lang/Object;

    .line 143
    .line 144
    iput-object v5, v0, Ldf3;->j:Ltf0;

    .line 145
    .line 146
    iput v2, v0, Ldf3;->m:I

    .line 147
    .line 148
    check-cast p1, Lyw0;

    .line 149
    .line 150
    invoke-virtual {p1, v4, v0}, Lyw0;->i(Lhy;Lqj;)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 154
    if-eq p1, v6, :cond_6

    .line 155
    .line 156
    move-object v0, v1

    .line 157
    :goto_3
    :try_start_3
    check-cast p1, Lte3;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 158
    .line 159
    check-cast v0, Ltf0;

    .line 160
    .line 161
    invoke-virtual {v0}, Ltf0;->d()V

    .line 162
    .line 163
    .line 164
    sget-object p1, Lz31;->a:Lz31;

    .line 165
    .line 166
    return-object p1

    .line 167
    :catchall_1
    move-exception p1

    .line 168
    move-object v0, v1

    .line 169
    :goto_4
    check-cast v0, Ltf0;

    .line 170
    .line 171
    invoke-virtual {v0}, Ltf0;->d()V

    .line 172
    .line 173
    .line 174
    throw p1

    .line 175
    :catchall_2
    move-exception p1

    .line 176
    goto :goto_5

    .line 177
    :cond_5
    :try_start_4
    const-string p1, "adQualityDataBuilder"

    .line 178
    .line 179
    invoke-static {p1}, Li30;->S(Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    throw v5
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 183
    :goto_5
    check-cast v1, Ltf0;

    .line 184
    .line 185
    invoke-virtual {v1}, Ltf0;->d()V

    .line 186
    .line 187
    .line 188
    throw p1

    .line 189
    :cond_6
    return-object v6
.end method
