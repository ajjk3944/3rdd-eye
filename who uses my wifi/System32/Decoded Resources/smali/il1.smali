.class public final Lil1;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lkk1;


# static fields
.field public static final g:Ljava/util/regex/Pattern;

.field public static final h:Ljava/util/regex/Pattern;

.field public static final i:Ljava/util/regex/Pattern;

.field public static final j:Ljava/util/regex/Pattern;

.field public static final k:Ljava/util/regex/Pattern;

.field public static final l:Ljava/util/regex/Pattern;

.field public static final m:Ljava/util/regex/Pattern;

.field public static final n:Lhl1;


# instance fields
.field public final f:Lorg/xmlpull/v1/XmlPullParserFactory;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const-string v0, "^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lil1;->g:Ljava/util/regex/Pattern;

    .line 8
    .line 9
    const-string v0, "^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$"

    .line 10
    .line 11
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Lil1;->h:Ljava/util/regex/Pattern;

    .line 16
    .line 17
    const-string v0, "^(([0-9]*.)?[0-9]+)(px|em|%)$"

    .line 18
    .line 19
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    sput-object v0, Lil1;->i:Ljava/util/regex/Pattern;

    .line 24
    .line 25
    const-string v0, "^([-+]?\\d+\\.?\\d*?)%$"

    .line 26
    .line 27
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    sput-object v0, Lil1;->j:Ljava/util/regex/Pattern;

    .line 32
    .line 33
    const-string v0, "^([-+]?\\d+\\.?\\d*?)% ([-+]?\\d+\\.?\\d*?)%$"

    .line 34
    .line 35
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    sput-object v0, Lil1;->k:Ljava/util/regex/Pattern;

    .line 40
    .line 41
    const-string v0, "^([-+]?\\d+\\.?\\d*?)px ([-+]?\\d+\\.?\\d*?)px$"

    .line 42
    .line 43
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    sput-object v0, Lil1;->l:Ljava/util/regex/Pattern;

    .line 48
    .line 49
    const-string v0, "^(\\d+) (\\d+)$"

    .line 50
    .line 51
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    sput-object v0, Lil1;->m:Ljava/util/regex/Pattern;

    .line 56
    .line 57
    new-instance v0, Lhl1;

    .line 58
    .line 59
    const/high16 v1, 0x41f00000    # 30.0f

    .line 60
    .line 61
    const/4 v2, 0x1

    .line 62
    invoke-direct {v0, v1, v2, v2}, Lhl1;-><init>(FII)V

    .line 63
    .line 64
    .line 65
    sput-object v0, Lil1;->n:Lhl1;

    .line 66
    .line 67
    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    :try_start_0
    invoke-static {}, Lorg/xmlpull/v1/XmlPullParserFactory;->newInstance()Lorg/xmlpull/v1/XmlPullParserFactory;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iput-object v0, p0, Lil1;->f:Lorg/xmlpull/v1/XmlPullParserFactory;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-virtual {v0, v1}, Lorg/xmlpull/v1/XmlPullParserFactory;->setNamespaceAware(Z)V
    :try_end_0
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :catch_0
    move-exception v0

    .line 16
    new-instance v1, Ljava/lang/RuntimeException;

    .line 17
    .line 18
    const-string v2, "Couldn\'t create XmlPullParserFactory instance"

    .line 19
    .line 20
    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 21
    .line 22
    .line 23
    throw v1
.end method

