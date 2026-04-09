.class public final Lx24;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lor3;


# instance fields
.field public final synthetic a:I

.field public final b:[B

.field public final c:[B

.field public final d:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lor3;[B[B)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lx24;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx24;->d:Ljava/lang/Object;

    iput-object p2, p0, Lx24;->b:[B

    iput-object p3, p0, Lx24;->c:[B

    return-void
.end method

.method public constructor <init>([B[B[B)V
    .locals 2

    const/4 v0, 0x1

    iput v0, p0, Lx24;->a:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {v0}, Lyb;->x(I)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 3
    array-length v0, p1

    const/16 v1, 0x20

    if-ne v0, v1, :cond_1

    .line 4
    invoke-static {p1}, Lv34;->a([B)Lv34;

    move-result-object p1

    iput-object p1, p0, Lx24;->d:Ljava/lang/Object;

    iput-object p2, p0, Lx24;->b:[B

    iput-object p3, p0, Lx24;->c:[B

    .line 5
    sget-object p1, Lpu3;->a:[J

    if-eqz p1, :cond_0

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Could not initialize Ed25519."

    .line 6
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 7
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 8
    const-string p2, "Given public key\'s length is not 32."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 9
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 10
    new-instance p2, Ljava/security/GeneralSecurityException;

    const-string p3, "Can not use Ed25519 in FIPS-mode."

    invoke-direct {p2, p3}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    throw p1
.end method

.method public static a(Lfw3;)[B
    .locals 2

    .line 1
    iget-object v0, p0, Lfw3;->j:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Li04;

    .line 4
    .line 5
    iget-object p0, p0, Lfw3;->k:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Ljava/lang/Integer;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v1, 0x1

    .line 14
    if-eq v0, v1, :cond_3

    .line 15
    .line 16
    const/4 v1, 0x2

    .line 17
    if-eq v0, v1, :cond_2

    .line 18
    .line 19
    const/4 v1, 0x3

    .line 20
    if-eq v0, v1, :cond_1

    .line 21
    .line 22
    const/4 v1, 0x4

    .line 23
    if-ne v0, v1, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    .line 27
    .line 28
    const-string v0, "unknown output prefix type"

    .line 29
    .line 30
    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    throw p0

    .line 34
    :cond_1
    sget-object p0, Lsv3;->a:Lv34;

    .line 35
    .line 36
    invoke-virtual {p0}, Lv34;->b()[B

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    return-object p0

    .line 41
    :cond_2
    :goto_0
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 42
    .line 43
    .line 44
    move-result p0

    .line 45
    invoke-static {p0}, Lsv3;->a(I)Lv34;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    invoke-virtual {p0}, Lv34;->b()[B

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    return-object p0

    .line 54
    :cond_3
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 55
    .line 56
    .line 57
    move-result p0

    .line 58
    invoke-static {p0}, Lsv3;->b(I)Lv34;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    invoke-virtual {p0}, Lv34;->b()[B

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    return-object p0
.end method


# virtual methods
.method public final b([B[B)V
    .locals 5

    .line 1
    iget v0, p0, Lx24;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lx24;->b:[B

    .line 7
    .line 8
    array-length v1, v0

    .line 9
    iget-object v2, p0, Lx24;->c:[B

    .line 10
    .line 11
    if-nez v1, :cond_1

    .line 12
    .line 13
    array-length v3, v2

    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    invoke-virtual {p0, p1, p2}, Lx24;->c([B[B)V

    .line 18
    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_1
    :goto_0
    invoke-static {v0, p1}, Low3;->c([B[B)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_3

    .line 26
    .line 27
    array-length v0, v2

    .line 28
    if-eqz v0, :cond_2

    .line 29
    .line 30
    filled-new-array {p2, v2}, [[B

    .line 31
    .line 32
    .line 33
    move-result-object p2

    .line 34
    invoke-static {p2}, Li41;->L([[B)[B

    .line 35
    .line 36
    .line 37
    move-result-object p2

    .line 38
    :cond_2
    array-length v0, p1

    .line 39
    invoke-static {p1, v1, v0}, Ljava/util/Arrays;->copyOfRange([BII)[B

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-virtual {p0, p1, p2}, Lx24;->c([B[B)V

    .line 44
    .line 45
    .line 46
    :goto_1
    return-void

    .line 47
    :cond_3
    new-instance p1, Ljava/security/GeneralSecurityException;

    .line 48
    .line 49
    const-string p2, "Invalid signature (output prefix mismatch)"

    .line 50
    .line 51
    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    throw p1

    .line 55
    :pswitch_0
    iget-object v0, p0, Lx24;->d:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v0, Lor3;

    .line 58
    .line 59
    iget-object v1, p0, Lx24;->b:[B

    .line 60
    .line 61
    array-length v2, v1

    .line 62
    iget-object v3, p0, Lx24;->c:[B

    .line 63
    .line 64
    if-nez v2, :cond_5

    .line 65
    .line 66
    array-length v4, v3

    .line 67
    if-eqz v4, :cond_4

    .line 68
    .line 69
    goto :goto_2

    .line 70
    :cond_4
    invoke-interface {v0, p1, p2}, Lor3;->b([B[B)V

    .line 71
    .line 72
    .line 73
    goto :goto_3

    .line 74
    :cond_5
    :goto_2
    invoke-static {v1, p1}, Low3;->c([B[B)Z

    .line 75
    .line 76
    .line 77
    move-result v1

    .line 78
    if-eqz v1, :cond_7

    .line 79
    .line 80
    array-length v1, v3

    .line 81
    if-eqz v1, :cond_6

    .line 82
    .line 83
    filled-new-array {p2, v3}, [[B

    .line 84
    .line 85
    .line 86
    move-result-object p2

    .line 87
    invoke-static {p2}, Li41;->L([[B)[B

    .line 88
    .line 89
    .line 90
    move-result-object p2

    .line 91
    :cond_6
    array-length v1, p1

    .line 92
    invoke-static {p1, v2, v1}, Ljava/util/Arrays;->copyOfRange([BII)[B

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    invoke-interface {v0, p1, p2}, Lor3;->b([B[B)V

    .line 97
    .line 98
    .line 99
    :goto_3
    return-void

    .line 100
    :cond_7
    new-instance p1, Ljava/security/GeneralSecurityException;

    .line 101
    .line 102
    const-string p2, "Invalid signature (output prefix mismatch)"

    .line 103
    .line 104
    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    throw p1

    .line 108
    nop

    .line 109
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public c([B[B)V
    .locals 116

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/16 v2, 0x40

    .line 5
    .line 6
    if-ne v1, v2, :cond_17

    .line 7
    .line 8
    move-object/from16 v1, p0

    .line 9
    .line 10
    iget-object v3, v1, Lx24;->d:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v3, Lv34;

    .line 13
    .line 14
    invoke-virtual {v3}, Lv34;->b()[B

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    array-length v4, v0

    .line 19
    if-ne v4, v2, :cond_16

    .line 20
    .line 21
    const/16 v4, 0x20

    .line 22
    .line 23
    invoke-static {v0, v4, v2}, Ljava/util/Arrays;->copyOfRange([BII)[B

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    const/16 v5, 0x1f

    .line 28
    .line 29
    move v6, v5

    .line 30
    :goto_0
    if-ltz v6, :cond_16

    .line 31
    .line 32
    aget-byte v7, v2, v6

    .line 33
    .line 34
    const/16 v8, 0xff

    .line 35
    .line 36
    and-int/2addr v7, v8

    .line 37
    sget-object v9, Lou1;->t:[B

    .line 38
    .line 39
    aget-byte v9, v9, v6

    .line 40
    .line 41
    and-int/2addr v9, v8

    .line 42
    if-eq v7, v9, :cond_15

    .line 43
    .line 44
    if-ge v7, v9, :cond_16

    .line 45
    .line 46
    sget-object v6, Lm34;->e:Lm34;

    .line 47
    .line 48
    const-string v7, "SHA-512"

    .line 49
    .line 50
    iget-object v6, v6, Lm34;->a:Ll34;

    .line 51
    .line 52
    invoke-interface {v6, v7}, Ll34;->l(Ljava/lang/String;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v6

    .line 56
    check-cast v6, Ljava/security/MessageDigest;

    .line 57
    .line 58
    const/4 v7, 0x0

    .line 59
    invoke-virtual {v6, v0, v7, v4}, Ljava/security/MessageDigest;->update([BII)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v6, v3}, Ljava/security/MessageDigest;->update([B)V

    .line 63
    .line 64
    .line 65
    move-object/from16 v9, p2

    .line 66
    .line 67
    invoke-virtual {v6, v9}, Ljava/security/MessageDigest;->update([B)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v6}, Ljava/security/MessageDigest;->digest()[B

    .line 71
    .line 72
    .line 73
    move-result-object v6

    .line 74
    invoke-static {v7, v6}, Lou1;->d0(I[B)J

    .line 75
    .line 76
    .line 77
    move-result-wide v9

    .line 78
    const-wide/32 v11, 0x1fffff

    .line 79
    .line 80
    .line 81
    and-long/2addr v9, v11

    .line 82
    const/4 v13, 0x2

    .line 83
    invoke-static {v13, v6}, Lou1;->e0(I[B)J

    .line 84
    .line 85
    .line 86
    move-result-wide v14

    .line 87
    move/from16 v16, v7

    .line 88
    .line 89
    const/4 v7, 0x5

    .line 90
    shr-long/2addr v14, v7

    .line 91
    invoke-static {v7, v6}, Lou1;->d0(I[B)J

    .line 92
    .line 93
    .line 94
    move-result-wide v17

    .line 95
    shr-long v17, v17, v13

    .line 96
    .line 97
    move-wide/from16 v19, v11

    .line 98
    .line 99
    const/4 v11, 0x7

    .line 100
    invoke-static {v11, v6}, Lou1;->e0(I[B)J

    .line 101
    .line 102
    .line 103
    move-result-wide v21

    .line 104
    shr-long v21, v21, v11

    .line 105
    .line 106
    const/16 v12, 0xa

    .line 107
    .line 108
    invoke-static {v12, v6}, Lou1;->e0(I[B)J

    .line 109
    .line 110
    .line 111
    move-result-wide v23

    .line 112
    const/16 v25, 0x4

    .line 113
    .line 114
    shr-long v23, v23, v25

    .line 115
    .line 116
    move/from16 p2, v11

    .line 117
    .line 118
    const/16 v11, 0xd

    .line 119
    .line 120
    invoke-static {v11, v6}, Lou1;->d0(I[B)J

    .line 121
    .line 122
    .line 123
    move-result-wide v26

    .line 124
    const/16 v28, 0x1

    .line 125
    .line 126
    shr-long v26, v26, v28

    .line 127
    .line 128
    move/from16 v29, v11

    .line 129
    .line 130
    const/16 v11, 0xf

    .line 131
    .line 132
    invoke-static {v11, v6}, Lou1;->e0(I[B)J

    .line 133
    .line 134
    .line 135
    move-result-wide v30

    .line 136
    const/16 v32, 0x6

    .line 137
    .line 138
    shr-long v30, v30, v32

    .line 139
    .line 140
    move/from16 v33, v11

    .line 141
    .line 142
    const/16 v11, 0x12

    .line 143
    .line 144
    invoke-static {v11, v6}, Lou1;->d0(I[B)J

    .line 145
    .line 146
    .line 147
    move-result-wide v34

    .line 148
    const/16 v36, 0x3

    .line 149
    .line 150
    shr-long v34, v34, v36

    .line 151
    .line 152
    move/from16 v37, v11

    .line 153
    .line 154
    const/16 v11, 0x15

    .line 155
    .line 156
    invoke-static {v11, v6}, Lou1;->d0(I[B)J

    .line 157
    .line 158
    .line 159
    move-result-wide v38

    .line 160
    and-long v38, v38, v19

    .line 161
    .line 162
    move/from16 v40, v11

    .line 163
    .line 164
    const/16 v11, 0x17

    .line 165
    .line 166
    invoke-static {v11, v6}, Lou1;->e0(I[B)J

    .line 167
    .line 168
    .line 169
    move-result-wide v41

    .line 170
    shr-long v41, v41, v7

    .line 171
    .line 172
    move/from16 v43, v11

    .line 173
    .line 174
    const/16 v11, 0x1a

    .line 175
    .line 176
    invoke-static {v11, v6}, Lou1;->d0(I[B)J

    .line 177
    .line 178
    .line 179
    move-result-wide v44

    .line 180
    shr-long v44, v44, v13

    .line 181
    .line 182
    move/from16 v46, v11

    .line 183
    .line 184
    const/16 v11, 0x1c

    .line 185
    .line 186
    invoke-static {v11, v6}, Lou1;->e0(I[B)J

    .line 187
    .line 188
    .line 189
    move-result-wide v47

    .line 190
    shr-long v47, v47, p2

    .line 191
    .line 192
    invoke-static {v5, v6}, Lou1;->e0(I[B)J

    .line 193
    .line 194
    .line 195
    move-result-wide v49

    .line 196
    shr-long v49, v49, v25

    .line 197
    .line 198
    move/from16 v51, v5

    .line 199
    .line 200
    const/16 v5, 0x22

    .line 201
    .line 202
    invoke-static {v5, v6}, Lou1;->d0(I[B)J

    .line 203
    .line 204
    .line 205
    move-result-wide v52

    .line 206
    shr-long v52, v52, v28

    .line 207
    .line 208
    const/16 v5, 0x24

    .line 209
    .line 210
    invoke-static {v5, v6}, Lou1;->e0(I[B)J

    .line 211
    .line 212
    .line 213
    move-result-wide v54

    .line 214
    shr-long v54, v54, v32

    .line 215
    .line 216
    const/16 v5, 0x27

    .line 217
    .line 218
    invoke-static {v5, v6}, Lou1;->d0(I[B)J

    .line 219
    .line 220
    .line 221
    move-result-wide v56

    .line 222
    shr-long v56, v56, v36

    .line 223
    .line 224
    const/16 v5, 0x2a

    .line 225
    .line 226
    invoke-static {v5, v6}, Lou1;->d0(I[B)J

    .line 227
    .line 228
    .line 229
    move-result-wide v58

    .line 230
    and-long v58, v58, v19

    .line 231
    .line 232
    const/16 v5, 0x2c

    .line 233
    .line 234
    invoke-static {v5, v6}, Lou1;->e0(I[B)J

    .line 235
    .line 236
    .line 237
    move-result-wide v60

    .line 238
    shr-long v60, v60, v7

    .line 239
    .line 240
    const/16 v5, 0x2f

    .line 241
    .line 242
    invoke-static {v5, v6}, Lou1;->d0(I[B)J

    .line 243
    .line 244
    .line 245
    move-result-wide v62

    .line 246
    shr-long v62, v62, v13

    .line 247
    .line 248
    const/16 v5, 0x31

    .line 249
    .line 250
    invoke-static {v5, v6}, Lou1;->e0(I[B)J

    .line 251
    .line 252
    .line 253
    move-result-wide v64

    .line 254
    and-long v62, v62, v19

    .line 255
    .line 256
    and-long v54, v54, v19

    .line 257
    .line 258
    and-long v52, v52, v19

    .line 259
    .line 260
    and-long v49, v49, v19

    .line 261
    .line 262
    and-long v47, v47, v19

    .line 263
    .line 264
    and-long v44, v44, v19

    .line 265
    .line 266
    and-long v41, v41, v19

    .line 267
    .line 268
    and-long v30, v30, v19

    .line 269
    .line 270
    and-long v26, v26, v19

    .line 271
    .line 272
    and-long v23, v23, v19

    .line 273
    .line 274
    and-long v21, v21, v19

    .line 275
    .line 276
    and-long v17, v17, v19

    .line 277
    .line 278
    and-long v14, v14, v19

    .line 279
    .line 280
    and-long v60, v60, v19

    .line 281
    .line 282
    shr-long v64, v64, p2

    .line 283
    .line 284
    and-long v64, v64, v19

    .line 285
    .line 286
    const/16 v5, 0x34

    .line 287
    .line 288
    invoke-static {v5, v6}, Lou1;->e0(I[B)J

    .line 289
    .line 290
    .line 291
    move-result-wide v66

    .line 292
    shr-long v66, v66, v25

    .line 293
    .line 294
    and-long v66, v66, v19

    .line 295
    .line 296
    const/16 v5, 0x37

    .line 297
    .line 298
    invoke-static {v5, v6}, Lou1;->d0(I[B)J

    .line 299
    .line 300
    .line 301
    move-result-wide v68

    .line 302
    shr-long v68, v68, v28

    .line 303
    .line 304
    and-long v68, v68, v19

    .line 305
    .line 306
    const/16 v5, 0x39

    .line 307
    .line 308
    invoke-static {v5, v6}, Lou1;->e0(I[B)J

    .line 309
    .line 310
    .line 311
    move-result-wide v70

    .line 312
    shr-long v70, v70, v32

    .line 313
    .line 314
    and-long v19, v70, v19

    .line 315
    .line 316
    const/16 v5, 0x3c

    .line 317
    .line 318
    invoke-static {v5, v6}, Lou1;->e0(I[B)J

    .line 319
    .line 320
    .line 321
    move-result-wide v70

    .line 322
    shr-long v70, v70, v36

    .line 323
    .line 324
    const-wide/32 v72, 0xa2c13

    .line 325
    .line 326
    .line 327
    mul-long v74, v66, v72

    .line 328
    .line 329
    add-long v74, v74, v38

    .line 330
    .line 331
    mul-long v38, v64, v72

    .line 332
    .line 333
    add-long v38, v38, v34

    .line 334
    .line 335
    mul-long v34, v62, v72

    .line 336
    .line 337
    add-long v34, v34, v30

    .line 338
    .line 339
    const-wide/32 v30, 0x100000

    .line 340
    .line 341
    .line 342
    add-long v76, v34, v30

    .line 343
    .line 344
    shr-long v76, v76, v40

    .line 345
    .line 346
    shl-long v78, v76, v40

    .line 347
    .line 348
    const-wide/32 v80, 0x72d18

    .line 349
    .line 350
    .line 351
    mul-long v82, v64, v80

    .line 352
    .line 353
    add-long v82, v82, v74

    .line 354
    .line 355
    const-wide/32 v74, 0x9fb67

    .line 356
    .line 357
    .line 358
    mul-long v84, v62, v74

    .line 359
    .line 360
    add-long v84, v84, v82

    .line 361
    .line 362
    add-long v82, v84, v30

    .line 363
    .line 364
    shr-long v82, v82, v40

    .line 365
    .line 366
    shl-long v86, v82, v40

    .line 367
    .line 368
    mul-long v88, v19, v72

    .line 369
    .line 370
    add-long v88, v88, v44

    .line 371
    .line 372
    mul-long v44, v68, v80

    .line 373
    .line 374
    add-long v44, v44, v88

    .line 375
    .line 376
    mul-long v88, v66, v74

    .line 377
    .line 378
    add-long v88, v88, v44

    .line 379
    .line 380
    const-wide/32 v44, 0xf39ad

    .line 381
    .line 382
    .line 383
    mul-long v90, v64, v44

    .line 384
    .line 385
    sub-long v88, v88, v90

    .line 386
    .line 387
    const-wide/32 v90, 0x215d1

    .line 388
    .line 389
    .line 390
    mul-long v92, v62, v90

    .line 391
    .line 392
    add-long v92, v92, v88

    .line 393
    .line 394
    add-long v88, v92, v30

    .line 395
    .line 396
    shr-long v88, v88, v40

    .line 397
    .line 398
    shl-long v94, v88, v40

    .line 399
    .line 400
    mul-long v96, v70, v80

    .line 401
    .line 402
    add-long v96, v96, v49

    .line 403
    .line 404
    mul-long v49, v19, v74

    .line 405
    .line 406
    add-long v49, v49, v96

    .line 407
    .line 408
    mul-long v96, v68, v44

    .line 409
    .line 410
    sub-long v49, v49, v96

    .line 411
    .line 412
    mul-long v96, v66, v90

    .line 413
    .line 414
    add-long v96, v96, v49

    .line 415
    .line 416
    const-wide/32 v49, 0xa6f7d

    .line 417
    .line 418
    .line 419
    mul-long v98, v64, v49

    .line 420
    .line 421
    sub-long v96, v96, v98

    .line 422
    .line 423
    add-long v98, v96, v30

    .line 424
    .line 425
    shr-long v98, v98, v40

    .line 426
    .line 427
    shl-long v100, v98, v40

    .line 428
    .line 429
    mul-long v102, v70, v44

    .line 430
    .line 431
    sub-long v54, v54, v102

    .line 432
    .line 433
    mul-long v102, v19, v90

    .line 434
    .line 435
    add-long v102, v102, v54

    .line 436
    .line 437
    mul-long v54, v68, v49

    .line 438
    .line 439
    sub-long v102, v102, v54

    .line 440
    .line 441
    add-long v54, v102, v30

    .line 442
    .line 443
    shr-long v54, v54, v40

    .line 444
    .line 445
    shl-long v104, v54, v40

    .line 446
    .line 447
    mul-long v106, v70, v49

    .line 448
    .line 449
    sub-long v58, v58, v106

    .line 450
    .line 451
    add-long v106, v58, v30

    .line 452
    .line 453
    shr-long v106, v106, v40

    .line 454
    .line 455
    shl-long v108, v106, v40

    .line 456
    .line 457
    mul-long v110, v62, v80

    .line 458
    .line 459
    add-long v110, v110, v38

    .line 460
    .line 461
    add-long v110, v110, v76

    .line 462
    .line 463
    add-long v38, v110, v30

    .line 464
    .line 465
    shr-long v38, v38, v40

    .line 466
    .line 467
    shl-long v76, v38, v40

    .line 468
    .line 469
    mul-long v112, v68, v72

    .line 470
    .line 471
    add-long v112, v112, v41

    .line 472
    .line 473
    mul-long v41, v66, v80

    .line 474
    .line 475
    add-long v41, v41, v112

    .line 476
    .line 477
    mul-long v112, v64, v74

    .line 478
    .line 479
    add-long v112, v112, v41

    .line 480
    .line 481
    mul-long v41, v62, v44

    .line 482
    .line 483
    sub-long v112, v112, v41

    .line 484
    .line 485
    add-long v112, v112, v82

    .line 486
    .line 487
    add-long v41, v112, v30

    .line 488
    .line 489
    shr-long v41, v41, v40

    .line 490
    .line 491
    shl-long v82, v41, v40

    .line 492
    .line 493
    mul-long v114, v70, v72

    .line 494
    .line 495
    add-long v114, v114, v47

    .line 496
    .line 497
    mul-long v47, v19, v80

    .line 498
    .line 499
    add-long v47, v47, v114

    .line 500
    .line 501
    mul-long v114, v68, v74

    .line 502
    .line 503
    add-long v114, v114, v47

    .line 504
    .line 505
    mul-long v47, v66, v44

    .line 506
    .line 507
    sub-long v114, v114, v47

    .line 508
    .line 509
    mul-long v64, v64, v90

    .line 510
    .line 511
    add-long v64, v64, v114

    .line 512
    .line 513
    mul-long v62, v62, v49

    .line 514
    .line 515
    sub-long v64, v64, v62

    .line 516
    .line 517
    add-long v64, v64, v88

    .line 518
    .line 519
    add-long v47, v64, v30

    .line 520
    .line 521
    shr-long v47, v47, v40

    .line 522
    .line 523
    shl-long v62, v47, v40

    .line 524
    .line 525
    mul-long v88, v70, v74

    .line 526
    .line 527
    add-long v88, v88, v52

    .line 528
    .line 529
    mul-long v52, v19, v44

    .line 530
    .line 531
    sub-long v88, v88, v52

    .line 532
    .line 533
    mul-long v68, v68, v90

    .line 534
    .line 535
    add-long v68, v68, v88

    .line 536
    .line 537
    mul-long v66, v66, v49

    .line 538
    .line 539
    sub-long v68, v68, v66

    .line 540
    .line 541
    add-long v68, v68, v98

    .line 542
    .line 543
    add-long v52, v68, v30

    .line 544
    .line 545
    shr-long v52, v52, v40

    .line 546
    .line 547
    shl-long v66, v52, v40

    .line 548
    .line 549
    mul-long v70, v70, v90

    .line 550
    .line 551
    add-long v70, v70, v56

    .line 552
    .line 553
    mul-long v19, v19, v49

    .line 554
    .line 555
    sub-long v70, v70, v19

    .line 556
    .line 557
    add-long v70, v70, v54

    .line 558
    .line 559
    add-long v19, v70, v30

    .line 560
    .line 561
    shr-long v19, v19, v40

    .line 562
    .line 563
    shl-long v54, v19, v40

    .line 564
    .line 565
    sub-long v96, v96, v100

    .line 566
    .line 567
    add-long v96, v96, v47

    .line 568
    .line 569
    mul-long v47, v96, v72

    .line 570
    .line 571
    add-long v47, v47, v9

    .line 572
    .line 573
    add-long v9, v47, v30

    .line 574
    .line 575
    shr-long v9, v9, v40

    .line 576
    .line 577
    shl-long v56, v9, v40

    .line 578
    .line 579
    sub-long v102, v102, v104

    .line 580
    .line 581
    add-long v102, v102, v52

    .line 582
    .line 583
    mul-long v52, v102, v72

    .line 584
    .line 585
    add-long v52, v52, v17

    .line 586
    .line 587
    sub-long v68, v68, v66

    .line 588
    .line 589
    mul-long v17, v68, v80

    .line 590
    .line 591
    add-long v17, v17, v52

    .line 592
    .line 593
    mul-long v52, v96, v74

    .line 594
    .line 595
    add-long v52, v52, v17

    .line 596
    .line 597
    add-long v17, v52, v30

    .line 598
    .line 599
    shr-long v17, v17, v40

    .line 600
    .line 601
    shl-long v66, v17, v40

    .line 602
    .line 603
    sub-long v58, v58, v108

    .line 604
    .line 605
    add-long v58, v58, v19

    .line 606
    .line 607
    mul-long v19, v58, v72

    .line 608
    .line 609
    add-long v19, v19, v23

    .line 610
    .line 611
    sub-long v70, v70, v54

    .line 612
    .line 613
    mul-long v23, v70, v80

    .line 614
    .line 615
    add-long v23, v23, v19

    .line 616
    .line 617
    mul-long v19, v102, v74

    .line 618
    .line 619
    add-long v19, v19, v23

    .line 620
    .line 621
    mul-long v23, v68, v44

    .line 622
    .line 623
    sub-long v19, v19, v23

    .line 624
    .line 625
    mul-long v23, v96, v90

    .line 626
    .line 627
    add-long v23, v23, v19

    .line 628
    .line 629
    add-long v19, v23, v30

    .line 630
    .line 631
    shr-long v19, v19, v40

    .line 632
    .line 633
    shl-long v54, v19, v40

    .line 634
    .line 635
    sub-long v34, v34, v78

    .line 636
    .line 637
    add-long v60, v60, v106

    .line 638
    .line 639
    mul-long v78, v60, v80

    .line 640
    .line 641
    add-long v78, v78, v34

    .line 642
    .line 643
    mul-long v34, v58, v74

    .line 644
    .line 645
    add-long v34, v34, v78

    .line 646
    .line 647
    mul-long v78, v70, v44

    .line 648
    .line 649
    sub-long v34, v34, v78

    .line 650
    .line 651
    mul-long v78, v102, v90

    .line 652
    .line 653
    add-long v78, v78, v34

    .line 654
    .line 655
    mul-long v34, v68, v49

    .line 656
    .line 657
    sub-long v78, v78, v34

    .line 658
    .line 659
    add-long v34, v78, v30

    .line 660
    .line 661
    shr-long v34, v34, v40

    .line 662
    .line 663
    shl-long v88, v34, v40

    .line 664
    .line 665
    sub-long v84, v84, v86

    .line 666
    .line 667
    add-long v84, v84, v38

    .line 668
    .line 669
    mul-long v38, v60, v44

    .line 670
    .line 671
    sub-long v84, v84, v38

    .line 672
    .line 673
    mul-long v38, v58, v90

    .line 674
    .line 675
    add-long v38, v38, v84

    .line 676
    .line 677
    mul-long v84, v70, v49

    .line 678
    .line 679
    sub-long v38, v38, v84

    .line 680
    .line 681
    add-long v84, v38, v30

    .line 682
    .line 683
    shr-long v84, v84, v40

    .line 684
    .line 685
    shl-long v86, v84, v40

    .line 686
    .line 687
    sub-long v92, v92, v94

    .line 688
    .line 689
    add-long v92, v92, v41

    .line 690
    .line 691
    mul-long v41, v60, v49

    .line 692
    .line 693
    sub-long v92, v92, v41

    .line 694
    .line 695
    add-long v41, v92, v30

    .line 696
    .line 697
    shr-long v41, v41, v40

    .line 698
    .line 699
    shl-long v94, v41, v40

    .line 700
    .line 701
    mul-long v98, v68, v72

    .line 702
    .line 703
    add-long v98, v98, v14

    .line 704
    .line 705
    mul-long v14, v96, v80

    .line 706
    .line 707
    add-long v14, v14, v98

    .line 708
    .line 709
    add-long/2addr v14, v9

    .line 710
    add-long v9, v14, v30

    .line 711
    .line 712
    shr-long v9, v9, v40

    .line 713
    .line 714
    shl-long v98, v9, v40

    .line 715
    .line 716
    mul-long v100, v70, v72

    .line 717
    .line 718
    add-long v100, v100, v21

    .line 719
    .line 720
    mul-long v21, v102, v80

    .line 721
    .line 722
    add-long v21, v21, v100

    .line 723
    .line 724
    mul-long v100, v68, v74

    .line 725
    .line 726
    add-long v100, v100, v21

    .line 727
    .line 728
    mul-long v21, v96, v44

    .line 729
    .line 730
    sub-long v100, v100, v21

    .line 731
    .line 732
    add-long v100, v100, v17

    .line 733
    .line 734
    add-long v17, v100, v30

    .line 735
    .line 736
    shr-long v17, v17, v40

    .line 737
    .line 738
    shl-long v21, v17, v40

    .line 739
    .line 740
    mul-long v104, v60, v72

    .line 741
    .line 742
    add-long v104, v104, v26

    .line 743
    .line 744
    mul-long v26, v58, v80

    .line 745
    .line 746
    add-long v26, v26, v104

    .line 747
    .line 748
    mul-long v104, v70, v74

    .line 749
    .line 750
    add-long v104, v104, v26

    .line 751
    .line 752
    mul-long v26, v102, v44

    .line 753
    .line 754
    sub-long v104, v104, v26

    .line 755
    .line 756
    mul-long v68, v68, v90

    .line 757
    .line 758
    add-long v68, v68, v104

    .line 759
    .line 760
    mul-long v96, v96, v49

    .line 761
    .line 762
    sub-long v68, v68, v96

    .line 763
    .line 764
    add-long v68, v68, v19

    .line 765
    .line 766
    add-long v19, v68, v30

    .line 767
    .line 768
    shr-long v19, v19, v40

    .line 769
    .line 770
    shl-long v26, v19, v40

    .line 771
    .line 772
    sub-long v110, v110, v76

    .line 773
    .line 774
    mul-long v76, v60, v74

    .line 775
    .line 776
    add-long v76, v76, v110

    .line 777
    .line 778
    mul-long v96, v58, v44

    .line 779
    .line 780
    sub-long v76, v76, v96

    .line 781
    .line 782
    mul-long v70, v70, v90

    .line 783
    .line 784
    add-long v70, v70, v76

    .line 785
    .line 786
    mul-long v102, v102, v49

    .line 787
    .line 788
    sub-long v70, v70, v102

    .line 789
    .line 790
    add-long v70, v70, v34

    .line 791
    .line 792
    add-long v34, v70, v30

    .line 793
    .line 794
    shr-long v34, v34, v40

    .line 795
    .line 796
    shl-long v76, v34, v40

    .line 797
    .line 798
    sub-long v112, v112, v82

    .line 799
    .line 800
    mul-long v60, v60, v90

    .line 801
    .line 802
    add-long v60, v60, v112

    .line 803
    .line 804
    mul-long v58, v58, v49

    .line 805
    .line 806
    sub-long v60, v60, v58

    .line 807
    .line 808
    add-long v60, v60, v84

    .line 809
    .line 810
    add-long v58, v60, v30

    .line 811
    .line 812
    shr-long v58, v58, v40

    .line 813
    .line 814
    shl-long v82, v58, v40

    .line 815
    .line 816
    sub-long v64, v64, v62

    .line 817
    .line 818
    add-long v64, v64, v41

    .line 819
    .line 820
    add-long v30, v64, v30

    .line 821
    .line 822
    shr-long v30, v30, v40

    .line 823
    .line 824
    shl-long v41, v30, v40

    .line 825
    .line 826
    sub-long v47, v47, v56

    .line 827
    .line 828
    mul-long v56, v30, v72

    .line 829
    .line 830
    add-long v56, v56, v47

    .line 831
    .line 832
    shr-long v47, v56, v40

    .line 833
    .line 834
    shl-long v62, v47, v40

    .line 835
    .line 836
    sub-long v14, v14, v98

    .line 837
    .line 838
    mul-long v84, v30, v80

    .line 839
    .line 840
    add-long v84, v84, v14

    .line 841
    .line 842
    add-long v84, v84, v47

    .line 843
    .line 844
    shr-long v14, v84, v40

    .line 845
    .line 846
    shl-long v47, v14, v40

    .line 847
    .line 848
    sub-long v52, v52, v66

    .line 849
    .line 850
    add-long v52, v52, v9

    .line 851
    .line 852
    mul-long v9, v30, v74

    .line 853
    .line 854
    add-long v9, v9, v52

    .line 855
    .line 856
    add-long/2addr v9, v14

    .line 857
    shr-long v14, v9, v40

    .line 858
    .line 859
    shl-long v52, v14, v40

    .line 860
    .line 861
    sub-long v100, v100, v21

    .line 862
    .line 863
    mul-long v21, v30, v44

    .line 864
    .line 865
    sub-long v100, v100, v21

    .line 866
    .line 867
    add-long v100, v100, v14

    .line 868
    .line 869
    shr-long v14, v100, v40

    .line 870
    .line 871
    shl-long v21, v14, v40

    .line 872
    .line 873
    sub-long v23, v23, v54

    .line 874
    .line 875
    add-long v23, v23, v17

    .line 876
    .line 877
    mul-long v17, v30, v90

    .line 878
    .line 879
    add-long v17, v17, v23

    .line 880
    .line 881
    add-long v17, v17, v14

    .line 882
    .line 883
    shr-long v14, v17, v40

    .line 884
    .line 885
    shl-long v23, v14, v40

    .line 886
    .line 887
    sub-long v68, v68, v26

    .line 888
    .line 889
    mul-long v30, v30, v49

    .line 890
    .line 891
    sub-long v68, v68, v30

    .line 892
    .line 893
    add-long v68, v68, v14

    .line 894
    .line 895
    shr-long v14, v68, v40

    .line 896
    .line 897
    shl-long v26, v14, v40

    .line 898
    .line 899
    sub-long v78, v78, v88

    .line 900
    .line 901
    add-long v78, v78, v19

    .line 902
    .line 903
    add-long v78, v78, v14

    .line 904
    .line 905
    shr-long v14, v78, v40

    .line 906
    .line 907
    shl-long v19, v14, v40

    .line 908
    .line 909
    sub-long v70, v70, v76

    .line 910
    .line 911
    add-long v70, v70, v14

    .line 912
    .line 913
    shr-long v14, v70, v40

    .line 914
    .line 915
    shl-long v30, v14, v40

    .line 916
    .line 917
    sub-long v38, v38, v86

    .line 918
    .line 919
    add-long v38, v38, v34

    .line 920
    .line 921
    add-long v38, v38, v14

    .line 922
    .line 923
    shr-long v14, v38, v40

    .line 924
    .line 925
    shl-long v34, v14, v40

    .line 926
    .line 927
    sub-long v60, v60, v82

    .line 928
    .line 929
    add-long v60, v60, v14

    .line 930
    .line 931
    shr-long v14, v60, v40

    .line 932
    .line 933
    shl-long v54, v14, v40

    .line 934
    .line 935
    sub-long v92, v92, v94

    .line 936
    .line 937
    add-long v92, v92, v58

    .line 938
    .line 939
    add-long v92, v92, v14

    .line 940
    .line 941
    shr-long v14, v92, v40

    .line 942
    .line 943
    shl-long v58, v14, v40

    .line 944
    .line 945
    sub-long v64, v64, v41

    .line 946
    .line 947
    add-long v64, v64, v14

    .line 948
    .line 949
    shr-long v14, v64, v40

    .line 950
    .line 951
    shl-long v41, v14, v40

    .line 952
    .line 953
    sub-long v56, v56, v62

    .line 954
    .line 955
    mul-long v72, v72, v14

    .line 956
    .line 957
    add-long v72, v72, v56

    .line 958
    .line 959
    shr-long v56, v72, v40

    .line 960
    .line 961
    shl-long v62, v56, v40

    .line 962
    .line 963
    sub-long v84, v84, v47

    .line 964
    .line 965
    mul-long v80, v80, v14

    .line 966
    .line 967
    add-long v80, v80, v84

    .line 968
    .line 969
    add-long v80, v80, v56

    .line 970
    .line 971
    shr-long v47, v80, v40

    .line 972
    .line 973
    shl-long v56, v47, v40

    .line 974
    .line 975
    sub-long v9, v9, v52

    .line 976
    .line 977
    mul-long v74, v74, v14

    .line 978
    .line 979
    add-long v74, v74, v9

    .line 980
    .line 981
    add-long v74, v74, v47

    .line 982
    .line 983
    shr-long v9, v74, v40

    .line 984
    .line 985
    shl-long v47, v9, v40

    .line 986
    .line 987
    sub-long v100, v100, v21

    .line 988
    .line 989
    mul-long v44, v44, v14

    .line 990
    .line 991
    sub-long v100, v100, v44

    .line 992
    .line 993
    add-long v100, v100, v9

    .line 994
    .line 995
    shr-long v9, v100, v40

    .line 996
    .line 997
    shl-long v21, v9, v40

    .line 998
    .line 999
    sub-long v17, v17, v23

    .line 1000
    .line 1001
    mul-long v90, v90, v14

    .line 1002
    .line 1003
    add-long v90, v90, v17

    .line 1004
    .line 1005
    add-long v90, v90, v9

    .line 1006
    .line 1007
    shr-long v9, v90, v40

    .line 1008
    .line 1009
    shl-long v17, v9, v40

    .line 1010
    .line 1011
    sub-long v68, v68, v26

    .line 1012
    .line 1013
    mul-long v14, v14, v49

    .line 1014
    .line 1015
    sub-long v68, v68, v14

    .line 1016
    .line 1017
    add-long v68, v68, v9

    .line 1018
    .line 1019
    shr-long v9, v68, v40

    .line 1020
    .line 1021
    shl-long v14, v9, v40

    .line 1022
    .line 1023
    sub-long v78, v78, v19

    .line 1024
    .line 1025
    add-long v78, v78, v9

    .line 1026
    .line 1027
    shr-long v9, v78, v40

    .line 1028
    .line 1029
    shl-long v19, v9, v40

    .line 1030
    .line 1031
    sub-long v70, v70, v30

    .line 1032
    .line 1033
    add-long v70, v70, v9

    .line 1034
    .line 1035
    shr-long v9, v70, v40

    .line 1036
    .line 1037
    shl-long v23, v9, v40

    .line 1038
    .line 1039
    sub-long v38, v38, v34

    .line 1040
    .line 1041
    add-long v38, v38, v9

    .line 1042
    .line 1043
    shr-long v9, v38, v40

    .line 1044
    .line 1045
    shl-long v26, v9, v40

    .line 1046
    .line 1047
    sub-long v60, v60, v54

    .line 1048
    .line 1049
    add-long v60, v60, v9

    .line 1050
    .line 1051
    shr-long v9, v60, v40

    .line 1052
    .line 1053
    shl-long v30, v9, v40

    .line 1054
    .line 1055
    sub-long v92, v92, v58

    .line 1056
    .line 1057
    add-long v92, v92, v9

    .line 1058
    .line 1059
    shr-long v9, v92, v40

    .line 1060
    .line 1061
    shl-long v34, v9, v40

    .line 1062
    .line 1063
    move v5, v13

    .line 1064
    move-wide/from16 v44, v14

    .line 1065
    .line 1066
    sub-long v13, v72, v62

    .line 1067
    .line 1068
    long-to-int v15, v13

    .line 1069
    int-to-byte v15, v15

    .line 1070
    aput-byte v15, v6, v16

    .line 1071
    .line 1072
    sub-long v70, v70, v23

    .line 1073
    .line 1074
    sub-long v78, v78, v19

    .line 1075
    .line 1076
    sub-long v68, v68, v44

    .line 1077
    .line 1078
    sub-long v90, v90, v17

    .line 1079
    .line 1080
    sub-long v100, v100, v21

    .line 1081
    .line 1082
    sub-long v74, v74, v47

    .line 1083
    .line 1084
    sub-long v80, v80, v56

    .line 1085
    .line 1086
    const/16 v15, 0x8

    .line 1087
    .line 1088
    move/from16 v18, v5

    .line 1089
    .line 1090
    move-object/from16 v17, v6

    .line 1091
    .line 1092
    shr-long v5, v13, v15

    .line 1093
    .line 1094
    long-to-int v5, v5

    .line 1095
    int-to-byte v5, v5

    .line 1096
    aput-byte v5, v17, v28

    .line 1097
    .line 1098
    const/16 v5, 0x10

    .line 1099
    .line 1100
    shr-long/2addr v13, v5

    .line 1101
    shl-long v19, v80, v7

    .line 1102
    .line 1103
    or-long v13, v13, v19

    .line 1104
    .line 1105
    long-to-int v6, v13

    .line 1106
    int-to-byte v6, v6

    .line 1107
    aput-byte v6, v17, v18

    .line 1108
    .line 1109
    shr-long v13, v80, v36

    .line 1110
    .line 1111
    long-to-int v6, v13

    .line 1112
    int-to-byte v6, v6

    .line 1113
    aput-byte v6, v17, v36

    .line 1114
    .line 1115
    const/16 v6, 0xb

    .line 1116
    .line 1117
    shr-long v13, v80, v6

    .line 1118
    .line 1119
    long-to-int v13, v13

    .line 1120
    int-to-byte v13, v13

    .line 1121
    aput-byte v13, v17, v25

    .line 1122
    .line 1123
    const/16 v13, 0x13

    .line 1124
    .line 1125
    shr-long v19, v80, v13

    .line 1126
    .line 1127
    shl-long v21, v74, v18

    .line 1128
    .line 1129
    move v14, v5

    .line 1130
    move/from16 v23, v6

    .line 1131
    .line 1132
    or-long v5, v19, v21

    .line 1133
    .line 1134
    long-to-int v5, v5

    .line 1135
    int-to-byte v5, v5

    .line 1136
    aput-byte v5, v17, v7

    .line 1137
    .line 1138
    shr-long v5, v74, v32

    .line 1139
    .line 1140
    long-to-int v5, v5

    .line 1141
    int-to-byte v5, v5

    .line 1142
    aput-byte v5, v17, v32

    .line 1143
    .line 1144
    const/16 v5, 0xe

    .line 1145
    .line 1146
    shr-long v19, v74, v5

    .line 1147
    .line 1148
    shl-long v21, v100, p2

    .line 1149
    .line 1150
    move/from16 v24, v5

    .line 1151
    .line 1152
    or-long v5, v19, v21

    .line 1153
    .line 1154
    long-to-int v5, v5

    .line 1155
    int-to-byte v5, v5

    .line 1156
    aput-byte v5, v17, p2

    .line 1157
    .line 1158
    shr-long v5, v100, v28

    .line 1159
    .line 1160
    long-to-int v5, v5

    .line 1161
    int-to-byte v5, v5

    .line 1162
    aput-byte v5, v17, v15

    .line 1163
    .line 1164
    const/16 v19, 0x9

    .line 1165
    .line 1166
    shr-long v5, v100, v19

    .line 1167
    .line 1168
    long-to-int v5, v5

    .line 1169
    int-to-byte v5, v5

    .line 1170
    aput-byte v5, v17, v19

    .line 1171
    .line 1172
    const/16 v5, 0x11

    .line 1173
    .line 1174
    shr-long v20, v100, v5

    .line 1175
    .line 1176
    shl-long v44, v90, v25

    .line 1177
    .line 1178
    move/from16 v22, v5

    .line 1179
    .line 1180
    or-long v5, v20, v44

    .line 1181
    .line 1182
    long-to-int v5, v5

    .line 1183
    int-to-byte v5, v5

    .line 1184
    aput-byte v5, v17, v12

    .line 1185
    .line 1186
    shr-long v5, v90, v25

    .line 1187
    .line 1188
    long-to-int v5, v5

    .line 1189
    int-to-byte v5, v5

    .line 1190
    aput-byte v5, v17, v23

    .line 1191
    .line 1192
    const/16 v20, 0xc

    .line 1193
    .line 1194
    shr-long v5, v90, v20

    .line 1195
    .line 1196
    long-to-int v5, v5

    .line 1197
    int-to-byte v5, v5

    .line 1198
    aput-byte v5, v17, v20

    .line 1199
    .line 1200
    const/16 v5, 0x14

    .line 1201
    .line 1202
    shr-long v20, v90, v5

    .line 1203
    .line 1204
    add-long v44, v68, v68

    .line 1205
    .line 1206
    move v6, v13

    .line 1207
    move/from16 v25, v14

    .line 1208
    .line 1209
    or-long v13, v20, v44

    .line 1210
    .line 1211
    long-to-int v13, v13

    .line 1212
    int-to-byte v13, v13

    .line 1213
    aput-byte v13, v17, v29

    .line 1214
    .line 1215
    shr-long v13, v68, p2

    .line 1216
    .line 1217
    long-to-int v13, v13

    .line 1218
    int-to-byte v13, v13

    .line 1219
    aput-byte v13, v17, v24

    .line 1220
    .line 1221
    shr-long v13, v68, v33

    .line 1222
    .line 1223
    shl-long v20, v78, v32

    .line 1224
    .line 1225
    or-long v13, v13, v20

    .line 1226
    .line 1227
    long-to-int v13, v13

    .line 1228
    int-to-byte v13, v13

    .line 1229
    aput-byte v13, v17, v33

    .line 1230
    .line 1231
    shr-long v13, v78, v18

    .line 1232
    .line 1233
    long-to-int v13, v13

    .line 1234
    int-to-byte v13, v13

    .line 1235
    aput-byte v13, v17, v25

    .line 1236
    .line 1237
    shr-long v13, v78, v12

    .line 1238
    .line 1239
    long-to-int v13, v13

    .line 1240
    int-to-byte v13, v13

    .line 1241
    aput-byte v13, v17, v22

    .line 1242
    .line 1243
    shr-long v13, v78, v37

    .line 1244
    .line 1245
    shl-long v20, v70, v36

    .line 1246
    .line 1247
    or-long v13, v13, v20

    .line 1248
    .line 1249
    long-to-int v13, v13

    .line 1250
    int-to-byte v13, v13

    .line 1251
    aput-byte v13, v17, v37

    .line 1252
    .line 1253
    sub-long v64, v64, v41

    .line 1254
    .line 1255
    sub-long v92, v92, v34

    .line 1256
    .line 1257
    add-long v64, v64, v9

    .line 1258
    .line 1259
    sub-long v60, v60, v30

    .line 1260
    .line 1261
    sub-long v9, v38, v26

    .line 1262
    .line 1263
    shr-long v13, v70, v7

    .line 1264
    .line 1265
    long-to-int v13, v13

    .line 1266
    int-to-byte v13, v13

    .line 1267
    aput-byte v13, v17, v6

    .line 1268
    .line 1269
    shr-long v13, v70, v29

    .line 1270
    .line 1271
    long-to-int v13, v13

    .line 1272
    int-to-byte v13, v13

    .line 1273
    aput-byte v13, v17, v5

    .line 1274
    .line 1275
    long-to-int v13, v9

    .line 1276
    int-to-byte v13, v13

    .line 1277
    aput-byte v13, v17, v40

    .line 1278
    .line 1279
    shr-long v13, v9, v15

    .line 1280
    .line 1281
    long-to-int v13, v13

    .line 1282
    int-to-byte v13, v13

    .line 1283
    const/16 v14, 0x16

    .line 1284
    .line 1285
    aput-byte v13, v17, v14

    .line 1286
    .line 1287
    shr-long v9, v9, v25

    .line 1288
    .line 1289
    shl-long v13, v60, v7

    .line 1290
    .line 1291
    or-long/2addr v9, v13

    .line 1292
    long-to-int v9, v9

    .line 1293
    int-to-byte v9, v9

    .line 1294
    aput-byte v9, v17, v43

    .line 1295
    .line 1296
    shr-long v9, v60, v36

    .line 1297
    .line 1298
    long-to-int v9, v9

    .line 1299
    int-to-byte v9, v9

    .line 1300
    const/16 v10, 0x18

    .line 1301
    .line 1302
    aput-byte v9, v17, v10

    .line 1303
    .line 1304
    shr-long v9, v60, v23

    .line 1305
    .line 1306
    long-to-int v9, v9

    .line 1307
    int-to-byte v9, v9

    .line 1308
    const/16 v10, 0x19

    .line 1309
    .line 1310
    aput-byte v9, v17, v10

    .line 1311
    .line 1312
    shr-long v9, v60, v6

    .line 1313
    .line 1314
    shl-long v13, v92, v18

    .line 1315
    .line 1316
    or-long/2addr v9, v13

    .line 1317
    long-to-int v6, v9

    .line 1318
    int-to-byte v6, v6

    .line 1319
    aput-byte v6, v17, v46

    .line 1320
    .line 1321
    shr-long v9, v92, v32

    .line 1322
    .line 1323
    long-to-int v6, v9

    .line 1324
    int-to-byte v6, v6

    .line 1325
    const/16 v9, 0x1b

    .line 1326
    .line 1327
    aput-byte v6, v17, v9

    .line 1328
    .line 1329
    shr-long v9, v92, v24

    .line 1330
    .line 1331
    shl-long v13, v64, p2

    .line 1332
    .line 1333
    or-long/2addr v9, v13

    .line 1334
    long-to-int v6, v9

    .line 1335
    int-to-byte v6, v6

    .line 1336
    aput-byte v6, v17, v11

    .line 1337
    .line 1338
    shr-long v9, v64, v28

    .line 1339
    .line 1340
    long-to-int v6, v9

    .line 1341
    int-to-byte v6, v6

    .line 1342
    const/16 v9, 0x1d

    .line 1343
    .line 1344
    aput-byte v6, v17, v9

    .line 1345
    .line 1346
    shr-long v9, v64, v19

    .line 1347
    .line 1348
    long-to-int v6, v9

    .line 1349
    int-to-byte v6, v6

    .line 1350
    const/16 v9, 0x1e

    .line 1351
    .line 1352
    aput-byte v6, v17, v9

    .line 1353
    .line 1354
    shr-long v9, v64, v22

    .line 1355
    .line 1356
    long-to-int v6, v9

    .line 1357
    int-to-byte v6, v6

    .line 1358
    aput-byte v6, v17, v51

    .line 1359
    .line 1360
    new-array v6, v12, [J

    .line 1361
    .line 1362
    invoke-static {v3}, Lpu1;->K([B)[J

    .line 1363
    .line 1364
    .line 1365
    move-result-object v9

    .line 1366
    new-array v10, v12, [J

    .line 1367
    .line 1368
    const-wide/16 v13, 0x1

    .line 1369
    .line 1370
    aput-wide v13, v10, v16

    .line 1371
    .line 1372
    new-array v11, v12, [J

    .line 1373
    .line 1374
    new-array v13, v12, [J

    .line 1375
    .line 1376
    new-array v14, v12, [J

    .line 1377
    .line 1378
    new-array v4, v12, [J

    .line 1379
    .line 1380
    new-array v15, v12, [J

    .line 1381
    .line 1382
    invoke-static {v13, v9}, Lpu1;->I([J[J)V

    .line 1383
    .line 1384
    .line 1385
    sget-object v8, Lpu3;->a:[J

    .line 1386
    .line 1387
    invoke-static {v14, v13, v8}, Lpu1;->G([J[J[J)V

    .line 1388
    .line 1389
    .line 1390
    invoke-static {v13, v13, v10}, Lpu1;->y([J[J[J)V

    .line 1391
    .line 1392
    .line 1393
    invoke-static {v14, v14, v10}, Lpu1;->u([J[J[J)V

    .line 1394
    .line 1395
    .line 1396
    new-array v8, v12, [J

    .line 1397
    .line 1398
    invoke-static {v8, v14}, Lpu1;->I([J[J)V

    .line 1399
    .line 1400
    .line 1401
    invoke-static {v8, v8, v14}, Lpu1;->G([J[J[J)V

    .line 1402
    .line 1403
    .line 1404
    invoke-static {v6, v8}, Lpu1;->I([J[J)V

    .line 1405
    .line 1406
    .line 1407
    invoke-static {v6, v6, v14}, Lpu1;->G([J[J[J)V

    .line 1408
    .line 1409
    .line 1410
    invoke-static {v6, v6, v13}, Lpu1;->G([J[J[J)V

    .line 1411
    .line 1412
    .line 1413
    new-array v5, v12, [J

    .line 1414
    .line 1415
    new-array v7, v12, [J

    .line 1416
    .line 1417
    new-array v0, v12, [J

    .line 1418
    .line 1419
    invoke-static {v5, v6}, Lpu1;->I([J[J)V

    .line 1420
    .line 1421
    .line 1422
    invoke-static {v7, v5}, Lpu1;->I([J[J)V

    .line 1423
    .line 1424
    .line 1425
    invoke-static {v7, v7}, Lpu1;->I([J[J)V

    .line 1426
    .line 1427
    .line 1428
    invoke-static {v7, v6, v7}, Lpu1;->G([J[J[J)V

    .line 1429
    .line 1430
    .line 1431
    invoke-static {v5, v5, v7}, Lpu1;->G([J[J[J)V

    .line 1432
    .line 1433
    .line 1434
    invoke-static {v5, v5}, Lpu1;->I([J[J)V

    .line 1435
    .line 1436
    .line 1437
    invoke-static {v5, v7, v5}, Lpu1;->G([J[J[J)V

    .line 1438
    .line 1439
    .line 1440
    invoke-static {v7, v5}, Lpu1;->I([J[J)V

    .line 1441
    .line 1442
    .line 1443
    move/from16 v12, v28

    .line 1444
    .line 1445
    const/4 v1, 0x5

    .line 1446
    :goto_1
    if-ge v12, v1, :cond_0

    .line 1447
    .line 1448
    invoke-static {v7, v7}, Lpu1;->I([J[J)V

    .line 1449
    .line 1450
    .line 1451
    add-int/lit8 v12, v12, 0x1

    .line 1452
    .line 1453
    goto :goto_1

    .line 1454
    :cond_0
    invoke-static {v5, v7, v5}, Lpu1;->G([J[J[J)V

    .line 1455
    .line 1456
    .line 1457
    invoke-static {v7, v5}, Lpu1;->I([J[J)V

    .line 1458
    .line 1459
    .line 1460
    move/from16 v1, v28

    .line 1461
    .line 1462
    :goto_2
    const/16 v12, 0xa

    .line 1463
    .line 1464
    if-ge v1, v12, :cond_1

    .line 1465
    .line 1466
    invoke-static {v7, v7}, Lpu1;->I([J[J)V

    .line 1467
    .line 1468
    .line 1469
    add-int/lit8 v1, v1, 0x1

    .line 1470
    .line 1471
    goto :goto_2

    .line 1472
    :cond_1
    invoke-static {v7, v7, v5}, Lpu1;->G([J[J[J)V

    .line 1473
    .line 1474
    .line 1475
    invoke-static {v0, v7}, Lpu1;->I([J[J)V

    .line 1476
    .line 1477
    .line 1478
    move/from16 v1, v28

    .line 1479
    .line 1480
    const/16 v12, 0x14

    .line 1481
    .line 1482
    :goto_3
    if-ge v1, v12, :cond_2

    .line 1483
    .line 1484
    invoke-static {v0, v0}, Lpu1;->I([J[J)V

    .line 1485
    .line 1486
    .line 1487
    add-int/lit8 v1, v1, 0x1

    .line 1488
    .line 1489
    goto :goto_3

    .line 1490
    :cond_2
    invoke-static {v7, v0, v7}, Lpu1;->G([J[J[J)V

    .line 1491
    .line 1492
    .line 1493
    invoke-static {v7, v7}, Lpu1;->I([J[J)V

    .line 1494
    .line 1495
    .line 1496
    move/from16 v1, v28

    .line 1497
    .line 1498
    :goto_4
    const/16 v12, 0xa

    .line 1499
    .line 1500
    if-ge v1, v12, :cond_3

    .line 1501
    .line 1502
    invoke-static {v7, v7}, Lpu1;->I([J[J)V

    .line 1503
    .line 1504
    .line 1505
    add-int/lit8 v1, v1, 0x1

    .line 1506
    .line 1507
    goto :goto_4

    .line 1508
    :cond_3
    invoke-static {v5, v7, v5}, Lpu1;->G([J[J[J)V

    .line 1509
    .line 1510
    .line 1511
    invoke-static {v7, v5}, Lpu1;->I([J[J)V

    .line 1512
    .line 1513
    .line 1514
    move/from16 v1, v28

    .line 1515
    .line 1516
    :goto_5
    const/16 v12, 0x32

    .line 1517
    .line 1518
    if-ge v1, v12, :cond_4

    .line 1519
    .line 1520
    invoke-static {v7, v7}, Lpu1;->I([J[J)V

    .line 1521
    .line 1522
    .line 1523
    add-int/lit8 v1, v1, 0x1

    .line 1524
    .line 1525
    goto :goto_5

    .line 1526
    :cond_4
    invoke-static {v7, v7, v5}, Lpu1;->G([J[J[J)V

    .line 1527
    .line 1528
    .line 1529
    invoke-static {v0, v7}, Lpu1;->I([J[J)V

    .line 1530
    .line 1531
    .line 1532
    move/from16 v1, v28

    .line 1533
    .line 1534
    :goto_6
    const/16 v12, 0x64

    .line 1535
    .line 1536
    if-ge v1, v12, :cond_5

    .line 1537
    .line 1538
    invoke-static {v0, v0}, Lpu1;->I([J[J)V

    .line 1539
    .line 1540
    .line 1541
    add-int/lit8 v1, v1, 0x1

    .line 1542
    .line 1543
    goto :goto_6

    .line 1544
    :cond_5
    invoke-static {v7, v0, v7}, Lpu1;->G([J[J[J)V

    .line 1545
    .line 1546
    .line 1547
    invoke-static {v7, v7}, Lpu1;->I([J[J)V

    .line 1548
    .line 1549
    .line 1550
    move/from16 v0, v28

    .line 1551
    .line 1552
    const/16 v1, 0x32

    .line 1553
    .line 1554
    :goto_7
    if-ge v0, v1, :cond_6

    .line 1555
    .line 1556
    invoke-static {v7, v7}, Lpu1;->I([J[J)V

    .line 1557
    .line 1558
    .line 1559
    add-int/lit8 v0, v0, 0x1

    .line 1560
    .line 1561
    goto :goto_7

    .line 1562
    :cond_6
    invoke-static {v5, v7, v5}, Lpu1;->G([J[J[J)V

    .line 1563
    .line 1564
    .line 1565
    invoke-static {v5, v5}, Lpu1;->I([J[J)V

    .line 1566
    .line 1567
    .line 1568
    invoke-static {v5, v5}, Lpu1;->I([J[J)V

    .line 1569
    .line 1570
    .line 1571
    invoke-static {v6, v5, v6}, Lpu1;->G([J[J[J)V

    .line 1572
    .line 1573
    .line 1574
    invoke-static {v6, v6, v8}, Lpu1;->G([J[J[J)V

    .line 1575
    .line 1576
    .line 1577
    invoke-static {v6, v6, v13}, Lpu1;->G([J[J[J)V

    .line 1578
    .line 1579
    .line 1580
    invoke-static {v4, v6}, Lpu1;->I([J[J)V

    .line 1581
    .line 1582
    .line 1583
    invoke-static {v4, v4, v14}, Lpu1;->G([J[J[J)V

    .line 1584
    .line 1585
    .line 1586
    invoke-static {v15, v4, v13}, Lpu1;->y([J[J[J)V

    .line 1587
    .line 1588
    .line 1589
    invoke-static {v15}, Lou1;->T([J)Z

    .line 1590
    .line 1591
    .line 1592
    move-result v0

    .line 1593
    if-eqz v0, :cond_8

    .line 1594
    .line 1595
    invoke-static {v15, v4, v13}, Lpu1;->u([J[J[J)V

    .line 1596
    .line 1597
    .line 1598
    invoke-static {v15}, Lou1;->T([J)Z

    .line 1599
    .line 1600
    .line 1601
    move-result v0

    .line 1602
    if-nez v0, :cond_7

    .line 1603
    .line 1604
    sget-object v0, Lpu3;->c:[J

    .line 1605
    .line 1606
    invoke-static {v6, v6, v0}, Lpu1;->G([J[J[J)V

    .line 1607
    .line 1608
    .line 1609
    goto :goto_8

    .line 1610
    :cond_7
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 1611
    .line 1612
    const-string v1, "Cannot convert given bytes to extended projective coordinates. No square root exists for modulo 2^255-19"

    .line 1613
    .line 1614
    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 1615
    .line 1616
    .line 1617
    throw v0

    .line 1618
    :cond_8
    :goto_8
    invoke-static {v6}, Lou1;->T([J)Z

    .line 1619
    .line 1620
    .line 1621
    move-result v0

    .line 1622
    if-nez v0, :cond_a

    .line 1623
    .line 1624
    aget-byte v0, v3, v51

    .line 1625
    .line 1626
    const/16 v1, 0xff

    .line 1627
    .line 1628
    and-int/2addr v0, v1

    .line 1629
    shr-int/lit8 v0, v0, 0x7

    .line 1630
    .line 1631
    if-nez v0, :cond_9

    .line 1632
    .line 1633
    goto :goto_9

    .line 1634
    :cond_9
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 1635
    .line 1636
    const-string v1, "Cannot convert given bytes to extended projective coordinates. Computed x is zero and encoded x\'s least significant bit is not zero"

    .line 1637
    .line 1638
    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 1639
    .line 1640
    .line 1641
    throw v0

    .line 1642
    :cond_a
    :goto_9
    invoke-static {v6}, Lpu1;->M([J)[B

    .line 1643
    .line 1644
    .line 1645
    move-result-object v0

    .line 1646
    aget-byte v0, v0, v16

    .line 1647
    .line 1648
    and-int/lit8 v0, v0, 0x1

    .line 1649
    .line 1650
    aget-byte v1, v3, v51

    .line 1651
    .line 1652
    const/16 v3, 0xff

    .line 1653
    .line 1654
    and-int/2addr v1, v3

    .line 1655
    shr-int/lit8 v1, v1, 0x7

    .line 1656
    .line 1657
    if-ne v0, v1, :cond_b

    .line 1658
    .line 1659
    move/from16 v0, v16

    .line 1660
    .line 1661
    :goto_a
    const/16 v12, 0xa

    .line 1662
    .line 1663
    if-ge v0, v12, :cond_b

    .line 1664
    .line 1665
    aget-wide v4, v6, v0

    .line 1666
    .line 1667
    neg-long v4, v4

    .line 1668
    aput-wide v4, v6, v0

    .line 1669
    .line 1670
    add-int/lit8 v0, v0, 0x1

    .line 1671
    .line 1672
    goto :goto_a

    .line 1673
    :cond_b
    invoke-static {v11, v6, v9}, Lpu1;->G([J[J[J)V

    .line 1674
    .line 1675
    .line 1676
    new-instance v0, Lmr2;

    .line 1677
    .line 1678
    new-instance v1, Ljr3;

    .line 1679
    .line 1680
    const/4 v4, 0x2

    .line 1681
    invoke-direct {v1, v6, v9, v10, v4}, Ljr3;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 1682
    .line 1683
    .line 1684
    const/16 v4, 0xd

    .line 1685
    .line 1686
    const/4 v5, 0x0

    .line 1687
    invoke-direct {v0, v1, v11, v4, v5}, Lmr2;-><init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 1688
    .line 1689
    .line 1690
    const/16 v4, 0x8

    .line 1691
    .line 1692
    new-array v5, v4, [Lou3;

    .line 1693
    .line 1694
    new-instance v4, Lou3;

    .line 1695
    .line 1696
    invoke-direct {v4, v0}, Lou3;-><init>(Lmr2;)V

    .line 1697
    .line 1698
    .line 1699
    aput-object v4, v5, v16

    .line 1700
    .line 1701
    new-instance v0, Lwt2;

    .line 1702
    .line 1703
    new-instance v4, Ljr3;

    .line 1704
    .line 1705
    const/4 v6, 0x2

    .line 1706
    invoke-direct {v4, v6}, Ljr3;-><init>(I)V

    .line 1707
    .line 1708
    .line 1709
    const/16 v12, 0xa

    .line 1710
    .line 1711
    new-array v6, v12, [J

    .line 1712
    .line 1713
    const/4 v7, 0x6

    .line 1714
    const/4 v8, 0x0

    .line 1715
    invoke-direct {v0, v4, v6, v7, v8}, Lwt2;-><init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 1716
    .line 1717
    .line 1718
    invoke-static {v0, v1}, Lou1;->Z(Lwt2;Ljr3;)V

    .line 1719
    .line 1720
    .line 1721
    new-instance v1, Lmr2;

    .line 1722
    .line 1723
    invoke-direct {v1, v0}, Lmr2;-><init>(Lwt2;)V

    .line 1724
    .line 1725
    .line 1726
    move/from16 v4, v28

    .line 1727
    .line 1728
    const/16 v6, 0x8

    .line 1729
    .line 1730
    :goto_b
    if-ge v4, v6, :cond_c

    .line 1731
    .line 1732
    add-int/lit8 v7, v4, -0x1

    .line 1733
    .line 1734
    aget-object v7, v5, v7

    .line 1735
    .line 1736
    invoke-static {v0, v1, v7}, Lou1;->W(Lwt2;Lmr2;Lnu3;)V

    .line 1737
    .line 1738
    .line 1739
    new-instance v7, Lou3;

    .line 1740
    .line 1741
    new-instance v8, Lmr2;

    .line 1742
    .line 1743
    invoke-direct {v8, v0}, Lmr2;-><init>(Lwt2;)V

    .line 1744
    .line 1745
    .line 1746
    invoke-direct {v7, v8}, Lou3;-><init>(Lmr2;)V

    .line 1747
    .line 1748
    .line 1749
    aput-object v7, v5, v4

    .line 1750
    .line 1751
    add-int/lit8 v4, v4, 0x1

    .line 1752
    .line 1753
    goto :goto_b

    .line 1754
    :cond_c
    invoke-static/range {v17 .. v17}, Lou1;->c0([B)[B

    .line 1755
    .line 1756
    .line 1757
    move-result-object v0

    .line 1758
    invoke-static {v2}, Lou1;->c0([B)[B

    .line 1759
    .line 1760
    .line 1761
    move-result-object v1

    .line 1762
    new-instance v2, Lwt2;

    .line 1763
    .line 1764
    const/4 v4, 0x6

    .line 1765
    invoke-direct {v2, v4}, Lwt2;-><init>(I)V

    .line 1766
    .line 1767
    .line 1768
    new-instance v4, Lmr2;

    .line 1769
    .line 1770
    const/16 v6, 0xd

    .line 1771
    .line 1772
    invoke-direct {v4, v6}, Lmr2;-><init>(I)V

    .line 1773
    .line 1774
    .line 1775
    move v8, v3

    .line 1776
    :goto_c
    if-ltz v8, :cond_e

    .line 1777
    .line 1778
    aget-byte v3, v0, v8

    .line 1779
    .line 1780
    if-nez v3, :cond_e

    .line 1781
    .line 1782
    aget-byte v3, v1, v8

    .line 1783
    .line 1784
    if-eqz v3, :cond_d

    .line 1785
    .line 1786
    goto :goto_d

    .line 1787
    :cond_d
    add-int/lit8 v8, v8, -0x1

    .line 1788
    .line 1789
    goto :goto_c

    .line 1790
    :cond_e
    :goto_d
    if-ltz v8, :cond_13

    .line 1791
    .line 1792
    new-instance v3, Ljr3;

    .line 1793
    .line 1794
    invoke-direct {v3, v2}, Ljr3;-><init>(Lwt2;)V

    .line 1795
    .line 1796
    .line 1797
    invoke-static {v2, v3}, Lou1;->Z(Lwt2;Ljr3;)V

    .line 1798
    .line 1799
    .line 1800
    aget-byte v3, v0, v8

    .line 1801
    .line 1802
    if-lez v3, :cond_f

    .line 1803
    .line 1804
    invoke-static {v4, v2}, Lmr2;->x(Lmr2;Lwt2;)V

    .line 1805
    .line 1806
    .line 1807
    aget-byte v3, v0, v8

    .line 1808
    .line 1809
    div-int/lit8 v3, v3, 0x2

    .line 1810
    .line 1811
    aget-object v3, v5, v3

    .line 1812
    .line 1813
    invoke-static {v2, v4, v3}, Lou1;->W(Lwt2;Lmr2;Lnu3;)V

    .line 1814
    .line 1815
    .line 1816
    goto :goto_e

    .line 1817
    :cond_f
    if-gez v3, :cond_10

    .line 1818
    .line 1819
    invoke-static {v4, v2}, Lmr2;->x(Lmr2;Lwt2;)V

    .line 1820
    .line 1821
    .line 1822
    aget-byte v3, v0, v8

    .line 1823
    .line 1824
    neg-int v3, v3

    .line 1825
    div-int/lit8 v3, v3, 0x2

    .line 1826
    .line 1827
    aget-object v3, v5, v3

    .line 1828
    .line 1829
    invoke-static {v2, v4, v3}, Lou1;->Y(Lwt2;Lmr2;Lnu3;)V

    .line 1830
    .line 1831
    .line 1832
    :cond_10
    :goto_e
    aget-byte v3, v1, v8

    .line 1833
    .line 1834
    if-lez v3, :cond_11

    .line 1835
    .line 1836
    invoke-static {v4, v2}, Lmr2;->x(Lmr2;Lwt2;)V

    .line 1837
    .line 1838
    .line 1839
    sget-object v3, Lpu3;->e:[Lnu3;

    .line 1840
    .line 1841
    aget-byte v6, v1, v8

    .line 1842
    .line 1843
    div-int/lit8 v6, v6, 0x2

    .line 1844
    .line 1845
    aget-object v3, v3, v6

    .line 1846
    .line 1847
    invoke-static {v2, v4, v3}, Lou1;->W(Lwt2;Lmr2;Lnu3;)V

    .line 1848
    .line 1849
    .line 1850
    goto :goto_f

    .line 1851
    :cond_11
    if-gez v3, :cond_12

    .line 1852
    .line 1853
    invoke-static {v4, v2}, Lmr2;->x(Lmr2;Lwt2;)V

    .line 1854
    .line 1855
    .line 1856
    sget-object v3, Lpu3;->e:[Lnu3;

    .line 1857
    .line 1858
    aget-byte v6, v1, v8

    .line 1859
    .line 1860
    neg-int v6, v6

    .line 1861
    div-int/lit8 v6, v6, 0x2

    .line 1862
    .line 1863
    aget-object v3, v3, v6

    .line 1864
    .line 1865
    invoke-static {v2, v4, v3}, Lou1;->Y(Lwt2;Lmr2;Lnu3;)V

    .line 1866
    .line 1867
    .line 1868
    :cond_12
    :goto_f
    add-int/lit8 v8, v8, -0x1

    .line 1869
    .line 1870
    goto :goto_d

    .line 1871
    :cond_13
    new-instance v0, Ljr3;

    .line 1872
    .line 1873
    invoke-direct {v0, v2}, Ljr3;-><init>(Lwt2;)V

    .line 1874
    .line 1875
    .line 1876
    invoke-virtual {v0}, Ljr3;->h()[B

    .line 1877
    .line 1878
    .line 1879
    move-result-object v0

    .line 1880
    move/from16 v7, v16

    .line 1881
    .line 1882
    const/16 v1, 0x20

    .line 1883
    .line 1884
    :goto_10
    if-ge v7, v1, :cond_14

    .line 1885
    .line 1886
    aget-byte v2, v0, v7

    .line 1887
    .line 1888
    aget-byte v3, p1, v7

    .line 1889
    .line 1890
    if-ne v2, v3, :cond_16

    .line 1891
    .line 1892
    add-int/lit8 v7, v7, 0x1

    .line 1893
    .line 1894
    goto :goto_10

    .line 1895
    :cond_14
    return-void

    .line 1896
    :cond_15
    move-object/from16 v9, p2

    .line 1897
    .line 1898
    move v1, v4

    .line 1899
    move/from16 v51, v5

    .line 1900
    .line 1901
    add-int/lit8 v6, v6, -0x1

    .line 1902
    .line 1903
    move-object/from16 v0, p1

    .line 1904
    .line 1905
    move-object/from16 v1, p0

    .line 1906
    .line 1907
    goto/16 :goto_0

    .line 1908
    .line 1909
    :cond_16
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 1910
    .line 1911
    const-string v1, "Signature check failed."

    .line 1912
    .line 1913
    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 1914
    .line 1915
    .line 1916
    throw v0

    .line 1917
    :cond_17
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 1918
    .line 1919
    const-string v1, "The length of the signature is not 64."

    .line 1920
    .line 1921
    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 1922
    .line 1923
    .line 1924
    throw v0
.end method
