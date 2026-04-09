.class public final Lxh4;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final a:Landroid/net/Uri;

.field public final b:Ljs3;

.field public final c:Ljr3;

.field public final d:Lbi4;

.field public final e:Lhp2;

.field public final f:Lpf1;

.field public volatile g:Z

.field public h:Z

.field public i:J

.field public j:Lij3;

.field public k:Ljg1;

.field public l:Z

.field public final synthetic m:Lbi4;


# direct methods
.method public constructor <init>(Lbi4;Landroid/net/Uri;Lth3;Ljr3;Lbi4;Lhp2;)V
    .locals 8

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lxh4;->m:Lbi4;

    .line 5
    .line 6
    iput-object p2, p0, Lxh4;->a:Landroid/net/Uri;

    .line 7
    .line 8
    new-instance p1, Ljs3;

    .line 9
    .line 10
    invoke-direct {p1, p3}, Ljs3;-><init>(Lth3;)V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lxh4;->b:Ljs3;

    .line 14
    .line 15
    iput-object p4, p0, Lxh4;->c:Ljr3;

    .line 16
    .line 17
    iput-object p5, p0, Lxh4;->d:Lbi4;

    .line 18
    .line 19
    iput-object p6, p0, Lxh4;->e:Lhp2;

    .line 20
    .line 21
    new-instance p1, Lpf1;

    .line 22
    .line 23
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 24
    .line 25
    .line 26
    iput-object p1, p0, Lxh4;->f:Lpf1;

    .line 27
    .line 28
    const/4 p1, 0x1

    .line 29
    iput-boolean p1, p0, Lxh4;->h:Z

    .line 30
    .line 31
    sget-object p1, Lch4;->a:Ljava/util/concurrent/atomic/AtomicLong;

    .line 32
    .line 33
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicLong;->getAndIncrement()J

    .line 34
    .line 35
    .line 36
    sget-object p1, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 37
    .line 38
    sget-object v2, Lbi4;->S:Ljava/util/Map;

    .line 39
    .line 40
    const-string p1, "The uri must be set."

    .line 41
    .line 42
    invoke-static {p2, p1}, Lzt0;->d0(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    new-instance v0, Lij3;

    .line 46
    .line 47
    const-wide/16 v3, 0x0

    .line 48
    .line 49
    const-wide/16 v5, -0x1

    .line 50
    .line 51
    const/4 v7, 0x6

    .line 52
    move-object v1, p2

    .line 53
    invoke-direct/range {v0 .. v7}, Lij3;-><init>(Landroid/net/Uri;Ljava/util/Map;JJI)V

    .line 54
    .line 55
    .line 56
    iput-object v0, p0, Lxh4;->j:Lij3;

    .line 57
    .line 58
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 25

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    :cond_0
    iget-boolean v0, v1, Lxh4;->g:Z

    .line 4
    .line 5
    if-nez v0, :cond_19

    .line 6
    .line 7
    const-wide/16 v2, -0x1

    .line 8
    .line 9
    const/4 v5, 0x0

    .line 10
    :try_start_0
    iget-object v0, v1, Lxh4;->f:Lpf1;

    .line 11
    .line 12
    iget-wide v9, v0, Lpf1;->a:J

    .line 13
    .line 14
    sget-object v0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 15
    .line 16
    iget-object v7, v1, Lxh4;->a:Landroid/net/Uri;

    .line 17
    .line 18
    sget-object v8, Lbi4;->S:Ljava/util/Map;

    .line 19
    .line 20
    const-string v0, "The uri must be set."

    .line 21
    .line 22
    invoke-static {v7, v0}, Lzt0;->d0(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    new-instance v6, Lij3;

    .line 26
    .line 27
    const-wide/16 v11, -0x1

    .line 28
    .line 29
    const/4 v13, 0x6

    .line 30
    invoke-direct/range {v6 .. v13}, Lij3;-><init>(Landroid/net/Uri;Ljava/util/Map;JJI)V

    .line 31
    .line 32
    .line 33
    iput-object v6, v1, Lxh4;->j:Lij3;

    .line 34
    .line 35
    iget-object v0, v1, Lxh4;->b:Ljs3;

    .line 36
    .line 37
    invoke-virtual {v0, v6}, Ljs3;->a(Lij3;)J

    .line 38
    .line 39
    .line 40
    move-result-wide v6

    .line 41
    iget-boolean v8, v1, Lxh4;->g:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 42
    .line 43
    if-eqz v8, :cond_2

    .line 44
    .line 45
    iget-object v0, v1, Lxh4;->c:Ljr3;

    .line 46
    .line 47
    invoke-virtual {v0}, Ljr3;->j()J

    .line 48
    .line 49
    .line 50
    move-result-wide v4

    .line 51
    cmp-long v2, v4, v2

    .line 52
    .line 53
    if-eqz v2, :cond_1

    .line 54
    .line 55
    iget-object v2, v1, Lxh4;->f:Lpf1;

    .line 56
    .line 57
    invoke-virtual {v0}, Ljr3;->j()J

    .line 58
    .line 59
    .line 60
    move-result-wide v3

    .line 61
    iput-wide v3, v2, Lpf1;->a:J

    .line 62
    .line 63
    :cond_1
    iget-object v0, v1, Lxh4;->b:Ljs3;

    .line 64
    .line 65
    :try_start_1
    invoke-virtual {v0}, Ljs3;->l()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_7

    .line 66
    .line 67
    .line 68
    goto/16 :goto_13

    .line 69
    .line 70
    :cond_2
    cmp-long v8, v6, v2

    .line 71
    .line 72
    if-eqz v8, :cond_3

    .line 73
    .line 74
    add-long/2addr v6, v9

    .line 75
    :try_start_2
    iget-object v8, v1, Lxh4;->m:Lbi4;

    .line 76
    .line 77
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    new-instance v11, Lyh4;

    .line 81
    .line 82
    const/4 v12, 0x1

    .line 83
    invoke-direct {v11, v8, v12}, Lyh4;-><init>(Lbi4;I)V

    .line 84
    .line 85
    .line 86
    iget-object v8, v8, Lbi4;->t:Landroid/os/Handler;

    .line 87
    .line 88
    invoke-virtual {v8, v11}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 89
    .line 90
    .line 91
    :cond_3
    move-wide v12, v6

    .line 92
    goto :goto_1

    .line 93
    :goto_0
    move-wide/from16 v16, v2

    .line 94
    .line 95
    goto/16 :goto_f

    .line 96
    .line 97
    :catchall_0
    move-exception v0

    .line 98
    goto :goto_0

    .line 99
    :goto_1
    iget-object v6, v1, Lxh4;->m:Lbi4;

    .line 100
    .line 101
    iget-object v0, v0, Ljs3;->f:Lth3;

    .line 102
    .line 103
    invoke-interface {v0}, Lth3;->g()Ljava/util/Map;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    const-string v7, "icy-br"

    .line 108
    .line 109
    const-string v8, "Invalid bitrate header: "

    .line 110
    .line 111
    const-string v11, "Invalid metadata interval: "

    .line 112
    .line 113
    const-string v14, "Invalid bitrate: "

    .line 114
    .line 115
    invoke-interface {v0, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v7

    .line 119
    check-cast v7, Ljava/util/List;

    .line 120
    .line 121
    const/4 v15, -0x1

    .line 122
    if-eqz v7, :cond_5

    .line 123
    .line 124
    invoke-interface {v7, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v7

    .line 128
    check-cast v7, Ljava/lang/String;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 129
    .line 130
    move-wide/from16 v16, v2

    .line 131
    .line 132
    :try_start_3
    invoke-static {v7}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 133
    .line 134
    .line 135
    move-result v2
    :try_end_3
    .catch Ljava/lang/NumberFormatException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 136
    mul-int/lit16 v2, v2, 0x3e8

    .line 137
    .line 138
    if-lez v2, :cond_4

    .line 139
    .line 140
    move/from16 v19, v2

    .line 141
    .line 142
    const/4 v4, 0x1

    .line 143
    goto :goto_3

    .line 144
    :cond_4
    :try_start_4
    invoke-static {v7}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v3

    .line 148
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 149
    .line 150
    .line 151
    move-result v3

    .line 152
    add-int/lit8 v3, v3, 0x11

    .line 153
    .line 154
    new-instance v4, Ljava/lang/StringBuilder;

    .line 155
    .line 156
    invoke-direct {v4, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 157
    .line 158
    .line 159
    invoke-virtual {v4, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 160
    .line 161
    .line 162
    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 163
    .line 164
    .line 165
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object v3

    .line 169
    invoke-static {v3}, La30;->x(Ljava/lang/String;)V
    :try_end_4
    .catch Ljava/lang/NumberFormatException; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 170
    .line 171
    .line 172
    :goto_2
    move v4, v5

    .line 173
    move/from16 v19, v15

    .line 174
    .line 175
    goto :goto_3

    .line 176
    :catchall_1
    move-exception v0

    .line 177
    goto/16 :goto_f

    .line 178
    .line 179
    :catch_0
    move v2, v15

    .line 180
    :catch_1
    :try_start_5
    invoke-static {v7}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object v3

    .line 184
    invoke-virtual {v8, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object v3

    .line 188
    invoke-static {v3}, La30;->x(Ljava/lang/String;)V

    .line 189
    .line 190
    .line 191
    move/from16 v19, v2

    .line 192
    .line 193
    move v4, v5

    .line 194
    goto :goto_3

    .line 195
    :cond_5
    move-wide/from16 v16, v2

    .line 196
    .line 197
    goto :goto_2

    .line 198
    :goto_3
    const-string v2, "icy-genre"

    .line 199
    .line 200
    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    move-result-object v2

    .line 204
    check-cast v2, Ljava/util/List;

    .line 205
    .line 206
    const/4 v3, 0x0

    .line 207
    if-eqz v2, :cond_6

    .line 208
    .line 209
    invoke-interface {v2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    move-result-object v2

    .line 213
    check-cast v2, Ljava/lang/String;

    .line 214
    .line 215
    move-object/from16 v21, v2

    .line 216
    .line 217
    const/4 v4, 0x1

    .line 218
    goto :goto_4

    .line 219
    :cond_6
    move-object/from16 v21, v3

    .line 220
    .line 221
    :goto_4
    const-string v2, "icy-name"

    .line 222
    .line 223
    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-result-object v2

    .line 227
    check-cast v2, Ljava/util/List;

    .line 228
    .line 229
    if-eqz v2, :cond_7

    .line 230
    .line 231
    invoke-interface {v2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 232
    .line 233
    .line 234
    move-result-object v2

    .line 235
    check-cast v2, Ljava/lang/String;

    .line 236
    .line 237
    move-object/from16 v22, v2

    .line 238
    .line 239
    const/4 v4, 0x1

    .line 240
    goto :goto_5

    .line 241
    :cond_7
    move-object/from16 v22, v3

    .line 242
    .line 243
    :goto_5
    const-string v2, "icy-url"

    .line 244
    .line 245
    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 246
    .line 247
    .line 248
    move-result-object v2

    .line 249
    check-cast v2, Ljava/util/List;

    .line 250
    .line 251
    if-eqz v2, :cond_8

    .line 252
    .line 253
    invoke-interface {v2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    move-result-object v2

    .line 257
    check-cast v2, Ljava/lang/String;

    .line 258
    .line 259
    move-object/from16 v23, v2

    .line 260
    .line 261
    const/4 v4, 0x1

    .line 262
    goto :goto_6

    .line 263
    :cond_8
    move-object/from16 v23, v3

    .line 264
    .line 265
    :goto_6
    const-string v2, "icy-pub"

    .line 266
    .line 267
    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 268
    .line 269
    .line 270
    move-result-object v2

    .line 271
    check-cast v2, Ljava/util/List;

    .line 272
    .line 273
    if-eqz v2, :cond_9

    .line 274
    .line 275
    invoke-interface {v2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 276
    .line 277
    .line 278
    move-result-object v2

    .line 279
    check-cast v2, Ljava/lang/String;

    .line 280
    .line 281
    const-string v4, "1"

    .line 282
    .line 283
    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 284
    .line 285
    .line 286
    move-result v2

    .line 287
    move/from16 v24, v2

    .line 288
    .line 289
    const/4 v4, 0x1

    .line 290
    goto :goto_7

    .line 291
    :cond_9
    move/from16 v24, v5

    .line 292
    .line 293
    :goto_7
    const-string v2, "icy-metaint"

    .line 294
    .line 295
    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 296
    .line 297
    .line 298
    move-result-object v0

    .line 299
    check-cast v0, Ljava/util/List;

    .line 300
    .line 301
    if-eqz v0, :cond_b

    .line 302
    .line 303
    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 304
    .line 305
    .line 306
    move-result-object v0

    .line 307
    check-cast v0, Ljava/lang/String;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 308
    .line 309
    :try_start_6
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 310
    .line 311
    .line 312
    move-result v2
    :try_end_6
    .catch Ljava/lang/NumberFormatException; {:try_start_6 .. :try_end_6} :catch_2
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 313
    if-lez v2, :cond_a

    .line 314
    .line 315
    move/from16 v20, v2

    .line 316
    .line 317
    const/4 v4, 0x1

    .line 318
    goto :goto_8

    .line 319
    :cond_a
    :try_start_7
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 320
    .line 321
    .line 322
    move-result-object v7

    .line 323
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 324
    .line 325
    .line 326
    move-result v7

    .line 327
    add-int/lit8 v7, v7, 0x1b

    .line 328
    .line 329
    new-instance v8, Ljava/lang/StringBuilder;

    .line 330
    .line 331
    invoke-direct {v8, v7}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 332
    .line 333
    .line 334
    invoke-virtual {v8, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 335
    .line 336
    .line 337
    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 338
    .line 339
    .line 340
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 341
    .line 342
    .line 343
    move-result-object v7

    .line 344
    invoke-static {v7}, La30;->x(Ljava/lang/String;)V
    :try_end_7
    .catch Ljava/lang/NumberFormatException; {:try_start_7 .. :try_end_7} :catch_3
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 345
    .line 346
    .line 347
    :cond_b
    move/from16 v20, v15

    .line 348
    .line 349
    goto :goto_8

    .line 350
    :catch_2
    move v2, v15

    .line 351
    :catch_3
    :try_start_8
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 352
    .line 353
    .line 354
    move-result-object v0

    .line 355
    invoke-virtual {v11, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 356
    .line 357
    .line 358
    move-result-object v0

    .line 359
    invoke-static {v0}, La30;->x(Ljava/lang/String;)V

    .line 360
    .line 361
    .line 362
    move/from16 v20, v2

    .line 363
    .line 364
    :goto_8
    if-eqz v4, :cond_c

    .line 365
    .line 366
    new-instance v18, Loh1;

    .line 367
    .line 368
    invoke-direct/range {v18 .. v24}, Loh1;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 369
    .line 370
    .line 371
    move-object/from16 v0, v18

    .line 372
    .line 373
    goto :goto_9

    .line 374
    :cond_c
    move-object v0, v3

    .line 375
    :goto_9
    iput-object v0, v6, Lbi4;->v:Loh1;

    .line 376
    .line 377
    iget-object v0, v1, Lxh4;->b:Ljs3;

    .line 378
    .line 379
    iget-object v2, v1, Lxh4;->m:Lbi4;

    .line 380
    .line 381
    iget-object v4, v2, Lbi4;->v:Loh1;

    .line 382
    .line 383
    if-eqz v4, :cond_d

    .line 384
    .line 385
    iget v4, v4, Loh1;->f:I

    .line 386
    .line 387
    if-eq v4, v15, :cond_d

    .line 388
    .line 389
    new-instance v6, Lbh4;

    .line 390
    .line 391
    invoke-direct {v6, v0, v4, v1}, Lbh4;-><init>(Lth3;ILxh4;)V

    .line 392
    .line 393
    .line 394
    new-instance v4, Lai4;

    .line 395
    .line 396
    const/4 v7, 0x1

    .line 397
    invoke-direct {v4, v5, v7}, Lai4;-><init>(IZ)V

    .line 398
    .line 399
    .line 400
    invoke-virtual {v2, v4}, Lbi4;->t(Lai4;)Ljg1;

    .line 401
    .line 402
    .line 403
    move-result-object v4

    .line 404
    iput-object v4, v1, Lxh4;->k:Ljg1;

    .line 405
    .line 406
    sget-object v7, Lbi4;->T:Lph4;

    .line 407
    .line 408
    invoke-interface {v4, v7}, Ljg1;->d(Lph4;)V

    .line 409
    .line 410
    .line 411
    move-object v7, v6

    .line 412
    goto :goto_a

    .line 413
    :cond_d
    move-object v7, v0

    .line 414
    :goto_a
    iget-object v6, v1, Lxh4;->c:Ljr3;

    .line 415
    .line 416
    iget-object v8, v1, Lxh4;->a:Landroid/net/Uri;

    .line 417
    .line 418
    iget-object v4, v0, Ljs3;->f:Lth3;

    .line 419
    .line 420
    invoke-interface {v4}, Lth3;->g()Ljava/util/Map;

    .line 421
    .line 422
    .line 423
    move-result-object v4

    .line 424
    iget-object v14, v1, Lxh4;->d:Lbi4;

    .line 425
    .line 426
    move-wide v10, v9

    .line 427
    move-object v9, v4

    .line 428
    invoke-virtual/range {v6 .. v14}, Ljr3;->e(Lth3;Landroid/net/Uri;Ljava/util/Map;JJLbi4;)V

    .line 429
    .line 430
    .line 431
    move-wide v9, v10

    .line 432
    iget-object v4, v2, Lbi4;->v:Loh1;

    .line 433
    .line 434
    if-eqz v4, :cond_f

    .line 435
    .line 436
    iget-object v4, v6, Ljr3;->h:Ljava/lang/Object;

    .line 437
    .line 438
    check-cast v4, Llf1;

    .line 439
    .line 440
    if-nez v4, :cond_e

    .line 441
    .line 442
    goto :goto_b

    .line 443
    :cond_e
    instance-of v7, v4, Lsi1;

    .line 444
    .line 445
    if-eqz v7, :cond_f

    .line 446
    .line 447
    check-cast v4, Lsi1;

    .line 448
    .line 449
    const/4 v7, 0x1

    .line 450
    iput-boolean v7, v4, Lsi1;->p:Z

    .line 451
    .line 452
    :cond_f
    :goto_b
    iget-boolean v4, v1, Lxh4;->h:Z

    .line 453
    .line 454
    if-eqz v4, :cond_10

    .line 455
    .line 456
    iget-wide v7, v1, Lxh4;->i:J

    .line 457
    .line 458
    iget-object v4, v6, Ljr3;->h:Ljava/lang/Object;

    .line 459
    .line 460
    check-cast v4, Llf1;

    .line 461
    .line 462
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 463
    .line 464
    .line 465
    invoke-interface {v4, v9, v10, v7, v8}, Llf1;->e(JJ)V

    .line 466
    .line 467
    .line 468
    iput-boolean v5, v1, Lxh4;->h:Z
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    .line 469
    .line 470
    :cond_10
    move v4, v5

    .line 471
    :cond_11
    :goto_c
    if-nez v4, :cond_15

    .line 472
    .line 473
    :try_start_9
    iget-boolean v7, v1, Lxh4;->g:Z
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    .line 474
    .line 475
    if-nez v7, :cond_14

    .line 476
    .line 477
    :try_start_a
    iget-object v7, v1, Lxh4;->e:Lhp2;

    .line 478
    .line 479
    monitor-enter v7
    :try_end_a
    .catch Ljava/lang/InterruptedException; {:try_start_a .. :try_end_a} :catch_4
    .catchall {:try_start_a .. :try_end_a} :catchall_3

    .line 480
    :goto_d
    :try_start_b
    iget-boolean v8, v7, Lhp2;->a:Z

    .line 481
    .line 482
    if-nez v8, :cond_12

    .line 483
    .line 484
    invoke-virtual {v7}, Ljava/lang/Object;->wait()V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_2

    .line 485
    .line 486
    .line 487
    goto :goto_d

    .line 488
    :catchall_2
    move-exception v0

    .line 489
    goto :goto_10

    .line 490
    :cond_12
    :try_start_c
    monitor-exit v7
    :try_end_c
    .catch Ljava/lang/InterruptedException; {:try_start_c .. :try_end_c} :catch_4
    .catchall {:try_start_c .. :try_end_c} :catchall_3

    .line 491
    :try_start_d
    iget-object v8, v1, Lxh4;->f:Lpf1;

    .line 492
    .line 493
    iget-object v11, v6, Ljr3;->h:Ljava/lang/Object;

    .line 494
    .line 495
    check-cast v11, Llf1;

    .line 496
    .line 497
    if-eqz v11, :cond_13

    .line 498
    .line 499
    iget-object v12, v6, Ljr3;->i:Ljava/lang/Object;

    .line 500
    .line 501
    check-cast v12, Ldf1;

    .line 502
    .line 503
    if-eqz v12, :cond_13

    .line 504
    .line 505
    invoke-interface {v11, v12, v8}, Llf1;->c(Lmf1;Lpf1;)I

    .line 506
    .line 507
    .line 508
    move-result v4

    .line 509
    invoke-virtual {v6}, Ljr3;->j()J

    .line 510
    .line 511
    .line 512
    move-result-wide v11

    .line 513
    iget-wide v13, v2, Lbi4;->m:J

    .line 514
    .line 515
    add-long/2addr v13, v9

    .line 516
    cmp-long v8, v11, v13

    .line 517
    .line 518
    if-lez v8, :cond_11

    .line 519
    .line 520
    monitor-enter v7
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_3

    .line 521
    :try_start_e
    iput-boolean v5, v7, Lhp2;->a:Z
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_4

    .line 522
    .line 523
    :try_start_f
    monitor-exit v7

    .line 524
    iget-object v7, v2, Lbi4;->t:Landroid/os/Handler;

    .line 525
    .line 526
    iget-object v8, v2, Lbi4;->s:Lyh4;

    .line 527
    .line 528
    invoke-virtual {v7, v8}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_3

    .line 529
    .line 530
    .line 531
    move-wide v9, v11

    .line 532
    goto :goto_c

    .line 533
    :catchall_3
    move-exception v0

    .line 534
    goto :goto_e

    .line 535
    :catchall_4
    move-exception v0

    .line 536
    :try_start_10
    monitor-exit v7
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_4

    .line 537
    :try_start_11
    throw v0

    .line 538
    :goto_e
    move v5, v4

    .line 539
    :goto_f
    const/4 v7, 0x1

    .line 540
    goto :goto_12

    .line 541
    :cond_13
    throw v3
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_3

    .line 542
    :goto_10
    :try_start_12
    monitor-exit v7
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_2

    .line 543
    :try_start_13
    throw v0
    :try_end_13
    .catch Ljava/lang/InterruptedException; {:try_start_13 .. :try_end_13} :catch_4
    .catchall {:try_start_13 .. :try_end_13} :catchall_3

    .line 544
    :catch_4
    :try_start_14
    new-instance v0, Ljava/io/InterruptedIOException;

    .line 545
    .line 546
    invoke-direct {v0}, Ljava/io/InterruptedIOException;-><init>()V

    .line 547
    .line 548
    .line 549
    throw v0
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_3

    .line 550
    :cond_14
    move v4, v5

    .line 551
    :cond_15
    const/4 v7, 0x1

    .line 552
    if-ne v4, v7, :cond_16

    .line 553
    .line 554
    goto :goto_11

    .line 555
    :cond_16
    invoke-virtual {v6}, Ljr3;->j()J

    .line 556
    .line 557
    .line 558
    move-result-wide v2

    .line 559
    cmp-long v2, v2, v16

    .line 560
    .line 561
    if-eqz v2, :cond_17

    .line 562
    .line 563
    iget-object v2, v1, Lxh4;->f:Lpf1;

    .line 564
    .line 565
    invoke-virtual {v6}, Ljr3;->j()J

    .line 566
    .line 567
    .line 568
    move-result-wide v5

    .line 569
    iput-wide v5, v2, Lpf1;->a:J

    .line 570
    .line 571
    :cond_17
    move v5, v4

    .line 572
    :goto_11
    :try_start_15
    invoke-virtual {v0}, Ljs3;->l()V
    :try_end_15
    .catch Ljava/io/IOException; {:try_start_15 .. :try_end_15} :catch_5

    .line 573
    .line 574
    .line 575
    :catch_5
    if-eqz v5, :cond_0

    .line 576
    .line 577
    goto :goto_13

    .line 578
    :goto_12
    if-eq v5, v7, :cond_18

    .line 579
    .line 580
    iget-object v2, v1, Lxh4;->c:Ljr3;

    .line 581
    .line 582
    invoke-virtual {v2}, Ljr3;->j()J

    .line 583
    .line 584
    .line 585
    move-result-wide v3

    .line 586
    cmp-long v3, v3, v16

    .line 587
    .line 588
    if-eqz v3, :cond_18

    .line 589
    .line 590
    iget-object v3, v1, Lxh4;->f:Lpf1;

    .line 591
    .line 592
    invoke-virtual {v2}, Ljr3;->j()J

    .line 593
    .line 594
    .line 595
    move-result-wide v4

    .line 596
    iput-wide v4, v3, Lpf1;->a:J

    .line 597
    .line 598
    :cond_18
    iget-object v2, v1, Lxh4;->b:Ljs3;

    .line 599
    .line 600
    :try_start_16
    invoke-virtual {v2}, Ljs3;->l()V
    :try_end_16
    .catch Ljava/io/IOException; {:try_start_16 .. :try_end_16} :catch_6

    .line 601
    .line 602
    .line 603
    :catch_6
    throw v0

    .line 604
    :catch_7
    :cond_19
    :goto_13
    return-void
.end method
