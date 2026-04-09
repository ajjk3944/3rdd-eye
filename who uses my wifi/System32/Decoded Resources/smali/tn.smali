.class public final Ltn;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final a:Landroid/view/ViewGroup;

.field public final b:Ljava/util/ArrayList;

.field public final c:Ljava/util/ArrayList;

.field public d:Z

.field public e:Z


# direct methods
.method public constructor <init>(Landroid/view/ViewGroup;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Ltn;->b:Ljava/util/ArrayList;

    .line 10
    .line 11
    new-instance v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Ltn;->c:Ljava/util/ArrayList;

    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    iput-boolean v0, p0, Ltn;->d:Z

    .line 20
    .line 21
    iput-boolean v0, p0, Ltn;->e:Z

    .line 22
    .line 23
    iput-object p1, p0, Ltn;->a:Landroid/view/ViewGroup;

    .line 24
    .line 25
    return-void
.end method

.method public static f(Landroid/view/ViewGroup;Lfr;)Ltn;
    .locals 3

    .line 1
    const v0, 0x7f090225

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    instance-of v2, v1, Ltn;

    .line 9
    .line 10
    if-eqz v2, :cond_0

    .line 11
    .line 12
    check-cast v1, Ltn;

    .line 13
    .line 14
    return-object v1

    .line 15
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    new-instance p1, Ltn;

    .line 19
    .line 20
    invoke-direct {p1, p0}, Ltn;-><init>(Landroid/view/ViewGroup;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, v0, p1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    return-object p1
.end method


# virtual methods
.method public final a(IILex;)V
    .locals 3

    .line 1
    iget-object v0, p0, Ltn;->b:Ljava/util/ArrayList;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    new-instance v1, Lmd;

    .line 5
    .line 6
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iget-object v2, p3, Lex;->c:Liw;

    .line 10
    .line 11
    invoke-virtual {p0, v2}, Ltn;->d(Liw;)Llx0;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    invoke-virtual {v2, p1, p2}, Llx0;->c(II)V

    .line 18
    .line 19
    .line 20
    monitor-exit v0

    .line 21
    return-void

    .line 22
    :catchall_0
    move-exception p1

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, Llx0;

    .line 25
    .line 26
    invoke-direct {v2, p1, p2, p3, v1}, Llx0;-><init>(IILex;Lmd;)V

    .line 27
    .line 28
    .line 29
    iget-object p1, p0, Ltn;->b:Ljava/util/ArrayList;

    .line 30
    .line 31
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    new-instance p1, Lkx0;

    .line 35
    .line 36
    const/4 p2, 0x0

    .line 37
    invoke-direct {p1, p0, v2, p2}, Lkx0;-><init>(Ltn;Llx0;I)V

    .line 38
    .line 39
    .line 40
    iget-object p2, v2, Llx0;->d:Ljava/util/ArrayList;

    .line 41
    .line 42
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    new-instance p1, Lkx0;

    .line 46
    .line 47
    const/4 p2, 0x1

    .line 48
    invoke-direct {p1, p0, v2, p2}, Lkx0;-><init>(Ltn;Llx0;I)V

    .line 49
    .line 50
    .line 51
    iget-object p2, v2, Llx0;->d:Ljava/util/ArrayList;

    .line 52
    .line 53
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    monitor-exit v0

    .line 57
    return-void

    .line 58
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 59
    throw p1
.end method

.method public final b(Ljava/util/ArrayList;Z)V
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p2

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    const/4 v4, 0x0

    .line 12
    const/4 v5, 0x0

    .line 13
    move v7, v4

    .line 14
    move-object v6, v5

    .line 15
    :cond_0
    :goto_0
    const/4 v8, 0x3

    .line 16
    const/4 v9, 0x2

    .line 17
    const/4 v10, 0x1

    .line 18
    if-ge v7, v3, :cond_3

    .line 19
    .line 20
    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v11

    .line 24
    add-int/lit8 v7, v7, 0x1

    .line 25
    .line 26
    check-cast v11, Llx0;

    .line 27
    .line 28
    iget-object v12, v11, Llx0;->c:Liw;

    .line 29
    .line 30
    iget-object v12, v12, Liw;->J:Landroid/view/View;

    .line 31
    .line 32
    invoke-static {v12}, Lex0;->c(Landroid/view/View;)I

    .line 33
    .line 34
    .line 35
    move-result v12

    .line 36
    iget v13, v11, Llx0;->a:I

    .line 37
    .line 38
    invoke-static {v13}, Lex0;->s(I)I

    .line 39
    .line 40
    .line 41
    move-result v13

    .line 42
    if-eqz v13, :cond_2

    .line 43
    .line 44
    if-eq v13, v10, :cond_1

    .line 45
    .line 46
    if-eq v13, v9, :cond_2

    .line 47
    .line 48
    if-eq v13, v8, :cond_2

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_1
    if-eq v12, v9, :cond_0

    .line 52
    .line 53
    move-object v6, v11

    .line 54
    goto :goto_0

    .line 55
    :cond_2
    if-ne v12, v9, :cond_0

    .line 56
    .line 57
    if-nez v5, :cond_0

    .line 58
    .line 59
    move-object v5, v11

    .line 60
    goto :goto_0

    .line 61
    :cond_3
    invoke-static {v9}, Lxw;->F(I)Z

    .line 62
    .line 63
    .line 64
    move-result v3

    .line 65
    if-eqz v3, :cond_4

    .line 66
    .line 67
    invoke-static {v5}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    invoke-static {v6}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    :cond_4
    new-instance v3, Ljava/util/ArrayList;

    .line 74
    .line 75
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 76
    .line 77
    .line 78
    new-instance v7, Ljava/util/ArrayList;

    .line 79
    .line 80
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 81
    .line 82
    .line 83
    new-instance v11, Ljava/util/ArrayList;

    .line 84
    .line 85
    invoke-direct {v11, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 89
    .line 90
    .line 91
    move-result v12

    .line 92
    sub-int/2addr v12, v10

    .line 93
    invoke-virtual {v1, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v12

    .line 97
    check-cast v12, Llx0;

    .line 98
    .line 99
    iget-object v12, v12, Llx0;->c:Liw;

    .line 100
    .line 101
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 102
    .line 103
    .line 104
    move-result v13

    .line 105
    move v14, v4

    .line 106
    :goto_1
    if-ge v14, v13, :cond_5

    .line 107
    .line 108
    invoke-virtual {v1, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v15

    .line 112
    add-int/lit8 v14, v14, 0x1

    .line 113
    .line 114
    check-cast v15, Llx0;

    .line 115
    .line 116
    iget-object v15, v15, Llx0;->c:Liw;

    .line 117
    .line 118
    iget-object v15, v15, Liw;->M:Lhw;

    .line 119
    .line 120
    iget-object v10, v12, Liw;->M:Lhw;

    .line 121
    .line 122
    iget v8, v10, Lhw;->b:I

    .line 123
    .line 124
    iput v8, v15, Lhw;->b:I

    .line 125
    .line 126
    iget v8, v10, Lhw;->c:I

    .line 127
    .line 128
    iput v8, v15, Lhw;->c:I

    .line 129
    .line 130
    iget v8, v10, Lhw;->d:I

    .line 131
    .line 132
    iput v8, v15, Lhw;->d:I

    .line 133
    .line 134
    iget v8, v10, Lhw;->e:I

    .line 135
    .line 136
    iput v8, v15, Lhw;->e:I

    .line 137
    .line 138
    const/4 v8, 0x3

    .line 139
    const/4 v10, 0x1

    .line 140
    goto :goto_1

    .line 141
    :cond_5
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 142
    .line 143
    .line 144
    move-result v8

    .line 145
    move v10, v4

    .line 146
    :goto_2
    if-ge v10, v8, :cond_e

    .line 147
    .line 148
    invoke-virtual {v1, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v12

    .line 152
    add-int/lit8 v10, v10, 0x1

    .line 153
    .line 154
    check-cast v12, Llx0;

    .line 155
    .line 156
    new-instance v13, Lmd;

    .line 157
    .line 158
    invoke-direct {v13}, Ljava/lang/Object;-><init>()V

    .line 159
    .line 160
    .line 161
    invoke-virtual {v12}, Llx0;->d()V

    .line 162
    .line 163
    .line 164
    iget-object v14, v12, Llx0;->e:Ljava/util/HashSet;

    .line 165
    .line 166
    invoke-virtual {v14, v13}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 167
    .line 168
    .line 169
    new-instance v15, Lrn;

    .line 170
    .line 171
    invoke-direct {v15, v12, v13}, Le6;-><init>(Llx0;Lmd;)V

    .line 172
    .line 173
    .line 174
    iput-boolean v4, v15, Lrn;->d:Z

    .line 175
    .line 176
    iput-boolean v2, v15, Lrn;->c:Z

    .line 177
    .line 178
    invoke-virtual {v3, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 179
    .line 180
    .line 181
    new-instance v13, Lmd;

    .line 182
    .line 183
    invoke-direct {v13}, Ljava/lang/Object;-><init>()V

    .line 184
    .line 185
    .line 186
    invoke-virtual {v12}, Llx0;->d()V

    .line 187
    .line 188
    .line 189
    invoke-virtual {v14, v13}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 190
    .line 191
    .line 192
    new-instance v14, Lsn;

    .line 193
    .line 194
    if-eqz v2, :cond_7

    .line 195
    .line 196
    if-ne v12, v5, :cond_6

    .line 197
    .line 198
    :goto_3
    const/4 v15, 0x1

    .line 199
    goto :goto_4

    .line 200
    :cond_6
    move v15, v4

    .line 201
    goto :goto_4

    .line 202
    :cond_7
    if-ne v12, v6, :cond_6

    .line 203
    .line 204
    goto :goto_3

    .line 205
    :goto_4
    invoke-direct {v14, v12, v13}, Le6;-><init>(Llx0;Lmd;)V

    .line 206
    .line 207
    .line 208
    iget v13, v12, Llx0;->a:I

    .line 209
    .line 210
    iget-object v4, v12, Llx0;->c:Liw;

    .line 211
    .line 212
    if-ne v13, v9, :cond_a

    .line 213
    .line 214
    if-eqz v2, :cond_8

    .line 215
    .line 216
    iget-object v13, v4, Liw;->M:Lhw;

    .line 217
    .line 218
    goto :goto_5

    .line 219
    :cond_8
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 220
    .line 221
    .line 222
    :goto_5
    if-eqz v2, :cond_9

    .line 223
    .line 224
    iget-object v13, v4, Liw;->M:Lhw;

    .line 225
    .line 226
    goto :goto_6

    .line 227
    :cond_9
    iget-object v13, v4, Liw;->M:Lhw;

    .line 228
    .line 229
    goto :goto_6

    .line 230
    :cond_a
    if-eqz v2, :cond_b

    .line 231
    .line 232
    iget-object v13, v4, Liw;->M:Lhw;

    .line 233
    .line 234
    goto :goto_6

    .line 235
    :cond_b
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 236
    .line 237
    .line 238
    :goto_6
    if-eqz v15, :cond_d

    .line 239
    .line 240
    if-eqz v2, :cond_c

    .line 241
    .line 242
    iget-object v4, v4, Liw;->M:Lhw;

    .line 243
    .line 244
    goto :goto_7

    .line 245
    :cond_c
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 246
    .line 247
    .line 248
    :cond_d
    :goto_7
    invoke-virtual {v7, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 249
    .line 250
    .line 251
    new-instance v4, Ljq3;

    .line 252
    .line 253
    invoke-direct {v4, v0, v11, v12}, Ljq3;-><init>(Ltn;Ljava/util/ArrayList;Llx0;)V

    .line 254
    .line 255
    .line 256
    iget-object v12, v12, Llx0;->d:Ljava/util/ArrayList;

    .line 257
    .line 258
    invoke-virtual {v12, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 259
    .line 260
    .line 261
    const/4 v4, 0x0

    .line 262
    goto :goto_2

    .line 263
    :cond_e
    new-instance v1, Ljava/util/HashMap;

    .line 264
    .line 265
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 266
    .line 267
    .line 268
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 269
    .line 270
    .line 271
    move-result v2

    .line 272
    const/4 v4, 0x0

    .line 273
    :goto_8
    if-ge v4, v2, :cond_f

    .line 274
    .line 275
    invoke-virtual {v7, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 276
    .line 277
    .line 278
    move-result-object v8

    .line 279
    add-int/lit8 v4, v4, 0x1

    .line 280
    .line 281
    check-cast v8, Lsn;

    .line 282
    .line 283
    iget-object v8, v8, Le6;->a:Ljava/lang/Object;

    .line 284
    .line 285
    check-cast v8, Llx0;

    .line 286
    .line 287
    iget-object v10, v8, Llx0;->c:Liw;

    .line 288
    .line 289
    iget-object v10, v10, Liw;->J:Landroid/view/View;

    .line 290
    .line 291
    invoke-static {v10}, Lex0;->c(Landroid/view/View;)I

    .line 292
    .line 293
    .line 294
    move-result v10

    .line 295
    iget v8, v8, Llx0;->a:I

    .line 296
    .line 297
    goto :goto_8

    .line 298
    :cond_f
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 299
    .line 300
    .line 301
    move-result v2

    .line 302
    const/4 v4, 0x0

    .line 303
    :goto_9
    if-ge v4, v2, :cond_10

    .line 304
    .line 305
    invoke-virtual {v7, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 306
    .line 307
    .line 308
    move-result-object v8

    .line 309
    add-int/lit8 v4, v4, 0x1

    .line 310
    .line 311
    check-cast v8, Lsn;

    .line 312
    .line 313
    iget-object v10, v8, Le6;->a:Ljava/lang/Object;

    .line 314
    .line 315
    check-cast v10, Llx0;

    .line 316
    .line 317
    sget-object v12, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 318
    .line 319
    invoke-virtual {v1, v10, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 320
    .line 321
    .line 322
    invoke-virtual {v8}, Le6;->e()V

    .line 323
    .line 324
    .line 325
    goto :goto_9

    .line 326
    :cond_10
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 327
    .line 328
    invoke-virtual {v1, v2}, Ljava/util/HashMap;->containsValue(Ljava/lang/Object;)Z

    .line 329
    .line 330
    .line 331
    move-result v2

    .line 332
    iget-object v4, v0, Ltn;->a:Landroid/view/ViewGroup;

    .line 333
    .line 334
    invoke-virtual {v4}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 335
    .line 336
    .line 337
    move-result-object v7

    .line 338
    new-instance v8, Ljava/util/ArrayList;

    .line 339
    .line 340
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 341
    .line 342
    .line 343
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 344
    .line 345
    .line 346
    move-result v10

    .line 347
    const/4 v12, 0x0

    .line 348
    const/4 v13, 0x0

    .line 349
    :goto_a
    if-ge v13, v10, :cond_1a

    .line 350
    .line 351
    invoke-virtual {v3, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 352
    .line 353
    .line 354
    move-result-object v14

    .line 355
    add-int/lit8 v13, v13, 0x1

    .line 356
    .line 357
    check-cast v14, Lrn;

    .line 358
    .line 359
    iget-object v15, v14, Le6;->a:Ljava/lang/Object;

    .line 360
    .line 361
    check-cast v15, Llx0;

    .line 362
    .line 363
    iget-object v9, v15, Llx0;->c:Liw;

    .line 364
    .line 365
    iget-object v9, v9, Liw;->J:Landroid/view/View;

    .line 366
    .line 367
    invoke-static {v9}, Lex0;->c(Landroid/view/View;)I

    .line 368
    .line 369
    .line 370
    move-result v9

    .line 371
    iget v15, v15, Llx0;->a:I

    .line 372
    .line 373
    if-eq v9, v15, :cond_11

    .line 374
    .line 375
    const/4 v0, 0x2

    .line 376
    if-eq v9, v0, :cond_12

    .line 377
    .line 378
    if-eq v15, v0, :cond_12

    .line 379
    .line 380
    :cond_11
    move/from16 p1, v2

    .line 381
    .line 382
    move-object/from16 v23, v3

    .line 383
    .line 384
    move-object v15, v4

    .line 385
    const/4 v3, 0x3

    .line 386
    goto/16 :goto_e

    .line 387
    .line 388
    :cond_12
    invoke-virtual {v14, v7}, Lrn;->w(Landroid/content/Context;)Lgw3;

    .line 389
    .line 390
    .line 391
    move-result-object v0

    .line 392
    if-nez v0, :cond_13

    .line 393
    .line 394
    invoke-virtual {v14}, Le6;->e()V

    .line 395
    .line 396
    .line 397
    :goto_b
    move/from16 p1, v2

    .line 398
    .line 399
    move-object/from16 v23, v3

    .line 400
    .line 401
    :goto_c
    move-object v15, v4

    .line 402
    const/4 v3, 0x3

    .line 403
    goto/16 :goto_f

    .line 404
    .line 405
    :cond_13
    iget-object v0, v0, Lgw3;->h:Ljava/lang/Object;

    .line 406
    .line 407
    check-cast v0, Landroid/animation/Animator;

    .line 408
    .line 409
    if-nez v0, :cond_14

    .line 410
    .line 411
    invoke-virtual {v8, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 412
    .line 413
    .line 414
    goto :goto_b

    .line 415
    :cond_14
    iget-object v9, v14, Le6;->a:Ljava/lang/Object;

    .line 416
    .line 417
    check-cast v9, Llx0;

    .line 418
    .line 419
    iget-object v15, v9, Llx0;->c:Liw;

    .line 420
    .line 421
    move/from16 p1, v2

    .line 422
    .line 423
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 424
    .line 425
    move-object/from16 v23, v3

    .line 426
    .line 427
    invoke-virtual {v1, v9}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 428
    .line 429
    .line 430
    move-result-object v3

    .line 431
    invoke-virtual {v2, v3}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    .line 432
    .line 433
    .line 434
    move-result v2

    .line 435
    if-eqz v2, :cond_16

    .line 436
    .line 437
    const/16 v22, 0x2

    .line 438
    .line 439
    invoke-static/range {v22 .. v22}, Lxw;->F(I)Z

    .line 440
    .line 441
    .line 442
    move-result v0

    .line 443
    if-eqz v0, :cond_15

    .line 444
    .line 445
    invoke-static {v15}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 446
    .line 447
    .line 448
    :cond_15
    invoke-virtual {v14}, Le6;->e()V

    .line 449
    .line 450
    .line 451
    goto :goto_c

    .line 452
    :cond_16
    iget v2, v9, Llx0;->a:I

    .line 453
    .line 454
    const/4 v3, 0x3

    .line 455
    if-ne v2, v3, :cond_17

    .line 456
    .line 457
    const/16 v19, 0x1

    .line 458
    .line 459
    goto :goto_d

    .line 460
    :cond_17
    const/16 v19, 0x0

    .line 461
    .line 462
    :goto_d
    if-eqz v19, :cond_18

    .line 463
    .line 464
    invoke-virtual {v11, v9}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 465
    .line 466
    .line 467
    :cond_18
    iget-object v2, v15, Liw;->J:Landroid/view/View;

    .line 468
    .line 469
    invoke-virtual {v4, v2}, Landroid/view/ViewGroup;->startViewTransition(Landroid/view/View;)V

    .line 470
    .line 471
    .line 472
    new-instance v16, Lpn;

    .line 473
    .line 474
    move-object/from16 v18, v2

    .line 475
    .line 476
    move-object/from16 v17, v4

    .line 477
    .line 478
    move-object/from16 v20, v9

    .line 479
    .line 480
    move-object/from16 v21, v14

    .line 481
    .line 482
    invoke-direct/range {v16 .. v21}, Lpn;-><init>(Landroid/view/ViewGroup;Landroid/view/View;ZLlx0;Lrn;)V

    .line 483
    .line 484
    .line 485
    move-object/from16 v4, v16

    .line 486
    .line 487
    move-object/from16 v15, v17

    .line 488
    .line 489
    invoke-virtual {v0, v4}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 490
    .line 491
    .line 492
    invoke-virtual {v0, v2}, Landroid/animation/Animator;->setTarget(Ljava/lang/Object;)V

    .line 493
    .line 494
    .line 495
    invoke-virtual {v0}, Landroid/animation/Animator;->start()V

    .line 496
    .line 497
    .line 498
    const/16 v22, 0x2

    .line 499
    .line 500
    invoke-static/range {v22 .. v22}, Lxw;->F(I)Z

    .line 501
    .line 502
    .line 503
    move-result v2

    .line 504
    if-eqz v2, :cond_19

    .line 505
    .line 506
    invoke-virtual {v9}, Llx0;->toString()Ljava/lang/String;

    .line 507
    .line 508
    .line 509
    :cond_19
    iget-object v2, v14, Le6;->b:Ljava/lang/Object;

    .line 510
    .line 511
    check-cast v2, Lmd;

    .line 512
    .line 513
    new-instance v4, Lgw3;

    .line 514
    .line 515
    const/4 v12, 0x6

    .line 516
    const/4 v14, 0x0

    .line 517
    invoke-direct {v4, v0, v9, v12, v14}, Lgw3;-><init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 518
    .line 519
    .line 520
    invoke-virtual {v2, v4}, Lmd;->a(Lld;)V

    .line 521
    .line 522
    .line 523
    move-object/from16 v0, p0

    .line 524
    .line 525
    move/from16 v2, p1

    .line 526
    .line 527
    move-object v4, v15

    .line 528
    move-object/from16 v3, v23

    .line 529
    .line 530
    const/4 v9, 0x2

    .line 531
    const/4 v12, 0x1

    .line 532
    goto/16 :goto_a

    .line 533
    .line 534
    :goto_e
    invoke-virtual {v14}, Le6;->e()V

    .line 535
    .line 536
    .line 537
    :goto_f
    move-object/from16 v0, p0

    .line 538
    .line 539
    move/from16 v2, p1

    .line 540
    .line 541
    move-object v4, v15

    .line 542
    move-object/from16 v3, v23

    .line 543
    .line 544
    const/4 v9, 0x2

    .line 545
    goto/16 :goto_a

    .line 546
    .line 547
    :cond_1a
    move/from16 p1, v2

    .line 548
    .line 549
    move-object v15, v4

    .line 550
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 551
    .line 552
    .line 553
    move-result v0

    .line 554
    const/4 v1, 0x0

    .line 555
    :goto_10
    if-ge v1, v0, :cond_21

    .line 556
    .line 557
    invoke-virtual {v8, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 558
    .line 559
    .line 560
    move-result-object v2

    .line 561
    add-int/lit8 v1, v1, 0x1

    .line 562
    .line 563
    check-cast v2, Lrn;

    .line 564
    .line 565
    iget-object v3, v2, Le6;->a:Ljava/lang/Object;

    .line 566
    .line 567
    check-cast v3, Llx0;

    .line 568
    .line 569
    iget-object v4, v3, Llx0;->c:Liw;

    .line 570
    .line 571
    if-eqz p1, :cond_1c

    .line 572
    .line 573
    const/16 v22, 0x2

    .line 574
    .line 575
    invoke-static/range {v22 .. v22}, Lxw;->F(I)Z

    .line 576
    .line 577
    .line 578
    move-result v3

    .line 579
    if-eqz v3, :cond_1b

    .line 580
    .line 581
    invoke-static {v4}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 582
    .line 583
    .line 584
    :cond_1b
    invoke-virtual {v2}, Le6;->e()V

    .line 585
    .line 586
    .line 587
    goto :goto_10

    .line 588
    :cond_1c
    const/16 v22, 0x2

    .line 589
    .line 590
    if-eqz v12, :cond_1e

    .line 591
    .line 592
    invoke-static/range {v22 .. v22}, Lxw;->F(I)Z

    .line 593
    .line 594
    .line 595
    move-result v3

    .line 596
    if-eqz v3, :cond_1d

    .line 597
    .line 598
    invoke-static {v4}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 599
    .line 600
    .line 601
    :cond_1d
    invoke-virtual {v2}, Le6;->e()V

    .line 602
    .line 603
    .line 604
    goto :goto_10

    .line 605
    :cond_1e
    iget-object v4, v4, Liw;->J:Landroid/view/View;

    .line 606
    .line 607
    invoke-virtual {v2, v7}, Lrn;->w(Landroid/content/Context;)Lgw3;

    .line 608
    .line 609
    .line 610
    move-result-object v9

    .line 611
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 612
    .line 613
    .line 614
    iget-object v9, v9, Lgw3;->g:Ljava/lang/Object;

    .line 615
    .line 616
    check-cast v9, Landroid/view/animation/Animation;

    .line 617
    .line 618
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 619
    .line 620
    .line 621
    iget v10, v3, Llx0;->a:I

    .line 622
    .line 623
    const/4 v13, 0x1

    .line 624
    if-eq v10, v13, :cond_1f

    .line 625
    .line 626
    invoke-virtual {v4, v9}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 627
    .line 628
    .line 629
    invoke-virtual {v2}, Le6;->e()V

    .line 630
    .line 631
    .line 632
    goto :goto_11

    .line 633
    :cond_1f
    invoke-virtual {v15, v4}, Landroid/view/ViewGroup;->startViewTransition(Landroid/view/View;)V

    .line 634
    .line 635
    .line 636
    new-instance v10, Llw;

    .line 637
    .line 638
    invoke-direct {v10, v9, v15, v4}, Llw;-><init>(Landroid/view/animation/Animation;Landroid/view/ViewGroup;Landroid/view/View;)V

    .line 639
    .line 640
    .line 641
    new-instance v9, Lqn;

    .line 642
    .line 643
    invoke-direct {v9, v3, v15, v4, v2}, Lqn;-><init>(Llx0;Landroid/view/ViewGroup;Landroid/view/View;Lrn;)V

    .line 644
    .line 645
    .line 646
    invoke-virtual {v10, v9}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 647
    .line 648
    .line 649
    invoke-virtual {v4, v10}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 650
    .line 651
    .line 652
    const/16 v22, 0x2

    .line 653
    .line 654
    invoke-static/range {v22 .. v22}, Lxw;->F(I)Z

    .line 655
    .line 656
    .line 657
    move-result v9

    .line 658
    if-eqz v9, :cond_20

    .line 659
    .line 660
    invoke-virtual {v3}, Llx0;->toString()Ljava/lang/String;

    .line 661
    .line 662
    .line 663
    :cond_20
    :goto_11
    iget-object v9, v2, Le6;->b:Ljava/lang/Object;

    .line 664
    .line 665
    check-cast v9, Lmd;

    .line 666
    .line 667
    new-instance v10, Lp21;

    .line 668
    .line 669
    invoke-direct {v10, v4, v15, v2, v3}, Lp21;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 670
    .line 671
    .line 672
    invoke-virtual {v9, v10}, Lmd;->a(Lld;)V

    .line 673
    .line 674
    .line 675
    goto :goto_10

    .line 676
    :cond_21
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    .line 677
    .line 678
    .line 679
    move-result v0

    .line 680
    const/4 v4, 0x0

    .line 681
    :goto_12
    if-ge v4, v0, :cond_22

    .line 682
    .line 683
    invoke-virtual {v11, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 684
    .line 685
    .line 686
    move-result-object v1

    .line 687
    add-int/lit8 v4, v4, 0x1

    .line 688
    .line 689
    check-cast v1, Llx0;

    .line 690
    .line 691
    iget-object v2, v1, Llx0;->c:Liw;

    .line 692
    .line 693
    iget-object v2, v2, Liw;->J:Landroid/view/View;

    .line 694
    .line 695
    iget v1, v1, Llx0;->a:I

    .line 696
    .line 697
    invoke-static {v2, v1}, Lex0;->a(Landroid/view/View;I)V

    .line 698
    .line 699
    .line 700
    goto :goto_12

    .line 701
    :cond_22
    invoke-virtual {v11}, Ljava/util/ArrayList;->clear()V

    .line 702
    .line 703
    .line 704
    const/16 v22, 0x2

    .line 705
    .line 706
    invoke-static/range {v22 .. v22}, Lxw;->F(I)Z

    .line 707
    .line 708
    .line 709
    move-result v0

    .line 710
    if-eqz v0, :cond_23

    .line 711
    .line 712
    invoke-static {v5}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 713
    .line 714
    .line 715
    invoke-static {v6}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 716
    .line 717
    .line 718
    :cond_23
    return-void
.end method

.method public final c()V
    .locals 7

    .line 1
    iget-boolean v0, p0, Ltn;->e:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, p0, Ltn;->a:Landroid/view/ViewGroup;

    .line 7
    .line 8
    sget-object v1, Le61;->a:Ljava/util/WeakHashMap;

    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/4 v1, 0x0

    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    invoke-virtual {p0}, Ltn;->e()V

    .line 18
    .line 19
    .line 20
    iput-boolean v1, p0, Ltn;->d:Z

    .line 21
    .line 22
    return-void

    .line 23
    :cond_1
    iget-object v0, p0, Ltn;->b:Ljava/util/ArrayList;

    .line 24
    .line 25
    monitor-enter v0

    .line 26
    :try_start_0
    iget-object v2, p0, Ltn;->b:Ljava/util/ArrayList;

    .line 27
    .line 28
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-nez v2, :cond_6

    .line 33
    .line 34
    new-instance v2, Ljava/util/ArrayList;

    .line 35
    .line 36
    iget-object v3, p0, Ltn;->c:Ljava/util/ArrayList;

    .line 37
    .line 38
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 39
    .line 40
    .line 41
    iget-object v3, p0, Ltn;->c:Ljava/util/ArrayList;

    .line 42
    .line 43
    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    move v4, v1

    .line 51
    :cond_2
    :goto_0
    const/4 v5, 0x2

    .line 52
    if-ge v4, v3, :cond_4

    .line 53
    .line 54
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v6

    .line 58
    add-int/lit8 v4, v4, 0x1

    .line 59
    .line 60
    check-cast v6, Llx0;

    .line 61
    .line 62
    invoke-static {v5}, Lxw;->F(I)Z

    .line 63
    .line 64
    .line 65
    move-result v5

    .line 66
    if-eqz v5, :cond_3

    .line 67
    .line 68
    invoke-static {v6}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    goto :goto_1

    .line 72
    :catchall_0
    move-exception v1

    .line 73
    goto :goto_3

    .line 74
    :cond_3
    :goto_1
    invoke-virtual {v6}, Llx0;->a()V

    .line 75
    .line 76
    .line 77
    iget-boolean v5, v6, Llx0;->g:Z

    .line 78
    .line 79
    if-nez v5, :cond_2

    .line 80
    .line 81
    iget-object v5, p0, Ltn;->c:Ljava/util/ArrayList;

    .line 82
    .line 83
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_4
    invoke-virtual {p0}, Ltn;->g()V

    .line 88
    .line 89
    .line 90
    new-instance v2, Ljava/util/ArrayList;

    .line 91
    .line 92
    iget-object v3, p0, Ltn;->b:Ljava/util/ArrayList;

    .line 93
    .line 94
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 95
    .line 96
    .line 97
    iget-object v3, p0, Ltn;->b:Ljava/util/ArrayList;

    .line 98
    .line 99
    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    .line 100
    .line 101
    .line 102
    iget-object v3, p0, Ltn;->c:Ljava/util/ArrayList;

    .line 103
    .line 104
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 105
    .line 106
    .line 107
    invoke-static {v5}, Lxw;->F(I)Z

    .line 108
    .line 109
    .line 110
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 111
    .line 112
    .line 113
    move-result v3

    .line 114
    move v4, v1

    .line 115
    :goto_2
    if-ge v4, v3, :cond_5

    .line 116
    .line 117
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v6

    .line 121
    add-int/lit8 v4, v4, 0x1

    .line 122
    .line 123
    check-cast v6, Llx0;

    .line 124
    .line 125
    invoke-virtual {v6}, Llx0;->d()V

    .line 126
    .line 127
    .line 128
    goto :goto_2

    .line 129
    :cond_5
    iget-boolean v3, p0, Ltn;->d:Z

    .line 130
    .line 131
    invoke-virtual {p0, v2, v3}, Ltn;->b(Ljava/util/ArrayList;Z)V

    .line 132
    .line 133
    .line 134
    iput-boolean v1, p0, Ltn;->d:Z

    .line 135
    .line 136
    invoke-static {v5}, Lxw;->F(I)Z

    .line 137
    .line 138
    .line 139
    :cond_6
    monitor-exit v0

    .line 140
    return-void

    .line 141
    :goto_3
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 142
    throw v1
.end method

.method public final d(Liw;)Llx0;
    .locals 5

    .line 1
    iget-object v0, p0, Ltn;->b:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    :cond_0
    if-ge v2, v1, :cond_1

    .line 9
    .line 10
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    add-int/lit8 v2, v2, 0x1

    .line 15
    .line 16
    check-cast v3, Llx0;

    .line 17
    .line 18
    iget-object v4, v3, Llx0;->c:Liw;

    .line 19
    .line 20
    invoke-virtual {v4, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v4

    .line 24
    if-eqz v4, :cond_0

    .line 25
    .line 26
    iget-boolean v4, v3, Llx0;->f:Z

    .line 27
    .line 28
    if-nez v4, :cond_0

    .line 29
    .line 30
    return-object v3

    .line 31
    :cond_1
    const/4 p1, 0x0

    .line 32
    return-object p1
.end method

.method public final e()V
    .locals 10

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-static {v0}, Lxw;->F(I)Z

    .line 3
    .line 4
    .line 5
    iget-object v1, p0, Ltn;->a:Landroid/view/ViewGroup;

    .line 6
    .line 7
    sget-object v2, Le61;->a:Ljava/util/WeakHashMap;

    .line 8
    .line 9
    invoke-virtual {v1}, Landroid/view/View;->isAttachedToWindow()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    iget-object v2, p0, Ltn;->b:Ljava/util/ArrayList;

    .line 14
    .line 15
    monitor-enter v2

    .line 16
    :try_start_0
    invoke-virtual {p0}, Ltn;->g()V

    .line 17
    .line 18
    .line 19
    iget-object v3, p0, Ltn;->b:Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    const/4 v5, 0x0

    .line 26
    move v6, v5

    .line 27
    :goto_0
    if-ge v6, v4, :cond_0

    .line 28
    .line 29
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v7

    .line 33
    add-int/lit8 v6, v6, 0x1

    .line 34
    .line 35
    check-cast v7, Llx0;

    .line 36
    .line 37
    invoke-virtual {v7}, Llx0;->d()V

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :catchall_0
    move-exception v0

    .line 42
    goto/16 :goto_5

    .line 43
    .line 44
    :cond_0
    new-instance v3, Ljava/util/ArrayList;

    .line 45
    .line 46
    iget-object v4, p0, Ltn;->c:Ljava/util/ArrayList;

    .line 47
    .line 48
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 52
    .line 53
    .line 54
    move-result v4

    .line 55
    move v6, v5

    .line 56
    :goto_1
    if-ge v6, v4, :cond_3

    .line 57
    .line 58
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v7

    .line 62
    add-int/lit8 v6, v6, 0x1

    .line 63
    .line 64
    check-cast v7, Llx0;

    .line 65
    .line 66
    invoke-static {v0}, Lxw;->F(I)Z

    .line 67
    .line 68
    .line 69
    move-result v8

    .line 70
    if-eqz v8, :cond_2

    .line 71
    .line 72
    if-eqz v1, :cond_1

    .line 73
    .line 74
    goto :goto_2

    .line 75
    :cond_1
    new-instance v8, Ljava/lang/StringBuilder;

    .line 76
    .line 77
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 78
    .line 79
    .line 80
    const-string v9, "Container "

    .line 81
    .line 82
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    iget-object v9, p0, Ltn;->a:Landroid/view/ViewGroup;

    .line 86
    .line 87
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    const-string v9, " is not attached to window. "

    .line 91
    .line 92
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    :goto_2
    invoke-static {v7}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    :cond_2
    invoke-virtual {v7}, Llx0;->a()V

    .line 99
    .line 100
    .line 101
    goto :goto_1

    .line 102
    :cond_3
    new-instance v3, Ljava/util/ArrayList;

    .line 103
    .line 104
    iget-object v4, p0, Ltn;->b:Ljava/util/ArrayList;

    .line 105
    .line 106
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 110
    .line 111
    .line 112
    move-result v4

    .line 113
    :goto_3
    if-ge v5, v4, :cond_6

    .line 114
    .line 115
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v6

    .line 119
    add-int/lit8 v5, v5, 0x1

    .line 120
    .line 121
    check-cast v6, Llx0;

    .line 122
    .line 123
    invoke-static {v0}, Lxw;->F(I)Z

    .line 124
    .line 125
    .line 126
    move-result v7

    .line 127
    if-eqz v7, :cond_5

    .line 128
    .line 129
    if-eqz v1, :cond_4

    .line 130
    .line 131
    goto :goto_4

    .line 132
    :cond_4
    new-instance v7, Ljava/lang/StringBuilder;

    .line 133
    .line 134
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 135
    .line 136
    .line 137
    const-string v8, "Container "

    .line 138
    .line 139
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 140
    .line 141
    .line 142
    iget-object v8, p0, Ltn;->a:Landroid/view/ViewGroup;

    .line 143
    .line 144
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 145
    .line 146
    .line 147
    const-string v8, " is not attached to window. "

    .line 148
    .line 149
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 150
    .line 151
    .line 152
    :goto_4
    invoke-static {v6}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    :cond_5
    invoke-virtual {v6}, Llx0;->a()V

    .line 156
    .line 157
    .line 158
    goto :goto_3

    .line 159
    :cond_6
    monitor-exit v2

    .line 160
    return-void

    .line 161
    :goto_5
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 162
    throw v0
.end method

.method public final g()V
    .locals 6

    .line 1
    iget-object v0, p0, Ltn;->b:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    :cond_0
    :goto_0
    if-ge v2, v1, :cond_1

    .line 9
    .line 10
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    add-int/lit8 v2, v2, 0x1

    .line 15
    .line 16
    check-cast v3, Llx0;

    .line 17
    .line 18
    iget v4, v3, Llx0;->b:I

    .line 19
    .line 20
    const/4 v5, 0x2

    .line 21
    if-ne v4, v5, :cond_0

    .line 22
    .line 23
    iget-object v4, v3, Llx0;->c:Liw;

    .line 24
    .line 25
    invoke-virtual {v4}, Liw;->H()Landroid/view/View;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    invoke-virtual {v4}, Landroid/view/View;->getVisibility()I

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    invoke-static {v4}, Lex0;->b(I)I

    .line 34
    .line 35
    .line 36
    move-result v4

    .line 37
    const/4 v5, 0x1

    .line 38
    invoke-virtual {v3, v4, v5}, Llx0;->c(II)V

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    return-void
.end method
