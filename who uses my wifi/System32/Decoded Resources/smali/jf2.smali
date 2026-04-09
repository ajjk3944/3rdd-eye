.class public final Ljf2;
.super Lff2;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lfe2;


# instance fields
.field public i:Lsf2;

.field public j:Ljava/lang/String;

.field public k:Z

.field public l:Z

.field public m:Lwe2;

.field public n:J

.field public o:J


# direct methods
.method public static final o(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "MD5"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lj63;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    const-string v0, "cache:"

    .line 12
    .line 13
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public static p(Ljava/lang/String;Ljava/lang/Exception;)Ljava/lang/String;
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    new-instance v4, Ljava/lang/StringBuilder;

    .line 34
    .line 35
    add-int/lit8 v3, v3, 0x1

    .line 36
    .line 37
    add-int/2addr v3, v1

    .line 38
    add-int/lit8 v3, v3, 0x1

    .line 39
    .line 40
    add-int/2addr v3, v2

    .line 41
    invoke-direct {v4, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 42
    .line 43
    .line 44
    const-string v1, "/"

    .line 45
    .line 46
    const-string v2, ":"

    .line 47
    .line 48
    invoke-static {v4, p0, v1, v0, v2}, Lex0;->q(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    return-object p0
.end method


# virtual methods
.method public final a()V
    .locals 4

    .line 1
    iget-object v0, p0, Ljf2;->i:Lsf2;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    iput-object v1, v0, Lsf2;->o:Lfe2;

    .line 7
    .line 8
    iget-object v2, v0, Lsf2;->l:Lmc4;

    .line 9
    .line 10
    if-eqz v2, :cond_0

    .line 11
    .line 12
    iget-object v3, v2, Lmc4;->j:Lhp2;

    .line 13
    .line 14
    invoke-virtual {v3}, Lhp2;->b()V

    .line 15
    .line 16
    .line 17
    iget-object v2, v2, Lmc4;->i:Lya4;

    .line 18
    .line 19
    invoke-virtual {v2, v0}, Lya4;->W1(Lsf2;)V

    .line 20
    .line 21
    .line 22
    iget-object v2, v0, Lsf2;->l:Lmc4;

    .line 23
    .line 24
    iget-object v3, v2, Lmc4;->j:Lhp2;

    .line 25
    .line 26
    invoke-virtual {v3}, Lhp2;->b()V

    .line 27
    .line 28
    .line 29
    iget-object v2, v2, Lmc4;->i:Lya4;

    .line 30
    .line 31
    invoke-virtual {v2}, Lya4;->X1()V

    .line 32
    .line 33
    .line 34
    iput-object v1, v0, Lsf2;->l:Lmc4;

    .line 35
    .line 36
    sget-object v0, Lsf2;->A:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    .line 39
    .line 40
    .line 41
    :cond_0
    return-void
.end method

.method public final b(Ljava/lang/String;)Z
    .locals 1

    .line 1
    filled-new-array {p1}, [Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0, p1, v0}, Ljf2;->d(Ljava/lang/String;[Ljava/lang/String;)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1
.end method

.method public final d(Ljava/lang/String;[Ljava/lang/String;)Z
    .locals 40

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move-object/from16 v0, p2

    .line 6
    .line 7
    iput-object v2, v1, Ljf2;->j:Ljava/lang/String;

    .line 8
    .line 9
    const-string v17, "error"

    .line 10
    .line 11
    invoke-static {v2}, Ljf2;->o(Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    const-string v4, " ms"

    .line 16
    .line 17
    const-string v5, "Timeout reached. Limit: "

    .line 18
    .line 19
    const/4 v6, 0x0

    .line 20
    :try_start_0
    array-length v7, v0

    .line 21
    new-array v7, v7, [Landroid/net/Uri;

    .line 22
    .line 23
    move v8, v6

    .line 24
    :goto_0
    array-length v9, v0

    .line 25
    if-ge v8, v9, :cond_0

    .line 26
    .line 27
    aget-object v9, v0, v8

    .line 28
    .line 29
    invoke-static {v9}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 30
    .line 31
    .line 32
    move-result-object v9

    .line 33
    aput-object v9, v7, v8

    .line 34
    .line 35
    add-int/lit8 v8, v8, 0x1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :catch_0
    move-exception v0

    .line 39
    move-object v4, v3

    .line 40
    move/from16 v30, v6

    .line 41
    .line 42
    move-object v3, v2

    .line 43
    move-object v2, v1

    .line 44
    goto/16 :goto_d

    .line 45
    .line 46
    :cond_0
    iget-object v0, v1, Ljf2;->i:Lsf2;

    .line 47
    .line 48
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    invoke-static {v6}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 52
    .line 53
    .line 54
    move-result-object v8

    .line 55
    invoke-virtual {v0, v7, v8, v6}, Lsf2;->u([Landroid/net/Uri;Ljava/nio/ByteBuffer;Z)V

    .line 56
    .line 57
    .line 58
    iget-object v0, v1, Lff2;->h:Ljava/lang/ref/WeakReference;

    .line 59
    .line 60
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    check-cast v0, Lag2;

    .line 65
    .line 66
    if-eqz v0, :cond_1

    .line 67
    .line 68
    invoke-interface {v0, v3, v1}, Lag2;->d1(Ljava/lang/String;Lff2;)V

    .line 69
    .line 70
    .line 71
    :cond_1
    sget-object v0, Lhg4;->C:Lhg4;

    .line 72
    .line 73
    iget-object v0, v0, Lhg4;->k:Lym;

    .line 74
    .line 75
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 79
    .line 80
    .line 81
    move-result-wide v18

    .line 82
    sget-object v0, Lmz1;->K:Liz1;

    .line 83
    .line 84
    sget-object v7, Ltw1;->e:Ltw1;

    .line 85
    .line 86
    iget-object v8, v7, Ltw1;->c:Lkz1;

    .line 87
    .line 88
    invoke-virtual {v8, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    check-cast v0, Ljava/lang/Long;

    .line 93
    .line 94
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 95
    .line 96
    .line 97
    move-result-wide v8

    .line 98
    sget-object v0, Lmz1;->J:Liz1;

    .line 99
    .line 100
    iget-object v10, v7, Ltw1;->c:Lkz1;

    .line 101
    .line 102
    invoke-virtual {v10, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    check-cast v0, Ljava/lang/Long;

    .line 107
    .line 108
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 109
    .line 110
    .line 111
    move-result-wide v10

    .line 112
    const-wide/16 v12, 0x3e8

    .line 113
    .line 114
    mul-long/2addr v10, v12

    .line 115
    sget-object v0, Lmz1;->v:Liz1;

    .line 116
    .line 117
    iget-object v12, v7, Ltw1;->c:Lkz1;

    .line 118
    .line 119
    invoke-virtual {v12, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    check-cast v0, Ljava/lang/Integer;

    .line 124
    .line 125
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 126
    .line 127
    .line 128
    move-result v0

    .line 129
    int-to-long v12, v0

    .line 130
    sget-object v0, Lmz1;->Y1:Liz1;

    .line 131
    .line 132
    iget-object v7, v7, Ltw1;->c:Lkz1;

    .line 133
    .line 134
    invoke-virtual {v7, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    check-cast v0, Ljava/lang/Boolean;

    .line 139
    .line 140
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 141
    .line 142
    .line 143
    move-result v20

    .line 144
    const-wide/16 v21, -0x1

    .line 145
    .line 146
    move-wide/from16 v14, v21

    .line 147
    .line 148
    :goto_1
    monitor-enter p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 149
    :try_start_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 150
    .line 151
    .line 152
    move-result-wide v23

    .line 153
    sub-long v23, v23, v18

    .line 154
    .line 155
    cmp-long v0, v23, v10

    .line 156
    .line 157
    if-gtz v0, :cond_f

    .line 158
    .line 159
    iget-boolean v0, v1, Ljf2;->k:Z

    .line 160
    .line 161
    if-nez v0, :cond_e

    .line 162
    .line 163
    iget-boolean v0, v1, Ljf2;->l:Z

    .line 164
    .line 165
    const/16 v23, 0x1

    .line 166
    .line 167
    if-eqz v0, :cond_2

    .line 168
    .line 169
    monitor-exit p0

    .line 170
    return v23

    .line 171
    :cond_2
    iget-object v0, v1, Ljf2;->i:Lsf2;

    .line 172
    .line 173
    iget-object v0, v0, Lsf2;->l:Lmc4;

    .line 174
    .line 175
    if-eqz v0, :cond_3

    .line 176
    .line 177
    move/from16 v7, v23

    .line 178
    .line 179
    goto :goto_2

    .line 180
    :cond_3
    move v7, v6

    .line 181
    :goto_2
    if-eqz v7, :cond_d

    .line 182
    .line 183
    invoke-virtual {v0}, Lmc4;->U1()J

    .line 184
    .line 185
    .line 186
    move-result-wide v24

    .line 187
    const-wide/16 v26, 0x0

    .line 188
    .line 189
    cmp-long v0, v24, v26

    .line 190
    .line 191
    if-lez v0, :cond_c

    .line 192
    .line 193
    iget-object v0, v1, Ljf2;->i:Lsf2;

    .line 194
    .line 195
    iget-object v0, v0, Lsf2;->l:Lmc4;

    .line 196
    .line 197
    invoke-virtual {v0}, Lmc4;->V1()J

    .line 198
    .line 199
    .line 200
    move-result-wide v28
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_4

    .line 201
    cmp-long v0, v28, v14

    .line 202
    .line 203
    if-eqz v0, :cond_9

    .line 204
    .line 205
    cmp-long v0, v28, v26

    .line 206
    .line 207
    if-lez v0, :cond_4

    .line 208
    .line 209
    move/from16 v14, v23

    .line 210
    .line 211
    goto :goto_3

    .line 212
    :cond_4
    move v14, v6

    .line 213
    :goto_3
    if-eqz v20, :cond_6

    .line 214
    .line 215
    :try_start_2
    iget-object v0, v1, Ljf2;->i:Lsf2;

    .line 216
    .line 217
    iget-object v7, v0, Lsf2;->x:Lnf2;

    .line 218
    .line 219
    if-eqz v7, :cond_5

    .line 220
    .line 221
    iget-object v7, v0, Lsf2;->x:Lnf2;

    .line 222
    .line 223
    iget-boolean v7, v7, Lnf2;->u:Z

    .line 224
    .line 225
    if-eqz v7, :cond_5

    .line 226
    .line 227
    move-wide/from16 v6, v26

    .line 228
    .line 229
    goto :goto_5

    .line 230
    :cond_5
    iget v0, v0, Lsf2;->p:I

    .line 231
    .line 232
    int-to-long v6, v0

    .line 233
    goto :goto_5

    .line 234
    :goto_4
    move-object v4, v3

    .line 235
    const/16 v30, 0x0

    .line 236
    .line 237
    goto/16 :goto_9

    .line 238
    .line 239
    :catchall_0
    move-exception v0

    .line 240
    goto :goto_4

    .line 241
    :cond_6
    move-wide/from16 v6, v21

    .line 242
    .line 243
    :goto_5
    if-eqz v20, :cond_7

    .line 244
    .line 245
    iget-object v0, v1, Ljf2;->i:Lsf2;

    .line 246
    .line 247
    invoke-virtual {v0}, Lsf2;->q()J

    .line 248
    .line 249
    .line 250
    move-result-wide v30

    .line 251
    goto :goto_6

    .line 252
    :cond_7
    move-wide/from16 v30, v21

    .line 253
    .line 254
    :goto_6
    if-eqz v20, :cond_8

    .line 255
    .line 256
    iget-object v0, v1, Ljf2;->i:Lsf2;

    .line 257
    .line 258
    invoke-virtual {v0}, Lsf2;->r()J

    .line 259
    .line 260
    .line 261
    move-result-wide v32
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 262
    goto :goto_7

    .line 263
    :cond_8
    move-wide/from16 v32, v21

    .line 264
    .line 265
    :goto_7
    :try_start_3
    sget-object v0, Lsf2;->z:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 266
    .line 267
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 268
    .line 269
    .line 270
    move-result v15

    .line 271
    sget-object v0, Lsf2;->A:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 272
    .line 273
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 274
    .line 275
    .line 276
    move-result v0

    .line 277
    move/from16 p2, v0

    .line 278
    .line 279
    sget-object v0, Lj63;->b:Lwc1;

    .line 280
    .line 281
    move-object/from16 v34, v0

    .line 282
    .line 283
    new-instance v0, Lze2;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 284
    .line 285
    move/from16 v16, p2

    .line 286
    .line 287
    move-object/from16 v35, v4

    .line 288
    .line 289
    move-object/from16 v36, v5

    .line 290
    .line 291
    move-wide/from16 v37, v8

    .line 292
    .line 293
    move-wide/from16 v4, v28

    .line 294
    .line 295
    move-object/from16 v39, v34

    .line 296
    .line 297
    move-wide v8, v6

    .line 298
    move-wide/from16 v28, v12

    .line 299
    .line 300
    move-wide/from16 v6, v24

    .line 301
    .line 302
    move-wide/from16 v12, v32

    .line 303
    .line 304
    move-wide/from16 v24, v10

    .line 305
    .line 306
    move-wide/from16 v10, v30

    .line 307
    .line 308
    const/16 v30, 0x0

    .line 309
    .line 310
    :try_start_4
    invoke-direct/range {v0 .. v16}, Lze2;-><init>(Lff2;Ljava/lang/String;Ljava/lang/String;JJJJJZII)V

    .line 311
    .line 312
    .line 313
    move-object v2, v0

    .line 314
    move-wide v0, v4

    .line 315
    move-wide v4, v6

    .line 316
    move-object/from16 v6, v39

    .line 317
    .line 318
    invoke-virtual {v6, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 319
    .line 320
    .line 321
    move-wide v14, v0

    .line 322
    goto :goto_8

    .line 323
    :catchall_1
    move-exception v0

    .line 324
    const/16 v30, 0x0

    .line 325
    .line 326
    goto :goto_a

    .line 327
    :cond_9
    move-object/from16 v35, v4

    .line 328
    .line 329
    move-object/from16 v36, v5

    .line 330
    .line 331
    move/from16 v30, v6

    .line 332
    .line 333
    move-wide/from16 v37, v8

    .line 334
    .line 335
    move-wide/from16 v4, v24

    .line 336
    .line 337
    move-wide/from16 v0, v28

    .line 338
    .line 339
    move-wide/from16 v24, v10

    .line 340
    .line 341
    move-wide/from16 v28, v12

    .line 342
    .line 343
    :goto_8
    cmp-long v2, v0, v4

    .line 344
    .line 345
    if-ltz v2, :cond_a

    .line 346
    .line 347
    sget-object v6, Lj63;->b:Lwc1;

    .line 348
    .line 349
    new-instance v0, Lef2;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 350
    .line 351
    move-object/from16 v1, p0

    .line 352
    .line 353
    move-object/from16 v2, p1

    .line 354
    .line 355
    :try_start_5
    invoke-direct/range {v0 .. v5}, Lef2;-><init>(Lff2;Ljava/lang/String;Ljava/lang/String;J)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 356
    .line 357
    .line 358
    move-object v4, v3

    .line 359
    move-object v3, v2

    .line 360
    move-object v2, v1

    .line 361
    :try_start_6
    invoke-virtual {v6, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 362
    .line 363
    .line 364
    monitor-exit p0

    .line 365
    return v23

    .line 366
    :catchall_2
    move-exception v0

    .line 367
    move-object v4, v3

    .line 368
    :goto_9
    move-object v3, v2

    .line 369
    move-object v2, v1

    .line 370
    goto/16 :goto_c

    .line 371
    .line 372
    :catchall_3
    move-exception v0

    .line 373
    :goto_a
    move-object/from16 v2, p0

    .line 374
    .line 375
    move-object v4, v3

    .line 376
    move-object/from16 v3, p1

    .line 377
    .line 378
    goto/16 :goto_c

    .line 379
    .line 380
    :cond_a
    move-object/from16 v2, p0

    .line 381
    .line 382
    move-object v4, v3

    .line 383
    move-object/from16 v3, p1

    .line 384
    .line 385
    iget-object v5, v2, Ljf2;->i:Lsf2;

    .line 386
    .line 387
    iget v5, v5, Lsf2;->p:I

    .line 388
    .line 389
    int-to-long v5, v5

    .line 390
    cmp-long v5, v5, v28

    .line 391
    .line 392
    if-ltz v5, :cond_b

    .line 393
    .line 394
    cmp-long v0, v0, v26

    .line 395
    .line 396
    if-lez v0, :cond_b

    .line 397
    .line 398
    monitor-exit p0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    .line 399
    return v23

    .line 400
    :cond_b
    move-wide/from16 v0, v37

    .line 401
    .line 402
    goto :goto_b

    .line 403
    :catchall_4
    move-exception v0

    .line 404
    move-object v4, v3

    .line 405
    move/from16 v30, v6

    .line 406
    .line 407
    goto :goto_9

    .line 408
    :cond_c
    move-object/from16 v35, v4

    .line 409
    .line 410
    move-object/from16 v36, v5

    .line 411
    .line 412
    move/from16 v30, v6

    .line 413
    .line 414
    move-wide/from16 v24, v10

    .line 415
    .line 416
    move-wide/from16 v28, v12

    .line 417
    .line 418
    move-object v4, v3

    .line 419
    move-object v3, v2

    .line 420
    move-object v2, v1

    .line 421
    move-wide v0, v8

    .line 422
    :goto_b
    :try_start_7
    invoke-virtual {v2, v0, v1}, Ljava/lang/Object;->wait(J)V
    :try_end_7
    .catch Ljava/lang/InterruptedException; {:try_start_7 .. :try_end_7} :catch_1
    .catchall {:try_start_7 .. :try_end_7} :catchall_5

    .line 423
    .line 424
    .line 425
    :try_start_8
    monitor-exit p0

    .line 426
    move-wide v8, v0

    .line 427
    move-object v1, v2

    .line 428
    move-object v2, v3

    .line 429
    move-object v3, v4

    .line 430
    move-wide/from16 v10, v24

    .line 431
    .line 432
    move-wide/from16 v12, v28

    .line 433
    .line 434
    move/from16 v6, v30

    .line 435
    .line 436
    move-object/from16 v4, v35

    .line 437
    .line 438
    move-object/from16 v5, v36

    .line 439
    .line 440
    goto/16 :goto_1

    .line 441
    .line 442
    :catch_1
    const-string v17, "interrupted"

    .line 443
    .line 444
    new-instance v0, Ljava/io/IOException;

    .line 445
    .line 446
    const-string v1, "Wait interrupted."

    .line 447
    .line 448
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 449
    .line 450
    .line 451
    throw v0

    .line 452
    :cond_d
    move-object v4, v3

    .line 453
    move/from16 v30, v6

    .line 454
    .line 455
    move-object v3, v2

    .line 456
    move-object v2, v1

    .line 457
    const-string v17, "exoPlayerReleased"

    .line 458
    .line 459
    new-instance v0, Ljava/io/IOException;

    .line 460
    .line 461
    const-string v1, "ExoPlayer was released during preloading."

    .line 462
    .line 463
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 464
    .line 465
    .line 466
    throw v0

    .line 467
    :cond_e
    move-object v4, v3

    .line 468
    move/from16 v30, v6

    .line 469
    .line 470
    move-object v3, v2

    .line 471
    move-object v2, v1

    .line 472
    const-string v17, "externalAbort"

    .line 473
    .line 474
    new-instance v0, Ljava/io/IOException;

    .line 475
    .line 476
    const-string v1, "Abort requested before buffering finished. "

    .line 477
    .line 478
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 479
    .line 480
    .line 481
    throw v0

    .line 482
    :cond_f
    move-object/from16 v35, v4

    .line 483
    .line 484
    move-object/from16 v36, v5

    .line 485
    .line 486
    move/from16 v30, v6

    .line 487
    .line 488
    move-wide/from16 v24, v10

    .line 489
    .line 490
    move-object v4, v3

    .line 491
    move-object v3, v2

    .line 492
    move-object v2, v1

    .line 493
    const-string v17, "downloadTimeout"

    .line 494
    .line 495
    new-instance v0, Ljava/io/IOException;

    .line 496
    .line 497
    invoke-static/range {v24 .. v25}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 498
    .line 499
    .line 500
    move-result-object v1

    .line 501
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 502
    .line 503
    .line 504
    move-result v1

    .line 505
    add-int/lit8 v1, v1, 0x1b

    .line 506
    .line 507
    new-instance v5, Ljava/lang/StringBuilder;

    .line 508
    .line 509
    invoke-direct {v5, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 510
    .line 511
    .line 512
    move-object/from16 v1, v36

    .line 513
    .line 514
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 515
    .line 516
    .line 517
    move-wide/from16 v10, v24

    .line 518
    .line 519
    invoke-virtual {v5, v10, v11}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 520
    .line 521
    .line 522
    move-object/from16 v1, v35

    .line 523
    .line 524
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 525
    .line 526
    .line 527
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 528
    .line 529
    .line 530
    move-result-object v1

    .line 531
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 532
    .line 533
    .line 534
    throw v0

    .line 535
    :goto_c
    monitor-exit p0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_5

    .line 536
    :try_start_9
    throw v0
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_2

    .line 537
    :catch_2
    move-exception v0

    .line 538
    :goto_d
    move-object/from16 v1, v17

    .line 539
    .line 540
    goto :goto_e

    .line 541
    :catchall_5
    move-exception v0

    .line 542
    goto :goto_c

    .line 543
    :goto_e
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 544
    .line 545
    .line 546
    move-result-object v5

    .line 547
    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 548
    .line 549
    .line 550
    move-result-object v6

    .line 551
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 552
    .line 553
    .line 554
    move-result v6

    .line 555
    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 556
    .line 557
    .line 558
    move-result-object v7

    .line 559
    add-int/lit8 v6, v6, 0x22

    .line 560
    .line 561
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 562
    .line 563
    .line 564
    move-result v7

    .line 565
    new-instance v8, Ljava/lang/StringBuilder;

    .line 566
    .line 567
    add-int/2addr v6, v7

    .line 568
    invoke-direct {v8, v6}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 569
    .line 570
    .line 571
    const-string v6, "Failed to preload url "

    .line 572
    .line 573
    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 574
    .line 575
    .line 576
    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 577
    .line 578
    .line 579
    const-string v6, " Exception: "

    .line 580
    .line 581
    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 582
    .line 583
    .line 584
    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 585
    .line 586
    .line 587
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 588
    .line 589
    .line 590
    move-result-object v5

    .line 591
    invoke-static {v5}, Lgi2;->i0(Ljava/lang/String;)V

    .line 592
    .line 593
    .line 594
    const-string v5, "VideoStreamExoPlayerCache.preload"

    .line 595
    .line 596
    sget-object v6, Lhg4;->C:Lhg4;

    .line 597
    .line 598
    iget-object v6, v6, Lhg4;->h:Lgd2;

    .line 599
    .line 600
    invoke-virtual {v6, v5, v0}, Lgd2;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 601
    .line 602
    .line 603
    invoke-virtual {v2}, Ljf2;->a()V

    .line 604
    .line 605
    .line 606
    invoke-static {v1, v0}, Ljf2;->p(Ljava/lang/String;Ljava/lang/Exception;)Ljava/lang/String;

    .line 607
    .line 608
    .line 609
    move-result-object v0

    .line 610
    invoke-virtual {v2, v3, v4, v1, v0}, Lff2;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 611
    .line 612
    .line 613
    return v30
.end method

.method public final f0(I)V
    .locals 0

    .line 1
    return-void
.end method

.method public final g(Ljava/lang/String;[Ljava/lang/String;Lwe2;)Z
    .locals 5

    .line 1
    iput-object p1, p0, Ljf2;->j:Ljava/lang/String;

    .line 2
    .line 3
    iput-object p3, p0, Ljf2;->m:Lwe2;

    .line 4
    .line 5
    invoke-static {p1}, Ljf2;->o(Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p3

    .line 9
    const/4 v0, 0x0

    .line 10
    :try_start_0
    array-length v1, p2

    .line 11
    new-array v1, v1, [Landroid/net/Uri;

    .line 12
    .line 13
    move v2, v0

    .line 14
    :goto_0
    array-length v3, p2

    .line 15
    if-ge v2, v3, :cond_0

    .line 16
    .line 17
    aget-object v3, p2, v2

    .line 18
    .line 19
    invoke-static {v3}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    aput-object v3, v1, v2

    .line 24
    .line 25
    add-int/lit8 v2, v2, 0x1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :catch_0
    move-exception p2

    .line 29
    goto :goto_1

    .line 30
    :cond_0
    iget-object p2, p0, Ljf2;->i:Lsf2;

    .line 31
    .line 32
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    invoke-virtual {p2, v1, v2, v0}, Lsf2;->u([Landroid/net/Uri;Ljava/nio/ByteBuffer;Z)V

    .line 40
    .line 41
    .line 42
    iget-object p2, p0, Lff2;->h:Ljava/lang/ref/WeakReference;

    .line 43
    .line 44
    invoke-virtual {p2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p2

    .line 48
    check-cast p2, Lag2;

    .line 49
    .line 50
    if-eqz p2, :cond_1

    .line 51
    .line 52
    invoke-interface {p2, p3, p0}, Lag2;->d1(Ljava/lang/String;Lff2;)V

    .line 53
    .line 54
    .line 55
    :cond_1
    sget-object p2, Lhg4;->C:Lhg4;

    .line 56
    .line 57
    iget-object p2, p2, Lhg4;->k:Lym;

    .line 58
    .line 59
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 63
    .line 64
    .line 65
    move-result-wide v1

    .line 66
    iput-wide v1, p0, Ljf2;->n:J

    .line 67
    .line 68
    const-wide/16 v1, -0x1

    .line 69
    .line 70
    iput-wide v1, p0, Ljf2;->o:J

    .line 71
    .line 72
    sget-object p2, Llf4;->l:Li63;

    .line 73
    .line 74
    new-instance v1, Lfu1;

    .line 75
    .line 76
    const/16 v2, 0xf

    .line 77
    .line 78
    invoke-direct {v1, v2, p0}, Lfu1;-><init>(ILjava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    const/4 v2, 0x1

    .line 82
    const-wide/16 v3, 0x0

    .line 83
    .line 84
    invoke-virtual {p2, v1, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 85
    .line 86
    .line 87
    return v2

    .line 88
    :goto_1
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 97
    .line 98
    .line 99
    move-result v2

    .line 100
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v3

    .line 104
    add-int/lit8 v2, v2, 0x22

    .line 105
    .line 106
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 107
    .line 108
    .line 109
    move-result v3

    .line 110
    new-instance v4, Ljava/lang/StringBuilder;

    .line 111
    .line 112
    add-int/2addr v2, v3

    .line 113
    invoke-direct {v4, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 114
    .line 115
    .line 116
    const-string v2, "Failed to preload url "

    .line 117
    .line 118
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    const-string v2, " Exception: "

    .line 125
    .line 126
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    .line 132
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v1

    .line 136
    invoke-static {v1}, Lgi2;->i0(Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    sget-object v1, Lhg4;->C:Lhg4;

    .line 140
    .line 141
    iget-object v1, v1, Lhg4;->h:Lgd2;

    .line 142
    .line 143
    const-string v2, "VideoStreamExoPlayerCache.preload"

    .line 144
    .line 145
    invoke-virtual {v1, v2, p2}, Lgd2;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {p0}, Ljf2;->a()V

    .line 149
    .line 150
    .line 151
    const-string v1, "error"

    .line 152
    .line 153
    invoke-static {v1, p2}, Ljf2;->p(Ljava/lang/String;Ljava/lang/Exception;)Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object p2

    .line 157
    invoke-virtual {p0, p1, p3, v1, p2}, Lff2;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    return v0
.end method

.method public final h(I)V
    .locals 5

    .line 1
    iget-object v0, p0, Ljf2;->i:Lsf2;

    .line 2
    .line 3
    iget-object v0, v0, Lsf2;->g:Lmf2;

    .line 4
    .line 5
    monitor-enter v0

    .line 6
    int-to-long v1, p1

    .line 7
    const-wide/16 v3, 0x3e8

    .line 8
    .line 9
    mul-long/2addr v1, v3

    .line 10
    :try_start_0
    iput-wide v1, v0, Lmf2;->c:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    .line 12
    monitor-exit v0

    .line 13
    return-void

    .line 14
    :catchall_0
    move-exception p1

    .line 15
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 16
    throw p1
.end method

.method public final i(I)V
    .locals 5

    .line 1
    iget-object v0, p0, Ljf2;->i:Lsf2;

    .line 2
    .line 3
    iget-object v0, v0, Lsf2;->g:Lmf2;

    .line 4
    .line 5
    monitor-enter v0

    .line 6
    int-to-long v1, p1

    .line 7
    const-wide/16 v3, 0x3e8

    .line 8
    .line 9
    mul-long/2addr v1, v3

    .line 10
    :try_start_0
    iput-wide v1, v0, Lmf2;->b:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    .line 12
    monitor-exit v0

    .line 13
    return-void

    .line 14
    :catchall_0
    move-exception p1

    .line 15
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 16
    throw p1
.end method

.method public final j(I)V
    .locals 5

    .line 1
    iget-object v0, p0, Ljf2;->i:Lsf2;

    .line 2
    .line 3
    iget-object v0, v0, Lsf2;->g:Lmf2;

    .line 4
    .line 5
    monitor-enter v0

    .line 6
    int-to-long v1, p1

    .line 7
    const-wide/16 v3, 0x3e8

    .line 8
    .line 9
    mul-long/2addr v1, v3

    .line 10
    :try_start_0
    iput-wide v1, v0, Lmf2;->d:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    .line 12
    monitor-exit v0

    .line 13
    return-void

    .line 14
    :catchall_0
    move-exception p1

    .line 15
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 16
    throw p1
.end method

.method public final k(I)V
    .locals 5

    .line 1
    iget-object v0, p0, Ljf2;->i:Lsf2;

    .line 2
    .line 3
    iget-object v0, v0, Lsf2;->g:Lmf2;

    .line 4
    .line 5
    monitor-enter v0

    .line 6
    int-to-long v1, p1

    .line 7
    const-wide/16 v3, 0x3e8

    .line 8
    .line 9
    mul-long/2addr v1, v3

    .line 10
    :try_start_0
    iput-wide v1, v0, Lmf2;->e:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    .line 12
    monitor-exit v0

    .line 13
    return-void

    .line 14
    :catchall_0
    move-exception p1

    .line 15
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 16
    throw p1
.end method

.method public final l()V
    .locals 4

    .line 1
    monitor-enter p0

    .line 2
    const/4 v0, 0x1

    .line 3
    :try_start_0
    iput-boolean v0, p0, Ljf2;->k:Z

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->notify()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Ljf2;->a()V

    .line 9
    .line 10
    .line 11
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    iget-object v0, p0, Ljf2;->j:Ljava/lang/String;

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-static {v0}, Ljf2;->o(Ljava/lang/String;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    iget-object v1, p0, Ljf2;->j:Ljava/lang/String;

    .line 21
    .line 22
    const-string v2, "externalAbort"

    .line 23
    .line 24
    const-string v3, "Programmatic precache abort."

    .line 25
    .line 26
    invoke-virtual {p0, v1, v0, v2, v3}, Lff2;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    :cond_0
    return-void

    .line 30
    :catchall_0
    move-exception v0

    .line 31
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 32
    throw v0
.end method

.method public final t()V
    .locals 1

    .line 1
    const-string v0, "Precache onRenderedFirstFrame"

    .line 2
    .line 3
    invoke-static {v0}, Lgi2;->i0(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final u(Ljava/io/IOException;)V
    .locals 2

    .line 1
    const/4 v0, 0x5

    .line 2
    invoke-static {v0}, Lgi2;->q0(I)Z

    .line 3
    .line 4
    .line 5
    sget-object v0, Lhg4;->C:Lhg4;

    .line 6
    .line 7
    iget-object v0, v0, Lhg4;->h:Lgd2;

    .line 8
    .line 9
    const-string v1, "VideoStreamExoPlayerCache.onException"

    .line 10
    .line 11
    invoke-virtual {v0, v1, p1}, Lgd2;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final v(JZ)V
    .locals 7

    .line 1
    iget-object v0, p0, Lff2;->h:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    move-object v2, v0

    .line 8
    check-cast v2, Lag2;

    .line 9
    .line 10
    if-eqz v2, :cond_0

    .line 11
    .line 12
    sget-object v0, Lmd2;->f:Lld2;

    .line 13
    .line 14
    new-instance v1, Lre2;

    .line 15
    .line 16
    const/4 v6, 0x1

    .line 17
    move-wide v4, p1

    .line 18
    move v3, p3

    .line 19
    invoke-direct/range {v1 .. v6}, Lre2;-><init>(Ljava/lang/Object;ZJI)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v1}, Lld2;->execute(Ljava/lang/Runnable;)V

    .line 23
    .line 24
    .line 25
    :cond_0
    return-void
.end method

.method public final w(II)V
    .locals 0

    .line 1
    return-void
.end method

.method public final x(Ljava/lang/String;Ljava/lang/Exception;)V
    .locals 1

    .line 1
    const/4 p1, 0x5

    .line 2
    invoke-static {p1}, Lgi2;->q0(I)Z

    .line 3
    .line 4
    .line 5
    sget-object p1, Lhg4;->C:Lhg4;

    .line 6
    .line 7
    iget-object p1, p1, Lhg4;->h:Lgd2;

    .line 8
    .line 9
    const-string v0, "VideoStreamExoPlayerCache.onError"

    .line 10
    .line 11
    invoke-virtual {p1, v0, p2}, Lgd2;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method
