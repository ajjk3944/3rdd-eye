.class public final Lfj3;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final a:Luj3;

.field public final b:Lpj3;

.field public final c:Lrj3;

.field public final d:Lgk3;


# direct methods
.method public constructor <init>(Luj3;Lpj3;Lrj3;Lgk3;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lfj3;->a:Luj3;

    .line 5
    .line 6
    iput-object p2, p0, Lfj3;->b:Lpj3;

    .line 7
    .line 8
    iput-object p3, p0, Lfj3;->c:Lrj3;

    .line 9
    .line 10
    iput-object p4, p0, Lfj3;->d:Lgk3;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final a()Lgq3;
    .locals 4

    .line 1
    iget-object v0, p0, Lfj3;->c:Lrj3;

    .line 2
    .line 3
    invoke-virtual {v0}, Lrj3;->a()Lar3;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Lgq3;->r(Ln70;)Lgq3;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sget-object v1, Ldj3;->b:Ldj3;

    .line 12
    .line 13
    const-class v2, Ljava/lang/Throwable;

    .line 14
    .line 15
    sget-object v3, Ldq3;->f:Ldq3;

    .line 16
    .line 17
    invoke-static {v0, v2, v1, v3}, Lpu1;->J(Ln70;Ljava/lang/Class;Lzk3;Ljava/util/concurrent/Executor;)Lxo3;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    new-instance v1, Lvn1;

    .line 22
    .line 23
    const/16 v2, 0xb

    .line 24
    .line 25
    invoke-direct {v1, v2, p0}, Lvn1;-><init>(ILjava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    invoke-static {v0, v1, v3}, Lpu1;->P(Ln70;Lzk3;Ljava/util/concurrent/Executor;)Lrp3;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    new-instance v1, Lcj3;

    .line 33
    .line 34
    const/4 v2, 0x0

    .line 35
    invoke-direct {v1, p0, v2}, Lcj3;-><init>(Lfj3;I)V

    .line 36
    .line 37
    .line 38
    invoke-static {v0, v1, v3}, Lpu1;->O(Ln70;Lyp3;Ljava/util/concurrent/Executor;)Lqp3;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    const-class v1, Lzi3;

    .line 43
    .line 44
    sget-object v2, Lgj1;->y:Lgj1;

    .line 45
    .line 46
    invoke-static {v0, v1, v2, v3}, Lpu1;->J(Ln70;Ljava/lang/Class;Lzk3;Ljava/util/concurrent/Executor;)Lxo3;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    const-class v1, Lyi3;

    .line 51
    .line 52
    sget-object v2, Lgj1;->z:Lgj1;

    .line 53
    .line 54
    invoke-static {v0, v1, v2, v3}, Lpu1;->J(Ln70;Ljava/lang/Class;Lzk3;Ljava/util/concurrent/Executor;)Lxo3;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    const-class v1, Laj3;

    .line 59
    .line 60
    sget-object v2, Lgj1;->A:Lgj1;

    .line 61
    .line 62
    invoke-static {v0, v1, v2, v3}, Lpu1;->J(Ln70;Ljava/lang/Class;Lzk3;Ljava/util/concurrent/Executor;)Lxo3;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    return-object v0
.end method
