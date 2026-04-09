.class public final synthetic Lxs1;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lxs1;->a:I

    .line 2
    .line 3
    iput-object p2, p0, Lxs1;->b:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method private final a()Ljava/lang/Object;
    .locals 7

    .line 1
    iget-object v0, p0, Lxs1;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lg33;

    .line 4
    .line 5
    iget-object v0, v0, Lg33;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Lxv2;

    .line 8
    .line 9
    new-instance v1, Lw43;

    .line 10
    .line 11
    monitor-enter v0

    .line 12
    :try_start_0
    new-instance v2, Ljava/util/HashMap;

    .line 13
    .line 14
    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 15
    .line 16
    .line 17
    sget-object v3, Lmz1;->l8:Liz1;

    .line 18
    .line 19
    sget-object v4, Ltw1;->e:Ltw1;

    .line 20
    .line 21
    iget-object v4, v4, Ltw1;->c:Lkz1;

    .line 22
    .line 23
    invoke-virtual {v4, v3}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    check-cast v3, Ljava/lang/Boolean;

    .line 28
    .line 29
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    if-nez v3, :cond_0

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_0
    invoke-virtual {v0}, Lxv2;->b()V

    .line 37
    .line 38
    .line 39
    iget-object v3, v0, Lxv2;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 40
    .line 41
    invoke-virtual {v3}, Ljava/util/concurrent/ConcurrentHashMap;->entrySet()Ljava/util/Set;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 50
    .line 51
    .line 52
    move-result v4

    .line 53
    if-eqz v4, :cond_1

    .line 54
    .line 55
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v4

    .line 59
    check-cast v4, Ljava/util/Map$Entry;

    .line 60
    .line 61
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v5

    .line 65
    check-cast v5, Lwv2;

    .line 66
    .line 67
    new-instance v6, Ljava/util/ArrayDeque;

    .line 68
    .line 69
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v4

    .line 73
    check-cast v4, Ljava/util/Collection;

    .line 74
    .line 75
    invoke-direct {v6, v4}, Ljava/util/ArrayDeque;-><init>(Ljava/util/Collection;)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v2, v5, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 79
    .line 80
    .line 81
    goto :goto_0

    .line 82
    :catchall_0
    move-exception v1

    .line 83
    goto :goto_2

    .line 84
    :cond_1
    :goto_1
    monitor-exit v0

    .line 85
    const/4 v0, 0x0

    .line 86
    invoke-direct {v1, v2, v0}, Lw43;-><init>(Ljava/util/HashMap;I)V

    .line 87
    .line 88
    .line 89
    return-object v1

    .line 90
    :goto_2
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 91
    throw v1
.end method

.method private final b()Ljava/lang/Object;
    .locals 15

    .line 1
    iget-object v0, p0, Lxs1;->b:Ljava/lang/Object;

    .line 2
    .line 3
    move-object v1, v0

    .line 4
    check-cast v1, Le33;

    .line 5
    .line 6
    :try_start_0
    iget-object v0, v1, Le33;->c:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Landroid/content/Context;

    .line 9
    .line 10
    iget-object v2, v1, Le33;->b:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v2, Ll83;

    .line 13
    .line 14
    invoke-virtual {v2}, Ll83;->a()Z

    .line 15
    .line 16
    .line 17
    move-result v8

    .line 18
    new-instance v2, Lue;

    .line 19
    .line 20
    const/16 v3, 0x8

    .line 21
    .line 22
    invoke-direct {v2, v3}, Lue;-><init>(I)V

    .line 23
    .line 24
    .line 25
    new-instance v3, Lue;

    .line 26
    .line 27
    const/16 v4, 0x8

    .line 28
    .line 29
    invoke-direct {v3, v4}, Lue;-><init>(I)V

    .line 30
    .line 31
    .line 32
    const/4 v4, 0x1

    .line 33
    if-eqz v8, :cond_0

    .line 34
    .line 35
    sget-object v5, Lmz1;->v3:Liz1;

    .line 36
    .line 37
    sget-object v6, Ltw1;->e:Ltw1;

    .line 38
    .line 39
    iget-object v6, v6, Ltw1;->c:Lkz1;

    .line 40
    .line 41
    invoke-virtual {v6, v5}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v5

    .line 45
    check-cast v5, Ljava/lang/Boolean;

    .line 46
    .line 47
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 48
    .line 49
    .line 50
    move-result v5

    .line 51
    if-nez v5, :cond_0

    .line 52
    .line 53
    new-instance v0, Lb53;

    .line 54
    .line 55
    invoke-direct {v0, v4}, Lb53;-><init>(Z)V

    .line 56
    .line 57
    .line 58
    return-object v0

    .line 59
    :catch_0
    move-exception v0

    .line 60
    goto/16 :goto_3

    .line 61
    .line 62
    :cond_0
    if-nez v8, :cond_1

    .line 63
    .line 64
    sget-object v5, Lmz1;->r3:Liz1;

    .line 65
    .line 66
    sget-object v6, Ltw1;->e:Ltw1;

    .line 67
    .line 68
    iget-object v6, v6, Ltw1;->c:Lkz1;

    .line 69
    .line 70
    invoke-virtual {v6, v5}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v5

    .line 74
    check-cast v5, Ljava/lang/Boolean;

    .line 75
    .line 76
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 77
    .line 78
    .line 79
    move-result v5

    .line 80
    if-nez v5, :cond_2

    .line 81
    .line 82
    :cond_1
    if-eqz v8, :cond_3

    .line 83
    .line 84
    sget-object v5, Lmz1;->t3:Liz1;

    .line 85
    .line 86
    sget-object v6, Ltw1;->e:Ltw1;

    .line 87
    .line 88
    iget-object v6, v6, Ltw1;->c:Lkz1;

    .line 89
    .line 90
    invoke-virtual {v6, v5}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v5

    .line 94
    check-cast v5, Ljava/lang/Boolean;

    .line 95
    .line 96
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 97
    .line 98
    .line 99
    move-result v5

    .line 100
    if-eqz v5, :cond_3

    .line 101
    .line 102
    :cond_2
    invoke-static {v0}, Lmf3;->f(Landroid/content/Context;)Lmf3;

    .line 103
    .line 104
    .line 105
    move-result-object v9

    .line 106
    sget-object v2, Lmz1;->C3:Liz1;

    .line 107
    .line 108
    sget-object v5, Ltw1;->e:Ltw1;

    .line 109
    .line 110
    iget-object v5, v5, Ltw1;->c:Lkz1;

    .line 111
    .line 112
    invoke-virtual {v5, v2}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v2

    .line 116
    check-cast v2, Ljava/lang/Long;

    .line 117
    .line 118
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 119
    .line 120
    .line 121
    move-result-wide v12

    .line 122
    sget-object v2, Lhg4;->C:Lhg4;

    .line 123
    .line 124
    iget-object v2, v2, Lhg4;->h:Lgd2;

    .line 125
    .line 126
    invoke-virtual {v2}, Lgd2;->g()Lra4;

    .line 127
    .line 128
    .line 129
    move-result-object v2

    .line 130
    invoke-virtual {v2}, Lra4;->s()Z

    .line 131
    .line 132
    .line 133
    move-result v14

    .line 134
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 135
    .line 136
    .line 137
    const-class v2, Lmf3;

    .line 138
    .line 139
    monitor-enter v2
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 140
    const/4 v10, 0x0

    .line 141
    const/4 v11, 0x0

    .line 142
    :try_start_1
    invoke-virtual/range {v9 .. v14}, Llf3;->a(Ljava/lang/String;Ljava/lang/String;JZ)Lue;

    .line 143
    .line 144
    .line 145
    move-result-object v5

    .line 146
    monitor-exit v2

    .line 147
    move-object v2, v5

    .line 148
    goto :goto_0

    .line 149
    :catchall_0
    move-exception v0

    .line 150
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 151
    :try_start_2
    throw v0

    .line 152
    :cond_3
    :goto_0
    sget-object v5, Lmz1;->z3:Liz1;

    .line 153
    .line 154
    sget-object v6, Ltw1;->e:Ltw1;

    .line 155
    .line 156
    iget-object v7, v6, Ltw1;->c:Lkz1;

    .line 157
    .line 158
    invoke-virtual {v7, v5}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object v5

    .line 162
    check-cast v5, Ljava/lang/Boolean;

    .line 163
    .line 164
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 165
    .line 166
    .line 167
    move-result v5

    .line 168
    if-eqz v5, :cond_4

    .line 169
    .line 170
    iget-object v5, v1, Le33;->e:Ljava/lang/Object;

    .line 171
    .line 172
    check-cast v5, Le51;

    .line 173
    .line 174
    iget v5, v5, Le51;->h:I

    .line 175
    .line 176
    sget-object v7, Lmz1;->y3:Liz1;

    .line 177
    .line 178
    iget-object v9, v6, Ltw1;->c:Lkz1;

    .line 179
    .line 180
    invoke-virtual {v9, v7}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v7

    .line 184
    check-cast v7, Ljava/lang/Integer;

    .line 185
    .line 186
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 187
    .line 188
    .line 189
    move-result v7

    .line 190
    if-ge v5, v7, :cond_4

    .line 191
    .line 192
    invoke-static {v0}, Lnf3;->f(Landroid/content/Context;)Lnf3;

    .line 193
    .line 194
    .line 195
    move-result-object v5

    .line 196
    invoke-virtual {v5}, Lnf3;->h()V

    .line 197
    .line 198
    .line 199
    :cond_4
    if-nez v8, :cond_5

    .line 200
    .line 201
    sget-object v5, Lmz1;->s3:Liz1;

    .line 202
    .line 203
    iget-object v7, v6, Ltw1;->c:Lkz1;

    .line 204
    .line 205
    invoke-virtual {v7, v5}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object v5

    .line 209
    check-cast v5, Ljava/lang/Boolean;

    .line 210
    .line 211
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 212
    .line 213
    .line 214
    move-result v5

    .line 215
    if-nez v5, :cond_6

    .line 216
    .line 217
    :cond_5
    if-eqz v8, :cond_8

    .line 218
    .line 219
    sget-object v5, Lmz1;->u3:Liz1;

    .line 220
    .line 221
    iget-object v7, v6, Ltw1;->c:Lkz1;

    .line 222
    .line 223
    invoke-virtual {v7, v5}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-result-object v5

    .line 227
    check-cast v5, Ljava/lang/Boolean;

    .line 228
    .line 229
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 230
    .line 231
    .line 232
    move-result v5

    .line 233
    if-eqz v5, :cond_8

    .line 234
    .line 235
    :cond_6
    invoke-static {v0}, Lnf3;->f(Landroid/content/Context;)Lnf3;

    .line 236
    .line 237
    .line 238
    move-result-object v5

    .line 239
    invoke-static {v0}, Lkf3;->U(Landroid/content/Context;)Lkf3;

    .line 240
    .line 241
    .line 242
    move-result-object v0

    .line 243
    iget-object v7, v1, Le33;->e:Ljava/lang/Object;

    .line 244
    .line 245
    check-cast v7, Le51;

    .line 246
    .line 247
    iget v7, v7, Le51;->h:I

    .line 248
    .line 249
    sget-object v9, Lmz1;->y3:Liz1;

    .line 250
    .line 251
    iget-object v10, v6, Ltw1;->c:Lkz1;

    .line 252
    .line 253
    invoke-virtual {v10, v9}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    move-result-object v9

    .line 257
    check-cast v9, Ljava/lang/Integer;

    .line 258
    .line 259
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    .line 260
    .line 261
    .line 262
    move-result v9

    .line 263
    if-lt v7, v9, :cond_7

    .line 264
    .line 265
    sget-object v3, Lmz1;->D3:Liz1;

    .line 266
    .line 267
    iget-object v6, v6, Ltw1;->c:Lkz1;

    .line 268
    .line 269
    invoke-virtual {v6, v3}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 270
    .line 271
    .line 272
    move-result-object v3

    .line 273
    check-cast v3, Ljava/lang/Long;

    .line 274
    .line 275
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 276
    .line 277
    .line 278
    move-result-wide v6

    .line 279
    sget-object v3, Lhg4;->C:Lhg4;

    .line 280
    .line 281
    iget-object v3, v3, Lhg4;->h:Lgd2;

    .line 282
    .line 283
    invoke-virtual {v3}, Lgd2;->g()Lra4;

    .line 284
    .line 285
    .line 286
    move-result-object v3

    .line 287
    invoke-virtual {v3}, Lra4;->s()Z

    .line 288
    .line 289
    .line 290
    move-result v3

    .line 291
    invoke-virtual {v5, v6, v7, v3}, Lnf3;->g(JZ)Lue;

    .line 292
    .line 293
    .line 294
    move-result-object v3

    .line 295
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 296
    .line 297
    .line 298
    const-class v5, Lkf3;

    .line 299
    .line 300
    monitor-enter v5
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    .line 301
    :try_start_3
    iget-object v6, v0, Lkf3;->g:Ljava/lang/Object;

    .line 302
    .line 303
    check-cast v6, Lwt2;

    .line 304
    .line 305
    const-string v7, "paidv2_publisher_option"

    .line 306
    .line 307
    iget-object v6, v6, Lwt2;->h:Ljava/lang/Object;

    .line 308
    .line 309
    check-cast v6, Landroid/content/SharedPreferences;

    .line 310
    .line 311
    invoke-interface {v6, v7, v4}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 312
    .line 313
    .line 314
    move-result v6

    .line 315
    monitor-exit v5

    .line 316
    goto :goto_1

    .line 317
    :catchall_1
    move-exception v0

    .line 318
    monitor-exit v5
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 319
    :try_start_4
    throw v0

    .line 320
    :cond_7
    move v6, v4

    .line 321
    :goto_1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 322
    .line 323
    .line 324
    const-class v5, Lkf3;

    .line 325
    .line 326
    monitor-enter v5
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    .line 327
    :try_start_5
    iget-object v0, v0, Lkf3;->g:Ljava/lang/Object;

    .line 328
    .line 329
    check-cast v0, Lwt2;

    .line 330
    .line 331
    const-string v7, "paidv2_user_option"

    .line 332
    .line 333
    iget-object v0, v0, Lwt2;->h:Ljava/lang/Object;

    .line 334
    .line 335
    check-cast v0, Landroid/content/SharedPreferences;

    .line 336
    .line 337
    invoke-interface {v0, v7, v4}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 338
    .line 339
    .line 340
    move-result v4

    .line 341
    monitor-exit v5

    .line 342
    move-object v5, v3

    .line 343
    move v7, v4

    .line 344
    goto :goto_2

    .line 345
    :catchall_2
    move-exception v0

    .line 346
    monitor-exit v5
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 347
    :try_start_6
    throw v0

    .line 348
    :cond_8
    move-object v5, v3

    .line 349
    move v6, v4

    .line 350
    move v7, v6

    .line 351
    :goto_2
    new-instance v3, Lb53;

    .line 352
    .line 353
    move-object v4, v2

    .line 354
    invoke-direct/range {v3 .. v8}, Lb53;-><init>(Lue;Lue;ZZZ)V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_0

    .line 355
    .line 356
    .line 357
    return-object v3

    .line 358
    :goto_3
    const-string v2, "PerAppIdSignal"

    .line 359
    .line 360
    sget-object v3, Lhg4;->C:Lhg4;

    .line 361
    .line 362
    iget-object v3, v3, Lhg4;->h:Lgd2;

    .line 363
    .line 364
    invoke-virtual {v3, v2, v0}, Lgd2;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 365
    .line 366
    .line 367
    iget-object v0, v1, Le33;->b:Ljava/lang/Object;

    .line 368
    .line 369
    check-cast v0, Ll83;

    .line 370
    .line 371
    new-instance v1, Lb53;

    .line 372
    .line 373
    invoke-virtual {v0}, Ll83;->a()Z

    .line 374
    .line 375
    .line 376
    move-result v0

    .line 377
    invoke-direct {v1, v0}, Lb53;-><init>(Z)V

    .line 378
    .line 379
    .line 380
    return-object v1
