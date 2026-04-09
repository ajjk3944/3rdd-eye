.class public final Lxy2;
.super Lhv1;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ly92;


# instance fields
.field public final f:Landroid/content/Context;

.field public final g:Lpq3;

.field public final h:Lzs1;

.field public final i:Lth2;

.field public final j:Ljava/util/ArrayDeque;

.field public final k:Lea3;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lpq3;Lts0;Lth2;Lzs1;Ljava/util/ArrayDeque;Lea3;)V
    .locals 0

    .line 1
    const-string p3, "com.google.android.gms.ads.internal.request.IAdRequestService"

    .line 2
    .line 3
    invoke-direct {p0, p3}, Lhv1;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Lmz1;->a(Landroid/content/Context;)V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lxy2;->f:Landroid/content/Context;

    .line 10
    .line 11
    iput-object p2, p0, Lxy2;->g:Lpq3;

    .line 12
    .line 13
    iput-object p5, p0, Lxy2;->h:Lzs1;

    .line 14
    .line 15
    iput-object p4, p0, Lxy2;->i:Lth2;

    .line 16
    .line 17
    iput-object p6, p0, Lxy2;->j:Ljava/util/ArrayDeque;

    .line 18
    .line 19
    iput-object p7, p0, Lxy2;->k:Lea3;

    .line 20
    .line 21
    return-void
.end method

