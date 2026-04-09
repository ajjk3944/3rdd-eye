.class public final synthetic Lyi1;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p4, p0, Lyi1;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lyi1;->b:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p2, p0, Lyi1;->d:Ljava/lang/Object;

    .line 6
    .line 7
    iput-object p3, p0, Lyi1;->c:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lyi1;->a:I

    .line 4
    .line 5
    const-string v2, "ms"

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const/4 v4, 0x0

    .line 9
    iget-object v5, v0, Lyi1;->c:Ljava/lang/Object;

    .line 10
    .line 11
    iget-object v6, v0, Lyi1;->d:Ljava/lang/Object;

    .line 12
    .line 13
    iget-object v7, v0, Lyi1;->b:Ljava/lang/Object;

    .line 14
    .line 15
    packed-switch v1, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    check-cast v7, Ljd4;

    .line 19
    .line 20
    check-cast v6, Lb3;

    .line 21
    .line 22
    check-cast v5, Ltd4;

    .line 23
    .line 24
    iget-object v1, v7, Ljd4;->c:Landroid/content/Context;

    .line 25
    .line 26
    invoke-static {v1, v6, v5}, Lug0;->r(Landroid/content/Context;Lb3;Lwm0;)V

    .line 27
    .line 28
    .line 29
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 30
    .line 31
    return-object v1

    .line 32
    :pswitch_0
    sget-object v1, Li53;->k:Ln43;

    .line 33
    .line 34
    new-instance v1, Lorg/json/JSONArray;

    .line 35
    .line 36
    invoke-direct {v1}, Lorg/json/JSONArray;-><init>()V

    .line 37
    .line 38
    .line 39
    check-cast v7, Ljava/util/ArrayList;

    .line 40
    .line 41
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    :cond_0
    :goto_0
    if-ge v3, v2, :cond_1

    .line 46
    .line 47
    invoke-virtual {v7, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v8

    .line 51
    add-int/lit8 v3, v3, 0x1

    .line 52
    .line 53
    check-cast v8, Ln70;

    .line 54
    .line 55
    invoke-interface {v8}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v9

    .line 59
    check-cast v9, Lorg/json/JSONObject;

    .line 60
    .line 61
    if-eqz v9, :cond_0

    .line 62
    .line 63
    invoke-interface {v8}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v8

    .line 67
    invoke-virtual {v1, v8}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 68
    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_1
    check-cast v5, Ljava/lang/String;

    .line 72
    .line 73
    check-cast v6, Landroid/os/Bundle;

    .line 74
    .line 75
    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    .line 76
    .line 77
    .line 78
    move-result v2

    .line 79
    if-nez v2, :cond_3

    .line 80
    .line 81
    sget-object v1, Lmz1;->C4:Liz1;

    .line 82
    .line 83
    sget-object v2, Ltw1;->e:Ltw1;

    .line 84
    .line 85
    iget-object v2, v2, Ltw1;->c:Lkz1;

    .line 86
    .line 87
    invoke-virtual {v2, v1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    check-cast v1, Ljava/lang/Boolean;

    .line 92
    .line 93
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 94
    .line 95
    .line 96
    move-result v1

    .line 97
    if-nez v1, :cond_2

    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_2
    new-instance v4, Ln43;

    .line 101
    .line 102
    new-instance v1, Lorg/json/JSONArray;

    .line 103
    .line 104
    invoke-direct {v1}, Lorg/json/JSONArray;-><init>()V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v1}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    invoke-direct {v4, v1, v6, v5}, Ln43;-><init>(Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    goto :goto_1

    .line 115
    :cond_3
    new-instance v4, Ln43;

    .line 116
    .line 117
    invoke-virtual {v1}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    invoke-direct {v4, v1, v6, v5}, Ln43;-><init>(Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    :goto_1
    return-object v4

    .line 125
    :pswitch_1
    check-cast v7, Lq93;

    .line 126
    .line 127
    iget-object v1, v7, Lq93;->h:Ln70;

    .line 128
    .line 129
    invoke-interface {v1}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v1

    .line 133
    check-cast v1, Lga2;

    .line 134
    .line 135
    sget-object v2, Lmz1;->m2:Liz1;

    .line 136
    .line 137
    sget-object v3, Ltw1;->e:Ltw1;

    .line 138
    .line 139
    iget-object v3, v3, Ltw1;->c:Lkz1;

    .line 140
    .line 141
    invoke-virtual {v3, v2}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v2

    .line 145
    check-cast v2, Ljava/lang/Boolean;

    .line 146
    .line 147
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 148
    .line 149
    .line 150
    move-result v2

    .line 151
    if-eqz v2, :cond_4

    .line 152
    .line 153
    check-cast v6, Lfa2;

    .line 154
    .line 155
    iget-object v2, v6, Lfa2;->r:Landroid/os/Bundle;

    .line 156
    .line 157
    if-eqz v2, :cond_4

    .line 158
    .line 159
    const-string v3, "get-ad-dictionary-sdkcore-start"

    .line 160
    .line 161
    iget-wide v6, v1, Lga2;->j:J

    .line 162
    .line 163
    invoke-virtual {v2, v3, v6, v7}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 164
    .line 165
    .line 166
    const-string v3, "get-ad-dictionary-sdkcore-end"

    .line 167
    .line 168
    iget-wide v6, v1, Lga2;->k:J

    .line 169
    .line 170
    invoke-virtual {v2, v3, v6, v7}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 171
    .line 172
    .line 173
    :cond_4
    check-cast v5, Lq93;

    .line 174
    .line 175
    new-instance v2, Laz2;

    .line 176
    .line 177
    iget-object v3, v5, Lq93;->h:Ln70;

    .line 178
    .line 179
    invoke-interface {v3}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object v3

    .line 183
    check-cast v3, Lorg/json/JSONObject;

    .line 184
    .line 185
    invoke-direct {v2, v3, v1}, Laz2;-><init>(Lorg/json/JSONObject;Lga2;)V

    .line 186
    .line 187
    .line 188
    return-object v2

    .line 189
    :pswitch_2
    check-cast v7, Lkm2;

    .line 190
    .line 191
    check-cast v6, Lq93;

    .line 192
    .line 193
    move-object/from16 v21, v5

    .line 194
    .line 195
    check-cast v21, Landroid/os/Bundle;

    .line 196
    .line 197
    iget-object v1, v6, Lq93;->h:Ln70;

    .line 198
    .line 199
    invoke-interface {v1}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object v1

    .line 203
    check-cast v1, Ljm2;

    .line 204
    .line 205
    new-instance v8, Lfa2;

    .line 206
    .line 207
    iget-object v9, v1, Ljm2;->a:Landroid/os/Bundle;

    .line 208
    .line 209
    iget-object v2, v7, Lkm2;->g:Lz94;

    .line 210
    .line 211
    invoke-interface {v2}, Lz94;->d()Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object v2

    .line 215
    check-cast v2, Ln70;

    .line 216
    .line 217
    invoke-interface {v2}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    move-result-object v2

    .line 221
    move-object v15, v2

    .line 222
    check-cast v15, Ljava/lang/String;

    .line 223
    .line 224
    sget-object v2, Lmz1;->r7:Liz1;

    .line 225
    .line 226
    sget-object v4, Ltw1;->e:Ltw1;

    .line 227
    .line 228
    iget-object v4, v4, Ltw1;->c:Lkz1;

    .line 229
    .line 230
    invoke-virtual {v4, v2}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 231
    .line 232
    .line 233
    move-result-object v2

    .line 234
    check-cast v2, Ljava/lang/Boolean;

    .line 235
    .line 236
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 237
    .line 238
    .line 239
    move-result v2

    .line 240
    if-eqz v2, :cond_5

    .line 241
    .line 242
    iget-object v2, v7, Lkm2;->j:Lra4;

    .line 243
    .line 244
    invoke-virtual {v2}, Lra4;->s()Z

    .line 245
    .line 246
    .line 247
    move-result v2

    .line 248
    if-eqz v2, :cond_5

    .line 249
    .line 250
    const/4 v3, 0x1

    .line 251
    :cond_5
    move/from16 v19, v3

    .line 252
    .line 253
    iget-object v2, v7, Lkm2;->h:Ljava/lang/String;

    .line 254
    .line 255
    iget-object v14, v7, Lkm2;->f:Landroid/content/pm/PackageInfo;

    .line 256
    .line 257
    iget-object v13, v7, Lkm2;->e:Ljava/util/ArrayList;

    .line 258
    .line 259
    iget-object v12, v7, Lkm2;->d:Ljava/lang/String;

    .line 260
    .line 261
    iget-object v11, v7, Lkm2;->c:Landroid/content/pm/ApplicationInfo;

    .line 262
    .line 263
    iget-object v10, v7, Lkm2;->b:Le51;

    .line 264
    .line 265
    iget-object v3, v7, Lkm2;->k:Ll83;

    .line 266
    .line 267
    invoke-virtual {v3}, Ll83;->a()Z

    .line 268
    .line 269
    .line 270
    move-result v20

    .line 271
    iget-object v1, v1, Ljm2;->b:Landroid/os/Bundle;

    .line 272
    .line 273
    iget v3, v7, Lkm2;->l:I

    .line 274
    .line 275
    const/16 v17, 0x0

    .line 276
    .line 277
    const/16 v18, 0x0

    .line 278
    .line 279
    move-object/from16 v22, v1

    .line 280
    .line 281
    move-object/from16 v16, v2

    .line 282
    .line 283
    move/from16 v23, v3

    .line 284
    .line 285
    invoke-direct/range {v8 .. v23}, Lfa2;-><init>(Landroid/os/Bundle;Le51;Landroid/content/pm/ApplicationInfo;Ljava/lang/String;Ljava/util/ArrayList;Landroid/content/pm/PackageInfo;Ljava/lang/String;Ljava/lang/String;Ld93;Ljava/lang/String;ZZLandroid/os/Bundle;Landroid/os/Bundle;I)V

    .line 286
    .line 287
    .line 288
    return-object v8

    .line 289
    :pswitch_3
    check-cast v7, Lln2;

    .line 290
    .line 291
    check-cast v6, Ljava/lang/String;

    .line 292
    .line 293
    check-cast v5, Lorg/json/JSONObject;

    .line 294
    .line 295
    invoke-interface {v7, v6, v5}, Lln2;->b(Ljava/lang/String;Lorg/json/JSONObject;)Z

    .line 296
    .line 297
    .line 298
    move-result v1

    .line 299
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 300
    .line 301
    .line 302
    move-result-object v1

    .line 303
    return-object v1

    .line 304
    :pswitch_4
    check-cast v7, Lcr1;

    .line 305
    .line 306
    check-cast v6, Landroid/net/Uri;

    .line 307
    .line 308
    check-cast v5, Lu10;

    .line 309
    .line 310
    :try_start_0
    sget-object v1, Lmz1;->Mc:Liz1;

    .line 311
    .line 312
    sget-object v3, Ltw1;->e:Ltw1;

    .line 313
    .line 314
    iget-object v3, v3, Ltw1;->c:Lkz1;

    .line 315
    .line 316
    invoke-virtual {v3, v1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 317
    .line 318
    .line 319
    move-result-object v1

    .line 320
    check-cast v1, Ljava/lang/Boolean;

    .line 321
    .line 322
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 323
    .line 324
    .line 325
    move-result v1

    .line 326
    if-eqz v1, :cond_6

    .line 327
    .line 328
    iget-object v1, v7, Lcr1;->j:Lm83;

    .line 329
    .line 330
    if-eqz v1, :cond_6

    .line 331
    .line 332
    iget-object v3, v7, Lcr1;->h:Landroid/content/Context;

    .line 333
    .line 334
    invoke-static {v5}, Loi0;->l1(Lu10;)Ljava/lang/Object;

    .line 335
    .line 336
    .line 337
    move-result-object v5

    .line 338
    check-cast v5, Landroid/view/View;

    .line 339
    .line 340
    invoke-virtual {v1, v6, v3, v5, v4}, Lm83;->a(Landroid/net/Uri;Landroid/content/Context;Landroid/view/View;Landroid/app/Activity;)Landroid/net/Uri;

    .line 341
    .line 342
    .line 343
    move-result-object v6

    .line 344
    goto :goto_2

    .line 345
    :cond_6
    iget-object v1, v7, Lcr1;->i:Lvs1;

    .line 346
    .line 347
    iget-object v3, v7, Lcr1;->h:Landroid/content/Context;

    .line 348
    .line 349
    invoke-static {v5}, Loi0;->l1(Lu10;)Ljava/lang/Object;

    .line 350
    .line 351
    .line 352
    move-result-object v5

    .line 353
    check-cast v5, Landroid/view/View;

    .line 354
    .line 355
    invoke-virtual {v1, v6, v3, v5, v4}, Lvs1;->b(Landroid/net/Uri;Landroid/content/Context;Landroid/view/View;Landroid/app/Activity;)Landroid/net/Uri;

    .line 356
    .line 357
    .line 358
    move-result-object v6
    :try_end_0
    .catch Lws1; {:try_start_0 .. :try_end_0} :catch_0

    .line 359
    goto :goto_2

    .line 360
    :catch_0
    const/4 v1, 0x5

    .line 361
    invoke-static {v1}, Lgi2;->q0(I)Z

    .line 362
    .line 363
    .line 364
    :goto_2
    invoke-virtual {v6, v2}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    .line 365
    .line 366
    .line 367
    move-result-object v1

    .line 368
    if-eqz v1, :cond_7

    .line 369
    .line 370
    return-object v6

    .line 371
    :cond_7
    new-instance v1, Ljava/lang/Exception;

    .line 372
    .line 373
    const-string v2, "Failed to append spam signals to click url."

    .line 374
    .line 375
    invoke-direct {v1, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 376
    .line 377
    .line 378
    throw v1

    .line 379
    :pswitch_5
    check-cast v7, Lcr1;

    .line 380
    .line 381
    check-cast v6, Ljava/util/List;

    .line 382
    .line 383
    check-cast v5, Lu10;

    .line 384
    .line 385
    iget-object v1, v7, Lcr1;->i:Lvs1;

    .line 386
    .line 387
    iget-object v1, v1, Lvs1;->b:Lrs1;

    .line 388
    .line 389
    if-eqz v1, :cond_8

    .line 390
    .line 391
    iget-object v3, v7, Lcr1;->h:Landroid/content/Context;

    .line 392
    .line 393
    invoke-static {v5}, Loi0;->l1(Lu10;)Ljava/lang/Object;

    .line 394
    .line 395
    .line 396
    move-result-object v5

    .line 397
    check-cast v5, Landroid/view/View;

    .line 398
    .line 399
    invoke-interface {v1, v3, v5, v4}, Lrs1;->i(Landroid/content/Context;Landroid/view/View;Landroid/app/Activity;)Ljava/lang/String;

    .line 400
    .line 401
    .line 402
    move-result-object v1

    .line 403
    goto :goto_3

    .line 404
    :cond_8
    const-string v1, ""

    .line 405
    .line 406
    :goto_3
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 407
    .line 408
    .line 409
    move-result v3

    .line 410
    if-nez v3, :cond_c

    .line 411
    .line 412
    new-instance v3, Ljava/util/ArrayList;

    .line 413
    .line 414
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 415
    .line 416
    .line 417
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 418
    .line 419
    .line 420
    move-result-object v4

    .line 421
    :goto_4
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 422
    .line 423
    .line 424
    move-result v5

    .line 425
    if-eqz v5, :cond_a

    .line 426
    .line 427
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 428
    .line 429
    .line 430
    move-result-object v5

    .line 431
    check-cast v5, Landroid/net/Uri;

    .line 432
    .line 433
    iget-object v6, v7, Lcr1;->E:Ljava/util/ArrayList;

    .line 434
    .line 435
    iget-object v8, v7, Lcr1;->F:Ljava/util/ArrayList;

    .line 436
    .line 437
    invoke-static {v5, v6, v8}, Lcr1;->F3(Landroid/net/Uri;Ljava/util/List;Ljava/util/List;)Z

    .line 438
    .line 439
    .line 440
    move-result v6

    .line 441
    if-nez v6, :cond_9

    .line 442
    .line 443
    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 444
    .line 445
    .line 446
    move-result-object v6

    .line 447
    const-string v8, "Not a Google URL: "

    .line 448
    .line 449
    invoke-virtual {v8, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 450
    .line 451
    .line 452
    move-result-object v6

    .line 453
    invoke-static {v6}, Lgi2;->i0(Ljava/lang/String;)V

    .line 454
    .line 455
    .line 456
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 457
    .line 458
    .line 459
    goto :goto_4

    .line 460
    :cond_9
    invoke-static {v5, v2, v1}, Lcr1;->I3(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    .line 461
    .line 462
    .line 463
    move-result-object v5

    .line 464
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 465
    .line 466
    .line 467
    goto :goto_4

    .line 468
    :cond_a
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 469
    .line 470
    .line 471
    move-result v1

    .line 472
    if-nez v1, :cond_b

    .line 473
    .line 474
    return-object v3

    .line 475
    :cond_b
    new-instance v1, Ljava/lang/Exception;

    .line 476
    .line 477
    const-string v2, "Empty impression URLs result."

    .line 478
    .line 479
    invoke-direct {v1, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 480
    .line 481
    .line 482
    throw v1

    .line 483
    :cond_c
    new-instance v1, Ljava/lang/Exception;

    .line 484
    .line 485
    const-string v2, "Failed to get view signals."

    .line 486
    .line 487
    invoke-direct {v1, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 488
    .line 489
    .line 490
    throw v1

    .line 491
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
