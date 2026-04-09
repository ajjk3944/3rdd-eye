.class public final Lm50;
.super Lf74;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public i:Landroid/graphics/Paint;

.field public j:Landroid/graphics/Paint;

.field public k:Lk50;

.field public l:Ljava/util/ArrayList;

.field public m:Landroid/graphics/Paint$FontMetrics;

.field public n:Landroid/graphics/Path;


# virtual methods
.method public final U1(Landroid/graphics/Canvas;FFLl50;Lk50;)V
    .locals 8

    .line 1
    iget-object v0, p0, Lm50;->n:Landroid/graphics/Path;

    .line 2
    .line 3
    iget-object v6, p0, Lm50;->j:Landroid/graphics/Paint;

    .line 4
    .line 5
    iget v1, p4, Ll50;->e:I

    .line 6
    .line 7
    iget v2, p4, Ll50;->d:F

    .line 8
    .line 9
    iget v3, p4, Ll50;->c:F

    .line 10
    .line 11
    const v4, 0x112234

    .line 12
    .line 13
    .line 14
    if-eq v1, v4, :cond_7

    .line 15
    .line 16
    const v4, 0x112233

    .line 17
    .line 18
    .line 19
    if-eq v1, v4, :cond_7

    .line 20
    .line 21
    if-nez v1, :cond_0

    .line 22
    .line 23
    goto/16 :goto_3

    .line 24
    .line 25
    :cond_0
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 26
    .line 27
    .line 28
    move-result v7

    .line 29
    iget p4, p4, Ll50;->b:I

    .line 30
    .line 31
    const/4 v4, 0x3

    .line 32
    if-ne p4, v4, :cond_1

    .line 33
    .line 34
    iget p4, p5, Lk50;->k:I

    .line 35
    .line 36
    :cond_1
    invoke-virtual {v6, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 37
    .line 38
    .line 39
    invoke-static {v3}, Ljava/lang/Float;->isNaN(F)Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-eqz v1, :cond_2

    .line 44
    .line 45
    iget v3, p5, Lk50;->l:F

    .line 46
    .line 47
    :cond_2
    invoke-static {v3}, Lk41;->c(F)F

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    const/high16 v3, 0x40000000    # 2.0f

    .line 52
    .line 53
    div-float v3, v1, v3

    .line 54
    .line 55
    invoke-static {p4}, Lex0;->s(I)I

    .line 56
    .line 57
    .line 58
    move-result p4

    .line 59
    const/4 v5, 0x2

    .line 60
    if-eq p4, v5, :cond_5

    .line 61
    .line 62
    if-eq p4, v4, :cond_6

    .line 63
    .line 64
    const/4 v4, 0x4

    .line 65
    if-eq p4, v4, :cond_5

    .line 66
    .line 67
    const/4 v3, 0x5

    .line 68
    if-eq p4, v3, :cond_3

    .line 69
    .line 70
    :goto_0
    move-object v1, p1

    .line 71
    goto :goto_2

    .line 72
    :cond_3
    invoke-static {v2}, Ljava/lang/Float;->isNaN(F)Z

    .line 73
    .line 74
    .line 75
    move-result p4

    .line 76
    if-eqz p4, :cond_4

    .line 77
    .line 78
    iget v2, p5, Lk50;->m:F

    .line 79
    .line 80
    :cond_4
    invoke-static {v2}, Lk41;->c(F)F

    .line 81
    .line 82
    .line 83
    move-result p4

    .line 84
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    sget-object p5, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 88
    .line 89
    invoke-virtual {v6, p5}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v6, p4}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 93
    .line 94
    .line 95
    const/4 p4, 0x0

    .line 96
    invoke-virtual {v6, p4}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v0, p2, p3}, Landroid/graphics/Path;->moveTo(FF)V

    .line 103
    .line 104
    .line 105
    add-float/2addr p2, v1

    .line 106
    invoke-virtual {v0, p2, p3}, Landroid/graphics/Path;->lineTo(FF)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {p1, v0, v6}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 110
    .line 111
    .line 112
    goto :goto_0

    .line 113
    :cond_5
    move-object v1, p1

    .line 114
    move v2, p2

    .line 115
    move p4, v3

    .line 116
    goto :goto_1

    .line 117
    :cond_6
    sget-object p4, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 118
    .line 119
    invoke-virtual {v6, p4}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 120
    .line 121
    .line 122
    move p4, v3

    .line 123
    sub-float v3, p3, p4

    .line 124
    .line 125
    add-float v4, p2, v1

    .line 126
    .line 127
    add-float v5, p3, p4

    .line 128
    .line 129
    move-object v1, p1

    .line 130
    move v2, p2

    .line 131
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 132
    .line 133
    .line 134
    goto :goto_2

    .line 135
    :goto_1
    sget-object p1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 136
    .line 137
    invoke-virtual {v6, p1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 138
    .line 139
    .line 140
    add-float p2, v2, p4

    .line 141
    .line 142
    invoke-virtual {v1, p2, p3, p4, v6}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 143
    .line 144
    .line 145
    :goto_2
    invoke-virtual {v1, v7}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 146
    .line 147
    .line 148
    :cond_7
    :goto_3
    return-void
.end method

.method public final V1(Landroid/graphics/Canvas;)V
    .locals 32

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lm50;->m:Landroid/graphics/Paint$FontMetrics;

    .line 4
    .line 5
    iget-object v6, v0, Lm50;->i:Landroid/graphics/Paint;

    .line 6
    .line 7
    iget-object v2, v0, Lf74;->g:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v2, Lu61;

    .line 10
    .line 11
    iget-object v3, v0, Lm50;->k:Lk50;

    .line 12
    .line 13
    iget-boolean v4, v3, Ldh;->a:Z

    .line 14
    .line 15
    if-nez v4, :cond_0

    .line 16
    .line 17
    goto/16 :goto_21

    .line 18
    .line 19
    :cond_0
    iget v4, v3, Ldh;->d:F

    .line 20
    .line 21
    invoke-virtual {v6, v4}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 22
    .line 23
    .line 24
    iget v4, v3, Ldh;->e:I

    .line 25
    .line 26
    invoke-virtual {v6, v4}, Landroid/graphics/Paint;->setColor(I)V

    .line 27
    .line 28
    .line 29
    sget-object v4, Lk41;->a:Landroid/util/DisplayMetrics;

    .line 30
    .line 31
    invoke-virtual {v6, v1}, Landroid/graphics/Paint;->getFontMetrics(Landroid/graphics/Paint$FontMetrics;)F

    .line 32
    .line 33
    .line 34
    iget v4, v1, Landroid/graphics/Paint$FontMetrics;->descent:F

    .line 35
    .line 36
    iget v5, v1, Landroid/graphics/Paint$FontMetrics;->ascent:F

    .line 37
    .line 38
    sub-float v7, v4, v5

    .line 39
    .line 40
    invoke-virtual {v6, v1}, Landroid/graphics/Paint;->getFontMetrics(Landroid/graphics/Paint$FontMetrics;)F

    .line 41
    .line 42
    .line 43
    iget v4, v1, Landroid/graphics/Paint$FontMetrics;->ascent:F

    .line 44
    .line 45
    iget v5, v1, Landroid/graphics/Paint$FontMetrics;->top:F

    .line 46
    .line 47
    sub-float/2addr v4, v5

    .line 48
    iget v1, v1, Landroid/graphics/Paint$FontMetrics;->bottom:F

    .line 49
    .line 50
    add-float/2addr v4, v1

    .line 51
    const/4 v8, 0x0

    .line 52
    invoke-static {v8}, Lk41;->c(F)F

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    add-float v9, v1, v4

    .line 57
    .line 58
    const-string v1, "ABC"

    .line 59
    .line 60
    invoke-static {v6, v1}, Lk41;->a(Landroid/graphics/Paint;Ljava/lang/String;)I

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    int-to-float v1, v1

    .line 65
    const/high16 v10, 0x40000000    # 2.0f

    .line 66
    .line 67
    div-float/2addr v1, v10

    .line 68
    sub-float v11, v7, v1

    .line 69
    .line 70
    iget-object v12, v3, Lk50;->f:[Ll50;

    .line 71
    .line 72
    iget v1, v3, Lk50;->o:F

    .line 73
    .line 74
    invoke-static {v1}, Lk41;->c(F)F

    .line 75
    .line 76
    .line 77
    move-result v13

    .line 78
    iget v1, v3, Lk50;->n:F

    .line 79
    .line 80
    invoke-static {v1}, Lk41;->c(F)F

    .line 81
    .line 82
    .line 83
    move-result v14

    .line 84
    iget v1, v3, Lk50;->i:I

    .line 85
    .line 86
    iget v15, v3, Lk50;->g:I

    .line 87
    .line 88
    iget v4, v3, Lk50;->h:I

    .line 89
    .line 90
    iget v5, v3, Lk50;->j:I

    .line 91
    .line 92
    iget v8, v3, Lk50;->l:F

    .line 93
    .line 94
    invoke-static {v8}, Lk41;->c(F)F

    .line 95
    .line 96
    .line 97
    move-result v8

    .line 98
    move/from16 v17, v10

    .line 99
    .line 100
    iget v10, v3, Lk50;->p:F

    .line 101
    .line 102
    invoke-static {v10}, Lk41;->c(F)F

    .line 103
    .line 104
    .line 105
    move-result v10

    .line 106
    move/from16 v18, v4

    .line 107
    .line 108
    iget v4, v3, Ldh;->c:F

    .line 109
    .line 110
    move/from16 v19, v4

    .line 111
    .line 112
    iget v4, v3, Ldh;->b:F

    .line 113
    .line 114
    move/from16 v20, v7

    .line 115
    .line 116
    invoke-static {v15}, Lex0;->s(I)I

    .line 117
    .line 118
    .line 119
    move-result v7

    .line 120
    move/from16 v21, v8

    .line 121
    .line 122
    const/4 v8, 0x1

    .line 123
    move/from16 v22, v9

    .line 124
    .line 125
    const/4 v9, 0x2

    .line 126
    if-eqz v7, :cond_8

    .line 127
    .line 128
    if-eq v7, v8, :cond_4

    .line 129
    .line 130
    if-eq v7, v9, :cond_1

    .line 131
    .line 132
    move/from16 v23, v10

    .line 133
    .line 134
    const/4 v7, 0x0

    .line 135
    goto/16 :goto_6

    .line 136
    .line 137
    :cond_1
    if-ne v1, v9, :cond_2

    .line 138
    .line 139
    iget v7, v2, Lu61;->c:F

    .line 140
    .line 141
    :goto_0
    sub-float/2addr v7, v4

    .line 142
    goto :goto_1

    .line 143
    :cond_2
    iget-object v7, v2, Lu61;->b:Landroid/graphics/RectF;

    .line 144
    .line 145
    iget v7, v7, Landroid/graphics/RectF;->right:F

    .line 146
    .line 147
    goto :goto_0

    .line 148
    :goto_1
    if-ne v5, v8, :cond_3

    .line 149
    .line 150
    iget v4, v3, Lk50;->r:F

    .line 151
    .line 152
    sub-float/2addr v7, v4

    .line 153
    :cond_3
    move/from16 v23, v10

    .line 154
    .line 155
    goto :goto_6

    .line 156
    :cond_4
    if-ne v1, v9, :cond_5

    .line 157
    .line 158
    iget v7, v2, Lu61;->c:F

    .line 159
    .line 160
    div-float v7, v7, v17

    .line 161
    .line 162
    goto :goto_2

    .line 163
    :cond_5
    iget-object v7, v2, Lu61;->b:Landroid/graphics/RectF;

    .line 164
    .line 165
    iget v9, v7, Landroid/graphics/RectF;->left:F

    .line 166
    .line 167
    invoke-virtual {v7}, Landroid/graphics/RectF;->width()F

    .line 168
    .line 169
    .line 170
    move-result v7

    .line 171
    div-float v7, v7, v17

    .line 172
    .line 173
    add-float/2addr v7, v9

    .line 174
    :goto_2
    if-ne v5, v8, :cond_6

    .line 175
    .line 176
    move v9, v4

    .line 177
    goto :goto_3

    .line 178
    :cond_6
    neg-float v9, v4

    .line 179
    :goto_3
    add-float/2addr v7, v9

    .line 180
    const/4 v9, 0x2

    .line 181
    if-ne v1, v9, :cond_3

    .line 182
    .line 183
    move/from16 v23, v10

    .line 184
    .line 185
    float-to-double v9, v7

    .line 186
    const-wide/high16 v24, 0x4000000000000000L    # 2.0

    .line 187
    .line 188
    if-ne v5, v8, :cond_7

    .line 189
    .line 190
    iget v7, v3, Lk50;->r:F

    .line 191
    .line 192
    neg-float v7, v7

    .line 193
    move-wide/from16 v27, v9

    .line 194
    .line 195
    float-to-double v8, v7

    .line 196
    div-double v8, v8, v24

    .line 197
    .line 198
    move-wide/from16 v24, v8

    .line 199
    .line 200
    float-to-double v7, v4

    .line 201
    add-double v8, v24, v7

    .line 202
    .line 203
    goto :goto_4

    .line 204
    :cond_7
    move-wide/from16 v27, v9

    .line 205
    .line 206
    iget v7, v3, Lk50;->r:F

    .line 207
    .line 208
    float-to-double v7, v7

    .line 209
    div-double v7, v7, v24

    .line 210
    .line 211
    float-to-double v9, v4

    .line 212
    sub-double v8, v7, v9

    .line 213
    .line 214
    :goto_4
    add-double v9, v27, v8

    .line 215
    .line 216
    double-to-float v7, v9

    .line 217
    goto :goto_6

    .line 218
    :cond_8
    move/from16 v23, v10

    .line 219
    .line 220
    if-ne v1, v9, :cond_9

    .line 221
    .line 222
    goto :goto_5

    .line 223
    :cond_9
    iget-object v7, v2, Lu61;->b:Landroid/graphics/RectF;

    .line 224
    .line 225
    iget v7, v7, Landroid/graphics/RectF;->left:F

    .line 226
    .line 227
    add-float/2addr v4, v7

    .line 228
    :goto_5
    if-ne v5, v9, :cond_a

    .line 229
    .line 230
    iget v7, v3, Lk50;->r:F

    .line 231
    .line 232
    add-float/2addr v7, v4

    .line 233
    goto :goto_6

    .line 234
    :cond_a
    move v7, v4

    .line 235
    :goto_6
    invoke-static {v1}, Lex0;->s(I)I

    .line 236
    .line 237
    .line 238
    move-result v1

    .line 239
    if-eqz v1, :cond_1c

    .line 240
    .line 241
    const/4 v4, 0x1

    .line 242
    if-eq v1, v4, :cond_b

    .line 243
    .line 244
    goto/16 :goto_21

    .line 245
    .line 246
    :cond_b
    invoke-static/range {v18 .. v18}, Lex0;->s(I)I

    .line 247
    .line 248
    .line 249
    move-result v1

    .line 250
    if-eqz v1, :cond_f

    .line 251
    .line 252
    if-eq v1, v4, :cond_e

    .line 253
    .line 254
    const/4 v9, 0x2

    .line 255
    if-eq v1, v9, :cond_c

    .line 256
    .line 257
    const/4 v1, 0x0

    .line 258
    goto :goto_9

    .line 259
    :cond_c
    if-ne v15, v9, :cond_d

    .line 260
    .line 261
    iget v1, v2, Lu61;->d:F

    .line 262
    .line 263
    goto :goto_7

    .line 264
    :cond_d
    iget-object v1, v2, Lu61;->b:Landroid/graphics/RectF;

    .line 265
    .line 266
    iget v1, v1, Landroid/graphics/RectF;->bottom:F

    .line 267
    .line 268
    :goto_7
    iget v2, v3, Lk50;->s:F

    .line 269
    .line 270
    add-float v2, v2, v19

    .line 271
    .line 272
    sub-float/2addr v1, v2

    .line 273
    goto :goto_9

    .line 274
    :cond_e
    iget v1, v2, Lu61;->d:F

    .line 275
    .line 276
    div-float v1, v1, v17

    .line 277
    .line 278
    iget v2, v3, Lk50;->s:F

    .line 279
    .line 280
    div-float v2, v2, v17

    .line 281
    .line 282
    sub-float/2addr v1, v2

    .line 283
    iget v2, v3, Ldh;->c:F

    .line 284
    .line 285
    add-float/2addr v1, v2

    .line 286
    goto :goto_9

    .line 287
    :cond_f
    const/4 v9, 0x2

    .line 288
    if-ne v15, v9, :cond_10

    .line 289
    .line 290
    const/4 v1, 0x0

    .line 291
    goto :goto_8

    .line 292
    :cond_10
    iget-object v1, v2, Lu61;->b:Landroid/graphics/RectF;

    .line 293
    .line 294
    iget v1, v1, Landroid/graphics/RectF;->top:F

    .line 295
    .line 296
    :goto_8
    add-float v1, v1, v19

    .line 297
    .line 298
    :goto_9
    move v9, v1

    .line 299
    const/4 v10, 0x0

    .line 300
    const/4 v14, 0x0

    .line 301
    const/4 v15, 0x0

    .line 302
    :goto_a
    array-length v1, v12

    .line 303
    if-ge v14, v1, :cond_30

    .line 304
    .line 305
    aget-object v4, v12, v14

    .line 306
    .line 307
    iget v1, v4, Ll50;->b:I

    .line 308
    .line 309
    iget v2, v4, Ll50;->c:F

    .line 310
    .line 311
    iget-object v3, v4, Ll50;->a:Ljava/lang/String;

    .line 312
    .line 313
    const/4 v8, 0x1

    .line 314
    if-eq v1, v8, :cond_11

    .line 315
    .line 316
    move/from16 v26, v8

    .line 317
    .line 318
    goto :goto_b

    .line 319
    :cond_11
    const/16 v26, 0x0

    .line 320
    .line 321
    :goto_b
    invoke-static {v2}, Ljava/lang/Float;->isNaN(F)Z

    .line 322
    .line 323
    .line 324
    move-result v1

    .line 325
    if-eqz v1, :cond_12

    .line 326
    .line 327
    move/from16 v17, v21

    .line 328
    .line 329
    goto :goto_c

    .line 330
    :cond_12
    invoke-static {v2}, Lk41;->c(F)F

    .line 331
    .line 332
    .line 333
    move-result v1

    .line 334
    move/from16 v17, v1

    .line 335
    .line 336
    :goto_c
    if-eqz v26, :cond_14

    .line 337
    .line 338
    if-ne v5, v8, :cond_13

    .line 339
    .line 340
    add-float v1, v7, v15

    .line 341
    .line 342
    :goto_d
    move v2, v1

    .line 343
    move-object v1, v3

    .line 344
    goto :goto_e

    .line 345
    :cond_13
    sub-float v1, v17, v15

    .line 346
    .line 347
    sub-float v1, v7, v1

    .line 348
    .line 349
    goto :goto_d

    .line 350
    :goto_e
    add-float v3, v9, v11

    .line 351
    .line 352
    move/from16 v18, v5

    .line 353
    .line 354
    iget-object v5, v0, Lm50;->k:Lk50;

    .line 355
    .line 356
    move/from16 v25, v7

    .line 357
    .line 358
    move/from16 v7, v18

    .line 359
    .line 360
    move/from16 v18, v9

    .line 361
    .line 362
    move-object v9, v1

    .line 363
    move-object/from16 v1, p1

    .line 364
    .line 365
    invoke-virtual/range {v0 .. v5}, Lm50;->U1(Landroid/graphics/Canvas;FFLl50;Lk50;)V

    .line 366
    .line 367
    .line 368
    if-ne v7, v8, :cond_15

    .line 369
    .line 370
    add-float v2, v2, v17

    .line 371
    .line 372
    goto :goto_f

    .line 373
    :cond_14
    move-object/from16 v1, p1

    .line 374
    .line 375
    move/from16 v25, v7

    .line 376
    .line 377
    move/from16 v18, v9

    .line 378
    .line 379
    move-object v9, v3

    .line 380
    move v7, v5

    .line 381
    move/from16 v2, v25

    .line 382
    .line 383
    :cond_15
    :goto_f
    if-eqz v9, :cond_1b

    .line 384
    .line 385
    if-eqz v26, :cond_18

    .line 386
    .line 387
    if-nez v10, :cond_18

    .line 388
    .line 389
    if-ne v7, v8, :cond_16

    .line 390
    .line 391
    move v3, v13

    .line 392
    goto :goto_10

    .line 393
    :cond_16
    neg-float v3, v13

    .line 394
    :goto_10
    add-float/2addr v2, v3

    .line 395
    :cond_17
    :goto_11
    const/4 v3, 0x2

    .line 396
    goto :goto_12

    .line 397
    :cond_18
    if-eqz v10, :cond_17

    .line 398
    .line 399
    move/from16 v2, v25

    .line 400
    .line 401
    goto :goto_11

    .line 402
    :goto_12
    if-ne v7, v3, :cond_19

    .line 403
    .line 404
    invoke-virtual {v6, v9}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    .line 405
    .line 406
    .line 407
    move-result v3

    .line 408
    float-to-int v3, v3

    .line 409
    int-to-float v3, v3

    .line 410
    sub-float/2addr v2, v3

    .line 411
    :cond_19
    if-nez v10, :cond_1a

    .line 412
    .line 413
    add-float v3, v18, v20

    .line 414
    .line 415
    invoke-virtual {v1, v9, v2, v3, v6}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 416
    .line 417
    .line 418
    move/from16 v9, v18

    .line 419
    .line 420
    goto :goto_13

    .line 421
    :cond_1a
    add-float v3, v20, v22

    .line 422
    .line 423
    add-float v3, v3, v18

    .line 424
    .line 425
    add-float v4, v3, v20

    .line 426
    .line 427
    invoke-virtual {v1, v9, v2, v4, v6}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 428
    .line 429
    .line 430
    move v9, v3

    .line 431
    :goto_13
    add-float v2, v20, v22

    .line 432
    .line 433
    add-float/2addr v2, v9

    .line 434
    move v9, v2

    .line 435
    const/4 v15, 0x0

    .line 436
    goto :goto_14

    .line 437
    :cond_1b
    add-float v17, v17, v23

    .line 438
    .line 439
    add-float v17, v17, v15

    .line 440
    .line 441
    move/from16 v15, v17

    .line 442
    .line 443
    move/from16 v9, v18

    .line 444
    .line 445
    const/4 v10, 0x1

    .line 446
    :goto_14
    add-int/lit8 v14, v14, 0x1

    .line 447
    .line 448
    move v5, v7

    .line 449
    move/from16 v7, v25

    .line 450
    .line 451
    goto/16 :goto_a

    .line 452
    .line 453
    :cond_1c
    move-object/from16 v1, p1

    .line 454
    .line 455
    move/from16 v25, v7

    .line 456
    .line 457
    move v7, v5

    .line 458
    iget-object v8, v3, Lk50;->v:Ljava/util/ArrayList;

    .line 459
    .line 460
    iget-object v9, v3, Lk50;->t:Ljava/util/ArrayList;

    .line 461
    .line 462
    iget-object v10, v3, Lk50;->u:Ljava/util/ArrayList;

    .line 463
    .line 464
    invoke-static/range {v18 .. v18}, Lex0;->s(I)I

    .line 465
    .line 466
    .line 467
    move-result v4

    .line 468
    if-eqz v4, :cond_1f

    .line 469
    .line 470
    const/4 v5, 0x1

    .line 471
    if-eq v4, v5, :cond_1e

    .line 472
    .line 473
    const/4 v5, 0x2

    .line 474
    if-eq v4, v5, :cond_1d

    .line 475
    .line 476
    const/4 v2, 0x0

    .line 477
    goto :goto_15

    .line 478
    :cond_1d
    iget v2, v2, Lu61;->d:F

    .line 479
    .line 480
    sub-float v2, v2, v19

    .line 481
    .line 482
    iget v3, v3, Lk50;->s:F

    .line 483
    .line 484
    sub-float/2addr v2, v3

    .line 485
    goto :goto_15

    .line 486
    :cond_1e
    iget v2, v2, Lu61;->d:F

    .line 487
    .line 488
    iget v3, v3, Lk50;->s:F

    .line 489
    .line 490
    sub-float/2addr v2, v3

    .line 491
    div-float v2, v2, v17

    .line 492
    .line 493
    add-float v2, v2, v19

    .line 494
    .line 495
    goto :goto_15

    .line 496
    :cond_1f
    move/from16 v2, v19

    .line 497
    .line 498
    :goto_15
    array-length v3, v12

    .line 499
    move/from16 v5, v25

    .line 500
    .line 501
    const/4 v1, 0x0

    .line 502
    const/4 v4, 0x0

    .line 503
    :goto_16
    if-ge v4, v3, :cond_30

    .line 504
    .line 505
    move/from16 v16, v2

    .line 506
    .line 507
    aget-object v2, v12, v4

    .line 508
    .line 509
    move/from16 v18, v3

    .line 510
    .line 511
    iget v3, v2, Ll50;->b:I

    .line 512
    .line 513
    move/from16 v19, v11

    .line 514
    .line 515
    iget-object v11, v2, Ll50;->a:Ljava/lang/String;

    .line 516
    .line 517
    move/from16 v27, v5

    .line 518
    .line 519
    iget v5, v2, Ll50;->c:F

    .line 520
    .line 521
    move-object/from16 v28, v2

    .line 522
    .line 523
    const/4 v2, 0x1

    .line 524
    if-eq v3, v2, :cond_20

    .line 525
    .line 526
    const/16 v29, 0x1

    .line 527
    .line 528
    goto :goto_17

    .line 529
    :cond_20
    const/16 v29, 0x0

    .line 530
    .line 531
    :goto_17
    invoke-static {v5}, Ljava/lang/Float;->isNaN(F)Z

    .line 532
    .line 533
    .line 534
    move-result v2

    .line 535
    if-eqz v2, :cond_21

    .line 536
    .line 537
    move/from16 v30, v21

    .line 538
    .line 539
    goto :goto_18

    .line 540
    :cond_21
    invoke-static {v5}, Lk41;->c(F)F

    .line 541
    .line 542
    .line 543
    move-result v2

    .line 544
    move/from16 v30, v2

    .line 545
    .line 546
    :goto_18
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    .line 547
    .line 548
    .line 549
    move-result v2

    .line 550
    if-ge v4, v2, :cond_22

    .line 551
    .line 552
    invoke-virtual {v10, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 553
    .line 554
    .line 555
    move-result-object v2

    .line 556
    check-cast v2, Ljava/lang/Boolean;

    .line 557
    .line 558
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 559
    .line 560
    .line 561
    move-result v2

    .line 562
    if-eqz v2, :cond_22

    .line 563
    .line 564
    add-float v2, v20, v22

    .line 565
    .line 566
    add-float v2, v2, v16

    .line 567
    .line 568
    move/from16 v16, v2

    .line 569
    .line 570
    move/from16 v5, v25

    .line 571
    .line 572
    goto :goto_19

    .line 573
    :cond_22
    move/from16 v5, v27

    .line 574
    .line 575
    :goto_19
    cmpl-float v2, v5, v25

    .line 576
    .line 577
    if-nez v2, :cond_24

    .line 578
    .line 579
    const/4 v3, 0x2

    .line 580
    if-ne v15, v3, :cond_24

    .line 581
    .line 582
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 583
    .line 584
    .line 585
    move-result v2

    .line 586
    if-ge v1, v2, :cond_24

    .line 587
    .line 588
    if-ne v7, v3, :cond_23

    .line 589
    .line 590
    invoke-virtual {v8, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 591
    .line 592
    .line 593
    move-result-object v2

    .line 594
    check-cast v2, Lxt;

    .line 595
    .line 596
    iget v2, v2, Lxt;->g:F

    .line 597
    .line 598
    goto :goto_1a

    .line 599
    :cond_23
    invoke-virtual {v8, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 600
    .line 601
    .line 602
    move-result-object v2

    .line 603
    check-cast v2, Lxt;

    .line 604
    .line 605
    iget v2, v2, Lxt;->g:F

    .line 606
    .line 607
    neg-float v2, v2

    .line 608
    :goto_1a
    div-float v2, v2, v17

    .line 609
    .line 610
    add-float/2addr v5, v2

    .line 611
    add-int/lit8 v1, v1, 0x1

    .line 612
    .line 613
    :cond_24
    move/from16 v27, v1

    .line 614
    .line 615
    if-nez v11, :cond_25

    .line 616
    .line 617
    const/16 v31, 0x1

    .line 618
    .line 619
    goto :goto_1b

    .line 620
    :cond_25
    const/16 v31, 0x0

    .line 621
    .line 622
    :goto_1b
    if-eqz v29, :cond_28

    .line 623
    .line 624
    const/4 v3, 0x2

    .line 625
    if-ne v7, v3, :cond_26

    .line 626
    .line 627
    sub-float v5, v5, v30

    .line 628
    .line 629
    :cond_26
    move v2, v5

    .line 630
    add-float v3, v16, v19

    .line 631
    .line 632
    iget-object v5, v0, Lm50;->k:Lk50;

    .line 633
    .line 634
    move-object v1, v8

    .line 635
    move v8, v4

    .line 636
    move-object/from16 v4, v28

    .line 637
    .line 638
    move-object/from16 v28, v1

    .line 639
    .line 640
    move-object/from16 v1, p1

    .line 641
    .line 642
    invoke-virtual/range {v0 .. v5}, Lm50;->U1(Landroid/graphics/Canvas;FFLl50;Lk50;)V

    .line 643
    .line 644
    .line 645
    const/4 v4, 0x1

    .line 646
    if-ne v7, v4, :cond_27

    .line 647
    .line 648
    add-float v5, v2, v30

    .line 649
    .line 650
    goto :goto_1c

    .line 651
    :cond_27
    move v5, v2

    .line 652
    goto :goto_1c

    .line 653
    :cond_28
    move-object/from16 v1, p1

    .line 654
    .line 655
    move-object/from16 v28, v8

    .line 656
    .line 657
    move v8, v4

    .line 658
    :goto_1c
    if-nez v31, :cond_2e

    .line 659
    .line 660
    const/4 v3, 0x2

    .line 661
    if-eqz v29, :cond_2a

    .line 662
    .line 663
    if-ne v7, v3, :cond_29

    .line 664
    .line 665
    neg-float v0, v13

    .line 666
    goto :goto_1d

    .line 667
    :cond_29
    move v0, v13

    .line 668
    :goto_1d
    add-float/2addr v5, v0

    .line 669
    :cond_2a
    if-ne v7, v3, :cond_2b

    .line 670
    .line 671
    invoke-virtual {v9, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 672
    .line 673
    .line 674
    move-result-object v0

    .line 675
    check-cast v0, Lxt;

    .line 676
    .line 677
    iget v0, v0, Lxt;->g:F

    .line 678
    .line 679
    sub-float/2addr v5, v0

    .line 680
    :cond_2b
    add-float v0, v16, v20

    .line 681
    .line 682
    invoke-virtual {v1, v11, v5, v0, v6}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 683
    .line 684
    .line 685
    const/4 v4, 0x1

    .line 686
    if-ne v7, v4, :cond_2c

    .line 687
    .line 688
    invoke-virtual {v9, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 689
    .line 690
    .line 691
    move-result-object v0

    .line 692
    check-cast v0, Lxt;

    .line 693
    .line 694
    iget v0, v0, Lxt;->g:F

    .line 695
    .line 696
    add-float/2addr v5, v0

    .line 697
    :cond_2c
    const/4 v3, 0x2

    .line 698
    if-ne v7, v3, :cond_2d

    .line 699
    .line 700
    neg-float v0, v14

    .line 701
    goto :goto_1e

    .line 702
    :cond_2d
    move v0, v14

    .line 703
    :goto_1e
    add-float/2addr v5, v0

    .line 704
    move/from16 v0, v23

    .line 705
    .line 706
    goto :goto_20

    .line 707
    :cond_2e
    const/4 v3, 0x2

    .line 708
    const/4 v4, 0x1

    .line 709
    move/from16 v0, v23

    .line 710
    .line 711
    if-ne v7, v3, :cond_2f

    .line 712
    .line 713
    neg-float v2, v0

    .line 714
    goto :goto_1f

    .line 715
    :cond_2f
    move v2, v0

    .line 716
    :goto_1f
    add-float/2addr v5, v2

    .line 717
    :goto_20
    add-int/lit8 v2, v8, 0x1

    .line 718
    .line 719
    move/from16 v23, v0

    .line 720
    .line 721
    move v4, v2

    .line 722
    move/from16 v2, v16

    .line 723
    .line 724
    move/from16 v3, v18

    .line 725
    .line 726
    move/from16 v11, v19

    .line 727
    .line 728
    move/from16 v1, v27

    .line 729
    .line 730
    move-object/from16 v8, v28

    .line 731
    .line 732
    move-object/from16 v0, p0

    .line 733
    .line 734
    goto/16 :goto_16

    .line 735
    .line 736
    :cond_30
    :goto_21
    return-void
.end method
