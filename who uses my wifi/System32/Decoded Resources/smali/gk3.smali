.class public final Lgk3;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final a:Lpg3;


# direct methods
.method public constructor <init>(Lrf3;Lpg3;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lgk3;->a:Lpg3;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(I)Lfk3;
    .locals 2

    .line 1
    new-instance v0, Lfk3;

    .line 2
    .line 3
    iget-object v1, p0, Lgk3;->a:Lpg3;

    .line 4
    .line 5
    invoke-direct {v0, p1, v1}, Lfk3;-><init>(ILpg3;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public final b(I)V
    .locals 6

    .line 1
    add-int/lit8 v1, p1, -0x1

    .line 2
    .line 3
    const/4 v5, 0x0

    .line 4
    iget-object p1, p0, Lgk3;->a:Lpg3;

    .line 5
    .line 6
    move-object v0, p1

    .line 7
    check-cast v0, Lwg3;

    .line 8
    .line 9
    const-wide/16 v2, -0x1

    .line 10
    .line 11
    const/4 v4, 0x0

    .line 12
    invoke-virtual/range {v0 .. v5}, Lwg3;->b(IJLjava/lang/Throwable;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final c(ILjava/lang/Throwable;)V
    .locals 6

    .line 1
    add-int/lit8 v1, p1, -0x1

    .line 2
    .line 3
    const/4 v5, 0x0

    .line 4
    iget-object p1, p0, Lgk3;->a:Lpg3;

    .line 5
    .line 6
    move-object v0, p1

    .line 7
    check-cast v0, Lwg3;

    .line 8
    .line 9
    const-wide/16 v2, -0x1

    .line 10
    .line 11
    move-object v4, p2

    .line 12
    invoke-virtual/range {v0 .. v5}, Lwg3;->b(IJLjava/lang/Throwable;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final d(ILn70;)V
    .locals 2

    .line 1
    invoke-virtual {p0, p1}, Lgk3;->a(I)Lfk3;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Lfk3;->a()V

    .line 6
    .line 7
    .line 8
    new-instance v0, Lvg0;

    .line 9
    .line 10
    invoke-direct {v0, p0, p1}, Lvg0;-><init>(Lgk3;Lfk3;)V

    .line 11
    .line 12
    .line 13
    new-instance p1, Ljq3;

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    invoke-direct {p1, p2, v0, v1}, Ljq3;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 17
    .line 18
    .line 19
    sget-object v0, Ldq3;->f:Ldq3;

    .line 20
    .line 21
    invoke-interface {p2, p1, v0}, Ln70;->c(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public final e(ILjava/lang/Runnable;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lgk3;->a(I)Lfk3;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    :try_start_0
    invoke-virtual {p1}, Lfk3;->a()V

    .line 6
    .line 7
    .line 8
    invoke-interface {p2}, Ljava/lang/Runnable;->run()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Lfk3;->c()V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :catchall_0
    move-exception p2

    .line 16
    :try_start_1
    invoke-virtual {p1, p2}, Lfk3;->b(Ljava/lang/Throwable;)V

    .line 17
    .line 18
    .line 19
    throw p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 20
    :catchall_1
    move-exception p2

    .line 21
    invoke-virtual {p1}, Lfk3;->c()V

    .line 22
    .line 23
    .line 24
    throw p2
.end method
