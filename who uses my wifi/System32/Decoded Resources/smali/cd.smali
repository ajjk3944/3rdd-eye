.class public final Lcd;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic f:I

.field public final g:I

.field public final h:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;II)V
    .locals 0

    .line 1
    iput p3, p0, Lcd;->f:I

    iput-object p1, p0, Lcd;->h:Ljava/lang/Object;

    iput p2, p0, Lcd;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/util/List;ILjava/lang/Throwable;)V
    .locals 0

    const/4 p3, 0x1

    iput p3, p0, Lcd;->f:I

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    const-string p3, "initCallbacks cannot be null"

    invoke-static {p1, p3}, Lpu1;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object p3, p0, Lcd;->h:Ljava/lang/Object;

    .line 6
    iput p2, p0, Lcd;->g:I

    return-void
.end method

.method public synthetic constructor <init>(Ljb4;IZ)V
    .locals 0

    const/16 p3, 0x9

    iput p3, p0, Lcd;->f:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcd;->h:Ljava/lang/Object;

    iput p2, p0, Lcd;->g:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 8

    .line 1
    iget v0, p0, Lcd;->f:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcd;->h:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Lwt2;

    .line 11
    .line 12
    iget v3, p0, Lcd;->g:I

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    sget-object v4, Lv23;->a:Ljava/lang/String;

    .line 18
    .line 19
    iget-object v0, v0, Lwt2;->h:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v0, Loa4;

    .line 22
    .line 23
    new-instance v4, Lna4;

    .line 24
    .line 25
    invoke-direct {v4, v3}, Lna4;-><init>(I)V

    .line 26
    .line 27
    .line 28
    iget-object v0, v0, Loa4;->f:Lya4;

    .line 29
    .line 30
    iget-object v0, v0, Lya4;->H:Lfw3;

    .line 31
    .line 32
    iget-object v5, v0, Lfw3;->h:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v5, Ld13;

    .line 35
    .line 36
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 37
    .line 38
    .line 39
    move-result-object v6

    .line 40
    iget-object v5, v5, Ld13;->a:Landroid/os/Handler;

    .line 41
    .line 42
    invoke-virtual {v5}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 43
    .line 44
    .line 45
    move-result-object v5

    .line 46
    if-ne v6, v5, :cond_0

    .line 47
    .line 48
    move v1, v2

    .line 49
    :cond_0
    invoke-static {v1}, Lzt0;->b0(Z)V

    .line 50
    .line 51
    .line 52
    iget v1, v0, Lfw3;->f:I

    .line 53
    .line 54
    add-int/2addr v1, v2

    .line 55
    iput v1, v0, Lfw3;->f:I

    .line 56
    .line 57
    new-instance v1, Ln62;

    .line 58
    .line 59
    const/16 v2, 0x11

    .line 60
    .line 61
    invoke-direct {v1, v0, v4, v2}, Ln62;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 62
    .line 63
    .line 64
    iget-object v2, v0, Lfw3;->g:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v2, Ld13;

    .line 67
    .line 68
    iget-object v4, v2, Ld13;->a:Landroid/os/Handler;

    .line 69
    .line 70
    invoke-virtual {v4}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 71
    .line 72
    .line 73
    move-result-object v4

    .line 74
    invoke-virtual {v4}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 75
    .line 76
    .line 77
    move-result-object v4

    .line 78
    invoke-virtual {v4}, Ljava/lang/Thread;->isAlive()Z

    .line 79
    .line 80
    .line 81
    move-result v4

    .line 82
    if-nez v4, :cond_1

    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_1
    invoke-virtual {v2, v1}, Ld13;->d(Ljava/lang/Runnable;)Z

    .line 86
    .line 87
    .line 88
    :goto_0
    iget-object v1, v0, Lfw3;->j:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v1, Ljava/lang/Integer;

    .line 91
    .line 92
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    invoke-virtual {v0, v1}, Lfw3;->z(Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    return-void

    .line 100
    :pswitch_0
    iget-object v0, p0, Lcd;->h:Ljava/lang/Object;

    .line 101
    .line 102
    check-cast v0, Ljb4;

    .line 103
    .line 104
    iget v1, p0, Lcd;->g:I

    .line 105
    .line 106
    iget-object v3, v0, Ljb4;->f:[Lt71;

    .line 107
    .line 108
    aget-object v1, v3, v1

    .line 109
    .line 110
    iget-object v1, v1, Lt71;->e:Ljava/lang/Object;

    .line 111
    .line 112
    check-cast v1, Lkg4;

    .line 113
    .line 114
    iget v1, v1, Lkg4;->g:I

    .line 115
    .line 116
    iget-object v0, v0, Ljb4;->A:Lmd4;

    .line 117
    .line 118
    invoke-virtual {v0}, Lmd4;->y()Lad4;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    new-instance v3, Lid4;

    .line 123
    .line 124
    invoke-direct {v3, v2}, Lid4;-><init>(I)V

    .line 125
    .line 126
    .line 127
    const/16 v2, 0x409

    .line 128
    .line 129
    invoke-virtual {v0, v1, v2, v3}, Lmd4;->s(Lad4;ILks2;)V

    .line 130
    .line 131
    .line 132
    return-void

    .line 133
    :pswitch_1
    iget-object v0, p0, Lcd;->h:Ljava/lang/Object;

    .line 134
    .line 135
    check-cast v0, Lse2;

    .line 136
    .line 137
    iget v1, p0, Lcd;->g:I

    .line 138
    .line 139
    iget-object v0, v0, Lse2;->l:Lee2;

    .line 140
    .line 141
    if-eqz v0, :cond_2

    .line 142
    .line 143
    invoke-virtual {v0, v1}, Lee2;->onWindowVisibilityChanged(I)V

    .line 144
    .line 145
    .line 146
    :cond_2
    return-void

    .line 147
    :pswitch_2
    iget-object v0, p0, Lcd;->h:Ljava/lang/Object;

    .line 148
    .line 149
    check-cast v0, Lyd2;

    .line 150
    .line 151
    iget v1, p0, Lcd;->g:I

    .line 152
    .line 153
    iget-object v0, v0, Lyd2;->v:Lee2;

    .line 154
    .line 155
    if-eqz v0, :cond_3

    .line 156
    .line 157
    invoke-virtual {v0, v1}, Lee2;->onWindowVisibilityChanged(I)V

    .line 158
    .line 159
    .line 160
    :cond_3
    return-void

    .line 161
    :pswitch_3
    iget-object v0, p0, Lcd;->h:Ljava/lang/Object;

    .line 162
    .line 163
    check-cast v0, Lxz1;

    .line 164
    .line 165
    iget v1, p0, Lcd;->g:I

    .line 166
    .line 167
    iget-object v0, v0, Lxz1;->d:Lmv2;

    .line 168
    .line 169
    if-eqz v0, :cond_4

    .line 170
    .line 171
    invoke-virtual {v0}, Lmv2;->a()Llv2;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    const-string v2, "action"

    .line 176
    .line 177
    const-string v3, "cct_nav"

    .line 178
    .line 179
    invoke-virtual {v0, v2, v3}, Llv2;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object v1

    .line 186
    const-string v2, "cct_navs"

    .line 187
    .line 188
    invoke-virtual {v0, v2, v1}, Llv2;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 189
    .line 190
    .line 191
    invoke-virtual {v0}, Llv2;->m()V

    .line 192
    .line 193
    .line 194
    :cond_4
    return-void

    .line 195
    :pswitch_4
    iget v0, p0, Lcd;->g:I

    .line 196
    .line 197
    iget-object v3, p0, Lcd;->h:Ljava/lang/Object;

    .line 198
    .line 199
    check-cast v3, Ljt1;

    .line 200
    .line 201
    if-lez v0, :cond_5

    .line 202
    .line 203
    mul-int/lit16 v0, v0, 0x3e8

    .line 204
    .line 205
    int-to-long v4, v0

    .line 206
    :try_start_0
    invoke-static {v4, v5}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 207
    .line 208
    .line 209
    :catch_0
    :cond_5
    :try_start_1
    iget-object v0, v3, Ljt1;->a:Landroid/content/Context;

    .line 210
    .line 211
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 212
    .line 213
    .line 214
    move-result-object v3

    .line 215
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object v4

    .line 219
    invoke-virtual {v3, v4, v1}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 220
    .line 221
    .line 222
    move-result-object v1

    .line 223
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 224
    .line 225
    .line 226
    move-result-object v3

    .line 227
    iget v1, v1, Landroid/content/pm/PackageInfo;->versionCode:I

    .line 228
    .line 229
    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 230
    .line 231
    .line 232
    move-result-object v1

    .line 233
    invoke-static {v0, v3, v1}, Lg82;->w(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Lqr1;

    .line 234
    .line 235
    .line 236
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 237
    goto :goto_1

    .line 238
    :catchall_0
    const/4 v0, 0x0

    .line 239
    :goto_1
    iget-object v1, p0, Lcd;->h:Ljava/lang/Object;

    .line 240
    .line 241
    check-cast v1, Ljt1;

    .line 242
    .line 243
    iput-object v0, v1, Ljt1;->h:Lqr1;

    .line 244
    .line 245
    iget v3, p0, Lcd;->g:I

    .line 246
    .line 247
    const/4 v4, 0x4

    .line 248
    if-ge v3, v4, :cond_9

    .line 249
    .line 250
    if-nez v0, :cond_6

    .line 251
    .line 252
    goto :goto_2

    .line 253
    :cond_6
    invoke-virtual {v0}, Lqr1;->a0()Z

    .line 254
    .line 255
    .line 256
    move-result v4

    .line 257
    if-eqz v4, :cond_7

    .line 258
    .line 259
    invoke-virtual {v0}, Lqr1;->v0()Ljava/lang/String;

    .line 260
    .line 261
    .line 262
    move-result-object v4

    .line 263
    const-string v5, "0000000000000000000000000000000000000000000000000000000000000000"

    .line 264
    .line 265
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 266
    .line 267
    .line 268
    move-result v4

    .line 269
    if-nez v4, :cond_7

    .line 270
    .line 271
    invoke-virtual {v0}, Lqr1;->z0()Z

    .line 272
    .line 273
    .line 274
    move-result v4

    .line 275
    if-eqz v4, :cond_7

    .line 276
    .line 277
    invoke-virtual {v0}, Lqr1;->A0()Lzr1;

    .line 278
    .line 279
    .line 280
    move-result-object v4

    .line 281
    invoke-virtual {v4}, Lzr1;->A()Z

    .line 282
    .line 283
    .line 284
    move-result v4

    .line 285
    if-eqz v4, :cond_7

    .line 286
    .line 287
    invoke-virtual {v0}, Lqr1;->A0()Lzr1;

    .line 288
    .line 289
    .line 290
    move-result-object v0

    .line 291
    invoke-virtual {v0}, Lzr1;->B()J

    .line 292
    .line 293
    .line 294
    move-result-wide v4

    .line 295
    const-wide/16 v6, -0x2

    .line 296
    .line 297
    cmp-long v0, v4, v6

    .line 298
    .line 299
    if-eqz v0, :cond_7

    .line 300
    .line 301
    goto :goto_3

    .line 302
    :cond_7
    :goto_2
    add-int/2addr v3, v2

    .line 303
    iget-boolean v0, v1, Ljt1;->l:Z

    .line 304
    .line 305
    if-nez v0, :cond_8

    .line 306
    .line 307
    goto :goto_3

    .line 308
    :cond_8
    iget-object v0, v1, Ljt1;->b:Ljava/util/concurrent/ExecutorService;

    .line 309
    .line 310
    new-instance v2, Lcd;

    .line 311
    .line 312
    const/4 v4, 0x5

    .line 313
    invoke-direct {v2, v1, v3, v4}, Lcd;-><init>(Ljava/lang/Object;II)V

    .line 314
    .line 315
    .line 316
    invoke-interface {v0, v2}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 317
    .line 318
    .line 319
    move-result-object v0

    .line 320
    if-nez v3, :cond_9

    .line 321
    .line 322
    iput-object v0, v1, Ljt1;->i:Ljava/util/concurrent/Future;

    .line 323
    .line 324
    :cond_9
    :goto_3
    return-void

    .line 325
    :pswitch_5
    iget-object v0, p0, Lcd;->h:Ljava/lang/Object;

    .line 326
    .line 327
    check-cast v0, Lxb1;

    .line 328
    .line 329
    iget v1, p0, Lcd;->g:I

    .line 330
    .line 331
    invoke-virtual {v0, v1}, Lxb1;->f(I)V

    .line 332
    .line 333
    .line 334
    return-void

    .line 335
    :pswitch_6
    iget-object v0, p0, Lcd;->h:Ljava/lang/Object;

    .line 336
    .line 337
    check-cast v0, Landroidx/work/impl/foreground/SystemForegroundService;

    .line 338
    .line 339
    iget-object v0, v0, Landroidx/work/impl/foreground/SystemForegroundService;->j:Landroid/app/NotificationManager;

    .line 340
    .line 341
    iget v1, p0, Lcd;->g:I

    .line 342
    .line 343
    invoke-virtual {v0, v1}, Landroid/app/NotificationManager;->cancel(I)V

    .line 344
    .line 345
    .line 346
    return-void

    .line 347
    :pswitch_7
    iget-object v0, p0, Lcd;->h:Ljava/lang/Object;

    .line 348
    .line 349
    check-cast v0, Lcc0;

    .line 350
    .line 351
    iget-object v0, v0, Lcc0;->g0:Landroidx/recyclerview/widget/RecyclerView;

    .line 352
    .line 353
    iget v1, p0, Lcd;->g:I

    .line 354
    .line 355
    iget-boolean v2, v0, Landroidx/recyclerview/widget/RecyclerView;->B:Z

    .line 356
    .line 357
    if-eqz v2, :cond_a

    .line 358
    .line 359
    goto :goto_4

    .line 360
    :cond_a
    iget-object v2, v0, Landroidx/recyclerview/widget/RecyclerView;->r:Lho0;

    .line 361
    .line 362
    if-nez v2, :cond_b

    .line 363
    .line 364
    const-string v0, "RecyclerView"

    .line 365
    .line 366
    const-string v1, "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument."

    .line 367
    .line 368
    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 369
    .line 370
    .line 371
    goto :goto_4

    .line 372
    :cond_b
    invoke-virtual {v2, v0, v1}, Lho0;->y0(Landroidx/recyclerview/widget/RecyclerView;I)V

    .line 373
    .line 374
    .line 375
    :goto_4
    return-void

    .line 376
    :pswitch_8
    iget-object v0, p0, Lcd;->h:Ljava/lang/Object;

    .line 377
    .line 378
    check-cast v0, Ljava/util/ArrayList;

    .line 379
    .line 380
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 381
    .line 382
    .line 383
    move-result v3

    .line 384
    iget v4, p0, Lcd;->g:I

    .line 385
    .line 386
    if-eq v4, v2, :cond_c

    .line 387
    .line 388
    :goto_5
    if-ge v1, v3, :cond_d

    .line 389
    .line 390
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 391
    .line 392
    .line 393
    move-result-object v2

    .line 394
    check-cast v2, Lpr;

    .line 395
    .line 396
    invoke-virtual {v2}, Lpr;->a()V

    .line 397
    .line 398
    .line 399
    add-int/lit8 v1, v1, 0x1

    .line 400
    .line 401
    goto :goto_5

    .line 402
    :cond_c
    :goto_6
    if-ge v1, v3, :cond_d

    .line 403
    .line 404
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 405
    .line 406
    .line 407
    move-result-object v2

    .line 408
    check-cast v2, Lpr;

    .line 409
    .line 410
    invoke-virtual {v2}, Lpr;->b()V

    .line 411
    .line 412
    .line 413
    add-int/lit8 v1, v1, 0x1

    .line 414
    .line 415
    goto :goto_6

    .line 416
    :cond_d
    return-void

    .line 417
    :pswitch_9
    iget-object v0, p0, Lcd;->h:Ljava/lang/Object;

    .line 418
    .line 419
    check-cast v0, Lf23;

    .line 420
    .line 421
    iget v1, p0, Lcd;->g:I

    .line 422
    .line 423
    iget-object v0, v0, Lf23;->g:Ljava/lang/Object;

    .line 424
    .line 425
    check-cast v0, Lg82;

    .line 426
    .line 427
    if-eqz v0, :cond_e

    .line 428
    .line 429
    invoke-virtual {v0, v1}, Lg82;->o(I)V

    .line 430
    .line 431
    .line 432
    :cond_e
    return-void

    .line 433
    :pswitch_data_0
    .packed-switch 0x0
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
