.class public final Lt13;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lf03;


# instance fields
.field public final synthetic a:I

.field public final b:Landroid/content/Context;

.field public final c:Ljava/util/concurrent/Executor;

.field public final d:Lji2;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Ljava/util/concurrent/Executor;Lji2;I)V
    .locals 0

    .line 1
    iput p4, p0, Lt13;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lt13;->b:Landroid/content/Context;

    .line 4
    .line 5
    iput-object p2, p0, Lt13;->c:Ljava/util/concurrent/Executor;

    .line 6
    .line 7
    iput-object p3, p0, Lt13;->d:Lji2;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public static final c(Lh83;La83;Lc03;)V
    .locals 1

    .line 1
    :try_start_0
    iget-object v0, p2, Lc03;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lu83;

    .line 4
    .line 5
    iget-object p0, p0, Lh83;->a:Lf20;

    .line 6
    .line 7
    iget-object p0, p0, Lf20;->g:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p0, Ll83;

    .line 10
    .line 11
    iget-object p0, p0, Ll83;->d:Lpc4;

    .line 12
    .line 13
    iget-object p1, p1, La83;->v:Lorg/json/JSONObject;

    .line 14
    .line 15
    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 19
    :try_start_1
    iget-object v0, v0, Lu83;->a:Lw62;

    .line 20
    .line 21
    invoke-interface {v0, p1, p0}, Lw62;->U1(Ljava/lang/String;Lpc4;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :catchall_0
    move-exception p0

    .line 26
    :try_start_2
    new-instance p1, Ln83;

    .line 27
    .line 28
    invoke-direct {p1, p0}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    .line 29
    .line 30
    .line 31
    throw p1
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 32
    :catch_0
    iget-object p0, p2, Lc03;->a:Ljava/lang/String;

    .line 33
    .line 34
    const-string p1, "Fail to load ad from adapter "

    .line 35
    .line 36
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    const/4 p0, 0x5

    .line 44
    invoke-static {p0}, Lgi2;->q0(I)Z

    .line 45
    .line 46
    .line 47
    return-void
.end method


# virtual methods
.method public final a(Lh83;La83;Lc03;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget v0, p0, Lt13;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p3, Lc03;->a:Ljava/lang/String;

    .line 7
    .line 8
    new-instance v1, Lxb4;

    .line 9
    .line 10
    invoke-direct {v1, p1, p2, v0}, Lxb4;-><init>(Lh83;La83;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    new-instance p1, Lju2;

    .line 14
    .line 15
    new-instance v0, Lk03;

    .line 16
    .line 17
    const/4 v2, 0x1

    .line 18
    invoke-direct {v0, p0, p3, p2, v2}, Lk03;-><init>(Lf03;Lc03;La83;I)V

    .line 19
    .line 20
    .line 21
    const/4 p2, 0x0

    .line 22
    const/4 v2, 0x0

    .line 23
    invoke-direct {p1, v0, p2, v2}, Lju2;-><init>(Lqq2;Lag2;I)V

    .line 24
    .line 25
    .line 26
    iget-object p2, p0, Lt13;->d:Lji2;

    .line 27
    .line 28
    new-instance v0, Lii2;

    .line 29
    .line 30
    iget-object v2, p2, Lji2;->c:Lth2;

    .line 31
    .line 32
    iget-object p2, p2, Lji2;->d:Lji2;

    .line 33
    .line 34
    invoke-direct {v0, v2, p2, v1, p1}, Lii2;-><init>(Lth2;Lji2;Lxb4;Lju2;)V

    .line 35
    .line 36
    .line 37
    iget-object p1, v0, Lii2;->r:Lba4;

    .line 38
    .line 39
    invoke-virtual {p1}, Lba4;->d()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    check-cast p1, Lfn2;

    .line 44
    .line 45
    iget-object p2, p3, Lc03;->b:Ljava/lang/Object;

    .line 46
    .line 47
    new-instance v1, Lcj2;

    .line 48
    .line 49
    check-cast p2, Lu83;

    .line 50
    .line 51
    const/4 v2, 0x0

    .line 52
    invoke-direct {v1, v2, p2}, Lcj2;-><init>(ILjava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    iget-object p2, p0, Lt13;->c:Ljava/util/concurrent/Executor;

    .line 56
    .line 57
    invoke-virtual {p1, v1, p2}, Lf74;->L1(Ljava/lang/Object;Ljava/util/concurrent/Executor;)V

    .line 58
    .line 59
    .line 60
    iget-object p1, v0, Lii2;->y:Lba4;

    .line 61
    .line 62
    invoke-virtual {p1}, Lba4;->d()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    move-object v5, p1

    .line 67
    check-cast v5, Lgn2;

    .line 68
    .line 69
    iget-object p1, v0, Lii2;->z:Lba4;

    .line 70
    .line 71
    invoke-virtual {p1}, Lba4;->d()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    move-object v4, p1

    .line 76
    check-cast v4, Lsm2;

    .line 77
    .line 78
    iget-object p1, v0, Lii2;->E:Lba4;

    .line 79
    .line 80
    invoke-virtual {p1}, Lba4;->d()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    move-object v3, p1

    .line 85
    check-cast v3, Lxn2;

    .line 86
    .line 87
    iget-object p1, v0, Lii2;->K:Lba4;

    .line 88
    .line 89
    invoke-virtual {p1}, Lba4;->d()Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    move-object v6, p1

    .line 94
    check-cast v6, Lcq2;

    .line 95
    .line 96
    iget-object p1, p3, Lc03;->c:Lhv1;

    .line 97
    .line 98
    move-object v7, p1

    .line 99
    check-cast v7, Lw03;

    .line 100
    .line 101
    new-instance v1, Ly13;

    .line 102
    .line 103
    move-object v2, p0

    .line 104
    invoke-direct/range {v1 .. v6}, Ly13;-><init>(Lt13;Lxn2;Lsm2;Lgn2;Lcq2;)V

    .line 105
    .line 106
    .line 107
    monitor-enter v7

    .line 108
    :try_start_0
    iput-object v1, v7, Lw03;->f:Ly13;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 109
    .line 110
    monitor-exit v7

    .line 111
    invoke-virtual {v0}, Lii2;->y()Liu2;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    return-object p1

    .line 116
    :catchall_0
    move-exception v0

    .line 117
    move-object p1, v0

    .line 118
    :try_start_1
    monitor-exit v7
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 119
    throw p1

    .line 120
    :pswitch_0
    move-object v2, p0

    .line 121
    iget-object v0, p3, Lc03;->a:Ljava/lang/String;

    .line 122
    .line 123
    new-instance v1, Lxb4;

    .line 124
    .line 125
    invoke-direct {v1, p1, p2, v0}, Lxb4;-><init>(Lh83;La83;Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    new-instance p1, Lju2;

    .line 129
    .line 130
    new-instance v0, Llv2;

    .line 131
    .line 132
    const/4 v3, 0x3

    .line 133
    invoke-direct {v0, p0, p3, p2, v3}, Llv2;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 134
    .line 135
    .line 136
    const/4 p2, 0x0

    .line 137
    const/4 v3, 0x0

    .line 138
    invoke-direct {p1, v0, p2, v3}, Lju2;-><init>(Lqq2;Lag2;I)V

    .line 139
    .line 140
    .line 141
    iget-object p2, v2, Lt13;->d:Lji2;

    .line 142
    .line 143
    new-instance v0, Lii2;

    .line 144
    .line 145
    iget-object v3, p2, Lji2;->c:Lth2;

    .line 146
    .line 147
    iget-object p2, p2, Lji2;->d:Lji2;

    .line 148
    .line 149
    invoke-direct {v0, v3, p2, v1, p1}, Lii2;-><init>(Lth2;Lji2;Lxb4;Lju2;)V

    .line 150
    .line 151
    .line 152
    iget-object p1, v0, Lii2;->r:Lba4;

    .line 153
    .line 154
    invoke-virtual {p1}, Lba4;->d()Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object p1

    .line 158
    check-cast p1, Lfn2;

    .line 159
    .line 160
    iget-object p2, p3, Lc03;->b:Ljava/lang/Object;

    .line 161
    .line 162
    new-instance v1, Lcj2;

    .line 163
    .line 164
    check-cast p2, Lu83;

    .line 165
    .line 166
    const/4 v3, 0x0

    .line 167
    invoke-direct {v1, v3, p2}, Lcj2;-><init>(ILjava/lang/Object;)V

    .line 168
    .line 169
    .line 170
    iget-object p2, v2, Lt13;->c:Ljava/util/concurrent/Executor;

    .line 171
    .line 172
    invoke-virtual {p1, v1, p2}, Lf74;->L1(Ljava/lang/Object;Ljava/util/concurrent/Executor;)V

    .line 173
    .line 174
    .line 175
    iget-object p1, p3, Lc03;->c:Lhv1;

    .line 176
    .line 177
    check-cast p1, Lu03;

    .line 178
    .line 179
    iget-object p2, v0, Lii2;->M:Lba4;

    .line 180
    .line 181
    invoke-virtual {p2}, Lba4;->d()Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object p2

    .line 185
    check-cast p2, Lv13;

    .line 186
    .line 187
    invoke-virtual {p1, p2}, Lu03;->C3(Lc23;)V

    .line 188
    .line 189
    .line 190
    invoke-virtual {v0}, Lii2;->y()Liu2;

    .line 191
    .line 192
    .line 193
    move-result-object p1

    .line 194
    return-object p1

    .line 195
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final b(Lh83;La83;Lc03;)V
    .locals 8

    .line 1
    iget v0, p0, Lt13;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p3, Lc03;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lu83;

    .line 9
    .line 10
    invoke-virtual {v0}, Lu83;->a()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-nez v1, :cond_0

    .line 15
    .line 16
    new-instance v2, Lmc2;

    .line 17
    .line 18
    const/16 v7, 0x11

    .line 19
    .line 20
    move-object v3, p0

    .line 21
    move-object v4, p1

    .line 22
    move-object v5, p2

    .line 23
    move-object v6, p3

    .line 24
    invoke-direct/range {v2 .. v7}, Lmc2;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 25
    .line 26
    .line 27
    iget-object p1, v6, Lc03;->c:Lhv1;

    .line 28
    .line 29
    move-object p2, p1

    .line 30
    check-cast p2, Lw03;

    .line 31
    .line 32
    monitor-enter p2

    .line 33
    :try_start_0
    iput-object v2, p2, Lw03;->h:Lmc2;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 34
    .line 35
    monitor-exit p2

    .line 36
    iget-object p2, v3, Lt13;->b:Landroid/content/Context;

    .line 37
    .line 38
    iget-object p3, v4, Lh83;->a:Lf20;

    .line 39
    .line 40
    iget-object p3, p3, Lf20;->g:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast p3, Ll83;

    .line 43
    .line 44
    check-cast p1, Lsa2;

    .line 45
    .line 46
    iget-object v1, v5, La83;->v:Lorg/json/JSONObject;

    .line 47
    .line 48
    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    iget-object p3, p3, Ll83;->d:Lpc4;

    .line 53
    .line 54
    :try_start_1
    iget-object v0, v0, Lu83;->a:Lw62;

    .line 55
    .line 56
    new-instance v2, Loi0;

    .line 57
    .line 58
    invoke-direct {v2, p2}, Loi0;-><init>(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    invoke-interface {v0, v2, p3, p1, v1}, Lw62;->u1(Lu10;Lpc4;Lsa2;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 62
    .line 63
    .line 64
    goto :goto_0

    .line 65
    :catchall_0
    move-exception v0

    .line 66
    move-object p1, v0

    .line 67
    new-instance p2, Ln83;

    .line 68
    .line 69
    invoke-direct {p2, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    .line 70
    .line 71
    .line 72
    throw p2

    .line 73
    :catchall_1
    move-exception v0

    .line 74
    move-object p1, v0

    .line 75
    :try_start_2
    monitor-exit p2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 76
    throw p1

    .line 77
    :cond_0
    move-object v3, p0

    .line 78
    move-object v4, p1

    .line 79
    move-object v5, p2

    .line 80
    move-object v6, p3

    .line 81
    invoke-static {v4, v5, v6}, Lt13;->c(Lh83;La83;Lc03;)V

    .line 82
    .line 83
    .line 84
    :goto_0
    return-void

    .line 85
    :pswitch_0
    move-object v3, p0

    .line 86
    move-object v4, p1

    .line 87
    move-object v5, p2

    .line 88
    move-object v6, p3

    .line 89
    iget-object p1, v5, La83;->v:Lorg/json/JSONObject;

    .line 90
    .line 91
    iget-object p2, v6, Lc03;->c:Lhv1;

    .line 92
    .line 93
    iget-object p3, v6, Lc03;->b:Ljava/lang/Object;

    .line 94
    .line 95
    iget-object v0, v3, Lt13;->b:Landroid/content/Context;

    .line 96
    .line 97
    :try_start_3
    iget-object v1, v4, Lh83;->a:Lf20;

    .line 98
    .line 99
    iget-object v1, v1, Lf20;->g:Ljava/lang/Object;

    .line 100
    .line 101
    check-cast v1, Ll83;

    .line 102
    .line 103
    iget-object v2, v1, Ll83;->p:Lh80;

    .line 104
    .line 105
    iget-object v1, v1, Ll83;->d:Lpc4;

    .line 106
    .line 107
    iget v2, v2, Lh80;->g:I

    .line 108
    .line 109
    const/4 v4, 0x3

    .line 110
    if-ne v2, v4, :cond_1

    .line 111
    .line 112
    check-cast p3, Lu83;

    .line 113
    .line 114
    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    check-cast p2, Lz62;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    .line 119
    .line 120
    :try_start_4
    iget-object p3, p3, Lu83;->a:Lw62;

    .line 121
    .line 122
    new-instance v2, Loi0;

    .line 123
    .line 124
    invoke-direct {v2, v0}, Loi0;-><init>(Ljava/lang/Object;)V

    .line 125
    .line 126
    .line 127
    invoke-interface {p3, v2, v1, p1, p2}, Lw62;->b3(Lu10;Lpc4;Ljava/lang/String;Lz62;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 128
    .line 129
    .line 130
    goto :goto_1

    .line 131
    :catchall_2
    move-exception v0

    .line 132
    move-object p1, v0

    .line 133
    :try_start_5
    new-instance p2, Ln83;

    .line 134
    .line 135
    invoke-direct {p2, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    .line 136
    .line 137
    .line 138
    throw p2

    .line 139
    :cond_1
    check-cast p3, Lu83;

    .line 140
    .line 141
    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object p1

    .line 145
    check-cast p2, Lz62;
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0

    .line 146
    .line 147
    :try_start_6
    iget-object p3, p3, Lu83;->a:Lw62;

    .line 148
    .line 149
    new-instance v2, Loi0;

    .line 150
    .line 151
    invoke-direct {v2, v0}, Loi0;-><init>(Ljava/lang/Object;)V

    .line 152
    .line 153
    .line 154
    invoke-interface {p3, v2, v1, p1, p2}, Lw62;->y0(Lu10;Lpc4;Ljava/lang/String;Lz62;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 155
    .line 156
    .line 157
    goto :goto_1

    .line 158
    :catchall_3
    move-exception v0

    .line 159
    move-object p1, v0

    .line 160
    :try_start_7
    new-instance p2, Ln83;

    .line 161
    .line 162
    invoke-direct {p2, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    .line 163
    .line 164
    .line 165
    throw p2
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_0

    .line 166
    :catch_0
    iget-object p1, v6, Lc03;->a:Ljava/lang/String;

    .line 167
    .line 168
    const-string p2, "Fail to load ad from adapter "

    .line 169
    .line 170
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object p1

    .line 174
    invoke-virtual {p2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    const/4 p1, 0x5

    .line 178
    invoke-static {p1}, Lgi2;->q0(I)Z

    .line 179
    .line 180
    .line 181
    :goto_1
    return-void

    .line 182
    nop

    .line 183
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
