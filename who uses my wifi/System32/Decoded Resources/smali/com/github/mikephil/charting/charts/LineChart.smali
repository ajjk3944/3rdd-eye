.class public Lcom/github/mikephil/charting/charts/LineChart;
.super Lk9;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lk60;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lk9;",
        "Lk60;"
    }
.end annotation


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 14

    .line 1
    invoke-direct/range {p0 .. p2}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lje;->f:Z

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    iput-object v1, p0, Lje;->g:Lle;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    iput-boolean v1, p0, Lje;->h:Z

    .line 12
    .line 13
    iput-boolean v1, p0, Lje;->i:Z

    .line 14
    .line 15
    const v2, 0x3f666666    # 0.9f

    .line 16
    .line 17
    .line 18
    iput v2, p0, Lje;->j:F

    .line 19
    .line 20
    new-instance v2, Lxn;

    .line 21
    .line 22
    invoke-direct {v2, v0}, Lxn;-><init>(I)V

    .line 23
    .line 24
    .line 25
    iput-object v2, p0, Lje;->k:Lxn;

    .line 26
    .line 27
    iput-boolean v1, p0, Lje;->o:Z

    .line 28
    .line 29
    const-string v2, "No chart data available."

    .line 30
    .line 31
    iput-object v2, p0, Lje;->s:Ljava/lang/String;

    .line 32
    .line 33
    new-instance v2, Lu61;

    .line 34
    .line 35
    invoke-direct {v2}, Lu61;-><init>()V

    .line 36
    .line 37
    .line 38
    iput-object v2, p0, Lje;->w:Lu61;

    .line 39
    .line 40
    const/4 v3, 0x0

    .line 41
    iput v3, p0, Lje;->y:F

    .line 42
    .line 43
    iput v3, p0, Lje;->z:F

    .line 44
    .line 45
    iput v3, p0, Lje;->A:F

    .line 46
    .line 47
    iput v3, p0, Lje;->B:F

    .line 48
    .line 49
    iput-boolean v0, p0, Lje;->C:Z

    .line 50
    .line 51
    iput v3, p0, Lje;->E:F

    .line 52
    .line 53
    new-instance v4, Ljava/util/ArrayList;

    .line 54
    .line 55
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 56
    .line 57
    .line 58
    iput-object v4, p0, Lje;->F:Ljava/util/ArrayList;

    .line 59
    .line 60
    iput-boolean v0, p0, Lje;->G:Z

    .line 61
    .line 62
    invoke-virtual {p0, v0}, Landroid/view/View;->setWillNotDraw(Z)V

    .line 63
    .line 64
    .line 65
    new-instance v4, Lke;

    .line 66
    .line 67
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 68
    .line 69
    .line 70
    iput-object v4, p0, Lje;->x:Lke;

    .line 71
    .line 72
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 73
    .line 74
    .line 75
    move-result-object v4

    .line 76
    sget-object v5, Lk41;->a:Landroid/util/DisplayMetrics;

    .line 77
    .line 78
    if-nez v4, :cond_0

    .line 79
    .line 80
    invoke-static {}, Landroid/view/ViewConfiguration;->getMinimumFlingVelocity()I

    .line 81
    .line 82
    .line 83
    move-result v4

    .line 84
    sput v4, Lk41;->b:I

    .line 85
    .line 86
    invoke-static {}, Landroid/view/ViewConfiguration;->getMaximumFlingVelocity()I

    .line 87
    .line 88
    .line 89
    move-result v4

    .line 90
    sput v4, Lk41;->c:I

    .line 91
    .line 92
    const-string v4, "MPChartLib-Utils"

    .line 93
    .line 94
    const-string v5, "Utils.init(...) PROVIDED CONTEXT OBJECT IS NULL"

    .line 95
    .line 96
    invoke-static {v4, v5}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 97
    .line 98
    .line 99
    goto :goto_0

    .line 100
    :cond_0
    invoke-static {v4}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    .line 101
    .line 102
    .line 103
    move-result-object v5

    .line 104
    invoke-virtual {v5}, Landroid/view/ViewConfiguration;->getScaledMinimumFlingVelocity()I

    .line 105
    .line 106
    .line 107
    move-result v6

    .line 108
    sput v6, Lk41;->b:I

    .line 109
    .line 110
    invoke-virtual {v5}, Landroid/view/ViewConfiguration;->getScaledMaximumFlingVelocity()I

    .line 111
    .line 112
    .line 113
    move-result v5

    .line 114
    sput v5, Lk41;->c:I

    .line 115
    .line 116
    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 117
    .line 118
    .line 119
    move-result-object v4

    .line 120
    invoke-virtual {v4}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 121
    .line 122
    .line 123
    move-result-object v4

    .line 124
    sput-object v4, Lk41;->a:Landroid/util/DisplayMetrics;

    .line 125
    .line 126
    :goto_0
    const/high16 v4, 0x43fa0000    # 500.0f

    .line 127
    .line 128
    invoke-static {v4}, Lk41;->c(F)F

    .line 129
    .line 130
    .line 131
    move-result v4

    .line 132
    iput v4, p0, Lje;->E:F

    .line 133
    .line 134
    new-instance v4, Llo;

    .line 135
    .line 136
    invoke-direct {v4}, Ldh;-><init>()V

    .line 137
    .line 138
    .line 139
    const-string v5, "Description Label"

    .line 140
    .line 141
    iput-object v5, v4, Llo;->f:Ljava/lang/String;

    .line 142
    .line 143
    sget-object v5, Landroid/graphics/Paint$Align;->RIGHT:Landroid/graphics/Paint$Align;

    .line 144
    .line 145
    iput-object v5, v4, Llo;->g:Landroid/graphics/Paint$Align;

    .line 146
    .line 147
    const/high16 v5, 0x41000000    # 8.0f

    .line 148
    .line 149
    invoke-static {v5}, Lk41;->c(F)F

    .line 150
    .line 151
    .line 152
    move-result v6

    .line 153
    iput v6, v4, Ldh;->d:F

    .line 154
    .line 155
    iput-object v4, p0, Lje;->p:Llo;

    .line 156
    .line 157
    new-instance v4, Lk50;

    .line 158
    .line 159
    invoke-direct {v4}, Ldh;-><init>()V

    .line 160
    .line 161
    .line 162
    new-array v6, v0, [Ll50;

    .line 163
    .line 164
    iput-object v6, v4, Lk50;->f:[Ll50;

    .line 165
    .line 166
    iput v1, v4, Lk50;->g:I

    .line 167
    .line 168
    const/4 v6, 0x3

    .line 169
    iput v6, v4, Lk50;->h:I

    .line 170
    .line 171
    iput v1, v4, Lk50;->i:I

    .line 172
    .line 173
    iput v1, v4, Lk50;->j:I

    .line 174
    .line 175
    const/4 v6, 0x4

    .line 176
    iput v6, v4, Lk50;->k:I

    .line 177
    .line 178
    iput v5, v4, Lk50;->l:F

    .line 179
    .line 180
    const/high16 v5, 0x40400000    # 3.0f

    .line 181
    .line 182
    iput v5, v4, Lk50;->m:F

    .line 183
    .line 184
    const/high16 v7, 0x40c00000    # 6.0f

    .line 185
    .line 186
    iput v7, v4, Lk50;->n:F

    .line 187
    .line 188
    const/high16 v7, 0x40a00000    # 5.0f

    .line 189
    .line 190
    iput v7, v4, Lk50;->o:F

    .line 191
    .line 192
    iput v5, v4, Lk50;->p:F

    .line 193
    .line 194
    const v8, 0x3f733333    # 0.95f

    .line 195
    .line 196
    .line 197
    iput v8, v4, Lk50;->q:F

    .line 198
    .line 199
    iput v3, v4, Lk50;->r:F

    .line 200
    .line 201
    iput v3, v4, Lk50;->s:F

    .line 202
    .line 203
    new-instance v8, Ljava/util/ArrayList;

    .line 204
    .line 205
    const/16 v9, 0x10

    .line 206
    .line 207
    invoke-direct {v8, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 208
    .line 209
    .line 210
    iput-object v8, v4, Lk50;->t:Ljava/util/ArrayList;

    .line 211
    .line 212
    new-instance v8, Ljava/util/ArrayList;

    .line 213
    .line 214
    invoke-direct {v8, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 215
    .line 216
    .line 217
    iput-object v8, v4, Lk50;->u:Ljava/util/ArrayList;

    .line 218
    .line 219
    new-instance v8, Ljava/util/ArrayList;

    .line 220
    .line 221
    invoke-direct {v8, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 222
    .line 223
    .line 224
    iput-object v8, v4, Lk50;->v:Ljava/util/ArrayList;

    .line 225
    .line 226
    const/high16 v8, 0x41200000    # 10.0f

    .line 227
    .line 228
    invoke-static {v8}, Lk41;->c(F)F

    .line 229
    .line 230
    .line 231
    move-result v10

    .line 232
    iput v10, v4, Ldh;->d:F

    .line 233
    .line 234
    invoke-static {v7}, Lk41;->c(F)F

    .line 235
    .line 236
    .line 237
    move-result v7

    .line 238
    iput v7, v4, Ldh;->b:F

    .line 239
    .line 240
    invoke-static {v5}, Lk41;->c(F)F

    .line 241
    .line 242
    .line 243
    move-result v7

    .line 244
    iput v7, v4, Ldh;->c:F

    .line 245
    .line 246
    iput-object v4, p0, Lje;->q:Lk50;

    .line 247
    .line 248
    new-instance v7, Lm50;

    .line 249
    .line 250
    invoke-direct {v7, v6, v2}, Lf74;-><init>(ILjava/lang/Object;)V

    .line 251
    .line 252
    .line 253
    new-instance v10, Ljava/util/ArrayList;

    .line 254
    .line 255
    invoke-direct {v10, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 256
    .line 257
    .line 258
    iput-object v10, v7, Lm50;->l:Ljava/util/ArrayList;

    .line 259
    .line 260
    new-instance v9, Landroid/graphics/Paint$FontMetrics;

    .line 261
    .line 262
    invoke-direct {v9}, Landroid/graphics/Paint$FontMetrics;-><init>()V

    .line 263
    .line 264
    .line 265
    iput-object v9, v7, Lm50;->m:Landroid/graphics/Paint$FontMetrics;

    .line 266
    .line 267
    new-instance v9, Landroid/graphics/Path;

    .line 268
    .line 269
    invoke-direct {v9}, Landroid/graphics/Path;-><init>()V

    .line 270
    .line 271
    .line 272
    iput-object v9, v7, Lm50;->n:Landroid/graphics/Path;

    .line 273
    .line 274
    iput-object v4, v7, Lm50;->k:Lk50;

    .line 275
    .line 276
    new-instance v4, Landroid/graphics/Paint;

    .line 277
    .line 278
    invoke-direct {v4, v1}, Landroid/graphics/Paint;-><init>(I)V

    .line 279
    .line 280
    .line 281
    iput-object v4, v7, Lm50;->i:Landroid/graphics/Paint;

    .line 282
    .line 283
    const/high16 v9, 0x41100000    # 9.0f

    .line 284
    .line 285
    invoke-static {v9}, Lk41;->c(F)F

    .line 286
    .line 287
    .line 288
    move-result v10

    .line 289
    invoke-virtual {v4, v10}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 290
    .line 291
    .line 292
    sget-object v10, Landroid/graphics/Paint$Align;->LEFT:Landroid/graphics/Paint$Align;

    .line 293
    .line 294
    invoke-virtual {v4, v10}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 295
    .line 296
    .line 297
    new-instance v4, Landroid/graphics/Paint;

    .line 298
    .line 299
    invoke-direct {v4, v1}, Landroid/graphics/Paint;-><init>(I)V

    .line 300
    .line 301
    .line 302
    iput-object v4, v7, Lm50;->j:Landroid/graphics/Paint;

    .line 303
    .line 304
    sget-object v10, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 305
    .line 306
    invoke-virtual {v4, v10}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 307
    .line 308
    .line 309
    iput-object v7, p0, Lje;->t:Lm50;

    .line 310
    .line 311
    new-instance v4, Lcb1;

    .line 312
    .line 313
    invoke-direct {v4}, Ld9;-><init>()V

    .line 314
    .line 315
    .line 316
    iput v1, v4, Lcb1;->y:I

    .line 317
    .line 318
    iput v1, v4, Lcb1;->z:I

    .line 319
    .line 320
    const/high16 v7, 0x40800000    # 4.0f

    .line 321
    .line 322
    invoke-static {v7}, Lk41;->c(F)F

    .line 323
    .line 324
    .line 325
    move-result v7

    .line 326
    iput v7, v4, Ldh;->c:F

    .line 327
    .line 328
    iput-object v4, p0, Lje;->n:Lcb1;

    .line 329
    .line 330
    new-instance v4, Landroid/graphics/Paint;

    .line 331
    .line 332
    invoke-direct {v4, v1}, Landroid/graphics/Paint;-><init>(I)V

    .line 333
    .line 334
    .line 335
    iput-object v4, p0, Lje;->l:Landroid/graphics/Paint;

    .line 336
    .line 337
    new-instance v4, Landroid/graphics/Paint;

    .line 338
    .line 339
    invoke-direct {v4, v1}, Landroid/graphics/Paint;-><init>(I)V

    .line 340
    .line 341
    .line 342
    iput-object v4, p0, Lje;->m:Landroid/graphics/Paint;

    .line 343
    .line 344
    const/16 v7, 0xbd

    .line 345
    .line 346
    const/16 v11, 0x33

    .line 347
    .line 348
    const/16 v12, 0xf7

    .line 349
    .line 350
    invoke-static {v12, v7, v11}, Landroid/graphics/Color;->rgb(III)I

    .line 351
    .line 352
    .line 353
    move-result v7

    .line 354
    invoke-virtual {v4, v7}, Landroid/graphics/Paint;->setColor(I)V

    .line 355
    .line 356
    .line 357
    iget-object v4, p0, Lje;->m:Landroid/graphics/Paint;

    .line 358
    .line 359
    sget-object v7, Landroid/graphics/Paint$Align;->CENTER:Landroid/graphics/Paint$Align;

    .line 360
    .line 361
    invoke-virtual {v4, v7}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 362
    .line 363
    .line 364
    iget-object v4, p0, Lje;->m:Landroid/graphics/Paint;

    .line 365
    .line 366
    const/high16 v11, 0x41400000    # 12.0f

    .line 367
    .line 368
    invoke-static {v11}, Lk41;->c(F)F

    .line 369
    .line 370
    .line 371
    move-result v11

    .line 372
    invoke-virtual {v4, v11}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 373
    .line 374
    .line 375
    new-instance v4, Leb1;

    .line 376
    .line 377
    invoke-direct {v4, v1}, Leb1;-><init>(I)V

    .line 378
    .line 379
    .line 380
    iput-object v4, p0, Lk9;->a0:Leb1;

    .line 381
    .line 382
    new-instance v4, Leb1;

    .line 383
    .line 384
    const/4 v11, 0x2

    .line 385
    invoke-direct {v4, v11}, Leb1;-><init>(I)V

    .line 386
    .line 387
    .line 388
    iput-object v4, p0, Lk9;->b0:Leb1;

    .line 389
    .line 390
    new-instance v4, Luk1;

    .line 391
    .line 392
    invoke-direct {v4, v2}, Luk1;-><init>(Lu61;)V

    .line 393
    .line 394
    .line 395
    iput-object v4, p0, Lk9;->e0:Luk1;

    .line 396
    .line 397
    new-instance v4, Luk1;

    .line 398
    .line 399
    invoke-direct {v4, v2}, Luk1;-><init>(Lu61;)V

    .line 400
    .line 401
    .line 402
    iput-object v4, p0, Lk9;->f0:Luk1;

    .line 403
    .line 404
    new-instance v4, Lfb1;

    .line 405
    .line 406
    iget-object v12, p0, Lk9;->a0:Leb1;

    .line 407
    .line 408
    iget-object v13, p0, Lk9;->e0:Luk1;

    .line 409
    .line 410
    invoke-direct {v4, v2, v12, v13}, Lfb1;-><init>(Lu61;Leb1;Luk1;)V

    .line 411
    .line 412
    .line 413
    iput-object v4, p0, Lk9;->c0:Lfb1;

    .line 414
    .line 415
    new-instance v4, Lfb1;

    .line 416
    .line 417
    iget-object v12, p0, Lk9;->b0:Leb1;

    .line 418
    .line 419
    iget-object v13, p0, Lk9;->f0:Luk1;

    .line 420
    .line 421
    invoke-direct {v4, v2, v12, v13}, Lfb1;-><init>(Lu61;Leb1;Luk1;)V

    .line 422
    .line 423
    .line 424
    iput-object v4, p0, Lk9;->d0:Lfb1;

    .line 425
    .line 426
    new-instance v4, Ldb1;

    .line 427
    .line 428
    iget-object v12, p0, Lje;->n:Lcb1;

    .line 429
    .line 430
    iget-object v13, p0, Lk9;->e0:Luk1;

    .line 431
    .line 432
    invoke-direct {v4, v2, v13, v12}, Le9;-><init>(Lu61;Luk1;Ld9;)V

    .line 433
    .line 434
    .line 435
    new-instance v13, Landroid/graphics/Path;

    .line 436
    .line 437
    invoke-direct {v13}, Landroid/graphics/Path;-><init>()V

    .line 438
    .line 439
    .line 440
    iput-object v13, v4, Ldb1;->o:Landroid/graphics/Path;

    .line 441
    .line 442
    new-array v13, v11, [F

    .line 443
    .line 444
    iput-object v13, v4, Ldb1;->p:[F

    .line 445
    .line 446
    new-instance v13, Landroid/graphics/RectF;

    .line 447
    .line 448
    invoke-direct {v13}, Landroid/graphics/RectF;-><init>()V

    .line 449
    .line 450
    .line 451
    iput-object v13, v4, Ldb1;->q:Landroid/graphics/RectF;

    .line 452
    .line 453
    new-array v13, v11, [F

    .line 454
    .line 455
    iput-object v13, v4, Ldb1;->r:[F

    .line 456
    .line 457
    new-instance v13, Landroid/graphics/RectF;

    .line 458
    .line 459
    invoke-direct {v13}, Landroid/graphics/RectF;-><init>()V

    .line 460
    .line 461
    .line 462
    new-instance v13, Landroid/graphics/Path;

    .line 463
    .line 464
    invoke-direct {v13}, Landroid/graphics/Path;-><init>()V

    .line 465
    .line 466
    .line 467
    iput-object v12, v4, Ldb1;->n:Lcb1;

    .line 468
    .line 469
    iget-object v12, v4, Le9;->l:Landroid/graphics/Paint;

    .line 470
    .line 471
    const/high16 v13, -0x1000000

    .line 472
    .line 473
    invoke-virtual {v12, v13}, Landroid/graphics/Paint;->setColor(I)V

    .line 474
    .line 475
    .line 476
    invoke-virtual {v12, v7}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 477
    .line 478
    .line 479
    invoke-static {v8}, Lk41;->c(F)F

    .line 480
    .line 481
    .line 482
    move-result v8

    .line 483
    invoke-virtual {v12, v8}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 484
    .line 485
    .line 486
    iput-object v4, p0, Lk9;->g0:Ldb1;

    .line 487
    .line 488
    new-instance v4, Lme;

    .line 489
    .line 490
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 491
    .line 492
    .line 493
    new-instance v8, Ljava/util/ArrayList;

    .line 494
    .line 495
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 496
    .line 497
    .line 498
    iput-object v8, v4, Lme;->b:Ljava/util/ArrayList;

    .line 499
    .line 500
    iput-object p0, v4, Lme;->a:Lcom/github/mikephil/charting/charts/LineChart;

    .line 501
    .line 502
    invoke-virtual {p0, v4}, Lje;->setHighlighter(Lme;)V

    .line 503
    .line 504
    .line 505
    new-instance v4, Ll9;

    .line 506
    .line 507
    invoke-direct {v4}, Landroid/view/GestureDetector$SimpleOnGestureListener;-><init>()V

    .line 508
    .line 509
    .line 510
    iput v0, v4, Loe;->f:I

    .line 511
    .line 512
    iput-object p0, v4, Loe;->i:Lcom/github/mikephil/charting/charts/LineChart;

    .line 513
    .line 514
    new-instance v8, Landroid/view/GestureDetector;

    .line 515
    .line 516
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 517
    .line 518
    .line 519
    move-result-object v12

    .line 520
    invoke-direct {v8, v12, v4}, Landroid/view/GestureDetector;-><init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;)V

    .line 521
    .line 522
    .line 523
    iput-object v8, v4, Loe;->h:Landroid/view/GestureDetector;

    .line 524
    .line 525
    new-instance v8, Landroid/graphics/Matrix;

    .line 526
    .line 527
    invoke-direct {v8}, Landroid/graphics/Matrix;-><init>()V

    .line 528
    .line 529
    .line 530
    iput-object v8, v4, Ll9;->j:Landroid/graphics/Matrix;

    .line 531
    .line 532
    new-instance v8, Landroid/graphics/Matrix;

    .line 533
    .line 534
    invoke-direct {v8}, Landroid/graphics/Matrix;-><init>()V

    .line 535
    .line 536
    .line 537
    iput-object v8, v4, Ll9;->k:Landroid/graphics/Matrix;

    .line 538
    .line 539
    invoke-static {v3, v3}, Laa0;->b(FF)Laa0;

    .line 540
    .line 541
    .line 542
    move-result-object v8

    .line 543
    iput-object v8, v4, Ll9;->l:Laa0;

    .line 544
    .line 545
    invoke-static {v3, v3}, Laa0;->b(FF)Laa0;

    .line 546
    .line 547
    .line 548
    move-result-object v8

    .line 549
    iput-object v8, v4, Ll9;->m:Laa0;

    .line 550
    .line 551
    const/high16 v8, 0x3f800000    # 1.0f

    .line 552
    .line 553
    iput v8, v4, Ll9;->n:F

    .line 554
    .line 555
    iput v8, v4, Ll9;->o:F

    .line 556
    .line 557
    iput v8, v4, Ll9;->p:F

    .line 558
    .line 559
    move/from16 p2, v8

    .line 560
    .line 561
    move p1, v9

    .line 562
    const-wide/16 v8, 0x0

    .line 563
    .line 564
    iput-wide v8, v4, Ll9;->s:J

    .line 565
    .line 566
    invoke-static {v3, v3}, Laa0;->b(FF)Laa0;

    .line 567
    .line 568
    .line 569
    move-result-object v8

    .line 570
    iput-object v8, v4, Ll9;->t:Laa0;

    .line 571
    .line 572
    invoke-static {v3, v3}, Laa0;->b(FF)Laa0;

    .line 573
    .line 574
    .line 575
    move-result-object v3

    .line 576
    iput-object v3, v4, Ll9;->u:Laa0;

    .line 577
    .line 578
    iget-object v3, v2, Lu61;->a:Landroid/graphics/Matrix;

    .line 579
    .line 580
    iput-object v3, v4, Ll9;->j:Landroid/graphics/Matrix;

    .line 581
    .line 582
    invoke-static {v5}, Lk41;->c(F)F

    .line 583
    .line 584
    .line 585
    move-result v3

    .line 586
    iput v3, v4, Ll9;->v:F

    .line 587
    .line 588
    const/high16 v3, 0x40600000    # 3.5f

    .line 589
    .line 590
    invoke-static {v3}, Lk41;->c(F)F

    .line 591
    .line 592
    .line 593
    move-result v3

    .line 594
    iput v3, v4, Ll9;->w:F

    .line 595
    .line 596
    iput-object v4, p0, Lje;->r:Loe;

    .line 597
    .line 598
    new-instance v3, Landroid/graphics/Paint;

    .line 599
    .line 600
    invoke-direct {v3}, Landroid/graphics/Paint;-><init>()V

    .line 601
    .line 602
    .line 603
    iput-object v3, p0, Lk9;->Q:Landroid/graphics/Paint;

    .line 604
    .line 605
    invoke-virtual {v3, v10}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 606
    .line 607
    .line 608
    iget-object v3, p0, Lk9;->Q:Landroid/graphics/Paint;

    .line 609
    .line 610
    const/16 v4, 0xf0

    .line 611
    .line 612
    invoke-static {v4, v4, v4}, Landroid/graphics/Color;->rgb(III)I

    .line 613
    .line 614
    .line 615
    move-result v4

    .line 616
    invoke-virtual {v3, v4}, Landroid/graphics/Paint;->setColor(I)V

    .line 617
    .line 618
    .line 619
    new-instance v3, Landroid/graphics/Paint;

    .line 620
    .line 621
    invoke-direct {v3}, Landroid/graphics/Paint;-><init>()V

    .line 622
    .line 623
    .line 624
    iput-object v3, p0, Lk9;->R:Landroid/graphics/Paint;

    .line 625
    .line 626
    sget-object v4, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 627
    .line 628
    invoke-virtual {v3, v4}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 629
    .line 630
    .line 631
    iget-object v3, p0, Lk9;->R:Landroid/graphics/Paint;

    .line 632
    .line 633
    invoke-virtual {v3, v13}, Landroid/graphics/Paint;->setColor(I)V

    .line 634
    .line 635
    .line 636
    iget-object v3, p0, Lk9;->R:Landroid/graphics/Paint;

    .line 637
    .line 638
    invoke-static/range {p2 .. p2}, Lk41;->c(F)F

    .line 639
    .line 640
    .line 641
    move-result v5

    .line 642
    invoke-virtual {v3, v5}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 643
    .line 644
    .line 645
    new-instance v3, Li60;

    .line 646
    .line 647
    iget-object v5, p0, Lje;->x:Lke;

    .line 648
    .line 649
    invoke-direct {v3, v6, v2}, Lf74;-><init>(ILjava/lang/Object;)V

    .line 650
    .line 651
    .line 652
    iput-object v5, v3, Lom;->i:Lke;

    .line 653
    .line 654
    new-instance v2, Landroid/graphics/Paint;

    .line 655
    .line 656
    invoke-direct {v2, v1}, Landroid/graphics/Paint;-><init>(I)V

    .line 657
    .line 658
    .line 659
    iput-object v2, v3, Lom;->j:Landroid/graphics/Paint;

    .line 660
    .line 661
    invoke-virtual {v2, v10}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 662
    .line 663
    .line 664
    new-instance v2, Landroid/graphics/Paint;

    .line 665
    .line 666
    invoke-direct {v2, v6}, Landroid/graphics/Paint;-><init>(I)V

    .line 667
    .line 668
    .line 669
    new-instance v2, Landroid/graphics/Paint;

    .line 670
    .line 671
    invoke-direct {v2, v1}, Landroid/graphics/Paint;-><init>(I)V

    .line 672
    .line 673
    .line 674
    iput-object v2, v3, Lom;->l:Landroid/graphics/Paint;

    .line 675
    .line 676
    const/16 v5, 0x3f

    .line 677
    .line 678
    invoke-static {v5, v5, v5}, Landroid/graphics/Color;->rgb(III)I

    .line 679
    .line 680
    .line 681
    move-result v5

    .line 682
    invoke-virtual {v2, v5}, Landroid/graphics/Paint;->setColor(I)V

    .line 683
    .line 684
    .line 685
    invoke-virtual {v2, v7}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 686
    .line 687
    .line 688
    invoke-static {p1}, Lk41;->c(F)F

    .line 689
    .line 690
    .line 691
    move-result v5

    .line 692
    invoke-virtual {v2, v5}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 693
    .line 694
    .line 695
    new-instance v2, Landroid/graphics/Paint;

    .line 696
    .line 697
    invoke-direct {v2, v1}, Landroid/graphics/Paint;-><init>(I)V

    .line 698
    .line 699
    .line 700
    iput-object v2, v3, Lom;->k:Landroid/graphics/Paint;

    .line 701
    .line 702
    invoke-virtual {v2, v4}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 703
    .line 704
    .line 705
    const/high16 v4, 0x40000000    # 2.0f

    .line 706
    .line 707
    invoke-virtual {v2, v4}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 708
    .line 709
    .line 710
    const/16 v4, 0xbb

    .line 711
    .line 712
    const/16 v5, 0x73

    .line 713
    .line 714
    const/16 v7, 0xff

    .line 715
    .line 716
    invoke-static {v7, v4, v5}, Landroid/graphics/Color;->rgb(III)I

    .line 717
    .line 718
    .line 719
    move-result v4

    .line 720
    invoke-virtual {v2, v4}, Landroid/graphics/Paint;->setColor(I)V

    .line 721
    .line 722
    .line 723
    new-instance v2, Lo9;

    .line 724
    .line 725
    invoke-direct {v2, v3}, Lo9;-><init>(Ljava/lang/Object;)V

    .line 726
    .line 727
    .line 728
    iput-object v2, v3, Li60;->m:Lo9;

    .line 729
    .line 730
    new-instance v2, Landroid/graphics/Path;

    .line 731
    .line 732
    invoke-direct {v2}, Landroid/graphics/Path;-><init>()V

    .line 733
    .line 734
    .line 735
    iput-object v2, v3, Li60;->n:Landroid/graphics/Path;

    .line 736
    .line 737
    sget-object v2, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 738
    .line 739
    iput-object v2, v3, Li60;->s:Landroid/graphics/Bitmap$Config;

    .line 740
    .line 741
    new-instance v2, Landroid/graphics/Path;

    .line 742
    .line 743
    invoke-direct {v2}, Landroid/graphics/Path;-><init>()V

    .line 744
    .line 745
    .line 746
    iput-object v2, v3, Li60;->t:Landroid/graphics/Path;

    .line 747
    .line 748
    new-instance v2, Landroid/graphics/Path;

    .line 749
    .line 750
    invoke-direct {v2}, Landroid/graphics/Path;-><init>()V

    .line 751
    .line 752
    .line 753
    iput-object v2, v3, Li60;->u:Landroid/graphics/Path;

    .line 754
    .line 755
    new-array v2, v6, [F

    .line 756
    .line 757
    iput-object v2, v3, Li60;->v:[F

    .line 758
    .line 759
    new-instance v2, Landroid/graphics/Path;

    .line 760
    .line 761
    invoke-direct {v2}, Landroid/graphics/Path;-><init>()V

    .line 762
    .line 763
    .line 764
    iput-object v2, v3, Li60;->w:Landroid/graphics/Path;

    .line 765
    .line 766
    new-instance v2, Ljava/util/HashMap;

    .line 767
    .line 768
    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 769
    .line 770
    .line 771
    iput-object v2, v3, Li60;->x:Ljava/util/HashMap;

    .line 772
    .line 773
    new-array v2, v11, [F

    .line 774
    .line 775
    iput-object v2, v3, Li60;->y:[F

    .line 776
    .line 777
    iput-object p0, v3, Li60;->o:Lcom/github/mikephil/charting/charts/LineChart;

    .line 778
    .line 779
    new-instance v2, Landroid/graphics/Paint;

    .line 780
    .line 781
    invoke-direct {v2, v1}, Landroid/graphics/Paint;-><init>(I)V

    .line 782
    .line 783
    .line 784
    iput-object v2, v3, Li60;->p:Landroid/graphics/Paint;

    .line 785
    .line 786
    invoke-virtual {v2, v10}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 787
    .line 788
    .line 789
    const/4 v4, -0x1

    .line 790
    invoke-virtual {v2, v4}, Landroid/graphics/Paint;->setColor(I)V

    .line 791
    .line 792
    .line 793
    iput-object v3, p0, Lje;->u:Lom;

    .line 794
    .line 795
    const/16 v2, 0x64

    .line 796
    .line 797
    iput v2, p0, Lk9;->H:I

    .line 798
    .line 799
    iput-boolean v0, p0, Lk9;->I:Z

    .line 800
    .line 801
    iput-boolean v0, p0, Lk9;->J:Z

    .line 802
    .line 803
    iput-boolean v1, p0, Lk9;->K:Z

    .line 804
    .line 805
    iput-boolean v1, p0, Lk9;->L:Z

    .line 806
    .line 807
    iput-boolean v1, p0, Lk9;->M:Z

    .line 808
    .line 809
    iput-boolean v1, p0, Lk9;->N:Z

    .line 810
    .line 811
    iput-boolean v1, p0, Lk9;->O:Z

    .line 812
    .line 813
    iput-boolean v1, p0, Lk9;->P:Z

    .line 814
    .line 815
    iput-boolean v0, p0, Lk9;->S:Z

    .line 816
    .line 817
    iput-boolean v0, p0, Lk9;->T:Z

    .line 818
    .line 819
    iput-boolean v0, p0, Lk9;->U:Z

    .line 820
    .line 821
    const/high16 v1, 0x41700000    # 15.0f

    .line 822
    .line 823
    iput v1, p0, Lk9;->V:F

    .line 824
    .line 825
    iput-boolean v0, p0, Lk9;->W:Z

    .line 826
    .line 827
    new-instance v0, Landroid/graphics/RectF;

    .line 828
    .line 829
    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    .line 830
    .line 831
    .line 832
    iput-object v0, p0, Lk9;->h0:Landroid/graphics/RectF;

    .line 833
    .line 834
    new-instance v0, Landroid/graphics/Matrix;

    .line 835
    .line 836
    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 837
    .line 838
    .line 839
    iput-object v0, p0, Lk9;->i0:Landroid/graphics/Matrix;

    .line 840
    .line 841
    new-instance v0, Landroid/graphics/Matrix;

    .line 842
    .line 843
    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 844
    .line 845
    .line 846
    sget-object v0, Lz90;->i:Lni0;

    .line 847
    .line 848
    invoke-virtual {v0}, Lni0;->b()Lmi0;

    .line 849
    .line 850
    .line 851
    move-result-object v1

    .line 852
    check-cast v1, Lz90;

    .line 853
    .line 854
    const-wide/16 v2, 0x0

    .line 855
    .line 856
    iput-wide v2, v1, Lz90;->g:D

    .line 857
    .line 858
    iput-wide v2, v1, Lz90;->h:D

    .line 859
    .line 860
    iput-object v1, p0, Lk9;->j0:Lz90;

    .line 861
    .line 862
    invoke-virtual {v0}, Lni0;->b()Lmi0;

    .line 863
    .line 864
    .line 865
    move-result-object v0

    .line 866
    check-cast v0, Lz90;

    .line 867
    .line 868
    iput-wide v2, v0, Lz90;->g:D

    .line 869
    .line 870
    iput-wide v2, v0, Lz90;->h:D

    .line 871
    .line 872
    iput-object v0, p0, Lk9;->k0:Lz90;

    .line 873
    .line 874
    new-array v0, v11, [F

    .line 875
    .line 876
    iput-object v0, p0, Lk9;->l0:[F

    .line 877
    .line 878
    return-void
.end method


# virtual methods
.method public getLineData()Lj60;
    .locals 1

    .line 1
    iget-object v0, p0, Lje;->g:Lle;

    .line 2
    .line 3
    check-cast v0, Lj60;

    .line 4
    .line 5
    return-object v0
.end method

.method public final onDetachedFromWindow()V
    .locals 3

    .line 1
    iget-object v0, p0, Lje;->u:Lom;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    instance-of v1, v0, Li60;

    .line 6
    .line 7
    if-eqz v1, :cond_2

    .line 8
    .line 9
    check-cast v0, Li60;

    .line 10
    .line 11
    iget-object v1, v0, Li60;->r:Landroid/graphics/Canvas;

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    invoke-virtual {v1, v2}, Landroid/graphics/Canvas;->setBitmap(Landroid/graphics/Bitmap;)V

    .line 17
    .line 18
    .line 19
    iput-object v2, v0, Li60;->r:Landroid/graphics/Canvas;

    .line 20
    .line 21
    :cond_0
    iget-object v1, v0, Li60;->q:Ljava/lang/ref/WeakReference;

    .line 22
    .line 23
    if-eqz v1, :cond_2

    .line 24
    .line 25
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    check-cast v1, Landroid/graphics/Bitmap;

    .line 30
    .line 31
    if-eqz v1, :cond_1

    .line 32
    .line 33
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->recycle()V

    .line 34
    .line 35
    .line 36
    :cond_1
    iget-object v1, v0, Li60;->q:Ljava/lang/ref/WeakReference;

    .line 37
    .line 38
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->clear()V

    .line 39
    .line 40
    .line 41
    iput-object v2, v0, Li60;->q:Ljava/lang/ref/WeakReference;

    .line 42
    .line 43
    :cond_2
    invoke-super {p0}, Lje;->onDetachedFromWindow()V

    .line 44
    .line 45
    .line 46
    return-void
.end method