.method public static F3(Lq93;Lu93;Li62;Lda3;Laa3;)Lq93;
    .locals 3

    .line 1
    sget-object v0, Lh62;->b:Lus0;

    .line 2
    .line 3
    sget-object v1, Lsu2;->h:Lsu2;

    .line 4
    .line 5
    const-string v2, "AFMA_getAdDictionary"

    .line 6
    .line 7
    invoke-virtual {p2, v2, v0, v1}, Li62;->a(Ljava/lang/String;Lg62;Lf62;)Lk62;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    invoke-static {p0, p4}, Lqb1;->C(Ln70;Laa3;)V

    .line 12
    .line 13
    .line 14
    sget-object v0, Ls93;->l:Ls93;

    .line 15
    .line 16
    invoke-virtual {p1, p0, v0}, Lu93;->a(Ln70;Ljava/lang/Object;)Lbu1;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-virtual {p0, p2}, Lbu1;->s(Lyp3;)Lbu1;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-virtual {p0}, Lbu1;->A()Lq93;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    sget-object p1, Ln02;->c:Lso1;

    .line 29
    .line 30
    invoke-virtual {p1}, Lso1;->w()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    check-cast p1, Ljava/lang/Boolean;

    .line 35
    .line 36
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    if-nez p1, :cond_0

    .line 41
    .line 42
    return-object p0

    .line 43
    :cond_0
    invoke-static {p0}, Lgq3;->r(Ln70;)Lgq3;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    new-instance p2, Llv2;

    .line 48
    .line 49
    const/4 v0, 0x7

    .line 50
    invoke-direct {p2, p3, p4, v0}, Llv2;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 51
    .line 52
    .line 53
    sget-object p3, Lmd2;->g:Lld2;

    .line 54
    .line 55
    new-instance p4, Ljq3;

    .line 56
    .line 57
    const/4 v0, 0x0

    .line 58
    invoke-direct {p4, p1, p2, v0}, Ljq3;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 59
    .line 60
    .line 61
    invoke-interface {p1, p4, p3}, Ln70;->c(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 62
    .line 63
    .line 64
    return-object p0
.end method


# virtual methods
.method public final A3(ILandroid/os/Parcel;Landroid/os/Parcel;)Z
    .locals 5

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    const-string v2, "com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener"

    .line 4
    .line 5
    const/4 v3, 0x0

    .line 6
    packed-switch p1, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    :pswitch_0
    return v1

    .line 10
    :pswitch_1
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-static {p2}, Liv1;->f(Landroid/os/Parcel;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, p1}, Lxy2;->q0(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 21
    .line 22
    .line 23
    goto/16 :goto_7

    .line 24
    .line 25
    :pswitch_2
    sget-object p1, Lw92;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 26
    .line 27
    invoke-static {p2, p1}, Liv1;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    check-cast p1, Lw92;

    .line 32
    .line 33
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    if-nez v1, :cond_0

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    const-string v2, "com.google.android.gms.ads.internal.request.ITrustlessTokenListener"

    .line 41
    .line 42
    invoke-interface {v1, v2}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    instance-of v4, v3, Lea2;

    .line 47
    .line 48
    if-eqz v4, :cond_1

    .line 49
    .line 50
    check-cast v3, Lea2;

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_1
    new-instance v3, Lea2;

    .line 54
    .line 55
    const/4 v4, 0x2

    .line 56
    invoke-direct {v3, v1, v2, v4}, Lsb1;-><init>(Landroid/os/IBinder;Ljava/lang/String;I)V

    .line 57
    .line 58
    .line 59
    :goto_0
    invoke-static {p2}, Liv1;->f(Landroid/os/Parcel;)V

    .line 60
    .line 61
    .line 62
    sget-object p2, Lk12;->a:Lso1;

    .line 63
    .line 64
    invoke-virtual {p2}, Lso1;->w()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object p2

    .line 68
    check-cast p2, Ljava/lang/Boolean;

    .line 69
    .line 70
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 71
    .line 72
    .line 73
    move-result p2

    .line 74
    if-nez p2, :cond_2

    .line 75
    .line 76
    :try_start_0
    const-string p2, ""

    .line 77
    .line 78
    invoke-virtual {v3}, Lsb1;->U()Landroid/os/Parcel;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    invoke-virtual {v1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    invoke-static {v1, p1}, Liv1;->c(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v3, v1, v0}, Lsb1;->M0(Landroid/os/Parcel;I)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 89
    .line 90
    .line 91
    goto :goto_1

    .line 92
    :catch_0
    invoke-static {}, Lgi2;->R()Z

    .line 93
    .line 94
    .line 95
    goto :goto_1

    .line 96
    :cond_2
    iget-object p2, p0, Lxy2;->i:Lth2;

    .line 97
    .line 98
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 99
    .line 100
    .line 101
    iget-object p2, p1, Lw92;->f:Ljava/lang/String;

    .line 102
    .line 103
    sget-object p2, Llq3;->g:Llq3;

    .line 104
    .line 105
    new-instance v1, Lmr2;

    .line 106
    .line 107
    invoke-direct {v1, p0, v3, p1}, Lmr2;-><init>(Lxy2;Lea2;Lw92;)V

    .line 108
    .line 109
    .line 110
    sget-object p1, Lmd2;->g:Lld2;

    .line 111
    .line 112
    new-instance v2, Ljq3;

    .line 113
    .line 114
    const/4 v3, 0x0

    .line 115
    invoke-direct {v2, p2, v1, v3}, Ljq3;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {p2, v2, p1}, Llq3;->c(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 119
    .line 120
    .line 121
    :goto_1
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 122
    .line 123
    .line 124
    goto/16 :goto_7

    .line 125
    .line 126
    :pswitch_3
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 131
    .line 132
    .line 133
    move-result-object v1

    .line 134
    if-nez v1, :cond_3

    .line 135
    .line 136
    goto :goto_2

    .line 137
    :cond_3
    invoke-interface {v1, v2}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 138
    .line 139
    .line 140
    move-result-object v2

    .line 141
    instance-of v3, v2, Lda2;

    .line 142
    .line 143
    if-eqz v3, :cond_4

    .line 144
    .line 145
    move-object v3, v2

    .line 146
    check-cast v3, Lda2;

    .line 147
    .line 148
    goto :goto_2

    .line 149
    :cond_4
    new-instance v3, Lz92;

    .line 150
    .line 151
    invoke-direct {v3, v1}, Lz92;-><init>(Landroid/os/IBinder;)V

    .line 152
    .line 153
    .line 154
    :goto_2
    invoke-static {p2}, Liv1;->f(Landroid/os/Parcel;)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {p0, p1, v3}, Lxy2;->n3(Ljava/lang/String;Lda2;)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 161
    .line 162
    .line 163
    goto/16 :goto_7

    .line 164
    .line 165
    :pswitch_4
    sget-object p1, Lfa2;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 166
    .line 167
    invoke-static {p2, p1}, Liv1;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 168
    .line 169
    .line 170
    move-result-object p1

    .line 171
    check-cast p1, Lfa2;

    .line 172
    .line 173
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 174
    .line 175
    .line 176
    move-result-object v1

    .line 177
    if-nez v1, :cond_5

    .line 178
    .line 179
    goto :goto_3

    .line 180
    :cond_5
    invoke-interface {v1, v2}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 181
    .line 182
    .line 183
    move-result-object v2

    .line 184
    instance-of v3, v2, Lda2;

    .line 185
    .line 186
    if-eqz v3, :cond_6

    .line 187
    .line 188
    move-object v3, v2

    .line 189
    check-cast v3, Lda2;

    .line 190
    .line 191
    goto :goto_3

    .line 192
    :cond_6
    new-instance v3, Lz92;

    .line 193
    .line 194
    invoke-direct {v3, v1}, Lz92;-><init>(Landroid/os/IBinder;)V

    .line 195
    .line 196
    .line 197
    :goto_3
    invoke-static {p2}, Liv1;->f(Landroid/os/Parcel;)V

    .line 198
    .line 199
    .line 200
    invoke-virtual {p0, p1, v3}, Lxy2;->Q2(Lfa2;Lda2;)V

    .line 201
    .line 202
    .line 203
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 204
    .line 205
    .line 206
    goto/16 :goto_7

    .line 207
    .line 208
    :pswitch_5
    sget-object p1, Lfa2;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 209
    .line 210
    invoke-static {p2, p1}, Liv1;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 211
    .line 212
    .line 213
    move-result-object p1

    .line 214
    check-cast p1, Lfa2;

    .line 215
    .line 216
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 217
    .line 218
    .line 219
    move-result-object v1

    .line 220
    if-nez v1, :cond_7

    .line 221
    .line 222
    goto :goto_4

    .line 223
    :cond_7
    invoke-interface {v1, v2}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 224
    .line 225
    .line 226
    move-result-object v2

    .line 227
    instance-of v3, v2, Lda2;

    .line 228
    .line 229
    if-eqz v3, :cond_8

    .line 230
    .line 231
    move-object v3, v2

    .line 232
    check-cast v3, Lda2;

    .line 233
    .line 234
    goto :goto_4

    .line 235
    :cond_8
    new-instance v3, Lz92;

    .line 236
    .line 237
    invoke-direct {v3, v1}, Lz92;-><init>(Landroid/os/IBinder;)V

    .line 238
    .line 239
    .line 240
    :goto_4
    invoke-static {p2}, Liv1;->f(Landroid/os/Parcel;)V

    .line 241
    .line 242
    .line 243
    invoke-virtual {p0, p1, v3}, Lxy2;->x0(Lfa2;Lda2;)V

    .line 244
    .line 245
    .line 246
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 247
    .line 248
    .line 249
    goto :goto_7

    .line 250
    :pswitch_6
    sget-object p1, Lfa2;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 251
    .line 252
    invoke-static {p2, p1}, Liv1;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 253
    .line 254
    .line 255
    move-result-object p1

    .line 256
    check-cast p1, Lfa2;

    .line 257
    .line 258
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 259
    .line 260
    .line 261
    move-result-object v1

    .line 262
    if-nez v1, :cond_9

    .line 263
    .line 264
    goto :goto_5

    .line 265
    :cond_9
    invoke-interface {v1, v2}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 266
    .line 267
    .line 268
    move-result-object v2

    .line 269
    instance-of v3, v2, Lda2;

    .line 270
    .line 271
    if-eqz v3, :cond_a

    .line 272
    .line 273
    move-object v3, v2

    .line 274
    check-cast v3, Lda2;

    .line 275
    .line 276
    goto :goto_5

    .line 277
    :cond_a
    new-instance v3, Lz92;

    .line 278
    .line 279
    invoke-direct {v3, v1}, Lz92;-><init>(Landroid/os/IBinder;)V

    .line 280
    .line 281
    .line 282
    :goto_5
    invoke-static {p2}, Liv1;->f(Landroid/os/Parcel;)V

    .line 283
    .line 284
    .line 285
    invoke-virtual {p0, p1, v3}, Lxy2;->k1(Lfa2;Lda2;)V

    .line 286
    .line 287
    .line 288
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 289
    .line 290
    .line 291
    goto :goto_7

    .line 292
    :pswitch_7
    sget-object p1, Lu92;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 293
    .line 294
    invoke-static {p2, p1}, Liv1;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 295
    .line 296
    .line 297
    move-result-object p1

    .line 298
    check-cast p1, Lu92;

    .line 299
    .line 300
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 301
    .line 302
    .line 303
    move-result-object p1

    .line 304
    if-nez p1, :cond_b

    .line 305
    .line 306
    goto :goto_6

    .line 307
    :cond_b
    const-string v1, "com.google.android.gms.ads.internal.request.IAdResponseListener"

    .line 308
    .line 309
    invoke-interface {p1, v1}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 310
    .line 311
    .line 312
    :goto_6
    invoke-static {p2}, Liv1;->f(Landroid/os/Parcel;)V

    .line 313
    .line 314
    .line 315
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 316
    .line 317
    .line 318
    goto :goto_7

    .line 319
    :pswitch_8
    sget-object p1, Lu92;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 320
    .line 321
    invoke-static {p2, p1}, Liv1;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 322
    .line 323
    .line 324
    move-result-object p1

    .line 325
    check-cast p1, Lu92;

    .line 326
    .line 327
    invoke-static {p2}, Liv1;->f(Landroid/os/Parcel;)V

    .line 328
    .line 329
    .line 330
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 331
    .line 332
    .line 333
    invoke-virtual {p3, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 334
    .line 335
    .line 336
    :goto_7
    return v0

    .line 337
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_8
        :pswitch_7
        :pswitch_0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public final B3(Lfa2;I)Lq93;
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    sget-object v7, Lgz1;->f:Lgz1;

    .line 6
    .line 7
    sget-object v1, Lhg4;->C:Lhg4;

    .line 8
    .line 9
    iget-object v1, v1, Lhg4;->r:Lp21;

    .line 10
    .line 11
    invoke-static {}, Le51;->a()Le51;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    iget-object v4, v0, Lxy2;->k:Lea3;

    .line 16
    .line 17
    iget-object v5, v0, Lxy2;->f:Landroid/content/Context;

    .line 18
    .line 19
    invoke-virtual {v1, v5, v3, v4}, Lp21;->z(Landroid/content/Context;Le51;Lea3;)Li62;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    iget-object v3, v0, Lxy2;->i:Lth2;

    .line 24
    .line 25
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    new-instance v4, Lt3;

    .line 29
    .line 30
    const/16 v6, 0xd

    .line 31
    .line 32
    move/from16 v8, p2

    .line 33
    .line 34
    invoke-direct {v4, v2, v8, v6}, Lt3;-><init>(Ljava/lang/Object;II)V

    .line 35
    .line 36
    .line 37
    new-instance v6, Lp21;

    .line 38
    .line 39
    iget-object v3, v3, Lth2;->b:Lth2;

    .line 40
    .line 41
    invoke-direct {v6, v3, v4}, Lp21;-><init>(Lth2;Lt3;)V

    .line 42
    .line 43
    .line 44
    sget-object v3, Lty2;->d:Ltv2;

    .line 45
    .line 46
    sget-object v4, Lh62;->c:Lts0;

    .line 47
    .line 48
    const-string v8, "google.afma.response.normalize"

    .line 49
    .line 50
    invoke-virtual {v1, v8, v3, v4}, Li62;->a(Ljava/lang/String;Lg62;Lf62;)Lk62;

    .line 51
    .line 52
    .line 53
    move-result-object v8

    .line 54
    sget-object v3, Ld12;->a:Lso1;

    .line 55
    .line 56
    invoke-virtual {v3}, Lso1;->w()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    check-cast v3, Ljava/lang/Boolean;

    .line 61
    .line 62
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    const/4 v4, 0x0

    .line 67
    if-nez v3, :cond_1

    .line 68
    .line 69
    iget-object v3, v2, Lfa2;->o:Ljava/lang/String;

    .line 70
    .line 71
    if-eqz v3, :cond_0

    .line 72
    .line 73
    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    .line 74
    .line 75
    .line 76
    move-result v3

    .line 77
    if-nez v3, :cond_0

    .line 78
    .line 79
    const-string v3, "Request contained a PoolKey but split request is disabled."

    .line 80
    .line 81
    invoke-static {v3}, Lgi2;->G(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    :cond_0
    move-object v3, v4

    .line 85
    goto :goto_0

    .line 86
    :cond_1
    iget-object v3, v2, Lfa2;->m:Ljava/lang/String;

    .line 87
    .line 88
    invoke-virtual {v0, v3}, Lxy2;->H3(Ljava/lang/String;)Lsy2;

    .line 89
    .line 90
    .line 91
    move-result-object v3

    .line 92
    if-nez v3, :cond_2

    .line 93
    .line 94
    const-string v9, "Request contained a PoolKey but no matching parameters were found."

    .line 95
    .line 96
    invoke-static {v9}, Lgi2;->G(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    :cond_2
    :goto_0
    const/16 v9, 0x9

    .line 100
    .line 101
    if-nez v3, :cond_3

    .line 102
    .line 103
    invoke-static {v5, v9}, Laa3;->l(Landroid/content/Context;I)Laa3;

    .line 104
    .line 105
    .line 106
    move-result-object v10

    .line 107
    goto :goto_1

    .line 108
    :cond_3
    iget-object v10, v3, Lsy2;->d:Laa3;

    .line 109
    .line 110
    :goto_1
    iget-object v11, v6, Lp21;->h:Ljava/lang/Object;

    .line 111
    .line 112
    check-cast v11, Lba4;

    .line 113
    .line 114
    invoke-virtual {v11}, Lba4;->d()Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v11

    .line 118
    check-cast v11, Lda3;

    .line 119
    .line 120
    iget-object v12, v2, Lfa2;->f:Landroid/os/Bundle;

    .line 121
    .line 122
    const-string v13, "ad_types"

    .line 123
    .line 124
    invoke-virtual {v12, v13}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 125
    .line 126
    .line 127
    move-result-object v12

    .line 128
    invoke-virtual {v11, v12}, Lda3;->b(Ljava/util/ArrayList;)V

    .line 129
    .line 130
    .line 131
    new-instance v12, Lbz2;

    .line 132
    .line 133
    iget-object v13, v2, Lfa2;->l:Ljava/lang/String;

    .line 134
    .line 135
    invoke-direct {v12, v13, v11, v10}, Lbz2;-><init>(Ljava/lang/String;Lda3;Laa3;)V

    .line 136
    .line 137
    .line 138
    iget-object v13, v2, Lfa2;->g:Le51;

    .line 139
    .line 140
    iget-object v13, v13, Le51;->f:Ljava/lang/String;

    .line 141
    .line 142
    new-instance v14, Lxb4;

    .line 143
    .line 144
    const/16 v15, 0x19

    .line 145
    .line 146
    invoke-direct {v14, v5, v13, v4, v15}, Lxb4;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 147
    .line 148
    .line 149
    iget-object v4, v6, Lp21;->i:Ljava/lang/Object;

    .line 150
    .line 151
    check-cast v4, Lba4;

    .line 152
    .line 153
    invoke-virtual {v4}, Lba4;->d()Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v4

    .line 157
    check-cast v4, Lu93;

    .line 158
    .line 159
    const/16 v13, 0xb

    .line 160
    .line 161
    invoke-static {v5, v13}, Laa3;->l(Landroid/content/Context;I)Laa3;

    .line 162
    .line 163
    .line 164
    move-result-object v13

    .line 165
    sget-object v24, Ls93;->n:Ls93;

    .line 166
    .line 167
    sget-object v18, Ls93;->m:Ls93;

    .line 168
    .line 169
    const/16 v25, 0x1

    .line 170
    .line 171
    if-nez v3, :cond_4

    .line 172
    .line 173
    new-instance v3, Lz02;

    .line 174
    .line 175
    invoke-direct {v3, v6, v2, v9}, Lz02;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 176
    .line 177
    .line 178
    sget-object v6, Ltv2;->h:Ltv2;

    .line 179
    .line 180
    iget-object v9, v2, Lfa2;->f:Landroid/os/Bundle;

    .line 181
    .line 182
    invoke-static {v9}, Lpu1;->r(Ljava/lang/Object;)Llq3;

    .line 183
    .line 184
    .line 185
    move-result-object v9

    .line 186
    const/16 v26, 0x0

    .line 187
    .line 188
    sget-object v15, Ls93;->k:Ls93;

    .line 189
    .line 190
    invoke-virtual {v4, v9, v15}, Lu93;->a(Ln70;Ljava/lang/Object;)Lbu1;

    .line 191
    .line 192
    .line 193
    move-result-object v9

    .line 194
    iget-object v15, v4, Lu93;->a:Lpq3;

    .line 195
    .line 196
    invoke-virtual {v9, v3}, Lbu1;->s(Lyp3;)Lbu1;

    .line 197
    .line 198
    .line 199
    move-result-object v3

    .line 200
    invoke-virtual {v3, v6}, Lbu1;->q(Lo93;)Lbu1;

    .line 201
    .line 202
    .line 203
    move-result-object v3

    .line 204
    invoke-virtual {v3}, Lbu1;->A()Lq93;

    .line 205
    .line 206
    .line 207
    move-result-object v3

    .line 208
    invoke-static {v3, v4, v1, v11, v10}, Lxy2;->F3(Lq93;Lu93;Li62;Lda3;Laa3;)Lq93;

    .line 209
    .line 210
    .line 211
    move-result-object v1

    .line 212
    const/16 v6, 0xa

    .line 213
    .line 214
    invoke-static {v5, v6}, Laa3;->l(Landroid/content/Context;I)Laa3;

    .line 215
    .line 216
    .line 217
    move-result-object v5

    .line 218
    const/4 v6, 0x2

    .line 219
    new-array v9, v6, [Ln70;

    .line 220
    .line 221
    aput-object v1, v9, v26

    .line 222
    .line 223
    aput-object v3, v9, v25

    .line 224
    .line 225
    invoke-static {v9}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 226
    .line 227
    .line 228
    move-result-object v21

    .line 229
    new-instance v6, Lyi1;

    .line 230
    .line 231
    const/4 v9, 0x4

    .line 232
    invoke-direct {v6, v1, v2, v3, v9}, Lyi1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 233
    .line 234
    .line 235
    sget-object v9, Lxm3;->g:Lvm3;

    .line 236
    .line 237
    invoke-virtual/range {v21 .. v21}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 238
    .line 239
    .line 240
    invoke-static/range {v21 .. v21}, Lxm3;->m(Ljava/util/Collection;)Lxm3;

    .line 241
    .line 242
    .line 243
    move-result-object v9

    .line 244
    sget-object v10, Lmd2;->g:Lld2;

    .line 245
    .line 246
    new-instance v0, Lcq3;

    .line 247
    .line 248
    move-object/from16 v27, v1

    .line 249
    .line 250
    move/from16 v1, v25

    .line 251
    .line 252
    move/from16 v2, v26

    .line 253
    .line 254
    invoke-direct {v0, v9, v1, v2}, Ltp3;-><init>(Ltm3;ZZ)V

    .line 255
    .line 256
    .line 257
    new-instance v1, Lbq3;

    .line 258
    .line 259
    invoke-direct {v1, v0, v7, v10}, Lbq3;-><init>(Lcq3;Ljava/util/concurrent/Callable;Ljava/util/concurrent/Executor;)V

    .line 260
    .line 261
    .line 262
    iput-object v1, v0, Lcq3;->u:Lbq3;

    .line 263
    .line 264
    invoke-virtual {v0}, Ltp3;->v()V

    .line 265
    .line 266
    .line 267
    new-instance v16, Lbu1;

    .line 268
    .line 269
    new-instance v1, Lcq3;

    .line 270
    .line 271
    const/4 v10, 0x1

    .line 272
    invoke-direct {v1, v9, v10, v2}, Ltp3;-><init>(Ltm3;ZZ)V

    .line 273
    .line 274
    .line 275
    new-instance v2, Lbq3;

    .line 276
    .line 277
    invoke-direct {v2, v1, v6, v15}, Lbq3;-><init>(Lcq3;Ljava/util/concurrent/Callable;Ljava/util/concurrent/Executor;)V

    .line 278
    .line 279
    .line 280
    iput-object v2, v1, Lcq3;->u:Lbq3;

    .line 281
    .line 282
    invoke-virtual {v1}, Ltp3;->v()V

    .line 283
    .line 284
    .line 285
    const/16 v19, 0x0

    .line 286
    .line 287
    move-object/from16 v20, v0

    .line 288
    .line 289
    move-object/from16 v22, v1

    .line 290
    .line 291
    move-object/from16 v17, v4

    .line 292
    .line 293
    invoke-direct/range {v16 .. v22}, Lbu1;-><init>(Lu93;Ljava/lang/Object;Ljava/lang/String;Ln70;Ljava/util/List;Ln70;)V

    .line 294
    .line 295
    .line 296
    move-object/from16 v0, v16

    .line 297
    .line 298
    invoke-virtual {v0, v12}, Lbu1;->q(Lo93;)Lbu1;

    .line 299
    .line 300
    .line 301
    move-result-object v0

    .line 302
    new-instance v1, Lof3;

    .line 303
    .line 304
    const/16 v2, 0x19

    .line 305
    .line 306
    invoke-direct {v1, v2, v5}, Lof3;-><init>(ILjava/lang/Object;)V

    .line 307
    .line 308
    .line 309
    invoke-virtual {v0, v1}, Lbu1;->q(Lo93;)Lbu1;

    .line 310
    .line 311
    .line 312
    move-result-object v0

    .line 313
    invoke-virtual {v0, v14}, Lbu1;->q(Lo93;)Lbu1;

    .line 314
    .line 315
    .line 316
    move-result-object v0

    .line 317
    invoke-virtual {v0}, Lbu1;->A()Lq93;

    .line 318
    .line 319
    .line 320
    move-result-object v0

    .line 321
    const/4 v2, 0x0

    .line 322
    invoke-static {v0, v11, v5, v2}, Lqb1;->P(Ln70;Lda3;Laa3;Z)V

    .line 323
    .line 324
    .line 325
    invoke-static {v0, v13}, Lqb1;->C(Ln70;Laa3;)V

    .line 326
    .line 327
    .line 328
    const/4 v1, 0x3

    .line 329
    new-array v1, v1, [Ln70;

    .line 330
    .line 331
    aput-object v3, v1, v2

    .line 332
    .line 333
    const/4 v10, 0x1

    .line 334
    aput-object v27, v1, v10

    .line 335
    .line 336
    const/16 v23, 0x2

    .line 337
    .line 338
    aput-object v0, v1, v23

    .line 339
    .line 340
    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 341
    .line 342
    .line 343
    move-result-object v21

    .line 344
    new-instance v1, Lbt2;

    .line 345
    .line 346
    const/4 v6, 0x1

    .line 347
    move-object/from16 v2, p1

    .line 348
    .line 349
    move-object v4, v3

    .line 350
    move-object/from16 v5, v27

    .line 351
    .line 352
    move-object v3, v0

    .line 353
    invoke-direct/range {v1 .. v6}, Lbt2;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 354
    .line 355
    .line 356
    sget-object v0, Lxm3;->g:Lvm3;

    .line 357
    .line 358
    invoke-virtual/range {v21 .. v21}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 359
    .line 360
    .line 361
    invoke-static/range {v21 .. v21}, Lxm3;->m(Ljava/util/Collection;)Lxm3;

    .line 362
    .line 363
    .line 364
    move-result-object v0

    .line 365
    sget-object v2, Lmd2;->g:Lld2;

    .line 366
    .line 367
    new-instance v3, Lcq3;

    .line 368
    .line 369
    const/4 v4, 0x0

    .line 370
    invoke-direct {v3, v0, v10, v4}, Ltp3;-><init>(Ltm3;ZZ)V

    .line 371
    .line 372
    .line 373
    new-instance v5, Lbq3;

    .line 374
    .line 375
    invoke-direct {v5, v3, v7, v2}, Lbq3;-><init>(Lcq3;Ljava/util/concurrent/Callable;Ljava/util/concurrent/Executor;)V

    .line 376
    .line 377
    .line 378
    iput-object v5, v3, Lcq3;->u:Lbq3;

    .line 379
    .line 380
    invoke-virtual {v3}, Ltp3;->v()V

    .line 381
    .line 382
    .line 383
    new-instance v16, Lbu1;

    .line 384
    .line 385
    new-instance v2, Lcq3;

    .line 386
    .line 387
    invoke-direct {v2, v0, v10, v4}, Ltp3;-><init>(Ltm3;ZZ)V

    .line 388
    .line 389
    .line 390
    new-instance v0, Lbq3;

    .line 391
    .line 392
    invoke-direct {v0, v2, v1, v15}, Lbq3;-><init>(Lcq3;Ljava/util/concurrent/Callable;Ljava/util/concurrent/Executor;)V

    .line 393
    .line 394
    .line 395
    iput-object v0, v2, Lcq3;->u:Lbq3;

    .line 396
    .line 397
    invoke-virtual {v2}, Ltp3;->v()V

    .line 398
    .line 399
    .line 400
    move-object/from16 v22, v2

    .line 401
    .line 402
    move-object/from16 v20, v3

    .line 403
    .line 404
    move-object/from16 v18, v24

    .line 405
    .line 406
    invoke-direct/range {v16 .. v22}, Lbu1;-><init>(Lu93;Ljava/lang/Object;Ljava/lang/String;Ln70;Ljava/util/List;Ln70;)V

    .line 407
    .line 408
    .line 409
    move-object/from16 v0, v16

    .line 410
    .line 411
    invoke-virtual {v0, v8}, Lbu1;->s(Lyp3;)Lbu1;

    .line 412
    .line 413
    .line 414
    move-result-object v0

    .line 415
    invoke-virtual {v0}, Lbu1;->A()Lq93;

    .line 416
    .line 417
    .line 418
    move-result-object v0

    .line 419
    const/4 v1, 0x0

    .line 420
    goto/16 :goto_2

    .line 421
    .line 422
    :cond_4
    move-object/from16 v0, v18

    .line 423
    .line 424
    move-object/from16 v18, v24

    .line 425
    .line 426
    iget-object v1, v3, Lsy2;->a:Lga2;

    .line 427
    .line 428
    iget-object v2, v3, Lsy2;->b:Lorg/json/JSONObject;

    .line 429
    .line 430
    new-instance v6, Laz2;

    .line 431
    .line 432
    invoke-direct {v6, v2, v1}, Laz2;-><init>(Lorg/json/JSONObject;Lga2;)V

    .line 433
    .line 434
    .line 435
    const/16 v1, 0xa

    .line 436
    .line 437
    invoke-static {v5, v1}, Laa3;->l(Landroid/content/Context;I)Laa3;

    .line 438
    .line 439
    .line 440
    move-result-object v2

    .line 441
    invoke-static {v6}, Lpu1;->r(Ljava/lang/Object;)Llq3;

    .line 442
    .line 443
    .line 444
    move-result-object v1

    .line 445
    invoke-virtual {v4, v1, v0}, Lu93;->a(Ln70;Ljava/lang/Object;)Lbu1;

    .line 446
    .line 447
    .line 448
    move-result-object v0

    .line 449
    invoke-virtual {v0, v12}, Lbu1;->q(Lo93;)Lbu1;

    .line 450
    .line 451
    .line 452
    move-result-object v0

    .line 453
    new-instance v1, Lof3;

    .line 454
    .line 455
    const/16 v5, 0x19

    .line 456
    .line 457
    invoke-direct {v1, v5, v2}, Lof3;-><init>(ILjava/lang/Object;)V

    .line 458
    .line 459
    .line 460
    invoke-virtual {v0, v1}, Lbu1;->q(Lo93;)Lbu1;

    .line 461
    .line 462
    .line 463
    move-result-object v0

    .line 464
    invoke-virtual {v0, v14}, Lbu1;->q(Lo93;)Lbu1;

    .line 465
    .line 466
    .line 467
    move-result-object v0

    .line 468
    invoke-virtual {v0}, Lbu1;->A()Lq93;

    .line 469
    .line 470
    .line 471
    move-result-object v0

    .line 472
    const/4 v1, 0x0

    .line 473
    invoke-static {v0, v11, v2, v1}, Lqb1;->P(Ln70;Lda3;Laa3;Z)V

    .line 474
    .line 475
    .line 476
    invoke-static {v3}, Lpu1;->r(Ljava/lang/Object;)Llq3;

    .line 477
    .line 478
    .line 479
    move-result-object v2

    .line 480
    invoke-static {v0, v13}, Lqb1;->C(Ln70;Laa3;)V

    .line 481
    .line 482
    .line 483
    const/4 v6, 0x2

    .line 484
    new-array v3, v6, [Ln70;

    .line 485
    .line 486
    aput-object v0, v3, v1

    .line 487
    .line 488
    const/4 v10, 0x1

    .line 489
    aput-object v2, v3, v10

    .line 490
    .line 491
    invoke-static {v3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 492
    .line 493
    .line 494
    move-result-object v21

    .line 495
    new-instance v3, Lgs1;

    .line 496
    .line 497
    const/16 v6, 0xa

    .line 498
    .line 499
    invoke-direct {v3, v0, v2, v6}, Lgs1;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 500
    .line 501
    .line 502
    sget-object v0, Lxm3;->g:Lvm3;

    .line 503
    .line 504
    invoke-virtual/range {v21 .. v21}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 505
    .line 506
    .line 507
    invoke-static/range {v21 .. v21}, Lxm3;->m(Ljava/util/Collection;)Lxm3;

    .line 508
    .line 509
    .line 510
    move-result-object v0

    .line 511
    sget-object v2, Lmd2;->g:Lld2;

    .line 512
    .line 513
    new-instance v5, Lcq3;

    .line 514
    .line 515
    invoke-direct {v5, v0, v10, v1}, Ltp3;-><init>(Ltm3;ZZ)V

    .line 516
    .line 517
    .line 518
    new-instance v6, Lbq3;

    .line 519
    .line 520
    invoke-direct {v6, v5, v7, v2}, Lbq3;-><init>(Lcq3;Ljava/util/concurrent/Callable;Ljava/util/concurrent/Executor;)V

    .line 521
    .line 522
    .line 523
    iput-object v6, v5, Lcq3;->u:Lbq3;

    .line 524
    .line 525
    invoke-virtual {v5}, Ltp3;->v()V

    .line 526
    .line 527
    .line 528
    new-instance v16, Lbu1;

    .line 529
    .line 530
    iget-object v2, v4, Lu93;->a:Lpq3;

    .line 531
    .line 532
    new-instance v6, Lcq3;

    .line 533
    .line 534
    invoke-direct {v6, v0, v10, v1}, Ltp3;-><init>(Ltm3;ZZ)V

    .line 535
    .line 536
    .line 537
    new-instance v0, Lbq3;

    .line 538
    .line 539
    invoke-direct {v0, v6, v3, v2}, Lbq3;-><init>(Lcq3;Ljava/util/concurrent/Callable;Ljava/util/concurrent/Executor;)V

    .line 540
    .line 541
    .line 542
    iput-object v0, v6, Lcq3;->u:Lbq3;

    .line 543
    .line 544
    invoke-virtual {v6}, Ltp3;->v()V

    .line 545
    .line 546
    .line 547
    const/16 v19, 0x0

    .line 548
    .line 549
    move-object/from16 v17, v4

    .line 550
    .line 551
    move-object/from16 v20, v5

    .line 552
    .line 553
    move-object/from16 v22, v6

    .line 554
    .line 555
    invoke-direct/range {v16 .. v22}, Lbu1;-><init>(Lu93;Ljava/lang/Object;Ljava/lang/String;Ln70;Ljava/util/List;Ln70;)V

    .line 556
    .line 557
    .line 558
    move-object/from16 v0, v16

    .line 559
    .line 560
    invoke-virtual {v0, v8}, Lbu1;->s(Lyp3;)Lbu1;

    .line 561
    .line 562
    .line 563
    move-result-object v0

    .line 564
    invoke-virtual {v0}, Lbu1;->A()Lq93;

    .line 565
    .line 566
    .line 567
    move-result-object v0

    .line 568
    :goto_2
    invoke-static {v0, v11, v13, v1}, Lqb1;->P(Ln70;Lda3;Laa3;Z)V

    .line 569
    .line 570
    .line 571
    return-object v0
.end method

.method public final C3(Lfa2;I)Ln70;
    .locals 11

    .line 1
    sget-object v0, Ld12;->a:Lso1;

    .line 2
    .line 3
    invoke-virtual {v0}, Lso1;->w()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    new-instance p1, Ljava/lang/Exception;

    .line 16
    .line 17
    const-string p2, "Split request is disabled."

    .line 18
    .line 19
    invoke-direct {p1, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-static {p1}, Lpu1;->B(Ljava/lang/Throwable;)Lkq3;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    return-object p1

    .line 27
    :cond_0
    iget-object v0, p1, Lfa2;->n:Ld93;

    .line 28
    .line 29
    if-nez v0, :cond_1

    .line 30
    .line 31
    new-instance p1, Ljava/lang/Exception;

    .line 32
    .line 33
    const-string p2, "Pool configuration missing from request."

    .line 34
    .line 35
    invoke-direct {p1, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    invoke-static {p1}, Lpu1;->B(Ljava/lang/Throwable;)Lkq3;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    return-object p1

    .line 43
    :cond_1
    iget v1, v0, Ld93;->i:I

    .line 44
    .line 45
    if-eqz v1, :cond_3

    .line 46
    .line 47
    iget v0, v0, Ld93;->j:I

    .line 48
    .line 49
    if-nez v0, :cond_2

    .line 50
    .line 51
    goto/16 :goto_0

    .line 52
    .line 53
    :cond_2
    sget-object v0, Lhg4;->C:Lhg4;

    .line 54
    .line 55
    iget-object v0, v0, Lhg4;->r:Lp21;

    .line 56
    .line 57
    invoke-static {}, Le51;->a()Le51;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    iget-object v2, p0, Lxy2;->f:Landroid/content/Context;

    .line 62
    .line 63
    iget-object v3, p0, Lxy2;->k:Lea3;

    .line 64
    .line 65
    invoke-virtual {v0, v2, v1, v3}, Lp21;->z(Landroid/content/Context;Le51;Lea3;)Li62;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    iget-object v1, p0, Lxy2;->i:Lth2;

    .line 70
    .line 71
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    new-instance v3, Lt3;

    .line 75
    .line 76
    const/16 v4, 0xd

    .line 77
    .line 78
    invoke-direct {v3, p1, p2, v4}, Lt3;-><init>(Ljava/lang/Object;II)V

    .line 79
    .line 80
    .line 81
    new-instance p2, Lp21;

    .line 82
    .line 83
    iget-object v1, v1, Lth2;->b:Lth2;

    .line 84
    .line 85
    invoke-direct {p2, v1, v3}, Lp21;-><init>(Lth2;Lt3;)V

    .line 86
    .line 87
    .line 88
    iget-object v1, p2, Lp21;->i:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v1, Lba4;

    .line 91
    .line 92
    invoke-virtual {v1}, Lba4;->d()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    move-object v4, v1

    .line 97
    check-cast v4, Lu93;

    .line 98
    .line 99
    new-instance v1, Lz02;

    .line 100
    .line 101
    const/16 v3, 0x9

    .line 102
    .line 103
    invoke-direct {v1, p2, p1, v3}, Lz02;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 104
    .line 105
    .line 106
    sget-object v5, Ltv2;->h:Ltv2;

    .line 107
    .line 108
    iget-object v6, p1, Lfa2;->f:Landroid/os/Bundle;

    .line 109
    .line 110
    invoke-static {v6}, Lpu1;->r(Ljava/lang/Object;)Llq3;

    .line 111
    .line 112
    .line 113
    move-result-object v6

    .line 114
    sget-object v7, Ls93;->k:Ls93;

    .line 115
    .line 116
    invoke-virtual {v4, v6, v7}, Lu93;->a(Ln70;Ljava/lang/Object;)Lbu1;

    .line 117
    .line 118
    .line 119
    move-result-object v6

    .line 120
    invoke-virtual {v6, v1}, Lbu1;->s(Lyp3;)Lbu1;

    .line 121
    .line 122
    .line 123
    move-result-object v1

    .line 124
    invoke-virtual {v1, v5}, Lbu1;->q(Lo93;)Lbu1;

    .line 125
    .line 126
    .line 127
    move-result-object v1

    .line 128
    invoke-virtual {v1}, Lbu1;->A()Lq93;

    .line 129
    .line 130
    .line 131
    move-result-object v8

    .line 132
    iget-object p2, p2, Lp21;->h:Ljava/lang/Object;

    .line 133
    .line 134
    check-cast p2, Lba4;

    .line 135
    .line 136
    invoke-virtual {p2}, Lba4;->d()Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object p2

    .line 140
    check-cast p2, Lda3;

    .line 141
    .line 142
    invoke-static {v2, v3}, Laa3;->l(Landroid/content/Context;I)Laa3;

    .line 143
    .line 144
    .line 145
    move-result-object v10

    .line 146
    invoke-static {v8, v4, v0, p2, v10}, Lxy2;->F3(Lq93;Lu93;Li62;Lda3;Laa3;)Lq93;

    .line 147
    .line 148
    .line 149
    move-result-object v7

    .line 150
    const/4 p2, 0x2

    .line 151
    new-array p2, p2, [Ln70;

    .line 152
    .line 153
    const/4 v0, 0x0

    .line 154
    aput-object v8, p2, v0

    .line 155
    .line 156
    const/4 v1, 0x1

    .line 157
    aput-object v7, p2, v1

    .line 158
    .line 159
    invoke-static {p2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 160
    .line 161
    .line 162
    move-result-object p2

    .line 163
    new-instance v5, Lry2;

    .line 164
    .line 165
    move-object v6, p0

    .line 166
    move-object v9, p1

    .line 167
    invoke-direct/range {v5 .. v10}, Lry2;-><init>(Lxy2;Lq93;Lq93;Lfa2;Laa3;)V

    .line 168
    .line 169
    .line 170
    sget-object p1, Lxm3;->g:Lvm3;

    .line 171
    .line 172
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 173
    .line 174
    .line 175
    invoke-static {p2}, Lxm3;->m(Ljava/util/Collection;)Lxm3;

    .line 176
    .line 177
    .line 178
    move-result-object p1

    .line 179
    sget-object v2, Lgz1;->f:Lgz1;

    .line 180
    .line 181
    sget-object v3, Lmd2;->g:Lld2;

    .line 182
    .line 183
    new-instance v7, Lcq3;

    .line 184
    .line 185
    invoke-direct {v7, p1, v1, v0}, Ltp3;-><init>(Ltm3;ZZ)V

    .line 186
    .line 187
    .line 188
    new-instance v6, Lbq3;

    .line 189
    .line 190
    invoke-direct {v6, v7, v2, v3}, Lbq3;-><init>(Lcq3;Ljava/util/concurrent/Callable;Ljava/util/concurrent/Executor;)V

    .line 191
    .line 192
    .line 193
    iput-object v6, v7, Lcq3;->u:Lbq3;

    .line 194
    .line 195
    invoke-virtual {v7}, Ltp3;->v()V

    .line 196
    .line 197
    .line 198
    new-instance v3, Lbu1;

    .line 199
    .line 200
    iget-object v2, v4, Lu93;->a:Lpq3;

    .line 201
    .line 202
    new-instance v9, Lcq3;

    .line 203
    .line 204
    invoke-direct {v9, p1, v1, v0}, Ltp3;-><init>(Ltm3;ZZ)V

    .line 205
    .line 206
    .line 207
    new-instance p1, Lbq3;

    .line 208
    .line 209
    invoke-direct {p1, v9, v5, v2}, Lbq3;-><init>(Lcq3;Ljava/util/concurrent/Callable;Ljava/util/concurrent/Executor;)V

    .line 210
    .line 211
    .line 212
    iput-object p1, v9, Lcq3;->u:Lbq3;

    .line 213
    .line 214
    invoke-virtual {v9}, Ltp3;->v()V

    .line 215
    .line 216
    .line 217
    const/4 v6, 0x0

    .line 218
    sget-object v5, Ls93;->B:Ls93;

    .line 219
    .line 220
    move-object v8, p2

    .line 221
    invoke-direct/range {v3 .. v9}, Lbu1;-><init>(Lu93;Ljava/lang/Object;Ljava/lang/String;Ln70;Ljava/util/List;Ln70;)V

    .line 222
    .line 223
    .line 224
    invoke-virtual {v3}, Lbu1;->A()Lq93;

    .line 225
    .line 226
    .line 227
    move-result-object p1

    .line 228
    return-object p1

    .line 229
    :cond_3
    :goto_0
    new-instance p1, Ljava/lang/Exception;

    .line 230
    .line 231
    const-string p2, "Caching is disabled."

    .line 232
    .line 233
    invoke-direct {p1, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 234
    .line 235
    .line 236
    invoke-static {p1}, Lpu1;->B(Ljava/lang/Throwable;)Lkq3;

    .line 237
    .line 238
    .line 239
    move-result-object p1

    .line 240
    return-object p1
.end method

.method public final D3(Ljava/lang/String;)Ln70;
    .locals 2

    .line 1
    sget-object v0, Ld12;->a:Lso1;

    .line 2
    .line 3
    invoke-virtual {v0}, Lso1;->w()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    new-instance p1, Ljava/lang/Exception;

    .line 16
    .line 17
    const-string v0, "Split request is disabled."

    .line 18
    .line 19
    invoke-direct {p1, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-static {p1}, Lpu1;->B(Ljava/lang/Throwable;)Lkq3;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    return-object p1

    .line 27
    :cond_0
    new-instance v0, Lqy2;

    .line 28
    .line 29
    invoke-direct {v0}, Ljava/io/InputStream;-><init>()V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0, p1}, Lxy2;->H3(Ljava/lang/String;)Lsy2;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    if-nez v1, :cond_1

    .line 37
    .line 38
    new-instance v0, Ljava/lang/Exception;

    .line 39
    .line 40
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    const-string v1, "URL to be removed not found for cache key: "

    .line 45
    .line 46
    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-direct {v0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    invoke-static {v0}, Lpu1;->B(Ljava/lang/Throwable;)Lkq3;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    return-object p1

    .line 58
    :cond_1
    invoke-static {v0}, Lpu1;->r(Ljava/lang/Object;)Llq3;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    return-object p1
.end method

.method public final E3(Lfa2;I)Ln70;
    .locals 29

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    sget-object v2, Lhg4;->C:Lhg4;

    .line 6
    .line 7
    iget-object v2, v2, Lhg4;->r:Lp21;

    .line 8
    .line 9
    invoke-static {}, Le51;->a()Le51;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    iget-object v4, v0, Lxy2;->k:Lea3;

    .line 14
    .line 15
    iget-object v5, v0, Lxy2;->f:Landroid/content/Context;

    .line 16
    .line 17
    invoke-virtual {v2, v5, v3, v4}, Lp21;->z(Landroid/content/Context;Le51;Lea3;)Li62;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    sget-object v3, Li12;->a:Lso1;

    .line 22
    .line 23
    invoke-virtual {v3}, Lso1;->w()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    check-cast v3, Ljava/lang/Boolean;

    .line 28
    .line 29
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    if-nez v3, :cond_0

    .line 34
    .line 35
    new-instance v1, Ljava/lang/Exception;

    .line 36
    .line 37
    const-string v2, "Signal collection disabled."

    .line 38
    .line 39
    invoke-direct {v1, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    invoke-static {v1}, Lpu1;->B(Ljava/lang/Throwable;)Lkq3;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    return-object v1

    .line 47
    :cond_0
    iget-object v3, v0, Lxy2;->i:Lth2;

    .line 48
    .line 49
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    new-instance v4, Lt3;

    .line 53
    .line 54
    const/16 v6, 0xd

    .line 55
    .line 56
    move/from16 v7, p2

    .line 57
    .line 58
    invoke-direct {v4, v1, v7, v6}, Lt3;-><init>(Ljava/lang/Object;II)V

    .line 59
    .line 60
    .line 61
    iget-object v3, v3, Lth2;->b:Lth2;

    .line 62
    .line 63
    iget-object v6, v3, Lth2;->t:Lba4;

    .line 64
    .line 65
    new-instance v7, Lu43;

    .line 66
    .line 67
    const/16 v8, 0x9

    .line 68
    .line 69
    invoke-direct {v7, v6, v8}, Lu43;-><init>(Lga4;I)V

    .line 70
    .line 71
    .line 72
    invoke-static {v7}, Lba4;->a(Lga4;)Lba4;

    .line 73
    .line 74
    .line 75
    move-result-object v6

    .line 76
    new-instance v10, Ln63;

    .line 77
    .line 78
    const/4 v14, 0x1

    .line 79
    invoke-direct {v10, v4, v14}, Ln63;-><init>(Lt3;I)V

    .line 80
    .line 81
    .line 82
    new-instance v11, Ln63;

    .line 83
    .line 84
    const/4 v7, 0x2

    .line 85
    invoke-direct {v11, v4, v7}, Ln63;-><init>(Lt3;I)V

    .line 86
    .line 87
    .line 88
    new-instance v12, Ln63;

    .line 89
    .line 90
    const/4 v7, 0x3

    .line 91
    invoke-direct {v12, v4, v7}, Ln63;-><init>(Lt3;I)V

    .line 92
    .line 93
    .line 94
    iget-object v8, v3, Lth2;->g:Lhh2;

    .line 95
    .line 96
    iget-object v9, v3, Lth2;->d:Lba4;

    .line 97
    .line 98
    new-instance v7, Lic2;

    .line 99
    .line 100
    const/16 v13, 0x11

    .line 101
    .line 102
    invoke-direct/range {v7 .. v13}, Lic2;-><init>(Lga4;Lga4;Lga4;Lga4;Lga4;I)V

    .line 103
    .line 104
    .line 105
    move-object/from16 v17, v12

    .line 106
    .line 107
    new-instance v10, Lu43;

    .line 108
    .line 109
    const/4 v11, 0x5

    .line 110
    invoke-direct {v10, v8, v11}, Lu43;-><init>(Lga4;I)V

    .line 111
    .line 112
    .line 113
    new-instance v12, Ln63;

    .line 114
    .line 115
    const/4 v13, 0x0

    .line 116
    invoke-direct {v12, v4, v13}, Ln63;-><init>(Lt3;I)V

    .line 117
    .line 118
    .line 119
    new-instance v15, Lu12;

    .line 120
    .line 121
    const/16 v14, 0x16

    .line 122
    .line 123
    invoke-direct {v15, v14, v12}, Lu12;-><init>(ILjava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    new-instance v14, Lqk2;

    .line 127
    .line 128
    const/16 v11, 0xa

    .line 129
    .line 130
    invoke-direct {v14, v9, v8, v11}, Lqk2;-><init>(Lga4;Lga4;I)V

    .line 131
    .line 132
    .line 133
    new-instance v8, Lp63;

    .line 134
    .line 135
    invoke-direct {v8, v13}, Lp63;-><init>(I)V

    .line 136
    .line 137
    .line 138
    new-instance v13, Ln63;

    .line 139
    .line 140
    const/4 v11, 0x5

    .line 141
    invoke-direct {v13, v4, v11}, Ln63;-><init>(Lt3;I)V

    .line 142
    .line 143
    .line 144
    new-instance v11, Ln63;

    .line 145
    .line 146
    move-object/from16 v22, v6

    .line 147
    .line 148
    const/4 v6, 0x6

    .line 149
    invoke-direct {v11, v4, v6}, Ln63;-><init>(Lt3;I)V

    .line 150
    .line 151
    .line 152
    iget-object v6, v3, Lth2;->U:Lba4;

    .line 153
    .line 154
    move-object/from16 v16, v15

    .line 155
    .line 156
    new-instance v15, Lar2;

    .line 157
    .line 158
    move-object/from16 v18, v16

    .line 159
    .line 160
    move-object/from16 v16, v6

    .line 161
    .line 162
    move-object/from16 v6, v18

    .line 163
    .line 164
    move-object/from16 v19, v9

    .line 165
    .line 166
    move-object/from16 v21, v11

    .line 167
    .line 168
    move-object/from16 v18, v12

    .line 169
    .line 170
    move-object/from16 v20, v13

    .line 171
    .line 172
    invoke-direct/range {v15 .. v21}, Lar2;-><init>(Lba4;Ln63;Ln63;Lba4;Ln63;Ln63;)V

    .line 173
    .line 174
    .line 175
    move-object/from16 v12, v16

    .line 176
    .line 177
    move-object/from16 v11, v18

    .line 178
    .line 179
    new-instance v13, Lwb2;

    .line 180
    .line 181
    move-object/from16 v16, v6

    .line 182
    .line 183
    const/16 v6, 0x1c

    .line 184
    .line 185
    invoke-direct {v13, v11, v12, v9, v6}, Lwb2;-><init>(Lga4;Lga4;Lga4;I)V

    .line 186
    .line 187
    .line 188
    new-instance v6, Ln63;

    .line 189
    .line 190
    const/4 v9, 0x4

    .line 191
    invoke-direct {v6, v4, v9}, Ln63;-><init>(Lt3;I)V

    .line 192
    .line 193
    .line 194
    sget-object v11, Lqb1;->s:Lzq2;

    .line 195
    .line 196
    invoke-static {v11}, Lba4;->a(Lga4;)Lba4;

    .line 197
    .line 198
    .line 199
    move-result-object v11

    .line 200
    sget-object v12, Lzt0;->l:Lzq2;

    .line 201
    .line 202
    invoke-static {v12}, Lba4;->a(Lga4;)Lba4;

    .line 203
    .line 204
    .line 205
    move-result-object v12

    .line 206
    sget-object v17, Li41;->s:Lzq2;

    .line 207
    .line 208
    move/from16 v18, v9

    .line 209
    .line 210
    invoke-static/range {v17 .. v17}, Lba4;->a(Lga4;)Lba4;

    .line 211
    .line 212
    .line 213
    move-result-object v9

    .line 214
    sget-object v17, Lob1;->m:Lzq2;

    .line 215
    .line 216
    move-object/from16 v19, v7

    .line 217
    .line 218
    invoke-static/range {v17 .. v17}, Lba4;->a(Lga4;)Lba4;

    .line 219
    .line 220
    .line 221
    move-result-object v7

    .line 222
    sget v17, Lea4;->b:I

    .line 223
    .line 224
    move-object/from16 v17, v8

    .line 225
    .line 226
    invoke-static/range {v18 .. v18}, Lqb1;->F(I)Ljava/util/LinkedHashMap;

    .line 227
    .line 228
    .line 229
    move-result-object v8

    .line 230
    move-object/from16 v18, v10

    .line 231
    .line 232
    sget-object v10, Ls93;->k:Ls93;

    .line 233
    .line 234
    invoke-virtual {v8, v10, v11}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    sget-object v10, Ls93;->l:Ls93;

    .line 238
    .line 239
    invoke-virtual {v8, v10, v12}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 240
    .line 241
    .line 242
    sget-object v10, Ls93;->m:Ls93;

    .line 243
    .line 244
    invoke-virtual {v8, v10, v9}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 245
    .line 246
    .line 247
    sget-object v9, Ls93;->n:Ls93;

    .line 248
    .line 249
    invoke-virtual {v8, v9, v7}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 250
    .line 251
    .line 252
    new-instance v7, Lea4;

    .line 253
    .line 254
    invoke-direct {v7, v8}, Laa4;-><init>(Ljava/util/LinkedHashMap;)V

    .line 255
    .line 256
    .line 257
    iget-object v8, v3, Lth2;->g:Lhh2;

    .line 258
    .line 259
    new-instance v9, Lwb2;

    .line 260
    .line 261
    const/16 v10, 0xa

    .line 262
    .line 263
    invoke-direct {v9, v6, v8, v7, v10}, Lwb2;-><init>(Lga4;Lga4;Lga4;I)V

    .line 264
    .line 265
    .line 266
    invoke-static {v9}, Lba4;->a(Lga4;)Lba4;

    .line 267
    .line 268
    .line 269
    move-result-object v6

    .line 270
    sget v7, Lha4;->c:I

    .line 271
    .line 272
    sget-object v7, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 273
    .line 274
    new-instance v8, Ljava/util/ArrayList;

    .line 275
    .line 276
    const/4 v9, 0x1

    .line 277
    invoke-direct {v8, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 278
    .line 279
    .line 280
    invoke-interface {v8, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 281
    .line 282
    .line 283
    new-instance v6, Lha4;

    .line 284
    .line 285
    invoke-direct {v6, v7, v8}, Lha4;-><init>(Ljava/util/List;Ljava/util/List;)V

    .line 286
    .line 287
    .line 288
    new-instance v7, Ltm2;

    .line 289
    .line 290
    const/16 v8, 0x19

    .line 291
    .line 292
    invoke-direct {v7, v6, v8}, Ltm2;-><init>(Lha4;I)V

    .line 293
    .line 294
    .line 295
    iget-object v6, v3, Lth2;->d:Lba4;

    .line 296
    .line 297
    new-instance v9, Lk43;

    .line 298
    .line 299
    invoke-direct {v9, v6, v7}, Lk43;-><init>(Lba4;Ltm2;)V

    .line 300
    .line 301
    .line 302
    invoke-static {v9}, Lba4;->a(Lga4;)Lba4;

    .line 303
    .line 304
    .line 305
    move-result-object v6

    .line 306
    iget-object v7, v3, Lth2;->O0:Lba4;

    .line 307
    .line 308
    iget-object v9, v3, Lth2;->a:Leh2;

    .line 309
    .line 310
    iget-object v9, v9, Leh2;->b:Landroid/content/Context;

    .line 311
    .line 312
    invoke-static {v9}, Li41;->M(Ljava/lang/Object;)V

    .line 313
    .line 314
    .line 315
    invoke-virtual {v7}, Lba4;->d()Ljava/lang/Object;

    .line 316
    .line 317
    .line 318
    move-result-object v7

    .line 319
    new-instance v10, Lg33;

    .line 320
    .line 321
    sget-object v11, Lmd2;->a:Lld2;

    .line 322
    .line 323
    invoke-static {v11}, Li41;->M(Ljava/lang/Object;)V

    .line 324
    .line 325
    .line 326
    iget-object v4, v4, Lt3;->h:Ljava/lang/Object;

    .line 327
    .line 328
    check-cast v4, Lfa2;

    .line 329
    .line 330
    iget-object v4, v4, Lfa2;->f:Landroid/os/Bundle;

    .line 331
    .line 332
    const-string v12, "ms"

    .line 333
    .line 334
    invoke-virtual {v4, v12}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 335
    .line 336
    .line 337
    move-result-object v4

    .line 338
    if-nez v4, :cond_1

    .line 339
    .line 340
    const-string v4, ""

    .line 341
    .line 342
    :cond_1
    const/4 v12, 0x7

    .line 343
    invoke-direct {v10, v11, v4, v12}, Lg33;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 344
    .line 345
    .line 346
    new-instance v4, Lg33;

    .line 347
    .line 348
    sget-object v11, Lmd2;->a:Lld2;

    .line 349
    .line 350
    invoke-static {v11}, Li41;->M(Ljava/lang/Object;)V

    .line 351
    .line 352
    .line 353
    iget-object v12, v1, Lfa2;->j:Ljava/util/List;

    .line 354
    .line 355
    invoke-static {v12}, Li41;->M(Ljava/lang/Object;)V

    .line 356
    .line 357
    .line 358
    const/16 v8, 0x8

    .line 359
    .line 360
    invoke-direct {v4, v11, v12, v8}, Lg33;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 361
    .line 362
    .line 363
    invoke-static/range {v19 .. v19}, Lba4;->b(Lga4;)Lz94;

    .line 364
    .line 365
    .line 366
    move-result-object v8

    .line 367
    invoke-static/range {v18 .. v18}, Lba4;->b(Lga4;)Lz94;

    .line 368
    .line 369
    .line 370
    move-result-object v12

    .line 371
    invoke-static/range {v16 .. v16}, Lba4;->b(Lga4;)Lz94;

    .line 372
    .line 373
    .line 374
    invoke-static {v14}, Lba4;->b(Lga4;)Lz94;

    .line 375
    .line 376
    .line 377
    move-result-object v14

    .line 378
    invoke-static/range {v17 .. v17}, Lba4;->b(Lga4;)Lz94;

    .line 379
    .line 380
    .line 381
    move-result-object v16

    .line 382
    invoke-static {v15}, Lba4;->b(Lga4;)Lz94;

    .line 383
    .line 384
    .line 385
    invoke-static {v13}, Lba4;->b(Lga4;)Lz94;

    .line 386
    .line 387
    .line 388
    move-result-object v13

    .line 389
    invoke-static {v11}, Li41;->M(Ljava/lang/Object;)V

    .line 390
    .line 391
    .line 392
    invoke-virtual/range {v22 .. v22}, Lba4;->d()Ljava/lang/Object;

    .line 393
    .line 394
    .line 395
    move-result-object v15

    .line 396
    move-object/from16 v27, v15

    .line 397
    .line 398
    check-cast v27, Lda3;

    .line 399
    .line 400
    iget-object v3, v3, Lth2;->j:Lba4;

    .line 401
    .line 402
    invoke-virtual {v3}, Lba4;->d()Ljava/lang/Object;

    .line 403
    .line 404
    .line 405
    move-result-object v3

    .line 406
    move-object/from16 v28, v3

    .line 407
    .line 408
    check-cast v28, Lmv2;

    .line 409
    .line 410
    check-cast v7, Le63;

    .line 411
    .line 412
    new-instance v3, Ljava/util/HashSet;

    .line 413
    .line 414
    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    .line 415
    .line 416
    .line 417
    invoke-virtual {v3, v7}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 418
    .line 419
    .line 420
    invoke-virtual {v3, v10}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 421
    .line 422
    .line 423
    invoke-virtual {v3, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 424
    .line 425
    .line 426
    sget-object v4, Lmz1;->i6:Liz1;

    .line 427
    .line 428
    sget-object v7, Ltw1;->e:Ltw1;

    .line 429
    .line 430
    iget-object v7, v7, Ltw1;->c:Lkz1;

    .line 431
    .line 432
    invoke-virtual {v7, v4}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 433
    .line 434
    .line 435
    move-result-object v4

    .line 436
    check-cast v4, Ljava/lang/Boolean;

    .line 437
    .line 438
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 439
    .line 440
    .line 441
    move-result v4

    .line 442
    if-eqz v4, :cond_2

    .line 443
    .line 444
    invoke-interface {v8}, Lz94;->d()Ljava/lang/Object;

    .line 445
    .line 446
    .line 447
    move-result-object v4

    .line 448
    check-cast v4, Lq53;

    .line 449
    .line 450
    invoke-virtual {v3, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 451
    .line 452
    .line 453
    :cond_2
    sget-object v4, Lmz1;->j6:Liz1;

    .line 454
    .line 455
    invoke-virtual {v7, v4}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 456
    .line 457
    .line 458
    move-result-object v4

    .line 459
    check-cast v4, Ljava/lang/Boolean;

    .line 460
    .line 461
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 462
    .line 463
    .line 464
    move-result v4

    .line 465
    if-eqz v4, :cond_3

    .line 466
    .line 467
    invoke-interface {v12}, Lz94;->d()Ljava/lang/Object;

    .line 468
    .line 469
    .line 470
    move-result-object v4

    .line 471
    check-cast v4, Lq53;

    .line 472
    .line 473
    invoke-virtual {v3, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 474
    .line 475
    .line 476
    :cond_3
    sget-object v4, Lmz1;->l6:Liz1;

    .line 477
    .line 478
    invoke-virtual {v7, v4}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 479
    .line 480
    .line 481
    move-result-object v4

    .line 482
    check-cast v4, Ljava/lang/Boolean;

    .line 483
    .line 484
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 485
    .line 486
    .line 487
    move-result v4

    .line 488
    if-eqz v4, :cond_4

    .line 489
    .line 490
    invoke-interface {v14}, Lz94;->d()Ljava/lang/Object;

    .line 491
    .line 492
    .line 493
    move-result-object v4

    .line 494
    check-cast v4, Lq53;

    .line 495
    .line 496
    invoke-virtual {v3, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 497
    .line 498
    .line 499
    :cond_4
    sget-object v4, Lmz1;->m6:Liz1;

    .line 500
    .line 501
    invoke-virtual {v7, v4}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 502
    .line 503
    .line 504
    move-result-object v4

    .line 505
    check-cast v4, Ljava/lang/Boolean;

    .line 506
    .line 507
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 508
    .line 509
    .line 510
    move-result v4

    .line 511
    if-eqz v4, :cond_5

    .line 512
    .line 513
    invoke-interface/range {v16 .. v16}, Lz94;->d()Ljava/lang/Object;

    .line 514
    .line 515
    .line 516
    move-result-object v4

    .line 517
    check-cast v4, Lq53;

    .line 518
    .line 519
    invoke-virtual {v3, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 520
    .line 521
    .line 522
    :cond_5
    sget-object v4, Lmz1;->q3:Liz1;

    .line 523
    .line 524
    invoke-virtual {v7, v4}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 525
    .line 526
    .line 527
    move-result-object v4

    .line 528
    check-cast v4, Ljava/lang/Boolean;

    .line 529
    .line 530
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 531
    .line 532
    .line 533
    move-result v4

    .line 534
    if-eqz v4, :cond_6

    .line 535
    .line 536
    invoke-interface {v13}, Lz94;->d()Ljava/lang/Object;

    .line 537
    .line 538
    .line 539
    move-result-object v4

    .line 540
    check-cast v4, Lq53;

    .line 541
    .line 542
    invoke-virtual {v3, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 543
    .line 544
    .line 545
    :cond_6
    new-instance v23, Ls53;

    .line 546
    .line 547
    move-object/from16 v26, v3

    .line 548
    .line 549
    move-object/from16 v24, v9

    .line 550
    .line 551
    move-object/from16 v25, v11

    .line 552
    .line 553
    invoke-direct/range {v23 .. v28}, Ls53;-><init>(Landroid/content/Context;Lld2;Ljava/util/Set;Lda3;Lmv2;)V

    .line 554
    .line 555
    .line 556
    move-object/from16 v3, v23

    .line 557
    .line 558
    sget-object v4, Lh62;->b:Lus0;

    .line 559
    .line 560
    sget-object v7, Lh62;->c:Lts0;

    .line 561
    .line 562
    const-string v8, "google.afma.request.getSignals"

    .line 563
    .line 564
    invoke-virtual {v2, v8, v4, v7}, Li62;->a(Ljava/lang/String;Lg62;Lf62;)Lk62;

    .line 565
    .line 566
    .line 567
    move-result-object v2

    .line 568
    const/16 v4, 0x16

    .line 569
    .line 570
    invoke-static {v5, v4}, Laa3;->l(Landroid/content/Context;I)Laa3;

    .line 571
    .line 572
    .line 573
    move-result-object v4

    .line 574
    invoke-virtual {v6}, Lba4;->d()Ljava/lang/Object;

    .line 575
    .line 576
    .line 577
    move-result-object v5

    .line 578
    check-cast v5, Lu93;

    .line 579
    .line 580
    iget-object v6, v1, Lfa2;->f:Landroid/os/Bundle;

    .line 581
    .line 582
    invoke-static {v6}, Lpu1;->r(Ljava/lang/Object;)Llq3;

    .line 583
    .line 584
    .line 585
    move-result-object v7

    .line 586
    sget-object v8, Ls93;->o:Ls93;

    .line 587
    .line 588
    invoke-virtual {v5, v7, v8}, Lu93;->a(Ln70;Ljava/lang/Object;)Lbu1;

    .line 589
    .line 590
    .line 591
    move-result-object v5

    .line 592
    new-instance v7, Lof3;

    .line 593
    .line 594
    const/16 v8, 0x19

    .line 595
    .line 596
    invoke-direct {v7, v8, v4}, Lof3;-><init>(ILjava/lang/Object;)V

    .line 597
    .line 598
    .line 599
    invoke-virtual {v5, v7}, Lbu1;->q(Lo93;)Lbu1;

    .line 600
    .line 601
    .line 602
    move-result-object v5

    .line 603
    new-instance v7, Lz02;

    .line 604
    .line 605
    const/16 v10, 0xa

    .line 606
    .line 607
    invoke-direct {v7, v3, v1, v10}, Lz02;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 608
    .line 609
    .line 610
    invoke-virtual {v5, v7}, Lbu1;->s(Lyp3;)Lbu1;

    .line 611
    .line 612
    .line 613
    move-result-object v1

    .line 614
    iget-object v3, v1, Lbu1;->l:Ljava/lang/Object;

    .line 615
    .line 616
    check-cast v3, Lu93;

    .line 617
    .line 618
    invoke-virtual {v1}, Lbu1;->A()Lq93;

    .line 619
    .line 620
    .line 621
    move-result-object v1

    .line 622
    sget-object v5, Ls93;->p:Ls93;

    .line 623
    .line 624
    invoke-virtual {v3, v1, v5}, Lu93;->a(Ln70;Ljava/lang/Object;)Lbu1;

    .line 625
    .line 626
    .line 627
    move-result-object v1

    .line 628
    invoke-virtual {v1, v2}, Lbu1;->s(Lyp3;)Lbu1;

    .line 629
    .line 630
    .line 631
    move-result-object v1

    .line 632
    invoke-virtual {v1}, Lbu1;->A()Lq93;

    .line 633
    .line 634
    .line 635
    move-result-object v1

    .line 636
    invoke-virtual/range {v22 .. v22}, Lba4;->d()Ljava/lang/Object;

    .line 637
    .line 638
    .line 639
    move-result-object v2

    .line 640
    check-cast v2, Lda3;

    .line 641
    .line 642
    const-string v3, "ad_types"

    .line 643
    .line 644
    invoke-virtual {v6, v3}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 645
    .line 646
    .line 647
    move-result-object v3

    .line 648
    invoke-virtual {v2, v3}, Lda3;->b(Ljava/util/ArrayList;)V

    .line 649
    .line 650
    .line 651
    const-string v3, "extras"

    .line 652
    .line 653
    invoke-virtual {v6, v3}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 654
    .line 655
    .line 656
    move-result-object v3

    .line 657
    invoke-virtual {v2, v3}, Lda3;->d(Landroid/os/Bundle;)V

    .line 658
    .line 659
    .line 660
    const/4 v9, 0x1

    .line 661
    invoke-static {v1, v2, v4, v9}, Lqb1;->P(Ln70;Lda3;Laa3;Z)V

    .line 662
    .line 663
    .line 664
    sget-object v2, Ls02;->h:Lso1;

    .line 665
    .line 666
    invoke-virtual {v2}, Lso1;->w()Ljava/lang/Object;

    .line 667
    .line 668
    .line 669
    move-result-object v2

    .line 670
    check-cast v2, Ljava/lang/Boolean;

    .line 671
    .line 672
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 673
    .line 674
    .line 675
    move-result v2

    .line 676
    if-eqz v2, :cond_7

    .line 677
    .line 678
    iget-object v2, v0, Lxy2;->h:Lzs1;

    .line 679
    .line 680
    invoke-static {v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 681
    .line 682
    .line 683
    new-instance v3, Luy2;

    .line 684
    .line 685
    const/4 v4, 0x0

    .line 686
    invoke-direct {v3, v2, v4}, Luy2;-><init>(Lzs1;I)V

    .line 687
    .line 688
    .line 689
    iget-object v2, v0, Lxy2;->g:Lpq3;

    .line 690
    .line 691
    invoke-virtual {v1, v3, v2}, Lq93;->c(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 692
    .line 693
    .line 694
    :cond_7
    return-object v1
.end method

.method public final G3(Ln70;Lda2;Lfa2;)V
    .locals 2

    .line 1
    new-instance v0, Lfi1;

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lfi1;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sget-object v1, Lmd2;->a:Lld2;

    .line 9
    .line 10
    invoke-static {p1, v0, v1}, Lpu1;->O(Ln70;Lyp3;Ljava/util/concurrent/Executor;)Lqp3;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    new-instance v0, Llv2;

    .line 15
    .line 16
    const/4 v1, 0x1

    .line 17
    invoke-direct {v0, p0, p3, p2, v1}, Llv2;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 18
    .line 19
    .line 20
    sget-object p2, Lmd2;->g:Lld2;

    .line 21
    .line 22
    new-instance p3, Ljq3;

    .line 23
    .line 24
    const/4 v1, 0x0

    .line 25
    invoke-direct {p3, p1, v0, v1}, Ljq3;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1, p3, p2}, Lgp3;->c(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public final declared-synchronized H3(Ljava/lang/String;)Lsy2;
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lxy2;->j:Ljava/util/ArrayDeque;

    .line 3
    .line 4
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->iterator()Ljava/util/Iterator;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-eqz v1, :cond_1

    .line 13
    .line 14
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    check-cast v1, Lsy2;

    .line 19
    .line 20
    iget-object v2, v1, Lsy2;->c:Ljava/lang/String;

    .line 21
    .line 22
    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-eqz v2, :cond_0

    .line 27
    .line 28
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    .line 30
    .line 31
    monitor-exit p0

    .line 32
    return-object v1

    .line 33
    :catchall_0
    move-exception p1

    .line 34
    goto :goto_0

    .line 35
    :cond_1
    monitor-exit p0

    .line 36
    const/4 p1, 0x0

    .line 37
    return-object p1

    .line 38
    :goto_0
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 39
    throw p1
.end method

.method public final Q2(Lfa2;Lda2;)V
    .locals 1

    .line 1
    invoke-static {}, Landroid/os/Binder;->getCallingUid()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0, p1, v0}, Lxy2;->C3(Lfa2;I)Ln70;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {p0, v0, p2, p1}, Lxy2;->G3(Ln70;Lda2;Lfa2;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final k1(Lfa2;Lda2;)V
    .locals 3

    .line 1
    sget-object v0, Lmz1;->m2:Liz1;

    .line 2
    .line 3
    sget-object v1, Ltw1;->e:Ltw1;

    .line 4
    .line 5
    iget-object v1, v1, Ltw1;->c:Lkz1;

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Ljava/lang/Boolean;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    iget-object v0, p1, Lfa2;->r:Landroid/os/Bundle;

    .line 20
    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    sget-object v1, Lhg4;->C:Lhg4;

    .line 24
    .line 25
    iget-object v1, v1, Lhg4;->k:Lym;

    .line 26
    .line 27
    const-string v2, "service-connected"

    .line 28
    .line 29
    invoke-static {v1, v0, v2}, Lga1;->n(Lym;Landroid/os/Bundle;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    :cond_0
    invoke-static {}, Landroid/os/Binder;->getCallingUid()I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    invoke-virtual {p0, p1, v0}, Lxy2;->B3(Lfa2;I)Lq93;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-virtual {p0, v0, p2, p1}, Lxy2;->G3(Ln70;Lda2;Lfa2;)V

    .line 41
    .line 42
    .line 43
    sget-object p1, Ls02;->g:Lso1;

    .line 44
    .line 45
    invoke-virtual {p1}, Lso1;->w()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    check-cast p1, Ljava/lang/Boolean;

    .line 50
    .line 51
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 52
    .line 53
    .line 54
    move-result p1

    .line 55
    if-eqz p1, :cond_1

    .line 56
    .line 57
    iget-object p1, p0, Lxy2;->h:Lzs1;

    .line 58
    .line 59
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    new-instance p2, Luy2;

    .line 63
    .line 64
    const/4 v1, 0x1

    .line 65
    invoke-direct {p2, p1, v1}, Luy2;-><init>(Lzs1;I)V

    .line 66
    .line 67
    .line 68
    iget-object p1, p0, Lxy2;->g:Lpq3;

    .line 69
    .line 70
    invoke-virtual {v0, p2, p1}, Lq93;->c(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 71
    .line 72
    .line 73
    :cond_1
    return-void
.end method

.method public final n3(Ljava/lang/String;Lda2;)V
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Lxy2;->D3(Ljava/lang/String;)Ln70;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const/4 v0, 0x0

    .line 6
    invoke-virtual {p0, p1, p2, v0}, Lxy2;->G3(Ln70;Lda2;Lfa2;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final q0(Ljava/lang/String;)V
    .locals 9

    .line 1
    invoke-static {}, Landroid/os/Binder;->getCallingUid()I

    .line 2
    .line 3
    .line 4
    sget-object v0, Lmz1;->Ee:Liz1;

    .line 5
    .line 6
    sget-object v1, Ltw1;->e:Ltw1;

    .line 7
    .line 8
    iget-object v2, v1, Ltw1;->c:Lkz1;

    .line 9
    .line 10
    invoke-virtual {v2, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    check-cast v0, Ljava/lang/Boolean;

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    const-string v2, "Unexpected preconnect response: "

    .line 21
    .line 22
    if-nez v0, :cond_0

    .line 23
    .line 24
    goto/16 :goto_1

    .line 25
    .line 26
    :cond_0
    sget-object v0, Lmz1;->Fe:Liz1;

    .line 27
    .line 28
    iget-object v1, v1, Ltw1;->c:Lkz1;

    .line 29
    .line 30
    invoke-virtual {v1, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    check-cast v0, Ljava/lang/String;

    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    if-nez v1, :cond_2

    .line 41
    .line 42
    new-instance v1, Lyk3;

    .line 43
    .line 44
    const/16 v3, 0x2c

    .line 45
    .line 46
    invoke-direct {v1, v3}, Lyk3;-><init>(C)V

    .line 47
    .line 48
    .line 49
    invoke-static {v1}, Lsq0;->p(Lyk3;)Lsq0;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    const-string v3, "AdRequestServiceImpl: Preconnecting"

    .line 54
    .line 55
    invoke-static {v3}, Lgi2;->G(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    iget-object v3, v1, Lsq0;->g:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v3, Lkl3;

    .line 61
    .line 62
    invoke-interface {v3, v1, v0}, Lkl3;->d(Lsq0;Ljava/lang/CharSequence;)Ljava/util/Iterator;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    :goto_0
    move-object v1, v0

    .line 67
    check-cast v1, Ljl3;

    .line 68
    .line 69
    invoke-virtual {v1}, Ljl3;->hasNext()Z

    .line 70
    .line 71
    .line 72
    move-result v3

    .line 73
    if-eqz v3, :cond_2

    .line 74
    .line 75
    invoke-virtual {v1}, Ljl3;->next()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    move-object v4, v1

    .line 80
    check-cast v4, Ljava/lang/String;

    .line 81
    .line 82
    new-instance v1, Lxb4;

    .line 83
    .line 84
    const-string v3, "HEAD"

    .line 85
    .line 86
    const/16 v5, 0x19

    .line 87
    .line 88
    iget-object v6, p0, Lxy2;->f:Landroid/content/Context;

    .line 89
    .line 90
    invoke-direct {v1, v6, p1, v3, v5}, Lxb4;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 91
    .line 92
    .line 93
    move-object v3, v6

    .line 94
    new-instance v6, Ljava/util/HashMap;

    .line 95
    .line 96
    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    .line 97
    .line 98
    .line 99
    sget-object v5, Lhg4;->C:Lhg4;

    .line 100
    .line 101
    iget-object v5, v5, Lhg4;->c:Llf4;

    .line 102
    .line 103
    invoke-virtual {v5, v3, p1}, Llf4;->D(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v3

    .line 107
    const-string v5, "User-Agent"

    .line 108
    .line 109
    invoke-virtual {v6, v5, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    new-instance v3, Lyy2;

    .line 113
    .line 114
    const/4 v5, 0x0

    .line 115
    new-array v7, v5, [B

    .line 116
    .line 117
    const-string v8, ""

    .line 118
    .line 119
    const/16 v5, 0x7530

    .line 120
    .line 121
    invoke-direct/range {v3 .. v8}, Lyy2;-><init>(Ljava/lang/String;ILjava/util/HashMap;[BLjava/lang/String;)V

    .line 122
    .line 123
    .line 124
    :try_start_0
    invoke-virtual {v1, v3}, Lxb4;->C(Lyy2;)Lzy2;

    .line 125
    .line 126
    .line 127
    move-result-object v1

    .line 128
    iget v3, v1, Lzy2;->a:I

    .line 129
    .line 130
    const/16 v4, 0xc8

    .line 131
    .line 132
    if-ne v3, v4, :cond_1

    .line 133
    .line 134
    goto :goto_0

    .line 135
    :cond_1
    new-instance p1, Landroid/os/RemoteException;

    .line 136
    .line 137
    iget v0, v1, Lzy2;->a:I

    .line 138
    .line 139
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v1

    .line 143
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 144
    .line 145
    .line 146
    move-result v1

    .line 147
    add-int/lit8 v1, v1, 0x20

    .line 148
    .line 149
    new-instance v3, Ljava/lang/StringBuilder;

    .line 150
    .line 151
    invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 155
    .line 156
    .line 157
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 158
    .line 159
    .line 160
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object v0

    .line 164
    invoke-direct {p1, v0}, Landroid/os/RemoteException;-><init>(Ljava/lang/String;)V

    .line 165
    .line 166
    .line 167
    throw p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 168
    :catch_0
    move-exception v0

    .line 169
    move-object p1, v0

    .line 170
    new-instance v0, Landroid/os/RemoteException;

    .line 171
    .line 172
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object p1

    .line 176
    invoke-direct {v0, p1}, Landroid/os/RemoteException;-><init>(Ljava/lang/String;)V

    .line 177
    .line 178
    .line 179
    throw v0

    .line 180
    :cond_2
    :goto_1
    return-void
.end method

.method public final x0(Lfa2;Lda2;)V
    .locals 3

    .line 1
    sget-object v0, Lmz1;->m2:Liz1;

    .line 2
    .line 3
    sget-object v1, Ltw1;->e:Ltw1;

    .line 4
    .line 5
    iget-object v1, v1, Ltw1;->c:Lkz1;

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Ljava/lang/Boolean;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    iget-object v0, p1, Lfa2;->r:Landroid/os/Bundle;

    .line 20
    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    sget-object v1, Lhg4;->C:Lhg4;

    .line 24
    .line 25
    iget-object v1, v1, Lhg4;->k:Lym;

    .line 26
    .line 27
    const-string v2, "service-connected"

    .line 28
    .line 29
    invoke-static {v1, v0, v2}, Lga1;->n(Lym;Landroid/os/Bundle;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    :cond_0
    invoke-static {}, Landroid/os/Binder;->getCallingUid()I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    invoke-virtual {p0, p1, v0}, Lxy2;->E3(Lfa2;I)Ln70;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-virtual {p0, v0, p2, p1}, Lxy2;->G3(Ln70;Lda2;Lfa2;)V

    .line 41
    .line 42
    .line 43
    return-void
.end method
