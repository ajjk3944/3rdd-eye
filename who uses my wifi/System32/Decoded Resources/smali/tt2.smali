.class public final Ltt2;
.super Lhv1;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lp22;


# instance fields
.field public final f:Landroid/content/Context;

.field public final g:Ltr2;

.field public h:Lds2;

.field public i:Lpr2;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ltr2;Lds2;Lpr2;)V
    .locals 1

    .line 1
    const-string v0, "com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd"

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lhv1;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Ltt2;->f:Landroid/content/Context;

    .line 7
    .line 8
    iput-object p2, p0, Ltt2;->g:Ltr2;

    .line 9
    .line 10
    iput-object p3, p0, Ltt2;->h:Lds2;

    .line 11
    .line 12
    iput-object p4, p0, Ltt2;->i:Lpr2;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final A3(ILandroid/os/Parcel;Landroid/os/Parcel;)Z
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    const/4 v2, 0x0

    .line 4
    packed-switch p1, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    return v2

    .line 8
    :pswitch_0
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-static {p1}, Loi0;->X0(Landroid/os/IBinder;)Lu10;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-static {p2}, Liv1;->f(Landroid/os/Parcel;)V

    .line 17
    .line 18
    .line 19
    invoke-static {p1}, Loi0;->l1(Lu10;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    instance-of p2, p1, Landroid/view/ViewGroup;

    .line 24
    .line 25
    if-nez p2, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    iget-object p2, p0, Ltt2;->h:Lds2;

    .line 29
    .line 30
    if-eqz p2, :cond_1

    .line 31
    .line 32
    check-cast p1, Landroid/view/ViewGroup;

    .line 33
    .line 34
    invoke-virtual {p2, p1, v2}, Lds2;->c(Landroid/view/ViewGroup;Z)Z

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    if-eqz p1, :cond_1

    .line 39
    .line 40
    iget-object p1, p0, Ltt2;->g:Ltr2;

    .line 41
    .line 42
    invoke-virtual {p1}, Ltr2;->i()Lag2;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    new-instance p2, Lzs1;

    .line 47
    .line 48
    const/16 v0, 0x15

    .line 49
    .line 50
    invoke-direct {p2, v0, p0}, Lzs1;-><init>(ILjava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    invoke-interface {p1, p2}, Lag2;->N(Lq12;)V

    .line 54
    .line 55
    .line 56
    move v2, v1

    .line 57
    :cond_1
    :goto_0
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p3, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 61
    .line 62
    .line 63
    return v1

    .line 64
    :pswitch_1
    :try_start_0
    iget-object p1, p0, Ltt2;->i:Lpr2;

    .line 65
    .line 66
    iget-object p1, p1, Lpr2;->F:Lrr2;

    .line 67
    .line 68
    monitor-enter p1
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    .line 69
    :try_start_1
    iget-object p2, p1, Lrr2;->a:Lz12;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 70
    .line 71
    :try_start_2
    monitor-exit p1
    :try_end_2
    .catch Ljava/lang/NullPointerException; {:try_start_2 .. :try_end_2} :catch_0

    .line 72
    move-object v0, p2

    .line 73
    goto :goto_1

    .line 74
    :catchall_0
    move-exception p2

    .line 75
    :try_start_3
    monitor-exit p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 76
    :try_start_4
    throw p2
    :try_end_4
    .catch Ljava/lang/NullPointerException; {:try_start_4 .. :try_end_4} :catch_0

    .line 77
    :catch_0
    move-exception p1

    .line 78
    const-string p2, "InternalNativeCustomTemplateAdShim.getMediaContent"

    .line 79
    .line 80
    sget-object v2, Lhg4;->C:Lhg4;

    .line 81
    .line 82
    iget-object v2, v2, Lhg4;->h:Lgd2;

    .line 83
    .line 84
    invoke-virtual {v2, p2, p1}, Lgd2;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 85
    .line 86
    .line 87
    :goto_1
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 88
    .line 89
    .line 90
    invoke-static {p3, v0}, Liv1;->e(Landroid/os/Parcel;Landroid/os/IInterface;)V

    .line 91
    .line 92
    .line 93
    goto/16 :goto_e

    .line 94
    .line 95
    :pswitch_2
    :try_start_5
    iget-object p1, p0, Ltt2;->g:Ltr2;

    .line 96
    .line 97
    monitor-enter p1
    :try_end_5
    .catch Ljava/lang/NullPointerException; {:try_start_5 .. :try_end_5} :catch_1

    .line 98
    :try_start_6
    iget-object p2, p1, Ltr2;->y:Ljava/lang/String;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 99
    .line 100
    :try_start_7
    monitor-exit p1

    .line 101
    const-string p1, "Google"

    .line 102
    .line 103
    invoke-static {p2, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    move-result p1

    .line 107
    if-eqz p1, :cond_2

    .line 108
    .line 109
    const-string p1, "Illegal argument specified for omid partner name."

    .line 110
    .line 111
    invoke-static {p1}, Lgi2;->i0(Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    goto :goto_3

    .line 115
    :catch_1
    move-exception p1

    .line 116
    goto :goto_2

    .line 117
    :cond_2
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 118
    .line 119
    .line 120
    move-result p1

    .line 121
    if-eqz p1, :cond_3

    .line 122
    .line 123
    const-string p1, "Not starting OMID session. OM partner name has not been configured."

    .line 124
    .line 125
    invoke-static {p1}, Lgi2;->i0(Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    goto :goto_3

    .line 129
    :cond_3
    iget-object p1, p0, Ltt2;->i:Lpr2;

    .line 130
    .line 131
    if-eqz p1, :cond_4

    .line 132
    .line 133
    invoke-virtual {p1, p2, v2}, Lpr2;->e(Ljava/lang/String;Z)Lxz2;
    :try_end_7
    .catch Ljava/lang/NullPointerException; {:try_start_7 .. :try_end_7} :catch_1

    .line 134
    .line 135
    .line 136
    goto :goto_3

    .line 137
    :catchall_1
    move-exception p2

    .line 138
    :try_start_8
    monitor-exit p1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    .line 139
    :try_start_9
    throw p2
    :try_end_9
    .catch Ljava/lang/NullPointerException; {:try_start_9 .. :try_end_9} :catch_1

    .line 140
    :goto_2
    const-string p2, "InternalNativeCustomTemplateAdShim.initializeDisplayOpenMeasurement"

    .line 141
    .line 142
    sget-object v0, Lhg4;->C:Lhg4;

    .line 143
    .line 144
    iget-object v0, v0, Lhg4;->h:Lgd2;

    .line 145
    .line 146
    invoke-virtual {v0, p2, p1}, Lgd2;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 147
    .line 148
    .line 149
    :cond_4
    :goto_3
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 150
    .line 151
    .line 152
    goto/16 :goto_e

    .line 153
    .line 154
    :pswitch_3
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 155
    .line 156
    .line 157
    move-result-object p1

    .line 158
    invoke-static {p1}, Loi0;->X0(Landroid/os/IBinder;)Lu10;

    .line 159
    .line 160
    .line 161
    move-result-object p1

    .line 162
    invoke-static {p2}, Liv1;->f(Landroid/os/Parcel;)V

    .line 163
    .line 164
    .line 165
    invoke-static {p1}, Loi0;->l1(Lu10;)Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object p1

    .line 169
    instance-of p2, p1, Landroid/view/View;

    .line 170
    .line 171
    if-nez p2, :cond_5

    .line 172
    .line 173
    goto :goto_4

    .line 174
    :cond_5
    iget-object p2, p0, Ltt2;->g:Ltr2;

    .line 175
    .line 176
    invoke-virtual {p2}, Ltr2;->k()Lxz2;

    .line 177
    .line 178
    .line 179
    move-result-object p2

    .line 180
    if-eqz p2, :cond_6

    .line 181
    .line 182
    iget-object p2, p0, Ltt2;->i:Lpr2;

    .line 183
    .line 184
    if-eqz p2, :cond_6

    .line 185
    .line 186
    check-cast p1, Landroid/view/View;

    .line 187
    .line 188
    invoke-virtual {p2, p1}, Lpr2;->f(Landroid/view/View;)V

    .line 189
    .line 190
    .line 191
    :cond_6
    :goto_4
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 192
    .line 193
    .line 194
    return v1

    .line 195
    :pswitch_4
    iget-object p1, p0, Ltt2;->g:Ltr2;

    .line 196
    .line 197
    invoke-virtual {p1}, Ltr2;->k()Lxz2;

    .line 198
    .line 199
    .line 200
    move-result-object p2

    .line 201
    if-eqz p2, :cond_8

    .line 202
    .line 203
    sget-object v0, Lhg4;->C:Lhg4;

    .line 204
    .line 205
    iget-object v0, v0, Lhg4;->x:Lsu2;

    .line 206
    .line 207
    iget-object p2, p2, Lxz2;->a:Lxb3;

    .line 208
    .line 209
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 210
    .line 211
    .line 212
    invoke-static {p2}, Lsu2;->j(Lxb3;)V

    .line 213
    .line 214
    .line 215
    invoke-virtual {p1}, Ltr2;->j()Lag2;

    .line 216
    .line 217
    .line 218
    move-result-object p2

    .line 219
    if-eqz p2, :cond_7

    .line 220
    .line 221
    invoke-virtual {p1}, Ltr2;->j()Lag2;

    .line 222
    .line 223
    .line 224
    move-result-object p1

    .line 225
    new-instance p2, Ls8;

    .line 226
    .line 227
    invoke-direct {p2, v2}, Lbw0;-><init>(I)V

    .line 228
    .line 229
    .line 230
    const-string v0, "onSdkLoaded"

    .line 231
    .line 232
    invoke-interface {p1, v0, p2}, Ll52;->a(Ljava/lang/String;Ljava/util/Map;)V

    .line 233
    .line 234
    .line 235
    :cond_7
    move v2, v1

    .line 236
    goto :goto_5

    .line 237
    :cond_8
    const-string p1, "Trying to start OMID session before creation."

    .line 238
    .line 239
    invoke-static {p1}, Lgi2;->i0(Ljava/lang/String;)V

    .line 240
    .line 241
    .line 242
    :goto_5
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 243
    .line 244
    .line 245
    sget-object p1, Liv1;->a:Ljava/lang/ClassLoader;

    .line 246
    .line 247
    invoke-virtual {p3, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 248
    .line 249
    .line 250
    return v1

    .line 251
    :pswitch_5
    iget-object p1, p0, Ltt2;->i:Lpr2;

    .line 252
    .line 253
    if-eqz p1, :cond_9

    .line 254
    .line 255
    iget-object p1, p1, Lpr2;->p:Lvr2;

    .line 256
    .line 257
    invoke-virtual {p1}, Lvr2;->c()Z

    .line 258
    .line 259
    .line 260
    move-result p1

    .line 261
    if-eqz p1, :cond_c

    .line 262
    .line 263
    :cond_9
    iget-object p1, p0, Ltt2;->g:Ltr2;

    .line 264
    .line 265
    invoke-virtual {p1}, Ltr2;->j()Lag2;

    .line 266
    .line 267
    .line 268
    move-result-object p2

    .line 269
    if-nez p2, :cond_a

    .line 270
    .line 271
    goto :goto_6

    .line 272
    :cond_a
    invoke-virtual {p1}, Ltr2;->h()Lag2;

    .line 273
    .line 274
    .line 275
    move-result-object p1

    .line 276
    if-eqz p1, :cond_b

    .line 277
    .line 278
    goto :goto_6

    .line 279
    :cond_b
    move v2, v1

    .line 280
    :cond_c
    :goto_6
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 281
    .line 282
    .line 283
    sget-object p1, Liv1;->a:Ljava/lang/ClassLoader;

    .line 284
    .line 285
    invoke-virtual {p3, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 286
    .line 287
    .line 288
    return v1

    .line 289
    :pswitch_6
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 290
    .line 291
    .line 292
    sget-object p1, Liv1;->a:Ljava/lang/ClassLoader;

    .line 293
    .line 294
    invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 295
    .line 296
    .line 297
    return v1

    .line 298
    :pswitch_7
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 299
    .line 300
    .line 301
    move-result-object p1

    .line 302
    invoke-static {p1}, Loi0;->X0(Landroid/os/IBinder;)Lu10;

    .line 303
    .line 304
    .line 305
    move-result-object p1

    .line 306
    invoke-static {p2}, Liv1;->f(Landroid/os/Parcel;)V

    .line 307
    .line 308
    .line 309
    invoke-virtual {p0, p1}, Ltt2;->D(Lu10;)Z

    .line 310
    .line 311
    .line 312
    move-result p1

    .line 313
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 314
    .line 315
    .line 316
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeInt(I)V

    .line 317
    .line 318
    .line 319
    return v1

    .line 320
    :pswitch_8
    invoke-virtual {p0}, Ltt2;->R0()Lu10;

    .line 321
    .line 322
    .line 323
    move-result-object p1

    .line 324
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 325
    .line 326
    .line 327
    invoke-static {p3, p1}, Liv1;->e(Landroid/os/Parcel;Landroid/os/IInterface;)V

    .line 328
    .line 329
    .line 330
    return v1

    .line 331
    :pswitch_9
    iget-object p1, p0, Ltt2;->i:Lpr2;

    .line 332
    .line 333
    if-eqz p1, :cond_d

    .line 334
    .line 335
    invoke-virtual {p1}, Lpr2;->o()V

    .line 336
    .line 337
    .line 338
    :cond_d
    iput-object v0, p0, Ltt2;->i:Lpr2;

    .line 339
    .line 340
    iput-object v0, p0, Ltt2;->h:Lds2;

    .line 341
    .line 342
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 343
    .line 344
    .line 345
    return v1

    .line 346
    :pswitch_a
    iget-object p1, p0, Ltt2;->g:Ltr2;

    .line 347
    .line 348
    invoke-virtual {p1}, Ltr2;->r()Lpy2;

    .line 349
    .line 350
    .line 351
    move-result-object p1

    .line 352
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 353
    .line 354
    .line 355
    invoke-static {p3, p1}, Liv1;->e(Landroid/os/Parcel;Landroid/os/IInterface;)V

    .line 356
    .line 357
    .line 358
    return v1

    .line 359
    :pswitch_b
    iget-object p1, p0, Ltt2;->i:Lpr2;

    .line 360
    .line 361
    if-eqz p1, :cond_f

    .line 362
    .line 363
    monitor-enter p1

    .line 364
    :try_start_a
    iget-boolean p2, p1, Lpr2;->y:Z
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_2

    .line 365
    .line 366
    if-eqz p2, :cond_e

    .line 367
    .line 368
    :goto_7
    monitor-exit p1

    .line 369
    goto :goto_8

    .line 370
    :cond_e
    :try_start_b
    iget-object p2, p1, Lpr2;->n:Lwr2;

    .line 371
    .line 372
    invoke-interface {p2}, Lwr2;->j0()V

    .line 373
    .line 374
    .line 375
    goto :goto_7

    .line 376
    :catchall_2
    move-exception p2

    .line 377
    monitor-exit p1
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_2

    .line 378
    throw p2

    .line 379
    :cond_f
    :goto_8
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 380
    .line 381
    .line 382
    return v1

    .line 383
    :pswitch_c
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 384
    .line 385
    .line 386
    move-result-object p1

    .line 387
    invoke-static {p2}, Liv1;->f(Landroid/os/Parcel;)V

    .line 388
    .line 389
    .line 390
    iget-object p2, p0, Ltt2;->i:Lpr2;

    .line 391
    .line 392
    if-eqz p2, :cond_10

    .line 393
    .line 394
    monitor-enter p2

    .line 395
    :try_start_c
    iget-object v0, p2, Lpr2;->n:Lwr2;

    .line 396
    .line 397
    invoke-interface {v0, p1}, Lwr2;->J(Ljava/lang/String;)V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_3

    .line 398
    .line 399
    .line 400
    monitor-exit p2

    .line 401
    goto :goto_9

    .line 402
    :catchall_3
    move-exception p1

    .line 403
    :try_start_d
    monitor-exit p2
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_3

    .line 404
    throw p1

    .line 405
    :cond_10
    :goto_9
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 406
    .line 407
    .line 408
    return v1

    .line 409
    :pswitch_d
    iget-object p1, p0, Ltt2;->g:Ltr2;

    .line 410
    .line 411
    invoke-virtual {p1}, Ltr2;->g()Ljava/lang/String;

    .line 412
    .line 413
    .line 414
    move-result-object p1

    .line 415
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 416
    .line 417
    .line 418
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 419
    .line 420
    .line 421
    return v1

    .line 422
    :pswitch_e
    :try_start_e
    iget-object p1, p0, Ltt2;->g:Ltr2;

    .line 423
    .line 424
    monitor-enter p1
    :try_end_e
    .catch Ljava/lang/NullPointerException; {:try_start_e .. :try_end_e} :catch_2

    .line 425
    :try_start_f
    iget-object p2, p1, Ltr2;->v:Lbw0;
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_5

    .line 426
    .line 427
    :try_start_10
    monitor-exit p1

    .line 428
    monitor-enter p1
    :try_end_10
    .catch Ljava/lang/NullPointerException; {:try_start_10 .. :try_end_10} :catch_2

    .line 429
    :try_start_11
    iget-object v0, p1, Ltr2;->w:Lbw0;
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_4

    .line 430
    .line 431
    :try_start_12
    monitor-exit p1

    .line 432
    iget p1, p2, Lbw0;->h:I

    .line 433
    .line 434
    iget v3, v0, Lbw0;->h:I

    .line 435
    .line 436
    add-int/2addr p1, v3

    .line 437
    new-array p1, p1, [Ljava/lang/String;

    .line 438
    .line 439
    move v3, v2

    .line 440
    move v4, v3

    .line 441
    :goto_a
    iget v5, p2, Lbw0;->h:I

    .line 442
    .line 443
    if-ge v3, v5, :cond_11

    .line 444
    .line 445
    invoke-virtual {p2, v3}, Lbw0;->f(I)Ljava/lang/Object;

    .line 446
    .line 447
    .line 448
    move-result-object v5

    .line 449
    check-cast v5, Ljava/lang/String;

    .line 450
    .line 451
    aput-object v5, p1, v4

    .line 452
    .line 453
    add-int/lit8 v4, v4, 0x1

    .line 454
    .line 455
    add-int/lit8 v3, v3, 0x1

    .line 456
    .line 457
    goto :goto_a

    .line 458
    :catch_2
    move-exception p1

    .line 459
    goto :goto_c

    .line 460
    :cond_11
    :goto_b
    iget p2, v0, Lbw0;->h:I

    .line 461
    .line 462
    if-ge v2, p2, :cond_12

    .line 463
    .line 464
    invoke-virtual {v0, v2}, Lbw0;->f(I)Ljava/lang/Object;

    .line 465
    .line 466
    .line 467
    move-result-object p2

    .line 468
    check-cast p2, Ljava/lang/String;

    .line 469
    .line 470
    aput-object p2, p1, v4

    .line 471
    .line 472
    add-int/lit8 v4, v4, 0x1

    .line 473
    .line 474
    add-int/lit8 v2, v2, 0x1

    .line 475
    .line 476
    goto :goto_b

    .line 477
    :cond_12
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 478
    .line 479
    .line 480
    move-result-object p1
    :try_end_12
    .catch Ljava/lang/NullPointerException; {:try_start_12 .. :try_end_12} :catch_2

    .line 481
    goto :goto_d

    .line 482
    :catchall_4
    move-exception p2

    .line 483
    :try_start_13
    monitor-exit p1
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_4

    .line 484
    :try_start_14
    throw p2
    :try_end_14
    .catch Ljava/lang/NullPointerException; {:try_start_14 .. :try_end_14} :catch_2

    .line 485
    :catchall_5
    move-exception p2

    .line 486
    :try_start_15
    monitor-exit p1
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_5

    .line 487
    :try_start_16
    throw p2
    :try_end_16
    .catch Ljava/lang/NullPointerException; {:try_start_16 .. :try_end_16} :catch_2

    .line 488
    :goto_c
    const-string p2, "InternalNativeCustomTemplateAdShim.getAvailableAssetNames"

    .line 489
    .line 490
    sget-object v0, Lhg4;->C:Lhg4;

    .line 491
    .line 492
    iget-object v0, v0, Lhg4;->h:Lgd2;

    .line 493
    .line 494
    invoke-virtual {v0, p2, p1}, Lgd2;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 495
    .line 496
    .line 497
    new-instance p1, Ljava/util/ArrayList;

    .line 498
    .line 499
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 500
    .line 501
    .line 502
    :goto_d
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 503
    .line 504
    .line 505
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeStringList(Ljava/util/List;)V

    .line 506
    .line 507
    .line 508
    :goto_e
    return v1

    .line 509
    :pswitch_f
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 510
    .line 511
    .line 512
    move-result-object p1

    .line 513
    invoke-static {p2}, Liv1;->f(Landroid/os/Parcel;)V

    .line 514
    .line 515
    .line 516
    iget-object v0, p0, Ltt2;->g:Ltr2;

    .line 517
    .line 518
    monitor-enter v0

    .line 519
    :try_start_17
    iget-object p2, v0, Ltr2;->v:Lbw0;
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_6

    .line 520
    .line 521
    monitor-exit v0

    .line 522
    invoke-virtual {p2, p1}, Lbw0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 523
    .line 524
    .line 525
    move-result-object p1

    .line 526
    check-cast p1, Lb22;

    .line 527
    .line 528
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 529
    .line 530
    .line 531
    invoke-static {p3, p1}, Liv1;->e(Landroid/os/Parcel;Landroid/os/IInterface;)V

    .line 532
    .line 533
    .line 534
    return v1

    .line 535
    :catchall_6
    move-exception p1

    .line 536
    :try_start_18
    monitor-exit v0
    :try_end_18
    .catchall {:try_start_18 .. :try_end_18} :catchall_6

    .line 537
    throw p1

    .line 538
    :pswitch_10
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 539
    .line 540
    .line 541
    move-result-object p1

    .line 542
    invoke-static {p2}, Liv1;->f(Landroid/os/Parcel;)V

    .line 543
    .line 544
    .line 545
    iget-object p2, p0, Ltt2;->g:Ltr2;

    .line 546
    .line 547
    monitor-enter p2

    .line 548
    :try_start_19
    iget-object v0, p2, Ltr2;->w:Lbw0;
    :try_end_19
    .catchall {:try_start_19 .. :try_end_19} :catchall_7

    .line 549
    .line 550
    monitor-exit p2

    .line 551
    invoke-virtual {v0, p1}, Lbw0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 552
    .line 553
    .line 554
    move-result-object p1

    .line 555
    check-cast p1, Ljava/lang/String;

    .line 556
    .line 557
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 558
    .line 559
    .line 560
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 561
    .line 562
    .line 563
    return v1

    .line 564
    :catchall_7
    move-exception p1

    .line 565
    :try_start_1a
    monitor-exit p2
    :try_end_1a
    .catchall {:try_start_1a .. :try_end_1a} :catchall_7

    .line 566
    throw p1

    .line 567
    :pswitch_data_0
    .packed-switch 0x1
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

.method public final D(Lu10;)Z
    .locals 3

    .line 1
    invoke-static {p1}, Loi0;->l1(Lu10;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    instance-of v0, p1, Landroid/view/ViewGroup;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    iget-object v0, p0, Ltt2;->h:Lds2;

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    check-cast p1, Landroid/view/ViewGroup;

    .line 15
    .line 16
    const/4 v1, 0x1

    .line 17
    invoke-virtual {v0, p1, v1}, Lds2;->c(Landroid/view/ViewGroup;Z)Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    if-eqz p1, :cond_1

    .line 22
    .line 23
    iget-object p1, p0, Ltt2;->g:Ltr2;

    .line 24
    .line 25
    invoke-virtual {p1}, Ltr2;->h()Lag2;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    new-instance v0, Lzs1;

    .line 30
    .line 31
    const/16 v2, 0x15

    .line 32
    .line 33
    invoke-direct {v0, v2, p0}, Lzs1;-><init>(ILjava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    invoke-interface {p1, v0}, Lag2;->N(Lq12;)V

    .line 37
    .line 38
    .line 39
    return v1

    .line 40
    :cond_1
    :goto_0
    const/4 p1, 0x0

    .line 41
    return p1
.end method

.method public final R0()Lu10;
    .locals 2

    .line 1
    new-instance v0, Loi0;

    .line 2
    .line 3
    iget-object v1, p0, Ltt2;->f:Landroid/content/Context;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Loi0;-><init>(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public final f()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Ltt2;->g:Ltr2;

    .line 2
    .line 3
    invoke-virtual {v0}, Ltr2;->g()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method
