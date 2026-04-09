.class public final Lh82;
.super Lhv1;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ld82;


# static fields
.field public static final synthetic g:I


# instance fields
.field public final f:Lcom/google/android/gms/ads/mediation/rtb/RtbAdapter;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/ads/mediation/rtb/RtbAdapter;)V
    .locals 1

    .line 1
    const-string v0, "com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter"

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lhv1;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lh82;->f:Lcom/google/android/gms/ads/mediation/rtb/RtbAdapter;

    .line 7
    .line 8
    return-void
.end method

.method public static final C3(Ljava/lang/String;)V
    .locals 4

    .line 1
    const-string v0, "Server parameters: "

    .line 2
    .line 3
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, Lgi2;->i0(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    :try_start_0
    new-instance v0, Landroid/os/Bundle;

    .line 15
    .line 16
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 17
    .line 18
    .line 19
    if-eqz p0, :cond_0

    .line 20
    .line 21
    new-instance v0, Lorg/json/JSONObject;

    .line 22
    .line 23
    invoke-direct {v0, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    new-instance p0, Landroid/os/Bundle;

    .line 27
    .line 28
    invoke-direct {p0}, Landroid/os/Bundle;-><init>()V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    if-eqz v2, :cond_0

    .line 40
    .line 41
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    check-cast v2, Ljava/lang/String;

    .line 46
    .line 47
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    invoke-virtual {p0, v2, v3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 52
    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_0
    return-void

    .line 56
    :catch_0
    move-exception p0

    .line 57
    const-string v0, ""

    .line 58
    .line 59
    invoke-static {v0, p0}, Lgi2;->c0(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 60
    .line 61
    .line 62
    new-instance p0, Landroid/os/RemoteException;

    .line 63
    .line 64
    invoke-direct {p0}, Landroid/os/RemoteException;-><init>()V

    .line 65
    .line 66
    .line 67
    throw p0
.end method

.method public static final D3(Lpc4;)V
    .locals 0

    .line 1
    iget-boolean p0, p0, Lpc4;->k:Z

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    sget-object p0, Lsv1;->f:Lsv1;

    .line 6
    .line 7
    iget-object p0, p0, Lsv1;->a:Lj63;

    .line 8
    .line 9
    invoke-static {}, Lj63;->n()Z

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public static final E3(Ljava/lang/String;Lpc4;)V
    .locals 0

    .line 1
    iget-object p1, p1, Lpc4;->z:Ljava/lang/String;

    .line 2
    .line 3
    :try_start_0
    new-instance p1, Lorg/json/JSONObject;

    .line 4
    .line 5
    invoke-direct {p1, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const-string p0, "max_ad_content_rating"

    .line 9
    .line 10
    invoke-virtual {p1, p0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 11
    .line 12
    .line 13
    :catch_0
    return-void
.end method


# virtual methods
.method public final A3(ILandroid/os/Parcel;Landroid/os/Parcel;)Z
    .locals 24

    .line 1
    move/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const/4 v4, 0x1

    .line 9
    if-eq v0, v4, :cond_15

    .line 10
    .line 11
    const/4 v5, 0x2

    .line 12
    if-eq v0, v5, :cond_14

    .line 13
    .line 14
    const/4 v5, 0x3

    .line 15
    if-eq v0, v5, :cond_13

    .line 16
    .line 17
    const/4 v5, 0x5

    .line 18
    if-eq v0, v5, :cond_12

    .line 19
    .line 20
    const/16 v5, 0xa

    .line 21
    .line 22
    if-eq v0, v5, :cond_11

    .line 23
    .line 24
    const/16 v5, 0xb

    .line 25
    .line 26
    if-eq v0, v5, :cond_10

    .line 27
    .line 28
    const-string v5, "com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback"

    .line 29
    .line 30
    const-string v6, "com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback"

    .line 31
    .line 32
    const-string v7, "com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback"

    .line 33
    .line 34
    const/4 v8, 0x0

    .line 35
    packed-switch v0, :pswitch_data_0

    .line 36
    .line 37
    .line 38
    return v8

    .line 39
    :pswitch_0
    invoke-virtual {v1}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-static {v0}, Loi0;->X0(Landroid/os/IBinder;)Lu10;

    .line 44
    .line 45
    .line 46
    invoke-static {v1}, Liv1;->f(Landroid/os/Parcel;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v2}, Landroid/os/Parcel;->writeNoException()V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v2, v8}, Landroid/os/Parcel;->writeInt(I)V

    .line 53
    .line 54
    .line 55
    return v4

    .line 56
    :pswitch_1
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v10

    .line 60
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v11

    .line 64
    sget-object v0, Lpc4;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 65
    .line 66
    invoke-static {v1, v0}, Liv1;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    move-object v12, v0

    .line 71
    check-cast v12, Lpc4;

    .line 72
    .line 73
    invoke-virtual {v1}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    invoke-static {v0}, Loi0;->X0(Landroid/os/IBinder;)Lu10;

    .line 78
    .line 79
    .line 80
    move-result-object v13

    .line 81
    invoke-virtual {v1}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    if-nez v0, :cond_0

    .line 86
    .line 87
    :goto_0
    move-object v14, v3

    .line 88
    goto :goto_1

    .line 89
    :cond_0
    const-string v3, "com.google.android.gms.ads.internal.mediation.client.rtb.IAppOpenCallback"

    .line 90
    .line 91
    invoke-interface {v0, v3}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 92
    .line 93
    .line 94
    move-result-object v5

    .line 95
    instance-of v6, v5, Lr72;

    .line 96
    .line 97
    if-eqz v6, :cond_1

    .line 98
    .line 99
    move-object v3, v5

    .line 100
    check-cast v3, Lr72;

    .line 101
    .line 102
    goto :goto_0

    .line 103
    :cond_1
    new-instance v5, Lq72;

    .line 104
    .line 105
    const/4 v6, 0x2

    .line 106
    invoke-direct {v5, v0, v3, v6}, Lsb1;-><init>(Landroid/os/IBinder;Ljava/lang/String;I)V

    .line 107
    .line 108
    .line 109
    move-object v14, v5

    .line 110
    :goto_1
    invoke-virtual {v1}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    invoke-static {v0}, Ly62;->B3(Landroid/os/IBinder;)Lz62;

    .line 115
    .line 116
    .line 117
    move-result-object v15

    .line 118
    invoke-static {v1}, Liv1;->f(Landroid/os/Parcel;)V

    .line 119
    .line 120
    .line 121
    move-object/from16 v9, p0

    .line 122
    .line 123
    invoke-virtual/range {v9 .. v15}, Lh82;->f2(Ljava/lang/String;Ljava/lang/String;Lpc4;Lu10;Lr72;Lz62;)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v2}, Landroid/os/Parcel;->writeNoException()V

    .line 127
    .line 128
    .line 129
    return v4

    .line 130
    :pswitch_2
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v17

    .line 134
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v18

    .line 138
    sget-object v0, Lpc4;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 139
    .line 140
    invoke-static {v1, v0}, Liv1;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    move-object/from16 v19, v0

    .line 145
    .line 146
    check-cast v19, Lpc4;

    .line 147
    .line 148
    invoke-virtual {v1}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    invoke-static {v0}, Loi0;->X0(Landroid/os/IBinder;)Lu10;

    .line 153
    .line 154
    .line 155
    move-result-object v20

    .line 156
    invoke-virtual {v1}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    if-nez v0, :cond_2

    .line 161
    .line 162
    :goto_2
    move-object/from16 v21, v3

    .line 163
    .line 164
    goto :goto_3

    .line 165
    :cond_2
    invoke-interface {v0, v7}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 166
    .line 167
    .line 168
    move-result-object v3

    .line 169
    instance-of v5, v3, Lz72;

    .line 170
    .line 171
    if-eqz v5, :cond_3

    .line 172
    .line 173
    check-cast v3, Lz72;

    .line 174
    .line 175
    goto :goto_2

    .line 176
    :cond_3
    new-instance v3, Ly72;

    .line 177
    .line 178
    invoke-direct {v3, v0}, Ly72;-><init>(Landroid/os/IBinder;)V

    .line 179
    .line 180
    .line 181
    goto :goto_2

    .line 182
    :goto_3
    invoke-virtual {v1}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 183
    .line 184
    .line 185
    move-result-object v0

    .line 186
    invoke-static {v0}, Ly62;->B3(Landroid/os/IBinder;)Lz62;

    .line 187
    .line 188
    .line 189
    move-result-object v22

    .line 190
    sget-object v0, Lr12;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 191
    .line 192
    invoke-static {v1, v0}, Liv1;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 193
    .line 194
    .line 195
    move-result-object v0

    .line 196
    move-object/from16 v23, v0

    .line 197
    .line 198
    check-cast v23, Lr12;

    .line 199
    .line 200
    invoke-static {v1}, Liv1;->f(Landroid/os/Parcel;)V

    .line 201
    .line 202
    .line 203
    move-object/from16 v16, p0

    .line 204
    .line 205
    invoke-virtual/range {v16 .. v23}, Lh82;->L1(Ljava/lang/String;Ljava/lang/String;Lpc4;Lu10;Lz72;Lz62;Lr12;)V

    .line 206
    .line 207
    .line 208
    invoke-virtual {v2}, Landroid/os/Parcel;->writeNoException()V

    .line 209
    .line 210
    .line 211
    return v4

    .line 212
    :pswitch_3
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 213
    .line 214
    .line 215
    move-result-object v17

    .line 216
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    move-result-object v18

    .line 220
    sget-object v0, Lpc4;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 221
    .line 222
    invoke-static {v1, v0}, Liv1;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 223
    .line 224
    .line 225
    move-result-object v0

    .line 226
    move-object/from16 v19, v0

    .line 227
    .line 228
    check-cast v19, Lpc4;

    .line 229
    .line 230
    invoke-virtual {v1}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 231
    .line 232
    .line 233
    move-result-object v0

    .line 234
    invoke-static {v0}, Loi0;->X0(Landroid/os/IBinder;)Lu10;

    .line 235
    .line 236
    .line 237
    move-result-object v20

    .line 238
    invoke-virtual {v1}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 239
    .line 240
    .line 241
    move-result-object v0

    .line 242
    if-nez v0, :cond_4

    .line 243
    .line 244
    :goto_4
    move-object/from16 v21, v3

    .line 245
    .line 246
    goto :goto_5

    .line 247
    :cond_4
    invoke-interface {v0, v6}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 248
    .line 249
    .line 250
    move-result-object v3

    .line 251
    instance-of v5, v3, Lt72;

    .line 252
    .line 253
    if-eqz v5, :cond_5

    .line 254
    .line 255
    check-cast v3, Lt72;

    .line 256
    .line 257
    goto :goto_4

    .line 258
    :cond_5
    new-instance v3, Ls72;

    .line 259
    .line 260
    invoke-direct {v3, v0}, Ls72;-><init>(Landroid/os/IBinder;)V

    .line 261
    .line 262
    .line 263
    goto :goto_4

    .line 264
    :goto_5
    invoke-virtual {v1}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 265
    .line 266
    .line 267
    move-result-object v0

    .line 268
    invoke-static {v0}, Ly62;->B3(Landroid/os/IBinder;)Lz62;

    .line 269
    .line 270
    .line 271
    move-result-object v22

    .line 272
    sget-object v0, Lxe4;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 273
    .line 274
    invoke-static {v1, v0}, Liv1;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 275
    .line 276
    .line 277
    move-result-object v0

    .line 278
    move-object/from16 v23, v0

    .line 279
    .line 280
    check-cast v23, Lxe4;

    .line 281
    .line 282
    invoke-static {v1}, Liv1;->f(Landroid/os/Parcel;)V

    .line 283
    .line 284
    .line 285
    move-object/from16 v16, p0

    .line 286
    .line 287
    invoke-virtual/range {v16 .. v23}, Lh82;->P1(Ljava/lang/String;Ljava/lang/String;Lpc4;Lu10;Lt72;Lz62;Lxe4;)V

    .line 288
    .line 289
    .line 290
    invoke-virtual {v2}, Landroid/os/Parcel;->writeNoException()V

    .line 291
    .line 292
    .line 293
    return v4

    .line 294
    :pswitch_4
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 295
    .line 296
    .line 297
    move-result-object v17

    .line 298
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 299
    .line 300
    .line 301
    move-result-object v18

    .line 302
    sget-object v0, Lpc4;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 303
    .line 304
    invoke-static {v1, v0}, Liv1;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 305
    .line 306
    .line 307
    move-result-object v0

    .line 308
    move-object/from16 v19, v0

    .line 309
    .line 310
    check-cast v19, Lpc4;

    .line 311
    .line 312
    invoke-virtual {v1}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 313
    .line 314
    .line 315
    move-result-object v0

    .line 316
    invoke-static {v0}, Loi0;->X0(Landroid/os/IBinder;)Lu10;

    .line 317
    .line 318
    .line 319
    move-result-object v20

    .line 320
    invoke-virtual {v1}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 321
    .line 322
    .line 323
    move-result-object v0

    .line 324
    if-nez v0, :cond_6

    .line 325
    .line 326
    :goto_6
    move-object/from16 v21, v3

    .line 327
    .line 328
    goto :goto_7

    .line 329
    :cond_6
    invoke-interface {v0, v5}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 330
    .line 331
    .line 332
    move-result-object v3

    .line 333
    instance-of v5, v3, Lb82;

    .line 334
    .line 335
    if-eqz v5, :cond_7

    .line 336
    .line 337
    check-cast v3, Lb82;

    .line 338
    .line 339
    goto :goto_6

    .line 340
    :cond_7
    new-instance v3, La82;

    .line 341
    .line 342
    invoke-direct {v3, v0}, La82;-><init>(Landroid/os/IBinder;)V

    .line 343
    .line 344
    .line 345
    goto :goto_6

    .line 346
    :goto_7
    invoke-virtual {v1}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 347
    .line 348
    .line 349
    move-result-object v0

    .line 350
    invoke-static {v0}, Ly62;->B3(Landroid/os/IBinder;)Lz62;

    .line 351
    .line 352
    .line 353
    move-result-object v22

    .line 354
    invoke-static {v1}, Liv1;->f(Landroid/os/Parcel;)V

    .line 355
    .line 356
    .line 357
    move-object/from16 v16, p0

    .line 358
    .line 359
    invoke-virtual/range {v16 .. v22}, Lh82;->F2(Ljava/lang/String;Ljava/lang/String;Lpc4;Lu10;Lb82;Lz62;)V

    .line 360
    .line 361
    .line 362
    invoke-virtual {v2}, Landroid/os/Parcel;->writeNoException()V

    .line 363
    .line 364
    .line 365
    return v4

    .line 366
    :pswitch_5
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 367
    .line 368
    .line 369
    invoke-static {v1}, Liv1;->f(Landroid/os/Parcel;)V

    .line 370
    .line 371
    .line 372
    invoke-virtual {v2}, Landroid/os/Parcel;->writeNoException()V

    .line 373
    .line 374
    .line 375
    return v4

    .line 376
    :pswitch_6
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 377
    .line 378
    .line 379
    move-result-object v17

    .line 380
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 381
    .line 382
    .line 383
    move-result-object v18

    .line 384
    sget-object v0, Lpc4;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 385
    .line 386
    invoke-static {v1, v0}, Liv1;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 387
    .line 388
    .line 389
    move-result-object v0

    .line 390
    move-object/from16 v19, v0

    .line 391
    .line 392
    check-cast v19, Lpc4;

    .line 393
    .line 394
    invoke-virtual {v1}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 395
    .line 396
    .line 397
    move-result-object v0

    .line 398
    invoke-static {v0}, Loi0;->X0(Landroid/os/IBinder;)Lu10;

    .line 399
    .line 400
    .line 401
    move-result-object v20

    .line 402
    invoke-virtual {v1}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 403
    .line 404
    .line 405
    move-result-object v0

    .line 406
    if-nez v0, :cond_8

    .line 407
    .line 408
    :goto_8
    move-object/from16 v21, v3

    .line 409
    .line 410
    goto :goto_9

    .line 411
    :cond_8
    invoke-interface {v0, v7}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 412
    .line 413
    .line 414
    move-result-object v3

    .line 415
    instance-of v5, v3, Lz72;

    .line 416
    .line 417
    if-eqz v5, :cond_9

    .line 418
    .line 419
    check-cast v3, Lz72;

    .line 420
    .line 421
    goto :goto_8

    .line 422
    :cond_9
    new-instance v3, Ly72;

    .line 423
    .line 424
    invoke-direct {v3, v0}, Ly72;-><init>(Landroid/os/IBinder;)V

    .line 425
    .line 426
    .line 427
    goto :goto_8

    .line 428
    :goto_9
    invoke-virtual {v1}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 429
    .line 430
    .line 431
    move-result-object v0

    .line 432
    invoke-static {v0}, Ly62;->B3(Landroid/os/IBinder;)Lz62;

    .line 433
    .line 434
    .line 435
    move-result-object v22

    .line 436
    invoke-static {v1}, Liv1;->f(Landroid/os/Parcel;)V

    .line 437
    .line 438
    .line 439
    const/16 v23, 0x0

    .line 440
    .line 441
    move-object/from16 v16, p0

    .line 442
    .line 443
    invoke-virtual/range {v16 .. v23}, Lh82;->L1(Ljava/lang/String;Ljava/lang/String;Lpc4;Lu10;Lz72;Lz62;Lr12;)V

    .line 444
    .line 445
    .line 446
    invoke-virtual {v2}, Landroid/os/Parcel;->writeNoException()V

    .line 447
    .line 448
    .line 449
    return v4

    .line 450
    :pswitch_7
    invoke-virtual {v1}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 451
    .line 452
    .line 453
    move-result-object v0

    .line 454
    invoke-static {v0}, Loi0;->X0(Landroid/os/IBinder;)Lu10;

    .line 455
    .line 456
    .line 457
    invoke-static {v1}, Liv1;->f(Landroid/os/Parcel;)V

    .line 458
    .line 459
    .line 460
    invoke-virtual {v2}, Landroid/os/Parcel;->writeNoException()V

    .line 461
    .line 462
    .line 463
    invoke-virtual {v2, v8}, Landroid/os/Parcel;->writeInt(I)V

    .line 464
    .line 465
    .line 466
    return v4

    .line 467
    :pswitch_8
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 468
    .line 469
    .line 470
    move-result-object v17

    .line 471
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 472
    .line 473
    .line 474
    move-result-object v18

    .line 475
    sget-object v0, Lpc4;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 476
    .line 477
    invoke-static {v1, v0}, Liv1;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 478
    .line 479
    .line 480
    move-result-object v0

    .line 481
    move-object/from16 v19, v0

    .line 482
    .line 483
    check-cast v19, Lpc4;

    .line 484
    .line 485
    invoke-virtual {v1}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 486
    .line 487
    .line 488
    move-result-object v0

    .line 489
    invoke-static {v0}, Loi0;->X0(Landroid/os/IBinder;)Lu10;

    .line 490
    .line 491
    .line 492
    move-result-object v20

    .line 493
    invoke-virtual {v1}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 494
    .line 495
    .line 496
    move-result-object v0

    .line 497
    if-nez v0, :cond_a

    .line 498
    .line 499
    :goto_a
    move-object/from16 v21, v3

    .line 500
    .line 501
    goto :goto_b

    .line 502
    :cond_a
    invoke-interface {v0, v5}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 503
    .line 504
    .line 505
    move-result-object v3

    .line 506
    instance-of v5, v3, Lb82;

    .line 507
    .line 508
    if-eqz v5, :cond_b

    .line 509
    .line 510
    check-cast v3, Lb82;

    .line 511
    .line 512
    goto :goto_a

    .line 513
    :cond_b
    new-instance v3, La82;

    .line 514
    .line 515
    invoke-direct {v3, v0}, La82;-><init>(Landroid/os/IBinder;)V

    .line 516
    .line 517
    .line 518
    goto :goto_a

    .line 519
    :goto_b
    invoke-virtual {v1}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 520
    .line 521
    .line 522
    move-result-object v0

    .line 523
    invoke-static {v0}, Ly62;->B3(Landroid/os/IBinder;)Lz62;

    .line 524
    .line 525
    .line 526
    move-result-object v22

    .line 527
    invoke-static {v1}, Liv1;->f(Landroid/os/Parcel;)V

    .line 528
    .line 529
    .line 530
    move-object/from16 v16, p0

    .line 531
    .line 532
    invoke-virtual/range {v16 .. v22}, Lh82;->g2(Ljava/lang/String;Ljava/lang/String;Lpc4;Lu10;Lb82;Lz62;)V

    .line 533
    .line 534
    .line 535
    invoke-virtual {v2}, Landroid/os/Parcel;->writeNoException()V

    .line 536
    .line 537
    .line 538
    return v4

    .line 539
    :pswitch_9
    invoke-virtual {v1}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 540
    .line 541
    .line 542
    move-result-object v0

    .line 543
    invoke-static {v0}, Loi0;->X0(Landroid/os/IBinder;)Lu10;

    .line 544
    .line 545
    .line 546
    invoke-static {v1}, Liv1;->f(Landroid/os/Parcel;)V

    .line 547
    .line 548
    .line 549
    invoke-virtual {v2}, Landroid/os/Parcel;->writeNoException()V

    .line 550
    .line 551
    .line 552
    invoke-virtual {v2, v8}, Landroid/os/Parcel;->writeInt(I)V

    .line 553
    .line 554
    .line 555
    return v4

    .line 556
    :pswitch_a
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 557
    .line 558
    .line 559
    move-result-object v17

    .line 560
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 561
    .line 562
    .line 563
    move-result-object v18

    .line 564
    sget-object v0, Lpc4;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 565
    .line 566
    invoke-static {v1, v0}, Liv1;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 567
    .line 568
    .line 569
    move-result-object v0

    .line 570
    move-object/from16 v19, v0

    .line 571
    .line 572
    check-cast v19, Lpc4;

    .line 573
    .line 574
    invoke-virtual {v1}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 575
    .line 576
    .line 577
    move-result-object v0

    .line 578
    invoke-static {v0}, Loi0;->X0(Landroid/os/IBinder;)Lu10;

    .line 579
    .line 580
    .line 581
    move-result-object v20

    .line 582
    invoke-virtual {v1}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 583
    .line 584
    .line 585
    move-result-object v0

    .line 586
    if-nez v0, :cond_c

    .line 587
    .line 588
    :goto_c
    move-object/from16 v21, v3

    .line 589
    .line 590
    goto :goto_d

    .line 591
    :cond_c
    const-string v3, "com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback"

    .line 592
    .line 593
    invoke-interface {v0, v3}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 594
    .line 595
    .line 596
    move-result-object v5

    .line 597
    instance-of v6, v5, Lv72;

    .line 598
    .line 599
    if-eqz v6, :cond_d

    .line 600
    .line 601
    move-object v3, v5

    .line 602
    check-cast v3, Lv72;

    .line 603
    .line 604
    goto :goto_c

    .line 605
    :cond_d
    new-instance v5, Lu72;

    .line 606
    .line 607
    const/4 v6, 0x2

    .line 608
    invoke-direct {v5, v0, v3, v6}, Lsb1;-><init>(Landroid/os/IBinder;Ljava/lang/String;I)V

    .line 609
    .line 610
    .line 611
    move-object/from16 v21, v5

    .line 612
    .line 613
    :goto_d
    invoke-virtual {v1}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 614
    .line 615
    .line 616
    move-result-object v0

    .line 617
    invoke-static {v0}, Ly62;->B3(Landroid/os/IBinder;)Lz62;

    .line 618
    .line 619
    .line 620
    move-result-object v22

    .line 621
    invoke-static {v1}, Liv1;->f(Landroid/os/Parcel;)V

    .line 622
    .line 623
    .line 624
    move-object/from16 v16, p0

    .line 625
    .line 626
    invoke-virtual/range {v16 .. v22}, Lh82;->B0(Ljava/lang/String;Ljava/lang/String;Lpc4;Lu10;Lv72;Lz62;)V

    .line 627
    .line 628
    .line 629
    invoke-virtual {v2}, Landroid/os/Parcel;->writeNoException()V

    .line 630
    .line 631
    .line 632
    return v4

    .line 633
    :pswitch_b
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 634
    .line 635
    .line 636
    move-result-object v17

    .line 637
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 638
    .line 639
    .line 640
    move-result-object v18

    .line 641
    sget-object v0, Lpc4;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 642
    .line 643
    invoke-static {v1, v0}, Liv1;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 644
    .line 645
    .line 646
    move-result-object v0

    .line 647
    move-object/from16 v19, v0

    .line 648
    .line 649
    check-cast v19, Lpc4;

    .line 650
    .line 651
    invoke-virtual {v1}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 652
    .line 653
    .line 654
    move-result-object v0

    .line 655
    invoke-static {v0}, Loi0;->X0(Landroid/os/IBinder;)Lu10;

    .line 656
    .line 657
    .line 658
    move-result-object v20

    .line 659
    invoke-virtual {v1}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 660
    .line 661
    .line 662
    move-result-object v0

    .line 663
    if-nez v0, :cond_e

    .line 664
    .line 665
    :goto_e
    move-object/from16 v21, v3

    .line 666
    .line 667
    goto :goto_f

    .line 668
    :cond_e
    invoke-interface {v0, v6}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 669
    .line 670
    .line 671
    move-result-object v3

    .line 672
    instance-of v5, v3, Lt72;

    .line 673
    .line 674
    if-eqz v5, :cond_f

    .line 675
    .line 676
    check-cast v3, Lt72;

    .line 677
    .line 678
    goto :goto_e

    .line 679
    :cond_f
    new-instance v3, Ls72;

    .line 680
    .line 681
    invoke-direct {v3, v0}, Ls72;-><init>(Landroid/os/IBinder;)V

    .line 682
    .line 683
    .line 684
    goto :goto_e

    .line 685
    :goto_f
    invoke-virtual {v1}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 686
    .line 687
    .line 688
    move-result-object v0

    .line 689
    invoke-static {v0}, Ly62;->B3(Landroid/os/IBinder;)Lz62;

    .line 690
    .line 691
    .line 692
    move-result-object v22

    .line 693
    sget-object v0, Lxe4;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 694
    .line 695
    invoke-static {v1, v0}, Liv1;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 696
    .line 697
    .line 698
    move-result-object v0

    .line 699
    move-object/from16 v23, v0

    .line 700
    .line 701
    check-cast v23, Lxe4;

    .line 702
    .line 703
    invoke-static {v1}, Liv1;->f(Landroid/os/Parcel;)V

    .line 704
    .line 705
    .line 706
    move-object/from16 v16, p0

    .line 707
    .line 708
    invoke-virtual/range {v16 .. v23}, Lh82;->y1(Ljava/lang/String;Ljava/lang/String;Lpc4;Lu10;Lt72;Lz62;Lxe4;)V

    .line 709
    .line 710
    .line 711
    invoke-virtual {v2}, Landroid/os/Parcel;->writeNoException()V

    .line 712
    .line 713
    .line 714
    return v4

    .line 715
    :cond_10
    invoke-virtual {v1}, Landroid/os/Parcel;->createStringArray()[Ljava/lang/String;

    .line 716
    .line 717
    .line 718
    sget-object v0, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 719
    .line 720
    invoke-virtual {v1, v0}, Landroid/os/Parcel;->createTypedArray(Landroid/os/Parcelable$Creator;)[Ljava/lang/Object;

    .line 721
    .line 722
    .line 723
    move-result-object v0

    .line 724
    check-cast v0, [Landroid/os/Bundle;

    .line 725
    .line 726
    invoke-static {v1}, Liv1;->f(Landroid/os/Parcel;)V

    .line 727
    .line 728
    .line 729
    invoke-virtual {v2}, Landroid/os/Parcel;->writeNoException()V

    .line 730
    .line 731
    .line 732
    return v4

    .line 733
    :cond_11
    invoke-virtual {v1}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 734
    .line 735
    .line 736
    move-result-object v0

    .line 737
    invoke-static {v0}, Loi0;->X0(Landroid/os/IBinder;)Lu10;

    .line 738
    .line 739
    .line 740
    invoke-static {v1}, Liv1;->f(Landroid/os/Parcel;)V

    .line 741
    .line 742
    .line 743
    invoke-virtual {v2}, Landroid/os/Parcel;->writeNoException()V

    .line 744
    .line 745
    .line 746
    return v4

    .line 747
    :cond_12
    invoke-virtual/range {p0 .. p0}, Lh82;->f()Lpy2;

    .line 748
    .line 749
    .line 750
    move-result-object v0

    .line 751
    invoke-virtual {v2}, Landroid/os/Parcel;->writeNoException()V

    .line 752
    .line 753
    .line 754
    invoke-static {v2, v0}, Liv1;->e(Landroid/os/Parcel;Landroid/os/IInterface;)V

    .line 755
    .line 756
    .line 757
    return v4

    .line 758
    :cond_13
    invoke-virtual/range {p0 .. p0}, Lh82;->e()Li82;

    .line 759
    .line 760
    .line 761
    throw v3

    .line 762
    :cond_14
    invoke-virtual/range {p0 .. p0}, Lh82;->c()Li82;

    .line 763
    .line 764
    .line 765
    throw v3

    .line 766
    :cond_15
    invoke-virtual {v1}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 767
    .line 768
    .line 769
    move-result-object v0

    .line 770
    invoke-static {v0}, Loi0;->X0(Landroid/os/IBinder;)Lu10;

    .line 771
    .line 772
    .line 773
    move-result-object v17

    .line 774
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 775
    .line 776
    .line 777
    move-result-object v18

    .line 778
    sget-object v0, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 779
    .line 780
    invoke-static {v1, v0}, Liv1;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 781
    .line 782
    .line 783
    move-result-object v5

    .line 784
    move-object/from16 v19, v5

    .line 785
    .line 786
    check-cast v19, Landroid/os/Bundle;

    .line 787
    .line 788
    invoke-static {v1, v0}, Liv1;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 789
    .line 790
    .line 791
    move-result-object v0

    .line 792
    move-object/from16 v20, v0

    .line 793
    .line 794
    check-cast v20, Landroid/os/Bundle;

    .line 795
    .line 796
    sget-object v0, Lxe4;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 797
    .line 798
    invoke-static {v1, v0}, Liv1;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 799
    .line 800
    .line 801
    move-result-object v0

    .line 802
    move-object/from16 v21, v0

    .line 803
    .line 804
    check-cast v21, Lxe4;

    .line 805
    .line 806
    invoke-virtual {v1}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 807
    .line 808
    .line 809
    move-result-object v0

    .line 810
    if-nez v0, :cond_16

    .line 811
    .line 812
    :goto_10
    move-object/from16 v22, v3

    .line 813
    .line 814
    goto :goto_11

    .line 815
    :cond_16
    const-string v3, "com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback"

    .line 816
    .line 817
    invoke-interface {v0, v3}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 818
    .line 819
    .line 820
    move-result-object v5

    .line 821
    instance-of v6, v5, Lf82;

    .line 822
    .line 823
    if-eqz v6, :cond_17

    .line 824
    .line 825
    move-object v3, v5

    .line 826
    check-cast v3, Lf82;

    .line 827
    .line 828
    goto :goto_10

    .line 829
    :cond_17
    new-instance v5, Le82;

    .line 830
    .line 831
    const/4 v6, 0x2

    .line 832
    invoke-direct {v5, v0, v3, v6}, Lsb1;-><init>(Landroid/os/IBinder;Ljava/lang/String;I)V

    .line 833
    .line 834
    .line 835
    move-object/from16 v22, v5

    .line 836
    .line 837
    :goto_11
    invoke-static {v1}, Liv1;->f(Landroid/os/Parcel;)V

    .line 838
    .line 839
    .line 840
    move-object/from16 v16, p0

    .line 841
    .line 842
    invoke-virtual/range {v16 .. v22}, Lh82;->q3(Lu10;Ljava/lang/String;Landroid/os/Bundle;Landroid/os/Bundle;Lxe4;Lf82;)V

    .line 843
    .line 844
    .line 845
    invoke-virtual {v2}, Landroid/os/Parcel;->writeNoException()V

    .line 846
    .line 847
    .line 848
    return v4

    .line 849
    :pswitch_data_0
    .packed-switch 0xd
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

.method public final B0(Ljava/lang/String;Ljava/lang/String;Lpc4;Lu10;Lv72;Lz62;)V
    .locals 1

    .line 1
    :try_start_0
    new-instance p1, Lz71;

    .line 2
    .line 3
    invoke-direct {p1, p0, p5}, Lz71;-><init>(Lh82;Lv72;)V

    .line 4
    .line 5
    .line 6
    iget-object p5, p0, Lh82;->f:Lcom/google/android/gms/ads/mediation/rtb/RtbAdapter;

    .line 7
    .line 8
    new-instance p6, Lgd0;

    .line 9
    .line 10
    invoke-static {p4}, Loi0;->l1(Lu10;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    check-cast v0, Landroid/content/Context;

    .line 15
    .line 16
    invoke-static {p2}, Lh82;->C3(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0, p3}, Lh82;->B3(Lpc4;)V

    .line 20
    .line 21
    .line 22
    invoke-static {p3}, Lh82;->D3(Lpc4;)V

    .line 23
    .line 24
    .line 25
    invoke-static {p2, p3}, Lh82;->E3(Ljava/lang/String;Lpc4;)V

    .line 26
    .line 27
    .line 28
    invoke-direct {p6}, Ljava/lang/Object;-><init>()V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p5, p6, p1}, Lcom/google/android/gms/ads/mediation/rtb/RtbAdapter;->loadRtbInterstitialAd(Lgd0;Lad0;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :catchall_0
    move-exception p1

    .line 36
    const-string p2, "Adapter failed to render interstitial ad."

    .line 37
    .line 38
    invoke-static {p2, p1}, Lgi2;->c0(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 39
    .line 40
    .line 41
    const-string p2, "adapter.loadRtbInterstitialAd"

    .line 42
    .line 43
    invoke-static {p4, p1, p2}, Lgi2;->E(Lu10;Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    new-instance p1, Landroid/os/RemoteException;

    .line 47
    .line 48
    invoke-direct {p1}, Landroid/os/RemoteException;-><init>()V

    .line 49
    .line 50
    .line 51
    throw p1
.end method

.method public final B3(Lpc4;)V
    .locals 1

    .line 1
    iget-object p1, p1, Lpc4;->r:Landroid/os/Bundle;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lh82;->f:Lcom/google/android/gms/ads/mediation/rtb/RtbAdapter;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    return-void

    .line 22
    :cond_0
    new-instance p1, Landroid/os/Bundle;

    .line 23
    .line 24
    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public final F2(Ljava/lang/String;Ljava/lang/String;Lpc4;Lu10;Lb82;Lz62;)V
    .locals 1

    .line 1
    :try_start_0
    new-instance p1, Lof3;

    .line 2
    .line 3
    invoke-direct {p1, p0, p5}, Lof3;-><init>(Lh82;Lb82;)V

    .line 4
    .line 5
    .line 6
    iget-object p5, p0, Lh82;->f:Lcom/google/android/gms/ads/mediation/rtb/RtbAdapter;

    .line 7
    .line 8
    new-instance p6, Lkd0;

    .line 9
    .line 10
    invoke-static {p4}, Loi0;->l1(Lu10;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    check-cast v0, Landroid/content/Context;

    .line 15
    .line 16
    invoke-static {p2}, Lh82;->C3(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0, p3}, Lh82;->B3(Lpc4;)V

    .line 20
    .line 21
    .line 22
    invoke-static {p3}, Lh82;->D3(Lpc4;)V

    .line 23
    .line 24
    .line 25
    invoke-static {p2, p3}, Lh82;->E3(Ljava/lang/String;Lpc4;)V

    .line 26
    .line 27
    .line 28
    invoke-direct {p6}, Ljava/lang/Object;-><init>()V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p5, p6, p1}, Lcom/google/android/gms/ads/mediation/rtb/RtbAdapter;->loadRtbRewardedInterstitialAd(Lkd0;Lad0;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :catchall_0
    move-exception p1

    .line 36
    const-string p2, "Adapter failed to render rewarded interstitial ad."

    .line 37
    .line 38
    invoke-static {p2, p1}, Lgi2;->c0(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 39
    .line 40
    .line 41
    const-string p2, "adapter.loadRtbRewardedInterstitialAd"

    .line 42
    .line 43
    invoke-static {p4, p1, p2}, Lgi2;->E(Lu10;Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    new-instance p1, Landroid/os/RemoteException;

    .line 47
    .line 48
    invoke-direct {p1}, Landroid/os/RemoteException;-><init>()V

    .line 49
    .line 50
    .line 51
    throw p1
.end method

.method public final H0(Loi0;)Z
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    return p1
.end method

.method public final L1(Ljava/lang/String;Ljava/lang/String;Lpc4;Lu10;Lz72;Lz62;Lr12;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lh82;->f:Lcom/google/android/gms/ads/mediation/rtb/RtbAdapter;

    .line 2
    .line 3
    :try_start_0
    new-instance p6, Lzs1;

    .line 4
    .line 5
    invoke-direct {p6, p0, p5}, Lzs1;-><init>(Lh82;Lz72;)V

    .line 6
    .line 7
    .line 8
    new-instance p7, Lid0;

    .line 9
    .line 10
    invoke-static {p4}, Loi0;->l1(Lu10;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    check-cast v0, Landroid/content/Context;

    .line 15
    .line 16
    invoke-static {p2}, Lh82;->C3(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0, p3}, Lh82;->B3(Lpc4;)V

    .line 20
    .line 21
    .line 22
    invoke-static {p3}, Lh82;->D3(Lpc4;)V

    .line 23
    .line 24
    .line 25
    invoke-static {p2, p3}, Lh82;->E3(Ljava/lang/String;Lpc4;)V

    .line 26
    .line 27
    .line 28
    invoke-direct {p7}, Ljava/lang/Object;-><init>()V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1, p7, p6}, Lcom/google/android/gms/ads/mediation/rtb/RtbAdapter;->loadRtbNativeAdMapper(Lid0;Lad0;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :catchall_0
    move-exception p6

    .line 36
    const-string p7, "Adapter failed to render native ad."

    .line 37
    .line 38
    invoke-static {p7, p6}, Lgi2;->c0(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 39
    .line 40
    .line 41
    const-string v0, "adapter.loadRtbNativeAdMapper"

    .line 42
    .line 43
    invoke-static {p4, p6, v0}, Lgi2;->E(Lu10;Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p6}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p6

    .line 50
    invoke-static {p6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-nez v0, :cond_0

    .line 55
    .line 56
    const-string v0, "Method is not found"

    .line 57
    .line 58
    invoke-virtual {p6, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result p6

    .line 62
    if-eqz p6, :cond_0

    .line 63
    .line 64
    :try_start_1
    new-instance p6, Lf23;

    .line 65
    .line 66
    const/16 v0, 0x11

    .line 67
    .line 68
    invoke-direct {p6, p0, p5, v0}, Lf23;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 69
    .line 70
    .line 71
    new-instance p5, Lid0;

    .line 72
    .line 73
    invoke-static {p4}, Loi0;->l1(Lu10;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    check-cast v0, Landroid/content/Context;

    .line 78
    .line 79
    invoke-static {p2}, Lh82;->C3(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {p0, p3}, Lh82;->B3(Lpc4;)V

    .line 83
    .line 84
    .line 85
    invoke-static {p3}, Lh82;->D3(Lpc4;)V

    .line 86
    .line 87
    .line 88
    invoke-static {p2, p3}, Lh82;->E3(Ljava/lang/String;Lpc4;)V

    .line 89
    .line 90
    .line 91
    invoke-direct {p5}, Ljava/lang/Object;-><init>()V

    .line 92
    .line 93
    .line 94
    invoke-virtual {p1, p5, p6}, Lcom/google/android/gms/ads/mediation/rtb/RtbAdapter;->loadRtbNativeAd(Lid0;Lad0;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 95
    .line 96
    .line 97
    return-void

    .line 98
    :catchall_1
    move-exception p1

    .line 99
    invoke-static {p7, p1}, Lgi2;->c0(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 100
    .line 101
    .line 102
    const-string p2, "adapter.loadRtbNativeAd"

    .line 103
    .line 104
    invoke-static {p4, p1, p2}, Lgi2;->E(Lu10;Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    new-instance p1, Landroid/os/RemoteException;

    .line 108
    .line 109
    invoke-direct {p1}, Landroid/os/RemoteException;-><init>()V

    .line 110
    .line 111
    .line 112
    throw p1

    .line 113
    :cond_0
    new-instance p1, Landroid/os/RemoteException;

    .line 114
    .line 115
    invoke-direct {p1}, Landroid/os/RemoteException;-><init>()V

    .line 116
    .line 117
    .line 118
    throw p1
.end method

.method public final P1(Ljava/lang/String;Ljava/lang/String;Lpc4;Lu10;Lt72;Lz62;Lxe4;)V
    .locals 6

    .line 1
    :try_start_0
    iget-object p1, p0, Lh82;->f:Lcom/google/android/gms/ads/mediation/rtb/RtbAdapter;

    .line 2
    .line 3
    invoke-static {p4}, Loi0;->l1(Lu10;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p6

    .line 7
    check-cast p6, Landroid/content/Context;

    .line 8
    .line 9
    invoke-static {p2}, Lh82;->C3(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, p3}, Lh82;->B3(Lpc4;)V

    .line 13
    .line 14
    .line 15
    invoke-static {p3}, Lh82;->D3(Lpc4;)V

    .line 16
    .line 17
    .line 18
    invoke-static {p2, p3}, Lh82;->E3(Ljava/lang/String;Lpc4;)V

    .line 19
    .line 20
    .line 21
    iget p2, p7, Lxe4;->j:I

    .line 22
    .line 23
    iget p3, p7, Lxe4;->g:I

    .line 24
    .line 25
    iget-object p6, p7, Lxe4;->f:Ljava/lang/String;

    .line 26
    .line 27
    new-instance p7, Ld3;

    .line 28
    .line 29
    invoke-direct {p7, p6, p2, p3}, Ld3;-><init>(Ljava/lang/String;II)V

    .line 30
    .line 31
    .line 32
    const-string p2, " does not support interscroller ads."

    .line 33
    .line 34
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-virtual {p1, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    const-string v3, "com.google.android.gms.ads"
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 47
    .line 48
    :try_start_1
    new-instance v0, Lnx2;

    .line 49
    .line 50
    const/4 v5, 0x0

    .line 51
    const/4 v1, 0x7

    .line 52
    const/4 v4, 0x0

    .line 53
    invoke-direct/range {v0 .. v5}, Lnx2;-><init>(ILjava/lang/String;Ljava/lang/String;Lnx2;Landroid/os/IBinder;)V

    .line 54
    .line 55
    .line 56
    invoke-interface {p5, v0}, Lt72;->a(Lnx2;)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    :catch_0
    move-exception v0

    .line 61
    move-object p1, v0

    .line 62
    :try_start_2
    const-string p2, ""

    .line 63
    .line 64
    invoke-static {p2, p1}, Lgi2;->c0(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 65
    .line 66
    .line 67
    return-void

    .line 68
    :catchall_0
    move-exception v0

    .line 69
    move-object p1, v0

    .line 70
    const-string p2, "Adapter failed to render interscroller ad."

    .line 71
    .line 72
    invoke-static {p2, p1}, Lgi2;->c0(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 73
    .line 74
    .line 75
    const-string p2, "adapter.loadRtbInterscrollerAd"

    .line 76
    .line 77
    invoke-static {p4, p1, p2}, Lgi2;->E(Lu10;Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    new-instance p1, Landroid/os/RemoteException;

    .line 81
    .line 82
    invoke-direct {p1}, Landroid/os/RemoteException;-><init>()V

    .line 83
    .line 84
    .line 85
    throw p1
.end method

.method public final c()Li82;
    .locals 1

    .line 1
    iget-object v0, p0, Lh82;->f:Lcom/google/android/gms/ads/mediation/rtb/RtbAdapter;

    .line 2
    .line 3
    invoke-virtual {v0}, Lf3;->getVersionInfo()Ld51;

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    throw v0
.end method

.method public final e()Li82;
    .locals 1

    .line 1
    iget-object v0, p0, Lh82;->f:Lcom/google/android/gms/ads/mediation/rtb/RtbAdapter;

    .line 2
    .line 3
    invoke-virtual {v0}, Lf3;->getSDKVersionInfo()Ld51;

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    throw v0
.end method

.method public final f()Lpy2;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method public final f2(Ljava/lang/String;Ljava/lang/String;Lpc4;Lu10;Lr72;Lz62;)V
    .locals 1

    .line 1
    :try_start_0
    new-instance p1, Lkf3;

    .line 2
    .line 3
    const/16 p6, 0x11

    .line 4
    .line 5
    invoke-direct {p1, p0, p5, p6}, Lkf3;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 6
    .line 7
    .line 8
    iget-object p5, p0, Lh82;->f:Lcom/google/android/gms/ads/mediation/rtb/RtbAdapter;

    .line 9
    .line 10
    new-instance p6, Ldd0;

    .line 11
    .line 12
    invoke-static {p4}, Loi0;->l1(Lu10;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    check-cast v0, Landroid/content/Context;

    .line 17
    .line 18
    invoke-static {p2}, Lh82;->C3(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, p3}, Lh82;->B3(Lpc4;)V

    .line 22
    .line 23
    .line 24
    invoke-static {p3}, Lh82;->D3(Lpc4;)V

    .line 25
    .line 26
    .line 27
    invoke-static {p2, p3}, Lh82;->E3(Ljava/lang/String;Lpc4;)V

    .line 28
    .line 29
    .line 30
    invoke-direct {p6}, Ljava/lang/Object;-><init>()V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p5, p6, p1}, Lcom/google/android/gms/ads/mediation/rtb/RtbAdapter;->loadRtbAppOpenAd(Ldd0;Lad0;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :catchall_0
    move-exception p1

    .line 38
    const-string p2, "Adapter failed to render app open ad."

    .line 39
    .line 40
    invoke-static {p2, p1}, Lgi2;->c0(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 41
    .line 42
    .line 43
    const-string p2, "adapter.loadRtbAppOpenAd"

    .line 44
    .line 45
    invoke-static {p4, p1, p2}, Lgi2;->E(Lu10;Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    new-instance p1, Landroid/os/RemoteException;

    .line 49
    .line 50
    invoke-direct {p1}, Landroid/os/RemoteException;-><init>()V

    .line 51
    .line 52
    .line 53
    throw p1
.end method

.method public final g2(Ljava/lang/String;Ljava/lang/String;Lpc4;Lu10;Lb82;Lz62;)V
    .locals 1

    .line 1
    :try_start_0
    new-instance p1, Lof3;

    .line 2
    .line 3
    invoke-direct {p1, p0, p5}, Lof3;-><init>(Lh82;Lb82;)V

    .line 4
    .line 5
    .line 6
    iget-object p5, p0, Lh82;->f:Lcom/google/android/gms/ads/mediation/rtb/RtbAdapter;

    .line 7
    .line 8
    new-instance p6, Lkd0;

    .line 9
    .line 10
    invoke-static {p4}, Loi0;->l1(Lu10;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    check-cast v0, Landroid/content/Context;

    .line 15
    .line 16
    invoke-static {p2}, Lh82;->C3(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0, p3}, Lh82;->B3(Lpc4;)V

    .line 20
    .line 21
    .line 22
    invoke-static {p3}, Lh82;->D3(Lpc4;)V

    .line 23
    .line 24
    .line 25
    invoke-static {p2, p3}, Lh82;->E3(Ljava/lang/String;Lpc4;)V

    .line 26
    .line 27
    .line 28
    invoke-direct {p6}, Ljava/lang/Object;-><init>()V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p5, p6, p1}, Lcom/google/android/gms/ads/mediation/rtb/RtbAdapter;->loadRtbRewardedAd(Lkd0;Lad0;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :catchall_0
    move-exception p1

    .line 36
    const-string p2, "Adapter failed to render rewarded ad."

    .line 37
    .line 38
    invoke-static {p2, p1}, Lgi2;->c0(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 39
    .line 40
    .line 41
    const-string p2, "adapter.loadRtbRewardedAd"

    .line 42
    .line 43
    invoke-static {p4, p1, p2}, Lgi2;->E(Lu10;Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    new-instance p1, Landroid/os/RemoteException;

    .line 47
    .line 48
    invoke-direct {p1}, Landroid/os/RemoteException;-><init>()V

    .line 49
    .line 50
    .line 51
    throw p1
.end method

.method public final h2(Loi0;)Z
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    return p1
.end method

.method public final j1(Ljava/lang/String;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final j3(Lu10;)Z
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    return p1
.end method

.method public final p3(Ljava/lang/String;Ljava/lang/String;Lpc4;Loi0;Lf13;Lz62;)V
    .locals 8

    .line 1
    const/4 v7, 0x0

    .line 2
    move-object v0, p0

    .line 3
    move-object v1, p1

    .line 4
    move-object v2, p2

    .line 5
    move-object v3, p3

    .line 6
    move-object v4, p4

    .line 7
    move-object v5, p5

    .line 8
    move-object v6, p6

    .line 9
    invoke-virtual/range {v0 .. v7}, Lh82;->L1(Ljava/lang/String;Ljava/lang/String;Lpc4;Lu10;Lz72;Lz62;Lr12;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final q3(Lu10;Ljava/lang/String;Landroid/os/Bundle;Landroid/os/Bundle;Lxe4;Lf82;)V
    .locals 2

    .line 1
    :try_start_0
    new-instance p3, Lus0;

    .line 2
    .line 3
    invoke-direct {p3}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object p4, p0, Lh82;->f:Lcom/google/android/gms/ads/mediation/rtb/RtbAdapter;

    .line 7
    .line 8
    new-instance p6, Lpz;

    .line 9
    .line 10
    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    .line 11
    .line 12
    .line 13
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    sparse-switch v0, :sswitch_data_0

    .line 15
    .line 16
    .line 17
    goto/16 :goto_1

    .line 18
    .line 19
    :sswitch_0
    const-string v0, "rewarded_interstitial"

    .line 20
    .line 21
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result p2

    .line 25
    if-eqz p2, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :sswitch_1
    const-string v0, "app_open_ad"

    .line 29
    .line 30
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result p2

    .line 34
    if-eqz p2, :cond_0

    .line 35
    .line 36
    :try_start_1
    sget-object p2, Lmz1;->Ec:Liz1;

    .line 37
    .line 38
    sget-object v0, Ltw1;->e:Ltw1;

    .line 39
    .line 40
    iget-object v0, v0, Ltw1;->c:Lkz1;

    .line 41
    .line 42
    invoke-virtual {v0, p2}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p2

    .line 46
    check-cast p2, Ljava/lang/Boolean;

    .line 47
    .line 48
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 49
    .line 50
    .line 51
    move-result p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 52
    if-eqz p2, :cond_0

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :catchall_0
    move-exception p2

    .line 56
    goto :goto_2

    .line 57
    :sswitch_2
    const-string v0, "app_open"

    .line 58
    .line 59
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result p2

    .line 63
    if-eqz p2, :cond_0

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :sswitch_3
    const-string v0, "interstitial"

    .line 67
    .line 68
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result p2

    .line 72
    if-eqz p2, :cond_0

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :sswitch_4
    const-string v0, "rewarded"

    .line 76
    .line 77
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result p2

    .line 81
    if-eqz p2, :cond_0

    .line 82
    .line 83
    goto :goto_0

    .line 84
    :sswitch_5
    const-string v0, "native"

    .line 85
    .line 86
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result p2

    .line 90
    if-eqz p2, :cond_0

    .line 91
    .line 92
    goto :goto_0

    .line 93
    :sswitch_6
    const-string v0, "banner"

    .line 94
    .line 95
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    move-result p2

    .line 99
    if-eqz p2, :cond_0

    .line 100
    .line 101
    :goto_0
    const/16 p2, 0x19

    .line 102
    .line 103
    :try_start_2
    invoke-direct {p6, p2}, Lpz;-><init>(I)V

    .line 104
    .line 105
    .line 106
    new-instance p2, Ljava/util/ArrayList;

    .line 107
    .line 108
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 109
    .line 110
    .line 111
    invoke-virtual {p2, p6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    new-instance p2, Lkr0;

    .line 115
    .line 116
    invoke-static {p1}, Loi0;->l1(Lu10;)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object p6

    .line 120
    check-cast p6, Landroid/content/Context;

    .line 121
    .line 122
    iget p6, p5, Lxe4;->j:I

    .line 123
    .line 124
    iget v0, p5, Lxe4;->g:I

    .line 125
    .line 126
    iget-object p5, p5, Lxe4;->f:Ljava/lang/String;

    .line 127
    .line 128
    new-instance v1, Ld3;

    .line 129
    .line 130
    invoke-direct {v1, p5, p6, v0}, Ld3;-><init>(Ljava/lang/String;II)V

    .line 131
    .line 132
    .line 133
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 134
    .line 135
    .line 136
    invoke-virtual {p4, p2, p3}, Lcom/google/android/gms/ads/mediation/rtb/RtbAdapter;->collectSignals(Lkr0;Law0;)V

    .line 137
    .line 138
    .line 139
    return-void

    .line 140
    :cond_0
    :goto_1
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 141
    .line 142
    const-string p3, "Internal Error"

    .line 143
    .line 144
    invoke-direct {p2, p3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    throw p2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 148
    :goto_2
    const-string p3, "Error generating signals for RTB"

    .line 149
    .line 150
    invoke-static {p3, p2}, Lgi2;->c0(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 151
    .line 152
    .line 153
    const-string p3, "adapter.collectSignals"

    .line 154
    .line 155
    invoke-static {p1, p2, p3}, Lgi2;->E(Lu10;Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    new-instance p1, Landroid/os/RemoteException;

    .line 159
    .line 160
    invoke-direct {p1}, Landroid/os/RemoteException;-><init>()V

    .line 161
    .line 162
    .line 163
    throw p1

    .line 164
    nop

    .line 165
    :sswitch_data_0
    .sparse-switch
        -0x533a80d4 -> :sswitch_6
        -0x3ebdafe9 -> :sswitch_5
        -0xe47b3f2 -> :sswitch_4
        0x240b672c -> :sswitch_3
        0x459991a8 -> :sswitch_2
        0x69fe9e1a -> :sswitch_1
        0x71ef0bbd -> :sswitch_0
    .end sparse-switch
.end method

.method public final y1(Ljava/lang/String;Ljava/lang/String;Lpc4;Lu10;Lt72;Lz62;Lxe4;)V
    .locals 1

    .line 1
    :try_start_0
    new-instance p1, Lvg0;

    .line 2
    .line 3
    invoke-direct {p1, p0, p5}, Lvg0;-><init>(Lh82;Lt72;)V

    .line 4
    .line 5
    .line 6
    iget-object p5, p0, Lh82;->f:Lcom/google/android/gms/ads/mediation/rtb/RtbAdapter;

    .line 7
    .line 8
    new-instance p6, Led0;

    .line 9
    .line 10
    invoke-static {p4}, Loi0;->l1(Lu10;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    check-cast v0, Landroid/content/Context;

    .line 15
    .line 16
    invoke-static {p2}, Lh82;->C3(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0, p3}, Lh82;->B3(Lpc4;)V

    .line 20
    .line 21
    .line 22
    invoke-static {p3}, Lh82;->D3(Lpc4;)V

    .line 23
    .line 24
    .line 25
    invoke-static {p2, p3}, Lh82;->E3(Ljava/lang/String;Lpc4;)V

    .line 26
    .line 27
    .line 28
    iget p2, p7, Lxe4;->j:I

    .line 29
    .line 30
    iget p3, p7, Lxe4;->g:I

    .line 31
    .line 32
    iget-object p7, p7, Lxe4;->f:Ljava/lang/String;

    .line 33
    .line 34
    new-instance v0, Ld3;

    .line 35
    .line 36
    invoke-direct {v0, p7, p2, p3}, Ld3;-><init>(Ljava/lang/String;II)V

    .line 37
    .line 38
    .line 39
    invoke-direct {p6}, Ljava/lang/Object;-><init>()V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p5, p6, p1}, Lcom/google/android/gms/ads/mediation/rtb/RtbAdapter;->loadRtbBannerAd(Led0;Lad0;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :catchall_0
    move-exception p1

    .line 47
    const-string p2, "Adapter failed to render banner ad."

    .line 48
    .line 49
    invoke-static {p2, p1}, Lgi2;->c0(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 50
    .line 51
    .line 52
    const-string p2, "adapter.loadRtbBannerAd"

    .line 53
    .line 54
    invoke-static {p4, p1, p2}, Lgi2;->E(Lu10;Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    new-instance p1, Landroid/os/RemoteException;

    .line 58
    .line 59
    invoke-direct {p1}, Landroid/os/RemoteException;-><init>()V

    .line 60
    .line 61
    .line 62
    throw p1
.end method
