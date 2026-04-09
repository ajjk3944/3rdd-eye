.class public final Ln20;
.super Laq;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public s:Lm60;

.field public t:Le6;


# virtual methods
.method public final draw(Landroid/graphics/Canvas;)V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v1}, Landroid/graphics/Rect;->isEmpty()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-nez v1, :cond_c

    .line 14
    .line 15
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->isVisible()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_c

    .line 20
    .line 21
    iget-object v1, v0, Laq;->q:Landroid/graphics/Rect;

    .line 22
    .line 23
    invoke-virtual {v2, v1}, Landroid/graphics/Canvas;->getClipBounds(Landroid/graphics/Rect;)Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-nez v1, :cond_0

    .line 28
    .line 29
    goto/16 :goto_8

    .line 30
    .line 31
    :cond_0
    iget-object v1, v0, Laq;->h:Ls4;

    .line 32
    .line 33
    const/high16 v7, 0x3f800000    # 1.0f

    .line 34
    .line 35
    if-eqz v1, :cond_1

    .line 36
    .line 37
    iget-object v1, v0, Laq;->f:Landroid/content/Context;

    .line 38
    .line 39
    invoke-virtual {v1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    const-string v3, "animator_duration_scale"

    .line 44
    .line 45
    invoke-static {v1, v3, v7}, Landroid/provider/Settings$Global;->getFloat(Landroid/content/ContentResolver;Ljava/lang/String;F)F

    .line 46
    .line 47
    .line 48
    :cond_1
    invoke-virtual {v2}, Landroid/graphics/Canvas;->save()I

    .line 49
    .line 50
    .line 51
    iget-object v1, v0, Ln20;->s:Lm60;

    .line 52
    .line 53
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    invoke-virtual {v0}, Laq;->b()F

    .line 58
    .line 59
    .line 60
    move-result v4

    .line 61
    iget-object v5, v0, Laq;->i:Landroid/animation/ObjectAnimator;

    .line 62
    .line 63
    const/4 v8, 0x1

    .line 64
    const/4 v9, 0x0

    .line 65
    if-eqz v5, :cond_3

    .line 66
    .line 67
    invoke-virtual {v5}, Landroid/animation/ValueAnimator;->isRunning()Z

    .line 68
    .line 69
    .line 70
    move-result v5

    .line 71
    if-nez v5, :cond_2

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_2
    move v5, v8

    .line 75
    goto :goto_1

    .line 76
    :cond_3
    :goto_0
    move v5, v9

    .line 77
    :goto_1
    iget-object v6, v0, Laq;->j:Landroid/animation/ObjectAnimator;

    .line 78
    .line 79
    if-eqz v6, :cond_5

    .line 80
    .line 81
    invoke-virtual {v6}, Landroid/animation/ValueAnimator;->isRunning()Z

    .line 82
    .line 83
    .line 84
    move-result v6

    .line 85
    if-nez v6, :cond_4

    .line 86
    .line 87
    goto :goto_2

    .line 88
    :cond_4
    move v6, v8

    .line 89
    goto :goto_3

    .line 90
    :cond_5
    :goto_2
    move v6, v9

    .line 91
    :goto_3
    invoke-virtual/range {v1 .. v6}, Leq;->c(Landroid/graphics/Canvas;Landroid/graphics/Rect;FZZ)V

    .line 92
    .line 93
    .line 94
    iget-object v12, v0, Laq;->g:Lv60;

    .line 95
    .line 96
    iget v10, v12, Lv60;->i:I

    .line 97
    .line 98
    move v1, v7

    .line 99
    iget v7, v0, Laq;->p:I

    .line 100
    .line 101
    instance-of v13, v12, Lv60;

    .line 102
    .line 103
    if-eqz v13, :cond_6

    .line 104
    .line 105
    if-nez v10, :cond_6

    .line 106
    .line 107
    invoke-virtual {v12, v9}, Lv60;->c(Z)Z

    .line 108
    .line 109
    .line 110
    move-result v2

    .line 111
    if-nez v2, :cond_6

    .line 112
    .line 113
    move v14, v8

    .line 114
    goto :goto_4

    .line 115
    :cond_6
    move v14, v9

    .line 116
    :goto_4
    iget-object v3, v0, Laq;->o:Landroid/graphics/Paint;

    .line 117
    .line 118
    if-eqz v14, :cond_8

    .line 119
    .line 120
    iget-object v1, v0, Ln20;->s:Lm60;

    .line 121
    .line 122
    iget v6, v12, Lv60;->f:I

    .line 123
    .line 124
    const/4 v8, 0x0

    .line 125
    const/4 v4, 0x0

    .line 126
    const/high16 v5, 0x3f800000    # 1.0f

    .line 127
    .line 128
    move-object/from16 v2, p1

    .line 129
    .line 130
    invoke-virtual/range {v1 .. v8}, Lm60;->g(Landroid/graphics/Canvas;Landroid/graphics/Paint;FFIII)V

    .line 131
    .line 132
    .line 133
    :cond_7
    move/from16 v16, v7

    .line 134
    .line 135
    move v15, v10

    .line 136
    goto :goto_5

    .line 137
    :cond_8
    if-eqz v13, :cond_7

    .line 138
    .line 139
    iget-object v2, v0, Ln20;->t:Le6;

    .line 140
    .line 141
    iget-object v2, v2, Le6;->b:Ljava/lang/Object;

    .line 142
    .line 143
    check-cast v2, Ljava/util/ArrayList;

    .line 144
    .line 145
    invoke-virtual {v2, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v2

    .line 149
    check-cast v2, Lcq;

    .line 150
    .line 151
    iget-object v4, v0, Ln20;->t:Le6;

    .line 152
    .line 153
    iget-object v4, v4, Le6;->b:Ljava/lang/Object;

    .line 154
    .line 155
    check-cast v4, Ljava/util/ArrayList;

    .line 156
    .line 157
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 158
    .line 159
    .line 160
    move-result v5

    .line 161
    sub-int/2addr v5, v8

    .line 162
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v4

    .line 166
    move-object v11, v4

    .line 167
    check-cast v11, Lcq;

    .line 168
    .line 169
    move v4, v1

    .line 170
    iget-object v1, v0, Ln20;->s:Lm60;

    .line 171
    .line 172
    if-eqz v1, :cond_9

    .line 173
    .line 174
    iget v5, v2, Lcq;->a:F

    .line 175
    .line 176
    iget v6, v12, Lv60;->f:I

    .line 177
    .line 178
    const/4 v4, 0x0

    .line 179
    move-object/from16 v2, p1

    .line 180
    .line 181
    move v8, v10

    .line 182
    invoke-virtual/range {v1 .. v8}, Lm60;->g(Landroid/graphics/Canvas;Landroid/graphics/Paint;FFIII)V

    .line 183
    .line 184
    .line 185
    iget-object v1, v0, Ln20;->s:Lm60;

    .line 186
    .line 187
    iget v4, v11, Lcq;->b:F

    .line 188
    .line 189
    const/high16 v5, 0x3f800000    # 1.0f

    .line 190
    .line 191
    iget v6, v12, Lv60;->f:I

    .line 192
    .line 193
    invoke-virtual/range {v1 .. v8}, Lm60;->g(Landroid/graphics/Canvas;Landroid/graphics/Paint;FFIII)V

    .line 194
    .line 195
    .line 196
    move-object v1, v2

    .line 197
    move/from16 v16, v7

    .line 198
    .line 199
    move v15, v8

    .line 200
    goto :goto_5

    .line 201
    :cond_9
    move-object/from16 v1, p1

    .line 202
    .line 203
    move v8, v10

    .line 204
    invoke-virtual {v1}, Landroid/graphics/Canvas;->save()I

    .line 205
    .line 206
    .line 207
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 208
    .line 209
    .line 210
    const/4 v5, 0x0

    .line 211
    invoke-virtual {v1, v5}, Landroid/graphics/Canvas;->rotate(F)V

    .line 212
    .line 213
    .line 214
    iget-object v1, v0, Ln20;->s:Lm60;

    .line 215
    .line 216
    iget v5, v11, Lcq;->b:F

    .line 217
    .line 218
    iget v2, v2, Lcq;->a:F

    .line 219
    .line 220
    add-float/2addr v2, v4

    .line 221
    iget v6, v12, Lv60;->f:I

    .line 222
    .line 223
    move v4, v5

    .line 224
    move v5, v2

    .line 225
    move-object/from16 v2, p1

    .line 226
    .line 227
    invoke-virtual/range {v1 .. v8}, Lm60;->g(Landroid/graphics/Canvas;Landroid/graphics/Paint;FFIII)V

    .line 228
    .line 229
    .line 230
    move/from16 v16, v7

    .line 231
    .line 232
    move v15, v8

    .line 233
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->restore()V

    .line 234
    .line 235
    .line 236
    :goto_5
    move v1, v9

    .line 237
    :goto_6
    iget-object v2, v0, Ln20;->t:Le6;

    .line 238
    .line 239
    iget-object v2, v2, Le6;->b:Ljava/lang/Object;

    .line 240
    .line 241
    check-cast v2, Ljava/util/ArrayList;

    .line 242
    .line 243
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 244
    .line 245
    .line 246
    move-result v2

    .line 247
    if-ge v1, v2, :cond_b

    .line 248
    .line 249
    iget-object v2, v0, Ln20;->t:Le6;

    .line 250
    .line 251
    iget-object v2, v2, Le6;->b:Ljava/lang/Object;

    .line 252
    .line 253
    check-cast v2, Ljava/util/ArrayList;

    .line 254
    .line 255
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 256
    .line 257
    .line 258
    move-result-object v2

    .line 259
    check-cast v2, Lcq;

    .line 260
    .line 261
    invoke-virtual {v0}, Laq;->c()F

    .line 262
    .line 263
    .line 264
    move-result v4

    .line 265
    iput v4, v2, Lcq;->f:F

    .line 266
    .line 267
    move v9, v1

    .line 268
    iget-object v1, v0, Ln20;->s:Lm60;

    .line 269
    .line 270
    iget v4, v0, Laq;->p:I

    .line 271
    .line 272
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 273
    .line 274
    .line 275
    iget v5, v2, Lcq;->c:I

    .line 276
    .line 277
    invoke-static {v5, v4}, Li41;->b(II)I

    .line 278
    .line 279
    .line 280
    move-result v6

    .line 281
    iget-boolean v4, v2, Lcq;->g:Z

    .line 282
    .line 283
    iput-boolean v4, v1, Lm60;->m:Z

    .line 284
    .line 285
    iget v4, v2, Lcq;->a:F

    .line 286
    .line 287
    iget v5, v2, Lcq;->b:F

    .line 288
    .line 289
    iget v7, v2, Lcq;->d:I

    .line 290
    .line 291
    move v8, v9

    .line 292
    iget v9, v2, Lcq;->e:F

    .line 293
    .line 294
    iget v10, v2, Lcq;->f:F

    .line 295
    .line 296
    const/4 v11, 0x1

    .line 297
    move/from16 v17, v8

    .line 298
    .line 299
    move v8, v7

    .line 300
    move/from16 v18, v13

    .line 301
    .line 302
    move-object v13, v2

    .line 303
    move-object/from16 v2, p1

    .line 304
    .line 305
    invoke-virtual/range {v1 .. v11}, Lm60;->e(Landroid/graphics/Canvas;Landroid/graphics/Paint;FFIIIFFZ)V

    .line 306
    .line 307
    .line 308
    if-lez v17, :cond_a

    .line 309
    .line 310
    if-nez v14, :cond_a

    .line 311
    .line 312
    if-eqz v18, :cond_a

    .line 313
    .line 314
    iget-object v1, v0, Ln20;->t:Le6;

    .line 315
    .line 316
    iget-object v1, v1, Le6;->b:Ljava/lang/Object;

    .line 317
    .line 318
    check-cast v1, Ljava/util/ArrayList;

    .line 319
    .line 320
    add-int/lit8 v2, v17, -0x1

    .line 321
    .line 322
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 323
    .line 324
    .line 325
    move-result-object v1

    .line 326
    check-cast v1, Lcq;

    .line 327
    .line 328
    iget-object v2, v0, Ln20;->s:Lm60;

    .line 329
    .line 330
    iget v4, v1, Lcq;->b:F

    .line 331
    .line 332
    iget v5, v13, Lcq;->a:F

    .line 333
    .line 334
    iget v6, v12, Lv60;->f:I

    .line 335
    .line 336
    move-object v1, v2

    .line 337
    move v8, v15

    .line 338
    move/from16 v7, v16

    .line 339
    .line 340
    move-object/from16 v2, p1

    .line 341
    .line 342
    invoke-virtual/range {v1 .. v8}, Lm60;->g(Landroid/graphics/Canvas;Landroid/graphics/Paint;FFIII)V

    .line 343
    .line 344
    .line 345
    goto :goto_7

    .line 346
    :cond_a
    move v8, v15

    .line 347
    move/from16 v7, v16

    .line 348
    .line 349
    :goto_7
    add-int/lit8 v1, v17, 0x1

    .line 350
    .line 351
    move/from16 v16, v7

    .line 352
    .line 353
    move v15, v8

    .line 354
    move/from16 v13, v18

    .line 355
    .line 356
    goto :goto_6

    .line 357
    :cond_b
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->restore()V

    .line 358
    .line 359
    .line 360
    :cond_c
    :goto_8
    return-void
.end method

.method public final e(ZZZ)Z
    .locals 3

    .line 1
    invoke-super {p0, p1, p2, p3}, Laq;->e(ZZZ)Z

    .line 2
    .line 3
    .line 4
    move-result p2

    .line 5
    iget-object v0, p0, Laq;->h:Ls4;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Laq;->f:Landroid/content/Context;

    .line 10
    .line 11
    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v1, "animator_duration_scale"

    .line 16
    .line 17
    const/high16 v2, 0x3f800000    # 1.0f

    .line 18
    .line 19
    invoke-static {v0, v1, v2}, Landroid/provider/Settings$Global;->getFloat(Landroid/content/ContentResolver;Ljava/lang/String;F)F

    .line 20
    .line 21
    .line 22
    :cond_0
    invoke-virtual {p0}, Laq;->isRunning()Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-nez v0, :cond_1

    .line 27
    .line 28
    iget-object v0, p0, Ln20;->t:Le6;

    .line 29
    .line 30
    invoke-virtual {v0}, Le6;->c()V

    .line 31
    .line 32
    .line 33
    :cond_1
    if-eqz p1, :cond_3

    .line 34
    .line 35
    if-nez p3, :cond_2

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_2
    iget-object p1, p0, Ln20;->t:Le6;

    .line 39
    .line 40
    invoke-virtual {p1}, Le6;->p()V

    .line 41
    .line 42
    .line 43
    :cond_3
    :goto_0
    return p2
.end method

.method public final getIntrinsicHeight()I
    .locals 1

    .line 1
    iget-object v0, p0, Ln20;->s:Lm60;

    .line 2
    .line 3
    invoke-virtual {v0}, Lm60;->a()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final getIntrinsicWidth()I
    .locals 1

    .line 1
    iget-object v0, p0, Ln20;->s:Lm60;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    const/4 v0, -0x1

    .line 7
    return v0
.end method
