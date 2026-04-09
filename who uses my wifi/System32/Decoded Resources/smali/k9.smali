.class public abstract Lk9;
.super Lje;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ln9;


# instance fields
.field public H:I

.field public I:Z

.field public J:Z

.field public K:Z

.field public L:Z

.field public M:Z

.field public N:Z

.field public O:Z

.field public P:Z

.field public Q:Landroid/graphics/Paint;

.field public R:Landroid/graphics/Paint;

.field public S:Z

.field public T:Z

.field public U:Z

.field public V:F

.field public W:Z

.field public a0:Leb1;

.field public b0:Leb1;

.field public c0:Lfb1;

.field public d0:Lfb1;

.field public e0:Luk1;

.field public f0:Luk1;

.field public g0:Ldb1;

.field public h0:Landroid/graphics/RectF;

.field public i0:Landroid/graphics/Matrix;

.field public j0:Lz90;

.field public k0:Lz90;

.field public l0:[F


# virtual methods
.method public final a()V
    .locals 10

    .line 1
    iget-object v0, p0, Lk9;->h0:Landroid/graphics/RectF;

    .line 2
    .line 3
    iget-object v1, p0, Lje;->w:Lu61;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iput v2, v0, Landroid/graphics/RectF;->left:F

    .line 7
    .line 8
    iput v2, v0, Landroid/graphics/RectF;->right:F

    .line 9
    .line 10
    iput v2, v0, Landroid/graphics/RectF;->top:F

    .line 11
    .line 12
    iput v2, v0, Landroid/graphics/RectF;->bottom:F

    .line 13
    .line 14
    iget-object v3, p0, Lje;->q:Lk50;

    .line 15
    .line 16
    const/4 v4, 0x1

    .line 17
    const/4 v5, 0x2

    .line 18
    if-eqz v3, :cond_9

    .line 19
    .line 20
    iget-boolean v6, v3, Ldh;->a:Z

    .line 21
    .line 22
    if-eqz v6, :cond_9

    .line 23
    .line 24
    iget v3, v3, Lk50;->i:I

    .line 25
    .line 26
    invoke-static {v3}, Lex0;->s(I)I

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    if-eqz v3, :cond_6

    .line 31
    .line 32
    if-eq v3, v4, :cond_0

    .line 33
    .line 34
    goto/16 :goto_0

    .line 35
    .line 36
    :cond_0
    iget-object v3, p0, Lje;->q:Lk50;

    .line 37
    .line 38
    iget v3, v3, Lk50;->g:I

    .line 39
    .line 40
    invoke-static {v3}, Lex0;->s(I)I

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    if-eqz v3, :cond_5

    .line 45
    .line 46
    if-eq v3, v4, :cond_2

    .line 47
    .line 48
    if-eq v3, v5, :cond_1

    .line 49
    .line 50
    goto/16 :goto_0

    .line 51
    .line 52
    :cond_1
    iget v3, v0, Landroid/graphics/RectF;->right:F

    .line 53
    .line 54
    iget-object v6, p0, Lje;->q:Lk50;

    .line 55
    .line 56
    iget v7, v6, Lk50;->r:F

    .line 57
    .line 58
    iget v8, v1, Lu61;->c:F

    .line 59
    .line 60
    iget v6, v6, Lk50;->q:F

    .line 61
    .line 62
    mul-float/2addr v8, v6

    .line 63
    invoke-static {v7, v8}, Ljava/lang/Math;->min(FF)F

    .line 64
    .line 65
    .line 66
    move-result v6

    .line 67
    iget-object v7, p0, Lje;->q:Lk50;

    .line 68
    .line 69
    iget v7, v7, Ldh;->b:F

    .line 70
    .line 71
    add-float/2addr v6, v7

    .line 72
    add-float/2addr v6, v3

    .line 73
    iput v6, v0, Landroid/graphics/RectF;->right:F

    .line 74
    .line 75
    goto/16 :goto_0

    .line 76
    .line 77
    :cond_2
    iget-object v3, p0, Lje;->q:Lk50;

    .line 78
    .line 79
    iget v3, v3, Lk50;->h:I

    .line 80
    .line 81
    invoke-static {v3}, Lex0;->s(I)I

    .line 82
    .line 83
    .line 84
    move-result v3

    .line 85
    if-eqz v3, :cond_4

    .line 86
    .line 87
    if-eq v3, v5, :cond_3

    .line 88
    .line 89
    goto/16 :goto_0

    .line 90
    .line 91
    :cond_3
    iget v3, v0, Landroid/graphics/RectF;->bottom:F

    .line 92
    .line 93
    iget-object v6, p0, Lje;->q:Lk50;

    .line 94
    .line 95
    iget v7, v6, Lk50;->s:F

    .line 96
    .line 97
    iget v8, v1, Lu61;->d:F

    .line 98
    .line 99
    iget v6, v6, Lk50;->q:F

    .line 100
    .line 101
    mul-float/2addr v8, v6

    .line 102
    invoke-static {v7, v8}, Ljava/lang/Math;->min(FF)F

    .line 103
    .line 104
    .line 105
    move-result v6

    .line 106
    iget-object v7, p0, Lje;->q:Lk50;

    .line 107
    .line 108
    iget v7, v7, Ldh;->c:F

    .line 109
    .line 110
    add-float/2addr v6, v7

    .line 111
    add-float/2addr v6, v3

    .line 112
    iput v6, v0, Landroid/graphics/RectF;->bottom:F

    .line 113
    .line 114
    goto :goto_0

    .line 115
    :cond_4
    iget v3, v0, Landroid/graphics/RectF;->top:F

    .line 116
    .line 117
    iget-object v6, p0, Lje;->q:Lk50;

    .line 118
    .line 119
    iget v7, v6, Lk50;->s:F

    .line 120
    .line 121
    iget v8, v1, Lu61;->d:F

    .line 122
    .line 123
    iget v6, v6, Lk50;->q:F

    .line 124
    .line 125
    mul-float/2addr v8, v6

    .line 126
    invoke-static {v7, v8}, Ljava/lang/Math;->min(FF)F

    .line 127
    .line 128
    .line 129
    move-result v6

    .line 130
    iget-object v7, p0, Lje;->q:Lk50;

    .line 131
    .line 132
    iget v7, v7, Ldh;->c:F

    .line 133
    .line 134
    add-float/2addr v6, v7

    .line 135
    add-float/2addr v6, v3

    .line 136
    iput v6, v0, Landroid/graphics/RectF;->top:F

    .line 137
    .line 138
    goto :goto_0

    .line 139
    :cond_5
    iget v3, v0, Landroid/graphics/RectF;->left:F

    .line 140
    .line 141
    iget-object v6, p0, Lje;->q:Lk50;

    .line 142
    .line 143
    iget v7, v6, Lk50;->r:F

    .line 144
    .line 145
    iget v8, v1, Lu61;->c:F

    .line 146
    .line 147
    iget v6, v6, Lk50;->q:F

    .line 148
    .line 149
    mul-float/2addr v8, v6

    .line 150
    invoke-static {v7, v8}, Ljava/lang/Math;->min(FF)F

    .line 151
    .line 152
    .line 153
    move-result v6

    .line 154
    iget-object v7, p0, Lje;->q:Lk50;

    .line 155
    .line 156
    iget v7, v7, Ldh;->b:F

    .line 157
    .line 158
    add-float/2addr v6, v7

    .line 159
    add-float/2addr v6, v3

    .line 160
    iput v6, v0, Landroid/graphics/RectF;->left:F

    .line 161
    .line 162
    goto :goto_0

    .line 163
    :cond_6
    iget-object v3, p0, Lje;->q:Lk50;

    .line 164
    .line 165
    iget v3, v3, Lk50;->h:I

    .line 166
    .line 167
    invoke-static {v3}, Lex0;->s(I)I

    .line 168
    .line 169
    .line 170
    move-result v3

    .line 171
    if-eqz v3, :cond_8

    .line 172
    .line 173
    if-eq v3, v5, :cond_7

    .line 174
    .line 175
    goto :goto_0

    .line 176
    :cond_7
    iget v3, v0, Landroid/graphics/RectF;->bottom:F

    .line 177
    .line 178
    iget-object v6, p0, Lje;->q:Lk50;

    .line 179
    .line 180
    iget v7, v6, Lk50;->s:F

    .line 181
    .line 182
    iget v8, v1, Lu61;->d:F

    .line 183
    .line 184
    iget v6, v6, Lk50;->q:F

    .line 185
    .line 186
    mul-float/2addr v8, v6

    .line 187
    invoke-static {v7, v8}, Ljava/lang/Math;->min(FF)F

    .line 188
    .line 189
    .line 190
    move-result v6

    .line 191
    iget-object v7, p0, Lje;->q:Lk50;

    .line 192
    .line 193
    iget v7, v7, Ldh;->c:F

    .line 194
    .line 195
    add-float/2addr v6, v7

    .line 196
    add-float/2addr v6, v3

    .line 197
    iput v6, v0, Landroid/graphics/RectF;->bottom:F

    .line 198
    .line 199
    goto :goto_0

    .line 200
    :cond_8
    iget v3, v0, Landroid/graphics/RectF;->top:F

    .line 201
    .line 202
    iget-object v6, p0, Lje;->q:Lk50;

    .line 203
    .line 204
    iget v7, v6, Lk50;->s:F

    .line 205
    .line 206
    iget v8, v1, Lu61;->d:F

    .line 207
    .line 208
    iget v6, v6, Lk50;->q:F

    .line 209
    .line 210
    mul-float/2addr v8, v6

    .line 211
    invoke-static {v7, v8}, Ljava/lang/Math;->min(FF)F

    .line 212
    .line 213
    .line 214
    move-result v6

    .line 215
    iget-object v7, p0, Lje;->q:Lk50;

    .line 216
    .line 217
    iget v7, v7, Ldh;->c:F

    .line 218
    .line 219
    add-float/2addr v6, v7

    .line 220
    add-float/2addr v6, v3

    .line 221
    iput v6, v0, Landroid/graphics/RectF;->top:F

    .line 222
    .line 223
    :cond_9
    :goto_0
    iget v3, v0, Landroid/graphics/RectF;->left:F

    .line 224
    .line 225
    add-float/2addr v3, v2

    .line 226
    iget v6, v0, Landroid/graphics/RectF;->top:F

    .line 227
    .line 228
    add-float/2addr v6, v2

    .line 229
    iget v7, v0, Landroid/graphics/RectF;->right:F

    .line 230
    .line 231
    add-float/2addr v7, v2

    .line 232
    iget v0, v0, Landroid/graphics/RectF;->bottom:F

    .line 233
    .line 234
    add-float/2addr v0, v2

    .line 235
    iget-object v2, p0, Lk9;->a0:Leb1;

    .line 236
    .line 237
    iget-boolean v8, v2, Ldh;->a:Z

    .line 238
    .line 239
    if-eqz v8, :cond_a

    .line 240
    .line 241
    iget-boolean v8, v2, Ld9;->r:Z

    .line 242
    .line 243
    if-eqz v8, :cond_a

    .line 244
    .line 245
    iget v8, v2, Leb1;->C:I

    .line 246
    .line 247
    if-ne v8, v4, :cond_a

    .line 248
    .line 249
    iget-object v8, p0, Lk9;->c0:Lfb1;

    .line 250
    .line 251
    iget-object v8, v8, Le9;->l:Landroid/graphics/Paint;

    .line 252
    .line 253
    invoke-virtual {v2, v8}, Leb1;->e(Landroid/graphics/Paint;)F

    .line 254
    .line 255
    .line 256
    move-result v2

    .line 257
    add-float/2addr v3, v2

    .line 258
    :cond_a
    iget-object v2, p0, Lk9;->b0:Leb1;

    .line 259
    .line 260
    iget-boolean v8, v2, Ldh;->a:Z

    .line 261
    .line 262
    if-eqz v8, :cond_b

    .line 263
    .line 264
    iget-boolean v8, v2, Ld9;->r:Z

    .line 265
    .line 266
    if-eqz v8, :cond_b

    .line 267
    .line 268
    iget v8, v2, Leb1;->C:I

    .line 269
    .line 270
    if-ne v8, v4, :cond_b

    .line 271
    .line 272
    iget-object v8, p0, Lk9;->d0:Lfb1;

    .line 273
    .line 274
    iget-object v8, v8, Le9;->l:Landroid/graphics/Paint;

    .line 275
    .line 276
    invoke-virtual {v2, v8}, Leb1;->e(Landroid/graphics/Paint;)F

    .line 277
    .line 278
    .line 279
    move-result v2

    .line 280
    add-float/2addr v7, v2

    .line 281
    :cond_b
    iget-object v2, p0, Lje;->n:Lcb1;

    .line 282
    .line 283
    iget-boolean v8, v2, Ldh;->a:Z

    .line 284
    .line 285
    if-eqz v8, :cond_e

    .line 286
    .line 287
    iget-boolean v8, v2, Ld9;->r:Z

    .line 288
    .line 289
    if-eqz v8, :cond_e

    .line 290
    .line 291
    iget v8, v2, Lcb1;->y:I

    .line 292
    .line 293
    int-to-float v8, v8

    .line 294
    iget v9, v2, Ldh;->c:F

    .line 295
    .line 296
    add-float/2addr v8, v9

    .line 297
    iget v2, v2, Lcb1;->z:I

    .line 298
    .line 299
    if-ne v2, v5, :cond_c

    .line 300
    .line 301
    add-float/2addr v0, v8

    .line 302
    goto :goto_2

    .line 303
    :cond_c
    if-ne v2, v4, :cond_d

    .line 304
    .line 305
    :goto_1
    add-float/2addr v6, v8

    .line 306
    goto :goto_2

    .line 307
    :cond_d
    const/4 v4, 0x3

    .line 308
    if-ne v2, v4, :cond_e

    .line 309
    .line 310
    add-float/2addr v0, v8

    .line 311
    goto :goto_1

    .line 312
    :cond_e
    :goto_2
    invoke-virtual {p0}, Lje;->getExtraTopOffset()F

    .line 313
    .line 314
    .line 315
    move-result v2

    .line 316
    add-float/2addr v2, v6

    .line 317
    invoke-virtual {p0}, Lje;->getExtraRightOffset()F

    .line 318
    .line 319
    .line 320
    move-result v4

    .line 321
    add-float/2addr v4, v7

    .line 322
    invoke-virtual {p0}, Lje;->getExtraBottomOffset()F

    .line 323
    .line 324
    .line 325
    move-result v5

    .line 326
    add-float/2addr v5, v0

    .line 327
    invoke-virtual {p0}, Lje;->getExtraLeftOffset()F

    .line 328
    .line 329
    .line 330
    move-result v0

    .line 331
    add-float/2addr v0, v3

    .line 332
    iget v3, p0, Lk9;->V:F

    .line 333
    .line 334
    invoke-static {v3}, Lk41;->c(F)F

    .line 335
    .line 336
    .line 337
    move-result v3

    .line 338
    invoke-static {v3, v0}, Ljava/lang/Math;->max(FF)F

    .line 339
    .line 340
    .line 341
    move-result v0

    .line 342
    invoke-static {v3, v2}, Ljava/lang/Math;->max(FF)F

    .line 343
    .line 344
    .line 345
    move-result v2

    .line 346
    invoke-static {v3, v4}, Ljava/lang/Math;->max(FF)F

    .line 347
    .line 348
    .line 349
    move-result v4

    .line 350
    invoke-static {v3, v5}, Ljava/lang/Math;->max(FF)F

    .line 351
    .line 352
    .line 353
    move-result v3

    .line 354
    iget-object v5, v1, Lu61;->b:Landroid/graphics/RectF;

    .line 355
    .line 356
    iget v6, v1, Lu61;->c:F

    .line 357
    .line 358
    sub-float/2addr v6, v4

    .line 359
    iget v4, v1, Lu61;->d:F

    .line 360
    .line 361
    sub-float/2addr v4, v3

    .line 362
    invoke-virtual {v5, v0, v2, v6, v4}, Landroid/graphics/RectF;->set(FFFF)V

    .line 363
    .line 364
    .line 365
    iget-boolean v0, p0, Lje;->f:Z

    .line 366
    .line 367
    if-eqz v0, :cond_f

    .line 368
    .line 369
    iget-object v0, v1, Lu61;->b:Landroid/graphics/RectF;

    .line 370
    .line 371
    invoke-virtual {v0}, Landroid/graphics/RectF;->toString()Ljava/lang/String;

    .line 372
    .line 373
    .line 374
    :cond_f
    iget-object v0, p0, Lk9;->f0:Luk1;

    .line 375
    .line 376
    iget-object v1, p0, Lk9;->b0:Leb1;

    .line 377
    .line 378
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 379
    .line 380
    .line 381
    invoke-virtual {v0}, Luk1;->f()V

    .line 382
    .line 383
    .line 384
    iget-object v0, p0, Lk9;->e0:Luk1;

    .line 385
    .line 386
    iget-object v1, p0, Lk9;->a0:Leb1;

    .line 387
    .line 388
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 389
    .line 390
    .line 391
    invoke-virtual {v0}, Luk1;->f()V

    .line 392
    .line 393
    .line 394
    iget-boolean v0, p0, Lje;->f:Z

    .line 395
    .line 396
    if-eqz v0, :cond_10

    .line 397
    .line 398
    iget-object v0, p0, Lje;->n:Lcb1;

    .line 399
    .line 400
    iget v0, v0, Ld9;->w:F

    .line 401
    .line 402
    :cond_10
    iget-object v0, p0, Lk9;->f0:Luk1;

    .line 403
    .line 404
    iget-object v1, p0, Lje;->n:Lcb1;

    .line 405
    .line 406
    iget v2, v1, Ld9;->w:F

    .line 407
    .line 408
    iget v1, v1, Ld9;->x:F

    .line 409
    .line 410
    iget-object v3, p0, Lk9;->b0:Leb1;

    .line 411
    .line 412
    iget v4, v3, Ld9;->x:F

    .line 413
    .line 414
    iget v3, v3, Ld9;->w:F

    .line 415
    .line 416
    invoke-virtual {v0, v2, v1, v4, v3}, Luk1;->h(FFFF)V

    .line 417
    .line 418
    .line 419
    iget-object v0, p0, Lk9;->e0:Luk1;

    .line 420
    .line 421
    iget-object v1, p0, Lje;->n:Lcb1;

    .line 422
    .line 423
    iget v2, v1, Ld9;->w:F

    .line 424
    .line 425
    iget v1, v1, Ld9;->x:F

    .line 426
    .line 427
    iget-object v3, p0, Lk9;->a0:Leb1;

    .line 428
    .line 429
    iget v4, v3, Ld9;->x:F

    .line 430
    .line 431
    iget v3, v3, Ld9;->w:F

    .line 432
    .line 433
    invoke-virtual {v0, v2, v1, v4, v3}, Luk1;->h(FFFF)V

    .line 434
    .line 435
    .line 436
    return-void
.end method

.method public final computeScroll()V
    .locals 15

    .line 1
    iget-object v0, p0, Lje;->r:Loe;

    .line 2
    .line 3
    instance-of v1, v0, Ll9;

    .line 4
    .line 5
    if-eqz v1, :cond_5

    .line 6
    .line 7
    check-cast v0, Ll9;

    .line 8
    .line 9
    iget-object v1, v0, Ll9;->u:Laa0;

    .line 10
    .line 11
    iget-object v2, v0, Loe;->i:Lcom/github/mikephil/charting/charts/LineChart;

    .line 12
    .line 13
    iget-object v3, v0, Ll9;->l:Laa0;

    .line 14
    .line 15
    iget-object v4, v0, Ll9;->t:Laa0;

    .line 16
    .line 17
    iget v5, v1, Laa0;->g:F

    .line 18
    .line 19
    const/4 v6, 0x0

    .line 20
    cmpl-float v5, v5, v6

    .line 21
    .line 22
    if-nez v5, :cond_0

    .line 23
    .line 24
    iget v5, v1, Laa0;->h:F

    .line 25
    .line 26
    cmpl-float v5, v5, v6

    .line 27
    .line 28
    if-nez v5, :cond_0

    .line 29
    .line 30
    goto/16 :goto_3

    .line 31
    .line 32
    :cond_0
    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    .line 33
    .line 34
    .line 35
    move-result-wide v7

    .line 36
    iget v5, v1, Laa0;->g:F

    .line 37
    .line 38
    invoke-virtual {v2}, Lje;->getDragDecelerationFrictionCoef()F

    .line 39
    .line 40
    .line 41
    move-result v9

    .line 42
    mul-float/2addr v9, v5

    .line 43
    iput v9, v1, Laa0;->g:F

    .line 44
    .line 45
    iget v5, v1, Laa0;->h:F

    .line 46
    .line 47
    invoke-virtual {v2}, Lje;->getDragDecelerationFrictionCoef()F

    .line 48
    .line 49
    .line 50
    move-result v9

    .line 51
    mul-float/2addr v9, v5

    .line 52
    iput v9, v1, Laa0;->h:F

    .line 53
    .line 54
    iget-wide v10, v0, Ll9;->s:J

    .line 55
    .line 56
    sub-long v10, v7, v10

    .line 57
    .line 58
    long-to-float v5, v10

    .line 59
    const/high16 v10, 0x447a0000    # 1000.0f

    .line 60
    .line 61
    div-float/2addr v5, v10

    .line 62
    iget v10, v1, Laa0;->g:F

    .line 63
    .line 64
    mul-float/2addr v10, v5

    .line 65
    mul-float/2addr v9, v5

    .line 66
    iget v5, v4, Laa0;->g:F

    .line 67
    .line 68
    add-float v12, v5, v10

    .line 69
    .line 70
    iput v12, v4, Laa0;->g:F

    .line 71
    .line 72
    iget v5, v4, Laa0;->h:F

    .line 73
    .line 74
    add-float v13, v5, v9

    .line 75
    .line 76
    iput v13, v4, Laa0;->h:F

    .line 77
    .line 78
    const/4 v11, 0x2

    .line 79
    const/4 v14, 0x0

    .line 80
    move-wide v9, v7

    .line 81
    invoke-static/range {v7 .. v14}, Landroid/view/MotionEvent;->obtain(JJIFFI)Landroid/view/MotionEvent;

    .line 82
    .line 83
    .line 84
    move-result-object v5

    .line 85
    iget-boolean v9, v2, Lk9;->M:Z

    .line 86
    .line 87
    if-eqz v9, :cond_1

    .line 88
    .line 89
    iget v9, v4, Laa0;->g:F

    .line 90
    .line 91
    iget v10, v3, Laa0;->g:F

    .line 92
    .line 93
    sub-float/2addr v9, v10

    .line 94
    goto :goto_0

    .line 95
    :cond_1
    move v9, v6

    .line 96
    :goto_0
    iget-boolean v10, v2, Lk9;->N:Z

    .line 97
    .line 98
    if-eqz v10, :cond_2

    .line 99
    .line 100
    iget v4, v4, Laa0;->h:F

    .line 101
    .line 102
    iget v3, v3, Laa0;->h:F

    .line 103
    .line 104
    sub-float/2addr v4, v3

    .line 105
    goto :goto_1

    .line 106
    :cond_2
    move v4, v6

    .line 107
    :goto_1
    iget-object v3, v0, Ll9;->j:Landroid/graphics/Matrix;

    .line 108
    .line 109
    iget-object v10, v0, Ll9;->k:Landroid/graphics/Matrix;

    .line 110
    .line 111
    invoke-virtual {v3, v10}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v2}, Lje;->getOnChartGestureListener()Lbj0;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v0}, Ll9;->b()V

    .line 118
    .line 119
    .line 120
    iget-object v3, v0, Ll9;->j:Landroid/graphics/Matrix;

    .line 121
    .line 122
    invoke-virtual {v3, v9, v4}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 123
    .line 124
    .line 125
    invoke-virtual {v5}, Landroid/view/MotionEvent;->recycle()V

    .line 126
    .line 127
    .line 128
    invoke-virtual {v2}, Lje;->getViewPortHandler()Lu61;

    .line 129
    .line 130
    .line 131
    move-result-object v3

    .line 132
    iget-object v4, v0, Ll9;->j:Landroid/graphics/Matrix;

    .line 133
    .line 134
    const/4 v5, 0x0

    .line 135
    invoke-virtual {v3, v4, v2, v5}, Lu61;->e(Landroid/graphics/Matrix;Landroid/view/View;Z)V

    .line 136
    .line 137
    .line 138
    iput-object v4, v0, Ll9;->j:Landroid/graphics/Matrix;

    .line 139
    .line 140
    iput-wide v7, v0, Ll9;->s:J

    .line 141
    .line 142
    iget v0, v1, Laa0;->g:F

    .line 143
    .line 144
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 145
    .line 146
    .line 147
    move-result v0

    .line 148
    float-to-double v3, v0

    .line 149
    const-wide v7, 0x3f847ae147ae147bL    # 0.01

    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    cmpl-double v0, v3, v7

    .line 155
    .line 156
    if-gez v0, :cond_4

    .line 157
    .line 158
    iget v0, v1, Laa0;->h:F

    .line 159
    .line 160
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 161
    .line 162
    .line 163
    move-result v0

    .line 164
    float-to-double v3, v0

    .line 165
    cmpl-double v0, v3, v7

    .line 166
    .line 167
    if-ltz v0, :cond_3

    .line 168
    .line 169
    goto :goto_2

    .line 170
    :cond_3
    invoke-virtual {v2}, Lk9;->a()V

    .line 171
    .line 172
    .line 173
    invoke-virtual {v2}, Landroid/view/View;->postInvalidate()V

    .line 174
    .line 175
    .line 176
    iput v6, v1, Laa0;->g:F

    .line 177
    .line 178
    iput v6, v1, Laa0;->h:F

    .line 179
    .line 180
    return-void

    .line 181
    :cond_4
    :goto_2
    sget-object v0, Lk41;->a:Landroid/util/DisplayMetrics;

    .line 182
    .line 183
    invoke-virtual {v2}, Landroid/view/View;->postInvalidateOnAnimation()V

    .line 184
    .line 185
    .line 186
    :cond_5
    :goto_3
    return-void
