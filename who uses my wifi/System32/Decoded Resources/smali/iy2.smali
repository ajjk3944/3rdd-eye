.class public final Liy2;
.super Lfy2;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public l:Ljava/lang/String;

.field public m:I


# virtual methods
.method public final U(Lrh;)V
    .locals 1

    .line 1
    const-string p1, "Cannot connect to remote service, fallback to local instance."

    .line 2
    .line 3
    invoke-static {p1}, Lgi2;->U(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance p1, Lmy2;

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    invoke-direct {p1, v0}, Lhx2;-><init>(I)V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lfy2;->f:Lpd2;

    .line 13
    .line 14
    invoke-virtual {v0, p1}, Lpd2;->b(Ljava/lang/Throwable;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final Y()V
    .locals 7

    .line 1
    iget-object v0, p0, Lfy2;->g:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-boolean v1, p0, Lfy2;->i:Z

    .line 5
    .line 6
    if-nez v1, :cond_4

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    iput-boolean v1, p0, Lfy2;->i:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 10
    .line 11
    :try_start_1
    iget v2, p0, Liy2;->m:I

    .line 12
    .line 13
    const/4 v3, 0x2

    .line 14
    if-ne v2, v3, :cond_1

    .line 15
    .line 16
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
    goto :goto_2

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
    invoke-interface {v2, v3, v4}, Ly92;->Q2(Lfa2;Lda2;)V

    .line 62
    .line 63
    .line 64
    goto :goto_3

    .line 65
    :cond_1
    const/4 v3, 0x3

    .line 66
    if-ne v2, v3, :cond_3

    .line 67
    .line 68
    iget-object v2, p0, Lfy2;->k:Lvw1;

    .line 69
    .line 70
    invoke-virtual {v2}, Lw9;->t()Landroid/os/IInterface;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    check-cast v2, Ly92;

    .line 75
    .line 76
    iget-object v3, p0, Liy2;->l:Ljava/lang/String;

    .line 77
    .line 78
    sget-object v4, Lmz1;->Ld:Liz1;

    .line 79
    .line 80
    sget-object v5, Ltw1;->e:Ltw1;

    .line 81
    .line 82
    iget-object v5, v5, Ltw1;->c:Lkz1;

    .line 83
    .line 84
    invoke-virtual {v5, v4}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v4

    .line 88
    check-cast v4, Ljava/lang/Boolean;

    .line 89
    .line 90
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 91
    .line 92
    .line 93
    move-result v4

    .line 94
    if-eqz v4, :cond_2

    .line 95
    .line 96
    new-instance v4, Ley2;

    .line 97
    .line 98
    iget-object v5, p0, Lfy2;->f:Lpd2;

    .line 99
    .line 100
    iget-object v6, p0, Lfy2;->j:Lfa2;

    .line 101
    .line 102
    invoke-direct {v4, v5, v6}, Ley2;-><init>(Lpd2;Lfa2;)V

    .line 103
    .line 104
    .line 105
    goto :goto_1

    .line 106
    :cond_2
    new-instance v4, Ldy2;

    .line 107
    .line 108
    invoke-direct {v4, p0}, Ldy2;-><init>(Lfy2;)V

    .line 109
    .line 110
    .line 111
    :goto_1
    invoke-interface {v2, v3, v4}, Ly92;->n3(Ljava/lang/String;Lda2;)V

    .line 112
    .line 113
    .line 114
    goto :goto_3

    .line 115
    :cond_3
    iget-object v2, p0, Lfy2;->f:Lpd2;

    .line 116
    .line 117
    new-instance v3, Lmy2;

    .line 118
    .line 119
    invoke-direct {v3, v1}, Lhx2;-><init>(I)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v2, v3}, Lpd2;->b(Ljava/lang/Throwable;)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 123
    .line 124
    .line 125
    goto :goto_3

    .line 126
    :goto_2
    :try_start_2
    sget-object v3, Lhg4;->C:Lhg4;

    .line 127
    .line 128
    iget-object v3, v3, Lhg4;->h:Lgd2;

    .line 129
    .line 130
    const-string v4, "RemoteUrlAndCacheKeyClientTask.onConnected"

    .line 131
    .line 132
    invoke-virtual {v3, v4, v2}, Lgd2;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 133
    .line 134
    .line 135
    iget-object v2, p0, Lfy2;->f:Lpd2;

    .line 136
    .line 137
    new-instance v3, Lmy2;

    .line 138
    .line 139
    invoke-direct {v3, v1}, Lhx2;-><init>(I)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {v2, v3}, Lpd2;->b(Ljava/lang/Throwable;)V

    .line 143
    .line 144
    .line 145
    goto :goto_3

    .line 146
    :catchall_1
    move-exception v1

    .line 147
    goto :goto_4

    .line 148
    :catch_0
    iget-object v2, p0, Lfy2;->f:Lpd2;

    .line 149
    .line 150
    new-instance v3, Lmy2;

    .line 151
    .line 152
    invoke-direct {v3, v1}, Lhx2;-><init>(I)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {v2, v3}, Lpd2;->b(Ljava/lang/Throwable;)V

    .line 156
    .line 157
    .line 158
    :cond_4
    :goto_3
    monitor-exit v0

    .line 159
    return-void

    .line 160
    :goto_4
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 161
    throw v1
.end method
