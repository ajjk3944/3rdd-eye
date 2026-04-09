.class public final Lef2;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic f:I

.field public final synthetic g:J

.field public final synthetic h:Ljava/lang/Object;

.field public final synthetic i:Ljava/lang/Object;

.field public final synthetic j:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lff2;Ljava/lang/String;Ljava/lang/String;J)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lef2;->f:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lef2;->h:Ljava/lang/Object;

    iput-object p3, p0, Lef2;->i:Ljava/lang/Object;

    iput-wide p4, p0, Lef2;->g:J

    iput-object p1, p0, Lef2;->j:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ls53;JLq53;Landroid/os/Bundle;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lef2;->f:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lef2;->h:Ljava/lang/Object;

    iput-wide p2, p0, Lef2;->g:J

    iput-object p4, p0, Lef2;->i:Ljava/lang/Object;

    iput-object p5, p0, Lef2;->j:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 11

    .line 1
    iget v0, p0, Lef2;->f:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lef2;->h:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Ls53;

    .line 9
    .line 10
    iget-wide v1, p0, Lef2;->g:J

    .line 11
    .line 12
    iget-object v3, p0, Lef2;->i:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v3, Lq53;

    .line 15
    .line 16
    iget-object v4, p0, Lef2;->j:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v4, Landroid/os/Bundle;

    .line 19
    .line 20
    sget-object v5, Lhg4;->C:Lhg4;

    .line 21
    .line 22
    iget-object v6, v5, Lhg4;->k:Lym;

    .line 23
    .line 24
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 28
    .line 29
    .line 30
    move-result-wide v6

    .line 31
    sub-long/2addr v6, v1

    .line 32
    sget-object v1, Lu02;->a:Lso1;

    .line 33
    .line 34
    invoke-virtual {v1}, Lso1;->w()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    check-cast v1, Ljava/lang/Boolean;

    .line 39
    .line 40
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    const-string v2, "sig"

    .line 45
    .line 46
    if-eqz v1, :cond_1

    .line 47
    .line 48
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    invoke-virtual {v1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    if-nez v1, :cond_0

    .line 57
    .line 58
    const-string v1, ""

    .line 59
    .line 60
    :cond_0
    invoke-static {v6, v7}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v8

    .line 64
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 65
    .line 66
    .line 67
    move-result v9

    .line 68
    add-int/lit8 v9, v9, 0x19

    .line 69
    .line 70
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 71
    .line 72
    .line 73
    move-result v8

    .line 74
    new-instance v10, Ljava/lang/StringBuilder;

    .line 75
    .line 76
    add-int/2addr v9, v8

    .line 77
    invoke-direct {v10, v9}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 78
    .line 79
    .line 80
    const-string v8, "Signal runtime (ms) : "

    .line 81
    .line 82
    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v10, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    const-string v1, " = "

    .line 89
    .line 90
    invoke-virtual {v10, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v10, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    invoke-static {v1}, Lgi2;->G(Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    :cond_1
    sget-object v1, Lmz1;->m2:Liz1;

    .line 104
    .line 105
    sget-object v8, Ltw1;->e:Ltw1;

    .line 106
    .line 107
    iget-object v9, v8, Ltw1;->c:Lkz1;

    .line 108
    .line 109
    invoke-virtual {v9, v1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    check-cast v1, Ljava/lang/Boolean;

    .line 114
    .line 115
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 116
    .line 117
    .line 118
    move-result v1

    .line 119
    if-eqz v1, :cond_2

    .line 120
    .line 121
    sget-object v1, Lmz1;->s2:Liz1;

    .line 122
    .line 123
    iget-object v9, v8, Ltw1;->c:Lkz1;

    .line 124
    .line 125
    invoke-virtual {v9, v1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v1

    .line 129
    check-cast v1, Ljava/lang/Boolean;

    .line 130
    .line 131
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 132
    .line 133
    .line 134
    move-result v1

    .line 135
    if-eqz v1, :cond_2

    .line 136
    .line 137
    monitor-enter v0

    .line 138
    :try_start_0
    invoke-interface {v3}, Lq53;->d()I

    .line 139
    .line 140
    .line 141
    move-result v1

    .line 142
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v9

    .line 146
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    .line 147
    .line 148
    .line 149
    move-result v9

    .line 150
    add-int/lit8 v9, v9, 0x3

    .line 151
    .line 152
    new-instance v10, Ljava/lang/StringBuilder;

    .line 153
    .line 154
    invoke-direct {v10, v9}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {v10, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 158
    .line 159
    .line 160
    invoke-virtual {v10, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 161
    .line 162
    .line 163
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v1

    .line 167
    invoke-virtual {v4, v1, v6, v7}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 168
    .line 169
    .line 170
    monitor-exit v0

    .line 171
    goto :goto_0

    .line 172
    :catchall_0
    move-exception v1

    .line 173
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 174
    throw v1

    .line 175
    :cond_2
    :goto_0
    sget-object v1, Lmz1;->k2:Liz1;

    .line 176
    .line 177
    iget-object v2, v8, Ltw1;->c:Lkz1;

    .line 178
    .line 179
    invoke-virtual {v2, v1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object v1

    .line 183
    check-cast v1, Ljava/lang/Boolean;

    .line 184
    .line 185
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 186
    .line 187
    .line 188
    move-result v1

    .line 189
    if-nez v1, :cond_3

    .line 190
    .line 191
    goto/16 :goto_5

    .line 192
    .line 193
    :cond_3
    iget-object v1, v0, Ls53;->e:Lmv2;

    .line 194
    .line 195
    invoke-virtual {v1}, Lmv2;->a()Llv2;

    .line 196
    .line 197
    .line 198
    move-result-object v1

    .line 199
    const-string v2, "action"

    .line 200
    .line 201
    const-string v4, "lat_ms"

    .line 202
    .line 203
    invoke-virtual {v1, v2, v4}, Llv2;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 204
    .line 205
    .line 206
    const-string v2, "lat_grp"

    .line 207
    .line 208
    const-string v4, "sig_lat_grp"

    .line 209
    .line 210
    invoke-virtual {v1, v2, v4}, Llv2;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 211
    .line 212
    .line 213
    invoke-interface {v3}, Lq53;->d()I

    .line 214
    .line 215
    .line 216
    move-result v2

    .line 217
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 218
    .line 219
    .line 220
    move-result-object v2

    .line 221
    const-string v4, "lat_id"

    .line 222
    .line 223
    invoke-virtual {v1, v4, v2}, Llv2;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 224
    .line 225
    .line 226
    invoke-static {v6, v7}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 227
    .line 228
    .line 229
    move-result-object v2

    .line 230
    const-string v4, "clat_ms"

    .line 231
    .line 232
    invoke-virtual {v1, v4, v2}, Llv2;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 233
    .line 234
    .line 235
    sget-object v2, Lmz1;->l2:Liz1;

    .line 236
    .line 237
    iget-object v4, v8, Ltw1;->c:Lkz1;

    .line 238
    .line 239
    invoke-virtual {v4, v2}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 240
    .line 241
    .line 242
    move-result-object v2

    .line 243
    check-cast v2, Ljava/lang/Boolean;

    .line 244
    .line 245
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 246
    .line 247
    .line 248
    move-result v2

    .line 249
    if-eqz v2, :cond_6

    .line 250
    .line 251
    monitor-enter v0

    .line 252
    :try_start_1
    iget v2, v0, Ls53;->g:I

    .line 253
    .line 254
    add-int/lit8 v2, v2, 0x1

    .line 255
    .line 256
    iput v2, v0, Ls53;->g:I

    .line 257
    .line 258
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    .line 259
    iget-object v2, v5, Lhg4;->h:Lgd2;

    .line 260
    .line 261
    iget-object v2, v2, Lgd2;->c:Lid2;

    .line 262
    .line 263
    iget-object v2, v2, Lid2;->h:Ll92;

    .line 264
    .line 265
    monitor-enter v2

    .line 266
    :try_start_2
    iget-object v4, v2, Ll92;->g:Ljava/lang/Object;

    .line 267
    .line 268
    check-cast v4, Ljava/lang/String;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 269
    .line 270
    monitor-exit v2

    .line 271
    const-string v2, "seq_num"

    .line 272
    .line 273
    invoke-virtual {v1, v2, v4}, Llv2;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 274
    .line 275
    .line 276
    monitor-enter v0

    .line 277
    :try_start_3
    iget v2, v0, Ls53;->g:I

    .line 278
    .line 279
    iget-object v4, v0, Ls53;->b:Ljava/util/Set;

    .line 280
    .line 281
    invoke-interface {v4}, Ljava/util/Set;->size()I

    .line 282
    .line 283
    .line 284
    move-result v4

    .line 285
    if-ne v2, v4, :cond_5

    .line 286
    .line 287
    iget-wide v6, v0, Ls53;->f:J

    .line 288
    .line 289
    const-wide/16 v8, 0x0

    .line 290
    .line 291
    cmp-long v2, v6, v8

    .line 292
    .line 293
    if-eqz v2, :cond_5

    .line 294
    .line 295
    const/4 v2, 0x0

    .line 296
    iput v2, v0, Ls53;->g:I

    .line 297
    .line 298
    iget-object v2, v5, Lhg4;->k:Lym;

    .line 299
    .line 300
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 301
    .line 302
    .line 303
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 304
    .line 305
    .line 306
    move-result-wide v4

    .line 307
    iget-wide v6, v0, Ls53;->f:J

    .line 308
    .line 309
    sub-long/2addr v4, v6

    .line 310
    invoke-static {v4, v5}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 311
    .line 312
    .line 313
    move-result-object v2

    .line 314
    invoke-interface {v3}, Lq53;->d()I

    .line 315
    .line 316
    .line 317
    move-result v4

    .line 318
    const/16 v5, 0x27

    .line 319
    .line 320
    if-le v4, v5, :cond_4

    .line 321
    .line 322
    invoke-interface {v3}, Lq53;->d()I

    .line 323
    .line 324
    .line 325
    move-result v3

    .line 326
    const/16 v4, 0x34

    .line 327
    .line 328
    if-ge v3, v4, :cond_4

    .line 329
    .line 330
    const-string v3, "lat_gmssg"

    .line 331
    .line 332
    invoke-virtual {v1, v3, v2}, Llv2;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 333
    .line 334
    .line 335
    goto :goto_1

    .line 336
    :catchall_1
    move-exception v1

    .line 337
    goto :goto_2

    .line 338
    :cond_4
    const-string v3, "lat_clsg"

    .line 339
    .line 340
    invoke-virtual {v1, v3, v2}, Llv2;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 341
    .line 342
    .line 343
    :cond_5
    :goto_1
    monitor-exit v0

    .line 344
    goto :goto_4

    .line 345
    :goto_2
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 346
    throw v1

    .line 347
    :goto_3
    :try_start_4
    monitor-exit v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 348
    throw v0

    .line 349
    :catchall_2
    move-exception v0

    .line 350
    goto :goto_3

    .line 351
    :catchall_3
    move-exception v1

    .line 352
    :try_start_5
    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 353
    throw v1

    .line 354
    :cond_6
    :goto_4
    new-instance v0, Lkv2;

    .line 355
    .line 356
    const/4 v2, 0x1

    .line 357
    invoke-direct {v0, v1, v2}, Lkv2;-><init>(Llv2;I)V

    .line 358
    .line 359
    .line 360
    iget-object v1, v1, Llv2;->h:Ljava/lang/Object;

    .line 361
    .line 362
    check-cast v1, Lmv2;

    .line 363
    .line 364
    iget-object v1, v1, Lmv2;->b:Ljava/util/concurrent/Executor;

    .line 365
    .line 366
    invoke-interface {v1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 367
    .line 368
    .line 369
    :goto_5
    return-void

    .line 370
    :pswitch_0
    new-instance v0, Ljava/util/HashMap;

    .line 371
    .line 372
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 373
    .line 374
    .line 375
    const-string v1, "event"

    .line 376
    .line 377
    const-string v2, "precacheComplete"

    .line 378
    .line 379
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 380
    .line 381
    .line 382
    const-string v1, "src"

    .line 383
    .line 384
    iget-object v2, p0, Lef2;->h:Ljava/lang/Object;

    .line 385
    .line 386
    check-cast v2, Ljava/lang/String;

    .line 387
    .line 388
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 389
    .line 390
    .line 391
    const-string v1, "cachedSrc"

    .line 392
    .line 393
    iget-object v2, p0, Lef2;->i:Ljava/lang/Object;

    .line 394
    .line 395
    check-cast v2, Ljava/lang/String;

    .line 396
    .line 397
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 398
    .line 399
    .line 400
    iget-wide v1, p0, Lef2;->g:J

    .line 401
    .line 402
    const-string v3, "totalDuration"

    .line 403
    .line 404
    invoke-static {v1, v2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    .line 405
    .line 406
    .line 407
    move-result-object v1

    .line 408
    invoke-virtual {v0, v3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 409
    .line 410
    .line 411
    iget-object v1, p0, Lef2;->j:Ljava/lang/Object;

    .line 412
    .line 413
    check-cast v1, Lff2;

    .line 414
    .line 415
    invoke-virtual {v1, v0}, Lff2;->n(Ljava/util/HashMap;)V

    .line 416
    .line 417
    .line 418
    return-void

    .line 419
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
