.class public final Ldr3;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# static fields
.field public static final b:Ljava/nio/charset/Charset;


# instance fields
.field public final a:Ljava/io/ByteArrayInputStream;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "UTF-8"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Ldr3;->b:Ljava/nio/charset/Charset;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Ljava/io/ByteArrayInputStream;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ldr3;->a:Ljava/io/ByteArrayInputStream;

    .line 5
    .line 6
    return-void
.end method

.method public static b(Lb44;)I
    .locals 4

    .line 1
    instance-of v0, p0, Lf44;

    .line 2
    .line 3
    if-eqz v0, :cond_3

    .line 4
    .line 5
    invoke-virtual {p0}, Lb44;->c()Lf44;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v0, v0, Lf44;->f:Ljava/io/Serializable;

    .line 10
    .line 11
    instance-of v0, v0, Ljava/lang/Number;

    .line 12
    .line 13
    if-eqz v0, :cond_2

    .line 14
    .line 15
    invoke-virtual {p0}, Lb44;->c()Lf44;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-virtual {p0}, Lf44;->d()Ljava/lang/Number;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    :try_start_0
    instance-of v0, p0, Luu3;

    .line 24
    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    check-cast p0, Luu3;

    .line 28
    .line 29
    iget-object p0, p0, Luu3;->f:Ljava/lang/String;

    .line 30
    .line 31
    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 32
    .line 33
    .line 34
    move-result-wide v0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 35
    const-wide v2, 0xffffffffL

    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    cmp-long p0, v0, v2

    .line 41
    .line 42
    if-gtz p0, :cond_0

    .line 43
    .line 44
    const-wide/32 v2, -0x80000000

    .line 45
    .line 46
    .line 47
    cmp-long p0, v0, v2

    .line 48
    .line 49
    if-ltz p0, :cond_0

    .line 50
    .line 51
    long-to-int p0, v0

    .line 52
    return p0

    .line 53
    :cond_0
    new-instance p0, Ljava/io/IOException;

    .line 54
    .line 55
    const-string v0, "invalid key id"

    .line 56
    .line 57
    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    throw p0

    .line 61
    :cond_1
    :try_start_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 62
    .line 63
    const-string v0, "does not contain a parsed number."

    .line 64
    .line 65
    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    throw p0
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_0

    .line 69
    :catch_0
    move-exception p0

    .line 70
    new-instance v0, Ljava/io/IOException;

    .line 71
    .line 72
    invoke-direct {v0, p0}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    .line 73
    .line 74
    .line 75
    throw v0

    .line 76
    :cond_2
    new-instance p0, Ljava/io/IOException;

    .line 77
    .line 78
    const-string v0, "invalid key id: not a JSON number"

    .line 79
    .line 80
    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    throw p0

    .line 84
    :cond_3
    new-instance p0, Ljava/io/IOException;

    .line 85
    .line 86
    const-string v0, "invalid key id: not a JSON primitive"

    .line 87
    .line 88
    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    throw p0
.end method


