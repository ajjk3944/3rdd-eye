.class public final Lay2;
.super Lfy2;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final synthetic l:I

.field public final m:Landroid/content/Context;

.field public final n:Ljava/util/concurrent/Executor;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lld2;I)V
    .locals 12

    .line 1
    iput p3, p0, Lay2;->l:I

    .line 2
    .line 3
    packed-switch p3, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lfy2;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lay2;->m:Landroid/content/Context;

    .line 10
    .line 11
    iput-object p2, p0, Lay2;->n:Ljava/util/concurrent/Executor;

    .line 12
    .line 13
    sget-object p2, Lhg4;->C:Lhg4;

    .line 14
    .line 15
    iget-object p2, p2, Lhg4;->t:Lr2;

    .line 16
    .line 17
    invoke-virtual {p2}, Lr2;->a()Landroid/os/Looper;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    new-instance v0, Lvw1;

    .line 22
    .line 23
    const/4 v5, 0x2

    .line 24
    move-object v4, p0

    .line 25
    move-object v3, p0

    .line 26
    move-object v1, p1

    .line 27
    invoke-direct/range {v0 .. v5}, Lvw1;-><init>(Landroid/content/Context;Landroid/os/Looper;Lt9;Lu9;I)V

    .line 28
    .line 29
    .line 30
    iput-object v0, v3, Lfy2;->k:Lvw1;

    .line 31
    .line 32
    return-void

    .line 33
    :pswitch_0
    move-object v3, p0

    .line 34
    move-object v1, p1

    .line 35
    invoke-direct {p0}, Lfy2;-><init>()V

    .line 36
    .line 37
    .line 38
    iput-object v1, v3, Lay2;->m:Landroid/content/Context;

    .line 39
    .line 40
    iput-object p2, v3, Lay2;->n:Ljava/util/concurrent/Executor;

    .line 41
    .line 42
    sget-object p1, Lhg4;->C:Lhg4;

    .line 43
    .line 44
    iget-object p1, p1, Lhg4;->t:Lr2;

    .line 45
    .line 46
    invoke-virtual {p1}, Lr2;->a()Landroid/os/Looper;

    .line 47
    .line 48
    .line 49
    move-result-object v8

    .line 50
    new-instance v6, Lvw1;

    .line 51
    .line 52
    const/4 v11, 0x2

    .line 53
    move-object v10, p0

    .line 54
    move-object v7, v1

    .line 55
    move-object v9, v3

    .line 56
    invoke-direct/range {v6 .. v11}, Lvw1;-><init>(Landroid/content/Context;Landroid/os/Looper;Lt9;Lu9;I)V

    .line 57
    .line 58
    .line 59
    iput-object v6, v3, Lfy2;->k:Lvw1;

    .line 60
    .line 61
    return-void

    .line 62
    nop

    .line 63
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public U(Lrh;)V
    .locals 1

    .line 1
    iget v0, p0, Lay2;->l:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Lfy2;->U(Lrh;)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    const-string p1, "Cannot connect to remote service, fallback to local instance."

    .line 11
    .line 12
    invoke-static {p1}, Lgi2;->U(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    new-instance p1, Lmy2;

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    invoke-direct {p1, v0}, Lhx2;-><init>(I)V

    .line 19
    .line 20
    .line 21
    iget-object v0, p0, Lfy2;->f:Lpd2;

    .line 22
    .line 23
    invoke-virtual {v0, p1}, Lpd2;->b(Ljava/lang/Throwable;)V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final Y()V
    .locals 7

    .line 1
    iget v0, p0, Lay2;->l:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lfy2;->g:Ljava/lang/Object;

    .line 7
    .line 8
    monitor-enter v0

    .line 9
    :try_start_0
    iget-boolean v1, p0, Lfy2;->i:Z

    .line 10
    .line 11
    if-nez v1, :cond_1

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    iput-boolean v1, p0, Lfy2;->i:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 15
    .line 16
    :try_start_1
    iget-object v2, p0, Lfy2;->k:Lvw1;

    .line 17
    .line 18
    invoke-virtual {v2}, Lw9;->t()Landroid/os/IInterface;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    check-cast v2, Ly92;

    .line 23
    .line 24
    iget-object v3, p0, Lfy2;->j:Lfa2;

    .line 25
    .line 26
    sget-object v4, Lmz1;->Ld:Liz1;

    .line 27
    .line 28
    sget-object v5, Ltw1;->e:Ltw1;

    .line 29
    .line 30
    iget-object v5, v5, Ltw1;->c:Lkz1;

    .line 31
    .line 32
    invoke-virtual {v5, v4}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    check-cast v4, Ljava/lang/Boolean;

    .line 37
    .line 38
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    if-eqz v4, :cond_0

    .line 43
    .line 44
    new-instance v4, Ley2;

    .line 45
    .line 46
    iget-object v5, p0, Lfy2;->f:Lpd2;

    .line 47
    .line 48
    iget-object v6, p0, Lfy2;->j:Lfa2;

    .line 49
    .line 50
    invoke-direct {v4, v5, v6}, Ley2;-><init>(Lpd2;Lfa2;)V

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :catchall_0
    move-exception v2

    .line 55
    goto :goto_1

    .line 56
    :cond_0
    new-instance v4, Ldy2;

    .line 57
    .line 58
    invoke-direct {v4, p0}, Ldy2;-><init>(Lfy2;)V

    .line 59
    .line 60
    .line 61
    :goto_0
    invoke-interface {v2, v3, v4}, Ly92;->x0(Lfa2;Lda2;)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 62
    .line 63
    .line 64
    goto :goto_2

    .line 65
    :goto_1
    :try_start_2
    sget-object v3, Lhg4;->C:Lhg4;

    .line 66
    .line 67
    iget-object v3, v3, Lhg4;->h:Lgd2;

    .line 68
    .line 69
    const-string v4, "RemoteSignalsClientTask.onConnected"

    .line 70
    .line 71
    invoke-virtual {v3, v4, v2}, Lgd2;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 72
    .line 73
    .line 74
    iget-object v2, p0, Lfy2;->f:Lpd2;

    .line 75
    .line 76
    new-instance v3, Lmy2;

    .line 77
    .line 78
    invoke-direct {v3, v1}, Lhx2;-><init>(I)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v2, v3}, Lpd2;->b(Ljava/lang/Throwable;)V

    .line 82
    .line 83
    .line 84
    goto :goto_2

    .line 85
    :catchall_1
    move-exception v1

    .line 86
    goto :goto_3

    .line 87
    :catch_0
    iget-object v2, p0, Lfy2;->f:Lpd2;

    .line 88
    .line 89
    new-instance v3, Lmy2;

    .line 90
    .line 91
    invoke-direct {v3, v1}, Lhx2;-><init>(I)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v2, v3}, Lpd2;->b(Ljava/lang/Throwable;)V

    .line 95
    .line 96
    .line 97
    :cond_1
    :goto_2
    monitor-exit v0

    .line 98
    return-void

    .line 99
    :goto_3
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 100
    throw v1

    .line 101
    :pswitch_0
    iget-object v0, p0, Lfy2;->g:Ljava/lang/Object;

    .line 102
    .line 103
    monitor-enter v0

    .line 104
    :try_start_3
    iget-boolean v1, p0, Lfy2;->i:Z

    .line 105
    .line 106
    if-nez v1, :cond_3

    .line 107
    .line 108
    const/4 v1, 0x1

    .line 109
    iput-boolean v1, p0, Lfy2;->i:Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 110
    .line 111
    :try_start_4
    iget-object v2, p0, Lfy2;->k:Lvw1;

    .line 112
    .line 113
    invoke-virtual {v2}, Lw9;->t()Landroid/os/IInterface;

    .line 114
    .line 115
    .line 116
    move-result-object v2

    .line 117
    check-cast v2, Ly92;

    .line 118
    .line 119
    iget-object v3, p0, Lfy2;->j:Lfa2;

    .line 120
    .line 121
    sget-object v4, Lmz1;->Ld:Liz1;

    .line 122
    .line 123
    sget-object v5, Ltw1;->e:Ltw1;

    .line 124
    .line 125
    iget-object v5, v5, Ltw1;->c:Lkz1;

    .line 126
    .line 127
    invoke-virtual {v5, v4}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v4

    .line 131
    check-cast v4, Ljava/lang/Boolean;

    .line 132
    .line 133
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 134
    .line 135
    .line 136
    move-result v4

    .line 137
    if-eqz v4, :cond_2

    .line 138
    .line 139
    new-instance v4, Ley2;

    .line 140
    .line 141
    iget-object v5, p0, Lfy2;->f:Lpd2;

    .line 142
    .line 143
    iget-object v6, p0, Lfy2;->j:Lfa2;

    .line 144
    .line 145
    invoke-direct {v4, v5, v6}, Ley2;-><init>(Lpd2;Lfa2;)V

    .line 146
    .line 147
    .line 148
    goto :goto_4

    .line 149
    :catchall_2
    move-exception v2

    .line 150
    goto :goto_5

    .line 151
    :cond_2
    new-instance v4, Ldy2;

    .line 152
    .line 153
    invoke-direct {v4, p0}, Ldy2;-><init>(Lfy2;)V

    .line 154
    .line 155
    .line 156
    :goto_4
    invoke-interface {v2, v3, v4}, Ly92;->k1(Lfa2;Lda2;)V
    :try_end_4
    .catch Landroid/os/RemoteException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 157
    .line 158
    .line 159
    goto :goto_6

    .line 160
    :goto_5
    :try_start_5
    sget-object v3, Lhg4;->C:Lhg4;

    .line 161
    .line 162
    iget-object v3, v3, Lhg4;->h:Lgd2;

    .line 163
    .line 164
    const-string v4, "RemoteAdRequestClientTask.onConnected"

    .line 165
    .line 166
    invoke-virtual {v3, v4, v2}, Lgd2;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 167
    .line 168
    .line 169
    iget-object v2, p0, Lfy2;->f:Lpd2;

    .line 170
    .line 171
    new-instance v3, Lmy2;

    .line 172
    .line 173
    invoke-direct {v3, v1}, Lhx2;-><init>(I)V

    .line 174
    .line 175
    .line 176
    invoke-virtual {v2, v3}, Lpd2;->b(Ljava/lang/Throwable;)V

    .line 177
    .line 178
    .line 179
    goto :goto_6

    .line 180
    :catchall_3
    move-exception v1

    .line 181
    goto :goto_7

    .line 182
    :catch_1
    iget-object v2, p0, Lfy2;->f:Lpd2;

    .line 183
    .line 184
    new-instance v3, Lmy2;

    .line 185
    .line 186
    invoke-direct {v3, v1}, Lhx2;-><init>(I)V

    .line 187
    .line 188
    .line 189
    invoke-virtual {v2, v3}, Lpd2;->b(Ljava/lang/Throwable;)V

    .line 190
    .line 191
    .line 192
    :cond_3
    :goto_6
    monitor-exit v0

    .line 193
    return-void

    .line 194
    :goto_7
    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 195
    throw v1

    .line 196
    nop

    .line 197
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public c(Lfa2;)Ln70;
    .locals 4

    .line 1
    iget-object v0, p0, Lfy2;->g:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-boolean v1, p0, Lfy2;->h:Z

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    iget-object p1, p0, Lfy2;->f:Lpd2;

    .line 9
    .line 10
    monitor-exit v0

    .line 11
    return-object p1

    .line 12
    :catchall_0
    move-exception p1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v1, 0x1

    .line 15
    iput-boolean v1, p0, Lfy2;->h:Z

    .line 16
    .line 17
    iput-object p1, p0, Lfy2;->j:Lfa2;

    .line 18
    .line 19
    iget-object p1, p0, Lfy2;->k:Lvw1;

    .line 20
    .line 21
    invoke-virtual {p1}, Lw9;->n()V

    .line 22
    .line 23
    .line 24
    iget-object p1, p0, Lfy2;->f:Lpd2;

    .line 25
    .line 26
    new-instance v1, Lbs2;

    .line 27
    .line 28
    const/4 v2, 0x7

    .line 29
    invoke-direct {v1, v2, p0}, Lbs2;-><init>(ILjava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    sget-object v2, Lmd2;->g:Lld2;

    .line 33
    .line 34
    iget-object v3, p1, Lpd2;->f:Lwq3;

    .line 35
    .line 36
    invoke-virtual {v3, v1, v2}, Lgp3;->c(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 37
    .line 38
    .line 39
    iget-object v1, p0, Lay2;->m:Landroid/content/Context;

    .line 40
    .line 41
    iget-object v2, p0, Lay2;->n:Ljava/util/concurrent/Executor;

    .line 42
    .line 43
    invoke-static {v1, p1, v2}, Lfy2;->b(Landroid/content/Context;Lpd2;Ljava/util/concurrent/Executor;)V

    .line 44
    .line 45
    .line 46
    monitor-exit v0

    .line 47
    return-object p1

    .line 48
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 49
    throw p1
.end method