.method public static b(Lorg/xmlpull/v1/XmlPullParser;Lkl1;)Lkl1;
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    invoke-interface {v1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeCount()I

    .line 4
    .line 5
    .line 6
    move-result v2

    .line 7
    const/4 v3, 0x0

    .line 8
    move-object/from16 v0, p1

    .line 9
    .line 10
    move v4, v3

    .line 11
    :goto_0
    if-ge v4, v2, :cond_20

    .line 12
    .line 13
    invoke-interface {v1, v4}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(I)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v5

    .line 17
    invoke-interface {v1, v4}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeName(I)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v6

    .line 21
    invoke-virtual {v6}, Ljava/lang/String;->hashCode()I

    .line 22
    .line 23
    .line 24
    move-result v7

    .line 25
    const-string v8, "none"

    .line 26
    .line 27
    const-string v9, "after"

    .line 28
    .line 29
    const v10, 0x33af38

    .line 30
    .line 31
    .line 32
    const/4 v11, -0x1

    .line 33
    const v12, 0x58705dc

    .line 34
    .line 35
    .line 36
    const/4 v15, 0x2

    .line 37
    const/16 p1, 0x0

    .line 38
    .line 39
    const/4 v14, 0x1

    .line 40
    sparse-switch v7, :sswitch_data_0

    .line 41
    .line 42
    .line 43
    goto/16 :goto_12

    .line 44
    .line 45
    :sswitch_0
    const-string v7, "multiRowAlign"

    .line 46
    .line 47
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v6

    .line 51
    if-eqz v6, :cond_1f

    .line 52
    .line 53
    invoke-static {v0}, Lil1;->c(Lkl1;)Lkl1;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-static {v5}, Lil1;->d(Ljava/lang/String;)Landroid/text/Layout$Alignment;

    .line 58
    .line 59
    .line 60
    move-result-object v5

    .line 61
    iput-object v5, v0, Lkl1;->p:Landroid/text/Layout$Alignment;

    .line 62
    .line 63
    goto/16 :goto_12

    .line 64
    .line 65
    :sswitch_1
    const-string v7, "backgroundColor"

    .line 66
    .line 67
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v6

    .line 71
    if-eqz v6, :cond_1f

    .line 72
    .line 73
    invoke-static {v0}, Lil1;->c(Lkl1;)Lkl1;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    :try_start_0
    invoke-static {v5, v3}, Lyo2;->a(Ljava/lang/String;Z)I

    .line 78
    .line 79
    .line 80
    move-result v6

    .line 81
    iput v6, v0, Lkl1;->d:I

    .line 82
    .line 83
    iput-boolean v14, v0, Lkl1;->e:Z
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 84
    .line 85
    goto/16 :goto_12

    .line 86
    .line 87
    :catch_0
    const-string v6, "Failed parsing background value: "

    .line 88
    .line 89
    invoke-static {v5, v6}, Lga1;->p(Ljava/lang/String;Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    goto/16 :goto_12

    .line 93
    .line 94
    :sswitch_2
    const-string v7, "rubyPosition"

    .line 95
    .line 96
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    move-result v6

    .line 100
    if-eqz v6, :cond_1f

    .line 101
    .line 102
    invoke-static {v5}, Lum;->D(Ljava/lang/String;)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v5

    .line 106
    invoke-virtual {v5}, Ljava/lang/String;->hashCode()I

    .line 107
    .line 108
    .line 109
    move-result v6

    .line 110
    const v7, -0x5305c081

    .line 111
    .line 112
    .line 113
    if-eq v6, v7, :cond_1

    .line 114
    .line 115
    if-eq v6, v12, :cond_0

    .line 116
    .line 117
    goto/16 :goto_12

    .line 118
    .line 119
    :cond_0
    invoke-virtual {v5, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    move-result v5

    .line 123
    if-eqz v5, :cond_1f

    .line 124
    .line 125
    invoke-static {v0}, Lil1;->c(Lkl1;)Lkl1;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    iput v15, v0, Lkl1;->n:I

    .line 130
    .line 131
    goto/16 :goto_12

    .line 132
    .line 133
    :cond_1
    const-string v6, "before"

    .line 134
    .line 135
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    move-result v5

    .line 139
    if-eqz v5, :cond_1f

    .line 140
    .line 141
    invoke-static {v0}, Lil1;->c(Lkl1;)Lkl1;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    iput v14, v0, Lkl1;->n:I

    .line 146
    .line 147
    goto/16 :goto_12

    .line 148
    .line 149
    :sswitch_3
    const-string v7, "textEmphasis"

    .line 150
    .line 151
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 152
    .line 153
    .line 154
    move-result v6

    .line 155
    if-eqz v6, :cond_1f

    .line 156
    .line 157
    invoke-static {v0}, Lil1;->c(Lkl1;)Lkl1;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    sget-object v6, Lfl1;->d:Ljava/util/regex/Pattern;

    .line 162
    .line 163
    if-nez v5, :cond_2

    .line 164
    .line 165
    goto/16 :goto_9

    .line 166
    .line 167
    :cond_2
    invoke-virtual {v5}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object v5

    .line 171
    invoke-static {v5}, Lum;->D(Ljava/lang/String;)Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v5

    .line 175
    invoke-virtual {v5}, Ljava/lang/String;->isEmpty()Z

    .line 176
    .line 177
    .line 178
    move-result v6

    .line 179
    if-nez v6, :cond_11

    .line 180
    .line 181
    sget-object v6, Lfl1;->d:Ljava/util/regex/Pattern;

    .line 182
    .line 183
    invoke-static {v5, v6}, Landroid/text/TextUtils;->split(Ljava/lang/String;Ljava/util/regex/Pattern;)[Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object v5

    .line 187
    array-length v6, v5

    .line 188
    if-eqz v6, :cond_4

    .line 189
    .line 190
    if-eq v6, v14, :cond_3

    .line 191
    .line 192
    invoke-virtual {v5}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object v5

    .line 196
    check-cast v5, [Ljava/lang/Object;

    .line 197
    .line 198
    invoke-static {v5, v6}, Ldn3;->m([Ljava/lang/Object;I)Ldn3;

    .line 199
    .line 200
    .line 201
    move-result-object v5

    .line 202
    goto :goto_1

    .line 203
    :cond_3
    aget-object v5, v5, v3

    .line 204
    .line 205
    new-instance v6, Len3;

    .line 206
    .line 207
    invoke-direct {v6, v5}, Len3;-><init>(Ljava/lang/Object;)V

    .line 208
    .line 209
    .line 210
    move-object v5, v6

    .line 211
    goto :goto_1

    .line 212
    :cond_4
    sget-object v5, Lyn3;->o:Lyn3;

    .line 213
    .line 214
    :goto_1
    sget-object v6, Lfl1;->h:Ldn3;

    .line 215
    .line 216
    invoke-static {v6, v5}, Lm54;->G(Ljava/util/Set;Ldn3;)Lao3;

    .line 217
    .line 218
    .line 219
    move-result-object v6

    .line 220
    const-string v7, "outside"

    .line 221
    .line 222
    invoke-static {v6, v7}, Lbd2;->J(Lao3;Ljava/lang/String;)Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object v6

    .line 226
    check-cast v6, Ljava/lang/String;

    .line 227
    .line 228
    invoke-virtual {v6}, Ljava/lang/String;->hashCode()I

    .line 229
    .line 230
    .line 231
    move-result v3

    .line 232
    const v13, -0x41ecca5b

    .line 233
    .line 234
    .line 235
    if-eq v3, v13, :cond_6

    .line 236
    .line 237
    if-eq v3, v12, :cond_5

    .line 238
    .line 239
    goto :goto_2

    .line 240
    :cond_5
    invoke-virtual {v6, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 241
    .line 242
    .line 243
    move-result v3

    .line 244
    if-eqz v3, :cond_7

    .line 245
    .line 246
    move v3, v15

    .line 247
    goto :goto_3

    .line 248
    :cond_6
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 249
    .line 250
    .line 251
    move-result v3

    .line 252
    if-eqz v3, :cond_7

    .line 253
    .line 254
    const/4 v3, -0x2

    .line 255
    goto :goto_3

    .line 256
    :cond_7
    :goto_2
    move v3, v14

    .line 257
    :goto_3
    sget-object v6, Lfl1;->e:Ldn3;

    .line 258
    .line 259
    invoke-static {v6, v5}, Lm54;->G(Ljava/util/Set;Ldn3;)Lao3;

    .line 260
    .line 261
    .line 262
    move-result-object v6

    .line 263
    invoke-virtual {v6}, Lao3;->isEmpty()Z

    .line 264
    .line 265
    .line 266
    move-result v7

    .line 267
    if-nez v7, :cond_a

    .line 268
    .line 269
    iget-object v5, v6, Lao3;->f:Ljava/util/Set;

    .line 270
    .line 271
    iget-object v7, v6, Lao3;->g:Ljava/util/Set;

    .line 272
    .line 273
    new-instance v9, Lgn3;

    .line 274
    .line 275
    invoke-direct {v9, v6, v5, v7}, Lgn3;-><init>(Lao3;Ljava/util/Set;Ljava/util/Set;)V

    .line 276
    .line 277
    .line 278
    invoke-virtual {v9}, Lgn3;->next()Ljava/lang/Object;

    .line 279
    .line 280
    .line 281
    move-result-object v5

    .line 282
    check-cast v5, Ljava/lang/String;

    .line 283
    .line 284
    invoke-virtual {v5}, Ljava/lang/String;->hashCode()I

    .line 285
    .line 286
    .line 287
    move-result v6

    .line 288
    if-eq v6, v10, :cond_8

    .line 289
    .line 290
    goto :goto_4

    .line 291
    :cond_8
    invoke-virtual {v5, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 292
    .line 293
    .line 294
    move-result v5

    .line 295
    if-eqz v5, :cond_9

    .line 296
    .line 297
    const/4 v6, 0x0

    .line 298
    const/4 v11, 0x0

    .line 299
    goto/16 :goto_8

    .line 300
    .line 301
    :cond_9
    :goto_4
    const/4 v6, 0x0

    .line 302
    goto/16 :goto_8

    .line 303
    .line 304
    :cond_a
    sget-object v6, Lfl1;->g:Ldn3;

    .line 305
    .line 306
    invoke-static {v6, v5}, Lm54;->G(Ljava/util/Set;Ldn3;)Lao3;

    .line 307
    .line 308
    .line 309
    move-result-object v6

    .line 310
    sget-object v7, Lfl1;->f:Ldn3;

    .line 311
    .line 312
    invoke-static {v7, v5}, Lm54;->G(Ljava/util/Set;Ldn3;)Lao3;

    .line 313
    .line 314
    .line 315
    move-result-object v5

    .line 316
    invoke-virtual {v6}, Lao3;->isEmpty()Z

    .line 317
    .line 318
    .line 319
    move-result v7

    .line 320
    if-eqz v7, :cond_b

    .line 321
    .line 322
    invoke-virtual {v5}, Lao3;->isEmpty()Z

    .line 323
    .line 324
    .line 325
    move-result v7

    .line 326
    if-eqz v7, :cond_b

    .line 327
    .line 328
    goto :goto_4

    .line 329
    :cond_b
    const-string v7, "filled"

    .line 330
    .line 331
    invoke-static {v6, v7}, Lbd2;->J(Lao3;Ljava/lang/String;)Ljava/lang/Object;

    .line 332
    .line 333
    .line 334
    move-result-object v6

    .line 335
    check-cast v6, Ljava/lang/String;

    .line 336
    .line 337
    invoke-virtual {v6}, Ljava/lang/String;->hashCode()I

    .line 338
    .line 339
    .line 340
    move-result v7

    .line 341
    const v8, 0x34264a

    .line 342
    .line 343
    .line 344
    if-eq v7, v8, :cond_c

    .line 345
    .line 346
    goto :goto_5

    .line 347
    :cond_c
    const-string v7, "open"

    .line 348
    .line 349
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 350
    .line 351
    .line 352
    move-result v6

    .line 353
    if-eqz v6, :cond_d

    .line 354
    .line 355
    move v6, v15

    .line 356
    goto :goto_6

    .line 357
    :cond_d
    :goto_5
    move v6, v14

    .line 358
    :goto_6
    const-string v7, "circle"

    .line 359
    .line 360
    invoke-static {v5, v7}, Lbd2;->J(Lao3;Ljava/lang/String;)Ljava/lang/Object;

    .line 361
    .line 362
    .line 363
    move-result-object v5

    .line 364
    check-cast v5, Ljava/lang/String;

    .line 365
    .line 366
    invoke-virtual {v5}, Ljava/lang/String;->hashCode()I

    .line 367
    .line 368
    .line 369
    move-result v7

    .line 370
    const v8, -0x35fdaa48    # -2135406.0f

    .line 371
    .line 372
    .line 373
    if-eq v7, v8, :cond_f

    .line 374
    .line 375
    const v8, 0x18549

    .line 376
    .line 377
    .line 378
    if-eq v7, v8, :cond_e

    .line 379
    .line 380
    goto :goto_7

    .line 381
    :cond_e
    const-string v7, "dot"

    .line 382
    .line 383
    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 384
    .line 385
    .line 386
    move-result v5

    .line 387
    if-eqz v5, :cond_10

    .line 388
    .line 389
    move v11, v15

    .line 390
    goto :goto_8

    .line 391
    :cond_f
    const-string v7, "sesame"

    .line 392
    .line 393
    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 394
    .line 395
    .line 396
    move-result v5

    .line 397
    if-eqz v5, :cond_10

    .line 398
    .line 399
    const/4 v11, 0x3

    .line 400
    goto :goto_8

    .line 401
    :cond_10
    :goto_7
    move v11, v14

    .line 402
    :goto_8
    new-instance v14, Lfl1;

    .line 403
    .line 404
    invoke-direct {v14, v11, v6, v3}, Lfl1;-><init>(III)V

    .line 405
    .line 406
    .line 407
    goto :goto_a

    .line 408
    :cond_11
    :goto_9
    move-object/from16 v14, p1

    .line 409
    .line 410
    :goto_a
    iput-object v14, v0, Lkl1;->r:Lfl1;

    .line 411
    .line 412
    :cond_12
    :goto_b
    const/4 v3, 0x0

    .line 413
    goto/16 :goto_12

    .line 414
    .line 415
    :sswitch_4
    const-string v3, "fontSize"

    .line 416
    .line 417
    invoke-virtual {v6, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 418
    .line 419
    .line 420
    move-result v3

    .line 421
    if-eqz v3, :cond_12

    .line 422
    .line 423
    :try_start_1
    invoke-static {v0}, Lil1;->c(Lkl1;)Lkl1;

    .line 424
    .line 425
    .line 426
    move-result-object v0

    .line 427
    const-string v3, "\\s+"

    .line 428
    .line 429
    const-string v6, "Invalid number of entries for fontSize: "

    .line 430
    .line 431
    const-string v7, "."

    .line 432
    .line 433
    const-string v8, "Invalid expression for fontSize: \'"

    .line 434
    .line 435
    const-string v9, "\'."

    .line 436
    .line 437
    const-string v10, "Invalid unit for fontSize: \'"

    .line 438
    .line 439
    sget-object v12, Lv23;->a:Ljava/lang/String;

    .line 440
    .line 441
    invoke-virtual {v5, v3, v11}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    .line 442
    .line 443
    .line 444
    move-result-object v3

    .line 445
    array-length v11, v3
    :try_end_1
    .catch Lik1; {:try_start_1 .. :try_end_1} :catch_1

    .line 446
    sget-object v12, Lil1;->i:Ljava/util/regex/Pattern;

    .line 447
    .line 448
    if-ne v11, v14, :cond_13

    .line 449
    .line 450
    :try_start_2
    invoke-virtual {v12, v5}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 451
    .line 452
    .line 453
    move-result-object v3

    .line 454
    goto :goto_c

    .line 455
    :cond_13
    if-ne v11, v15, :cond_1a

    .line 456
    .line 457
    aget-object v3, v3, v14

    .line 458
    .line 459
    invoke-virtual {v12, v3}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 460
    .line 461
    .line 462
    move-result-object v3

    .line 463
    const-string v6, "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first."

    .line 464
    .line 465
    invoke-static {v6}, La30;->x(Ljava/lang/String;)V

    .line 466
    .line 467
    .line 468
    :goto_c
    invoke-virtual {v3}, Ljava/util/regex/Matcher;->matches()Z

    .line 469
    .line 470
    .line 471
    move-result v6

    .line 472
    if-eqz v6, :cond_19

    .line 473
    .line 474
    const/4 v6, 0x3

    .line 475
    invoke-virtual {v3, v6}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 476
    .line 477
    .line 478
    move-result-object v7

    .line 479
    if-eqz v7, :cond_18

    .line 480
    .line 481
    invoke-virtual {v7}, Ljava/lang/String;->hashCode()I

    .line 482
    .line 483
    .line 484
    move-result v6
    :try_end_2
    .catch Lik1; {:try_start_2 .. :try_end_2} :catch_1

    .line 485
    const/16 v8, 0x25

    .line 486
    .line 487
    if-eq v6, v8, :cond_15

    .line 488
    .line 489
    const/16 v8, 0xca8

    .line 490
    .line 491
    if-eq v6, v8, :cond_14

    .line 492
    .line 493
    const/16 v8, 0xe08

    .line 494
    .line 495
    if-ne v6, v8, :cond_17

    .line 496
    .line 497
    const-string v6, "px"

    .line 498
    .line 499
    invoke-virtual {v7, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 500
    .line 501
    .line 502
    move-result v6

    .line 503
    if-eqz v6, :cond_17

    .line 504
    .line 505
    :try_start_3
    iput v14, v0, Lkl1;->j:I
    :try_end_3
    .catch Lik1; {:try_start_3 .. :try_end_3} :catch_1

    .line 506
    .line 507
    goto :goto_d

    .line 508
    :cond_14
    const-string v6, "em"

    .line 509
    .line 510
    invoke-virtual {v7, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 511
    .line 512
    .line 513
    move-result v6

    .line 514
    if-eqz v6, :cond_17

    .line 515
    .line 516
    :try_start_4
    iput v15, v0, Lkl1;->j:I
    :try_end_4
    .catch Lik1; {:try_start_4 .. :try_end_4} :catch_1

    .line 517
    .line 518
    goto :goto_d

    .line 519
    :cond_15
    const-string v6, "%"

    .line 520
    .line 521
    invoke-virtual {v7, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 522
    .line 523
    .line 524
    move-result v6

    .line 525
    if-eqz v6, :cond_17

    .line 526
    .line 527
    const/4 v6, 0x3

    .line 528
    :try_start_5
    iput v6, v0, Lkl1;->j:I

    .line 529
    .line 530
    :goto_d
    invoke-virtual {v3, v14}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 531
    .line 532
    .line 533
    move-result-object v3

    .line 534
    if-eqz v3, :cond_16

    .line 535
    .line 536
    invoke-static {v3}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    .line 537
    .line 538
    .line 539
    move-result v3

    .line 540
    iput v3, v0, Lkl1;->k:F

    .line 541
    .line 542
    goto/16 :goto_b

    .line 543
    .line 544
    :cond_16
    throw p1

    .line 545
    :cond_17
    new-instance v3, Lik1;

    .line 546
    .line 547
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 548
    .line 549
    .line 550
    move-result v6

    .line 551
    add-int/lit8 v6, v6, 0x1e

    .line 552
    .line 553
    new-instance v8, Ljava/lang/StringBuilder;

    .line 554
    .line 555
    invoke-direct {v8, v6}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 556
    .line 557
    .line 558
    invoke-virtual {v8, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 559
    .line 560
    .line 561
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 562
    .line 563
    .line 564
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 565
    .line 566
    .line 567
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 568
    .line 569
    .line 570
    move-result-object v6

    .line 571
    invoke-direct {v3, v6}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 572
    .line 573
    .line 574
    throw v3

    .line 575
    :cond_18
    throw p1

    .line 576
    :cond_19
    new-instance v3, Lik1;

    .line 577
    .line 578
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 579
    .line 580
    .line 581
    move-result v6

    .line 582
    add-int/lit8 v6, v6, 0x24

    .line 583
    .line 584
    new-instance v7, Ljava/lang/StringBuilder;

    .line 585
    .line 586
    invoke-direct {v7, v6}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 587
    .line 588
    .line 589
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 590
    .line 591
    .line 592
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 593
    .line 594
    .line 595
    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 596
    .line 597
    .line 598
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 599
    .line 600
    .line 601
    move-result-object v6

    .line 602
    invoke-direct {v3, v6}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 603
    .line 604
    .line 605
    throw v3

    .line 606
    :cond_1a
    new-instance v3, Lik1;

    .line 607
    .line 608
    invoke-static {v11}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 609
    .line 610
    .line 611
    move-result-object v8

    .line 612
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 613
    .line 614
    .line 615
    move-result v8

    .line 616
    add-int/lit8 v8, v8, 0x29

    .line 617
    .line 618
    new-instance v9, Ljava/lang/StringBuilder;

    .line 619
    .line 620
    invoke-direct {v9, v8}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 621
    .line 622
    .line 623
    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 624
    .line 625
    .line 626
    invoke-virtual {v9, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 627
    .line 628
    .line 629
    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 630
    .line 631
    .line 632
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 633
    .line 634
    .line 635
    move-result-object v6

    .line 636
    invoke-direct {v3, v6}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 637
    .line 638
    .line 639
    throw v3
    :try_end_5
    .catch Lik1; {:try_start_5 .. :try_end_5} :catch_1

    .line 640
    :catch_1
    const-string v3, "Failed parsing fontSize value: "

    .line 641
    .line 642
    invoke-static {v5, v3}, Lga1;->p(Ljava/lang/String;Ljava/lang/String;)V

    .line 643
    .line 644
    .line 645
    goto/16 :goto_b

    .line 646
    .line 647
    :sswitch_5
    const-string v3, "textCombine"

    .line 648
    .line 649
    invoke-virtual {v6, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 650
    .line 651
    .line 652
    move-result v3

    .line 653
    if-eqz v3, :cond_12

    .line 654
    .line 655
    invoke-static {v5}, Lum;->D(Ljava/lang/String;)Ljava/lang/String;

    .line 656
    .line 657
    .line 658
    move-result-object v3

    .line 659
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 660
    .line 661
    .line 662
    move-result v5

    .line 663
    const v6, 0x179a1

    .line 664
    .line 665
    .line 666
    if-eq v5, v6, :cond_1c

    .line 667
    .line 668
    if-eq v5, v10, :cond_1b

    .line 669
    .line 670
    goto/16 :goto_b

    .line 671
    .line 672
    :cond_1b
    invoke-virtual {v3, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 673
    .line 674
    .line 675
    move-result v3

    .line 676
    if-eqz v3, :cond_12

    .line 677
    .line 678
    invoke-static {v0}, Lil1;->c(Lkl1;)Lkl1;

    .line 679
    .line 680
    .line 681
    move-result-object v0

    .line 682
    const/4 v3, 0x0

    .line 683
    iput v3, v0, Lkl1;->q:I

    .line 684
    .line 685
    goto/16 :goto_12

    .line 686
    .line 687
    :cond_1c
    const-string v5, "all"

    .line 688
    .line 689
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 690
    .line 691
    .line 692
    move-result v3

    .line 693
    if-eqz v3, :cond_12

    .line 694
    .line 695
    invoke-static {v0}, Lil1;->c(Lkl1;)Lkl1;

    .line 696
    .line 697
    .line 698
    move-result-object v0

    .line 699
    iput v14, v0, Lkl1;->q:I

    .line 700
    .line 701
    goto/16 :goto_b

    .line 702
    .line 703
    :sswitch_6
    const-string v3, "shear"

    .line 704
    .line 705
    invoke-virtual {v6, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 706
    .line 707
    .line 708
    move-result v3

    .line 709
    if-eqz v3, :cond_12

    .line 710
    .line 711
    invoke-static {v0}, Lil1;->c(Lkl1;)Lkl1;

    .line 712
    .line 713
    .line 714
    move-result-object v3

    .line 715
    sget-object v0, Lil1;->j:Ljava/util/regex/Pattern;

    .line 716
    .line 717
    invoke-virtual {v0, v5}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 718
    .line 719
    .line 720
    move-result-object v0

    .line 721
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->matches()Z

    .line 722
    .line 723
    .line 724
    move-result v6

    .line 725
    const v7, 0x7f7fffff    # Float.MAX_VALUE

    .line 726
    .line 727
    .line 728
    if-nez v6, :cond_1d

    .line 729
    .line 730
    const-string v0, "Invalid value for shear: "

    .line 731
    .line 732
    invoke-static {v5, v0}, Lga1;->p(Ljava/lang/String;Ljava/lang/String;)V

    .line 733
    .line 734
    .line 735
    goto :goto_f

    .line 736
    :cond_1d
    :try_start_6
    invoke-virtual {v0, v14}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 737
    .line 738
    .line 739
    move-result-object v0

    .line 740
    if-eqz v0, :cond_1e

    .line 741
    .line 742
    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    .line 743
    .line 744
    .line 745
    move-result v0

    .line 746
    const/high16 v6, -0x3d380000    # -100.0f

    .line 747
    .line 748
    invoke-static {v6, v0}, Ljava/lang/Math;->max(FF)F

    .line 749
    .line 750
    .line 751
    move-result v0

    .line 752
    const/high16 v6, 0x42c80000    # 100.0f

    .line 753
    .line 754
    invoke-static {v6, v0}, Ljava/lang/Math;->min(FF)F

    .line 755
    .line 756
    .line 757
    move-result v7

    .line 758
    goto :goto_f

    .line 759
    :catch_2
    move-exception v0

    .line 760
    goto :goto_e

    .line 761
    :cond_1e
    throw p1
    :try_end_6
    .catch Ljava/lang/NumberFormatException; {:try_start_6 .. :try_end_6} :catch_2

    .line 762
    :goto_e
    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 763
    .line 764
    .line 765
    move-result-object v5

    .line 766
    const-string v6, "Failed to parse shear: "

    .line 767
    .line 768
    invoke-virtual {v6, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 769
    .line 770
    .line 771
    move-result-object v5

    .line 772
    invoke-static {v5, v0}, La30;->z(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 773
    .line 774
    .line 775
    :goto_f
    iput v7, v3, Lkl1;->s:F

    .line 776
    .line 777
    move-object v0, v3

    .line 778
    goto/16 :goto_b

    .line 779
    .line 780
    :sswitch_7
    const-string v3, "color"

    .line 781
    .line 782
    invoke-virtual {v6, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 783
    .line 784
    .line 785
    move-result v3

    .line 786
    if-eqz v3, :cond_12

    .line 787
    .line 788
    invoke-static {v0}, Lil1;->c(Lkl1;)Lkl1;

    .line 789
    .line 790
    .line 791
    move-result-object v0

    .line 792
    const/4 v3, 0x0

    .line 793
    :try_start_7
    invoke-static {v5, v3}, Lyo2;->a(Ljava/lang/String;Z)I

    .line 794
    .line 795
    .line 796
    move-result v6

    .line 797
    iput v6, v0, Lkl1;->b:I

    .line 798
    .line 799
    iput-boolean v14, v0, Lkl1;->c:Z
    :try_end_7
    .catch Ljava/lang/IllegalArgumentException; {:try_start_7 .. :try_end_7} :catch_3

    .line 800
    .line 801
    goto/16 :goto_b

    .line 802
    .line 803
    :catch_3
    const-string v3, "Failed parsing color value: "

    .line 804
    .line 805
    invoke-static {v5, v3}, Lga1;->p(Ljava/lang/String;Ljava/lang/String;)V

    .line 806
    .line 807
    .line 808
    goto/16 :goto_b

    .line 809
    .line 810
    :sswitch_8
    const-string v3, "ruby"

    .line 811
    .line 812
    invoke-virtual {v6, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 813
    .line 814
    .line 815
    move-result v3

    .line 816
    if-eqz v3, :cond_12

    .line 817
    .line 818
    invoke-static {v5}, Lum;->D(Ljava/lang/String;)Ljava/lang/String;

    .line 819
    .line 820
    .line 821
    move-result-object v3

    .line 822
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 823
    .line 824
    .line 825
    move-result v5

    .line 826
    sparse-switch v5, :sswitch_data_1

    .line 827
    .line 828
    .line 829
    goto/16 :goto_b

    .line 830
    .line 831
    :sswitch_9
    const-string v5, "text"

    .line 832
    .line 833
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 834
    .line 835
    .line 836
    move-result v3

    .line 837
    if-eqz v3, :cond_12

    .line 838
    .line 839
    goto :goto_10

    .line 840
    :sswitch_a
    const-string v5, "base"

    .line 841
    .line 842
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 843
    .line 844
    .line 845
    move-result v3

    .line 846
    if-eqz v3, :cond_12

    .line 847
    .line 848
    goto :goto_11

    .line 849
    :sswitch_b
    const-string v5, "textContainer"

    .line 850
    .line 851
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 852
    .line 853
    .line 854
    move-result v3

    .line 855
    if-eqz v3, :cond_12

    .line 856
    .line 857
    :goto_10
    invoke-static {v0}, Lil1;->c(Lkl1;)Lkl1;

    .line 858
    .line 859
    .line 860
    move-result-object v0

    .line 861
    const/4 v6, 0x3

    .line 862
    iput v6, v0, Lkl1;->m:I

    .line 863
    .line 864
    goto/16 :goto_b

    .line 865
    .line 866
    :sswitch_c
    const-string v5, "delimiter"

    .line 867
    .line 868
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 869
    .line 870
    .line 871
    move-result v3

    .line 872
    if-eqz v3, :cond_12

    .line 873
    .line 874
    invoke-static {v0}, Lil1;->c(Lkl1;)Lkl1;

    .line 875
    .line 876
    .line 877
    move-result-object v0

    .line 878
    const/4 v3, 0x4

    .line 879
    iput v3, v0, Lkl1;->m:I

    .line 880
    .line 881
    goto/16 :goto_b

    .line 882
    .line 883
    :sswitch_d
    const-string v5, "container"

    .line 884
    .line 885
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 886
    .line 887
    .line 888
    move-result v3

    .line 889
    if-eqz v3, :cond_12

    .line 890
    .line 891
    invoke-static {v0}, Lil1;->c(Lkl1;)Lkl1;

    .line 892
    .line 893
    .line 894
    move-result-object v0

    .line 895
    iput v14, v0, Lkl1;->m:I

    .line 896
    .line 897
    goto/16 :goto_b

    .line 898
    .line 899
    :sswitch_e
    const-string v5, "baseContainer"

    .line 900
    .line 901
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 902
    .line 903
    .line 904
    move-result v3

    .line 905
    if-eqz v3, :cond_12

    .line 906
    .line 907
    :goto_11
    invoke-static {v0}, Lil1;->c(Lkl1;)Lkl1;

    .line 908
    .line 909
    .line 910
    move-result-object v0

    .line 911
    iput v15, v0, Lkl1;->m:I

    .line 912
    .line 913
    goto/16 :goto_b

    .line 914
    .line 915
    :sswitch_f
    const-string v3, "id"

    .line 916
    .line 917
    invoke-virtual {v6, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 918
    .line 919
    .line 920
    move-result v3

    .line 921
    if-eqz v3, :cond_12

    .line 922
    .line 923
    invoke-interface {v1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    .line 924
    .line 925
    .line 926
    move-result-object v3

    .line 927
    const-string v6, "style"

    .line 928
    .line 929
    invoke-virtual {v6, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 930
    .line 931
    .line 932
    move-result v3

    .line 933
    if-eqz v3, :cond_12

    .line 934
    .line 935
    invoke-static {v0}, Lil1;->c(Lkl1;)Lkl1;

    .line 936
    .line 937
    .line 938
    move-result-object v0

    .line 939
    iput-object v5, v0, Lkl1;->l:Ljava/lang/String;

    .line 940
    .line 941
    goto/16 :goto_b

    .line 942
    .line 943
    :sswitch_10
    const-string v3, "fontWeight"

    .line 944
    .line 945
    invoke-virtual {v6, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 946
    .line 947
    .line 948
    move-result v3

    .line 949
    if-eqz v3, :cond_12

    .line 950
    .line 951
    invoke-static {v0}, Lil1;->c(Lkl1;)Lkl1;

    .line 952
    .line 953
    .line 954
    move-result-object v0

    .line 955
    const-string v3, "bold"

    .line 956
    .line 957
    invoke-virtual {v3, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 958
    .line 959
    .line 960
    move-result v3

    .line 961
    iput v3, v0, Lkl1;->h:I

    .line 962
    .line 963
    goto/16 :goto_b

    .line 964
    .line 965
    :sswitch_11
    const-string v3, "textDecoration"

    .line 966
    .line 967
    invoke-virtual {v6, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 968
    .line 969
    .line 970
    move-result v3

    .line 971
    if-eqz v3, :cond_12

    .line 972
    .line 973
    invoke-static {v5}, Lum;->D(Ljava/lang/String;)Ljava/lang/String;

    .line 974
    .line 975
    .line 976
    move-result-object v3

    .line 977
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 978
    .line 979
    .line 980
    move-result v5

    .line 981
    sparse-switch v5, :sswitch_data_2

    .line 982
    .line 983
    .line 984
    goto/16 :goto_b

    .line 985
    .line 986
    :sswitch_12
    const-string v5, "linethrough"

    .line 987
    .line 988
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 989
    .line 990
    .line 991
    move-result v3

    .line 992
    if-eqz v3, :cond_12

    .line 993
    .line 994
    invoke-static {v0}, Lil1;->c(Lkl1;)Lkl1;

    .line 995
    .line 996
    .line 997
    move-result-object v0

    .line 998
    iput v14, v0, Lkl1;->f:I

    .line 999
    .line 1000
    goto/16 :goto_b

    .line 1001
    .line 1002
    :sswitch_13
    const-string v5, "nolinethrough"

    .line 1003
    .line 1004
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1005
    .line 1006
    .line 1007
    move-result v3

    .line 1008
    if-eqz v3, :cond_12

    .line 1009
    .line 1010
    invoke-static {v0}, Lil1;->c(Lkl1;)Lkl1;

    .line 1011
    .line 1012
    .line 1013
    move-result-object v0

    .line 1014
    const/4 v3, 0x0

    .line 1015
    iput v3, v0, Lkl1;->f:I

    .line 1016
    .line 1017
    goto/16 :goto_12

    .line 1018
    .line 1019
    :sswitch_14
    const-string v5, "underline"

    .line 1020
    .line 1021
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1022
    .line 1023
    .line 1024
    move-result v3

    .line 1025
    if-eqz v3, :cond_12

    .line 1026
    .line 1027
    invoke-static {v0}, Lil1;->c(Lkl1;)Lkl1;

    .line 1028
    .line 1029
    .line 1030
    move-result-object v0

    .line 1031
    iput v14, v0, Lkl1;->g:I

    .line 1032
    .line 1033
    goto/16 :goto_b

    .line 1034
    .line 1035
    :sswitch_15
    const-string v5, "nounderline"

    .line 1036
    .line 1037
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1038
    .line 1039
    .line 1040
    move-result v3

    .line 1041
    if-eqz v3, :cond_12

    .line 1042
    .line 1043
    invoke-static {v0}, Lil1;->c(Lkl1;)Lkl1;

    .line 1044
    .line 1045
    .line 1046
    move-result-object v0

    .line 1047
    const/4 v3, 0x0

    .line 1048
    iput v3, v0, Lkl1;->g:I

    .line 1049
    .line 1050
    goto :goto_12

    .line 1051
    :sswitch_16
    const-string v7, "origin"

    .line 1052
    .line 1053
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1054
    .line 1055
    .line 1056
    move-result v6

    .line 1057
    if-eqz v6, :cond_1f

    .line 1058
    .line 1059
    invoke-static {v0}, Lil1;->c(Lkl1;)Lkl1;

    .line 1060
    .line 1061
    .line 1062
    move-result-object v0

    .line 1063
    iput-object v5, v0, Lkl1;->t:Ljava/lang/String;

    .line 1064
    .line 1065
    goto :goto_12

    .line 1066
    :sswitch_17
    const-string v7, "textAlign"

    .line 1067
    .line 1068
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1069
    .line 1070
    .line 1071
    move-result v6

    .line 1072
    if-eqz v6, :cond_1f

    .line 1073
    .line 1074
    invoke-static {v0}, Lil1;->c(Lkl1;)Lkl1;

    .line 1075
    .line 1076
    .line 1077
    move-result-object v0

    .line 1078
    invoke-static {v5}, Lil1;->d(Ljava/lang/String;)Landroid/text/Layout$Alignment;

    .line 1079
    .line 1080
    .line 1081
    move-result-object v5

    .line 1082
    iput-object v5, v0, Lkl1;->o:Landroid/text/Layout$Alignment;

    .line 1083
    .line 1084
    goto :goto_12

    .line 1085
    :sswitch_18
    const-string v7, "fontFamily"

    .line 1086
    .line 1087
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1088
    .line 1089
    .line 1090
    move-result v6

    .line 1091
    if-eqz v6, :cond_1f

    .line 1092
    .line 1093
    invoke-static {v0}, Lil1;->c(Lkl1;)Lkl1;

    .line 1094
    .line 1095
    .line 1096
    move-result-object v0

    .line 1097
    iput-object v5, v0, Lkl1;->a:Ljava/lang/String;

    .line 1098
    .line 1099
    goto :goto_12

    .line 1100
    :sswitch_19
    const-string v7, "extent"

    .line 1101
    .line 1102
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1103
    .line 1104
    .line 1105
    move-result v6

    .line 1106
    if-eqz v6, :cond_1f

    .line 1107
    .line 1108
    invoke-static {v0}, Lil1;->c(Lkl1;)Lkl1;

    .line 1109
    .line 1110
    .line 1111
    move-result-object v0

    .line 1112
    iput-object v5, v0, Lkl1;->u:Ljava/lang/String;

    .line 1113
    .line 1114
    goto :goto_12

    .line 1115
    :sswitch_1a
    const-string v7, "fontStyle"

    .line 1116
    .line 1117
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1118
    .line 1119
    .line 1120
    move-result v6

    .line 1121
    if-eqz v6, :cond_1f

    .line 1122
    .line 1123
    invoke-static {v0}, Lil1;->c(Lkl1;)Lkl1;

    .line 1124
    .line 1125
    .line 1126
    move-result-object v0

    .line 1127
    const-string v6, "italic"

    .line 1128
    .line 1129
    invoke-virtual {v6, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1130
    .line 1131
    .line 1132
    move-result v5

    .line 1133
    iput v5, v0, Lkl1;->i:I

    .line 1134
    .line 1135
    :cond_1f
    :goto_12
    add-int/lit8 v4, v4, 0x1

    .line 1136
    .line 1137
    goto/16 :goto_0

    .line 1138
    .line 1139
    :cond_20
    return-object v0

    .line 1140
    nop

    .line 1141
    :sswitch_data_0
    .sparse-switch
        -0x5c71855e -> :sswitch_1a
        -0x4cd540d6 -> :sswitch_19
        -0x48ff636d -> :sswitch_18
        -0x3f826a28 -> :sswitch_17
        -0x3c1e50da -> :sswitch_16
        -0x3468fa43 -> :sswitch_11
        -0x2bc67c59 -> :sswitch_10
        0xd1b -> :sswitch_f
        0x3595da -> :sswitch_8
        0x5a72f63 -> :sswitch_7
        0x6855ce1 -> :sswitch_6
        0x6909352 -> :sswitch_5
        0x15caa0f0 -> :sswitch_4
        0x36e741c9 -> :sswitch_3
        0x42841923 -> :sswitch_2
        0x4cb7f6d5 -> :sswitch_1
        0x6899f5a4 -> :sswitch_0
    .end sparse-switch

    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    :sswitch_data_1
    .sparse-switch
        -0x24de7f50 -> :sswitch_e
        -0x187eb37f -> :sswitch_d
        -0xeee99f9 -> :sswitch_c
        -0x81c562c -> :sswitch_b
        0x2e06d1 -> :sswitch_a
        0x36452d -> :sswitch_9
    .end sparse-switch

    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    :sswitch_data_2
    .sparse-switch
        -0x57195dd5 -> :sswitch_15
        -0x3d363934 -> :sswitch_14
        0x36723ff0 -> :sswitch_13
        0x641ec051 -> :sswitch_12
    .end sparse-switch
.end method

.method public static c(Lkl1;)Lkl1;
    .locals 0

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    new-instance p0, Lkl1;

    .line 4
    .line 5
    invoke-direct {p0}, Lkl1;-><init>()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-object p0
.end method

.method public static d(Ljava/lang/String;)Landroid/text/Layout$Alignment;
    .locals 1

    .line 1
    invoke-static {p0}, Lum;->D(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    sparse-switch v0, :sswitch_data_0

    .line 10
    .line 11
    .line 12
    goto :goto_2

    .line 13
    :sswitch_0
    const-string v0, "start"

    .line 14
    .line 15
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    if-eqz p0, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :sswitch_1
    const-string v0, "right"

    .line 23
    .line 24
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    if-eqz p0, :cond_0

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :sswitch_2
    const-string v0, "left"

    .line 32
    .line 33
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    if-eqz p0, :cond_0

    .line 38
    .line 39
    :goto_0
    sget-object p0, Landroid/text/Layout$Alignment;->ALIGN_NORMAL:Landroid/text/Layout$Alignment;

    .line 40
    .line 41
    return-object p0

    .line 42
    :sswitch_3
    const-string v0, "end"

    .line 43
    .line 44
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result p0

    .line 48
    if-eqz p0, :cond_0

    .line 49
    .line 50
    :goto_1
    sget-object p0, Landroid/text/Layout$Alignment;->ALIGN_OPPOSITE:Landroid/text/Layout$Alignment;

    .line 51
    .line 52
    return-object p0

    .line 53
    :sswitch_4
    const-string v0, "center"

    .line 54
    .line 55
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result p0

    .line 59
    if-eqz p0, :cond_0

    .line 60
    .line 61
    sget-object p0, Landroid/text/Layout$Alignment;->ALIGN_CENTER:Landroid/text/Layout$Alignment;

    .line 62
    .line 63
    return-object p0

    .line 64
    :cond_0
    :goto_2
    const/4 p0, 0x0

    .line 65
    return-object p0

    .line 66
    nop

    .line 67
    :sswitch_data_0
    .sparse-switch
        -0x514d33ab -> :sswitch_4
        0x188db -> :sswitch_3
        0x32a007 -> :sswitch_2
        0x677c21c -> :sswitch_1
        0x68ac462 -> :sswitch_0
    .end sparse-switch
.end method

.method public static e(Ljava/lang/String;Lhl1;)J
    .locals 12

    .line 1
    sget-object v0, Lil1;->g:Ljava/util/regex/Pattern;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->matches()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const-wide v2, 0x412e848000000000L    # 1000000.0

    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    const/4 v4, 0x2

    .line 17
    const/4 v5, 0x1

    .line 18
    if-eqz v1, :cond_3

    .line 19
    .line 20
    invoke-virtual {v0, v5}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 28
    .line 29
    .line 30
    move-result-wide v5

    .line 31
    const-wide/16 v7, 0xe10

    .line 32
    .line 33
    mul-long/2addr v5, v7

    .line 34
    invoke-virtual {v0, v4}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    long-to-double v4, v5

    .line 42
    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 43
    .line 44
    .line 45
    move-result-wide v6

    .line 46
    const-wide/16 v8, 0x3c

    .line 47
    .line 48
    mul-long/2addr v6, v8

    .line 49
    const/4 p0, 0x3

    .line 50
    invoke-virtual {v0, p0}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    long-to-double v6, v6

    .line 58
    add-double/2addr v4, v6

    .line 59
    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 60
    .line 61
    .line 62
    move-result-wide v6

    .line 63
    long-to-double v6, v6

    .line 64
    const/4 p0, 0x4

    .line 65
    invoke-virtual {v0, p0}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    const-wide/16 v8, 0x0

    .line 70
    .line 71
    if-eqz p0, :cond_0

    .line 72
    .line 73
    invoke-static {p0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 74
    .line 75
    .line 76
    move-result-wide v10

    .line 77
    goto :goto_0

    .line 78
    :cond_0
    move-wide v10, v8

    .line 79
    :goto_0
    add-double/2addr v4, v6

    .line 80
    const/4 p0, 0x5

    .line 81
    invoke-virtual {v0, p0}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    if-eqz p0, :cond_1

    .line 86
    .line 87
    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 88
    .line 89
    .line 90
    move-result-wide v6

    .line 91
    long-to-float p0, v6

    .line 92
    iget v1, p1, Lhl1;->a:F

    .line 93
    .line 94
    div-float/2addr p0, v1

    .line 95
    float-to-double v6, p0

    .line 96
    goto :goto_1

    .line 97
    :cond_1
    move-wide v6, v8

    .line 98
    :goto_1
    add-double/2addr v4, v10

    .line 99
    const/4 p0, 0x6

    .line 100
    invoke-virtual {v0, p0}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    if-eqz p0, :cond_2

    .line 105
    .line 106
    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 107
    .line 108
    .line 109
    move-result-wide v0

    .line 110
    long-to-double v0, v0

    .line 111
    iget p0, p1, Lhl1;->b:I

    .line 112
    .line 113
    int-to-double v8, p0

    .line 114
    iget p0, p1, Lhl1;->a:F

    .line 115
    .line 116
    float-to-double p0, p0

    .line 117
    div-double/2addr v0, v8

    .line 118
    div-double v8, v0, p0

    .line 119
    .line 120
    :cond_2
    add-double/2addr v4, v6

    .line 121
    add-double/2addr v4, v8

    .line 122
    mul-double/2addr v4, v2

    .line 123
    double-to-long p0, v4

    .line 124
    return-wide p0

    .line 125
    :cond_3
    sget-object v0, Lil1;->h:Ljava/util/regex/Pattern;

    .line 126
    .line 127
    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->matches()Z

    .line 132
    .line 133
    .line 134
    move-result v1

    .line 135
    if-eqz v1, :cond_b

    .line 136
    .line 137
    invoke-virtual {v0, v5}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object p0

    .line 141
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 142
    .line 143
    .line 144
    invoke-static {p0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 145
    .line 146
    .line 147
    move-result-wide v5

    .line 148
    invoke-virtual {v0, v4}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object p0

    .line 152
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 153
    .line 154
    .line 155
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 156
    .line 157
    .line 158
    move-result v0

    .line 159
    const/16 v1, 0x66

    .line 160
    .line 161
    if-eq v0, v1, :cond_9

    .line 162
    .line 163
    const/16 v1, 0x68

    .line 164
    .line 165
    if-eq v0, v1, :cond_8

    .line 166
    .line 167
    const/16 v1, 0x6d

    .line 168
    .line 169
    if-eq v0, v1, :cond_7

    .line 170
    .line 171
    const/16 v1, 0xda6

    .line 172
    .line 173
    if-eq v0, v1, :cond_6

    .line 174
    .line 175
    const/16 v1, 0x73

    .line 176
    .line 177
    if-eq v0, v1, :cond_5

    .line 178
    .line 179
    const/16 v1, 0x74

    .line 180
    .line 181
    if-eq v0, v1, :cond_4

    .line 182
    .line 183
    goto :goto_4

    .line 184
    :cond_4
    const-string v0, "t"

    .line 185
    .line 186
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 187
    .line 188
    .line 189
    move-result p0

    .line 190
    if-eqz p0, :cond_a

    .line 191
    .line 192
    iget p0, p1, Lhl1;->c:I

    .line 193
    .line 194
    int-to-double p0, p0

    .line 195
    :goto_2
    div-double/2addr v5, p0

    .line 196
    goto :goto_4

    .line 197
    :cond_5
    const-string p1, "s"

    .line 198
    .line 199
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 200
    .line 201
    .line 202
    move-result p0

    .line 203
    goto :goto_4

    .line 204
    :cond_6
    const-string p1, "ms"

    .line 205
    .line 206
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 207
    .line 208
    .line 209
    move-result p0

    .line 210
    if-eqz p0, :cond_a

    .line 211
    .line 212
    const-wide p0, 0x408f400000000000L    # 1000.0

    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    goto :goto_2

    .line 218
    :cond_7
    const-string p1, "m"

    .line 219
    .line 220
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 221
    .line 222
    .line 223
    move-result p0

    .line 224
    if-eqz p0, :cond_a

    .line 225
    .line 226
    const-wide/high16 p0, 0x404e000000000000L    # 60.0

    .line 227
    .line 228
    :goto_3
    mul-double/2addr v5, p0

    .line 229
    goto :goto_4

    .line 230
    :cond_8
    const-string p1, "h"

    .line 231
    .line 232
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 233
    .line 234
    .line 235
    move-result p0

    .line 236
    if-eqz p0, :cond_a

    .line 237
    .line 238
    const-wide p0, 0x40ac200000000000L    # 3600.0

    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    goto :goto_3

    .line 244
    :cond_9
    const-string v0, "f"

    .line 245
    .line 246
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 247
    .line 248
    .line 249
    move-result p0

    .line 250
    if-eqz p0, :cond_a

    .line 251
    .line 252
    iget p0, p1, Lhl1;->a:F

    .line 253
    .line 254
    float-to-double p0, p0

    .line 255
    goto :goto_2

    .line 256
    :cond_a
    :goto_4
    mul-double/2addr v5, v2

    .line 257
    double-to-long p0, v5

    .line 258
    return-wide p0

    .line 259
    :cond_b
    new-instance p1, Lik1;

    .line 260
    .line 261
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 262
    .line 263
    .line 264
    move-result-object p0

    .line 265
    const-string v0, "Malformed time expression: "

    .line 266
    .line 267
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 268
    .line 269
    .line 270
    move-result-object p0

    .line 271
    invoke-direct {p1, p0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 272
    .line 273
    .line 274
    throw p1
.end method


# virtual methods
.method public final a([BII)Lg4;
    .locals 48

    .line 1
    const-string v1, ""

    .line 2
    .line 3
    const-string v2, "http://www.w3.org/ns/ttml#parameter"

    .line 4
    .line 5
    const-string v3, "Ignoring unsupported tag: "

    .line 6
    .line 7
    move-object/from16 v4, p0

    .line 8
    .line 9
    :try_start_0
    iget-object v0, v4, Lil1;->f:Lorg/xmlpull/v1/XmlPullParserFactory;

    .line 10
    .line 11
    invoke-virtual {v0}, Lorg/xmlpull/v1/XmlPullParserFactory;->newPullParser()Lorg/xmlpull/v1/XmlPullParser;

    .line 12
    .line 13
    .line 14
    move-result-object v5

    .line 15
    new-instance v6, Ljava/util/HashMap;

    .line 16
    .line 17
    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    .line 18
    .line 19
    .line 20
    new-instance v7, Ljava/util/HashMap;

    .line 21
    .line 22
    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    .line 23
    .line 24
    .line 25
    new-instance v8, Ljava/util/HashMap;

    .line 26
    .line 27
    invoke-direct {v8}, Ljava/util/HashMap;-><init>()V

    .line 28
    .line 29
    .line 30
    new-instance v9, Ljl1;

    .line 31
    .line 32
    const-string v10, ""

    .line 33
    .line 34
    const v11, -0x800001

    .line 35
    .line 36
    .line 37
    const/high16 v13, -0x80000000

    .line 38
    .line 39
    move v12, v11

    .line 40
    move v14, v13

    .line 41
    move v15, v11

    .line 42
    move/from16 v16, v11

    .line 43
    .line 44
    move/from16 v17, v13

    .line 45
    .line 46
    move/from16 v18, v11

    .line 47
    .line 48
    move/from16 v19, v13

    .line 49
    .line 50
    invoke-direct/range {v9 .. v19}, Ljl1;-><init>(Ljava/lang/String;FFIIFFIFI)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v7, v1, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    new-instance v0, Ljava/io/ByteArrayInputStream;

    .line 57
    .line 58
    move-object/from16 v9, p1

    .line 59
    .line 60
    move/from16 v10, p2

    .line 61
    .line 62
    move/from16 v11, p3

    .line 63
    .line 64
    invoke-direct {v0, v9, v10, v11}, Ljava/io/ByteArrayInputStream;-><init>([BII)V

    .line 65
    .line 66
    .line 67
    const/4 v9, 0x0

    .line 68
    invoke-interface {v5, v0, v9}, Lorg/xmlpull/v1/XmlPullParser;->setInput(Ljava/io/InputStream;Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    new-instance v10, Ljava/util/ArrayDeque;

    .line 72
    .line 73
    invoke-direct {v10}, Ljava/util/ArrayDeque;-><init>()V

    .line 74
    .line 75
    .line 76
    invoke-interface {v5}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    sget-object v11, Lil1;->n:Lhl1;

    .line 81
    .line 82
    move-object v14, v9

    .line 83
    move-object/from16 v17, v14

    .line 84
    .line 85
    move-object/from16 v16, v11

    .line 86
    .line 87
    const/4 v15, 0x0

    .line 88
    const/16 v18, 0xf

    .line 89
    .line 90
    :goto_0
    const/4 v12, 0x1

    .line 91
    if-eq v0, v12, :cond_53

    .line 92
    .line 93
    invoke-virtual {v10}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v19

    .line 97
    move-object/from16 p2, v9

    .line 98
    .line 99
    move-object/from16 v9, v19

    .line 100
    .line 101
    check-cast v9, Lgl1;

    .line 102
    .line 103
    const/16 p3, 0x0

    .line 104
    .line 105
    const/4 v13, 0x2

    .line 106
    if-nez v15, :cond_51

    .line 107
    .line 108
    move/from16 v20, v12

    .line 109
    .line 110
    invoke-interface {v5}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v12
    :try_end_0
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 114
    move-object/from16 v21, v1

    .line 115
    .line 116
    const-string v1, "tt"

    .line 117
    .line 118
    if-ne v0, v13, :cond_4b

    .line 119
    .line 120
    :try_start_1
    invoke-virtual {v1, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    move-result v0
    :try_end_1
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 124
    const-string v13, "extent"

    .line 125
    .line 126
    sget-object v4, Lil1;->l:Ljava/util/regex/Pattern;

    .line 127
    .line 128
    const/high16 v23, 0x3f800000    # 1.0f

    .line 129
    .line 130
    if-eqz v0, :cond_10

    .line 131
    .line 132
    :try_start_2
    const-string v0, "frameRate"

    .line 133
    .line 134
    invoke-interface {v5, v2, v0}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    if-eqz v0, :cond_0

    .line 139
    .line 140
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 141
    .line 142
    .line 143
    move-result v0

    .line 144
    :goto_1
    move-object/from16 v24, v14

    .line 145
    .line 146
    goto :goto_2

    .line 147
    :catch_0
    move-exception v0

    .line 148
    goto/16 :goto_36

    .line 149
    .line 150
    :catch_1
    move-exception v0

    .line 151
    goto/16 :goto_37

    .line 152
    .line 153
    :cond_0
    const/16 v0, 0x1e

    .line 154
    .line 155
    goto :goto_1

    .line 156
    :goto_2
    const-string v14, "frameRateMultiplier"

    .line 157
    .line 158
    invoke-interface {v5, v2, v14}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object v14

    .line 162
    if-eqz v14, :cond_2

    .line 163
    .line 164
    move/from16 v25, v15

    .line 165
    .line 166
    const-string v15, " "

    .line 167
    .line 168
    sget-object v16, Lv23;->a:Ljava/lang/String;

    .line 169
    .line 170
    move-object/from16 v26, v10

    .line 171
    .line 172
    const/4 v10, -0x1

    .line 173
    invoke-virtual {v14, v15, v10}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object v14

    .line 177
    array-length v10, v14

    .line 178
    const/4 v15, 0x2

    .line 179
    if-ne v10, v15, :cond_1

    .line 180
    .line 181
    move/from16 v10, v20

    .line 182
    .line 183
    goto :goto_3

    .line 184
    :cond_1
    move/from16 v10, p3

    .line 185
    .line 186
    :goto_3
    const-string v15, "frameRateMultiplier doesn\'t have 2 parts"

    .line 187
    .line 188
    invoke-static {v15, v10}, Lzt0;->M(Ljava/lang/String;Z)V

    .line 189
    .line 190
    .line 191
    aget-object v10, v14, p3

    .line 192
    .line 193
    invoke-static {v10}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 194
    .line 195
    .line 196
    move-result v10

    .line 197
    int-to-float v10, v10

    .line 198
    aget-object v14, v14, v20

    .line 199
    .line 200
    invoke-static {v14}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 201
    .line 202
    .line 203
    move-result v14

    .line 204
    int-to-float v14, v14

    .line 205
    div-float/2addr v10, v14

    .line 206
    goto :goto_4

    .line 207
    :cond_2
    move-object/from16 v26, v10

    .line 208
    .line 209
    move/from16 v25, v15

    .line 210
    .line 211
    move/from16 v10, v23

    .line 212
    .line 213
    :goto_4
    iget v14, v11, Lhl1;->b:I

    .line 214
    .line 215
    const-string v15, "subFrameRate"

    .line 216
    .line 217
    invoke-interface {v5, v2, v15}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 218
    .line 219
    .line 220
    move-result-object v15

    .line 221
    if-eqz v15, :cond_3

    .line 222
    .line 223
    invoke-static {v15}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 224
    .line 225
    .line 226
    move-result v14

    .line 227
    :cond_3
    iget v15, v11, Lhl1;->c:I

    .line 228
    .line 229
    move/from16 v16, v10

    .line 230
    .line 231
    const-string v10, "tickRate"

    .line 232
    .line 233
    invoke-interface {v5, v2, v10}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 234
    .line 235
    .line 236
    move-result-object v10

    .line 237
    if-eqz v10, :cond_4

    .line 238
    .line 239
    invoke-static {v10}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 240
    .line 241
    .line 242
    move-result v15

    .line 243
    :cond_4
    new-instance v10, Lhl1;

    .line 244
    .line 245
    int-to-float v0, v0

    .line 246
    mul-float v0, v0, v16

    .line 247
    .line 248
    invoke-direct {v10, v0, v14, v15}, Lhl1;-><init>(FII)V

    .line 249
    .line 250
    .line 251
    const-string v0, "cellResolution"

    .line 252
    .line 253
    const-string v14, "Ignoring malformed cell resolution: "

    .line 254
    .line 255
    invoke-interface {v5, v2, v0}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 256
    .line 257
    .line 258
    move-result-object v0

    .line 259
    if-nez v0, :cond_5

    .line 260
    .line 261
    :goto_5
    move-object/from16 v27, v2

    .line 262
    .line 263
    move-object/from16 v17, v10

    .line 264
    .line 265
    move-object/from16 v28, v11

    .line 266
    .line 267
    :goto_6
    const/16 v18, 0xf

    .line 268
    .line 269
    goto/16 :goto_9

    .line 270
    .line 271
    :cond_5
    sget-object v15, Lil1;->m:Ljava/util/regex/Pattern;

    .line 272
    .line 273
    invoke-virtual {v15, v0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 274
    .line 275
    .line 276
    move-result-object v15

    .line 277
    invoke-virtual {v15}, Ljava/util/regex/Matcher;->matches()Z

    .line 278
    .line 279
    .line 280
    move-result v16

    .line 281
    if-nez v16, :cond_6

    .line 282
    .line 283
    invoke-virtual {v14, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 284
    .line 285
    .line 286
    move-result-object v0

    .line 287
    invoke-static {v0}, La30;->x(Ljava/lang/String;)V
    :try_end_2
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    .line 288
    .line 289
    .line 290
    goto :goto_5

    .line 291
    :cond_6
    move-object/from16 v27, v2

    .line 292
    .line 293
    move/from16 v2, v20

    .line 294
    .line 295
    :try_start_3
    invoke-virtual {v15, v2}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 296
    .line 297
    .line 298
    move-result-object v16

    .line 299
    if-eqz v16, :cond_b

    .line 300
    .line 301
    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 302
    .line 303
    .line 304
    move-result v2

    .line 305
    move/from16 v16, v2

    .line 306
    .line 307
    const/4 v2, 0x2

    .line 308
    invoke-virtual {v15, v2}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 309
    .line 310
    .line 311
    move-result-object v15

    .line 312
    if-eqz v15, :cond_a

    .line 313
    .line 314
    invoke-static {v15}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 315
    .line 316
    .line 317
    move-result v2

    .line 318
    if-eqz v16, :cond_8

    .line 319
    .line 320
    if-eqz v2, :cond_7

    .line 321
    .line 322
    move v15, v2

    .line 323
    const/16 v17, 0x1

    .line 324
    .line 325
    goto :goto_7

    .line 326
    :cond_7
    move/from16 v15, p3

    .line 327
    .line 328
    move/from16 v17, v15

    .line 329
    .line 330
    goto :goto_7

    .line 331
    :cond_8
    move/from16 v17, p3

    .line 332
    .line 333
    move v15, v2

    .line 334
    :goto_7
    const-string v2, "Invalid cell resolution %s %s"
    :try_end_3
    .catch Ljava/lang/NumberFormatException; {:try_start_3 .. :try_end_3} :catch_2
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0

    .line 335
    .line 336
    if-eqz v17, :cond_9

    .line 337
    .line 338
    move-object/from16 v17, v10

    .line 339
    .line 340
    move-object/from16 v28, v11

    .line 341
    .line 342
    move/from16 v18, v15

    .line 343
    .line 344
    goto :goto_9

    .line 345
    :cond_9
    move-object/from16 v17, v10

    .line 346
    .line 347
    :try_start_4
    new-instance v10, Ljava/lang/IllegalArgumentException;
    :try_end_4
    .catch Ljava/lang/NumberFormatException; {:try_start_4 .. :try_end_4} :catch_3
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    .line 348
    .line 349
    move-object/from16 v28, v11

    .line 350
    .line 351
    :try_start_5
    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 352
    .line 353
    .line 354
    move-result-object v11

    .line 355
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 356
    .line 357
    .line 358
    move-result-object v15

    .line 359
    filled-new-array {v11, v15}, [Ljava/lang/Object;

    .line 360
    .line 361
    .line 362
    move-result-object v11

    .line 363
    invoke-static {v2, v11}, Lqb1;->J(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 364
    .line 365
    .line 366
    move-result-object v2

    .line 367
    invoke-direct {v10, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 368
    .line 369
    .line 370
    throw v10

    .line 371
    :catch_2
    move-object/from16 v17, v10

    .line 372
    .line 373
    :catch_3
    move-object/from16 v28, v11

    .line 374
    .line 375
    goto :goto_8

    .line 376
    :cond_a
    move-object/from16 v17, v10

    .line 377
    .line 378
    move-object/from16 v28, v11

    .line 379
    .line 380
    throw p2

    .line 381
    :cond_b
    move-object/from16 v17, v10

    .line 382
    .line 383
    move-object/from16 v28, v11

    .line 384
    .line 385
    throw p2
    :try_end_5
    .catch Ljava/lang/NumberFormatException; {:try_start_5 .. :try_end_5} :catch_4
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_5 .. :try_end_5} :catch_1
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_0

    .line 386
    :catch_4
    :goto_8
    :try_start_6
    invoke-virtual {v14, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 387
    .line 388
    .line 389
    move-result-object v0

    .line 390
    invoke-static {v0}, La30;->x(Ljava/lang/String;)V

    .line 391
    .line 392
    .line 393
    goto :goto_6

    .line 394
    :goto_9
    const-string v0, "Ignoring malformed tts extent: "

    .line 395
    .line 396
    const-string v2, "Ignoring non-pixel tts extent: "

    .line 397
    .line 398
    invoke-static {v5, v13}, Lyb;->C(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Ljava/lang/String;

    .line 399
    .line 400
    .line 401
    move-result-object v10

    .line 402
    if-nez v10, :cond_c

    .line 403
    .line 404
    :goto_a
    move-object/from16 v14, p2

    .line 405
    .line 406
    goto :goto_b

    .line 407
    :cond_c
    invoke-virtual {v4, v10}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 408
    .line 409
    .line 410
    move-result-object v11

    .line 411
    invoke-virtual {v11}, Ljava/util/regex/Matcher;->matches()Z

    .line 412
    .line 413
    .line 414
    move-result v14

    .line 415
    if-nez v14, :cond_d

    .line 416
    .line 417
    invoke-virtual {v2, v10}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 418
    .line 419
    .line 420
    move-result-object v0

    .line 421
    invoke-static {v0}, La30;->x(Ljava/lang/String;)V
    :try_end_6
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_6 .. :try_end_6} :catch_1
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_0

    .line 422
    .line 423
    .line 424
    goto :goto_a

    .line 425
    :cond_d
    const/4 v2, 0x1

    .line 426
    :try_start_7
    invoke-virtual {v11, v2}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 427
    .line 428
    .line 429
    move-result-object v14

    .line 430
    if-eqz v14, :cond_f

    .line 431
    .line 432
    invoke-static {v14}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 433
    .line 434
    .line 435
    move-result v2

    .line 436
    const/4 v15, 0x2

    .line 437
    invoke-virtual {v11, v15}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 438
    .line 439
    .line 440
    move-result-object v11

    .line 441
    if-eqz v11, :cond_e

    .line 442
    .line 443
    invoke-static {v11}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 444
    .line 445
    .line 446
    move-result v11

    .line 447
    new-instance v14, Ltg0;

    .line 448
    .line 449
    invoke-direct {v14, v2, v11}, Ltg0;-><init>(II)V

    .line 450
    .line 451
    .line 452
    goto :goto_b

    .line 453
    :cond_e
    throw p2

    .line 454
    :cond_f
    throw p2
    :try_end_7
    .catch Ljava/lang/NumberFormatException; {:try_start_7 .. :try_end_7} :catch_5
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_7 .. :try_end_7} :catch_1
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_0

    .line 455
    :catch_5
    :try_start_8
    invoke-virtual {v0, v10}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 456
    .line 457
    .line 458
    move-result-object v0

    .line 459
    invoke-static {v0}, La30;->x(Ljava/lang/String;)V

    .line 460
    .line 461
    .line 462
    goto :goto_a

    .line 463
    :goto_b
    move-object/from16 v2, v17

    .line 464
    .line 465
    :goto_c
    move/from16 v10, v18

    .line 466
    .line 467
    goto :goto_d

    .line 468
    :cond_10
    move-object/from16 v27, v2

    .line 469
    .line 470
    move-object/from16 v26, v10

    .line 471
    .line 472
    move-object/from16 v28, v11

    .line 473
    .line 474
    move-object/from16 v24, v14

    .line 475
    .line 476
    move/from16 v25, v15

    .line 477
    .line 478
    move-object/from16 v2, v16

    .line 479
    .line 480
    move-object/from16 v14, v17

    .line 481
    .line 482
    goto :goto_c

    .line 483
    :goto_d
    invoke-virtual {v12, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 484
    .line 485
    .line 486
    move-result v0
    :try_end_8
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_8 .. :try_end_8} :catch_1
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_0

    .line 487
    const-string v1, "image"

    .line 488
    .line 489
    const-string v11, "metadata"

    .line 490
    .line 491
    const-string v15, "region"

    .line 492
    .line 493
    move-object/from16 v29, v9

    .line 494
    .line 495
    const-string v9, "head"

    .line 496
    .line 497
    move-object/from16 v16, v2

    .line 498
    .line 499
    const-string v2, "style"

    .line 500
    .line 501
    if-nez v0, :cond_12

    .line 502
    .line 503
    :try_start_9
    invoke-virtual {v12, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 504
    .line 505
    .line 506
    move-result v0

    .line 507
    if-nez v0, :cond_12

    .line 508
    .line 509
    const-string v0, "body"

    .line 510
    .line 511
    invoke-virtual {v12, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 512
    .line 513
    .line 514
    move-result v0

    .line 515
    if-nez v0, :cond_12

    .line 516
    .line 517
    const-string v0, "div"

    .line 518
    .line 519
    invoke-virtual {v12, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 520
    .line 521
    .line 522
    move-result v0

    .line 523
    if-nez v0, :cond_12

    .line 524
    .line 525
    const-string v0, "p"

    .line 526
    .line 527
    invoke-virtual {v12, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 528
    .line 529
    .line 530
    move-result v0

    .line 531
    if-nez v0, :cond_12

    .line 532
    .line 533
    const-string v0, "span"

    .line 534
    .line 535
    invoke-virtual {v12, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 536
    .line 537
    .line 538
    move-result v0

    .line 539
    if-nez v0, :cond_12

    .line 540
    .line 541
    const-string v0, "br"

    .line 542
    .line 543
    invoke-virtual {v12, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 544
    .line 545
    .line 546
    move-result v0

    .line 547
    if-nez v0, :cond_12

    .line 548
    .line 549
    invoke-virtual {v12, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 550
    .line 551
    .line 552
    move-result v0

    .line 553
    if-nez v0, :cond_12

    .line 554
    .line 555
    const-string v0, "styling"

    .line 556
    .line 557
    invoke-virtual {v12, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 558
    .line 559
    .line 560
    move-result v0

    .line 561
    if-nez v0, :cond_12

    .line 562
    .line 563
    const-string v0, "layout"

    .line 564
    .line 565
    invoke-virtual {v12, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 566
    .line 567
    .line 568
    move-result v0

    .line 569
    if-nez v0, :cond_12

    .line 570
    .line 571
    invoke-virtual {v12, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 572
    .line 573
    .line 574
    move-result v0

    .line 575
    if-nez v0, :cond_12

    .line 576
    .line 577
    invoke-virtual {v12, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 578
    .line 579
    .line 580
    move-result v0

    .line 581
    if-nez v0, :cond_12

    .line 582
    .line 583
    invoke-virtual {v12, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 584
    .line 585
    .line 586
    move-result v0

    .line 587
    if-nez v0, :cond_12

    .line 588
    .line 589
    const-string v0, "data"

    .line 590
    .line 591
    invoke-virtual {v12, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 592
    .line 593
    .line 594
    move-result v0

    .line 595
    if-nez v0, :cond_12

    .line 596
    .line 597
    const-string v0, "information"

    .line 598
    .line 599
    invoke-virtual {v12, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 600
    .line 601
    .line 602
    move-result v0

    .line 603
    if-eqz v0, :cond_11

    .line 604
    .line 605
    goto :goto_f

    .line 606
    :cond_11
    invoke-interface {v5}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    .line 607
    .line 608
    .line 609
    move-result-object v0

    .line 610
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 611
    .line 612
    .line 613
    move-result-object v1

    .line 614
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 615
    .line 616
    .line 617
    move-result v1

    .line 618
    add-int/lit8 v1, v1, 0x1a

    .line 619
    .line 620
    new-instance v2, Ljava/lang/StringBuilder;

    .line 621
    .line 622
    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 623
    .line 624
    .line 625
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 626
    .line 627
    .line 628
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 629
    .line 630
    .line 631
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 632
    .line 633
    .line 634
    move-result-object v0

    .line 635
    invoke-static {v0}, La30;->u(Ljava/lang/String;)V

    .line 636
    .line 637
    .line 638
    move-object/from16 v30, v3

    .line 639
    .line 640
    move-object v11, v8

    .line 641
    move/from16 v18, v10

    .line 642
    .line 643
    move-object/from16 v17, v14

    .line 644
    .line 645
    move-object/from16 v14, v24

    .line 646
    .line 647
    move-object/from16 v3, v26

    .line 648
    .line 649
    :goto_e
    const/4 v15, 0x1

    .line 650
    goto/16 :goto_35

    .line 651
    .line 652
    :cond_12
    :goto_f
    invoke-virtual {v9, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 653
    .line 654
    .line 655
    move-result v0
    :try_end_9
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_9 .. :try_end_9} :catch_1
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_0

    .line 656
    const-string v12, "\\s+"

    .line 657
    .line 658
    if-eqz v0, :cond_39

    .line 659
    .line 660
    :goto_10
    :try_start_a
    invoke-interface {v5}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 661
    .line 662
    .line 663
    invoke-static {v5, v2}, Lyb;->B(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 664
    .line 665
    .line 666
    move-result v0

    .line 667
    if-eqz v0, :cond_17

    .line 668
    .line 669
    invoke-static {v5, v2}, Lyb;->C(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Ljava/lang/String;

    .line 670
    .line 671
    .line 672
    move-result-object v0

    .line 673
    move-object/from16 v30, v3

    .line 674
    .line 675
    new-instance v3, Lkl1;

    .line 676
    .line 677
    invoke-direct {v3}, Lkl1;-><init>()V

    .line 678
    .line 679
    .line 680
    invoke-static {v5, v3}, Lil1;->b(Lorg/xmlpull/v1/XmlPullParser;Lkl1;)Lkl1;

    .line 681
    .line 682
    .line 683
    move-result-object v3

    .line 684
    if-eqz v0, :cond_14

    .line 685
    .line 686
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 687
    .line 688
    .line 689
    move-result-object v0

    .line 690
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 691
    .line 692
    .line 693
    move-result v17

    .line 694
    if-eqz v17, :cond_13

    .line 695
    .line 696
    move-object/from16 v17, v9

    .line 697
    .line 698
    move/from16 v9, p3

    .line 699
    .line 700
    new-array v0, v9, [Ljava/lang/String;

    .line 701
    .line 702
    goto :goto_11

    .line 703
    :cond_13
    move-object/from16 v17, v9

    .line 704
    .line 705
    sget-object v9, Lv23;->a:Ljava/lang/String;

    .line 706
    .line 707
    const/4 v9, -0x1

    .line 708
    invoke-virtual {v0, v12, v9}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    .line 709
    .line 710
    .line 711
    move-result-object v0

    .line 712
    :goto_11
    array-length v9, v0

    .line 713
    move-object/from16 v18, v12

    .line 714
    .line 715
    const/4 v12, 0x0

    .line 716
    :goto_12
    if-ge v12, v9, :cond_15

    .line 717
    .line 718
    move/from16 v29, v9

    .line 719
    .line 720
    aget-object v9, v0, v12

    .line 721
    .line 722
    invoke-virtual {v6, v9}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 723
    .line 724
    .line 725
    move-result-object v9

    .line 726
    check-cast v9, Lkl1;

    .line 727
    .line 728
    invoke-virtual {v3, v9}, Lkl1;->c(Lkl1;)V

    .line 729
    .line 730
    .line 731
    add-int/lit8 v12, v12, 0x1

    .line 732
    .line 733
    move/from16 v9, v29

    .line 734
    .line 735
    goto :goto_12

    .line 736
    :cond_14
    move-object/from16 v17, v9

    .line 737
    .line 738
    move-object/from16 v18, v12

    .line 739
    .line 740
    :cond_15
    invoke-virtual {v3}, Lkl1;->d()Ljava/lang/String;

    .line 741
    .line 742
    .line 743
    move-result-object v0

    .line 744
    if-eqz v0, :cond_16

    .line 745
    .line 746
    invoke-virtual {v6, v0, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 747
    .line 748
    .line 749
    :cond_16
    move-object v0, v11

    .line 750
    move-object/from16 v31, v15

    .line 751
    .line 752
    move-object/from16 v3, v17

    .line 753
    .line 754
    move-object v11, v8

    .line 755
    move-object v8, v1

    .line 756
    move v1, v10

    .line 757
    goto/16 :goto_22

    .line 758
    .line 759
    :cond_17
    move-object/from16 v30, v3

    .line 760
    .line 761
    move-object/from16 v17, v9

    .line 762
    .line 763
    move-object/from16 v18, v12

    .line 764
    .line 765
    invoke-static {v5, v15}, Lyb;->B(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 766
    .line 767
    .line 768
    move-result v0
    :try_end_a
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_a .. :try_end_a} :catch_1
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_0

    .line 769
    const-string v3, "id"

    .line 770
    .line 771
    if-eqz v0, :cond_34

    .line 772
    .line 773
    :try_start_b
    const-string v0, "Ignoring region with malformed origin: "

    .line 774
    .line 775
    const-string v9, "Ignoring region with malformed extent: "

    .line 776
    .line 777
    const-string v12, "Ignoring region with unsupported origin: "

    .line 778
    .line 779
    move-object/from16 v31, v15

    .line 780
    .line 781
    const-string v15, "Ignoring region with missing tts:extent: "

    .line 782
    .line 783
    move-object/from16 v32, v8

    .line 784
    .line 785
    const-string v8, "Ignoring region with unsupported extent: "

    .line 786
    .line 787
    invoke-static {v5, v3}, Lyb;->C(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Ljava/lang/String;

    .line 788
    .line 789
    .line 790
    move-result-object v34

    .line 791
    if-nez v34, :cond_18

    .line 792
    .line 793
    move-object/from16 v0, p2

    .line 794
    .line 795
    move-object/from16 v44, v1

    .line 796
    .line 797
    move-object/from16 v46, v7

    .line 798
    .line 799
    move v1, v10

    .line 800
    move-object/from16 v45, v11

    .line 801
    .line 802
    goto/16 :goto_1d

    .line 803
    .line 804
    :cond_18
    const-string v3, "origin"

    .line 805
    .line 806
    invoke-static {v5, v3}, Lyb;->C(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Ljava/lang/String;

    .line 807
    .line 808
    .line 809
    move-result-object v3

    .line 810
    if-nez v3, :cond_19

    .line 811
    .line 812
    move-object/from16 v29, v3

    .line 813
    .line 814
    invoke-static {v5, v2}, Lyb;->C(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Ljava/lang/String;

    .line 815
    .line 816
    .line 817
    move-result-object v3

    .line 818
    if-eqz v3, :cond_1a

    .line 819
    .line 820
    invoke-virtual {v6, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 821
    .line 822
    .line 823
    move-result-object v3

    .line 824
    check-cast v3, Lkl1;

    .line 825
    .line 826
    if-eqz v3, :cond_1a

    .line 827
    .line 828
    invoke-virtual {v3}, Lkl1;->a()Ljava/lang/String;

    .line 829
    .line 830
    .line 831
    move-result-object v3
    :try_end_b
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_b .. :try_end_b} :catch_1
    .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_0

    .line 832
    :goto_13
    move-object/from16 v44, v1

    .line 833
    .line 834
    goto :goto_14

    .line 835
    :cond_19
    move-object/from16 v29, v3

    .line 836
    .line 837
    :cond_1a
    move-object/from16 v3, v29

    .line 838
    .line 839
    goto :goto_13

    .line 840
    :goto_14
    sget-object v1, Lil1;->k:Ljava/util/regex/Pattern;

    .line 841
    .line 842
    const/high16 v29, 0x42c80000    # 100.0f

    .line 843
    .line 844
    if-eqz v3, :cond_22

    .line 845
    .line 846
    move-object/from16 v45, v11

    .line 847
    .line 848
    :try_start_c
    invoke-virtual {v1, v3}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 849
    .line 850
    .line 851
    move-result-object v11

    .line 852
    move-object/from16 v46, v7

    .line 853
    .line 854
    invoke-virtual {v4, v3}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 855
    .line 856
    .line 857
    move-result-object v7

    .line 858
    invoke-virtual {v11}, Ljava/util/regex/Matcher;->matches()Z

    .line 859
    .line 860
    .line 861
    move-result v33
    :try_end_c
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_c .. :try_end_c} :catch_1
    .catch Ljava/io/IOException; {:try_start_c .. :try_end_c} :catch_0

    .line 862
    if-eqz v33, :cond_1d

    .line 863
    .line 864
    move/from16 v47, v10

    .line 865
    .line 866
    const/4 v10, 0x1

    .line 867
    :try_start_d
    invoke-virtual {v11, v10}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 868
    .line 869
    .line 870
    move-result-object v7

    .line 871
    if-eqz v7, :cond_1c

    .line 872
    .line 873
    invoke-static {v7}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    .line 874
    .line 875
    .line 876
    move-result v7

    .line 877
    div-float v7, v7, v29

    .line 878
    .line 879
    const/4 v10, 0x2

    .line 880
    invoke-virtual {v11, v10}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 881
    .line 882
    .line 883
    move-result-object v11

    .line 884
    if-eqz v11, :cond_1b

    .line 885
    .line 886
    invoke-static {v11}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    .line 887
    .line 888
    .line 889
    move-result v0

    .line 890
    div-float v0, v0, v29

    .line 891
    .line 892
    move/from16 v35, v7

    .line 893
    .line 894
    goto :goto_16

    .line 895
    :cond_1b
    throw p2

    .line 896
    :cond_1c
    throw p2
    :try_end_d
    .catch Ljava/lang/NumberFormatException; {:try_start_d .. :try_end_d} :catch_6
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_d .. :try_end_d} :catch_1
    .catch Ljava/io/IOException; {:try_start_d .. :try_end_d} :catch_0

    .line 897
    :catch_6
    :try_start_e
    invoke-virtual {v0, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 898
    .line 899
    .line 900
    move-result-object v0

    .line 901
    invoke-static {v0}, La30;->x(Ljava/lang/String;)V

    .line 902
    .line 903
    .line 904
    :goto_15
    move-object/from16 v0, p2

    .line 905
    .line 906
    move/from16 v1, v47

    .line 907
    .line 908
    goto/16 :goto_1d

    .line 909
    .line 910
    :cond_1d
    move/from16 v47, v10

    .line 911
    .line 912
    invoke-virtual {v7}, Ljava/util/regex/Matcher;->matches()Z

    .line 913
    .line 914
    .line 915
    move-result v10

    .line 916
    if-eqz v10, :cond_21

    .line 917
    .line 918
    if-nez v14, :cond_1e

    .line 919
    .line 920
    invoke-virtual {v15, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 921
    .line 922
    .line 923
    move-result-object v0

    .line 924
    invoke-static {v0}, La30;->x(Ljava/lang/String;)V
    :try_end_e
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_e .. :try_end_e} :catch_1
    .catch Ljava/io/IOException; {:try_start_e .. :try_end_e} :catch_0

    .line 925
    .line 926
    .line 927
    goto :goto_15

    .line 928
    :cond_1e
    const/4 v10, 0x1

    .line 929
    :try_start_f
    invoke-virtual {v7, v10}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 930
    .line 931
    .line 932
    move-result-object v11

    .line 933
    if-eqz v11, :cond_20

    .line 934
    .line 935
    invoke-static {v11}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 936
    .line 937
    .line 938
    move-result v10

    .line 939
    const/4 v11, 0x2

    .line 940
    invoke-virtual {v7, v11}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 941
    .line 942
    .line 943
    move-result-object v7

    .line 944
    if-eqz v7, :cond_1f

    .line 945
    .line 946
    invoke-static {v7}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 947
    .line 948
    .line 949
    move-result v7

    .line 950
    int-to-float v10, v10

    .line 951
    iget v11, v14, Ltg0;->a:I

    .line 952
    .line 953
    int-to-float v11, v11

    .line 954
    div-float/2addr v10, v11

    .line 955
    int-to-float v7, v7

    .line 956
    iget v0, v14, Ltg0;->b:I

    .line 957
    .line 958
    int-to-float v0, v0

    .line 959
    div-float v0, v7, v0

    .line 960
    .line 961
    move/from16 v35, v10

    .line 962
    .line 963
    goto :goto_16

    .line 964
    :cond_1f
    throw p2

    .line 965
    :cond_20
    throw p2
    :try_end_f
    .catch Ljava/lang/NumberFormatException; {:try_start_f .. :try_end_f} :catch_7
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_f .. :try_end_f} :catch_1
    .catch Ljava/io/IOException; {:try_start_f .. :try_end_f} :catch_0

    .line 966
    :catch_7
    :try_start_10
    invoke-virtual {v0, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 967
    .line 968
    .line 969
    move-result-object v0

    .line 970
    invoke-static {v0}, La30;->x(Ljava/lang/String;)V

    .line 971
    .line 972
    .line 973
    goto :goto_15

    .line 974
    :cond_21
    invoke-virtual {v12, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 975
    .line 976
    .line 977
    move-result-object v0

    .line 978
    invoke-static {v0}, La30;->x(Ljava/lang/String;)V

    .line 979
    .line 980
    .line 981
    goto :goto_15

    .line 982
    :cond_22
    move-object/from16 v46, v7

    .line 983
    .line 984
    move/from16 v47, v10

    .line 985
    .line 986
    move-object/from16 v45, v11

    .line 987
    .line 988
    const/4 v7, 0x0

    .line 989
    move v0, v7

    .line 990
    move/from16 v35, v0

    .line 991
    .line 992
    :goto_16
    invoke-static {v5, v13}, Lyb;->C(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Ljava/lang/String;

    .line 993
    .line 994
    .line 995
    move-result-object v7

    .line 996
    if-nez v7, :cond_23

    .line 997
    .line 998
    invoke-static {v5, v2}, Lyb;->C(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Ljava/lang/String;

    .line 999
    .line 1000
    .line 1001
    move-result-object v10

    .line 1002
    if-eqz v10, :cond_23

    .line 1003
    .line 1004
    invoke-virtual {v6, v10}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1005
    .line 1006
    .line 1007
    move-result-object v10

    .line 1008
    check-cast v10, Lkl1;

    .line 1009
    .line 1010
    if-eqz v10, :cond_23

    .line 1011
    .line 1012
    invoke-virtual {v10}, Lkl1;->b()Ljava/lang/String;

    .line 1013
    .line 1014
    .line 1015
    move-result-object v7

    .line 1016
    :cond_23
    if-eqz v7, :cond_2b

    .line 1017
    .line 1018
    invoke-virtual {v1, v7}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 1019
    .line 1020
    .line 1021
    move-result-object v1

    .line 1022
    invoke-virtual {v4, v7}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 1023
    .line 1024
    .line 1025
    move-result-object v7

    .line 1026
    invoke-virtual {v1}, Ljava/util/regex/Matcher;->matches()Z

    .line 1027
    .line 1028
    .line 1029
    move-result v10
    :try_end_10
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_10 .. :try_end_10} :catch_1
    .catch Ljava/io/IOException; {:try_start_10 .. :try_end_10} :catch_0

    .line 1030
    if-eqz v10, :cond_26

    .line 1031
    .line 1032
    const/4 v10, 0x1

    .line 1033
    :try_start_11
    invoke-virtual {v1, v10}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 1034
    .line 1035
    .line 1036
    move-result-object v7

    .line 1037
    if-eqz v7, :cond_25

    .line 1038
    .line 1039
    invoke-static {v7}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    .line 1040
    .line 1041
    .line 1042
    move-result v7

    .line 1043
    div-float v7, v7, v29

    .line 1044
    .line 1045
    const/4 v15, 0x2

    .line 1046
    invoke-virtual {v1, v15}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 1047
    .line 1048
    .line 1049
    move-result-object v1

    .line 1050
    if-eqz v1, :cond_24

    .line 1051
    .line 1052
    invoke-static {v1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    .line 1053
    .line 1054
    .line 1055
    move-result v1

    .line 1056
    div-float v1, v1, v29

    .line 1057
    .line 1058
    move/from16 v40, v1

    .line 1059
    .line 1060
    move/from16 v39, v7

    .line 1061
    .line 1062
    goto :goto_17

    .line 1063
    :cond_24
    throw p2

    .line 1064
    :cond_25
    throw p2
    :try_end_11
    .catch Ljava/lang/NumberFormatException; {:try_start_11 .. :try_end_11} :catch_8
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_11 .. :try_end_11} :catch_1
    .catch Ljava/io/IOException; {:try_start_11 .. :try_end_11} :catch_0

    .line 1065
    :catch_8
    :try_start_12
    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 1066
    .line 1067
    .line 1068
    move-result-object v0

    .line 1069
    invoke-virtual {v9, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1070
    .line 1071
    .line 1072
    move-result-object v0

    .line 1073
    invoke-static {v0}, La30;->x(Ljava/lang/String;)V

    .line 1074
    .line 1075
    .line 1076
    goto/16 :goto_15

    .line 1077
    .line 1078
    :cond_26
    invoke-virtual {v7}, Ljava/util/regex/Matcher;->matches()Z

    .line 1079
    .line 1080
    .line 1081
    move-result v1

    .line 1082
    if-eqz v1, :cond_2a

    .line 1083
    .line 1084
    if-nez v14, :cond_27

    .line 1085
    .line 1086
    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 1087
    .line 1088
    .line 1089
    move-result-object v0

    .line 1090
    invoke-virtual {v15, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1091
    .line 1092
    .line 1093
    move-result-object v0

    .line 1094
    invoke-static {v0}, La30;->x(Ljava/lang/String;)V
    :try_end_12
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_12 .. :try_end_12} :catch_1
    .catch Ljava/io/IOException; {:try_start_12 .. :try_end_12} :catch_0

    .line 1095
    .line 1096
    .line 1097
    goto/16 :goto_15

    .line 1098
    .line 1099
    :cond_27
    const/4 v10, 0x1

    .line 1100
    :try_start_13
    invoke-virtual {v7, v10}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 1101
    .line 1102
    .line 1103
    move-result-object v1

    .line 1104
    if-eqz v1, :cond_29

    .line 1105
    .line 1106
    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 1107
    .line 1108
    .line 1109
    move-result v1

    .line 1110
    const/4 v15, 0x2

    .line 1111
    invoke-virtual {v7, v15}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 1112
    .line 1113
    .line 1114
    move-result-object v7

    .line 1115
    if-eqz v7, :cond_28

    .line 1116
    .line 1117
    invoke-static {v7}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 1118
    .line 1119
    .line 1120
    move-result v7

    .line 1121
    int-to-float v1, v1

    .line 1122
    iget v8, v14, Ltg0;->a:I

    .line 1123
    .line 1124
    int-to-float v8, v8

    .line 1125
    div-float/2addr v1, v8

    .line 1126
    int-to-float v7, v7

    .line 1127
    iget v3, v14, Ltg0;->b:I

    .line 1128
    .line 1129
    int-to-float v3, v3

    .line 1130
    div-float v3, v7, v3

    .line 1131
    .line 1132
    move/from16 v39, v1

    .line 1133
    .line 1134
    move/from16 v40, v3

    .line 1135
    .line 1136
    goto :goto_17

    .line 1137
    :cond_28
    throw p2

    .line 1138
    :cond_29
    throw p2
    :try_end_13
    .catch Ljava/lang/NumberFormatException; {:try_start_13 .. :try_end_13} :catch_9
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_13 .. :try_end_13} :catch_1
    .catch Ljava/io/IOException; {:try_start_13 .. :try_end_13} :catch_0

    .line 1139
    :catch_9
    :try_start_14
    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 1140
    .line 1141
    .line 1142
    move-result-object v0

    .line 1143
    invoke-virtual {v9, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1144
    .line 1145
    .line 1146
    move-result-object v0

    .line 1147
    invoke-static {v0}, La30;->x(Ljava/lang/String;)V

    .line 1148
    .line 1149
    .line 1150
    goto/16 :goto_15

    .line 1151
    .line 1152
    :cond_2a
    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 1153
    .line 1154
    .line 1155
    move-result-object v0

    .line 1156
    invoke-virtual {v8, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1157
    .line 1158
    .line 1159
    move-result-object v0

    .line 1160
    invoke-static {v0}, La30;->x(Ljava/lang/String;)V

    .line 1161
    .line 1162
    .line 1163
    goto/16 :goto_15

    .line 1164
    .line 1165
    :cond_2b
    move/from16 v39, v23

    .line 1166
    .line 1167
    move/from16 v40, v39

    .line 1168
    .line 1169
    :goto_17
    const-string v1, "displayAlign"

    .line 1170
    .line 1171
    invoke-static {v5, v1}, Lyb;->C(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Ljava/lang/String;

    .line 1172
    .line 1173
    .line 1174
    move-result-object v1

    .line 1175
    if-eqz v1, :cond_2e

    .line 1176
    .line 1177
    invoke-static {v1}, Lum;->D(Ljava/lang/String;)Ljava/lang/String;

    .line 1178
    .line 1179
    .line 1180
    move-result-object v1

    .line 1181
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 1182
    .line 1183
    .line 1184
    move-result v3
    :try_end_14
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_14 .. :try_end_14} :catch_1
    .catch Ljava/io/IOException; {:try_start_14 .. :try_end_14} :catch_0

    .line 1185
    const v7, -0x514d33ab

    .line 1186
    .line 1187
    .line 1188
    if-eq v3, v7, :cond_2d

    .line 1189
    .line 1190
    const v7, 0x58705dc

    .line 1191
    .line 1192
    .line 1193
    if-eq v3, v7, :cond_2c

    .line 1194
    .line 1195
    goto :goto_18

    .line 1196
    :cond_2c
    const-string v3, "after"

    .line 1197
    .line 1198
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1199
    .line 1200
    .line 1201
    move-result v1

    .line 1202
    if-eqz v1, :cond_2e

    .line 1203
    .line 1204
    add-float v0, v0, v40

    .line 1205
    .line 1206
    move/from16 v36, v0

    .line 1207
    .line 1208
    move/from16 v1, v47

    .line 1209
    .line 1210
    const/16 v38, 0x2

    .line 1211
    .line 1212
    goto :goto_19

    .line 1213
    :cond_2d
    const-string v3, "center"

    .line 1214
    .line 1215
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1216
    .line 1217
    .line 1218
    move-result v1

    .line 1219
    if-eqz v1, :cond_2e

    .line 1220
    .line 1221
    const/high16 v1, 0x40000000    # 2.0f

    .line 1222
    .line 1223
    div-float v1, v40, v1

    .line 1224
    .line 1225
    add-float/2addr v0, v1

    .line 1226
    move/from16 v36, v0

    .line 1227
    .line 1228
    move/from16 v1, v47

    .line 1229
    .line 1230
    const/16 v38, 0x1

    .line 1231
    .line 1232
    goto :goto_19

    .line 1233
    :cond_2e
    :goto_18
    move/from16 v36, v0

    .line 1234
    .line 1235
    move/from16 v1, v47

    .line 1236
    .line 1237
    const/16 v38, 0x0

    .line 1238
    .line 1239
    :goto_19
    int-to-float v0, v1

    .line 1240
    div-float v42, v23, v0

    .line 1241
    .line 1242
    :try_start_15
    const-string v0, "writingMode"

    .line 1243
    .line 1244
    invoke-static {v5, v0}, Lyb;->C(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Ljava/lang/String;

    .line 1245
    .line 1246
    .line 1247
    move-result-object v0

    .line 1248
    const/high16 v15, -0x80000000

    .line 1249
    .line 1250
    if-eqz v0, :cond_32

    .line 1251
    .line 1252
    invoke-static {v0}, Lum;->D(Ljava/lang/String;)Ljava/lang/String;

    .line 1253
    .line 1254
    .line 1255
    move-result-object v0

    .line 1256
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 1257
    .line 1258
    .line 1259
    move-result v3
    :try_end_15
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_15 .. :try_end_15} :catch_1
    .catch Ljava/io/IOException; {:try_start_15 .. :try_end_15} :catch_0

    .line 1260
    const/16 v7, 0xe6e

    .line 1261
    .line 1262
    if-eq v3, v7, :cond_31

    .line 1263
    .line 1264
    const v7, 0x363874

    .line 1265
    .line 1266
    .line 1267
    if-eq v3, v7, :cond_30

    .line 1268
    .line 1269
    const v7, 0x363928

    .line 1270
    .line 1271
    .line 1272
    if-eq v3, v7, :cond_2f

    .line 1273
    .line 1274
    goto :goto_1b

    .line 1275
    :cond_2f
    const-string v3, "tbrl"

    .line 1276
    .line 1277
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1278
    .line 1279
    .line 1280
    move-result v0

    .line 1281
    if-eqz v0, :cond_32

    .line 1282
    .line 1283
    const/16 v43, 0x1

    .line 1284
    .line 1285
    goto :goto_1c

    .line 1286
    :cond_30
    const-string v3, "tblr"

    .line 1287
    .line 1288
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1289
    .line 1290
    .line 1291
    move-result v0

    .line 1292
    if-eqz v0, :cond_32

    .line 1293
    .line 1294
    goto :goto_1a

    .line 1295
    :cond_31
    const-string v3, "tb"

    .line 1296
    .line 1297
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1298
    .line 1299
    .line 1300
    move-result v0

    .line 1301
    if-eqz v0, :cond_32

    .line 1302
    .line 1303
    :goto_1a
    const/16 v43, 0x2

    .line 1304
    .line 1305
    goto :goto_1c

    .line 1306
    :cond_32
    :goto_1b
    move/from16 v43, v15

    .line 1307
    .line 1308
    :goto_1c
    :try_start_16
    new-instance v33, Ljl1;

    .line 1309
    .line 1310
    const/16 v37, 0x0

    .line 1311
    .line 1312
    const/16 v41, 0x1

    .line 1313
    .line 1314
    invoke-direct/range {v33 .. v43}, Ljl1;-><init>(Ljava/lang/String;FFIIFFIFI)V

    .line 1315
    .line 1316
    .line 1317
    move-object/from16 v0, v33

    .line 1318
    .line 1319
    :goto_1d
    if-eqz v0, :cond_33

    .line 1320
    .line 1321
    iget-object v3, v0, Ljl1;->a:Ljava/lang/String;

    .line 1322
    .line 1323
    move-object/from16 v7, v46

    .line 1324
    .line 1325
    invoke-virtual {v7, v3, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1326
    .line 1327
    .line 1328
    :goto_1e
    move-object/from16 v3, v17

    .line 1329
    .line 1330
    move-object/from16 v11, v32

    .line 1331
    .line 1332
    move-object/from16 v8, v44

    .line 1333
    .line 1334
    move-object/from16 v0, v45

    .line 1335
    .line 1336
    goto :goto_22

    .line 1337
    :cond_33
    move-object/from16 v7, v46

    .line 1338
    .line 1339
    goto :goto_1e

    .line 1340
    :cond_34
    move-object/from16 v44, v1

    .line 1341
    .line 1342
    move-object/from16 v32, v8

    .line 1343
    .line 1344
    move v1, v10

    .line 1345
    move-object v0, v11

    .line 1346
    move-object/from16 v31, v15

    .line 1347
    .line 1348
    invoke-static {v5, v0}, Lyb;->B(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 1349
    .line 1350
    .line 1351
    move-result v8

    .line 1352
    if-eqz v8, :cond_37

    .line 1353
    .line 1354
    :goto_1f
    invoke-interface {v5}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 1355
    .line 1356
    .line 1357
    move-object/from16 v8, v44

    .line 1358
    .line 1359
    invoke-static {v5, v8}, Lyb;->B(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 1360
    .line 1361
    .line 1362
    move-result v9

    .line 1363
    if-eqz v9, :cond_35

    .line 1364
    .line 1365
    invoke-static {v5, v3}, Lyb;->C(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Ljava/lang/String;

    .line 1366
    .line 1367
    .line 1368
    move-result-object v9

    .line 1369
    if-eqz v9, :cond_35

    .line 1370
    .line 1371
    invoke-interface {v5}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    .line 1372
    .line 1373
    .line 1374
    move-result-object v10

    .line 1375
    move-object/from16 v11, v32

    .line 1376
    .line 1377
    invoke-virtual {v11, v9, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1378
    .line 1379
    .line 1380
    goto :goto_20

    .line 1381
    :cond_35
    move-object/from16 v11, v32

    .line 1382
    .line 1383
    :goto_20
    invoke-static {v5, v0}, Lyb;->y(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 1384
    .line 1385
    .line 1386
    move-result v9

    .line 1387
    if-eqz v9, :cond_36

    .line 1388
    .line 1389
    :goto_21
    move-object/from16 v3, v17

    .line 1390
    .line 1391
    goto :goto_22

    .line 1392
    :cond_36
    move-object/from16 v44, v8

    .line 1393
    .line 1394
    move-object/from16 v32, v11

    .line 1395
    .line 1396
    goto :goto_1f

    .line 1397
    :cond_37
    move-object/from16 v11, v32

    .line 1398
    .line 1399
    move-object/from16 v8, v44

    .line 1400
    .line 1401
    goto :goto_21

    .line 1402
    :goto_22
    invoke-static {v5, v3}, Lyb;->y(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 1403
    .line 1404
    .line 1405
    move-result v9
    :try_end_16
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_16 .. :try_end_16} :catch_1
    .catch Ljava/io/IOException; {:try_start_16 .. :try_end_16} :catch_0

    .line 1406
    if-eqz v9, :cond_38

    .line 1407
    .line 1408
    move-object/from16 v4, v16

    .line 1409
    .line 1410
    move-object/from16 v3, v26

    .line 1411
    .line 1412
    goto/16 :goto_2f

    .line 1413
    .line 1414
    :cond_38
    move v10, v1

    .line 1415
    move-object v9, v3

    .line 1416
    move-object v1, v8

    .line 1417
    move-object v8, v11

    .line 1418
    move-object/from16 v12, v18

    .line 1419
    .line 1420
    move-object/from16 v3, v30

    .line 1421
    .line 1422
    move-object/from16 v15, v31

    .line 1423
    .line 1424
    const/16 p3, 0x0

    .line 1425
    .line 1426
    move-object v11, v0

    .line 1427
    goto/16 :goto_10

    .line 1428
    .line 1429
    :cond_39
    move-object/from16 v30, v3

    .line 1430
    .line 1431
    move-object v11, v8

    .line 1432
    move v1, v10

    .line 1433
    move-object/from16 v18, v12

    .line 1434
    .line 1435
    move-object/from16 v31, v15

    .line 1436
    .line 1437
    :try_start_17
    invoke-interface {v5}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeCount()I

    .line 1438
    .line 1439
    .line 1440
    move-result v0

    .line 1441
    move-object/from16 v3, p2

    .line 1442
    .line 1443
    invoke-static {v5, v3}, Lil1;->b(Lorg/xmlpull/v1/XmlPullParser;Lkl1;)Lkl1;

    .line 1444
    .line 1445
    .line 1446
    move-result-object v37

    .line 1447
    move-object/from16 v39, v21

    .line 1448
    .line 1449
    const/4 v9, 0x0

    .line 1450
    const-wide v12, -0x7fffffffffffffffL    # -4.9E-324

    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    const-wide v22, -0x7fffffffffffffffL    # -4.9E-324

    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    const-wide v32, -0x7fffffffffffffffL    # -4.9E-324

    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    const/16 v38, 0x0

    .line 1466
    .line 1467
    const/16 v40, 0x0

    .line 1468
    .line 1469
    :goto_23
    if-ge v9, v0, :cond_40

    .line 1470
    .line 1471
    invoke-interface {v5, v9}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeName(I)Ljava/lang/String;

    .line 1472
    .line 1473
    .line 1474
    move-result-object v8

    .line 1475
    invoke-interface {v5, v9}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(I)Ljava/lang/String;

    .line 1476
    .line 1477
    .line 1478
    move-result-object v10

    .line 1479
    invoke-virtual {v8}, Ljava/lang/String;->hashCode()I

    .line 1480
    .line 1481
    .line 1482
    move-result v15
    :try_end_17
    .catch Lik1; {:try_start_17 .. :try_end_17} :catch_a
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_17 .. :try_end_17} :catch_1
    .catch Ljava/io/IOException; {:try_start_17 .. :try_end_17} :catch_0

    .line 1483
    sparse-switch v15, :sswitch_data_0

    .line 1484
    .line 1485
    .line 1486
    goto :goto_24

    .line 1487
    :sswitch_0
    const-string v15, "backgroundImage"

    .line 1488
    .line 1489
    invoke-virtual {v8, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1490
    .line 1491
    .line 1492
    move-result v8

    .line 1493
    if-eqz v8, :cond_3a

    .line 1494
    .line 1495
    :try_start_18
    const-string v8, "#"

    .line 1496
    .line 1497
    invoke-virtual {v10, v8}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 1498
    .line 1499
    .line 1500
    move-result v8
    :try_end_18
    .catch Lik1; {:try_start_18 .. :try_end_18} :catch_b
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_18 .. :try_end_18} :catch_1
    .catch Ljava/io/IOException; {:try_start_18 .. :try_end_18} :catch_0

    .line 1501
    if-eqz v8, :cond_3a

    .line 1502
    .line 1503
    const/4 v15, 0x1

    .line 1504
    :try_start_19
    invoke-virtual {v10, v15}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 1505
    .line 1506
    .line 1507
    move-result-object v8
    :try_end_19
    .catch Lik1; {:try_start_19 .. :try_end_19} :catch_a
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_19 .. :try_end_19} :catch_1
    .catch Ljava/io/IOException; {:try_start_19 .. :try_end_19} :catch_0

    .line 1508
    move-object/from16 v40, v8

    .line 1509
    .line 1510
    :cond_3a
    :goto_24
    move-object/from16 v4, v16

    .line 1511
    .line 1512
    move-object/from16 v3, v18

    .line 1513
    .line 1514
    move-object/from16 v15, v31

    .line 1515
    .line 1516
    const-wide v34, -0x7fffffffffffffffL    # -4.9E-324

    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    goto/16 :goto_2a

    .line 1522
    .line 1523
    :catch_a
    move-exception v0

    .line 1524
    :goto_25
    move-object/from16 v4, v16

    .line 1525
    .line 1526
    :goto_26
    move-object/from16 v3, v26

    .line 1527
    .line 1528
    goto/16 :goto_32

    .line 1529
    .line 1530
    :catch_b
    move-exception v0

    .line 1531
    const/4 v15, 0x1

    .line 1532
    goto :goto_25

    .line 1533
    :sswitch_1
    const/4 v15, 0x1

    .line 1534
    invoke-virtual {v8, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1535
    .line 1536
    .line 1537
    move-result v8

    .line 1538
    if-eqz v8, :cond_3e

    .line 1539
    .line 1540
    :try_start_1a
    invoke-virtual {v10}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 1541
    .line 1542
    .line 1543
    move-result-object v8

    .line 1544
    invoke-virtual {v8}, Ljava/lang/String;->isEmpty()Z

    .line 1545
    .line 1546
    .line 1547
    move-result v10
    :try_end_1a
    .catch Lik1; {:try_start_1a .. :try_end_1a} :catch_c
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_1a .. :try_end_1a} :catch_1
    .catch Ljava/io/IOException; {:try_start_1a .. :try_end_1a} :catch_0

    .line 1548
    if-eqz v10, :cond_3b

    .line 1549
    .line 1550
    const/4 v10, 0x0

    .line 1551
    :try_start_1b
    new-array v8, v10, [Ljava/lang/String;

    .line 1552
    .line 1553
    move-object/from16 v3, v18

    .line 1554
    .line 1555
    const-wide v34, -0x7fffffffffffffffL    # -4.9E-324

    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    goto :goto_27

    .line 1561
    :cond_3b
    const/4 v10, 0x0

    .line 1562
    sget-object v17, Lv23;->a:Ljava/lang/String;

    .line 1563
    .line 1564
    move-object/from16 v3, v18

    .line 1565
    .line 1566
    const/4 v4, -0x1

    .line 1567
    const-wide v34, -0x7fffffffffffffffL    # -4.9E-324

    .line 1568
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    invoke-virtual {v8, v3, v4}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    .line 1573
    .line 1574
    .line 1575
    move-result-object v8

    .line 1576
    :goto_27
    array-length v4, v8
    :try_end_1b
    .catch Lik1; {:try_start_1b .. :try_end_1b} :catch_a
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_1b .. :try_end_1b} :catch_1
    .catch Ljava/io/IOException; {:try_start_1b .. :try_end_1b} :catch_0

    .line 1577
    if-lez v4, :cond_3c

    .line 1578
    .line 1579
    move-object/from16 v38, v8

    .line 1580
    .line 1581
    :cond_3c
    :goto_28
    move-object/from16 v4, v16

    .line 1582
    .line 1583
    :cond_3d
    :goto_29
    move-object/from16 v15, v31

    .line 1584
    .line 1585
    goto/16 :goto_2a

    .line 1586
    .line 1587
    :catch_c
    move-exception v0

    .line 1588
    const/4 v10, 0x0

    .line 1589
    goto :goto_25

    .line 1590
    :cond_3e
    move-object/from16 v3, v18

    .line 1591
    .line 1592
    const-wide v34, -0x7fffffffffffffffL    # -4.9E-324

    .line 1593
    .line 1594
    .line 1595
    .line 1596
    .line 1597
    goto :goto_28

    .line 1598
    :sswitch_2
    move-object/from16 v3, v18

    .line 1599
    .line 1600
    const/4 v15, 0x1

    .line 1601
    const-wide v34, -0x7fffffffffffffffL    # -4.9E-324

    .line 1602
    .line 1603
    .line 1604
    .line 1605
    .line 1606
    const-string v4, "begin"

    .line 1607
    .line 1608
    invoke-virtual {v8, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1609
    .line 1610
    .line 1611
    move-result v4

    .line 1612
    if-eqz v4, :cond_3c

    .line 1613
    .line 1614
    move-object/from16 v4, v16

    .line 1615
    .line 1616
    :try_start_1c
    invoke-static {v10, v4}, Lil1;->e(Ljava/lang/String;Lhl1;)J

    .line 1617
    .line 1618
    .line 1619
    move-result-wide v22
    :try_end_1c
    .catch Lik1; {:try_start_1c .. :try_end_1c} :catch_d
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_1c .. :try_end_1c} :catch_1
    .catch Ljava/io/IOException; {:try_start_1c .. :try_end_1c} :catch_0

    .line 1620
    goto :goto_29

    .line 1621
    :catch_d
    move-exception v0

    .line 1622
    goto :goto_26

    .line 1623
    :sswitch_3
    move-object/from16 v4, v16

    .line 1624
    .line 1625
    move-object/from16 v3, v18

    .line 1626
    .line 1627
    const-wide v34, -0x7fffffffffffffffL    # -4.9E-324

    .line 1628
    .line 1629
    .line 1630
    .line 1631
    .line 1632
    const-string v15, "end"

    .line 1633
    .line 1634
    invoke-virtual {v8, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1635
    .line 1636
    .line 1637
    move-result v8

    .line 1638
    if-eqz v8, :cond_3d

    .line 1639
    .line 1640
    :try_start_1d
    invoke-static {v10, v4}, Lil1;->e(Ljava/lang/String;Lhl1;)J

    .line 1641
    .line 1642
    .line 1643
    move-result-wide v12
    :try_end_1d
    .catch Lik1; {:try_start_1d .. :try_end_1d} :catch_d
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_1d .. :try_end_1d} :catch_1
    .catch Ljava/io/IOException; {:try_start_1d .. :try_end_1d} :catch_0

    .line 1644
    goto :goto_29

    .line 1645
    :sswitch_4
    move-object/from16 v4, v16

    .line 1646
    .line 1647
    move-object/from16 v3, v18

    .line 1648
    .line 1649
    const-wide v34, -0x7fffffffffffffffL    # -4.9E-324

    .line 1650
    .line 1651
    .line 1652
    .line 1653
    .line 1654
    const-string v15, "dur"

    .line 1655
    .line 1656
    invoke-virtual {v8, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1657
    .line 1658
    .line 1659
    move-result v8

    .line 1660
    if-eqz v8, :cond_3d

    .line 1661
    .line 1662
    :try_start_1e
    invoke-static {v10, v4}, Lil1;->e(Ljava/lang/String;Lhl1;)J

    .line 1663
    .line 1664
    .line 1665
    move-result-wide v32
    :try_end_1e
    .catch Lik1; {:try_start_1e .. :try_end_1e} :catch_d
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_1e .. :try_end_1e} :catch_1
    .catch Ljava/io/IOException; {:try_start_1e .. :try_end_1e} :catch_0

    .line 1666
    goto :goto_29

    .line 1667
    :sswitch_5
    move-object/from16 v4, v16

    .line 1668
    .line 1669
    move-object/from16 v3, v18

    .line 1670
    .line 1671
    move-object/from16 v15, v31

    .line 1672
    .line 1673
    const-wide v34, -0x7fffffffffffffffL    # -4.9E-324

    .line 1674
    .line 1675
    .line 1676
    .line 1677
    .line 1678
    invoke-virtual {v8, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1679
    .line 1680
    .line 1681
    move-result v8

    .line 1682
    if-eqz v8, :cond_3f

    .line 1683
    .line 1684
    :try_start_1f
    invoke-virtual {v7, v10}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 1685
    .line 1686
    .line 1687
    move-result v8

    .line 1688
    if-eqz v8, :cond_3f

    .line 1689
    .line 1690
    move-object/from16 v39, v10

    .line 1691
    .line 1692
    :cond_3f
    :goto_2a
    add-int/lit8 v9, v9, 0x1

    .line 1693
    .line 1694
    move-object/from16 v18, v3

    .line 1695
    .line 1696
    move-object/from16 v16, v4

    .line 1697
    .line 1698
    move-object/from16 v31, v15

    .line 1699
    .line 1700
    goto/16 :goto_23

    .line 1701
    .line 1702
    :cond_40
    move-object/from16 v4, v16

    .line 1703
    .line 1704
    const-wide v34, -0x7fffffffffffffffL    # -4.9E-324

    .line 1705
    .line 1706
    .line 1707
    .line 1708
    .line 1709
    if-eqz v29, :cond_44

    .line 1710
    .line 1711
    move-object/from16 v2, v29

    .line 1712
    .line 1713
    iget-wide v8, v2, Lgl1;->d:J

    .line 1714
    .line 1715
    cmp-long v0, v8, v34

    .line 1716
    .line 1717
    if-eqz v0, :cond_42

    .line 1718
    .line 1719
    cmp-long v0, v22, v34

    .line 1720
    .line 1721
    if-eqz v0, :cond_41

    .line 1722
    .line 1723
    add-long v22, v22, v8

    .line 1724
    .line 1725
    goto :goto_2b

    .line 1726
    :cond_41
    move-wide/from16 v22, v34

    .line 1727
    .line 1728
    :goto_2b
    cmp-long v0, v12, v34

    .line 1729
    .line 1730
    if-eqz v0, :cond_43

    .line 1731
    .line 1732
    add-long/2addr v12, v8

    .line 1733
    :cond_42
    move-object v0, v2

    .line 1734
    goto :goto_2c

    .line 1735
    :cond_43
    move-object v0, v2

    .line 1736
    move-wide/from16 v12, v34

    .line 1737
    .line 1738
    goto :goto_2c

    .line 1739
    :cond_44
    move-object/from16 v2, v29

    .line 1740
    .line 1741
    const/4 v0, 0x0

    .line 1742
    :goto_2c
    cmp-long v3, v12, v34

    .line 1743
    .line 1744
    if-nez v3, :cond_47

    .line 1745
    .line 1746
    cmp-long v3, v32, v34

    .line 1747
    .line 1748
    if-eqz v3, :cond_45

    .line 1749
    .line 1750
    add-long v8, v22, v32

    .line 1751
    .line 1752
    :goto_2d
    move-wide/from16 v35, v8

    .line 1753
    .line 1754
    goto :goto_2e

    .line 1755
    :cond_45
    if-eqz v0, :cond_46

    .line 1756
    .line 1757
    iget-wide v8, v0, Lgl1;->e:J

    .line 1758
    .line 1759
    cmp-long v3, v8, v34

    .line 1760
    .line 1761
    if-eqz v3, :cond_46

    .line 1762
    .line 1763
    goto :goto_2d

    .line 1764
    :cond_46
    move-wide/from16 v35, v34

    .line 1765
    .line 1766
    goto :goto_2e

    .line 1767
    :cond_47
    move-wide/from16 v35, v12

    .line 1768
    .line 1769
    :goto_2e
    invoke-interface {v5}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    .line 1770
    .line 1771
    .line 1772
    move-result-object v32

    .line 1773
    move-object/from16 v41, v0

    .line 1774
    .line 1775
    move-wide/from16 v33, v22

    .line 1776
    .line 1777
    invoke-static/range {v32 .. v41}, Lgl1;->b(Ljava/lang/String;JJLkl1;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lgl1;)Lgl1;

    .line 1778
    .line 1779
    .line 1780
    move-result-object v0
    :try_end_1f
    .catch Lik1; {:try_start_1f .. :try_end_1f} :catch_d
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_1f .. :try_end_1f} :catch_1
    .catch Ljava/io/IOException; {:try_start_1f .. :try_end_1f} :catch_0

    .line 1781
    move-object/from16 v3, v26

    .line 1782
    .line 1783
    :try_start_20
    invoke-virtual {v3, v0}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    .line 1784
    .line 1785
    .line 1786
    if-eqz v2, :cond_49

    .line 1787
    .line 1788
    iget-object v8, v2, Lgl1;->m:Ljava/util/ArrayList;

    .line 1789
    .line 1790
    if-nez v8, :cond_48

    .line 1791
    .line 1792
    new-instance v8, Ljava/util/ArrayList;

    .line 1793
    .line 1794
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 1795
    .line 1796
    .line 1797
    iput-object v8, v2, Lgl1;->m:Ljava/util/ArrayList;

    .line 1798
    .line 1799
    :cond_48
    iget-object v2, v2, Lgl1;->m:Ljava/util/ArrayList;

    .line 1800
    .line 1801
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_20
    .catch Lik1; {:try_start_20 .. :try_end_20} :catch_e
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_20 .. :try_end_20} :catch_1
    .catch Ljava/io/IOException; {:try_start_20 .. :try_end_20} :catch_0

    .line 1802
    .line 1803
    .line 1804
    :cond_49
    :goto_2f
    move/from16 v18, v1

    .line 1805
    .line 1806
    move-object/from16 v16, v4

    .line 1807
    .line 1808
    move-object/from16 v17, v14

    .line 1809
    .line 1810
    :cond_4a
    :goto_30
    move-object/from16 v14, v24

    .line 1811
    .line 1812
    :goto_31
    move/from16 v15, v25

    .line 1813
    .line 1814
    goto/16 :goto_35

    .line 1815
    .line 1816
    :catch_e
    move-exception v0

    .line 1817
    :goto_32
    :try_start_21
    const-string v2, "Suppressing parser error"

    .line 1818
    .line 1819
    invoke-static {v2, v0}, La30;->z(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1820
    .line 1821
    .line 1822
    move/from16 v18, v1

    .line 1823
    .line 1824
    move-object/from16 v16, v4

    .line 1825
    .line 1826
    move-object/from16 v17, v14

    .line 1827
    .line 1828
    move-object/from16 v14, v24

    .line 1829
    .line 1830
    goto/16 :goto_e

    .line 1831
    .line 1832
    :cond_4b
    move-object/from16 v27, v2

    .line 1833
    .line 1834
    move-object/from16 v30, v3

    .line 1835
    .line 1836
    move-object v2, v9

    .line 1837
    move-object v3, v10

    .line 1838
    move-object/from16 v28, v11

    .line 1839
    .line 1840
    move-object/from16 v24, v14

    .line 1841
    .line 1842
    move/from16 v25, v15

    .line 1843
    .line 1844
    move-object v11, v8

    .line 1845
    const/4 v4, 0x4

    .line 1846
    if-ne v0, v4, :cond_4e

    .line 1847
    .line 1848
    if-eqz v2, :cond_4d

    .line 1849
    .line 1850
    invoke-interface {v5}, Lorg/xmlpull/v1/XmlPullParser;->getText()Ljava/lang/String;

    .line 1851
    .line 1852
    .line 1853
    move-result-object v0

    .line 1854
    invoke-static {v0}, Lgl1;->a(Ljava/lang/String;)Lgl1;

    .line 1855
    .line 1856
    .line 1857
    move-result-object v0

    .line 1858
    iget-object v1, v2, Lgl1;->m:Ljava/util/ArrayList;

    .line 1859
    .line 1860
    if-nez v1, :cond_4c

    .line 1861
    .line 1862
    new-instance v1, Ljava/util/ArrayList;

    .line 1863
    .line 1864
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 1865
    .line 1866
    .line 1867
    iput-object v1, v2, Lgl1;->m:Ljava/util/ArrayList;

    .line 1868
    .line 1869
    :cond_4c
    iget-object v1, v2, Lgl1;->m:Ljava/util/ArrayList;

    .line 1870
    .line 1871
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1872
    .line 1873
    .line 1874
    goto :goto_30

    .line 1875
    :cond_4d
    const/4 v3, 0x0

    .line 1876
    throw v3

    .line 1877
    :cond_4e
    const/4 v2, 0x3

    .line 1878
    if-ne v0, v2, :cond_4a

    .line 1879
    .line 1880
    invoke-interface {v5}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    .line 1881
    .line 1882
    .line 1883
    move-result-object v0

    .line 1884
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1885
    .line 1886
    .line 1887
    move-result v0

    .line 1888
    if-eqz v0, :cond_50

    .line 1889
    .line 1890
    new-instance v14, Lg4;

    .line 1891
    .line 1892
    invoke-virtual {v3}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    .line 1893
    .line 1894
    .line 1895
    move-result-object v0

    .line 1896
    check-cast v0, Lgl1;

    .line 1897
    .line 1898
    if-eqz v0, :cond_4f

    .line 1899
    .line 1900
    invoke-direct {v14, v0, v6, v7, v11}, Lg4;-><init>(Lgl1;Ljava/util/HashMap;Ljava/util/HashMap;Ljava/util/HashMap;)V

    .line 1901
    .line 1902
    .line 1903
    goto :goto_33

    .line 1904
    :cond_4f
    const/4 v3, 0x0

    .line 1905
    throw v3

    .line 1906
    :cond_50
    move-object/from16 v14, v24

    .line 1907
    .line 1908
    :goto_33
    invoke-virtual {v3}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    .line 1909
    .line 1910
    .line 1911
    goto :goto_31

    .line 1912
    :cond_51
    move-object/from16 v21, v1

    .line 1913
    .line 1914
    move-object/from16 v27, v2

    .line 1915
    .line 1916
    move-object/from16 v30, v3

    .line 1917
    .line 1918
    move-object v3, v10

    .line 1919
    move-object/from16 v28, v11

    .line 1920
    .line 1921
    move-object/from16 v24, v14

    .line 1922
    .line 1923
    move/from16 v25, v15

    .line 1924
    .line 1925
    move-object v11, v8

    .line 1926
    move v15, v13

    .line 1927
    if-ne v0, v15, :cond_52

    .line 1928
    .line 1929
    add-int/lit8 v15, v25, 0x1

    .line 1930
    .line 1931
    :goto_34
    move-object/from16 v14, v24

    .line 1932
    .line 1933
    goto :goto_35

    .line 1934
    :cond_52
    const/4 v2, 0x3

    .line 1935
    if-ne v0, v2, :cond_4a

    .line 1936
    .line 1937
    add-int/lit8 v15, v25, -0x1

    .line 1938
    .line 1939
    goto :goto_34

    .line 1940
    :goto_35
    invoke-interface {v5}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 1941
    .line 1942
    .line 1943
    invoke-interface {v5}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    .line 1944
    .line 1945
    .line 1946
    move-result v0

    .line 1947
    move-object/from16 v4, p0

    .line 1948
    .line 1949
    move-object v10, v3

    .line 1950
    move-object v8, v11

    .line 1951
    move-object/from16 v1, v21

    .line 1952
    .line 1953
    move-object/from16 v2, v27

    .line 1954
    .line 1955
    move-object/from16 v11, v28

    .line 1956
    .line 1957
    move-object/from16 v3, v30

    .line 1958
    .line 1959
    const/4 v9, 0x0

    .line 1960
    goto/16 :goto_0

    .line 1961
    .line 1962
    :cond_53
    move-object/from16 v24, v14

    .line 1963
    .line 1964
    if-eqz v24, :cond_54

    .line 1965
    .line 1966
    return-object v24

    .line 1967
    :cond_54
    const/4 v3, 0x0

    .line 1968
    throw v3
    :try_end_21
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_21 .. :try_end_21} :catch_1
    .catch Ljava/io/IOException; {:try_start_21 .. :try_end_21} :catch_0

    .line 1969
    :goto_36
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 1970
    .line 1971
    const-string v2, "Unexpected error when reading input."

    .line 1972
    .line 1973
    invoke-direct {v1, v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1974
    .line 1975
    .line 1976
    throw v1

    .line 1977
    :goto_37
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 1978
    .line 1979
    const-string v2, "Unable to decode source"

    .line 1980
    .line 1981
    invoke-direct {v1, v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1982
    .line 1983
    .line 1984
    throw v1

    .line 1985
    :sswitch_data_0
    .sparse-switch
        -0x37b7d90c -> :sswitch_5
        0x18601 -> :sswitch_4
        0x188db -> :sswitch_3
        0x59478a9 -> :sswitch_2
        0x68b1db1 -> :sswitch_1
        0x4d0b70cd -> :sswitch_0
    .end sparse-switch
.end method

.method public final g([BIILlk1;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lil1;->a([BII)Lg4;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-static {p1, p4}, La30;->p(Lhk1;Llk1;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
