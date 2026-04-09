.class public final Lkj4;
.super Ljj4;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final A:I

.field public final j:Z

.field public final k:Ldj4;

.field public final l:Z

.field public final m:Z

.field public final n:Z

.field public final o:I

.field public final p:I

.field public final q:I

.field public final r:I

.field public final s:I

.field public final t:I

.field public final u:I

.field public final v:Z

.field public final w:I

.field public final x:I

.field public final y:Z

.field public final z:Z


# direct methods
.method public constructor <init>(ILd02;ILdj4;ILjava/lang/String;Z)V
    .locals 7

    .line 1
    invoke-direct {p0, p1, p2, p3}, Ljj4;-><init>(ILd02;I)V

    .line 2
    .line 3
    .line 4
    iput-object p4, p0, Lkj4;->k:Ldj4;

    .line 5
    .line 6
    iget-boolean p1, p4, Ldj4;->x:Z

    .line 7
    .line 8
    iget-object p2, p4, Lr32;->i:Lxm3;

    .line 9
    .line 10
    iget-object p3, p4, Lr32;->k:Lxm3;

    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    if-eq v0, p1, :cond_0

    .line 14
    .line 15
    const/16 p1, 0x10

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/16 p1, 0x18

    .line 19
    .line 20
    :goto_0
    const/high16 v1, -0x40800000    # -1.0f

    .line 21
    .line 22
    const/4 v2, -0x1

    .line 23
    const/4 v3, 0x0

    .line 24
    if-eqz p7, :cond_1

    .line 25
    .line 26
    iget-object v4, p0, Ljj4;->i:Lph4;

    .line 27
    .line 28
    iget v5, v4, Lph4;->t:I

    .line 29
    .line 30
    if-eq v5, v2, :cond_2

    .line 31
    .line 32
    iget v6, p4, Lr32;->a:I

    .line 33
    .line 34
    if-gt v5, v6, :cond_1

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_1
    move v4, v3

    .line 38
    goto :goto_2

    .line 39
    :cond_2
    :goto_1
    iget v5, v4, Lph4;->u:I

    .line 40
    .line 41
    if-eq v5, v2, :cond_3

    .line 42
    .line 43
    iget v6, p4, Lr32;->b:I

    .line 44
    .line 45
    if-gt v5, v6, :cond_1

    .line 46
    .line 47
    :cond_3
    iget v5, v4, Lph4;->x:F

    .line 48
    .line 49
    cmpl-float v6, v5, v1

    .line 50
    .line 51
    if-eqz v6, :cond_4

    .line 52
    .line 53
    iget v6, p4, Lr32;->c:I

    .line 54
    .line 55
    int-to-float v6, v6

    .line 56
    cmpg-float v5, v5, v6

    .line 57
    .line 58
    if-gtz v5, :cond_1

    .line 59
    .line 60
    :cond_4
    iget v4, v4, Lph4;->i:I

    .line 61
    .line 62
    if-eq v4, v2, :cond_5

    .line 63
    .line 64
    iget v5, p4, Lr32;->d:I

    .line 65
    .line 66
    if-gt v4, v5, :cond_1

    .line 67
    .line 68
    :cond_5
    move v4, v0

    .line 69
    :goto_2
    iput-boolean v4, p0, Lkj4;->j:Z

    .line 70
    .line 71
    if-eqz p7, :cond_6

    .line 72
    .line 73
    iget-object p7, p0, Ljj4;->i:Lph4;

    .line 74
    .line 75
    iget v4, p7, Lph4;->t:I

    .line 76
    .line 77
    if-eq v4, v2, :cond_7

    .line 78
    .line 79
    if-ltz v4, :cond_6

    .line 80
    .line 81
    goto :goto_3

    .line 82
    :cond_6
    move p7, v3

    .line 83
    goto :goto_4

    .line 84
    :cond_7
    :goto_3
    iget v4, p7, Lph4;->u:I

    .line 85
    .line 86
    if-eq v4, v2, :cond_8

    .line 87
    .line 88
    if-ltz v4, :cond_6

    .line 89
    .line 90
    :cond_8
    iget v4, p7, Lph4;->x:F

    .line 91
    .line 92
    cmpl-float v5, v4, v1

    .line 93
    .line 94
    if-eqz v5, :cond_9

    .line 95
    .line 96
    const/4 v5, 0x0

    .line 97
    cmpl-float v4, v4, v5

    .line 98
    .line 99
    if-ltz v4, :cond_6

    .line 100
    .line 101
    :cond_9
    iget p7, p7, Lph4;->i:I

    .line 102
    .line 103
    if-eq p7, v2, :cond_a

    .line 104
    .line 105
    if-ltz p7, :cond_6

    .line 106
    .line 107
    :cond_a
    move p7, v0

    .line 108
    :goto_4
    iput-boolean p7, p0, Lkj4;->l:Z

    .line 109
    .line 110
    invoke-static {p5, v3}, Lkg4;->I(IZ)Z

    .line 111
    .line 112
    .line 113
    move-result p7

    .line 114
    iput-boolean p7, p0, Lkj4;->m:Z

    .line 115
    .line 116
    iget-object p7, p0, Ljj4;->i:Lph4;

    .line 117
    .line 118
    iget v4, p7, Lph4;->x:F

    .line 119
    .line 120
    cmpl-float v1, v4, v1

    .line 121
    .line 122
    if-eqz v1, :cond_b

    .line 123
    .line 124
    const/high16 v1, 0x41200000    # 10.0f

    .line 125
    .line 126
    cmpl-float v1, v4, v1

    .line 127
    .line 128
    if-ltz v1, :cond_b

    .line 129
    .line 130
    move v1, v0

    .line 131
    goto :goto_5

    .line 132
    :cond_b
    move v1, v3

    .line 133
    :goto_5
    iput-boolean v1, p0, Lkj4;->n:Z

    .line 134
    .line 135
    iget v1, p7, Lph4;->i:I

    .line 136
    .line 137
    iput v1, p0, Lkj4;->o:I

    .line 138
    .line 139
    iget v1, p7, Lph4;->t:I

    .line 140
    .line 141
    if-eq v1, v2, :cond_d

    .line 142
    .line 143
    iget p7, p7, Lph4;->u:I

    .line 144
    .line 145
    if-ne p7, v2, :cond_c

    .line 146
    .line 147
    goto :goto_6

    .line 148
    :cond_c
    mul-int/2addr v1, p7

    .line 149
    goto :goto_7

    .line 150
    :cond_d
    :goto_6
    move v1, v2

    .line 151
    :goto_7
    iput v1, p0, Lkj4;->p:I

    .line 152
    .line 153
    move p7, v3

    .line 154
    :goto_8
    invoke-virtual {p3}, Ljava/util/AbstractCollection;->size()I

    .line 155
    .line 156
    .line 157
    move-result v1

    .line 158
    const v4, 0x7fffffff

    .line 159
    .line 160
    .line 161
    if-ge p7, v1, :cond_f

    .line 162
    .line 163
    iget-object v1, p0, Ljj4;->i:Lph4;

    .line 164
    .line 165
    invoke-interface {p3, p7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object v5

    .line 169
    check-cast v5, Ljava/lang/String;

    .line 170
    .line 171
    invoke-static {v1, v5, v3}, Llj4;->d(Lph4;Ljava/lang/String;Z)I

    .line 172
    .line 173
    .line 174
    move-result v1

    .line 175
    if-lez v1, :cond_e

    .line 176
    .line 177
    goto :goto_9

    .line 178
    :cond_e
    add-int/lit8 p7, p7, 0x1

    .line 179
    .line 180
    goto :goto_8

    .line 181
    :cond_f
    move v1, v3

    .line 182
    move p7, v4

    .line 183
    :goto_9
    iput p7, p0, Lkj4;->r:I

    .line 184
    .line 185
    iput v1, p0, Lkj4;->s:I

    .line 186
    .line 187
    iget-object p3, p0, Ljj4;->i:Lph4;

    .line 188
    .line 189
    iget p3, p3, Lph4;->f:I

    .line 190
    .line 191
    if-eqz p3, :cond_10

    .line 192
    .line 193
    if-nez p3, :cond_10

    .line 194
    .line 195
    move p3, v4

    .line 196
    goto :goto_a

    .line 197
    :cond_10
    invoke-static {v3}, Ljava/lang/Integer;->bitCount(I)I

    .line 198
    .line 199
    .line 200
    move-result p3

    .line 201
    :goto_a
    iput p3, p0, Lkj4;->t:I

    .line 202
    .line 203
    iget-object p3, p0, Ljj4;->i:Lph4;

    .line 204
    .line 205
    iget p3, p3, Lph4;->f:I

    .line 206
    .line 207
    if-eqz p3, :cond_11

    .line 208
    .line 209
    and-int/2addr p3, v0

    .line 210
    if-eqz p3, :cond_12

    .line 211
    .line 212
    :cond_11
    move p3, v0

    .line 213
    goto :goto_b

    .line 214
    :cond_12
    move p3, v3

    .line 215
    :goto_b
    iput-boolean p3, p0, Lkj4;->v:Z

    .line 216
    .line 217
    invoke-static {p6}, Llj4;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 218
    .line 219
    .line 220
    move-result-object p3

    .line 221
    if-nez p3, :cond_13

    .line 222
    .line 223
    move p3, v0

    .line 224
    goto :goto_c

    .line 225
    :cond_13
    move p3, v3

    .line 226
    :goto_c
    iget-object p7, p0, Ljj4;->i:Lph4;

    .line 227
    .line 228
    invoke-static {p7, p6, p3}, Llj4;->d(Lph4;Ljava/lang/String;Z)I

    .line 229
    .line 230
    .line 231
    move-result p3

    .line 232
    iput p3, p0, Lkj4;->w:I

    .line 233
    .line 234
    move p3, v3

    .line 235
    :goto_d
    invoke-virtual {p2}, Ljava/util/AbstractCollection;->size()I

    .line 236
    .line 237
    .line 238
    move-result p6

    .line 239
    if-ge p3, p6, :cond_15

    .line 240
    .line 241
    iget-object p6, p0, Ljj4;->i:Lph4;

    .line 242
    .line 243
    iget-object p6, p6, Lph4;->m:Ljava/lang/String;

    .line 244
    .line 245
    if-eqz p6, :cond_14

    .line 246
    .line 247
    invoke-interface {p2, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 248
    .line 249
    .line 250
    move-result-object p7

    .line 251
    invoke-virtual {p6, p7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 252
    .line 253
    .line 254
    move-result p6

    .line 255
    if-eqz p6, :cond_14

    .line 256
    .line 257
    move v4, p3

    .line 258
    goto :goto_e

    .line 259
    :cond_14
    add-int/lit8 p3, p3, 0x1

    .line 260
    .line 261
    goto :goto_d

    .line 262
    :cond_15
    :goto_e
    iput v4, p0, Lkj4;->q:I

    .line 263
    .line 264
    iget-object p2, p0, Ljj4;->i:Lph4;

    .line 265
    .line 266
    iget-object p3, p4, Lr32;->j:Lxm3;

    .line 267
    .line 268
    invoke-static {p2, p3}, Llj4;->e(Lph4;Lxm3;)I

    .line 269
    .line 270
    .line 271
    move-result p2

    .line 272
    iput p2, p0, Lkj4;->u:I

    .line 273
    .line 274
    and-int/lit16 p2, p5, 0x180

    .line 275
    .line 276
    const/16 p3, 0x80

    .line 277
    .line 278
    if-ne p2, p3, :cond_16

    .line 279
    .line 280
    move p2, v0

    .line 281
    goto :goto_f

    .line 282
    :cond_16
    move p2, v3

    .line 283
    :goto_f
    iput-boolean p2, p0, Lkj4;->y:Z

    .line 284
    .line 285
    and-int/lit8 p2, p5, 0x40

    .line 286
    .line 287
    const/16 p3, 0x40

    .line 288
    .line 289
    if-ne p2, p3, :cond_17

    .line 290
    .line 291
    move p2, v0

    .line 292
    goto :goto_10

    .line 293
    :cond_17
    move p2, v3

    .line 294
    :goto_10
    iput-boolean p2, p0, Lkj4;->z:Z

    .line 295
    .line 296
    iget-object p2, p0, Ljj4;->i:Lph4;

    .line 297
    .line 298
    iget-object p3, p2, Lph4;->m:Ljava/lang/String;

    .line 299
    .line 300
    const/4 p4, 0x2

    .line 301
    if-nez p3, :cond_19

    .line 302
    .line 303
    :cond_18
    :goto_11
    move p3, v3

    .line 304
    goto :goto_12

    .line 305
    :cond_19
    invoke-virtual {p3}, Ljava/lang/String;->hashCode()I

    .line 306
    .line 307
    .line 308
    move-result p6

    .line 309
    sparse-switch p6, :sswitch_data_0

    .line 310
    .line 311
    .line 312
    goto :goto_11

    .line 313
    :sswitch_0
    const-string p6, "video/x-vnd.on2.vp9"

    .line 314
    .line 315
    invoke-virtual {p3, p6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 316
    .line 317
    .line 318
    move-result p3

    .line 319
    if-eqz p3, :cond_18

    .line 320
    .line 321
    move p3, p4

    .line 322
    goto :goto_12

    .line 323
    :sswitch_1
    const-string p6, "video/avc"

    .line 324
    .line 325
    invoke-virtual {p3, p6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 326
    .line 327
    .line 328
    move-result p3

    .line 329
    if-eqz p3, :cond_18

    .line 330
    .line 331
    move p3, v0

    .line 332
    goto :goto_12

    .line 333
    :sswitch_2
    const-string p6, "video/hevc"

    .line 334
    .line 335
    invoke-virtual {p3, p6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 336
    .line 337
    .line 338
    move-result p3

    .line 339
    if-eqz p3, :cond_18

    .line 340
    .line 341
    const/4 p3, 0x3

    .line 342
    goto :goto_12

    .line 343
    :sswitch_3
    const-string p6, "video/av01"

    .line 344
    .line 345
    invoke-virtual {p3, p6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 346
    .line 347
    .line 348
    move-result p3

    .line 349
    if-eqz p3, :cond_18

    .line 350
    .line 351
    const/4 p3, 0x4

    .line 352
    goto :goto_12

    .line 353
    :sswitch_4
    const-string p6, "video/dolby-vision"

    .line 354
    .line 355
    invoke-virtual {p3, p6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 356
    .line 357
    .line 358
    move-result p3

    .line 359
    if-eqz p3, :cond_18

    .line 360
    .line 361
    const/4 p3, 0x5

    .line 362
    :goto_12
    iput p3, p0, Lkj4;->A:I

    .line 363
    .line 364
    iget p3, p2, Lph4;->f:I

    .line 365
    .line 366
    and-int/lit16 p3, p3, 0x4000

    .line 367
    .line 368
    if-eqz p3, :cond_1a

    .line 369
    .line 370
    :goto_13
    move v0, v3

    .line 371
    goto :goto_14

    .line 372
    :cond_1a
    iget-object p3, p0, Lkj4;->k:Ldj4;

    .line 373
    .line 374
    iget-boolean p6, p3, Ldj4;->B:Z

    .line 375
    .line 376
    invoke-static {p5, p6}, Lkg4;->I(IZ)Z

    .line 377
    .line 378
    .line 379
    move-result p6

    .line 380
    if-nez p6, :cond_1b

    .line 381
    .line 382
    goto :goto_13

    .line 383
    :cond_1b
    iget-boolean p6, p0, Lkj4;->j:Z

    .line 384
    .line 385
    if-nez p6, :cond_1c

    .line 386
    .line 387
    iget-boolean p3, p3, Ldj4;->w:Z

    .line 388
    .line 389
    if-nez p3, :cond_1c

    .line 390
    .line 391
    goto :goto_13

    .line 392
    :cond_1c
    invoke-static {p5, v3}, Lkg4;->I(IZ)Z

    .line 393
    .line 394
    .line 395
    move-result p3

    .line 396
    if-eqz p3, :cond_1d

    .line 397
    .line 398
    iget-boolean p3, p0, Lkj4;->l:Z

    .line 399
    .line 400
    if-eqz p3, :cond_1d

    .line 401
    .line 402
    if-eqz p6, :cond_1d

    .line 403
    .line 404
    iget p2, p2, Lph4;->i:I

    .line 405
    .line 406
    if-eq p2, v2, :cond_1d

    .line 407
    .line 408
    and-int/2addr p1, p5

    .line 409
    if-eqz p1, :cond_1d

    .line 410
    .line 411
    move v0, p4

    .line 412
    :cond_1d
    :goto_14
    iput v0, p0, Lkj4;->x:I

    .line 413
    .line 414
    return-void

    .line 415
    :sswitch_data_0
    .sparse-switch
        -0x6e5534ef -> :sswitch_4
        -0x631b55f6 -> :sswitch_3
        -0x63185e82 -> :sswitch_2
        0x4f62373a -> :sswitch_1
        0x5f50bed9 -> :sswitch_0
    .end sparse-switch
.end method

.method public static c(Lkj4;Lkj4;)I
    .locals 4

    .line 1
    iget-boolean v0, p0, Lkj4;->m:Z

    .line 2
    .line 3
    iget-boolean v1, p1, Lkj4;->m:Z

    .line 4
    .line 5
    sget-object v2, Lpm3;->a:Lnm3;

    .line 6
    .line 7
    invoke-virtual {v2, v0, v1}, Lnm3;->d(ZZ)Lpm3;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget v1, p0, Lkj4;->r:I

    .line 12
    .line 13
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    iget v2, p1, Lkj4;->r:I

    .line 18
    .line 19
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    sget-object v3, Lqn3;->h:Lqn3;

    .line 24
    .line 25
    invoke-virtual {v0, v1, v2, v3}, Lpm3;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lpm3;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    iget v1, p0, Lkj4;->s:I

    .line 30
    .line 31
    iget v2, p1, Lkj4;->s:I

    .line 32
    .line 33
    invoke-virtual {v0, v1, v2}, Lpm3;->b(II)Lpm3;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    iget v1, p0, Lkj4;->t:I

    .line 38
    .line 39
    iget v2, p1, Lkj4;->t:I

    .line 40
    .line 41
    invoke-virtual {v0, v1, v2}, Lpm3;->b(II)Lpm3;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    iget v1, p0, Lkj4;->u:I

    .line 46
    .line 47
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    iget v2, p1, Lkj4;->u:I

    .line 52
    .line 53
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    invoke-virtual {v0, v1, v2, v3}, Lpm3;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lpm3;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    iget-boolean v1, p0, Lkj4;->v:Z

    .line 62
    .line 63
    iget-boolean v2, p1, Lkj4;->v:Z

    .line 64
    .line 65
    invoke-virtual {v0, v1, v2}, Lpm3;->d(ZZ)Lpm3;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    iget v1, p0, Lkj4;->w:I

    .line 70
    .line 71
    iget v2, p1, Lkj4;->w:I

    .line 72
    .line 73
    invoke-virtual {v0, v1, v2}, Lpm3;->b(II)Lpm3;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    iget-boolean v1, p0, Lkj4;->n:Z

    .line 78
    .line 79
    iget-boolean v2, p1, Lkj4;->n:Z

    .line 80
    .line 81
    invoke-virtual {v0, v1, v2}, Lpm3;->d(ZZ)Lpm3;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    iget-boolean v1, p0, Lkj4;->j:Z

    .line 86
    .line 87
    iget-boolean v2, p1, Lkj4;->j:Z

    .line 88
    .line 89
    invoke-virtual {v0, v1, v2}, Lpm3;->d(ZZ)Lpm3;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    iget-boolean v1, p0, Lkj4;->l:Z

    .line 94
    .line 95
    iget-boolean v2, p1, Lkj4;->l:Z

    .line 96
    .line 97
    invoke-virtual {v0, v1, v2}, Lpm3;->d(ZZ)Lpm3;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    iget v1, p0, Lkj4;->q:I

    .line 102
    .line 103
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    iget v2, p1, Lkj4;->q:I

    .line 108
    .line 109
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 110
    .line 111
    .line 112
    move-result-object v2

    .line 113
    invoke-virtual {v0, v1, v2, v3}, Lpm3;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lpm3;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    iget-boolean v1, p0, Lkj4;->y:Z

    .line 118
    .line 119
    iget-boolean v2, p1, Lkj4;->y:Z

    .line 120
    .line 121
    invoke-virtual {v0, v1, v2}, Lpm3;->d(ZZ)Lpm3;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    iget-boolean v2, p0, Lkj4;->z:Z

    .line 126
    .line 127
    iget-boolean v3, p1, Lkj4;->z:Z

    .line 128
    .line 129
    invoke-virtual {v0, v2, v3}, Lpm3;->d(ZZ)Lpm3;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    if-eqz v1, :cond_0

    .line 134
    .line 135
    if-eqz v2, :cond_0

    .line 136
    .line 137
    iget p0, p0, Lkj4;->A:I

    .line 138
    .line 139
    iget p1, p1, Lkj4;->A:I

    .line 140
    .line 141
    invoke-virtual {v0, p0, p1}, Lpm3;->b(II)Lpm3;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    :cond_0
    invoke-virtual {v0}, Lpm3;->e()I

    .line 146
    .line 147
    .line 148
    move-result p0

    .line 149
    return p0
.end method

.method public static d(Lkj4;Lkj4;)I
    .locals 3

    .line 1
    iget-boolean v0, p0, Lkj4;->j:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-boolean v0, p0, Lkj4;->m:Z

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    sget-object v0, Llj4;->k:Lmm3;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    new-instance v0, Lzn3;

    .line 13
    .line 14
    invoke-direct {v0}, Lzn3;-><init>()V

    .line 15
    .line 16
    .line 17
    :goto_0
    iget-object v1, p0, Lkj4;->k:Ldj4;

    .line 18
    .line 19
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    iget v1, p0, Lkj4;->p:I

    .line 23
    .line 24
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    iget v2, p1, Lkj4;->p:I

    .line 29
    .line 30
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    invoke-interface {v0, v1, v2}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    invoke-static {v1}, Lnm3;->f(I)Lpm3;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    iget p0, p0, Lkj4;->o:I

    .line 43
    .line 44
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    iget p1, p1, Lkj4;->o:I

    .line 49
    .line 50
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    invoke-virtual {v1, p0, p1, v0}, Lpm3;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lpm3;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    invoke-virtual {p0}, Lpm3;->e()I

    .line 59
    .line 60
    .line 61
    move-result p0

    .line 62
    return p0
.end method


# virtual methods
.method public final a()I
    .locals 1

    .line 1
    iget v0, p0, Lkj4;->x:I

    .line 2
    .line 3
    return v0
.end method

.method public final bridge synthetic b(Ljj4;)Z
    .locals 2

    .line 1
    check-cast p1, Lkj4;

    .line 2
    .line 3
    iget-object v0, p0, Ljj4;->i:Lph4;

    .line 4
    .line 5
    iget-object v0, v0, Lph4;->m:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v1, p1, Ljj4;->i:Lph4;

    .line 8
    .line 9
    iget-object v1, v1, Lph4;->m:Ljava/lang/String;

    .line 10
    .line 11
    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    iget-object v0, p0, Lkj4;->k:Ldj4;

    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    iget-boolean v0, p0, Lkj4;->y:Z

    .line 23
    .line 24
    iget-boolean v1, p1, Lkj4;->y:Z

    .line 25
    .line 26
    if-ne v0, v1, :cond_0

    .line 27
    .line 28
    iget-boolean v0, p0, Lkj4;->z:Z

    .line 29
    .line 30
    iget-boolean p1, p1, Lkj4;->z:Z

    .line 31
    .line 32
    if-ne v0, p1, :cond_0

    .line 33
    .line 34
    const/4 p1, 0x1

    .line 35
    return p1

    .line 36
    :cond_0
    const/4 p1, 0x0

    .line 37
    return p1
.end method
