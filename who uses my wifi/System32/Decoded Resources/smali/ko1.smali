.class public final Lko1;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final a:Ljava/lang/Object;

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/lang/Object;

.field public final d:Ljava/lang/Object;

.field public final e:Ljava/lang/Object;

.field public final f:Ljava/lang/Object;

.field public final g:Ljava/lang/Object;

.field public h:Ljava/lang/Object;

.field public final i:Ljava/lang/Object;

.field public final j:Ljava/lang/Object;

.field public final k:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lh83;La83;Lfn2;Lqn2;Ls63;Lrm2;Lpo2;Lsn2;Lsp2;Lgm2;Lxv2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lko1;->a:Ljava/lang/Object;

    iput-object p2, p0, Lko1;->b:Ljava/lang/Object;

    iput-object p3, p0, Lko1;->c:Ljava/lang/Object;

    iput-object p4, p0, Lko1;->d:Ljava/lang/Object;

    iput-object p5, p0, Lko1;->e:Ljava/lang/Object;

    iput-object p6, p0, Lko1;->f:Ljava/lang/Object;

    iput-object p7, p0, Lko1;->g:Ljava/lang/Object;

    iput-object p8, p0, Lko1;->h:Ljava/lang/Object;

    iput-object p9, p0, Lko1;->i:Ljava/lang/Object;

    iput-object p10, p0, Lko1;->j:Ljava/lang/Object;

    iput-object p11, p0, Lko1;->k:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lwo1;Lvq2;)V
    .locals 3

    .line 2
    new-instance v0, Lf20;

    new-instance v1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    invoke-direct {v0, v1}, Lf20;-><init>(Landroid/os/Handler;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v1, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 3
    invoke-direct {v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object v1, p0, Lko1;->a:Ljava/lang/Object;

    new-instance v1, Ljava/util/HashSet;

    .line 4
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    iput-object v1, p0, Lko1;->b:Ljava/lang/Object;

    .line 5
    new-instance v1, Ljava/util/concurrent/PriorityBlockingQueue;

    invoke-direct {v1}, Ljava/util/concurrent/PriorityBlockingQueue;-><init>()V

    iput-object v1, p0, Lko1;->c:Ljava/lang/Object;

    new-instance v1, Ljava/util/concurrent/PriorityBlockingQueue;

    .line 6
    invoke-direct {v1}, Ljava/util/concurrent/PriorityBlockingQueue;-><init>()V

    iput-object v1, p0, Lko1;->d:Ljava/lang/Object;

    new-instance v1, Ljava/util/ArrayList;

    .line 7
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lko1;->i:Ljava/lang/Object;

    new-instance v1, Ljava/util/ArrayList;

    .line 8
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lko1;->j:Ljava/lang/Object;

    iput-object p1, p0, Lko1;->e:Ljava/lang/Object;

    iput-object p2, p0, Lko1;->f:Ljava/lang/Object;

    const/4 p1, 0x4

    new-array p1, p1, [Lfo1;

    iput-object p1, p0, Lko1;->g:Ljava/lang/Object;

    iput-object v0, p0, Lko1;->k:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 8

    .line 1
    iget-object v0, p0, Lko1;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lbo1;

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iput-boolean v1, v0, Lbo1;->i:Z

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    .line 11
    .line 12
    .line 13
    :cond_0
    iget-object v0, p0, Lko1;->g:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, [Lfo1;

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    move v3, v2

    .line 19
    :goto_0
    const/4 v4, 0x4

    .line 20
    if-ge v3, v4, :cond_2

    .line 21
    .line 22
    aget-object v4, v0, v3

    .line 23
    .line 24
    if-eqz v4, :cond_1

    .line 25
    .line 26
    iput-boolean v1, v4, Lfo1;->i:Z

    .line 27
    .line 28
    invoke-virtual {v4}, Ljava/lang/Thread;->interrupt()V

    .line 29
    .line 30
    .line 31
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_2
    iget-object v1, p0, Lko1;->c:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v1, Ljava/util/concurrent/PriorityBlockingQueue;

    .line 37
    .line 38
    iget-object v3, p0, Lko1;->d:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v3, Ljava/util/concurrent/PriorityBlockingQueue;

    .line 41
    .line 42
    iget-object v5, p0, Lko1;->e:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v5, Lwo1;

    .line 45
    .line 46
    iget-object v6, p0, Lko1;->k:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v6, Lf20;

    .line 49
    .line 50
    new-instance v7, Lbo1;

    .line 51
    .line 52
    invoke-direct {v7, v1, v3, v5, v6}, Lbo1;-><init>(Ljava/util/concurrent/PriorityBlockingQueue;Ljava/util/concurrent/PriorityBlockingQueue;Lwo1;Lf20;)V

    .line 53
    .line 54
    .line 55
    iput-object v7, p0, Lko1;->h:Ljava/lang/Object;

    .line 56
    .line 57
    invoke-virtual {v7}, Ljava/lang/Thread;->start()V

    .line 58
    .line 59
    .line 60
    :goto_1
    if-ge v2, v4, :cond_3

    .line 61
    .line 62
    iget-object v1, p0, Lko1;->f:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v1, Lvq2;

    .line 65
    .line 66
    new-instance v7, Lfo1;

    .line 67
    .line 68
    invoke-direct {v7, v3, v1, v5, v6}, Lfo1;-><init>(Ljava/util/concurrent/PriorityBlockingQueue;Lvq2;Lwo1;Lf20;)V

    .line 69
    .line 70
    .line 71
    aput-object v7, v0, v2

    .line 72
    .line 73
    invoke-virtual {v7}, Ljava/lang/Thread;->start()V

    .line 74
    .line 75
    .line 76
    add-int/lit8 v2, v2, 0x1

    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_3
    return-void
.end method

.method public b(Ljo1;)V
    .locals 1

    .line 1
    iput-object p0, p1, Ljo1;->m:Lko1;

    .line 2
    .line 3
    iget-object v0, p0, Lko1;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Ljava/util/HashSet;

    .line 6
    .line 7
    monitor-enter v0

    .line 8
    :try_start_0
    invoke-virtual {v0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    iget-object v0, p0, Lko1;->a:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    iput-object v0, p1, Ljo1;->l:Ljava/lang/Integer;

    .line 25
    .line 26
    const-string v0, "add-to-queue"

    .line 27
    .line 28
    invoke-virtual {p1, v0}, Ljo1;->a(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, Lko1;->c()V

    .line 32
    .line 33
    .line 34
    iget-object v0, p0, Lko1;->c:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v0, Ljava/util/concurrent/PriorityBlockingQueue;

    .line 37
    .line 38
    invoke-virtual {v0, p1}, Ljava/util/concurrent/PriorityBlockingQueue;->add(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :catchall_0
    move-exception p1

    .line 43
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 44
    throw p1
.end method

.method public c()V
    .locals 3

    .line 1
    iget-object v0, p0, Lko1;->j:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/ArrayList;

    .line 4
    .line 5
    monitor-enter v0

    .line 6
    :try_start_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-nez v2, :cond_0

    .line 15
    .line 16
    monitor-exit v0

    .line 17
    return-void

    .line 18
    :catchall_0
    move-exception v1

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    if-nez v1, :cond_1

    .line 25
    .line 26
    const/4 v1, 0x0

    .line 27
    throw v1

    .line 28
    :cond_1
    new-instance v1, Ljava/lang/ClassCastException;

    .line 29
    .line 30
    invoke-direct {v1}, Ljava/lang/ClassCastException;-><init>()V

    .line 31
    .line 32
    .line 33
    throw v1

    .line 34
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 35
    throw v1
.end method
