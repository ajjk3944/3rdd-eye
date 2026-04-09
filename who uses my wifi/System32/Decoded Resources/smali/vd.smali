.class public final Lvd;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic f:I

.field public final synthetic g:Ljava/lang/Object;

.field public final synthetic h:Ljava/lang/Object;

.field public final synthetic i:Ljava/lang/Object;

.field public final synthetic j:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p5, p0, Lvd;->f:I

    iput-object p1, p0, Lvd;->j:Ljava/lang/Object;

    iput-object p2, p0, Lvd;->g:Ljava/lang/Object;

    iput-object p3, p0, Lvd;->h:Ljava/lang/Object;

    iput-object p4, p0, Lvd;->i:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IZ)V
    .locals 0

    .line 2
    iput p5, p0, Lvd;->f:I

    iput-object p1, p0, Lvd;->g:Ljava/lang/Object;

    iput-object p2, p0, Lvd;->h:Ljava/lang/Object;

    iput-object p3, p0, Lvd;->i:Ljava/lang/Object;

    iput-object p4, p0, Lvd;->j:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 13

    .line 1
    iget v0, p0, Lvd;->f:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, -0x1

    .line 5
    const/4 v3, 0x1

    .line 6
    const/4 v4, 0x0

    .line 7
    const/4 v5, 0x0

    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lvd;->g:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Loh4;

    .line 14
    .line 15
    iget-object v1, p0, Lvd;->h:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v1, Ljv2;

    .line 18
    .line 19
    iget-object v2, p0, Lvd;->i:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v2, Ljava/util/ArrayDeque;

    .line 22
    .line 23
    iget-object v3, p0, Lvd;->j:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v3, Ljava/util/ArrayDeque;

    .line 26
    .line 27
    const-string v4, "to"

    .line 28
    .line 29
    invoke-virtual {v0, v1, v2, v4}, Loh4;->e(Ljv2;Ljava/util/ArrayDeque;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    const-string v2, "of"

    .line 33
    .line 34
    invoke-virtual {v0, v1, v3, v2}, Loh4;->e(Ljv2;Ljava/util/ArrayDeque;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :pswitch_0
    iget-object v0, p0, Lvd;->g:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v0, Landroid/media/AudioTrack;

    .line 41
    .line 42
    iget-object v1, p0, Lvd;->h:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v1, Lbi3;

    .line 45
    .line 46
    iget-object v6, p0, Lvd;->i:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v6, Landroid/os/Handler;

    .line 49
    .line 50
    iget-object v7, p0, Lvd;->j:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v7, Lle4;

    .line 53
    .line 54
    :try_start_0
    invoke-virtual {v0}, Landroid/media/AudioTrack;->flush()V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0}, Landroid/media/AudioTrack;->release()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 58
    .line 59
    .line 60
    if-eqz v1, :cond_0

    .line 61
    .line 62
    invoke-virtual {v6}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    invoke-virtual {v0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-virtual {v0}, Ljava/lang/Thread;->isAlive()Z

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    if-eqz v0, :cond_0

    .line 75
    .line 76
    new-instance v0, Lte4;

    .line 77
    .line 78
    invoke-direct {v0, v1, v7, v4}, Lte4;-><init>(Lbi3;Lle4;I)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v6, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 82
    .line 83
    .line 84
    :cond_0
    sget-object v4, Ldf4;->f0:Ljava/lang/Object;

    .line 85
    .line 86
    monitor-enter v4

    .line 87
    :try_start_1
    sget v0, Ldf4;->h0:I

    .line 88
    .line 89
    add-int/2addr v0, v2

    .line 90
    sput v0, Ldf4;->h0:I

    .line 91
    .line 92
    if-nez v0, :cond_1

    .line 93
    .line 94
    sget-object v0, Ldf4;->g0:Ljava/util/concurrent/ScheduledExecutorService;

    .line 95
    .line 96
    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 97
    .line 98
    .line 99
    sput-object v5, Ldf4;->g0:Ljava/util/concurrent/ScheduledExecutorService;

    .line 100
    .line 101
    goto :goto_0

    .line 102
    :catchall_0
    move-exception v0

    .line 103
    goto :goto_1

    .line 104
    :cond_1
    :goto_0
    monitor-exit v4

    .line 105
    return-void

    .line 106
    :goto_1
    monitor-exit v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 107
    throw v0

    .line 108
    :catchall_1
    move-exception v0

    .line 109
    if-eqz v1, :cond_2

    .line 110
    .line 111
    invoke-virtual {v6}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 112
    .line 113
    .line 114
    move-result-object v4

    .line 115
    invoke-virtual {v4}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 116
    .line 117
    .line 118
    move-result-object v4

    .line 119
    invoke-virtual {v4}, Ljava/lang/Thread;->isAlive()Z

    .line 120
    .line 121
    .line 122
    move-result v4

    .line 123
    if-eqz v4, :cond_2

    .line 124
    .line 125
    new-instance v4, Lte4;

    .line 126
    .line 127
    invoke-direct {v4, v1, v7, v3}, Lte4;-><init>(Lbi3;Lle4;I)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {v6, v4}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 131
    .line 132
    .line 133
    :cond_2
    sget-object v1, Ldf4;->f0:Ljava/lang/Object;

    .line 134
    .line 135
    monitor-enter v1

    .line 136
    :try_start_2
    sget v3, Ldf4;->h0:I

    .line 137
    .line 138
    add-int/2addr v3, v2

    .line 139
    sput v3, Ldf4;->h0:I

    .line 140
    .line 141
    if-nez v3, :cond_3

    .line 142
    .line 143
    sget-object v2, Ldf4;->g0:Ljava/util/concurrent/ScheduledExecutorService;

    .line 144
    .line 145
    invoke-interface {v2}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 146
    .line 147
    .line 148
    sput-object v5, Ldf4;->g0:Ljava/util/concurrent/ScheduledExecutorService;

    .line 149
    .line 150
    goto :goto_2

    .line 151
    :catchall_2
    move-exception v0

    .line 152
    goto :goto_3

    .line 153
    :cond_3
    :goto_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 154
    throw v0

    .line 155
    :goto_3
    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 156
    throw v0

    .line 157
    :pswitch_1
    iget-object v0, p0, Lvd;->j:Ljava/lang/Object;

    .line 158
    .line 159
    check-cast v0, Lbx2;

    .line 160
    .line 161
    iget-object v1, p0, Lvd;->i:Ljava/lang/Object;

    .line 162
    .line 163
    check-cast v1, Lb3;

    .line 164
    .line 165
    iget-object v2, p0, Lvd;->g:Ljava/lang/Object;

    .line 166
    .line 167
    check-cast v2, Landroid/content/Context;

    .line 168
    .line 169
    iget-object v3, p0, Lvd;->h:Ljava/lang/Object;

    .line 170
    .line 171
    check-cast v3, Ljava/lang/String;

    .line 172
    .line 173
    :try_start_4
    new-instance v4, Lhb2;

    .line 174
    .line 175
    invoke-direct {v4, v2, v3}, Lhb2;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 176
    .line 177
    .line 178
    iget-object v1, v1, Lb3;->a:Le13;

    .line 179
    .line 180
    invoke-virtual {v4, v1, v0}, Lhb2;->b(Le13;Lbx2;)V
    :try_end_4
    .catch Ljava/lang/IllegalStateException; {:try_start_4 .. :try_end_4} :catch_0

    .line 181
    .line 182
    .line 183
    goto :goto_4

    .line 184
    :catch_0
    move-exception v0

    .line 185
    invoke-static {v2}, Lr92;->a(Landroid/content/Context;)Ls92;

    .line 186
    .line 187
    .line 188
    move-result-object v1

    .line 189
    const-string v2, "RewardedAd.load"

    .line 190
    .line 191
    invoke-interface {v1, v2, v0}, Ls92;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 192
    .line 193
    .line 194
    :goto_4
    return-void

    .line 195
    :pswitch_2
    iget-object v0, p0, Lvd;->j:Ljava/lang/Object;

    .line 196
    .line 197
    move-object v4, v0

    .line 198
    check-cast v4, Lyw1;

    .line 199
    .line 200
    iget-object v0, p0, Lvd;->h:Ljava/lang/Object;

    .line 201
    .line 202
    check-cast v0, Lvw1;

    .line 203
    .line 204
    iget-object v5, p0, Lvd;->g:Ljava/lang/Object;

    .line 205
    .line 206
    check-cast v5, Lxb4;

    .line 207
    .line 208
    :try_start_5
    invoke-virtual {v0}, Lw9;->t()Landroid/os/IInterface;

    .line 209
    .line 210
    .line 211
    move-result-object v6

    .line 212
    check-cast v6, Lxw1;

    .line 213
    .line 214
    invoke-virtual {v0}, Lvw1;->z()Z

    .line 215
    .line 216
    .line 217
    move-result v0
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_2
    .catch Landroid/os/RemoteException; {:try_start_5 .. :try_end_5} :catch_1

    .line 218
    iget-object v7, p0, Lvd;->i:Ljava/lang/Object;

    .line 219
    .line 220
    check-cast v7, Lww1;

    .line 221
    .line 222
    if-eqz v0, :cond_4

    .line 223
    .line 224
    :try_start_6
    invoke-virtual {v6}, Lsb1;->U()Landroid/os/Parcel;

    .line 225
    .line 226
    .line 227
    move-result-object v0

    .line 228
    invoke-static {v0, v7}, Liv1;->c(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    .line 229
    .line 230
    .line 231
    invoke-virtual {v6, v0, v1}, Lsb1;->Y(Landroid/os/Parcel;I)Landroid/os/Parcel;

    .line 232
    .line 233
    .line 234
    move-result-object v0

    .line 235
    sget-object v1, Luw1;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 236
    .line 237
    invoke-static {v0, v1}, Liv1;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 238
    .line 239
    .line 240
    move-result-object v1

    .line 241
    check-cast v1, Luw1;

    .line 242
    .line 243
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 244
    .line 245
    .line 246
    goto :goto_5

    .line 247
    :cond_4
    invoke-virtual {v6}, Lsb1;->U()Landroid/os/Parcel;

    .line 248
    .line 249
    .line 250
    move-result-object v0

    .line 251
    invoke-static {v0, v7}, Liv1;->c(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    .line 252
    .line 253
    .line 254
    invoke-virtual {v6, v0, v3}, Lsb1;->Y(Landroid/os/Parcel;I)Landroid/os/Parcel;

    .line 255
    .line 256
    .line 257
    move-result-object v0

    .line 258
    sget-object v1, Luw1;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 259
    .line 260
    invoke-static {v0, v1}, Liv1;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 261
    .line 262
    .line 263
    move-result-object v1

    .line 264
    check-cast v1, Luw1;

    .line 265
    .line 266
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 267
    .line 268
    .line 269
    :goto_5
    invoke-virtual {v1}, Luw1;->a()Z

    .line 270
    .line 271
    .line 272
    move-result v0

    .line 273
    if-nez v0, :cond_5

    .line 274
    .line 275
    new-instance v0, Ljava/lang/RuntimeException;

    .line 276
    .line 277
    const-string v1, "No entry contents."

    .line 278
    .line 279
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 280
    .line 281
    .line 282
    invoke-virtual {v4, v0}, Lpd2;->b(Ljava/lang/Throwable;)V

    .line 283
    .line 284
    .line 285
    iget-object v0, v5, Lxb4;->i:Ljava/lang/Object;

    .line 286
    .line 287
    check-cast v0, Lwy0;

    .line 288
    .line 289
    invoke-virtual {v0}, Lwy0;->d()V

    .line 290
    .line 291
    .line 292
    goto :goto_7

    .line 293
    :catch_1
    move-exception v0

    .line 294
    goto :goto_6

    .line 295
    :catch_2
    move-exception v0

    .line 296
    goto :goto_6

    .line 297
    :cond_5
    new-instance v7, Lzw1;

    .line 298
    .line 299
    invoke-virtual {v1}, Luw1;->b()Landroid/os/ParcelFileDescriptor$AutoCloseInputStream;

    .line 300
    .line 301
    .line 302
    move-result-object v0

    .line 303
    invoke-direct {v7, v5, v0}, Lzw1;-><init>(Lxb4;Landroid/os/ParcelFileDescriptor$AutoCloseInputStream;)V

    .line 304
    .line 305
    .line 306
    invoke-virtual {v7}, Ljava/io/PushbackInputStream;->read()I

    .line 307
    .line 308
    .line 309
    move-result v0

    .line 310
    if-eq v0, v2, :cond_6

    .line 311
    .line 312
    invoke-virtual {v7, v0}, Ljava/io/PushbackInputStream;->unread(I)V

    .line 313
    .line 314
    .line 315
    monitor-enter v1
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_2
    .catch Landroid/os/RemoteException; {:try_start_6 .. :try_end_6} :catch_1

    .line 316
    :try_start_7
    iget-boolean v8, v1, Luw1;->g:Z
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    .line 317
    .line 318
    :try_start_8
    monitor-exit v1

    .line 319
    invoke-virtual {v1}, Luw1;->d()Z

    .line 320
    .line 321
    .line 322
    move-result v9

    .line 323
    monitor-enter v1
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_2
    .catch Landroid/os/RemoteException; {:try_start_8 .. :try_end_8} :catch_1

    .line 324
    :try_start_9
    iget-wide v10, v1, Luw1;->i:J
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    .line 325
    .line 326
    :try_start_a
    monitor-exit v1

    .line 327
    invoke-virtual {v1}, Luw1;->c()Z

    .line 328
    .line 329
    .line 330
    move-result v12

    .line 331
    new-instance v6, Lax1;

    .line 332
    .line 333
    invoke-direct/range {v6 .. v12}, Lax1;-><init>(Lzw1;ZZJZ)V

    .line 334
    .line 335
    .line 336
    invoke-virtual {v4, v6}, Lpd2;->a(Ljava/lang/Object;)Z
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_2
    .catch Landroid/os/RemoteException; {:try_start_a .. :try_end_a} :catch_1

    .line 337
    .line 338
    .line 339
    goto :goto_7

    .line 340
    :catchall_3
    move-exception v0

    .line 341
    :try_start_b
    monitor-exit v1
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_3

    .line 342
    :try_start_c
    throw v0
    :try_end_c
    .catch Ljava/io/IOException; {:try_start_c .. :try_end_c} :catch_2
    .catch Landroid/os/RemoteException; {:try_start_c .. :try_end_c} :catch_1

    .line 343
    :catchall_4
    move-exception v0

    .line 344
    :try_start_d
    monitor-exit v1
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_4

    .line 345
    :try_start_e
    throw v0

    .line 346
    :cond_6
    new-instance v0, Ljava/io/IOException;

    .line 347
    .line 348
    const-string v1, "Unable to read from cache."

    .line 349
    .line 350
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 351
    .line 352
    .line 353
    throw v0
    :try_end_e
    .catch Ljava/io/IOException; {:try_start_e .. :try_end_e} :catch_2
    .catch Landroid/os/RemoteException; {:try_start_e .. :try_end_e} :catch_1

    .line 354
    :goto_6
    const-string v1, "Unable to obtain a cache service instance."

    .line 355
    .line 356
    invoke-static {v1, v0}, Lgi2;->c0(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 357
    .line 358
    .line 359
    invoke-virtual {v4, v0}, Lpd2;->b(Ljava/lang/Throwable;)V

    .line 360
    .line 361
    .line 362
    iget-object v0, v5, Lxb4;->i:Ljava/lang/Object;

    .line 363
    .line 364
    check-cast v0, Lwy0;

    .line 365
    .line 366
    invoke-virtual {v0}, Lwy0;->d()V

    .line 367
    .line 368
    .line 369
    :goto_7
    return-void

    .line 370
    :pswitch_3
    iget-object v0, p0, Lvd;->j:Ljava/lang/Object;

    .line 371
    .line 372
    check-cast v0, Lbx2;

    .line 373
    .line 374
    iget-object v1, p0, Lvd;->i:Ljava/lang/Object;

    .line 375
    .line 376
    check-cast v1, Lb3;

    .line 377
    .line 378
    iget-object v2, p0, Lvd;->g:Ljava/lang/Object;

    .line 379
    .line 380
    check-cast v2, Landroid/content/Context;

    .line 381
    .line 382
    iget-object v3, p0, Lvd;->h:Ljava/lang/Object;

    .line 383
    .line 384
    check-cast v3, Ljava/lang/String;

    .line 385
    .line 386
    :try_start_f
    new-instance v4, Lpb2;

    .line 387
    .line 388
    invoke-direct {v4, v2, v3}, Lpb2;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 389
    .line 390
    .line 391
    iget-object v1, v1, Lb3;->a:Le13;

    .line 392
    .line 393
    invoke-virtual {v4, v1, v0}, Lpb2;->b(Le13;Lbx2;)V
    :try_end_f
    .catch Ljava/lang/IllegalStateException; {:try_start_f .. :try_end_f} :catch_3

    .line 394
    .line 395
    .line 396
    goto :goto_8

    .line 397
    :catch_3
    move-exception v0

    .line 398
    invoke-static {v2}, Lr92;->a(Landroid/content/Context;)Ls92;

    .line 399
    .line 400
    .line 401
    move-result-object v1

    .line 402
    const-string v2, "RewardedInterstitialAd.load"

    .line 403
    .line 404
    invoke-interface {v1, v2, v0}, Ls92;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 405
    .line 406
    .line 407
    :goto_8
    return-void

    .line 408
    :pswitch_4
    iget-object v0, p0, Lvd;->j:Ljava/lang/Object;

    .line 409
    .line 410
    check-cast v0, Lbx2;

    .line 411
    .line 412
    iget-object v1, p0, Lvd;->i:Ljava/lang/Object;

    .line 413
    .line 414
    check-cast v1, Lb3;

    .line 415
    .line 416
    iget-object v2, p0, Lvd;->g:Ljava/lang/Object;

    .line 417
    .line 418
    check-cast v2, Landroid/content/Context;

    .line 419
    .line 420
    iget-object v3, p0, Lvd;->h:Ljava/lang/Object;

    .line 421
    .line 422
    check-cast v3, Ljava/lang/String;

    .line 423
    .line 424
    :try_start_10
    new-instance v4, Luk1;

    .line 425
    .line 426
    iget-object v1, v1, Lb3;->a:Le13;

    .line 427
    .line 428
    invoke-direct {v4, v2, v3, v1, v0}, Luk1;-><init>(Landroid/content/Context;Ljava/lang/String;Le13;Lbx2;)V

    .line 429
    .line 430
    .line 431
    invoke-virtual {v4}, Luk1;->i()V
    :try_end_10
    .catch Ljava/lang/IllegalStateException; {:try_start_10 .. :try_end_10} :catch_4

    .line 432
    .line 433
    .line 434
    goto :goto_9

    .line 435
    :catch_4
    move-exception v0

    .line 436
    invoke-static {v2}, Lr92;->a(Landroid/content/Context;)Ls92;

    .line 437
    .line 438
    .line 439
    move-result-object v1

    .line 440
    const-string v2, "AppOpenAd.load"

    .line 441
    .line 442
    invoke-interface {v1, v2, v0}, Ls92;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 443
    .line 444
    .line 445
    :goto_9
    return-void

    .line 446
    :pswitch_5
    iget-object v0, p0, Lvd;->g:Ljava/lang/Object;

    .line 447
    .line 448
    check-cast v0, Llu1;

    .line 449
    .line 450
    iget-object v1, p0, Lvd;->h:Ljava/lang/Object;

    .line 451
    .line 452
    check-cast v1, Ljava/lang/String;

    .line 453
    .line 454
    iget-object v2, p0, Lvd;->i:Ljava/lang/Object;

    .line 455
    .line 456
    check-cast v2, Lcr1;

    .line 457
    .line 458
    iget-object v3, p0, Lvd;->j:Ljava/lang/Object;

    .line 459
    .line 460
    check-cast v3, Lad2;

    .line 461
    .line 462
    iget-object v4, v0, Llu1;->b:Lnn2;

    .line 463
    .line 464
    invoke-virtual {v4}, Lnn2;->e()V

    .line 465
    .line 466
    .line 467
    iget-object v6, v4, Lnn2;->d:Ljava/lang/Object;

    .line 468
    .line 469
    monitor-enter v6

    .line 470
    :try_start_11
    iget-object v4, v4, Lnn2;->a:Landroid/content/SharedPreferences;

    .line 471
    .line 472
    invoke-interface {v4, v1}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    .line 473
    .line 474
    .line 475
    move-result v1

    .line 476
    monitor-exit v6
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_5

    .line 477
    if-nez v1, :cond_8

    .line 478
    .line 479
    invoke-virtual {v0}, Llu1;->a()Z

    .line 480
    .line 481
    .line 482
    move-result v1

    .line 483
    if-eqz v1, :cond_7

    .line 484
    .line 485
    goto :goto_a

    .line 486
    :cond_7
    iget-object v0, v0, Llu1;->a:Landroid/content/Context;

    .line 487
    .line 488
    new-instance v1, Loi0;

    .line 489
    .line 490
    invoke-direct {v1, v0}, Loi0;-><init>(Ljava/lang/Object;)V

    .line 491
    .line 492
    .line 493
    invoke-virtual {v2, v1, v3, v5}, Lcr1;->e2(Lu10;Lad2;Ltc2;)V

    .line 494
    .line 495
    .line 496
    :cond_8
    :goto_a
    return-void

    .line 497
    :catchall_5
    move-exception v0

    .line 498
    :try_start_12
    monitor-exit v6
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_5

    .line 499
    throw v0

    .line 500
    :pswitch_6
    iget-object v0, p0, Lvd;->j:Ljava/lang/Object;

    .line 501
    .line 502
    check-cast v0, Lh30;

    .line 503
    .line 504
    iget-object v1, p0, Lvd;->i:Ljava/lang/Object;

    .line 505
    .line 506
    check-cast v1, Lb3;

    .line 507
    .line 508
    iget-object v2, p0, Lvd;->g:Ljava/lang/Object;

    .line 509
    .line 510
    check-cast v2, Landroid/content/Context;

    .line 511
    .line 512
    iget-object v3, p0, Lvd;->h:Ljava/lang/Object;

    .line 513
    .line 514
    check-cast v3, Ljava/lang/String;

    .line 515
    .line 516
    :try_start_13
    new-instance v4, Lk52;

    .line 517
    .line 518
    invoke-direct {v4, v2, v3}, Lk52;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 519
    .line 520
    .line 521
    iget-object v1, v1, Lb3;->a:Le13;

    .line 522
    .line 523
    invoke-virtual {v4, v1, v0}, Lk52;->d(Le13;Lum;)V
    :try_end_13
    .catch Ljava/lang/IllegalStateException; {:try_start_13 .. :try_end_13} :catch_5

    .line 524
    .line 525
    .line 526
    goto :goto_b

    .line 527
    :catch_5
    move-exception v0

    .line 528
    invoke-static {v2}, Lr92;->a(Landroid/content/Context;)Ls92;

    .line 529
    .line 530
    .line 531
    move-result-object v1

    .line 532
    const-string v2, "InterstitialAd.load"

    .line 533
    .line 534
    invoke-interface {v1, v2, v0}, Ls92;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 535
    .line 536
    .line 537
    :goto_b
    return-void

    .line 538
    :pswitch_7
    iget-object v0, p0, Lvd;->i:Ljava/lang/Object;

    .line 539
    .line 540
    move-object v2, v0

    .line 541
    check-cast v2, Lou0;

    .line 542
    .line 543
    iget-object v0, p0, Lvd;->g:Ljava/lang/Object;

    .line 544
    .line 545
    check-cast v0, Ljava/util/UUID;

    .line 546
    .line 547
    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 548
    .line 549
    .line 550
    move-result-object v3

    .line 551
    invoke-static {}, Lh80;->d()Lh80;

    .line 552
    .line 553
    .line 554
    move-result-object v6

    .line 555
    sget-object v7, Lla1;->c:Ljava/lang/String;

    .line 556
    .line 557
    iget-object v7, p0, Lvd;->h:Ljava/lang/Object;

    .line 558
    .line 559
    check-cast v7, Lim;

    .line 560
    .line 561
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 562
    .line 563
    .line 564
    invoke-static {v7}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 565
    .line 566
    .line 567
    new-array v0, v4, [Ljava/lang/Throwable;

    .line 568
    .line 569
    invoke-virtual {v6, v0}, Lh80;->a([Ljava/lang/Throwable;)V

    .line 570
    .line 571
    .line 572
    iget-object v0, p0, Lvd;->j:Ljava/lang/Object;

    .line 573
    .line 574
    check-cast v0, Lla1;

    .line 575
    .line 576
    iget-object v6, v0, Lla1;->a:Landroidx/work/impl/WorkDatabase;

    .line 577
    .line 578
    iget-object v8, v0, Lla1;->a:Landroidx/work/impl/WorkDatabase;

    .line 579
    .line 580
    invoke-virtual {v6}, Lpq0;->c()V

    .line 581
    .line 582
    .line 583
    :try_start_14
    invoke-virtual {v8}, Landroidx/work/impl/WorkDatabase;->n()Lh2;

    .line 584
    .line 585
    .line 586
    move-result-object v0

    .line 587
    invoke-virtual {v0, v3}, Lh2;->h(Ljava/lang/String;)Loa1;

    .line 588
    .line 589
    .line 590
    move-result-object v0

    .line 591
    if-eqz v0, :cond_a

    .line 592
    .line 593
    iget v0, v0, Loa1;->b:I

    .line 594
    .line 595
    if-ne v0, v1, :cond_9

    .line 596
    .line 597
    new-instance v0, Lka1;

    .line 598
    .line 599
    invoke-direct {v0, v3, v7}, Lka1;-><init>(Ljava/lang/String;Lim;)V

    .line 600
    .line 601
    .line 602
    invoke-virtual {v8}, Landroidx/work/impl/WorkDatabase;->m()Lmc2;

    .line 603
    .line 604
    .line 605
    move-result-object v1

    .line 606
    iget-object v3, v1, Lmc2;->g:Ljava/lang/Object;

    .line 607
    .line 608
    check-cast v3, Landroidx/work/impl/WorkDatabase_Impl;

    .line 609
    .line 610
    invoke-virtual {v3}, Lpq0;->b()V

    .line 611
    .line 612
    .line 613
    invoke-virtual {v3}, Lpq0;->c()V
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_7

    .line 614
    .line 615
    .line 616
    :try_start_15
    iget-object v1, v1, Lmc2;->h:Ljava/lang/Object;

    .line 617
    .line 618
    check-cast v1, Lio;

    .line 619
    .line 620
    invoke-virtual {v1, v0}, Lio;->e(Ljava/lang/Object;)V

    .line 621
    .line 622
    .line 623
    invoke-virtual {v3}, Lpq0;->h()V
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_6

    .line 624
    .line 625
    .line 626
    :try_start_16
    invoke-virtual {v3}, Lpq0;->f()V

    .line 627
    .line 628
    .line 629
    goto :goto_c

    .line 630
    :catchall_6
    move-exception v0

    .line 631
    invoke-virtual {v3}, Lpq0;->f()V

    .line 632
    .line 633
    .line 634
    throw v0

    .line 635
    :catchall_7
    move-exception v0

    .line 636
    goto :goto_e

    .line 637
    :cond_9
    invoke-static {}, Lh80;->d()Lh80;

    .line 638
    .line 639
    .line 640
    move-result-object v0

    .line 641
    new-array v1, v4, [Ljava/lang/Throwable;

    .line 642
    .line 643
    invoke-virtual {v0, v1}, Lh80;->g([Ljava/lang/Throwable;)V

    .line 644
    .line 645
    .line 646
    :goto_c
    invoke-virtual {v2, v5}, Lou0;->i(Ljava/lang/Object;)Z

    .line 647
    .line 648
    .line 649
    invoke-virtual {v8}, Lpq0;->h()V
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_7

    .line 650
    .line 651
    .line 652
    :goto_d
    invoke-virtual {v8}, Lpq0;->f()V

    .line 653
    .line 654
    .line 655
    goto :goto_f

    .line 656
    :cond_a
    :try_start_17
    const-string v0, "Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result."

    .line 657
    .line 658
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 659
    .line 660
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 661
    .line 662
    .line 663
    throw v1
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_7

    .line 664
    :goto_e
    :try_start_18
    invoke-static {}, Lh80;->d()Lh80;

    .line 665
    .line 666
    .line 667
    move-result-object v1

    .line 668
    sget-object v3, Lla1;->c:Ljava/lang/String;

    .line 669
    .line 670
    const-string v4, "Error updating Worker progress"

    .line 671
    .line 672
    filled-new-array {v0}, [Ljava/lang/Throwable;

    .line 673
    .line 674
    .line 675
    move-result-object v5

    .line 676
    invoke-virtual {v1, v3, v4, v5}, Lh80;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    .line 677
    .line 678
    .line 679
    invoke-virtual {v2, v0}, Lou0;->j(Ljava/lang/Throwable;)Z
    :try_end_18
    .catchall {:try_start_18 .. :try_end_18} :catchall_8

    .line 680
    .line 681
    .line 682
    goto :goto_d

    .line 683
    :goto_f
    return-void

    .line 684
    :catchall_8
    move-exception v0

    .line 685
    invoke-virtual {v8}, Lpq0;->f()V

    .line 686
    .line 687
    .line 688
    throw v0

    .line 689
    :pswitch_8
    iget-object v0, p0, Lvd;->j:Ljava/lang/Object;

    .line 690
    .line 691
    check-cast v0, Lug0;

    .line 692
    .line 693
    iget-object v0, v0, Lug0;->g:Ljava/lang/Object;

    .line 694
    .line 695
    check-cast v0, Lxd;

    .line 696
    .line 697
    iget-object v1, p0, Lvd;->h:Ljava/lang/Object;

    .line 698
    .line 699
    check-cast v1, Lsd0;

    .line 700
    .line 701
    iget-object v2, p0, Lvd;->g:Ljava/lang/Object;

    .line 702
    .line 703
    check-cast v2, Lwd;

    .line 704
    .line 705
    if-eqz v2, :cond_b

    .line 706
    .line 707
    iput-boolean v3, v0, Lxd;->E:Z

    .line 708
    .line 709
    iget-object v2, v2, Lwd;->b:Lod0;

    .line 710
    .line 711
    invoke-virtual {v2, v4}, Lod0;->c(Z)V

    .line 712
    .line 713
    .line 714
    iput-boolean v4, v0, Lxd;->E:Z

    .line 715
    .line 716
    :cond_b
    invoke-virtual {v1}, Lsd0;->isEnabled()Z

    .line 717
    .line 718
    .line 719
    move-result v0

    .line 720
    if-eqz v0, :cond_c

    .line 721
    .line 722
    invoke-virtual {v1}, Lsd0;->hasSubMenu()Z

    .line 723
    .line 724
    .line 725
    move-result v0

    .line 726
    if-eqz v0, :cond_c

    .line 727
    .line 728
    iget-object v0, p0, Lvd;->i:Ljava/lang/Object;

    .line 729
    .line 730
    check-cast v0, Lod0;

    .line 731
    .line 732
    const/4 v2, 0x4

    .line 733
    invoke-virtual {v0, v1, v5, v2}, Lod0;->q(Landroid/view/MenuItem;Lfe0;I)Z

    .line 734
    .line 735
    .line 736
    :cond_c
    return-void

    .line 737
    :pswitch_data_0
    .packed-switch 0x0
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
