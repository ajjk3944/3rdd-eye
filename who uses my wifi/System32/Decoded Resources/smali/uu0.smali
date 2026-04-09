.class public final Luu0;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lqq2;


# instance fields
.field public f:Z

.field public final g:Ljava/lang/Object;

.field public final h:Ljava/lang/Object;

.field public final i:Ljava/lang/Object;

.field public final j:Ljava/lang/Object;

.field public final k:Ljava/lang/Object;

.field public final l:Ljava/lang/Object;

.field public final m:Ljava/lang/Object;

.field public final n:Ljava/lang/Object;

.field public final o:Ljava/lang/Object;

.field public p:Ljava/lang/Object;

.field public q:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 4

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x4

    .line 9
    new-array v1, v0, [Lk90;

    iput-object v1, p0, Luu0;->g:Ljava/lang/Object;

    .line 10
    new-array v1, v0, [Landroid/graphics/Matrix;

    iput-object v1, p0, Luu0;->h:Ljava/lang/Object;

    .line 11
    new-array v1, v0, [Landroid/graphics/Matrix;

    iput-object v1, p0, Luu0;->i:Ljava/lang/Object;

    .line 12
    new-instance v1, Landroid/graphics/PointF;

    invoke-direct {v1}, Landroid/graphics/PointF;-><init>()V

    iput-object v1, p0, Luu0;->j:Ljava/lang/Object;

    .line 13
    new-instance v1, Landroid/graphics/Path;

    invoke-direct {v1}, Landroid/graphics/Path;-><init>()V

    iput-object v1, p0, Luu0;->k:Ljava/lang/Object;

    .line 14
    new-instance v1, Landroid/graphics/Path;

    invoke-direct {v1}, Landroid/graphics/Path;-><init>()V

    iput-object v1, p0, Luu0;->l:Ljava/lang/Object;

    .line 15
    new-instance v1, Lk90;

    invoke-direct {v1}, Lk90;-><init>()V

    iput-object v1, p0, Luu0;->o:Ljava/lang/Object;

    const/4 v1, 0x2

    .line 16
    new-array v2, v1, [F

    iput-object v2, p0, Luu0;->p:Ljava/lang/Object;

    .line 17
    new-array v1, v1, [F

    iput-object v1, p0, Luu0;->q:Ljava/lang/Object;

    .line 18
    new-instance v1, Landroid/graphics/Path;

    invoke-direct {v1}, Landroid/graphics/Path;-><init>()V

    iput-object v1, p0, Luu0;->m:Ljava/lang/Object;

    .line 19
    new-instance v1, Landroid/graphics/Path;

    invoke-direct {v1}, Landroid/graphics/Path;-><init>()V

    iput-object v1, p0, Luu0;->n:Ljava/lang/Object;

    const/4 v1, 0x1

    .line 20
    iput-boolean v1, p0, Luu0;->f:Z

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    .line 21
    iget-object v2, p0, Luu0;->g:Ljava/lang/Object;

    check-cast v2, [Lk90;

    new-instance v3, Lk90;

    invoke-direct {v3}, Lk90;-><init>()V

    aput-object v3, v2, v1

    .line 22
    iget-object v2, p0, Luu0;->h:Ljava/lang/Object;

    check-cast v2, [Landroid/graphics/Matrix;

    new-instance v3, Landroid/graphics/Matrix;

    invoke-direct {v3}, Landroid/graphics/Matrix;-><init>()V

    aput-object v3, v2, v1

    .line 23
    iget-object v2, p0, Luu0;->i:Ljava/lang/Object;

    check-cast v2, [Landroid/graphics/Matrix;

    new-instance v3, Landroid/graphics/Matrix;

    invoke-direct {v3}, Landroid/graphics/Matrix;-><init>()V

    aput-object v3, v2, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lpu2;Ll83;Le51;La83;Lpd2;Lag2;Le42;ZLpz2;Ljv2;Lmv2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Luu0;->g:Ljava/lang/Object;

    iput-object p2, p0, Luu0;->h:Ljava/lang/Object;

    iput-object p3, p0, Luu0;->i:Ljava/lang/Object;

    iput-object p4, p0, Luu0;->j:Ljava/lang/Object;

    iput-object p5, p0, Luu0;->k:Ljava/lang/Object;

    iput-object p6, p0, Luu0;->l:Ljava/lang/Object;

    iput-object p7, p0, Luu0;->m:Ljava/lang/Object;

    iput-object p8, p0, Luu0;->n:Ljava/lang/Object;

    iput-boolean p9, p0, Luu0;->f:Z

    iput-object p10, p0, Luu0;->o:Ljava/lang/Object;

    iput-object p11, p0, Luu0;->p:Ljava/lang/Object;

    iput-object p12, p0, Luu0;->q:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljb4;Lmd4;Ld13;Lxd4;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p4, p0, Luu0;->g:Ljava/lang/Object;

    iput-object p1, p0, Luu0;->k:Ljava/lang/Object;

    new-instance p1, Lni4;

    invoke-direct {p1}, Lni4;-><init>()V

    iput-object p1, p0, Luu0;->q:Ljava/lang/Object;

    new-instance p1, Ljava/util/IdentityHashMap;

    .line 3
    invoke-direct {p1}, Ljava/util/IdentityHashMap;-><init>()V

    iput-object p1, p0, Luu0;->i:Ljava/lang/Object;

    new-instance p1, Ljava/util/HashMap;

    .line 4
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Luu0;->j:Ljava/lang/Object;

    new-instance p1, Ljava/util/ArrayList;

    .line 5
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Luu0;->h:Ljava/lang/Object;

    iput-object p2, p0, Luu0;->n:Ljava/lang/Object;

    iput-object p3, p0, Luu0;->o:Ljava/lang/Object;

    new-instance p1, Ljava/util/HashMap;

    .line 6
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Luu0;->l:Ljava/lang/Object;

    new-instance p1, Ljava/util/HashSet;

    .line 7
    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    iput-object p1, p0, Luu0;->m:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a(Lsu0;[FFLandroid/graphics/RectF;Lf20;Landroid/graphics/Path;)V
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p3

    .line 6
    .line 7
    move-object/from16 v3, p4

    .line 8
    .line 9
    move-object/from16 v4, p5

    .line 10
    .line 11
    move-object/from16 v5, p6

    .line 12
    .line 13
    iget-object v6, v0, Luu0;->i:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v6, [Landroid/graphics/Matrix;

    .line 16
    .line 17
    iget-object v7, v0, Luu0;->p:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v7, [F

    .line 20
    .line 21
    iget-object v8, v0, Luu0;->g:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v8, [Lk90;

    .line 24
    .line 25
    iget-object v9, v0, Luu0;->h:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v9, [Landroid/graphics/Matrix;

    .line 28
    .line 29
    invoke-virtual {v5}, Landroid/graphics/Path;->rewind()V

    .line 30
    .line 31
    .line 32
    iget-object v10, v0, Luu0;->k:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v10, Landroid/graphics/Path;

    .line 35
    .line 36
    invoke-virtual {v10}, Landroid/graphics/Path;->rewind()V

    .line 37
    .line 38
    .line 39
    iget-object v11, v0, Luu0;->l:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v11, Landroid/graphics/Path;

    .line 42
    .line 43
    invoke-virtual {v11}, Landroid/graphics/Path;->rewind()V

    .line 44
    .line 45
    .line 46
    sget-object v12, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    .line 47
    .line 48
    invoke-virtual {v11, v3, v12}, Landroid/graphics/Path;->addRect(Landroid/graphics/RectF;Landroid/graphics/Path$Direction;)V

    .line 49
    .line 50
    .line 51
    const/4 v13, 0x0

    .line 52
    :goto_0
    const/4 v14, 0x2

    .line 53
    const/16 v16, 0x0

    .line 54
    .line 55
    const/4 v12, 0x4

    .line 56
    const/4 v15, 0x1

    .line 57
    if-ge v13, v12, :cond_a

    .line 58
    .line 59
    iget-object v12, v0, Luu0;->j:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v12, Landroid/graphics/PointF;

    .line 62
    .line 63
    if-nez p2, :cond_3

    .line 64
    .line 65
    if-eq v13, v15, :cond_2

    .line 66
    .line 67
    if-eq v13, v14, :cond_1

    .line 68
    .line 69
    const/4 v14, 0x3

    .line 70
    if-eq v13, v14, :cond_0

    .line 71
    .line 72
    iget-object v14, v1, Lsu0;->f:Lck;

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_0
    iget-object v14, v1, Lsu0;->e:Lck;

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_1
    iget-object v14, v1, Lsu0;->h:Lck;

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_2
    iget-object v14, v1, Lsu0;->g:Lck;

    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_3
    new-instance v14, Lff;

    .line 85
    .line 86
    aget v15, p2, v13

    .line 87
    .line 88
    invoke-direct {v14, v15}, Lff;-><init>(F)V

    .line 89
    .line 90
    .line 91
    const/4 v15, 0x1

    .line 92
    :goto_1
    if-eq v13, v15, :cond_6

    .line 93
    .line 94
    const/4 v15, 0x2

    .line 95
    if-eq v13, v15, :cond_5

    .line 96
    .line 97
    const/4 v15, 0x3

    .line 98
    if-eq v13, v15, :cond_4

    .line 99
    .line 100
    iget-object v15, v1, Lsu0;->b:Lou1;

    .line 101
    .line 102
    :goto_2
    move-object/from16 v19, v6

    .line 103
    .line 104
    goto :goto_3

    .line 105
    :cond_4
    iget-object v15, v1, Lsu0;->a:Lou1;

    .line 106
    .line 107
    goto :goto_2

    .line 108
    :cond_5
    iget-object v15, v1, Lsu0;->d:Lou1;

    .line 109
    .line 110
    goto :goto_2

    .line 111
    :cond_6
    iget-object v15, v1, Lsu0;->c:Lou1;

    .line 112
    .line 113
    goto :goto_2

    .line 114
    :goto_3
    aget-object v6, v8, v13

    .line 115
    .line 116
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 117
    .line 118
    .line 119
    invoke-interface {v14, v3}, Lck;->a(Landroid/graphics/RectF;)F

    .line 120
    .line 121
    .line 122
    move-result v14

    .line 123
    invoke-virtual {v15, v6, v2, v14}, Lou1;->n(Lk90;FF)V

    .line 124
    .line 125
    .line 126
    add-int/lit8 v6, v13, 0x1

    .line 127
    .line 128
    rem-int/lit8 v14, v6, 0x4

    .line 129
    .line 130
    mul-int/lit8 v14, v14, 0x5a

    .line 131
    .line 132
    int-to-float v14, v14

    .line 133
    aget-object v15, v9, v13

    .line 134
    .line 135
    invoke-virtual {v15}, Landroid/graphics/Matrix;->reset()V

    .line 136
    .line 137
    .line 138
    const/4 v15, 0x1

    .line 139
    if-eq v13, v15, :cond_9

    .line 140
    .line 141
    const/4 v15, 0x2

    .line 142
    if-eq v13, v15, :cond_8

    .line 143
    .line 144
    const/4 v15, 0x3

    .line 145
    if-eq v13, v15, :cond_7

    .line 146
    .line 147
    iget v15, v3, Landroid/graphics/RectF;->right:F

    .line 148
    .line 149
    move/from16 v17, v6

    .line 150
    .line 151
    iget v6, v3, Landroid/graphics/RectF;->top:F

    .line 152
    .line 153
    invoke-virtual {v12, v15, v6}, Landroid/graphics/PointF;->set(FF)V

    .line 154
    .line 155
    .line 156
    goto :goto_4

    .line 157
    :cond_7
    move/from16 v17, v6

    .line 158
    .line 159
    iget v6, v3, Landroid/graphics/RectF;->left:F

    .line 160
    .line 161
    iget v15, v3, Landroid/graphics/RectF;->top:F

    .line 162
    .line 163
    invoke-virtual {v12, v6, v15}, Landroid/graphics/PointF;->set(FF)V

    .line 164
    .line 165
    .line 166
    goto :goto_4

    .line 167
    :cond_8
    move/from16 v17, v6

    .line 168
    .line 169
    iget v6, v3, Landroid/graphics/RectF;->left:F

    .line 170
    .line 171
    iget v15, v3, Landroid/graphics/RectF;->bottom:F

    .line 172
    .line 173
    invoke-virtual {v12, v6, v15}, Landroid/graphics/PointF;->set(FF)V

    .line 174
    .line 175
    .line 176
    goto :goto_4

    .line 177
    :cond_9
    move/from16 v17, v6

    .line 178
    .line 179
    iget v6, v3, Landroid/graphics/RectF;->right:F

    .line 180
    .line 181
    iget v15, v3, Landroid/graphics/RectF;->bottom:F

    .line 182
    .line 183
    invoke-virtual {v12, v6, v15}, Landroid/graphics/PointF;->set(FF)V

    .line 184
    .line 185
    .line 186
    :goto_4
    aget-object v6, v9, v13

    .line 187
    .line 188
    iget v15, v12, Landroid/graphics/PointF;->x:F

    .line 189
    .line 190
    iget v12, v12, Landroid/graphics/PointF;->y:F

    .line 191
    .line 192
    invoke-virtual {v6, v15, v12}, Landroid/graphics/Matrix;->setTranslate(FF)V

    .line 193
    .line 194
    .line 195
    aget-object v6, v9, v13

    .line 196
    .line 197
    invoke-virtual {v6, v14}, Landroid/graphics/Matrix;->preRotate(F)Z

    .line 198
    .line 199
    .line 200
    aget-object v6, v8, v13

    .line 201
    .line 202
    iget v12, v6, Lk90;->b:F

    .line 203
    .line 204
    aput v12, v7, v16

    .line 205
    .line 206
    iget v6, v6, Lk90;->c:F

    .line 207
    .line 208
    const/16 v18, 0x1

    .line 209
    .line 210
    aput v6, v7, v18

    .line 211
    .line 212
    aget-object v6, v9, v13

    .line 213
    .line 214
    invoke-virtual {v6, v7}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 215
    .line 216
    .line 217
    aget-object v6, v19, v13

    .line 218
    .line 219
    invoke-virtual {v6}, Landroid/graphics/Matrix;->reset()V

    .line 220
    .line 221
    .line 222
    aget-object v6, v19, v13

    .line 223
    .line 224
    aget v12, v7, v16

    .line 225
    .line 226
    aget v15, v7, v18

    .line 227
    .line 228
    invoke-virtual {v6, v12, v15}, Landroid/graphics/Matrix;->setTranslate(FF)V

    .line 229
    .line 230
    .line 231
    aget-object v6, v19, v13

    .line 232
    .line 233
    invoke-virtual {v6, v14}, Landroid/graphics/Matrix;->preRotate(F)Z

    .line 234
    .line 235
    .line 236
    move/from16 v13, v17

    .line 237
    .line 238
    move-object/from16 v6, v19

    .line 239
    .line 240
    goto/16 :goto_0

    .line 241
    .line 242
    :cond_a
    move-object/from16 v19, v6

    .line 243
    .line 244
    move/from16 v6, v16

    .line 245
    .line 246
    :goto_5
    if-ge v6, v12, :cond_14

    .line 247
    .line 248
    aget-object v13, v8, v6

    .line 249
    .line 250
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 251
    .line 252
    .line 253
    const/4 v14, 0x0

    .line 254
    aput v14, v7, v16

    .line 255
    .line 256
    iget v13, v13, Lk90;->a:F

    .line 257
    .line 258
    const/16 v18, 0x1

    .line 259
    .line 260
    aput v13, v7, v18

    .line 261
    .line 262
    aget-object v13, v9, v6

    .line 263
    .line 264
    invoke-virtual {v13, v7}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 265
    .line 266
    .line 267
    if-nez v6, :cond_b

    .line 268
    .line 269
    aget v13, v7, v16

    .line 270
    .line 271
    aget v15, v7, v18

    .line 272
    .line 273
    invoke-virtual {v5, v13, v15}, Landroid/graphics/Path;->moveTo(FF)V

    .line 274
    .line 275
    .line 276
    goto :goto_6

    .line 277
    :cond_b
    aget v13, v7, v16

    .line 278
    .line 279
    aget v15, v7, v18

    .line 280
    .line 281
    invoke-virtual {v5, v13, v15}, Landroid/graphics/Path;->lineTo(FF)V

    .line 282
    .line 283
    .line 284
    :goto_6
    aget-object v13, v8, v6

    .line 285
    .line 286
    aget-object v15, v9, v6

    .line 287
    .line 288
    invoke-virtual {v13, v15, v5}, Lk90;->c(Landroid/graphics/Matrix;Landroid/graphics/Path;)V

    .line 289
    .line 290
    .line 291
    if-eqz v4, :cond_c

    .line 292
    .line 293
    aget-object v13, v8, v6

    .line 294
    .line 295
    aget-object v15, v9, v6

    .line 296
    .line 297
    iget-object v12, v4, Lf20;->g:Ljava/lang/Object;

    .line 298
    .line 299
    check-cast v12, Lnc0;

    .line 300
    .line 301
    move/from16 p2, v14

    .line 302
    .line 303
    iget-object v14, v12, Lnc0;->j:Ljava/util/BitSet;

    .line 304
    .line 305
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 306
    .line 307
    .line 308
    move/from16 v3, v16

    .line 309
    .line 310
    invoke-virtual {v14, v6, v3}, Ljava/util/BitSet;->set(IZ)V

    .line 311
    .line 312
    .line 313
    iget-object v3, v12, Lnc0;->h:[Lkv0;

    .line 314
    .line 315
    iget v12, v13, Lk90;->e:F

    .line 316
    .line 317
    invoke-virtual {v13, v12}, Lk90;->b(F)V

    .line 318
    .line 319
    .line 320
    new-instance v12, Landroid/graphics/Matrix;

    .line 321
    .line 322
    invoke-direct {v12, v15}, Landroid/graphics/Matrix;-><init>(Landroid/graphics/Matrix;)V

    .line 323
    .line 324
    .line 325
    new-instance v14, Ljava/util/ArrayList;

    .line 326
    .line 327
    iget-object v13, v13, Lk90;->g:Ljava/lang/Object;

    .line 328
    .line 329
    check-cast v13, Ljava/util/ArrayList;

    .line 330
    .line 331
    invoke-direct {v14, v13}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 332
    .line 333
    .line 334
    new-instance v13, Lev0;

    .line 335
    .line 336
    invoke-direct {v13, v14, v12}, Lev0;-><init>(Ljava/util/ArrayList;Landroid/graphics/Matrix;)V

    .line 337
    .line 338
    .line 339
    aput-object v13, v3, v6

    .line 340
    .line 341
    goto :goto_7

    .line 342
    :cond_c
    move/from16 p2, v14

    .line 343
    .line 344
    :goto_7
    iget-object v3, v0, Luu0;->m:Ljava/lang/Object;

    .line 345
    .line 346
    check-cast v3, Landroid/graphics/Path;

    .line 347
    .line 348
    iget-object v12, v0, Luu0;->o:Ljava/lang/Object;

    .line 349
    .line 350
    check-cast v12, Lk90;

    .line 351
    .line 352
    add-int/lit8 v13, v6, 0x1

    .line 353
    .line 354
    rem-int/lit8 v14, v13, 0x4

    .line 355
    .line 356
    aget-object v15, v8, v6

    .line 357
    .line 358
    move-object/from16 v20, v8

    .line 359
    .line 360
    iget v8, v15, Lk90;->b:F

    .line 361
    .line 362
    const/16 v16, 0x0

    .line 363
    .line 364
    aput v8, v7, v16

    .line 365
    .line 366
    iget v8, v15, Lk90;->c:F

    .line 367
    .line 368
    const/16 v18, 0x1

    .line 369
    .line 370
    aput v8, v7, v18

    .line 371
    .line 372
    aget-object v8, v9, v6

    .line 373
    .line 374
    invoke-virtual {v8, v7}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 375
    .line 376
    .line 377
    iget-object v8, v0, Luu0;->q:Ljava/lang/Object;

    .line 378
    .line 379
    check-cast v8, [F

    .line 380
    .line 381
    aget-object v15, v20, v14

    .line 382
    .line 383
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 384
    .line 385
    .line 386
    aput p2, v8, v16

    .line 387
    .line 388
    iget v15, v15, Lk90;->a:F

    .line 389
    .line 390
    aput v15, v8, v18

    .line 391
    .line 392
    aget-object v15, v9, v14

    .line 393
    .line 394
    invoke-virtual {v15, v8}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 395
    .line 396
    .line 397
    aget v15, v7, v16

    .line 398
    .line 399
    aget v21, v8, v16

    .line 400
    .line 401
    sub-float v15, v15, v21

    .line 402
    .line 403
    move-object/from16 v22, v8

    .line 404
    .line 405
    move-object/from16 v21, v9

    .line 406
    .line 407
    float-to-double v8, v15

    .line 408
    aget v15, v7, v18

    .line 409
    .line 410
    aget v22, v22, v18

    .line 411
    .line 412
    sub-float v15, v15, v22

    .line 413
    .line 414
    float-to-double v4, v15

    .line 415
    invoke-static {v8, v9, v4, v5}, Ljava/lang/Math;->hypot(DD)D

    .line 416
    .line 417
    .line 418
    move-result-wide v4

    .line 419
    double-to-float v4, v4

    .line 420
    const v5, 0x3a83126f    # 0.001f

    .line 421
    .line 422
    .line 423
    sub-float/2addr v4, v5

    .line 424
    move/from16 v5, p2

    .line 425
    .line 426
    invoke-static {v4, v5}, Ljava/lang/Math;->max(FF)F

    .line 427
    .line 428
    .line 429
    move-result v4

    .line 430
    aget-object v5, v20, v6

    .line 431
    .line 432
    iget v8, v5, Lk90;->b:F

    .line 433
    .line 434
    const/16 v16, 0x0

    .line 435
    .line 436
    aput v8, v7, v16

    .line 437
    .line 438
    iget v5, v5, Lk90;->c:F

    .line 439
    .line 440
    const/4 v15, 0x1

    .line 441
    aput v5, v7, v15

    .line 442
    .line 443
    aget-object v5, v21, v6

    .line 444
    .line 445
    invoke-virtual {v5, v7}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 446
    .line 447
    .line 448
    if-eq v6, v15, :cond_d

    .line 449
    .line 450
    const/4 v5, 0x3

    .line 451
    if-eq v6, v5, :cond_d

    .line 452
    .line 453
    invoke-virtual/range {p4 .. p4}, Landroid/graphics/RectF;->centerY()F

    .line 454
    .line 455
    .line 456
    move-result v5

    .line 457
    aget v8, v7, v15

    .line 458
    .line 459
    sub-float/2addr v5, v8

    .line 460
    invoke-static {v5}, Ljava/lang/Math;->abs(F)F

    .line 461
    .line 462
    .line 463
    move-result v5

    .line 464
    goto :goto_8

    .line 465
    :cond_d
    invoke-virtual/range {p4 .. p4}, Landroid/graphics/RectF;->centerX()F

    .line 466
    .line 467
    .line 468
    move-result v5

    .line 469
    const/16 v16, 0x0

    .line 470
    .line 471
    aget v8, v7, v16

    .line 472
    .line 473
    sub-float/2addr v5, v8

    .line 474
    invoke-static {v5}, Ljava/lang/Math;->abs(F)F

    .line 475
    .line 476
    .line 477
    move-result v5

    .line 478
    :goto_8
    const/high16 v8, 0x43870000    # 270.0f

    .line 479
    .line 480
    const/4 v9, 0x0

    .line 481
    invoke-virtual {v12, v9, v8, v9}, Lk90;->e(FFF)V

    .line 482
    .line 483
    .line 484
    const/4 v15, 0x1

    .line 485
    if-eq v6, v15, :cond_10

    .line 486
    .line 487
    const/4 v15, 0x2

    .line 488
    if-eq v6, v15, :cond_f

    .line 489
    .line 490
    const/4 v8, 0x3

    .line 491
    if-eq v6, v8, :cond_e

    .line 492
    .line 493
    iget-object v9, v1, Lsu0;->j:Lfr;

    .line 494
    .line 495
    goto :goto_9

    .line 496
    :cond_e
    iget-object v9, v1, Lsu0;->i:Lfr;

    .line 497
    .line 498
    goto :goto_9

    .line 499
    :cond_f
    const/4 v8, 0x3

    .line 500
    iget-object v9, v1, Lsu0;->l:Lfr;

    .line 501
    .line 502
    goto :goto_9

    .line 503
    :cond_10
    const/4 v8, 0x3

    .line 504
    const/4 v15, 0x2

    .line 505
    iget-object v9, v1, Lsu0;->k:Lfr;

    .line 506
    .line 507
    :goto_9
    invoke-virtual {v9, v4, v5, v2, v12}, Lfr;->d(FFFLk90;)V

    .line 508
    .line 509
    .line 510
    invoke-virtual {v3}, Landroid/graphics/Path;->reset()V

    .line 511
    .line 512
    .line 513
    aget-object v4, v19, v6

    .line 514
    .line 515
    invoke-virtual {v12, v4, v3}, Lk90;->c(Landroid/graphics/Matrix;Landroid/graphics/Path;)V

    .line 516
    .line 517
    .line 518
    iget-boolean v4, v0, Luu0;->f:Z

    .line 519
    .line 520
    if-eqz v4, :cond_11

    .line 521
    .line 522
    invoke-virtual {v0, v3, v6}, Luu0;->b(Landroid/graphics/Path;I)Z

    .line 523
    .line 524
    .line 525
    move-result v4

    .line 526
    if-nez v4, :cond_12

    .line 527
    .line 528
    invoke-virtual {v0, v3, v14}, Luu0;->b(Landroid/graphics/Path;I)Z

    .line 529
    .line 530
    .line 531
    move-result v4

    .line 532
    if-eqz v4, :cond_11

    .line 533
    .line 534
    goto :goto_a

    .line 535
    :cond_11
    const/16 v18, 0x1

    .line 536
    .line 537
    goto :goto_b

    .line 538
    :cond_12
    :goto_a
    sget-object v4, Landroid/graphics/Path$Op;->DIFFERENCE:Landroid/graphics/Path$Op;

    .line 539
    .line 540
    invoke-virtual {v3, v3, v11, v4}, Landroid/graphics/Path;->op(Landroid/graphics/Path;Landroid/graphics/Path;Landroid/graphics/Path$Op;)Z

    .line 541
    .line 542
    .line 543
    const/4 v9, 0x0

    .line 544
    const/16 v16, 0x0

    .line 545
    .line 546
    aput v9, v7, v16

    .line 547
    .line 548
    iget v3, v12, Lk90;->a:F

    .line 549
    .line 550
    const/16 v18, 0x1

    .line 551
    .line 552
    aput v3, v7, v18

    .line 553
    .line 554
    aget-object v3, v19, v6

    .line 555
    .line 556
    invoke-virtual {v3, v7}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 557
    .line 558
    .line 559
    aget v3, v7, v16

    .line 560
    .line 561
    aget v4, v7, v18

    .line 562
    .line 563
    invoke-virtual {v10, v3, v4}, Landroid/graphics/Path;->moveTo(FF)V

    .line 564
    .line 565
    .line 566
    aget-object v3, v19, v6

    .line 567
    .line 568
    invoke-virtual {v12, v3, v10}, Lk90;->c(Landroid/graphics/Matrix;Landroid/graphics/Path;)V

    .line 569
    .line 570
    .line 571
    move-object/from16 v5, p6

    .line 572
    .line 573
    goto :goto_c

    .line 574
    :goto_b
    aget-object v3, v19, v6

    .line 575
    .line 576
    move-object/from16 v5, p6

    .line 577
    .line 578
    invoke-virtual {v12, v3, v5}, Lk90;->c(Landroid/graphics/Matrix;Landroid/graphics/Path;)V

    .line 579
    .line 580
    .line 581
    :goto_c
    if-eqz p5, :cond_13

    .line 582
    .line 583
    aget-object v3, v19, v6

    .line 584
    .line 585
    move-object/from16 v4, p5

    .line 586
    .line 587
    iget-object v9, v4, Lf20;->g:Ljava/lang/Object;

    .line 588
    .line 589
    check-cast v9, Lnc0;

    .line 590
    .line 591
    iget-object v14, v9, Lnc0;->j:Ljava/util/BitSet;

    .line 592
    .line 593
    add-int/lit8 v8, v6, 0x4

    .line 594
    .line 595
    const/4 v15, 0x0

    .line 596
    invoke-virtual {v14, v8, v15}, Ljava/util/BitSet;->set(IZ)V

    .line 597
    .line 598
    .line 599
    iget-object v8, v9, Lnc0;->i:[Lkv0;

    .line 600
    .line 601
    iget v9, v12, Lk90;->e:F

    .line 602
    .line 603
    invoke-virtual {v12, v9}, Lk90;->b(F)V

    .line 604
    .line 605
    .line 606
    new-instance v9, Landroid/graphics/Matrix;

    .line 607
    .line 608
    invoke-direct {v9, v3}, Landroid/graphics/Matrix;-><init>(Landroid/graphics/Matrix;)V

    .line 609
    .line 610
    .line 611
    new-instance v3, Ljava/util/ArrayList;

    .line 612
    .line 613
    iget-object v12, v12, Lk90;->g:Ljava/lang/Object;

    .line 614
    .line 615
    check-cast v12, Ljava/util/ArrayList;

    .line 616
    .line 617
    invoke-direct {v3, v12}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 618
    .line 619
    .line 620
    new-instance v12, Lev0;

    .line 621
    .line 622
    invoke-direct {v12, v3, v9}, Lev0;-><init>(Ljava/util/ArrayList;Landroid/graphics/Matrix;)V

    .line 623
    .line 624
    .line 625
    aput-object v12, v8, v6

    .line 626
    .line 627
    goto :goto_d

    .line 628
    :cond_13
    move-object/from16 v4, p5

    .line 629
    .line 630
    const/4 v15, 0x0

    .line 631
    :goto_d
    move-object/from16 v3, p4

    .line 632
    .line 633
    move v6, v13

    .line 634
    move/from16 v16, v15

    .line 635
    .line 636
    move-object/from16 v8, v20

    .line 637
    .line 638
    move-object/from16 v9, v21

    .line 639
    .line 640
    const/4 v12, 0x4

    .line 641
    goto/16 :goto_5

    .line 642
    .line 643
    :cond_14
    invoke-virtual {v5}, Landroid/graphics/Path;->close()V

    .line 644
    .line 645
    .line 646
    invoke-virtual {v10}, Landroid/graphics/Path;->close()V

    .line 647
    .line 648
    .line 649
    invoke-virtual {v10}, Landroid/graphics/Path;->isEmpty()Z

    .line 650
    .line 651
    .line 652
    move-result v1

    .line 653
    if-nez v1, :cond_15

    .line 654
    .line 655
    sget-object v1, Landroid/graphics/Path$Op;->UNION:Landroid/graphics/Path$Op;

    .line 656
    .line 657
    invoke-virtual {v5, v10, v1}, Landroid/graphics/Path;->op(Landroid/graphics/Path;Landroid/graphics/Path$Op;)Z

    .line 658
    .line 659
    .line 660
    :cond_15
    return-void
.end method

.method public b(Landroid/graphics/Path;I)Z
    .locals 3

    .line 1
    iget-object v0, p0, Luu0;->n:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/graphics/Path;

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Luu0;->g:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, [Lk90;

    .line 11
    .line 12
    aget-object v1, v1, p2

    .line 13
    .line 14
    iget-object v2, p0, Luu0;->h:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v2, [Landroid/graphics/Matrix;

    .line 17
    .line 18
    aget-object p2, v2, p2

    .line 19
    .line 20
    invoke-virtual {v1, p2, v0}, Lk90;->c(Landroid/graphics/Matrix;Landroid/graphics/Path;)V

    .line 21
    .line 22
    .line 23
    new-instance p2, Landroid/graphics/RectF;

    .line 24
    .line 25
    invoke-direct {p2}, Landroid/graphics/RectF;-><init>()V

    .line 26
    .line 27
    .line 28
    const/4 v1, 0x1

    .line 29
    invoke-virtual {p1, p2, v1}, Landroid/graphics/Path;->computeBounds(Landroid/graphics/RectF;Z)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, p2, v1}, Landroid/graphics/Path;->computeBounds(Landroid/graphics/RectF;Z)V

    .line 33
    .line 34
    .line 35
    sget-object v2, Landroid/graphics/Path$Op;->INTERSECT:Landroid/graphics/Path$Op;

    .line 36
    .line 37
    invoke-virtual {p1, v0, v2}, Landroid/graphics/Path;->op(Landroid/graphics/Path;Landroid/graphics/Path$Op;)Z

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1, p2, v1}, Landroid/graphics/Path;->computeBounds(Landroid/graphics/RectF;Z)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p2}, Landroid/graphics/RectF;->isEmpty()Z

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    if-eqz p1, :cond_1

    .line 48
    .line 49
    invoke-virtual {p2}, Landroid/graphics/RectF;->width()F

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    const/high16 v0, 0x3f800000    # 1.0f

    .line 54
    .line 55
    cmpl-float p1, p1, v0

    .line 56
    .line 57
    if-lez p1, :cond_0

    .line 58
    .line 59
    invoke-virtual {p2}, Landroid/graphics/RectF;->height()F

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    cmpl-float p1, p1, v0

    .line 64
    .line 65
    if-lez p1, :cond_0

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_0
    const/4 p1, 0x0

    .line 69
    return p1

    .line 70
    :cond_1
    :goto_0
    return v1
.end method

.method public c(IILjava/util/List;)Loz1;
    .locals 5

    .line 1
    iget-object v0, p0, Luu0;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/ArrayList;

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    const/4 v2, 0x0

    .line 7
    if-ltz p1, :cond_0

    .line 8
    .line 9
    if-gt p1, p2, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    if-gt p2, v3, :cond_0

    .line 16
    .line 17
    move v3, v1

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move v3, v2

    .line 20
    :goto_0
    invoke-static {v3}, Lzt0;->D(Z)V

    .line 21
    .line 22
    .line 23
    invoke-interface {p3}, Ljava/util/List;->size()I

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    sub-int v4, p2, p1

    .line 28
    .line 29
    if-ne v3, v4, :cond_1

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_1
    move v1, v2

    .line 33
    :goto_1
    invoke-static {v1}, Lzt0;->D(Z)V

    .line 34
    .line 35
    .line 36
    move v1, p1

    .line 37
    :goto_2
    if-ge v1, p2, :cond_2

    .line 38
    .line 39
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    check-cast v2, Lbc4;

    .line 44
    .line 45
    iget-object v2, v2, Lbc4;->a:Lgh4;

    .line 46
    .line 47
    sub-int v3, v1, p1

    .line 48
    .line 49
    invoke-interface {p3, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    check-cast v3, Lfk1;

    .line 54
    .line 55
    invoke-virtual {v2, v3}, Lgh4;->a(Lfk1;)V

    .line 56
    .line 57
    .line 58
    add-int/lit8 v1, v1, 0x1

    .line 59
    .line 60
    goto :goto_2

    .line 61
    :cond_2
    invoke-virtual {p0}, Luu0;->h()Loz1;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    return-object p1
.end method

.method public d()La83;
    .locals 1

    .line 1
    iget-object v0, p0, Luu0;->k:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La83;

    .line 4
    .line 5
    return-object v0
.end method

.method public e()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Luu0;->f:Z

    .line 2
    .line 3
    return v0
.end method

.method public f(Lws3;)V
    .locals 3

    .line 1
    iget-boolean v0, p0, Luu0;->f:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    xor-int/2addr v0, v1

    .line 5
    invoke-static {v0}, Lzt0;->b0(Z)V

    .line 6
    .line 7
    .line 8
    iput-object p1, p0, Luu0;->p:Ljava/lang/Object;

    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    :goto_0
    iget-object v0, p0, Luu0;->h:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-ge p1, v2, :cond_0

    .line 20
    .line 21
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    check-cast v0, Lbc4;

    .line 26
    .line 27
    invoke-virtual {p0, v0}, Luu0;->o(Lbc4;)V

    .line 28
    .line 29
    .line 30
    iget-object v2, p0, Luu0;->m:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v2, Ljava/util/HashSet;

    .line 33
    .line 34
    invoke-virtual {v2, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    add-int/lit8 p1, p1, 0x1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    iput-boolean v1, p0, Luu0;->f:Z

    .line 41
    .line 42
    return-void
.end method

.method public g(Ljh4;)V
    .locals 3

    .line 1
    iget-object v0, p0, Luu0;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/IdentityHashMap;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/util/IdentityHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    check-cast v1, Lbc4;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    iget-object v2, v1, Lbc4;->a:Lgh4;

    .line 15
    .line 16
    invoke-virtual {v2, p1}, Lgh4;->b(Ljh4;)V

    .line 17
    .line 18
    .line 19
    iget-object v2, v1, Lbc4;->c:Ljava/util/ArrayList;

    .line 20
    .line 21
    check-cast p1, Ldh4;

    .line 22
    .line 23
    iget-object p1, p1, Ldh4;->f:Lkh4;

    .line 24
    .line 25
    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/util/IdentityHashMap;->isEmpty()Z

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    if-nez p1, :cond_0

    .line 33
    .line 34
    invoke-virtual {p0}, Luu0;->m()V

    .line 35
    .line 36
    .line 37
    :cond_0
    invoke-virtual {p0, v1}, Luu0;->p(Lbc4;)V

    .line 38
    .line 39
    .line 40
    return-void
.end method

.method public h()Loz1;
    .locals 4

    .line 1
    iget-object v0, p0, Luu0;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-nez v1, :cond_1

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    move v2, v1

    .line 13
    :goto_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    if-ge v1, v3, :cond_0

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    check-cast v3, Lbc4;

    .line 24
    .line 25
    iput v2, v3, Lbc4;->d:I

    .line 26
    .line 27
    iget-object v3, v3, Lbc4;->a:Lgh4;

    .line 28
    .line 29
    iget-object v3, v3, Lgh4;->o:Leh4;

    .line 30
    .line 31
    iget-object v3, v3, Lah4;->b:Loz1;

    .line 32
    .line 33
    invoke-virtual {v3}, Loz1;->a()I

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    add-int/2addr v2, v3

    .line 38
    add-int/lit8 v1, v1, 0x1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    new-instance v1, Lic4;

    .line 42
    .line 43
    iget-object v2, p0, Luu0;->q:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v2, Lni4;

    .line 46
    .line 47
    invoke-direct {v1, v0, v2}, Lic4;-><init>(Ljava/util/List;Lni4;)V

    .line 48
    .line 49
    .line 50
    return-object v1

    .line 51
    :cond_1
    sget-object v0, Loz1;->a:Law1;

    .line 52
    .line 53
    return-object v0
.end method

.method public i(Ljava/util/List;Lni4;)Loz1;
    .locals 3

    .line 1
    iget-object v0, p0, Luu0;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-virtual {p0, v2, v1}, Luu0;->n(II)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    invoke-virtual {p0, v0, p1, p2}, Luu0;->j(ILjava/util/List;Lni4;)Loz1;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    return-object p1
.end method

.method public j(ILjava/util/List;Lni4;)Loz1;
    .locals 6

    .line 1
    iget-object v0, p0, Luu0;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-nez v1, :cond_4

    .line 10
    .line 11
    iput-object p3, p0, Luu0;->q:Ljava/lang/Object;

    .line 12
    .line 13
    move p3, p1

    .line 14
    :goto_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    add-int/2addr v1, p1

    .line 19
    if-ge p3, v1, :cond_4

    .line 20
    .line 21
    sub-int v1, p3, p1

    .line 22
    .line 23
    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    check-cast v1, Lbc4;

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    if-lez p3, :cond_0

    .line 31
    .line 32
    add-int/lit8 v3, p3, -0x1

    .line 33
    .line 34
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    check-cast v3, Lbc4;

    .line 39
    .line 40
    iget-object v4, v3, Lbc4;->a:Lgh4;

    .line 41
    .line 42
    iget-object v4, v4, Lgh4;->o:Leh4;

    .line 43
    .line 44
    iget v3, v3, Lbc4;->d:I

    .line 45
    .line 46
    iget-object v4, v4, Lah4;->b:Loz1;

    .line 47
    .line 48
    invoke-virtual {v4}, Loz1;->a()I

    .line 49
    .line 50
    .line 51
    move-result v4

    .line 52
    add-int/2addr v4, v3

    .line 53
    iput v4, v1, Lbc4;->d:I

    .line 54
    .line 55
    iput-boolean v2, v1, Lbc4;->e:Z

    .line 56
    .line 57
    iget-object v2, v1, Lbc4;->c:Ljava/util/ArrayList;

    .line 58
    .line 59
    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    .line 60
    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_0
    iput v2, v1, Lbc4;->d:I

    .line 64
    .line 65
    iput-boolean v2, v1, Lbc4;->e:Z

    .line 66
    .line 67
    iget-object v2, v1, Lbc4;->c:Ljava/util/ArrayList;

    .line 68
    .line 69
    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    .line 70
    .line 71
    .line 72
    :goto_1
    iget-object v2, v1, Lbc4;->a:Lgh4;

    .line 73
    .line 74
    iget-object v2, v2, Lgh4;->o:Leh4;

    .line 75
    .line 76
    iget-object v2, v2, Lah4;->b:Loz1;

    .line 77
    .line 78
    invoke-virtual {v2}, Loz1;->a()I

    .line 79
    .line 80
    .line 81
    move-result v2

    .line 82
    move v3, p3

    .line 83
    :goto_2
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 84
    .line 85
    .line 86
    move-result v4

    .line 87
    if-ge v3, v4, :cond_1

    .line 88
    .line 89
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v4

    .line 93
    check-cast v4, Lbc4;

    .line 94
    .line 95
    iget v5, v4, Lbc4;->d:I

    .line 96
    .line 97
    add-int/2addr v5, v2

    .line 98
    iput v5, v4, Lbc4;->d:I

    .line 99
    .line 100
    add-int/lit8 v3, v3, 0x1

    .line 101
    .line 102
    goto :goto_2

    .line 103
    :cond_1
    invoke-virtual {v0, p3, v1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    iget-object v2, p0, Luu0;->j:Ljava/lang/Object;

    .line 107
    .line 108
    check-cast v2, Ljava/util/HashMap;

    .line 109
    .line 110
    iget-object v3, v1, Lbc4;->b:Ljava/lang/Object;

    .line 111
    .line 112
    invoke-virtual {v2, v3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    iget-boolean v2, p0, Luu0;->f:Z

    .line 116
    .line 117
    if-eqz v2, :cond_3

    .line 118
    .line 119
    invoke-virtual {p0, v1}, Luu0;->o(Lbc4;)V

    .line 120
    .line 121
    .line 122
    iget-object v2, p0, Luu0;->i:Ljava/lang/Object;

    .line 123
    .line 124
    check-cast v2, Ljava/util/IdentityHashMap;

    .line 125
    .line 126
    invoke-virtual {v2}, Ljava/util/IdentityHashMap;->isEmpty()Z

    .line 127
    .line 128
    .line 129
    move-result v2

    .line 130
    if-eqz v2, :cond_2

    .line 131
    .line 132
    iget-object v2, p0, Luu0;->m:Ljava/lang/Object;

    .line 133
    .line 134
    check-cast v2, Ljava/util/HashSet;

    .line 135
    .line 136
    invoke-virtual {v2, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 137
    .line 138
    .line 139
    goto :goto_3

    .line 140
    :cond_2
    iget-object v2, p0, Luu0;->l:Ljava/lang/Object;

    .line 141
    .line 142
    check-cast v2, Ljava/util/HashMap;

    .line 143
    .line 144
    invoke-virtual {v2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v1

    .line 148
    check-cast v1, Lac4;

    .line 149
    .line 150
    if-eqz v1, :cond_3

    .line 151
    .line 152
    iget-object v2, v1, Lac4;->a:Lpg4;

    .line 153
    .line 154
    iget-object v1, v1, Lac4;->b:Lcc4;

    .line 155
    .line 156
    invoke-virtual {v2, v1}, Lpg4;->p(Llh4;)V

    .line 157
    .line 158
    .line 159
    :cond_3
    :goto_3
    add-int/lit8 p3, p3, 0x1

    .line 160
    .line 161
    goto/16 :goto_0

    .line 162
    .line 163
    :cond_4
    invoke-virtual {p0}, Luu0;->h()Loz1;

    .line 164
    .line 165
    .line 166
    move-result-object p1

    .line 167
    return-object p1
.end method

.method public k(IILni4;)Loz1;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    if-ltz p1, :cond_0

    .line 3
    .line 4
    if-gt p1, p2, :cond_0

    .line 5
    .line 6
    iget-object v1, p0, Luu0;->h:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v1, Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-gt p2, v1, :cond_0

    .line 15
    .line 16
    const/4 v0, 0x1

    .line 17
    :cond_0
    invoke-static {v0}, Lzt0;->D(Z)V

    .line 18
    .line 19
    .line 20
    iput-object p3, p0, Luu0;->q:Ljava/lang/Object;

    .line 21
    .line 22
    invoke-virtual {p0, p1, p2}, Luu0;->n(II)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Luu0;->h()Loz1;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    return-object p1
.end method

.method public l(Lni4;)Loz1;
    .locals 5

    .line 1
    iget-object v0, p0, Luu0;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    iget-object v1, p1, Lni4;->b:[I

    .line 10
    .line 11
    array-length v1, v1

    .line 12
    if-eq v1, v0, :cond_0

    .line 13
    .line 14
    new-instance v1, Lni4;

    .line 15
    .line 16
    iget-object p1, p1, Lni4;->a:Ljava/util/Random;

    .line 17
    .line 18
    new-instance v2, Ljava/util/Random;

    .line 19
    .line 20
    invoke-virtual {p1}, Ljava/util/Random;->nextLong()J

    .line 21
    .line 22
    .line 23
    move-result-wide v3

    .line 24
    invoke-direct {v2, v3, v4}, Ljava/util/Random;-><init>(J)V

    .line 25
    .line 26
    .line 27
    invoke-direct {v1, v2}, Lni4;-><init>(Ljava/util/Random;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1, v0}, Lni4;->a(I)Lni4;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    :cond_0
    iput-object p1, p0, Luu0;->q:Ljava/lang/Object;

    .line 35
    .line 36
    invoke-virtual {p0}, Luu0;->h()Loz1;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    return-object p1
.end method

.method public m()V
    .locals 3

    .line 1
    iget-object v0, p0, Luu0;->m:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/HashSet;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_2

    .line 14
    .line 15
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, Lbc4;

    .line 20
    .line 21
    iget-object v2, v1, Lbc4;->c:Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-eqz v2, :cond_0

    .line 28
    .line 29
    iget-object v2, p0, Luu0;->l:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v2, Ljava/util/HashMap;

    .line 32
    .line 33
    invoke-virtual {v2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    check-cast v1, Lac4;

    .line 38
    .line 39
    if-eqz v1, :cond_1

    .line 40
    .line 41
    iget-object v2, v1, Lac4;->a:Lpg4;

    .line 42
    .line 43
    iget-object v1, v1, Lac4;->b:Lcc4;

    .line 44
    .line 45
    invoke-virtual {v2, v1}, Lpg4;->p(Llh4;)V

    .line 46
    .line 47
    .line 48
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_2
    return-void
.end method

.method public n(II)V
    .locals 6

    .line 1
    iget-object v0, p0, Luu0;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/ArrayList;

    .line 4
    .line 5
    :cond_0
    :goto_0
    add-int/lit8 p2, p2, -0x1

    .line 6
    .line 7
    if-lt p2, p1, :cond_2

    .line 8
    .line 9
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    check-cast v1, Lbc4;

    .line 14
    .line 15
    iget-object v2, p0, Luu0;->j:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v2, Ljava/util/HashMap;

    .line 18
    .line 19
    iget-object v3, v1, Lbc4;->b:Ljava/lang/Object;

    .line 20
    .line 21
    invoke-virtual {v2, v3}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    iget-object v2, v1, Lbc4;->a:Lgh4;

    .line 25
    .line 26
    iget-object v2, v2, Lgh4;->o:Leh4;

    .line 27
    .line 28
    iget-object v2, v2, Lah4;->b:Loz1;

    .line 29
    .line 30
    invoke-virtual {v2}, Loz1;->a()I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    neg-int v2, v2

    .line 35
    move v3, p2

    .line 36
    :goto_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 37
    .line 38
    .line 39
    move-result v4

    .line 40
    if-ge v3, v4, :cond_1

    .line 41
    .line 42
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    check-cast v4, Lbc4;

    .line 47
    .line 48
    iget v5, v4, Lbc4;->d:I

    .line 49
    .line 50
    add-int/2addr v5, v2

    .line 51
    iput v5, v4, Lbc4;->d:I

    .line 52
    .line 53
    add-int/lit8 v3, v3, 0x1

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_1
    const/4 v2, 0x1

    .line 57
    iput-boolean v2, v1, Lbc4;->e:Z

    .line 58
    .line 59
    iget-boolean v2, p0, Luu0;->f:Z

    .line 60
    .line 61
    if-eqz v2, :cond_0

    .line 62
    .line 63
    invoke-virtual {p0, v1}, Luu0;->p(Lbc4;)V

    .line 64
    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_2
    return-void
.end method

.method public o(Lbc4;)V
    .locals 6

    .line 1
    iget-object v0, p1, Lbc4;->a:Lgh4;

    .line 2
    .line 3
    new-instance v1, Lcc4;

    .line 4
    .line 5
    invoke-direct {v1, p0}, Lcc4;-><init>(Luu0;)V

    .line 6
    .line 7
    .line 8
    new-instance v2, Lvb4;

    .line 9
    .line 10
    invoke-direct {v2, p0, p1}, Lvb4;-><init>(Luu0;Lbc4;)V

    .line 11
    .line 12
    .line 13
    new-instance v3, Lac4;

    .line 14
    .line 15
    invoke-direct {v3, v0, v1, v2}, Lac4;-><init>(Lpg4;Lcc4;Lvb4;)V

    .line 16
    .line 17
    .line 18
    iget-object v4, p0, Luu0;->l:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v4, Ljava/util/HashMap;

    .line 21
    .line 22
    invoke-virtual {v4, p1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    sget-object p1, Lv23;->a:Ljava/lang/String;

    .line 26
    .line 27
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    if-eqz p1, :cond_0

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    :goto_0
    new-instance v3, Landroid/os/Handler;

    .line 39
    .line 40
    const/4 v4, 0x0

    .line 41
    invoke-direct {v3, p1, v4}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    .line 42
    .line 43
    .line 44
    iget-object p1, v0, Lpg4;->c:Lwt2;

    .line 45
    .line 46
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    new-instance v5, Lmh4;

    .line 50
    .line 51
    invoke-direct {v5, v3, v2}, Lmh4;-><init>(Landroid/os/Handler;Lrh4;)V

    .line 52
    .line 53
    .line 54
    iget-object p1, p1, Lwt2;->h:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast p1, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 57
    .line 58
    invoke-virtual {p1, v5}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    if-eqz p1, :cond_1

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_1
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    :goto_1
    new-instance v3, Landroid/os/Handler;

    .line 73
    .line 74
    invoke-direct {v3, p1, v4}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    .line 75
    .line 76
    .line 77
    iget-object p1, v0, Lpg4;->d:Llv2;

    .line 78
    .line 79
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    new-instance v3, Ljf4;

    .line 83
    .line 84
    invoke-direct {v3, v2}, Ljf4;-><init>(Lkf4;)V

    .line 85
    .line 86
    .line 87
    iget-object p1, p1, Llv2;->h:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast p1, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 90
    .line 91
    invoke-virtual {p1, v3}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    iget-object p1, p0, Luu0;->p:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast p1, Lws3;

    .line 97
    .line 98
    iget-object v2, p0, Luu0;->g:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast v2, Lxd4;

    .line 101
    .line 102
    invoke-virtual {v0, v1, p1, v2}, Lpg4;->n(Llh4;Lws3;Lxd4;)V

    .line 103
    .line 104
    .line 105
    return-void
.end method

.method public p(Lbc4;)V
    .locals 3

    .line 1
    iget-boolean v0, p1, Lbc4;->e:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p1, Lbc4;->c:Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Luu0;->l:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, Ljava/util/HashMap;

    .line 16
    .line 17
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Lac4;

    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    iget-object v1, v0, Lac4;->a:Lpg4;

    .line 27
    .line 28
    iget-object v2, v0, Lac4;->b:Lcc4;

    .line 29
    .line 30
    invoke-virtual {v1, v2}, Lpg4;->q(Llh4;)V

    .line 31
    .line 32
    .line 33
    iget-object v0, v0, Lac4;->c:Lvb4;

    .line 34
    .line 35
    invoke-virtual {v1, v0}, Lpg4;->l(Lrh4;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1, v0}, Lpg4;->m(Lkf4;)V

    .line 39
    .line 40
    .line 41
    iget-object v0, p0, Luu0;->m:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v0, Ljava/util/HashSet;

    .line 44
    .line 45
    invoke-virtual {v0, p1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    :cond_0
    return-void
.end method

.method public q(ZLandroid/content/Context;Lan2;)V
    .locals 22

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-boolean v0, v1, Luu0;->f:Z

    .line 4
    .line 5
    iget-object v2, v1, Luu0;->i:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v2, Ll83;

    .line 8
    .line 9
    iget-object v3, v1, Luu0;->k:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v3, La83;

    .line 12
    .line 13
    iget-object v4, v1, Luu0;->n:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v4, Le42;

    .line 16
    .line 17
    iget-object v5, v1, Luu0;->l:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v5, Lpd2;

    .line 20
    .line 21
    invoke-static {v5}, Lpu1;->S(Lpd2;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v5

    .line 25
    check-cast v5, Lii2;

    .line 26
    .line 27
    :try_start_0
    iget-object v6, v1, Luu0;->m:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v6, Lag2;

    .line 30
    .line 31
    invoke-interface {v6}, Lag2;->i0()Z

    .line 32
    .line 33
    .line 34
    move-result v7

    .line 35
    const/4 v8, 0x1

    .line 36
    const/4 v9, 0x0

    .line 37
    if-nez v7, :cond_0

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_0
    sget-object v7, Lmz1;->V0:Liz1;

    .line 41
    .line 42
    sget-object v10, Ltw1;->e:Ltw1;

    .line 43
    .line 44
    iget-object v10, v10, Ltw1;->c:Lkz1;

    .line 45
    .line 46
    invoke-virtual {v10, v7}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v7

    .line 50
    check-cast v7, Ljava/lang/Boolean;

    .line 51
    .line 52
    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    .line 53
    .line 54
    .line 55
    move-result v7

    .line 56
    if-eqz v7, :cond_2

    .line 57
    .line 58
    iget-object v6, v1, Luu0;->h:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v6, Lpu2;

    .line 61
    .line 62
    iget-object v7, v2, Ll83;->f:Lxe4;

    .line 63
    .line 64
    invoke-virtual {v6, v7, v9, v9}, Lpu2;->a(Lxe4;La83;Lc83;)Lag2;

    .line 65
    .line 66
    .line 67
    move-result-object v6

    .line 68
    iget-object v7, v5, Lii2;->K:Lba4;

    .line 69
    .line 70
    invoke-virtual {v7}, Lba4;->d()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v7

    .line 74
    check-cast v7, Lcq2;

    .line 75
    .line 76
    new-instance v10, Lk32;

    .line 77
    .line 78
    const/4 v11, 0x5

    .line 79
    invoke-direct {v10, v11, v7}, Lk32;-><init>(ILjava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    const-string v7, "/reward"

    .line 83
    .line 84
    invoke-interface {v6, v7, v10}, Lag2;->v0(Ljava/lang/String;Ly32;)V

    .line 85
    .line 86
    .line 87
    iget-object v7, v5, Lii2;->L:Lba4;

    .line 88
    .line 89
    invoke-virtual {v7}, Lba4;->d()Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v7

    .line 93
    check-cast v7, Lou2;

    .line 94
    .line 95
    if-eqz v0, :cond_1

    .line 96
    .line 97
    move-object v10, v4

    .line 98
    goto :goto_0

    .line 99
    :cond_1
    move-object v10, v9

    .line 100
    :goto_0
    iget-object v11, v1, Luu0;->p:Ljava/lang/Object;

    .line 101
    .line 102
    check-cast v11, Ljv2;

    .line 103
    .line 104
    iget-object v11, v11, Ljv2;->e:Landroid/os/Bundle;

    .line 105
    .line 106
    invoke-virtual {v7, v6, v8, v10, v11}, Lou2;->a(Lag2;ZLe42;Landroid/os/Bundle;)V

    .line 107
    .line 108
    .line 109
    invoke-interface {v6}, Lag2;->e0()Lsg2;

    .line 110
    .line 111
    .line 112
    move-result-object v7

    .line 113
    new-instance v10, Lof3;

    .line 114
    .line 115
    const/16 v11, 0x16

    .line 116
    .line 117
    invoke-direct {v10, v11, v6}, Lof3;-><init>(ILjava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    iput-object v10, v7, Lsg2;->l:Lug2;

    .line 121
    .line 122
    invoke-interface {v6}, Lag2;->e0()Lsg2;

    .line 123
    .line 124
    .line 125
    move-result-object v7

    .line 126
    new-instance v10, Lt32;

    .line 127
    .line 128
    invoke-direct {v10, v6}, Lt32;-><init>(Lag2;)V

    .line 129
    .line 130
    .line 131
    iput-object v10, v7, Lsg2;->m:Lvg2;

    .line 132
    .line 133
    iget-object v7, v3, La83;->s:Le83;

    .line 134
    .line 135
    iget-object v10, v7, Le83;->b:Ljava/lang/String;

    .line 136
    .line 137
    iget-object v7, v7, Le83;->a:Ljava/lang/String;

    .line 138
    .line 139
    invoke-interface {v6, v10, v7}, Lag2;->J0(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Lhg2; {:try_start_0 .. :try_end_0} :catch_0

    .line 140
    .line 141
    .line 142
    :cond_2
    :goto_1
    move-object v11, v6

    .line 143
    goto :goto_2

    .line 144
    :catch_0
    move-exception v0

    .line 145
    goto/16 :goto_7

    .line 146
    .line 147
    :goto_2
    invoke-interface {v11, v8}, Lag2;->P0(Z)V

    .line 148
    .line 149
    .line 150
    new-instance v12, Lzb4;

    .line 151
    .line 152
    const/4 v6, 0x0

    .line 153
    if-eqz v0, :cond_3

    .line 154
    .line 155
    invoke-virtual {v4, v6}, Le42;->a(Z)Z

    .line 156
    .line 157
    .line 158
    move-result v7

    .line 159
    move v13, v7

    .line 160
    goto :goto_3

    .line 161
    :cond_3
    move v13, v6

    .line 162
    :goto_3
    sget-object v7, Lhg4;->C:Lhg4;

    .line 163
    .line 164
    iget-object v7, v7, Lhg4;->c:Llf4;

    .line 165
    .line 166
    iget-object v7, v1, Luu0;->g:Ljava/lang/Object;

    .line 167
    .line 168
    check-cast v7, Landroid/content/Context;

    .line 169
    .line 170
    invoke-static {v7}, Llf4;->i(Landroid/content/Context;)Z

    .line 171
    .line 172
    .line 173
    move-result v14

    .line 174
    if-eqz v0, :cond_4

    .line 175
    .line 176
    monitor-enter v4

    .line 177
    :try_start_1
    iget-boolean v7, v4, Le42;->b:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 178
    .line 179
    monitor-exit v4

    .line 180
    if-eqz v7, :cond_4

    .line 181
    .line 182
    move v15, v8

    .line 183
    goto :goto_4

    .line 184
    :cond_4
    move v15, v6

    .line 185
    goto :goto_4

    .line 186
    :catchall_0
    move-exception v0

    .line 187
    :try_start_2
    monitor-exit v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 188
    throw v0

    .line 189
    :goto_4
    if-eqz v0, :cond_5

    .line 190
    .line 191
    monitor-enter v4

    .line 192
    :try_start_3
    iget v0, v4, Le42;->c:F
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 193
    .line 194
    monitor-exit v4

    .line 195
    :goto_5
    move/from16 v16, v0

    .line 196
    .line 197
    goto :goto_6

    .line 198
    :catchall_1
    move-exception v0

    .line 199
    :try_start_4
    monitor-exit v4
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 200
    throw v0

    .line 201
    :cond_5
    const/4 v0, 0x0

    .line 202
    goto :goto_5

    .line 203
    :goto_6
    iget-boolean v0, v3, La83;->O:Z

    .line 204
    .line 205
    iget-boolean v4, v3, La83;->P:Z

    .line 206
    .line 207
    move/from16 v17, p1

    .line 208
    .line 209
    move/from16 v18, v0

    .line 210
    .line 211
    move/from16 v19, v4

    .line 212
    .line 213
    invoke-direct/range {v12 .. v19}, Lzb4;-><init>(ZZZFZZZ)V

    .line 214
    .line 215
    .line 216
    if-eqz p3, :cond_6

    .line 217
    .line 218
    invoke-virtual/range {p3 .. p3}, Lan2;->U1()V

    .line 219
    .line 220
    .line 221
    :cond_6
    move-object v0, v9

    .line 222
    new-instance v9, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    .line 223
    .line 224
    iget-object v4, v5, Lii2;->J:Lba4;

    .line 225
    .line 226
    invoke-virtual {v4}, Lba4;->d()Ljava/lang/Object;

    .line 227
    .line 228
    .line 229
    move-result-object v4

    .line 230
    move-object v10, v4

    .line 231
    check-cast v10, Loq2;

    .line 232
    .line 233
    move-object v15, v12

    .line 234
    iget v12, v3, La83;->Q:I

    .line 235
    .line 236
    iget-object v4, v1, Luu0;->j:Ljava/lang/Object;

    .line 237
    .line 238
    move-object v13, v4

    .line 239
    check-cast v13, Le51;

    .line 240
    .line 241
    iget-object v14, v3, La83;->B:Ljava/lang/String;

    .line 242
    .line 243
    iget-object v4, v3, La83;->s:Le83;

    .line 244
    .line 245
    iget-object v5, v4, Le83;->b:Ljava/lang/String;

    .line 246
    .line 247
    iget-object v4, v4, Le83;->a:Ljava/lang/String;

    .line 248
    .line 249
    invoke-virtual {v3}, La83;->b()Z

    .line 250
    .line 251
    .line 252
    move-result v3

    .line 253
    if-eqz v3, :cond_7

    .line 254
    .line 255
    iget-object v0, v1, Luu0;->o:Ljava/lang/Object;

    .line 256
    .line 257
    check-cast v0, Lpz2;

    .line 258
    .line 259
    :cond_7
    move-object/from16 v20, v0

    .line 260
    .line 261
    iget-object v0, v2, Ll83;->g:Ljava/lang/String;

    .line 262
    .line 263
    invoke-interface {v11}, Lag2;->o()Ljava/lang/String;

    .line 264
    .line 265
    .line 266
    move-result-object v21

    .line 267
    move-object/from16 v19, p3

    .line 268
    .line 269
    move-object/from16 v18, v0

    .line 270
    .line 271
    move-object/from16 v17, v4

    .line 272
    .line 273
    move-object/from16 v16, v5

    .line 274
    .line 275
    invoke-direct/range {v9 .. v21}, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;-><init>(Loq2;Lag2;ILe51;Ljava/lang/String;Lzb4;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lan2;Lpz2;Ljava/lang/String;)V

    .line 276
    .line 277
    .line 278
    iget-object v0, v1, Luu0;->q:Ljava/lang/Object;

    .line 279
    .line 280
    check-cast v0, Lmv2;

    .line 281
    .line 282
    move-object/from16 v2, p2

    .line 283
    .line 284
    invoke-static {v2, v9, v8, v0}, Ly24;->b(Landroid/content/Context;Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;ZLmv2;)V

    .line 285
    .line 286
    .line 287
    return-void

    .line 288
    :goto_7
    const-string v2, ""

    .line 289
    .line 290
    invoke-static {v2, v0}, Lgi2;->c0(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 291
    .line 292
    .line 293
    return-void
.end method
