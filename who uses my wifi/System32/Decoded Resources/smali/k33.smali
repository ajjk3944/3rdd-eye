.class public final Lk33;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lq53;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/lang/Object;

.field public final d:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lgd2;Ljava/util/concurrent/ScheduledExecutorService;Lpq3;)V
    .locals 1

    const/4 v0, 0x5

    iput v0, p0, Lk33;->a:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk33;->b:Ljava/lang/Object;

    iput-object p2, p0, Lk33;->d:Ljava/lang/Object;

    iput-object p3, p0, Lk33;->c:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p4, p0, Lk33;->a:I

    iput-object p1, p0, Lk33;->b:Ljava/lang/Object;

    iput-object p2, p0, Lk33;->c:Ljava/lang/Object;

    iput-object p3, p0, Lk33;->d:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Ln70;
    .locals 12

    .line 1
    iget v0, p0, Lk33;->a:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object v2, p0, Lk33;->d:Ljava/lang/Object;

    .line 5
    .line 6
    iget-object v3, p0, Lk33;->b:Ljava/lang/Object;

    .line 7
    .line 8
    iget-object v4, p0, Lk33;->c:Ljava/lang/Object;

    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    sget-object v0, Lmz1;->k3:Liz1;

    .line 14
    .line 15
    sget-object v3, Ltw1;->e:Ltw1;

    .line 16
    .line 17
    iget-object v5, v3, Ltw1;->c:Lkz1;

    .line 18
    .line 19
    invoke-virtual {v5, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    check-cast v0, Ljava/lang/Boolean;

    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    sget-object v0, Lmz1;->p3:Liz1;

    .line 32
    .line 33
    iget-object v3, v3, Ltw1;->c:Lkz1;

    .line 34
    .line 35
    invoke-virtual {v3, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    check-cast v0, Ljava/lang/Boolean;

    .line 40
    .line 41
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-eqz v0, :cond_1

    .line 46
    .line 47
    new-instance v0, Lgi4;

    .line 48
    .line 49
    invoke-direct {v0}, Lgi4;-><init>()V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0, v1}, Lgi4;->e(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    invoke-static {v0}, Lwl2;->D(Lgi4;)Lsf3;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    check-cast v4, Lpq3;

    .line 60
    .line 61
    sget-object v1, Lfi1;->m:Lfi1;

    .line 62
    .line 63
    invoke-static {v0, v1, v4}, Lpu1;->O(Ln70;Lyp3;Ljava/util/concurrent/Executor;)Lqp3;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    sget-object v1, Li02;->a:Lso1;

    .line 68
    .line 69
    invoke-virtual {v1}, Lso1;->w()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    check-cast v1, Ljava/lang/Boolean;

    .line 74
    .line 75
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 76
    .line 77
    .line 78
    move-result v1

    .line 79
    if-eqz v1, :cond_0

    .line 80
    .line 81
    sget-object v1, Li02;->b:Lso1;

    .line 82
    .line 83
    invoke-virtual {v1}, Lso1;->w()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    check-cast v1, Ljava/lang/Long;

    .line 88
    .line 89
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 90
    .line 91
    .line 92
    move-result-wide v5

    .line 93
    check-cast v2, Ljava/util/concurrent/ScheduledExecutorService;

    .line 94
    .line 95
    sget-object v1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 96
    .line 97
    invoke-static {v0, v5, v6, v1, v2}, Lpu1;->N(Ln70;JLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/ScheduledExecutorService;)Ln70;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    :cond_0
    new-instance v1, Lvn1;

    .line 102
    .line 103
    const/4 v2, 0x6

    .line 104
    invoke-direct {v1, v2, p0}, Lvn1;-><init>(ILjava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    const-class v2, Ljava/lang/Exception;

    .line 108
    .line 109
    invoke-static {v0, v2, v1, v4}, Lpu1;->J(Ln70;Ljava/lang/Class;Lzk3;Ljava/util/concurrent/Executor;)Lxo3;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    goto :goto_0

    .line 114
    :cond_1
    new-instance v0, Lt33;

    .line 115
    .line 116
    const/4 v2, -0x1

    .line 117
    const/4 v3, 0x2

    .line 118
    invoke-direct {v0, v1, v2, v3}, Lt33;-><init>(Ljava/lang/String;II)V

    .line 119
    .line 120
    .line 121
    invoke-static {v0}, Lpu1;->r(Ljava/lang/Object;)Llq3;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    :goto_0
    return-object v0

    .line 126
    :pswitch_0
    new-instance v0, Lxs1;

    .line 127
    .line 128
    const/16 v1, 0x1d

    .line 129
    .line 130
    invoke-direct {v0, v1, p0}, Lxs1;-><init>(ILjava/lang/Object;)V

    .line 131
    .line 132
    .line 133
    check-cast v3, Lpq3;

    .line 134
    .line 135
    check-cast v3, Lld2;

    .line 136
    .line 137
    invoke-virtual {v3, v0}, Lld2;->c(Ljava/util/concurrent/Callable;)Ln70;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    return-object v0

    .line 142
    :pswitch_1
    new-instance v0, Lxs1;

    .line 143
    .line 144
    const/16 v1, 0x19

    .line 145
    .line 146
    invoke-direct {v0, v1, p0}, Lxs1;-><init>(ILjava/lang/Object;)V

    .line 147
    .line 148
    .line 149
    check-cast v4, Lpq3;

    .line 150
    .line 151
    check-cast v4, Lld2;

    .line 152
    .line 153
    invoke-virtual {v4, v0}, Lld2;->c(Ljava/util/concurrent/Callable;)Ln70;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    return-object v0

    .line 158
    :pswitch_2
    check-cast v2, Landroid/content/Context;

    .line 159
    .line 160
    check-cast v3, Landroid/content/pm/ApplicationInfo;

    .line 161
    .line 162
    iget-object v6, v3, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    .line 163
    .line 164
    check-cast v4, Landroid/content/pm/PackageInfo;

    .line 165
    .line 166
    if-nez v4, :cond_2

    .line 167
    .line 168
    move-object v7, v1

    .line 169
    goto :goto_1

    .line 170
    :cond_2
    iget v0, v4, Landroid/content/pm/PackageInfo;->versionCode:I

    .line 171
    .line 172
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    move-object v7, v0

    .line 177
    :goto_1
    if-nez v4, :cond_3

    .line 178
    .line 179
    move-object v8, v1

    .line 180
    goto :goto_2

    .line 181
    :cond_3
    iget-object v0, v4, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    .line 182
    .line 183
    move-object v8, v0

    .line 184
    :goto_2
    :try_start_0
    sget-object v0, Llf4;->l:Li63;

    .line 185
    .line 186
    invoke-static {v2}, Lza1;->a(Landroid/content/Context;)Lzj0;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    iget-object v0, v0, Lzj0;->f:Landroid/content/Context;

    .line 191
    .line 192
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 193
    .line 194
    .line 195
    move-result-object v3

    .line 196
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 197
    .line 198
    .line 199
    move-result-object v0

    .line 200
    const/4 v4, 0x0

    .line 201
    invoke-virtual {v0, v6, v4}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    .line 202
    .line 203
    .line 204
    move-result-object v0

    .line 205
    invoke-virtual {v3, v0}, Landroid/content/pm/PackageManager;->getApplicationLabel(Landroid/content/pm/ApplicationInfo;)Ljava/lang/CharSequence;

    .line 206
    .line 207
    .line 208
    move-result-object v0

    .line 209
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 210
    .line 211
    .line 212
    move-result-object v0
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 213
    move-object v9, v0

    .line 214
    goto :goto_3

    .line 215
    :catch_0
    move-object v9, v1

    .line 216
    :goto_3
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 217
    .line 218
    const/16 v3, 0x1e

    .line 219
    .line 220
    if-lt v0, v3, :cond_6

    .line 221
    .line 222
    sget-object v0, Lmz1;->Bd:Liz1;

    .line 223
    .line 224
    sget-object v3, Ltw1;->e:Ltw1;

    .line 225
    .line 226
    iget-object v3, v3, Ltw1;->c:Lkz1;

    .line 227
    .line 228
    invoke-virtual {v3, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    move-result-object v0

    .line 232
    check-cast v0, Ljava/lang/Boolean;

    .line 233
    .line 234
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 235
    .line 236
    .line 237
    move-result v0

    .line 238
    if-eqz v0, :cond_6

    .line 239
    .line 240
    :try_start_1
    invoke-virtual {v2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 241
    .line 242
    .line 243
    move-result-object v0

    .line 244
    invoke-static {v0, v6}, Lm91;->d(Landroid/content/pm/PackageManager;Ljava/lang/String;)Landroid/content/pm/InstallSourceInfo;

    .line 245
    .line 246
    .line 247
    move-result-object v0

    .line 248
    if-eqz v0, :cond_6

    .line 249
    .line 250
    invoke-static {v0}, Lm91;->j(Landroid/content/pm/InstallSourceInfo;)Ljava/lang/String;

    .line 251
    .line 252
    .line 253
    move-result-object v2
    :try_end_1
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_1 .. :try_end_1} :catch_3

    .line 254
    :try_start_2
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 255
    .line 256
    .line 257
    move-result v3

    .line 258
    if-eqz v3, :cond_4

    .line 259
    .line 260
    const-string v3, "No installing package name found"

    .line 261
    .line 262
    invoke-static {v3}, Lgi2;->G(Ljava/lang/String;)V

    .line 263
    .line 264
    .line 265
    move-object v2, v1

    .line 266
    :cond_4
    invoke-static {v0}, Lm91;->q(Landroid/content/pm/InstallSourceInfo;)Ljava/lang/String;

    .line 267
    .line 268
    .line 269
    move-result-object v3
    :try_end_2
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_2 .. :try_end_2} :catch_2

    .line 270
    :try_start_3
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 271
    .line 272
    .line 273
    move-result v0

    .line 274
    if-eqz v0, :cond_5

    .line 275
    .line 276
    const-string v0, "No initiating package name found"

    .line 277
    .line 278
    invoke-static {v0}, Lgi2;->G(Ljava/lang/String;)V
    :try_end_3
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_3 .. :try_end_3} :catch_1

    .line 279
    .line 280
    .line 281
    :goto_4
    move-object v11, v1

    .line 282
    move-object v10, v2

    .line 283
    goto :goto_8

    .line 284
    :catch_1
    move-exception v0

    .line 285
    goto :goto_5

    .line 286
    :cond_5
    move-object v10, v2

    .line 287
    move-object v11, v3

    .line 288
    goto :goto_8

    .line 289
    :goto_5
    move-object v1, v3

    .line 290
    goto :goto_7

    .line 291
    :catch_2
    move-exception v0

    .line 292
    goto :goto_7

    .line 293
    :catch_3
    move-exception v0

    .line 294
    goto :goto_6

    .line 295
    :cond_6
    move-object v10, v1

    .line 296
    move-object v11, v10

    .line 297
    goto :goto_8

    .line 298
    :goto_6
    move-object v2, v1

    .line 299
    :goto_7
    sget-object v3, Lhg4;->C:Lhg4;

    .line 300
    .line 301
    iget-object v3, v3, Lhg4;->h:Lgd2;

    .line 302
    .line 303
    const-string v4, "PackageInfoSignalSource.getInstallSourceInfo"

    .line 304
    .line 305
    invoke-virtual {v3, v4, v0}, Lgd2;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 306
    .line 307
    .line 308
    goto :goto_4

    .line 309
    :goto_8
    new-instance v5, Ly43;

    .line 310
    .line 311
    invoke-direct/range {v5 .. v11}, Ly43;-><init>(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 312
    .line 313
    .line 314
    invoke-static {v5}, Lpu1;->r(Ljava/lang/Object;)Llq3;

    .line 315
    .line 316
    .line 317
    move-result-object v0

    .line 318
    return-object v0

    .line 319
    :pswitch_3
    new-instance v0, Lxs1;

    .line 320
    .line 321
    const/16 v1, 0xc

    .line 322
    .line 323
    invoke-direct {v0, v1, p0}, Lxs1;-><init>(ILjava/lang/Object;)V

    .line 324
    .line 325
    .line 326
    check-cast v3, Lpq3;

    .line 327
    .line 328
    check-cast v3, Lld2;

    .line 329
    .line 330
    invoke-virtual {v3, v0}, Lld2;->c(Ljava/util/concurrent/Callable;)Ln70;

    .line 331
    .line 332
    .line 333
    move-result-object v0

    .line 334
    return-object v0

    .line 335
    :pswitch_4
    check-cast v3, Ln70;

    .line 336
    .line 337
    sget-object v0, Lfi1;->j:Lfi1;

    .line 338
    .line 339
    check-cast v4, Ljava/util/concurrent/Executor;

    .line 340
    .line 341
    invoke-static {v3, v0, v4}, Lpu1;->O(Ln70;Lyp3;Ljava/util/concurrent/Executor;)Lqp3;

    .line 342
    .line 343
    .line 344
    move-result-object v0

    .line 345
    sget-object v1, Lmz1;->md:Liz1;

    .line 346
    .line 347
    sget-object v3, Ltw1;->e:Ltw1;

    .line 348
    .line 349
    iget-object v5, v3, Ltw1;->c:Lkz1;

    .line 350
    .line 351
    invoke-virtual {v5, v1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 352
    .line 353
    .line 354
    move-result-object v5

    .line 355
    check-cast v5, Ljava/lang/Integer;

    .line 356
    .line 357
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 358
    .line 359
    .line 360
    move-result v5

    .line 361
    if-lez v5, :cond_7

    .line 362
    .line 363
    iget-object v3, v3, Ltw1;->c:Lkz1;

    .line 364
    .line 365
    invoke-virtual {v3, v1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 366
    .line 367
    .line 368
    move-result-object v1

    .line 369
    check-cast v1, Ljava/lang/Integer;

    .line 370
    .line 371
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 372
    .line 373
    .line 374
    move-result v1

    .line 375
    int-to-long v5, v1

    .line 376
    check-cast v2, Ljava/util/concurrent/ScheduledExecutorService;

    .line 377
    .line 378
    sget-object v1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 379
    .line 380
    invoke-static {v0, v5, v6, v1, v2}, Lpu1;->N(Ln70;JLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/ScheduledExecutorService;)Ln70;

    .line 381
    .line 382
    .line 383
    move-result-object v0

    .line 384
    :cond_7
    const-class v1, Ljava/lang/Throwable;

    .line 385
    .line 386
    sget-object v2, Lfi1;->i:Lfi1;

    .line 387
    .line 388
    invoke-static {v0, v1, v2, v4}, Lpu1;->L(Ln70;Ljava/lang/Class;Lyp3;Ljava/util/concurrent/Executor;)Lwo3;

    .line 389
    .line 390
    .line 391
    move-result-object v0

    .line 392
    return-object v0

    .line 393
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final d()I
    .locals 1

    .line 1
    iget v0, p0, Lk33;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const/16 v0, 0x2b

    .line 7
    .line 8
    return v0

    .line 9
    :pswitch_0
    const/16 v0, 0x26

    .line 10
    .line 11
    return v0

    .line 12
    :pswitch_1
    const/16 v0, 0x22

    .line 13
    .line 14
    return v0

    .line 15
    :pswitch_2
    const/16 v0, 0x1d

    .line 16
    .line 17
    return v0

    .line 18
    :pswitch_3
    const/16 v0, 0x9

    .line 19
    .line 20
    return v0

    .line 21
    :pswitch_4
    const/4 v0, 0x6

    .line 22
    return v0

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
