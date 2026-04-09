.class public final Lbl3;
.super Lzd3;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lfq3;


# instance fields
.field public final j:Z

.field public final k:I

.field public final l:I

.field public final m:Ljava/lang/String;

.field public final n:Lmr2;

.field public final o:Lmr2;

.field public p:Lij3;

.field public q:Ljava/net/HttpURLConnection;

.field public r:Ljava/io/InputStream;

.field public s:Z

.field public t:I

.field public u:J

.field public v:J


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;IIZLmr2;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, v0}, Lzd3;-><init>(Z)V

    .line 3
    .line 4
    .line 5
    iput-object p1, p0, Lbl3;->m:Ljava/lang/String;

    .line 6
    .line 7
    iput p2, p0, Lbl3;->k:I

    .line 8
    .line 9
    iput p3, p0, Lbl3;->l:I

    .line 10
    .line 11
    iput-boolean p4, p0, Lbl3;->j:Z

    .line 12
    .line 13
    iput-object p5, p0, Lbl3;->n:Lmr2;

    .line 14
    .line 15
    new-instance p1, Lmr2;

    .line 16
    .line 17
    const/16 p2, 0xc

    .line 18
    .line 19
    invoke-direct {p1, p2}, Lmr2;-><init>(I)V

    .line 20
    .line 21
    .line 22
    iput-object p1, p0, Lbl3;->o:Lmr2;

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final a(Lij3;)J
    .locals 26

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    iput-object v0, v1, Lbl3;->p:Lij3;

    .line 6
    .line 7
    const-wide/16 v10, 0x0

    .line 8
    .line 9
    iput-wide v10, v1, Lbl3;->v:J

    .line 10
    .line 11
    iput-wide v10, v1, Lbl3;->u:J

    .line 12
    .line 13
    invoke-virtual/range {p0 .. p1}, Lzd3;->c(Lij3;)V

    .line 14
    .line 15
    .line 16
    :try_start_0
    const-string v13, "Too many redirects: "

    .line 17
    .line 18
    new-instance v2, Ljava/net/URL;

    .line 19
    .line 20
    iget-object v3, v0, Lij3;->a:Landroid/net/Uri;

    .line 21
    .line 22
    iget-wide v14, v0, Lij3;->c:J

    .line 23
    .line 24
    iget-wide v4, v0, Lij3;->d:J

    .line 25
    .line 26
    invoke-virtual {v3}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    invoke-direct {v2, v3}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    move-wide v5, v4

    .line 34
    iget-wide v3, v0, Lij3;->c:J

    .line 35
    .line 36
    move-wide v7, v5

    .line 37
    iget-wide v5, v0, Lij3;->d:J

    .line 38
    .line 39
    iget-boolean v9, v1, Lbl3;->j:Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_7

    .line 40
    .line 41
    move-wide/from16 v16, v10

    .line 42
    .line 43
    move-wide/from16 v18, v7

    .line 44
    .line 45
    const/4 v7, 0x0

    .line 46
    if-nez v9, :cond_0

    .line 47
    .line 48
    :try_start_1
    iget-object v9, v0, Lij3;->b:Ljava/util/Map;

    .line 49
    .line 50
    const/4 v8, 0x1

    .line 51
    move-wide/from16 v10, v18

    .line 52
    .line 53
    invoke-virtual/range {v1 .. v9}, Lbl3;->k(Ljava/net/URL;JJZZLjava/util/Map;)Ljava/net/HttpURLConnection;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    move-object/from16 v1, p0

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :catch_0
    move-exception v0

    .line 61
    move-object/from16 v1, p0

    .line 62
    .line 63
    goto/16 :goto_13

    .line 64
    .line 65
    :cond_0
    move-wide/from16 v10, v18

    .line 66
    .line 67
    const/4 v1, 0x0

    .line 68
    :goto_0
    add-int/lit8 v8, v1, 0x1

    .line 69
    .line 70
    const/16 v9, 0x14

    .line 71
    .line 72
    if-gt v1, v9, :cond_1c

    .line 73
    .line 74
    iget-object v9, v0, Lij3;->b:Ljava/util/Map;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 75
    .line 76
    move v1, v8

    .line 77
    const/4 v8, 0x0

    .line 78
    move/from16 v18, v1

    .line 79
    .line 80
    move-object/from16 v1, p0

    .line 81
    .line 82
    :try_start_2
    invoke-virtual/range {v1 .. v9}, Lbl3;->k(Ljava/net/URL;JJZZLjava/util/Map;)Ljava/net/HttpURLConnection;

    .line 83
    .line 84
    .line 85
    move-result-object v8

    .line 86
    invoke-virtual {v8}, Ljava/net/HttpURLConnection;->getResponseCode()I

    .line 87
    .line 88
    .line 89
    move-result v9

    .line 90
    const-string v7, "Location"

    .line 91
    .line 92
    invoke-virtual {v8, v7}, Ljava/net/URLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v7

    .line 96
    const/16 v12, 0x12c

    .line 97
    .line 98
    if-eq v9, v12, :cond_1

    .line 99
    .line 100
    const/16 v12, 0x12d

    .line 101
    .line 102
    if-eq v9, v12, :cond_1

    .line 103
    .line 104
    const/16 v12, 0x12e

    .line 105
    .line 106
    if-eq v9, v12, :cond_1

    .line 107
    .line 108
    const/16 v12, 0x12f

    .line 109
    .line 110
    if-eq v9, v12, :cond_1

    .line 111
    .line 112
    const/16 v12, 0x133

    .line 113
    .line 114
    if-eq v9, v12, :cond_1

    .line 115
    .line 116
    const/16 v12, 0x134

    .line 117
    .line 118
    if-ne v9, v12, :cond_2

    .line 119
    .line 120
    :cond_1
    const/4 v9, 0x0

    .line 121
    goto/16 :goto_12

    .line 122
    .line 123
    :cond_2
    move-object v2, v8

    .line 124
    :goto_1
    iput-object v2, v1, Lbl3;->q:Ljava/net/HttpURLConnection;

    .line 125
    .line 126
    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->getResponseCode()I

    .line 127
    .line 128
    .line 129
    move-result v3

    .line 130
    iput v3, v1, Lbl3;->t:I

    .line 131
    .line 132
    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->getResponseMessage()Ljava/lang/String;
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_7

    .line 133
    .line 134
    .line 135
    iget v3, v1, Lbl3;->t:I

    .line 136
    .line 137
    const-string v5, "Content-Range"

    .line 138
    .line 139
    const/16 v6, 0xc8

    .line 140
    .line 141
    const-wide/16 v7, -0x1

    .line 142
    .line 143
    if-lt v3, v6, :cond_3

    .line 144
    .line 145
    const/16 v9, 0x12b

    .line 146
    .line 147
    if-le v3, v9, :cond_4

    .line 148
    .line 149
    :cond_3
    move-wide/from16 v21, v7

    .line 150
    .line 151
    const/16 v18, 0x0

    .line 152
    .line 153
    goto/16 :goto_d

    .line 154
    .line 155
    :cond_4
    invoke-virtual {v2}, Ljava/net/URLConnection;->getContentType()Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    iget v3, v1, Lbl3;->t:I

    .line 159
    .line 160
    if-ne v3, v6, :cond_5

    .line 161
    .line 162
    cmp-long v3, v14, v16

    .line 163
    .line 164
    if-nez v3, :cond_6

    .line 165
    .line 166
    :cond_5
    move-wide/from16 v14, v16

    .line 167
    .line 168
    :cond_6
    const-string v3, "Content-Encoding"

    .line 169
    .line 170
    invoke-virtual {v2, v3}, Ljava/net/URLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object v3

    .line 174
    const-string v6, "gzip"

    .line 175
    .line 176
    invoke-virtual {v6, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 177
    .line 178
    .line 179
    move-result v3

    .line 180
    if-nez v3, :cond_f

    .line 181
    .line 182
    cmp-long v6, v10, v7

    .line 183
    .line 184
    if-eqz v6, :cond_7

    .line 185
    .line 186
    iput-wide v10, v1, Lbl3;->u:J

    .line 187
    .line 188
    move/from16 v25, v3

    .line 189
    .line 190
    goto/16 :goto_7

    .line 191
    .line 192
    :cond_7
    const-string v6, "Content-Length"

    .line 193
    .line 194
    invoke-virtual {v2, v6}, Ljava/net/URLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object v6

    .line 198
    invoke-virtual {v2, v5}, Ljava/net/URLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object v5

    .line 202
    sget-object v9, Lvq3;->a:Ljava/util/regex/Pattern;

    .line 203
    .line 204
    const-string v9, "] ["

    .line 205
    .line 206
    const-string v10, "Inconsistent headers ["

    .line 207
    .line 208
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 209
    .line 210
    .line 211
    move-result v11

    .line 212
    const-string v12, "HttpUtil"

    .line 213
    .line 214
    const-string v13, "]"

    .line 215
    .line 216
    if-nez v11, :cond_8

    .line 217
    .line 218
    :try_start_3
    invoke-static {v6}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 219
    .line 220
    .line 221
    move-result-wide v18
    :try_end_3
    .catch Ljava/lang/NumberFormatException; {:try_start_3 .. :try_end_3} :catch_1

    .line 222
    move-wide/from16 v21, v7

    .line 223
    .line 224
    move-wide/from16 v7, v18

    .line 225
    .line 226
    const/16 v18, 0x0

    .line 227
    .line 228
    goto :goto_3

    .line 229
    :catch_1
    invoke-static {v6}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 230
    .line 231
    .line 232
    move-result-object v11

    .line 233
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    .line 234
    .line 235
    .line 236
    move-result v11

    .line 237
    const/16 v18, 0x0

    .line 238
    .line 239
    new-instance v4, Ljava/lang/StringBuilder;

    .line 240
    .line 241
    add-int/lit8 v11, v11, 0x1c

    .line 242
    .line 243
    invoke-direct {v4, v11}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 244
    .line 245
    .line 246
    const-string v11, "Unexpected Content-Length ["

    .line 247
    .line 248
    invoke-virtual {v4, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 249
    .line 250
    .line 251
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 252
    .line 253
    .line 254
    invoke-virtual {v4, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 255
    .line 256
    .line 257
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 258
    .line 259
    .line 260
    move-result-object v4

    .line 261
    invoke-static {v12, v4}, La30;->A(Ljava/lang/String;Ljava/lang/String;)V

    .line 262
    .line 263
    .line 264
    :goto_2
    move-wide/from16 v21, v7

    .line 265
    .line 266
    goto :goto_3

    .line 267
    :cond_8
    const/16 v18, 0x0

    .line 268
    .line 269
    goto :goto_2

    .line 270
    :goto_3
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 271
    .line 272
    .line 273
    move-result v4

    .line 274
    if-nez v4, :cond_c

    .line 275
    .line 276
    sget-object v4, Lvq3;->a:Ljava/util/regex/Pattern;

    .line 277
    .line 278
    invoke-virtual {v4, v5}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 279
    .line 280
    .line 281
    move-result-object v4

    .line 282
    invoke-virtual {v4}, Ljava/util/regex/Matcher;->matches()Z

    .line 283
    .line 284
    .line 285
    move-result v11

    .line 286
    if-eqz v11, :cond_c

    .line 287
    .line 288
    const/4 v11, 0x2

    .line 289
    :try_start_4
    invoke-virtual {v4, v11}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 290
    .line 291
    .line 292
    move-result-object v11

    .line 293
    if-eqz v11, :cond_b

    .line 294
    .line 295
    invoke-static {v11}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 296
    .line 297
    .line 298
    move-result-wide v23

    .line 299
    const/4 v11, 0x1

    .line 300
    invoke-virtual {v4, v11}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 301
    .line 302
    .line 303
    move-result-object v4

    .line 304
    if-eqz v4, :cond_a

    .line 305
    .line 306
    invoke-static {v4}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 307
    .line 308
    .line 309
    move-result-wide v18
    :try_end_4
    .catch Ljava/lang/NumberFormatException; {:try_start_4 .. :try_end_4} :catch_2

    .line 310
    sub-long v23, v23, v18

    .line 311
    .line 312
    cmp-long v4, v7, v16

    .line 313
    .line 314
    const-wide/16 v18, 0x1

    .line 315
    .line 316
    move/from16 v25, v3

    .line 317
    .line 318
    move v11, v4

    .line 319
    add-long v3, v23, v18

    .line 320
    .line 321
    if-gez v11, :cond_9

    .line 322
    .line 323
    move-wide v7, v3

    .line 324
    goto :goto_5

    .line 325
    :cond_9
    cmp-long v11, v7, v3

    .line 326
    .line 327
    if-eqz v11, :cond_d

    .line 328
    .line 329
    :try_start_5
    invoke-static {v6}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 330
    .line 331
    .line 332
    move-result-object v11

    .line 333
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    .line 334
    .line 335
    .line 336
    move-result v11

    .line 337
    add-int/lit8 v11, v11, 0x19

    .line 338
    .line 339
    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 340
    .line 341
    .line 342
    move-result-object v18

    .line 343
    invoke-virtual/range {v18 .. v18}, Ljava/lang/String;->length()I

    .line 344
    .line 345
    .line 346
    move-result v18

    .line 347
    add-int v11, v11, v18

    .line 348
    .line 349
    const/16 v20, 0x1

    .line 350
    .line 351
    add-int/lit8 v11, v11, 0x1

    .line 352
    .line 353
    new-instance v0, Ljava/lang/StringBuilder;

    .line 354
    .line 355
    invoke-direct {v0, v11}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 356
    .line 357
    .line 358
    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 359
    .line 360
    .line 361
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 362
    .line 363
    .line 364
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 365
    .line 366
    .line 367
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 368
    .line 369
    .line 370
    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 371
    .line 372
    .line 373
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 374
    .line 375
    .line 376
    move-result-object v0

    .line 377
    invoke-static {v0}, La30;->x(Ljava/lang/String;)V

    .line 378
    .line 379
    .line 380
    invoke-static {v7, v8, v3, v4}, Ljava/lang/Math;->max(JJ)J

    .line 381
    .line 382
    .line 383
    move-result-wide v7

    .line 384
    goto :goto_5

    .line 385
    :catch_2
    move/from16 v25, v3

    .line 386
    .line 387
    goto :goto_4

    .line 388
    :cond_a
    move/from16 v25, v3

    .line 389
    .line 390
    throw v18

    .line 391
    :cond_b
    move/from16 v25, v3

    .line 392
    .line 393
    throw v18
    :try_end_5
    .catch Ljava/lang/NumberFormatException; {:try_start_5 .. :try_end_5} :catch_3

    .line 394
    :catch_3
    :goto_4
    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 395
    .line 396
    .line 397
    move-result-object v0

    .line 398
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 399
    .line 400
    .line 401
    move-result v0

    .line 402
    new-instance v3, Ljava/lang/StringBuilder;

    .line 403
    .line 404
    add-int/lit8 v0, v0, 0x1b

    .line 405
    .line 406
    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 407
    .line 408
    .line 409
    const-string v0, "Unexpected Content-Range ["

    .line 410
    .line 411
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 412
    .line 413
    .line 414
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 415
    .line 416
    .line 417
    invoke-virtual {v3, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 418
    .line 419
    .line 420
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 421
    .line 422
    .line 423
    move-result-object v0

    .line 424
    invoke-static {v12, v0}, La30;->A(Ljava/lang/String;Ljava/lang/String;)V

    .line 425
    .line 426
    .line 427
    goto :goto_5

    .line 428
    :cond_c
    move/from16 v25, v3

    .line 429
    .line 430
    :cond_d
    :goto_5
    cmp-long v0, v7, v21

    .line 431
    .line 432
    if-eqz v0, :cond_e

    .line 433
    .line 434
    sub-long/2addr v7, v14

    .line 435
    goto :goto_6

    .line 436
    :cond_e
    move-wide/from16 v7, v21

    .line 437
    .line 438
    :goto_6
    iput-wide v7, v1, Lbl3;->u:J

    .line 439
    .line 440
    goto :goto_7

    .line 441
    :cond_f
    move/from16 v25, v3

    .line 442
    .line 443
    iput-wide v10, v1, Lbl3;->u:J

    .line 444
    .line 445
    :goto_7
    const/16 v3, 0x7d0

    .line 446
    .line 447
    :try_start_6
    invoke-virtual {v2}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    .line 448
    .line 449
    .line 450
    move-result-object v0

    .line 451
    iput-object v0, v1, Lbl3;->r:Ljava/io/InputStream;

    .line 452
    .line 453
    if-eqz v25, :cond_10

    .line 454
    .line 455
    new-instance v0, Ljava/util/zip/GZIPInputStream;

    .line 456
    .line 457
    iget-object v2, v1, Lbl3;->r:Ljava/io/InputStream;

    .line 458
    .line 459
    invoke-direct {v0, v2}, Ljava/util/zip/GZIPInputStream;-><init>(Ljava/io/InputStream;)V

    .line 460
    .line 461
    .line 462
    iput-object v0, v1, Lbl3;->r:Ljava/io/InputStream;
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_4

    .line 463
    .line 464
    :cond_10
    const/4 v11, 0x1

    .line 465
    goto :goto_8

    .line 466
    :catch_4
    move-exception v0

    .line 467
    const/4 v11, 0x1

    .line 468
    goto :goto_c

    .line 469
    :goto_8
    iput-boolean v11, v1, Lbl3;->s:Z

    .line 470
    .line 471
    invoke-virtual/range {p0 .. p1}, Lzd3;->e(Lij3;)V

    .line 472
    .line 473
    .line 474
    cmp-long v0, v14, v16

    .line 475
    .line 476
    if-nez v0, :cond_11

    .line 477
    .line 478
    goto :goto_a

    .line 479
    :cond_11
    const/16 v0, 0x1000

    .line 480
    .line 481
    :try_start_7
    new-array v0, v0, [B

    .line 482
    .line 483
    :goto_9
    cmp-long v2, v14, v16

    .line 484
    .line 485
    if-lez v2, :cond_14

    .line 486
    .line 487
    const-wide/16 v4, 0x1000

    .line 488
    .line 489
    invoke-static {v14, v15, v4, v5}, Ljava/lang/Math;->min(JJ)J

    .line 490
    .line 491
    .line 492
    move-result-wide v4

    .line 493
    long-to-int v2, v4

    .line 494
    iget-object v4, v1, Lbl3;->r:Ljava/io/InputStream;

    .line 495
    .line 496
    sget-object v5, Lv23;->a:Ljava/lang/String;

    .line 497
    .line 498
    const/4 v9, 0x0

    .line 499
    invoke-virtual {v4, v0, v9, v2}, Ljava/io/InputStream;->read([BII)I

    .line 500
    .line 501
    .line 502
    move-result v2

    .line 503
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 504
    .line 505
    .line 506
    move-result-object v4

    .line 507
    invoke-virtual {v4}, Ljava/lang/Thread;->isInterrupted()Z

    .line 508
    .line 509
    .line 510
    move-result v4

    .line 511
    if-nez v4, :cond_13

    .line 512
    .line 513
    const/4 v4, -0x1

    .line 514
    if-eq v2, v4, :cond_12

    .line 515
    .line 516
    int-to-long v4, v2

    .line 517
    sub-long/2addr v14, v4

    .line 518
    invoke-virtual {v1, v2}, Lzd3;->f(I)V

    .line 519
    .line 520
    .line 521
    goto :goto_9

    .line 522
    :catch_5
    move-exception v0

    .line 523
    goto :goto_b

    .line 524
    :cond_12
    new-instance v0, Lkn3;

    .line 525
    .line 526
    invoke-direct {v0}, Lkn3;-><init>()V

    .line 527
    .line 528
    .line 529
    throw v0

    .line 530
    :cond_13
    new-instance v0, Lkn3;

    .line 531
    .line 532
    new-instance v2, Ljava/io/InterruptedIOException;

    .line 533
    .line 534
    invoke-direct {v2}, Ljava/io/InterruptedIOException;-><init>()V

    .line 535
    .line 536
    .line 537
    const/4 v11, 0x1

    .line 538
    invoke-direct {v0, v2, v3, v11}, Lkn3;-><init>(Ljava/io/IOException;II)V

    .line 539
    .line 540
    .line 541
    throw v0
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_5

    .line 542
    :cond_14
    :goto_a
    iget-wide v2, v1, Lbl3;->u:J

    .line 543
    .line 544
    return-wide v2

    .line 545
    :goto_b
    invoke-virtual {v1}, Lbl3;->q()V

    .line 546
    .line 547
    .line 548
    instance-of v2, v0, Lkn3;

    .line 549
    .line 550
    if-eqz v2, :cond_15

    .line 551
    .line 552
    check-cast v0, Lkn3;

    .line 553
    .line 554
    throw v0

    .line 555
    :cond_15
    new-instance v2, Lkn3;

    .line 556
    .line 557
    const/4 v11, 0x1

    .line 558
    invoke-direct {v2, v0, v3, v11}, Lkn3;-><init>(Ljava/io/IOException;II)V

    .line 559
    .line 560
    .line 561
    throw v2

    .line 562
    :goto_c
    invoke-virtual {v1}, Lbl3;->q()V

    .line 563
    .line 564
    .line 565
    new-instance v2, Lkn3;

    .line 566
    .line 567
    invoke-direct {v2, v0, v3, v11}, Lkn3;-><init>(Ljava/io/IOException;II)V

    .line 568
    .line 569
    .line 570
    throw v2

    .line 571
    :goto_d
    invoke-virtual {v2}, Ljava/net/URLConnection;->getHeaderFields()Ljava/util/Map;

    .line 572
    .line 573
    .line 574
    iget v0, v1, Lbl3;->t:I

    .line 575
    .line 576
    const/16 v3, 0x1a0

    .line 577
    .line 578
    if-ne v0, v3, :cond_19

    .line 579
    .line 580
    invoke-virtual {v2, v5}, Ljava/net/URLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    .line 581
    .line 582
    .line 583
    move-result-object v0

    .line 584
    sget-object v4, Lvq3;->a:Ljava/util/regex/Pattern;

    .line 585
    .line 586
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 587
    .line 588
    .line 589
    move-result v4

    .line 590
    if-eqz v4, :cond_17

    .line 591
    .line 592
    :cond_16
    const/4 v4, 0x1

    .line 593
    goto :goto_e

    .line 594
    :cond_17
    sget-object v4, Lvq3;->b:Ljava/util/regex/Pattern;

    .line 595
    .line 596
    invoke-virtual {v4, v0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 597
    .line 598
    .line 599
    move-result-object v0

    .line 600
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->matches()Z

    .line 601
    .line 602
    .line 603
    move-result v4

    .line 604
    if-eqz v4, :cond_16

    .line 605
    .line 606
    const/4 v4, 0x1

    .line 607
    invoke-virtual {v0, v4}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 608
    .line 609
    .line 610
    move-result-object v0

    .line 611
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 612
    .line 613
    .line 614
    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 615
    .line 616
    .line 617
    move-result-wide v5

    .line 618
    goto :goto_f

    .line 619
    :goto_e
    move-wide/from16 v5, v21

    .line 620
    .line 621
    :goto_f
    cmp-long v0, v14, v5

    .line 622
    .line 623
    if-nez v0, :cond_19

    .line 624
    .line 625
    iput-boolean v4, v1, Lbl3;->s:Z

    .line 626
    .line 627
    invoke-virtual/range {p0 .. p1}, Lzd3;->e(Lij3;)V

    .line 628
    .line 629
    .line 630
    cmp-long v0, v10, v21

    .line 631
    .line 632
    if-eqz v0, :cond_18

    .line 633
    .line 634
    return-wide v10

    .line 635
    :cond_18
    return-wide v16

    .line 636
    :cond_19
    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->getErrorStream()Ljava/io/InputStream;

    .line 637
    .line 638
    .line 639
    move-result-object v0

    .line 640
    if-eqz v0, :cond_1a

    .line 641
    .line 642
    :try_start_8
    invoke-static {v0}, Lmo3;->a(Ljava/io/InputStream;)[B

    .line 643
    .line 644
    .line 645
    goto :goto_10

    .line 646
    :cond_1a
    sget-object v0, Lv23;->a:Ljava/lang/String;
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_6

    .line 647
    .line 648
    goto :goto_10

    .line 649
    :catch_6
    sget-object v0, Lv23;->a:Ljava/lang/String;

    .line 650
    .line 651
    :goto_10
    invoke-virtual {v1}, Lbl3;->q()V

    .line 652
    .line 653
    .line 654
    iget v0, v1, Lbl3;->t:I

    .line 655
    .line 656
    if-ne v0, v3, :cond_1b

    .line 657
    .line 658
    new-instance v4, Ldi3;

    .line 659
    .line 660
    invoke-direct {v4}, Ldi3;-><init>()V

    .line 661
    .line 662
    .line 663
    goto :goto_11

    .line 664
    :cond_1b
    move-object/from16 v4, v18

    .line 665
    .line 666
    :goto_11
    new-instance v0, Lko3;

    .line 667
    .line 668
    iget v2, v1, Lbl3;->t:I

    .line 669
    .line 670
    invoke-direct {v0, v2, v4}, Lko3;-><init>(ILdi3;)V

    .line 671
    .line 672
    .line 673
    throw v0

    .line 674
    :catch_7
    move-exception v0

    .line 675
    goto :goto_13

    .line 676
    :goto_12
    :try_start_9
    invoke-virtual {v8}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 677
    .line 678
    .line 679
    invoke-virtual {v1, v2, v7}, Lbl3;->m(Ljava/net/URL;Ljava/lang/String;)Ljava/net/URL;

    .line 680
    .line 681
    .line 682
    move-result-object v2

    .line 683
    move-object/from16 v0, p1

    .line 684
    .line 685
    move/from16 v1, v18

    .line 686
    .line 687
    const/4 v7, 0x0

    .line 688
    goto/16 :goto_0

    .line 689
    .line 690
    :cond_1c
    move-object/from16 v1, p0

    .line 691
    .line 692
    move/from16 v18, v8

    .line 693
    .line 694
    new-instance v0, Lkn3;

    .line 695
    .line 696
    new-instance v2, Ljava/net/NoRouteToHostException;

    .line 697
    .line 698
    invoke-static/range {v18 .. v18}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 699
    .line 700
    .line 701
    move-result-object v3

    .line 702
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 703
    .line 704
    .line 705
    move-result v3

    .line 706
    add-int/2addr v3, v9

    .line 707
    new-instance v4, Ljava/lang/StringBuilder;

    .line 708
    .line 709
    invoke-direct {v4, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 710
    .line 711
    .line 712
    invoke-virtual {v4, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 713
    .line 714
    .line 715
    move/from16 v3, v18

    .line 716
    .line 717
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 718
    .line 719
    .line 720
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 721
    .line 722
    .line 723
    move-result-object v3

    .line 724
    invoke-direct {v2, v3}, Ljava/net/NoRouteToHostException;-><init>(Ljava/lang/String;)V

    .line 725
    .line 726
    .line 727
    const/16 v3, 0x7d1

    .line 728
    .line 729
    const/4 v11, 0x1

    .line 730
    invoke-direct {v0, v2, v3, v11}, Lkn3;-><init>(Ljava/io/IOException;II)V

    .line 731
    .line 732
    .line 733
    throw v0
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_7

    .line 734
    :goto_13
    invoke-virtual {v1}, Lbl3;->q()V

    .line 735
    .line 736
    .line 737
    const/4 v11, 0x1

    .line 738
    invoke-static {v0, v11}, Lkn3;->a(Ljava/io/IOException;I)Lkn3;

    .line 739
    .line 740
    .line 741
    move-result-object v0

    .line 742
    throw v0
.end method

.method public final d([BII)I
    .locals 6

    .line 1
    if-nez p3, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    return p1

    .line 5
    :cond_0
    :try_start_0
    iget-wide v0, p0, Lbl3;->u:J

    .line 6
    .line 7
    const-wide/16 v2, -0x1

    .line 8
    .line 9
    cmp-long v2, v0, v2

    .line 10
    .line 11
    const/4 v3, -0x1

    .line 12
    if-eqz v2, :cond_2

    .line 13
    .line 14
    iget-wide v4, p0, Lbl3;->v:J

    .line 15
    .line 16
    sub-long/2addr v0, v4

    .line 17
    const-wide/16 v4, 0x0

    .line 18
    .line 19
    cmp-long v2, v0, v4

    .line 20
    .line 21
    if-nez v2, :cond_1

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_1
    int-to-long v4, p3

    .line 25
    invoke-static {v4, v5, v0, v1}, Ljava/lang/Math;->min(JJ)J

    .line 26
    .line 27
    .line 28
    move-result-wide v0

    .line 29
    long-to-int p3, v0

    .line 30
    goto :goto_0

    .line 31
    :catch_0
    move-exception p1

    .line 32
    goto :goto_2

    .line 33
    :cond_2
    :goto_0
    iget-object v0, p0, Lbl3;->r:Ljava/io/InputStream;

    .line 34
    .line 35
    sget-object v1, Lv23;->a:Ljava/lang/String;

    .line 36
    .line 37
    invoke-virtual {v0, p1, p2, p3}, Ljava/io/InputStream;->read([BII)I

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    if-ne p1, v3, :cond_3

    .line 42
    .line 43
    :goto_1
    return v3

    .line 44
    :cond_3
    iget-wide p2, p0, Lbl3;->v:J

    .line 45
    .line 46
    int-to-long v0, p1

    .line 47
    add-long/2addr p2, v0

    .line 48
    iput-wide p2, p0, Lbl3;->v:J

    .line 49
    .line 50
    invoke-virtual {p0, p1}, Lzd3;->f(I)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 51
    .line 52
    .line 53
    return p1

    .line 54
    :goto_2
    sget-object p2, Lv23;->a:Ljava/lang/String;

    .line 55
    .line 56
    const/4 p2, 0x2

    .line 57
    invoke-static {p1, p2}, Lkn3;->a(Ljava/io/IOException;I)Lkn3;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    throw p1
.end method

.method public final g()Ljava/util/Map;
    .locals 2

    .line 1
    iget-object v0, p0, Lbl3;->q:Ljava/net/HttpURLConnection;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Lxn3;->l:Lxn3;

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_0
    new-instance v1, Luk3;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/net/URLConnection;->getHeaderFields()Ljava/util/Map;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-direct {v1, v0}, Luk3;-><init>(Ljava/util/Map;)V

    .line 15
    .line 16
    .line 17
    return-object v1
.end method

.method public final h()Landroid/net/Uri;
    .locals 1

    .line 1
    iget-object v0, p0, Lbl3;->q:Ljava/net/HttpURLConnection;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/net/URLConnection;->getURL()Ljava/net/URL;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Ljava/net/URL;->toString()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    return-object v0

    .line 18
    :cond_0
    iget-object v0, p0, Lbl3;->p:Lij3;

    .line 19
    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    iget-object v0, v0, Lij3;->a:Landroid/net/Uri;

    .line 23
    .line 24
    return-object v0

    .line 25
    :cond_1
    const/4 v0, 0x0

    .line 26
    return-object v0
.end method

.method public final k(Ljava/net/URL;JJZZLjava/util/Map;)Ljava/net/HttpURLConnection;
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Ljava/net/HttpURLConnection;

    .line 6
    .line 7
    iget v0, p0, Lbl3;->k:I

    .line 8
    .line 9
    invoke-virtual {p1, v0}, Ljava/net/URLConnection;->setConnectTimeout(I)V

    .line 10
    .line 11
    .line 12
    iget v0, p0, Lbl3;->l:I

    .line 13
    .line 14
    invoke-virtual {p1, v0}, Ljava/net/URLConnection;->setReadTimeout(I)V

    .line 15
    .line 16
    .line 17
    new-instance v0, Ljava/util/HashMap;

    .line 18
    .line 19
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 20
    .line 21
    .line 22
    iget-object v1, p0, Lbl3;->n:Lmr2;

    .line 23
    .line 24
    invoke-virtual {v1}, Lmr2;->t()Ljava/util/Map;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V

    .line 29
    .line 30
    .line 31
    iget-object v1, p0, Lbl3;->o:Lmr2;

    .line 32
    .line 33
    invoke-virtual {v1}, Lmr2;->t()Ljava/util/Map;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0, p8}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 44
    .line 45
    .line 46
    move-result-object p8

    .line 47
    invoke-interface {p8}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 48
    .line 49
    .line 50
    move-result-object p8

    .line 51
    :goto_0
    invoke-interface {p8}, Ljava/util/Iterator;->hasNext()Z

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    if-eqz v0, :cond_0

    .line 56
    .line 57
    invoke-interface {p8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    check-cast v0, Ljava/util/Map$Entry;

    .line 62
    .line 63
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    check-cast v1, Ljava/lang/String;

    .line 68
    .line 69
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    check-cast v0, Ljava/lang/String;

    .line 74
    .line 75
    invoke-virtual {p1, v1, v0}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_0
    const-wide/16 v0, 0x0

    .line 80
    .line 81
    cmp-long p8, p2, v0

    .line 82
    .line 83
    const-wide/16 v2, -0x1

    .line 84
    .line 85
    if-nez p8, :cond_2

    .line 86
    .line 87
    cmp-long p2, p4, v2

    .line 88
    .line 89
    if-nez p2, :cond_1

    .line 90
    .line 91
    const/4 p2, 0x0

    .line 92
    goto :goto_1

    .line 93
    :cond_1
    move-wide p2, v0

    .line 94
    :cond_2
    new-instance p8, Ljava/lang/StringBuilder;

    .line 95
    .line 96
    const-string v0, "bytes="

    .line 97
    .line 98
    invoke-direct {p8, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {p8, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    const-string v0, "-"

    .line 105
    .line 106
    invoke-virtual {p8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    cmp-long v0, p4, v2

    .line 110
    .line 111
    if-eqz v0, :cond_3

    .line 112
    .line 113
    add-long/2addr p2, p4

    .line 114
    add-long/2addr p2, v2

    .line 115
    invoke-virtual {p8, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    :cond_3
    invoke-virtual {p8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object p2

    .line 122
    :goto_1
    if-eqz p2, :cond_4

    .line 123
    .line 124
    const-string p3, "Range"

    .line 125
    .line 126
    invoke-virtual {p1, p3, p2}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    :cond_4
    iget-object p2, p0, Lbl3;->m:Ljava/lang/String;

    .line 130
    .line 131
    if-eqz p2, :cond_5

    .line 132
    .line 133
    const-string p3, "User-Agent"

    .line 134
    .line 135
    invoke-virtual {p1, p3, p2}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    :cond_5
    const/4 p2, 0x1

    .line 139
    if-eq p2, p6, :cond_6

    .line 140
    .line 141
    const-string p2, "identity"

    .line 142
    .line 143
    goto :goto_2

    .line 144
    :cond_6
    const-string p2, "gzip"

    .line 145
    .line 146
    :goto_2
    const-string p3, "Accept-Encoding"

    .line 147
    .line 148
    invoke-virtual {p1, p3, p2}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {p1, p7}, Ljava/net/HttpURLConnection;->setInstanceFollowRedirects(Z)V

    .line 152
    .line 153
    .line 154
    const/4 p2, 0x0

    .line 155
    invoke-virtual {p1, p2}, Ljava/net/URLConnection;->setDoOutput(Z)V

    .line 156
    .line 157
    .line 158
    sget p2, Lij3;->f:I

    .line 159
    .line 160
    const-string p2, "GET"

    .line 161
    .line 162
    invoke-virtual {p1, p2}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {p1}, Ljava/net/URLConnection;->connect()V

    .line 166
    .line 167
    .line 168
    return-object p1
.end method

.method public final l()V
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x0

    .line 3
    :try_start_0
    iget-object v2, p0, Lbl3;->r:Ljava/io/InputStream;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 4
    .line 5
    if-eqz v2, :cond_0

    .line 6
    .line 7
    :try_start_1
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 8
    .line 9
    .line 10
    goto :goto_0

    .line 11
    :catchall_0
    move-exception v2

    .line 12
    goto :goto_1

    .line 13
    :catch_0
    move-exception v2

    .line 14
    :try_start_2
    new-instance v3, Lkn3;

    .line 15
    .line 16
    sget-object v4, Lv23;->a:Ljava/lang/String;

    .line 17
    .line 18
    const/16 v4, 0x7d0

    .line 19
    .line 20
    const/4 v5, 0x3

    .line 21
    invoke-direct {v3, v2, v4, v5}, Lkn3;-><init>(Ljava/io/IOException;II)V

    .line 22
    .line 23
    .line 24
    throw v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 25
    :cond_0
    :goto_0
    iput-object v1, p0, Lbl3;->r:Ljava/io/InputStream;

    .line 26
    .line 27
    invoke-virtual {p0}, Lbl3;->q()V

    .line 28
    .line 29
    .line 30
    iget-boolean v2, p0, Lbl3;->s:Z

    .line 31
    .line 32
    if-eqz v2, :cond_1

    .line 33
    .line 34
    iput-boolean v0, p0, Lbl3;->s:Z

    .line 35
    .line 36
    invoke-virtual {p0}, Lzd3;->j()V

    .line 37
    .line 38
    .line 39
    :cond_1
    iput-object v1, p0, Lbl3;->q:Ljava/net/HttpURLConnection;

    .line 40
    .line 41
    iput-object v1, p0, Lbl3;->p:Lij3;

    .line 42
    .line 43
    return-void

    .line 44
    :goto_1
    iput-object v1, p0, Lbl3;->r:Ljava/io/InputStream;

    .line 45
    .line 46
    invoke-virtual {p0}, Lbl3;->q()V

    .line 47
    .line 48
    .line 49
    iget-boolean v3, p0, Lbl3;->s:Z

    .line 50
    .line 51
    if-eqz v3, :cond_2

    .line 52
    .line 53
    iput-boolean v0, p0, Lbl3;->s:Z

    .line 54
    .line 55
    invoke-virtual {p0}, Lzd3;->j()V

    .line 56
    .line 57
    .line 58
    :cond_2
    iput-object v1, p0, Lbl3;->q:Ljava/net/HttpURLConnection;

    .line 59
    .line 60
    iput-object v1, p0, Lbl3;->p:Lij3;

    .line 61
    .line 62
    throw v2
.end method

.method public final m(Ljava/net/URL;Ljava/lang/String;)Ljava/net/URL;
    .locals 5

    .line 1
    const/16 v0, 0x7d1

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz p2, :cond_4

    .line 5
    .line 6
    :try_start_0
    new-instance v2, Ljava/net/URL;

    .line 7
    .line 8
    invoke-direct {v2, p1, p2}, Ljava/net/URL;-><init>(Ljava/net/URL;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_0

    .line 9
    .line 10
    .line 11
    invoke-virtual {v2}, Ljava/net/URL;->getProtocol()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    const-string v3, "https"

    .line 16
    .line 17
    invoke-virtual {v3, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    if-nez v3, :cond_1

    .line 22
    .line 23
    const-string v3, "http"

    .line 24
    .line 25
    invoke-virtual {v3, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    if-eqz v3, :cond_0

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    new-instance p1, Lkn3;

    .line 33
    .line 34
    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p2

    .line 38
    const-string v2, "Unsupported protocol redirect: "

    .line 39
    .line 40
    invoke-virtual {v2, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p2

    .line 44
    invoke-direct {p1, p2, v0, v1}, Lkn3;-><init>(Ljava/lang/String;II)V

    .line 45
    .line 46
    .line 47
    throw p1

    .line 48
    :cond_1
    :goto_0
    iget-boolean v3, p0, Lbl3;->j:Z

    .line 49
    .line 50
    if-nez v3, :cond_3

    .line 51
    .line 52
    invoke-virtual {p1}, Ljava/net/URL;->getProtocol()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v3

    .line 60
    if-eqz v3, :cond_2

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_2
    new-instance v2, Lkn3;

    .line 64
    .line 65
    invoke-virtual {p1}, Ljava/net/URL;->getProtocol()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 74
    .line 75
    .line 76
    move-result v3

    .line 77
    add-int/lit8 v3, v3, 0x28

    .line 78
    .line 79
    invoke-static {p2, v3, v1}, Lga1;->i(Ljava/lang/String;II)I

    .line 80
    .line 81
    .line 82
    move-result v3

    .line 83
    new-instance v4, Ljava/lang/StringBuilder;

    .line 84
    .line 85
    invoke-direct {v4, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 86
    .line 87
    .line 88
    const-string v3, "Disallowed cross-protocol redirect ("

    .line 89
    .line 90
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    const-string p1, " to "

    .line 97
    .line 98
    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    const-string p1, ")"

    .line 105
    .line 106
    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    invoke-direct {v2, p1, v0, v1}, Lkn3;-><init>(Ljava/lang/String;II)V

    .line 114
    .line 115
    .line 116
    throw v2

    .line 117
    :cond_3
    :goto_1
    return-object v2

    .line 118
    :catch_0
    move-exception p1

    .line 119
    new-instance p2, Lkn3;

    .line 120
    .line 121
    invoke-direct {p2, p1, v0, v1}, Lkn3;-><init>(Ljava/io/IOException;II)V

    .line 122
    .line 123
    .line 124
    throw p2

    .line 125
    :cond_4
    new-instance p1, Lkn3;

    .line 126
    .line 127
    const-string p2, "Null location redirect"

    .line 128
    .line 129
    invoke-direct {p1, p2, v0, v1}, Lkn3;-><init>(Ljava/lang/String;II)V

    .line 130
    .line 131
    .line 132
    throw p1
.end method

.method public final q()V
    .locals 3

    .line 1
    iget-object v0, p0, Lbl3;->q:Ljava/net/HttpURLConnection;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    :try_start_0
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->disconnect()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :catch_0
    move-exception v0

    .line 10
    const-string v1, "DefaultHttpDataSource"

    .line 11
    .line 12
    const-string v2, "Unexpected error while disconnecting"

    .line 13
    .line 14
    invoke-static {v1, v2, v0}, La30;->C(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method
