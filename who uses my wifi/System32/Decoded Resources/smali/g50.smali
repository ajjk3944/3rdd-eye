.class public abstract Lg50;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# static fields
.field public static final a:Ll92;

.field public static final b:Ll92;

.field public static final c:Ll92;


# direct methods
.method static constructor <clinit>()V
    .locals 26

    .line 1
    const-string v24, "ao"

    .line 2
    .line 3
    const-string v25, "bm"

    .line 4
    .line 5
    const-string v1, "nm"

    .line 6
    .line 7
    const-string v2, "ind"

    .line 8
    .line 9
    const-string v3, "refId"

    .line 10
    .line 11
    const-string v4, "ty"

    .line 12
    .line 13
    const-string v5, "parent"

    .line 14
    .line 15
    const-string v6, "sw"

    .line 16
    .line 17
    const-string v7, "sh"

    .line 18
    .line 19
    const-string v8, "sc"

    .line 20
    .line 21
    const-string v9, "ks"

    .line 22
    .line 23
    const-string v10, "tt"

    .line 24
    .line 25
    const-string v11, "masksProperties"

    .line 26
    .line 27
    const-string v12, "shapes"

    .line 28
    .line 29
    const-string v13, "t"

    .line 30
    .line 31
    const-string v14, "ef"

    .line 32
    .line 33
    const-string v15, "sr"

    .line 34
    .line 35
    const-string v16, "st"

    .line 36
    .line 37
    const-string v17, "w"

    .line 38
    .line 39
    const-string v18, "h"

    .line 40
    .line 41
    const-string v19, "ip"

    .line 42
    .line 43
    const-string v20, "op"

    .line 44
    .line 45
    const-string v21, "tm"

    .line 46
    .line 47
    const-string v22, "cl"

    .line 48
    .line 49
    const-string v23, "hd"

    .line 50
    .line 51
    filled-new-array/range {v1 .. v25}, [Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-static {v0}, Ll92;->D([Ljava/lang/String;)Ll92;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    sput-object v0, Lg50;->a:Ll92;

    .line 60
    .line 61
    const-string v0, "d"

    .line 62
    .line 63
    const-string v1, "a"

    .line 64
    .line 65
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    invoke-static {v0}, Ll92;->D([Ljava/lang/String;)Ll92;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    sput-object v0, Lg50;->b:Ll92;

    .line 74
    .line 75
    const-string v0, "ty"

    .line 76
    .line 77
    const-string v1, "nm"

    .line 78
    .line 79
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    invoke-static {v0}, Ll92;->D([Ljava/lang/String;)Ll92;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    sput-object v0, Lg50;->c:Ll92;

    .line 88
    .line 89
    return-void
.end method

.method public static a(Lj40;Lu80;)Lf50;
    .locals 51

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const/4 v7, 0x0

    .line 6
    invoke-static {v7}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    const/high16 v3, 0x3f800000    # 1.0f

    .line 11
    .line 12
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 13
    .line 14
    .line 15
    move-result-object v8

    .line 16
    new-instance v10, Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 19
    .line 20
    .line 21
    new-instance v9, Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Lj40;->c()V

    .line 27
    .line 28
    .line 29
    const-string v6, "UNSET"

    .line 30
    .line 31
    const-wide/16 v12, 0x0

    .line 32
    .line 33
    const-wide/16 v14, -0x1

    .line 34
    .line 35
    move/from16 v17, v7

    .line 36
    .line 37
    move/from16 v18, v17

    .line 38
    .line 39
    move/from16 v25, v18

    .line 40
    .line 41
    move/from16 v26, v25

    .line 42
    .line 43
    move/from16 v27, v26

    .line 44
    .line 45
    move/from16 v36, v27

    .line 46
    .line 47
    move-object/from16 v16, v8

    .line 48
    .line 49
    move-wide v7, v14

    .line 50
    const/16 v19, 0x0

    .line 51
    .line 52
    const/16 v20, 0x0

    .line 53
    .line 54
    const/16 v21, 0x0

    .line 55
    .line 56
    const/16 v22, 0x0

    .line 57
    .line 58
    const/16 v23, 0x0

    .line 59
    .line 60
    const/16 v24, 0x0

    .line 61
    .line 62
    const/16 v28, 0x0

    .line 63
    .line 64
    const/16 v29, 0x0

    .line 65
    .line 66
    const/16 v30, 0x0

    .line 67
    .line 68
    const/16 v31, 0x1

    .line 69
    .line 70
    const/16 v32, 0x1

    .line 71
    .line 72
    const/16 v33, 0x0

    .line 73
    .line 74
    const/16 v34, 0x0

    .line 75
    .line 76
    const/16 v35, 0x0

    .line 77
    .line 78
    move v15, v3

    .line 79
    move-wide v13, v12

    .line 80
    const/4 v3, 0x0

    .line 81
    move-object v12, v6

    .line 82
    :cond_0
    const/4 v6, 0x0

    .line 83
    :goto_0
    invoke-virtual {v0}, Lj40;->i()Z

    .line 84
    .line 85
    .line 86
    move-result v37

    .line 87
    if-eqz v37, :cond_42

    .line 88
    .line 89
    sget-object v11, Lg50;->a:Ll92;

    .line 90
    .line 91
    invoke-virtual {v0, v11}, Lj40;->q(Ll92;)I

    .line 92
    .line 93
    .line 94
    move-result v11

    .line 95
    const/16 v38, -0x1

    .line 96
    .line 97
    packed-switch v11, :pswitch_data_0

    .line 98
    .line 99
    .line 100
    invoke-virtual {v0}, Lj40;->r()V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v0}, Lj40;->s()V

    .line 104
    .line 105
    .line 106
    move-object/from16 v42, v2

    .line 107
    .line 108
    move-object/from16 v43, v3

    .line 109
    .line 110
    :goto_1
    move/from16 v44, v6

    .line 111
    .line 112
    move-wide/from16 v45, v7

    .line 113
    .line 114
    const/4 v7, 0x0

    .line 115
    goto/16 :goto_1f

    .line 116
    .line 117
    :pswitch_0
    invoke-virtual {v0}, Lj40;->m()I

    .line 118
    .line 119
    .line 120
    move-result v4

    .line 121
    const/16 v32, 0x12

    .line 122
    .line 123
    invoke-static/range {v32 .. v32}, Lex0;->v(I)[I

    .line 124
    .line 125
    .line 126
    move-result-object v11

    .line 127
    array-length v11, v11

    .line 128
    if-lt v4, v11, :cond_1

    .line 129
    .line 130
    new-instance v11, Ljava/lang/StringBuilder;

    .line 131
    .line 132
    const-string v5, "Unsupported Blend Mode: "

    .line 133
    .line 134
    invoke-direct {v11, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {v11, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 138
    .line 139
    .line 140
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object v4

    .line 144
    invoke-virtual {v1, v4}, Lu80;->a(Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    const/16 v32, 0x1

    .line 148
    .line 149
    goto :goto_0

    .line 150
    :cond_1
    invoke-static/range {v32 .. v32}, Lex0;->v(I)[I

    .line 151
    .line 152
    .line 153
    move-result-object v5

    .line 154
    aget v32, v5, v4

    .line 155
    .line 156
    goto :goto_0

    .line 157
    :pswitch_1
    invoke-virtual {v0}, Lj40;->m()I

    .line 158
    .line 159
    .line 160
    move-result v4

    .line 161
    const/4 v5, 0x1

    .line 162
    if-ne v4, v5, :cond_0

    .line 163
    .line 164
    const/4 v6, 0x1

    .line 165
    goto :goto_0

    .line 166
    :pswitch_2
    invoke-virtual {v0}, Lj40;->k()Z

    .line 167
    .line 168
    .line 169
    move-result v28

    .line 170
    goto :goto_0

    .line 171
    :pswitch_3
    invoke-virtual {v0}, Lj40;->n()Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v3

    .line 175
    goto :goto_0

    .line 176
    :pswitch_4
    const/4 v4, 0x0

    .line 177
    invoke-static {v0, v1, v4}, Lyc0;->f(Li40;Lu80;Z)Lc4;

    .line 178
    .line 179
    .line 180
    move-result-object v35

    .line 181
    goto :goto_0

    .line 182
    :pswitch_5
    invoke-virtual {v0}, Lj40;->l()D

    .line 183
    .line 184
    .line 185
    move-result-wide v4

    .line 186
    double-to-float v4, v4

    .line 187
    move/from16 v18, v4

    .line 188
    .line 189
    goto :goto_0

    .line 190
    :pswitch_6
    invoke-virtual {v0}, Lj40;->l()D

    .line 191
    .line 192
    .line 193
    move-result-wide v4

    .line 194
    double-to-float v4, v4

    .line 195
    move/from16 v17, v4

    .line 196
    .line 197
    goto :goto_0

    .line 198
    :pswitch_7
    invoke-virtual {v0}, Lj40;->l()D

    .line 199
    .line 200
    .line 201
    move-result-wide v4

    .line 202
    invoke-static {}, Ll41;->c()F

    .line 203
    .line 204
    .line 205
    move-result v11

    .line 206
    move-object/from16 v42, v2

    .line 207
    .line 208
    move-object/from16 v43, v3

    .line 209
    .line 210
    float-to-double v2, v11

    .line 211
    mul-double/2addr v4, v2

    .line 212
    double-to-float v2, v4

    .line 213
    move/from16 v26, v2

    .line 214
    .line 215
    :goto_2
    move-object/from16 v2, v42

    .line 216
    .line 217
    move-object/from16 v3, v43

    .line 218
    .line 219
    goto/16 :goto_0

    .line 220
    .line 221
    :pswitch_8
    move-object/from16 v42, v2

    .line 222
    .line 223
    move-object/from16 v43, v3

    .line 224
    .line 225
    invoke-virtual {v0}, Lj40;->l()D

    .line 226
    .line 227
    .line 228
    move-result-wide v2

    .line 229
    invoke-static {}, Ll41;->c()F

    .line 230
    .line 231
    .line 232
    move-result v4

    .line 233
    float-to-double v4, v4

    .line 234
    mul-double/2addr v2, v4

    .line 235
    double-to-float v2, v2

    .line 236
    move/from16 v25, v2

    .line 237
    .line 238
    goto :goto_2

    .line 239
    :pswitch_9
    move-object/from16 v42, v2

    .line 240
    .line 241
    move-object/from16 v43, v3

    .line 242
    .line 243
    invoke-virtual {v0}, Lj40;->l()D

    .line 244
    .line 245
    .line 246
    move-result-wide v2

    .line 247
    double-to-float v2, v2

    .line 248
    move/from16 v27, v2

    .line 249
    .line 250
    goto :goto_2

    .line 251
    :pswitch_a
    move-object/from16 v42, v2

    .line 252
    .line 253
    move-object/from16 v43, v3

    .line 254
    .line 255
    invoke-virtual {v0}, Lj40;->l()D

    .line 256
    .line 257
    .line 258
    move-result-wide v2

    .line 259
    double-to-float v15, v2

    .line 260
    goto :goto_2

    .line 261
    :pswitch_b
    move-object/from16 v42, v2

    .line 262
    .line 263
    move-object/from16 v43, v3

    .line 264
    .line 265
    invoke-virtual {v0}, Lj40;->a()V

    .line 266
    .line 267
    .line 268
    new-instance v2, Ljava/util/ArrayList;

    .line 269
    .line 270
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 271
    .line 272
    .line 273
    :goto_3
    invoke-virtual {v0}, Lj40;->i()Z

    .line 274
    .line 275
    .line 276
    move-result v3

    .line 277
    if-eqz v3, :cond_1b

    .line 278
    .line 279
    invoke-virtual {v0}, Lj40;->c()V

    .line 280
    .line 281
    .line 282
    :cond_2
    :goto_4
    invoke-virtual {v0}, Lj40;->i()Z

    .line 283
    .line 284
    .line 285
    move-result v3

    .line 286
    if-eqz v3, :cond_1a

    .line 287
    .line 288
    sget-object v3, Lg50;->c:Ll92;

    .line 289
    .line 290
    invoke-virtual {v0, v3}, Lj40;->q(Ll92;)I

    .line 291
    .line 292
    .line 293
    move-result v3

    .line 294
    if-eqz v3, :cond_4

    .line 295
    .line 296
    const/4 v5, 0x1

    .line 297
    if-eq v3, v5, :cond_3

    .line 298
    .line 299
    invoke-virtual {v0}, Lj40;->r()V

    .line 300
    .line 301
    .line 302
    invoke-virtual {v0}, Lj40;->s()V

    .line 303
    .line 304
    .line 305
    goto :goto_4

    .line 306
    :cond_3
    invoke-virtual {v0}, Lj40;->n()Ljava/lang/String;

    .line 307
    .line 308
    .line 309
    move-result-object v3

    .line 310
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 311
    .line 312
    .line 313
    goto :goto_4

    .line 314
    :cond_4
    invoke-virtual {v0}, Lj40;->m()I

    .line 315
    .line 316
    .line 317
    move-result v3

    .line 318
    const/16 v5, 0x1d

    .line 319
    .line 320
    if-ne v3, v5, :cond_d

    .line 321
    .line 322
    sget-object v3, Lbb;->a:Ll92;

    .line 323
    .line 324
    const/16 v29, 0x0

    .line 325
    .line 326
    :goto_5
    invoke-virtual {v0}, Lj40;->i()Z

    .line 327
    .line 328
    .line 329
    move-result v3

    .line 330
    if-eqz v3, :cond_2

    .line 331
    .line 332
    sget-object v3, Lbb;->a:Ll92;

    .line 333
    .line 334
    invoke-virtual {v0, v3}, Lj40;->q(Ll92;)I

    .line 335
    .line 336
    .line 337
    move-result v3

    .line 338
    if-eqz v3, :cond_5

    .line 339
    .line 340
    invoke-virtual {v0}, Lj40;->r()V

    .line 341
    .line 342
    .line 343
    invoke-virtual {v0}, Lj40;->s()V

    .line 344
    .line 345
    .line 346
    goto :goto_5

    .line 347
    :cond_5
    invoke-virtual {v0}, Lj40;->a()V

    .line 348
    .line 349
    .line 350
    :cond_6
    :goto_6
    invoke-virtual {v0}, Lj40;->i()Z

    .line 351
    .line 352
    .line 353
    move-result v3

    .line 354
    if-eqz v3, :cond_c

    .line 355
    .line 356
    invoke-virtual {v0}, Lj40;->c()V

    .line 357
    .line 358
    .line 359
    const/4 v3, 0x0

    .line 360
    const/4 v5, 0x0

    .line 361
    :goto_7
    invoke-virtual {v0}, Lj40;->i()Z

    .line 362
    .line 363
    .line 364
    move-result v11

    .line 365
    if-eqz v11, :cond_b

    .line 366
    .line 367
    sget-object v11, Lbb;->b:Ll92;

    .line 368
    .line 369
    invoke-virtual {v0, v11}, Lj40;->q(Ll92;)I

    .line 370
    .line 371
    .line 372
    move-result v11

    .line 373
    if-eqz v11, :cond_9

    .line 374
    .line 375
    const/4 v4, 0x1

    .line 376
    if-eq v11, v4, :cond_7

    .line 377
    .line 378
    invoke-virtual {v0}, Lj40;->r()V

    .line 379
    .line 380
    .line 381
    invoke-virtual {v0}, Lj40;->s()V

    .line 382
    .line 383
    .line 384
    goto :goto_7

    .line 385
    :cond_7
    if-eqz v3, :cond_8

    .line 386
    .line 387
    new-instance v5, Lkf3;

    .line 388
    .line 389
    invoke-static {v0, v1, v4}, Lyc0;->f(Li40;Lu80;Z)Lc4;

    .line 390
    .line 391
    .line 392
    move-result-object v11

    .line 393
    const/4 v4, 0x2

    .line 394
    invoke-direct {v5, v4, v11}, Lkf3;-><init>(ILjava/lang/Object;)V

    .line 395
    .line 396
    .line 397
    goto :goto_7

    .line 398
    :cond_8
    invoke-virtual {v0}, Lj40;->s()V

    .line 399
    .line 400
    .line 401
    goto :goto_7

    .line 402
    :cond_9
    invoke-virtual {v0}, Lj40;->m()I

    .line 403
    .line 404
    .line 405
    move-result v3

    .line 406
    if-nez v3, :cond_a

    .line 407
    .line 408
    const/4 v3, 0x1

    .line 409
    goto :goto_7

    .line 410
    :cond_a
    const/4 v3, 0x0

    .line 411
    goto :goto_7

    .line 412
    :cond_b
    invoke-virtual {v0}, Lj40;->g()V

    .line 413
    .line 414
    .line 415
    if-eqz v5, :cond_6

    .line 416
    .line 417
    move-object/from16 v29, v5

    .line 418
    .line 419
    goto :goto_6

    .line 420
    :cond_c
    invoke-virtual {v0}, Lj40;->f()V

    .line 421
    .line 422
    .line 423
    goto :goto_5

    .line 424
    :cond_d
    const/16 v4, 0x19

    .line 425
    .line 426
    if-ne v3, v4, :cond_2

    .line 427
    .line 428
    new-instance v3, Lnq;

    .line 429
    .line 430
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 431
    .line 432
    .line 433
    :goto_8
    invoke-virtual {v0}, Lj40;->i()Z

    .line 434
    .line 435
    .line 436
    move-result v4

    .line 437
    if-eqz v4, :cond_18

    .line 438
    .line 439
    sget-object v4, Lnq;->f:Ll92;

    .line 440
    .line 441
    invoke-virtual {v0, v4}, Lj40;->q(Ll92;)I

    .line 442
    .line 443
    .line 444
    move-result v4

    .line 445
    if-eqz v4, :cond_e

    .line 446
    .line 447
    invoke-virtual {v0}, Lj40;->r()V

    .line 448
    .line 449
    .line 450
    invoke-virtual {v0}, Lj40;->s()V

    .line 451
    .line 452
    .line 453
    goto :goto_8

    .line 454
    :cond_e
    invoke-virtual {v0}, Lj40;->a()V

    .line 455
    .line 456
    .line 457
    :goto_9
    invoke-virtual {v0}, Lj40;->i()Z

    .line 458
    .line 459
    .line 460
    move-result v4

    .line 461
    if-eqz v4, :cond_17

    .line 462
    .line 463
    invoke-virtual {v0}, Lj40;->c()V

    .line 464
    .line 465
    .line 466
    const-string v4, ""

    .line 467
    .line 468
    :goto_a
    invoke-virtual {v0}, Lj40;->i()Z

    .line 469
    .line 470
    .line 471
    move-result v5

    .line 472
    if-eqz v5, :cond_16

    .line 473
    .line 474
    sget-object v5, Lnq;->g:Ll92;

    .line 475
    .line 476
    invoke-virtual {v0, v5}, Lj40;->q(Ll92;)I

    .line 477
    .line 478
    .line 479
    move-result v5

    .line 480
    if-eqz v5, :cond_15

    .line 481
    .line 482
    const/4 v11, 0x1

    .line 483
    if-eq v5, v11, :cond_f

    .line 484
    .line 485
    invoke-virtual {v0}, Lj40;->r()V

    .line 486
    .line 487
    .line 488
    invoke-virtual {v0}, Lj40;->s()V

    .line 489
    .line 490
    .line 491
    goto :goto_a

    .line 492
    :cond_f
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 493
    .line 494
    .line 495
    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    .line 496
    .line 497
    .line 498
    move-result v5

    .line 499
    sparse-switch v5, :sswitch_data_0

    .line 500
    .line 501
    .line 502
    :goto_b
    move/from16 v5, v38

    .line 503
    .line 504
    goto :goto_c

    .line 505
    :sswitch_0
    const-string v5, "Softness"

    .line 506
    .line 507
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 508
    .line 509
    .line 510
    move-result v5

    .line 511
    if-nez v5, :cond_10

    .line 512
    .line 513
    goto :goto_b

    .line 514
    :cond_10
    const/4 v5, 0x4

    .line 515
    goto :goto_c

    .line 516
    :sswitch_1
    const-string v5, "Shadow Color"

    .line 517
    .line 518
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 519
    .line 520
    .line 521
    move-result v5

    .line 522
    if-nez v5, :cond_11

    .line 523
    .line 524
    goto :goto_b

    .line 525
    :cond_11
    const/4 v5, 0x3

    .line 526
    goto :goto_c

    .line 527
    :sswitch_2
    const-string v5, "Direction"

    .line 528
    .line 529
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 530
    .line 531
    .line 532
    move-result v5

    .line 533
    if-nez v5, :cond_12

    .line 534
    .line 535
    goto :goto_b

    .line 536
    :cond_12
    const/4 v5, 0x2

    .line 537
    goto :goto_c

    .line 538
    :sswitch_3
    const-string v5, "Opacity"

    .line 539
    .line 540
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 541
    .line 542
    .line 543
    move-result v5

    .line 544
    if-nez v5, :cond_13

    .line 545
    .line 546
    goto :goto_b

    .line 547
    :cond_13
    const/4 v5, 0x1

    .line 548
    goto :goto_c

    .line 549
    :sswitch_4
    const-string v5, "Distance"

    .line 550
    .line 551
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 552
    .line 553
    .line 554
    move-result v5

    .line 555
    if-nez v5, :cond_14

    .line 556
    .line 557
    goto :goto_b

    .line 558
    :cond_14
    const/4 v5, 0x0

    .line 559
    :goto_c
    packed-switch v5, :pswitch_data_1

    .line 560
    .line 561
    .line 562
    invoke-virtual {v0}, Lj40;->s()V

    .line 563
    .line 564
    .line 565
    goto :goto_a

    .line 566
    :pswitch_c
    const/4 v5, 0x1

    .line 567
    invoke-static {v0, v1, v5}, Lyc0;->f(Li40;Lu80;Z)Lc4;

    .line 568
    .line 569
    .line 570
    move-result-object v11

    .line 571
    iput-object v11, v3, Lnq;->e:Lc4;

    .line 572
    .line 573
    goto :goto_a

    .line 574
    :pswitch_d
    invoke-static/range {p0 .. p1}, Lyc0;->e(Lj40;Lu80;)Lb4;

    .line 575
    .line 576
    .line 577
    move-result-object v5

    .line 578
    iput-object v5, v3, Lnq;->a:Lb4;

    .line 579
    .line 580
    goto :goto_a

    .line 581
    :pswitch_e
    const/4 v5, 0x0

    .line 582
    invoke-static {v0, v1, v5}, Lyc0;->f(Li40;Lu80;Z)Lc4;

    .line 583
    .line 584
    .line 585
    move-result-object v11

    .line 586
    iput-object v11, v3, Lnq;->c:Lc4;

    .line 587
    .line 588
    goto :goto_a

    .line 589
    :pswitch_f
    const/4 v5, 0x0

    .line 590
    invoke-static {v0, v1, v5}, Lyc0;->f(Li40;Lu80;Z)Lc4;

    .line 591
    .line 592
    .line 593
    move-result-object v11

    .line 594
    iput-object v11, v3, Lnq;->b:Lc4;

    .line 595
    .line 596
    goto/16 :goto_a

    .line 597
    .line 598
    :pswitch_10
    const/4 v5, 0x1

    .line 599
    invoke-static {v0, v1, v5}, Lyc0;->f(Li40;Lu80;Z)Lc4;

    .line 600
    .line 601
    .line 602
    move-result-object v11

    .line 603
    iput-object v11, v3, Lnq;->d:Lc4;

    .line 604
    .line 605
    goto/16 :goto_a

    .line 606
    .line 607
    :cond_15
    invoke-virtual {v0}, Lj40;->n()Ljava/lang/String;

    .line 608
    .line 609
    .line 610
    move-result-object v4

    .line 611
    goto/16 :goto_a

    .line 612
    .line 613
    :cond_16
    invoke-virtual {v0}, Lj40;->g()V

    .line 614
    .line 615
    .line 616
    goto/16 :goto_9

    .line 617
    .line 618
    :cond_17
    invoke-virtual {v0}, Lj40;->f()V

    .line 619
    .line 620
    .line 621
    goto/16 :goto_8

    .line 622
    .line 623
    :cond_18
    iget-object v4, v3, Lnq;->a:Lb4;

    .line 624
    .line 625
    if-eqz v4, :cond_19

    .line 626
    .line 627
    iget-object v5, v3, Lnq;->b:Lc4;

    .line 628
    .line 629
    if-eqz v5, :cond_19

    .line 630
    .line 631
    iget-object v11, v3, Lnq;->c:Lc4;

    .line 632
    .line 633
    if-eqz v11, :cond_19

    .line 634
    .line 635
    move-object/from16 v45, v4

    .line 636
    .line 637
    iget-object v4, v3, Lnq;->d:Lc4;

    .line 638
    .line 639
    if-eqz v4, :cond_19

    .line 640
    .line 641
    iget-object v3, v3, Lnq;->e:Lc4;

    .line 642
    .line 643
    if-eqz v3, :cond_19

    .line 644
    .line 645
    new-instance v44, Lg4;

    .line 646
    .line 647
    move-object/from16 v49, v3

    .line 648
    .line 649
    move-object/from16 v48, v4

    .line 650
    .line 651
    move-object/from16 v46, v5

    .line 652
    .line 653
    move-object/from16 v47, v11

    .line 654
    .line 655
    invoke-direct/range {v44 .. v49}, Lg4;-><init>(Lb4;Lc4;Lc4;Lc4;Lc4;)V

    .line 656
    .line 657
    .line 658
    move-object/from16 v30, v44

    .line 659
    .line 660
    goto/16 :goto_4

    .line 661
    .line 662
    :cond_19
    const/16 v30, 0x0

    .line 663
    .line 664
    goto/16 :goto_4

    .line 665
    .line 666
    :cond_1a
    invoke-virtual {v0}, Lj40;->g()V

    .line 667
    .line 668
    .line 669
    goto/16 :goto_3

    .line 670
    .line 671
    :cond_1b
    invoke-virtual {v0}, Lj40;->f()V

    .line 672
    .line 673
    .line 674
    new-instance v3, Ljava/lang/StringBuilder;

    .line 675
    .line 676
    const-string v4, "Lottie doesn\'t support layer effects. If you are using them for  fills, strokes, trim paths etc. then try adding them directly as contents  in your shape. Found: "

    .line 677
    .line 678
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 679
    .line 680
    .line 681
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 682
    .line 683
    .line 684
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 685
    .line 686
    .line 687
    move-result-object v2

    .line 688
    invoke-virtual {v1, v2}, Lu80;->a(Ljava/lang/String;)V

    .line 689
    .line 690
    .line 691
    goto/16 :goto_2

    .line 692
    .line 693
    :pswitch_11
    move-object/from16 v42, v2

    .line 694
    .line 695
    move-object/from16 v43, v3

    .line 696
    .line 697
    invoke-virtual {v0}, Lj40;->c()V

    .line 698
    .line 699
    .line 700
    :goto_d
    invoke-virtual {v0}, Lj40;->i()Z

    .line 701
    .line 702
    .line 703
    move-result v2

    .line 704
    if-eqz v2, :cond_31

    .line 705
    .line 706
    sget-object v2, Lg50;->b:Ll92;

    .line 707
    .line 708
    invoke-virtual {v0, v2}, Lj40;->q(Ll92;)I

    .line 709
    .line 710
    .line 711
    move-result v2

    .line 712
    if-eqz v2, :cond_30

    .line 713
    .line 714
    const/4 v5, 0x1

    .line 715
    if-eq v2, v5, :cond_1c

    .line 716
    .line 717
    invoke-virtual {v0}, Lj40;->r()V

    .line 718
    .line 719
    .line 720
    invoke-virtual {v0}, Lj40;->s()V

    .line 721
    .line 722
    .line 723
    goto :goto_d

    .line 724
    :cond_1c
    invoke-virtual {v0}, Lj40;->a()V

    .line 725
    .line 726
    .line 727
    invoke-virtual {v0}, Lj40;->i()Z

    .line 728
    .line 729
    .line 730
    move-result v2

    .line 731
    if-eqz v2, :cond_2e

    .line 732
    .line 733
    sget-object v2, Lf4;->a:Ll92;

    .line 734
    .line 735
    invoke-virtual {v0}, Lj40;->c()V

    .line 736
    .line 737
    .line 738
    const/4 v2, 0x0

    .line 739
    const/4 v3, 0x0

    .line 740
    :goto_e
    invoke-virtual {v0}, Lj40;->i()Z

    .line 741
    .line 742
    .line 743
    move-result v4

    .line 744
    if-eqz v4, :cond_2d

    .line 745
    .line 746
    sget-object v4, Lf4;->a:Ll92;

    .line 747
    .line 748
    invoke-virtual {v0, v4}, Lj40;->q(Ll92;)I

    .line 749
    .line 750
    .line 751
    move-result v4

    .line 752
    if-eqz v4, :cond_24

    .line 753
    .line 754
    const/4 v5, 0x1

    .line 755
    if-eq v4, v5, :cond_1d

    .line 756
    .line 757
    invoke-virtual {v0}, Lj40;->r()V

    .line 758
    .line 759
    .line 760
    invoke-virtual {v0}, Lj40;->s()V

    .line 761
    .line 762
    .line 763
    goto :goto_e

    .line 764
    :cond_1d
    invoke-virtual {v0}, Lj40;->c()V

    .line 765
    .line 766
    .line 767
    const/16 v45, 0x0

    .line 768
    .line 769
    const/16 v46, 0x0

    .line 770
    .line 771
    const/16 v47, 0x0

    .line 772
    .line 773
    const/16 v48, 0x0

    .line 774
    .line 775
    const/16 v49, 0x0

    .line 776
    .line 777
    :goto_f
    invoke-virtual {v0}, Lj40;->i()Z

    .line 778
    .line 779
    .line 780
    move-result v2

    .line 781
    if-eqz v2, :cond_23

    .line 782
    .line 783
    sget-object v2, Lf4;->c:Ll92;

    .line 784
    .line 785
    invoke-virtual {v0, v2}, Lj40;->q(Ll92;)I

    .line 786
    .line 787
    .line 788
    move-result v2

    .line 789
    if-eqz v2, :cond_22

    .line 790
    .line 791
    if-eq v2, v5, :cond_21

    .line 792
    .line 793
    const/4 v4, 0x2

    .line 794
    if-eq v2, v4, :cond_20

    .line 795
    .line 796
    const/4 v4, 0x3

    .line 797
    if-eq v2, v4, :cond_1f

    .line 798
    .line 799
    const/4 v4, 0x4

    .line 800
    if-eq v2, v4, :cond_1e

    .line 801
    .line 802
    invoke-virtual {v0}, Lj40;->r()V

    .line 803
    .line 804
    .line 805
    invoke-virtual {v0}, Lj40;->s()V

    .line 806
    .line 807
    .line 808
    goto :goto_f

    .line 809
    :cond_1e
    invoke-static/range {p0 .. p1}, Lyc0;->h(Li40;Lu80;)Lb4;

    .line 810
    .line 811
    .line 812
    move-result-object v49

    .line 813
    goto :goto_f

    .line 814
    :cond_1f
    invoke-static {v0, v1, v5}, Lyc0;->f(Li40;Lu80;Z)Lc4;

    .line 815
    .line 816
    .line 817
    move-result-object v48

    .line 818
    goto :goto_f

    .line 819
    :cond_20
    invoke-static {v0, v1, v5}, Lyc0;->f(Li40;Lu80;Z)Lc4;

    .line 820
    .line 821
    .line 822
    move-result-object v47

    .line 823
    goto :goto_f

    .line 824
    :cond_21
    invoke-static/range {p0 .. p1}, Lyc0;->e(Lj40;Lu80;)Lb4;

    .line 825
    .line 826
    .line 827
    move-result-object v46

    .line 828
    :goto_10
    const/4 v5, 0x1

    .line 829
    goto :goto_f

    .line 830
    :cond_22
    invoke-static/range {p0 .. p1}, Lyc0;->e(Lj40;Lu80;)Lb4;

    .line 831
    .line 832
    .line 833
    move-result-object v45

    .line 834
    goto :goto_10

    .line 835
    :cond_23
    invoke-virtual {v0}, Lj40;->g()V

    .line 836
    .line 837
    .line 838
    new-instance v44, Lg4;

    .line 839
    .line 840
    const/16 v50, 0x0

    .line 841
    .line 842
    invoke-direct/range {v44 .. v50}, Lg4;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 843
    .line 844
    .line 845
    move-object/from16 v2, v44

    .line 846
    .line 847
    goto :goto_e

    .line 848
    :cond_24
    invoke-virtual {v0}, Lj40;->c()V

    .line 849
    .line 850
    .line 851
    const/4 v3, 0x0

    .line 852
    const/16 v47, 0x0

    .line 853
    .line 854
    const/16 v48, 0x0

    .line 855
    .line 856
    const/16 v49, 0x0

    .line 857
    .line 858
    :goto_11
    invoke-virtual {v0}, Lj40;->i()Z

    .line 859
    .line 860
    .line 861
    move-result v4

    .line 862
    if-eqz v4, :cond_2b

    .line 863
    .line 864
    sget-object v4, Lf4;->b:Ll92;

    .line 865
    .line 866
    invoke-virtual {v0, v4}, Lj40;->q(Ll92;)I

    .line 867
    .line 868
    .line 869
    move-result v4

    .line 870
    if-eqz v4, :cond_2a

    .line 871
    .line 872
    const/4 v5, 0x1

    .line 873
    if-eq v4, v5, :cond_29

    .line 874
    .line 875
    const/4 v11, 0x2

    .line 876
    if-eq v4, v11, :cond_28

    .line 877
    .line 878
    const/4 v11, 0x3

    .line 879
    if-eq v4, v11, :cond_25

    .line 880
    .line 881
    invoke-virtual {v0}, Lj40;->r()V

    .line 882
    .line 883
    .line 884
    invoke-virtual {v0}, Lj40;->s()V

    .line 885
    .line 886
    .line 887
    goto :goto_11

    .line 888
    :cond_25
    invoke-virtual {v0}, Lj40;->m()I

    .line 889
    .line 890
    .line 891
    move-result v4

    .line 892
    if-eq v4, v5, :cond_27

    .line 893
    .line 894
    const/4 v11, 0x2

    .line 895
    if-eq v4, v11, :cond_27

    .line 896
    .line 897
    new-instance v11, Ljava/lang/StringBuilder;

    .line 898
    .line 899
    const-string v5, "Unsupported text range units: "

    .line 900
    .line 901
    invoke-direct {v11, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 902
    .line 903
    .line 904
    invoke-virtual {v11, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 905
    .line 906
    .line 907
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 908
    .line 909
    .line 910
    move-result-object v4

    .line 911
    invoke-virtual {v1, v4}, Lu80;->a(Ljava/lang/String;)V

    .line 912
    .line 913
    .line 914
    :cond_26
    const/16 v49, 0x2

    .line 915
    .line 916
    goto :goto_11

    .line 917
    :cond_27
    if-ne v4, v5, :cond_26

    .line 918
    .line 919
    const/16 v49, 0x1

    .line 920
    .line 921
    goto :goto_11

    .line 922
    :cond_28
    invoke-static/range {p0 .. p1}, Lyc0;->h(Li40;Lu80;)Lb4;

    .line 923
    .line 924
    .line 925
    move-result-object v48

    .line 926
    goto :goto_11

    .line 927
    :cond_29
    invoke-static/range {p0 .. p1}, Lyc0;->h(Li40;Lu80;)Lb4;

    .line 928
    .line 929
    .line 930
    move-result-object v47

    .line 931
    goto :goto_11

    .line 932
    :cond_2a
    invoke-static/range {p0 .. p1}, Lyc0;->h(Li40;Lu80;)Lb4;

    .line 933
    .line 934
    .line 935
    move-result-object v3

    .line 936
    goto :goto_11

    .line 937
    :cond_2b
    invoke-virtual {v0}, Lj40;->g()V

    .line 938
    .line 939
    .line 940
    if-nez v3, :cond_2c

    .line 941
    .line 942
    if-eqz v47, :cond_2c

    .line 943
    .line 944
    new-instance v3, Lb4;

    .line 945
    .line 946
    new-instance v4, Lw40;

    .line 947
    .line 948
    const/16 v39, 0x0

    .line 949
    .line 950
    invoke-static/range {v39 .. v39}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 951
    .line 952
    .line 953
    move-result-object v5

    .line 954
    invoke-direct {v4, v5}, Lw40;-><init>(Ljava/lang/Object;)V

    .line 955
    .line 956
    .line 957
    invoke-static {v4}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 958
    .line 959
    .line 960
    move-result-object v4

    .line 961
    const/4 v11, 0x2

    .line 962
    invoke-direct {v3, v11, v4}, Lb4;-><init>(ILjava/util/List;)V

    .line 963
    .line 964
    .line 965
    :goto_12
    move-object/from16 v46, v3

    .line 966
    .line 967
    goto :goto_13

    .line 968
    :cond_2c
    const/4 v11, 0x2

    .line 969
    goto :goto_12

    .line 970
    :goto_13
    new-instance v45, Lr2;

    .line 971
    .line 972
    const/16 v50, 0x1

    .line 973
    .line 974
    invoke-direct/range {v45 .. v50}, Lr2;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    .line 975
    .line 976
    .line 977
    move-object/from16 v3, v45

    .line 978
    .line 979
    goto/16 :goto_e

    .line 980
    .line 981
    :cond_2d
    const/4 v11, 0x2

    .line 982
    invoke-virtual {v0}, Lj40;->g()V

    .line 983
    .line 984
    .line 985
    new-instance v4, Lgw3;

    .line 986
    .line 987
    const/4 v5, 0x0

    .line 988
    const/4 v11, 0x1

    .line 989
    invoke-direct {v4, v2, v3, v11, v5}, Lgw3;-><init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 990
    .line 991
    .line 992
    move-object/from16 v34, v4

    .line 993
    .line 994
    :cond_2e
    :goto_14
    invoke-virtual {v0}, Lj40;->i()Z

    .line 995
    .line 996
    .line 997
    move-result v2

    .line 998
    if-eqz v2, :cond_2f

    .line 999
    .line 1000
    invoke-virtual {v0}, Lj40;->s()V

    .line 1001
    .line 1002
    .line 1003
    goto :goto_14

    .line 1004
    :cond_2f
    invoke-virtual {v0}, Lj40;->f()V

    .line 1005
    .line 1006
    .line 1007
    goto/16 :goto_d

    .line 1008
    .line 1009
    :cond_30
    new-instance v2, Lb4;

    .line 1010
    .line 1011
    invoke-static {}, Ll41;->c()F

    .line 1012
    .line 1013
    .line 1014
    move-result v3

    .line 1015
    sget-object v4, Lqp;->f:Lqp;

    .line 1016
    .line 1017
    const/4 v5, 0x0

    .line 1018
    invoke-static {v0, v1, v3, v4, v5}, Lz40;->a(Li40;Lu80;FLo41;Z)Ljava/util/ArrayList;

    .line 1019
    .line 1020
    .line 1021
    move-result-object v3

    .line 1022
    const/4 v4, 0x6

    .line 1023
    invoke-direct {v2, v4, v3}, Lb4;-><init>(ILjava/util/List;)V

    .line 1024
    .line 1025
    .line 1026
    move-object/from16 v33, v2

    .line 1027
    .line 1028
    goto/16 :goto_d

    .line 1029
    .line 1030
    :cond_31
    invoke-virtual {v0}, Lj40;->g()V

    .line 1031
    .line 1032
    .line 1033
    goto/16 :goto_2

    .line 1034
    .line 1035
    :pswitch_12
    move-object/from16 v42, v2

    .line 1036
    .line 1037
    move-object/from16 v43, v3

    .line 1038
    .line 1039
    invoke-virtual {v0}, Lj40;->a()V

    .line 1040
    .line 1041
    .line 1042
    :cond_32
    :goto_15
    invoke-virtual {v0}, Lj40;->i()Z

    .line 1043
    .line 1044
    .line 1045
    move-result v2

    .line 1046
    if-eqz v2, :cond_33

    .line 1047
    .line 1048
    invoke-static/range {p0 .. p1}, Lfj;->a(Lj40;Lu80;)Lej;

    .line 1049
    .line 1050
    .line 1051
    move-result-object v2

    .line 1052
    if-eqz v2, :cond_32

    .line 1053
    .line 1054
    invoke-virtual {v9, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1055
    .line 1056
    .line 1057
    goto :goto_15

    .line 1058
    :cond_33
    invoke-virtual {v0}, Lj40;->f()V

    .line 1059
    .line 1060
    .line 1061
    goto/16 :goto_1

    .line 1062
    .line 1063
    :pswitch_13
    move-object/from16 v42, v2

    .line 1064
    .line 1065
    move-object/from16 v43, v3

    .line 1066
    .line 1067
    invoke-virtual {v0}, Lj40;->a()V

    .line 1068
    .line 1069
    .line 1070
    :goto_16
    invoke-virtual {v0}, Lj40;->i()Z

    .line 1071
    .line 1072
    .line 1073
    move-result v2

    .line 1074
    if-eqz v2, :cond_3d

    .line 1075
    .line 1076
    invoke-virtual {v0}, Lj40;->c()V

    .line 1077
    .line 1078
    .line 1079
    const/4 v2, 0x0

    .line 1080
    const/4 v3, 0x0

    .line 1081
    const/4 v4, 0x0

    .line 1082
    const/4 v5, 0x0

    .line 1083
    :goto_17
    invoke-virtual {v0}, Lj40;->i()Z

    .line 1084
    .line 1085
    .line 1086
    move-result v11

    .line 1087
    if-eqz v11, :cond_3c

    .line 1088
    .line 1089
    invoke-virtual {v0}, Lj40;->y()Ljava/lang/String;

    .line 1090
    .line 1091
    .line 1092
    move-result-object v11

    .line 1093
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1094
    .line 1095
    .line 1096
    invoke-virtual {v11}, Ljava/lang/String;->hashCode()I

    .line 1097
    .line 1098
    .line 1099
    move-result v40

    .line 1100
    move/from16 v44, v6

    .line 1101
    .line 1102
    sparse-switch v40, :sswitch_data_1

    .line 1103
    .line 1104
    .line 1105
    :goto_18
    move/from16 v6, v38

    .line 1106
    .line 1107
    goto :goto_1a

    .line 1108
    :sswitch_5
    const-string v6, "mode"

    .line 1109
    .line 1110
    invoke-virtual {v11, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1111
    .line 1112
    .line 1113
    move-result v6

    .line 1114
    if-nez v6, :cond_34

    .line 1115
    .line 1116
    goto :goto_19

    .line 1117
    :cond_34
    const/4 v6, 0x3

    .line 1118
    goto :goto_1a

    .line 1119
    :sswitch_6
    const-string v6, "inv"

    .line 1120
    .line 1121
    invoke-virtual {v11, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1122
    .line 1123
    .line 1124
    move-result v6

    .line 1125
    if-nez v6, :cond_35

    .line 1126
    .line 1127
    goto :goto_19

    .line 1128
    :cond_35
    const/4 v6, 0x2

    .line 1129
    goto :goto_1a

    .line 1130
    :sswitch_7
    const-string v6, "pt"

    .line 1131
    .line 1132
    invoke-virtual {v11, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1133
    .line 1134
    .line 1135
    move-result v6

    .line 1136
    if-nez v6, :cond_36

    .line 1137
    .line 1138
    goto :goto_19

    .line 1139
    :cond_36
    const/4 v6, 0x1

    .line 1140
    goto :goto_1a

    .line 1141
    :sswitch_8
    const-string v6, "o"

    .line 1142
    .line 1143
    invoke-virtual {v11, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1144
    .line 1145
    .line 1146
    move-result v6

    .line 1147
    if-nez v6, :cond_37

    .line 1148
    .line 1149
    :goto_19
    goto :goto_18

    .line 1150
    :cond_37
    const/4 v6, 0x0

    .line 1151
    :goto_1a
    packed-switch v6, :pswitch_data_2

    .line 1152
    .line 1153
    .line 1154
    invoke-virtual {v0}, Lj40;->s()V

    .line 1155
    .line 1156
    .line 1157
    :goto_1b
    move-wide/from16 v45, v7

    .line 1158
    .line 1159
    const/4 v7, 0x0

    .line 1160
    goto/16 :goto_1e

    .line 1161
    .line 1162
    :pswitch_14
    invoke-virtual {v0}, Lj40;->n()Ljava/lang/String;

    .line 1163
    .line 1164
    .line 1165
    move-result-object v4

    .line 1166
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1167
    .line 1168
    .line 1169
    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    .line 1170
    .line 1171
    .line 1172
    move-result v6

    .line 1173
    sparse-switch v6, :sswitch_data_2

    .line 1174
    .line 1175
    .line 1176
    :goto_1c
    move/from16 v4, v38

    .line 1177
    .line 1178
    goto :goto_1d

    .line 1179
    :sswitch_9
    const-string v6, "s"

    .line 1180
    .line 1181
    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1182
    .line 1183
    .line 1184
    move-result v4

    .line 1185
    if-nez v4, :cond_38

    .line 1186
    .line 1187
    goto :goto_1c

    .line 1188
    :cond_38
    const/4 v4, 0x3

    .line 1189
    goto :goto_1d

    .line 1190
    :sswitch_a
    const-string v6, "n"

    .line 1191
    .line 1192
    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1193
    .line 1194
    .line 1195
    move-result v4

    .line 1196
    if-nez v4, :cond_39

    .line 1197
    .line 1198
    goto :goto_1c

    .line 1199
    :cond_39
    const/4 v4, 0x2

    .line 1200
    goto :goto_1d

    .line 1201
    :sswitch_b
    const-string v6, "i"

    .line 1202
    .line 1203
    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1204
    .line 1205
    .line 1206
    move-result v4

    .line 1207
    if-nez v4, :cond_3a

    .line 1208
    .line 1209
    goto :goto_1c

    .line 1210
    :cond_3a
    const/4 v4, 0x1

    .line 1211
    goto :goto_1d

    .line 1212
    :sswitch_c
    const-string v6, "a"

    .line 1213
    .line 1214
    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1215
    .line 1216
    .line 1217
    move-result v4

    .line 1218
    if-nez v4, :cond_3b

    .line 1219
    .line 1220
    goto :goto_1c

    .line 1221
    :cond_3b
    const/4 v4, 0x0

    .line 1222
    :goto_1d
    packed-switch v4, :pswitch_data_3

    .line 1223
    .line 1224
    .line 1225
    new-instance v4, Ljava/lang/StringBuilder;

    .line 1226
    .line 1227
    const-string v6, "Unknown mask mode "

    .line 1228
    .line 1229
    invoke-direct {v4, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1230
    .line 1231
    .line 1232
    invoke-virtual {v4, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1233
    .line 1234
    .line 1235
    const-string v6, ". Defaulting to Add."

    .line 1236
    .line 1237
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1238
    .line 1239
    .line 1240
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1241
    .line 1242
    .line 1243
    move-result-object v4

    .line 1244
    invoke-static {v4}, Lj80;->b(Ljava/lang/String;)V

    .line 1245
    .line 1246
    .line 1247
    :pswitch_15
    const/4 v4, 0x1

    .line 1248
    goto :goto_1b

    .line 1249
    :pswitch_16
    const/4 v4, 0x2

    .line 1250
    goto :goto_1b

    .line 1251
    :pswitch_17
    const/4 v4, 0x4

    .line 1252
    goto :goto_1b

    .line 1253
    :pswitch_18
    const-string v4, "Animation contains intersect masks. They are not supported but will be treated like add masks."

    .line 1254
    .line 1255
    invoke-virtual {v1, v4}, Lu80;->a(Ljava/lang/String;)V

    .line 1256
    .line 1257
    .line 1258
    const/4 v4, 0x3

    .line 1259
    goto :goto_1b

    .line 1260
    :pswitch_19
    invoke-virtual {v0}, Lj40;->k()Z

    .line 1261
    .line 1262
    .line 1263
    move-result v2

    .line 1264
    goto :goto_1b

    .line 1265
    :pswitch_1a
    new-instance v3, Lb4;

    .line 1266
    .line 1267
    invoke-static {}, Ll41;->c()F

    .line 1268
    .line 1269
    .line 1270
    move-result v6

    .line 1271
    sget-object v11, Lxu0;->f:Lxu0;

    .line 1272
    .line 1273
    move-wide/from16 v45, v7

    .line 1274
    .line 1275
    const/4 v7, 0x0

    .line 1276
    invoke-static {v0, v1, v6, v11, v7}, Lz40;->a(Li40;Lu80;FLo41;Z)Ljava/util/ArrayList;

    .line 1277
    .line 1278
    .line 1279
    move-result-object v6

    .line 1280
    const/4 v8, 0x5

    .line 1281
    invoke-direct {v3, v8, v6}, Lb4;-><init>(ILjava/util/List;)V

    .line 1282
    .line 1283
    .line 1284
    goto :goto_1e

    .line 1285
    :pswitch_1b
    move-wide/from16 v45, v7

    .line 1286
    .line 1287
    const/4 v7, 0x0

    .line 1288
    invoke-static/range {p0 .. p1}, Lyc0;->h(Li40;Lu80;)Lb4;

    .line 1289
    .line 1290
    .line 1291
    move-result-object v5

    .line 1292
    :goto_1e
    move/from16 v6, v44

    .line 1293
    .line 1294
    move-wide/from16 v7, v45

    .line 1295
    .line 1296
    goto/16 :goto_17

    .line 1297
    .line 1298
    :cond_3c
    move/from16 v44, v6

    .line 1299
    .line 1300
    move-wide/from16 v45, v7

    .line 1301
    .line 1302
    const/4 v7, 0x0

    .line 1303
    invoke-virtual {v0}, Lj40;->g()V

    .line 1304
    .line 1305
    .line 1306
    new-instance v6, Lib0;

    .line 1307
    .line 1308
    invoke-direct {v6, v4, v3, v5, v2}, Lib0;-><init>(ILb4;Lb4;Z)V

    .line 1309
    .line 1310
    .line 1311
    invoke-virtual {v10, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1312
    .line 1313
    .line 1314
    move/from16 v6, v44

    .line 1315
    .line 1316
    move-wide/from16 v7, v45

    .line 1317
    .line 1318
    goto/16 :goto_16

    .line 1319
    .line 1320
    :cond_3d
    move/from16 v44, v6

    .line 1321
    .line 1322
    move-wide/from16 v45, v7

    .line 1323
    .line 1324
    const/4 v7, 0x0

    .line 1325
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    .line 1326
    .line 1327
    .line 1328
    move-result v2

    .line 1329
    iget v3, v1, Lu80;->p:I

    .line 1330
    .line 1331
    add-int/2addr v3, v2

    .line 1332
    iput v3, v1, Lu80;->p:I

    .line 1333
    .line 1334
    invoke-virtual {v0}, Lj40;->f()V

    .line 1335
    .line 1336
    .line 1337
    goto :goto_1f

    .line 1338
    :pswitch_1c
    move-object/from16 v42, v2

    .line 1339
    .line 1340
    move-object/from16 v43, v3

    .line 1341
    .line 1342
    move/from16 v44, v6

    .line 1343
    .line 1344
    move-wide/from16 v45, v7

    .line 1345
    .line 1346
    const/4 v7, 0x0

    .line 1347
    invoke-virtual {v0}, Lj40;->m()I

    .line 1348
    .line 1349
    .line 1350
    move-result v2

    .line 1351
    const/16 v40, 0x6

    .line 1352
    .line 1353
    invoke-static/range {v40 .. v40}, Lex0;->v(I)[I

    .line 1354
    .line 1355
    .line 1356
    move-result-object v3

    .line 1357
    array-length v3, v3

    .line 1358
    if-lt v2, v3, :cond_3f

    .line 1359
    .line 1360
    new-instance v3, Ljava/lang/StringBuilder;

    .line 1361
    .line 1362
    const-string v4, "Unsupported matte type: "

    .line 1363
    .line 1364
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1365
    .line 1366
    .line 1367
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1368
    .line 1369
    .line 1370
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1371
    .line 1372
    .line 1373
    move-result-object v2

    .line 1374
    invoke-virtual {v1, v2}, Lu80;->a(Ljava/lang/String;)V

    .line 1375
    .line 1376
    .line 1377
    :cond_3e
    :goto_1f
    move-object/from16 v2, v42

    .line 1378
    .line 1379
    move-object/from16 v3, v43

    .line 1380
    .line 1381
    move/from16 v6, v44

    .line 1382
    .line 1383
    :goto_20
    move-wide/from16 v7, v45

    .line 1384
    .line 1385
    goto/16 :goto_0

    .line 1386
    .line 1387
    :cond_3f
    invoke-static/range {v40 .. v40}, Lex0;->v(I)[I

    .line 1388
    .line 1389
    .line 1390
    move-result-object v3

    .line 1391
    aget v31, v3, v2

    .line 1392
    .line 1393
    invoke-static/range {v31 .. v31}, Lex0;->s(I)I

    .line 1394
    .line 1395
    .line 1396
    move-result v2

    .line 1397
    const/4 v4, 0x3

    .line 1398
    if-eq v2, v4, :cond_41

    .line 1399
    .line 1400
    const/4 v4, 0x4

    .line 1401
    if-eq v2, v4, :cond_40

    .line 1402
    .line 1403
    goto :goto_21

    .line 1404
    :cond_40
    const-string v2, "Unsupported matte type: Luma Inverted"

    .line 1405
    .line 1406
    invoke-virtual {v1, v2}, Lu80;->a(Ljava/lang/String;)V

    .line 1407
    .line 1408
    .line 1409
    goto :goto_21

    .line 1410
    :cond_41
    const-string v2, "Unsupported matte type: Luma"

    .line 1411
    .line 1412
    invoke-virtual {v1, v2}, Lu80;->a(Ljava/lang/String;)V

    .line 1413
    .line 1414
    .line 1415
    :goto_21
    iget v2, v1, Lu80;->p:I

    .line 1416
    .line 1417
    const/16 v41, 0x1

    .line 1418
    .line 1419
    add-int/lit8 v2, v2, 0x1

    .line 1420
    .line 1421
    iput v2, v1, Lu80;->p:I

    .line 1422
    .line 1423
    goto :goto_1f

    .line 1424
    :pswitch_1d
    move-object/from16 v42, v2

    .line 1425
    .line 1426
    move-object/from16 v43, v3

    .line 1427
    .line 1428
    move/from16 v44, v6

    .line 1429
    .line 1430
    move-wide/from16 v45, v7

    .line 1431
    .line 1432
    const/4 v7, 0x0

    .line 1433
    const/16 v41, 0x1

    .line 1434
    .line 1435
    invoke-static/range {p0 .. p1}, Li4;->a(Lj40;Lu80;)Lh4;

    .line 1436
    .line 1437
    .line 1438
    move-result-object v19

    .line 1439
    goto :goto_20

    .line 1440
    :pswitch_1e
    move-object/from16 v42, v2

    .line 1441
    .line 1442
    move-object/from16 v43, v3

    .line 1443
    .line 1444
    move/from16 v44, v6

    .line 1445
    .line 1446
    move-wide/from16 v45, v7

    .line 1447
    .line 1448
    const/4 v7, 0x0

    .line 1449
    const/16 v41, 0x1

    .line 1450
    .line 1451
    invoke-virtual {v0}, Lj40;->n()Ljava/lang/String;

    .line 1452
    .line 1453
    .line 1454
    move-result-object v2

    .line 1455
    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 1456
    .line 1457
    .line 1458
    move-result v24

    .line 1459
    :goto_22
    move-object/from16 v2, v42

    .line 1460
    .line 1461
    goto :goto_20

    .line 1462
    :pswitch_1f
    move-object/from16 v42, v2

    .line 1463
    .line 1464
    move-object/from16 v43, v3

    .line 1465
    .line 1466
    move/from16 v44, v6

    .line 1467
    .line 1468
    move-wide/from16 v45, v7

    .line 1469
    .line 1470
    const/4 v7, 0x0

    .line 1471
    const/16 v41, 0x1

    .line 1472
    .line 1473
    invoke-virtual {v0}, Lj40;->m()I

    .line 1474
    .line 1475
    .line 1476
    move-result v2

    .line 1477
    int-to-float v2, v2

    .line 1478
    invoke-static {}, Ll41;->c()F

    .line 1479
    .line 1480
    .line 1481
    move-result v3

    .line 1482
    mul-float/2addr v3, v2

    .line 1483
    float-to-int v2, v3

    .line 1484
    move/from16 v23, v2

    .line 1485
    .line 1486
    :goto_23
    move-object/from16 v2, v42

    .line 1487
    .line 1488
    move-object/from16 v3, v43

    .line 1489
    .line 1490
    goto :goto_20

    .line 1491
    :pswitch_20
    move-object/from16 v42, v2

    .line 1492
    .line 1493
    move-object/from16 v43, v3

    .line 1494
    .line 1495
    move/from16 v44, v6

    .line 1496
    .line 1497
    move-wide/from16 v45, v7

    .line 1498
    .line 1499
    const/4 v7, 0x0

    .line 1500
    const/16 v41, 0x1

    .line 1501
    .line 1502
    invoke-virtual {v0}, Lj40;->m()I

    .line 1503
    .line 1504
    .line 1505
    move-result v2

    .line 1506
    int-to-float v2, v2

    .line 1507
    invoke-static {}, Ll41;->c()F

    .line 1508
    .line 1509
    .line 1510
    move-result v3

    .line 1511
    mul-float/2addr v3, v2

    .line 1512
    float-to-int v2, v3

    .line 1513
    move/from16 v22, v2

    .line 1514
    .line 1515
    goto :goto_23

    .line 1516
    :pswitch_21
    move-object/from16 v42, v2

    .line 1517
    .line 1518
    move-object/from16 v43, v3

    .line 1519
    .line 1520
    move/from16 v44, v6

    .line 1521
    .line 1522
    const/4 v7, 0x0

    .line 1523
    const/16 v41, 0x1

    .line 1524
    .line 1525
    invoke-virtual {v0}, Lj40;->m()I

    .line 1526
    .line 1527
    .line 1528
    move-result v2

    .line 1529
    int-to-long v2, v2

    .line 1530
    move-wide v7, v2

    .line 1531
    goto/16 :goto_2

    .line 1532
    .line 1533
    :pswitch_22
    move-object/from16 v42, v2

    .line 1534
    .line 1535
    move-object/from16 v43, v3

    .line 1536
    .line 1537
    move/from16 v44, v6

    .line 1538
    .line 1539
    move-wide/from16 v45, v7

    .line 1540
    .line 1541
    const/4 v7, 0x0

    .line 1542
    const/16 v41, 0x1

    .line 1543
    .line 1544
    invoke-virtual {v0}, Lj40;->m()I

    .line 1545
    .line 1546
    .line 1547
    move-result v2

    .line 1548
    const/16 v20, 0x7

    .line 1549
    .line 1550
    const/4 v4, 0x6

    .line 1551
    if-ge v2, v4, :cond_3e

    .line 1552
    .line 1553
    invoke-static/range {v20 .. v20}, Lex0;->v(I)[I

    .line 1554
    .line 1555
    .line 1556
    move-result-object v3

    .line 1557
    aget v20, v3, v2

    .line 1558
    .line 1559
    goto/16 :goto_1f

    .line 1560
    .line 1561
    :pswitch_23
    move-object/from16 v42, v2

    .line 1562
    .line 1563
    move-object/from16 v43, v3

    .line 1564
    .line 1565
    move/from16 v44, v6

    .line 1566
    .line 1567
    move-wide/from16 v45, v7

    .line 1568
    .line 1569
    const/4 v7, 0x0

    .line 1570
    const/16 v41, 0x1

    .line 1571
    .line 1572
    invoke-virtual {v0}, Lj40;->n()Ljava/lang/String;

    .line 1573
    .line 1574
    .line 1575
    move-result-object v21

    .line 1576
    goto/16 :goto_20

    .line 1577
    .line 1578
    :pswitch_24
    move-object/from16 v42, v2

    .line 1579
    .line 1580
    move-object/from16 v43, v3

    .line 1581
    .line 1582
    move/from16 v44, v6

    .line 1583
    .line 1584
    move-wide/from16 v45, v7

    .line 1585
    .line 1586
    const/4 v7, 0x0

    .line 1587
    const/16 v41, 0x1

    .line 1588
    .line 1589
    invoke-virtual {v0}, Lj40;->m()I

    .line 1590
    .line 1591
    .line 1592
    move-result v2

    .line 1593
    int-to-long v13, v2

    .line 1594
    goto/16 :goto_22

    .line 1595
    .line 1596
    :pswitch_25
    move-object/from16 v42, v2

    .line 1597
    .line 1598
    move-object/from16 v43, v3

    .line 1599
    .line 1600
    move/from16 v44, v6

    .line 1601
    .line 1602
    move-wide/from16 v45, v7

    .line 1603
    .line 1604
    const/4 v7, 0x0

    .line 1605
    const/16 v41, 0x1

    .line 1606
    .line 1607
    invoke-virtual {v0}, Lj40;->n()Ljava/lang/String;

    .line 1608
    .line 1609
    .line 1610
    move-result-object v12

    .line 1611
    goto/16 :goto_20

    .line 1612
    .line 1613
    :cond_42
    move-object/from16 v42, v2

    .line 1614
    .line 1615
    move-object/from16 v43, v3

    .line 1616
    .line 1617
    move/from16 v44, v6

    .line 1618
    .line 1619
    move-wide/from16 v45, v7

    .line 1620
    .line 1621
    invoke-virtual {v0}, Lj40;->g()V

    .line 1622
    .line 1623
    .line 1624
    new-instance v7, Ljava/util/ArrayList;

    .line 1625
    .line 1626
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 1627
    .line 1628
    .line 1629
    cmpl-float v0, v17, v36

    .line 1630
    .line 1631
    if-lez v0, :cond_43

    .line 1632
    .line 1633
    new-instance v0, Lw40;

    .line 1634
    .line 1635
    const/4 v5, 0x0

    .line 1636
    invoke-static/range {v17 .. v17}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 1637
    .line 1638
    .line 1639
    move-result-object v6

    .line 1640
    const/4 v4, 0x0

    .line 1641
    move-object/from16 v3, v42

    .line 1642
    .line 1643
    move-object/from16 v2, v42

    .line 1644
    .line 1645
    move-object/from16 v11, v43

    .line 1646
    .line 1647
    move/from16 v8, v44

    .line 1648
    .line 1649
    invoke-direct/range {v0 .. v6}, Lw40;-><init>(Lu80;Ljava/lang/Object;Ljava/lang/Object;Landroid/view/animation/Interpolator;FLjava/lang/Float;)V

    .line 1650
    .line 1651
    .line 1652
    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1653
    .line 1654
    .line 1655
    goto :goto_24

    .line 1656
    :cond_43
    move-object/from16 v11, v43

    .line 1657
    .line 1658
    move/from16 v8, v44

    .line 1659
    .line 1660
    :goto_24
    cmpl-float v0, v18, v36

    .line 1661
    .line 1662
    if-lez v0, :cond_44

    .line 1663
    .line 1664
    goto :goto_25

    .line 1665
    :cond_44
    iget v0, v1, Lu80;->m:F

    .line 1666
    .line 1667
    move/from16 v18, v0

    .line 1668
    .line 1669
    :goto_25
    new-instance v0, Lw40;

    .line 1670
    .line 1671
    const/4 v4, 0x0

    .line 1672
    invoke-static/range {v18 .. v18}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 1673
    .line 1674
    .line 1675
    move-result-object v6

    .line 1676
    move-object/from16 v3, v16

    .line 1677
    .line 1678
    move-object/from16 v2, v16

    .line 1679
    .line 1680
    move/from16 v5, v17

    .line 1681
    .line 1682
    invoke-direct/range {v0 .. v6}, Lw40;-><init>(Lu80;Ljava/lang/Object;Ljava/lang/Object;Landroid/view/animation/Interpolator;FLjava/lang/Float;)V

    .line 1683
    .line 1684
    .line 1685
    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1686
    .line 1687
    .line 1688
    new-instance v0, Lw40;

    .line 1689
    .line 1690
    const v1, 0x7f7fffff    # Float.MAX_VALUE

    .line 1691
    .line 1692
    .line 1693
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 1694
    .line 1695
    .line 1696
    move-result-object v6

    .line 1697
    move-object/from16 v3, v42

    .line 1698
    .line 1699
    move-object/from16 v1, p1

    .line 1700
    .line 1701
    move/from16 v5, v18

    .line 1702
    .line 1703
    move-object/from16 v2, v42

    .line 1704
    .line 1705
    invoke-direct/range {v0 .. v6}, Lw40;-><init>(Lu80;Ljava/lang/Object;Ljava/lang/Object;Landroid/view/animation/Interpolator;FLjava/lang/Float;)V

    .line 1706
    .line 1707
    .line 1708
    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1709
    .line 1710
    .line 1711
    const-string v0, ".ai"

    .line 1712
    .line 1713
    invoke-virtual {v12, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 1714
    .line 1715
    .line 1716
    move-result v0

    .line 1717
    if-nez v0, :cond_45

    .line 1718
    .line 1719
    const-string v0, "ai"

    .line 1720
    .line 1721
    invoke-virtual {v0, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1722
    .line 1723
    .line 1724
    move-result v0

    .line 1725
    if-eqz v0, :cond_46

    .line 1726
    .line 1727
    :cond_45
    const-string v0, "Convert your Illustrator layers to shape layers."

    .line 1728
    .line 1729
    invoke-virtual {v1, v0}, Lu80;->a(Ljava/lang/String;)V

    .line 1730
    .line 1731
    .line 1732
    :cond_46
    if-eqz v8, :cond_48

    .line 1733
    .line 1734
    if-nez v19, :cond_47

    .line 1735
    .line 1736
    new-instance v19, Lh4;

    .line 1737
    .line 1738
    invoke-direct/range {v19 .. v19}, Lh4;-><init>()V

    .line 1739
    .line 1740
    .line 1741
    :cond_47
    move-object/from16 v0, v19

    .line 1742
    .line 1743
    iput-boolean v8, v0, Lh4;->j:Z

    .line 1744
    .line 1745
    move-object v11, v0

    .line 1746
    goto :goto_26

    .line 1747
    :cond_48
    move-object/from16 v11, v19

    .line 1748
    .line 1749
    :goto_26
    new-instance v0, Lf50;

    .line 1750
    .line 1751
    move-object v2, v1

    .line 1752
    move-object v1, v9

    .line 1753
    move-object v3, v12

    .line 1754
    move-wide v4, v13

    .line 1755
    move/from16 v6, v20

    .line 1756
    .line 1757
    move-object/from16 v9, v21

    .line 1758
    .line 1759
    move/from16 v12, v22

    .line 1760
    .line 1761
    move/from16 v13, v23

    .line 1762
    .line 1763
    move/from16 v14, v24

    .line 1764
    .line 1765
    move/from16 v17, v25

    .line 1766
    .line 1767
    move/from16 v18, v26

    .line 1768
    .line 1769
    move/from16 v16, v27

    .line 1770
    .line 1771
    move/from16 v24, v28

    .line 1772
    .line 1773
    move-object/from16 v25, v29

    .line 1774
    .line 1775
    move-object/from16 v26, v30

    .line 1776
    .line 1777
    move/from16 v22, v31

    .line 1778
    .line 1779
    move/from16 v27, v32

    .line 1780
    .line 1781
    move-object/from16 v19, v33

    .line 1782
    .line 1783
    move-object/from16 v20, v34

    .line 1784
    .line 1785
    move-object/from16 v23, v35

    .line 1786
    .line 1787
    move-object/from16 v21, v7

    .line 1788
    .line 1789
    move-wide/from16 v7, v45

    .line 1790
    .line 1791
    invoke-direct/range {v0 .. v27}, Lf50;-><init>(Ljava/util/List;Lu80;Ljava/lang/String;JIJLjava/lang/String;Ljava/util/List;Lh4;IIIFFFFLb4;Lgw3;Ljava/util/List;ILc4;ZLkf3;Lg4;I)V

    .line 1792
    .line 1793
    .line 1794
    return-object v0

    .line 1795
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_13
        :pswitch_12
        :pswitch_11
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

    .line 1796
    .line 1797
    .line 1798
    .line 1799
    .line 1800
    .line 1801
    .line 1802
    .line 1803
    .line 1804
    .line 1805
    .line 1806
    .line 1807
    .line 1808
    .line 1809
    .line 1810
    .line 1811
    .line 1812
    .line 1813
    .line 1814
    .line 1815
    .line 1816
    .line 1817
    .line 1818
    .line 1819
    .line 1820
    .line 1821
    .line 1822
    .line 1823
    .line 1824
    .line 1825
    .line 1826
    .line 1827
    .line 1828
    .line 1829
    .line 1830
    .line 1831
    .line 1832
    .line 1833
    .line 1834
    .line 1835
    .line 1836
    .line 1837
    .line 1838
    .line 1839
    .line 1840
    .line 1841
    .line 1842
    .line 1843
    .line 1844
    .line 1845
    .line 1846
    .line 1847
    .line 1848
    .line 1849
    :sswitch_data_0
    .sparse-switch
        0x150bf015 -> :sswitch_4
        0x17b08feb -> :sswitch_3
        0x3e12275f -> :sswitch_2
        0x5237c863 -> :sswitch_1
        0x5279bda1 -> :sswitch_0
    .end sparse-switch

    .line 1850
    .line 1851
    .line 1852
    .line 1853
    .line 1854
    .line 1855
    .line 1856
    .line 1857
    .line 1858
    .line 1859
    .line 1860
    .line 1861
    .line 1862
    .line 1863
    .line 1864
    .line 1865
    .line 1866
    .line 1867
    .line 1868
    .line 1869
    .line 1870
    .line 1871
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
    .end packed-switch

    .line 1872
    .line 1873
    .line 1874
    .line 1875
    .line 1876
    .line 1877
    .line 1878
    .line 1879
    .line 1880
    .line 1881
    .line 1882
    .line 1883
    .line 1884
    .line 1885
    :sswitch_data_1
    .sparse-switch
        0x6f -> :sswitch_8
        0xe04 -> :sswitch_7
        0x197f1 -> :sswitch_6
        0x3339a3 -> :sswitch_5
    .end sparse-switch

    .line 1886
    .line 1887
    .line 1888
    .line 1889
    .line 1890
    .line 1891
    .line 1892
    .line 1893
    .line 1894
    .line 1895
    .line 1896
    .line 1897
    .line 1898
    .line 1899
    .line 1900
    .line 1901
    .line 1902
    .line 1903
    :pswitch_data_2
    .packed-switch 0x0
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_14
    .end packed-switch

    .line 1904
    .line 1905
    .line 1906
    .line 1907
    .line 1908
    .line 1909
    .line 1910
    .line 1911
    .line 1912
    .line 1913
    .line 1914
    .line 1915
    :sswitch_data_2
    .sparse-switch
        0x61 -> :sswitch_c
        0x69 -> :sswitch_b
        0x6e -> :sswitch_a
        0x73 -> :sswitch_9
    .end sparse-switch

    .line 1916
    .line 1917
    .line 1918
    .line 1919
    .line 1920
    .line 1921
    .line 1922
    .line 1923
    .line 1924
    .line 1925
    .line 1926
    .line 1927
    .line 1928
    .line 1929
    .line 1930
    .line 1931
    .line 1932
    .line 1933
    :pswitch_data_3
    .packed-switch 0x0
        :pswitch_15
        :pswitch_18
        :pswitch_17
        :pswitch_16
    .end packed-switch
.end method
