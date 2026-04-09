.class public final Lae;
.super Landroid/util/Property;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Class;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput p1, p0, Lae;->a:I

    .line 2
    .line 3
    invoke-direct {p0, p2, p3}, Landroid/util/Property;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lae;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Landroid/view/View;

    .line 7
    .line 8
    invoke-virtual {p1}, Landroid/view/View;->getClipBounds()Landroid/graphics/Rect;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    return-object p1

    .line 13
    :pswitch_0
    check-cast p1, Landroid/view/View;

    .line 14
    .line 15
    sget-object v0, Lf71;->a:Lm71;

    .line 16
    .line 17
    invoke-virtual {v0, p1}, Li41;->l(Landroid/view/View;)F

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    return-object p1

    .line 26
    :pswitch_1
    check-cast p1, Landroidx/appcompat/widget/SwitchCompat;

    .line 27
    .line 28
    iget p1, p1, Landroidx/appcompat/widget/SwitchCompat;->E:F

    .line 29
    .line 30
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    return-object p1

    .line 35
    :pswitch_2
    check-cast p1, Lp60;

    .line 36
    .line 37
    iget p1, p1, Lp60;->i:F

    .line 38
    .line 39
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    return-object p1

    .line 44
    :pswitch_3
    check-cast p1, Ln60;

    .line 45
    .line 46
    iget p1, p1, Ln60;->h:F

    .line 47
    .line 48
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    return-object p1

    .line 53
    :pswitch_4
    check-cast p1, Laq;

    .line 54
    .line 55
    invoke-virtual {p1}, Laq;->b()F

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    return-object p1

    .line 64
    :pswitch_5
    check-cast p1, Landroid/view/View;

    .line 65
    .line 66
    const/4 p1, 0x0

    .line 67
    return-object p1

    .line 68
    :pswitch_6
    check-cast p1, Landroid/view/View;

    .line 69
    .line 70
    const/4 p1, 0x0

    .line 71
    return-object p1

    .line 72
    :pswitch_7
    check-cast p1, Landroid/view/View;

    .line 73
    .line 74
    const/4 p1, 0x0

    .line 75
    return-object p1

    .line 76
    :pswitch_8
    check-cast p1, Lde;

    .line 77
    .line 78
    const/4 p1, 0x0

    .line 79
    return-object p1

    .line 80
    :pswitch_9
    check-cast p1, Lde;

    .line 81
    .line 82
    const/4 p1, 0x0

    .line 83
    return-object p1

    .line 84
    nop

    .line 85
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final set(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 12

    .line 1
    iget v0, p0, Lae;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Landroid/view/View;

    .line 7
    .line 8
    check-cast p2, Landroid/graphics/Rect;

    .line 9
    .line 10
    invoke-virtual {p1, p2}, Landroid/view/View;->setClipBounds(Landroid/graphics/Rect;)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_0
    check-cast p1, Landroid/view/View;

    .line 15
    .line 16
    check-cast p2, Ljava/lang/Float;

    .line 17
    .line 18
    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    .line 19
    .line 20
    .line 21
    move-result p2

    .line 22
    sget-object v0, Lf71;->a:Lm71;

    .line 23
    .line 24
    invoke-virtual {v0, p1, p2}, Li41;->y(Landroid/view/View;F)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :pswitch_1
    check-cast p1, Landroidx/appcompat/widget/SwitchCompat;

    .line 29
    .line 30
    check-cast p2, Ljava/lang/Float;

    .line 31
    .line 32
    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    .line 33
    .line 34
    .line 35
    move-result p2

    .line 36
    invoke-virtual {p1, p2}, Landroidx/appcompat/widget/SwitchCompat;->setThumbPosition(F)V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :pswitch_2
    check-cast p1, Lp60;

    .line 41
    .line 42
    check-cast p2, Ljava/lang/Float;

    .line 43
    .line 44
    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    .line 45
    .line 46
    .line 47
    move-result p2

    .line 48
    iput p2, p1, Lp60;->i:F

    .line 49
    .line 50
    const/high16 v0, 0x44e10000    # 1800.0f

    .line 51
    .line 52
    mul-float/2addr p2, v0

    .line 53
    float-to-int p2, p2

    .line 54
    iget-object v0, p1, Lp60;->e:[Landroid/view/animation/Interpolator;

    .line 55
    .line 56
    iget-object v1, p1, Le6;->b:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v1, Ljava/util/ArrayList;

    .line 59
    .line 60
    const/4 v2, 0x0

    .line 61
    move v3, v2

    .line 62
    :goto_0
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 63
    .line 64
    .line 65
    move-result v4

    .line 66
    if-ge v3, v4, :cond_0

    .line 67
    .line 68
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    check-cast v4, Lcq;

    .line 73
    .line 74
    sget-object v5, Lp60;->l:[I

    .line 75
    .line 76
    mul-int/lit8 v6, v3, 0x2

    .line 77
    .line 78
    aget v7, v5, v6

    .line 79
    .line 80
    sget-object v8, Lp60;->k:[I

    .line 81
    .line 82
    aget v9, v8, v6

    .line 83
    .line 84
    sub-int v7, p2, v7

    .line 85
    .line 86
    int-to-float v7, v7

    .line 87
    int-to-float v9, v9

    .line 88
    div-float/2addr v7, v9

    .line 89
    const/4 v9, 0x0

    .line 90
    const/high16 v10, 0x3f800000    # 1.0f

    .line 91
    .line 92
    invoke-static {v7, v9, v10}, Lbd2;->g(FFF)F

    .line 93
    .line 94
    .line 95
    move-result v7

    .line 96
    aget-object v11, v0, v6

    .line 97
    .line 98
    invoke-interface {v11, v7}, Landroid/animation/TimeInterpolator;->getInterpolation(F)F

    .line 99
    .line 100
    .line 101
    move-result v7

    .line 102
    invoke-static {v7, v9, v10}, Lbd2;->g(FFF)F

    .line 103
    .line 104
    .line 105
    move-result v7

    .line 106
    iput v7, v4, Lcq;->a:F

    .line 107
    .line 108
    add-int/lit8 v6, v6, 0x1

    .line 109
    .line 110
    aget v5, v5, v6

    .line 111
    .line 112
    aget v7, v8, v6

    .line 113
    .line 114
    sub-int v5, p2, v5

    .line 115
    .line 116
    int-to-float v5, v5

    .line 117
    int-to-float v7, v7

    .line 118
    div-float/2addr v5, v7

    .line 119
    invoke-static {v5, v9, v10}, Lbd2;->g(FFF)F

    .line 120
    .line 121
    .line 122
    move-result v5

    .line 123
    aget-object v6, v0, v6

    .line 124
    .line 125
    invoke-interface {v6, v5}, Landroid/animation/TimeInterpolator;->getInterpolation(F)F

    .line 126
    .line 127
    .line 128
    move-result v5

    .line 129
    invoke-static {v5, v9, v10}, Lbd2;->g(FFF)F

    .line 130
    .line 131
    .line 132
    move-result v5

    .line 133
    iput v5, v4, Lcq;->b:F

    .line 134
    .line 135
    add-int/lit8 v3, v3, 0x1

    .line 136
    .line 137
    goto :goto_0

    .line 138
    :cond_0
    iget-boolean p2, p1, Lp60;->h:Z

    .line 139
    .line 140
    if-eqz p2, :cond_2

    .line 141
    .line 142
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 143
    .line 144
    .line 145
    move-result p2

    .line 146
    move v0, v2

    .line 147
    :goto_1
    if-ge v0, p2, :cond_1

    .line 148
    .line 149
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v3

    .line 153
    add-int/lit8 v0, v0, 0x1

    .line 154
    .line 155
    check-cast v3, Lcq;

    .line 156
    .line 157
    iget-object v4, p1, Lp60;->f:Lv60;

    .line 158
    .line 159
    iget-object v4, v4, Lv60;->e:[I

    .line 160
    .line 161
    iget v5, p1, Lp60;->g:I

    .line 162
    .line 163
    aget v4, v4, v5

    .line 164
    .line 165
    iput v4, v3, Lcq;->c:I

    .line 166
    .line 167
    goto :goto_1

    .line 168
    :cond_1
    iput-boolean v2, p1, Lp60;->h:Z

    .line 169
    .line 170
    :cond_2
    iget-object p1, p1, Le6;->a:Ljava/lang/Object;

    .line 171
    .line 172
    check-cast p1, Ln20;

    .line 173
    .line 174
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 175
    .line 176
    .line 177
    return-void

    .line 178
    :pswitch_3
    check-cast p1, Ln60;

    .line 179
    .line 180
    check-cast p2, Ljava/lang/Float;

    .line 181
    .line 182
    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    .line 183
    .line 184
    .line 185
    move-result p2

    .line 186
    iput p2, p1, Ln60;->h:F

    .line 187
    .line 188
    const v0, 0x43a68000    # 333.0f

    .line 189
    .line 190
    .line 191
    mul-float/2addr p2, v0

    .line 192
    float-to-int p2, p2

    .line 193
    iget-object v0, p1, Le6;->b:Ljava/lang/Object;

    .line 194
    .line 195
    check-cast v0, Ljava/util/ArrayList;

    .line 196
    .line 197
    const/4 v1, 0x0

    .line 198
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object v2

    .line 202
    check-cast v2, Lcq;

    .line 203
    .line 204
    const/4 v3, 0x0

    .line 205
    iput v3, v2, Lcq;->a:F

    .line 206
    .line 207
    int-to-float p2, p2

    .line 208
    const/16 v2, 0x29b

    .line 209
    .line 210
    int-to-float v2, v2

    .line 211
    div-float/2addr p2, v2

    .line 212
    const/high16 v2, 0x3f800000    # 1.0f

    .line 213
    .line 214
    invoke-static {p2, v3, v2}, Lbd2;->g(FFF)F

    .line 215
    .line 216
    .line 217
    move-result p2

    .line 218
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object v3

    .line 222
    check-cast v3, Lcq;

    .line 223
    .line 224
    const/4 v4, 0x1

    .line 225
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    move-result-object v5

    .line 229
    check-cast v5, Lcq;

    .line 230
    .line 231
    iget-object v6, p1, Ln60;->d:Lfu;

    .line 232
    .line 233
    invoke-virtual {v6, p2}, Ln80;->getInterpolation(F)F

    .line 234
    .line 235
    .line 236
    move-result v7

    .line 237
    iput v7, v5, Lcq;->a:F

    .line 238
    .line 239
    iput v7, v3, Lcq;->b:F

    .line 240
    .line 241
    const v3, 0x3eff9dbf

    .line 242
    .line 243
    .line 244
    add-float/2addr p2, v3

    .line 245
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 246
    .line 247
    .line 248
    move-result-object v3

    .line 249
    check-cast v3, Lcq;

    .line 250
    .line 251
    const/4 v5, 0x2

    .line 252
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 253
    .line 254
    .line 255
    move-result-object v7

    .line 256
    check-cast v7, Lcq;

    .line 257
    .line 258
    invoke-virtual {v6, p2}, Ln80;->getInterpolation(F)F

    .line 259
    .line 260
    .line 261
    move-result p2

    .line 262
    iput p2, v7, Lcq;->a:F

    .line 263
    .line 264
    iput p2, v3, Lcq;->b:F

    .line 265
    .line 266
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 267
    .line 268
    .line 269
    move-result-object p2

    .line 270
    check-cast p2, Lcq;

    .line 271
    .line 272
    iput v2, p2, Lcq;->b:F

    .line 273
    .line 274
    iget-boolean p2, p1, Ln60;->g:Z

    .line 275
    .line 276
    if-eqz p2, :cond_3

    .line 277
    .line 278
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 279
    .line 280
    .line 281
    move-result-object p2

    .line 282
    check-cast p2, Lcq;

    .line 283
    .line 284
    iget p2, p2, Lcq;->b:F

    .line 285
    .line 286
    cmpg-float p2, p2, v2

    .line 287
    .line 288
    if-gez p2, :cond_3

    .line 289
    .line 290
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 291
    .line 292
    .line 293
    move-result-object p2

    .line 294
    check-cast p2, Lcq;

    .line 295
    .line 296
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 297
    .line 298
    .line 299
    move-result-object v2

    .line 300
    check-cast v2, Lcq;

    .line 301
    .line 302
    iget v2, v2, Lcq;->c:I

    .line 303
    .line 304
    iput v2, p2, Lcq;->c:I

    .line 305
    .line 306
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 307
    .line 308
    .line 309
    move-result-object p2

    .line 310
    check-cast p2, Lcq;

    .line 311
    .line 312
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 313
    .line 314
    .line 315
    move-result-object v2

    .line 316
    check-cast v2, Lcq;

    .line 317
    .line 318
    iget v2, v2, Lcq;->c:I

    .line 319
    .line 320
    iput v2, p2, Lcq;->c:I

    .line 321
    .line 322
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 323
    .line 324
    .line 325
    move-result-object p2

    .line 326
    check-cast p2, Lcq;

    .line 327
    .line 328
    iget-object v0, p1, Ln60;->e:Lv60;

    .line 329
    .line 330
    iget-object v0, v0, Lv60;->e:[I

    .line 331
    .line 332
    iget v2, p1, Ln60;->f:I

    .line 333
    .line 334
    aget v0, v0, v2

    .line 335
    .line 336
    iput v0, p2, Lcq;->c:I

    .line 337
    .line 338
    iput-boolean v1, p1, Ln60;->g:Z

    .line 339
    .line 340
    :cond_3
    iget-object p1, p1, Le6;->a:Ljava/lang/Object;

    .line 341
    .line 342
    check-cast p1, Ln20;

    .line 343
    .line 344
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 345
    .line 346
    .line 347
    return-void

    .line 348
    :pswitch_4
    check-cast p1, Laq;

    .line 349
    .line 350
    check-cast p2, Ljava/lang/Float;

    .line 351
    .line 352
    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    .line 353
    .line 354
    .line 355
    move-result p2

    .line 356
    iget v0, p1, Laq;->n:F

    .line 357
    .line 358
    cmpl-float v0, v0, p2

    .line 359
    .line 360
    if-eqz v0, :cond_4

    .line 361
    .line 362
    iput p2, p1, Laq;->n:F

    .line 363
    .line 364
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 365
    .line 366
    .line 367
    :cond_4
    return-void

    .line 368
    :pswitch_5
    check-cast p1, Landroid/view/View;

    .line 369
    .line 370
    check-cast p2, Landroid/graphics/PointF;

    .line 371
    .line 372
    iget v0, p2, Landroid/graphics/PointF;->x:F

    .line 373
    .line 374
    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    .line 375
    .line 376
    .line 377
    move-result v0

    .line 378
    iget p2, p2, Landroid/graphics/PointF;->y:F

    .line 379
    .line 380
    invoke-static {p2}, Ljava/lang/Math;->round(F)I

    .line 381
    .line 382
    .line 383
    move-result p2

    .line 384
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 385
    .line 386
    .line 387
    move-result v1

    .line 388
    add-int/2addr v1, v0

    .line 389
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    .line 390
    .line 391
    .line 392
    move-result v2

    .line 393
    add-int/2addr v2, p2

    .line 394
    invoke-static {p1, v0, p2, v1, v2}, Lf71;->a(Landroid/view/View;IIII)V

    .line 395
    .line 396
    .line 397
    return-void

    .line 398
    :pswitch_6
    check-cast p1, Landroid/view/View;

    .line 399
    .line 400
    check-cast p2, Landroid/graphics/PointF;

    .line 401
    .line 402
    iget v0, p2, Landroid/graphics/PointF;->x:F

    .line 403
    .line 404
    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    .line 405
    .line 406
    .line 407
    move-result v0

    .line 408
    iget p2, p2, Landroid/graphics/PointF;->y:F

    .line 409
    .line 410
    invoke-static {p2}, Ljava/lang/Math;->round(F)I

    .line 411
    .line 412
    .line 413
    move-result p2

    .line 414
    invoke-virtual {p1}, Landroid/view/View;->getRight()I

    .line 415
    .line 416
    .line 417
    move-result v1

    .line 418
    invoke-virtual {p1}, Landroid/view/View;->getBottom()I

    .line 419
    .line 420
    .line 421
    move-result v2

    .line 422
    invoke-static {p1, v0, p2, v1, v2}, Lf71;->a(Landroid/view/View;IIII)V

    .line 423
    .line 424
    .line 425
    return-void

    .line 426
    :pswitch_7
    check-cast p1, Landroid/view/View;

    .line 427
    .line 428
    check-cast p2, Landroid/graphics/PointF;

    .line 429
    .line 430
    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    .line 431
    .line 432
    .line 433
    move-result v0

    .line 434
    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    .line 435
    .line 436
    .line 437
    move-result v1

    .line 438
    iget v2, p2, Landroid/graphics/PointF;->x:F

    .line 439
    .line 440
    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    .line 441
    .line 442
    .line 443
    move-result v2

    .line 444
    iget p2, p2, Landroid/graphics/PointF;->y:F

    .line 445
    .line 446
    invoke-static {p2}, Ljava/lang/Math;->round(F)I

    .line 447
    .line 448
    .line 449
    move-result p2

    .line 450
    invoke-static {p1, v0, v1, v2, p2}, Lf71;->a(Landroid/view/View;IIII)V

    .line 451
    .line 452
    .line 453
    return-void

    .line 454
    :pswitch_8
    check-cast p1, Lde;

    .line 455
    .line 456
    check-cast p2, Landroid/graphics/PointF;

    .line 457
    .line 458
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 459
    .line 460
    .line 461
    iget v0, p2, Landroid/graphics/PointF;->x:F

    .line 462
    .line 463
    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    .line 464
    .line 465
    .line 466
    move-result v0

    .line 467
    iput v0, p1, Lde;->c:I

    .line 468
    .line 469
    iget p2, p2, Landroid/graphics/PointF;->y:F

    .line 470
    .line 471
    invoke-static {p2}, Ljava/lang/Math;->round(F)I

    .line 472
    .line 473
    .line 474
    move-result p2

    .line 475
    iput p2, p1, Lde;->d:I

    .line 476
    .line 477
    iget v0, p1, Lde;->g:I

    .line 478
    .line 479
    add-int/lit8 v0, v0, 0x1

    .line 480
    .line 481
    iput v0, p1, Lde;->g:I

    .line 482
    .line 483
    iget v1, p1, Lde;->f:I

    .line 484
    .line 485
    if-ne v1, v0, :cond_5

    .line 486
    .line 487
    iget-object v0, p1, Lde;->e:Landroid/view/View;

    .line 488
    .line 489
    iget v1, p1, Lde;->a:I

    .line 490
    .line 491
    iget v2, p1, Lde;->b:I

    .line 492
    .line 493
    iget v3, p1, Lde;->c:I

    .line 494
    .line 495
    invoke-static {v0, v1, v2, v3, p2}, Lf71;->a(Landroid/view/View;IIII)V

    .line 496
    .line 497
    .line 498
    const/4 p2, 0x0

    .line 499
    iput p2, p1, Lde;->f:I

    .line 500
    .line 501
    iput p2, p1, Lde;->g:I

    .line 502
    .line 503
    :cond_5
    return-void

    .line 504
    :pswitch_9
    check-cast p1, Lde;

    .line 505
    .line 506
    check-cast p2, Landroid/graphics/PointF;

    .line 507
    .line 508
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 509
    .line 510
    .line 511
    iget v0, p2, Landroid/graphics/PointF;->x:F

    .line 512
    .line 513
    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    .line 514
    .line 515
    .line 516
    move-result v0

    .line 517
    iput v0, p1, Lde;->a:I

    .line 518
    .line 519
    iget p2, p2, Landroid/graphics/PointF;->y:F

    .line 520
    .line 521
    invoke-static {p2}, Ljava/lang/Math;->round(F)I

    .line 522
    .line 523
    .line 524
    move-result p2

    .line 525
    iput p2, p1, Lde;->b:I

    .line 526
    .line 527
    iget v0, p1, Lde;->f:I

    .line 528
    .line 529
    add-int/lit8 v0, v0, 0x1

    .line 530
    .line 531
    iput v0, p1, Lde;->f:I

    .line 532
    .line 533
    iget v1, p1, Lde;->g:I

    .line 534
    .line 535
    if-ne v0, v1, :cond_6

    .line 536
    .line 537
    iget-object v0, p1, Lde;->e:Landroid/view/View;

    .line 538
    .line 539
    iget v1, p1, Lde;->a:I

    .line 540
    .line 541
    iget v2, p1, Lde;->c:I

    .line 542
    .line 543
    iget v3, p1, Lde;->d:I

    .line 544
    .line 545
    invoke-static {v0, v1, p2, v2, v3}, Lf71;->a(Landroid/view/View;IIII)V

    .line 546
    .line 547
    .line 548
    const/4 p2, 0x0

    .line 549
    iput p2, p1, Lde;->f:I

    .line 550
    .line 551
    iput p2, p1, Lde;->g:I

    .line 552
    .line 553
    :cond_6
    return-void

    .line 554
    nop

    .line 555
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
