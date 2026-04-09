.class public final synthetic Llz1;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lll3;
.implements Ltz2;


# instance fields
.field public final synthetic f:I

.field public final synthetic g:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;I)V
    .locals 0

    .line 1
    iput p2, p0, Llz1;->f:I

    .line 2
    .line 3
    iput-object p1, p0, Llz1;->g:Landroid/content/Context;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 14

    .line 1
    iget v0, p0, Llz1;->f:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x5

    .line 5
    const/4 v3, 0x3

    .line 6
    const/4 v4, 0x0

    .line 7
    const/4 v5, 0x0

    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Llz1;->g:Landroid/content/Context;

    .line 12
    .line 13
    sget-object v1, Lxj4;->s:Lsn3;

    .line 14
    .line 15
    const-class v6, Lxj4;

    .line 16
    .line 17
    monitor-enter v6

    .line 18
    :try_start_0
    sget-object v1, Lxj4;->y:Lxj4;

    .line 19
    .line 20
    if-nez v1, :cond_1

    .line 21
    .line 22
    if-nez v0, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    :goto_0
    new-instance v0, Ljava/util/HashMap;

    .line 30
    .line 31
    const/16 v1, 0x8

    .line 32
    .line 33
    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    .line 34
    .line 35
    .line 36
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    const-wide/32 v7, 0xf4240

    .line 41
    .line 42
    .line 43
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 44
    .line 45
    .line 46
    move-result-object v5

    .line 47
    invoke-virtual {v0, v1, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    const/4 v1, 0x2

    .line 51
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 61
    .line 62
    .line 63
    move-result-object v5

    .line 64
    invoke-virtual {v0, v1, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    invoke-virtual {v0, v1, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    const/4 v1, 0x4

    .line 75
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    invoke-virtual {v0, v1, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    invoke-virtual {v0, v1, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    const/16 v1, 0xa

    .line 90
    .line 91
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    invoke-virtual {v0, v1, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    const/16 v1, 0x9

    .line 99
    .line 100
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    invoke-virtual {v0, v1, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    const/4 v1, 0x7

    .line 108
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    invoke-virtual {v0, v1, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    new-instance v1, Lxj4;

    .line 116
    .line 117
    invoke-direct {v1, v4, v0}, Lxj4;-><init>(Landroid/content/Context;Ljava/util/HashMap;)V

    .line 118
    .line 119
    .line 120
    sput-object v1, Lxj4;->y:Lxj4;

    .line 121
    .line 122
    goto :goto_1

    .line 123
    :catchall_0
    move-exception v0

    .line 124
    goto :goto_2

    .line 125
    :cond_1
    :goto_1
    sget-object v0, Lxj4;->y:Lxj4;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 126
    .line 127
    monitor-exit v6

    .line 128
    return-object v0

    .line 129
    :goto_2
    :try_start_1
    monitor-exit v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 130
    throw v0

    .line 131
    :pswitch_0
    sget-object v0, Lm54;->f:Lkj1;

    .line 132
    .line 133
    iget-boolean v2, v0, Lkj1;->g:Z

    .line 134
    .line 135
    if-eqz v2, :cond_2

    .line 136
    .line 137
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 138
    .line 139
    goto/16 :goto_3

    .line 140
    .line 141
    :cond_2
    iget-object v2, p0, Llz1;->g:Landroid/content/Context;

    .line 142
    .line 143
    invoke-virtual {v2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 144
    .line 145
    .line 146
    move-result-object v2

    .line 147
    const-string v3, "Application Context cannot be null"

    .line 148
    .line 149
    if-eqz v2, :cond_8

    .line 150
    .line 151
    iget-boolean v3, v0, Lkj1;->g:Z

    .line 152
    .line 153
    if-nez v3, :cond_7

    .line 154
    .line 155
    iput-boolean v1, v0, Lkj1;->g:Z

    .line 156
    .line 157
    invoke-static {}, Lpc3;->a()Lpc3;

    .line 158
    .line 159
    .line 160
    move-result-object v3

    .line 161
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 162
    .line 163
    .line 164
    new-instance v4, Landroid/os/Handler;

    .line 165
    .line 166
    invoke-direct {v4}, Landroid/os/Handler;-><init>()V

    .line 167
    .line 168
    .line 169
    new-instance v6, Lfc3;

    .line 170
    .line 171
    invoke-direct {v6, v4, v2, v3}, Lfc3;-><init>(Landroid/os/Handler;Landroid/content/Context;Lpc3;)V

    .line 172
    .line 173
    .line 174
    iput-object v6, v3, Lpc3;->b:Lfc3;

    .line 175
    .line 176
    sget-object v3, Lhc3;->i:Lhc3;

    .line 177
    .line 178
    instance-of v4, v2, Landroid/app/Application;

    .line 179
    .line 180
    if-eqz v4, :cond_3

    .line 181
    .line 182
    move-object v6, v2

    .line 183
    check-cast v6, Landroid/app/Application;

    .line 184
    .line 185
    invoke-virtual {v6, v3}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 186
    .line 187
    .line 188
    :cond_3
    const-string v3, "uimode"

    .line 189
    .line 190
    invoke-virtual {v2, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object v3

    .line 194
    check-cast v3, Landroid/app/UiModeManager;

    .line 195
    .line 196
    sput-object v3, Li41;->C:Landroid/app/UiModeManager;

    .line 197
    .line 198
    sget-object v3, Lvc3;->a:Landroid/view/WindowManager;

    .line 199
    .line 200
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 201
    .line 202
    .line 203
    move-result-object v3

    .line 204
    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 205
    .line 206
    .line 207
    move-result-object v3

    .line 208
    iget v3, v3, Landroid/util/DisplayMetrics;->density:F

    .line 209
    .line 210
    sput v3, Lvc3;->c:F

    .line 211
    .line 212
    const-string v3, "window"

    .line 213
    .line 214
    invoke-virtual {v2, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object v3

    .line 218
    check-cast v3, Landroid/view/WindowManager;

    .line 219
    .line 220
    sput-object v3, Lvc3;->a:Landroid/view/WindowManager;

    .line 221
    .line 222
    new-instance v3, Landroid/content/IntentFilter;

    .line 223
    .line 224
    const-string v6, "android.media.action.HDMI_AUDIO_PLUG"

    .line 225
    .line 226
    invoke-direct {v3, v6}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 227
    .line 228
    .line 229
    new-instance v6, Lwc3;

    .line 230
    .line 231
    invoke-direct {v6, v5}, Lwc3;-><init>(I)V

    .line 232
    .line 233
    .line 234
    invoke-virtual {v2, v6, v3}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 235
    .line 236
    .line 237
    sget-object v3, Lnc3;->g:Lnc3;

    .line 238
    .line 239
    invoke-virtual {v2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 240
    .line 241
    .line 242
    move-result-object v6

    .line 243
    iput-object v6, v3, Lnc3;->f:Landroid/content/Context;

    .line 244
    .line 245
    sget-object v3, Lgc3;->e:Lgc3;

    .line 246
    .line 247
    iget-boolean v6, v3, Lgc3;->a:Z

    .line 248
    .line 249
    if-nez v6, :cond_6

    .line 250
    .line 251
    iget-object v6, v3, Lgc3;->d:Ljava/lang/Object;

    .line 252
    .line 253
    check-cast v6, Lkc3;

    .line 254
    .line 255
    if-eqz v4, :cond_4

    .line 256
    .line 257
    move-object v4, v2

    .line 258
    check-cast v4, Landroid/app/Application;

    .line 259
    .line 260
    invoke-virtual {v4, v6}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 261
    .line 262
    .line 263
    :cond_4
    iput-object v3, v6, Lkc3;->h:Ljc3;

    .line 264
    .line 265
    iput-boolean v1, v6, Lkc3;->f:Z

    .line 266
    .line 267
    new-instance v4, Landroid/app/ActivityManager$RunningAppProcessInfo;

    .line 268
    .line 269
    invoke-direct {v4}, Landroid/app/ActivityManager$RunningAppProcessInfo;-><init>()V

    .line 270
    .line 271
    .line 272
    invoke-static {v4}, Landroid/app/ActivityManager;->getMyMemoryState(Landroid/app/ActivityManager$RunningAppProcessInfo;)V

    .line 273
    .line 274
    .line 275
    iget v4, v4, Landroid/app/ActivityManager$RunningAppProcessInfo;->importance:I

    .line 276
    .line 277
    const/16 v7, 0x64

    .line 278
    .line 279
    if-ne v4, v7, :cond_5

    .line 280
    .line 281
    move v5, v1

    .line 282
    :cond_5
    iput-boolean v5, v6, Lkc3;->g:Z

    .line 283
    .line 284
    iget-boolean v4, v6, Lkc3;->g:Z

    .line 285
    .line 286
    iput-boolean v4, v3, Lgc3;->b:Z

    .line 287
    .line 288
    iput-boolean v1, v3, Lgc3;->a:Z

    .line 289
    .line 290
    :cond_6
    sget-object v1, Lqc3;->d:Lqc3;

    .line 291
    .line 292
    new-instance v3, Ljava/lang/ref/WeakReference;

    .line 293
    .line 294
    invoke-direct {v3, v2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 295
    .line 296
    .line 297
    iput-object v3, v1, Lqc3;->a:Ljava/lang/ref/WeakReference;

    .line 298
    .line 299
    new-instance v1, Landroid/content/IntentFilter;

    .line 300
    .line 301
    const-string v3, "android.intent.action.SCREEN_OFF"

    .line 302
    .line 303
    invoke-direct {v1, v3}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 304
    .line 305
    .line 306
    const-string v3, "android.intent.action.SCREEN_ON"

    .line 307
    .line 308
    invoke-virtual {v1, v3}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 309
    .line 310
    .line 311
    new-instance v3, Ld6;

    .line 312
    .line 313
    invoke-direct {v3}, Ld6;-><init>()V

    .line 314
    .line 315
    .line 316
    invoke-virtual {v2, v3, v1}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 317
    .line 318
    .line 319
    :cond_7
    iget-boolean v0, v0, Lkj1;->g:Z

    .line 320
    .line 321
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 322
    .line 323
    .line 324
    move-result-object v0

    .line 325
    :goto_3
    return-object v0

    .line 326
    :cond_8
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 327
    .line 328
    invoke-direct {v0, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 329
    .line 330
    .line 331
    throw v0

    .line 332
    :pswitch_1
    sget-object v0, Lmz1;->a:Liz1;

    .line 333
    .line 334
    sget-object v0, Ltw1;->e:Ltw1;

    .line 335
    .line 336
    iget-object v0, v0, Ltw1;->c:Lkz1;

    .line 337
    .line 338
    iget-object v6, p0, Llz1;->g:Landroid/content/Context;

    .line 339
    .line 340
    iget-boolean v7, v0, Lkz1;->c:Z

    .line 341
    .line 342
    if-eqz v7, :cond_9

    .line 343
    .line 344
    goto/16 :goto_c

    .line 345
    .line 346
    :cond_9
    iget-object v7, v0, Lkz1;->a:Ljava/lang/Object;

    .line 347
    .line 348
    monitor-enter v7

    .line 349
    :try_start_2
    iget-boolean v8, v0, Lkz1;->c:Z

    .line 350
    .line 351
    if-eqz v8, :cond_a

    .line 352
    .line 353
    monitor-exit v7

    .line 354
    goto/16 :goto_c

    .line 355
    .line 356
    :catchall_1
    move-exception v0

    .line 357
    goto/16 :goto_e

    .line 358
    .line 359
    :cond_a
    iget-boolean v8, v0, Lkz1;->d:Z

    .line 360
    .line 361
    if-nez v8, :cond_b

    .line 362
    .line 363
    iput-boolean v1, v0, Lkz1;->d:Z

    .line 364
    .line 365
    :cond_b
    invoke-virtual {v6}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 366
    .line 367
    .line 368
    move-result-object v8

    .line 369
    const-string v9, "com.google.android.gms"

    .line 370
    .line 371
    invoke-static {v8, v9}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 372
    .line 373
    .line 374
    move-result v8

    .line 375
    iput-boolean v8, v0, Lkz1;->i:Z

    .line 376
    .line 377
    invoke-virtual {v6}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 378
    .line 379
    .line 380
    move-result-object v8

    .line 381
    if-eqz v8, :cond_c

    .line 382
    .line 383
    invoke-virtual {v6}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 384
    .line 385
    .line 386
    move-result-object v6

    .line 387
    :cond_c
    iput-object v6, v0, Lkz1;->g:Landroid/content/Context;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 388
    .line 389
    :try_start_3
    invoke-static {v6}, Lza1;->a(Landroid/content/Context;)Lzj0;

    .line 390
    .line 391
    .line 392
    move-result-object v6

    .line 393
    iget-object v8, v0, Lkz1;->g:Landroid/content/Context;

    .line 394
    .line 395
    invoke-virtual {v8}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 396
    .line 397
    .line 398
    move-result-object v8

    .line 399
    const/16 v9, 0x80

    .line 400
    .line 401
    invoke-virtual {v6, v8, v9}, Lzj0;->a(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    .line 402
    .line 403
    .line 404
    move-result-object v6

    .line 405
    iget-object v6, v6, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    .line 406
    .line 407
    iput-object v6, v0, Lkz1;->f:Landroid/os/Bundle;
    :try_end_3
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_3 .. :try_end_3} :catch_0
    .catch Ljava/lang/NullPointerException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 408
    .line 409
    :catch_0
    :try_start_4
    iget-object v6, v0, Lkz1;->g:Landroid/content/Context;

    .line 410
    .line 411
    sget v8, Loz;->c:I
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 412
    .line 413
    :try_start_5
    const-string v8, "com.google.android.gms"

    .line 414
    .line 415
    invoke-virtual {v6, v8, v3}, Landroid/content/Context;->createPackageContext(Ljava/lang/String;I)Landroid/content/Context;

    .line 416
    .line 417
    .line 418
    move-result-object v3
    :try_end_5
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_5 .. :try_end_5} :catch_1
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 419
    goto :goto_4

    .line 420
    :catch_1
    move-object v3, v4

    .line 421
    :goto_4
    if-nez v3, :cond_d

    .line 422
    .line 423
    if-eqz v6, :cond_d

    .line 424
    .line 425
    :try_start_6
    invoke-virtual {v6}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 426
    .line 427
    .line 428
    move-result-object v3

    .line 429
    if-eqz v3, :cond_e

    .line 430
    .line 431
    :cond_d
    move-object v6, v3

    .line 432
    goto :goto_5

    .line 433
    :catchall_2
    move-exception v1

    .line 434
    goto/16 :goto_d

    .line 435
    .line 436
    :cond_e
    :goto_5
    if-eqz v6, :cond_f

    .line 437
    .line 438
    sget-object v3, Ltw1;->e:Ltw1;

    .line 439
    .line 440
    iget-object v3, v3, Ltw1;->b:Lus0;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 441
    .line 442
    :try_start_7
    const-string v3, "google_ads_flags"

    .line 443
    .line 444
    invoke-virtual {v6, v3, v5}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 445
    .line 446
    .line 447
    move-result-object v3
    :try_end_7
    .catch Ljava/lang/IllegalStateException; {:try_start_7 .. :try_end_7} :catch_2
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 448
    goto :goto_6

    .line 449
    :catch_2
    :try_start_8
    invoke-static {v2}, Lgi2;->q0(I)Z

    .line 450
    .line 451
    .line 452
    :cond_f
    move-object v3, v4

    .line 453
    :goto_6
    if-eqz v3, :cond_10

    .line 454
    .line 455
    new-instance v8, Ljz1;

    .line 456
    .line 457
    invoke-direct {v8, v0, v3}, Ljz1;-><init>(Lkz1;Landroid/content/SharedPreferences;)V

    .line 458
    .line 459
    .line 460
    sget-object v3, Ll12;->a:Ljava/util/concurrent/atomic/AtomicReference;

    .line 461
    .line 462
    invoke-virtual {v3, v8}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 463
    .line 464
    .line 465
    :cond_10
    iget-boolean v3, v0, Lkz1;->i:Z

    .line 466
    .line 467
    const-wide/16 v8, 0x0

    .line 468
    .line 469
    if-nez v3, :cond_11

    .line 470
    .line 471
    sget-object v3, Lm02;->d:Lso1;

    .line 472
    .line 473
    invoke-virtual {v3}, Lso1;->w()Ljava/lang/Object;

    .line 474
    .line 475
    .line 476
    move-result-object v10

    .line 477
    check-cast v10, Ljava/lang/Long;

    .line 478
    .line 479
    invoke-virtual {v10}, Ljava/lang/Long;->longValue()J

    .line 480
    .line 481
    .line 482
    move-result-wide v10

    .line 483
    cmp-long v10, v10, v8

    .line 484
    .line 485
    if-lez v10, :cond_11

    .line 486
    .line 487
    iget-object v10, v0, Lkz1;->g:Landroid/content/Context;

    .line 488
    .line 489
    const-string v11, "crash_without_write"

    .line 490
    .line 491
    invoke-static {v10, v11}, Li41;->S(Landroid/content/Context;Ljava/lang/String;)I

    .line 492
    .line 493
    .line 494
    move-result v10

    .line 495
    int-to-long v10, v10

    .line 496
    invoke-virtual {v3}, Lso1;->w()Ljava/lang/Object;

    .line 497
    .line 498
    .line 499
    move-result-object v3

    .line 500
    check-cast v3, Ljava/lang/Long;

    .line 501
    .line 502
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 503
    .line 504
    .line 505
    move-result-wide v12

    .line 506
    cmp-long v3, v10, v12

    .line 507
    .line 508
    if-ltz v3, :cond_11

    .line 509
    .line 510
    iput-boolean v1, v0, Lkz1;->j:Z

    .line 511
    .line 512
    iput-boolean v1, v0, Lkz1;->c:Z
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    .line 513
    .line 514
    :try_start_9
    iput-boolean v5, v0, Lkz1;->d:Z

    .line 515
    .line 516
    iget-object v0, v0, Lkz1;->b:Landroid/os/ConditionVariable;

    .line 517
    .line 518
    :goto_7
    invoke-virtual {v0}, Landroid/os/ConditionVariable;->open()V

    .line 519
    .line 520
    .line 521
    monitor-exit v7
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    .line 522
    goto/16 :goto_c

    .line 523
    .line 524
    :cond_11
    :try_start_a
    iget-boolean v3, v0, Lkz1;->i:Z

    .line 525
    .line 526
    if-nez v3, :cond_12

    .line 527
    .line 528
    sget-object v3, Lm02;->f:Lso1;

    .line 529
    .line 530
    invoke-virtual {v3}, Lso1;->w()Ljava/lang/Object;

    .line 531
    .line 532
    .line 533
    move-result-object v10

    .line 534
    check-cast v10, Ljava/lang/Long;

    .line 535
    .line 536
    invoke-virtual {v10}, Ljava/lang/Long;->longValue()J

    .line 537
    .line 538
    .line 539
    move-result-wide v10

    .line 540
    cmp-long v8, v10, v8

    .line 541
    .line 542
    if-lez v8, :cond_12

    .line 543
    .line 544
    iget-object v8, v0, Lkz1;->g:Landroid/content/Context;

    .line 545
    .line 546
    const-string v9, "init_without_write"

    .line 547
    .line 548
    invoke-static {v8, v9}, Li41;->S(Landroid/content/Context;Ljava/lang/String;)I

    .line 549
    .line 550
    .line 551
    move-result v8

    .line 552
    int-to-long v8, v8

    .line 553
    invoke-virtual {v3}, Lso1;->w()Ljava/lang/Object;

    .line 554
    .line 555
    .line 556
    move-result-object v3

    .line 557
    check-cast v3, Ljava/lang/Long;

    .line 558
    .line 559
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 560
    .line 561
    .line 562
    move-result-wide v10

    .line 563
    cmp-long v3, v8, v10

    .line 564
    .line 565
    if-ltz v3, :cond_12

    .line 566
    .line 567
    iput-boolean v1, v0, Lkz1;->j:Z

    .line 568
    .line 569
    iput-boolean v1, v0, Lkz1;->c:Z
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_2

    .line 570
    .line 571
    :try_start_b
    iput-boolean v5, v0, Lkz1;->d:Z

    .line 572
    .line 573
    iget-object v0, v0, Lkz1;->b:Landroid/os/ConditionVariable;
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_1

    .line 574
    .line 575
    goto :goto_7

    .line 576
    :cond_12
    :try_start_c
    iget-object v3, v0, Lkz1;->g:Landroid/content/Context;

    .line 577
    .line 578
    sget-object v8, Ls02;->i:Lso1;

    .line 579
    .line 580
    invoke-virtual {v8}, Lso1;->w()Ljava/lang/Object;

    .line 581
    .line 582
    .line 583
    move-result-object v8

    .line 584
    check-cast v8, Ljava/lang/Boolean;

    .line 585
    .line 586
    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    .line 587
    .line 588
    .line 589
    move-result v8

    .line 590
    if-eqz v8, :cond_13

    .line 591
    .line 592
    goto :goto_8

    .line 593
    :cond_13
    sget-object v8, Ls02;->j:Lso1;

    .line 594
    .line 595
    invoke-virtual {v8}, Lso1;->w()Ljava/lang/Object;

    .line 596
    .line 597
    .line 598
    move-result-object v8

    .line 599
    check-cast v8, Ljava/lang/Boolean;

    .line 600
    .line 601
    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    .line 602
    .line 603
    .line 604
    move-result v8

    .line 605
    if-eqz v8, :cond_14

    .line 606
    .line 607
    const-string v8, "admob"

    .line 608
    .line 609
    invoke-virtual {v3, v8, v5}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 610
    .line 611
    .line 612
    move-result-object v3

    .line 613
    if-eqz v3, :cond_14

    .line 614
    .line 615
    invoke-static {}, Landroid/os/StrictMode;->getThreadPolicy()Landroid/os/StrictMode$ThreadPolicy;

    .line 616
    .line 617
    .line 618
    move-result-object v8
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_2

    .line 619
    :try_start_d
    new-instance v9, Landroid/os/StrictMode$ThreadPolicy$Builder;

    .line 620
    .line 621
    invoke-direct {v9, v8}, Landroid/os/StrictMode$ThreadPolicy$Builder;-><init>(Landroid/os/StrictMode$ThreadPolicy;)V

    .line 622
    .line 623
    .line 624
    invoke-virtual {v9}, Landroid/os/StrictMode$ThreadPolicy$Builder;->permitDiskReads()Landroid/os/StrictMode$ThreadPolicy$Builder;

    .line 625
    .line 626
    .line 627
    move-result-object v9

    .line 628
    invoke-virtual {v9}, Landroid/os/StrictMode$ThreadPolicy$Builder;->permitDiskWrites()Landroid/os/StrictMode$ThreadPolicy$Builder;

    .line 629
    .line 630
    .line 631
    move-result-object v9

    .line 632
    invoke-virtual {v9}, Landroid/os/StrictMode$ThreadPolicy$Builder;->build()Landroid/os/StrictMode$ThreadPolicy;

    .line 633
    .line 634
    .line 635
    move-result-object v9

    .line 636
    invoke-static {v9}, Landroid/os/StrictMode;->setThreadPolicy(Landroid/os/StrictMode$ThreadPolicy;)V

    .line 637
    .line 638
    .line 639
    const-string v9, "app_settings_json"

    .line 640
    .line 641
    const-string v10, "{}"

    .line 642
    .line 643
    invoke-interface {v3, v9, v10}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 644
    .line 645
    .line 646
    move-result-object v3
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_3

    .line 647
    :try_start_e
    invoke-static {v8}, Landroid/os/StrictMode;->setThreadPolicy(Landroid/os/StrictMode$ThreadPolicy;)V
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_2

    .line 648
    .line 649
    .line 650
    :try_start_f
    new-instance v8, Lorg/json/JSONObject;

    .line 651
    .line 652
    invoke-direct {v8, v3}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 653
    .line 654
    .line 655
    const-string v3, "local_flags_enabled"

    .line 656
    .line 657
    invoke-virtual {v8, v3}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    .line 658
    .line 659
    .line 660
    move-result v3
    :try_end_f
    .catch Lorg/json/JSONException; {:try_start_f .. :try_end_f} :catch_3
    .catchall {:try_start_f .. :try_end_f} :catchall_2

    .line 661
    if-eqz v3, :cond_14

    .line 662
    .line 663
    :goto_8
    :try_start_10
    iget-object v6, v0, Lkz1;->g:Landroid/content/Context;

    .line 664
    .line 665
    goto :goto_9

    .line 666
    :catchall_3
    move-exception v1

    .line 667
    invoke-static {v8}, Landroid/os/StrictMode;->setThreadPolicy(Landroid/os/StrictMode$ThreadPolicy;)V

    .line 668
    .line 669
    .line 670
    throw v1
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_2

    .line 671
    :catch_3
    :cond_14
    :goto_9
    if-nez v6, :cond_15

    .line 672
    .line 673
    :try_start_11
    iput-boolean v5, v0, Lkz1;->d:Z

    .line 674
    .line 675
    iget-object v0, v0, Lkz1;->b:Landroid/os/ConditionVariable;
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_1

    .line 676
    .line 677
    goto/16 :goto_7

    .line 678
    .line 679
    :cond_15
    :try_start_12
    sget-object v3, Ltw1;->e:Ltw1;

    .line 680
    .line 681
    iget-object v8, v3, Ltw1;->b:Lus0;
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_2

    .line 682
    .line 683
    :try_start_13
    const-string v8, "google_ads_flags"

    .line 684
    .line 685
    invoke-virtual {v6, v8, v5}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 686
    .line 687
    .line 688
    move-result-object v2
    :try_end_13
    .catch Ljava/lang/IllegalStateException; {:try_start_13 .. :try_end_13} :catch_4
    .catchall {:try_start_13 .. :try_end_13} :catchall_2

    .line 689
    goto :goto_a

    .line 690
    :catch_4
    :try_start_14
    invoke-static {v2}, Lgi2;->q0(I)Z

    .line 691
    .line 692
    .line 693
    move-object v2, v4

    .line 694
    :goto_a
    iput-object v2, v0, Lkz1;->e:Landroid/content/SharedPreferences;

    .line 695
    .line 696
    iget-boolean v2, v0, Lkz1;->i:Z

    .line 697
    .line 698
    if-nez v2, :cond_16

    .line 699
    .line 700
    sget-object v2, Ls02;->c:Lso1;

    .line 701
    .line 702
    invoke-virtual {v2}, Lso1;->w()Ljava/lang/Object;

    .line 703
    .line 704
    .line 705
    move-result-object v2

    .line 706
    check-cast v2, Ljava/lang/Boolean;

    .line 707
    .line 708
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 709
    .line 710
    .line 711
    move-result v2

    .line 712
    if-eqz v2, :cond_16

    .line 713
    .line 714
    iget-object v2, v3, Ltw1;->d:Lhz1;

    .line 715
    .line 716
    iget-object v3, v0, Lkz1;->g:Landroid/content/Context;

    .line 717
    .line 718
    invoke-virtual {v2, v3}, Lhz1;->a(Landroid/content/Context;)V

    .line 719
    .line 720
    .line 721
    :cond_16
    sget-object v2, Ls02;->b:Lso1;

    .line 722
    .line 723
    invoke-virtual {v2}, Lso1;->w()Ljava/lang/Object;

    .line 724
    .line 725
    .line 726
    move-result-object v2

    .line 727
    check-cast v2, Ljava/lang/Boolean;

    .line 728
    .line 729
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 730
    .line 731
    .line 732
    move-result v2

    .line 733
    if-nez v2, :cond_17

    .line 734
    .line 735
    iget-object v2, v0, Lkz1;->e:Landroid/content/SharedPreferences;

    .line 736
    .line 737
    if-eqz v2, :cond_17

    .line 738
    .line 739
    invoke-interface {v2, v0}, Landroid/content/SharedPreferences;->registerOnSharedPreferenceChangeListener(Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;)V

    .line 740
    .line 741
    .line 742
    :cond_17
    iget-object v2, v0, Lkz1;->e:Landroid/content/SharedPreferences;
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_2

    .line 743
    .line 744
    if-eqz v2, :cond_18

    .line 745
    .line 746
    :try_start_15
    invoke-static {}, Landroid/os/StrictMode;->getThreadPolicy()Landroid/os/StrictMode$ThreadPolicy;

    .line 747
    .line 748
    .line 749
    move-result-object v3
    :try_end_15
    .catch Lorg/json/JSONException; {:try_start_15 .. :try_end_15} :catch_5
    .catchall {:try_start_15 .. :try_end_15} :catchall_2

    .line 750
    :try_start_16
    new-instance v6, Landroid/os/StrictMode$ThreadPolicy$Builder;

    .line 751
    .line 752
    invoke-direct {v6, v3}, Landroid/os/StrictMode$ThreadPolicy$Builder;-><init>(Landroid/os/StrictMode$ThreadPolicy;)V

    .line 753
    .line 754
    .line 755
    invoke-virtual {v6}, Landroid/os/StrictMode$ThreadPolicy$Builder;->permitDiskReads()Landroid/os/StrictMode$ThreadPolicy$Builder;

    .line 756
    .line 757
    .line 758
    move-result-object v6

    .line 759
    invoke-virtual {v6}, Landroid/os/StrictMode$ThreadPolicy$Builder;->permitDiskWrites()Landroid/os/StrictMode$ThreadPolicy$Builder;

    .line 760
    .line 761
    .line 762
    move-result-object v6

    .line 763
    invoke-virtual {v6}, Landroid/os/StrictMode$ThreadPolicy$Builder;->build()Landroid/os/StrictMode$ThreadPolicy;

    .line 764
    .line 765
    .line 766
    move-result-object v6

    .line 767
    invoke-static {v6}, Landroid/os/StrictMode;->setThreadPolicy(Landroid/os/StrictMode$ThreadPolicy;)V

    .line 768
    .line 769
    .line 770
    const-string v6, "flag_configuration"

    .line 771
    .line 772
    const-string v8, "{}"

    .line 773
    .line 774
    invoke-interface {v2, v6, v8}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 775
    .line 776
    .line 777
    move-result-object v2
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_4

    .line 778
    :try_start_17
    invoke-static {v3}, Landroid/os/StrictMode;->setThreadPolicy(Landroid/os/StrictMode$ThreadPolicy;)V

    .line 779
    .line 780
    .line 781
    new-instance v3, Lorg/json/JSONObject;

    .line 782
    .line 783
    invoke-direct {v3, v2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 784
    .line 785
    .line 786
    iput-object v3, v0, Lkz1;->h:Lorg/json/JSONObject;

    .line 787
    .line 788
    goto :goto_b

    .line 789
    :catchall_4
    move-exception v2

    .line 790
    invoke-static {v3}, Landroid/os/StrictMode;->setThreadPolicy(Landroid/os/StrictMode$ThreadPolicy;)V

    .line 791
    .line 792
    .line 793
    throw v2
    :try_end_17
    .catch Lorg/json/JSONException; {:try_start_17 .. :try_end_17} :catch_5
    .catchall {:try_start_17 .. :try_end_17} :catchall_2

    .line 794
    :catch_5
    :cond_18
    :goto_b
    :try_start_18
    iput-boolean v1, v0, Lkz1;->c:Z
    :try_end_18
    .catchall {:try_start_18 .. :try_end_18} :catchall_2

    .line 795
    .line 796
    :try_start_19
    iput-boolean v5, v0, Lkz1;->d:Z

    .line 797
    .line 798
    iget-object v0, v0, Lkz1;->b:Landroid/os/ConditionVariable;

    .line 799
    .line 800
    invoke-virtual {v0}, Landroid/os/ConditionVariable;->open()V

    .line 801
    .line 802
    .line 803
    monitor-exit v7

    .line 804
    :goto_c
    return-object v4

    .line 805
    :goto_d
    iput-boolean v5, v0, Lkz1;->d:Z

    .line 806
    .line 807
    iget-object v0, v0, Lkz1;->b:Landroid/os/ConditionVariable;

    .line 808
    .line 809
    invoke-virtual {v0}, Landroid/os/ConditionVariable;->open()V

    .line 810
    .line 811
    .line 812
    throw v1

    .line 813
    :goto_e
    monitor-exit v7
    :try_end_19
    .catchall {:try_start_19 .. :try_end_19} :catchall_1

    .line 814
    throw v0

    .line 815
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