.end method

.method private final c()Ljava/lang/Object;
    .locals 10

    .line 1
    iget-object v0, p0, Lxs1;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lk33;

    .line 4
    .line 5
    iget-object v1, v0, Lk33;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Loc2;

    .line 8
    .line 9
    iget-object v0, v0, Lk33;->d:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, Landroid/content/Context;

    .line 12
    .line 13
    invoke-virtual {v1, v0}, Loc2;->a(Landroid/content/Context;)Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-nez v2, :cond_0

    .line 18
    .line 19
    new-instance v3, Lj53;

    .line 20
    .line 21
    const/4 v7, 0x0

    .line 22
    const/4 v8, 0x0

    .line 23
    const/4 v4, 0x0

    .line 24
    const/4 v5, 0x0

    .line 25
    const/4 v6, 0x0

    .line 26
    invoke-direct/range {v3 .. v8}, Lj53;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V

    .line 27
    .line 28
    .line 29
    return-object v3

    .line 30
    :cond_0
    invoke-virtual {v1, v0}, Loc2;->b(Landroid/content/Context;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    const-string v3, ""

    .line 35
    .line 36
    if-nez v2, :cond_1

    .line 37
    .line 38
    move-object v5, v3

    .line 39
    goto :goto_0

    .line 40
    :cond_1
    move-object v5, v2

    .line 41
    :goto_0
    invoke-virtual {v1, v0}, Loc2;->c(Landroid/content/Context;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    if-nez v2, :cond_2

    .line 46
    .line 47
    move-object v6, v3

    .line 48
    goto :goto_1

    .line 49
    :cond_2
    move-object v6, v2

    .line 50
    :goto_1
    invoke-virtual {v1, v0}, Loc2;->d(Landroid/content/Context;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    if-nez v2, :cond_3

    .line 55
    .line 56
    move-object v7, v3

    .line 57
    goto :goto_2

    .line 58
    :cond_3
    move-object v7, v2

    .line 59
    :goto_2
    const/4 v2, 0x1

    .line 60
    invoke-virtual {v1, v0}, Loc2;->a(Landroid/content/Context;)Z

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    const/4 v1, 0x0

    .line 65
    if-eq v2, v0, :cond_4

    .line 66
    .line 67
    move-object v0, v1

    .line 68
    goto :goto_3

    .line 69
    :cond_4
    const-string v0, "fa"

    .line 70
    .line 71
    :goto_3
    const-string v2, "TIME_OUT"

    .line 72
    .line 73
    invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v2

    .line 77
    if-eqz v2, :cond_5

    .line 78
    .line 79
    sget-object v1, Lmz1;->t0:Liz1;

    .line 80
    .line 81
    sget-object v2, Ltw1;->e:Ltw1;

    .line 82
    .line 83
    iget-object v2, v2, Ltw1;->c:Lkz1;

    .line 84
    .line 85
    invoke-virtual {v2, v1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    check-cast v1, Ljava/lang/Long;

    .line 90
    .line 91
    :cond_5
    move-object v9, v1

    .line 92
    if-nez v0, :cond_6

    .line 93
    .line 94
    move-object v8, v3

    .line 95
    goto :goto_4

    .line 96
    :cond_6
    move-object v8, v0

    .line 97
    :goto_4
    new-instance v4, Lj53;

    .line 98
    .line 99
    invoke-direct/range {v4 .. v9}, Lj53;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V

    .line 100
    .line 101
    .line 102
    return-object v4
.end method

.method private final d()Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, Lxs1;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lo33;

    .line 4
    .line 5
    iget-object v0, v0, Lo33;->c:Landroid/content/Context;

    .line 6
    .line 7
    new-instance v1, Lt53;

    .line 8
    .line 9
    const-string v2, "init_without_write"

    .line 10
    .line 11
    invoke-static {v0, v2}, Li41;->S(Landroid/content/Context;Ljava/lang/String;)I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    const-string v3, "crash_without_write"

    .line 16
    .line 17
    invoke-static {v0, v3}, Li41;->S(Landroid/content/Context;Ljava/lang/String;)I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    invoke-direct {v1, v2, v0}, Lt53;-><init>(II)V

    .line 22
    .line 23
    .line 24
    return-object v1
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 34

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget v0, v1, Lxs1;->a:I

    .line 4
    .line 5
    const/4 v2, 0x4

    .line 6
    const/4 v3, 0x3

    .line 7
    const/4 v4, -0x1

    .line 8
    const/4 v5, 0x2

    .line 9
    const/4 v7, 0x1

    .line 10
    const/4 v8, 0x0

    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    iget-object v0, v1, Lxs1;->b:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, Lk33;

    .line 17
    .line 18
    const-string v2, "com.google.unity.ads.UNITY_VERSION"

    .line 19
    .line 20
    const-string v3, "."

    .line 21
    .line 22
    iget-object v4, v0, Lk33;->c:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v4, Landroid/content/Context;

    .line 25
    .line 26
    invoke-virtual {v4}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 27
    .line 28
    .line 29
    move-result-object v5

    .line 30
    const-string v9, "geo:0,0?q=donuts"

    .line 31
    .line 32
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 33
    .line 34
    .line 35
    move-result-object v10

    .line 36
    new-instance v11, Landroid/content/Intent;

    .line 37
    .line 38
    const-string v12, "android.intent.action.VIEW"

    .line 39
    .line 40
    invoke-static {v9}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 41
    .line 42
    .line 43
    move-result-object v9

    .line 44
    invoke-direct {v11, v12, v9}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 45
    .line 46
    .line 47
    const/high16 v9, 0x10000

    .line 48
    .line 49
    invoke-virtual {v5, v11, v9}, Landroid/content/pm/PackageManager;->resolveActivity(Landroid/content/Intent;I)Landroid/content/pm/ResolveInfo;

    .line 50
    .line 51
    .line 52
    move-result-object v11

    .line 53
    const-string v13, "http://www.google.com"

    .line 54
    .line 55
    new-instance v14, Landroid/content/Intent;

    .line 56
    .line 57
    invoke-static {v13}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 58
    .line 59
    .line 60
    move-result-object v13

    .line 61
    invoke-direct {v14, v12, v13}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v5, v14, v9}, Landroid/content/pm/PackageManager;->resolveActivity(Landroid/content/Intent;I)Landroid/content/pm/ResolveInfo;

    .line 65
    .line 66
    .line 67
    move-result-object v13

    .line 68
    invoke-virtual {v10}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v17

    .line 72
    sget-object v14, Lhg4;->C:Lhg4;

    .line 73
    .line 74
    iget-object v14, v14, Lhg4;->c:Llf4;

    .line 75
    .line 76
    sget-object v14, Lsv1;->f:Lsv1;

    .line 77
    .line 78
    iget-object v14, v14, Lsv1;->a:Lj63;

    .line 79
    .line 80
    invoke-static {}, Lj63;->n()Z

    .line 81
    .line 82
    .line 83
    move-result v18

    .line 84
    invoke-static {v4}, Li30;->F(Landroid/content/Context;)Z

    .line 85
    .line 86
    .line 87
    move-result v19

    .line 88
    invoke-static {v4}, Li30;->d0(Landroid/content/Context;)Z

    .line 89
    .line 90
    .line 91
    move-result v20

    .line 92
    invoke-virtual {v10}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v21

    .line 96
    new-instance v10, Ljava/util/ArrayList;

    .line 97
    .line 98
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 99
    .line 100
    .line 101
    invoke-static {}, Landroid/os/LocaleList;->getDefault()Landroid/os/LocaleList;

    .line 102
    .line 103
    .line 104
    move-result-object v14

    .line 105
    move v15, v8

    .line 106
    :goto_0
    invoke-virtual {v14}, Landroid/os/LocaleList;->size()I

    .line 107
    .line 108
    .line 109
    move-result v6

    .line 110
    if-ge v15, v6, :cond_0

    .line 111
    .line 112
    invoke-virtual {v14, v15}, Landroid/os/LocaleList;->get(I)Ljava/util/Locale;

    .line 113
    .line 114
    .line 115
    move-result-object v6

    .line 116
    invoke-virtual {v6}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v6

    .line 120
    invoke-virtual {v10, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    add-int/lit8 v15, v15, 0x1

    .line 124
    .line 125
    goto :goto_0

    .line 126
    :cond_0
    const-string v6, "market://details?id=com.google.android.gms.ads"

    .line 127
    .line 128
    new-instance v14, Landroid/content/Intent;

    .line 129
    .line 130
    invoke-static {v6}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 131
    .line 132
    .line 133
    move-result-object v6

    .line 134
    invoke-direct {v14, v12, v6}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {v5, v14, v9}, Landroid/content/pm/PackageManager;->resolveActivity(Landroid/content/Intent;I)Landroid/content/pm/ResolveInfo;

    .line 138
    .line 139
    .line 140
    move-result-object v6

    .line 141
    if-nez v6, :cond_2

    .line 142
    .line 143
    :catch_0
    :cond_1
    :goto_1
    move/from16 v22, v7

    .line 144
    .line 145
    :catch_1
    const/16 v23, 0x0

    .line 146
    .line 147
    goto :goto_2

    .line 148
    :cond_2
    iget-object v6, v6, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    .line 149
    .line 150
    if-nez v6, :cond_3

    .line 151
    .line 152
    goto :goto_1

    .line 153
    :cond_3
    :try_start_0
    invoke-static {v4}, Lza1;->a(Landroid/content/Context;)Lzj0;

    .line 154
    .line 155
    .line 156
    move-result-object v14

    .line 157
    iget-object v15, v6, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    .line 158
    .line 159
    invoke-virtual {v14, v15, v8}, Lzj0;->b(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 160
    .line 161
    .line 162
    move-result-object v14

    .line 163
    if-eqz v14, :cond_1

    .line 164
    .line 165
    iget v14, v14, Landroid/content/pm/PackageInfo;->versionCode:I

    .line 166
    .line 167
    iget-object v6, v6, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    .line 168
    .line 169
    invoke-static {v14}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object v15

    .line 173
    invoke-virtual {v15}, Ljava/lang/String;->length()I

    .line 174
    .line 175
    .line 176
    move-result v15

    .line 177
    add-int/2addr v15, v7

    .line 178
    invoke-static {v6}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object v22

    .line 182
    invoke-virtual/range {v22 .. v22}, Ljava/lang/String;->length()I

    .line 183
    .line 184
    .line 185
    move-result v22
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 186
    add-int v15, v15, v22

    .line 187
    .line 188
    move/from16 v22, v7

    .line 189
    .line 190
    :try_start_1
    new-instance v7, Ljava/lang/StringBuilder;

    .line 191
    .line 192
    invoke-direct {v7, v15}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 193
    .line 194
    .line 195
    invoke-virtual {v7, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 196
    .line 197
    .line 198
    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 199
    .line 200
    .line 201
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 202
    .line 203
    .line 204
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 205
    .line 206
    .line 207
    move-result-object v6
    :try_end_1
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_1 .. :try_end_1} :catch_1

    .line 208
    move-object/from16 v23, v6

    .line 209
    .line 210
    :goto_2
    const/16 v6, 0x80

    .line 211
    .line 212
    :try_start_2
    invoke-static {v4}, Lza1;->a(Landroid/content/Context;)Lzj0;

    .line 213
    .line 214
    .line 215
    move-result-object v7

    .line 216
    const-string v14, "com.android.vending"

    .line 217
    .line 218
    invoke-virtual {v7, v14, v6}, Lzj0;->b(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 219
    .line 220
    .line 221
    move-result-object v7

    .line 222
    if-eqz v7, :cond_4

    .line 223
    .line 224
    iget v14, v7, Landroid/content/pm/PackageInfo;->versionCode:I

    .line 225
    .line 226
    iget-object v7, v7, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    .line 227
    .line 228
    invoke-static {v14}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 229
    .line 230
    .line 231
    move-result-object v15

    .line 232
    invoke-virtual {v15}, Ljava/lang/String;->length()I

    .line 233
    .line 234
    .line 235
    move-result v15

    .line 236
    add-int/lit8 v15, v15, 0x1

    .line 237
    .line 238
    invoke-static {v7}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 239
    .line 240
    .line 241
    move-result-object v24

    .line 242
    invoke-virtual/range {v24 .. v24}, Ljava/lang/String;->length()I

    .line 243
    .line 244
    .line 245
    move-result v24

    .line 246
    add-int v15, v15, v24

    .line 247
    .line 248
    new-instance v6, Ljava/lang/StringBuilder;

    .line 249
    .line 250
    invoke-direct {v6, v15}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 251
    .line 252
    .line 253
    invoke-virtual {v6, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 254
    .line 255
    .line 256
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 257
    .line 258
    .line 259
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 260
    .line 261
    .line 262
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 263
    .line 264
    .line 265
    move-result-object v3
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 266
    move-object/from16 v24, v3

    .line 267
    .line 268
    const/16 v3, 0x80

    .line 269
    .line 270
    goto :goto_4

    .line 271
    :cond_4
    move v3, v6

    .line 272
    :goto_3
    const/16 v24, 0x0

    .line 273
    .line 274
    goto :goto_4

    .line 275
    :catch_2
    const/16 v3, 0x80

    .line 276
    .line 277
    goto :goto_3

    .line 278
    :goto_4
    sget-object v6, Landroid/os/Build;->FINGERPRINT:Ljava/lang/String;

    .line 279
    .line 280
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 281
    .line 282
    .line 283
    move-result-object v6

    .line 284
    invoke-virtual {v6}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    .line 285
    .line 286
    .line 287
    move-result-object v6

    .line 288
    sget-object v7, Lmz1;->ge:Liz1;

    .line 289
    .line 290
    sget-object v14, Ltw1;->e:Ltw1;

    .line 291
    .line 292
    iget-object v15, v14, Ltw1;->c:Lkz1;

    .line 293
    .line 294
    invoke-virtual {v15, v7}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 295
    .line 296
    .line 297
    move-result-object v7

    .line 298
    check-cast v7, Ljava/lang/Boolean;

    .line 299
    .line 300
    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    .line 301
    .line 302
    .line 303
    move-result v7

    .line 304
    if-eqz v7, :cond_5

    .line 305
    .line 306
    invoke-static {v4}, Llf4;->I(Landroid/content/Context;)Luo2;

    .line 307
    .line 308
    .line 309
    move-result-object v6

    .line 310
    iget-object v7, v6, Luo2;->f:Ljava/lang/String;

    .line 311
    .line 312
    iget-object v6, v6, Luo2;->g:Ljava/lang/String;

    .line 313
    .line 314
    move-object/from16 v32, v6

    .line 315
    .line 316
    move-object/from16 v31, v7

    .line 317
    .line 318
    goto :goto_5

    .line 319
    :cond_5
    sget-object v7, Lmz1;->fe:Liz1;

    .line 320
    .line 321
    iget-object v14, v14, Ltw1;->c:Lkz1;

    .line 322
    .line 323
    invoke-virtual {v14, v7}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 324
    .line 325
    .line 326
    move-result-object v7

    .line 327
    check-cast v7, Ljava/lang/Boolean;

    .line 328
    .line 329
    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    .line 330
    .line 331
    .line 332
    move-result v7

    .line 333
    if-eqz v7, :cond_6

    .line 334
    .line 335
    invoke-static {v4}, Llf4;->I(Landroid/content/Context;)Luo2;

    .line 336
    .line 337
    .line 338
    move-result-object v6

    .line 339
    iget-object v6, v6, Luo2;->f:Ljava/lang/String;

    .line 340
    .line 341
    :cond_6
    move-object/from16 v31, v6

    .line 342
    .line 343
    const/16 v32, 0x0

    .line 344
    .line 345
    :goto_5
    new-instance v6, Landroid/content/Intent;

    .line 346
    .line 347
    const-string v7, "http://www.example.com"

    .line 348
    .line 349
    invoke-static {v7}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 350
    .line 351
    .line 352
    move-result-object v7

    .line 353
    invoke-direct {v6, v12, v7}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 354
    .line 355
    .line 356
    invoke-virtual {v5, v6, v8}, Landroid/content/pm/PackageManager;->resolveActivity(Landroid/content/Intent;I)Landroid/content/pm/ResolveInfo;

    .line 357
    .line 358
    .line 359
    move-result-object v7

    .line 360
    invoke-virtual {v5, v6, v9}, Landroid/content/pm/PackageManager;->queryIntentActivities(Landroid/content/Intent;I)Ljava/util/List;

    .line 361
    .line 362
    .line 363
    move-result-object v5

    .line 364
    if-eqz v5, :cond_8

    .line 365
    .line 366
    if-eqz v7, :cond_8

    .line 367
    .line 368
    move v6, v8

    .line 369
    :goto_6
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 370
    .line 371
    .line 372
    move-result v9

    .line 373
    if-ge v6, v9, :cond_8

    .line 374
    .line 375
    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 376
    .line 377
    .line 378
    move-result-object v9

    .line 379
    check-cast v9, Landroid/content/pm/ResolveInfo;

    .line 380
    .line 381
    iget-object v12, v7, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    .line 382
    .line 383
    iget-object v12, v12, Landroid/content/pm/ActivityInfo;->name:Ljava/lang/String;

    .line 384
    .line 385
    iget-object v9, v9, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    .line 386
    .line 387
    iget-object v9, v9, Landroid/content/pm/ActivityInfo;->name:Ljava/lang/String;

    .line 388
    .line 389
    invoke-virtual {v12, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 390
    .line 391
    .line 392
    move-result v9

    .line 393
    if-eqz v9, :cond_7

    .line 394
    .line 395
    iget-object v5, v7, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    .line 396
    .line 397
    iget-object v5, v5, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    .line 398
    .line 399
    invoke-static {v4}, Lob1;->s(Landroid/content/Context;)Ljava/lang/String;

    .line 400
    .line 401
    .line 402
    move-result-object v6

    .line 403
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 404
    .line 405
    .line 406
    move-result v5

    .line 407
    move/from16 v25, v5

    .line 408
    .line 409
    goto :goto_7

    .line 410
    :cond_7
    add-int/lit8 v6, v6, 0x1

    .line 411
    .line 412
    goto :goto_6

    .line 413
    :cond_8
    move/from16 v25, v8

    .line 414
    .line 415
    :goto_7
    sget-object v5, Lhg4;->C:Lhg4;

    .line 416
    .line 417
    iget-object v5, v5, Lhg4;->c:Llf4;

    .line 418
    .line 419
    new-instance v5, Landroid/os/StatFs;

    .line 420
    .line 421
    invoke-static {}, Landroid/os/Environment;->getDataDirectory()Ljava/io/File;

    .line 422
    .line 423
    .line 424
    move-result-object v6

    .line 425
    invoke-virtual {v6}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 426
    .line 427
    .line 428
    move-result-object v6

    .line 429
    invoke-direct {v5, v6}, Landroid/os/StatFs;-><init>(Ljava/lang/String;)V

    .line 430
    .line 431
    .line 432
    invoke-virtual {v5}, Landroid/os/StatFs;->getAvailableBytes()J

    .line 433
    .line 434
    .line 435
    move-result-wide v5

    .line 436
    const-wide/16 v14, 0x400

    .line 437
    .line 438
    div-long v26, v5, v14

    .line 439
    .line 440
    sget-object v5, Lmz1;->fc:Liz1;

    .line 441
    .line 442
    sget-object v6, Ltw1;->e:Ltw1;

    .line 443
    .line 444
    iget-object v7, v6, Ltw1;->c:Lkz1;

    .line 445
    .line 446
    invoke-virtual {v7, v5}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 447
    .line 448
    .line 449
    move-result-object v5

    .line 450
    check-cast v5, Ljava/lang/Boolean;

    .line 451
    .line 452
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 453
    .line 454
    .line 455
    move-result v5

    .line 456
    if-eqz v5, :cond_9

    .line 457
    .line 458
    invoke-static {v4}, Llf4;->d(Landroid/content/Context;)Z

    .line 459
    .line 460
    .line 461
    move-result v5

    .line 462
    if-eqz v5, :cond_9

    .line 463
    .line 464
    move/from16 v28, v22

    .line 465
    .line 466
    goto :goto_8

    .line 467
    :cond_9
    move/from16 v28, v8

    .line 468
    .line 469
    :goto_8
    sget-object v5, Lmz1;->jc:Liz1;

    .line 470
    .line 471
    iget-object v6, v6, Ltw1;->c:Lkz1;

    .line 472
    .line 473
    invoke-virtual {v6, v5}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 474
    .line 475
    .line 476
    move-result-object v5

    .line 477
    check-cast v5, Ljava/lang/Boolean;

    .line 478
    .line 479
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 480
    .line 481
    .line 482
    move-result v5

    .line 483
    if-eqz v5, :cond_b

    .line 484
    .line 485
    :try_start_3
    invoke-static {v4}, Lza1;->a(Landroid/content/Context;)Lzj0;

    .line 486
    .line 487
    .line 488
    move-result-object v5

    .line 489
    invoke-virtual {v4}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 490
    .line 491
    .line 492
    move-result-object v4

    .line 493
    invoke-virtual {v5, v4, v3}, Lzj0;->a(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    .line 494
    .line 495
    .line 496
    move-result-object v3

    .line 497
    iget-object v3, v3, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    .line 498
    .line 499
    if-eqz v3, :cond_a

    .line 500
    .line 501
    invoke-virtual {v3, v2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 502
    .line 503
    .line 504
    move-result v4

    .line 505
    if-eqz v4, :cond_a

    .line 506
    .line 507
    invoke-virtual {v3, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 508
    .line 509
    .line 510
    move-result-object v6
    :try_end_3
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_3 .. :try_end_3} :catch_3

    .line 511
    :goto_9
    move-object/from16 v29, v6

    .line 512
    .line 513
    goto :goto_a

    .line 514
    :catch_3
    :cond_a
    const/16 v29, 0x0

    .line 515
    .line 516
    goto :goto_a

    .line 517
    :cond_b
    const-string v6, ""

    .line 518
    .line 519
    goto :goto_9

    .line 520
    :goto_a
    if-eqz v13, :cond_c

    .line 521
    .line 522
    move/from16 v16, v22

    .line 523
    .line 524
    goto :goto_b

    .line 525
    :cond_c
    move/from16 v16, v8

    .line 526
    .line 527
    :goto_b
    if-eqz v11, :cond_d

    .line 528
    .line 529
    move/from16 v15, v22

    .line 530
    .line 531
    goto :goto_c

    .line 532
    :cond_d
    move v15, v8

    .line 533
    :goto_c
    iget-object v0, v0, Lk33;->d:Ljava/lang/Object;

    .line 534
    .line 535
    check-cast v0, Lgx2;

    .line 536
    .line 537
    new-instance v14, Lu53;

    .line 538
    .line 539
    sget-object v2, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 540
    .line 541
    sget v30, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 542
    .line 543
    invoke-virtual {v0}, Lgx2;->a()Ljava/lang/String;

    .line 544
    .line 545
    .line 546
    move-result-object v33

    .line 547
    move-object/from16 v22, v10

    .line 548
    .line 549
    invoke-direct/range {v14 .. v33}, Lu53;-><init>(ZZLjava/lang/String;ZZZLjava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;ZJZLjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 550
    .line 551
    .line 552
    return-object v14

    .line 553
    :pswitch_0
    invoke-direct {v1}, Lxs1;->d()Ljava/lang/Object;

    .line 554
    .line 555
    .line 556
    move-result-object v0

    .line 557
    return-object v0

    .line 558
    :pswitch_1
    move/from16 v22, v7

    .line 559
    .line 560
    iget-object v0, v1, Lxs1;->b:Ljava/lang/Object;

    .line 561
    .line 562
    check-cast v0, Lo33;

    .line 563
    .line 564
    sget-object v2, Lmz1;->y6:Liz1;

    .line 565
    .line 566
    sget-object v3, Ltw1;->e:Ltw1;

    .line 567
    .line 568
    iget-object v3, v3, Ltw1;->c:Lkz1;

    .line 569
    .line 570
    invoke-virtual {v3, v2}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 571
    .line 572
    .line 573
    move-result-object v2

    .line 574
    check-cast v2, Ljava/lang/String;

    .line 575
    .line 576
    iget-object v0, v0, Lo33;->c:Landroid/content/Context;

    .line 577
    .line 578
    invoke-static {v0, v2}, Lyc0;->u(Landroid/content/Context;Ljava/lang/String;)Landroid/os/Bundle;

    .line 579
    .line 580
    .line 581
    move-result-object v0

    .line 582
    new-instance v2, La53;

    .line 583
    .line 584
    move/from16 v3, v22

    .line 585
    .line 586
    invoke-direct {v2, v0, v3}, La53;-><init>(Ljava/lang/Cloneable;I)V

    .line 587
    .line 588
    .line 589
    return-object v2

    .line 590
    :pswitch_2
    iget-object v0, v1, Lxs1;->b:Ljava/lang/Object;

    .line 591
    .line 592
    check-cast v0, Le33;

    .line 593
    .line 594
    new-instance v9, Lk53;

    .line 595
    .line 596
    iget-object v2, v0, Le33;->c:Ljava/lang/Object;

    .line 597
    .line 598
    check-cast v2, Landroid/content/Context;

    .line 599
    .line 600
    invoke-static {v2}, Lza1;->a(Landroid/content/Context;)Lzj0;

    .line 601
    .line 602
    .line 603
    move-result-object v3

    .line 604
    invoke-virtual {v3}, Lzj0;->d()Z

    .line 605
    .line 606
    .line 607
    move-result v10

    .line 608
    sget-object v3, Lhg4;->C:Lhg4;

    .line 609
    .line 610
    iget-object v3, v3, Lhg4;->c:Llf4;

    .line 611
    .line 612
    invoke-static {v2}, Llf4;->f(Landroid/content/Context;)Z

    .line 613
    .line 614
    .line 615
    move-result v11

    .line 616
    iget-object v3, v0, Le33;->b:Ljava/lang/Object;

    .line 617
    .line 618
    check-cast v3, Le51;

    .line 619
    .line 620
    iget-object v12, v3, Le51;->f:Ljava/lang/String;

    .line 621
    .line 622
    invoke-static {}, Landroid/os/Process;->myUid()I

    .line 623
    .line 624
    .line 625
    move-result v3

    .line 626
    if-eqz v3, :cond_f

    .line 627
    .line 628
    const/16 v4, 0x3e8

    .line 629
    .line 630
    if-ne v3, v4, :cond_e

    .line 631
    .line 632
    goto :goto_d

    .line 633
    :cond_e
    move v13, v8

    .line 634
    goto :goto_e

    .line 635
    :cond_f
    :goto_d
    const/4 v13, 0x1

    .line 636
    :goto_e
    invoke-virtual {v2}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 637
    .line 638
    .line 639
    move-result-object v3

    .line 640
    if-nez v3, :cond_10

    .line 641
    .line 642
    move v14, v8

    .line 643
    goto :goto_f

    .line 644
    :cond_10
    iget v3, v3, Landroid/content/pm/ApplicationInfo;->targetSdkVersion:I

    .line 645
    .line 646
    move v14, v3

    .line 647
    :goto_f
    invoke-static {v2, v8}, Lar;->d(Landroid/content/Context;Z)I

    .line 648
    .line 649
    .line 650
    move-result v15

    .line 651
    invoke-static {v2}, Lar;->a(Landroid/content/Context;)I

    .line 652
    .line 653
    .line 654
    move-result v16

    .line 655
    iget-object v0, v0, Le33;->e:Ljava/lang/Object;

    .line 656
    .line 657
    move-object/from16 v17, v0

    .line 658
    .line 659
    check-cast v17, Ljava/lang/String;

    .line 660
    .line 661
    invoke-direct/range {v9 .. v17}, Lk53;-><init>(ZZLjava/lang/String;ZIIILjava/lang/String;)V

    .line 662
    .line 663
    .line 664
    return-object v9

    .line 665
    :pswitch_3
    invoke-direct {v1}, Lxs1;->c()Ljava/lang/Object;

    .line 666
    .line 667
    .line 668
    move-result-object v0

    .line 669
    return-object v0

    .line 670
    :pswitch_4
    invoke-direct {v1}, Lxs1;->b()Ljava/lang/Object;

    .line 671
    .line 672
    .line 673
    move-result-object v0

    .line 674
    return-object v0

    .line 675
    :pswitch_5
    invoke-direct {v1}, Lxs1;->a()Ljava/lang/Object;

    .line 676
    .line 677
    .line 678
    move-result-object v0

    .line 679
    return-object v0

    .line 680
    :pswitch_6
    iget-object v0, v1, Lxs1;->b:Ljava/lang/Object;

    .line 681
    .line 682
    check-cast v0, Le33;

    .line 683
    .line 684
    new-instance v2, Lv43;

    .line 685
    .line 686
    iget-object v3, v0, Le33;->b:Ljava/lang/Object;

    .line 687
    .line 688
    check-cast v3, Ll83;

    .line 689
    .line 690
    iget-object v4, v0, Le33;->c:Ljava/lang/Object;

    .line 691
    .line 692
    check-cast v4, Landroid/content/pm/PackageInfo;

    .line 693
    .line 694
    iget-object v0, v0, Le33;->e:Ljava/lang/Object;

    .line 695
    .line 696
    check-cast v0, Lra4;

    .line 697
    .line 698
    invoke-direct {v2, v3, v4, v0}, Lv43;-><init>(Ll83;Landroid/content/pm/PackageInfo;Lra4;)V

    .line 699
    .line 700
    .line 701
    return-object v2

    .line 702
    :pswitch_7
    iget-object v0, v1, Lxs1;->b:Ljava/lang/Object;

    .line 703
    .line 704
    check-cast v0, Lg33;

    .line 705
    .line 706
    iget-object v0, v0, Lg33;->c:Ljava/lang/Object;

    .line 707
    .line 708
    move-object v2, v0

    .line 709
    check-cast v2, Lzw2;

    .line 710
    .line 711
    new-instance v9, Lt43;

    .line 712
    .line 713
    monitor-enter v2

    .line 714
    :try_start_4
    sget-object v0, Lmz1;->I9:Liz1;

    .line 715
    .line 716
    sget-object v3, Ltw1;->e:Ltw1;

    .line 717
    .line 718
    iget-object v4, v3, Ltw1;->c:Lkz1;

    .line 719
    .line 720
    invoke-virtual {v4, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 721
    .line 722
    .line 723
    move-result-object v0

    .line 724
    check-cast v0, Ljava/lang/Boolean;

    .line 725
    .line 726
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 727
    .line 728
    .line 729
    move-result v0

    .line 730
    if-eqz v0, :cond_13

    .line 731
    .line 732
    invoke-virtual {v2}, Lzw2;->f()Z

    .line 733
    .line 734
    .line 735
    move-result v0

    .line 736
    if-nez v0, :cond_11

    .line 737
    .line 738
    goto :goto_11

    .line 739
    :cond_11
    iget-wide v4, v2, Lzw2;->q:J

    .line 740
    .line 741
    sget-object v0, Lhg4;->C:Lhg4;

    .line 742
    .line 743
    iget-object v0, v0, Lhg4;->k:Lym;

    .line 744
    .line 745
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 746
    .line 747
    .line 748
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 749
    .line 750
    .line 751
    move-result-wide v6

    .line 752
    const-wide/16 v10, 0x3e8

    .line 753
    .line 754
    div-long/2addr v6, v10

    .line 755
    cmp-long v0, v4, v6

    .line 756
    .line 757
    if-gez v0, :cond_12

    .line 758
    .line 759
    const-string v0, "{}"

    .line 760
    .line 761
    iput-object v0, v2, Lzw2;->o:Ljava/lang/String;

    .line 762
    .line 763
    const-wide v4, 0x7fffffffffffffffL

    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    iput-wide v4, v2, Lzw2;->q:J

    .line 769
    .line 770
    const-string v0, ""
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 771
    .line 772
    monitor-exit v2

    .line 773
    :goto_10
    move-object v10, v0

    .line 774
    goto :goto_12

    .line 775
    :catchall_0
    move-exception v0

    .line 776
    goto :goto_15

    .line 777
    :cond_12
    :try_start_5
    iget-object v0, v2, Lzw2;->o:Ljava/lang/String;

    .line 778
    .line 779
    const-string v4, "{}"

    .line 780
    .line 781
    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 782
    .line 783
    .line 784
    move-result v0

    .line 785
    if-nez v0, :cond_13

    .line 786
    .line 787
    iget-object v0, v2, Lzw2;->o:Ljava/lang/String;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 788
    .line 789
    monitor-exit v2

    .line 790
    goto :goto_10

    .line 791
    :cond_13
    :goto_11
    :try_start_6
    const-string v0, ""
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 792
    .line 793
    monitor-exit v2

    .line 794
    goto :goto_10

    .line 795
    :goto_12
    monitor-enter v2

    .line 796
    :try_start_7
    iget-boolean v11, v2, Lzw2;->s:Z
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 797
    .line 798
    monitor-exit v2

    .line 799
    sget-object v0, Lhg4;->C:Lhg4;

    .line 800
    .line 801
    iget-object v0, v0, Lhg4;->o:Lus1;

    .line 802
    .line 803
    invoke-virtual {v0}, Lus1;->g()Z

    .line 804
    .line 805
    .line 806
    move-result v12

    .line 807
    iget-object v0, v2, Lzw2;->p:Lorg/json/JSONObject;

    .line 808
    .line 809
    if-eqz v0, :cond_14

    .line 810
    .line 811
    const/4 v13, 0x1

    .line 812
    goto :goto_13

    .line 813
    :cond_14
    move v13, v8

    .line 814
    :goto_13
    iget-wide v4, v2, Lzw2;->w:J

    .line 815
    .line 816
    sget-object v0, Lmz1;->da:Liz1;

    .line 817
    .line 818
    iget-object v2, v3, Ltw1;->c:Lkz1;

    .line 819
    .line 820
    invoke-virtual {v2, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 821
    .line 822
    .line 823
    move-result-object v0

    .line 824
    check-cast v0, Ljava/lang/Long;

    .line 825
    .line 826
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 827
    .line 828
    .line 829
    move-result-wide v2

    .line 830
    cmp-long v0, v4, v2

    .line 831
    .line 832
    if-gez v0, :cond_15

    .line 833
    .line 834
    const/4 v14, 0x1

    .line 835
    goto :goto_14

    .line 836
    :cond_15
    move v14, v8

    .line 837
    :goto_14
    invoke-direct/range {v9 .. v14}, Lt43;-><init>(Ljava/lang/String;ZZZZ)V

    .line 838
    .line 839
    .line 840
    return-object v9

    .line 841
    :catchall_1
    move-exception v0

    .line 842
    :try_start_8
    monitor-exit v2
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    .line 843
    throw v0

    .line 844
    :goto_15
    :try_start_9
    monitor-exit v2
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    .line 845
    throw v0

    .line 846
    :pswitch_8
    iget-object v0, v1, Lxs1;->b:Ljava/lang/Object;

    .line 847
    .line 848
    check-cast v0, Le33;

    .line 849
    .line 850
    iget-object v2, v0, Le33;->b:Ljava/lang/Object;

    .line 851
    .line 852
    check-cast v2, Ljava/util/Set;

    .line 853
    .line 854
    iget-object v3, v0, Le33;->e:Ljava/lang/Object;

    .line 855
    .line 856
    check-cast v3, Landroid/view/ViewGroup;

    .line 857
    .line 858
    sget-object v4, Lmz1;->n6:Liz1;

    .line 859
    .line 860
    sget-object v5, Ltw1;->e:Ltw1;

    .line 861
    .line 862
    iget-object v6, v5, Ltw1;->c:Lkz1;

    .line 863
    .line 864
    invoke-virtual {v6, v4}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 865
    .line 866
    .line 867
    move-result-object v4

    .line 868
    check-cast v4, Ljava/lang/Boolean;

    .line 869
    .line 870
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 871
    .line 872
    .line 873
    move-result v4

    .line 874
    if-eqz v4, :cond_16

    .line 875
    .line 876
    if-eqz v3, :cond_16

    .line 877
    .line 878
    const-string v4, "banner"

    .line 879
    .line 880
    invoke-interface {v2, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 881
    .line 882
    .line 883
    move-result v4

    .line 884
    if-eqz v4, :cond_16

    .line 885
    .line 886
    new-instance v0, Lr43;

    .line 887
    .line 888
    invoke-virtual {v3}, Landroid/view/View;->isHardwareAccelerated()Z

    .line 889
    .line 890
    .line 891
    move-result v2

    .line 892
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 893
    .line 894
    .line 895
    move-result-object v2

    .line 896
    invoke-direct {v0, v2, v8}, Lr43;-><init>(Ljava/lang/Boolean;I)V

    .line 897
    .line 898
    .line 899
    goto :goto_18

    .line 900
    :cond_16
    sget-object v3, Lmz1;->o6:Liz1;

    .line 901
    .line 902
    iget-object v4, v5, Ltw1;->c:Lkz1;

    .line 903
    .line 904
    invoke-virtual {v4, v3}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 905
    .line 906
    .line 907
    move-result-object v3

    .line 908
    check-cast v3, Ljava/lang/Boolean;

    .line 909
    .line 910
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 911
    .line 912
    .line 913
    move-result v3

    .line 914
    if-eqz v3, :cond_19

    .line 915
    .line 916
    const-string v3, "native"

    .line 917
    .line 918
    invoke-interface {v2, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 919
    .line 920
    .line 921
    move-result v2

    .line 922
    if-eqz v2, :cond_19

    .line 923
    .line 924
    iget-object v0, v0, Le33;->c:Ljava/lang/Object;

    .line 925
    .line 926
    check-cast v0, Landroid/content/Context;

    .line 927
    .line 928
    instance-of v2, v0, Landroid/app/Activity;

    .line 929
    .line 930
    if-eqz v2, :cond_19

    .line 931
    .line 932
    new-instance v2, Lr43;

    .line 933
    .line 934
    check-cast v0, Landroid/app/Activity;

    .line 935
    .line 936
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 937
    .line 938
    .line 939
    move-result-object v3

    .line 940
    if-eqz v3, :cond_17

    .line 941
    .line 942
    invoke-virtual {v3}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    .line 943
    .line 944
    .line 945
    move-result-object v3

    .line 946
    iget v3, v3, Landroid/view/WindowManager$LayoutParams;->flags:I

    .line 947
    .line 948
    const/high16 v4, 0x1000000

    .line 949
    .line 950
    and-int/2addr v3, v4

    .line 951
    if-eqz v3, :cond_17

    .line 952
    .line 953
    sget-object v6, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 954
    .line 955
    goto :goto_17

    .line 956
    :cond_17
    :try_start_a
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 957
    .line 958
    .line 959
    move-result-object v3

    .line 960
    invoke-virtual {v0}, Landroid/app/Activity;->getComponentName()Landroid/content/ComponentName;

    .line 961
    .line 962
    .line 963
    move-result-object v0

    .line 964
    invoke-virtual {v3, v0, v8}, Landroid/content/pm/PackageManager;->getActivityInfo(Landroid/content/ComponentName;I)Landroid/content/pm/ActivityInfo;

    .line 965
    .line 966
    .line 967
    move-result-object v0

    .line 968
    iget v0, v0, Landroid/content/pm/ActivityInfo;->flags:I

    .line 969
    .line 970
    and-int/lit16 v0, v0, 0x200

    .line 971
    .line 972
    if-eqz v0, :cond_18

    .line 973
    .line 974
    const/4 v7, 0x1

    .line 975
    goto :goto_16

    .line 976
    :cond_18
    move v7, v8

    .line 977
    :goto_16
    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 978
    .line 979
    .line 980
    move-result-object v6
    :try_end_a
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_a .. :try_end_a} :catch_4

    .line 981
    goto :goto_17

    .line 982
    :catch_4
    const/4 v6, 0x0

    .line 983
    :goto_17
    invoke-direct {v2, v6, v8}, Lr43;-><init>(Ljava/lang/Boolean;I)V

    .line 984
    .line 985
    .line 986
    move-object v0, v2

    .line 987
    goto :goto_18

    .line 988
    :cond_19
    new-instance v0, Lr43;

    .line 989
    .line 990
    const/4 v2, 0x0

    .line 991
    invoke-direct {v0, v2, v8}, Lr43;-><init>(Ljava/lang/Boolean;I)V

    .line 992
    .line 993
    .line 994
    :goto_18
    return-object v0

    .line 995
    :pswitch_9
    iget-object v0, v1, Lxs1;->b:Ljava/lang/Object;

    .line 996
    .line 997
    check-cast v0, Lg33;

    .line 998
    .line 999
    new-instance v2, Lq43;

    .line 1000
    .line 1001
    iget-object v0, v0, Lg33;->c:Ljava/lang/Object;

    .line 1002
    .line 1003
    check-cast v0, Ll83;

    .line 1004
    .line 1005
    iget-object v0, v0, Ll83;->d:Lpc4;

    .line 1006
    .line 1007
    const-string v3, "requester_type_2"

    .line 1008
    .line 1009
    invoke-static {v0}, La30;->w(Lpc4;)Ljava/lang/String;

    .line 1010
    .line 1011
    .line 1012
    move-result-object v0

    .line 1013
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1014
    .line 1015
    .line 1016
    move-result v0

    .line 1017
    invoke-direct {v2, v0}, Lq43;-><init>(Z)V

    .line 1018
    .line 1019
    .line 1020
    return-object v2

    .line 1021
    :pswitch_a
    iget-object v0, v1, Lxs1;->b:Ljava/lang/Object;

    .line 1022
    .line 1023
    check-cast v0, Lo33;

    .line 1024
    .line 1025
    new-instance v2, Lw33;

    .line 1026
    .line 1027
    sget-object v3, Lhg4;->C:Lhg4;

    .line 1028
    .line 1029
    iget-object v3, v3, Lhg4;->c:Llf4;

    .line 1030
    .line 1031
    iget-object v0, v0, Lo33;->c:Landroid/content/Context;

    .line 1032
    .line 1033
    const-string v3, "display"

    .line 1034
    .line 1035
    invoke-virtual {v0, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 1036
    .line 1037
    .line 1038
    move-result-object v0

    .line 1039
    instance-of v3, v0, Landroid/hardware/display/DisplayManager;

    .line 1040
    .line 1041
    if-eqz v3, :cond_1a

    .line 1042
    .line 1043
    check-cast v0, Landroid/hardware/display/DisplayManager;

    .line 1044
    .line 1045
    invoke-virtual {v0}, Landroid/hardware/display/DisplayManager;->getDisplays()[Landroid/view/Display;

    .line 1046
    .line 1047
    .line 1048
    move-result-object v0

    .line 1049
    array-length v0, v0

    .line 1050
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1051
    .line 1052
    .line 1053
    move-result-object v6

    .line 1054
    :goto_19
    const/4 v3, 0x1

    .line 1055
    goto :goto_1a

    .line 1056
    :cond_1a
    const/4 v6, 0x0

    .line 1057
    goto :goto_19

    .line 1058
    :goto_1a
    invoke-direct {v2, v6, v3}, Lw33;-><init>(Ljava/lang/Integer;I)V

    .line 1059
    .line 1060
    .line 1061
    return-object v2

    .line 1062
    :pswitch_b
    iget-object v0, v1, Lxs1;->b:Ljava/lang/Object;

    .line 1063
    .line 1064
    check-cast v0, Lo33;

    .line 1065
    .line 1066
    const-string v3, "mobileads_consent"

    .line 1067
    .line 1068
    const-string v4, "IABConsent_CMPPresent"

    .line 1069
    .line 1070
    iget-object v0, v0, Lo33;->c:Landroid/content/Context;

    .line 1071
    .line 1072
    const-string v5, ""

    .line 1073
    .line 1074
    new-instance v6, Ln43;

    .line 1075
    .line 1076
    sget-object v7, Lhg4;->C:Lhg4;

    .line 1077
    .line 1078
    iget-object v7, v7, Lhg4;->c:Llf4;

    .line 1079
    .line 1080
    sget-object v7, Lmz1;->v6:Liz1;

    .line 1081
    .line 1082
    sget-object v9, Ltw1;->e:Ltw1;

    .line 1083
    .line 1084
    iget-object v9, v9, Ltw1;->c:Lkz1;

    .line 1085
    .line 1086
    invoke-virtual {v9, v7}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 1087
    .line 1088
    .line 1089
    move-result-object v7

    .line 1090
    check-cast v7, Ljava/lang/Boolean;

    .line 1091
    .line 1092
    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1093
    .line 1094
    .line 1095
    move-result v7

    .line 1096
    if-nez v7, :cond_1b

    .line 1097
    .line 1098
    move-object v7, v5

    .line 1099
    goto :goto_1b

    .line 1100
    :cond_1b
    invoke-virtual {v0, v3, v8}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 1101
    .line 1102
    .line 1103
    move-result-object v7

    .line 1104
    const-string v10, "consent_string"

    .line 1105
    .line 1106
    invoke-interface {v7, v10, v5}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1107
    .line 1108
    .line 1109
    move-result-object v7

    .line 1110
    :goto_1b
    sget-object v10, Lmz1;->x6:Liz1;

    .line 1111
    .line 1112
    invoke-virtual {v9, v10}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 1113
    .line 1114
    .line 1115
    move-result-object v10

    .line 1116
    check-cast v10, Ljava/lang/Boolean;

    .line 1117
    .line 1118
    invoke-virtual {v10}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1119
    .line 1120
    .line 1121
    move-result v10

    .line 1122
    if-nez v10, :cond_1c

    .line 1123
    .line 1124
    goto :goto_1c

    .line 1125
    :cond_1c
    invoke-virtual {v0, v3, v8}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 1126
    .line 1127
    .line 1128
    move-result-object v3

    .line 1129
    const-string v10, "fc_consent"

    .line 1130
    .line 1131
    invoke-interface {v3, v10, v5}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1132
    .line 1133
    .line 1134
    move-result-object v5

    .line 1135
    :goto_1c
    sget-object v3, Lmz1;->w6:Liz1;

    .line 1136
    .line 1137
    invoke-virtual {v9, v3}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 1138
    .line 1139
    .line 1140
    move-result-object v3

    .line 1141
    check-cast v3, Ljava/lang/Boolean;

    .line 1142
    .line 1143
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1144
    .line 1145
    .line 1146
    move-result v3

    .line 1147
    if-nez v3, :cond_1d

    .line 1148
    .line 1149
    const/4 v3, 0x0

    .line 1150
    goto :goto_1e

    .line 1151
    :cond_1d
    invoke-static {v0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    .line 1152
    .line 1153
    .line 1154
    move-result-object v0

    .line 1155
    new-instance v3, Landroid/os/Bundle;

    .line 1156
    .line 1157
    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 1158
    .line 1159
    .line 1160
    invoke-interface {v0, v4}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    .line 1161
    .line 1162
    .line 1163
    move-result v9

    .line 1164
    if-eqz v9, :cond_1e

    .line 1165
    .line 1166
    invoke-interface {v0, v4, v8}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 1167
    .line 1168
    .line 1169
    move-result v9

    .line 1170
    invoke-virtual {v3, v4, v9}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 1171
    .line 1172
    .line 1173
    :cond_1e
    const-string v4, "IABConsent_SubjectToGDPR"

    .line 1174
    .line 1175
    const-string v9, "IABConsent_ConsentString"

    .line 1176
    .line 1177
    const-string v10, "IABConsent_ParsedPurposeConsents"

    .line 1178
    .line 1179
    const-string v11, "IABConsent_ParsedVendorConsents"

    .line 1180
    .line 1181
    filled-new-array {v4, v9, v10, v11}, [Ljava/lang/String;

    .line 1182
    .line 1183
    .line 1184
    move-result-object v4

    .line 1185
    :goto_1d
    if-ge v8, v2, :cond_20

    .line 1186
    .line 1187
    aget-object v9, v4, v8

    .line 1188
    .line 1189
    invoke-interface {v0, v9}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    .line 1190
    .line 1191
    .line 1192
    move-result v10

    .line 1193
    if-eqz v10, :cond_1f

    .line 1194
    .line 1195
    const/4 v10, 0x0

    .line 1196
    invoke-interface {v0, v9, v10}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1197
    .line 1198
    .line 1199
    move-result-object v11

    .line 1200
    invoke-virtual {v3, v9, v11}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 1201
    .line 1202
    .line 1203
    :cond_1f
    add-int/lit8 v8, v8, 0x1

    .line 1204
    .line 1205
    goto :goto_1d

    .line 1206
    :cond_20
    :goto_1e
    invoke-direct {v6, v7, v5, v3}, Ln43;-><init>(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 1207
    .line 1208
    .line 1209
    return-object v6

    .line 1210
    :pswitch_c
    iget-object v0, v1, Lxs1;->b:Ljava/lang/Object;

    .line 1211
    .line 1212
    check-cast v0, Le33;

    .line 1213
    .line 1214
    iget-object v2, v0, Le33;->b:Ljava/lang/Object;

    .line 1215
    .line 1216
    check-cast v2, Ll83;

    .line 1217
    .line 1218
    iget-object v3, v0, Le33;->c:Ljava/lang/Object;

    .line 1219
    .line 1220
    check-cast v3, Lbv2;

    .line 1221
    .line 1222
    iget-object v2, v2, Ll83;->g:Ljava/lang/String;

    .line 1223
    .line 1224
    iget-object v0, v0, Le33;->e:Ljava/lang/Object;

    .line 1225
    .line 1226
    check-cast v0, Ljava/lang/String;

    .line 1227
    .line 1228
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1229
    .line 1230
    .line 1231
    sget-object v4, Lmz1;->u4:Liz1;

    .line 1232
    .line 1233
    sget-object v5, Ltw1;->e:Ltw1;

    .line 1234
    .line 1235
    iget-object v5, v5, Ltw1;->c:Lkz1;

    .line 1236
    .line 1237
    invoke-virtual {v5, v4}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 1238
    .line 1239
    .line 1240
    move-result-object v4

    .line 1241
    check-cast v4, Ljava/lang/Boolean;

    .line 1242
    .line 1243
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1244
    .line 1245
    .line 1246
    move-result v4

    .line 1247
    if-nez v4, :cond_21

    .line 1248
    .line 1249
    goto :goto_1f

    .line 1250
    :cond_21
    if-eqz v2, :cond_24

    .line 1251
    .line 1252
    if-eqz v0, :cond_24

    .line 1253
    .line 1254
    iget-boolean v4, v3, Lbv2;->d:Z

    .line 1255
    .line 1256
    if-nez v4, :cond_22

    .line 1257
    .line 1258
    invoke-virtual {v3}, Lbv2;->a()V

    .line 1259
    .line 1260
    .line 1261
    sget-object v4, Lmz1;->v4:Liz1;

    .line 1262
    .line 1263
    invoke-virtual {v5, v4}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 1264
    .line 1265
    .line 1266
    move-result-object v4

    .line 1267
    check-cast v4, Ljava/lang/Boolean;

    .line 1268
    .line 1269
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1270
    .line 1271
    .line 1272
    move-result v4

    .line 1273
    if-eqz v4, :cond_22

    .line 1274
    .line 1275
    iget-object v4, v3, Lbv2;->f:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 1276
    .line 1277
    const/4 v6, 0x1

    .line 1278
    invoke-virtual {v4, v6}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    .line 1279
    .line 1280
    .line 1281
    move-result v4

    .line 1282
    if-nez v4, :cond_22

    .line 1283
    .line 1284
    sget-object v4, Lhg4;->C:Lhg4;

    .line 1285
    .line 1286
    iget-object v4, v4, Lhg4;->h:Lgd2;

    .line 1287
    .line 1288
    invoke-virtual {v4}, Lgd2;->g()Lra4;

    .line 1289
    .line 1290
    .line 1291
    move-result-object v4

    .line 1292
    new-instance v6, Lav2;

    .line 1293
    .line 1294
    invoke-direct {v6, v3, v8}, Lav2;-><init>(Lbv2;I)V

    .line 1295
    .line 1296
    .line 1297
    iget-object v4, v4, Lra4;->c:Ljava/util/ArrayList;

    .line 1298
    .line 1299
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1300
    .line 1301
    .line 1302
    :cond_22
    iget-object v4, v3, Lbv2;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 1303
    .line 1304
    invoke-virtual {v4, v0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1305
    .line 1306
    .line 1307
    move-result-object v4

    .line 1308
    check-cast v4, Ljava/util/Map;

    .line 1309
    .line 1310
    if-eqz v4, :cond_24

    .line 1311
    .line 1312
    invoke-interface {v4, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1313
    .line 1314
    .line 1315
    move-result-object v6

    .line 1316
    check-cast v6, Lorg/json/JSONObject;

    .line 1317
    .line 1318
    if-eqz v6, :cond_23

    .line 1319
    .line 1320
    move-object v0, v6

    .line 1321
    goto :goto_20

    .line 1322
    :cond_23
    iget-object v6, v3, Lbv2;->e:Lorg/json/JSONObject;

    .line 1323
    .line 1324
    invoke-static {v6, v2, v0}, Lg82;->v(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1325
    .line 1326
    .line 1327
    move-result-object v0

    .line 1328
    if-eqz v0, :cond_24

    .line 1329
    .line 1330
    invoke-interface {v4, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1331
    .line 1332
    .line 1333
    move-result-object v0

    .line 1334
    check-cast v0, Lorg/json/JSONObject;

    .line 1335
    .line 1336
    goto :goto_20

    .line 1337
    :cond_24
    :goto_1f
    const/4 v0, 0x0

    .line 1338
    :goto_20
    sget-object v2, Lmz1;->w4:Liz1;

    .line 1339
    .line 1340
    invoke-virtual {v5, v2}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 1341
    .line 1342
    .line 1343
    move-result-object v2

    .line 1344
    check-cast v2, Ljava/lang/Boolean;

    .line 1345
    .line 1346
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1347
    .line 1348
    .line 1349
    move-result v2

    .line 1350
    if-nez v2, :cond_25

    .line 1351
    .line 1352
    const/4 v6, 0x0

    .line 1353
    goto :goto_21

    .line 1354
    :cond_25
    iget-object v6, v3, Lbv2;->b:Lorg/json/JSONObject;

    .line 1355
    .line 1356
    :goto_21
    new-instance v2, Li43;

    .line 1357
    .line 1358
    invoke-direct {v2, v0, v6}, Li43;-><init>(Lorg/json/JSONObject;Lorg/json/JSONObject;)V

    .line 1359
    .line 1360
    .line 1361
    return-object v2

    .line 1362
    :pswitch_d
    const-string v0, "status"

    .line 1363
    .line 1364
    iget-object v3, v1, Lxs1;->b:Ljava/lang/Object;

    .line 1365
    .line 1366
    check-cast v3, Lo33;

    .line 1367
    .line 1368
    sget-object v6, Lmz1;->Nc:Liz1;

    .line 1369
    .line 1370
    sget-object v7, Ltw1;->e:Ltw1;

    .line 1371
    .line 1372
    iget-object v7, v7, Ltw1;->c:Lkz1;

    .line 1373
    .line 1374
    invoke-virtual {v7, v6}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 1375
    .line 1376
    .line 1377
    move-result-object v6

    .line 1378
    check-cast v6, Ljava/lang/Boolean;

    .line 1379
    .line 1380
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1381
    .line 1382
    .line 1383
    move-result v6

    .line 1384
    const/4 v7, 0x5

    .line 1385
    const-wide/high16 v9, -0x4010000000000000L    # -1.0

    .line 1386
    .line 1387
    if-eqz v6, :cond_2a

    .line 1388
    .line 1389
    iget-object v6, v3, Lo33;->c:Landroid/content/Context;

    .line 1390
    .line 1391
    const-string v11, "batterymanager"

    .line 1392
    .line 1393
    invoke-virtual {v6, v11}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 1394
    .line 1395
    .line 1396
    move-result-object v6

    .line 1397
    check-cast v6, Landroid/os/BatteryManager;

    .line 1398
    .line 1399
    if-eqz v6, :cond_26

    .line 1400
    .line 1401
    invoke-virtual {v6, v2}, Landroid/os/BatteryManager;->getIntProperty(I)I

    .line 1402
    .line 1403
    .line 1404
    move-result v2

    .line 1405
    int-to-double v9, v2

    .line 1406
    const-wide/high16 v11, 0x4059000000000000L    # 100.0

    .line 1407
    .line 1408
    div-double/2addr v9, v11

    .line 1409
    :cond_26
    if-eqz v6, :cond_27

    .line 1410
    .line 1411
    invoke-virtual {v6}, Landroid/os/BatteryManager;->isCharging()Z

    .line 1412
    .line 1413
    .line 1414
    move-result v0

    .line 1415
    goto :goto_26

    .line 1416
    :cond_27
    invoke-virtual {v3}, Lo33;->b()Landroid/content/Intent;

    .line 1417
    .line 1418
    .line 1419
    move-result-object v2

    .line 1420
    if-eqz v2, :cond_28

    .line 1421
    .line 1422
    invoke-virtual {v2, v0, v4}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 1423
    .line 1424
    .line 1425
    move-result v0

    .line 1426
    if-eq v0, v5, :cond_29

    .line 1427
    .line 1428
    if-ne v0, v7, :cond_28

    .line 1429
    .line 1430
    goto :goto_22

    .line 1431
    :cond_28
    move v7, v8

    .line 1432
    goto :goto_25

    .line 1433
    :cond_29
    :goto_22
    const/4 v7, 0x1

    .line 1434
    goto :goto_25

    .line 1435
    :cond_2a
    invoke-virtual {v3}, Lo33;->b()Landroid/content/Intent;

    .line 1436
    .line 1437
    .line 1438
    move-result-object v2

    .line 1439
    if-eqz v2, :cond_2b

    .line 1440
    .line 1441
    invoke-virtual {v2, v0, v4}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 1442
    .line 1443
    .line 1444
    move-result v0

    .line 1445
    if-eq v0, v5, :cond_2c

    .line 1446
    .line 1447
    if-ne v0, v7, :cond_2b

    .line 1448
    .line 1449
    goto :goto_23

    .line 1450
    :cond_2b
    move v7, v8

    .line 1451
    goto :goto_24

    .line 1452
    :cond_2c
    :goto_23
    const/4 v7, 0x1

    .line 1453
    :goto_24
    if-eqz v2, :cond_2d

    .line 1454
    .line 1455
    const-string v0, "level"

    .line 1456
    .line 1457
    invoke-virtual {v2, v0, v4}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 1458
    .line 1459
    .line 1460
    move-result v0

    .line 1461
    const-string v3, "scale"

    .line 1462
    .line 1463
    invoke-virtual {v2, v3, v4}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 1464
    .line 1465
    .line 1466
    move-result v2

    .line 1467
    int-to-double v3, v0

    .line 1468
    int-to-double v5, v2

    .line 1469
    div-double v9, v3, v5

    .line 1470
    .line 1471
    :cond_2d
    :goto_25
    move v0, v7

    .line 1472
    :goto_26
    new-instance v2, Lc43;

    .line 1473
    .line 1474
    invoke-direct {v2, v9, v10, v0}, Lc43;-><init>(DZ)V

    .line 1475
    .line 1476
    .line 1477
    return-object v2

    .line 1478
    :pswitch_e
    iget-object v0, v1, Lxs1;->b:Ljava/lang/Object;

    .line 1479
    .line 1480
    check-cast v0, Lo33;

    .line 1481
    .line 1482
    iget-object v0, v0, Lo33;->c:Landroid/content/Context;

    .line 1483
    .line 1484
    const-string v2, "audio"

    .line 1485
    .line 1486
    invoke-virtual {v0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 1487
    .line 1488
    .line 1489
    move-result-object v0

    .line 1490
    check-cast v0, Landroid/media/AudioManager;

    .line 1491
    .line 1492
    sget-object v2, Lhg4;->C:Lhg4;

    .line 1493
    .line 1494
    iget-object v6, v2, Lhg4;->i:Ljd1;

    .line 1495
    .line 1496
    invoke-virtual {v6}, Ljd1;->a()F

    .line 1497
    .line 1498
    .line 1499
    move-result v16

    .line 1500
    iget-object v6, v2, Lhg4;->i:Ljd1;

    .line 1501
    .line 1502
    monitor-enter v6

    .line 1503
    :try_start_b
    iget-boolean v7, v6, Ljd1;->a:Z
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_2

    .line 1504
    .line 1505
    monitor-exit v6

    .line 1506
    if-nez v0, :cond_2e

    .line 1507
    .line 1508
    move/from16 v17, v7

    .line 1509
    .line 1510
    new-instance v7, Ly33;

    .line 1511
    .line 1512
    const/4 v15, -0x1

    .line 1513
    const/16 v18, 0x1

    .line 1514
    .line 1515
    const/4 v8, -0x1

    .line 1516
    const/4 v9, 0x0

    .line 1517
    const/4 v10, 0x0

    .line 1518
    const/4 v11, -0x1

    .line 1519
    const/4 v12, -0x1

    .line 1520
    const/4 v13, -0x1

    .line 1521
    const/4 v14, -0x1

    .line 1522
    invoke-direct/range {v7 .. v18}, Ly33;-><init>(IZZIIIIIFZZ)V

    .line 1523
    .line 1524
    .line 1525
    goto :goto_28

    .line 1526
    :cond_2e
    move/from16 v17, v7

    .line 1527
    .line 1528
    invoke-virtual {v0}, Landroid/media/AudioManager;->getMode()I

    .line 1529
    .line 1530
    .line 1531
    move-result v8

    .line 1532
    invoke-virtual {v0}, Landroid/media/AudioManager;->isMusicActive()Z

    .line 1533
    .line 1534
    .line 1535
    move-result v9

    .line 1536
    invoke-virtual {v0}, Landroid/media/AudioManager;->isSpeakerphoneOn()Z

    .line 1537
    .line 1538
    .line 1539
    move-result v10

    .line 1540
    invoke-virtual {v0, v3}, Landroid/media/AudioManager;->getStreamVolume(I)I

    .line 1541
    .line 1542
    .line 1543
    move-result v11

    .line 1544
    sget-object v6, Lmz1;->Mb:Liz1;

    .line 1545
    .line 1546
    sget-object v7, Ltw1;->e:Ltw1;

    .line 1547
    .line 1548
    iget-object v7, v7, Ltw1;->c:Lkz1;

    .line 1549
    .line 1550
    invoke-virtual {v7, v6}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 1551
    .line 1552
    .line 1553
    move-result-object v6

    .line 1554
    check-cast v6, Ljava/lang/Boolean;

    .line 1555
    .line 1556
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1557
    .line 1558
    .line 1559
    move-result v6

    .line 1560
    if-eqz v6, :cond_2f

    .line 1561
    .line 1562
    iget-object v2, v2, Lhg4;->f:Lnh4;

    .line 1563
    .line 1564
    invoke-virtual {v2, v0}, Lbd2;->W(Landroid/media/AudioManager;)I

    .line 1565
    .line 1566
    .line 1567
    move-result v4

    .line 1568
    invoke-virtual {v0, v3}, Landroid/media/AudioManager;->getStreamMaxVolume(I)I

    .line 1569
    .line 1570
    .line 1571
    move-result v2

    .line 1572
    move v13, v2

    .line 1573
    move v12, v4

    .line 1574
    goto :goto_27

    .line 1575
    :cond_2f
    move v12, v4

    .line 1576
    move v13, v12

    .line 1577
    :goto_27
    invoke-virtual {v0}, Landroid/media/AudioManager;->getRingerMode()I

    .line 1578
    .line 1579
    .line 1580
    move-result v14

    .line 1581
    invoke-virtual {v0, v5}, Landroid/media/AudioManager;->getStreamVolume(I)I

    .line 1582
    .line 1583
    .line 1584
    move-result v15

    .line 1585
    new-instance v7, Ly33;

    .line 1586
    .line 1587
    const/16 v18, 0x0

    .line 1588
    .line 1589
    invoke-direct/range {v7 .. v18}, Ly33;-><init>(IZZIIIIIFZZ)V

    .line 1590
    .line 1591
    .line 1592
    :goto_28
    return-object v7

    .line 1593
    :catchall_2
    move-exception v0

    .line 1594
    :try_start_c
    monitor-exit v6
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_2

    .line 1595
    throw v0

    .line 1596
    :pswitch_f
    iget-object v0, v1, Lxs1;->b:Ljava/lang/Object;

    .line 1597
    .line 1598
    check-cast v0, Lg33;

    .line 1599
    .line 1600
    iget-object v0, v0, Lg33;->c:Ljava/lang/Object;

    .line 1601
    .line 1602
    check-cast v0, Le51;

    .line 1603
    .line 1604
    sget-object v2, Lmz1;->Pa:Liz1;

    .line 1605
    .line 1606
    sget-object v4, Ltw1;->e:Ltw1;

    .line 1607
    .line 1608
    iget-object v4, v4, Ltw1;->c:Lkz1;

    .line 1609
    .line 1610
    invoke-virtual {v4, v2}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 1611
    .line 1612
    .line 1613
    move-result-object v2

    .line 1614
    check-cast v2, Ljava/lang/Boolean;

    .line 1615
    .line 1616
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1617
    .line 1618
    .line 1619
    move-result v2

    .line 1620
    if-eqz v2, :cond_32

    .line 1621
    .line 1622
    sget-object v2, Lhg4;->C:Lhg4;

    .line 1623
    .line 1624
    iget-object v2, v2, Lhg4;->c:Llf4;

    .line 1625
    .line 1626
    :try_start_d
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 1627
    .line 1628
    const/16 v5, 0x1e

    .line 1629
    .line 1630
    if-lt v2, v5, :cond_30

    .line 1631
    .line 1632
    invoke-static {}, Lm91;->p()I

    .line 1633
    .line 1634
    .line 1635
    move-result v5

    .line 1636
    if-le v5, v3, :cond_30

    .line 1637
    .line 1638
    invoke-static {}, Lu0;->b()I

    .line 1639
    .line 1640
    .line 1641
    move-result v0

    .line 1642
    goto :goto_2b

    .line 1643
    :catch_5
    move-exception v0

    .line 1644
    goto :goto_2a

    .line 1645
    :cond_30
    sget-object v3, Lmz1;->Sa:Liz1;

    .line 1646
    .line 1647
    invoke-virtual {v4, v3}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 1648
    .line 1649
    .line 1650
    move-result-object v3

    .line 1651
    check-cast v3, Ljava/lang/Boolean;

    .line 1652
    .line 1653
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1654
    .line 1655
    .line 1656
    move-result v3

    .line 1657
    if-eqz v3, :cond_31

    .line 1658
    .line 1659
    iget v0, v0, Le51;->h:I

    .line 1660
    .line 1661
    sget-object v3, Lmz1;->Ra:Liz1;

    .line 1662
    .line 1663
    invoke-virtual {v4, v3}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 1664
    .line 1665
    .line 1666
    move-result-object v3

    .line 1667
    check-cast v3, Ljava/lang/Integer;

    .line 1668
    .line 1669
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 1670
    .line 1671
    .line 1672
    move-result v3

    .line 1673
    if-lt v0, v3, :cond_31

    .line 1674
    .line 1675
    const/16 v0, 0x1f

    .line 1676
    .line 1677
    if-lt v2, v0, :cond_31

    .line 1678
    .line 1679
    invoke-static {}, Lm91;->t()I

    .line 1680
    .line 1681
    .line 1682
    move-result v0

    .line 1683
    const/16 v2, 0x9

    .line 1684
    .line 1685
    if-lt v0, v2, :cond_31

    .line 1686
    .line 1687
    invoke-static {}, Lm91;->t()I

    .line 1688
    .line 1689
    .line 1690
    move-result v0
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_5

    .line 1691
    goto :goto_2b

    .line 1692
    :cond_31
    :goto_29
    move v0, v8

    .line 1693
    goto :goto_2b

    .line 1694
    :goto_2a
    const-string v2, "AdUtil.getAdServicesExtensionVersion"

    .line 1695
    .line 1696
    sget-object v3, Lhg4;->C:Lhg4;

    .line 1697
    .line 1698
    iget-object v3, v3, Lhg4;->h:Lgd2;

    .line 1699
    .line 1700
    invoke-virtual {v3, v2, v0}, Lgd2;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1701
    .line 1702
    .line 1703
    goto :goto_29

    .line 1704
    :goto_2b
    new-instance v2, Lw33;

    .line 1705
    .line 1706
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1707
    .line 1708
    .line 1709
    move-result-object v0

    .line 1710
    invoke-direct {v2, v0, v8}, Lw33;-><init>(Ljava/lang/Integer;I)V

    .line 1711
    .line 1712
    .line 1713
    goto :goto_2c

    .line 1714
    :cond_32
    new-instance v2, Lw33;

    .line 1715
    .line 1716
    const/4 v10, 0x0

    .line 1717
    invoke-direct {v2, v10, v8}, Lw33;-><init>(Ljava/lang/Integer;I)V

    .line 1718
    .line 1719
    .line 1720
    :goto_2c
    return-object v2

    .line 1721
    :pswitch_10
    iget-object v0, v1, Lxs1;->b:Ljava/lang/Object;

    .line 1722
    .line 1723
    check-cast v0, Lk33;

    .line 1724
    .line 1725
    new-instance v2, Lp33;

    .line 1726
    .line 1727
    iget-object v3, v0, Lk33;->d:Ljava/lang/Object;

    .line 1728
    .line 1729
    check-cast v3, Lid2;

    .line 1730
    .line 1731
    iget-object v0, v0, Lk33;->c:Ljava/lang/Object;

    .line 1732
    .line 1733
    check-cast v0, Ll83;

    .line 1734
    .line 1735
    iget-object v0, v0, Ll83;->k:Lvi4;

    .line 1736
    .line 1737
    iget-boolean v3, v3, Lid2;->l:Z

    .line 1738
    .line 1739
    const/4 v6, 0x1

    .line 1740
    invoke-direct {v2, v0, v3, v6}, Lp33;-><init>(Ljava/lang/Object;ZI)V

    .line 1741
    .line 1742
    .line 1743
    return-object v2

    .line 1744
    :pswitch_11
    move v6, v7

    .line 1745
    iget-object v0, v1, Lxs1;->b:Ljava/lang/Object;

    .line 1746
    .line 1747
    check-cast v0, Landroid/content/ContentResolver;

    .line 1748
    .line 1749
    const-string v2, "limit_ad_tracking"

    .line 1750
    .line 1751
    const-string v3, "advertising_id"

    .line 1752
    .line 1753
    new-instance v4, Lp33;

    .line 1754
    .line 1755
    invoke-static {v0, v3}, Landroid/provider/Settings$Secure;->getString(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;

    .line 1756
    .line 1757
    .line 1758
    move-result-object v3

    .line 1759
    invoke-static {v0, v2, v8}, Landroid/provider/Settings$Secure;->getInt(Landroid/content/ContentResolver;Ljava/lang/String;I)I

    .line 1760
    .line 1761
    .line 1762
    move-result v0

    .line 1763
    if-ne v0, v6, :cond_33

    .line 1764
    .line 1765
    move v7, v6

    .line 1766
    goto :goto_2d

    .line 1767
    :cond_33
    move v7, v8

    .line 1768
    :goto_2d
    invoke-direct {v4, v3, v7, v8}, Lp33;-><init>(Ljava/lang/Object;ZI)V

    .line 1769
    .line 1770
    .line 1771
    return-object v4

    .line 1772
    :pswitch_12
    iget-object v0, v1, Lxs1;->b:Ljava/lang/Object;

    .line 1773
    .line 1774
    move-object v2, v0

    .line 1775
    check-cast v2, Le33;

    .line 1776
    .line 1777
    sget-object v0, Lmz1;->z1:Liz1;

    .line 1778
    .line 1779
    sget-object v3, Ltw1;->e:Ltw1;

    .line 1780
    .line 1781
    iget-object v3, v3, Ltw1;->c:Lkz1;

    .line 1782
    .line 1783
    invoke-virtual {v3, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 1784
    .line 1785
    .line 1786
    move-result-object v0

    .line 1787
    check-cast v0, Ljava/lang/String;

    .line 1788
    .line 1789
    const-string v3, ";"

    .line 1790
    .line 1791
    invoke-virtual {v0, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 1792
    .line 1793
    .line 1794
    move-result-object v0

    .line 1795
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 1796
    .line 1797
    .line 1798
    move-result-object v0

    .line 1799
    new-instance v3, Landroid/os/Bundle;

    .line 1800
    .line 1801
    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 1802
    .line 1803
    .line 1804
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 1805
    .line 1806
    .line 1807
    move-result-object v4

    .line 1808
    :catch_6
    :goto_2e
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 1809
    .line 1810
    .line 1811
    move-result v0

    .line 1812
    if-eqz v0, :cond_37

    .line 1813
    .line 1814
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1815
    .line 1816
    .line 1817
    move-result-object v0

    .line 1818
    move-object v5, v0

    .line 1819
    check-cast v5, Ljava/lang/String;

    .line 1820
    .line 1821
    :try_start_e
    iget-object v0, v2, Le33;->c:Ljava/lang/Object;

    .line 1822
    .line 1823
    check-cast v0, Lyu2;

    .line 1824
    .line 1825
    new-instance v6, Lorg/json/JSONObject;

    .line 1826
    .line 1827
    invoke-direct {v6}, Lorg/json/JSONObject;-><init>()V

    .line 1828
    .line 1829
    .line 1830
    invoke-virtual {v0, v5, v6}, Lyu2;->a(Ljava/lang/String;Lorg/json/JSONObject;)Lu83;

    .line 1831
    .line 1832
    .line 1833
    move-result-object v6

    .line 1834
    invoke-virtual {v6}, Lu83;->a()Z

    .line 1835
    .line 1836
    .line 1837
    iget-object v0, v2, Le33;->b:Ljava/lang/Object;

    .line 1838
    .line 1839
    check-cast v0, Lmw2;

    .line 1840
    .line 1841
    iget-boolean v0, v0, Lmw2;->b:Z

    .line 1842
    .line 1843
    new-instance v7, Landroid/os/Bundle;

    .line 1844
    .line 1845
    invoke-direct {v7}, Landroid/os/Bundle;-><init>()V

    .line 1846
    .line 1847
    .line 1848
    sget-object v9, Lmz1;->tc:Liz1;

    .line 1849
    .line 1850
    sget-object v10, Ltw1;->e:Ltw1;

    .line 1851
    .line 1852
    iget-object v10, v10, Ltw1;->c:Lkz1;

    .line 1853
    .line 1854
    invoke-virtual {v10, v9}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 1855
    .line 1856
    .line 1857
    move-result-object v9

    .line 1858
    check-cast v9, Ljava/lang/Boolean;

    .line 1859
    .line 1860
    invoke-virtual {v9}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1861
    .line 1862
    .line 1863
    move-result v9
    :try_end_e
    .catch Ln83; {:try_start_e .. :try_end_e} :catch_6

    .line 1864
    if-eqz v9, :cond_34

    .line 1865
    .line 1866
    if-eqz v0, :cond_35

    .line 1867
    .line 1868
    :cond_34
    :try_start_f
    iget-object v0, v6, Lu83;->a:Lw62;

    .line 1869
    .line 1870
    invoke-interface {v0}, Lw62;->Z2()Li82;

    .line 1871
    .line 1872
    .line 1873
    move-result-object v0
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_3

    .line 1874
    if-eqz v0, :cond_35

    .line 1875
    .line 1876
    :try_start_10
    const-string v9, "sdk_version"

    .line 1877
    .line 1878
    invoke-virtual {v0}, Li82;->toString()Ljava/lang/String;

    .line 1879
    .line 1880
    .line 1881
    move-result-object v0

    .line 1882
    invoke-virtual {v7, v9, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 1883
    .line 1884
    .line 1885
    goto :goto_2f

    .line 1886
    :catchall_3
    move-exception v0

    .line 1887
    new-instance v9, Ln83;

    .line 1888
    .line 1889
    invoke-direct {v9, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    .line 1890
    .line 1891
    .line 1892
    throw v9
    :try_end_10
    .catch Ln83; {:try_start_10 .. :try_end_10} :catch_7

    .line 1893
    :catch_7
    :cond_35
    :goto_2f
    :try_start_11
    iget-object v0, v6, Lu83;->a:Lw62;

    .line 1894
    .line 1895
    invoke-interface {v0}, Lw62;->H()Li82;

    .line 1896
    .line 1897
    .line 1898
    move-result-object v0
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_4

    .line 1899
    if-eqz v0, :cond_36

    .line 1900
    .line 1901
    :try_start_12
    const-string v6, "adapter_version"

    .line 1902
    .line 1903
    invoke-virtual {v0}, Li82;->toString()Ljava/lang/String;

    .line 1904
    .line 1905
    .line 1906
    move-result-object v0

    .line 1907
    invoke-virtual {v7, v6, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 1908
    .line 1909
    .line 1910
    goto :goto_30

    .line 1911
    :catchall_4
    move-exception v0

    .line 1912
    new-instance v6, Ln83;

    .line 1913
    .line 1914
    invoke-direct {v6, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    .line 1915
    .line 1916
    .line 1917
    throw v6
    :try_end_12
    .catch Ln83; {:try_start_12 .. :try_end_12} :catch_8

    .line 1918
    :catch_8
    :cond_36
    :goto_30
    :try_start_13
    invoke-virtual {v3, v5, v7}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V
    :try_end_13
    .catch Ln83; {:try_start_13 .. :try_end_13} :catch_6

    .line 1919
    .line 1920
    .line 1921
    goto :goto_2e

    .line 1922
    :cond_37
    new-instance v0, Lm33;

    .line 1923
    .line 1924
    invoke-direct {v0, v8, v3}, Lm33;-><init>(ILandroid/os/Bundle;)V

    .line 1925
    .line 1926
    .line 1927
    sget-object v3, Lmz1;->tc:Liz1;

    .line 1928
    .line 1929
    sget-object v4, Ltw1;->e:Ltw1;

    .line 1930
    .line 1931
    iget-object v4, v4, Ltw1;->c:Lkz1;

    .line 1932
    .line 1933
    invoke-virtual {v4, v3}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 1934
    .line 1935
    .line 1936
    move-result-object v3

    .line 1937
    check-cast v3, Ljava/lang/Boolean;

    .line 1938
    .line 1939
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1940
    .line 1941
    .line 1942
    move-result v3

    .line 1943
    if-eqz v3, :cond_38

    .line 1944
    .line 1945
    iget-object v2, v2, Le33;->e:Ljava/lang/Object;

    .line 1946
    .line 1947
    check-cast v2, Ln33;

    .line 1948
    .line 1949
    iput-object v0, v2, Ln33;->b:Lm33;

    .line 1950
    .line 1951
    :cond_38
    return-object v0

    .line 1952
    :pswitch_13
    iget-object v0, v1, Lxs1;->b:Ljava/lang/Object;

    .line 1953
    .line 1954
    check-cast v0, Li33;

    .line 1955
    .line 1956
    new-instance v2, Lj33;

    .line 1957
    .line 1958
    sget-object v3, Lmz1;->s7:Liz1;

    .line 1959
    .line 1960
    sget-object v4, Ltw1;->e:Ltw1;

    .line 1961
    .line 1962
    iget-object v6, v4, Ltw1;->c:Lkz1;

    .line 1963
    .line 1964
    invoke-virtual {v6, v3}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 1965
    .line 1966
    .line 1967
    move-result-object v3

    .line 1968
    check-cast v3, Ljava/lang/Boolean;

    .line 1969
    .line 1970
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1971
    .line 1972
    .line 1973
    move-result v3

    .line 1974
    if-eqz v3, :cond_3d

    .line 1975
    .line 1976
    iget-object v3, v0, Li33;->b:Ll83;

    .line 1977
    .line 1978
    iget v0, v0, Li33;->c:I

    .line 1979
    .line 1980
    if-ne v0, v5, :cond_39

    .line 1981
    .line 1982
    const/4 v6, 0x0

    .line 1983
    goto/16 :goto_36

    .line 1984
    .line 1985
    :cond_39
    iget-object v0, v3, Ll83;->d:Lpc4;

    .line 1986
    .line 1987
    invoke-static {v0}, La30;->w(Lpc4;)Ljava/lang/String;

    .line 1988
    .line 1989
    .line 1990
    move-result-object v0

    .line 1991
    sget-object v3, Lmz1;->u7:Liz1;

    .line 1992
    .line 1993
    iget-object v5, v4, Ltw1;->c:Lkz1;

    .line 1994
    .line 1995
    invoke-virtual {v5, v3}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 1996
    .line 1997
    .line 1998
    move-result-object v3

    .line 1999
    check-cast v3, Ljava/lang/Boolean;

    .line 2000
    .line 2001
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 2002
    .line 2003
    .line 2004
    move-result v3

    .line 2005
    if-eqz v3, :cond_3a

    .line 2006
    .line 2007
    sget-object v3, Lmz1;->v7:Liz1;

    .line 2008
    .line 2009
    iget-object v4, v4, Ltw1;->c:Lkz1;

    .line 2010
    .line 2011
    invoke-virtual {v4, v3}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 2012
    .line 2013
    .line 2014
    move-result-object v3

    .line 2015
    check-cast v3, Ljava/lang/String;

    .line 2016
    .line 2017
    const-string v4, ","

    .line 2018
    .line 2019
    invoke-virtual {v3, v4}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 2020
    .line 2021
    .line 2022
    move-result-object v3

    .line 2023
    invoke-static {v3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 2024
    .line 2025
    .line 2026
    move-result-object v3

    .line 2027
    goto :goto_31

    .line 2028
    :cond_3a
    sget-object v3, Lmz1;->t7:Liz1;

    .line 2029
    .line 2030
    iget-object v4, v4, Ltw1;->c:Lkz1;

    .line 2031
    .line 2032
    invoke-virtual {v4, v3}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 2033
    .line 2034
    .line 2035
    move-result-object v3

    .line 2036
    check-cast v3, Ljava/lang/String;

    .line 2037
    .line 2038
    const-string v4, ","

    .line 2039
    .line 2040
    invoke-virtual {v3, v4}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 2041
    .line 2042
    .line 2043
    move-result-object v3

    .line 2044
    invoke-static {v3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 2045
    .line 2046
    .line 2047
    move-result-object v3

    .line 2048
    :goto_31
    invoke-static {v0}, La30;->s(Ljava/lang/String;)Ljava/lang/String;

    .line 2049
    .line 2050
    .line 2051
    move-result-object v0

    .line 2052
    invoke-interface {v3, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 2053
    .line 2054
    .line 2055
    move-result v0

    .line 2056
    if-eqz v0, :cond_3d

    .line 2057
    .line 2058
    :try_start_14
    sget-object v3, Lov3;->b:Lov3;

    .line 2059
    .line 2060
    monitor-enter v3
    :try_end_14
    .catch Ljava/security/GeneralSecurityException; {:try_start_14 .. :try_end_14} :catch_9

    .line 2061
    :try_start_15
    iget-object v0, v3, Lov3;->a:Ljava/util/HashMap;

    .line 2062
    .line 2063
    const-string v4, "AES128_GCM"

    .line 2064
    .line 2065
    invoke-virtual {v0, v4}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 2066
    .line 2067
    .line 2068
    move-result v5

    .line 2069
    if-eqz v5, :cond_3c

    .line 2070
    .line 2071
    invoke-virtual {v0, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2072
    .line 2073
    .line 2074
    move-result-object v0

    .line 2075
    check-cast v0, Lmr3;
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_6

    .line 2076
    .line 2077
    :try_start_16
    monitor-exit v3
    :try_end_16
    .catch Ljava/security/GeneralSecurityException; {:try_start_16 .. :try_end_16} :catch_9

    .line 2078
    if-eqz v0, :cond_3b

    .line 2079
    .line 2080
    goto :goto_32

    .line 2081
    :cond_3b
    :try_start_17
    sget-object v0, Lrv3;->b:Lrv3;

    .line 2082
    .line 2083
    const/4 v10, 0x0

    .line 2084
    invoke-virtual {v0, v10}, Lrv3;->h(Lmr3;)Lkw3;

    .line 2085
    .line 2086
    .line 2087
    move-result-object v0

    .line 2088
    check-cast v0, Lgw3;

    .line 2089
    .line 2090
    iget-object v0, v0, Lgw3;->h:Ljava/lang/Object;

    .line 2091
    .line 2092
    check-cast v0, Lqz3;
    :try_end_17
    .catch Ljava/security/GeneralSecurityException; {:try_start_17 .. :try_end_17} :catch_b

    .line 2093
    .line 2094
    :try_start_18
    invoke-virtual {v0}, Ls44;->b()[B

    .line 2095
    .line 2096
    .line 2097
    move-result-object v0

    .line 2098
    invoke-static {v0}, Lwl2;->J([B)Lmr3;

    .line 2099
    .line 2100
    .line 2101
    move-result-object v0

    .line 2102
    :goto_32
    invoke-static {v0}, Ljr3;->p(Lmr3;)Ljr3;

    .line 2103
    .line 2104
    .line 2105
    move-result-object v0
    :try_end_18
    .catch Ljava/security/GeneralSecurityException; {:try_start_18 .. :try_end_18} :catch_9

    .line 2106
    :try_start_19
    new-instance v3, Ljava/io/ByteArrayOutputStream;

    .line 2107
    .line 2108
    invoke-direct {v3}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 2109
    .line 2110
    .line 2111
    invoke-virtual {v0}, Ljr3;->f()Lvz3;

    .line 2112
    .line 2113
    .line 2114
    move-result-object v0
    :try_end_19
    .catch Ljava/io/IOException; {:try_start_19 .. :try_end_19} :catch_a
    .catch Ljava/security/GeneralSecurityException; {:try_start_19 .. :try_end_19} :catch_9

    .line 2115
    :try_start_1a
    invoke-virtual {v0, v3}, Ls44;->c(Ljava/io/OutputStream;)V
    :try_end_1a
    .catchall {:try_start_1a .. :try_end_1a} :catchall_5

    .line 2116
    .line 2117
    .line 2118
    :try_start_1b
    invoke-virtual {v3}, Ljava/io/OutputStream;->close()V

    .line 2119
    .line 2120
    .line 2121
    invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 2122
    .line 2123
    .line 2124
    move-result-object v0

    .line 2125
    goto :goto_35

    .line 2126
    :catch_9
    move-exception v0

    .line 2127
    goto :goto_34

    .line 2128
    :catchall_5
    move-exception v0

    .line 2129
    invoke-virtual {v3}, Ljava/io/OutputStream;->close()V

    .line 2130
    .line 2131
    .line 2132
    throw v0
    :try_end_1b
    .catch Ljava/io/IOException; {:try_start_1b .. :try_end_1b} :catch_a
    .catch Ljava/security/GeneralSecurityException; {:try_start_1b .. :try_end_1b} :catch_9

    .line 2133
    :catch_a
    :try_start_1c
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 2134
    .line 2135
    const-string v3, "Serialize keyset failed"

    .line 2136
    .line 2137
    invoke-direct {v0, v3}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 2138
    .line 2139
    .line 2140
    throw v0

    .line 2141
    :catch_b
    move-exception v0

    .line 2142
    const-string v3, "Parsing parameters failed in getProto(). You probably want to call some Tink register function for "

    .line 2143
    .line 2144
    const-string v4, "null"

    .line 2145
    .line 2146
    new-instance v5, Lrg;

    .line 2147
    .line 2148
    invoke-virtual {v3, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 2149
    .line 2150
    .line 2151
    move-result-object v3

    .line 2152
    invoke-direct {v5, v3, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 2153
    .line 2154
    .line 2155
    throw v5
    :try_end_1c
    .catch Ljava/security/GeneralSecurityException; {:try_start_1c .. :try_end_1c} :catch_9

    .line 2156
    :catchall_6
    move-exception v0

    .line 2157
    goto :goto_33

    .line 2158
    :cond_3c
    :try_start_1d
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 2159
    .line 2160
    const-string v4, "Name AES128_GCM does not exist"

    .line 2161
    .line 2162
    invoke-direct {v0, v4}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 2163
    .line 2164
    .line 2165
    throw v0

    .line 2166
    :goto_33
    monitor-exit v3
    :try_end_1d
    .catchall {:try_start_1d .. :try_end_1d} :catchall_6

    .line 2167
    :try_start_1e
    throw v0
    :try_end_1e
    .catch Ljava/security/GeneralSecurityException; {:try_start_1e .. :try_end_1e} :catch_9

    .line 2168
    :goto_34
    const-string v3, "Failed to generate key"

    .line 2169
    .line 2170
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 2171
    .line 2172
    .line 2173
    move-result-object v4

    .line 2174
    invoke-virtual {v3, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 2175
    .line 2176
    .line 2177
    move-result-object v3

    .line 2178
    invoke-static {v3}, Lgi2;->G(Ljava/lang/String;)V

    .line 2179
    .line 2180
    .line 2181
    const-string v3, "CryptoUtils.generateKey"

    .line 2182
    .line 2183
    sget-object v4, Lhg4;->C:Lhg4;

    .line 2184
    .line 2185
    iget-object v4, v4, Lhg4;->h:Lgd2;

    .line 2186
    .line 2187
    invoke-virtual {v4, v3, v0}, Lgd2;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 2188
    .line 2189
    .line 2190
    new-array v0, v8, [B

    .line 2191
    .line 2192
    :goto_35
    const/16 v3, 0xb

    .line 2193
    .line 2194
    invoke-static {v0, v3}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    .line 2195
    .line 2196
    .line 2197
    move-result-object v6

    .line 2198
    goto :goto_36

    .line 2199
    :cond_3d
    const/4 v10, 0x0

    .line 2200
    move-object v6, v10

    .line 2201
    :goto_36
    invoke-direct {v2, v6, v8}, Lj33;-><init>(Ljava/lang/String;I)V

    .line 2202
    .line 2203
    .line 2204
    return-object v2

    .line 2205
    :pswitch_14
    iget-object v0, v1, Lxs1;->b:Ljava/lang/Object;

    .line 2206
    .line 2207
    check-cast v0, Le33;

    .line 2208
    .line 2209
    new-instance v2, Lf33;

    .line 2210
    .line 2211
    new-instance v3, Ljava/util/ArrayList;

    .line 2212
    .line 2213
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 2214
    .line 2215
    .line 2216
    iget-object v5, v0, Le33;->e:Ljava/lang/Object;

    .line 2217
    .line 2218
    check-cast v5, Landroid/view/ViewGroup;

    .line 2219
    .line 2220
    :goto_37
    if-eqz v5, :cond_40

    .line 2221
    .line 2222
    invoke-virtual {v5}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 2223
    .line 2224
    .line 2225
    move-result-object v6

    .line 2226
    if-nez v6, :cond_3e

    .line 2227
    .line 2228
    goto :goto_39

    .line 2229
    :cond_3e
    instance-of v7, v6, Landroid/view/ViewGroup;

    .line 2230
    .line 2231
    if-eqz v7, :cond_3f

    .line 2232
    .line 2233
    move-object v7, v6

    .line 2234
    check-cast v7, Landroid/view/ViewGroup;

    .line 2235
    .line 2236
    invoke-virtual {v7, v5}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    .line 2237
    .line 2238
    .line 2239
    move-result v5

    .line 2240
    goto :goto_38

    .line 2241
    :cond_3f
    move v5, v4

    .line 2242
    :goto_38
    new-instance v7, Landroid/os/Bundle;

    .line 2243
    .line 2244
    invoke-direct {v7}, Landroid/os/Bundle;-><init>()V

    .line 2245
    .line 2246
    .line 2247
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2248
    .line 2249
    .line 2250
    move-result-object v9

    .line 2251
    invoke-virtual {v9}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 2252
    .line 2253
    .line 2254
    move-result-object v9

    .line 2255
    const-string v10, "type"

    .line 2256
    .line 2257
    invoke-virtual {v7, v10, v9}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 2258
    .line 2259
    .line 2260
    const-string v9, "index_of_child"

    .line 2261
    .line 2262
    invoke-virtual {v7, v9, v5}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 2263
    .line 2264
    .line 2265
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2266
    .line 2267
    .line 2268
    instance-of v5, v6, Landroid/view/View;

    .line 2269
    .line 2270
    if-eqz v5, :cond_40

    .line 2271
    .line 2272
    move-object v5, v6

    .line 2273
    check-cast v5, Landroid/view/View;

    .line 2274
    .line 2275
    goto :goto_37

    .line 2276
    :cond_40
    :goto_39
    iget-object v4, v0, Le33;->b:Ljava/lang/Object;

    .line 2277
    .line 2278
    check-cast v4, Ll83;

    .line 2279
    .line 2280
    iget-object v0, v0, Le33;->c:Ljava/lang/Object;

    .line 2281
    .line 2282
    check-cast v0, Landroid/content/Context;

    .line 2283
    .line 2284
    iget-object v4, v4, Ll83;->f:Lxe4;

    .line 2285
    .line 2286
    invoke-direct {v2, v0, v4, v3, v8}, Lf33;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 2287
    .line 2288
    .line 2289
    return-object v2

    .line 2290
    :pswitch_15
    iget-object v0, v1, Lxs1;->b:Ljava/lang/Object;

    .line 2291
    .line 2292
    check-cast v0, Ljz2;

    .line 2293
    .line 2294
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteOpenHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    .line 2295
    .line 2296
    .line 2297
    move-result-object v0

    .line 2298
    return-object v0

    .line 2299
    :pswitch_16
    iget-object v0, v1, Lxs1;->b:Ljava/lang/Object;

    .line 2300
    .line 2301
    check-cast v0, Lcz2;

    .line 2302
    .line 2303
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteOpenHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    .line 2304
    .line 2305
    .line 2306
    move-result-object v0

    .line 2307
    return-object v0

    .line 2308
    :pswitch_17
    iget-object v0, v1, Lxs1;->b:Ljava/lang/Object;

    .line 2309
    .line 2310
    check-cast v0, Landroid/webkit/CookieManager;

    .line 2311
    .line 2312
    if-nez v0, :cond_41

    .line 2313
    .line 2314
    const-string v0, ""

    .line 2315
    .line 2316
    goto :goto_3a

    .line 2317
    :cond_41
    sget-object v2, Lmz1;->W0:Liz1;

    .line 2318
    .line 2319
    sget-object v3, Ltw1;->e:Ltw1;

    .line 2320
    .line 2321
    iget-object v3, v3, Ltw1;->c:Lkz1;

    .line 2322
    .line 2323
    invoke-virtual {v3, v2}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 2324
    .line 2325
    .line 2326
    move-result-object v2

    .line 2327
    check-cast v2, Ljava/lang/String;

    .line 2328
    .line 2329
    invoke-virtual {v0, v2}, Landroid/webkit/CookieManager;->getCookie(Ljava/lang/String;)Ljava/lang/String;

    .line 2330
    .line 2331
    .line 2332
    move-result-object v0

    .line 2333
    :goto_3a
    return-object v0

    .line 2334
    :pswitch_18
    iget-object v0, v1, Lxs1;->b:Ljava/lang/Object;

    .line 2335
    .line 2336
    check-cast v0, Lnf2;

    .line 2337
    .line 2338
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2339
    .line 2340
    .line 2341
    sget-object v2, Lhg4;->C:Lhg4;

    .line 2342
    .line 2343
    iget-object v2, v2, Lhg4;->j:Lbu1;

    .line 2344
    .line 2345
    iget-object v0, v0, Lnf2;->s:Lww1;

    .line 2346
    .line 2347
    iget-object v4, v2, Lbu1;->i:Ljava/lang/Object;

    .line 2348
    .line 2349
    monitor-enter v4

    .line 2350
    :try_start_1f
    iget-object v5, v2, Lbu1;->l:Ljava/lang/Object;

    .line 2351
    .line 2352
    check-cast v5, Lxw1;

    .line 2353
    .line 2354
    const-wide/16 v6, -0x2

    .line 2355
    .line 2356
    if-nez v5, :cond_42

    .line 2357
    .line 2358
    monitor-exit v4

    .line 2359
    goto :goto_3b

    .line 2360
    :catchall_7
    move-exception v0

    .line 2361
    goto :goto_3c

    .line 2362
    :cond_42
    iget-object v5, v2, Lbu1;->j:Ljava/lang/Object;

    .line 2363
    .line 2364
    check-cast v5, Lvw1;

    .line 2365
    .line 2366
    invoke-virtual {v5}, Lvw1;->z()Z

    .line 2367
    .line 2368
    .line 2369
    move-result v5
    :try_end_1f
    .catchall {:try_start_1f .. :try_end_1f} :catchall_7

    .line 2370
    if-eqz v5, :cond_43

    .line 2371
    .line 2372
    :try_start_20
    iget-object v2, v2, Lbu1;->l:Ljava/lang/Object;

    .line 2373
    .line 2374
    check-cast v2, Lxw1;

    .line 2375
    .line 2376
    invoke-virtual {v2}, Lsb1;->U()Landroid/os/Parcel;

    .line 2377
    .line 2378
    .line 2379
    move-result-object v5

    .line 2380
    invoke-static {v5, v0}, Liv1;->c(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    .line 2381
    .line 2382
    .line 2383
    invoke-virtual {v2, v5, v3}, Lsb1;->Y(Landroid/os/Parcel;I)Landroid/os/Parcel;

    .line 2384
    .line 2385
    .line 2386
    move-result-object v0

    .line 2387
    invoke-virtual {v0}, Landroid/os/Parcel;->readLong()J

    .line 2388
    .line 2389
    .line 2390
    move-result-wide v2

    .line 2391
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V
    :try_end_20
    .catch Landroid/os/RemoteException; {:try_start_20 .. :try_end_20} :catch_c
    .catchall {:try_start_20 .. :try_end_20} :catchall_7

    .line 2392
    .line 2393
    .line 2394
    :try_start_21
    monitor-exit v4

    .line 2395
    move-wide v6, v2

    .line 2396
    goto :goto_3b

    .line 2397
    :catch_c
    move-exception v0

    .line 2398
    const-string v2, "Unable to call into cache service."

    .line 2399
    .line 2400
    invoke-static {v2, v0}, Lgi2;->c0(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 2401
    .line 2402
    .line 2403
    :cond_43
    monitor-exit v4
    :try_end_21
    .catchall {:try_start_21 .. :try_end_21} :catchall_7

    .line 2404
    :goto_3b
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 2405
    .line 2406
    .line 2407
    move-result-object v0

    .line 2408
    return-object v0

    .line 2409
    :goto_3c
    :try_start_22
    monitor-exit v4
    :try_end_22
    .catchall {:try_start_22 .. :try_end_22} :catchall_7

    .line 2410
    throw v0

    .line 2411
    :pswitch_19
    iget-object v0, v1, Lxs1;->b:Ljava/lang/Object;

    .line 2412
    .line 2413
    check-cast v0, Lwe2;

    .line 2414
    .line 2415
    iget-object v2, v0, Lwe2;->j:Lff2;

    .line 2416
    .line 2417
    iget-object v3, v0, Lwe2;->k:Ljava/lang/String;

    .line 2418
    .line 2419
    iget-object v4, v0, Lwe2;->l:[Ljava/lang/String;

    .line 2420
    .line 2421
    invoke-virtual {v2, v3, v4, v0}, Lff2;->g(Ljava/lang/String;[Ljava/lang/String;Lwe2;)Z

    .line 2422
    .line 2423
    .line 2424
    move-result v0

    .line 2425
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 2426
    .line 2427
    .line 2428
    move-result-object v0

    .line 2429
    return-object v0

    .line 2430
    :pswitch_1a
    iget-object v0, v1, Lxs1;->b:Ljava/lang/Object;

    .line 2431
    .line 2432
    check-cast v0, Lgd2;

    .line 2433
    .line 2434
    iget-object v0, v0, Lgd2;->e:Landroid/content/Context;

    .line 2435
    .line 2436
    sget v2, Lw11;->b:I

    .line 2437
    .line 2438
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 2439
    .line 2440
    .line 2441
    move-result-object v2

    .line 2442
    if-nez v2, :cond_44

    .line 2443
    .line 2444
    goto :goto_3d

    .line 2445
    :cond_44
    move-object v0, v2

    .line 2446
    :goto_3d
    new-instance v2, Ljava/util/ArrayList;

    .line 2447
    .line 2448
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 2449
    .line 2450
    .line 2451
    :try_start_23
    invoke-static {v0}, Lza1;->a(Landroid/content/Context;)Lzj0;

    .line 2452
    .line 2453
    .line 2454
    move-result-object v3

    .line 2455
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 2456
    .line 2457
    .line 2458
    move-result-object v0

    .line 2459
    iget-object v0, v0, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    .line 2460
    .line 2461
    const/16 v4, 0x1000

    .line 2462
    .line 2463
    invoke-virtual {v3, v0, v4}, Lzj0;->b(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 2464
    .line 2465
    .line 2466
    move-result-object v0
    :try_end_23
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_23 .. :try_end_23} :catch_d

    .line 2467
    iget-object v3, v0, Landroid/content/pm/PackageInfo;->requestedPermissions:[Ljava/lang/String;

    .line 2468
    .line 2469
    if-eqz v3, :cond_46

    .line 2470
    .line 2471
    iget-object v3, v0, Landroid/content/pm/PackageInfo;->requestedPermissionsFlags:[I

    .line 2472
    .line 2473
    if-eqz v3, :cond_46

    .line 2474
    .line 2475
    :goto_3e
    iget-object v3, v0, Landroid/content/pm/PackageInfo;->requestedPermissions:[Ljava/lang/String;

    .line 2476
    .line 2477
    array-length v4, v3

    .line 2478
    if-ge v8, v4, :cond_46

    .line 2479
    .line 2480
    iget-object v4, v0, Landroid/content/pm/PackageInfo;->requestedPermissionsFlags:[I

    .line 2481
    .line 2482
    aget v4, v4, v8

    .line 2483
    .line 2484
    and-int/2addr v4, v5

    .line 2485
    if-eqz v4, :cond_45

    .line 2486
    .line 2487
    aget-object v3, v3, v8

    .line 2488
    .line 2489
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2490
    .line 2491
    .line 2492
    :cond_45
    add-int/lit8 v8, v8, 0x1

    .line 2493
    .line 2494
    goto :goto_3e

    .line 2495
    :catch_d
    :cond_46
    return-object v2

    .line 2496
    :pswitch_1b
    iget-object v0, v1, Lxs1;->b:Ljava/lang/Object;

    .line 2497
    .line 2498
    check-cast v0, Li01;

    .line 2499
    .line 2500
    invoke-virtual {v0}, Li01;->getViewSignals()Ljava/lang/String;

    .line 2501
    .line 2502
    .line 2503
    move-result-object v0

    .line 2504
    return-object v0

    .line 2505
    :pswitch_1c
    const/4 v10, 0x0

    .line 2506
    iget-object v0, v1, Lxs1;->b:Ljava/lang/Object;

    .line 2507
    .line 2508
    check-cast v0, Landroid/content/Context;

    .line 2509
    .line 2510
    :try_start_24
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 2511
    .line 2512
    .line 2513
    move-result-object v2

    .line 2514
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 2515
    .line 2516
    .line 2517
    move-result-object v3

    .line 2518
    invoke-virtual {v2, v3, v8}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 2519
    .line 2520
    .line 2521
    move-result-object v2

    .line 2522
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 2523
    .line 2524
    .line 2525
    move-result-object v3

    .line 2526
    iget v2, v2, Landroid/content/pm/PackageInfo;->versionCode:I

    .line 2527
    .line 2528
    invoke-static {v2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 2529
    .line 2530
    .line 2531
    move-result-object v2

    .line 2532
    invoke-static {v0, v3, v2}, Lg82;->w(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Lqr1;

    .line 2533
    .line 2534
    .line 2535
    move-result-object v6
    :try_end_24
    .catchall {:try_start_24 .. :try_end_24} :catchall_8

    .line 2536
    goto :goto_3f

    .line 2537
    :catchall_8
    move-object v6, v10

    .line 2538
    :goto_3f
    return-object v6

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
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
.end method
