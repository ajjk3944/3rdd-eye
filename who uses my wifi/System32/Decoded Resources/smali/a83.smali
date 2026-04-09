.class public final La83;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final A:Lrb2;

.field public final A0:Ljava/util/AbstractCollection;

.field public final B:Ljava/lang/String;

.field public final B0:Z

.field public final C:Lorg/json/JSONObject;

.field public final C0:Lsn3;

.field public final D:Lorg/json/JSONObject;

.field public final D0:Z

.field public final E:Ljava/lang/String;

.field public final E0:I

.field public final F:Ljava/lang/String;

.field public final G:Ljava/lang/String;

.field public final H:Ljava/lang/String;

.field public final I:Ljava/lang/String;

.field public final J:Z

.field public final K:Z

.field public final L:Z

.field public final M:Z

.field public final N:Z

.field public final O:Z

.field public final P:Z

.field public final Q:I

.field public final R:I

.field public final S:Z

.field public final T:Z

.field public final U:Ljava/lang/String;

.field public final V:Lug0;

.field public final W:Z

.field public final X:Z

.field public final Y:I

.field public final Z:Ljava/lang/String;

.field public final a:Ljava/util/List;

.field public final a0:I

.field public final b:I

.field public final b0:Ljava/lang/String;

.field public final c:Ljava/util/List;

.field public final c0:Z

.field public final d:Ljava/util/List;

.field public final d0:Lg92;

.field public final e:I

.field public final e0:Ldg4;

.field public final f:Ljava/util/List;

.field public final f0:Ljava/lang/String;

.field public final g:Ljava/util/List;

.field public final g0:Z

.field public final h:Ljava/util/List;

.field public final h0:Lorg/json/JSONObject;

.field public final i:Ljava/util/List;

.field public final i0:Z

.field public final j:Ljava/lang/String;

.field public final j0:Lorg/json/JSONObject;

.field public final k:Ljava/lang/String;

.field public final k0:Z

.field public final l:Lta2;

.field public final l0:Ljava/lang/String;

.field public final m:Ljava/util/List;

.field public final m0:Z

.field public final n:Ljava/util/List;

.field public final n0:Ljava/lang/String;

.field public final o:Ljava/util/List;

.field public final o0:Ljava/lang/String;

.field public final p:Ljava/util/List;

.field public final p0:Ljava/lang/String;

.field public final q:I

.field public final q0:Z

.field public final r:Ljava/util/List;

.field public final r0:Z

.field public final s:Le83;

.field public final s0:I

.field public final t:Ljava/util/List;

.field public final t0:Ljava/lang/String;

.field public final u:Ljava/util/List;

.field public final u0:Ljava/util/AbstractCollection;

.field public final v:Lorg/json/JSONObject;

.field public final v0:Z

.field public final w:Ljava/lang/String;

.field public final w0:Ljava/util/HashMap;

.field public final x:Ljava/lang/String;

.field public final x0:Lx34;

.field public final y:Ljava/lang/String;

.field public final y0:Lrc4;

.field public final z:Ljava/lang/String;

.field public final z0:D


