.class public final Lhj2;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lca4;


# instance fields
.field public final synthetic a:I

.field public final b:Lba4;

.field public final c:Lba4;

.field public final d:Lga4;

.field public final e:Lga4;

.field public final f:Lga4;

.field public final g:Lga4;


# direct methods
.method public constructor <init>(Lba4;Lba4;Lba4;Lba4;Lda4;Lda4;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lhj2;->a:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhj2;->b:Lba4;

    iput-object p2, p0, Lhj2;->c:Lba4;

    iput-object p3, p0, Lhj2;->d:Lga4;

    iput-object p4, p0, Lhj2;->e:Lga4;

    iput-object p5, p0, Lhj2;->f:Lga4;

    iput-object p6, p0, Lhj2;->g:Lga4;

    return-void
.end method

.method public constructor <init>(Lhh2;Lfh2;Lba4;Lba4;Lba4;Lba4;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lhj2;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhj2;->d:Lga4;

    iput-object p2, p0, Lhj2;->e:Lga4;

    iput-object p3, p0, Lhj2;->b:Lba4;

    iput-object p4, p0, Lhj2;->c:Lba4;

    iput-object p5, p0, Lhj2;->f:Lga4;

    iput-object p6, p0, Lhj2;->g:Lga4;

    return-void
.end method


# virtual methods
.method public final d()Ljava/lang/Object;
    .locals 9

    .line 1
    iget v0, p0, Lhj2;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lhj2;->b:Lba4;

    .line 7
    .line 8
    invoke-virtual {v0}, Lba4;->d()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    move-object v2, v0

    .line 13
    check-cast v2, Luj3;

    .line 14
    .line 15
    iget-object v0, p0, Lhj2;->c:Lba4;

    .line 16
    .line 17
    invoke-virtual {v0}, Lba4;->d()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    move-object v3, v0

    .line 22
    check-cast v3, Lrj3;

    .line 23
    .line 24
    iget-object v0, p0, Lhj2;->d:Lga4;

    .line 25
    .line 26
    invoke-interface {v0}, Lga4;->d()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    move-object v4, v0

    .line 31
    check-cast v4, Lxj3;

    .line 32
    .line 33
    iget-object v0, p0, Lhj2;->e:Lga4;

    .line 34
    .line 35
    invoke-interface {v0}, Lga4;->d()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    move-object v5, v0

    .line 40
    check-cast v5, Lgk3;

    .line 41
    .line 42
    iget-object v0, p0, Lhj2;->f:Lga4;

    .line 43
    .line 44
    invoke-interface {v0}, Lga4;->d()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    move-object v6, v0

    .line 49
    check-cast v6, Lvf3;

    .line 50
    .line 51
    iget-object v0, p0, Lhj2;->g:Lga4;

    .line 52
    .line 53
    invoke-interface {v0}, Lga4;->d()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    move-object v7, v0

    .line 58
    check-cast v7, Ljava/util/concurrent/ExecutorService;

    .line 59
    .line 60
    new-instance v1, Lmj3;

    .line 61
    .line 62
    invoke-direct/range {v1 .. v7}, Lmj3;-><init>(Luj3;Lrj3;Lxj3;Lgk3;Lvf3;Ljava/util/concurrent/ExecutorService;)V

    .line 63
    .line 64
    .line 65
    return-object v1

    .line 66
    :pswitch_0
    iget-object v0, p0, Lhj2;->d:Lga4;

    .line 67
    .line 68
    check-cast v0, Lhh2;

    .line 69
    .line 70
    invoke-virtual {v0}, Lhh2;->a()Landroid/content/Context;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    iget-object v0, p0, Lhj2;->e:Lga4;

    .line 75
    .line 76
    check-cast v0, Lfh2;

    .line 77
    .line 78
    invoke-virtual {v0}, Lfh2;->a()Lra4;

    .line 79
    .line 80
    .line 81
    move-result-object v3

    .line 82
    iget-object v0, p0, Lhj2;->b:Lba4;

    .line 83
    .line 84
    invoke-virtual {v0}, Lba4;->d()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    move-object v4, v0

    .line 89
    check-cast v4, Lyz2;

    .line 90
    .line 91
    iget-object v0, p0, Lhj2;->c:Lba4;

    .line 92
    .line 93
    invoke-virtual {v0}, Lba4;->d()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    move-object v5, v0

    .line 98
    check-cast v5, Ltu2;

    .line 99
    .line 100
    sget-object v6, Lmd2;->a:Lld2;

    .line 101
    .line 102
    invoke-static {v6}, Li41;->M(Ljava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    iget-object v0, p0, Lhj2;->f:Lga4;

    .line 106
    .line 107
    invoke-interface {v0}, Lga4;->d()Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    move-object v7, v0

    .line 112
    check-cast v7, Lpq3;

    .line 113
    .line 114
    iget-object v0, p0, Lhj2;->g:Lga4;

    .line 115
    .line 116
    invoke-interface {v0}, Lga4;->d()Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    move-object v8, v0

    .line 121
    check-cast v8, Ljava/util/concurrent/ScheduledExecutorService;

    .line 122
    .line 123
    new-instance v1, Lgj2;

    .line 124
    .line 125
    invoke-direct/range {v1 .. v8}, Lgj2;-><init>(Landroid/content/Context;Lra4;Lyz2;Ltu2;Lpq3;Lpq3;Ljava/util/concurrent/ScheduledExecutorService;)V

    .line 126
    .line 127
    .line 128
    return-object v1

    .line 129
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
