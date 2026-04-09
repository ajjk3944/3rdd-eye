.class public final synthetic Lw53;
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
    iput p1, p0, Lw53;->a:I

    iput-object p2, p0, Lw53;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Llq3;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lw53;->a:I

    sget-object v0, Llq3;->g:Llq3;

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw53;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 11

    .line 1
    iget v0, p0, Lw53;->a:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget-object v0, Llf4;->l:Li63;

    .line 9
    .line 10
    sget-object v0, Lhg4;->C:Lhg4;

    .line 11
    .line 12
    iget-object v0, v0, Lhg4;->c:Llf4;

    .line 13
    .line 14
    iget-object v0, p0, Lw53;->b:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, Landroid/net/Uri;

    .line 17
    .line 18
    invoke-static {v0}, Llf4;->o(Landroid/net/Uri;)Ljava/util/HashMap;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    return-object v0

    .line 23
    :pswitch_0
    iget-object v0, p0, Lw53;->b:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v0, Ldk3;

    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    new-instance v1, Landroid/content/IntentFilter;

    .line 31
    .line 32
    invoke-direct {v1}, Landroid/content/IntentFilter;-><init>()V

    .line 33
    .line 34
    .line 35
    const-string v3, "android.intent.action.USER_PRESENT"

    .line 36
    .line 37
    invoke-virtual {v1, v3}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    const-string v3, "android.intent.action.SCREEN_OFF"

    .line 41
    .line 42
    invoke-virtual {v1, v3}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    iget-object v3, v0, Ldk3;->a:Landroid/content/Context;

    .line 46
    .line 47
    invoke-virtual {v3, v0, v1}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 48
    .line 49
    .line 50
    return-object v2

    .line 51
    :pswitch_1
    iget-object v0, p0, Lw53;->b:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v0, Lzj3;

    .line 54
    .line 55
    iget-object v0, v0, Lzj3;->b:Landroid/content/Context;

    .line 56
    .line 57
    :try_start_0
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v4

    .line 65
    invoke-virtual {v3, v4, v1}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    iget v1, v1, Landroid/content/pm/PackageInfo;->versionCode:I

    .line 74
    .line 75
    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    invoke-static {v0, v3, v1}, Lg82;->w(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Lqr1;

    .line 80
    .line 81
    .line 82
    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 83
    :catchall_0
    return-object v2

    .line 84
    :pswitch_2
    iget-object v0, p0, Lw53;->b:Ljava/lang/Object;

    .line 85
    .line 86
    move-object v1, v0

    .line 87
    check-cast v1, Lzj3;

    .line 88
    .line 89
    new-instance v0, Lvn1;

    .line 90
    .line 91
    const/16 v2, 0xf

    .line 92
    .line 93
    invoke-direct {v0, v2, v1}, Lvn1;-><init>(ILjava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    monitor-enter v1

    .line 97
    :try_start_1
    iget-object v2, v1, Lzj3;->c:Lgk3;

    .line 98
    .line 99
    iget-object v3, v1, Lzj3;->b:Landroid/content/Context;

    .line 100
    .line 101
    iget-object v4, v1, Lzj3;->e:Lvf3;

    .line 102
    .line 103
    new-instance v5, Llv2;

    .line 104
    .line 105
    const/16 v6, 0x9

    .line 106
    .line 107
    invoke-direct {v5, v3, v4, v6}, Llv2;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 108
    .line 109
    .line 110
    invoke-static {v5}, Lwl2;->h(Lzc;)Lbd;

    .line 111
    .line 112
    .line 113
    move-result-object v3

    .line 114
    iget-object v4, v1, Lzj3;->d:Lpq3;

    .line 115
    .line 116
    invoke-static {v3, v0, v4}, Lpu1;->P(Ln70;Lzk3;Ljava/util/concurrent/Executor;)Lrp3;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    const/16 v3, 0x34

    .line 121
    .line 122
    invoke-virtual {v2, v3, v0}, Lgk3;->d(ILn70;)V

    .line 123
    .line 124
    .line 125
    iput-object v0, v1, Lzj3;->g:Ln70;

    .line 126
    .line 127
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 128
    const-string v0, ""

    .line 129
    .line 130
    return-object v0

    .line 131
    :catchall_1
    move-exception v0

    .line 132
    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 133
    throw v0

    .line 134
    :pswitch_3
    iget-object v0, p0, Lw53;->b:Ljava/lang/Object;

    .line 135
    .line 136
    check-cast v0, Lz94;

    .line 137
    .line 138
    invoke-interface {v0}, Lz94;->d()Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    return-object v0

    .line 143
    :pswitch_4
    iget-object v0, p0, Lw53;->b:Ljava/lang/Object;

    .line 144
    .line 145
    check-cast v0, Lxi3;

    .line 146
    .line 147
    iget-object v0, v0, Lxi3;->a:Lz94;

    .line 148
    .line 149
    invoke-interface {v0}, Lz94;->d()Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v0

    .line 153
    check-cast v0, Lfj3;

    .line 154
    .line 155
    invoke-virtual {v0}, Lfj3;->a()Lgq3;

    .line 156
    .line 157
    .line 158
    return-object v2

    .line 159
    :pswitch_5
    iget-object v0, p0, Lw53;->b:Ljava/lang/Object;

    .line 160
    .line 161
    check-cast v0, Lph3;

    .line 162
    .line 163
    iget-object v1, v0, Lph3;->c:Lz94;

    .line 164
    .line 165
    invoke-interface {v1}, Lz94;->d()Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object v1

    .line 169
    check-cast v1, Lwh3;

    .line 170
    .line 171
    invoke-virtual {v1}, Lwh3;->a()V

    .line 172
    .line 173
    .line 174
    iget-object v0, v0, Lph3;->b:Lz94;

    .line 175
    .line 176
    invoke-interface {v0}, Lz94;->d()Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object v0

    .line 180
    check-cast v0, Lgi3;

    .line 181
    .line 182
    invoke-virtual {v0}, Lgi3;->a()V

    .line 183
    .line 184
    .line 185
    return-object v2

    .line 186
    :pswitch_6
    iget-object v0, p0, Lw53;->b:Ljava/lang/Object;

    .line 187
    .line 188
    move-object v2, v0

    .line 189
    check-cast v2, Llg3;

    .line 190
    .line 191
    monitor-enter v2

    .line 192
    :try_start_3
    new-instance v1, Ljava/io/FileInputStream;

    .line 193
    .line 194
    iget-object v0, v2, Llg3;->a:Ljava/io/File;

    .line 195
    .line 196
    invoke-direct {v1, v0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_3
    .catch Ljava/io/FileNotFoundException; {:try_start_3 .. :try_end_3} :catch_2
    .catch Ljg3; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 197
    .line 198
    .line 199
    :try_start_4
    iget-object v0, v2, Llg3;->c:Lkg3;

    .line 200
    .line 201
    invoke-interface {v0, v1}, Lkg3;->m(Ljava/io/FileInputStream;)Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 205
    :try_start_5
    invoke-virtual {v1}, Ljava/io/FileInputStream;->close()V
    :try_end_5
    .catch Ljava/io/FileNotFoundException; {:try_start_5 .. :try_end_5} :catch_2
    .catch Ljg3; {:try_start_5 .. :try_end_5} :catch_1
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 206
    .line 207
    .line 208
    :try_start_6
    monitor-exit v2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 209
    goto :goto_3

    .line 210
    :catchall_2
    move-exception v0

    .line 211
    goto :goto_4

    .line 212
    :catch_0
    move-exception v0

    .line 213
    goto :goto_1

    .line 214
    :catch_1
    move-exception v0

    .line 215
    goto :goto_2

    .line 216
    :catchall_3
    move-exception v0

    .line 217
    move-object v3, v0

    .line 218
    :try_start_7
    invoke-virtual {v1}, Ljava/io/FileInputStream;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    .line 219
    .line 220
    .line 221
    goto :goto_0

    .line 222
    :catchall_4
    move-exception v0

    .line 223
    :try_start_8
    invoke-virtual {v3, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 224
    .line 225
    .line 226
    :goto_0
    throw v3
    :try_end_8
    .catch Ljava/io/FileNotFoundException; {:try_start_8 .. :try_end_8} :catch_2
    .catch Ljg3; {:try_start_8 .. :try_end_8} :catch_1
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_0
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    .line 227
    :goto_1
    :try_start_9
    iget-object v1, v2, Llg3;->d:Ljava/util/function/Function;

    .line 228
    .line 229
    new-instance v3, Ljg3;

    .line 230
    .line 231
    invoke-direct {v3, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 232
    .line 233
    .line 234
    invoke-interface {v1, v3}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    move-result-object v0

    .line 238
    monitor-exit v2

    .line 239
    goto :goto_3

    .line 240
    :goto_2
    iget-object v1, v2, Llg3;->d:Ljava/util/function/Function;

    .line 241
    .line 242
    invoke-interface {v1, v0}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    move-result-object v0

    .line 246
    monitor-exit v2

    .line 247
    goto :goto_3

    .line 248
    :catch_2
    iget-object v0, v2, Llg3;->c:Lkg3;

    .line 249
    .line 250
    invoke-interface {v0}, Lkg3;->h()Ljava/lang/Object;

    .line 251
    .line 252
    .line 253
    move-result-object v0

    .line 254
    monitor-exit v2

    .line 255
    :goto_3
    return-object v0

    .line 256
    :goto_4
    monitor-exit v2
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    .line 257
    throw v0

    .line 258
    :pswitch_7
    iget-object v0, p0, Lw53;->b:Ljava/lang/Object;

    .line 259
    .line 260
    check-cast v0, Lp21;

    .line 261
    .line 262
    iget-object v0, v0, Lp21;->f:Ljava/lang/Object;

    .line 263
    .line 264
    check-cast v0, Landroid/content/Context;

    .line 265
    .line 266
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 267
    .line 268
    .line 269
    move-result-object v2

    .line 270
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 271
    .line 272
    .line 273
    move-result-object v3

    .line 274
    invoke-virtual {v2, v3, v1}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 275
    .line 276
    .line 277
    move-result-object v1

    .line 278
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 279
    .line 280
    .line 281
    move-result-object v2

    .line 282
    iget v1, v1, Landroid/content/pm/PackageInfo;->versionCode:I

    .line 283
    .line 284
    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 285
    .line 286
    .line 287
    move-result-object v1

    .line 288
    invoke-static {v0, v2, v1}, Lg82;->w(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Lqr1;

    .line 289
    .line 290
    .line 291
    move-result-object v0

    .line 292
    return-object v0

    .line 293
    :pswitch_8
    iget-object v0, p0, Lw53;->b:Ljava/lang/Object;

    .line 294
    .line 295
    check-cast v0, Lp93;

    .line 296
    .line 297
    invoke-interface {v0}, Lp93;->a()V

    .line 298
    .line 299
    .line 300
    return-object v2

    .line 301
    :pswitch_9
    iget-object v0, p0, Lw53;->b:Ljava/lang/Object;

    .line 302
    .line 303
    check-cast v0, Lg33;

    .line 304
    .line 305
    new-instance v1, Lq33;

    .line 306
    .line 307
    iget-object v0, v0, Lg33;->c:Ljava/lang/Object;

    .line 308
    .line 309
    check-cast v0, Ljava/util/List;

    .line 310
    .line 311
    const/4 v2, 0x4

    .line 312
    invoke-direct {v1, v2, v0}, Lq33;-><init>(ILjava/lang/Object;)V

    .line 313
    .line 314
    .line 315
    return-object v1

    .line 316
    :pswitch_a
    new-instance v0, Lg63;

    .line 317
    .line 318
    iget-object v1, p0, Lw53;->b:Ljava/lang/Object;

    .line 319
    .line 320
    check-cast v1, Llq3;

    .line 321
    .line 322
    iget-object v1, v1, Llq3;->f:Ljava/lang/Object;

    .line 323
    .line 324
    check-cast v1, Ljava/lang/String;

    .line 325
    .line 326
    sget-object v3, Llq3;->g:Llq3;

    .line 327
    .line 328
    invoke-direct {v0, v1, v2}, Lg63;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 329
    .line 330
    .line 331
    return-object v0

    .line 332
    :pswitch_b
    iget-object v0, p0, Lw53;->b:Ljava/lang/Object;

    .line 333
    .line 334
    check-cast v0, Lo33;

    .line 335
    .line 336
    iget-object v0, v0, Lo33;->c:Landroid/content/Context;

    .line 337
    .line 338
    const-string v2, "phone"

    .line 339
    .line 340
    invoke-virtual {v0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 341
    .line 342
    .line 343
    move-result-object v2

    .line 344
    check-cast v2, Landroid/telephony/TelephonyManager;

    .line 345
    .line 346
    invoke-virtual {v2}, Landroid/telephony/TelephonyManager;->getNetworkOperator()Ljava/lang/String;

    .line 347
    .line 348
    .line 349
    move-result-object v4

    .line 350
    invoke-virtual {v2}, Landroid/telephony/TelephonyManager;->getPhoneType()I

    .line 351
    .line 352
    .line 353
    move-result v7

    .line 354
    sget-object v2, Lhg4;->C:Lhg4;

    .line 355
    .line 356
    iget-object v3, v2, Lhg4;->c:Llf4;

    .line 357
    .line 358
    const-string v3, "android.permission.ACCESS_NETWORK_STATE"

    .line 359
    .line 360
    invoke-static {v0, v3}, Llf4;->c(Landroid/content/Context;Ljava/lang/String;)Z

    .line 361
    .line 362
    .line 363
    move-result v3

    .line 364
    const/4 v5, -0x1

    .line 365
    if-eqz v3, :cond_1

    .line 366
    .line 367
    const-string v1, "connectivity"

    .line 368
    .line 369
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 370
    .line 371
    .line 372
    move-result-object v1

    .line 373
    check-cast v1, Landroid/net/ConnectivityManager;

    .line 374
    .line 375
    invoke-virtual {v1}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    .line 376
    .line 377
    .line 378
    move-result-object v3

    .line 379
    if-eqz v3, :cond_0

    .line 380
    .line 381
    invoke-virtual {v3}, Landroid/net/NetworkInfo;->getType()I

    .line 382
    .line 383
    .line 384
    move-result v5

    .line 385
    invoke-virtual {v3}, Landroid/net/NetworkInfo;->getDetailedState()Landroid/net/NetworkInfo$DetailedState;

    .line 386
    .line 387
    .line 388
    move-result-object v3

    .line 389
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 390
    .line 391
    .line 392
    move-result v3

    .line 393
    move v10, v5

    .line 394
    move v5, v3

    .line 395
    move v3, v10

    .line 396
    goto :goto_5

    .line 397
    :cond_0
    move v3, v5

    .line 398
    :goto_5
    invoke-virtual {v1}, Landroid/net/ConnectivityManager;->isActiveNetworkMetered()Z

    .line 399
    .line 400
    .line 401
    move-result v1

    .line 402
    :goto_6
    move v8, v1

    .line 403
    move v9, v5

    .line 404
    move v5, v3

    .line 405
    goto :goto_7

    .line 406
    :cond_1
    const/4 v3, -0x2

    .line 407
    goto :goto_6

    .line 408
    :goto_7
    new-instance v3, Lv53;

    .line 409
    .line 410
    iget-object v1, v2, Lhg4;->f:Lnh4;

    .line 411
    .line 412
    invoke-virtual {v1, v0}, Lbd2;->Y(Landroid/content/Context;)I

    .line 413
    .line 414
    .line 415
    move-result v6

    .line 416
    invoke-direct/range {v3 .. v9}, Lv53;-><init>(Ljava/lang/String;IIIZI)V

    .line 417
    .line 418
    .line 419
    return-object v3

    .line 420
    nop

    .line 421
    :pswitch_data_0
    .packed-switch 0x0
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
