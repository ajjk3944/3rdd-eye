.class public final Lx43;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lq53;


# instance fields
.field public final a:Lq53;

.field public final b:J

.field public final c:Ljava/util/concurrent/ScheduledExecutorService;


# direct methods
.method public constructor <init>(Lq53;JLjava/util/concurrent/ScheduledExecutorService;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lx43;->a:Lq53;

    .line 5
    .line 6
    iput-wide p2, p0, Lx43;->b:J

    .line 7
    .line 8
    iput-object p4, p0, Lx43;->c:Ljava/util/concurrent/ScheduledExecutorService;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a()Ln70;
    .locals 6

    .line 1
    iget-object v0, p0, Lx43;->a:Lq53;

    .line 2
    .line 3
    invoke-interface {v0}, Lq53;->a()Ln70;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sget-object v1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 8
    .line 9
    sget-object v2, Lmz1;->x2:Liz1;

    .line 10
    .line 11
    sget-object v3, Ltw1;->e:Ltw1;

    .line 12
    .line 13
    iget-object v3, v3, Ltw1;->c:Lkz1;

    .line 14
    .line 15
    invoke-virtual {v3, v2}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    check-cast v2, Ljava/lang/Boolean;

    .line 20
    .line 21
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-eqz v2, :cond_0

    .line 26
    .line 27
    sget-object v1, Ljava/util/concurrent/TimeUnit;->MICROSECONDS:Ljava/util/concurrent/TimeUnit;

    .line 28
    .line 29
    :cond_0
    const-wide/16 v2, 0x0

    .line 30
    .line 31
    iget-wide v4, p0, Lx43;->b:J

    .line 32
    .line 33
    cmp-long v2, v4, v2

    .line 34
    .line 35
    if-lez v2, :cond_1

    .line 36
    .line 37
    iget-object v2, p0, Lx43;->c:Ljava/util/concurrent/ScheduledExecutorService;

    .line 38
    .line 39
    invoke-static {v0, v4, v5, v1, v2}, Lpu1;->N(Ln70;JLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/ScheduledExecutorService;)Ln70;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    :cond_1
    new-instance v1, Lu42;

    .line 44
    .line 45
    const/16 v2, 0x9

    .line 46
    .line 47
    invoke-direct {v1, v2, p0}, Lu42;-><init>(ILjava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    sget-object v2, Lmd2;->g:Lld2;

    .line 51
    .line 52
    const-class v3, Ljava/lang/Throwable;

    .line 53
    .line 54
    invoke-static {v0, v3, v1, v2}, Lpu1;->L(Ln70;Ljava/lang/Class;Lyp3;Ljava/util/concurrent/Executor;)Lwo3;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    return-object v0
.end method

.method public final d()I
    .locals 1

    .line 1
    iget-object v0, p0, Lx43;->a:Lq53;

    .line 2
    .line 3
    invoke-interface {v0}, Lq53;->d()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method