# direct methods
.method public constructor <init>(Landroid/util/JsonReader;)V
    .locals 105

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
    new-instance v2, Lorg/json/JSONObject;

    .line 9
    .line 10
    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

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
    new-instance v5, Lorg/json/JSONObject;

    .line 24
    .line 25
    invoke-direct {v5}, Lorg/json/JSONObject;-><init>()V

    .line 26
    .line 27
    .line 28
    new-instance v6, Lorg/json/JSONObject;

    .line 29
    .line 30
    invoke-direct {v6}, Lorg/json/JSONObject;-><init>()V

    .line 31
    .line 32
    .line 33
    new-instance v7, Lorg/json/JSONObject;

    .line 34
    .line 35
    invoke-direct {v7}, Lorg/json/JSONObject;-><init>()V

    .line 36
    .line 37
    .line 38
    sget-object v8, Lxm3;->g:Lvm3;

    .line 39
    .line 40
    sget-object v8, Lsn3;->j:Lsn3;

    .line 41
    .line 42
    new-instance v9, Ljava/util/HashMap;

    .line 43
    .line 44
    invoke-direct {v9}, Ljava/util/HashMap;-><init>()V

    .line 45
    .line 46
    .line 47
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->beginObject()V

    .line 48
    .line 49
    .line 50
    const-wide/16 v12, 0x0

    .line 51
    .line 52
    const-string v15, ""

    .line 53
    .line 54
    move-object v10, v1

    .line 55
    move-object/from16 v16, v10

    .line 56
    .line 57
    move-object/from16 v17, v16

    .line 58
    .line 59
    move-object/from16 v18, v2

    .line 60
    .line 61
    move-object/from16 v19, v3

    .line 62
    .line 63
    move-object/from16 v20, v4

    .line 64
    .line 65
    move-object/from16 v21, v5

    .line 66
    .line 67
    move-object/from16 v22, v6

    .line 68
    .line 69
    move-object/from16 v23, v7

    .line 70
    .line 71
    move-object/from16 v24, v8

    .line 72
    .line 73
    move-object/from16 v25, v24

    .line 74
    .line 75
    move-object/from16 v26, v25

    .line 76
    .line 77
    move-object/from16 v27, v9

    .line 78
    .line 79
    move-wide/from16 v28, v12

    .line 80
    .line 81
    move-object/from16 v32, v15

    .line 82
    .line 83
    move-object/from16 v33, v32

    .line 84
    .line 85
    move-object/from16 v37, v33

    .line 86
    .line 87
    move-object/from16 v38, v37

    .line 88
    .line 89
    move-object/from16 v39, v38

    .line 90
    .line 91
    move-object/from16 v40, v39

    .line 92
    .line 93
    move-object/from16 v42, v40

    .line 94
    .line 95
    move-object/from16 v53, v42

    .line 96
    .line 97
    move-object/from16 v57, v53

    .line 98
    .line 99
    move-object/from16 v59, v57

    .line 100
    .line 101
    move-object/from16 v63, v59

    .line 102
    .line 103
    move-object/from16 v65, v63

    .line 104
    .line 105
    move-object/from16 v66, v65

    .line 106
    .line 107
    move-object/from16 v67, v66

    .line 108
    .line 109
    move-object/from16 v68, v67

    .line 110
    .line 111
    move-object/from16 v69, v68

    .line 112
    .line 113
    move-object/from16 v75, v69

    .line 114
    .line 115
    move-object/from16 v76, v75

    .line 116
    .line 117
    move-object/from16 v77, v76

    .line 118
    .line 119
    move-object/from16 v81, v77

    .line 120
    .line 121
    const/16 v30, 0x0

    .line 122
    .line 123
    const/16 v31, 0x0

    .line 124
    .line 125
    const/16 v34, 0x0

    .line 126
    .line 127
    const/16 v35, 0x0

    .line 128
    .line 129
    const/16 v36, 0x0

    .line 130
    .line 131
    const/16 v41, 0x0

    .line 132
    .line 133
    const/16 v43, 0x0

    .line 134
    .line 135
    const/16 v44, 0x0

    .line 136
    .line 137
    const/16 v45, 0x0

    .line 138
    .line 139
    const/16 v46, 0x0

    .line 140
    .line 141
    const/16 v47, 0x0

    .line 142
    .line 143
    const/16 v48, 0x0

    .line 144
    .line 145
    const/16 v49, 0x0

    .line 146
    .line 147
    const/16 v50, -0x1

    .line 148
    .line 149
    const/16 v51, 0x0

    .line 150
    .line 151
    const/16 v52, 0x0

    .line 152
    .line 153
    const/16 v54, 0x0

    .line 154
    .line 155
    const/16 v55, 0x0

    .line 156
    .line 157
    const/16 v56, 0x0

    .line 158
    .line 159
    const/16 v58, -0x1

    .line 160
    .line 161
    const/16 v60, 0x0

    .line 162
    .line 163
    const/16 v61, 0x0

    .line 164
    .line 165
    const/16 v62, 0x0

    .line 166
    .line 167
    const/16 v64, 0x0

    .line 168
    .line 169
    const/16 v70, 0x0

    .line 170
    .line 171
    const/16 v71, 0x0

    .line 172
    .line 173
    const/16 v72, 0x0

    .line 174
    .line 175
    const/16 v73, 0x0

    .line 176
    .line 177
    const/16 v74, 0x0

    .line 178
    .line 179
    const/16 v78, 0x0

    .line 180
    .line 181
    const/16 v79, 0x0

    .line 182
    .line 183
    const/16 v80, 0x0

    .line 184
    .line 185
    const/16 v82, 0x0

    .line 186
    .line 187
    const/16 v83, 0x0

    .line 188
    .line 189
    const/16 v84, 0x0

    .line 190
    .line 191
    const/16 v85, 0x0

    .line 192
    .line 193
    const/16 v86, 0x0

    .line 194
    .line 195
    const/16 v87, -0x1

    .line 196
    .line 197
    move-object/from16 v2, v17

    .line 198
    .line 199
    move-object v3, v2

    .line 200
    move-object v4, v3

    .line 201
    move-object v5, v4

    .line 202
    move-object v6, v5

    .line 203
    move-object v7, v6

    .line 204
    move-object v8, v7

    .line 205
    move-object v9, v8

    .line 206
    move-object v12, v9

    .line 207
    move-object v13, v12

    .line 208
    :goto_0
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->hasNext()Z

    .line 209
    .line 210
    .line 211
    move-result v88

    .line 212
    if-eqz v88, :cond_27

    .line 213
    .line 214
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextName()Ljava/lang/String;

    .line 215
    .line 216
    .line 217
    move-result-object v88

    .line 218
    if-nez v88, :cond_0

    .line 219
    .line 220
    move-object/from16 v89, v15

    .line 221
    .line 222
    goto :goto_1

    .line 223
    :cond_0
    move-object/from16 v89, v88

    .line 224
    .line 225
    :goto_1
    invoke-virtual/range {v89 .. v89}, Ljava/lang/String;->hashCode()I

    .line 226
    .line 227
    .line 228
    move-result v88

    .line 229
    const-string v14, "id"

    .line 230
    .line 231
    const/16 v91, 0x7

    .line 232
    .line 233
    const/16 v92, 0x6

    .line 234
    .line 235
    const/4 v11, 0x1

    .line 236
    sparse-switch v88, :sswitch_data_0

    .line 237
    .line 238
    .line 239
    :cond_1
    move-object/from16 v98, v6

    .line 240
    .line 241
    move-object/from16 v97, v7

    .line 242
    .line 243
    move-object/from16 v96, v8

    .line 244
    .line 245
    move-object/from16 v95, v9

    .line 246
    .line 247
    move-object/from16 v88, v10

    .line 248
    .line 249
    move-object/from16 v94, v12

    .line 250
    .line 251
    move-object/from16 v89, v13

    .line 252
    .line 253
    :goto_2
    const/4 v12, 0x0

    .line 254
    const/16 v90, 0x0

    .line 255
    .line 256
    goto/16 :goto_22

    .line 257
    .line 258
    :sswitch_0
    const-string v11, "flow_control"

    .line 259
    .line 260
    move-object/from16 v14, v89

    .line 261
    .line 262
    invoke-virtual {v14, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 263
    .line 264
    .line 265
    move-result v11

    .line 266
    if-eqz v11, :cond_1

    .line 267
    .line 268
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextBoolean()Z

    .line 269
    .line 270
    .line 271
    move-result v85

    .line 272
    :goto_3
    move-object/from16 v94, v12

    .line 273
    .line 274
    :goto_4
    const/4 v12, 0x0

    .line 275
    const/16 v90, 0x0

    .line 276
    .line 277
    goto/16 :goto_23

    .line 278
    .line 279
    :sswitch_1
    move-object/from16 v14, v89

    .line 280
    .line 281
    const-string v11, "render_serially"

    .line 282
    .line 283
    invoke-virtual {v14, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 284
    .line 285
    .line 286
    move-result v11

    .line 287
    if-eqz v11, :cond_1

    .line 288
    .line 289
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextBoolean()Z

    .line 290
    .line 291
    .line 292
    move-result v82

    .line 293
    goto :goto_3

    .line 294
    :sswitch_2
    move-object/from16 v14, v89

    .line 295
    .line 296
    const-string v11, "manual_tracking_urls"

    .line 297
    .line 298
    invoke-virtual {v14, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 299
    .line 300
    .line 301
    move-result v11

    .line 302
    if-eqz v11, :cond_1

    .line 303
    .line 304
    invoke-static/range {p1 .. p1}, Lbd2;->K(Landroid/util/JsonReader;)Ljava/util/ArrayList;

    .line 305
    .line 306
    .line 307
    move-result-object v11

    .line 308
    move-object v13, v11

    .line 309
    goto :goto_3

    .line 310
    :sswitch_3
    move-object/from16 v14, v89

    .line 311
    .line 312
    const-string v11, "rule_line_external_id"

    .line 313
    .line 314
    invoke-virtual {v14, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 315
    .line 316
    .line 317
    move-result v11

    .line 318
    if-eqz v11, :cond_1

    .line 319
    .line 320
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;

    .line 321
    .line 322
    .line 323
    move-result-object v63

    .line 324
    goto :goto_3

    .line 325
    :sswitch_4
    move-object/from16 v14, v89

    .line 326
    .line 327
    const-string v11, "is_analytics_logging_enabled"

    .line 328
    .line 329
    invoke-virtual {v14, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 330
    .line 331
    .line 332
    move-result v11

    .line 333
    if-eqz v11, :cond_1

    .line 334
    .line 335
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextBoolean()Z

    .line 336
    .line 337
    .line 338
    move-result v54

    .line 339
    goto :goto_3

    .line 340
    :sswitch_5
    move-object/from16 v14, v89

    .line 341
    .line 342
    const-string v11, "renderers"

    .line 343
    .line 344
    invoke-virtual {v14, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 345
    .line 346
    .line 347
    move-result v11

    .line 348
    if-eqz v11, :cond_1

    .line 349
    .line 350
    invoke-static/range {p1 .. p1}, Lbd2;->K(Landroid/util/JsonReader;)Ljava/util/ArrayList;

    .line 351
    .line 352
    .line 353
    move-result-object v1

    .line 354
    goto :goto_3

    .line 355
    :sswitch_6
    move-object/from16 v14, v89

    .line 356
    .line 357
    const-string v11, "use_third_party_container_height"

    .line 358
    .line 359
    invoke-virtual {v14, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 360
    .line 361
    .line 362
    move-result v11

    .line 363
    if-eqz v11, :cond_1

    .line 364
    .line 365
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextBoolean()Z

    .line 366
    .line 367
    .line 368
    move-result v60

    .line 369
    goto :goto_3

    .line 370
    :sswitch_7
    move-object/from16 v14, v89

    .line 371
    .line 372
    const-string v11, "video_reward_urls"

    .line 373
    .line 374
    invoke-virtual {v14, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 375
    .line 376
    .line 377
    move-result v11

    .line 378
    if-eqz v11, :cond_1

    .line 379
    .line 380
    invoke-static/range {p1 .. p1}, Lbd2;->K(Landroid/util/JsonReader;)Ljava/util/ArrayList;

    .line 381
    .line 382
    .line 383
    move-result-object v6

    .line 384
    goto :goto_3

    .line 385
    :sswitch_8
    move-object/from16 v14, v89

    .line 386
    .line 387
    const-string v11, "ad_network_class_name"

    .line 388
    .line 389
    invoke-virtual {v14, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 390
    .line 391
    .line 392
    move-result v11

    .line 393
    if-eqz v11, :cond_1

    .line 394
    .line 395
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;

    .line 396
    .line 397
    .line 398
    move-result-object v65

    .line 399
    goto :goto_3

    .line 400
    :sswitch_9
    move-object/from16 v14, v89

    .line 401
    .line 402
    const-string v11, "video_start_urls"

    .line 403
    .line 404
    invoke-virtual {v14, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 405
    .line 406
    .line 407
    move-result v11

    .line 408
    if-eqz v11, :cond_1

    .line 409
    .line 410
    invoke-static/range {p1 .. p1}, Lbd2;->K(Landroid/util/JsonReader;)Ljava/util/ArrayList;

    .line 411
    .line 412
    .line 413
    move-result-object v5

    .line 414
    goto/16 :goto_3

    .line 415
    .line 416
    :sswitch_a
    move-object/from16 v14, v89

    .line 417
    .line 418
    const-string v11, "bid_response"

    .line 419
    .line 420
    invoke-virtual {v14, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 421
    .line 422
    .line 423
    move-result v11

    .line 424
    if-eqz v11, :cond_1

    .line 425
    .line 426
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;

    .line 427
    .line 428
    .line 429
    move-result-object v53

    .line 430
    goto/16 :goto_3

    .line 431
    .line 432
    :sswitch_b
    move-object/from16 v14, v89

    .line 433
    .line 434
    const-string v11, "adapter_only_third_party_impression"

    .line 435
    .line 436
    invoke-virtual {v14, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 437
    .line 438
    .line 439
    move-result v11

    .line 440
    if-eqz v11, :cond_1

    .line 441
    .line 442
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextBoolean()Z

    .line 443
    .line 444
    .line 445
    move-result v86

    .line 446
    goto/16 :goto_3

    .line 447
    .line 448
    :sswitch_c
    move-object/from16 v14, v89

    .line 449
    .line 450
    const-string v11, "post_click_lifecycle_monitoring_duration_ms"

    .line 451
    .line 452
    invoke-virtual {v14, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 453
    .line 454
    .line 455
    move-result v11

    .line 456
    if-eqz v11, :cond_1

    .line 457
    .line 458
    sget-object v11, Lmz1;->Fd:Liz1;

    .line 459
    .line 460
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 461
    .line 462
    .line 463
    sget-object v14, Ltw1;->e:Ltw1;

    .line 464
    .line 465
    iget-object v14, v14, Ltw1;->c:Lkz1;

    .line 466
    .line 467
    invoke-virtual {v14, v11}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 468
    .line 469
    .line 470
    move-result-object v11

    .line 471
    check-cast v11, Ljava/lang/Boolean;

    .line 472
    .line 473
    invoke-virtual {v11}, Ljava/lang/Boolean;->booleanValue()Z

    .line 474
    .line 475
    .line 476
    move-result v11

    .line 477
    if-eqz v11, :cond_2

    .line 478
    .line 479
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextInt()I

    .line 480
    .line 481
    .line 482
    move-result v87

    .line 483
    goto/16 :goto_3

    .line 484
    .line 485
    :cond_2
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->skipValue()V

    .line 486
    .line 487
    .line 488
    :goto_5
    move-object/from16 v98, v6

    .line 489
    .line 490
    move-object/from16 v97, v7

    .line 491
    .line 492
    move-object/from16 v96, v8

    .line 493
    .line 494
    move-object/from16 v95, v9

    .line 495
    .line 496
    move-object/from16 v88, v10

    .line 497
    .line 498
    move-object/from16 v94, v12

    .line 499
    .line 500
    move-object/from16 v89, v13

    .line 501
    .line 502
    :goto_6
    const/4 v12, 0x0

    .line 503
    const/16 v90, 0x0

    .line 504
    .line 505
    goto/16 :goto_21

    .line 506
    .line 507
    :sswitch_d
    move-object/from16 v14, v89

    .line 508
    .line 509
    const-string v11, "ad_source_id"

    .line 510
    .line 511
    invoke-virtual {v14, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 512
    .line 513
    .line 514
    move-result v11

    .line 515
    if-eqz v11, :cond_1

    .line 516
    .line 517
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;

    .line 518
    .line 519
    .line 520
    move-result-object v67

    .line 521
    goto/16 :goto_3

    .line 522
    .line 523
    :sswitch_e
    move-object/from16 v14, v89

    .line 524
    .line 525
    const-string v11, "is_collapsible"

    .line 526
    .line 527
    invoke-virtual {v14, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 528
    .line 529
    .line 530
    move-result v11

    .line 531
    if-eqz v11, :cond_1

    .line 532
    .line 533
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextBoolean()Z

    .line 534
    .line 535
    .line 536
    move-result v78

    .line 537
    goto/16 :goto_3

    .line 538
    .line 539
    :sswitch_f
    move-object/from16 v14, v89

    .line 540
    .line 541
    const-string v11, "allow_pub_owned_ad_view"

    .line 542
    .line 543
    invoke-virtual {v14, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 544
    .line 545
    .line 546
    move-result v11

    .line 547
    if-eqz v11, :cond_1

    .line 548
    .line 549
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextBoolean()Z

    .line 550
    .line 551
    .line 552
    move-result v44

    .line 553
    goto/16 :goto_3

    .line 554
    .line 555
    :sswitch_10
    move-object/from16 v14, v89

    .line 556
    .line 557
    const-string v11, "preload_sort_value"

    .line 558
    .line 559
    invoke-virtual {v14, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 560
    .line 561
    .line 562
    move-result v11

    .line 563
    if-eqz v11, :cond_1

    .line 564
    .line 565
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextDouble()D

    .line 566
    .line 567
    .line 568
    move-result-wide v28

    .line 569
    goto/16 :goto_3

    .line 570
    .line 571
    :sswitch_11
    move-object/from16 v14, v89

    .line 572
    .line 573
    const-string v11, "cache_hit_urls"

    .line 574
    .line 575
    invoke-virtual {v14, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 576
    .line 577
    .line 578
    move-result v11

    .line 579
    if-eqz v11, :cond_1

    .line 580
    .line 581
    invoke-static/range {p1 .. p1}, Lbd2;->K(Landroid/util/JsonReader;)Ljava/util/ArrayList;

    .line 582
    .line 583
    .line 584
    goto :goto_5

    .line 585
    :sswitch_12
    move-object/from16 v14, v89

    .line 586
    .line 587
    const-string v11, "adapter_response_info_key"

    .line 588
    .line 589
    invoke-virtual {v14, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 590
    .line 591
    .line 592
    move-result v11

    .line 593
    if-eqz v11, :cond_1

    .line 594
    .line 595
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;

    .line 596
    .line 597
    .line 598
    move-result-object v77

    .line 599
    goto/16 :goto_3

    .line 600
    .line 601
    :sswitch_13
    move-object/from16 v14, v89

    .line 602
    .line 603
    const-string v11, "rewards"

    .line 604
    .line 605
    invoke-virtual {v14, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 606
    .line 607
    .line 608
    move-result v11

    .line 609
    if-eqz v11, :cond_1

    .line 610
    .line 611
    invoke-static/range {p1 .. p1}, Lbd2;->R(Landroid/util/JsonReader;)Lorg/json/JSONArray;

    .line 612
    .line 613
    .line 614
    move-result-object v11

    .line 615
    invoke-static {v11}, Lta2;->a(Lorg/json/JSONArray;)Lta2;

    .line 616
    .line 617
    .line 618
    move-result-object v34

    .line 619
    goto/16 :goto_3

    .line 620
    .line 621
    :sswitch_14
    move-object/from16 v14, v89

    .line 622
    .line 623
    const-string v11, "transaction_id"

    .line 624
    .line 625
    invoke-virtual {v14, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 626
    .line 627
    .line 628
    move-result v11

    .line 629
    if-eqz v11, :cond_1

    .line 630
    .line 631
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;

    .line 632
    .line 633
    .line 634
    move-result-object v32

    .line 635
    goto/16 :goto_3

    .line 636
    .line 637
    :sswitch_15
    move-object/from16 v14, v89

    .line 638
    .line 639
    const-string v11, "analytics_event_name_to_parameters_map"

    .line 640
    .line 641
    invoke-virtual {v14, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 642
    .line 643
    .line 644
    move-result v11

    .line 645
    if-eqz v11, :cond_6

    .line 646
    .line 647
    sget-object v11, Lmz1;->m0:Liz1;

    .line 648
    .line 649
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 650
    .line 651
    .line 652
    sget-object v14, Ltw1;->e:Ltw1;

    .line 653
    .line 654
    iget-object v14, v14, Ltw1;->c:Lkz1;

    .line 655
    .line 656
    invoke-virtual {v14, v11}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 657
    .line 658
    .line 659
    move-result-object v11

    .line 660
    check-cast v11, Ljava/lang/Boolean;

    .line 661
    .line 662
    invoke-virtual {v11}, Ljava/lang/Boolean;->booleanValue()Z

    .line 663
    .line 664
    .line 665
    move-result v11

    .line 666
    if-eqz v11, :cond_5

    .line 667
    .line 668
    new-instance v11, Ljava/util/HashMap;

    .line 669
    .line 670
    invoke-direct {v11}, Ljava/util/HashMap;-><init>()V

    .line 671
    .line 672
    .line 673
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->beginObject()V

    .line 674
    .line 675
    .line 676
    :goto_7
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->hasNext()Z

    .line 677
    .line 678
    .line 679
    move-result v14

    .line 680
    if-eqz v14, :cond_4

    .line 681
    .line 682
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextName()Ljava/lang/String;

    .line 683
    .line 684
    .line 685
    move-result-object v14

    .line 686
    move-object/from16 v88, v10

    .line 687
    .line 688
    new-instance v10, Ljava/util/HashMap;

    .line 689
    .line 690
    invoke-direct {v10}, Ljava/util/HashMap;-><init>()V

    .line 691
    .line 692
    .line 693
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->beginObject()V

    .line 694
    .line 695
    .line 696
    :goto_8
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->hasNext()Z

    .line 697
    .line 698
    .line 699
    move-result v27

    .line 700
    if-eqz v27, :cond_3

    .line 701
    .line 702
    move-object/from16 v89, v13

    .line 703
    .line 704
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextName()Ljava/lang/String;

    .line 705
    .line 706
    .line 707
    move-result-object v13

    .line 708
    move-object/from16 v94, v12

    .line 709
    .line 710
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;

    .line 711
    .line 712
    .line 713
    move-result-object v12

    .line 714
    invoke-virtual {v10, v13, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 715
    .line 716
    .line 717
    move-object/from16 v13, v89

    .line 718
    .line 719
    move-object/from16 v12, v94

    .line 720
    .line 721
    goto :goto_8

    .line 722
    :cond_3
    move-object/from16 v94, v12

    .line 723
    .line 724
    move-object/from16 v89, v13

    .line 725
    .line 726
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->endObject()V

    .line 727
    .line 728
    .line 729
    invoke-virtual {v11, v14, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 730
    .line 731
    .line 732
    move-object/from16 v10, v88

    .line 733
    .line 734
    goto :goto_7

    .line 735
    :cond_4
    move-object/from16 v88, v10

    .line 736
    .line 737
    move-object/from16 v94, v12

    .line 738
    .line 739
    move-object/from16 v89, v13

    .line 740
    .line 741
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->endObject()V

    .line 742
    .line 743
    .line 744
    move-object/from16 v27, v11

    .line 745
    .line 746
    goto/16 :goto_4

    .line 747
    .line 748
    :cond_5
    move-object/from16 v88, v10

    .line 749
    .line 750
    move-object/from16 v94, v12

    .line 751
    .line 752
    move-object/from16 v89, v13

    .line 753
    .line 754
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->skipValue()V

    .line 755
    .line 756
    .line 757
    :goto_9
    move-object/from16 v98, v6

    .line 758
    .line 759
    move-object/from16 v97, v7

    .line 760
    .line 761
    move-object/from16 v96, v8

    .line 762
    .line 763
    move-object/from16 v95, v9

    .line 764
    .line 765
    goto/16 :goto_6

    .line 766
    .line 767
    :cond_6
    move-object/from16 v88, v10

    .line 768
    .line 769
    move-object/from16 v94, v12

    .line 770
    .line 771
    move-object/from16 v89, v13

    .line 772
    .line 773
    :cond_7
    :goto_a
    move-object/from16 v98, v6

    .line 774
    .line 775
    move-object/from16 v97, v7

    .line 776
    .line 777
    move-object/from16 v96, v8

    .line 778
    .line 779
    move-object/from16 v95, v9

    .line 780
    .line 781
    goto/16 :goto_2

    .line 782
    .line 783
    :sswitch_16
    move-object/from16 v88, v10

    .line 784
    .line 785
    move-object/from16 v94, v12

    .line 786
    .line 787
    move-object/from16 v14, v89

    .line 788
    .line 789
    move-object/from16 v89, v13

    .line 790
    .line 791
    const-string v10, "impression_type"

    .line 792
    .line 793
    invoke-virtual {v14, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 794
    .line 795
    .line 796
    move-result v10

    .line 797
    if-eqz v10, :cond_7

    .line 798
    .line 799
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextInt()I

    .line 800
    .line 801
    .line 802
    move-result v10

    .line 803
    if-eqz v10, :cond_9

    .line 804
    .line 805
    if-eq v10, v11, :cond_9

    .line 806
    .line 807
    const/4 v12, 0x3

    .line 808
    if-eq v10, v12, :cond_9

    .line 809
    .line 810
    const/4 v11, 0x4

    .line 811
    if-ne v10, v11, :cond_8

    .line 812
    .line 813
    goto :goto_b

    .line 814
    :cond_8
    const/16 v31, 0x0

    .line 815
    .line 816
    goto :goto_c

    .line 817
    :cond_9
    :goto_b
    move/from16 v31, v10

    .line 818
    .line 819
    :goto_c
    move-object/from16 v10, v88

    .line 820
    .line 821
    :goto_d
    move-object/from16 v13, v89

    .line 822
    .line 823
    goto/16 :goto_4

    .line 824
    .line 825
    :sswitch_17
    move-object/from16 v88, v10

    .line 826
    .line 827
    move-object/from16 v94, v12

    .line 828
    .line 829
    move-object/from16 v14, v89

    .line 830
    .line 831
    move-object/from16 v89, v13

    .line 832
    .line 833
    const-string v10, "container_sizes"

    .line 834
    .line 835
    invoke-virtual {v14, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 836
    .line 837
    .line 838
    move-result v10

    .line 839
    if-eqz v10, :cond_7

    .line 840
    .line 841
    invoke-static/range {p1 .. p1}, Lb83;->a(Landroid/util/JsonReader;)Ljava/util/ArrayList;

    .line 842
    .line 843
    .line 844
    move-result-object v10

    .line 845
    goto :goto_d

    .line 846
    :sswitch_18
    move-object/from16 v88, v10

    .line 847
    .line 848
    move-object/from16 v94, v12

    .line 849
    .line 850
    move-object/from16 v14, v89

    .line 851
    .line 852
    move-object/from16 v89, v13

    .line 853
    .line 854
    const-string v10, "debug_dialog_string"

    .line 855
    .line 856
    invoke-virtual {v14, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 857
    .line 858
    .line 859
    move-result v10

    .line 860
    if-eqz v10, :cond_7

    .line 861
    .line 862
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;

    .line 863
    .line 864
    .line 865
    move-result-object v42

    .line 866
    goto :goto_c

    .line 867
    :sswitch_19
    move-object/from16 v88, v10

    .line 868
    .line 869
    move-object/from16 v94, v12

    .line 870
    .line 871
    move-object/from16 v14, v89

    .line 872
    .line 873
    move-object/from16 v89, v13

    .line 874
    .line 875
    const-string v10, "presentation_error_timeout_ms"

    .line 876
    .line 877
    invoke-virtual {v14, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 878
    .line 879
    .line 880
    move-result v10

    .line 881
    if-eqz v10, :cond_7

    .line 882
    .line 883
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextInt()I

    .line 884
    .line 885
    .line 886
    move-result v35

    .line 887
    goto :goto_c

    .line 888
    :sswitch_1a
    move-object/from16 v88, v10

    .line 889
    .line 890
    move-object/from16 v94, v12

    .line 891
    .line 892
    move-object/from16 v14, v89

    .line 893
    .line 894
    move-object/from16 v89, v13

    .line 895
    .line 896
    const-string v10, "consent_form_action_identifier"

    .line 897
    .line 898
    invoke-virtual {v14, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 899
    .line 900
    .line 901
    move-result v10

    .line 902
    if-eqz v10, :cond_7

    .line 903
    .line 904
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextInt()I

    .line 905
    .line 906
    .line 907
    move-result v80

    .line 908
    goto :goto_c

    .line 909
    :sswitch_1b
    move-object/from16 v88, v10

    .line 910
    .line 911
    move-object/from16 v94, v12

    .line 912
    .line 913
    move-object/from16 v14, v89

    .line 914
    .line 915
    move-object/from16 v89, v13

    .line 916
    .line 917
    const-string v10, "is_closable_area_disabled"

    .line 918
    .line 919
    invoke-virtual {v14, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 920
    .line 921
    .line 922
    move-result v10

    .line 923
    if-eqz v10, :cond_7

    .line 924
    .line 925
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextBoolean()Z

    .line 926
    .line 927
    .line 928
    move-result v49

    .line 929
    goto :goto_c

    .line 930
    :sswitch_1c
    move-object/from16 v88, v10

    .line 931
    .line 932
    move-object/from16 v94, v12

    .line 933
    .line 934
    move-object/from16 v14, v89

    .line 935
    .line 936
    move-object/from16 v89, v13

    .line 937
    .line 938
    const-string v10, "ad_load_urls"

    .line 939
    .line 940
    invoke-virtual {v14, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 941
    .line 942
    .line 943
    move-result v10

    .line 944
    if-eqz v10, :cond_7

    .line 945
    .line 946
    invoke-static/range {p1 .. p1}, Lbd2;->K(Landroid/util/JsonReader;)Ljava/util/ArrayList;

    .line 947
    .line 948
    .line 949
    move-result-object v4

    .line 950
    goto/16 :goto_c

    .line 951
    .line 952
    :sswitch_1d
    move-object/from16 v88, v10

    .line 953
    .line 954
    move-object/from16 v94, v12

    .line 955
    .line 956
    move-object/from16 v14, v89

    .line 957
    .line 958
    move-object/from16 v89, v13

    .line 959
    .line 960
    const-string v10, "qdata"

    .line 961
    .line 962
    invoke-virtual {v14, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 963
    .line 964
    .line 965
    move-result v10

    .line 966
    if-eqz v10, :cond_7

    .line 967
    .line 968
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;

    .line 969
    .line 970
    .line 971
    move-result-object v39

    .line 972
    goto/16 :goto_c

    .line 973
    .line 974
    :sswitch_1e
    move-object/from16 v88, v10

    .line 975
    .line 976
    move-object/from16 v94, v12

    .line 977
    .line 978
    move-object/from16 v14, v89

    .line 979
    .line 980
    move-object/from16 v89, v13

    .line 981
    .line 982
    const-string v10, "render_test_label"

    .line 983
    .line 984
    invoke-virtual {v14, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 985
    .line 986
    .line 987
    move-result v10

    .line 988
    if-eqz v10, :cond_7

    .line 989
    .line 990
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextBoolean()Z

    .line 991
    .line 992
    .line 993
    move-result v46

    .line 994
    goto/16 :goto_c

    .line 995
    .line 996
    :sswitch_1f
    move-object/from16 v88, v10

    .line 997
    .line 998
    move-object/from16 v94, v12

    .line 999
    .line 1000
    move-object/from16 v14, v89

    .line 1001
    .line 1002
    move-object/from16 v89, v13

    .line 1003
    .line 1004
    const-string v10, "request_id"

    .line 1005
    .line 1006
    invoke-virtual {v14, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1007
    .line 1008
    .line 1009
    move-result v10

    .line 1010
    if-eqz v10, :cond_7

    .line 1011
    .line 1012
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;

    .line 1013
    .line 1014
    .line 1015
    move-result-object v75

    .line 1016
    goto/16 :goto_c

    .line 1017
    .line 1018
    :sswitch_20
    move-object/from16 v88, v10

    .line 1019
    .line 1020
    move-object/from16 v94, v12

    .line 1021
    .line 1022
    move-object/from16 v14, v89

    .line 1023
    .line 1024
    move-object/from16 v89, v13

    .line 1025
    .line 1026
    const-string v10, "data"

    .line 1027
    .line 1028
    invoke-virtual {v14, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1029
    .line 1030
    .line 1031
    move-result v10

    .line 1032
    if-eqz v10, :cond_7

    .line 1033
    .line 1034
    invoke-static/range {p1 .. p1}, Lbd2;->N(Landroid/util/JsonReader;)Lorg/json/JSONObject;

    .line 1035
    .line 1036
    .line 1037
    move-result-object v10

    .line 1038
    move-object/from16 v18, v10

    .line 1039
    .line 1040
    goto/16 :goto_c

    .line 1041
    .line 1042
    :sswitch_21
    move-object/from16 v88, v10

    .line 1043
    .line 1044
    move-object/from16 v94, v12

    .line 1045
    .line 1046
    move-object/from16 v10, v89

    .line 1047
    .line 1048
    move-object/from16 v89, v13

    .line 1049
    .line 1050
    invoke-virtual {v10, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1051
    .line 1052
    .line 1053
    move-result v10

    .line 1054
    if-eqz v10, :cond_7

    .line 1055
    .line 1056
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;

    .line 1057
    .line 1058
    .line 1059
    move-result-object v38

    .line 1060
    goto/16 :goto_c

    .line 1061
    .line 1062
    :sswitch_22
    move-object/from16 v88, v10

    .line 1063
    .line 1064
    move-object/from16 v94, v12

    .line 1065
    .line 1066
    move-object/from16 v10, v89

    .line 1067
    .line 1068
    move-object/from16 v89, v13

    .line 1069
    .line 1070
    const-string v11, "ad"

    .line 1071
    .line 1072
    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1073
    .line 1074
    .line 1075
    move-result v10

    .line 1076
    if-eqz v10, :cond_a

    .line 1077
    .line 1078
    new-instance v10, Le83;

    .line 1079
    .line 1080
    move-object/from16 v13, p1

    .line 1081
    .line 1082
    invoke-direct {v10, v13}, Le83;-><init>(Landroid/util/JsonReader;)V

    .line 1083
    .line 1084
    .line 1085
    move-object/from16 v36, v10

    .line 1086
    .line 1087
    goto/16 :goto_c

    .line 1088
    .line 1089
    :cond_a
    move-object/from16 v13, p1

    .line 1090
    .line 1091
    goto/16 :goto_a

    .line 1092
    .line 1093
    :sswitch_23
    move-object/from16 v88, v10

    .line 1094
    .line 1095
    move-object/from16 v94, v12

    .line 1096
    .line 1097
    move-object/from16 v10, v89

    .line 1098
    .line 1099
    move-object/from16 v89, v13

    .line 1100
    .line 1101
    move-object/from16 v13, p1

    .line 1102
    .line 1103
    const-string v11, "allow_custom_click_gesture"

    .line 1104
    .line 1105
    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1106
    .line 1107
    .line 1108
    move-result v10

    .line 1109
    if-eqz v10, :cond_7

    .line 1110
    .line 1111
    invoke-virtual {v13}, Landroid/util/JsonReader;->nextBoolean()Z

    .line 1112
    .line 1113
    .line 1114
    move-result v45

    .line 1115
    goto/16 :goto_c

    .line 1116
    .line 1117
    :sswitch_24
    move-object/from16 v88, v10

    .line 1118
    .line 1119
    move-object/from16 v94, v12

    .line 1120
    .line 1121
    move-object/from16 v10, v89

    .line 1122
    .line 1123
    move-object/from16 v89, v13

    .line 1124
    .line 1125
    move-object/from16 v13, p1

    .line 1126
    .line 1127
    const-string v11, "is_offline_ad"

    .line 1128
    .line 1129
    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1130
    .line 1131
    .line 1132
    move-result v10

    .line 1133
    if-eqz v10, :cond_7

    .line 1134
    .line 1135
    invoke-virtual {v13}, Landroid/util/JsonReader;->nextBoolean()Z

    .line 1136
    .line 1137
    .line 1138
    move-result v70

    .line 1139
    goto/16 :goto_c

    .line 1140
    .line 1141
    :sswitch_25
    move-object/from16 v88, v10

    .line 1142
    .line 1143
    move-object/from16 v94, v12

    .line 1144
    .line 1145
    move-object/from16 v10, v89

    .line 1146
    .line 1147
    move-object/from16 v89, v13

    .line 1148
    .line 1149
    move-object/from16 v13, p1

    .line 1150
    .line 1151
    const-string v11, "native_required_asset_viewability"

    .line 1152
    .line 1153
    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1154
    .line 1155
    .line 1156
    move-result v10

    .line 1157
    if-eqz v10, :cond_7

    .line 1158
    .line 1159
    invoke-virtual {v13}, Landroid/util/JsonReader;->nextBoolean()Z

    .line 1160
    .line 1161
    .line 1162
    move-result v71

    .line 1163
    goto/16 :goto_c

    .line 1164
    .line 1165
    :sswitch_26
    move-object/from16 v88, v10

    .line 1166
    .line 1167
    move-object/from16 v94, v12

    .line 1168
    .line 1169
    move-object/from16 v10, v89

    .line 1170
    .line 1171
    move-object/from16 v89, v13

    .line 1172
    .line 1173
    move-object/from16 v13, p1

    .line 1174
    .line 1175
    const-string v11, "watermark"

    .line 1176
    .line 1177
    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1178
    .line 1179
    .line 1180
    move-result v10

    .line 1181
    if-eqz v10, :cond_7

    .line 1182
    .line 1183
    invoke-virtual {v13}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;

    .line 1184
    .line 1185
    .line 1186
    move-result-object v57

    .line 1187
    goto/16 :goto_c

    .line 1188
    .line 1189
    :sswitch_27
    move-object/from16 v88, v10

    .line 1190
    .line 1191
    move-object/from16 v94, v12

    .line 1192
    .line 1193
    move-object/from16 v10, v89

    .line 1194
    .line 1195
    move-object/from16 v89, v13

    .line 1196
    .line 1197
    move-object/from16 v13, p1

    .line 1198
    .line 1199
    const-string v11, "force_disable_hardware_acceleration"

    .line 1200
    .line 1201
    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1202
    .line 1203
    .line 1204
    move-result v10

    .line 1205
    if-eqz v10, :cond_7

    .line 1206
    .line 1207
    invoke-virtual {v13}, Landroid/util/JsonReader;->nextBoolean()Z

    .line 1208
    .line 1209
    .line 1210
    move-result v73

    .line 1211
    goto/16 :goto_c

    .line 1212
    .line 1213
    :sswitch_28
    move-object/from16 v88, v10

    .line 1214
    .line 1215
    move-object/from16 v94, v12

    .line 1216
    .line 1217
    move-object/from16 v10, v89

    .line 1218
    .line 1219
    move-object/from16 v89, v13

    .line 1220
    .line 1221
    move-object/from16 v13, p1

    .line 1222
    .line 1223
    const-string v11, "is_close_button_enabled"

    .line 1224
    .line 1225
    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1226
    .line 1227
    .line 1228
    move-result v10

    .line 1229
    if-eqz v10, :cond_7

    .line 1230
    .line 1231
    invoke-virtual {v13}, Landroid/util/JsonReader;->nextBoolean()Z

    .line 1232
    .line 1233
    .line 1234
    goto/16 :goto_9

    .line 1235
    .line 1236
    :sswitch_29
    move-object/from16 v88, v10

    .line 1237
    .line 1238
    move-object/from16 v94, v12

    .line 1239
    .line 1240
    move-object/from16 v10, v89

    .line 1241
    .line 1242
    move-object/from16 v89, v13

    .line 1243
    .line 1244
    move-object/from16 v13, p1

    .line 1245
    .line 1246
    const-string v11, "content_url"

    .line 1247
    .line 1248
    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1249
    .line 1250
    .line 1251
    move-result v10

    .line 1252
    if-eqz v10, :cond_7

    .line 1253
    .line 1254
    invoke-virtual {v13}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;

    .line 1255
    .line 1256
    .line 1257
    move-result-object v72

    .line 1258
    goto/16 :goto_c

    .line 1259
    .line 1260
    :sswitch_2a
    move-object/from16 v88, v10

    .line 1261
    .line 1262
    move-object/from16 v94, v12

    .line 1263
    .line 1264
    move-object/from16 v10, v89

    .line 1265
    .line 1266
    move-object/from16 v89, v13

    .line 1267
    .line 1268
    move-object/from16 v13, p1

    .line 1269
    .line 1270
    const-string v11, "ad_close_time_ms"

    .line 1271
    .line 1272
    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1273
    .line 1274
    .line 1275
    move-result v10

    .line 1276
    if-eqz v10, :cond_7

    .line 1277
    .line 1278
    invoke-virtual {v13}, Landroid/util/JsonReader;->nextInt()I

    .line 1279
    .line 1280
    .line 1281
    move-result v58

    .line 1282
    goto/16 :goto_c

    .line 1283
    .line 1284
    :sswitch_2b
    move-object/from16 v88, v10

    .line 1285
    .line 1286
    move-object/from16 v94, v12

    .line 1287
    .line 1288
    move-object/from16 v10, v89

    .line 1289
    .line 1290
    move-object/from16 v89, v13

    .line 1291
    .line 1292
    move-object/from16 v13, p1

    .line 1293
    .line 1294
    const-string v11, "render_timeout_ms"

    .line 1295
    .line 1296
    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1297
    .line 1298
    .line 1299
    move-result v10

    .line 1300
    if-eqz v10, :cond_7

    .line 1301
    .line 1302
    invoke-virtual {v13}, Landroid/util/JsonReader;->nextInt()I

    .line 1303
    .line 1304
    .line 1305
    move-result v51

    .line 1306
    goto/16 :goto_c

    .line 1307
    .line 1308
    :sswitch_2c
    move-object/from16 v88, v10

    .line 1309
    .line 1310
    move-object/from16 v94, v12

    .line 1311
    .line 1312
    move-object/from16 v10, v89

    .line 1313
    .line 1314
    move-object/from16 v89, v13

    .line 1315
    .line 1316
    move-object/from16 v13, p1

    .line 1317
    .line 1318
    const-string v11, "rtb_native_required_assets"

    .line 1319
    .line 1320
    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1321
    .line 1322
    .line 1323
    move-result v10

    .line 1324
    if-eqz v10, :cond_7

    .line 1325
    .line 1326
    invoke-static {v13}, Lbd2;->N(Landroid/util/JsonReader;)Lorg/json/JSONObject;

    .line 1327
    .line 1328
    .line 1329
    move-result-object v10

    .line 1330
    move-object/from16 v23, v10

    .line 1331
    .line 1332
    goto/16 :goto_c

    .line 1333
    .line 1334
    :sswitch_2d
    move-object/from16 v88, v10

    .line 1335
    .line 1336
    move-object/from16 v94, v12

    .line 1337
    .line 1338
    move-object/from16 v10, v89

    .line 1339
    .line 1340
    move-object/from16 v89, v13

    .line 1341
    .line 1342
    move-object/from16 v13, p1

    .line 1343
    .line 1344
    const-string v11, "imp_urls"

    .line 1345
    .line 1346
    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1347
    .line 1348
    .line 1349
    move-result v10

    .line 1350
    if-eqz v10, :cond_7

    .line 1351
    .line 1352
    invoke-static {v13}, Lbd2;->K(Landroid/util/JsonReader;)Ljava/util/ArrayList;

    .line 1353
    .line 1354
    .line 1355
    move-result-object v3

    .line 1356
    goto/16 :goto_c

    .line 1357
    .line 1358
    :sswitch_2e
    move-object/from16 v88, v10

    .line 1359
    .line 1360
    move-object/from16 v94, v12

    .line 1361
    .line 1362
    move-object/from16 v10, v89

    .line 1363
    .line 1364
    move-object/from16 v89, v13

    .line 1365
    .line 1366
    move-object/from16 v13, p1

    .line 1367
    .line 1368
    const-string v11, "safe_browsing"

    .line 1369
    .line 1370
    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1371
    .line 1372
    .line 1373
    move-result v10

    .line 1374
    if-eqz v10, :cond_7

    .line 1375
    .line 1376
    invoke-static {v13}, Lbd2;->N(Landroid/util/JsonReader;)Lorg/json/JSONObject;

    .line 1377
    .line 1378
    .line 1379
    move-result-object v10

    .line 1380
    const-string v11, "click_string"

    .line 1381
    .line 1382
    invoke-virtual {v10, v11, v15}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1383
    .line 1384
    .line 1385
    move-result-object v96

    .line 1386
    const-string v11, "report_url"

    .line 1387
    .line 1388
    invoke-virtual {v10, v11, v15}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1389
    .line 1390
    .line 1391
    move-result-object v97

    .line 1392
    const-string v11, "rendered_ad_enabled"

    .line 1393
    .line 1394
    const/4 v12, 0x0

    .line 1395
    invoke-virtual {v10, v11, v12}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 1396
    .line 1397
    .line 1398
    move-result v98

    .line 1399
    const-string v11, "non_malicious_reporting_enabled"

    .line 1400
    .line 1401
    invoke-virtual {v10, v11, v12}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 1402
    .line 1403
    .line 1404
    move-result v99

    .line 1405
    const-string v11, "allowed_headers"

    .line 1406
    .line 1407
    invoke-virtual {v10, v11}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 1408
    .line 1409
    .line 1410
    move-result-object v11

    .line 1411
    const/4 v14, 0x0

    .line 1412
    invoke-static {v11, v14}, Lbd2;->F(Lorg/json/JSONArray;Ljava/util/ArrayList;)Ljava/util/List;

    .line 1413
    .line 1414
    .line 1415
    move-result-object v100

    .line 1416
    const-string v11, "webview_permissions"

    .line 1417
    .line 1418
    invoke-virtual {v10, v11}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 1419
    .line 1420
    .line 1421
    move-result-object v11

    .line 1422
    invoke-static {v11, v14}, Lbd2;->F(Lorg/json/JSONArray;Ljava/util/ArrayList;)Ljava/util/List;

    .line 1423
    .line 1424
    .line 1425
    move-result-object v103

    .line 1426
    const-string v11, "protection_enabled"

    .line 1427
    .line 1428
    invoke-virtual {v10, v11, v12}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 1429
    .line 1430
    .line 1431
    move-result v101

    .line 1432
    const-string v11, "malicious_reporting_enabled"

    .line 1433
    .line 1434
    invoke-virtual {v10, v11, v12}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 1435
    .line 1436
    .line 1437
    move-result v102

    .line 1438
    new-instance v95, Lrb2;

    .line 1439
    .line 1440
    invoke-direct/range {v95 .. v103}, Lrb2;-><init>(Ljava/lang/String;Ljava/lang/String;ZZLjava/util/List;ZZLjava/util/List;)V

    .line 1441
    .line 1442
    .line 1443
    move-object/from16 v90, v14

    .line 1444
    .line 1445
    move-object/from16 v10, v88

    .line 1446
    .line 1447
    move-object/from16 v13, v89

    .line 1448
    .line 1449
    move-object/from16 v41, v95

    .line 1450
    .line 1451
    :goto_e
    const/4 v12, 0x0

    .line 1452
    goto/16 :goto_23

    .line 1453
    .line 1454
    :sswitch_2f
    move-object/from16 v88, v10

    .line 1455
    .line 1456
    move-object/from16 v94, v12

    .line 1457
    .line 1458
    move-object/from16 v10, v89

    .line 1459
    .line 1460
    const/4 v14, 0x0

    .line 1461
    move-object/from16 v89, v13

    .line 1462
    .line 1463
    move-object/from16 v13, p1

    .line 1464
    .line 1465
    const-string v11, "late_load_urls"

    .line 1466
    .line 1467
    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1468
    .line 1469
    .line 1470
    move-result v10

    .line 1471
    if-eqz v10, :cond_b

    .line 1472
    .line 1473
    invoke-static {v13}, Lbd2;->K(Landroid/util/JsonReader;)Ljava/util/ArrayList;

    .line 1474
    .line 1475
    .line 1476
    move-result-object v10

    .line 1477
    move-object/from16 v24, v10

    .line 1478
    .line 1479
    move-object/from16 v90, v14

    .line 1480
    .line 1481
    move-object/from16 v10, v88

    .line 1482
    .line 1483
    move-object/from16 v13, v89

    .line 1484
    .line 1485
    goto :goto_e

    .line 1486
    :cond_b
    move-object/from16 v98, v6

    .line 1487
    .line 1488
    move-object/from16 v97, v7

    .line 1489
    .line 1490
    move-object/from16 v96, v8

    .line 1491
    .line 1492
    move-object/from16 v95, v9

    .line 1493
    .line 1494
    move-object/from16 v90, v14

    .line 1495
    .line 1496
    :cond_c
    :goto_f
    const/4 v12, 0x0

    .line 1497
    goto/16 :goto_22

    .line 1498
    .line 1499
    :sswitch_30
    move-object/from16 v88, v10

    .line 1500
    .line 1501
    move-object/from16 v94, v12

    .line 1502
    .line 1503
    move-object/from16 v10, v89

    .line 1504
    .line 1505
    const/16 v90, 0x0

    .line 1506
    .line 1507
    move-object/from16 v89, v13

    .line 1508
    .line 1509
    move-object/from16 v13, p1

    .line 1510
    .line 1511
    const-string v11, "on_device_storage_configs"

    .line 1512
    .line 1513
    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1514
    .line 1515
    .line 1516
    move-result v10

    .line 1517
    if-eqz v10, :cond_19

    .line 1518
    .line 1519
    sget-object v10, Lmz1;->l8:Liz1;

    .line 1520
    .line 1521
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1522
    .line 1523
    .line 1524
    sget-object v11, Ltw1;->e:Ltw1;

    .line 1525
    .line 1526
    iget-object v11, v11, Ltw1;->c:Lkz1;

    .line 1527
    .line 1528
    invoke-virtual {v11, v10}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 1529
    .line 1530
    .line 1531
    move-result-object v10

    .line 1532
    check-cast v10, Ljava/lang/Boolean;

    .line 1533
    .line 1534
    invoke-virtual {v10}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1535
    .line 1536
    .line 1537
    move-result v10

    .line 1538
    if-eqz v10, :cond_18

    .line 1539
    .line 1540
    sget-object v10, Lxm3;->g:Lvm3;

    .line 1541
    .line 1542
    const-string v10, "initialCapacity"

    .line 1543
    .line 1544
    const/4 v11, 0x4

    .line 1545
    invoke-static {v10, v11}, Lob1;->z(Ljava/lang/String;I)V

    .line 1546
    .line 1547
    .line 1548
    new-array v12, v11, [Ljava/lang/Object;

    .line 1549
    .line 1550
    invoke-virtual {v13}, Landroid/util/JsonReader;->beginArray()V

    .line 1551
    .line 1552
    .line 1553
    const/4 v11, 0x0

    .line 1554
    :goto_10
    invoke-virtual {v13}, Landroid/util/JsonReader;->hasNext()Z

    .line 1555
    .line 1556
    .line 1557
    move-result v26

    .line 1558
    if-eqz v26, :cond_17

    .line 1559
    .line 1560
    sget-object v26, Lsn3;->j:Lsn3;

    .line 1561
    .line 1562
    invoke-virtual {v13}, Landroid/util/JsonReader;->beginObject()V

    .line 1563
    .line 1564
    .line 1565
    move-object/from16 v91, v26

    .line 1566
    .line 1567
    move-object/from16 v26, v90

    .line 1568
    .line 1569
    :goto_11
    invoke-virtual {v13}, Landroid/util/JsonReader;->hasNext()Z

    .line 1570
    .line 1571
    .line 1572
    move-result v92

    .line 1573
    if-eqz v92, :cond_11

    .line 1574
    .line 1575
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextName()Ljava/lang/String;

    .line 1576
    .line 1577
    .line 1578
    move-result-object v13

    .line 1579
    invoke-static {v13, v14}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1580
    .line 1581
    .line 1582
    move-result v92

    .line 1583
    if-eqz v92, :cond_d

    .line 1584
    .line 1585
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextLong()J

    .line 1586
    .line 1587
    .line 1588
    move-result-wide v92

    .line 1589
    invoke-static/range {v92 .. v93}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1590
    .line 1591
    .line 1592
    move-result-object v26

    .line 1593
    move-object/from16 v13, p1

    .line 1594
    .line 1595
    goto :goto_11

    .line 1596
    :cond_d
    move-object/from16 v93, v14

    .line 1597
    .line 1598
    const-string v14, "event_types"

    .line 1599
    .line 1600
    invoke-static {v13, v14}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1601
    .line 1602
    .line 1603
    move-result v13

    .line 1604
    if-eqz v13, :cond_10

    .line 1605
    .line 1606
    const/4 v13, 0x4

    .line 1607
    invoke-static {v10, v13}, Lob1;->z(Ljava/lang/String;I)V

    .line 1608
    .line 1609
    .line 1610
    new-array v14, v13, [Ljava/lang/Object;

    .line 1611
    .line 1612
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->beginArray()V

    .line 1613
    .line 1614
    .line 1615
    const/4 v13, 0x0

    .line 1616
    :goto_12
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->hasNext()Z

    .line 1617
    .line 1618
    .line 1619
    move-result v91

    .line 1620
    if-eqz v91, :cond_f

    .line 1621
    .line 1622
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextInt()I

    .line 1623
    .line 1624
    .line 1625
    move-result v91

    .line 1626
    invoke-static/range {v91 .. v91}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1627
    .line 1628
    .line 1629
    move-result-object v91

    .line 1630
    move-object/from16 v92, v10

    .line 1631
    .line 1632
    array-length v10, v14

    .line 1633
    move-object/from16 v95, v9

    .line 1634
    .line 1635
    add-int/lit8 v9, v13, 0x1

    .line 1636
    .line 1637
    move-object/from16 v96, v8

    .line 1638
    .line 1639
    invoke-static {v10, v9}, Lrm3;->d(II)I

    .line 1640
    .line 1641
    .line 1642
    move-result v8

    .line 1643
    if-gt v8, v10, :cond_e

    .line 1644
    .line 1645
    goto :goto_13

    .line 1646
    :cond_e
    invoke-static {v14, v8}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1647
    .line 1648
    .line 1649
    move-result-object v8

    .line 1650
    move-object v14, v8

    .line 1651
    :goto_13
    aput-object v91, v14, v13

    .line 1652
    .line 1653
    move v13, v9

    .line 1654
    move-object/from16 v10, v92

    .line 1655
    .line 1656
    move-object/from16 v9, v95

    .line 1657
    .line 1658
    move-object/from16 v8, v96

    .line 1659
    .line 1660
    goto :goto_12

    .line 1661
    :cond_f
    move-object/from16 v96, v8

    .line 1662
    .line 1663
    move-object/from16 v95, v9

    .line 1664
    .line 1665
    move-object/from16 v92, v10

    .line 1666
    .line 1667
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->endArray()V

    .line 1668
    .line 1669
    .line 1670
    invoke-static {v14, v13}, Lxm3;->o([Ljava/lang/Object;I)Lsn3;

    .line 1671
    .line 1672
    .line 1673
    move-result-object v91

    .line 1674
    :goto_14
    move-object/from16 v13, p1

    .line 1675
    .line 1676
    move-object/from16 v14, v93

    .line 1677
    .line 1678
    goto :goto_11

    .line 1679
    :cond_10
    move-object/from16 v96, v8

    .line 1680
    .line 1681
    move-object/from16 v95, v9

    .line 1682
    .line 1683
    move-object/from16 v92, v10

    .line 1684
    .line 1685
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->skipValue()V

    .line 1686
    .line 1687
    .line 1688
    goto :goto_14

    .line 1689
    :cond_11
    move-object/from16 v96, v8

    .line 1690
    .line 1691
    move-object/from16 v95, v9

    .line 1692
    .line 1693
    move-object/from16 v92, v10

    .line 1694
    .line 1695
    move-object/from16 v93, v14

    .line 1696
    .line 1697
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->endObject()V

    .line 1698
    .line 1699
    .line 1700
    if-eqz v26, :cond_12

    .line 1701
    .line 1702
    invoke-virtual/range {v91 .. v91}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 1703
    .line 1704
    .line 1705
    move-result v8

    .line 1706
    if-eqz v8, :cond_13

    .line 1707
    .line 1708
    :cond_12
    move-object/from16 v98, v6

    .line 1709
    .line 1710
    move-object/from16 v97, v7

    .line 1711
    .line 1712
    move-object/from16 v14, v90

    .line 1713
    .line 1714
    goto :goto_16

    .line 1715
    :cond_13
    new-instance v14, Lyv2;

    .line 1716
    .line 1717
    invoke-virtual/range {v26 .. v26}, Ljava/lang/Long;->longValue()J

    .line 1718
    .line 1719
    .line 1720
    move-result-wide v8

    .line 1721
    move-object/from16 v10, v91

    .line 1722
    .line 1723
    iget v13, v10, Lsn3;->i:I

    .line 1724
    .line 1725
    move-object/from16 v97, v7

    .line 1726
    .line 1727
    new-array v7, v13, [I

    .line 1728
    .line 1729
    move-object/from16 v98, v6

    .line 1730
    .line 1731
    const/4 v6, 0x0

    .line 1732
    :goto_15
    if-ge v6, v13, :cond_14

    .line 1733
    .line 1734
    invoke-virtual {v10, v6}, Lsn3;->get(I)Ljava/lang/Object;

    .line 1735
    .line 1736
    .line 1737
    move-result-object v26

    .line 1738
    check-cast v26, Ljava/lang/Integer;

    .line 1739
    .line 1740
    invoke-virtual/range {v26 .. v26}, Ljava/lang/Integer;->intValue()I

    .line 1741
    .line 1742
    .line 1743
    move-result v26

    .line 1744
    aput v26, v7, v6

    .line 1745
    .line 1746
    add-int/lit8 v6, v6, 0x1

    .line 1747
    .line 1748
    goto :goto_15

    .line 1749
    :cond_14
    invoke-direct {v14, v8, v9, v7}, Lyv2;-><init>(J[I)V

    .line 1750
    .line 1751
    .line 1752
    :goto_16
    if-eqz v14, :cond_16

    .line 1753
    .line 1754
    array-length v6, v12

    .line 1755
    add-int/lit8 v7, v11, 0x1

    .line 1756
    .line 1757
    invoke-static {v6, v7}, Lrm3;->d(II)I

    .line 1758
    .line 1759
    .line 1760
    move-result v8

    .line 1761
    if-gt v8, v6, :cond_15

    .line 1762
    .line 1763
    goto :goto_17

    .line 1764
    :cond_15
    invoke-static {v12, v8}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1765
    .line 1766
    .line 1767
    move-result-object v6

    .line 1768
    move-object v12, v6

    .line 1769
    :goto_17
    aput-object v14, v12, v11

    .line 1770
    .line 1771
    move-object/from16 v13, p1

    .line 1772
    .line 1773
    move v11, v7

    .line 1774
    :goto_18
    move-object/from16 v10, v92

    .line 1775
    .line 1776
    move-object/from16 v14, v93

    .line 1777
    .line 1778
    move-object/from16 v9, v95

    .line 1779
    .line 1780
    move-object/from16 v8, v96

    .line 1781
    .line 1782
    move-object/from16 v7, v97

    .line 1783
    .line 1784
    move-object/from16 v6, v98

    .line 1785
    .line 1786
    goto/16 :goto_10

    .line 1787
    .line 1788
    :cond_16
    move-object/from16 v13, p1

    .line 1789
    .line 1790
    goto :goto_18

    .line 1791
    :cond_17
    move-object/from16 v98, v6

    .line 1792
    .line 1793
    move-object/from16 v97, v7

    .line 1794
    .line 1795
    move-object/from16 v96, v8

    .line 1796
    .line 1797
    move-object/from16 v95, v9

    .line 1798
    .line 1799
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->endArray()V

    .line 1800
    .line 1801
    .line 1802
    invoke-static {v12, v11}, Lxm3;->o([Ljava/lang/Object;I)Lsn3;

    .line 1803
    .line 1804
    .line 1805
    move-result-object v6

    .line 1806
    move-object/from16 v26, v6

    .line 1807
    .line 1808
    move-object/from16 v10, v88

    .line 1809
    .line 1810
    move-object/from16 v13, v89

    .line 1811
    .line 1812
    :goto_19
    move-object/from16 v6, v98

    .line 1813
    .line 1814
    goto/16 :goto_e

    .line 1815
    .line 1816
    :cond_18
    move-object/from16 v98, v6

    .line 1817
    .line 1818
    move-object/from16 v97, v7

    .line 1819
    .line 1820
    move-object/from16 v96, v8

    .line 1821
    .line 1822
    move-object/from16 v95, v9

    .line 1823
    .line 1824
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->skipValue()V

    .line 1825
    .line 1826
    .line 1827
    :goto_1a
    const/4 v12, 0x0

    .line 1828
    goto/16 :goto_21

    .line 1829
    .line 1830
    :cond_19
    move-object/from16 v98, v6

    .line 1831
    .line 1832
    move-object/from16 v97, v7

    .line 1833
    .line 1834
    move-object/from16 v96, v8

    .line 1835
    .line 1836
    move-object/from16 v95, v9

    .line 1837
    .line 1838
    goto/16 :goto_f

    .line 1839
    .line 1840
    :sswitch_31
    move-object/from16 v98, v6

    .line 1841
    .line 1842
    move-object/from16 v97, v7

    .line 1843
    .line 1844
    move-object/from16 v96, v8

    .line 1845
    .line 1846
    move-object/from16 v95, v9

    .line 1847
    .line 1848
    move-object/from16 v88, v10

    .line 1849
    .line 1850
    move-object/from16 v94, v12

    .line 1851
    .line 1852
    move-object/from16 v10, v89

    .line 1853
    .line 1854
    const/16 v90, 0x0

    .line 1855
    .line 1856
    move-object/from16 v89, v13

    .line 1857
    .line 1858
    const-string v6, "click_urls"

    .line 1859
    .line 1860
    invoke-virtual {v10, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1861
    .line 1862
    .line 1863
    move-result v6

    .line 1864
    if-eqz v6, :cond_c

    .line 1865
    .line 1866
    invoke-static/range {p1 .. p1}, Lbd2;->K(Landroid/util/JsonReader;)Ljava/util/ArrayList;

    .line 1867
    .line 1868
    .line 1869
    move-result-object v2

    .line 1870
    :goto_1b
    move-object/from16 v10, v88

    .line 1871
    .line 1872
    move-object/from16 v13, v89

    .line 1873
    .line 1874
    move-object/from16 v9, v95

    .line 1875
    .line 1876
    :goto_1c
    move-object/from16 v8, v96

    .line 1877
    .line 1878
    :goto_1d
    move-object/from16 v7, v97

    .line 1879
    .line 1880
    goto :goto_19

    .line 1881
    :sswitch_32
    move-object/from16 v98, v6

    .line 1882
    .line 1883
    move-object/from16 v97, v7

    .line 1884
    .line 1885
    move-object/from16 v96, v8

    .line 1886
    .line 1887
    move-object/from16 v95, v9

    .line 1888
    .line 1889
    move-object/from16 v88, v10

    .line 1890
    .line 1891
    move-object/from16 v94, v12

    .line 1892
    .line 1893
    move-object/from16 v10, v89

    .line 1894
    .line 1895
    const/16 v90, 0x0

    .line 1896
    .line 1897
    move-object/from16 v89, v13

    .line 1898
    .line 1899
    const-string v6, "ad_source_instance_id"

    .line 1900
    .line 1901
    invoke-virtual {v10, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1902
    .line 1903
    .line 1904
    move-result v6

    .line 1905
    if-eqz v6, :cond_c

    .line 1906
    .line 1907
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;

    .line 1908
    .line 1909
    .line 1910
    move-result-object v69

    .line 1911
    goto :goto_1b

    .line 1912
    :sswitch_33
    move-object/from16 v98, v6

    .line 1913
    .line 1914
    move-object/from16 v97, v7

    .line 1915
    .line 1916
    move-object/from16 v96, v8

    .line 1917
    .line 1918
    move-object/from16 v95, v9

    .line 1919
    .line 1920
    move-object/from16 v88, v10

    .line 1921
    .line 1922
    move-object/from16 v94, v12

    .line 1923
    .line 1924
    move-object/from16 v10, v89

    .line 1925
    .line 1926
    const/16 v90, 0x0

    .line 1927
    .line 1928
    move-object/from16 v89, v13

    .line 1929
    .line 1930
    const-string v6, "valid_from_timestamp"

    .line 1931
    .line 1932
    invoke-virtual {v10, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1933
    .line 1934
    .line 1935
    move-result v6

    .line 1936
    if-eqz v6, :cond_c

    .line 1937
    .line 1938
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;

    .line 1939
    .line 1940
    .line 1941
    move-result-object v33

    .line 1942
    goto :goto_1b

    .line 1943
    :sswitch_34
    move-object/from16 v98, v6

    .line 1944
    .line 1945
    move-object/from16 v97, v7

    .line 1946
    .line 1947
    move-object/from16 v96, v8

    .line 1948
    .line 1949
    move-object/from16 v95, v9

    .line 1950
    .line 1951
    move-object/from16 v88, v10

    .line 1952
    .line 1953
    move-object/from16 v94, v12

    .line 1954
    .line 1955
    move-object/from16 v10, v89

    .line 1956
    .line 1957
    const/16 v90, 0x0

    .line 1958
    .line 1959
    move-object/from16 v89, v13

    .line 1960
    .line 1961
    const-string v6, "active_view"

    .line 1962
    .line 1963
    invoke-virtual {v10, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1964
    .line 1965
    .line 1966
    move-result v6

    .line 1967
    if-eqz v6, :cond_c

    .line 1968
    .line 1969
    invoke-static/range {p1 .. p1}, Lbd2;->N(Landroid/util/JsonReader;)Lorg/json/JSONObject;

    .line 1970
    .line 1971
    .line 1972
    move-result-object v6

    .line 1973
    invoke-virtual {v6}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 1974
    .line 1975
    .line 1976
    move-result-object v40

    .line 1977
    goto :goto_1b

    .line 1978
    :sswitch_35
    move-object/from16 v98, v6

    .line 1979
    .line 1980
    move-object/from16 v97, v7

    .line 1981
    .line 1982
    move-object/from16 v96, v8

    .line 1983
    .line 1984
    move-object/from16 v95, v9

    .line 1985
    .line 1986
    move-object/from16 v88, v10

    .line 1987
    .line 1988
    move-object/from16 v94, v12

    .line 1989
    .line 1990
    move-object/from16 v10, v89

    .line 1991
    .line 1992
    const/16 v90, 0x0

    .line 1993
    .line 1994
    move-object/from16 v89, v13

    .line 1995
    .line 1996
    const-string v6, "video_complete_urls"

    .line 1997
    .line 1998
    invoke-virtual {v10, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1999
    .line 2000
    .line 2001
    move-result v6

    .line 2002
    if-eqz v6, :cond_c

    .line 2003
    .line 2004
    invoke-static/range {p1 .. p1}, Lbd2;->K(Landroid/util/JsonReader;)Ljava/util/ArrayList;

    .line 2005
    .line 2006
    .line 2007
    move-result-object v6

    .line 2008
    move-object v7, v6

    .line 2009
    move-object/from16 v10, v88

    .line 2010
    .line 2011
    move-object/from16 v13, v89

    .line 2012
    .line 2013
    move-object/from16 v9, v95

    .line 2014
    .line 2015
    move-object/from16 v8, v96

    .line 2016
    .line 2017
    goto/16 :goto_19

    .line 2018
    .line 2019
    :sswitch_36
    move-object/from16 v98, v6

    .line 2020
    .line 2021
    move-object/from16 v97, v7

    .line 2022
    .line 2023
    move-object/from16 v96, v8

    .line 2024
    .line 2025
    move-object/from16 v95, v9

    .line 2026
    .line 2027
    move-object/from16 v88, v10

    .line 2028
    .line 2029
    move-object/from16 v94, v12

    .line 2030
    .line 2031
    move-object/from16 v10, v89

    .line 2032
    .line 2033
    const/16 v90, 0x0

    .line 2034
    .line 2035
    move-object/from16 v89, v13

    .line 2036
    .line 2037
    const-string v6, "allocation_id"

    .line 2038
    .line 2039
    invoke-virtual {v10, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2040
    .line 2041
    .line 2042
    move-result v6

    .line 2043
    if-eqz v6, :cond_c

    .line 2044
    .line 2045
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;

    .line 2046
    .line 2047
    .line 2048
    move-result-object v37

    .line 2049
    goto/16 :goto_1b

    .line 2050
    .line 2051
    :sswitch_37
    move-object/from16 v98, v6

    .line 2052
    .line 2053
    move-object/from16 v97, v7

    .line 2054
    .line 2055
    move-object/from16 v96, v8

    .line 2056
    .line 2057
    move-object/from16 v95, v9

    .line 2058
    .line 2059
    move-object/from16 v88, v10

    .line 2060
    .line 2061
    move-object/from16 v94, v12

    .line 2062
    .line 2063
    move-object/from16 v10, v89

    .line 2064
    .line 2065
    const/16 v90, 0x0

    .line 2066
    .line 2067
    move-object/from16 v89, v13

    .line 2068
    .line 2069
    const-string v6, "fill_urls"

    .line 2070
    .line 2071
    invoke-virtual {v10, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2072
    .line 2073
    .line 2074
    move-result v6

    .line 2075
    if-eqz v6, :cond_c

    .line 2076
    .line 2077
    invoke-static/range {p1 .. p1}, Lbd2;->K(Landroid/util/JsonReader;)Ljava/util/ArrayList;

    .line 2078
    .line 2079
    .line 2080
    move-result-object v6

    .line 2081
    move-object v8, v6

    .line 2082
    move-object/from16 v10, v88

    .line 2083
    .line 2084
    move-object/from16 v13, v89

    .line 2085
    .line 2086
    move-object/from16 v9, v95

    .line 2087
    .line 2088
    goto/16 :goto_1d

    .line 2089
    .line 2090
    :sswitch_38
    move-object/from16 v98, v6

    .line 2091
    .line 2092
    move-object/from16 v97, v7

    .line 2093
    .line 2094
    move-object/from16 v96, v8

    .line 2095
    .line 2096
    move-object/from16 v95, v9

    .line 2097
    .line 2098
    move-object/from16 v88, v10

    .line 2099
    .line 2100
    move-object/from16 v94, v12

    .line 2101
    .line 2102
    move-object/from16 v10, v89

    .line 2103
    .line 2104
    const/16 v90, 0x0

    .line 2105
    .line 2106
    move-object/from16 v89, v13

    .line 2107
    .line 2108
    const-string v6, "is_scroll_aware"

    .line 2109
    .line 2110
    invoke-virtual {v10, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2111
    .line 2112
    .line 2113
    move-result v6

    .line 2114
    if-eqz v6, :cond_c

    .line 2115
    .line 2116
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextBoolean()Z

    .line 2117
    .line 2118
    .line 2119
    move-result v55

    .line 2120
    goto/16 :goto_1b

    .line 2121
    .line 2122
    :sswitch_39
    move-object/from16 v98, v6

    .line 2123
    .line 2124
    move-object/from16 v97, v7

    .line 2125
    .line 2126
    move-object/from16 v96, v8

    .line 2127
    .line 2128
    move-object/from16 v95, v9

    .line 2129
    .line 2130
    move-object/from16 v88, v10

    .line 2131
    .line 2132
    move-object/from16 v94, v12

    .line 2133
    .line 2134
    move-object/from16 v10, v89

    .line 2135
    .line 2136
    const/4 v12, 0x3

    .line 2137
    const/16 v90, 0x0

    .line 2138
    .line 2139
    move-object/from16 v89, v13

    .line 2140
    .line 2141
    const-string v6, "ad_type"

    .line 2142
    .line 2143
    invoke-virtual {v10, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2144
    .line 2145
    .line 2146
    move-result v6

    .line 2147
    if-eqz v6, :cond_c

    .line 2148
    .line 2149
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;

    .line 2150
    .line 2151
    .line 2152
    move-result-object v6

    .line 2153
    const-string v7, "banner"

    .line 2154
    .line 2155
    invoke-virtual {v7, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2156
    .line 2157
    .line 2158
    move-result v7

    .line 2159
    if-eqz v7, :cond_1a

    .line 2160
    .line 2161
    move/from16 v30, v11

    .line 2162
    .line 2163
    goto/16 :goto_1b

    .line 2164
    .line 2165
    :cond_1a
    const-string v7, "interstitial"

    .line 2166
    .line 2167
    invoke-virtual {v7, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2168
    .line 2169
    .line 2170
    move-result v7

    .line 2171
    if-eqz v7, :cond_1b

    .line 2172
    .line 2173
    const/4 v6, 0x2

    .line 2174
    :goto_1e
    move/from16 v30, v6

    .line 2175
    .line 2176
    goto/16 :goto_1b

    .line 2177
    .line 2178
    :cond_1b
    const-string v7, "native_express"

    .line 2179
    .line 2180
    invoke-virtual {v7, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2181
    .line 2182
    .line 2183
    move-result v7

    .line 2184
    if-eqz v7, :cond_1c

    .line 2185
    .line 2186
    move/from16 v30, v12

    .line 2187
    .line 2188
    goto/16 :goto_1b

    .line 2189
    .line 2190
    :cond_1c
    const-string v7, "native"

    .line 2191
    .line 2192
    invoke-virtual {v7, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2193
    .line 2194
    .line 2195
    move-result v7

    .line 2196
    if-eqz v7, :cond_1d

    .line 2197
    .line 2198
    const/16 v30, 0x4

    .line 2199
    .line 2200
    goto/16 :goto_1b

    .line 2201
    .line 2202
    :cond_1d
    const-string v7, "rewarded"

    .line 2203
    .line 2204
    invoke-virtual {v7, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2205
    .line 2206
    .line 2207
    move-result v7

    .line 2208
    if-eqz v7, :cond_1e

    .line 2209
    .line 2210
    const/4 v6, 0x5

    .line 2211
    goto :goto_1e

    .line 2212
    :cond_1e
    const-string v7, "app_open_ad"

    .line 2213
    .line 2214
    invoke-virtual {v7, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2215
    .line 2216
    .line 2217
    move-result v7

    .line 2218
    if-eqz v7, :cond_1f

    .line 2219
    .line 2220
    move/from16 v30, v92

    .line 2221
    .line 2222
    goto/16 :goto_1b

    .line 2223
    .line 2224
    :cond_1f
    const-string v7, "rewarded_interstitial"

    .line 2225
    .line 2226
    invoke-virtual {v7, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2227
    .line 2228
    .line 2229
    move-result v6

    .line 2230
    if-eqz v6, :cond_20

    .line 2231
    .line 2232
    move/from16 v30, v91

    .line 2233
    .line 2234
    goto/16 :goto_1b

    .line 2235
    .line 2236
    :cond_20
    const/16 v30, 0x0

    .line 2237
    .line 2238
    goto/16 :goto_1b

    .line 2239
    .line 2240
    :sswitch_3a
    move-object/from16 v98, v6

    .line 2241
    .line 2242
    move-object/from16 v97, v7

    .line 2243
    .line 2244
    move-object/from16 v96, v8

    .line 2245
    .line 2246
    move-object/from16 v95, v9

    .line 2247
    .line 2248
    move-object/from16 v88, v10

    .line 2249
    .line 2250
    move-object/from16 v94, v12

    .line 2251
    .line 2252
    move-object/from16 v10, v89

    .line 2253
    .line 2254
    const/16 v90, 0x0

    .line 2255
    .line 2256
    move-object/from16 v89, v13

    .line 2257
    .line 2258
    const-string v6, "presentation_error_urls"

    .line 2259
    .line 2260
    invoke-virtual {v10, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2261
    .line 2262
    .line 2263
    move-result v6

    .line 2264
    if-eqz v6, :cond_c

    .line 2265
    .line 2266
    invoke-static/range {p1 .. p1}, Lbd2;->K(Landroid/util/JsonReader;)Ljava/util/ArrayList;

    .line 2267
    .line 2268
    .line 2269
    move-result-object v6

    .line 2270
    move-object/from16 v94, v6

    .line 2271
    .line 2272
    goto/16 :goto_1b

    .line 2273
    .line 2274
    :sswitch_3b
    move-object/from16 v98, v6

    .line 2275
    .line 2276
    move-object/from16 v97, v7

    .line 2277
    .line 2278
    move-object/from16 v96, v8

    .line 2279
    .line 2280
    move-object/from16 v95, v9

    .line 2281
    .line 2282
    move-object/from16 v88, v10

    .line 2283
    .line 2284
    move-object/from16 v94, v12

    .line 2285
    .line 2286
    move-object/from16 v10, v89

    .line 2287
    .line 2288
    const/16 v90, 0x0

    .line 2289
    .line 2290
    move-object/from16 v89, v13

    .line 2291
    .line 2292
    const-string v6, "allow_pub_rendered_attribution"

    .line 2293
    .line 2294
    invoke-virtual {v10, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2295
    .line 2296
    .line 2297
    move-result v6

    .line 2298
    if-eqz v6, :cond_c

    .line 2299
    .line 2300
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextBoolean()Z

    .line 2301
    .line 2302
    .line 2303
    move-result v43

    .line 2304
    goto/16 :goto_1b

    .line 2305
    .line 2306
    :sswitch_3c
    move-object/from16 v98, v6

    .line 2307
    .line 2308
    move-object/from16 v97, v7

    .line 2309
    .line 2310
    move-object/from16 v96, v8

    .line 2311
    .line 2312
    move-object/from16 v95, v9

    .line 2313
    .line 2314
    move-object/from16 v88, v10

    .line 2315
    .line 2316
    move-object/from16 v94, v12

    .line 2317
    .line 2318
    move-object/from16 v10, v89

    .line 2319
    .line 2320
    const/16 v90, 0x0

    .line 2321
    .line 2322
    move-object/from16 v89, v13

    .line 2323
    .line 2324
    const-string v6, "ad_event_value"

    .line 2325
    .line 2326
    invoke-virtual {v10, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2327
    .line 2328
    .line 2329
    move-result v6

    .line 2330
    if-eqz v6, :cond_c

    .line 2331
    .line 2332
    invoke-static/range {p1 .. p1}, Lbd2;->N(Landroid/util/JsonReader;)Lorg/json/JSONObject;

    .line 2333
    .line 2334
    .line 2335
    move-result-object v6

    .line 2336
    const-string v7, "type_num"

    .line 2337
    .line 2338
    invoke-virtual {v6, v7}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    .line 2339
    .line 2340
    .line 2341
    move-result v9

    .line 2342
    const-string v7, "precision_num"

    .line 2343
    .line 2344
    invoke-virtual {v6, v7}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    .line 2345
    .line 2346
    .line 2347
    move-result v10

    .line 2348
    const-string v7, "currency"

    .line 2349
    .line 2350
    invoke-virtual {v6, v7}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 2351
    .line 2352
    .line 2353
    move-result-object v13

    .line 2354
    const-string v7, "value"

    .line 2355
    .line 2356
    invoke-virtual {v6, v7}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    .line 2357
    .line 2358
    .line 2359
    move-result-wide v11

    .line 2360
    new-instance v8, Ldg4;

    .line 2361
    .line 2362
    invoke-direct/range {v8 .. v13}, Ldg4;-><init>(IIJLjava/lang/String;)V

    .line 2363
    .line 2364
    .line 2365
    move-object/from16 v62, v8

    .line 2366
    .line 2367
    goto/16 :goto_1b

    .line 2368
    .line 2369
    :sswitch_3d
    move-object/from16 v98, v6

    .line 2370
    .line 2371
    move-object/from16 v97, v7

    .line 2372
    .line 2373
    move-object/from16 v96, v8

    .line 2374
    .line 2375
    move-object/from16 v95, v9

    .line 2376
    .line 2377
    move-object/from16 v88, v10

    .line 2378
    .line 2379
    move-object/from16 v94, v12

    .line 2380
    .line 2381
    move-object/from16 v10, v89

    .line 2382
    .line 2383
    const/16 v90, 0x0

    .line 2384
    .line 2385
    move-object/from16 v89, v13

    .line 2386
    .line 2387
    const-string v6, "extras"

    .line 2388
    .line 2389
    invoke-virtual {v10, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2390
    .line 2391
    .line 2392
    move-result v6

    .line 2393
    if-eqz v6, :cond_c

    .line 2394
    .line 2395
    invoke-static/range {p1 .. p1}, Lbd2;->N(Landroid/util/JsonReader;)Lorg/json/JSONObject;

    .line 2396
    .line 2397
    .line 2398
    move-result-object v6

    .line 2399
    move-object/from16 v20, v6

    .line 2400
    .line 2401
    goto/16 :goto_1b

    .line 2402
    .line 2403
    :sswitch_3e
    move-object/from16 v98, v6

    .line 2404
    .line 2405
    move-object/from16 v97, v7

    .line 2406
    .line 2407
    move-object/from16 v96, v8

    .line 2408
    .line 2409
    move-object/from16 v95, v9

    .line 2410
    .line 2411
    move-object/from16 v88, v10

    .line 2412
    .line 2413
    move-object/from16 v94, v12

    .line 2414
    .line 2415
    move-object/from16 v10, v89

    .line 2416
    .line 2417
    const/16 v90, 0x0

    .line 2418
    .line 2419
    move-object/from16 v89, v13

    .line 2420
    .line 2421
    const-string v6, "test_mode_enabled"

    .line 2422
    .line 2423
    invoke-virtual {v10, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2424
    .line 2425
    .line 2426
    move-result v6

    .line 2427
    if-eqz v6, :cond_c

    .line 2428
    .line 2429
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextBoolean()Z

    .line 2430
    .line 2431
    .line 2432
    move-result v47

    .line 2433
    goto/16 :goto_1b

    .line 2434
    .line 2435
    :sswitch_3f
    move-object/from16 v98, v6

    .line 2436
    .line 2437
    move-object/from16 v97, v7

    .line 2438
    .line 2439
    move-object/from16 v96, v8

    .line 2440
    .line 2441
    move-object/from16 v95, v9

    .line 2442
    .line 2443
    move-object/from16 v88, v10

    .line 2444
    .line 2445
    move-object/from16 v94, v12

    .line 2446
    .line 2447
    move-object/from16 v10, v89

    .line 2448
    .line 2449
    const/16 v90, 0x0

    .line 2450
    .line 2451
    move-object/from16 v89, v13

    .line 2452
    .line 2453
    const-string v6, "adapters"

    .line 2454
    .line 2455
    invoke-virtual {v10, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2456
    .line 2457
    .line 2458
    move-result v6

    .line 2459
    if-eqz v6, :cond_c

    .line 2460
    .line 2461
    invoke-static/range {p1 .. p1}, Lbd2;->K(Landroid/util/JsonReader;)Ljava/util/ArrayList;

    .line 2462
    .line 2463
    .line 2464
    move-result-object v6

    .line 2465
    move-object/from16 v16, v6

    .line 2466
    .line 2467
    goto/16 :goto_1b

    .line 2468
    .line 2469
    :sswitch_40
    move-object/from16 v98, v6

    .line 2470
    .line 2471
    move-object/from16 v97, v7

    .line 2472
    .line 2473
    move-object/from16 v96, v8

    .line 2474
    .line 2475
    move-object/from16 v95, v9

    .line 2476
    .line 2477
    move-object/from16 v88, v10

    .line 2478
    .line 2479
    move-object/from16 v94, v12

    .line 2480
    .line 2481
    move-object/from16 v10, v89

    .line 2482
    .line 2483
    const/16 v90, 0x0

    .line 2484
    .line 2485
    move-object/from16 v89, v13

    .line 2486
    .line 2487
    const-string v6, "ad_sizes"

    .line 2488
    .line 2489
    invoke-virtual {v10, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2490
    .line 2491
    .line 2492
    move-result v6

    .line 2493
    if-eqz v6, :cond_c

    .line 2494
    .line 2495
    invoke-static/range {p1 .. p1}, Lb83;->a(Landroid/util/JsonReader;)Ljava/util/ArrayList;

    .line 2496
    .line 2497
    .line 2498
    move-result-object v6

    .line 2499
    move-object/from16 v17, v6

    .line 2500
    .line 2501
    goto/16 :goto_1b

    .line 2502
    .line 2503
    :sswitch_41
    move-object/from16 v98, v6

    .line 2504
    .line 2505
    move-object/from16 v97, v7

    .line 2506
    .line 2507
    move-object/from16 v96, v8

    .line 2508
    .line 2509
    move-object/from16 v95, v9

    .line 2510
    .line 2511
    move-object/from16 v88, v10

    .line 2512
    .line 2513
    move-object/from16 v94, v12

    .line 2514
    .line 2515
    move-object/from16 v10, v89

    .line 2516
    .line 2517
    const/16 v90, 0x0

    .line 2518
    .line 2519
    move-object/from16 v89, v13

    .line 2520
    .line 2521
    const-string v6, "ad_cover"

    .line 2522
    .line 2523
    invoke-virtual {v10, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2524
    .line 2525
    .line 2526
    move-result v6

    .line 2527
    if-eqz v6, :cond_c

    .line 2528
    .line 2529
    invoke-static/range {p1 .. p1}, Lbd2;->N(Landroid/util/JsonReader;)Lorg/json/JSONObject;

    .line 2530
    .line 2531
    .line 2532
    move-result-object v6

    .line 2533
    move-object/from16 v22, v6

    .line 2534
    .line 2535
    goto/16 :goto_1b

    .line 2536
    .line 2537
    :sswitch_42
    move-object/from16 v98, v6

    .line 2538
    .line 2539
    move-object/from16 v97, v7

    .line 2540
    .line 2541
    move-object/from16 v96, v8

    .line 2542
    .line 2543
    move-object/from16 v95, v9

    .line 2544
    .line 2545
    move-object/from16 v88, v10

    .line 2546
    .line 2547
    move-object/from16 v94, v12

    .line 2548
    .line 2549
    move-object/from16 v10, v89

    .line 2550
    .line 2551
    const/16 v90, 0x0

    .line 2552
    .line 2553
    move-object/from16 v89, v13

    .line 2554
    .line 2555
    const-string v6, "showable_impression_type"

    .line 2556
    .line 2557
    invoke-virtual {v10, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2558
    .line 2559
    .line 2560
    move-result v6

    .line 2561
    if-eqz v6, :cond_c

    .line 2562
    .line 2563
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextInt()I

    .line 2564
    .line 2565
    .line 2566
    move-result v56

    .line 2567
    goto/16 :goto_1b

    .line 2568
    .line 2569
    :sswitch_43
    move-object/from16 v98, v6

    .line 2570
    .line 2571
    move-object/from16 v97, v7

    .line 2572
    .line 2573
    move-object/from16 v96, v8

    .line 2574
    .line 2575
    move-object/from16 v95, v9

    .line 2576
    .line 2577
    move-object/from16 v88, v10

    .line 2578
    .line 2579
    move-object/from16 v94, v12

    .line 2580
    .line 2581
    move-object/from16 v10, v89

    .line 2582
    .line 2583
    const/16 v90, 0x0

    .line 2584
    .line 2585
    move-object/from16 v89, v13

    .line 2586
    .line 2587
    const-string v6, "buffer_click_url_as_ready_to_ping"

    .line 2588
    .line 2589
    invoke-virtual {v10, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2590
    .line 2591
    .line 2592
    move-result v6

    .line 2593
    if-eqz v6, :cond_c

    .line 2594
    .line 2595
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextBoolean()Z

    .line 2596
    .line 2597
    .line 2598
    move-result v74

    .line 2599
    goto/16 :goto_1b

    .line 2600
    .line 2601
    :sswitch_44
    move-object/from16 v98, v6

    .line 2602
    .line 2603
    move-object/from16 v97, v7

    .line 2604
    .line 2605
    move-object/from16 v96, v8

    .line 2606
    .line 2607
    move-object/from16 v95, v9

    .line 2608
    .line 2609
    move-object/from16 v88, v10

    .line 2610
    .line 2611
    move-object/from16 v94, v12

    .line 2612
    .line 2613
    move-object/from16 v10, v89

    .line 2614
    .line 2615
    const/16 v90, 0x0

    .line 2616
    .line 2617
    move-object/from16 v89, v13

    .line 2618
    .line 2619
    const-string v6, "enable_omid"

    .line 2620
    .line 2621
    invoke-virtual {v10, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2622
    .line 2623
    .line 2624
    move-result v6

    .line 2625
    if-eqz v6, :cond_c

    .line 2626
    .line 2627
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextBoolean()Z

    .line 2628
    .line 2629
    .line 2630
    move-result v52

    .line 2631
    goto/16 :goto_1b

    .line 2632
    .line 2633
    :sswitch_45
    move-object/from16 v98, v6

    .line 2634
    .line 2635
    move-object/from16 v97, v7

    .line 2636
    .line 2637
    move-object/from16 v96, v8

    .line 2638
    .line 2639
    move-object/from16 v95, v9

    .line 2640
    .line 2641
    move-object/from16 v88, v10

    .line 2642
    .line 2643
    move-object/from16 v94, v12

    .line 2644
    .line 2645
    move-object/from16 v10, v89

    .line 2646
    .line 2647
    const/16 v90, 0x0

    .line 2648
    .line 2649
    move-object/from16 v89, v13

    .line 2650
    .line 2651
    const-string v6, "orientation"

    .line 2652
    .line 2653
    invoke-virtual {v10, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2654
    .line 2655
    .line 2656
    move-result v6

    .line 2657
    if-eqz v6, :cond_c

    .line 2658
    .line 2659
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;

    .line 2660
    .line 2661
    .line 2662
    move-result-object v6

    .line 2663
    const-string v7, "landscape"

    .line 2664
    .line 2665
    invoke-virtual {v7, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 2666
    .line 2667
    .line 2668
    move-result v7

    .line 2669
    if-eqz v7, :cond_21

    .line 2670
    .line 2671
    move/from16 v50, v92

    .line 2672
    .line 2673
    goto/16 :goto_1b

    .line 2674
    .line 2675
    :cond_21
    const-string v7, "portrait"

    .line 2676
    .line 2677
    invoke-virtual {v7, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 2678
    .line 2679
    .line 2680
    move-result v6

    .line 2681
    if-eqz v6, :cond_22

    .line 2682
    .line 2683
    move/from16 v50, v91

    .line 2684
    .line 2685
    goto/16 :goto_1b

    .line 2686
    .line 2687
    :cond_22
    const/16 v50, -0x1

    .line 2688
    .line 2689
    goto/16 :goto_1b

    .line 2690
    .line 2691
    :sswitch_46
    move-object/from16 v98, v6

    .line 2692
    .line 2693
    move-object/from16 v97, v7

    .line 2694
    .line 2695
    move-object/from16 v96, v8

    .line 2696
    .line 2697
    move-object/from16 v95, v9

    .line 2698
    .line 2699
    move-object/from16 v88, v10

    .line 2700
    .line 2701
    move-object/from16 v94, v12

    .line 2702
    .line 2703
    move-object/from16 v10, v89

    .line 2704
    .line 2705
    const/16 v90, 0x0

    .line 2706
    .line 2707
    move-object/from16 v89, v13

    .line 2708
    .line 2709
    const-string v6, "is_custom_close_blocked"

    .line 2710
    .line 2711
    invoke-virtual {v10, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2712
    .line 2713
    .line 2714
    move-result v6

    .line 2715
    if-eqz v6, :cond_c

    .line 2716
    .line 2717
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextBoolean()Z

    .line 2718
    .line 2719
    .line 2720
    move-result v48

    .line 2721
    goto/16 :goto_1b

    .line 2722
    .line 2723
    :sswitch_47
    move-object/from16 v98, v6

    .line 2724
    .line 2725
    move-object/from16 v97, v7

    .line 2726
    .line 2727
    move-object/from16 v96, v8

    .line 2728
    .line 2729
    move-object/from16 v95, v9

    .line 2730
    .line 2731
    move-object/from16 v88, v10

    .line 2732
    .line 2733
    move-object/from16 v94, v12

    .line 2734
    .line 2735
    move-object/from16 v10, v89

    .line 2736
    .line 2737
    const/16 v90, 0x0

    .line 2738
    .line 2739
    move-object/from16 v89, v13

    .line 2740
    .line 2741
    const-string v6, "nofill_urls"

    .line 2742
    .line 2743
    invoke-virtual {v10, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2744
    .line 2745
    .line 2746
    move-result v6

    .line 2747
    if-eqz v6, :cond_c

    .line 2748
    .line 2749
    invoke-static/range {p1 .. p1}, Lbd2;->K(Landroid/util/JsonReader;)Ljava/util/ArrayList;

    .line 2750
    .line 2751
    .line 2752
    move-result-object v6

    .line 2753
    move-object v9, v6

    .line 2754
    move-object/from16 v10, v88

    .line 2755
    .line 2756
    move-object/from16 v13, v89

    .line 2757
    .line 2758
    goto/16 :goto_1c

    .line 2759
    .line 2760
    :sswitch_48
    move-object/from16 v98, v6

    .line 2761
    .line 2762
    move-object/from16 v97, v7

    .line 2763
    .line 2764
    move-object/from16 v96, v8

    .line 2765
    .line 2766
    move-object/from16 v95, v9

    .line 2767
    .line 2768
    move-object/from16 v88, v10

    .line 2769
    .line 2770
    move-object/from16 v94, v12

    .line 2771
    .line 2772
    move-object/from16 v10, v89

    .line 2773
    .line 2774
    const/16 v90, 0x0

    .line 2775
    .line 2776
    move-object/from16 v89, v13

    .line 2777
    .line 2778
    const-string v6, "backend_query_id"

    .line 2779
    .line 2780
    invoke-virtual {v10, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2781
    .line 2782
    .line 2783
    move-result v6

    .line 2784
    if-eqz v6, :cond_c

    .line 2785
    .line 2786
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;

    .line 2787
    .line 2788
    .line 2789
    move-result-object v59

    .line 2790
    goto/16 :goto_1b

    .line 2791
    .line 2792
    :sswitch_49
    move-object/from16 v98, v6

    .line 2793
    .line 2794
    move-object/from16 v97, v7

    .line 2795
    .line 2796
    move-object/from16 v96, v8

    .line 2797
    .line 2798
    move-object/from16 v95, v9

    .line 2799
    .line 2800
    move-object/from16 v88, v10

    .line 2801
    .line 2802
    move-object/from16 v94, v12

    .line 2803
    .line 2804
    move-object/from16 v10, v89

    .line 2805
    .line 2806
    const/16 v90, 0x0

    .line 2807
    .line 2808
    move-object/from16 v89, v13

    .line 2809
    .line 2810
    const-string v6, "is_interscroller"

    .line 2811
    .line 2812
    invoke-virtual {v10, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2813
    .line 2814
    .line 2815
    move-result v6

    .line 2816
    if-eqz v6, :cond_c

    .line 2817
    .line 2818
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextBoolean()Z

    .line 2819
    .line 2820
    .line 2821
    move-result v64

    .line 2822
    goto/16 :goto_1b

    .line 2823
    .line 2824
    :sswitch_4a
    move-object/from16 v98, v6

    .line 2825
    .line 2826
    move-object/from16 v97, v7

    .line 2827
    .line 2828
    move-object/from16 v96, v8

    .line 2829
    .line 2830
    move-object/from16 v95, v9

    .line 2831
    .line 2832
    move-object/from16 v88, v10

    .line 2833
    .line 2834
    move-object/from16 v94, v12

    .line 2835
    .line 2836
    move-object/from16 v10, v89

    .line 2837
    .line 2838
    const/16 v90, 0x0

    .line 2839
    .line 2840
    move-object/from16 v89, v13

    .line 2841
    .line 2842
    const-string v6, "ad_source_name"

    .line 2843
    .line 2844
    invoke-virtual {v10, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2845
    .line 2846
    .line 2847
    move-result v6

    .line 2848
    if-eqz v6, :cond_c

    .line 2849
    .line 2850
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;

    .line 2851
    .line 2852
    .line 2853
    move-result-object v66

    .line 2854
    goto/16 :goto_1b

    .line 2855
    .line 2856
    :sswitch_4b
    move-object/from16 v98, v6

    .line 2857
    .line 2858
    move-object/from16 v97, v7

    .line 2859
    .line 2860
    move-object/from16 v96, v8

    .line 2861
    .line 2862
    move-object/from16 v95, v9

    .line 2863
    .line 2864
    move-object/from16 v88, v10

    .line 2865
    .line 2866
    move-object/from16 v94, v12

    .line 2867
    .line 2868
    move-object/from16 v10, v89

    .line 2869
    .line 2870
    const/16 v90, 0x0

    .line 2871
    .line 2872
    move-object/from16 v89, v13

    .line 2873
    .line 2874
    const-string v6, "parallel_key"

    .line 2875
    .line 2876
    invoke-virtual {v10, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2877
    .line 2878
    .line 2879
    move-result v6

    .line 2880
    if-eqz v6, :cond_c

    .line 2881
    .line 2882
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;

    .line 2883
    .line 2884
    .line 2885
    move-result-object v81

    .line 2886
    goto/16 :goto_1b

    .line 2887
    .line 2888
    :sswitch_4c
    move-object/from16 v98, v6

    .line 2889
    .line 2890
    move-object/from16 v97, v7

    .line 2891
    .line 2892
    move-object/from16 v96, v8

    .line 2893
    .line 2894
    move-object/from16 v95, v9

    .line 2895
    .line 2896
    move-object/from16 v88, v10

    .line 2897
    .line 2898
    move-object/from16 v94, v12

    .line 2899
    .line 2900
    move-object/from16 v10, v89

    .line 2901
    .line 2902
    const/16 v90, 0x0

    .line 2903
    .line 2904
    move-object/from16 v89, v13

    .line 2905
    .line 2906
    const-string v6, "play_prewarm_options"

    .line 2907
    .line 2908
    invoke-virtual {v10, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2909
    .line 2910
    .line 2911
    move-result v6

    .line 2912
    if-eqz v6, :cond_c

    .line 2913
    .line 2914
    invoke-static/range {p1 .. p1}, Lbd2;->N(Landroid/util/JsonReader;)Lorg/json/JSONObject;

    .line 2915
    .line 2916
    .line 2917
    move-result-object v6

    .line 2918
    const-string v7, "enable_prewarming"

    .line 2919
    .line 2920
    const/4 v12, 0x0

    .line 2921
    invoke-virtual {v6, v7, v12}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 2922
    .line 2923
    .line 2924
    move-result v7

    .line 2925
    const-string v8, "prefetch_url"

    .line 2926
    .line 2927
    invoke-virtual {v6, v8, v15}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 2928
    .line 2929
    .line 2930
    move-result-object v8

    .line 2931
    const-string v9, "skip_offline_notification_flow"

    .line 2932
    .line 2933
    invoke-virtual {v6, v9, v12}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 2934
    .line 2935
    .line 2936
    move-result v6

    .line 2937
    new-instance v9, Lg92;

    .line 2938
    .line 2939
    invoke-direct {v9, v8, v7, v6}, Lg92;-><init>(Ljava/lang/String;ZZ)V

    .line 2940
    .line 2941
    .line 2942
    move-object/from16 v61, v9

    .line 2943
    .line 2944
    goto/16 :goto_1b

    .line 2945
    .line 2946
    :sswitch_4d
    move-object/from16 v98, v6

    .line 2947
    .line 2948
    move-object/from16 v97, v7

    .line 2949
    .line 2950
    move-object/from16 v96, v8

    .line 2951
    .line 2952
    move-object/from16 v95, v9

    .line 2953
    .line 2954
    move-object/from16 v88, v10

    .line 2955
    .line 2956
    move-object/from16 v94, v12

    .line 2957
    .line 2958
    move-object/from16 v10, v89

    .line 2959
    .line 2960
    const/16 v90, 0x0

    .line 2961
    .line 2962
    move-object/from16 v89, v13

    .line 2963
    .line 2964
    const-string v6, "network_ping_config"

    .line 2965
    .line 2966
    invoke-virtual {v10, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2967
    .line 2968
    .line 2969
    move-result v6

    .line 2970
    if-eqz v6, :cond_c

    .line 2971
    .line 2972
    sget-object v6, Lmz1;->j9:Liz1;

    .line 2973
    .line 2974
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2975
    .line 2976
    .line 2977
    sget-object v7, Ltw1;->e:Ltw1;

    .line 2978
    .line 2979
    iget-object v7, v7, Ltw1;->c:Lkz1;

    .line 2980
    .line 2981
    invoke-virtual {v7, v6}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 2982
    .line 2983
    .line 2984
    move-result-object v6

    .line 2985
    check-cast v6, Ljava/lang/Boolean;

    .line 2986
    .line 2987
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    .line 2988
    .line 2989
    .line 2990
    move-result v6

    .line 2991
    if-eqz v6, :cond_24

    .line 2992
    .line 2993
    invoke-static/range {p1 .. p1}, Lbd2;->N(Landroid/util/JsonReader;)Lorg/json/JSONObject;

    .line 2994
    .line 2995
    .line 2996
    move-result-object v6

    .line 2997
    const-string v7, "ping_strategy"

    .line 2998
    .line 2999
    invoke-virtual {v6, v7}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 3000
    .line 3001
    .line 3002
    move-result-object v6

    .line 3003
    new-instance v7, Lx34;

    .line 3004
    .line 3005
    if-nez v6, :cond_23

    .line 3006
    .line 3007
    new-instance v99, Lcd4;

    .line 3008
    .line 3009
    const-wide/high16 v102, 0x3ff0000000000000L    # 1.0

    .line 3010
    .line 3011
    const/16 v104, 0x0

    .line 3012
    .line 3013
    const/16 v100, 0x1

    .line 3014
    .line 3015
    const/16 v101, 0x0

    .line 3016
    .line 3017
    invoke-direct/range {v99 .. v104}, Lcd4;-><init>(IIDZ)V

    .line 3018
    .line 3019
    .line 3020
    :goto_1f
    move-object/from16 v6, v99

    .line 3021
    .line 3022
    goto :goto_20

    .line 3023
    :cond_23
    const-string v8, "max_attempts"

    .line 3024
    .line 3025
    invoke-virtual {v6, v8, v11}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 3026
    .line 3027
    .line 3028
    move-result v100

    .line 3029
    const-string v8, "initial_backoff_ms"

    .line 3030
    .line 3031
    const/4 v12, 0x0

    .line 3032
    invoke-virtual {v6, v8, v12}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 3033
    .line 3034
    .line 3035
    move-result v101

    .line 3036
    const-string v8, "backoff_multiplier"

    .line 3037
    .line 3038
    const-wide/high16 v9, 0x3ff0000000000000L    # 1.0

    .line 3039
    .line 3040
    invoke-virtual {v6, v8, v9, v10}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;D)D

    .line 3041
    .line 3042
    .line 3043
    move-result-wide v102

    .line 3044
    const-string v8, "buffer_after_max_attempts"

    .line 3045
    .line 3046
    invoke-virtual {v6, v8, v12}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 3047
    .line 3048
    .line 3049
    move-result v104

    .line 3050
    new-instance v99, Lcd4;

    .line 3051
    .line 3052
    invoke-direct/range {v99 .. v104}, Lcd4;-><init>(IIDZ)V

    .line 3053
    .line 3054
    .line 3055
    goto :goto_1f

    .line 3056
    :goto_20
    invoke-direct {v7, v6}, Lx34;-><init>(Ljava/lang/Object;)V

    .line 3057
    .line 3058
    .line 3059
    move-object/from16 v83, v7

    .line 3060
    .line 3061
    goto/16 :goto_1b

    .line 3062
    .line 3063
    :cond_24
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->skipValue()V

    .line 3064
    .line 3065
    .line 3066
    goto/16 :goto_1a

    .line 3067
    .line 3068
    :sswitch_4e
    move-object/from16 v98, v6

    .line 3069
    .line 3070
    move-object/from16 v97, v7

    .line 3071
    .line 3072
    move-object/from16 v96, v8

    .line 3073
    .line 3074
    move-object/from16 v95, v9

    .line 3075
    .line 3076
    move-object/from16 v88, v10

    .line 3077
    .line 3078
    move-object/from16 v94, v12

    .line 3079
    .line 3080
    move-object/from16 v10, v89

    .line 3081
    .line 3082
    const/16 v90, 0x0

    .line 3083
    .line 3084
    move-object/from16 v89, v13

    .line 3085
    .line 3086
    const-string v6, "presentation_urls"

    .line 3087
    .line 3088
    invoke-virtual {v10, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 3089
    .line 3090
    .line 3091
    move-result v6

    .line 3092
    if-eqz v6, :cond_c

    .line 3093
    .line 3094
    invoke-static/range {p1 .. p1}, Lbd2;->K(Landroid/util/JsonReader;)Ljava/util/ArrayList;

    .line 3095
    .line 3096
    .line 3097
    move-result-object v6

    .line 3098
    move-object/from16 v25, v6

    .line 3099
    .line 3100
    goto/16 :goto_1b

    .line 3101
    .line 3102
    :sswitch_4f
    move-object/from16 v98, v6

    .line 3103
    .line 3104
    move-object/from16 v97, v7

    .line 3105
    .line 3106
    move-object/from16 v96, v8

    .line 3107
    .line 3108
    move-object/from16 v95, v9

    .line 3109
    .line 3110
    move-object/from16 v88, v10

    .line 3111
    .line 3112
    move-object/from16 v94, v12

    .line 3113
    .line 3114
    move-object/from16 v10, v89

    .line 3115
    .line 3116
    const/16 v90, 0x0

    .line 3117
    .line 3118
    move-object/from16 v89, v13

    .line 3119
    .line 3120
    const-string v6, "is_consent"

    .line 3121
    .line 3122
    invoke-virtual {v10, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 3123
    .line 3124
    .line 3125
    move-result v6

    .line 3126
    if-eqz v6, :cond_c

    .line 3127
    .line 3128
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextBoolean()Z

    .line 3129
    .line 3130
    .line 3131
    move-result v79

    .line 3132
    goto/16 :goto_1b

    .line 3133
    .line 3134
    :sswitch_50
    move-object/from16 v98, v6

    .line 3135
    .line 3136
    move-object/from16 v97, v7

    .line 3137
    .line 3138
    move-object/from16 v96, v8

    .line 3139
    .line 3140
    move-object/from16 v95, v9

    .line 3141
    .line 3142
    move-object/from16 v88, v10

    .line 3143
    .line 3144
    move-object/from16 v94, v12

    .line 3145
    .line 3146
    move-object/from16 v10, v89

    .line 3147
    .line 3148
    const/16 v90, 0x0

    .line 3149
    .line 3150
    move-object/from16 v89, v13

    .line 3151
    .line 3152
    const-string v6, "recursive_server_response_data"

    .line 3153
    .line 3154
    invoke-virtual {v10, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 3155
    .line 3156
    .line 3157
    move-result v6

    .line 3158
    if-eqz v6, :cond_c

    .line 3159
    .line 3160
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;

    .line 3161
    .line 3162
    .line 3163
    move-result-object v76

    .line 3164
    goto/16 :goto_1b

    .line 3165
    .line 3166
    :sswitch_51
    move-object/from16 v98, v6

    .line 3167
    .line 3168
    move-object/from16 v97, v7

    .line 3169
    .line 3170
    move-object/from16 v96, v8

    .line 3171
    .line 3172
    move-object/from16 v95, v9

    .line 3173
    .line 3174
    move-object/from16 v88, v10

    .line 3175
    .line 3176
    move-object/from16 v94, v12

    .line 3177
    .line 3178
    move-object/from16 v10, v89

    .line 3179
    .line 3180
    const/16 v90, 0x0

    .line 3181
    .line 3182
    move-object/from16 v89, v13

    .line 3183
    .line 3184
    const-string v6, "offline_ad_config"

    .line 3185
    .line 3186
    invoke-virtual {v10, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 3187
    .line 3188
    .line 3189
    move-result v6

    .line 3190
    if-eqz v6, :cond_c

    .line 3191
    .line 3192
    sget-object v6, Lmz1;->l9:Liz1;

    .line 3193
    .line 3194
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3195
    .line 3196
    .line 3197
    sget-object v7, Ltw1;->e:Ltw1;

    .line 3198
    .line 3199
    iget-object v7, v7, Ltw1;->c:Lkz1;

    .line 3200
    .line 3201
    invoke-virtual {v7, v6}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 3202
    .line 3203
    .line 3204
    move-result-object v6

    .line 3205
    check-cast v6, Ljava/lang/Boolean;

    .line 3206
    .line 3207
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    .line 3208
    .line 3209
    .line 3210
    move-result v6

    .line 3211
    if-eqz v6, :cond_25

    .line 3212
    .line 3213
    invoke-static/range {p1 .. p1}, Lbd2;->N(Landroid/util/JsonReader;)Lorg/json/JSONObject;

    .line 3214
    .line 3215
    .line 3216
    move-result-object v6

    .line 3217
    const-string v7, "impression_prerequisite"

    .line 3218
    .line 3219
    const/4 v12, 0x0

    .line 3220
    invoke-virtual {v6, v7, v12}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 3221
    .line 3222
    .line 3223
    move-result v7

    .line 3224
    const-string v8, "click_prerequisite"

    .line 3225
    .line 3226
    invoke-virtual {v6, v8, v12}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 3227
    .line 3228
    .line 3229
    move-result v8

    .line 3230
    const-string v9, "notification_flow_enabled"

    .line 3231
    .line 3232
    invoke-virtual {v6, v9, v12}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 3233
    .line 3234
    .line 3235
    move-result v6

    .line 3236
    new-instance v9, Lrc4;

    .line 3237
    .line 3238
    invoke-direct {v9, v7, v8, v6}, Lrc4;-><init>(IIZ)V

    .line 3239
    .line 3240
    .line 3241
    move-object/from16 v84, v9

    .line 3242
    .line 3243
    :goto_21
    move-object/from16 v10, v88

    .line 3244
    .line 3245
    move-object/from16 v13, v89

    .line 3246
    .line 3247
    move-object/from16 v9, v95

    .line 3248
    .line 3249
    move-object/from16 v8, v96

    .line 3250
    .line 3251
    move-object/from16 v7, v97

    .line 3252
    .line 3253
    move-object/from16 v6, v98

    .line 3254
    .line 3255
    goto/16 :goto_23

    .line 3256
    .line 3257
    :cond_25
    const/4 v12, 0x0

    .line 3258
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->skipValue()V

    .line 3259
    .line 3260
    .line 3261
    goto :goto_21

    .line 3262
    :sswitch_52
    move-object/from16 v98, v6

    .line 3263
    .line 3264
    move-object/from16 v97, v7

    .line 3265
    .line 3266
    move-object/from16 v96, v8

    .line 3267
    .line 3268
    move-object/from16 v95, v9

    .line 3269
    .line 3270
    move-object/from16 v88, v10

    .line 3271
    .line 3272
    move-object/from16 v94, v12

    .line 3273
    .line 3274
    move-object/from16 v10, v89

    .line 3275
    .line 3276
    const/4 v12, 0x0

    .line 3277
    const/16 v90, 0x0

    .line 3278
    .line 3279
    move-object/from16 v89, v13

    .line 3280
    .line 3281
    const-string v6, "omid_settings"

    .line 3282
    .line 3283
    invoke-virtual {v10, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 3284
    .line 3285
    .line 3286
    move-result v6

    .line 3287
    if-eqz v6, :cond_26

    .line 3288
    .line 3289
    invoke-static/range {p1 .. p1}, Lbd2;->N(Landroid/util/JsonReader;)Lorg/json/JSONObject;

    .line 3290
    .line 3291
    .line 3292
    move-result-object v6

    .line 3293
    move-object/from16 v21, v6

    .line 3294
    .line 3295
    goto :goto_21

    .line 3296
    :sswitch_53
    move-object/from16 v98, v6

    .line 3297
    .line 3298
    move-object/from16 v97, v7

    .line 3299
    .line 3300
    move-object/from16 v96, v8

    .line 3301
    .line 3302
    move-object/from16 v95, v9

    .line 3303
    .line 3304
    move-object/from16 v88, v10

    .line 3305
    .line 3306
    move-object/from16 v94, v12

    .line 3307
    .line 3308
    move-object/from16 v10, v89

    .line 3309
    .line 3310
    const/4 v12, 0x0

    .line 3311
    const/16 v90, 0x0

    .line 3312
    .line 3313
    move-object/from16 v89, v13

    .line 3314
    .line 3315
    const-string v6, "debug_signals"

    .line 3316
    .line 3317
    invoke-virtual {v10, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 3318
    .line 3319
    .line 3320
    move-result v6

    .line 3321
    if-eqz v6, :cond_26

    .line 3322
    .line 3323
    invoke-static/range {p1 .. p1}, Lbd2;->N(Landroid/util/JsonReader;)Lorg/json/JSONObject;

    .line 3324
    .line 3325
    .line 3326
    move-result-object v6

    .line 3327
    move-object/from16 v19, v6

    .line 3328
    .line 3329
    goto :goto_21

    .line 3330
    :sswitch_54
    move-object/from16 v98, v6

    .line 3331
    .line 3332
    move-object/from16 v97, v7

    .line 3333
    .line 3334
    move-object/from16 v96, v8

    .line 3335
    .line 3336
    move-object/from16 v95, v9

    .line 3337
    .line 3338
    move-object/from16 v88, v10

    .line 3339
    .line 3340
    move-object/from16 v94, v12

    .line 3341
    .line 3342
    move-object/from16 v10, v89

    .line 3343
    .line 3344
    const/4 v12, 0x0

    .line 3345
    const/16 v90, 0x0

    .line 3346
    .line 3347
    move-object/from16 v89, v13

    .line 3348
    .line 3349
    const-string v6, "ad_source_instance_name"

    .line 3350
    .line 3351
    invoke-virtual {v10, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 3352
    .line 3353
    .line 3354
    move-result v6

    .line 3355
    if-eqz v6, :cond_26

    .line 3356
    .line 3357
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;

    .line 3358
    .line 3359
    .line 3360
    move-result-object v68

    .line 3361
    goto :goto_21

    .line 3362
    :cond_26
    :goto_22
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->skipValue()V

    .line 3363
    .line 3364
    .line 3365
    goto :goto_21

    .line 3366
    :goto_23
    move-object/from16 v12, v94

    .line 3367
    .line 3368
    goto/16 :goto_0

    .line 3369
    .line 3370
    :cond_27
    move-object/from16 v98, v6

    .line 3371
    .line 3372
    move-object/from16 v97, v7

    .line 3373
    .line 3374
    move-object/from16 v96, v8

    .line 3375
    .line 3376
    move-object/from16 v95, v9

    .line 3377
    .line 3378
    move-object/from16 v88, v10

    .line 3379
    .line 3380
    move-object/from16 v94, v12

    .line 3381
    .line 3382
    move-object/from16 v89, v13

    .line 3383
    .line 3384
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->endObject()V

    .line 3385
    .line 3386
    .line 3387
    iput-object v1, v0, La83;->a:Ljava/util/List;

    .line 3388
    .line 3389
    move/from16 v11, v30

    .line 3390
    .line 3391
    iput v11, v0, La83;->b:I

    .line 3392
    .line 3393
    iput-object v2, v0, La83;->c:Ljava/util/List;

    .line 3394
    .line 3395
    iput-object v3, v0, La83;->d:Ljava/util/List;

    .line 3396
    .line 3397
    iput-object v4, v0, La83;->f:Ljava/util/List;

    .line 3398
    .line 3399
    move/from16 v11, v31

    .line 3400
    .line 3401
    iput v11, v0, La83;->e:I

    .line 3402
    .line 3403
    iput-object v5, v0, La83;->g:Ljava/util/List;

    .line 3404
    .line 3405
    move-object/from16 v1, v98

    .line 3406
    .line 3407
    iput-object v1, v0, La83;->h:Ljava/util/List;

    .line 3408
    .line 3409
    move-object/from16 v1, v97

    .line 3410
    .line 3411
    iput-object v1, v0, La83;->i:Ljava/util/List;

    .line 3412
    .line 3413
    move-object/from16 v15, v32

    .line 3414
    .line 3415
    iput-object v15, v0, La83;->j:Ljava/lang/String;

    .line 3416
    .line 3417
    move-object/from16 v15, v33

    .line 3418
    .line 3419
    iput-object v15, v0, La83;->k:Ljava/lang/String;

    .line 3420
    .line 3421
    move-object/from16 v14, v34

    .line 3422
    .line 3423
    iput-object v14, v0, La83;->l:Lta2;

    .line 3424
    .line 3425
    move-object/from16 v1, v96

    .line 3426
    .line 3427
    iput-object v1, v0, La83;->m:Ljava/util/List;

    .line 3428
    .line 3429
    move-object/from16 v1, v95

    .line 3430
    .line 3431
    iput-object v1, v0, La83;->n:Ljava/util/List;

    .line 3432
    .line 3433
    move-object/from16 v1, v94

    .line 3434
    .line 3435
    iput-object v1, v0, La83;->o:Ljava/util/List;

    .line 3436
    .line 3437
    move-object/from16 v1, v89

    .line 3438
    .line 3439
    iput-object v1, v0, La83;->p:Ljava/util/List;

    .line 3440
    .line 3441
    move/from16 v11, v35

    .line 3442
    .line 3443
    iput v11, v0, La83;->q:I

    .line 3444
    .line 3445
    move-object/from16 v1, v88

    .line 3446
    .line 3447
    iput-object v1, v0, La83;->r:Ljava/util/List;

    .line 3448
    .line 3449
    move-object/from16 v14, v36

    .line 3450
    .line 3451
    iput-object v14, v0, La83;->s:Le83;

    .line 3452
    .line 3453
    move-object/from16 v1, v16

    .line 3454
    .line 3455
    iput-object v1, v0, La83;->t:Ljava/util/List;

    .line 3456
    .line 3457
    move-object/from16 v1, v17

    .line 3458
    .line 3459
    iput-object v1, v0, La83;->u:Ljava/util/List;

    .line 3460
    .line 3461
    move-object/from16 v15, v37

    .line 3462
    .line 3463
    iput-object v15, v0, La83;->w:Ljava/lang/String;

    .line 3464
    .line 3465
    move-object/from16 v2, v18

    .line 3466
    .line 3467
    iput-object v2, v0, La83;->v:Lorg/json/JSONObject;

    .line 3468
    .line 3469
    move-object/from16 v15, v38

    .line 3470
    .line 3471
    iput-object v15, v0, La83;->x:Ljava/lang/String;

    .line 3472
    .line 3473
    move-object/from16 v15, v39

    .line 3474
    .line 3475
    iput-object v15, v0, La83;->y:Ljava/lang/String;

    .line 3476
    .line 3477
    move-object/from16 v15, v40

    .line 3478
    .line 3479
    iput-object v15, v0, La83;->z:Ljava/lang/String;

    .line 3480
    .line 3481
    move-object/from16 v14, v41

    .line 3482
    .line 3483
    iput-object v14, v0, La83;->A:Lrb2;

    .line 3484
    .line 3485
    move-object/from16 v15, v42

    .line 3486
    .line 3487
    iput-object v15, v0, La83;->B:Ljava/lang/String;

    .line 3488
    .line 3489
    move-object/from16 v3, v19

    .line 3490
    .line 3491
    iput-object v3, v0, La83;->C:Lorg/json/JSONObject;

    .line 3492
    .line 3493
    move-object/from16 v4, v20

    .line 3494
    .line 3495
    iput-object v4, v0, La83;->D:Lorg/json/JSONObject;

    .line 3496
    .line 3497
    move/from16 v11, v43

    .line 3498
    .line 3499
    iput-boolean v11, v0, La83;->J:Z

    .line 3500
    .line 3501
    move/from16 v11, v44

    .line 3502
    .line 3503
    iput-boolean v11, v0, La83;->K:Z

    .line 3504
    .line 3505
    move/from16 v11, v45

    .line 3506
    .line 3507
    iput-boolean v11, v0, La83;->L:Z

    .line 3508
    .line 3509
    move/from16 v11, v46

    .line 3510
    .line 3511
    iput-boolean v11, v0, La83;->M:Z

    .line 3512
    .line 3513
    move/from16 v11, v47

    .line 3514
    .line 3515
    iput-boolean v11, v0, La83;->N:Z

    .line 3516
    .line 3517
    move/from16 v11, v48

    .line 3518
    .line 3519
    iput-boolean v11, v0, La83;->O:Z

    .line 3520
    .line 3521
    move/from16 v11, v49

    .line 3522
    .line 3523
    iput-boolean v11, v0, La83;->P:Z

    .line 3524
    .line 3525
    move/from16 v10, v50

    .line 3526
    .line 3527
    iput v10, v0, La83;->Q:I

    .line 3528
    .line 3529
    move/from16 v11, v51

    .line 3530
    .line 3531
    iput v11, v0, La83;->R:I

    .line 3532
    .line 3533
    move/from16 v11, v52

    .line 3534
    .line 3535
    iput-boolean v11, v0, La83;->T:Z

    .line 3536
    .line 3537
    move-object/from16 v15, v53

    .line 3538
    .line 3539
    iput-object v15, v0, La83;->U:Ljava/lang/String;

    .line 3540
    .line 3541
    new-instance v1, Lug0;

    .line 3542
    .line 3543
    const/16 v2, 0x1c

    .line 3544
    .line 3545
    move-object/from16 v5, v21

    .line 3546
    .line 3547
    invoke-direct {v1, v2, v5}, Lug0;-><init>(ILjava/lang/Object;)V

    .line 3548
    .line 3549
    .line 3550
    iput-object v1, v0, La83;->V:Lug0;

    .line 3551
    .line 3552
    move/from16 v11, v54

    .line 3553
    .line 3554
    iput-boolean v11, v0, La83;->W:Z

    .line 3555
    .line 3556
    move/from16 v11, v55

    .line 3557
    .line 3558
    iput-boolean v11, v0, La83;->X:Z

    .line 3559
    .line 3560
    move/from16 v11, v56

    .line 3561
    .line 3562
    iput v11, v0, La83;->Y:I

    .line 3563
    .line 3564
    move-object/from16 v15, v57

    .line 3565
    .line 3566
    iput-object v15, v0, La83;->Z:Ljava/lang/String;

    .line 3567
    .line 3568
    move/from16 v10, v58

    .line 3569
    .line 3570
    iput v10, v0, La83;->a0:I

    .line 3571
    .line 3572
    move-object/from16 v15, v59

    .line 3573
    .line 3574
    iput-object v15, v0, La83;->b0:Ljava/lang/String;

    .line 3575
    .line 3576
    move/from16 v11, v60

    .line 3577
    .line 3578
    iput-boolean v11, v0, La83;->c0:Z

    .line 3579
    .line 3580
    move-object/from16 v14, v61

    .line 3581
    .line 3582
    iput-object v14, v0, La83;->d0:Lg92;

    .line 3583
    .line 3584
    move-object/from16 v14, v62

    .line 3585
    .line 3586
    iput-object v14, v0, La83;->e0:Ldg4;

    .line 3587
    .line 3588
    move-object/from16 v15, v63

    .line 3589
    .line 3590
    iput-object v15, v0, La83;->f0:Ljava/lang/String;

    .line 3591
    .line 3592
    move/from16 v11, v64

    .line 3593
    .line 3594
    iput-boolean v11, v0, La83;->g0:Z

    .line 3595
    .line 3596
    move-object/from16 v6, v22

    .line 3597
    .line 3598
    iput-object v6, v0, La83;->h0:Lorg/json/JSONObject;

    .line 3599
    .line 3600
    move-object/from16 v15, v65

    .line 3601
    .line 3602
    iput-object v15, v0, La83;->E:Ljava/lang/String;

    .line 3603
    .line 3604
    move-object/from16 v15, v66

    .line 3605
    .line 3606
    iput-object v15, v0, La83;->F:Ljava/lang/String;

    .line 3607
    .line 3608
    move-object/from16 v15, v67

    .line 3609
    .line 3610
    iput-object v15, v0, La83;->G:Ljava/lang/String;

    .line 3611
    .line 3612
    move-object/from16 v15, v68

    .line 3613
    .line 3614
    iput-object v15, v0, La83;->H:Ljava/lang/String;

    .line 3615
    .line 3616
    move-object/from16 v15, v69

    .line 3617
    .line 3618
    iput-object v15, v0, La83;->I:Ljava/lang/String;

    .line 3619
    .line 3620
    move/from16 v11, v70

    .line 3621
    .line 3622
    iput-boolean v11, v0, La83;->i0:Z

    .line 3623
    .line 3624
    move-object/from16 v7, v23

    .line 3625
    .line 3626
    iput-object v7, v0, La83;->j0:Lorg/json/JSONObject;

    .line 3627
    .line 3628
    move/from16 v11, v71

    .line 3629
    .line 3630
    iput-boolean v11, v0, La83;->k0:Z

    .line 3631
    .line 3632
    move-object/from16 v14, v72

    .line 3633
    .line 3634
    iput-object v14, v0, La83;->l0:Ljava/lang/String;

    .line 3635
    .line 3636
    move/from16 v11, v73

    .line 3637
    .line 3638
    iput-boolean v11, v0, La83;->m0:Z

    .line 3639
    .line 3640
    move/from16 v11, v74

    .line 3641
    .line 3642
    iput-boolean v11, v0, La83;->S:Z

    .line 3643
    .line 3644
    move-object/from16 v15, v75

    .line 3645
    .line 3646
    iput-object v15, v0, La83;->n0:Ljava/lang/String;

    .line 3647
    .line 3648
    move-object/from16 v15, v76

    .line 3649
    .line 3650
    iput-object v15, v0, La83;->o0:Ljava/lang/String;

    .line 3651
    .line 3652
    move-object/from16 v15, v77

    .line 3653
    .line 3654
    iput-object v15, v0, La83;->p0:Ljava/lang/String;

    .line 3655
    .line 3656
    move/from16 v11, v78

    .line 3657
    .line 3658
    iput-boolean v11, v0, La83;->q0:Z

    .line 3659
    .line 3660
    move/from16 v11, v79

    .line 3661
    .line 3662
    iput-boolean v11, v0, La83;->r0:Z

    .line 3663
    .line 3664
    move/from16 v11, v80

    .line 3665
    .line 3666
    iput v11, v0, La83;->s0:I

    .line 3667
    .line 3668
    move-object/from16 v8, v24

    .line 3669
    .line 3670
    iput-object v8, v0, La83;->u0:Ljava/util/AbstractCollection;

    .line 3671
    .line 3672
    move-object/from16 v15, v81

    .line 3673
    .line 3674
    iput-object v15, v0, La83;->t0:Ljava/lang/String;

    .line 3675
    .line 3676
    move/from16 v11, v82

    .line 3677
    .line 3678
    iput-boolean v11, v0, La83;->v0:Z

    .line 3679
    .line 3680
    move-object/from16 v9, v27

    .line 3681
    .line 3682
    iput-object v9, v0, La83;->w0:Ljava/util/HashMap;

    .line 3683
    .line 3684
    move-object/from16 v14, v83

    .line 3685
    .line 3686
    iput-object v14, v0, La83;->x0:Lx34;

    .line 3687
    .line 3688
    move-object/from16 v14, v84

    .line 3689
    .line 3690
    iput-object v14, v0, La83;->y0:Lrc4;

    .line 3691
    .line 3692
    move-wide/from16 v12, v28

    .line 3693
    .line 3694
    iput-wide v12, v0, La83;->z0:D

    .line 3695
    .line 3696
    move-object/from16 v8, v25

    .line 3697
    .line 3698
    iput-object v8, v0, La83;->A0:Ljava/util/AbstractCollection;

    .line 3699
    .line 3700
    move/from16 v11, v85

    .line 3701
    .line 3702
    iput-boolean v11, v0, La83;->B0:Z

    .line 3703
    .line 3704
    move-object/from16 v8, v26

    .line 3705
    .line 3706
    iput-object v8, v0, La83;->C0:Lsn3;

    .line 3707
    .line 3708
    move/from16 v11, v86

    .line 3709
    .line 3710
    iput-boolean v11, v0, La83;->D0:Z

    .line 3711
    .line 3712
    move/from16 v10, v87

    .line 3713
    .line 3714
    iput v10, v0, La83;->E0:I

    .line 3715
    .line 3716
    return-void

    :sswitch_data_0
    .sparse-switch
        -0x7f724a93 -> :sswitch_54
        -0x760d5f21 -> :sswitch_53
        -0x752755d7 -> :sswitch_52
        -0x751ba07e -> :sswitch_51
        -0x6f8bb127 -> :sswitch_50
        -0x6ddc55fb -> :sswitch_4f
        -0x6db3fd17 -> :sswitch_4e
        -0x6d0041e2 -> :sswitch_4d
        -0x6c01c604 -> :sswitch_4c
        -0x6a655fd9 -> :sswitch_4b
        -0x69ea0ded -> :sswitch_4a
        -0x631f353f -> :sswitch_49
        -0x60966ac3 -> :sswitch_48
        -0x5c657e81 -> :sswitch_47
        -0x55d641b4 -> :sswitch_46
        -0x55cd0a30 -> :sswitch_45
        -0x552c574b -> :sswitch_44
        -0x53d154ad -> :sswitch_43
        -0x53abfab8 -> :sswitch_42
        -0x51fb2365 -> :sswitch_41
        -0x511c568a -> :sswitch_40
        -0x4dd838fc -> :sswitch_3f
        -0x4daf44ce -> :sswitch_3e
        -0x4cd5119d -> :sswitch_3d
        -0x49ea2690 -> :sswitch_3c
        -0x49901bd3 -> :sswitch_3b
        -0x45a06900 -> :sswitch_3a
        -0x44ada62a -> :sswitch_39
        -0x4456b89f -> :sswitch_38
        -0x428259e0 -> :sswitch_37
        -0x407d0b26 -> :sswitch_36
        -0x4041c09a -> :sswitch_35
        -0x3ea917c2 -> :sswitch_34
        -0x3a916a9c -> :sswitch_33
        -0x39f06783 -> :sswitch_32
        -0x2e4deec5 -> :sswitch_31
        -0x26ea2ddc -> :sswitch_30
        -0x21fb0dbc -> :sswitch_2f
        -0x207016c7 -> :sswitch_2e
        -0x1a0cf689 -> :sswitch_2d
        -0x181b2b46 -> :sswitch_2c
        -0x18198873 -> :sswitch_2b
        -0x17b47e0b -> :sswitch_2a
        -0x172cbb57 -> :sswitch_29
        -0x160a4bb0 -> :sswitch_28
        -0xcb8faf4 -> :sswitch_27
        -0xcb8979c -> :sswitch_26
        -0xabddb62 -> :sswitch_25
        -0x93741cc -> :sswitch_24
        -0x1bfab86 -> :sswitch_23
        0xc23 -> :sswitch_22
        0xd1b -> :sswitch_21
        0x2eefaa -> :sswitch_20
        0x23640cb -> :sswitch_1f
        0x3c44b50 -> :sswitch_1e
        0x6674f9b -> :sswitch_1d
        0xdba7381 -> :sswitch_1c
        0x18f0294b -> :sswitch_1b
        0x2052155c -> :sswitch_1a
        0x20bbc660 -> :sswitch_19
        0x239cb9fc -> :sswitch_18
        0x2cfeab54 -> :sswitch_17
        0x2f2793b0 -> :sswitch_16
        0x2ffcc875 -> :sswitch_15
        0x3c3c4a1c -> :sswitch_14
        0x419a9724 -> :sswitch_13
        0x440b789c -> :sswitch_12
        0x46b1262d -> :sswitch_11
        0x4db3b386 -> :sswitch_10
        0x4ec7dc6f -> :sswitch_f
        0x54c7ec75 -> :sswitch_e
        0x55aac6a3 -> :sswitch_d
        0x5ccce785 -> :sswitch_c
        0x5d4fd9dd -> :sswitch_b
        0x619b1543 -> :sswitch_a
        0x61b080e5 -> :sswitch_9
        0x6483313f -> :sswitch_8
        0x64a20a30 -> :sswitch_7
        0x6b3eec6e -> :sswitch_6
        0x6da6d810 -> :sswitch_5
        0x6fc8b8d3 -> :sswitch_4
        0x7b455927 -> :sswitch_3
        0x7b8dc4b3 -> :sswitch_2
        0x7bb5b70a -> :sswitch_1
        0x7e31ff4c -> :sswitch_0
    .end sparse-switch
.end method

.method public static a(I)Ljava/lang/String;
    .locals 0

    .line 1
    packed-switch p0, :pswitch_data_0

    .line 2
    .line 3
    .line 4
    const-string p0, "UNKNOWN"

    .line 5
    .line 6
    return-object p0

    .line 7
    :pswitch_0
    const-string p0, "REWARDED_INTERSTITIAL"

    .line 8
    .line 9
    return-object p0

    .line 10
    :pswitch_1
    const-string p0, "APP_OPEN_AD"

    .line 11
    .line 12
    return-object p0

    .line 13
    :pswitch_2
    const-string p0, "REWARDED"

    .line 14
    .line 15
    return-object p0

    .line 16
    :pswitch_3
    const-string p0, "NATIVE"

    .line 17
    .line 18
    return-object p0

    .line 19
    :pswitch_4
    const-string p0, "NATIVE_EXPRESS"

    .line 20
    .line 21
    return-object p0

    .line 22
    :pswitch_5
    const-string p0, "INTERSTITIAL"

    .line 23
    .line 24
    return-object p0

    .line 25
    :pswitch_6
    const-string p0, "BANNER"

    .line 26
    .line 27
    return-object p0

    .line 28
    nop

    .line 29
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final b()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, La83;->i0:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, La83;->y0:Lrc4;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return v0

    .line 12
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 13
    return v0
.end method
