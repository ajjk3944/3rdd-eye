.class public abstract Lmo2;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# static fields
.field public static final a:[B

.field public static final b:[Ljava/lang/String;

.field public static final c:Ljava/util/regex/Pattern;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    const/4 v0, 0x4

    .line 2
    new-array v0, v0, [B

    .line 3
    .line 4
    fill-array-data v0, :array_0

    .line 5
    .line 6
    .line 7
    sput-object v0, Lmo2;->a:[B

    .line 8
    .line 9
    const-string v0, "B"

    .line 10
    .line 11
    const-string v1, "C"

    .line 12
    .line 13
    const-string v2, ""

    .line 14
    .line 15
    const-string v3, "A"

    .line 16
    .line 17
    filled-new-array {v2, v3, v0, v1}, [Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    sput-object v0, Lmo2;->b:[Ljava/lang/String;

    .line 22
    .line 23
    const-string v0, "^\\D?(\\d+)$"

    .line 24
    .line 25
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    sput-object v0, Lmo2;->c:Ljava/util/regex/Pattern;

    .line 30
    .line 31
    return-void

    .line 32
    nop

    .line 33
    :array_0
    .array-data 1
        0x0t
        0x0t
        0x0t
        0x1t
    .end array-data
.end method

.method public static a(IZII[II)Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    sget-object v1, Lmo2;->b:[Ljava/lang/String;

    .line 4
    .line 5
    aget-object p0, v1, p0

    .line 6
    .line 7
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 12
    .line 13
    .line 14
    move-result-object p3

    .line 15
    const/4 v1, 0x1

    .line 16
    if-eq v1, p1, :cond_0

    .line 17
    .line 18
    const/16 p1, 0x4c

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/16 p1, 0x48

    .line 22
    .line 23
    :goto_0
    invoke-static {p1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-static {p5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 28
    .line 29
    .line 30
    move-result-object p5

    .line 31
    filled-new-array {p0, p2, p3, p1, p5}, [Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    sget-object p1, Lv23;->a:Ljava/lang/String;

    .line 36
    .line 37
    sget-object p1, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 38
    .line 39
    const-string p2, "hvc1.%s%d.%X.%c%d"

    .line 40
    .line 41
    invoke-static {p1, p2, p0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    invoke-direct {v0, p0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    const/4 p0, 0x6

    .line 49
    :goto_1
    const/4 p1, 0x0

    .line 50
    if-lez p0, :cond_1

    .line 51
    .line 52
    add-int/lit8 p2, p0, -0x1

    .line 53
    .line 54
    aget p3, p4, p2

    .line 55
    .line 56
    if-nez p3, :cond_1

    .line 57
    .line 58
    move p0, p2

    .line 59
    goto :goto_1

    .line 60
    :cond_1
    :goto_2
    if-ge p1, p0, :cond_2

    .line 61
    .line 62
    aget p2, p4, p1

    .line 63
    .line 64
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 65
    .line 66
    .line 67
    move-result-object p2

    .line 68
    filled-new-array {p2}, [Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p2

    .line 72
    const-string p3, ".%02X"

    .line 73
    .line 74
    invoke-static {p3, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object p2

    .line 78
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    add-int/lit8 p1, p1, 0x1

    .line 82
    .line 83
    goto :goto_2

    .line 84
    :cond_2
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    return-object p0
.end method

.method public static b(Lph4;)Landroid/util/Pair;
    .locals 30

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/16 v1, 0x400

    .line 4
    .line 5
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    const/16 v3, 0x80

    .line 10
    .line 11
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 12
    .line 13
    .line 14
    move-result-object v4

    .line 15
    const/16 v5, 0x200

    .line 16
    .line 17
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 18
    .line 19
    .line 20
    move-result-object v6

    .line 21
    const/16 v7, 0x20

    .line 22
    .line 23
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 24
    .line 25
    .line 26
    move-result-object v8

    .line 27
    const/16 v9, 0x40

    .line 28
    .line 29
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 30
    .line 31
    .line 32
    move-result-object v10

    .line 33
    const/16 v11, 0x100

    .line 34
    .line 35
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 36
    .line 37
    .line 38
    move-result-object v12

    .line 39
    const/4 v13, 0x0

    .line 40
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 41
    .line 42
    .line 43
    move-result-object v14

    .line 44
    const/16 v15, 0x8

    .line 45
    .line 46
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 47
    .line 48
    .line 49
    move-result-object v16

    .line 50
    const/16 v1, 0x10

    .line 51
    .line 52
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 53
    .line 54
    .line 55
    move-result-object v17

    .line 56
    const/4 v3, 0x4

    .line 57
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 58
    .line 59
    .line 60
    move-result-object v18

    .line 61
    const/4 v5, 0x2

    .line 62
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 63
    .line 64
    .line 65
    move-result-object v19

    .line 66
    const/4 v7, 0x1

    .line 67
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 68
    .line 69
    .line 70
    move-result-object v9

    .line 71
    move/from16 v20, v11

    .line 72
    .line 73
    iget-object v11, v0, Lph4;->j:Ljava/lang/String;

    .line 74
    .line 75
    iget-object v15, v0, Lph4;->C:Ln74;

    .line 76
    .line 77
    const/16 v21, 0x0

    .line 78
    .line 79
    if-nez v11, :cond_0

    .line 80
    .line 81
    goto/16 :goto_17

    .line 82
    .line 83
    :cond_0
    move/from16 v22, v13

    .line 84
    .line 85
    const-string v13, "\\."

    .line 86
    .line 87
    invoke-virtual {v11, v13}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v13

    .line 91
    iget-object v0, v0, Lph4;->m:Ljava/lang/String;

    .line 92
    .line 93
    const-string v3, "video/dolby-vision"

    .line 94
    .line 95
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    const/16 v23, 0x1000

    .line 100
    .line 101
    const/16 p0, 0x800

    .line 102
    .line 103
    const/4 v3, 0x3

    .line 104
    if-eqz v0, :cond_a

    .line 105
    .line 106
    array-length v0, v13

    .line 107
    const-string v1, "Ignoring malformed Dolby Vision codec string: "

    .line 108
    .line 109
    if-ge v0, v3, :cond_1

    .line 110
    .line 111
    invoke-virtual {v1, v11}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    invoke-static {v0}, La30;->x(Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    return-object v21

    .line 119
    :cond_1
    sget-object v0, Lmo2;->c:Ljava/util/regex/Pattern;

    .line 120
    .line 121
    aget-object v3, v13, v7

    .line 122
    .line 123
    invoke-virtual {v0, v3}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->matches()Z

    .line 128
    .line 129
    .line 130
    move-result v3

    .line 131
    if-nez v3, :cond_2

    .line 132
    .line 133
    invoke-virtual {v1, v11}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    invoke-static {v0}, La30;->x(Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    return-object v21

    .line 141
    :cond_2
    invoke-virtual {v0, v7}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    const-string v1, "10"

    .line 146
    .line 147
    const-string v3, "01"

    .line 148
    .line 149
    const-string v7, "02"

    .line 150
    .line 151
    const-string v11, "03"

    .line 152
    .line 153
    const-string v14, "04"

    .line 154
    .line 155
    const-string v15, "05"

    .line 156
    .line 157
    move/from16 v24, v5

    .line 158
    .line 159
    const-string v5, "06"

    .line 160
    .line 161
    move-object/from16 v25, v2

    .line 162
    .line 163
    const-string v2, "07"

    .line 164
    .line 165
    move-object/from16 v26, v4

    .line 166
    .line 167
    const-string v4, "08"

    .line 168
    .line 169
    move-object/from16 v27, v6

    .line 170
    .line 171
    const-string v6, "09"

    .line 172
    .line 173
    if-nez v0, :cond_4

    .line 174
    .line 175
    move-object/from16 v28, v8

    .line 176
    .line 177
    move-object/from16 v29, v10

    .line 178
    .line 179
    :cond_3
    :goto_0
    move-object/from16 v8, v21

    .line 180
    .line 181
    goto/16 :goto_1

    .line 182
    .line 183
    :cond_4
    move-object/from16 v28, v8

    .line 184
    .line 185
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 186
    .line 187
    .line 188
    move-result v8

    .line 189
    move-object/from16 v29, v10

    .line 190
    .line 191
    const/16 v10, 0x61f

    .line 192
    .line 193
    if-eq v8, v10, :cond_5

    .line 194
    .line 195
    packed-switch v8, :pswitch_data_0

    .line 196
    .line 197
    .line 198
    goto :goto_0

    .line 199
    :pswitch_0
    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 200
    .line 201
    .line 202
    move-result v8

    .line 203
    if-eqz v8, :cond_3

    .line 204
    .line 205
    move-object/from16 v8, v27

    .line 206
    .line 207
    goto/16 :goto_1

    .line 208
    .line 209
    :pswitch_1
    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 210
    .line 211
    .line 212
    move-result v8

    .line 213
    if-eqz v8, :cond_3

    .line 214
    .line 215
    move-object v8, v12

    .line 216
    goto :goto_1

    .line 217
    :pswitch_2
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 218
    .line 219
    .line 220
    move-result v8

    .line 221
    if-eqz v8, :cond_3

    .line 222
    .line 223
    move-object/from16 v8, v26

    .line 224
    .line 225
    goto :goto_1

    .line 226
    :pswitch_3
    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 227
    .line 228
    .line 229
    move-result v8

    .line 230
    if-eqz v8, :cond_3

    .line 231
    .line 232
    move-object/from16 v8, v29

    .line 233
    .line 234
    goto :goto_1

    .line 235
    :pswitch_4
    invoke-virtual {v0, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 236
    .line 237
    .line 238
    move-result v8

    .line 239
    if-eqz v8, :cond_3

    .line 240
    .line 241
    move-object/from16 v8, v28

    .line 242
    .line 243
    goto :goto_1

    .line 244
    :pswitch_5
    invoke-virtual {v0, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 245
    .line 246
    .line 247
    move-result v8

    .line 248
    if-eqz v8, :cond_3

    .line 249
    .line 250
    move-object/from16 v8, v17

    .line 251
    .line 252
    goto :goto_1

    .line 253
    :pswitch_6
    invoke-virtual {v0, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 254
    .line 255
    .line 256
    move-result v8

    .line 257
    if-eqz v8, :cond_3

    .line 258
    .line 259
    move-object/from16 v8, v16

    .line 260
    .line 261
    goto :goto_1

    .line 262
    :pswitch_7
    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 263
    .line 264
    .line 265
    move-result v8

    .line 266
    if-eqz v8, :cond_3

    .line 267
    .line 268
    move-object/from16 v8, v18

    .line 269
    .line 270
    goto :goto_1

    .line 271
    :pswitch_8
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 272
    .line 273
    .line 274
    move-result v8

    .line 275
    if-eqz v8, :cond_3

    .line 276
    .line 277
    move-object/from16 v8, v19

    .line 278
    .line 279
    goto :goto_1

    .line 280
    :pswitch_9
    const-string v8, "00"

    .line 281
    .line 282
    invoke-virtual {v0, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 283
    .line 284
    .line 285
    move-result v8

    .line 286
    if-eqz v8, :cond_3

    .line 287
    .line 288
    move-object v8, v9

    .line 289
    goto :goto_1

    .line 290
    :cond_5
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 291
    .line 292
    .line 293
    move-result v8

    .line 294
    if-eqz v8, :cond_3

    .line 295
    .line 296
    move-object/from16 v8, v25

    .line 297
    .line 298
    :goto_1
    if-nez v8, :cond_6

    .line 299
    .line 300
    const-string v1, "Unknown Dolby Vision profile string: "

    .line 301
    .line 302
    invoke-static {v0, v1}, Lga1;->p(Ljava/lang/String;Ljava/lang/String;)V

    .line 303
    .line 304
    .line 305
    return-object v21

    .line 306
    :cond_6
    aget-object v0, v13, v24

    .line 307
    .line 308
    if-nez v0, :cond_8

    .line 309
    .line 310
    :cond_7
    :goto_2
    move-object/from16 v2, v21

    .line 311
    .line 312
    goto/16 :goto_3

    .line 313
    .line 314
    :cond_8
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 315
    .line 316
    .line 317
    move-result v10

    .line 318
    packed-switch v10, :pswitch_data_1

    .line 319
    .line 320
    .line 321
    packed-switch v10, :pswitch_data_2

    .line 322
    .line 323
    .line 324
    goto :goto_2

    .line 325
    :pswitch_a
    const-string v1, "13"

    .line 326
    .line 327
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 328
    .line 329
    .line 330
    move-result v1

    .line 331
    if-eqz v1, :cond_7

    .line 332
    .line 333
    invoke-static/range {v23 .. v23}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 334
    .line 335
    .line 336
    move-result-object v2

    .line 337
    goto/16 :goto_3

    .line 338
    .line 339
    :pswitch_b
    const-string v1, "12"

    .line 340
    .line 341
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 342
    .line 343
    .line 344
    move-result v1

    .line 345
    if-eqz v1, :cond_7

    .line 346
    .line 347
    invoke-static/range {p0 .. p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 348
    .line 349
    .line 350
    move-result-object v2

    .line 351
    goto/16 :goto_3

    .line 352
    .line 353
    :pswitch_c
    const-string v1, "11"

    .line 354
    .line 355
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 356
    .line 357
    .line 358
    move-result v1

    .line 359
    if-eqz v1, :cond_7

    .line 360
    .line 361
    move-object/from16 v2, v25

    .line 362
    .line 363
    goto/16 :goto_3

    .line 364
    .line 365
    :pswitch_d
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 366
    .line 367
    .line 368
    move-result v1

    .line 369
    if-eqz v1, :cond_7

    .line 370
    .line 371
    move-object/from16 v2, v27

    .line 372
    .line 373
    goto :goto_3

    .line 374
    :pswitch_e
    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 375
    .line 376
    .line 377
    move-result v1

    .line 378
    if-eqz v1, :cond_7

    .line 379
    .line 380
    move-object v2, v12

    .line 381
    goto :goto_3

    .line 382
    :pswitch_f
    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 383
    .line 384
    .line 385
    move-result v1

    .line 386
    if-eqz v1, :cond_7

    .line 387
    .line 388
    move-object/from16 v2, v26

    .line 389
    .line 390
    goto :goto_3

    .line 391
    :pswitch_10
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 392
    .line 393
    .line 394
    move-result v1

    .line 395
    if-eqz v1, :cond_7

    .line 396
    .line 397
    move-object/from16 v2, v29

    .line 398
    .line 399
    goto :goto_3

    .line 400
    :pswitch_11
    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 401
    .line 402
    .line 403
    move-result v1

    .line 404
    if-eqz v1, :cond_7

    .line 405
    .line 406
    move-object/from16 v2, v28

    .line 407
    .line 408
    goto :goto_3

    .line 409
    :pswitch_12
    invoke-virtual {v0, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 410
    .line 411
    .line 412
    move-result v1

    .line 413
    if-eqz v1, :cond_7

    .line 414
    .line 415
    move-object/from16 v2, v17

    .line 416
    .line 417
    goto :goto_3

    .line 418
    :pswitch_13
    invoke-virtual {v0, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 419
    .line 420
    .line 421
    move-result v1

    .line 422
    if-eqz v1, :cond_7

    .line 423
    .line 424
    move-object/from16 v2, v16

    .line 425
    .line 426
    goto :goto_3

    .line 427
    :pswitch_14
    invoke-virtual {v0, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 428
    .line 429
    .line 430
    move-result v1

    .line 431
    if-eqz v1, :cond_7

    .line 432
    .line 433
    move-object/from16 v2, v18

    .line 434
    .line 435
    goto :goto_3

    .line 436
    :pswitch_15
    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 437
    .line 438
    .line 439
    move-result v1

    .line 440
    if-eqz v1, :cond_7

    .line 441
    .line 442
    move-object/from16 v2, v19

    .line 443
    .line 444
    goto :goto_3

    .line 445
    :pswitch_16
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 446
    .line 447
    .line 448
    move-result v1

    .line 449
    if-eqz v1, :cond_7

    .line 450
    .line 451
    move-object v2, v9

    .line 452
    :goto_3
    if-nez v2, :cond_9

    .line 453
    .line 454
    const-string v1, "Unknown Dolby Vision level string: "

    .line 455
    .line 456
    invoke-static {v0, v1}, Lga1;->p(Ljava/lang/String;Ljava/lang/String;)V

    .line 457
    .line 458
    .line 459
    return-object v21

    .line 460
    :cond_9
    new-instance v0, Landroid/util/Pair;

    .line 461
    .line 462
    invoke-direct {v0, v8, v2}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 463
    .line 464
    .line 465
    return-object v0

    .line 466
    :cond_a
    move/from16 v24, v5

    .line 467
    .line 468
    aget-object v0, v13, v22

    .line 469
    .line 470
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 471
    .line 472
    .line 473
    move-result v2

    .line 474
    const-string v5, "mp4a"

    .line 475
    .line 476
    const/16 v6, 0xa

    .line 477
    .line 478
    const/16 v10, 0x1e

    .line 479
    .line 480
    const/16 v12, 0x15

    .line 481
    .line 482
    const/16 v16, 0x2000

    .line 483
    .line 484
    const/16 v4, 0x14

    .line 485
    .line 486
    const/4 v8, -0x1

    .line 487
    sparse-switch v2, :sswitch_data_0

    .line 488
    .line 489
    .line 490
    goto/16 :goto_17

    .line 491
    .line 492
    :sswitch_0
    const-string v2, "vp09"

    .line 493
    .line 494
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 495
    .line 496
    .line 497
    move-result v0

    .line 498
    if-eqz v0, :cond_48

    .line 499
    .line 500
    array-length v0, v13

    .line 501
    const-string v2, "Ignoring malformed VP9 codec string: "

    .line 502
    .line 503
    if-ge v0, v3, :cond_b

    .line 504
    .line 505
    invoke-static {v11, v2}, Lga1;->p(Ljava/lang/String;Ljava/lang/String;)V

    .line 506
    .line 507
    .line 508
    return-object v21

    .line 509
    :cond_b
    :try_start_0
    aget-object v0, v13, v7

    .line 510
    .line 511
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 512
    .line 513
    .line 514
    move-result v0

    .line 515
    aget-object v5, v13, v24

    .line 516
    .line 517
    invoke-static {v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 518
    .line 519
    .line 520
    move-result v2
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 521
    if-eqz v0, :cond_f

    .line 522
    .line 523
    if-eq v0, v7, :cond_e

    .line 524
    .line 525
    move/from16 v5, v24

    .line 526
    .line 527
    if-eq v0, v5, :cond_d

    .line 528
    .line 529
    if-eq v0, v3, :cond_c

    .line 530
    .line 531
    move v3, v8

    .line 532
    goto :goto_4

    .line 533
    :cond_c
    const/16 v3, 0x8

    .line 534
    .line 535
    goto :goto_4

    .line 536
    :cond_d
    const/4 v3, 0x4

    .line 537
    goto :goto_4

    .line 538
    :cond_e
    const/4 v3, 0x2

    .line 539
    goto :goto_4

    .line 540
    :cond_f
    move v3, v7

    .line 541
    :goto_4
    if-ne v3, v8, :cond_10

    .line 542
    .line 543
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 544
    .line 545
    .line 546
    move-result-object v1

    .line 547
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 548
    .line 549
    .line 550
    move-result v1

    .line 551
    new-instance v2, Ljava/lang/StringBuilder;

    .line 552
    .line 553
    add-int/2addr v1, v12

    .line 554
    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 555
    .line 556
    .line 557
    const-string v1, "Unknown VP9 profile: "

    .line 558
    .line 559
    invoke-static {v2, v0, v1}, Lga1;->q(Ljava/lang/StringBuilder;ILjava/lang/String;)V

    .line 560
    .line 561
    .line 562
    return-object v21

    .line 563
    :cond_10
    if-eq v2, v6, :cond_19

    .line 564
    .line 565
    const/16 v0, 0xb

    .line 566
    .line 567
    if-eq v2, v0, :cond_18

    .line 568
    .line 569
    if-eq v2, v4, :cond_17

    .line 570
    .line 571
    if-eq v2, v12, :cond_16

    .line 572
    .line 573
    if-eq v2, v10, :cond_1a

    .line 574
    .line 575
    const/16 v0, 0x1f

    .line 576
    .line 577
    if-eq v2, v0, :cond_15

    .line 578
    .line 579
    const/16 v0, 0x28

    .line 580
    .line 581
    if-eq v2, v0, :cond_14

    .line 582
    .line 583
    const/16 v0, 0x29

    .line 584
    .line 585
    if-eq v2, v0, :cond_13

    .line 586
    .line 587
    const/16 v0, 0x32

    .line 588
    .line 589
    if-eq v2, v0, :cond_12

    .line 590
    .line 591
    const/16 v0, 0x33

    .line 592
    .line 593
    if-eq v2, v0, :cond_11

    .line 594
    .line 595
    packed-switch v2, :pswitch_data_3

    .line 596
    .line 597
    .line 598
    move v1, v8

    .line 599
    goto :goto_5

    .line 600
    :pswitch_17
    move/from16 v1, v16

    .line 601
    .line 602
    goto :goto_5

    .line 603
    :pswitch_18
    move/from16 v1, v23

    .line 604
    .line 605
    goto :goto_5

    .line 606
    :pswitch_19
    move/from16 v1, p0

    .line 607
    .line 608
    goto :goto_5

    .line 609
    :cond_11
    const/16 v1, 0x200

    .line 610
    .line 611
    goto :goto_5

    .line 612
    :cond_12
    move/from16 v1, v20

    .line 613
    .line 614
    goto :goto_5

    .line 615
    :cond_13
    const/16 v1, 0x80

    .line 616
    .line 617
    goto :goto_5

    .line 618
    :cond_14
    const/16 v1, 0x40

    .line 619
    .line 620
    goto :goto_5

    .line 621
    :cond_15
    const/16 v1, 0x20

    .line 622
    .line 623
    goto :goto_5

    .line 624
    :cond_16
    const/16 v1, 0x8

    .line 625
    .line 626
    goto :goto_5

    .line 627
    :cond_17
    const/4 v1, 0x4

    .line 628
    goto :goto_5

    .line 629
    :cond_18
    const/4 v1, 0x2

    .line 630
    goto :goto_5

    .line 631
    :cond_19
    move v1, v7

    .line 632
    :cond_1a
    :goto_5
    if-ne v1, v8, :cond_1b

    .line 633
    .line 634
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 635
    .line 636
    .line 637
    move-result-object v0

    .line 638
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 639
    .line 640
    .line 641
    move-result v0

    .line 642
    new-instance v1, Ljava/lang/StringBuilder;

    .line 643
    .line 644
    add-int/lit8 v0, v0, 0x13

    .line 645
    .line 646
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 647
    .line 648
    .line 649
    const-string v0, "Unknown VP9 level: "

    .line 650
    .line 651
    invoke-static {v1, v2, v0}, Lga1;->q(Ljava/lang/StringBuilder;ILjava/lang/String;)V

    .line 652
    .line 653
    .line 654
    return-object v21

    .line 655
    :cond_1b
    new-instance v0, Landroid/util/Pair;

    .line 656
    .line 657
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 658
    .line 659
    .line 660
    move-result-object v2

    .line 661
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 662
    .line 663
    .line 664
    move-result-object v1

    .line 665
    invoke-direct {v0, v2, v1}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 666
    .line 667
    .line 668
    return-object v0

    .line 669
    :catch_0
    invoke-static {v11, v2}, Lga1;->p(Ljava/lang/String;Ljava/lang/String;)V

    .line 670
    .line 671
    .line 672
    goto/16 :goto_17

    .line 673
    .line 674
    :sswitch_1
    const-string v1, "s263"

    .line 675
    .line 676
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 677
    .line 678
    .line 679
    move-result v0

    .line 680
    if-eqz v0, :cond_48

    .line 681
    .line 682
    new-instance v0, Landroid/util/Pair;

    .line 683
    .line 684
    invoke-direct {v0, v9, v9}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 685
    .line 686
    .line 687
    array-length v1, v13

    .line 688
    const-string v2, "Ignoring malformed H263 codec string: "

    .line 689
    .line 690
    if-ge v1, v3, :cond_1c

    .line 691
    .line 692
    invoke-static {v11, v2}, Lga1;->p(Ljava/lang/String;Ljava/lang/String;)V

    .line 693
    .line 694
    .line 695
    goto :goto_6

    .line 696
    :cond_1c
    :try_start_1
    aget-object v1, v13, v7

    .line 697
    .line 698
    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 699
    .line 700
    .line 701
    move-result v1

    .line 702
    const/16 v24, 0x2

    .line 703
    .line 704
    aget-object v3, v13, v24

    .line 705
    .line 706
    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 707
    .line 708
    .line 709
    move-result v3

    .line 710
    new-instance v4, Landroid/util/Pair;

    .line 711
    .line 712
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 713
    .line 714
    .line 715
    move-result-object v1

    .line 716
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 717
    .line 718
    .line 719
    move-result-object v3

    .line 720
    invoke-direct {v4, v1, v3}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_1

    .line 721
    .line 722
    .line 723
    return-object v4

    .line 724
    :catch_1
    invoke-static {v11, v2}, Lga1;->p(Ljava/lang/String;Ljava/lang/String;)V

    .line 725
    .line 726
    .line 727
    :goto_6
    move-object/from16 v21, v0

    .line 728
    .line 729
    goto/16 :goto_17

    .line 730
    .line 731
    :sswitch_2
    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 732
    .line 733
    .line 734
    move-result v0

    .line 735
    if-eqz v0, :cond_48

    .line 736
    .line 737
    array-length v0, v13

    .line 738
    const-string v2, "Ignoring malformed MP4A codec string: "

    .line 739
    .line 740
    if-eq v0, v3, :cond_1d

    .line 741
    .line 742
    invoke-static {v11, v2}, Lga1;->p(Ljava/lang/String;Ljava/lang/String;)V

    .line 743
    .line 744
    .line 745
    return-object v21

    .line 746
    :cond_1d
    :try_start_2
    aget-object v0, v13, v7

    .line 747
    .line 748
    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    .line 749
    .line 750
    .line 751
    move-result v0

    .line 752
    invoke-static {v0}, Lpp1;->f(I)Ljava/lang/String;

    .line 753
    .line 754
    .line 755
    move-result-object v0

    .line 756
    const-string v1, "audio/mp4a-latm"

    .line 757
    .line 758
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 759
    .line 760
    .line 761
    move-result v0

    .line 762
    if-eqz v0, :cond_48

    .line 763
    .line 764
    const/16 v24, 0x2

    .line 765
    .line 766
    aget-object v0, v13, v24

    .line 767
    .line 768
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 769
    .line 770
    .line 771
    move-result v0

    .line 772
    const/16 v1, 0x11

    .line 773
    .line 774
    if-eq v0, v1, :cond_1e

    .line 775
    .line 776
    if-eq v0, v4, :cond_20

    .line 777
    .line 778
    const/16 v1, 0x17

    .line 779
    .line 780
    if-eq v0, v1, :cond_1f

    .line 781
    .line 782
    const/16 v1, 0x1d

    .line 783
    .line 784
    if-eq v0, v1, :cond_1e

    .line 785
    .line 786
    const/16 v1, 0x27

    .line 787
    .line 788
    if-eq v0, v1, :cond_1e

    .line 789
    .line 790
    const/16 v1, 0x2a

    .line 791
    .line 792
    if-eq v0, v1, :cond_1e

    .line 793
    .line 794
    packed-switch v0, :pswitch_data_4

    .line 795
    .line 796
    .line 797
    move v3, v8

    .line 798
    goto :goto_7

    .line 799
    :pswitch_1a
    const/4 v3, 0x6

    .line 800
    goto :goto_7

    .line 801
    :pswitch_1b
    const/4 v3, 0x5

    .line 802
    goto :goto_7

    .line 803
    :pswitch_1c
    const/4 v3, 0x4

    .line 804
    goto :goto_7

    .line 805
    :pswitch_1d
    const/4 v3, 0x2

    .line 806
    goto :goto_7

    .line 807
    :pswitch_1e
    move v3, v7

    .line 808
    goto :goto_7

    .line 809
    :cond_1e
    move v3, v1

    .line 810
    goto :goto_7

    .line 811
    :cond_1f
    const/16 v3, 0x17

    .line 812
    .line 813
    goto :goto_7

    .line 814
    :cond_20
    move v3, v4

    .line 815
    :goto_7
    :pswitch_1f
    if-eq v3, v8, :cond_48

    .line 816
    .line 817
    new-instance v0, Landroid/util/Pair;

    .line 818
    .line 819
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 820
    .line 821
    .line 822
    move-result-object v1

    .line 823
    invoke-direct {v0, v1, v14}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/NumberFormatException; {:try_start_2 .. :try_end_2} :catch_2

    .line 824
    .line 825
    .line 826
    return-object v0

    .line 827
    :catch_2
    invoke-static {v11, v2}, Lga1;->p(Ljava/lang/String;Ljava/lang/String;)V

    .line 828
    .line 829
    .line 830
    goto/16 :goto_17

    .line 831
    .line 832
    :sswitch_3
    const-string v2, "iamf"

    .line 833
    .line 834
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 835
    .line 836
    .line 837
    move-result v0

    .line 838
    if-eqz v0, :cond_48

    .line 839
    .line 840
    array-length v0, v13

    .line 841
    const/4 v2, 0x4

    .line 842
    if-ge v0, v2, :cond_21

    .line 843
    .line 844
    const-string v0, "Ignoring malformed IAMF codec string: "

    .line 845
    .line 846
    invoke-virtual {v0, v11}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 847
    .line 848
    .line 849
    move-result-object v0

    .line 850
    invoke-static {v0}, La30;->x(Ljava/lang/String;)V

    .line 851
    .line 852
    .line 853
    return-object v21

    .line 854
    :cond_21
    :try_start_3
    aget-object v0, v13, v7

    .line 855
    .line 856
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 857
    .line 858
    .line 859
    move-result v0
    :try_end_3
    .catch Ljava/lang/NumberFormatException; {:try_start_3 .. :try_end_3} :catch_3

    .line 860
    add-int/2addr v0, v1

    .line 861
    shl-int v0, v7, v0

    .line 862
    .line 863
    aget-object v1, v13, v3

    .line 864
    .line 865
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 866
    .line 867
    .line 868
    move-result v2

    .line 869
    sparse-switch v2, :sswitch_data_1

    .line 870
    .line 871
    .line 872
    goto :goto_9

    .line 873
    :sswitch_4
    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 874
    .line 875
    .line 876
    move-result v2

    .line 877
    if-eqz v2, :cond_22

    .line 878
    .line 879
    const/4 v15, 0x2

    .line 880
    goto :goto_8

    .line 881
    :sswitch_5
    const-string v2, "ipcm"

    .line 882
    .line 883
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 884
    .line 885
    .line 886
    move-result v2

    .line 887
    if-eqz v2, :cond_22

    .line 888
    .line 889
    const/16 v15, 0x8

    .line 890
    .line 891
    goto :goto_8

    .line 892
    :sswitch_6
    const-string v2, "fLaC"

    .line 893
    .line 894
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 895
    .line 896
    .line 897
    move-result v2

    .line 898
    if-eqz v2, :cond_22

    .line 899
    .line 900
    const/4 v15, 0x4

    .line 901
    goto :goto_8

    .line 902
    :sswitch_7
    const-string v2, "Opus"

    .line 903
    .line 904
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 905
    .line 906
    .line 907
    move-result v2

    .line 908
    if-eqz v2, :cond_22

    .line 909
    .line 910
    move v15, v7

    .line 911
    :goto_8
    const/high16 v1, 0x1000000

    .line 912
    .line 913
    or-int/2addr v0, v1

    .line 914
    or-int/2addr v0, v15

    .line 915
    new-instance v1, Landroid/util/Pair;

    .line 916
    .line 917
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 918
    .line 919
    .line 920
    move-result-object v0

    .line 921
    invoke-direct {v1, v0, v14}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 922
    .line 923
    .line 924
    return-object v1

    .line 925
    :cond_22
    :goto_9
    const-string v0, "Ignoring unknown codec identifier for IAMF auxiliary profile: "

    .line 926
    .line 927
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 928
    .line 929
    .line 930
    move-result-object v0

    .line 931
    invoke-static {v0}, La30;->x(Ljava/lang/String;)V

    .line 932
    .line 933
    .line 934
    return-object v21

    .line 935
    :catch_3
    move-exception v0

    .line 936
    aget-object v1, v13, v7

    .line 937
    .line 938
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 939
    .line 940
    .line 941
    move-result-object v1

    .line 942
    const-string v2, "Ignoring malformed primary profile in IAMF codec string: "

    .line 943
    .line 944
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 945
    .line 946
    .line 947
    move-result-object v1

    .line 948
    invoke-static {v1, v0}, La30;->z(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 949
    .line 950
    .line 951
    goto/16 :goto_17

    .line 952
    .line 953
    :sswitch_8
    const-string v1, "hvc1"

    .line 954
    .line 955
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 956
    .line 957
    .line 958
    move-result v0

    .line 959
    if-eqz v0, :cond_48

    .line 960
    .line 961
    goto :goto_a

    .line 962
    :sswitch_9
    const-string v1, "hev1"

    .line 963
    .line 964
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 965
    .line 966
    .line 967
    move-result v0

    .line 968
    if-eqz v0, :cond_48

    .line 969
    .line 970
    :goto_a
    invoke-static {v11, v13, v15}, Lmo2;->c(Ljava/lang/String;[Ljava/lang/String;Ln74;)Landroid/util/Pair;

    .line 971
    .line 972
    .line 973
    move-result-object v0

    .line 974
    return-object v0

    .line 975
    :sswitch_a
    const-string v2, "avc2"

    .line 976
    .line 977
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 978
    .line 979
    .line 980
    move-result v0

    .line 981
    if-eqz v0, :cond_48

    .line 982
    .line 983
    goto :goto_b

    .line 984
    :sswitch_b
    const-string v2, "avc1"

    .line 985
    .line 986
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 987
    .line 988
    .line 989
    move-result v0

    .line 990
    if-eqz v0, :cond_48

    .line 991
    .line 992
    :goto_b
    array-length v0, v13

    .line 993
    const-string v2, "Ignoring malformed AVC codec string: "

    .line 994
    .line 995
    const/4 v5, 0x2

    .line 996
    if-ge v0, v5, :cond_23

    .line 997
    .line 998
    invoke-static {v11, v2}, Lga1;->p(Ljava/lang/String;Ljava/lang/String;)V

    .line 999
    .line 1000
    .line 1001
    return-object v21

    .line 1002
    :cond_23
    :try_start_4
    aget-object v4, v13, v7

    .line 1003
    .line 1004
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 1005
    .line 1006
    .line 1007
    move-result v4

    .line 1008
    const/4 v6, 0x6

    .line 1009
    if-ne v4, v6, :cond_24

    .line 1010
    .line 1011
    aget-object v0, v13, v7

    .line 1012
    .line 1013
    move/from16 v3, v22

    .line 1014
    .line 1015
    invoke-virtual {v0, v3, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 1016
    .line 1017
    .line 1018
    move-result-object v0

    .line 1019
    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    .line 1020
    .line 1021
    .line 1022
    move-result v0

    .line 1023
    aget-object v3, v13, v7

    .line 1024
    .line 1025
    const/4 v4, 0x4

    .line 1026
    invoke-virtual {v3, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 1027
    .line 1028
    .line 1029
    move-result-object v3

    .line 1030
    invoke-static {v3, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    .line 1031
    .line 1032
    .line 1033
    move-result v2

    .line 1034
    goto :goto_c

    .line 1035
    :cond_24
    if-lt v0, v3, :cond_2e

    .line 1036
    .line 1037
    aget-object v0, v13, v7

    .line 1038
    .line 1039
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 1040
    .line 1041
    .line 1042
    move-result v0

    .line 1043
    const/16 v24, 0x2

    .line 1044
    .line 1045
    aget-object v3, v13, v24

    .line 1046
    .line 1047
    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 1048
    .line 1049
    .line 1050
    move-result v2
    :try_end_4
    .catch Ljava/lang/NumberFormatException; {:try_start_4 .. :try_end_4} :catch_4

    .line 1051
    :goto_c
    const/16 v3, 0x42

    .line 1052
    .line 1053
    if-eq v0, v3, :cond_2b

    .line 1054
    .line 1055
    const/16 v3, 0x4d

    .line 1056
    .line 1057
    if-eq v0, v3, :cond_2a

    .line 1058
    .line 1059
    const/16 v3, 0x58

    .line 1060
    .line 1061
    if-eq v0, v3, :cond_29

    .line 1062
    .line 1063
    const/16 v3, 0x64

    .line 1064
    .line 1065
    if-eq v0, v3, :cond_28

    .line 1066
    .line 1067
    const/16 v3, 0x6e

    .line 1068
    .line 1069
    if-eq v0, v3, :cond_27

    .line 1070
    .line 1071
    const/16 v3, 0x7a

    .line 1072
    .line 1073
    if-eq v0, v3, :cond_26

    .line 1074
    .line 1075
    const/16 v3, 0xf4

    .line 1076
    .line 1077
    if-eq v0, v3, :cond_25

    .line 1078
    .line 1079
    move v5, v8

    .line 1080
    goto :goto_d

    .line 1081
    :cond_25
    const/16 v5, 0x40

    .line 1082
    .line 1083
    goto :goto_d

    .line 1084
    :cond_26
    const/16 v5, 0x20

    .line 1085
    .line 1086
    goto :goto_d

    .line 1087
    :cond_27
    move v5, v1

    .line 1088
    goto :goto_d

    .line 1089
    :cond_28
    const/16 v5, 0x8

    .line 1090
    .line 1091
    goto :goto_d

    .line 1092
    :cond_29
    const/4 v5, 0x4

    .line 1093
    goto :goto_d

    .line 1094
    :cond_2a
    const/4 v5, 0x2

    .line 1095
    goto :goto_d

    .line 1096
    :cond_2b
    move v5, v7

    .line 1097
    :goto_d
    if-ne v5, v8, :cond_2c

    .line 1098
    .line 1099
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 1100
    .line 1101
    .line 1102
    move-result-object v1

    .line 1103
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 1104
    .line 1105
    .line 1106
    move-result v1

    .line 1107
    new-instance v2, Ljava/lang/StringBuilder;

    .line 1108
    .line 1109
    add-int/2addr v1, v12

    .line 1110
    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 1111
    .line 1112
    .line 1113
    const-string v1, "Unknown AVC profile: "

    .line 1114
    .line 1115
    invoke-static {v2, v0, v1}, Lga1;->q(Ljava/lang/StringBuilder;ILjava/lang/String;)V

    .line 1116
    .line 1117
    .line 1118
    return-object v21

    .line 1119
    :cond_2c
    packed-switch v2, :pswitch_data_5

    .line 1120
    .line 1121
    .line 1122
    packed-switch v2, :pswitch_data_6

    .line 1123
    .line 1124
    .line 1125
    packed-switch v2, :pswitch_data_7

    .line 1126
    .line 1127
    .line 1128
    packed-switch v2, :pswitch_data_8

    .line 1129
    .line 1130
    .line 1131
    packed-switch v2, :pswitch_data_9

    .line 1132
    .line 1133
    .line 1134
    move v1, v8

    .line 1135
    goto :goto_e

    .line 1136
    :pswitch_20
    const/high16 v1, 0x10000

    .line 1137
    .line 1138
    goto :goto_e

    .line 1139
    :pswitch_21
    const v1, 0x8000

    .line 1140
    .line 1141
    .line 1142
    goto :goto_e

    .line 1143
    :pswitch_22
    const/16 v1, 0x4000

    .line 1144
    .line 1145
    goto :goto_e

    .line 1146
    :pswitch_23
    move/from16 v1, v16

    .line 1147
    .line 1148
    goto :goto_e

    .line 1149
    :pswitch_24
    move/from16 v1, v23

    .line 1150
    .line 1151
    goto :goto_e

    .line 1152
    :pswitch_25
    move/from16 v1, p0

    .line 1153
    .line 1154
    goto :goto_e

    .line 1155
    :pswitch_26
    const/16 v1, 0x400

    .line 1156
    .line 1157
    goto :goto_e

    .line 1158
    :pswitch_27
    const/16 v1, 0x200

    .line 1159
    .line 1160
    goto :goto_e

    .line 1161
    :pswitch_28
    move/from16 v1, v20

    .line 1162
    .line 1163
    goto :goto_e

    .line 1164
    :pswitch_29
    const/16 v1, 0x80

    .line 1165
    .line 1166
    goto :goto_e

    .line 1167
    :pswitch_2a
    const/16 v1, 0x40

    .line 1168
    .line 1169
    goto :goto_e

    .line 1170
    :pswitch_2b
    const/16 v1, 0x20

    .line 1171
    .line 1172
    goto :goto_e

    .line 1173
    :pswitch_2c
    const/16 v1, 0x8

    .line 1174
    .line 1175
    goto :goto_e

    .line 1176
    :pswitch_2d
    const/4 v1, 0x4

    .line 1177
    goto :goto_e

    .line 1178
    :pswitch_2e
    move v1, v7

    .line 1179
    :goto_e
    :pswitch_2f
    if-ne v1, v8, :cond_2d

    .line 1180
    .line 1181
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 1182
    .line 1183
    .line 1184
    move-result-object v0

    .line 1185
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 1186
    .line 1187
    .line 1188
    move-result v0

    .line 1189
    new-instance v1, Ljava/lang/StringBuilder;

    .line 1190
    .line 1191
    add-int/lit8 v0, v0, 0x13

    .line 1192
    .line 1193
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 1194
    .line 1195
    .line 1196
    const-string v0, "Unknown AVC level: "

    .line 1197
    .line 1198
    invoke-static {v1, v2, v0}, Lga1;->q(Ljava/lang/StringBuilder;ILjava/lang/String;)V

    .line 1199
    .line 1200
    .line 1201
    return-object v21

    .line 1202
    :cond_2d
    new-instance v0, Landroid/util/Pair;

    .line 1203
    .line 1204
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1205
    .line 1206
    .line 1207
    move-result-object v2

    .line 1208
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1209
    .line 1210
    .line 1211
    move-result-object v1

    .line 1212
    invoke-direct {v0, v2, v1}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1213
    .line 1214
    .line 1215
    return-object v0

    .line 1216
    :cond_2e
    :try_start_5
    invoke-static {v11}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 1217
    .line 1218
    .line 1219
    move-result-object v0

    .line 1220
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 1221
    .line 1222
    .line 1223
    move-result v0

    .line 1224
    add-int/lit8 v0, v0, 0x25

    .line 1225
    .line 1226
    new-instance v1, Ljava/lang/StringBuilder;

    .line 1227
    .line 1228
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 1229
    .line 1230
    .line 1231
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1232
    .line 1233
    .line 1234
    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1235
    .line 1236
    .line 1237
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1238
    .line 1239
    .line 1240
    move-result-object v0

    .line 1241
    invoke-static {v0}, La30;->x(Ljava/lang/String;)V
    :try_end_5
    .catch Ljava/lang/NumberFormatException; {:try_start_5 .. :try_end_5} :catch_4

    .line 1242
    .line 1243
    .line 1244
    return-object v21

    .line 1245
    :catch_4
    invoke-static {v11, v2}, Lga1;->p(Ljava/lang/String;Ljava/lang/String;)V

    .line 1246
    .line 1247
    .line 1248
    goto/16 :goto_17

    .line 1249
    .line 1250
    :sswitch_c
    const-string v2, "av01"

    .line 1251
    .line 1252
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1253
    .line 1254
    .line 1255
    move-result v0

    .line 1256
    if-eqz v0, :cond_48

    .line 1257
    .line 1258
    array-length v0, v13

    .line 1259
    const-string v2, "Ignoring malformed AV1 codec string: "

    .line 1260
    .line 1261
    const/4 v4, 0x4

    .line 1262
    if-ge v0, v4, :cond_2f

    .line 1263
    .line 1264
    invoke-static {v11, v2}, Lga1;->p(Ljava/lang/String;Ljava/lang/String;)V

    .line 1265
    .line 1266
    .line 1267
    return-object v21

    .line 1268
    :cond_2f
    :try_start_6
    aget-object v0, v13, v7

    .line 1269
    .line 1270
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 1271
    .line 1272
    .line 1273
    move-result v0

    .line 1274
    const/4 v5, 0x2

    .line 1275
    aget-object v4, v13, v5

    .line 1276
    .line 1277
    const/4 v9, 0x0

    .line 1278
    invoke-virtual {v4, v9, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 1279
    .line 1280
    .line 1281
    move-result-object v4

    .line 1282
    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 1283
    .line 1284
    .line 1285
    move-result v4

    .line 1286
    aget-object v3, v13, v3

    .line 1287
    .line 1288
    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 1289
    .line 1290
    .line 1291
    move-result v2
    :try_end_6
    .catch Ljava/lang/NumberFormatException; {:try_start_6 .. :try_end_6} :catch_5

    .line 1292
    if-eqz v0, :cond_30

    .line 1293
    .line 1294
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 1295
    .line 1296
    .line 1297
    move-result-object v1

    .line 1298
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 1299
    .line 1300
    .line 1301
    move-result v1

    .line 1302
    new-instance v2, Ljava/lang/StringBuilder;

    .line 1303
    .line 1304
    add-int/2addr v1, v12

    .line 1305
    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 1306
    .line 1307
    .line 1308
    const-string v1, "Unknown AV1 profile: "

    .line 1309
    .line 1310
    invoke-static {v2, v0, v1}, Lga1;->q(Ljava/lang/StringBuilder;ILjava/lang/String;)V

    .line 1311
    .line 1312
    .line 1313
    return-object v21

    .line 1314
    :cond_30
    const/16 v5, 0x8

    .line 1315
    .line 1316
    if-eq v2, v5, :cond_34

    .line 1317
    .line 1318
    if-eq v2, v6, :cond_31

    .line 1319
    .line 1320
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 1321
    .line 1322
    .line 1323
    move-result-object v0

    .line 1324
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 1325
    .line 1326
    .line 1327
    move-result v0

    .line 1328
    new-instance v1, Ljava/lang/StringBuilder;

    .line 1329
    .line 1330
    const/16 v19, 0x17

    .line 1331
    .line 1332
    add-int/lit8 v0, v0, 0x17

    .line 1333
    .line 1334
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 1335
    .line 1336
    .line 1337
    const-string v0, "Unknown AV1 bit depth: "

    .line 1338
    .line 1339
    invoke-static {v1, v2, v0}, Lga1;->q(Ljava/lang/StringBuilder;ILjava/lang/String;)V

    .line 1340
    .line 1341
    .line 1342
    return-object v21

    .line 1343
    :cond_31
    if-eqz v15, :cond_33

    .line 1344
    .line 1345
    iget-object v0, v15, Ln74;->d:[B

    .line 1346
    .line 1347
    if-nez v0, :cond_32

    .line 1348
    .line 1349
    iget v0, v15, Ln74;->c:I

    .line 1350
    .line 1351
    const/4 v2, 0x7

    .line 1352
    if-eq v0, v2, :cond_32

    .line 1353
    .line 1354
    const/4 v6, 0x6

    .line 1355
    if-ne v0, v6, :cond_33

    .line 1356
    .line 1357
    :cond_32
    move/from16 v0, v23

    .line 1358
    .line 1359
    goto :goto_f

    .line 1360
    :cond_33
    const/4 v0, 0x2

    .line 1361
    goto :goto_f

    .line 1362
    :cond_34
    move v0, v7

    .line 1363
    :goto_f
    packed-switch v4, :pswitch_data_a

    .line 1364
    .line 1365
    .line 1366
    move v1, v8

    .line 1367
    goto :goto_10

    .line 1368
    :pswitch_30
    const/high16 v1, 0x800000

    .line 1369
    .line 1370
    goto :goto_10

    .line 1371
    :pswitch_31
    const/high16 v1, 0x400000

    .line 1372
    .line 1373
    goto :goto_10

    .line 1374
    :pswitch_32
    const/high16 v1, 0x200000

    .line 1375
    .line 1376
    goto :goto_10

    .line 1377
    :pswitch_33
    const/high16 v1, 0x100000

    .line 1378
    .line 1379
    goto :goto_10

    .line 1380
    :pswitch_34
    const/high16 v1, 0x80000

    .line 1381
    .line 1382
    goto :goto_10

    .line 1383
    :pswitch_35
    const/high16 v1, 0x40000

    .line 1384
    .line 1385
    goto :goto_10

    .line 1386
    :pswitch_36
    const/high16 v1, 0x20000

    .line 1387
    .line 1388
    goto :goto_10

    .line 1389
    :pswitch_37
    const/high16 v1, 0x10000

    .line 1390
    .line 1391
    goto :goto_10

    .line 1392
    :pswitch_38
    const v1, 0x8000

    .line 1393
    .line 1394
    .line 1395
    goto :goto_10

    .line 1396
    :pswitch_39
    const/16 v1, 0x4000

    .line 1397
    .line 1398
    goto :goto_10

    .line 1399
    :pswitch_3a
    move/from16 v1, v16

    .line 1400
    .line 1401
    goto :goto_10

    .line 1402
    :pswitch_3b
    move/from16 v1, v23

    .line 1403
    .line 1404
    goto :goto_10

    .line 1405
    :pswitch_3c
    move/from16 v1, p0

    .line 1406
    .line 1407
    goto :goto_10

    .line 1408
    :pswitch_3d
    const/16 v1, 0x400

    .line 1409
    .line 1410
    goto :goto_10

    .line 1411
    :pswitch_3e
    const/16 v1, 0x200

    .line 1412
    .line 1413
    goto :goto_10

    .line 1414
    :pswitch_3f
    move/from16 v1, v20

    .line 1415
    .line 1416
    goto :goto_10

    .line 1417
    :pswitch_40
    const/16 v1, 0x80

    .line 1418
    .line 1419
    goto :goto_10

    .line 1420
    :pswitch_41
    const/16 v1, 0x40

    .line 1421
    .line 1422
    goto :goto_10

    .line 1423
    :pswitch_42
    const/16 v1, 0x20

    .line 1424
    .line 1425
    goto :goto_10

    .line 1426
    :pswitch_43
    move v1, v5

    .line 1427
    goto :goto_10

    .line 1428
    :pswitch_44
    const/4 v1, 0x4

    .line 1429
    goto :goto_10

    .line 1430
    :pswitch_45
    const/4 v1, 0x2

    .line 1431
    goto :goto_10

    .line 1432
    :pswitch_46
    move v1, v7

    .line 1433
    :goto_10
    :pswitch_47
    if-ne v1, v8, :cond_35

    .line 1434
    .line 1435
    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 1436
    .line 1437
    .line 1438
    move-result-object v0

    .line 1439
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 1440
    .line 1441
    .line 1442
    move-result v0

    .line 1443
    new-instance v1, Ljava/lang/StringBuilder;

    .line 1444
    .line 1445
    add-int/lit8 v0, v0, 0x13

    .line 1446
    .line 1447
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 1448
    .line 1449
    .line 1450
    const-string v0, "Unknown AV1 level: "

    .line 1451
    .line 1452
    invoke-static {v1, v4, v0}, Lga1;->q(Ljava/lang/StringBuilder;ILjava/lang/String;)V

    .line 1453
    .line 1454
    .line 1455
    return-object v21

    .line 1456
    :cond_35
    new-instance v2, Landroid/util/Pair;

    .line 1457
    .line 1458
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1459
    .line 1460
    .line 1461
    move-result-object v0

    .line 1462
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1463
    .line 1464
    .line 1465
    move-result-object v1

    .line 1466
    invoke-direct {v2, v0, v1}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1467
    .line 1468
    .line 1469
    return-object v2

    .line 1470
    :catch_5
    invoke-static {v11, v2}, Lga1;->p(Ljava/lang/String;Ljava/lang/String;)V

    .line 1471
    .line 1472
    .line 1473
    goto/16 :goto_17

    .line 1474
    .line 1475
    :sswitch_d
    const-string v1, "apv1"

    .line 1476
    .line 1477
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1478
    .line 1479
    .line 1480
    move-result v0

    .line 1481
    if-eqz v0, :cond_48

    .line 1482
    .line 1483
    array-length v0, v13

    .line 1484
    const-string v1, "Ignoring malformed APV codec string: "

    .line 1485
    .line 1486
    const/4 v4, 0x4

    .line 1487
    if-ge v0, v4, :cond_36

    .line 1488
    .line 1489
    invoke-static {v11, v1}, Lga1;->p(Ljava/lang/String;Ljava/lang/String;)V

    .line 1490
    .line 1491
    .line 1492
    return-object v21

    .line 1493
    :cond_36
    :try_start_7
    aget-object v0, v13, v7

    .line 1494
    .line 1495
    invoke-virtual {v0, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 1496
    .line 1497
    .line 1498
    move-result-object v0

    .line 1499
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 1500
    .line 1501
    .line 1502
    move-result v0

    .line 1503
    const/16 v24, 0x2

    .line 1504
    .line 1505
    aget-object v2, v13, v24

    .line 1506
    .line 1507
    invoke-virtual {v2, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 1508
    .line 1509
    .line 1510
    move-result-object v2

    .line 1511
    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 1512
    .line 1513
    .line 1514
    move-result v2

    .line 1515
    aget-object v3, v13, v3

    .line 1516
    .line 1517
    invoke-virtual {v3, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 1518
    .line 1519
    .line 1520
    move-result-object v3

    .line 1521
    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 1522
    .line 1523
    .line 1524
    move-result v1
    :try_end_7
    .catch Ljava/lang/NumberFormatException; {:try_start_7 .. :try_end_7} :catch_6

    .line 1525
    const/16 v3, 0x21

    .line 1526
    .line 1527
    if-ne v0, v3, :cond_37

    .line 1528
    .line 1529
    move/from16 v16, v7

    .line 1530
    .line 1531
    goto :goto_11

    .line 1532
    :cond_37
    const/16 v3, 0x2c

    .line 1533
    .line 1534
    if-ne v0, v3, :cond_39

    .line 1535
    .line 1536
    :goto_11
    div-int/lit8 v0, v2, 0x1e

    .line 1537
    .line 1538
    rem-int/2addr v2, v10

    .line 1539
    add-int/2addr v0, v0

    .line 1540
    if-nez v2, :cond_38

    .line 1541
    .line 1542
    add-int/lit8 v0, v0, -0x1

    .line 1543
    .line 1544
    :cond_38
    add-int/2addr v0, v8

    .line 1545
    shl-int v0, v20, v0

    .line 1546
    .line 1547
    shl-int v1, v7, v1

    .line 1548
    .line 1549
    new-instance v2, Landroid/util/Pair;

    .line 1550
    .line 1551
    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1552
    .line 1553
    .line 1554
    move-result-object v3

    .line 1555
    or-int/2addr v0, v1

    .line 1556
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1557
    .line 1558
    .line 1559
    move-result-object v0

    .line 1560
    invoke-direct {v2, v3, v0}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1561
    .line 1562
    .line 1563
    return-object v2

    .line 1564
    :cond_39
    invoke-static {v0, v10}, Lga1;->f(II)I

    .line 1565
    .line 1566
    .line 1567
    move-result v1

    .line 1568
    new-instance v2, Ljava/lang/StringBuilder;

    .line 1569
    .line 1570
    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 1571
    .line 1572
    .line 1573
    const-string v1, "Ignoring invalid APV profile: "

    .line 1574
    .line 1575
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1576
    .line 1577
    .line 1578
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1579
    .line 1580
    .line 1581
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1582
    .line 1583
    .line 1584
    move-result-object v0

    .line 1585
    invoke-static {v0}, La30;->x(Ljava/lang/String;)V

    .line 1586
    .line 1587
    .line 1588
    return-object v21

    .line 1589
    :catch_6
    move-exception v0

    .line 1590
    invoke-static {v11}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 1591
    .line 1592
    .line 1593
    move-result-object v2

    .line 1594
    invoke-virtual {v1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1595
    .line 1596
    .line 1597
    move-result-object v1

    .line 1598
    invoke-static {v1, v0}, La30;->z(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1599
    .line 1600
    .line 1601
    goto/16 :goto_17

    .line 1602
    .line 1603
    :sswitch_e
    move/from16 v9, v22

    .line 1604
    .line 1605
    const/16 v5, 0x8

    .line 1606
    .line 1607
    const-string v2, "ac-4"

    .line 1608
    .line 1609
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1610
    .line 1611
    .line 1612
    move-result v0

    .line 1613
    if-eqz v0, :cond_48

    .line 1614
    .line 1615
    array-length v0, v13

    .line 1616
    const-string v2, "Ignoring malformed AC-4 codec string: "

    .line 1617
    .line 1618
    const/4 v6, 0x4

    .line 1619
    if-eq v0, v6, :cond_3a

    .line 1620
    .line 1621
    invoke-static {v11, v2}, Lga1;->p(Ljava/lang/String;Ljava/lang/String;)V

    .line 1622
    .line 1623
    .line 1624
    return-object v21

    .line 1625
    :cond_3a
    :try_start_8
    aget-object v0, v13, v7

    .line 1626
    .line 1627
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 1628
    .line 1629
    .line 1630
    move-result v0

    .line 1631
    const/4 v6, 0x2

    .line 1632
    aget-object v10, v13, v6

    .line 1633
    .line 1634
    invoke-static {v10}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 1635
    .line 1636
    .line 1637
    move-result v10

    .line 1638
    aget-object v12, v13, v3

    .line 1639
    .line 1640
    invoke-static {v12}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 1641
    .line 1642
    .line 1643
    move-result v2
    :try_end_8
    .catch Ljava/lang/NumberFormatException; {:try_start_8 .. :try_end_8} :catch_7

    .line 1644
    if-eqz v0, :cond_40

    .line 1645
    .line 1646
    if-eq v0, v7, :cond_3e

    .line 1647
    .line 1648
    if-eq v0, v6, :cond_3c

    .line 1649
    .line 1650
    :cond_3b
    move v9, v8

    .line 1651
    move v13, v10

    .line 1652
    goto :goto_14

    .line 1653
    :cond_3c
    if-ne v10, v7, :cond_3d

    .line 1654
    .line 1655
    const/16 v9, 0x402

    .line 1656
    .line 1657
    :goto_12
    move v13, v7

    .line 1658
    goto :goto_14

    .line 1659
    :cond_3d
    if-ne v10, v6, :cond_3b

    .line 1660
    .line 1661
    const/16 v9, 0x404

    .line 1662
    .line 1663
    const/4 v13, 0x2

    .line 1664
    goto :goto_14

    .line 1665
    :cond_3e
    if-nez v10, :cond_3f

    .line 1666
    .line 1667
    const/16 v6, 0x201

    .line 1668
    .line 1669
    :goto_13
    move v13, v9

    .line 1670
    move v9, v6

    .line 1671
    goto :goto_14

    .line 1672
    :cond_3f
    if-ne v10, v7, :cond_3b

    .line 1673
    .line 1674
    const/16 v9, 0x202

    .line 1675
    .line 1676
    goto :goto_12

    .line 1677
    :cond_40
    if-nez v10, :cond_3b

    .line 1678
    .line 1679
    const/16 v6, 0x101

    .line 1680
    .line 1681
    goto :goto_13

    .line 1682
    :goto_14
    if-ne v9, v8, :cond_41

    .line 1683
    .line 1684
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 1685
    .line 1686
    .line 1687
    move-result-object v1

    .line 1688
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 1689
    .line 1690
    .line 1691
    move-result v1

    .line 1692
    invoke-static {v13}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 1693
    .line 1694
    .line 1695
    move-result-object v2

    .line 1696
    const/16 v19, 0x17

    .line 1697
    .line 1698
    add-int/lit8 v1, v1, 0x17

    .line 1699
    .line 1700
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 1701
    .line 1702
    .line 1703
    move-result v2

    .line 1704
    new-instance v3, Ljava/lang/StringBuilder;

    .line 1705
    .line 1706
    add-int/2addr v1, v2

    .line 1707
    invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 1708
    .line 1709
    .line 1710
    const-string v1, "Unknown AC-4 profile: "

    .line 1711
    .line 1712
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1713
    .line 1714
    .line 1715
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1716
    .line 1717
    .line 1718
    const-string v0, "."

    .line 1719
    .line 1720
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1721
    .line 1722
    .line 1723
    invoke-virtual {v3, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1724
    .line 1725
    .line 1726
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1727
    .line 1728
    .line 1729
    move-result-object v0

    .line 1730
    invoke-static {v0}, La30;->x(Ljava/lang/String;)V

    .line 1731
    .line 1732
    .line 1733
    return-object v21

    .line 1734
    :cond_41
    if-eqz v2, :cond_46

    .line 1735
    .line 1736
    if-eq v2, v7, :cond_45

    .line 1737
    .line 1738
    const/4 v6, 0x2

    .line 1739
    if-eq v2, v6, :cond_44

    .line 1740
    .line 1741
    if-eq v2, v3, :cond_43

    .line 1742
    .line 1743
    const/4 v6, 0x4

    .line 1744
    if-eq v2, v6, :cond_42

    .line 1745
    .line 1746
    move v15, v8

    .line 1747
    goto :goto_16

    .line 1748
    :cond_42
    move v15, v1

    .line 1749
    goto :goto_16

    .line 1750
    :cond_43
    move v15, v5

    .line 1751
    goto :goto_16

    .line 1752
    :cond_44
    const/4 v6, 0x4

    .line 1753
    :goto_15
    move v15, v6

    .line 1754
    goto :goto_16

    .line 1755
    :cond_45
    const/4 v6, 0x2

    .line 1756
    goto :goto_15

    .line 1757
    :cond_46
    move v15, v7

    .line 1758
    :goto_16
    if-ne v15, v8, :cond_47

    .line 1759
    .line 1760
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 1761
    .line 1762
    .line 1763
    move-result-object v0

    .line 1764
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 1765
    .line 1766
    .line 1767
    move-result v0

    .line 1768
    new-instance v1, Ljava/lang/StringBuilder;

    .line 1769
    .line 1770
    add-int/2addr v0, v4

    .line 1771
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 1772
    .line 1773
    .line 1774
    const-string v0, "Unknown AC-4 level: "

    .line 1775
    .line 1776
    invoke-static {v1, v2, v0}, Lga1;->q(Ljava/lang/StringBuilder;ILjava/lang/String;)V

    .line 1777
    .line 1778
    .line 1779
    return-object v21

    .line 1780
    :cond_47
    new-instance v0, Landroid/util/Pair;

    .line 1781
    .line 1782
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1783
    .line 1784
    .line 1785
    move-result-object v1

    .line 1786
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1787
    .line 1788
    .line 1789
    move-result-object v2

    .line 1790
    invoke-direct {v0, v1, v2}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1791
    .line 1792
    .line 1793
    return-object v0

    .line 1794
    :catch_7
    invoke-static {v11, v2}, Lga1;->p(Ljava/lang/String;Ljava/lang/String;)V

    .line 1795
    .line 1796
    .line 1797
    :cond_48
    :goto_17
    return-object v21

    .line 1798
    nop

    .line 1799
    :pswitch_data_0
    .packed-switch 0x600
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 1800
    .line 1801
    .line 1802
    .line 1803
    .line 1804
    .line 1805
    .line 1806
    .line 1807
    .line 1808
    .line 1809
    .line 1810
    .line 1811
    .line 1812
    .line 1813
    .line 1814
    .line 1815
    .line 1816
    .line 1817
    .line 1818
    .line 1819
    .line 1820
    .line 1821
    .line 1822
    .line 1823
    :pswitch_data_1
    .packed-switch 0x601
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
    .end packed-switch

    .line 1824
    .line 1825
    .line 1826
    .line 1827
    .line 1828
    .line 1829
    .line 1830
    .line 1831
    .line 1832
    .line 1833
    .line 1834
    .line 1835
    .line 1836
    .line 1837
    .line 1838
    .line 1839
    .line 1840
    .line 1841
    .line 1842
    .line 1843
    .line 1844
    .line 1845
    :pswitch_data_2
    .packed-switch 0x61f
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
    .end packed-switch

    .line 1846
    .line 1847
    .line 1848
    .line 1849
    .line 1850
    .line 1851
    .line 1852
    .line 1853
    .line 1854
    .line 1855
    .line 1856
    .line 1857
    :sswitch_data_0
    .sparse-switch
        0x2d9149 -> :sswitch_e
        0x2dcaea -> :sswitch_d
        0x2dd8f6 -> :sswitch_c
        0x2ddf23 -> :sswitch_b
        0x2ddf24 -> :sswitch_a
        0x30d038 -> :sswitch_9
        0x310dbc -> :sswitch_8
        0x3134b1 -> :sswitch_3
        0x333790 -> :sswitch_2
        0x35091c -> :sswitch_1
        0x374e43 -> :sswitch_0
    .end sparse-switch

    .line 1858
    .line 1859
    .line 1860
    .line 1861
    .line 1862
    .line 1863
    .line 1864
    .line 1865
    .line 1866
    .line 1867
    .line 1868
    .line 1869
    .line 1870
    .line 1871
    .line 1872
    .line 1873
    .line 1874
    .line 1875
    .line 1876
    .line 1877
    .line 1878
    .line 1879
    .line 1880
    .line 1881
    .line 1882
    .line 1883
    .line 1884
    .line 1885
    .line 1886
    .line 1887
    .line 1888
    .line 1889
    .line 1890
    .line 1891
    .line 1892
    .line 1893
    .line 1894
    .line 1895
    .line 1896
    .line 1897
    .line 1898
    .line 1899
    .line 1900
    .line 1901
    .line 1902
    .line 1903
    :pswitch_data_3
    .packed-switch 0x3c
        :pswitch_19
        :pswitch_18
        :pswitch_17
    .end packed-switch

    .line 1904
    .line 1905
    .line 1906
    .line 1907
    .line 1908
    .line 1909
    .line 1910
    .line 1911
    .line 1912
    .line 1913
    :pswitch_data_4
    .packed-switch 0x1
        :pswitch_1e
        :pswitch_1d
        :pswitch_1f
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
    .end packed-switch

    .line 1914
    .line 1915
    .line 1916
    .line 1917
    .line 1918
    .line 1919
    .line 1920
    .line 1921
    .line 1922
    .line 1923
    .line 1924
    .line 1925
    .line 1926
    .line 1927
    .line 1928
    .line 1929
    :sswitch_data_1
    .sparse-switch
        0x259c5f -> :sswitch_7
        0x2f8728 -> :sswitch_6
        0x316bd1 -> :sswitch_5
        0x333790 -> :sswitch_4
    .end sparse-switch

    .line 1930
    .line 1931
    .line 1932
    .line 1933
    .line 1934
    .line 1935
    .line 1936
    .line 1937
    .line 1938
    .line 1939
    .line 1940
    .line 1941
    .line 1942
    .line 1943
    .line 1944
    .line 1945
    .line 1946
    .line 1947
    :pswitch_data_5
    .packed-switch 0xa
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2f
    .end packed-switch

    .line 1948
    .line 1949
    .line 1950
    .line 1951
    .line 1952
    .line 1953
    .line 1954
    .line 1955
    .line 1956
    .line 1957
    .line 1958
    .line 1959
    :pswitch_data_6
    .packed-switch 0x14
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
    .end packed-switch

    .line 1960
    .line 1961
    .line 1962
    .line 1963
    .line 1964
    .line 1965
    .line 1966
    .line 1967
    .line 1968
    .line 1969
    :pswitch_data_7
    .packed-switch 0x1e
        :pswitch_28
        :pswitch_27
        :pswitch_26
    .end packed-switch

    .line 1970
    .line 1971
    .line 1972
    .line 1973
    .line 1974
    .line 1975
    .line 1976
    .line 1977
    .line 1978
    .line 1979
    :pswitch_data_8
    .packed-switch 0x28
        :pswitch_25
        :pswitch_24
        :pswitch_23
    .end packed-switch

    .line 1980
    .line 1981
    .line 1982
    .line 1983
    .line 1984
    .line 1985
    .line 1986
    .line 1987
    .line 1988
    .line 1989
    :pswitch_data_9
    .packed-switch 0x32
        :pswitch_22
        :pswitch_21
        :pswitch_20
    .end packed-switch

    .line 1990
    .line 1991
    .line 1992
    .line 1993
    .line 1994
    .line 1995
    .line 1996
    .line 1997
    .line 1998
    .line 1999
    :pswitch_data_a
    .packed-switch 0x0
        :pswitch_46
        :pswitch_45
        :pswitch_44
        :pswitch_43
        :pswitch_47
        :pswitch_42
        :pswitch_41
        :pswitch_40
        :pswitch_3f
        :pswitch_3e
        :pswitch_3d
        :pswitch_3c
        :pswitch_3b
        :pswitch_3a
        :pswitch_39
        :pswitch_38
        :pswitch_37
        :pswitch_36
        :pswitch_35
        :pswitch_34
        :pswitch_33
        :pswitch_32
        :pswitch_31
        :pswitch_30
    .end packed-switch
.end method

.method public static c(Ljava/lang/String;[Ljava/lang/String;Ln74;)Landroid/util/Pair;
    .locals 7

    .line 1
    array-length v0, p1

    .line 2
    const/4 v1, 0x0

    .line 3
    const-string v2, "Ignoring malformed HEVC codec string: "

    .line 4
    .line 5
    const/4 v3, 0x4

    .line 6
    if-ge v0, v3, :cond_0

    .line 7
    .line 8
    invoke-static {p0, v2}, Lga1;->p(Ljava/lang/String;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-object v1

    .line 12
    :cond_0
    sget-object v0, Lmo2;->c:Ljava/util/regex/Pattern;

    .line 13
    .line 14
    const/4 v4, 0x1

    .line 15
    aget-object v5, p1, v4

    .line 16
    .line 17
    invoke-virtual {v0, v5}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->matches()Z

    .line 22
    .line 23
    .line 24
    move-result v5

    .line 25
    if-nez v5, :cond_1

    .line 26
    .line 27
    invoke-static {p0, v2}, Lga1;->p(Ljava/lang/String;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    return-object v1

    .line 31
    :cond_1
    invoke-virtual {v0, v4}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    const-string v0, "1"

    .line 36
    .line 37
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    const/16 v2, 0x1000

    .line 42
    .line 43
    const/4 v5, 0x2

    .line 44
    if-eqz v0, :cond_2

    .line 45
    .line 46
    move v6, v4

    .line 47
    goto :goto_0

    .line 48
    :cond_2
    const-string v0, "2"

    .line 49
    .line 50
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    const/4 v6, 0x6

    .line 55
    if-eqz v0, :cond_4

    .line 56
    .line 57
    if-eqz p2, :cond_3

    .line 58
    .line 59
    iget p0, p2, Ln74;->c:I

    .line 60
    .line 61
    if-ne p0, v6, :cond_3

    .line 62
    .line 63
    move v6, v2

    .line 64
    goto :goto_0

    .line 65
    :cond_3
    move v6, v5

    .line 66
    goto :goto_0

    .line 67
    :cond_4
    const-string p2, "6"

    .line 68
    .line 69
    invoke-virtual {p2, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result p2

    .line 73
    if-eqz p2, :cond_8

    .line 74
    .line 75
    :goto_0
    const/4 p0, 0x3

    .line 76
    aget-object p0, p1, p0

    .line 77
    .line 78
    if-nez p0, :cond_6

    .line 79
    .line 80
    :cond_5
    :goto_1
    move-object p1, v1

    .line 81
    goto/16 :goto_2

    .line 82
    .line 83
    :cond_6
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 84
    .line 85
    .line 86
    move-result p1

    .line 87
    sparse-switch p1, :sswitch_data_0

    .line 88
    .line 89
    .line 90
    goto :goto_1

    .line 91
    :sswitch_0
    const-string p1, "L186"

    .line 92
    .line 93
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move-result p1

    .line 97
    if-eqz p1, :cond_5

    .line 98
    .line 99
    const/high16 p1, 0x1000000

    .line 100
    .line 101
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    goto/16 :goto_2

    .line 106
    .line 107
    :sswitch_1
    const-string p1, "L183"

    .line 108
    .line 109
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    move-result p1

    .line 113
    if-eqz p1, :cond_5

    .line 114
    .line 115
    const/high16 p1, 0x400000

    .line 116
    .line 117
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    goto/16 :goto_2

    .line 122
    .line 123
    :sswitch_2
    const-string p1, "L180"

    .line 124
    .line 125
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    move-result p1

    .line 129
    if-eqz p1, :cond_5

    .line 130
    .line 131
    const/high16 p1, 0x100000

    .line 132
    .line 133
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 134
    .line 135
    .line 136
    move-result-object p1

    .line 137
    goto/16 :goto_2

    .line 138
    .line 139
    :sswitch_3
    const-string p1, "L156"

    .line 140
    .line 141
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    move-result p1

    .line 145
    if-eqz p1, :cond_5

    .line 146
    .line 147
    const/high16 p1, 0x40000

    .line 148
    .line 149
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 150
    .line 151
    .line 152
    move-result-object p1

    .line 153
    goto/16 :goto_2

    .line 154
    .line 155
    :sswitch_4
    const-string p1, "L153"

    .line 156
    .line 157
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 158
    .line 159
    .line 160
    move-result p1

    .line 161
    if-eqz p1, :cond_5

    .line 162
    .line 163
    const/high16 p1, 0x10000

    .line 164
    .line 165
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 166
    .line 167
    .line 168
    move-result-object p1

    .line 169
    goto/16 :goto_2

    .line 170
    .line 171
    :sswitch_5
    const-string p1, "L150"

    .line 172
    .line 173
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 174
    .line 175
    .line 176
    move-result p1

    .line 177
    if-eqz p1, :cond_5

    .line 178
    .line 179
    const/16 p1, 0x4000

    .line 180
    .line 181
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 182
    .line 183
    .line 184
    move-result-object p1

    .line 185
    goto/16 :goto_2

    .line 186
    .line 187
    :sswitch_6
    const-string p1, "L123"

    .line 188
    .line 189
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 190
    .line 191
    .line 192
    move-result p1

    .line 193
    if-eqz p1, :cond_5

    .line 194
    .line 195
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 196
    .line 197
    .line 198
    move-result-object p1

    .line 199
    goto/16 :goto_2

    .line 200
    .line 201
    :sswitch_7
    const-string p1, "L120"

    .line 202
    .line 203
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 204
    .line 205
    .line 206
    move-result p1

    .line 207
    if-eqz p1, :cond_5

    .line 208
    .line 209
    const/16 p1, 0x400

    .line 210
    .line 211
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 212
    .line 213
    .line 214
    move-result-object p1

    .line 215
    goto/16 :goto_2

    .line 216
    .line 217
    :sswitch_8
    const-string p1, "H186"

    .line 218
    .line 219
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 220
    .line 221
    .line 222
    move-result p1

    .line 223
    if-eqz p1, :cond_5

    .line 224
    .line 225
    const/high16 p1, 0x2000000

    .line 226
    .line 227
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 228
    .line 229
    .line 230
    move-result-object p1

    .line 231
    goto/16 :goto_2

    .line 232
    .line 233
    :sswitch_9
    const-string p1, "H183"

    .line 234
    .line 235
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 236
    .line 237
    .line 238
    move-result p1

    .line 239
    if-eqz p1, :cond_5

    .line 240
    .line 241
    const/high16 p1, 0x800000

    .line 242
    .line 243
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 244
    .line 245
    .line 246
    move-result-object p1

    .line 247
    goto/16 :goto_2

    .line 248
    .line 249
    :sswitch_a
    const-string p1, "H180"

    .line 250
    .line 251
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 252
    .line 253
    .line 254
    move-result p1

    .line 255
    if-eqz p1, :cond_5

    .line 256
    .line 257
    const/high16 p1, 0x200000

    .line 258
    .line 259
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 260
    .line 261
    .line 262
    move-result-object p1

    .line 263
    goto/16 :goto_2

    .line 264
    .line 265
    :sswitch_b
    const-string p1, "H156"

    .line 266
    .line 267
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 268
    .line 269
    .line 270
    move-result p1

    .line 271
    if-eqz p1, :cond_5

    .line 272
    .line 273
    const/high16 p1, 0x80000

    .line 274
    .line 275
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 276
    .line 277
    .line 278
    move-result-object p1

    .line 279
    goto/16 :goto_2

    .line 280
    .line 281
    :sswitch_c
    const-string p1, "H153"

    .line 282
    .line 283
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 284
    .line 285
    .line 286
    move-result p1

    .line 287
    if-eqz p1, :cond_5

    .line 288
    .line 289
    const/high16 p1, 0x20000

    .line 290
    .line 291
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 292
    .line 293
    .line 294
    move-result-object p1

    .line 295
    goto/16 :goto_2

    .line 296
    .line 297
    :sswitch_d
    const-string p1, "H150"

    .line 298
    .line 299
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 300
    .line 301
    .line 302
    move-result p1

    .line 303
    if-eqz p1, :cond_5

    .line 304
    .line 305
    const p1, 0x8000

    .line 306
    .line 307
    .line 308
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 309
    .line 310
    .line 311
    move-result-object p1

    .line 312
    goto/16 :goto_2

    .line 313
    .line 314
    :sswitch_e
    const-string p1, "H123"

    .line 315
    .line 316
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 317
    .line 318
    .line 319
    move-result p1

    .line 320
    if-eqz p1, :cond_5

    .line 321
    .line 322
    const/16 p1, 0x2000

    .line 323
    .line 324
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 325
    .line 326
    .line 327
    move-result-object p1

    .line 328
    goto/16 :goto_2

    .line 329
    .line 330
    :sswitch_f
    const-string p1, "H120"

    .line 331
    .line 332
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 333
    .line 334
    .line 335
    move-result p1

    .line 336
    if-eqz p1, :cond_5

    .line 337
    .line 338
    const/16 p1, 0x800

    .line 339
    .line 340
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 341
    .line 342
    .line 343
    move-result-object p1

    .line 344
    goto/16 :goto_2

    .line 345
    .line 346
    :sswitch_10
    const-string p1, "L93"

    .line 347
    .line 348
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 349
    .line 350
    .line 351
    move-result p1

    .line 352
    if-eqz p1, :cond_5

    .line 353
    .line 354
    const/16 p1, 0x100

    .line 355
    .line 356
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 357
    .line 358
    .line 359
    move-result-object p1

    .line 360
    goto/16 :goto_2

    .line 361
    .line 362
    :sswitch_11
    const-string p1, "L90"

    .line 363
    .line 364
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 365
    .line 366
    .line 367
    move-result p1

    .line 368
    if-eqz p1, :cond_5

    .line 369
    .line 370
    const/16 p1, 0x40

    .line 371
    .line 372
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 373
    .line 374
    .line 375
    move-result-object p1

    .line 376
    goto/16 :goto_2

    .line 377
    .line 378
    :sswitch_12
    const-string p1, "L63"

    .line 379
    .line 380
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 381
    .line 382
    .line 383
    move-result p1

    .line 384
    if-eqz p1, :cond_5

    .line 385
    .line 386
    const/16 p1, 0x10

    .line 387
    .line 388
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 389
    .line 390
    .line 391
    move-result-object p1

    .line 392
    goto :goto_2

    .line 393
    :sswitch_13
    const-string p1, "L60"

    .line 394
    .line 395
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 396
    .line 397
    .line 398
    move-result p1

    .line 399
    if-eqz p1, :cond_5

    .line 400
    .line 401
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 402
    .line 403
    .line 404
    move-result-object p1

    .line 405
    goto :goto_2

    .line 406
    :sswitch_14
    const-string p1, "L30"

    .line 407
    .line 408
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 409
    .line 410
    .line 411
    move-result p1

    .line 412
    if-eqz p1, :cond_5

    .line 413
    .line 414
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 415
    .line 416
    .line 417
    move-result-object p1

    .line 418
    goto :goto_2

    .line 419
    :sswitch_15
    const-string p1, "H93"

    .line 420
    .line 421
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 422
    .line 423
    .line 424
    move-result p1

    .line 425
    if-eqz p1, :cond_5

    .line 426
    .line 427
    const/16 p1, 0x200

    .line 428
    .line 429
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 430
    .line 431
    .line 432
    move-result-object p1

    .line 433
    goto :goto_2

    .line 434
    :sswitch_16
    const-string p1, "H90"

    .line 435
    .line 436
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 437
    .line 438
    .line 439
    move-result p1

    .line 440
    if-eqz p1, :cond_5

    .line 441
    .line 442
    const/16 p1, 0x80

    .line 443
    .line 444
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 445
    .line 446
    .line 447
    move-result-object p1

    .line 448
    goto :goto_2

    .line 449
    :sswitch_17
    const-string p1, "H63"

    .line 450
    .line 451
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 452
    .line 453
    .line 454
    move-result p1

    .line 455
    if-eqz p1, :cond_5

    .line 456
    .line 457
    const/16 p1, 0x20

    .line 458
    .line 459
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 460
    .line 461
    .line 462
    move-result-object p1

    .line 463
    goto :goto_2

    .line 464
    :sswitch_18
    const-string p1, "H60"

    .line 465
    .line 466
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 467
    .line 468
    .line 469
    move-result p1

    .line 470
    if-eqz p1, :cond_5

    .line 471
    .line 472
    const/16 p1, 0x8

    .line 473
    .line 474
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 475
    .line 476
    .line 477
    move-result-object p1

    .line 478
    goto :goto_2

    .line 479
    :sswitch_19
    const-string p1, "H30"

    .line 480
    .line 481
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 482
    .line 483
    .line 484
    move-result p1

    .line 485
    if-eqz p1, :cond_5

    .line 486
    .line 487
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 488
    .line 489
    .line 490
    move-result-object p1

    .line 491
    :goto_2
    if-nez p1, :cond_7

    .line 492
    .line 493
    const-string p1, "Unknown HEVC level string: "

    .line 494
    .line 495
    invoke-static {p0, p1}, Lga1;->p(Ljava/lang/String;Ljava/lang/String;)V

    .line 496
    .line 497
    .line 498
    return-object v1

    .line 499
    :cond_7
    new-instance p0, Landroid/util/Pair;

    .line 500
    .line 501
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 502
    .line 503
    .line 504
    move-result-object p2

    .line 505
    invoke-direct {p0, p2, p1}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 506
    .line 507
    .line 508
    return-object p0

    .line 509
    :cond_8
    const-string p1, "Unknown HEVC profile string: "

    .line 510
    .line 511
    invoke-static {p0, p1}, Lga1;->p(Ljava/lang/String;Ljava/lang/String;)V

    .line 512
    .line 513
    .line 514
    return-object v1

    .line 515
    :sswitch_data_0
    .sparse-switch
        0x114a5 -> :sswitch_19
        0x11502 -> :sswitch_18
        0x11505 -> :sswitch_17
        0x1155f -> :sswitch_16
        0x11562 -> :sswitch_15
        0x123a9 -> :sswitch_14
        0x12406 -> :sswitch_13
        0x12409 -> :sswitch_12
        0x12463 -> :sswitch_11
        0x12466 -> :sswitch_10
        0x2178e7 -> :sswitch_f
        0x2178ea -> :sswitch_e
        0x217944 -> :sswitch_d
        0x217947 -> :sswitch_c
        0x21794a -> :sswitch_b
        0x2179a1 -> :sswitch_a
        0x2179a4 -> :sswitch_9
        0x2179a7 -> :sswitch_8
        0x234a63 -> :sswitch_7
        0x234a66 -> :sswitch_6
        0x234ac0 -> :sswitch_5
        0x234ac3 -> :sswitch_4
        0x234ac6 -> :sswitch_3
        0x234b1d -> :sswitch_2
        0x234b20 -> :sswitch_1
        0x234b23 -> :sswitch_0
    .end sparse-switch
.end method
