.class public final Lnj1;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Llf1;


# static fields
.field public static final synthetic z:I


# instance fields
.field public final a:Ljk1;

.field public final b:I

.field public final c:Lkz2;

.field public final d:Lkz2;

.field public final e:Lkz2;

.field public final f:Lkz2;

.field public final g:Ljava/util/ArrayDeque;

.field public final h:Lpj1;

.field public final i:Ljava/util/ArrayList;

.field public j:Lsn3;

.field public k:I

.field public l:I

.field public m:J

.field public n:I

.field public o:Lkz2;

.field public p:I

.field public q:I

.field public r:I

.field public s:I

.field public t:Z

.field public u:Z

.field public v:Lnf1;

.field public w:[Lmj1;

.field public x:[[J

.field public y:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget v0, Lyb;->r:I

    .line 2
    .line 3
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    sget-object v0, Ljk1;->e:Lts0;

    const/16 v1, 0x10

    invoke-direct {p0, v0, v1}, Lnj1;-><init>(Ljk1;I)V

    return-void
.end method

.method public constructor <init>(Ljk1;I)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnj1;->a:Ljk1;

    iput p2, p0, Lnj1;->b:I

    sget-object p1, Lxm3;->g:Lvm3;

    .line 3
    sget-object p1, Lsn3;->j:Lsn3;

    .line 4
    iput-object p1, p0, Lnj1;->j:Lsn3;

    const/4 p1, 0x0

    iput p1, p0, Lnj1;->k:I

    .line 5
    new-instance p2, Lpj1;

    invoke-direct {p2}, Lpj1;-><init>()V

    iput-object p2, p0, Lnj1;->h:Lpj1;

    new-instance p2, Ljava/util/ArrayList;

    .line 6
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    iput-object p2, p0, Lnj1;->i:Ljava/util/ArrayList;

    .line 7
    new-instance p2, Lkz2;

    const/16 v0, 0x10

    invoke-direct {p2, v0}, Lkz2;-><init>(I)V

    iput-object p2, p0, Lnj1;->f:Lkz2;

    new-instance p2, Ljava/util/ArrayDeque;

    .line 8
    invoke-direct {p2}, Ljava/util/ArrayDeque;-><init>()V

    iput-object p2, p0, Lnj1;->g:Ljava/util/ArrayDeque;

    new-instance p2, Lkz2;

    .line 9
    sget-object v0, Lwl2;->G:[B

    invoke-direct {p2, v0}, Lkz2;-><init>([B)V

    iput-object p2, p0, Lnj1;->c:Lkz2;

    new-instance p2, Lkz2;

    const/4 v0, 0x6

    .line 10
    invoke-direct {p2, v0}, Lkz2;-><init>(I)V

    iput-object p2, p0, Lnj1;->d:Lkz2;

    new-instance p2, Lkz2;

    .line 11
    invoke-direct {p2}, Lkz2;-><init>()V

    iput-object p2, p0, Lnj1;->e:Lkz2;

    const/4 p2, -0x1

    iput p2, p0, Lnj1;->p:I

    sget-object p2, Lnf1;->d:Lts0;

    iput-object p2, p0, Lnj1;->v:Lnf1;

    new-array p1, p1, [Lmj1;

    iput-object p1, p0, Lnj1;->w:[Lmj1;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lnj1;->k:I

    .line 3
    .line 4
    iput v0, p0, Lnj1;->n:I

    .line 5
    .line 6
    return-void
.end method

.method public final b(Lmf1;)Z
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {p1, v0, v0}, Lg82;->D(Lmf1;ZZ)Lgg1;

    .line 3
    .line 4
    .line 5
    move-result-object p1

    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    invoke-static {p1}, Lxm3;->i(Ljava/lang/Object;)Lsn3;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    sget-object v1, Lxm3;->g:Lvm3;

    .line 14
    .line 15
    sget-object v1, Lsn3;->j:Lsn3;

    .line 16
    .line 17
    :goto_0
    iput-object v1, p0, Lnj1;->j:Lsn3;

    .line 18
    .line 19
    if-nez p1, :cond_1

    .line 20
    .line 21
    const/4 p1, 0x1

    .line 22
    return p1

    .line 23
    :cond_1
    return v0
.end method

.method public final c(Lmf1;Lpf1;)I
    .locals 37

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    :cond_0
    :goto_0
    iget v3, v1, Lnj1;->k:I

    .line 8
    .line 9
    const v4, 0x66747970

    .line 10
    .line 11
    .line 12
    iget-object v5, v1, Lnj1;->g:Ljava/util/ArrayDeque;

    .line 13
    .line 14
    iget-object v6, v1, Lnj1;->e:Lkz2;

    .line 15
    .line 16
    const/4 v14, 0x1

    .line 17
    const/4 v15, 0x0

    .line 18
    if-eqz v3, :cond_3e

    .line 19
    .line 20
    const-wide/32 v16, 0x40000

    .line 21
    .line 22
    .line 23
    const-wide/16 v18, -0x1

    .line 24
    .line 25
    const/4 v7, 0x2

    .line 26
    const/4 v8, 0x4

    .line 27
    if-eq v3, v14, :cond_31

    .line 28
    .line 29
    if-eq v3, v7, :cond_13

    .line 30
    .line 31
    iget-object v3, v1, Lnj1;->h:Lpj1;

    .line 32
    .line 33
    iget-object v6, v3, Lpj1;->a:Ljava/util/ArrayList;

    .line 34
    .line 35
    const-wide/16 v20, 0x8

    .line 36
    .line 37
    iget v4, v3, Lpj1;->b:I

    .line 38
    .line 39
    if-eqz v4, :cond_f

    .line 40
    .line 41
    if-eq v4, v14, :cond_d

    .line 42
    .line 43
    const/4 v5, 0x3

    .line 44
    const/16 v22, -0x1

    .line 45
    .line 46
    const/16 v12, 0xb04

    .line 47
    .line 48
    const/16 v23, 0x8

    .line 49
    .line 50
    const/16 v13, 0xb03

    .line 51
    .line 52
    const/16 v9, 0xb01

    .line 53
    .line 54
    const/16 v10, 0xb00

    .line 55
    .line 56
    const/16 v11, 0x890

    .line 57
    .line 58
    if-eq v4, v7, :cond_8

    .line 59
    .line 60
    invoke-interface {v0}, Lmf1;->o()J

    .line 61
    .line 62
    .line 63
    move-result-wide v16

    .line 64
    invoke-interface {v0}, Lmf1;->p()J

    .line 65
    .line 66
    .line 67
    move-result-wide v18

    .line 68
    invoke-interface {v0}, Lmf1;->o()J

    .line 69
    .line 70
    .line 71
    move-result-wide v20

    .line 72
    sub-long v18, v18, v20

    .line 73
    .line 74
    iget v3, v3, Lpj1;->c:I

    .line 75
    .line 76
    int-to-long v3, v3

    .line 77
    new-instance v7, Lkz2;

    .line 78
    .line 79
    sub-long v3, v18, v3

    .line 80
    .line 81
    long-to-int v3, v3

    .line 82
    invoke-direct {v7, v3}, Lkz2;-><init>(I)V

    .line 83
    .line 84
    .line 85
    iget-object v4, v7, Lkz2;->a:[B

    .line 86
    .line 87
    invoke-interface {v0, v4, v15, v3}, Lmf1;->x([BII)V

    .line 88
    .line 89
    .line 90
    move v0, v15

    .line 91
    :goto_1
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 92
    .line 93
    .line 94
    move-result v3

    .line 95
    if-ge v0, v3, :cond_7

    .line 96
    .line 97
    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v3

    .line 101
    check-cast v3, Loj1;

    .line 102
    .line 103
    iget-wide v14, v3, Loj1;->a:J

    .line 104
    .line 105
    sub-long v14, v14, v16

    .line 106
    .line 107
    long-to-int v4, v14

    .line 108
    invoke-virtual {v7, v4}, Lkz2;->E(I)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {v7, v8}, Lkz2;->G(I)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v7}, Lkz2;->c()I

    .line 115
    .line 116
    .line 117
    move-result v4

    .line 118
    sget-object v14, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 119
    .line 120
    invoke-virtual {v7, v4, v14}, Lkz2;->k(ILjava/nio/charset/Charset;)Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v15

    .line 124
    invoke-virtual {v15}, Ljava/lang/String;->hashCode()I

    .line 125
    .line 126
    .line 127
    move-result v18

    .line 128
    sparse-switch v18, :sswitch_data_0

    .line 129
    .line 130
    .line 131
    goto/16 :goto_5

    .line 132
    .line 133
    :sswitch_0
    const-string v8, "Super_SlowMotion_BGM"

    .line 134
    .line 135
    invoke-virtual {v15, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    move-result v8

    .line 139
    if-eqz v8, :cond_6

    .line 140
    .line 141
    move v8, v9

    .line 142
    goto :goto_2

    .line 143
    :sswitch_1
    const-string v8, "Super_SlowMotion_Deflickering_On"

    .line 144
    .line 145
    invoke-virtual {v15, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 146
    .line 147
    .line 148
    move-result v8

    .line 149
    if-eqz v8, :cond_6

    .line 150
    .line 151
    move v8, v12

    .line 152
    goto :goto_2

    .line 153
    :sswitch_2
    const-string v8, "Super_SlowMotion_Data"

    .line 154
    .line 155
    invoke-virtual {v15, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 156
    .line 157
    .line 158
    move-result v8

    .line 159
    if-eqz v8, :cond_6

    .line 160
    .line 161
    move v8, v10

    .line 162
    goto :goto_2

    .line 163
    :sswitch_3
    const-string v8, "Super_SlowMotion_Edit_Data"

    .line 164
    .line 165
    invoke-virtual {v15, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 166
    .line 167
    .line 168
    move-result v8

    .line 169
    if-eqz v8, :cond_6

    .line 170
    .line 171
    move v8, v13

    .line 172
    goto :goto_2

    .line 173
    :sswitch_4
    const-string v8, "SlowMotion_Data"

    .line 174
    .line 175
    invoke-virtual {v15, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 176
    .line 177
    .line 178
    move-result v8

    .line 179
    if-eqz v8, :cond_6

    .line 180
    .line 181
    move v8, v11

    .line 182
    :goto_2
    iget v3, v3, Loj1;->b:I

    .line 183
    .line 184
    add-int/lit8 v4, v4, 0x8

    .line 185
    .line 186
    sub-int/2addr v3, v4

    .line 187
    if-eq v8, v11, :cond_2

    .line 188
    .line 189
    if-eq v8, v10, :cond_5

    .line 190
    .line 191
    if-eq v8, v9, :cond_5

    .line 192
    .line 193
    if-eq v8, v13, :cond_5

    .line 194
    .line 195
    if-ne v8, v12, :cond_1

    .line 196
    .line 197
    goto/16 :goto_4

    .line 198
    .line 199
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 200
    .line 201
    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    .line 202
    .line 203
    .line 204
    throw v0

    .line 205
    :cond_2
    new-instance v4, Ljava/util/ArrayList;

    .line 206
    .line 207
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 208
    .line 209
    .line 210
    invoke-virtual {v7, v3, v14}, Lkz2;->k(ILjava/nio/charset/Charset;)Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object v3

    .line 214
    sget-object v8, Lpj1;->e:Lsq0;

    .line 215
    .line 216
    invoke-virtual {v8, v3}, Lsq0;->v(Ljava/lang/CharSequence;)Ljava/util/List;

    .line 217
    .line 218
    .line 219
    move-result-object v3

    .line 220
    const/4 v8, 0x0

    .line 221
    :goto_3
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 222
    .line 223
    .line 224
    move-result v14

    .line 225
    if-ge v8, v14, :cond_4

    .line 226
    .line 227
    sget-object v14, Lpj1;->d:Lsq0;

    .line 228
    .line 229
    invoke-interface {v3, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    move-result-object v15

    .line 233
    check-cast v15, Ljava/lang/CharSequence;

    .line 234
    .line 235
    invoke-virtual {v14, v15}, Lsq0;->v(Ljava/lang/CharSequence;)Ljava/util/List;

    .line 236
    .line 237
    .line 238
    move-result-object v14

    .line 239
    invoke-interface {v14}, Ljava/util/List;->size()I

    .line 240
    .line 241
    .line 242
    move-result v15

    .line 243
    if-ne v15, v5, :cond_3

    .line 244
    .line 245
    const/4 v15, 0x0

    .line 246
    :try_start_0
    invoke-interface {v14, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    move-result-object v18

    .line 250
    check-cast v18, Ljava/lang/String;

    .line 251
    .line 252
    invoke-static/range {v18 .. v18}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 253
    .line 254
    .line 255
    move-result-wide v31

    .line 256
    const/4 v15, 0x1

    .line 257
    invoke-interface {v14, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 258
    .line 259
    .line 260
    move-result-object v18

    .line 261
    check-cast v18, Ljava/lang/String;

    .line 262
    .line 263
    invoke-static/range {v18 .. v18}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 264
    .line 265
    .line 266
    move-result-wide v33

    .line 267
    const/4 v15, 0x2

    .line 268
    invoke-interface {v14, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 269
    .line 270
    .line 271
    move-result-object v14

    .line 272
    check-cast v14, Ljava/lang/String;

    .line 273
    .line 274
    invoke-static {v14}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 275
    .line 276
    .line 277
    move-result v14

    .line 278
    add-int/lit8 v14, v14, -0x1

    .line 279
    .line 280
    const/16 v27, 0x1

    .line 281
    .line 282
    shl-int v30, v27, v14

    .line 283
    .line 284
    new-instance v29, Ldi1;

    .line 285
    .line 286
    invoke-direct/range {v29 .. v34}, Ldi1;-><init>(IJJ)V

    .line 287
    .line 288
    .line 289
    move-object/from16 v14, v29

    .line 290
    .line 291
    invoke-virtual {v4, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 292
    .line 293
    .line 294
    add-int/lit8 v8, v8, 0x1

    .line 295
    .line 296
    goto :goto_3

    .line 297
    :catch_0
    move-exception v0

    .line 298
    const/4 v2, 0x0

    .line 299
    invoke-static {v0, v2}, Llq1;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Llq1;

    .line 300
    .line 301
    .line 302
    move-result-object v0

    .line 303
    throw v0

    .line 304
    :cond_3
    const/4 v2, 0x0

    .line 305
    invoke-static {v2, v2}, Llq1;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Llq1;

    .line 306
    .line 307
    .line 308
    move-result-object v0

    .line 309
    throw v0

    .line 310
    :cond_4
    new-instance v3, Lei1;

    .line 311
    .line 312
    invoke-direct {v3, v4}, Lei1;-><init>(Ljava/util/ArrayList;)V

    .line 313
    .line 314
    .line 315
    iget-object v4, v1, Lnj1;->i:Ljava/util/ArrayList;

    .line 316
    .line 317
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 318
    .line 319
    .line 320
    :cond_5
    :goto_4
    add-int/lit8 v0, v0, 0x1

    .line 321
    .line 322
    const/4 v8, 0x4

    .line 323
    const/4 v14, 0x1

    .line 324
    const/4 v15, 0x0

    .line 325
    goto/16 :goto_1

    .line 326
    .line 327
    :cond_6
    :goto_5
    const-string v0, "Invalid SEF name"

    .line 328
    .line 329
    const/4 v2, 0x0

    .line 330
    invoke-static {v2, v0}, Llq1;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Llq1;

    .line 331
    .line 332
    .line 333
    move-result-object v0

    .line 334
    throw v0

    .line 335
    :cond_7
    const-wide/16 v3, 0x0

    .line 336
    .line 337
    iput-wide v3, v2, Lpf1;->a:J

    .line 338
    .line 339
    :goto_6
    const/4 v15, 0x1

    .line 340
    goto/16 :goto_a

    .line 341
    .line 342
    :cond_8
    invoke-interface {v0}, Lmf1;->p()J

    .line 343
    .line 344
    .line 345
    move-result-wide v7

    .line 346
    iget v4, v3, Lpj1;->c:I

    .line 347
    .line 348
    add-int/lit8 v4, v4, -0x14

    .line 349
    .line 350
    new-instance v14, Lkz2;

    .line 351
    .line 352
    invoke-direct {v14, v4}, Lkz2;-><init>(I)V

    .line 353
    .line 354
    .line 355
    iget-object v15, v14, Lkz2;->a:[B

    .line 356
    .line 357
    const/4 v5, 0x0

    .line 358
    invoke-interface {v0, v15, v5, v4}, Lmf1;->x([BII)V

    .line 359
    .line 360
    .line 361
    const/4 v0, 0x0

    .line 362
    :goto_7
    div-int/lit8 v5, v4, 0xc

    .line 363
    .line 364
    if-ge v0, v5, :cond_b

    .line 365
    .line 366
    const/4 v15, 0x2

    .line 367
    invoke-virtual {v14, v15}, Lkz2;->G(I)V

    .line 368
    .line 369
    .line 370
    invoke-virtual {v14, v15}, Lkz2;->v(I)V

    .line 371
    .line 372
    .line 373
    iget-object v5, v14, Lkz2;->a:[B

    .line 374
    .line 375
    move/from16 v26, v15

    .line 376
    .line 377
    iget v15, v14, Lkz2;->b:I

    .line 378
    .line 379
    add-int/lit8 v12, v15, 0x1

    .line 380
    .line 381
    iput v12, v14, Lkz2;->b:I

    .line 382
    .line 383
    aget-byte v13, v5, v15

    .line 384
    .line 385
    and-int/lit16 v13, v13, 0xff

    .line 386
    .line 387
    add-int/lit8 v15, v15, 0x2

    .line 388
    .line 389
    iput v15, v14, Lkz2;->b:I

    .line 390
    .line 391
    aget-byte v5, v5, v12

    .line 392
    .line 393
    and-int/lit16 v5, v5, 0xff

    .line 394
    .line 395
    shl-int/lit8 v5, v5, 0x8

    .line 396
    .line 397
    or-int/2addr v5, v13

    .line 398
    int-to-short v5, v5

    .line 399
    if-eq v5, v11, :cond_9

    .line 400
    .line 401
    if-eq v5, v10, :cond_9

    .line 402
    .line 403
    if-eq v5, v9, :cond_9

    .line 404
    .line 405
    const/16 v12, 0xb03

    .line 406
    .line 407
    const/16 v13, 0xb04

    .line 408
    .line 409
    if-eq v5, v12, :cond_a

    .line 410
    .line 411
    if-eq v5, v13, :cond_a

    .line 412
    .line 413
    move/from16 v5, v23

    .line 414
    .line 415
    invoke-virtual {v14, v5}, Lkz2;->G(I)V

    .line 416
    .line 417
    .line 418
    goto :goto_8

    .line 419
    :cond_9
    const/16 v12, 0xb03

    .line 420
    .line 421
    const/16 v13, 0xb04

    .line 422
    .line 423
    :cond_a
    iget v5, v3, Lpj1;->c:I

    .line 424
    .line 425
    int-to-long v9, v5

    .line 426
    sub-long v9, v7, v9

    .line 427
    .line 428
    invoke-virtual {v14}, Lkz2;->c()I

    .line 429
    .line 430
    .line 431
    move-result v5

    .line 432
    int-to-long v11, v5

    .line 433
    invoke-virtual {v14}, Lkz2;->c()I

    .line 434
    .line 435
    .line 436
    move-result v5

    .line 437
    new-instance v13, Loj1;

    .line 438
    .line 439
    sub-long/2addr v9, v11

    .line 440
    invoke-direct {v13, v5, v9, v10}, Loj1;-><init>(IJ)V

    .line 441
    .line 442
    .line 443
    invoke-virtual {v6, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 444
    .line 445
    .line 446
    :goto_8
    add-int/lit8 v0, v0, 0x1

    .line 447
    .line 448
    const/16 v9, 0xb01

    .line 449
    .line 450
    const/16 v10, 0xb00

    .line 451
    .line 452
    const/16 v11, 0x890

    .line 453
    .line 454
    const/16 v12, 0xb04

    .line 455
    .line 456
    const/16 v13, 0xb03

    .line 457
    .line 458
    const/16 v23, 0x8

    .line 459
    .line 460
    goto :goto_7

    .line 461
    :cond_b
    invoke-virtual {v6}, Ljava/util/ArrayList;->isEmpty()Z

    .line 462
    .line 463
    .line 464
    move-result v0

    .line 465
    if-eqz v0, :cond_c

    .line 466
    .line 467
    const-wide/16 v4, 0x0

    .line 468
    .line 469
    iput-wide v4, v2, Lpf1;->a:J

    .line 470
    .line 471
    goto/16 :goto_6

    .line 472
    .line 473
    :cond_c
    const/4 v0, 0x3

    .line 474
    iput v0, v3, Lpj1;->b:I

    .line 475
    .line 476
    const/4 v15, 0x0

    .line 477
    invoke-virtual {v6, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 478
    .line 479
    .line 480
    move-result-object v0

    .line 481
    check-cast v0, Loj1;

    .line 482
    .line 483
    iget-wide v3, v0, Loj1;->a:J

    .line 484
    .line 485
    iput-wide v3, v2, Lpf1;->a:J

    .line 486
    .line 487
    goto/16 :goto_6

    .line 488
    .line 489
    :cond_d
    new-instance v4, Lkz2;

    .line 490
    .line 491
    const/16 v5, 0x8

    .line 492
    .line 493
    invoke-direct {v4, v5}, Lkz2;-><init>(I)V

    .line 494
    .line 495
    .line 496
    iget-object v6, v4, Lkz2;->a:[B

    .line 497
    .line 498
    invoke-interface {v0, v6, v15, v5}, Lmf1;->x([BII)V

    .line 499
    .line 500
    .line 501
    invoke-virtual {v4}, Lkz2;->c()I

    .line 502
    .line 503
    .line 504
    move-result v6

    .line 505
    add-int/2addr v6, v5

    .line 506
    iput v6, v3, Lpj1;->c:I

    .line 507
    .line 508
    invoke-virtual {v4}, Lkz2;->b()I

    .line 509
    .line 510
    .line 511
    move-result v4

    .line 512
    const v5, 0x53454654

    .line 513
    .line 514
    .line 515
    if-eq v4, v5, :cond_e

    .line 516
    .line 517
    const-wide/16 v4, 0x0

    .line 518
    .line 519
    iput-wide v4, v2, Lpf1;->a:J

    .line 520
    .line 521
    goto/16 :goto_6

    .line 522
    .line 523
    :cond_e
    invoke-interface {v0}, Lmf1;->o()J

    .line 524
    .line 525
    .line 526
    move-result-wide v4

    .line 527
    iget v0, v3, Lpj1;->c:I

    .line 528
    .line 529
    add-int/lit8 v0, v0, -0xc

    .line 530
    .line 531
    int-to-long v6, v0

    .line 532
    sub-long/2addr v4, v6

    .line 533
    iput-wide v4, v2, Lpf1;->a:J

    .line 534
    .line 535
    const/4 v15, 0x2

    .line 536
    iput v15, v3, Lpj1;->b:I

    .line 537
    .line 538
    goto/16 :goto_6

    .line 539
    .line 540
    :cond_f
    invoke-interface {v0}, Lmf1;->p()J

    .line 541
    .line 542
    .line 543
    move-result-wide v4

    .line 544
    cmp-long v0, v4, v18

    .line 545
    .line 546
    if-eqz v0, :cond_10

    .line 547
    .line 548
    cmp-long v0, v4, v20

    .line 549
    .line 550
    if-gez v0, :cond_11

    .line 551
    .line 552
    :cond_10
    const-wide/16 v4, 0x0

    .line 553
    .line 554
    goto :goto_9

    .line 555
    :cond_11
    const-wide/16 v6, -0x8

    .line 556
    .line 557
    add-long/2addr v4, v6

    .line 558
    :goto_9
    iput-wide v4, v2, Lpf1;->a:J

    .line 559
    .line 560
    const/4 v15, 0x1

    .line 561
    iput v15, v3, Lpj1;->b:I

    .line 562
    .line 563
    :goto_a
    iget-wide v2, v2, Lpf1;->a:J

    .line 564
    .line 565
    const-wide/16 v24, 0x0

    .line 566
    .line 567
    cmp-long v0, v2, v24

    .line 568
    .line 569
    if-nez v0, :cond_12

    .line 570
    .line 571
    invoke-virtual {v1}, Lnj1;->a()V

    .line 572
    .line 573
    .line 574
    return v15

    .line 575
    :cond_12
    move v11, v15

    .line 576
    goto/16 :goto_1c

    .line 577
    .line 578
    :cond_13
    const-wide/16 v20, 0x8

    .line 579
    .line 580
    const/16 v22, -0x1

    .line 581
    .line 582
    invoke-interface {v0}, Lmf1;->o()J

    .line 583
    .line 584
    .line 585
    move-result-wide v3

    .line 586
    iget v5, v1, Lnj1;->p:I

    .line 587
    .line 588
    move/from16 v7, v22

    .line 589
    .line 590
    if-ne v5, v7, :cond_1d

    .line 591
    .line 592
    const/4 v5, -0x1

    .line 593
    const/4 v9, -0x1

    .line 594
    const/4 v10, 0x1

    .line 595
    const/4 v11, 0x1

    .line 596
    const/4 v12, 0x0

    .line 597
    const-wide v13, 0x7fffffffffffffffL

    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    const-wide v18, 0x7fffffffffffffffL

    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    const-wide v29, 0x7fffffffffffffffL

    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    :goto_b
    iget-object v15, v1, Lnj1;->w:[Lmj1;

    .line 613
    .line 614
    const-wide v31, 0x7fffffffffffffffL

    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    array-length v7, v15

    .line 620
    if-ge v12, v7, :cond_1b

    .line 621
    .line 622
    aget-object v7, v15, v12

    .line 623
    .line 624
    iget v8, v7, Lmj1;->e:I

    .line 625
    .line 626
    iget-object v7, v7, Lmj1;->b:Ltj1;

    .line 627
    .line 628
    iget v15, v7, Ltj1;->b:I

    .line 629
    .line 630
    if-ne v8, v15, :cond_14

    .line 631
    .line 632
    goto :goto_d

    .line 633
    :cond_14
    iget-object v7, v7, Ltj1;->c:[J

    .line 634
    .line 635
    aget-wide v33, v7, v8

    .line 636
    .line 637
    iget-object v7, v1, Lnj1;->x:[[J

    .line 638
    .line 639
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 640
    .line 641
    .line 642
    aget-object v7, v7, v12

    .line 643
    .line 644
    aget-wide v35, v7, v8

    .line 645
    .line 646
    sub-long v33, v33, v3

    .line 647
    .line 648
    const-wide/16 v24, 0x0

    .line 649
    .line 650
    cmp-long v7, v33, v24

    .line 651
    .line 652
    if-ltz v7, :cond_15

    .line 653
    .line 654
    cmp-long v7, v33, v16

    .line 655
    .line 656
    if-ltz v7, :cond_16

    .line 657
    .line 658
    :cond_15
    const/4 v7, 0x1

    .line 659
    goto :goto_c

    .line 660
    :cond_16
    const/4 v7, 0x0

    .line 661
    :goto_c
    if-nez v7, :cond_17

    .line 662
    .line 663
    if-nez v11, :cond_18

    .line 664
    .line 665
    const/4 v11, 0x0

    .line 666
    :cond_17
    if-ne v7, v11, :cond_19

    .line 667
    .line 668
    cmp-long v8, v33, v29

    .line 669
    .line 670
    if-gez v8, :cond_19

    .line 671
    .line 672
    :cond_18
    move v11, v7

    .line 673
    move v9, v12

    .line 674
    move-wide/from16 v29, v33

    .line 675
    .line 676
    move-wide/from16 v18, v35

    .line 677
    .line 678
    :cond_19
    cmp-long v8, v35, v13

    .line 679
    .line 680
    if-gez v8, :cond_1a

    .line 681
    .line 682
    move v10, v7

    .line 683
    move v5, v12

    .line 684
    move-wide/from16 v13, v35

    .line 685
    .line 686
    :cond_1a
    :goto_d
    add-int/lit8 v12, v12, 0x1

    .line 687
    .line 688
    goto :goto_b

    .line 689
    :cond_1b
    cmp-long v7, v13, v31

    .line 690
    .line 691
    if-eqz v7, :cond_1c

    .line 692
    .line 693
    if-eqz v10, :cond_1c

    .line 694
    .line 695
    const-wide/32 v7, 0xa00000

    .line 696
    .line 697
    .line 698
    add-long/2addr v13, v7

    .line 699
    cmp-long v7, v18, v13

    .line 700
    .line 701
    if-ltz v7, :cond_1c

    .line 702
    .line 703
    goto :goto_e

    .line 704
    :cond_1c
    move v5, v9

    .line 705
    :goto_e
    iput v5, v1, Lnj1;->p:I

    .line 706
    .line 707
    const/4 v7, -0x1

    .line 708
    if-ne v5, v7, :cond_1d

    .line 709
    .line 710
    return v7

    .line 711
    :cond_1d
    iget-object v7, v1, Lnj1;->w:[Lmj1;

    .line 712
    .line 713
    aget-object v5, v7, v5

    .line 714
    .line 715
    iget-object v7, v5, Lmj1;->c:Ljg1;

    .line 716
    .line 717
    iget v15, v5, Lmj1;->e:I

    .line 718
    .line 719
    iget-object v8, v5, Lmj1;->b:Ltj1;

    .line 720
    .line 721
    iget-object v9, v8, Ltj1;->c:[J

    .line 722
    .line 723
    aget-wide v10, v9, v15

    .line 724
    .line 725
    iget-object v9, v8, Ltj1;->d:[I

    .line 726
    .line 727
    aget v12, v9, v15

    .line 728
    .line 729
    iget-object v13, v5, Lmj1;->d:Lkg1;

    .line 730
    .line 731
    sub-long v3, v10, v3

    .line 732
    .line 733
    iget v14, v1, Lnj1;->q:I

    .line 734
    .line 735
    move-wide/from16 v18, v3

    .line 736
    .line 737
    int-to-long v3, v14

    .line 738
    add-long v3, v18, v3

    .line 739
    .line 740
    const-wide/16 v24, 0x0

    .line 741
    .line 742
    cmp-long v14, v3, v24

    .line 743
    .line 744
    if-ltz v14, :cond_1e

    .line 745
    .line 746
    cmp-long v14, v3, v16

    .line 747
    .line 748
    if-ltz v14, :cond_1f

    .line 749
    .line 750
    :cond_1e
    const/16 v27, 0x1

    .line 751
    .line 752
    goto/16 :goto_16

    .line 753
    .line 754
    :cond_1f
    iget-object v2, v5, Lmj1;->a:Lqj1;

    .line 755
    .line 756
    iget v10, v2, Lqj1;->h:I

    .line 757
    .line 758
    const/4 v11, 0x1

    .line 759
    if-ne v10, v11, :cond_20

    .line 760
    .line 761
    add-long v3, v3, v20

    .line 762
    .line 763
    add-int/lit8 v12, v12, -0x8

    .line 764
    .line 765
    :cond_20
    long-to-int v3, v3

    .line 766
    invoke-interface {v0, v3}, Lmf1;->t(I)V

    .line 767
    .line 768
    .line 769
    iget-object v3, v2, Lqj1;->g:Lph4;

    .line 770
    .line 771
    iget-object v4, v3, Lph4;->m:Ljava/lang/String;

    .line 772
    .line 773
    const-string v10, "video/avc"

    .line 774
    .line 775
    invoke-static {v4, v10}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 776
    .line 777
    .line 778
    move-result v10

    .line 779
    if-nez v10, :cond_21

    .line 780
    .line 781
    const-string v10, "video/hevc"

    .line 782
    .line 783
    invoke-static {v4, v10}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 784
    .line 785
    .line 786
    :cond_21
    const/4 v11, 0x1

    .line 787
    iput-boolean v11, v1, Lnj1;->t:Z

    .line 788
    .line 789
    iget v2, v2, Lqj1;->k:I

    .line 790
    .line 791
    if-eqz v2, :cond_28

    .line 792
    .line 793
    iget-object v4, v1, Lnj1;->d:Lkz2;

    .line 794
    .line 795
    iget-object v6, v4, Lkz2;->a:[B

    .line 796
    .line 797
    const/16 v28, 0x0

    .line 798
    .line 799
    aput-byte v28, v6, v28

    .line 800
    .line 801
    aput-byte v28, v6, v11

    .line 802
    .line 803
    const/16 v26, 0x2

    .line 804
    .line 805
    aput-byte v28, v6, v26

    .line 806
    .line 807
    rsub-int/lit8 v10, v2, 0x4

    .line 808
    .line 809
    add-int/2addr v12, v10

    .line 810
    :goto_f
    iget v11, v1, Lnj1;->r:I

    .line 811
    .line 812
    if-ge v11, v12, :cond_27

    .line 813
    .line 814
    iget v11, v1, Lnj1;->s:I

    .line 815
    .line 816
    if-nez v11, :cond_26

    .line 817
    .line 818
    iget-boolean v11, v1, Lnj1;->t:Z

    .line 819
    .line 820
    if-nez v11, :cond_23

    .line 821
    .line 822
    invoke-static {v3}, Lwl2;->H(Lph4;)I

    .line 823
    .line 824
    .line 825
    move-result v11

    .line 826
    add-int/2addr v11, v2

    .line 827
    aget v14, v9, v15

    .line 828
    .line 829
    move/from16 v16, v2

    .line 830
    .line 831
    iget v2, v1, Lnj1;->q:I

    .line 832
    .line 833
    sub-int/2addr v14, v2

    .line 834
    if-gt v11, v14, :cond_22

    .line 835
    .line 836
    invoke-static {v3}, Lwl2;->H(Lph4;)I

    .line 837
    .line 838
    .line 839
    move-result v2

    .line 840
    add-int v11, v16, v2

    .line 841
    .line 842
    goto :goto_11

    .line 843
    :cond_22
    :goto_10
    move/from16 v11, v16

    .line 844
    .line 845
    const/4 v2, 0x0

    .line 846
    goto :goto_11

    .line 847
    :cond_23
    move/from16 v16, v2

    .line 848
    .line 849
    goto :goto_10

    .line 850
    :goto_11
    invoke-interface {v0, v6, v10, v11}, Lmf1;->x([BII)V

    .line 851
    .line 852
    .line 853
    iget v14, v1, Lnj1;->q:I

    .line 854
    .line 855
    add-int/2addr v14, v11

    .line 856
    iput v14, v1, Lnj1;->q:I

    .line 857
    .line 858
    const/4 v11, 0x0

    .line 859
    invoke-virtual {v4, v11}, Lkz2;->E(I)V

    .line 860
    .line 861
    .line 862
    invoke-virtual {v4}, Lkz2;->b()I

    .line 863
    .line 864
    .line 865
    move-result v14

    .line 866
    if-ltz v14, :cond_25

    .line 867
    .line 868
    sub-int/2addr v14, v2

    .line 869
    iput v14, v1, Lnj1;->s:I

    .line 870
    .line 871
    iget-object v14, v1, Lnj1;->c:Lkz2;

    .line 872
    .line 873
    invoke-virtual {v14, v11}, Lkz2;->E(I)V

    .line 874
    .line 875
    .line 876
    move-object/from16 v18, v9

    .line 877
    .line 878
    const/4 v9, 0x4

    .line 879
    invoke-interface {v7, v14, v9, v11}, Ljg1;->a(Lkz2;II)V

    .line 880
    .line 881
    .line 882
    iget v14, v1, Lnj1;->r:I

    .line 883
    .line 884
    add-int/2addr v14, v9

    .line 885
    iput v14, v1, Lnj1;->r:I

    .line 886
    .line 887
    if-lez v2, :cond_24

    .line 888
    .line 889
    invoke-interface {v7, v4, v2, v11}, Ljg1;->a(Lkz2;II)V

    .line 890
    .line 891
    .line 892
    iget v9, v1, Lnj1;->r:I

    .line 893
    .line 894
    add-int/2addr v9, v2

    .line 895
    iput v9, v1, Lnj1;->r:I

    .line 896
    .line 897
    invoke-static {v6, v2, v3}, Lwl2;->M([BILph4;)Z

    .line 898
    .line 899
    .line 900
    move-result v2

    .line 901
    if-eqz v2, :cond_24

    .line 902
    .line 903
    const/4 v11, 0x1

    .line 904
    iput-boolean v11, v1, Lnj1;->t:Z

    .line 905
    .line 906
    :cond_24
    :goto_12
    move/from16 v2, v16

    .line 907
    .line 908
    move-object/from16 v9, v18

    .line 909
    .line 910
    goto :goto_f

    .line 911
    :cond_25
    const-string v0, "Invalid NAL length"

    .line 912
    .line 913
    const/4 v2, 0x0

    .line 914
    invoke-static {v2, v0}, Llq1;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Llq1;

    .line 915
    .line 916
    .line 917
    move-result-object v0

    .line 918
    throw v0

    .line 919
    :cond_26
    move/from16 v16, v2

    .line 920
    .line 921
    move-object/from16 v18, v9

    .line 922
    .line 923
    const/4 v2, 0x0

    .line 924
    invoke-interface {v7, v0, v11, v2}, Ljg1;->b(Lua4;IZ)I

    .line 925
    .line 926
    .line 927
    move-result v9

    .line 928
    iget v2, v1, Lnj1;->q:I

    .line 929
    .line 930
    add-int/2addr v2, v9

    .line 931
    iput v2, v1, Lnj1;->q:I

    .line 932
    .line 933
    iget v2, v1, Lnj1;->r:I

    .line 934
    .line 935
    add-int/2addr v2, v9

    .line 936
    iput v2, v1, Lnj1;->r:I

    .line 937
    .line 938
    iget v2, v1, Lnj1;->s:I

    .line 939
    .line 940
    sub-int/2addr v2, v9

    .line 941
    iput v2, v1, Lnj1;->s:I

    .line 942
    .line 943
    goto :goto_12

    .line 944
    :cond_27
    move v11, v12

    .line 945
    goto/16 :goto_14

    .line 946
    .line 947
    :cond_28
    const-string v2, "audio/ac4"

    .line 948
    .line 949
    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 950
    .line 951
    .line 952
    move-result v2

    .line 953
    if-eqz v2, :cond_2a

    .line 954
    .line 955
    iget v2, v1, Lnj1;->r:I

    .line 956
    .line 957
    if-nez v2, :cond_29

    .line 958
    .line 959
    invoke-static {v12, v6}, Lzt0;->P(ILkz2;)V

    .line 960
    .line 961
    .line 962
    const/4 v2, 0x7

    .line 963
    const/4 v11, 0x0

    .line 964
    invoke-interface {v7, v6, v2, v11}, Ljg1;->a(Lkz2;II)V

    .line 965
    .line 966
    .line 967
    iget v3, v1, Lnj1;->r:I

    .line 968
    .line 969
    add-int/2addr v3, v2

    .line 970
    iput v3, v1, Lnj1;->r:I

    .line 971
    .line 972
    :cond_29
    add-int/lit8 v12, v12, 0x7

    .line 973
    .line 974
    goto :goto_13

    .line 975
    :cond_2a
    iget-object v2, v5, Lmj1;->f:Lph4;

    .line 976
    .line 977
    if-eqz v2, :cond_2c

    .line 978
    .line 979
    const-string v2, "audio/mpeg"

    .line 980
    .line 981
    invoke-static {v4, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 982
    .line 983
    .line 984
    move-result v2

    .line 985
    if-eqz v2, :cond_2c

    .line 986
    .line 987
    iget-object v2, v5, Lmj1;->f:Lph4;

    .line 988
    .line 989
    const/4 v9, 0x4

    .line 990
    invoke-virtual {v6, v9}, Lkz2;->y(I)V

    .line 991
    .line 992
    .line 993
    iget-object v3, v6, Lkz2;->a:[B

    .line 994
    .line 995
    const/4 v11, 0x0

    .line 996
    invoke-interface {v0, v3, v11, v9}, Lmf1;->u([BII)V

    .line 997
    .line 998
    .line 999
    invoke-interface {v0}, Lmf1;->i()V

    .line 1000
    .line 1001
    .line 1002
    new-instance v3, Lxf1;

    .line 1003
    .line 1004
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 1005
    .line 1006
    .line 1007
    invoke-virtual {v6}, Lkz2;->b()I

    .line 1008
    .line 1009
    .line 1010
    move-result v4

    .line 1011
    invoke-virtual {v3, v4}, Lxf1;->a(I)Z

    .line 1012
    .line 1013
    .line 1014
    move-result v4

    .line 1015
    if-eqz v4, :cond_2b

    .line 1016
    .line 1017
    iget-object v4, v2, Lph4;->m:Ljava/lang/String;

    .line 1018
    .line 1019
    iget-object v6, v3, Lxf1;->g:Ljava/io/Serializable;

    .line 1020
    .line 1021
    check-cast v6, Ljava/lang/String;

    .line 1022
    .line 1023
    invoke-static {v4, v6}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1024
    .line 1025
    .line 1026
    move-result v4

    .line 1027
    if-nez v4, :cond_2b

    .line 1028
    .line 1029
    new-instance v4, Lgg4;

    .line 1030
    .line 1031
    invoke-direct {v4, v2}, Lgg4;-><init>(Lph4;)V

    .line 1032
    .line 1033
    .line 1034
    iget-object v2, v3, Lxf1;->g:Ljava/io/Serializable;

    .line 1035
    .line 1036
    check-cast v2, Ljava/lang/String;

    .line 1037
    .line 1038
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1039
    .line 1040
    .line 1041
    invoke-virtual {v4, v2}, Lgg4;->e(Ljava/lang/String;)V

    .line 1042
    .line 1043
    .line 1044
    new-instance v2, Lph4;

    .line 1045
    .line 1046
    invoke-direct {v2, v4}, Lph4;-><init>(Lgg4;)V

    .line 1047
    .line 1048
    .line 1049
    :cond_2b
    invoke-interface {v7, v2}, Ljg1;->d(Lph4;)V

    .line 1050
    .line 1051
    .line 1052
    const/4 v2, 0x0

    .line 1053
    iput-object v2, v5, Lmj1;->f:Lph4;

    .line 1054
    .line 1055
    goto :goto_13

    .line 1056
    :cond_2c
    if-eqz v13, :cond_2d

    .line 1057
    .line 1058
    invoke-virtual {v13, v0}, Lkg1;->a(Lmf1;)V

    .line 1059
    .line 1060
    .line 1061
    :cond_2d
    :goto_13
    iget v2, v1, Lnj1;->r:I

    .line 1062
    .line 1063
    if-ge v2, v12, :cond_27

    .line 1064
    .line 1065
    sub-int v2, v12, v2

    .line 1066
    .line 1067
    const/4 v11, 0x0

    .line 1068
    invoke-interface {v7, v0, v2, v11}, Ljg1;->b(Lua4;IZ)I

    .line 1069
    .line 1070
    .line 1071
    move-result v2

    .line 1072
    iget v3, v1, Lnj1;->q:I

    .line 1073
    .line 1074
    add-int/2addr v3, v2

    .line 1075
    iput v3, v1, Lnj1;->q:I

    .line 1076
    .line 1077
    iget v3, v1, Lnj1;->r:I

    .line 1078
    .line 1079
    add-int/2addr v3, v2

    .line 1080
    iput v3, v1, Lnj1;->r:I

    .line 1081
    .line 1082
    iget v3, v1, Lnj1;->s:I

    .line 1083
    .line 1084
    sub-int/2addr v3, v2

    .line 1085
    iput v3, v1, Lnj1;->s:I

    .line 1086
    .line 1087
    goto :goto_13

    .line 1088
    :goto_14
    iget-object v0, v8, Ltj1;->f:[J

    .line 1089
    .line 1090
    aget-wide v9, v0, v15

    .line 1091
    .line 1092
    iget-object v0, v8, Ltj1;->g:[I

    .line 1093
    .line 1094
    aget v0, v0, v15

    .line 1095
    .line 1096
    iget-boolean v2, v1, Lnj1;->t:Z

    .line 1097
    .line 1098
    if-nez v2, :cond_2e

    .line 1099
    .line 1100
    const/high16 v2, 0x4000000

    .line 1101
    .line 1102
    or-int/2addr v0, v2

    .line 1103
    :cond_2e
    if-eqz v13, :cond_2f

    .line 1104
    .line 1105
    move-object v2, v8

    .line 1106
    move-object v8, v7

    .line 1107
    move-object v7, v13

    .line 1108
    const/4 v13, 0x0

    .line 1109
    const/4 v14, 0x0

    .line 1110
    move v12, v11

    .line 1111
    move v11, v0

    .line 1112
    invoke-virtual/range {v7 .. v14}, Lkg1;->b(Ljg1;JIIILig1;)V

    .line 1113
    .line 1114
    .line 1115
    const/16 v27, 0x1

    .line 1116
    .line 1117
    add-int/lit8 v15, v15, 0x1

    .line 1118
    .line 1119
    iget v0, v2, Ltj1;->b:I

    .line 1120
    .line 1121
    if-ne v15, v0, :cond_30

    .line 1122
    .line 1123
    const/4 v2, 0x0

    .line 1124
    invoke-virtual {v7, v8, v2}, Lkg1;->c(Ljg1;Lig1;)V

    .line 1125
    .line 1126
    .line 1127
    goto :goto_15

    .line 1128
    :cond_2f
    move-object v8, v7

    .line 1129
    const/16 v27, 0x1

    .line 1130
    .line 1131
    const/4 v12, 0x0

    .line 1132
    const/4 v13, 0x0

    .line 1133
    move-wide v8, v9

    .line 1134
    move v10, v0

    .line 1135
    invoke-interface/range {v7 .. v13}, Ljg1;->c(JIIILig1;)V

    .line 1136
    .line 1137
    .line 1138
    :cond_30
    :goto_15
    iget v0, v5, Lmj1;->e:I

    .line 1139
    .line 1140
    add-int/lit8 v0, v0, 0x1

    .line 1141
    .line 1142
    iput v0, v5, Lmj1;->e:I

    .line 1143
    .line 1144
    const/4 v7, -0x1

    .line 1145
    iput v7, v1, Lnj1;->p:I

    .line 1146
    .line 1147
    const/4 v11, 0x0

    .line 1148
    iput v11, v1, Lnj1;->q:I

    .line 1149
    .line 1150
    iput v11, v1, Lnj1;->r:I

    .line 1151
    .line 1152
    iput v11, v1, Lnj1;->s:I

    .line 1153
    .line 1154
    iput-boolean v11, v1, Lnj1;->t:Z

    .line 1155
    .line 1156
    return v11

    .line 1157
    :goto_16
    iput-wide v10, v2, Lpf1;->a:J

    .line 1158
    .line 1159
    return v27

    .line 1160
    :cond_31
    iget-wide v6, v1, Lnj1;->m:J

    .line 1161
    .line 1162
    iget v3, v1, Lnj1;->n:I

    .line 1163
    .line 1164
    int-to-long v8, v3

    .line 1165
    sub-long/2addr v6, v8

    .line 1166
    invoke-interface {v0}, Lmf1;->o()J

    .line 1167
    .line 1168
    .line 1169
    move-result-wide v8

    .line 1170
    add-long/2addr v8, v6

    .line 1171
    iget-object v3, v1, Lnj1;->o:Lkz2;

    .line 1172
    .line 1173
    if-eqz v3, :cond_3b

    .line 1174
    .line 1175
    iget-object v10, v3, Lkz2;->a:[B

    .line 1176
    .line 1177
    iget v11, v1, Lnj1;->n:I

    .line 1178
    .line 1179
    long-to-int v6, v6

    .line 1180
    invoke-interface {v0, v10, v11, v6}, Lmf1;->x([BII)V

    .line 1181
    .line 1182
    .line 1183
    iget v6, v1, Lnj1;->l:I

    .line 1184
    .line 1185
    if-ne v6, v4, :cond_3a

    .line 1186
    .line 1187
    const/4 v11, 0x1

    .line 1188
    iput-boolean v11, v1, Lnj1;->u:Z

    .line 1189
    .line 1190
    const/16 v5, 0x8

    .line 1191
    .line 1192
    invoke-virtual {v3, v5}, Lkz2;->E(I)V

    .line 1193
    .line 1194
    .line 1195
    invoke-virtual {v3}, Lkz2;->b()I

    .line 1196
    .line 1197
    .line 1198
    move-result v4

    .line 1199
    const v5, 0x71742020

    .line 1200
    .line 1201
    .line 1202
    const v6, 0x68656963

    .line 1203
    .line 1204
    .line 1205
    if-eq v4, v6, :cond_33

    .line 1206
    .line 1207
    if-eq v4, v5, :cond_32

    .line 1208
    .line 1209
    const/4 v4, 0x0

    .line 1210
    goto :goto_17

    .line 1211
    :cond_32
    const/4 v4, 0x1

    .line 1212
    goto :goto_17

    .line 1213
    :cond_33
    const/4 v4, 0x2

    .line 1214
    :goto_17
    if-eqz v4, :cond_34

    .line 1215
    .line 1216
    goto :goto_19

    .line 1217
    :cond_34
    const/4 v4, 0x4

    .line 1218
    invoke-virtual {v3, v4}, Lkz2;->G(I)V

    .line 1219
    .line 1220
    .line 1221
    :cond_35
    invoke-virtual {v3}, Lkz2;->B()I

    .line 1222
    .line 1223
    .line 1224
    move-result v4

    .line 1225
    if-lez v4, :cond_38

    .line 1226
    .line 1227
    invoke-virtual {v3}, Lkz2;->b()I

    .line 1228
    .line 1229
    .line 1230
    move-result v4

    .line 1231
    if-eq v4, v6, :cond_37

    .line 1232
    .line 1233
    if-eq v4, v5, :cond_36

    .line 1234
    .line 1235
    const/4 v4, 0x0

    .line 1236
    goto :goto_18

    .line 1237
    :cond_36
    const/4 v4, 0x1

    .line 1238
    goto :goto_18

    .line 1239
    :cond_37
    const/4 v4, 0x2

    .line 1240
    :goto_18
    if-eqz v4, :cond_35

    .line 1241
    .line 1242
    goto :goto_19

    .line 1243
    :cond_38
    const/4 v4, 0x0

    .line 1244
    :goto_19
    iput v4, v1, Lnj1;->y:I

    .line 1245
    .line 1246
    :cond_39
    :goto_1a
    const/4 v15, 0x0

    .line 1247
    goto :goto_1b

    .line 1248
    :cond_3a
    invoke-virtual {v5}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 1249
    .line 1250
    .line 1251
    move-result v4

    .line 1252
    if-nez v4, :cond_39

    .line 1253
    .line 1254
    invoke-virtual {v5}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    .line 1255
    .line 1256
    .line 1257
    move-result-object v4

    .line 1258
    check-cast v4, Lm43;

    .line 1259
    .line 1260
    new-instance v5, Lp43;

    .line 1261
    .line 1262
    iget v6, v1, Lnj1;->l:I

    .line 1263
    .line 1264
    invoke-direct {v5, v6, v3}, Lp43;-><init>(ILkz2;)V

    .line 1265
    .line 1266
    .line 1267
    iget-object v3, v4, Lm43;->d:Ljava/util/ArrayList;

    .line 1268
    .line 1269
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1270
    .line 1271
    .line 1272
    goto :goto_1a

    .line 1273
    :cond_3b
    iget-boolean v3, v1, Lnj1;->u:Z

    .line 1274
    .line 1275
    if-nez v3, :cond_3c

    .line 1276
    .line 1277
    iget v3, v1, Lnj1;->l:I

    .line 1278
    .line 1279
    const v4, 0x6d646174

    .line 1280
    .line 1281
    .line 1282
    if-ne v3, v4, :cond_3c

    .line 1283
    .line 1284
    const/4 v11, 0x1

    .line 1285
    iput v11, v1, Lnj1;->y:I

    .line 1286
    .line 1287
    :cond_3c
    cmp-long v3, v6, v16

    .line 1288
    .line 1289
    if-gez v3, :cond_3d

    .line 1290
    .line 1291
    long-to-int v3, v6

    .line 1292
    invoke-interface {v0, v3}, Lmf1;->t(I)V

    .line 1293
    .line 1294
    .line 1295
    goto :goto_1a

    .line 1296
    :cond_3d
    invoke-interface {v0}, Lmf1;->o()J

    .line 1297
    .line 1298
    .line 1299
    move-result-wide v3

    .line 1300
    add-long/2addr v3, v6

    .line 1301
    iput-wide v3, v2, Lpf1;->a:J

    .line 1302
    .line 1303
    const/4 v15, 0x1

    .line 1304
    :goto_1b
    invoke-virtual {v1, v8, v9}, Lnj1;->g(J)V

    .line 1305
    .line 1306
    .line 1307
    if-eqz v15, :cond_0

    .line 1308
    .line 1309
    iget v3, v1, Lnj1;->k:I

    .line 1310
    .line 1311
    const/4 v15, 0x2

    .line 1312
    if-eq v3, v15, :cond_0

    .line 1313
    .line 1314
    const/4 v11, 0x1

    .line 1315
    :goto_1c
    return v11

    .line 1316
    :cond_3e
    move v11, v14

    .line 1317
    const-wide/16 v18, -0x1

    .line 1318
    .line 1319
    iget v3, v1, Lnj1;->n:I

    .line 1320
    .line 1321
    iget-object v7, v1, Lnj1;->f:Lkz2;

    .line 1322
    .line 1323
    if-nez v3, :cond_40

    .line 1324
    .line 1325
    iget-object v3, v7, Lkz2;->a:[B

    .line 1326
    .line 1327
    const/16 v8, 0x8

    .line 1328
    .line 1329
    const/4 v15, 0x0

    .line 1330
    invoke-interface {v0, v3, v15, v8, v11}, Lmf1;->w([BIIZ)Z

    .line 1331
    .line 1332
    .line 1333
    move-result v3

    .line 1334
    if-nez v3, :cond_3f

    .line 1335
    .line 1336
    const/16 v22, -0x1

    .line 1337
    .line 1338
    return v22

    .line 1339
    :cond_3f
    iput v8, v1, Lnj1;->n:I

    .line 1340
    .line 1341
    invoke-virtual {v7, v15}, Lkz2;->E(I)V

    .line 1342
    .line 1343
    .line 1344
    invoke-virtual {v7}, Lkz2;->P()J

    .line 1345
    .line 1346
    .line 1347
    move-result-wide v8

    .line 1348
    iput-wide v8, v1, Lnj1;->m:J

    .line 1349
    .line 1350
    invoke-virtual {v7}, Lkz2;->b()I

    .line 1351
    .line 1352
    .line 1353
    move-result v3

    .line 1354
    iput v3, v1, Lnj1;->l:I

    .line 1355
    .line 1356
    :cond_40
    iget-wide v8, v1, Lnj1;->m:J

    .line 1357
    .line 1358
    const-wide/16 v10, 0x1

    .line 1359
    .line 1360
    cmp-long v3, v8, v10

    .line 1361
    .line 1362
    if-nez v3, :cond_41

    .line 1363
    .line 1364
    iget-object v3, v7, Lkz2;->a:[B

    .line 1365
    .line 1366
    const/16 v8, 0x8

    .line 1367
    .line 1368
    invoke-interface {v0, v3, v8, v8}, Lmf1;->x([BII)V

    .line 1369
    .line 1370
    .line 1371
    iget v3, v1, Lnj1;->n:I

    .line 1372
    .line 1373
    add-int/2addr v3, v8

    .line 1374
    iput v3, v1, Lnj1;->n:I

    .line 1375
    .line 1376
    invoke-virtual {v7}, Lkz2;->j()J

    .line 1377
    .line 1378
    .line 1379
    move-result-wide v8

    .line 1380
    iput-wide v8, v1, Lnj1;->m:J

    .line 1381
    .line 1382
    goto :goto_1e

    .line 1383
    :cond_41
    const-wide/16 v24, 0x0

    .line 1384
    .line 1385
    cmp-long v3, v8, v24

    .line 1386
    .line 1387
    if-nez v3, :cond_44

    .line 1388
    .line 1389
    invoke-interface {v0}, Lmf1;->p()J

    .line 1390
    .line 1391
    .line 1392
    move-result-wide v8

    .line 1393
    cmp-long v3, v8, v18

    .line 1394
    .line 1395
    if-nez v3, :cond_43

    .line 1396
    .line 1397
    invoke-virtual {v5}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    .line 1398
    .line 1399
    .line 1400
    move-result-object v3

    .line 1401
    check-cast v3, Lm43;

    .line 1402
    .line 1403
    if-eqz v3, :cond_42

    .line 1404
    .line 1405
    iget-wide v8, v3, Lm43;->c:J

    .line 1406
    .line 1407
    goto :goto_1d

    .line 1408
    :cond_42
    move-wide/from16 v8, v18

    .line 1409
    .line 1410
    :cond_43
    :goto_1d
    cmp-long v3, v8, v18

    .line 1411
    .line 1412
    if-eqz v3, :cond_44

    .line 1413
    .line 1414
    invoke-interface {v0}, Lmf1;->o()J

    .line 1415
    .line 1416
    .line 1417
    move-result-wide v10

    .line 1418
    sub-long/2addr v8, v10

    .line 1419
    iget v3, v1, Lnj1;->n:I

    .line 1420
    .line 1421
    int-to-long v10, v3

    .line 1422
    add-long/2addr v8, v10

    .line 1423
    iput-wide v8, v1, Lnj1;->m:J

    .line 1424
    .line 1425
    :cond_44
    :goto_1e
    iget-wide v8, v1, Lnj1;->m:J

    .line 1426
    .line 1427
    iget v3, v1, Lnj1;->n:I

    .line 1428
    .line 1429
    int-to-long v10, v3

    .line 1430
    cmp-long v8, v8, v10

    .line 1431
    .line 1432
    if-gez v8, :cond_46

    .line 1433
    .line 1434
    iget v8, v1, Lnj1;->l:I

    .line 1435
    .line 1436
    const v9, 0x66726565

    .line 1437
    .line 1438
    .line 1439
    if-ne v8, v9, :cond_45

    .line 1440
    .line 1441
    const/16 v8, 0x8

    .line 1442
    .line 1443
    if-ne v3, v8, :cond_45

    .line 1444
    .line 1445
    iput-wide v10, v1, Lnj1;->m:J

    .line 1446
    .line 1447
    const/16 v3, 0x8

    .line 1448
    .line 1449
    goto :goto_1f

    .line 1450
    :cond_45
    const-string v0, "Atom size less than header length (unsupported)."

    .line 1451
    .line 1452
    invoke-static {v0}, Llq1;->b(Ljava/lang/String;)Llq1;

    .line 1453
    .line 1454
    .line 1455
    move-result-object v0

    .line 1456
    throw v0

    .line 1457
    :cond_46
    :goto_1f
    iget v8, v1, Lnj1;->l:I

    .line 1458
    .line 1459
    const v9, 0x6d6f6f76

    .line 1460
    .line 1461
    .line 1462
    const v10, 0x6d657461

    .line 1463
    .line 1464
    .line 1465
    if-eq v8, v9, :cond_4d

    .line 1466
    .line 1467
    const v9, 0x7472616b

    .line 1468
    .line 1469
    .line 1470
    if-eq v8, v9, :cond_4d

    .line 1471
    .line 1472
    const v9, 0x6d646961

    .line 1473
    .line 1474
    .line 1475
    if-eq v8, v9, :cond_4d

    .line 1476
    .line 1477
    const v9, 0x6d696e66

    .line 1478
    .line 1479
    .line 1480
    if-eq v8, v9, :cond_4d

    .line 1481
    .line 1482
    const v9, 0x7374626c

    .line 1483
    .line 1484
    .line 1485
    if-eq v8, v9, :cond_4d

    .line 1486
    .line 1487
    const v9, 0x65647473

    .line 1488
    .line 1489
    .line 1490
    if-eq v8, v9, :cond_4d

    .line 1491
    .line 1492
    if-eq v8, v10, :cond_4d

    .line 1493
    .line 1494
    const v9, 0x61787465

    .line 1495
    .line 1496
    .line 1497
    if-ne v8, v9, :cond_47

    .line 1498
    .line 1499
    goto/16 :goto_23

    .line 1500
    .line 1501
    :cond_47
    const v5, 0x6d646864

    .line 1502
    .line 1503
    .line 1504
    if-eq v8, v5, :cond_48

    .line 1505
    .line 1506
    const v5, 0x6d766864

    .line 1507
    .line 1508
    .line 1509
    if-eq v8, v5, :cond_48

    .line 1510
    .line 1511
    const v5, 0x68646c72    # 4.3148E24f

    .line 1512
    .line 1513
    .line 1514
    if-eq v8, v5, :cond_48

    .line 1515
    .line 1516
    const v5, 0x73747364

    .line 1517
    .line 1518
    .line 1519
    if-eq v8, v5, :cond_48

    .line 1520
    .line 1521
    const v5, 0x73747473

    .line 1522
    .line 1523
    .line 1524
    if-eq v8, v5, :cond_48

    .line 1525
    .line 1526
    const v5, 0x73747373

    .line 1527
    .line 1528
    .line 1529
    if-eq v8, v5, :cond_48

    .line 1530
    .line 1531
    const v5, 0x63747473

    .line 1532
    .line 1533
    .line 1534
    if-eq v8, v5, :cond_48

    .line 1535
    .line 1536
    const v5, 0x656c7374

    .line 1537
    .line 1538
    .line 1539
    if-eq v8, v5, :cond_48

    .line 1540
    .line 1541
    const v5, 0x73747363

    .line 1542
    .line 1543
    .line 1544
    if-eq v8, v5, :cond_48

    .line 1545
    .line 1546
    const v5, 0x7374737a

    .line 1547
    .line 1548
    .line 1549
    if-eq v8, v5, :cond_48

    .line 1550
    .line 1551
    const v5, 0x73747a32

    .line 1552
    .line 1553
    .line 1554
    if-eq v8, v5, :cond_48

    .line 1555
    .line 1556
    const v5, 0x7374636f

    .line 1557
    .line 1558
    .line 1559
    if-eq v8, v5, :cond_48

    .line 1560
    .line 1561
    const v5, 0x636f3634

    .line 1562
    .line 1563
    .line 1564
    if-eq v8, v5, :cond_48

    .line 1565
    .line 1566
    const v5, 0x746b6864

    .line 1567
    .line 1568
    .line 1569
    if-eq v8, v5, :cond_48

    .line 1570
    .line 1571
    if-eq v8, v4, :cond_48

    .line 1572
    .line 1573
    const v4, 0x75647461

    .line 1574
    .line 1575
    .line 1576
    if-eq v8, v4, :cond_48

    .line 1577
    .line 1578
    const v4, 0x6b657973

    .line 1579
    .line 1580
    .line 1581
    if-eq v8, v4, :cond_48

    .line 1582
    .line 1583
    const v4, 0x696c7374

    .line 1584
    .line 1585
    .line 1586
    if-ne v8, v4, :cond_49

    .line 1587
    .line 1588
    :cond_48
    const/16 v5, 0x8

    .line 1589
    .line 1590
    goto :goto_20

    .line 1591
    :cond_49
    invoke-interface {v0}, Lmf1;->o()J

    .line 1592
    .line 1593
    .line 1594
    move-result-wide v3

    .line 1595
    iget v5, v1, Lnj1;->n:I

    .line 1596
    .line 1597
    int-to-long v5, v5

    .line 1598
    sub-long v10, v3, v5

    .line 1599
    .line 1600
    iget v3, v1, Lnj1;->l:I

    .line 1601
    .line 1602
    const v4, 0x6d707664

    .line 1603
    .line 1604
    .line 1605
    if-ne v3, v4, :cond_4a

    .line 1606
    .line 1607
    add-long v14, v10, v5

    .line 1608
    .line 1609
    new-instance v7, Lih1;

    .line 1610
    .line 1611
    iget-wide v3, v1, Lnj1;->m:J

    .line 1612
    .line 1613
    sub-long v16, v3, v5

    .line 1614
    .line 1615
    const-wide/16 v8, 0x0

    .line 1616
    .line 1617
    const-wide v12, -0x7fffffffffffffffL    # -4.9E-324

    .line 1618
    .line 1619
    .line 1620
    .line 1621
    .line 1622
    invoke-direct/range {v7 .. v17}, Lih1;-><init>(JJJJJ)V

    .line 1623
    .line 1624
    .line 1625
    :cond_4a
    const/4 v3, 0x0

    .line 1626
    iput-object v3, v1, Lnj1;->o:Lkz2;

    .line 1627
    .line 1628
    const/4 v11, 0x1

    .line 1629
    iput v11, v1, Lnj1;->k:I

    .line 1630
    .line 1631
    goto/16 :goto_0

    .line 1632
    .line 1633
    :goto_20
    if-ne v3, v5, :cond_4b

    .line 1634
    .line 1635
    const/4 v3, 0x1

    .line 1636
    goto :goto_21

    .line 1637
    :cond_4b
    const/4 v3, 0x0

    .line 1638
    :goto_21
    invoke-static {v3}, Lzt0;->b0(Z)V

    .line 1639
    .line 1640
    .line 1641
    iget-wide v3, v1, Lnj1;->m:J

    .line 1642
    .line 1643
    const-wide/32 v5, 0x7fffffff

    .line 1644
    .line 1645
    .line 1646
    cmp-long v3, v3, v5

    .line 1647
    .line 1648
    if-gtz v3, :cond_4c

    .line 1649
    .line 1650
    const/4 v3, 0x1

    .line 1651
    goto :goto_22

    .line 1652
    :cond_4c
    const/4 v3, 0x0

    .line 1653
    :goto_22
    invoke-static {v3}, Lzt0;->b0(Z)V

    .line 1654
    .line 1655
    .line 1656
    new-instance v3, Lkz2;

    .line 1657
    .line 1658
    iget-wide v4, v1, Lnj1;->m:J

    .line 1659
    .line 1660
    long-to-int v4, v4

    .line 1661
    invoke-direct {v3, v4}, Lkz2;-><init>(I)V

    .line 1662
    .line 1663
    .line 1664
    iget-object v4, v7, Lkz2;->a:[B

    .line 1665
    .line 1666
    iget-object v5, v3, Lkz2;->a:[B

    .line 1667
    .line 1668
    const/16 v8, 0x8

    .line 1669
    .line 1670
    const/4 v11, 0x0

    .line 1671
    invoke-static {v4, v11, v5, v11, v8}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 1672
    .line 1673
    .line 1674
    iput-object v3, v1, Lnj1;->o:Lkz2;

    .line 1675
    .line 1676
    const/4 v11, 0x1

    .line 1677
    iput v11, v1, Lnj1;->k:I

    .line 1678
    .line 1679
    goto/16 :goto_0

    .line 1680
    .line 1681
    :cond_4d
    :goto_23
    invoke-interface {v0}, Lmf1;->o()J

    .line 1682
    .line 1683
    .line 1684
    move-result-wide v3

    .line 1685
    iget-wide v7, v1, Lnj1;->m:J

    .line 1686
    .line 1687
    add-long/2addr v3, v7

    .line 1688
    iget v9, v1, Lnj1;->n:I

    .line 1689
    .line 1690
    int-to-long v11, v9

    .line 1691
    cmp-long v7, v7, v11

    .line 1692
    .line 1693
    if-eqz v7, :cond_4e

    .line 1694
    .line 1695
    iget v7, v1, Lnj1;->l:I

    .line 1696
    .line 1697
    if-ne v7, v10, :cond_4e

    .line 1698
    .line 1699
    const/16 v8, 0x8

    .line 1700
    .line 1701
    invoke-virtual {v6, v8}, Lkz2;->y(I)V

    .line 1702
    .line 1703
    .line 1704
    iget-object v7, v6, Lkz2;->a:[B

    .line 1705
    .line 1706
    const/4 v15, 0x0

    .line 1707
    invoke-interface {v0, v7, v15, v8}, Lmf1;->u([BII)V

    .line 1708
    .line 1709
    .line 1710
    invoke-static {v6}, Lej1;->f(Lkz2;)V

    .line 1711
    .line 1712
    .line 1713
    iget v6, v6, Lkz2;->b:I

    .line 1714
    .line 1715
    invoke-interface {v0, v6}, Lmf1;->t(I)V

    .line 1716
    .line 1717
    .line 1718
    invoke-interface {v0}, Lmf1;->i()V

    .line 1719
    .line 1720
    .line 1721
    :cond_4e
    sub-long/2addr v3, v11

    .line 1722
    new-instance v6, Lm43;

    .line 1723
    .line 1724
    iget v7, v1, Lnj1;->l:I

    .line 1725
    .line 1726
    invoke-direct {v6, v7, v3, v4}, Lm43;-><init>(IJ)V

    .line 1727
    .line 1728
    .line 1729
    invoke-virtual {v5, v6}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    .line 1730
    .line 1731
    .line 1732
    iget-wide v5, v1, Lnj1;->m:J

    .line 1733
    .line 1734
    iget v7, v1, Lnj1;->n:I

    .line 1735
    .line 1736
    int-to-long v7, v7

    .line 1737
    cmp-long v5, v5, v7

    .line 1738
    .line 1739
    if-nez v5, :cond_4f

    .line 1740
    .line 1741
    invoke-virtual {v1, v3, v4}, Lnj1;->g(J)V

    .line 1742
    .line 1743
    .line 1744
    goto/16 :goto_0

    .line 1745
    .line 1746
    :cond_4f
    invoke-virtual {v1}, Lnj1;->a()V

    .line 1747
    .line 1748
    .line 1749
    goto/16 :goto_0

    .line 1750
    .line 1751
    :sswitch_data_0
    .sparse-switch
        -0x6604662e -> :sswitch_4
        -0x4f6659e5 -> :sswitch_3
        -0x4a96a712 -> :sswitch_2
        -0x3182f331 -> :sswitch_1
        0x68f2d704 -> :sswitch_0
    .end sparse-switch
.end method

.method public final synthetic d()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lnj1;->j:Lsn3;

    .line 2
    .line 3
    return-object v0
.end method

.method public final e(JJ)V
    .locals 7

    .line 1
    iget-object v0, p0, Lnj1;->g:Ljava/util/ArrayDeque;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->clear()V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    iput v0, p0, Lnj1;->n:I

    .line 8
    .line 9
    const/4 v1, -0x1

    .line 10
    iput v1, p0, Lnj1;->p:I

    .line 11
    .line 12
    iput v0, p0, Lnj1;->q:I

    .line 13
    .line 14
    iput v0, p0, Lnj1;->r:I

    .line 15
    .line 16
    iput v0, p0, Lnj1;->s:I

    .line 17
    .line 18
    iput-boolean v0, p0, Lnj1;->t:Z

    .line 19
    .line 20
    const-wide/16 v2, 0x0

    .line 21
    .line 22
    cmp-long p1, p1, v2

    .line 23
    .line 24
    if-nez p1, :cond_1

    .line 25
    .line 26
    iget p1, p0, Lnj1;->k:I

    .line 27
    .line 28
    const/4 p2, 0x3

    .line 29
    if-eq p1, p2, :cond_0

    .line 30
    .line 31
    invoke-virtual {p0}, Lnj1;->a()V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :cond_0
    iget-object p1, p0, Lnj1;->h:Lpj1;

    .line 36
    .line 37
    iget-object p2, p1, Lpj1;->a:Ljava/util/ArrayList;

    .line 38
    .line 39
    invoke-virtual {p2}, Ljava/util/ArrayList;->clear()V

    .line 40
    .line 41
    .line 42
    iput v0, p1, Lpj1;->b:I

    .line 43
    .line 44
    iget-object p1, p0, Lnj1;->i:Ljava/util/ArrayList;

    .line 45
    .line 46
    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :cond_1
    iget-object p1, p0, Lnj1;->w:[Lmj1;

    .line 51
    .line 52
    array-length p2, p1

    .line 53
    move v2, v0

    .line 54
    :goto_0
    if-ge v2, p2, :cond_6

    .line 55
    .line 56
    aget-object v3, p1, v2

    .line 57
    .line 58
    iget-object v4, v3, Lmj1;->b:Ltj1;

    .line 59
    .line 60
    iget-object v5, v4, Ltj1;->f:[J

    .line 61
    .line 62
    invoke-static {v5, p3, p4, v0}, Lv23;->p([JJZ)I

    .line 63
    .line 64
    .line 65
    move-result v5

    .line 66
    :goto_1
    if-ltz v5, :cond_3

    .line 67
    .line 68
    iget-object v6, v4, Ltj1;->g:[I

    .line 69
    .line 70
    aget v6, v6, v5

    .line 71
    .line 72
    and-int/lit8 v6, v6, 0x1

    .line 73
    .line 74
    if-eqz v6, :cond_2

    .line 75
    .line 76
    goto :goto_2

    .line 77
    :cond_2
    add-int/lit8 v5, v5, -0x1

    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_3
    move v5, v1

    .line 81
    :goto_2
    if-ne v5, v1, :cond_4

    .line 82
    .line 83
    invoke-virtual {v4, p3, p4}, Ltj1;->a(J)I

    .line 84
    .line 85
    .line 86
    move-result v5

    .line 87
    :cond_4
    iput v5, v3, Lmj1;->e:I

    .line 88
    .line 89
    iget-object v3, v3, Lmj1;->d:Lkg1;

    .line 90
    .line 91
    if-eqz v3, :cond_5

    .line 92
    .line 93
    iput-boolean v0, v3, Lkg1;->b:Z

    .line 94
    .line 95
    iput v0, v3, Lkg1;->c:I

    .line 96
    .line 97
    :cond_5
    add-int/lit8 v2, v2, 0x1

    .line 98
    .line 99
    goto :goto_0

    .line 100
    :cond_6
    return-void
.end method

.method public final f(Lnf1;)V
    .locals 2

    .line 1
    iget v0, p0, Lnj1;->b:I

    .line 2
    .line 3
    and-int/lit8 v0, v0, 0x10

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Lrl;

    .line 8
    .line 9
    iget-object v1, p0, Lnj1;->a:Ljk1;

    .line 10
    .line 11
    invoke-direct {v0, p1, v1}, Lrl;-><init>(Lnf1;Ljk1;)V

    .line 12
    .line 13
    .line 14
    move-object p1, v0

    .line 15
    :cond_0
    iput-object p1, p0, Lnj1;->v:Lnf1;

    .line 16
    .line 17
    return-void
.end method

.method public final g(J)V
    .locals 30

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    :cond_0
    :goto_0
    iget-object v1, v0, Lnj1;->g:Ljava/util/ArrayDeque;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    if-nez v2, :cond_17

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    check-cast v2, Lm43;

    .line 16
    .line 17
    iget-wide v4, v2, Lm43;->c:J

    .line 18
    .line 19
    cmp-long v2, v4, p1

    .line 20
    .line 21
    if-nez v2, :cond_17

    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    move-object v4, v2

    .line 28
    check-cast v4, Lm43;

    .line 29
    .line 30
    iget v2, v4, Ltd;->b:I

    .line 31
    .line 32
    const v5, 0x6d6f6f76

    .line 33
    .line 34
    .line 35
    if-ne v2, v5, :cond_16

    .line 36
    .line 37
    const v2, 0x6d657461

    .line 38
    .line 39
    .line 40
    invoke-virtual {v4, v2}, Lm43;->j(I)Lm43;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    new-instance v5, Ljava/util/ArrayList;

    .line 45
    .line 46
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 47
    .line 48
    .line 49
    if-eqz v2, :cond_1

    .line 50
    .line 51
    invoke-static {v2}, Lej1;->e(Lm43;)Lwn1;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    goto :goto_1

    .line 56
    :cond_1
    const/4 v2, 0x0

    .line 57
    :goto_1
    new-instance v13, Ljava/util/ArrayList;

    .line 58
    .line 59
    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 60
    .line 61
    .line 62
    iget v5, v0, Lnj1;->y:I

    .line 63
    .line 64
    const/4 v14, 0x0

    .line 65
    const/4 v15, 0x1

    .line 66
    if-ne v5, v15, :cond_2

    .line 67
    .line 68
    move v10, v15

    .line 69
    goto :goto_2

    .line 70
    :cond_2
    move v10, v14

    .line 71
    :goto_2
    new-instance v5, Luf1;

    .line 72
    .line 73
    invoke-direct {v5}, Luf1;-><init>()V

    .line 74
    .line 75
    .line 76
    const v6, 0x75647461

    .line 77
    .line 78
    .line 79
    invoke-virtual {v4, v6}, Lm43;->i(I)Lp43;

    .line 80
    .line 81
    .line 82
    move-result-object v6

    .line 83
    if-eqz v6, :cond_3

    .line 84
    .line 85
    invoke-static {v6}, Lej1;->c(Lp43;)Lwn1;

    .line 86
    .line 87
    .line 88
    move-result-object v6

    .line 89
    invoke-virtual {v5, v6}, Luf1;->a(Lwn1;)V

    .line 90
    .line 91
    .line 92
    goto :goto_3

    .line 93
    :cond_3
    const/4 v6, 0x0

    .line 94
    :goto_3
    new-instance v7, Lwn1;

    .line 95
    .line 96
    const v8, 0x6d766864

    .line 97
    .line 98
    .line 99
    invoke-virtual {v4, v8}, Lm43;->i(I)Lp43;

    .line 100
    .line 101
    .line 102
    move-result-object v8

    .line 103
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    iget-object v8, v8, Lp43;->c:Lkz2;

    .line 107
    .line 108
    invoke-static {v8}, Lej1;->d(Lkz2;)Lo53;

    .line 109
    .line 110
    .line 111
    move-result-object v8

    .line 112
    new-array v9, v15, [Len1;

    .line 113
    .line 114
    aput-object v8, v9, v14

    .line 115
    .line 116
    invoke-direct {v7, v9}, Lwn1;-><init>([Len1;)V

    .line 117
    .line 118
    .line 119
    const/4 v8, 0x0

    .line 120
    sget-object v11, Lgj1;->b:Lgj1;

    .line 121
    .line 122
    move-object v9, v6

    .line 123
    move-object/from16 v16, v7

    .line 124
    .line 125
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    move-object/from16 v17, v9

    .line 131
    .line 132
    const/4 v9, 0x0

    .line 133
    move-object/from16 v14, v16

    .line 134
    .line 135
    move-object/from16 v12, v17

    .line 136
    .line 137
    invoke-static/range {v4 .. v11}, Lej1;->b(Lm43;Luf1;JLie4;ZZLzk3;)Ljava/util/ArrayList;

    .line 138
    .line 139
    .line 140
    move-result-object v4

    .line 141
    invoke-static {v4}, Lm54;->F(Ljava/util/ArrayList;)Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object v6

    .line 145
    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    const/4 v10, 0x0

    .line 151
    const/4 v11, 0x0

    .line 152
    const/4 v15, -0x1

    .line 153
    const-wide v19, -0x7fffffffffffffffL    # -4.9E-324

    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    :goto_4
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 159
    .line 160
    .line 161
    move-result v9

    .line 162
    if-ge v10, v9, :cond_10

    .line 163
    .line 164
    invoke-virtual {v4, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v9

    .line 168
    check-cast v9, Ltj1;

    .line 169
    .line 170
    iget v3, v9, Ltj1;->b:I

    .line 171
    .line 172
    move-object/from16 v22, v1

    .line 173
    .line 174
    iget v1, v9, Ltj1;->e:I

    .line 175
    .line 176
    if-nez v3, :cond_4

    .line 177
    .line 178
    move-object/from16 v24, v4

    .line 179
    .line 180
    move/from16 v26, v10

    .line 181
    .line 182
    move/from16 v25, v11

    .line 183
    .line 184
    const/4 v3, -0x1

    .line 185
    move-object v11, v2

    .line 186
    goto/16 :goto_e

    .line 187
    .line 188
    :cond_4
    iget-object v3, v9, Ltj1;->a:Lqj1;

    .line 189
    .line 190
    move/from16 v23, v1

    .line 191
    .line 192
    new-instance v1, Lmj1;

    .line 193
    .line 194
    move-object/from16 v24, v4

    .line 195
    .line 196
    iget-object v4, v0, Lnj1;->v:Lnf1;

    .line 197
    .line 198
    add-int/lit8 v25, v11, 0x1

    .line 199
    .line 200
    move/from16 v26, v10

    .line 201
    .line 202
    iget v10, v3, Lqj1;->b:I

    .line 203
    .line 204
    invoke-interface {v4, v11, v10}, Lnf1;->z(II)Ljg1;

    .line 205
    .line 206
    .line 207
    move-result-object v4

    .line 208
    invoke-direct {v1, v3, v9, v4}, Lmj1;-><init>(Lqj1;Ltj1;Ljg1;)V

    .line 209
    .line 210
    .line 211
    move-object/from16 v27, v1

    .line 212
    .line 213
    move-object v11, v2

    .line 214
    iget-wide v1, v3, Lqj1;->e:J

    .line 215
    .line 216
    cmp-long v28, v1, v19

    .line 217
    .line 218
    if-eqz v28, :cond_5

    .line 219
    .line 220
    goto :goto_5

    .line 221
    :cond_5
    iget-wide v1, v9, Ltj1;->h:J

    .line 222
    .line 223
    :goto_5
    invoke-static {v7, v8, v1, v2}, Ljava/lang/Math;->max(JJ)J

    .line 224
    .line 225
    .line 226
    move-result-wide v7

    .line 227
    iget-object v1, v3, Lqj1;->g:Lph4;

    .line 228
    .line 229
    iget-object v2, v1, Lph4;->m:Ljava/lang/String;

    .line 230
    .line 231
    const-string v3, "audio/true-hd"

    .line 232
    .line 233
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 234
    .line 235
    .line 236
    move-result v3

    .line 237
    if-eqz v3, :cond_6

    .line 238
    .line 239
    mul-int/lit8 v3, v23, 0x10

    .line 240
    .line 241
    goto :goto_6

    .line 242
    :cond_6
    add-int/lit8 v3, v23, 0x1e

    .line 243
    .line 244
    :goto_6
    new-instance v9, Lgg4;

    .line 245
    .line 246
    invoke-direct {v9, v1}, Lgg4;-><init>(Lph4;)V

    .line 247
    .line 248
    .line 249
    iput v3, v9, Lgg4;->m:I

    .line 250
    .line 251
    const/4 v3, 0x2

    .line 252
    if-ne v10, v3, :cond_9

    .line 253
    .line 254
    iget v3, v1, Lph4;->f:I

    .line 255
    .line 256
    iget v10, v0, Lnj1;->b:I

    .line 257
    .line 258
    and-int/lit8 v10, v10, 0x8

    .line 259
    .line 260
    if-eqz v10, :cond_8

    .line 261
    .line 262
    const/4 v10, -0x1

    .line 263
    if-ne v15, v10, :cond_7

    .line 264
    .line 265
    const/16 v21, 0x1

    .line 266
    .line 267
    goto :goto_7

    .line 268
    :cond_7
    const/16 v21, 0x2

    .line 269
    .line 270
    :goto_7
    or-int v3, v3, v21

    .line 271
    .line 272
    goto :goto_8

    .line 273
    :cond_8
    const/4 v10, -0x1

    .line 274
    :goto_8
    iput v3, v9, Lgg4;->f:I

    .line 275
    .line 276
    const/4 v10, 0x2

    .line 277
    :cond_9
    const/4 v3, 0x1

    .line 278
    if-ne v10, v3, :cond_a

    .line 279
    .line 280
    iget v3, v5, Luf1;->a:I

    .line 281
    .line 282
    move-wide/from16 v28, v7

    .line 283
    .line 284
    const/4 v7, -0x1

    .line 285
    if-eq v3, v7, :cond_b

    .line 286
    .line 287
    iget v8, v5, Luf1;->b:I

    .line 288
    .line 289
    if-eq v8, v7, :cond_b

    .line 290
    .line 291
    iput v3, v9, Lgg4;->G:I

    .line 292
    .line 293
    iput v8, v9, Lgg4;->H:I

    .line 294
    .line 295
    goto :goto_9

    .line 296
    :cond_a
    move-wide/from16 v28, v7

    .line 297
    .line 298
    :cond_b
    :goto_9
    iget-object v1, v1, Lph4;->k:Lwn1;

    .line 299
    .line 300
    iget-object v3, v0, Lnj1;->i:Ljava/util/ArrayList;

    .line 301
    .line 302
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 303
    .line 304
    .line 305
    move-result v7

    .line 306
    if-eqz v7, :cond_c

    .line 307
    .line 308
    const/4 v7, 0x0

    .line 309
    goto :goto_a

    .line 310
    :cond_c
    new-instance v7, Lwn1;

    .line 311
    .line 312
    invoke-direct {v7, v3}, Lwn1;-><init>(Ljava/util/List;)V

    .line 313
    .line 314
    .line 315
    :goto_a
    filled-new-array {v7, v12, v14}, [Lwn1;

    .line 316
    .line 317
    .line 318
    move-result-object v3

    .line 319
    invoke-static {v10, v11, v9, v1, v3}, Lwl2;->E(ILwn1;Lgg4;Lwn1;[Lwn1;)V

    .line 320
    .line 321
    .line 322
    invoke-virtual {v9, v6}, Lgg4;->d(Ljava/lang/String;)V

    .line 323
    .line 324
    .line 325
    const-string v1, "audio/mpeg"

    .line 326
    .line 327
    invoke-static {v2, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 328
    .line 329
    .line 330
    move-result v1

    .line 331
    if-eqz v1, :cond_d

    .line 332
    .line 333
    new-instance v1, Lph4;

    .line 334
    .line 335
    invoke-direct {v1, v9}, Lph4;-><init>(Lgg4;)V

    .line 336
    .line 337
    .line 338
    move-object/from16 v2, v27

    .line 339
    .line 340
    iput-object v1, v2, Lmj1;->f:Lph4;

    .line 341
    .line 342
    :goto_b
    const/4 v3, 0x2

    .line 343
    goto :goto_c

    .line 344
    :cond_d
    move-object/from16 v2, v27

    .line 345
    .line 346
    new-instance v1, Lph4;

    .line 347
    .line 348
    invoke-direct {v1, v9}, Lph4;-><init>(Lgg4;)V

    .line 349
    .line 350
    .line 351
    invoke-interface {v4, v1}, Ljg1;->d(Lph4;)V

    .line 352
    .line 353
    .line 354
    goto :goto_b

    .line 355
    :goto_c
    if-ne v10, v3, :cond_e

    .line 356
    .line 357
    const/4 v3, -0x1

    .line 358
    if-ne v15, v3, :cond_f

    .line 359
    .line 360
    invoke-virtual {v13}, Ljava/util/ArrayList;->size()I

    .line 361
    .line 362
    .line 363
    move-result v15

    .line 364
    goto :goto_d

    .line 365
    :cond_e
    const/4 v3, -0x1

    .line 366
    :cond_f
    :goto_d
    invoke-virtual {v13, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 367
    .line 368
    .line 369
    move-wide/from16 v7, v28

    .line 370
    .line 371
    :goto_e
    add-int/lit8 v10, v26, 0x1

    .line 372
    .line 373
    move-object v2, v11

    .line 374
    move-object/from16 v1, v22

    .line 375
    .line 376
    move-object/from16 v4, v24

    .line 377
    .line 378
    move/from16 v11, v25

    .line 379
    .line 380
    goto/16 :goto_4

    .line 381
    .line 382
    :cond_10
    move-object/from16 v22, v1

    .line 383
    .line 384
    const/4 v1, 0x0

    .line 385
    const/4 v3, -0x1

    .line 386
    new-array v2, v1, [Lmj1;

    .line 387
    .line 388
    invoke-virtual {v13, v2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 389
    .line 390
    .line 391
    move-result-object v1

    .line 392
    check-cast v1, [Lmj1;

    .line 393
    .line 394
    iput-object v1, v0, Lnj1;->w:[Lmj1;

    .line 395
    .line 396
    array-length v2, v1

    .line 397
    new-array v4, v2, [[J

    .line 398
    .line 399
    new-array v5, v2, [I

    .line 400
    .line 401
    new-array v6, v2, [J

    .line 402
    .line 403
    new-array v2, v2, [Z

    .line 404
    .line 405
    const/4 v9, 0x0

    .line 406
    :goto_f
    array-length v10, v1

    .line 407
    if-ge v9, v10, :cond_11

    .line 408
    .line 409
    aget-object v10, v1, v9

    .line 410
    .line 411
    iget-object v10, v10, Lmj1;->b:Ltj1;

    .line 412
    .line 413
    iget v10, v10, Ltj1;->b:I

    .line 414
    .line 415
    new-array v10, v10, [J

    .line 416
    .line 417
    aput-object v10, v4, v9

    .line 418
    .line 419
    aget-object v10, v1, v9

    .line 420
    .line 421
    iget-object v10, v10, Lmj1;->b:Ltj1;

    .line 422
    .line 423
    iget-object v10, v10, Ltj1;->f:[J

    .line 424
    .line 425
    const/16 v16, 0x0

    .line 426
    .line 427
    aget-wide v11, v10, v16

    .line 428
    .line 429
    aput-wide v11, v6, v9

    .line 430
    .line 431
    add-int/lit8 v9, v9, 0x1

    .line 432
    .line 433
    goto :goto_f

    .line 434
    :cond_11
    const/16 v16, 0x0

    .line 435
    .line 436
    const-wide/16 v9, 0x0

    .line 437
    .line 438
    move-wide v10, v9

    .line 439
    move/from16 v9, v16

    .line 440
    .line 441
    :goto_10
    array-length v12, v1

    .line 442
    if-ge v9, v12, :cond_15

    .line 443
    .line 444
    const-wide v12, 0x7fffffffffffffffL

    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    move-wide/from16 v18, v12

    .line 450
    .line 451
    move/from16 v12, v16

    .line 452
    .line 453
    move v13, v3

    .line 454
    :goto_11
    array-length v14, v1

    .line 455
    if-ge v12, v14, :cond_13

    .line 456
    .line 457
    aget-boolean v14, v2, v12

    .line 458
    .line 459
    if-nez v14, :cond_12

    .line 460
    .line 461
    aget-wide v20, v6, v12

    .line 462
    .line 463
    cmp-long v14, v20, v18

    .line 464
    .line 465
    if-gtz v14, :cond_12

    .line 466
    .line 467
    move v13, v12

    .line 468
    move-wide/from16 v18, v20

    .line 469
    .line 470
    :cond_12
    add-int/lit8 v12, v12, 0x1

    .line 471
    .line 472
    goto :goto_11

    .line 473
    :cond_13
    aget v12, v5, v13

    .line 474
    .line 475
    aget-object v14, v4, v13

    .line 476
    .line 477
    aput-wide v10, v14, v12

    .line 478
    .line 479
    aget-object v3, v1, v13

    .line 480
    .line 481
    iget-object v3, v3, Lmj1;->b:Ltj1;

    .line 482
    .line 483
    move-object/from16 v18, v1

    .line 484
    .line 485
    iget-object v1, v3, Ltj1;->d:[I

    .line 486
    .line 487
    aget v1, v1, v12

    .line 488
    .line 489
    move-object/from16 v19, v2

    .line 490
    .line 491
    int-to-long v1, v1

    .line 492
    add-long/2addr v10, v1

    .line 493
    const/16 v17, 0x1

    .line 494
    .line 495
    add-int/lit8 v12, v12, 0x1

    .line 496
    .line 497
    aput v12, v5, v13

    .line 498
    .line 499
    array-length v1, v14

    .line 500
    if-ge v12, v1, :cond_14

    .line 501
    .line 502
    iget-object v1, v3, Ltj1;->f:[J

    .line 503
    .line 504
    aget-wide v2, v1, v12

    .line 505
    .line 506
    aput-wide v2, v6, v13

    .line 507
    .line 508
    :goto_12
    move-object/from16 v1, v18

    .line 509
    .line 510
    move-object/from16 v2, v19

    .line 511
    .line 512
    const/4 v3, -0x1

    .line 513
    goto :goto_10

    .line 514
    :cond_14
    aput-boolean v17, v19, v13

    .line 515
    .line 516
    add-int/lit8 v9, v9, 0x1

    .line 517
    .line 518
    goto :goto_12

    .line 519
    :cond_15
    iput-object v4, v0, Lnj1;->x:[[J

    .line 520
    .line 521
    iget-object v1, v0, Lnj1;->v:Lnf1;

    .line 522
    .line 523
    invoke-interface {v1}, Lnf1;->s()V

    .line 524
    .line 525
    .line 526
    iget-object v1, v0, Lnj1;->v:Lnf1;

    .line 527
    .line 528
    new-instance v2, Llj1;

    .line 529
    .line 530
    iget-object v3, v0, Lnj1;->w:[Lmj1;

    .line 531
    .line 532
    invoke-direct {v2, v7, v8, v3, v15}, Llj1;-><init>(J[Lmj1;I)V

    .line 533
    .line 534
    .line 535
    invoke-interface {v1, v2}, Lnf1;->v(Lcg1;)V

    .line 536
    .line 537
    .line 538
    invoke-virtual/range {v22 .. v22}, Ljava/util/ArrayDeque;->clear()V

    .line 539
    .line 540
    .line 541
    const/4 v3, 0x2

    .line 542
    iput v3, v0, Lnj1;->k:I

    .line 543
    .line 544
    goto/16 :goto_0

    .line 545
    .line 546
    :cond_16
    move-object/from16 v22, v1

    .line 547
    .line 548
    invoke-virtual/range {v22 .. v22}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 549
    .line 550
    .line 551
    move-result v1

    .line 552
    if-nez v1, :cond_0

    .line 553
    .line 554
    invoke-virtual/range {v22 .. v22}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    .line 555
    .line 556
    .line 557
    move-result-object v1

    .line 558
    check-cast v1, Lm43;

    .line 559
    .line 560
    iget-object v1, v1, Lm43;->e:Ljava/util/ArrayList;

    .line 561
    .line 562
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 563
    .line 564
    .line 565
    goto/16 :goto_0

    .line 566
    .line 567
    :cond_17
    iget v1, v0, Lnj1;->k:I

    .line 568
    .line 569
    const/4 v3, 0x2

    .line 570
    if-eq v1, v3, :cond_18

    .line 571
    .line 572
    invoke-virtual {v0}, Lnj1;->a()V

    .line 573
    .line 574
    .line 575
    :cond_18
    return-void
.end method
