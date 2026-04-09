.class public final La01;
.super Ltn0;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public k:Lgg0;

.field public l:Ljava/time/Instant;

.field public m:Ljava/time/Duration;

.field public n:[B

.field public o:I

.field public p:I

.field public q:[B


# virtual methods
.method public final k(Lcm;)V
    .locals 5

    .line 1
    new-instance v0, Lgg0;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Lgg0;-><init>(Lcm;)V

    .line 4
    .line 5
    .line 6
    iput-object v0, p0, La01;->k:Lgg0;

    .line 7
    .line 8
    invoke-virtual {p1}, Lcm;->f()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    int-to-long v0, v0

    .line 13
    invoke-virtual {p1}, Lcm;->g()J

    .line 14
    .line 15
    .line 16
    move-result-wide v2

    .line 17
    const/16 v4, 0x20

    .line 18
    .line 19
    shl-long/2addr v0, v4

    .line 20
    add-long/2addr v0, v2

    .line 21
    invoke-static {v0, v1}, Ljava/time/Instant;->ofEpochSecond(J)Ljava/time/Instant;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    iput-object v0, p0, La01;->l:Ljava/time/Instant;

    .line 26
    .line 27
    invoke-virtual {p1}, Lcm;->f()I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    int-to-long v0, v0

    .line 32
    invoke-static {v0, v1}, Ljava/time/Duration;->ofSeconds(J)Ljava/time/Duration;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    iput-object v0, p0, La01;->m:Ljava/time/Duration;

    .line 37
    .line 38
    invoke-virtual {p1}, Lcm;->f()I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    invoke-virtual {p1, v0}, Lcm;->c(I)[B

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    iput-object v0, p0, La01;->n:[B

    .line 47
    .line 48
    invoke-virtual {p1}, Lcm;->f()I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    iput v0, p0, La01;->o:I

    .line 53
    .line 54
    invoke-virtual {p1}, Lcm;->f()I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    iput v0, p0, La01;->p:I

    .line 59
    .line 60
    invoke-virtual {p1}, Lcm;->f()I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    if-lez v0, :cond_0

    .line 65
    .line 66
    invoke-virtual {p1, v0}, Lcm;->c(I)[B

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    iput-object p1, p0, La01;->q:[B

    .line 71
    .line 72
    return-void

    .line 73
    :cond_0
    const/4 p1, 0x0

    .line 74
    iput-object p1, p0, La01;->q:[B

    .line 75
    .line 76
    return-void
.end method

.method public final l()Ljava/lang/String;
    .locals 9

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, La01;->k:Lgg0;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    const-string v1, " "

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-static {}, Ltj0;->a()Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-eqz v2, :cond_0

    .line 21
    .line 22
    const-string v2, "(\n\t"

    .line 23
    .line 24
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    :cond_0
    iget-object v2, p0, La01;->l:Ljava/time/Instant;

    .line 28
    .line 29
    invoke-virtual {v2}, Ljava/time/Instant;->getEpochSecond()J

    .line 30
    .line 31
    .line 32
    move-result-wide v2

    .line 33
    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    iget-object v2, p0, La01;->m:Ljava/time/Duration;

    .line 40
    .line 41
    invoke-virtual {v2}, Ljava/time/Duration;->getSeconds()J

    .line 42
    .line 43
    .line 44
    move-result-wide v2

    .line 45
    long-to-int v2, v2

    .line 46
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    iget-object v2, p0, La01;->n:[B

    .line 53
    .line 54
    array-length v2, v2

    .line 55
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-static {}, Ltj0;->a()Z

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    const/4 v3, 0x0

    .line 63
    if-eqz v2, :cond_1

    .line 64
    .line 65
    const-string v2, "\n"

    .line 66
    .line 67
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    iget-object v2, p0, La01;->n:[B

    .line 71
    .line 72
    invoke-static {v2, v3}, Lum;->i([BZ)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_1
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    iget-object v2, p0, La01;->n:[B

    .line 84
    .line 85
    invoke-static {v2}, Lum;->y([B)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    iget v2, p0, La01;->p:I

    .line 96
    .line 97
    const/16 v4, 0x10

    .line 98
    .line 99
    if-ne v2, v4, :cond_2

    .line 100
    .line 101
    sget-object v2, Lpn0;->a:Lue0;

    .line 102
    .line 103
    const-string v2, "BADSIG"

    .line 104
    .line 105
    goto :goto_1

    .line 106
    :cond_2
    sget-object v5, Lpn0;->a:Lue0;

    .line 107
    .line 108
    invoke-virtual {v5, v2}, Lue0;->e(I)Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v2

    .line 112
    :goto_1
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    iget-object v2, p0, La01;->q:[B

    .line 119
    .line 120
    if-nez v2, :cond_3

    .line 121
    .line 122
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    goto/16 :goto_3

    .line 126
    .line 127
    :cond_3
    array-length v2, v2

    .line 128
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 129
    .line 130
    .line 131
    invoke-static {}, Ltj0;->a()Z

    .line 132
    .line 133
    .line 134
    move-result v2

    .line 135
    if-eqz v2, :cond_4

    .line 136
    .line 137
    const-string v1, "\n\n\n\t"

    .line 138
    .line 139
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 140
    .line 141
    .line 142
    goto :goto_2

    .line 143
    :cond_4
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 144
    .line 145
    .line 146
    :goto_2
    iget v1, p0, La01;->p:I

    .line 147
    .line 148
    const/16 v2, 0x12

    .line 149
    .line 150
    const-string v5, ">"

    .line 151
    .line 152
    if-ne v1, v2, :cond_6

    .line 153
    .line 154
    iget-object v1, p0, La01;->q:[B

    .line 155
    .line 156
    array-length v2, v1

    .line 157
    const/4 v6, 0x6

    .line 158
    if-eq v2, v6, :cond_5

    .line 159
    .line 160
    const-string v1, "<invalid BADTIME other data>"

    .line 161
    .line 162
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 163
    .line 164
    .line 165
    goto :goto_3

    .line 166
    :cond_5
    aget-byte v2, v1, v3

    .line 167
    .line 168
    and-int/lit16 v2, v2, 0xff

    .line 169
    .line 170
    int-to-long v2, v2

    .line 171
    const/16 v6, 0x28

    .line 172
    .line 173
    shl-long/2addr v2, v6

    .line 174
    const/4 v6, 0x1

    .line 175
    aget-byte v6, v1, v6

    .line 176
    .line 177
    and-int/lit16 v6, v6, 0xff

    .line 178
    .line 179
    int-to-long v6, v6

    .line 180
    const/16 v8, 0x20

    .line 181
    .line 182
    shl-long/2addr v6, v8

    .line 183
    add-long/2addr v2, v6

    .line 184
    const/4 v6, 0x2

    .line 185
    aget-byte v6, v1, v6

    .line 186
    .line 187
    and-int/lit16 v6, v6, 0xff

    .line 188
    .line 189
    int-to-long v6, v6

    .line 190
    const/16 v8, 0x18

    .line 191
    .line 192
    shl-long/2addr v6, v8

    .line 193
    add-long/2addr v2, v6

    .line 194
    const/4 v6, 0x3

    .line 195
    aget-byte v6, v1, v6

    .line 196
    .line 197
    and-int/lit16 v6, v6, 0xff

    .line 198
    .line 199
    shl-int/lit8 v4, v6, 0x10

    .line 200
    .line 201
    int-to-long v6, v4

    .line 202
    add-long/2addr v2, v6

    .line 203
    const/4 v4, 0x4

    .line 204
    aget-byte v4, v1, v4

    .line 205
    .line 206
    and-int/lit16 v4, v4, 0xff

    .line 207
    .line 208
    shl-int/lit8 v4, v4, 0x8

    .line 209
    .line 210
    int-to-long v6, v4

    .line 211
    add-long/2addr v2, v6

    .line 212
    const/4 v4, 0x5

    .line 213
    aget-byte v1, v1, v4

    .line 214
    .line 215
    and-int/lit16 v1, v1, 0xff

    .line 216
    .line 217
    int-to-long v6, v1

    .line 218
    add-long/2addr v2, v6

    .line 219
    const-string v1, "<server time: "

    .line 220
    .line 221
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 222
    .line 223
    .line 224
    invoke-static {v2, v3}, Ljava/time/Instant;->ofEpochSecond(J)Ljava/time/Instant;

    .line 225
    .line 226
    .line 227
    move-result-object v1

    .line 228
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 229
    .line 230
    .line 231
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 232
    .line 233
    .line 234
    goto :goto_3

    .line 235
    :cond_6
    const-string v1, "<"

    .line 236
    .line 237
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 238
    .line 239
    .line 240
    iget-object v1, p0, La01;->q:[B

    .line 241
    .line 242
    invoke-static {v1}, Lum;->y([B)Ljava/lang/String;

    .line 243
    .line 244
    .line 245
    move-result-object v1

    .line 246
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 247
    .line 248
    .line 249
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 250
    .line 251
    .line 252
    :goto_3
    invoke-static {}, Ltj0;->a()Z

    .line 253
    .line 254
    .line 255
    move-result v1

    .line 256
    if-eqz v1, :cond_7

    .line 257
    .line 258
    const-string v1, " )"

    .line 259
    .line 260
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 261
    .line 262
    .line 263
    :cond_7
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 264
    .line 265
    .line 266
    move-result-object v0

    .line 267
    return-object v0
.end method

.method public final m(Lt3;Ljh;Z)V
    .locals 3

    .line 1
    iget-object p2, p0, La01;->k:Lgg0;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-virtual {p2, p1, v0, p3}, Lgg0;->r(Lt3;Ljh;Z)V

    .line 5
    .line 6
    .line 7
    iget-object p2, p0, La01;->l:Ljava/time/Instant;

    .line 8
    .line 9
    invoke-virtual {p2}, Ljava/time/Instant;->getEpochSecond()J

    .line 10
    .line 11
    .line 12
    move-result-wide p2

    .line 13
    const/16 v0, 0x20

    .line 14
    .line 15
    shr-long v0, p2, v0

    .line 16
    .line 17
    long-to-int v0, v0

    .line 18
    const-wide v1, 0xffffffffL

    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    and-long/2addr p2, v1

    .line 24
    invoke-virtual {p1, v0}, Lt3;->m(I)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1, p2, p3}, Lt3;->o(J)V

    .line 28
    .line 29
    .line 30
    iget-object p2, p0, La01;->m:Ljava/time/Duration;

    .line 31
    .line 32
    invoke-virtual {p2}, Ljava/time/Duration;->getSeconds()J

    .line 33
    .line 34
    .line 35
    move-result-wide p2

    .line 36
    long-to-int p2, p2

    .line 37
    invoke-virtual {p1, p2}, Lt3;->m(I)V

    .line 38
    .line 39
    .line 40
    iget-object p2, p0, La01;->n:[B

    .line 41
    .line 42
    array-length p2, p2

    .line 43
    invoke-virtual {p1, p2}, Lt3;->m(I)V

    .line 44
    .line 45
    .line 46
    iget-object p2, p0, La01;->n:[B

    .line 47
    .line 48
    invoke-virtual {p1, p2}, Lt3;->j([B)V

    .line 49
    .line 50
    .line 51
    iget p2, p0, La01;->o:I

    .line 52
    .line 53
    invoke-virtual {p1, p2}, Lt3;->m(I)V

    .line 54
    .line 55
    .line 56
    iget p2, p0, La01;->p:I

    .line 57
    .line 58
    invoke-virtual {p1, p2}, Lt3;->m(I)V

    .line 59
    .line 60
    .line 61
    iget-object p2, p0, La01;->q:[B

    .line 62
    .line 63
    if-eqz p2, :cond_0

    .line 64
    .line 65
    array-length p2, p2

    .line 66
    invoke-virtual {p1, p2}, Lt3;->m(I)V

    .line 67
    .line 68
    .line 69
    iget-object p2, p0, La01;->q:[B

    .line 70
    .line 71
    invoke-virtual {p1, p2}, Lt3;->j([B)V

    .line 72
    .line 73
    .line 74
    return-void

    .line 75
    :cond_0
    const/4 p2, 0x0

    .line 76
    invoke-virtual {p1, p2}, Lt3;->m(I)V

    .line 77
    .line 78
    .line 79
    return-void
.end method
