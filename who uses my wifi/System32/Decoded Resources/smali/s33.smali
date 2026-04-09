.class public final Ls33;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lq53;


# instance fields
.field public final a:Lgd2;

.field public final b:Lmr2;

.field public final c:Ljava/util/concurrent/ScheduledExecutorService;

.field public final d:Lpq3;

.field public final e:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lgd2;Ljava/util/concurrent/ScheduledExecutorService;Lpq3;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lmz1;->o3:Liz1;

    .line 5
    .line 6
    sget-object v1, Ltw1;->e:Ltw1;

    .line 7
    .line 8
    iget-object v1, v1, Ltw1;->c:Lkz1;

    .line 9
    .line 10
    invoke-virtual {v1, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    check-cast v0, Ljava/lang/Boolean;

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-nez v0, :cond_0

    .line 21
    .line 22
    new-instance v0, Lmr2;

    .line 23
    .line 24
    const/16 v1, 0x13

    .line 25
    .line 26
    invoke-direct {v0, p1, v1}, Lmr2;-><init>(Landroid/content/Context;I)V

    .line 27
    .line 28
    .line 29
    iput-object v0, p0, Ls33;->b:Lmr2;

    .line 30
    .line 31
    :cond_0
    iput-object p1, p0, Ls33;->e:Landroid/content/Context;

    .line 32
    .line 33
    iput-object p2, p0, Ls33;->a:Lgd2;

    .line 34
    .line 35
    iput-object p3, p0, Ls33;->c:Ljava/util/concurrent/ScheduledExecutorService;

    .line 36
    .line 37
    iput-object p4, p0, Ls33;->d:Lpq3;

    .line 38
    .line 39
    return-void
.end method


# virtual methods
.method public final a()Ln70;
    .locals 5

    .line 1
    sget-object v0, Lmz1;->k3:Liz1;

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
    const/4 v2, -0x1

    .line 18
    const/4 v3, 0x0

    .line 19
    if-eqz v0, :cond_4

    .line 20
    .line 21
    sget-object v0, Lmz1;->p3:Liz1;

    .line 22
    .line 23
    iget-object v4, v1, Ltw1;->c:Lkz1;

    .line 24
    .line 25
    invoke-virtual {v4, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    check-cast v0, Ljava/lang/Boolean;

    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-nez v0, :cond_4

    .line 36
    .line 37
    sget-object v0, Lmz1;->l3:Liz1;

    .line 38
    .line 39
    iget-object v4, v1, Ltw1;->c:Lkz1;

    .line 40
    .line 41
    invoke-virtual {v4, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    check-cast v0, Ljava/lang/Boolean;

    .line 46
    .line 47
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-nez v0, :cond_0

    .line 52
    .line 53
    iget-object v0, p0, Ls33;->b:Lmr2;

    .line 54
    .line 55
    invoke-virtual {v0}, Lmr2;->h()Lgi4;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-static {v0}, Lwl2;->D(Lgi4;)Lsf3;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    sget-object v1, Lgj1;->o:Lgj1;

    .line 64
    .line 65
    sget-object v2, Lmd2;->g:Lld2;

    .line 66
    .line 67
    invoke-static {v0, v1, v2}, Lpu1;->P(Ln70;Lzk3;Ljava/util/concurrent/Executor;)Lrp3;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    return-object v0

    .line 72
    :cond_0
    sget-object v0, Lmz1;->o3:Liz1;

    .line 73
    .line 74
    iget-object v4, v1, Ltw1;->c:Lkz1;

    .line 75
    .line 76
    invoke-virtual {v4, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    check-cast v0, Ljava/lang/Boolean;

    .line 81
    .line 82
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    if-eqz v0, :cond_1

    .line 87
    .line 88
    iget-object v0, p0, Ls33;->e:Landroid/content/Context;

    .line 89
    .line 90
    const/4 v4, 0x0

    .line 91
    invoke-static {v0, v4}, Li41;->J(Landroid/content/Context;Z)V

    .line 92
    .line 93
    .line 94
    sget-object v0, Li41;->v:Ljava/lang/Object;

    .line 95
    .line 96
    monitor-enter v0

    .line 97
    :try_start_0
    sget-object v4, Li41;->t:Lgi4;

    .line 98
    .line 99
    monitor-exit v0

    .line 100
    goto :goto_0

    .line 101
    :catchall_0
    move-exception v1

    .line 102
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 103
    throw v1

    .line 104
    :cond_1
    iget-object v0, p0, Ls33;->b:Lmr2;

    .line 105
    .line 106
    invoke-virtual {v0}, Lmr2;->h()Lgi4;

    .line 107
    .line 108
    .line 109
    move-result-object v4

    .line 110
    :goto_0
    if-nez v4, :cond_2

    .line 111
    .line 112
    new-instance v0, Lt33;

    .line 113
    .line 114
    const/4 v1, 0x0

    .line 115
    invoke-direct {v0, v3, v2, v1}, Lt33;-><init>(Ljava/lang/String;II)V

    .line 116
    .line 117
    .line 118
    invoke-static {v0}, Lpu1;->r(Ljava/lang/Object;)Llq3;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    return-object v0

    .line 123
    :cond_2
    invoke-static {v4}, Lwl2;->D(Lgi4;)Lsf3;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    sget-object v2, Lfi1;->k:Lfi1;

    .line 128
    .line 129
    sget-object v3, Lmd2;->g:Lld2;

    .line 130
    .line 131
    invoke-static {v0, v2, v3}, Lpu1;->O(Ln70;Lyp3;Ljava/util/concurrent/Executor;)Lqp3;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    sget-object v2, Lmz1;->m3:Liz1;

    .line 136
    .line 137
    iget-object v3, v1, Ltw1;->c:Lkz1;

    .line 138
    .line 139
    invoke-virtual {v3, v2}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v2

    .line 143
    check-cast v2, Ljava/lang/Boolean;

    .line 144
    .line 145
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 146
    .line 147
    .line 148
    move-result v2

    .line 149
    if-eqz v2, :cond_3

    .line 150
    .line 151
    sget-object v2, Lmz1;->n3:Liz1;

    .line 152
    .line 153
    iget-object v1, v1, Ltw1;->c:Lkz1;

    .line 154
    .line 155
    invoke-virtual {v1, v2}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v1

    .line 159
    check-cast v1, Ljava/lang/Long;

    .line 160
    .line 161
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 162
    .line 163
    .line 164
    move-result-wide v1

    .line 165
    iget-object v3, p0, Ls33;->c:Ljava/util/concurrent/ScheduledExecutorService;

    .line 166
    .line 167
    sget-object v4, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 168
    .line 169
    invoke-static {v0, v1, v2, v4, v3}, Lpu1;->N(Ln70;JLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/ScheduledExecutorService;)Ln70;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    :cond_3
    new-instance v1, Lvn1;

    .line 174
    .line 175
    const/4 v2, 0x5

    .line 176
    invoke-direct {v1, v2, p0}, Lvn1;-><init>(ILjava/lang/Object;)V

    .line 177
    .line 178
    .line 179
    iget-object v2, p0, Ls33;->d:Lpq3;

    .line 180
    .line 181
    const-class v3, Ljava/lang/Exception;

    .line 182
    .line 183
    invoke-static {v0, v3, v1, v2}, Lpu1;->J(Ln70;Ljava/lang/Class;Lzk3;Ljava/util/concurrent/Executor;)Lxo3;

    .line 184
    .line 185
    .line 186
    move-result-object v0

    .line 187
    return-object v0

    .line 188
    :cond_4
    new-instance v0, Lt33;

    .line 189
    .line 190
    const/4 v1, 0x0

    .line 191
    invoke-direct {v0, v3, v2, v1}, Lt33;-><init>(Ljava/lang/String;II)V

    .line 192
    .line 193
    .line 194
    invoke-static {v0}, Lpu1;->r(Ljava/lang/Object;)Llq3;

    .line 195
    .line 196
    .line 197
    move-result-object v0

    .line 198
    return-object v0
.end method

.method public final d()I
    .locals 1

    .line 1
    const/16 v0, 0xb

    .line 2
    .line 3
    return v0
.end method
