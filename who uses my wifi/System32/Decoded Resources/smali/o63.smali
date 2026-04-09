.class public final Lo63;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lq53;


# instance fields
.field public final a:Lgd2;

.field public final b:Z

.field public final c:Ljava/util/concurrent/ScheduledExecutorService;

.field public final d:Lpq3;

.field public final e:I

.field public final f:I


# direct methods
.method public constructor <init>(Lgd2;ZLpq3;Ljava/util/concurrent/ScheduledExecutorService;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lo63;->a:Lgd2;

    .line 5
    .line 6
    iput-boolean p2, p0, Lo63;->b:Z

    .line 7
    .line 8
    iput-object p3, p0, Lo63;->d:Lpq3;

    .line 9
    .line 10
    iput-object p4, p0, Lo63;->c:Ljava/util/concurrent/ScheduledExecutorService;

    .line 11
    .line 12
    iput p5, p0, Lo63;->e:I

    .line 13
    .line 14
    iput p6, p0, Lo63;->f:I

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final a()Ln70;
    .locals 6

    .line 1
    sget-object v0, Lmz1;->r7:Liz1;

    .line 2
    .line 3
    sget-object v1, Ltw1;->e:Ltw1;

    .line 4
    .line 5
    iget-object v2, v1, Ltw1;->c:Lkz1;

    .line 6
    .line 7
    invoke-virtual {v2, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Ljava/lang/Boolean;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    const/4 v2, 0x0

    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    iget-boolean v0, p0, Lo63;->b:Z

    .line 21
    .line 22
    if-nez v0, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    new-instance v0, Lj33;

    .line 26
    .line 27
    const/4 v1, 0x5

    .line 28
    invoke-direct {v0, v2, v1}, Lj33;-><init>(Ljava/lang/String;I)V

    .line 29
    .line 30
    .line 31
    invoke-static {v0}, Lpu1;->r(Ljava/lang/Object;)Llq3;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    return-object v0

    .line 36
    :cond_1
    :goto_0
    iget v0, p0, Lo63;->f:I

    .line 37
    .line 38
    const/4 v3, 0x2

    .line 39
    if-eq v0, v3, :cond_3

    .line 40
    .line 41
    sget-object v0, Lmz1;->t7:Liz1;

    .line 42
    .line 43
    iget-object v1, v1, Ltw1;->c:Lkz1;

    .line 44
    .line 45
    invoke-virtual {v1, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    check-cast v0, Ljava/lang/String;

    .line 50
    .line 51
    const-string v1, ","

    .line 52
    .line 53
    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    iget v1, p0, Lo63;->e:I

    .line 62
    .line 63
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    if-nez v0, :cond_2

    .line 72
    .line 73
    new-instance v0, Lj33;

    .line 74
    .line 75
    const/4 v1, 0x5

    .line 76
    invoke-direct {v0, v2, v1}, Lj33;-><init>(Ljava/lang/String;I)V

    .line 77
    .line 78
    .line 79
    invoke-static {v0}, Lpu1;->r(Ljava/lang/Object;)Llq3;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    return-object v0

    .line 84
    :cond_2
    sget-object v0, Llq3;->g:Llq3;

    .line 85
    .line 86
    sget-object v1, Lgj1;->r:Lgj1;

    .line 87
    .line 88
    iget-object v2, p0, Lo63;->d:Lpq3;

    .line 89
    .line 90
    invoke-static {v0, v1, v2}, Lpu1;->P(Ln70;Lzk3;Ljava/util/concurrent/Executor;)Lrp3;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    sget-object v1, Lk12;->b:Lso1;

    .line 95
    .line 96
    invoke-virtual {v1}, Lso1;->w()Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    check-cast v1, Ljava/lang/Long;

    .line 101
    .line 102
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 103
    .line 104
    .line 105
    move-result-wide v3

    .line 106
    iget-object v1, p0, Lo63;->c:Ljava/util/concurrent/ScheduledExecutorService;

    .line 107
    .line 108
    sget-object v5, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 109
    .line 110
    invoke-static {v0, v3, v4, v5, v1}, Lpu1;->N(Ln70;JLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/ScheduledExecutorService;)Ln70;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    new-instance v1, Lvn1;

    .line 115
    .line 116
    const/4 v3, 0x7

    .line 117
    invoke-direct {v1, v3, p0}, Lvn1;-><init>(ILjava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    const-class v3, Ljava/lang/Exception;

    .line 121
    .line 122
    invoke-static {v0, v3, v1, v2}, Lpu1;->J(Ln70;Ljava/lang/Class;Lzk3;Ljava/util/concurrent/Executor;)Lxo3;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    return-object v0

    .line 127
    :cond_3
    new-instance v0, Lj33;

    .line 128
    .line 129
    const/4 v1, 0x5

    .line 130
    invoke-direct {v0, v2, v1}, Lj33;-><init>(Ljava/lang/String;I)V

    .line 131
    .line 132
    .line 133
    invoke-static {v0}, Lpu1;->r(Ljava/lang/Object;)Llq3;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    return-object v0
.end method

.method public final d()I
    .locals 1

    .line 1
    const/16 v0, 0x32

    .line 2
    .line 3
    return v0
.end method
