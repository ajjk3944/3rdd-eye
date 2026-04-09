.class public final Lrc2;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lca4;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;

.field public final c:Lga4;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Lga4;I)V
    .locals 0

    .line 1
    iput p3, p0, Lrc2;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lrc2;->b:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p2, p0, Lrc2;->c:Lga4;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public a()Lwt2;
    .locals 5

    .line 1
    iget-object v0, p0, Lrc2;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lri2;

    .line 4
    .line 5
    iget-object v0, v0, Lri2;->b:Lga4;

    .line 6
    .line 7
    check-cast v0, Lhh2;

    .line 8
    .line 9
    invoke-virtual {v0}, Lhh2;->a()Landroid/content/Context;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    new-instance v1, Lcz2;

    .line 14
    .line 15
    invoke-direct {v1, v0}, Lcz2;-><init>(Landroid/content/Context;)V

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, Lrc2;->c:Lga4;

    .line 19
    .line 20
    invoke-interface {v0}, Lga4;->d()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    check-cast v0, Lpq3;

    .line 25
    .line 26
    new-instance v2, Lwt2;

    .line 27
    .line 28
    const/4 v3, 0x2

    .line 29
    const/4 v4, 0x0

    .line 30
    invoke-direct {v2, v1, v0, v3, v4}, Lwt2;-><init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 31
    .line 32
    .line 33
    return-object v2
.end method

