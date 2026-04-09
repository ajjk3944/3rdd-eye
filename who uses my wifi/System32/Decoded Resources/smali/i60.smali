.class public final Li60;
.super Lom;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public m:Lo9;

.field public n:Landroid/graphics/Path;

.field public o:Lcom/github/mikephil/charting/charts/LineChart;

.field public p:Landroid/graphics/Paint;

.field public q:Ljava/lang/ref/WeakReference;

.field public r:Landroid/graphics/Canvas;

.field public s:Landroid/graphics/Bitmap$Config;

.field public t:Landroid/graphics/Path;

.field public u:Landroid/graphics/Path;

.field public v:[F

.field public w:Landroid/graphics/Path;

.field public x:Ljava/util/HashMap;

.field public y:[F


# virtual methods
.method public final U1(Landroid/graphics/Canvas;)V
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lom;->i:Lke;

    .line 4
    .line 5
    iget-object v2, v0, Lom;->l:Landroid/graphics/Paint;

    .line 6
    .line 7
    iget-object v3, v0, Li60;->m:Lo9;

    .line 8
    .line 9
    iget-object v4, v0, Li60;->o:Lcom/github/mikephil/charting/charts/LineChart;

    .line 10
    .line 11
    invoke-interface {v4}, Lne;->getData()Lle;

    .line 12
    .line 13
    .line 14
    move-result-object v5

    .line 15
    invoke-virtual {v5}, Lle;->e()I

    .line 16
    .line 17
    .line 18
    move-result v5

    .line 19
    int-to-float v5, v5

    .line 20
    invoke-interface {v4}, Lne;->getMaxVisibleCount()I

    .line 21
    .line 22
    .line 23
    move-result v6

    .line 24
    int-to-float v6, v6

    .line 25
    iget-object v7, v0, Lf74;->g:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v7, Lu61;

    .line 28
    .line 29
    iget v8, v7, Lu61;->i:F

    .line 30
    .line 31
    mul-float/2addr v6, v8

    .line 32
    cmpg-float v5, v5, v6

    .line 33
    .line 34
    if-gez v5, :cond_d

    .line 35
    .line 36
    invoke-interface {v4}, Lk60;->getLineData()Lj60;

    .line 37
    .line 38
    .line 39
    move-result-object v5

    .line 40
    iget-object v5, v5, Lle;->i:Ljava/util/ArrayList;

    .line 41
    .line 42
    const/4 v8, 0x0

    .line 43
    :goto_0
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 44
    .line 45
    .line 46
    move-result v9

    .line 47
    if-ge v8, v9, :cond_d

    .line 48
    .line 49
    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v9

    .line 53
    check-cast v9, Ll60;

    .line 54
    .line 55
    iget-boolean v10, v9, Ll60;->n:Z

    .line 56
    .line 57
    if-eqz v10, :cond_1

    .line 58
    .line 59
    iget-boolean v10, v9, Ll60;->j:Z

    .line 60
    .line 61
    if-nez v10, :cond_0

    .line 62
    .line 63
    iget-boolean v10, v9, Ll60;->k:Z

    .line 64
    .line 65
    if-eqz v10, :cond_1

    .line 66
    .line 67
    :cond_0
    iget-object v10, v9, Ll60;->o:Ljava/util/ArrayList;

    .line 68
    .line 69
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    .line 70
    .line 71
    .line 72
    move-result v10

    .line 73
    const/4 v11, 0x1

    .line 74
    if-ge v10, v11, :cond_2

    .line 75
    .line 76
    :cond_1
    move-object/from16 v0, p1

    .line 77
    .line 78
    move-object/from16 v16, v1

    .line 79
    .line 80
    move-object/from16 v20, v3

    .line 81
    .line 82
    goto/16 :goto_8

    .line 83
    .line 84
    :cond_2
    const/4 v10, 0x0

    .line 85
    invoke-virtual {v2, v10}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 86
    .line 87
    .line 88
    iget v10, v9, Ll60;->m:F

    .line 89
    .line 90
    invoke-virtual {v2, v10}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 91
    .line 92
    .line 93
    iget v10, v9, Ll60;->d:I

    .line 94
    .line 95
    invoke-virtual {v4, v10}, Lk9;->f(I)Luk1;

    .line 96
    .line 97
    .line 98
    move-result-object v10

    .line 99
    iget v12, v9, Ll60;->E:F

    .line 100
    .line 101
    const/high16 v13, 0x3fe00000    # 1.75f

    .line 102
    .line 103
    mul-float/2addr v12, v13

    .line 104
    float-to-int v12, v12

    .line 105
    iget-boolean v13, v9, Ll60;->J:Z

    .line 106
    .line 107
    if-nez v13, :cond_3

    .line 108
    .line 109
    div-int/lit8 v12, v12, 0x2

    .line 110
    .line 111
    :cond_3
    invoke-virtual {v3, v4, v9}, Lo9;->c(Ln9;Ll60;)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 115
    .line 116
    .line 117
    iget v13, v3, Lo9;->a:I

    .line 118
    .line 119
    iget v14, v3, Lo9;->b:I

    .line 120
    .line 121
    sub-int/2addr v14, v13

    .line 122
    int-to-float v14, v14

    .line 123
    const/high16 v15, 0x3f800000    # 1.0f

    .line 124
    .line 125
    mul-float/2addr v14, v15

    .line 126
    float-to-int v14, v14

    .line 127
    add-int/2addr v14, v11

    .line 128
    mul-int/lit8 v14, v14, 0x2

    .line 129
    .line 130
    iget-object v11, v10, Luk1;->i:Ljava/lang/Object;

    .line 131
    .line 132
    check-cast v11, [F

    .line 133
    .line 134
    array-length v11, v11

    .line 135
    if-eq v11, v14, :cond_4

    .line 136
    .line 137
    new-array v11, v14, [F

    .line 138
    .line 139
    iput-object v11, v10, Luk1;->i:Ljava/lang/Object;

    .line 140
    .line 141
    :cond_4
    iget-object v11, v10, Luk1;->i:Ljava/lang/Object;

    .line 142
    .line 143
    check-cast v11, [F

    .line 144
    .line 145
    const/4 v6, 0x0

    .line 146
    :goto_1
    if-ge v6, v14, :cond_6

    .line 147
    .line 148
    div-int/lit8 v16, v6, 0x2

    .line 149
    .line 150
    move/from16 v17, v15

    .line 151
    .line 152
    add-int v15, v16, v13

    .line 153
    .line 154
    invoke-virtual {v9, v15}, Ll60;->b(I)Lxs;

    .line 155
    .line 156
    .line 157
    move-result-object v15

    .line 158
    if-eqz v15, :cond_5

    .line 159
    .line 160
    iget v0, v15, Lxs;->h:F

    .line 161
    .line 162
    aput v0, v11, v6

    .line 163
    .line 164
    add-int/lit8 v0, v6, 0x1

    .line 165
    .line 166
    iget v15, v15, Lxs;->f:F

    .line 167
    .line 168
    mul-float v15, v15, v17

    .line 169
    .line 170
    aput v15, v11, v0

    .line 171
    .line 172
    goto :goto_2

    .line 173
    :cond_5
    const/4 v0, 0x0

    .line 174
    aput v0, v11, v6

    .line 175
    .line 176
    add-int/lit8 v15, v6, 0x1

    .line 177
    .line 178
    aput v0, v11, v15

    .line 179
    .line 180
    :goto_2
    add-int/lit8 v6, v6, 0x2

    .line 181
    .line 182
    move-object/from16 v0, p0

    .line 183
    .line 184
    move/from16 v15, v17

    .line 185
    .line 186
    goto :goto_1

    .line 187
    :cond_6
    iget-object v0, v10, Luk1;->l:Ljava/lang/Object;

    .line 188
    .line 189
    check-cast v0, Landroid/graphics/Matrix;

    .line 190
    .line 191
    iget-object v6, v10, Luk1;->f:Ljava/lang/Object;

    .line 192
    .line 193
    check-cast v6, Landroid/graphics/Matrix;

    .line 194
    .line 195
    invoke-virtual {v0, v6}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 196
    .line 197
    .line 198
    iget-object v6, v10, Luk1;->h:Ljava/lang/Object;

    .line 199
    .line 200
    check-cast v6, Lu61;

    .line 201
    .line 202
    iget-object v6, v6, Lu61;->a:Landroid/graphics/Matrix;

    .line 203
    .line 204
    invoke-virtual {v0, v6}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 205
    .line 206
    .line 207
    iget-object v6, v10, Luk1;->g:Ljava/lang/Object;

    .line 208
    .line 209
    check-cast v6, Landroid/graphics/Matrix;

    .line 210
    .line 211
    invoke-virtual {v0, v6}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 212
    .line 213
    .line 214
    invoke-virtual {v0, v11}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 215
    .line 216
    .line 217
    iget-object v0, v9, Ll60;->f:Ln41;

    .line 218
    .line 219
    if-nez v0, :cond_7

    .line 220
    .line 221
    sget-object v0, Lk41;->g:Lxn;

    .line 222
    .line 223
    :cond_7
    iget-object v6, v9, Ll60;->l:Laa0;

    .line 224
    .line 225
    sget-object v10, Laa0;->i:Lni0;

    .line 226
    .line 227
    invoke-virtual {v10}, Lni0;->b()Lmi0;

    .line 228
    .line 229
    .line 230
    move-result-object v10

    .line 231
    check-cast v10, Laa0;

    .line 232
    .line 233
    iget v13, v6, Laa0;->g:F

    .line 234
    .line 235
    iput v13, v10, Laa0;->g:F

    .line 236
    .line 237
    iget v6, v6, Laa0;->h:F

    .line 238
    .line 239
    iput v6, v10, Laa0;->h:F

    .line 240
    .line 241
    invoke-static {v13}, Lk41;->c(F)F

    .line 242
    .line 243
    .line 244
    move-result v6

    .line 245
    iput v6, v10, Laa0;->g:F

    .line 246
    .line 247
    iget v6, v10, Laa0;->h:F

    .line 248
    .line 249
    invoke-static {v6}, Lk41;->c(F)F

    .line 250
    .line 251
    .line 252
    move-result v6

    .line 253
    iput v6, v10, Laa0;->h:F

    .line 254
    .line 255
    const/4 v6, 0x0

    .line 256
    :goto_3
    array-length v13, v11

    .line 257
    if-ge v6, v13, :cond_8

    .line 258
    .line 259
    aget v13, v11, v6

    .line 260
    .line 261
    add-int/lit8 v14, v6, 0x1

    .line 262
    .line 263
    aget v14, v11, v14

    .line 264
    .line 265
    invoke-virtual {v7, v13}, Lu61;->c(F)Z

    .line 266
    .line 267
    .line 268
    move-result v15

    .line 269
    if-nez v15, :cond_9

    .line 270
    .line 271
    :cond_8
    move-object/from16 v0, p1

    .line 272
    .line 273
    move-object/from16 v16, v1

    .line 274
    .line 275
    move-object/from16 v20, v3

    .line 276
    .line 277
    goto/16 :goto_7

    .line 278
    .line 279
    :cond_9
    invoke-virtual {v7, v13}, Lu61;->b(F)Z

    .line 280
    .line 281
    .line 282
    move-result v15

    .line 283
    if-eqz v15, :cond_c

    .line 284
    .line 285
    iget-object v15, v7, Lu61;->b:Landroid/graphics/RectF;

    .line 286
    .line 287
    move-object/from16 v16, v1

    .line 288
    .line 289
    iget v1, v15, Landroid/graphics/RectF;->top:F

    .line 290
    .line 291
    cmpg-float v1, v1, v14

    .line 292
    .line 293
    if-gtz v1, :cond_b

    .line 294
    .line 295
    const/high16 v17, 0x42c80000    # 100.0f

    .line 296
    .line 297
    mul-float v1, v14, v17

    .line 298
    .line 299
    float-to-int v1, v1

    .line 300
    int-to-float v1, v1

    .line 301
    div-float v1, v1, v17

    .line 302
    .line 303
    iget v15, v15, Landroid/graphics/RectF;->bottom:F

    .line 304
    .line 305
    cmpl-float v1, v15, v1

    .line 306
    .line 307
    if-ltz v1, :cond_b

    .line 308
    .line 309
    div-int/lit8 v1, v6, 0x2

    .line 310
    .line 311
    iget v15, v3, Lo9;->a:I

    .line 312
    .line 313
    add-int/2addr v15, v1

    .line 314
    invoke-virtual {v9, v15}, Ll60;->b(I)Lxs;

    .line 315
    .line 316
    .line 317
    move-result-object v15

    .line 318
    move/from16 v17, v1

    .line 319
    .line 320
    iget-boolean v1, v9, Ll60;->j:Z

    .line 321
    .line 322
    if-eqz v1, :cond_a

    .line 323
    .line 324
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 325
    .line 326
    .line 327
    iget v1, v15, Lxs;->f:F

    .line 328
    .line 329
    invoke-virtual {v0, v1}, Ln41;->a(F)Ljava/lang/String;

    .line 330
    .line 331
    .line 332
    move-result-object v1

    .line 333
    move-object/from16 v18, v0

    .line 334
    .line 335
    int-to-float v0, v12

    .line 336
    sub-float/2addr v14, v0

    .line 337
    iget-object v0, v9, Ll60;->b:Ljava/util/ArrayList;

    .line 338
    .line 339
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 340
    .line 341
    .line 342
    move-result v19

    .line 343
    move-object/from16 v20, v3

    .line 344
    .line 345
    rem-int v3, v17, v19

    .line 346
    .line 347
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 348
    .line 349
    .line 350
    move-result-object v0

    .line 351
    check-cast v0, Ljava/lang/Integer;

    .line 352
    .line 353
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 354
    .line 355
    .line 356
    move-result v0

    .line 357
    invoke-virtual {v2, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 358
    .line 359
    .line 360
    move-object/from16 v0, p1

    .line 361
    .line 362
    invoke-virtual {v0, v1, v13, v14, v2}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 363
    .line 364
    .line 365
    goto :goto_4

    .line 366
    :cond_a
    move-object/from16 v18, v0

    .line 367
    .line 368
    move-object/from16 v20, v3

    .line 369
    .line 370
    move-object/from16 v0, p1

    .line 371
    .line 372
    :goto_4
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 373
    .line 374
    .line 375
    goto :goto_6

    .line 376
    :cond_b
    move-object/from16 v18, v0

    .line 377
    .line 378
    goto :goto_5

    .line 379
    :cond_c
    move-object/from16 v18, v0

    .line 380
    .line 381
    move-object/from16 v16, v1

    .line 382
    .line 383
    :goto_5
    move-object/from16 v20, v3

    .line 384
    .line 385
    move-object/from16 v0, p1

    .line 386
    .line 387
    :goto_6
    add-int/lit8 v6, v6, 0x2

    .line 388
    .line 389
    move-object/from16 v1, v16

    .line 390
    .line 391
    move-object/from16 v0, v18

    .line 392
    .line 393
    move-object/from16 v3, v20

    .line 394
    .line 395
    goto/16 :goto_3

    .line 396
    .line 397
    :goto_7
    sget-object v1, Laa0;->i:Lni0;

    .line 398
    .line 399
    invoke-virtual {v1, v10}, Lni0;->c(Lmi0;)V

    .line 400
    .line 401
    .line 402
    :goto_8
    add-int/lit8 v8, v8, 0x1

    .line 403
    .line 404
    move-object/from16 v0, p0

    .line 405
    .line 406
    move-object/from16 v1, v16

    .line 407
    .line 408
    move-object/from16 v3, v20

    .line 409
    .line 410
    goto/16 :goto_0

    .line 411
    .line 412
    :cond_d
    return-void
.end method

.method public final V1(Landroid/graphics/Canvas;Ll60;Landroid/graphics/Path;Luk1;Lo9;)V
    .locals 3

    .line 1
    iget-object v0, p2, Ll60;->I:Lpz;

    .line 2
    .line 3
    iget-object v1, p0, Li60;->o:Lcom/github/mikephil/charting/charts/LineChart;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-static {p2, v1}, Lpz;->j(Ll60;Lk60;)F

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    iget v1, p5, Lo9;->a:I

    .line 13
    .line 14
    iget v2, p5, Lo9;->c:I

    .line 15
    .line 16
    add-int/2addr v1, v2

    .line 17
    invoke-virtual {p2, v1}, Ll60;->b(I)Lxs;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    iget v1, v1, Lxs;->h:F

    .line 22
    .line 23
    invoke-virtual {p3, v1, v0}, Landroid/graphics/Path;->lineTo(FF)V

    .line 24
    .line 25
    .line 26
    iget p5, p5, Lo9;->a:I

    .line 27
    .line 28
    invoke-virtual {p2, p5}, Ll60;->b(I)Lxs;

    .line 29
    .line 30
    .line 31
    move-result-object p5

    .line 32
    iget p5, p5, Lxs;->h:F

    .line 33
    .line 34
    invoke-virtual {p3, p5, v0}, Landroid/graphics/Path;->lineTo(FF)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p3}, Landroid/graphics/Path;->close()V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p4, p3}, Luk1;->c(Landroid/graphics/Path;)V

    .line 41
    .line 42
    .line 43
    iget p4, p2, Ll60;->x:I

    .line 44
    .line 45
    iget p2, p2, Ll60;->y:I

    .line 46
    .line 47
    shl-int/lit8 p2, p2, 0x18

    .line 48
    .line 49
    const p5, 0xffffff

    .line 50
    .line 51
    .line 52
    and-int/2addr p4, p5

    .line 53
    or-int/2addr p2, p4

    .line 54
    sget-object p4, Lk41;->a:Landroid/util/DisplayMetrics;

    .line 55
    .line 56
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 57
    .line 58
    .line 59
    move-result p4

    .line 60
    invoke-virtual {p1, p3}, Landroid/graphics/Canvas;->clipPath(Landroid/graphics/Path;)Z

    .line 61
    .line 62
    .line 63
    invoke-virtual {p1, p2}, Landroid/graphics/Canvas;->drawColor(I)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p1, p4}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 67
    .line 68
    .line 69
    return-void
.end method
