.class public final synthetic Lgs1;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x5

    iput v0, p0, Lgs1;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lgs1;->c:Ljava/lang/Object;

    iput-object p2, p0, Lgs1;->b:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 2
    iput p3, p0, Lgs1;->a:I

    iput-object p1, p0, Lgs1;->b:Ljava/lang/Object;

    iput-object p2, p0, Lgs1;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lug0;Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, Lgs1;->a:I

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lgs1;->c:Ljava/lang/Object;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lgs1;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 12

    .line 1
    iget v0, p0, Lgs1;->a:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x1

    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    sget-object v0, Llf4;->l:Li63;

    .line 10
    .line 11
    iget-object v0, p0, Lgs1;->c:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Landroid/content/Context;

    .line 14
    .line 15
    const-string v2, "com.google.android.gms.ads.db"

    .line 16
    .line 17
    invoke-virtual {v0, v2}, Landroid/content/Context;->getDatabasePath(Ljava/lang/String;)Ljava/io/File;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    iget-object v2, p0, Lgs1;->b:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v2, Landroid/webkit/WebSettings;

    .line 28
    .line 29
    invoke-virtual {v2, v0}, Landroid/webkit/WebSettings;->setDatabasePath(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v2, v3}, Landroid/webkit/WebSettings;->setDatabaseEnabled(Z)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v2, v3}, Landroid/webkit/WebSettings;->setDomStorageEnabled(Z)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v2, v1}, Landroid/webkit/WebSettings;->setDisplayZoomControls(Z)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v2, v3}, Landroid/webkit/WebSettings;->setBuiltInZoomControls(Z)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v2, v3}, Landroid/webkit/WebSettings;->setSupportZoom(Z)V

    .line 45
    .line 46
    .line 47
    sget-object v0, Lmz1;->T0:Liz1;

    .line 48
    .line 49
    sget-object v3, Ltw1;->e:Ltw1;

    .line 50
    .line 51
    iget-object v3, v3, Ltw1;->c:Lkz1;

    .line 52
    .line 53
    invoke-virtual {v3, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    check-cast v0, Ljava/lang/Boolean;

    .line 58
    .line 59
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    if-eqz v0, :cond_0

    .line 64
    .line 65
    const/16 v0, 0x64

    .line 66
    .line 67
    invoke-virtual {v2, v0}, Landroid/webkit/WebSettings;->setTextZoom(I)V

    .line 68
    .line 69
    .line 70
    :cond_0
    invoke-virtual {v2, v1}, Landroid/webkit/WebSettings;->setAllowContentAccess(Z)V

    .line 71
    .line 72
    .line 73
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 74
    .line 75
    return-object v0

    .line 76
    :pswitch_0
    iget-object v0, p0, Lgs1;->b:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v0, Lgb4;

    .line 79
    .line 80
    iget-object v1, p0, Lgs1;->c:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast v1, Landroid/content/Context;

    .line 83
    .line 84
    invoke-virtual {v0, v1}, Lgb4;->k(Landroid/content/Context;)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    return-object v0

    .line 89
    :pswitch_1
    iget-object v0, p0, Lgs1;->b:Ljava/lang/Object;

    .line 90
    .line 91
    check-cast v0, Lmj3;

    .line 92
    .line 93
    iget-object v1, p0, Lgs1;->c:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast v1, Landroid/content/Context;

    .line 96
    .line 97
    new-instance v2, Ljava/util/HashMap;

    .line 98
    .line 99
    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 100
    .line 101
    .line 102
    new-instance v3, Lgi;

    .line 103
    .line 104
    invoke-direct {v3, v0, v2, v1}, Lgi;-><init>(Lmj3;Ljava/util/HashMap;Landroid/content/Context;)V

    .line 105
    .line 106
    .line 107
    iget-object v1, v0, Lmj3;->e:Lgk3;

    .line 108
    .line 109
    const/16 v4, 0x4e8a

    .line 110
    .line 111
    invoke-virtual {v1, v4, v3}, Lgk3;->e(ILjava/lang/Runnable;)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v0, v2}, Lmj3;->i(Ljava/util/HashMap;)Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    invoke-virtual {v2}, Ljava/util/HashMap;->clear()V

    .line 119
    .line 120
    .line 121
    return-object v0

    .line 122
    :pswitch_2
    iget-object v0, p0, Lgs1;->b:Ljava/lang/Object;

    .line 123
    .line 124
    check-cast v0, Llj3;

    .line 125
    .line 126
    iget-object v1, p0, Lgs1;->c:Ljava/lang/Object;

    .line 127
    .line 128
    check-cast v1, Landroid/content/Context;

    .line 129
    .line 130
    const-string v2, ""

    .line 131
    .line 132
    iget-object v3, v0, Llj3;->e:Lgk3;

    .line 133
    .line 134
    iget-object v0, v0, Llj3;->a:Lfe3;

    .line 135
    .line 136
    invoke-virtual {v0}, Lfe3;->b()Lde3;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    if-nez v0, :cond_1

    .line 141
    .line 142
    const/16 v0, 0x3a9c

    .line 143
    .line 144
    invoke-virtual {v3, v0}, Lgk3;->b(I)V

    .line 145
    .line 146
    .line 147
    goto :goto_0

    .line 148
    :cond_1
    invoke-virtual {v0, v1}, Lde3;->a(Landroid/content/Context;)Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    if-eqz v0, :cond_2

    .line 153
    .line 154
    move-object v2, v0

    .line 155
    goto :goto_0

    .line 156
    :cond_2
    const/16 v0, 0x3a9e

    .line 157
    .line 158
    invoke-virtual {v3, v0}, Lgk3;->b(I)V

    .line 159
    .line 160
    .line 161
    :goto_0
    return-object v2

    .line 162
    :pswitch_3
    const-string v0, "UTF-8"

    .line 163
    .line 164
    iget-object v1, p0, Lgs1;->b:Ljava/lang/Object;

    .line 165
    .line 166
    check-cast v1, Lgi3;

    .line 167
    .line 168
    iget-object v2, p0, Lgs1;->c:Ljava/lang/Object;

    .line 169
    .line 170
    check-cast v2, Lhi3;

    .line 171
    .line 172
    iget-object v3, v1, Lgi3;->l:Ldalvik/system/DexClassLoader;

    .line 173
    .line 174
    iget-object v4, v1, Lgi3;->d:Lfi3;

    .line 175
    .line 176
    iget-object v1, v1, Lgi3;->k:[B

    .line 177
    .line 178
    iget-object v5, v2, Lhi3;->a:Ljava/lang/String;

    .line 179
    .line 180
    iget-object v6, v2, Lhi3;->b:Ljava/lang/String;

    .line 181
    .line 182
    iget-object v2, v2, Lhi3;->c:[Ljava/lang/Class;

    .line 183
    .line 184
    :try_start_0
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 185
    .line 186
    .line 187
    invoke-static {v5, v1}, Lfi3;->a(Ljava/lang/String;[B)[B

    .line 188
    .line 189
    .line 190
    move-result-object v4

    .line 191
    new-instance v5, Ljava/lang/String;

    .line 192
    .line 193
    invoke-direct {v5, v4, v0}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    .line 194
    .line 195
    .line 196
    invoke-virtual {v3, v5}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 197
    .line 198
    .line 199
    move-result-object v3

    .line 200
    invoke-static {v6, v1}, Lfi3;->a(Ljava/lang/String;[B)[B

    .line 201
    .line 202
    .line 203
    move-result-object v1

    .line 204
    new-instance v4, Ljava/lang/String;

    .line 205
    .line 206
    invoke-direct {v4, v1, v0}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    .line 207
    .line 208
    .line 209
    invoke-virtual {v3, v4, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 210
    .line 211
    .line 212
    move-result-object v0
    :try_end_0
    .catch Lei3; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    .line 213
    return-object v0

    .line 214
    :catch_0
    move-exception v0

    .line 215
    goto :goto_1

    .line 216
    :catch_1
    move-exception v0

    .line 217
    goto :goto_1

    .line 218
    :catch_2
    move-exception v0

    .line 219
    goto :goto_1

    .line 220
    :catch_3
    move-exception v0

    .line 221
    goto :goto_1

    .line 222
    :catch_4
    move-exception v0

    .line 223
    :goto_1
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 224
    .line 225
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    .line 226
    .line 227
    .line 228
    throw v1

    .line 229
    :pswitch_4
    iget-object v0, p0, Lgs1;->b:Ljava/lang/Object;

    .line 230
    .line 231
    check-cast v0, Llg3;

    .line 232
    .line 233
    iget-object v1, p0, Lgs1;->c:Ljava/lang/Object;

    .line 234
    .line 235
    const-string v3, ".temp"

    .line 236
    .line 237
    monitor-enter v0

    .line 238
    :try_start_1
    iget-object v4, v0, Llg3;->a:Ljava/io/File;

    .line 239
    .line 240
    invoke-static {v4}, Lyb;->A(Ljava/io/File;)V

    .line 241
    .line 242
    .line 243
    new-instance v5, Ljava/io/File;

    .line 244
    .line 245
    invoke-virtual {v4}, Ljava/io/File;->getParent()Ljava/lang/String;

    .line 246
    .line 247
    .line 248
    move-result-object v6

    .line 249
    invoke-virtual {v4}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 250
    .line 251
    .line 252
    move-result-object v4

    .line 253
    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 254
    .line 255
    .line 256
    move-result-object v7

    .line 257
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 258
    .line 259
    .line 260
    move-result v7

    .line 261
    add-int/lit8 v7, v7, 0x5

    .line 262
    .line 263
    new-instance v8, Ljava/lang/StringBuilder;

    .line 264
    .line 265
    invoke-direct {v8, v7}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 266
    .line 267
    .line 268
    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 269
    .line 270
    .line 271
    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 272
    .line 273
    .line 274
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 275
    .line 276
    .line 277
    move-result-object v3

    .line 278
    invoke-direct {v5, v6, v3}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 279
    .line 280
    .line 281
    :try_start_2
    new-instance v3, Ljava/io/FileOutputStream;

    .line 282
    .line 283
    invoke-direct {v3, v5}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_5
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 284
    .line 285
    .line 286
    :try_start_3
    iget-object v4, v0, Llg3;->c:Lkg3;

    .line 287
    .line 288
    invoke-interface {v4, v1, v3}, Lkg3;->o(Ljava/lang/Object;Ljava/io/FileOutputStream;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 289
    .line 290
    .line 291
    :try_start_4
    invoke-virtual {v3}, Ljava/io/FileOutputStream;->close()V

    .line 292
    .line 293
    .line 294
    iget-object v1, v0, Llg3;->a:Ljava/io/File;

    .line 295
    .line 296
    invoke-virtual {v5, v1}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    .line 297
    .line 298
    .line 299
    move-result v1
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_5
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 300
    if-eqz v1, :cond_3

    .line 301
    .line 302
    :try_start_5
    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 303
    return-object v2

    .line 304
    :catchall_0
    move-exception v1

    .line 305
    goto :goto_4

    .line 306
    :cond_3
    :try_start_6
    new-instance v1, Ljava/io/IOException;

    .line 307
    .line 308
    const-string v2, "Failed to rename file."

    .line 309
    .line 310
    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 311
    .line 312
    .line 313
    throw v1
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_5
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 314
    :catch_5
    move-exception v1

    .line 315
    goto :goto_3

    .line 316
    :catchall_1
    move-exception v1

    .line 317
    :try_start_7
    invoke-virtual {v3}, Ljava/io/FileOutputStream;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 318
    .line 319
    .line 320
    goto :goto_2

    .line 321
    :catchall_2
    move-exception v2

    .line 322
    :try_start_8
    invoke-virtual {v1, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 323
    .line 324
    .line 325
    :goto_2
    throw v1
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_5
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 326
    :goto_3
    :try_start_9
    invoke-virtual {v5}, Ljava/io/File;->delete()Z

    .line 327
    .line 328
    .line 329
    throw v1

    .line 330
    :goto_4
    monitor-exit v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    .line 331
    throw v1

    .line 332
    :pswitch_5
    iget-object v0, p0, Lgs1;->b:Ljava/lang/Object;

    .line 333
    .line 334
    check-cast v0, Leb3;

    .line 335
    .line 336
    iget-object v1, p0, Lgs1;->c:Ljava/lang/Object;

    .line 337
    .line 338
    check-cast v1, Ljava/lang/String;

    .line 339
    .line 340
    iget-object v3, v0, Leb3;->d:Lug4;

    .line 341
    .line 342
    sget-object v4, Lmz1;->C9:Liz1;

    .line 343
    .line 344
    sget-object v5, Ltw1;->e:Ltw1;

    .line 345
    .line 346
    iget-object v6, v5, Ltw1;->c:Lkz1;

    .line 347
    .line 348
    invoke-virtual {v6, v4}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 349
    .line 350
    .line 351
    move-result-object v4

    .line 352
    check-cast v4, Ljava/lang/Boolean;

    .line 353
    .line 354
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 355
    .line 356
    .line 357
    move-result v4

    .line 358
    if-eqz v4, :cond_7

    .line 359
    .line 360
    sget-object v4, Lhg4;->C:Lhg4;

    .line 361
    .line 362
    iget-object v6, v4, Lhg4;->c:Llf4;

    .line 363
    .line 364
    invoke-virtual {v6, v1}, Llf4;->E(Ljava/lang/String;)Z

    .line 365
    .line 366
    .line 367
    move-result v6

    .line 368
    if-nez v6, :cond_4

    .line 369
    .line 370
    iget-object v4, v4, Lhg4;->c:Llf4;

    .line 371
    .line 372
    invoke-virtual {v4, v1}, Llf4;->F(Ljava/lang/String;)Z

    .line 373
    .line 374
    .line 375
    move-result v4

    .line 376
    if-eqz v4, :cond_7

    .line 377
    .line 378
    :cond_4
    iget-object v0, v0, Leb3;->g:Lch2;

    .line 379
    .line 380
    iget-object v0, v0, Lch2;->c:Lo94;

    .line 381
    .line 382
    if-eqz v0, :cond_5

    .line 383
    .line 384
    invoke-virtual {v0}, Ls44;->b()[B

    .line 385
    .line 386
    .line 387
    move-result-object v0

    .line 388
    const/16 v2, 0xa

    .line 389
    .line 390
    invoke-static {v0, v2}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    .line 391
    .line 392
    .line 393
    move-result-object v2

    .line 394
    :cond_5
    new-instance v0, Ljava/util/HashMap;

    .line 395
    .line 396
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 397
    .line 398
    .line 399
    if-eqz v2, :cond_6

    .line 400
    .line 401
    sget-object v4, Lmz1;->D9:Liz1;

    .line 402
    .line 403
    iget-object v5, v5, Ltw1;->c:Lkz1;

    .line 404
    .line 405
    invoke-virtual {v5, v4}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 406
    .line 407
    .line 408
    move-result-object v4

    .line 409
    check-cast v4, Ljava/lang/String;

    .line 410
    .line 411
    invoke-virtual {v0, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 412
    .line 413
    .line 414
    :cond_6
    invoke-virtual {v3, v1, v0}, Lug4;->a(Ljava/lang/String;Ljava/util/HashMap;)Leg4;

    .line 415
    .line 416
    .line 417
    move-result-object v0

    .line 418
    goto :goto_5

    .line 419
    :cond_7
    invoke-virtual {v3, v1, v2}, Lug4;->a(Ljava/lang/String;Ljava/util/HashMap;)Leg4;

    .line 420
    .line 421
    .line 422
    move-result-object v0

    .line 423
    :goto_5
    return-object v0

    .line 424
    :pswitch_6
    new-instance v0, Lty2;

    .line 425
    .line 426
    iget-object v1, p0, Lgs1;->b:Ljava/lang/Object;

    .line 427
    .line 428
    check-cast v1, Lq93;

    .line 429
    .line 430
    iget-object v1, v1, Lq93;->h:Ln70;

    .line 431
    .line 432
    invoke-interface {v1}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 433
    .line 434
    .line 435
    move-result-object v1

    .line 436
    check-cast v1, Lzy2;

    .line 437
    .line 438
    iget-object v2, p0, Lgs1;->c:Ljava/lang/Object;

    .line 439
    .line 440
    check-cast v2, Llq3;

    .line 441
    .line 442
    iget-object v2, v2, Llq3;->f:Ljava/lang/Object;

    .line 443
    .line 444
    move-object v3, v2

    .line 445
    check-cast v3, Lsy2;

    .line 446
    .line 447
    iget-object v3, v3, Lsy2;->b:Lorg/json/JSONObject;

    .line 448
    .line 449
    check-cast v2, Lsy2;

    .line 450
    .line 451
    iget-object v2, v2, Lsy2;->a:Lga2;

    .line 452
    .line 453
    invoke-direct {v0, v1, v3, v2}, Lty2;-><init>(Lzy2;Lorg/json/JSONObject;Lga2;)V

    .line 454
    .line 455
    .line 456
    return-object v0

    .line 457
    :pswitch_7
    iget-object v0, p0, Lgs1;->b:Ljava/lang/Object;

    .line 458
    .line 459
    check-cast v0, Lzx2;

    .line 460
    .line 461
    iget-object v4, p0, Lgs1;->c:Ljava/lang/Object;

    .line 462
    .line 463
    check-cast v4, Lyy2;

    .line 464
    .line 465
    const/16 v5, 0x23

    .line 466
    .line 467
    invoke-virtual {v0, v5}, Lzx2;->b(I)V

    .line 468
    .line 469
    .line 470
    const-string v5, "Received HTTP error code from ad server:"

    .line 471
    .line 472
    const/4 v6, -0x1

    .line 473
    :goto_6
    :try_start_a
    sget-object v7, Lmz1;->A7:Liz1;

    .line 474
    .line 475
    sget-object v8, Ltw1;->e:Ltw1;

    .line 476
    .line 477
    iget-object v9, v8, Ltw1;->c:Lkz1;

    .line 478
    .line 479
    invoke-virtual {v9, v7}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 480
    .line 481
    .line 482
    move-result-object v7

    .line 483
    check-cast v7, Ljava/lang/Integer;

    .line 484
    .line 485
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 486
    .line 487
    .line 488
    move-result v7

    .line 489
    if-ge v1, v7, :cond_a

    .line 490
    .line 491
    iget-object v6, v0, Lzx2;->b:Landroid/content/Context;

    .line 492
    .line 493
    iget-object v7, v0, Lzx2;->c:Le51;

    .line 494
    .line 495
    iget-object v7, v7, Le51;->f:Ljava/lang/String;

    .line 496
    .line 497
    invoke-static {}, Landroid/os/Binder;->getCallingUid()I

    .line 498
    .line 499
    .line 500
    new-instance v9, Lxb4;

    .line 501
    .line 502
    const/16 v10, 0x19

    .line 503
    .line 504
    invoke-direct {v9, v6, v7, v2, v10}, Lxb4;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 505
    .line 506
    .line 507
    invoke-virtual {v9, v4}, Lxb4;->C(Lyy2;)Lzy2;

    .line 508
    .line 509
    .line 510
    move-result-object v6

    .line 511
    iget v7, v6, Lzy2;->a:I

    .line 512
    .line 513
    sget-object v9, Lmz1;->B7:Liz1;

    .line 514
    .line 515
    iget-object v8, v8, Ltw1;->c:Lkz1;

    .line 516
    .line 517
    invoke-virtual {v8, v9}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 518
    .line 519
    .line 520
    move-result-object v8

    .line 521
    check-cast v8, Ljava/lang/Boolean;

    .line 522
    .line 523
    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    .line 524
    .line 525
    .line 526
    move-result v8

    .line 527
    if-eqz v8, :cond_8

    .line 528
    .line 529
    iget-object v8, v0, Lzx2;->i:Ljv2;

    .line 530
    .line 531
    const-string v9, "fr"

    .line 532
    .line 533
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 534
    .line 535
    .line 536
    move-result-object v10

    .line 537
    invoke-virtual {v8, v9, v10}, Ljv2;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 538
    .line 539
    .line 540
    goto :goto_7

    .line 541
    :catch_6
    move-exception v0

    .line 542
    goto :goto_8

    .line 543
    :cond_8
    :goto_7
    const/16 v8, 0xc8

    .line 544
    .line 545
    if-ne v7, v8, :cond_9

    .line 546
    .line 547
    const/16 v1, 0x24

    .line 548
    .line 549
    invoke-virtual {v0, v1}, Lzx2;->b(I)V

    .line 550
    .line 551
    .line 552
    iget-object v0, v6, Lzy2;->c:Ljava/lang/String;

    .line 553
    .line 554
    return-object v0

    .line 555
    :cond_9
    add-int/lit8 v1, v1, 0x1

    .line 556
    .line 557
    move v6, v7

    .line 558
    goto :goto_6

    .line 559
    :cond_a
    new-instance v0, Lr13;

    .line 560
    .line 561
    invoke-static {v6}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 562
    .line 563
    .line 564
    move-result-object v1

    .line 565
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 566
    .line 567
    .line 568
    move-result v1

    .line 569
    add-int/lit8 v1, v1, 0x28

    .line 570
    .line 571
    new-instance v2, Ljava/lang/StringBuilder;

    .line 572
    .line 573
    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 574
    .line 575
    .line 576
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 577
    .line 578
    .line 579
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 580
    .line 581
    .line 582
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 583
    .line 584
    .line 585
    move-result-object v1

    .line 586
    invoke-direct {v0, v1, v3}, Lhx2;-><init>(Ljava/lang/String;I)V

    .line 587
    .line 588
    .line 589
    throw v0
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_6

    .line 590
    :goto_8
    new-instance v1, Lr13;

    .line 591
    .line 592
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 593
    .line 594
    .line 595
    move-result-object v2

    .line 596
    if-nez v2, :cond_b

    .line 597
    .line 598
    const-string v2, "Fetch failed."

    .line 599
    .line 600
    goto :goto_9

    .line 601
    :cond_b
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 602
    .line 603
    .line 604
    move-result-object v2

    .line 605
    :goto_9
    invoke-direct {v1, v2, v0}, Lhx2;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 606
    .line 607
    .line 608
    throw v1

    .line 609
    :pswitch_8
    iget-object v0, p0, Lgs1;->b:Ljava/lang/Object;

    .line 610
    .line 611
    check-cast v0, Lg4;

    .line 612
    .line 613
    iget-object v1, p0, Lgs1;->c:Ljava/lang/Object;

    .line 614
    .line 615
    check-cast v1, Lfa2;

    .line 616
    .line 617
    iget-object v0, v0, Lg4;->i:Ljava/lang/Object;

    .line 618
    .line 619
    check-cast v0, Lay2;

    .line 620
    .line 621
    invoke-virtual {v0, v1}, Lay2;->c(Lfa2;)Ln70;

    .line 622
    .line 623
    .line 624
    move-result-object v0

    .line 625
    sget-object v1, Lmz1;->Z5:Liz1;

    .line 626
    .line 627
    sget-object v2, Ltw1;->e:Ltw1;

    .line 628
    .line 629
    iget-object v2, v2, Ltw1;->c:Lkz1;

    .line 630
    .line 631
    invoke-virtual {v2, v1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 632
    .line 633
    .line 634
    move-result-object v1

    .line 635
    check-cast v1, Ljava/lang/Integer;

    .line 636
    .line 637
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 638
    .line 639
    .line 640
    move-result v1

    .line 641
    int-to-long v1, v1

    .line 642
    sget-object v3, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 643
    .line 644
    check-cast v0, Lpd2;

    .line 645
    .line 646
    iget-object v0, v0, Lpd2;->f:Lwq3;

    .line 647
    .line 648
    invoke-virtual {v0, v1, v2, v3}, Lgp3;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    .line 649
    .line 650
    .line 651
    move-result-object v0

    .line 652
    check-cast v0, Lny2;

    .line 653
    .line 654
    return-object v0

    .line 655
    :pswitch_9
    iget-object v0, p0, Lgs1;->b:Ljava/lang/Object;

    .line 656
    .line 657
    check-cast v0, Lmc2;

    .line 658
    .line 659
    iget-object v1, p0, Lgs1;->c:Ljava/lang/Object;

    .line 660
    .line 661
    check-cast v1, Lfa2;

    .line 662
    .line 663
    iget-object v0, v0, Lmc2;->i:Ljava/lang/Object;

    .line 664
    .line 665
    check-cast v0, Lay2;

    .line 666
    .line 667
    iget-object v4, v0, Lfy2;->g:Ljava/lang/Object;

    .line 668
    .line 669
    monitor-enter v4

    .line 670
    :try_start_b
    iget-boolean v2, v0, Lfy2;->h:Z

    .line 671
    .line 672
    if-eqz v2, :cond_c

    .line 673
    .line 674
    iget-object v0, v0, Lfy2;->f:Lpd2;

    .line 675
    .line 676
    monitor-exit v4

    .line 677
    goto :goto_a

    .line 678
    :catchall_3
    move-exception v0

    .line 679
    goto :goto_b

    .line 680
    :cond_c
    iput-boolean v3, v0, Lfy2;->h:Z

    .line 681
    .line 682
    iput-object v1, v0, Lfy2;->j:Lfa2;

    .line 683
    .line 684
    iget-object v1, v0, Lfy2;->k:Lvw1;

    .line 685
    .line 686
    invoke-virtual {v1}, Lw9;->n()V

    .line 687
    .line 688
    .line 689
    iget-object v1, v0, Lfy2;->f:Lpd2;

    .line 690
    .line 691
    new-instance v2, Lbs2;

    .line 692
    .line 693
    const/4 v3, 0x6

    .line 694
    invoke-direct {v2, v3, v0}, Lbs2;-><init>(ILjava/lang/Object;)V

    .line 695
    .line 696
    .line 697
    sget-object v3, Lmd2;->g:Lld2;

    .line 698
    .line 699
    iget-object v5, v1, Lpd2;->f:Lwq3;

    .line 700
    .line 701
    invoke-virtual {v5, v2, v3}, Lgp3;->c(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 702
    .line 703
    .line 704
    iget-object v2, v0, Lay2;->m:Landroid/content/Context;

    .line 705
    .line 706
    iget-object v0, v0, Lay2;->n:Ljava/util/concurrent/Executor;

    .line 707
    .line 708
    invoke-static {v2, v1, v0}, Lfy2;->b(Landroid/content/Context;Lpd2;Ljava/util/concurrent/Executor;)V

    .line 709
    .line 710
    .line 711
    monitor-exit v4
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_3

    .line 712
    move-object v0, v1

    .line 713
    :goto_a
    sget-object v1, Lmz1;->Z5:Liz1;

    .line 714
    .line 715
    sget-object v2, Ltw1;->e:Ltw1;

    .line 716
    .line 717
    iget-object v2, v2, Ltw1;->c:Lkz1;

    .line 718
    .line 719
    invoke-virtual {v2, v1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 720
    .line 721
    .line 722
    move-result-object v1

    .line 723
    check-cast v1, Ljava/lang/Integer;

    .line 724
    .line 725
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 726
    .line 727
    .line 728
    move-result v1

    .line 729
    int-to-long v1, v1

    .line 730
    sget-object v3, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 731
    .line 732
    iget-object v0, v0, Lpd2;->f:Lwq3;

    .line 733
    .line 734
    invoke-virtual {v0, v1, v2, v3}, Lgp3;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    .line 735
    .line 736
    .line 737
    move-result-object v0

    .line 738
    check-cast v0, Lny2;

    .line 739
    .line 740
    return-object v0

    .line 741
    :goto_b
    :try_start_c
    monitor-exit v4
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_3

    .line 742
    throw v0

    .line 743
    :pswitch_a
    iget-object v0, p0, Lgs1;->b:Ljava/lang/Object;

    .line 744
    .line 745
    check-cast v0, Lmw2;

    .line 746
    .line 747
    iget-object v1, p0, Lgs1;->c:Ljava/lang/Object;

    .line 748
    .line 749
    check-cast v1, Laa3;

    .line 750
    .line 751
    iget-object v4, v0, Lmw2;->e:Lpd2;

    .line 752
    .line 753
    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 754
    .line 755
    invoke-virtual {v4, v5}, Lpd2;->a(Ljava/lang/Object;)Z

    .line 756
    .line 757
    .line 758
    invoke-interface {v1, v3}, Laa3;->b(Z)Laa3;

    .line 759
    .line 760
    .line 761
    iget-object v0, v0, Lmw2;->p:Lea3;

    .line 762
    .line 763
    invoke-interface {v1}, Laa3;->n()Lca3;

    .line 764
    .line 765
    .line 766
    move-result-object v1

    .line 767
    invoke-virtual {v0, v1}, Lea3;->b(Lca3;)V

    .line 768
    .line 769
    .line 770
    return-object v2

    .line 771
    :pswitch_b
    const-string v0, "user_agent"

    .line 772
    .line 773
    const-string v2, "admob_user_agent"

    .line 774
    .line 775
    iget-object v4, p0, Lgs1;->c:Ljava/lang/Object;

    .line 776
    .line 777
    check-cast v4, Landroid/content/Context;

    .line 778
    .line 779
    iget-object v5, p0, Lgs1;->b:Ljava/lang/Object;

    .line 780
    .line 781
    check-cast v5, Landroid/content/Context;

    .line 782
    .line 783
    if-eqz v4, :cond_d

    .line 784
    .line 785
    const-string v3, "Attempting to read user agent from Google Play Services."

    .line 786
    .line 787
    invoke-static {v3}, Lgi2;->G(Ljava/lang/String;)V

    .line 788
    .line 789
    .line 790
    invoke-virtual {v4, v2, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 791
    .line 792
    .line 793
    move-result-object v2

    .line 794
    goto :goto_c

    .line 795
    :cond_d
    const-string v4, "Attempting to read user agent from local cache."

    .line 796
    .line 797
    invoke-static {v4}, Lgi2;->G(Ljava/lang/String;)V

    .line 798
    .line 799
    .line 800
    invoke-virtual {v5, v2, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 801
    .line 802
    .line 803
    move-result-object v2

    .line 804
    move v1, v3

    .line 805
    :goto_c
    const-string v3, ""

    .line 806
    .line 807
    invoke-interface {v2, v0, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 808
    .line 809
    .line 810
    move-result-object v3

    .line 811
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 812
    .line 813
    .line 814
    move-result v4

    .line 815
    if-eqz v4, :cond_e

    .line 816
    .line 817
    const-string v3, "Reading user agent from WebSettings"

    .line 818
    .line 819
    invoke-static {v3}, Lgi2;->G(Ljava/lang/String;)V

    .line 820
    .line 821
    .line 822
    invoke-static {v5}, Landroid/webkit/WebSettings;->getDefaultUserAgent(Landroid/content/Context;)Ljava/lang/String;

    .line 823
    .line 824
    .line 825
    move-result-object v3

    .line 826
    if-eqz v1, :cond_e

    .line 827
    .line 828
    invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 829
    .line 830
    .line 831
    move-result-object v1

    .line 832
    invoke-interface {v1, v0, v3}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 833
    .line 834
    .line 835
    move-result-object v0

    .line 836
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 837
    .line 838
    .line 839
    const-string v0, "Persisting user agent."

    .line 840
    .line 841
    invoke-static {v0}, Lgi2;->G(Ljava/lang/String;)V

    .line 842
    .line 843
    .line 844
    :cond_e
    return-object v3

    .line 845
    :pswitch_c
    iget-object v0, p0, Lgs1;->b:Ljava/lang/Object;

    .line 846
    .line 847
    check-cast v0, Loc2;

    .line 848
    .line 849
    iget-object v1, p0, Lgs1;->c:Ljava/lang/Object;

    .line 850
    .line 851
    check-cast v1, Landroid/content/Context;

    .line 852
    .line 853
    const-string v2, "getAppInstanceId"

    .line 854
    .line 855
    invoke-virtual {v0, v1, v2}, Loc2;->k(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/Object;

    .line 856
    .line 857
    .line 858
    move-result-object v0

    .line 859
    check-cast v0, Ljava/lang/String;

    .line 860
    .line 861
    return-object v0

    .line 862
    :pswitch_d
    iget-object v0, p0, Lgs1;->b:Ljava/lang/Object;

    .line 863
    .line 864
    check-cast v0, Lug0;

    .line 865
    .line 866
    iget-object v1, v0, Lug0;->g:Ljava/lang/Object;

    .line 867
    .line 868
    check-cast v1, Ljava/util/WeakHashMap;

    .line 869
    .line 870
    iget-object v2, p0, Lgs1;->c:Ljava/lang/Object;

    .line 871
    .line 872
    check-cast v2, Landroid/content/Context;

    .line 873
    .line 874
    invoke-virtual {v1, v2}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 875
    .line 876
    .line 877
    move-result-object v1

    .line 878
    check-cast v1, Lja2;

    .line 879
    .line 880
    if-eqz v1, :cond_10

    .line 881
    .line 882
    sget-object v3, Lk02;->d:Lso1;

    .line 883
    .line 884
    invoke-virtual {v3}, Lso1;->w()Ljava/lang/Object;

    .line 885
    .line 886
    .line 887
    move-result-object v3

    .line 888
    check-cast v3, Ljava/lang/Long;

    .line 889
    .line 890
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 891
    .line 892
    .line 893
    move-result-wide v3

    .line 894
    iget-wide v5, v1, Lja2;->a:J

    .line 895
    .line 896
    add-long/2addr v5, v3

    .line 897
    sget-object v3, Lhg4;->C:Lhg4;

    .line 898
    .line 899
    iget-object v3, v3, Lhg4;->k:Lym;

    .line 900
    .line 901
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 902
    .line 903
    .line 904
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 905
    .line 906
    .line 907
    move-result-wide v3

    .line 908
    cmp-long v3, v5, v3

    .line 909
    .line 910
    if-gez v3, :cond_f

    .line 911
    .line 912
    goto :goto_d

    .line 913
    :cond_f
    iget-object v1, v1, Lja2;->b:Lia2;

    .line 914
    .line 915
    new-instance v3, Lha2;

    .line 916
    .line 917
    invoke-direct {v3, v2, v1}, Lha2;-><init>(Landroid/content/Context;Lia2;)V

    .line 918
    .line 919
    .line 920
    invoke-virtual {v3}, Lha2;->a()Lia2;

    .line 921
    .line 922
    .line 923
    move-result-object v1

    .line 924
    goto :goto_e

    .line 925
    :cond_10
    :goto_d
    new-instance v1, Lha2;

    .line 926
    .line 927
    invoke-direct {v1, v2}, Lha2;-><init>(Landroid/content/Context;)V

    .line 928
    .line 929
    .line 930
    invoke-virtual {v1}, Lha2;->a()Lia2;

    .line 931
    .line 932
    .line 933
    move-result-object v1

    .line 934
    :goto_e
    new-instance v3, Lja2;

    .line 935
    .line 936
    invoke-direct {v3, v0, v1}, Lja2;-><init>(Lug0;Lia2;)V

    .line 937
    .line 938
    .line 939
    iget-object v0, v0, Lug0;->g:Ljava/lang/Object;

    .line 940
    .line 941
    check-cast v0, Ljava/util/WeakHashMap;

    .line 942
    .line 943
    invoke-virtual {v0, v2, v3}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 944
    .line 945
    .line 946
    return-object v1

    .line 947
    :pswitch_e
    iget-object v0, p0, Lgs1;->b:Ljava/lang/Object;

    .line 948
    .line 949
    check-cast v0, Li01;

    .line 950
    .line 951
    iget-object v1, p0, Lgs1;->c:Ljava/lang/Object;

    .line 952
    .line 953
    check-cast v1, Ljava/lang/String;

    .line 954
    .line 955
    invoke-virtual {v0, v1}, Li01;->getClickSignals(Ljava/lang/String;)Ljava/lang/String;

    .line 956
    .line 957
    .line 958
    move-result-object v0

    .line 959
    return-object v0

    .line 960
    :pswitch_f
    iget-object v0, p0, Lgs1;->b:Ljava/lang/Object;

    .line 961
    .line 962
    check-cast v0, Ljt1;

    .line 963
    .line 964
    iget-object v1, v0, Ljt1;->j:Lvg0;

    .line 965
    .line 966
    if-eqz v1, :cond_11

    .line 967
    .line 968
    iget-object v3, v1, Lvg0;->g:Ljava/lang/Object;

    .line 969
    .line 970
    check-cast v3, Lar3;

    .line 971
    .line 972
    goto :goto_f

    .line 973
    :cond_11
    iget-object v3, v0, Ljt1;->i:Ljava/util/concurrent/Future;

    .line 974
    .line 975
    :goto_f
    if-eqz v3, :cond_13

    .line 976
    .line 977
    if-eqz v1, :cond_12

    .line 978
    .line 979
    iget-object v1, v1, Lvg0;->g:Ljava/lang/Object;

    .line 980
    .line 981
    check-cast v1, Lar3;

    .line 982
    .line 983
    goto :goto_10

    .line 984
    :cond_12
    iget-object v1, v0, Ljt1;->i:Ljava/util/concurrent/Future;

    .line 985
    .line 986
    :goto_10
    invoke-interface {v1}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 987
    .line 988
    .line 989
    :cond_13
    invoke-virtual {v0}, Ljt1;->b()Lqr1;

    .line 990
    .line 991
    .line 992
    move-result-object v0

    .line 993
    if-eqz v0, :cond_14

    .line 994
    .line 995
    :try_start_d
    iget-object v1, p0, Lgs1;->c:Ljava/lang/Object;

    .line 996
    .line 997
    check-cast v1, Lfr1;

    .line 998
    .line 999
    monitor-enter v1
    :try_end_d
    .catch La64; {:try_start_d .. :try_end_d} :catch_7
    .catch Ljava/lang/NullPointerException; {:try_start_d .. :try_end_d} :catch_7

    .line 1000
    :try_start_e
    invoke-virtual {v0}, Ls44;->b()[B

    .line 1001
    .line 1002
    .line 1003
    move-result-object v0

    .line 1004
    sget-object v3, Lh54;->a:Lh54;

    .line 1005
    .line 1006
    sget v3, Lu44;->a:I

    .line 1007
    .line 1008
    sget-object v3, Lh54;->b:Lh54;

    .line 1009
    .line 1010
    invoke-virtual {v1, v0, v3}, Ln54;->a([BLh54;)V

    .line 1011
    .line 1012
    .line 1013
    monitor-exit v1

    .line 1014
    goto :goto_11

    .line 1015
    :catchall_4
    move-exception v0

    .line 1016
    monitor-exit v1
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_4

    .line 1017
    :try_start_f
    throw v0
    :try_end_f
    .catch La64; {:try_start_f .. :try_end_f} :catch_7
    .catch Ljava/lang/NullPointerException; {:try_start_f .. :try_end_f} :catch_7

    .line 1018
    :catch_7
    :cond_14
    :goto_11
    return-object v2

    .line 1019
    :pswitch_10
    iget-object v0, p0, Lgs1;->b:Ljava/lang/Object;

    .line 1020
    .line 1021
    check-cast v0, Lt83;

    .line 1022
    .line 1023
    iget-object v1, p0, Lgs1;->c:Ljava/lang/Object;

    .line 1024
    .line 1025
    check-cast v1, Landroid/content/Context;

    .line 1026
    .line 1027
    const-string v2, ""

    .line 1028
    .line 1029
    iget-object v4, v0, Lt83;->i:Ljava/lang/Object;

    .line 1030
    .line 1031
    check-cast v4, Lyq1;

    .line 1032
    .line 1033
    iget-object v0, v0, Lt83;->h:Ljava/lang/Object;

    .line 1034
    .line 1035
    check-cast v0, Lvg0;

    .line 1036
    .line 1037
    const-string v5, "E"

    .line 1038
    .line 1039
    const/16 v6, 0x1f

    .line 1040
    .line 1041
    if-eqz v0, :cond_16

    .line 1042
    .line 1043
    iget-object v0, v0, Lvg0;->g:Ljava/lang/Object;

    .line 1044
    .line 1045
    check-cast v0, Lar3;

    .line 1046
    .line 1047
    invoke-virtual {v4}, Lyq1;->D()Z

    .line 1048
    .line 1049
    .line 1050
    move-result v7

    .line 1051
    if-nez v7, :cond_16

    .line 1052
    .line 1053
    if-eqz v0, :cond_16

    .line 1054
    .line 1055
    sget v7, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 1056
    .line 1057
    if-lt v7, v6, :cond_15

    .line 1058
    .line 1059
    invoke-virtual {v0}, Lgp3;->isDone()Z

    .line 1060
    .line 1061
    .line 1062
    move-result v7

    .line 1063
    if-eqz v7, :cond_16

    .line 1064
    .line 1065
    :cond_15
    :try_start_10
    invoke-virtual {v4}, Lyq1;->B()I

    .line 1066
    .line 1067
    .line 1068
    move-result v7

    .line 1069
    int-to-long v7, v7

    .line 1070
    sget-object v9, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 1071
    .line 1072
    invoke-virtual {v0, v7, v8, v9}, Lgp3;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    .line 1073
    .line 1074
    .line 1075
    move-result-object v0

    .line 1076
    check-cast v0, Lqr1;

    .line 1077
    .line 1078
    if-eqz v0, :cond_16

    .line 1079
    .line 1080
    invoke-virtual {v0}, Lqr1;->a0()Z

    .line 1081
    .line 1082
    .line 1083
    move-result v7

    .line 1084
    if-eqz v7, :cond_16

    .line 1085
    .line 1086
    invoke-virtual {v0}, Lqr1;->v0()Ljava/lang/String;

    .line 1087
    .line 1088
    .line 1089
    move-result-object v0
    :try_end_10
    .catch Ljava/lang/InterruptedException; {:try_start_10 .. :try_end_10} :catch_8
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_10 .. :try_end_10} :catch_8
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_10 .. :try_end_10} :catch_8

    .line 1090
    goto :goto_12

    .line 1091
    :catch_8
    :cond_16
    move-object v0, v5

    .line 1092
    :goto_12
    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1093
    .line 1094
    .line 1095
    move-result v7

    .line 1096
    if-eqz v7, :cond_1a

    .line 1097
    .line 1098
    sget v7, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 1099
    .line 1100
    if-ge v7, v6, :cond_17

    .line 1101
    .line 1102
    goto :goto_14

    .line 1103
    :cond_17
    if-ge v7, v6, :cond_18

    .line 1104
    .line 1105
    :try_start_11
    invoke-static {v2}, Lpu1;->r(Ljava/lang/Object;)Llq3;

    .line 1106
    .line 1107
    .line 1108
    move-result-object v2
    :try_end_11
    .catch Ljava/lang/InterruptedException; {:try_start_11 .. :try_end_11} :catch_9
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_11 .. :try_end_11} :catch_9

    .line 1109
    goto :goto_13

    .line 1110
    :cond_18
    :try_start_12
    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 1111
    .line 1112
    .line 1113
    move-result-object v6

    .line 1114
    const-string v7, "X.509"

    .line 1115
    .line 1116
    invoke-static {v7}, Ljava/security/cert/CertificateFactory;->getInstance(Ljava/lang/String;)Ljava/security/cert/CertificateFactory;

    .line 1117
    .line 1118
    .line 1119
    move-result-object v7

    .line 1120
    sget-object v8, Ljo3;->f:Lgo3;

    .line 1121
    .line 1122
    invoke-virtual {v8}, Ljo3;->f()Ljo3;

    .line 1123
    .line 1124
    .line 1125
    move-result-object v9

    .line 1126
    const-string v10, "308204433082032ba003020102020900c2e08746644a308d300d06092a864886f70d01010405003074310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e205669657731143012060355040a130b476f6f676c6520496e632e3110300e060355040b1307416e64726f69643110300e06035504031307416e64726f6964301e170d3038303832313233313333345a170d3336303130373233313333345a3074310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e205669657731143012060355040a130b476f6f676c6520496e632e3110300e060355040b1307416e64726f69643110300e06035504031307416e64726f696430820120300d06092a864886f70d01010105000382010d00308201080282010100ab562e00d83ba208ae0a966f124e29da11f2ab56d08f58e2cca91303e9b754d372f640a71b1dcb130967624e4656a7776a92193db2e5bfb724a91e77188b0e6a47a43b33d9609b77183145ccdf7b2e586674c9e1565b1f4c6a5955bff251a63dabf9c55c27222252e875e4f8154a645f897168c0b1bfc612eabf785769bb34aa7984dc7e2ea2764cae8307d8c17154d7ee5f64a51a44a602c249054157dc02cd5f5c0e55fbef8519fbe327f0b1511692c5a06f19d18385f5c4dbc2d6b93f68cc2979c70e18ab93866b3bd5db8999552a0e3b4c99df58fb918bedc182ba35e003c1b4b10dd244a8ee24fffd333872ab5221985edab0fc0d0b145b6aa192858e79020103a381d93081d6301d0603551d0e04160414c77d8cc2211756259a7fd382df6be398e4d786a53081a60603551d2304819e30819b8014c77d8cc2211756259a7fd382df6be398e4d786a5a178a4763074310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e205669657731143012060355040a130b476f6f676c6520496e632e3110300e060355040b1307416e64726f69643110300e06035504031307416e64726f6964820900c2e08746644a308d300c0603551d13040530030101ff300d06092a864886f70d010104050003820101006dd252ceef85302c360aaace939bcff2cca904bb5d7a1661f8ae46b2994204d0ff4a68c7ed1a531ec4595a623ce60763b167297a7ae35712c407f208f0cb109429124d7b106219c084ca3eb3f9ad5fb871ef92269a8be28bf16d44c8d9a08e6cb2f005bb3fe2cb96447e868e731076ad45b33f6009ea19c161e62641aa99271dfd5228c5c587875ddb7f452758d661f6cc0cccb7352e424cc4365c523532f7325137593c4ae341f4db41edda0d0b1071a7c440f0fe9ea01cb627ca674369d084bd2fd911ff06cdbf2cfa10dc0f893ae35762919048c7efc64c7144178342f70581c9de573af55b390dd7fdb9418631895d5f759f30112687ff621410c069308a"

    .line 1127
    .line 1128
    invoke-virtual {v9, v10}, Ljo3;->h(Ljava/lang/String;)[B

    .line 1129
    .line 1130
    .line 1131
    move-result-object v9

    .line 1132
    new-instance v10, Ljava/util/ArrayList;

    .line 1133
    .line 1134
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 1135
    .line 1136
    .line 1137
    new-instance v11, Ljava/io/ByteArrayInputStream;

    .line 1138
    .line 1139
    invoke-direct {v11, v9}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 1140
    .line 1141
    .line 1142
    invoke-virtual {v7, v11}, Ljava/security/cert/CertificateFactory;->generateCertificate(Ljava/io/InputStream;)Ljava/security/cert/Certificate;

    .line 1143
    .line 1144
    .line 1145
    move-result-object v9

    .line 1146
    invoke-virtual {v10, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1147
    .line 1148
    .line 1149
    sget-object v9, Landroid/os/Build;->TYPE:Ljava/lang/String;

    .line 1150
    .line 1151
    const-string v11, "user"

    .line 1152
    .line 1153
    invoke-virtual {v9, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1154
    .line 1155
    .line 1156
    move-result v9

    .line 1157
    if-nez v9, :cond_19

    .line 1158
    .line 1159
    invoke-virtual {v8}, Ljo3;->f()Ljo3;

    .line 1160
    .line 1161
    .line 1162
    move-result-object v8

    .line 1163
    const-string v9, "308204a830820390a003020102020900d585b86c7dd34ef5300d06092a864886f70d0101040500308194310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e20566965773110300e060355040a1307416e64726f69643110300e060355040b1307416e64726f69643110300e06035504031307416e64726f69643122302006092a864886f70d0109011613616e64726f696440616e64726f69642e636f6d301e170d3038303431353233333635365a170d3335303930313233333635365a308194310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e20566965773110300e060355040a1307416e64726f69643110300e060355040b1307416e64726f69643110300e06035504031307416e64726f69643122302006092a864886f70d0109011613616e64726f696440616e64726f69642e636f6d30820120300d06092a864886f70d01010105000382010d00308201080282010100d6ce2e080abfe2314dd18db3cfd3185cb43d33fa0c74e1bdb6d1db8913f62c5c39df56f846813d65bec0f3ca426b07c5a8ed5a3990c167e76bc999b927894b8f0b22001994a92915e572c56d2a301ba36fc5fc113ad6cb9e7435a16d23ab7dfaeee165e4df1f0a8dbda70a869d516c4e9d051196ca7c0c557f175bc375f948c56aae86089ba44f8aa6a4dd9a7dbf2c0a352282ad06b8cc185eb15579eef86d080b1d6189c0f9af98b1c2ebd107ea45abdb68a3c7838a5e5488c76c53d40b121de7bbd30e620c188ae1aa61dbbc87dd3c645f2f55f3d4c375ec4070a93f7151d83670c16a971abe5ef2d11890e1b8aef3298cf066bf9e6ce144ac9ae86d1c1b0f020103a381fc3081f9301d0603551d0e041604148d1cc5be954c433c61863a15b04cbc03f24fe0b23081c90603551d230481c13081be80148d1cc5be954c433c61863a15b04cbc03f24fe0b2a1819aa48197308194310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e20566965773110300e060355040a1307416e64726f69643110300e060355040b1307416e64726f69643110300e06035504031307416e64726f69643122302006092a864886f70d0109011613616e64726f696440616e64726f69642e636f6d820900d585b86c7dd34ef5300c0603551d13040530030101ff300d06092a864886f70d0101040500038201010019d30cf105fb78923f4c0d7dd223233d40967acfce00081d5bd7c6e9d6ed206b0e11209506416ca244939913d26b4aa0e0f524cad2bb5c6e4ca1016a15916ea1ec5dc95a5e3a010036f49248d5109bbf2e1e618186673a3be56daf0b77b1c229e3c255e3e84c905d2387efba09cbf13b202b4e5a22c93263484a23d2fc29fa9f1939759733afd8aa160f4296c2d0163e8182859c6643e9c1962fa0c18333335bc090ff9a6b22ded1ad444229a539a94eefadabd065ced24b3e51e5dd7b66787bef12fe97fba484c423fb4ff8cc494c02f0f5051612ff6529393e8e46eac5bb21f277c151aa5f2aa627d1e89da70ab6033569de3b9897bfff7ca9da3e1243f60b"

    .line 1164
    .line 1165
    invoke-virtual {v8, v9}, Ljo3;->h(Ljava/lang/String;)[B

    .line 1166
    .line 1167
    .line 1168
    move-result-object v8

    .line 1169
    new-instance v9, Ljava/io/ByteArrayInputStream;

    .line 1170
    .line 1171
    invoke-direct {v9, v8}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 1172
    .line 1173
    .line 1174
    invoke-virtual {v7, v9}, Ljava/security/cert/CertificateFactory;->generateCertificate(Ljava/io/InputStream;)Ljava/security/cert/Certificate;

    .line 1175
    .line 1176
    .line 1177
    move-result-object v7

    .line 1178
    invoke-virtual {v10, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1179
    .line 1180
    .line 1181
    :cond_19
    new-instance v7, Lfs1;

    .line 1182
    .line 1183
    invoke-direct {v7}, Lfs1;-><init>()V

    .line 1184
    .line 1185
    .line 1186
    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 1187
    .line 1188
    .line 1189
    move-result-object v8

    .line 1190
    invoke-static {v8, v6, v10, v7}, Llb;->r(Landroid/content/pm/PackageManager;Ljava/lang/String;Ljava/util/ArrayList;Lfs1;)V

    .line 1191
    .line 1192
    .line 1193
    iget-object v6, v7, Lfs1;->b:Ljava/lang/Object;

    .line 1194
    .line 1195
    check-cast v6, Lwq3;
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_5

    .line 1196
    .line 1197
    move-object v2, v6

    .line 1198
    goto :goto_13

    .line 1199
    :catchall_5
    :try_start_13
    invoke-static {v2}, Lpu1;->r(Ljava/lang/Object;)Llq3;

    .line 1200
    .line 1201
    .line 1202
    move-result-object v2

    .line 1203
    :goto_13
    invoke-interface {v2}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 1204
    .line 1205
    .line 1206
    move-result-object v2

    .line 1207
    check-cast v2, Ljava/lang/String;

    .line 1208
    .line 1209
    invoke-static {v2}, Lyc0;->s(Ljava/lang/String;)Z

    .line 1210
    .line 1211
    .line 1212
    move-result v6
    :try_end_13
    .catch Ljava/lang/InterruptedException; {:try_start_13 .. :try_end_13} :catch_9
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_13 .. :try_end_13} :catch_9

    .line 1213
    if-eq v3, v6, :cond_1a

    .line 1214
    .line 1215
    move-object v0, v2

    .line 1216
    :catch_9
    :cond_1a
    :goto_14
    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1217
    .line 1218
    .line 1219
    move-result v2

    .line 1220
    if-eqz v2, :cond_1b

    .line 1221
    .line 1222
    invoke-virtual {v4}, Lyq1;->A()Z

    .line 1223
    .line 1224
    .line 1225
    move-result v2

    .line 1226
    if-nez v2, :cond_1b

    .line 1227
    .line 1228
    :try_start_14
    invoke-static {v1}, Lt83;->Y(Landroid/content/Context;)Ljava/lang/String;

    .line 1229
    .line 1230
    .line 1231
    move-result-object v0
    :try_end_14
    .catch Ljava/lang/ClassCastException; {:try_start_14 .. :try_end_14} :catch_a

    .line 1232
    :catch_a
    :cond_1b
    return-object v0

    .line 1233
    :pswitch_data_0
    .packed-switch 0x0
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
