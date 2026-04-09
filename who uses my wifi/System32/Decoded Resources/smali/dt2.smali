.class public final synthetic Ldt2;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lyp3;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lxe4;

.field public final synthetic c:La83;

.field public final synthetic d:Lc83;

.field public final synthetic e:Lsu1;

.field public final synthetic f:Lsb2;

.field public final synthetic g:Ljava/lang/String;

.field public final synthetic h:Ljava/lang/String;

.field public final synthetic i:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Lxe4;La83;Lc83;Lsu1;Lsb2;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 0

    .line 1
    iput p9, p0, Ldt2;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Ldt2;->i:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p2, p0, Ldt2;->b:Lxe4;

    .line 6
    .line 7
    iput-object p3, p0, Ldt2;->c:La83;

    .line 8
    .line 9
    iput-object p4, p0, Ldt2;->d:Lc83;

    .line 10
    .line 11
    iput-object p5, p0, Ldt2;->e:Lsu1;

    .line 12
    .line 13
    iput-object p6, p0, Ldt2;->f:Lsb2;

    .line 14
    .line 15
    iput-object p7, p0, Ldt2;->g:Ljava/lang/String;

    .line 16
    .line 17
    iput-object p8, p0, Ldt2;->h:Ljava/lang/String;

    .line 18
    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Object;)Ln70;
    .locals 32

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget v0, v1, Ldt2;->a:I

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v0, v1, Ldt2;->i:Ljava/lang/Object;

    .line 9
    .line 10
    move-object v3, v0

    .line 11
    check-cast v3, Lmt2;

    .line 12
    .line 13
    iget-object v0, v1, Ldt2;->b:Lxe4;

    .line 14
    .line 15
    iget-object v2, v1, Ldt2;->c:La83;

    .line 16
    .line 17
    iget-object v4, v1, Ldt2;->d:Lc83;

    .line 18
    .line 19
    iget-object v5, v1, Ldt2;->e:Lsu1;

    .line 20
    .line 21
    iget-object v6, v1, Ldt2;->f:Lsb2;

    .line 22
    .line 23
    iget-object v8, v1, Ldt2;->g:Ljava/lang/String;

    .line 24
    .line 25
    iget-object v9, v1, Ldt2;->h:Ljava/lang/String;

    .line 26
    .line 27
    iget-object v7, v3, Lmt2;->c:Lpu2;

    .line 28
    .line 29
    invoke-virtual {v7, v0, v2, v4}, Lpu2;->a(Lxe4;La83;Lc83;)Lag2;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    new-instance v0, Lyw1;

    .line 34
    .line 35
    invoke-direct {v0, v4}, Lyw1;-><init>(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    iget-object v2, v3, Lmt2;->a:Ll83;

    .line 39
    .line 40
    iget-object v2, v2, Ll83;->b:Lf52;

    .line 41
    .line 42
    if-eqz v2, :cond_0

    .line 43
    .line 44
    invoke-virtual {v3, v4, v5, v6}, Lmt2;->a(Lag2;Lsu1;Lsb2;)V

    .line 45
    .line 46
    .line 47
    new-instance v2, Lzq;

    .line 48
    .line 49
    const/4 v5, 0x5

    .line 50
    const/4 v6, 0x0

    .line 51
    invoke-direct {v2, v5, v6, v6}, Lzq;-><init>(III)V

    .line 52
    .line 53
    .line 54
    invoke-interface {v4, v2}, Lag2;->Z(Lzq;)V

    .line 55
    .line 56
    .line 57
    goto/16 :goto_2

    .line 58
    .line 59
    :cond_0
    iget-object v2, v3, Lmt2;->d:Ldu2;

    .line 60
    .line 61
    iget-object v11, v2, Ldu2;->a:Lbu2;

    .line 62
    .line 63
    invoke-interface {v4}, Lag2;->e0()Lsg2;

    .line 64
    .line 65
    .line 66
    move-result-object v10

    .line 67
    sget-object v2, Lmz1;->pe:Liz1;

    .line 68
    .line 69
    sget-object v7, Ltw1;->e:Ltw1;

    .line 70
    .line 71
    iget-object v12, v7, Ltw1;->c:Lkz1;

    .line 72
    .line 73
    invoke-virtual {v12, v2}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v12

    .line 77
    check-cast v12, Ljava/lang/Boolean;

    .line 78
    .line 79
    invoke-virtual {v12}, Ljava/lang/Boolean;->booleanValue()Z

    .line 80
    .line 81
    .line 82
    move-result v12

    .line 83
    const/4 v13, 0x0

    .line 84
    if-nez v12, :cond_1

    .line 85
    .line 86
    iget-object v5, v3, Lmt2;->e:Landroid/content/Context;

    .line 87
    .line 88
    new-instance v12, Lsu1;

    .line 89
    .line 90
    invoke-direct {v12, v5, v13}, Lsu1;-><init>(Landroid/content/Context;Lsb2;)V

    .line 91
    .line 92
    .line 93
    move-object/from16 v18, v12

    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_1
    move-object/from16 v18, v5

    .line 97
    .line 98
    :goto_0
    iget-object v5, v7, Ltw1;->c:Lkz1;

    .line 99
    .line 100
    invoke-virtual {v5, v2}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    check-cast v2, Ljava/lang/Boolean;

    .line 105
    .line 106
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 107
    .line 108
    .line 109
    move-result v2

    .line 110
    const/4 v5, 0x1

    .line 111
    if-eq v5, v2, :cond_2

    .line 112
    .line 113
    move-object/from16 v20, v13

    .line 114
    .line 115
    goto :goto_1

    .line 116
    :cond_2
    move-object/from16 v20, v6

    .line 117
    .line 118
    :goto_1
    iget-object v2, v3, Lmt2;->h:Ljz2;

    .line 119
    .line 120
    iget-object v5, v3, Lmt2;->g:Leb3;

    .line 121
    .line 122
    iget-object v6, v3, Lmt2;->f:Lmv2;

    .line 123
    .line 124
    iget-object v7, v3, Lmt2;->j:Lxv2;

    .line 125
    .line 126
    const/16 v31, 0x0

    .line 127
    .line 128
    const/16 v16, 0x0

    .line 129
    .line 130
    const/16 v17, 0x0

    .line 131
    .line 132
    const/16 v19, 0x0

    .line 133
    .line 134
    const/16 v24, 0x0

    .line 135
    .line 136
    const/16 v26, 0x0

    .line 137
    .line 138
    const/16 v27, 0x0

    .line 139
    .line 140
    const/16 v28, 0x0

    .line 141
    .line 142
    const/16 v29, 0x0

    .line 143
    .line 144
    move-object v12, v11

    .line 145
    move-object v13, v11

    .line 146
    move-object v14, v11

    .line 147
    move-object v15, v11

    .line 148
    move-object/from16 v25, v11

    .line 149
    .line 150
    move-object/from16 v21, v2

    .line 151
    .line 152
    move-object/from16 v22, v5

    .line 153
    .line 154
    move-object/from16 v23, v6

    .line 155
    .line 156
    move-object/from16 v30, v7

    .line 157
    .line 158
    invoke-virtual/range {v10 .. v31}, Lsg2;->p(Lfd1;Ll32;Lye4;Lm32;Lkf1;ZLe42;Lsu1;Lof3;Lsb2;Ljz2;Leb3;Lmv2;Lz32;Lxp2;Lk32;Lk32;Lz32;Lgj2;Lxv2;Lim2;)V

    .line 159
    .line 160
    .line 161
    invoke-static {v4}, Lmt2;->b(Lag2;)V

    .line 162
    .line 163
    .line 164
    :goto_2
    invoke-interface {v4}, Lag2;->e0()Lsg2;

    .line 165
    .line 166
    .line 167
    move-result-object v10

    .line 168
    new-instance v2, Lt83;

    .line 169
    .line 170
    const/16 v6, 0x15

    .line 171
    .line 172
    const/4 v7, 0x0

    .line 173
    move-object v5, v0

    .line 174
    invoke-direct/range {v2 .. v7}, Lt83;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 175
    .line 176
    .line 177
    iput-object v2, v10, Lsg2;->l:Lug2;

    .line 178
    .line 179
    invoke-interface {v4, v8, v9}, Lag2;->J0(Ljava/lang/String;Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    return-object v5

    .line 183
    :pswitch_0
    iget-object v0, v1, Ldt2;->i:Ljava/lang/Object;

    .line 184
    .line 185
    check-cast v0, Lft2;

    .line 186
    .line 187
    iget-object v2, v1, Ldt2;->b:Lxe4;

    .line 188
    .line 189
    iget-object v3, v1, Ldt2;->c:La83;

    .line 190
    .line 191
    iget-object v4, v1, Ldt2;->d:Lc83;

    .line 192
    .line 193
    iget-object v5, v1, Ldt2;->e:Lsu1;

    .line 194
    .line 195
    iget-object v6, v1, Ldt2;->f:Lsb2;

    .line 196
    .line 197
    iget-object v7, v1, Ldt2;->g:Ljava/lang/String;

    .line 198
    .line 199
    iget-object v8, v1, Ldt2;->h:Ljava/lang/String;

    .line 200
    .line 201
    iget-object v9, v0, Lft2;->j:Lpu2;

    .line 202
    .line 203
    invoke-virtual {v9, v2, v3, v4}, Lpu2;->a(Lxe4;La83;Lc83;)Lag2;

    .line 204
    .line 205
    .line 206
    move-result-object v2

    .line 207
    new-instance v3, Lyw1;

    .line 208
    .line 209
    invoke-direct {v3, v2}, Lyw1;-><init>(Ljava/lang/Object;)V

    .line 210
    .line 211
    .line 212
    iget-object v4, v0, Lft2;->l:Ldu2;

    .line 213
    .line 214
    iget-object v10, v4, Ldu2;->a:Lbu2;

    .line 215
    .line 216
    invoke-interface {v2}, Lag2;->e0()Lsg2;

    .line 217
    .line 218
    .line 219
    move-result-object v9

    .line 220
    sget-object v4, Lmz1;->pe:Liz1;

    .line 221
    .line 222
    sget-object v11, Ltw1;->e:Ltw1;

    .line 223
    .line 224
    iget-object v12, v11, Ltw1;->c:Lkz1;

    .line 225
    .line 226
    invoke-virtual {v12, v4}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 227
    .line 228
    .line 229
    move-result-object v12

    .line 230
    check-cast v12, Ljava/lang/Boolean;

    .line 231
    .line 232
    invoke-virtual {v12}, Ljava/lang/Boolean;->booleanValue()Z

    .line 233
    .line 234
    .line 235
    move-result v12

    .line 236
    const/4 v13, 0x0

    .line 237
    if-nez v12, :cond_3

    .line 238
    .line 239
    iget-object v5, v0, Lft2;->a:Landroid/content/Context;

    .line 240
    .line 241
    new-instance v12, Lsu1;

    .line 242
    .line 243
    invoke-direct {v12, v5, v13}, Lsu1;-><init>(Landroid/content/Context;Lsb2;)V

    .line 244
    .line 245
    .line 246
    move-object/from16 v17, v12

    .line 247
    .line 248
    goto :goto_3

    .line 249
    :cond_3
    move-object/from16 v17, v5

    .line 250
    .line 251
    :goto_3
    iget-object v5, v11, Ltw1;->c:Lkz1;

    .line 252
    .line 253
    invoke-virtual {v5, v4}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    move-result-object v4

    .line 257
    check-cast v4, Ljava/lang/Boolean;

    .line 258
    .line 259
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 260
    .line 261
    .line 262
    move-result v4

    .line 263
    const/4 v5, 0x1

    .line 264
    if-eq v5, v4, :cond_4

    .line 265
    .line 266
    move-object/from16 v19, v13

    .line 267
    .line 268
    goto :goto_4

    .line 269
    :cond_4
    move-object/from16 v19, v6

    .line 270
    .line 271
    :goto_4
    iget-object v4, v0, Lft2;->o:Ljz2;

    .line 272
    .line 273
    iget-object v6, v0, Lft2;->n:Leb3;

    .line 274
    .line 275
    iget-object v12, v0, Lft2;->m:Lmv2;

    .line 276
    .line 277
    const/16 v29, 0x0

    .line 278
    .line 279
    const/16 v30, 0x0

    .line 280
    .line 281
    const/4 v15, 0x0

    .line 282
    const/16 v16, 0x0

    .line 283
    .line 284
    const/16 v18, 0x0

    .line 285
    .line 286
    const/16 v23, 0x0

    .line 287
    .line 288
    const/16 v25, 0x0

    .line 289
    .line 290
    const/16 v26, 0x0

    .line 291
    .line 292
    const/16 v27, 0x0

    .line 293
    .line 294
    const/16 v28, 0x0

    .line 295
    .line 296
    move-object v13, v11

    .line 297
    move-object v11, v10

    .line 298
    move-object/from16 v22, v12

    .line 299
    .line 300
    move-object v12, v10

    .line 301
    move-object v14, v13

    .line 302
    move-object v13, v10

    .line 303
    move-object/from16 v20, v14

    .line 304
    .line 305
    move-object v14, v10

    .line 306
    move-object/from16 v24, v10

    .line 307
    .line 308
    move-object/from16 v21, v20

    .line 309
    .line 310
    move-object/from16 v20, v4

    .line 311
    .line 312
    move-object/from16 v4, v21

    .line 313
    .line 314
    move-object/from16 v21, v6

    .line 315
    .line 316
    invoke-virtual/range {v9 .. v30}, Lsg2;->p(Lfd1;Ll32;Lye4;Lm32;Lkf1;ZLe42;Lsu1;Lof3;Lsb2;Ljz2;Leb3;Lmv2;Lz32;Lxp2;Lk32;Lk32;Lz32;Lgj2;Lxv2;Lim2;)V

    .line 317
    .line 318
    .line 319
    const-string v6, "/getNativeAdViewSignals"

    .line 320
    .line 321
    sget-object v9, Lx32;->n:Lo32;

    .line 322
    .line 323
    invoke-interface {v2, v6, v9}, Lag2;->v0(Ljava/lang/String;Ly32;)V

    .line 324
    .line 325
    .line 326
    const-string v6, "/getNativeClickMeta"

    .line 327
    .line 328
    sget-object v9, Lx32;->o:Lo32;

    .line 329
    .line 330
    invoke-interface {v2, v6, v9}, Lag2;->v0(Ljava/lang/String;Ly32;)V

    .line 331
    .line 332
    .line 333
    sget-object v6, Lmz1;->l8:Liz1;

    .line 334
    .line 335
    iget-object v9, v4, Ltw1;->c:Lkz1;

    .line 336
    .line 337
    invoke-virtual {v9, v6}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 338
    .line 339
    .line 340
    move-result-object v6

    .line 341
    check-cast v6, Ljava/lang/Boolean;

    .line 342
    .line 343
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    .line 344
    .line 345
    .line 346
    move-result v6

    .line 347
    if-eqz v6, :cond_5

    .line 348
    .line 349
    sget-object v6, Lmz1;->n8:Liz1;

    .line 350
    .line 351
    iget-object v4, v4, Ltw1;->c:Lkz1;

    .line 352
    .line 353
    invoke-virtual {v4, v6}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 354
    .line 355
    .line 356
    move-result-object v4

    .line 357
    check-cast v4, Ljava/lang/Boolean;

    .line 358
    .line 359
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 360
    .line 361
    .line 362
    move-result v4

    .line 363
    if-eqz v4, :cond_5

    .line 364
    .line 365
    iget-object v0, v0, Lft2;->s:Lxv2;

    .line 366
    .line 367
    if-eqz v0, :cond_5

    .line 368
    .line 369
    new-instance v4, Lk32;

    .line 370
    .line 371
    const/4 v6, 0x3

    .line 372
    invoke-direct {v4, v6, v0}, Lk32;-><init>(ILjava/lang/Object;)V

    .line 373
    .line 374
    .line 375
    const-string v0, "/onDeviceStorageEvent"

    .line 376
    .line 377
    invoke-interface {v2, v0, v4}, Lag2;->v0(Ljava/lang/String;Ly32;)V

    .line 378
    .line 379
    .line 380
    :cond_5
    invoke-interface {v2}, Lag2;->e0()Lsg2;

    .line 381
    .line 382
    .line 383
    move-result-object v0

    .line 384
    iget-object v4, v0, Lsg2;->i:Ljava/lang/Object;

    .line 385
    .line 386
    monitor-enter v4

    .line 387
    :try_start_0
    iput-boolean v5, v0, Lsg2;->x:Z

    .line 388
    .line 389
    monitor-exit v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 390
    invoke-interface {v2}, Lag2;->e0()Lsg2;

    .line 391
    .line 392
    .line 393
    move-result-object v0

    .line 394
    new-instance v4, Lug0;

    .line 395
    .line 396
    const/16 v5, 0x17

    .line 397
    .line 398
    invoke-direct {v4, v5, v3}, Lug0;-><init>(ILjava/lang/Object;)V

    .line 399
    .line 400
    .line 401
    iput-object v4, v0, Lsg2;->l:Lug2;

    .line 402
    .line 403
    invoke-interface {v2, v7, v8}, Lag2;->J0(Ljava/lang/String;Ljava/lang/String;)V

    .line 404
    .line 405
    .line 406
    return-object v3

    .line 407
    :catchall_0
    move-exception v0

    .line 408
    :try_start_1
    monitor-exit v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 409
    throw v0

    .line 410
    nop

    .line 411
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
