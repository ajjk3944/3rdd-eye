.class public final synthetic Lbt2;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p5, p0, Lbt2;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lbt2;->b:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p2, p0, Lbt2;->c:Ljava/lang/Object;

    .line 6
    .line 7
    iput-object p3, p0, Lbt2;->d:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p4, p0, Lbt2;->e:Ljava/lang/Object;

    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 10

    .line 1
    iget v0, p0, Lbt2;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lbt2;->b:Ljava/lang/Object;

    .line 7
    .line 8
    move-object v2, v0

    .line 9
    check-cast v2, Lmj3;

    .line 10
    .line 11
    iget-object v0, p0, Lbt2;->c:Ljava/lang/Object;

    .line 12
    .line 13
    move-object v4, v0

    .line 14
    check-cast v4, Landroid/content/Context;

    .line 15
    .line 16
    iget-object v0, p0, Lbt2;->d:Ljava/lang/Object;

    .line 17
    .line 18
    move-object v6, v0

    .line 19
    check-cast v6, Ljava/lang/String;

    .line 20
    .line 21
    iget-object v0, p0, Lbt2;->e:Ljava/lang/Object;

    .line 22
    .line 23
    move-object v5, v0

    .line 24
    check-cast v5, Landroid/view/View;

    .line 25
    .line 26
    new-instance v3, Ljava/util/HashMap;

    .line 27
    .line 28
    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 29
    .line 30
    .line 31
    new-instance v1, Lea1;

    .line 32
    .line 33
    const/4 v7, 0x5

    .line 34
    invoke-direct/range {v1 .. v7}, Lea1;-><init>(Lmj3;Ljava/util/HashMap;Landroid/content/Context;Landroid/view/View;Ljava/lang/Object;I)V

    .line 35
    .line 36
    .line 37
    iget-object v0, v2, Lmj3;->e:Lgk3;

    .line 38
    .line 39
    const/16 v4, 0x4e8a

    .line 40
    .line 41
    invoke-virtual {v0, v4, v1}, Lgk3;->e(ILjava/lang/Runnable;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v2, v3}, Lmj3;->i(Ljava/util/HashMap;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-virtual {v3}, Ljava/util/HashMap;->clear()V

    .line 49
    .line 50
    .line 51
    return-object v0

    .line 52
    :pswitch_0
    iget-object v0, p0, Lbt2;->d:Ljava/lang/Object;

    .line 53
    .line 54
    move-object v5, v0

    .line 55
    check-cast v5, Landroid/view/View;

    .line 56
    .line 57
    iget-object v0, p0, Lbt2;->e:Ljava/lang/Object;

    .line 58
    .line 59
    move-object v6, v0

    .line 60
    check-cast v6, Landroid/app/Activity;

    .line 61
    .line 62
    iget-object v0, p0, Lbt2;->b:Ljava/lang/Object;

    .line 63
    .line 64
    move-object v2, v0

    .line 65
    check-cast v2, Lmj3;

    .line 66
    .line 67
    iget-object v0, p0, Lbt2;->c:Ljava/lang/Object;

    .line 68
    .line 69
    move-object v4, v0

    .line 70
    check-cast v4, Landroid/content/Context;

    .line 71
    .line 72
    new-instance v3, Ljava/util/HashMap;

    .line 73
    .line 74
    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 75
    .line 76
    .line 77
    new-instance v1, Lea1;

    .line 78
    .line 79
    const/4 v7, 0x4

    .line 80
    invoke-direct/range {v1 .. v7}, Lea1;-><init>(Lmj3;Ljava/util/HashMap;Landroid/content/Context;Landroid/view/View;Ljava/lang/Object;I)V

    .line 81
    .line 82
    .line 83
    iget-object v0, v2, Lmj3;->e:Lgk3;

    .line 84
    .line 85
    const/16 v4, 0x4e8a

    .line 86
    .line 87
    invoke-virtual {v0, v4, v1}, Lgk3;->e(ILjava/lang/Runnable;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v2, v3}, Lmj3;->i(Ljava/util/HashMap;)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    invoke-virtual {v3}, Ljava/util/HashMap;->clear()V

    .line 95
    .line 96
    .line 97
    return-object v0

    .line 98
    :pswitch_1
    iget-object v0, p0, Lbt2;->b:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast v0, Llj3;

    .line 101
    .line 102
    iget-object v1, p0, Lbt2;->c:Ljava/lang/Object;

    .line 103
    .line 104
    check-cast v1, Landroid/content/Context;

    .line 105
    .line 106
    iget-object v2, p0, Lbt2;->d:Ljava/lang/Object;

    .line 107
    .line 108
    check-cast v2, Ljava/lang/String;

    .line 109
    .line 110
    iget-object v3, p0, Lbt2;->e:Ljava/lang/Object;

    .line 111
    .line 112
    check-cast v3, Landroid/view/View;

    .line 113
    .line 114
    const-string v4, ""

    .line 115
    .line 116
    iget-object v5, v0, Llj3;->e:Lgk3;

    .line 117
    .line 118
    iget-object v0, v0, Llj3;->a:Lfe3;

    .line 119
    .line 120
    invoke-virtual {v0}, Lfe3;->b()Lde3;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    if-nez v0, :cond_0

    .line 125
    .line 126
    const/16 v0, 0x3a9c

    .line 127
    .line 128
    invoke-virtual {v5, v0}, Lgk3;->b(I)V

    .line 129
    .line 130
    .line 131
    goto :goto_0

    .line 132
    :cond_0
    const/4 v6, 0x0

    .line 133
    invoke-virtual {v0, v1, v2, v3, v6}, Lde3;->h(Landroid/content/Context;Ljava/lang/String;Landroid/view/View;Landroid/app/Activity;)Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    if-eqz v0, :cond_1

    .line 138
    .line 139
    move-object v4, v0

    .line 140
    goto :goto_0

    .line 141
    :cond_1
    const/16 v0, 0x3aa0

    .line 142
    .line 143
    invoke-virtual {v5, v0}, Lgk3;->b(I)V

    .line 144
    .line 145
    .line 146
    :goto_0
    return-object v4

    .line 147
    :pswitch_2
    iget-object v0, p0, Lbt2;->d:Ljava/lang/Object;

    .line 148
    .line 149
    check-cast v0, Landroid/view/View;

    .line 150
    .line 151
    iget-object v1, p0, Lbt2;->e:Ljava/lang/Object;

    .line 152
    .line 153
    check-cast v1, Landroid/app/Activity;

    .line 154
    .line 155
    iget-object v2, p0, Lbt2;->b:Ljava/lang/Object;

    .line 156
    .line 157
    check-cast v2, Llj3;

    .line 158
    .line 159
    iget-object v3, p0, Lbt2;->c:Ljava/lang/Object;

    .line 160
    .line 161
    check-cast v3, Landroid/content/Context;

    .line 162
    .line 163
    const-string v4, ""

    .line 164
    .line 165
    iget-object v5, v2, Llj3;->e:Lgk3;

    .line 166
    .line 167
    iget-object v2, v2, Llj3;->a:Lfe3;

    .line 168
    .line 169
    invoke-virtual {v2}, Lfe3;->b()Lde3;

    .line 170
    .line 171
    .line 172
    move-result-object v2

    .line 173
    if-nez v2, :cond_2

    .line 174
    .line 175
    const/16 v0, 0x3a9c

    .line 176
    .line 177
    invoke-virtual {v5, v0}, Lgk3;->b(I)V

    .line 178
    .line 179
    .line 180
    goto :goto_1

    .line 181
    :cond_2
    invoke-virtual {v2, v3, v0, v1}, Lde3;->e(Landroid/content/Context;Landroid/view/View;Landroid/app/Activity;)Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object v0

    .line 185
    if-eqz v0, :cond_3

    .line 186
    .line 187
    move-object v4, v0

    .line 188
    goto :goto_1

    .line 189
    :cond_3
    const/16 v0, 0x3a9f

    .line 190
    .line 191
    invoke-virtual {v5, v0}, Lgk3;->b(I)V

    .line 192
    .line 193
    .line 194
    :goto_1
    return-object v4

    .line 195
    :pswitch_3
    sget-object v0, Lmz1;->m2:Liz1;

    .line 196
    .line 197
    sget-object v1, Ltw1;->e:Ltw1;

    .line 198
    .line 199
    iget-object v1, v1, Ltw1;->c:Lkz1;

    .line 200
    .line 201
    invoke-virtual {v1, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object v0

    .line 205
    check-cast v0, Ljava/lang/Boolean;

    .line 206
    .line 207
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 208
    .line 209
    .line 210
    move-result v0

    .line 211
    if-eqz v0, :cond_4

    .line 212
    .line 213
    iget-object v0, p0, Lbt2;->b:Ljava/lang/Object;

    .line 214
    .line 215
    check-cast v0, Lfa2;

    .line 216
    .line 217
    iget-object v0, v0, Lfa2;->r:Landroid/os/Bundle;

    .line 218
    .line 219
    if-eqz v0, :cond_4

    .line 220
    .line 221
    const-string v1, "http-response-ready"

    .line 222
    .line 223
    sget-object v2, Lhg4;->C:Lhg4;

    .line 224
    .line 225
    iget-object v2, v2, Lhg4;->k:Lym;

    .line 226
    .line 227
    invoke-static {v2, v0, v1}, Lga1;->n(Lym;Landroid/os/Bundle;Ljava/lang/String;)V

    .line 228
    .line 229
    .line 230
    :cond_4
    iget-object v0, p0, Lbt2;->e:Ljava/lang/Object;

    .line 231
    .line 232
    check-cast v0, Lq93;

    .line 233
    .line 234
    iget-object v1, p0, Lbt2;->d:Ljava/lang/Object;

    .line 235
    .line 236
    check-cast v1, Lq93;

    .line 237
    .line 238
    iget-object v2, p0, Lbt2;->c:Ljava/lang/Object;

    .line 239
    .line 240
    check-cast v2, Lq93;

    .line 241
    .line 242
    new-instance v3, Lty2;

    .line 243
    .line 244
    iget-object v2, v2, Lq93;->h:Ln70;

    .line 245
    .line 246
    invoke-interface {v2}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    move-result-object v2

    .line 250
    check-cast v2, Lzy2;

    .line 251
    .line 252
    iget-object v1, v1, Lq93;->h:Ln70;

    .line 253
    .line 254
    invoke-interface {v1}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 255
    .line 256
    .line 257
    move-result-object v1

    .line 258
    check-cast v1, Lorg/json/JSONObject;

    .line 259
    .line 260
    iget-object v0, v0, Lq93;->h:Ln70;

    .line 261
    .line 262
    invoke-interface {v0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 263
    .line 264
    .line 265
    move-result-object v0

    .line 266
    check-cast v0, Lga2;

    .line 267
    .line 268
    invoke-direct {v3, v2, v1, v0}, Lty2;-><init>(Lzy2;Lorg/json/JSONObject;Lga2;)V

    .line 269
    .line 270
    .line 271
    return-object v3

    .line 272
    :pswitch_4
    iget-object v0, p0, Lbt2;->b:Ljava/lang/Object;

    .line 273
    .line 274
    check-cast v0, Lp21;

    .line 275
    .line 276
    iget-object v1, p0, Lbt2;->c:Ljava/lang/Object;

    .line 277
    .line 278
    check-cast v1, Lh83;

    .line 279
    .line 280
    iget-object v2, p0, Lbt2;->d:Ljava/lang/Object;

    .line 281
    .line 282
    check-cast v2, La83;

    .line 283
    .line 284
    iget-object v3, p0, Lbt2;->e:Ljava/lang/Object;

    .line 285
    .line 286
    check-cast v3, Lorg/json/JSONObject;

    .line 287
    .line 288
    sget-object v4, Lmz1;->t2:Liz1;

    .line 289
    .line 290
    sget-object v5, Ltw1;->e:Ltw1;

    .line 291
    .line 292
    iget-object v5, v5, Ltw1;->c:Lkz1;

    .line 293
    .line 294
    invoke-virtual {v5, v4}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 295
    .line 296
    .line 297
    move-result-object v4

    .line 298
    check-cast v4, Ljava/lang/Boolean;

    .line 299
    .line 300
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 301
    .line 302
    .line 303
    move-result v4

    .line 304
    if-eqz v4, :cond_5

    .line 305
    .line 306
    iget-object v0, v0, Lp21;->i:Ljava/lang/Object;

    .line 307
    .line 308
    check-cast v0, Ljv2;

    .line 309
    .line 310
    iget-object v0, v0, Ljv2;->e:Landroid/os/Bundle;

    .line 311
    .line 312
    const-string v4, "native-assets-loading-basic-start"

    .line 313
    .line 314
    sget-object v5, Lhg4;->C:Lhg4;

    .line 315
    .line 316
    iget-object v5, v5, Lhg4;->k:Lym;

    .line 317
    .line 318
    invoke-static {v5, v0, v4}, Lga1;->n(Lym;Landroid/os/Bundle;Ljava/lang/String;)V

    .line 319
    .line 320
    .line 321
    :cond_5
    new-instance v4, Ltr2;

    .line 322
    .line 323
    invoke-direct {v4}, Ltr2;-><init>()V

    .line 324
    .line 325
    .line 326
    const-string v0, "template_id"

    .line 327
    .line 328
    const/4 v5, -0x1

    .line 329
    invoke-virtual {v3, v0, v5}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 330
    .line 331
    .line 332
    move-result v0

    .line 333
    monitor-enter v4

    .line 334
    :try_start_0
    iput v0, v4, Ltr2;->a:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    .line 335
    .line 336
    monitor-exit v4

    .line 337
    const-string v0, "custom_template_id"

    .line 338
    .line 339
    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 340
    .line 341
    .line 342
    move-result-object v0

    .line 343
    monitor-enter v4

    .line 344
    :try_start_1
    iput-object v0, v4, Ltr2;->u:Ljava/lang/String;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 345
    .line 346
    monitor-exit v4

    .line 347
    const-string v0, "omid_settings"

    .line 348
    .line 349
    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 350
    .line 351
    .line 352
    move-result-object v0

    .line 353
    const/4 v5, 0x0

    .line 354
    if-eqz v0, :cond_6

    .line 355
    .line 356
    const-string v6, "omid_partner_name"

    .line 357
    .line 358
    invoke-virtual {v0, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 359
    .line 360
    .line 361
    move-result-object v0

    .line 362
    goto :goto_2

    .line 363
    :cond_6
    move-object v0, v5

    .line 364
    :goto_2
    monitor-enter v4

    .line 365
    :try_start_2
    iput-object v0, v4, Ltr2;->y:Ljava/lang/String;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 366
    .line 367
    monitor-exit v4

    .line 368
    iget-object v0, v1, Lh83;->a:Lf20;

    .line 369
    .line 370
    iget-object v0, v0, Lf20;->g:Ljava/lang/Object;

    .line 371
    .line 372
    check-cast v0, Ll83;

    .line 373
    .line 374
    invoke-virtual {v4}, Ltr2;->q()I

    .line 375
    .line 376
    .line 377
    move-result v1

    .line 378
    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 379
    .line 380
    .line 381
    move-result-object v1

    .line 382
    iget-object v6, v0, Ll83;->h:Ljava/util/ArrayList;

    .line 383
    .line 384
    invoke-virtual {v6, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 385
    .line 386
    .line 387
    move-result v1

    .line 388
    const/4 v6, 0x1

    .line 389
    if-eqz v1, :cond_c

    .line 390
    .line 391
    invoke-virtual {v4}, Ltr2;->q()I

    .line 392
    .line 393
    .line 394
    move-result v1

    .line 395
    const/4 v7, 0x3

    .line 396
    if-ne v1, v7, :cond_9

    .line 397
    .line 398
    invoke-virtual {v4}, Ltr2;->g()Ljava/lang/String;

    .line 399
    .line 400
    .line 401
    move-result-object v1

    .line 402
    if-eqz v1, :cond_8

    .line 403
    .line 404
    iget-object v0, v0, Ll83;->i:Ljava/util/ArrayList;

    .line 405
    .line 406
    invoke-virtual {v4}, Ltr2;->g()Ljava/lang/String;

    .line 407
    .line 408
    .line 409
    move-result-object v1

    .line 410
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 411
    .line 412
    .line 413
    move-result v0

    .line 414
    if-eqz v0, :cond_7

    .line 415
    .line 416
    goto :goto_3

    .line 417
    :cond_7
    new-instance v0, Lr13;

    .line 418
    .line 419
    const-string v1, "Unexpected custom template id in the response."

    .line 420
    .line 421
    invoke-direct {v0, v1, v6}, Lhx2;-><init>(Ljava/lang/String;I)V

    .line 422
    .line 423
    .line 424
    throw v0

    .line 425
    :cond_8
    new-instance v0, Lr13;

    .line 426
    .line 427
    const-string v1, "No custom template id for custom template ad response."

    .line 428
    .line 429
    invoke-direct {v0, v1, v6}, Lhx2;-><init>(Ljava/lang/String;I)V

    .line 430
    .line 431
    .line 432
    throw v0

    .line 433
    :cond_9
    :goto_3
    const-string v0, "rating"

    .line 434
    .line 435
    const-wide/high16 v8, -0x4010000000000000L    # -1.0

    .line 436
    .line 437
    invoke-virtual {v3, v0, v8, v9}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;D)D

    .line 438
    .line 439
    .line 440
    move-result-wide v0

    .line 441
    monitor-enter v4

    .line 442
    :try_start_3
    iput-wide v0, v4, Ltr2;->r:D
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 443
    .line 444
    monitor-exit v4

    .line 445
    const-string v0, "headline"

    .line 446
    .line 447
    invoke-virtual {v3, v0, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 448
    .line 449
    .line 450
    move-result-object v0

    .line 451
    iget-boolean v1, v2, La83;->M:Z

    .line 452
    .line 453
    if-eqz v1, :cond_b

    .line 454
    .line 455
    sget-object v1, Lhg4;->C:Lhg4;

    .line 456
    .line 457
    iget-object v2, v1, Lhg4;->c:Llf4;

    .line 458
    .line 459
    iget-object v1, v1, Lhg4;->h:Lgd2;

    .line 460
    .line 461
    invoke-virtual {v1}, Lgd2;->c()Landroid/content/res/Resources;

    .line 462
    .line 463
    .line 464
    move-result-object v1

    .line 465
    if-eqz v1, :cond_a

    .line 466
    .line 467
    const v2, 0x7f120106

    .line 468
    .line 469
    .line 470
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 471
    .line 472
    .line 473
    move-result-object v1

    .line 474
    goto :goto_4

    .line 475
    :cond_a
    const-string v1, "Test Ad"

    .line 476
    .line 477
    :goto_4
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 478
    .line 479
    .line 480
    move-result-object v2

    .line 481
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 482
    .line 483
    .line 484
    move-result v2

    .line 485
    add-int/2addr v2, v7

    .line 486
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 487
    .line 488
    .line 489
    move-result-object v6

    .line 490
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 491
    .line 492
    .line 493
    move-result v6

    .line 494
    new-instance v7, Ljava/lang/StringBuilder;

    .line 495
    .line 496
    add-int/2addr v2, v6

    .line 497
    invoke-direct {v7, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 498
    .line 499
    .line 500
    const-string v2, " : "

    .line 501
    .line 502
    invoke-static {v7, v1, v2, v0}, Lex0;->l(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 503
    .line 504
    .line 505
    move-result-object v0

    .line 506
    :cond_b
    const-string v1, "headline"

    .line 507
    .line 508
    invoke-virtual {v4, v1, v0}, Ltr2;->o(Ljava/lang/String;Ljava/lang/String;)V

    .line 509
    .line 510
    .line 511
    const-string v0, "body"

    .line 512
    .line 513
    invoke-virtual {v3, v0, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 514
    .line 515
    .line 516
    move-result-object v0

    .line 517
    const-string v1, "body"

    .line 518
    .line 519
    invoke-virtual {v4, v1, v0}, Ltr2;->o(Ljava/lang/String;Ljava/lang/String;)V

    .line 520
    .line 521
    .line 522
    const-string v0, "call_to_action"

    .line 523
    .line 524
    invoke-virtual {v3, v0, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 525
    .line 526
    .line 527
    move-result-object v0

    .line 528
    const-string v1, "call_to_action"

    .line 529
    .line 530
    invoke-virtual {v4, v1, v0}, Ltr2;->o(Ljava/lang/String;Ljava/lang/String;)V

    .line 531
    .line 532
    .line 533
    const-string v0, "store"

    .line 534
    .line 535
    invoke-virtual {v3, v0, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 536
    .line 537
    .line 538
    move-result-object v0

    .line 539
    const-string v1, "store"

    .line 540
    .line 541
    invoke-virtual {v4, v1, v0}, Ltr2;->o(Ljava/lang/String;Ljava/lang/String;)V

    .line 542
    .line 543
    .line 544
    const-string v0, "price"

    .line 545
    .line 546
    invoke-virtual {v3, v0, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 547
    .line 548
    .line 549
    move-result-object v0

    .line 550
    const-string v1, "price"

    .line 551
    .line 552
    invoke-virtual {v4, v1, v0}, Ltr2;->o(Ljava/lang/String;Ljava/lang/String;)V

    .line 553
    .line 554
    .line 555
    const-string v0, "advertiser"

    .line 556
    .line 557
    invoke-virtual {v3, v0, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 558
    .line 559
    .line 560
    move-result-object v0

    .line 561
    const-string v1, "advertiser"

    .line 562
    .line 563
    invoke-virtual {v4, v1, v0}, Ltr2;->o(Ljava/lang/String;Ljava/lang/String;)V

    .line 564
    .line 565
    .line 566
    return-object v4

    .line 567
    :catchall_0
    move-exception v0

    .line 568
    :try_start_4
    monitor-exit v4
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 569
    throw v0

    .line 570
    :cond_c
    new-instance v0, Lr13;

    .line 571
    .line 572
    invoke-virtual {v4}, Ltr2;->q()I

    .line 573
    .line 574
    .line 575
    move-result v1

    .line 576
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 577
    .line 578
    .line 579
    move-result-object v2

    .line 580
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 581
    .line 582
    .line 583
    move-result v2

    .line 584
    new-instance v3, Ljava/lang/StringBuilder;

    .line 585
    .line 586
    add-int/lit8 v2, v2, 0x15

    .line 587
    .line 588
    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 589
    .line 590
    .line 591
    const-string v2, "Invalid template ID: "

    .line 592
    .line 593
    invoke-static {v3, v2, v1}, Lex0;->j(Ljava/lang/StringBuilder;Ljava/lang/String;I)Ljava/lang/String;

    .line 594
    .line 595
    .line 596
    move-result-object v1

    .line 597
    invoke-direct {v0, v1, v6}, Lhx2;-><init>(Ljava/lang/String;I)V

    .line 598
    .line 599
    .line 600
    throw v0

    .line 601
    :catchall_1
    move-exception v0

    .line 602
    :try_start_5
    monitor-exit v4
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 603
    throw v0

    .line 604
    :catchall_2
    move-exception v0

    .line 605
    :try_start_6
    monitor-exit v4
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 606
    throw v0

    .line 607
    :catchall_3
    move-exception v0

    .line 608
    :try_start_7
    monitor-exit v4
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 609
    throw v0

    .line 610
    nop

    .line 611
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
