.class public final Lio;
.super Lsv0;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final synthetic d:I


# direct methods
.method public synthetic constructor <init>(Lpq0;I)V
    .locals 0

    .line 1
    iput p2, p0, Lio;->d:I

    .line 2
    .line 3
    invoke-direct {p0, p1}, Lsv0;-><init>(Lpq0;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final b()Ljava/lang/String;
    .locals 1

    .line 1
    iget v0, p0, Lio;->d:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const-string v0, "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)"

    .line 7
    .line 8
    return-object v0

    .line 9
    :pswitch_0
    const-string v0, "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)"

    .line 10
    .line 11
    return-object v0

    .line 12
    :pswitch_1
    const-string v0, "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)"

    .line 13
    .line 14
    return-object v0

    .line 15
    :pswitch_2
    const-string v0, "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)"

    .line 16
    .line 17
    return-object v0

    .line 18
    :pswitch_3
    const-string v0, "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`system_id`) VALUES (?,?)"

    .line 19
    .line 20
    return-object v0

    .line 21
    :pswitch_4
    const-string v0, "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)"

    .line 22
    .line 23
    return-object v0

    .line 24
    :pswitch_5
    const-string v0, "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)"

    .line 25
    .line 26
    return-object v0

    .line 27
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

.method public final d(Lpx;Ljava/lang/Object;)V
    .locals 16

    .line 1
    move-object/from16 v1, p1

    .line 2
    .line 3
    move-object/from16 v2, p0

    .line 4
    .line 5
    iget v0, v2, Lio;->d:I

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    move-object/from16 v0, p2

    .line 11
    .line 12
    check-cast v0, Lpa1;

    .line 13
    .line 14
    iget-object v3, v0, Lpa1;->a:Ljava/lang/String;

    .line 15
    .line 16
    const/4 v4, 0x1

    .line 17
    if-nez v3, :cond_0

    .line 18
    .line 19
    invoke-virtual {v1, v4}, Llx;->g(I)V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    invoke-virtual {v1, v3, v4}, Llx;->h(Ljava/lang/String;I)V

    .line 24
    .line 25
    .line 26
    :goto_0
    iget-object v0, v0, Lpa1;->b:Ljava/lang/String;

    .line 27
    .line 28
    const/4 v3, 0x2

    .line 29
    if-nez v0, :cond_1

    .line 30
    .line 31
    invoke-virtual {v1, v3}, Llx;->g(I)V

    .line 32
    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_1
    invoke-virtual {v1, v0, v3}, Llx;->h(Ljava/lang/String;I)V

    .line 36
    .line 37
    .line 38
    :goto_1
    return-void

    .line 39
    :pswitch_0
    move-object/from16 v0, p2

    .line 40
    .line 41
    check-cast v0, Loa1;

    .line 42
    .line 43
    iget-object v3, v0, Loa1;->a:Ljava/lang/String;

    .line 44
    .line 45
    const/4 v4, 0x1

    .line 46
    if-nez v3, :cond_2

    .line 47
    .line 48
    invoke-virtual {v1, v4}, Llx;->g(I)V

    .line 49
    .line 50
    .line 51
    goto :goto_2

    .line 52
    :cond_2
    invoke-virtual {v1, v3, v4}, Llx;->h(Ljava/lang/String;I)V

    .line 53
    .line 54
    .line 55
    :goto_2
    iget v3, v0, Loa1;->b:I

    .line 56
    .line 57
    invoke-static {v3}, Lwl2;->w(I)I

    .line 58
    .line 59
    .line 60
    move-result v3

    .line 61
    int-to-long v5, v3

    .line 62
    const/4 v3, 0x2

    .line 63
    invoke-virtual {v1, v3, v5, v6}, Llx;->f(IJ)V

    .line 64
    .line 65
    .line 66
    iget-object v5, v0, Loa1;->c:Ljava/lang/String;

    .line 67
    .line 68
    const/4 v6, 0x3

    .line 69
    if-nez v5, :cond_3

    .line 70
    .line 71
    invoke-virtual {v1, v6}, Llx;->g(I)V

    .line 72
    .line 73
    .line 74
    goto :goto_3

    .line 75
    :cond_3
    invoke-virtual {v1, v5, v6}, Llx;->h(Ljava/lang/String;I)V

    .line 76
    .line 77
    .line 78
    :goto_3
    iget-object v5, v0, Loa1;->d:Ljava/lang/String;

    .line 79
    .line 80
    const/4 v7, 0x4

    .line 81
    if-nez v5, :cond_4

    .line 82
    .line 83
    invoke-virtual {v1, v7}, Llx;->g(I)V

    .line 84
    .line 85
    .line 86
    goto :goto_4

    .line 87
    :cond_4
    invoke-virtual {v1, v5, v7}, Llx;->h(Ljava/lang/String;I)V

    .line 88
    .line 89
    .line 90
    :goto_4
    iget-object v5, v0, Loa1;->e:Lim;

    .line 91
    .line 92
    invoke-static {v5}, Lim;->c(Lim;)[B

    .line 93
    .line 94
    .line 95
    move-result-object v5

    .line 96
    const/4 v8, 0x5

    .line 97
    if-nez v5, :cond_5

    .line 98
    .line 99
    invoke-virtual {v1, v8}, Llx;->g(I)V

    .line 100
    .line 101
    .line 102
    goto :goto_5

    .line 103
    :cond_5
    invoke-virtual {v1, v8, v5}, Llx;->c(I[B)V

    .line 104
    .line 105
    .line 106
    :goto_5
    iget-object v5, v0, Loa1;->f:Lim;

    .line 107
    .line 108
    invoke-static {v5}, Lim;->c(Lim;)[B

    .line 109
    .line 110
    .line 111
    move-result-object v5

    .line 112
    const/4 v9, 0x6

    .line 113
    if-nez v5, :cond_6

    .line 114
    .line 115
    invoke-virtual {v1, v9}, Llx;->g(I)V

    .line 116
    .line 117
    .line 118
    goto :goto_6

    .line 119
    :cond_6
    invoke-virtual {v1, v9, v5}, Llx;->c(I[B)V

    .line 120
    .line 121
    .line 122
    :goto_6
    const/4 v5, 0x7

    .line 123
    iget-wide v10, v0, Loa1;->g:J

    .line 124
    .line 125
    invoke-virtual {v1, v5, v10, v11}, Llx;->f(IJ)V

    .line 126
    .line 127
    .line 128
    const/16 v5, 0x8

    .line 129
    .line 130
    iget-wide v10, v0, Loa1;->h:J

    .line 131
    .line 132
    invoke-virtual {v1, v5, v10, v11}, Llx;->f(IJ)V

    .line 133
    .line 134
    .line 135
    const/16 v5, 0x9

    .line 136
    .line 137
    iget-wide v10, v0, Loa1;->i:J

    .line 138
    .line 139
    invoke-virtual {v1, v5, v10, v11}, Llx;->f(IJ)V

    .line 140
    .line 141
    .line 142
    iget v5, v0, Loa1;->k:I

    .line 143
    .line 144
    int-to-long v10, v5

    .line 145
    const/16 v5, 0xa

    .line 146
    .line 147
    invoke-virtual {v1, v5, v10, v11}, Llx;->f(IJ)V

    .line 148
    .line 149
    .line 150
    iget v5, v0, Loa1;->l:I

    .line 151
    .line 152
    invoke-static {v5}, Lex0;->s(I)I

    .line 153
    .line 154
    .line 155
    move-result v10

    .line 156
    const-string v12, " to int"

    .line 157
    .line 158
    const-string v13, "Could not convert "

    .line 159
    .line 160
    if-eqz v10, :cond_a

    .line 161
    .line 162
    if-ne v10, v4, :cond_7

    .line 163
    .line 164
    move v5, v4

    .line 165
    goto :goto_8

    .line 166
    :cond_7
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 167
    .line 168
    new-instance v1, Ljava/lang/StringBuilder;

    .line 169
    .line 170
    invoke-direct {v1, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 171
    .line 172
    .line 173
    const/4 v3, 0x1

    .line 174
    if-eq v5, v3, :cond_9

    .line 175
    .line 176
    const/4 v3, 0x2

    .line 177
    if-eq v5, v3, :cond_8

    .line 178
    .line 179
    const-string v3, "null"

    .line 180
    .line 181
    goto :goto_7

    .line 182
    :cond_8
    const-string v3, "LINEAR"

    .line 183
    .line 184
    goto :goto_7

    .line 185
    :cond_9
    const-string v3, "EXPONENTIAL"

    .line 186
    .line 187
    :goto_7
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 188
    .line 189
    .line 190
    invoke-virtual {v1, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 191
    .line 192
    .line 193
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object v1

    .line 197
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 198
    .line 199
    .line 200
    throw v0

    .line 201
    :cond_a
    const/4 v5, 0x0

    .line 202
    :goto_8
    const/16 v10, 0xb

    .line 203
    .line 204
    int-to-long v14, v5

    .line 205
    invoke-virtual {v1, v10, v14, v15}, Llx;->f(IJ)V

    .line 206
    .line 207
    .line 208
    const/16 v5, 0xc

    .line 209
    .line 210
    iget-wide v14, v0, Loa1;->m:J

    .line 211
    .line 212
    invoke-virtual {v1, v5, v14, v15}, Llx;->f(IJ)V

    .line 213
    .line 214
    .line 215
    const/16 v5, 0xd

    .line 216
    .line 217
    iget-wide v14, v0, Loa1;->n:J

    .line 218
    .line 219
    invoke-virtual {v1, v5, v14, v15}, Llx;->f(IJ)V

    .line 220
    .line 221
    .line 222
    const/16 v5, 0xe

    .line 223
    .line 224
    iget-wide v14, v0, Loa1;->o:J

    .line 225
    .line 226
    invoke-virtual {v1, v5, v14, v15}, Llx;->f(IJ)V

    .line 227
    .line 228
    .line 229
    const/16 v5, 0xf

    .line 230
    .line 231
    iget-wide v14, v0, Loa1;->p:J

    .line 232
    .line 233
    invoke-virtual {v1, v5, v14, v15}, Llx;->f(IJ)V

    .line 234
    .line 235
    .line 236
    iget-boolean v5, v0, Loa1;->q:Z

    .line 237
    .line 238
    const/16 v10, 0x10

    .line 239
    .line 240
    int-to-long v14, v5

    .line 241
    invoke-virtual {v1, v10, v14, v15}, Llx;->f(IJ)V

    .line 242
    .line 243
    .line 244
    iget v5, v0, Loa1;->r:I

    .line 245
    .line 246
    invoke-static {v5}, Lex0;->s(I)I

    .line 247
    .line 248
    .line 249
    move-result v10

    .line 250
    if-eqz v10, :cond_e

    .line 251
    .line 252
    if-ne v10, v4, :cond_b

    .line 253
    .line 254
    move v5, v4

    .line 255
    goto :goto_a

    .line 256
    :cond_b
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 257
    .line 258
    new-instance v1, Ljava/lang/StringBuilder;

    .line 259
    .line 260
    invoke-direct {v1, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 261
    .line 262
    .line 263
    const/4 v3, 0x1

    .line 264
    if-eq v5, v3, :cond_d

    .line 265
    .line 266
    const/4 v3, 0x2

    .line 267
    if-eq v5, v3, :cond_c

    .line 268
    .line 269
    const-string v3, "null"

    .line 270
    .line 271
    goto :goto_9

    .line 272
    :cond_c
    const-string v3, "DROP_WORK_REQUEST"

    .line 273
    .line 274
    goto :goto_9

    .line 275
    :cond_d
    const-string v3, "RUN_AS_NON_EXPEDITED_WORK_REQUEST"

    .line 276
    .line 277
    :goto_9
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 278
    .line 279
    .line 280
    invoke-virtual {v1, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 281
    .line 282
    .line 283
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 284
    .line 285
    .line 286
    move-result-object v1

    .line 287
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 288
    .line 289
    .line 290
    throw v0

    .line 291
    :cond_e
    const/4 v5, 0x0

    .line 292
    :goto_a
    const/16 v10, 0x11

    .line 293
    .line 294
    int-to-long v14, v5

    .line 295
    invoke-virtual {v1, v10, v14, v15}, Llx;->f(IJ)V

    .line 296
    .line 297
    .line 298
    iget-object v0, v0, Loa1;->j:Lri;

    .line 299
    .line 300
    const/16 v15, 0x15

    .line 301
    .line 302
    const/16 v8, 0x14

    .line 303
    .line 304
    const/16 v11, 0x13

    .line 305
    .line 306
    const/16 v5, 0x12

    .line 307
    .line 308
    if-eqz v0, :cond_1a

    .line 309
    .line 310
    iget v10, v0, Lri;->a:I

    .line 311
    .line 312
    invoke-static {v10}, Lex0;->s(I)I

    .line 313
    .line 314
    .line 315
    move-result v14

    .line 316
    if-eqz v14, :cond_13

    .line 317
    .line 318
    if-eq v14, v4, :cond_14

    .line 319
    .line 320
    if-eq v14, v3, :cond_12

    .line 321
    .line 322
    if-eq v14, v6, :cond_11

    .line 323
    .line 324
    if-eq v14, v7, :cond_10

    .line 325
    .line 326
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 327
    .line 328
    const/16 v4, 0x1e

    .line 329
    .line 330
    if-lt v3, v4, :cond_f

    .line 331
    .line 332
    if-ne v10, v9, :cond_f

    .line 333
    .line 334
    const/4 v4, 0x5

    .line 335
    goto :goto_c

    .line 336
    :cond_f
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 337
    .line 338
    new-instance v1, Ljava/lang/StringBuilder;

    .line 339
    .line 340
    invoke-direct {v1, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 341
    .line 342
    .line 343
    packed-switch v10, :pswitch_data_1

    .line 344
    .line 345
    .line 346
    const-string v3, "null"

    .line 347
    .line 348
    goto :goto_b

    .line 349
    :pswitch_1
    const-string v3, "TEMPORARILY_UNMETERED"

    .line 350
    .line 351
    goto :goto_b

    .line 352
    :pswitch_2
    const-string v3, "METERED"

    .line 353
    .line 354
    goto :goto_b

    .line 355
    :pswitch_3
    const-string v3, "NOT_ROAMING"

    .line 356
    .line 357
    goto :goto_b

    .line 358
    :pswitch_4
    const-string v3, "UNMETERED"

    .line 359
    .line 360
    goto :goto_b

    .line 361
    :pswitch_5
    const-string v3, "CONNECTED"

    .line 362
    .line 363
    goto :goto_b

    .line 364
    :pswitch_6
    const-string v3, "NOT_REQUIRED"

    .line 365
    .line 366
    :goto_b
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 367
    .line 368
    .line 369
    invoke-virtual {v1, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 370
    .line 371
    .line 372
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 373
    .line 374
    .line 375
    move-result-object v1

    .line 376
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 377
    .line 378
    .line 379
    throw v0

    .line 380
    :cond_10
    move v4, v7

    .line 381
    goto :goto_c

    .line 382
    :cond_11
    move v4, v6

    .line 383
    goto :goto_c

    .line 384
    :cond_12
    move v4, v3

    .line 385
    goto :goto_c

    .line 386
    :cond_13
    const/4 v4, 0x0

    .line 387
    :cond_14
    :goto_c
    int-to-long v3, v4

    .line 388
    invoke-virtual {v1, v5, v3, v4}, Llx;->f(IJ)V

    .line 389
    .line 390
    .line 391
    iget-boolean v3, v0, Lri;->b:Z

    .line 392
    .line 393
    int-to-long v3, v3

    .line 394
    invoke-virtual {v1, v11, v3, v4}, Llx;->f(IJ)V

    .line 395
    .line 396
    .line 397
    iget-boolean v3, v0, Lri;->c:Z

    .line 398
    .line 399
    int-to-long v3, v3

    .line 400
    invoke-virtual {v1, v8, v3, v4}, Llx;->f(IJ)V

    .line 401
    .line 402
    .line 403
    iget-boolean v3, v0, Lri;->d:Z

    .line 404
    .line 405
    int-to-long v3, v3

    .line 406
    invoke-virtual {v1, v15, v3, v4}, Llx;->f(IJ)V

    .line 407
    .line 408
    .line 409
    iget-boolean v3, v0, Lri;->e:Z

    .line 410
    .line 411
    int-to-long v3, v3

    .line 412
    const/16 v5, 0x16

    .line 413
    .line 414
    invoke-virtual {v1, v5, v3, v4}, Llx;->f(IJ)V

    .line 415
    .line 416
    .line 417
    iget-wide v3, v0, Lri;->f:J

    .line 418
    .line 419
    const/16 v5, 0x17

    .line 420
    .line 421
    invoke-virtual {v1, v5, v3, v4}, Llx;->f(IJ)V

    .line 422
    .line 423
    .line 424
    iget-wide v3, v0, Lri;->g:J

    .line 425
    .line 426
    const/16 v5, 0x18

    .line 427
    .line 428
    invoke-virtual {v1, v5, v3, v4}, Llx;->f(IJ)V

    .line 429
    .line 430
    .line 431
    iget-object v0, v0, Lri;->h:Lhj;

    .line 432
    .line 433
    iget-object v3, v0, Lhj;->a:Ljava/util/HashSet;

    .line 434
    .line 435
    iget-object v0, v0, Lhj;->a:Ljava/util/HashSet;

    .line 436
    .line 437
    invoke-virtual {v3}, Ljava/util/HashSet;->size()I

    .line 438
    .line 439
    .line 440
    move-result v3

    .line 441
    const/4 v4, 0x0

    .line 442
    if-nez v3, :cond_15

    .line 443
    .line 444
    goto :goto_11

    .line 445
    :cond_15
    new-instance v3, Ljava/io/ByteArrayOutputStream;

    .line 446
    .line 447
    invoke-direct {v3}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 448
    .line 449
    .line 450
    :try_start_0
    new-instance v5, Ljava/io/ObjectOutputStream;

    .line 451
    .line 452
    invoke-direct {v5, v3}, Ljava/io/ObjectOutputStream;-><init>(Ljava/io/OutputStream;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_3
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 453
    .line 454
    .line 455
    :try_start_1
    invoke-virtual {v0}, Ljava/util/HashSet;->size()I

    .line 456
    .line 457
    .line 458
    move-result v4

    .line 459
    invoke-virtual {v5, v4}, Ljava/io/ObjectOutputStream;->writeInt(I)V

    .line 460
    .line 461
    .line 462
    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 463
    .line 464
    .line 465
    move-result-object v0

    .line 466
    :goto_d
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 467
    .line 468
    .line 469
    move-result v4

    .line 470
    if-eqz v4, :cond_16

    .line 471
    .line 472
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 473
    .line 474
    .line 475
    move-result-object v4

    .line 476
    check-cast v4, Lgj;

    .line 477
    .line 478
    iget-object v6, v4, Lgj;->a:Landroid/net/Uri;

    .line 479
    .line 480
    invoke-virtual {v6}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 481
    .line 482
    .line 483
    move-result-object v6

    .line 484
    invoke-virtual {v5, v6}, Ljava/io/ObjectOutputStream;->writeUTF(Ljava/lang/String;)V

    .line 485
    .line 486
    .line 487
    iget-boolean v4, v4, Lgj;->b:Z

    .line 488
    .line 489
    invoke-virtual {v5, v4}, Ljava/io/ObjectOutputStream;->writeBoolean(Z)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 490
    .line 491
    .line 492
    goto :goto_d

    .line 493
    :catchall_0
    move-exception v0

    .line 494
    move-object v1, v0

    .line 495
    move-object v4, v5

    .line 496
    goto :goto_12

    .line 497
    :catch_0
    move-exception v0

    .line 498
    move-object v4, v5

    .line 499
    goto :goto_f

    .line 500
    :cond_16
    :try_start_2
    invoke-virtual {v5}, Ljava/io/ObjectOutputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    .line 501
    .line 502
    .line 503
    goto :goto_e

    .line 504
    :catch_1
    move-exception v0

    .line 505
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 506
    .line 507
    .line 508
    :cond_17
    :goto_e
    :try_start_3
    invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    .line 509
    .line 510
    .line 511
    goto :goto_10

    .line 512
    :catch_2
    move-exception v0

    .line 513
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 514
    .line 515
    .line 516
    goto :goto_10

    .line 517
    :catchall_1
    move-exception v0

    .line 518
    move-object v1, v0

    .line 519
    goto :goto_12

    .line 520
    :catch_3
    move-exception v0

    .line 521
    :goto_f
    :try_start_4
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 522
    .line 523
    .line 524
    if-eqz v4, :cond_17

    .line 525
    .line 526
    :try_start_5
    invoke-virtual {v4}, Ljava/io/ObjectOutputStream;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_1

    .line 527
    .line 528
    .line 529
    goto :goto_e

    .line 530
    :goto_10
    invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 531
    .line 532
    .line 533
    move-result-object v4

    .line 534
    :goto_11
    if-nez v4, :cond_18

    .line 535
    .line 536
    const/16 v3, 0x19

    .line 537
    .line 538
    invoke-virtual {v1, v3}, Llx;->g(I)V

    .line 539
    .line 540
    .line 541
    goto :goto_15

    .line 542
    :cond_18
    const/16 v3, 0x19

    .line 543
    .line 544
    invoke-virtual {v1, v3, v4}, Llx;->c(I[B)V

    .line 545
    .line 546
    .line 547
    goto :goto_15

    .line 548
    :goto_12
    if-eqz v4, :cond_19

    .line 549
    .line 550
    :try_start_6
    invoke-virtual {v4}, Ljava/io/ObjectOutputStream;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_4

    .line 551
    .line 552
    .line 553
    goto :goto_13

    .line 554
    :catch_4
    move-exception v0

    .line 555
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 556
    .line 557
    .line 558
    :cond_19
    :goto_13
    :try_start_7
    invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_5

    .line 559
    .line 560
    .line 561
    goto :goto_14

    .line 562
    :catch_5
    move-exception v0

    .line 563
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 564
    .line 565
    .line 566
    :goto_14
    throw v1

    .line 567
    :cond_1a
    invoke-virtual {v1, v5}, Llx;->g(I)V

    .line 568
    .line 569
    .line 570
    invoke-virtual {v1, v11}, Llx;->g(I)V

    .line 571
    .line 572
    .line 573
    invoke-virtual {v1, v8}, Llx;->g(I)V

    .line 574
    .line 575
    .line 576
    invoke-virtual {v1, v15}, Llx;->g(I)V

    .line 577
    .line 578
    .line 579
    const/16 v5, 0x16

    .line 580
    .line 581
    invoke-virtual {v1, v5}, Llx;->g(I)V

    .line 582
    .line 583
    .line 584
    const/16 v5, 0x17

    .line 585
    .line 586
    invoke-virtual {v1, v5}, Llx;->g(I)V

    .line 587
    .line 588
    .line 589
    const/16 v5, 0x18

    .line 590
    .line 591
    invoke-virtual {v1, v5}, Llx;->g(I)V

    .line 592
    .line 593
    .line 594
    const/16 v3, 0x19

    .line 595
    .line 596
    invoke-virtual {v1, v3}, Llx;->g(I)V

    .line 597
    .line 598
    .line 599
    :goto_15
    return-void

    .line 600
    :pswitch_7
    move-object/from16 v0, p2

    .line 601
    .line 602
    check-cast v0, Lka1;

    .line 603
    .line 604
    iget-object v3, v0, Lka1;->a:Ljava/lang/String;

    .line 605
    .line 606
    const/4 v4, 0x1

    .line 607
    if-nez v3, :cond_1b

    .line 608
    .line 609
    invoke-virtual {v1, v4}, Llx;->g(I)V

    .line 610
    .line 611
    .line 612
    goto :goto_16

    .line 613
    :cond_1b
    invoke-virtual {v1, v3, v4}, Llx;->h(Ljava/lang/String;I)V

    .line 614
    .line 615
    .line 616
    :goto_16
    iget-object v0, v0, Lka1;->b:Lim;

    .line 617
    .line 618
    invoke-static {v0}, Lim;->c(Lim;)[B

    .line 619
    .line 620
    .line 621
    move-result-object v0

    .line 622
    const/4 v3, 0x2

    .line 623
    if-nez v0, :cond_1c

    .line 624
    .line 625
    invoke-virtual {v1, v3}, Llx;->g(I)V

    .line 626
    .line 627
    .line 628
    goto :goto_17

    .line 629
    :cond_1c
    invoke-virtual {v1, v3, v0}, Llx;->c(I[B)V

    .line 630
    .line 631
    .line 632
    :goto_17
    return-void

    .line 633
    :pswitch_8
    move-object/from16 v0, p2

    .line 634
    .line 635
    check-cast v0, Lja1;

    .line 636
    .line 637
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 638
    .line 639
    .line 640
    const/4 v3, 0x1

    .line 641
    invoke-virtual {v1, v3}, Llx;->g(I)V

    .line 642
    .line 643
    .line 644
    iget-object v0, v0, Lja1;->a:Ljava/lang/String;

    .line 645
    .line 646
    const/4 v3, 0x2

    .line 647
    if-nez v0, :cond_1d

    .line 648
    .line 649
    invoke-virtual {v1, v3}, Llx;->g(I)V

    .line 650
    .line 651
    .line 652
    goto :goto_18

    .line 653
    :cond_1d
    invoke-virtual {v1, v0, v3}, Llx;->h(Ljava/lang/String;I)V

    .line 654
    .line 655
    .line 656
    :goto_18
    return-void

    .line 657
    :pswitch_9
    move-object/from16 v0, p2

    .line 658
    .line 659
    check-cast v0, Lsz0;

    .line 660
    .line 661
    iget-object v3, v0, Lsz0;->a:Ljava/lang/String;

    .line 662
    .line 663
    const/4 v4, 0x1

    .line 664
    if-nez v3, :cond_1e

    .line 665
    .line 666
    invoke-virtual {v1, v4}, Llx;->g(I)V

    .line 667
    .line 668
    .line 669
    goto :goto_19

    .line 670
    :cond_1e
    invoke-virtual {v1, v3, v4}, Llx;->h(Ljava/lang/String;I)V

    .line 671
    .line 672
    .line 673
    :goto_19
    iget v0, v0, Lsz0;->b:I

    .line 674
    .line 675
    int-to-long v3, v0

    .line 676
    const/4 v0, 0x2

    .line 677
    invoke-virtual {v1, v0, v3, v4}, Llx;->f(IJ)V

    .line 678
    .line 679
    .line 680
    return-void

    .line 681
    :pswitch_a
    move-object/from16 v0, p2

    .line 682
    .line 683
    check-cast v0, Lxl0;

    .line 684
    .line 685
    iget-object v3, v0, Lxl0;->a:Ljava/lang/String;

    .line 686
    .line 687
    const/4 v4, 0x1

    .line 688
    if-nez v3, :cond_1f

    .line 689
    .line 690
    invoke-virtual {v1, v4}, Llx;->g(I)V

    .line 691
    .line 692
    .line 693
    goto :goto_1a

    .line 694
    :cond_1f
    invoke-virtual {v1, v3, v4}, Llx;->h(Ljava/lang/String;I)V

    .line 695
    .line 696
    .line 697
    :goto_1a
    iget-object v0, v0, Lxl0;->b:Ljava/lang/Long;

    .line 698
    .line 699
    const/4 v3, 0x2

    .line 700
    if-nez v0, :cond_20

    .line 701
    .line 702
    invoke-virtual {v1, v3}, Llx;->g(I)V

    .line 703
    .line 704
    .line 705
    goto :goto_1b

    .line 706
    :cond_20
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 707
    .line 708
    .line 709
    move-result-wide v4

    .line 710
    invoke-virtual {v1, v3, v4, v5}, Llx;->f(IJ)V

    .line 711
    .line 712
    .line 713
    :goto_1b
    return-void

    .line 714
    :pswitch_b
    move-object/from16 v0, p2

    .line 715
    .line 716
    check-cast v0, Lgo;

    .line 717
    .line 718
    iget-object v3, v0, Lgo;->a:Ljava/lang/String;

    .line 719
    .line 720
    const/4 v4, 0x1

    .line 721
    if-nez v3, :cond_21

    .line 722
    .line 723
    invoke-virtual {v1, v4}, Llx;->g(I)V

    .line 724
    .line 725
    .line 726
    goto :goto_1c

    .line 727
    :cond_21
    invoke-virtual {v1, v3, v4}, Llx;->h(Ljava/lang/String;I)V

    .line 728
    .line 729
    .line 730
    :goto_1c
    iget-object v0, v0, Lgo;->b:Ljava/lang/String;

    .line 731
    .line 732
    const/4 v3, 0x2

    .line 733
    if-nez v0, :cond_22

    .line 734
    .line 735
    invoke-virtual {v1, v3}, Llx;->g(I)V

    .line 736
    .line 737
    .line 738
    goto :goto_1d

    .line 739
    :cond_22
    invoke-virtual {v1, v0, v3}, Llx;->h(Ljava/lang/String;I)V

    .line 740
    .line 741
    .line 742
    :goto_1d
    return-void

    .line 743
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_0
    .end packed-switch

    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public final e(Ljava/lang/Object;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lsv0;->a()Lpx;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    :try_start_0
    invoke-virtual {p0, v0, p1}, Lio;->d(Lpx;Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    iget-object p1, v0, Lpx;->i:Landroid/database/sqlite/SQLiteStatement;

    .line 9
    .line 10
    invoke-virtual {p1}, Landroid/database/sqlite/SQLiteStatement;->executeInsert()J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, v0}, Lsv0;->c(Lpx;)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :catchall_0
    move-exception p1

    .line 18
    invoke-virtual {p0, v0}, Lsv0;->c(Lpx;)V

    .line 19
    .line 20
    .line 21
    throw p1
.end method
