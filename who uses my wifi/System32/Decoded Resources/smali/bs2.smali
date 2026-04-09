.class public final synthetic Lbs2;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic f:I

.field public final g:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lbs2;->f:I

    iput-object p2, p0, Lbs2;->g:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Luc3;)V
    .locals 1

    const/16 v0, 0x1a

    iput v0, p0, Lbs2;->f:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iget-object p1, p1, Luc3;->e:Landroid/webkit/WebView;

    .line 4
    iput-object p1, p0, Lbs2;->g:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lzc3;)V
    .locals 1

    const/16 v0, 0x1b

    iput v0, p0, Lbs2;->f:I

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lbs2;->g:Ljava/lang/Object;

    return-void
.end method

.method private final a()V
    .locals 5

    .line 1
    iget-object v0, p0, Lbs2;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lo13;

    .line 4
    .line 5
    monitor-enter v0

    .line 6
    :try_start_0
    iget-object v1, v0, Lo13;->a:Lym;

    .line 7
    .line 8
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 12
    .line 13
    .line 14
    move-result-wide v1

    .line 15
    iget-wide v3, v0, Lo13;->i:J

    .line 16
    .line 17
    sub-long/2addr v1, v3

    .line 18
    iput-wide v1, v0, Lo13;->h:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    .line 20
    monitor-exit v0

    .line 21
    return-void

    .line 22
    :catchall_0
    move-exception v1

    .line 23
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 24
    throw v1
.end method

