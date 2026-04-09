.class public final Led4;
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
    iput p1, p0, Led4;->a:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static a(Lxy;Landroid/os/Parcel;I)V
    .locals 4

    .line 1
    const/16 v0, 0x4f45

    .line 2
    .line 3
    invoke-static {p1, v0}, Luk2;->I(Landroid/os/Parcel;I)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget v1, p0, Lxy;->f:I

    .line 8
    .line 9
    const/4 v2, 0x1

    .line 10
    const/4 v3, 0x4

    .line 11
    invoke-static {p1, v2, v3}, Luk2;->T(Landroid/os/Parcel;II)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 15
    .line 16
    .line 17
    iget v1, p0, Lxy;->g:I

    .line 18
    .line 19
    const/4 v2, 0x2

    .line 20
    invoke-static {p1, v2, v3}, Luk2;->T(Landroid/os/Parcel;II)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 24
    .line 25
    .line 26
    iget v1, p0, Lxy;->h:I

    .line 27
    .line 28
    const/4 v2, 0x3

    .line 29
    invoke-static {p1, v2, v3}, Luk2;->T(Landroid/os/Parcel;II)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 33
    .line 34
    .line 35
    iget-object v1, p0, Lxy;->i:Ljava/lang/String;

    .line 36
    .line 37
    invoke-static {p1, v3, v1}, Luk2;->D(Landroid/os/Parcel;ILjava/lang/String;)V

    .line 38
    .line 39
    .line 40
    const/4 v1, 0x5

    .line 41
    iget-object v2, p0, Lxy;->j:Landroid/os/IBinder;

    .line 42
    .line 43
    invoke-static {p1, v1, v2}, Luk2;->B(Landroid/os/Parcel;ILandroid/os/IBinder;)V

    .line 44
    .line 45
    .line 46
    const/4 v1, 0x6

    .line 47
    iget-object v2, p0, Lxy;->k:[Lcom/google/android/gms/common/api/Scope;

    .line 48
    .line 49
    invoke-static {p1, v1, v2, p2}, Luk2;->G(Landroid/os/Parcel;I[Landroid/os/Parcelable;I)V

    .line 50
    .line 51
    .line 52
    const/4 v1, 0x7

    .line 53
    iget-object v2, p0, Lxy;->l:Landroid/os/Bundle;

    .line 54
    .line 55
    invoke-static {p1, v1, v2}, Luk2;->z(Landroid/os/Parcel;ILandroid/os/Bundle;)V

    .line 56
    .line 57
    .line 58
    const/16 v1, 0x8

    .line 59
    .line 60
    iget-object v2, p0, Lxy;->m:Landroid/accounts/Account;

    .line 61
    .line 62
    invoke-static {p1, v1, v2, p2}, Luk2;->C(Landroid/os/Parcel;ILandroid/os/Parcelable;I)V

    .line 63
    .line 64
    .line 65
    const/16 v1, 0xa

    .line 66
    .line 67
    iget-object v2, p0, Lxy;->n:[Lju;

    .line 68
    .line 69
    invoke-static {p1, v1, v2, p2}, Luk2;->G(Landroid/os/Parcel;I[Landroid/os/Parcelable;I)V

    .line 70
    .line 71
    .line 72
    const/16 v1, 0xb

    .line 73
    .line 74
    iget-object v2, p0, Lxy;->o:[Lju;

    .line 75
    .line 76
    invoke-static {p1, v1, v2, p2}, Luk2;->G(Landroid/os/Parcel;I[Landroid/os/Parcelable;I)V

    .line 77
    .line 78
    .line 79
    iget-boolean p2, p0, Lxy;->p:Z

    .line 80
    .line 81
    const/16 v1, 0xc

    .line 82
    .line 83
    invoke-static {p1, v1, v3}, Luk2;->T(Landroid/os/Parcel;II)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 87
    .line 88
    .line 89
    iget p2, p0, Lxy;->q:I

    .line 90
    .line 91
    const/16 v1, 0xd

    .line 92
    .line 93
    invoke-static {p1, v1, v3}, Luk2;->T(Landroid/os/Parcel;II)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 97
    .line 98
    .line 99
    iget-boolean p2, p0, Lxy;->r:Z

    .line 100
    .line 101
    const/16 v1, 0xe

    .line 102
    .line 103
    invoke-static {p1, v1, v3}, Luk2;->T(Landroid/os/Parcel;II)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 107
    .line 108
    .line 109
    const/16 p2, 0xf

    .line 110
    .line 111
    iget-object p0, p0, Lxy;->s:Ljava/lang/String;

    .line 112
    .line 113
    invoke-static {p1, p2, p0}, Luk2;->D(Landroid/os/Parcel;ILjava/lang/String;)V

    .line 114
    .line 115
    .line 116
    invoke-static {p1, v0}, Luk2;->O(Landroid/os/Parcel;I)V

    .line 117
    .line 118
    .line 119
    return-void
.end method


# virtual methods
.method public final createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 38

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget v2, v0, Led4;->a:I

    .line 6
    .line 7
    packed-switch v2, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-static {v1}, Lgi2;->z(Landroid/os/Parcel;)I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    const/4 v3, 0x0

    .line 15
    :goto_0
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    if-ge v4, v2, :cond_1

    .line 20
    .line 21
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    int-to-char v5, v4

    .line 26
    const/4 v6, 0x2

    .line 27
    if-eq v5, v6, :cond_0

    .line 28
    .line 29
    invoke-static {v1, v4}, Lgi2;->y(Landroid/os/Parcel;I)V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    invoke-static {v1, v4}, Lgi2;->v(Landroid/os/Parcel;I)I

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    goto :goto_0

    .line 38
    :cond_1
    invoke-static {v1, v2}, Lgi2;->k(Landroid/os/Parcel;I)V

    .line 39
    .line 40
    .line 41
    new-instance v1, Lvi4;

    .line 42
    .line 43
    invoke-direct {v1, v3}, Lvi4;-><init>(I)V

    .line 44
    .line 45
    .line 46
    return-object v1

    .line 47
    :pswitch_0
    invoke-static {v1}, Lgi2;->z(Landroid/os/Parcel;)I

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    const/4 v3, 0x0

    .line 52
    const/4 v4, 0x0

    .line 53
    move v7, v3

    .line 54
    move v8, v7

    .line 55
    move v9, v8

    .line 56
    move v10, v9

    .line 57
    move-object v6, v4

    .line 58
    :goto_1
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 59
    .line 60
    .line 61
    move-result v3

    .line 62
    if-ge v3, v2, :cond_7

    .line 63
    .line 64
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 65
    .line 66
    .line 67
    move-result v3

    .line 68
    int-to-char v4, v3

    .line 69
    const/4 v5, 0x2

    .line 70
    if-eq v4, v5, :cond_6

    .line 71
    .line 72
    const/4 v5, 0x3

    .line 73
    if-eq v4, v5, :cond_5

    .line 74
    .line 75
    const/4 v5, 0x4

    .line 76
    if-eq v4, v5, :cond_4

    .line 77
    .line 78
    const/4 v5, 0x5

    .line 79
    if-eq v4, v5, :cond_3

    .line 80
    .line 81
    const/4 v5, 0x6

    .line 82
    if-eq v4, v5, :cond_2

    .line 83
    .line 84
    invoke-static {v1, v3}, Lgi2;->y(Landroid/os/Parcel;I)V

    .line 85
    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_2
    invoke-static {v1, v3}, Lgi2;->t(Landroid/os/Parcel;I)Z

    .line 89
    .line 90
    .line 91
    move-result v10

    .line 92
    goto :goto_1

    .line 93
    :cond_3
    invoke-static {v1, v3}, Lgi2;->t(Landroid/os/Parcel;I)Z

    .line 94
    .line 95
    .line 96
    move-result v9

    .line 97
    goto :goto_1

    .line 98
    :cond_4
    invoke-static {v1, v3}, Lgi2;->v(Landroid/os/Parcel;I)I

    .line 99
    .line 100
    .line 101
    move-result v8

    .line 102
    goto :goto_1

    .line 103
    :cond_5
    invoke-static {v1, v3}, Lgi2;->v(Landroid/os/Parcel;I)I

    .line 104
    .line 105
    .line 106
    move-result v7

    .line 107
    goto :goto_1

    .line 108
    :cond_6
    invoke-static {v1, v3}, Lgi2;->g(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v6

    .line 112
    goto :goto_1

    .line 113
    :cond_7
    invoke-static {v1, v2}, Lgi2;->k(Landroid/os/Parcel;I)V

    .line 114
    .line 115
    .line 116
    new-instance v5, Le51;

    .line 117
    .line 118
    invoke-direct/range {v5 .. v10}, Le51;-><init>(Ljava/lang/String;IIZZ)V

    .line 119
    .line 120
    .line 121
    return-object v5

    .line 122
    :pswitch_1
    invoke-static {v1}, Lgi2;->z(Landroid/os/Parcel;)I

    .line 123
    .line 124
    .line 125
    move-result v2

    .line 126
    const/4 v3, 0x0

    .line 127
    const-wide/16 v4, 0x0

    .line 128
    .line 129
    move-object v7, v3

    .line 130
    move-object v10, v7

    .line 131
    move-object v11, v10

    .line 132
    move-object v12, v11

    .line 133
    move-object v13, v12

    .line 134
    move-object v14, v13

    .line 135
    move-object v15, v14

    .line 136
    move-wide v8, v4

    .line 137
    :goto_2
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 138
    .line 139
    .line 140
    move-result v3

    .line 141
    if-ge v3, v2, :cond_8

    .line 142
    .line 143
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 144
    .line 145
    .line 146
    move-result v3

    .line 147
    int-to-char v4, v3

    .line 148
    packed-switch v4, :pswitch_data_1

    .line 149
    .line 150
    .line 151
    invoke-static {v1, v3}, Lgi2;->y(Landroid/os/Parcel;I)V

    .line 152
    .line 153
    .line 154
    goto :goto_2

    .line 155
    :pswitch_2
    invoke-static {v1, v3}, Lgi2;->g(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v3

    .line 159
    move-object v15, v3

    .line 160
    goto :goto_2

    .line 161
    :pswitch_3
    invoke-static {v1, v3}, Lgi2;->g(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object v3

    .line 165
    move-object v14, v3

    .line 166
    goto :goto_2

    .line 167
    :pswitch_4
    invoke-static {v1, v3}, Lgi2;->g(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object v3

    .line 171
    move-object v13, v3

    .line 172
    goto :goto_2

    .line 173
    :pswitch_5
    invoke-static {v1, v3}, Lgi2;->g(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object v3

    .line 177
    move-object v12, v3

    .line 178
    goto :goto_2

    .line 179
    :pswitch_6
    invoke-static {v1, v3}, Lgi2;->d(Landroid/os/Parcel;I)Landroid/os/Bundle;

    .line 180
    .line 181
    .line 182
    move-result-object v3

    .line 183
    move-object v11, v3

    .line 184
    goto :goto_2

    .line 185
    :pswitch_7
    sget-object v4, Lnx2;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 186
    .line 187
    invoke-static {v1, v3, v4}, Lgi2;->f(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 188
    .line 189
    .line 190
    move-result-object v3

    .line 191
    check-cast v3, Lnx2;

    .line 192
    .line 193
    move-object v10, v3

    .line 194
    goto :goto_2

    .line 195
    :pswitch_8
    invoke-static {v1, v3}, Lgi2;->w(Landroid/os/Parcel;I)J

    .line 196
    .line 197
    .line 198
    move-result-wide v3

    .line 199
    move-wide v8, v3

    .line 200
    goto :goto_2

    .line 201
    :pswitch_9
    invoke-static {v1, v3}, Lgi2;->g(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object v3

    .line 205
    move-object v7, v3

    .line 206
    goto :goto_2

    .line 207
    :cond_8
    invoke-static {v1, v2}, Lgi2;->k(Landroid/os/Parcel;I)V

    .line 208
    .line 209
    .line 210
    new-instance v6, Lqh4;

    .line 211
    .line 212
    invoke-direct/range {v6 .. v15}, Lqh4;-><init>(Ljava/lang/String;JLnx2;Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 213
    .line 214
    .line 215
    return-object v6

    .line 216
    :pswitch_a
    invoke-static {v1}, Lgi2;->z(Landroid/os/Parcel;)I

    .line 217
    .line 218
    .line 219
    move-result v2

    .line 220
    const-wide/16 v3, 0x0

    .line 221
    .line 222
    const/4 v5, 0x0

    .line 223
    const/4 v6, 0x0

    .line 224
    move-wide v10, v3

    .line 225
    move-object v12, v5

    .line 226
    move v8, v6

    .line 227
    move v9, v8

    .line 228
    :goto_3
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 229
    .line 230
    .line 231
    move-result v3

    .line 232
    if-ge v3, v2, :cond_d

    .line 233
    .line 234
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 235
    .line 236
    .line 237
    move-result v3

    .line 238
    int-to-char v4, v3

    .line 239
    const/4 v5, 0x1

    .line 240
    if-eq v4, v5, :cond_c

    .line 241
    .line 242
    const/4 v5, 0x2

    .line 243
    if-eq v4, v5, :cond_b

    .line 244
    .line 245
    const/4 v5, 0x3

    .line 246
    if-eq v4, v5, :cond_a

    .line 247
    .line 248
    const/4 v5, 0x4

    .line 249
    if-eq v4, v5, :cond_9

    .line 250
    .line 251
    invoke-static {v1, v3}, Lgi2;->y(Landroid/os/Parcel;I)V

    .line 252
    .line 253
    .line 254
    goto :goto_3

    .line 255
    :cond_9
    invoke-static {v1, v3}, Lgi2;->w(Landroid/os/Parcel;I)J

    .line 256
    .line 257
    .line 258
    move-result-wide v3

    .line 259
    move-wide v10, v3

    .line 260
    goto :goto_3

    .line 261
    :cond_a
    invoke-static {v1, v3}, Lgi2;->g(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 262
    .line 263
    .line 264
    move-result-object v3

    .line 265
    move-object v12, v3

    .line 266
    goto :goto_3

    .line 267
    :cond_b
    invoke-static {v1, v3}, Lgi2;->v(Landroid/os/Parcel;I)I

    .line 268
    .line 269
    .line 270
    move-result v3

    .line 271
    move v9, v3

    .line 272
    goto :goto_3

    .line 273
    :cond_c
    invoke-static {v1, v3}, Lgi2;->v(Landroid/os/Parcel;I)I

    .line 274
    .line 275
    .line 276
    move-result v3

    .line 277
    move v8, v3

    .line 278
    goto :goto_3

    .line 279
    :cond_d
    invoke-static {v1, v2}, Lgi2;->k(Landroid/os/Parcel;I)V

    .line 280
    .line 281
    .line 282
    new-instance v7, Ldg4;

    .line 283
    .line 284
    invoke-direct/range {v7 .. v12}, Ldg4;-><init>(IIJLjava/lang/String;)V

    .line 285
    .line 286
    .line 287
    return-object v7

    .line 288
    :pswitch_b
    invoke-static {v1}, Lgi2;->z(Landroid/os/Parcel;)I

    .line 289
    .line 290
    .line 291
    move-result v2

    .line 292
    const/4 v3, 0x0

    .line 293
    const/4 v4, 0x0

    .line 294
    move v7, v3

    .line 295
    move v8, v7

    .line 296
    move v9, v8

    .line 297
    move v10, v9

    .line 298
    move v11, v10

    .line 299
    move v13, v11

    .line 300
    move v14, v13

    .line 301
    move v15, v14

    .line 302
    move/from16 v16, v15

    .line 303
    .line 304
    move/from16 v17, v16

    .line 305
    .line 306
    move/from16 v18, v17

    .line 307
    .line 308
    move/from16 v19, v18

    .line 309
    .line 310
    move/from16 v20, v19

    .line 311
    .line 312
    move-object v6, v4

    .line 313
    move-object v12, v6

    .line 314
    :goto_4
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 315
    .line 316
    .line 317
    move-result v3

    .line 318
    if-ge v3, v2, :cond_e

    .line 319
    .line 320
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 321
    .line 322
    .line 323
    move-result v3

    .line 324
    int-to-char v4, v3

    .line 325
    packed-switch v4, :pswitch_data_2

    .line 326
    .line 327
    .line 328
    invoke-static {v1, v3}, Lgi2;->y(Landroid/os/Parcel;I)V

    .line 329
    .line 330
    .line 331
    goto :goto_4

    .line 332
    :pswitch_c
    invoke-static {v1, v3}, Lgi2;->t(Landroid/os/Parcel;I)Z

    .line 333
    .line 334
    .line 335
    move-result v20

    .line 336
    goto :goto_4

    .line 337
    :pswitch_d
    invoke-static {v1, v3}, Lgi2;->t(Landroid/os/Parcel;I)Z

    .line 338
    .line 339
    .line 340
    move-result v19

    .line 341
    goto :goto_4

    .line 342
    :pswitch_e
    invoke-static {v1, v3}, Lgi2;->t(Landroid/os/Parcel;I)Z

    .line 343
    .line 344
    .line 345
    move-result v18

    .line 346
    goto :goto_4

    .line 347
    :pswitch_f
    invoke-static {v1, v3}, Lgi2;->t(Landroid/os/Parcel;I)Z

    .line 348
    .line 349
    .line 350
    move-result v17

    .line 351
    goto :goto_4

    .line 352
    :pswitch_10
    invoke-static {v1, v3}, Lgi2;->t(Landroid/os/Parcel;I)Z

    .line 353
    .line 354
    .line 355
    move-result v16

    .line 356
    goto :goto_4

    .line 357
    :pswitch_11
    invoke-static {v1, v3}, Lgi2;->t(Landroid/os/Parcel;I)Z

    .line 358
    .line 359
    .line 360
    move-result v15

    .line 361
    goto :goto_4

    .line 362
    :pswitch_12
    invoke-static {v1, v3}, Lgi2;->t(Landroid/os/Parcel;I)Z

    .line 363
    .line 364
    .line 365
    move-result v14

    .line 366
    goto :goto_4

    .line 367
    :pswitch_13
    invoke-static {v1, v3}, Lgi2;->t(Landroid/os/Parcel;I)Z

    .line 368
    .line 369
    .line 370
    move-result v13

    .line 371
    goto :goto_4

    .line 372
    :pswitch_14
    sget-object v4, Lxe4;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 373
    .line 374
    invoke-static {v1, v3, v4}, Lgi2;->j(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)[Ljava/lang/Object;

    .line 375
    .line 376
    .line 377
    move-result-object v3

    .line 378
    move-object v12, v3

    .line 379
    check-cast v12, [Lxe4;

    .line 380
    .line 381
    goto :goto_4

    .line 382
    :pswitch_15
    invoke-static {v1, v3}, Lgi2;->v(Landroid/os/Parcel;I)I

    .line 383
    .line 384
    .line 385
    move-result v11

    .line 386
    goto :goto_4

    .line 387
    :pswitch_16
    invoke-static {v1, v3}, Lgi2;->v(Landroid/os/Parcel;I)I

    .line 388
    .line 389
    .line 390
    move-result v10

    .line 391
    goto :goto_4

    .line 392
    :pswitch_17
    invoke-static {v1, v3}, Lgi2;->t(Landroid/os/Parcel;I)Z

    .line 393
    .line 394
    .line 395
    move-result v9

    .line 396
    goto :goto_4

    .line 397
    :pswitch_18
    invoke-static {v1, v3}, Lgi2;->v(Landroid/os/Parcel;I)I

    .line 398
    .line 399
    .line 400
    move-result v8

    .line 401
    goto :goto_4

    .line 402
    :pswitch_19
    invoke-static {v1, v3}, Lgi2;->v(Landroid/os/Parcel;I)I

    .line 403
    .line 404
    .line 405
    move-result v7

    .line 406
    goto :goto_4

    .line 407
    :pswitch_1a
    invoke-static {v1, v3}, Lgi2;->g(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 408
    .line 409
    .line 410
    move-result-object v6

    .line 411
    goto :goto_4

    .line 412
    :cond_e
    invoke-static {v1, v2}, Lgi2;->k(Landroid/os/Parcel;I)V

    .line 413
    .line 414
    .line 415
    new-instance v5, Lxe4;

    .line 416
    .line 417
    invoke-direct/range {v5 .. v20}, Lxe4;-><init>(Ljava/lang/String;IIZII[Lxe4;ZZZZZZZZ)V

    .line 418
    .line 419
    .line 420
    return-object v5

    .line 421
    :pswitch_1b
    new-instance v2, Lvd4;

    .line 422
    .line 423
    invoke-direct {v2, v1}, Lvd4;-><init>(Landroid/os/Parcel;)V

    .line 424
    .line 425
    .line 426
    return-object v2

    .line 427
    :pswitch_1c
    invoke-static {v1}, Lgi2;->z(Landroid/os/Parcel;)I

    .line 428
    .line 429
    .line 430
    move-result v2

    .line 431
    const-wide/16 v3, 0x0

    .line 432
    .line 433
    const/4 v5, 0x0

    .line 434
    const/4 v6, 0x0

    .line 435
    move-wide/from16 v31, v3

    .line 436
    .line 437
    move v14, v5

    .line 438
    move/from16 v17, v14

    .line 439
    .line 440
    move/from16 v18, v17

    .line 441
    .line 442
    move/from16 v30, v18

    .line 443
    .line 444
    move-object v8, v6

    .line 445
    move-object v9, v8

    .line 446
    move-object v10, v9

    .line 447
    move-object v11, v10

    .line 448
    move-object v12, v11

    .line 449
    move-object v13, v12

    .line 450
    move-object v15, v13

    .line 451
    move-object/from16 v16, v15

    .line 452
    .line 453
    move-object/from16 v19, v16

    .line 454
    .line 455
    move-object/from16 v20, v19

    .line 456
    .line 457
    move-object/from16 v21, v20

    .line 458
    .line 459
    move-object/from16 v22, v21

    .line 460
    .line 461
    move-object/from16 v23, v22

    .line 462
    .line 463
    move-object/from16 v24, v23

    .line 464
    .line 465
    move-object/from16 v25, v24

    .line 466
    .line 467
    move-object/from16 v26, v25

    .line 468
    .line 469
    move-object/from16 v27, v26

    .line 470
    .line 471
    move-object/from16 v28, v27

    .line 472
    .line 473
    move-object/from16 v29, v28

    .line 474
    .line 475
    :goto_5
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 476
    .line 477
    .line 478
    move-result v3

    .line 479
    if-ge v3, v2, :cond_f

    .line 480
    .line 481
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 482
    .line 483
    .line 484
    move-result v3

    .line 485
    int-to-char v4, v3

    .line 486
    packed-switch v4, :pswitch_data_3

    .line 487
    .line 488
    .line 489
    :pswitch_1d
    invoke-static {v1, v3}, Lgi2;->y(Landroid/os/Parcel;I)V

    .line 490
    .line 491
    .line 492
    goto :goto_5

    .line 493
    :pswitch_1e
    invoke-static {v1, v3}, Lgi2;->w(Landroid/os/Parcel;I)J

    .line 494
    .line 495
    .line 496
    move-result-wide v3

    .line 497
    move-wide/from16 v31, v3

    .line 498
    .line 499
    goto :goto_5

    .line 500
    :pswitch_1f
    invoke-static {v1, v3}, Lgi2;->t(Landroid/os/Parcel;I)Z

    .line 501
    .line 502
    .line 503
    move-result v3

    .line 504
    move/from16 v30, v3

    .line 505
    .line 506
    goto :goto_5

    .line 507
    :pswitch_20
    invoke-static {v1, v3}, Lgi2;->u(Landroid/os/Parcel;I)Landroid/os/IBinder;

    .line 508
    .line 509
    .line 510
    move-result-object v3

    .line 511
    move-object/from16 v29, v3

    .line 512
    .line 513
    goto :goto_5

    .line 514
    :pswitch_21
    invoke-static {v1, v3}, Lgi2;->u(Landroid/os/Parcel;I)Landroid/os/IBinder;

    .line 515
    .line 516
    .line 517
    move-result-object v3

    .line 518
    move-object/from16 v28, v3

    .line 519
    .line 520
    goto :goto_5

    .line 521
    :pswitch_22
    invoke-static {v1, v3}, Lgi2;->u(Landroid/os/Parcel;I)Landroid/os/IBinder;

    .line 522
    .line 523
    .line 524
    move-result-object v3

    .line 525
    move-object/from16 v27, v3

    .line 526
    .line 527
    goto :goto_5

    .line 528
    :pswitch_23
    invoke-static {v1, v3}, Lgi2;->g(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 529
    .line 530
    .line 531
    move-result-object v3

    .line 532
    move-object/from16 v26, v3

    .line 533
    .line 534
    goto :goto_5

    .line 535
    :pswitch_24
    invoke-static {v1, v3}, Lgi2;->g(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 536
    .line 537
    .line 538
    move-result-object v3

    .line 539
    move-object/from16 v25, v3

    .line 540
    .line 541
    goto :goto_5

    .line 542
    :pswitch_25
    invoke-static {v1, v3}, Lgi2;->g(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 543
    .line 544
    .line 545
    move-result-object v3

    .line 546
    move-object/from16 v24, v3

    .line 547
    .line 548
    goto :goto_5

    .line 549
    :pswitch_26
    invoke-static {v1, v3}, Lgi2;->u(Landroid/os/Parcel;I)Landroid/os/IBinder;

    .line 550
    .line 551
    .line 552
    move-result-object v3

    .line 553
    move-object/from16 v23, v3

    .line 554
    .line 555
    goto :goto_5

    .line 556
    :pswitch_27
    sget-object v4, Lzb4;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 557
    .line 558
    invoke-static {v1, v3, v4}, Lgi2;->f(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 559
    .line 560
    .line 561
    move-result-object v3

    .line 562
    check-cast v3, Lzb4;

    .line 563
    .line 564
    move-object/from16 v22, v3

    .line 565
    .line 566
    goto :goto_5

    .line 567
    :pswitch_28
    invoke-static {v1, v3}, Lgi2;->g(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 568
    .line 569
    .line 570
    move-result-object v3

    .line 571
    move-object/from16 v21, v3

    .line 572
    .line 573
    goto :goto_5

    .line 574
    :pswitch_29
    sget-object v4, Le51;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 575
    .line 576
    invoke-static {v1, v3, v4}, Lgi2;->f(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 577
    .line 578
    .line 579
    move-result-object v3

    .line 580
    check-cast v3, Le51;

    .line 581
    .line 582
    move-object/from16 v20, v3

    .line 583
    .line 584
    goto :goto_5

    .line 585
    :pswitch_2a
    invoke-static {v1, v3}, Lgi2;->g(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 586
    .line 587
    .line 588
    move-result-object v3

    .line 589
    move-object/from16 v19, v3

    .line 590
    .line 591
    goto :goto_5

    .line 592
    :pswitch_2b
    invoke-static {v1, v3}, Lgi2;->v(Landroid/os/Parcel;I)I

    .line 593
    .line 594
    .line 595
    move-result v3

    .line 596
    move/from16 v18, v3

    .line 597
    .line 598
    goto :goto_5

    .line 599
    :pswitch_2c
    invoke-static {v1, v3}, Lgi2;->v(Landroid/os/Parcel;I)I

    .line 600
    .line 601
    .line 602
    move-result v3

    .line 603
    move/from16 v17, v3

    .line 604
    .line 605
    goto/16 :goto_5

    .line 606
    .line 607
    :pswitch_2d
    invoke-static {v1, v3}, Lgi2;->u(Landroid/os/Parcel;I)Landroid/os/IBinder;

    .line 608
    .line 609
    .line 610
    move-result-object v3

    .line 611
    move-object/from16 v16, v3

    .line 612
    .line 613
    goto/16 :goto_5

    .line 614
    .line 615
    :pswitch_2e
    invoke-static {v1, v3}, Lgi2;->g(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 616
    .line 617
    .line 618
    move-result-object v3

    .line 619
    move-object v15, v3

    .line 620
    goto/16 :goto_5

    .line 621
    .line 622
    :pswitch_2f
    invoke-static {v1, v3}, Lgi2;->t(Landroid/os/Parcel;I)Z

    .line 623
    .line 624
    .line 625
    move-result v3

    .line 626
    move v14, v3

    .line 627
    goto/16 :goto_5

    .line 628
    .line 629
    :pswitch_30
    invoke-static {v1, v3}, Lgi2;->g(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 630
    .line 631
    .line 632
    move-result-object v3

    .line 633
    move-object v13, v3

    .line 634
    goto/16 :goto_5

    .line 635
    .line 636
    :pswitch_31
    invoke-static {v1, v3}, Lgi2;->u(Landroid/os/Parcel;I)Landroid/os/IBinder;

    .line 637
    .line 638
    .line 639
    move-result-object v3

    .line 640
    move-object v12, v3

    .line 641
    goto/16 :goto_5

    .line 642
    .line 643
    :pswitch_32
    invoke-static {v1, v3}, Lgi2;->u(Landroid/os/Parcel;I)Landroid/os/IBinder;

    .line 644
    .line 645
    .line 646
    move-result-object v3

    .line 647
    move-object v11, v3

    .line 648
    goto/16 :goto_5

    .line 649
    .line 650
    :pswitch_33
    invoke-static {v1, v3}, Lgi2;->u(Landroid/os/Parcel;I)Landroid/os/IBinder;

    .line 651
    .line 652
    .line 653
    move-result-object v3

    .line 654
    move-object v10, v3

    .line 655
    goto/16 :goto_5

    .line 656
    .line 657
    :pswitch_34
    invoke-static {v1, v3}, Lgi2;->u(Landroid/os/Parcel;I)Landroid/os/IBinder;

    .line 658
    .line 659
    .line 660
    move-result-object v3

    .line 661
    move-object v9, v3

    .line 662
    goto/16 :goto_5

    .line 663
    .line 664
    :pswitch_35
    sget-object v4, Lfc2;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 665
    .line 666
    invoke-static {v1, v3, v4}, Lgi2;->f(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 667
    .line 668
    .line 669
    move-result-object v3

    .line 670
    check-cast v3, Lfc2;

    .line 671
    .line 672
    move-object v8, v3

    .line 673
    goto/16 :goto_5

    .line 674
    .line 675
    :cond_f
    invoke-static {v1, v2}, Lgi2;->k(Landroid/os/Parcel;I)V

    .line 676
    .line 677
    .line 678
    new-instance v7, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    .line 679
    .line 680
    invoke-direct/range {v7 .. v32}, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;-><init>(Lfc2;Landroid/os/IBinder;Landroid/os/IBinder;Landroid/os/IBinder;Landroid/os/IBinder;Ljava/lang/String;ZLjava/lang/String;Landroid/os/IBinder;IILjava/lang/String;Le51;Ljava/lang/String;Lzb4;Landroid/os/IBinder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/os/IBinder;Landroid/os/IBinder;Landroid/os/IBinder;ZJ)V

    .line 681
    .line 682
    .line 683
    return-object v7

    .line 684
    :pswitch_36
    invoke-static {v1}, Lgi2;->z(Landroid/os/Parcel;)I

    .line 685
    .line 686
    .line 687
    move-result v2

    .line 688
    const-wide/16 v3, 0x0

    .line 689
    .line 690
    const/4 v5, 0x0

    .line 691
    const/4 v6, 0x0

    .line 692
    move-wide v9, v3

    .line 693
    move-wide/from16 v34, v9

    .line 694
    .line 695
    move-wide/from16 v36, v34

    .line 696
    .line 697
    move v8, v5

    .line 698
    move v12, v8

    .line 699
    move v14, v12

    .line 700
    move v15, v14

    .line 701
    move/from16 v16, v15

    .line 702
    .line 703
    move/from16 v26, v16

    .line 704
    .line 705
    move/from16 v28, v26

    .line 706
    .line 707
    move/from16 v31, v28

    .line 708
    .line 709
    move/from16 v33, v31

    .line 710
    .line 711
    move-object v11, v6

    .line 712
    move-object v13, v11

    .line 713
    move-object/from16 v17, v13

    .line 714
    .line 715
    move-object/from16 v18, v17

    .line 716
    .line 717
    move-object/from16 v19, v18

    .line 718
    .line 719
    move-object/from16 v20, v19

    .line 720
    .line 721
    move-object/from16 v21, v20

    .line 722
    .line 723
    move-object/from16 v22, v21

    .line 724
    .line 725
    move-object/from16 v23, v22

    .line 726
    .line 727
    move-object/from16 v24, v23

    .line 728
    .line 729
    move-object/from16 v25, v24

    .line 730
    .line 731
    move-object/from16 v27, v25

    .line 732
    .line 733
    move-object/from16 v29, v27

    .line 734
    .line 735
    move-object/from16 v30, v29

    .line 736
    .line 737
    move-object/from16 v32, v30

    .line 738
    .line 739
    :goto_6
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 740
    .line 741
    .line 742
    move-result v3

    .line 743
    if-ge v3, v2, :cond_10

    .line 744
    .line 745
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 746
    .line 747
    .line 748
    move-result v3

    .line 749
    int-to-char v4, v3

    .line 750
    packed-switch v4, :pswitch_data_4

    .line 751
    .line 752
    .line 753
    invoke-static {v1, v3}, Lgi2;->y(Landroid/os/Parcel;I)V

    .line 754
    .line 755
    .line 756
    goto :goto_6

    .line 757
    :pswitch_37
    invoke-static {v1, v3}, Lgi2;->w(Landroid/os/Parcel;I)J

    .line 758
    .line 759
    .line 760
    move-result-wide v3

    .line 761
    move-wide/from16 v36, v3

    .line 762
    .line 763
    goto :goto_6

    .line 764
    :pswitch_38
    invoke-static {v1, v3}, Lgi2;->w(Landroid/os/Parcel;I)J

    .line 765
    .line 766
    .line 767
    move-result-wide v3

    .line 768
    move-wide/from16 v34, v3

    .line 769
    .line 770
    goto :goto_6

    .line 771
    :pswitch_39
    invoke-static {v1, v3}, Lgi2;->v(Landroid/os/Parcel;I)I

    .line 772
    .line 773
    .line 774
    move-result v3

    .line 775
    move/from16 v33, v3

    .line 776
    .line 777
    goto :goto_6

    .line 778
    :pswitch_3a
    invoke-static {v1, v3}, Lgi2;->g(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 779
    .line 780
    .line 781
    move-result-object v3

    .line 782
    move-object/from16 v32, v3

    .line 783
    .line 784
    goto :goto_6

    .line 785
    :pswitch_3b
    invoke-static {v1, v3}, Lgi2;->v(Landroid/os/Parcel;I)I

    .line 786
    .line 787
    .line 788
    move-result v3

    .line 789
    move/from16 v31, v3

    .line 790
    .line 791
    goto :goto_6

    .line 792
    :pswitch_3c
    invoke-static {v1, v3}, Lgi2;->i(Landroid/os/Parcel;I)Ljava/util/ArrayList;

    .line 793
    .line 794
    .line 795
    move-result-object v3

    .line 796
    move-object/from16 v30, v3

    .line 797
    .line 798
    goto :goto_6

    .line 799
    :pswitch_3d
    invoke-static {v1, v3}, Lgi2;->g(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 800
    .line 801
    .line 802
    move-result-object v3

    .line 803
    move-object/from16 v29, v3

    .line 804
    .line 805
    goto :goto_6

    .line 806
    :pswitch_3e
    invoke-static {v1, v3}, Lgi2;->v(Landroid/os/Parcel;I)I

    .line 807
    .line 808
    .line 809
    move-result v3

    .line 810
    move/from16 v28, v3

    .line 811
    .line 812
    goto :goto_6

    .line 813
    :pswitch_3f
    sget-object v4, Lec2;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 814
    .line 815
    invoke-static {v1, v3, v4}, Lgi2;->f(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 816
    .line 817
    .line 818
    move-result-object v3

    .line 819
    check-cast v3, Lec2;

    .line 820
    .line 821
    move-object/from16 v27, v3

    .line 822
    .line 823
    goto :goto_6

    .line 824
    :pswitch_40
    invoke-static {v1, v3}, Lgi2;->t(Landroid/os/Parcel;I)Z

    .line 825
    .line 826
    .line 827
    move-result v3

    .line 828
    move/from16 v26, v3

    .line 829
    .line 830
    goto :goto_6

    .line 831
    :pswitch_41
    invoke-static {v1, v3}, Lgi2;->g(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 832
    .line 833
    .line 834
    move-result-object v3

    .line 835
    move-object/from16 v25, v3

    .line 836
    .line 837
    goto :goto_6

    .line 838
    :pswitch_42
    invoke-static {v1, v3}, Lgi2;->g(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 839
    .line 840
    .line 841
    move-result-object v3

    .line 842
    move-object/from16 v24, v3

    .line 843
    .line 844
    goto :goto_6

    .line 845
    :pswitch_43
    invoke-static {v1, v3}, Lgi2;->i(Landroid/os/Parcel;I)Ljava/util/ArrayList;

    .line 846
    .line 847
    .line 848
    move-result-object v3

    .line 849
    move-object/from16 v23, v3

    .line 850
    .line 851
    goto :goto_6

    .line 852
    :pswitch_44
    invoke-static {v1, v3}, Lgi2;->d(Landroid/os/Parcel;I)Landroid/os/Bundle;

    .line 853
    .line 854
    .line 855
    move-result-object v3

    .line 856
    move-object/from16 v22, v3

    .line 857
    .line 858
    goto :goto_6

    .line 859
    :pswitch_45
    invoke-static {v1, v3}, Lgi2;->d(Landroid/os/Parcel;I)Landroid/os/Bundle;

    .line 860
    .line 861
    .line 862
    move-result-object v3

    .line 863
    move-object/from16 v21, v3

    .line 864
    .line 865
    goto :goto_6

    .line 866
    :pswitch_46
    invoke-static {v1, v3}, Lgi2;->g(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 867
    .line 868
    .line 869
    move-result-object v3

    .line 870
    move-object/from16 v20, v3

    .line 871
    .line 872
    goto/16 :goto_6

    .line 873
    .line 874
    :pswitch_47
    sget-object v4, Landroid/location/Location;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 875
    .line 876
    invoke-static {v1, v3, v4}, Lgi2;->f(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 877
    .line 878
    .line 879
    move-result-object v3

    .line 880
    check-cast v3, Landroid/location/Location;

    .line 881
    .line 882
    move-object/from16 v19, v3

    .line 883
    .line 884
    goto/16 :goto_6

    .line 885
    .line 886
    :pswitch_48
    sget-object v4, Lqf3;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 887
    .line 888
    invoke-static {v1, v3, v4}, Lgi2;->f(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 889
    .line 890
    .line 891
    move-result-object v3

    .line 892
    check-cast v3, Lqf3;

    .line 893
    .line 894
    move-object/from16 v18, v3

    .line 895
    .line 896
    goto/16 :goto_6

    .line 897
    .line 898
    :pswitch_49
    invoke-static {v1, v3}, Lgi2;->g(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 899
    .line 900
    .line 901
    move-result-object v3

    .line 902
    move-object/from16 v17, v3

    .line 903
    .line 904
    goto/16 :goto_6

    .line 905
    .line 906
    :pswitch_4a
    invoke-static {v1, v3}, Lgi2;->t(Landroid/os/Parcel;I)Z

    .line 907
    .line 908
    .line 909
    move-result v3

    .line 910
    move/from16 v16, v3

    .line 911
    .line 912
    goto/16 :goto_6

    .line 913
    .line 914
    :pswitch_4b
    invoke-static {v1, v3}, Lgi2;->v(Landroid/os/Parcel;I)I

    .line 915
    .line 916
    .line 917
    move-result v3

    .line 918
    move v15, v3

    .line 919
    goto/16 :goto_6

    .line 920
    .line 921
    :pswitch_4c
    invoke-static {v1, v3}, Lgi2;->t(Landroid/os/Parcel;I)Z

    .line 922
    .line 923
    .line 924
    move-result v3

    .line 925
    move v14, v3

    .line 926
    goto/16 :goto_6

    .line 927
    .line 928
    :pswitch_4d
    invoke-static {v1, v3}, Lgi2;->i(Landroid/os/Parcel;I)Ljava/util/ArrayList;

    .line 929
    .line 930
    .line 931
    move-result-object v3

    .line 932
    move-object v13, v3

    .line 933
    goto/16 :goto_6

    .line 934
    .line 935
    :pswitch_4e
    invoke-static {v1, v3}, Lgi2;->v(Landroid/os/Parcel;I)I

    .line 936
    .line 937
    .line 938
    move-result v3

    .line 939
    move v12, v3

    .line 940
    goto/16 :goto_6

    .line 941
    .line 942
    :pswitch_4f
    invoke-static {v1, v3}, Lgi2;->d(Landroid/os/Parcel;I)Landroid/os/Bundle;

    .line 943
    .line 944
    .line 945
    move-result-object v3

    .line 946
    move-object v11, v3

    .line 947
    goto/16 :goto_6

    .line 948
    .line 949
    :pswitch_50
    invoke-static {v1, v3}, Lgi2;->w(Landroid/os/Parcel;I)J

    .line 950
    .line 951
    .line 952
    move-result-wide v3

    .line 953
    move-wide v9, v3

    .line 954
    goto/16 :goto_6

    .line 955
    .line 956
    :pswitch_51
    invoke-static {v1, v3}, Lgi2;->v(Landroid/os/Parcel;I)I

    .line 957
    .line 958
    .line 959
    move-result v3

    .line 960
    move v8, v3

    .line 961
    goto/16 :goto_6

    .line 962
    .line 963
    :cond_10
    invoke-static {v1, v2}, Lgi2;->k(Landroid/os/Parcel;I)V

    .line 964
    .line 965
    .line 966
    new-instance v7, Lpc4;

    .line 967
    .line 968
    invoke-direct/range {v7 .. v37}, Lpc4;-><init>(IJLandroid/os/Bundle;ILjava/util/List;ZIZLjava/lang/String;Lqf3;Landroid/location/Location;Ljava/lang/String;Landroid/os/Bundle;Landroid/os/Bundle;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;ZLec2;ILjava/lang/String;Ljava/util/List;ILjava/lang/String;IJJ)V

    .line 969
    .line 970
    .line 971
    return-object v7

    .line 972
    :pswitch_52
    new-instance v2, Lie4;

    .line 973
    .line 974
    invoke-direct {v2, v1}, Lie4;-><init>(Landroid/os/Parcel;)V

    .line 975
    .line 976
    .line 977
    return-object v2

    .line 978
    :pswitch_53
    invoke-static {v1}, Lgi2;->z(Landroid/os/Parcel;)I

    .line 979
    .line 980
    .line 981
    move-result v2

    .line 982
    new-instance v3, Landroid/os/Bundle;

    .line 983
    .line 984
    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 985
    .line 986
    .line 987
    sget-object v4, Lxy;->t:[Lcom/google/android/gms/common/api/Scope;

    .line 988
    .line 989
    const/4 v5, 0x0

    .line 990
    const/4 v6, 0x0

    .line 991
    sget-object v7, Lxy;->u:[Lju;

    .line 992
    .line 993
    move-object v15, v3

    .line 994
    move-object v14, v4

    .line 995
    move-object v12, v5

    .line 996
    move-object v13, v12

    .line 997
    move-object/from16 v16, v13

    .line 998
    .line 999
    move-object/from16 v22, v16

    .line 1000
    .line 1001
    move v9, v6

    .line 1002
    move v10, v9

    .line 1003
    move v11, v10

    .line 1004
    move/from16 v19, v11

    .line 1005
    .line 1006
    move/from16 v20, v19

    .line 1007
    .line 1008
    move/from16 v21, v20

    .line 1009
    .line 1010
    move-object/from16 v17, v7

    .line 1011
    .line 1012
    move-object/from16 v18, v17

    .line 1013
    .line 1014
    :goto_7
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1015
    .line 1016
    .line 1017
    move-result v3

    .line 1018
    if-ge v3, v2, :cond_11

    .line 1019
    .line 1020
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1021
    .line 1022
    .line 1023
    move-result v3

    .line 1024
    int-to-char v4, v3

    .line 1025
    packed-switch v4, :pswitch_data_5

    .line 1026
    .line 1027
    .line 1028
    :pswitch_54
    invoke-static {v1, v3}, Lgi2;->y(Landroid/os/Parcel;I)V

    .line 1029
    .line 1030
    .line 1031
    goto :goto_7

    .line 1032
    :pswitch_55
    invoke-static {v1, v3}, Lgi2;->g(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1033
    .line 1034
    .line 1035
    move-result-object v22

    .line 1036
    goto :goto_7

    .line 1037
    :pswitch_56
    invoke-static {v1, v3}, Lgi2;->t(Landroid/os/Parcel;I)Z

    .line 1038
    .line 1039
    .line 1040
    move-result v21

    .line 1041
    goto :goto_7

    .line 1042
    :pswitch_57
    invoke-static {v1, v3}, Lgi2;->v(Landroid/os/Parcel;I)I

    .line 1043
    .line 1044
    .line 1045
    move-result v20

    .line 1046
    goto :goto_7

    .line 1047
    :pswitch_58
    invoke-static {v1, v3}, Lgi2;->t(Landroid/os/Parcel;I)Z

    .line 1048
    .line 1049
    .line 1050
    move-result v19

    .line 1051
    goto :goto_7

    .line 1052
    :pswitch_59
    sget-object v4, Lju;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1053
    .line 1054
    invoke-static {v1, v3, v4}, Lgi2;->j(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)[Ljava/lang/Object;

    .line 1055
    .line 1056
    .line 1057
    move-result-object v3

    .line 1058
    move-object/from16 v18, v3

    .line 1059
    .line 1060
    check-cast v18, [Lju;

    .line 1061
    .line 1062
    goto :goto_7

    .line 1063
    :pswitch_5a
    sget-object v4, Lju;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1064
    .line 1065
    invoke-static {v1, v3, v4}, Lgi2;->j(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)[Ljava/lang/Object;

    .line 1066
    .line 1067
    .line 1068
    move-result-object v3

    .line 1069
    move-object/from16 v17, v3

    .line 1070
    .line 1071
    check-cast v17, [Lju;

    .line 1072
    .line 1073
    goto :goto_7

    .line 1074
    :pswitch_5b
    sget-object v4, Landroid/accounts/Account;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1075
    .line 1076
    invoke-static {v1, v3, v4}, Lgi2;->f(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1077
    .line 1078
    .line 1079
    move-result-object v3

    .line 1080
    move-object/from16 v16, v3

    .line 1081
    .line 1082
    check-cast v16, Landroid/accounts/Account;

    .line 1083
    .line 1084
    goto :goto_7

    .line 1085
    :pswitch_5c
    invoke-static {v1, v3}, Lgi2;->d(Landroid/os/Parcel;I)Landroid/os/Bundle;

    .line 1086
    .line 1087
    .line 1088
    move-result-object v15

    .line 1089
    goto :goto_7

    .line 1090
    :pswitch_5d
    sget-object v4, Lcom/google/android/gms/common/api/Scope;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1091
    .line 1092
    invoke-static {v1, v3, v4}, Lgi2;->j(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)[Ljava/lang/Object;

    .line 1093
    .line 1094
    .line 1095
    move-result-object v3

    .line 1096
    move-object v14, v3

    .line 1097
    check-cast v14, [Lcom/google/android/gms/common/api/Scope;

    .line 1098
    .line 1099
    goto :goto_7

    .line 1100
    :pswitch_5e
    invoke-static {v1, v3}, Lgi2;->u(Landroid/os/Parcel;I)Landroid/os/IBinder;

    .line 1101
    .line 1102
    .line 1103
    move-result-object v13

    .line 1104
    goto :goto_7

    .line 1105
    :pswitch_5f
    invoke-static {v1, v3}, Lgi2;->g(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1106
    .line 1107
    .line 1108
    move-result-object v12

    .line 1109
    goto :goto_7

    .line 1110
    :pswitch_60
    invoke-static {v1, v3}, Lgi2;->v(Landroid/os/Parcel;I)I

    .line 1111
    .line 1112
    .line 1113
    move-result v11

    .line 1114
    goto :goto_7

    .line 1115
    :pswitch_61
    invoke-static {v1, v3}, Lgi2;->v(Landroid/os/Parcel;I)I

    .line 1116
    .line 1117
    .line 1118
    move-result v10

    .line 1119
    goto :goto_7

    .line 1120
    :pswitch_62
    invoke-static {v1, v3}, Lgi2;->v(Landroid/os/Parcel;I)I

    .line 1121
    .line 1122
    .line 1123
    move-result v9

    .line 1124
    goto :goto_7

    .line 1125
    :cond_11
    invoke-static {v1, v2}, Lgi2;->k(Landroid/os/Parcel;I)V

    .line 1126
    .line 1127
    .line 1128
    new-instance v8, Lxy;

    .line 1129
    .line 1130
    invoke-direct/range {v8 .. v22}, Lxy;-><init>(IIILjava/lang/String;Landroid/os/IBinder;[Lcom/google/android/gms/common/api/Scope;Landroid/os/Bundle;Landroid/accounts/Account;[Lju;[Lju;ZIZLjava/lang/String;)V

    .line 1131
    .line 1132
    .line 1133
    return-object v8

    .line 1134
    nop

    .line 1135
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_53
        :pswitch_52
        :pswitch_36
        :pswitch_1c
        :pswitch_1b
        :pswitch_b
        :pswitch_a
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
    .end packed-switch

    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    :pswitch_data_2
    .packed-switch 0x2
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
    .end packed-switch

    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    :pswitch_data_3
    .packed-switch 0x2
        :pswitch_35
        :pswitch_34
        :pswitch_33
        :pswitch_32
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_1d
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_1d
        :pswitch_1d
        :pswitch_1d
        :pswitch_1d
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
    .end packed-switch

    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    :pswitch_data_4
    .packed-switch 0x1
        :pswitch_51
        :pswitch_50
        :pswitch_4f
        :pswitch_4e
        :pswitch_4d
        :pswitch_4c
        :pswitch_4b
        :pswitch_4a
        :pswitch_49
        :pswitch_48
        :pswitch_47
        :pswitch_46
        :pswitch_45
        :pswitch_44
        :pswitch_43
        :pswitch_42
        :pswitch_41
        :pswitch_40
        :pswitch_3f
        :pswitch_3e
        :pswitch_3d
        :pswitch_3c
        :pswitch_3b
        :pswitch_3a
        :pswitch_39
        :pswitch_38
        :pswitch_37
    .end packed-switch

    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    :pswitch_data_5
    .packed-switch 0x1
        :pswitch_62
        :pswitch_61
        :pswitch_60
        :pswitch_5f
        :pswitch_5e
        :pswitch_5d
        :pswitch_5c
        :pswitch_5b
        :pswitch_54
        :pswitch_5a
        :pswitch_59
        :pswitch_58
        :pswitch_57
        :pswitch_56
        :pswitch_55
    .end packed-switch
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Led4;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-array p1, p1, [Lvi4;

    .line 7
    .line 8
    return-object p1

    .line 9
    :pswitch_0
    new-array p1, p1, [Le51;

    .line 10
    .line 11
    return-object p1

    .line 12
    :pswitch_1
    new-array p1, p1, [Lqh4;

    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_2
    new-array p1, p1, [Ldg4;

    .line 16
    .line 17
    return-object p1

    .line 18
    :pswitch_3
    new-array p1, p1, [Lxe4;

    .line 19
    .line 20
    return-object p1

    .line 21
    :pswitch_4
    new-array p1, p1, [Lvd4;

    .line 22
    .line 23
    return-object p1

    .line 24
    :pswitch_5
    new-array p1, p1, [Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    .line 25
    .line 26
    return-object p1

    .line 27
    :pswitch_6
    new-array p1, p1, [Lpc4;

    .line 28
    .line 29
    return-object p1

    .line 30
    :pswitch_7
    new-array p1, p1, [Lie4;

    .line 31
    .line 32
    return-object p1

    .line 33
    :pswitch_8
    new-array p1, p1, [Lxy;

    .line 34
    .line 35
    return-object p1

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
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
