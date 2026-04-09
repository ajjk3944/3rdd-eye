.class public final Lbz2;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lo93;


# static fields
.field public static final i:Ljava/util/regex/Pattern;


# instance fields
.field public final f:Ljava/lang/String;

.field public final g:Laa3;

.field public final h:Lda3;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-string v0, "([^;]+=[^;]+)(;\\s|$)"

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    invoke-static {v0, v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    sput-object v0, Lbz2;->i:Ljava/util/regex/Pattern;

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lda3;Laa3;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lbz2;->f:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Lbz2;->h:Lda3;

    .line 7
    .line 8
    iput-object p3, p0, Lbz2;->g:Laa3;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    check-cast v0, Laz2;

    .line 6
    .line 7
    iget-object v2, v0, Laz2;->a:Lorg/json/JSONObject;

    .line 8
    .line 9
    const-string v3, "http_timeout_millis"

    .line 10
    .line 11
    const v4, 0xea60

    .line 12
    .line 13
    .line 14
    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 15
    .line 16
    .line 17
    move-result v7

    .line 18
    iget-object v2, v0, Laz2;->b:Lga2;

    .line 19
    .line 20
    iget v3, v2, Lga2;->g:I

    .line 21
    .line 22
    iget-object v4, v2, Lga2;->m:Ljava/lang/String;

    .line 23
    .line 24
    iget-object v5, v2, Lga2;->c:Ljava/lang/String;

    .line 25
    .line 26
    const/4 v6, -0x2

    .line 27
    iget-object v8, v1, Lbz2;->g:Laa3;

    .line 28
    .line 29
    iget-object v9, v1, Lbz2;->h:Lda3;

    .line 30
    .line 31
    const/4 v11, 0x1

    .line 32
    const-string v12, ""

    .line 33
    .line 34
    if-ne v3, v6, :cond_e

    .line 35
    .line 36
    new-instance v3, Ljava/util/HashMap;

    .line 37
    .line 38
    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 39
    .line 40
    .line 41
    iget-boolean v6, v2, Lga2;->e:Z

    .line 42
    .line 43
    if-eqz v6, :cond_6

    .line 44
    .line 45
    iget-object v6, v1, Lbz2;->f:Ljava/lang/String;

    .line 46
    .line 47
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 48
    .line 49
    .line 50
    move-result v13

    .line 51
    if-nez v13, :cond_6

    .line 52
    .line 53
    sget-object v13, Lmz1;->X0:Liz1;

    .line 54
    .line 55
    sget-object v14, Ltw1;->e:Ltw1;

    .line 56
    .line 57
    iget-object v14, v14, Ltw1;->c:Lkz1;

    .line 58
    .line 59
    invoke-virtual {v14, v13}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v13

    .line 63
    check-cast v13, Ljava/lang/Boolean;

    .line 64
    .line 65
    invoke-virtual {v13}, Ljava/lang/Boolean;->booleanValue()Z

    .line 66
    .line 67
    .line 68
    move-result v13

    .line 69
    const-string v14, "Cookie"

    .line 70
    .line 71
    if-eqz v13, :cond_5

    .line 72
    .line 73
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 74
    .line 75
    .line 76
    move-result v13

    .line 77
    if-eqz v13, :cond_0

    .line 78
    .line 79
    move-object v13, v12

    .line 80
    goto :goto_1

    .line 81
    :cond_0
    sget-object v13, Lbz2;->i:Ljava/util/regex/Pattern;

    .line 82
    .line 83
    invoke-virtual {v13, v6}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 84
    .line 85
    .line 86
    move-result-object v6

    .line 87
    move-object v13, v12

    .line 88
    :goto_0
    invoke-virtual {v6}, Ljava/util/regex/Matcher;->find()Z

    .line 89
    .line 90
    .line 91
    move-result v15

    .line 92
    if-eqz v15, :cond_4

    .line 93
    .line 94
    invoke-virtual {v6, v11}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v15

    .line 98
    if-eqz v15, :cond_3

    .line 99
    .line 100
    sget-object v11, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 101
    .line 102
    invoke-virtual {v15, v11}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v10

    .line 106
    const-string v1, "id="

    .line 107
    .line 108
    invoke-virtual {v10, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 109
    .line 110
    .line 111
    move-result v1

    .line 112
    if-nez v1, :cond_1

    .line 113
    .line 114
    invoke-virtual {v15, v11}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v1

    .line 118
    const-string v10, "ide="

    .line 119
    .line 120
    invoke-virtual {v1, v10}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 121
    .line 122
    .line 123
    move-result v1

    .line 124
    if-eqz v1, :cond_3

    .line 125
    .line 126
    :cond_1
    invoke-static {v13}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 127
    .line 128
    .line 129
    move-result v1

    .line 130
    if-nez v1, :cond_2

    .line 131
    .line 132
    const-string v1, "; "

    .line 133
    .line 134
    invoke-virtual {v13, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v13

    .line 138
    :cond_2
    invoke-virtual {v13, v15}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v13

    .line 142
    :cond_3
    move-object/from16 v1, p0

    .line 143
    .line 144
    const/4 v11, 0x1

    .line 145
    goto :goto_0

    .line 146
    :cond_4
    :goto_1
    invoke-static {v13}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 147
    .line 148
    .line 149
    move-result v1

    .line 150
    if-nez v1, :cond_6

    .line 151
    .line 152
    invoke-virtual {v3, v14, v13}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    goto :goto_2

    .line 156
    :cond_5
    invoke-virtual {v3, v14, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    :cond_6
    :goto_2
    iget-boolean v1, v2, Lga2;->d:Z

    .line 160
    .line 161
    if-eqz v1, :cond_7

    .line 162
    .line 163
    iget-object v0, v0, Laz2;->a:Lorg/json/JSONObject;

    .line 164
    .line 165
    if-nez v0, :cond_8

    .line 166
    .line 167
    :cond_7
    :goto_3
    const/4 v0, 0x0

    .line 168
    goto :goto_4

    .line 169
    :cond_8
    const-string v1, "pii"

    .line 170
    .line 171
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    if-eqz v0, :cond_a

    .line 176
    .line 177
    const-string v1, "doritos"

    .line 178
    .line 179
    invoke-virtual {v0, v1, v12}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object v6

    .line 183
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 184
    .line 185
    .line 186
    move-result v6

    .line 187
    if-nez v6, :cond_9

    .line 188
    .line 189
    invoke-virtual {v0, v1, v12}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object v1

    .line 193
    const-string v6, "x-afma-drt-cookie"

    .line 194
    .line 195
    invoke-virtual {v3, v6, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    :cond_9
    const-string v1, "doritos_v2"

    .line 199
    .line 200
    invoke-virtual {v0, v1, v12}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object v6

    .line 204
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 205
    .line 206
    .line 207
    move-result v6

    .line 208
    if-nez v6, :cond_7

    .line 209
    .line 210
    invoke-virtual {v0, v1, v12}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object v0

    .line 214
    const-string v1, "x-afma-drt-v2-cookie"

    .line 215
    .line 216
    invoke-virtual {v3, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    goto :goto_3

    .line 220
    :cond_a
    const-string v0, "DSID signal does not exist."

    .line 221
    .line 222
    invoke-static {v0}, Lgi2;->G(Ljava/lang/String;)V

    .line 223
    .line 224
    .line 225
    goto :goto_3

    .line 226
    :goto_4
    new-array v0, v0, [B

    .line 227
    .line 228
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 229
    .line 230
    .line 231
    move-result v1

    .line 232
    if-nez v1, :cond_c

    .line 233
    .line 234
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 235
    .line 236
    invoke-virtual {v5, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 237
    .line 238
    .line 239
    move-result-object v1

    .line 240
    iget-boolean v0, v2, Lga2;->l:Z

    .line 241
    .line 242
    if-eqz v0, :cond_b

    .line 243
    .line 244
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    .line 245
    .line 246
    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 247
    .line 248
    .line 249
    :try_start_0
    new-instance v5, Ljava/util/zip/GZIPOutputStream;

    .line 250
    .line 251
    invoke-direct {v5, v0}, Ljava/util/zip/GZIPOutputStream;-><init>(Ljava/io/OutputStream;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 252
    .line 253
    .line 254
    :try_start_1
    invoke-virtual {v5, v1}, Ljava/io/OutputStream;->write([B)V

    .line 255
    .line 256
    .line 257
    invoke-virtual {v5}, Ljava/util/zip/GZIPOutputStream;->finish()V

    .line 258
    .line 259
    .line 260
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 261
    .line 262
    .line 263
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 264
    :try_start_2
    invoke-virtual {v5}, Ljava/io/OutputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    .line 265
    .line 266
    .line 267
    goto :goto_7

    .line 268
    :catch_0
    move-exception v0

    .line 269
    goto :goto_6

    .line 270
    :catchall_0
    move-exception v0

    .line 271
    move-object v6, v0

    .line 272
    :try_start_3
    invoke-virtual {v5}, Ljava/io/OutputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 273
    .line 274
    .line 275
    goto :goto_5

    .line 276
    :catchall_1
    move-exception v0

    .line 277
    :try_start_4
    invoke-virtual {v6, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 278
    .line 279
    .line 280
    :goto_5
    throw v6
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    .line 281
    :goto_6
    invoke-static {}, Lgi2;->R()Z

    .line 282
    .line 283
    .line 284
    sget-object v5, Lhg4;->C:Lhg4;

    .line 285
    .line 286
    iget-object v5, v5, Lhg4;->h:Lgd2;

    .line 287
    .line 288
    const-string v6, "PrepareRequestFunction.apply"

    .line 289
    .line 290
    invoke-virtual {v5, v6, v0}, Lgd2;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 291
    .line 292
    .line 293
    const/4 v0, 0x0

    .line 294
    :goto_7
    if-eqz v0, :cond_b

    .line 295
    .line 296
    const-string v1, "Content-Encoding"

    .line 297
    .line 298
    const-string v5, "gzip"

    .line 299
    .line 300
    invoke-virtual {v3, v1, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 301
    .line 302
    .line 303
    goto :goto_8

    .line 304
    :cond_b
    move-object v0, v1

    .line 305
    :cond_c
    :goto_8
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 306
    .line 307
    .line 308
    move-result v1

    .line 309
    if-nez v1, :cond_d

    .line 310
    .line 311
    move-object v10, v4

    .line 312
    :goto_9
    const/4 v1, 0x1

    .line 313
    goto :goto_a

    .line 314
    :cond_d
    move-object v10, v12

    .line 315
    goto :goto_9

    .line 316
    :goto_a
    invoke-interface {v8, v1}, Laa3;->b(Z)Laa3;

    .line 317
    .line 318
    .line 319
    invoke-virtual {v9, v8}, Lda3;->a(Laa3;)V

    .line 320
    .line 321
    .line 322
    new-instance v5, Lyy2;

    .line 323
    .line 324
    iget-object v6, v2, Lga2;->f:Ljava/lang/String;

    .line 325
    .line 326
    move-object v9, v0

    .line 327
    move-object v8, v3

    .line 328
    invoke-direct/range {v5 .. v10}, Lyy2;-><init>(Ljava/lang/String;ILjava/util/HashMap;[BLjava/lang/String;)V

    .line 329
    .line 330
    .line 331
    return-object v5

    .line 332
    :cond_e
    move v1, v11

    .line 333
    if-ne v3, v1, :cond_10

    .line 334
    .line 335
    iget-object v0, v2, Lga2;->a:Ljava/util/List;

    .line 336
    .line 337
    if-eqz v0, :cond_f

    .line 338
    .line 339
    const-string v1, ", "

    .line 340
    .line 341
    invoke-static {v1, v0}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;

    .line 342
    .line 343
    .line 344
    move-result-object v12

    .line 345
    invoke-static {v12}, Lgi2;->Z(Ljava/lang/String;)V

    .line 346
    .line 347
    .line 348
    :cond_f
    new-instance v0, Lhx2;

    .line 349
    .line 350
    const-string v1, "Error building request URL: "

    .line 351
    .line 352
    invoke-static {v12}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 353
    .line 354
    .line 355
    move-result-object v2

    .line 356
    invoke-virtual {v1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 357
    .line 358
    .line 359
    move-result-object v1

    .line 360
    const/4 v2, 0x2

    .line 361
    invoke-direct {v0, v1, v2}, Lhx2;-><init>(Ljava/lang/String;I)V

    .line 362
    .line 363
    .line 364
    goto :goto_b

    .line 365
    :cond_10
    new-instance v0, Lhx2;

    .line 366
    .line 367
    const/4 v1, 0x1

    .line 368
    invoke-direct {v0, v1}, Lhx2;-><init>(I)V

    .line 369
    .line 370
    .line 371
    :goto_b
    invoke-interface {v8, v0}, Laa3;->j(Ljava/lang/Throwable;)Laa3;

    .line 372
    .line 373
    .line 374
    const/4 v1, 0x0

    .line 375
    invoke-interface {v8, v1}, Laa3;->b(Z)Laa3;

    .line 376
    .line 377
    .line 378
    invoke-virtual {v9, v8}, Lda3;->a(Laa3;)V

    .line 379
    .line 380
    .line 381
    throw v0
.end method
