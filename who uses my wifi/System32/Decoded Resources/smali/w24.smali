.class public final Lw24;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lor3;


# static fields
.field public static final f:[B


# instance fields
.field public final synthetic a:I

.field public final b:[B

.field public final c:[B

.field public final d:Ljava/security/PublicKey;

.field public final e:Ljava/io/Serializable;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/16 v0, 0xc

    .line 2
    .line 3
    new-array v0, v0, [B

    .line 4
    .line 5
    fill-array-data v0, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v0, Lw24;->f:[B

    .line 9
    .line 10
    return-void

    .line 11
    :array_0
    .array-data 1
        0x30t
        0x2at
        0x30t
        0x5t
        0x6t
        0x3t
        0x2bt
        0x65t
        0x70t
        0x3t
        0x21t
        0x0t
    .end array-data
.end method

.method public synthetic constructor <init>(Ljava/security/interfaces/RSAPublicKey;Lp34;[B[B)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lw24;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lmu3;->a()Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    invoke-static {p2}, Lbd2;->L(Lp34;)V

    .line 3
    invoke-interface {p1}, Ljava/security/interfaces/RSAKey;->getModulus()Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {v0}, Ljava/math/BigInteger;->bitLength()I

    move-result v0

    invoke-static {v0}, Lbd2;->M(I)V

    .line 4
    invoke-interface {p1}, Ljava/security/interfaces/RSAPublicKey;->getPublicExponent()Ljava/math/BigInteger;

    move-result-object v0

    invoke-static {v0}, Lbd2;->P(Ljava/math/BigInteger;)V

    iput-object p1, p0, Lw24;->d:Ljava/security/PublicKey;

    iput-object p2, p0, Lw24;->e:Ljava/io/Serializable;

    iput-object p3, p0, Lw24;->b:[B

    iput-object p4, p0, Lw24;->c:[B

    return-void

    .line 5
    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "Conscrypt is not available, and we cannot use Java Implementation of RSA-PKCS1.5 in FIPS-mode."

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public constructor <init>([B[B[BLjava/security/Provider;)V
    .locals 3

    const/4 v0, 0x0

    iput v0, p0, Lw24;->a:I

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    invoke-static {v0}, Lyb;->x(I)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 7
    array-length v0, p1

    .line 8
    new-instance v1, Ljava/security/spec/X509EncodedKeySpec;

    const/16 v2, 0x20

    if-ne v0, v2, :cond_0

    .line 9
    sget-object v0, Lw24;->f:[B

    filled-new-array {v0, p1}, [[B

    move-result-object p1

    .line 10
    invoke-static {p1}, Li41;->L([[B)[B

    move-result-object p1

    .line 11
    invoke-direct {v1, p1}, Ljava/security/spec/X509EncodedKeySpec;-><init>([B)V

    const-string p1, "Ed25519"

    .line 12
    invoke-static {p1, p4}, Ljava/security/KeyFactory;->getInstance(Ljava/lang/String;Ljava/security/Provider;)Ljava/security/KeyFactory;

    move-result-object p1

    .line 13
    invoke-virtual {p1, v1}, Ljava/security/KeyFactory;->generatePublic(Ljava/security/spec/KeySpec;)Ljava/security/PublicKey;

    move-result-object p1

    iput-object p1, p0, Lw24;->d:Ljava/security/PublicKey;

    iput-object p2, p0, Lw24;->b:[B

    iput-object p3, p0, Lw24;->c:[B

    iput-object p4, p0, Lw24;->e:Ljava/io/Serializable;

    return-void

    .line 14
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 15
    const-string p2, "Given public key\'s length is not 32."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 16
    :cond_1
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "Can not use Ed25519 in FIPS-mode."

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static a(Lt14;)Lw24;
    .locals 6

    .line 1
    invoke-static {}, Lob1;->t()Ljava/security/Provider;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_2

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    invoke-static {v1}, Lyb;->x(I)Z

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    if-eqz v2, :cond_1

    .line 13
    .line 14
    new-instance v2, Lw24;

    .line 15
    .line 16
    iget-object v3, p0, Lt14;->k:Lv34;

    .line 17
    .line 18
    invoke-virtual {v3}, Lv34;->b()[B

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    iget-object v4, p0, Lt14;->l:Lv34;

    .line 23
    .line 24
    invoke-virtual {v4}, Lv34;->b()[B

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    iget-object p0, p0, Lt14;->j:Lq14;

    .line 29
    .line 30
    iget-object p0, p0, Lq14;->a:Lp14;

    .line 31
    .line 32
    sget-object v5, Lp14;->d:Lp14;

    .line 33
    .line 34
    invoke-virtual {p0, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result p0

    .line 38
    const/4 v5, 0x0

    .line 39
    if-eqz p0, :cond_0

    .line 40
    .line 41
    new-array p0, v1, [B

    .line 42
    .line 43
    aput-byte v5, p0, v5

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_0
    new-array p0, v5, [B

    .line 47
    .line 48
    :goto_0
    invoke-direct {v2, v3, v4, p0, v0}, Lw24;-><init>([B[B[BLjava/security/Provider;)V

    .line 49
    .line 50
    .line 51
    return-object v2

    .line 52
    :cond_1
    new-instance p0, Ljava/security/GeneralSecurityException;

    .line 53
    .line 54
    const-string v0, "Can not use Ed25519 in FIPS-mode."

    .line 55
    .line 56
    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    throw p0

    .line 60
    :cond_2
    new-instance p0, Ljava/security/NoSuchProviderException;

    .line 61
    .line 62
    const-string v0, "Ed25519VerifyJce requires the Conscrypt provider."

    .line 63
    .line 64
    invoke-direct {p0, v0}, Ljava/security/NoSuchProviderException;-><init>(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    throw p0
.end method


# virtual methods
.method public final b([B[B)V
    .locals 4

    .line 1
    iget v0, p0, Lw24;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lw24;->b:[B

    .line 7
    .line 8
    array-length v1, v0

    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0, p1, p2}, Lw24;->c([B[B)V

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    invoke-static {v0, p1}, Low3;->c([B[B)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    array-length v0, p1

    .line 22
    invoke-static {p1, v1, v0}, Ljava/util/Arrays;->copyOfRange([BII)[B

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-virtual {p0, p1, p2}, Lw24;->c([B[B)V

    .line 27
    .line 28
    .line 29
    :goto_0
    return-void

    .line 30
    :cond_1
    new-instance p1, Ljava/security/GeneralSecurityException;

    .line 31
    .line 32
    const-string p2, "Invalid signature (output prefix mismatch)"

    .line 33
    .line 34
    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    throw p1

    .line 38
    :pswitch_0
    iget-object v0, p0, Lw24;->b:[B

    .line 39
    .line 40
    array-length v1, v0

    .line 41
    array-length v2, p1

    .line 42
    add-int/lit8 v3, v1, 0x40

    .line 43
    .line 44
    if-ne v2, v3, :cond_4

    .line 45
    .line 46
    invoke-static {v0, p1}, Low3;->c([B[B)Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-eqz v0, :cond_3

    .line 51
    .line 52
    iget-object v0, p0, Lw24;->e:Ljava/io/Serializable;

    .line 53
    .line 54
    check-cast v0, Ljava/security/Provider;

    .line 55
    .line 56
    const-string v2, "Ed25519"

    .line 57
    .line 58
    invoke-static {v2, v0}, Ljava/security/Signature;->getInstance(Ljava/lang/String;Ljava/security/Provider;)Ljava/security/Signature;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    iget-object v2, p0, Lw24;->d:Ljava/security/PublicKey;

    .line 63
    .line 64
    invoke-virtual {v0, v2}, Ljava/security/Signature;->initVerify(Ljava/security/PublicKey;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0, p2}, Ljava/security/Signature;->update([B)V

    .line 68
    .line 69
    .line 70
    iget-object p2, p0, Lw24;->c:[B

    .line 71
    .line 72
    invoke-virtual {v0, p2}, Ljava/security/Signature;->update([B)V

    .line 73
    .line 74
    .line 75
    const/16 p2, 0x40

    .line 76
    .line 77
    :try_start_0
    invoke-virtual {v0, p1, v1, p2}, Ljava/security/Signature;->verify([BII)Z

    .line 78
    .line 79
    .line 80
    move-result p1
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 81
    if-eqz p1, :cond_2

    .line 82
    .line 83
    return-void

    .line 84
    :catch_0
    :cond_2
    new-instance p1, Ljava/security/GeneralSecurityException;

    .line 85
    .line 86
    const-string p2, "Signature check failed."

    .line 87
    .line 88
    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    throw p1

    .line 92
    :cond_3
    new-instance p1, Ljava/security/GeneralSecurityException;

    .line 93
    .line 94
    const-string p2, "Invalid signature (output prefix mismatch)"

    .line 95
    .line 96
    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    throw p1

    .line 100
    :cond_4
    new-instance p1, Ljava/security/GeneralSecurityException;

    .line 101
    .line 102
    const-string p2, "Invalid signature length: 64"

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
    .locals 9

    .line 1
    iget-object v0, p0, Lw24;->d:Ljava/security/PublicKey;

    .line 2
    .line 3
    check-cast v0, Ljava/security/interfaces/RSAPublicKey;

    .line 4
    .line 5
    invoke-interface {v0}, Ljava/security/interfaces/RSAPublicKey;->getPublicExponent()Ljava/math/BigInteger;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-interface {v0}, Ljava/security/interfaces/RSAKey;->getModulus()Ljava/math/BigInteger;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, Ljava/math/BigInteger;->bitLength()I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    add-int/lit8 v2, v2, 0x7

    .line 18
    .line 19
    div-int/lit8 v2, v2, 0x8

    .line 20
    .line 21
    array-length v3, p1

    .line 22
    if-ne v2, v3, :cond_8

    .line 23
    .line 24
    new-instance v3, Ljava/math/BigInteger;

    .line 25
    .line 26
    const/4 v4, 0x1

    .line 27
    invoke-direct {v3, v4, p1}, Ljava/math/BigInteger;-><init>(I[B)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v3, v0}, Ljava/math/BigInteger;->compareTo(Ljava/math/BigInteger;)I

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    if-gez p1, :cond_7

    .line 35
    .line 36
    invoke-virtual {v3, v1, v0}, Ljava/math/BigInteger;->modPow(Ljava/math/BigInteger;Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-static {p1, v2}, La30;->v(Ljava/math/BigInteger;I)[B

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    iget-object v0, p0, Lw24;->e:Ljava/io/Serializable;

    .line 45
    .line 46
    check-cast v0, Lp34;

    .line 47
    .line 48
    invoke-static {v0}, Lbd2;->L(Lp34;)V

    .line 49
    .line 50
    .line 51
    sget-object v1, Lm34;->e:Lm34;

    .line 52
    .line 53
    invoke-static {v0}, Lg82;->A(Lp34;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    iget-object v1, v1, Lm34;->a:Ll34;

    .line 58
    .line 59
    invoke-interface {v1, v3}, Ll34;->l(Ljava/lang/String;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    check-cast v1, Ljava/security/MessageDigest;

    .line 64
    .line 65
    invoke-virtual {v1, p2}, Ljava/security/MessageDigest;->update([B)V

    .line 66
    .line 67
    .line 68
    iget-object p2, p0, Lw24;->c:[B

    .line 69
    .line 70
    array-length v3, p2

    .line 71
    if-eqz v3, :cond_0

    .line 72
    .line 73
    invoke-virtual {v1, p2}, Ljava/security/MessageDigest;->update([B)V

    .line 74
    .line 75
    .line 76
    :cond_0
    invoke-virtual {v1}, Ljava/security/MessageDigest;->digest()[B

    .line 77
    .line 78
    .line 79
    move-result-object p2

    .line 80
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 81
    .line 82
    .line 83
    move-result v1

    .line 84
    const/4 v3, 0x2

    .line 85
    if-eq v1, v3, :cond_3

    .line 86
    .line 87
    const/4 v5, 0x3

    .line 88
    if-eq v1, v5, :cond_2

    .line 89
    .line 90
    const/4 v5, 0x4

    .line 91
    if-ne v1, v5, :cond_1

    .line 92
    .line 93
    const-string v0, "3051300d060960864801650304020305000440"

    .line 94
    .line 95
    invoke-static {v0}, Lou1;->K(Ljava/lang/String;)[B

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    goto :goto_0

    .line 100
    :cond_1
    new-instance p1, Ljava/security/GeneralSecurityException;

    .line 101
    .line 102
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object p2

    .line 106
    const-string v0, "Unsupported hash "

    .line 107
    .line 108
    invoke-virtual {v0, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object p2

    .line 112
    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    throw p1

    .line 116
    :cond_2
    const-string v0, "3041300d060960864801650304020205000430"

    .line 117
    .line 118
    invoke-static {v0}, Lou1;->K(Ljava/lang/String;)[B

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    goto :goto_0

    .line 123
    :cond_3
    const-string v0, "3031300d060960864801650304020105000420"

    .line 124
    .line 125
    invoke-static {v0}, Lou1;->K(Ljava/lang/String;)[B

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    :goto_0
    array-length v1, p2

    .line 130
    array-length v5, v0

    .line 131
    add-int/2addr v5, v1

    .line 132
    add-int/lit8 v1, v5, 0xb

    .line 133
    .line 134
    if-lt v2, v1, :cond_6

    .line 135
    .line 136
    new-array v1, v2, [B

    .line 137
    .line 138
    const/4 v6, 0x0

    .line 139
    aput-byte v6, v1, v6

    .line 140
    .line 141
    aput-byte v4, v1, v4

    .line 142
    .line 143
    move v4, v6

    .line 144
    :goto_1
    add-int/lit8 v7, v3, 0x1

    .line 145
    .line 146
    sub-int v8, v2, v5

    .line 147
    .line 148
    add-int/lit8 v8, v8, -0x3

    .line 149
    .line 150
    if-ge v4, v8, :cond_4

    .line 151
    .line 152
    const/4 v8, -0x1

    .line 153
    aput-byte v8, v1, v3

    .line 154
    .line 155
    add-int/lit8 v4, v4, 0x1

    .line 156
    .line 157
    move v3, v7

    .line 158
    goto :goto_1

    .line 159
    :cond_4
    aput-byte v6, v1, v3

    .line 160
    .line 161
    array-length v2, v0

    .line 162
    invoke-static {v0, v6, v1, v7, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 163
    .line 164
    .line 165
    array-length v0, p2

    .line 166
    add-int/2addr v7, v2

    .line 167
    invoke-static {p2, v6, v1, v7, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 168
    .line 169
    .line 170
    invoke-static {p1, v1}, Ljava/security/MessageDigest;->isEqual([B[B)Z

    .line 171
    .line 172
    .line 173
    move-result p1

    .line 174
    if-eqz p1, :cond_5

    .line 175
    .line 176
    return-void

    .line 177
    :cond_5
    new-instance p1, Ljava/security/GeneralSecurityException;

    .line 178
    .line 179
    const-string p2, "invalid signature"

    .line 180
    .line 181
    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 182
    .line 183
    .line 184
    throw p1

    .line 185
    :cond_6
    new-instance p1, Ljava/security/GeneralSecurityException;

    .line 186
    .line 187
    const-string p2, "intended encoded message length too short"

    .line 188
    .line 189
    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 190
    .line 191
    .line 192
    throw p1

    .line 193
    :cond_7
    new-instance p1, Ljava/security/GeneralSecurityException;

    .line 194
    .line 195
    const-string p2, "signature out of range"

    .line 196
    .line 197
    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 198
    .line 199
    .line 200
    throw p1

    .line 201
    :cond_8
    new-instance p1, Ljava/security/GeneralSecurityException;

    .line 202
    .line 203
    const-string p2, "invalid signature\'s length"

    .line 204
    .line 205
    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 206
    .line 207
    .line 208
    throw p1
.end method
