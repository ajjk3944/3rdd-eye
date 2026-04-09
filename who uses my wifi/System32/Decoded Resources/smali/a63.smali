.class public final La63;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lq53;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Ljava/util/concurrent/ScheduledExecutorService;

.field public final c:Ljava/util/concurrent/Executor;

.field public final d:Z

.field public final e:Z

.field public final f:Lus0;


# direct methods
.method public constructor <init>(Lus0;Landroid/content/Context;Ljava/util/concurrent/ScheduledExecutorService;Lld2;IZZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La63;->f:Lus0;

    .line 5
    .line 6
    iput-object p2, p0, La63;->a:Landroid/content/Context;

    .line 7
    .line 8
    iput-object p3, p0, La63;->b:Ljava/util/concurrent/ScheduledExecutorService;

    .line 9
    .line 10
    iput-object p4, p0, La63;->c:Ljava/util/concurrent/Executor;

    .line 11
    .line 12
    iput-boolean p6, p0, La63;->d:Z

    .line 13
    .line 14
    iput-boolean p7, p0, La63;->e:Z

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final a()Ln70;
    .locals 6

    .line 1
    new-instance v0, Lpd2;

    .line 2
    .line 3
    invoke-direct {v0}, Lpd2;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, Lsv1;->f:Lsv1;

    .line 7
    .line 8
    iget-object v1, v1, Lsv1;->a:Lj63;

    .line 9
    .line 10
    sget-object v1, Lgz;->b:Lgz;

    .line 11
    .line 12
    const v2, 0xbdfcb8

    .line 13
    .line 14
    .line 15
    iget-object v3, p0, La63;->a:Landroid/content/Context;

    .line 16
    .line 17
    invoke-virtual {v1, v3, v2}, Lgz;->c(Landroid/content/Context;I)I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    const/4 v2, 0x2

    .line 24
    if-ne v1, v2, :cond_1

    .line 25
    .line 26
    :cond_0
    sget-object v1, Lmd2;->a:Lld2;

    .line 27
    .line 28
    new-instance v2, Ln62;

    .line 29
    .line 30
    iget-object v4, p0, La63;->f:Lus0;

    .line 31
    .line 32
    invoke-direct {v2, v4, v3, v0}, Ln62;-><init>(Lus0;Landroid/content/Context;Lpd2;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1, v2}, Lld2;->execute(Ljava/lang/Runnable;)V

    .line 36
    .line 37
    .line 38
    :cond_1
    invoke-static {v0}, Lgq3;->r(Ln70;)Lgq3;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    new-instance v1, Lz53;

    .line 43
    .line 44
    const/4 v2, 0x1

    .line 45
    invoke-direct {v1, p0, v2}, Lz53;-><init>(La63;I)V

    .line 46
    .line 47
    .line 48
    iget-object v2, p0, La63;->c:Ljava/util/concurrent/Executor;

    .line 49
    .line 50
    invoke-static {v0, v1, v2}, Lpu1;->P(Ln70;Lzk3;Ljava/util/concurrent/Executor;)Lrp3;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    sget-object v1, Lmz1;->e1:Liz1;

    .line 55
    .line 56
    sget-object v3, Ltw1;->e:Ltw1;

    .line 57
    .line 58
    iget-object v3, v3, Ltw1;->c:Lkz1;

    .line 59
    .line 60
    invoke-virtual {v3, v1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    check-cast v1, Ljava/lang/Long;

    .line 65
    .line 66
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 67
    .line 68
    .line 69
    move-result-wide v3

    .line 70
    sget-object v1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 71
    .line 72
    iget-object v5, p0, La63;->b:Ljava/util/concurrent/ScheduledExecutorService;

    .line 73
    .line 74
    invoke-static {v0, v3, v4, v1, v5}, Lpu1;->N(Ln70;JLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/ScheduledExecutorService;)Ln70;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    check-cast v0, Lgq3;

    .line 79
    .line 80
    new-instance v1, Lz53;

    .line 81
    .line 82
    const/4 v3, 0x0

    .line 83
    invoke-direct {v1, p0, v3}, Lz53;-><init>(La63;I)V

    .line 84
    .line 85
    .line 86
    const-class v3, Ljava/lang/Throwable;

    .line 87
    .line 88
    invoke-static {v0, v3, v1, v2}, Lpu1;->J(Ln70;Ljava/lang/Class;Lzk3;Ljava/util/concurrent/Executor;)Lxo3;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    return-object v0
.end method

.method public final d()I
    .locals 1

    .line 1
    const/16 v0, 0x28

    .line 2
    .line 3
    return v0
.end method