# virtual methods
.method public final a()Lvz3;
    .locals 21

    .line 1
    const-string v0, "keyMaterialType"

    .line 2
    .line 3
    const-string v1, "value"

    .line 4
    .line 5
    const-string v2, "typeUrl"

    .line 6
    .line 7
    const-string v3, "outputPrefixType"

    .line 8
    .line 9
    const-string v4, "keyId"

    .line 10
    .line 11
    const-string v5, "status"

    .line 12
    .line 13
    const-string v6, "keyData"

    .line 14
    .line 15
    const-string v7, "primaryKeyId"

    .line 16
    .line 17
    const-string v8, "key"

    .line 18
    .line 19
    move-object/from16 v9, p0

    .line 20
    .line 21
    iget-object v10, v9, Ldr3;->a:Ljava/io/ByteArrayInputStream;

    .line 22
    .line 23
    :try_start_0
    new-instance v11, Ljava/lang/String;

    .line 24
    .line 25
    sget v12, Lpr3;->a:I

    .line 26
    .line 27
    new-instance v12, Ljava/io/ByteArrayOutputStream;

    .line 28
    .line 29
    invoke-direct {v12}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 30
    .line 31
    .line 32
    const/16 v13, 0x400

    .line 33
    .line 34
    new-array v13, v13, [B

    .line 35
    .line 36
    :goto_0
    invoke-virtual {v10, v13}, Ljava/io/InputStream;->read([B)I

    .line 37
    .line 38
    .line 39
    move-result v14

    .line 40
    const/4 v15, -0x1

    .line 41
    const/4 v9, 0x0

    .line 42
    if-eq v14, v15, :cond_0

    .line 43
    .line 44
    invoke-virtual {v12, v13, v9, v14}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    .line 45
    .line 46
    .line 47
    move-object/from16 v9, p0

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :catchall_0
    move-exception v0

    .line 51
    goto/16 :goto_9

    .line 52
    .line 53
    :catch_0
    move-exception v0

    .line 54
    goto/16 :goto_8

    .line 55
    .line 56
    :catch_1
    move-exception v0

    .line 57
    goto/16 :goto_8

    .line 58
    .line 59
    :cond_0
    invoke-virtual {v12}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 60
    .line 61
    .line 62
    move-result-object v12

    .line 63
    sget-object v13, Ldr3;->b:Ljava/nio/charset/Charset;

    .line 64
    .line 65
    invoke-direct {v11, v12, v13}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 66
    .line 67
    .line 68
    invoke-static {v11}, Lzt0;->K(Ljava/lang/String;)Lb44;

    .line 69
    .line 70
    .line 71
    move-result-object v11

    .line 72
    invoke-virtual {v11}, Lb44;->b()Ld44;

    .line 73
    .line 74
    .line 75
    move-result-object v11

    .line 76
    iget-object v12, v11, Ld44;->f:Lk44;

    .line 77
    .line 78
    invoke-virtual {v12, v8}, Lk44;->containsKey(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v13

    .line 82
    if-eqz v13, :cond_d

    .line 83
    .line 84
    invoke-virtual {v11, v8}, Ld44;->d(Ljava/lang/String;)Lb44;

    .line 85
    .line 86
    .line 87
    move-result-object v8

    .line 88
    instance-of v13, v8, La44;

    .line 89
    .line 90
    if-eqz v13, :cond_c

    .line 91
    .line 92
    check-cast v8, La44;

    .line 93
    .line 94
    iget-object v8, v8, La44;->f:Ljava/util/ArrayList;

    .line 95
    .line 96
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 97
    .line 98
    .line 99
    move-result v13

    .line 100
    if-eqz v13, :cond_b

    .line 101
    .line 102
    invoke-static {}, Lvz3;->G()Lsz3;

    .line 103
    .line 104
    .line 105
    move-result-object v13

    .line 106
    invoke-virtual {v12, v7}, Lk44;->containsKey(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    move-result v12

    .line 110
    if-eqz v12, :cond_1

    .line 111
    .line 112
    invoke-virtual {v11, v7}, Ld44;->d(Ljava/lang/String;)Lb44;

    .line 113
    .line 114
    .line 115
    move-result-object v7

    .line 116
    invoke-static {v7}, Ldr3;->b(Lb44;)I

    .line 117
    .line 118
    .line 119
    move-result v7

    .line 120
    invoke-virtual {v13}, Ln54;->b()V

    .line 121
    .line 122
    .line 123
    iget-object v11, v13, Ln54;->g:Lp54;

    .line 124
    .line 125
    check-cast v11, Lvz3;

    .line 126
    .line 127
    invoke-virtual {v11, v7}, Lvz3;->H(I)V

    .line 128
    .line 129
    .line 130
    :cond_1
    move v7, v9

    .line 131
    :goto_1
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 132
    .line 133
    .line 134
    move-result v11

    .line 135
    if-ge v7, v11, :cond_a

    .line 136
    .line 137
    invoke-virtual {v8, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v11

    .line 141
    check-cast v11, Lb44;

    .line 142
    .line 143
    invoke-virtual {v11}, Lb44;->b()Ld44;

    .line 144
    .line 145
    .line 146
    move-result-object v11

    .line 147
    iget-object v12, v11, Ld44;->f:Lk44;

    .line 148
    .line 149
    invoke-virtual {v12, v6}, Lk44;->containsKey(Ljava/lang/Object;)Z

    .line 150
    .line 151
    .line 152
    move-result v14

    .line 153
    if-eqz v14, :cond_9

    .line 154
    .line 155
    invoke-virtual {v12, v5}, Lk44;->containsKey(Ljava/lang/Object;)Z

    .line 156
    .line 157
    .line 158
    move-result v14

    .line 159
    if-eqz v14, :cond_9

    .line 160
    .line 161
    invoke-virtual {v12, v4}, Lk44;->containsKey(Ljava/lang/Object;)Z

    .line 162
    .line 163
    .line 164
    move-result v14

    .line 165
    if-eqz v14, :cond_9

    .line 166
    .line 167
    invoke-virtual {v12, v3}, Lk44;->containsKey(Ljava/lang/Object;)Z

    .line 168
    .line 169
    .line 170
    move-result v12

    .line 171
    if-eqz v12, :cond_9

    .line 172
    .line 173
    invoke-virtual {v11, v6}, Ld44;->d(Ljava/lang/String;)Lb44;

    .line 174
    .line 175
    .line 176
    move-result-object v12

    .line 177
    instance-of v14, v12, Ld44;

    .line 178
    .line 179
    if-eqz v14, :cond_8

    .line 180
    .line 181
    invoke-static {}, Luz3;->E()Ltz3;

    .line 182
    .line 183
    .line 184
    move-result-object v14

    .line 185
    invoke-virtual {v11, v5}, Ld44;->d(Ljava/lang/String;)Lb44;

    .line 186
    .line 187
    .line 188
    move-result-object v15

    .line 189
    invoke-virtual {v15}, Lb44;->a()Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object v15

    .line 193
    const-string v9, "unknown status: "

    .line 194
    .line 195
    move-object/from16 v16, v5

    .line 196
    .line 197
    invoke-virtual {v15}, Ljava/lang/String;->hashCode()I

    .line 198
    .line 199
    .line 200
    move-result v5
    :try_end_0
    .catch Le44; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 201
    move-object/from16 v17, v6

    .line 202
    .line 203
    const v6, -0x3524e8df    # -7179152.5f

    .line 204
    .line 205
    .line 206
    const/16 v18, 0x3

    .line 207
    .line 208
    const/16 v19, 0x5

    .line 209
    .line 210
    const/16 v20, 0x4

    .line 211
    .line 212
    if-eq v5, v6, :cond_3

    .line 213
    .line 214
    const v6, 0x1c83a5f9

    .line 215
    .line 216
    .line 217
    if-eq v5, v6, :cond_2

    .line 218
    .line 219
    const v6, 0x3ecc2a7c

    .line 220
    .line 221
    .line 222
    if-ne v5, v6, :cond_7

    .line 223
    .line 224
    const-string v5, "DISABLED"

    .line 225
    .line 226
    invoke-virtual {v15, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 227
    .line 228
    .line 229
    move-result v5

    .line 230
    if-eqz v5, :cond_7

    .line 231
    .line 232
    move/from16 v5, v20

    .line 233
    .line 234
    goto :goto_2

    .line 235
    :cond_2
    const-string v5, "DESTROYED"

    .line 236
    .line 237
    invoke-virtual {v15, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 238
    .line 239
    .line 240
    move-result v5

    .line 241
    if-eqz v5, :cond_7

    .line 242
    .line 243
    move/from16 v5, v19

    .line 244
    .line 245
    goto :goto_2

    .line 246
    :cond_3
    const-string v5, "ENABLED"

    .line 247
    .line 248
    invoke-virtual {v15, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 249
    .line 250
    .line 251
    move-result v5

    .line 252
    if-eqz v5, :cond_7

    .line 253
    .line 254
    move/from16 v5, v18

    .line 255
    .line 256
    :goto_2
    :try_start_1
    invoke-virtual {v14}, Ln54;->b()V

    .line 257
    .line 258
    .line 259
    iget-object v6, v14, Ln54;->g:Lp54;

    .line 260
    .line 261
    check-cast v6, Luz3;

    .line 262
    .line 263
    invoke-virtual {v6, v5}, Luz3;->J(I)V

    .line 264
    .line 265
    .line 266
    invoke-virtual {v11, v4}, Ld44;->d(Ljava/lang/String;)Lb44;

    .line 267
    .line 268
    .line 269
    move-result-object v5

    .line 270
    invoke-static {v5}, Ldr3;->b(Lb44;)I

    .line 271
    .line 272
    .line 273
    move-result v5

    .line 274
    invoke-virtual {v14}, Ln54;->b()V

    .line 275
    .line 276
    .line 277
    iget-object v6, v14, Ln54;->g:Lp54;

    .line 278
    .line 279
    check-cast v6, Luz3;

    .line 280
    .line 281
    invoke-virtual {v6, v5}, Luz3;->G(I)V

    .line 282
    .line 283
    .line 284
    invoke-virtual {v11, v3}, Ld44;->d(Ljava/lang/String;)Lb44;

    .line 285
    .line 286
    .line 287
    move-result-object v5

    .line 288
    invoke-virtual {v5}, Lb44;->a()Ljava/lang/String;

    .line 289
    .line 290
    .line 291
    move-result-object v5

    .line 292
    const-string v6, "unknown output prefix type: "

    .line 293
    .line 294
    invoke-virtual {v5}, Ljava/lang/String;->hashCode()I

    .line 295
    .line 296
    .line 297
    move-result v9
    :try_end_1
    .catch Le44; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 298
    sparse-switch v9, :sswitch_data_0

    .line 299
    .line 300
    .line 301
    goto/16 :goto_7

    .line 302
    .line 303
    :sswitch_0
    const-string v9, "CRUNCHY"

    .line 304
    .line 305
    invoke-virtual {v5, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 306
    .line 307
    .line 308
    move-result v9

    .line 309
    if-eqz v9, :cond_6

    .line 310
    .line 311
    :try_start_2
    sget-object v5, Li04;->k:Li04;
    :try_end_2
    .catch Le44; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/IllegalStateException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 312
    .line 313
    goto :goto_3

    .line 314
    :sswitch_1
    const-string v9, "TINK"

    .line 315
    .line 316
    invoke-virtual {v5, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 317
    .line 318
    .line 319
    move-result v9

    .line 320
    if-eqz v9, :cond_6

    .line 321
    .line 322
    :try_start_3
    sget-object v5, Li04;->h:Li04;
    :try_end_3
    .catch Le44; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/lang/IllegalStateException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 323
    .line 324
    goto :goto_3

    .line 325
    :sswitch_2
    const-string v9, "RAW"

    .line 326
    .line 327
    invoke-virtual {v5, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 328
    .line 329
    .line 330
    move-result v9

    .line 331
    if-eqz v9, :cond_6

    .line 332
    .line 333
    :try_start_4
    sget-object v5, Li04;->j:Li04;
    :try_end_4
    .catch Le44; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/lang/IllegalStateException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 334
    .line 335
    goto :goto_3

    .line 336
    :sswitch_3
    const-string v9, "LEGACY"

    .line 337
    .line 338
    invoke-virtual {v5, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 339
    .line 340
    .line 341
    move-result v9

    .line 342
    if-eqz v9, :cond_6

    .line 343
    .line 344
    :try_start_5
    sget-object v5, Li04;->i:Li04;

    .line 345
    .line 346
    :goto_3
    invoke-virtual {v14}, Ln54;->b()V

    .line 347
    .line 348
    .line 349
    iget-object v6, v14, Ln54;->g:Lp54;

    .line 350
    .line 351
    check-cast v6, Luz3;

    .line 352
    .line 353
    invoke-virtual {v6, v5}, Luz3;->H(Li04;)V

    .line 354
    .line 355
    .line 356
    invoke-virtual {v12}, Lb44;->b()Ld44;

    .line 357
    .line 358
    .line 359
    move-result-object v5

    .line 360
    iget-object v6, v5, Ld44;->f:Lk44;

    .line 361
    .line 362
    invoke-virtual {v6, v2}, Lk44;->containsKey(Ljava/lang/Object;)Z

    .line 363
    .line 364
    .line 365
    move-result v9

    .line 366
    if-eqz v9, :cond_5

    .line 367
    .line 368
    invoke-virtual {v6, v1}, Lk44;->containsKey(Ljava/lang/Object;)Z

    .line 369
    .line 370
    .line 371
    move-result v9

    .line 372
    if-eqz v9, :cond_5

    .line 373
    .line 374
    invoke-virtual {v6, v0}, Lk44;->containsKey(Ljava/lang/Object;)Z

    .line 375
    .line 376
    .line 377
    move-result v6

    .line 378
    if-eqz v6, :cond_5

    .line 379
    .line 380
    invoke-virtual {v5, v1}, Ld44;->d(Ljava/lang/String;)Lb44;

    .line 381
    .line 382
    .line 383
    move-result-object v6

    .line 384
    invoke-virtual {v6}, Lb44;->a()Ljava/lang/String;

    .line 385
    .line 386
    .line 387
    move-result-object v6

    .line 388
    invoke-static {v6}, Lg34;->a(Ljava/lang/String;)[B

    .line 389
    .line 390
    .line 391
    move-result-object v6

    .line 392
    invoke-static {}, Loz3;->D()Lnz3;

    .line 393
    .line 394
    .line 395
    move-result-object v9

    .line 396
    invoke-virtual {v5, v2}, Ld44;->d(Ljava/lang/String;)Lb44;

    .line 397
    .line 398
    .line 399
    move-result-object v11

    .line 400
    invoke-virtual {v11}, Lb44;->a()Ljava/lang/String;

    .line 401
    .line 402
    .line 403
    move-result-object v11

    .line 404
    invoke-virtual {v9}, Ln54;->b()V

    .line 405
    .line 406
    .line 407
    iget-object v12, v9, Ln54;->g:Lp54;

    .line 408
    .line 409
    check-cast v12, Loz3;

    .line 410
    .line 411
    invoke-virtual {v12, v11}, Loz3;->F(Ljava/lang/String;)V

    .line 412
    .line 413
    .line 414
    array-length v11, v6

    .line 415
    const/4 v12, 0x0

    .line 416
    invoke-static {v6, v12, v11}, La54;->n([BII)Ly44;

    .line 417
    .line 418
    .line 419
    move-result-object v6

    .line 420
    invoke-virtual {v9}, Ln54;->b()V

    .line 421
    .line 422
    .line 423
    iget-object v11, v9, Ln54;->g:Lp54;

    .line 424
    .line 425
    check-cast v11, Loz3;

    .line 426
    .line 427
    invoke-virtual {v11, v6}, Loz3;->G(La54;)V

    .line 428
    .line 429
    .line 430
    invoke-virtual {v5, v0}, Ld44;->d(Ljava/lang/String;)Lb44;

    .line 431
    .line 432
    .line 433
    move-result-object v5

    .line 434
    invoke-virtual {v5}, Lb44;->a()Ljava/lang/String;

    .line 435
    .line 436
    .line 437
    move-result-object v5

    .line 438
    const-string v6, "unknown key material type: "

    .line 439
    .line 440
    invoke-virtual {v5}, Ljava/lang/String;->hashCode()I

    .line 441
    .line 442
    .line 443
    move-result v11
    :try_end_5
    .catch Le44; {:try_start_5 .. :try_end_5} :catch_1
    .catch Ljava/lang/IllegalStateException; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 444
    sparse-switch v11, :sswitch_data_1

    .line 445
    .line 446
    .line 447
    goto :goto_6

    .line 448
    :sswitch_4
    const-string v11, "ASYMMETRIC_PUBLIC"

    .line 449
    .line 450
    invoke-virtual {v5, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 451
    .line 452
    .line 453
    move-result v11

    .line 454
    if-eqz v11, :cond_4

    .line 455
    .line 456
    move/from16 v5, v20

    .line 457
    .line 458
    goto :goto_5

    .line 459
    :sswitch_5
    const-string v11, "ASYMMETRIC_PRIVATE"

    .line 460
    .line 461
    invoke-virtual {v5, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 462
    .line 463
    .line 464
    move-result v11

    .line 465
    if-eqz v11, :cond_4

    .line 466
    .line 467
    :goto_4
    move/from16 v5, v18

    .line 468
    .line 469
    goto :goto_5

    .line 470
    :sswitch_6
    const-string v11, "SYMMETRIC"

    .line 471
    .line 472
    invoke-virtual {v5, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 473
    .line 474
    .line 475
    move-result v11

    .line 476
    if-eqz v11, :cond_4

    .line 477
    .line 478
    const/16 v18, 0x2

    .line 479
    .line 480
    goto :goto_4

    .line 481
    :sswitch_7
    const-string v11, "REMOTE"

    .line 482
    .line 483
    invoke-virtual {v5, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 484
    .line 485
    .line 486
    move-result v11

    .line 487
    if-eqz v11, :cond_4

    .line 488
    .line 489
    move/from16 v5, v19

    .line 490
    .line 491
    :goto_5
    :try_start_6
    invoke-virtual {v9}, Ln54;->b()V

    .line 492
    .line 493
    .line 494
    iget-object v6, v9, Ln54;->g:Lp54;

    .line 495
    .line 496
    check-cast v6, Loz3;

    .line 497
    .line 498
    invoke-virtual {v6, v5}, Loz3;->H(I)V

    .line 499
    .line 500
    .line 501
    invoke-virtual {v9}, Ln54;->d()Lp54;

    .line 502
    .line 503
    .line 504
    move-result-object v5

    .line 505
    check-cast v5, Loz3;

    .line 506
    .line 507
    invoke-virtual {v14}, Ln54;->b()V

    .line 508
    .line 509
    .line 510
    iget-object v6, v14, Ln54;->g:Lp54;

    .line 511
    .line 512
    check-cast v6, Luz3;

    .line 513
    .line 514
    invoke-virtual {v6, v5}, Luz3;->F(Loz3;)V

    .line 515
    .line 516
    .line 517
    invoke-virtual {v14}, Ln54;->d()Lp54;

    .line 518
    .line 519
    .line 520
    move-result-object v5

    .line 521
    check-cast v5, Luz3;

    .line 522
    .line 523
    invoke-virtual {v13}, Ln54;->b()V

    .line 524
    .line 525
    .line 526
    iget-object v6, v13, Ln54;->g:Lp54;

    .line 527
    .line 528
    check-cast v6, Lvz3;

    .line 529
    .line 530
    invoke-virtual {v6, v5}, Lvz3;->I(Luz3;)V

    .line 531
    .line 532
    .line 533
    add-int/lit8 v7, v7, 0x1

    .line 534
    .line 535
    move v9, v12

    .line 536
    move-object/from16 v5, v16

    .line 537
    .line 538
    move-object/from16 v6, v17

    .line 539
    .line 540
    goto/16 :goto_1

    .line 541
    .line 542
    :cond_4
    :goto_6
    new-instance v0, Le44;

    .line 543
    .line 544
    invoke-virtual {v6, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 545
    .line 546
    .line 547
    move-result-object v1

    .line 548
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 549
    .line 550
    .line 551
    throw v0

    .line 552
    :cond_5
    new-instance v0, Le44;

    .line 553
    .line 554
    const-string v1, "invalid keyData"

    .line 555
    .line 556
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 557
    .line 558
    .line 559
    throw v0

    .line 560
    :cond_6
    :goto_7
    new-instance v0, Le44;

    .line 561
    .line 562
    invoke-virtual {v6, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 563
    .line 564
    .line 565
    move-result-object v1

    .line 566
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 567
    .line 568
    .line 569
    throw v0

    .line 570
    :cond_7
    new-instance v0, Le44;

    .line 571
    .line 572
    invoke-virtual {v9, v15}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 573
    .line 574
    .line 575
    move-result-object v1

    .line 576
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 577
    .line 578
    .line 579
    throw v0

    .line 580
    :cond_8
    new-instance v0, Le44;

    .line 581
    .line 582
    const-string v1, "invalid key: keyData must be an object"

    .line 583
    .line 584
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 585
    .line 586
    .line 587
    throw v0

    .line 588
    :cond_9
    new-instance v0, Le44;

    .line 589
    .line 590
    const-string v1, "invalid key"

    .line 591
    .line 592
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 593
    .line 594
    .line 595
    throw v0

    .line 596
    :cond_a
    invoke-virtual {v13}, Ln54;->d()Lp54;

    .line 597
    .line 598
    .line 599
    move-result-object v0

    .line 600
    check-cast v0, Lvz3;
    :try_end_6
    .catch Le44; {:try_start_6 .. :try_end_6} :catch_1
    .catch Ljava/lang/IllegalStateException; {:try_start_6 .. :try_end_6} :catch_0
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 601
    .line 602
    invoke-virtual {v10}, Ljava/io/InputStream;->close()V

    .line 603
    .line 604
    .line 605
    return-object v0

    .line 606
    :cond_b
    :try_start_7
    new-instance v0, Le44;

    .line 607
    .line 608
    const-string v1, "invalid keyset: key is empty"

    .line 609
    .line 610
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 611
    .line 612
    .line 613
    throw v0

    .line 614
    :cond_c
    new-instance v0, Le44;

    .line 615
    .line 616
    const-string v1, "invalid keyset: key must be an array"

    .line 617
    .line 618
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 619
    .line 620
    .line 621
    throw v0

    .line 622
    :cond_d
    new-instance v0, Le44;

    .line 623
    .line 624
    const-string v1, "invalid keyset: no key"

    .line 625
    .line 626
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 627
    .line 628
    .line 629
    throw v0
    :try_end_7
    .catch Le44; {:try_start_7 .. :try_end_7} :catch_1
    .catch Ljava/lang/IllegalStateException; {:try_start_7 .. :try_end_7} :catch_0
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 630
    :goto_8
    :try_start_8
    new-instance v1, Ljava/io/IOException;

    .line 631
    .line 632
    invoke-direct {v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    .line 633
    .line 634
    .line 635
    throw v1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 636
    :goto_9
    invoke-virtual {v10}, Ljava/io/InputStream;->close()V

    .line 637
    .line 638
    .line 639
    throw v0

    .line 640
    nop

    .line 641
    :sswitch_data_0
    .sparse-switch
        -0x7a621837 -> :sswitch_3
        0x13c08 -> :sswitch_2
        0x274af2 -> :sswitch_1
        0x69012c4c -> :sswitch_0
    .end sparse-switch

    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    :sswitch_data_1
    .sparse-switch
        -0x702213ba -> :sswitch_7
        -0x5feeace9 -> :sswitch_6
        0xedb0e1a -> :sswitch_5
        0x5b7856d2 -> :sswitch_4
    .end sparse-switch
.end method
