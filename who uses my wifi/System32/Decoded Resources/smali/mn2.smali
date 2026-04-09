.class public final Lmn2;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lje4;
.implements Lgj0;


# instance fields
.field public final synthetic f:I

.field public final g:Ljava/util/concurrent/Executor;

.field public final h:Ljava/lang/Object;

.field public final i:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/util/concurrent/Executor;Ldj0;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lmn2;->f:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lmn2;->i:Ljava/lang/Object;

    iput-object p1, p0, Lmn2;->g:Ljava/util/concurrent/Executor;

    iput-object p2, p0, Lmn2;->h:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/util/concurrent/Executor;Lgj0;)V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, Lmn2;->f:I

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lmn2;->i:Ljava/lang/Object;

    iput-object p1, p0, Lmn2;->g:Ljava/util/concurrent/Executor;

    iput-object p2, p0, Lmn2;->h:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/concurrent/Executor;Lpj;Lgi4;I)V
    .locals 0

    .line 1
    iput p4, p0, Lmn2;->f:I

    iput-object p1, p0, Lmn2;->g:Ljava/util/concurrent/Executor;

    iput-object p2, p0, Lmn2;->i:Ljava/lang/Object;

    iput-object p3, p0, Lmn2;->h:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgi4;)V
    .locals 4

    .line 1
    iget v0, p0, Lmn2;->f:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lgi4;->c()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    iget-boolean v0, p1, Lgi4;->d:Z

    .line 13
    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    iget-object v0, p0, Lmn2;->i:Ljava/lang/Object;

    .line 17
    .line 18
    monitor-enter v0

    .line 19
    :try_start_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    iget-object v0, p0, Lmn2;->g:Ljava/util/concurrent/Executor;

    .line 21
    .line 22
    new-instance v1, Lsz2;

    .line 23
    .line 24
    const/16 v2, 0x15

    .line 25
    .line 26
    const/4 v3, 0x0

    .line 27
    invoke-direct {v1, p0, p1, v2, v3}, Lsz2;-><init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 28
    .line 29
    .line 30
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :catchall_0
    move-exception p1

    .line 35
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 36
    throw p1

    .line 37
    :cond_0
    :goto_0
    return-void

    .line 38
    :pswitch_0
    iget-object v0, p0, Lmn2;->i:Ljava/lang/Object;

    .line 39
    .line 40
    monitor-enter v0

    .line 41
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 42
    iget-object v0, p0, Lmn2;->g:Ljava/util/concurrent/Executor;

    .line 43
    .line 44
    new-instance v1, Lsz2;

    .line 45
    .line 46
    const/16 v2, 0x12

    .line 47
    .line 48
    const/4 v3, 0x0

    .line 49
    invoke-direct {v1, p0, p1, v2, v3}, Lsz2;-><init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 50
    .line 51
    .line 52
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :catchall_1
    move-exception p1

    .line 57
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 58
    throw p1

    .line 59
    :pswitch_1
    new-instance v0, Ln62;

    .line 60
    .line 61
    const/16 v1, 0x1a

    .line 62
    .line 63
    const/4 v2, 0x0

    .line 64
    invoke-direct {v0, p0, p1, v1, v2}, Ln62;-><init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 65
    .line 66
    .line 67
    iget-object p1, p0, Lmn2;->g:Ljava/util/concurrent/Executor;

    .line 68
    .line 69
    invoke-interface {p1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 70
    .line 71
    .line 72
    return-void

    .line 73
    :pswitch_2
    new-instance v0, Ln62;

    .line 74
    .line 75
    const/4 v1, 0x5

    .line 76
    const/4 v2, 0x0

    .line 77
    invoke-direct {v0, p0, p1, v1, v2}, Ln62;-><init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 78
    .line 79
    .line 80
    iget-object p1, p0, Lmn2;->g:Ljava/util/concurrent/Executor;

    .line 81
    .line 82
    invoke-interface {p1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 83
    .line 84
    .line 85
    return-void

    .line 86
    nop

    .line 87
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public q(Ljava/lang/Exception;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lmn2;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lgi4;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lgi4;->d(Ljava/lang/Exception;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
