.class public final Lte2;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lth3;


# instance fields
.field public final f:Landroid/content/Context;

.field public final g:Lbl3;

.field public final h:Ljava/lang/String;

.field public final i:I

.field public final j:Z

.field public k:Ljava/io/InputStream;

.field public l:Z

.field public m:Landroid/net/Uri;

.field public volatile n:Lww1;

.field public o:Z

.field public p:Z

.field public q:Lij3;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lbl3;Ljava/lang/String;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lte2;->f:Landroid/content/Context;

    .line 5
    .line 6
    iput-object p2, p0, Lte2;->g:Lbl3;

    .line 7
    .line 8
    iput-object p3, p0, Lte2;->h:Ljava/lang/String;

    .line 9
    .line 10
    iput p4, p0, Lte2;->i:I

    .line 11
    .line 12
    const/4 p1, 0x0

    .line 13
    iput-boolean p1, p0, Lte2;->o:Z

    .line 14
    .line 15
    iput-boolean p1, p0, Lte2;->p:Z

    .line 16
    .line 17
    new-instance p1, Ljava/util/concurrent/atomic/AtomicLong;

    .line 18
    .line 19
    const-wide/16 p2, -0x1

    .line 20
    .line 21
    invoke-direct {p1, p2, p3}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    .line 22
    .line 23
    .line 24
    sget-object p1, Lmz1;->Y1:Liz1;

    .line 25
    .line 26
    sget-object p2, Ltw1;->e:Ltw1;

    .line 27
    .line 28
    iget-object p2, p2, Ltw1;->c:Lkz1;

    .line 29
    .line 30
    invoke-virtual {p2, p1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

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
    iput-boolean p1, p0, Lte2;->j:Z

    .line 41
    .line 42
    return-void
.end method


# virtual methods
.method public final a(Lij3;)J
    .locals 9

    .line 1
    iget-boolean v0, p0, Lte2;->l:Z

    .line 2
    .line 3
    if-nez v0, :cond_8

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Lte2;->l:Z

    .line 7
    .line 8
    iget-object v0, p1, Lij3;->a:Landroid/net/Uri;

    .line 9
    .line 10
    iput-object v0, p0, Lte2;->m:Landroid/net/Uri;

    .line 11
    .line 12
    iput-object p1, p0, Lte2;->q:Lij3;

    .line 13
    .line 14
    invoke-static {v0}, Lww1;->a(Landroid/net/Uri;)Lww1;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iput-object v0, p0, Lte2;->n:Lww1;

    .line 19
    .line 20
    sget-object v0, Lmz1;->J4:Liz1;

    .line 21
    .line 22
    sget-object v1, Ltw1;->e:Ltw1;

    .line 23
    .line 24
    iget-object v2, v1, Ltw1;->c:Lkz1;

    .line 25
    .line 26
    invoke-virtual {v2, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    check-cast v0, Ljava/lang/Boolean;

    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    const/4 v2, 0x0

    .line 37
    const-string v3, ""

    .line 38
    .line 39
    if-eqz v0, :cond_3

    .line 40
    .line 41
    iget-object v0, p0, Lte2;->n:Lww1;

    .line 42
    .line 43
    if-eqz v0, :cond_6

    .line 44
    .line 45
    iget-object v0, p0, Lte2;->n:Lww1;

    .line 46
    .line 47
    iget-wide v4, p1, Lij3;->c:J

    .line 48
    .line 49
    iput-wide v4, v0, Lww1;->m:J

    .line 50
    .line 51
    iget-object p1, p0, Lte2;->n:Lww1;

    .line 52
    .line 53
    iget-object v0, p0, Lte2;->h:Ljava/lang/String;

    .line 54
    .line 55
    if-nez v0, :cond_0

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_0
    move-object v3, v0

    .line 59
    :goto_0
    iput-object v3, p1, Lww1;->n:Ljava/lang/String;

    .line 60
    .line 61
    iget-object p1, p0, Lte2;->n:Lww1;

    .line 62
    .line 63
    iget v0, p0, Lte2;->i:I

    .line 64
    .line 65
    iput v0, p1, Lww1;->o:I

    .line 66
    .line 67
    iget-object p1, p0, Lte2;->n:Lww1;

    .line 68
    .line 69
    iget-boolean p1, p1, Lww1;->l:Z

    .line 70
    .line 71
    if-eqz p1, :cond_1

    .line 72
    .line 73
    sget-object p1, Lmz1;->L4:Liz1;

    .line 74
    .line 75
    iget-object v0, v1, Ltw1;->c:Lkz1;

    .line 76
    .line 77
    invoke-virtual {v0, p1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    check-cast p1, Ljava/lang/Long;

    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_1
    sget-object p1, Lmz1;->K4:Liz1;

    .line 85
    .line 86
    iget-object v0, v1, Ltw1;->c:Lkz1;

    .line 87
    .line 88
    invoke-virtual {v0, p1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    check-cast p1, Ljava/lang/Long;

    .line 93
    .line 94
    :goto_1
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 95
    .line 96
    .line 97
    move-result-wide v0

    .line 98
    sget-object p1, Lhg4;->C:Lhg4;

    .line 99
    .line 100
    iget-object p1, p1, Lhg4;->k:Lym;

    .line 101
    .line 102
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 103
    .line 104
    .line 105
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 106
    .line 107
    .line 108
    iget-object p1, p0, Lte2;->f:Landroid/content/Context;

    .line 109
    .line 110
    iget-object v3, p0, Lte2;->n:Lww1;

    .line 111
    .line 112
    invoke-static {p1, v3}, Lus0;->n(Landroid/content/Context;Lww1;)Lyw1;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    const/4 v3, 0x0

    .line 117
    :try_start_0
    sget-object v4, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 118
    .line 119
    iget-object v5, p1, Lpd2;->f:Lwq3;

    .line 120
    .line 121
    invoke-virtual {v5, v0, v1, v4}, Lgp3;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    check-cast v0, Lax1;

    .line 126
    .line 127
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 128
    .line 129
    .line 130
    iget-boolean v1, v0, Lax1;->c:Z

    .line 131
    .line 132
    iput-boolean v1, p0, Lte2;->o:Z

    .line 133
    .line 134
    iget-boolean v1, v0, Lax1;->e:Z

    .line 135
    .line 136
    iput-boolean v1, p0, Lte2;->p:Z

    .line 137
    .line 138
    invoke-virtual {p0}, Lte2;->c()Z

    .line 139
    .line 140
    .line 141
    move-result v1

    .line 142
    if-nez v1, :cond_2

    .line 143
    .line 144
    iget-object v0, v0, Lax1;->a:Lzw1;

    .line 145
    .line 146
    iput-object v0, p0, Lte2;->k:Ljava/io/InputStream;
    :try_end_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 147
    .line 148
    goto :goto_2

    .line 149
    :catch_0
    :try_start_1
    invoke-virtual {p1, v3}, Lyw1;->cancel(Z)Z

    .line 150
    .line 151
    .line 152
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 153
    .line 154
    .line 155
    move-result-object p1

    .line 156
    invoke-virtual {p1}, Ljava/lang/Thread;->interrupt()V

    .line 157
    .line 158
    .line 159
    goto :goto_2

    .line 160
    :catch_1
    invoke-virtual {p1, v3}, Lyw1;->cancel(Z)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 161
    .line 162
    .line 163
    :catchall_0
    :cond_2
    :goto_2
    sget-object p1, Lhg4;->C:Lhg4;

    .line 164
    .line 165
    iget-object p1, p1, Lhg4;->k:Lym;

    .line 166
    .line 167
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 168
    .line 169
    .line 170
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 171
    .line 172
    .line 173
    throw v2

    .line 174
    :cond_3
    iget-object v0, p0, Lte2;->n:Lww1;

    .line 175
    .line 176
    if-eqz v0, :cond_5

    .line 177
    .line 178
    iget-object v0, p0, Lte2;->n:Lww1;

    .line 179
    .line 180
    iget-wide v1, p1, Lij3;->c:J

    .line 181
    .line 182
    iput-wide v1, v0, Lww1;->m:J

    .line 183
    .line 184
    iget-object v0, p0, Lte2;->n:Lww1;

    .line 185
    .line 186
    iget-object v1, p0, Lte2;->h:Ljava/lang/String;

    .line 187
    .line 188
    if-nez v1, :cond_4

    .line 189
    .line 190
    goto :goto_3

    .line 191
    :cond_4
    move-object v3, v1

    .line 192
    :goto_3
    iput-object v3, v0, Lww1;->n:Ljava/lang/String;

    .line 193
    .line 194
    iget-object v0, p0, Lte2;->n:Lww1;

    .line 195
    .line 196
    iget v1, p0, Lte2;->i:I

    .line 197
    .line 198
    iput v1, v0, Lww1;->o:I

    .line 199
    .line 200
    sget-object v0, Lhg4;->C:Lhg4;

    .line 201
    .line 202
    iget-object v0, v0, Lhg4;->j:Lbu1;

    .line 203
    .line 204
    iget-object v1, p0, Lte2;->n:Lww1;

    .line 205
    .line 206
    invoke-virtual {v0, v1}, Lbu1;->t(Lww1;)Luw1;

    .line 207
    .line 208
    .line 209
    move-result-object v2

    .line 210
    :cond_5
    if-eqz v2, :cond_6

    .line 211
    .line 212
    invoke-virtual {v2}, Luw1;->a()Z

    .line 213
    .line 214
    .line 215
    move-result v0

    .line 216
    if-eqz v0, :cond_6

    .line 217
    .line 218
    invoke-virtual {v2}, Luw1;->d()Z

    .line 219
    .line 220
    .line 221
    move-result v0

    .line 222
    iput-boolean v0, p0, Lte2;->o:Z

    .line 223
    .line 224
    invoke-virtual {v2}, Luw1;->c()Z

    .line 225
    .line 226
    .line 227
    move-result v0

    .line 228
    iput-boolean v0, p0, Lte2;->p:Z

    .line 229
    .line 230
    invoke-virtual {p0}, Lte2;->c()Z

    .line 231
    .line 232
    .line 233
    move-result v0

    .line 234
    if-nez v0, :cond_6

    .line 235
    .line 236
    invoke-virtual {v2}, Luw1;->b()Landroid/os/ParcelFileDescriptor$AutoCloseInputStream;

    .line 237
    .line 238
    .line 239
    move-result-object p1

    .line 240
    iput-object p1, p0, Lte2;->k:Ljava/io/InputStream;

    .line 241
    .line 242
    const-wide/16 v0, -0x1

    .line 243
    .line 244
    return-wide v0

    .line 245
    :cond_6
    iget-object v0, p0, Lte2;->n:Lww1;

    .line 246
    .line 247
    if-eqz v0, :cond_7

    .line 248
    .line 249
    iget-object v3, p1, Lij3;->b:Ljava/util/Map;

    .line 250
    .line 251
    iget-wide v4, p1, Lij3;->c:J

    .line 252
    .line 253
    iget-wide v6, p1, Lij3;->d:J

    .line 254
    .line 255
    iget v8, p1, Lij3;->e:I

    .line 256
    .line 257
    iget-object p1, p0, Lte2;->n:Lww1;

    .line 258
    .line 259
    iget-object p1, p1, Lww1;->f:Ljava/lang/String;

    .line 260
    .line 261
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 262
    .line 263
    .line 264
    move-result-object v2

    .line 265
    const-string p1, "The uri must be set."

    .line 266
    .line 267
    invoke-static {v2, p1}, Lzt0;->d0(Ljava/lang/Object;Ljava/lang/String;)V

    .line 268
    .line 269
    .line 270
    new-instance v1, Lij3;

    .line 271
    .line 272
    invoke-direct/range {v1 .. v8}, Lij3;-><init>(Landroid/net/Uri;Ljava/util/Map;JJI)V

    .line 273
    .line 274
    .line 275
    iput-object v1, p0, Lte2;->q:Lij3;

    .line 276
    .line 277
    :cond_7
    iget-object p1, p0, Lte2;->g:Lbl3;

    .line 278
    .line 279
    iget-object v0, p0, Lte2;->q:Lij3;

    .line 280
    .line 281
    invoke-virtual {p1, v0}, Lbl3;->a(Lij3;)J

    .line 282
    .line 283
    .line 284
    move-result-wide v0

    .line 285
    return-wide v0

    .line 286
    :cond_8
    new-instance p1, Ljava/io/IOException;

    .line 287
    .line 288
    const-string v0, "Attempt to open an already open CacheDataSource."

    .line 289
    .line 290
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 291
    .line 292
    .line 293
    throw p1
.end method

.method public final b(Lws3;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final c()Z
    .locals 3

    .line 1
    iget-boolean v0, p0, Lte2;->j:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    sget-object v0, Lmz1;->M4:Liz1;

    .line 7
    .line 8
    sget-object v1, Ltw1;->e:Ltw1;

    .line 9
    .line 10
    iget-object v2, v1, Ltw1;->c:Lkz1;

    .line 11
    .line 12
    invoke-virtual {v2, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    check-cast v0, Ljava/lang/Boolean;

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    iget-boolean v0, p0, Lte2;->o:Z

    .line 25
    .line 26
    if-eqz v0, :cond_2

    .line 27
    .line 28
    :cond_1
    sget-object v0, Lmz1;->N4:Liz1;

    .line 29
    .line 30
    iget-object v1, v1, Ltw1;->c:Lkz1;

    .line 31
    .line 32
    invoke-virtual {v1, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    check-cast v0, Ljava/lang/Boolean;

    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-eqz v0, :cond_3

    .line 43
    .line 44
    iget-boolean v0, p0, Lte2;->p:Z

    .line 45
    .line 46
    if-nez v0, :cond_3

    .line 47
    .line 48
    :cond_2
    const/4 v0, 0x1

    .line 49
    return v0

    .line 50
    :cond_3
    :goto_0
    const/4 v0, 0x0

    .line 51
    return v0
.end method

.method public final d([BII)I
    .locals 1

    .line 1
    iget-boolean v0, p0, Lte2;->l:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lte2;->k:Ljava/io/InputStream;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0, p1, p2, p3}, Ljava/io/InputStream;->read([BII)I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    return p1

    .line 14
    :cond_0
    iget-object v0, p0, Lte2;->g:Lbl3;

    .line 15
    .line 16
    invoke-virtual {v0, p1, p2, p3}, Lbl3;->d([BII)I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    return p1

    .line 21
    :cond_1
    new-instance p1, Ljava/io/IOException;

    .line 22
    .line 23
    const-string p2, "Attempt to read closed CacheDataSource."

    .line 24
    .line 25
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    throw p1
.end method

.method public final h()Landroid/net/Uri;
    .locals 1

    .line 1
    iget-object v0, p0, Lte2;->m:Landroid/net/Uri;

    .line 2
    .line 3
    return-object v0
.end method

.method public final l()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lte2;->l:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    iput-boolean v0, p0, Lte2;->l:Z

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, Lte2;->m:Landroid/net/Uri;

    .line 10
    .line 11
    iget-object v1, p0, Lte2;->k:Ljava/io/InputStream;

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    invoke-static {v1}, Lg82;->c(Ljava/io/Closeable;)V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Lte2;->k:Ljava/io/InputStream;

    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    iget-object v0, p0, Lte2;->g:Lbl3;

    .line 22
    .line 23
    invoke-virtual {v0}, Lbl3;->l()V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_1
    new-instance v0, Ljava/io/IOException;

    .line 28
    .line 29
    const-string v1, "Attempt to close an already closed CacheDataSource."

    .line 30
    .line 31
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    throw v0
.end method
