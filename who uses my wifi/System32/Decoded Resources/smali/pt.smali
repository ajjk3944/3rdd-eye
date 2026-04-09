.class public final Lpt;
.super Lcr;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# static fields
.field public static final i:Lue0;


# instance fields
.field public g:I

.field public h:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lue0;

    .line 2
    .line 3
    const-string v1, "EDNS Extended Error Codes"

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    invoke-direct {v0, v1, v2}, Lue0;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lpt;->i:Lue0;

    .line 10
    .line 11
    const v1, 0xffff

    .line 12
    .line 13
    .line 14
    iput v1, v0, Lue0;->i:I

    .line 15
    .line 16
    const-string v1, "EDE"

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Lue0;->g(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    const-string v3, "OTHER"

    .line 23
    .line 24
    invoke-virtual {v0, v3, v1}, Lue0;->b(Ljava/lang/String;I)V

    .line 25
    .line 26
    .line 27
    const-string v1, "UNSUPPORTED_DNSKEY_ALGORITHM"

    .line 28
    .line 29
    invoke-virtual {v0, v1, v2}, Lue0;->b(Ljava/lang/String;I)V

    .line 30
    .line 31
    .line 32
    const/4 v1, 0x2

    .line 33
    const-string v2, "UNSUPPORTED_DS_DIGEST_TYPE"

    .line 34
    .line 35
    invoke-virtual {v0, v2, v1}, Lue0;->b(Ljava/lang/String;I)V

    .line 36
    .line 37
    .line 38
    const/4 v1, 0x3

    .line 39
    const-string v2, "STALE_ANSWER"

    .line 40
    .line 41
    invoke-virtual {v0, v2, v1}, Lue0;->b(Ljava/lang/String;I)V

    .line 42
    .line 43
    .line 44
    const/4 v1, 0x4

    .line 45
    const-string v2, "FORGED_ANSWER"

    .line 46
    .line 47
    invoke-virtual {v0, v2, v1}, Lue0;->b(Ljava/lang/String;I)V

    .line 48
    .line 49
    .line 50
    const/4 v1, 0x5

    .line 51
    const-string v2, "DNSSEC_INDETERMINATE"

    .line 52
    .line 53
    invoke-virtual {v0, v2, v1}, Lue0;->b(Ljava/lang/String;I)V

    .line 54
    .line 55
    .line 56
    const/4 v1, 0x6

    .line 57
    const-string v2, "DNSSEC_BOGUS"

    .line 58
    .line 59
    invoke-virtual {v0, v2, v1}, Lue0;->b(Ljava/lang/String;I)V

    .line 60
    .line 61
    .line 62
    const/4 v1, 0x7

    .line 63
    const-string v2, "SIGNATURE_EXPIRED"

    .line 64
    .line 65
    invoke-virtual {v0, v2, v1}, Lue0;->b(Ljava/lang/String;I)V

    .line 66
    .line 67
    .line 68
    const/16 v1, 0x8

    .line 69
    .line 70
    const-string v2, "SIGNATURE_NOT_YET_VALID"

    .line 71
    .line 72
    invoke-virtual {v0, v2, v1}, Lue0;->b(Ljava/lang/String;I)V

    .line 73
    .line 74
    .line 75
    const/16 v1, 0x9

    .line 76
    .line 77
    const-string v2, "DNSKEY_MISSING"

    .line 78
    .line 79
    invoke-virtual {v0, v2, v1}, Lue0;->b(Ljava/lang/String;I)V

    .line 80
    .line 81
    .line 82
    const/16 v1, 0xa

    .line 83
    .line 84
    const-string v2, "RRSIGS_MISSING"

    .line 85
    .line 86
    invoke-virtual {v0, v2, v1}, Lue0;->b(Ljava/lang/String;I)V

    .line 87
    .line 88
    .line 89
    const/16 v1, 0xb

    .line 90
    .line 91
    const-string v2, "NO_ZONE_KEY_BIT_SET"

    .line 92
    .line 93
    invoke-virtual {v0, v2, v1}, Lue0;->b(Ljava/lang/String;I)V

    .line 94
    .line 95
    .line 96
    const/16 v1, 0xc

    .line 97
    .line 98
    const-string v2, "NSEC_MISSING"

    .line 99
    .line 100
    invoke-virtual {v0, v2, v1}, Lue0;->b(Ljava/lang/String;I)V

    .line 101
    .line 102
    .line 103
    const/16 v1, 0xd

    .line 104
    .line 105
    const-string v2, "CACHED_ERROR"

    .line 106
    .line 107
    invoke-virtual {v0, v2, v1}, Lue0;->b(Ljava/lang/String;I)V

    .line 108
    .line 109
    .line 110
    const/16 v1, 0xe

    .line 111
    .line 112
    const-string v2, "NOT_READY"

    .line 113
    .line 114
    invoke-virtual {v0, v2, v1}, Lue0;->b(Ljava/lang/String;I)V

    .line 115
    .line 116
    .line 117
    const/16 v1, 0xf

    .line 118
    .line 119
    const-string v2, "BLOCKED"

    .line 120
    .line 121
    invoke-virtual {v0, v2, v1}, Lue0;->b(Ljava/lang/String;I)V

    .line 122
    .line 123
    .line 124
    const/16 v1, 0x10

    .line 125
    .line 126
    const-string v2, "CENSORED"

    .line 127
    .line 128
    invoke-virtual {v0, v2, v1}, Lue0;->b(Ljava/lang/String;I)V

    .line 129
    .line 130
    .line 131
    const/16 v1, 0x11

    .line 132
    .line 133
    const-string v2, "FILTERED"

    .line 134
    .line 135
    invoke-virtual {v0, v2, v1}, Lue0;->b(Ljava/lang/String;I)V

    .line 136
    .line 137
    .line 138
    const/16 v1, 0x12

    .line 139
    .line 140
    const-string v2, "PROHIBITED"

    .line 141
    .line 142
    invoke-virtual {v0, v2, v1}, Lue0;->b(Ljava/lang/String;I)V

    .line 143
    .line 144
    .line 145
    const/16 v1, 0x13

    .line 146
    .line 147
    const-string v2, "STALE_NXDOMAIN_ANSWER"

    .line 148
    .line 149
    invoke-virtual {v0, v2, v1}, Lue0;->b(Ljava/lang/String;I)V

    .line 150
    .line 151
    .line 152
    const/16 v1, 0x14

    .line 153
    .line 154
    const-string v2, "NOT_AUTHORITATIVE"

    .line 155
    .line 156
    invoke-virtual {v0, v2, v1}, Lue0;->b(Ljava/lang/String;I)V

    .line 157
    .line 158
    .line 159
    const/16 v1, 0x15

    .line 160
    .line 161
    const-string v2, "NOT_SUPPORTED"

    .line 162
    .line 163
    invoke-virtual {v0, v2, v1}, Lue0;->b(Ljava/lang/String;I)V

    .line 164
    .line 165
    .line 166
    const/16 v1, 0x16

    .line 167
    .line 168
    const-string v2, "NO_REACHABLE_AUTHORITY"

    .line 169
    .line 170
    invoke-virtual {v0, v2, v1}, Lue0;->b(Ljava/lang/String;I)V

    .line 171
    .line 172
    .line 173
    const/16 v1, 0x17

    .line 174
    .line 175
    const-string v2, "NETWORK_ERROR"

    .line 176
    .line 177
    invoke-virtual {v0, v2, v1}, Lue0;->b(Ljava/lang/String;I)V

    .line 178
    .line 179
    .line 180
    const/16 v1, 0x18

    .line 181
    .line 182
    const-string v2, "INVALID_DATA"

    .line 183
    .line 184
    invoke-virtual {v0, v2, v1}, Lue0;->b(Ljava/lang/String;I)V

    .line 185
    .line 186
    .line 187
    const/16 v1, 0x19

    .line 188
    .line 189
    const-string v2, "SIGNATURE_EXPIRED_BEFORE_VALID"

    .line 190
    .line 191
    invoke-virtual {v0, v2, v1}, Lue0;->b(Ljava/lang/String;I)V

    .line 192
    .line 193
    .line 194
    const/16 v1, 0x1a

    .line 195
    .line 196
    const-string v2, "TOO_EARLY"

    .line 197
    .line 198
    invoke-virtual {v0, v2, v1}, Lue0;->b(Ljava/lang/String;I)V

    .line 199
    .line 200
    .line 201
    const/16 v1, 0x1b

    .line 202
    .line 203
    const-string v2, "UNSUPPORTED_NSEC3_ITERATIONS_VALUE"

    .line 204
    .line 205
    invoke-virtual {v0, v2, v1}, Lue0;->b(Ljava/lang/String;I)V

    .line 206
    .line 207
    .line 208
    const/16 v1, 0x1c

    .line 209
    .line 210
    const-string v2, "UNABLE_TO_CONFORM_TO_POLICY"

    .line 211
    .line 212
    invoke-virtual {v0, v2, v1}, Lue0;->b(Ljava/lang/String;I)V

    .line 213
    .line 214
    .line 215
    const/16 v1, 0x1d

    .line 216
    .line 217
    const-string v2, "SYNTHESIZED"

    .line 218
    .line 219
    invoke-virtual {v0, v2, v1}, Lue0;->b(Ljava/lang/String;I)V

    .line 220
    .line 221
    .line 222
    return-void
.end method


# virtual methods
.method public final a(Lcm;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Lcm;->f()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iput v0, p0, Lpt;->g:I

    .line 6
    .line 7
    iget-object v0, p1, Lcm;->j:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Ljava/nio/ByteBuffer;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/nio/Buffer;->remaining()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-lez v0, :cond_1

    .line 16
    .line 17
    invoke-virtual {p1}, Lcm;->b()[B

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    array-length v0, p1

    .line 22
    array-length v1, p1

    .line 23
    add-int/lit8 v1, v1, -0x1

    .line 24
    .line 25
    aget-byte v1, p1, v1

    .line 26
    .line 27
    if-nez v1, :cond_0

    .line 28
    .line 29
    add-int/lit8 v0, v0, -0x1

    .line 30
    .line 31
    :cond_0
    new-instance v1, Ljava/lang/String;

    .line 32
    .line 33
    const/4 v2, 0x0

    .line 34
    sget-object v3, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 35
    .line 36
    invoke-direct {v1, p1, v2, v0, v3}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 37
    .line 38
    .line 39
    iput-object v1, p0, Lpt;->h:Ljava/lang/String;

    .line 40
    .line 41
    :cond_1
    return-void
.end method

.method public final b()Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p0, Lpt;->h:Ljava/lang/String;

    .line 2
    .line 3
    sget-object v1, Lpt;->i:Lue0;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget v0, p0, Lpt;->g:I

    .line 8
    .line 9
    invoke-virtual {v1, v0}, Lue0;->e(I)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0

    .line 14
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 17
    .line 18
    .line 19
    iget v2, p0, Lpt;->g:I

    .line 20
    .line 21
    invoke-virtual {v1, v2}, Lue0;->e(I)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string v1, ": "

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    iget-object v1, p0, Lpt;->h:Ljava/lang/String;

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    return-object v0
.end method

.method public final c(Lt3;)V
    .locals 2

    .line 1
    iget v0, p0, Lpt;->g:I

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Lt3;->m(I)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lpt;->h:Ljava/lang/String;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    iget-object v0, p0, Lpt;->h:Ljava/lang/String;

    .line 17
    .line 18
    sget-object v1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {p1, v0}, Lt3;->j([B)V

    .line 25
    .line 26
    .line 27
    :cond_0
    return-void
.end method
