.class public final Lfu1;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic f:I

.field public final synthetic g:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lfu1;->f:I

    .line 2
    .line 3
    iput-object p2, p0, Lfu1;->g:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method private final a()V
    .locals 2

    .line 1
    iget-object v0, p0, Lfu1;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lpj2;

    .line 4
    .line 5
    iget-object v0, v0, Lpj2;->g:Lqj2;

    .line 6
    .line 7
    iget-object v0, v0, Lqj2;->d:Lxj2;

    .line 8
    .line 9
    monitor-enter v0

    .line 10
    :try_start_0
    invoke-virtual {v0}, Lxj2;->a()V

    .line 11
    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    iput-boolean v1, v0, Lxj2;->n:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    .line 16
    monitor-exit v0

    .line 17
    return-void

    .line 18
    :catchall_0
    move-exception v1

    .line 19
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 20
    throw v1
.end method

.method private final synthetic b()V
    .locals 3

    .line 1
    iget-object v0, p0, Lfu1;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lfm2;

    .line 4
    .line 5
    monitor-enter v0

    .line 6
    :try_start_0
    iget-object v1, v0, Lfm2;->k:Lwq3;

    .line 7
    .line 8
    invoke-virtual {v1}, Lgp3;->isDone()Z

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    if-eqz v2, :cond_0

    .line 13
    .line 14
    monitor-exit v0

    .line 15
    return-void

    .line 16
    :catchall_0
    move-exception v1

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 19
    .line 20
    invoke-virtual {v1, v2}, Lgp3;->d(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    monitor-exit v0

    .line 24
    return-void

    .line 25
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    throw v1
.end method

.method private final synthetic c()V
    .locals 3

    .line 1
    iget-object v0, p0, Lfu1;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lim2;

    .line 4
    .line 5
    iget-object v1, v0, Lim2;->f:Ljava/lang/Object;

    .line 6
    .line 7
    monitor-enter v1

    .line 8
    :try_start_0
    iget-boolean v2, v0, Lim2;->n:Z

    .line 9
    .line 10
    if-eqz v2, :cond_0

    .line 11
    .line 12
    monitor-exit v1

    .line 13
    return-void

    .line 14
    :catchall_0
    move-exception v0

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 v2, 0x1

    .line 17
    iput-boolean v2, v0, Lim2;->n:Z

    .line 18
    .line 19
    invoke-virtual {v0}, Lim2;->a()V

    .line 20
    .line 21
    .line 22
    monitor-exit v1

    .line 23
    return-void

    .line 24
    :goto_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    throw v0
.end method

.method private final d()V
    .locals 3

    .line 1
    iget-object v0, p0, Lfu1;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lan2;

    .line 4
    .line 5
    monitor-enter v0

    .line 6
    :try_start_0
    const-string v1, "Timeout waiting for show call succeed to be called."

    .line 7
    .line 8
    invoke-static {v1}, Lgi2;->Z(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v1, Lpq2;

    .line 12
    .line 13
    const-string v2, "Timeout for show call succeed."

    .line 14
    .line 15
    invoke-direct {v1, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v1}, Lan2;->R(Lpq2;)V

    .line 19
    .line 20
    .line 21
    const/4 v1, 0x1

    .line 22
    iput-boolean v1, v0, Lan2;->k:Z

    .line 23
    .line 24
    monitor-exit v0

    .line 25
    return-void

    .line 26
    :catchall_0
    move-exception v1

    .line 27
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    throw v1
.end method


# virtual methods
.method public final run()V
    .locals 28

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget v0, v1, Lfu1;->f:I

    .line 4
    .line 5
    const/4 v2, 0x3

    .line 6
    const/4 v3, 0x5

    .line 7
    const/4 v4, 0x0

    .line 8
    const/4 v5, 0x0

    .line 9
    const/4 v6, 0x1

    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    iget-object v0, v1, Lfu1;->g:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, Lwr2;

    .line 16
    .line 17
    invoke-interface {v0}, Lwr2;->d()V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :pswitch_0
    invoke-direct {v1}, Lfu1;->d()V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :pswitch_1
    invoke-direct {v1}, Lfu1;->c()V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :pswitch_2
    invoke-direct {v1}, Lfu1;->b()V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :pswitch_3
    iget-object v0, v1, Lfu1;->g:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v0, Lvl2;

    .line 36
    .line 37
    iget-object v2, v0, Lvl2;->h:Landroid/content/Context;

    .line 38
    .line 39
    invoke-static {v2}, Li41;->R(Landroid/content/Context;)V

    .line 40
    .line 41
    .line 42
    iput-boolean v6, v0, Lvl2;->m:Z

    .line 43
    .line 44
    return-void

    .line 45
    :pswitch_4
    iget-object v0, v1, Lfu1;->g:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v0, Lkl2;

    .line 48
    .line 49
    iput-boolean v5, v0, Lkl2;->c:Z

    .line 50
    .line 51
    return-void

    .line 52
    :pswitch_5
    iget-object v0, v1, Lfu1;->g:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v0, Lik2;

    .line 55
    .line 56
    iget-object v2, v0, Lik2;->q:Lyr2;

    .line 57
    .line 58
    iget-object v2, v2, Lyr2;->d:Lx22;

    .line 59
    .line 60
    if-nez v2, :cond_0

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_0
    :try_start_0
    iget-object v3, v0, Lik2;->s:Lz94;

    .line 64
    .line 65
    invoke-interface {v3}, Lz94;->d()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    check-cast v3, Lba2;

    .line 70
    .line 71
    iget-object v0, v0, Lik2;->l:Landroid/content/Context;

    .line 72
    .line 73
    new-instance v4, Loi0;

    .line 74
    .line 75
    invoke-direct {v4, v0}, Loi0;-><init>(Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v2}, Lsb1;->U()Landroid/os/Parcel;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    invoke-static {v0, v3}, Liv1;->e(Landroid/os/Parcel;Landroid/os/IInterface;)V

    .line 83
    .line 84
    .line 85
    invoke-static {v0, v4}, Liv1;->e(Landroid/os/Parcel;Landroid/os/IInterface;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v2, v0, v6}, Lsb1;->M0(Landroid/os/Parcel;I)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 89
    .line 90
    .line 91
    goto :goto_0

    .line 92
    :catch_0
    move-exception v0

    .line 93
    const-string v2, "RemoteException when notifyAdLoad is called"

    .line 94
    .line 95
    invoke-static {v2, v0}, Lgi2;->c0(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 96
    .line 97
    .line 98
    :goto_0
    return-void

    .line 99
    :pswitch_6
    invoke-direct {v1}, Lfu1;->a()V

    .line 100
    .line 101
    .line 102
    return-void

    .line 103
    :pswitch_7
    iget-object v0, v1, Lfu1;->g:Ljava/lang/Object;

    .line 104
    .line 105
    check-cast v0, Lpj2;

    .line 106
    .line 107
    iget-object v0, v0, Lpj2;->g:Lqj2;

    .line 108
    .line 109
    iget-object v0, v0, Lqj2;->d:Lxj2;

    .line 110
    .line 111
    invoke-virtual {v0}, Lxj2;->i()V

    .line 112
    .line 113
    .line 114
    return-void

    .line 115
    :pswitch_8
    iget-object v0, v1, Lfu1;->g:Ljava/lang/Object;

    .line 116
    .line 117
    check-cast v0, Lch2;

    .line 118
    .line 119
    invoke-virtual {v0}, Lch2;->a()V

    .line 120
    .line 121
    .line 122
    return-void

    .line 123
    :pswitch_9
    const-string v2, "getInstance"

    .line 124
    .line 125
    iget-object v0, v1, Lfu1;->g:Ljava/lang/Object;

    .line 126
    .line 127
    check-cast v0, Lah2;

    .line 128
    .line 129
    iget-object v3, v0, Lah2;->b:Lmv2;

    .line 130
    .line 131
    sget-object v5, Lhg4;->C:Lhg4;

    .line 132
    .line 133
    iget-object v5, v5, Lhg4;->k:Lym;

    .line 134
    .line 135
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 136
    .line 137
    .line 138
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 139
    .line 140
    .line 141
    move-result-wide v5

    .line 142
    iget-object v7, v0, Lah2;->a:Lwg2;

    .line 143
    .line 144
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 145
    .line 146
    .line 147
    const-string v8, "webview_p_f"

    .line 148
    .line 149
    const-string v9, "webview_p_l"

    .line 150
    .line 151
    const-string v10, "action"

    .line 152
    .line 153
    const-string v0, "MULTI_PROFILE"

    .line 154
    .line 155
    invoke-static {v0}, Lob1;->n(Ljava/lang/String;)Z

    .line 156
    .line 157
    .line 158
    move-result v0

    .line 159
    if-eqz v0, :cond_2

    .line 160
    .line 161
    :try_start_1
    const-class v0, Landroidx/webkit/ProfileStore;

    .line 162
    .line 163
    invoke-virtual {v0, v2, v4}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    invoke-virtual {v0, v4, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v0

    .line 171
    check-cast v0, Landroidx/webkit/ProfileStore;
    :try_end_1
    .catch Ljava/lang/ClassNotFoundException; {:try_start_1 .. :try_end_1} :catch_6
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_5
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1 .. :try_end_1} :catch_4
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/ClassCastException; {:try_start_1 .. :try_end_1} :catch_1

    .line 172
    .line 173
    :goto_1
    move-object v4, v0

    .line 174
    goto :goto_4

    .line 175
    :catch_1
    move-exception v0

    .line 176
    goto :goto_2

    .line 177
    :catch_2
    move-exception v0

    .line 178
    goto :goto_2

    .line 179
    :catch_3
    move-exception v0

    .line 180
    goto :goto_2

    .line 181
    :catch_4
    move-exception v0

    .line 182
    goto :goto_2

    .line 183
    :catch_5
    move-exception v0

    .line 184
    goto :goto_2

    .line 185
    :catch_6
    move-exception v0

    .line 186
    :goto_2
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object v0

    .line 194
    const-string v11, "Unable to get ProfileStore instance: "

    .line 195
    .line 196
    invoke-virtual {v11, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object v0

    .line 200
    invoke-static {v0}, Lgi2;->U(Ljava/lang/String;)V

    .line 201
    .line 202
    .line 203
    :try_start_2
    const-string v0, "androidx.webkit.ProfileStore$-CC"

    .line 204
    .line 205
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 206
    .line 207
    .line 208
    move-result-object v0

    .line 209
    invoke-virtual {v0, v2, v4}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 210
    .line 211
    .line 212
    move-result-object v0

    .line 213
    invoke-virtual {v0, v4, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object v0

    .line 217
    check-cast v0, Landroidx/webkit/ProfileStore;
    :try_end_2
    .catch Ljava/lang/ClassNotFoundException; {:try_start_2 .. :try_end_2} :catch_c
    .catch Ljava/lang/NoSuchMethodException; {:try_start_2 .. :try_end_2} :catch_b
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_2 .. :try_end_2} :catch_a
    .catch Ljava/lang/IllegalStateException; {:try_start_2 .. :try_end_2} :catch_9
    .catch Ljava/lang/IllegalAccessException; {:try_start_2 .. :try_end_2} :catch_8
    .catch Ljava/lang/ClassCastException; {:try_start_2 .. :try_end_2} :catch_7

    .line 218
    .line 219
    goto :goto_1

    .line 220
    :catch_7
    move-exception v0

    .line 221
    goto :goto_3

    .line 222
    :catch_8
    move-exception v0

    .line 223
    goto :goto_3

    .line 224
    :catch_9
    move-exception v0

    .line 225
    goto :goto_3

    .line 226
    :catch_a
    move-exception v0

    .line 227
    goto :goto_3

    .line 228
    :catch_b
    move-exception v0

    .line 229
    goto :goto_3

    .line 230
    :catch_c
    move-exception v0

    .line 231
    :goto_3
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 232
    .line 233
    .line 234
    move-result-object v0

    .line 235
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 236
    .line 237
    .line 238
    move-result-object v0

    .line 239
    invoke-virtual {v11, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 240
    .line 241
    .line 242
    move-result-object v0

    .line 243
    invoke-static {v0}, Lgi2;->U(Ljava/lang/String;)V

    .line 244
    .line 245
    .line 246
    :goto_4
    if-eqz v4, :cond_1

    .line 247
    .line 248
    const-string v0, "GMA_WEBVIEW_PROFILE"

    .line 249
    .line 250
    invoke-interface {v4, v0}, Landroidx/webkit/ProfileStore;->getOrCreateProfile(Ljava/lang/String;)Lpm0;

    .line 251
    .line 252
    .line 253
    move-result-object v0

    .line 254
    iput-object v0, v7, Lwg2;->a:Lpm0;

    .line 255
    .line 256
    sget-object v0, Lmz1;->Be:Liz1;

    .line 257
    .line 258
    sget-object v2, Ltw1;->e:Ltw1;

    .line 259
    .line 260
    iget-object v2, v2, Ltw1;->c:Lkz1;

    .line 261
    .line 262
    invoke-virtual {v2, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 263
    .line 264
    .line 265
    move-result-object v0

    .line 266
    check-cast v0, Ljava/lang/Boolean;

    .line 267
    .line 268
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 269
    .line 270
    .line 271
    move-result v0

    .line 272
    if-eqz v0, :cond_3

    .line 273
    .line 274
    sget-object v0, Lhg4;->C:Lhg4;

    .line 275
    .line 276
    iget-object v0, v0, Lhg4;->k:Lym;

    .line 277
    .line 278
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 279
    .line 280
    .line 281
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 282
    .line 283
    .line 284
    move-result-wide v7

    .line 285
    sub-long/2addr v7, v5

    .line 286
    invoke-virtual {v3}, Lmv2;->a()Llv2;

    .line 287
    .line 288
    .line 289
    move-result-object v0

    .line 290
    invoke-virtual {v0, v10, v9}, Llv2;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 291
    .line 292
    .line 293
    invoke-static {v7, v8}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    .line 294
    .line 295
    .line 296
    move-result-object v2

    .line 297
    invoke-virtual {v0, v9, v2}, Llv2;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 298
    .line 299
    .line 300
    invoke-virtual {v0}, Llv2;->m()V

    .line 301
    .line 302
    .line 303
    goto :goto_5

    .line 304
    :cond_1
    const-string v0, "WebViewCompat failure: No instance"

    .line 305
    .line 306
    invoke-static {v0}, Lgi2;->i0(Ljava/lang/String;)V

    .line 307
    .line 308
    .line 309
    sget-object v0, Lmz1;->Be:Liz1;

    .line 310
    .line 311
    sget-object v2, Ltw1;->e:Ltw1;

    .line 312
    .line 313
    iget-object v2, v2, Ltw1;->c:Lkz1;

    .line 314
    .line 315
    invoke-virtual {v2, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 316
    .line 317
    .line 318
    move-result-object v0

    .line 319
    check-cast v0, Ljava/lang/Boolean;

    .line 320
    .line 321
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 322
    .line 323
    .line 324
    move-result v0

    .line 325
    if-eqz v0, :cond_3

    .line 326
    .line 327
    invoke-virtual {v3}, Lmv2;->a()Llv2;

    .line 328
    .line 329
    .line 330
    move-result-object v0

    .line 331
    invoke-virtual {v0, v10, v8}, Llv2;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 332
    .line 333
    .line 334
    const-string v2, "No instance"

    .line 335
    .line 336
    invoke-virtual {v0, v8, v2}, Llv2;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 337
    .line 338
    .line 339
    invoke-virtual {v0}, Llv2;->m()V

    .line 340
    .line 341
    .line 342
    goto :goto_5

    .line 343
    :cond_2
    const-string v0, "WebViewFeature.MULTI_PROFILE is not supported"

    .line 344
    .line 345
    invoke-static {v0}, Lgi2;->U(Ljava/lang/String;)V

    .line 346
    .line 347
    .line 348
    :cond_3
    :goto_5
    return-void

    .line 349
    :pswitch_a
    sget-object v0, Lhg4;->C:Lhg4;

    .line 350
    .line 351
    iget-object v0, v0, Lhg4;->x:Lsu2;

    .line 352
    .line 353
    iget-object v2, v1, Lfu1;->g:Ljava/lang/Object;

    .line 354
    .line 355
    check-cast v2, Lxz2;

    .line 356
    .line 357
    iget-object v2, v2, Lxz2;->a:Lxb3;

    .line 358
    .line 359
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 360
    .line 361
    .line 362
    new-instance v0, Lqz2;

    .line 363
    .line 364
    invoke-direct {v0, v2, v6}, Lqz2;-><init>(Lxb3;I)V

    .line 365
    .line 366
    .line 367
    invoke-static {v0}, Lsu2;->t(Ljava/lang/Runnable;)V

    .line 368
    .line 369
    .line 370
    return-void

    .line 371
    :pswitch_b
    sget v0, Lsg2;->M:I

    .line 372
    .line 373
    sget-object v0, Lhg4;->C:Lhg4;

    .line 374
    .line 375
    iget-object v0, v0, Lhg4;->h:Lgd2;

    .line 376
    .line 377
    invoke-virtual {v0}, Lgd2;->a()Lh2;

    .line 378
    .line 379
    .line 380
    move-result-object v0

    .line 381
    iget-object v2, v1, Lfu1;->g:Ljava/lang/Object;

    .line 382
    .line 383
    check-cast v2, Ljava/lang/String;

    .line 384
    .line 385
    iget-object v3, v0, Lh2;->g:Ljava/lang/Object;

    .line 386
    .line 387
    check-cast v3, Ljava/util/HashSet;

    .line 388
    .line 389
    invoke-virtual {v3, v2}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 390
    .line 391
    .line 392
    move-result v3

    .line 393
    if-eqz v3, :cond_4

    .line 394
    .line 395
    goto :goto_6

    .line 396
    :cond_4
    new-instance v3, Ljava/util/LinkedHashMap;

    .line 397
    .line 398
    invoke-direct {v3}, Ljava/util/LinkedHashMap;-><init>()V

    .line 399
    .line 400
    .line 401
    iget-object v5, v0, Lh2;->f:Ljava/lang/Object;

    .line 402
    .line 403
    check-cast v5, Ljava/lang/String;

    .line 404
    .line 405
    const-string v6, "sdkVersion"

    .line 406
    .line 407
    invoke-virtual {v3, v6, v5}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 408
    .line 409
    .line 410
    const-string v5, "ue"

    .line 411
    .line 412
    invoke-virtual {v3, v5, v2}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 413
    .line 414
    .line 415
    iget-object v2, v0, Lh2;->b:Ljava/lang/Object;

    .line 416
    .line 417
    check-cast v2, Ljava/util/LinkedHashMap;

    .line 418
    .line 419
    invoke-virtual {v0, v2, v3}, Lh2;->p(Ljava/util/LinkedHashMap;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    .line 420
    .line 421
    .line 422
    move-result-object v2

    .line 423
    invoke-virtual {v0, v2, v4}, Lh2;->r(Ljava/util/LinkedHashMap;Lsz1;)V

    .line 424
    .line 425
    .line 426
    :goto_6
    return-void

    .line 427
    :pswitch_c
    iget-object v0, v1, Lfu1;->g:Ljava/lang/Object;

    .line 428
    .line 429
    check-cast v0, Lsg2;

    .line 430
    .line 431
    iget-object v0, v0, Lsg2;->f:Ljg2;

    .line 432
    .line 433
    iget-object v2, v0, Ljg2;->f:Log2;

    .line 434
    .line 435
    iget-object v2, v2, Log2;->U:Ln5;

    .line 436
    .line 437
    iput-boolean v6, v2, Ln5;->e:Z

    .line 438
    .line 439
    iget-boolean v3, v2, Ln5;->d:Z

    .line 440
    .line 441
    if-eqz v3, :cond_5

    .line 442
    .line 443
    invoke-virtual {v2}, Ln5;->d()V

    .line 444
    .line 445
    .line 446
    :cond_5
    iget-object v0, v0, Ljg2;->f:Log2;

    .line 447
    .line 448
    invoke-virtual {v0}, Log2;->z0()Ljh1;

    .line 449
    .line 450
    .line 451
    move-result-object v0

    .line 452
    if-eqz v0, :cond_6

    .line 453
    .line 454
    iget-object v2, v0, Ljh1;->q:Lm74;

    .line 455
    .line 456
    iget-object v3, v0, Ljh1;->k:Ltg4;

    .line 457
    .line 458
    invoke-virtual {v2, v3}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 459
    .line 460
    .line 461
    invoke-virtual {v0, v6}, Ljh1;->G3(Z)V

    .line 462
    .line 463
    .line 464
    :cond_6
    return-void

    .line 465
    :pswitch_d
    iget-object v0, v1, Lfu1;->g:Ljava/lang/Object;

    .line 466
    .line 467
    move-object v8, v0

    .line 468
    check-cast v8, Ljf2;

    .line 469
    .line 470
    iget-object v0, v8, Ljf2;->j:Ljava/lang/String;

    .line 471
    .line 472
    invoke-static {v0}, Ljf2;->o(Ljava/lang/String;)Ljava/lang/String;

    .line 473
    .line 474
    .line 475
    move-result-object v10

    .line 476
    const-string v2, "error"

    .line 477
    .line 478
    const-string v0, " ms"

    .line 479
    .line 480
    const-string v3, "Timeout reached. Limit: "

    .line 481
    .line 482
    :try_start_3
    sget-object v4, Lmz1;->J:Liz1;

    .line 483
    .line 484
    sget-object v7, Ltw1;->e:Ltw1;

    .line 485
    .line 486
    iget-object v9, v7, Ltw1;->c:Lkz1;

    .line 487
    .line 488
    invoke-virtual {v9, v4}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 489
    .line 490
    .line 491
    move-result-object v4

    .line 492
    check-cast v4, Ljava/lang/Long;

    .line 493
    .line 494
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 495
    .line 496
    .line 497
    move-result-wide v11

    .line 498
    const-wide/16 v13, 0x3e8

    .line 499
    .line 500
    mul-long/2addr v11, v13

    .line 501
    sget-object v4, Lmz1;->v:Liz1;

    .line 502
    .line 503
    iget-object v9, v7, Ltw1;->c:Lkz1;

    .line 504
    .line 505
    invoke-virtual {v9, v4}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 506
    .line 507
    .line 508
    move-result-object v4

    .line 509
    check-cast v4, Ljava/lang/Integer;

    .line 510
    .line 511
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 512
    .line 513
    .line 514
    move-result v4

    .line 515
    int-to-long v13, v4

    .line 516
    sget-object v4, Lmz1;->Y1:Liz1;

    .line 517
    .line 518
    iget-object v9, v7, Ltw1;->c:Lkz1;

    .line 519
    .line 520
    invoke-virtual {v9, v4}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 521
    .line 522
    .line 523
    move-result-object v4

    .line 524
    check-cast v4, Ljava/lang/Boolean;

    .line 525
    .line 526
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 527
    .line 528
    .line 529
    move-result v4

    .line 530
    monitor-enter v8
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_d

    .line 531
    :try_start_4
    sget-object v9, Lhg4;->C:Lhg4;

    .line 532
    .line 533
    iget-object v9, v9, Lhg4;->k:Lym;

    .line 534
    .line 535
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 536
    .line 537
    .line 538
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 539
    .line 540
    .line 541
    move-result-wide v15

    .line 542
    iget-wide v5, v8, Ljf2;->n:J

    .line 543
    .line 544
    sub-long/2addr v15, v5

    .line 545
    cmp-long v5, v15, v11

    .line 546
    .line 547
    if-gtz v5, :cond_14

    .line 548
    .line 549
    iget-boolean v0, v8, Ljf2;->k:Z

    .line 550
    .line 551
    if-nez v0, :cond_13

    .line 552
    .line 553
    iget-boolean v0, v8, Ljf2;->l:Z

    .line 554
    .line 555
    if-eqz v0, :cond_7

    .line 556
    .line 557
    monitor-exit v8

    .line 558
    goto/16 :goto_f

    .line 559
    .line 560
    :cond_7
    iget-object v0, v8, Ljf2;->i:Lsf2;

    .line 561
    .line 562
    iget-object v0, v0, Lsf2;->l:Lmc4;

    .line 563
    .line 564
    if-eqz v0, :cond_8

    .line 565
    .line 566
    const/4 v3, 0x1

    .line 567
    goto :goto_7

    .line 568
    :cond_8
    const/4 v3, 0x0

    .line 569
    :goto_7
    if-eqz v3, :cond_12

    .line 570
    .line 571
    invoke-virtual {v0}, Lmc4;->U1()J

    .line 572
    .line 573
    .line 574
    move-result-wide v11

    .line 575
    const-wide/16 v5, 0x0

    .line 576
    .line 577
    cmp-long v0, v11, v5

    .line 578
    .line 579
    if-lez v0, :cond_10

    .line 580
    .line 581
    iget-object v0, v8, Ljf2;->i:Lsf2;

    .line 582
    .line 583
    iget-object v0, v0, Lsf2;->l:Lmc4;

    .line 584
    .line 585
    invoke-virtual {v0}, Lmc4;->V1()J

    .line 586
    .line 587
    .line 588
    move-result-wide v15

    .line 589
    move-wide/from16 v24, v5

    .line 590
    .line 591
    iget-wide v5, v8, Ljf2;->o:J

    .line 592
    .line 593
    cmp-long v0, v15, v5

    .line 594
    .line 595
    if-eqz v0, :cond_e

    .line 596
    .line 597
    cmp-long v0, v15, v24

    .line 598
    .line 599
    if-lez v0, :cond_9

    .line 600
    .line 601
    const/16 v21, 0x1

    .line 602
    .line 603
    goto :goto_8

    .line 604
    :cond_9
    const/16 v21, 0x0

    .line 605
    .line 606
    :goto_8
    iget-object v9, v8, Ljf2;->j:Ljava/lang/String;

    .line 607
    .line 608
    if-eqz v4, :cond_b

    .line 609
    .line 610
    iget-object v0, v8, Ljf2;->i:Lsf2;

    .line 611
    .line 612
    iget-object v3, v0, Lsf2;->x:Lnf2;

    .line 613
    .line 614
    if-eqz v3, :cond_a

    .line 615
    .line 616
    iget-object v3, v0, Lsf2;->x:Lnf2;

    .line 617
    .line 618
    iget-boolean v3, v3, Lnf2;->u:Z

    .line 619
    .line 620
    if-eqz v3, :cond_a

    .line 621
    .line 622
    move-wide/from16 v5, v24

    .line 623
    .line 624
    goto :goto_9

    .line 625
    :cond_a
    iget v0, v0, Lsf2;->p:I

    .line 626
    .line 627
    int-to-long v5, v0

    .line 628
    goto :goto_9

    .line 629
    :cond_b
    const-wide/16 v5, -0x1

    .line 630
    .line 631
    :goto_9
    if-eqz v4, :cond_c

    .line 632
    .line 633
    iget-object v0, v8, Ljf2;->i:Lsf2;

    .line 634
    .line 635
    invoke-virtual {v0}, Lsf2;->q()J

    .line 636
    .line 637
    .line 638
    move-result-wide v19

    .line 639
    goto :goto_a

    .line 640
    :cond_c
    const-wide/16 v19, -0x1

    .line 641
    .line 642
    :goto_a
    if-eqz v4, :cond_d

    .line 643
    .line 644
    iget-object v0, v8, Ljf2;->i:Lsf2;

    .line 645
    .line 646
    invoke-virtual {v0}, Lsf2;->r()J

    .line 647
    .line 648
    .line 649
    move-result-wide v3

    .line 650
    move-wide/from16 v17, v3

    .line 651
    .line 652
    goto :goto_b

    .line 653
    :cond_d
    const-wide/16 v17, -0x1

    .line 654
    .line 655
    :goto_b
    sget-object v0, Lsf2;->z:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 656
    .line 657
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 658
    .line 659
    .line 660
    move-result v22

    .line 661
    sget-object v0, Lsf2;->A:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 662
    .line 663
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 664
    .line 665
    .line 666
    move-result v23

    .line 667
    sget-object v0, Lj63;->b:Lwc1;

    .line 668
    .line 669
    move-object v3, v7

    .line 670
    new-instance v7, Lze2;

    .line 671
    .line 672
    move-wide/from16 v26, v15

    .line 673
    .line 674
    move-wide v15, v5

    .line 675
    move-wide v4, v13

    .line 676
    move-wide v13, v11

    .line 677
    move-wide/from16 v11, v26

    .line 678
    .line 679
    move-wide/from16 v26, v19

    .line 680
    .line 681
    move-wide/from16 v19, v17

    .line 682
    .line 683
    move-wide/from16 v17, v26

    .line 684
    .line 685
    invoke-direct/range {v7 .. v23}, Lze2;-><init>(Lff2;Ljava/lang/String;Ljava/lang/String;JJJJJZII)V

    .line 686
    .line 687
    .line 688
    move-object v9, v7

    .line 689
    move-wide v6, v11

    .line 690
    move-wide v11, v13

    .line 691
    invoke-virtual {v0, v9}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 692
    .line 693
    .line 694
    iput-wide v6, v8, Ljf2;->o:J

    .line 695
    .line 696
    goto :goto_c

    .line 697
    :cond_e
    move-object v3, v7

    .line 698
    move-wide v4, v13

    .line 699
    move-wide v6, v15

    .line 700
    :goto_c
    cmp-long v0, v6, v11

    .line 701
    .line 702
    if-ltz v0, :cond_f

    .line 703
    .line 704
    iget-object v9, v8, Ljf2;->j:Ljava/lang/String;

    .line 705
    .line 706
    sget-object v0, Lj63;->b:Lwc1;

    .line 707
    .line 708
    new-instance v7, Lef2;

    .line 709
    .line 710
    invoke-direct/range {v7 .. v12}, Lef2;-><init>(Lff2;Ljava/lang/String;Ljava/lang/String;J)V

    .line 711
    .line 712
    .line 713
    invoke-virtual {v0, v7}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 714
    .line 715
    .line 716
    monitor-exit v8

    .line 717
    goto/16 :goto_f

    .line 718
    .line 719
    :cond_f
    iget-object v0, v8, Ljf2;->i:Lsf2;

    .line 720
    .line 721
    iget v0, v0, Lsf2;->p:I

    .line 722
    .line 723
    int-to-long v11, v0

    .line 724
    cmp-long v0, v11, v4

    .line 725
    .line 726
    if-ltz v0, :cond_11

    .line 727
    .line 728
    cmp-long v0, v6, v24

    .line 729
    .line 730
    if-lez v0, :cond_11

    .line 731
    .line 732
    monitor-exit v8

    .line 733
    goto/16 :goto_f

    .line 734
    .line 735
    :cond_10
    move-object v3, v7

    .line 736
    :cond_11
    monitor-exit v8
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 737
    sget-object v0, Lmz1;->K:Liz1;

    .line 738
    .line 739
    iget-object v2, v3, Ltw1;->c:Lkz1;

    .line 740
    .line 741
    invoke-virtual {v2, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 742
    .line 743
    .line 744
    move-result-object v0

    .line 745
    check-cast v0, Ljava/lang/Long;

    .line 746
    .line 747
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 748
    .line 749
    .line 750
    move-result-wide v2

    .line 751
    sget-object v0, Llf4;->l:Li63;

    .line 752
    .line 753
    new-instance v4, Lfu1;

    .line 754
    .line 755
    const/16 v5, 0xf

    .line 756
    .line 757
    invoke-direct {v4, v5, v8}, Lfu1;-><init>(ILjava/lang/Object;)V

    .line 758
    .line 759
    .line 760
    invoke-virtual {v0, v4, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 761
    .line 762
    .line 763
    goto/16 :goto_10

    .line 764
    .line 765
    :cond_12
    :try_start_5
    const-string v2, "exoPlayerReleased"

    .line 766
    .line 767
    new-instance v0, Ljava/io/IOException;

    .line 768
    .line 769
    const-string v3, "ExoPlayer was released during preloading."

    .line 770
    .line 771
    invoke-direct {v0, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 772
    .line 773
    .line 774
    throw v0

    .line 775
    :cond_13
    const-string v2, "externalAbort"

    .line 776
    .line 777
    new-instance v0, Ljava/io/IOException;

    .line 778
    .line 779
    const-string v3, "Abort requested before buffering finished. "

    .line 780
    .line 781
    invoke-direct {v0, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 782
    .line 783
    .line 784
    throw v0

    .line 785
    :cond_14
    const-string v2, "downloadTimeout"

    .line 786
    .line 787
    new-instance v4, Ljava/io/IOException;

    .line 788
    .line 789
    invoke-static {v11, v12}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 790
    .line 791
    .line 792
    move-result-object v5

    .line 793
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 794
    .line 795
    .line 796
    move-result v5

    .line 797
    add-int/lit8 v5, v5, 0x1b

    .line 798
    .line 799
    new-instance v6, Ljava/lang/StringBuilder;

    .line 800
    .line 801
    invoke-direct {v6, v5}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 802
    .line 803
    .line 804
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 805
    .line 806
    .line 807
    invoke-virtual {v6, v11, v12}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 808
    .line 809
    .line 810
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 811
    .line 812
    .line 813
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 814
    .line 815
    .line 816
    move-result-object v0

    .line 817
    invoke-direct {v4, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 818
    .line 819
    .line 820
    throw v4

    .line 821
    :goto_d
    monitor-exit v8
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 822
    :try_start_6
    throw v0
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_d

    .line 823
    :catch_d
    move-exception v0

    .line 824
    goto :goto_e

    .line 825
    :catchall_0
    move-exception v0

    .line 826
    goto :goto_d

    .line 827
    :goto_e
    iget-object v3, v8, Ljf2;->j:Ljava/lang/String;

    .line 828
    .line 829
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 830
    .line 831
    .line 832
    move-result-object v4

    .line 833
    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 834
    .line 835
    .line 836
    move-result-object v5

    .line 837
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 838
    .line 839
    .line 840
    move-result v5

    .line 841
    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 842
    .line 843
    .line 844
    move-result-object v6

    .line 845
    add-int/lit8 v5, v5, 0x22

    .line 846
    .line 847
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 848
    .line 849
    .line 850
    move-result v6

    .line 851
    new-instance v7, Ljava/lang/StringBuilder;

    .line 852
    .line 853
    add-int/2addr v5, v6

    .line 854
    invoke-direct {v7, v5}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 855
    .line 856
    .line 857
    const-string v5, "Failed to preload url "

    .line 858
    .line 859
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 860
    .line 861
    .line 862
    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 863
    .line 864
    .line 865
    const-string v3, " Exception: "

    .line 866
    .line 867
    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 868
    .line 869
    .line 870
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 871
    .line 872
    .line 873
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 874
    .line 875
    .line 876
    move-result-object v3

    .line 877
    invoke-static {v3}, Lgi2;->i0(Ljava/lang/String;)V

    .line 878
    .line 879
    .line 880
    const-string v3, "VideoStreamExoPlayerCache.preload"

    .line 881
    .line 882
    sget-object v4, Lhg4;->C:Lhg4;

    .line 883
    .line 884
    iget-object v4, v4, Lhg4;->h:Lgd2;

    .line 885
    .line 886
    invoke-virtual {v4, v3, v0}, Lgd2;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 887
    .line 888
    .line 889
    invoke-virtual {v8}, Ljf2;->a()V

    .line 890
    .line 891
    .line 892
    invoke-static {v2, v0}, Ljf2;->p(Ljava/lang/String;Ljava/lang/Exception;)Ljava/lang/String;

    .line 893
    .line 894
    .line 895
    move-result-object v0

    .line 896
    iget-object v3, v8, Ljf2;->j:Ljava/lang/String;

    .line 897
    .line 898
    invoke-virtual {v8, v3, v10, v2, v0}, Lff2;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 899
    .line 900
    .line 901
    :goto_f
    sget-object v0, Lhg4;->C:Lhg4;

    .line 902
    .line 903
    iget-object v0, v0, Lhg4;->A:Lxe2;

    .line 904
    .line 905
    iget-object v2, v8, Ljf2;->m:Lwe2;

    .line 906
    .line 907
    iget-object v0, v0, Lxe2;->f:Ljava/util/ArrayList;

    .line 908
    .line 909
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 910
    .line 911
    .line 912
    :goto_10
    return-void

    .line 913
    :pswitch_e
    sget-object v0, Lhg4;->C:Lhg4;

    .line 914
    .line 915
    iget-object v0, v0, Lhg4;->A:Lxe2;

    .line 916
    .line 917
    iget-object v2, v1, Lfu1;->g:Ljava/lang/Object;

    .line 918
    .line 919
    check-cast v2, Lwe2;

    .line 920
    .line 921
    iget-object v0, v0, Lxe2;->f:Ljava/util/ArrayList;

    .line 922
    .line 923
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 924
    .line 925
    .line 926
    return-void

    .line 927
    :pswitch_f
    iget-object v0, v1, Lfu1;->g:Ljava/lang/Object;

    .line 928
    .line 929
    check-cast v0, Lzd2;

    .line 930
    .line 931
    check-cast v0, Lee2;

    .line 932
    .line 933
    iget-boolean v2, v0, Lee2;->m:Z

    .line 934
    .line 935
    iget-object v3, v0, Lee2;->v:Landroid/widget/ImageView;

    .line 936
    .line 937
    if-eqz v2, :cond_15

    .line 938
    .line 939
    invoke-virtual {v3}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 940
    .line 941
    .line 942
    move-result-object v2

    .line 943
    if-eqz v2, :cond_15

    .line 944
    .line 945
    iget-object v2, v0, Lee2;->g:Landroid/widget/FrameLayout;

    .line 946
    .line 947
    invoke-virtual {v2, v3}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 948
    .line 949
    .line 950
    :cond_15
    iget-object v2, v0, Lee2;->l:Lae2;

    .line 951
    .line 952
    if-nez v2, :cond_16

    .line 953
    .line 954
    goto :goto_11

    .line 955
    :cond_16
    iget-object v3, v0, Lee2;->u:Landroid/graphics/Bitmap;

    .line 956
    .line 957
    if-eqz v3, :cond_19

    .line 958
    .line 959
    sget-object v3, Lhg4;->C:Lhg4;

    .line 960
    .line 961
    iget-object v5, v3, Lhg4;->k:Lym;

    .line 962
    .line 963
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 964
    .line 965
    .line 966
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 967
    .line 968
    .line 969
    move-result-wide v5

    .line 970
    iget-object v7, v0, Lee2;->u:Landroid/graphics/Bitmap;

    .line 971
    .line 972
    invoke-virtual {v2, v7}, Landroid/view/TextureView;->getBitmap(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    .line 973
    .line 974
    .line 975
    move-result-object v2

    .line 976
    if-eqz v2, :cond_17

    .line 977
    .line 978
    const/4 v9, 0x1

    .line 979
    iput-boolean v9, v0, Lee2;->w:Z

    .line 980
    .line 981
    :cond_17
    iget-object v2, v3, Lhg4;->k:Lym;

    .line 982
    .line 983
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 984
    .line 985
    .line 986
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 987
    .line 988
    .line 989
    move-result-wide v2

    .line 990
    sub-long/2addr v2, v5

    .line 991
    invoke-static {}, Lgi2;->R()Z

    .line 992
    .line 993
    .line 994
    move-result v5

    .line 995
    if-eqz v5, :cond_18

    .line 996
    .line 997
    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 998
    .line 999
    .line 1000
    move-result-object v5

    .line 1001
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 1002
    .line 1003
    .line 1004
    move-result v5

    .line 1005
    new-instance v6, Ljava/lang/StringBuilder;

    .line 1006
    .line 1007
    add-int/lit8 v5, v5, 0x1a

    .line 1008
    .line 1009
    invoke-direct {v6, v5}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 1010
    .line 1011
    .line 1012
    const-string v5, "Spinner frame grab took "

    .line 1013
    .line 1014
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1015
    .line 1016
    .line 1017
    invoke-virtual {v6, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 1018
    .line 1019
    .line 1020
    const-string v5, "ms"

    .line 1021
    .line 1022
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1023
    .line 1024
    .line 1025
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1026
    .line 1027
    .line 1028
    move-result-object v5

    .line 1029
    invoke-static {v5}, Lgi2;->G(Ljava/lang/String;)V

    .line 1030
    .line 1031
    .line 1032
    :cond_18
    iget-wide v5, v0, Lee2;->k:J

    .line 1033
    .line 1034
    cmp-long v5, v2, v5

    .line 1035
    .line 1036
    if-lez v5, :cond_19

    .line 1037
    .line 1038
    const-string v5, "Spinner frame grab crossed jank threshold! Suspending spinner."

    .line 1039
    .line 1040
    invoke-static {v5}, Lgi2;->i0(Ljava/lang/String;)V

    .line 1041
    .line 1042
    .line 1043
    const/4 v5, 0x0

    .line 1044
    iput-boolean v5, v0, Lee2;->p:Z

    .line 1045
    .line 1046
    iput-object v4, v0, Lee2;->u:Landroid/graphics/Bitmap;

    .line 1047
    .line 1048
    iget-object v0, v0, Lee2;->i:Ltz1;

    .line 1049
    .line 1050
    if-eqz v0, :cond_19

    .line 1051
    .line 1052
    const-string v4, "spinner_jank"

    .line 1053
    .line 1054
    invoke-static {v2, v3}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    .line 1055
    .line 1056
    .line 1057
    move-result-object v2

    .line 1058
    invoke-virtual {v0, v4, v2}, Ltz1;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 1059
    .line 1060
    .line 1061
    :cond_19
    :goto_11
    return-void

    .line 1062
    :pswitch_10
    iget-object v0, v1, Lfu1;->g:Ljava/lang/Object;

    .line 1063
    .line 1064
    check-cast v0, Lae2;

    .line 1065
    .line 1066
    invoke-virtual {v0}, Lae2;->g()V

    .line 1067
    .line 1068
    .line 1069
    return-void

    .line 1070
    :pswitch_11
    iget-object v0, v1, Lfu1;->g:Ljava/lang/Object;

    .line 1071
    .line 1072
    check-cast v0, Ljd2;

    .line 1073
    .line 1074
    :goto_12
    iget-object v2, v0, Ljd2;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 1075
    .line 1076
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 1077
    .line 1078
    .line 1079
    move-result v2

    .line 1080
    if-eqz v2, :cond_1c

    .line 1081
    .line 1082
    new-instance v2, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 1083
    .line 1084
    const/4 v5, 0x0

    .line 1085
    invoke-direct {v2, v5}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 1086
    .line 1087
    .line 1088
    sget-object v3, Llf4;->l:Li63;

    .line 1089
    .line 1090
    new-instance v4, Lfu1;

    .line 1091
    .line 1092
    const/16 v5, 0xa

    .line 1093
    .line 1094
    invoke-direct {v4, v5, v2}, Lfu1;-><init>(ILjava/lang/Object;)V

    .line 1095
    .line 1096
    .line 1097
    invoke-virtual {v3, v4}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 1098
    .line 1099
    .line 1100
    :try_start_7
    iget-wide v3, v0, Ljd2;->e:J

    .line 1101
    .line 1102
    invoke-static {v3, v4}, Ljava/lang/Thread;->sleep(J)V
    :try_end_7
    .catch Ljava/lang/InterruptedException; {:try_start_7 .. :try_end_7} :catch_f

    .line 1103
    .line 1104
    .line 1105
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 1106
    .line 1107
    .line 1108
    move-result v3

    .line 1109
    if-eqz v3, :cond_1a

    .line 1110
    .line 1111
    goto :goto_13

    .line 1112
    :cond_1a
    sget-object v3, Lmz1;->ve:Liz1;

    .line 1113
    .line 1114
    sget-object v4, Ltw1;->e:Ltw1;

    .line 1115
    .line 1116
    iget-object v4, v4, Ltw1;->c:Lkz1;

    .line 1117
    .line 1118
    invoke-virtual {v4, v3}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 1119
    .line 1120
    .line 1121
    move-result-object v3

    .line 1122
    check-cast v3, Ljava/lang/Boolean;

    .line 1123
    .line 1124
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1125
    .line 1126
    .line 1127
    move-result v3

    .line 1128
    if-eqz v3, :cond_1b

    .line 1129
    .line 1130
    iget-object v3, v0, Ljd2;->b:Lmv2;

    .line 1131
    .line 1132
    if-eqz v3, :cond_1b

    .line 1133
    .line 1134
    invoke-virtual {v3}, Lmv2;->a()Llv2;

    .line 1135
    .line 1136
    .line 1137
    move-result-object v3

    .line 1138
    const-string v4, "action"

    .line 1139
    .line 1140
    const-string v5, "paa"

    .line 1141
    .line 1142
    invoke-virtual {v3, v4, v5}, Llv2;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 1143
    .line 1144
    .line 1145
    invoke-virtual {v3}, Llv2;->o()V

    .line 1146
    .line 1147
    .line 1148
    :cond_1b
    :goto_13
    :try_start_8
    iget-wide v3, v0, Ljd2;->f:J

    .line 1149
    .line 1150
    invoke-static {v3, v4}, Ljava/lang/Thread;->sleep(J)V
    :try_end_8
    .catch Ljava/lang/InterruptedException; {:try_start_8 .. :try_end_8} :catch_e

    .line 1151
    .line 1152
    .line 1153
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 1154
    .line 1155
    .line 1156
    move-result v3

    .line 1157
    if-eqz v3, :cond_1b

    .line 1158
    .line 1159
    goto :goto_12

    .line 1160
    :catch_e
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 1161
    .line 1162
    .line 1163
    move-result-object v2

    .line 1164
    invoke-virtual {v2}, Ljava/lang/Thread;->interrupt()V

    .line 1165
    .line 1166
    .line 1167
    goto :goto_12

    .line 1168
    :catch_f
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 1169
    .line 1170
    .line 1171
    move-result-object v0

    .line 1172
    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    .line 1173
    .line 1174
    .line 1175
    :cond_1c
    return-void

    .line 1176
    :pswitch_12
    iget-object v0, v1, Lfu1;->g:Ljava/lang/Object;

    .line 1177
    .line 1178
    check-cast v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 1179
    .line 1180
    const/4 v9, 0x1

    .line 1181
    invoke-virtual {v0, v9}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    .line 1182
    .line 1183
    .line 1184
    return-void

    .line 1185
    :pswitch_13
    iget-object v0, v1, Lfu1;->g:Ljava/lang/Object;

    .line 1186
    .line 1187
    check-cast v0, Lij;

    .line 1188
    .line 1189
    iget-object v2, v0, Lij;->f:Ljava/lang/Object;

    .line 1190
    .line 1191
    check-cast v2, Lvw1;

    .line 1192
    .line 1193
    if-nez v2, :cond_1d

    .line 1194
    .line 1195
    goto :goto_14

    .line 1196
    :cond_1d
    iget-object v0, v0, Lij;->f:Ljava/lang/Object;

    .line 1197
    .line 1198
    check-cast v0, Lvw1;

    .line 1199
    .line 1200
    invoke-virtual {v0}, Lw9;->k()V

    .line 1201
    .line 1202
    .line 1203
    invoke-static {}, Landroid/os/Binder;->flushPendingCommands()V

    .line 1204
    .line 1205
    .line 1206
    :goto_14
    return-void

    .line 1207
    :pswitch_14
    iget-object v0, v1, Lfu1;->g:Ljava/lang/Object;

    .line 1208
    .line 1209
    check-cast v0, Lz42;

    .line 1210
    .line 1211
    invoke-virtual {v0}, Lz42;->a()V

    .line 1212
    .line 1213
    .line 1214
    return-void

    .line 1215
    :pswitch_15
    iget-object v0, v1, Lfu1;->g:Ljava/lang/Object;

    .line 1216
    .line 1217
    check-cast v0, Lb02;

    .line 1218
    .line 1219
    invoke-virtual {v0}, Lb02;->d()V

    .line 1220
    .line 1221
    .line 1222
    return-void

    .line 1223
    :pswitch_16
    iget-object v0, v1, Lfu1;->g:Ljava/lang/Object;

    .line 1224
    .line 1225
    check-cast v0, Lxz1;

    .line 1226
    .line 1227
    iget-object v2, v0, Lxz1;->c:Landroid/content/Context;

    .line 1228
    .line 1229
    iget-object v3, v0, Lxz1;->f:Lsl;

    .line 1230
    .line 1231
    if-nez v3, :cond_20

    .line 1232
    .line 1233
    if-nez v2, :cond_1e

    .line 1234
    .line 1235
    goto :goto_15

    .line 1236
    :cond_1e
    invoke-static {v2}, Lsl;->a(Landroid/content/Context;)Ljava/lang/String;

    .line 1237
    .line 1238
    .line 1239
    move-result-object v3

    .line 1240
    if-eqz v3, :cond_20

    .line 1241
    .line 1242
    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 1243
    .line 1244
    .line 1245
    move-result-object v4

    .line 1246
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1247
    .line 1248
    .line 1249
    move-result v4

    .line 1250
    if-nez v4, :cond_20

    .line 1251
    .line 1252
    invoke-virtual {v2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 1253
    .line 1254
    .line 1255
    move-result-object v4

    .line 1256
    iput-object v4, v0, Ltl;->a:Landroid/content/Context;

    .line 1257
    .line 1258
    new-instance v4, Landroid/content/Intent;

    .line 1259
    .line 1260
    const-string v5, "android.support.customtabs.action.CustomTabsService"

    .line 1261
    .line 1262
    invoke-direct {v4, v5}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 1263
    .line 1264
    .line 1265
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 1266
    .line 1267
    .line 1268
    move-result v5

    .line 1269
    if-nez v5, :cond_1f

    .line 1270
    .line 1271
    invoke-virtual {v4, v3}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 1272
    .line 1273
    .line 1274
    :cond_1f
    const/16 v3, 0x21

    .line 1275
    .line 1276
    invoke-virtual {v2, v4, v0, v3}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    .line 1277
    .line 1278
    .line 1279
    :cond_20
    :goto_15
    return-void

    .line 1280
    :pswitch_17
    iget-object v0, v1, Lfu1;->g:Ljava/lang/Object;

    .line 1281
    .line 1282
    check-cast v0, Lh2;

    .line 1283
    .line 1284
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1285
    .line 1286
    .line 1287
    :cond_21
    :goto_16
    :try_start_9
    iget-object v2, v0, Lh2;->a:Ljava/lang/Object;

    .line 1288
    .line 1289
    check-cast v2, Ljava/util/concurrent/ArrayBlockingQueue;

    .line 1290
    .line 1291
    invoke-virtual {v2}, Ljava/util/concurrent/ArrayBlockingQueue;->take()Ljava/lang/Object;

    .line 1292
    .line 1293
    .line 1294
    move-result-object v2

    .line 1295
    check-cast v2, Ltz1;

    .line 1296
    .line 1297
    invoke-virtual {v2}, Ltz1;->b()Lsz1;

    .line 1298
    .line 1299
    .line 1300
    move-result-object v4
    :try_end_9
    .catch Ljava/lang/InterruptedException; {:try_start_9 .. :try_end_9} :catch_10

    .line 1301
    iget-object v5, v4, Lsz1;->f:Ljava/lang/String;

    .line 1302
    .line 1303
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 1304
    .line 1305
    .line 1306
    move-result v5

    .line 1307
    if-nez v5, :cond_21

    .line 1308
    .line 1309
    iget-object v5, v0, Lh2;->b:Ljava/lang/Object;

    .line 1310
    .line 1311
    check-cast v5, Ljava/util/LinkedHashMap;

    .line 1312
    .line 1313
    iget-object v6, v2, Ltz1;->c:Ljava/lang/Object;

    .line 1314
    .line 1315
    monitor-enter v6

    .line 1316
    :try_start_a
    sget-object v7, Lhg4;->C:Lhg4;

    .line 1317
    .line 1318
    iget-object v7, v7, Lhg4;->h:Lgd2;

    .line 1319
    .line 1320
    invoke-virtual {v7}, Lgd2;->a()Lh2;

    .line 1321
    .line 1322
    .line 1323
    iget-object v2, v2, Ltz1;->b:Ljava/util/LinkedHashMap;

    .line 1324
    .line 1325
    monitor-exit v6
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_1

    .line 1326
    invoke-virtual {v0, v5, v2}, Lh2;->p(Ljava/util/LinkedHashMap;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    .line 1327
    .line 1328
    .line 1329
    move-result-object v2

    .line 1330
    invoke-virtual {v0, v2, v4}, Lh2;->r(Ljava/util/LinkedHashMap;Lsz1;)V

    .line 1331
    .line 1332
    .line 1333
    goto :goto_16

    .line 1334
    :catchall_1
    move-exception v0

    .line 1335
    :try_start_b
    monitor-exit v6
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_1

    .line 1336
    throw v0

    .line 1337
    :catch_10
    invoke-static {v3}, Lgi2;->q0(I)Z

    .line 1338
    .line 1339
    .line 1340
    return-void

    .line 1341
    :pswitch_18
    iget-object v0, v1, Lfu1;->g:Ljava/lang/Object;

    .line 1342
    .line 1343
    move-object v5, v0

    .line 1344
    check-cast v5, Lso1;

    .line 1345
    .line 1346
    monitor-enter v5

    .line 1347
    :try_start_c
    iget-object v0, v5, Lso1;->h:Ljava/lang/Object;

    .line 1348
    .line 1349
    check-cast v0, Lwy0;

    .line 1350
    .line 1351
    iget-boolean v6, v0, Lwy0;->f:Z

    .line 1352
    .line 1353
    if-eqz v6, :cond_22

    .line 1354
    .line 1355
    iget-object v6, v0, Lwy0;->g:Ljava/lang/Object;

    .line 1356
    .line 1357
    check-cast v6, Llv1;

    .line 1358
    .line 1359
    iget-object v7, v5, Lso1;->g:Ljava/lang/Object;

    .line 1360
    .line 1361
    check-cast v7, [B

    .line 1362
    .line 1363
    check-cast v6, Ljv1;

    .line 1364
    .line 1365
    invoke-virtual {v6}, Lsb1;->U()Landroid/os/Parcel;

    .line 1366
    .line 1367
    .line 1368
    move-result-object v8

    .line 1369
    invoke-virtual {v8, v7}, Landroid/os/Parcel;->writeByteArray([B)V

    .line 1370
    .line 1371
    .line 1372
    invoke-virtual {v6, v8, v3}, Lsb1;->M0(Landroid/os/Parcel;I)V

    .line 1373
    .line 1374
    .line 1375
    iget-object v3, v0, Lwy0;->g:Ljava/lang/Object;

    .line 1376
    .line 1377
    check-cast v3, Llv1;

    .line 1378
    .line 1379
    check-cast v3, Ljv1;

    .line 1380
    .line 1381
    invoke-virtual {v3}, Lsb1;->U()Landroid/os/Parcel;

    .line 1382
    .line 1383
    .line 1384
    move-result-object v6

    .line 1385
    const/4 v7, 0x0

    .line 1386
    invoke-virtual {v6, v7}, Landroid/os/Parcel;->writeInt(I)V

    .line 1387
    .line 1388
    .line 1389
    const/4 v7, 0x6

    .line 1390
    invoke-virtual {v3, v6, v7}, Lsb1;->M0(Landroid/os/Parcel;I)V

    .line 1391
    .line 1392
    .line 1393
    iget-object v3, v0, Lwy0;->g:Ljava/lang/Object;

    .line 1394
    .line 1395
    check-cast v3, Llv1;

    .line 1396
    .line 1397
    iget v6, v5, Lso1;->f:I

    .line 1398
    .line 1399
    check-cast v3, Ljv1;

    .line 1400
    .line 1401
    invoke-virtual {v3}, Lsb1;->U()Landroid/os/Parcel;

    .line 1402
    .line 1403
    .line 1404
    move-result-object v7

    .line 1405
    invoke-virtual {v7, v6}, Landroid/os/Parcel;->writeInt(I)V

    .line 1406
    .line 1407
    .line 1408
    const/4 v6, 0x7

    .line 1409
    invoke-virtual {v3, v7, v6}, Lsb1;->M0(Landroid/os/Parcel;I)V

    .line 1410
    .line 1411
    .line 1412
    iget-object v3, v0, Lwy0;->g:Ljava/lang/Object;

    .line 1413
    .line 1414
    check-cast v3, Llv1;

    .line 1415
    .line 1416
    check-cast v3, Ljv1;

    .line 1417
    .line 1418
    invoke-virtual {v3}, Lsb1;->U()Landroid/os/Parcel;

    .line 1419
    .line 1420
    .line 1421
    move-result-object v6

    .line 1422
    invoke-virtual {v6, v4}, Landroid/os/Parcel;->writeIntArray([I)V

    .line 1423
    .line 1424
    .line 1425
    const/4 v4, 0x4

    .line 1426
    invoke-virtual {v3, v6, v4}, Lsb1;->M0(Landroid/os/Parcel;I)V

    .line 1427
    .line 1428
    .line 1429
    iget-object v0, v0, Lwy0;->g:Ljava/lang/Object;

    .line 1430
    .line 1431
    check-cast v0, Llv1;

    .line 1432
    .line 1433
    check-cast v0, Ljv1;

    .line 1434
    .line 1435
    invoke-virtual {v0}, Lsb1;->U()Landroid/os/Parcel;

    .line 1436
    .line 1437
    .line 1438
    move-result-object v3

    .line 1439
    invoke-virtual {v0, v3, v2}, Lsb1;->M0(Landroid/os/Parcel;I)V
    :try_end_c
    .catch Landroid/os/RemoteException; {:try_start_c .. :try_end_c} :catch_11
    .catchall {:try_start_c .. :try_end_c} :catchall_2

    .line 1440
    .line 1441
    .line 1442
    :cond_22
    monitor-exit v5

    .line 1443
    goto :goto_17

    .line 1444
    :catchall_2
    move-exception v0

    .line 1445
    goto :goto_18

    .line 1446
    :catch_11
    :try_start_d
    invoke-static {v2}, Lgi2;->q0(I)Z
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_2

    .line 1447
    .line 1448
    .line 1449
    monitor-exit v5

    .line 1450
    :goto_17
    return-void

    .line 1451
    :goto_18
    :try_start_e
    monitor-exit v5
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_2

    .line 1452
    throw v0

    .line 1453
    :pswitch_19
    iget-object v0, v1, Lfu1;->g:Ljava/lang/Object;

    .line 1454
    .line 1455
    check-cast v0, Lbu1;

    .line 1456
    .line 1457
    invoke-virtual {v0}, Lbu1;->y()V

    .line 1458
    .line 1459
    .line 1460
    return-void

    .line 1461
    :pswitch_1a
    iget-object v0, v1, Lfu1;->g:Ljava/lang/Object;

    .line 1462
    .line 1463
    check-cast v0, Lvv1;

    .line 1464
    .line 1465
    iget-object v3, v0, Lvv1;->h:Ljava/lang/Object;

    .line 1466
    .line 1467
    monitor-enter v3

    .line 1468
    :try_start_f
    iget-object v2, v0, Lvv1;->i:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 1469
    .line 1470
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 1471
    .line 1472
    .line 1473
    move-result v2

    .line 1474
    if-eqz v2, :cond_23

    .line 1475
    .line 1476
    iget-boolean v2, v0, Lvv1;->j:Z

    .line 1477
    .line 1478
    if-eqz v2, :cond_23

    .line 1479
    .line 1480
    iget-object v2, v0, Lvv1;->i:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 1481
    .line 1482
    const/4 v5, 0x0

    .line 1483
    invoke-virtual {v2, v5}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 1484
    .line 1485
    .line 1486
    const-string v2, "App went background"

    .line 1487
    .line 1488
    invoke-static {v2}, Lgi2;->U(Ljava/lang/String;)V

    .line 1489
    .line 1490
    .line 1491
    iget-object v2, v0, Lvv1;->k:Ljava/util/ArrayList;

    .line 1492
    .line 1493
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 1494
    .line 1495
    .line 1496
    move-result v4

    .line 1497
    const/4 v5, 0x0

    .line 1498
    :goto_19
    if-ge v5, v4, :cond_24

    .line 1499
    .line 1500
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1501
    .line 1502
    .line 1503
    move-result-object v0

    .line 1504
    add-int/lit8 v5, v5, 0x1

    .line 1505
    .line 1506
    check-cast v0, Lwv1;
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_3

    .line 1507
    .line 1508
    const/4 v7, 0x0

    .line 1509
    :try_start_10
    invoke-interface {v0, v7}, Lwv1;->T(Z)V
    :try_end_10
    .catch Ljava/lang/Exception; {:try_start_10 .. :try_end_10} :catch_12
    .catchall {:try_start_10 .. :try_end_10} :catchall_3

    .line 1510
    .line 1511
    .line 1512
    goto :goto_19

    .line 1513
    :catchall_3
    move-exception v0

    .line 1514
    goto :goto_1a

    .line 1515
    :catch_12
    move-exception v0

    .line 1516
    :try_start_11
    const-string v6, ""

    .line 1517
    .line 1518
    invoke-static {v6, v0}, Lgi2;->c0(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1519
    .line 1520
    .line 1521
    goto :goto_19

    .line 1522
    :cond_23
    const-string v0, "App is still foreground"

    .line 1523
    .line 1524
    invoke-static {v0}, Lgi2;->U(Ljava/lang/String;)V

    .line 1525
    .line 1526
    .line 1527
    :cond_24
    monitor-exit v3

    .line 1528
    return-void

    .line 1529
    :goto_1a
    monitor-exit v3
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_3

    .line 1530
    throw v0

    .line 1531
    :pswitch_1b
    iget-object v0, v1, Lfu1;->g:Ljava/lang/Object;

    .line 1532
    .line 1533
    check-cast v0, Lpv1;

    .line 1534
    .line 1535
    invoke-virtual {v0, v2}, Lpv1;->d(I)V

    .line 1536
    .line 1537
    .line 1538
    return-void

    .line 1539
    :pswitch_1c
    const-string v0, "UTF-8"

    .line 1540
    .line 1541
    iget-object v2, v1, Lfu1;->g:Ljava/lang/Object;

    .line 1542
    .line 1543
    check-cast v2, Lgu1;

    .line 1544
    .line 1545
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1546
    .line 1547
    .line 1548
    :try_start_12
    iget-object v3, v2, Lgu1;->a:Ljt1;

    .line 1549
    .line 1550
    iget-object v4, v3, Ljt1;->c:Ldalvik/system/DexClassLoader;

    .line 1551
    .line 1552
    iget-object v5, v3, Ljt1;->e:[B

    .line 1553
    .line 1554
    iget-object v6, v2, Lgu1;->b:Ljava/lang/String;

    .line 1555
    .line 1556
    iget-object v7, v3, Ljt1;->d:Lfr;

    .line 1557
    .line 1558
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1559
    .line 1560
    .line 1561
    invoke-static {v6, v5}, Lfr;->p(Ljava/lang/String;[B)[B

    .line 1562
    .line 1563
    .line 1564
    move-result-object v5

    .line 1565
    new-instance v6, Ljava/lang/String;

    .line 1566
    .line 1567
    invoke-direct {v6, v5, v0}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    .line 1568
    .line 1569
    .line 1570
    invoke-virtual {v4, v6}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 1571
    .line 1572
    .line 1573
    move-result-object v4

    .line 1574
    if-eqz v4, :cond_25

    .line 1575
    .line 1576
    iget-object v3, v3, Ljt1;->e:[B

    .line 1577
    .line 1578
    iget-object v5, v2, Lgu1;->c:Ljava/lang/String;

    .line 1579
    .line 1580
    iget-object v6, v2, Lgu1;->a:Ljt1;

    .line 1581
    .line 1582
    iget-object v6, v6, Ljt1;->d:Lfr;

    .line 1583
    .line 1584
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1585
    .line 1586
    .line 1587
    invoke-static {v5, v3}, Lfr;->p(Ljava/lang/String;[B)[B

    .line 1588
    .line 1589
    .line 1590
    move-result-object v3

    .line 1591
    new-instance v5, Ljava/lang/String;

    .line 1592
    .line 1593
    invoke-direct {v5, v3, v0}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    .line 1594
    .line 1595
    .line 1596
    iget-object v0, v2, Lgu1;->e:[Ljava/lang/Class;

    .line 1597
    .line 1598
    invoke-virtual {v4, v5, v0}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 1599
    .line 1600
    .line 1601
    move-result-object v0

    .line 1602
    iput-object v0, v2, Lgu1;->d:Ljava/lang/reflect/Method;
    :try_end_12
    .catch Lat1; {:try_start_12 .. :try_end_12} :catch_13
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_12 .. :try_end_12} :catch_13
    .catch Ljava/lang/ClassNotFoundException; {:try_start_12 .. :try_end_12} :catch_13
    .catch Ljava/lang/NoSuchMethodException; {:try_start_12 .. :try_end_12} :catch_13
    .catch Ljava/lang/NullPointerException; {:try_start_12 .. :try_end_12} :catch_13
    .catchall {:try_start_12 .. :try_end_12} :catchall_4

    .line 1603
    .line 1604
    goto :goto_1b

    .line 1605
    :catchall_4
    move-exception v0

    .line 1606
    iget-object v2, v2, Lgu1;->f:Ljava/util/concurrent/CountDownLatch;

    .line 1607
    .line 1608
    invoke-virtual {v2}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 1609
    .line 1610
    .line 1611
    throw v0

    .line 1612
    :catch_13
    :cond_25
    :goto_1b
    iget-object v0, v2, Lgu1;->f:Ljava/util/concurrent/CountDownLatch;

    .line 1613
    .line 1614
    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 1615
    .line 1616
    .line 1617
    return-void

    .line 1618
    nop

    .line 1619
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
