.class public final Lxi3;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lkh3;


# instance fields
.field public final a:Lz94;

.field public final b:Lz94;

.field public final c:Lz94;

.field public final d:Z

.field public final e:J


# direct methods
.method public constructor <init>(Lz94;Lz94;Lz94;ZJ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lxi3;->a:Lz94;

    .line 5
    .line 6
    iput-object p2, p0, Lxi3;->b:Lz94;

    .line 7
    .line 8
    iput-object p3, p0, Lxi3;->c:Lz94;

    .line 9
    .line 10
    iput-boolean p4, p0, Lxi3;->d:Z

    .line 11
    .line 12
    iput-wide p5, p0, Lxi3;->e:J

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lxi3;->b:Lz94;

    .line 2
    .line 3
    invoke-interface {v0}, Lz94;->d()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lkj3;

    .line 8
    .line 9
    invoke-interface {v0}, Lkj3;->a()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0
.end method

.method public final b(Landroid/content/Context;Landroid/view/View;Landroid/app/Activity;)Ln70;
    .locals 1

    .line 1
    iget-object v0, p0, Lxi3;->b:Lz94;

    .line 2
    .line 3
    invoke-interface {v0}, Lz94;->d()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lkj3;

    .line 8
    .line 9
    invoke-interface {v0, p1, p2, p3}, Lkj3;->b(Landroid/content/Context;Landroid/view/View;Landroid/app/Activity;)Lar3;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method

.method public final c(Landroid/view/InputEvent;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lxi3;->b:Lz94;

    .line 2
    .line 3
    invoke-interface {v0}, Lz94;->d()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lkj3;

    .line 8
    .line 9
    invoke-interface {v0, p1}, Lkj3;->c(Landroid/view/InputEvent;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final d()Ln70;
    .locals 6

    .line 1
    iget-boolean v0, p0, Lxi3;->d:Z

    .line 2
    .line 3
    iget-object v1, p0, Lxi3;->a:Lz94;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-interface {v1}, Lz94;->d()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Lfj3;

    .line 12
    .line 13
    invoke-virtual {v0}, Lfj3;->a()Lgq3;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-static {v0}, Lgq3;->r(Ln70;)Lgq3;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    sget-object v1, Lgj1;->x:Lgj1;

    .line 22
    .line 23
    const-class v2, Ljava/lang/Throwable;

    .line 24
    .line 25
    sget-object v3, Ldq3;->f:Ldq3;

    .line 26
    .line 27
    invoke-static {v0, v2, v1, v3}, Lpu1;->J(Ln70;Ljava/lang/Class;Lzk3;Ljava/util/concurrent/Executor;)Lxo3;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    new-instance v1, Lu42;

    .line 32
    .line 33
    const/16 v2, 0x10

    .line 34
    .line 35
    invoke-direct {v1, v2, p0}, Lu42;-><init>(ILjava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    invoke-static {v0, v1, v3}, Lpu1;->O(Ln70;Lyp3;Ljava/util/concurrent/Executor;)Lqp3;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    return-object v0

    .line 43
    :cond_0
    iget-object v0, p0, Lxi3;->b:Lz94;

    .line 44
    .line 45
    invoke-interface {v0}, Lz94;->d()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    check-cast v0, Lkj3;

    .line 50
    .line 51
    invoke-interface {v0}, Lkj3;->d()Lgq3;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    const-wide/16 v2, 0x0

    .line 56
    .line 57
    iget-wide v4, p0, Lxi3;->e:J

    .line 58
    .line 59
    cmp-long v2, v4, v2

    .line 60
    .line 61
    if-lez v2, :cond_1

    .line 62
    .line 63
    iget-object v1, p0, Lxi3;->c:Lz94;

    .line 64
    .line 65
    invoke-interface {v1}, Lz94;->d()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    check-cast v1, Ljava/util/concurrent/ScheduledExecutorService;

    .line 70
    .line 71
    new-instance v2, Lw53;

    .line 72
    .line 73
    const/4 v3, 0x7

    .line 74
    invoke-direct {v2, v3, p0}, Lw53;-><init>(ILjava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 78
    .line 79
    invoke-interface {v1, v2, v4, v5, v3}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/util/concurrent/Callable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 80
    .line 81
    .line 82
    return-object v0

    .line 83
    :cond_1
    invoke-interface {v1}, Lz94;->d()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    check-cast v1, Lfj3;

    .line 88
    .line 89
    invoke-virtual {v1}, Lfj3;->a()Lgq3;

    .line 90
    .line 91
    .line 92
    return-object v0
.end method

.method public final e()I
    .locals 1

    .line 1
    iget-object v0, p0, Lxi3;->b:Lz94;

    .line 2
    .line 3
    invoke-interface {v0}, Lz94;->d()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lkj3;

    .line 8
    .line 9
    invoke-interface {v0}, Lkj3;->e()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    return v0
.end method

.method public final f(Landroid/content/Context;Ljava/lang/String;Landroid/view/View;)Ln70;
    .locals 1

    .line 1
    iget-object v0, p0, Lxi3;->b:Lz94;

    .line 2
    .line 3
    invoke-interface {v0}, Lz94;->d()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lkj3;

    .line 8
    .line 9
    invoke-interface {v0, p1, p2, p3}, Lkj3;->f(Landroid/content/Context;Ljava/lang/String;Landroid/view/View;)Lar3;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method

.method public final h(Landroid/content/Context;)Ln70;
    .locals 1

    .line 1
    iget-object v0, p0, Lxi3;->b:Lz94;

    .line 2
    .line 3
    invoke-interface {v0}, Lz94;->d()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lkj3;

    .line 8
    .line 9
    invoke-interface {v0, p1}, Lkj3;->h(Landroid/content/Context;)Lar3;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method
