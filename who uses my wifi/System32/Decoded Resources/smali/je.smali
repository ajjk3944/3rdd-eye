.class public abstract Lje;
.super Landroid/view/ViewGroup;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lne;


# instance fields
.field public A:F

.field public B:F

.field public C:Z

.field public D:[Lv00;

.field public E:F

.field public F:Ljava/util/ArrayList;

.field public G:Z

.field public f:Z

.field public g:Lle;

.field public h:Z

.field public i:Z

.field public j:F

.field public k:Lxn;

.field public l:Landroid/graphics/Paint;

.field public m:Landroid/graphics/Paint;

.field public n:Lcb1;

.field public o:Z

.field public p:Llo;

.field public q:Lk50;

.field public r:Loe;

.field public s:Ljava/lang/String;

.field public t:Lm50;

.field public u:Lom;

.field public v:Lme;

.field public w:Lu61;

.field public x:Lke;

.field public y:F

.field public z:F


# direct methods
.method public static e(Landroid/view/View;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    .line 13
    .line 14
    .line 15
    :cond_0
    instance-of v0, p0, Landroid/view/ViewGroup;

    .line 16
    .line 17
    if-eqz v0, :cond_2

    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    :goto_0
    move-object v1, p0

    .line 21
    check-cast v1, Landroid/view/ViewGroup;

    .line 22
    .line 23
    invoke-virtual {v1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-ge v0, v2, :cond_1

    .line 28
    .line 29
    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-static {v1}, Lje;->e(Landroid/view/View;)V

    .line 34
    .line 35
    .line 36
    add-int/lit8 v0, v0, 0x1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    invoke-virtual {v1}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 40
    .line 41
    .line 42
    :cond_2
    return-void
.end method


# virtual methods
.method public abstract a()V
.end method

.method public final b(FF)Lv00;
    .locals 22

    .line 1
    move/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p0

    .line 4
    .line 5
    move/from16 v2, p2

    .line 6
    .line 7
    iget-object v3, v1, Lje;->g:Lle;

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    if-nez v3, :cond_0

    .line 11
    .line 12
    const-string v0, "MPAndroidChart"

    .line 13
    .line 14
    const-string v2, "Can\'t select by touch. No data set."

    .line 15
    .line 16
    invoke-static {v0, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 17
    .line 18
    .line 19
    return-object v4

    .line 20
    :cond_0
    invoke-virtual {v1}, Lje;->getHighlighter()Lr10;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    check-cast v3, Lme;

    .line 25
    .line 26
    iget-object v5, v3, Lme;->a:Lcom/github/mikephil/charting/charts/LineChart;

    .line 27
    .line 28
    iget-object v6, v5, Lk9;->e0:Luk1;

    .line 29
    .line 30
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    sget-object v7, Lz90;->i:Lni0;

    .line 34
    .line 35
    invoke-virtual {v7}, Lni0;->b()Lmi0;

    .line 36
    .line 37
    .line 38
    move-result-object v8

    .line 39
    check-cast v8, Lz90;

    .line 40
    .line 41
    const-wide/16 v9, 0x0

    .line 42
    .line 43
    iput-wide v9, v8, Lz90;->g:D

    .line 44
    .line 45
    iput-wide v9, v8, Lz90;->h:D

    .line 46
    .line 47
    invoke-virtual {v6, v0, v2, v8}, Luk1;->b(FFLz90;)V

    .line 48
    .line 49
    .line 50
    iget-wide v9, v8, Lz90;->g:D

    .line 51
    .line 52
    double-to-float v6, v9

    .line 53
    invoke-virtual {v7, v8}, Lni0;->c(Lmi0;)V

    .line 54
    .line 55
    .line 56
    iget-object v3, v3, Lme;->b:Ljava/util/ArrayList;

    .line 57
    .line 58
    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    .line 59
    .line 60
    .line 61
    invoke-interface {v5}, Ln9;->getData()Lm9;

    .line 62
    .line 63
    .line 64
    move-result-object v7

    .line 65
    if-nez v7, :cond_2

    .line 66
    .line 67
    :cond_1
    move-object/from16 v16, v4

    .line 68
    .line 69
    move-object/from16 v19, v5

    .line 70
    .line 71
    const/16 v17, 0x0

    .line 72
    .line 73
    const/16 v18, 0x1

    .line 74
    .line 75
    goto/16 :goto_6

    .line 76
    .line 77
    :cond_2
    iget-object v10, v7, Lle;->i:Ljava/util/ArrayList;

    .line 78
    .line 79
    if-nez v10, :cond_3

    .line 80
    .line 81
    const/4 v10, 0x0

    .line 82
    goto :goto_0

    .line 83
    :cond_3
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    .line 84
    .line 85
    .line 86
    move-result v10

    .line 87
    :goto_0
    const/4 v11, 0x0

    .line 88
    :goto_1
    if-ge v11, v10, :cond_1

    .line 89
    .line 90
    invoke-virtual {v7, v11}, Lle;->d(I)Lq10;

    .line 91
    .line 92
    .line 93
    move-result-object v12

    .line 94
    move-object v13, v12

    .line 95
    check-cast v13, Ll60;

    .line 96
    .line 97
    iget-boolean v13, v13, Ll60;->e:Z

    .line 98
    .line 99
    if-nez v13, :cond_4

    .line 100
    .line 101
    move-object/from16 v16, v4

    .line 102
    .line 103
    move-object/from16 v19, v5

    .line 104
    .line 105
    move/from16 v21, v6

    .line 106
    .line 107
    const/16 v17, 0x0

    .line 108
    .line 109
    const/16 v18, 0x1

    .line 110
    .line 111
    goto/16 :goto_5

    .line 112
    .line 113
    :cond_4
    new-instance v13, Ljava/util/ArrayList;

    .line 114
    .line 115
    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 116
    .line 117
    .line 118
    check-cast v12, Ll60;

    .line 119
    .line 120
    invoke-virtual {v12, v6}, Ll60;->a(F)Ljava/util/ArrayList;

    .line 121
    .line 122
    .line 123
    move-result-object v14

    .line 124
    iget v15, v12, Ll60;->d:I

    .line 125
    .line 126
    invoke-virtual {v14}, Ljava/util/ArrayList;->size()I

    .line 127
    .line 128
    .line 129
    move-result v16

    .line 130
    if-nez v16, :cond_5

    .line 131
    .line 132
    move-object/from16 v16, v4

    .line 133
    .line 134
    const/high16 v4, 0x7fc00000    # Float.NaN

    .line 135
    .line 136
    const/16 v17, 0x0

    .line 137
    .line 138
    const/4 v8, 0x3

    .line 139
    invoke-virtual {v12, v6, v4, v8}, Ll60;->c(FFI)Lxs;

    .line 140
    .line 141
    .line 142
    move-result-object v4

    .line 143
    if-eqz v4, :cond_6

    .line 144
    .line 145
    iget v4, v4, Lxs;->h:F

    .line 146
    .line 147
    invoke-virtual {v12, v4}, Ll60;->a(F)Ljava/util/ArrayList;

    .line 148
    .line 149
    .line 150
    move-result-object v14

    .line 151
    goto :goto_2

    .line 152
    :cond_5
    move-object/from16 v16, v4

    .line 153
    .line 154
    const/16 v17, 0x0

    .line 155
    .line 156
    :cond_6
    :goto_2
    invoke-interface {v14}, Ljava/util/List;->size()I

    .line 157
    .line 158
    .line 159
    move-result v4

    .line 160
    if-nez v4, :cond_8

    .line 161
    .line 162
    :cond_7
    move-object/from16 v19, v5

    .line 163
    .line 164
    move/from16 v21, v6

    .line 165
    .line 166
    const/16 v18, 0x1

    .line 167
    .line 168
    goto :goto_4

    .line 169
    :cond_8
    invoke-virtual {v14}, Ljava/util/ArrayList;->size()I

    .line 170
    .line 171
    .line 172
    move-result v4

    .line 173
    move/from16 v8, v17

    .line 174
    .line 175
    :goto_3
    if-ge v8, v4, :cond_7

    .line 176
    .line 177
    invoke-virtual {v14, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v12

    .line 181
    add-int/lit8 v8, v8, 0x1

    .line 182
    .line 183
    check-cast v12, Lxs;

    .line 184
    .line 185
    const/16 v18, 0x1

    .line 186
    .line 187
    invoke-virtual {v5, v15}, Lk9;->f(I)Luk1;

    .line 188
    .line 189
    .line 190
    move-result-object v9

    .line 191
    iget v0, v12, Lxs;->h:F

    .line 192
    .line 193
    move/from16 v19, v0

    .line 194
    .line 195
    iget v0, v12, Lxs;->f:F

    .line 196
    .line 197
    move/from16 v20, v0

    .line 198
    .line 199
    iget-object v0, v9, Luk1;->k:Ljava/lang/Object;

    .line 200
    .line 201
    check-cast v0, [F

    .line 202
    .line 203
    aput v19, v0, v17

    .line 204
    .line 205
    aput v20, v0, v18

    .line 206
    .line 207
    invoke-virtual {v9, v0}, Luk1;->e([F)V

    .line 208
    .line 209
    .line 210
    aget v9, v0, v17

    .line 211
    .line 212
    move-object/from16 v19, v0

    .line 213
    .line 214
    float-to-double v0, v9

    .line 215
    aget v9, v19, v18

    .line 216
    .line 217
    move/from16 v20, v4

    .line 218
    .line 219
    move-object/from16 v19, v5

    .line 220
    .line 221
    float-to-double v4, v9

    .line 222
    sget-object v9, Lz90;->i:Lni0;

    .line 223
    .line 224
    invoke-virtual {v9}, Lni0;->b()Lmi0;

    .line 225
    .line 226
    .line 227
    move-result-object v9

    .line 228
    check-cast v9, Lz90;

    .line 229
    .line 230
    iput-wide v0, v9, Lz90;->g:D

    .line 231
    .line 232
    iput-wide v4, v9, Lz90;->h:D

    .line 233
    .line 234
    new-instance v9, Lv00;

    .line 235
    .line 236
    move/from16 v21, v6

    .line 237
    .line 238
    iget v6, v12, Lxs;->h:F

    .line 239
    .line 240
    iget v12, v12, Lxs;->f:F

    .line 241
    .line 242
    double-to-float v0, v0

    .line 243
    double-to-float v1, v4

    .line 244
    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    .line 245
    .line 246
    .line 247
    iput v6, v9, Lv00;->a:F

    .line 248
    .line 249
    iput v12, v9, Lv00;->b:F

    .line 250
    .line 251
    iput v0, v9, Lv00;->c:F

    .line 252
    .line 253
    iput v1, v9, Lv00;->d:F

    .line 254
    .line 255
    iput v11, v9, Lv00;->e:I

    .line 256
    .line 257
    iput v15, v9, Lv00;->f:I

    .line 258
    .line 259
    invoke-virtual {v13, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 260
    .line 261
    .line 262
    move-object/from16 v1, p0

    .line 263
    .line 264
    move/from16 v0, p1

    .line 265
    .line 266
    move-object/from16 v5, v19

    .line 267
    .line 268
    move/from16 v4, v20

    .line 269
    .line 270
    move/from16 v6, v21

    .line 271
    .line 272
    goto :goto_3

    .line 273
    :goto_4
    invoke-virtual {v3, v13}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 274
    .line 275
    .line 276
    :goto_5
    add-int/lit8 v11, v11, 0x1

    .line 277
    .line 278
    move-object/from16 v1, p0

    .line 279
    .line 280
    move/from16 v0, p1

    .line 281
    .line 282
    move-object/from16 v4, v16

    .line 283
    .line 284
    move-object/from16 v5, v19

    .line 285
    .line 286
    move/from16 v6, v21

    .line 287
    .line 288
    goto/16 :goto_1

    .line 289
    .line 290
    :goto_6
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 291
    .line 292
    .line 293
    move-result v0

    .line 294
    if-eqz v0, :cond_9

    .line 295
    .line 296
    return-object v16

    .line 297
    :cond_9
    move/from16 v0, v18

    .line 298
    .line 299
    invoke-static {v3, v2, v0}, Lme;->a(Ljava/util/ArrayList;FI)F

    .line 300
    .line 301
    .line 302
    move-result v1

    .line 303
    const/4 v4, 0x2

    .line 304
    invoke-static {v3, v2, v4}, Lme;->a(Ljava/util/ArrayList;FI)F

    .line 305
    .line 306
    .line 307
    move-result v5

    .line 308
    cmpg-float v1, v1, v5

    .line 309
    .line 310
    if-gez v1, :cond_a

    .line 311
    .line 312
    move v9, v0

    .line 313
    goto :goto_7

    .line 314
    :cond_a
    move v9, v4

    .line 315
    :goto_7
    invoke-interface/range {v19 .. v19}, Lne;->getMaxHighlightDistance()F

    .line 316
    .line 317
    .line 318
    move-result v0

    .line 319
    move-object/from16 v4, v16

    .line 320
    .line 321
    move/from16 v8, v17

    .line 322
    .line 323
    :goto_8
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 324
    .line 325
    .line 326
    move-result v1

    .line 327
    if-ge v8, v1, :cond_c

    .line 328
    .line 329
    invoke-virtual {v3, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 330
    .line 331
    .line 332
    move-result-object v1

    .line 333
    check-cast v1, Lv00;

    .line 334
    .line 335
    iget v5, v1, Lv00;->f:I

    .line 336
    .line 337
    if-ne v5, v9, :cond_b

    .line 338
    .line 339
    iget v5, v1, Lv00;->c:F

    .line 340
    .line 341
    iget v6, v1, Lv00;->d:F

    .line 342
    .line 343
    sub-float v5, p1, v5

    .line 344
    .line 345
    float-to-double v10, v5

    .line 346
    sub-float v5, v2, v6

    .line 347
    .line 348
    float-to-double v5, v5

    .line 349
    invoke-static {v10, v11, v5, v6}, Ljava/lang/Math;->hypot(DD)D

    .line 350
    .line 351
    .line 352
    move-result-wide v5

    .line 353
    double-to-float v5, v5

    .line 354
    cmpg-float v6, v5, v0

    .line 355
    .line 356
    if-gez v6, :cond_b

    .line 357
    .line 358
    move-object v4, v1

    .line 359
    move v0, v5

    .line 360
    :cond_b
    add-int/lit8 v8, v8, 0x1

    .line 361
    .line 362
    goto :goto_8

    .line 363
    :cond_c
    return-object v4
.end method

.method public final c(Lv00;)V
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    iput-object v0, p0, Lje;->D:[Lv00;

    .line 5
    .line 6
    goto :goto_1

    .line 7
    :cond_0
    iget v1, p1, Lv00;->e:I

    .line 8
    .line 9
    iget-boolean v2, p0, Lje;->f:Z

    .line 10
    .line 11
    if-eqz v2, :cond_1

    .line 12
    .line 13
    invoke-virtual {p1}, Lv00;->toString()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    :cond_1
    iget-object v2, p0, Lje;->g:Lle;

    .line 17
    .line 18
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    iget-object v2, v2, Lle;->i:Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    if-lt v1, v3, :cond_2

    .line 28
    .line 29
    move-object v1, v0

    .line 30
    goto :goto_0

    .line 31
    :cond_2
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    check-cast v1, Lq10;

    .line 36
    .line 37
    iget v2, p1, Lv00;->a:F

    .line 38
    .line 39
    iget v3, p1, Lv00;->b:F

    .line 40
    .line 41
    check-cast v1, Ll60;

    .line 42
    .line 43
    const/4 v4, 0x3

    .line 44
    invoke-virtual {v1, v2, v3, v4}, Ll60;->c(FFI)Lxs;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    :goto_0
    if-nez v1, :cond_3

    .line 49
    .line 50
    iput-object v0, p0, Lje;->D:[Lv00;

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_3
    filled-new-array {p1}, [Lv00;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    iput-object p1, p0, Lje;->D:[Lv00;

    .line 58
    .line 59
    :goto_1
    iget-object p1, p0, Lje;->D:[Lv00;

    .line 60
    .line 61
    invoke-virtual {p0, p1}, Lje;->setLastHighlighted([Lv00;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 65
    .line 66
    .line 67
    return-void
.end method

.method public abstract d()V
.end method

.method public getAnimator()Lke;
    .locals 1

    .line 1
    iget-object v0, p0, Lje;->x:Lke;

    .line 2
    .line 3
    return-object v0
.end method

.method public getCenter()Laa0;
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    int-to-float v0, v0

    .line 6
    const/high16 v1, 0x40000000    # 2.0f

    .line 7
    .line 8
    div-float/2addr v0, v1

    .line 9
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    int-to-float v2, v2

    .line 14
    div-float/2addr v2, v1

    .line 15
    invoke-static {v0, v2}, Laa0;->b(FF)Laa0;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    return-object v0
.end method

.method public getCenterOfView()Laa0;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lje;->getCenter()Laa0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public getCenterOffsets()Laa0;
    .locals 2

    .line 1
    iget-object v0, p0, Lje;->w:Lu61;

    .line 2
    .line 3
    iget-object v0, v0, Lu61;->b:Landroid/graphics/RectF;

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/graphics/RectF;->centerX()F

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-virtual {v0}, Landroid/graphics/RectF;->centerY()F

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    invoke-static {v1, v0}, Laa0;->b(FF)Laa0;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    return-object v0
.end method

.method public getChartBitmap()Landroid/graphics/Bitmap;
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    sget-object v2, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;

    .line 10
    .line 11
    invoke-static {v0, v1, v2}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    new-instance v1, Landroid/graphics/Canvas;

    .line 16
    .line 17
    invoke-direct {v1, v0}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    if-eqz v2, :cond_0

    .line 25
    .line 26
    invoke-virtual {v2, v1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const/4 v2, -0x1

    .line 31
    invoke-virtual {v1, v2}, Landroid/graphics/Canvas;->drawColor(I)V

    .line 32
    .line 33
    .line 34
    :goto_0
    invoke-virtual {p0, v1}, Landroid/view/View;->draw(Landroid/graphics/Canvas;)V

    .line 35
    .line 36
    .line 37
    return-object v0
.end method

.method public getContentRect()Landroid/graphics/RectF;
    .locals 1

    .line 1
    iget-object v0, p0, Lje;->w:Lu61;

    .line 2
    .line 3
    iget-object v0, v0, Lu61;->b:Landroid/graphics/RectF;

    .line 4
    .line 5
    return-object v0
.end method

.method public getData()Lle;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lle;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lje;->g:Lle;

    .line 2
    .line 3
    return-object v0
.end method

.method public getDefaultValueFormatter()Ln41;
    .locals 1

    .line 1
    iget-object v0, p0, Lje;->k:Lxn;

    .line 2
    .line 3
    return-object v0
.end method

.method public getDescription()Llo;
    .locals 1

    .line 1
    iget-object v0, p0, Lje;->p:Llo;

    .line 2
    .line 3
    return-object v0
.end method

.method public getDragDecelerationFrictionCoef()F
    .locals 1

    .line 1
    iget v0, p0, Lje;->j:F

    .line 2
    .line 3
    return v0
.end method

.method public getExtraBottomOffset()F
    .locals 1

    .line 1
    iget v0, p0, Lje;->A:F

    .line 2
    .line 3
    return v0
.end method

.method public getExtraLeftOffset()F
    .locals 1

    .line 1
    iget v0, p0, Lje;->B:F

    .line 2
    .line 3
    return v0
.end method

.method public getExtraRightOffset()F
    .locals 1

    .line 1
    iget v0, p0, Lje;->z:F

    .line 2
    .line 3
    return v0
.end method

.method public getExtraTopOffset()F
    .locals 1

    .line 1
    iget v0, p0, Lje;->y:F

    .line 2
    .line 3
    return v0
.end method

.method public getHighlighted()[Lv00;
    .locals 1

    .line 1
    iget-object v0, p0, Lje;->D:[Lv00;

    .line 2
    .line 3
    return-object v0
.end method

.method public getHighlighter()Lr10;
    .locals 1

    .line 1
    iget-object v0, p0, Lje;->v:Lme;

    .line 2
    .line 3
    return-object v0
.end method

.method public getJobs()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Ljava/lang/Runnable;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lje;->F:Ljava/util/ArrayList;

    .line 2
    .line 3
    return-object v0
.end method

.method public getLegend()Lk50;
    .locals 1

    .line 1
    iget-object v0, p0, Lje;->q:Lk50;

    .line 2
    .line 3
    return-object v0
.end method

.method public getLegendRenderer()Lm50;
    .locals 1

    .line 1
    iget-object v0, p0, Lje;->t:Lm50;

    .line 2
    .line 3
    return-object v0
.end method

.method public getMarker()Ls10;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method public getMarkerView()Ls10;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    invoke-virtual {p0}, Lje;->getMarker()Ls10;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    return-object v0
.end method

.method public getMaxHighlightDistance()F
    .locals 1

    .line 1
    iget v0, p0, Lje;->E:F

    .line 2
    .line 3
    return v0
.end method

.method public abstract synthetic getMaxVisibleCount()I
.end method

.method public getOnChartGestureListener()Lbj0;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method public getOnTouchListener()Loe;
    .locals 1

    .line 1
    iget-object v0, p0, Lje;->r:Loe;

    .line 2
    .line 3
    return-object v0
.end method

.method public getRenderer()Lom;
    .locals 1

    .line 1
    iget-object v0, p0, Lje;->u:Lom;

    .line 2
    .line 3
    return-object v0
.end method

.method public getViewPortHandler()Lu61;
    .locals 1

    .line 1
    iget-object v0, p0, Lje;->w:Lu61;

    .line 2
    .line 3
    return-object v0
.end method

.method public getXAxis()Lcb1;
    .locals 1

    .line 1
    iget-object v0, p0, Lje;->n:Lcb1;

    .line 2
    .line 3
    return-object v0
.end method

.method public getXChartMax()F
    .locals 1

    .line 1
    iget-object v0, p0, Lje;->n:Lcb1;

    .line 2
    .line 3
    iget v0, v0, Ld9;->v:F

    .line 4
    .line 5
    return v0
.end method

.method public getXChartMin()F
    .locals 1

    .line 1
    iget-object v0, p0, Lje;->n:Lcb1;

    .line 2
    .line 3
    iget v0, v0, Ld9;->w:F

    .line 4
    .line 5
    return v0
.end method

.method public getXRange()F
    .locals 1

    .line 1
    iget-object v0, p0, Lje;->n:Lcb1;

    .line 2
    .line 3
    iget v0, v0, Ld9;->x:F

    .line 4
    .line 5
    return v0
.end method

.method public abstract synthetic getYChartMax()F
.end method

.method public abstract synthetic getYChartMin()F
.end method

.method public getYMax()F
    .locals 1

    .line 1
    iget-object v0, p0, Lje;->g:Lle;

    .line 2
    .line 3
    iget v0, v0, Lle;->a:F

    .line 4
    .line 5
    return v0
.end method

.method public getYMin()F
    .locals 1

    .line 1
    iget-object v0, p0, Lje;->g:Lle;

    .line 2
    .line 3
    iget v0, v0, Lle;->b:F

    .line 4
    .line 5
    return v0
.end method

.method public onDetachedFromWindow()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/view/ViewGroup;->onDetachedFromWindow()V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, Lje;->G:Z

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-static {p0}, Lje;->e(Landroid/view/View;)V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lje;->g:Lle;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lje;->s:Ljava/lang/String;

    .line 6
    .line 7
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    invoke-virtual {p0}, Lje;->getCenter()Laa0;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iget-object v1, p0, Lje;->s:Ljava/lang/String;

    .line 18
    .line 19
    iget v2, v0, Laa0;->g:F

    .line 20
    .line 21
    iget v0, v0, Laa0;->h:F

    .line 22
    .line 23
    iget-object v3, p0, Lje;->m:Landroid/graphics/Paint;

    .line 24
    .line 25
    invoke-virtual {p1, v1, v2, v0, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_0
    iget-boolean p1, p0, Lje;->C:Z

    .line 30
    .line 31
    if-nez p1, :cond_1

    .line 32
    .line 33
    invoke-virtual {p0}, Lje;->a()V

    .line 34
    .line 35
    .line 36
    const/4 p1, 0x1

    .line 37
    iput-boolean p1, p0, Lje;->C:Z

    .line 38
    .line 39
    :cond_1
    return-void
.end method

.method public final onLayout(ZIIII)V
    .locals 1

    .line 1
    const/4 p1, 0x0

    .line 2
    :goto_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    if-ge p1, v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0, p2, p3, p4, p5}, Landroid/view/View;->layout(IIII)V

    .line 13
    .line 14
    .line 15
    add-int/lit8 p1, p1, 0x1

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    return-void
.end method

.method public final onMeasure(II)V
    .locals 2

    .line 1
    invoke-super {p0, p1, p2}, Landroid/view/View;->onMeasure(II)V

    .line 2
    .line 3
    .line 4
    const/high16 v0, 0x42480000    # 50.0f

    .line 5
    .line 6
    invoke-static {v0}, Lk41;->c(F)F

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    float-to-int v0, v0

    .line 11
    invoke-virtual {p0}, Landroid/view/View;->getSuggestedMinimumWidth()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    invoke-static {v0, p1}, Landroid/view/View;->resolveSize(II)I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    invoke-static {v1, p1}, Ljava/lang/Math;->max(II)I

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    invoke-virtual {p0}, Landroid/view/View;->getSuggestedMinimumHeight()I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    invoke-static {v0, p2}, Landroid/view/View;->resolveSize(II)I

    .line 28
    .line 29
    .line 30
    move-result p2

    .line 31
    invoke-static {v1, p2}, Ljava/lang/Math;->max(II)I

    .line 32
    .line 33
    .line 34
    move-result p2

    .line 35
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public onSizeChanged(IIII)V
    .locals 10

    .line 1
    iget-object v0, p0, Lje;->F:Ljava/util/ArrayList;

    .line 2
    .line 3
    if-lez p1, :cond_0

    .line 4
    .line 5
    if-lez p2, :cond_0

    .line 6
    .line 7
    const/16 v1, 0x2710

    .line 8
    .line 9
    if-ge p1, v1, :cond_0

    .line 10
    .line 11
    if-ge p2, v1, :cond_0

    .line 12
    .line 13
    iget-object v1, p0, Lje;->w:Lu61;

    .line 14
    .line 15
    int-to-float v2, p1

    .line 16
    int-to-float v3, p2

    .line 17
    iget-object v4, v1, Lu61;->b:Landroid/graphics/RectF;

    .line 18
    .line 19
    iget v5, v4, Landroid/graphics/RectF;->left:F

    .line 20
    .line 21
    iget v6, v4, Landroid/graphics/RectF;->top:F

    .line 22
    .line 23
    iget v7, v1, Lu61;->c:F

    .line 24
    .line 25
    iget v8, v4, Landroid/graphics/RectF;->right:F

    .line 26
    .line 27
    sub-float/2addr v7, v8

    .line 28
    iget v8, v1, Lu61;->d:F

    .line 29
    .line 30
    iget v9, v4, Landroid/graphics/RectF;->bottom:F

    .line 31
    .line 32
    sub-float/2addr v8, v9

    .line 33
    iput v3, v1, Lu61;->d:F

    .line 34
    .line 35
    iput v2, v1, Lu61;->c:F

    .line 36
    .line 37
    sub-float/2addr v2, v7

    .line 38
    sub-float/2addr v3, v8

    .line 39
    invoke-virtual {v4, v5, v6, v2, v3}, Landroid/graphics/RectF;->set(FFFF)V

    .line 40
    .line 41
    .line 42
    :cond_0
    invoke-virtual {p0}, Lje;->d()V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    const/4 v2, 0x0

    .line 50
    :goto_0
    if-ge v2, v1, :cond_1

    .line 51
    .line 52
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    add-int/lit8 v2, v2, 0x1

    .line 57
    .line 58
    check-cast v3, Ljava/lang/Runnable;

    .line 59
    .line 60
    invoke-virtual {p0, v3}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 65
    .line 66
    .line 67
    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onSizeChanged(IIII)V

    .line 68
    .line 69
    .line 70
    return-void
.end method

.method public setData(Lle;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lle;",
            ")V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lje;->k:Lxn;

    .line 2
    .line 3
    iput-object p1, p0, Lje;->g:Lle;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    iput-boolean v1, p0, Lje;->C:Z

    .line 7
    .line 8
    if-nez p1, :cond_0

    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    iget v2, p1, Lle;->b:F

    .line 12
    .line 13
    iget v3, p1, Lle;->a:F

    .line 14
    .line 15
    invoke-virtual {p1}, Lle;->e()I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    const/4 v4, 0x2

    .line 20
    if-ge p1, v4, :cond_1

    .line 21
    .line 22
    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    invoke-static {p1, v2}, Ljava/lang/Math;->max(FF)F

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    goto :goto_0

    .line 35
    :cond_1
    sub-float/2addr v3, v2

    .line 36
    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    :goto_0
    float-to-double v2, p1

    .line 41
    invoke-static {v2, v3}, Lk41;->d(D)F

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    invoke-static {p1}, Ljava/lang/Float;->isInfinite(F)Z

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    if-eqz v2, :cond_2

    .line 50
    .line 51
    move p1, v1

    .line 52
    goto :goto_1

    .line 53
    :cond_2
    float-to-double v2, p1

    .line 54
    invoke-static {v2, v3}, Ljava/lang/Math;->log10(D)D

    .line 55
    .line 56
    .line 57
    move-result-wide v2

    .line 58
    neg-double v2, v2

    .line 59
    invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D

    .line 60
    .line 61
    .line 62
    move-result-wide v2

    .line 63
    double-to-int p1, v2

    .line 64
    add-int/2addr p1, v4

    .line 65
    :goto_1
    invoke-virtual {v0, p1}, Lxn;->b(I)V

    .line 66
    .line 67
    .line 68
    iget-object p1, p0, Lje;->g:Lle;

    .line 69
    .line 70
    iget-object p1, p1, Lle;->i:Ljava/util/ArrayList;

    .line 71
    .line 72
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 73
    .line 74
    .line 75
    move-result v2

    .line 76
    :cond_3
    :goto_2
    if-ge v1, v2, :cond_6

    .line 77
    .line 78
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v3

    .line 82
    add-int/lit8 v1, v1, 0x1

    .line 83
    .line 84
    check-cast v3, Lq10;

    .line 85
    .line 86
    check-cast v3, Ll60;

    .line 87
    .line 88
    iget-object v4, v3, Ll60;->f:Ln41;

    .line 89
    .line 90
    if-nez v4, :cond_4

    .line 91
    .line 92
    goto :goto_3

    .line 93
    :cond_4
    if-nez v4, :cond_5

    .line 94
    .line 95
    sget-object v4, Lk41;->g:Lxn;

    .line 96
    .line 97
    :cond_5
    if-ne v4, v0, :cond_3

    .line 98
    .line 99
    :goto_3
    iput-object v0, v3, Ll60;->f:Ln41;

    .line 100
    .line 101
    goto :goto_2

    .line 102
    :cond_6
    invoke-virtual {p0}, Lje;->d()V

    .line 103
    .line 104
    .line 105
    return-void
.end method

.method public setDescription(Llo;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lje;->p:Llo;

    .line 2
    .line 3
    return-void
.end method

.method public setDragDecelerationEnabled(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lje;->i:Z

    .line 2
    .line 3
    return-void
.end method

.method public setDragDecelerationFrictionCoef(F)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    cmpg-float v1, p1, v0

    .line 3
    .line 4
    if-gez v1, :cond_0

    .line 5
    .line 6
    move p1, v0

    .line 7
    :cond_0
    const/high16 v0, 0x3f800000    # 1.0f

    .line 8
    .line 9
    cmpl-float v0, p1, v0

    .line 10
    .line 11
    if-ltz v0, :cond_1

    .line 12
    .line 13
    const p1, 0x3f7fbe77    # 0.999f

    .line 14
    .line 15
    .line 16
    :cond_1
    iput p1, p0, Lje;->j:F

    .line 17
    .line 18
    return-void
.end method

.method public setDrawMarkerViews(Z)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    invoke-virtual {p0, p1}, Lje;->setDrawMarkers(Z)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public setDrawMarkers(Z)V
    .locals 0

    .line 1
    return-void
.end method

.method public setExtraBottomOffset(F)V
    .locals 0

    .line 1
    invoke-static {p1}, Lk41;->c(F)F

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    iput p1, p0, Lje;->A:F

    .line 6
    .line 7
    return-void
.end method

.method public setExtraLeftOffset(F)V
    .locals 0

    .line 1
    invoke-static {p1}, Lk41;->c(F)F

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    iput p1, p0, Lje;->B:F

    .line 6
    .line 7
    return-void
.end method

.method public setExtraRightOffset(F)V
    .locals 0

    .line 1
    invoke-static {p1}, Lk41;->c(F)F

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    iput p1, p0, Lje;->z:F

    .line 6
    .line 7
    return-void
.end method

.method public setExtraTopOffset(F)V
    .locals 0

    .line 1
    invoke-static {p1}, Lk41;->c(F)F

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    iput p1, p0, Lje;->y:F

    .line 6
    .line 7
    return-void
.end method

.method public setHardwareAccelerationEnabled(Z)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    const/4 p1, 0x2

    .line 5
    invoke-virtual {p0, p1, v0}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    const/4 p1, 0x1

    .line 10
    invoke-virtual {p0, p1, v0}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public setHighlightPerTapEnabled(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lje;->h:Z

    .line 2
    .line 3
    return-void
.end method

.method public setHighlighter(Lme;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lje;->v:Lme;

    .line 2
    .line 3
    return-void
.end method

.method public setLastHighlighted([Lv00;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    array-length v0, p1

    .line 4
    if-lez v0, :cond_1

    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    aget-object p1, p1, v0

    .line 8
    .line 9
    if-nez p1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget-object v0, p0, Lje;->r:Loe;

    .line 13
    .line 14
    iput-object p1, v0, Loe;->g:Lv00;

    .line 15
    .line 16
    return-void

    .line 17
    :cond_1
    :goto_0
    iget-object p1, p0, Lje;->r:Loe;

    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    iput-object v0, p1, Loe;->g:Lv00;

    .line 21
    .line 22
    return-void
.end method

.method public setLogEnabled(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lje;->f:Z

    .line 2
    .line 3
    return-void
.end method

.method public setMarker(Ls10;)V
    .locals 0

    .line 1
    return-void
.end method

.method public setMarkerView(Ls10;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    invoke-virtual {p0, p1}, Lje;->setMarker(Ls10;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public setMaxHighlightDistance(F)V
    .locals 0

    .line 1
    invoke-static {p1}, Lk41;->c(F)F

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    iput p1, p0, Lje;->E:F

    .line 6
    .line 7
    return-void
.end method

.method public setNoDataText(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lje;->s:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public setNoDataTextColor(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lje;->m:Landroid/graphics/Paint;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setNoDataTextTypeface(Landroid/graphics/Typeface;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lje;->m:Landroid/graphics/Paint;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setOnChartGestureListener(Lbj0;)V
    .locals 0

    .line 1
    return-void
.end method

.method public setOnChartValueSelectedListener(Lcj0;)V
    .locals 0

    .line 1
    return-void
.end method

.method public setOnTouchListener(Loe;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lje;->r:Loe;

    .line 2
    .line 3
    return-void
.end method

.method public setRenderer(Lom;)V
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iput-object p1, p0, Lje;->u:Lom;

    .line 4
    .line 5
    :cond_0
    return-void
.end method

.method public setTouchEnabled(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lje;->o:Z

    .line 2
    .line 3
    return-void
.end method

.method public setUnbindEnabled(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lje;->G:Z

    .line 2
    .line 3
    return-void
.end method
