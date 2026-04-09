.class public final Lme3;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ljava/io/Closeable;


# instance fields
.field public f:Lll3;

.field public g:Lls3;

.field public h:Ljava/net/HttpURLConnection;


# virtual methods
.method public final a(Lls3;)Ljava/net/HttpURLConnection;
    .locals 7

    .line 1
    new-instance v0, Lsu2;

    .line 2
    .line 3
    const/16 v1, 0xb

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lsu2;-><init>(I)V

    .line 6
    .line 7
    .line 8
    iput-object v0, p0, Lme3;->f:Lll3;

    .line 9
    .line 10
    iput-object p1, p0, Lme3;->g:Lls3;

    .line 11
    .line 12
    iget-object p1, p0, Lme3;->f:Lll3;

    .line 13
    .line 14
    invoke-interface {p1}, Lll3;->a()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    check-cast p1, Ljava/lang/Integer;

    .line 19
    .line 20
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    iget-object p1, p0, Lme3;->g:Lls3;

    .line 24
    .line 25
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    sget-object v0, Lgf2;->k:Ljava/util/Set;

    .line 29
    .line 30
    sget-object v0, Lhg4;->C:Lhg4;

    .line 31
    .line 32
    iget-object v0, v0, Lhg4;->q:Lqd2;

    .line 33
    .line 34
    sget-object v0, Lmz1;->L:Liz1;

    .line 35
    .line 36
    sget-object v1, Ltw1;->e:Ltw1;

    .line 37
    .line 38
    iget-object v1, v1, Ltw1;->c:Lkz1;

    .line 39
    .line 40
    invoke-virtual {v1, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    check-cast v0, Ljava/lang/Integer;

    .line 45
    .line 46
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    new-instance v1, Ljava/net/URL;

    .line 51
    .line 52
    iget-object p1, p1, Lls3;->b:Ljava/lang/String;

    .line 53
    .line 54
    invoke-direct {v1, p1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    const/4 p1, 0x0

    .line 58
    move v2, p1

    .line 59
    :goto_0
    add-int/lit8 v2, v2, 0x1

    .line 60
    .line 61
    const/16 v3, 0x14

    .line 62
    .line 63
    if-gt v2, v3, :cond_6

    .line 64
    .line 65
    invoke-virtual {v1}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    invoke-virtual {v3, v0}, Ljava/net/URLConnection;->setConnectTimeout(I)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v3, v0}, Ljava/net/URLConnection;->setReadTimeout(I)V

    .line 73
    .line 74
    .line 75
    instance-of v4, v3, Ljava/net/HttpURLConnection;

    .line 76
    .line 77
    if-eqz v4, :cond_5

    .line 78
    .line 79
    check-cast v3, Ljava/net/HttpURLConnection;

    .line 80
    .line 81
    new-instance v4, Lwb4;

    .line 82
    .line 83
    invoke-direct {v4}, Lwb4;-><init>()V

    .line 84
    .line 85
    .line 86
    const/4 v5, 0x0

    .line 87
    invoke-virtual {v4, v3, v5}, Lwb4;->a(Ljava/net/HttpURLConnection;[B)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v3, p1}, Ljava/net/HttpURLConnection;->setInstanceFollowRedirects(Z)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v3}, Ljava/net/HttpURLConnection;->getResponseCode()I

    .line 94
    .line 95
    .line 96
    move-result v5

    .line 97
    invoke-virtual {v4, v3, v5}, Lwb4;->b(Ljava/net/HttpURLConnection;I)V

    .line 98
    .line 99
    .line 100
    div-int/lit8 v5, v5, 0x64

    .line 101
    .line 102
    const/4 v4, 0x3

    .line 103
    if-ne v5, v4, :cond_4

    .line 104
    .line 105
    const-string v4, "Location"

    .line 106
    .line 107
    invoke-virtual {v3, v4}, Ljava/net/URLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v4

    .line 111
    if-eqz v4, :cond_3

    .line 112
    .line 113
    new-instance v5, Ljava/net/URL;

    .line 114
    .line 115
    invoke-direct {v5, v1, v4}, Ljava/net/URL;-><init>(Ljava/net/URL;Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v5}, Ljava/net/URL;->getProtocol()Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    if-eqz v1, :cond_2

    .line 123
    .line 124
    const-string v6, "http"

    .line 125
    .line 126
    invoke-virtual {v1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    move-result v6

    .line 130
    if-nez v6, :cond_1

    .line 131
    .line 132
    const-string v6, "https"

    .line 133
    .line 134
    invoke-virtual {v1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    move-result v6

    .line 138
    if-eqz v6, :cond_0

    .line 139
    .line 140
    goto :goto_1

    .line 141
    :cond_0
    const-string p1, "Unsupported scheme: "

    .line 142
    .line 143
    invoke-virtual {p1, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object p1

    .line 147
    new-instance v0, Ljava/io/IOException;

    .line 148
    .line 149
    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    throw v0

    .line 153
    :cond_1
    :goto_1
    const-string v1, "Redirecting to "

    .line 154
    .line 155
    invoke-virtual {v1, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v1

    .line 159
    invoke-static {v1}, Lgi2;->U(Ljava/lang/String;)V

    .line 160
    .line 161
    .line 162
    invoke-virtual {v3}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 163
    .line 164
    .line 165
    move-object v1, v5

    .line 166
    goto :goto_0

    .line 167
    :cond_2
    new-instance p1, Ljava/io/IOException;

    .line 168
    .line 169
    const-string v0, "Protocol is null"

    .line 170
    .line 171
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 172
    .line 173
    .line 174
    throw p1

    .line 175
    :cond_3
    new-instance p1, Ljava/io/IOException;

    .line 176
    .line 177
    const-string v0, "Missing Location header in redirect"

    .line 178
    .line 179
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    throw p1

    .line 183
    :cond_4
    iput-object v3, p0, Lme3;->h:Ljava/net/HttpURLConnection;

    .line 184
    .line 185
    return-object v3

    .line 186
    :cond_5
    new-instance p1, Ljava/io/IOException;

    .line 187
    .line 188
    const-string v0, "Invalid protocol."

    .line 189
    .line 190
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 191
    .line 192
    .line 193
    throw p1

    .line 194
    :cond_6
    new-instance p1, Ljava/io/IOException;

    .line 195
    .line 196
    const-string v0, "Too many redirects (20)"

    .line 197
    .line 198
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 199
    .line 200
    .line 201
    throw p1
.end method

.method public final close()V
    .locals 1

    .line 1
    iget-object v0, p0, Lme3;->h:Ljava/net/HttpURLConnection;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method
