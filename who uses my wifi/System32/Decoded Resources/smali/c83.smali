.class public final Lc83;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final a:Ljava/util/List;

.field public final b:Ljava/lang/String;

.field public final c:I

.field public final d:I

.field public final e:Ljava/lang/String;

.field public final f:I

.field public final g:J

.field public final h:Z

.field public final i:Ljava/lang/String;

.field public final j:Lls3;

.field public final k:Landroid/os/Bundle;

.field public final l:Ljava/lang/String;

.field public final m:Ljava/lang/String;

.field public final n:Ljava/lang/String;

.field public final o:Lorg/json/JSONObject;

.field public final p:Lorg/json/JSONObject;

.field public final q:Ljava/lang/String;

.field public final r:I

.field public final s:J

.field public final t:J


# direct methods
.method public constructor <init>(Landroid/util/JsonReader;)V
    .locals 39

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 7
    .line 8
    new-instance v2, Landroid/os/Bundle;

    .line 9
    .line 10
    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 11
    .line 12
    .line 13
    new-instance v3, Lorg/json/JSONObject;

    .line 14
    .line 15
    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    .line 16
    .line 17
    .line 18
    new-instance v4, Lorg/json/JSONObject;

    .line 19
    .line 20
    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 21
    .line 22
    .line 23
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->beginObject()V

    .line 24
    .line 25
    .line 26
    const-string v8, ""

    .line 27
    .line 28
    const/4 v9, 0x0

    .line 29
    const/4 v10, 0x0

    .line 30
    move-object/from16 v23, v8

    .line 31
    .line 32
    move-object/from16 v24, v23

    .line 33
    .line 34
    move-object/from16 v25, v24

    .line 35
    .line 36
    move-object/from16 v26, v25

    .line 37
    .line 38
    move-object/from16 v27, v26

    .line 39
    .line 40
    move-object/from16 v28, v27

    .line 41
    .line 42
    move-object/from16 v29, v28

    .line 43
    .line 44
    move v14, v9

    .line 45
    move-object v15, v10

    .line 46
    const-wide/16 v5, -0x1

    .line 47
    .line 48
    const-wide/16 v11, -0x1

    .line 49
    .line 50
    const-wide/16 v16, -0x1

    .line 51
    .line 52
    const-wide/16 v18, 0x0

    .line 53
    .line 54
    const-wide/16 v20, 0x0

    .line 55
    .line 56
    const/16 v22, -0x1

    .line 57
    .line 58
    const/16 v30, 0x1

    .line 59
    .line 60
    move v10, v14

    .line 61
    :goto_0
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->hasNext()Z

    .line 62
    .line 63
    .line 64
    move-result v31

    .line 65
    if-eqz v31, :cond_21

    .line 66
    .line 67
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextName()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v13

    .line 71
    const-string v7, "nofill_urls"

    .line 72
    .line 73
    invoke-static {v13, v7}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v7

    .line 77
    if-eqz v7, :cond_0

    .line 78
    .line 79
    invoke-static/range {p1 .. p1}, Lbd2;->K(Landroid/util/JsonReader;)Ljava/util/ArrayList;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    :goto_1
    move-object/from16 v32, v8

    .line 84
    .line 85
    :goto_2
    const/4 v7, 0x1

    .line 86
    goto/16 :goto_b

    .line 87
    .line 88
    :cond_0
    const-string v7, "refresh_interval"

    .line 89
    .line 90
    invoke-virtual {v7, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result v7

    .line 94
    if-eqz v7, :cond_1

    .line 95
    .line 96
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextInt()I

    .line 97
    .line 98
    .line 99
    move-result v7

    .line 100
    move v9, v7

    .line 101
    goto :goto_1

    .line 102
    :cond_1
    const-string v7, "refresh_load_delay_time_interval"

    .line 103
    .line 104
    invoke-static {v13, v7}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    move-result v7

    .line 108
    if-eqz v7, :cond_2

    .line 109
    .line 110
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextInt()I

    .line 111
    .line 112
    .line 113
    move-result v22

    .line 114
    goto :goto_1

    .line 115
    :cond_2
    const-string v7, "gws_query_id"

    .line 116
    .line 117
    invoke-virtual {v7, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    move-result v7

    .line 121
    if-eqz v7, :cond_3

    .line 122
    .line 123
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v23

    .line 127
    goto :goto_1

    .line 128
    :cond_3
    const-string v7, "analytics_query_ad_event_id"

    .line 129
    .line 130
    invoke-virtual {v7, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 131
    .line 132
    .line 133
    move-result v7

    .line 134
    if-eqz v7, :cond_4

    .line 135
    .line 136
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v24

    .line 140
    goto :goto_1

    .line 141
    :cond_4
    const-string v7, "is_idless"

    .line 142
    .line 143
    invoke-virtual {v7, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 144
    .line 145
    .line 146
    move-result v7

    .line 147
    if-eqz v7, :cond_5

    .line 148
    .line 149
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextBoolean()Z

    .line 150
    .line 151
    .line 152
    move-result v7

    .line 153
    move v14, v7

    .line 154
    goto :goto_1

    .line 155
    :cond_5
    const-string v7, "response_code"

    .line 156
    .line 157
    invoke-virtual {v7, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 158
    .line 159
    .line 160
    move-result v7

    .line 161
    if-eqz v7, :cond_6

    .line 162
    .line 163
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextInt()I

    .line 164
    .line 165
    .line 166
    move-result v7

    .line 167
    move v10, v7

    .line 168
    goto :goto_1

    .line 169
    :cond_6
    const-string v7, "latency"

    .line 170
    .line 171
    invoke-virtual {v7, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 172
    .line 173
    .line 174
    move-result v7

    .line 175
    if-eqz v7, :cond_7

    .line 176
    .line 177
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextLong()J

    .line 178
    .line 179
    .line 180
    move-result-wide v20

    .line 181
    goto :goto_1

    .line 182
    :cond_7
    sget-object v7, Lmz1;->V8:Liz1;

    .line 183
    .line 184
    move-object/from16 v32, v8

    .line 185
    .line 186
    sget-object v8, Ltw1;->e:Ltw1;

    .line 187
    .line 188
    move-wide/from16 v33, v5

    .line 189
    .line 190
    iget-object v5, v8, Ltw1;->c:Lkz1;

    .line 191
    .line 192
    iget-object v6, v8, Ltw1;->c:Lkz1;

    .line 193
    .line 194
    invoke-virtual {v5, v7}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object v5

    .line 198
    check-cast v5, Ljava/lang/Boolean;

    .line 199
    .line 200
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 201
    .line 202
    .line 203
    move-result v5

    .line 204
    if-eqz v5, :cond_d

    .line 205
    .line 206
    const-string v5, "public_error"

    .line 207
    .line 208
    invoke-virtual {v5, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 209
    .line 210
    .line 211
    move-result v5

    .line 212
    if-eqz v5, :cond_d

    .line 213
    .line 214
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->peek()Landroid/util/JsonToken;

    .line 215
    .line 216
    .line 217
    move-result-object v5

    .line 218
    sget-object v7, Landroid/util/JsonToken;->BEGIN_OBJECT:Landroid/util/JsonToken;

    .line 219
    .line 220
    if-ne v5, v7, :cond_d

    .line 221
    .line 222
    new-instance v5, Lls3;

    .line 223
    .line 224
    invoke-direct {v5}, Lls3;-><init>()V

    .line 225
    .line 226
    .line 227
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->beginObject()V

    .line 228
    .line 229
    .line 230
    move-object/from16 v6, v32

    .line 231
    .line 232
    :goto_3
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->hasNext()Z

    .line 233
    .line 234
    .line 235
    move-result v7

    .line 236
    if-eqz v7, :cond_b

    .line 237
    .line 238
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextName()Ljava/lang/String;

    .line 239
    .line 240
    .line 241
    move-result-object v7

    .line 242
    invoke-virtual {v7}, Ljava/lang/String;->hashCode()I

    .line 243
    .line 244
    .line 245
    move-result v8

    .line 246
    const v13, -0x66ca7c04

    .line 247
    .line 248
    .line 249
    if-eq v8, v13, :cond_9

    .line 250
    .line 251
    const v13, 0x2eaded

    .line 252
    .line 253
    .line 254
    if-eq v8, v13, :cond_8

    .line 255
    .line 256
    goto :goto_4

    .line 257
    :cond_8
    const-string v8, "code"

    .line 258
    .line 259
    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 260
    .line 261
    .line 262
    move-result v7

    .line 263
    if-eqz v7, :cond_a

    .line 264
    .line 265
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextInt()I

    .line 266
    .line 267
    .line 268
    goto :goto_3

    .line 269
    :cond_9
    const-string v8, "description"

    .line 270
    .line 271
    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 272
    .line 273
    .line 274
    move-result v7

    .line 275
    if-eqz v7, :cond_a

    .line 276
    .line 277
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;

    .line 278
    .line 279
    .line 280
    move-result-object v6

    .line 281
    goto :goto_3

    .line 282
    :cond_a
    :goto_4
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->skipValue()V

    .line 283
    .line 284
    .line 285
    goto :goto_3

    .line 286
    :cond_b
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->endObject()V

    .line 287
    .line 288
    .line 289
    iput-object v6, v5, Lls3;->b:Ljava/lang/String;

    .line 290
    .line 291
    move-object v15, v5

    .line 292
    :cond_c
    :goto_5
    move-wide/from16 v5, v33

    .line 293
    .line 294
    goto/16 :goto_2

    .line 295
    .line 296
    :cond_d
    const-string v5, "bidding_data"

    .line 297
    .line 298
    invoke-virtual {v5, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 299
    .line 300
    .line 301
    move-result v5

    .line 302
    if-eqz v5, :cond_e

    .line 303
    .line 304
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;

    .line 305
    .line 306
    .line 307
    move-result-object v25

    .line 308
    goto :goto_5

    .line 309
    :cond_e
    sget-object v5, Lmz1;->ib:Liz1;

    .line 310
    .line 311
    invoke-virtual {v6, v5}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 312
    .line 313
    .line 314
    move-result-object v5

    .line 315
    check-cast v5, Ljava/lang/Boolean;

    .line 316
    .line 317
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 318
    .line 319
    .line 320
    move-result v5

    .line 321
    if-eqz v5, :cond_f

    .line 322
    .line 323
    const-string v5, "topics_should_record_observation"

    .line 324
    .line 325
    invoke-static {v13, v5}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 326
    .line 327
    .line 328
    move-result v5

    .line 329
    if-eqz v5, :cond_f

    .line 330
    .line 331
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextBoolean()Z

    .line 332
    .line 333
    .line 334
    :catch_0
    :goto_6
    const/4 v7, 0x1

    .line 335
    goto/16 :goto_7

    .line 336
    .line 337
    :cond_f
    const-string v5, "adapter_response_replacement_key"

    .line 338
    .line 339
    invoke-virtual {v5, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 340
    .line 341
    .line 342
    move-result v5

    .line 343
    if-eqz v5, :cond_10

    .line 344
    .line 345
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;

    .line 346
    .line 347
    .line 348
    move-result-object v29

    .line 349
    goto :goto_5

    .line 350
    :cond_10
    const-string v5, "response_info_extras"

    .line 351
    .line 352
    invoke-virtual {v5, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 353
    .line 354
    .line 355
    move-result v5

    .line 356
    if-eqz v5, :cond_12

    .line 357
    .line 358
    sget-object v5, Lmz1;->f7:Liz1;

    .line 359
    .line 360
    invoke-virtual {v6, v5}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 361
    .line 362
    .line 363
    move-result-object v5

    .line 364
    check-cast v5, Ljava/lang/Boolean;

    .line 365
    .line 366
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 367
    .line 368
    .line 369
    move-result v5

    .line 370
    if-eqz v5, :cond_11

    .line 371
    .line 372
    :try_start_0
    invoke-static/range {p1 .. p1}, Lbd2;->N(Landroid/util/JsonReader;)Lorg/json/JSONObject;

    .line 373
    .line 374
    .line 375
    move-result-object v5

    .line 376
    invoke-static {v5}, Lbd2;->X(Lorg/json/JSONObject;)Landroid/os/Bundle;

    .line 377
    .line 378
    .line 379
    move-result-object v5
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_1

    .line 380
    if-eqz v5, :cond_c

    .line 381
    .line 382
    move-object v2, v5

    .line 383
    goto :goto_5

    .line 384
    :catch_1
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->skipValue()V

    .line 385
    .line 386
    .line 387
    goto :goto_6

    .line 388
    :cond_11
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->skipValue()V

    .line 389
    .line 390
    .line 391
    goto :goto_6

    .line 392
    :cond_12
    const-string v5, "adRequestPostBody"

    .line 393
    .line 394
    invoke-virtual {v5, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 395
    .line 396
    .line 397
    move-result v5

    .line 398
    if-eqz v5, :cond_14

    .line 399
    .line 400
    sget-object v5, Lmz1;->ba:Liz1;

    .line 401
    .line 402
    invoke-virtual {v6, v5}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 403
    .line 404
    .line 405
    move-result-object v5

    .line 406
    check-cast v5, Ljava/lang/Boolean;

    .line 407
    .line 408
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 409
    .line 410
    .line 411
    move-result v5

    .line 412
    if-eqz v5, :cond_13

    .line 413
    .line 414
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;

    .line 415
    .line 416
    .line 417
    move-result-object v27

    .line 418
    goto :goto_5

    .line 419
    :cond_13
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->skipValue()V

    .line 420
    .line 421
    .line 422
    goto :goto_6

    .line 423
    :cond_14
    const-string v5, "adRequestUrl"

    .line 424
    .line 425
    invoke-virtual {v5, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 426
    .line 427
    .line 428
    move-result v5

    .line 429
    if-eqz v5, :cond_16

    .line 430
    .line 431
    sget-object v5, Lmz1;->ba:Liz1;

    .line 432
    .line 433
    invoke-virtual {v6, v5}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 434
    .line 435
    .line 436
    move-result-object v5

    .line 437
    check-cast v5, Ljava/lang/Boolean;

    .line 438
    .line 439
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 440
    .line 441
    .line 442
    move-result v5

    .line 443
    if-eqz v5, :cond_15

    .line 444
    .line 445
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;

    .line 446
    .line 447
    .line 448
    move-result-object v26

    .line 449
    goto/16 :goto_5

    .line 450
    .line 451
    :cond_15
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->skipValue()V

    .line 452
    .line 453
    .line 454
    goto :goto_6

    .line 455
    :cond_16
    sget-object v5, Lmz1;->ca:Liz1;

    .line 456
    .line 457
    invoke-virtual {v6, v5}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 458
    .line 459
    .line 460
    move-result-object v7

    .line 461
    check-cast v7, Ljava/lang/Boolean;

    .line 462
    .line 463
    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    .line 464
    .line 465
    .line 466
    move-result v7

    .line 467
    if-eqz v7, :cond_17

    .line 468
    .line 469
    const-string v7, "adResponseBody"

    .line 470
    .line 471
    invoke-static {v13, v7}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 472
    .line 473
    .line 474
    move-result v7

    .line 475
    if-eqz v7, :cond_17

    .line 476
    .line 477
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;

    .line 478
    .line 479
    .line 480
    move-result-object v28

    .line 481
    goto/16 :goto_5

    .line 482
    .line 483
    :cond_17
    invoke-virtual {v6, v5}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 484
    .line 485
    .line 486
    move-result-object v5

    .line 487
    check-cast v5, Ljava/lang/Boolean;

    .line 488
    .line 489
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 490
    .line 491
    .line 492
    move-result v5

    .line 493
    if-eqz v5, :cond_18

    .line 494
    .line 495
    const-string v5, "adResponseHeaders"

    .line 496
    .line 497
    invoke-static {v13, v5}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 498
    .line 499
    .line 500
    move-result v5

    .line 501
    if-eqz v5, :cond_18

    .line 502
    .line 503
    invoke-static/range {p1 .. p1}, Lbd2;->N(Landroid/util/JsonReader;)Lorg/json/JSONObject;

    .line 504
    .line 505
    .line 506
    move-result-object v3

    .line 507
    goto/16 :goto_5

    .line 508
    .line 509
    :cond_18
    const-string v5, "max_parallel_renderers"

    .line 510
    .line 511
    invoke-static {v13, v5}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 512
    .line 513
    .line 514
    move-result v5

    .line 515
    if-eqz v5, :cond_1a

    .line 516
    .line 517
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextInt()I

    .line 518
    .line 519
    .line 520
    move-result v5

    .line 521
    const/4 v7, 0x1

    .line 522
    invoke-static {v7, v5}, Ljava/lang/Math;->max(II)I

    .line 523
    .line 524
    .line 525
    move-result v30

    .line 526
    :catch_2
    :cond_19
    :goto_7
    move-wide/from16 v5, v33

    .line 527
    .line 528
    goto/16 :goto_b

    .line 529
    .line 530
    :cond_1a
    const/4 v7, 0x1

    .line 531
    sget-object v5, Lmz1;->ka:Liz1;

    .line 532
    .line 533
    invoke-virtual {v6, v5}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 534
    .line 535
    .line 536
    move-result-object v5

    .line 537
    check-cast v5, Ljava/lang/Boolean;

    .line 538
    .line 539
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 540
    .line 541
    .line 542
    move-result v5

    .line 543
    if-eqz v5, :cond_1b

    .line 544
    .line 545
    const-string v5, "inspector_ad_transaction_extras"

    .line 546
    .line 547
    invoke-static {v13, v5}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 548
    .line 549
    .line 550
    move-result v5

    .line 551
    if-eqz v5, :cond_1b

    .line 552
    .line 553
    invoke-static/range {p1 .. p1}, Lbd2;->N(Landroid/util/JsonReader;)Lorg/json/JSONObject;

    .line 554
    .line 555
    .line 556
    move-result-object v4

    .line 557
    goto :goto_7

    .line 558
    :cond_1b
    sget-object v5, Lmz1;->n2:Liz1;

    .line 559
    .line 560
    invoke-virtual {v6, v5}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 561
    .line 562
    .line 563
    move-result-object v5

    .line 564
    check-cast v5, Ljava/lang/Boolean;

    .line 565
    .line 566
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 567
    .line 568
    .line 569
    move-result v5

    .line 570
    if-eqz v5, :cond_20

    .line 571
    .line 572
    const-string v5, "latency_extras"

    .line 573
    .line 574
    invoke-static {v13, v5}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 575
    .line 576
    .line 577
    move-result v5

    .line 578
    if-eqz v5, :cond_20

    .line 579
    .line 580
    :try_start_1
    invoke-static/range {p1 .. p1}, Lbd2;->N(Landroid/util/JsonReader;)Lorg/json/JSONObject;

    .line 581
    .line 582
    .line 583
    move-result-object v5

    .line 584
    invoke-static {v5}, Lbd2;->X(Lorg/json/JSONObject;)Landroid/os/Bundle;

    .line 585
    .line 586
    .line 587
    move-result-object v5

    .line 588
    if-eqz v5, :cond_19

    .line 589
    .line 590
    const-string v6, "start_time"

    .line 591
    .line 592
    invoke-virtual {v5, v6}, Landroid/os/BaseBundle;->getDouble(Ljava/lang/String;)D

    .line 593
    .line 594
    .line 595
    move-result-wide v11

    .line 596
    const-wide/high16 v35, 0x43e0000000000000L    # 9.223372036854776E18

    .line 597
    .line 598
    cmpl-double v6, v11, v35

    .line 599
    .line 600
    const-wide/high16 v37, -0x3c20000000000000L    # -9.223372036854776E18

    .line 601
    .line 602
    if-gtz v6, :cond_1d

    .line 603
    .line 604
    cmpg-double v6, v11, v37

    .line 605
    .line 606
    if-gez v6, :cond_1c

    .line 607
    .line 608
    goto :goto_8

    .line 609
    :cond_1c
    double-to-long v11, v11

    .line 610
    goto :goto_9

    .line 611
    :cond_1d
    :goto_8
    move-wide/from16 v11, v16

    .line 612
    .line 613
    :goto_9
    const-string v6, "end_time"

    .line 614
    .line 615
    invoke-virtual {v5, v6}, Landroid/os/BaseBundle;->getDouble(Ljava/lang/String;)D

    .line 616
    .line 617
    .line 618
    move-result-wide v5
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_3

    .line 619
    cmpl-double v8, v5, v35

    .line 620
    .line 621
    if-gtz v8, :cond_1f

    .line 622
    .line 623
    cmpg-double v8, v5, v37

    .line 624
    .line 625
    if-gez v8, :cond_1e

    .line 626
    .line 627
    goto :goto_a

    .line 628
    :cond_1e
    double-to-long v5, v5

    .line 629
    goto :goto_b

    .line 630
    :cond_1f
    :goto_a
    move-wide/from16 v5, v16

    .line 631
    .line 632
    goto :goto_b

    .line 633
    :catch_3
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->skipValue()V

    .line 634
    .line 635
    .line 636
    goto :goto_7

    .line 637
    :cond_20
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->skipValue()V

    .line 638
    .line 639
    .line 640
    goto :goto_7

    .line 641
    :goto_b
    move-object/from16 v8, v32

    .line 642
    .line 643
    goto/16 :goto_0

    .line 644
    .line 645
    :cond_21
    move-wide/from16 v33, v5

    .line 646
    .line 647
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->endObject()V

    .line 648
    .line 649
    .line 650
    iput-object v1, v0, Lc83;->a:Ljava/util/List;

    .line 651
    .line 652
    iput v9, v0, Lc83;->c:I

    .line 653
    .line 654
    sget-object v1, Lc12;->c:Lso1;

    .line 655
    .line 656
    invoke-virtual {v1}, Lso1;->w()Ljava/lang/Object;

    .line 657
    .line 658
    .line 659
    move-result-object v1

    .line 660
    check-cast v1, Ljava/lang/Boolean;

    .line 661
    .line 662
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 663
    .line 664
    .line 665
    move-result v1

    .line 666
    if-eqz v1, :cond_22

    .line 667
    .line 668
    const/4 v1, -0x1

    .line 669
    iput v1, v0, Lc83;->d:I

    .line 670
    .line 671
    :goto_c
    move-object/from16 v8, v23

    .line 672
    .line 673
    goto :goto_d

    .line 674
    :cond_22
    sget-object v1, Lj02;->a:Lso1;

    .line 675
    .line 676
    invoke-virtual {v1}, Lso1;->w()Ljava/lang/Object;

    .line 677
    .line 678
    .line 679
    move-result-object v5

    .line 680
    check-cast v5, Ljava/lang/Long;

    .line 681
    .line 682
    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    .line 683
    .line 684
    .line 685
    move-result-wide v5

    .line 686
    cmp-long v5, v5, v16

    .line 687
    .line 688
    if-lez v5, :cond_23

    .line 689
    .line 690
    invoke-virtual {v1}, Lso1;->w()Ljava/lang/Object;

    .line 691
    .line 692
    .line 693
    move-result-object v1

    .line 694
    check-cast v1, Ljava/lang/Long;

    .line 695
    .line 696
    invoke-virtual {v1}, Ljava/lang/Long;->intValue()I

    .line 697
    .line 698
    .line 699
    move-result v1

    .line 700
    iput v1, v0, Lc83;->d:I

    .line 701
    .line 702
    goto :goto_c

    .line 703
    :cond_23
    move/from16 v13, v22

    .line 704
    .line 705
    iput v13, v0, Lc83;->d:I

    .line 706
    .line 707
    goto :goto_c

    .line 708
    :goto_d
    iput-object v8, v0, Lc83;->b:Ljava/lang/String;

    .line 709
    .line 710
    move-object/from16 v8, v24

    .line 711
    .line 712
    iput-object v8, v0, Lc83;->e:Ljava/lang/String;

    .line 713
    .line 714
    iput v10, v0, Lc83;->f:I

    .line 715
    .line 716
    move-wide/from16 v5, v20

    .line 717
    .line 718
    iput-wide v5, v0, Lc83;->g:J

    .line 719
    .line 720
    iput-object v15, v0, Lc83;->j:Lls3;

    .line 721
    .line 722
    iput-boolean v14, v0, Lc83;->h:Z

    .line 723
    .line 724
    move-object/from16 v8, v25

    .line 725
    .line 726
    iput-object v8, v0, Lc83;->i:Ljava/lang/String;

    .line 727
    .line 728
    iput-object v2, v0, Lc83;->k:Landroid/os/Bundle;

    .line 729
    .line 730
    move-object/from16 v8, v26

    .line 731
    .line 732
    iput-object v8, v0, Lc83;->l:Ljava/lang/String;

    .line 733
    .line 734
    move-object/from16 v8, v27

    .line 735
    .line 736
    iput-object v8, v0, Lc83;->m:Ljava/lang/String;

    .line 737
    .line 738
    move-object/from16 v8, v28

    .line 739
    .line 740
    iput-object v8, v0, Lc83;->n:Ljava/lang/String;

    .line 741
    .line 742
    iput-object v3, v0, Lc83;->o:Lorg/json/JSONObject;

    .line 743
    .line 744
    iput-object v4, v0, Lc83;->p:Lorg/json/JSONObject;

    .line 745
    .line 746
    move-object/from16 v8, v29

    .line 747
    .line 748
    iput-object v8, v0, Lc83;->q:Ljava/lang/String;

    .line 749
    .line 750
    sget-object v1, Lw02;->a:Lso1;

    .line 751
    .line 752
    invoke-virtual {v1}, Lso1;->w()Ljava/lang/Object;

    .line 753
    .line 754
    .line 755
    move-result-object v2

    .line 756
    check-cast v2, Ljava/lang/Long;

    .line 757
    .line 758
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 759
    .line 760
    .line 761
    move-result-wide v2

    .line 762
    cmp-long v2, v2, v18

    .line 763
    .line 764
    if-lez v2, :cond_24

    .line 765
    .line 766
    invoke-virtual {v1}, Lso1;->w()Ljava/lang/Object;

    .line 767
    .line 768
    .line 769
    move-result-object v1

    .line 770
    check-cast v1, Ljava/lang/Long;

    .line 771
    .line 772
    invoke-virtual {v1}, Ljava/lang/Long;->intValue()I

    .line 773
    .line 774
    .line 775
    move-result v30

    .line 776
    :cond_24
    move/from16 v1, v30

    .line 777
    .line 778
    iput v1, v0, Lc83;->r:I

    .line 779
    .line 780
    iput-wide v11, v0, Lc83;->s:J

    .line 781
    .line 782
    move-wide/from16 v5, v33

    .line 783
    .line 784
    iput-wide v5, v0, Lc83;->t:J

    .line 785
    .line 786
    return-void
.end method
