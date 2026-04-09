.class public final synthetic Lop1;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lyp3;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lau2;Ljava/lang/String;Lorg/json/JSONObject;)V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, Lop1;->a:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lop1;->b:Ljava/lang/Object;

    iput-object p2, p0, Lop1;->d:Ljava/lang/Object;

    iput-object p3, p0, Lop1;->c:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p4, p0, Lop1;->a:I

    iput-object p1, p0, Lop1;->b:Ljava/lang/Object;

    iput-object p2, p0, Lop1;->c:Ljava/lang/Object;

    iput-object p3, p0, Lop1;->d:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lzz2;La83;Lh83;Lsu2;I)V
    .locals 0

    .line 3
    iput p5, p0, Lop1;->a:I

    iput-object p1, p0, Lop1;->b:Ljava/lang/Object;

    iput-object p2, p0, Lop1;->c:Ljava/lang/Object;

    iput-object p3, p0, Lop1;->d:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Object;)Ln70;
    .locals 23

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget v0, v1, Lop1;->a:I

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v0, v1, Lop1;->b:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Ly03;

    .line 11
    .line 12
    iget-object v2, v1, Lop1;->c:Ljava/lang/Object;

    .line 13
    .line 14
    move-object v8, v2

    .line 15
    check-cast v8, La83;

    .line 16
    .line 17
    iget-object v2, v1, Lop1;->d:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v2, Lh83;

    .line 20
    .line 21
    iget-object v3, v0, Ly03;->j:Ljv2;

    .line 22
    .line 23
    sget-object v4, Lmz1;->p2:Liz1;

    .line 24
    .line 25
    sget-object v5, Ltw1;->e:Ltw1;

    .line 26
    .line 27
    iget-object v5, v5, Ltw1;->c:Lkz1;

    .line 28
    .line 29
    invoke-virtual {v5, v4}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v6

    .line 33
    check-cast v6, Ljava/lang/Boolean;

    .line 34
    .line 35
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    .line 36
    .line 37
    .line 38
    move-result v6

    .line 39
    if-eqz v6, :cond_0

    .line 40
    .line 41
    iget-object v6, v3, Ljv2;->e:Landroid/os/Bundle;

    .line 42
    .line 43
    sget-object v7, Lhg4;->C:Lhg4;

    .line 44
    .line 45
    iget-object v7, v7, Lhg4;->k:Lym;

    .line 46
    .line 47
    const-string v9, "rendering-webview-creation-start"

    .line 48
    .line 49
    invoke-static {v7, v6, v9}, Lga1;->n(Lym;Landroid/os/Bundle;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    :cond_0
    iget-object v6, v0, Ly03;->c:Lpu2;

    .line 53
    .line 54
    iget-object v7, v0, Ly03;->d:Ll83;

    .line 55
    .line 56
    iget-object v9, v2, Lh83;->b:Lp21;

    .line 57
    .line 58
    iget-object v9, v9, Lp21;->g:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v9, Lc83;

    .line 61
    .line 62
    iget-object v10, v7, Ll83;->f:Lxe4;

    .line 63
    .line 64
    invoke-virtual {v6, v10, v8, v9}, Lpu2;->a(Lxe4;La83;Lc83;)Lag2;

    .line 65
    .line 66
    .line 67
    move-result-object v10

    .line 68
    iget-boolean v9, v8, La83;->W:Z

    .line 69
    .line 70
    invoke-interface {v10, v9}, Lag2;->x0(Z)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v5, v4}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v9

    .line 77
    check-cast v9, Ljava/lang/Boolean;

    .line 78
    .line 79
    invoke-virtual {v9}, Ljava/lang/Boolean;->booleanValue()Z

    .line 80
    .line 81
    .line 82
    move-result v9

    .line 83
    if-eqz v9, :cond_1

    .line 84
    .line 85
    iget-object v3, v3, Ljv2;->e:Landroid/os/Bundle;

    .line 86
    .line 87
    sget-object v9, Lhg4;->C:Lhg4;

    .line 88
    .line 89
    iget-object v9, v9, Lhg4;->k:Lym;

    .line 90
    .line 91
    const-string v11, "rendering-webview-creation-end"

    .line 92
    .line 93
    invoke-static {v9, v3, v11}, Lga1;->n(Lym;Landroid/os/Bundle;Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    :cond_1
    new-instance v9, Lpd2;

    .line 97
    .line 98
    invoke-direct {v9}, Lpd2;-><init>()V

    .line 99
    .line 100
    .line 101
    iget-object v3, v0, Ly03;->l:Ljava/lang/Object;

    .line 102
    .line 103
    check-cast v3, Lji2;

    .line 104
    .line 105
    new-instance v11, Lxb4;

    .line 106
    .line 107
    const/4 v12, 0x0

    .line 108
    invoke-direct {v11, v2, v8, v12}, Lxb4;-><init>(Lh83;La83;Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    move-object v2, v4

    .line 112
    iget-object v4, v0, Ly03;->b:Landroid/content/Context;

    .line 113
    .line 114
    move-object v13, v5

    .line 115
    move-object v5, v6

    .line 116
    move-object v6, v7

    .line 117
    iget-object v7, v0, Ly03;->f:Le51;

    .line 118
    .line 119
    move-object v14, v11

    .line 120
    iget-object v11, v0, Ly03;->g:Le42;

    .line 121
    .line 122
    move-object v15, v12

    .line 123
    iget-boolean v12, v0, Ly03;->h:Z

    .line 124
    .line 125
    move-object/from16 v16, v13

    .line 126
    .line 127
    iget-object v13, v0, Ly03;->i:Lpz2;

    .line 128
    .line 129
    move-object/from16 v17, v14

    .line 130
    .line 131
    iget-object v14, v0, Ly03;->j:Ljv2;

    .line 132
    .line 133
    move-object/from16 v18, v15

    .line 134
    .line 135
    iget-object v15, v0, Ly03;->k:Lmv2;

    .line 136
    .line 137
    move-object/from16 p1, v2

    .line 138
    .line 139
    new-instance v2, Lju2;

    .line 140
    .line 141
    move-object/from16 v19, v3

    .line 142
    .line 143
    new-instance v3, Luu0;

    .line 144
    .line 145
    move-object/from16 v1, v17

    .line 146
    .line 147
    move-object/from16 v17, p1

    .line 148
    .line 149
    move-object/from16 p1, v0

    .line 150
    .line 151
    move-object/from16 v0, v19

    .line 152
    .line 153
    invoke-direct/range {v3 .. v15}, Luu0;-><init>(Landroid/content/Context;Lpu2;Ll83;Le51;La83;Lpd2;Lag2;Le42;ZLpz2;Ljv2;Lmv2;)V

    .line 154
    .line 155
    .line 156
    const/4 v4, 0x0

    .line 157
    invoke-direct {v2, v3, v10, v4}, Lju2;-><init>(Lqq2;Lag2;I)V

    .line 158
    .line 159
    .line 160
    new-instance v3, Lii2;

    .line 161
    .line 162
    iget-object v4, v0, Lji2;->c:Lth2;

    .line 163
    .line 164
    iget-object v5, v0, Lji2;->d:Lji2;

    .line 165
    .line 166
    invoke-direct {v3, v4, v5, v1, v2}, Lii2;-><init>(Lth2;Lji2;Lxb4;Lju2;)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {v9, v3}, Lpd2;->a(Ljava/lang/Object;)Z

    .line 170
    .line 171
    .line 172
    move-object/from16 v13, v16

    .line 173
    .line 174
    move-object/from16 v2, v17

    .line 175
    .line 176
    invoke-virtual {v13, v2}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object v1

    .line 180
    check-cast v1, Ljava/lang/Boolean;

    .line 181
    .line 182
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 183
    .line 184
    .line 185
    move-result v1

    .line 186
    if-eqz v1, :cond_2

    .line 187
    .line 188
    iget-object v1, v14, Ljv2;->e:Landroid/os/Bundle;

    .line 189
    .line 190
    sget-object v2, Lhg4;->C:Lhg4;

    .line 191
    .line 192
    iget-object v2, v2, Lhg4;->k:Lym;

    .line 193
    .line 194
    const-string v4, "rendering-ad-component-creation-end"

    .line 195
    .line 196
    invoke-static {v2, v1, v4}, Lga1;->n(Lym;Landroid/os/Bundle;Ljava/lang/String;)V

    .line 197
    .line 198
    .line 199
    :cond_2
    iget-object v1, v3, Lii2;->K:Lba4;

    .line 200
    .line 201
    invoke-virtual {v1}, Lba4;->d()Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object v1

    .line 205
    check-cast v1, Lcq2;

    .line 206
    .line 207
    new-instance v2, Lk32;

    .line 208
    .line 209
    const/4 v4, 0x5

    .line 210
    invoke-direct {v2, v4, v1}, Lk32;-><init>(ILjava/lang/Object;)V

    .line 211
    .line 212
    .line 213
    const-string v1, "/reward"

    .line 214
    .line 215
    invoke-interface {v10, v1, v2}, Lag2;->v0(Ljava/lang/String;Ly32;)V

    .line 216
    .line 217
    .line 218
    iget-object v1, v3, Lii2;->v:Lba4;

    .line 219
    .line 220
    invoke-virtual {v1}, Lba4;->d()Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object v1

    .line 224
    check-cast v1, Lcn2;

    .line 225
    .line 226
    new-instance v2, Lg03;

    .line 227
    .line 228
    const/4 v4, 0x3

    .line 229
    invoke-direct {v2, v10, v4}, Lg03;-><init>(Lag2;I)V

    .line 230
    .line 231
    .line 232
    sget-object v4, Lmd2;->g:Lld2;

    .line 233
    .line 234
    invoke-virtual {v1, v2, v4}, Lf74;->L1(Ljava/lang/Object;Ljava/util/concurrent/Executor;)V

    .line 235
    .line 236
    .line 237
    iget-object v1, v3, Lii2;->L:Lba4;

    .line 238
    .line 239
    invoke-virtual {v1}, Lba4;->d()Ljava/lang/Object;

    .line 240
    .line 241
    .line 242
    move-result-object v2

    .line 243
    check-cast v2, Lou2;

    .line 244
    .line 245
    const/4 v4, 0x1

    .line 246
    if-eq v4, v12, :cond_3

    .line 247
    .line 248
    move-object/from16 v12, v18

    .line 249
    .line 250
    goto :goto_0

    .line 251
    :cond_3
    move-object v12, v11

    .line 252
    :goto_0
    iget-object v5, v14, Ljv2;->e:Landroid/os/Bundle;

    .line 253
    .line 254
    invoke-virtual {v2, v10, v4, v12, v5}, Lou2;->a(Lag2;ZLe42;Landroid/os/Bundle;)V

    .line 255
    .line 256
    .line 257
    iget-object v2, v8, La83;->s:Le83;

    .line 258
    .line 259
    iget-object v4, v2, Le83;->a:Ljava/lang/String;

    .line 260
    .line 261
    sget-object v5, Lmz1;->J5:Liz1;

    .line 262
    .line 263
    invoke-virtual {v13, v5}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 264
    .line 265
    .line 266
    move-result-object v5

    .line 267
    check-cast v5, Ljava/lang/Boolean;

    .line 268
    .line 269
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 270
    .line 271
    .line 272
    move-result v5

    .line 273
    if-eqz v5, :cond_4

    .line 274
    .line 275
    iget-object v5, v3, Lii2;->u:Lba4;

    .line 276
    .line 277
    invoke-virtual {v5}, Lba4;->d()Ljava/lang/Object;

    .line 278
    .line 279
    .line 280
    move-result-object v5

    .line 281
    check-cast v5, Lwz2;

    .line 282
    .line 283
    invoke-virtual {v5}, Lwz2;->a()Z

    .line 284
    .line 285
    .line 286
    move-result v5

    .line 287
    if-eqz v5, :cond_4

    .line 288
    .line 289
    invoke-static {v8}, Ltg2;->b(La83;)Ljava/lang/String;

    .line 290
    .line 291
    .line 292
    move-result-object v5

    .line 293
    filled-new-array {v5}, [Ljava/lang/String;

    .line 294
    .line 295
    .line 296
    move-result-object v5

    .line 297
    invoke-static {v4, v5}, Ltg2;->a(Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;

    .line 298
    .line 299
    .line 300
    move-result-object v4

    .line 301
    :cond_4
    invoke-virtual {v1}, Lba4;->d()Ljava/lang/Object;

    .line 302
    .line 303
    .line 304
    move-result-object v1

    .line 305
    check-cast v1, Lou2;

    .line 306
    .line 307
    iget-object v1, v2, Le83;->b:Ljava/lang/String;

    .line 308
    .line 309
    iget-object v2, v14, Ljv2;->e:Landroid/os/Bundle;

    .line 310
    .line 311
    iget-object v0, v0, Lji2;->g:Lba4;

    .line 312
    .line 313
    invoke-virtual {v0}, Lba4;->d()Ljava/lang/Object;

    .line 314
    .line 315
    .line 316
    move-result-object v0

    .line 317
    check-cast v0, Lda3;

    .line 318
    .line 319
    invoke-static {v10, v1, v4, v2, v0}, Lou2;->b(Lag2;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Lda3;)Lpd2;

    .line 320
    .line 321
    .line 322
    move-result-object v0

    .line 323
    new-instance v1, Ldm2;

    .line 324
    .line 325
    const/4 v2, 0x3

    .line 326
    invoke-direct {v1, v10, v8, v3, v2}, Ldm2;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 327
    .line 328
    .line 329
    move-object/from16 v2, p1

    .line 330
    .line 331
    iget-object v2, v2, Ly03;->e:Ljava/util/concurrent/Executor;

    .line 332
    .line 333
    invoke-static {v0, v1, v2}, Lpu1;->P(Ln70;Lzk3;Ljava/util/concurrent/Executor;)Lrp3;

    .line 334
    .line 335
    .line 336
    move-result-object v0

    .line 337
    return-object v0

    .line 338
    :pswitch_0
    iget-object v0, v1, Lop1;->b:Ljava/lang/Object;

    .line 339
    .line 340
    check-cast v0, Lc13;

    .line 341
    .line 342
    iget-object v2, v1, Lop1;->c:Ljava/lang/Object;

    .line 343
    .line 344
    check-cast v2, Lh83;

    .line 345
    .line 346
    iget-object v3, v1, Lop1;->d:Ljava/lang/Object;

    .line 347
    .line 348
    check-cast v3, La83;

    .line 349
    .line 350
    move-object/from16 v4, p1

    .line 351
    .line 352
    check-cast v4, Lorg/json/JSONArray;

    .line 353
    .line 354
    invoke-virtual {v4}, Lorg/json/JSONArray;->length()I

    .line 355
    .line 356
    .line 357
    move-result v5

    .line 358
    const/4 v6, 0x3

    .line 359
    if-nez v5, :cond_5

    .line 360
    .line 361
    new-instance v0, Lhx2;

    .line 362
    .line 363
    invoke-direct {v0, v6}, Lhx2;-><init>(I)V

    .line 364
    .line 365
    .line 366
    invoke-static {v0}, Lpu1;->B(Ljava/lang/Throwable;)Lkq3;

    .line 367
    .line 368
    .line 369
    move-result-object v0

    .line 370
    goto :goto_3

    .line 371
    :cond_5
    iget-object v5, v2, Lh83;->a:Lf20;

    .line 372
    .line 373
    iget-object v5, v5, Lf20;->g:Ljava/lang/Object;

    .line 374
    .line 375
    check-cast v5, Ll83;

    .line 376
    .line 377
    iget v5, v5, Ll83;->l:I

    .line 378
    .line 379
    const/4 v7, 0x0

    .line 380
    const/4 v8, 0x1

    .line 381
    if-le v5, v8, :cond_9

    .line 382
    .line 383
    invoke-virtual {v4}, Lorg/json/JSONArray;->length()I

    .line 384
    .line 385
    .line 386
    move-result v8

    .line 387
    sget-object v9, Lmz1;->q2:Liz1;

    .line 388
    .line 389
    sget-object v10, Ltw1;->e:Ltw1;

    .line 390
    .line 391
    iget-object v10, v10, Ltw1;->c:Lkz1;

    .line 392
    .line 393
    invoke-virtual {v10, v9}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 394
    .line 395
    .line 396
    move-result-object v9

    .line 397
    check-cast v9, Ljava/lang/Boolean;

    .line 398
    .line 399
    invoke-virtual {v9}, Ljava/lang/Boolean;->booleanValue()Z

    .line 400
    .line 401
    .line 402
    move-result v9

    .line 403
    if-eqz v9, :cond_6

    .line 404
    .line 405
    iget-object v9, v0, Lc13;->f:Ljv2;

    .line 406
    .line 407
    invoke-static {v8}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 408
    .line 409
    .line 410
    move-result-object v10

    .line 411
    const-string v11, "nsl"

    .line 412
    .line 413
    invoke-virtual {v9, v11, v10}, Ljv2;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 414
    .line 415
    .line 416
    :cond_6
    iget-object v9, v0, Lc13;->d:Lv83;

    .line 417
    .line 418
    invoke-static {v8, v5}, Ljava/lang/Math;->min(II)I

    .line 419
    .line 420
    .line 421
    move-result v10

    .line 422
    invoke-virtual {v9, v10}, Lv83;->a(I)V

    .line 423
    .line 424
    .line 425
    new-instance v9, Ljava/util/ArrayList;

    .line 426
    .line 427
    invoke-direct {v9, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 428
    .line 429
    .line 430
    :goto_1
    if-ge v7, v5, :cond_8

    .line 431
    .line 432
    if-ge v7, v8, :cond_7

    .line 433
    .line 434
    invoke-virtual {v4, v7}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    .line 435
    .line 436
    .line 437
    move-result-object v10

    .line 438
    invoke-virtual {v0, v2, v3, v10}, Lc13;->c(Lh83;La83;Lorg/json/JSONObject;)Lcq3;

    .line 439
    .line 440
    .line 441
    move-result-object v10

    .line 442
    invoke-virtual {v9, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 443
    .line 444
    .line 445
    goto :goto_2

    .line 446
    :cond_7
    new-instance v10, Lhx2;

    .line 447
    .line 448
    invoke-direct {v10, v6}, Lhx2;-><init>(I)V

    .line 449
    .line 450
    .line 451
    invoke-static {v10}, Lpu1;->B(Ljava/lang/Throwable;)Lkq3;

    .line 452
    .line 453
    .line 454
    move-result-object v10

    .line 455
    invoke-virtual {v9, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 456
    .line 457
    .line 458
    :goto_2
    add-int/lit8 v7, v7, 0x1

    .line 459
    .line 460
    goto :goto_1

    .line 461
    :cond_8
    invoke-static {v9}, Lpu1;->r(Ljava/lang/Object;)Llq3;

    .line 462
    .line 463
    .line 464
    move-result-object v0

    .line 465
    goto :goto_3

    .line 466
    :cond_9
    invoke-virtual {v4, v7}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    .line 467
    .line 468
    .line 469
    move-result-object v4

    .line 470
    invoke-virtual {v0, v2, v3, v4}, Lc13;->c(Lh83;La83;Lorg/json/JSONObject;)Lcq3;

    .line 471
    .line 472
    .line 473
    move-result-object v2

    .line 474
    iget-object v0, v0, Lc13;->b:Lpq3;

    .line 475
    .line 476
    sget-object v3, Lgj1;->m:Lgj1;

    .line 477
    .line 478
    invoke-static {v2, v3, v0}, Lpu1;->P(Ln70;Lzk3;Ljava/util/concurrent/Executor;)Lrp3;

    .line 479
    .line 480
    .line 481
    move-result-object v0

    .line 482
    :goto_3
    return-object v0

    .line 483
    :pswitch_1
    iget-object v0, v1, Lop1;->b:Ljava/lang/Object;

    .line 484
    .line 485
    check-cast v0, Ly03;

    .line 486
    .line 487
    iget-object v2, v1, Lop1;->c:Ljava/lang/Object;

    .line 488
    .line 489
    move-object v7, v2

    .line 490
    check-cast v7, La83;

    .line 491
    .line 492
    iget-object v2, v1, Lop1;->d:Ljava/lang/Object;

    .line 493
    .line 494
    check-cast v2, Lh83;

    .line 495
    .line 496
    iget-object v14, v0, Ly03;->j:Ljv2;

    .line 497
    .line 498
    sget-object v15, Lmz1;->p2:Liz1;

    .line 499
    .line 500
    sget-object v3, Ltw1;->e:Ltw1;

    .line 501
    .line 502
    iget-object v3, v3, Ltw1;->c:Lkz1;

    .line 503
    .line 504
    invoke-virtual {v3, v15}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 505
    .line 506
    .line 507
    move-result-object v4

    .line 508
    check-cast v4, Ljava/lang/Boolean;

    .line 509
    .line 510
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 511
    .line 512
    .line 513
    move-result v4

    .line 514
    if-eqz v4, :cond_a

    .line 515
    .line 516
    iget-object v4, v14, Ljv2;->e:Landroid/os/Bundle;

    .line 517
    .line 518
    sget-object v5, Lhg4;->C:Lhg4;

    .line 519
    .line 520
    iget-object v5, v5, Lhg4;->k:Lym;

    .line 521
    .line 522
    const-string v6, "rendering-webview-creation-start"

    .line 523
    .line 524
    invoke-static {v5, v4, v6}, Lga1;->n(Lym;Landroid/os/Bundle;Ljava/lang/String;)V

    .line 525
    .line 526
    .line 527
    :cond_a
    iget-object v4, v0, Ly03;->c:Lpu2;

    .line 528
    .line 529
    iget-object v9, v0, Ly03;->d:Ll83;

    .line 530
    .line 531
    iget-object v5, v2, Lh83;->b:Lp21;

    .line 532
    .line 533
    iget-object v5, v5, Lp21;->g:Ljava/lang/Object;

    .line 534
    .line 535
    check-cast v5, Lc83;

    .line 536
    .line 537
    iget-object v6, v9, Ll83;->f:Lxe4;

    .line 538
    .line 539
    invoke-virtual {v4, v6, v7, v5}, Lpu2;->a(Lxe4;La83;Lc83;)Lag2;

    .line 540
    .line 541
    .line 542
    move-result-object v8

    .line 543
    iget-boolean v4, v7, La83;->W:Z

    .line 544
    .line 545
    invoke-interface {v8, v4}, Lag2;->x0(Z)V

    .line 546
    .line 547
    .line 548
    invoke-virtual {v3, v15}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 549
    .line 550
    .line 551
    move-result-object v4

    .line 552
    check-cast v4, Ljava/lang/Boolean;

    .line 553
    .line 554
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 555
    .line 556
    .line 557
    move-result v4

    .line 558
    if-eqz v4, :cond_b

    .line 559
    .line 560
    iget-object v4, v14, Ljv2;->e:Landroid/os/Bundle;

    .line 561
    .line 562
    sget-object v5, Lhg4;->C:Lhg4;

    .line 563
    .line 564
    iget-object v5, v5, Lhg4;->k:Lym;

    .line 565
    .line 566
    const-string v6, "rendering-webview-creation-end"

    .line 567
    .line 568
    invoke-static {v5, v4, v6}, Lga1;->n(Lym;Landroid/os/Bundle;Ljava/lang/String;)V

    .line 569
    .line 570
    .line 571
    :cond_b
    new-instance v6, Lpd2;

    .line 572
    .line 573
    invoke-direct {v6}, Lpd2;-><init>()V

    .line 574
    .line 575
    .line 576
    iget-object v4, v0, Ly03;->l:Ljava/lang/Object;

    .line 577
    .line 578
    check-cast v4, Lei2;

    .line 579
    .line 580
    new-instance v5, Lxb4;

    .line 581
    .line 582
    const/4 v10, 0x0

    .line 583
    invoke-direct {v5, v2, v7, v10}, Lxb4;-><init>(Lh83;La83;Ljava/lang/String;)V

    .line 584
    .line 585
    .line 586
    move-object v2, v4

    .line 587
    iget-object v4, v0, Ly03;->b:Landroid/content/Context;

    .line 588
    .line 589
    move-object v11, v5

    .line 590
    iget-object v5, v0, Ly03;->f:Le51;

    .line 591
    .line 592
    move-object v12, v10

    .line 593
    iget-boolean v10, v0, Ly03;->h:Z

    .line 594
    .line 595
    move-object v13, v11

    .line 596
    iget-object v11, v0, Ly03;->g:Le42;

    .line 597
    .line 598
    move-object/from16 v16, v12

    .line 599
    .line 600
    iget-object v12, v0, Ly03;->i:Lpz2;

    .line 601
    .line 602
    move-object/from16 v17, v13

    .line 603
    .line 604
    iget-object v13, v0, Ly03;->k:Lmv2;

    .line 605
    .line 606
    move-object/from16 p1, v2

    .line 607
    .line 608
    new-instance v2, Ll92;

    .line 609
    .line 610
    move-object/from16 v18, v3

    .line 611
    .line 612
    new-instance v3, Lx03;

    .line 613
    .line 614
    move-object v1, v0

    .line 615
    move-object/from16 v0, p1

    .line 616
    .line 617
    move-object/from16 p1, v1

    .line 618
    .line 619
    move-object/from16 v1, v17

    .line 620
    .line 621
    move-object/from16 v17, v14

    .line 622
    .line 623
    move-object v14, v1

    .line 624
    move-object/from16 v1, v18

    .line 625
    .line 626
    invoke-direct/range {v3 .. v13}, Lx03;-><init>(Landroid/content/Context;Le51;Lpd2;La83;Lag2;Ll83;ZLe42;Lpz2;Lmv2;)V

    .line 627
    .line 628
    .line 629
    invoke-direct {v2, v3, v8}, Ll92;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 630
    .line 631
    .line 632
    new-instance v3, Ldi2;

    .line 633
    .line 634
    iget-object v4, v0, Lei2;->b:Lth2;

    .line 635
    .line 636
    iget-object v5, v0, Lei2;->c:Lei2;

    .line 637
    .line 638
    invoke-direct {v3, v4, v5, v14, v2}, Ldi2;-><init>(Lth2;Lei2;Lxb4;Ll92;)V

    .line 639
    .line 640
    .line 641
    invoke-virtual {v6, v3}, Lpd2;->a(Ljava/lang/Object;)Z

    .line 642
    .line 643
    .line 644
    invoke-virtual {v1, v15}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 645
    .line 646
    .line 647
    move-result-object v2

    .line 648
    check-cast v2, Ljava/lang/Boolean;

    .line 649
    .line 650
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 651
    .line 652
    .line 653
    move-result v2

    .line 654
    if-eqz v2, :cond_c

    .line 655
    .line 656
    move-object/from16 v2, v17

    .line 657
    .line 658
    iget-object v4, v2, Ljv2;->e:Landroid/os/Bundle;

    .line 659
    .line 660
    sget-object v5, Lhg4;->C:Lhg4;

    .line 661
    .line 662
    iget-object v5, v5, Lhg4;->k:Lym;

    .line 663
    .line 664
    const-string v6, "rendering-ad-component-creation-end"

    .line 665
    .line 666
    invoke-static {v5, v4, v6}, Lga1;->n(Lym;Landroid/os/Bundle;Ljava/lang/String;)V

    .line 667
    .line 668
    .line 669
    goto :goto_4

    .line 670
    :cond_c
    move-object/from16 v2, v17

    .line 671
    .line 672
    :goto_4
    iget-object v4, v3, Ldi2;->v:Lba4;

    .line 673
    .line 674
    invoke-virtual {v4}, Lba4;->d()Ljava/lang/Object;

    .line 675
    .line 676
    .line 677
    move-result-object v4

    .line 678
    check-cast v4, Lcn2;

    .line 679
    .line 680
    new-instance v5, Lg03;

    .line 681
    .line 682
    const/4 v6, 0x2

    .line 683
    invoke-direct {v5, v8, v6}, Lg03;-><init>(Lag2;I)V

    .line 684
    .line 685
    .line 686
    sget-object v6, Lmd2;->g:Lld2;

    .line 687
    .line 688
    invoke-virtual {v4, v5, v6}, Lf74;->L1(Ljava/lang/Object;Ljava/util/concurrent/Executor;)V

    .line 689
    .line 690
    .line 691
    iget-object v4, v7, La83;->s:Le83;

    .line 692
    .line 693
    iget-object v5, v4, Le83;->a:Ljava/lang/String;

    .line 694
    .line 695
    sget-object v6, Lmz1;->J5:Liz1;

    .line 696
    .line 697
    invoke-virtual {v1, v6}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 698
    .line 699
    .line 700
    move-result-object v1

    .line 701
    check-cast v1, Ljava/lang/Boolean;

    .line 702
    .line 703
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 704
    .line 705
    .line 706
    move-result v1

    .line 707
    if-eqz v1, :cond_d

    .line 708
    .line 709
    iget-object v1, v3, Ldi2;->u:Lba4;

    .line 710
    .line 711
    invoke-virtual {v1}, Lba4;->d()Ljava/lang/Object;

    .line 712
    .line 713
    .line 714
    move-result-object v1

    .line 715
    check-cast v1, Lwz2;

    .line 716
    .line 717
    invoke-virtual {v1}, Lwz2;->a()Z

    .line 718
    .line 719
    .line 720
    move-result v1

    .line 721
    if-eqz v1, :cond_d

    .line 722
    .line 723
    invoke-static {v7}, Ltg2;->b(La83;)Ljava/lang/String;

    .line 724
    .line 725
    .line 726
    move-result-object v1

    .line 727
    filled-new-array {v1}, [Ljava/lang/String;

    .line 728
    .line 729
    .line 730
    move-result-object v1

    .line 731
    invoke-static {v5, v1}, Ltg2;->a(Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;

    .line 732
    .line 733
    .line 734
    move-result-object v5

    .line 735
    :cond_d
    iget-object v1, v3, Ldi2;->L:Lba4;

    .line 736
    .line 737
    invoke-virtual {v1}, Lba4;->d()Ljava/lang/Object;

    .line 738
    .line 739
    .line 740
    move-result-object v6

    .line 741
    check-cast v6, Lou2;

    .line 742
    .line 743
    const/4 v9, 0x1

    .line 744
    if-eq v9, v10, :cond_e

    .line 745
    .line 746
    move-object/from16 v10, v16

    .line 747
    .line 748
    goto :goto_5

    .line 749
    :cond_e
    move-object v10, v11

    .line 750
    :goto_5
    iget-object v11, v2, Ljv2;->e:Landroid/os/Bundle;

    .line 751
    .line 752
    invoke-virtual {v6, v8, v9, v10, v11}, Lou2;->a(Lag2;ZLe42;Landroid/os/Bundle;)V

    .line 753
    .line 754
    .line 755
    invoke-virtual {v1}, Lba4;->d()Ljava/lang/Object;

    .line 756
    .line 757
    .line 758
    move-result-object v1

    .line 759
    check-cast v1, Lou2;

    .line 760
    .line 761
    iget-object v1, v4, Le83;->b:Ljava/lang/String;

    .line 762
    .line 763
    iget-object v2, v2, Ljv2;->e:Landroid/os/Bundle;

    .line 764
    .line 765
    iget-object v0, v0, Lei2;->h:Lba4;

    .line 766
    .line 767
    invoke-virtual {v0}, Lba4;->d()Ljava/lang/Object;

    .line 768
    .line 769
    .line 770
    move-result-object v0

    .line 771
    check-cast v0, Lda3;

    .line 772
    .line 773
    invoke-static {v8, v1, v5, v2, v0}, Lou2;->b(Lag2;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Lda3;)Lpd2;

    .line 774
    .line 775
    .line 776
    move-result-object v0

    .line 777
    new-instance v1, Ldm2;

    .line 778
    .line 779
    const/4 v2, 0x2

    .line 780
    invoke-direct {v1, v8, v7, v3, v2}, Ldm2;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 781
    .line 782
    .line 783
    move-object/from16 v2, p1

    .line 784
    .line 785
    iget-object v2, v2, Ly03;->e:Ljava/util/concurrent/Executor;

    .line 786
    .line 787
    invoke-static {v0, v1, v2}, Lpu1;->P(Ln70;Lzk3;Ljava/util/concurrent/Executor;)Lrp3;

    .line 788
    .line 789
    .line 790
    move-result-object v0

    .line 791
    return-object v0

    .line 792
    :pswitch_2
    iget-object v0, v1, Lop1;->b:Ljava/lang/Object;

    .line 793
    .line 794
    check-cast v0, Lr03;

    .line 795
    .line 796
    iget-object v2, v1, Lop1;->c:Ljava/lang/Object;

    .line 797
    .line 798
    check-cast v2, Landroid/view/View;

    .line 799
    .line 800
    iget-object v3, v1, Lop1;->d:Ljava/lang/Object;

    .line 801
    .line 802
    check-cast v3, La83;

    .line 803
    .line 804
    iget-object v0, v0, Lr03;->b:Landroid/content/Context;

    .line 805
    .line 806
    invoke-static {v0, v2, v3}, Lwk2;->a(Landroid/content/Context;Landroid/view/View;La83;)Lwk2;

    .line 807
    .line 808
    .line 809
    move-result-object v0

    .line 810
    invoke-static {v0}, Lpu1;->r(Ljava/lang/Object;)Llq3;

    .line 811
    .line 812
    .line 813
    move-result-object v0

    .line 814
    return-object v0

    .line 815
    :pswitch_3
    iget-object v0, v1, Lop1;->b:Ljava/lang/Object;

    .line 816
    .line 817
    check-cast v0, Ll03;

    .line 818
    .line 819
    iget-object v2, v1, Lop1;->c:Ljava/lang/Object;

    .line 820
    .line 821
    check-cast v2, Landroid/view/View;

    .line 822
    .line 823
    iget-object v3, v1, Lop1;->d:Ljava/lang/Object;

    .line 824
    .line 825
    check-cast v3, La83;

    .line 826
    .line 827
    iget-object v0, v0, Ll03;->b:Landroid/content/Context;

    .line 828
    .line 829
    invoke-static {v0, v2, v3}, Lwk2;->a(Landroid/content/Context;Landroid/view/View;La83;)Lwk2;

    .line 830
    .line 831
    .line 832
    move-result-object v0

    .line 833
    invoke-static {v0}, Lpu1;->r(Ljava/lang/Object;)Llq3;

    .line 834
    .line 835
    .line 836
    move-result-object v0

    .line 837
    return-object v0

    .line 838
    :pswitch_4
    iget-object v0, v1, Lop1;->b:Ljava/lang/Object;

    .line 839
    .line 840
    check-cast v0, Lo03;

    .line 841
    .line 842
    iget-object v2, v1, Lop1;->c:Ljava/lang/Object;

    .line 843
    .line 844
    check-cast v2, Lh83;

    .line 845
    .line 846
    iget-object v3, v1, Lop1;->d:Ljava/lang/Object;

    .line 847
    .line 848
    check-cast v3, La83;

    .line 849
    .line 850
    iget-object v4, v0, Lo03;->e:Ljava/util/concurrent/Executor;

    .line 851
    .line 852
    iget-object v5, v0, Lo03;->g:Ljv2;

    .line 853
    .line 854
    sget-object v6, Lmz1;->p2:Liz1;

    .line 855
    .line 856
    sget-object v7, Ltw1;->e:Ltw1;

    .line 857
    .line 858
    iget-object v7, v7, Ltw1;->c:Lkz1;

    .line 859
    .line 860
    invoke-virtual {v7, v6}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 861
    .line 862
    .line 863
    move-result-object v8

    .line 864
    check-cast v8, Ljava/lang/Boolean;

    .line 865
    .line 866
    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    .line 867
    .line 868
    .line 869
    move-result v8

    .line 870
    if-eqz v8, :cond_f

    .line 871
    .line 872
    iget-object v8, v5, Ljv2;->e:Landroid/os/Bundle;

    .line 873
    .line 874
    sget-object v9, Lhg4;->C:Lhg4;

    .line 875
    .line 876
    iget-object v9, v9, Lhg4;->k:Lym;

    .line 877
    .line 878
    const-string v10, "rendering-webview-creation-start"

    .line 879
    .line 880
    invoke-static {v9, v8, v10}, Lga1;->n(Lym;Landroid/os/Bundle;Ljava/lang/String;)V

    .line 881
    .line 882
    .line 883
    :cond_f
    iget-object v8, v0, Lo03;->b:Landroid/content/Context;

    .line 884
    .line 885
    iget-object v9, v3, La83;->u:Ljava/util/List;

    .line 886
    .line 887
    invoke-static {v8, v9}, La30;->n(Landroid/content/Context;Ljava/util/List;)Lxe4;

    .line 888
    .line 889
    .line 890
    move-result-object v9

    .line 891
    iget-object v10, v0, Lo03;->c:Lpu2;

    .line 892
    .line 893
    iget-object v11, v2, Lh83;->b:Lp21;

    .line 894
    .line 895
    iget-object v11, v11, Lp21;->g:Ljava/lang/Object;

    .line 896
    .line 897
    check-cast v11, Lc83;

    .line 898
    .line 899
    invoke-virtual {v10, v9, v3, v11}, Lpu2;->a(Lxe4;La83;Lc83;)Lag2;

    .line 900
    .line 901
    .line 902
    move-result-object v10

    .line 903
    iget-boolean v11, v3, La83;->W:Z

    .line 904
    .line 905
    invoke-interface {v10, v11}, Lag2;->x0(Z)V

    .line 906
    .line 907
    .line 908
    sget-object v11, Lmz1;->z8:Liz1;

    .line 909
    .line 910
    invoke-virtual {v7, v11}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 911
    .line 912
    .line 913
    move-result-object v11

    .line 914
    check-cast v11, Ljava/lang/Boolean;

    .line 915
    .line 916
    invoke-virtual {v11}, Ljava/lang/Boolean;->booleanValue()Z

    .line 917
    .line 918
    .line 919
    move-result v11

    .line 920
    if-eqz v11, :cond_10

    .line 921
    .line 922
    iget-boolean v11, v3, La83;->g0:Z

    .line 923
    .line 924
    if-eqz v11, :cond_10

    .line 925
    .line 926
    invoke-interface {v10}, Lag2;->p0()Landroid/view/View;

    .line 927
    .line 928
    .line 929
    move-result-object v11

    .line 930
    invoke-static {v8, v11, v3}, Lwk2;->a(Landroid/content/Context;Landroid/view/View;La83;)Lwk2;

    .line 931
    .line 932
    .line 933
    move-result-object v8

    .line 934
    goto :goto_6

    .line 935
    :cond_10
    invoke-interface {v10}, Lag2;->p0()Landroid/view/View;

    .line 936
    .line 937
    .line 938
    move-result-object v11

    .line 939
    iget-object v12, v0, Lo03;->f:Lzk3;

    .line 940
    .line 941
    new-instance v13, Lru2;

    .line 942
    .line 943
    invoke-interface {v12, v3}, Lzk3;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 944
    .line 945
    .line 946
    move-result-object v12

    .line 947
    check-cast v12, Lmq1;

    .line 948
    .line 949
    invoke-direct {v13, v8, v11, v12}, Lru2;-><init>(Landroid/content/Context;Landroid/view/View;Lmq1;)V

    .line 950
    .line 951
    .line 952
    move-object v8, v13

    .line 953
    :goto_6
    invoke-virtual {v7, v6}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 954
    .line 955
    .line 956
    move-result-object v11

    .line 957
    check-cast v11, Ljava/lang/Boolean;

    .line 958
    .line 959
    invoke-virtual {v11}, Ljava/lang/Boolean;->booleanValue()Z

    .line 960
    .line 961
    .line 962
    move-result v11

    .line 963
    if-eqz v11, :cond_11

    .line 964
    .line 965
    iget-object v11, v5, Ljv2;->e:Landroid/os/Bundle;

    .line 966
    .line 967
    sget-object v12, Lhg4;->C:Lhg4;

    .line 968
    .line 969
    iget-object v12, v12, Lhg4;->k:Lym;

    .line 970
    .line 971
    const-string v13, "rendering-webview-creation-end"

    .line 972
    .line 973
    invoke-static {v12, v11, v13}, Lga1;->n(Lym;Landroid/os/Bundle;Ljava/lang/String;)V

    .line 974
    .line 975
    .line 976
    :cond_11
    iget-object v11, v0, Lo03;->a:Lbi2;

    .line 977
    .line 978
    new-instance v12, Lxb4;

    .line 979
    .line 980
    const/4 v13, 0x0

    .line 981
    invoke-direct {v12, v2, v3, v13}, Lxb4;-><init>(Lh83;La83;Ljava/lang/String;)V

    .line 982
    .line 983
    .line 984
    new-instance v2, Lp21;

    .line 985
    .line 986
    new-instance v14, Lvg0;

    .line 987
    .line 988
    const/16 v15, 0x16

    .line 989
    .line 990
    invoke-direct {v14, v15, v10}, Lvg0;-><init>(ILjava/lang/Object;)V

    .line 991
    .line 992
    .line 993
    iget-boolean v15, v9, Lxe4;->n:Z

    .line 994
    .line 995
    const/4 v13, 0x0

    .line 996
    if-eqz v15, :cond_12

    .line 997
    .line 998
    new-instance v9, Lb83;

    .line 999
    .line 1000
    const/4 v15, -0x3

    .line 1001
    const/4 v1, 0x1

    .line 1002
    invoke-direct {v9, v15, v13, v1}, Lb83;-><init>(IIZ)V

    .line 1003
    .line 1004
    .line 1005
    goto :goto_7

    .line 1006
    :cond_12
    iget v1, v9, Lxe4;->j:I

    .line 1007
    .line 1008
    iget v9, v9, Lxe4;->g:I

    .line 1009
    .line 1010
    new-instance v15, Lb83;

    .line 1011
    .line 1012
    invoke-direct {v15, v1, v9, v13}, Lb83;-><init>(IIZ)V

    .line 1013
    .line 1014
    .line 1015
    move-object v9, v15

    .line 1016
    :goto_7
    invoke-direct {v2, v8, v10, v14, v9}, Lp21;-><init>(Landroid/view/View;Lag2;Ldl2;Lb83;)V

    .line 1017
    .line 1018
    .line 1019
    new-instance v1, Lai2;

    .line 1020
    .line 1021
    iget-object v8, v11, Lbi2;->d:Lth2;

    .line 1022
    .line 1023
    iget-object v9, v11, Lbi2;->e:Lbi2;

    .line 1024
    .line 1025
    invoke-direct {v1, v8, v9, v12, v2}, Lai2;-><init>(Lth2;Lbi2;Lxb4;Lp21;)V

    .line 1026
    .line 1027
    .line 1028
    invoke-virtual {v7, v6}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 1029
    .line 1030
    .line 1031
    move-result-object v2

    .line 1032
    check-cast v2, Ljava/lang/Boolean;

    .line 1033
    .line 1034
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1035
    .line 1036
    .line 1037
    move-result v2

    .line 1038
    if-eqz v2, :cond_13

    .line 1039
    .line 1040
    iget-object v2, v5, Ljv2;->e:Landroid/os/Bundle;

    .line 1041
    .line 1042
    sget-object v6, Lhg4;->C:Lhg4;

    .line 1043
    .line 1044
    iget-object v6, v6, Lhg4;->k:Lym;

    .line 1045
    .line 1046
    const-string v8, "rendering-ad-component-creation-end"

    .line 1047
    .line 1048
    invoke-static {v6, v2, v8}, Lga1;->n(Lym;Landroid/os/Bundle;Ljava/lang/String;)V

    .line 1049
    .line 1050
    .line 1051
    :cond_13
    iget-object v2, v1, Lai2;->M:Lba4;

    .line 1052
    .line 1053
    invoke-virtual {v2}, Lba4;->d()Ljava/lang/Object;

    .line 1054
    .line 1055
    .line 1056
    move-result-object v6

    .line 1057
    check-cast v6, Lou2;

    .line 1058
    .line 1059
    iget-object v8, v5, Ljv2;->e:Landroid/os/Bundle;

    .line 1060
    .line 1061
    const/4 v9, 0x0

    .line 1062
    invoke-virtual {v6, v10, v13, v9, v8}, Lou2;->a(Lag2;ZLe42;Landroid/os/Bundle;)V

    .line 1063
    .line 1064
    .line 1065
    iget-object v6, v1, Lai2;->A:Lba4;

    .line 1066
    .line 1067
    invoke-virtual {v6}, Lba4;->d()Ljava/lang/Object;

    .line 1068
    .line 1069
    .line 1070
    move-result-object v6

    .line 1071
    check-cast v6, Lcn2;

    .line 1072
    .line 1073
    new-instance v8, Lg03;

    .line 1074
    .line 1075
    const/4 v9, 0x1

    .line 1076
    invoke-direct {v8, v10, v9}, Lg03;-><init>(Lag2;I)V

    .line 1077
    .line 1078
    .line 1079
    sget-object v9, Lmd2;->g:Lld2;

    .line 1080
    .line 1081
    invoke-virtual {v6, v8, v9}, Lf74;->L1(Ljava/lang/Object;Ljava/util/concurrent/Executor;)V

    .line 1082
    .line 1083
    .line 1084
    iget-object v6, v3, La83;->s:Le83;

    .line 1085
    .line 1086
    iget-object v8, v6, Le83;->a:Ljava/lang/String;

    .line 1087
    .line 1088
    sget-object v12, Lmz1;->J5:Liz1;

    .line 1089
    .line 1090
    invoke-virtual {v7, v12}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 1091
    .line 1092
    .line 1093
    move-result-object v7

    .line 1094
    check-cast v7, Ljava/lang/Boolean;

    .line 1095
    .line 1096
    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1097
    .line 1098
    .line 1099
    move-result v7

    .line 1100
    if-eqz v7, :cond_14

    .line 1101
    .line 1102
    iget-object v7, v1, Lai2;->y:Lba4;

    .line 1103
    .line 1104
    invoke-virtual {v7}, Lba4;->d()Ljava/lang/Object;

    .line 1105
    .line 1106
    .line 1107
    move-result-object v7

    .line 1108
    check-cast v7, Lwz2;

    .line 1109
    .line 1110
    invoke-virtual {v7}, Lwz2;->a()Z

    .line 1111
    .line 1112
    .line 1113
    move-result v7

    .line 1114
    if-eqz v7, :cond_14

    .line 1115
    .line 1116
    invoke-static {v3}, Ltg2;->b(La83;)Ljava/lang/String;

    .line 1117
    .line 1118
    .line 1119
    move-result-object v7

    .line 1120
    filled-new-array {v7}, [Ljava/lang/String;

    .line 1121
    .line 1122
    .line 1123
    move-result-object v7

    .line 1124
    invoke-static {v8, v7}, Ltg2;->a(Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;

    .line 1125
    .line 1126
    .line 1127
    move-result-object v8

    .line 1128
    :cond_14
    invoke-virtual {v2}, Lba4;->d()Ljava/lang/Object;

    .line 1129
    .line 1130
    .line 1131
    move-result-object v2

    .line 1132
    check-cast v2, Lou2;

    .line 1133
    .line 1134
    iget-object v2, v6, Le83;->b:Ljava/lang/String;

    .line 1135
    .line 1136
    iget-object v5, v5, Ljv2;->e:Landroid/os/Bundle;

    .line 1137
    .line 1138
    iget-object v6, v11, Lbi2;->k:Lba4;

    .line 1139
    .line 1140
    invoke-virtual {v6}, Lba4;->d()Ljava/lang/Object;

    .line 1141
    .line 1142
    .line 1143
    move-result-object v6

    .line 1144
    check-cast v6, Lda3;

    .line 1145
    .line 1146
    invoke-static {v10, v2, v8, v5, v6}, Lou2;->b(Lag2;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Lda3;)Lpd2;

    .line 1147
    .line 1148
    .line 1149
    move-result-object v2

    .line 1150
    iget-object v5, v2, Lpd2;->f:Lwq3;

    .line 1151
    .line 1152
    iget-boolean v3, v3, La83;->M:Z

    .line 1153
    .line 1154
    if-eqz v3, :cond_15

    .line 1155
    .line 1156
    new-instance v3, Lig2;

    .line 1157
    .line 1158
    const/4 v6, 0x7

    .line 1159
    invoke-direct {v3, v10, v6}, Lig2;-><init>(Lag2;I)V

    .line 1160
    .line 1161
    .line 1162
    invoke-virtual {v5, v3, v4}, Lgp3;->c(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 1163
    .line 1164
    .line 1165
    :cond_15
    new-instance v3, Lsz2;

    .line 1166
    .line 1167
    const/4 v6, 0x2

    .line 1168
    invoke-direct {v3, v0, v10, v6}, Lsz2;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 1169
    .line 1170
    .line 1171
    invoke-virtual {v5, v3, v4}, Lgp3;->c(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 1172
    .line 1173
    .line 1174
    new-instance v0, Lvn1;

    .line 1175
    .line 1176
    const/4 v3, 0x3

    .line 1177
    invoke-direct {v0, v3, v1}, Lvn1;-><init>(ILjava/lang/Object;)V

    .line 1178
    .line 1179
    .line 1180
    invoke-static {v2, v0, v9}, Lpu1;->P(Ln70;Lzk3;Ljava/util/concurrent/Executor;)Lrp3;

    .line 1181
    .line 1182
    .line 1183
    move-result-object v0

    .line 1184
    return-object v0

    .line 1185
    :pswitch_5
    iget-object v0, v1, Lop1;->b:Ljava/lang/Object;

    .line 1186
    .line 1187
    check-cast v0, Lh03;

    .line 1188
    .line 1189
    iget-object v2, v1, Lop1;->c:Ljava/lang/Object;

    .line 1190
    .line 1191
    move-object v6, v2

    .line 1192
    check-cast v6, La83;

    .line 1193
    .line 1194
    iget-object v2, v1, Lop1;->d:Ljava/lang/Object;

    .line 1195
    .line 1196
    check-cast v2, Lh83;

    .line 1197
    .line 1198
    iget-object v13, v0, Lh03;->i:Ljv2;

    .line 1199
    .line 1200
    sget-object v14, Lmz1;->p2:Liz1;

    .line 1201
    .line 1202
    sget-object v3, Ltw1;->e:Ltw1;

    .line 1203
    .line 1204
    iget-object v15, v3, Ltw1;->c:Lkz1;

    .line 1205
    .line 1206
    invoke-virtual {v15, v14}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 1207
    .line 1208
    .line 1209
    move-result-object v3

    .line 1210
    check-cast v3, Ljava/lang/Boolean;

    .line 1211
    .line 1212
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1213
    .line 1214
    .line 1215
    move-result v3

    .line 1216
    if-eqz v3, :cond_16

    .line 1217
    .line 1218
    iget-object v3, v13, Ljv2;->e:Landroid/os/Bundle;

    .line 1219
    .line 1220
    sget-object v4, Lhg4;->C:Lhg4;

    .line 1221
    .line 1222
    iget-object v4, v4, Lhg4;->k:Lym;

    .line 1223
    .line 1224
    const-string v5, "rendering-webview-creation-start"

    .line 1225
    .line 1226
    invoke-static {v4, v3, v5}, Lga1;->n(Lym;Landroid/os/Bundle;Ljava/lang/String;)V

    .line 1227
    .line 1228
    .line 1229
    :cond_16
    iget-object v3, v0, Lh03;->b:Lpu2;

    .line 1230
    .line 1231
    iget-object v8, v0, Lh03;->c:Ll83;

    .line 1232
    .line 1233
    iget-object v4, v2, Lh83;->b:Lp21;

    .line 1234
    .line 1235
    iget-object v4, v4, Lp21;->g:Ljava/lang/Object;

    .line 1236
    .line 1237
    check-cast v4, Lc83;

    .line 1238
    .line 1239
    iget-object v5, v8, Ll83;->f:Lxe4;

    .line 1240
    .line 1241
    invoke-virtual {v3, v5, v6, v4}, Lpu2;->a(Lxe4;La83;Lc83;)Lag2;

    .line 1242
    .line 1243
    .line 1244
    move-result-object v7

    .line 1245
    iget-boolean v3, v6, La83;->W:Z

    .line 1246
    .line 1247
    invoke-interface {v7, v3}, Lag2;->x0(Z)V

    .line 1248
    .line 1249
    .line 1250
    invoke-virtual {v15, v14}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 1251
    .line 1252
    .line 1253
    move-result-object v3

    .line 1254
    check-cast v3, Ljava/lang/Boolean;

    .line 1255
    .line 1256
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1257
    .line 1258
    .line 1259
    move-result v3

    .line 1260
    if-eqz v3, :cond_17

    .line 1261
    .line 1262
    iget-object v3, v13, Ljv2;->e:Landroid/os/Bundle;

    .line 1263
    .line 1264
    sget-object v4, Lhg4;->C:Lhg4;

    .line 1265
    .line 1266
    iget-object v4, v4, Lhg4;->k:Lym;

    .line 1267
    .line 1268
    const-string v5, "rendering-webview-creation-end"

    .line 1269
    .line 1270
    invoke-static {v4, v3, v5}, Lga1;->n(Lym;Landroid/os/Bundle;Ljava/lang/String;)V

    .line 1271
    .line 1272
    .line 1273
    :cond_17
    new-instance v5, Lpd2;

    .line 1274
    .line 1275
    invoke-direct {v5}, Lpd2;-><init>()V

    .line 1276
    .line 1277
    .line 1278
    iget-object v3, v0, Lh03;->a:Lzh2;

    .line 1279
    .line 1280
    new-instance v4, Lxb4;

    .line 1281
    .line 1282
    const/4 v9, 0x0

    .line 1283
    invoke-direct {v4, v2, v6, v9}, Lxb4;-><init>(Lh83;La83;Ljava/lang/String;)V

    .line 1284
    .line 1285
    .line 1286
    move-object/from16 v19, v4

    .line 1287
    .line 1288
    iget-object v4, v0, Lh03;->e:Le51;

    .line 1289
    .line 1290
    move-object v2, v9

    .line 1291
    iget-boolean v9, v0, Lh03;->g:Z

    .line 1292
    .line 1293
    iget-object v10, v0, Lh03;->f:Le42;

    .line 1294
    .line 1295
    iget-object v11, v0, Lh03;->h:Lpz2;

    .line 1296
    .line 1297
    iget-object v12, v0, Lh03;->j:Lmv2;

    .line 1298
    .line 1299
    new-instance v2, Ll92;

    .line 1300
    .line 1301
    move-object/from16 v16, v3

    .line 1302
    .line 1303
    new-instance v3, Lj03;

    .line 1304
    .line 1305
    move-object/from16 v1, v16

    .line 1306
    .line 1307
    const/16 v22, 0x0

    .line 1308
    .line 1309
    invoke-direct/range {v3 .. v12}, Lj03;-><init>(Le51;Lpd2;La83;Lag2;Ll83;ZLe42;Lpz2;Lmv2;)V

    .line 1310
    .line 1311
    .line 1312
    invoke-direct {v2, v3, v7}, Ll92;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1313
    .line 1314
    .line 1315
    new-instance v3, Lh80;

    .line 1316
    .line 1317
    iget v4, v6, La83;->a0:I

    .line 1318
    .line 1319
    const/4 v8, 0x4

    .line 1320
    invoke-direct {v3, v4, v8}, Lh80;-><init>(II)V

    .line 1321
    .line 1322
    .line 1323
    new-instance v16, Lxh2;

    .line 1324
    .line 1325
    iget-object v4, v1, Lzh2;->c:Lth2;

    .line 1326
    .line 1327
    iget-object v8, v1, Lzh2;->d:Lzh2;

    .line 1328
    .line 1329
    move-object/from16 v20, v2

    .line 1330
    .line 1331
    move-object/from16 v21, v3

    .line 1332
    .line 1333
    move-object/from16 v17, v4

    .line 1334
    .line 1335
    move-object/from16 v18, v8

    .line 1336
    .line 1337
    invoke-direct/range {v16 .. v21}, Lxh2;-><init>(Lth2;Lzh2;Lxb4;Ll92;Lh80;)V

    .line 1338
    .line 1339
    .line 1340
    move-object/from16 v2, v16

    .line 1341
    .line 1342
    invoke-virtual {v15, v14}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 1343
    .line 1344
    .line 1345
    move-result-object v3

    .line 1346
    check-cast v3, Ljava/lang/Boolean;

    .line 1347
    .line 1348
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1349
    .line 1350
    .line 1351
    move-result v3

    .line 1352
    if-eqz v3, :cond_18

    .line 1353
    .line 1354
    iget-object v3, v13, Ljv2;->e:Landroid/os/Bundle;

    .line 1355
    .line 1356
    sget-object v4, Lhg4;->C:Lhg4;

    .line 1357
    .line 1358
    iget-object v4, v4, Lhg4;->k:Lym;

    .line 1359
    .line 1360
    const-string v8, "rendering-ad-component-creation-end"

    .line 1361
    .line 1362
    invoke-static {v4, v3, v8}, Lga1;->n(Lym;Landroid/os/Bundle;Ljava/lang/String;)V

    .line 1363
    .line 1364
    .line 1365
    :cond_18
    iget-object v3, v2, Lxh2;->J:Lba4;

    .line 1366
    .line 1367
    invoke-virtual {v3}, Lba4;->d()Ljava/lang/Object;

    .line 1368
    .line 1369
    .line 1370
    move-result-object v4

    .line 1371
    check-cast v4, Lou2;

    .line 1372
    .line 1373
    const/4 v8, 0x1

    .line 1374
    if-eq v8, v9, :cond_19

    .line 1375
    .line 1376
    move-object/from16 v9, v22

    .line 1377
    .line 1378
    goto :goto_8

    .line 1379
    :cond_19
    move-object v9, v10

    .line 1380
    :goto_8
    const/4 v8, 0x0

    .line 1381
    iget-object v10, v13, Ljv2;->e:Landroid/os/Bundle;

    .line 1382
    .line 1383
    invoke-virtual {v4, v7, v8, v9, v10}, Lou2;->a(Lag2;ZLe42;Landroid/os/Bundle;)V

    .line 1384
    .line 1385
    .line 1386
    invoke-virtual {v5, v2}, Lpd2;->a(Ljava/lang/Object;)Z

    .line 1387
    .line 1388
    .line 1389
    iget-object v4, v2, Lxh2;->w:Lba4;

    .line 1390
    .line 1391
    invoke-virtual {v4}, Lba4;->d()Ljava/lang/Object;

    .line 1392
    .line 1393
    .line 1394
    move-result-object v4

    .line 1395
    check-cast v4, Lcn2;

    .line 1396
    .line 1397
    new-instance v5, Lg03;

    .line 1398
    .line 1399
    invoke-direct {v5, v7, v8}, Lg03;-><init>(Lag2;I)V

    .line 1400
    .line 1401
    .line 1402
    sget-object v8, Lmd2;->g:Lld2;

    .line 1403
    .line 1404
    invoke-virtual {v4, v5, v8}, Lf74;->L1(Ljava/lang/Object;Ljava/util/concurrent/Executor;)V

    .line 1405
    .line 1406
    .line 1407
    iget-object v4, v6, La83;->s:Le83;

    .line 1408
    .line 1409
    iget-object v5, v4, Le83;->a:Ljava/lang/String;

    .line 1410
    .line 1411
    sget-object v8, Lmz1;->J5:Liz1;

    .line 1412
    .line 1413
    invoke-virtual {v15, v8}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 1414
    .line 1415
    .line 1416
    move-result-object v8

    .line 1417
    check-cast v8, Ljava/lang/Boolean;

    .line 1418
    .line 1419
    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1420
    .line 1421
    .line 1422
    move-result v8

    .line 1423
    if-eqz v8, :cond_1a

    .line 1424
    .line 1425
    iget-object v8, v2, Lxh2;->v:Lba4;

    .line 1426
    .line 1427
    invoke-virtual {v8}, Lba4;->d()Ljava/lang/Object;

    .line 1428
    .line 1429
    .line 1430
    move-result-object v8

    .line 1431
    check-cast v8, Lwz2;

    .line 1432
    .line 1433
    invoke-virtual {v8}, Lwz2;->a()Z

    .line 1434
    .line 1435
    .line 1436
    move-result v8

    .line 1437
    if-eqz v8, :cond_1a

    .line 1438
    .line 1439
    invoke-static {v6}, Ltg2;->b(La83;)Ljava/lang/String;

    .line 1440
    .line 1441
    .line 1442
    move-result-object v8

    .line 1443
    filled-new-array {v8}, [Ljava/lang/String;

    .line 1444
    .line 1445
    .line 1446
    move-result-object v8

    .line 1447
    invoke-static {v5, v8}, Ltg2;->a(Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;

    .line 1448
    .line 1449
    .line 1450
    move-result-object v5

    .line 1451
    :cond_1a
    invoke-virtual {v3}, Lba4;->d()Ljava/lang/Object;

    .line 1452
    .line 1453
    .line 1454
    move-result-object v3

    .line 1455
    check-cast v3, Lou2;

    .line 1456
    .line 1457
    iget-object v3, v4, Le83;->b:Ljava/lang/String;

    .line 1458
    .line 1459
    iget-object v4, v13, Ljv2;->e:Landroid/os/Bundle;

    .line 1460
    .line 1461
    iget-object v1, v1, Lzh2;->f:Lba4;

    .line 1462
    .line 1463
    invoke-virtual {v1}, Lba4;->d()Ljava/lang/Object;

    .line 1464
    .line 1465
    .line 1466
    move-result-object v1

    .line 1467
    check-cast v1, Lda3;

    .line 1468
    .line 1469
    invoke-static {v7, v3, v5, v4, v1}, Lou2;->b(Lag2;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Lda3;)Lpd2;

    .line 1470
    .line 1471
    .line 1472
    move-result-object v1

    .line 1473
    new-instance v3, Ldm2;

    .line 1474
    .line 1475
    const/4 v4, 0x1

    .line 1476
    invoke-direct {v3, v7, v6, v2, v4}, Ldm2;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 1477
    .line 1478
    .line 1479
    iget-object v0, v0, Lh03;->d:Ljava/util/concurrent/Executor;

    .line 1480
    .line 1481
    invoke-static {v1, v3, v0}, Lpu1;->P(Ln70;Lzk3;Ljava/util/concurrent/Executor;)Lrp3;

    .line 1482
    .line 1483
    .line 1484
    move-result-object v0

    .line 1485
    return-object v0

    .line 1486
    :pswitch_6
    iget-object v0, v1, Lop1;->b:Ljava/lang/Object;

    .line 1487
    .line 1488
    check-cast v0, Lau2;

    .line 1489
    .line 1490
    iget-object v2, v1, Lop1;->d:Ljava/lang/Object;

    .line 1491
    .line 1492
    check-cast v2, Ljava/lang/String;

    .line 1493
    .line 1494
    iget-object v3, v1, Lop1;->c:Ljava/lang/Object;

    .line 1495
    .line 1496
    check-cast v3, Lorg/json/JSONObject;

    .line 1497
    .line 1498
    move-object/from16 v4, p1

    .line 1499
    .line 1500
    check-cast v4, Lag2;

    .line 1501
    .line 1502
    iget-object v0, v0, Lau2;->h:Lv32;

    .line 1503
    .line 1504
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1505
    .line 1506
    .line 1507
    new-instance v5, Lpd2;

    .line 1508
    .line 1509
    invoke-direct {v5}, Lpd2;-><init>()V

    .line 1510
    .line 1511
    .line 1512
    sget-object v6, Lhg4;->C:Lhg4;

    .line 1513
    .line 1514
    iget-object v6, v6, Lhg4;->c:Llf4;

    .line 1515
    .line 1516
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 1517
    .line 1518
    .line 1519
    move-result-object v6

    .line 1520
    invoke-virtual {v6}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 1521
    .line 1522
    .line 1523
    move-result-object v6

    .line 1524
    new-instance v7, Lj42;

    .line 1525
    .line 1526
    invoke-direct {v7, v0, v5}, Lj42;-><init>(Lv32;Lpd2;)V

    .line 1527
    .line 1528
    .line 1529
    invoke-virtual {v0, v6, v7}, Lv32;->a(Ljava/lang/String;Lk42;)V

    .line 1530
    .line 1531
    .line 1532
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    .line 1533
    .line 1534
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 1535
    .line 1536
    .line 1537
    const-string v7, "id"

    .line 1538
    .line 1539
    invoke-virtual {v0, v7, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1540
    .line 1541
    .line 1542
    const-string v6, "args"

    .line 1543
    .line 1544
    invoke-virtual {v0, v6, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1545
    .line 1546
    .line 1547
    invoke-interface {v4, v2, v0}, Lr52;->b(Ljava/lang/String;Lorg/json/JSONObject;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 1548
    .line 1549
    .line 1550
    goto :goto_9

    .line 1551
    :catch_0
    move-exception v0

    .line 1552
    invoke-virtual {v5, v0}, Lpd2;->b(Ljava/lang/Throwable;)V

    .line 1553
    .line 1554
    .line 1555
    :goto_9
    return-object v5

    .line 1556
    :pswitch_7
    iget-object v0, v1, Lop1;->b:Ljava/lang/Object;

    .line 1557
    .line 1558
    check-cast v0, Lmt2;

    .line 1559
    .line 1560
    iget-object v2, v1, Lop1;->c:Ljava/lang/Object;

    .line 1561
    .line 1562
    check-cast v2, Lsu1;

    .line 1563
    .line 1564
    iget-object v3, v1, Lop1;->d:Ljava/lang/Object;

    .line 1565
    .line 1566
    check-cast v3, Lsb2;

    .line 1567
    .line 1568
    iget-object v4, v0, Lmt2;->c:Lpu2;

    .line 1569
    .line 1570
    invoke-static {}, Lxe4;->a()Lxe4;

    .line 1571
    .line 1572
    .line 1573
    move-result-object v5

    .line 1574
    const/4 v6, 0x0

    .line 1575
    invoke-virtual {v4, v5, v6, v6}, Lpu2;->a(Lxe4;La83;Lc83;)Lag2;

    .line 1576
    .line 1577
    .line 1578
    move-result-object v4

    .line 1579
    new-instance v5, Lyw1;

    .line 1580
    .line 1581
    invoke-direct {v5, v4}, Lyw1;-><init>(Ljava/lang/Object;)V

    .line 1582
    .line 1583
    .line 1584
    invoke-virtual {v0, v4, v2, v3}, Lmt2;->a(Lag2;Lsu1;Lsb2;)V

    .line 1585
    .line 1586
    .line 1587
    invoke-interface {v4}, Lag2;->e0()Lsg2;

    .line 1588
    .line 1589
    .line 1590
    move-result-object v0

    .line 1591
    new-instance v2, Lz71;

    .line 1592
    .line 1593
    const/16 v3, 0x17

    .line 1594
    .line 1595
    invoke-direct {v2, v3, v5}, Lz71;-><init>(ILjava/lang/Object;)V

    .line 1596
    .line 1597
    .line 1598
    iput-object v2, v0, Lsg2;->m:Lvg2;

    .line 1599
    .line 1600
    sget-object v0, Lmz1;->f4:Liz1;

    .line 1601
    .line 1602
    sget-object v2, Ltw1;->e:Ltw1;

    .line 1603
    .line 1604
    iget-object v2, v2, Ltw1;->c:Lkz1;

    .line 1605
    .line 1606
    invoke-virtual {v2, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 1607
    .line 1608
    .line 1609
    move-result-object v0

    .line 1610
    check-cast v0, Ljava/lang/String;

    .line 1611
    .line 1612
    invoke-interface {v4, v0}, Lag2;->loadUrl(Ljava/lang/String;)V

    .line 1613
    .line 1614
    .line 1615
    return-object v5

    .line 1616
    :pswitch_8
    iget-object v0, v1, Lop1;->b:Ljava/lang/Object;

    .line 1617
    .line 1618
    check-cast v0, Lkl2;

    .line 1619
    .line 1620
    iget-object v2, v1, Lop1;->c:Ljava/lang/Object;

    .line 1621
    .line 1622
    check-cast v2, Lg4;

    .line 1623
    .line 1624
    iget-object v3, v1, Lop1;->d:Ljava/lang/Object;

    .line 1625
    .line 1626
    check-cast v3, Ln70;

    .line 1627
    .line 1628
    move-object/from16 v4, p1

    .line 1629
    .line 1630
    check-cast v4, Lel2;

    .line 1631
    .line 1632
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1633
    .line 1634
    .line 1635
    if-eqz v4, :cond_1b

    .line 1636
    .line 1637
    invoke-virtual {v2, v4}, Lg4;->p(Ljava/lang/Object;)V

    .line 1638
    .line 1639
    .line 1640
    :cond_1b
    sget-object v2, Lj12;->a:Lso1;

    .line 1641
    .line 1642
    invoke-virtual {v2}, Lso1;->w()Ljava/lang/Object;

    .line 1643
    .line 1644
    .line 1645
    move-result-object v2

    .line 1646
    check-cast v2, Ljava/lang/Long;

    .line 1647
    .line 1648
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 1649
    .line 1650
    .line 1651
    move-result-wide v4

    .line 1652
    iget-object v0, v0, Lkl2;->b:Ljava/util/concurrent/ScheduledExecutorService;

    .line 1653
    .line 1654
    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 1655
    .line 1656
    invoke-static {v3, v4, v5, v2, v0}, Lpu1;->N(Ln70;JLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/ScheduledExecutorService;)Ln70;

    .line 1657
    .line 1658
    .line 1659
    move-result-object v0

    .line 1660
    return-object v0

    .line 1661
    :pswitch_9
    iget-object v0, v1, Lop1;->b:Ljava/lang/Object;

    .line 1662
    .line 1663
    check-cast v0, Lcr1;

    .line 1664
    .line 1665
    iget-object v2, v1, Lop1;->c:Ljava/lang/Object;

    .line 1666
    .line 1667
    check-cast v2, [Lau2;

    .line 1668
    .line 1669
    iget-object v3, v1, Lop1;->d:Ljava/lang/Object;

    .line 1670
    .line 1671
    check-cast v3, Ljava/lang/String;

    .line 1672
    .line 1673
    move-object/from16 v4, p1

    .line 1674
    .line 1675
    check-cast v4, Lau2;

    .line 1676
    .line 1677
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1678
    .line 1679
    .line 1680
    const/4 v5, 0x0

    .line 1681
    aput-object v4, v2, v5

    .line 1682
    .line 1683
    iget-object v2, v0, Lcr1;->h:Landroid/content/Context;

    .line 1684
    .line 1685
    iget-object v5, v0, Lcr1;->n:Lo92;

    .line 1686
    .line 1687
    iget-object v6, v5, Lo92;->g:Ljava/util/Map;

    .line 1688
    .line 1689
    iget-object v5, v5, Lo92;->f:Landroid/view/View;

    .line 1690
    .line 1691
    const/4 v7, 0x0

    .line 1692
    invoke-static {v2, v6, v6, v5, v7}, Luk2;->Z(Landroid/content/Context;Ljava/util/Map;Ljava/util/Map;Landroid/view/View;Landroid/widget/ImageView$ScaleType;)Lorg/json/JSONObject;

    .line 1693
    .line 1694
    .line 1695
    move-result-object v2

    .line 1696
    iget-object v5, v0, Lcr1;->h:Landroid/content/Context;

    .line 1697
    .line 1698
    iget-object v6, v0, Lcr1;->n:Lo92;

    .line 1699
    .line 1700
    iget-object v6, v6, Lo92;->f:Landroid/view/View;

    .line 1701
    .line 1702
    invoke-static {v5, v6}, Luk2;->N(Landroid/content/Context;Landroid/view/View;)Lorg/json/JSONObject;

    .line 1703
    .line 1704
    .line 1705
    move-result-object v5

    .line 1706
    iget-object v6, v0, Lcr1;->n:Lo92;

    .line 1707
    .line 1708
    iget-object v6, v6, Lo92;->f:Landroid/view/View;

    .line 1709
    .line 1710
    invoke-static {v6}, Luk2;->S(Landroid/view/View;)Lorg/json/JSONObject;

    .line 1711
    .line 1712
    .line 1713
    move-result-object v6

    .line 1714
    iget-object v8, v0, Lcr1;->h:Landroid/content/Context;

    .line 1715
    .line 1716
    iget-object v9, v0, Lcr1;->n:Lo92;

    .line 1717
    .line 1718
    iget-object v9, v9, Lo92;->f:Landroid/view/View;

    .line 1719
    .line 1720
    invoke-static {v8, v9}, Luk2;->V(Landroid/content/Context;Landroid/view/View;)Lorg/json/JSONObject;

    .line 1721
    .line 1722
    .line 1723
    move-result-object v8

    .line 1724
    new-instance v9, Lorg/json/JSONObject;

    .line 1725
    .line 1726
    invoke-direct {v9}, Lorg/json/JSONObject;-><init>()V

    .line 1727
    .line 1728
    .line 1729
    const-string v10, "asset_view_signal"

    .line 1730
    .line 1731
    invoke-virtual {v9, v10, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1732
    .line 1733
    .line 1734
    const-string v2, "ad_view_signal"

    .line 1735
    .line 1736
    invoke-virtual {v9, v2, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1737
    .line 1738
    .line 1739
    const-string v2, "scroll_view_signal"

    .line 1740
    .line 1741
    invoke-virtual {v9, v2, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1742
    .line 1743
    .line 1744
    const-string v2, "lock_screen_signal"

    .line 1745
    .line 1746
    invoke-virtual {v9, v2, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1747
    .line 1748
    .line 1749
    const-string v2, "google.afma.nativeAds.getPublisherCustomRenderedClickSignals"

    .line 1750
    .line 1751
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1752
    .line 1753
    .line 1754
    move-result v2

    .line 1755
    if-eqz v2, :cond_1c

    .line 1756
    .line 1757
    iget-object v2, v0, Lcr1;->h:Landroid/content/Context;

    .line 1758
    .line 1759
    iget-object v5, v0, Lcr1;->p:Landroid/graphics/Point;

    .line 1760
    .line 1761
    iget-object v0, v0, Lcr1;->o:Landroid/graphics/Point;

    .line 1762
    .line 1763
    invoke-static {v7, v2, v5, v0}, Luk2;->b0(Ljava/lang/String;Landroid/content/Context;Landroid/graphics/Point;Landroid/graphics/Point;)Lorg/json/JSONObject;

    .line 1764
    .line 1765
    .line 1766
    move-result-object v0

    .line 1767
    const-string v2, "click_signal"

    .line 1768
    .line 1769
    invoke-virtual {v9, v2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1770
    .line 1771
    .line 1772
    :cond_1c
    invoke-virtual {v4, v3, v9}, Lau2;->a(Ljava/lang/String;Lorg/json/JSONObject;)Ln70;

    .line 1773
    .line 1774
    .line 1775
    move-result-object v0

    .line 1776
    return-object v0

    .line 1777
    :pswitch_data_0
    .packed-switch 0x0
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
