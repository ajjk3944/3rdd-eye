.class public final Lmm2;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public a:Landroid/content/Context;

.field public b:Ljava/lang/Object;

.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;

.field public f:Ljava/lang/Object;

.field public g:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lmm2;->g:I

    return-void
.end method

.method public synthetic constructor <init>(Lmm2;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iget-object v0, p1, Lmm2;->a:Landroid/content/Context;

    .line 3
    iput-object v0, p0, Lmm2;->a:Landroid/content/Context;

    .line 4
    iget-object v0, p1, Lmm2;->b:Ljava/lang/Object;

    check-cast v0, Ll83;

    .line 5
    iput-object v0, p0, Lmm2;->b:Ljava/lang/Object;

    .line 6
    iget-object v0, p1, Lmm2;->c:Ljava/lang/Object;

    check-cast v0, Landroid/os/Bundle;

    .line 7
    iput-object v0, p0, Lmm2;->c:Ljava/lang/Object;

    .line 8
    iget-object v0, p1, Lmm2;->d:Ljava/lang/Object;

    check-cast v0, Li83;

    .line 9
    iput-object v0, p0, Lmm2;->d:Ljava/lang/Object;

    .line 10
    iget-object v0, p1, Lmm2;->e:Ljava/lang/Object;

    check-cast v0, Lt83;

    .line 11
    iput-object v0, p0, Lmm2;->e:Ljava/lang/Object;

    .line 12
    iget-object v0, p1, Lmm2;->f:Ljava/lang/Object;

    check-cast v0, Le03;

    .line 13
    iput-object v0, p0, Lmm2;->f:Ljava/lang/Object;

    .line 14
    iget p1, p1, Lmm2;->g:I

    .line 15
    iput p1, p0, Lmm2;->g:I

    return-void
.end method


# virtual methods
.method public a()Lb62;
    .locals 8

    .line 1
    iget-object v0, p0, Lmm2;->a:Landroid/content/Context;

    .line 2
    .line 3
    const/4 v1, 0x6

    .line 4
    invoke-static {v0, v1}, Laa3;->l(Landroid/content/Context;I)Laa3;

    .line 5
    .line 6
    .line 7
    move-result-object v5

    .line 8
    invoke-interface {v5}, Laa3;->a()Laa3;

    .line 9
    .line 10
    .line 11
    new-instance v4, Lb62;

    .line 12
    .line 13
    invoke-direct {v4}, Lb62;-><init>()V

    .line 14
    .line 15
    .line 16
    const-string v0, "loadJavascriptEngine > Before UI_THREAD_EXECUTOR"

    .line 17
    .line 18
    invoke-static {v0}, Lgi2;->G(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    sget-object v0, Lmd2;->f:Lld2;

    .line 22
    .line 23
    new-instance v1, Ljq3;

    .line 24
    .line 25
    const/16 v2, 0x1d

    .line 26
    .line 27
    invoke-direct {v1, p0, v4, v2}, Ljq3;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, v1}, Lld2;->execute(Ljava/lang/Runnable;)V

    .line 31
    .line 32
    .line 33
    const-string v0, "loadNewJavascriptEngine: Promise created"

    .line 34
    .line 35
    invoke-static {v0}, Lgi2;->G(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    new-instance v2, Lxb4;

    .line 39
    .line 40
    const/16 v6, 0x12

    .line 41
    .line 42
    const/4 v7, 0x0

    .line 43
    move-object v3, p0

    .line 44
    invoke-direct/range {v2 .. v7}, Lxb4;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 45
    .line 46
    .line 47
    new-instance v0, Lt83;

    .line 48
    .line 49
    const/16 v1, 0x11

    .line 50
    .line 51
    invoke-direct {v0, p0, v4, v5, v1}, Lt83;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v4, v2, v0}, Le6;->t(Ltd2;Lrd2;)V

    .line 55
    .line 56
    .line 57
    return-object v4
.end method

.method public b()Lmm2;
    .locals 2

    .line 1
    new-instance v0, Lmm2;

    .line 2
    .line 3
    invoke-direct {v0}, Lmm2;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lmm2;->a:Landroid/content/Context;

    .line 7
    .line 8
    iput-object v1, v0, Lmm2;->a:Landroid/content/Context;

    .line 9
    .line 10
    iget-object v1, p0, Lmm2;->b:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Ll83;

    .line 13
    .line 14
    iput-object v1, v0, Lmm2;->b:Ljava/lang/Object;

    .line 15
    .line 16
    iget-object v1, p0, Lmm2;->c:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v1, Landroid/os/Bundle;

    .line 19
    .line 20
    iput-object v1, v0, Lmm2;->c:Ljava/lang/Object;

    .line 21
    .line 22
    iget-object v1, p0, Lmm2;->e:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v1, Lt83;

    .line 25
    .line 26
    iput-object v1, v0, Lmm2;->e:Ljava/lang/Object;

    .line 27
    .line 28
    iget-object v1, p0, Lmm2;->f:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v1, Le03;

    .line 31
    .line 32
    iput-object v1, v0, Lmm2;->f:Ljava/lang/Object;

    .line 33
    .line 34
    return-object v0
.end method

.method public c()Lx52;
    .locals 4

    .line 1
    const-string v0, "getEngine: Trying to acquire lock"

    .line 2
    .line 3
    invoke-static {v0}, Lgi2;->G(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lmm2;->b:Ljava/lang/Object;

    .line 7
    .line 8
    monitor-enter v0

    .line 9
    :try_start_0
    const-string v1, "getEngine: Lock acquired"

    .line 10
    .line 11
    invoke-static {v1}, Lgi2;->G(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const-string v1, "refreshIfDestroyed: Trying to acquire lock"

    .line 15
    .line 16
    invoke-static {v1}, Lgi2;->G(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    monitor-enter v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 20
    :try_start_1
    const-string v1, "refreshIfDestroyed: Lock acquired"

    .line 21
    .line 22
    invoke-static {v1}, Lgi2;->G(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    iget-object v1, p0, Lmm2;->f:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v1, Lb62;

    .line 28
    .line 29
    if-eqz v1, :cond_0

    .line 30
    .line 31
    iget v2, p0, Lmm2;->g:I

    .line 32
    .line 33
    if-nez v2, :cond_0

    .line 34
    .line 35
    new-instance v2, Lz71;

    .line 36
    .line 37
    const/16 v3, 0xf

    .line 38
    .line 39
    invoke-direct {v2, v3, p0}, Lz71;-><init>(ILjava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    sget-object v3, Lts0;->h:Lts0;

    .line 43
    .line 44
    invoke-virtual {v1, v2, v3}, Le6;->t(Ltd2;Lrd2;)V

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :catchall_0
    move-exception v1

    .line 49
    goto :goto_2

    .line 50
    :cond_0
    :goto_0
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 51
    :try_start_2
    const-string v1, "refreshIfDestroyed: Lock released"

    .line 52
    .line 53
    invoke-static {v1}, Lgi2;->G(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    iget-object v1, p0, Lmm2;->f:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v1, Lb62;

    .line 59
    .line 60
    const/4 v2, 0x2

    .line 61
    if-eqz v1, :cond_4

    .line 62
    .line 63
    iget-object v1, v1, Le6;->b:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v1, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 66
    .line 67
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    const/4 v3, -0x1

    .line 72
    if-ne v1, v3, :cond_1

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_1
    iget v1, p0, Lmm2;->g:I

    .line 76
    .line 77
    if-nez v1, :cond_2

    .line 78
    .line 79
    const-string v1, "getEngine (NO_UPDATE): Lock released"

    .line 80
    .line 81
    invoke-static {v1}, Lgi2;->G(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    iget-object v1, p0, Lmm2;->f:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast v1, Lb62;

    .line 87
    .line 88
    invoke-virtual {v1}, Lb62;->w()Lx52;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    monitor-exit v0

    .line 93
    return-object v1

    .line 94
    :catchall_1
    move-exception v1

    .line 95
    goto :goto_3

    .line 96
    :cond_2
    const/4 v3, 0x1

    .line 97
    if-ne v1, v3, :cond_3

    .line 98
    .line 99
    iput v2, p0, Lmm2;->g:I

    .line 100
    .line 101
    invoke-virtual {p0}, Lmm2;->a()Lb62;

    .line 102
    .line 103
    .line 104
    const-string v1, "getEngine (PENDING_UPDATE): Lock released"

    .line 105
    .line 106
    invoke-static {v1}, Lgi2;->G(Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    iget-object v1, p0, Lmm2;->f:Ljava/lang/Object;

    .line 110
    .line 111
    check-cast v1, Lb62;

    .line 112
    .line 113
    invoke-virtual {v1}, Lb62;->w()Lx52;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    monitor-exit v0

    .line 118
    return-object v1

    .line 119
    :cond_3
    const-string v1, "getEngine (UPDATING): Lock released"

    .line 120
    .line 121
    invoke-static {v1}, Lgi2;->G(Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    iget-object v1, p0, Lmm2;->f:Ljava/lang/Object;

    .line 125
    .line 126
    check-cast v1, Lb62;

    .line 127
    .line 128
    invoke-virtual {v1}, Lb62;->w()Lx52;

    .line 129
    .line 130
    .line 131
    move-result-object v1

    .line 132
    monitor-exit v0

    .line 133
    return-object v1

    .line 134
    :cond_4
    :goto_1
    iput v2, p0, Lmm2;->g:I

    .line 135
    .line 136
    invoke-virtual {p0}, Lmm2;->a()Lb62;

    .line 137
    .line 138
    .line 139
    move-result-object v1

    .line 140
    iput-object v1, p0, Lmm2;->f:Ljava/lang/Object;

    .line 141
    .line 142
    const-string v1, "getEngine (NULL or REJECTED): Lock released"

    .line 143
    .line 144
    invoke-static {v1}, Lgi2;->G(Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    iget-object v1, p0, Lmm2;->f:Ljava/lang/Object;

    .line 148
    .line 149
    check-cast v1, Lb62;

    .line 150
    .line 151
    invoke-virtual {v1}, Lb62;->w()Lx52;

    .line 152
    .line 153
    .line 154
    move-result-object v1

    .line 155
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 156
    return-object v1

    .line 157
    :goto_2
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 158
    :try_start_4
    throw v1

    .line 159
    :goto_3
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 160
    throw v1
.end method
