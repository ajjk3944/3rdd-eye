.class public final synthetic Lcj3;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lyp3;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lfj3;


# direct methods
.method public synthetic constructor <init>(Lfj3;I)V
    .locals 0

    .line 1
    iput p2, p0, Lcj3;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lcj3;->b:Lfj3;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Object;)Ln70;
    .locals 12

    .line 1
    iget v0, p0, Lcj3;->a:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object v2, p0, Lcj3;->b:Lfj3;

    .line 5
    .line 6
    const/4 v3, 0x1

    .line 7
    sget-object v4, Ldq3;->f:Ldq3;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast p1, Lyg3;

    .line 13
    .line 14
    iget-object v0, v2, Lfj3;->c:Lrj3;

    .line 15
    .line 16
    invoke-virtual {p1}, Lyg3;->H()I

    .line 17
    .line 18
    .line 19
    move-result v5

    .line 20
    const/4 v6, 0x2

    .line 21
    if-ne v5, v6, :cond_0

    .line 22
    .line 23
    invoke-virtual {p1}, Lyg3;->B()La54;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-virtual {v1}, La54;->p()[B

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-virtual {v0, v1}, Lrj3;->c([B)Lar3;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-static {v0}, Lgq3;->r(Ln70;)Lgq3;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    new-instance v1, Lbj3;

    .line 40
    .line 41
    invoke-direct {v1, v2, p1, v3}, Lbj3;-><init>(Lfj3;Lyg3;I)V

    .line 42
    .line 43
    .line 44
    invoke-static {v0, v1, v4}, Lpu1;->O(Ln70;Lyp3;Ljava/util/concurrent/Executor;)Lqp3;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    goto :goto_0

    .line 49
    :cond_0
    invoke-virtual {p1}, Lyg3;->H()I

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    const/4 v5, 0x3

    .line 54
    if-ne v3, v5, :cond_1

    .line 55
    .line 56
    invoke-static {}, Ljh3;->E()Ljh3;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    invoke-virtual {v0, v3}, Lrj3;->b(Ljh3;)Lar3;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-static {v0}, Lgq3;->r(Ln70;)Lgq3;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    new-instance v3, Lbj3;

    .line 69
    .line 70
    invoke-direct {v3, v2, p1, v6}, Lbj3;-><init>(Lfj3;Lyg3;I)V

    .line 71
    .line 72
    .line 73
    invoke-static {v0, v3, v4}, Lpu1;->O(Ln70;Lyp3;Ljava/util/concurrent/Executor;)Lqp3;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    new-instance v3, Lbj3;

    .line 78
    .line 79
    invoke-direct {v3, v2, p1, v1}, Lbj3;-><init>(Lfj3;Lyg3;I)V

    .line 80
    .line 81
    .line 82
    invoke-static {v0, v3, v4}, Lpu1;->O(Ln70;Lyp3;Ljava/util/concurrent/Executor;)Lqp3;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    :goto_0
    return-object p1

    .line 87
    :cond_1
    new-instance p1, Ljava/lang/AssertionError;

    .line 88
    .line 89
    const-string v0, "Unreachable"

    .line 90
    .line 91
    invoke-direct {p1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    throw p1

    .line 95
    :pswitch_0
    check-cast p1, Ljava/lang/Integer;

    .line 96
    .line 97
    iget-object p1, v2, Lfj3;->b:Lpj3;

    .line 98
    .line 99
    iget v0, p1, Lpj3;->a:I

    .line 100
    .line 101
    packed-switch v0, :pswitch_data_1

    .line 102
    .line 103
    .line 104
    invoke-static {}, Lju1;->A()Liu1;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    invoke-static {}, Lyb;->z()[B

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    sget-object v5, La54;->g:Ly44;

    .line 113
    .line 114
    array-length v5, v1

    .line 115
    const/4 v9, 0x0

    .line 116
    invoke-static {v1, v9, v5}, La54;->n([BII)Ly44;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    invoke-virtual {v0}, Ln54;->b()V

    .line 121
    .line 122
    .line 123
    iget-object v5, v0, Ln54;->g:Lp54;

    .line 124
    .line 125
    check-cast v5, Lju1;

    .line 126
    .line 127
    invoke-virtual {v5, v1}, Lju1;->B(Ly44;)V

    .line 128
    .line 129
    .line 130
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 131
    .line 132
    int-to-long v5, v1

    .line 133
    invoke-virtual {v0}, Ln54;->b()V

    .line 134
    .line 135
    .line 136
    iget-object v1, v0, Ln54;->g:Lp54;

    .line 137
    .line 138
    check-cast v1, Lju1;

    .line 139
    .line 140
    invoke-virtual {v1, v5, v6}, Lju1;->C(J)V

    .line 141
    .line 142
    .line 143
    sget-object v1, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 144
    .line 145
    invoke-virtual {v0}, Ln54;->b()V

    .line 146
    .line 147
    .line 148
    iget-object v5, v0, Ln54;->g:Lp54;

    .line 149
    .line 150
    check-cast v5, Lju1;

    .line 151
    .line 152
    invoke-virtual {v5, v1}, Lju1;->D(Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    iget-object v1, p1, Lpj3;->b:Landroid/content/Context;

    .line 156
    .line 157
    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v5

    .line 161
    invoke-virtual {v0}, Ln54;->b()V

    .line 162
    .line 163
    .line 164
    iget-object v6, v0, Ln54;->g:Lp54;

    .line 165
    .line 166
    check-cast v6, Lju1;

    .line 167
    .line 168
    invoke-virtual {v6, v5}, Lju1;->E(Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    :try_start_0
    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 172
    .line 173
    .line 174
    move-result-object v5

    .line 175
    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object v1

    .line 179
    invoke-virtual {v5, v1, v9}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 180
    .line 181
    .line 182
    move-result-object v1

    .line 183
    iget v1, v1, Landroid/content/pm/PackageInfo;->versionCode:I
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 184
    .line 185
    goto :goto_1

    .line 186
    :catch_0
    const/4 v1, -0x1

    .line 187
    :goto_1
    iget-object v5, p1, Lpj3;->e:Ljava/lang/Object;

    .line 188
    .line 189
    move-object v7, v5

    .line 190
    check-cast v7, Lhg3;

    .line 191
    .line 192
    iget-object v5, p1, Lpj3;->d:Lgk3;

    .line 193
    .line 194
    int-to-long v10, v1

    .line 195
    invoke-virtual {v0}, Ln54;->b()V

    .line 196
    .line 197
    .line 198
    iget-object v1, v0, Ln54;->g:Lp54;

    .line 199
    .line 200
    check-cast v1, Lju1;

    .line 201
    .line 202
    invoke-virtual {v1, v10, v11}, Lju1;->F(J)V

    .line 203
    .line 204
    .line 205
    iget-object v1, p1, Lpj3;->f:Ljava/lang/Object;

    .line 206
    .line 207
    check-cast v1, Ljava/lang/String;

    .line 208
    .line 209
    invoke-virtual {v0}, Ln54;->b()V

    .line 210
    .line 211
    .line 212
    iget-object v6, v0, Ln54;->g:Lp54;

    .line 213
    .line 214
    check-cast v6, Lju1;

    .line 215
    .line 216
    invoke-virtual {v6, v1}, Lju1;->G(Ljava/lang/String;)V

    .line 217
    .line 218
    .line 219
    invoke-virtual {v0}, Ln54;->d()Lp54;

    .line 220
    .line 221
    .line 222
    move-result-object v0

    .line 223
    check-cast v0, Lju1;

    .line 224
    .line 225
    invoke-virtual {v0}, Ls44;->b()[B

    .line 226
    .line 227
    .line 228
    move-result-object v0

    .line 229
    sget-object v1, Ljo3;->e:Lho3;

    .line 230
    .line 231
    iget-object v6, v1, Ljo3;->b:Ljava/lang/Character;

    .line 232
    .line 233
    if-nez v6, :cond_2

    .line 234
    .line 235
    goto :goto_2

    .line 236
    :cond_2
    iget-object v1, v1, Ljo3;->a:Lfo3;

    .line 237
    .line 238
    new-instance v6, Lho3;

    .line 239
    .line 240
    const/4 v8, 0x0

    .line 241
    invoke-direct {v6, v1, v8}, Lho3;-><init>(Lfo3;Ljava/lang/Character;)V

    .line 242
    .line 243
    .line 244
    move-object v1, v6

    .line 245
    :goto_2
    array-length v6, v0

    .line 246
    invoke-virtual {v1, v6, v0}, Ljo3;->g(I[B)Ljava/lang/String;

    .line 247
    .line 248
    .line 249
    move-result-object v0

    .line 250
    iget-object v1, p1, Lpj3;->g:Ljava/lang/Object;

    .line 251
    .line 252
    check-cast v1, Ljava/lang/String;

    .line 253
    .line 254
    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 255
    .line 256
    .line 257
    move-result-object v1

    .line 258
    invoke-virtual {v1}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    .line 259
    .line 260
    .line 261
    move-result-object v1

    .line 262
    const-string v6, "aspq"

    .line 263
    .line 264
    invoke-virtual {v1, v6, v0}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 265
    .line 266
    .line 267
    move-result-object v0

    .line 268
    invoke-virtual {v0}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    .line 269
    .line 270
    .line 271
    move-result-object v0

    .line 272
    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 273
    .line 274
    .line 275
    move-result-object v8

    .line 276
    new-array v11, v9, [B

    .line 277
    .line 278
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 279
    .line 280
    .line 281
    new-instance v6, Lde3;

    .line 282
    .line 283
    const/4 v10, 0x0

    .line 284
    invoke-direct/range {v6 .. v11}, Lde3;-><init>(Lhg3;Ljava/lang/String;ZLjava/lang/String;[B)V

    .line 285
    .line 286
    .line 287
    invoke-static {v6}, Lwl2;->h(Lzc;)Lbd;

    .line 288
    .line 289
    .line 290
    move-result-object v0

    .line 291
    new-instance v1, Lvn1;

    .line 292
    .line 293
    const/16 v6, 0xe

    .line 294
    .line 295
    invoke-direct {v1, v6, p1}, Lvn1;-><init>(ILjava/lang/Object;)V

    .line 296
    .line 297
    .line 298
    iget-object p1, p1, Lpj3;->c:Ljava/util/concurrent/ExecutorService;

    .line 299
    .line 300
    invoke-static {v0, v1, p1}, Lpu1;->P(Ln70;Lzk3;Ljava/util/concurrent/Executor;)Lrp3;

    .line 301
    .line 302
    .line 303
    move-result-object p1

    .line 304
    const/16 v0, 0x4e22

    .line 305
    .line 306
    invoke-virtual {v5, v0, p1}, Lgk3;->d(ILn70;)V

    .line 307
    .line 308
    .line 309
    goto :goto_3

    .line 310
    :pswitch_1
    iget-object v0, p1, Lpj3;->e:Ljava/lang/Object;

    .line 311
    .line 312
    check-cast v0, Lz94;

    .line 313
    .line 314
    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 315
    .line 316
    .line 317
    new-instance v5, Lw53;

    .line 318
    .line 319
    const/16 v6, 0x8

    .line 320
    .line 321
    invoke-direct {v5, v6, v0}, Lw53;-><init>(ILjava/lang/Object;)V

    .line 322
    .line 323
    .line 324
    iget-object v0, p1, Lpj3;->c:Ljava/util/concurrent/ExecutorService;

    .line 325
    .line 326
    invoke-static {v5, v0}, Lpu1;->D(Ljava/util/concurrent/Callable;Ljava/util/concurrent/Executor;)Lar3;

    .line 327
    .line 328
    .line 329
    move-result-object v5

    .line 330
    invoke-static {v5}, Lgq3;->r(Ln70;)Lgq3;

    .line 331
    .line 332
    .line 333
    move-result-object v5

    .line 334
    new-instance v6, Loj3;

    .line 335
    .line 336
    invoke-direct {v6, p1, v3}, Loj3;-><init>(Lpj3;I)V

    .line 337
    .line 338
    .line 339
    invoke-static {v5, v6, v4}, Lpu1;->P(Ln70;Lzk3;Ljava/util/concurrent/Executor;)Lrp3;

    .line 340
    .line 341
    .line 342
    move-result-object v5

    .line 343
    new-instance v6, Lu42;

    .line 344
    .line 345
    const/16 v7, 0x12

    .line 346
    .line 347
    invoke-direct {v6, v7, p1}, Lu42;-><init>(ILjava/lang/Object;)V

    .line 348
    .line 349
    .line 350
    invoke-static {v5, v6, v4}, Lpu1;->O(Ln70;Lyp3;Ljava/util/concurrent/Executor;)Lqp3;

    .line 351
    .line 352
    .line 353
    move-result-object v5

    .line 354
    new-instance v6, Loj3;

    .line 355
    .line 356
    invoke-direct {v6, p1, v1}, Loj3;-><init>(Lpj3;I)V

    .line 357
    .line 358
    .line 359
    invoke-static {v5, v6, v0}, Lpu1;->P(Ln70;Lzk3;Ljava/util/concurrent/Executor;)Lrp3;

    .line 360
    .line 361
    .line 362
    move-result-object v0

    .line 363
    const-class v1, Lnj3;

    .line 364
    .line 365
    sget-object v5, Ldj3;->e:Ldj3;

    .line 366
    .line 367
    invoke-static {v0, v1, v5, v4}, Lpu1;->J(Ln70;Ljava/lang/Class;Lzk3;Ljava/util/concurrent/Executor;)Lxo3;

    .line 368
    .line 369
    .line 370
    move-result-object v0

    .line 371
    iget-object p1, p1, Lpj3;->d:Lgk3;

    .line 372
    .line 373
    const/16 v1, 0x3b62

    .line 374
    .line 375
    invoke-virtual {p1, v1, v0}, Lgk3;->d(ILn70;)V

    .line 376
    .line 377
    .line 378
    move-object p1, v0

    .line 379
    :goto_3
    invoke-static {p1}, Lgq3;->r(Ln70;)Lgq3;

    .line 380
    .line 381
    .line 382
    move-result-object p1

    .line 383
    new-instance v0, Lgj1;

    .line 384
    .line 385
    const/16 v1, 0x1c

    .line 386
    .line 387
    invoke-direct {v0, v1}, Lgj1;-><init>(I)V

    .line 388
    .line 389
    .line 390
    invoke-static {p1, v0, v4}, Lpu1;->P(Ln70;Lzk3;Ljava/util/concurrent/Executor;)Lrp3;

    .line 391
    .line 392
    .line 393
    move-result-object p1

    .line 394
    new-instance v0, Lcj3;

    .line 395
    .line 396
    invoke-direct {v0, v2, v3}, Lcj3;-><init>(Lfj3;I)V

    .line 397
    .line 398
    .line 399
    invoke-static {p1, v0, v4}, Lpu1;->O(Ln70;Lyp3;Ljava/util/concurrent/Executor;)Lqp3;

    .line 400
    .line 401
    .line 402
    move-result-object p1

    .line 403
    sget-object v0, Lgj1;->B:Lgj1;

    .line 404
    .line 405
    invoke-static {p1, v0, v4}, Lpu1;->P(Ln70;Lzk3;Ljava/util/concurrent/Executor;)Lrp3;

    .line 406
    .line 407
    .line 408
    move-result-object p1

    .line 409
    iget-object v0, v2, Lfj3;->d:Lgk3;

    .line 410
    .line 411
    const/16 v1, 0x3ea

    .line 412
    .line 413
    invoke-virtual {v0, v1, p1}, Lgk3;->d(ILn70;)V

    .line 414
    .line 415
    .line 416
    return-object p1

    .line 417
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch

    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_1
    .end packed-switch
.end method
