.class public abstract Lj13;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lzz2;


# virtual methods
.method public final a(Lh83;La83;)Z
    .locals 1

    .line 1
    iget-object p1, p2, La83;->v:Lorg/json/JSONObject;

    .line 2
    .line 3
    const-string p2, "pubid"

    .line 4
    .line 5
    const-string v0, ""

    .line 6
    .line 7
    invoke-virtual {p1, p2, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-nez p1, :cond_0

    .line 16
    .line 17
    const/4 p1, 0x1

    .line 18
    return p1

    .line 19
    :cond_0
    const/4 p1, 0x0

    .line 20
    return p1
.end method

.method public final b(Lh83;La83;)Ln70;
    .locals 39

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    iget-object v2, v1, La83;->v:Lorg/json/JSONObject;

    .line 6
    .line 7
    const-string v3, "pubid"

    .line 8
    .line 9
    const-string v4, ""

    .line 10
    .line 11
    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    iget-object v4, v0, Lh83;->a:Lf20;

    .line 16
    .line 17
    iget-object v4, v4, Lf20;->g:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v4, Ll83;

    .line 20
    .line 21
    new-instance v5, Lk83;

    .line 22
    .line 23
    invoke-direct {v5}, Lk83;-><init>()V

    .line 24
    .line 25
    .line 26
    iget-object v6, v4, Ll83;->p:Lh80;

    .line 27
    .line 28
    iget v6, v6, Lh80;->g:I

    .line 29
    .line 30
    iget-object v7, v5, Lk83;->o:Lh80;

    .line 31
    .line 32
    iput v6, v7, Lh80;->g:I

    .line 33
    .line 34
    iget-object v6, v4, Ll83;->d:Lpc4;

    .line 35
    .line 36
    iput-object v6, v5, Lk83;->a:Lpc4;

    .line 37
    .line 38
    iget-object v7, v4, Ll83;->f:Lxe4;

    .line 39
    .line 40
    iput-object v7, v5, Lk83;->b:Lxe4;

    .line 41
    .line 42
    iget-object v7, v4, Ll83;->v:Lpk2;

    .line 43
    .line 44
    iput-object v7, v5, Lk83;->v:Lpk2;

    .line 45
    .line 46
    iget-object v7, v4, Ll83;->g:Ljava/lang/String;

    .line 47
    .line 48
    iput-object v7, v5, Lk83;->c:Ljava/lang/String;

    .line 49
    .line 50
    iget-object v8, v4, Ll83;->a:Lih3;

    .line 51
    .line 52
    iput-object v8, v5, Lk83;->d:Lih3;

    .line 53
    .line 54
    iget-object v8, v4, Ll83;->h:Ljava/util/ArrayList;

    .line 55
    .line 56
    iput-object v8, v5, Lk83;->f:Ljava/util/ArrayList;

    .line 57
    .line 58
    iget-object v8, v4, Ll83;->i:Ljava/util/ArrayList;

    .line 59
    .line 60
    iput-object v8, v5, Lk83;->g:Ljava/util/ArrayList;

    .line 61
    .line 62
    iget-object v8, v4, Ll83;->j:Lr12;

    .line 63
    .line 64
    iput-object v8, v5, Lk83;->h:Lr12;

    .line 65
    .line 66
    iget-object v8, v4, Ll83;->k:Lvi4;

    .line 67
    .line 68
    iput-object v8, v5, Lk83;->i:Lvi4;

    .line 69
    .line 70
    iget-object v8, v4, Ll83;->m:Lz2;

    .line 71
    .line 72
    iput-object v8, v5, Lk83;->j:Lz2;

    .line 73
    .line 74
    if-eqz v8, :cond_0

    .line 75
    .line 76
    iget-boolean v8, v8, Lz2;->f:Z

    .line 77
    .line 78
    iput-boolean v8, v5, Lk83;->e:Z

    .line 79
    .line 80
    :cond_0
    iget-object v8, v4, Ll83;->n:Lvm0;

    .line 81
    .line 82
    iput-object v8, v5, Lk83;->k:Lvm0;

    .line 83
    .line 84
    if-eqz v8, :cond_1

    .line 85
    .line 86
    iget-boolean v9, v8, Lvm0;->f:Z

    .line 87
    .line 88
    iput-boolean v9, v5, Lk83;->e:Z

    .line 89
    .line 90
    iget-object v8, v8, Lvm0;->g:Lwi2;

    .line 91
    .line 92
    iput-object v8, v5, Lk83;->l:Lwi2;

    .line 93
    .line 94
    :cond_1
    iget-boolean v8, v4, Ll83;->q:Z

    .line 95
    .line 96
    iput-boolean v8, v5, Lk83;->p:Z

    .line 97
    .line 98
    iget-boolean v8, v4, Ll83;->r:Z

    .line 99
    .line 100
    iput-boolean v8, v5, Lk83;->q:Z

    .line 101
    .line 102
    iget-object v8, v4, Ll83;->c:Ls23;

    .line 103
    .line 104
    iput-object v8, v5, Lk83;->r:Ls23;

    .line 105
    .line 106
    iget-boolean v8, v4, Ll83;->s:Z

    .line 107
    .line 108
    iput-boolean v8, v5, Lk83;->s:Z

    .line 109
    .line 110
    iget-object v8, v4, Ll83;->t:Landroid/os/Bundle;

    .line 111
    .line 112
    iput-object v8, v5, Lk83;->t:Landroid/os/Bundle;

    .line 113
    .line 114
    iget-object v4, v4, Ll83;->u:Ljava/util/concurrent/atomic/AtomicLong;

    .line 115
    .line 116
    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    .line 117
    .line 118
    .line 119
    move-result-wide v8

    .line 120
    iget-object v4, v5, Lk83;->u:Ljava/util/concurrent/atomic/AtomicLong;

    .line 121
    .line 122
    invoke-virtual {v4, v8, v9}, Ljava/util/concurrent/atomic/AtomicLong;->set(J)V

    .line 123
    .line 124
    .line 125
    iput-object v3, v5, Lk83;->c:Ljava/lang/String;

    .line 126
    .line 127
    iget-object v3, v6, Lpc4;->r:Landroid/os/Bundle;

    .line 128
    .line 129
    if-nez v3, :cond_2

    .line 130
    .line 131
    new-instance v3, Landroid/os/Bundle;

    .line 132
    .line 133
    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 134
    .line 135
    .line 136
    goto :goto_0

    .line 137
    :cond_2
    new-instance v4, Landroid/os/Bundle;

    .line 138
    .line 139
    invoke-direct {v4, v3}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    .line 140
    .line 141
    .line 142
    move-object v3, v4

    .line 143
    :goto_0
    const-string v4, "com.google.ads.mediation.admob.AdMobAdapter"

    .line 144
    .line 145
    invoke-virtual {v3, v4}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 146
    .line 147
    .line 148
    move-result-object v8

    .line 149
    if-nez v8, :cond_3

    .line 150
    .line 151
    new-instance v8, Landroid/os/Bundle;

    .line 152
    .line 153
    invoke-direct {v8}, Landroid/os/Bundle;-><init>()V

    .line 154
    .line 155
    .line 156
    move-object v12, v8

    .line 157
    goto :goto_1

    .line 158
    :cond_3
    new-instance v9, Landroid/os/Bundle;

    .line 159
    .line 160
    invoke-direct {v9, v8}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    .line 161
    .line 162
    .line 163
    move-object v12, v9

    .line 164
    :goto_1
    const-string v8, "gw"

    .line 165
    .line 166
    const/4 v9, 0x1

    .line 167
    invoke-virtual {v12, v8, v9}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 168
    .line 169
    .line 170
    const-string v8, "mad_hac"

    .line 171
    .line 172
    const/4 v10, 0x0

    .line 173
    invoke-virtual {v2, v8, v10}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object v11

    .line 177
    if-eqz v11, :cond_4

    .line 178
    .line 179
    invoke-virtual {v12, v8, v11}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    :cond_4
    const-string v8, "adJson"

    .line 183
    .line 184
    invoke-virtual {v2, v8, v10}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object v2

    .line 188
    if-eqz v2, :cond_5

    .line 189
    .line 190
    const-string v8, "_ad"

    .line 191
    .line 192
    invoke-virtual {v12, v8, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 193
    .line 194
    .line 195
    :cond_5
    const-string v2, "_noRefresh"

    .line 196
    .line 197
    invoke-virtual {v12, v2, v9}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 198
    .line 199
    .line 200
    iget-object v2, v1, La83;->D:Lorg/json/JSONObject;

    .line 201
    .line 202
    invoke-virtual {v2}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    .line 203
    .line 204
    .line 205
    move-result-object v8

    .line 206
    :cond_6
    :goto_2
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 207
    .line 208
    .line 209
    move-result v9

    .line 210
    if-eqz v9, :cond_7

    .line 211
    .line 212
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object v9

    .line 216
    check-cast v9, Ljava/lang/String;

    .line 217
    .line 218
    invoke-virtual {v2, v9, v10}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object v11

    .line 222
    if-eqz v9, :cond_6

    .line 223
    .line 224
    invoke-virtual {v12, v9, v11}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 225
    .line 226
    .line 227
    goto :goto_2

    .line 228
    :cond_7
    invoke-virtual {v3, v4, v12}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 229
    .line 230
    .line 231
    iget v9, v6, Lpc4;->f:I

    .line 232
    .line 233
    iget-wide v10, v6, Lpc4;->g:J

    .line 234
    .line 235
    iget v13, v6, Lpc4;->i:I

    .line 236
    .line 237
    iget-object v14, v6, Lpc4;->j:Ljava/util/List;

    .line 238
    .line 239
    iget-boolean v15, v6, Lpc4;->k:Z

    .line 240
    .line 241
    iget v2, v6, Lpc4;->l:I

    .line 242
    .line 243
    iget-boolean v4, v6, Lpc4;->m:Z

    .line 244
    .line 245
    iget-object v8, v6, Lpc4;->n:Ljava/lang/String;

    .line 246
    .line 247
    move/from16 v16, v2

    .line 248
    .line 249
    iget-object v2, v6, Lpc4;->o:Lqf3;

    .line 250
    .line 251
    move-object/from16 v19, v2

    .line 252
    .line 253
    iget-object v2, v6, Lpc4;->p:Landroid/location/Location;

    .line 254
    .line 255
    move-object/from16 v20, v2

    .line 256
    .line 257
    iget-object v2, v6, Lpc4;->q:Ljava/lang/String;

    .line 258
    .line 259
    move-object/from16 v21, v2

    .line 260
    .line 261
    iget-object v2, v6, Lpc4;->s:Landroid/os/Bundle;

    .line 262
    .line 263
    move-object/from16 v23, v2

    .line 264
    .line 265
    iget-object v2, v6, Lpc4;->t:Ljava/util/List;

    .line 266
    .line 267
    move-object/from16 v24, v2

    .line 268
    .line 269
    iget-object v2, v6, Lpc4;->u:Ljava/lang/String;

    .line 270
    .line 271
    move-object/from16 v25, v2

    .line 272
    .line 273
    iget-object v2, v6, Lpc4;->v:Ljava/lang/String;

    .line 274
    .line 275
    move-object/from16 v26, v2

    .line 276
    .line 277
    iget-boolean v2, v6, Lpc4;->w:Z

    .line 278
    .line 279
    move/from16 v27, v2

    .line 280
    .line 281
    iget-object v2, v6, Lpc4;->x:Lec2;

    .line 282
    .line 283
    move-object/from16 v28, v2

    .line 284
    .line 285
    iget v2, v6, Lpc4;->y:I

    .line 286
    .line 287
    move/from16 v29, v2

    .line 288
    .line 289
    iget-object v2, v6, Lpc4;->z:Ljava/lang/String;

    .line 290
    .line 291
    move-object/from16 v30, v2

    .line 292
    .line 293
    iget-object v2, v6, Lpc4;->A:Ljava/util/List;

    .line 294
    .line 295
    move-object/from16 v31, v2

    .line 296
    .line 297
    iget v2, v6, Lpc4;->B:I

    .line 298
    .line 299
    move/from16 v32, v2

    .line 300
    .line 301
    iget-object v2, v6, Lpc4;->C:Ljava/lang/String;

    .line 302
    .line 303
    move-object/from16 v33, v2

    .line 304
    .line 305
    iget v2, v6, Lpc4;->D:I

    .line 306
    .line 307
    move/from16 v34, v2

    .line 308
    .line 309
    move-object/from16 v22, v3

    .line 310
    .line 311
    iget-wide v2, v6, Lpc4;->E:J

    .line 312
    .line 313
    move-wide/from16 v35, v2

    .line 314
    .line 315
    iget-wide v2, v6, Lpc4;->F:J

    .line 316
    .line 317
    move-object/from16 v18, v8

    .line 318
    .line 319
    new-instance v8, Lpc4;

    .line 320
    .line 321
    move-wide/from16 v37, v2

    .line 322
    .line 323
    move/from16 v17, v4

    .line 324
    .line 325
    invoke-direct/range {v8 .. v38}, Lpc4;-><init>(IJLandroid/os/Bundle;ILjava/util/List;ZIZLjava/lang/String;Lqf3;Landroid/location/Location;Ljava/lang/String;Landroid/os/Bundle;Landroid/os/Bundle;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;ZLec2;ILjava/lang/String;Ljava/util/List;ILjava/lang/String;IJJ)V

    .line 326
    .line 327
    .line 328
    iput-object v8, v5, Lk83;->a:Lpc4;

    .line 329
    .line 330
    invoke-virtual {v5}, Lk83;->a()Ll83;

    .line 331
    .line 332
    .line 333
    move-result-object v2

    .line 334
    new-instance v3, Landroid/os/Bundle;

    .line 335
    .line 336
    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 337
    .line 338
    .line 339
    iget-object v4, v0, Lh83;->b:Lp21;

    .line 340
    .line 341
    iget-object v4, v4, Lp21;->g:Ljava/lang/Object;

    .line 342
    .line 343
    check-cast v4, Lc83;

    .line 344
    .line 345
    new-instance v5, Landroid/os/Bundle;

    .line 346
    .line 347
    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    .line 348
    .line 349
    .line 350
    new-instance v6, Ljava/util/ArrayList;

    .line 351
    .line 352
    iget-object v8, v4, Lc83;->a:Ljava/util/List;

    .line 353
    .line 354
    invoke-direct {v6, v8}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 355
    .line 356
    .line 357
    const-string v8, "nofill_urls"

    .line 358
    .line 359
    invoke-virtual {v5, v8, v6}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 360
    .line 361
    .line 362
    const-string v6, "refresh_interval"

    .line 363
    .line 364
    iget v8, v4, Lc83;->c:I

    .line 365
    .line 366
    invoke-virtual {v5, v6, v8}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 367
    .line 368
    .line 369
    const-string v6, "gws_query_id"

    .line 370
    .line 371
    iget-object v4, v4, Lc83;->b:Ljava/lang/String;

    .line 372
    .line 373
    invoke-virtual {v5, v6, v4}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 374
    .line 375
    .line 376
    const-string v4, "parent_common_config"

    .line 377
    .line 378
    invoke-virtual {v3, v4, v5}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 379
    .line 380
    .line 381
    new-instance v4, Landroid/os/Bundle;

    .line 382
    .line 383
    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    .line 384
    .line 385
    .line 386
    const-string v5, "initial_ad_unit_id"

    .line 387
    .line 388
    invoke-virtual {v4, v5, v7}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 389
    .line 390
    .line 391
    iget-object v5, v1, La83;->w:Ljava/lang/String;

    .line 392
    .line 393
    const-string v6, "allocation_id"

    .line 394
    .line 395
    invoke-virtual {v4, v6, v5}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 396
    .line 397
    .line 398
    iget-object v5, v1, La83;->F:Ljava/lang/String;

    .line 399
    .line 400
    const-string v6, "ad_source_name"

    .line 401
    .line 402
    invoke-virtual {v4, v6, v5}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 403
    .line 404
    .line 405
    new-instance v5, Ljava/util/ArrayList;

    .line 406
    .line 407
    iget-object v6, v1, La83;->c:Ljava/util/List;

    .line 408
    .line 409
    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 410
    .line 411
    .line 412
    const-string v6, "click_urls"

    .line 413
    .line 414
    invoke-virtual {v4, v6, v5}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 415
    .line 416
    .line 417
    new-instance v5, Ljava/util/ArrayList;

    .line 418
    .line 419
    iget-object v6, v1, La83;->d:Ljava/util/List;

    .line 420
    .line 421
    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 422
    .line 423
    .line 424
    const-string v6, "imp_urls"

    .line 425
    .line 426
    invoke-virtual {v4, v6, v5}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 427
    .line 428
    .line 429
    new-instance v5, Ljava/util/ArrayList;

    .line 430
    .line 431
    iget-object v6, v1, La83;->p:Ljava/util/List;

    .line 432
    .line 433
    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 434
    .line 435
    .line 436
    const-string v6, "manual_tracking_urls"

    .line 437
    .line 438
    invoke-virtual {v4, v6, v5}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 439
    .line 440
    .line 441
    new-instance v5, Ljava/util/ArrayList;

    .line 442
    .line 443
    iget-object v6, v1, La83;->m:Ljava/util/List;

    .line 444
    .line 445
    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 446
    .line 447
    .line 448
    const-string v6, "fill_urls"

    .line 449
    .line 450
    invoke-virtual {v4, v6, v5}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 451
    .line 452
    .line 453
    new-instance v5, Ljava/util/ArrayList;

    .line 454
    .line 455
    iget-object v6, v1, La83;->g:Ljava/util/List;

    .line 456
    .line 457
    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 458
    .line 459
    .line 460
    const-string v6, "video_start_urls"

    .line 461
    .line 462
    invoke-virtual {v4, v6, v5}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 463
    .line 464
    .line 465
    new-instance v5, Ljava/util/ArrayList;

    .line 466
    .line 467
    iget-object v6, v1, La83;->h:Ljava/util/List;

    .line 468
    .line 469
    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 470
    .line 471
    .line 472
    const-string v6, "video_reward_urls"

    .line 473
    .line 474
    invoke-virtual {v4, v6, v5}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 475
    .line 476
    .line 477
    new-instance v5, Ljava/util/ArrayList;

    .line 478
    .line 479
    iget-object v6, v1, La83;->i:Ljava/util/List;

    .line 480
    .line 481
    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 482
    .line 483
    .line 484
    const-string v6, "video_complete_urls"

    .line 485
    .line 486
    invoke-virtual {v4, v6, v5}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 487
    .line 488
    .line 489
    iget-object v5, v1, La83;->j:Ljava/lang/String;

    .line 490
    .line 491
    const-string v6, "transaction_id"

    .line 492
    .line 493
    invoke-virtual {v4, v6, v5}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 494
    .line 495
    .line 496
    iget-object v5, v1, La83;->k:Ljava/lang/String;

    .line 497
    .line 498
    const-string v6, "valid_from_timestamp"

    .line 499
    .line 500
    invoke-virtual {v4, v6, v5}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 501
    .line 502
    .line 503
    iget-boolean v5, v1, La83;->P:Z

    .line 504
    .line 505
    const-string v6, "is_closable_area_disabled"

    .line 506
    .line 507
    invoke-virtual {v4, v6, v5}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 508
    .line 509
    .line 510
    iget-object v5, v1, La83;->o0:Ljava/lang/String;

    .line 511
    .line 512
    const-string v6, "recursive_server_response_data"

    .line 513
    .line 514
    invoke-virtual {v4, v6, v5}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 515
    .line 516
    .line 517
    iget-boolean v5, v1, La83;->W:Z

    .line 518
    .line 519
    const-string v6, "is_analytics_logging_enabled"

    .line 520
    .line 521
    invoke-virtual {v4, v6, v5}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 522
    .line 523
    .line 524
    iget-object v5, v1, La83;->l:Lta2;

    .line 525
    .line 526
    if-eqz v5, :cond_8

    .line 527
    .line 528
    new-instance v6, Landroid/os/Bundle;

    .line 529
    .line 530
    invoke-direct {v6}, Landroid/os/Bundle;-><init>()V

    .line 531
    .line 532
    .line 533
    const-string v7, "rb_amount"

    .line 534
    .line 535
    iget v8, v5, Lta2;->g:I

    .line 536
    .line 537
    invoke-virtual {v6, v7, v8}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 538
    .line 539
    .line 540
    const-string v7, "rb_type"

    .line 541
    .line 542
    iget-object v5, v5, Lta2;->f:Ljava/lang/String;

    .line 543
    .line 544
    invoke-virtual {v6, v7, v5}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 545
    .line 546
    .line 547
    filled-new-array {v6}, [Landroid/os/Bundle;

    .line 548
    .line 549
    .line 550
    move-result-object v5

    .line 551
    const-string v6, "rewards"

    .line 552
    .line 553
    invoke-virtual {v4, v6, v5}, Landroid/os/Bundle;->putParcelableArray(Ljava/lang/String;[Landroid/os/Parcelable;)V

    .line 554
    .line 555
    .line 556
    :cond_8
    const-string v5, "parent_ad_config"

    .line 557
    .line 558
    invoke-virtual {v3, v5, v4}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 559
    .line 560
    .line 561
    move-object/from16 v4, p0

    .line 562
    .line 563
    invoke-virtual {v4, v2, v3, v1, v0}, Lj13;->c(Ll83;Landroid/os/Bundle;La83;Lh83;)Lq93;

    .line 564
    .line 565
    .line 566
    move-result-object v0

    .line 567
    return-object v0
.end method

.method public abstract c(Ll83;Landroid/os/Bundle;La83;Lh83;)Lq93;
.end method
