.class public final Lhf0;
.super Landroid/os/Binder;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Landroid/os/IInterface;


# instance fields
.field public final synthetic f:I

.field public final synthetic g:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroidx/room/MultiInstanceInvalidationService;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lhf0;->f:I

    .line 4
    iput-object p1, p0, Lhf0;->g:Ljava/lang/Object;

    .line 5
    invoke-direct {p0}, Landroid/os/Binder;-><init>()V

    .line 6
    const-string p1, "androidx.room.IMultiInstanceInvalidationService"

    invoke-virtual {p0, p0, p1}, Landroid/os/Binder;->attachInterface(Landroid/os/IInterface;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Lk01;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lhf0;->f:I

    .line 1
    iput-object p1, p0, Lhf0;->g:Ljava/lang/Object;

    .line 2
    invoke-direct {p0}, Landroid/os/Binder;-><init>()V

    const-string p1, "com.google.android.gms.appset.internal.IAppSetIdCallback"

    .line 3
    invoke-virtual {p0, p0, p1}, Landroid/os/Binder;->attachInterface(Landroid/os/IInterface;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final asBinder()Landroid/os/IBinder;
    .locals 1

    .line 1
    iget v0, p0, Lhf0;->f:I

    .line 2
    .line 3
    return-object p0
.end method

.method public final onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    .locals 6

    .line 1
    iget v0, p0, Lhf0;->f:I

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
    const v0, 0xffffff

    .line 10
    .line 11
    .line 12
    if-le p1, v0, :cond_0

    .line 13
    .line 14
    invoke-super {p0, p1, p2, p3, p4}, Landroid/os/Binder;->onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 15
    .line 16
    .line 17
    move-result p3

    .line 18
    if-eqz p3, :cond_1

    .line 19
    .line 20
    :goto_0
    move v2, v3

    .line 21
    goto :goto_3

    .line 22
    :cond_0
    invoke-virtual {p0}, Landroid/os/Binder;->getInterfaceDescriptor()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p3

    .line 26
    invoke-virtual {p2, p3}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    :cond_1
    if-ne p1, v3, :cond_6

    .line 30
    .line 31
    sget-object p1, Lcom/google/android/gms/common/api/Status;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 32
    .line 33
    sget p3, Lbc2;->a:I

    .line 34
    .line 35
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 36
    .line 37
    .line 38
    move-result p3

    .line 39
    if-nez p3, :cond_2

    .line 40
    .line 41
    move-object p1, v1

    .line 42
    goto :goto_1

    .line 43
    :cond_2
    invoke-interface {p1, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    check-cast p1, Landroid/os/Parcelable;

    .line 48
    .line 49
    :goto_1
    check-cast p1, Lcom/google/android/gms/common/api/Status;

    .line 50
    .line 51
    sget-object p3, Ljc2;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 52
    .line 53
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 54
    .line 55
    .line 56
    move-result p4

    .line 57
    if-nez p4, :cond_3

    .line 58
    .line 59
    move-object p2, v1

    .line 60
    goto :goto_2

    .line 61
    :cond_3
    invoke-interface {p3, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object p2

    .line 65
    check-cast p2, Landroid/os/Parcelable;

    .line 66
    .line 67
    :goto_2
    check-cast p2, Ljc2;

    .line 68
    .line 69
    if-eqz p2, :cond_4

    .line 70
    .line 71
    new-instance v1, Lh8;

    .line 72
    .line 73
    iget-object p3, p2, Ljc2;->f:Ljava/lang/String;

    .line 74
    .line 75
    iget p2, p2, Ljc2;->g:I

    .line 76
    .line 77
    invoke-direct {v1, p3, p2}, Lh8;-><init>(Ljava/lang/String;I)V

    .line 78
    .line 79
    .line 80
    :cond_4
    iget-object p2, p0, Lhf0;->g:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast p2, Lk01;

    .line 83
    .line 84
    iget-object p2, p2, Lk01;->a:Lgi4;

    .line 85
    .line 86
    iget p3, p1, Lcom/google/android/gms/common/api/Status;->f:I

    .line 87
    .line 88
    if-gtz p3, :cond_5

    .line 89
    .line 90
    invoke-virtual {p2, v1}, Lgi4;->e(Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_5
    new-instance p3, Ly4;

    .line 95
    .line 96
    invoke-direct {p3, p1}, Ly4;-><init>(Lcom/google/android/gms/common/api/Status;)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {p2, p3}, Lgi4;->d(Ljava/lang/Exception;)V

    .line 100
    .line 101
    .line 102
    goto :goto_0

    .line 103
    :cond_6
    :goto_3
    return v2

    .line 104
    :pswitch_0
    const-string v0, "androidx.room.IMultiInstanceInvalidationService"

    .line 105
    .line 106
    if-eq p1, v3, :cond_10

    .line 107
    .line 108
    const/4 v4, 0x2

    .line 109
    if-eq p1, v4, :cond_d

    .line 110
    .line 111
    const/4 v1, 0x3

    .line 112
    if-eq p1, v1, :cond_8

    .line 113
    .line 114
    const v1, 0x5f4e5446

    .line 115
    .line 116
    .line 117
    if-eq p1, v1, :cond_7

    .line 118
    .line 119
    invoke-super {p0, p1, p2, p3, p4}, Landroid/os/Binder;->onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 120
    .line 121
    .line 122
    move-result v3

    .line 123
    goto/16 :goto_b

    .line 124
    .line 125
    :cond_7
    invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    goto/16 :goto_b

    .line 129
    .line 130
    :cond_8
    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 134
    .line 135
    .line 136
    move-result p1

    .line 137
    invoke-virtual {p2}, Landroid/os/Parcel;->createStringArray()[Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object p2

    .line 141
    iget-object p3, p0, Lhf0;->g:Ljava/lang/Object;

    .line 142
    .line 143
    check-cast p3, Landroidx/room/MultiInstanceInvalidationService;

    .line 144
    .line 145
    iget-object p4, p3, Landroidx/room/MultiInstanceInvalidationService;->h:Lgf0;

    .line 146
    .line 147
    monitor-enter p4

    .line 148
    :try_start_0
    iget-object p3, p0, Lhf0;->g:Ljava/lang/Object;

    .line 149
    .line 150
    check-cast p3, Landroidx/room/MultiInstanceInvalidationService;

    .line 151
    .line 152
    iget-object p3, p3, Landroidx/room/MultiInstanceInvalidationService;->g:Ljava/util/HashMap;

    .line 153
    .line 154
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    invoke-virtual {p3, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object p3

    .line 162
    check-cast p3, Ljava/lang/String;

    .line 163
    .line 164
    if-nez p3, :cond_9

    .line 165
    .line 166
    monitor-exit p4

    .line 167
    goto/16 :goto_b

    .line 168
    .line 169
    :catchall_0
    move-exception p1

    .line 170
    goto :goto_7

    .line 171
    :cond_9
    iget-object v0, p0, Lhf0;->g:Ljava/lang/Object;

    .line 172
    .line 173
    check-cast v0, Landroidx/room/MultiInstanceInvalidationService;

    .line 174
    .line 175
    iget-object v0, v0, Landroidx/room/MultiInstanceInvalidationService;->h:Lgf0;

    .line 176
    .line 177
    invoke-virtual {v0}, Landroid/os/RemoteCallbackList;->beginBroadcast()I

    .line 178
    .line 179
    .line 180
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 181
    :goto_4
    if-ge v2, v0, :cond_c

    .line 182
    .line 183
    :try_start_1
    iget-object v1, p0, Lhf0;->g:Ljava/lang/Object;

    .line 184
    .line 185
    check-cast v1, Landroidx/room/MultiInstanceInvalidationService;

    .line 186
    .line 187
    iget-object v1, v1, Landroidx/room/MultiInstanceInvalidationService;->h:Lgf0;

    .line 188
    .line 189
    invoke-virtual {v1, v2}, Landroid/os/RemoteCallbackList;->getBroadcastCookie(I)Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    move-result-object v1

    .line 193
    check-cast v1, Ljava/lang/Integer;

    .line 194
    .line 195
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 196
    .line 197
    .line 198
    move-result v4

    .line 199
    iget-object v5, p0, Lhf0;->g:Ljava/lang/Object;

    .line 200
    .line 201
    check-cast v5, Landroidx/room/MultiInstanceInvalidationService;

    .line 202
    .line 203
    iget-object v5, v5, Landroidx/room/MultiInstanceInvalidationService;->g:Ljava/util/HashMap;

    .line 204
    .line 205
    invoke-virtual {v5, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object v1

    .line 209
    check-cast v1, Ljava/lang/String;

    .line 210
    .line 211
    if-eq p1, v4, :cond_b

    .line 212
    .line 213
    invoke-virtual {p3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 214
    .line 215
    .line 216
    move-result v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 217
    if-nez v1, :cond_a

    .line 218
    .line 219
    goto :goto_5

    .line 220
    :cond_a
    :try_start_2
    iget-object v1, p0, Lhf0;->g:Ljava/lang/Object;

    .line 221
    .line 222
    check-cast v1, Landroidx/room/MultiInstanceInvalidationService;

    .line 223
    .line 224
    iget-object v1, v1, Landroidx/room/MultiInstanceInvalidationService;->h:Lgf0;

    .line 225
    .line 226
    invoke-virtual {v1, v2}, Landroid/os/RemoteCallbackList;->getBroadcastItem(I)Landroid/os/IInterface;

    .line 227
    .line 228
    .line 229
    move-result-object v1

    .line 230
    check-cast v1, Lt10;

    .line 231
    .line 232
    invoke-virtual {v1, p2}, Lt10;->T([Ljava/lang/String;)V
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 233
    .line 234
    .line 235
    goto :goto_5

    .line 236
    :catchall_1
    move-exception p1

    .line 237
    goto :goto_6

    .line 238
    :catch_0
    :cond_b
    :goto_5
    add-int/lit8 v2, v2, 0x1

    .line 239
    .line 240
    goto :goto_4

    .line 241
    :goto_6
    :try_start_3
    iget-object p2, p0, Lhf0;->g:Ljava/lang/Object;

    .line 242
    .line 243
    check-cast p2, Landroidx/room/MultiInstanceInvalidationService;

    .line 244
    .line 245
    iget-object p2, p2, Landroidx/room/MultiInstanceInvalidationService;->h:Lgf0;

    .line 246
    .line 247
    invoke-virtual {p2}, Landroid/os/RemoteCallbackList;->finishBroadcast()V

    .line 248
    .line 249
    .line 250
    throw p1

    .line 251
    :cond_c
    iget-object p1, p0, Lhf0;->g:Ljava/lang/Object;

    .line 252
    .line 253
    check-cast p1, Landroidx/room/MultiInstanceInvalidationService;

    .line 254
    .line 255
    iget-object p1, p1, Landroidx/room/MultiInstanceInvalidationService;->h:Lgf0;

    .line 256
    .line 257
    invoke-virtual {p1}, Landroid/os/RemoteCallbackList;->finishBroadcast()V

    .line 258
    .line 259
    .line 260
    monitor-exit p4

    .line 261
    goto/16 :goto_b

    .line 262
    .line 263
    :goto_7
    monitor-exit p4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 264
    throw p1

    .line 265
    :cond_d
    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 266
    .line 267
    .line 268
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 269
    .line 270
    .line 271
    move-result-object p1

    .line 272
    if-nez p1, :cond_e

    .line 273
    .line 274
    goto :goto_8

    .line 275
    :cond_e
    const-string p4, "androidx.room.IMultiInstanceInvalidationCallback"

    .line 276
    .line 277
    invoke-interface {p1, p4}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 278
    .line 279
    .line 280
    move-result-object p4

    .line 281
    if-eqz p4, :cond_f

    .line 282
    .line 283
    instance-of v0, p4, Lt10;

    .line 284
    .line 285
    if-eqz v0, :cond_f

    .line 286
    .line 287
    move-object v1, p4

    .line 288
    check-cast v1, Lt10;

    .line 289
    .line 290
    goto :goto_8

    .line 291
    :cond_f
    new-instance v1, Lt10;

    .line 292
    .line 293
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 294
    .line 295
    .line 296
    iput-object p1, v1, Lt10;->f:Landroid/os/IBinder;

    .line 297
    .line 298
    :goto_8
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 299
    .line 300
    .line 301
    move-result p1

    .line 302
    iget-object p2, p0, Lhf0;->g:Ljava/lang/Object;

    .line 303
    .line 304
    check-cast p2, Landroidx/room/MultiInstanceInvalidationService;

    .line 305
    .line 306
    iget-object p4, p2, Landroidx/room/MultiInstanceInvalidationService;->h:Lgf0;

    .line 307
    .line 308
    monitor-enter p4

    .line 309
    :try_start_4
    iget-object p2, p0, Lhf0;->g:Ljava/lang/Object;

    .line 310
    .line 311
    check-cast p2, Landroidx/room/MultiInstanceInvalidationService;

    .line 312
    .line 313
    iget-object p2, p2, Landroidx/room/MultiInstanceInvalidationService;->h:Lgf0;

    .line 314
    .line 315
    invoke-virtual {p2, v1}, Landroid/os/RemoteCallbackList;->unregister(Landroid/os/IInterface;)Z

    .line 316
    .line 317
    .line 318
    iget-object p2, p0, Lhf0;->g:Ljava/lang/Object;

    .line 319
    .line 320
    check-cast p2, Landroidx/room/MultiInstanceInvalidationService;

    .line 321
    .line 322
    iget-object p2, p2, Landroidx/room/MultiInstanceInvalidationService;->g:Ljava/util/HashMap;

    .line 323
    .line 324
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 325
    .line 326
    .line 327
    move-result-object p1

    .line 328
    invoke-virtual {p2, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 329
    .line 330
    .line 331
    monitor-exit p4
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 332
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 333
    .line 334
    .line 335
    goto :goto_b

    .line 336
    :catchall_2
    move-exception p1

    .line 337
    :try_start_5
    monitor-exit p4
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 338
    throw p1

    .line 339
    :cond_10
    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 340
    .line 341
    .line 342
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 343
    .line 344
    .line 345
    move-result-object p1

    .line 346
    if-nez p1, :cond_11

    .line 347
    .line 348
    goto :goto_9

    .line 349
    :cond_11
    const-string p4, "androidx.room.IMultiInstanceInvalidationCallback"

    .line 350
    .line 351
    invoke-interface {p1, p4}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 352
    .line 353
    .line 354
    move-result-object p4

    .line 355
    if-eqz p4, :cond_12

    .line 356
    .line 357
    instance-of v0, p4, Lt10;

    .line 358
    .line 359
    if-eqz v0, :cond_12

    .line 360
    .line 361
    move-object v1, p4

    .line 362
    check-cast v1, Lt10;

    .line 363
    .line 364
    goto :goto_9

    .line 365
    :cond_12
    new-instance v1, Lt10;

    .line 366
    .line 367
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 368
    .line 369
    .line 370
    iput-object p1, v1, Lt10;->f:Landroid/os/IBinder;

    .line 371
    .line 372
    :goto_9
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 373
    .line 374
    .line 375
    move-result-object p1

    .line 376
    if-nez p1, :cond_13

    .line 377
    .line 378
    goto :goto_a

    .line 379
    :cond_13
    iget-object p2, p0, Lhf0;->g:Ljava/lang/Object;

    .line 380
    .line 381
    check-cast p2, Landroidx/room/MultiInstanceInvalidationService;

    .line 382
    .line 383
    iget-object p2, p2, Landroidx/room/MultiInstanceInvalidationService;->h:Lgf0;

    .line 384
    .line 385
    monitor-enter p2

    .line 386
    :try_start_6
    iget-object p4, p0, Lhf0;->g:Ljava/lang/Object;

    .line 387
    .line 388
    check-cast p4, Landroidx/room/MultiInstanceInvalidationService;

    .line 389
    .line 390
    iget v0, p4, Landroidx/room/MultiInstanceInvalidationService;->f:I

    .line 391
    .line 392
    add-int/2addr v0, v3

    .line 393
    iput v0, p4, Landroidx/room/MultiInstanceInvalidationService;->f:I

    .line 394
    .line 395
    iget-object p4, p4, Landroidx/room/MultiInstanceInvalidationService;->h:Lgf0;

    .line 396
    .line 397
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 398
    .line 399
    .line 400
    move-result-object v4

    .line 401
    invoke-virtual {p4, v1, v4}, Landroid/os/RemoteCallbackList;->register(Landroid/os/IInterface;Ljava/lang/Object;)Z

    .line 402
    .line 403
    .line 404
    move-result p4

    .line 405
    if-eqz p4, :cond_14

    .line 406
    .line 407
    iget-object p4, p0, Lhf0;->g:Ljava/lang/Object;

    .line 408
    .line 409
    check-cast p4, Landroidx/room/MultiInstanceInvalidationService;

    .line 410
    .line 411
    iget-object p4, p4, Landroidx/room/MultiInstanceInvalidationService;->g:Ljava/util/HashMap;

    .line 412
    .line 413
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 414
    .line 415
    .line 416
    move-result-object v1

    .line 417
    invoke-virtual {p4, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 418
    .line 419
    .line 420
    monitor-exit p2

    .line 421
    move v2, v0

    .line 422
    goto :goto_a

    .line 423
    :catchall_3
    move-exception p1

    .line 424
    goto :goto_c

    .line 425
    :cond_14
    iget-object p1, p0, Lhf0;->g:Ljava/lang/Object;

    .line 426
    .line 427
    check-cast p1, Landroidx/room/MultiInstanceInvalidationService;

    .line 428
    .line 429
    iget p4, p1, Landroidx/room/MultiInstanceInvalidationService;->f:I

    .line 430
    .line 431
    sub-int/2addr p4, v3

    .line 432
    iput p4, p1, Landroidx/room/MultiInstanceInvalidationService;->f:I

    .line 433
    .line 434
    monitor-exit p2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 435
    :goto_a
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 436
    .line 437
    .line 438
    invoke-virtual {p3, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 439
    .line 440
    .line 441
    :goto_b
    return v3

    .line 442
    :goto_c
    :try_start_7
    monitor-exit p2
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 443
    throw p1

    .line 444
    nop

    .line 445
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
