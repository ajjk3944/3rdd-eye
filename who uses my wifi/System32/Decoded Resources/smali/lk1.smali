.class public final synthetic Llk1;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lnp2;
.implements Lks2;


# instance fields
.field public final synthetic f:I

.field public g:I

.field public h:J

.field public i:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>()V
    .locals 1

    .line 1
    const/4 v0, 0x2

    iput v0, p0, Llk1;->f:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lad4;IJJ)V
    .locals 0

    const/4 p5, 0x1

    iput p5, p0, Llk1;->f:I

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llk1;->i:Ljava/lang/Object;

    iput p2, p0, Llk1;->g:I

    iput-wide p3, p0, Llk1;->h:J

    return-void
.end method

.method public synthetic constructor <init>(Lmk1;JI)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Llk1;->f:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llk1;->i:Ljava/lang/Object;

    iput-wide p2, p0, Llk1;->h:J

    iput p4, p0, Llk1;->g:I

    return-void
.end method


# virtual methods
.method public c(Ljava/lang/Object;)V
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Llk1;->f:I

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    move-object/from16 v1, p1

    .line 9
    .line 10
    check-cast v1, Lbd4;

    .line 11
    .line 12
    iget-object v2, v0, Llk1;->i:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v2, Lad4;

    .line 15
    .line 16
    iget v3, v0, Llk1;->g:I

    .line 17
    .line 18
    iget-wide v4, v0, Llk1;->h:J

    .line 19
    .line 20
    invoke-interface {v1, v2, v3, v4, v5}, Lbd4;->i(Lad4;IJ)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :pswitch_0
    iget-object v1, v0, Llk1;->i:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v1, Lmk1;

    .line 27
    .line 28
    iget-wide v2, v0, Llk1;->h:J

    .line 29
    .line 30
    iget v4, v0, Llk1;->g:I

    .line 31
    .line 32
    move-object/from16 v5, p1

    .line 33
    .line 34
    check-cast v5, Lgk1;

    .line 35
    .line 36
    iget-object v6, v1, Lmk1;->h:Lph4;

    .line 37
    .line 38
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    iget-object v6, v5, Lgk1;->a:Lxm3;

    .line 42
    .line 43
    iget-wide v7, v5, Lgk1;->c:J

    .line 44
    .line 45
    new-instance v9, Ljava/util/ArrayList;

    .line 46
    .line 47
    invoke-interface {v6}, Ljava/util/Collection;->size()I

    .line 48
    .line 49
    .line 50
    move-result v10

    .line 51
    invoke-direct {v9, v10}, Ljava/util/ArrayList;-><init>(I)V

    .line 52
    .line 53
    .line 54
    const/4 v10, 0x0

    .line 55
    invoke-virtual {v6, v10}, Lxm3;->p(I)Lvm3;

    .line 56
    .line 57
    .line 58
    move-result-object v6

    .line 59
    :goto_0
    invoke-virtual {v6}, Lql3;->hasNext()Z

    .line 60
    .line 61
    .line 62
    move-result v11

    .line 63
    if-eqz v11, :cond_7

    .line 64
    .line 65
    invoke-virtual {v6}, Lql3;->next()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v11

    .line 69
    check-cast v11, Lfi2;

    .line 70
    .line 71
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    new-instance v13, Landroid/os/Bundle;

    .line 75
    .line 76
    invoke-direct {v13}, Landroid/os/Bundle;-><init>()V

    .line 77
    .line 78
    .line 79
    iget-object v14, v11, Lfi2;->a:Ljava/lang/CharSequence;

    .line 80
    .line 81
    if-eqz v14, :cond_4

    .line 82
    .line 83
    sget-object v15, Lfi2;->q:Ljava/lang/String;

    .line 84
    .line 85
    invoke-virtual {v13, v15, v14}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    .line 86
    .line 87
    .line 88
    instance-of v15, v14, Landroid/text/Spanned;

    .line 89
    .line 90
    if-eqz v15, :cond_4

    .line 91
    .line 92
    check-cast v14, Landroid/text/Spanned;

    .line 93
    .line 94
    sget-object v15, Ldj2;->a:Ljava/lang/String;

    .line 95
    .line 96
    new-instance v15, Ljava/util/ArrayList;

    .line 97
    .line 98
    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    .line 99
    .line 100
    .line 101
    invoke-interface {v14}, Ljava/lang/CharSequence;->length()I

    .line 102
    .line 103
    .line 104
    move-result v12

    .line 105
    const-class v0, Lck2;

    .line 106
    .line 107
    invoke-interface {v14, v10, v12, v0}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    check-cast v0, [Lck2;

    .line 112
    .line 113
    array-length v12, v0

    .line 114
    :goto_1
    if-ge v10, v12, :cond_0

    .line 115
    .line 116
    move-object/from16 v16, v0

    .line 117
    .line 118
    aget-object v0, v16, v10

    .line 119
    .line 120
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 121
    .line 122
    .line 123
    move-wide/from16 v17, v2

    .line 124
    .line 125
    new-instance v2, Landroid/os/Bundle;

    .line 126
    .line 127
    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 128
    .line 129
    .line 130
    sget-object v3, Lck2;->c:Ljava/lang/String;

    .line 131
    .line 132
    move/from16 v19, v4

    .line 133
    .line 134
    iget-object v4, v0, Lck2;->a:Ljava/lang/String;

    .line 135
    .line 136
    invoke-virtual {v2, v3, v4}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    sget-object v3, Lck2;->d:Ljava/lang/String;

    .line 140
    .line 141
    iget v4, v0, Lck2;->b:I

    .line 142
    .line 143
    invoke-virtual {v2, v3, v4}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 144
    .line 145
    .line 146
    const/4 v3, 0x1

    .line 147
    invoke-static {v14, v0, v3, v2}, Ldj2;->a(Landroid/text/Spanned;Ljava/lang/Object;ILandroid/os/Bundle;)Landroid/os/Bundle;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    invoke-virtual {v15, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 152
    .line 153
    .line 154
    add-int/lit8 v10, v10, 0x1

    .line 155
    .line 156
    move-object/from16 v0, v16

    .line 157
    .line 158
    move-wide/from16 v2, v17

    .line 159
    .line 160
    move/from16 v4, v19

    .line 161
    .line 162
    goto :goto_1

    .line 163
    :cond_0
    move-wide/from16 v17, v2

    .line 164
    .line 165
    move/from16 v19, v4

    .line 166
    .line 167
    invoke-interface {v14}, Ljava/lang/CharSequence;->length()I

    .line 168
    .line 169
    .line 170
    move-result v0

    .line 171
    const-class v2, Ltk2;

    .line 172
    .line 173
    const/4 v3, 0x0

    .line 174
    invoke-interface {v14, v3, v0, v2}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    check-cast v0, [Ltk2;

    .line 179
    .line 180
    array-length v2, v0

    .line 181
    const/4 v3, 0x0

    .line 182
    :goto_2
    if-ge v3, v2, :cond_1

    .line 183
    .line 184
    aget-object v4, v0, v3

    .line 185
    .line 186
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 187
    .line 188
    .line 189
    new-instance v10, Landroid/os/Bundle;

    .line 190
    .line 191
    invoke-direct {v10}, Landroid/os/Bundle;-><init>()V

    .line 192
    .line 193
    .line 194
    sget-object v12, Ltk2;->d:Ljava/lang/String;

    .line 195
    .line 196
    move-object/from16 p1, v0

    .line 197
    .line 198
    iget v0, v4, Ltk2;->a:I

    .line 199
    .line 200
    invoke-virtual {v10, v12, v0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 201
    .line 202
    .line 203
    sget-object v0, Ltk2;->e:Ljava/lang/String;

    .line 204
    .line 205
    iget v12, v4, Ltk2;->b:I

    .line 206
    .line 207
    invoke-virtual {v10, v0, v12}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 208
    .line 209
    .line 210
    sget-object v0, Ltk2;->f:Ljava/lang/String;

    .line 211
    .line 212
    iget v12, v4, Ltk2;->c:I

    .line 213
    .line 214
    invoke-virtual {v10, v0, v12}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 215
    .line 216
    .line 217
    const/4 v0, 0x2

    .line 218
    invoke-static {v14, v4, v0, v10}, Ldj2;->a(Landroid/text/Spanned;Ljava/lang/Object;ILandroid/os/Bundle;)Landroid/os/Bundle;

    .line 219
    .line 220
    .line 221
    move-result-object v0

    .line 222
    invoke-virtual {v15, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 223
    .line 224
    .line 225
    add-int/lit8 v3, v3, 0x1

    .line 226
    .line 227
    move-object/from16 v0, p1

    .line 228
    .line 229
    goto :goto_2

    .line 230
    :cond_1
    invoke-interface {v14}, Ljava/lang/CharSequence;->length()I

    .line 231
    .line 232
    .line 233
    move-result v0

    .line 234
    const-class v2, Lvj2;

    .line 235
    .line 236
    const/4 v3, 0x0

    .line 237
    invoke-interface {v14, v3, v0, v2}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    move-result-object v0

    .line 241
    check-cast v0, [Lvj2;

    .line 242
    .line 243
    array-length v2, v0

    .line 244
    const/4 v3, 0x0

    .line 245
    :goto_3
    if-ge v3, v2, :cond_2

    .line 246
    .line 247
    aget-object v4, v0, v3

    .line 248
    .line 249
    const/4 v10, 0x3

    .line 250
    const/4 v12, 0x0

    .line 251
    invoke-static {v14, v4, v10, v12}, Ldj2;->a(Landroid/text/Spanned;Ljava/lang/Object;ILandroid/os/Bundle;)Landroid/os/Bundle;

    .line 252
    .line 253
    .line 254
    move-result-object v4

    .line 255
    invoke-virtual {v15, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 256
    .line 257
    .line 258
    add-int/lit8 v3, v3, 0x1

    .line 259
    .line 260
    goto :goto_3

    .line 261
    :cond_2
    invoke-interface {v14}, Ljava/lang/CharSequence;->length()I

    .line 262
    .line 263
    .line 264
    move-result v0

    .line 265
    const-class v2, Lil2;

    .line 266
    .line 267
    const/4 v3, 0x0

    .line 268
    invoke-interface {v14, v3, v0, v2}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    .line 269
    .line 270
    .line 271
    move-result-object v0

    .line 272
    check-cast v0, [Lil2;

    .line 273
    .line 274
    array-length v2, v0

    .line 275
    const/4 v3, 0x0

    .line 276
    :goto_4
    if-ge v3, v2, :cond_3

    .line 277
    .line 278
    aget-object v4, v0, v3

    .line 279
    .line 280
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 281
    .line 282
    .line 283
    new-instance v10, Landroid/os/Bundle;

    .line 284
    .line 285
    invoke-direct {v10}, Landroid/os/Bundle;-><init>()V

    .line 286
    .line 287
    .line 288
    sget-object v12, Lil2;->b:Ljava/lang/String;

    .line 289
    .line 290
    move-object/from16 p1, v0

    .line 291
    .line 292
    iget-object v0, v4, Lil2;->a:Ljava/lang/String;

    .line 293
    .line 294
    invoke-virtual {v10, v12, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 295
    .line 296
    .line 297
    const/4 v0, 0x4

    .line 298
    invoke-static {v14, v4, v0, v10}, Ldj2;->a(Landroid/text/Spanned;Ljava/lang/Object;ILandroid/os/Bundle;)Landroid/os/Bundle;

    .line 299
    .line 300
    .line 301
    move-result-object v0

    .line 302
    invoke-virtual {v15, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 303
    .line 304
    .line 305
    add-int/lit8 v3, v3, 0x1

    .line 306
    .line 307
    move-object/from16 v0, p1

    .line 308
    .line 309
    goto :goto_4

    .line 310
    :cond_3
    invoke-virtual {v15}, Ljava/util/ArrayList;->isEmpty()Z

    .line 311
    .line 312
    .line 313
    move-result v0

    .line 314
    if-nez v0, :cond_5

    .line 315
    .line 316
    sget-object v0, Lfi2;->r:Ljava/lang/String;

    .line 317
    .line 318
    invoke-virtual {v13, v0, v15}, Landroid/os/Bundle;->putParcelableArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 319
    .line 320
    .line 321
    goto :goto_5

    .line 322
    :cond_4
    move-wide/from16 v17, v2

    .line 323
    .line 324
    move/from16 v19, v4

    .line 325
    .line 326
    :cond_5
    :goto_5
    iget-object v0, v11, Lfi2;->b:Landroid/text/Layout$Alignment;

    .line 327
    .line 328
    sget-object v2, Lfi2;->s:Ljava/lang/String;

    .line 329
    .line 330
    invoke-virtual {v13, v2, v0}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    .line 331
    .line 332
    .line 333
    iget-object v0, v11, Lfi2;->c:Landroid/text/Layout$Alignment;

    .line 334
    .line 335
    sget-object v2, Lfi2;->t:Ljava/lang/String;

    .line 336
    .line 337
    invoke-virtual {v13, v2, v0}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    .line 338
    .line 339
    .line 340
    iget v0, v11, Lfi2;->e:F

    .line 341
    .line 342
    sget-object v2, Lfi2;->v:Ljava/lang/String;

    .line 343
    .line 344
    invoke-virtual {v13, v2, v0}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    .line 345
    .line 346
    .line 347
    iget v0, v11, Lfi2;->f:I

    .line 348
    .line 349
    sget-object v2, Lfi2;->w:Ljava/lang/String;

    .line 350
    .line 351
    invoke-virtual {v13, v2, v0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 352
    .line 353
    .line 354
    iget v0, v11, Lfi2;->g:I

    .line 355
    .line 356
    sget-object v2, Lfi2;->x:Ljava/lang/String;

    .line 357
    .line 358
    invoke-virtual {v13, v2, v0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 359
    .line 360
    .line 361
    iget v0, v11, Lfi2;->h:F

    .line 362
    .line 363
    sget-object v2, Lfi2;->y:Ljava/lang/String;

    .line 364
    .line 365
    invoke-virtual {v13, v2, v0}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    .line 366
    .line 367
    .line 368
    iget v0, v11, Lfi2;->i:I

    .line 369
    .line 370
    sget-object v2, Lfi2;->z:Ljava/lang/String;

    .line 371
    .line 372
    invoke-virtual {v13, v2, v0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 373
    .line 374
    .line 375
    iget v0, v11, Lfi2;->l:I

    .line 376
    .line 377
    sget-object v2, Lfi2;->A:Ljava/lang/String;

    .line 378
    .line 379
    invoke-virtual {v13, v2, v0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 380
    .line 381
    .line 382
    iget v0, v11, Lfi2;->m:F

    .line 383
    .line 384
    sget-object v2, Lfi2;->B:Ljava/lang/String;

    .line 385
    .line 386
    invoke-virtual {v13, v2, v0}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    .line 387
    .line 388
    .line 389
    iget v0, v11, Lfi2;->j:F

    .line 390
    .line 391
    sget-object v2, Lfi2;->C:Ljava/lang/String;

    .line 392
    .line 393
    invoke-virtual {v13, v2, v0}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    .line 394
    .line 395
    .line 396
    iget v0, v11, Lfi2;->k:F

    .line 397
    .line 398
    sget-object v2, Lfi2;->D:Ljava/lang/String;

    .line 399
    .line 400
    invoke-virtual {v13, v2, v0}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    .line 401
    .line 402
    .line 403
    sget-object v0, Lfi2;->F:Ljava/lang/String;

    .line 404
    .line 405
    const/4 v3, 0x0

    .line 406
    invoke-virtual {v13, v0, v3}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 407
    .line 408
    .line 409
    sget-object v0, Lfi2;->E:Ljava/lang/String;

    .line 410
    .line 411
    const/high16 v2, -0x1000000

    .line 412
    .line 413
    invoke-virtual {v13, v0, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 414
    .line 415
    .line 416
    iget v0, v11, Lfi2;->n:I

    .line 417
    .line 418
    sget-object v2, Lfi2;->G:Ljava/lang/String;

    .line 419
    .line 420
    invoke-virtual {v13, v2, v0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 421
    .line 422
    .line 423
    iget v0, v11, Lfi2;->o:F

    .line 424
    .line 425
    sget-object v2, Lfi2;->H:Ljava/lang/String;

    .line 426
    .line 427
    invoke-virtual {v13, v2, v0}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    .line 428
    .line 429
    .line 430
    iget v0, v11, Lfi2;->p:I

    .line 431
    .line 432
    sget-object v2, Lfi2;->I:Ljava/lang/String;

    .line 433
    .line 434
    invoke-virtual {v13, v2, v0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 435
    .line 436
    .line 437
    iget-object v0, v11, Lfi2;->d:Landroid/graphics/Bitmap;

    .line 438
    .line 439
    if-eqz v0, :cond_6

    .line 440
    .line 441
    new-instance v2, Ljava/io/ByteArrayOutputStream;

    .line 442
    .line 443
    invoke-direct {v2}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 444
    .line 445
    .line 446
    sget-object v3, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;

    .line 447
    .line 448
    const/4 v4, 0x0

    .line 449
    invoke-virtual {v0, v3, v4, v2}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    .line 450
    .line 451
    .line 452
    move-result v0

    .line 453
    invoke-static {v0}, Lzt0;->b0(Z)V

    .line 454
    .line 455
    .line 456
    sget-object v0, Lfi2;->u:Ljava/lang/String;

    .line 457
    .line 458
    invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 459
    .line 460
    .line 461
    move-result-object v2

    .line 462
    invoke-virtual {v13, v0, v2}, Landroid/os/Bundle;->putByteArray(Ljava/lang/String;[B)V

    .line 463
    .line 464
    .line 465
    :cond_6
    invoke-virtual {v9, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 466
    .line 467
    .line 468
    move-object/from16 v0, p0

    .line 469
    .line 470
    move-wide/from16 v2, v17

    .line 471
    .line 472
    move/from16 v4, v19

    .line 473
    .line 474
    const/4 v10, 0x0

    .line 475
    goto/16 :goto_0

    .line 476
    .line 477
    :cond_7
    move-wide/from16 v17, v2

    .line 478
    .line 479
    move/from16 v19, v4

    .line 480
    .line 481
    new-instance v0, Landroid/os/Bundle;

    .line 482
    .line 483
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 484
    .line 485
    .line 486
    const-string v2, "c"

    .line 487
    .line 488
    invoke-virtual {v0, v2, v9}, Landroid/os/Bundle;->putParcelableArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 489
    .line 490
    .line 491
    const-string v2, "d"

    .line 492
    .line 493
    invoke-virtual {v0, v2, v7, v8}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 494
    .line 495
    .line 496
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    .line 497
    .line 498
    .line 499
    move-result-object v2

    .line 500
    invoke-virtual {v2, v0}, Landroid/os/Parcel;->writeBundle(Landroid/os/Bundle;)V

    .line 501
    .line 502
    .line 503
    invoke-virtual {v2}, Landroid/os/Parcel;->marshall()[B

    .line 504
    .line 505
    .line 506
    move-result-object v0

    .line 507
    invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V

    .line 508
    .line 509
    .line 510
    iget-object v2, v1, Lmk1;->c:Lkz2;

    .line 511
    .line 512
    array-length v10, v0

    .line 513
    invoke-virtual {v2, v10, v0}, Lkz2;->z(I[B)V

    .line 514
    .line 515
    .line 516
    iget-object v6, v1, Lmk1;->a:Ljg1;

    .line 517
    .line 518
    const/4 v3, 0x0

    .line 519
    invoke-interface {v6, v2, v10, v3}, Ljg1;->a(Lkz2;II)V

    .line 520
    .line 521
    .line 522
    iget-wide v4, v5, Lgk1;->b:J

    .line 523
    .line 524
    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    cmp-long v0, v4, v7

    .line 530
    .line 531
    const-wide v7, 0x7fffffffffffffffL

    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    if-nez v0, :cond_9

    .line 537
    .line 538
    iget-object v0, v1, Lmk1;->h:Lph4;

    .line 539
    .line 540
    iget-wide v0, v0, Lph4;->r:J

    .line 541
    .line 542
    cmp-long v0, v0, v7

    .line 543
    .line 544
    if-nez v0, :cond_8

    .line 545
    .line 546
    const/4 v3, 0x1

    .line 547
    :cond_8
    invoke-static {v3}, Lzt0;->b0(Z)V

    .line 548
    .line 549
    .line 550
    move-wide/from16 v7, v17

    .line 551
    .line 552
    :goto_6
    const/4 v3, 0x1

    .line 553
    goto :goto_8

    .line 554
    :cond_9
    iget-object v0, v1, Lmk1;->h:Lph4;

    .line 555
    .line 556
    iget-wide v0, v0, Lph4;->r:J

    .line 557
    .line 558
    cmp-long v2, v0, v7

    .line 559
    .line 560
    if-nez v2, :cond_a

    .line 561
    .line 562
    add-long v2, v17, v4

    .line 563
    .line 564
    :goto_7
    move-wide v7, v2

    .line 565
    goto :goto_6

    .line 566
    :cond_a
    add-long v2, v4, v0

    .line 567
    .line 568
    goto :goto_7

    .line 569
    :goto_8
    or-int/lit8 v9, v19, 0x1

    .line 570
    .line 571
    const/4 v11, 0x0

    .line 572
    const/4 v12, 0x0

    .line 573
    invoke-interface/range {v6 .. v12}, Ljg1;->c(JIIILig1;)V

    .line 574
    .line 575
    .line 576
    return-void

    .line 577
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
