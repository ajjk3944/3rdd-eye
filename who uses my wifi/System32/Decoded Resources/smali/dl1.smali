.class public final Ldl1;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lkk1;


# static fields
.field public static final i:Ljava/util/regex/Pattern;

.field public static final j:Ljava/util/regex/Pattern;


# instance fields
.field public final f:Ljava/lang/StringBuilder;

.field public final g:Ljava/util/ArrayList;

.field public final h:Lkz2;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Ldl1;->i:Ljava/util/regex/Pattern;

    .line 8
    .line 9
    const-string v0, "\\{\\\\.*?\\}"

    .line 10
    .line 11
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Ldl1;->j:Ljava/util/regex/Pattern;

    .line 16
    .line 17
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Ldl1;->f:Ljava/lang/StringBuilder;

    .line 10
    .line 11
    new-instance v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Ldl1;->g:Ljava/util/ArrayList;

    .line 17
    .line 18
    new-instance v0, Lkz2;

    .line 19
    .line 20
    invoke-direct {v0}, Lkz2;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Ldl1;->h:Lkz2;

    .line 24
    .line 25
    return-void
.end method

.method public static a(Ljava/util/regex/Matcher;I)J
    .locals 6

    .line 1
    add-int/lit8 v0, p1, 0x1

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    const-wide/32 v2, 0x36ee80

    .line 14
    .line 15
    .line 16
    mul-long/2addr v0, v2

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const-wide/16 v0, 0x0

    .line 19
    .line 20
    :goto_0
    add-int/lit8 v2, p1, 0x2

    .line 21
    .line 22
    invoke-virtual {p0, v2}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    invoke-static {v2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 30
    .line 31
    .line 32
    move-result-wide v2

    .line 33
    const-wide/32 v4, 0xea60

    .line 34
    .line 35
    .line 36
    mul-long/2addr v2, v4

    .line 37
    add-long/2addr v2, v0

    .line 38
    add-int/lit8 v0, p1, 0x3

    .line 39
    .line 40
    invoke-virtual {p0, v0}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 48
    .line 49
    .line 50
    move-result-wide v0

    .line 51
    const-wide/16 v4, 0x3e8

    .line 52
    .line 53
    mul-long/2addr v0, v4

    .line 54
    add-long/2addr v0, v2

    .line 55
    add-int/lit8 p1, p1, 0x4

    .line 56
    .line 57
    invoke-virtual {p0, p1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    if-eqz p0, :cond_1

    .line 62
    .line 63
    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 64
    .line 65
    .line 66
    move-result-wide p0

    .line 67
    add-long/2addr v0, p0

    .line 68
    :cond_1
    mul-long/2addr v0, v4

    .line 69
    return-wide v0
.end method


# virtual methods
.method public final g([BIILlk1;)V
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p2

    .line 4
    .line 5
    add-int v2, v1, p3

    .line 6
    .line 7
    iget-object v3, v0, Ldl1;->h:Lkz2;

    .line 8
    .line 9
    move-object/from16 v4, p1

    .line 10
    .line 11
    invoke-virtual {v3, v2, v4}, Lkz2;->z(I[B)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v3, v1}, Lkz2;->E(I)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v3}, Lkz2;->q()Ljava/nio/charset/Charset;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    if-nez v1, :cond_0

    .line 22
    .line 23
    sget-object v1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 24
    .line 25
    :cond_0
    :goto_0
    invoke-virtual {v3, v1}, Lkz2;->n(Ljava/nio/charset/Charset;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    if-eqz v2, :cond_12

    .line 30
    .line 31
    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    if-nez v4, :cond_11

    .line 36
    .line 37
    :try_start_0
    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 38
    .line 39
    .line 40
    invoke-virtual {v3, v1}, Lkz2;->n(Ljava/nio/charset/Charset;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    if-nez v2, :cond_1

    .line 45
    .line 46
    const-string v1, "Unexpected end"

    .line 47
    .line 48
    invoke-static {v1}, La30;->x(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    :cond_1
    sget-object v4, Ldl1;->i:Ljava/util/regex/Pattern;

    .line 53
    .line 54
    invoke-virtual {v4, v2}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    invoke-virtual {v4}, Ljava/util/regex/Matcher;->matches()Z

    .line 59
    .line 60
    .line 61
    move-result v5

    .line 62
    if-eqz v5, :cond_10

    .line 63
    .line 64
    const/4 v2, 0x1

    .line 65
    invoke-static {v4, v2}, Ldl1;->a(Ljava/util/regex/Matcher;I)J

    .line 66
    .line 67
    .line 68
    move-result-wide v7

    .line 69
    const/4 v5, 0x6

    .line 70
    invoke-static {v4, v5}, Ldl1;->a(Ljava/util/regex/Matcher;I)J

    .line 71
    .line 72
    .line 73
    move-result-wide v4

    .line 74
    iget-object v6, v0, Ldl1;->f:Ljava/lang/StringBuilder;

    .line 75
    .line 76
    const/4 v9, 0x0

    .line 77
    invoke-virtual {v6, v9}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 78
    .line 79
    .line 80
    iget-object v10, v0, Ldl1;->g:Ljava/util/ArrayList;

    .line 81
    .line 82
    invoke-virtual {v10}, Ljava/util/ArrayList;->clear()V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v3, v1}, Lkz2;->n(Ljava/nio/charset/Charset;)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v11

    .line 89
    :goto_1
    invoke-static {v11}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 90
    .line 91
    .line 92
    move-result v12

    .line 93
    if-nez v12, :cond_4

    .line 94
    .line 95
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->length()I

    .line 96
    .line 97
    .line 98
    move-result v12

    .line 99
    if-lez v12, :cond_2

    .line 100
    .line 101
    const-string v12, "<br>"

    .line 102
    .line 103
    invoke-virtual {v6, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    :cond_2
    invoke-virtual {v11}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v11

    .line 110
    new-instance v12, Ljava/lang/StringBuilder;

    .line 111
    .line 112
    invoke-direct {v12, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    sget-object v13, Ldl1;->j:Ljava/util/regex/Pattern;

    .line 116
    .line 117
    invoke-virtual {v13, v11}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 118
    .line 119
    .line 120
    move-result-object v11

    .line 121
    move v13, v9

    .line 122
    :goto_2
    invoke-virtual {v11}, Ljava/util/regex/Matcher;->find()Z

    .line 123
    .line 124
    .line 125
    move-result v14

    .line 126
    if-eqz v14, :cond_3

    .line 127
    .line 128
    invoke-virtual {v11}, Ljava/util/regex/Matcher;->group()Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v14

    .line 132
    invoke-virtual {v10, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    invoke-virtual {v11}, Ljava/util/regex/Matcher;->start()I

    .line 136
    .line 137
    .line 138
    move-result v15

    .line 139
    sub-int/2addr v15, v13

    .line 140
    invoke-virtual {v14}, Ljava/lang/String;->length()I

    .line 141
    .line 142
    .line 143
    move-result v14

    .line 144
    add-int v9, v15, v14

    .line 145
    .line 146
    const-string v2, ""

    .line 147
    .line 148
    invoke-virtual {v12, v15, v9, v2}, Ljava/lang/StringBuilder;->replace(IILjava/lang/String;)Ljava/lang/StringBuilder;

    .line 149
    .line 150
    .line 151
    add-int/2addr v13, v14

    .line 152
    const/4 v2, 0x1

    .line 153
    const/4 v9, 0x0

    .line 154
    goto :goto_2

    .line 155
    :cond_3
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v2

    .line 159
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 160
    .line 161
    .line 162
    invoke-virtual {v3, v1}, Lkz2;->n(Ljava/nio/charset/Charset;)Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v11

    .line 166
    const/4 v2, 0x1

    .line 167
    const/4 v9, 0x0

    .line 168
    goto :goto_1

    .line 169
    :cond_4
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object v2

    .line 173
    invoke-static {v2}, Landroid/text/Html;->fromHtml(Ljava/lang/String;)Landroid/text/Spanned;

    .line 174
    .line 175
    .line 176
    move-result-object v12

    .line 177
    const/4 v2, 0x0

    .line 178
    :goto_3
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    .line 179
    .line 180
    .line 181
    move-result v6

    .line 182
    if-ge v2, v6, :cond_6

    .line 183
    .line 184
    invoke-virtual {v10, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v6

    .line 188
    check-cast v6, Ljava/lang/String;

    .line 189
    .line 190
    const-string v9, "\\{\\\\an[1-9]\\}"

    .line 191
    .line 192
    invoke-virtual {v6, v9}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    .line 193
    .line 194
    .line 195
    move-result v9

    .line 196
    if-eqz v9, :cond_5

    .line 197
    .line 198
    :goto_4
    move-wide v9, v4

    .line 199
    goto :goto_5

    .line 200
    :cond_5
    add-int/lit8 v2, v2, 0x1

    .line 201
    .line 202
    goto :goto_3

    .line 203
    :cond_6
    const/4 v6, 0x0

    .line 204
    goto :goto_4

    .line 205
    :goto_5
    new-instance v5, Lgk1;

    .line 206
    .line 207
    const/16 v27, 0x0

    .line 208
    .line 209
    const/16 v26, 0x0

    .line 210
    .line 211
    const/4 v13, 0x0

    .line 212
    const v16, -0x800001

    .line 213
    .line 214
    .line 215
    const/high16 v17, -0x80000000

    .line 216
    .line 217
    const/4 v15, 0x0

    .line 218
    if-nez v6, :cond_7

    .line 219
    .line 220
    new-instance v11, Lfi2;

    .line 221
    .line 222
    move-object v14, v13

    .line 223
    move/from16 v18, v17

    .line 224
    .line 225
    move/from16 v19, v16

    .line 226
    .line 227
    move/from16 v20, v17

    .line 228
    .line 229
    move/from16 v21, v17

    .line 230
    .line 231
    move/from16 v22, v16

    .line 232
    .line 233
    move/from16 v23, v16

    .line 234
    .line 235
    move/from16 v24, v16

    .line 236
    .line 237
    move/from16 v25, v17

    .line 238
    .line 239
    invoke-direct/range {v11 .. v27}, Lfi2;-><init>(Ljava/lang/CharSequence;Landroid/text/Layout$Alignment;Landroid/text/Layout$Alignment;Landroid/graphics/Bitmap;FIIFIIFFFIFI)V

    .line 240
    .line 241
    .line 242
    goto/16 :goto_10

    .line 243
    .line 244
    :cond_7
    invoke-virtual {v6}, Ljava/lang/String;->hashCode()I

    .line 245
    .line 246
    .line 247
    move-result v2

    .line 248
    const/4 v4, 0x2

    .line 249
    const-string v11, "{\\an1}"

    .line 250
    .line 251
    const-string v14, "{\\an3}"

    .line 252
    .line 253
    move-object/from16 p3, v13

    .line 254
    .line 255
    const-string v13, "{\\an7}"

    .line 256
    .line 257
    const-string v15, "{\\an9}"

    .line 258
    .line 259
    sparse-switch v2, :sswitch_data_0

    .line 260
    .line 261
    .line 262
    goto :goto_8

    .line 263
    :sswitch_0
    invoke-virtual {v6, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 264
    .line 265
    .line 266
    move-result v2

    .line 267
    if-eqz v2, :cond_8

    .line 268
    .line 269
    goto :goto_6

    .line 270
    :sswitch_1
    invoke-virtual {v6, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 271
    .line 272
    .line 273
    move-result v2

    .line 274
    if-eqz v2, :cond_8

    .line 275
    .line 276
    goto :goto_7

    .line 277
    :sswitch_2
    const-string v2, "{\\an6}"

    .line 278
    .line 279
    invoke-virtual {v6, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 280
    .line 281
    .line 282
    move-result v2

    .line 283
    if-eqz v2, :cond_8

    .line 284
    .line 285
    goto :goto_6

    .line 286
    :sswitch_3
    const-string v2, "{\\an4}"

    .line 287
    .line 288
    invoke-virtual {v6, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 289
    .line 290
    .line 291
    move-result v2

    .line 292
    if-eqz v2, :cond_8

    .line 293
    .line 294
    goto :goto_7

    .line 295
    :sswitch_4
    invoke-virtual {v6, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 296
    .line 297
    .line 298
    move-result v2

    .line 299
    if-eqz v2, :cond_8

    .line 300
    .line 301
    :goto_6
    move v2, v4

    .line 302
    goto :goto_9

    .line 303
    :sswitch_5
    invoke-virtual {v6, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 304
    .line 305
    .line 306
    move-result v2

    .line 307
    if-eqz v2, :cond_8

    .line 308
    .line 309
    :goto_7
    const/4 v2, 0x0

    .line 310
    goto :goto_9

    .line 311
    :cond_8
    :goto_8
    const/4 v2, 0x1

    .line 312
    :goto_9
    invoke-virtual {v6}, Ljava/lang/String;->hashCode()I

    .line 313
    .line 314
    .line 315
    move-result v19

    .line 316
    sparse-switch v19, :sswitch_data_1

    .line 317
    .line 318
    .line 319
    goto :goto_c

    .line 320
    :sswitch_6
    invoke-virtual {v6, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 321
    .line 322
    .line 323
    move-result v6

    .line 324
    if-eqz v6, :cond_9

    .line 325
    .line 326
    goto :goto_a

    .line 327
    :sswitch_7
    const-string v11, "{\\an8}"

    .line 328
    .line 329
    invoke-virtual {v6, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 330
    .line 331
    .line 332
    move-result v6

    .line 333
    if-eqz v6, :cond_9

    .line 334
    .line 335
    goto :goto_a

    .line 336
    :sswitch_8
    invoke-virtual {v6, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 337
    .line 338
    .line 339
    move-result v6

    .line 340
    if-eqz v6, :cond_9

    .line 341
    .line 342
    :goto_a
    const/4 v6, 0x0

    .line 343
    goto :goto_d

    .line 344
    :sswitch_9
    invoke-virtual {v6, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 345
    .line 346
    .line 347
    move-result v6

    .line 348
    if-eqz v6, :cond_9

    .line 349
    .line 350
    goto :goto_b

    .line 351
    :sswitch_a
    const-string v11, "{\\an2}"

    .line 352
    .line 353
    invoke-virtual {v6, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 354
    .line 355
    .line 356
    move-result v6

    .line 357
    if-eqz v6, :cond_9

    .line 358
    .line 359
    goto :goto_b

    .line 360
    :sswitch_b
    invoke-virtual {v6, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 361
    .line 362
    .line 363
    move-result v6

    .line 364
    if-eqz v6, :cond_9

    .line 365
    .line 366
    :goto_b
    move v6, v4

    .line 367
    goto :goto_d

    .line 368
    :cond_9
    :goto_c
    const/4 v6, 0x1

    .line 369
    :goto_d
    const v11, 0x3da3d70a    # 0.08f

    .line 370
    .line 371
    .line 372
    const/high16 v13, 0x3f000000    # 0.5f

    .line 373
    .line 374
    const v14, 0x3f6b851f    # 0.92f

    .line 375
    .line 376
    .line 377
    const/4 v15, 0x1

    .line 378
    if-eqz v2, :cond_c

    .line 379
    .line 380
    if-eq v2, v15, :cond_b

    .line 381
    .line 382
    if-ne v2, v4, :cond_a

    .line 383
    .line 384
    move/from16 v19, v14

    .line 385
    .line 386
    goto :goto_e

    .line 387
    :cond_a
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 388
    .line 389
    invoke-direct {v1}, Ljava/lang/IllegalArgumentException;-><init>()V

    .line 390
    .line 391
    .line 392
    throw v1

    .line 393
    :cond_b
    move/from16 v19, v13

    .line 394
    .line 395
    goto :goto_e

    .line 396
    :cond_c
    move/from16 v19, v11

    .line 397
    .line 398
    :goto_e
    if-eqz v6, :cond_f

    .line 399
    .line 400
    if-eq v6, v15, :cond_e

    .line 401
    .line 402
    if-ne v6, v4, :cond_d

    .line 403
    .line 404
    move v11, v14

    .line 405
    goto :goto_f

    .line 406
    :cond_d
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 407
    .line 408
    invoke-direct {v1}, Ljava/lang/IllegalArgumentException;-><init>()V

    .line 409
    .line 410
    .line 411
    throw v1

    .line 412
    :cond_e
    move v11, v13

    .line 413
    :cond_f
    :goto_f
    new-instance v4, Lfi2;

    .line 414
    .line 415
    move/from16 v21, v17

    .line 416
    .line 417
    const/16 v17, 0x0

    .line 418
    .line 419
    move-object/from16 v14, p3

    .line 420
    .line 421
    move/from16 v23, v16

    .line 422
    .line 423
    move/from16 v24, v16

    .line 424
    .line 425
    move/from16 v25, v21

    .line 426
    .line 427
    move-object/from16 v13, p3

    .line 428
    .line 429
    move/from16 v20, v2

    .line 430
    .line 431
    move/from16 v18, v6

    .line 432
    .line 433
    move/from16 v22, v16

    .line 434
    .line 435
    const/4 v15, 0x0

    .line 436
    move/from16 v16, v11

    .line 437
    .line 438
    move-object v11, v4

    .line 439
    invoke-direct/range {v11 .. v27}, Lfi2;-><init>(Ljava/lang/CharSequence;Landroid/text/Layout$Alignment;Landroid/text/Layout$Alignment;Landroid/graphics/Bitmap;FIIFIIFFFIFI)V

    .line 440
    .line 441
    .line 442
    :goto_10
    sub-long/2addr v9, v7

    .line 443
    invoke-static {v11}, Lxm3;->i(Ljava/lang/Object;)Lsn3;

    .line 444
    .line 445
    .line 446
    move-result-object v6

    .line 447
    invoke-direct/range {v5 .. v10}, Lgk1;-><init>(Ljava/util/List;JJ)V

    .line 448
    .line 449
    .line 450
    move-object/from16 v4, p4

    .line 451
    .line 452
    invoke-virtual {v4, v5}, Llk1;->c(Ljava/lang/Object;)V

    .line 453
    .line 454
    .line 455
    goto/16 :goto_0

    .line 456
    .line 457
    :cond_10
    move-object/from16 v4, p4

    .line 458
    .line 459
    const-string v5, "Skipping invalid timing: "

    .line 460
    .line 461
    invoke-virtual {v5, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 462
    .line 463
    .line 464
    move-result-object v2

    .line 465
    invoke-static {v2}, La30;->x(Ljava/lang/String;)V

    .line 466
    .line 467
    .line 468
    goto/16 :goto_0

    .line 469
    .line 470
    :catch_0
    move-object/from16 v4, p4

    .line 471
    .line 472
    const-string v5, "Skipping invalid index: "

    .line 473
    .line 474
    invoke-virtual {v5, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 475
    .line 476
    .line 477
    move-result-object v2

    .line 478
    invoke-static {v2}, La30;->x(Ljava/lang/String;)V

    .line 479
    .line 480
    .line 481
    goto/16 :goto_0

    .line 482
    .line 483
    :cond_11
    move-object/from16 v4, p4

    .line 484
    .line 485
    goto/16 :goto_0

    .line 486
    .line 487
    :cond_12
    return-void

    .line 488
    nop

    .line 489
    :sswitch_data_0
    .sparse-switch
        -0x28ddbde6 -> :sswitch_5
        -0x28ddbda8 -> :sswitch_4
        -0x28ddbd89 -> :sswitch_3
        -0x28ddbd4b -> :sswitch_2
        -0x28ddbd2c -> :sswitch_1
        -0x28ddbcee -> :sswitch_0
    .end sparse-switch

    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    :sswitch_data_1
    .sparse-switch
        -0x28ddbde6 -> :sswitch_b
        -0x28ddbdc7 -> :sswitch_a
        -0x28ddbda8 -> :sswitch_9
        -0x28ddbd2c -> :sswitch_8
        -0x28ddbd0d -> :sswitch_7
        -0x28ddbcee -> :sswitch_6
    .end sparse-switch
.end method
