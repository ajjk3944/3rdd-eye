.class public final Lzl1;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lgm1;


# instance fields
.field public final synthetic a:I

.field public final b:Llg1;

.field public final c:Lkz2;

.field public final d:Ljava/lang/String;

.field public final e:I

.field public final f:Ljava/lang/String;

.field public g:Ljava/lang/String;

.field public h:Ljg1;

.field public i:I

.field public j:I

.field public k:Z

.field public l:J

.field public m:Lph4;

.field public n:I

.field public o:J


# direct methods
.method public constructor <init>(IILjava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1
    iput p2, p0, Lzl1;->a:I

    .line 2
    .line 3
    packed-switch p2, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    new-instance p2, Llg1;

    .line 10
    .line 11
    const/16 v0, 0x80

    .line 12
    .line 13
    new-array v1, v0, [B

    .line 14
    .line 15
    invoke-direct {p2, v0, v1}, Llg1;-><init>(I[B)V

    .line 16
    .line 17
    .line 18
    iput-object p2, p0, Lzl1;->b:Llg1;

    .line 19
    .line 20
    new-instance v0, Lkz2;

    .line 21
    .line 22
    iget-object p2, p2, Llg1;->a:[B

    .line 23
    .line 24
    invoke-direct {v0, p2}, Lkz2;-><init>([B)V

    .line 25
    .line 26
    .line 27
    iput-object v0, p0, Lzl1;->c:Lkz2;

    .line 28
    .line 29
    const/4 p2, 0x0

    .line 30
    iput p2, p0, Lzl1;->i:I

    .line 31
    .line 32
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    iput-wide v0, p0, Lzl1;->o:J

    .line 38
    .line 39
    iput-object p3, p0, Lzl1;->d:Ljava/lang/String;

    .line 40
    .line 41
    iput p1, p0, Lzl1;->e:I

    .line 42
    .line 43
    iput-object p4, p0, Lzl1;->f:Ljava/lang/String;

    .line 44
    .line 45
    return-void

    .line 46
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 47
    .line 48
    .line 49
    new-instance p2, Llg1;

    .line 50
    .line 51
    const/16 v0, 0x10

    .line 52
    .line 53
    new-array v1, v0, [B

    .line 54
    .line 55
    invoke-direct {p2, v0, v1}, Llg1;-><init>(I[B)V

    .line 56
    .line 57
    .line 58
    iput-object p2, p0, Lzl1;->b:Llg1;

    .line 59
    .line 60
    new-instance v0, Lkz2;

    .line 61
    .line 62
    iget-object p2, p2, Llg1;->a:[B

    .line 63
    .line 64
    invoke-direct {v0, p2}, Lkz2;-><init>([B)V

    .line 65
    .line 66
    .line 67
    iput-object v0, p0, Lzl1;->c:Lkz2;

    .line 68
    .line 69
    const/4 p2, 0x0

    .line 70
    iput p2, p0, Lzl1;->i:I

    .line 71
    .line 72
    iput p2, p0, Lzl1;->j:I

    .line 73
    .line 74
    iput-boolean p2, p0, Lzl1;->k:Z

    .line 75
    .line 76
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    iput-wide v0, p0, Lzl1;->o:J

    .line 82
    .line 83
    iput-object p3, p0, Lzl1;->d:Ljava/lang/String;

    .line 84
    .line 85
    iput p1, p0, Lzl1;->e:I

    .line 86
    .line 87
    iput-object p4, p0, Lzl1;->f:Ljava/lang/String;

    .line 88
    .line 89
    return-void

    .line 90
    nop

    .line 91
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method private final f(Z)V
    .locals 0

    .line 1
    return-void
.end method

.method private final g(Z)V
    .locals 0

    .line 1
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .line 1
    iget v0, p0, Lzl1;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    iput v0, p0, Lzl1;->i:I

    .line 8
    .line 9
    iput v0, p0, Lzl1;->j:I

    .line 10
    .line 11
    iput-boolean v0, p0, Lzl1;->k:Z

    .line 12
    .line 13
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    iput-wide v0, p0, Lzl1;->o:J

    .line 19
    .line 20
    return-void

    .line 21
    :pswitch_0
    const/4 v0, 0x0

    .line 22
    iput v0, p0, Lzl1;->i:I

    .line 23
    .line 24
    iput v0, p0, Lzl1;->j:I

    .line 25
    .line 26
    iput-boolean v0, p0, Lzl1;->k:Z

    .line 27
    .line 28
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    iput-wide v0, p0, Lzl1;->o:J

    .line 34
    .line 35
    return-void

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final b(Lkz2;)V
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget v2, v0, Lzl1;->a:I

    .line 6
    .line 7
    packed-switch v2, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-object v2, v0, Lzl1;->h:Ljg1;

    .line 11
    .line 12
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    :cond_0
    :goto_0
    invoke-virtual {v1}, Lkz2;->B()I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-lez v2, :cond_b

    .line 20
    .line 21
    iget v2, v0, Lzl1;->i:I

    .line 22
    .line 23
    iget-object v3, v0, Lzl1;->c:Lkz2;

    .line 24
    .line 25
    const/4 v4, 0x2

    .line 26
    const/4 v5, 0x1

    .line 27
    const/4 v6, 0x0

    .line 28
    if-eqz v2, :cond_5

    .line 29
    .line 30
    if-eq v2, v5, :cond_2

    .line 31
    .line 32
    invoke-virtual {v1}, Lkz2;->B()I

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    iget v3, v0, Lzl1;->n:I

    .line 37
    .line 38
    iget v4, v0, Lzl1;->j:I

    .line 39
    .line 40
    sub-int/2addr v3, v4

    .line 41
    invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    iget-object v3, v0, Lzl1;->h:Ljg1;

    .line 46
    .line 47
    invoke-interface {v3, v1, v2, v6}, Ljg1;->a(Lkz2;II)V

    .line 48
    .line 49
    .line 50
    iget v3, v0, Lzl1;->j:I

    .line 51
    .line 52
    add-int/2addr v3, v2

    .line 53
    iput v3, v0, Lzl1;->j:I

    .line 54
    .line 55
    iget v2, v0, Lzl1;->n:I

    .line 56
    .line 57
    if-ne v3, v2, :cond_0

    .line 58
    .line 59
    iget-wide v2, v0, Lzl1;->o:J

    .line 60
    .line 61
    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    cmp-long v2, v2, v7

    .line 67
    .line 68
    if-eqz v2, :cond_1

    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_1
    move v5, v6

    .line 72
    :goto_1
    invoke-static {v5}, Lzt0;->b0(Z)V

    .line 73
    .line 74
    .line 75
    iget-object v7, v0, Lzl1;->h:Ljg1;

    .line 76
    .line 77
    iget-wide v8, v0, Lzl1;->o:J

    .line 78
    .line 79
    iget v11, v0, Lzl1;->n:I

    .line 80
    .line 81
    const/4 v12, 0x0

    .line 82
    const/4 v13, 0x0

    .line 83
    const/4 v10, 0x1

    .line 84
    invoke-interface/range {v7 .. v13}, Ljg1;->c(JIIILig1;)V

    .line 85
    .line 86
    .line 87
    iget-wide v2, v0, Lzl1;->o:J

    .line 88
    .line 89
    iget-wide v4, v0, Lzl1;->l:J

    .line 90
    .line 91
    add-long/2addr v2, v4

    .line 92
    iput-wide v2, v0, Lzl1;->o:J

    .line 93
    .line 94
    iput v6, v0, Lzl1;->i:I

    .line 95
    .line 96
    goto :goto_0

    .line 97
    :cond_2
    iget-object v2, v3, Lkz2;->a:[B

    .line 98
    .line 99
    invoke-virtual {v1}, Lkz2;->B()I

    .line 100
    .line 101
    .line 102
    move-result v5

    .line 103
    iget v7, v0, Lzl1;->j:I

    .line 104
    .line 105
    const/16 v8, 0x10

    .line 106
    .line 107
    rsub-int/lit8 v7, v7, 0x10

    .line 108
    .line 109
    invoke-static {v5, v7}, Ljava/lang/Math;->min(II)I

    .line 110
    .line 111
    .line 112
    move-result v5

    .line 113
    iget v7, v0, Lzl1;->j:I

    .line 114
    .line 115
    invoke-virtual {v1, v2, v7, v5}, Lkz2;->H([BII)V

    .line 116
    .line 117
    .line 118
    iget v2, v0, Lzl1;->j:I

    .line 119
    .line 120
    add-int/2addr v2, v5

    .line 121
    iput v2, v0, Lzl1;->j:I

    .line 122
    .line 123
    if-ne v2, v8, :cond_0

    .line 124
    .line 125
    iget-object v2, v0, Lzl1;->b:Llg1;

    .line 126
    .line 127
    invoke-virtual {v2, v6}, Llg1;->l(I)V

    .line 128
    .line 129
    .line 130
    invoke-static {v2}, Lzt0;->H(Llg1;)Lzq;

    .line 131
    .line 132
    .line 133
    move-result-object v2

    .line 134
    iget v5, v2, Lzq;->a:I

    .line 135
    .line 136
    iget-object v7, v0, Lzl1;->m:Lph4;

    .line 137
    .line 138
    const-string v9, "audio/ac4"

    .line 139
    .line 140
    if-eqz v7, :cond_3

    .line 141
    .line 142
    iget v10, v7, Lph4;->E:I

    .line 143
    .line 144
    if-ne v10, v4, :cond_3

    .line 145
    .line 146
    iget v10, v7, Lph4;->F:I

    .line 147
    .line 148
    if-ne v5, v10, :cond_3

    .line 149
    .line 150
    iget-object v7, v7, Lph4;->m:Ljava/lang/String;

    .line 151
    .line 152
    invoke-virtual {v9, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    move-result v7

    .line 156
    if-nez v7, :cond_4

    .line 157
    .line 158
    :cond_3
    new-instance v7, Lgg4;

    .line 159
    .line 160
    invoke-direct {v7}, Lgg4;-><init>()V

    .line 161
    .line 162
    .line 163
    iget-object v10, v0, Lzl1;->g:Ljava/lang/String;

    .line 164
    .line 165
    iput-object v10, v7, Lgg4;->a:Ljava/lang/String;

    .line 166
    .line 167
    iget-object v10, v0, Lzl1;->f:Ljava/lang/String;

    .line 168
    .line 169
    invoke-virtual {v7, v10}, Lgg4;->d(Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    invoke-virtual {v7, v9}, Lgg4;->e(Ljava/lang/String;)V

    .line 173
    .line 174
    .line 175
    iput v4, v7, Lgg4;->D:I

    .line 176
    .line 177
    iput v5, v7, Lgg4;->E:I

    .line 178
    .line 179
    iget-object v5, v0, Lzl1;->d:Ljava/lang/String;

    .line 180
    .line 181
    iput-object v5, v7, Lgg4;->d:Ljava/lang/String;

    .line 182
    .line 183
    iget v5, v0, Lzl1;->e:I

    .line 184
    .line 185
    iput v5, v7, Lgg4;->f:I

    .line 186
    .line 187
    new-instance v5, Lph4;

    .line 188
    .line 189
    invoke-direct {v5, v7}, Lph4;-><init>(Lgg4;)V

    .line 190
    .line 191
    .line 192
    iput-object v5, v0, Lzl1;->m:Lph4;

    .line 193
    .line 194
    iget-object v7, v0, Lzl1;->h:Ljg1;

    .line 195
    .line 196
    invoke-interface {v7, v5}, Ljg1;->d(Lph4;)V

    .line 197
    .line 198
    .line 199
    :cond_4
    iget v5, v2, Lzq;->b:I

    .line 200
    .line 201
    iput v5, v0, Lzl1;->n:I

    .line 202
    .line 203
    iget v2, v2, Lzq;->c:I

    .line 204
    .line 205
    iget-object v5, v0, Lzl1;->m:Lph4;

    .line 206
    .line 207
    iget v5, v5, Lph4;->F:I

    .line 208
    .line 209
    int-to-long v9, v2

    .line 210
    const-wide/32 v11, 0xf4240

    .line 211
    .line 212
    .line 213
    mul-long/2addr v9, v11

    .line 214
    int-to-long v11, v5

    .line 215
    div-long/2addr v9, v11

    .line 216
    iput-wide v9, v0, Lzl1;->l:J

    .line 217
    .line 218
    invoke-virtual {v3, v6}, Lkz2;->E(I)V

    .line 219
    .line 220
    .line 221
    iget-object v2, v0, Lzl1;->h:Ljg1;

    .line 222
    .line 223
    invoke-interface {v2, v3, v8, v6}, Ljg1;->a(Lkz2;II)V

    .line 224
    .line 225
    .line 226
    iput v4, v0, Lzl1;->i:I

    .line 227
    .line 228
    goto/16 :goto_0

    .line 229
    .line 230
    :cond_5
    :goto_2
    invoke-virtual {v1}, Lkz2;->B()I

    .line 231
    .line 232
    .line 233
    move-result v2

    .line 234
    if-lez v2, :cond_0

    .line 235
    .line 236
    iget-boolean v2, v0, Lzl1;->k:Z

    .line 237
    .line 238
    const/16 v7, 0xac

    .line 239
    .line 240
    if-nez v2, :cond_7

    .line 241
    .line 242
    invoke-virtual {v1}, Lkz2;->K()I

    .line 243
    .line 244
    .line 245
    move-result v2

    .line 246
    if-ne v2, v7, :cond_6

    .line 247
    .line 248
    move v2, v5

    .line 249
    goto :goto_3

    .line 250
    :cond_6
    move v2, v6

    .line 251
    :goto_3
    iput-boolean v2, v0, Lzl1;->k:Z

    .line 252
    .line 253
    goto :goto_2

    .line 254
    :cond_7
    invoke-virtual {v1}, Lkz2;->K()I

    .line 255
    .line 256
    .line 257
    move-result v2

    .line 258
    if-ne v2, v7, :cond_8

    .line 259
    .line 260
    move v7, v5

    .line 261
    goto :goto_4

    .line 262
    :cond_8
    move v7, v6

    .line 263
    :goto_4
    iput-boolean v7, v0, Lzl1;->k:Z

    .line 264
    .line 265
    const/16 v7, 0x40

    .line 266
    .line 267
    const/16 v8, 0x41

    .line 268
    .line 269
    if-eq v2, v7, :cond_9

    .line 270
    .line 271
    if-ne v2, v8, :cond_5

    .line 272
    .line 273
    move v2, v8

    .line 274
    :cond_9
    iput v5, v0, Lzl1;->i:I

    .line 275
    .line 276
    iget-object v3, v3, Lkz2;->a:[B

    .line 277
    .line 278
    const/16 v9, -0x54

    .line 279
    .line 280
    aput-byte v9, v3, v6

    .line 281
    .line 282
    if-ne v2, v8, :cond_a

    .line 283
    .line 284
    move v7, v8

    .line 285
    :cond_a
    aput-byte v7, v3, v5

    .line 286
    .line 287
    iput v4, v0, Lzl1;->j:I

    .line 288
    .line 289
    goto/16 :goto_0

    .line 290
    .line 291
    :cond_b
    return-void

    .line 292
    :pswitch_0
    iget-object v2, v0, Lzl1;->h:Ljg1;

    .line 293
    .line 294
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 295
    .line 296
    .line 297
    :cond_c
    :goto_5
    invoke-virtual {v1}, Lkz2;->B()I

    .line 298
    .line 299
    .line 300
    move-result v2

    .line 301
    if-lez v2, :cond_49

    .line 302
    .line 303
    iget v2, v0, Lzl1;->i:I

    .line 304
    .line 305
    iget-object v3, v0, Lzl1;->c:Lkz2;

    .line 306
    .line 307
    const/4 v4, 0x2

    .line 308
    const/16 v5, 0xb

    .line 309
    .line 310
    const/4 v6, 0x1

    .line 311
    const/4 v7, 0x0

    .line 312
    if-eqz v2, :cond_44

    .line 313
    .line 314
    if-eq v2, v6, :cond_e

    .line 315
    .line 316
    invoke-virtual {v1}, Lkz2;->B()I

    .line 317
    .line 318
    .line 319
    move-result v2

    .line 320
    iget v3, v0, Lzl1;->n:I

    .line 321
    .line 322
    iget v4, v0, Lzl1;->j:I

    .line 323
    .line 324
    sub-int/2addr v3, v4

    .line 325
    invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I

    .line 326
    .line 327
    .line 328
    move-result v2

    .line 329
    iget-object v3, v0, Lzl1;->h:Ljg1;

    .line 330
    .line 331
    invoke-interface {v3, v1, v2, v7}, Ljg1;->a(Lkz2;II)V

    .line 332
    .line 333
    .line 334
    iget v3, v0, Lzl1;->j:I

    .line 335
    .line 336
    add-int/2addr v3, v2

    .line 337
    iput v3, v0, Lzl1;->j:I

    .line 338
    .line 339
    iget v2, v0, Lzl1;->n:I

    .line 340
    .line 341
    if-ne v3, v2, :cond_c

    .line 342
    .line 343
    iget-wide v2, v0, Lzl1;->o:J

    .line 344
    .line 345
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    cmp-long v2, v2, v4

    .line 351
    .line 352
    if-eqz v2, :cond_d

    .line 353
    .line 354
    goto :goto_6

    .line 355
    :cond_d
    move v6, v7

    .line 356
    :goto_6
    invoke-static {v6}, Lzt0;->b0(Z)V

    .line 357
    .line 358
    .line 359
    iget-object v8, v0, Lzl1;->h:Ljg1;

    .line 360
    .line 361
    iget-wide v9, v0, Lzl1;->o:J

    .line 362
    .line 363
    iget v12, v0, Lzl1;->n:I

    .line 364
    .line 365
    const/4 v13, 0x0

    .line 366
    const/4 v14, 0x0

    .line 367
    const/4 v11, 0x1

    .line 368
    invoke-interface/range {v8 .. v14}, Ljg1;->c(JIIILig1;)V

    .line 369
    .line 370
    .line 371
    iget-wide v2, v0, Lzl1;->o:J

    .line 372
    .line 373
    iget-wide v4, v0, Lzl1;->l:J

    .line 374
    .line 375
    add-long/2addr v2, v4

    .line 376
    iput-wide v2, v0, Lzl1;->o:J

    .line 377
    .line 378
    iput v7, v0, Lzl1;->i:I

    .line 379
    .line 380
    goto :goto_5

    .line 381
    :cond_e
    iget-object v2, v3, Lkz2;->a:[B

    .line 382
    .line 383
    invoke-virtual {v1}, Lkz2;->B()I

    .line 384
    .line 385
    .line 386
    move-result v8

    .line 387
    iget v9, v0, Lzl1;->j:I

    .line 388
    .line 389
    const/16 v10, 0x80

    .line 390
    .line 391
    rsub-int v9, v9, 0x80

    .line 392
    .line 393
    invoke-static {v8, v9}, Ljava/lang/Math;->min(II)I

    .line 394
    .line 395
    .line 396
    move-result v8

    .line 397
    iget v9, v0, Lzl1;->j:I

    .line 398
    .line 399
    invoke-virtual {v1, v2, v9, v8}, Lkz2;->H([BII)V

    .line 400
    .line 401
    .line 402
    iget v2, v0, Lzl1;->j:I

    .line 403
    .line 404
    add-int/2addr v2, v8

    .line 405
    iput v2, v0, Lzl1;->j:I

    .line 406
    .line 407
    if-ne v2, v10, :cond_c

    .line 408
    .line 409
    iget-object v2, v0, Lzl1;->b:Llg1;

    .line 410
    .line 411
    invoke-virtual {v2, v7}, Llg1;->l(I)V

    .line 412
    .line 413
    .line 414
    sget-object v8, Lyc0;->f:[I

    .line 415
    .line 416
    sget-object v9, Lyc0;->d:[I

    .line 417
    .line 418
    iget v11, v2, Llg1;->b:I

    .line 419
    .line 420
    const/16 v12, 0x8

    .line 421
    .line 422
    mul-int/2addr v11, v12

    .line 423
    iget v13, v2, Llg1;->c:I

    .line 424
    .line 425
    add-int/2addr v11, v13

    .line 426
    const/16 v13, 0x28

    .line 427
    .line 428
    invoke-virtual {v2, v13}, Llg1;->o(I)V

    .line 429
    .line 430
    .line 431
    const/4 v13, 0x5

    .line 432
    invoke-virtual {v2, v13}, Llg1;->r(I)I

    .line 433
    .line 434
    .line 435
    move-result v14

    .line 436
    invoke-virtual {v2, v11}, Llg1;->l(I)V

    .line 437
    .line 438
    .line 439
    const-string v11, "audio/ac3"

    .line 440
    .line 441
    const/4 v10, 0x3

    .line 442
    const/16 v7, 0xa

    .line 443
    .line 444
    if-le v14, v7, :cond_3b

    .line 445
    .line 446
    const/16 v14, 0x10

    .line 447
    .line 448
    invoke-virtual {v2, v14}, Llg1;->o(I)V

    .line 449
    .line 450
    .line 451
    invoke-virtual {v2, v4}, Llg1;->r(I)I

    .line 452
    .line 453
    .line 454
    move-result v15

    .line 455
    if-eqz v15, :cond_11

    .line 456
    .line 457
    if-eq v15, v6, :cond_10

    .line 458
    .line 459
    if-eq v15, v4, :cond_f

    .line 460
    .line 461
    const/4 v15, -0x1

    .line 462
    goto :goto_7

    .line 463
    :cond_f
    move v15, v4

    .line 464
    goto :goto_7

    .line 465
    :cond_10
    move v15, v6

    .line 466
    goto :goto_7

    .line 467
    :cond_11
    const/4 v15, 0x0

    .line 468
    :goto_7
    invoke-virtual {v2, v10}, Llg1;->o(I)V

    .line 469
    .line 470
    .line 471
    invoke-virtual {v2, v5}, Llg1;->r(I)I

    .line 472
    .line 473
    .line 474
    move-result v5

    .line 475
    add-int/2addr v5, v6

    .line 476
    invoke-virtual {v2, v4}, Llg1;->r(I)I

    .line 477
    .line 478
    .line 479
    move-result v14

    .line 480
    if-ne v14, v10, :cond_12

    .line 481
    .line 482
    sget-object v9, Lyc0;->e:[I

    .line 483
    .line 484
    invoke-virtual {v2, v4}, Llg1;->r(I)I

    .line 485
    .line 486
    .line 487
    move-result v16

    .line 488
    aget v9, v9, v16

    .line 489
    .line 490
    move/from16 v16, v10

    .line 491
    .line 492
    const/4 v4, 0x6

    .line 493
    goto :goto_8

    .line 494
    :cond_12
    invoke-virtual {v2, v4}, Llg1;->r(I)I

    .line 495
    .line 496
    .line 497
    move-result v16

    .line 498
    sget-object v19, Lyc0;->c:[I

    .line 499
    .line 500
    aget v19, v19, v16

    .line 501
    .line 502
    aget v9, v9, v14

    .line 503
    .line 504
    move/from16 v4, v19

    .line 505
    .line 506
    :goto_8
    add-int/2addr v5, v5

    .line 507
    mul-int/lit8 v20, v4, 0x20

    .line 508
    .line 509
    mul-int v21, v5, v9

    .line 510
    .line 511
    div-int v21, v21, v20

    .line 512
    .line 513
    invoke-virtual {v2, v10}, Llg1;->r(I)I

    .line 514
    .line 515
    .line 516
    move-result v20

    .line 517
    invoke-virtual {v2}, Llg1;->q()Z

    .line 518
    .line 519
    .line 520
    move-result v22

    .line 521
    aget v8, v8, v20

    .line 522
    .line 523
    add-int v8, v8, v22

    .line 524
    .line 525
    invoke-virtual {v2, v7}, Llg1;->o(I)V

    .line 526
    .line 527
    .line 528
    invoke-virtual {v2}, Llg1;->q()Z

    .line 529
    .line 530
    .line 531
    move-result v7

    .line 532
    if-eqz v7, :cond_13

    .line 533
    .line 534
    invoke-virtual {v2, v12}, Llg1;->o(I)V

    .line 535
    .line 536
    .line 537
    :cond_13
    if-nez v20, :cond_15

    .line 538
    .line 539
    invoke-virtual {v2, v13}, Llg1;->o(I)V

    .line 540
    .line 541
    .line 542
    invoke-virtual {v2}, Llg1;->q()Z

    .line 543
    .line 544
    .line 545
    move-result v7

    .line 546
    if-eqz v7, :cond_14

    .line 547
    .line 548
    invoke-virtual {v2, v12}, Llg1;->o(I)V

    .line 549
    .line 550
    .line 551
    :cond_14
    const/4 v7, 0x0

    .line 552
    const/16 v20, 0x0

    .line 553
    .line 554
    goto :goto_9

    .line 555
    :cond_15
    move/from16 v7, v20

    .line 556
    .line 557
    :goto_9
    if-ne v15, v6, :cond_17

    .line 558
    .line 559
    invoke-virtual {v2}, Llg1;->q()Z

    .line 560
    .line 561
    .line 562
    move-result v15

    .line 563
    if-eqz v15, :cond_16

    .line 564
    .line 565
    const/16 v15, 0x10

    .line 566
    .line 567
    invoke-virtual {v2, v15}, Llg1;->o(I)V

    .line 568
    .line 569
    .line 570
    :cond_16
    move v15, v6

    .line 571
    :cond_17
    invoke-virtual {v2}, Llg1;->q()Z

    .line 572
    .line 573
    .line 574
    move-result v18

    .line 575
    if-eqz v18, :cond_31

    .line 576
    .line 577
    const/4 v12, 0x2

    .line 578
    if-le v7, v12, :cond_18

    .line 579
    .line 580
    invoke-virtual {v2, v12}, Llg1;->o(I)V

    .line 581
    .line 582
    .line 583
    :cond_18
    and-int/lit8 v19, v7, 0x1

    .line 584
    .line 585
    if-eqz v19, :cond_19

    .line 586
    .line 587
    if-le v7, v12, :cond_19

    .line 588
    .line 589
    const/4 v12, 0x6

    .line 590
    invoke-virtual {v2, v12}, Llg1;->o(I)V

    .line 591
    .line 592
    .line 593
    goto :goto_a

    .line 594
    :cond_19
    const/4 v12, 0x6

    .line 595
    :goto_a
    and-int/lit8 v17, v7, 0x4

    .line 596
    .line 597
    if-eqz v17, :cond_1a

    .line 598
    .line 599
    invoke-virtual {v2, v12}, Llg1;->o(I)V

    .line 600
    .line 601
    .line 602
    :cond_1a
    if-eqz v22, :cond_1b

    .line 603
    .line 604
    invoke-virtual {v2}, Llg1;->q()Z

    .line 605
    .line 606
    .line 607
    move-result v12

    .line 608
    if-eqz v12, :cond_1b

    .line 609
    .line 610
    invoke-virtual {v2, v13}, Llg1;->o(I)V

    .line 611
    .line 612
    .line 613
    :cond_1b
    if-nez v15, :cond_31

    .line 614
    .line 615
    invoke-virtual {v2}, Llg1;->q()Z

    .line 616
    .line 617
    .line 618
    move-result v12

    .line 619
    if-eqz v12, :cond_1c

    .line 620
    .line 621
    const/4 v12, 0x6

    .line 622
    invoke-virtual {v2, v12}, Llg1;->o(I)V

    .line 623
    .line 624
    .line 625
    goto :goto_b

    .line 626
    :cond_1c
    const/4 v12, 0x6

    .line 627
    :goto_b
    if-nez v7, :cond_1d

    .line 628
    .line 629
    invoke-virtual {v2}, Llg1;->q()Z

    .line 630
    .line 631
    .line 632
    move-result v15

    .line 633
    if-eqz v15, :cond_1d

    .line 634
    .line 635
    invoke-virtual {v2, v12}, Llg1;->o(I)V

    .line 636
    .line 637
    .line 638
    :cond_1d
    invoke-virtual {v2}, Llg1;->q()Z

    .line 639
    .line 640
    .line 641
    move-result v15

    .line 642
    if-eqz v15, :cond_1e

    .line 643
    .line 644
    invoke-virtual {v2, v12}, Llg1;->o(I)V

    .line 645
    .line 646
    .line 647
    :cond_1e
    const/4 v12, 0x2

    .line 648
    invoke-virtual {v2, v12}, Llg1;->r(I)I

    .line 649
    .line 650
    .line 651
    move-result v15

    .line 652
    if-ne v15, v6, :cond_1f

    .line 653
    .line 654
    invoke-virtual {v2, v13}, Llg1;->o(I)V

    .line 655
    .line 656
    .line 657
    move v15, v12

    .line 658
    goto/16 :goto_e

    .line 659
    .line 660
    :cond_1f
    if-ne v15, v12, :cond_21

    .line 661
    .line 662
    const/16 v12, 0xc

    .line 663
    .line 664
    invoke-virtual {v2, v12}, Llg1;->o(I)V

    .line 665
    .line 666
    .line 667
    :cond_20
    const/4 v15, 0x2

    .line 668
    goto/16 :goto_e

    .line 669
    .line 670
    :cond_21
    if-ne v15, v10, :cond_20

    .line 671
    .line 672
    invoke-virtual {v2, v13}, Llg1;->r(I)I

    .line 673
    .line 674
    .line 675
    move-result v12

    .line 676
    invoke-virtual {v2}, Llg1;->q()Z

    .line 677
    .line 678
    .line 679
    move-result v15

    .line 680
    if-eqz v15, :cond_2a

    .line 681
    .line 682
    invoke-virtual {v2, v13}, Llg1;->o(I)V

    .line 683
    .line 684
    .line 685
    invoke-virtual {v2}, Llg1;->q()Z

    .line 686
    .line 687
    .line 688
    move-result v15

    .line 689
    if-eqz v15, :cond_22

    .line 690
    .line 691
    const/4 v15, 0x4

    .line 692
    invoke-virtual {v2, v15}, Llg1;->o(I)V

    .line 693
    .line 694
    .line 695
    goto :goto_c

    .line 696
    :cond_22
    const/4 v15, 0x4

    .line 697
    :goto_c
    invoke-virtual {v2}, Llg1;->q()Z

    .line 698
    .line 699
    .line 700
    move-result v18

    .line 701
    if-eqz v18, :cond_23

    .line 702
    .line 703
    invoke-virtual {v2, v15}, Llg1;->o(I)V

    .line 704
    .line 705
    .line 706
    :cond_23
    invoke-virtual {v2}, Llg1;->q()Z

    .line 707
    .line 708
    .line 709
    move-result v18

    .line 710
    if-eqz v18, :cond_24

    .line 711
    .line 712
    invoke-virtual {v2, v15}, Llg1;->o(I)V

    .line 713
    .line 714
    .line 715
    :cond_24
    invoke-virtual {v2}, Llg1;->q()Z

    .line 716
    .line 717
    .line 718
    move-result v18

    .line 719
    if-eqz v18, :cond_25

    .line 720
    .line 721
    invoke-virtual {v2, v15}, Llg1;->o(I)V

    .line 722
    .line 723
    .line 724
    :cond_25
    invoke-virtual {v2}, Llg1;->q()Z

    .line 725
    .line 726
    .line 727
    move-result v18

    .line 728
    if-eqz v18, :cond_26

    .line 729
    .line 730
    invoke-virtual {v2, v15}, Llg1;->o(I)V

    .line 731
    .line 732
    .line 733
    :cond_26
    invoke-virtual {v2}, Llg1;->q()Z

    .line 734
    .line 735
    .line 736
    move-result v18

    .line 737
    if-eqz v18, :cond_27

    .line 738
    .line 739
    invoke-virtual {v2, v15}, Llg1;->o(I)V

    .line 740
    .line 741
    .line 742
    :cond_27
    invoke-virtual {v2}, Llg1;->q()Z

    .line 743
    .line 744
    .line 745
    move-result v18

    .line 746
    if-eqz v18, :cond_28

    .line 747
    .line 748
    invoke-virtual {v2, v15}, Llg1;->o(I)V

    .line 749
    .line 750
    .line 751
    :cond_28
    invoke-virtual {v2}, Llg1;->q()Z

    .line 752
    .line 753
    .line 754
    move-result v18

    .line 755
    if-eqz v18, :cond_2a

    .line 756
    .line 757
    invoke-virtual {v2}, Llg1;->q()Z

    .line 758
    .line 759
    .line 760
    move-result v18

    .line 761
    if-eqz v18, :cond_29

    .line 762
    .line 763
    invoke-virtual {v2, v15}, Llg1;->o(I)V

    .line 764
    .line 765
    .line 766
    :cond_29
    invoke-virtual {v2}, Llg1;->q()Z

    .line 767
    .line 768
    .line 769
    move-result v18

    .line 770
    if-eqz v18, :cond_2a

    .line 771
    .line 772
    invoke-virtual {v2, v15}, Llg1;->o(I)V

    .line 773
    .line 774
    .line 775
    :cond_2a
    invoke-virtual {v2}, Llg1;->q()Z

    .line 776
    .line 777
    .line 778
    move-result v15

    .line 779
    if-eqz v15, :cond_2b

    .line 780
    .line 781
    invoke-virtual {v2, v13}, Llg1;->o(I)V

    .line 782
    .line 783
    .line 784
    invoke-virtual {v2}, Llg1;->q()Z

    .line 785
    .line 786
    .line 787
    move-result v15

    .line 788
    if-eqz v15, :cond_2b

    .line 789
    .line 790
    const/4 v15, 0x7

    .line 791
    invoke-virtual {v2, v15}, Llg1;->o(I)V

    .line 792
    .line 793
    .line 794
    invoke-virtual {v2}, Llg1;->q()Z

    .line 795
    .line 796
    .line 797
    move-result v15

    .line 798
    if-eqz v15, :cond_2b

    .line 799
    .line 800
    const/16 v15, 0x8

    .line 801
    .line 802
    invoke-virtual {v2, v15}, Llg1;->o(I)V

    .line 803
    .line 804
    .line 805
    move/from16 v23, v15

    .line 806
    .line 807
    const/4 v15, 0x2

    .line 808
    goto :goto_d

    .line 809
    :cond_2b
    const/4 v15, 0x2

    .line 810
    const/16 v23, 0x8

    .line 811
    .line 812
    :goto_d
    add-int/2addr v12, v15

    .line 813
    mul-int/lit8 v12, v12, 0x8

    .line 814
    .line 815
    invoke-virtual {v2, v12}, Llg1;->o(I)V

    .line 816
    .line 817
    .line 818
    invoke-virtual {v2}, Llg1;->w()V

    .line 819
    .line 820
    .line 821
    :goto_e
    if-ge v7, v15, :cond_2d

    .line 822
    .line 823
    invoke-virtual {v2}, Llg1;->q()Z

    .line 824
    .line 825
    .line 826
    move-result v12

    .line 827
    const/16 v15, 0xe

    .line 828
    .line 829
    if-eqz v12, :cond_2c

    .line 830
    .line 831
    invoke-virtual {v2, v15}, Llg1;->o(I)V

    .line 832
    .line 833
    .line 834
    :cond_2c
    if-nez v20, :cond_2d

    .line 835
    .line 836
    invoke-virtual {v2}, Llg1;->q()Z

    .line 837
    .line 838
    .line 839
    move-result v12

    .line 840
    if-eqz v12, :cond_2d

    .line 841
    .line 842
    invoke-virtual {v2, v15}, Llg1;->o(I)V

    .line 843
    .line 844
    .line 845
    :cond_2d
    invoke-virtual {v2}, Llg1;->q()Z

    .line 846
    .line 847
    .line 848
    move-result v12

    .line 849
    if-eqz v12, :cond_30

    .line 850
    .line 851
    if-nez v16, :cond_2e

    .line 852
    .line 853
    invoke-virtual {v2, v13}, Llg1;->o(I)V

    .line 854
    .line 855
    .line 856
    const/4 v12, 0x0

    .line 857
    :goto_f
    const/4 v15, 0x0

    .line 858
    goto :goto_11

    .line 859
    :cond_2e
    const/4 v12, 0x0

    .line 860
    :goto_10
    if-ge v12, v4, :cond_30

    .line 861
    .line 862
    invoke-virtual {v2}, Llg1;->q()Z

    .line 863
    .line 864
    .line 865
    move-result v15

    .line 866
    if-eqz v15, :cond_2f

    .line 867
    .line 868
    invoke-virtual {v2, v13}, Llg1;->o(I)V

    .line 869
    .line 870
    .line 871
    :cond_2f
    add-int/lit8 v12, v12, 0x1

    .line 872
    .line 873
    goto :goto_10

    .line 874
    :cond_30
    move/from16 v12, v16

    .line 875
    .line 876
    goto :goto_f

    .line 877
    :cond_31
    move/from16 v12, v16

    .line 878
    .line 879
    :goto_11
    invoke-virtual {v2}, Llg1;->q()Z

    .line 880
    .line 881
    .line 882
    move-result v16

    .line 883
    if-eqz v16, :cond_36

    .line 884
    .line 885
    invoke-virtual {v2, v13}, Llg1;->o(I)V

    .line 886
    .line 887
    .line 888
    const/4 v13, 0x2

    .line 889
    if-ne v7, v13, :cond_32

    .line 890
    .line 891
    const/4 v6, 0x4

    .line 892
    invoke-virtual {v2, v6}, Llg1;->o(I)V

    .line 893
    .line 894
    .line 895
    move v7, v13

    .line 896
    :cond_32
    const/4 v6, 0x6

    .line 897
    if-lt v7, v6, :cond_33

    .line 898
    .line 899
    invoke-virtual {v2, v13}, Llg1;->o(I)V

    .line 900
    .line 901
    .line 902
    :cond_33
    invoke-virtual {v2}, Llg1;->q()Z

    .line 903
    .line 904
    .line 905
    move-result v6

    .line 906
    if-eqz v6, :cond_34

    .line 907
    .line 908
    const/16 v6, 0x8

    .line 909
    .line 910
    invoke-virtual {v2, v6}, Llg1;->o(I)V

    .line 911
    .line 912
    .line 913
    goto :goto_12

    .line 914
    :cond_34
    const/16 v6, 0x8

    .line 915
    .line 916
    :goto_12
    if-nez v7, :cond_35

    .line 917
    .line 918
    invoke-virtual {v2}, Llg1;->q()Z

    .line 919
    .line 920
    .line 921
    move-result v7

    .line 922
    if-eqz v7, :cond_35

    .line 923
    .line 924
    invoke-virtual {v2, v6}, Llg1;->o(I)V

    .line 925
    .line 926
    .line 927
    :cond_35
    if-ge v14, v10, :cond_36

    .line 928
    .line 929
    invoke-virtual {v2}, Llg1;->m()V

    .line 930
    .line 931
    .line 932
    :cond_36
    if-nez v15, :cond_37

    .line 933
    .line 934
    if-eq v12, v10, :cond_37

    .line 935
    .line 936
    invoke-virtual {v2}, Llg1;->m()V

    .line 937
    .line 938
    .line 939
    :cond_37
    const/4 v13, 0x2

    .line 940
    if-ne v15, v13, :cond_39

    .line 941
    .line 942
    if-eq v12, v10, :cond_38

    .line 943
    .line 944
    invoke-virtual {v2}, Llg1;->q()Z

    .line 945
    .line 946
    .line 947
    move-result v6

    .line 948
    if-eqz v6, :cond_39

    .line 949
    .line 950
    :cond_38
    const/4 v12, 0x6

    .line 951
    goto :goto_13

    .line 952
    :cond_39
    const/4 v12, 0x6

    .line 953
    goto :goto_14

    .line 954
    :goto_13
    invoke-virtual {v2, v12}, Llg1;->o(I)V

    .line 955
    .line 956
    .line 957
    :goto_14
    invoke-virtual {v2}, Llg1;->q()Z

    .line 958
    .line 959
    .line 960
    move-result v6

    .line 961
    if-eqz v6, :cond_3a

    .line 962
    .line 963
    invoke-virtual {v2, v12}, Llg1;->r(I)I

    .line 964
    .line 965
    .line 966
    move-result v6

    .line 967
    const/4 v7, 0x1

    .line 968
    if-ne v6, v7, :cond_3a

    .line 969
    .line 970
    const/16 v15, 0x8

    .line 971
    .line 972
    invoke-virtual {v2, v15}, Llg1;->r(I)I

    .line 973
    .line 974
    .line 975
    move-result v2

    .line 976
    if-ne v2, v7, :cond_3a

    .line 977
    .line 978
    const-string v2, "audio/eac3-joc"

    .line 979
    .line 980
    goto :goto_15

    .line 981
    :cond_3a
    const-string v2, "audio/eac3"

    .line 982
    .line 983
    :goto_15
    mul-int/lit16 v4, v4, 0x100

    .line 984
    .line 985
    move/from16 v7, v21

    .line 986
    .line 987
    goto :goto_1a

    .line 988
    :cond_3b
    const/16 v4, 0x20

    .line 989
    .line 990
    invoke-virtual {v2, v4}, Llg1;->o(I)V

    .line 991
    .line 992
    .line 993
    const/4 v12, 0x2

    .line 994
    invoke-virtual {v2, v12}, Llg1;->r(I)I

    .line 995
    .line 996
    .line 997
    move-result v4

    .line 998
    if-ne v4, v10, :cond_3c

    .line 999
    .line 1000
    const/4 v5, 0x0

    .line 1001
    :goto_16
    const/4 v12, 0x6

    .line 1002
    goto :goto_17

    .line 1003
    :cond_3c
    move-object v5, v11

    .line 1004
    goto :goto_16

    .line 1005
    :goto_17
    invoke-virtual {v2, v12}, Llg1;->r(I)I

    .line 1006
    .line 1007
    .line 1008
    move-result v6

    .line 1009
    div-int/lit8 v7, v6, 0x2

    .line 1010
    .line 1011
    sget-object v12, Lyc0;->g:[I

    .line 1012
    .line 1013
    aget v7, v12, v7

    .line 1014
    .line 1015
    mul-int/lit16 v7, v7, 0x3e8

    .line 1016
    .line 1017
    invoke-static {v4, v6}, Lyc0;->x(II)I

    .line 1018
    .line 1019
    .line 1020
    move-result v6

    .line 1021
    const/16 v15, 0x8

    .line 1022
    .line 1023
    invoke-virtual {v2, v15}, Llg1;->o(I)V

    .line 1024
    .line 1025
    .line 1026
    invoke-virtual {v2, v10}, Llg1;->r(I)I

    .line 1027
    .line 1028
    .line 1029
    move-result v12

    .line 1030
    and-int/lit8 v13, v12, 0x1

    .line 1031
    .line 1032
    if-eqz v13, :cond_3d

    .line 1033
    .line 1034
    const/4 v13, 0x1

    .line 1035
    if-eq v12, v13, :cond_3d

    .line 1036
    .line 1037
    const/4 v13, 0x2

    .line 1038
    invoke-virtual {v2, v13}, Llg1;->o(I)V

    .line 1039
    .line 1040
    .line 1041
    goto :goto_18

    .line 1042
    :cond_3d
    const/4 v13, 0x2

    .line 1043
    :goto_18
    and-int/lit8 v14, v12, 0x4

    .line 1044
    .line 1045
    if-eqz v14, :cond_3e

    .line 1046
    .line 1047
    invoke-virtual {v2, v13}, Llg1;->o(I)V

    .line 1048
    .line 1049
    .line 1050
    :cond_3e
    if-ne v12, v13, :cond_3f

    .line 1051
    .line 1052
    invoke-virtual {v2, v13}, Llg1;->o(I)V

    .line 1053
    .line 1054
    .line 1055
    :cond_3f
    if-ge v4, v10, :cond_40

    .line 1056
    .line 1057
    aget v15, v9, v4

    .line 1058
    .line 1059
    goto :goto_19

    .line 1060
    :cond_40
    const/4 v15, -0x1

    .line 1061
    :goto_19
    invoke-virtual {v2}, Llg1;->q()Z

    .line 1062
    .line 1063
    .line 1064
    move-result v2

    .line 1065
    aget v4, v8, v12

    .line 1066
    .line 1067
    add-int v8, v4, v2

    .line 1068
    .line 1069
    const/16 v4, 0x600

    .line 1070
    .line 1071
    move-object v2, v5

    .line 1072
    move v5, v6

    .line 1073
    move v9, v15

    .line 1074
    :goto_1a
    iget-object v6, v0, Lzl1;->m:Lph4;

    .line 1075
    .line 1076
    if-eqz v6, :cond_41

    .line 1077
    .line 1078
    iget v10, v6, Lph4;->E:I

    .line 1079
    .line 1080
    if-ne v8, v10, :cond_41

    .line 1081
    .line 1082
    iget v10, v6, Lph4;->F:I

    .line 1083
    .line 1084
    if-ne v9, v10, :cond_41

    .line 1085
    .line 1086
    iget-object v6, v6, Lph4;->m:Ljava/lang/String;

    .line 1087
    .line 1088
    invoke-static {v2, v6}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1089
    .line 1090
    .line 1091
    move-result v6

    .line 1092
    if-nez v6, :cond_43

    .line 1093
    .line 1094
    :cond_41
    new-instance v6, Lgg4;

    .line 1095
    .line 1096
    invoke-direct {v6}, Lgg4;-><init>()V

    .line 1097
    .line 1098
    .line 1099
    iget-object v10, v0, Lzl1;->g:Ljava/lang/String;

    .line 1100
    .line 1101
    iput-object v10, v6, Lgg4;->a:Ljava/lang/String;

    .line 1102
    .line 1103
    iget-object v10, v0, Lzl1;->f:Ljava/lang/String;

    .line 1104
    .line 1105
    invoke-virtual {v6, v10}, Lgg4;->d(Ljava/lang/String;)V

    .line 1106
    .line 1107
    .line 1108
    invoke-virtual {v6, v2}, Lgg4;->e(Ljava/lang/String;)V

    .line 1109
    .line 1110
    .line 1111
    iput v8, v6, Lgg4;->D:I

    .line 1112
    .line 1113
    iput v9, v6, Lgg4;->E:I

    .line 1114
    .line 1115
    iget-object v8, v0, Lzl1;->d:Ljava/lang/String;

    .line 1116
    .line 1117
    iput-object v8, v6, Lgg4;->d:Ljava/lang/String;

    .line 1118
    .line 1119
    iget v8, v0, Lzl1;->e:I

    .line 1120
    .line 1121
    iput v8, v6, Lgg4;->f:I

    .line 1122
    .line 1123
    iput v7, v6, Lgg4;->h:I

    .line 1124
    .line 1125
    invoke-virtual {v11, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1126
    .line 1127
    .line 1128
    move-result v2

    .line 1129
    if-eqz v2, :cond_42

    .line 1130
    .line 1131
    iput v7, v6, Lgg4;->g:I

    .line 1132
    .line 1133
    :cond_42
    new-instance v2, Lph4;

    .line 1134
    .line 1135
    invoke-direct {v2, v6}, Lph4;-><init>(Lgg4;)V

    .line 1136
    .line 1137
    .line 1138
    iput-object v2, v0, Lzl1;->m:Lph4;

    .line 1139
    .line 1140
    iget-object v6, v0, Lzl1;->h:Ljg1;

    .line 1141
    .line 1142
    invoke-interface {v6, v2}, Ljg1;->d(Lph4;)V

    .line 1143
    .line 1144
    .line 1145
    :cond_43
    iput v5, v0, Lzl1;->n:I

    .line 1146
    .line 1147
    iget-object v2, v0, Lzl1;->m:Lph4;

    .line 1148
    .line 1149
    iget v2, v2, Lph4;->F:I

    .line 1150
    .line 1151
    int-to-long v4, v4

    .line 1152
    const-wide/32 v6, 0xf4240

    .line 1153
    .line 1154
    .line 1155
    mul-long/2addr v4, v6

    .line 1156
    int-to-long v6, v2

    .line 1157
    div-long/2addr v4, v6

    .line 1158
    iput-wide v4, v0, Lzl1;->l:J

    .line 1159
    .line 1160
    const/4 v2, 0x0

    .line 1161
    invoke-virtual {v3, v2}, Lkz2;->E(I)V

    .line 1162
    .line 1163
    .line 1164
    iget-object v4, v0, Lzl1;->h:Ljg1;

    .line 1165
    .line 1166
    const/16 v5, 0x80

    .line 1167
    .line 1168
    invoke-interface {v4, v3, v5, v2}, Ljg1;->a(Lkz2;II)V

    .line 1169
    .line 1170
    .line 1171
    const/4 v12, 0x2

    .line 1172
    iput v12, v0, Lzl1;->i:I

    .line 1173
    .line 1174
    goto/16 :goto_5

    .line 1175
    .line 1176
    :cond_44
    :goto_1b
    invoke-virtual {v1}, Lkz2;->B()I

    .line 1177
    .line 1178
    .line 1179
    move-result v2

    .line 1180
    if-lez v2, :cond_c

    .line 1181
    .line 1182
    iget-boolean v2, v0, Lzl1;->k:Z

    .line 1183
    .line 1184
    if-nez v2, :cond_46

    .line 1185
    .line 1186
    invoke-virtual {v1}, Lkz2;->K()I

    .line 1187
    .line 1188
    .line 1189
    move-result v2

    .line 1190
    if-ne v2, v5, :cond_45

    .line 1191
    .line 1192
    const/4 v7, 0x1

    .line 1193
    goto :goto_1c

    .line 1194
    :cond_45
    const/4 v7, 0x0

    .line 1195
    :goto_1c
    iput-boolean v7, v0, Lzl1;->k:Z

    .line 1196
    .line 1197
    goto :goto_1b

    .line 1198
    :cond_46
    invoke-virtual {v1}, Lkz2;->K()I

    .line 1199
    .line 1200
    .line 1201
    move-result v2

    .line 1202
    const/16 v4, 0x77

    .line 1203
    .line 1204
    if-ne v2, v4, :cond_47

    .line 1205
    .line 1206
    const/4 v7, 0x0

    .line 1207
    iput-boolean v7, v0, Lzl1;->k:Z

    .line 1208
    .line 1209
    const/4 v13, 0x1

    .line 1210
    iput v13, v0, Lzl1;->i:I

    .line 1211
    .line 1212
    iget-object v2, v3, Lkz2;->a:[B

    .line 1213
    .line 1214
    aput-byte v5, v2, v7

    .line 1215
    .line 1216
    aput-byte v4, v2, v13

    .line 1217
    .line 1218
    const/4 v12, 0x2

    .line 1219
    iput v12, v0, Lzl1;->j:I

    .line 1220
    .line 1221
    goto/16 :goto_5

    .line 1222
    .line 1223
    :cond_47
    const/4 v7, 0x0

    .line 1224
    const/4 v12, 0x2

    .line 1225
    const/4 v13, 0x1

    .line 1226
    if-ne v2, v5, :cond_48

    .line 1227
    .line 1228
    move v2, v13

    .line 1229
    goto :goto_1d

    .line 1230
    :cond_48
    move v2, v7

    .line 1231
    :goto_1d
    iput-boolean v2, v0, Lzl1;->k:Z

    .line 1232
    .line 1233
    goto :goto_1b

    .line 1234
    :cond_49
    return-void

    .line 1235
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final c(Z)V
    .locals 0

    .line 1
    iget p1, p0, Lzl1;->a:I

    .line 2
    .line 3
    return-void
.end method

.method public final d(IJ)V
    .locals 0

    .line 1
    iget p1, p0, Lzl1;->a:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iput-wide p2, p0, Lzl1;->o:J

    .line 7
    .line 8
    return-void

    .line 9
    :pswitch_0
    iput-wide p2, p0, Lzl1;->o:J

    .line 10
    .line 11
    return-void

    .line 12
    nop

    .line 13
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final e(Lnf1;Lin1;)V
    .locals 1

    .line 1
    iget v0, p0, Lzl1;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p2}, Lin1;->a()V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p2}, Lin1;->b()V

    .line 10
    .line 11
    .line 12
    iget-object v0, p2, Lin1;->e:Ljava/lang/String;

    .line 13
    .line 14
    iput-object v0, p0, Lzl1;->g:Ljava/lang/String;

    .line 15
    .line 16
    invoke-virtual {p2}, Lin1;->b()V

    .line 17
    .line 18
    .line 19
    iget p2, p2, Lin1;->d:I

    .line 20
    .line 21
    const/4 v0, 0x1

    .line 22
    invoke-interface {p1, p2, v0}, Lnf1;->z(II)Ljg1;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    iput-object p1, p0, Lzl1;->h:Ljg1;

    .line 27
    .line 28
    return-void

    .line 29
    :pswitch_0
    invoke-virtual {p2}, Lin1;->a()V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p2}, Lin1;->b()V

    .line 33
    .line 34
    .line 35
    iget-object v0, p2, Lin1;->e:Ljava/lang/String;

    .line 36
    .line 37
    iput-object v0, p0, Lzl1;->g:Ljava/lang/String;

    .line 38
    .line 39
    invoke-virtual {p2}, Lin1;->b()V

    .line 40
    .line 41
    .line 42
    iget p2, p2, Lin1;->d:I

    .line 43
    .line 44
    const/4 v0, 0x1

    .line 45
    invoke-interface {p1, p2, v0}, Lnf1;->z(II)Ljg1;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    iput-object p1, p0, Lzl1;->h:Ljg1;

    .line 50
    .line 51
    return-void

    .line 52
    nop

    .line 53
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
