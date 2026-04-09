.class public final synthetic Lm;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ldy;


# instance fields
.field public final synthetic f:I

.field public final synthetic g:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lm;->f:I

    .line 2
    .line 3
    iput-object p2, p0, Lm;->g:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget v0, p0, Lm;->f:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const-string v2, "it"

    .line 5
    .line 6
    iget-object v3, p0, Lm;->g:Ljava/lang/Object;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    check-cast v3, Ljava/lang/String;

    .line 12
    .line 13
    check-cast p1, Ld30;

    .line 14
    .line 15
    invoke-static {p1, v2}, Li30;->m(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    iget v0, p1, Lb30;->f:I

    .line 19
    .line 20
    iget p1, p1, Lb30;->g:I

    .line 21
    .line 22
    add-int/2addr p1, v1

    .line 23
    invoke-virtual {v3, v0, p1}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    return-object p1

    .line 32
    :pswitch_0
    check-cast v3, Lo2;

    .line 33
    .line 34
    invoke-static {p1, v2}, Li30;->m(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v3}, Lo2;->a()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    return-object p1

    .line 42
    :pswitch_1
    check-cast v3, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;

    .line 43
    .line 44
    check-cast p1, Lz31;

    .line 45
    .line 46
    sget-object v0, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->d0:[I

    .line 47
    .line 48
    invoke-static {p1, v2}, Li30;->m(Ljava/lang/Object;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    const/4 p1, 0x0

    .line 52
    iput-boolean p1, v3, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->a0:Z

    .line 53
    .line 54
    new-instance v0, Lna0;

    .line 55
    .line 56
    invoke-direct {v0, p1, v3, p1}, Lna0;-><init>(ZLcom/phuongpn/whousemywifi/networkscanner/MainActivity;I)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v3, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 60
    .line 61
    .line 62
    const/4 v0, 0x0

    .line 63
    :try_start_0
    iget-object v2, v3, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->Z:Lyn;

    .line 64
    .line 65
    if-eqz v2, :cond_0

    .line 66
    .line 67
    new-instance v4, Lx30;

    .line 68
    .line 69
    invoke-virtual {v2}, Ln;->q()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v5

    .line 73
    invoke-direct {v4, v5, v0, v2}, Lx30;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Lg40;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v4}, Lg40;->o(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_0
    const-string v2, "job"

    .line 81
    .line 82
    invoke-static {v2}, Li30;->S(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    throw v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 86
    :catch_0
    move-exception v2

    .line 87
    invoke-virtual {v2}, Ljava/lang/Throwable;->printStackTrace()V

    .line 88
    .line 89
    .line 90
    :goto_0
    invoke-virtual {v3}, Landroid/app/Activity;->isFinishing()Z

    .line 91
    .line 92
    .line 93
    move-result v2

    .line 94
    if-eqz v2, :cond_1

    .line 95
    .line 96
    goto/16 :goto_4

    .line 97
    .line 98
    :cond_1
    iget-object v2, v3, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->N:Ljava/util/ArrayList;

    .line 99
    .line 100
    const-string v4, "hosts"

    .line 101
    .line 102
    if-eqz v2, :cond_11

    .line 103
    .line 104
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 105
    .line 106
    .line 107
    move-result v2

    .line 108
    if-eqz v2, :cond_2

    .line 109
    .line 110
    goto/16 :goto_4

    .line 111
    .line 112
    :cond_2
    sget-object v2, Lro;->s:Lzs;

    .line 113
    .line 114
    invoke-static {v2}, Lag;->k0(Ljava/lang/Iterable;)I

    .line 115
    .line 116
    .line 117
    move-result v5

    .line 118
    invoke-static {v5}, Lgb0;->i0(I)I

    .line 119
    .line 120
    .line 121
    move-result v5

    .line 122
    const/16 v6, 0x10

    .line 123
    .line 124
    if-ge v5, v6, :cond_3

    .line 125
    .line 126
    move v5, v6

    .line 127
    :cond_3
    new-instance v6, Ljava/util/LinkedHashMap;

    .line 128
    .line 129
    invoke-direct {v6, v5}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 130
    .line 131
    .line 132
    new-instance v5, Lz;

    .line 133
    .line 134
    invoke-direct {v5, v2}, Lz;-><init>(Lc0;)V

    .line 135
    .line 136
    .line 137
    :goto_1
    invoke-virtual {v5}, Lz;->hasNext()Z

    .line 138
    .line 139
    .line 140
    move-result v2

    .line 141
    if-eqz v2, :cond_4

    .line 142
    .line 143
    invoke-virtual {v5}, Lz;->next()Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v2

    .line 147
    check-cast v2, Lro;

    .line 148
    .line 149
    new-instance v7, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 150
    .line 151
    invoke-direct {v7, p1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 152
    .line 153
    .line 154
    invoke-interface {v6, v2, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    goto :goto_1

    .line 158
    :cond_4
    new-instance v2, Ljava/util/LinkedHashMap;

    .line 159
    .line 160
    invoke-direct {v2, v6}, Ljava/util/LinkedHashMap;-><init>(Ljava/util/Map;)V

    .line 161
    .line 162
    .line 163
    iput-object v2, v3, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->S:Ljava/util/LinkedHashMap;

    .line 164
    .line 165
    iget-object v2, v3, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->N:Ljava/util/ArrayList;

    .line 166
    .line 167
    if-eqz v2, :cond_10

    .line 168
    .line 169
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 170
    .line 171
    .line 172
    move-result v4

    .line 173
    :cond_5
    :goto_2
    const-string v5, "hashHostType"

    .line 174
    .line 175
    if-ge p1, v4, :cond_7

    .line 176
    .line 177
    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v6

    .line 181
    add-int/lit8 p1, p1, 0x1

    .line 182
    .line 183
    check-cast v6, Ld10;

    .line 184
    .line 185
    iget-object v7, v3, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->S:Ljava/util/LinkedHashMap;

    .line 186
    .line 187
    if-eqz v7, :cond_6

    .line 188
    .line 189
    iget-object v5, v6, Ld10;->a:Lro;

    .line 190
    .line 191
    invoke-virtual {v7, v5}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object v5

    .line 195
    check-cast v5, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 196
    .line 197
    if-eqz v5, :cond_5

    .line 198
    .line 199
    invoke-virtual {v5}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 200
    .line 201
    .line 202
    goto :goto_2

    .line 203
    :cond_6
    invoke-static {v5}, Li30;->S(Ljava/lang/String;)V

    .line 204
    .line 205
    .line 206
    throw v0

    .line 207
    :cond_7
    iget-object p1, v3, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->S:Ljava/util/LinkedHashMap;

    .line 208
    .line 209
    if-eqz p1, :cond_f

    .line 210
    .line 211
    invoke-virtual {p1}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 212
    .line 213
    .line 214
    move-result-object p1

    .line 215
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 216
    .line 217
    .line 218
    move-result-object p1

    .line 219
    :cond_8
    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 220
    .line 221
    .line 222
    move-result v2

    .line 223
    const-string v4, "hostTypes"

    .line 224
    .line 225
    if-eqz v2, :cond_a

    .line 226
    .line 227
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    move-result-object v2

    .line 231
    check-cast v2, Ljava/util/Map$Entry;

    .line 232
    .line 233
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 234
    .line 235
    .line 236
    move-result-object v5

    .line 237
    check-cast v5, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 238
    .line 239
    invoke-virtual {v5}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 240
    .line 241
    .line 242
    move-result v5

    .line 243
    if-eqz v5, :cond_8

    .line 244
    .line 245
    new-instance v5, Lg10;

    .line 246
    .line 247
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 248
    .line 249
    .line 250
    sget-object v6, Lro;->j:Lro;

    .line 251
    .line 252
    iput-object v6, v5, Lg10;->a:Lro;

    .line 253
    .line 254
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 255
    .line 256
    .line 257
    move-result-object v6

    .line 258
    check-cast v6, Lro;

    .line 259
    .line 260
    const-string v7, "<set-?>"

    .line 261
    .line 262
    invoke-static {v6, v7}, Li30;->m(Ljava/lang/Object;Ljava/lang/String;)V

    .line 263
    .line 264
    .line 265
    iput-object v6, v5, Lg10;->a:Lro;

    .line 266
    .line 267
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 268
    .line 269
    .line 270
    move-result-object v2

    .line 271
    check-cast v2, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 272
    .line 273
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 274
    .line 275
    .line 276
    move-result v2

    .line 277
    iput v2, v5, Lg10;->b:I

    .line 278
    .line 279
    iget-object v2, v3, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->T:Ljava/util/ArrayList;

    .line 280
    .line 281
    if-eqz v2, :cond_9

    .line 282
    .line 283
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 284
    .line 285
    .line 286
    goto :goto_3

    .line 287
    :cond_9
    invoke-static {v4}, Li30;->S(Ljava/lang/String;)V

    .line 288
    .line 289
    .line 290
    throw v0

    .line 291
    :cond_a
    iget-object p1, v3, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->T:Ljava/util/ArrayList;

    .line 292
    .line 293
    if-eqz p1, :cond_e

    .line 294
    .line 295
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 296
    .line 297
    .line 298
    move-result v0

    .line 299
    if-le v0, v1, :cond_b

    .line 300
    .line 301
    new-instance v0, Lbk;

    .line 302
    .line 303
    const/4 v2, 0x5

    .line 304
    invoke-direct {v0, v2}, Lbk;-><init>(I)V

    .line 305
    .line 306
    .line 307
    invoke-static {p1, v0}, Ldg;->l0(Ljava/util/List;Ljava/util/Comparator;)V

    .line 308
    .line 309
    .line 310
    :cond_b
    new-instance p1, Lla0;

    .line 311
    .line 312
    const/4 v0, 0x2

    .line 313
    invoke-direct {p1, v3, v0}, Lla0;-><init>(Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;I)V

    .line 314
    .line 315
    .line 316
    invoke-virtual {v3, p1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 317
    .line 318
    .line 319
    :goto_4
    invoke-virtual {v3}, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->C()Landroid/content/SharedPreferences;

    .line 320
    .line 321
    .line 322
    move-result-object p1

    .line 323
    const-string v0, "key_vibrate_finish"

    .line 324
    .line 325
    invoke-interface {p1, v0, v1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 326
    .line 327
    .line 328
    move-result p1

    .line 329
    if-eqz p1, :cond_d

    .line 330
    .line 331
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 332
    .line 333
    const/16 v0, 0x1f

    .line 334
    .line 335
    const-wide/16 v1, 0x32

    .line 336
    .line 337
    if-lt p1, v0, :cond_c

    .line 338
    .line 339
    const-string p1, "vibrator_manager"

    .line 340
    .line 341
    invoke-virtual {v3, p1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 342
    .line 343
    .line 344
    move-result-object p1

    .line 345
    const-string v0, "null cannot be cast to non-null type android.os.VibratorManager"

    .line 346
    .line 347
    invoke-static {p1, v0}, Li30;->k(Ljava/lang/Object;Ljava/lang/String;)V

    .line 348
    .line 349
    .line 350
    invoke-static {p1}, Llb;->l(Ljava/lang/Object;)Landroid/os/VibratorManager;

    .line 351
    .line 352
    .line 353
    move-result-object p1

    .line 354
    invoke-static {p1}, Llb;->k(Landroid/os/VibratorManager;)Landroid/os/Vibrator;

    .line 355
    .line 356
    .line 357
    move-result-object p1

    .line 358
    const-string v0, "getDefaultVibrator(...)"

    .line 359
    .line 360
    invoke-static {p1, v0}, Li30;->l(Ljava/lang/Object;Ljava/lang/String;)V

    .line 361
    .line 362
    .line 363
    const/4 v0, -0x1

    .line 364
    invoke-static {v1, v2, v0}, Landroid/os/VibrationEffect;->createOneShot(JI)Landroid/os/VibrationEffect;

    .line 365
    .line 366
    .line 367
    move-result-object v0

    .line 368
    invoke-virtual {p1, v0}, Landroid/os/Vibrator;->vibrate(Landroid/os/VibrationEffect;)V

    .line 369
    .line 370
    .line 371
    goto :goto_5

    .line 372
    :cond_c
    const-string p1, "vibrator"

    .line 373
    .line 374
    invoke-virtual {v3, p1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 375
    .line 376
    .line 377
    move-result-object p1

    .line 378
    const-string v0, "null cannot be cast to non-null type android.os.Vibrator"

    .line 379
    .line 380
    invoke-static {p1, v0}, Li30;->k(Ljava/lang/Object;Ljava/lang/String;)V

    .line 381
    .line 382
    .line 383
    check-cast p1, Landroid/os/Vibrator;

    .line 384
    .line 385
    invoke-virtual {p1, v1, v2}, Landroid/os/Vibrator;->vibrate(J)V

    .line 386
    .line 387
    .line 388
    :cond_d
    :goto_5
    sget-object p1, Lz31;->a:Lz31;

    .line 389
    .line 390
    return-object p1

    .line 391
    :cond_e
    invoke-static {v4}, Li30;->S(Ljava/lang/String;)V

    .line 392
    .line 393
    .line 394
    throw v0

    .line 395
    :cond_f
    invoke-static {v5}, Li30;->S(Ljava/lang/String;)V

    .line 396
    .line 397
    .line 398
    throw v0

    .line 399
    :cond_10
    invoke-static {v4}, Li30;->S(Ljava/lang/String;)V

    .line 400
    .line 401
    .line 402
    throw v0

    .line 403
    :cond_11
    invoke-static {v4}, Li30;->S(Ljava/lang/String;)V

    .line 404
    .line 405
    .line 406
    throw v0

    .line 407
    :pswitch_2
    check-cast v3, Lc0;

    .line 408
    .line 409
    if-ne p1, v3, :cond_12

    .line 410
    .line 411
    const-string p1, "(this Collection)"

    .line 412
    .line 413
    goto :goto_6

    .line 414
    :cond_12
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 415
    .line 416
    .line 417
    move-result-object p1

    .line 418
    :goto_6
    return-object p1

    .line 419
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
