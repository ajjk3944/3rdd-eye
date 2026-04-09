.class public final synthetic Ln62;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic f:I

.field public final synthetic g:Ljava/lang/Object;

.field public final synthetic h:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lds2;Lrs2;)V
    .locals 1

    const/16 v0, 0x15

    iput v0, p0, Ln62;->f:I

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln62;->h:Ljava/lang/Object;

    check-cast p2, Lhv1;

    iput-object p2, p0, Ln62;->g:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p3, p0, Ln62;->f:I

    iput-object p1, p0, Ln62;->h:Ljava/lang/Object;

    iput-object p2, p0, Ln62;->g:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V
    .locals 0

    .line 2
    iput p3, p0, Ln62;->f:I

    iput-object p2, p0, Ln62;->h:Ljava/lang/Object;

    iput-object p1, p0, Ln62;->g:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lus0;Landroid/content/Context;Lpd2;)V
    .locals 0

    const/4 p1, 0x7

    iput p1, p0, Ln62;->f:I

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Ln62;->h:Ljava/lang/Object;

    iput-object p3, p0, Ln62;->g:Ljava/lang/Object;

    return-void
.end method

.method private final a()V
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v0, v1, Ln62;->h:Ljava/lang/Object;

    .line 4
    .line 5
    move-object v2, v0

    .line 6
    check-cast v2, Lds2;

    .line 7
    .line 8
    iget-object v0, v1, Ln62;->g:Ljava/lang/Object;

    .line 9
    .line 10
    move-object v3, v0

    .line 11
    check-cast v3, Lhv1;

    .line 12
    .line 13
    iget-object v0, v2, Lds2;->c:Lvr2;

    .line 14
    .line 15
    invoke-virtual {v0}, Lvr2;->d()Z

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    const/4 v5, 0x0

    .line 20
    const/4 v6, 0x0

    .line 21
    if-nez v4, :cond_1

    .line 22
    .line 23
    invoke-virtual {v0}, Lvr2;->b()Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    move-object v7, v6

    .line 31
    goto :goto_2

    .line 32
    :cond_1
    :goto_0
    const-string v0, "1098"

    .line 33
    .line 34
    const-string v4, "3011"

    .line 35
    .line 36
    filled-new-array {v0, v4}, [Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    move v4, v5

    .line 41
    :goto_1
    const/4 v7, 0x2

    .line 42
    if-ge v4, v7, :cond_0

    .line 43
    .line 44
    aget-object v7, v0, v4

    .line 45
    .line 46
    invoke-interface {v3, v7}, Lrs2;->y3(Ljava/lang/String;)Landroid/view/View;

    .line 47
    .line 48
    .line 49
    move-result-object v7

    .line 50
    instance-of v8, v7, Landroid/view/ViewGroup;

    .line 51
    .line 52
    if-eqz v8, :cond_2

    .line 53
    .line 54
    check-cast v7, Landroid/view/ViewGroup;

    .line 55
    .line 56
    goto :goto_2

    .line 57
    :cond_2
    add-int/lit8 v4, v4, 0x1

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :goto_2
    invoke-interface {v3}, Lrs2;->X0()Landroid/view/View;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    new-instance v4, Landroid/widget/RelativeLayout$LayoutParams;

    .line 69
    .line 70
    const/4 v8, -0x2

    .line 71
    invoke-direct {v4, v8, v8}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 72
    .line 73
    .line 74
    iget-object v9, v2, Lds2;->d:Ltr2;

    .line 75
    .line 76
    monitor-enter v9

    .line 77
    :try_start_0
    iget-object v10, v9, Ltr2;->d:Landroid/view/View;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 78
    .line 79
    monitor-exit v9

    .line 80
    if-eqz v10, :cond_4

    .line 81
    .line 82
    monitor-enter v9

    .line 83
    :try_start_1
    iget-object v0, v9, Ltr2;->d:Landroid/view/View;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 84
    .line 85
    monitor-exit v9

    .line 86
    iget-object v8, v2, Lds2;->i:Lr12;

    .line 87
    .line 88
    if-nez v8, :cond_3

    .line 89
    .line 90
    goto/16 :goto_7

    .line 91
    .line 92
    :cond_3
    if-nez v7, :cond_b

    .line 93
    .line 94
    iget v7, v8, Lr12;->j:I

    .line 95
    .line 96
    invoke-static {v4, v7}, Lds2;->b(Landroid/widget/RelativeLayout$LayoutParams;I)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v0, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 100
    .line 101
    .line 102
    move-object v7, v6

    .line 103
    goto/16 :goto_7

    .line 104
    .line 105
    :catchall_0
    move-exception v0

    .line 106
    :try_start_2
    monitor-exit v9
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 107
    throw v0

    .line 108
    :cond_4
    invoke-virtual {v9}, Ltr2;->s()Lx12;

    .line 109
    .line 110
    .line 111
    move-result-object v10

    .line 112
    instance-of v10, v10, Ln12;

    .line 113
    .line 114
    if-nez v10, :cond_5

    .line 115
    .line 116
    move-object v0, v6

    .line 117
    goto/16 :goto_7

    .line 118
    .line 119
    :cond_5
    invoke-virtual {v9}, Ltr2;->s()Lx12;

    .line 120
    .line 121
    .line 122
    move-result-object v10

    .line 123
    check-cast v10, Ln12;

    .line 124
    .line 125
    if-nez v7, :cond_6

    .line 126
    .line 127
    iget v7, v10, Ln12;->m:I

    .line 128
    .line 129
    invoke-static {v4, v7}, Lds2;->b(Landroid/widget/RelativeLayout$LayoutParams;I)V

    .line 130
    .line 131
    .line 132
    move-object v7, v6

    .line 133
    :cond_6
    new-instance v12, Lo12;

    .line 134
    .line 135
    const-string v13, "Error while getting drawable."

    .line 136
    .line 137
    invoke-direct {v12, v0}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    .line 138
    .line 139
    .line 140
    invoke-static {v10}, Lou1;->j(Ljava/lang/Object;)V

    .line 141
    .line 142
    .line 143
    new-instance v14, Landroid/graphics/drawable/ShapeDrawable;

    .line 144
    .line 145
    new-instance v15, Landroid/graphics/drawable/shapes/RoundRectShape;

    .line 146
    .line 147
    sget-object v11, Lo12;->g:[F

    .line 148
    .line 149
    invoke-direct {v15, v11, v6, v6}, Landroid/graphics/drawable/shapes/RoundRectShape;-><init>([FLandroid/graphics/RectF;[F)V

    .line 150
    .line 151
    .line 152
    invoke-direct {v14, v15}, Landroid/graphics/drawable/ShapeDrawable;-><init>(Landroid/graphics/drawable/shapes/Shape;)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {v14}, Landroid/graphics/drawable/ShapeDrawable;->getPaint()Landroid/graphics/Paint;

    .line 156
    .line 157
    .line 158
    move-result-object v11

    .line 159
    iget v15, v10, Ln12;->i:I

    .line 160
    .line 161
    invoke-virtual {v11, v15}, Landroid/graphics/Paint;->setColor(I)V

    .line 162
    .line 163
    .line 164
    invoke-virtual {v12, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {v12, v14}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 168
    .line 169
    .line 170
    new-instance v4, Landroid/widget/RelativeLayout$LayoutParams;

    .line 171
    .line 172
    invoke-direct {v4, v8, v8}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 173
    .line 174
    .line 175
    iget-object v11, v10, Ln12;->f:Ljava/lang/String;

    .line 176
    .line 177
    invoke-static {v11}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 178
    .line 179
    .line 180
    move-result v14

    .line 181
    if-nez v14, :cond_7

    .line 182
    .line 183
    new-instance v14, Landroid/widget/RelativeLayout$LayoutParams;

    .line 184
    .line 185
    invoke-direct {v14, v8, v8}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 186
    .line 187
    .line 188
    new-instance v8, Landroid/widget/TextView;

    .line 189
    .line 190
    invoke-direct {v8, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 191
    .line 192
    .line 193
    invoke-virtual {v8, v14}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 194
    .line 195
    .line 196
    const v14, 0x47470001

    .line 197
    .line 198
    .line 199
    invoke-virtual {v8, v14}, Landroid/view/View;->setId(I)V

    .line 200
    .line 201
    .line 202
    sget-object v14, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    .line 203
    .line 204
    invoke-virtual {v8, v14}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 205
    .line 206
    .line 207
    invoke-virtual {v8, v11}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 208
    .line 209
    .line 210
    iget v11, v10, Ln12;->j:I

    .line 211
    .line 212
    invoke-virtual {v8, v11}, Landroid/widget/TextView;->setTextColor(I)V

    .line 213
    .line 214
    .line 215
    iget v11, v10, Ln12;->k:I

    .line 216
    .line 217
    int-to-float v11, v11

    .line 218
    invoke-virtual {v8, v11}, Landroid/widget/TextView;->setTextSize(F)V

    .line 219
    .line 220
    .line 221
    sget-object v11, Lsv1;->f:Lsv1;

    .line 222
    .line 223
    iget-object v11, v11, Lsv1;->a:Lj63;

    .line 224
    .line 225
    const/4 v11, 0x4

    .line 226
    invoke-static {v0, v11}, Lj63;->b(Landroid/content/Context;I)I

    .line 227
    .line 228
    .line 229
    move-result v14

    .line 230
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 231
    .line 232
    .line 233
    move-result-object v15

    .line 234
    invoke-virtual {v15}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 235
    .line 236
    .line 237
    move-result-object v15

    .line 238
    invoke-static {v15, v11}, Lj63;->m(Landroid/util/DisplayMetrics;I)I

    .line 239
    .line 240
    .line 241
    move-result v11

    .line 242
    invoke-virtual {v8, v14, v5, v11, v5}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 243
    .line 244
    .line 245
    invoke-virtual {v12, v8}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 246
    .line 247
    .line 248
    invoke-virtual {v8}, Landroid/view/View;->getId()I

    .line 249
    .line 250
    .line 251
    move-result v8

    .line 252
    const/4 v11, 0x1

    .line 253
    invoke-virtual {v4, v11, v8}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 254
    .line 255
    .line 256
    goto :goto_3

    .line 257
    :cond_7
    const/4 v11, 0x1

    .line 258
    :goto_3
    new-instance v8, Landroid/widget/ImageView;

    .line 259
    .line 260
    invoke-direct {v8, v0}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 261
    .line 262
    .line 263
    invoke-virtual {v8, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 264
    .line 265
    .line 266
    const v0, 0x47470002

    .line 267
    .line 268
    .line 269
    invoke-virtual {v8, v0}, Landroid/view/View;->setId(I)V

    .line 270
    .line 271
    .line 272
    iget-object v4, v10, Ln12;->g:Ljava/util/ArrayList;

    .line 273
    .line 274
    if-eqz v4, :cond_9

    .line 275
    .line 276
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 277
    .line 278
    .line 279
    move-result v0

    .line 280
    if-le v0, v11, :cond_9

    .line 281
    .line 282
    new-instance v0, Landroid/graphics/drawable/AnimationDrawable;

    .line 283
    .line 284
    invoke-direct {v0}, Landroid/graphics/drawable/AnimationDrawable;-><init>()V

    .line 285
    .line 286
    .line 287
    iput-object v0, v12, Lo12;->f:Landroid/graphics/drawable/AnimationDrawable;

    .line 288
    .line 289
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 290
    .line 291
    .line 292
    move-result v11

    .line 293
    move v0, v5

    .line 294
    :goto_4
    if-ge v0, v11, :cond_8

    .line 295
    .line 296
    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 297
    .line 298
    .line 299
    move-result-object v14

    .line 300
    add-int/lit8 v15, v0, 0x1

    .line 301
    .line 302
    check-cast v14, Lp12;

    .line 303
    .line 304
    :try_start_3
    invoke-virtual {v14}, Lp12;->d()Lu10;

    .line 305
    .line 306
    .line 307
    move-result-object v0

    .line 308
    invoke-static {v0}, Loi0;->l1(Lu10;)Ljava/lang/Object;

    .line 309
    .line 310
    .line 311
    move-result-object v0

    .line 312
    check-cast v0, Landroid/graphics/drawable/Drawable;

    .line 313
    .line 314
    iget-object v14, v12, Lo12;->f:Landroid/graphics/drawable/AnimationDrawable;

    .line 315
    .line 316
    iget v6, v10, Ln12;->l:I

    .line 317
    .line 318
    invoke-virtual {v14, v0, v6}, Landroid/graphics/drawable/AnimationDrawable;->addFrame(Landroid/graphics/drawable/Drawable;I)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    .line 319
    .line 320
    .line 321
    :goto_5
    move v0, v15

    .line 322
    const/4 v6, 0x0

    .line 323
    goto :goto_4

    .line 324
    :catch_0
    move-exception v0

    .line 325
    invoke-static {v13, v0}, Lgi2;->c0(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 326
    .line 327
    .line 328
    goto :goto_5

    .line 329
    :cond_8
    iget-object v0, v12, Lo12;->f:Landroid/graphics/drawable/AnimationDrawable;

    .line 330
    .line 331
    invoke-virtual {v8, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 332
    .line 333
    .line 334
    goto :goto_6

    .line 335
    :cond_9
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 336
    .line 337
    .line 338
    move-result v0

    .line 339
    const/4 v11, 0x1

    .line 340
    if-ne v0, v11, :cond_a

    .line 341
    .line 342
    :try_start_4
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 343
    .line 344
    .line 345
    move-result-object v0

    .line 346
    check-cast v0, Lp12;

    .line 347
    .line 348
    invoke-virtual {v0}, Lp12;->d()Lu10;

    .line 349
    .line 350
    .line 351
    move-result-object v0

    .line 352
    invoke-static {v0}, Loi0;->l1(Lu10;)Ljava/lang/Object;

    .line 353
    .line 354
    .line 355
    move-result-object v0

    .line 356
    check-cast v0, Landroid/graphics/drawable/Drawable;

    .line 357
    .line 358
    invoke-virtual {v8, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1

    .line 359
    .line 360
    .line 361
    goto :goto_6

    .line 362
    :catch_1
    move-exception v0

    .line 363
    invoke-static {v13, v0}, Lgi2;->c0(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 364
    .line 365
    .line 366
    :cond_a
    :goto_6
    invoke-virtual {v12, v8}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 367
    .line 368
    .line 369
    sget-object v0, Lmz1;->h4:Liz1;

    .line 370
    .line 371
    sget-object v4, Ltw1;->e:Ltw1;

    .line 372
    .line 373
    iget-object v4, v4, Ltw1;->c:Lkz1;

    .line 374
    .line 375
    invoke-virtual {v4, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 376
    .line 377
    .line 378
    move-result-object v0

    .line 379
    check-cast v0, Ljava/lang/CharSequence;

    .line 380
    .line 381
    invoke-virtual {v12, v0}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 382
    .line 383
    .line 384
    move-object v0, v12

    .line 385
    :cond_b
    :goto_7
    const/4 v4, -0x1

    .line 386
    if-nez v0, :cond_c

    .line 387
    .line 388
    goto :goto_9

    .line 389
    :cond_c
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 390
    .line 391
    .line 392
    move-result-object v6

    .line 393
    instance-of v6, v6, Landroid/view/ViewGroup;

    .line 394
    .line 395
    if-eqz v6, :cond_d

    .line 396
    .line 397
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 398
    .line 399
    .line 400
    move-result-object v6

    .line 401
    check-cast v6, Landroid/view/ViewGroup;

    .line 402
    .line 403
    invoke-virtual {v6, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 404
    .line 405
    .line 406
    :cond_d
    if-eqz v7, :cond_e

    .line 407
    .line 408
    invoke-virtual {v7}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 409
    .line 410
    .line 411
    invoke-virtual {v7, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 412
    .line 413
    .line 414
    goto :goto_8

    .line 415
    :cond_e
    new-instance v6, Ldd1;

    .line 416
    .line 417
    invoke-interface {v3}, Lrs2;->X0()Landroid/view/View;

    .line 418
    .line 419
    .line 420
    move-result-object v7

    .line 421
    invoke-virtual {v7}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 422
    .line 423
    .line 424
    move-result-object v7

    .line 425
    invoke-direct {v6, v7}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    .line 426
    .line 427
    .line 428
    new-instance v7, Landroid/widget/FrameLayout$LayoutParams;

    .line 429
    .line 430
    invoke-direct {v7, v4, v4}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 431
    .line 432
    .line 433
    invoke-virtual {v6, v7}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 434
    .line 435
    .line 436
    invoke-virtual {v6, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 437
    .line 438
    .line 439
    invoke-interface {v3}, Lrs2;->M0()Landroid/widget/FrameLayout;

    .line 440
    .line 441
    .line 442
    move-result-object v7

    .line 443
    if-eqz v7, :cond_f

    .line 444
    .line 445
    invoke-virtual {v7, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 446
    .line 447
    .line 448
    :cond_f
    :goto_8
    invoke-interface {v3}, Lrs2;->o()Ljava/lang/String;

    .line 449
    .line 450
    .line 451
    move-result-object v6

    .line 452
    invoke-interface {v3, v0, v6}, Lrs2;->X1(Landroid/view/View;Ljava/lang/String;)V

    .line 453
    .line 454
    .line 455
    :goto_9
    sget-object v0, Lcs2;->u:Lsn3;

    .line 456
    .line 457
    iget v6, v0, Lsn3;->i:I

    .line 458
    .line 459
    move v7, v5

    .line 460
    :cond_10
    if-ge v7, v6, :cond_11

    .line 461
    .line 462
    invoke-virtual {v0, v7}, Lsn3;->get(I)Ljava/lang/Object;

    .line 463
    .line 464
    .line 465
    move-result-object v8

    .line 466
    check-cast v8, Ljava/lang/String;

    .line 467
    .line 468
    invoke-interface {v3, v8}, Lrs2;->y3(Ljava/lang/String;)Landroid/view/View;

    .line 469
    .line 470
    .line 471
    move-result-object v8

    .line 472
    instance-of v10, v8, Landroid/view/ViewGroup;

    .line 473
    .line 474
    add-int/lit8 v7, v7, 0x1

    .line 475
    .line 476
    if-eqz v10, :cond_10

    .line 477
    .line 478
    check-cast v8, Landroid/view/ViewGroup;

    .line 479
    .line 480
    goto :goto_a

    .line 481
    :cond_11
    const/4 v8, 0x0

    .line 482
    :goto_a
    iget-object v0, v2, Lds2;->h:Ljava/util/concurrent/Executor;

    .line 483
    .line 484
    new-instance v6, Ln62;

    .line 485
    .line 486
    const/16 v7, 0x14

    .line 487
    .line 488
    invoke-direct {v6, v2, v8, v7}, Ln62;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 489
    .line 490
    .line 491
    invoke-interface {v0, v6}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 492
    .line 493
    .line 494
    if-nez v8, :cond_12

    .line 495
    .line 496
    goto/16 :goto_e

    .line 497
    .line 498
    :cond_12
    const/4 v11, 0x1

    .line 499
    invoke-virtual {v2, v8, v11}, Lds2;->c(Landroid/view/ViewGroup;Z)Z

    .line 500
    .line 501
    .line 502
    move-result v0

    .line 503
    if-eqz v0, :cond_13

    .line 504
    .line 505
    invoke-virtual {v9}, Ltr2;->h()Lag2;

    .line 506
    .line 507
    .line 508
    move-result-object v0

    .line 509
    if-eqz v0, :cond_18

    .line 510
    .line 511
    invoke-virtual {v9}, Ltr2;->h()Lag2;

    .line 512
    .line 513
    .line 514
    move-result-object v0

    .line 515
    new-instance v2, Lgw3;

    .line 516
    .line 517
    invoke-direct {v2, v3, v8}, Lgw3;-><init>(Lrs2;Landroid/view/ViewGroup;)V

    .line 518
    .line 519
    .line 520
    invoke-interface {v0, v2}, Lag2;->N(Lq12;)V

    .line 521
    .line 522
    .line 523
    goto/16 :goto_e

    .line 524
    .line 525
    :cond_13
    sget-object v0, Lmz1;->Oa:Liz1;

    .line 526
    .line 527
    sget-object v6, Ltw1;->e:Ltw1;

    .line 528
    .line 529
    iget-object v7, v6, Ltw1;->c:Lkz1;

    .line 530
    .line 531
    invoke-virtual {v7, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 532
    .line 533
    .line 534
    move-result-object v0

    .line 535
    check-cast v0, Ljava/lang/Boolean;

    .line 536
    .line 537
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 538
    .line 539
    .line 540
    move-result v0

    .line 541
    if-eqz v0, :cond_14

    .line 542
    .line 543
    invoke-virtual {v2, v8, v5}, Lds2;->c(Landroid/view/ViewGroup;Z)Z

    .line 544
    .line 545
    .line 546
    move-result v0

    .line 547
    if-eqz v0, :cond_14

    .line 548
    .line 549
    invoke-virtual {v9}, Ltr2;->i()Lag2;

    .line 550
    .line 551
    .line 552
    move-result-object v0

    .line 553
    if-eqz v0, :cond_18

    .line 554
    .line 555
    invoke-virtual {v9}, Ltr2;->i()Lag2;

    .line 556
    .line 557
    .line 558
    move-result-object v0

    .line 559
    new-instance v2, Lgw3;

    .line 560
    .line 561
    invoke-direct {v2, v3, v8}, Lgw3;-><init>(Lrs2;Landroid/view/ViewGroup;)V

    .line 562
    .line 563
    .line 564
    invoke-interface {v0, v2}, Lag2;->N(Lq12;)V

    .line 565
    .line 566
    .line 567
    goto :goto_e

    .line 568
    :cond_14
    invoke-virtual {v8}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 569
    .line 570
    .line 571
    invoke-interface {v3}, Lrs2;->X0()Landroid/view/View;

    .line 572
    .line 573
    .line 574
    move-result-object v0

    .line 575
    if-eqz v0, :cond_15

    .line 576
    .line 577
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 578
    .line 579
    .line 580
    move-result-object v0

    .line 581
    goto :goto_b

    .line 582
    :cond_15
    const/4 v0, 0x0

    .line 583
    :goto_b
    if-eqz v0, :cond_18

    .line 584
    .line 585
    iget-object v2, v2, Lds2;->j:Lrr2;

    .line 586
    .line 587
    monitor-enter v2

    .line 588
    :try_start_5
    iget-object v5, v2, Lrr2;->a:Lz12;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 589
    .line 590
    monitor-exit v2

    .line 591
    if-eqz v5, :cond_18

    .line 592
    .line 593
    :try_start_6
    invoke-interface {v5}, Lz12;->e()Lu10;

    .line 594
    .line 595
    .line 596
    move-result-object v2
    :try_end_6
    .catch Landroid/os/RemoteException; {:try_start_6 .. :try_end_6} :catch_2

    .line 597
    if-eqz v2, :cond_18

    .line 598
    .line 599
    invoke-static {v2}, Loi0;->l1(Lu10;)Ljava/lang/Object;

    .line 600
    .line 601
    .line 602
    move-result-object v2

    .line 603
    check-cast v2, Landroid/graphics/drawable/Drawable;

    .line 604
    .line 605
    if-eqz v2, :cond_18

    .line 606
    .line 607
    new-instance v5, Landroid/widget/ImageView;

    .line 608
    .line 609
    invoke-direct {v5, v0}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 610
    .line 611
    .line 612
    invoke-virtual {v5, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 613
    .line 614
    .line 615
    invoke-interface {v3}, Lrs2;->p()Lu10;

    .line 616
    .line 617
    .line 618
    move-result-object v0

    .line 619
    if-eqz v0, :cond_17

    .line 620
    .line 621
    sget-object v2, Lmz1;->B6:Liz1;

    .line 622
    .line 623
    iget-object v3, v6, Ltw1;->c:Lkz1;

    .line 624
    .line 625
    invoke-virtual {v3, v2}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 626
    .line 627
    .line 628
    move-result-object v2

    .line 629
    check-cast v2, Ljava/lang/Boolean;

    .line 630
    .line 631
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 632
    .line 633
    .line 634
    move-result v2

    .line 635
    if-nez v2, :cond_16

    .line 636
    .line 637
    goto :goto_c

    .line 638
    :cond_16
    invoke-static {v0}, Loi0;->l1(Lu10;)Ljava/lang/Object;

    .line 639
    .line 640
    .line 641
    move-result-object v0

    .line 642
    check-cast v0, Landroid/widget/ImageView$ScaleType;

    .line 643
    .line 644
    invoke-virtual {v5, v0}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 645
    .line 646
    .line 647
    goto :goto_d

    .line 648
    :cond_17
    :goto_c
    sget-object v0, Lds2;->k:Landroid/widget/ImageView$ScaleType;

    .line 649
    .line 650
    invoke-virtual {v5, v0}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 651
    .line 652
    .line 653
    :goto_d
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    .line 654
    .line 655
    invoke-direct {v0, v4, v4}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 656
    .line 657
    .line 658
    invoke-virtual {v5, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 659
    .line 660
    .line 661
    invoke-virtual {v8, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 662
    .line 663
    .line 664
    goto :goto_e

    .line 665
    :catch_2
    const-string v0, "Could not get main image drawable"

    .line 666
    .line 667
    invoke-static {v0}, Lgi2;->i0(Ljava/lang/String;)V

    .line 668
    .line 669
    .line 670
    goto :goto_e

    .line 671
    :catchall_1
    move-exception v0

    .line 672
    :try_start_7
    monitor-exit v2
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 673
    throw v0

    .line 674
    :cond_18
    :goto_e
    return-void

    .line 675
    :catchall_2
    move-exception v0

    .line 676
    :try_start_8
    monitor-exit v9
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    .line 677
    throw v0
.end method

.method private final b()V
    .locals 18

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v0, v1, Ln62;->h:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Lug0;

    .line 6
    .line 7
    iget-object v0, v0, Lug0;->g:Ljava/lang/Object;

    .line 8
    .line 9
    move-object v8, v0

    .line 10
    check-cast v8, Lmw2;

    .line 11
    .line 12
    iget-object v0, v1, Ln62;->g:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Ljava/lang/String;

    .line 15
    .line 16
    iget-object v10, v8, Lmw2;->f:Landroid/content/Context;

    .line 17
    .line 18
    const/4 v11, 0x5

    .line 19
    invoke-static {v10, v11}, Laa3;->l(Landroid/content/Context;I)Laa3;

    .line 20
    .line 21
    .line 22
    move-result-object v12

    .line 23
    invoke-interface {v12}, Laa3;->a()Laa3;

    .line 24
    .line 25
    .line 26
    :try_start_0
    new-instance v14, Ljava/util/ArrayList;

    .line 27
    .line 28
    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    .line 29
    .line 30
    .line 31
    new-instance v2, Lorg/json/JSONObject;

    .line 32
    .line 33
    invoke-direct {v2, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    const-string v0, "initializer_settings"

    .line 37
    .line 38
    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    const-string v2, "config"

    .line 43
    .line 44
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 45
    .line 46
    .line 47
    move-result-object v15

    .line 48
    invoke-virtual {v15}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    .line 49
    .line 50
    .line 51
    move-result-object v16

    .line 52
    :goto_0
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    if-eqz v0, :cond_3

    .line 57
    .line 58
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    move-object v6, v0

    .line 63
    check-cast v6, Ljava/lang/String;

    .line 64
    .line 65
    invoke-static {v10, v11}, Laa3;->l(Landroid/content/Context;I)Laa3;

    .line 66
    .line 67
    .line 68
    move-result-object v9

    .line 69
    invoke-interface {v9}, Laa3;->a()Laa3;

    .line 70
    .line 71
    .line 72
    invoke-interface {v9, v6}, Laa3;->q0(Ljava/lang/String;)Laa3;

    .line 73
    .line 74
    .line 75
    new-instance v5, Ljava/lang/Object;

    .line 76
    .line 77
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 78
    .line 79
    .line 80
    new-instance v7, Lpd2;

    .line 81
    .line 82
    invoke-direct {v7}, Lpd2;-><init>()V

    .line 83
    .line 84
    .line 85
    sget-object v0, Lmz1;->W1:Liz1;

    .line 86
    .line 87
    sget-object v2, Ltw1;->e:Ltw1;

    .line 88
    .line 89
    iget-object v2, v2, Ltw1;->c:Lkz1;

    .line 90
    .line 91
    invoke-virtual {v2, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    check-cast v0, Ljava/lang/Long;

    .line 96
    .line 97
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 98
    .line 99
    .line 100
    move-result-wide v2

    .line 101
    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 102
    .line 103
    iget-object v4, v8, Lmw2;->k:Ljava/util/concurrent/ScheduledExecutorService;

    .line 104
    .line 105
    invoke-static {v7, v2, v3, v0, v4}, Lpu1;->N(Ln70;JLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/ScheduledExecutorService;)Ln70;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    iget-object v2, v8, Lmw2;->l:Lrv2;

    .line 110
    .line 111
    invoke-virtual {v2, v6}, Lrv2;->a(Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    iget-object v2, v8, Lmw2;->o:Lkp2;

    .line 115
    .line 116
    invoke-virtual {v2, v6}, Lkp2;->l(Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    sget-object v2, Lhg4;->C:Lhg4;

    .line 120
    .line 121
    iget-object v2, v2, Lhg4;->k:Lym;

    .line 122
    .line 123
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 124
    .line 125
    .line 126
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 127
    .line 128
    .line 129
    move-result-wide v3

    .line 130
    new-instance v2, Llw2;

    .line 131
    .line 132
    invoke-direct/range {v2 .. v9}, Llw2;-><init>(JLjava/lang/Object;Ljava/lang/String;Lpd2;Lmw2;Laa3;)V

    .line 133
    .line 134
    .line 135
    iget-object v11, v8, Lmw2;->i:Ljava/util/concurrent/Executor;

    .line 136
    .line 137
    invoke-interface {v0, v2, v11}, Ln70;->c(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {v14, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 141
    .line 142
    .line 143
    new-instance v2, Ljw2;

    .line 144
    .line 145
    invoke-direct/range {v2 .. v9}, Ljw2;-><init>(JLjava/lang/Object;Ljava/lang/String;Lpd2;Lmw2;Laa3;)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {v15, v6}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    new-instance v7, Ljava/util/ArrayList;

    .line 153
    .line 154
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_1

    .line 155
    .line 156
    .line 157
    if-eqz v0, :cond_1

    .line 158
    .line 159
    :try_start_1
    const-string v3, "data"

    .line 160
    .line 161
    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    const/4 v3, 0x0

    .line 166
    :goto_1
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    .line 167
    .line 168
    .line 169
    move-result v4

    .line 170
    if-ge v3, v4, :cond_1

    .line 171
    .line 172
    invoke-virtual {v0, v3}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    .line 173
    .line 174
    .line 175
    move-result-object v4

    .line 176
    const-string v5, "format"

    .line 177
    .line 178
    const-string v9, ""

    .line 179
    .line 180
    invoke-virtual {v4, v5, v9}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object v5

    .line 184
    const-string v9, "data"

    .line 185
    .line 186
    invoke-virtual {v4, v9}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 187
    .line 188
    .line 189
    move-result-object v4

    .line 190
    new-instance v9, Landroid/os/Bundle;

    .line 191
    .line 192
    invoke-direct {v9}, Landroid/os/Bundle;-><init>()V

    .line 193
    .line 194
    .line 195
    if-eqz v4, :cond_0

    .line 196
    .line 197
    invoke-virtual {v4}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    .line 198
    .line 199
    .line 200
    move-result-object v11

    .line 201
    :goto_2
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 202
    .line 203
    .line 204
    move-result v17

    .line 205
    if-eqz v17, :cond_0

    .line 206
    .line 207
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object v17

    .line 211
    move-object/from16 v13, v17

    .line 212
    .line 213
    check-cast v13, Ljava/lang/String;

    .line 214
    .line 215
    move-object/from16 v17, v0

    .line 216
    .line 217
    const-string v0, ""

    .line 218
    .line 219
    invoke-virtual {v4, v13, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 220
    .line 221
    .line 222
    move-result-object v0

    .line 223
    invoke-virtual {v9, v13, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 224
    .line 225
    .line 226
    move-object/from16 v0, v17

    .line 227
    .line 228
    goto :goto_2

    .line 229
    :cond_0
    move-object/from16 v17, v0

    .line 230
    .line 231
    new-instance v0, Le52;

    .line 232
    .line 233
    invoke-direct {v0, v9, v5}, Le52;-><init>(Landroid/os/Bundle;Ljava/lang/String;)V

    .line 234
    .line 235
    .line 236
    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    .line 237
    .line 238
    .line 239
    add-int/lit8 v3, v3, 0x1

    .line 240
    .line 241
    move-object/from16 v0, v17

    .line 242
    .line 243
    goto :goto_1

    .line 244
    :catch_0
    :cond_1
    :try_start_2
    const-string v0, ""

    .line 245
    .line 246
    const/4 v3, 0x0

    .line 247
    invoke-virtual {v8, v6, v3, v0, v3}, Lmw2;->d(Ljava/lang/String;ILjava/lang/String;Z)V

    .line 248
    .line 249
    .line 250
    const-string v11, " "
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_1

    .line 251
    .line 252
    :try_start_3
    iget-object v0, v8, Lmw2;->h:Lyu2;

    .line 253
    .line 254
    new-instance v3, Lorg/json/JSONObject;

    .line 255
    .line 256
    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    .line 257
    .line 258
    .line 259
    invoke-virtual {v0, v6, v3}, Lyu2;->a(Ljava/lang/String;Lorg/json/JSONObject;)Lu83;

    .line 260
    .line 261
    .line 262
    move-result-object v0

    .line 263
    iget-object v13, v8, Lmw2;->j:Ljava/util/concurrent/Executor;
    :try_end_3
    .catch Ln83; {:try_start_3 .. :try_end_3} :catch_2
    .catch Lorg/json/JSONException; {:try_start_3 .. :try_end_3} :catch_1

    .line 264
    .line 265
    move-object v5, v2

    .line 266
    :try_start_4
    new-instance v2, Lea1;
    :try_end_4
    .catch Ln83; {:try_start_4 .. :try_end_4} :catch_5
    .catch Lorg/json/JSONException; {:try_start_4 .. :try_end_4} :catch_1

    .line 267
    .line 268
    move-object v3, v8

    .line 269
    const/4 v8, 0x3

    .line 270
    const/4 v9, 0x0

    .line 271
    move-object v4, v6

    .line 272
    move-object v6, v0

    .line 273
    :try_start_5
    invoke-direct/range {v2 .. v9}, Lea1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IZ)V
    :try_end_5
    .catch Ln83; {:try_start_5 .. :try_end_5} :catch_4
    .catch Lorg/json/JSONException; {:try_start_5 .. :try_end_5} :catch_3

    .line 274
    .line 275
    .line 276
    move-object v0, v2

    .line 277
    move-object v8, v3

    .line 278
    move-object v2, v5

    .line 279
    :try_start_6
    invoke-interface {v13, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_6
    .catch Ln83; {:try_start_6 .. :try_end_6} :catch_2
    .catch Lorg/json/JSONException; {:try_start_6 .. :try_end_6} :catch_1

    .line 280
    .line 281
    .line 282
    :goto_3
    const/4 v11, 0x5

    .line 283
    goto/16 :goto_0

    .line 284
    .line 285
    :catch_1
    move-exception v0

    .line 286
    goto/16 :goto_8

    .line 287
    .line 288
    :catch_2
    move-exception v0

    .line 289
    goto :goto_5

    .line 290
    :catch_3
    move-exception v0

    .line 291
    move-object v8, v3

    .line 292
    goto :goto_8

    .line 293
    :catch_4
    move-exception v0

    .line 294
    move-object v8, v3

    .line 295
    :goto_4
    move-object v2, v5

    .line 296
    goto :goto_5

    .line 297
    :catch_5
    move-exception v0

    .line 298
    goto :goto_4

    .line 299
    :goto_5
    :try_start_7
    const-string v3, "Failed to create Adapter."

    .line 300
    .line 301
    sget-object v4, Lmz1;->Od:Liz1;

    .line 302
    .line 303
    sget-object v5, Ltw1;->e:Ltw1;

    .line 304
    .line 305
    iget-object v5, v5, Ltw1;->c:Lkz1;

    .line 306
    .line 307
    invoke-virtual {v5, v4}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 308
    .line 309
    .line 310
    move-result-object v4

    .line 311
    check-cast v4, Ljava/lang/Boolean;

    .line 312
    .line 313
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 314
    .line 315
    .line 316
    move-result v4

    .line 317
    if-eqz v4, :cond_2

    .line 318
    .line 319
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 320
    .line 321
    .line 322
    move-result-object v0

    .line 323
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 324
    .line 325
    .line 326
    move-result-object v4

    .line 327
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 328
    .line 329
    .line 330
    move-result v4

    .line 331
    add-int/lit8 v4, v4, 0x1a

    .line 332
    .line 333
    new-instance v5, Ljava/lang/StringBuilder;

    .line 334
    .line 335
    invoke-direct {v5, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 336
    .line 337
    .line 338
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 339
    .line 340
    .line 341
    invoke-virtual {v5, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 342
    .line 343
    .line 344
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 345
    .line 346
    .line 347
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 348
    .line 349
    .line 350
    move-result-object v3

    .line 351
    goto :goto_6

    .line 352
    :catch_6
    move-exception v0

    .line 353
    goto :goto_7

    .line 354
    :cond_2
    :goto_6
    invoke-virtual {v2, v3}, Ljw2;->B3(Ljava/lang/String;)V
    :try_end_7
    .catch Landroid/os/RemoteException; {:try_start_7 .. :try_end_7} :catch_6
    .catch Lorg/json/JSONException; {:try_start_7 .. :try_end_7} :catch_1

    .line 355
    .line 356
    .line 357
    goto :goto_3

    .line 358
    :goto_7
    :try_start_8
    const-string v2, ""

    .line 359
    .line 360
    invoke-static {v2, v0}, Lgi2;->c0(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 361
    .line 362
    .line 363
    goto :goto_3

    .line 364
    :cond_3
    invoke-static {v14}, Lxm3;->m(Ljava/util/Collection;)Lxm3;

    .line 365
    .line 366
    .line 367
    move-result-object v0

    .line 368
    new-instance v2, Lgs1;

    .line 369
    .line 370
    const/4 v3, 0x6

    .line 371
    invoke-direct {v2, v8, v12, v3}, Lgs1;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 372
    .line 373
    .line 374
    iget-object v3, v8, Lmw2;->i:Ljava/util/concurrent/Executor;

    .line 375
    .line 376
    new-instance v4, Lcq3;

    .line 377
    .line 378
    const/4 v5, 0x0

    .line 379
    invoke-direct {v4, v0, v5, v5}, Ltp3;-><init>(Ltm3;ZZ)V

    .line 380
    .line 381
    .line 382
    new-instance v0, Lbq3;

    .line 383
    .line 384
    invoke-direct {v0, v4, v2, v3}, Lbq3;-><init>(Lcq3;Ljava/util/concurrent/Callable;Ljava/util/concurrent/Executor;)V

    .line 385
    .line 386
    .line 387
    iput-object v0, v4, Lcq3;->u:Lbq3;

    .line 388
    .line 389
    invoke-virtual {v4}, Ltp3;->v()V
    :try_end_8
    .catch Lorg/json/JSONException; {:try_start_8 .. :try_end_8} :catch_1

    .line 390
    .line 391
    .line 392
    goto :goto_a

    .line 393
    :goto_8
    invoke-static {}, Lgi2;->R()Z

    .line 394
    .line 395
    .line 396
    iget-object v2, v8, Lmw2;->o:Lkp2;

    .line 397
    .line 398
    const-string v3, "MalformedJson"

    .line 399
    .line 400
    invoke-virtual {v2, v3}, Lkp2;->J(Ljava/lang/String;)V

    .line 401
    .line 402
    .line 403
    iget-object v2, v8, Lmw2;->l:Lrv2;

    .line 404
    .line 405
    monitor-enter v2

    .line 406
    :try_start_9
    sget-object v3, Lmz1;->h2:Liz1;

    .line 407
    .line 408
    sget-object v4, Ltw1;->e:Ltw1;

    .line 409
    .line 410
    iget-object v4, v4, Ltw1;->c:Lkz1;

    .line 411
    .line 412
    invoke-virtual {v4, v3}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 413
    .line 414
    .line 415
    move-result-object v3

    .line 416
    check-cast v3, Ljava/lang/Boolean;

    .line 417
    .line 418
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 419
    .line 420
    .line 421
    move-result v3
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    .line 422
    if-nez v3, :cond_4

    .line 423
    .line 424
    monitor-exit v2

    .line 425
    goto :goto_9

    .line 426
    :cond_4
    :try_start_a
    invoke-virtual {v2}, Lrv2;->e()Ljava/util/HashMap;

    .line 427
    .line 428
    .line 429
    move-result-object v3

    .line 430
    const-string v4, "action"

    .line 431
    .line 432
    const-string v5, "aaia"

    .line 433
    .line 434
    invoke-virtual {v3, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 435
    .line 436
    .line 437
    const-string v4, "aair"

    .line 438
    .line 439
    const-string v5, "MalformedJson"

    .line 440
    .line 441
    invoke-virtual {v3, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 442
    .line 443
    .line 444
    iget-object v4, v2, Lrv2;->b:Ljava/util/ArrayList;

    .line 445
    .line 446
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    .line 447
    .line 448
    .line 449
    monitor-exit v2

    .line 450
    :goto_9
    iget-object v2, v8, Lmw2;->e:Lpd2;

    .line 451
    .line 452
    invoke-virtual {v2, v0}, Lpd2;->b(Ljava/lang/Throwable;)V

    .line 453
    .line 454
    .line 455
    const-string v2, "AdapterInitializer.updateAdapterStatus"

    .line 456
    .line 457
    sget-object v3, Lhg4;->C:Lhg4;

    .line 458
    .line 459
    iget-object v3, v3, Lhg4;->h:Lgd2;

    .line 460
    .line 461
    invoke-virtual {v3, v2, v0}, Lgd2;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 462
    .line 463
    .line 464
    iget-object v2, v8, Lmw2;->p:Lea3;

    .line 465
    .line 466
    invoke-interface {v12, v0}, Laa3;->j(Ljava/lang/Throwable;)Laa3;

    .line 467
    .line 468
    .line 469
    const/4 v3, 0x0

    .line 470
    invoke-interface {v12, v3}, Laa3;->b(Z)Laa3;

    .line 471
    .line 472
    .line 473
    invoke-interface {v12}, Laa3;->n()Lca3;

    .line 474
    .line 475
    .line 476
    move-result-object v0

    .line 477
    invoke-virtual {v2, v0}, Lea3;->b(Lca3;)V

    .line 478
    .line 479
    .line 480
    :goto_a
    return-void

    .line 481
    :catchall_0
    move-exception v0

    .line 482
    :try_start_b
    monitor-exit v2
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_0

    .line 483
    throw v0
.end method


# virtual methods
.method public final run()V
    .locals 20

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget v0, v1, Ln62;->f:I

    .line 4
    .line 5
    const/16 v2, 0x1f

    .line 6
    .line 7
    const/4 v3, 0x3

    .line 8
    const/4 v4, 0x5

    .line 9
    const/4 v5, 0x6

    .line 10
    const/4 v6, 0x2

    .line 11
    const/4 v7, 0x0

    .line 12
    const/4 v8, 0x0

    .line 13
    const/4 v9, 0x1

    .line 14
    packed-switch v0, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    iget-object v0, v1, Ln62;->h:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v0, Ld6;

    .line 20
    .line 21
    iget-object v0, v0, Ld6;->b:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v0, Lvy2;

    .line 24
    .line 25
    iget-object v10, v1, Ln62;->g:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v10, Landroid/content/Context;

    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    const-string v11, "connectivity"

    .line 33
    .line 34
    invoke-virtual {v10, v11}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v11

    .line 38
    check-cast v11, Landroid/net/ConnectivityManager;

    .line 39
    .line 40
    if-nez v11, :cond_1

    .line 41
    .line 42
    :catch_0
    :cond_0
    move v3, v8

    .line 43
    goto :goto_0

    .line 44
    :cond_1
    :try_start_0
    invoke-virtual {v11}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    .line 45
    .line 46
    .line 47
    move-result-object v11
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 48
    if-eqz v11, :cond_2

    .line 49
    .line 50
    invoke-virtual {v11}, Landroid/net/NetworkInfo;->isConnected()Z

    .line 51
    .line 52
    .line 53
    move-result v12

    .line 54
    if-nez v12, :cond_3

    .line 55
    .line 56
    :cond_2
    move v3, v9

    .line 57
    goto :goto_0

    .line 58
    :cond_3
    invoke-virtual {v11}, Landroid/net/NetworkInfo;->getType()I

    .line 59
    .line 60
    .line 61
    move-result v12

    .line 62
    const/16 v13, 0x9

    .line 63
    .line 64
    const/4 v14, 0x4

    .line 65
    if-eqz v12, :cond_7

    .line 66
    .line 67
    if-eq v12, v9, :cond_6

    .line 68
    .line 69
    if-eq v12, v14, :cond_7

    .line 70
    .line 71
    if-eq v12, v4, :cond_7

    .line 72
    .line 73
    if-eq v12, v5, :cond_5

    .line 74
    .line 75
    if-eq v12, v13, :cond_4

    .line 76
    .line 77
    const/16 v3, 0x8

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_4
    const/4 v3, 0x7

    .line 81
    goto :goto_0

    .line 82
    :cond_5
    :pswitch_0
    move v3, v4

    .line 83
    goto :goto_0

    .line 84
    :cond_6
    :pswitch_1
    move v3, v6

    .line 85
    goto :goto_0

    .line 86
    :cond_7
    invoke-virtual {v11}, Landroid/net/NetworkInfo;->getSubtype()I

    .line 87
    .line 88
    .line 89
    move-result v9

    .line 90
    packed-switch v9, :pswitch_data_1

    .line 91
    .line 92
    .line 93
    :pswitch_2
    move v3, v5

    .line 94
    goto :goto_0

    .line 95
    :pswitch_3
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 96
    .line 97
    const/16 v5, 0x1d

    .line 98
    .line 99
    if-lt v3, v5, :cond_0

    .line 100
    .line 101
    move v3, v13

    .line 102
    goto :goto_0

    .line 103
    :pswitch_4
    move v3, v14

    .line 104
    :goto_0
    :pswitch_5
    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 105
    .line 106
    if-lt v5, v2, :cond_9

    .line 107
    .line 108
    if-ne v3, v4, :cond_9

    .line 109
    .line 110
    :try_start_1
    const-string v2, "phone"

    .line 111
    .line 112
    invoke-virtual {v10, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v2

    .line 116
    check-cast v2, Landroid/telephony/TelephonyManager;

    .line 117
    .line 118
    if-eqz v2, :cond_8

    .line 119
    .line 120
    new-instance v3, Lcw2;

    .line 121
    .line 122
    invoke-direct {v3, v0}, Lcw2;-><init>(Lvy2;)V

    .line 123
    .line 124
    .line 125
    iget-object v5, v0, Lvy2;->c:Ljava/lang/Object;

    .line 126
    .line 127
    check-cast v5, Ljava/util/concurrent/Executor;

    .line 128
    .line 129
    invoke-static {v2, v5, v3}, Llb;->t(Landroid/telephony/TelephonyManager;Ljava/util/concurrent/Executor;Lcw2;)V

    .line 130
    .line 131
    .line 132
    invoke-static {v2, v3}, Llb;->u(Landroid/telephony/TelephonyManager;Lcw2;)V

    .line 133
    .line 134
    .line 135
    goto :goto_1

    .line 136
    :cond_8
    throw v7
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_1

    .line 137
    :catch_1
    invoke-virtual {v0, v4}, Lvy2;->c(I)V

    .line 138
    .line 139
    .line 140
    goto :goto_1

    .line 141
    :cond_9
    invoke-virtual {v0, v3}, Lvy2;->c(I)V

    .line 142
    .line 143
    .line 144
    :goto_1
    return-void

    .line 145
    :pswitch_6
    new-instance v0, Landroid/content/IntentFilter;

    .line 146
    .line 147
    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    .line 148
    .line 149
    .line 150
    const-string v2, "android.net.conn.CONNECTIVITY_CHANGE"

    .line 151
    .line 152
    invoke-virtual {v0, v2}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    new-instance v2, Ld6;

    .line 156
    .line 157
    iget-object v3, v1, Ln62;->h:Ljava/lang/Object;

    .line 158
    .line 159
    check-cast v3, Lvy2;

    .line 160
    .line 161
    invoke-direct {v2, v4, v3}, Ld6;-><init>(ILjava/lang/Object;)V

    .line 162
    .line 163
    .line 164
    iget-object v3, v1, Ln62;->g:Ljava/lang/Object;

    .line 165
    .line 166
    check-cast v3, Landroid/content/Context;

    .line 167
    .line 168
    invoke-virtual {v3, v2, v0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 169
    .line 170
    .line 171
    return-void

    .line 172
    :pswitch_7
    iget-object v0, v1, Ln62;->h:Ljava/lang/Object;

    .line 173
    .line 174
    check-cast v0, Lmv2;

    .line 175
    .line 176
    iget-object v2, v1, Ln62;->g:Ljava/lang/Object;

    .line 177
    .line 178
    check-cast v2, Ljava/lang/Long;

    .line 179
    .line 180
    sget-object v3, Lhg4;->C:Lhg4;

    .line 181
    .line 182
    iget-object v3, v3, Lhg4;->k:Lym;

    .line 183
    .line 184
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 185
    .line 186
    .line 187
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 188
    .line 189
    .line 190
    move-result-wide v3

    .line 191
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 192
    .line 193
    .line 194
    move-result-wide v5

    .line 195
    sub-long/2addr v3, v5

    .line 196
    const-string v2, "cld_r"

    .line 197
    .line 198
    invoke-static {v0, v2, v3, v4}, Lue;->G(Lmv2;Ljava/lang/String;J)V

    .line 199
    .line 200
    .line 201
    return-void

    .line 202
    :pswitch_8
    iget-object v0, v1, Ln62;->g:Ljava/lang/Object;

    .line 203
    .line 204
    check-cast v0, Lmn2;

    .line 205
    .line 206
    iget-object v2, v0, Lmn2;->h:Ljava/lang/Object;

    .line 207
    .line 208
    check-cast v2, Lgi4;

    .line 209
    .line 210
    :try_start_2
    iget-object v3, v0, Lmn2;->i:Ljava/lang/Object;

    .line 211
    .line 212
    check-cast v3, Lyf3;

    .line 213
    .line 214
    iget-object v4, v1, Ln62;->h:Ljava/lang/Object;

    .line 215
    .line 216
    check-cast v4, Lgi4;

    .line 217
    .line 218
    invoke-virtual {v3, v4}, Lyf3;->f(Lgi4;)Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object v3

    .line 222
    check-cast v3, Lgi4;
    :try_end_2
    .catch Lnr0; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 223
    .line 224
    if-nez v3, :cond_a

    .line 225
    .line 226
    new-instance v2, Ljava/lang/NullPointerException;

    .line 227
    .line 228
    const-string v3, "Continuation returned null"

    .line 229
    .line 230
    invoke-direct {v2, v3}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 231
    .line 232
    .line 233
    invoke-virtual {v0, v2}, Lmn2;->q(Ljava/lang/Exception;)V

    .line 234
    .line 235
    .line 236
    goto :goto_4

    .line 237
    :cond_a
    iget-object v2, v3, Lgi4;->b:Lwy0;

    .line 238
    .line 239
    sget-object v4, Lm01;->b:Lt5;

    .line 240
    .line 241
    new-instance v5, Lft3;

    .line 242
    .line 243
    invoke-direct {v5, v4, v0, v9}, Lft3;-><init>(Ljava/util/concurrent/Executor;Lmn2;I)V

    .line 244
    .line 245
    .line 246
    invoke-virtual {v2, v5}, Lwy0;->c(Lje4;)V

    .line 247
    .line 248
    .line 249
    invoke-virtual {v3}, Lgi4;->h()V

    .line 250
    .line 251
    .line 252
    new-instance v5, Lmn2;

    .line 253
    .line 254
    invoke-direct {v5, v4, v0}, Lmn2;-><init>(Ljava/util/concurrent/Executor;Lgj0;)V

    .line 255
    .line 256
    .line 257
    invoke-virtual {v2, v5}, Lwy0;->c(Lje4;)V

    .line 258
    .line 259
    .line 260
    invoke-virtual {v3}, Lgi4;->h()V

    .line 261
    .line 262
    .line 263
    new-instance v5, Lft3;

    .line 264
    .line 265
    invoke-direct {v5, v4, v0, v8}, Lft3;-><init>(Ljava/util/concurrent/Executor;Lmn2;I)V

    .line 266
    .line 267
    .line 268
    invoke-virtual {v2, v5}, Lwy0;->c(Lje4;)V

    .line 269
    .line 270
    .line 271
    invoke-virtual {v3}, Lgi4;->h()V

    .line 272
    .line 273
    .line 274
    goto :goto_4

    .line 275
    :catch_2
    move-exception v0

    .line 276
    goto :goto_2

    .line 277
    :catch_3
    move-exception v0

    .line 278
    goto :goto_3

    .line 279
    :goto_2
    invoke-virtual {v2, v0}, Lgi4;->d(Ljava/lang/Exception;)V

    .line 280
    .line 281
    .line 282
    goto :goto_4

    .line 283
    :goto_3
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 284
    .line 285
    .line 286
    move-result-object v3

    .line 287
    instance-of v3, v3, Ljava/lang/Exception;

    .line 288
    .line 289
    if-eqz v3, :cond_b

    .line 290
    .line 291
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 292
    .line 293
    .line 294
    move-result-object v0

    .line 295
    check-cast v0, Ljava/lang/Exception;

    .line 296
    .line 297
    invoke-virtual {v2, v0}, Lgi4;->d(Ljava/lang/Exception;)V

    .line 298
    .line 299
    .line 300
    goto :goto_4

    .line 301
    :cond_b
    invoke-virtual {v2, v0}, Lgi4;->d(Ljava/lang/Exception;)V

    .line 302
    .line 303
    .line 304
    :goto_4
    return-void

    .line 305
    :pswitch_9
    iget-object v0, v1, Ln62;->h:Ljava/lang/Object;

    .line 306
    .line 307
    check-cast v0, Lix2;

    .line 308
    .line 309
    iget-object v2, v1, Ln62;->g:Ljava/lang/Object;

    .line 310
    .line 311
    check-cast v2, Landroid/content/Context;

    .line 312
    .line 313
    iget-object v0, v0, Lix2;->g:Lmv2;

    .line 314
    .line 315
    sget-object v3, Lhg4;->C:Lhg4;

    .line 316
    .line 317
    iget-object v3, v3, Lhg4;->n:Lxz1;

    .line 318
    .line 319
    iget-object v4, v3, Lxz1;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 320
    .line 321
    invoke-virtual {v4, v9}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    .line 322
    .line 323
    .line 324
    move-result v4

    .line 325
    if-eqz v4, :cond_c

    .line 326
    .line 327
    goto :goto_5

    .line 328
    :cond_c
    iput-object v2, v3, Lxz1;->c:Landroid/content/Context;

    .line 329
    .line 330
    iput-object v0, v3, Lxz1;->d:Lmv2;

    .line 331
    .line 332
    iget-object v0, v3, Lxz1;->f:Lsl;

    .line 333
    .line 334
    if-nez v0, :cond_e

    .line 335
    .line 336
    invoke-static {v2}, Lsl;->a(Landroid/content/Context;)Ljava/lang/String;

    .line 337
    .line 338
    .line 339
    move-result-object v0

    .line 340
    if-eqz v0, :cond_e

    .line 341
    .line 342
    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 343
    .line 344
    .line 345
    move-result-object v4

    .line 346
    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 347
    .line 348
    .line 349
    move-result v4

    .line 350
    if-nez v4, :cond_e

    .line 351
    .line 352
    invoke-virtual {v2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 353
    .line 354
    .line 355
    move-result-object v4

    .line 356
    iput-object v4, v3, Ltl;->a:Landroid/content/Context;

    .line 357
    .line 358
    new-instance v4, Landroid/content/Intent;

    .line 359
    .line 360
    const-string v5, "android.support.customtabs.action.CustomTabsService"

    .line 361
    .line 362
    invoke-direct {v4, v5}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 363
    .line 364
    .line 365
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 366
    .line 367
    .line 368
    move-result v5

    .line 369
    if-nez v5, :cond_d

    .line 370
    .line 371
    invoke-virtual {v4, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 372
    .line 373
    .line 374
    :cond_d
    const/16 v0, 0x21

    .line 375
    .line 376
    invoke-virtual {v2, v4, v3, v0}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    .line 377
    .line 378
    .line 379
    :cond_e
    :goto_5
    return-void

    .line 380
    :pswitch_a
    iget-object v0, v1, Ln62;->g:Ljava/lang/Object;

    .line 381
    .line 382
    check-cast v0, Ld52;

    .line 383
    .line 384
    iget-object v2, v1, Ln62;->h:Ljava/lang/Object;

    .line 385
    .line 386
    check-cast v2, Lmw2;

    .line 387
    .line 388
    :try_start_3
    invoke-virtual {v2}, Lmw2;->b()Ljava/util/ArrayList;

    .line 389
    .line 390
    .line 391
    move-result-object v2

    .line 392
    invoke-interface {v0, v2}, Ld52;->Q1(Ljava/util/List;)V
    :try_end_3
    .catch Landroid/os/RemoteException; {:try_start_3 .. :try_end_3} :catch_4

    .line 393
    .line 394
    .line 395
    goto :goto_6

    .line 396
    :catch_4
    move-exception v0

    .line 397
    const-string v2, ""

    .line 398
    .line 399
    invoke-static {v2, v0}, Lgi2;->c0(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 400
    .line 401
    .line 402
    :goto_6
    return-void

    .line 403
    :pswitch_b
    iget-object v0, v1, Ln62;->h:Ljava/lang/Object;

    .line 404
    .line 405
    check-cast v0, Lmw2;

    .line 406
    .line 407
    iget-object v2, v1, Ln62;->g:Ljava/lang/Object;

    .line 408
    .line 409
    check-cast v2, Lpd2;

    .line 410
    .line 411
    new-instance v3, Lbs2;

    .line 412
    .line 413
    invoke-direct {v3, v6, v2}, Lbs2;-><init>(ILjava/lang/Object;)V

    .line 414
    .line 415
    .line 416
    iget-object v0, v0, Lmw2;->i:Ljava/util/concurrent/Executor;

    .line 417
    .line 418
    invoke-interface {v0, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 419
    .line 420
    .line 421
    return-void

    .line 422
    :pswitch_c
    invoke-direct {v1}, Ln62;->b()V

    .line 423
    .line 424
    .line 425
    return-void

    .line 426
    :pswitch_d
    invoke-direct {v1}, Ln62;->a()V

    .line 427
    .line 428
    .line 429
    return-void

    .line 430
    :pswitch_e
    iget-object v0, v1, Ln62;->h:Ljava/lang/Object;

    .line 431
    .line 432
    check-cast v0, Lds2;

    .line 433
    .line 434
    iget-object v2, v1, Ln62;->g:Ljava/lang/Object;

    .line 435
    .line 436
    check-cast v2, Landroid/view/ViewGroup;

    .line 437
    .line 438
    iget-object v3, v0, Lds2;->b:Ll83;

    .line 439
    .line 440
    iget-object v4, v0, Lds2;->a:Lra4;

    .line 441
    .line 442
    iget-object v7, v0, Lds2;->d:Ltr2;

    .line 443
    .line 444
    monitor-enter v7

    .line 445
    :try_start_4
    iget-object v0, v7, Ltr2;->o:Landroid/view/View;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 446
    .line 447
    monitor-exit v7

    .line 448
    if-eqz v0, :cond_12

    .line 449
    .line 450
    if-eqz v2, :cond_f

    .line 451
    .line 452
    move v8, v9

    .line 453
    :cond_f
    invoke-virtual {v7}, Ltr2;->q()I

    .line 454
    .line 455
    .line 456
    move-result v0

    .line 457
    if-eq v0, v6, :cond_11

    .line 458
    .line 459
    invoke-virtual {v7}, Ltr2;->q()I

    .line 460
    .line 461
    .line 462
    move-result v0

    .line 463
    if-ne v0, v9, :cond_10

    .line 464
    .line 465
    goto :goto_7

    .line 466
    :cond_10
    invoke-virtual {v7}, Ltr2;->q()I

    .line 467
    .line 468
    .line 469
    move-result v0

    .line 470
    if-ne v0, v5, :cond_12

    .line 471
    .line 472
    iget-object v0, v3, Ll83;->g:Ljava/lang/String;

    .line 473
    .line 474
    const-string v2, "2"

    .line 475
    .line 476
    invoke-virtual {v4, v0, v2, v8}, Lra4;->o(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 477
    .line 478
    .line 479
    const-string v2, "1"

    .line 480
    .line 481
    invoke-virtual {v4, v0, v2, v8}, Lra4;->o(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 482
    .line 483
    .line 484
    goto :goto_8

    .line 485
    :cond_11
    :goto_7
    invoke-virtual {v7}, Ltr2;->q()I

    .line 486
    .line 487
    .line 488
    move-result v0

    .line 489
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 490
    .line 491
    .line 492
    move-result-object v0

    .line 493
    iget-object v2, v3, Ll83;->g:Ljava/lang/String;

    .line 494
    .line 495
    invoke-virtual {v4, v2, v0, v8}, Lra4;->o(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 496
    .line 497
    .line 498
    :cond_12
    :goto_8
    return-void

    .line 499
    :catchall_0
    move-exception v0

    .line 500
    :try_start_5
    monitor-exit v7
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 501
    throw v0

    .line 502
    :pswitch_f
    iget-object v0, v1, Ln62;->h:Ljava/lang/Object;

    .line 503
    .line 504
    check-cast v0, Ldp2;

    .line 505
    .line 506
    iget-object v2, v1, Ln62;->g:Ljava/lang/Object;

    .line 507
    .line 508
    :try_start_6
    invoke-interface {v0, v2}, Ldp2;->c(Ljava/lang/Object;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 509
    .line 510
    .line 511
    goto :goto_9

    .line 512
    :catchall_1
    move-exception v0

    .line 513
    const-string v2, "EventEmitter.notify"

    .line 514
    .line 515
    sget-object v3, Lhg4;->C:Lhg4;

    .line 516
    .line 517
    iget-object v3, v3, Lhg4;->h:Lgd2;

    .line 518
    .line 519
    invoke-virtual {v3, v2, v0}, Lgd2;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 520
    .line 521
    .line 522
    invoke-static {}, Lgi2;->R()Z

    .line 523
    .line 524
    .line 525
    :goto_9
    return-void

    .line 526
    :pswitch_10
    iget-object v0, v1, Ln62;->g:Ljava/lang/Object;

    .line 527
    .line 528
    check-cast v0, Lb3;

    .line 529
    .line 530
    iget-object v2, v1, Ln62;->h:Ljava/lang/Object;

    .line 531
    .line 532
    check-cast v2, Lr9;

    .line 533
    .line 534
    :try_start_7
    iget-object v3, v2, Lr9;->f:Le23;

    .line 535
    .line 536
    iget-object v0, v0, Lb3;->a:Le13;

    .line 537
    .line 538
    invoke-virtual {v3, v0}, Le23;->b(Le13;)V
    :try_end_7
    .catch Ljava/lang/IllegalStateException; {:try_start_7 .. :try_end_7} :catch_5

    .line 539
    .line 540
    .line 541
    goto :goto_a

    .line 542
    :catch_5
    move-exception v0

    .line 543
    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 544
    .line 545
    .line 546
    move-result-object v2

    .line 547
    invoke-static {v2}, Lr92;->a(Landroid/content/Context;)Ls92;

    .line 548
    .line 549
    .line 550
    move-result-object v2

    .line 551
    const-string v3, "BaseAdView.loadAd"

    .line 552
    .line 553
    invoke-interface {v2, v3, v0}, Ls92;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 554
    .line 555
    .line 556
    :goto_a
    return-void

    .line 557
    :pswitch_11
    iget-object v0, v1, Ln62;->h:Ljava/lang/Object;

    .line 558
    .line 559
    check-cast v0, Lfw3;

    .line 560
    .line 561
    iget-object v2, v1, Ln62;->g:Ljava/lang/Object;

    .line 562
    .line 563
    check-cast v2, Lna4;

    .line 564
    .line 565
    iget-object v3, v0, Lfw3;->k:Ljava/lang/Object;

    .line 566
    .line 567
    invoke-virtual {v2, v3}, Lna4;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 568
    .line 569
    .line 570
    move-result-object v2

    .line 571
    iput-object v2, v0, Lfw3;->k:Ljava/lang/Object;

    .line 572
    .line 573
    new-instance v3, Ln62;

    .line 574
    .line 575
    const/16 v4, 0x10

    .line 576
    .line 577
    invoke-direct {v3, v0, v2, v4}, Ln62;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 578
    .line 579
    .line 580
    iget-object v0, v0, Lfw3;->h:Ljava/lang/Object;

    .line 581
    .line 582
    check-cast v0, Ld13;

    .line 583
    .line 584
    iget-object v2, v0, Ld13;->a:Landroid/os/Handler;

    .line 585
    .line 586
    invoke-virtual {v2}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 587
    .line 588
    .line 589
    move-result-object v2

    .line 590
    invoke-virtual {v2}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 591
    .line 592
    .line 593
    move-result-object v2

    .line 594
    invoke-virtual {v2}, Ljava/lang/Thread;->isAlive()Z

    .line 595
    .line 596
    .line 597
    move-result v2

    .line 598
    if-nez v2, :cond_13

    .line 599
    .line 600
    goto :goto_b

    .line 601
    :cond_13
    invoke-virtual {v0, v3}, Ld13;->d(Ljava/lang/Runnable;)Z

    .line 602
    .line 603
    .line 604
    :goto_b
    return-void

    .line 605
    :pswitch_12
    iget-object v0, v1, Ln62;->h:Ljava/lang/Object;

    .line 606
    .line 607
    check-cast v0, Lfw3;

    .line 608
    .line 609
    iget-object v2, v1, Ln62;->g:Ljava/lang/Object;

    .line 610
    .line 611
    iget v3, v0, Lfw3;->f:I

    .line 612
    .line 613
    add-int/lit8 v3, v3, -0x1

    .line 614
    .line 615
    iput v3, v0, Lfw3;->f:I

    .line 616
    .line 617
    if-nez v3, :cond_14

    .line 618
    .line 619
    invoke-virtual {v0, v2}, Lfw3;->z(Ljava/lang/Object;)V

    .line 620
    .line 621
    .line 622
    :cond_14
    return-void

    .line 623
    :pswitch_13
    iget-object v0, v1, Ln62;->h:Ljava/lang/Object;

    .line 624
    .line 625
    check-cast v0, Lfw3;

    .line 626
    .line 627
    iget-object v2, v1, Ln62;->g:Ljava/lang/Object;

    .line 628
    .line 629
    check-cast v2, Ljava/lang/Integer;

    .line 630
    .line 631
    iget v3, v0, Lfw3;->f:I

    .line 632
    .line 633
    if-nez v3, :cond_15

    .line 634
    .line 635
    invoke-virtual {v0, v2}, Lfw3;->z(Ljava/lang/Object;)V

    .line 636
    .line 637
    .line 638
    :cond_15
    return-void

    .line 639
    :pswitch_14
    iget-object v0, v1, Ln62;->h:Ljava/lang/Object;

    .line 640
    .line 641
    check-cast v0, Lzj2;

    .line 642
    .line 643
    iget-object v3, v1, Ln62;->g:Ljava/lang/Object;

    .line 644
    .line 645
    check-cast v3, Lorg/json/JSONObject;

    .line 646
    .line 647
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 648
    .line 649
    .line 650
    move-result-object v4

    .line 651
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 652
    .line 653
    .line 654
    move-result v5

    .line 655
    new-instance v6, Ljava/lang/StringBuilder;

    .line 656
    .line 657
    add-int/2addr v5, v2

    .line 658
    invoke-direct {v6, v5}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 659
    .line 660
    .line 661
    const-string v2, "Calling AFMA_updateActiveView("

    .line 662
    .line 663
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 664
    .line 665
    .line 666
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 667
    .line 668
    .line 669
    const-string v2, ")"

    .line 670
    .line 671
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 672
    .line 673
    .line 674
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 675
    .line 676
    .line 677
    move-result-object v2

    .line 678
    invoke-static {v2}, Lgi2;->U(Ljava/lang/String;)V

    .line 679
    .line 680
    .line 681
    iget-object v0, v0, Lzj2;->f:Lag2;

    .line 682
    .line 683
    const-string v2, "AFMA_updateActiveView"

    .line 684
    .line 685
    invoke-interface {v0, v2, v3}, Lr52;->b(Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 686
    .line 687
    .line 688
    return-void

    .line 689
    :pswitch_15
    iget-object v0, v1, Ln62;->h:Ljava/lang/Object;

    .line 690
    .line 691
    check-cast v0, Lrg2;

    .line 692
    .line 693
    iget-object v2, v1, Ln62;->g:Ljava/lang/Object;

    .line 694
    .line 695
    check-cast v2, Ljava/lang/String;

    .line 696
    .line 697
    iget-object v0, v0, Lrg2;->a:Lkf3;

    .line 698
    .line 699
    invoke-static {v2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 700
    .line 701
    .line 702
    move-result-object v2

    .line 703
    iget-object v0, v0, Lkf3;->g:Ljava/lang/Object;

    .line 704
    .line 705
    check-cast v0, Log2;

    .line 706
    .line 707
    iget-object v0, v0, Log2;->s:Lsg2;

    .line 708
    .line 709
    if-nez v0, :cond_16

    .line 710
    .line 711
    const-string v0, "Unable to pass GMSG, no AdWebViewClient for AdWebView!"

    .line 712
    .line 713
    invoke-static {v0}, Lgi2;->Z(Ljava/lang/String;)V

    .line 714
    .line 715
    .line 716
    goto :goto_c

    .line 717
    :cond_16
    invoke-virtual {v0, v2}, Lsg2;->l(Landroid/net/Uri;)V

    .line 718
    .line 719
    .line 720
    :goto_c
    return-void

    .line 721
    :pswitch_16
    iget-object v0, v1, Ln62;->h:Ljava/lang/Object;

    .line 722
    .line 723
    check-cast v0, Lqg2;

    .line 724
    .line 725
    iget-object v2, v1, Ln62;->g:Ljava/lang/Object;

    .line 726
    .line 727
    check-cast v2, Ljava/util/HashMap;

    .line 728
    .line 729
    iget-object v0, v0, Lqg2;->f:Lag2;

    .line 730
    .line 731
    const-string v3, "pubVideoCmd"

    .line 732
    .line 733
    invoke-interface {v0, v3, v2}, Ll52;->a(Ljava/lang/String;Ljava/util/Map;)V

    .line 734
    .line 735
    .line 736
    return-void

    .line 737
    :pswitch_17
    iget-object v0, v1, Ln62;->h:Ljava/lang/Object;

    .line 738
    .line 739
    check-cast v0, Log2;

    .line 740
    .line 741
    iget-object v2, v1, Ln62;->g:Ljava/lang/Object;

    .line 742
    .line 743
    check-cast v2, Ljava/lang/String;

    .line 744
    .line 745
    invoke-virtual {v0, v2}, Log2;->S(Ljava/lang/String;)V

    .line 746
    .line 747
    .line 748
    return-void

    .line 749
    :pswitch_18
    new-instance v0, Lf23;

    .line 750
    .line 751
    iget-object v2, v1, Ln62;->h:Ljava/lang/Object;

    .line 752
    .line 753
    check-cast v2, Ljg2;

    .line 754
    .line 755
    const/16 v3, 0x12

    .line 756
    .line 757
    invoke-direct {v0, v3, v2}, Lf23;-><init>(ILjava/lang/Object;)V

    .line 758
    .line 759
    .line 760
    iget-object v2, v1, Ln62;->g:Ljava/lang/Object;

    .line 761
    .line 762
    check-cast v2, Lwz2;

    .line 763
    .line 764
    monitor-enter v2

    .line 765
    :try_start_8
    iget-object v3, v2, Lwz2;->f:Lcc3;

    .line 766
    .line 767
    if-eqz v3, :cond_17

    .line 768
    .line 769
    iget-object v4, v2, Lwz2;->d:Lag2;

    .line 770
    .line 771
    if-eqz v4, :cond_17

    .line 772
    .line 773
    sget-object v5, Lhg4;->C:Lhg4;

    .line 774
    .line 775
    iget-object v5, v5, Lhg4;->x:Lsu2;

    .line 776
    .line 777
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 778
    .line 779
    .line 780
    new-instance v5, Lsz2;

    .line 781
    .line 782
    invoke-direct {v5, v3, v0, v8}, Lsz2;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 783
    .line 784
    .line 785
    invoke-static {v5}, Lsu2;->t(Ljava/lang/Runnable;)V

    .line 786
    .line 787
    .line 788
    iput-object v7, v2, Lwz2;->f:Lcc3;

    .line 789
    .line 790
    invoke-interface {v4, v7}, Lag2;->G(Lwz2;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    .line 791
    .line 792
    .line 793
    :cond_17
    monitor-exit v2

    .line 794
    goto :goto_d

    .line 795
    :catchall_2
    move-exception v0

    .line 796
    goto :goto_e

    .line 797
    :goto_d
    return-void

    .line 798
    :goto_e
    :try_start_9
    monitor-exit v2
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    .line 799
    throw v0

    .line 800
    :pswitch_19
    sget-object v0, Lsf2;->z:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 801
    .line 802
    iget-object v0, v1, Ln62;->h:Ljava/lang/Object;

    .line 803
    .line 804
    check-cast v0, Lag2;

    .line 805
    .line 806
    const-string v2, "onGcacheInfoEvent"

    .line 807
    .line 808
    iget-object v3, v1, Ln62;->g:Ljava/lang/Object;

    .line 809
    .line 810
    check-cast v3, Ljava/util/HashMap;

    .line 811
    .line 812
    invoke-interface {v0, v2, v3}, Ll52;->a(Ljava/lang/String;Ljava/util/Map;)V

    .line 813
    .line 814
    .line 815
    return-void

    .line 816
    :pswitch_1a
    iget-object v0, v1, Ln62;->g:Ljava/lang/Object;

    .line 817
    .line 818
    move-object v2, v0

    .line 819
    check-cast v2, Lyd2;

    .line 820
    .line 821
    iget-object v0, v1, Ln62;->h:Ljava/lang/Object;

    .line 822
    .line 823
    check-cast v0, Landroid/media/MediaPlayer;

    .line 824
    .line 825
    const-string v3, "height"

    .line 826
    .line 827
    const-string v4, "width"

    .line 828
    .line 829
    const-string v5, "bitrate"

    .line 830
    .line 831
    const-string v7, "frameRate"

    .line 832
    .line 833
    iget-object v10, v2, Lyd2;->h:Lag2;

    .line 834
    .line 835
    const-string v11, "frame-rate"

    .line 836
    .line 837
    const-string v12, "codecs-string"

    .line 838
    .line 839
    const-string v13, "mime"

    .line 840
    .line 841
    sget-object v14, Lmz1;->Y1:Liz1;

    .line 842
    .line 843
    sget-object v15, Ltw1;->e:Ltw1;

    .line 844
    .line 845
    iget-object v15, v15, Ltw1;->c:Lkz1;

    .line 846
    .line 847
    invoke-virtual {v15, v14}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 848
    .line 849
    .line 850
    move-result-object v14

    .line 851
    check-cast v14, Ljava/lang/Boolean;

    .line 852
    .line 853
    invoke-virtual {v14}, Ljava/lang/Boolean;->booleanValue()Z

    .line 854
    .line 855
    .line 856
    move-result v14

    .line 857
    if-eqz v14, :cond_24

    .line 858
    .line 859
    if-eqz v10, :cond_24

    .line 860
    .line 861
    if-nez v0, :cond_18

    .line 862
    .line 863
    goto/16 :goto_14

    .line 864
    .line 865
    :cond_18
    :try_start_a
    invoke-virtual {v0}, Landroid/media/MediaPlayer;->getTrackInfo()[Landroid/media/MediaPlayer$TrackInfo;

    .line 866
    .line 867
    .line 868
    move-result-object v0
    :try_end_a
    .catch Ljava/lang/RuntimeException; {:try_start_a .. :try_end_a} :catch_7

    .line 869
    if-eqz v0, :cond_24

    .line 870
    .line 871
    new-instance v14, Ljava/util/HashMap;

    .line 872
    .line 873
    invoke-direct {v14}, Ljava/util/HashMap;-><init>()V

    .line 874
    .line 875
    .line 876
    :goto_f
    array-length v15, v0

    .line 877
    if-ge v8, v15, :cond_23

    .line 878
    .line 879
    aget-object v15, v0, v8

    .line 880
    .line 881
    if-nez v15, :cond_1a

    .line 882
    .line 883
    move-object/from16 v16, v0

    .line 884
    .line 885
    :cond_19
    :goto_10
    move-object/from16 v19, v3

    .line 886
    .line 887
    goto/16 :goto_13

    .line 888
    .line 889
    :cond_1a
    invoke-virtual {v15}, Landroid/media/MediaPlayer$TrackInfo;->getTrackType()I

    .line 890
    .line 891
    .line 892
    move-result v6

    .line 893
    move-object/from16 v16, v0

    .line 894
    .line 895
    const/16 v0, 0x1e

    .line 896
    .line 897
    if-eq v6, v9, :cond_1d

    .line 898
    .line 899
    const/4 v9, 0x2

    .line 900
    if-eq v6, v9, :cond_1b

    .line 901
    .line 902
    goto :goto_10

    .line 903
    :cond_1b
    invoke-virtual {v15}, Landroid/media/MediaPlayer$TrackInfo;->getFormat()Landroid/media/MediaFormat;

    .line 904
    .line 905
    .line 906
    move-result-object v6

    .line 907
    if-eqz v6, :cond_19

    .line 908
    .line 909
    invoke-virtual {v6, v13}, Landroid/media/MediaFormat;->containsKey(Ljava/lang/String;)Z

    .line 910
    .line 911
    .line 912
    move-result v9

    .line 913
    if-eqz v9, :cond_1c

    .line 914
    .line 915
    invoke-virtual {v6, v13}, Landroid/media/MediaFormat;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 916
    .line 917
    .line 918
    move-result-object v9

    .line 919
    const-string v15, "audioMime"

    .line 920
    .line 921
    invoke-virtual {v14, v15, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 922
    .line 923
    .line 924
    :cond_1c
    sget v9, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 925
    .line 926
    if-lt v9, v0, :cond_19

    .line 927
    .line 928
    invoke-virtual {v6, v12}, Landroid/media/MediaFormat;->containsKey(Ljava/lang/String;)Z

    .line 929
    .line 930
    .line 931
    move-result v0

    .line 932
    if-eqz v0, :cond_19

    .line 933
    .line 934
    invoke-virtual {v6, v12}, Landroid/media/MediaFormat;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 935
    .line 936
    .line 937
    move-result-object v0

    .line 938
    const-string v6, "audioCodec"

    .line 939
    .line 940
    invoke-virtual {v14, v6, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 941
    .line 942
    .line 943
    goto :goto_10

    .line 944
    :cond_1d
    invoke-virtual {v15}, Landroid/media/MediaPlayer$TrackInfo;->getFormat()Landroid/media/MediaFormat;

    .line 945
    .line 946
    .line 947
    move-result-object v6

    .line 948
    if-eqz v6, :cond_19

    .line 949
    .line 950
    invoke-virtual {v6, v11}, Landroid/media/MediaFormat;->containsKey(Ljava/lang/String;)Z

    .line 951
    .line 952
    .line 953
    move-result v9

    .line 954
    if-eqz v9, :cond_1e

    .line 955
    .line 956
    :try_start_b
    invoke-virtual {v6, v11}, Landroid/media/MediaFormat;->getFloat(Ljava/lang/String;)F

    .line 957
    .line 958
    .line 959
    move-result v9

    .line 960
    invoke-static {v9}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    .line 961
    .line 962
    .line 963
    move-result-object v9

    .line 964
    invoke-virtual {v14, v7, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_b
    .catch Ljava/lang/ClassCastException; {:try_start_b .. :try_end_b} :catch_6

    .line 965
    .line 966
    .line 967
    goto :goto_11

    .line 968
    :catch_6
    invoke-virtual {v6, v11}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    .line 969
    .line 970
    .line 971
    move-result v9

    .line 972
    invoke-static {v9}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 973
    .line 974
    .line 975
    move-result-object v9

    .line 976
    invoke-virtual {v14, v7, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 977
    .line 978
    .line 979
    :cond_1e
    :goto_11
    invoke-virtual {v6, v5}, Landroid/media/MediaFormat;->containsKey(Ljava/lang/String;)Z

    .line 980
    .line 981
    .line 982
    move-result v9

    .line 983
    if-eqz v9, :cond_1f

    .line 984
    .line 985
    invoke-virtual {v6, v5}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    .line 986
    .line 987
    .line 988
    move-result v9

    .line 989
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 990
    .line 991
    .line 992
    move-result-object v9

    .line 993
    iput-object v9, v2, Lyd2;->x:Ljava/lang/Integer;

    .line 994
    .line 995
    invoke-static {v9}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 996
    .line 997
    .line 998
    move-result-object v9

    .line 999
    const-string v15, "bitRate"

    .line 1000
    .line 1001
    invoke-virtual {v14, v15, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1002
    .line 1003
    .line 1004
    :cond_1f
    invoke-virtual {v6, v4}, Landroid/media/MediaFormat;->containsKey(Ljava/lang/String;)Z

    .line 1005
    .line 1006
    .line 1007
    move-result v9

    .line 1008
    if-eqz v9, :cond_20

    .line 1009
    .line 1010
    invoke-virtual {v6, v3}, Landroid/media/MediaFormat;->containsKey(Ljava/lang/String;)Z

    .line 1011
    .line 1012
    .line 1013
    move-result v9

    .line 1014
    if-eqz v9, :cond_20

    .line 1015
    .line 1016
    invoke-virtual {v6, v4}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    .line 1017
    .line 1018
    .line 1019
    move-result v9

    .line 1020
    invoke-virtual {v6, v3}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    .line 1021
    .line 1022
    .line 1023
    move-result v15

    .line 1024
    const/4 v0, 0x1

    .line 1025
    invoke-static {v9, v0}, Lga1;->f(II)I

    .line 1026
    .line 1027
    .line 1028
    move-result v17

    .line 1029
    invoke-static {v15}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 1030
    .line 1031
    .line 1032
    move-result-object v0

    .line 1033
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 1034
    .line 1035
    .line 1036
    move-result v0

    .line 1037
    move/from16 v18, v0

    .line 1038
    .line 1039
    new-instance v0, Ljava/lang/StringBuilder;

    .line 1040
    .line 1041
    move-object/from16 v19, v3

    .line 1042
    .line 1043
    add-int v3, v17, v18

    .line 1044
    .line 1045
    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 1046
    .line 1047
    .line 1048
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1049
    .line 1050
    .line 1051
    const-string v3, "x"

    .line 1052
    .line 1053
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1054
    .line 1055
    .line 1056
    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1057
    .line 1058
    .line 1059
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1060
    .line 1061
    .line 1062
    move-result-object v0

    .line 1063
    const-string v3, "resolution"

    .line 1064
    .line 1065
    invoke-virtual {v14, v3, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1066
    .line 1067
    .line 1068
    goto :goto_12

    .line 1069
    :cond_20
    move-object/from16 v19, v3

    .line 1070
    .line 1071
    :goto_12
    invoke-virtual {v6, v13}, Landroid/media/MediaFormat;->containsKey(Ljava/lang/String;)Z

    .line 1072
    .line 1073
    .line 1074
    move-result v0

    .line 1075
    if-eqz v0, :cond_21

    .line 1076
    .line 1077
    invoke-virtual {v6, v13}, Landroid/media/MediaFormat;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 1078
    .line 1079
    .line 1080
    move-result-object v0

    .line 1081
    const-string v3, "videoMime"

    .line 1082
    .line 1083
    invoke-virtual {v14, v3, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1084
    .line 1085
    .line 1086
    :cond_21
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 1087
    .line 1088
    const/16 v3, 0x1e

    .line 1089
    .line 1090
    if-lt v0, v3, :cond_22

    .line 1091
    .line 1092
    invoke-virtual {v6, v12}, Landroid/media/MediaFormat;->containsKey(Ljava/lang/String;)Z

    .line 1093
    .line 1094
    .line 1095
    move-result v0

    .line 1096
    if-eqz v0, :cond_22

    .line 1097
    .line 1098
    invoke-virtual {v6, v12}, Landroid/media/MediaFormat;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 1099
    .line 1100
    .line 1101
    move-result-object v0

    .line 1102
    const-string v3, "videoCodec"

    .line 1103
    .line 1104
    invoke-virtual {v14, v3, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1105
    .line 1106
    .line 1107
    :cond_22
    :goto_13
    add-int/lit8 v8, v8, 0x1

    .line 1108
    .line 1109
    move-object/from16 v0, v16

    .line 1110
    .line 1111
    move-object/from16 v3, v19

    .line 1112
    .line 1113
    const/4 v6, 0x2

    .line 1114
    const/4 v9, 0x1

    .line 1115
    goto/16 :goto_f

    .line 1116
    .line 1117
    :cond_23
    invoke-virtual {v14}, Ljava/util/HashMap;->isEmpty()Z

    .line 1118
    .line 1119
    .line 1120
    move-result v0

    .line 1121
    if-nez v0, :cond_24

    .line 1122
    .line 1123
    const-string v0, "onMetadataEvent"

    .line 1124
    .line 1125
    invoke-interface {v10, v0, v14}, Ll52;->a(Ljava/lang/String;Ljava/util/Map;)V

    .line 1126
    .line 1127
    .line 1128
    goto :goto_14

    .line 1129
    :catch_7
    move-exception v0

    .line 1130
    const-string v3, "AdMediaPlayerView.reportMetadata"

    .line 1131
    .line 1132
    sget-object v4, Lhg4;->C:Lhg4;

    .line 1133
    .line 1134
    iget-object v4, v4, Lhg4;->h:Lgd2;

    .line 1135
    .line 1136
    invoke-virtual {v4, v3, v0}, Lgd2;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1137
    .line 1138
    .line 1139
    :cond_24
    :goto_14
    iget-object v0, v2, Lyd2;->v:Lee2;

    .line 1140
    .line 1141
    if-eqz v0, :cond_25

    .line 1142
    .line 1143
    invoke-virtual {v0}, Lee2;->e()V

    .line 1144
    .line 1145
    .line 1146
    :cond_25
    return-void

    .line 1147
    :pswitch_1b
    iget-object v0, v1, Ln62;->g:Ljava/lang/Object;

    .line 1148
    .line 1149
    move-object v2, v0

    .line 1150
    check-cast v2, Lpd2;

    .line 1151
    .line 1152
    :try_start_c
    iget-object v0, v1, Ln62;->h:Ljava/lang/Object;

    .line 1153
    .line 1154
    check-cast v0, Landroid/content/Context;

    .line 1155
    .line 1156
    invoke-static {v0}, Lk3;->a(Landroid/content/Context;)Lj3;

    .line 1157
    .line 1158
    .line 1159
    move-result-object v0

    .line 1160
    invoke-virtual {v2, v0}, Lpd2;->a(Ljava/lang/Object;)Z
    :try_end_c
    .catch Ljava/io/IOException; {:try_start_c .. :try_end_c} :catch_a
    .catch Ljava/lang/IllegalStateException; {:try_start_c .. :try_end_c} :catch_9
    .catch Lnz; {:try_start_c .. :try_end_c} :catch_8

    .line 1161
    .line 1162
    .line 1163
    goto :goto_16

    .line 1164
    :catch_8
    move-exception v0

    .line 1165
    goto :goto_15

    .line 1166
    :catch_9
    move-exception v0

    .line 1167
    goto :goto_15

    .line 1168
    :catch_a
    move-exception v0

    .line 1169
    :goto_15
    invoke-virtual {v2, v0}, Lpd2;->b(Ljava/lang/Throwable;)V

    .line 1170
    .line 1171
    .line 1172
    const-string v2, "Exception while getting advertising Id info"

    .line 1173
    .line 1174
    invoke-static {v2, v0}, Lgi2;->c0(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1175
    .line 1176
    .line 1177
    :goto_16
    return-void

    .line 1178
    :pswitch_1c
    iget-object v0, v1, Ln62;->h:Ljava/lang/Object;

    .line 1179
    .line 1180
    check-cast v0, Landroid/content/Context;

    .line 1181
    .line 1182
    iget-object v2, v1, Ln62;->g:Ljava/lang/Object;

    .line 1183
    .line 1184
    check-cast v2, Lhp2;

    .line 1185
    .line 1186
    const-string v3, "audio"

    .line 1187
    .line 1188
    invoke-virtual {v0, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 1189
    .line 1190
    .line 1191
    move-result-object v0

    .line 1192
    check-cast v0, Landroid/media/AudioManager;

    .line 1193
    .line 1194
    sput-object v0, Lbd2;->f:Landroid/media/AudioManager;

    .line 1195
    .line 1196
    invoke-virtual {v2}, Lhp2;->a()Z

    .line 1197
    .line 1198
    .line 1199
    return-void

    .line 1200
    :pswitch_1d
    iget-object v0, v1, Ln62;->h:Ljava/lang/Object;

    .line 1201
    .line 1202
    check-cast v0, Lgi4;

    .line 1203
    .line 1204
    iget-boolean v0, v0, Lgi4;->d:Z

    .line 1205
    .line 1206
    if-eqz v0, :cond_26

    .line 1207
    .line 1208
    iget-object v0, v1, Ln62;->g:Ljava/lang/Object;

    .line 1209
    .line 1210
    check-cast v0, Lmn2;

    .line 1211
    .line 1212
    iget-object v0, v0, Lmn2;->h:Ljava/lang/Object;

    .line 1213
    .line 1214
    check-cast v0, Lgi4;

    .line 1215
    .line 1216
    invoke-virtual {v0}, Lgi4;->f()V

    .line 1217
    .line 1218
    .line 1219
    goto :goto_19

    .line 1220
    :cond_26
    :try_start_d
    iget-object v0, v1, Ln62;->g:Ljava/lang/Object;

    .line 1221
    .line 1222
    check-cast v0, Lmn2;

    .line 1223
    .line 1224
    iget-object v0, v0, Lmn2;->i:Ljava/lang/Object;

    .line 1225
    .line 1226
    check-cast v0, Lpj;

    .line 1227
    .line 1228
    iget-object v2, v1, Ln62;->h:Ljava/lang/Object;

    .line 1229
    .line 1230
    check-cast v2, Lgi4;

    .line 1231
    .line 1232
    invoke-interface {v0, v2}, Lpj;->f(Lgi4;)Ljava/lang/Object;

    .line 1233
    .line 1234
    .line 1235
    move-result-object v0
    :try_end_d
    .catch Lnr0; {:try_start_d .. :try_end_d} :catch_c
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_b

    .line 1236
    iget-object v2, v1, Ln62;->g:Ljava/lang/Object;

    .line 1237
    .line 1238
    check-cast v2, Lmn2;

    .line 1239
    .line 1240
    iget-object v2, v2, Lmn2;->h:Ljava/lang/Object;

    .line 1241
    .line 1242
    check-cast v2, Lgi4;

    .line 1243
    .line 1244
    invoke-virtual {v2, v0}, Lgi4;->e(Ljava/lang/Object;)V

    .line 1245
    .line 1246
    .line 1247
    goto :goto_19

    .line 1248
    :catch_b
    move-exception v0

    .line 1249
    goto :goto_17

    .line 1250
    :catch_c
    move-exception v0

    .line 1251
    goto :goto_18

    .line 1252
    :goto_17
    iget-object v2, v1, Ln62;->g:Ljava/lang/Object;

    .line 1253
    .line 1254
    check-cast v2, Lmn2;

    .line 1255
    .line 1256
    iget-object v2, v2, Lmn2;->h:Ljava/lang/Object;

    .line 1257
    .line 1258
    check-cast v2, Lgi4;

    .line 1259
    .line 1260
    invoke-virtual {v2, v0}, Lgi4;->d(Ljava/lang/Exception;)V

    .line 1261
    .line 1262
    .line 1263
    goto :goto_19

    .line 1264
    :goto_18
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 1265
    .line 1266
    .line 1267
    move-result-object v2

    .line 1268
    instance-of v2, v2, Ljava/lang/Exception;

    .line 1269
    .line 1270
    if-eqz v2, :cond_27

    .line 1271
    .line 1272
    iget-object v2, v1, Ln62;->g:Ljava/lang/Object;

    .line 1273
    .line 1274
    check-cast v2, Lmn2;

    .line 1275
    .line 1276
    iget-object v2, v2, Lmn2;->h:Ljava/lang/Object;

    .line 1277
    .line 1278
    check-cast v2, Lgi4;

    .line 1279
    .line 1280
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 1281
    .line 1282
    .line 1283
    move-result-object v0

    .line 1284
    check-cast v0, Ljava/lang/Exception;

    .line 1285
    .line 1286
    invoke-virtual {v2, v0}, Lgi4;->d(Ljava/lang/Exception;)V

    .line 1287
    .line 1288
    .line 1289
    goto :goto_19

    .line 1290
    :cond_27
    iget-object v2, v1, Ln62;->g:Ljava/lang/Object;

    .line 1291
    .line 1292
    check-cast v2, Lmn2;

    .line 1293
    .line 1294
    iget-object v2, v2, Lmn2;->h:Ljava/lang/Object;

    .line 1295
    .line 1296
    check-cast v2, Lgi4;

    .line 1297
    .line 1298
    invoke-virtual {v2, v0}, Lgi4;->d(Ljava/lang/Exception;)V

    .line 1299
    .line 1300
    .line 1301
    :goto_19
    return-void

    .line 1302
    :pswitch_1e
    iget-object v0, v1, Ln62;->h:Ljava/lang/Object;

    .line 1303
    .line 1304
    check-cast v0, Lqb2;

    .line 1305
    .line 1306
    iget-object v2, v1, Ln62;->g:Ljava/lang/Object;

    .line 1307
    .line 1308
    check-cast v2, Landroid/graphics/Bitmap;

    .line 1309
    .line 1310
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1311
    .line 1312
    .line 1313
    sget-object v3, La54;->g:Ly44;

    .line 1314
    .line 1315
    new-instance v3, Lz44;

    .line 1316
    .line 1317
    invoke-direct {v3}, Lz44;-><init>()V

    .line 1318
    .line 1319
    .line 1320
    sget-object v4, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;

    .line 1321
    .line 1322
    invoke-virtual {v2, v4, v8, v3}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    .line 1323
    .line 1324
    .line 1325
    iget-object v2, v0, Lqb2;->h:Ljava/lang/Object;

    .line 1326
    .line 1327
    monitor-enter v2

    .line 1328
    :try_start_e
    iget-object v0, v0, Lqb2;->a:Ly74;

    .line 1329
    .line 1330
    invoke-static {}, Lt84;->A()Ls84;

    .line 1331
    .line 1332
    .line 1333
    move-result-object v4

    .line 1334
    invoke-virtual {v3}, Lz44;->a()La54;

    .line 1335
    .line 1336
    .line 1337
    move-result-object v3

    .line 1338
    invoke-virtual {v4}, Ln54;->b()V

    .line 1339
    .line 1340
    .line 1341
    iget-object v5, v4, Ln54;->g:Lp54;

    .line 1342
    .line 1343
    check-cast v5, Lt84;

    .line 1344
    .line 1345
    invoke-virtual {v5, v3}, Lt84;->C(La54;)V

    .line 1346
    .line 1347
    .line 1348
    invoke-virtual {v4}, Ln54;->b()V

    .line 1349
    .line 1350
    .line 1351
    iget-object v3, v4, Ln54;->g:Lp54;

    .line 1352
    .line 1353
    check-cast v3, Lt84;

    .line 1354
    .line 1355
    const-string v5, "image/png"

    .line 1356
    .line 1357
    invoke-virtual {v3, v5}, Lt84;->B(Ljava/lang/String;)V

    .line 1358
    .line 1359
    .line 1360
    invoke-virtual {v4}, Ln54;->b()V

    .line 1361
    .line 1362
    .line 1363
    iget-object v3, v4, Ln54;->g:Lp54;

    .line 1364
    .line 1365
    check-cast v3, Lt84;

    .line 1366
    .line 1367
    const/4 v9, 0x2

    .line 1368
    invoke-virtual {v3, v9}, Lt84;->D(I)V

    .line 1369
    .line 1370
    .line 1371
    invoke-virtual {v4}, Ln54;->d()Lp54;

    .line 1372
    .line 1373
    .line 1374
    move-result-object v3

    .line 1375
    check-cast v3, Lt84;

    .line 1376
    .line 1377
    invoke-virtual {v0}, Ln54;->b()V

    .line 1378
    .line 1379
    .line 1380
    iget-object v0, v0, Ln54;->g:Lp54;

    .line 1381
    .line 1382
    check-cast v0, Lc94;

    .line 1383
    .line 1384
    invoke-virtual {v0, v3}, Lc94;->K(Lt84;)V

    .line 1385
    .line 1386
    .line 1387
    monitor-exit v2

    .line 1388
    return-void

    .line 1389
    :catchall_3
    move-exception v0

    .line 1390
    monitor-exit v2
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_3

    .line 1391
    throw v0

    .line 1392
    :pswitch_1f
    iget-object v0, v1, Ln62;->h:Ljava/lang/Object;

    .line 1393
    .line 1394
    check-cast v0, Lug4;

    .line 1395
    .line 1396
    iget-object v2, v1, Ln62;->g:Ljava/lang/Object;

    .line 1397
    .line 1398
    check-cast v2, Ljava/lang/String;

    .line 1399
    .line 1400
    invoke-virtual {v0, v2, v7}, Lug4;->a(Ljava/lang/String;Ljava/util/HashMap;)Leg4;

    .line 1401
    .line 1402
    .line 1403
    return-void

    .line 1404
    :pswitch_20
    sget-object v0, Lhg4;->C:Lhg4;

    .line 1405
    .line 1406
    iget-object v0, v0, Lhg4;->b:Ly24;

    .line 1407
    .line 1408
    iget-object v0, v1, Ln62;->g:Ljava/lang/Object;

    .line 1409
    .line 1410
    check-cast v0, Lcom/google/android/gms/internal/ads/zzbub;

    .line 1411
    .line 1412
    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzbub;->a:Landroid/app/Activity;

    .line 1413
    .line 1414
    iget-object v2, v1, Ln62;->h:Ljava/lang/Object;

    .line 1415
    .line 1416
    check-cast v2, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    .line 1417
    .line 1418
    const/4 v3, 0x1

    .line 1419
    invoke-static {v0, v2, v3, v7}, Ly24;->b(Landroid/content/Context;Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;ZLmv2;)V

    .line 1420
    .line 1421
    .line 1422
    return-void

    .line 1423
    :pswitch_21
    iget-object v0, v1, Ln62;->h:Ljava/lang/Object;

    .line 1424
    .line 1425
    move-object v2, v0

    .line 1426
    check-cast v2, Li01;

    .line 1427
    .line 1428
    iget-object v0, v1, Ln62;->g:Ljava/lang/Object;

    .line 1429
    .line 1430
    check-cast v0, Ljava/lang/String;

    .line 1431
    .line 1432
    iget-object v4, v2, Li01;->b:Landroid/webkit/WebView;

    .line 1433
    .line 1434
    iget-object v5, v2, Li01;->a:Landroid/content/Context;

    .line 1435
    .line 1436
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 1437
    .line 1438
    .line 1439
    move-result-object v6

    .line 1440
    :try_start_f
    sget-object v0, Lmz1;->Mc:Liz1;

    .line 1441
    .line 1442
    sget-object v8, Ltw1;->e:Ltw1;

    .line 1443
    .line 1444
    iget-object v8, v8, Ltw1;->c:Lkz1;

    .line 1445
    .line 1446
    invoke-virtual {v8, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 1447
    .line 1448
    .line 1449
    move-result-object v0

    .line 1450
    check-cast v0, Ljava/lang/Boolean;

    .line 1451
    .line 1452
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1453
    .line 1454
    .line 1455
    move-result v0

    .line 1456
    if-eqz v0, :cond_28

    .line 1457
    .line 1458
    iget-object v0, v2, Li01;->d:Lm83;

    .line 1459
    .line 1460
    if-eqz v0, :cond_28

    .line 1461
    .line 1462
    invoke-virtual {v0, v6, v5, v4, v7}, Lm83;->a(Landroid/net/Uri;Landroid/content/Context;Landroid/view/View;Landroid/app/Activity;)Landroid/net/Uri;

    .line 1463
    .line 1464
    .line 1465
    move-result-object v6

    .line 1466
    goto :goto_1b

    .line 1467
    :catch_d
    move-exception v0

    .line 1468
    goto :goto_1a

    .line 1469
    :cond_28
    iget-object v0, v2, Li01;->c:Lvs1;

    .line 1470
    .line 1471
    invoke-virtual {v0, v6, v5, v4, v7}, Lvs1;->b(Landroid/net/Uri;Landroid/content/Context;Landroid/view/View;Landroid/app/Activity;)Landroid/net/Uri;

    .line 1472
    .line 1473
    .line 1474
    move-result-object v6
    :try_end_f
    .catch Lws1; {:try_start_f .. :try_end_f} :catch_d

    .line 1475
    goto :goto_1b

    .line 1476
    :goto_1a
    invoke-static {v3}, Lgi2;->q0(I)Z

    .line 1477
    .line 1478
    .line 1479
    const-string v3, "TaggingLibraryJsInterface.recordClick"

    .line 1480
    .line 1481
    sget-object v4, Lhg4;->C:Lhg4;

    .line 1482
    .line 1483
    iget-object v4, v4, Lhg4;->h:Lgd2;

    .line 1484
    .line 1485
    invoke-virtual {v4, v3, v0}, Lgd2;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1486
    .line 1487
    .line 1488
    :goto_1b
    iget-object v0, v2, Li01;->i:Leb3;

    .line 1489
    .line 1490
    invoke-virtual {v6}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 1491
    .line 1492
    .line 1493
    move-result-object v2

    .line 1494
    invoke-virtual {v0, v2, v7, v7, v7}, Leb3;->b(Ljava/lang/String;Lx34;Lda3;Lao2;)V

    .line 1495
    .line 1496
    .line 1497
    return-void

    .line 1498
    :pswitch_22
    iget-object v0, v1, Ln62;->h:Ljava/lang/Object;

    .line 1499
    .line 1500
    check-cast v0, Lu82;

    .line 1501
    .line 1502
    iget-object v2, v1, Ln62;->g:Ljava/lang/Object;

    .line 1503
    .line 1504
    check-cast v2, Ljava/lang/String;

    .line 1505
    .line 1506
    const-class v3, Luk2;

    .line 1507
    .line 1508
    monitor-enter v3

    .line 1509
    :try_start_10
    sget-object v4, Luk2;->f:Ljava/lang/Boolean;
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_4

    .line 1510
    .line 1511
    if-nez v4, :cond_29

    .line 1512
    .line 1513
    :try_start_11
    const-string v4, "(function(){})()"

    .line 1514
    .line 1515
    invoke-virtual {v0, v4, v7}, Landroid/webkit/WebView;->evaluateJavascript(Ljava/lang/String;Landroid/webkit/ValueCallback;)V

    .line 1516
    .line 1517
    .line 1518
    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 1519
    .line 1520
    sput-object v4, Luk2;->f:Ljava/lang/Boolean;
    :try_end_11
    .catch Ljava/lang/IllegalStateException; {:try_start_11 .. :try_end_11} :catch_e
    .catchall {:try_start_11 .. :try_end_11} :catchall_4

    .line 1521
    .line 1522
    goto :goto_1c

    .line 1523
    :catchall_4
    move-exception v0

    .line 1524
    goto :goto_1e

    .line 1525
    :catch_e
    :try_start_12
    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 1526
    .line 1527
    sput-object v4, Luk2;->f:Ljava/lang/Boolean;

    .line 1528
    .line 1529
    :cond_29
    :goto_1c
    sget-object v4, Luk2;->f:Ljava/lang/Boolean;

    .line 1530
    .line 1531
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1532
    .line 1533
    .line 1534
    move-result v4

    .line 1535
    monitor-exit v3
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_4

    .line 1536
    if-eqz v4, :cond_2a

    .line 1537
    .line 1538
    invoke-virtual {v0, v2, v7}, Landroid/webkit/WebView;->evaluateJavascript(Ljava/lang/String;Landroid/webkit/ValueCallback;)V

    .line 1539
    .line 1540
    .line 1541
    goto :goto_1d

    .line 1542
    :cond_2a
    const-string v3, "javascript:"

    .line 1543
    .line 1544
    invoke-virtual {v3, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1545
    .line 1546
    .line 1547
    move-result-object v2

    .line 1548
    invoke-virtual {v0, v2}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 1549
    .line 1550
    .line 1551
    :goto_1d
    return-void

    .line 1552
    :goto_1e
    :try_start_13
    monitor-exit v3
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_4

    .line 1553
    throw v0

    .line 1554
    nop

    .line 1555
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
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
    .end packed-switch

    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    .line 1575
    .line 1576
    .line 1577
    .line 1578
    .line 1579
    .line 1580
    .line 1581
    .line 1582
    .line 1583
    .line 1584
    .line 1585
    .line 1586
    .line 1587
    .line 1588
    .line 1589
    .line 1590
    .line 1591
    .line 1592
    .line 1593
    .line 1594
    .line 1595
    .line 1596
    .line 1597
    .line 1598
    .line 1599
    .line 1600
    .line 1601
    .line 1602
    .line 1603
    .line 1604
    .line 1605
    .line 1606
    .line 1607
    .line 1608
    .line 1609
    .line 1610
    .line 1611
    .line 1612
    .line 1613
    .line 1614
    .line 1615
    .line 1616
    .line 1617
    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_5
        :pswitch_5
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_0
        :pswitch_4
        :pswitch_4
        :pswitch_2
        :pswitch_4
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method
