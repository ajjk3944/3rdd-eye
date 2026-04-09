.class public final Lk2;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lk2;->a:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 14

    .line 1
    iget v0, p0, Lk2;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Landroid/support/v4/media/RatingCompat;

    .line 7
    .line 8
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    invoke-virtual {p1}, Landroid/os/Parcel;->readFloat()F

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    invoke-direct {v0, v1, p1}, Landroid/support/v4/media/RatingCompat;-><init>(IF)V

    .line 17
    .line 18
    .line 19
    return-object v0

    .line 20
    :pswitch_0
    new-instance v0, Lcm0;

    .line 21
    .line 22
    invoke-direct {v0, p1}, Lcm0;-><init>(Landroid/os/Parcel;)V

    .line 23
    .line 24
    .line 25
    return-object v0

    .line 26
    :pswitch_1
    new-instance v0, Ltl0;

    .line 27
    .line 28
    invoke-direct {v0, p1}, Ltl0;-><init>(Landroid/os/Parcel;)V

    .line 29
    .line 30
    .line 31
    return-object v0

    .line 32
    :pswitch_2
    new-instance v0, Landroid/support/v4/media/session/PlaybackStateCompat;

    .line 33
    .line 34
    invoke-direct {v0, p1}, Landroid/support/v4/media/session/PlaybackStateCompat;-><init>(Landroid/os/Parcel;)V

    .line 35
    .line 36
    .line 37
    return-object v0

    .line 38
    :pswitch_3
    new-instance v0, Landroid/support/v4/media/session/ParcelableVolumeInfo;

    .line 39
    .line 40
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    iput v1, v0, Landroid/support/v4/media/session/ParcelableVolumeInfo;->f:I

    .line 48
    .line 49
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    iput v1, v0, Landroid/support/v4/media/session/ParcelableVolumeInfo;->h:I

    .line 54
    .line 55
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    iput v1, v0, Landroid/support/v4/media/session/ParcelableVolumeInfo;->i:I

    .line 60
    .line 61
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    iput v1, v0, Landroid/support/v4/media/session/ParcelableVolumeInfo;->j:I

    .line 66
    .line 67
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 68
    .line 69
    .line 70
    move-result p1

    .line 71
    iput p1, v0, Landroid/support/v4/media/session/ParcelableVolumeInfo;->g:I

    .line 72
    .line 73
    return-object v0

    .line 74
    :pswitch_4
    new-instance v0, Landroidx/versionedparcelable/ParcelImpl;

    .line 75
    .line 76
    invoke-direct {v0, p1}, Landroidx/versionedparcelable/ParcelImpl;-><init>(Landroid/os/Parcel;)V

    .line 77
    .line 78
    .line 79
    return-object v0

    .line 80
    :pswitch_5
    new-instance v0, Log0;

    .line 81
    .line 82
    invoke-direct {v0, p1}, Landroid/view/View$BaseSavedState;-><init>(Landroid/os/Parcel;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 86
    .line 87
    .line 88
    move-result p1

    .line 89
    iput p1, v0, Log0;->f:I

    .line 90
    .line 91
    return-object v0

    .line 92
    :pswitch_6
    new-instance v0, Lif0;

    .line 93
    .line 94
    invoke-direct {v0, p1}, Lif0;-><init>(Landroid/os/Parcel;)V

    .line 95
    .line 96
    .line 97
    return-object v0

    .line 98
    :pswitch_7
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 99
    .line 100
    .line 101
    move-result v0

    .line 102
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 103
    .line 104
    .line 105
    move-result p1

    .line 106
    invoke-static {v0, p1}, Lwe0;->a(II)Lwe0;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    return-object p1

    .line 111
    :pswitch_8
    const/4 v0, 0x0

    .line 112
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    new-instance v0, Landroid/support/v4/media/session/MediaSessionCompat$Token;

    .line 117
    .line 118
    invoke-direct {v0, p1}, Landroid/support/v4/media/session/MediaSessionCompat$Token;-><init>(Landroid/os/Parcelable;)V

    .line 119
    .line 120
    .line 121
    return-object v0

    .line 122
    :pswitch_9
    new-instance v0, Landroid/support/v4/media/session/MediaSessionCompat$ResultReceiverWrapper;

    .line 123
    .line 124
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 125
    .line 126
    .line 127
    sget-object v1, Landroid/os/ResultReceiver;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 128
    .line 129
    invoke-interface {v1, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    check-cast p1, Landroid/os/ResultReceiver;

    .line 134
    .line 135
    iput-object p1, v0, Landroid/support/v4/media/session/MediaSessionCompat$ResultReceiverWrapper;->f:Landroid/os/ResultReceiver;

    .line 136
    .line 137
    return-object v0

    .line 138
    :pswitch_a
    new-instance v0, Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;

    .line 139
    .line 140
    invoke-direct {v0, p1}, Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;-><init>(Landroid/os/Parcel;)V

    .line 141
    .line 142
    .line 143
    return-object v0

    .line 144
    :pswitch_b
    new-instance v0, Landroid/support/v4/media/MediaMetadataCompat;

    .line 145
    .line 146
    invoke-direct {v0, p1}, Landroid/support/v4/media/MediaMetadataCompat;-><init>(Landroid/os/Parcel;)V

    .line 147
    .line 148
    .line 149
    return-object v0

    .line 150
    :pswitch_c
    sget-object v0, Landroid/media/MediaDescription;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 151
    .line 152
    invoke-interface {v0, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object p1

    .line 156
    const/4 v0, 0x0

    .line 157
    if-eqz p1, :cond_4

    .line 158
    .line 159
    move-object v1, p1

    .line 160
    check-cast v1, Landroid/media/MediaDescription;

    .line 161
    .line 162
    invoke-virtual {v1}, Landroid/media/MediaDescription;->getMediaId()Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v3

    .line 166
    invoke-virtual {v1}, Landroid/media/MediaDescription;->getTitle()Ljava/lang/CharSequence;

    .line 167
    .line 168
    .line 169
    move-result-object v4

    .line 170
    invoke-virtual {v1}, Landroid/media/MediaDescription;->getSubtitle()Ljava/lang/CharSequence;

    .line 171
    .line 172
    .line 173
    move-result-object v5

    .line 174
    invoke-virtual {v1}, Landroid/media/MediaDescription;->getDescription()Ljava/lang/CharSequence;

    .line 175
    .line 176
    .line 177
    move-result-object v6

    .line 178
    invoke-virtual {v1}, Landroid/media/MediaDescription;->getIconBitmap()Landroid/graphics/Bitmap;

    .line 179
    .line 180
    .line 181
    move-result-object v7

    .line 182
    invoke-virtual {v1}, Landroid/media/MediaDescription;->getIconUri()Landroid/net/Uri;

    .line 183
    .line 184
    .line 185
    move-result-object v8

    .line 186
    invoke-virtual {v1}, Landroid/media/MediaDescription;->getExtras()Landroid/os/Bundle;

    .line 187
    .line 188
    .line 189
    move-result-object v2

    .line 190
    const-string v9, "android.support.v4.media.description.MEDIA_URI"

    .line 191
    .line 192
    if-eqz v2, :cond_0

    .line 193
    .line 194
    const-class v10, Lyc0;

    .line 195
    .line 196
    invoke-virtual {v10}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 197
    .line 198
    .line 199
    move-result-object v10

    .line 200
    invoke-virtual {v2, v10}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    .line 201
    .line 202
    .line 203
    invoke-virtual {v2, v9}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 204
    .line 205
    .line 206
    move-result-object v10

    .line 207
    check-cast v10, Landroid/net/Uri;

    .line 208
    .line 209
    goto :goto_0

    .line 210
    :cond_0
    move-object v10, v0

    .line 211
    :goto_0
    if-eqz v10, :cond_2

    .line 212
    .line 213
    const-string v11, "android.support.v4.media.description.NULL_BUNDLE_FLAG"

    .line 214
    .line 215
    invoke-virtual {v2, v11}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 216
    .line 217
    .line 218
    move-result v12

    .line 219
    if-eqz v12, :cond_1

    .line 220
    .line 221
    invoke-virtual {v2}, Landroid/os/BaseBundle;->size()I

    .line 222
    .line 223
    .line 224
    move-result v12

    .line 225
    const/4 v13, 0x2

    .line 226
    if-ne v12, v13, :cond_1

    .line 227
    .line 228
    move-object v9, v0

    .line 229
    goto :goto_1

    .line 230
    :cond_1
    invoke-virtual {v2, v9}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 231
    .line 232
    .line 233
    invoke-virtual {v2, v11}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 234
    .line 235
    .line 236
    :cond_2
    move-object v9, v2

    .line 237
    :goto_1
    if-eqz v10, :cond_3

    .line 238
    .line 239
    goto :goto_2

    .line 240
    :cond_3
    invoke-virtual {v1}, Landroid/media/MediaDescription;->getMediaUri()Landroid/net/Uri;

    .line 241
    .line 242
    .line 243
    move-result-object v10

    .line 244
    :goto_2
    new-instance v2, Landroid/support/v4/media/MediaDescriptionCompat;

    .line 245
    .line 246
    invoke-direct/range {v2 .. v10}, Landroid/support/v4/media/MediaDescriptionCompat;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Landroid/graphics/Bitmap;Landroid/net/Uri;Landroid/os/Bundle;Landroid/net/Uri;)V

    .line 247
    .line 248
    .line 249
    iput-object p1, v2, Landroid/support/v4/media/MediaDescriptionCompat;->n:Ljava/lang/Object;

    .line 250
    .line 251
    move-object v0, v2

    .line 252
    :cond_4
    return-object v0

    .line 253
    :pswitch_d
    new-instance v0, Landroid/support/v4/media/MediaBrowserCompat$MediaItem;

    .line 254
    .line 255
    invoke-direct {v0, p1}, Landroid/support/v4/media/MediaBrowserCompat$MediaItem;-><init>(Landroid/os/Parcel;)V

    .line 256
    .line 257
    .line 258
    return-object v0

    .line 259
    :pswitch_e
    new-instance v0, Lgc0;

    .line 260
    .line 261
    invoke-direct {v0, p1}, Landroid/view/View$BaseSavedState;-><init>(Landroid/os/Parcel;)V

    .line 262
    .line 263
    .line 264
    const-class v1, Lgc0;

    .line 265
    .line 266
    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 267
    .line 268
    .line 269
    move-result-object v1

    .line 270
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->readValue(Ljava/lang/ClassLoader;)Ljava/lang/Object;

    .line 271
    .line 272
    .line 273
    move-result-object p1

    .line 274
    check-cast p1, Ljava/lang/Integer;

    .line 275
    .line 276
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 277
    .line 278
    .line 279
    move-result p1

    .line 280
    iput p1, v0, Lgc0;->f:I

    .line 281
    .line 282
    return-object v0

    .line 283
    :pswitch_f
    new-instance v0, Lr80;

    .line 284
    .line 285
    invoke-direct {v0, p1}, Landroid/view/View$BaseSavedState;-><init>(Landroid/os/Parcel;)V

    .line 286
    .line 287
    .line 288
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 289
    .line 290
    .line 291
    move-result-object v1

    .line 292
    iput-object v1, v0, Lr80;->f:Ljava/lang/String;

    .line 293
    .line 294
    invoke-virtual {p1}, Landroid/os/Parcel;->readFloat()F

    .line 295
    .line 296
    .line 297
    move-result v1

    .line 298
    iput v1, v0, Lr80;->h:F

    .line 299
    .line 300
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 301
    .line 302
    .line 303
    move-result v1

    .line 304
    const/4 v2, 0x1

    .line 305
    if-ne v1, v2, :cond_5

    .line 306
    .line 307
    goto :goto_3

    .line 308
    :cond_5
    const/4 v2, 0x0

    .line 309
    :goto_3
    iput-boolean v2, v0, Lr80;->i:Z

    .line 310
    .line 311
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 312
    .line 313
    .line 314
    move-result-object v1

    .line 315
    iput-object v1, v0, Lr80;->j:Ljava/lang/String;

    .line 316
    .line 317
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 318
    .line 319
    .line 320
    move-result v1

    .line 321
    iput v1, v0, Lr80;->k:I

    .line 322
    .line 323
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 324
    .line 325
    .line 326
    move-result p1

    .line 327
    iput p1, v0, Lr80;->l:I

    .line 328
    .line 329
    return-object v0

    .line 330
    :pswitch_10
    new-instance v0, Lj70;

    .line 331
    .line 332
    invoke-direct {v0, p1}, Lj70;-><init>(Landroid/os/Parcel;)V

    .line 333
    .line 334
    .line 335
    return-object v0

    .line 336
    :pswitch_11
    new-instance v0, Lu60;

    .line 337
    .line 338
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 339
    .line 340
    .line 341
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 342
    .line 343
    .line 344
    move-result v1

    .line 345
    iput v1, v0, Lu60;->f:I

    .line 346
    .line 347
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 348
    .line 349
    .line 350
    move-result v1

    .line 351
    iput v1, v0, Lu60;->g:I

    .line 352
    .line 353
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 354
    .line 355
    .line 356
    move-result p1

    .line 357
    const/4 v1, 0x1

    .line 358
    if-ne p1, v1, :cond_6

    .line 359
    .line 360
    goto :goto_4

    .line 361
    :cond_6
    const/4 v1, 0x0

    .line 362
    :goto_4
    iput-boolean v1, v0, Lu60;->h:Z

    .line 363
    .line 364
    return-object v0

    .line 365
    :pswitch_12
    new-instance v0, Ldx;

    .line 366
    .line 367
    invoke-direct {v0, p1}, Ldx;-><init>(Landroid/os/Parcel;)V

    .line 368
    .line 369
    .line 370
    return-object v0

    .line 371
    :pswitch_13
    new-instance v0, Lyw;

    .line 372
    .line 373
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 374
    .line 375
    .line 376
    const/4 v1, 0x0

    .line 377
    iput-object v1, v0, Lyw;->j:Ljava/lang/String;

    .line 378
    .line 379
    new-instance v1, Ljava/util/ArrayList;

    .line 380
    .line 381
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 382
    .line 383
    .line 384
    iput-object v1, v0, Lyw;->k:Ljava/util/ArrayList;

    .line 385
    .line 386
    new-instance v1, Ljava/util/ArrayList;

    .line 387
    .line 388
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 389
    .line 390
    .line 391
    iput-object v1, v0, Lyw;->l:Ljava/util/ArrayList;

    .line 392
    .line 393
    invoke-virtual {p1}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    .line 394
    .line 395
    .line 396
    move-result-object v1

    .line 397
    iput-object v1, v0, Lyw;->f:Ljava/util/ArrayList;

    .line 398
    .line 399
    invoke-virtual {p1}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    .line 400
    .line 401
    .line 402
    move-result-object v1

    .line 403
    iput-object v1, v0, Lyw;->g:Ljava/util/ArrayList;

    .line 404
    .line 405
    sget-object v1, Lh9;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 406
    .line 407
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->createTypedArray(Landroid/os/Parcelable$Creator;)[Ljava/lang/Object;

    .line 408
    .line 409
    .line 410
    move-result-object v1

    .line 411
    check-cast v1, [Lh9;

    .line 412
    .line 413
    iput-object v1, v0, Lyw;->h:[Lh9;

    .line 414
    .line 415
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 416
    .line 417
    .line 418
    move-result v1

    .line 419
    iput v1, v0, Lyw;->i:I

    .line 420
    .line 421
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 422
    .line 423
    .line 424
    move-result-object v1

    .line 425
    iput-object v1, v0, Lyw;->j:Ljava/lang/String;

    .line 426
    .line 427
    invoke-virtual {p1}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    .line 428
    .line 429
    .line 430
    move-result-object v1

    .line 431
    iput-object v1, v0, Lyw;->k:Ljava/util/ArrayList;

    .line 432
    .line 433
    sget-object v1, Li9;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 434
    .line 435
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->createTypedArrayList(Landroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 436
    .line 437
    .line 438
    move-result-object v1

    .line 439
    iput-object v1, v0, Lyw;->l:Ljava/util/ArrayList;

    .line 440
    .line 441
    sget-object v1, Luw;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 442
    .line 443
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->createTypedArrayList(Landroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 444
    .line 445
    .line 446
    move-result-object p1

    .line 447
    iput-object p1, v0, Lyw;->m:Ljava/util/ArrayList;

    .line 448
    .line 449
    return-object v0

    .line 450
    :pswitch_14
    new-instance v0, Luw;

    .line 451
    .line 452
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 453
    .line 454
    .line 455
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 456
    .line 457
    .line 458
    move-result-object v1

    .line 459
    iput-object v1, v0, Luw;->f:Ljava/lang/String;

    .line 460
    .line 461
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 462
    .line 463
    .line 464
    move-result p1

    .line 465
    iput p1, v0, Luw;->g:I

    .line 466
    .line 467
    return-object v0

    .line 468
    :pswitch_15
    new-instance v0, Lxs;

    .line 469
    .line 470
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 471
    .line 472
    .line 473
    const/4 v1, 0x0

    .line 474
    iput v1, v0, Lxs;->f:F

    .line 475
    .line 476
    const/4 v2, 0x0

    .line 477
    iput-object v2, v0, Lxs;->g:Landroid/os/Parcelable;

    .line 478
    .line 479
    iput v1, v0, Lxs;->h:F

    .line 480
    .line 481
    invoke-virtual {p1}, Landroid/os/Parcel;->readFloat()F

    .line 482
    .line 483
    .line 484
    move-result v1

    .line 485
    iput v1, v0, Lxs;->h:F

    .line 486
    .line 487
    invoke-virtual {p1}, Landroid/os/Parcel;->readFloat()F

    .line 488
    .line 489
    .line 490
    move-result v1

    .line 491
    iput v1, v0, Lxs;->f:F

    .line 492
    .line 493
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 494
    .line 495
    .line 496
    move-result v1

    .line 497
    const/4 v2, 0x1

    .line 498
    if-ne v1, v2, :cond_7

    .line 499
    .line 500
    const-class v1, Ljava/lang/Object;

    .line 501
    .line 502
    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 503
    .line 504
    .line 505
    move-result-object v1

    .line 506
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    .line 507
    .line 508
    .line 509
    move-result-object p1

    .line 510
    iput-object p1, v0, Lxs;->g:Landroid/os/Parcelable;

    .line 511
    .line 512
    :cond_7
    return-object v0

    .line 513
    :pswitch_16
    new-instance v0, Lgr;

    .line 514
    .line 515
    invoke-direct {v0, p1}, Lgr;-><init>(Landroid/os/Parcel;)V

    .line 516
    .line 517
    .line 518
    return-object v0

    .line 519
    :pswitch_17
    new-instance v0, Lrm;

    .line 520
    .line 521
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    .line 522
    .line 523
    .line 524
    move-result-wide v1

    .line 525
    invoke-direct {v0, v1, v2}, Lrm;-><init>(J)V

    .line 526
    .line 527
    .line 528
    return-object v0

    .line 529
    :pswitch_18
    const-class v0, Lwe0;

    .line 530
    .line 531
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 532
    .line 533
    .line 534
    move-result-object v1

    .line 535
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    .line 536
    .line 537
    .line 538
    move-result-object v1

    .line 539
    move-object v3, v1

    .line 540
    check-cast v3, Lwe0;

    .line 541
    .line 542
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 543
    .line 544
    .line 545
    move-result-object v1

    .line 546
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    .line 547
    .line 548
    .line 549
    move-result-object v1

    .line 550
    move-object v4, v1

    .line 551
    check-cast v4, Lwe0;

    .line 552
    .line 553
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 554
    .line 555
    .line 556
    move-result-object v0

    .line 557
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    .line 558
    .line 559
    .line 560
    move-result-object v0

    .line 561
    move-object v6, v0

    .line 562
    check-cast v6, Lwe0;

    .line 563
    .line 564
    const-class v0, Lrm;

    .line 565
    .line 566
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 567
    .line 568
    .line 569
    move-result-object v0

    .line 570
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    .line 571
    .line 572
    .line 573
    move-result-object v0

    .line 574
    move-object v5, v0

    .line 575
    check-cast v5, Lrm;

    .line 576
    .line 577
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 578
    .line 579
    .line 580
    move-result v7

    .line 581
    new-instance v2, Lvc;

    .line 582
    .line 583
    invoke-direct/range {v2 .. v7}, Lvc;-><init>(Lwe0;Lwe0;Lrm;Lwe0;I)V

    .line 584
    .line 585
    .line 586
    return-object v2

    .line 587
    :pswitch_19
    new-instance v0, Li9;

    .line 588
    .line 589
    invoke-direct {v0, p1}, Li9;-><init>(Landroid/os/Parcel;)V

    .line 590
    .line 591
    .line 592
    return-object v0

    .line 593
    :pswitch_1a
    new-instance v0, Lh9;

    .line 594
    .line 595
    invoke-direct {v0, p1}, Lh9;-><init>(Landroid/os/Parcel;)V

    .line 596
    .line 597
    .line 598
    return-object v0

    .line 599
    :pswitch_1b
    new-instance v0, Lf7;

    .line 600
    .line 601
    invoke-direct {v0, p1}, Landroid/view/View$BaseSavedState;-><init>(Landroid/os/Parcel;)V

    .line 602
    .line 603
    .line 604
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    .line 605
    .line 606
    .line 607
    move-result p1

    .line 608
    if-eqz p1, :cond_8

    .line 609
    .line 610
    const/4 p1, 0x1

    .line 611
    goto :goto_5

    .line 612
    :cond_8
    const/4 p1, 0x0

    .line 613
    :goto_5
    iput-boolean p1, v0, Lf7;->f:Z

    .line 614
    .line 615
    return-object v0

    .line 616
    :pswitch_1c
    const-string v0, "parcel"

    .line 617
    .line 618
    invoke-static {p1, v0}, Li30;->m(Ljava/lang/Object;Ljava/lang/String;)V

    .line 619
    .line 620
    .line 621
    new-instance v0, Ll2;

    .line 622
    .line 623
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 624
    .line 625
    .line 626
    move-result v1

    .line 627
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 628
    .line 629
    .line 630
    move-result v2

    .line 631
    if-nez v2, :cond_9

    .line 632
    .line 633
    const/4 p1, 0x0

    .line 634
    goto :goto_6

    .line 635
    :cond_9
    sget-object v2, Landroid/content/Intent;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 636
    .line 637
    invoke-interface {v2, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 638
    .line 639
    .line 640
    move-result-object p1

    .line 641
    check-cast p1, Landroid/content/Intent;

    .line 642
    .line 643
    :goto_6
    invoke-direct {v0, p1, v1}, Ll2;-><init>(Landroid/content/Intent;I)V

    .line 644
    .line 645
    .line 646
    return-object v0

    .line 647
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
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

.method public final newArray(I)[Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lk2;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-array p1, p1, [Landroid/support/v4/media/RatingCompat;

    .line 7
    .line 8
    return-object p1

    .line 9
    :pswitch_0
    new-array p1, p1, [Lcm0;

    .line 10
    .line 11
    return-object p1

    .line 12
    :pswitch_1
    new-array p1, p1, [Ltl0;

    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_2
    new-array p1, p1, [Landroid/support/v4/media/session/PlaybackStateCompat;

    .line 16
    .line 17
    return-object p1

    .line 18
    :pswitch_3
    new-array p1, p1, [Landroid/support/v4/media/session/ParcelableVolumeInfo;

    .line 19
    .line 20
    return-object p1

    .line 21
    :pswitch_4
    new-array p1, p1, [Landroidx/versionedparcelable/ParcelImpl;

    .line 22
    .line 23
    return-object p1

    .line 24
    :pswitch_5
    new-array p1, p1, [Log0;

    .line 25
    .line 26
    return-object p1

    .line 27
    :pswitch_6
    new-array p1, p1, [Lif0;

    .line 28
    .line 29
    return-object p1

    .line 30
    :pswitch_7
    new-array p1, p1, [Lwe0;

    .line 31
    .line 32
    return-object p1

    .line 33
    :pswitch_8
    new-array p1, p1, [Landroid/support/v4/media/session/MediaSessionCompat$Token;

    .line 34
    .line 35
    return-object p1

    .line 36
    :pswitch_9
    new-array p1, p1, [Landroid/support/v4/media/session/MediaSessionCompat$ResultReceiverWrapper;

    .line 37
    .line 38
    return-object p1

    .line 39
    :pswitch_a
    new-array p1, p1, [Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;

    .line 40
    .line 41
    return-object p1

    .line 42
    :pswitch_b
    new-array p1, p1, [Landroid/support/v4/media/MediaMetadataCompat;

    .line 43
    .line 44
    return-object p1

    .line 45
    :pswitch_c
    new-array p1, p1, [Landroid/support/v4/media/MediaDescriptionCompat;

    .line 46
    .line 47
    return-object p1

    .line 48
    :pswitch_d
    new-array p1, p1, [Landroid/support/v4/media/MediaBrowserCompat$MediaItem;

    .line 49
    .line 50
    return-object p1

    .line 51
    :pswitch_e
    new-array p1, p1, [Lgc0;

    .line 52
    .line 53
    return-object p1

    .line 54
    :pswitch_f
    new-array p1, p1, [Lr80;

    .line 55
    .line 56
    return-object p1

    .line 57
    :pswitch_10
    new-array p1, p1, [Lj70;

    .line 58
    .line 59
    return-object p1

    .line 60
    :pswitch_11
    new-array p1, p1, [Lu60;

    .line 61
    .line 62
    return-object p1

    .line 63
    :pswitch_12
    new-array p1, p1, [Ldx;

    .line 64
    .line 65
    return-object p1

    .line 66
    :pswitch_13
    new-array p1, p1, [Lyw;

    .line 67
    .line 68
    return-object p1

    .line 69
    :pswitch_14
    new-array p1, p1, [Luw;

    .line 70
    .line 71
    return-object p1

    .line 72
    :pswitch_15
    new-array p1, p1, [Lxs;

    .line 73
    .line 74
    return-object p1

    .line 75
    :pswitch_16
    new-array p1, p1, [Lgr;

    .line 76
    .line 77
    return-object p1

    .line 78
    :pswitch_17
    new-array p1, p1, [Lrm;

    .line 79
    .line 80
    return-object p1

    .line 81
    :pswitch_18
    new-array p1, p1, [Lvc;

    .line 82
    .line 83
    return-object p1

    .line 84
    :pswitch_19
    new-array p1, p1, [Li9;

    .line 85
    .line 86
    return-object p1

    .line 87
    :pswitch_1a
    new-array p1, p1, [Lh9;

    .line 88
    .line 89
    return-object p1

    .line 90
    :pswitch_1b
    new-array p1, p1, [Lf7;

    .line 91
    .line 92
    return-object p1

    .line 93
    :pswitch_1c
    new-array p1, p1, [Ll2;

    .line 94
    .line 95
    return-object p1

    .line 96
    nop

    .line 97
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
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
