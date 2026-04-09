.class public final Lvr;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field public static final synthetic g:Lvr;


# instance fields
.field public final synthetic f:I


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lvr;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    invoke-direct {v0, v1}, Lvr;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lvr;->g:Lvr;

    .line 8
    .line 9
    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lvr;->f:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method private final synthetic a()V
    .locals 0

    .line 1
    return-void
.end method

.method private final synthetic b()V
    .locals 0

    .line 1
    return-void
.end method

.method private final synthetic c()V
    .locals 0

    .line 1
    return-void
.end method

.method private final d()V
    .locals 0

    .line 1
    return-void
.end method

.method private final synthetic e()V
    .locals 0

    .line 1
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 24

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget v0, v1, Lvr;->f:I

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    :pswitch_0
    return-void

    .line 9
    :pswitch_1
    sget-object v0, Lzc3;->i:Landroid/os/Handler;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    sget-object v2, Lzc3;->j:Lvr;

    .line 14
    .line 15
    invoke-virtual {v0, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 16
    .line 17
    .line 18
    sget-object v0, Lzc3;->i:Landroid/os/Handler;

    .line 19
    .line 20
    sget-object v2, Lzc3;->k:Lvr;

    .line 21
    .line 22
    const-wide/16 v3, 0xc8

    .line 23
    .line 24
    invoke-virtual {v0, v2, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 25
    .line 26
    .line 27
    :cond_0
    return-void

    .line 28
    :pswitch_2
    sget-object v3, Lzc3;->g:Lzc3;

    .line 29
    .line 30
    iget-object v4, v3, Lzc3;->d:Lx03;

    .line 31
    .line 32
    iget-object v6, v3, Lzc3;->e:Llv2;

    .line 33
    .line 34
    iget-object v0, v3, Lzc3;->b:Ljava/util/ArrayList;

    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 37
    .line 38
    .line 39
    sget-object v0, Lic3;->c:Lic3;

    .line 40
    .line 41
    iget-object v0, v0, Lic3;->b:Ljava/util/ArrayList;

    .line 42
    .line 43
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableCollection(Ljava/util/Collection;)Ljava/util/Collection;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 52
    .line 53
    .line 54
    move-result v5

    .line 55
    if-eqz v5, :cond_1

    .line 56
    .line 57
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v5

    .line 61
    check-cast v5, Lxb3;

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_1
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 65
    .line 66
    .line 67
    move-result-wide v7

    .line 68
    iput-wide v7, v3, Lzc3;->f:J

    .line 69
    .line 70
    iget-object v0, v4, Lx03;->m:Ljava/lang/Object;

    .line 71
    .line 72
    move-object v12, v0

    .line 73
    check-cast v12, Ljava/util/HashMap;

    .line 74
    .line 75
    iget-object v0, v4, Lx03;->k:Ljava/lang/Object;

    .line 76
    .line 77
    move-object v13, v0

    .line 78
    check-cast v13, Ljava/util/HashSet;

    .line 79
    .line 80
    iget-object v0, v4, Lx03;->h:Ljava/lang/Object;

    .line 81
    .line 82
    move-object v14, v0

    .line 83
    check-cast v14, Ljava/util/HashMap;

    .line 84
    .line 85
    iget-object v0, v4, Lx03;->g:Ljava/lang/Object;

    .line 86
    .line 87
    move-object v15, v0

    .line 88
    check-cast v15, Ljava/util/HashMap;

    .line 89
    .line 90
    iget-object v0, v4, Lx03;->j:Ljava/lang/Object;

    .line 91
    .line 92
    move-object v5, v0

    .line 93
    check-cast v5, Ljava/util/HashSet;

    .line 94
    .line 95
    iget-object v0, v4, Lx03;->n:Ljava/lang/Object;

    .line 96
    .line 97
    move-object v7, v0

    .line 98
    check-cast v7, Ljava/util/HashSet;

    .line 99
    .line 100
    iget-object v0, v4, Lx03;->l:Ljava/lang/Object;

    .line 101
    .line 102
    move-object v8, v0

    .line 103
    check-cast v8, Ljava/util/HashSet;

    .line 104
    .line 105
    iget-object v0, v4, Lx03;->i:Ljava/lang/Object;

    .line 106
    .line 107
    move-object v9, v0

    .line 108
    check-cast v9, Ljava/util/HashMap;

    .line 109
    .line 110
    iget-object v0, v4, Lx03;->o:Ljava/lang/Object;

    .line 111
    .line 112
    check-cast v0, Ljava/util/WeakHashMap;

    .line 113
    .line 114
    sget-object v10, Lic3;->c:Lic3;

    .line 115
    .line 116
    if-eqz v10, :cond_13

    .line 117
    .line 118
    iget-object v10, v10, Lic3;->b:Ljava/util/ArrayList;

    .line 119
    .line 120
    invoke-static {v10}, Ljava/util/Collections;->unmodifiableCollection(Ljava/util/Collection;)Ljava/util/Collection;

    .line 121
    .line 122
    .line 123
    move-result-object v10

    .line 124
    invoke-interface {v10}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 125
    .line 126
    .line 127
    move-result-object v10

    .line 128
    :goto_1
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 129
    .line 130
    .line 131
    move-result v16

    .line 132
    if-eqz v16, :cond_13

    .line 133
    .line 134
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v16

    .line 138
    move-object/from16 v2, v16

    .line 139
    .line 140
    check-cast v2, Lxb3;

    .line 141
    .line 142
    iget-object v11, v2, Lxb3;->c:Ldd3;

    .line 143
    .line 144
    invoke-virtual {v11}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v11

    .line 148
    check-cast v11, Landroid/view/View;

    .line 149
    .line 150
    iget-object v1, v2, Lxb3;->g:Ljava/lang/String;

    .line 151
    .line 152
    move-object/from16 v17, v6

    .line 153
    .line 154
    iget-boolean v6, v2, Lxb3;->e:Z

    .line 155
    .line 156
    if-eqz v6, :cond_12

    .line 157
    .line 158
    iget-boolean v6, v2, Lxb3;->f:Z

    .line 159
    .line 160
    if-nez v6, :cond_12

    .line 161
    .line 162
    if-eqz v11, :cond_11

    .line 163
    .line 164
    invoke-virtual {v11}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 165
    .line 166
    .line 167
    move-result-object v6

    .line 168
    move-object/from16 v18, v10

    .line 169
    .line 170
    :goto_2
    instance-of v10, v6, Landroid/content/ContextWrapper;

    .line 171
    .line 172
    if-eqz v10, :cond_3

    .line 173
    .line 174
    instance-of v10, v6, Landroid/app/Activity;

    .line 175
    .line 176
    if-eqz v10, :cond_2

    .line 177
    .line 178
    check-cast v6, Landroid/app/Activity;

    .line 179
    .line 180
    goto :goto_3

    .line 181
    :cond_2
    check-cast v6, Landroid/content/ContextWrapper;

    .line 182
    .line 183
    invoke-virtual {v6}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 184
    .line 185
    .line 186
    move-result-object v6

    .line 187
    goto :goto_2

    .line 188
    :cond_3
    const/4 v6, 0x0

    .line 189
    :goto_3
    if-eqz v6, :cond_4

    .line 190
    .line 191
    invoke-virtual {v6}, Landroid/app/Activity;->isInPictureInPictureMode()Z

    .line 192
    .line 193
    .line 194
    move-result v6

    .line 195
    goto :goto_4

    .line 196
    :cond_4
    const/4 v6, 0x0

    .line 197
    :goto_4
    if-eqz v6, :cond_5

    .line 198
    .line 199
    invoke-virtual {v7, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 200
    .line 201
    .line 202
    :cond_5
    invoke-virtual {v11}, Landroid/view/View;->isAttachedToWindow()Z

    .line 203
    .line 204
    .line 205
    move-result v10

    .line 206
    move/from16 v19, v6

    .line 207
    .line 208
    const-string v6, "noWindowFocus"

    .line 209
    .line 210
    if-nez v10, :cond_6

    .line 211
    .line 212
    const-string v10, "notAttached"

    .line 213
    .line 214
    move-object/from16 v19, v0

    .line 215
    .line 216
    :goto_5
    move-object/from16 v20, v7

    .line 217
    .line 218
    goto :goto_8

    .line 219
    :cond_6
    invoke-virtual {v11}, Landroid/view/View;->hasWindowFocus()Z

    .line 220
    .line 221
    .line 222
    move-result v10

    .line 223
    if-eqz v10, :cond_7

    .line 224
    .line 225
    invoke-virtual {v0, v11}, Ljava/util/WeakHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    sget-object v10, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 229
    .line 230
    goto :goto_6

    .line 231
    :cond_7
    invoke-virtual {v0, v11}, Ljava/util/WeakHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 232
    .line 233
    .line 234
    move-result v10

    .line 235
    if-eqz v10, :cond_8

    .line 236
    .line 237
    invoke-virtual {v0, v11}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    move-result-object v10

    .line 241
    check-cast v10, Ljava/lang/Boolean;

    .line 242
    .line 243
    goto :goto_6

    .line 244
    :cond_8
    sget-object v10, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 245
    .line 246
    invoke-virtual {v0, v11, v10}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    :goto_6
    invoke-virtual {v10}, Ljava/lang/Boolean;->booleanValue()Z

    .line 250
    .line 251
    .line 252
    move-result v10

    .line 253
    if-eqz v10, :cond_9

    .line 254
    .line 255
    if-nez v19, :cond_9

    .line 256
    .line 257
    move-object/from16 v19, v0

    .line 258
    .line 259
    move-object v10, v6

    .line 260
    goto :goto_5

    .line 261
    :cond_9
    new-instance v10, Ljava/util/HashSet;

    .line 262
    .line 263
    invoke-direct {v10}, Ljava/util/HashSet;-><init>()V

    .line 264
    .line 265
    .line 266
    move-object/from16 v19, v0

    .line 267
    .line 268
    move-object v0, v11

    .line 269
    :goto_7
    if-eqz v0, :cond_c

    .line 270
    .line 271
    invoke-static {v0}, Lpu1;->q(Landroid/view/View;)Ljava/lang/String;

    .line 272
    .line 273
    .line 274
    move-result-object v20

    .line 275
    if-eqz v20, :cond_a

    .line 276
    .line 277
    move-object/from16 v10, v20

    .line 278
    .line 279
    goto :goto_5

    .line 280
    :cond_a
    invoke-virtual {v10, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 281
    .line 282
    .line 283
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 284
    .line 285
    .line 286
    move-result-object v0

    .line 287
    move-object/from16 v20, v7

    .line 288
    .line 289
    instance-of v7, v0, Landroid/view/View;

    .line 290
    .line 291
    if-eqz v7, :cond_b

    .line 292
    .line 293
    check-cast v0, Landroid/view/View;

    .line 294
    .line 295
    move-object/from16 v7, v20

    .line 296
    .line 297
    goto :goto_7

    .line 298
    :cond_b
    move-object/from16 v7, v20

    .line 299
    .line 300
    const/4 v0, 0x0

    .line 301
    goto :goto_7

    .line 302
    :cond_c
    move-object/from16 v20, v7

    .line 303
    .line 304
    invoke-virtual {v5, v10}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    .line 305
    .line 306
    .line 307
    const/4 v10, 0x0

    .line 308
    :goto_8
    if-nez v10, :cond_10

    .line 309
    .line 310
    invoke-virtual {v13, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 311
    .line 312
    .line 313
    invoke-virtual {v15, v11, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 314
    .line 315
    .line 316
    iget-object v0, v2, Lxb3;->b:Lmc3;

    .line 317
    .line 318
    iget-object v0, v0, Lmc3;->a:Ljava/util/ArrayList;

    .line 319
    .line 320
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 321
    .line 322
    .line 323
    move-result v2

    .line 324
    const/4 v6, 0x0

    .line 325
    :cond_d
    :goto_9
    if-ge v6, v2, :cond_f

    .line 326
    .line 327
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 328
    .line 329
    .line 330
    move-result-object v7

    .line 331
    add-int/lit8 v6, v6, 0x1

    .line 332
    .line 333
    check-cast v7, Llc3;

    .line 334
    .line 335
    iget-object v10, v7, Llc3;->a:Ldd3;

    .line 336
    .line 337
    invoke-virtual {v10}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 338
    .line 339
    .line 340
    move-result-object v10

    .line 341
    check-cast v10, Landroid/view/View;

    .line 342
    .line 343
    if-eqz v10, :cond_d

    .line 344
    .line 345
    invoke-virtual {v14, v10}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 346
    .line 347
    .line 348
    move-result-object v11

    .line 349
    check-cast v11, Lxc3;

    .line 350
    .line 351
    if-eqz v11, :cond_e

    .line 352
    .line 353
    iget-object v7, v11, Lxc3;->b:Ljava/util/ArrayList;

    .line 354
    .line 355
    invoke-virtual {v7, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 356
    .line 357
    .line 358
    goto :goto_9

    .line 359
    :cond_e
    new-instance v11, Lxc3;

    .line 360
    .line 361
    invoke-direct {v11, v7, v1}, Lxc3;-><init>(Llc3;Ljava/lang/String;)V

    .line 362
    .line 363
    .line 364
    invoke-virtual {v14, v10, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 365
    .line 366
    .line 367
    goto :goto_9

    .line 368
    :cond_f
    :goto_a
    move-object/from16 v1, p0

    .line 369
    .line 370
    move-object/from16 v6, v17

    .line 371
    .line 372
    move-object/from16 v10, v18

    .line 373
    .line 374
    move-object/from16 v0, v19

    .line 375
    .line 376
    move-object/from16 v7, v20

    .line 377
    .line 378
    goto/16 :goto_1

    .line 379
    .line 380
    :cond_10
    if-eq v10, v6, :cond_f

    .line 381
    .line 382
    invoke-virtual {v8, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 383
    .line 384
    .line 385
    invoke-virtual {v9, v1, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 386
    .line 387
    .line 388
    invoke-virtual {v12, v1, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 389
    .line 390
    .line 391
    goto :goto_a

    .line 392
    :cond_11
    move-object/from16 v19, v0

    .line 393
    .line 394
    move-object/from16 v20, v7

    .line 395
    .line 396
    move-object/from16 v18, v10

    .line 397
    .line 398
    invoke-virtual {v8, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 399
    .line 400
    .line 401
    const-string v0, "noAdView"

    .line 402
    .line 403
    invoke-virtual {v12, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 404
    .line 405
    .line 406
    move-object/from16 v1, p0

    .line 407
    .line 408
    move-object/from16 v6, v17

    .line 409
    .line 410
    move-object/from16 v0, v19

    .line 411
    .line 412
    goto/16 :goto_1

    .line 413
    .line 414
    :cond_12
    move-object/from16 v19, v0

    .line 415
    .line 416
    move-object/from16 v20, v7

    .line 417
    .line 418
    move-object/from16 v18, v10

    .line 419
    .line 420
    goto :goto_a

    .line 421
    :cond_13
    move-object/from16 v17, v6

    .line 422
    .line 423
    move-object/from16 v20, v7

    .line 424
    .line 425
    iget-object v1, v3, Lzc3;->c:Lmr2;

    .line 426
    .line 427
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 428
    .line 429
    .line 430
    move-result-wide v6

    .line 431
    iget-object v0, v1, Lmr2;->h:Ljava/lang/Object;

    .line 432
    .line 433
    move-object v2, v0

    .line 434
    check-cast v2, Lvg0;

    .line 435
    .line 436
    invoke-virtual {v8}, Ljava/util/HashSet;->size()I

    .line 437
    .line 438
    .line 439
    move-result v0

    .line 440
    if-lez v0, :cond_16

    .line 441
    .line 442
    invoke-virtual {v8}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 443
    .line 444
    .line 445
    move-result-object v18

    .line 446
    :goto_b
    invoke-interface/range {v18 .. v18}, Ljava/util/Iterator;->hasNext()Z

    .line 447
    .line 448
    .line 449
    move-result v0

    .line 450
    if-eqz v0, :cond_16

    .line 451
    .line 452
    invoke-interface/range {v18 .. v18}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 453
    .line 454
    .line 455
    move-result-object v0

    .line 456
    move-object v10, v0

    .line 457
    check-cast v10, Ljava/lang/String;

    .line 458
    .line 459
    move-object/from16 v16, v8

    .line 460
    .line 461
    const/4 v11, 0x0

    .line 462
    invoke-virtual {v2, v11}, Lvg0;->o(Landroid/view/View;)Lorg/json/JSONObject;

    .line 463
    .line 464
    .line 465
    move-result-object v8

    .line 466
    invoke-virtual {v9, v10}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 467
    .line 468
    .line 469
    move-result-object v0

    .line 470
    check-cast v0, Landroid/view/View;

    .line 471
    .line 472
    iget-object v11, v1, Lmr2;->g:Ljava/lang/Object;

    .line 473
    .line 474
    check-cast v11, Lrc3;

    .line 475
    .line 476
    invoke-virtual {v12, v10}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 477
    .line 478
    .line 479
    move-result-object v21

    .line 480
    move-object/from16 v22, v1

    .line 481
    .line 482
    move-object/from16 v1, v21

    .line 483
    .line 484
    check-cast v1, Ljava/lang/String;

    .line 485
    .line 486
    if-eqz v1, :cond_14

    .line 487
    .line 488
    invoke-virtual {v11, v0}, Lrc3;->f(Landroid/view/View;)Lorg/json/JSONObject;

    .line 489
    .line 490
    .line 491
    move-result-object v11

    .line 492
    :try_start_0
    const-string v0, "adSessionId"

    .line 493
    .line 494
    invoke-virtual {v11, v0, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 495
    .line 496
    .line 497
    move-object/from16 v21, v5

    .line 498
    .line 499
    goto :goto_c

    .line 500
    :catch_0
    move-exception v0

    .line 501
    move-object/from16 v21, v5

    .line 502
    .line 503
    const-string v5, "Error with setting ad session id"

    .line 504
    .line 505
    invoke-static {v5, v0}, Lob1;->w(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 506
    .line 507
    .line 508
    :goto_c
    :try_start_1
    const-string v0, "notVisibleReason"

    .line 509
    .line 510
    invoke-virtual {v11, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    .line 511
    .line 512
    .line 513
    goto :goto_d

    .line 514
    :catch_1
    move-exception v0

    .line 515
    const-string v1, "Error with setting not visible reason"

    .line 516
    .line 517
    invoke-static {v1, v0}, Lob1;->w(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 518
    .line 519
    .line 520
    :goto_d
    invoke-static {v8, v11}, Lvc3;->c(Lorg/json/JSONObject;Lorg/json/JSONObject;)V

    .line 521
    .line 522
    .line 523
    goto :goto_e

    .line 524
    :cond_14
    move-object/from16 v21, v5

    .line 525
    .line 526
    :goto_e
    invoke-static {v8}, Lvc3;->d(Lorg/json/JSONObject;)V

    .line 527
    .line 528
    .line 529
    move-wide v5, v6

    .line 530
    new-instance v7, Ljava/util/HashSet;

    .line 531
    .line 532
    invoke-direct {v7}, Ljava/util/HashSet;-><init>()V

    .line 533
    .line 534
    .line 535
    invoke-virtual {v7, v10}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 536
    .line 537
    .line 538
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 539
    .line 540
    .line 541
    move-object v1, v9

    .line 542
    move-wide v9, v5

    .line 543
    new-instance v5, Lcd3;

    .line 544
    .line 545
    const/4 v11, 0x0

    .line 546
    move-object/from16 v6, v17

    .line 547
    .line 548
    move-object/from16 v17, v1

    .line 549
    .line 550
    const/4 v1, 0x0

    .line 551
    invoke-direct/range {v5 .. v11}, Lcd3;-><init>(Llv2;Ljava/util/HashSet;Lorg/json/JSONObject;JI)V

    .line 552
    .line 553
    .line 554
    iget-object v0, v6, Llv2;->h:Ljava/lang/Object;

    .line 555
    .line 556
    check-cast v0, Lt83;

    .line 557
    .line 558
    iput-object v0, v5, Lad3;->a:Lt83;

    .line 559
    .line 560
    iget-object v7, v0, Lt83;->h:Ljava/lang/Object;

    .line 561
    .line 562
    check-cast v7, Ljava/util/ArrayDeque;

    .line 563
    .line 564
    invoke-virtual {v7, v5}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 565
    .line 566
    .line 567
    iget-object v5, v0, Lt83;->i:Ljava/lang/Object;

    .line 568
    .line 569
    check-cast v5, Lad3;

    .line 570
    .line 571
    if-nez v5, :cond_15

    .line 572
    .line 573
    invoke-virtual {v7}, Ljava/util/ArrayDeque;->poll()Ljava/lang/Object;

    .line 574
    .line 575
    .line 576
    move-result-object v5

    .line 577
    check-cast v5, Lad3;

    .line 578
    .line 579
    iput-object v5, v0, Lt83;->i:Ljava/lang/Object;

    .line 580
    .line 581
    if-eqz v5, :cond_15

    .line 582
    .line 583
    iget-object v0, v0, Lt83;->g:Ljava/lang/Object;

    .line 584
    .line 585
    check-cast v0, Ljava/util/concurrent/ThreadPoolExecutor;

    .line 586
    .line 587
    const/4 v7, 0x0

    .line 588
    new-array v8, v7, [Ljava/lang/Object;

    .line 589
    .line 590
    invoke-virtual {v5, v0, v8}, Landroid/os/AsyncTask;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 591
    .line 592
    .line 593
    :cond_15
    move-object/from16 v1, v17

    .line 594
    .line 595
    move-object/from16 v17, v6

    .line 596
    .line 597
    move-wide v6, v9

    .line 598
    move-object v9, v1

    .line 599
    move-object/from16 v8, v16

    .line 600
    .line 601
    move-object/from16 v5, v21

    .line 602
    .line 603
    move-object/from16 v1, v22

    .line 604
    .line 605
    goto/16 :goto_b

    .line 606
    .line 607
    :cond_16
    move-object/from16 v1, v17

    .line 608
    .line 609
    move-object/from16 v17, v9

    .line 610
    .line 611
    move-wide v9, v6

    .line 612
    move-object v6, v1

    .line 613
    move-object/from16 v21, v5

    .line 614
    .line 615
    move-object/from16 v16, v8

    .line 616
    .line 617
    const/4 v1, 0x0

    .line 618
    invoke-virtual {v13}, Ljava/util/HashSet;->size()I

    .line 619
    .line 620
    .line 621
    move-result v0

    .line 622
    if-lez v0, :cond_1e

    .line 623
    .line 624
    invoke-virtual {v2, v1}, Lvg0;->o(Landroid/view/View;)Lorg/json/JSONObject;

    .line 625
    .line 626
    .line 627
    move-result-object v8

    .line 628
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 629
    .line 630
    .line 631
    new-instance v0, Ljava/util/ArrayList;

    .line 632
    .line 633
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 634
    .line 635
    .line 636
    sget-object v5, Lic3;->c:Lic3;

    .line 637
    .line 638
    if-eqz v5, :cond_1c

    .line 639
    .line 640
    iget-object v5, v5, Lic3;->b:Ljava/util/ArrayList;

    .line 641
    .line 642
    invoke-static {v5}, Ljava/util/Collections;->unmodifiableCollection(Ljava/util/Collection;)Ljava/util/Collection;

    .line 643
    .line 644
    .line 645
    move-result-object v5

    .line 646
    invoke-interface {v5}, Ljava/util/Collection;->size()I

    .line 647
    .line 648
    .line 649
    move-result v7

    .line 650
    add-int/2addr v7, v7

    .line 651
    new-instance v11, Ljava/util/IdentityHashMap;

    .line 652
    .line 653
    add-int/lit8 v7, v7, 0x3

    .line 654
    .line 655
    invoke-direct {v11, v7}, Ljava/util/IdentityHashMap;-><init>(I)V

    .line 656
    .line 657
    .line 658
    invoke-interface {v5}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 659
    .line 660
    .line 661
    move-result-object v5

    .line 662
    :cond_17
    :goto_f
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 663
    .line 664
    .line 665
    move-result v7

    .line 666
    if-eqz v7, :cond_1c

    .line 667
    .line 668
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 669
    .line 670
    .line 671
    move-result-object v7

    .line 672
    check-cast v7, Lxb3;

    .line 673
    .line 674
    iget-object v7, v7, Lxb3;->c:Ldd3;

    .line 675
    .line 676
    invoke-virtual {v7}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 677
    .line 678
    .line 679
    move-result-object v7

    .line 680
    check-cast v7, Landroid/view/View;

    .line 681
    .line 682
    if-eqz v7, :cond_17

    .line 683
    .line 684
    invoke-virtual {v7}, Landroid/view/View;->isAttachedToWindow()Z

    .line 685
    .line 686
    .line 687
    move-result v18

    .line 688
    if-eqz v18, :cond_17

    .line 689
    .line 690
    invoke-virtual {v7}, Landroid/view/View;->isShown()Z

    .line 691
    .line 692
    .line 693
    move-result v18

    .line 694
    if-eqz v18, :cond_17

    .line 695
    .line 696
    move-object/from16 v18, v7

    .line 697
    .line 698
    :goto_10
    if-eqz v18, :cond_19

    .line 699
    .line 700
    invoke-virtual/range {v18 .. v18}, Landroid/view/View;->getAlpha()F

    .line 701
    .line 702
    .line 703
    move-result v19

    .line 704
    const/16 v22, 0x0

    .line 705
    .line 706
    cmpl-float v19, v19, v22

    .line 707
    .line 708
    if-eqz v19, :cond_17

    .line 709
    .line 710
    move-object/from16 v19, v1

    .line 711
    .line 712
    invoke-virtual/range {v18 .. v18}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 713
    .line 714
    .line 715
    move-result-object v1

    .line 716
    move-object/from16 v18, v5

    .line 717
    .line 718
    instance-of v5, v1, Landroid/view/View;

    .line 719
    .line 720
    if-eqz v5, :cond_18

    .line 721
    .line 722
    check-cast v1, Landroid/view/View;

    .line 723
    .line 724
    move-object/from16 v5, v18

    .line 725
    .line 726
    move-object/from16 v18, v1

    .line 727
    .line 728
    move-object/from16 v1, v19

    .line 729
    .line 730
    goto :goto_10

    .line 731
    :cond_18
    move-object/from16 v5, v18

    .line 732
    .line 733
    move-object/from16 v1, v19

    .line 734
    .line 735
    move-object/from16 v18, v1

    .line 736
    .line 737
    goto :goto_10

    .line 738
    :cond_19
    move-object/from16 v19, v1

    .line 739
    .line 740
    move-object/from16 v18, v5

    .line 741
    .line 742
    invoke-virtual {v7}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 743
    .line 744
    .line 745
    move-result-object v1

    .line 746
    if-eqz v1, :cond_1b

    .line 747
    .line 748
    invoke-virtual {v11, v1}, Ljava/util/IdentityHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 749
    .line 750
    .line 751
    move-result v5

    .line 752
    if-nez v5, :cond_1b

    .line 753
    .line 754
    invoke-virtual {v11, v1, v1}, Ljava/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 755
    .line 756
    .line 757
    invoke-virtual {v1}, Landroid/view/View;->getZ()F

    .line 758
    .line 759
    .line 760
    move-result v5

    .line 761
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 762
    .line 763
    .line 764
    move-result v7

    .line 765
    :goto_11
    if-lez v7, :cond_1a

    .line 766
    .line 767
    move/from16 v22, v5

    .line 768
    .line 769
    add-int/lit8 v5, v7, -0x1

    .line 770
    .line 771
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 772
    .line 773
    .line 774
    move-result-object v23

    .line 775
    check-cast v23, Landroid/view/View;

    .line 776
    .line 777
    invoke-virtual/range {v23 .. v23}, Landroid/view/View;->getZ()F

    .line 778
    .line 779
    .line 780
    move-result v23

    .line 781
    cmpl-float v23, v23, v22

    .line 782
    .line 783
    if-lez v23, :cond_1a

    .line 784
    .line 785
    move v7, v5

    .line 786
    move/from16 v5, v22

    .line 787
    .line 788
    goto :goto_11

    .line 789
    :cond_1a
    invoke-virtual {v0, v7, v1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 790
    .line 791
    .line 792
    :cond_1b
    move-object/from16 v5, v18

    .line 793
    .line 794
    move-object/from16 v1, v19

    .line 795
    .line 796
    goto/16 :goto_f

    .line 797
    .line 798
    :cond_1c
    move-object/from16 v19, v1

    .line 799
    .line 800
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 801
    .line 802
    .line 803
    move-result v1

    .line 804
    const/4 v5, 0x0

    .line 805
    :goto_12
    if-ge v5, v1, :cond_1d

    .line 806
    .line 807
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 808
    .line 809
    .line 810
    move-result-object v7

    .line 811
    check-cast v7, Landroid/view/View;

    .line 812
    .line 813
    iget-object v11, v2, Lvg0;->g:Ljava/lang/Object;

    .line 814
    .line 815
    check-cast v11, Lrc3;

    .line 816
    .line 817
    move/from16 v18, v1

    .line 818
    .line 819
    const/4 v1, 0x0

    .line 820
    invoke-virtual {v3, v7, v11, v8, v1}, Lzc3;->a(Landroid/view/View;Lrc3;Lorg/json/JSONObject;Z)V

    .line 821
    .line 822
    .line 823
    add-int/lit8 v5, v5, 0x1

    .line 824
    .line 825
    move/from16 v1, v18

    .line 826
    .line 827
    goto :goto_12

    .line 828
    :cond_1d
    invoke-static {v8}, Lvc3;->d(Lorg/json/JSONObject;)V

    .line 829
    .line 830
    .line 831
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 832
    .line 833
    .line 834
    new-instance v5, Lcd3;

    .line 835
    .line 836
    const/4 v11, 0x1

    .line 837
    move-object v7, v13

    .line 838
    invoke-direct/range {v5 .. v11}, Lcd3;-><init>(Llv2;Ljava/util/HashSet;Lorg/json/JSONObject;JI)V

    .line 839
    .line 840
    .line 841
    iget-object v0, v6, Llv2;->h:Ljava/lang/Object;

    .line 842
    .line 843
    check-cast v0, Lt83;

    .line 844
    .line 845
    iput-object v0, v5, Lad3;->a:Lt83;

    .line 846
    .line 847
    iget-object v1, v0, Lt83;->h:Ljava/lang/Object;

    .line 848
    .line 849
    check-cast v1, Ljava/util/ArrayDeque;

    .line 850
    .line 851
    invoke-virtual {v1, v5}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 852
    .line 853
    .line 854
    iget-object v2, v0, Lt83;->i:Ljava/lang/Object;

    .line 855
    .line 856
    check-cast v2, Lad3;

    .line 857
    .line 858
    if-nez v2, :cond_1f

    .line 859
    .line 860
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->poll()Ljava/lang/Object;

    .line 861
    .line 862
    .line 863
    move-result-object v1

    .line 864
    check-cast v1, Lad3;

    .line 865
    .line 866
    iput-object v1, v0, Lt83;->i:Ljava/lang/Object;

    .line 867
    .line 868
    if-eqz v1, :cond_1f

    .line 869
    .line 870
    iget-object v0, v0, Lt83;->g:Ljava/lang/Object;

    .line 871
    .line 872
    check-cast v0, Ljava/util/concurrent/ThreadPoolExecutor;

    .line 873
    .line 874
    const/4 v2, 0x0

    .line 875
    new-array v5, v2, [Ljava/lang/Object;

    .line 876
    .line 877
    invoke-virtual {v1, v0, v5}, Landroid/os/AsyncTask;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 878
    .line 879
    .line 880
    goto :goto_13

    .line 881
    :cond_1e
    move-object/from16 v19, v1

    .line 882
    .line 883
    move-object v7, v13

    .line 884
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 885
    .line 886
    .line 887
    new-instance v0, Lbd3;

    .line 888
    .line 889
    invoke-direct {v0, v6}, Lad3;-><init>(Llv2;)V

    .line 890
    .line 891
    .line 892
    iget-object v1, v6, Llv2;->h:Ljava/lang/Object;

    .line 893
    .line 894
    check-cast v1, Lt83;

    .line 895
    .line 896
    iput-object v1, v0, Lad3;->a:Lt83;

    .line 897
    .line 898
    iget-object v2, v1, Lt83;->h:Ljava/lang/Object;

    .line 899
    .line 900
    check-cast v2, Ljava/util/ArrayDeque;

    .line 901
    .line 902
    invoke-virtual {v2, v0}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 903
    .line 904
    .line 905
    iget-object v0, v1, Lt83;->i:Ljava/lang/Object;

    .line 906
    .line 907
    check-cast v0, Lad3;

    .line 908
    .line 909
    if-nez v0, :cond_1f

    .line 910
    .line 911
    invoke-virtual {v2}, Ljava/util/ArrayDeque;->poll()Ljava/lang/Object;

    .line 912
    .line 913
    .line 914
    move-result-object v0

    .line 915
    check-cast v0, Lad3;

    .line 916
    .line 917
    iput-object v0, v1, Lt83;->i:Ljava/lang/Object;

    .line 918
    .line 919
    if-eqz v0, :cond_1f

    .line 920
    .line 921
    iget-object v1, v1, Lt83;->g:Ljava/lang/Object;

    .line 922
    .line 923
    check-cast v1, Ljava/util/concurrent/ThreadPoolExecutor;

    .line 924
    .line 925
    const/4 v2, 0x0

    .line 926
    new-array v5, v2, [Ljava/lang/Object;

    .line 927
    .line 928
    invoke-virtual {v0, v1, v5}, Landroid/os/AsyncTask;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 929
    .line 930
    .line 931
    :cond_1f
    :goto_13
    invoke-virtual {v15}, Ljava/util/HashMap;->clear()V

    .line 932
    .line 933
    .line 934
    invoke-virtual {v14}, Ljava/util/HashMap;->clear()V

    .line 935
    .line 936
    .line 937
    invoke-virtual/range {v17 .. v17}, Ljava/util/HashMap;->clear()V

    .line 938
    .line 939
    .line 940
    invoke-virtual/range {v21 .. v21}, Ljava/util/HashSet;->clear()V

    .line 941
    .line 942
    .line 943
    invoke-virtual {v7}, Ljava/util/HashSet;->clear()V

    .line 944
    .line 945
    .line 946
    invoke-virtual/range {v16 .. v16}, Ljava/util/HashSet;->clear()V

    .line 947
    .line 948
    .line 949
    invoke-virtual {v12}, Ljava/util/HashMap;->clear()V

    .line 950
    .line 951
    .line 952
    const/4 v2, 0x0

    .line 953
    iput-boolean v2, v4, Lx03;->f:Z

    .line 954
    .line 955
    invoke-virtual/range {v20 .. v20}, Ljava/util/HashSet;->clear()V

    .line 956
    .line 957
    .line 958
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 959
    .line 960
    .line 961
    move-result-wide v0

    .line 962
    iget-wide v4, v3, Lzc3;->f:J

    .line 963
    .line 964
    sub-long/2addr v0, v4

    .line 965
    iget-object v2, v3, Lzc3;->a:Ljava/util/ArrayList;

    .line 966
    .line 967
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 968
    .line 969
    .line 970
    move-result v3

    .line 971
    if-lez v3, :cond_22

    .line 972
    .line 973
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 974
    .line 975
    .line 976
    move-result-object v2

    .line 977
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 978
    .line 979
    .line 980
    move-result v3

    .line 981
    if-nez v3, :cond_20

    .line 982
    .line 983
    goto :goto_14

    .line 984
    :cond_20
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 985
    .line 986
    .line 987
    move-result-object v2

    .line 988
    if-nez v2, :cond_21

    .line 989
    .line 990
    sget-object v2, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    .line 991
    .line 992
    invoke-virtual {v2, v0, v1}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    .line 993
    .line 994
    .line 995
    throw v19

    .line 996
    :cond_21
    new-instance v0, Ljava/lang/ClassCastException;

    .line 997
    .line 998
    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    .line 999
    .line 1000
    .line 1001
    throw v0

    .line 1002
    :cond_22
    :goto_14
    sget-object v0, Lqc3;->d:Lqc3;

    .line 1003
    .line 1004
    iget-object v1, v0, Lqc3;->a:Ljava/lang/ref/WeakReference;

    .line 1005
    .line 1006
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 1007
    .line 1008
    .line 1009
    move-result-object v1

    .line 1010
    check-cast v1, Landroid/content/Context;

    .line 1011
    .line 1012
    if-nez v1, :cond_23

    .line 1013
    .line 1014
    goto :goto_15

    .line 1015
    :cond_23
    const-string v2, "keyguard"

    .line 1016
    .line 1017
    invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 1018
    .line 1019
    .line 1020
    move-result-object v1

    .line 1021
    check-cast v1, Landroid/app/KeyguardManager;

    .line 1022
    .line 1023
    if-eqz v1, :cond_24

    .line 1024
    .line 1025
    invoke-virtual {v1}, Landroid/app/KeyguardManager;->isDeviceLocked()Z

    .line 1026
    .line 1027
    .line 1028
    move-result v1

    .line 1029
    iget-boolean v2, v0, Lqc3;->b:Z

    .line 1030
    .line 1031
    invoke-virtual {v0, v2, v1}, Lqc3;->a(ZZ)V

    .line 1032
    .line 1033
    .line 1034
    iput-boolean v1, v0, Lqc3;->c:Z

    .line 1035
    .line 1036
    :cond_24
    :goto_15
    :pswitch_3
    return-void

    .line 1037
    :pswitch_4
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 1038
    .line 1039
    .line 1040
    move-result-object v0

    .line 1041
    invoke-virtual {v0}, Landroid/os/Looper;->quit()V

    .line 1042
    .line 1043
    .line 1044
    return-void

    .line 1045
    :pswitch_5
    sget-object v0, Lqb2;->l:Ljava/util/List;

    .line 1046
    .line 1047
    const-string v0, "Pinged SB successfully."

    .line 1048
    .line 1049
    invoke-static {v0}, Lwl2;->F(Ljava/lang/String;)V

    .line 1050
    .line 1051
    .line 1052
    return-void

    .line 1053
    :pswitch_6
    :try_start_2
    const-string v0, "MD5"

    .line 1054
    .line 1055
    invoke-static {v0}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    .line 1056
    .line 1057
    .line 1058
    move-result-object v0

    .line 1059
    sput-object v0, Lhs1;->b:Ljava/security/MessageDigest;
    :try_end_2
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 1060
    .line 1061
    sget-object v0, Lhs1;->e:Ljava/util/concurrent/CountDownLatch;

    .line 1062
    .line 1063
    :goto_16
    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 1064
    .line 1065
    .line 1066
    goto :goto_17

    .line 1067
    :catchall_0
    move-exception v0

    .line 1068
    sget-object v1, Lhs1;->e:Ljava/util/concurrent/CountDownLatch;

    .line 1069
    .line 1070
    invoke-virtual {v1}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 1071
    .line 1072
    .line 1073
    throw v0

    .line 1074
    :catch_2
    sget-object v0, Lhs1;->e:Ljava/util/concurrent/CountDownLatch;

    .line 1075
    .line 1076
    goto :goto_16

    .line 1077
    :goto_17
    return-void

    .line 1078
    :pswitch_7
    const/4 v2, 0x0

    .line 1079
    :try_start_3
    const-string v0, "EmojiCompat.EmojiCompatInitializer.run"

    .line 1080
    .line 1081
    sget v1, Lo21;->a:I

    .line 1082
    .line 1083
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 1084
    .line 1085
    .line 1086
    sget-object v0, Lrr;->k:Lrr;

    .line 1087
    .line 1088
    if-eqz v0, :cond_25

    .line 1089
    .line 1090
    const/4 v2, 0x1

    .line 1091
    :cond_25
    if-eqz v2, :cond_26

    .line 1092
    .line 1093
    invoke-static {}, Lrr;->a()Lrr;

    .line 1094
    .line 1095
    .line 1096
    move-result-object v0

    .line 1097
    invoke-virtual {v0}, Lrr;->c()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 1098
    .line 1099
    .line 1100
    goto :goto_18

    .line 1101
    :catchall_1
    move-exception v0

    .line 1102
    goto :goto_19

    .line 1103
    :cond_26
    :goto_18
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 1104
    .line 1105
    .line 1106
    return-void

    .line 1107
    :goto_19
    sget v1, Lo21;->a:I

    .line 1108
    .line 1109
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 1110
    .line 1111
    .line 1112
    throw v0

    .line 1113
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
