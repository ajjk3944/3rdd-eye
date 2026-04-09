.class public final Lxf3;
.super Lzd3;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final synthetic j:I

.field public k:Landroid/content/res/AssetFileDescriptor;

.field public l:Ljava/io/FileInputStream;

.field public m:J

.field public n:Z

.field public final o:Ljava/lang/Object;

.field public p:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroid/content/Context;I)V
    .locals 0

    .line 1
    iput p2, p0, Lxf3;->j:I

    .line 2
    .line 3
    packed-switch p2, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const/4 p2, 0x0

    .line 7
    invoke-direct {p0, p2}, Lzd3;-><init>(Z)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    iput-object p1, p0, Lxf3;->o:Ljava/lang/Object;

    .line 15
    .line 16
    return-void

    .line 17
    :pswitch_0
    const/4 p2, 0x0

    .line 18
    invoke-direct {p0, p2}, Lzd3;-><init>(Z)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    iput-object p1, p0, Lxf3;->o:Ljava/lang/Object;

    .line 26
    .line 27
    return-void

    .line 28
    nop

    .line 29
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final a(Lij3;)J
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    iget v2, v1, Lxf3;->j:I

    .line 6
    .line 7
    packed-switch v2, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iput-object v0, v1, Lxf3;->p:Ljava/lang/Object;

    .line 11
    .line 12
    invoke-virtual/range {p0 .. p1}, Lzd3;->c(Lij3;)V

    .line 13
    .line 14
    .line 15
    iget-object v2, v1, Lxf3;->o:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v2, Landroid/content/Context;

    .line 18
    .line 19
    iget-object v3, v0, Lij3;->a:Landroid/net/Uri;

    .line 20
    .line 21
    iget-wide v4, v0, Lij3;->c:J

    .line 22
    .line 23
    invoke-virtual {v3}, Landroid/net/Uri;->normalizeScheme()Landroid/net/Uri;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    invoke-virtual {v3}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v6

    .line 31
    const-string v7, "rawresource"

    .line 32
    .line 33
    invoke-static {v7, v6}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 34
    .line 35
    .line 36
    move-result v6

    .line 37
    const-string v7, "Resource identifier must be an integer."

    .line 38
    .line 39
    const/16 v8, 0x3ec

    .line 40
    .line 41
    const/16 v9, 0x7d0

    .line 42
    .line 43
    const/16 v10, 0x7d5

    .line 44
    .line 45
    const/4 v11, 0x1

    .line 46
    const/4 v12, 0x0

    .line 47
    if-eqz v6, :cond_1

    .line 48
    .line 49
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    invoke-virtual {v3}, Landroid/net/Uri;->getPathSegments()Ljava/util/List;

    .line 54
    .line 55
    .line 56
    move-result-object v6

    .line 57
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 58
    .line 59
    .line 60
    move-result v13

    .line 61
    if-ne v13, v11, :cond_0

    .line 62
    .line 63
    const/4 v13, 0x0

    .line 64
    invoke-interface {v6, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v6

    .line 68
    check-cast v6, Ljava/lang/String;

    .line 69
    .line 70
    :try_start_0
    invoke-static {v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 71
    .line 72
    .line 73
    move-result v6
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 74
    goto/16 :goto_2

    .line 75
    .line 76
    :catch_0
    new-instance v0, Lgr3;

    .line 77
    .line 78
    invoke-direct {v0, v7, v12, v8}, Ldi3;-><init>(Ljava/lang/String;Ljava/lang/Exception;I)V

    .line 79
    .line 80
    .line 81
    throw v0

    .line 82
    :cond_0
    new-instance v0, Lgr3;

    .line 83
    .line 84
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 85
    .line 86
    .line 87
    move-result v2

    .line 88
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v3

    .line 92
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 93
    .line 94
    .line 95
    move-result v3

    .line 96
    new-instance v4, Ljava/lang/StringBuilder;

    .line 97
    .line 98
    add-int/lit8 v3, v3, 0x3d

    .line 99
    .line 100
    invoke-direct {v4, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 101
    .line 102
    .line 103
    const-string v3, "rawresource:// URI must have exactly one path element, found "

    .line 104
    .line 105
    invoke-static {v4, v3, v2}, Lex0;->j(Ljava/lang/StringBuilder;Ljava/lang/String;I)Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v2

    .line 109
    invoke-direct {v0, v2, v12, v9}, Ldi3;-><init>(Ljava/lang/String;Ljava/lang/Exception;I)V

    .line 110
    .line 111
    .line 112
    throw v0

    .line 113
    :cond_1
    invoke-virtual {v3}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v6

    .line 117
    const-string v13, "android.resource"

    .line 118
    .line 119
    invoke-static {v13, v6}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 120
    .line 121
    .line 122
    move-result v6

    .line 123
    if-eqz v6, :cond_12

    .line 124
    .line 125
    invoke-virtual {v3}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v6

    .line 129
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 130
    .line 131
    .line 132
    const-string v13, "/"

    .line 133
    .line 134
    invoke-virtual {v6, v13}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 135
    .line 136
    .line 137
    move-result v13

    .line 138
    if-eqz v13, :cond_2

    .line 139
    .line 140
    invoke-virtual {v6, v11}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object v6

    .line 144
    :cond_2
    invoke-virtual {v3}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v13

    .line 148
    invoke-static {v13}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 149
    .line 150
    .line 151
    move-result v13

    .line 152
    if-eqz v13, :cond_3

    .line 153
    .line 154
    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v13

    .line 158
    goto :goto_0

    .line 159
    :cond_3
    invoke-virtual {v3}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v13

    .line 163
    :goto_0
    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v14

    .line 167
    invoke-virtual {v13, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 168
    .line 169
    .line 170
    move-result v14

    .line 171
    if-eqz v14, :cond_4

    .line 172
    .line 173
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 174
    .line 175
    .line 176
    move-result-object v2

    .line 177
    goto :goto_1

    .line 178
    :cond_4
    :try_start_1
    invoke-virtual {v2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 179
    .line 180
    .line 181
    move-result-object v2

    .line 182
    invoke-virtual {v2, v13}, Landroid/content/pm/PackageManager;->getResourcesForApplication(Ljava/lang/String;)Landroid/content/res/Resources;

    .line 183
    .line 184
    .line 185
    move-result-object v2
    :try_end_1
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_1 .. :try_end_1} :catch_5

    .line 186
    :goto_1
    const-string v14, "\\d+"

    .line 187
    .line 188
    invoke-virtual {v6, v14}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    .line 189
    .line 190
    .line 191
    move-result v14

    .line 192
    if-eqz v14, :cond_5

    .line 193
    .line 194
    :try_start_2
    invoke-static {v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 195
    .line 196
    .line 197
    move-result v6
    :try_end_2
    .catch Ljava/lang/NumberFormatException; {:try_start_2 .. :try_end_2} :catch_1

    .line 198
    goto :goto_2

    .line 199
    :catch_1
    new-instance v0, Lgr3;

    .line 200
    .line 201
    invoke-direct {v0, v7, v12, v8}, Ldi3;-><init>(Ljava/lang/String;Ljava/lang/Exception;I)V

    .line 202
    .line 203
    .line 204
    throw v0

    .line 205
    :cond_5
    invoke-virtual {v13}, Ljava/lang/String;->length()I

    .line 206
    .line 207
    .line 208
    move-result v7

    .line 209
    add-int/2addr v7, v11

    .line 210
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 211
    .line 212
    .line 213
    move-result v8

    .line 214
    new-instance v14, Ljava/lang/StringBuilder;

    .line 215
    .line 216
    add-int/2addr v7, v8

    .line 217
    invoke-direct {v14, v7}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 218
    .line 219
    .line 220
    const-string v7, ":"

    .line 221
    .line 222
    invoke-static {v14, v13, v7, v6}, Lex0;->l(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object v6

    .line 226
    const-string v7, "raw"

    .line 227
    .line 228
    invoke-virtual {v2, v6, v7, v12}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    .line 229
    .line 230
    .line 231
    move-result v6

    .line 232
    if-eqz v6, :cond_11

    .line 233
    .line 234
    :goto_2
    :try_start_3
    invoke-virtual {v2, v6}, Landroid/content/res/Resources;->openRawResourceFd(I)Landroid/content/res/AssetFileDescriptor;

    .line 235
    .line 236
    .line 237
    move-result-object v2
    :try_end_3
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_3 .. :try_end_3} :catch_4

    .line 238
    if-eqz v2, :cond_10

    .line 239
    .line 240
    iput-object v2, v1, Lxf3;->k:Landroid/content/res/AssetFileDescriptor;

    .line 241
    .line 242
    invoke-virtual {v2}, Landroid/content/res/AssetFileDescriptor;->getLength()J

    .line 243
    .line 244
    .line 245
    move-result-wide v2

    .line 246
    new-instance v6, Ljava/io/FileInputStream;

    .line 247
    .line 248
    iget-object v7, v1, Lxf3;->k:Landroid/content/res/AssetFileDescriptor;

    .line 249
    .line 250
    invoke-virtual {v7}, Landroid/content/res/AssetFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;

    .line 251
    .line 252
    .line 253
    move-result-object v7

    .line 254
    invoke-direct {v6, v7}, Ljava/io/FileInputStream;-><init>(Ljava/io/FileDescriptor;)V

    .line 255
    .line 256
    .line 257
    iput-object v6, v1, Lxf3;->l:Ljava/io/FileInputStream;

    .line 258
    .line 259
    const-wide/16 v7, -0x1

    .line 260
    .line 261
    cmp-long v10, v2, v7

    .line 262
    .line 263
    const/16 v13, 0x7d8

    .line 264
    .line 265
    if-eqz v10, :cond_7

    .line 266
    .line 267
    cmp-long v14, v4, v2

    .line 268
    .line 269
    if-gtz v14, :cond_6

    .line 270
    .line 271
    goto :goto_3

    .line 272
    :cond_6
    :try_start_4
    new-instance v0, Lgr3;

    .line 273
    .line 274
    invoke-direct {v0, v12, v12, v13}, Ldi3;-><init>(Ljava/lang/String;Ljava/lang/Exception;I)V

    .line 275
    .line 276
    .line 277
    throw v0

    .line 278
    :catch_2
    move-exception v0

    .line 279
    goto/16 :goto_7

    .line 280
    .line 281
    :catch_3
    move-exception v0

    .line 282
    goto/16 :goto_8

    .line 283
    .line 284
    :cond_7
    :goto_3
    iget-object v14, v1, Lxf3;->k:Landroid/content/res/AssetFileDescriptor;

    .line 285
    .line 286
    invoke-virtual {v14}, Landroid/content/res/AssetFileDescriptor;->getStartOffset()J

    .line 287
    .line 288
    .line 289
    move-result-wide v14

    .line 290
    move/from16 v16, v10

    .line 291
    .line 292
    add-long v9, v14, v4

    .line 293
    .line 294
    invoke-virtual {v6, v9, v10}, Ljava/io/FileInputStream;->skip(J)J

    .line 295
    .line 296
    .line 297
    move-result-wide v9

    .line 298
    sub-long/2addr v9, v14

    .line 299
    cmp-long v4, v9, v4

    .line 300
    .line 301
    if-nez v4, :cond_f

    .line 302
    .line 303
    const-wide/16 v4, 0x0

    .line 304
    .line 305
    if-nez v16, :cond_a

    .line 306
    .line 307
    invoke-virtual {v6}, Ljava/io/FileInputStream;->getChannel()Ljava/nio/channels/FileChannel;

    .line 308
    .line 309
    .line 310
    move-result-object v2

    .line 311
    invoke-virtual {v2}, Ljava/nio/channels/FileChannel;->size()J

    .line 312
    .line 313
    .line 314
    move-result-wide v9

    .line 315
    cmp-long v3, v9, v4

    .line 316
    .line 317
    if-nez v3, :cond_8

    .line 318
    .line 319
    iput-wide v7, v1, Lxf3;->m:J

    .line 320
    .line 321
    move-wide v9, v7

    .line 322
    goto :goto_4

    .line 323
    :cond_8
    invoke-virtual {v2}, Ljava/nio/channels/FileChannel;->size()J

    .line 324
    .line 325
    .line 326
    move-result-wide v9

    .line 327
    invoke-virtual {v2}, Ljava/nio/channels/FileChannel;->position()J

    .line 328
    .line 329
    .line 330
    move-result-wide v2

    .line 331
    sub-long/2addr v9, v2

    .line 332
    iput-wide v9, v1, Lxf3;->m:J

    .line 333
    .line 334
    cmp-long v2, v9, v4

    .line 335
    .line 336
    if-ltz v2, :cond_9

    .line 337
    .line 338
    goto :goto_4

    .line 339
    :cond_9
    new-instance v0, Lgr3;

    .line 340
    .line 341
    invoke-direct {v0, v12, v12, v13}, Ldi3;-><init>(Ljava/lang/String;Ljava/lang/Exception;I)V

    .line 342
    .line 343
    .line 344
    throw v0

    .line 345
    :cond_a
    sub-long v9, v2, v9

    .line 346
    .line 347
    iput-wide v9, v1, Lxf3;->m:J
    :try_end_4
    .catch Lgr3; {:try_start_4 .. :try_end_4} :catch_3
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2

    .line 348
    .line 349
    cmp-long v2, v9, v4

    .line 350
    .line 351
    if-ltz v2, :cond_e

    .line 352
    .line 353
    :goto_4
    iget-wide v2, v0, Lij3;->d:J

    .line 354
    .line 355
    cmp-long v4, v2, v7

    .line 356
    .line 357
    if-eqz v4, :cond_c

    .line 358
    .line 359
    cmp-long v5, v9, v7

    .line 360
    .line 361
    if-nez v5, :cond_b

    .line 362
    .line 363
    move-wide v5, v2

    .line 364
    goto :goto_5

    .line 365
    :cond_b
    invoke-static {v9, v10, v2, v3}, Ljava/lang/Math;->min(JJ)J

    .line 366
    .line 367
    .line 368
    move-result-wide v5

    .line 369
    :goto_5
    iput-wide v5, v1, Lxf3;->m:J

    .line 370
    .line 371
    :cond_c
    iput-boolean v11, v1, Lxf3;->n:Z

    .line 372
    .line 373
    invoke-virtual/range {p0 .. p1}, Lzd3;->e(Lij3;)V

    .line 374
    .line 375
    .line 376
    if-eqz v4, :cond_d

    .line 377
    .line 378
    goto :goto_6

    .line 379
    :cond_d
    iget-wide v2, v1, Lxf3;->m:J

    .line 380
    .line 381
    :goto_6
    return-wide v2

    .line 382
    :cond_e
    :try_start_5
    new-instance v0, Ldi3;

    .line 383
    .line 384
    invoke-direct {v0}, Ldi3;-><init>()V

    .line 385
    .line 386
    .line 387
    throw v0

    .line 388
    :cond_f
    new-instance v0, Lgr3;

    .line 389
    .line 390
    invoke-direct {v0, v12, v12, v13}, Ldi3;-><init>(Ljava/lang/String;Ljava/lang/Exception;I)V

    .line 391
    .line 392
    .line 393
    throw v0
    :try_end_5
    .catch Lgr3; {:try_start_5 .. :try_end_5} :catch_3
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_2

    .line 394
    :goto_7
    new-instance v2, Lgr3;

    .line 395
    .line 396
    const/16 v4, 0x7d0

    .line 397
    .line 398
    invoke-direct {v2, v12, v0, v4}, Ldi3;-><init>(Ljava/lang/String;Ljava/lang/Exception;I)V

    .line 399
    .line 400
    .line 401
    throw v2

    .line 402
    :goto_8
    throw v0

    .line 403
    :cond_10
    move v4, v9

    .line 404
    new-instance v0, Lgr3;

    .line 405
    .line 406
    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 407
    .line 408
    .line 409
    move-result-object v2

    .line 410
    const-string v3, "Resource is compressed: "

    .line 411
    .line 412
    invoke-virtual {v3, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 413
    .line 414
    .line 415
    move-result-object v2

    .line 416
    invoke-direct {v0, v2, v12, v4}, Ldi3;-><init>(Ljava/lang/String;Ljava/lang/Exception;I)V

    .line 417
    .line 418
    .line 419
    throw v0

    .line 420
    :catch_4
    move-exception v0

    .line 421
    new-instance v2, Lgr3;

    .line 422
    .line 423
    invoke-direct {v2, v12, v0, v10}, Ldi3;-><init>(Ljava/lang/String;Ljava/lang/Exception;I)V

    .line 424
    .line 425
    .line 426
    throw v2

    .line 427
    :cond_11
    new-instance v0, Lgr3;

    .line 428
    .line 429
    const-string v2, "Resource not found."

    .line 430
    .line 431
    invoke-direct {v0, v2, v12, v10}, Ldi3;-><init>(Ljava/lang/String;Ljava/lang/Exception;I)V

    .line 432
    .line 433
    .line 434
    throw v0

    .line 435
    :catch_5
    move-exception v0

    .line 436
    new-instance v2, Lgr3;

    .line 437
    .line 438
    const-string v3, "Package in android.resource:// URI not found. Check http://g.co/dev/packagevisibility."

    .line 439
    .line 440
    invoke-direct {v2, v3, v0, v10}, Ldi3;-><init>(Ljava/lang/String;Ljava/lang/Exception;I)V

    .line 441
    .line 442
    .line 443
    throw v2

    .line 444
    :cond_12
    new-instance v0, Lgr3;

    .line 445
    .line 446
    invoke-virtual {v3}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 447
    .line 448
    .line 449
    move-result-object v2

    .line 450
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 451
    .line 452
    .line 453
    move-result-object v3

    .line 454
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 455
    .line 456
    .line 457
    move-result v3

    .line 458
    new-instance v4, Ljava/lang/StringBuilder;

    .line 459
    .line 460
    add-int/lit8 v3, v3, 0x3e

    .line 461
    .line 462
    invoke-direct {v4, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 463
    .line 464
    .line 465
    const-string v3, "Unsupported URI scheme ("

    .line 466
    .line 467
    const-string v5, "). Only android.resource is supported."

    .line 468
    .line 469
    invoke-static {v4, v3, v2, v5}, Lex0;->l(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 470
    .line 471
    .line 472
    move-result-object v2

    .line 473
    invoke-direct {v0, v2, v12, v8}, Ldi3;-><init>(Ljava/lang/String;Ljava/lang/Exception;I)V

    .line 474
    .line 475
    .line 476
    throw v0

    .line 477
    :pswitch_0
    iget-object v2, v1, Lxf3;->o:Ljava/lang/Object;

    .line 478
    .line 479
    check-cast v2, Landroid/content/ContentResolver;

    .line 480
    .line 481
    const-string v3, "Could not open file descriptor for: "

    .line 482
    .line 483
    const/4 v5, 0x1

    .line 484
    :try_start_6
    iget-object v6, v0, Lij3;->a:Landroid/net/Uri;

    .line 485
    .line 486
    iget-wide v7, v0, Lij3;->c:J

    .line 487
    .line 488
    invoke-virtual {v6}, Landroid/net/Uri;->normalizeScheme()Landroid/net/Uri;

    .line 489
    .line 490
    .line 491
    move-result-object v6

    .line 492
    iput-object v6, v1, Lxf3;->p:Ljava/lang/Object;

    .line 493
    .line 494
    invoke-virtual/range {p0 .. p1}, Lzd3;->c(Lij3;)V

    .line 495
    .line 496
    .line 497
    invoke-virtual {v6}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 498
    .line 499
    .line 500
    move-result-object v9

    .line 501
    const-string v10, "content"

    .line 502
    .line 503
    invoke-static {v9, v10}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 504
    .line 505
    .line 506
    move-result v9

    .line 507
    if-eqz v9, :cond_13

    .line 508
    .line 509
    new-instance v9, Landroid/os/Bundle;

    .line 510
    .line 511
    invoke-direct {v9}, Landroid/os/Bundle;-><init>()V

    .line 512
    .line 513
    .line 514
    const-string v10, "android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT"

    .line 515
    .line 516
    invoke-virtual {v9, v10, v5}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 517
    .line 518
    .line 519
    const-string v10, "*/*"

    .line 520
    .line 521
    invoke-virtual {v2, v6, v10, v9}, Landroid/content/ContentResolver;->openTypedAssetFileDescriptor(Landroid/net/Uri;Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/res/AssetFileDescriptor;

    .line 522
    .line 523
    .line 524
    move-result-object v2

    .line 525
    goto :goto_9

    .line 526
    :catch_6
    move-exception v0

    .line 527
    const/16 v2, 0x7d0

    .line 528
    .line 529
    goto/16 :goto_e

    .line 530
    .line 531
    :catch_7
    move-exception v0

    .line 532
    goto/16 :goto_10

    .line 533
    .line 534
    :cond_13
    const-string v9, "r"

    .line 535
    .line 536
    invoke-virtual {v2, v6, v9}, Landroid/content/ContentResolver;->openAssetFileDescriptor(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/res/AssetFileDescriptor;

    .line 537
    .line 538
    .line 539
    move-result-object v2

    .line 540
    :goto_9
    iput-object v2, v1, Lxf3;->k:Landroid/content/res/AssetFileDescriptor;

    .line 541
    .line 542
    if-eqz v2, :cond_1e

    .line 543
    .line 544
    invoke-virtual {v2}, Landroid/content/res/AssetFileDescriptor;->getLength()J

    .line 545
    .line 546
    .line 547
    move-result-wide v9

    .line 548
    new-instance v3, Ljava/io/FileInputStream;

    .line 549
    .line 550
    invoke-virtual {v2}, Landroid/content/res/AssetFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;

    .line 551
    .line 552
    .line 553
    move-result-object v6

    .line 554
    invoke-direct {v3, v6}, Ljava/io/FileInputStream;-><init>(Ljava/io/FileDescriptor;)V

    .line 555
    .line 556
    .line 557
    iput-object v3, v1, Lxf3;->l:Ljava/io/FileInputStream;

    .line 558
    .line 559
    const-wide/16 v11, -0x1

    .line 560
    .line 561
    cmp-long v6, v9, v11

    .line 562
    .line 563
    const/16 v13, 0x7d8

    .line 564
    .line 565
    const/4 v14, 0x0

    .line 566
    if-eqz v6, :cond_15

    .line 567
    .line 568
    cmp-long v15, v7, v9

    .line 569
    .line 570
    if-gtz v15, :cond_14

    .line 571
    .line 572
    goto :goto_a

    .line 573
    :cond_14
    new-instance v0, Lpf3;

    .line 574
    .line 575
    invoke-direct {v0, v13, v14}, Ldi3;-><init>(ILjava/lang/Exception;)V

    .line 576
    .line 577
    .line 578
    throw v0

    .line 579
    :cond_15
    :goto_a
    invoke-virtual {v2}, Landroid/content/res/AssetFileDescriptor;->getStartOffset()J

    .line 580
    .line 581
    .line 582
    move-result-wide v15

    .line 583
    add-long v4, v15, v7

    .line 584
    .line 585
    invoke-virtual {v3, v4, v5}, Ljava/io/FileInputStream;->skip(J)J

    .line 586
    .line 587
    .line 588
    move-result-wide v4

    .line 589
    sub-long/2addr v4, v15

    .line 590
    cmp-long v7, v4, v7

    .line 591
    .line 592
    if-nez v7, :cond_1d

    .line 593
    .line 594
    const-wide/16 v7, 0x0

    .line 595
    .line 596
    if-nez v6, :cond_18

    .line 597
    .line 598
    invoke-virtual {v3}, Ljava/io/FileInputStream;->getChannel()Ljava/nio/channels/FileChannel;

    .line 599
    .line 600
    .line 601
    move-result-object v3

    .line 602
    invoke-virtual {v3}, Ljava/nio/channels/FileChannel;->size()J

    .line 603
    .line 604
    .line 605
    move-result-wide v4

    .line 606
    cmp-long v6, v4, v7

    .line 607
    .line 608
    if-nez v6, :cond_16

    .line 609
    .line 610
    iput-wide v11, v1, Lxf3;->m:J

    .line 611
    .line 612
    move-wide v4, v11

    .line 613
    goto :goto_b

    .line 614
    :cond_16
    invoke-virtual {v3}, Ljava/nio/channels/FileChannel;->position()J

    .line 615
    .line 616
    .line 617
    move-result-wide v9

    .line 618
    sub-long/2addr v4, v9

    .line 619
    iput-wide v4, v1, Lxf3;->m:J

    .line 620
    .line 621
    cmp-long v3, v4, v7

    .line 622
    .line 623
    if-ltz v3, :cond_17

    .line 624
    .line 625
    goto :goto_b

    .line 626
    :cond_17
    new-instance v0, Lpf3;

    .line 627
    .line 628
    invoke-direct {v0, v13, v14}, Ldi3;-><init>(ILjava/lang/Exception;)V

    .line 629
    .line 630
    .line 631
    throw v0

    .line 632
    :cond_18
    sub-long v4, v9, v4

    .line 633
    .line 634
    iput-wide v4, v1, Lxf3;->m:J
    :try_end_6
    .catch Lpf3; {:try_start_6 .. :try_end_6} :catch_7
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_6

    .line 635
    .line 636
    cmp-long v3, v4, v7

    .line 637
    .line 638
    if-ltz v3, :cond_1c

    .line 639
    .line 640
    :goto_b
    iget-wide v2, v0, Lij3;->d:J

    .line 641
    .line 642
    cmp-long v6, v2, v11

    .line 643
    .line 644
    if-eqz v6, :cond_1a

    .line 645
    .line 646
    cmp-long v7, v4, v11

    .line 647
    .line 648
    if-nez v7, :cond_19

    .line 649
    .line 650
    move-wide v4, v2

    .line 651
    goto :goto_c

    .line 652
    :cond_19
    invoke-static {v4, v5, v2, v3}, Ljava/lang/Math;->min(JJ)J

    .line 653
    .line 654
    .line 655
    move-result-wide v4

    .line 656
    :goto_c
    iput-wide v4, v1, Lxf3;->m:J

    .line 657
    .line 658
    :cond_1a
    const/4 v4, 0x1

    .line 659
    iput-boolean v4, v1, Lxf3;->n:Z

    .line 660
    .line 661
    invoke-virtual/range {p0 .. p1}, Lzd3;->e(Lij3;)V

    .line 662
    .line 663
    .line 664
    if-eqz v6, :cond_1b

    .line 665
    .line 666
    goto :goto_d

    .line 667
    :cond_1b
    iget-wide v2, v1, Lxf3;->m:J

    .line 668
    .line 669
    :goto_d
    return-wide v2

    .line 670
    :cond_1c
    :try_start_7
    new-instance v0, Lpf3;

    .line 671
    .line 672
    invoke-direct {v0, v13, v14}, Ldi3;-><init>(ILjava/lang/Exception;)V

    .line 673
    .line 674
    .line 675
    throw v0

    .line 676
    :cond_1d
    new-instance v0, Lpf3;

    .line 677
    .line 678
    invoke-direct {v0, v13, v14}, Ldi3;-><init>(ILjava/lang/Exception;)V

    .line 679
    .line 680
    .line 681
    throw v0

    .line 682
    :cond_1e
    new-instance v0, Lpf3;

    .line 683
    .line 684
    new-instance v4, Ljava/io/IOException;

    .line 685
    .line 686
    invoke-static {v6}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 687
    .line 688
    .line 689
    move-result-object v5

    .line 690
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 691
    .line 692
    .line 693
    move-result v6

    .line 694
    add-int/lit8 v6, v6, 0x24

    .line 695
    .line 696
    new-instance v7, Ljava/lang/StringBuilder;

    .line 697
    .line 698
    invoke-direct {v7, v6}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 699
    .line 700
    .line 701
    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 702
    .line 703
    .line 704
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 705
    .line 706
    .line 707
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 708
    .line 709
    .line 710
    move-result-object v3

    .line 711
    invoke-direct {v4, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V
    :try_end_7
    .catch Lpf3; {:try_start_7 .. :try_end_7} :catch_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_6

    .line 712
    .line 713
    .line 714
    const/16 v2, 0x7d0

    .line 715
    .line 716
    :try_start_8
    invoke-direct {v0, v2, v4}, Ldi3;-><init>(ILjava/lang/Exception;)V

    .line 717
    .line 718
    .line 719
    throw v0
    :try_end_8
    .catch Lpf3; {:try_start_8 .. :try_end_8} :catch_7
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_8

    .line 720
    :catch_8
    move-exception v0

    .line 721
    :goto_e
    new-instance v3, Lpf3;

    .line 722
    .line 723
    instance-of v4, v0, Ljava/io/FileNotFoundException;

    .line 724
    .line 725
    const/4 v5, 0x1

    .line 726
    if-eq v5, v4, :cond_1f

    .line 727
    .line 728
    move v4, v2

    .line 729
    goto :goto_f

    .line 730
    :cond_1f
    const/16 v4, 0x7d5

    .line 731
    .line 732
    :goto_f
    invoke-direct {v3, v4, v0}, Ldi3;-><init>(ILjava/lang/Exception;)V

    .line 733
    .line 734
    .line 735
    throw v3

    .line 736
    :goto_10
    throw v0

    .line 737
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final d([BII)I
    .locals 10

    .line 1
    iget v0, p0, Lxf3;->j:I

    .line 2
    .line 3
    const-wide/16 v1, 0x0

    .line 4
    .line 5
    const/4 v3, 0x0

    .line 6
    const-wide/16 v4, -0x1

    .line 7
    .line 8
    const/4 v6, -0x1

    .line 9
    const/16 v7, 0x7d0

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    if-nez p3, :cond_0

    .line 15
    .line 16
    goto :goto_3

    .line 17
    :cond_0
    iget-wide v8, p0, Lxf3;->m:J

    .line 18
    .line 19
    cmp-long v0, v8, v1

    .line 20
    .line 21
    if-eqz v0, :cond_5

    .line 22
    .line 23
    cmp-long v0, v8, v4

    .line 24
    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    int-to-long v0, p3

    .line 28
    :try_start_0
    invoke-static {v8, v9, v0, v1}, Ljava/lang/Math;->min(JJ)J

    .line 29
    .line 30
    .line 31
    move-result-wide v0

    .line 32
    long-to-int p3, v0

    .line 33
    goto :goto_0

    .line 34
    :catch_0
    move-exception p1

    .line 35
    goto :goto_1

    .line 36
    :cond_1
    :goto_0
    iget-object v0, p0, Lxf3;->l:Ljava/io/FileInputStream;

    .line 37
    .line 38
    sget-object v1, Lv23;->a:Ljava/lang/String;

    .line 39
    .line 40
    invoke-virtual {v0, p1, p2, p3}, Ljava/io/InputStream;->read([BII)I

    .line 41
    .line 42
    .line 43
    move-result v3
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 44
    if-ne v3, v6, :cond_3

    .line 45
    .line 46
    iget-wide p1, p0, Lxf3;->m:J

    .line 47
    .line 48
    cmp-long p1, p1, v4

    .line 49
    .line 50
    if-nez p1, :cond_2

    .line 51
    .line 52
    goto :goto_2

    .line 53
    :cond_2
    new-instance p1, Lgr3;

    .line 54
    .line 55
    new-instance p2, Ljava/io/EOFException;

    .line 56
    .line 57
    invoke-direct {p2}, Ljava/io/EOFException;-><init>()V

    .line 58
    .line 59
    .line 60
    const-string p3, "End of stream reached having not read sufficient data."

    .line 61
    .line 62
    invoke-direct {p1, p3, p2, v7}, Ldi3;-><init>(Ljava/lang/String;Ljava/lang/Exception;I)V

    .line 63
    .line 64
    .line 65
    throw p1

    .line 66
    :cond_3
    iget-wide p1, p0, Lxf3;->m:J

    .line 67
    .line 68
    cmp-long p3, p1, v4

    .line 69
    .line 70
    if-eqz p3, :cond_4

    .line 71
    .line 72
    int-to-long v0, v3

    .line 73
    sub-long/2addr p1, v0

    .line 74
    iput-wide p1, p0, Lxf3;->m:J

    .line 75
    .line 76
    :cond_4
    invoke-virtual {p0, v3}, Lzd3;->f(I)V

    .line 77
    .line 78
    .line 79
    goto :goto_3

    .line 80
    :goto_1
    new-instance p2, Lgr3;

    .line 81
    .line 82
    const/4 p3, 0x0

    .line 83
    invoke-direct {p2, p3, p1, v7}, Ldi3;-><init>(Ljava/lang/String;Ljava/lang/Exception;I)V

    .line 84
    .line 85
    .line 86
    throw p2

    .line 87
    :cond_5
    :goto_2
    move v3, v6

    .line 88
    :goto_3
    return v3

    .line 89
    :pswitch_0
    if-nez p3, :cond_6

    .line 90
    .line 91
    goto :goto_7

    .line 92
    :cond_6
    iget-wide v8, p0, Lxf3;->m:J

    .line 93
    .line 94
    cmp-long v0, v8, v1

    .line 95
    .line 96
    if-eqz v0, :cond_a

    .line 97
    .line 98
    cmp-long v0, v8, v4

    .line 99
    .line 100
    if-eqz v0, :cond_7

    .line 101
    .line 102
    int-to-long v0, p3

    .line 103
    :try_start_1
    invoke-static {v8, v9, v0, v1}, Ljava/lang/Math;->min(JJ)J

    .line 104
    .line 105
    .line 106
    move-result-wide v0

    .line 107
    long-to-int p3, v0

    .line 108
    goto :goto_4

    .line 109
    :catch_1
    move-exception p1

    .line 110
    goto :goto_5

    .line 111
    :cond_7
    :goto_4
    iget-object v0, p0, Lxf3;->l:Ljava/io/FileInputStream;

    .line 112
    .line 113
    sget-object v1, Lv23;->a:Ljava/lang/String;

    .line 114
    .line 115
    invoke-virtual {v0, p1, p2, p3}, Ljava/io/FileInputStream;->read([BII)I

    .line 116
    .line 117
    .line 118
    move-result v3
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    .line 119
    if-ne v3, v6, :cond_8

    .line 120
    .line 121
    goto :goto_6

    .line 122
    :cond_8
    iget-wide p1, p0, Lxf3;->m:J

    .line 123
    .line 124
    cmp-long p3, p1, v4

    .line 125
    .line 126
    if-eqz p3, :cond_9

    .line 127
    .line 128
    int-to-long v0, v3

    .line 129
    sub-long/2addr p1, v0

    .line 130
    iput-wide p1, p0, Lxf3;->m:J

    .line 131
    .line 132
    :cond_9
    invoke-virtual {p0, v3}, Lzd3;->f(I)V

    .line 133
    .line 134
    .line 135
    goto :goto_7

    .line 136
    :goto_5
    new-instance p2, Lpf3;

    .line 137
    .line 138
    invoke-direct {p2, v7, p1}, Ldi3;-><init>(ILjava/lang/Exception;)V

    .line 139
    .line 140
    .line 141
    throw p2

    .line 142
    :cond_a
    :goto_6
    move v3, v6

    .line 143
    :goto_7
    return v3

    .line 144
    nop

    .line 145
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final h()Landroid/net/Uri;
    .locals 1

    .line 1
    iget v0, p0, Lxf3;->j:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lxf3;->p:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lij3;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object v0, v0, Lij3;->a:Landroid/net/Uri;

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 v0, 0x0

    .line 16
    :goto_0
    return-object v0

    .line 17
    :pswitch_0
    iget-object v0, p0, Lxf3;->p:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v0, Landroid/net/Uri;

    .line 20
    .line 21
    return-object v0

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final l()V
    .locals 5

    .line 1
    iget v0, p0, Lxf3;->j:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    iput-object v0, p0, Lxf3;->p:Ljava/lang/Object;

    .line 8
    .line 9
    const/16 v1, 0x7d0

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    :try_start_0
    iget-object v3, p0, Lxf3;->l:Ljava/io/FileInputStream;

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :catchall_0
    move-exception v3

    .line 21
    goto :goto_4

    .line 22
    :catch_0
    move-exception v3

    .line 23
    goto :goto_3

    .line 24
    :cond_0
    :goto_0
    iput-object v0, p0, Lxf3;->l:Ljava/io/FileInputStream;

    .line 25
    .line 26
    :try_start_1
    iget-object v3, p0, Lxf3;->k:Landroid/content/res/AssetFileDescriptor;

    .line 27
    .line 28
    if-eqz v3, :cond_1

    .line 29
    .line 30
    invoke-virtual {v3}, Landroid/content/res/AssetFileDescriptor;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 31
    .line 32
    .line 33
    goto :goto_1

    .line 34
    :catchall_1
    move-exception v1

    .line 35
    goto :goto_7

    .line 36
    :catch_1
    move-exception v3

    .line 37
    goto :goto_2

    .line 38
    :cond_1
    :goto_1
    iput-object v0, p0, Lxf3;->k:Landroid/content/res/AssetFileDescriptor;

    .line 39
    .line 40
    iget-boolean v0, p0, Lxf3;->n:Z

    .line 41
    .line 42
    if-eqz v0, :cond_2

    .line 43
    .line 44
    iput-boolean v2, p0, Lxf3;->n:Z

    .line 45
    .line 46
    invoke-virtual {p0}, Lzd3;->j()V

    .line 47
    .line 48
    .line 49
    :cond_2
    return-void

    .line 50
    :goto_2
    :try_start_2
    new-instance v4, Lgr3;

    .line 51
    .line 52
    invoke-direct {v4, v0, v3, v1}, Ldi3;-><init>(Ljava/lang/String;Ljava/lang/Exception;I)V

    .line 53
    .line 54
    .line 55
    throw v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 56
    :goto_3
    :try_start_3
    new-instance v4, Lgr3;

    .line 57
    .line 58
    invoke-direct {v4, v0, v3, v1}, Ldi3;-><init>(Ljava/lang/String;Ljava/lang/Exception;I)V

    .line 59
    .line 60
    .line 61
    throw v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 62
    :goto_4
    iput-object v0, p0, Lxf3;->l:Ljava/io/FileInputStream;

    .line 63
    .line 64
    :try_start_4
    iget-object v4, p0, Lxf3;->k:Landroid/content/res/AssetFileDescriptor;

    .line 65
    .line 66
    if-eqz v4, :cond_3

    .line 67
    .line 68
    invoke-virtual {v4}, Landroid/content/res/AssetFileDescriptor;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 69
    .line 70
    .line 71
    goto :goto_5

    .line 72
    :catch_2
    move-exception v3

    .line 73
    goto :goto_6

    .line 74
    :cond_3
    :goto_5
    iput-object v0, p0, Lxf3;->k:Landroid/content/res/AssetFileDescriptor;

    .line 75
    .line 76
    iget-boolean v0, p0, Lxf3;->n:Z

    .line 77
    .line 78
    if-eqz v0, :cond_4

    .line 79
    .line 80
    iput-boolean v2, p0, Lxf3;->n:Z

    .line 81
    .line 82
    invoke-virtual {p0}, Lzd3;->j()V

    .line 83
    .line 84
    .line 85
    :cond_4
    throw v3

    .line 86
    :goto_6
    :try_start_5
    new-instance v4, Lgr3;

    .line 87
    .line 88
    invoke-direct {v4, v0, v3, v1}, Ldi3;-><init>(Ljava/lang/String;Ljava/lang/Exception;I)V

    .line 89
    .line 90
    .line 91
    throw v4
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 92
    :goto_7
    iput-object v0, p0, Lxf3;->k:Landroid/content/res/AssetFileDescriptor;

    .line 93
    .line 94
    iget-boolean v0, p0, Lxf3;->n:Z

    .line 95
    .line 96
    if-eqz v0, :cond_5

    .line 97
    .line 98
    iput-boolean v2, p0, Lxf3;->n:Z

    .line 99
    .line 100
    invoke-virtual {p0}, Lzd3;->j()V

    .line 101
    .line 102
    .line 103
    :cond_5
    throw v1

    .line 104
    :pswitch_0
    const/4 v0, 0x0

    .line 105
    iput-object v0, p0, Lxf3;->p:Ljava/lang/Object;

    .line 106
    .line 107
    const/16 v1, 0x7d0

    .line 108
    .line 109
    const/4 v2, 0x0

    .line 110
    :try_start_6
    iget-object v3, p0, Lxf3;->l:Ljava/io/FileInputStream;

    .line 111
    .line 112
    if-eqz v3, :cond_6

    .line 113
    .line 114
    invoke-virtual {v3}, Ljava/io/FileInputStream;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_3
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 115
    .line 116
    .line 117
    goto :goto_8

    .line 118
    :catchall_2
    move-exception v3

    .line 119
    goto :goto_c

    .line 120
    :catch_3
    move-exception v3

    .line 121
    goto :goto_b

    .line 122
    :cond_6
    :goto_8
    iput-object v0, p0, Lxf3;->l:Ljava/io/FileInputStream;

    .line 123
    .line 124
    :try_start_7
    iget-object v3, p0, Lxf3;->k:Landroid/content/res/AssetFileDescriptor;

    .line 125
    .line 126
    if-eqz v3, :cond_7

    .line 127
    .line 128
    invoke-virtual {v3}, Landroid/content/res/AssetFileDescriptor;->close()V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_4
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 129
    .line 130
    .line 131
    goto :goto_9

    .line 132
    :catchall_3
    move-exception v1

    .line 133
    goto :goto_f

    .line 134
    :catch_4
    move-exception v3

    .line 135
    goto :goto_a

    .line 136
    :cond_7
    :goto_9
    iput-object v0, p0, Lxf3;->k:Landroid/content/res/AssetFileDescriptor;

    .line 137
    .line 138
    iget-boolean v0, p0, Lxf3;->n:Z

    .line 139
    .line 140
    if-eqz v0, :cond_8

    .line 141
    .line 142
    iput-boolean v2, p0, Lxf3;->n:Z

    .line 143
    .line 144
    invoke-virtual {p0}, Lzd3;->j()V

    .line 145
    .line 146
    .line 147
    :cond_8
    return-void

    .line 148
    :goto_a
    :try_start_8
    new-instance v4, Lpf3;

    .line 149
    .line 150
    invoke-direct {v4, v1, v3}, Ldi3;-><init>(ILjava/lang/Exception;)V

    .line 151
    .line 152
    .line 153
    throw v4
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    .line 154
    :goto_b
    :try_start_9
    new-instance v4, Lpf3;

    .line 155
    .line 156
    invoke-direct {v4, v1, v3}, Ldi3;-><init>(ILjava/lang/Exception;)V

    .line 157
    .line 158
    .line 159
    throw v4
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    .line 160
    :goto_c
    iput-object v0, p0, Lxf3;->l:Ljava/io/FileInputStream;

    .line 161
    .line 162
    :try_start_a
    iget-object v4, p0, Lxf3;->k:Landroid/content/res/AssetFileDescriptor;

    .line 163
    .line 164
    if-eqz v4, :cond_9

    .line 165
    .line 166
    invoke-virtual {v4}, Landroid/content/res/AssetFileDescriptor;->close()V
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_5
    .catchall {:try_start_a .. :try_end_a} :catchall_3

    .line 167
    .line 168
    .line 169
    goto :goto_d

    .line 170
    :catch_5
    move-exception v3

    .line 171
    goto :goto_e

    .line 172
    :cond_9
    :goto_d
    iput-object v0, p0, Lxf3;->k:Landroid/content/res/AssetFileDescriptor;

    .line 173
    .line 174
    iget-boolean v0, p0, Lxf3;->n:Z

    .line 175
    .line 176
    if-eqz v0, :cond_a

    .line 177
    .line 178
    iput-boolean v2, p0, Lxf3;->n:Z

    .line 179
    .line 180
    invoke-virtual {p0}, Lzd3;->j()V

    .line 181
    .line 182
    .line 183
    :cond_a
    throw v3

    .line 184
    :goto_e
    :try_start_b
    new-instance v4, Lpf3;

    .line 185
    .line 186
    invoke-direct {v4, v1, v3}, Ldi3;-><init>(ILjava/lang/Exception;)V

    .line 187
    .line 188
    .line 189
    throw v4
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_3

    .line 190
    :goto_f
    iput-object v0, p0, Lxf3;->k:Landroid/content/res/AssetFileDescriptor;

    .line 191
    .line 192
    iget-boolean v0, p0, Lxf3;->n:Z

    .line 193
    .line 194
    if-eqz v0, :cond_b

    .line 195
    .line 196
    iput-boolean v2, p0, Lxf3;->n:Z

    .line 197
    .line 198
    invoke-virtual {p0}, Lzd3;->j()V

    .line 199
    .line 200
    .line 201
    :cond_b
    throw v1

    .line 202
    nop

    .line 203
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