.end method

.method public final d()V
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lje;->g:Lle;

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget-object v2, v0, Lje;->n:Lcb1;

    .line 9
    .line 10
    check-cast v1, Lm9;

    .line 11
    .line 12
    iget v3, v1, Lle;->d:F

    .line 13
    .line 14
    iget v1, v1, Lle;->c:F

    .line 15
    .line 16
    invoke-virtual {v2, v3, v1}, Ld9;->a(FF)V

    .line 17
    .line 18
    .line 19
    iget-object v1, v0, Lk9;->a0:Leb1;

    .line 20
    .line 21
    iget-object v2, v0, Lje;->g:Lle;

    .line 22
    .line 23
    check-cast v2, Lm9;

    .line 24
    .line 25
    const/4 v3, 0x1

    .line 26
    invoke-virtual {v2, v3}, Lle;->g(I)F

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    iget-object v4, v0, Lje;->g:Lle;

    .line 31
    .line 32
    check-cast v4, Lm9;

    .line 33
    .line 34
    invoke-virtual {v4, v3}, Lle;->f(I)F

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    invoke-virtual {v1, v2, v4}, Leb1;->a(FF)V

    .line 39
    .line 40
    .line 41
    iget-object v1, v0, Lk9;->b0:Leb1;

    .line 42
    .line 43
    iget-object v2, v0, Lje;->g:Lle;

    .line 44
    .line 45
    check-cast v2, Lm9;

    .line 46
    .line 47
    const/4 v4, 0x2

    .line 48
    invoke-virtual {v2, v4}, Lle;->g(I)F

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    iget-object v5, v0, Lje;->g:Lle;

    .line 53
    .line 54
    check-cast v5, Lm9;

    .line 55
    .line 56
    invoke-virtual {v5, v4}, Lle;->f(I)F

    .line 57
    .line 58
    .line 59
    move-result v4

    .line 60
    invoke-virtual {v1, v2, v4}, Leb1;->a(FF)V

    .line 61
    .line 62
    .line 63
    iget-object v1, v0, Lk9;->c0:Lfb1;

    .line 64
    .line 65
    iget-object v2, v0, Lk9;->a0:Leb1;

    .line 66
    .line 67
    iget v4, v2, Ld9;->w:F

    .line 68
    .line 69
    iget v2, v2, Ld9;->v:F

    .line 70
    .line 71
    invoke-virtual {v1, v4, v2}, Le9;->U1(FF)V

    .line 72
    .line 73
    .line 74
    iget-object v1, v0, Lk9;->d0:Lfb1;

    .line 75
    .line 76
    iget-object v2, v0, Lk9;->b0:Leb1;

    .line 77
    .line 78
    iget v4, v2, Ld9;->w:F

    .line 79
    .line 80
    iget v2, v2, Ld9;->v:F

    .line 81
    .line 82
    invoke-virtual {v1, v4, v2}, Le9;->U1(FF)V

    .line 83
    .line 84
    .line 85
    iget-object v1, v0, Lk9;->g0:Ldb1;

    .line 86
    .line 87
    iget-object v2, v0, Lje;->n:Lcb1;

    .line 88
    .line 89
    iget v4, v2, Ld9;->w:F

    .line 90
    .line 91
    iget v2, v2, Ld9;->v:F

    .line 92
    .line 93
    invoke-virtual {v1, v4, v2}, Ldb1;->U1(FF)V

    .line 94
    .line 95
    .line 96
    iget-object v1, v0, Lje;->q:Lk50;

    .line 97
    .line 98
    if-eqz v1, :cond_28

    .line 99
    .line 100
    iget-object v1, v0, Lje;->t:Lm50;

    .line 101
    .line 102
    iget-object v2, v0, Lje;->g:Lle;

    .line 103
    .line 104
    iget-object v4, v1, Lm50;->i:Landroid/graphics/Paint;

    .line 105
    .line 106
    iget-object v5, v1, Lm50;->k:Lk50;

    .line 107
    .line 108
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 109
    .line 110
    .line 111
    iget-object v6, v1, Lm50;->l:Ljava/util/ArrayList;

    .line 112
    .line 113
    invoke-virtual {v6}, Ljava/util/ArrayList;->clear()V

    .line 114
    .line 115
    .line 116
    const/4 v8, 0x0

    .line 117
    :goto_0
    iget-object v9, v2, Lle;->i:Ljava/util/ArrayList;

    .line 118
    .line 119
    if-nez v9, :cond_1

    .line 120
    .line 121
    const/4 v9, 0x0

    .line 122
    goto :goto_1

    .line 123
    :cond_1
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 124
    .line 125
    .line 126
    move-result v9

    .line 127
    :goto_1
    if-ge v8, v9, :cond_4

    .line 128
    .line 129
    invoke-virtual {v2, v8}, Lle;->d(I)Lq10;

    .line 130
    .line 131
    .line 132
    move-result-object v9

    .line 133
    move-object v10, v9

    .line 134
    check-cast v10, Ll60;

    .line 135
    .line 136
    iget-object v11, v10, Ll60;->a:Ljava/util/ArrayList;

    .line 137
    .line 138
    check-cast v9, Ll60;

    .line 139
    .line 140
    iget-object v9, v9, Ll60;->o:Ljava/util/ArrayList;

    .line 141
    .line 142
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 143
    .line 144
    .line 145
    move-result v9

    .line 146
    const/4 v12, 0x0

    .line 147
    :goto_2
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    .line 148
    .line 149
    .line 150
    move-result v13

    .line 151
    if-ge v12, v13, :cond_3

    .line 152
    .line 153
    if-ge v12, v9, :cond_3

    .line 154
    .line 155
    invoke-interface {v11}, Ljava/util/List;->size()I

    .line 156
    .line 157
    .line 158
    move-result v13

    .line 159
    sub-int/2addr v13, v3

    .line 160
    if-ge v12, v13, :cond_2

    .line 161
    .line 162
    add-int/lit8 v13, v9, -0x1

    .line 163
    .line 164
    if-ge v12, v13, :cond_2

    .line 165
    .line 166
    const/4 v13, 0x0

    .line 167
    goto :goto_3

    .line 168
    :cond_2
    invoke-virtual {v2, v8}, Lle;->d(I)Lq10;

    .line 169
    .line 170
    .line 171
    move-result-object v13

    .line 172
    check-cast v13, Ll60;

    .line 173
    .line 174
    iget-object v13, v13, Ll60;->c:Ljava/lang/String;

    .line 175
    .line 176
    :goto_3
    new-instance v14, Ll50;

    .line 177
    .line 178
    iget v15, v10, Ll60;->g:I

    .line 179
    .line 180
    iget v7, v10, Ll60;->h:F

    .line 181
    .line 182
    iget v3, v10, Ll60;->i:F

    .line 183
    .line 184
    invoke-interface {v11, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v17

    .line 188
    check-cast v17, Ljava/lang/Integer;

    .line 189
    .line 190
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Integer;->intValue()I

    .line 191
    .line 192
    .line 193
    move-result v0

    .line 194
    invoke-direct {v14}, Ljava/lang/Object;-><init>()V

    .line 195
    .line 196
    .line 197
    iput-object v13, v14, Ll50;->a:Ljava/lang/String;

    .line 198
    .line 199
    iput v15, v14, Ll50;->b:I

    .line 200
    .line 201
    iput v7, v14, Ll50;->c:F

    .line 202
    .line 203
    iput v3, v14, Ll50;->d:F

    .line 204
    .line 205
    iput v0, v14, Ll50;->e:I

    .line 206
    .line 207
    invoke-virtual {v6, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 208
    .line 209
    .line 210
    add-int/lit8 v12, v12, 0x1

    .line 211
    .line 212
    const/4 v3, 0x1

    .line 213
    move-object/from16 v0, p0

    .line 214
    .line 215
    goto :goto_2

    .line 216
    :cond_3
    add-int/lit8 v8, v8, 0x1

    .line 217
    .line 218
    const/4 v3, 0x1

    .line 219
    move-object/from16 v0, p0

    .line 220
    .line 221
    goto :goto_0

    .line 222
    :cond_4
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 223
    .line 224
    .line 225
    move-result v0

    .line 226
    new-array v0, v0, [Ll50;

    .line 227
    .line 228
    invoke-interface {v6, v0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    move-result-object v0

    .line 232
    check-cast v0, [Ll50;

    .line 233
    .line 234
    iput-object v0, v5, Lk50;->f:[Ll50;

    .line 235
    .line 236
    iget v0, v5, Ldh;->d:F

    .line 237
    .line 238
    invoke-virtual {v4, v0}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 239
    .line 240
    .line 241
    iget v0, v5, Ldh;->e:I

    .line 242
    .line 243
    invoke-virtual {v4, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 244
    .line 245
    .line 246
    iget-object v0, v1, Lf74;->g:Ljava/lang/Object;

    .line 247
    .line 248
    check-cast v0, Lu61;

    .line 249
    .line 250
    iget-object v1, v5, Lk50;->u:Ljava/util/ArrayList;

    .line 251
    .line 252
    iget-object v2, v5, Lk50;->t:Ljava/util/ArrayList;

    .line 253
    .line 254
    iget-object v3, v5, Lk50;->v:Ljava/util/ArrayList;

    .line 255
    .line 256
    iget v6, v5, Lk50;->l:F

    .line 257
    .line 258
    invoke-static {v6}, Lk41;->c(F)F

    .line 259
    .line 260
    .line 261
    move-result v7

    .line 262
    iget v8, v5, Lk50;->p:F

    .line 263
    .line 264
    invoke-static {v8}, Lk41;->c(F)F

    .line 265
    .line 266
    .line 267
    move-result v8

    .line 268
    iget v9, v5, Lk50;->o:F

    .line 269
    .line 270
    invoke-static {v9}, Lk41;->c(F)F

    .line 271
    .line 272
    .line 273
    move-result v10

    .line 274
    iget v11, v5, Lk50;->n:F

    .line 275
    .line 276
    invoke-static {v11}, Lk41;->c(F)F

    .line 277
    .line 278
    .line 279
    move-result v11

    .line 280
    const/4 v12, 0x0

    .line 281
    invoke-static {v12}, Lk41;->c(F)F

    .line 282
    .line 283
    .line 284
    move-result v13

    .line 285
    iget-object v14, v5, Lk50;->f:[Ll50;

    .line 286
    .line 287
    array-length v15, v14

    .line 288
    invoke-static {v9}, Lk41;->c(F)F

    .line 289
    .line 290
    .line 291
    iget-object v9, v5, Lk50;->f:[Ll50;

    .line 292
    .line 293
    array-length v12, v9

    .line 294
    move/from16 v20, v6

    .line 295
    .line 296
    const/4 v6, 0x0

    .line 297
    const/16 v18, 0x0

    .line 298
    .line 299
    const/16 v19, 0x0

    .line 300
    .line 301
    :goto_4
    if-ge v6, v12, :cond_9

    .line 302
    .line 303
    move/from16 v21, v6

    .line 304
    .line 305
    aget-object v6, v9, v21

    .line 306
    .line 307
    move/from16 v22, v7

    .line 308
    .line 309
    iget v7, v6, Ll50;->c:F

    .line 310
    .line 311
    invoke-static {v7}, Ljava/lang/Float;->isNaN(F)Z

    .line 312
    .line 313
    .line 314
    move-result v7

    .line 315
    if-eqz v7, :cond_5

    .line 316
    .line 317
    move/from16 v7, v20

    .line 318
    .line 319
    goto :goto_5

    .line 320
    :cond_5
    iget v7, v6, Ll50;->c:F

    .line 321
    .line 322
    :goto_5
    invoke-static {v7}, Lk41;->c(F)F

    .line 323
    .line 324
    .line 325
    move-result v7

    .line 326
    cmpl-float v23, v7, v19

    .line 327
    .line 328
    if-lez v23, :cond_6

    .line 329
    .line 330
    move/from16 v19, v7

    .line 331
    .line 332
    :cond_6
    iget-object v6, v6, Ll50;->a:Ljava/lang/String;

    .line 333
    .line 334
    if-nez v6, :cond_7

    .line 335
    .line 336
    goto :goto_6

    .line 337
    :cond_7
    invoke-virtual {v4, v6}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    .line 338
    .line 339
    .line 340
    move-result v6

    .line 341
    float-to-int v6, v6

    .line 342
    int-to-float v6, v6

    .line 343
    cmpl-float v7, v6, v18

    .line 344
    .line 345
    if-lez v7, :cond_8

    .line 346
    .line 347
    move/from16 v18, v6

    .line 348
    .line 349
    :cond_8
    :goto_6
    add-int/lit8 v6, v21, 0x1

    .line 350
    .line 351
    move/from16 v7, v22

    .line 352
    .line 353
    goto :goto_4

    .line 354
    :cond_9
    move/from16 v22, v7

    .line 355
    .line 356
    iget-object v6, v5, Lk50;->f:[Ll50;

    .line 357
    .line 358
    array-length v7, v6

    .line 359
    const/4 v9, 0x0

    .line 360
    const/4 v12, 0x0

    .line 361
    :goto_7
    if-ge v12, v7, :cond_c

    .line 362
    .line 363
    move-object/from16 v18, v6

    .line 364
    .line 365
    aget-object v6, v18, v12

    .line 366
    .line 367
    iget-object v6, v6, Ll50;->a:Ljava/lang/String;

    .line 368
    .line 369
    if-nez v6, :cond_a

    .line 370
    .line 371
    goto :goto_8

    .line 372
    :cond_a
    invoke-static {v4, v6}, Lk41;->a(Landroid/graphics/Paint;Ljava/lang/String;)I

    .line 373
    .line 374
    .line 375
    move-result v6

    .line 376
    int-to-float v6, v6

    .line 377
    cmpl-float v19, v6, v9

    .line 378
    .line 379
    if-lez v19, :cond_b

    .line 380
    .line 381
    move v9, v6

    .line 382
    :cond_b
    :goto_8
    add-int/lit8 v12, v12, 0x1

    .line 383
    .line 384
    move-object/from16 v6, v18

    .line 385
    .line 386
    goto :goto_7

    .line 387
    :cond_c
    iget v6, v5, Lk50;->i:I

    .line 388
    .line 389
    invoke-static {v6}, Lex0;->s(I)I

    .line 390
    .line 391
    .line 392
    move-result v6

    .line 393
    if-eqz v6, :cond_19

    .line 394
    .line 395
    const/4 v7, 0x1

    .line 396
    if-eq v6, v7, :cond_d

    .line 397
    .line 398
    goto/16 :goto_19

    .line 399
    .line 400
    :cond_d
    sget-object v0, Lk41;->e:Landroid/graphics/Paint$FontMetrics;

    .line 401
    .line 402
    invoke-virtual {v4, v0}, Landroid/graphics/Paint;->getFontMetrics(Landroid/graphics/Paint$FontMetrics;)F

    .line 403
    .line 404
    .line 405
    iget v1, v0, Landroid/graphics/Paint$FontMetrics;->descent:F

    .line 406
    .line 407
    iget v0, v0, Landroid/graphics/Paint$FontMetrics;->ascent:F

    .line 408
    .line 409
    sub-float/2addr v1, v0

    .line 410
    const/4 v0, 0x0

    .line 411
    const/4 v2, 0x0

    .line 412
    const/4 v3, 0x0

    .line 413
    const/4 v6, 0x0

    .line 414
    const/4 v7, 0x0

    .line 415
    :goto_9
    if-ge v6, v15, :cond_18

    .line 416
    .line 417
    aget-object v9, v14, v6

    .line 418
    .line 419
    iget v11, v9, Ll50;->b:I

    .line 420
    .line 421
    iget v12, v9, Ll50;->c:F

    .line 422
    .line 423
    move/from16 v18, v1

    .line 424
    .line 425
    const/4 v1, 0x1

    .line 426
    if-eq v11, v1, :cond_e

    .line 427
    .line 428
    const/4 v1, 0x1

    .line 429
    goto :goto_a

    .line 430
    :cond_e
    const/4 v1, 0x0

    .line 431
    :goto_a
    invoke-static {v12}, Ljava/lang/Float;->isNaN(F)Z

    .line 432
    .line 433
    .line 434
    move-result v11

    .line 435
    if-eqz v11, :cond_f

    .line 436
    .line 437
    move/from16 v11, v22

    .line 438
    .line 439
    goto :goto_b

    .line 440
    :cond_f
    invoke-static {v12}, Lk41;->c(F)F

    .line 441
    .line 442
    .line 443
    move-result v11

    .line 444
    :goto_b
    iget-object v9, v9, Ll50;->a:Ljava/lang/String;

    .line 445
    .line 446
    if-nez v7, :cond_10

    .line 447
    .line 448
    const/4 v3, 0x0

    .line 449
    :cond_10
    if-eqz v1, :cond_12

    .line 450
    .line 451
    if-eqz v7, :cond_11

    .line 452
    .line 453
    add-float/2addr v3, v8

    .line 454
    :cond_11
    add-float/2addr v3, v11

    .line 455
    :cond_12
    if-eqz v9, :cond_16

    .line 456
    .line 457
    if-eqz v1, :cond_13

    .line 458
    .line 459
    if-nez v7, :cond_13

    .line 460
    .line 461
    add-float v1, v3, v10

    .line 462
    .line 463
    goto :goto_c

    .line 464
    :cond_13
    if-eqz v7, :cond_14

    .line 465
    .line 466
    invoke-static {v0, v3}, Ljava/lang/Math;->max(FF)F

    .line 467
    .line 468
    .line 469
    move-result v0

    .line 470
    add-float v1, v18, v13

    .line 471
    .line 472
    add-float/2addr v2, v1

    .line 473
    const/4 v1, 0x0

    .line 474
    const/4 v7, 0x0

    .line 475
    goto :goto_c

    .line 476
    :cond_14
    move v1, v3

    .line 477
    :goto_c
    invoke-virtual {v4, v9}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    .line 478
    .line 479
    .line 480
    move-result v3

    .line 481
    float-to-int v3, v3

    .line 482
    int-to-float v3, v3

    .line 483
    add-float/2addr v1, v3

    .line 484
    add-int/lit8 v3, v15, -0x1

    .line 485
    .line 486
    if-ge v6, v3, :cond_15

    .line 487
    .line 488
    add-float v3, v18, v13

    .line 489
    .line 490
    add-float/2addr v3, v2

    .line 491
    move v2, v3

    .line 492
    :cond_15
    move v3, v1

    .line 493
    goto :goto_d

    .line 494
    :cond_16
    add-float/2addr v3, v11

    .line 495
    add-int/lit8 v1, v15, -0x1

    .line 496
    .line 497
    if-ge v6, v1, :cond_17

    .line 498
    .line 499
    add-float/2addr v3, v8

    .line 500
    :cond_17
    const/4 v7, 0x1

    .line 501
    :goto_d
    invoke-static {v0, v3}, Ljava/lang/Math;->max(FF)F

    .line 502
    .line 503
    .line 504
    move-result v0

    .line 505
    add-int/lit8 v6, v6, 0x1

    .line 506
    .line 507
    move/from16 v1, v18

    .line 508
    .line 509
    goto :goto_9

    .line 510
    :cond_18
    iput v0, v5, Lk50;->r:F

    .line 511
    .line 512
    iput v2, v5, Lk50;->s:F

    .line 513
    .line 514
    goto/16 :goto_19

    .line 515
    .line 516
    :cond_19
    sget-object v6, Lk41;->e:Landroid/graphics/Paint$FontMetrics;

    .line 517
    .line 518
    invoke-virtual {v4, v6}, Landroid/graphics/Paint;->getFontMetrics(Landroid/graphics/Paint$FontMetrics;)F

    .line 519
    .line 520
    .line 521
    iget v7, v6, Landroid/graphics/Paint$FontMetrics;->descent:F

    .line 522
    .line 523
    iget v9, v6, Landroid/graphics/Paint$FontMetrics;->ascent:F

    .line 524
    .line 525
    sub-float/2addr v7, v9

    .line 526
    invoke-virtual {v4, v6}, Landroid/graphics/Paint;->getFontMetrics(Landroid/graphics/Paint$FontMetrics;)F

    .line 527
    .line 528
    .line 529
    iget v9, v6, Landroid/graphics/Paint$FontMetrics;->ascent:F

    .line 530
    .line 531
    iget v12, v6, Landroid/graphics/Paint$FontMetrics;->top:F

    .line 532
    .line 533
    sub-float/2addr v9, v12

    .line 534
    iget v6, v6, Landroid/graphics/Paint$FontMetrics;->bottom:F

    .line 535
    .line 536
    add-float/2addr v9, v6

    .line 537
    add-float/2addr v9, v13

    .line 538
    iget-object v0, v0, Lu61;->b:Landroid/graphics/RectF;

    .line 539
    .line 540
    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    .line 541
    .line 542
    .line 543
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 544
    .line 545
    .line 546
    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    .line 547
    .line 548
    .line 549
    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    .line 550
    .line 551
    .line 552
    const/4 v6, -0x1

    .line 553
    const/4 v12, 0x0

    .line 554
    const/4 v13, 0x0

    .line 555
    const/16 v18, 0x0

    .line 556
    .line 557
    const/16 v19, 0x0

    .line 558
    .line 559
    :goto_e
    if-ge v12, v15, :cond_26

    .line 560
    .line 561
    aget-object v0, v14, v12

    .line 562
    .line 563
    move/from16 v21, v8

    .line 564
    .line 565
    iget v8, v0, Ll50;->b:I

    .line 566
    .line 567
    move/from16 v23, v9

    .line 568
    .line 569
    iget v9, v0, Ll50;->c:F

    .line 570
    .line 571
    move/from16 v24, v9

    .line 572
    .line 573
    const/4 v9, 0x1

    .line 574
    if-eq v8, v9, :cond_1a

    .line 575
    .line 576
    const/4 v8, 0x1

    .line 577
    goto :goto_f

    .line 578
    :cond_1a
    const/4 v8, 0x0

    .line 579
    :goto_f
    invoke-static/range {v24 .. v24}, Ljava/lang/Float;->isNaN(F)Z

    .line 580
    .line 581
    .line 582
    move-result v9

    .line 583
    if-eqz v9, :cond_1b

    .line 584
    .line 585
    move/from16 v9, v22

    .line 586
    .line 587
    goto :goto_10

    .line 588
    :cond_1b
    invoke-static/range {v24 .. v24}, Lk41;->c(F)F

    .line 589
    .line 590
    .line 591
    move-result v9

    .line 592
    :goto_10
    iget-object v0, v0, Ll50;->a:Ljava/lang/String;

    .line 593
    .line 594
    move/from16 v24, v8

    .line 595
    .line 596
    sget-object v8, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 597
    .line 598
    invoke-virtual {v1, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 599
    .line 600
    .line 601
    const/4 v8, -0x1

    .line 602
    if-ne v6, v8, :cond_1c

    .line 603
    .line 604
    const/4 v8, 0x0

    .line 605
    goto :goto_11

    .line 606
    :cond_1c
    add-float v8, v18, v21

    .line 607
    .line 608
    :goto_11
    if-eqz v0, :cond_1e

    .line 609
    .line 610
    move-object/from16 v18, v1

    .line 611
    .line 612
    invoke-static {v4, v0}, Lk41;->b(Landroid/graphics/Paint;Ljava/lang/String;)Lxt;

    .line 613
    .line 614
    .line 615
    move-result-object v1

    .line 616
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 617
    .line 618
    .line 619
    if-eqz v24, :cond_1d

    .line 620
    .line 621
    add-float v1, v10, v9

    .line 622
    .line 623
    goto :goto_12

    .line 624
    :cond_1d
    const/4 v1, 0x0

    .line 625
    :goto_12
    add-float/2addr v8, v1

    .line 626
    invoke-virtual {v2, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 627
    .line 628
    .line 629
    move-result-object v1

    .line 630
    check-cast v1, Lxt;

    .line 631
    .line 632
    iget v1, v1, Lxt;->g:F

    .line 633
    .line 634
    add-float/2addr v8, v1

    .line 635
    move-object/from16 v25, v0

    .line 636
    .line 637
    const/4 v0, -0x1

    .line 638
    goto :goto_14

    .line 639
    :cond_1e
    move-object/from16 v18, v1

    .line 640
    .line 641
    sget-object v1, Lxt;->i:Lni0;

    .line 642
    .line 643
    invoke-virtual {v1}, Lni0;->b()Lmi0;

    .line 644
    .line 645
    .line 646
    move-result-object v1

    .line 647
    check-cast v1, Lxt;

    .line 648
    .line 649
    move-object/from16 v25, v0

    .line 650
    .line 651
    const/4 v0, 0x0

    .line 652
    iput v0, v1, Lxt;->g:F

    .line 653
    .line 654
    iput v0, v1, Lxt;->h:F

    .line 655
    .line 656
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 657
    .line 658
    .line 659
    if-eqz v24, :cond_1f

    .line 660
    .line 661
    goto :goto_13

    .line 662
    :cond_1f
    const/4 v9, 0x0

    .line 663
    :goto_13
    add-float/2addr v8, v9

    .line 664
    const/4 v0, -0x1

    .line 665
    if-ne v6, v0, :cond_20

    .line 666
    .line 667
    move v6, v12

    .line 668
    :cond_20
    :goto_14
    if-nez v25, :cond_21

    .line 669
    .line 670
    add-int/lit8 v1, v15, -0x1

    .line 671
    .line 672
    if-ne v12, v1, :cond_22

    .line 673
    .line 674
    :cond_21
    const/16 v17, 0x0

    .line 675
    .line 676
    goto :goto_15

    .line 677
    :cond_22
    const/16 v17, 0x0

    .line 678
    .line 679
    goto :goto_17

    .line 680
    :goto_15
    cmpl-float v1, v19, v17

    .line 681
    .line 682
    if-nez v1, :cond_23

    .line 683
    .line 684
    move/from16 v1, v17

    .line 685
    .line 686
    goto :goto_16

    .line 687
    :cond_23
    move v1, v11

    .line 688
    :goto_16
    add-float/2addr v1, v8

    .line 689
    add-float v1, v1, v19

    .line 690
    .line 691
    add-int/lit8 v9, v15, -0x1

    .line 692
    .line 693
    if-ne v12, v9, :cond_24

    .line 694
    .line 695
    sget-object v9, Lxt;->i:Lni0;

    .line 696
    .line 697
    invoke-virtual {v9}, Lni0;->b()Lmi0;

    .line 698
    .line 699
    .line 700
    move-result-object v9

    .line 701
    check-cast v9, Lxt;

    .line 702
    .line 703
    iput v1, v9, Lxt;->g:F

    .line 704
    .line 705
    iput v7, v9, Lxt;->h:F

    .line 706
    .line 707
    invoke-virtual {v3, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 708
    .line 709
    .line 710
    invoke-static {v13, v1}, Ljava/lang/Math;->max(FF)F

    .line 711
    .line 712
    .line 713
    move-result v13

    .line 714
    :cond_24
    move/from16 v19, v1

    .line 715
    .line 716
    :goto_17
    if-eqz v25, :cond_25

    .line 717
    .line 718
    move v6, v0

    .line 719
    :cond_25
    add-int/lit8 v12, v12, 0x1

    .line 720
    .line 721
    move-object/from16 v1, v18

    .line 722
    .line 723
    move/from16 v9, v23

    .line 724
    .line 725
    move/from16 v18, v8

    .line 726
    .line 727
    move/from16 v8, v21

    .line 728
    .line 729
    goto/16 :goto_e

    .line 730
    .line 731
    :cond_26
    move/from16 v23, v9

    .line 732
    .line 733
    iput v13, v5, Lk50;->r:F

    .line 734
    .line 735
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 736
    .line 737
    .line 738
    move-result v0

    .line 739
    int-to-float v0, v0

    .line 740
    mul-float/2addr v7, v0

    .line 741
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 742
    .line 743
    .line 744
    move-result v0

    .line 745
    if-nez v0, :cond_27

    .line 746
    .line 747
    const/4 v0, 0x0

    .line 748
    goto :goto_18

    .line 749
    :cond_27
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 750
    .line 751
    .line 752
    move-result v0

    .line 753
    const/16 v16, 0x1

    .line 754
    .line 755
    add-int/lit8 v0, v0, -0x1

    .line 756
    .line 757
    :goto_18
    int-to-float v0, v0

    .line 758
    mul-float v9, v23, v0

    .line 759
    .line 760
    add-float/2addr v9, v7

    .line 761
    iput v9, v5, Lk50;->s:F

    .line 762
    .line 763
    :goto_19
    iget v0, v5, Lk50;->s:F

    .line 764
    .line 765
    iget v1, v5, Ldh;->c:F

    .line 766
    .line 767
    add-float/2addr v0, v1

    .line 768
    iput v0, v5, Lk50;->s:F

    .line 769
    .line 770
    iget v0, v5, Lk50;->r:F

    .line 771
    .line 772
    iget v1, v5, Ldh;->b:F

    .line 773
    .line 774
    add-float/2addr v0, v1

    .line 775
    iput v0, v5, Lk50;->r:F

    .line 776
    .line 777
    :cond_28
    invoke-virtual/range {p0 .. p0}, Lk9;->a()V

    .line 778
    .line 779
    .line 780
    return-void
.end method

.method public final f(I)Luk1;
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p1, v0, :cond_0

    .line 3
    .line 4
    iget-object p1, p0, Lk9;->e0:Luk1;

    .line 5
    .line 6
    return-object p1

    .line 7
    :cond_0
    iget-object p1, p0, Lk9;->f0:Luk1;

    .line 8
    .line 9
    return-object p1
.end method

.method public getAxisLeft()Leb1;
    .locals 1

    .line 1
    iget-object v0, p0, Lk9;->a0:Leb1;

    .line 2
    .line 3
    return-object v0
.end method

.method public getAxisRight()Leb1;
    .locals 1

    .line 1
    iget-object v0, p0, Lk9;->b0:Leb1;

    .line 2
    .line 3
    return-object v0
.end method

.method public bridge synthetic getData()Lm9;
    .locals 1

    .line 1
    invoke-super {p0}, Lje;->getData()Lle;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lm9;

    .line 6
    .line 7
    return-object v0
.end method

.method public getDrawListener()Lfj0;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method public getHighestVisibleX()F
    .locals 4

    .line 1
    iget-object v0, p0, Lk9;->e0:Luk1;

    .line 2
    .line 3
    iget-object v1, p0, Lje;->w:Lu61;

    .line 4
    .line 5
    iget-object v1, v1, Lu61;->b:Landroid/graphics/RectF;

    .line 6
    .line 7
    iget v2, v1, Landroid/graphics/RectF;->right:F

    .line 8
    .line 9
    iget v1, v1, Landroid/graphics/RectF;->bottom:F

    .line 10
    .line 11
    iget-object v3, p0, Lk9;->k0:Lz90;

    .line 12
    .line 13
    invoke-virtual {v0, v2, v1, v3}, Luk1;->b(FFLz90;)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lje;->n:Lcb1;

    .line 17
    .line 18
    iget v0, v0, Ld9;->v:F

    .line 19
    .line 20
    float-to-double v0, v0

    .line 21
    iget-wide v2, v3, Lz90;->g:D

    .line 22
    .line 23
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->min(DD)D

    .line 24
    .line 25
    .line 26
    move-result-wide v0

    .line 27
    double-to-float v0, v0

    .line 28
    return v0
.end method

.method public getLowestVisibleX()F
    .locals 4

    .line 1
    iget-object v0, p0, Lk9;->e0:Luk1;

    .line 2
    .line 3
    iget-object v1, p0, Lje;->w:Lu61;

    .line 4
    .line 5
    iget-object v1, v1, Lu61;->b:Landroid/graphics/RectF;

    .line 6
    .line 7
    iget v2, v1, Landroid/graphics/RectF;->left:F

    .line 8
    .line 9
    iget v1, v1, Landroid/graphics/RectF;->bottom:F

    .line 10
    .line 11
    iget-object v3, p0, Lk9;->j0:Lz90;

    .line 12
    .line 13
    invoke-virtual {v0, v2, v1, v3}, Luk1;->b(FFLz90;)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lje;->n:Lcb1;

    .line 17
    .line 18
    iget v0, v0, Ld9;->w:F

    .line 19
    .line 20
    float-to-double v0, v0

    .line 21
    iget-wide v2, v3, Lz90;->g:D

    .line 22
    .line 23
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->max(DD)D

    .line 24
    .line 25
    .line 26
    move-result-wide v0

    .line 27
    double-to-float v0, v0

    .line 28
    return v0
.end method

.method public getMaxVisibleCount()I
    .locals 1

    .line 1
    iget v0, p0, Lk9;->H:I

    .line 2
    .line 3
    return v0
.end method

.method public getMinOffset()F
    .locals 1

    .line 1
    iget v0, p0, Lk9;->V:F

    .line 2
    .line 3
    return v0
.end method

.method public getRendererLeftYAxis()Lfb1;
    .locals 1

    .line 1
    iget-object v0, p0, Lk9;->c0:Lfb1;

    .line 2
    .line 3
    return-object v0
.end method

.method public getRendererRightYAxis()Lfb1;
    .locals 1

    .line 1
    iget-object v0, p0, Lk9;->d0:Lfb1;

    .line 2
    .line 3
    return-object v0
.end method

.method public getRendererXAxis()Ldb1;
    .locals 1

    .line 1
    iget-object v0, p0, Lk9;->g0:Ldb1;

    .line 2
    .line 3
    return-object v0
.end method

.method public getScaleX()F
    .locals 1

    .line 1
    iget-object v0, p0, Lje;->w:Lu61;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/high16 v0, 0x3f800000    # 1.0f

    .line 6
    .line 7
    return v0

    .line 8
    :cond_0
    iget v0, v0, Lu61;->i:F

    .line 9
    .line 10
    return v0
.end method

.method public getScaleY()F
    .locals 1

    .line 1
    iget-object v0, p0, Lje;->w:Lu61;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/high16 v0, 0x3f800000    # 1.0f

    .line 6
    .line 7
    return v0

    .line 8
    :cond_0
    iget v0, v0, Lu61;->j:F

    .line 9
    .line 10
    return v0
.end method

.method public getVisibleXRange()F
    .locals 2

    .line 1
    invoke-virtual {p0}, Lk9;->getHighestVisibleX()F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, Lk9;->getLowestVisibleX()F

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    sub-float/2addr v0, v1

    .line 10
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    return v0
.end method

.method public getYChartMax()F
    .locals 2

    .line 1
    iget-object v0, p0, Lk9;->a0:Leb1;

    .line 2
    .line 3
    iget v0, v0, Ld9;->v:F

    .line 4
    .line 5
    iget-object v1, p0, Lk9;->b0:Leb1;

    .line 6
    .line 7
    iget v1, v1, Ld9;->v:F

    .line 8
    .line 9
    invoke-static {v0, v1}, Ljava/lang/Math;->max(FF)F

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    return v0
.end method

.method public getYChartMin()F
    .locals 2

    .line 1
    iget-object v0, p0, Lk9;->a0:Leb1;

    .line 2
    .line 3
    iget v0, v0, Ld9;->w:F

    .line 4
    .line 5
    iget-object v1, p0, Lk9;->b0:Leb1;

    .line 6
    .line 7
    iget v1, v1, Ld9;->w:F

    .line 8
    .line 9
    invoke-static {v0, v1}, Ljava/lang/Math;->min(FF)F

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    return v0
.end method

.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 47

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v7, v0, Lje;->w:Lu61;

    .line 6
    .line 7
    invoke-super/range {p0 .. p1}, Lje;->onDraw(Landroid/graphics/Canvas;)V

    .line 8
    .line 9
    .line 10
    iget-object v2, v0, Lje;->g:Lle;

    .line 11
    .line 12
    if-nez v2, :cond_0

    .line 13
    .line 14
    goto/16 :goto_41

    .line 15
    .line 16
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 17
    .line 18
    .line 19
    iget-boolean v2, v0, Lk9;->S:Z

    .line 20
    .line 21
    if-eqz v2, :cond_1

    .line 22
    .line 23
    iget-object v2, v7, Lu61;->b:Landroid/graphics/RectF;

    .line 24
    .line 25
    iget-object v3, v0, Lk9;->Q:Landroid/graphics/Paint;

    .line 26
    .line 27
    invoke-virtual {v1, v2, v3}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    .line 28
    .line 29
    .line 30
    :cond_1
    iget-boolean v2, v0, Lk9;->T:Z

    .line 31
    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    iget-object v2, v7, Lu61;->b:Landroid/graphics/RectF;

    .line 35
    .line 36
    iget-object v3, v0, Lk9;->R:Landroid/graphics/Paint;

    .line 37
    .line 38
    invoke-virtual {v1, v2, v3}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    .line 39
    .line 40
    .line 41
    :cond_2
    iget-boolean v2, v0, Lk9;->I:Z

    .line 42
    .line 43
    const/4 v8, 0x2

    .line 44
    const/4 v9, 0x1

    .line 45
    if-eqz v2, :cond_16

    .line 46
    .line 47
    invoke-virtual {v0}, Lk9;->getLowestVisibleX()F

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    invoke-virtual {v0}, Lk9;->getHighestVisibleX()F

    .line 52
    .line 53
    .line 54
    move-result v3

    .line 55
    iget-object v4, v0, Lje;->g:Lle;

    .line 56
    .line 57
    check-cast v4, Lm9;

    .line 58
    .line 59
    iget-object v5, v4, Lle;->i:Ljava/util/ArrayList;

    .line 60
    .line 61
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 62
    .line 63
    .line 64
    move-result v6

    .line 65
    const/4 v12, 0x0

    .line 66
    :goto_0
    const v13, 0x7f7fffff    # Float.MAX_VALUE

    .line 67
    .line 68
    .line 69
    const v14, -0x800001

    .line 70
    .line 71
    .line 72
    if-ge v12, v6, :cond_7

    .line 73
    .line 74
    invoke-virtual {v5, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v15

    .line 78
    add-int/lit8 v12, v12, 0x1

    .line 79
    .line 80
    check-cast v15, Lq10;

    .line 81
    .line 82
    check-cast v15, Ll60;

    .line 83
    .line 84
    iget-object v11, v15, Ll60;->o:Ljava/util/ArrayList;

    .line 85
    .line 86
    if-eqz v11, :cond_6

    .line 87
    .line 88
    invoke-virtual {v11}, Ljava/util/ArrayList;->isEmpty()Z

    .line 89
    .line 90
    .line 91
    move-result v17

    .line 92
    if-eqz v17, :cond_3

    .line 93
    .line 94
    goto :goto_2

    .line 95
    :cond_3
    iput v14, v15, Ll60;->p:F

    .line 96
    .line 97
    iput v13, v15, Ll60;->q:F

    .line 98
    .line 99
    const/high16 v13, 0x7fc00000    # Float.NaN

    .line 100
    .line 101
    invoke-virtual {v15, v2, v13, v8}, Ll60;->d(FFI)I

    .line 102
    .line 103
    .line 104
    move-result v14

    .line 105
    invoke-virtual {v15, v3, v13, v9}, Ll60;->d(FFI)I

    .line 106
    .line 107
    .line 108
    move-result v13

    .line 109
    :goto_1
    if-gt v14, v13, :cond_6

    .line 110
    .line 111
    invoke-virtual {v11, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v17

    .line 115
    move-object/from16 v10, v17

    .line 116
    .line 117
    check-cast v10, Lxs;

    .line 118
    .line 119
    iget v10, v10, Lxs;->f:F

    .line 120
    .line 121
    iget v8, v15, Ll60;->q:F

    .line 122
    .line 123
    cmpg-float v8, v10, v8

    .line 124
    .line 125
    if-gez v8, :cond_4

    .line 126
    .line 127
    iput v10, v15, Ll60;->q:F

    .line 128
    .line 129
    :cond_4
    iget v8, v15, Ll60;->p:F

    .line 130
    .line 131
    cmpl-float v8, v10, v8

    .line 132
    .line 133
    if-lez v8, :cond_5

    .line 134
    .line 135
    iput v10, v15, Ll60;->p:F

    .line 136
    .line 137
    :cond_5
    add-int/lit8 v14, v14, 0x1

    .line 138
    .line 139
    const/4 v8, 0x2

    .line 140
    goto :goto_1

    .line 141
    :cond_6
    :goto_2
    const/4 v8, 0x2

    .line 142
    goto :goto_0

    .line 143
    :cond_7
    if-nez v5, :cond_8

    .line 144
    .line 145
    goto/16 :goto_8

    .line 146
    .line 147
    :cond_8
    iput v14, v4, Lle;->a:F

    .line 148
    .line 149
    iput v13, v4, Lle;->b:F

    .line 150
    .line 151
    iput v14, v4, Lle;->c:F

    .line 152
    .line 153
    iput v13, v4, Lle;->d:F

    .line 154
    .line 155
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 156
    .line 157
    .line 158
    move-result v2

    .line 159
    const/4 v3, 0x0

    .line 160
    :goto_3
    if-ge v3, v2, :cond_9

    .line 161
    .line 162
    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v6

    .line 166
    add-int/lit8 v3, v3, 0x1

    .line 167
    .line 168
    check-cast v6, Lq10;

    .line 169
    .line 170
    invoke-virtual {v4, v6}, Lle;->c(Lq10;)V

    .line 171
    .line 172
    .line 173
    goto :goto_3

    .line 174
    :cond_9
    iput v14, v4, Lle;->e:F

    .line 175
    .line 176
    iput v13, v4, Lle;->f:F

    .line 177
    .line 178
    iput v14, v4, Lle;->g:F

    .line 179
    .line 180
    iput v13, v4, Lle;->h:F

    .line 181
    .line 182
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 183
    .line 184
    .line 185
    move-result v2

    .line 186
    const/4 v3, 0x0

    .line 187
    :cond_a
    if-ge v3, v2, :cond_b

    .line 188
    .line 189
    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    move-result-object v6

    .line 193
    add-int/lit8 v3, v3, 0x1

    .line 194
    .line 195
    check-cast v6, Lq10;

    .line 196
    .line 197
    move-object v8, v6

    .line 198
    check-cast v8, Ll60;

    .line 199
    .line 200
    iget v8, v8, Ll60;->d:I

    .line 201
    .line 202
    if-ne v8, v9, :cond_a

    .line 203
    .line 204
    goto :goto_4

    .line 205
    :cond_b
    const/4 v6, 0x0

    .line 206
    :goto_4
    if-eqz v6, :cond_e

    .line 207
    .line 208
    check-cast v6, Ll60;

    .line 209
    .line 210
    iget v2, v6, Ll60;->p:F

    .line 211
    .line 212
    iput v2, v4, Lle;->e:F

    .line 213
    .line 214
    iget v2, v6, Ll60;->q:F

    .line 215
    .line 216
    iput v2, v4, Lle;->f:F

    .line 217
    .line 218
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 219
    .line 220
    .line 221
    move-result v2

    .line 222
    const/4 v3, 0x0

    .line 223
    :cond_c
    :goto_5
    if-ge v3, v2, :cond_e

    .line 224
    .line 225
    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    move-result-object v6

    .line 229
    add-int/lit8 v3, v3, 0x1

    .line 230
    .line 231
    check-cast v6, Lq10;

    .line 232
    .line 233
    move-object v8, v6

    .line 234
    check-cast v8, Ll60;

    .line 235
    .line 236
    iget v8, v8, Ll60;->d:I

    .line 237
    .line 238
    if-ne v8, v9, :cond_c

    .line 239
    .line 240
    check-cast v6, Ll60;

    .line 241
    .line 242
    iget v8, v6, Ll60;->q:F

    .line 243
    .line 244
    iget v10, v4, Lle;->f:F

    .line 245
    .line 246
    cmpg-float v10, v8, v10

    .line 247
    .line 248
    if-gez v10, :cond_d

    .line 249
    .line 250
    iput v8, v4, Lle;->f:F

    .line 251
    .line 252
    :cond_d
    iget v6, v6, Ll60;->p:F

    .line 253
    .line 254
    iget v8, v4, Lle;->e:F

    .line 255
    .line 256
    cmpl-float v8, v6, v8

    .line 257
    .line 258
    if-lez v8, :cond_c

    .line 259
    .line 260
    iput v6, v4, Lle;->e:F

    .line 261
    .line 262
    goto :goto_5

    .line 263
    :cond_e
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 264
    .line 265
    .line 266
    move-result v2

    .line 267
    const/4 v3, 0x0

    .line 268
    :cond_f
    if-ge v3, v2, :cond_10

    .line 269
    .line 270
    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 271
    .line 272
    .line 273
    move-result-object v6

    .line 274
    add-int/lit8 v3, v3, 0x1

    .line 275
    .line 276
    check-cast v6, Lq10;

    .line 277
    .line 278
    move-object v8, v6

    .line 279
    check-cast v8, Ll60;

    .line 280
    .line 281
    iget v8, v8, Ll60;->d:I

    .line 282
    .line 283
    const/4 v10, 0x2

    .line 284
    if-ne v8, v10, :cond_f

    .line 285
    .line 286
    goto :goto_6

    .line 287
    :cond_10
    const/4 v6, 0x0

    .line 288
    :goto_6
    if-eqz v6, :cond_13

    .line 289
    .line 290
    check-cast v6, Ll60;

    .line 291
    .line 292
    iget v2, v6, Ll60;->p:F

    .line 293
    .line 294
    iput v2, v4, Lle;->g:F

    .line 295
    .line 296
    iget v2, v6, Ll60;->q:F

    .line 297
    .line 298
    iput v2, v4, Lle;->h:F

    .line 299
    .line 300
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 301
    .line 302
    .line 303
    move-result v2

    .line 304
    const/4 v3, 0x0

    .line 305
    :cond_11
    :goto_7
    if-ge v3, v2, :cond_13

    .line 306
    .line 307
    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 308
    .line 309
    .line 310
    move-result-object v6

    .line 311
    add-int/lit8 v3, v3, 0x1

    .line 312
    .line 313
    check-cast v6, Lq10;

    .line 314
    .line 315
    move-object v8, v6

    .line 316
    check-cast v8, Ll60;

    .line 317
    .line 318
    iget v8, v8, Ll60;->d:I

    .line 319
    .line 320
    const/4 v10, 0x2

    .line 321
    if-ne v8, v10, :cond_11

    .line 322
    .line 323
    check-cast v6, Ll60;

    .line 324
    .line 325
    iget v8, v6, Ll60;->q:F

    .line 326
    .line 327
    iget v10, v4, Lle;->h:F

    .line 328
    .line 329
    cmpg-float v10, v8, v10

    .line 330
    .line 331
    if-gez v10, :cond_12

    .line 332
    .line 333
    iput v8, v4, Lle;->h:F

    .line 334
    .line 335
    :cond_12
    iget v6, v6, Ll60;->p:F

    .line 336
    .line 337
    iget v8, v4, Lle;->g:F

    .line 338
    .line 339
    cmpl-float v8, v6, v8

    .line 340
    .line 341
    if-lez v8, :cond_11

    .line 342
    .line 343
    iput v6, v4, Lle;->g:F

    .line 344
    .line 345
    goto :goto_7

    .line 346
    :cond_13
    :goto_8
    iget-object v2, v0, Lje;->n:Lcb1;

    .line 347
    .line 348
    iget-object v3, v0, Lje;->g:Lle;

    .line 349
    .line 350
    check-cast v3, Lm9;

    .line 351
    .line 352
    iget v4, v3, Lle;->d:F

    .line 353
    .line 354
    iget v3, v3, Lle;->c:F

    .line 355
    .line 356
    invoke-virtual {v2, v4, v3}, Ld9;->a(FF)V

    .line 357
    .line 358
    .line 359
    iget-object v2, v0, Lk9;->a0:Leb1;

    .line 360
    .line 361
    iget-boolean v3, v2, Ldh;->a:Z

    .line 362
    .line 363
    if-eqz v3, :cond_14

    .line 364
    .line 365
    iget-object v3, v0, Lje;->g:Lle;

    .line 366
    .line 367
    check-cast v3, Lm9;

    .line 368
    .line 369
    invoke-virtual {v3, v9}, Lle;->g(I)F

    .line 370
    .line 371
    .line 372
    move-result v3

    .line 373
    iget-object v4, v0, Lje;->g:Lle;

    .line 374
    .line 375
    check-cast v4, Lm9;

    .line 376
    .line 377
    invoke-virtual {v4, v9}, Lle;->f(I)F

    .line 378
    .line 379
    .line 380
    move-result v4

    .line 381
    invoke-virtual {v2, v3, v4}, Leb1;->a(FF)V

    .line 382
    .line 383
    .line 384
    :cond_14
    iget-object v2, v0, Lk9;->b0:Leb1;

    .line 385
    .line 386
    iget-boolean v3, v2, Ldh;->a:Z

    .line 387
    .line 388
    if-eqz v3, :cond_15

    .line 389
    .line 390
    iget-object v3, v0, Lje;->g:Lle;

    .line 391
    .line 392
    check-cast v3, Lm9;

    .line 393
    .line 394
    const/4 v10, 0x2

    .line 395
    invoke-virtual {v3, v10}, Lle;->g(I)F

    .line 396
    .line 397
    .line 398
    move-result v3

    .line 399
    iget-object v4, v0, Lje;->g:Lle;

    .line 400
    .line 401
    check-cast v4, Lm9;

    .line 402
    .line 403
    invoke-virtual {v4, v10}, Lle;->f(I)F

    .line 404
    .line 405
    .line 406
    move-result v4

    .line 407
    invoke-virtual {v2, v3, v4}, Leb1;->a(FF)V

    .line 408
    .line 409
    .line 410
    :cond_15
    invoke-virtual {v0}, Lk9;->a()V

    .line 411
    .line 412
    .line 413
    :cond_16
    iget-object v2, v0, Lk9;->a0:Leb1;

    .line 414
    .line 415
    iget-boolean v3, v2, Ldh;->a:Z

    .line 416
    .line 417
    if-eqz v3, :cond_17

    .line 418
    .line 419
    iget-object v3, v0, Lk9;->c0:Lfb1;

    .line 420
    .line 421
    iget v4, v2, Ld9;->w:F

    .line 422
    .line 423
    iget v2, v2, Ld9;->v:F

    .line 424
    .line 425
    invoke-virtual {v3, v4, v2}, Le9;->U1(FF)V

    .line 426
    .line 427
    .line 428
    :cond_17
    iget-object v2, v0, Lk9;->b0:Leb1;

    .line 429
    .line 430
    iget-boolean v3, v2, Ldh;->a:Z

    .line 431
    .line 432
    if-eqz v3, :cond_18

    .line 433
    .line 434
    iget-object v3, v0, Lk9;->d0:Lfb1;

    .line 435
    .line 436
    iget v4, v2, Ld9;->w:F

    .line 437
    .line 438
    iget v2, v2, Ld9;->v:F

    .line 439
    .line 440
    invoke-virtual {v3, v4, v2}, Le9;->U1(FF)V

    .line 441
    .line 442
    .line 443
    :cond_18
    iget-object v2, v0, Lje;->n:Lcb1;

    .line 444
    .line 445
    iget-boolean v3, v2, Ldh;->a:Z

    .line 446
    .line 447
    if-eqz v3, :cond_19

    .line 448
    .line 449
    iget-object v3, v0, Lk9;->g0:Ldb1;

    .line 450
    .line 451
    iget v4, v2, Ld9;->w:F

    .line 452
    .line 453
    iget v2, v2, Ld9;->v:F

    .line 454
    .line 455
    invoke-virtual {v3, v4, v2}, Ldb1;->U1(FF)V

    .line 456
    .line 457
    .line 458
    :cond_19
    iget-object v2, v0, Lk9;->g0:Ldb1;

    .line 459
    .line 460
    iget-object v3, v2, Lf74;->g:Ljava/lang/Object;

    .line 461
    .line 462
    move-object v8, v3

    .line 463
    check-cast v8, Lu61;

    .line 464
    .line 465
    iget-object v6, v2, Le9;->m:Landroid/graphics/Paint;

    .line 466
    .line 467
    iget-object v2, v2, Ldb1;->n:Lcb1;

    .line 468
    .line 469
    iget-boolean v3, v2, Ld9;->q:Z

    .line 470
    .line 471
    iget v10, v2, Lcb1;->z:I

    .line 472
    .line 473
    const/4 v11, 0x3

    .line 474
    const/4 v12, 0x5

    .line 475
    const/4 v13, 0x4

    .line 476
    if-eqz v3, :cond_1f

    .line 477
    .line 478
    iget-boolean v3, v2, Ldh;->a:Z

    .line 479
    .line 480
    if-nez v3, :cond_1a

    .line 481
    .line 482
    goto :goto_d

    .line 483
    :cond_1a
    iget v3, v2, Ld9;->i:I

    .line 484
    .line 485
    invoke-virtual {v6, v3}, Landroid/graphics/Paint;->setColor(I)V

    .line 486
    .line 487
    .line 488
    iget v2, v2, Ld9;->j:F

    .line 489
    .line 490
    invoke-virtual {v6, v2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 491
    .line 492
    .line 493
    const/4 v2, 0x0

    .line 494
    invoke-virtual {v6, v2}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    .line 495
    .line 496
    .line 497
    if-eq v10, v9, :cond_1c

    .line 498
    .line 499
    if-eq v10, v13, :cond_1c

    .line 500
    .line 501
    if-ne v10, v11, :cond_1b

    .line 502
    .line 503
    goto :goto_a

    .line 504
    :cond_1b
    :goto_9
    const/4 v1, 0x2

    .line 505
    goto :goto_b

    .line 506
    :cond_1c
    :goto_a
    iget-object v2, v8, Lu61;->b:Landroid/graphics/RectF;

    .line 507
    .line 508
    iget v3, v2, Landroid/graphics/RectF;->left:F

    .line 509
    .line 510
    move v4, v3

    .line 511
    iget v3, v2, Landroid/graphics/RectF;->top:F

    .line 512
    .line 513
    iget v2, v2, Landroid/graphics/RectF;->right:F

    .line 514
    .line 515
    move v5, v3

    .line 516
    move/from16 v46, v4

    .line 517
    .line 518
    move v4, v2

    .line 519
    move/from16 v2, v46

    .line 520
    .line 521
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 522
    .line 523
    .line 524
    goto :goto_9

    .line 525
    :goto_b
    if-eq v10, v1, :cond_1e

    .line 526
    .line 527
    if-eq v10, v12, :cond_1e

    .line 528
    .line 529
    if-ne v10, v11, :cond_1d

    .line 530
    .line 531
    goto :goto_c

    .line 532
    :cond_1d
    move-object/from16 v1, p1

    .line 533
    .line 534
    goto :goto_d

    .line 535
    :cond_1e
    :goto_c
    iget-object v1, v8, Lu61;->b:Landroid/graphics/RectF;

    .line 536
    .line 537
    iget v2, v1, Landroid/graphics/RectF;->left:F

    .line 538
    .line 539
    iget v3, v1, Landroid/graphics/RectF;->bottom:F

    .line 540
    .line 541
    iget v4, v1, Landroid/graphics/RectF;->right:F

    .line 542
    .line 543
    move v5, v3

    .line 544
    move-object/from16 v1, p1

    .line 545
    .line 546
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 547
    .line 548
    .line 549
    :cond_1f
    :goto_d
    iget-object v2, v0, Lk9;->c0:Lfb1;

    .line 550
    .line 551
    invoke-virtual {v2, v1}, Lfb1;->Y1(Landroid/graphics/Canvas;)V

    .line 552
    .line 553
    .line 554
    iget-object v2, v0, Lk9;->d0:Lfb1;

    .line 555
    .line 556
    invoke-virtual {v2, v1}, Lfb1;->Y1(Landroid/graphics/Canvas;)V

    .line 557
    .line 558
    .line 559
    iget-object v2, v0, Lje;->n:Lcb1;

    .line 560
    .line 561
    iget-boolean v2, v2, Ld9;->t:Z

    .line 562
    .line 563
    if-eqz v2, :cond_20

    .line 564
    .line 565
    iget-object v2, v0, Lk9;->g0:Ldb1;

    .line 566
    .line 567
    invoke-virtual {v2, v1}, Ldb1;->X1(Landroid/graphics/Canvas;)V

    .line 568
    .line 569
    .line 570
    :cond_20
    iget-object v2, v0, Lk9;->a0:Leb1;

    .line 571
    .line 572
    iget-boolean v2, v2, Ld9;->t:Z

    .line 573
    .line 574
    if-eqz v2, :cond_21

    .line 575
    .line 576
    iget-object v2, v0, Lk9;->c0:Lfb1;

    .line 577
    .line 578
    invoke-virtual {v2, v1}, Lfb1;->Z1(Landroid/graphics/Canvas;)V

    .line 579
    .line 580
    .line 581
    :cond_21
    iget-object v2, v0, Lk9;->b0:Leb1;

    .line 582
    .line 583
    iget-boolean v2, v2, Ld9;->t:Z

    .line 584
    .line 585
    if-eqz v2, :cond_22

    .line 586
    .line 587
    iget-object v2, v0, Lk9;->d0:Lfb1;

    .line 588
    .line 589
    invoke-virtual {v2, v1}, Lfb1;->Z1(Landroid/graphics/Canvas;)V

    .line 590
    .line 591
    .line 592
    :cond_22
    iget-object v2, v0, Lje;->n:Lcb1;

    .line 593
    .line 594
    iget-boolean v2, v2, Ldh;->a:Z

    .line 595
    .line 596
    iget-object v2, v0, Lk9;->a0:Leb1;

    .line 597
    .line 598
    iget-boolean v2, v2, Ldh;->a:Z

    .line 599
    .line 600
    iget-object v2, v0, Lk9;->b0:Leb1;

    .line 601
    .line 602
    iget-boolean v2, v2, Ldh;->a:Z

    .line 603
    .line 604
    invoke-virtual {v1}, Landroid/graphics/Canvas;->save()I

    .line 605
    .line 606
    .line 607
    move-result v2

    .line 608
    iget-object v3, v7, Lu61;->b:Landroid/graphics/RectF;

    .line 609
    .line 610
    iget-object v4, v7, Lu61;->b:Landroid/graphics/RectF;

    .line 611
    .line 612
    invoke-virtual {v1, v3}, Landroid/graphics/Canvas;->clipRect(Landroid/graphics/RectF;)Z

    .line 613
    .line 614
    .line 615
    iget-object v3, v0, Lje;->u:Lom;

    .line 616
    .line 617
    check-cast v3, Li60;

    .line 618
    .line 619
    iget-object v5, v3, Lom;->j:Landroid/graphics/Paint;

    .line 620
    .line 621
    iget-object v6, v3, Li60;->o:Lcom/github/mikephil/charting/charts/LineChart;

    .line 622
    .line 623
    iget-object v8, v3, Lf74;->g:Ljava/lang/Object;

    .line 624
    .line 625
    check-cast v8, Lu61;

    .line 626
    .line 627
    iget v10, v8, Lu61;->c:F

    .line 628
    .line 629
    float-to-int v10, v10

    .line 630
    iget v14, v8, Lu61;->d:F

    .line 631
    .line 632
    float-to-int v14, v14

    .line 633
    iget-object v15, v3, Li60;->q:Ljava/lang/ref/WeakReference;

    .line 634
    .line 635
    if-nez v15, :cond_23

    .line 636
    .line 637
    const/4 v15, 0x0

    .line 638
    goto :goto_e

    .line 639
    :cond_23
    invoke-virtual {v15}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 640
    .line 641
    .line 642
    move-result-object v15

    .line 643
    check-cast v15, Landroid/graphics/Bitmap;

    .line 644
    .line 645
    :goto_e
    const/high16 v24, 0x42c80000    # 100.0f

    .line 646
    .line 647
    move/from16 v25, v12

    .line 648
    .line 649
    move/from16 v26, v13

    .line 650
    .line 651
    const/high16 v27, 0x3f800000    # 1.0f

    .line 652
    .line 653
    if-eqz v15, :cond_25

    .line 654
    .line 655
    invoke-virtual {v15}, Landroid/graphics/Bitmap;->getWidth()I

    .line 656
    .line 657
    .line 658
    move-result v13

    .line 659
    if-ne v13, v10, :cond_25

    .line 660
    .line 661
    invoke-virtual {v15}, Landroid/graphics/Bitmap;->getHeight()I

    .line 662
    .line 663
    .line 664
    move-result v13

    .line 665
    if-eq v13, v14, :cond_24

    .line 666
    .line 667
    goto :goto_10

    .line 668
    :cond_24
    :goto_f
    const/4 v10, 0x0

    .line 669
    goto :goto_11

    .line 670
    :cond_25
    :goto_10
    if-lez v10, :cond_4e

    .line 671
    .line 672
    if-lez v14, :cond_4e

    .line 673
    .line 674
    iget-object v13, v3, Li60;->s:Landroid/graphics/Bitmap$Config;

    .line 675
    .line 676
    invoke-static {v10, v14, v13}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 677
    .line 678
    .line 679
    move-result-object v15

    .line 680
    new-instance v10, Ljava/lang/ref/WeakReference;

    .line 681
    .line 682
    invoke-direct {v10, v15}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 683
    .line 684
    .line 685
    iput-object v10, v3, Li60;->q:Ljava/lang/ref/WeakReference;

    .line 686
    .line 687
    new-instance v10, Landroid/graphics/Canvas;

    .line 688
    .line 689
    invoke-direct {v10, v15}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 690
    .line 691
    .line 692
    iput-object v10, v3, Li60;->r:Landroid/graphics/Canvas;

    .line 693
    .line 694
    goto :goto_f

    .line 695
    :goto_11
    invoke-virtual {v15, v10}, Landroid/graphics/Bitmap;->eraseColor(I)V

    .line 696
    .line 697
    .line 698
    invoke-interface {v6}, Lk60;->getLineData()Lj60;

    .line 699
    .line 700
    .line 701
    move-result-object v10

    .line 702
    iget-object v10, v10, Lle;->i:Ljava/util/ArrayList;

    .line 703
    .line 704
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    .line 705
    .line 706
    .line 707
    move-result v13

    .line 708
    const/4 v14, 0x0

    .line 709
    :goto_12
    if-ge v14, v13, :cond_4d

    .line 710
    .line 711
    invoke-virtual {v10, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 712
    .line 713
    .line 714
    move-result-object v18

    .line 715
    add-int/lit8 v14, v14, 0x1

    .line 716
    .line 717
    move-object/from16 v12, v18

    .line 718
    .line 719
    check-cast v12, Ll60;

    .line 720
    .line 721
    iget-boolean v11, v12, Ll60;->n:Z

    .line 722
    .line 723
    if-eqz v11, :cond_4c

    .line 724
    .line 725
    iget-object v11, v3, Li60;->t:Landroid/graphics/Path;

    .line 726
    .line 727
    iget-object v9, v3, Li60;->u:Landroid/graphics/Path;

    .line 728
    .line 729
    move-object/from16 v38, v10

    .line 730
    .line 731
    iget-object v10, v3, Li60;->m:Lo9;

    .line 732
    .line 733
    move/from16 v39, v13

    .line 734
    .line 735
    iget-object v13, v3, Lom;->i:Lke;

    .line 736
    .line 737
    move-object/from16 v18, v13

    .line 738
    .line 739
    iget-object v13, v12, Ll60;->o:Ljava/util/ArrayList;

    .line 740
    .line 741
    move-object/from16 v19, v13

    .line 742
    .line 743
    iget v13, v12, Ll60;->d:I

    .line 744
    .line 745
    move/from16 v40, v14

    .line 746
    .line 747
    invoke-virtual/range {v19 .. v19}, Ljava/util/ArrayList;->size()I

    .line 748
    .line 749
    .line 750
    move-result v14

    .line 751
    move-object/from16 v41, v7

    .line 752
    .line 753
    const/4 v7, 0x1

    .line 754
    if-ge v14, v7, :cond_26

    .line 755
    .line 756
    move/from16 v43, v2

    .line 757
    .line 758
    move-object/from16 v42, v4

    .line 759
    .line 760
    move-object/from16 v45, v6

    .line 761
    .line 762
    goto/16 :goto_2b

    .line 763
    .line 764
    :cond_26
    iget v7, v12, Ll60;->z:F

    .line 765
    .line 766
    invoke-virtual {v5, v7}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 767
    .line 768
    .line 769
    iget-object v7, v12, Ll60;->H:Landroid/graphics/DashPathEffect;

    .line 770
    .line 771
    invoke-virtual {v5, v7}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    .line 772
    .line 773
    .line 774
    iget v7, v12, Ll60;->B:I

    .line 775
    .line 776
    invoke-static {v7}, Lex0;->s(I)I

    .line 777
    .line 778
    .line 779
    move-result v7

    .line 780
    const/4 v14, 0x2

    .line 781
    if-eq v7, v14, :cond_45

    .line 782
    .line 783
    const/4 v14, 0x3

    .line 784
    if-eq v7, v14, :cond_42

    .line 785
    .line 786
    invoke-virtual/range {v19 .. v19}, Ljava/util/ArrayList;->size()I

    .line 787
    .line 788
    .line 789
    move-result v7

    .line 790
    iget v9, v12, Ll60;->B:I

    .line 791
    .line 792
    const/4 v14, 0x2

    .line 793
    if-ne v9, v14, :cond_27

    .line 794
    .line 795
    const/4 v9, 0x1

    .line 796
    goto :goto_13

    .line 797
    :cond_27
    const/4 v9, 0x0

    .line 798
    :goto_13
    if-eqz v9, :cond_28

    .line 799
    .line 800
    move/from16 v11, v26

    .line 801
    .line 802
    goto :goto_14

    .line 803
    :cond_28
    const/4 v11, 0x2

    .line 804
    :goto_14
    invoke-virtual {v6, v13}, Lk9;->f(I)Luk1;

    .line 805
    .line 806
    .line 807
    move-result-object v13

    .line 808
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 809
    .line 810
    .line 811
    sget-object v14, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 812
    .line 813
    invoke-virtual {v5, v14}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 814
    .line 815
    .line 816
    iget-object v14, v12, Ll60;->H:Landroid/graphics/DashPathEffect;

    .line 817
    .line 818
    if-nez v14, :cond_29

    .line 819
    .line 820
    move-object v14, v1

    .line 821
    goto :goto_15

    .line 822
    :cond_29
    iget-object v14, v3, Li60;->r:Landroid/graphics/Canvas;

    .line 823
    .line 824
    :goto_15
    invoke-virtual {v10, v6, v12}, Lo9;->c(Ln9;Ll60;)V

    .line 825
    .line 826
    .line 827
    move/from16 v19, v7

    .line 828
    .line 829
    iget-boolean v7, v12, Ll60;->A:Z

    .line 830
    .line 831
    if-eqz v7, :cond_31

    .line 832
    .line 833
    if-lez v19, :cond_31

    .line 834
    .line 835
    iget-object v7, v3, Li60;->w:Landroid/graphics/Path;

    .line 836
    .line 837
    move/from16 v20, v9

    .line 838
    .line 839
    iget v9, v10, Lo9;->a:I

    .line 840
    .line 841
    move/from16 v18, v9

    .line 842
    .line 843
    iget v9, v10, Lo9;->c:I

    .line 844
    .line 845
    add-int v9, v9, v18

    .line 846
    .line 847
    move-object/from16 v42, v4

    .line 848
    .line 849
    const/4 v4, 0x0

    .line 850
    :goto_16
    move/from16 v43, v2

    .line 851
    .line 852
    mul-int/lit16 v2, v4, 0x80

    .line 853
    .line 854
    add-int v2, v2, v18

    .line 855
    .line 856
    move/from16 v21, v4

    .line 857
    .line 858
    add-int/lit16 v4, v2, 0x80

    .line 859
    .line 860
    if-le v4, v9, :cond_2a

    .line 861
    .line 862
    move v4, v9

    .line 863
    :cond_2a
    if-gt v2, v4, :cond_2f

    .line 864
    .line 865
    move/from16 v22, v9

    .line 866
    .line 867
    iget-object v9, v12, Ll60;->I:Lpz;

    .line 868
    .line 869
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 870
    .line 871
    .line 872
    invoke-static {v12, v6}, Lpz;->j(Ll60;Lk60;)F

    .line 873
    .line 874
    .line 875
    move-result v9

    .line 876
    iget v0, v12, Ll60;->B:I

    .line 877
    .line 878
    move-object/from16 v44, v15

    .line 879
    .line 880
    const/4 v15, 0x2

    .line 881
    if-ne v0, v15, :cond_2b

    .line 882
    .line 883
    const/4 v0, 0x1

    .line 884
    goto :goto_17

    .line 885
    :cond_2b
    const/4 v0, 0x0

    .line 886
    :goto_17
    invoke-virtual {v7}, Landroid/graphics/Path;->reset()V

    .line 887
    .line 888
    .line 889
    invoke-virtual {v12, v2}, Ll60;->b(I)Lxs;

    .line 890
    .line 891
    .line 892
    move-result-object v15

    .line 893
    move/from16 v23, v0

    .line 894
    .line 895
    iget v0, v15, Lxs;->h:F

    .line 896
    .line 897
    invoke-virtual {v7, v0, v9}, Landroid/graphics/Path;->moveTo(FF)V

    .line 898
    .line 899
    .line 900
    iget v0, v15, Lxs;->h:F

    .line 901
    .line 902
    move-object/from16 v45, v6

    .line 903
    .line 904
    iget v6, v15, Lxs;->f:F

    .line 905
    .line 906
    mul-float v6, v6, v27

    .line 907
    .line 908
    invoke-virtual {v7, v0, v6}, Landroid/graphics/Path;->lineTo(FF)V

    .line 909
    .line 910
    .line 911
    add-int/lit8 v0, v2, 0x1

    .line 912
    .line 913
    const/4 v6, 0x0

    .line 914
    :goto_18
    if-gt v0, v4, :cond_2d

    .line 915
    .line 916
    invoke-virtual {v12, v0}, Ll60;->b(I)Lxs;

    .line 917
    .line 918
    .line 919
    move-result-object v6

    .line 920
    move/from16 v30, v0

    .line 921
    .line 922
    if-eqz v23, :cond_2c

    .line 923
    .line 924
    iget v0, v6, Lxs;->h:F

    .line 925
    .line 926
    iget v15, v15, Lxs;->f:F

    .line 927
    .line 928
    mul-float v15, v15, v27

    .line 929
    .line 930
    invoke-virtual {v7, v0, v15}, Landroid/graphics/Path;->lineTo(FF)V

    .line 931
    .line 932
    .line 933
    :cond_2c
    iget v0, v6, Lxs;->h:F

    .line 934
    .line 935
    iget v15, v6, Lxs;->f:F

    .line 936
    .line 937
    mul-float v15, v15, v27

    .line 938
    .line 939
    invoke-virtual {v7, v0, v15}, Landroid/graphics/Path;->lineTo(FF)V

    .line 940
    .line 941
    .line 942
    add-int/lit8 v0, v30, 0x1

    .line 943
    .line 944
    move-object v15, v6

    .line 945
    goto :goto_18

    .line 946
    :cond_2d
    if-eqz v6, :cond_2e

    .line 947
    .line 948
    iget v0, v6, Lxs;->h:F

    .line 949
    .line 950
    invoke-virtual {v7, v0, v9}, Landroid/graphics/Path;->lineTo(FF)V

    .line 951
    .line 952
    .line 953
    :cond_2e
    invoke-virtual {v7}, Landroid/graphics/Path;->close()V

    .line 954
    .line 955
    .line 956
    invoke-virtual {v13, v7}, Luk1;->c(Landroid/graphics/Path;)V

    .line 957
    .line 958
    .line 959
    iget v0, v12, Ll60;->x:I

    .line 960
    .line 961
    iget v6, v12, Ll60;->y:I

    .line 962
    .line 963
    shl-int/lit8 v6, v6, 0x18

    .line 964
    .line 965
    const v9, 0xffffff

    .line 966
    .line 967
    .line 968
    and-int/2addr v0, v9

    .line 969
    or-int/2addr v0, v6

    .line 970
    sget-object v6, Lk41;->a:Landroid/util/DisplayMetrics;

    .line 971
    .line 972
    invoke-virtual {v1}, Landroid/graphics/Canvas;->save()I

    .line 973
    .line 974
    .line 975
    move-result v6

    .line 976
    invoke-virtual {v1, v7}, Landroid/graphics/Canvas;->clipPath(Landroid/graphics/Path;)Z

    .line 977
    .line 978
    .line 979
    invoke-virtual {v1, v0}, Landroid/graphics/Canvas;->drawColor(I)V

    .line 980
    .line 981
    .line 982
    invoke-virtual {v1, v6}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 983
    .line 984
    .line 985
    goto :goto_19

    .line 986
    :cond_2f
    move-object/from16 v45, v6

    .line 987
    .line 988
    move/from16 v22, v9

    .line 989
    .line 990
    move-object/from16 v44, v15

    .line 991
    .line 992
    :goto_19
    add-int/lit8 v0, v21, 0x1

    .line 993
    .line 994
    if-le v2, v4, :cond_30

    .line 995
    .line 996
    goto :goto_1a

    .line 997
    :cond_30
    move v4, v0

    .line 998
    move/from16 v9, v22

    .line 999
    .line 1000
    move/from16 v2, v43

    .line 1001
    .line 1002
    move-object/from16 v15, v44

    .line 1003
    .line 1004
    move-object/from16 v6, v45

    .line 1005
    .line 1006
    move-object/from16 v0, p0

    .line 1007
    .line 1008
    goto/16 :goto_16

    .line 1009
    .line 1010
    :cond_31
    move/from16 v43, v2

    .line 1011
    .line 1012
    move-object/from16 v42, v4

    .line 1013
    .line 1014
    move-object/from16 v45, v6

    .line 1015
    .line 1016
    move/from16 v20, v9

    .line 1017
    .line 1018
    move-object/from16 v44, v15

    .line 1019
    .line 1020
    :goto_1a
    iget-object v0, v12, Ll60;->a:Ljava/util/ArrayList;

    .line 1021
    .line 1022
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 1023
    .line 1024
    .line 1025
    move-result v0

    .line 1026
    const/4 v7, 0x1

    .line 1027
    if-le v0, v7, :cond_3b

    .line 1028
    .line 1029
    iget-object v0, v3, Li60;->v:[F

    .line 1030
    .line 1031
    array-length v0, v0

    .line 1032
    mul-int/lit8 v2, v11, 0x2

    .line 1033
    .line 1034
    if-gt v0, v2, :cond_32

    .line 1035
    .line 1036
    mul-int/lit8 v11, v11, 0x4

    .line 1037
    .line 1038
    new-array v0, v11, [F

    .line 1039
    .line 1040
    iput-object v0, v3, Li60;->v:[F

    .line 1041
    .line 1042
    :cond_32
    iget v0, v10, Lo9;->a:I

    .line 1043
    .line 1044
    :goto_1b
    iget v4, v10, Lo9;->c:I

    .line 1045
    .line 1046
    iget v6, v10, Lo9;->a:I

    .line 1047
    .line 1048
    add-int/2addr v4, v6

    .line 1049
    if-gt v0, v4, :cond_3a

    .line 1050
    .line 1051
    invoke-virtual {v12, v0}, Ll60;->b(I)Lxs;

    .line 1052
    .line 1053
    .line 1054
    move-result-object v4

    .line 1055
    if-nez v4, :cond_33

    .line 1056
    .line 1057
    goto/16 :goto_1e

    .line 1058
    .line 1059
    :cond_33
    iget-object v6, v3, Li60;->v:[F

    .line 1060
    .line 1061
    iget v7, v4, Lxs;->h:F

    .line 1062
    .line 1063
    const/16 v16, 0x0

    .line 1064
    .line 1065
    aput v7, v6, v16

    .line 1066
    .line 1067
    iget v4, v4, Lxs;->f:F

    .line 1068
    .line 1069
    mul-float v4, v4, v27

    .line 1070
    .line 1071
    const/16 v37, 0x1

    .line 1072
    .line 1073
    aput v4, v6, v37

    .line 1074
    .line 1075
    iget v9, v10, Lo9;->b:I

    .line 1076
    .line 1077
    if-ge v0, v9, :cond_36

    .line 1078
    .line 1079
    add-int/lit8 v4, v0, 0x1

    .line 1080
    .line 1081
    invoke-virtual {v12, v4}, Ll60;->b(I)Lxs;

    .line 1082
    .line 1083
    .line 1084
    move-result-object v4

    .line 1085
    if-nez v4, :cond_34

    .line 1086
    .line 1087
    goto/16 :goto_1f

    .line 1088
    .line 1089
    :cond_34
    iget v6, v4, Lxs;->h:F

    .line 1090
    .line 1091
    if-eqz v20, :cond_35

    .line 1092
    .line 1093
    iget-object v7, v3, Li60;->v:[F

    .line 1094
    .line 1095
    const/16 v17, 0x2

    .line 1096
    .line 1097
    aput v6, v7, v17

    .line 1098
    .line 1099
    const/16 v37, 0x1

    .line 1100
    .line 1101
    aget v9, v7, v37

    .line 1102
    .line 1103
    const/16 v29, 0x3

    .line 1104
    .line 1105
    aput v9, v7, v29

    .line 1106
    .line 1107
    aput v6, v7, v26

    .line 1108
    .line 1109
    aput v9, v7, v25

    .line 1110
    .line 1111
    const/4 v9, 0x6

    .line 1112
    aput v6, v7, v9

    .line 1113
    .line 1114
    iget v4, v4, Lxs;->f:F

    .line 1115
    .line 1116
    mul-float v4, v4, v27

    .line 1117
    .line 1118
    const/4 v6, 0x7

    .line 1119
    aput v4, v7, v6

    .line 1120
    .line 1121
    const/16 v17, 0x2

    .line 1122
    .line 1123
    goto :goto_1c

    .line 1124
    :cond_35
    iget-object v7, v3, Li60;->v:[F

    .line 1125
    .line 1126
    const/16 v17, 0x2

    .line 1127
    .line 1128
    aput v6, v7, v17

    .line 1129
    .line 1130
    iget v4, v4, Lxs;->f:F

    .line 1131
    .line 1132
    mul-float v4, v4, v27

    .line 1133
    .line 1134
    const/16 v29, 0x3

    .line 1135
    .line 1136
    aput v4, v7, v29

    .line 1137
    .line 1138
    goto :goto_1c

    .line 1139
    :cond_36
    const/16 v17, 0x2

    .line 1140
    .line 1141
    const/16 v29, 0x3

    .line 1142
    .line 1143
    aput v7, v6, v17

    .line 1144
    .line 1145
    aput v4, v6, v29

    .line 1146
    .line 1147
    :goto_1c
    iget-object v4, v3, Li60;->v:[F

    .line 1148
    .line 1149
    invoke-virtual {v13, v4}, Luk1;->e([F)V

    .line 1150
    .line 1151
    .line 1152
    iget-object v4, v3, Li60;->v:[F

    .line 1153
    .line 1154
    const/16 v16, 0x0

    .line 1155
    .line 1156
    aget v4, v4, v16

    .line 1157
    .line 1158
    invoke-virtual {v8, v4}, Lu61;->c(F)Z

    .line 1159
    .line 1160
    .line 1161
    move-result v4

    .line 1162
    if-nez v4, :cond_37

    .line 1163
    .line 1164
    goto :goto_1f

    .line 1165
    :cond_37
    iget-object v4, v3, Li60;->v:[F

    .line 1166
    .line 1167
    aget v4, v4, v17

    .line 1168
    .line 1169
    invoke-virtual {v8, v4}, Lu61;->b(F)Z

    .line 1170
    .line 1171
    .line 1172
    move-result v4

    .line 1173
    if-eqz v4, :cond_39

    .line 1174
    .line 1175
    iget-object v4, v3, Li60;->v:[F

    .line 1176
    .line 1177
    const/16 v37, 0x1

    .line 1178
    .line 1179
    aget v6, v4, v37

    .line 1180
    .line 1181
    iget-object v7, v8, Lu61;->b:Landroid/graphics/RectF;

    .line 1182
    .line 1183
    iget v9, v7, Landroid/graphics/RectF;->top:F

    .line 1184
    .line 1185
    cmpg-float v6, v9, v6

    .line 1186
    .line 1187
    if-gtz v6, :cond_38

    .line 1188
    .line 1189
    goto :goto_1d

    .line 1190
    :cond_38
    const/16 v29, 0x3

    .line 1191
    .line 1192
    aget v4, v4, v29

    .line 1193
    .line 1194
    mul-float v4, v4, v24

    .line 1195
    .line 1196
    float-to-int v4, v4

    .line 1197
    int-to-float v4, v4

    .line 1198
    div-float v4, v4, v24

    .line 1199
    .line 1200
    iget v6, v7, Landroid/graphics/RectF;->bottom:F

    .line 1201
    .line 1202
    cmpl-float v4, v6, v4

    .line 1203
    .line 1204
    if-ltz v4, :cond_39

    .line 1205
    .line 1206
    :goto_1d
    iget-object v4, v12, Ll60;->a:Ljava/util/ArrayList;

    .line 1207
    .line 1208
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 1209
    .line 1210
    .line 1211
    move-result v6

    .line 1212
    rem-int v6, v0, v6

    .line 1213
    .line 1214
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1215
    .line 1216
    .line 1217
    move-result-object v4

    .line 1218
    check-cast v4, Ljava/lang/Integer;

    .line 1219
    .line 1220
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 1221
    .line 1222
    .line 1223
    move-result v4

    .line 1224
    invoke-virtual {v5, v4}, Landroid/graphics/Paint;->setColor(I)V

    .line 1225
    .line 1226
    .line 1227
    iget-object v4, v3, Li60;->v:[F

    .line 1228
    .line 1229
    const/4 v6, 0x0

    .line 1230
    invoke-virtual {v14, v4, v6, v2, v5}, Landroid/graphics/Canvas;->drawLines([FIILandroid/graphics/Paint;)V

    .line 1231
    .line 1232
    .line 1233
    :cond_39
    :goto_1e
    add-int/lit8 v0, v0, 0x1

    .line 1234
    .line 1235
    goto/16 :goto_1b

    .line 1236
    .line 1237
    :cond_3a
    :goto_1f
    const/4 v2, 0x0

    .line 1238
    goto/16 :goto_23

    .line 1239
    .line 1240
    :cond_3b
    iget-object v0, v3, Li60;->v:[F

    .line 1241
    .line 1242
    array-length v0, v0

    .line 1243
    mul-int v7, v19, v11

    .line 1244
    .line 1245
    invoke-static {v7, v11}, Ljava/lang/Math;->max(II)I

    .line 1246
    .line 1247
    .line 1248
    move-result v2

    .line 1249
    const/16 v17, 0x2

    .line 1250
    .line 1251
    mul-int/lit8 v2, v2, 0x2

    .line 1252
    .line 1253
    if-ge v0, v2, :cond_3c

    .line 1254
    .line 1255
    invoke-static {v7, v11}, Ljava/lang/Math;->max(II)I

    .line 1256
    .line 1257
    .line 1258
    move-result v0

    .line 1259
    mul-int/lit8 v0, v0, 0x4

    .line 1260
    .line 1261
    new-array v0, v0, [F

    .line 1262
    .line 1263
    iput-object v0, v3, Li60;->v:[F

    .line 1264
    .line 1265
    :cond_3c
    iget v0, v10, Lo9;->a:I

    .line 1266
    .line 1267
    invoke-virtual {v12, v0}, Ll60;->b(I)Lxs;

    .line 1268
    .line 1269
    .line 1270
    move-result-object v0

    .line 1271
    if-eqz v0, :cond_3a

    .line 1272
    .line 1273
    iget v0, v10, Lo9;->a:I

    .line 1274
    .line 1275
    const/4 v2, 0x0

    .line 1276
    :goto_20
    iget v4, v10, Lo9;->c:I

    .line 1277
    .line 1278
    iget v6, v10, Lo9;->a:I

    .line 1279
    .line 1280
    add-int/2addr v4, v6

    .line 1281
    if-gt v0, v4, :cond_41

    .line 1282
    .line 1283
    if-nez v0, :cond_3d

    .line 1284
    .line 1285
    const/4 v4, 0x0

    .line 1286
    goto :goto_21

    .line 1287
    :cond_3d
    add-int/lit8 v4, v0, -0x1

    .line 1288
    .line 1289
    :goto_21
    invoke-virtual {v12, v4}, Ll60;->b(I)Lxs;

    .line 1290
    .line 1291
    .line 1292
    move-result-object v4

    .line 1293
    invoke-virtual {v12, v0}, Ll60;->b(I)Lxs;

    .line 1294
    .line 1295
    .line 1296
    move-result-object v6

    .line 1297
    if-eqz v4, :cond_3e

    .line 1298
    .line 1299
    if-nez v6, :cond_3f

    .line 1300
    .line 1301
    :cond_3e
    move/from16 v18, v0

    .line 1302
    .line 1303
    goto :goto_22

    .line 1304
    :cond_3f
    iget v7, v6, Lxs;->h:F

    .line 1305
    .line 1306
    iget-object v9, v3, Li60;->v:[F

    .line 1307
    .line 1308
    add-int/lit8 v15, v2, 0x1

    .line 1309
    .line 1310
    move/from16 v18, v0

    .line 1311
    .line 1312
    iget v0, v4, Lxs;->h:F

    .line 1313
    .line 1314
    aput v0, v9, v2

    .line 1315
    .line 1316
    add-int/lit8 v0, v2, 0x2

    .line 1317
    .line 1318
    iget v4, v4, Lxs;->f:F

    .line 1319
    .line 1320
    mul-float v4, v4, v27

    .line 1321
    .line 1322
    aput v4, v9, v15

    .line 1323
    .line 1324
    if-eqz v20, :cond_40

    .line 1325
    .line 1326
    add-int/lit8 v15, v2, 0x3

    .line 1327
    .line 1328
    aput v7, v9, v0

    .line 1329
    .line 1330
    add-int/lit8 v0, v2, 0x4

    .line 1331
    .line 1332
    aput v4, v9, v15

    .line 1333
    .line 1334
    add-int/lit8 v15, v2, 0x5

    .line 1335
    .line 1336
    aput v7, v9, v0

    .line 1337
    .line 1338
    add-int/lit8 v0, v2, 0x6

    .line 1339
    .line 1340
    aput v4, v9, v15

    .line 1341
    .line 1342
    :cond_40
    add-int/lit8 v2, v0, 0x1

    .line 1343
    .line 1344
    aput v7, v9, v0

    .line 1345
    .line 1346
    const/16 v17, 0x2

    .line 1347
    .line 1348
    add-int/lit8 v0, v0, 0x2

    .line 1349
    .line 1350
    iget v4, v6, Lxs;->f:F

    .line 1351
    .line 1352
    mul-float v4, v4, v27

    .line 1353
    .line 1354
    aput v4, v9, v2

    .line 1355
    .line 1356
    move v2, v0

    .line 1357
    :goto_22
    add-int/lit8 v0, v18, 0x1

    .line 1358
    .line 1359
    goto :goto_20

    .line 1360
    :cond_41
    if-lez v2, :cond_3a

    .line 1361
    .line 1362
    iget-object v0, v3, Li60;->v:[F

    .line 1363
    .line 1364
    invoke-virtual {v13, v0}, Luk1;->e([F)V

    .line 1365
    .line 1366
    .line 1367
    iget v0, v10, Lo9;->c:I

    .line 1368
    .line 1369
    const/16 v37, 0x1

    .line 1370
    .line 1371
    add-int/lit8 v0, v0, 0x1

    .line 1372
    .line 1373
    mul-int/2addr v0, v11

    .line 1374
    invoke-static {v0, v11}, Ljava/lang/Math;->max(II)I

    .line 1375
    .line 1376
    .line 1377
    move-result v0

    .line 1378
    const/16 v17, 0x2

    .line 1379
    .line 1380
    mul-int/lit8 v0, v0, 0x2

    .line 1381
    .line 1382
    iget-object v2, v12, Ll60;->a:Ljava/util/ArrayList;

    .line 1383
    .line 1384
    const/4 v6, 0x0

    .line 1385
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1386
    .line 1387
    .line 1388
    move-result-object v2

    .line 1389
    check-cast v2, Ljava/lang/Integer;

    .line 1390
    .line 1391
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 1392
    .line 1393
    .line 1394
    move-result v2

    .line 1395
    invoke-virtual {v5, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 1396
    .line 1397
    .line 1398
    iget-object v2, v3, Li60;->v:[F

    .line 1399
    .line 1400
    invoke-virtual {v14, v2, v6, v0, v5}, Landroid/graphics/Canvas;->drawLines([FIILandroid/graphics/Paint;)V

    .line 1401
    .line 1402
    .line 1403
    goto/16 :goto_1f

    .line 1404
    .line 1405
    :goto_23
    invoke-virtual {v5, v2}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    .line 1406
    .line 1407
    .line 1408
    goto/16 :goto_2a

    .line 1409
    .line 1410
    :cond_42
    move/from16 v43, v2

    .line 1411
    .line 1412
    move-object/from16 v42, v4

    .line 1413
    .line 1414
    move-object/from16 v45, v6

    .line 1415
    .line 1416
    move-object/from16 v44, v15

    .line 1417
    .line 1418
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1419
    .line 1420
    .line 1421
    move-object/from16 v0, v45

    .line 1422
    .line 1423
    invoke-virtual {v0, v13}, Lk9;->f(I)Luk1;

    .line 1424
    .line 1425
    .line 1426
    move-result-object v22

    .line 1427
    invoke-virtual {v10, v0, v12}, Lo9;->c(Ln9;Ll60;)V

    .line 1428
    .line 1429
    .line 1430
    invoke-virtual {v11}, Landroid/graphics/Path;->reset()V

    .line 1431
    .line 1432
    .line 1433
    iget v2, v10, Lo9;->c:I

    .line 1434
    .line 1435
    const/4 v7, 0x1

    .line 1436
    if-lt v2, v7, :cond_43

    .line 1437
    .line 1438
    iget v2, v10, Lo9;->a:I

    .line 1439
    .line 1440
    invoke-virtual {v12, v2}, Ll60;->b(I)Lxs;

    .line 1441
    .line 1442
    .line 1443
    move-result-object v2

    .line 1444
    iget v4, v2, Lxs;->h:F

    .line 1445
    .line 1446
    iget v6, v2, Lxs;->f:F

    .line 1447
    .line 1448
    mul-float v6, v6, v27

    .line 1449
    .line 1450
    invoke-virtual {v11, v4, v6}, Landroid/graphics/Path;->moveTo(FF)V

    .line 1451
    .line 1452
    .line 1453
    iget v4, v10, Lo9;->a:I

    .line 1454
    .line 1455
    add-int/2addr v4, v7

    .line 1456
    :goto_24
    iget v6, v10, Lo9;->c:I

    .line 1457
    .line 1458
    iget v7, v10, Lo9;->a:I

    .line 1459
    .line 1460
    add-int/2addr v6, v7

    .line 1461
    if-gt v4, v6, :cond_43

    .line 1462
    .line 1463
    invoke-virtual {v12, v4}, Ll60;->b(I)Lxs;

    .line 1464
    .line 1465
    .line 1466
    move-result-object v6

    .line 1467
    iget v7, v2, Lxs;->h:F

    .line 1468
    .line 1469
    iget v13, v6, Lxs;->h:F

    .line 1470
    .line 1471
    sub-float v14, v13, v7

    .line 1472
    .line 1473
    const/high16 v15, 0x40000000    # 2.0f

    .line 1474
    .line 1475
    div-float/2addr v14, v15

    .line 1476
    add-float v31, v14, v7

    .line 1477
    .line 1478
    iget v2, v2, Lxs;->f:F

    .line 1479
    .line 1480
    mul-float v32, v2, v27

    .line 1481
    .line 1482
    iget v2, v6, Lxs;->f:F

    .line 1483
    .line 1484
    mul-float v34, v2, v27

    .line 1485
    .line 1486
    move/from16 v33, v31

    .line 1487
    .line 1488
    move/from16 v36, v34

    .line 1489
    .line 1490
    move-object/from16 v30, v11

    .line 1491
    .line 1492
    move/from16 v35, v13

    .line 1493
    .line 1494
    invoke-virtual/range {v30 .. v36}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    .line 1495
    .line 1496
    .line 1497
    move-object/from16 v2, v30

    .line 1498
    .line 1499
    add-int/lit8 v4, v4, 0x1

    .line 1500
    .line 1501
    move-object v11, v2

    .line 1502
    move-object v2, v6

    .line 1503
    goto :goto_24

    .line 1504
    :cond_43
    move-object v2, v11

    .line 1505
    iget-boolean v4, v12, Ll60;->A:Z

    .line 1506
    .line 1507
    if-eqz v4, :cond_44

    .line 1508
    .line 1509
    invoke-virtual {v9}, Landroid/graphics/Path;->reset()V

    .line 1510
    .line 1511
    .line 1512
    invoke-virtual {v9, v2}, Landroid/graphics/Path;->addPath(Landroid/graphics/Path;)V

    .line 1513
    .line 1514
    .line 1515
    iget-object v4, v3, Li60;->r:Landroid/graphics/Canvas;

    .line 1516
    .line 1517
    iget-object v6, v3, Li60;->m:Lo9;

    .line 1518
    .line 1519
    move-object/from16 v18, v3

    .line 1520
    .line 1521
    move-object/from16 v19, v4

    .line 1522
    .line 1523
    move-object/from16 v23, v6

    .line 1524
    .line 1525
    move-object/from16 v21, v9

    .line 1526
    .line 1527
    move-object/from16 v20, v12

    .line 1528
    .line 1529
    invoke-virtual/range {v18 .. v23}, Li60;->V1(Landroid/graphics/Canvas;Ll60;Landroid/graphics/Path;Luk1;Lo9;)V

    .line 1530
    .line 1531
    .line 1532
    move-object/from16 v4, v20

    .line 1533
    .line 1534
    :goto_25
    move-object/from16 v6, v22

    .line 1535
    .line 1536
    goto :goto_26

    .line 1537
    :cond_44
    move-object v4, v12

    .line 1538
    goto :goto_25

    .line 1539
    :goto_26
    iget-object v4, v4, Ll60;->a:Ljava/util/ArrayList;

    .line 1540
    .line 1541
    const/4 v10, 0x0

    .line 1542
    invoke-virtual {v4, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1543
    .line 1544
    .line 1545
    move-result-object v4

    .line 1546
    check-cast v4, Ljava/lang/Integer;

    .line 1547
    .line 1548
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 1549
    .line 1550
    .line 1551
    move-result v4

    .line 1552
    invoke-virtual {v5, v4}, Landroid/graphics/Paint;->setColor(I)V

    .line 1553
    .line 1554
    .line 1555
    sget-object v4, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 1556
    .line 1557
    invoke-virtual {v5, v4}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 1558
    .line 1559
    .line 1560
    invoke-virtual {v6, v2}, Luk1;->c(Landroid/graphics/Path;)V

    .line 1561
    .line 1562
    .line 1563
    iget-object v4, v3, Li60;->r:Landroid/graphics/Canvas;

    .line 1564
    .line 1565
    invoke-virtual {v4, v2, v5}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 1566
    .line 1567
    .line 1568
    const/4 v2, 0x0

    .line 1569
    invoke-virtual {v5, v2}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    .line 1570
    .line 1571
    .line 1572
    move-object/from16 v45, v0

    .line 1573
    .line 1574
    goto/16 :goto_2a

    .line 1575
    .line 1576
    :cond_45
    move/from16 v43, v2

    .line 1577
    .line 1578
    move-object/from16 v42, v4

    .line 1579
    .line 1580
    move-object v0, v6

    .line 1581
    move-object v6, v9

    .line 1582
    move-object v2, v11

    .line 1583
    move-object v4, v12

    .line 1584
    move-object/from16 v44, v15

    .line 1585
    .line 1586
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1587
    .line 1588
    .line 1589
    invoke-virtual {v0, v13}, Lk9;->f(I)Luk1;

    .line 1590
    .line 1591
    .line 1592
    move-result-object v22

    .line 1593
    invoke-virtual {v10, v0, v4}, Lo9;->c(Ln9;Ll60;)V

    .line 1594
    .line 1595
    .line 1596
    iget v7, v4, Ll60;->G:F

    .line 1597
    .line 1598
    invoke-virtual {v2}, Landroid/graphics/Path;->reset()V

    .line 1599
    .line 1600
    .line 1601
    iget v9, v10, Lo9;->c:I

    .line 1602
    .line 1603
    const/4 v11, 0x1

    .line 1604
    if-lt v9, v11, :cond_49

    .line 1605
    .line 1606
    iget v9, v10, Lo9;->a:I

    .line 1607
    .line 1608
    add-int/lit8 v11, v9, -0x1

    .line 1609
    .line 1610
    const/4 v12, 0x0

    .line 1611
    invoke-static {v11, v12}, Ljava/lang/Math;->max(II)I

    .line 1612
    .line 1613
    .line 1614
    move-result v11

    .line 1615
    invoke-virtual {v4, v11}, Ll60;->b(I)Lxs;

    .line 1616
    .line 1617
    .line 1618
    move-result-object v11

    .line 1619
    invoke-static {v9, v12}, Ljava/lang/Math;->max(II)I

    .line 1620
    .line 1621
    .line 1622
    move-result v9

    .line 1623
    invoke-virtual {v4, v9}, Ll60;->b(I)Lxs;

    .line 1624
    .line 1625
    .line 1626
    move-result-object v9

    .line 1627
    if-nez v9, :cond_46

    .line 1628
    .line 1629
    move-object/from16 v45, v0

    .line 1630
    .line 1631
    const/4 v2, 0x0

    .line 1632
    goto/16 :goto_2a

    .line 1633
    .line 1634
    :cond_46
    iget v12, v9, Lxs;->h:F

    .line 1635
    .line 1636
    iget v13, v9, Lxs;->f:F

    .line 1637
    .line 1638
    mul-float v13, v13, v27

    .line 1639
    .line 1640
    invoke-virtual {v2, v12, v13}, Landroid/graphics/Path;->moveTo(FF)V

    .line 1641
    .line 1642
    .line 1643
    iget v12, v10, Lo9;->a:I

    .line 1644
    .line 1645
    const/16 v37, 0x1

    .line 1646
    .line 1647
    add-int/lit8 v12, v12, 0x1

    .line 1648
    .line 1649
    const/4 v13, -0x1

    .line 1650
    move v14, v13

    .line 1651
    move v13, v12

    .line 1652
    move-object v12, v9

    .line 1653
    :goto_27
    iget v15, v10, Lo9;->c:I

    .line 1654
    .line 1655
    move-object/from16 v45, v0

    .line 1656
    .line 1657
    iget v0, v10, Lo9;->a:I

    .line 1658
    .line 1659
    add-int/2addr v15, v0

    .line 1660
    if-gt v13, v15, :cond_4a

    .line 1661
    .line 1662
    if-ne v14, v13, :cond_47

    .line 1663
    .line 1664
    goto :goto_28

    .line 1665
    :cond_47
    invoke-virtual {v4, v13}, Ll60;->b(I)Lxs;

    .line 1666
    .line 1667
    .line 1668
    move-result-object v9

    .line 1669
    :goto_28
    add-int/lit8 v0, v13, 0x1

    .line 1670
    .line 1671
    invoke-virtual/range {v19 .. v19}, Ljava/util/ArrayList;->size()I

    .line 1672
    .line 1673
    .line 1674
    move-result v14

    .line 1675
    if-ge v0, v14, :cond_48

    .line 1676
    .line 1677
    move v14, v0

    .line 1678
    goto :goto_29

    .line 1679
    :cond_48
    move v14, v13

    .line 1680
    :goto_29
    invoke-virtual {v4, v14}, Ll60;->b(I)Lxs;

    .line 1681
    .line 1682
    .line 1683
    move-result-object v13

    .line 1684
    iget v15, v9, Lxs;->h:F

    .line 1685
    .line 1686
    move/from16 v18, v0

    .line 1687
    .line 1688
    iget v0, v11, Lxs;->h:F

    .line 1689
    .line 1690
    sub-float v0, v15, v0

    .line 1691
    .line 1692
    mul-float/2addr v0, v7

    .line 1693
    move/from16 v20, v0

    .line 1694
    .line 1695
    iget v0, v9, Lxs;->f:F

    .line 1696
    .line 1697
    iget v11, v11, Lxs;->f:F

    .line 1698
    .line 1699
    sub-float v11, v0, v11

    .line 1700
    .line 1701
    mul-float/2addr v11, v7

    .line 1702
    move/from16 v21, v0

    .line 1703
    .line 1704
    iget v0, v13, Lxs;->h:F

    .line 1705
    .line 1706
    move/from16 v23, v0

    .line 1707
    .line 1708
    iget v0, v12, Lxs;->h:F

    .line 1709
    .line 1710
    sub-float v23, v23, v0

    .line 1711
    .line 1712
    mul-float v23, v23, v7

    .line 1713
    .line 1714
    move/from16 v30, v0

    .line 1715
    .line 1716
    iget v0, v13, Lxs;->f:F

    .line 1717
    .line 1718
    move/from16 v31, v0

    .line 1719
    .line 1720
    iget v0, v12, Lxs;->f:F

    .line 1721
    .line 1722
    sub-float v31, v31, v0

    .line 1723
    .line 1724
    mul-float v31, v31, v7

    .line 1725
    .line 1726
    add-float v20, v30, v20

    .line 1727
    .line 1728
    add-float/2addr v0, v11

    .line 1729
    mul-float v32, v0, v27

    .line 1730
    .line 1731
    sub-float v33, v15, v23

    .line 1732
    .line 1733
    sub-float v0, v21, v31

    .line 1734
    .line 1735
    mul-float v34, v0, v27

    .line 1736
    .line 1737
    mul-float v36, v21, v27

    .line 1738
    .line 1739
    move-object/from16 v30, v2

    .line 1740
    .line 1741
    move/from16 v35, v15

    .line 1742
    .line 1743
    move/from16 v31, v20

    .line 1744
    .line 1745
    invoke-virtual/range {v30 .. v36}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    .line 1746
    .line 1747
    .line 1748
    move-object v11, v12

    .line 1749
    move-object/from16 v0, v45

    .line 1750
    .line 1751
    move-object v12, v9

    .line 1752
    move-object v9, v13

    .line 1753
    move/from16 v13, v18

    .line 1754
    .line 1755
    goto :goto_27

    .line 1756
    :cond_49
    move-object/from16 v45, v0

    .line 1757
    .line 1758
    :cond_4a
    iget-boolean v0, v4, Ll60;->A:Z

    .line 1759
    .line 1760
    if-eqz v0, :cond_4b

    .line 1761
    .line 1762
    invoke-virtual {v6}, Landroid/graphics/Path;->reset()V

    .line 1763
    .line 1764
    .line 1765
    invoke-virtual {v6, v2}, Landroid/graphics/Path;->addPath(Landroid/graphics/Path;)V

    .line 1766
    .line 1767
    .line 1768
    iget-object v0, v3, Li60;->r:Landroid/graphics/Canvas;

    .line 1769
    .line 1770
    iget-object v7, v3, Li60;->m:Lo9;

    .line 1771
    .line 1772
    move-object/from16 v19, v0

    .line 1773
    .line 1774
    move-object/from16 v18, v3

    .line 1775
    .line 1776
    move-object/from16 v20, v4

    .line 1777
    .line 1778
    move-object/from16 v21, v6

    .line 1779
    .line 1780
    move-object/from16 v23, v7

    .line 1781
    .line 1782
    invoke-virtual/range {v18 .. v23}, Li60;->V1(Landroid/graphics/Canvas;Ll60;Landroid/graphics/Path;Luk1;Lo9;)V

    .line 1783
    .line 1784
    .line 1785
    :cond_4b
    move-object/from16 v0, v22

    .line 1786
    .line 1787
    iget-object v4, v4, Ll60;->a:Ljava/util/ArrayList;

    .line 1788
    .line 1789
    const/4 v6, 0x0

    .line 1790
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1791
    .line 1792
    .line 1793
    move-result-object v4

    .line 1794
    check-cast v4, Ljava/lang/Integer;

    .line 1795
    .line 1796
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 1797
    .line 1798
    .line 1799
    move-result v4

    .line 1800
    invoke-virtual {v5, v4}, Landroid/graphics/Paint;->setColor(I)V

    .line 1801
    .line 1802
    .line 1803
    sget-object v4, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 1804
    .line 1805
    invoke-virtual {v5, v4}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 1806
    .line 1807
    .line 1808
    invoke-virtual {v0, v2}, Luk1;->c(Landroid/graphics/Path;)V

    .line 1809
    .line 1810
    .line 1811
    iget-object v0, v3, Li60;->r:Landroid/graphics/Canvas;

    .line 1812
    .line 1813
    invoke-virtual {v0, v2, v5}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 1814
    .line 1815
    .line 1816
    const/4 v2, 0x0

    .line 1817
    invoke-virtual {v5, v2}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    .line 1818
    .line 1819
    .line 1820
    :goto_2a
    invoke-virtual {v5, v2}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    .line 1821
    .line 1822
    .line 1823
    goto :goto_2c

    .line 1824
    :cond_4c
    move/from16 v43, v2

    .line 1825
    .line 1826
    move-object/from16 v42, v4

    .line 1827
    .line 1828
    move-object/from16 v45, v6

    .line 1829
    .line 1830
    move-object/from16 v41, v7

    .line 1831
    .line 1832
    move-object/from16 v38, v10

    .line 1833
    .line 1834
    move/from16 v39, v13

    .line 1835
    .line 1836
    move/from16 v40, v14

    .line 1837
    .line 1838
    :goto_2b
    move-object/from16 v44, v15

    .line 1839
    .line 1840
    :goto_2c
    move-object/from16 v0, p0

    .line 1841
    .line 1842
    move-object/from16 v10, v38

    .line 1843
    .line 1844
    move/from16 v13, v39

    .line 1845
    .line 1846
    move/from16 v14, v40

    .line 1847
    .line 1848
    move-object/from16 v7, v41

    .line 1849
    .line 1850
    move-object/from16 v4, v42

    .line 1851
    .line 1852
    move/from16 v2, v43

    .line 1853
    .line 1854
    move-object/from16 v15, v44

    .line 1855
    .line 1856
    move-object/from16 v6, v45

    .line 1857
    .line 1858
    const/4 v9, 0x1

    .line 1859
    const/4 v11, 0x3

    .line 1860
    goto/16 :goto_12

    .line 1861
    .line 1862
    :cond_4d
    move/from16 v43, v2

    .line 1863
    .line 1864
    move-object/from16 v42, v4

    .line 1865
    .line 1866
    move-object/from16 v41, v7

    .line 1867
    .line 1868
    const/4 v0, 0x0

    .line 1869
    invoke-virtual {v1, v15, v0, v0, v5}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 1870
    .line 1871
    .line 1872
    :goto_2d
    move-object/from16 v0, p0

    .line 1873
    .line 1874
    goto :goto_2e

    .line 1875
    :cond_4e
    move/from16 v43, v2

    .line 1876
    .line 1877
    move-object/from16 v42, v4

    .line 1878
    .line 1879
    move-object/from16 v41, v7

    .line 1880
    .line 1881
    goto :goto_2d

    .line 1882
    :goto_2e
    iget-object v2, v0, Lje;->n:Lcb1;

    .line 1883
    .line 1884
    iget-boolean v2, v2, Ld9;->t:Z

    .line 1885
    .line 1886
    if-nez v2, :cond_4f

    .line 1887
    .line 1888
    iget-object v2, v0, Lk9;->g0:Ldb1;

    .line 1889
    .line 1890
    invoke-virtual {v2, v1}, Ldb1;->X1(Landroid/graphics/Canvas;)V

    .line 1891
    .line 1892
    .line 1893
    :cond_4f
    iget-object v2, v0, Lk9;->a0:Leb1;

    .line 1894
    .line 1895
    iget-boolean v2, v2, Ld9;->t:Z

    .line 1896
    .line 1897
    if-nez v2, :cond_50

    .line 1898
    .line 1899
    iget-object v2, v0, Lk9;->c0:Lfb1;

    .line 1900
    .line 1901
    invoke-virtual {v2, v1}, Lfb1;->Z1(Landroid/graphics/Canvas;)V

    .line 1902
    .line 1903
    .line 1904
    :cond_50
    iget-object v2, v0, Lk9;->b0:Leb1;

    .line 1905
    .line 1906
    iget-boolean v2, v2, Ld9;->t:Z

    .line 1907
    .line 1908
    if-nez v2, :cond_51

    .line 1909
    .line 1910
    iget-object v2, v0, Lk9;->d0:Lfb1;

    .line 1911
    .line 1912
    invoke-virtual {v2, v1}, Lfb1;->Z1(Landroid/graphics/Canvas;)V

    .line 1913
    .line 1914
    .line 1915
    :cond_51
    iget-object v2, v0, Lje;->D:[Lv00;

    .line 1916
    .line 1917
    if-eqz v2, :cond_58

    .line 1918
    .line 1919
    array-length v3, v2

    .line 1920
    if-lez v3, :cond_58

    .line 1921
    .line 1922
    const/16 v16, 0x0

    .line 1923
    .line 1924
    aget-object v3, v2, v16

    .line 1925
    .line 1926
    if-nez v3, :cond_52

    .line 1927
    .line 1928
    goto/16 :goto_31

    .line 1929
    .line 1930
    :cond_52
    iget-object v3, v0, Lje;->u:Lom;

    .line 1931
    .line 1932
    check-cast v3, Li60;

    .line 1933
    .line 1934
    iget-object v4, v3, Lom;->i:Lke;

    .line 1935
    .line 1936
    iget-object v5, v3, Li60;->o:Lcom/github/mikephil/charting/charts/LineChart;

    .line 1937
    .line 1938
    invoke-interface {v5}, Lk60;->getLineData()Lj60;

    .line 1939
    .line 1940
    .line 1941
    move-result-object v6

    .line 1942
    array-length v7, v2

    .line 1943
    const/4 v8, 0x0

    .line 1944
    :goto_2f
    if-ge v8, v7, :cond_58

    .line 1945
    .line 1946
    aget-object v9, v2, v8

    .line 1947
    .line 1948
    iget v10, v9, Lv00;->e:I

    .line 1949
    .line 1950
    invoke-virtual {v6, v10}, Lle;->d(I)Lq10;

    .line 1951
    .line 1952
    .line 1953
    move-result-object v10

    .line 1954
    check-cast v10, Ll60;

    .line 1955
    .line 1956
    if-eqz v10, :cond_57

    .line 1957
    .line 1958
    iget-object v11, v10, Ll60;->o:Ljava/util/ArrayList;

    .line 1959
    .line 1960
    iget-boolean v12, v10, Ll60;->e:Z

    .line 1961
    .line 1962
    if-nez v12, :cond_53

    .line 1963
    .line 1964
    goto/16 :goto_30

    .line 1965
    .line 1966
    :cond_53
    iget v12, v9, Lv00;->a:F

    .line 1967
    .line 1968
    iget v9, v9, Lv00;->b:F

    .line 1969
    .line 1970
    const/4 v14, 0x3

    .line 1971
    invoke-virtual {v10, v12, v9, v14}, Ll60;->c(FFI)Lxs;

    .line 1972
    .line 1973
    .line 1974
    move-result-object v9

    .line 1975
    if-nez v9, :cond_54

    .line 1976
    .line 1977
    goto/16 :goto_30

    .line 1978
    .line 1979
    :cond_54
    invoke-virtual {v11, v9}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    .line 1980
    .line 1981
    .line 1982
    move-result v12

    .line 1983
    int-to-float v12, v12

    .line 1984
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    .line 1985
    .line 1986
    .line 1987
    move-result v11

    .line 1988
    int-to-float v11, v11

    .line 1989
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1990
    .line 1991
    .line 1992
    mul-float v11, v11, v27

    .line 1993
    .line 1994
    cmpl-float v11, v12, v11

    .line 1995
    .line 1996
    if-ltz v11, :cond_55

    .line 1997
    .line 1998
    goto :goto_30

    .line 1999
    :cond_55
    iget v11, v10, Ll60;->d:I

    .line 2000
    .line 2001
    invoke-virtual {v5, v11}, Lk9;->f(I)Luk1;

    .line 2002
    .line 2003
    .line 2004
    move-result-object v11

    .line 2005
    iget v12, v9, Lxs;->h:F

    .line 2006
    .line 2007
    iget v9, v9, Lxs;->f:F

    .line 2008
    .line 2009
    mul-float v9, v9, v27

    .line 2010
    .line 2011
    iget-object v13, v11, Luk1;->k:Ljava/lang/Object;

    .line 2012
    .line 2013
    check-cast v13, [F

    .line 2014
    .line 2015
    const/16 v16, 0x0

    .line 2016
    .line 2017
    aput v12, v13, v16

    .line 2018
    .line 2019
    const/16 v37, 0x1

    .line 2020
    .line 2021
    aput v9, v13, v37

    .line 2022
    .line 2023
    invoke-virtual {v11, v13}, Luk1;->e([F)V

    .line 2024
    .line 2025
    .line 2026
    aget v9, v13, v16

    .line 2027
    .line 2028
    float-to-double v11, v9

    .line 2029
    aget v9, v13, v37

    .line 2030
    .line 2031
    float-to-double v14, v9

    .line 2032
    sget-object v9, Lz90;->i:Lni0;

    .line 2033
    .line 2034
    invoke-virtual {v9}, Lni0;->b()Lmi0;

    .line 2035
    .line 2036
    .line 2037
    move-result-object v9

    .line 2038
    check-cast v9, Lz90;

    .line 2039
    .line 2040
    iput-wide v11, v9, Lz90;->g:D

    .line 2041
    .line 2042
    iput-wide v14, v9, Lz90;->h:D

    .line 2043
    .line 2044
    double-to-float v9, v11

    .line 2045
    double-to-float v11, v14

    .line 2046
    iget-object v12, v3, Lf74;->g:Ljava/lang/Object;

    .line 2047
    .line 2048
    check-cast v12, Lu61;

    .line 2049
    .line 2050
    iget-object v13, v3, Li60;->n:Landroid/graphics/Path;

    .line 2051
    .line 2052
    iget-object v14, v3, Lom;->k:Landroid/graphics/Paint;

    .line 2053
    .line 2054
    iget v15, v10, Ll60;->t:I

    .line 2055
    .line 2056
    invoke-virtual {v14, v15}, Landroid/graphics/Paint;->setColor(I)V

    .line 2057
    .line 2058
    .line 2059
    iget v15, v10, Ll60;->w:F

    .line 2060
    .line 2061
    invoke-virtual {v14, v15}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 2062
    .line 2063
    .line 2064
    const/4 v15, 0x0

    .line 2065
    invoke-virtual {v14, v15}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    .line 2066
    .line 2067
    .line 2068
    iget-boolean v15, v10, Ll60;->u:Z

    .line 2069
    .line 2070
    if-eqz v15, :cond_56

    .line 2071
    .line 2072
    invoke-virtual {v13}, Landroid/graphics/Path;->reset()V

    .line 2073
    .line 2074
    .line 2075
    iget-object v15, v12, Lu61;->b:Landroid/graphics/RectF;

    .line 2076
    .line 2077
    iget v15, v15, Landroid/graphics/RectF;->top:F

    .line 2078
    .line 2079
    invoke-virtual {v13, v9, v15}, Landroid/graphics/Path;->moveTo(FF)V

    .line 2080
    .line 2081
    .line 2082
    iget-object v15, v12, Lu61;->b:Landroid/graphics/RectF;

    .line 2083
    .line 2084
    iget v15, v15, Landroid/graphics/RectF;->bottom:F

    .line 2085
    .line 2086
    invoke-virtual {v13, v9, v15}, Landroid/graphics/Path;->lineTo(FF)V

    .line 2087
    .line 2088
    .line 2089
    invoke-virtual {v1, v13, v14}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 2090
    .line 2091
    .line 2092
    :cond_56
    iget-boolean v9, v10, Ll60;->v:Z

    .line 2093
    .line 2094
    if-eqz v9, :cond_57

    .line 2095
    .line 2096
    invoke-virtual {v13}, Landroid/graphics/Path;->reset()V

    .line 2097
    .line 2098
    .line 2099
    iget-object v9, v12, Lu61;->b:Landroid/graphics/RectF;

    .line 2100
    .line 2101
    iget v9, v9, Landroid/graphics/RectF;->left:F

    .line 2102
    .line 2103
    invoke-virtual {v13, v9, v11}, Landroid/graphics/Path;->moveTo(FF)V

    .line 2104
    .line 2105
    .line 2106
    iget-object v9, v12, Lu61;->b:Landroid/graphics/RectF;

    .line 2107
    .line 2108
    iget v9, v9, Landroid/graphics/RectF;->right:F

    .line 2109
    .line 2110
    invoke-virtual {v13, v9, v11}, Landroid/graphics/Path;->lineTo(FF)V

    .line 2111
    .line 2112
    .line 2113
    invoke-virtual {v1, v13, v14}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 2114
    .line 2115
    .line 2116
    :cond_57
    :goto_30
    add-int/lit8 v8, v8, 0x1

    .line 2117
    .line 2118
    goto/16 :goto_2f

    .line 2119
    .line 2120
    :cond_58
    :goto_31
    move/from16 v2, v43

    .line 2121
    .line 2122
    invoke-virtual {v1, v2}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 2123
    .line 2124
    .line 2125
    iget-object v2, v0, Lje;->u:Lom;

    .line 2126
    .line 2127
    check-cast v2, Li60;

    .line 2128
    .line 2129
    iget-object v3, v2, Li60;->m:Lo9;

    .line 2130
    .line 2131
    iget-object v4, v2, Lf74;->g:Ljava/lang/Object;

    .line 2132
    .line 2133
    check-cast v4, Lu61;

    .line 2134
    .line 2135
    iget-object v5, v2, Li60;->x:Ljava/util/HashMap;

    .line 2136
    .line 2137
    iget-object v6, v2, Lom;->j:Landroid/graphics/Paint;

    .line 2138
    .line 2139
    sget-object v7, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 2140
    .line 2141
    invoke-virtual {v6, v7}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 2142
    .line 2143
    .line 2144
    iget-object v6, v2, Lom;->i:Lke;

    .line 2145
    .line 2146
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2147
    .line 2148
    .line 2149
    iget-object v6, v2, Li60;->y:[F

    .line 2150
    .line 2151
    const/16 v16, 0x0

    .line 2152
    .line 2153
    const/16 v28, 0x0

    .line 2154
    .line 2155
    aput v28, v6, v16

    .line 2156
    .line 2157
    const/16 v37, 0x1

    .line 2158
    .line 2159
    aput v28, v6, v37

    .line 2160
    .line 2161
    iget-object v7, v2, Li60;->o:Lcom/github/mikephil/charting/charts/LineChart;

    .line 2162
    .line 2163
    invoke-interface {v7}, Lk60;->getLineData()Lj60;

    .line 2164
    .line 2165
    .line 2166
    move-result-object v8

    .line 2167
    iget-object v8, v8, Lle;->i:Ljava/util/ArrayList;

    .line 2168
    .line 2169
    const/4 v10, 0x0

    .line 2170
    :goto_32
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 2171
    .line 2172
    .line 2173
    move-result v9

    .line 2174
    if-ge v10, v9, :cond_68

    .line 2175
    .line 2176
    invoke-virtual {v8, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 2177
    .line 2178
    .line 2179
    move-result-object v9

    .line 2180
    check-cast v9, Ll60;

    .line 2181
    .line 2182
    iget-boolean v11, v9, Ll60;->n:Z

    .line 2183
    .line 2184
    iget v12, v9, Ll60;->F:F

    .line 2185
    .line 2186
    if-eqz v11, :cond_59

    .line 2187
    .line 2188
    iget-boolean v11, v9, Ll60;->J:Z

    .line 2189
    .line 2190
    if-eqz v11, :cond_59

    .line 2191
    .line 2192
    iget-object v11, v9, Ll60;->o:Ljava/util/ArrayList;

    .line 2193
    .line 2194
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    .line 2195
    .line 2196
    .line 2197
    move-result v11

    .line 2198
    if-nez v11, :cond_5a

    .line 2199
    .line 2200
    :cond_59
    move-object/from16 v19, v2

    .line 2201
    .line 2202
    move-object/from16 v20, v5

    .line 2203
    .line 2204
    move-object/from16 v18, v7

    .line 2205
    .line 2206
    move-object/from16 v22, v8

    .line 2207
    .line 2208
    move/from16 v23, v10

    .line 2209
    .line 2210
    goto/16 :goto_3c

    .line 2211
    .line 2212
    :cond_5a
    iget-object v11, v2, Li60;->p:Landroid/graphics/Paint;

    .line 2213
    .line 2214
    iget v13, v9, Ll60;->D:I

    .line 2215
    .line 2216
    invoke-virtual {v11, v13}, Landroid/graphics/Paint;->setColor(I)V

    .line 2217
    .line 2218
    .line 2219
    iget v11, v9, Ll60;->d:I

    .line 2220
    .line 2221
    invoke-virtual {v7, v11}, Lk9;->f(I)Luk1;

    .line 2222
    .line 2223
    .line 2224
    move-result-object v11

    .line 2225
    invoke-virtual {v3, v7, v9}, Lo9;->c(Ln9;Ll60;)V

    .line 2226
    .line 2227
    .line 2228
    iget v13, v9, Ll60;->E:F

    .line 2229
    .line 2230
    iget-boolean v14, v9, Ll60;->K:Z

    .line 2231
    .line 2232
    if-eqz v14, :cond_5b

    .line 2233
    .line 2234
    cmpg-float v14, v12, v13

    .line 2235
    .line 2236
    if-gez v14, :cond_5b

    .line 2237
    .line 2238
    const/16 v28, 0x0

    .line 2239
    .line 2240
    cmpl-float v14, v12, v28

    .line 2241
    .line 2242
    if-lez v14, :cond_5b

    .line 2243
    .line 2244
    const/4 v14, 0x1

    .line 2245
    goto :goto_33

    .line 2246
    :cond_5b
    const/4 v14, 0x0

    .line 2247
    :goto_33
    if-eqz v14, :cond_5c

    .line 2248
    .line 2249
    iget v15, v9, Ll60;->D:I

    .line 2250
    .line 2251
    move-object/from16 v18, v7

    .line 2252
    .line 2253
    const v7, 0x112233

    .line 2254
    .line 2255
    .line 2256
    if-ne v15, v7, :cond_5d

    .line 2257
    .line 2258
    const/4 v7, 0x1

    .line 2259
    goto :goto_34

    .line 2260
    :cond_5c
    move-object/from16 v18, v7

    .line 2261
    .line 2262
    :cond_5d
    const/4 v7, 0x0

    .line 2263
    :goto_34
    invoke-virtual {v5, v9}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 2264
    .line 2265
    .line 2266
    move-result v15

    .line 2267
    if-eqz v15, :cond_5e

    .line 2268
    .line 2269
    invoke-virtual {v5, v9}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2270
    .line 2271
    .line 2272
    move-result-object v15

    .line 2273
    check-cast v15, Lh60;

    .line 2274
    .line 2275
    goto :goto_35

    .line 2276
    :cond_5e
    new-instance v15, Lh60;

    .line 2277
    .line 2278
    invoke-direct {v15, v2}, Lh60;-><init>(Li60;)V

    .line 2279
    .line 2280
    .line 2281
    invoke-virtual {v5, v9, v15}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2282
    .line 2283
    .line 2284
    :goto_35
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2285
    .line 2286
    .line 2287
    move-object/from16 v19, v2

    .line 2288
    .line 2289
    iget-object v2, v9, Ll60;->C:Ljava/util/ArrayList;

    .line 2290
    .line 2291
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 2292
    .line 2293
    .line 2294
    move-result v2

    .line 2295
    move-object/from16 v20, v5

    .line 2296
    .line 2297
    iget-object v5, v15, Lh60;->b:[Landroid/graphics/Bitmap;

    .line 2298
    .line 2299
    if-nez v5, :cond_5f

    .line 2300
    .line 2301
    new-array v2, v2, [Landroid/graphics/Bitmap;

    .line 2302
    .line 2303
    iput-object v2, v15, Lh60;->b:[Landroid/graphics/Bitmap;

    .line 2304
    .line 2305
    goto :goto_36

    .line 2306
    :cond_5f
    array-length v5, v5

    .line 2307
    if-eq v5, v2, :cond_63

    .line 2308
    .line 2309
    new-array v2, v2, [Landroid/graphics/Bitmap;

    .line 2310
    .line 2311
    iput-object v2, v15, Lh60;->b:[Landroid/graphics/Bitmap;

    .line 2312
    .line 2313
    :goto_36
    iget-object v2, v15, Lh60;->a:Landroid/graphics/Path;

    .line 2314
    .line 2315
    iget-object v5, v15, Lh60;->c:Li60;

    .line 2316
    .line 2317
    move/from16 v21, v7

    .line 2318
    .line 2319
    iget-object v7, v9, Ll60;->C:Ljava/util/ArrayList;

    .line 2320
    .line 2321
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 2322
    .line 2323
    .line 2324
    move-result v7

    .line 2325
    move-object/from16 v22, v8

    .line 2326
    .line 2327
    iget v8, v9, Ll60;->E:F

    .line 2328
    .line 2329
    move/from16 v23, v10

    .line 2330
    .line 2331
    const/4 v10, 0x0

    .line 2332
    :goto_37
    if-ge v10, v7, :cond_62

    .line 2333
    .line 2334
    move/from16 v29, v7

    .line 2335
    .line 2336
    sget-object v7, Landroid/graphics/Bitmap$Config;->ARGB_4444:Landroid/graphics/Bitmap$Config;

    .line 2337
    .line 2338
    move/from16 v30, v13

    .line 2339
    .line 2340
    move/from16 v31, v14

    .line 2341
    .line 2342
    float-to-double v13, v8

    .line 2343
    const-wide v32, 0x4000cccccccccccdL    # 2.1

    .line 2344
    .line 2345
    .line 2346
    .line 2347
    .line 2348
    mul-double v13, v13, v32

    .line 2349
    .line 2350
    double-to-int v13, v13

    .line 2351
    invoke-static {v13, v13, v7}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 2352
    .line 2353
    .line 2354
    move-result-object v7

    .line 2355
    new-instance v13, Landroid/graphics/Canvas;

    .line 2356
    .line 2357
    invoke-direct {v13, v7}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 2358
    .line 2359
    .line 2360
    iget-object v14, v15, Lh60;->b:[Landroid/graphics/Bitmap;

    .line 2361
    .line 2362
    aput-object v7, v14, v10

    .line 2363
    .line 2364
    iget-object v7, v5, Lom;->j:Landroid/graphics/Paint;

    .line 2365
    .line 2366
    iget-object v14, v9, Ll60;->C:Ljava/util/ArrayList;

    .line 2367
    .line 2368
    invoke-virtual {v14, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 2369
    .line 2370
    .line 2371
    move-result-object v14

    .line 2372
    check-cast v14, Ljava/lang/Integer;

    .line 2373
    .line 2374
    invoke-virtual {v14}, Ljava/lang/Integer;->intValue()I

    .line 2375
    .line 2376
    .line 2377
    move-result v14

    .line 2378
    invoke-virtual {v7, v14}, Landroid/graphics/Paint;->setColor(I)V

    .line 2379
    .line 2380
    .line 2381
    if-eqz v21, :cond_60

    .line 2382
    .line 2383
    invoke-virtual {v2}, Landroid/graphics/Path;->reset()V

    .line 2384
    .line 2385
    .line 2386
    sget-object v14, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    .line 2387
    .line 2388
    invoke-virtual {v2, v8, v8, v8, v14}, Landroid/graphics/Path;->addCircle(FFFLandroid/graphics/Path$Direction;)V

    .line 2389
    .line 2390
    .line 2391
    sget-object v14, Landroid/graphics/Path$Direction;->CCW:Landroid/graphics/Path$Direction;

    .line 2392
    .line 2393
    invoke-virtual {v2, v8, v8, v12, v14}, Landroid/graphics/Path;->addCircle(FFFLandroid/graphics/Path$Direction;)V

    .line 2394
    .line 2395
    .line 2396
    invoke-virtual {v13, v2, v7}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 2397
    .line 2398
    .line 2399
    goto :goto_38

    .line 2400
    :cond_60
    invoke-virtual {v13, v8, v8, v8, v7}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 2401
    .line 2402
    .line 2403
    if-eqz v31, :cond_61

    .line 2404
    .line 2405
    iget-object v7, v5, Li60;->p:Landroid/graphics/Paint;

    .line 2406
    .line 2407
    invoke-virtual {v13, v8, v8, v12, v7}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 2408
    .line 2409
    .line 2410
    :cond_61
    :goto_38
    add-int/lit8 v10, v10, 0x1

    .line 2411
    .line 2412
    move/from16 v7, v29

    .line 2413
    .line 2414
    move/from16 v13, v30

    .line 2415
    .line 2416
    move/from16 v14, v31

    .line 2417
    .line 2418
    goto :goto_37

    .line 2419
    :cond_62
    :goto_39
    move/from16 v30, v13

    .line 2420
    .line 2421
    goto :goto_3a

    .line 2422
    :cond_63
    move-object/from16 v22, v8

    .line 2423
    .line 2424
    move/from16 v23, v10

    .line 2425
    .line 2426
    goto :goto_39

    .line 2427
    :goto_3a
    iget v2, v3, Lo9;->c:I

    .line 2428
    .line 2429
    iget v5, v3, Lo9;->a:I

    .line 2430
    .line 2431
    add-int/2addr v2, v5

    .line 2432
    :goto_3b
    if-gt v5, v2, :cond_67

    .line 2433
    .line 2434
    invoke-virtual {v9, v5}, Ll60;->b(I)Lxs;

    .line 2435
    .line 2436
    .line 2437
    move-result-object v7

    .line 2438
    if-nez v7, :cond_64

    .line 2439
    .line 2440
    goto :goto_3c

    .line 2441
    :cond_64
    iget v8, v7, Lxs;->h:F

    .line 2442
    .line 2443
    const/16 v16, 0x0

    .line 2444
    .line 2445
    aput v8, v6, v16

    .line 2446
    .line 2447
    iget v7, v7, Lxs;->f:F

    .line 2448
    .line 2449
    mul-float v7, v7, v27

    .line 2450
    .line 2451
    const/16 v37, 0x1

    .line 2452
    .line 2453
    aput v7, v6, v37

    .line 2454
    .line 2455
    invoke-virtual {v11, v6}, Luk1;->e([F)V

    .line 2456
    .line 2457
    .line 2458
    aget v7, v6, v16

    .line 2459
    .line 2460
    invoke-virtual {v4, v7}, Lu61;->c(F)Z

    .line 2461
    .line 2462
    .line 2463
    move-result v7

    .line 2464
    if-nez v7, :cond_65

    .line 2465
    .line 2466
    goto :goto_3c

    .line 2467
    :cond_65
    aget v7, v6, v16

    .line 2468
    .line 2469
    invoke-virtual {v4, v7}, Lu61;->b(F)Z

    .line 2470
    .line 2471
    .line 2472
    move-result v7

    .line 2473
    if-eqz v7, :cond_66

    .line 2474
    .line 2475
    aget v7, v6, v37

    .line 2476
    .line 2477
    iget-object v8, v4, Lu61;->b:Landroid/graphics/RectF;

    .line 2478
    .line 2479
    iget v10, v8, Landroid/graphics/RectF;->top:F

    .line 2480
    .line 2481
    cmpg-float v10, v10, v7

    .line 2482
    .line 2483
    if-gtz v10, :cond_66

    .line 2484
    .line 2485
    mul-float v10, v7, v24

    .line 2486
    .line 2487
    float-to-int v10, v10

    .line 2488
    int-to-float v10, v10

    .line 2489
    div-float v10, v10, v24

    .line 2490
    .line 2491
    iget v8, v8, Landroid/graphics/RectF;->bottom:F

    .line 2492
    .line 2493
    cmpl-float v8, v8, v10

    .line 2494
    .line 2495
    if-ltz v8, :cond_66

    .line 2496
    .line 2497
    iget-object v8, v15, Lh60;->b:[Landroid/graphics/Bitmap;

    .line 2498
    .line 2499
    array-length v10, v8

    .line 2500
    rem-int v10, v5, v10

    .line 2501
    .line 2502
    aget-object v8, v8, v10

    .line 2503
    .line 2504
    if-eqz v8, :cond_66

    .line 2505
    .line 2506
    const/16 v16, 0x0

    .line 2507
    .line 2508
    aget v10, v6, v16

    .line 2509
    .line 2510
    sub-float v10, v10, v30

    .line 2511
    .line 2512
    sub-float v7, v7, v30

    .line 2513
    .line 2514
    const/4 v12, 0x0

    .line 2515
    invoke-virtual {v1, v8, v10, v7, v12}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 2516
    .line 2517
    .line 2518
    :cond_66
    add-int/lit8 v5, v5, 0x1

    .line 2519
    .line 2520
    goto :goto_3b

    .line 2521
    :cond_67
    :goto_3c
    add-int/lit8 v10, v23, 0x1

    .line 2522
    .line 2523
    move-object/from16 v7, v18

    .line 2524
    .line 2525
    move-object/from16 v2, v19

    .line 2526
    .line 2527
    move-object/from16 v5, v20

    .line 2528
    .line 2529
    move-object/from16 v8, v22

    .line 2530
    .line 2531
    goto/16 :goto_32

    .line 2532
    .line 2533
    :cond_68
    iget-object v2, v0, Lje;->n:Lcb1;

    .line 2534
    .line 2535
    iget-boolean v2, v2, Ldh;->a:Z

    .line 2536
    .line 2537
    if-eqz v2, :cond_6b

    .line 2538
    .line 2539
    iget-object v2, v0, Lk9;->g0:Ldb1;

    .line 2540
    .line 2541
    iget-object v3, v2, Ldb1;->n:Lcb1;

    .line 2542
    .line 2543
    iget-object v3, v3, Ld9;->s:Ljava/util/ArrayList;

    .line 2544
    .line 2545
    if-eqz v3, :cond_6b

    .line 2546
    .line 2547
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 2548
    .line 2549
    .line 2550
    move-result v4

    .line 2551
    if-gtz v4, :cond_69

    .line 2552
    .line 2553
    goto :goto_3d

    .line 2554
    :cond_69
    iget-object v2, v2, Ldb1;->r:[F

    .line 2555
    .line 2556
    const/4 v6, 0x0

    .line 2557
    const/16 v28, 0x0

    .line 2558
    .line 2559
    aput v28, v2, v6

    .line 2560
    .line 2561
    const/16 v37, 0x1

    .line 2562
    .line 2563
    aput v28, v2, v37

    .line 2564
    .line 2565
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 2566
    .line 2567
    .line 2568
    move-result v2

    .line 2569
    if-gtz v2, :cond_6a

    .line 2570
    .line 2571
    goto :goto_3d

    .line 2572
    :cond_6a
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 2573
    .line 2574
    .line 2575
    move-result-object v1

    .line 2576
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2577
    .line 2578
    .line 2579
    new-instance v1, Ljava/lang/ClassCastException;

    .line 2580
    .line 2581
    invoke-direct {v1}, Ljava/lang/ClassCastException;-><init>()V

    .line 2582
    .line 2583
    .line 2584
    throw v1

    .line 2585
    :cond_6b
    :goto_3d
    iget-object v2, v0, Lk9;->a0:Leb1;

    .line 2586
    .line 2587
    iget-boolean v2, v2, Ldh;->a:Z

    .line 2588
    .line 2589
    if-eqz v2, :cond_6c

    .line 2590
    .line 2591
    iget-object v2, v0, Lk9;->c0:Lfb1;

    .line 2592
    .line 2593
    invoke-virtual {v2}, Lfb1;->a2()V

    .line 2594
    .line 2595
    .line 2596
    :cond_6c
    iget-object v2, v0, Lk9;->b0:Leb1;

    .line 2597
    .line 2598
    iget-boolean v2, v2, Ldh;->a:Z

    .line 2599
    .line 2600
    if-eqz v2, :cond_6d

    .line 2601
    .line 2602
    iget-object v2, v0, Lk9;->d0:Lfb1;

    .line 2603
    .line 2604
    invoke-virtual {v2}, Lfb1;->a2()V

    .line 2605
    .line 2606
    .line 2607
    :cond_6d
    iget-object v2, v0, Lk9;->g0:Ldb1;

    .line 2608
    .line 2609
    iget-object v3, v2, Le9;->l:Landroid/graphics/Paint;

    .line 2610
    .line 2611
    iget-object v4, v2, Lf74;->g:Ljava/lang/Object;

    .line 2612
    .line 2613
    check-cast v4, Lu61;

    .line 2614
    .line 2615
    iget-object v5, v2, Ldb1;->n:Lcb1;

    .line 2616
    .line 2617
    iget-boolean v6, v5, Ldh;->a:Z

    .line 2618
    .line 2619
    if-eqz v6, :cond_73

    .line 2620
    .line 2621
    iget-boolean v6, v5, Ld9;->r:Z

    .line 2622
    .line 2623
    if-nez v6, :cond_6e

    .line 2624
    .line 2625
    goto/16 :goto_3f

    .line 2626
    .line 2627
    :cond_6e
    iget v6, v5, Ldh;->c:F

    .line 2628
    .line 2629
    const/4 v15, 0x0

    .line 2630
    invoke-virtual {v3, v15}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 2631
    .line 2632
    .line 2633
    iget v7, v5, Ldh;->d:F

    .line 2634
    .line 2635
    invoke-virtual {v3, v7}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 2636
    .line 2637
    .line 2638
    iget v7, v5, Ldh;->e:I

    .line 2639
    .line 2640
    invoke-virtual {v3, v7}, Landroid/graphics/Paint;->setColor(I)V

    .line 2641
    .line 2642
    .line 2643
    const/4 v3, 0x0

    .line 2644
    invoke-static {v3, v3}, Laa0;->b(FF)Laa0;

    .line 2645
    .line 2646
    .line 2647
    move-result-object v7

    .line 2648
    iget v3, v5, Lcb1;->z:I

    .line 2649
    .line 2650
    const/high16 v8, 0x3f000000    # 0.5f

    .line 2651
    .line 2652
    const/4 v11, 0x1

    .line 2653
    if-ne v3, v11, :cond_6f

    .line 2654
    .line 2655
    iput v8, v7, Laa0;->g:F

    .line 2656
    .line 2657
    move/from16 v9, v27

    .line 2658
    .line 2659
    iput v9, v7, Laa0;->h:F

    .line 2660
    .line 2661
    iget-object v3, v4, Lu61;->b:Landroid/graphics/RectF;

    .line 2662
    .line 2663
    iget v3, v3, Landroid/graphics/RectF;->top:F

    .line 2664
    .line 2665
    sub-float/2addr v3, v6

    .line 2666
    invoke-virtual {v2, v1, v3, v7}, Ldb1;->W1(Landroid/graphics/Canvas;FLaa0;)V

    .line 2667
    .line 2668
    .line 2669
    goto :goto_3e

    .line 2670
    :cond_6f
    move/from16 v10, v26

    .line 2671
    .line 2672
    move/from16 v9, v27

    .line 2673
    .line 2674
    if-ne v3, v10, :cond_70

    .line 2675
    .line 2676
    iput v8, v7, Laa0;->g:F

    .line 2677
    .line 2678
    iput v9, v7, Laa0;->h:F

    .line 2679
    .line 2680
    iget-object v3, v4, Lu61;->b:Landroid/graphics/RectF;

    .line 2681
    .line 2682
    iget v3, v3, Landroid/graphics/RectF;->top:F

    .line 2683
    .line 2684
    add-float/2addr v3, v6

    .line 2685
    iget v4, v5, Lcb1;->y:I

    .line 2686
    .line 2687
    int-to-float v4, v4

    .line 2688
    add-float/2addr v3, v4

    .line 2689
    invoke-virtual {v2, v1, v3, v7}, Ldb1;->W1(Landroid/graphics/Canvas;FLaa0;)V

    .line 2690
    .line 2691
    .line 2692
    goto :goto_3e

    .line 2693
    :cond_70
    const/4 v10, 0x2

    .line 2694
    if-ne v3, v10, :cond_71

    .line 2695
    .line 2696
    iput v8, v7, Laa0;->g:F

    .line 2697
    .line 2698
    const/4 v9, 0x0

    .line 2699
    iput v9, v7, Laa0;->h:F

    .line 2700
    .line 2701
    iget-object v3, v4, Lu61;->b:Landroid/graphics/RectF;

    .line 2702
    .line 2703
    iget v3, v3, Landroid/graphics/RectF;->bottom:F

    .line 2704
    .line 2705
    add-float/2addr v3, v6

    .line 2706
    invoke-virtual {v2, v1, v3, v7}, Ldb1;->W1(Landroid/graphics/Canvas;FLaa0;)V

    .line 2707
    .line 2708
    .line 2709
    goto :goto_3e

    .line 2710
    :cond_71
    move/from16 v10, v25

    .line 2711
    .line 2712
    const/4 v9, 0x0

    .line 2713
    if-ne v3, v10, :cond_72

    .line 2714
    .line 2715
    iput v8, v7, Laa0;->g:F

    .line 2716
    .line 2717
    iput v9, v7, Laa0;->h:F

    .line 2718
    .line 2719
    iget-object v3, v4, Lu61;->b:Landroid/graphics/RectF;

    .line 2720
    .line 2721
    iget v3, v3, Landroid/graphics/RectF;->bottom:F

    .line 2722
    .line 2723
    sub-float/2addr v3, v6

    .line 2724
    iget v4, v5, Lcb1;->y:I

    .line 2725
    .line 2726
    int-to-float v4, v4

    .line 2727
    sub-float/2addr v3, v4

    .line 2728
    invoke-virtual {v2, v1, v3, v7}, Ldb1;->W1(Landroid/graphics/Canvas;FLaa0;)V

    .line 2729
    .line 2730
    .line 2731
    goto :goto_3e

    .line 2732
    :cond_72
    iput v8, v7, Laa0;->g:F

    .line 2733
    .line 2734
    const/high16 v9, 0x3f800000    # 1.0f

    .line 2735
    .line 2736
    iput v9, v7, Laa0;->h:F

    .line 2737
    .line 2738
    iget-object v3, v4, Lu61;->b:Landroid/graphics/RectF;

    .line 2739
    .line 2740
    iget v3, v3, Landroid/graphics/RectF;->top:F

    .line 2741
    .line 2742
    sub-float/2addr v3, v6

    .line 2743
    invoke-virtual {v2, v1, v3, v7}, Ldb1;->W1(Landroid/graphics/Canvas;FLaa0;)V

    .line 2744
    .line 2745
    .line 2746
    iput v8, v7, Laa0;->g:F

    .line 2747
    .line 2748
    const/4 v3, 0x0

    .line 2749
    iput v3, v7, Laa0;->h:F

    .line 2750
    .line 2751
    iget-object v3, v4, Lu61;->b:Landroid/graphics/RectF;

    .line 2752
    .line 2753
    iget v3, v3, Landroid/graphics/RectF;->bottom:F

    .line 2754
    .line 2755
    add-float/2addr v3, v6

    .line 2756
    invoke-virtual {v2, v1, v3, v7}, Ldb1;->W1(Landroid/graphics/Canvas;FLaa0;)V

    .line 2757
    .line 2758
    .line 2759
    :goto_3e
    sget-object v2, Laa0;->i:Lni0;

    .line 2760
    .line 2761
    invoke-virtual {v2, v7}, Lni0;->c(Lmi0;)V

    .line 2762
    .line 2763
    .line 2764
    :cond_73
    :goto_3f
    iget-object v2, v0, Lk9;->c0:Lfb1;

    .line 2765
    .line 2766
    invoke-virtual {v2, v1}, Lfb1;->X1(Landroid/graphics/Canvas;)V

    .line 2767
    .line 2768
    .line 2769
    iget-object v2, v0, Lk9;->d0:Lfb1;

    .line 2770
    .line 2771
    invoke-virtual {v2, v1}, Lfb1;->X1(Landroid/graphics/Canvas;)V

    .line 2772
    .line 2773
    .line 2774
    iget-boolean v2, v0, Lk9;->U:Z

    .line 2775
    .line 2776
    if-eqz v2, :cond_74

    .line 2777
    .line 2778
    invoke-virtual {v1}, Landroid/graphics/Canvas;->save()I

    .line 2779
    .line 2780
    .line 2781
    move-result v2

    .line 2782
    move-object/from16 v3, v42

    .line 2783
    .line 2784
    invoke-virtual {v1, v3}, Landroid/graphics/Canvas;->clipRect(Landroid/graphics/RectF;)Z

    .line 2785
    .line 2786
    .line 2787
    iget-object v4, v0, Lje;->u:Lom;

    .line 2788
    .line 2789
    invoke-virtual {v4, v1}, Lom;->U1(Landroid/graphics/Canvas;)V

    .line 2790
    .line 2791
    .line 2792
    invoke-virtual {v1, v2}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 2793
    .line 2794
    .line 2795
    goto :goto_40

    .line 2796
    :cond_74
    move-object/from16 v3, v42

    .line 2797
    .line 2798
    iget-object v2, v0, Lje;->u:Lom;

    .line 2799
    .line 2800
    invoke-virtual {v2, v1}, Lom;->U1(Landroid/graphics/Canvas;)V

    .line 2801
    .line 2802
    .line 2803
    :goto_40
    iget-object v2, v0, Lje;->t:Lm50;

    .line 2804
    .line 2805
    invoke-virtual {v2, v1}, Lm50;->V1(Landroid/graphics/Canvas;)V

    .line 2806
    .line 2807
    .line 2808
    iget-object v2, v0, Lje;->p:Llo;

    .line 2809
    .line 2810
    if-eqz v2, :cond_75

    .line 2811
    .line 2812
    iget-boolean v2, v2, Ldh;->a:Z

    .line 2813
    .line 2814
    if-eqz v2, :cond_75

    .line 2815
    .line 2816
    iget-object v2, v0, Lje;->l:Landroid/graphics/Paint;

    .line 2817
    .line 2818
    const/4 v15, 0x0

    .line 2819
    invoke-virtual {v2, v15}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 2820
    .line 2821
    .line 2822
    iget-object v2, v0, Lje;->l:Landroid/graphics/Paint;

    .line 2823
    .line 2824
    iget-object v4, v0, Lje;->p:Llo;

    .line 2825
    .line 2826
    iget v4, v4, Ldh;->d:F

    .line 2827
    .line 2828
    invoke-virtual {v2, v4}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 2829
    .line 2830
    .line 2831
    iget-object v2, v0, Lje;->l:Landroid/graphics/Paint;

    .line 2832
    .line 2833
    iget-object v4, v0, Lje;->p:Llo;

    .line 2834
    .line 2835
    iget v4, v4, Ldh;->e:I

    .line 2836
    .line 2837
    invoke-virtual {v2, v4}, Landroid/graphics/Paint;->setColor(I)V

    .line 2838
    .line 2839
    .line 2840
    iget-object v2, v0, Lje;->l:Landroid/graphics/Paint;

    .line 2841
    .line 2842
    iget-object v4, v0, Lje;->p:Llo;

    .line 2843
    .line 2844
    iget-object v4, v4, Llo;->g:Landroid/graphics/Paint$Align;

    .line 2845
    .line 2846
    invoke-virtual {v2, v4}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 2847
    .line 2848
    .line 2849
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 2850
    .line 2851
    .line 2852
    move-result v2

    .line 2853
    int-to-float v2, v2

    .line 2854
    move-object/from16 v4, v41

    .line 2855
    .line 2856
    iget v5, v4, Lu61;->c:F

    .line 2857
    .line 2858
    iget v6, v3, Landroid/graphics/RectF;->right:F

    .line 2859
    .line 2860
    sub-float/2addr v5, v6

    .line 2861
    sub-float/2addr v2, v5

    .line 2862
    iget-object v5, v0, Lje;->p:Llo;

    .line 2863
    .line 2864
    iget v5, v5, Ldh;->b:F

    .line 2865
    .line 2866
    sub-float/2addr v2, v5

    .line 2867
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 2868
    .line 2869
    .line 2870
    move-result v5

    .line 2871
    int-to-float v5, v5

    .line 2872
    iget v4, v4, Lu61;->d:F

    .line 2873
    .line 2874
    iget v3, v3, Landroid/graphics/RectF;->bottom:F

    .line 2875
    .line 2876
    sub-float/2addr v4, v3

    .line 2877
    sub-float/2addr v5, v4

    .line 2878
    iget-object v3, v0, Lje;->p:Llo;

    .line 2879
    .line 2880
    iget v4, v3, Ldh;->c:F

    .line 2881
    .line 2882
    sub-float/2addr v5, v4

    .line 2883
    iget-object v3, v3, Llo;->f:Ljava/lang/String;

    .line 2884
    .line 2885
    iget-object v4, v0, Lje;->l:Landroid/graphics/Paint;

    .line 2886
    .line 2887
    invoke-virtual {v1, v3, v2, v5, v4}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 2888
    .line 2889
    .line 2890
    :cond_75
    iget-boolean v1, v0, Lje;->f:Z

    .line 2891
    .line 2892
    if-eqz v1, :cond_76

    .line 2893
    .line 2894
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 2895
    .line 2896
    .line 2897
    :cond_76
    :goto_41
    return-void
.end method

.method public final onSizeChanged(IIII)V
    .locals 6

    .line 1
    iget-object v0, p0, Lje;->w:Lu61;

    .line 2
    .line 3
    iget-object v1, p0, Lk9;->l0:[F

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    const/4 v3, 0x0

    .line 7
    aput v3, v1, v2

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    aput v3, v1, v4

    .line 11
    .line 12
    iget-boolean v3, p0, Lk9;->W:Z

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    iget-object v3, v0, Lu61;->b:Landroid/graphics/RectF;

    .line 17
    .line 18
    iget v5, v3, Landroid/graphics/RectF;->left:F

    .line 19
    .line 20
    aput v5, v1, v4

    .line 21
    .line 22
    iget v3, v3, Landroid/graphics/RectF;->top:F

    .line 23
    .line 24
    aput v3, v1, v2

    .line 25
    .line 26
    iget-object v3, p0, Lk9;->e0:Luk1;

    .line 27
    .line 28
    invoke-virtual {v3, v1}, Luk1;->d([F)V

    .line 29
    .line 30
    .line 31
    :cond_0
    invoke-super {p0, p1, p2, p3, p4}, Lje;->onSizeChanged(IIII)V

    .line 32
    .line 33
    .line 34
    iget-boolean p1, p0, Lk9;->W:Z

    .line 35
    .line 36
    if-eqz p1, :cond_1

    .line 37
    .line 38
    iget-object p1, p0, Lk9;->e0:Luk1;

    .line 39
    .line 40
    invoke-virtual {p1, v1}, Luk1;->e([F)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0, v1, p0}, Lu61;->a([FLandroid/view/View;)V

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :cond_1
    iget-object p1, v0, Lu61;->a:Landroid/graphics/Matrix;

    .line 48
    .line 49
    invoke-virtual {v0, p1, p0, v2}, Lu61;->e(Landroid/graphics/Matrix;Landroid/view/View;Z)V

    .line 50
    .line 51
    .line 52
    return-void
.end method

.method public final onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 3

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lje;->r:Loe;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    if-eqz v0, :cond_2

    .line 8
    .line 9
    iget-object v2, p0, Lje;->g:Lle;

    .line 10
    .line 11
    if-nez v2, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    iget-boolean v2, p0, Lje;->o:Z

    .line 15
    .line 16
    if-nez v2, :cond_1

    .line 17
    .line 18
    return v1

    .line 19
    :cond_1
    check-cast v0, Ll9;

    .line 20
    .line 21
    invoke-virtual {v0, p0, p1}, Ll9;->onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    return p1

    .line 26
    :cond_2
    :goto_0
    return v1
.end method

.method public setAutoScaleMinMaxEnabled(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lk9;->I:Z

    .line 2
    .line 3
    return-void
.end method

.method public setBorderColor(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lk9;->R:Landroid/graphics/Paint;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setBorderWidth(F)V
    .locals 1

    .line 1
    iget-object v0, p0, Lk9;->R:Landroid/graphics/Paint;

    .line 2
    .line 3
    invoke-static {p1}, Lk41;->c(F)F

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public setClipValuesToContent(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lk9;->U:Z

    .line 2
    .line 3
    return-void
.end method

.method public setDoubleTapToZoomEnabled(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lk9;->K:Z

    .line 2
    .line 3
    return-void
.end method

.method public setDragEnabled(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lk9;->M:Z

    .line 2
    .line 3
    iput-boolean p1, p0, Lk9;->N:Z

    .line 4
    .line 5
    return-void
.end method

.method public setDragOffsetX(F)V
    .locals 1

    .line 1
    iget-object v0, p0, Lje;->w:Lu61;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Lk41;->c(F)F

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    iput p1, v0, Lu61;->l:F

    .line 11
    .line 12
    return-void
.end method

.method public setDragOffsetY(F)V
    .locals 1

    .line 1
    iget-object v0, p0, Lje;->w:Lu61;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Lk41;->c(F)F

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    iput p1, v0, Lu61;->m:F

    .line 11
    .line 12
    return-void
.end method

.method public setDragXEnabled(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lk9;->M:Z

    .line 2
    .line 3
    return-void
.end method

.method public setDragYEnabled(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lk9;->N:Z

    .line 2
    .line 3
    return-void
.end method

.method public setDrawBorders(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lk9;->T:Z

    .line 2
    .line 3
    return-void
.end method

.method public setDrawGridBackground(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lk9;->S:Z

    .line 2
    .line 3
    return-void
.end method

.method public setGridBackgroundColor(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lk9;->Q:Landroid/graphics/Paint;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setHighlightPerDragEnabled(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lk9;->L:Z

    .line 2
    .line 3
    return-void
.end method

.method public setKeepPositionOnRotation(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lk9;->W:Z

    .line 2
    .line 3
    return-void
.end method

.method public setMaxVisibleValueCount(I)V
    .locals 0

    .line 1
    iput p1, p0, Lk9;->H:I

    .line 2
    .line 3
    return-void
.end method

.method public setMinOffset(F)V
    .locals 0

    .line 1
    iput p1, p0, Lk9;->V:F

    .line 2
    .line 3
    return-void
.end method

.method public setOnDrawListener(Lfj0;)V
    .locals 0

    .line 1
    return-void
.end method

.method public setPinchZoom(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lk9;->J:Z

    .line 2
    .line 3
    return-void
.end method

.method public setRendererLeftYAxis(Lfb1;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lk9;->c0:Lfb1;

    .line 2
    .line 3
    return-void
.end method

.method public setRendererRightYAxis(Lfb1;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lk9;->d0:Lfb1;

    .line 2
    .line 3
    return-void
.end method

.method public setScaleEnabled(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lk9;->O:Z

    .line 2
    .line 3
    iput-boolean p1, p0, Lk9;->P:Z

    .line 4
    .line 5
    return-void
.end method

.method public setScaleXEnabled(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lk9;->O:Z

    .line 2
    .line 3
    return-void
.end method

.method public setScaleYEnabled(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lk9;->P:Z

    .line 2
    .line 3
    return-void
.end method

.method public setVisibleXRangeMaximum(F)V
    .locals 3

    .line 1
    iget-object v0, p0, Lje;->n:Lcb1;

    .line 2
    .line 3
    iget v0, v0, Ld9;->x:F

    .line 4
    .line 5
    div-float/2addr v0, p1

    .line 6
    iget-object p1, p0, Lje;->w:Lu61;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    const/high16 v1, 0x3f800000    # 1.0f

    .line 12
    .line 13
    cmpg-float v2, v0, v1

    .line 14
    .line 15
    if-gez v2, :cond_0

    .line 16
    .line 17
    move v0, v1

    .line 18
    :cond_0
    iput v0, p1, Lu61;->g:F

    .line 19
    .line 20
    iget-object v0, p1, Lu61;->a:Landroid/graphics/Matrix;

    .line 21
    .line 22
    iget-object v1, p1, Lu61;->b:Landroid/graphics/RectF;

    .line 23
    .line 24
    invoke-virtual {p1, v0, v1}, Lu61;->d(Landroid/graphics/Matrix;Landroid/graphics/RectF;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public setVisibleXRangeMinimum(F)V
    .locals 2

    .line 1
    iget-object v0, p0, Lje;->n:Lcb1;

    .line 2
    .line 3
    iget v0, v0, Ld9;->x:F

    .line 4
    .line 5
    div-float/2addr v0, p1

    .line 6
    iget-object p1, p0, Lje;->w:Lu61;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    cmpl-float v1, v0, v1

    .line 13
    .line 14
    if-nez v1, :cond_0

    .line 15
    .line 16
    const v0, 0x7f7fffff    # Float.MAX_VALUE

    .line 17
    .line 18
    .line 19
    :cond_0
    iput v0, p1, Lu61;->h:F

    .line 20
    .line 21
    iget-object v0, p1, Lu61;->a:Landroid/graphics/Matrix;

    .line 22
    .line 23
    iget-object v1, p1, Lu61;->b:Landroid/graphics/RectF;

    .line 24
    .line 25
    invoke-virtual {p1, v0, v1}, Lu61;->d(Landroid/graphics/Matrix;Landroid/graphics/RectF;)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public setXAxisRenderer(Ldb1;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lk9;->g0:Ldb1;

    .line 2
    .line 3
    return-void
.end method
