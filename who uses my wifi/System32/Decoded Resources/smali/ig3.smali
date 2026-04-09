.class public final Lig3;
.super Lzd3;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public j:Lij3;

.field public k:[B

.field public l:I

.field public m:I


# virtual methods
.method public final a(Lij3;)J
    .locals 7

    .line 1
    invoke-virtual {p0, p1}, Lzd3;->c(Lij3;)V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lig3;->j:Lij3;

    .line 5
    .line 6
    iget-object v0, p1, Lij3;->a:Landroid/net/Uri;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/net/Uri;->normalizeScheme()Landroid/net/Uri;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    const-string v2, "data"

    .line 17
    .line 18
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    const-string v3, "Unsupported scheme: %s"

    .line 23
    .line 24
    invoke-static {v2, v3, v1}, Lzt0;->X(ZLjava/lang/String;Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0}, Landroid/net/Uri;->getSchemeSpecificPart()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    sget-object v2, Lv23;->a:Ljava/lang/String;

    .line 32
    .line 33
    const-string v2, ","

    .line 34
    .line 35
    const/4 v3, -0x1

    .line 36
    invoke-virtual {v1, v2, v3}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    array-length v2, v1

    .line 41
    const/4 v3, 0x2

    .line 42
    const/4 v4, 0x1

    .line 43
    const/4 v5, 0x0

    .line 44
    const/4 v6, 0x0

    .line 45
    if-ne v2, v3, :cond_4

    .line 46
    .line 47
    aget-object v0, v1, v4

    .line 48
    .line 49
    aget-object v1, v1, v5

    .line 50
    .line 51
    const-string v2, ";base64"

    .line 52
    .line 53
    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    if-eqz v1, :cond_0

    .line 58
    .line 59
    :try_start_0
    invoke-static {v0, v5}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    iput-object v1, p0, Lig3;->k:[B
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :catch_0
    move-exception p1

    .line 67
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    const-string v1, "Error while parsing Base64 encoded string: "

    .line 72
    .line 73
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    new-instance v1, Llq1;

    .line 78
    .line 79
    invoke-direct {v1, v0, p1, v4, v5}, Llq1;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ZI)V

    .line 80
    .line 81
    .line 82
    throw v1

    .line 83
    :cond_0
    sget-object v1, Ljava/nio/charset/StandardCharsets;->US_ASCII:Ljava/nio/charset/Charset;

    .line 84
    .line 85
    invoke-virtual {v1}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    invoke-static {v0, v1}, Ljava/net/URLDecoder;->decode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    sget-object v1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 94
    .line 95
    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    iput-object v0, p0, Lig3;->k:[B

    .line 100
    .line 101
    :goto_0
    iget-wide v0, p1, Lij3;->c:J

    .line 102
    .line 103
    iget-object v2, p0, Lig3;->k:[B

    .line 104
    .line 105
    array-length v2, v2

    .line 106
    int-to-long v3, v2

    .line 107
    cmp-long v3, v0, v3

    .line 108
    .line 109
    if-gtz v3, :cond_3

    .line 110
    .line 111
    long-to-int v0, v0

    .line 112
    iput v0, p0, Lig3;->l:I

    .line 113
    .line 114
    sub-int/2addr v2, v0

    .line 115
    iput v2, p0, Lig3;->m:I

    .line 116
    .line 117
    iget-wide v0, p1, Lij3;->d:J

    .line 118
    .line 119
    const-wide/16 v3, -0x1

    .line 120
    .line 121
    cmp-long v3, v0, v3

    .line 122
    .line 123
    if-eqz v3, :cond_1

    .line 124
    .line 125
    int-to-long v4, v2

    .line 126
    invoke-static {v4, v5, v0, v1}, Ljava/lang/Math;->min(JJ)J

    .line 127
    .line 128
    .line 129
    move-result-wide v4

    .line 130
    long-to-int v2, v4

    .line 131
    iput v2, p0, Lig3;->m:I

    .line 132
    .line 133
    :cond_1
    invoke-virtual {p0, p1}, Lzd3;->e(Lij3;)V

    .line 134
    .line 135
    .line 136
    if-eqz v3, :cond_2

    .line 137
    .line 138
    return-wide v0

    .line 139
    :cond_2
    iget p1, p0, Lig3;->m:I

    .line 140
    .line 141
    int-to-long v0, p1

    .line 142
    return-wide v0

    .line 143
    :cond_3
    iput-object v6, p0, Lig3;->k:[B

    .line 144
    .line 145
    new-instance p1, Ldi3;

    .line 146
    .line 147
    invoke-direct {p1}, Ldi3;-><init>()V

    .line 148
    .line 149
    .line 150
    throw p1

    .line 151
    :cond_4
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object p1

    .line 155
    const-string v0, "Unexpected URI format: "

    .line 156
    .line 157
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object p1

    .line 161
    new-instance v0, Llq1;

    .line 162
    .line 163
    invoke-direct {v0, p1, v6, v4, v5}, Llq1;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ZI)V

    .line 164
    .line 165
    .line 166
    throw v0
.end method

.method public final d([BII)I
    .locals 2

    .line 1
    if-nez p3, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    return p1

    .line 5
    :cond_0
    iget v0, p0, Lig3;->m:I

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    const/4 p1, -0x1

    .line 10
    return p1

    .line 11
    :cond_1
    invoke-static {p3, v0}, Ljava/lang/Math;->min(II)I

    .line 12
    .line 13
    .line 14
    move-result p3

    .line 15
    iget-object v0, p0, Lig3;->k:[B

    .line 16
    .line 17
    sget-object v1, Lv23;->a:Ljava/lang/String;

    .line 18
    .line 19
    iget v1, p0, Lig3;->l:I

    .line 20
    .line 21
    invoke-static {v0, v1, p1, p2, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 22
    .line 23
    .line 24
    iget p1, p0, Lig3;->l:I

    .line 25
    .line 26
    add-int/2addr p1, p3

    .line 27
    iput p1, p0, Lig3;->l:I

    .line 28
    .line 29
    iget p1, p0, Lig3;->m:I

    .line 30
    .line 31
    sub-int/2addr p1, p3

    .line 32
    iput p1, p0, Lig3;->m:I

    .line 33
    .line 34
    invoke-virtual {p0, p3}, Lzd3;->f(I)V

    .line 35
    .line 36
    .line 37
    return p3
.end method

.method public final h()Landroid/net/Uri;
    .locals 1

    .line 1
    iget-object v0, p0, Lig3;->j:Lij3;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, v0, Lij3;->a:Landroid/net/Uri;

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    return-object v0
.end method

.method public final l()V
    .locals 2

    .line 1
    iget-object v0, p0, Lig3;->k:[B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iput-object v1, p0, Lig3;->k:[B

    .line 7
    .line 8
    invoke-virtual {p0}, Lzd3;->j()V

    .line 9
    .line 10
    .line 11
    :cond_0
    iput-object v1, p0, Lig3;->j:Lij3;

    .line 12
    .line 13
    return-void
.end method
