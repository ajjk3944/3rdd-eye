.class public final Lwg3;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lpg3;
.implements Lng3;
.implements Llh3;


# static fields
.field public static final t:Lp74;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Ljava/util/concurrent/ScheduledExecutorService;

.field public final c:Ljava/util/concurrent/ExecutorService;

.field public final d:Lhg3;

.field public final e:Z

.field public final f:Ljava/lang/String;

.field public final g:J

.field public final h:J

.field public final i:D

.field public final j:Ljava/lang/String;

.field public final k:J

.field public final l:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final m:Ljava/lang/Object;

.field public final n:Ljava/lang/Object;

.field public final o:Ljava/lang/Object;

.field public final p:Lrq1;

.field public final q:Ljava/util/ArrayList;

.field public r:Z

.field public final s:Ljava/util/HashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    invoke-static {}, Lp74;->A()Ll74;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ln54;->b()V

    .line 6
    .line 7
    .line 8
    iget-object v1, v0, Ln54;->g:Lp54;

    .line 9
    .line 10
    check-cast v1, Lp74;

    .line 11
    .line 12
    const/16 v2, 0x11

    .line 13
    .line 14
    invoke-virtual {v1, v2}, Lp74;->B(I)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Ln54;->d()Lp54;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Lp74;

    .line 22
    .line 23
    sput-object v0, Lwg3;->t:Lp74;

    .line 24
    .line 25
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/util/concurrent/ScheduledExecutorService;Ljava/util/concurrent/ExecutorService;Lhg3;Ljava/util/Random;Ljava/lang/String;JJDLjava/lang/String;J)V
    .locals 4

    .line 1
    move-wide v0, p11

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    .line 4
    .line 5
    new-instance v2, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    invoke-direct {v2, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 9
    .line 10
    .line 11
    iput-object v2, p0, Lwg3;->l:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 12
    .line 13
    new-instance v2, Ljava/lang/Object;

    .line 14
    .line 15
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object v2, p0, Lwg3;->m:Ljava/lang/Object;

    .line 19
    .line 20
    new-instance v2, Ljava/lang/Object;

    .line 21
    .line 22
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    iput-object v2, p0, Lwg3;->n:Ljava/lang/Object;

    .line 26
    .line 27
    new-instance v2, Ljava/lang/Object;

    .line 28
    .line 29
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 30
    .line 31
    .line 32
    iput-object v2, p0, Lwg3;->o:Ljava/lang/Object;

    .line 33
    .line 34
    invoke-static {}, Lsq1;->A()Lrq1;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    iput-object v2, p0, Lwg3;->p:Lrq1;

    .line 39
    .line 40
    new-instance v2, Ljava/util/ArrayList;

    .line 41
    .line 42
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 43
    .line 44
    .line 45
    iput-object v2, p0, Lwg3;->q:Ljava/util/ArrayList;

    .line 46
    .line 47
    iput-boolean v3, p0, Lwg3;->r:Z

    .line 48
    .line 49
    new-instance v2, Ljava/util/HashMap;

    .line 50
    .line 51
    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 52
    .line 53
    .line 54
    iput-object v2, p0, Lwg3;->s:Ljava/util/HashMap;

    .line 55
    .line 56
    iput-object p1, p0, Lwg3;->a:Landroid/content/Context;

    .line 57
    .line 58
    iput-object p2, p0, Lwg3;->b:Ljava/util/concurrent/ScheduledExecutorService;

    .line 59
    .line 60
    iput-object p3, p0, Lwg3;->c:Ljava/util/concurrent/ExecutorService;

    .line 61
    .line 62
    iput-object p4, p0, Lwg3;->d:Lhg3;

    .line 63
    .line 64
    iput-object p6, p0, Lwg3;->f:Ljava/lang/String;

    .line 65
    .line 66
    iput-wide p7, p0, Lwg3;->g:J

    .line 67
    .line 68
    iput-wide p9, p0, Lwg3;->h:J

    .line 69
    .line 70
    iput-wide v0, p0, Lwg3;->i:D

    .line 71
    .line 72
    move-object/from16 p1, p13

    .line 73
    .line 74
    iput-object p1, p0, Lwg3;->j:Ljava/lang/String;

    .line 75
    .line 76
    move-wide/from16 p1, p14

    .line 77
    .line 78
    iput-wide p1, p0, Lwg3;->k:J

    .line 79
    .line 80
    invoke-virtual {p5}, Ljava/util/Random;->nextDouble()D

    .line 81
    .line 82
    .line 83
    move-result-wide p1

    .line 84
    cmpg-double p1, p1, v0

    .line 85
    .line 86
    if-gez p1, :cond_0

    .line 87
    .line 88
    const/4 v3, 0x1

    .line 89
    :cond_0
    iput-boolean v3, p0, Lwg3;->e:Z

    .line 90
    .line 91
    return-void
.end method


# virtual methods
.method public final a()Ln70;
    .locals 3

    .line 1
    new-instance v0, Lvg3;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, Lvg3;-><init>(Lwg3;I)V

    .line 5
    .line 6
    .line 7
    new-instance v1, Lar3;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-static {v0, v2}, Ljava/util/concurrent/Executors;->callable(Ljava/lang/Runnable;Ljava/lang/Object;)Ljava/util/concurrent/Callable;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-direct {v1, v0}, Lar3;-><init>(Ljava/util/concurrent/Callable;)V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Lwg3;->c:Ljava/util/concurrent/ExecutorService;

    .line 18
    .line 19
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 20
    .line 21
    .line 22
    return-object v1
.end method

.method public final b(IJLjava/lang/Throwable;Ljava/lang/String;)V
    .locals 10

    .line 1
    iget-boolean v0, p0, Lwg3;->e:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v1, p0, Lwg3;->n:Ljava/lang/Object;

    .line 7
    .line 8
    monitor-enter v1

    .line 9
    :try_start_0
    iget-object v0, p0, Lwg3;->q:Ljava/util/ArrayList;

    .line 10
    .line 11
    new-instance v2, Lug3;

    .line 12
    .line 13
    iget-object v3, p0, Lwg3;->o:Ljava/lang/Object;

    .line 14
    .line 15
    monitor-enter v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 16
    :try_start_1
    iget-object v4, p0, Lwg3;->s:Ljava/util/HashMap;

    .line 17
    .line 18
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 19
    .line 20
    .line 21
    move-result-object v5

    .line 22
    invoke-virtual {v4, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v6

    .line 26
    check-cast v6, Ljava/lang/Long;

    .line 27
    .line 28
    if-nez v6, :cond_1

    .line 29
    .line 30
    const-wide/16 v6, 0x0

    .line 31
    .line 32
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 33
    .line 34
    .line 35
    move-result-object v6

    .line 36
    goto :goto_0

    .line 37
    :catchall_0
    move-exception v0

    .line 38
    move-object p1, v0

    .line 39
    goto :goto_2

    .line 40
    :cond_1
    :goto_0
    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    .line 41
    .line 42
    .line 43
    move-result-wide v6

    .line 44
    const-wide/16 v8, 0x1

    .line 45
    .line 46
    add-long/2addr v8, v6

    .line 47
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 48
    .line 49
    .line 50
    move-result-object v6

    .line 51
    invoke-virtual {v4, v5, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 55
    move v3, p1

    .line 56
    move-wide v4, p2

    .line 57
    move-object v6, p4

    .line 58
    move-object v7, p5

    .line 59
    :try_start_2
    invoke-direct/range {v2 .. v9}, Lug3;-><init>(IJLjava/lang/Throwable;Ljava/lang/String;J)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    iget-boolean p1, p0, Lwg3;->r:Z

    .line 66
    .line 67
    if-nez p1, :cond_2

    .line 68
    .line 69
    const/4 p1, 0x1

    .line 70
    iput-boolean p1, p0, Lwg3;->r:Z

    .line 71
    .line 72
    iget-object p1, p0, Lwg3;->b:Ljava/util/concurrent/ScheduledExecutorService;

    .line 73
    .line 74
    new-instance p2, Lvg3;

    .line 75
    .line 76
    const/4 p3, 0x1

    .line 77
    invoke-direct {p2, p0, p3}, Lvg3;-><init>(Lwg3;I)V

    .line 78
    .line 79
    .line 80
    iget-wide p3, p0, Lwg3;->h:J

    .line 81
    .line 82
    sget-object p5, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 83
    .line 84
    invoke-interface {p1, p2, p3, p4, p5}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 85
    .line 86
    .line 87
    goto :goto_1

    .line 88
    :catchall_1
    move-exception v0

    .line 89
    move-object p1, v0

    .line 90
    goto :goto_3

    .line 91
    :cond_2
    :goto_1
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 92
    return-void

    .line 93
    :goto_2
    :try_start_3
    monitor-exit v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 94
    :try_start_4
    throw p1

    .line 95
    :goto_3
    monitor-exit v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 96
    throw p1
.end method

.method public final c(Lsq1;)V
    .locals 6

    .line 1
    :try_start_0
    invoke-static {}, Ltg3;->A()Lsg3;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Lwg3;->t:Lp74;

    .line 6
    .line 7
    invoke-virtual {v0}, Ln54;->b()V

    .line 8
    .line 9
    .line 10
    iget-object v2, v0, Ln54;->g:Lp54;

    .line 11
    .line 12
    check-cast v2, Ltg3;

    .line 13
    .line 14
    invoke-virtual {v2, v1}, Ltg3;->C(Lp74;)V

    .line 15
    .line 16
    .line 17
    invoke-static {}, Lrg3;->A()Lqg3;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {v1}, Ln54;->b()V

    .line 22
    .line 23
    .line 24
    iget-object v2, v1, Ln54;->g:Lp54;

    .line 25
    .line 26
    check-cast v2, Lrg3;

    .line 27
    .line 28
    invoke-virtual {v2, p1}, Lrg3;->B(Lsq1;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1}, Ln54;->d()Lp54;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    check-cast p1, Lrg3;

    .line 36
    .line 37
    invoke-virtual {v0}, Ln54;->b()V

    .line 38
    .line 39
    .line 40
    iget-object v1, v0, Ln54;->g:Lp54;

    .line 41
    .line 42
    check-cast v1, Ltg3;

    .line 43
    .line 44
    invoke-virtual {v1, p1}, Ltg3;->B(Lrg3;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0}, Ln54;->d()Lp54;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    check-cast p1, Ltg3;

    .line 52
    .line 53
    iget-object v1, p0, Lwg3;->d:Lhg3;

    .line 54
    .line 55
    iget-object v2, p0, Lwg3;->f:Ljava/lang/String;

    .line 56
    .line 57
    invoke-virtual {p1}, Ls44;->b()[B

    .line 58
    .line 59
    .line 60
    move-result-object v5

    .line 61
    const-string v4, "application/x-protobuf"

    .line 62
    .line 63
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    new-instance v0, Lde3;

    .line 67
    .line 68
    const/4 v3, 0x1

    .line 69
    invoke-direct/range {v0 .. v5}, Lde3;-><init>(Lhg3;Ljava/lang/String;ZLjava/lang/String;[B)V

    .line 70
    .line 71
    .line 72
    invoke-static {v0}, Lwl2;->h(Lzc;)Lbd;
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 73
    .line 74
    .line 75
    :catch_0
    return-void
.end method
