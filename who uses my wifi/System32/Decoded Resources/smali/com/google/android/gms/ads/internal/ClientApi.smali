.class public Lcom/google/android/gms/ads/internal/ClientApi;
.super Lhv1;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lek2;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    const-string v0, "com.google.android.gms.ads.internal.client.IClientApi"

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lhv1;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final A3(ILandroid/os/Parcel;Landroid/os/Parcel;)Z
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    packed-switch p1, :pswitch_data_0

    .line 3
    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    return p1

    .line 7
    :pswitch_0
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-static {p1}, Loi0;->X0(Landroid/os/IBinder;)Lu10;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-static {v0}, Ls62;->B3(Landroid/os/IBinder;)Lu62;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    invoke-static {p2}, Liv1;->f(Landroid/os/Parcel;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0, p1, v0, v1}, Lcom/google/android/gms/ads/internal/ClientApi;->T0(Lu10;Lu62;I)Lkh2;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 35
    .line 36
    .line 37
    invoke-static {p3, p1}, Liv1;->e(Landroid/os/Parcel;Landroid/os/IInterface;)V

    .line 38
    .line 39
    .line 40
    goto/16 :goto_1

    .line 41
    .line 42
    :pswitch_1
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-static {p1}, Loi0;->X0(Landroid/os/IBinder;)Lu10;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-static {v0}, Ls62;->B3(Landroid/os/IBinder;)Lu62;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    invoke-static {p2}, Liv1;->f(Landroid/os/Parcel;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p0, p1, v0, v1}, Lcom/google/android/gms/ads/internal/ClientApi;->Y0(Lu10;Lu62;I)Luv2;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 70
    .line 71
    .line 72
    invoke-static {p3, p1}, Liv1;->e(Landroid/os/Parcel;Landroid/os/IInterface;)V

    .line 73
    .line 74
    .line 75
    goto/16 :goto_1

    .line 76
    .line 77
    :pswitch_2
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    invoke-static {p1}, Loi0;->X0(Landroid/os/IBinder;)Lu10;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    invoke-static {v1}, Ls62;->B3(Landroid/os/IBinder;)Lu62;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 94
    .line 95
    .line 96
    move-result v2

    .line 97
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 98
    .line 99
    .line 100
    move-result-object v3

    .line 101
    if-nez v3, :cond_0

    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_0
    const-string v0, "com.google.android.gms.ads.internal.h5.client.IH5AdsEventListener"

    .line 105
    .line 106
    invoke-interface {v3, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 107
    .line 108
    .line 109
    move-result-object v4

    .line 110
    instance-of v5, v4, Lm42;

    .line 111
    .line 112
    if-eqz v5, :cond_1

    .line 113
    .line 114
    move-object v0, v4

    .line 115
    check-cast v0, Lm42;

    .line 116
    .line 117
    goto :goto_0

    .line 118
    :cond_1
    new-instance v4, Lm42;

    .line 119
    .line 120
    const/4 v5, 0x2

    .line 121
    invoke-direct {v4, v3, v0, v5}, Lsb1;-><init>(Landroid/os/IBinder;Ljava/lang/String;I)V

    .line 122
    .line 123
    .line 124
    move-object v0, v4

    .line 125
    :goto_0
    invoke-static {p2}, Liv1;->f(Landroid/os/Parcel;)V

    .line 126
    .line 127
    .line 128
    invoke-static {p1}, Loi0;->l1(Lu10;)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    check-cast p1, Landroid/content/Context;

    .line 133
    .line 134
    invoke-static {p1, v1, v2}, Lth2;->a(Landroid/content/Context;Lu62;I)Lth2;

    .line 135
    .line 136
    .line 137
    move-result-object p2

    .line 138
    iget-object p2, p2, Lth2;->b:Lth2;

    .line 139
    .line 140
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 141
    .line 142
    .line 143
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 144
    .line 145
    .line 146
    new-instance v1, Lci2;

    .line 147
    .line 148
    invoke-direct {v1, p2, p1, v0}, Lci2;-><init>(Lth2;Landroid/content/Context;Lm42;)V

    .line 149
    .line 150
    .line 151
    iget-object p1, v1, Lci2;->e:Lba4;

    .line 152
    .line 153
    invoke-virtual {p1}, Lba4;->d()Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object p1

    .line 157
    check-cast p1, Lbw2;

    .line 158
    .line 159
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 160
    .line 161
    .line 162
    invoke-static {p3, p1}, Liv1;->e(Landroid/os/Parcel;Landroid/os/IInterface;)V

    .line 163
    .line 164
    .line 165
    goto/16 :goto_1

    .line 166
    .line 167
    :pswitch_3
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 168
    .line 169
    .line 170
    move-result-object p1

    .line 171
    invoke-static {p1}, Loi0;->X0(Landroid/os/IBinder;)Lu10;

    .line 172
    .line 173
    .line 174
    move-result-object p1

    .line 175
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 176
    .line 177
    .line 178
    move-result-object v0

    .line 179
    invoke-static {v0}, Ls62;->B3(Landroid/os/IBinder;)Lu62;

    .line 180
    .line 181
    .line 182
    move-result-object v0

    .line 183
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 184
    .line 185
    .line 186
    move-result v1

    .line 187
    invoke-static {p2}, Liv1;->f(Landroid/os/Parcel;)V

    .line 188
    .line 189
    .line 190
    invoke-virtual {p0, p1, v0, v1}, Lcom/google/android/gms/ads/internal/ClientApi;->r1(Lu10;Lu62;I)Lw82;

    .line 191
    .line 192
    .line 193
    move-result-object p1

    .line 194
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 195
    .line 196
    .line 197
    invoke-static {p3, p1}, Liv1;->e(Landroid/os/Parcel;Landroid/os/IInterface;)V

    .line 198
    .line 199
    .line 200
    goto/16 :goto_1

    .line 201
    .line 202
    :pswitch_4
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 203
    .line 204
    .line 205
    move-result-object p1

    .line 206
    invoke-static {p1}, Loi0;->X0(Landroid/os/IBinder;)Lu10;

    .line 207
    .line 208
    .line 209
    move-result-object p1

    .line 210
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 211
    .line 212
    .line 213
    move-result-object v0

    .line 214
    invoke-static {v0}, Ls62;->B3(Landroid/os/IBinder;)Lu62;

    .line 215
    .line 216
    .line 217
    move-result-object v0

    .line 218
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 219
    .line 220
    .line 221
    move-result v1

    .line 222
    invoke-static {p2}, Liv1;->f(Landroid/os/Parcel;)V

    .line 223
    .line 224
    .line 225
    invoke-virtual {p0, p1, v0, v1}, Lcom/google/android/gms/ads/internal/ClientApi;->c2(Lu10;Lu62;I)Lwc2;

    .line 226
    .line 227
    .line 228
    move-result-object p1

    .line 229
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 230
    .line 231
    .line 232
    invoke-static {p3, p1}, Liv1;->e(Landroid/os/Parcel;Landroid/os/IInterface;)V

    .line 233
    .line 234
    .line 235
    goto/16 :goto_1

    .line 236
    .line 237
    :pswitch_5
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 238
    .line 239
    .line 240
    move-result-object p1

    .line 241
    invoke-static {p1}, Loi0;->X0(Landroid/os/IBinder;)Lu10;

    .line 242
    .line 243
    .line 244
    move-result-object v1

    .line 245
    sget-object p1, Lxe4;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 246
    .line 247
    invoke-static {p2, p1}, Liv1;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 248
    .line 249
    .line 250
    move-result-object p1

    .line 251
    move-object v2, p1

    .line 252
    check-cast v2, Lxe4;

    .line 253
    .line 254
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 255
    .line 256
    .line 257
    move-result-object v3

    .line 258
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 259
    .line 260
    .line 261
    move-result-object p1

    .line 262
    invoke-static {p1}, Ls62;->B3(Landroid/os/IBinder;)Lu62;

    .line 263
    .line 264
    .line 265
    move-result-object v4

    .line 266
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 267
    .line 268
    .line 269
    move-result v5

    .line 270
    invoke-static {p2}, Liv1;->f(Landroid/os/Parcel;)V

    .line 271
    .line 272
    .line 273
    move-object v0, p0

    .line 274
    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/ads/internal/ClientApi;->Y2(Lu10;Lxe4;Ljava/lang/String;Lu62;I)Lba2;

    .line 275
    .line 276
    .line 277
    move-result-object p1

    .line 278
    move-object v1, v0

    .line 279
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 280
    .line 281
    .line 282
    invoke-static {p3, p1}, Liv1;->e(Landroid/os/Parcel;Landroid/os/IInterface;)V

    .line 283
    .line 284
    .line 285
    goto/16 :goto_1

    .line 286
    .line 287
    :pswitch_6
    move-object v1, p0

    .line 288
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 289
    .line 290
    .line 291
    move-result-object p1

    .line 292
    invoke-static {p1}, Loi0;->X0(Landroid/os/IBinder;)Lu10;

    .line 293
    .line 294
    .line 295
    move-result-object p1

    .line 296
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 297
    .line 298
    .line 299
    move-result-object v0

    .line 300
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 301
    .line 302
    .line 303
    move-result-object v2

    .line 304
    invoke-static {v2}, Ls62;->B3(Landroid/os/IBinder;)Lu62;

    .line 305
    .line 306
    .line 307
    move-result-object v2

    .line 308
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 309
    .line 310
    .line 311
    move-result v3

    .line 312
    invoke-static {p2}, Liv1;->f(Landroid/os/Parcel;)V

    .line 313
    .line 314
    .line 315
    invoke-virtual {p0, p1, v0, v2, v3}, Lcom/google/android/gms/ads/internal/ClientApi;->s2(Lu10;Ljava/lang/String;Lu62;I)Lya2;

    .line 316
    .line 317
    .line 318
    move-result-object p1

    .line 319
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 320
    .line 321
    .line 322
    invoke-static {p3, p1}, Liv1;->e(Landroid/os/Parcel;Landroid/os/IInterface;)V

    .line 323
    .line 324
    .line 325
    goto/16 :goto_1

    .line 326
    .line 327
    :pswitch_7
    move-object v1, p0

    .line 328
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 329
    .line 330
    .line 331
    move-result-object p1

    .line 332
    invoke-static {p1}, Loi0;->X0(Landroid/os/IBinder;)Lu10;

    .line 333
    .line 334
    .line 335
    move-result-object p1

    .line 336
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 337
    .line 338
    .line 339
    move-result-object v0

    .line 340
    invoke-static {v0}, Loi0;->X0(Landroid/os/IBinder;)Lu10;

    .line 341
    .line 342
    .line 343
    move-result-object v0

    .line 344
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 345
    .line 346
    .line 347
    move-result-object v2

    .line 348
    invoke-static {v2}, Loi0;->X0(Landroid/os/IBinder;)Lu10;

    .line 349
    .line 350
    .line 351
    move-result-object v2

    .line 352
    invoke-static {p2}, Liv1;->f(Landroid/os/Parcel;)V

    .line 353
    .line 354
    .line 355
    invoke-static {p1}, Loi0;->l1(Lu10;)Ljava/lang/Object;

    .line 356
    .line 357
    .line 358
    move-result-object p1

    .line 359
    check-cast p1, Landroid/view/View;

    .line 360
    .line 361
    invoke-static {v0}, Loi0;->l1(Lu10;)Ljava/lang/Object;

    .line 362
    .line 363
    .line 364
    move-result-object p2

    .line 365
    check-cast p2, Ljava/util/HashMap;

    .line 366
    .line 367
    invoke-static {v2}, Loi0;->l1(Lu10;)Ljava/lang/Object;

    .line 368
    .line 369
    .line 370
    move-result-object v0

    .line 371
    check-cast v0, Ljava/util/HashMap;

    .line 372
    .line 373
    new-instance v2, Las2;

    .line 374
    .line 375
    invoke-direct {v2, p1, p2, v0}, Las2;-><init>(Landroid/view/View;Ljava/util/HashMap;Ljava/util/HashMap;)V

    .line 376
    .line 377
    .line 378
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 379
    .line 380
    .line 381
    invoke-static {p3, v2}, Liv1;->e(Landroid/os/Parcel;Landroid/os/IInterface;)V

    .line 382
    .line 383
    .line 384
    goto/16 :goto_1

    .line 385
    .line 386
    :pswitch_8
    move-object v1, p0

    .line 387
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 388
    .line 389
    .line 390
    move-result-object p1

    .line 391
    invoke-static {p1}, Loi0;->X0(Landroid/os/IBinder;)Lu10;

    .line 392
    .line 393
    .line 394
    move-result-object p1

    .line 395
    sget-object v0, Lxe4;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 396
    .line 397
    invoke-static {p2, v0}, Liv1;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 398
    .line 399
    .line 400
    move-result-object v0

    .line 401
    check-cast v0, Lxe4;

    .line 402
    .line 403
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 404
    .line 405
    .line 406
    move-result-object v2

    .line 407
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 408
    .line 409
    .line 410
    move-result v3

    .line 411
    invoke-static {p2}, Liv1;->f(Landroid/os/Parcel;)V

    .line 412
    .line 413
    .line 414
    invoke-virtual {p0, p1, v0, v2, v3}, Lcom/google/android/gms/ads/internal/ClientApi;->b1(Lu10;Lxe4;Ljava/lang/String;I)Lba2;

    .line 415
    .line 416
    .line 417
    move-result-object p1

    .line 418
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 419
    .line 420
    .line 421
    invoke-static {p3, p1}, Liv1;->e(Landroid/os/Parcel;Landroid/os/IInterface;)V

    .line 422
    .line 423
    .line 424
    goto/16 :goto_1

    .line 425
    .line 426
    :pswitch_9
    move-object v1, p0

    .line 427
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 428
    .line 429
    .line 430
    move-result-object p1

    .line 431
    invoke-static {p1}, Loi0;->X0(Landroid/os/IBinder;)Lu10;

    .line 432
    .line 433
    .line 434
    move-result-object p1

    .line 435
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 436
    .line 437
    .line 438
    move-result v0

    .line 439
    invoke-static {p2}, Liv1;->f(Landroid/os/Parcel;)V

    .line 440
    .line 441
    .line 442
    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/ads/internal/ClientApi;->I2(Lu10;I)Lzn2;

    .line 443
    .line 444
    .line 445
    move-result-object p1

    .line 446
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 447
    .line 448
    .line 449
    invoke-static {p3, p1}, Liv1;->e(Landroid/os/Parcel;Landroid/os/IInterface;)V

    .line 450
    .line 451
    .line 452
    goto/16 :goto_1

    .line 453
    .line 454
    :pswitch_a
    move-object v1, p0

    .line 455
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 456
    .line 457
    .line 458
    move-result-object p1

    .line 459
    invoke-static {p1}, Loi0;->X0(Landroid/os/IBinder;)Lu10;

    .line 460
    .line 461
    .line 462
    move-result-object p1

    .line 463
    invoke-static {p2}, Liv1;->f(Landroid/os/Parcel;)V

    .line 464
    .line 465
    .line 466
    invoke-virtual {p0, p1}, Lcom/google/android/gms/ads/internal/ClientApi;->M(Lu10;)Lc92;

    .line 467
    .line 468
    .line 469
    move-result-object p1

    .line 470
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 471
    .line 472
    .line 473
    invoke-static {p3, p1}, Liv1;->e(Landroid/os/Parcel;Landroid/os/IInterface;)V

    .line 474
    .line 475
    .line 476
    goto/16 :goto_1

    .line 477
    .line 478
    :pswitch_b
    move-object v1, p0

    .line 479
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 480
    .line 481
    .line 482
    move-result-object p1

    .line 483
    invoke-static {p1}, Loi0;->X0(Landroid/os/IBinder;)Lu10;

    .line 484
    .line 485
    .line 486
    invoke-static {p2}, Liv1;->f(Landroid/os/Parcel;)V

    .line 487
    .line 488
    .line 489
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 490
    .line 491
    .line 492
    invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 493
    .line 494
    .line 495
    goto/16 :goto_1

    .line 496
    .line 497
    :pswitch_c
    move-object v1, p0

    .line 498
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 499
    .line 500
    .line 501
    move-result-object p1

    .line 502
    invoke-static {p1}, Loi0;->X0(Landroid/os/IBinder;)Lu10;

    .line 503
    .line 504
    .line 505
    move-result-object p1

    .line 506
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 507
    .line 508
    .line 509
    move-result-object v2

    .line 510
    invoke-static {v2}, Ls62;->B3(Landroid/os/IBinder;)Lu62;

    .line 511
    .line 512
    .line 513
    move-result-object v2

    .line 514
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 515
    .line 516
    .line 517
    move-result v3

    .line 518
    invoke-static {p2}, Liv1;->f(Landroid/os/Parcel;)V

    .line 519
    .line 520
    .line 521
    invoke-static {p1}, Loi0;->l1(Lu10;)Ljava/lang/Object;

    .line 522
    .line 523
    .line 524
    move-result-object p1

    .line 525
    check-cast p1, Landroid/content/Context;

    .line 526
    .line 527
    invoke-static {p1, v2, v3}, Lth2;->a(Landroid/content/Context;Lu62;I)Lth2;

    .line 528
    .line 529
    .line 530
    move-result-object p2

    .line 531
    iget-object p2, p2, Lth2;->b:Lth2;

    .line 532
    .line 533
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 534
    .line 535
    .line 536
    new-instance v2, Lvq2;

    .line 537
    .line 538
    invoke-direct {v2, p2, p1, v0}, Lvq2;-><init>(Lth2;Landroid/content/Context;Ljava/lang/String;)V

    .line 539
    .line 540
    .line 541
    iget-object p1, v2, Lvq2;->g:Ljava/lang/Object;

    .line 542
    .line 543
    check-cast p1, Lba4;

    .line 544
    .line 545
    invoke-virtual {p1}, Lba4;->d()Ljava/lang/Object;

    .line 546
    .line 547
    .line 548
    move-result-object p1

    .line 549
    check-cast p1, Ly73;

    .line 550
    .line 551
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 552
    .line 553
    .line 554
    invoke-static {p3, p1}, Liv1;->e(Landroid/os/Parcel;Landroid/os/IInterface;)V

    .line 555
    .line 556
    .line 557
    goto/16 :goto_1

    .line 558
    .line 559
    :pswitch_d
    move-object v1, p0

    .line 560
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 561
    .line 562
    .line 563
    move-result-object p1

    .line 564
    invoke-static {p1}, Loi0;->X0(Landroid/os/IBinder;)Lu10;

    .line 565
    .line 566
    .line 567
    move-result-object p1

    .line 568
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 569
    .line 570
    .line 571
    move-result-object v0

    .line 572
    invoke-static {v0}, Loi0;->X0(Landroid/os/IBinder;)Lu10;

    .line 573
    .line 574
    .line 575
    move-result-object v0

    .line 576
    invoke-static {p2}, Liv1;->f(Landroid/os/Parcel;)V

    .line 577
    .line 578
    .line 579
    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/ads/internal/ClientApi;->x1(Lu10;Lu10;)Lf22;

    .line 580
    .line 581
    .line 582
    move-result-object p1

    .line 583
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 584
    .line 585
    .line 586
    invoke-static {p3, p1}, Liv1;->e(Landroid/os/Parcel;Landroid/os/IInterface;)V

    .line 587
    .line 588
    .line 589
    goto/16 :goto_1

    .line 590
    .line 591
    :pswitch_e
    move-object v1, p0

    .line 592
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 593
    .line 594
    .line 595
    move-result-object p1

    .line 596
    invoke-static {p1}, Loi0;->X0(Landroid/os/IBinder;)Lu10;

    .line 597
    .line 598
    .line 599
    invoke-static {p2}, Liv1;->f(Landroid/os/Parcel;)V

    .line 600
    .line 601
    .line 602
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 603
    .line 604
    .line 605
    invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 606
    .line 607
    .line 608
    goto/16 :goto_1

    .line 609
    .line 610
    :pswitch_f
    move-object v1, p0

    .line 611
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 612
    .line 613
    .line 614
    move-result-object p1

    .line 615
    invoke-static {p1}, Loi0;->X0(Landroid/os/IBinder;)Lu10;

    .line 616
    .line 617
    .line 618
    move-result-object p1

    .line 619
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 620
    .line 621
    .line 622
    move-result-object v0

    .line 623
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 624
    .line 625
    .line 626
    move-result-object v2

    .line 627
    invoke-static {v2}, Ls62;->B3(Landroid/os/IBinder;)Lu62;

    .line 628
    .line 629
    .line 630
    move-result-object v2

    .line 631
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 632
    .line 633
    .line 634
    move-result v3

    .line 635
    invoke-static {p2}, Liv1;->f(Landroid/os/Parcel;)V

    .line 636
    .line 637
    .line 638
    invoke-virtual {p0, p1, v0, v2, v3}, Lcom/google/android/gms/ads/internal/ClientApi;->i1(Lu10;Ljava/lang/String;Lu62;I)Lx72;

    .line 639
    .line 640
    .line 641
    move-result-object p1

    .line 642
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 643
    .line 644
    .line 645
    invoke-static {p3, p1}, Liv1;->e(Landroid/os/Parcel;Landroid/os/IInterface;)V

    .line 646
    .line 647
    .line 648
    goto :goto_1

    .line 649
    :pswitch_10
    move-object v1, p0

    .line 650
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 651
    .line 652
    .line 653
    move-result-object p1

    .line 654
    invoke-static {p1}, Loi0;->X0(Landroid/os/IBinder;)Lu10;

    .line 655
    .line 656
    .line 657
    move-result-object p1

    .line 658
    sget-object v0, Lxe4;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 659
    .line 660
    invoke-static {p2, v0}, Liv1;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 661
    .line 662
    .line 663
    move-result-object v0

    .line 664
    move-object v2, v0

    .line 665
    check-cast v2, Lxe4;

    .line 666
    .line 667
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 668
    .line 669
    .line 670
    move-result-object v3

    .line 671
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 672
    .line 673
    .line 674
    move-result-object v0

    .line 675
    invoke-static {v0}, Ls62;->B3(Landroid/os/IBinder;)Lu62;

    .line 676
    .line 677
    .line 678
    move-result-object v4

    .line 679
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 680
    .line 681
    .line 682
    move-result v5

    .line 683
    invoke-static {p2}, Liv1;->f(Landroid/os/Parcel;)V

    .line 684
    .line 685
    .line 686
    move-object v0, v1

    .line 687
    move-object v1, p1

    .line 688
    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/ads/internal/ClientApi;->E2(Lu10;Lxe4;Ljava/lang/String;Lu62;I)Lba2;

    .line 689
    .line 690
    .line 691
    move-result-object p1

    .line 692
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 693
    .line 694
    .line 695
    invoke-static {p3, p1}, Liv1;->e(Landroid/os/Parcel;Landroid/os/IInterface;)V

    .line 696
    .line 697
    .line 698
    goto :goto_1

    .line 699
    :pswitch_11
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 700
    .line 701
    .line 702
    move-result-object p1

    .line 703
    invoke-static {p1}, Loi0;->X0(Landroid/os/IBinder;)Lu10;

    .line 704
    .line 705
    .line 706
    move-result-object v1

    .line 707
    sget-object p1, Lxe4;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 708
    .line 709
    invoke-static {p2, p1}, Liv1;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 710
    .line 711
    .line 712
    move-result-object p1

    .line 713
    move-object v2, p1

    .line 714
    check-cast v2, Lxe4;

    .line 715
    .line 716
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 717
    .line 718
    .line 719
    move-result-object v3

    .line 720
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 721
    .line 722
    .line 723
    move-result-object p1

    .line 724
    invoke-static {p1}, Ls62;->B3(Landroid/os/IBinder;)Lu62;

    .line 725
    .line 726
    .line 727
    move-result-object v4

    .line 728
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 729
    .line 730
    .line 731
    move-result v5

    .line 732
    invoke-static {p2}, Liv1;->f(Landroid/os/Parcel;)V

    .line 733
    .line 734
    .line 735
    move-object v0, p0

    .line 736
    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/ads/internal/ClientApi;->T1(Lu10;Lxe4;Ljava/lang/String;Lu62;I)Lba2;

    .line 737
    .line 738
    .line 739
    move-result-object p1

    .line 740
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 741
    .line 742
    .line 743
    invoke-static {p3, p1}, Liv1;->e(Landroid/os/Parcel;Landroid/os/IInterface;)V

    .line 744
    .line 745
    .line 746
    :goto_1
    const/4 p1, 0x1

    .line 747
    return p1

    .line 748
    nop

    .line 749
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_11
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

.method public final E2(Lu10;Lxe4;Ljava/lang/String;Lu62;I)Lba2;
    .locals 0

    .line 1
    invoke-static {p1}, Loi0;->l1(Lu10;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Landroid/content/Context;

    .line 6
    .line 7
    invoke-static {p1, p4, p5}, Lth2;->a(Landroid/content/Context;Lu62;I)Lth2;

    .line 8
    .line 9
    .line 10
    move-result-object p4

    .line 11
    iget-object p4, p4, Lth2;->b:Lth2;

    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    new-instance p5, Lof3;

    .line 23
    .line 24
    invoke-direct {p5, p4, p1, p3, p2}, Lof3;-><init>(Lth2;Landroid/content/Context;Ljava/lang/String;Lxe4;)V

    .line 25
    .line 26
    .line 27
    iget-object p1, p5, Lof3;->g:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast p1, Lba4;

    .line 30
    .line 31
    invoke-virtual {p1}, Lba4;->d()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    check-cast p1, Lw23;

    .line 36
    .line 37
    return-object p1
.end method

.method public final I2(Lu10;I)Lzn2;
    .locals 1

    .line 1
    invoke-static {p1}, Loi0;->l1(Lu10;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Landroid/content/Context;

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    invoke-static {p1, v0, p2}, Lth2;->a(Landroid/content/Context;Lu62;I)Lth2;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    iget-object p1, p1, Lth2;->B:Lba4;

    .line 13
    .line 14
    invoke-virtual {p1}, Lba4;->d()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    check-cast p1, Loi2;

    .line 19
    .line 20
    return-object p1
.end method

.method public final M(Lu10;)Lc92;
    .locals 3

    .line 1
    invoke-static {p1}, Loi0;->l1(Lu10;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Landroid/app/Activity;

    .line 6
    .line 7
    invoke-virtual {p1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->a(Landroid/content/Intent;)Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    new-instance v0, Ljh1;

    .line 18
    .line 19
    const/4 v1, 0x4

    .line 20
    invoke-direct {v0, p1, v1}, Ljh1;-><init>(Landroid/app/Activity;I)V

    .line 21
    .line 22
    .line 23
    return-object v0

    .line 24
    :cond_0
    iget v1, v0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->p:I

    .line 25
    .line 26
    const/4 v2, 0x1

    .line 27
    if-eq v1, v2, :cond_5

    .line 28
    .line 29
    const/4 v2, 0x2

    .line 30
    if-eq v1, v2, :cond_4

    .line 31
    .line 32
    const/4 v2, 0x3

    .line 33
    if-eq v1, v2, :cond_3

    .line 34
    .line 35
    const/4 v2, 0x4

    .line 36
    if-eq v1, v2, :cond_2

    .line 37
    .line 38
    const/4 v0, 0x5

    .line 39
    if-eq v1, v0, :cond_1

    .line 40
    .line 41
    new-instance v0, Ljh1;

    .line 42
    .line 43
    const/4 v1, 0x4

    .line 44
    invoke-direct {v0, p1, v1}, Ljh1;-><init>(Landroid/app/Activity;I)V

    .line 45
    .line 46
    .line 47
    return-object v0

    .line 48
    :cond_1
    new-instance v0, Ljh1;

    .line 49
    .line 50
    const/4 v1, 0x0

    .line 51
    invoke-direct {v0, p1, v1}, Ljh1;-><init>(Landroid/app/Activity;I)V

    .line 52
    .line 53
    .line 54
    return-object v0

    .line 55
    :cond_2
    new-instance v1, Lre1;

    .line 56
    .line 57
    invoke-direct {v1, p1, v0}, Lre1;-><init>(Landroid/app/Activity;Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;)V

    .line 58
    .line 59
    .line 60
    return-object v1

    .line 61
    :cond_3
    new-instance v0, Ljh1;

    .line 62
    .line 63
    const/4 v1, 0x2

    .line 64
    invoke-direct {v0, p1, v1}, Ljh1;-><init>(Landroid/app/Activity;I)V

    .line 65
    .line 66
    .line 67
    return-object v0

    .line 68
    :cond_4
    new-instance v0, Ljh1;

    .line 69
    .line 70
    const/4 v1, 0x1

    .line 71
    invoke-direct {v0, p1, v1}, Ljh1;-><init>(Landroid/app/Activity;I)V

    .line 72
    .line 73
    .line 74
    return-object v0

    .line 75
    :cond_5
    new-instance v0, Ljh1;

    .line 76
    .line 77
    const/4 v1, 0x3

    .line 78
    invoke-direct {v0, p1, v1}, Ljh1;-><init>(Landroid/app/Activity;I)V

    .line 79
    .line 80
    .line 81
    return-object v0
.end method

.method public final T0(Lu10;Lu62;I)Lkh2;
    .locals 0

    .line 1
    invoke-static {p1}, Loi0;->l1(Lu10;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Landroid/content/Context;

    .line 6
    .line 7
    invoke-static {p1, p2, p3}, Lth2;->a(Landroid/content/Context;Lu62;I)Lth2;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    iget-object p1, p1, Lth2;->C:Lba4;

    .line 12
    .line 13
    invoke-virtual {p1}, Lba4;->d()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    check-cast p1, Lmb3;

    .line 18
    .line 19
    return-object p1
.end method

.method public final T1(Lu10;Lxe4;Ljava/lang/String;Lu62;I)Lba2;
    .locals 10

    .line 1
    invoke-static {p1}, Loi0;->l1(Lu10;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    move-object v1, p1

    .line 6
    check-cast v1, Landroid/content/Context;

    .line 7
    .line 8
    invoke-static {v1, p4, p5}, Lth2;->a(Landroid/content/Context;Lu62;I)Lth2;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    iget-object p1, p1, Lth2;->b:Lth2;

    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    invoke-static {v1}, Lda4;->a(Ljava/lang/Object;)Lda4;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    invoke-static {p2}, Lda4;->a(Ljava/lang/Object;)Lda4;

    .line 28
    .line 29
    .line 30
    move-result-object v5

    .line 31
    iget-object p4, p1, Lth2;->j:Lba4;

    .line 32
    .line 33
    new-instance p5, Lri2;

    .line 34
    .line 35
    const/16 v0, 0x17

    .line 36
    .line 37
    invoke-direct {p5, p4, v0}, Lri2;-><init>(Lga4;I)V

    .line 38
    .line 39
    .line 40
    invoke-static {p5}, Lba4;->a(Lga4;)Lba4;

    .line 41
    .line 42
    .line 43
    move-result-object v7

    .line 44
    sget-object p5, Lyb;->p:Lzq2;

    .line 45
    .line 46
    invoke-static {p5}, Lba4;->a(Lga4;)Lba4;

    .line 47
    .line 48
    .line 49
    move-result-object v8

    .line 50
    sget-object p5, Lou1;->o:Lrv1;

    .line 51
    .line 52
    invoke-static {p5}, Lba4;->a(Lga4;)Lba4;

    .line 53
    .line 54
    .line 55
    move-result-object v9

    .line 56
    iget-object v4, p1, Lth2;->c:Lba4;

    .line 57
    .line 58
    iget-object v6, p1, Lth2;->D:Lda4;

    .line 59
    .line 60
    new-instance v2, Lbm2;

    .line 61
    .line 62
    invoke-direct/range {v2 .. v9}, Lbm2;-><init>(Lda4;Lba4;Lda4;Lda4;Lba4;Lba4;Lba4;)V

    .line 63
    .line 64
    .line 65
    invoke-static {v2}, Lba4;->a(Lga4;)Lba4;

    .line 66
    .line 67
    .line 68
    move-result-object p5

    .line 69
    new-instance v0, Lq23;

    .line 70
    .line 71
    invoke-virtual {p5}, Lba4;->d()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p5

    .line 75
    move-object v4, p5

    .line 76
    check-cast v4, Lz63;

    .line 77
    .line 78
    invoke-virtual {v7}, Lba4;->d()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object p5

    .line 82
    move-object v5, p5

    .line 83
    check-cast v5, Ls23;

    .line 84
    .line 85
    iget-object p1, p1, Lth2;->a:Leh2;

    .line 86
    .line 87
    iget-object v6, p1, Leh2;->a:Le51;

    .line 88
    .line 89
    invoke-static {v6}, Li41;->M(Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {p4}, Lba4;->d()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    move-object v7, p1

    .line 97
    check-cast v7, Lmv2;

    .line 98
    .line 99
    move-object v2, p2

    .line 100
    move-object v3, p3

    .line 101
    invoke-direct/range {v0 .. v7}, Lq23;-><init>(Landroid/content/Context;Lxe4;Ljava/lang/String;Lz63;Ls23;Le51;Lmv2;)V

    .line 102
    .line 103
    .line 104
    return-object v0
.end method

.method public final Y0(Lu10;Lu62;I)Luv2;
    .locals 0

    .line 1
    invoke-static {p1}, Loi0;->l1(Lu10;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Landroid/content/Context;

    .line 6
    .line 7
    invoke-static {p1, p2, p3}, Lth2;->a(Landroid/content/Context;Lu62;I)Lth2;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    iget-object p1, p1, Lth2;->x:Lba4;

    .line 12
    .line 13
    invoke-virtual {p1}, Lba4;->d()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    check-cast p1, Lex2;

    .line 18
    .line 19
    return-object p1
.end method

.method public final Y2(Lu10;Lxe4;Ljava/lang/String;Lu62;I)Lba2;
    .locals 8

    .line 1
    invoke-static {p1}, Loi0;->l1(Lu10;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Landroid/content/Context;

    .line 6
    .line 7
    invoke-static {p1, p4, p5}, Lth2;->a(Landroid/content/Context;Lu62;I)Lth2;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    iget-object p2, p2, Lth2;->b:Lth2;

    .line 12
    .line 13
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-static {p1}, Lda4;->a(Ljava/lang/Object;)Lda4;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-static {p3}, Lda4;->a(Ljava/lang/Object;)Lda4;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    iget-object p3, p2, Lth2;->I0:Lba4;

    .line 28
    .line 29
    iget-object p4, p2, Lth2;->J0:Lba4;

    .line 30
    .line 31
    new-instance v4, Ll73;

    .line 32
    .line 33
    const/4 p5, 0x0

    .line 34
    invoke-direct {v4, v1, p3, p4, p5}, Ll73;-><init>(Lda4;Lba4;Lba4;I)V

    .line 35
    .line 36
    .line 37
    new-instance p4, Lu43;

    .line 38
    .line 39
    const/4 p5, 0x6

    .line 40
    invoke-direct {p4, p3, p5}, Lu43;-><init>(Lga4;I)V

    .line 41
    .line 42
    .line 43
    invoke-static {p4}, Lba4;->a(Lga4;)Lba4;

    .line 44
    .line 45
    .line 46
    move-result-object v5

    .line 47
    iget-object v2, p2, Lth2;->c:Lba4;

    .line 48
    .line 49
    iget-object v3, p2, Lth2;->D:Lda4;

    .line 50
    .line 51
    iget-object v6, p2, Lth2;->h:Lph2;

    .line 52
    .line 53
    new-instance v0, Lar2;

    .line 54
    .line 55
    const/4 v7, 0x7

    .line 56
    invoke-direct/range {v0 .. v7}, Lar2;-><init>(Lda4;Lba4;Lda4;Lca4;Lba4;Lga4;I)V

    .line 57
    .line 58
    .line 59
    invoke-static {v0}, Lba4;->a(Lga4;)Lba4;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    iget-object v7, p2, Lth2;->j:Lba4;

    .line 64
    .line 65
    new-instance v0, Lbm2;

    .line 66
    .line 67
    move-object v2, v1

    .line 68
    move-object v1, v3

    .line 69
    move-object v3, p1

    .line 70
    invoke-direct/range {v0 .. v7}, Lbm2;-><init>(Lda4;Lda4;Lda4;Lba4;Lba4;Lph2;Lba4;)V

    .line 71
    .line 72
    .line 73
    invoke-static {v0}, Lba4;->a(Lga4;)Lba4;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    invoke-virtual {p1}, Lba4;->d()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    check-cast p1, Ly63;

    .line 82
    .line 83
    return-object p1
.end method

.method public final b1(Lu10;Lxe4;Ljava/lang/String;I)Lba2;
    .locals 6

    .line 1
    invoke-static {p1}, Loi0;->l1(Lu10;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Landroid/content/Context;

    .line 6
    .line 7
    new-instance v0, Le51;

    .line 8
    .line 9
    const/4 v5, 0x0

    .line 10
    const/4 v3, 0x0

    .line 11
    const v1, 0xf212370

    .line 12
    .line 13
    .line 14
    const/4 v4, 0x1

    .line 15
    move v2, p4

    .line 16
    invoke-direct/range {v0 .. v5}, Le51;-><init>(IIIZZ)V

    .line 17
    .line 18
    .line 19
    new-instance p4, Lpf4;

    .line 20
    .line 21
    invoke-direct {p4, p1, p2, p3, v0}, Lpf4;-><init>(Landroid/content/Context;Lxe4;Ljava/lang/String;Le51;)V

    .line 22
    .line 23
    .line 24
    return-object p4
.end method

.method public final c2(Lu10;Lu62;I)Lwc2;
    .locals 0

    .line 1
    invoke-static {p1}, Loi0;->l1(Lu10;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Landroid/content/Context;

    .line 6
    .line 7
    invoke-static {p1, p2, p3}, Lth2;->a(Landroid/content/Context;Lu62;I)Lth2;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    iget-object p1, p1, Lth2;->M:Lba4;

    .line 12
    .line 13
    invoke-virtual {p1}, Lba4;->d()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    check-cast p1, Lcr1;

    .line 18
    .line 19
    return-object p1
.end method

.method public final i1(Lu10;Ljava/lang/String;Lu62;I)Lx72;
    .locals 0

    .line 1
    invoke-static {p1}, Loi0;->l1(Lu10;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Landroid/content/Context;

    .line 6
    .line 7
    invoke-static {p1, p3, p4}, Lth2;->a(Landroid/content/Context;Lu62;I)Lth2;

    .line 8
    .line 9
    .line 10
    move-result-object p3

    .line 11
    new-instance p4, Lo23;

    .line 12
    .line 13
    invoke-direct {p4, p3, p1, p2}, Lo23;-><init>(Lth2;Landroid/content/Context;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    return-object p4
.end method

.method public final r1(Lu10;Lu62;I)Lw82;
    .locals 0

    .line 1
    invoke-static {p1}, Loi0;->l1(Lu10;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Landroid/content/Context;

    .line 6
    .line 7
    invoke-static {p1, p2, p3}, Lth2;->a(Landroid/content/Context;Lu62;I)Lth2;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    iget-object p1, p1, Lth2;->J:Lba4;

    .line 12
    .line 13
    invoke-virtual {p1}, Lba4;->d()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    check-cast p1, Lpz2;

    .line 18
    .line 19
    return-object p1
.end method

.method public final s2(Lu10;Ljava/lang/String;Lu62;I)Lya2;
    .locals 0

    .line 1
    invoke-static {p1}, Loi0;->l1(Lu10;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Landroid/content/Context;

    .line 6
    .line 7
    invoke-static {p1, p3, p4}, Lth2;->a(Landroid/content/Context;Lu62;I)Lth2;

    .line 8
    .line 9
    .line 10
    move-result-object p3

    .line 11
    iget-object p3, p3, Lth2;->b:Lth2;

    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    new-instance p4, Lvq2;

    .line 17
    .line 18
    invoke-direct {p4, p3, p1, p2}, Lvq2;-><init>(Lth2;Landroid/content/Context;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    iget-object p1, p4, Lvq2;->h:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast p1, Lba4;

    .line 24
    .line 25
    invoke-virtual {p1}, Lba4;->d()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    check-cast p1, Lx73;

    .line 30
    .line 31
    return-object p1
.end method

.method public final x1(Lu10;Lu10;)Lf22;
    .locals 1

    .line 1
    invoke-static {p1}, Loi0;->l1(Lu10;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Landroid/widget/FrameLayout;

    .line 6
    .line 7
    invoke-static {p2}, Loi0;->l1(Lu10;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    check-cast p2, Landroid/widget/FrameLayout;

    .line 12
    .line 13
    new-instance v0, Lcs2;

    .line 14
    .line 15
    invoke-direct {v0, p1, p2}, Lcs2;-><init>(Landroid/widget/FrameLayout;Landroid/widget/FrameLayout;)V

    .line 16
    .line 17
    .line 18
    return-object v0
.end method
