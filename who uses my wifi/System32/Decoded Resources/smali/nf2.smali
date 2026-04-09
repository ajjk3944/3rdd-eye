.class public final Lnf2;
.super Lzd3;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final j:Landroid/content/Context;

.field public final k:Lth3;

.field public final l:Lvg0;

.field public final m:Ljava/lang/String;

.field public final n:I

.field public final o:Z

.field public p:Ljava/io/InputStream;

.field public q:Z

.field public r:Landroid/net/Uri;

.field public volatile s:Lww1;

.field public t:Z

.field public u:Z

.field public v:Z

.field public w:Z

.field public x:J

.field public y:Ln70;

.field public final z:Ljava/util/concurrent/atomic/AtomicLong;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lth3;Ljava/lang/String;ILws3;Lvg0;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Lzd3;-><init>(Z)V

    .line 3
    .line 4
    .line 5
    iput-object p1, p0, Lnf2;->j:Landroid/content/Context;

    .line 6
    .line 7
    iput-object p2, p0, Lnf2;->k:Lth3;

    .line 8
    .line 9
    iput-object p6, p0, Lnf2;->l:Lvg0;

    .line 10
    .line 11
    iput-object p3, p0, Lnf2;->m:Ljava/lang/String;

    .line 12
    .line 13
    iput p4, p0, Lnf2;->n:I

    .line 14
    .line 15
    iput-boolean v0, p0, Lnf2;->t:Z

    .line 16
    .line 17
    iput-boolean v0, p0, Lnf2;->u:Z

    .line 18
    .line 19
    iput-boolean v0, p0, Lnf2;->v:Z

    .line 20
    .line 21
    iput-boolean v0, p0, Lnf2;->w:Z

    .line 22
    .line 23
    const-wide/16 p1, 0x0

    .line 24
    .line 25
    iput-wide p1, p0, Lnf2;->x:J

    .line 26
    .line 27
    new-instance p1, Ljava/util/concurrent/atomic/AtomicLong;

    .line 28
    .line 29
    const-wide/16 p2, -0x1

    .line 30
    .line 31
    invoke-direct {p1, p2, p3}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    .line 32
    .line 33
    .line 34
    iput-object p1, p0, Lnf2;->z:Ljava/util/concurrent/atomic/AtomicLong;

    .line 35
    .line 36
    const/4 p1, 0x0

    .line 37
    iput-object p1, p0, Lnf2;->y:Ln70;

    .line 38
    .line 39
    sget-object p1, Lmz1;->Y1:Liz1;

    .line 40
    .line 41
    sget-object p2, Ltw1;->e:Ltw1;

    .line 42
    .line 43
    iget-object p2, p2, Ltw1;->c:Lkz1;

    .line 44
    .line 45
    invoke-virtual {p2, p1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    check-cast p1, Ljava/lang/Boolean;

    .line 50
    .line 51
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 52
    .line 53
    .line 54
    move-result p1

    .line 55
    iput-boolean p1, p0, Lnf2;->o:Z

    .line 56
    .line 57
    invoke-virtual {p0, p5}, Lzd3;->b(Lws3;)V

    .line 58
    .line 59
    .line 60
    return-void
.end method


# virtual methods
.method public final a(Lij3;)J
    .locals 18

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    const-string v2, ""

    .line 6
    .line 7
    const-string v3, "ms"

    .line 8
    .line 9
    const-string v4, "Cache connection took "

    .line 10
    .line 11
    iget-boolean v5, v1, Lnf2;->q:Z

    .line 12
    .line 13
    if-nez v5, :cond_10

    .line 14
    .line 15
    const/4 v5, 0x1

    .line 16
    iput-boolean v5, v1, Lnf2;->q:Z

    .line 17
    .line 18
    iget-object v6, v0, Lij3;->a:Landroid/net/Uri;

    .line 19
    .line 20
    iput-object v6, v1, Lnf2;->r:Landroid/net/Uri;

    .line 21
    .line 22
    iget-boolean v7, v1, Lnf2;->o:Z

    .line 23
    .line 24
    if-nez v7, :cond_0

    .line 25
    .line 26
    invoke-virtual/range {p0 .. p1}, Lzd3;->e(Lij3;)V

    .line 27
    .line 28
    .line 29
    :cond_0
    invoke-static {v6}, Lww1;->a(Landroid/net/Uri;)Lww1;

    .line 30
    .line 31
    .line 32
    move-result-object v6

    .line 33
    iput-object v6, v1, Lnf2;->s:Lww1;

    .line 34
    .line 35
    sget-object v6, Lmz1;->J4:Liz1;

    .line 36
    .line 37
    sget-object v8, Ltw1;->e:Ltw1;

    .line 38
    .line 39
    iget-object v9, v8, Ltw1;->c:Lkz1;

    .line 40
    .line 41
    invoke-virtual {v9, v6}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v6

    .line 45
    check-cast v6, Ljava/lang/Boolean;

    .line 46
    .line 47
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    .line 48
    .line 49
    .line 50
    move-result v6

    .line 51
    const/4 v11, 0x0

    .line 52
    if-eqz v6, :cond_a

    .line 53
    .line 54
    iget-object v6, v1, Lnf2;->s:Lww1;

    .line 55
    .line 56
    if-eqz v6, :cond_e

    .line 57
    .line 58
    iget-object v6, v1, Lnf2;->s:Lww1;

    .line 59
    .line 60
    iget-wide v12, v0, Lij3;->c:J

    .line 61
    .line 62
    iput-wide v12, v6, Lww1;->m:J

    .line 63
    .line 64
    iget-object v6, v1, Lnf2;->s:Lww1;

    .line 65
    .line 66
    iget-object v12, v1, Lnf2;->m:Ljava/lang/String;

    .line 67
    .line 68
    if-nez v12, :cond_1

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_1
    move-object v2, v12

    .line 72
    :goto_0
    iput-object v2, v6, Lww1;->n:Ljava/lang/String;

    .line 73
    .line 74
    iget-object v2, v1, Lnf2;->s:Lww1;

    .line 75
    .line 76
    iget v6, v1, Lnf2;->n:I

    .line 77
    .line 78
    iput v6, v2, Lww1;->o:I

    .line 79
    .line 80
    iget-object v2, v1, Lnf2;->s:Lww1;

    .line 81
    .line 82
    iget-boolean v2, v2, Lww1;->l:Z

    .line 83
    .line 84
    if-eqz v2, :cond_2

    .line 85
    .line 86
    sget-object v2, Lmz1;->L4:Liz1;

    .line 87
    .line 88
    iget-object v6, v8, Ltw1;->c:Lkz1;

    .line 89
    .line 90
    invoke-virtual {v6, v2}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v2

    .line 94
    check-cast v2, Ljava/lang/Long;

    .line 95
    .line 96
    goto :goto_1

    .line 97
    :cond_2
    sget-object v2, Lmz1;->K4:Liz1;

    .line 98
    .line 99
    iget-object v6, v8, Ltw1;->c:Lkz1;

    .line 100
    .line 101
    invoke-virtual {v6, v2}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v2

    .line 105
    check-cast v2, Ljava/lang/Long;

    .line 106
    .line 107
    :goto_1
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 108
    .line 109
    .line 110
    move-result-wide v12

    .line 111
    sget-object v2, Lhg4;->C:Lhg4;

    .line 112
    .line 113
    iget-object v6, v2, Lhg4;->k:Lym;

    .line 114
    .line 115
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 116
    .line 117
    .line 118
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 119
    .line 120
    .line 121
    move-result-wide v14

    .line 122
    iget-object v6, v1, Lnf2;->j:Landroid/content/Context;

    .line 123
    .line 124
    iget-object v8, v1, Lnf2;->s:Lww1;

    .line 125
    .line 126
    invoke-static {v6, v8}, Lus0;->n(Landroid/content/Context;Lww1;)Lyw1;

    .line 127
    .line 128
    .line 129
    move-result-object v6

    .line 130
    :try_start_0
    sget-object v8, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 131
    .line 132
    const-wide/16 v16, -0x1

    .line 133
    .line 134
    iget-object v9, v6, Lpd2;->f:Lwq3;

    .line 135
    .line 136
    invoke-virtual {v9, v12, v13, v8}, Lgp3;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v8

    .line 140
    check-cast v8, Lax1;
    :try_end_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 141
    .line 142
    :try_start_1
    iget-boolean v9, v8, Lax1;->b:Z

    .line 143
    .line 144
    iput-boolean v9, v1, Lnf2;->t:Z

    .line 145
    .line 146
    iget-boolean v9, v8, Lax1;->c:Z

    .line 147
    .line 148
    iput-boolean v9, v1, Lnf2;->v:Z

    .line 149
    .line 150
    iget-boolean v9, v8, Lax1;->e:Z

    .line 151
    .line 152
    iput-boolean v9, v1, Lnf2;->w:Z

    .line 153
    .line 154
    iget-wide v9, v8, Lax1;->d:J

    .line 155
    .line 156
    iput-wide v9, v1, Lnf2;->x:J

    .line 157
    .line 158
    invoke-virtual {v1}, Lnf2;->k()Z

    .line 159
    .line 160
    .line 161
    move-result v9

    .line 162
    if-nez v9, :cond_5

    .line 163
    .line 164
    iget-object v8, v8, Lax1;->a:Lzw1;

    .line 165
    .line 166
    iput-object v8, v1, Lnf2;->p:Ljava/io/InputStream;

    .line 167
    .line 168
    if-eqz v7, :cond_3

    .line 169
    .line 170
    invoke-virtual/range {p0 .. p1}, Lzd3;->e(Lij3;)V
    :try_end_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 171
    .line 172
    .line 173
    goto :goto_2

    .line 174
    :catchall_0
    move-exception v0

    .line 175
    goto/16 :goto_8

    .line 176
    .line 177
    :cond_3
    :goto_2
    iget-object v0, v2, Lhg4;->k:Lym;

    .line 178
    .line 179
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 180
    .line 181
    .line 182
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 183
    .line 184
    .line 185
    move-result-wide v6

    .line 186
    sub-long/2addr v6, v14

    .line 187
    iget-object v0, v1, Lnf2;->l:Lvg0;

    .line 188
    .line 189
    iget-object v0, v0, Lvg0;->g:Ljava/lang/Object;

    .line 190
    .line 191
    check-cast v0, Lsf2;

    .line 192
    .line 193
    iget-object v0, v0, Lsf2;->o:Lfe2;

    .line 194
    .line 195
    if-eqz v0, :cond_4

    .line 196
    .line 197
    invoke-interface {v0, v6, v7, v5}, Lfe2;->v(JZ)V

    .line 198
    .line 199
    .line 200
    :cond_4
    iput-boolean v5, v1, Lnf2;->u:Z

    .line 201
    .line 202
    invoke-static {v6, v7}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object v0

    .line 206
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 207
    .line 208
    .line 209
    move-result v0

    .line 210
    add-int/lit8 v0, v0, 0x18

    .line 211
    .line 212
    new-instance v2, Ljava/lang/StringBuilder;

    .line 213
    .line 214
    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 215
    .line 216
    .line 217
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 218
    .line 219
    .line 220
    invoke-virtual {v2, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 221
    .line 222
    .line 223
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 224
    .line 225
    .line 226
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 227
    .line 228
    .line 229
    move-result-object v0

    .line 230
    invoke-static {v0}, Lgi2;->G(Ljava/lang/String;)V

    .line 231
    .line 232
    .line 233
    return-wide v16

    .line 234
    :cond_5
    iget-object v2, v2, Lhg4;->k:Lym;

    .line 235
    .line 236
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 237
    .line 238
    .line 239
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 240
    .line 241
    .line 242
    move-result-wide v6

    .line 243
    sub-long/2addr v6, v14

    .line 244
    iget-object v2, v1, Lnf2;->l:Lvg0;

    .line 245
    .line 246
    iget-object v2, v2, Lvg0;->g:Ljava/lang/Object;

    .line 247
    .line 248
    check-cast v2, Lsf2;

    .line 249
    .line 250
    iget-object v2, v2, Lsf2;->o:Lfe2;

    .line 251
    .line 252
    if-eqz v2, :cond_6

    .line 253
    .line 254
    invoke-interface {v2, v6, v7, v5}, Lfe2;->v(JZ)V

    .line 255
    .line 256
    .line 257
    :cond_6
    iput-boolean v5, v1, Lnf2;->u:Z

    .line 258
    .line 259
    invoke-static {v6, v7}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 260
    .line 261
    .line 262
    move-result-object v2

    .line 263
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 264
    .line 265
    .line 266
    move-result v2

    .line 267
    add-int/lit8 v2, v2, 0x18

    .line 268
    .line 269
    new-instance v5, Ljava/lang/StringBuilder;

    .line 270
    .line 271
    invoke-direct {v5, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 272
    .line 273
    .line 274
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 275
    .line 276
    .line 277
    invoke-virtual {v5, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 278
    .line 279
    .line 280
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 281
    .line 282
    .line 283
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 284
    .line 285
    .line 286
    move-result-object v2

    .line 287
    :goto_3
    invoke-static {v2}, Lgi2;->G(Ljava/lang/String;)V

    .line 288
    .line 289
    .line 290
    goto/16 :goto_b

    .line 291
    .line 292
    :catch_0
    move v2, v5

    .line 293
    goto :goto_4

    .line 294
    :catch_1
    move v2, v5

    .line 295
    goto :goto_7

    .line 296
    :catchall_1
    move-exception v0

    .line 297
    move v5, v11

    .line 298
    goto/16 :goto_8

    .line 299
    .line 300
    :catch_2
    move v2, v11

    .line 301
    :goto_4
    :try_start_2
    invoke-virtual {v6, v5}, Lyw1;->cancel(Z)Z

    .line 302
    .line 303
    .line 304
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 305
    .line 306
    .line 307
    move-result-object v5

    .line 308
    invoke-virtual {v5}, Ljava/lang/Thread;->interrupt()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 309
    .line 310
    .line 311
    sget-object v5, Lhg4;->C:Lhg4;

    .line 312
    .line 313
    iget-object v5, v5, Lhg4;->k:Lym;

    .line 314
    .line 315
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 316
    .line 317
    .line 318
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 319
    .line 320
    .line 321
    move-result-wide v5

    .line 322
    sub-long/2addr v5, v14

    .line 323
    iget-object v7, v1, Lnf2;->l:Lvg0;

    .line 324
    .line 325
    iget-object v7, v7, Lvg0;->g:Ljava/lang/Object;

    .line 326
    .line 327
    check-cast v7, Lsf2;

    .line 328
    .line 329
    iget-object v7, v7, Lsf2;->o:Lfe2;

    .line 330
    .line 331
    if-eqz v7, :cond_7

    .line 332
    .line 333
    invoke-interface {v7, v5, v6, v2}, Lfe2;->v(JZ)V

    .line 334
    .line 335
    .line 336
    :cond_7
    iput-boolean v2, v1, Lnf2;->u:Z

    .line 337
    .line 338
    invoke-static {v5, v6}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 339
    .line 340
    .line 341
    move-result-object v2

    .line 342
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 343
    .line 344
    .line 345
    move-result v2

    .line 346
    add-int/lit8 v2, v2, 0x18

    .line 347
    .line 348
    new-instance v7, Ljava/lang/StringBuilder;

    .line 349
    .line 350
    invoke-direct {v7, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 351
    .line 352
    .line 353
    :goto_5
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 354
    .line 355
    .line 356
    invoke-virtual {v7, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 357
    .line 358
    .line 359
    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 360
    .line 361
    .line 362
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 363
    .line 364
    .line 365
    move-result-object v2

    .line 366
    goto :goto_3

    .line 367
    :goto_6
    move v5, v2

    .line 368
    goto :goto_8

    .line 369
    :catch_3
    move v2, v11

    .line 370
    :goto_7
    :try_start_3
    invoke-virtual {v6, v5}, Lyw1;->cancel(Z)Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 371
    .line 372
    .line 373
    sget-object v5, Lhg4;->C:Lhg4;

    .line 374
    .line 375
    iget-object v5, v5, Lhg4;->k:Lym;

    .line 376
    .line 377
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 378
    .line 379
    .line 380
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 381
    .line 382
    .line 383
    move-result-wide v5

    .line 384
    sub-long/2addr v5, v14

    .line 385
    iget-object v7, v1, Lnf2;->l:Lvg0;

    .line 386
    .line 387
    iget-object v7, v7, Lvg0;->g:Ljava/lang/Object;

    .line 388
    .line 389
    check-cast v7, Lsf2;

    .line 390
    .line 391
    iget-object v7, v7, Lsf2;->o:Lfe2;

    .line 392
    .line 393
    if-eqz v7, :cond_8

    .line 394
    .line 395
    invoke-interface {v7, v5, v6, v2}, Lfe2;->v(JZ)V

    .line 396
    .line 397
    .line 398
    :cond_8
    iput-boolean v2, v1, Lnf2;->u:Z

    .line 399
    .line 400
    invoke-static {v5, v6}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 401
    .line 402
    .line 403
    move-result-object v2

    .line 404
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 405
    .line 406
    .line 407
    move-result v2

    .line 408
    add-int/lit8 v2, v2, 0x18

    .line 409
    .line 410
    new-instance v7, Ljava/lang/StringBuilder;

    .line 411
    .line 412
    invoke-direct {v7, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 413
    .line 414
    .line 415
    goto :goto_5

    .line 416
    :catchall_2
    move-exception v0

    .line 417
    goto :goto_6

    .line 418
    :goto_8
    sget-object v2, Lhg4;->C:Lhg4;

    .line 419
    .line 420
    iget-object v2, v2, Lhg4;->k:Lym;

    .line 421
    .line 422
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 423
    .line 424
    .line 425
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 426
    .line 427
    .line 428
    move-result-wide v6

    .line 429
    sub-long/2addr v6, v14

    .line 430
    iget-object v2, v1, Lnf2;->l:Lvg0;

    .line 431
    .line 432
    iget-object v2, v2, Lvg0;->g:Ljava/lang/Object;

    .line 433
    .line 434
    check-cast v2, Lsf2;

    .line 435
    .line 436
    iget-object v2, v2, Lsf2;->o:Lfe2;

    .line 437
    .line 438
    if-eqz v2, :cond_9

    .line 439
    .line 440
    invoke-interface {v2, v6, v7, v5}, Lfe2;->v(JZ)V

    .line 441
    .line 442
    .line 443
    :cond_9
    iput-boolean v5, v1, Lnf2;->u:Z

    .line 444
    .line 445
    invoke-static {v6, v7}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 446
    .line 447
    .line 448
    move-result-object v2

    .line 449
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 450
    .line 451
    .line 452
    move-result v2

    .line 453
    add-int/lit8 v2, v2, 0x18

    .line 454
    .line 455
    new-instance v5, Ljava/lang/StringBuilder;

    .line 456
    .line 457
    invoke-direct {v5, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 458
    .line 459
    .line 460
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 461
    .line 462
    .line 463
    invoke-virtual {v5, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 464
    .line 465
    .line 466
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 467
    .line 468
    .line 469
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 470
    .line 471
    .line 472
    move-result-object v2

    .line 473
    invoke-static {v2}, Lgi2;->G(Ljava/lang/String;)V

    .line 474
    .line 475
    .line 476
    throw v0

    .line 477
    :cond_a
    const-wide/16 v16, -0x1

    .line 478
    .line 479
    iget-object v3, v1, Lnf2;->s:Lww1;

    .line 480
    .line 481
    if-eqz v3, :cond_c

    .line 482
    .line 483
    iget-object v3, v1, Lnf2;->s:Lww1;

    .line 484
    .line 485
    iget-wide v6, v0, Lij3;->c:J

    .line 486
    .line 487
    iput-wide v6, v3, Lww1;->m:J

    .line 488
    .line 489
    iget-object v3, v1, Lnf2;->s:Lww1;

    .line 490
    .line 491
    iget-object v4, v1, Lnf2;->m:Ljava/lang/String;

    .line 492
    .line 493
    if-nez v4, :cond_b

    .line 494
    .line 495
    goto :goto_9

    .line 496
    :cond_b
    move-object v2, v4

    .line 497
    :goto_9
    iput-object v2, v3, Lww1;->n:Ljava/lang/String;

    .line 498
    .line 499
    iget-object v2, v1, Lnf2;->s:Lww1;

    .line 500
    .line 501
    iget v3, v1, Lnf2;->n:I

    .line 502
    .line 503
    iput v3, v2, Lww1;->o:I

    .line 504
    .line 505
    sget-object v2, Lhg4;->C:Lhg4;

    .line 506
    .line 507
    iget-object v2, v2, Lhg4;->j:Lbu1;

    .line 508
    .line 509
    iget-object v3, v1, Lnf2;->s:Lww1;

    .line 510
    .line 511
    invoke-virtual {v2, v3}, Lbu1;->t(Lww1;)Luw1;

    .line 512
    .line 513
    .line 514
    move-result-object v2

    .line 515
    goto :goto_a

    .line 516
    :cond_c
    const/4 v2, 0x0

    .line 517
    :goto_a
    if-eqz v2, :cond_e

    .line 518
    .line 519
    invoke-virtual {v2}, Luw1;->a()Z

    .line 520
    .line 521
    .line 522
    move-result v3

    .line 523
    if-eqz v3, :cond_e

    .line 524
    .line 525
    monitor-enter v2

    .line 526
    :try_start_4
    iget-boolean v3, v2, Luw1;->g:Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 527
    .line 528
    monitor-exit v2

    .line 529
    iput-boolean v3, v1, Lnf2;->t:Z

    .line 530
    .line 531
    invoke-virtual {v2}, Luw1;->d()Z

    .line 532
    .line 533
    .line 534
    move-result v3

    .line 535
    iput-boolean v3, v1, Lnf2;->v:Z

    .line 536
    .line 537
    invoke-virtual {v2}, Luw1;->c()Z

    .line 538
    .line 539
    .line 540
    move-result v3

    .line 541
    iput-boolean v3, v1, Lnf2;->w:Z

    .line 542
    .line 543
    monitor-enter v2

    .line 544
    :try_start_5
    iget-wide v3, v2, Luw1;->i:J
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 545
    .line 546
    monitor-exit v2

    .line 547
    iput-wide v3, v1, Lnf2;->x:J

    .line 548
    .line 549
    iput-boolean v5, v1, Lnf2;->u:Z

    .line 550
    .line 551
    invoke-virtual {v1}, Lnf2;->k()Z

    .line 552
    .line 553
    .line 554
    move-result v3

    .line 555
    if-nez v3, :cond_e

    .line 556
    .line 557
    invoke-virtual {v2}, Luw1;->b()Landroid/os/ParcelFileDescriptor$AutoCloseInputStream;

    .line 558
    .line 559
    .line 560
    move-result-object v2

    .line 561
    iput-object v2, v1, Lnf2;->p:Ljava/io/InputStream;

    .line 562
    .line 563
    iget-boolean v2, v1, Lnf2;->o:Z

    .line 564
    .line 565
    if-eqz v2, :cond_d

    .line 566
    .line 567
    invoke-virtual/range {p0 .. p1}, Lzd3;->e(Lij3;)V

    .line 568
    .line 569
    .line 570
    :cond_d
    return-wide v16

    .line 571
    :catchall_3
    move-exception v0

    .line 572
    :try_start_6
    monitor-exit v2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 573
    throw v0

    .line 574
    :catchall_4
    move-exception v0

    .line 575
    :try_start_7
    monitor-exit v2
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    .line 576
    throw v0

    .line 577
    :cond_e
    :goto_b
    iput-boolean v11, v1, Lnf2;->u:Z

    .line 578
    .line 579
    iget-object v2, v1, Lnf2;->s:Lww1;

    .line 580
    .line 581
    if-eqz v2, :cond_f

    .line 582
    .line 583
    iget-object v5, v0, Lij3;->b:Ljava/util/Map;

    .line 584
    .line 585
    iget-wide v6, v0, Lij3;->c:J

    .line 586
    .line 587
    iget-wide v8, v0, Lij3;->d:J

    .line 588
    .line 589
    iget v10, v0, Lij3;->e:I

    .line 590
    .line 591
    iget-object v0, v1, Lnf2;->s:Lww1;

    .line 592
    .line 593
    iget-object v0, v0, Lww1;->f:Ljava/lang/String;

    .line 594
    .line 595
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 596
    .line 597
    .line 598
    move-result-object v4

    .line 599
    const-string v0, "The uri must be set."

    .line 600
    .line 601
    invoke-static {v4, v0}, Lzt0;->d0(Ljava/lang/Object;Ljava/lang/String;)V

    .line 602
    .line 603
    .line 604
    new-instance v3, Lij3;

    .line 605
    .line 606
    invoke-direct/range {v3 .. v10}, Lij3;-><init>(Landroid/net/Uri;Ljava/util/Map;JJI)V

    .line 607
    .line 608
    .line 609
    move-object v0, v3

    .line 610
    :cond_f
    iget-object v2, v1, Lnf2;->k:Lth3;

    .line 611
    .line 612
    invoke-interface {v2, v0}, Lth3;->a(Lij3;)J

    .line 613
    .line 614
    .line 615
    move-result-wide v2

    .line 616
    return-wide v2

    .line 617
    :cond_10
    new-instance v0, Ljava/io/IOException;

    .line 618
    .line 619
    const-string v2, "Attempt to open an already open GcacheDataSource."

    .line 620
    .line 621
    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 622
    .line 623
    .line 624
    throw v0
.end method

.method public final d([BII)I
    .locals 1

    .line 1
    iget-boolean v0, p0, Lnf2;->q:Z

    .line 2
    .line 3
    if-eqz v0, :cond_3

    .line 4
    .line 5
    iget-object v0, p0, Lnf2;->p:Ljava/io/InputStream;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0, p1, p2, p3}, Ljava/io/InputStream;->read([BII)I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    iget-object v0, p0, Lnf2;->k:Lth3;

    .line 15
    .line 16
    invoke-interface {v0, p1, p2, p3}, Lua4;->d([BII)I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    :goto_0
    iget-boolean p2, p0, Lnf2;->o:Z

    .line 21
    .line 22
    if-eqz p2, :cond_2

    .line 23
    .line 24
    iget-object p2, p0, Lnf2;->p:Ljava/io/InputStream;

    .line 25
    .line 26
    if-eqz p2, :cond_1

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_1
    return p1

    .line 30
    :cond_2
    :goto_1
    invoke-virtual {p0, p1}, Lzd3;->f(I)V

    .line 31
    .line 32
    .line 33
    return p1

    .line 34
    :cond_3
    new-instance p1, Ljava/io/IOException;

    .line 35
    .line 36
    const-string p2, "Attempt to read closed GcacheDataSource."

    .line 37
    .line 38
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    throw p1
.end method

.method public final h()Landroid/net/Uri;
    .locals 1

    .line 1
    iget-object v0, p0, Lnf2;->r:Landroid/net/Uri;

    .line 2
    .line 3
    return-object v0
.end method

.method public final k()Z
    .locals 3

    .line 1
    iget-boolean v0, p0, Lnf2;->o:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    sget-object v0, Lmz1;->M4:Liz1;

    .line 7
    .line 8
    sget-object v1, Ltw1;->e:Ltw1;

    .line 9
    .line 10
    iget-object v2, v1, Ltw1;->c:Lkz1;

    .line 11
    .line 12
    invoke-virtual {v2, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    check-cast v0, Ljava/lang/Boolean;

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    iget-boolean v0, p0, Lnf2;->v:Z

    .line 25
    .line 26
    if-eqz v0, :cond_2

    .line 27
    .line 28
    :cond_1
    sget-object v0, Lmz1;->N4:Liz1;

    .line 29
    .line 30
    iget-object v1, v1, Ltw1;->c:Lkz1;

    .line 31
    .line 32
    invoke-virtual {v1, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    check-cast v0, Ljava/lang/Boolean;

    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-eqz v0, :cond_3

    .line 43
    .line 44
    iget-boolean v0, p0, Lnf2;->w:Z

    .line 45
    .line 46
    if-nez v0, :cond_3

    .line 47
    .line 48
    :cond_2
    const/4 v0, 0x1

    .line 49
    return v0

    .line 50
    :cond_3
    :goto_0
    const/4 v0, 0x0

    .line 51
    return v0
.end method

.method public final l()V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lnf2;->q:Z

    .line 2
    .line 3
    if-eqz v0, :cond_4

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    iput-boolean v0, p0, Lnf2;->q:Z

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    iput-object v1, p0, Lnf2;->r:Landroid/net/Uri;

    .line 10
    .line 11
    iget-boolean v2, p0, Lnf2;->o:Z

    .line 12
    .line 13
    const/4 v3, 0x1

    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    iget-object v2, p0, Lnf2;->p:Ljava/io/InputStream;

    .line 17
    .line 18
    if-eqz v2, :cond_1

    .line 19
    .line 20
    :cond_0
    move v0, v3

    .line 21
    :cond_1
    iget-object v2, p0, Lnf2;->p:Ljava/io/InputStream;

    .line 22
    .line 23
    if-eqz v2, :cond_2

    .line 24
    .line 25
    invoke-static {v2}, Lg82;->c(Ljava/io/Closeable;)V

    .line 26
    .line 27
    .line 28
    iput-object v1, p0, Lnf2;->p:Ljava/io/InputStream;

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_2
    iget-object v1, p0, Lnf2;->k:Lth3;

    .line 32
    .line 33
    invoke-interface {v1}, Lth3;->l()V

    .line 34
    .line 35
    .line 36
    :goto_0
    if-eqz v0, :cond_3

    .line 37
    .line 38
    invoke-virtual {p0}, Lzd3;->j()V

    .line 39
    .line 40
    .line 41
    :cond_3
    return-void

    .line 42
    :cond_4
    new-instance v0, Ljava/io/IOException;

    .line 43
    .line 44
    const-string v1, "Attempt to close an already closed GcacheDataSource."

    .line 45
    .line 46
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    throw v0
.end method
