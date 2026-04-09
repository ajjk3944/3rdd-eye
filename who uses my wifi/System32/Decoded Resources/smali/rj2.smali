.class public final Lrj2;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lg62;


# instance fields
.field public final f:Landroid/content/Context;

.field public final g:Lmv1;

.field public final h:Landroid/os/PowerManager;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lmv1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lrj2;->f:Landroid/content/Context;

    .line 5
    .line 6
    iput-object p2, p0, Lrj2;->g:Lmv1;

    .line 7
    .line 8
    const-string p2, "power"

    .line 9
    .line 10
    invoke-virtual {p1, p2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Landroid/os/PowerManager;

    .line 15
    .line 16
    iput-object p1, p0, Lrj2;->h:Landroid/os/PowerManager;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final a(Lwj2;)Lorg/json/JSONObject;
    .locals 14

    .line 1
    const-string v0, "right"

    .line 2
    .line 3
    const-string v1, "left"

    .line 4
    .line 5
    const-string v2, "bottom"

    .line 6
    .line 7
    const-string v3, "top"

    .line 8
    .line 9
    new-instance v4, Lorg/json/JSONArray;

    .line 10
    .line 11
    invoke-direct {v4}, Lorg/json/JSONArray;-><init>()V

    .line 12
    .line 13
    .line 14
    new-instance v5, Lorg/json/JSONObject;

    .line 15
    .line 16
    invoke-direct {v5}, Lorg/json/JSONObject;-><init>()V

    .line 17
    .line 18
    .line 19
    iget-object v6, p1, Lwj2;->e:Lnv1;

    .line 20
    .line 21
    if-nez v6, :cond_0

    .line 22
    .line 23
    new-instance p1, Lorg/json/JSONObject;

    .line 24
    .line 25
    invoke-direct {p1}, Lorg/json/JSONObject;-><init>()V

    .line 26
    .line 27
    .line 28
    goto/16 :goto_1

    .line 29
    .line 30
    :cond_0
    iget-object v7, p0, Lrj2;->g:Lmv1;

    .line 31
    .line 32
    iget-object v8, v7, Lmv1;->b:Lorg/json/JSONObject;

    .line 33
    .line 34
    if-eqz v8, :cond_4

    .line 35
    .line 36
    iget-boolean v8, v6, Lnv1;->a:Z

    .line 37
    .line 38
    new-instance v9, Lorg/json/JSONObject;

    .line 39
    .line 40
    invoke-direct {v9}, Lorg/json/JSONObject;-><init>()V

    .line 41
    .line 42
    .line 43
    iget-object v10, v7, Lmv1;->d:Ljava/lang/String;

    .line 44
    .line 45
    const-string v11, "afmaVersion"

    .line 46
    .line 47
    invoke-virtual {v9, v11, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 48
    .line 49
    .line 50
    move-result-object v10

    .line 51
    iget-object v11, v7, Lmv1;->b:Lorg/json/JSONObject;

    .line 52
    .line 53
    const-string v12, "activeViewJSON"

    .line 54
    .line 55
    invoke-virtual {v10, v12, v11}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 56
    .line 57
    .line 58
    move-result-object v10

    .line 59
    iget-wide v11, p1, Lwj2;->c:J

    .line 60
    .line 61
    const-string v13, "timestamp"

    .line 62
    .line 63
    invoke-virtual {v10, v13, v11, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 64
    .line 65
    .line 66
    move-result-object v10

    .line 67
    iget-object v11, v7, Lmv1;->a:Ljava/lang/String;

    .line 68
    .line 69
    const-string v12, "adFormat"

    .line 70
    .line 71
    invoke-virtual {v10, v12, v11}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 72
    .line 73
    .line 74
    move-result-object v10

    .line 75
    iget-object v11, v7, Lmv1;->c:Ljava/lang/String;

    .line 76
    .line 77
    const-string v12, "hashCode"

    .line 78
    .line 79
    invoke-virtual {v10, v12, v11}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 80
    .line 81
    .line 82
    move-result-object v10

    .line 83
    const-string v11, "isMraid"

    .line 84
    .line 85
    const/4 v12, 0x0

    .line 86
    invoke-virtual {v10, v11, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 87
    .line 88
    .line 89
    move-result-object v10

    .line 90
    const-string v11, "isStopped"

    .line 91
    .line 92
    invoke-virtual {v10, v11, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 93
    .line 94
    .line 95
    move-result-object v10

    .line 96
    iget-boolean v11, p1, Lwj2;->b:Z

    .line 97
    .line 98
    const-string v12, "isPaused"

    .line 99
    .line 100
    invoke-virtual {v10, v12, v11}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 101
    .line 102
    .line 103
    move-result-object v10

    .line 104
    iget-boolean v7, v7, Lmv1;->e:Z

    .line 105
    .line 106
    const-string v11, "isNative"

    .line 107
    .line 108
    invoke-virtual {v10, v11, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 109
    .line 110
    .line 111
    move-result-object v7

    .line 112
    iget-object v10, p0, Lrj2;->h:Landroid/os/PowerManager;

    .line 113
    .line 114
    const-string v11, "isScreenOn"

    .line 115
    .line 116
    invoke-virtual {v10}, Landroid/os/PowerManager;->isInteractive()Z

    .line 117
    .line 118
    .line 119
    move-result v10

    .line 120
    invoke-virtual {v7, v11, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 121
    .line 122
    .line 123
    move-result-object v7

    .line 124
    sget-object v10, Lhg4;->C:Lhg4;

    .line 125
    .line 126
    iget-object v11, v10, Lhg4;->i:Ljd1;

    .line 127
    .line 128
    monitor-enter v11

    .line 129
    :try_start_0
    iget-boolean v12, v11, Ljd1;->a:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 130
    .line 131
    monitor-exit v11

    .line 132
    const-string v11, "appMuted"

    .line 133
    .line 134
    invoke-virtual {v7, v11, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 135
    .line 136
    .line 137
    move-result-object v7

    .line 138
    iget-object v10, v10, Lhg4;->i:Ljd1;

    .line 139
    .line 140
    invoke-virtual {v10}, Ljd1;->a()F

    .line 141
    .line 142
    .line 143
    move-result v10

    .line 144
    float-to-double v10, v10

    .line 145
    const-string v12, "appVolume"

    .line 146
    .line 147
    invoke-virtual {v7, v12, v10, v11}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 148
    .line 149
    .line 150
    move-result-object v7

    .line 151
    iget-object v10, p0, Lrj2;->f:Landroid/content/Context;

    .line 152
    .line 153
    invoke-virtual {v10}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 154
    .line 155
    .line 156
    move-result-object v11

    .line 157
    invoke-static {v11}, Ljd1;->b(Landroid/content/Context;)F

    .line 158
    .line 159
    .line 160
    move-result v11

    .line 161
    float-to-double v11, v11

    .line 162
    const-string v13, "deviceVolume"

    .line 163
    .line 164
    invoke-virtual {v7, v13, v11, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 165
    .line 166
    .line 167
    invoke-virtual {v10}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 168
    .line 169
    .line 170
    move-result-object v7

    .line 171
    invoke-virtual {v7}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 172
    .line 173
    .line 174
    move-result-object v7

    .line 175
    iget v10, v6, Lnv1;->b:I

    .line 176
    .line 177
    const-string v11, "windowVisibility"

    .line 178
    .line 179
    invoke-virtual {v9, v11, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 180
    .line 181
    .line 182
    move-result-object v10

    .line 183
    const-string v11, "isAttachedToWindow"

    .line 184
    .line 185
    invoke-virtual {v10, v11, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 186
    .line 187
    .line 188
    move-result-object v8

    .line 189
    new-instance v10, Lorg/json/JSONObject;

    .line 190
    .line 191
    invoke-direct {v10}, Lorg/json/JSONObject;-><init>()V

    .line 192
    .line 193
    .line 194
    iget-object v11, v6, Lnv1;->c:Landroid/graphics/Rect;

    .line 195
    .line 196
    iget v12, v11, Landroid/graphics/Rect;->top:I

    .line 197
    .line 198
    invoke-virtual {v10, v3, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 199
    .line 200
    .line 201
    move-result-object v10

    .line 202
    iget v12, v11, Landroid/graphics/Rect;->bottom:I

    .line 203
    .line 204
    invoke-virtual {v10, v2, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 205
    .line 206
    .line 207
    move-result-object v10

    .line 208
    iget v12, v11, Landroid/graphics/Rect;->left:I

    .line 209
    .line 210
    invoke-virtual {v10, v1, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 211
    .line 212
    .line 213
    move-result-object v10

    .line 214
    iget v11, v11, Landroid/graphics/Rect;->right:I

    .line 215
    .line 216
    invoke-virtual {v10, v0, v11}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 217
    .line 218
    .line 219
    move-result-object v10

    .line 220
    const-string v11, "viewBox"

    .line 221
    .line 222
    invoke-virtual {v8, v11, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 223
    .line 224
    .line 225
    move-result-object v8

    .line 226
    new-instance v10, Lorg/json/JSONObject;

    .line 227
    .line 228
    invoke-direct {v10}, Lorg/json/JSONObject;-><init>()V

    .line 229
    .line 230
    .line 231
    iget-object v11, v6, Lnv1;->d:Landroid/graphics/Rect;

    .line 232
    .line 233
    iget v12, v11, Landroid/graphics/Rect;->top:I

    .line 234
    .line 235
    invoke-virtual {v10, v3, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 236
    .line 237
    .line 238
    move-result-object v10

    .line 239
    iget v12, v11, Landroid/graphics/Rect;->bottom:I

    .line 240
    .line 241
    invoke-virtual {v10, v2, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 242
    .line 243
    .line 244
    move-result-object v10

    .line 245
    iget v12, v11, Landroid/graphics/Rect;->left:I

    .line 246
    .line 247
    invoke-virtual {v10, v1, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 248
    .line 249
    .line 250
    move-result-object v10

    .line 251
    iget v11, v11, Landroid/graphics/Rect;->right:I

    .line 252
    .line 253
    invoke-virtual {v10, v0, v11}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 254
    .line 255
    .line 256
    move-result-object v10

    .line 257
    const-string v11, "adBox"

    .line 258
    .line 259
    invoke-virtual {v8, v11, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 260
    .line 261
    .line 262
    move-result-object v8

    .line 263
    new-instance v10, Lorg/json/JSONObject;

    .line 264
    .line 265
    invoke-direct {v10}, Lorg/json/JSONObject;-><init>()V

    .line 266
    .line 267
    .line 268
    iget-object v11, v6, Lnv1;->e:Landroid/graphics/Rect;

    .line 269
    .line 270
    iget v12, v11, Landroid/graphics/Rect;->top:I

    .line 271
    .line 272
    invoke-virtual {v10, v3, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 273
    .line 274
    .line 275
    move-result-object v10

    .line 276
    iget v12, v11, Landroid/graphics/Rect;->bottom:I

    .line 277
    .line 278
    invoke-virtual {v10, v2, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 279
    .line 280
    .line 281
    move-result-object v10

    .line 282
    iget v12, v11, Landroid/graphics/Rect;->left:I

    .line 283
    .line 284
    invoke-virtual {v10, v1, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 285
    .line 286
    .line 287
    move-result-object v10

    .line 288
    iget v11, v11, Landroid/graphics/Rect;->right:I

    .line 289
    .line 290
    invoke-virtual {v10, v0, v11}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 291
    .line 292
    .line 293
    move-result-object v10

    .line 294
    const-string v11, "globalVisibleBox"

    .line 295
    .line 296
    invoke-virtual {v8, v11, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 297
    .line 298
    .line 299
    move-result-object v8

    .line 300
    iget-boolean v10, v6, Lnv1;->f:Z

    .line 301
    .line 302
    const-string v11, "globalVisibleBoxVisible"

    .line 303
    .line 304
    invoke-virtual {v8, v11, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 305
    .line 306
    .line 307
    move-result-object v8

    .line 308
    new-instance v10, Lorg/json/JSONObject;

    .line 309
    .line 310
    invoke-direct {v10}, Lorg/json/JSONObject;-><init>()V

    .line 311
    .line 312
    .line 313
    iget-object v11, v6, Lnv1;->g:Landroid/graphics/Rect;

    .line 314
    .line 315
    iget v12, v11, Landroid/graphics/Rect;->top:I

    .line 316
    .line 317
    invoke-virtual {v10, v3, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 318
    .line 319
    .line 320
    move-result-object v10

    .line 321
    iget v12, v11, Landroid/graphics/Rect;->bottom:I

    .line 322
    .line 323
    invoke-virtual {v10, v2, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 324
    .line 325
    .line 326
    move-result-object v10

    .line 327
    iget v12, v11, Landroid/graphics/Rect;->left:I

    .line 328
    .line 329
    invoke-virtual {v10, v1, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 330
    .line 331
    .line 332
    move-result-object v10

    .line 333
    iget v11, v11, Landroid/graphics/Rect;->right:I

    .line 334
    .line 335
    invoke-virtual {v10, v0, v11}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 336
    .line 337
    .line 338
    move-result-object v10

    .line 339
    const-string v11, "localVisibleBox"

    .line 340
    .line 341
    invoke-virtual {v8, v11, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 342
    .line 343
    .line 344
    move-result-object v8

    .line 345
    iget-boolean v10, v6, Lnv1;->h:Z

    .line 346
    .line 347
    const-string v11, "localVisibleBoxVisible"

    .line 348
    .line 349
    invoke-virtual {v8, v11, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 350
    .line 351
    .line 352
    move-result-object v8

    .line 353
    new-instance v10, Lorg/json/JSONObject;

    .line 354
    .line 355
    invoke-direct {v10}, Lorg/json/JSONObject;-><init>()V

    .line 356
    .line 357
    .line 358
    iget-object v11, v6, Lnv1;->i:Landroid/graphics/Rect;

    .line 359
    .line 360
    iget v12, v11, Landroid/graphics/Rect;->top:I

    .line 361
    .line 362
    invoke-virtual {v10, v3, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 363
    .line 364
    .line 365
    move-result-object v10

    .line 366
    iget v12, v11, Landroid/graphics/Rect;->bottom:I

    .line 367
    .line 368
    invoke-virtual {v10, v2, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 369
    .line 370
    .line 371
    move-result-object v10

    .line 372
    iget v12, v11, Landroid/graphics/Rect;->left:I

    .line 373
    .line 374
    invoke-virtual {v10, v1, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 375
    .line 376
    .line 377
    move-result-object v10

    .line 378
    iget v11, v11, Landroid/graphics/Rect;->right:I

    .line 379
    .line 380
    invoke-virtual {v10, v0, v11}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 381
    .line 382
    .line 383
    move-result-object v10

    .line 384
    const-string v11, "hitBox"

    .line 385
    .line 386
    invoke-virtual {v8, v11, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 387
    .line 388
    .line 389
    move-result-object v8

    .line 390
    iget v7, v7, Landroid/util/DisplayMetrics;->density:F

    .line 391
    .line 392
    float-to-double v10, v7

    .line 393
    const-string v7, "screenDensity"

    .line 394
    .line 395
    invoke-virtual {v8, v7, v10, v11}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 396
    .line 397
    .line 398
    iget-boolean v7, p1, Lwj2;->a:Z

    .line 399
    .line 400
    const-string v8, "isVisible"

    .line 401
    .line 402
    invoke-virtual {v9, v8, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 403
    .line 404
    .line 405
    sget-object v7, Lmz1;->y1:Liz1;

    .line 406
    .line 407
    sget-object v8, Ltw1;->e:Ltw1;

    .line 408
    .line 409
    iget-object v8, v8, Ltw1;->c:Lkz1;

    .line 410
    .line 411
    invoke-virtual {v8, v7}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 412
    .line 413
    .line 414
    move-result-object v7

    .line 415
    check-cast v7, Ljava/lang/Boolean;

    .line 416
    .line 417
    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    .line 418
    .line 419
    .line 420
    move-result v7

    .line 421
    if-eqz v7, :cond_2

    .line 422
    .line 423
    new-instance v7, Lorg/json/JSONArray;

    .line 424
    .line 425
    invoke-direct {v7}, Lorg/json/JSONArray;-><init>()V

    .line 426
    .line 427
    .line 428
    iget-object v6, v6, Lnv1;->k:Ljava/util/List;

    .line 429
    .line 430
    if-eqz v6, :cond_1

    .line 431
    .line 432
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 433
    .line 434
    .line 435
    move-result-object v6

    .line 436
    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 437
    .line 438
    .line 439
    move-result v8

    .line 440
    if-eqz v8, :cond_1

    .line 441
    .line 442
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 443
    .line 444
    .line 445
    move-result-object v8

    .line 446
    check-cast v8, Landroid/graphics/Rect;

    .line 447
    .line 448
    new-instance v10, Lorg/json/JSONObject;

    .line 449
    .line 450
    invoke-direct {v10}, Lorg/json/JSONObject;-><init>()V

    .line 451
    .line 452
    .line 453
    iget v11, v8, Landroid/graphics/Rect;->top:I

    .line 454
    .line 455
    invoke-virtual {v10, v3, v11}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 456
    .line 457
    .line 458
    move-result-object v10

    .line 459
    iget v11, v8, Landroid/graphics/Rect;->bottom:I

    .line 460
    .line 461
    invoke-virtual {v10, v2, v11}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 462
    .line 463
    .line 464
    move-result-object v10

    .line 465
    iget v11, v8, Landroid/graphics/Rect;->left:I

    .line 466
    .line 467
    invoke-virtual {v10, v1, v11}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 468
    .line 469
    .line 470
    move-result-object v10

    .line 471
    iget v8, v8, Landroid/graphics/Rect;->right:I

    .line 472
    .line 473
    invoke-virtual {v10, v0, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 474
    .line 475
    .line 476
    move-result-object v8

    .line 477
    invoke-virtual {v7, v8}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 478
    .line 479
    .line 480
    goto :goto_0

    .line 481
    :cond_1
    const-string v0, "scrollableContainerBoxes"

    .line 482
    .line 483
    invoke-virtual {v9, v0, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 484
    .line 485
    .line 486
    :cond_2
    iget-object p1, p1, Lwj2;->d:Ljava/lang/String;

    .line 487
    .line 488
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 489
    .line 490
    .line 491
    move-result p1

    .line 492
    if-nez p1, :cond_3

    .line 493
    .line 494
    const-string p1, "doneReasonCode"

    .line 495
    .line 496
    const-string v0, "u"

    .line 497
    .line 498
    invoke-virtual {v9, p1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 499
    .line 500
    .line 501
    :cond_3
    move-object p1, v9

    .line 502
    :goto_1
    invoke-virtual {v4, p1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 503
    .line 504
    .line 505
    const-string p1, "units"

    .line 506
    .line 507
    invoke-virtual {v5, p1, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 508
    .line 509
    .line 510
    return-object v5

    .line 511
    :catchall_0
    move-exception p1

    .line 512
    :try_start_1
    monitor-exit v11
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 513
    throw p1

    .line 514
    :cond_4
    new-instance p1, Lorg/json/JSONException;

    .line 515
    .line 516
    const-string v0, "Active view Info cannot be null."

    .line 517
    .line 518
    invoke-direct {p1, v0}, Lorg/json/JSONException;-><init>(Ljava/lang/String;)V

    .line 519
    .line 520
    .line 521
    throw p1
.end method

.method public final bridge synthetic p(Ljava/lang/Object;)Lorg/json/JSONObject;
    .locals 0

    .line 1
    check-cast p1, Lwj2;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lrj2;->a(Lwj2;)Lorg/json/JSONObject;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method