.method private final b()V
    .locals 3

    .line 1
    iget-object v0, p0, Lbs2;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ll23;

    .line 4
    .line 5
    monitor-enter v0

    .line 6
    :try_start_0
    const-string v1, "Signal collection timeout."

    .line 7
    .line 8
    const/4 v2, 0x3

    .line 9
    invoke-virtual {v0, v1, v2}, Ll23;->B3(Ljava/lang/String;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    .line 11
    .line 12
    monitor-exit v0

    .line 13
    return-void

    .line 14
    :catchall_0
    move-exception v1

    .line 15
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 16
    throw v1
.end method


# virtual methods
.method public final run()V
    .locals 13

    .line 1
    iget v0, p0, Lbs2;->f:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    const/4 v2, 0x6

    .line 5
    const/4 v3, 0x5

    .line 6
    const/4 v4, 0x0

    .line 7
    const/4 v5, 0x0

    .line 8
    const/4 v6, 0x1

    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lbs2;->g:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Ljava/net/HttpURLConnection;

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :pswitch_0
    iget-object v0, p0, Lbs2;->g:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v0, Lk01;

    .line 23
    .line 24
    new-instance v1, Lke3;

    .line 25
    .line 26
    invoke-direct {v1}, Lke3;-><init>()V

    .line 27
    .line 28
    .line 29
    new-instance v2, Lhe3;

    .line 30
    .line 31
    invoke-direct {v2, v1}, Lhe3;-><init>(Lje3;)V

    .line 32
    .line 33
    .line 34
    iget-object v0, v0, Lk01;->a:Lgi4;

    .line 35
    .line 36
    invoke-virtual {v0, v2}, Lgi4;->e(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :pswitch_1
    iget-object v0, p0, Lbs2;->g:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v0, Lzc3;

    .line 43
    .line 44
    iget-object v0, v0, Lzc3;->e:Llv2;

    .line 45
    .line 46
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    new-instance v1, Lbd3;

    .line 50
    .line 51
    invoke-direct {v1, v0}, Lad3;-><init>(Llv2;)V

    .line 52
    .line 53
    .line 54
    iget-object v0, v0, Llv2;->h:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v0, Lt83;

    .line 57
    .line 58
    iput-object v0, v1, Lad3;->a:Lt83;

    .line 59
    .line 60
    iget-object v2, v0, Lt83;->h:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v2, Ljava/util/ArrayDeque;

    .line 63
    .line 64
    invoke-virtual {v2, v1}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    iget-object v1, v0, Lt83;->i:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v1, Lad3;

    .line 70
    .line 71
    if-nez v1, :cond_0

    .line 72
    .line 73
    invoke-virtual {v2}, Ljava/util/ArrayDeque;->poll()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    check-cast v1, Lad3;

    .line 78
    .line 79
    iput-object v1, v0, Lt83;->i:Ljava/lang/Object;

    .line 80
    .line 81
    if-eqz v1, :cond_0

    .line 82
    .line 83
    iget-object v0, v0, Lt83;->g:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast v0, Ljava/util/concurrent/ThreadPoolExecutor;

    .line 86
    .line 87
    new-array v2, v4, [Ljava/lang/Object;

    .line 88
    .line 89
    invoke-virtual {v1, v0, v2}, Landroid/os/AsyncTask;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 90
    .line 91
    .line 92
    :cond_0
    return-void

    .line 93
    :pswitch_2
    iget-object v0, p0, Lbs2;->g:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast v0, Landroid/webkit/WebView;

    .line 96
    .line 97
    invoke-virtual {v0}, Landroid/webkit/WebView;->destroy()V

    .line 98
    .line 99
    .line 100
    return-void

    .line 101
    :pswitch_3
    iget-object v0, p0, Lbs2;->g:Ljava/lang/Object;

    .line 102
    .line 103
    check-cast v0, Lfc3;

    .line 104
    .line 105
    iget-object v1, v0, Lfc3;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 106
    .line 107
    iget-object v2, v0, Lfc3;->c:Landroid/media/AudioManager;

    .line 108
    .line 109
    const/4 v3, 0x3

    .line 110
    invoke-virtual {v2, v3}, Landroid/media/AudioManager;->getStreamVolume(I)I

    .line 111
    .line 112
    .line 113
    move-result v5

    .line 114
    invoke-virtual {v2, v3}, Landroid/media/AudioManager;->getStreamMaxVolume(I)I

    .line 115
    .line 116
    .line 117
    move-result v2

    .line 118
    const/4 v3, 0x0

    .line 119
    if-lez v2, :cond_2

    .line 120
    .line 121
    if-gtz v5, :cond_1

    .line 122
    .line 123
    goto :goto_0

    .line 124
    :cond_1
    int-to-float v3, v5

    .line 125
    int-to-float v2, v2

    .line 126
    div-float/2addr v3, v2

    .line 127
    const/high16 v2, 0x3f800000    # 1.0f

    .line 128
    .line 129
    cmpl-float v5, v3, v2

    .line 130
    .line 131
    if-lez v5, :cond_2

    .line 132
    .line 133
    move v3, v2

    .line 134
    :cond_2
    :goto_0
    invoke-virtual {v1, v4}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 135
    .line 136
    .line 137
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 138
    .line 139
    .line 140
    move-result-object v1

    .line 141
    iget-object v2, v0, Lfc3;->d:Ljava/util/concurrent/atomic/AtomicReference;

    .line 142
    .line 143
    invoke-virtual {v2, v1}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v1

    .line 147
    check-cast v1, Ljava/lang/Float;

    .line 148
    .line 149
    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    .line 150
    .line 151
    .line 152
    move-result v1

    .line 153
    cmpl-float v1, v1, v3

    .line 154
    .line 155
    if-eqz v1, :cond_3

    .line 156
    .line 157
    new-instance v1, Lec3;

    .line 158
    .line 159
    invoke-direct {v1, p0, v3}, Lec3;-><init>(Lbs2;F)V

    .line 160
    .line 161
    .line 162
    iget-object v0, v0, Lfc3;->a:Landroid/os/Handler;

    .line 163
    .line 164
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 165
    .line 166
    .line 167
    :cond_3
    return-void

    .line 168
    :pswitch_4
    iget-object v0, p0, Lbs2;->g:Ljava/lang/Object;

    .line 169
    .line 170
    check-cast v0, Lfb2;

    .line 171
    .line 172
    if-eqz v0, :cond_4

    .line 173
    .line 174
    :try_start_0
    invoke-interface {v0, v6}, Lfb2;->t(I)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 175
    .line 176
    .line 177
    goto :goto_1

    .line 178
    :catch_0
    move-exception v0

    .line 179
    const-string v1, "#007 Could not call remote method."

    .line 180
    .line 181
    invoke-static {v1, v0}, Lgi2;->p0(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 182
    .line 183
    .line 184
    :cond_4
    :goto_1
    return-void

    .line 185
    :pswitch_5
    iget-object v0, p0, Lbs2;->g:Ljava/lang/Object;

    .line 186
    .line 187
    check-cast v0, Lma3;

    .line 188
    .line 189
    iget-object v0, v0, Lma3;->f:Ld52;

    .line 190
    .line 191
    if-eqz v0, :cond_5

    .line 192
    .line 193
    :try_start_1
    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 194
    .line 195
    invoke-interface {v0, v1}, Ld52;->Q1(Ljava/util/List;)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_1

    .line 196
    .line 197
    .line 198
    goto :goto_2

    .line 199
    :catch_1
    invoke-static {v3}, Lgi2;->q0(I)Z

    .line 200
    .line 201
    .line 202
    :cond_5
    :goto_2
    return-void

    .line 203
    :pswitch_6
    iget-object v0, p0, Lbs2;->g:Ljava/lang/Object;

    .line 204
    .line 205
    check-cast v0, Lr93;

    .line 206
    .line 207
    iget-object v0, v0, Lr93;->f:Ld32;

    .line 208
    .line 209
    if-eqz v0, :cond_6

    .line 210
    .line 211
    :try_start_2
    invoke-interface {v0, v6}, Ld32;->I(I)V
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_2

    .line 212
    .line 213
    .line 214
    goto :goto_3

    .line 215
    :catch_2
    invoke-static {v3}, Lgi2;->q0(I)Z

    .line 216
    .line 217
    .line 218
    :cond_6
    :goto_3
    return-void

    .line 219
    :pswitch_7
    iget-object v0, p0, Lbs2;->g:Ljava/lang/Object;

    .line 220
    .line 221
    check-cast v0, Lp83;

    .line 222
    .line 223
    iget-object v0, v0, Lp83;->f:Ly83;

    .line 224
    .line 225
    iget-object v0, v0, Ly83;->f:Ld32;

    .line 226
    .line 227
    if-eqz v0, :cond_7

    .line 228
    .line 229
    :try_start_3
    invoke-interface {v0, v6}, Ld32;->I(I)V
    :try_end_3
    .catch Landroid/os/RemoteException; {:try_start_3 .. :try_end_3} :catch_3

    .line 230
    .line 231
    .line 232
    goto :goto_4

    .line 233
    :catch_3
    invoke-static {v3}, Lgi2;->q0(I)Z

    .line 234
    .line 235
    .line 236
    :cond_7
    :goto_4
    return-void

    .line 237
    :pswitch_8
    iget-object v0, p0, Lbs2;->g:Ljava/lang/Object;

    .line 238
    .line 239
    check-cast v0, Lv73;

    .line 240
    .line 241
    iget-object v0, v0, Lv73;->d:Ls73;

    .line 242
    .line 243
    invoke-static {v2, v5, v5}, Lzt0;->Q(ILjava/lang/String;Lnx2;)Lnx2;

    .line 244
    .line 245
    .line 246
    move-result-object v1

    .line 247
    invoke-virtual {v0, v1}, Ls73;->d0(Lnx2;)V

    .line 248
    .line 249
    .line 250
    return-void

    .line 251
    :pswitch_9
    iget-object v0, p0, Lbs2;->g:Ljava/lang/Object;

    .line 252
    .line 253
    check-cast v0, Ls73;

    .line 254
    .line 255
    invoke-virtual {v0}, Ls73;->e()V

    .line 256
    .line 257
    .line 258
    return-void

    .line 259
    :pswitch_a
    iget-object v0, p0, Lbs2;->g:Ljava/lang/Object;

    .line 260
    .line 261
    check-cast v0, Lq73;

    .line 262
    .line 263
    iget-object v0, v0, Lq73;->d:Ls23;

    .line 264
    .line 265
    invoke-static {v2, v5, v5}, Lzt0;->Q(ILjava/lang/String;Lnx2;)Lnx2;

    .line 266
    .line 267
    .line 268
    move-result-object v1

    .line 269
    invoke-virtual {v0, v1}, Ls23;->d0(Lnx2;)V

    .line 270
    .line 271
    .line 272
    return-void

    .line 273
    :pswitch_b
    iget-object v0, p0, Lbs2;->g:Ljava/lang/Object;

    .line 274
    .line 275
    check-cast v0, Ls23;

    .line 276
    .line 277
    invoke-virtual {v0}, Ls23;->e()V

    .line 278
    .line 279
    .line 280
    return-void

    .line 281
    :pswitch_c
    iget-object v0, p0, Lbs2;->g:Ljava/lang/Object;

    .line 282
    .line 283
    check-cast v0, Lz63;

    .line 284
    .line 285
    iget-object v0, v0, Lz63;->d:Ls23;

    .line 286
    .line 287
    invoke-static {v2, v5, v5}, Lzt0;->Q(ILjava/lang/String;Lnx2;)Lnx2;

    .line 288
    .line 289
    .line 290
    move-result-object v1

    .line 291
    invoke-virtual {v0, v1}, Ls23;->d0(Lnx2;)V

    .line 292
    .line 293
    .line 294
    return-void

    .line 295
    :pswitch_d
    iget-object v0, p0, Lbs2;->g:Ljava/lang/Object;

    .line 296
    .line 297
    check-cast v0, Lt63;

    .line 298
    .line 299
    iget-object v0, v0, Lt63;->d:Ls63;

    .line 300
    .line 301
    invoke-static {v2, v5, v5}, Lzt0;->Q(ILjava/lang/String;Lnx2;)Lnx2;

    .line 302
    .line 303
    .line 304
    move-result-object v1

    .line 305
    invoke-virtual {v0, v1}, Ls63;->d0(Lnx2;)V

    .line 306
    .line 307
    .line 308
    return-void

    .line 309
    :pswitch_e
    iget-object v0, p0, Lbs2;->g:Ljava/lang/Object;

    .line 310
    .line 311
    check-cast v0, Ljh1;

    .line 312
    .line 313
    invoke-virtual {v0}, Ljh1;->C3()V

    .line 314
    .line 315
    .line 316
    return-void

    .line 317
    :pswitch_f
    sget-object v0, Lmz1;->jb:Liz1;

    .line 318
    .line 319
    sget-object v1, Ltw1;->e:Ltw1;

    .line 320
    .line 321
    iget-object v1, v1, Ltw1;->c:Lkz1;

    .line 322
    .line 323
    invoke-virtual {v1, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 324
    .line 325
    .line 326
    move-result-object v0

    .line 327
    check-cast v0, Ljava/lang/Boolean;

    .line 328
    .line 329
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 330
    .line 331
    .line 332
    move-result v0

    .line 333
    iget-object v1, p0, Lbs2;->g:Ljava/lang/Object;

    .line 334
    .line 335
    check-cast v1, Ljava/lang/Throwable;

    .line 336
    .line 337
    if-eqz v0, :cond_8

    .line 338
    .line 339
    const-string v0, "TopicsSignalUnsampled.fetchTopicsSignal"

    .line 340
    .line 341
    sget-object v2, Lhg4;->C:Lhg4;

    .line 342
    .line 343
    iget-object v2, v2, Lhg4;->h:Lgd2;

    .line 344
    .line 345
    invoke-virtual {v2, v0, v1}, Lgd2;->f(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 346
    .line 347
    .line 348
    goto :goto_5

    .line 349
    :cond_8
    const-string v0, "TopicsSignal.fetchTopicsSignal"

    .line 350
    .line 351
    sget-object v2, Lhg4;->C:Lhg4;

    .line 352
    .line 353
    iget-object v2, v2, Lhg4;->h:Lgd2;

    .line 354
    .line 355
    invoke-virtual {v2, v0, v1}, Lgd2;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 356
    .line 357
    .line 358
    :goto_5
    return-void

    .line 359
    :pswitch_10
    invoke-direct {p0}, Lbs2;->b()V

    .line 360
    .line 361
    .line 362
    return-void

    .line 363
    :pswitch_11
    invoke-direct {p0}, Lbs2;->a()V

    .line 364
    .line 365
    .line 366
    return-void

    .line 367
    :pswitch_12
    iget-object v0, p0, Lbs2;->g:Ljava/lang/Object;

    .line 368
    .line 369
    move-object v10, v0

    .line 370
    check-cast v10, Lby2;

    .line 371
    .line 372
    iget-object v1, v10, Lfy2;->g:Ljava/lang/Object;

    .line 373
    .line 374
    monitor-enter v1

    .line 375
    :try_start_4
    iget-boolean v0, v10, Lfy2;->h:Z

    .line 376
    .line 377
    if-eqz v0, :cond_9

    .line 378
    .line 379
    monitor-exit v1

    .line 380
    goto :goto_6

    .line 381
    :catchall_0
    move-exception v0

    .line 382
    goto :goto_7

    .line 383
    :cond_9
    iput-boolean v6, v10, Lfy2;->h:Z

    .line 384
    .line 385
    sget-object v0, Lhg4;->C:Lhg4;

    .line 386
    .line 387
    iget-object v0, v0, Lhg4;->t:Lr2;

    .line 388
    .line 389
    invoke-virtual {v0}, Lr2;->a()Landroid/os/Looper;

    .line 390
    .line 391
    .line 392
    move-result-object v9

    .line 393
    iget-object v8, v10, Lby2;->l:Landroid/content/Context;

    .line 394
    .line 395
    new-instance v7, Lvw1;

    .line 396
    .line 397
    const/4 v12, 0x2

    .line 398
    move-object v11, v10

    .line 399
    invoke-direct/range {v7 .. v12}, Lvw1;-><init>(Landroid/content/Context;Landroid/os/Looper;Lt9;Lu9;I)V

    .line 400
    .line 401
    .line 402
    iput-object v7, v10, Lfy2;->k:Lvw1;

    .line 403
    .line 404
    invoke-virtual {v7}, Lw9;->n()V

    .line 405
    .line 406
    .line 407
    monitor-exit v1

    .line 408
    :goto_6
    return-void

    .line 409
    :goto_7
    monitor-exit v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 410
    throw v0

    .line 411
    :pswitch_13
    iget-object v0, p0, Lbs2;->g:Ljava/lang/Object;

    .line 412
    .line 413
    check-cast v0, Lt83;

    .line 414
    .line 415
    invoke-virtual {v0}, Lt83;->Z()V

    .line 416
    .line 417
    .line 418
    return-void

    .line 419
    :pswitch_14
    iget-object v0, p0, Lbs2;->g:Ljava/lang/Object;

    .line 420
    .line 421
    check-cast v0, Lxb4;

    .line 422
    .line 423
    iget-object v1, v0, Lxb4;->h:Ljava/lang/Object;

    .line 424
    .line 425
    check-cast v1, Lth2;

    .line 426
    .line 427
    iget-object v1, v1, Lth2;->b:Lth2;

    .line 428
    .line 429
    iget-object v0, v0, Lxb4;->g:Ljava/lang/Object;

    .line 430
    .line 431
    check-cast v0, Landroid/content/Context;

    .line 432
    .line 433
    const-class v2, Landroid/content/Context;

    .line 434
    .line 435
    invoke-static {v0, v2}, Li41;->P(Ljava/lang/Object;Ljava/lang/Class;)V

    .line 436
    .line 437
    .line 438
    new-instance v9, Lsq0;

    .line 439
    .line 440
    invoke-direct {v9, v1}, Lsq0;-><init>(Lth2;)V

    .line 441
    .line 442
    .line 443
    iget-object v0, v1, Lth2;->j:Lba4;

    .line 444
    .line 445
    iget-object v1, v1, Lth2;->a:Leh2;

    .line 446
    .line 447
    iget-object v2, v9, Lsq0;->g:Ljava/lang/Object;

    .line 448
    .line 449
    check-cast v2, Lic2;

    .line 450
    .line 451
    iget-object v4, v1, Leh2;->b:Landroid/content/Context;

    .line 452
    .line 453
    invoke-static {v4}, Li41;->M(Ljava/lang/Object;)V

    .line 454
    .line 455
    .line 456
    sget-object v5, Lmd2;->b:Lld2;

    .line 457
    .line 458
    invoke-static {v5}, Li41;->M(Ljava/lang/Object;)V

    .line 459
    .line 460
    .line 461
    sget-object v6, Lmd2;->a:Lld2;

    .line 462
    .line 463
    invoke-static {v6}, Li41;->M(Ljava/lang/Object;)V

    .line 464
    .line 465
    .line 466
    invoke-static {v2}, Lba4;->b(Lga4;)Lz94;

    .line 467
    .line 468
    .line 469
    move-result-object v7

    .line 470
    iget-object v8, v1, Leh2;->a:Le51;

    .line 471
    .line 472
    invoke-static {v8}, Li41;->M(Ljava/lang/Object;)V

    .line 473
    .line 474
    .line 475
    invoke-virtual {v0}, Lba4;->d()Ljava/lang/Object;

    .line 476
    .line 477
    .line 478
    move-result-object v0

    .line 479
    move-object v10, v0

    .line 480
    check-cast v10, Lmv2;

    .line 481
    .line 482
    new-instance v3, Lt83;

    .line 483
    .line 484
    invoke-direct/range {v3 .. v10}, Lt83;-><init>(Landroid/content/Context;Lpq3;Lpq3;Lz94;Le51;Lsq0;Lmv2;)V

    .line 485
    .line 486
    .line 487
    sget-object v0, Lhg4;->C:Lhg4;

    .line 488
    .line 489
    iget-object v0, v0, Lhg4;->c:Llf4;

    .line 490
    .line 491
    invoke-virtual {v4}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 492
    .line 493
    .line 494
    move-result-object v0

    .line 495
    invoke-static {v0}, Llf4;->e(Ljava/lang/String;)Z

    .line 496
    .line 497
    .line 498
    move-result v0

    .line 499
    if-eqz v0, :cond_a

    .line 500
    .line 501
    new-instance v0, Lbs2;

    .line 502
    .line 503
    const/16 v1, 0x9

    .line 504
    .line 505
    invoke-direct {v0, v1, v3}, Lbs2;-><init>(ILjava/lang/Object;)V

    .line 506
    .line 507
    .line 508
    invoke-virtual {v6, v0}, Lld2;->execute(Ljava/lang/Runnable;)V

    .line 509
    .line 510
    .line 511
    goto :goto_8

    .line 512
    :cond_a
    new-instance v0, Lz71;

    .line 513
    .line 514
    const/16 v1, 0x19

    .line 515
    .line 516
    invoke-direct {v0, v1, v3}, Lz71;-><init>(ILjava/lang/Object;)V

    .line 517
    .line 518
    .line 519
    invoke-static {v4}, Li41;->M(Ljava/lang/Object;)V

    .line 520
    .line 521
    .line 522
    invoke-static {v8}, Li41;->M(Ljava/lang/Object;)V

    .line 523
    .line 524
    .line 525
    new-instance v1, Lby2;

    .line 526
    .line 527
    invoke-direct {v1, v4, v8, v0}, Lby2;-><init>(Landroid/content/Context;Le51;Lz71;)V

    .line 528
    .line 529
    .line 530
    new-instance v0, Lbs2;

    .line 531
    .line 532
    const/16 v2, 0xa

    .line 533
    .line 534
    invoke-direct {v0, v2, v1}, Lbs2;-><init>(ILjava/lang/Object;)V

    .line 535
    .line 536
    .line 537
    invoke-virtual {v5, v0}, Lld2;->execute(Ljava/lang/Runnable;)V

    .line 538
    .line 539
    .line 540
    :goto_8
    return-void

    .line 541
    :pswitch_15
    iget-object v0, p0, Lbs2;->g:Ljava/lang/Object;

    .line 542
    .line 543
    check-cast v0, Lay2;

    .line 544
    .line 545
    invoke-virtual {v0}, Lfy2;->a()V

    .line 546
    .line 547
    .line 548
    return-void

    .line 549
    :pswitch_16
    iget-object v0, p0, Lbs2;->g:Ljava/lang/Object;

    .line 550
    .line 551
    check-cast v0, Lay2;

    .line 552
    .line 553
    invoke-virtual {v0}, Lfy2;->a()V

    .line 554
    .line 555
    .line 556
    return-void

    .line 557
    :pswitch_17
    iget-object v0, p0, Lbs2;->g:Ljava/lang/Object;

    .line 558
    .line 559
    check-cast v0, Lgx2;

    .line 560
    .line 561
    iget-object v2, v0, Lgx2;->d:Ljava/util/concurrent/atomic/AtomicReference;

    .line 562
    .line 563
    monitor-enter v2

    .line 564
    :try_start_5
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 565
    .line 566
    .line 567
    move-result-object v1

    .line 568
    check-cast v1, Ljava/lang/String;

    .line 569
    .line 570
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    .line 571
    .line 572
    .line 573
    move-result v1

    .line 574
    if-nez v1, :cond_b

    .line 575
    .line 576
    monitor-exit v2

    .line 577
    goto :goto_9

    .line 578
    :catchall_1
    move-exception v0

    .line 579
    goto :goto_a

    .line 580
    :cond_b
    invoke-virtual {v0}, Lgx2;->b()Ljava/lang/String;

    .line 581
    .line 582
    .line 583
    move-result-object v0

    .line 584
    invoke-virtual {v2, v0}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 585
    .line 586
    .line 587
    monitor-exit v2

    .line 588
    :goto_9
    return-void

    .line 589
    :goto_a
    monitor-exit v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 590
    throw v0

    .line 591
    :pswitch_18
    iget-object v0, p0, Lbs2;->g:Ljava/lang/Object;

    .line 592
    .line 593
    check-cast v0, Lsx2;

    .line 594
    .line 595
    iget-object v2, v0, Lsx2;->a:Ljava/lang/ref/WeakReference;

    .line 596
    .line 597
    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 598
    .line 599
    .line 600
    move-result-object v2

    .line 601
    check-cast v2, Lwj4;

    .line 602
    .line 603
    if-eqz v2, :cond_12

    .line 604
    .line 605
    iget-object v0, v0, Lsx2;->c:Lvy2;

    .line 606
    .line 607
    invoke-virtual {v0}, Lvy2;->b()I

    .line 608
    .line 609
    .line 610
    move-result v0

    .line 611
    iget-object v7, v2, Lwj4;->a:Lxj4;

    .line 612
    .line 613
    monitor-enter v7

    .line 614
    :try_start_6
    iget v2, v7, Lxj4;->q:I

    .line 615
    .line 616
    if-ne v2, v0, :cond_c

    .line 617
    .line 618
    iget-object v2, v7, Lxj4;->r:Ljava/lang/String;

    .line 619
    .line 620
    if-nez v2, :cond_11

    .line 621
    .line 622
    goto :goto_b

    .line 623
    :catchall_2
    move-exception v0

    .line 624
    goto/16 :goto_f

    .line 625
    .line 626
    :cond_c
    :goto_b
    iput v0, v7, Lxj4;->q:I

    .line 627
    .line 628
    if-eq v0, v6, :cond_11

    .line 629
    .line 630
    if-eqz v0, :cond_11

    .line 631
    .line 632
    const/16 v2, 0x8

    .line 633
    .line 634
    if-ne v0, v2, :cond_d

    .line 635
    .line 636
    goto :goto_e

    .line 637
    :cond_d
    iget-object v2, v7, Lxj4;->r:Ljava/lang/String;

    .line 638
    .line 639
    if-nez v2, :cond_f

    .line 640
    .line 641
    iget-object v2, v7, Lxj4;->f:Landroid/content/Context;

    .line 642
    .line 643
    sget-object v3, Lv23;->a:Ljava/lang/String;

    .line 644
    .line 645
    if-eqz v2, :cond_e

    .line 646
    .line 647
    const-string v3, "phone"

    .line 648
    .line 649
    invoke-virtual {v2, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 650
    .line 651
    .line 652
    move-result-object v2

    .line 653
    check-cast v2, Landroid/telephony/TelephonyManager;

    .line 654
    .line 655
    if-eqz v2, :cond_e

    .line 656
    .line 657
    invoke-virtual {v2}, Landroid/telephony/TelephonyManager;->getNetworkCountryIso()Ljava/lang/String;

    .line 658
    .line 659
    .line 660
    move-result-object v2

    .line 661
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 662
    .line 663
    .line 664
    move-result v3

    .line 665
    if-nez v3, :cond_e

    .line 666
    .line 667
    invoke-static {v2}, Lum;->H(Ljava/lang/String;)Ljava/lang/String;

    .line 668
    .line 669
    .line 670
    move-result-object v2

    .line 671
    goto :goto_c

    .line 672
    :cond_e
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 673
    .line 674
    .line 675
    move-result-object v2

    .line 676
    invoke-virtual {v2}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    .line 677
    .line 678
    .line 679
    move-result-object v2

    .line 680
    invoke-static {v2}, Lum;->H(Ljava/lang/String;)Ljava/lang/String;

    .line 681
    .line 682
    .line 683
    move-result-object v2

    .line 684
    :goto_c
    iput-object v2, v7, Lxj4;->r:Ljava/lang/String;

    .line 685
    .line 686
    :cond_f
    invoke-virtual {v7, v0}, Lxj4;->b(I)J

    .line 687
    .line 688
    .line 689
    move-result-wide v2

    .line 690
    iput-wide v2, v7, Lxj4;->o:J

    .line 691
    .line 692
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 693
    .line 694
    .line 695
    move-result-wide v2

    .line 696
    iget v0, v7, Lxj4;->j:I

    .line 697
    .line 698
    if-lez v0, :cond_10

    .line 699
    .line 700
    iget-wide v5, v7, Lxj4;->k:J

    .line 701
    .line 702
    sub-long v5, v2, v5

    .line 703
    .line 704
    long-to-int v0, v5

    .line 705
    move v8, v0

    .line 706
    goto :goto_d

    .line 707
    :cond_10
    move v8, v4

    .line 708
    :goto_d
    iget-wide v9, v7, Lxj4;->l:J

    .line 709
    .line 710
    iget-wide v11, v7, Lxj4;->o:J

    .line 711
    .line 712
    invoke-virtual/range {v7 .. v12}, Lxj4;->a(IJJ)V

    .line 713
    .line 714
    .line 715
    iput-wide v2, v7, Lxj4;->k:J

    .line 716
    .line 717
    const-wide/16 v2, 0x0

    .line 718
    .line 719
    iput-wide v2, v7, Lxj4;->l:J

    .line 720
    .line 721
    iput-wide v2, v7, Lxj4;->n:J

    .line 722
    .line 723
    iput-wide v2, v7, Lxj4;->m:J

    .line 724
    .line 725
    iget-object v0, v7, Lxj4;->i:Lt90;

    .line 726
    .line 727
    iget-object v2, v0, Lt90;->f:Ljava/lang/Object;

    .line 728
    .line 729
    check-cast v2, Ljava/util/ArrayList;

    .line 730
    .line 731
    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    .line 732
    .line 733
    .line 734
    iput v1, v0, Lt90;->b:I

    .line 735
    .line 736
    iput v4, v0, Lt90;->c:I

    .line 737
    .line 738
    iput v4, v0, Lt90;->d:I
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 739
    .line 740
    monitor-exit v7

    .line 741
    goto :goto_10

    .line 742
    :cond_11
    :goto_e
    monitor-exit v7

    .line 743
    goto :goto_10

    .line 744
    :goto_f
    :try_start_7
    monitor-exit v7
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 745
    throw v0

    .line 746
    :cond_12
    :goto_10
    return-void

    .line 747
    :pswitch_19
    iget-object v0, p0, Lbs2;->g:Ljava/lang/Object;

    .line 748
    .line 749
    check-cast v0, Lax2;

    .line 750
    .line 751
    iget-object v1, v0, Lax2;->i:Lag2;

    .line 752
    .line 753
    iget-object v2, v0, Lax2;->h:Lzw2;

    .line 754
    .line 755
    monitor-enter v2

    .line 756
    :try_start_8
    new-instance v4, Lorg/json/JSONObject;

    .line 757
    .line 758
    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 759
    .line 760
    .line 761
    const-string v0, "Server data: "

    .line 762
    .line 763
    const-string v5, "afma-sdk-a-v"
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    .line 764
    .line 765
    :try_start_9
    const-string v6, "platform"

    .line 766
    .line 767
    const-string v7, "ANDROID"

    .line 768
    .line 769
    invoke-virtual {v4, v6, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 770
    .line 771
    .line 772
    iget-object v6, v2, Lzw2;->k:Ljava/lang/String;

    .line 773
    .line 774
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 775
    .line 776
    .line 777
    move-result v7

    .line 778
    if-nez v7, :cond_13

    .line 779
    .line 780
    const-string v7, "sdkVersion"

    .line 781
    .line 782
    invoke-static {v6}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 783
    .line 784
    .line 785
    move-result-object v8

    .line 786
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 787
    .line 788
    .line 789
    move-result v8

    .line 790
    add-int/lit8 v8, v8, 0xc

    .line 791
    .line 792
    new-instance v9, Ljava/lang/StringBuilder;

    .line 793
    .line 794
    invoke-direct {v9, v8}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 795
    .line 796
    .line 797
    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 798
    .line 799
    .line 800
    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 801
    .line 802
    .line 803
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 804
    .line 805
    .line 806
    move-result-object v5

    .line 807
    invoke-virtual {v4, v7, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 808
    .line 809
    .line 810
    goto :goto_11

    .line 811
    :catchall_3
    move-exception v0

    .line 812
    goto/16 :goto_14

    .line 813
    .line 814
    :catch_4
    move-exception v0

    .line 815
    goto/16 :goto_12

    .line 816
    .line 817
    :cond_13
    :goto_11
    const-string v5, "internalSdkVersion"

    .line 818
    .line 819
    iget-object v6, v2, Lzw2;->i:Ljava/lang/String;

    .line 820
    .line 821
    invoke-virtual {v4, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 822
    .line 823
    .line 824
    const-string v5, "osVersion"

    .line 825
    .line 826
    sget-object v6, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    .line 827
    .line 828
    invoke-virtual {v4, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 829
    .line 830
    .line 831
    const-string v5, "adapters"

    .line 832
    .line 833
    iget-object v6, v2, Lzw2;->d:Lvw2;

    .line 834
    .line 835
    invoke-virtual {v6}, Lvw2;->a()Lorg/json/JSONArray;

    .line 836
    .line 837
    .line 838
    move-result-object v6

    .line 839
    invoke-virtual {v4, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 840
    .line 841
    .line 842
    sget-object v5, Lmz1;->ja:Liz1;

    .line 843
    .line 844
    sget-object v6, Ltw1;->e:Ltw1;

    .line 845
    .line 846
    iget-object v7, v6, Ltw1;->c:Lkz1;

    .line 847
    .line 848
    invoke-virtual {v7, v5}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 849
    .line 850
    .line 851
    move-result-object v5

    .line 852
    check-cast v5, Ljava/lang/Boolean;

    .line 853
    .line 854
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 855
    .line 856
    .line 857
    move-result v5

    .line 858
    if-eqz v5, :cond_14

    .line 859
    .line 860
    sget-object v5, Lhg4;->C:Lhg4;

    .line 861
    .line 862
    iget-object v5, v5, Lhg4;->h:Lgd2;

    .line 863
    .line 864
    iget-object v5, v5, Lgd2;->g:Ljava/lang/String;

    .line 865
    .line 866
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 867
    .line 868
    .line 869
    move-result v7

    .line 870
    if-nez v7, :cond_14

    .line 871
    .line 872
    const-string v7, "plugin"

    .line 873
    .line 874
    invoke-virtual {v4, v7, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 875
    .line 876
    .line 877
    :cond_14
    iget-wide v7, v2, Lzw2;->q:J

    .line 878
    .line 879
    sget-object v5, Lhg4;->C:Lhg4;

    .line 880
    .line 881
    iget-object v9, v5, Lhg4;->k:Lym;

    .line 882
    .line 883
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 884
    .line 885
    .line 886
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 887
    .line 888
    .line 889
    move-result-wide v9

    .line 890
    const-wide/16 v11, 0x3e8

    .line 891
    .line 892
    div-long/2addr v9, v11

    .line 893
    cmp-long v7, v7, v9

    .line 894
    .line 895
    if-gez v7, :cond_15

    .line 896
    .line 897
    const-string v7, "{}"

    .line 898
    .line 899
    iput-object v7, v2, Lzw2;->o:Ljava/lang/String;

    .line 900
    .line 901
    :cond_15
    const-string v7, "networkExtras"

    .line 902
    .line 903
    iget-object v8, v2, Lzw2;->o:Ljava/lang/String;

    .line 904
    .line 905
    invoke-virtual {v4, v7, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 906
    .line 907
    .line 908
    const-string v7, "adSlots"

    .line 909
    .line 910
    invoke-virtual {v2}, Lzw2;->i()Lorg/json/JSONObject;

    .line 911
    .line 912
    .line 913
    move-result-object v8

    .line 914
    invoke-virtual {v4, v7, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 915
    .line 916
    .line 917
    const-string v7, "appInfo"

    .line 918
    .line 919
    iget-object v8, v2, Lzw2;->e:Lz20;

    .line 920
    .line 921
    invoke-virtual {v8}, Lz20;->b()Lorg/json/JSONObject;

    .line 922
    .line 923
    .line 924
    move-result-object v8

    .line 925
    invoke-virtual {v4, v7, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 926
    .line 927
    .line 928
    iget-object v7, v5, Lhg4;->h:Lgd2;

    .line 929
    .line 930
    invoke-virtual {v7}, Lgd2;->g()Lra4;

    .line 931
    .line 932
    .line 933
    move-result-object v7

    .line 934
    invoke-virtual {v7}, Lra4;->m()Led2;

    .line 935
    .line 936
    .line 937
    move-result-object v7

    .line 938
    iget-object v7, v7, Led2;->e:Ljava/lang/String;

    .line 939
    .line 940
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 941
    .line 942
    .line 943
    move-result v8

    .line 944
    if-nez v8, :cond_16

    .line 945
    .line 946
    const-string v8, "cld"

    .line 947
    .line 948
    new-instance v9, Lorg/json/JSONObject;

    .line 949
    .line 950
    invoke-direct {v9, v7}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 951
    .line 952
    .line 953
    invoke-virtual {v4, v8, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 954
    .line 955
    .line 956
    :cond_16
    sget-object v7, Lmz1;->Y9:Liz1;

    .line 957
    .line 958
    iget-object v8, v6, Ltw1;->c:Lkz1;

    .line 959
    .line 960
    invoke-virtual {v8, v7}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 961
    .line 962
    .line 963
    move-result-object v7

    .line 964
    check-cast v7, Ljava/lang/Boolean;

    .line 965
    .line 966
    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    .line 967
    .line 968
    .line 969
    move-result v7

    .line 970
    if-eqz v7, :cond_17

    .line 971
    .line 972
    iget-object v7, v2, Lzw2;->p:Lorg/json/JSONObject;

    .line 973
    .line 974
    if-eqz v7, :cond_17

    .line 975
    .line 976
    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 977
    .line 978
    .line 979
    move-result-object v7

    .line 980
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 981
    .line 982
    .line 983
    move-result v8

    .line 984
    add-int/lit8 v8, v8, 0xd

    .line 985
    .line 986
    new-instance v9, Ljava/lang/StringBuilder;

    .line 987
    .line 988
    invoke-direct {v9, v8}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 989
    .line 990
    .line 991
    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 992
    .line 993
    .line 994
    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 995
    .line 996
    .line 997
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 998
    .line 999
    .line 1000
    move-result-object v0

    .line 1001
    invoke-static {v0}, Lgi2;->U(Ljava/lang/String;)V

    .line 1002
    .line 1003
    .line 1004
    const-string v0, "serverData"

    .line 1005
    .line 1006
    iget-object v7, v2, Lzw2;->p:Lorg/json/JSONObject;

    .line 1007
    .line 1008
    invoke-virtual {v4, v0, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1009
    .line 1010
    .line 1011
    :cond_17
    sget-object v0, Lmz1;->X9:Liz1;

    .line 1012
    .line 1013
    iget-object v7, v6, Ltw1;->c:Lkz1;

    .line 1014
    .line 1015
    invoke-virtual {v7, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 1016
    .line 1017
    .line 1018
    move-result-object v0

    .line 1019
    check-cast v0, Ljava/lang/Boolean;

    .line 1020
    .line 1021
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1022
    .line 1023
    .line 1024
    move-result v0

    .line 1025
    if-eqz v0, :cond_18

    .line 1026
    .line 1027
    const-string v0, "openAction"

    .line 1028
    .line 1029
    iget-object v7, v2, Lzw2;->v:Lyw2;

    .line 1030
    .line 1031
    invoke-virtual {v4, v0, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1032
    .line 1033
    .line 1034
    const-string v0, "gesture"

    .line 1035
    .line 1036
    iget-object v7, v2, Lzw2;->r:Lww2;

    .line 1037
    .line 1038
    invoke-virtual {v4, v0, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1039
    .line 1040
    .line 1041
    :cond_18
    const-string v0, "isGamRegisteredTestDevice"

    .line 1042
    .line 1043
    iget-object v5, v5, Lhg4;->o:Lus1;

    .line 1044
    .line 1045
    invoke-virtual {v5}, Lus1;->g()Z

    .line 1046
    .line 1047
    .line 1048
    move-result v5

    .line 1049
    invoke-virtual {v4, v0, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 1050
    .line 1051
    .line 1052
    const-string v0, "isSimulator"

    .line 1053
    .line 1054
    sget-object v5, Lsv1;->f:Lsv1;

    .line 1055
    .line 1056
    iget-object v5, v5, Lsv1;->a:Lj63;

    .line 1057
    .line 1058
    invoke-static {}, Lj63;->n()Z

    .line 1059
    .line 1060
    .line 1061
    move-result v5

    .line 1062
    invoke-virtual {v4, v0, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 1063
    .line 1064
    .line 1065
    sget-object v0, Lmz1;->la:Liz1;

    .line 1066
    .line 1067
    iget-object v5, v6, Ltw1;->c:Lkz1;

    .line 1068
    .line 1069
    invoke-virtual {v5, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 1070
    .line 1071
    .line 1072
    move-result-object v0

    .line 1073
    check-cast v0, Ljava/lang/Boolean;

    .line 1074
    .line 1075
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1076
    .line 1077
    .line 1078
    move-result v0

    .line 1079
    if-eqz v0, :cond_19

    .line 1080
    .line 1081
    const-string v0, "uiStorage"

    .line 1082
    .line 1083
    new-instance v5, Lorg/json/JSONObject;

    .line 1084
    .line 1085
    iget-object v7, v2, Lzw2;->x:Ljava/lang/String;

    .line 1086
    .line 1087
    invoke-direct {v5, v7}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 1088
    .line 1089
    .line 1090
    invoke-virtual {v4, v0, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1091
    .line 1092
    .line 1093
    :cond_19
    sget-object v0, Lmz1;->na:Liz1;

    .line 1094
    .line 1095
    iget-object v5, v6, Ltw1;->c:Lkz1;

    .line 1096
    .line 1097
    invoke-virtual {v5, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 1098
    .line 1099
    .line 1100
    move-result-object v0

    .line 1101
    check-cast v0, Ljava/lang/CharSequence;

    .line 1102
    .line 1103
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 1104
    .line 1105
    .line 1106
    move-result v0

    .line 1107
    if-nez v0, :cond_1a

    .line 1108
    .line 1109
    const-string v0, "gmaDisk"

    .line 1110
    .line 1111
    iget-object v5, v2, Lzw2;->h:Lm92;

    .line 1112
    .line 1113
    iget-object v5, v5, Lm92;->b:Ljava/lang/Object;

    .line 1114
    .line 1115
    check-cast v5, Lorg/json/JSONObject;

    .line 1116
    .line 1117
    invoke-virtual {v4, v0, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1118
    .line 1119
    .line 1120
    :cond_1a
    sget-object v0, Lmz1;->ma:Liz1;

    .line 1121
    .line 1122
    iget-object v5, v6, Ltw1;->c:Lkz1;

    .line 1123
    .line 1124
    invoke-virtual {v5, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 1125
    .line 1126
    .line 1127
    move-result-object v0

    .line 1128
    check-cast v0, Ljava/lang/CharSequence;

    .line 1129
    .line 1130
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 1131
    .line 1132
    .line 1133
    move-result v0

    .line 1134
    if-nez v0, :cond_1b

    .line 1135
    .line 1136
    const-string v0, "userDisk"

    .line 1137
    .line 1138
    iget-object v5, v2, Lzw2;->g:Lm92;

    .line 1139
    .line 1140
    iget-object v5, v5, Lm92;->b:Ljava/lang/Object;

    .line 1141
    .line 1142
    check-cast v5, Lorg/json/JSONObject;

    .line 1143
    .line 1144
    invoke-virtual {v4, v0, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_9
    .catch Lorg/json/JSONException; {:try_start_9 .. :try_end_9} :catch_4
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    .line 1145
    .line 1146
    .line 1147
    goto :goto_13

    .line 1148
    :goto_12
    :try_start_a
    const-string v5, "Inspector.toJson"

    .line 1149
    .line 1150
    sget-object v6, Lhg4;->C:Lhg4;

    .line 1151
    .line 1152
    iget-object v6, v6, Lhg4;->h:Lgd2;

    .line 1153
    .line 1154
    invoke-virtual {v6, v5, v0}, Lgd2;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1155
    .line 1156
    .line 1157
    invoke-static {v3}, Lgi2;->q0(I)Z
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_3

    .line 1158
    .line 1159
    .line 1160
    :cond_1b
    :goto_13
    monitor-exit v2

    .line 1161
    invoke-virtual {v4}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 1162
    .line 1163
    .line 1164
    move-result-object v0

    .line 1165
    const-string v2, "window.inspectorInfo"

    .line 1166
    .line 1167
    invoke-interface {v1, v2, v0}, Lr52;->s(Ljava/lang/String;Ljava/lang/String;)V

    .line 1168
    .line 1169
    .line 1170
    return-void

    .line 1171
    :goto_14
    :try_start_b
    monitor-exit v2
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_3

    .line 1172
    throw v0

    .line 1173
    :pswitch_1a
    sget-object v0, Lhg4;->C:Lhg4;

    .line 1174
    .line 1175
    iget-object v0, v0, Lhg4;->h:Lgd2;

    .line 1176
    .line 1177
    invoke-virtual {v0}, Lgd2;->g()Lra4;

    .line 1178
    .line 1179
    .line 1180
    move-result-object v0

    .line 1181
    invoke-virtual {v0}, Lra4;->m()Led2;

    .line 1182
    .line 1183
    .line 1184
    move-result-object v0

    .line 1185
    iget-object v0, v0, Led2;->e:Ljava/lang/String;

    .line 1186
    .line 1187
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 1188
    .line 1189
    .line 1190
    move-result v1

    .line 1191
    iget-object v2, p0, Lbs2;->g:Ljava/lang/Object;

    .line 1192
    .line 1193
    check-cast v2, Lpd2;

    .line 1194
    .line 1195
    if-nez v1, :cond_1c

    .line 1196
    .line 1197
    invoke-virtual {v2, v0}, Lpd2;->a(Ljava/lang/Object;)Z

    .line 1198
    .line 1199
    .line 1200
    goto :goto_15

    .line 1201
    :cond_1c
    new-instance v0, Ljava/lang/Exception;

    .line 1202
    .line 1203
    invoke-direct {v0}, Ljava/lang/Exception;-><init>()V

    .line 1204
    .line 1205
    .line 1206
    invoke-virtual {v2, v0}, Lpd2;->b(Ljava/lang/Throwable;)V

    .line 1207
    .line 1208
    .line 1209
    :goto_15
    return-void

    .line 1210
    :pswitch_1b
    iget-object v0, p0, Lbs2;->g:Ljava/lang/Object;

    .line 1211
    .line 1212
    check-cast v0, Lpt2;

    .line 1213
    .line 1214
    :try_start_c
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1215
    .line 1216
    .line 1217
    const-string v1, "#008 Must be called on the main UI thread."

    .line 1218
    .line 1219
    invoke-static {v1}, Lou1;->h(Ljava/lang/String;)V

    .line 1220
    .line 1221
    .line 1222
    invoke-virtual {v0}, Lpt2;->C3()V

    .line 1223
    .line 1224
    .line 1225
    iget-object v1, v0, Lpt2;->h:Lpr2;

    .line 1226
    .line 1227
    if-eqz v1, :cond_1d

    .line 1228
    .line 1229
    invoke-virtual {v1}, Lpr2;->o()V

    .line 1230
    .line 1231
    .line 1232
    :cond_1d
    iput-object v5, v0, Lpt2;->h:Lpr2;

    .line 1233
    .line 1234
    iput-object v5, v0, Lpt2;->f:Landroid/view/View;

    .line 1235
    .line 1236
    iput-object v5, v0, Lpt2;->g:Lpy2;

    .line 1237
    .line 1238
    iput-boolean v6, v0, Lpt2;->i:Z
    :try_end_c
    .catch Landroid/os/RemoteException; {:try_start_c .. :try_end_c} :catch_5

    .line 1239
    .line 1240
    goto :goto_16

    .line 1241
    :catch_5
    move-exception v0

    .line 1242
    const-string v1, "#007 Could not call remote method."

    .line 1243
    .line 1244
    invoke-static {v1, v0}, Lgi2;->p0(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 1245
    .line 1246
    .line 1247
    :goto_16
    return-void

    .line 1248
    :pswitch_1c
    iget-object v0, p0, Lbs2;->g:Ljava/lang/Object;

    .line 1249
    .line 1250
    check-cast v0, Lcs2;

    .line 1251
    .line 1252
    iget-object v2, v0, Lcs2;->l:Landroid/view/View;

    .line 1253
    .line 1254
    if-nez v2, :cond_1e

    .line 1255
    .line 1256
    new-instance v2, Landroid/view/View;

    .line 1257
    .line 1258
    iget-object v3, v0, Lcs2;->i:Landroid/widget/FrameLayout;

    .line 1259
    .line 1260
    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1261
    .line 1262
    .line 1263
    move-result-object v3

    .line 1264
    invoke-direct {v2, v3}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 1265
    .line 1266
    .line 1267
    iput-object v2, v0, Lcs2;->l:Landroid/view/View;

    .line 1268
    .line 1269
    new-instance v3, Landroid/widget/FrameLayout$LayoutParams;

    .line 1270
    .line 1271
    invoke-direct {v3, v1, v4}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 1272
    .line 1273
    .line 1274
    invoke-virtual {v2, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1275
    .line 1276
    .line 1277
    :cond_1e
    iget-object v1, v0, Lcs2;->i:Landroid/widget/FrameLayout;

    .line 1278
    .line 1279
    iget-object v2, v0, Lcs2;->l:Landroid/view/View;

    .line 1280
    .line 1281
    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 1282
    .line 1283
    .line 1284
    move-result-object v2

    .line 1285
    if-eq v1, v2, :cond_1f

    .line 1286
    .line 1287
    iget-object v1, v0, Lcs2;->i:Landroid/widget/FrameLayout;

    .line 1288
    .line 1289
    iget-object v0, v0, Lcs2;->l:Landroid/view/View;

    .line 1290
    .line 1291
    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1292
    .line 1293
    .line 1294
    :cond_1f
    return-void

    .line 1295
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
