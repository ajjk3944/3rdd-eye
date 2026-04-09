.class public final Lek;
.super Le50;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ldy;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ljava/lang/Object;

.field public final synthetic i:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p3, p0, Lek;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lek;->h:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p2, p0, Lek;->i:Ljava/lang/Object;

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    invoke-direct {p0, p1}, Le50;-><init>(I)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lek;->g:I

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    move-object/from16 v1, p1

    .line 9
    .line 10
    check-cast v1, Ljava/lang/Throwable;

    .line 11
    .line 12
    iget-object v2, v0, Lek;->h:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v2, Lcu0;

    .line 15
    .line 16
    invoke-virtual {v2, v1}, Lcu0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    iget-object v2, v0, Lek;->i:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v2, Lmc2;

    .line 22
    .line 23
    iget-object v2, v2, Lmc2;->i:Ljava/lang/Object;

    .line 24
    .line 25
    move-object v3, v2

    .line 26
    check-cast v3, Lbc;

    .line 27
    .line 28
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    sget-object v2, Lbc;->b:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 32
    .line 33
    sget-object v4, Lbc;->i:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 34
    .line 35
    sget-object v5, Ldc;->r:Lgs3;

    .line 36
    .line 37
    :cond_0
    invoke-virtual {v4, v3, v5, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v6

    .line 41
    const/4 v9, 0x0

    .line 42
    const/4 v10, 0x1

    .line 43
    if-eqz v6, :cond_1

    .line 44
    .line 45
    move v11, v10

    .line 46
    goto :goto_0

    .line 47
    :cond_1
    invoke-virtual {v4, v3}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v6

    .line 51
    if-eq v6, v5, :cond_0

    .line 52
    .line 53
    move v11, v9

    .line 54
    :goto_0
    invoke-virtual {v2, v3}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 55
    .line 56
    .line 57
    move-result-wide v5

    .line 58
    const/16 v4, 0x3c

    .line 59
    .line 60
    shr-long v7, v5, v4

    .line 61
    .line 62
    long-to-int v7, v7

    .line 63
    const-wide v12, 0xfffffffffffffffL

    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    if-eqz v7, :cond_3

    .line 69
    .line 70
    if-eq v7, v10, :cond_2

    .line 71
    .line 72
    goto :goto_3

    .line 73
    :cond_2
    and-long v7, v5, v12

    .line 74
    .line 75
    const/4 v14, 0x3

    .line 76
    :goto_1
    int-to-long v14, v14

    .line 77
    shl-long/2addr v14, v4

    .line 78
    add-long/2addr v14, v7

    .line 79
    move-object v4, v3

    .line 80
    move-wide v7, v14

    .line 81
    move-object v3, v2

    .line 82
    goto :goto_2

    .line 83
    :cond_3
    and-long v7, v5, v12

    .line 84
    .line 85
    const/4 v14, 0x2

    .line 86
    goto :goto_1

    .line 87
    :goto_2
    invoke-virtual/range {v3 .. v8}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    .line 88
    .line 89
    .line 90
    move-result v2

    .line 91
    move-object v6, v3

    .line 92
    move-object v3, v4

    .line 93
    if-eqz v2, :cond_1c

    .line 94
    .line 95
    :goto_3
    invoke-virtual {v3}, Lbc;->c()V

    .line 96
    .line 97
    .line 98
    if-eqz v11, :cond_8

    .line 99
    .line 100
    sget-object v2, Lbc;->j:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 101
    .line 102
    :goto_4
    invoke-virtual {v2, v3}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v4

    .line 106
    if-nez v4, :cond_4

    .line 107
    .line 108
    sget-object v5, Ldc;->p:Lgs3;

    .line 109
    .line 110
    goto :goto_5

    .line 111
    :cond_4
    sget-object v5, Ldc;->q:Lgs3;

    .line 112
    .line 113
    :cond_5
    :goto_5
    invoke-virtual {v2, v3, v4, v5}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    move-result v6

    .line 117
    if-eqz v6, :cond_7

    .line 118
    .line 119
    if-nez v4, :cond_6

    .line 120
    .line 121
    goto :goto_6

    .line 122
    :cond_6
    invoke-static {v10, v4}, Lqb1;->b(ILjava/lang/Object;)V

    .line 123
    .line 124
    .line 125
    check-cast v4, Ldy;

    .line 126
    .line 127
    sget-object v2, Lbc;->i:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 128
    .line 129
    invoke-virtual {v2, v3}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v2

    .line 133
    check-cast v2, Ljava/lang/Throwable;

    .line 134
    .line 135
    invoke-interface {v4, v2}, Ldy;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    goto :goto_6

    .line 139
    :cond_7
    invoke-virtual {v2, v3}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v6

    .line 143
    if-eq v6, v4, :cond_5

    .line 144
    .line 145
    goto :goto_4

    .line 146
    :cond_8
    :goto_6
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 147
    .line 148
    .line 149
    sget-object v2, Lzt0;->h:Lge;

    .line 150
    .line 151
    sget-object v11, Lbc;->c:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 152
    .line 153
    invoke-virtual {v11, v3}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 154
    .line 155
    .line 156
    move-result-wide v4

    .line 157
    sget-object v6, Lbc;->b:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 158
    .line 159
    invoke-virtual {v6, v3}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 160
    .line 161
    .line 162
    move-result-wide v6

    .line 163
    invoke-virtual {v3, v6, v7, v10}, Lbc;->i(JZ)Z

    .line 164
    .line 165
    .line 166
    move-result v8

    .line 167
    const/4 v14, 0x0

    .line 168
    if-eqz v8, :cond_9

    .line 169
    .line 170
    sget-object v2, Lbc;->i:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 171
    .line 172
    invoke-virtual {v2, v3}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v2

    .line 176
    check-cast v2, Ljava/lang/Throwable;

    .line 177
    .line 178
    new-instance v4, Lfe;

    .line 179
    .line 180
    invoke-direct {v4, v2}, Lfe;-><init>(Ljava/lang/Throwable;)V

    .line 181
    .line 182
    .line 183
    :goto_7
    move-object v2, v4

    .line 184
    goto/16 :goto_b

    .line 185
    .line 186
    :cond_9
    and-long/2addr v6, v12

    .line 187
    cmp-long v4, v4, v6

    .line 188
    .line 189
    if-ltz v4, :cond_a

    .line 190
    .line 191
    goto/16 :goto_b

    .line 192
    .line 193
    :cond_a
    sget-object v8, Ldc;->k:Lgs3;

    .line 194
    .line 195
    sget-object v4, Lbc;->g:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 196
    .line 197
    invoke-virtual {v4, v3}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object v4

    .line 201
    check-cast v4, Lhe;

    .line 202
    .line 203
    :goto_8
    sget-object v5, Lbc;->b:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 204
    .line 205
    invoke-virtual {v5, v3}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 206
    .line 207
    .line 208
    move-result-wide v5

    .line 209
    invoke-virtual {v3, v5, v6, v10}, Lbc;->i(JZ)Z

    .line 210
    .line 211
    .line 212
    move-result v5

    .line 213
    if-eqz v5, :cond_b

    .line 214
    .line 215
    sget-object v2, Lbc;->i:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 216
    .line 217
    invoke-virtual {v2, v3}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    move-result-object v2

    .line 221
    check-cast v2, Ljava/lang/Throwable;

    .line 222
    .line 223
    new-instance v4, Lfe;

    .line 224
    .line 225
    invoke-direct {v4, v2}, Lfe;-><init>(Ljava/lang/Throwable;)V

    .line 226
    .line 227
    .line 228
    goto :goto_7

    .line 229
    :cond_b
    invoke-virtual {v11, v3}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->getAndIncrement(Ljava/lang/Object;)J

    .line 230
    .line 231
    .line 232
    move-result-wide v6

    .line 233
    sget v5, Ldc;->b:I

    .line 234
    .line 235
    move-object v15, v11

    .line 236
    int-to-long v10, v5

    .line 237
    div-long v12, v6, v10

    .line 238
    .line 239
    rem-long v10, v6, v10

    .line 240
    .line 241
    long-to-int v5, v10

    .line 242
    iget-wide v10, v4, Lyt0;->c:J

    .line 243
    .line 244
    cmp-long v10, v10, v12

    .line 245
    .line 246
    if-eqz v10, :cond_e

    .line 247
    .line 248
    invoke-virtual {v3, v12, v13, v4}, Lbc;->e(JLhe;)Lhe;

    .line 249
    .line 250
    .line 251
    move-result-object v10

    .line 252
    if-nez v10, :cond_d

    .line 253
    .line 254
    :cond_c
    :goto_9
    move-object v11, v15

    .line 255
    const/4 v10, 0x1

    .line 256
    const-wide v12, 0xfffffffffffffffL

    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    goto :goto_8

    .line 262
    :cond_d
    move-object v4, v10

    .line 263
    :cond_e
    invoke-virtual/range {v3 .. v8}, Lbc;->o(Lhe;IJLjava/lang/Object;)Ljava/lang/Object;

    .line 264
    .line 265
    .line 266
    move-result-object v10

    .line 267
    sget-object v11, Ldc;->m:Lgs3;

    .line 268
    .line 269
    if-ne v10, v11, :cond_11

    .line 270
    .line 271
    instance-of v10, v8, Lw71;

    .line 272
    .line 273
    if-eqz v10, :cond_f

    .line 274
    .line 275
    check-cast v8, Lw71;

    .line 276
    .line 277
    goto :goto_a

    .line 278
    :cond_f
    move-object v8, v14

    .line 279
    :goto_a
    if-eqz v8, :cond_10

    .line 280
    .line 281
    invoke-interface {v8, v4, v5}, Lw71;->a(Lyt0;I)V

    .line 282
    .line 283
    .line 284
    :cond_10
    invoke-virtual {v3, v6, v7}, Lbc;->q(J)V

    .line 285
    .line 286
    .line 287
    invoke-virtual {v4}, Lyt0;->h()V

    .line 288
    .line 289
    .line 290
    goto :goto_b

    .line 291
    :cond_11
    sget-object v5, Ldc;->o:Lgs3;

    .line 292
    .line 293
    if-ne v10, v5, :cond_12

    .line 294
    .line 295
    invoke-virtual {v3}, Lbc;->g()J

    .line 296
    .line 297
    .line 298
    move-result-wide v10

    .line 299
    cmp-long v5, v6, v10

    .line 300
    .line 301
    if-gez v5, :cond_c

    .line 302
    .line 303
    invoke-virtual {v4}, Lnh;->a()V

    .line 304
    .line 305
    .line 306
    goto :goto_9

    .line 307
    :cond_12
    sget-object v2, Ldc;->n:Lgs3;

    .line 308
    .line 309
    if-eq v10, v2, :cond_1b

    .line 310
    .line 311
    invoke-virtual {v4}, Lnh;->a()V

    .line 312
    .line 313
    .line 314
    move-object v2, v10

    .line 315
    :goto_b
    instance-of v4, v2, Lge;

    .line 316
    .line 317
    if-nez v4, :cond_13

    .line 318
    .line 319
    goto :goto_c

    .line 320
    :cond_13
    move-object v2, v14

    .line 321
    :goto_c
    sget-object v4, Lz31;->a:Lz31;

    .line 322
    .line 323
    if-nez v2, :cond_14

    .line 324
    .line 325
    goto :goto_f

    .line 326
    :cond_14
    check-cast v2, Ljw0;

    .line 327
    .line 328
    instance-of v5, v2, Liw0;

    .line 329
    .line 330
    if-eqz v5, :cond_19

    .line 331
    .line 332
    check-cast v2, Liw0;

    .line 333
    .line 334
    iget-object v2, v2, Liw0;->b:Lmg;

    .line 335
    .line 336
    if-nez v1, :cond_15

    .line 337
    .line 338
    new-instance v5, Ljava/util/concurrent/CancellationException;

    .line 339
    .line 340
    const-string v6, "DataStore scope was cancelled before updateData could complete"

    .line 341
    .line 342
    invoke-direct {v5, v6}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    .line 343
    .line 344
    .line 345
    goto :goto_d

    .line 346
    :cond_15
    move-object v5, v1

    .line 347
    :goto_d
    new-instance v6, Lpg;

    .line 348
    .line 349
    invoke-direct {v6, v5, v9}, Lpg;-><init>(Ljava/lang/Throwable;Z)V

    .line 350
    .line 351
    .line 352
    :cond_16
    invoke-virtual {v2}, Lg40;->A()Ljava/lang/Object;

    .line 353
    .line 354
    .line 355
    move-result-object v5

    .line 356
    invoke-virtual {v2, v5, v6}, Lg40;->P(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 357
    .line 358
    .line 359
    move-result-object v5

    .line 360
    sget-object v7, Lwl2;->b:Lgs3;

    .line 361
    .line 362
    if-ne v5, v7, :cond_17

    .line 363
    .line 364
    goto :goto_e

    .line 365
    :cond_17
    sget-object v7, Lwl2;->c:Lgs3;

    .line 366
    .line 367
    if-ne v5, v7, :cond_18

    .line 368
    .line 369
    goto :goto_e

    .line 370
    :cond_18
    sget-object v7, Lwl2;->d:Lgs3;

    .line 371
    .line 372
    if-eq v5, v7, :cond_16

    .line 373
    .line 374
    :cond_19
    :goto_e
    move-object v14, v4

    .line 375
    :goto_f
    if-nez v14, :cond_1a

    .line 376
    .line 377
    return-object v4

    .line 378
    :cond_1a
    const/4 v10, 0x1

    .line 379
    const-wide v12, 0xfffffffffffffffL

    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    goto/16 :goto_6

    .line 385
    .line 386
    :cond_1b
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 387
    .line 388
    const-string v2, "unexpected"

    .line 389
    .line 390
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 391
    .line 392
    .line 393
    throw v1

    .line 394
    :cond_1c
    move-object v2, v6

    .line 395
    goto/16 :goto_0

    .line 396
    .line 397
    :pswitch_0
    move-object/from16 v1, p1

    .line 398
    .line 399
    check-cast v1, Ljava/lang/Throwable;

    .line 400
    .line 401
    iget-object v2, v0, Lek;->h:Ljava/lang/Object;

    .line 402
    .line 403
    check-cast v2, Lyc;

    .line 404
    .line 405
    if-eqz v1, :cond_1e

    .line 406
    .line 407
    instance-of v3, v1, Ljava/util/concurrent/CancellationException;

    .line 408
    .line 409
    if-eqz v3, :cond_1d

    .line 410
    .line 411
    const/4 v1, 0x1

    .line 412
    iput-boolean v1, v2, Lyc;->d:Z

    .line 413
    .line 414
    iget-object v3, v2, Lyc;->b:Lbd;

    .line 415
    .line 416
    if-eqz v3, :cond_1f

    .line 417
    .line 418
    iget-object v3, v3, Lbd;->g:Lad;

    .line 419
    .line 420
    invoke-virtual {v3, v1}, Lk0;->cancel(Z)Z

    .line 421
    .line 422
    .line 423
    move-result v1

    .line 424
    if-eqz v1, :cond_1f

    .line 425
    .line 426
    const/4 v1, 0x0

    .line 427
    iput-object v1, v2, Lyc;->a:Ljava/lang/Object;

    .line 428
    .line 429
    iput-object v1, v2, Lyc;->b:Lbd;

    .line 430
    .line 431
    iput-object v1, v2, Lyc;->c:Lup0;

    .line 432
    .line 433
    goto :goto_10

    .line 434
    :cond_1d
    invoke-virtual {v2, v1}, Lyc;->b(Ljava/lang/Throwable;)V

    .line 435
    .line 436
    .line 437
    goto :goto_10

    .line 438
    :cond_1e
    iget-object v1, v0, Lek;->i:Ljava/lang/Object;

    .line 439
    .line 440
    check-cast v1, Lyn;

    .line 441
    .line 442
    invoke-virtual {v1}, Lg40;->A()Ljava/lang/Object;

    .line 443
    .line 444
    .line 445
    move-result-object v1

    .line 446
    instance-of v3, v1, Ll20;

    .line 447
    .line 448
    if-nez v3, :cond_21

    .line 449
    .line 450
    instance-of v3, v1, Lpg;

    .line 451
    .line 452
    if-nez v3, :cond_20

    .line 453
    .line 454
    invoke-static {v1}, Lwl2;->x(Ljava/lang/Object;)Ljava/lang/Object;

    .line 455
    .line 456
    .line 457
    move-result-object v1

    .line 458
    invoke-virtual {v2, v1}, Lyc;->a(Ljava/lang/Object;)V

    .line 459
    .line 460
    .line 461
    :cond_1f
    :goto_10
    sget-object v1, Lz31;->a:Lz31;

    .line 462
    .line 463
    return-object v1

    .line 464
    :cond_20
    check-cast v1, Lpg;

    .line 465
    .line 466
    iget-object v1, v1, Lpg;->a:Ljava/lang/Throwable;

    .line 467
    .line 468
    throw v1

    .line 469
    :cond_21
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 470
    .line 471
    const-string v2, "This job has not completed yet"

    .line 472
    .line 473
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 474
    .line 475
    .line 476
    throw v1

    .line 477
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
