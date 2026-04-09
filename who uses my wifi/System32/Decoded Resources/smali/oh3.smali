.class public final Loh3;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lng3;


# instance fields
.field public final a:Lvf3;

.field public final b:Lnh3;

.field public final c:Llh3;

.field public final d:Ljava/util/concurrent/ExecutorService;

.field public final e:Lgk3;

.field public final f:Ljava/util/concurrent/atomic/AtomicReference;


# direct methods
.method public constructor <init>(Lvf3;Lnh3;Llh3;Ljava/util/concurrent/ExecutorService;Lgk3;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Loh3;->f:Ljava/util/concurrent/atomic/AtomicReference;

    .line 10
    .line 11
    iput-object p1, p0, Loh3;->a:Lvf3;

    .line 12
    .line 13
    iput-object p2, p0, Loh3;->b:Lnh3;

    .line 14
    .line 15
    iput-object p3, p0, Loh3;->c:Llh3;

    .line 16
    .line 17
    iput-object p4, p0, Loh3;->d:Ljava/util/concurrent/ExecutorService;

    .line 18
    .line 19
    iput-object p5, p0, Loh3;->e:Lgk3;

    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final a()Ln70;
    .locals 6

    .line 1
    iget-object v0, p0, Loh3;->a:Lvf3;

    .line 2
    .line 3
    invoke-virtual {v0}, Lvf3;->B()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-virtual {v0}, Lvf3;->D()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    iget-object v2, p0, Loh3;->b:Lnh3;

    .line 12
    .line 13
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    new-instance v3, Lmh3;

    .line 17
    .line 18
    invoke-direct {v3, v2, v1}, Lmh3;-><init>(Lnh3;I)V

    .line 19
    .line 20
    .line 21
    iget-object v4, v2, Lnh3;->d:Ljava/util/concurrent/ExecutorService;

    .line 22
    .line 23
    invoke-static {v3, v4}, Lpu1;->D(Ljava/util/concurrent/Callable;Ljava/util/concurrent/Executor;)Lar3;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    invoke-static {v3}, Lgq3;->r(Ln70;)Lgq3;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    sget-object v4, Lfi1;->o:Lfi1;

    .line 32
    .line 33
    sget-object v5, Ldq3;->f:Ldq3;

    .line 34
    .line 35
    invoke-static {v3, v4, v5}, Lpu1;->O(Ln70;Lyp3;Ljava/util/concurrent/Executor;)Lqp3;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    if-eqz v0, :cond_0

    .line 40
    .line 41
    const/4 v0, 0x2

    .line 42
    if-eq v1, v0, :cond_0

    .line 43
    .line 44
    invoke-static {v3}, Lgq3;->r(Ln70;)Lgq3;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    const-class v1, Ljava/lang/Throwable;

    .line 49
    .line 50
    sget-object v3, Lgj1;->w:Lgj1;

    .line 51
    .line 52
    invoke-static {v0, v1, v3, v5}, Lpu1;->J(Ln70;Ljava/lang/Class;Lzk3;Ljava/util/concurrent/Executor;)Lxo3;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    new-instance v1, Lu42;

    .line 57
    .line 58
    invoke-direct {v1, v2}, Lu42;-><init>(Lnh3;)V

    .line 59
    .line 60
    .line 61
    invoke-static {v0, v1, v5}, Lpu1;->O(Ln70;Lyp3;Ljava/util/concurrent/Executor;)Lqp3;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    :cond_0
    invoke-static {v3}, Lgq3;->r(Ln70;)Lgq3;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    new-instance v1, Lvn1;

    .line 70
    .line 71
    const/16 v2, 0xa

    .line 72
    .line 73
    invoke-direct {v1, v2, p0}, Lvn1;-><init>(ILjava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    invoke-static {v0, v1, v5}, Lpu1;->P(Ln70;Lzk3;Ljava/util/concurrent/Executor;)Lrp3;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    new-instance v1, Lkf3;

    .line 81
    .line 82
    const/16 v2, 0x1c

    .line 83
    .line 84
    invoke-direct {v1, v2, p0}, Lkf3;-><init>(ILjava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    new-instance v2, Ljq3;

    .line 88
    .line 89
    const/4 v3, 0x0

    .line 90
    invoke-direct {v2, v0, v1, v3}, Ljq3;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 91
    .line 92
    .line 93
    iget-object v1, p0, Loh3;->d:Ljava/util/concurrent/ExecutorService;

    .line 94
    .line 95
    invoke-interface {v0, v2, v1}, Ln70;->c(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 96
    .line 97
    .line 98
    return-object v0
.end method
