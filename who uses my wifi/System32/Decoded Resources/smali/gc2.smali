.class public final Lgc2;
.super Lf74;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final synthetic i:I

.field public final j:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lgc2;->i:I

    const/4 v0, 0x6

    .line 1
    invoke-direct {p0, v0}, Lf74;-><init>(I)V

    iput-object p1, p0, Lgc2;->j:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lgd2;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lgc2;->i:I

    .line 3
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lgc2;->j:Ljava/lang/Object;

    const/4 p1, 0x6

    invoke-direct {p0, p1}, Lf74;-><init>(I)V

    return-void
.end method

.method public synthetic constructor <init>(Ljh1;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lgc2;->i:I

    .line 2
    iput-object p1, p0, Lgc2;->j:Ljava/lang/Object;

    const/4 p1, 0x6

    invoke-direct {p0, p1}, Lf74;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final p1()V
    .locals 10

    .line 1
    iget v0, p0, Lgc2;->i:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lgc2;->j:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Ljh1;

    .line 9
    .line 10
    sget-object v1, Lhg4;->C:Lhg4;

    .line 11
    .line 12
    iget-object v1, v1, Lhg4;->w:Lug0;

    .line 13
    .line 14
    iget-object v2, v0, Ljh1;->h:Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    .line 15
    .line 16
    iget-object v2, v2, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->t:Lzb4;

    .line 17
    .line 18
    iget v2, v2, Lzb4;->k:I

    .line 19
    .line 20
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    iget-object v1, v1, Lug0;->g:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v1, Ljava/util/concurrent/ConcurrentHashMap;

    .line 27
    .line 28
    invoke-virtual {v1, v2}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    check-cast v1, Landroid/graphics/Bitmap;

    .line 33
    .line 34
    if-eqz v1, :cond_2

    .line 35
    .line 36
    iget-object v2, v0, Ljh1;->h:Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    .line 37
    .line 38
    iget-object v2, v2, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->t:Lzb4;

    .line 39
    .line 40
    iget-boolean v3, v2, Lzb4;->i:Z

    .line 41
    .line 42
    iget v2, v2, Lzb4;->j:F

    .line 43
    .line 44
    iget-object v0, v0, Ljh1;->g:Landroid/app/Activity;

    .line 45
    .line 46
    if-eqz v3, :cond_1

    .line 47
    .line 48
    const/4 v3, 0x0

    .line 49
    cmpg-float v3, v2, v3

    .line 50
    .line 51
    if-lez v3, :cond_1

    .line 52
    .line 53
    const/high16 v3, 0x41c80000    # 25.0f

    .line 54
    .line 55
    cmpl-float v3, v2, v3

    .line 56
    .line 57
    if-lez v3, :cond_0

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_0
    :try_start_0
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    .line 61
    .line 62
    .line 63
    move-result v3

    .line 64
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    .line 65
    .line 66
    .line 67
    move-result v4

    .line 68
    const/4 v5, 0x0

    .line 69
    invoke-static {v1, v3, v4, v5}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    invoke-static {v3}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    .line 74
    .line 75
    .line 76
    move-result-object v4

    .line 77
    invoke-static {v0}, Landroid/renderscript/RenderScript;->create(Landroid/content/Context;)Landroid/renderscript/RenderScript;

    .line 78
    .line 79
    .line 80
    move-result-object v5

    .line 81
    invoke-static {v5}, Landroid/renderscript/Element;->U8_4(Landroid/renderscript/RenderScript;)Landroid/renderscript/Element;

    .line 82
    .line 83
    .line 84
    move-result-object v6

    .line 85
    invoke-static {v5, v6}, Landroid/renderscript/ScriptIntrinsicBlur;->create(Landroid/renderscript/RenderScript;Landroid/renderscript/Element;)Landroid/renderscript/ScriptIntrinsicBlur;

    .line 86
    .line 87
    .line 88
    move-result-object v6

    .line 89
    invoke-static {v5, v3}, Landroid/renderscript/Allocation;->createFromBitmap(Landroid/renderscript/RenderScript;Landroid/graphics/Bitmap;)Landroid/renderscript/Allocation;

    .line 90
    .line 91
    .line 92
    move-result-object v3

    .line 93
    invoke-static {v5, v4}, Landroid/renderscript/Allocation;->createFromBitmap(Landroid/renderscript/RenderScript;Landroid/graphics/Bitmap;)Landroid/renderscript/Allocation;

    .line 94
    .line 95
    .line 96
    move-result-object v5

    .line 97
    invoke-virtual {v6, v2}, Landroid/renderscript/ScriptIntrinsicBlur;->setRadius(F)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v6, v3}, Landroid/renderscript/ScriptIntrinsicBlur;->setInput(Landroid/renderscript/Allocation;)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v6, v5}, Landroid/renderscript/ScriptIntrinsicBlur;->forEach(Landroid/renderscript/Allocation;)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v5, v4}, Landroid/renderscript/Allocation;->copyTo(Landroid/graphics/Bitmap;)V

    .line 107
    .line 108
    .line 109
    new-instance v2, Landroid/graphics/drawable/BitmapDrawable;

    .line 110
    .line 111
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 112
    .line 113
    .line 114
    move-result-object v3

    .line 115
    invoke-direct {v2, v3, v4}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 116
    .line 117
    .line 118
    goto :goto_1

    .line 119
    :catch_0
    new-instance v2, Landroid/graphics/drawable/BitmapDrawable;

    .line 120
    .line 121
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    invoke-direct {v2, v0, v1}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    .line 126
    .line 127
    .line 128
    goto :goto_1

    .line 129
    :cond_1
    :goto_0
    new-instance v2, Landroid/graphics/drawable/BitmapDrawable;

    .line 130
    .line 131
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    invoke-direct {v2, v0, v1}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    .line 136
    .line 137
    .line 138
    :goto_1
    sget-object v0, Llf4;->l:Li63;

    .line 139
    .line 140
    new-instance v1, Lsz2;

    .line 141
    .line 142
    const/16 v3, 0x16

    .line 143
    .line 144
    invoke-direct {v1, p0, v2, v3}, Lsz2;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 148
    .line 149
    .line 150
    :cond_2
    return-void

    .line 151
    :pswitch_0
    new-instance v0, Lp21;

    .line 152
    .line 153
    iget-object v1, p0, Lgc2;->j:Ljava/lang/Object;

    .line 154
    .line 155
    check-cast v1, Lgd2;

    .line 156
    .line 157
    iget-object v2, v1, Lgd2;->e:Landroid/content/Context;

    .line 158
    .line 159
    iget-object v3, v1, Lgd2;->f:Le51;

    .line 160
    .line 161
    iget-object v3, v3, Le51;->f:Ljava/lang/String;

    .line 162
    .line 163
    const-string v4, "1"

    .line 164
    .line 165
    const-string v5, "0"

    .line 166
    .line 167
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 168
    .line 169
    .line 170
    iput-object v2, v0, Lp21;->h:Ljava/lang/Object;

    .line 171
    .line 172
    iput-object v3, v0, Lp21;->i:Ljava/lang/Object;

    .line 173
    .line 174
    sget-object v3, Luk2;->j:Lso1;

    .line 175
    .line 176
    invoke-virtual {v3}, Lso1;->w()Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object v3

    .line 180
    check-cast v3, Ljava/lang/String;

    .line 181
    .line 182
    iput-object v3, v0, Lp21;->f:Ljava/lang/Object;

    .line 183
    .line 184
    new-instance v3, Ljava/util/LinkedHashMap;

    .line 185
    .line 186
    invoke-direct {v3}, Ljava/util/LinkedHashMap;-><init>()V

    .line 187
    .line 188
    .line 189
    iput-object v3, v0, Lp21;->g:Ljava/lang/Object;

    .line 190
    .line 191
    const-string v6, "s"

    .line 192
    .line 193
    const-string v7, "gmob_sdk"

    .line 194
    .line 195
    invoke-interface {v3, v6, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    const-string v6, "v"

    .line 199
    .line 200
    const-string v7, "3"

    .line 201
    .line 202
    invoke-interface {v3, v6, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    const-string v6, "os"

    .line 206
    .line 207
    sget-object v7, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    .line 208
    .line 209
    invoke-interface {v3, v6, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    const-string v6, "api_v"

    .line 213
    .line 214
    sget-object v7, Landroid/os/Build$VERSION;->SDK:Ljava/lang/String;

    .line 215
    .line 216
    invoke-interface {v3, v6, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    sget-object v6, Lhg4;->C:Lhg4;

    .line 220
    .line 221
    iget-object v7, v6, Lhg4;->c:Llf4;

    .line 222
    .line 223
    const-string v7, "device"

    .line 224
    .line 225
    invoke-static {}, Llf4;->O()Ljava/lang/String;

    .line 226
    .line 227
    .line 228
    move-result-object v8

    .line 229
    invoke-interface {v3, v7, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    invoke-virtual {v2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 233
    .line 234
    .line 235
    move-result-object v7

    .line 236
    if-eqz v7, :cond_3

    .line 237
    .line 238
    invoke-virtual {v2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 239
    .line 240
    .line 241
    move-result-object v7

    .line 242
    invoke-virtual {v7}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 243
    .line 244
    .line 245
    move-result-object v7

    .line 246
    goto :goto_2

    .line 247
    :cond_3
    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 248
    .line 249
    .line 250
    move-result-object v7

    .line 251
    :goto_2
    const-string v8, "app"

    .line 252
    .line 253
    invoke-interface {v3, v8, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    invoke-static {v2}, Llf4;->f(Landroid/content/Context;)Z

    .line 257
    .line 258
    .line 259
    move-result v7

    .line 260
    const/4 v8, 0x1

    .line 261
    if-eq v8, v7, :cond_4

    .line 262
    .line 263
    move-object v7, v5

    .line 264
    goto :goto_3

    .line 265
    :cond_4
    move-object v7, v4

    .line 266
    :goto_3
    const-string v9, "is_lite_sdk"

    .line 267
    .line 268
    invoke-interface {v3, v9, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 269
    .line 270
    .line 271
    iget-object v6, v6, Lhg4;->p:Lug0;

    .line 272
    .line 273
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 274
    .line 275
    .line 276
    sget-object v7, Lmd2;->a:Lld2;

    .line 277
    .line 278
    new-instance v9, Lgs1;

    .line 279
    .line 280
    invoke-direct {v9, v6, v2}, Lgs1;-><init>(Lug0;Landroid/content/Context;)V

    .line 281
    .line 282
    .line 283
    invoke-virtual {v7, v9}, Lld2;->c(Ljava/util/concurrent/Callable;)Ln70;

    .line 284
    .line 285
    .line 286
    move-result-object v6

    .line 287
    :try_start_1
    const-string v7, "network_coarse"

    .line 288
    .line 289
    invoke-interface {v6}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 290
    .line 291
    .line 292
    move-result-object v9

    .line 293
    check-cast v9, Lia2;

    .line 294
    .line 295
    iget v9, v9, Lia2;->j:I

    .line 296
    .line 297
    invoke-static {v9}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 298
    .line 299
    .line 300
    move-result-object v9

    .line 301
    invoke-interface {v3, v7, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 302
    .line 303
    .line 304
    const-string v7, "network_fine"

    .line 305
    .line 306
    invoke-interface {v6}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 307
    .line 308
    .line 309
    move-result-object v6

    .line 310
    check-cast v6, Lia2;

    .line 311
    .line 312
    iget v6, v6, Lia2;->k:I

    .line 313
    .line 314
    invoke-static {v6}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 315
    .line 316
    .line 317
    move-result-object v6

    .line 318
    invoke-interface {v3, v7, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 319
    .line 320
    .line 321
    goto :goto_4

    .line 322
    :catch_1
    move-exception v3

    .line 323
    const-string v6, "CsiConfiguration.CsiConfiguration"

    .line 324
    .line 325
    sget-object v7, Lhg4;->C:Lhg4;

    .line 326
    .line 327
    iget-object v7, v7, Lhg4;->h:Lgd2;

    .line 328
    .line 329
    invoke-virtual {v7, v6, v3}, Lgd2;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 330
    .line 331
    .line 332
    :goto_4
    sget-object v3, Lmz1;->ec:Liz1;

    .line 333
    .line 334
    sget-object v6, Ltw1;->e:Ltw1;

    .line 335
    .line 336
    iget-object v7, v6, Ltw1;->c:Lkz1;

    .line 337
    .line 338
    iget-object v6, v6, Ltw1;->c:Lkz1;

    .line 339
    .line 340
    invoke-virtual {v7, v3}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 341
    .line 342
    .line 343
    move-result-object v3

    .line 344
    check-cast v3, Ljava/lang/Boolean;

    .line 345
    .line 346
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 347
    .line 348
    .line 349
    move-result v3

    .line 350
    if-eqz v3, :cond_6

    .line 351
    .line 352
    iget-object v3, v0, Lp21;->g:Ljava/lang/Object;

    .line 353
    .line 354
    check-cast v3, Ljava/util/LinkedHashMap;

    .line 355
    .line 356
    sget-object v7, Lhg4;->C:Lhg4;

    .line 357
    .line 358
    iget-object v7, v7, Lhg4;->c:Llf4;

    .line 359
    .line 360
    invoke-static {v2}, Llf4;->d(Landroid/content/Context;)Z

    .line 361
    .line 362
    .line 363
    move-result v2

    .line 364
    if-eq v8, v2, :cond_5

    .line 365
    .line 366
    move-object v4, v5

    .line 367
    :cond_5
    const-string v2, "is_bstar"

    .line 368
    .line 369
    invoke-interface {v3, v2, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 370
    .line 371
    .line 372
    :cond_6
    sget-object v2, Lmz1;->ja:Liz1;

    .line 373
    .line 374
    invoke-virtual {v6, v2}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 375
    .line 376
    .line 377
    move-result-object v2

    .line 378
    check-cast v2, Ljava/lang/Boolean;

    .line 379
    .line 380
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 381
    .line 382
    .line 383
    move-result v2

    .line 384
    if-eqz v2, :cond_7

    .line 385
    .line 386
    sget-object v2, Lmz1;->z2:Liz1;

    .line 387
    .line 388
    invoke-virtual {v6, v2}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 389
    .line 390
    .line 391
    move-result-object v2

    .line 392
    check-cast v2, Ljava/lang/Boolean;

    .line 393
    .line 394
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 395
    .line 396
    .line 397
    move-result v2

    .line 398
    if-eqz v2, :cond_7

    .line 399
    .line 400
    sget-object v2, Lhg4;->C:Lhg4;

    .line 401
    .line 402
    iget-object v3, v2, Lhg4;->h:Lgd2;

    .line 403
    .line 404
    iget-object v3, v3, Lgd2;->g:Ljava/lang/String;

    .line 405
    .line 406
    invoke-static {v3}, Lyc0;->s(Ljava/lang/String;)Z

    .line 407
    .line 408
    .line 409
    move-result v3

    .line 410
    if-nez v3, :cond_7

    .line 411
    .line 412
    iget-object v3, v0, Lp21;->g:Ljava/lang/Object;

    .line 413
    .line 414
    check-cast v3, Ljava/util/LinkedHashMap;

    .line 415
    .line 416
    iget-object v2, v2, Lhg4;->h:Lgd2;

    .line 417
    .line 418
    iget-object v2, v2, Lgd2;->g:Ljava/lang/String;

    .line 419
    .line 420
    const-string v4, "plugin"

    .line 421
    .line 422
    invoke-interface {v3, v4, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 423
    .line 424
    .line 425
    :cond_7
    iget-object v2, v1, Lgd2;->a:Ljava/lang/Object;

    .line 426
    .line 427
    monitor-enter v2

    .line 428
    :try_start_2
    sget-object v3, Lhg4;->C:Lhg4;

    .line 429
    .line 430
    iget-object v3, v3, Lhg4;->m:Lts0;

    .line 431
    .line 432
    iget-object v1, v1, Lgd2;->h:Lh2;

    .line 433
    .line 434
    invoke-static {v1, v0}, Lts0;->n(Lh2;Lp21;)V
    :try_end_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 435
    .line 436
    .line 437
    goto :goto_5

    .line 438
    :catchall_0
    move-exception v0

    .line 439
    goto :goto_6

    .line 440
    :catch_2
    const/4 v0, 0x5

    .line 441
    :try_start_3
    invoke-static {v0}, Lgi2;->q0(I)Z

    .line 442
    .line 443
    .line 444
    :goto_5
    monitor-exit v2

    .line 445
    return-void

    .line 446
    :goto_6
    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 447
    throw v0

    .line 448
    :pswitch_1
    :try_start_4
    iget-object v0, p0, Lgc2;->j:Ljava/lang/Object;

    .line 449
    .line 450
    check-cast v0, Landroid/content/Context;

    .line 451
    .line 452
    invoke-static {v0}, Lk3;->b(Landroid/content/Context;)Z

    .line 453
    .line 454
    .line 455
    move-result v0
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_5
    .catch Ljava/lang/IllegalStateException; {:try_start_4 .. :try_end_4} :catch_4
    .catch Lnz; {:try_start_4 .. :try_end_4} :catch_3

    .line 456
    goto :goto_8

    .line 457
    :catch_3
    move-exception v0

    .line 458
    goto :goto_7

    .line 459
    :catch_4
    move-exception v0

    .line 460
    goto :goto_7

    .line 461
    :catch_5
    move-exception v0

    .line 462
    :goto_7
    const-string v1, "Fail to get isAdIdFakeForDebugLogging"

    .line 463
    .line 464
    invoke-static {v1, v0}, Lgi2;->c0(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 465
    .line 466
    .line 467
    const/4 v0, 0x0

    .line 468
    :goto_8
    sget-object v1, Lwb4;->b:Ljava/lang/Object;

    .line 469
    .line 470
    monitor-enter v1

    .line 471
    const/4 v2, 0x1

    .line 472
    :try_start_5
    sput-boolean v2, Lwb4;->c:Z

    .line 473
    .line 474
    sput-boolean v0, Lwb4;->d:Z

    .line 475
    .line 476
    monitor-exit v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 477
    invoke-static {v0}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    .line 478
    .line 479
    .line 480
    move-result-object v1

    .line 481
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 482
    .line 483
    .line 484
    move-result v1

    .line 485
    new-instance v2, Ljava/lang/StringBuilder;

    .line 486
    .line 487
    add-int/lit8 v1, v1, 0x26

    .line 488
    .line 489
    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 490
    .line 491
    .line 492
    const-string v1, "Update ad debug logging enablement as "

    .line 493
    .line 494
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 495
    .line 496
    .line 497
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 498
    .line 499
    .line 500
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 501
    .line 502
    .line 503
    move-result-object v0

    .line 504
    invoke-static {v0}, Lgi2;->i0(Ljava/lang/String;)V

    .line 505
    .line 506
    .line 507
    return-void

    .line 508
    :catchall_1
    move-exception v0

    .line 509
    :try_start_6
    monitor-exit v1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 510
    throw v0

    .line 511
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