.method public final d()Ljava/lang/Object;
    .locals 11

    .line 1
    iget v0, p0, Lrc2;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lrc2;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lem2;

    .line 9
    .line 10
    invoke-virtual {v0}, Lem2;->a()Li33;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iget-object v1, p0, Lrc2;->c:Lga4;

    .line 15
    .line 16
    invoke-interface {v1}, Lga4;->d()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, Ljava/util/concurrent/ScheduledExecutorService;

    .line 21
    .line 22
    new-instance v2, Lx43;

    .line 23
    .line 24
    sget-object v3, Lmz1;->hd:Liz1;

    .line 25
    .line 26
    sget-object v4, Ltw1;->e:Ltw1;

    .line 27
    .line 28
    iget-object v4, v4, Ltw1;->c:Lkz1;

    .line 29
    .line 30
    invoke-virtual {v4, v3}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    check-cast v3, Ljava/lang/Integer;

    .line 35
    .line 36
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    int-to-long v3, v3

    .line 41
    invoke-direct {v2, v0, v3, v4, v1}, Lx43;-><init>(Lq53;JLjava/util/concurrent/ScheduledExecutorService;)V

    .line 42
    .line 43
    .line 44
    return-object v2

    .line 45
    :pswitch_0
    iget-object v0, p0, Lrc2;->b:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v0, Lba4;

    .line 48
    .line 49
    invoke-virtual {v0}, Lba4;->d()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    check-cast v0, Lez2;

    .line 54
    .line 55
    iget-object v1, p0, Lrc2;->c:Lga4;

    .line 56
    .line 57
    check-cast v1, Lrc2;

    .line 58
    .line 59
    iget-object v2, v1, Lrc2;->b:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v2, Lrc2;

    .line 62
    .line 63
    invoke-virtual {v2}, Lrc2;->a()Lwt2;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    iget-object v1, v1, Lrc2;->c:Lga4;

    .line 68
    .line 69
    check-cast v1, Lfh2;

    .line 70
    .line 71
    invoke-virtual {v1}, Lfh2;->a()Lra4;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    new-instance v3, Lfz2;

    .line 76
    .line 77
    invoke-direct {v3, v2, v1}, Le6;-><init>(Lwt2;Lra4;)V

    .line 78
    .line 79
    .line 80
    new-instance v1, Lfv2;

    .line 81
    .line 82
    invoke-direct {v1, v0, v3}, Lfv2;-><init>(Lez2;Lfz2;)V

    .line 83
    .line 84
    .line 85
    return-object v1

    .line 86
    :pswitch_1
    iget-object v0, p0, Lrc2;->b:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast v0, Lrc2;

    .line 89
    .line 90
    invoke-virtual {v0}, Lrc2;->a()Lwt2;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    iget-object v1, p0, Lrc2;->c:Lga4;

    .line 95
    .line 96
    check-cast v1, Lfh2;

    .line 97
    .line 98
    invoke-virtual {v1}, Lfh2;->a()Lra4;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    new-instance v2, Lfz2;

    .line 103
    .line 104
    invoke-direct {v2, v0, v1}, Le6;-><init>(Lwt2;Lra4;)V

    .line 105
    .line 106
    .line 107
    return-object v2

    .line 108
    :pswitch_2
    iget-object v0, p0, Lrc2;->b:Ljava/lang/Object;

    .line 109
    .line 110
    check-cast v0, Lic2;

    .line 111
    .line 112
    invoke-virtual {v0}, Lic2;->b()Lgz2;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    iget-object v1, p0, Lrc2;->c:Lga4;

    .line 117
    .line 118
    check-cast v1, Lfh2;

    .line 119
    .line 120
    invoke-virtual {v1}, Lfh2;->a()Lra4;

    .line 121
    .line 122
    .line 123
    move-result-object v1

    .line 124
    new-instance v2, Ldz2;

    .line 125
    .line 126
    invoke-direct {v2, v0, v1}, Ldz2;-><init>(Lgz2;Lra4;)V

    .line 127
    .line 128
    .line 129
    return-object v2

    .line 130
    :pswitch_3
    invoke-virtual {p0}, Lrc2;->a()Lwt2;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    return-object v0

    .line 135
    :pswitch_4
    sget-object v2, Lmd2;->a:Lld2;

    .line 136
    .line 137
    invoke-static {v2}, Li41;->M(Ljava/lang/Object;)V

    .line 138
    .line 139
    .line 140
    iget-object v0, p0, Lrc2;->b:Ljava/lang/Object;

    .line 141
    .line 142
    check-cast v0, Lri2;

    .line 143
    .line 144
    invoke-virtual {v0}, Lri2;->a()Liy2;

    .line 145
    .line 146
    .line 147
    move-result-object v3

    .line 148
    iget-object v0, p0, Lrc2;->c:Lga4;

    .line 149
    .line 150
    check-cast v0, Lic2;

    .line 151
    .line 152
    invoke-static {v0}, Lba4;->b(Lga4;)Lz94;

    .line 153
    .line 154
    .line 155
    move-result-object v4

    .line 156
    new-instance v1, Lt83;

    .line 157
    .line 158
    const/16 v5, 0x16

    .line 159
    .line 160
    const/4 v6, 0x0

    .line 161
    invoke-direct/range {v1 .. v6}, Lt83;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 162
    .line 163
    .line 164
    return-object v1

    .line 165
    :pswitch_5
    iget-object v0, p0, Lrc2;->b:Ljava/lang/Object;

    .line 166
    .line 167
    check-cast v0, Lfa4;

    .line 168
    .line 169
    iget-object v0, v0, Laa4;->a:Ljava/util/Map;

    .line 170
    .line 171
    sget-object v1, Lmd2;->a:Lld2;

    .line 172
    .line 173
    invoke-static {v1}, Li41;->M(Ljava/lang/Object;)V

    .line 174
    .line 175
    .line 176
    iget-object v2, p0, Lrc2;->c:Lga4;

    .line 177
    .line 178
    check-cast v2, Ltm2;

    .line 179
    .line 180
    iget-object v2, v2, Ltm2;->b:Lha4;

    .line 181
    .line 182
    invoke-virtual {v2}, Lha4;->b()Ljava/util/Set;

    .line 183
    .line 184
    .line 185
    move-result-object v2

    .line 186
    new-instance v3, Lio2;

    .line 187
    .line 188
    invoke-direct {v3, v2}, Lf74;-><init>(Ljava/util/Set;)V

    .line 189
    .line 190
    .line 191
    new-instance v2, Lky2;

    .line 192
    .line 193
    invoke-direct {v2, v0, v1, v3}, Lky2;-><init>(Ljava/util/Map;Lpq3;Lio2;)V

    .line 194
    .line 195
    .line 196
    return-object v2

    .line 197
    :pswitch_6
    sget-object v5, Lmd2;->b:Lld2;

    .line 198
    .line 199
    invoke-static {v5}, Li41;->M(Ljava/lang/Object;)V

    .line 200
    .line 201
    .line 202
    sget-object v6, Lmd2;->a:Lld2;

    .line 203
    .line 204
    invoke-static {v6}, Li41;->M(Ljava/lang/Object;)V

    .line 205
    .line 206
    .line 207
    iget-object v0, p0, Lrc2;->b:Ljava/lang/Object;

    .line 208
    .line 209
    check-cast v0, Lsw2;

    .line 210
    .line 211
    iget-object v0, v0, Lsw2;->b:Lba4;

    .line 212
    .line 213
    invoke-virtual {v0}, Lba4;->d()Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object v0

    .line 217
    check-cast v0, Landroid/content/Context;

    .line 218
    .line 219
    new-instance v7, Lay2;

    .line 220
    .line 221
    const/4 v1, 0x0

    .line 222
    invoke-direct {v7, v0, v6, v1}, Lay2;-><init>(Landroid/content/Context;Lld2;I)V

    .line 223
    .line 224
    .line 225
    iget-object v0, p0, Lrc2;->c:Lga4;

    .line 226
    .line 227
    check-cast v0, Lic2;

    .line 228
    .line 229
    invoke-static {v0}, Lba4;->b(Lga4;)Lz94;

    .line 230
    .line 231
    .line 232
    move-result-object v8

    .line 233
    new-instance v4, Lmc2;

    .line 234
    .line 235
    const/16 v9, 0x10

    .line 236
    .line 237
    const/4 v10, 0x0

    .line 238
    invoke-direct/range {v4 .. v10}, Lmc2;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 239
    .line 240
    .line 241
    return-object v4

    .line 242
    :pswitch_7
    iget-object v0, p0, Lrc2;->b:Ljava/lang/Object;

    .line 243
    .line 244
    check-cast v0, Lda4;

    .line 245
    .line 246
    iget-object v0, v0, Lda4;->a:Ljava/lang/Object;

    .line 247
    .line 248
    check-cast v0, Lci2;

    .line 249
    .line 250
    iget-object v1, p0, Lrc2;->c:Lga4;

    .line 251
    .line 252
    check-cast v1, Law2;

    .line 253
    .line 254
    iget-object v1, v1, Law2;->b:Lda4;

    .line 255
    .line 256
    iget-object v1, v1, Lda4;->a:Ljava/lang/Object;

    .line 257
    .line 258
    check-cast v1, Lm42;

    .line 259
    .line 260
    new-instance v2, Lf20;

    .line 261
    .line 262
    const/16 v3, 0x16

    .line 263
    .line 264
    invoke-direct {v2, v3, v1}, Lf20;-><init>(ILjava/lang/Object;)V

    .line 265
    .line 266
    .line 267
    new-instance v1, Lbw2;

    .line 268
    .line 269
    invoke-direct {v1, v0, v2}, Lbw2;-><init>(Lci2;Lf20;)V

    .line 270
    .line 271
    .line 272
    return-object v1

    .line 273
    :pswitch_8
    iget-object v0, p0, Lrc2;->b:Ljava/lang/Object;

    .line 274
    .line 275
    check-cast v0, Lba4;

    .line 276
    .line 277
    invoke-virtual {v0}, Lba4;->d()Ljava/lang/Object;

    .line 278
    .line 279
    .line 280
    move-result-object v0

    .line 281
    check-cast v0, Lcx1;

    .line 282
    .line 283
    iget-object v1, p0, Lrc2;->c:Lga4;

    .line 284
    .line 285
    check-cast v1, Lea4;

    .line 286
    .line 287
    invoke-virtual {v1}, Lea4;->b()Ljava/util/Map;

    .line 288
    .line 289
    .line 290
    move-result-object v1

    .line 291
    new-instance v2, Lfv2;

    .line 292
    .line 293
    invoke-direct {v2, v0, v1}, Lfv2;-><init>(Lcx1;Ljava/util/Map;)V

    .line 294
    .line 295
    .line 296
    return-object v2

    .line 297
    :pswitch_9
    iget-object v0, p0, Lrc2;->b:Ljava/lang/Object;

    .line 298
    .line 299
    check-cast v0, Llc2;

    .line 300
    .line 301
    iget-object v0, v0, Llc2;->b:Lhh2;

    .line 302
    .line 303
    invoke-virtual {v0}, Lhh2;->a()Landroid/content/Context;

    .line 304
    .line 305
    .line 306
    move-result-object v0

    .line 307
    invoke-static {v0}, Lt83;->S(Landroid/content/Context;)Lt83;

    .line 308
    .line 309
    .line 310
    move-result-object v0

    .line 311
    iget-object v1, p0, Lrc2;->c:Lga4;

    .line 312
    .line 313
    check-cast v1, Lba4;

    .line 314
    .line 315
    invoke-virtual {v1}, Lba4;->d()Ljava/lang/Object;

    .line 316
    .line 317
    .line 318
    move-result-object v1

    .line 319
    check-cast v1, Lxu2;

    .line 320
    .line 321
    new-instance v2, Lyu2;

    .line 322
    .line 323
    invoke-direct {v2, v0, v1}, Lyu2;-><init>(Lt83;Lxu2;)V

    .line 324
    .line 325
    .line 326
    return-object v2

    .line 327
    :pswitch_a
    iget-object v0, p0, Lrc2;->b:Ljava/lang/Object;

    .line 328
    .line 329
    check-cast v0, Lba4;

    .line 330
    .line 331
    invoke-virtual {v0}, Lba4;->d()Ljava/lang/Object;

    .line 332
    .line 333
    .line 334
    move-result-object v0

    .line 335
    check-cast v0, Lgn2;

    .line 336
    .line 337
    iget-object v1, p0, Lrc2;->c:Lga4;

    .line 338
    .line 339
    check-cast v1, Lll2;

    .line 340
    .line 341
    invoke-virtual {v1}, Lll2;->a()La83;

    .line 342
    .line 343
    .line 344
    move-result-object v1

    .line 345
    new-instance v2, Lhu2;

    .line 346
    .line 347
    invoke-direct {v2, v0, v1}, Lhu2;-><init>(Lgn2;La83;)V

    .line 348
    .line 349
    .line 350
    return-object v2

    .line 351
    :pswitch_b
    iget-object v0, p0, Lrc2;->b:Ljava/lang/Object;

    .line 352
    .line 353
    check-cast v0, Lu43;

    .line 354
    .line 355
    invoke-virtual {v0}, Lu43;->d()Ljava/lang/Object;

    .line 356
    .line 357
    .line 358
    move-result-object v0

    .line 359
    check-cast v0, Lpr2;

    .line 360
    .line 361
    iget-object v1, p0, Lrc2;->c:Lga4;

    .line 362
    .line 363
    check-cast v1, Lu12;

    .line 364
    .line 365
    invoke-virtual {v1}, Lu12;->a()Ltr2;

    .line 366
    .line 367
    .line 368
    move-result-object v1

    .line 369
    new-instance v2, Lpt2;

    .line 370
    .line 371
    const-string v3, "com.google.android.gms.ads.internal.instream.client.IInstreamAd"

    .line 372
    .line 373
    invoke-direct {v2, v3}, Lhv1;-><init>(Ljava/lang/String;)V

    .line 374
    .line 375
    .line 376
    monitor-enter v1

    .line 377
    :try_start_0
    iget-object v3, v1, Ltr2;->o:Landroid/view/View;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 378
    .line 379
    monitor-exit v1

    .line 380
    iput-object v3, v2, Lpt2;->f:Landroid/view/View;

    .line 381
    .line 382
    invoke-virtual {v1}, Ltr2;->r()Lpy2;

    .line 383
    .line 384
    .line 385
    move-result-object v3

    .line 386
    iput-object v3, v2, Lpt2;->g:Lpy2;

    .line 387
    .line 388
    iput-object v0, v2, Lpt2;->h:Lpr2;

    .line 389
    .line 390
    const/4 v0, 0x0

    .line 391
    iput-boolean v0, v2, Lpt2;->i:Z

    .line 392
    .line 393
    iput-boolean v0, v2, Lpt2;->j:Z

    .line 394
    .line 395
    invoke-virtual {v1}, Ltr2;->h()Lag2;

    .line 396
    .line 397
    .line 398
    move-result-object v0

    .line 399
    if-eqz v0, :cond_0

    .line 400
    .line 401
    invoke-virtual {v1}, Ltr2;->h()Lag2;

    .line 402
    .line 403
    .line 404
    move-result-object v0

    .line 405
    invoke-interface {v0, v2}, Lag2;->T0(Lpt2;)V

    .line 406
    .line 407
    .line 408
    :cond_0
    return-object v2

    .line 409
    :catchall_0
    move-exception v0

    .line 410
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 411
    throw v0

    .line 412
    :pswitch_c
    sget-object v0, Lmd2;->a:Lld2;

    .line 413
    .line 414
    invoke-static {v0}, Li41;->M(Ljava/lang/Object;)V

    .line 415
    .line 416
    .line 417
    iget-object v1, p0, Lrc2;->b:Ljava/lang/Object;

    .line 418
    .line 419
    check-cast v1, Lgt2;

    .line 420
    .line 421
    invoke-virtual {v1}, Lgt2;->a()Lft2;

    .line 422
    .line 423
    .line 424
    move-result-object v1

    .line 425
    iget-object v2, p0, Lrc2;->c:Lga4;

    .line 426
    .line 427
    check-cast v2, Lba4;

    .line 428
    .line 429
    invoke-virtual {v2}, Lba4;->d()Ljava/lang/Object;

    .line 430
    .line 431
    .line 432
    move-result-object v2

    .line 433
    check-cast v2, Ljv2;

    .line 434
    .line 435
    new-instance v3, Lxb4;

    .line 436
    .line 437
    const/16 v4, 0x16

    .line 438
    .line 439
    invoke-direct {v3, v0, v1, v2, v4}, Lxb4;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 440
    .line 441
    .line 442
    return-object v3

    .line 443
    :pswitch_d
    iget-object v0, p0, Lrc2;->b:Ljava/lang/Object;

    .line 444
    .line 445
    check-cast v0, Ljr2;

    .line 446
    .line 447
    iget-object v0, v0, Ljr2;->b:Lu12;

    .line 448
    .line 449
    invoke-virtual {v0}, Lu12;->a()Ltr2;

    .line 450
    .line 451
    .line 452
    move-result-object v0

    .line 453
    new-instance v1, Lgu2;

    .line 454
    .line 455
    invoke-direct {v1, v0}, Lgu2;-><init>(Ltr2;)V

    .line 456
    .line 457
    .line 458
    iget-object v0, p0, Lrc2;->c:Lga4;

    .line 459
    .line 460
    invoke-interface {v0}, Lga4;->d()Ljava/lang/Object;

    .line 461
    .line 462
    .line 463
    move-result-object v0

    .line 464
    check-cast v0, Ljava/util/concurrent/Executor;

    .line 465
    .line 466
    new-instance v2, Lup2;

    .line 467
    .line 468
    invoke-direct {v2, v1, v0}, Lup2;-><init>(Ljava/lang/Object;Ljava/util/concurrent/Executor;)V

    .line 469
    .line 470
    .line 471
    return-object v2

    .line 472
    :pswitch_e
    iget-object v0, p0, Lrc2;->b:Ljava/lang/Object;

    .line 473
    .line 474
    check-cast v0, Lll2;

    .line 475
    .line 476
    invoke-virtual {v0}, Lll2;->a()La83;

    .line 477
    .line 478
    .line 479
    move-result-object v0

    .line 480
    iget-object v1, p0, Lrc2;->c:Lga4;

    .line 481
    .line 482
    check-cast v1, Lfr2;

    .line 483
    .line 484
    iget-object v1, v1, Lfr2;->b:Lmc2;

    .line 485
    .line 486
    iget-object v1, v1, Lmc2;->g:Ljava/lang/Object;

    .line 487
    .line 488
    check-cast v1, Lorg/json/JSONObject;

    .line 489
    .line 490
    invoke-static {v1}, Li41;->M(Ljava/lang/Object;)V

    .line 491
    .line 492
    .line 493
    new-instance v2, Lur2;

    .line 494
    .line 495
    invoke-direct {v2, v0, v1}, Lur2;-><init>(La83;Lorg/json/JSONObject;)V

    .line 496
    .line 497
    .line 498
    return-object v2

    .line 499
    :pswitch_f
    iget-object v0, p0, Lrc2;->c:Lga4;

    .line 500
    .line 501
    invoke-interface {v0}, Lga4;->d()Ljava/lang/Object;

    .line 502
    .line 503
    .line 504
    move-result-object v0

    .line 505
    check-cast v0, Ljava/util/concurrent/Executor;

    .line 506
    .line 507
    iget-object v1, p0, Lrc2;->b:Ljava/lang/Object;

    .line 508
    .line 509
    check-cast v1, Ll92;

    .line 510
    .line 511
    new-instance v2, Lup2;

    .line 512
    .line 513
    new-instance v3, Lkk2;

    .line 514
    .line 515
    iget-object v1, v1, Ll92;->g:Ljava/lang/Object;

    .line 516
    .line 517
    check-cast v1, Lag2;

    .line 518
    .line 519
    const/4 v4, 0x1

    .line 520
    invoke-direct {v3, v4, v1}, Lkk2;-><init>(ILjava/lang/Object;)V

    .line 521
    .line 522
    .line 523
    invoke-direct {v2, v3, v0}, Lup2;-><init>(Ljava/lang/Object;Ljava/util/concurrent/Executor;)V

    .line 524
    .line 525
    .line 526
    return-object v2

    .line 527
    :pswitch_10
    iget-object v0, p0, Lrc2;->c:Lga4;

    .line 528
    .line 529
    check-cast v0, Lba4;

    .line 530
    .line 531
    invoke-virtual {v0}, Lba4;->d()Ljava/lang/Object;

    .line 532
    .line 533
    .line 534
    move-result-object v0

    .line 535
    check-cast v0, Lfm2;

    .line 536
    .line 537
    iget-object v1, p0, Lrc2;->b:Ljava/lang/Object;

    .line 538
    .line 539
    check-cast v1, Ll92;

    .line 540
    .line 541
    invoke-virtual {v1, v0}, Ll92;->M(Lfm2;)Ljava/util/Set;

    .line 542
    .line 543
    .line 544
    move-result-object v0

    .line 545
    invoke-static {v0}, Li41;->M(Ljava/lang/Object;)V

    .line 546
    .line 547
    .line 548
    return-object v0

    .line 549
    :pswitch_11
    iget-object v0, p0, Lrc2;->b:Ljava/lang/Object;

    .line 550
    .line 551
    check-cast v0, Lga4;

    .line 552
    .line 553
    invoke-interface {v0}, Lga4;->d()Ljava/lang/Object;

    .line 554
    .line 555
    .line 556
    move-result-object v0

    .line 557
    check-cast v0, Luu2;

    .line 558
    .line 559
    iget-object v1, p0, Lrc2;->c:Lga4;

    .line 560
    .line 561
    check-cast v1, Lll2;

    .line 562
    .line 563
    iget-object v1, v1, Lll2;->b:Lxb4;

    .line 564
    .line 565
    invoke-virtual {v1}, Lxb4;->G()Lc83;

    .line 566
    .line 567
    .line 568
    move-result-object v1

    .line 569
    new-instance v2, Lgq2;

    .line 570
    .line 571
    invoke-direct {v2, v0, v1}, Lgq2;-><init>(Luu2;Lc83;)V

    .line 572
    .line 573
    .line 574
    return-object v2

    .line 575
    :pswitch_12
    iget-object v0, p0, Lrc2;->c:Lga4;

    .line 576
    .line 577
    check-cast v0, Lha4;

    .line 578
    .line 579
    invoke-virtual {v0}, Lha4;->b()Ljava/util/Set;

    .line 580
    .line 581
    .line 582
    move-result-object v0

    .line 583
    iget-object v1, p0, Lrc2;->b:Ljava/lang/Object;

    .line 584
    .line 585
    check-cast v1, Lfp2;

    .line 586
    .line 587
    iget-object v2, v1, Lfp2;->p:Lvm2;

    .line 588
    .line 589
    if-nez v2, :cond_1

    .line 590
    .line 591
    new-instance v2, Lvm2;

    .line 592
    .line 593
    invoke-direct {v2, v0}, Lf74;-><init>(Ljava/util/Set;)V

    .line 594
    .line 595
    .line 596
    iput-object v2, v1, Lfp2;->p:Lvm2;

    .line 597
    .line 598
    :cond_1
    iget-object v0, v1, Lfp2;->p:Lvm2;

    .line 599
    .line 600
    invoke-static {v0}, Li41;->M(Ljava/lang/Object;)V

    .line 601
    .line 602
    .line 603
    return-object v0

    .line 604
    :pswitch_13
    iget-object v0, p0, Lrc2;->c:Lga4;

    .line 605
    .line 606
    check-cast v0, Lhh2;

    .line 607
    .line 608
    invoke-virtual {v0}, Lhh2;->a()Landroid/content/Context;

    .line 609
    .line 610
    .line 611
    iget-object v0, p0, Lrc2;->b:Ljava/lang/Object;

    .line 612
    .line 613
    check-cast v0, Lmm2;

    .line 614
    .line 615
    iget-object v0, v0, Lmm2;->a:Landroid/content/Context;

    .line 616
    .line 617
    invoke-static {v0}, Li41;->M(Ljava/lang/Object;)V

    .line 618
    .line 619
    .line 620
    return-object v0

    .line 621
    :pswitch_14
    iget-object v0, p0, Lrc2;->c:Lga4;

    .line 622
    .line 623
    check-cast v0, Lba4;

    .line 624
    .line 625
    invoke-virtual {v0}, Lba4;->d()Ljava/lang/Object;

    .line 626
    .line 627
    .line 628
    move-result-object v0

    .line 629
    check-cast v0, Ljava/lang/String;

    .line 630
    .line 631
    iget-object v1, p0, Lrc2;->b:Ljava/lang/Object;

    .line 632
    .line 633
    check-cast v1, Lmm2;

    .line 634
    .line 635
    iget-object v1, v1, Lmm2;->f:Ljava/lang/Object;

    .line 636
    .line 637
    check-cast v1, Le03;

    .line 638
    .line 639
    if-eqz v1, :cond_2

    .line 640
    .line 641
    goto :goto_0

    .line 642
    :cond_2
    new-instance v1, Le03;

    .line 643
    .line 644
    invoke-direct {v1, v0}, Le03;-><init>(Ljava/lang/String;)V

    .line 645
    .line 646
    .line 647
    :goto_0
    return-object v1

    .line 648
    :pswitch_15
    iget-object v0, p0, Lrc2;->b:Ljava/lang/Object;

    .line 649
    .line 650
    check-cast v0, Lmk2;

    .line 651
    .line 652
    iget-object v0, v0, Lmk2;->b:Lp21;

    .line 653
    .line 654
    iget-object v0, v0, Lp21;->i:Ljava/lang/Object;

    .line 655
    .line 656
    check-cast v0, Lag2;

    .line 657
    .line 658
    iget-object v1, p0, Lrc2;->c:Lga4;

    .line 659
    .line 660
    invoke-interface {v1}, Lga4;->d()Ljava/lang/Object;

    .line 661
    .line 662
    .line 663
    move-result-object v1

    .line 664
    check-cast v1, Ljava/util/concurrent/Executor;

    .line 665
    .line 666
    new-instance v2, Lsk2;

    .line 667
    .line 668
    invoke-direct {v2, v0, v1}, Lsk2;-><init>(Lag2;Ljava/util/concurrent/Executor;)V

    .line 669
    .line 670
    .line 671
    return-object v2

    .line 672
    :pswitch_16
    sget-object v0, Lmz1;->a6:Liz1;

    .line 673
    .line 674
    sget-object v1, Ltw1;->e:Ltw1;

    .line 675
    .line 676
    iget-object v1, v1, Ltw1;->c:Lkz1;

    .line 677
    .line 678
    invoke-virtual {v1, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 679
    .line 680
    .line 681
    move-result-object v0

    .line 682
    check-cast v0, Ljava/lang/Boolean;

    .line 683
    .line 684
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 685
    .line 686
    .line 687
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 688
    .line 689
    .line 690
    move-result v0

    .line 691
    iget-object v1, p0, Lrc2;->b:Ljava/lang/Object;

    .line 692
    .line 693
    check-cast v1, Ljk2;

    .line 694
    .line 695
    invoke-virtual {v1}, Ljk2;->c()Ll13;

    .line 696
    .line 697
    .line 698
    move-result-object v1

    .line 699
    iget-object v2, p0, Lrc2;->c:Lga4;

    .line 700
    .line 701
    check-cast v2, Le02;

    .line 702
    .line 703
    invoke-virtual {v2}, Le02;->b()Lb23;

    .line 704
    .line 705
    .line 706
    move-result-object v2

    .line 707
    const/4 v3, 0x1

    .line 708
    if-ne v3, v0, :cond_3

    .line 709
    .line 710
    goto :goto_1

    .line 711
    :cond_3
    move-object v1, v2

    .line 712
    :goto_1
    return-object v1

    .line 713
    :pswitch_17
    iget-object v0, p0, Lrc2;->b:Ljava/lang/Object;

    .line 714
    .line 715
    check-cast v0, Lwb2;

    .line 716
    .line 717
    invoke-virtual {v0}, Lwb2;->e()Le33;

    .line 718
    .line 719
    .line 720
    move-result-object v0

    .line 721
    iget-object v1, p0, Lrc2;->c:Lga4;

    .line 722
    .line 723
    invoke-interface {v1}, Lga4;->d()Ljava/lang/Object;

    .line 724
    .line 725
    .line 726
    move-result-object v1

    .line 727
    check-cast v1, Ljava/util/concurrent/ScheduledExecutorService;

    .line 728
    .line 729
    new-instance v2, Lx43;

    .line 730
    .line 731
    sget-object v3, Lmz1;->ld:Liz1;

    .line 732
    .line 733
    sget-object v4, Ltw1;->e:Ltw1;

    .line 734
    .line 735
    iget-object v4, v4, Ltw1;->c:Lkz1;

    .line 736
    .line 737
    invoke-virtual {v4, v3}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 738
    .line 739
    .line 740
    move-result-object v3

    .line 741
    check-cast v3, Ljava/lang/Integer;

    .line 742
    .line 743
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 744
    .line 745
    .line 746
    move-result v3

    .line 747
    int-to-long v3, v3

    .line 748
    invoke-direct {v2, v0, v3, v4, v1}, Lx43;-><init>(Lq53;JLjava/util/concurrent/ScheduledExecutorService;)V

    .line 749
    .line 750
    .line 751
    return-object v2

    .line 752
    :pswitch_18
    iget-object v0, p0, Lrc2;->b:Ljava/lang/Object;

    .line 753
    .line 754
    check-cast v0, Lku2;

    .line 755
    .line 756
    iget-object v0, v0, Lku2;->b:Lqm2;

    .line 757
    .line 758
    invoke-virtual {v0}, Lqm2;->a()Ll83;

    .line 759
    .line 760
    .line 761
    move-result-object v0

    .line 762
    new-instance v1, Lb33;

    .line 763
    .line 764
    const/4 v2, 0x2

    .line 765
    invoke-direct {v1, v2, v0}, Lb33;-><init>(ILjava/lang/Object;)V

    .line 766
    .line 767
    .line 768
    iget-object v0, p0, Lrc2;->c:Lga4;

    .line 769
    .line 770
    invoke-interface {v0}, Lga4;->d()Ljava/lang/Object;

    .line 771
    .line 772
    .line 773
    move-result-object v0

    .line 774
    check-cast v0, Ljava/util/concurrent/ScheduledExecutorService;

    .line 775
    .line 776
    new-instance v2, Lx43;

    .line 777
    .line 778
    sget-object v3, Lmz1;->pd:Liz1;

    .line 779
    .line 780
    sget-object v4, Ltw1;->e:Ltw1;

    .line 781
    .line 782
    iget-object v4, v4, Ltw1;->c:Lkz1;

    .line 783
    .line 784
    invoke-virtual {v4, v3}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 785
    .line 786
    .line 787
    move-result-object v3

    .line 788
    check-cast v3, Ljava/lang/Integer;

    .line 789
    .line 790
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 791
    .line 792
    .line 793
    move-result v3

    .line 794
    int-to-long v3, v3

    .line 795
    invoke-direct {v2, v1, v3, v4, v0}, Lx43;-><init>(Lq53;JLjava/util/concurrent/ScheduledExecutorService;)V

    .line 796
    .line 797
    .line 798
    return-object v2

    .line 799
    :pswitch_19
    iget-object v0, p0, Lrc2;->b:Ljava/lang/Object;

    .line 800
    .line 801
    check-cast v0, Lwb2;

    .line 802
    .line 803
    invoke-virtual {v0}, Lwb2;->c()Le33;

    .line 804
    .line 805
    .line 806
    move-result-object v0

    .line 807
    iget-object v1, p0, Lrc2;->c:Lga4;

    .line 808
    .line 809
    invoke-interface {v1}, Lga4;->d()Ljava/lang/Object;

    .line 810
    .line 811
    .line 812
    move-result-object v1

    .line 813
    check-cast v1, Ljava/util/concurrent/ScheduledExecutorService;

    .line 814
    .line 815
    new-instance v2, Lx43;

    .line 816
    .line 817
    sget-object v3, Lmz1;->kd:Liz1;

    .line 818
    .line 819
    sget-object v4, Ltw1;->e:Ltw1;

    .line 820
    .line 821
    iget-object v4, v4, Ltw1;->c:Lkz1;

    .line 822
    .line 823
    invoke-virtual {v4, v3}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 824
    .line 825
    .line 826
    move-result-object v3

    .line 827
    check-cast v3, Ljava/lang/Integer;

    .line 828
    .line 829
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 830
    .line 831
    .line 832
    move-result v3

    .line 833
    int-to-long v3, v3

    .line 834
    invoke-direct {v2, v0, v3, v4, v1}, Lx43;-><init>(Lq53;JLjava/util/concurrent/ScheduledExecutorService;)V

    .line 835
    .line 836
    .line 837
    return-object v2

    .line 838
    :pswitch_1a
    iget-object v0, p0, Lrc2;->c:Lga4;

    .line 839
    .line 840
    check-cast v0, Lha4;

    .line 841
    .line 842
    invoke-virtual {v0}, Lha4;->b()Ljava/util/Set;

    .line 843
    .line 844
    .line 845
    move-result-object v0

    .line 846
    iget-object v1, p0, Lrc2;->b:Ljava/lang/Object;

    .line 847
    .line 848
    check-cast v1, Lp21;

    .line 849
    .line 850
    invoke-virtual {v1, v0}, Lp21;->J(Ljava/util/Set;)Lqn2;

    .line 851
    .line 852
    .line 853
    move-result-object v0

    .line 854
    return-object v0

    .line 855
    :pswitch_1b
    iget-object v0, p0, Lrc2;->b:Ljava/lang/Object;

    .line 856
    .line 857
    check-cast v0, Lea4;

    .line 858
    .line 859
    invoke-virtual {v0}, Lea4;->b()Ljava/util/Map;

    .line 860
    .line 861
    .line 862
    move-result-object v0

    .line 863
    iget-object v1, p0, Lrc2;->c:Lga4;

    .line 864
    .line 865
    check-cast v1, Lea4;

    .line 866
    .line 867
    invoke-virtual {v1}, Lea4;->b()Ljava/util/Map;

    .line 868
    .line 869
    .line 870
    move-result-object v1

    .line 871
    new-instance v2, Ltb1;

    .line 872
    .line 873
    invoke-direct {v2, v0, v1}, Ltb1;-><init>(Ljava/util/Map;Ljava/util/Map;)V

    .line 874
    .line 875
    .line 876
    return-object v2

    .line 877
    :pswitch_1c
    iget-object v0, p0, Lrc2;->b:Ljava/lang/Object;

    .line 878
    .line 879
    check-cast v0, Lda4;

    .line 880
    .line 881
    iget-object v0, v0, Lda4;->a:Ljava/lang/Object;

    .line 882
    .line 883
    check-cast v0, Landroid/content/Context;

    .line 884
    .line 885
    iget-object v1, p0, Lrc2;->c:Lga4;

    .line 886
    .line 887
    check-cast v1, Lxb2;

    .line 888
    .line 889
    iget-object v2, v1, Lxb2;->c:Lda4;

    .line 890
    .line 891
    iget-object v2, v2, Lda4;->a:Ljava/lang/Object;

    .line 892
    .line 893
    check-cast v2, Lym;

    .line 894
    .line 895
    iget-object v1, v1, Lxb2;->b:Lba4;

    .line 896
    .line 897
    invoke-virtual {v1}, Lba4;->d()Ljava/lang/Object;

    .line 898
    .line 899
    .line 900
    move-result-object v1

    .line 901
    new-instance v3, Lgw3;

    .line 902
    .line 903
    check-cast v1, Lvb2;

    .line 904
    .line 905
    const/16 v4, 0x18

    .line 906
    .line 907
    const/4 v5, 0x0

    .line 908
    invoke-direct {v3, v2, v1, v4, v5}, Lgw3;-><init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 909
    .line 910
    .line 911
    new-instance v1, Lqc2;

    .line 912
    .line 913
    invoke-direct {v1, v0, v3}, Lqc2;-><init>(Landroid/content/Context;Lgw3;)V

    .line 914
    .line 915
    .line 916
    return-object v1

    .line 917
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
