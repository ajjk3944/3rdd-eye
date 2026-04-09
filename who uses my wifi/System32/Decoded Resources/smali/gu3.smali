.class public final Lgu3;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lcr3;


# instance fields
.field public final synthetic a:I

.field public final b:[B

.field public final c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I[B[B)V
    .locals 1

    iput p1, p0, Lgu3;->a:I

    packed-switch p1, :pswitch_data_0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x1

    invoke-static {p1}, Lyb;->x(I)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 2
    sget-object p1, Lbu3;->f:Ldu;

    invoke-virtual {p1}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljavax/crypto/Cipher;

    if-eqz p1, :cond_1

    .line 3
    array-length p1, p2

    const/16 v0, 0x20

    if-ne p1, v0, :cond_0

    .line 4
    iput-object p2, p0, Lgu3;->b:[B

    iput-object p3, p0, Lgu3;->c:Ljava/lang/Object;

    return-void

    :cond_0
    new-instance p1, Ljava/security/InvalidKeyException;

    const-string p2, "The key length in bytes must be 32."

    invoke-direct {p1, p2}, Ljava/security/InvalidKeyException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 5
    :cond_1
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "JCE does not support algorithm: ChaCha20-Poly1305"

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 6
    :cond_2
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "Can not use ChaCha20Poly1305 in FIPS-mode."

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 7
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, Lfu3;

    const/4 v0, 0x1

    .line 8
    invoke-direct {p1, v0, p2}, Lfu3;-><init>(I[B)V

    .line 9
    iput-object p1, p0, Lgu3;->c:Ljava/lang/Object;

    iput-object p3, p0, Lgu3;->b:[B

    return-void

    .line 10
    :pswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, Lfu3;

    const/4 v0, 0x0

    .line 11
    invoke-direct {p1, v0, p2}, Lfu3;-><init>(I[B)V

    .line 12
    iput-object p1, p0, Lgu3;->c:Ljava/lang/Object;

    iput-object p3, p0, Lgu3;->b:[B

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public constructor <init>(Lcr3;[B)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lgu3;->a:I

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lgu3;->c:Ljava/lang/Object;

    array-length p1, p2

    if-eqz p1, :cond_1

    const/4 v0, 0x5

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "identifier has an invalid length"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    iput-object p2, p0, Lgu3;->b:[B

    return-void
.end method

.method public constructor <init>([BLv34;)V
    .locals 2

    const/4 v0, 0x2

    iput v0, p0, Lgu3;->a:I

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {v0}, Lyb;->x(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 15
    sget-object v0, Lxt3;->a:Ldu;

    .line 16
    array-length v0, p1

    invoke-static {v0}, Lbd2;->H(I)V

    .line 17
    new-instance v0, Ljavax/crypto/spec/SecretKeySpec;

    const-string v1, "AES"

    invoke-direct {v0, p1, v1}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    .line 18
    iput-object v0, p0, Lgu3;->c:Ljava/lang/Object;

    .line 19
    invoke-virtual {p2}, Lv34;->b()[B

    move-result-object p1

    iput-object p1, p0, Lgu3;->b:[B

    return-void

    .line 20
    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available."

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public a([B[B)[B
    .locals 3

    .line 1
    array-length v0, p1

    .line 2
    const/16 v1, 0x1c

    .line 3
    .line 4
    if-lt v0, v1, :cond_0

    .line 5
    .line 6
    const/16 v1, 0xc

    .line 7
    .line 8
    invoke-static {p1, v1}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    add-int/lit8 v0, v0, -0xc

    .line 13
    .line 14
    invoke-static {p1, v1, v0}, Ljava/nio/ByteBuffer;->wrap([BII)Ljava/nio/ByteBuffer;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    iget-object v0, p0, Lgu3;->c:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, Lfu3;

    .line 21
    .line 22
    invoke-virtual {v0, p1, v2, p2}, Le6;->s(Ljava/nio/ByteBuffer;[B[B)[B

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    return-object p1

    .line 27
    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    .line 28
    .line 29
    const-string p2, "ciphertext too short"

    .line 30
    .line 31
    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    throw p1
.end method

.method public final b([B[B)[B
    .locals 10

    .line 1
    iget v0, p0, Lgu3;->a:I

    .line 2
    .line 3
    const-string v1, "ciphertext is null"

    .line 4
    .line 5
    const-string v2, "ciphertext too short"

    .line 6
    .line 7
    const/4 v3, 0x2

    .line 8
    const/16 v4, 0xc

    .line 9
    .line 10
    iget-object v5, p0, Lgu3;->c:Ljava/lang/Object;

    .line 11
    .line 12
    const-string v6, "Decryption failed (OutputPrefix mismatch)."

    .line 13
    .line 14
    iget-object v7, p0, Lgu3;->b:[B

    .line 15
    .line 16
    packed-switch v0, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    array-length v0, v7

    .line 20
    if-nez v0, :cond_0

    .line 21
    .line 22
    invoke-virtual {p0, p1, p2}, Lgu3;->c([B[B)[B

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    invoke-static {v7, p1}, Low3;->c([B[B)Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_1

    .line 32
    .line 33
    array-length v1, p1

    .line 34
    invoke-static {p1, v0, v1}, Ljava/util/Arrays;->copyOfRange([BII)[B

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-virtual {p0, p1, p2}, Lgu3;->c([B[B)[B

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    :goto_0
    return-object p1

    .line 43
    :cond_1
    new-instance p1, Ljava/security/GeneralSecurityException;

    .line 44
    .line 45
    invoke-direct {p1, v6}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    throw p1

    .line 49
    :pswitch_0
    array-length v0, v7

    .line 50
    if-nez v0, :cond_2

    .line 51
    .line 52
    invoke-virtual {p0, p1, p2}, Lgu3;->a([B[B)[B

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    goto :goto_1

    .line 57
    :cond_2
    invoke-static {v7, p1}, Low3;->c([B[B)Z

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    if-eqz v1, :cond_3

    .line 62
    .line 63
    array-length v1, p1

    .line 64
    invoke-static {p1, v0, v1}, Ljava/util/Arrays;->copyOfRange([BII)[B

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    invoke-virtual {p0, p1, p2}, Lgu3;->a([B[B)[B

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    :goto_1
    return-object p1

    .line 73
    :cond_3
    new-instance p1, Ljava/security/GeneralSecurityException;

    .line 74
    .line 75
    invoke-direct {p1, v6}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    throw p1

    .line 79
    :pswitch_1
    if-eqz p1, :cond_7

    .line 80
    .line 81
    array-length v0, p1

    .line 82
    array-length v1, v7

    .line 83
    add-int/lit8 v8, v1, 0x1c

    .line 84
    .line 85
    if-lt v0, v8, :cond_6

    .line 86
    .line 87
    invoke-static {v7, p1}, Low3;->c([B[B)Z

    .line 88
    .line 89
    .line 90
    move-result v2

    .line 91
    if-eqz v2, :cond_5

    .line 92
    .line 93
    sget-object v2, Lxt3;->a:Ldu;

    .line 94
    .line 95
    const-string v2, "java.vendor"

    .line 96
    .line 97
    invoke-static {v2}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v2

    .line 101
    const-string v6, "The Android Project"

    .line 102
    .line 103
    invoke-static {v2, v6}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    new-instance v2, Ljavax/crypto/spec/GCMParameterSpec;

    .line 107
    .line 108
    const/16 v6, 0x80

    .line 109
    .line 110
    invoke-direct {v2, v6, p1, v1, v4}, Ljavax/crypto/spec/GCMParameterSpec;-><init>(I[BII)V

    .line 111
    .line 112
    .line 113
    check-cast v5, Ljavax/crypto/spec/SecretKeySpec;

    .line 114
    .line 115
    sget-object v4, Lxt3;->a:Ldu;

    .line 116
    .line 117
    invoke-virtual {v4}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v4

    .line 121
    check-cast v4, Ljavax/crypto/Cipher;

    .line 122
    .line 123
    invoke-virtual {v4, v3, v5, v2}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V

    .line 124
    .line 125
    .line 126
    if-eqz p2, :cond_4

    .line 127
    .line 128
    array-length v2, p2

    .line 129
    if-eqz v2, :cond_4

    .line 130
    .line 131
    invoke-virtual {v4, p2}, Ljavax/crypto/Cipher;->updateAAD([B)V

    .line 132
    .line 133
    .line 134
    :cond_4
    add-int/lit8 p2, v1, 0xc

    .line 135
    .line 136
    sub-int/2addr v0, v1

    .line 137
    add-int/lit8 v0, v0, -0xc

    .line 138
    .line 139
    invoke-virtual {v4, p1, p2, v0}, Ljavax/crypto/Cipher;->doFinal([BII)[B

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    return-object p1

    .line 144
    :cond_5
    new-instance p1, Ljava/security/GeneralSecurityException;

    .line 145
    .line 146
    invoke-direct {p1, v6}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    throw p1

    .line 150
    :cond_6
    new-instance p1, Ljava/security/GeneralSecurityException;

    .line 151
    .line 152
    invoke-direct {p1, v2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    throw p1

    .line 156
    :cond_7
    new-instance p1, Ljava/lang/NullPointerException;

    .line 157
    .line 158
    invoke-direct {p1, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    throw p1

    .line 162
    :pswitch_2
    if-eqz p1, :cond_b

    .line 163
    .line 164
    check-cast v5, [B

    .line 165
    .line 166
    array-length v0, p1

    .line 167
    array-length v1, v5

    .line 168
    add-int/lit8 v8, v1, 0x28

    .line 169
    .line 170
    if-lt v0, v8, :cond_a

    .line 171
    .line 172
    invoke-static {v5, p1}, Low3;->c([B[B)Z

    .line 173
    .line 174
    .line 175
    move-result v2

    .line 176
    if-eqz v2, :cond_9

    .line 177
    .line 178
    const/16 v2, 0x18

    .line 179
    .line 180
    new-array v5, v2, [B

    .line 181
    .line 182
    const/4 v6, 0x0

    .line 183
    invoke-static {p1, v1, v5, v6, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 184
    .line 185
    .line 186
    invoke-static {v7}, Ldu3;->c([B)[I

    .line 187
    .line 188
    .line 189
    move-result-object v2

    .line 190
    invoke-static {v5}, Ldu3;->c([B)[I

    .line 191
    .line 192
    .line 193
    move-result-object v6

    .line 194
    invoke-static {v2, v6}, Ldu3;->d([I[I)[I

    .line 195
    .line 196
    .line 197
    move-result-object v2

    .line 198
    array-length v6, v2

    .line 199
    const/4 v7, 0x4

    .line 200
    mul-int/2addr v6, v7

    .line 201
    invoke-static {v6}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 202
    .line 203
    .line 204
    move-result-object v6

    .line 205
    sget-object v8, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 206
    .line 207
    invoke-virtual {v6, v8}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 208
    .line 209
    .line 210
    move-result-object v6

    .line 211
    invoke-virtual {v6}, Ljava/nio/ByteBuffer;->asIntBuffer()Ljava/nio/IntBuffer;

    .line 212
    .line 213
    .line 214
    move-result-object v8

    .line 215
    invoke-virtual {v8, v2}, Ljava/nio/IntBuffer;->put([I)Ljava/nio/IntBuffer;

    .line 216
    .line 217
    .line 218
    invoke-virtual {v6}, Ljava/nio/ByteBuffer;->array()[B

    .line 219
    .line 220
    .line 221
    move-result-object v2

    .line 222
    new-instance v6, Ljavax/crypto/spec/SecretKeySpec;

    .line 223
    .line 224
    const-string v8, "ChaCha20"

    .line 225
    .line 226
    invoke-direct {v6, v2, v8}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    .line 227
    .line 228
    .line 229
    new-instance v2, Ljavax/crypto/spec/IvParameterSpec;

    .line 230
    .line 231
    new-array v4, v4, [B

    .line 232
    .line 233
    const/16 v8, 0x8

    .line 234
    .line 235
    const/16 v9, 0x10

    .line 236
    .line 237
    invoke-static {v5, v9, v4, v7, v8}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 238
    .line 239
    .line 240
    invoke-direct {v2, v4}, Ljavax/crypto/spec/IvParameterSpec;-><init>([B)V

    .line 241
    .line 242
    .line 243
    sget-object v4, Lbu3;->f:Ldu;

    .line 244
    .line 245
    invoke-virtual {v4}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 246
    .line 247
    .line 248
    move-result-object v4

    .line 249
    check-cast v4, Ljavax/crypto/Cipher;

    .line 250
    .line 251
    invoke-virtual {v4, v3, v6, v2}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V

    .line 252
    .line 253
    .line 254
    if-eqz p2, :cond_8

    .line 255
    .line 256
    array-length v2, p2

    .line 257
    if-eqz v2, :cond_8

    .line 258
    .line 259
    invoke-virtual {v4, p2}, Ljavax/crypto/Cipher;->updateAAD([B)V

    .line 260
    .line 261
    .line 262
    :cond_8
    add-int/lit8 p2, v1, 0x18

    .line 263
    .line 264
    sub-int/2addr v0, v1

    .line 265
    add-int/lit8 v0, v0, -0x18

    .line 266
    .line 267
    invoke-virtual {v4, p1, p2, v0}, Ljavax/crypto/Cipher;->doFinal([BII)[B

    .line 268
    .line 269
    .line 270
    move-result-object p1

    .line 271
    return-object p1

    .line 272
    :cond_9
    new-instance p1, Ljava/security/GeneralSecurityException;

    .line 273
    .line 274
    invoke-direct {p1, v6}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 275
    .line 276
    .line 277
    throw p1

    .line 278
    :cond_a
    new-instance p1, Ljava/security/GeneralSecurityException;

    .line 279
    .line 280
    invoke-direct {p1, v2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 281
    .line 282
    .line 283
    throw p1

    .line 284
    :cond_b
    new-instance p1, Ljava/lang/NullPointerException;

    .line 285
    .line 286
    invoke-direct {p1, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 287
    .line 288
    .line 289
    throw p1

    .line 290
    :pswitch_3
    check-cast v5, Lcr3;

    .line 291
    .line 292
    array-length v0, v7

    .line 293
    if-nez v0, :cond_c

    .line 294
    .line 295
    invoke-interface {v5, p1, p2}, Lcr3;->b([B[B)[B

    .line 296
    .line 297
    .line 298
    move-result-object p1

    .line 299
    goto :goto_2

    .line 300
    :cond_c
    invoke-static {v7, p1}, Low3;->c([B[B)Z

    .line 301
    .line 302
    .line 303
    move-result v0

    .line 304
    if-eqz v0, :cond_d

    .line 305
    .line 306
    const/4 v0, 0x5

    .line 307
    array-length v1, p1

    .line 308
    invoke-static {p1, v0, v1}, Ljava/util/Arrays;->copyOfRange([BII)[B

    .line 309
    .line 310
    .line 311
    move-result-object p1

    .line 312
    invoke-interface {v5, p1, p2}, Lcr3;->b([B[B)[B

    .line 313
    .line 314
    .line 315
    move-result-object p1

    .line 316
    :goto_2
    return-object p1

    .line 317
    :cond_d
    new-instance p1, Ljava/security/GeneralSecurityException;

    .line 318
    .line 319
    const-string p2, "wrong prefix"

    .line 320
    .line 321
    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 322
    .line 323
    .line 324
    throw p1

    .line 325
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public c([B[B)[B
    .locals 3

    .line 1
    array-length v0, p1

    .line 2
    const/16 v1, 0x28

    .line 3
    .line 4
    if-lt v0, v1, :cond_0

    .line 5
    .line 6
    const/16 v1, 0x18

    .line 7
    .line 8
    invoke-static {p1, v1}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    add-int/lit8 v0, v0, -0x18

    .line 13
    .line 14
    invoke-static {p1, v1, v0}, Ljava/nio/ByteBuffer;->wrap([BII)Ljava/nio/ByteBuffer;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    iget-object v0, p0, Lgu3;->c:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, Lfu3;

    .line 21
    .line 22
    invoke-virtual {v0, p1, v2, p2}, Le6;->s(Ljava/nio/ByteBuffer;[B[B)[B

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    return-object p1

    .line 27
    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    .line 28
    .line 29
    const-string p2, "ciphertext too short"

    .line 30
    .line 31
    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    throw p1
.end method
