.class public final Lii3;
.super Lti3;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final synthetic f:I

.field public final g:Ljava/lang/Object;

.field public final h:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lfr1;Lgi3;Landroid/util/DisplayMetrics;Landroid/view/View;Lgk3;)V
    .locals 7

    const/4 v0, 0x3

    iput v0, p0, Lii3;->f:I

    const/16 v0, 0x7c

    .line 1
    invoke-virtual {p5, v0}, Lgk3;->a(I)Lfk3;

    move-result-object v6

    const-string v2, "P6F0ZRwWAQfQFwxv0Pq3Kr7GsgVJK2iuMjcPK+Aq3kgEIqqz95IgzklzBsNVE1/z"

    const-string v3, "noWWhxc3WlXlb4cqOg7NtD3uZWHj+L+uVXJvY7XilyA="

    move-object v1, p0

    move-object v4, p1

    move-object v5, p2

    .line 2
    invoke-direct/range {v1 .. v6}, Lti3;-><init>(Ljava/lang/String;Ljava/lang/String;Lfr1;Lgi3;Lfk3;)V

    iput-object p3, v1, Lii3;->g:Ljava/lang/Object;

    iput-object p4, v1, Lii3;->h:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lfr1;Lgi3;Landroid/view/View;Landroid/app/Activity;Lgk3;)V
    .locals 7

    const/4 v0, 0x0

    iput v0, p0, Lii3;->f:I

    const/16 v0, 0x6f

    .line 3
    invoke-virtual {p5, v0}, Lgk3;->a(I)Lfk3;

    move-result-object v6

    const-string v2, "71irZxeyztMVPxtkZNjCXCWzc9uBzzqfxPgw1LkoaIGD1YWtoRaLj8ZtqyMHro2I"

    const-string v3, "sazFFsabItlse3qDY43b32ZnLCjQJ0+CJQYLaEeKmSw="

    move-object v1, p0

    move-object v4, p1

    move-object v5, p2

    .line 4
    invoke-direct/range {v1 .. v6}, Lti3;-><init>(Ljava/lang/String;Ljava/lang/String;Lfr1;Lgi3;Lfk3;)V

    iput-object p3, v1, Lii3;->h:Ljava/lang/Object;

    iput-object p4, v1, Lii3;->g:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lfr1;Lgi3;Leg3;Ljava/util/Map;Lgk3;)V
    .locals 7

    const/4 v0, 0x2

    iput v0, p0, Lii3;->f:I

    const/16 v0, 0x7a

    .line 7
    invoke-virtual {p5, v0}, Lgk3;->a(I)Lfk3;

    move-result-object v6

    const-string v2, "lJ67yAwBUtoZhasVqN11g6g6opAmTxjVxzUKxhl0fOhTr4nQH4cVWV7NJy0RD49z"

    const-string v3, "0isRm8IoYsyXMQyBCJPbREn4r5FwCMP2Q3k9zoXRqyk="

    move-object v1, p0

    move-object v4, p1

    move-object v5, p2

    .line 8
    invoke-direct/range {v1 .. v6}, Lti3;-><init>(Ljava/lang/String;Ljava/lang/String;Lfr1;Lgi3;Lfk3;)V

    iput-object p4, v1, Lii3;->g:Ljava/lang/Object;

    iput-object p3, v1, Lii3;->h:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lfr1;Lgi3;Ljava/util/Map;Landroid/content/Context;Lgk3;)V
    .locals 7

    const/4 v0, 0x1

    iput v0, p0, Lii3;->f:I

    const/16 v0, 0x78

    .line 5
    invoke-virtual {p5, v0}, Lgk3;->a(I)Lfk3;

    move-result-object v6

    const-string v2, "yl2V2fIFd/+gtM2i3wtw7rRydnC7INCVtpRFdnYEC9BkEYS1KI4o6evRDqm9gjRN"

    const-string v3, "/ngo8an629JW3IpM1KyGjEthGKpic0JTOThCbrYq6ZE="

    move-object v1, p0

    move-object v4, p1

    move-object v5, p2

    .line 6
    invoke-direct/range {v1 .. v6}, Lti3;-><init>(Ljava/lang/String;Ljava/lang/String;Lfr1;Lgi3;Lfk3;)V

    iput-object p4, v1, Lii3;->g:Ljava/lang/Object;

    iput-object p3, v1, Lii3;->h:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/reflect/Method;Lfr1;)V
    .locals 13

    .line 1
    iget v0, p0, Lii3;->f:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lii3;->h:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Landroid/view/View;

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    iget-object v1, p0, Lii3;->g:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v1, Landroid/util/DisplayMetrics;

    .line 16
    .line 17
    filled-new-array {v1, v0}, [Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    const-string v1, ""

    .line 22
    .line 23
    invoke-virtual {p1, v1, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    check-cast p1, [Ljava/lang/Long;

    .line 31
    .line 32
    invoke-static {}, Lpr1;->A()Lor1;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    const/4 v1, 0x2

    .line 37
    aget-object v1, p1, v1

    .line 38
    .line 39
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 40
    .line 41
    .line 42
    move-result-wide v1

    .line 43
    invoke-virtual {v0}, Ln54;->b()V

    .line 44
    .line 45
    .line 46
    iget-object v3, v0, Ln54;->g:Lp54;

    .line 47
    .line 48
    check-cast v3, Lpr1;

    .line 49
    .line 50
    invoke-virtual {v3, v1, v2}, Lpr1;->C(J)V

    .line 51
    .line 52
    .line 53
    const/4 v1, 0x1

    .line 54
    aget-object v1, p1, v1

    .line 55
    .line 56
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 57
    .line 58
    .line 59
    move-result-wide v1

    .line 60
    invoke-virtual {v0}, Ln54;->b()V

    .line 61
    .line 62
    .line 63
    iget-object v3, v0, Ln54;->g:Lp54;

    .line 64
    .line 65
    check-cast v3, Lpr1;

    .line 66
    .line 67
    invoke-virtual {v3, v1, v2}, Lpr1;->D(J)V

    .line 68
    .line 69
    .line 70
    const/4 v1, 0x0

    .line 71
    aget-object v1, p1, v1

    .line 72
    .line 73
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 74
    .line 75
    .line 76
    move-result-wide v1

    .line 77
    invoke-virtual {v0}, Ln54;->b()V

    .line 78
    .line 79
    .line 80
    iget-object v3, v0, Ln54;->g:Lp54;

    .line 81
    .line 82
    check-cast v3, Lpr1;

    .line 83
    .line 84
    invoke-virtual {v3, v1, v2}, Lpr1;->E(J)V

    .line 85
    .line 86
    .line 87
    const/4 v1, 0x3

    .line 88
    aget-object v1, p1, v1

    .line 89
    .line 90
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 91
    .line 92
    .line 93
    move-result-wide v1

    .line 94
    invoke-virtual {v0}, Ln54;->b()V

    .line 95
    .line 96
    .line 97
    iget-object v3, v0, Ln54;->g:Lp54;

    .line 98
    .line 99
    check-cast v3, Lpr1;

    .line 100
    .line 101
    invoke-virtual {v3, v1, v2}, Lpr1;->B(J)V

    .line 102
    .line 103
    .line 104
    const/4 v1, 0x4

    .line 105
    aget-object p1, p1, v1

    .line 106
    .line 107
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 108
    .line 109
    .line 110
    move-result-wide v1

    .line 111
    invoke-virtual {v0}, Ln54;->b()V

    .line 112
    .line 113
    .line 114
    iget-object p1, v0, Ln54;->g:Lp54;

    .line 115
    .line 116
    check-cast p1, Lpr1;

    .line 117
    .line 118
    invoke-virtual {p1, v1, v2}, Lpr1;->F(J)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v0}, Ln54;->d()Lp54;

    .line 122
    .line 123
    .line 124
    move-result-object p1

    .line 125
    check-cast p1, Lpr1;

    .line 126
    .line 127
    invoke-virtual {p2}, Ln54;->b()V

    .line 128
    .line 129
    .line 130
    iget-object p2, p2, Ln54;->g:Lp54;

    .line 131
    .line 132
    check-cast p2, Lqr1;

    .line 133
    .line 134
    invoke-virtual {p2, p1}, Lqr1;->W(Lpr1;)V

    .line 135
    .line 136
    .line 137
    :goto_0
    return-void

    .line 138
    :pswitch_0
    const/16 v0, 0x9

    .line 139
    .line 140
    new-array v1, v0, [Ljava/lang/Long;

    .line 141
    .line 142
    const-wide/16 v2, -0x1

    .line 143
    .line 144
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 145
    .line 146
    .line 147
    move-result-object v2

    .line 148
    invoke-static {v1, v2}, Ljava/util/Arrays;->fill([Ljava/lang/Object;Ljava/lang/Object;)V

    .line 149
    .line 150
    .line 151
    iget-object v3, p0, Lii3;->g:Ljava/lang/Object;

    .line 152
    .line 153
    check-cast v3, Ljava/util/Map;

    .line 154
    .line 155
    const-string v4, "tcq"

    .line 156
    .line 157
    invoke-interface {v3, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object v4

    .line 161
    check-cast v4, Ljava/lang/Long;

    .line 162
    .line 163
    if-eqz v4, :cond_1

    .line 164
    .line 165
    goto :goto_1

    .line 166
    :cond_1
    move-object v4, v2

    .line 167
    :goto_1
    const/4 v5, 0x0

    .line 168
    aput-object v4, v1, v5

    .line 169
    .line 170
    const-string v4, "tpq"

    .line 171
    .line 172
    invoke-interface {v3, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v4

    .line 176
    check-cast v4, Ljava/lang/Long;

    .line 177
    .line 178
    if-eqz v4, :cond_2

    .line 179
    .line 180
    goto :goto_2

    .line 181
    :cond_2
    move-object v4, v2

    .line 182
    :goto_2
    const/4 v6, 0x1

    .line 183
    aput-object v4, v1, v6

    .line 184
    .line 185
    const-string v4, "tcv"

    .line 186
    .line 187
    invoke-interface {v3, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object v4

    .line 191
    check-cast v4, Ljava/lang/Long;

    .line 192
    .line 193
    if-eqz v4, :cond_3

    .line 194
    .line 195
    goto :goto_3

    .line 196
    :cond_3
    move-object v4, v2

    .line 197
    :goto_3
    const/4 v7, 0x2

    .line 198
    aput-object v4, v1, v7

    .line 199
    .line 200
    const-string v4, "tpv"

    .line 201
    .line 202
    invoke-interface {v3, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object v4

    .line 206
    check-cast v4, Ljava/lang/Long;

    .line 207
    .line 208
    if-eqz v4, :cond_4

    .line 209
    .line 210
    goto :goto_4

    .line 211
    :cond_4
    move-object v4, v2

    .line 212
    :goto_4
    const/4 v8, 0x3

    .line 213
    aput-object v4, v1, v8

    .line 214
    .line 215
    const-string v4, "tchv"

    .line 216
    .line 217
    invoke-interface {v3, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    move-result-object v4

    .line 221
    check-cast v4, Ljava/lang/Long;

    .line 222
    .line 223
    if-eqz v4, :cond_5

    .line 224
    .line 225
    goto :goto_5

    .line 226
    :cond_5
    move-object v4, v2

    .line 227
    :goto_5
    const/4 v9, 0x4

    .line 228
    aput-object v4, v1, v9

    .line 229
    .line 230
    const-string v4, "tphv"

    .line 231
    .line 232
    invoke-interface {v3, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    move-result-object v4

    .line 236
    check-cast v4, Ljava/lang/Long;

    .line 237
    .line 238
    if-eqz v4, :cond_6

    .line 239
    .line 240
    goto :goto_6

    .line 241
    :cond_6
    move-object v4, v2

    .line 242
    :goto_6
    const/4 v10, 0x5

    .line 243
    aput-object v4, v1, v10

    .line 244
    .line 245
    const-string v4, "tcc"

    .line 246
    .line 247
    invoke-interface {v3, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 248
    .line 249
    .line 250
    move-result-object v4

    .line 251
    check-cast v4, Ljava/lang/Long;

    .line 252
    .line 253
    if-eqz v4, :cond_7

    .line 254
    .line 255
    goto :goto_7

    .line 256
    :cond_7
    move-object v4, v2

    .line 257
    :goto_7
    const/4 v11, 0x6

    .line 258
    aput-object v4, v1, v11

    .line 259
    .line 260
    const-string v4, "tpc"

    .line 261
    .line 262
    invoke-interface {v3, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 263
    .line 264
    .line 265
    move-result-object v4

    .line 266
    check-cast v4, Ljava/lang/Long;

    .line 267
    .line 268
    if-eqz v4, :cond_8

    .line 269
    .line 270
    goto :goto_8

    .line 271
    :cond_8
    move-object v4, v2

    .line 272
    :goto_8
    const/4 v12, 0x7

    .line 273
    aput-object v4, v1, v12

    .line 274
    .line 275
    const-string v4, "tst"

    .line 276
    .line 277
    invoke-interface {v3, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 278
    .line 279
    .line 280
    move-result-object v3

    .line 281
    check-cast v3, Ljava/lang/Long;

    .line 282
    .line 283
    if-eqz v3, :cond_9

    .line 284
    .line 285
    goto :goto_9

    .line 286
    :cond_9
    move-object v3, v2

    .line 287
    :goto_9
    const/16 v4, 0x8

    .line 288
    .line 289
    aput-object v3, v1, v4

    .line 290
    .line 291
    move v3, v5

    .line 292
    :goto_a
    if-ge v3, v0, :cond_b

    .line 293
    .line 294
    aget-object v4, v1, v3

    .line 295
    .line 296
    if-nez v4, :cond_a

    .line 297
    .line 298
    aput-object v2, v1, v3

    .line 299
    .line 300
    :cond_a
    add-int/lit8 v3, v3, 0x1

    .line 301
    .line 302
    goto :goto_a

    .line 303
    :cond_b
    iget-object v0, p0, Lii3;->h:Ljava/lang/Object;

    .line 304
    .line 305
    check-cast v0, Leg3;

    .line 306
    .line 307
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 308
    .line 309
    .line 310
    move-result v0

    .line 311
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 312
    .line 313
    .line 314
    move-result-object v0

    .line 315
    filled-new-array {v1, v0}, [Ljava/lang/Object;

    .line 316
    .line 317
    .line 318
    move-result-object v0

    .line 319
    const-string v1, ""

    .line 320
    .line 321
    invoke-virtual {p1, v1, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 322
    .line 323
    .line 324
    move-result-object p1

    .line 325
    check-cast p1, [Ljava/lang/Long;

    .line 326
    .line 327
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 328
    .line 329
    .line 330
    monitor-enter p2

    .line 331
    :try_start_0
    aget-object v0, p1, v5

    .line 332
    .line 333
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 334
    .line 335
    .line 336
    move-result-wide v0

    .line 337
    invoke-virtual {p2}, Ln54;->b()V

    .line 338
    .line 339
    .line 340
    iget-object v2, p2, Ln54;->g:Lp54;

    .line 341
    .line 342
    check-cast v2, Lqr1;

    .line 343
    .line 344
    invoke-virtual {v2, v0, v1}, Lqr1;->n0(J)V

    .line 345
    .line 346
    .line 347
    aget-object v0, p1, v6

    .line 348
    .line 349
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 350
    .line 351
    .line 352
    move-result-wide v0

    .line 353
    invoke-virtual {p2}, Ln54;->b()V

    .line 354
    .line 355
    .line 356
    iget-object v2, p2, Ln54;->g:Lp54;

    .line 357
    .line 358
    check-cast v2, Lqr1;

    .line 359
    .line 360
    invoke-virtual {v2, v0, v1}, Lqr1;->D(J)V

    .line 361
    .line 362
    .line 363
    aget-object v0, p1, v7

    .line 364
    .line 365
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 366
    .line 367
    .line 368
    move-result-wide v0

    .line 369
    invoke-virtual {p2}, Ln54;->b()V

    .line 370
    .line 371
    .line 372
    iget-object v2, p2, Ln54;->g:Lp54;

    .line 373
    .line 374
    check-cast v2, Lqr1;

    .line 375
    .line 376
    invoke-virtual {v2, v0, v1}, Lqr1;->R0(J)V

    .line 377
    .line 378
    .line 379
    aget-object v0, p1, v8

    .line 380
    .line 381
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 382
    .line 383
    .line 384
    move-result-wide v0

    .line 385
    invoke-virtual {p2}, Ln54;->b()V

    .line 386
    .line 387
    .line 388
    iget-object v2, p2, Ln54;->g:Lp54;

    .line 389
    .line 390
    check-cast v2, Lqr1;

    .line 391
    .line 392
    invoke-virtual {v2, v0, v1}, Lqr1;->O0(J)V

    .line 393
    .line 394
    .line 395
    aget-object v0, p1, v9

    .line 396
    .line 397
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 398
    .line 399
    .line 400
    move-result-wide v0

    .line 401
    invoke-virtual {p2}, Ln54;->b()V

    .line 402
    .line 403
    .line 404
    iget-object v2, p2, Ln54;->g:Lp54;

    .line 405
    .line 406
    check-cast v2, Lqr1;

    .line 407
    .line 408
    invoke-virtual {v2, v0, v1}, Lqr1;->j0(J)V

    .line 409
    .line 410
    .line 411
    aget-object v0, p1, v10

    .line 412
    .line 413
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 414
    .line 415
    .line 416
    move-result-wide v0

    .line 417
    invoke-virtual {p2}, Ln54;->b()V

    .line 418
    .line 419
    .line 420
    iget-object v2, p2, Ln54;->g:Lp54;

    .line 421
    .line 422
    check-cast v2, Lqr1;

    .line 423
    .line 424
    invoke-virtual {v2, v0, v1}, Lqr1;->k0(J)V

    .line 425
    .line 426
    .line 427
    aget-object v0, p1, v11

    .line 428
    .line 429
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 430
    .line 431
    .line 432
    move-result-wide v0

    .line 433
    invoke-virtual {p2}, Ln54;->b()V

    .line 434
    .line 435
    .line 436
    iget-object v2, p2, Ln54;->g:Lp54;

    .line 437
    .line 438
    check-cast v2, Lqr1;

    .line 439
    .line 440
    invoke-virtual {v2, v0, v1}, Lqr1;->Q(J)V

    .line 441
    .line 442
    .line 443
    aget-object p1, p1, v12

    .line 444
    .line 445
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 446
    .line 447
    .line 448
    move-result-wide v0

    .line 449
    invoke-virtual {p2}, Ln54;->b()V

    .line 450
    .line 451
    .line 452
    iget-object p1, p2, Ln54;->g:Lp54;

    .line 453
    .line 454
    check-cast p1, Lqr1;

    .line 455
    .line 456
    invoke-virtual {p1, v0, v1}, Lqr1;->R(J)V

    .line 457
    .line 458
    .line 459
    monitor-exit p2

    .line 460
    return-void

    .line 461
    :catchall_0
    move-exception p1

    .line 462
    monitor-exit p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 463
    throw p1

    .line 464
    :pswitch_1
    const-wide/16 v0, -0x1

    .line 465
    .line 466
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 467
    .line 468
    .line 469
    move-result-object v0

    .line 470
    :try_start_1
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 471
    .line 472
    const/16 v2, 0x1e

    .line 473
    .line 474
    if-lt v1, v2, :cond_d

    .line 475
    .line 476
    const-string v1, ""

    .line 477
    .line 478
    iget-object v2, p0, Lii3;->g:Ljava/lang/Object;

    .line 479
    .line 480
    check-cast v2, Landroid/content/Context;

    .line 481
    .line 482
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 483
    .line 484
    .line 485
    move-result-object v2

    .line 486
    invoke-virtual {p1, v1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 487
    .line 488
    .line 489
    move-result-object p1

    .line 490
    check-cast p1, Ljava/lang/Long;

    .line 491
    .line 492
    if-eqz p1, :cond_c

    .line 493
    .line 494
    move-object v0, p1

    .line 495
    goto :goto_b

    .line 496
    :cond_c
    const/4 p1, 0x0

    .line 497
    throw p1

    .line 498
    :cond_d
    iget-object p1, p0, Lii3;->h:Ljava/lang/Object;

    .line 499
    .line 500
    check-cast p1, Ljava/util/Map;

    .line 501
    .line 502
    const-string v1, "gs"

    .line 503
    .line 504
    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 505
    .line 506
    .line 507
    move-result-object p1

    .line 508
    check-cast p1, Ln70;

    .line 509
    .line 510
    if-eqz p1, :cond_e

    .line 511
    .line 512
    invoke-interface {p1}, Ljava/util/concurrent/Future;->isDone()Z

    .line 513
    .line 514
    .line 515
    move-result v1

    .line 516
    if-eqz v1, :cond_e

    .line 517
    .line 518
    invoke-interface {p1}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 519
    .line 520
    .line 521
    move-result-object p1

    .line 522
    check-cast p1, Lqr1;

    .line 523
    .line 524
    invoke-virtual {p1}, Lqr1;->y0()J

    .line 525
    .line 526
    .line 527
    move-result-wide v1

    .line 528
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 529
    .line 530
    .line 531
    move-result-object v0
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_1 .. :try_end_1} :catch_0

    .line 532
    :catch_0
    :cond_e
    :goto_b
    monitor-enter p2

    .line 533
    :try_start_2
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 534
    .line 535
    .line 536
    move-result-wide v0

    .line 537
    invoke-virtual {p2}, Ln54;->b()V

    .line 538
    .line 539
    .line 540
    iget-object p1, p2, Ln54;->g:Lp54;

    .line 541
    .line 542
    check-cast p1, Lqr1;

    .line 543
    .line 544
    invoke-virtual {p1, v0, v1}, Lqr1;->c0(J)V

    .line 545
    .line 546
    .line 547
    monitor-exit p2

    .line 548
    return-void

    .line 549
    :catchall_1
    move-exception p1

    .line 550
    monitor-exit p2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 551
    throw p1

    .line 552
    :pswitch_2
    iget-object v0, p0, Lii3;->h:Ljava/lang/Object;

    .line 553
    .line 554
    check-cast v0, Landroid/view/View;

    .line 555
    .line 556
    iget-object v1, p0, Lii3;->g:Ljava/lang/Object;

    .line 557
    .line 558
    check-cast v1, Landroid/app/Activity;

    .line 559
    .line 560
    filled-new-array {v0, v1}, [Ljava/lang/Object;

    .line 561
    .line 562
    .line 563
    move-result-object v0

    .line 564
    const-string v1, ""

    .line 565
    .line 566
    invoke-virtual {p1, v1, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 567
    .line 568
    .line 569
    move-result-object p1

    .line 570
    check-cast p1, [Ljava/lang/Object;

    .line 571
    .line 572
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 573
    .line 574
    .line 575
    monitor-enter p2

    .line 576
    const/4 v0, 0x0

    .line 577
    :try_start_3
    aget-object v0, p1, v0

    .line 578
    .line 579
    check-cast v0, Ljava/lang/Long;

    .line 580
    .line 581
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 582
    .line 583
    .line 584
    move-result-wide v0

    .line 585
    invoke-virtual {p2}, Ln54;->b()V

    .line 586
    .line 587
    .line 588
    iget-object v2, p2, Ln54;->g:Lp54;

    .line 589
    .line 590
    check-cast v2, Lqr1;

    .line 591
    .line 592
    invoke-virtual {v2, v0, v1}, Lqr1;->d0(J)V

    .line 593
    .line 594
    .line 595
    const/4 v0, 0x1

    .line 596
    aget-object v0, p1, v0

    .line 597
    .line 598
    check-cast v0, Ljava/lang/Long;

    .line 599
    .line 600
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 601
    .line 602
    .line 603
    move-result-wide v0

    .line 604
    invoke-virtual {p2}, Ln54;->b()V

    .line 605
    .line 606
    .line 607
    iget-object v2, p2, Ln54;->g:Lp54;

    .line 608
    .line 609
    check-cast v2, Lqr1;

    .line 610
    .line 611
    invoke-virtual {v2, v0, v1}, Lqr1;->e0(J)V

    .line 612
    .line 613
    .line 614
    const/4 v0, 0x2

    .line 615
    aget-object p1, p1, v0

    .line 616
    .line 617
    check-cast p1, Ljava/lang/String;

    .line 618
    .line 619
    invoke-virtual {p2}, Ln54;->b()V

    .line 620
    .line 621
    .line 622
    iget-object v0, p2, Ln54;->g:Lp54;

    .line 623
    .line 624
    check-cast v0, Lqr1;

    .line 625
    .line 626
    invoke-virtual {v0, p1}, Lqr1;->f0(Ljava/lang/String;)V

    .line 627
    .line 628
    .line 629
    monitor-exit p2

    .line 630
    return-void

    .line 631
    :catchall_2
    move-exception p1

    .line 632
    monitor-exit p2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 633
    throw p1

    .line 634
    nop

    .line 635
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
