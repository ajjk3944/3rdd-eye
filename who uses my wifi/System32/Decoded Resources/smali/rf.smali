.class public final Lrf;
.super Lcr;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public g:I

.field public h:I

.field public i:I

.field public j:Ljava/net/InetAddress;


# virtual methods
.method public final a(Lcm;)V
    .locals 7

    .line 1
    invoke-virtual {p1}, Lcm;->f()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iput v0, p0, Lrf;->g:I

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    if-eq v0, v1, :cond_1

    .line 9
    .line 10
    const/4 v2, 0x2

    .line 11
    if-ne v0, v2, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    new-instance p1, Lt91;

    .line 15
    .line 16
    const-string v0, "unknown address family"

    .line 17
    .line 18
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    throw p1

    .line 22
    :cond_1
    :goto_0
    invoke-virtual {p1}, Lcm;->i()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    iput v0, p0, Lrf;->h:I

    .line 27
    .line 28
    iget v2, p0, Lrf;->g:I

    .line 29
    .line 30
    invoke-static {v2}, La30;->a(I)I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    mul-int/lit8 v2, v2, 0x8

    .line 35
    .line 36
    if-gt v0, v2, :cond_9

    .line 37
    .line 38
    invoke-virtual {p1}, Lcm;->i()I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    iput v0, p0, Lrf;->i:I

    .line 43
    .line 44
    iget v2, p0, Lrf;->g:I

    .line 45
    .line 46
    invoke-static {v2}, La30;->a(I)I

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    mul-int/lit8 v2, v2, 0x8

    .line 51
    .line 52
    if-gt v0, v2, :cond_8

    .line 53
    .line 54
    invoke-virtual {p1}, Lcm;->b()[B

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    array-length v0, p1

    .line 59
    iget v2, p0, Lrf;->h:I

    .line 60
    .line 61
    add-int/lit8 v2, v2, 0x7

    .line 62
    .line 63
    div-int/lit8 v2, v2, 0x8

    .line 64
    .line 65
    const-string v3, "invalid address"

    .line 66
    .line 67
    if-ne v0, v2, :cond_7

    .line 68
    .line 69
    iget v0, p0, Lrf;->g:I

    .line 70
    .line 71
    invoke-static {v0}, La30;->a(I)I

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    new-array v0, v0, [B

    .line 76
    .line 77
    array-length v2, p1

    .line 78
    const/4 v4, 0x0

    .line 79
    invoke-static {p1, v4, v0, v4, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 80
    .line 81
    .line 82
    :try_start_0
    invoke-static {v0}, Ljava/net/InetAddress;->getByAddress([B)Ljava/net/InetAddress;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    iput-object p1, p0, Lrf;->j:Ljava/net/InetAddress;
    :try_end_0
    .catch Ljava/net/UnknownHostException; {:try_start_0 .. :try_end_0} :catch_1

    .line 87
    .line 88
    iget v0, p0, Lrf;->h:I

    .line 89
    .line 90
    invoke-static {p1}, La30;->d(Ljava/net/InetAddress;)I

    .line 91
    .line 92
    .line 93
    move-result v2

    .line 94
    invoke-static {v2}, La30;->a(I)I

    .line 95
    .line 96
    .line 97
    move-result v2

    .line 98
    mul-int/lit8 v2, v2, 0x8

    .line 99
    .line 100
    if-ltz v0, :cond_6

    .line 101
    .line 102
    if-gt v0, v2, :cond_6

    .line 103
    .line 104
    if-ne v0, v2, :cond_2

    .line 105
    .line 106
    goto :goto_3

    .line 107
    :cond_2
    invoke-virtual {p1}, Ljava/net/InetAddress;->getAddress()[B

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    div-int/lit8 v2, v0, 0x8

    .line 112
    .line 113
    add-int/lit8 v5, v2, 0x1

    .line 114
    .line 115
    :goto_1
    array-length v6, p1

    .line 116
    if-ge v5, v6, :cond_3

    .line 117
    .line 118
    aput-byte v4, p1, v5

    .line 119
    .line 120
    add-int/lit8 v5, v5, 0x1

    .line 121
    .line 122
    goto :goto_1

    .line 123
    :cond_3
    rem-int/lit8 v0, v0, 0x8

    .line 124
    .line 125
    move v5, v4

    .line 126
    :goto_2
    if-ge v4, v0, :cond_4

    .line 127
    .line 128
    rsub-int/lit8 v6, v4, 0x7

    .line 129
    .line 130
    shl-int v6, v1, v6

    .line 131
    .line 132
    or-int/2addr v5, v6

    .line 133
    add-int/lit8 v4, v4, 0x1

    .line 134
    .line 135
    goto :goto_2

    .line 136
    :cond_4
    aget-byte v0, p1, v2

    .line 137
    .line 138
    int-to-byte v1, v5

    .line 139
    and-int/2addr v0, v1

    .line 140
    int-to-byte v0, v0

    .line 141
    aput-byte v0, p1, v2

    .line 142
    .line 143
    :try_start_1
    invoke-static {p1}, Ljava/net/InetAddress;->getByAddress([B)Ljava/net/InetAddress;

    .line 144
    .line 145
    .line 146
    move-result-object p1
    :try_end_1
    .catch Ljava/net/UnknownHostException; {:try_start_1 .. :try_end_1} :catch_0

    .line 147
    :goto_3
    iget-object v0, p0, Lrf;->j:Ljava/net/InetAddress;

    .line 148
    .line 149
    invoke-virtual {p1, v0}, Ljava/net/InetAddress;->equals(Ljava/lang/Object;)Z

    .line 150
    .line 151
    .line 152
    move-result p1

    .line 153
    if-eqz p1, :cond_5

    .line 154
    .line 155
    return-void

    .line 156
    :cond_5
    new-instance p1, Lt91;

    .line 157
    .line 158
    const-string v0, "invalid padding"

    .line 159
    .line 160
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    throw p1

    .line 164
    :catch_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 165
    .line 166
    invoke-direct {p1, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    throw p1

    .line 170
    :cond_6
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 171
    .line 172
    const-string v0, "invalid mask length"

    .line 173
    .line 174
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 175
    .line 176
    .line 177
    throw p1

    .line 178
    :catch_1
    move-exception p1

    .line 179
    new-instance v0, Lt91;

    .line 180
    .line 181
    invoke-direct {v0, v3, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 182
    .line 183
    .line 184
    throw v0

    .line 185
    :cond_7
    new-instance p1, Lt91;

    .line 186
    .line 187
    invoke-direct {p1, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 188
    .line 189
    .line 190
    throw p1

    .line 191
    :cond_8
    new-instance p1, Lt91;

    .line 192
    .line 193
    const-string v0, "invalid scope netmask"

    .line 194
    .line 195
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 196
    .line 197
    .line 198
    throw p1

    .line 199
    :cond_9
    new-instance p1, Lt91;

    .line 200
    .line 201
    const-string v0, "invalid source netmask"

    .line 202
    .line 203
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 204
    .line 205
    .line 206
    throw p1
.end method

.method public final b()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lrf;->j:Ljava/net/InetAddress;

    .line 7
    .line 8
    invoke-virtual {v1}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    const-string v1, "/"

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    iget v1, p0, Lrf;->h:I

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const-string v1, ", scope netmask "

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    iget v1, p0, Lrf;->i:I

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    return-object v0
.end method

.method public final c(Lt3;)V
    .locals 3

    .line 1
    iget v0, p0, Lrf;->g:I

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Lt3;->m(I)V

    .line 4
    .line 5
    .line 6
    iget v0, p0, Lrf;->h:I

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Lt3;->q(I)V

    .line 9
    .line 10
    .line 11
    iget v0, p0, Lrf;->i:I

    .line 12
    .line 13
    invoke-virtual {p1, v0}, Lt3;->q(I)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lrf;->j:Ljava/net/InetAddress;

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/net/InetAddress;->getAddress()[B

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iget v1, p0, Lrf;->h:I

    .line 23
    .line 24
    add-int/lit8 v1, v1, 0x7

    .line 25
    .line 26
    div-int/lit8 v1, v1, 0x8

    .line 27
    .line 28
    const/4 v2, 0x0

    .line 29
    invoke-virtual {p1, v0, v2, v1}, Lt3;->k([BII)V

    .line 30
    .line 31
    .line 32
    return-void
.end method
