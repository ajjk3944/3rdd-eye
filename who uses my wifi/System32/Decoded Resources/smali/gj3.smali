.class public final Lgj3;
.super Lgd3;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final f:Lpg3;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/concurrent/ExecutorService;Lpg3;)V
    .locals 2

    .line 1
    new-instance v0, Lgi4;

    .line 2
    .line 3
    invoke-direct {v0}, Lgi4;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {p0, p1, p2, v0, v1}, Lgd3;-><init>(Landroid/content/Context;Ljava/util/concurrent/Executor;Lgi4;Z)V

    .line 8
    .line 9
    .line 10
    iput-object p3, p0, Lgj3;->f:Lpg3;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final b(IJ)V
    .locals 6

    .line 1
    const/4 v5, 0x0

    .line 2
    iget-object v0, p0, Lgj3;->f:Lpg3;

    .line 3
    .line 4
    check-cast v0, Lwg3;

    .line 5
    .line 6
    const/4 v4, 0x0

    .line 7
    move v1, p1

    .line 8
    move-wide v2, p2

    .line 9
    invoke-virtual/range {v0 .. v5}, Lwg3;->b(IJLjava/lang/Throwable;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    new-instance p1, Lgi4;

    .line 13
    .line 14
    invoke-direct {p1}, Lgi4;-><init>()V

    .line 15
    .line 16
    .line 17
    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 18
    .line 19
    invoke-virtual {p1, p2}, Lgi4;->e(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public final c(IJLjava/lang/Exception;)V
    .locals 6

    .line 1
    const/4 v5, 0x0

    .line 2
    iget-object v0, p0, Lgj3;->f:Lpg3;

    .line 3
    .line 4
    check-cast v0, Lwg3;

    .line 5
    .line 6
    move v1, p1

    .line 7
    move-wide v2, p2

    .line 8
    move-object v4, p4

    .line 9
    invoke-virtual/range {v0 .. v5}, Lwg3;->b(IJLjava/lang/Throwable;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    new-instance p1, Lgi4;

    .line 13
    .line 14
    invoke-direct {p1}, Lgi4;-><init>()V

    .line 15
    .line 16
    .line 17
    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 18
    .line 19
    invoke-virtual {p1, p2}, Lgi4;->e(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public final d(Ljava/lang/String;I)V
    .locals 6

    .line 1
    const/4 v4, 0x0

    .line 2
    iget-object v0, p0, Lgj3;->f:Lpg3;

    .line 3
    .line 4
    check-cast v0, Lwg3;

    .line 5
    .line 6
    const-wide/16 v2, -0x1

    .line 7
    .line 8
    move-object v5, p1

    .line 9
    move v1, p2

    .line 10
    invoke-virtual/range {v0 .. v5}, Lwg3;->b(IJLjava/lang/Throwable;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    new-instance p1, Lgi4;

    .line 14
    .line 15
    invoke-direct {p1}, Lgi4;-><init>()V

    .line 16
    .line 17
    .line 18
    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 19
    .line 20
    invoke-virtual {p1, p2}, Lgi4;->e(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method
