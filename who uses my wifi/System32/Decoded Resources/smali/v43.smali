.class public final Lv43;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ln53;


# instance fields
.field public final a:Ll83;

.field public final b:Landroid/content/pm/PackageInfo;

.field public final c:Lra4;


# direct methods
.method public constructor <init>(Ll83;Landroid/content/pm/PackageInfo;Lra4;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lv43;->a:Ll83;

    .line 5
    .line 6
    iput-object p2, p0, Lv43;->b:Landroid/content/pm/PackageInfo;

    .line 7
    .line 8
    iput-object p3, p0, Lv43;->c:Lra4;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Object;)V
    .locals 10

    .line 1
    iget-object v0, p0, Lv43;->a:Ll83;

    .line 2
    .line 3
    iget-object v1, v0, Ll83;->h:Ljava/util/ArrayList;

    .line 4
    .line 5
    check-cast p1, Ljm2;

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    goto/16 :goto_9

    .line 10
    .line 11
    :cond_0
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    const/4 v3, 0x0

    .line 16
    if-eqz v2, :cond_1

    .line 17
    .line 18
    iget-object p1, p1, Ljm2;->a:Landroid/os/Bundle;

    .line 19
    .line 20
    const-string v0, "native_version"

    .line 21
    .line 22
    invoke-virtual {p1, v0, v3}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :cond_1
    iget-object p1, p1, Ljm2;->a:Landroid/os/Bundle;

    .line 27
    .line 28
    const-string v2, "native_version"

    .line 29
    .line 30
    const/4 v4, 0x3

    .line 31
    invoke-virtual {p1, v2, v4}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 32
    .line 33
    .line 34
    const-string v2, "native_templates"

    .line 35
    .line 36
    invoke-virtual {p1, v2, v1}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 37
    .line 38
    .line 39
    iget-object v1, v0, Ll83;->i:Ljava/util/ArrayList;

    .line 40
    .line 41
    const-string v2, "native_custom_templates"

    .line 42
    .line 43
    invoke-virtual {p1, v2, v1}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 44
    .line 45
    .line 46
    iget-object v1, v0, Ll83;->j:Lr12;

    .line 47
    .line 48
    const/4 v2, 0x2

    .line 49
    const/4 v5, 0x1

    .line 50
    if-eqz v1, :cond_b

    .line 51
    .line 52
    iget v6, v1, Lr12;->f:I

    .line 53
    .line 54
    if-le v6, v4, :cond_6

    .line 55
    .line 56
    const-string v6, "enable_native_media_orientation"

    .line 57
    .line 58
    invoke-virtual {p1, v6, v5}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 59
    .line 60
    .line 61
    iget v6, v1, Lr12;->m:I

    .line 62
    .line 63
    if-eq v6, v5, :cond_5

    .line 64
    .line 65
    if-eq v6, v2, :cond_4

    .line 66
    .line 67
    if-eq v6, v4, :cond_3

    .line 68
    .line 69
    const/4 v7, 0x4

    .line 70
    if-eq v6, v7, :cond_2

    .line 71
    .line 72
    const-string v6, "unknown"

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_2
    const-string v6, "square"

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_3
    const-string v6, "portrait"

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_4
    const-string v6, "landscape"

    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_5
    const-string v6, "any"

    .line 85
    .line 86
    :goto_0
    const-string v7, "unknown"

    .line 87
    .line 88
    invoke-virtual {v7, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result v7

    .line 92
    if-nez v7, :cond_6

    .line 93
    .line 94
    const-string v7, "native_media_orientation"

    .line 95
    .line 96
    invoke-virtual {p1, v7, v6}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    :cond_6
    iget v6, v1, Lr12;->h:I

    .line 100
    .line 101
    if-eqz v6, :cond_9

    .line 102
    .line 103
    if-eq v6, v5, :cond_8

    .line 104
    .line 105
    if-eq v6, v2, :cond_7

    .line 106
    .line 107
    const-string v6, "unknown"

    .line 108
    .line 109
    goto :goto_1

    .line 110
    :cond_7
    const-string v6, "landscape"

    .line 111
    .line 112
    goto :goto_1

    .line 113
    :cond_8
    const-string v6, "portrait"

    .line 114
    .line 115
    goto :goto_1

    .line 116
    :cond_9
    const-string v6, "any"

    .line 117
    .line 118
    :goto_1
    const-string v7, "unknown"

    .line 119
    .line 120
    invoke-virtual {v7, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    move-result v7

    .line 124
    if-nez v7, :cond_a

    .line 125
    .line 126
    const-string v7, "native_image_orientation"

    .line 127
    .line 128
    invoke-virtual {p1, v7, v6}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    :cond_a
    iget-boolean v6, v1, Lr12;->i:Z

    .line 132
    .line 133
    const-string v7, "native_multiple_images"

    .line 134
    .line 135
    invoke-virtual {p1, v7, v6}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 136
    .line 137
    .line 138
    iget-boolean v6, v1, Lr12;->l:Z

    .line 139
    .line 140
    const-string v7, "use_custom_mute"

    .line 141
    .line 142
    invoke-virtual {p1, v7, v6}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 143
    .line 144
    .line 145
    iget-object v6, p0, Lv43;->a:Ll83;

    .line 146
    .line 147
    iget-object v6, v6, Ll83;->j:Lr12;

    .line 148
    .line 149
    if-eqz v6, :cond_b

    .line 150
    .line 151
    iget v7, v6, Lr12;->n:I

    .line 152
    .line 153
    if-eqz v7, :cond_b

    .line 154
    .line 155
    iget-boolean v6, v6, Lr12;->o:Z

    .line 156
    .line 157
    const-string v8, "sccg_tap"

    .line 158
    .line 159
    invoke-virtual {p1, v8, v6}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 160
    .line 161
    .line 162
    const-string v6, "sccg_dir"

    .line 163
    .line 164
    invoke-virtual {p1, v6, v7}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 165
    .line 166
    .line 167
    :cond_b
    iget-object v6, p0, Lv43;->b:Landroid/content/pm/PackageInfo;

    .line 168
    .line 169
    if-nez v6, :cond_c

    .line 170
    .line 171
    goto :goto_2

    .line 172
    :cond_c
    iget v3, v6, Landroid/content/pm/PackageInfo;->versionCode:I

    .line 173
    .line 174
    :goto_2
    iget-object v6, p0, Lv43;->c:Lra4;

    .line 175
    .line 176
    invoke-virtual {v6}, Lra4;->h()V

    .line 177
    .line 178
    .line 179
    iget-object v7, v6, Lra4;->a:Ljava/lang/Object;

    .line 180
    .line 181
    monitor-enter v7

    .line 182
    :try_start_0
    iget v8, v6, Lra4;->r:I

    .line 183
    .line 184
    monitor-exit v7
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    .line 185
    if-le v3, v8, :cond_10

    .line 186
    .line 187
    invoke-virtual {v6}, Lra4;->h()V

    .line 188
    .line 189
    .line 190
    iget-object v7, v6, Lra4;->a:Ljava/lang/Object;

    .line 191
    .line 192
    monitor-enter v7

    .line 193
    :try_start_1
    new-instance v8, Lorg/json/JSONObject;

    .line 194
    .line 195
    invoke-direct {v8}, Lorg/json/JSONObject;-><init>()V

    .line 196
    .line 197
    .line 198
    iput-object v8, v6, Lra4;->t:Lorg/json/JSONObject;

    .line 199
    .line 200
    iget-object v8, v6, Lra4;->g:Landroid/content/SharedPreferences$Editor;

    .line 201
    .line 202
    if-eqz v8, :cond_d

    .line 203
    .line 204
    const-string v9, "native_advanced_settings"

    .line 205
    .line 206
    invoke-interface {v8, v9}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 207
    .line 208
    .line 209
    iget-object v8, v6, Lra4;->g:Landroid/content/SharedPreferences$Editor;

    .line 210
    .line 211
    invoke-interface {v8}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 212
    .line 213
    .line 214
    goto :goto_3

    .line 215
    :catchall_0
    move-exception p1

    .line 216
    goto :goto_5

    .line 217
    :cond_d
    :goto_3
    invoke-virtual {v6}, Lra4;->i()V

    .line 218
    .line 219
    .line 220
    monitor-exit v7
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 221
    invoke-virtual {v6}, Lra4;->h()V

    .line 222
    .line 223
    .line 224
    iget-object v8, v6, Lra4;->a:Ljava/lang/Object;

    .line 225
    .line 226
    monitor-enter v8

    .line 227
    :try_start_2
    iget v7, v6, Lra4;->r:I

    .line 228
    .line 229
    if-ne v7, v3, :cond_e

    .line 230
    .line 231
    monitor-exit v8

    .line 232
    goto :goto_6

    .line 233
    :catchall_1
    move-exception p1

    .line 234
    goto :goto_4

    .line 235
    :cond_e
    iput v3, v6, Lra4;->r:I

    .line 236
    .line 237
    iget-object v7, v6, Lra4;->g:Landroid/content/SharedPreferences$Editor;

    .line 238
    .line 239
    if-eqz v7, :cond_f

    .line 240
    .line 241
    const-string v9, "version_code"

    .line 242
    .line 243
    invoke-interface {v7, v9, v3}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 244
    .line 245
    .line 246
    iget-object v3, v6, Lra4;->g:Landroid/content/SharedPreferences$Editor;

    .line 247
    .line 248
    invoke-interface {v3}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 249
    .line 250
    .line 251
    :cond_f
    invoke-virtual {v6}, Lra4;->i()V

    .line 252
    .line 253
    .line 254
    monitor-exit v8

    .line 255
    goto :goto_6

    .line 256
    :goto_4
    monitor-exit v8
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 257
    throw p1

    .line 258
    :goto_5
    :try_start_3
    monitor-exit v7
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 259
    throw p1

    .line 260
    :cond_10
    :goto_6
    invoke-virtual {v6}, Lra4;->h()V

    .line 261
    .line 262
    .line 263
    iget-object v3, v6, Lra4;->a:Ljava/lang/Object;

    .line 264
    .line 265
    monitor-enter v3

    .line 266
    :try_start_4
    iget-object v6, v6, Lra4;->t:Lorg/json/JSONObject;

    .line 267
    .line 268
    monitor-exit v3
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 269
    const/4 v3, 0x0

    .line 270
    if-eqz v6, :cond_11

    .line 271
    .line 272
    iget-object v7, v0, Ll83;->g:Ljava/lang/String;

    .line 273
    .line 274
    invoke-virtual {v6, v7}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 275
    .line 276
    .line 277
    move-result-object v6

    .line 278
    if-eqz v6, :cond_11

    .line 279
    .line 280
    invoke-virtual {v6}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    .line 281
    .line 282
    .line 283
    move-result-object v3

    .line 284
    :cond_11
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 285
    .line 286
    .line 287
    move-result v6

    .line 288
    if-nez v6, :cond_12

    .line 289
    .line 290
    const-string v6, "native_advanced_settings"

    .line 291
    .line 292
    invoke-virtual {p1, v6, v3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 293
    .line 294
    .line 295
    :cond_12
    iget v3, v0, Ll83;->l:I

    .line 296
    .line 297
    if-le v3, v5, :cond_13

    .line 298
    .line 299
    const-string v6, "max_num_ads"

    .line 300
    .line 301
    invoke-virtual {p1, v6, v3}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 302
    .line 303
    .line 304
    :cond_13
    iget-object v0, v0, Ll83;->b:Lf52;

    .line 305
    .line 306
    if-eqz v0, :cond_1a

    .line 307
    .line 308
    iget-object v3, v0, Lf52;->h:Ljava/lang/String;

    .line 309
    .line 310
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 311
    .line 312
    .line 313
    move-result v6

    .line 314
    if-eqz v6, :cond_19

    .line 315
    .line 316
    iget v3, v0, Lf52;->f:I

    .line 317
    .line 318
    if-lt v3, v2, :cond_16

    .line 319
    .line 320
    iget v0, v0, Lf52;->i:I

    .line 321
    .line 322
    if-eq v0, v2, :cond_15

    .line 323
    .line 324
    if-eq v0, v4, :cond_14

    .line 325
    .line 326
    const-string v0, "l"

    .line 327
    .line 328
    goto :goto_7

    .line 329
    :cond_14
    const-string v0, "p"

    .line 330
    .line 331
    goto :goto_7

    .line 332
    :cond_15
    const-string v0, "l"

    .line 333
    .line 334
    goto :goto_7

    .line 335
    :cond_16
    iget v0, v0, Lf52;->g:I

    .line 336
    .line 337
    if-eq v0, v5, :cond_17

    .line 338
    .line 339
    if-eq v0, v2, :cond_18

    .line 340
    .line 341
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 342
    .line 343
    .line 344
    move-result-object v2

    .line 345
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 346
    .line 347
    .line 348
    move-result v2

    .line 349
    new-instance v3, Ljava/lang/StringBuilder;

    .line 350
    .line 351
    add-int/lit8 v2, v2, 0x29

    .line 352
    .line 353
    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 354
    .line 355
    .line 356
    const-string v2, "Instream ad video aspect ratio "

    .line 357
    .line 358
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 359
    .line 360
    .line 361
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 362
    .line 363
    .line 364
    const-string v0, " is wrong."

    .line 365
    .line 366
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 367
    .line 368
    .line 369
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 370
    .line 371
    .line 372
    move-result-object v0

    .line 373
    invoke-static {v0}, Lgi2;->Z(Ljava/lang/String;)V

    .line 374
    .line 375
    .line 376
    :cond_17
    const-string v0, "l"

    .line 377
    .line 378
    goto :goto_7

    .line 379
    :cond_18
    const-string v0, "p"

    .line 380
    .line 381
    :goto_7
    const-string v2, "ia_var"

    .line 382
    .line 383
    invoke-virtual {p1, v2, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 384
    .line 385
    .line 386
    goto :goto_8

    .line 387
    :cond_19
    const-string v0, "ad_tag"

    .line 388
    .line 389
    invoke-virtual {p1, v0, v3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 390
    .line 391
    .line 392
    :goto_8
    const-string v0, "instr"

    .line 393
    .line 394
    invoke-virtual {p1, v0, v5}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 395
    .line 396
    .line 397
    :cond_1a
    sget-object v0, Lmz1;->Fc:Liz1;

    .line 398
    .line 399
    sget-object v2, Ltw1;->e:Ltw1;

    .line 400
    .line 401
    iget-object v2, v2, Ltw1;->c:Lkz1;

    .line 402
    .line 403
    invoke-virtual {v2, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 404
    .line 405
    .line 406
    move-result-object v0

    .line 407
    check-cast v0, Ljava/lang/Boolean;

    .line 408
    .line 409
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 410
    .line 411
    .line 412
    move-result v0

    .line 413
    if-eqz v0, :cond_1c

    .line 414
    .line 415
    if-eqz v1, :cond_1c

    .line 416
    .line 417
    iget-object v0, v1, Lr12;->k:Lih3;

    .line 418
    .line 419
    if-eqz v0, :cond_1b

    .line 420
    .line 421
    new-instance v2, Landroid/os/Bundle;

    .line 422
    .line 423
    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 424
    .line 425
    .line 426
    const-string v3, "startMuted"

    .line 427
    .line 428
    iget-boolean v4, v0, Lih3;->f:Z

    .line 429
    .line 430
    invoke-virtual {v2, v3, v4}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 431
    .line 432
    .line 433
    const-string v3, "clickToExpandRequested"

    .line 434
    .line 435
    iget-boolean v4, v0, Lih3;->h:Z

    .line 436
    .line 437
    invoke-virtual {v2, v3, v4}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 438
    .line 439
    .line 440
    const-string v3, "customControlsRequested"

    .line 441
    .line 442
    iget-boolean v0, v0, Lih3;->g:Z

    .line 443
    .line 444
    invoke-virtual {v2, v3, v0}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 445
    .line 446
    .line 447
    const-string v0, "video"

    .line 448
    .line 449
    invoke-virtual {p1, v0, v2}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 450
    .line 451
    .line 452
    :cond_1b
    iget-boolean v0, v1, Lr12;->g:Z

    .line 453
    .line 454
    const-string v2, "disable_image_loading"

    .line 455
    .line 456
    invoke-virtual {p1, v2, v0}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 457
    .line 458
    .line 459
    iget v0, v1, Lr12;->j:I

    .line 460
    .line 461
    const-string v1, "preferred_ad_choices_position"

    .line 462
    .line 463
    invoke-virtual {p1, v1, v0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 464
    .line 465
    .line 466
    :cond_1c
    :goto_9
    return-void

    .line 467
    :catchall_2
    move-exception p1

    .line 468
    :try_start_5
    monitor-exit v3
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 469
    throw p1

    .line 470
    :catchall_3
    move-exception p1

    .line 471
    :try_start_6
    monitor-exit v7
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 472
    throw p1
.end method

.method public final p(Ljava/lang/Object;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lv43;->a:Ll83;

    .line 2
    .line 3
    iget-object v1, v0, Ll83;->h:Ljava/util/ArrayList;

    .line 4
    .line 5
    check-cast p1, Ljm2;

    .line 6
    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    iget-object p1, p1, Ljm2;->b:Landroid/os/Bundle;

    .line 17
    .line 18
    iget-object v0, v0, Ll83;->j:Lr12;

    .line 19
    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    iget v1, v0, Lr12;->n:I

    .line 23
    .line 24
    if-eqz v1, :cond_1

    .line 25
    .line 26
    iget-boolean v0, v0, Lr12;->o:Z

    .line 27
    .line 28
    const-string v2, "sccg_tap"

    .line 29
    .line 30
    invoke-virtual {p1, v2, v0}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 31
    .line 32
    .line 33
    const-string v0, "sccg_dir"

    .line 34
    .line 35
    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 36
    .line 37
    .line 38
    :cond_1
    :goto_0
    return-void
.end method
