.class public abstract Lxa2;
.super Lhv1;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lya2;


# static fields
.field public static final synthetic f:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    const-string v0, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAd"

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
    .locals 5

    .line 1
    const/4 v0, 0x2

    .line 2
    const/4 v1, 0x1

    .line 3
    const-string v2, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback"

    .line 4
    .line 5
    const/4 v3, 0x0

    .line 6
    const/4 v4, 0x0

    .line 7
    packed-switch p1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    return v3

    .line 11
    :pswitch_0
    invoke-virtual {p2}, Landroid/os/Parcel;->readLong()J

    .line 12
    .line 13
    .line 14
    move-result-wide v2

    .line 15
    invoke-static {p2}, Liv1;->f(Landroid/os/Parcel;)V

    .line 16
    .line 17
    .line 18
    invoke-interface {p0, v2, v3}, Lya2;->h1(J)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 22
    .line 23
    .line 24
    return v1

    .line 25
    :pswitch_1
    invoke-interface {p0}, Lya2;->m()J

    .line 26
    .line 27
    .line 28
    move-result-wide p1

    .line 29
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p3, p1, p2}, Landroid/os/Parcel;->writeLong(J)V

    .line 33
    .line 34
    .line 35
    return v1

    .line 36
    :pswitch_2
    invoke-interface {p0}, Lya2;->o()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    return v1

    .line 47
    :pswitch_3
    invoke-static {p2}, Liv1;->a(Landroid/os/Parcel;)Z

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    invoke-static {p2}, Liv1;->f(Landroid/os/Parcel;)V

    .line 52
    .line 53
    .line 54
    invoke-interface {p0, p1}, Lya2;->u3(Z)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 58
    .line 59
    .line 60
    return v1

    .line 61
    :pswitch_4
    sget-object p1, Lpc4;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 62
    .line 63
    invoke-static {p2, p1}, Liv1;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    check-cast p1, Lpc4;

    .line 68
    .line 69
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    if-nez v0, :cond_0

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_0
    invoke-interface {v0, v2}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    instance-of v3, v2, Lfb2;

    .line 81
    .line 82
    if-eqz v3, :cond_1

    .line 83
    .line 84
    move-object v4, v2

    .line 85
    check-cast v4, Lfb2;

    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_1
    new-instance v4, Ldb2;

    .line 89
    .line 90
    invoke-direct {v4, v0}, Ldb2;-><init>(Landroid/os/IBinder;)V

    .line 91
    .line 92
    .line 93
    :goto_0
    invoke-static {p2}, Liv1;->f(Landroid/os/Parcel;)V

    .line 94
    .line 95
    .line 96
    invoke-interface {p0, p1, v4}, Lya2;->K1(Lpc4;Lfb2;)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 100
    .line 101
    .line 102
    return v1

    .line 103
    :pswitch_5
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    invoke-static {p1}, Lkd3;->B3(Landroid/os/IBinder;)Lzu2;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    invoke-static {p2}, Liv1;->f(Landroid/os/Parcel;)V

    .line 112
    .line 113
    .line 114
    invoke-interface {p0, p1}, Lya2;->d1(Lzu2;)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 118
    .line 119
    .line 120
    return v1

    .line 121
    :pswitch_6
    invoke-interface {p0}, Lya2;->n()Ltx2;

    .line 122
    .line 123
    .line 124
    move-result-object p1

    .line 125
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 126
    .line 127
    .line 128
    invoke-static {p3, p1}, Liv1;->e(Landroid/os/Parcel;Landroid/os/IInterface;)V

    .line 129
    .line 130
    .line 131
    return v1

    .line 132
    :pswitch_7
    invoke-interface {p0}, Lya2;->i()Lva2;

    .line 133
    .line 134
    .line 135
    move-result-object p1

    .line 136
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 137
    .line 138
    .line 139
    invoke-static {p3, p1}, Liv1;->e(Landroid/os/Parcel;Landroid/os/IInterface;)V

    .line 140
    .line 141
    .line 142
    return v1

    .line 143
    :pswitch_8
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 144
    .line 145
    .line 146
    move-result-object p1

    .line 147
    invoke-static {p1}, Loi0;->X0(Landroid/os/IBinder;)Lu10;

    .line 148
    .line 149
    .line 150
    move-result-object p1

    .line 151
    sget-object v0, Liv1;->a:Ljava/lang/ClassLoader;

    .line 152
    .line 153
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 154
    .line 155
    .line 156
    move-result v0

    .line 157
    if-eqz v0, :cond_2

    .line 158
    .line 159
    move v3, v1

    .line 160
    :cond_2
    invoke-static {p2}, Liv1;->f(Landroid/os/Parcel;)V

    .line 161
    .line 162
    .line 163
    invoke-interface {p0, p1, v3}, Lya2;->C1(Lu10;Z)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 167
    .line 168
    .line 169
    return v1

    .line 170
    :pswitch_9
    invoke-interface {p0}, Lya2;->e()Landroid/os/Bundle;

    .line 171
    .line 172
    .line 173
    move-result-object p1

    .line 174
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 175
    .line 176
    .line 177
    invoke-static {p3, p1}, Liv1;->d(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    .line 178
    .line 179
    .line 180
    return v1

    .line 181
    :pswitch_a
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 182
    .line 183
    .line 184
    move-result-object p1

    .line 185
    if-nez p1, :cond_3

    .line 186
    .line 187
    goto :goto_1

    .line 188
    :cond_3
    const-string v2, "com.google.android.gms.ads.internal.client.IOnAdMetadataChangedListener"

    .line 189
    .line 190
    invoke-interface {p1, v2}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 191
    .line 192
    .line 193
    move-result-object v3

    .line 194
    instance-of v4, v3, Lxs2;

    .line 195
    .line 196
    if-eqz v4, :cond_4

    .line 197
    .line 198
    move-object v4, v3

    .line 199
    check-cast v4, Lxs2;

    .line 200
    .line 201
    goto :goto_1

    .line 202
    :cond_4
    new-instance v4, Lxs2;

    .line 203
    .line 204
    invoke-direct {v4, p1, v2, v0}, Lsb1;-><init>(Landroid/os/IBinder;Ljava/lang/String;I)V

    .line 205
    .line 206
    .line 207
    :goto_1
    invoke-static {p2}, Liv1;->f(Landroid/os/Parcel;)V

    .line 208
    .line 209
    .line 210
    invoke-interface {p0, v4}, Lya2;->d2(Lxs2;)V

    .line 211
    .line 212
    .line 213
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 214
    .line 215
    .line 216
    return v1

    .line 217
    :pswitch_b
    sget-object p1, Lmb2;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 218
    .line 219
    invoke-static {p2, p1}, Liv1;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 220
    .line 221
    .line 222
    move-result-object p1

    .line 223
    check-cast p1, Lmb2;

    .line 224
    .line 225
    invoke-static {p2}, Liv1;->f(Landroid/os/Parcel;)V

    .line 226
    .line 227
    .line 228
    invoke-interface {p0, p1}, Lya2;->B2(Lmb2;)V

    .line 229
    .line 230
    .line 231
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 232
    .line 233
    .line 234
    return v1

    .line 235
    :pswitch_c
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 236
    .line 237
    .line 238
    move-result-object p1

    .line 239
    if-nez p1, :cond_5

    .line 240
    .line 241
    goto :goto_2

    .line 242
    :cond_5
    const-string v2, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener"

    .line 243
    .line 244
    invoke-interface {p1, v2}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 245
    .line 246
    .line 247
    move-result-object v3

    .line 248
    instance-of v4, v3, Lgb2;

    .line 249
    .line 250
    if-eqz v4, :cond_6

    .line 251
    .line 252
    move-object v4, v3

    .line 253
    check-cast v4, Lgb2;

    .line 254
    .line 255
    goto :goto_2

    .line 256
    :cond_6
    new-instance v4, Lgb2;

    .line 257
    .line 258
    invoke-direct {v4, p1, v2, v0}, Lsb1;-><init>(Landroid/os/IBinder;Ljava/lang/String;I)V

    .line 259
    .line 260
    .line 261
    :goto_2
    invoke-static {p2}, Liv1;->f(Landroid/os/Parcel;)V

    .line 262
    .line 263
    .line 264
    invoke-interface {p0, v4}, Lya2;->A2(Lgb2;)V

    .line 265
    .line 266
    .line 267
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 268
    .line 269
    .line 270
    return v1

    .line 271
    :pswitch_d
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 272
    .line 273
    .line 274
    move-result-object p1

    .line 275
    invoke-static {p1}, Loi0;->X0(Landroid/os/IBinder;)Lu10;

    .line 276
    .line 277
    .line 278
    move-result-object p1

    .line 279
    invoke-static {p2}, Liv1;->f(Landroid/os/Parcel;)V

    .line 280
    .line 281
    .line 282
    invoke-interface {p0, p1}, Lya2;->w2(Lu10;)V

    .line 283
    .line 284
    .line 285
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 286
    .line 287
    .line 288
    return v1

    .line 289
    :pswitch_e
    invoke-interface {p0}, Lya2;->g()Ljava/lang/String;

    .line 290
    .line 291
    .line 292
    move-result-object p1

    .line 293
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 294
    .line 295
    .line 296
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 297
    .line 298
    .line 299
    return v1

    .line 300
    :pswitch_f
    invoke-interface {p0}, Lya2;->j()Z

    .line 301
    .line 302
    .line 303
    move-result p1

    .line 304
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 305
    .line 306
    .line 307
    sget-object p2, Liv1;->a:Ljava/lang/ClassLoader;

    .line 308
    .line 309
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeInt(I)V

    .line 310
    .line 311
    .line 312
    return v1

    .line 313
    :pswitch_10
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 314
    .line 315
    .line 316
    move-result-object p1

    .line 317
    if-nez p1, :cond_7

    .line 318
    .line 319
    goto :goto_3

    .line 320
    :cond_7
    const-string v2, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback"

    .line 321
    .line 322
    invoke-interface {p1, v2}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 323
    .line 324
    .line 325
    move-result-object v3

    .line 326
    instance-of v4, v3, Lbb2;

    .line 327
    .line 328
    if-eqz v4, :cond_8

    .line 329
    .line 330
    move-object v4, v3

    .line 331
    check-cast v4, Lbb2;

    .line 332
    .line 333
    goto :goto_3

    .line 334
    :cond_8
    new-instance v4, Lza2;

    .line 335
    .line 336
    invoke-direct {v4, p1, v2, v0}, Lsb1;-><init>(Landroid/os/IBinder;Ljava/lang/String;I)V

    .line 337
    .line 338
    .line 339
    :goto_3
    invoke-static {p2}, Liv1;->f(Landroid/os/Parcel;)V

    .line 340
    .line 341
    .line 342
    invoke-interface {p0, v4}, Lya2;->c1(Lbb2;)V

    .line 343
    .line 344
    .line 345
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 346
    .line 347
    .line 348
    return v1

    .line 349
    :pswitch_11
    sget-object p1, Lpc4;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 350
    .line 351
    invoke-static {p2, p1}, Liv1;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 352
    .line 353
    .line 354
    move-result-object p1

    .line 355
    check-cast p1, Lpc4;

    .line 356
    .line 357
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 358
    .line 359
    .line 360
    move-result-object v0

    .line 361
    if-nez v0, :cond_9

    .line 362
    .line 363
    goto :goto_4

    .line 364
    :cond_9
    invoke-interface {v0, v2}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 365
    .line 366
    .line 367
    move-result-object v2

    .line 368
    instance-of v3, v2, Lfb2;

    .line 369
    .line 370
    if-eqz v3, :cond_a

    .line 371
    .line 372
    move-object v4, v2

    .line 373
    check-cast v4, Lfb2;

    .line 374
    .line 375
    goto :goto_4

    .line 376
    :cond_a
    new-instance v4, Ldb2;

    .line 377
    .line 378
    invoke-direct {v4, v0}, Ldb2;-><init>(Landroid/os/IBinder;)V

    .line 379
    .line 380
    .line 381
    :goto_4
    invoke-static {p2}, Liv1;->f(Landroid/os/Parcel;)V

    .line 382
    .line 383
    .line 384
    invoke-interface {p0, p1, v4}, Lya2;->q2(Lpc4;Lfb2;)V

    .line 385
    .line 386
    .line 387
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 388
    .line 389
    .line 390
    return v1

    .line 391
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
