.class public final Lta0;
.super Lmz0;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lhy;


# instance fields
.field public final synthetic j:Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;


# direct methods
.method public constructor <init>(Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;Loj;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lta0;->j:Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, Lmz0;-><init>(ILoj;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final f(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lqk;

    .line 2
    .line 3
    check-cast p2, Loj;

    .line 4
    .line 5
    invoke-virtual {p0, p2, p1}, Lta0;->h(Loj;Ljava/lang/Object;)Loj;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lta0;

    .line 10
    .line 11
    sget-object p2, Lz31;->a:Lz31;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lta0;->m(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    return-object p2
.end method

.method public final h(Loj;Ljava/lang/Object;)Loj;
    .locals 1

    .line 1
    new-instance p2, Lta0;

    .line 2
    .line 3
    iget-object v0, p0, Lta0;->j:Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;

    .line 4
    .line 5
    invoke-direct {p2, v0, p1}, Lta0;-><init>(Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;Loj;)V

    .line 6
    .line 7
    .line 8
    return-object p2
.end method

.method public final m(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    invoke-static {p1}, Lbd2;->x(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lta0;->j:Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;

    .line 5
    .line 6
    new-instance v0, Lsa0;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-static {}, Lf53;->d()Lf53;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    iget-object v2, v1, Lf53;->a:Ljava/lang/Object;

    .line 16
    .line 17
    monitor-enter v2

    .line 18
    :try_start_0
    iget-boolean v3, v1, Lf53;->c:Z

    .line 19
    .line 20
    if-eqz v3, :cond_0

    .line 21
    .line 22
    iget-object p1, v1, Lf53;->b:Ljava/util/ArrayList;

    .line 23
    .line 24
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    monitor-exit v2

    .line 28
    goto/16 :goto_2

    .line 29
    .line 30
    :catchall_0
    move-exception p1

    .line 31
    goto/16 :goto_4

    .line 32
    .line 33
    :cond_0
    iget-boolean v3, v1, Lf53;->d:Z

    .line 34
    .line 35
    if-eqz v3, :cond_1

    .line 36
    .line 37
    invoke-virtual {v1}, Lf53;->e()V

    .line 38
    .line 39
    .line 40
    monitor-exit v2

    .line 41
    goto/16 :goto_2

    .line 42
    .line 43
    :cond_1
    const/4 v3, 0x1

    .line 44
    iput-boolean v3, v1, Lf53;->c:Z

    .line 45
    .line 46
    iget-object v3, v1, Lf53;->b:Ljava/util/ArrayList;

    .line 47
    .line 48
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 52
    iget-object v0, v1, Lf53;->e:Ljava/lang/Object;

    .line 53
    .line 54
    monitor-enter v0

    .line 55
    :try_start_1
    invoke-virtual {v1, p1}, Lf53;->b(Landroid/content/Context;)V

    .line 56
    .line 57
    .line 58
    iget-object v2, v1, Lf53;->f:Lzn2;

    .line 59
    .line 60
    new-instance v3, Ltw2;

    .line 61
    .line 62
    const/4 v4, 0x1

    .line 63
    invoke-direct {v3, v4, v1}, Ltw2;-><init>(ILjava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    invoke-interface {v2, v3}, Lzn2;->y2(Ld52;)V

    .line 67
    .line 68
    .line 69
    iget-object v2, v1, Lf53;->f:Lzn2;

    .line 70
    .line 71
    new-instance v3, Ls62;

    .line 72
    .line 73
    invoke-direct {v3}, Ls62;-><init>()V

    .line 74
    .line 75
    .line 76
    invoke-interface {v2, v3}, Lzn2;->x2(Lu62;)V

    .line 77
    .line 78
    .line 79
    iget-object v2, v1, Lf53;->g:Lpp0;

    .line 80
    .line 81
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    iget-object v2, v1, Lf53;->g:Lpp0;

    .line 85
    .line 86
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 87
    .line 88
    .line 89
    goto :goto_0

    .line 90
    :catchall_1
    move-exception p1

    .line 91
    goto/16 :goto_3

    .line 92
    .line 93
    :catch_0
    const/4 v2, 0x5

    .line 94
    :try_start_2
    invoke-static {v2}, Lgi2;->q0(I)Z

    .line 95
    .line 96
    .line 97
    :goto_0
    invoke-static {p1}, Lmz1;->a(Landroid/content/Context;)V

    .line 98
    .line 99
    .line 100
    sget-object v2, Lq02;->a:Lso1;

    .line 101
    .line 102
    invoke-virtual {v2}, Lso1;->w()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v2

    .line 106
    check-cast v2, Ljava/lang/Boolean;

    .line 107
    .line 108
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 109
    .line 110
    .line 111
    move-result v2

    .line 112
    if-eqz v2, :cond_2

    .line 113
    .line 114
    sget-object v2, Lmz1;->Vb:Liz1;

    .line 115
    .line 116
    sget-object v3, Ltw1;->e:Ltw1;

    .line 117
    .line 118
    iget-object v3, v3, Ltw1;->c:Lkz1;

    .line 119
    .line 120
    invoke-virtual {v3, v2}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v2

    .line 124
    check-cast v2, Ljava/lang/Boolean;

    .line 125
    .line 126
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 127
    .line 128
    .line 129
    move-result v2

    .line 130
    if-eqz v2, :cond_2

    .line 131
    .line 132
    const-string v2, "Initializing on bg thread"

    .line 133
    .line 134
    invoke-static {v2}, Lgi2;->U(Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    sget-object v2, Luu1;->a:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 138
    .line 139
    new-instance v3, La43;

    .line 140
    .line 141
    const/4 v4, 0x1

    .line 142
    invoke-direct {v3, v1, v4}, La43;-><init>(Lf53;I)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {v2, v3}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    .line 146
    .line 147
    .line 148
    goto :goto_1

    .line 149
    :cond_2
    sget-object v2, Lq02;->b:Lso1;

    .line 150
    .line 151
    invoke-virtual {v2}, Lso1;->w()Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v2

    .line 155
    check-cast v2, Ljava/lang/Boolean;

    .line 156
    .line 157
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 158
    .line 159
    .line 160
    move-result v2

    .line 161
    if-eqz v2, :cond_3

    .line 162
    .line 163
    sget-object v2, Lmz1;->Vb:Liz1;

    .line 164
    .line 165
    sget-object v3, Ltw1;->e:Ltw1;

    .line 166
    .line 167
    iget-object v3, v3, Ltw1;->c:Lkz1;

    .line 168
    .line 169
    invoke-virtual {v3, v2}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v2

    .line 173
    check-cast v2, Ljava/lang/Boolean;

    .line 174
    .line 175
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 176
    .line 177
    .line 178
    move-result v2

    .line 179
    if-eqz v2, :cond_3

    .line 180
    .line 181
    sget-object v2, Luu1;->b:Ljava/util/concurrent/ExecutorService;

    .line 182
    .line 183
    new-instance v3, La43;

    .line 184
    .line 185
    const/4 v4, 0x0

    .line 186
    invoke-direct {v3, v1, v4}, La43;-><init>(Lf53;I)V

    .line 187
    .line 188
    .line 189
    invoke-interface {v2, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 190
    .line 191
    .line 192
    goto :goto_1

    .line 193
    :cond_3
    const-string v2, "Initializing on calling thread"

    .line 194
    .line 195
    invoke-static {v2}, Lgi2;->U(Ljava/lang/String;)V

    .line 196
    .line 197
    .line 198
    invoke-virtual {v1}, Lf53;->c()V

    .line 199
    .line 200
    .line 201
    :goto_1
    new-instance v1, Lr23;

    .line 202
    .line 203
    invoke-direct {v1, p1}, Lyc0;-><init>(Landroid/content/Context;)V

    .line 204
    .line 205
    .line 206
    new-instance v1, Lr23;

    .line 207
    .line 208
    invoke-direct {v1, p1}, Lyc0;-><init>(Landroid/content/Context;)V

    .line 209
    .line 210
    .line 211
    new-instance v1, Lr23;

    .line 212
    .line 213
    invoke-direct {v1, p1}, Lyc0;-><init>(Landroid/content/Context;)V

    .line 214
    .line 215
    .line 216
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 217
    :goto_2
    iget-object p1, p0, Lta0;->j:Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;

    .line 218
    .line 219
    new-instance v0, Lla0;

    .line 220
    .line 221
    const/4 v1, 0x7

    .line 222
    invoke-direct {v0, p1, v1}, Lla0;-><init>(Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;I)V

    .line 223
    .line 224
    .line 225
    invoke-virtual {p1, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 226
    .line 227
    .line 228
    sget-object p1, Lz31;->a:Lz31;

    .line 229
    .line 230
    return-object p1

    .line 231
    :goto_3
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 232
    throw p1

    .line 233
    :goto_4
    :try_start_4
    monitor-exit v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 234
    throw p1
.end method
