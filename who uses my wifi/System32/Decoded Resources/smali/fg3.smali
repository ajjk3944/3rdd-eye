.class public final synthetic Lfg3;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic f:I

.field public final synthetic g:Z

.field public final synthetic h:Ljava/lang/Object;

.field public final synthetic i:Ljava/lang/Object;

.field public final synthetic j:Ljava/lang/Object;

.field public final synthetic k:Ljava/lang/Object;

.field public final synthetic l:Ljava/io/Serializable;


# direct methods
.method public synthetic constructor <init>(Lhg3;Ljava/lang/String;Lyc;ZLjava/lang/String;[B)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lfg3;->f:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfg3;->h:Ljava/lang/Object;

    iput-object p2, p0, Lfg3;->i:Ljava/lang/Object;

    iput-object p3, p0, Lfg3;->k:Ljava/lang/Object;

    iput-boolean p4, p0, Lfg3;->g:Z

    iput-object p5, p0, Lfg3;->j:Ljava/lang/Object;

    iput-object p6, p0, Lfg3;->l:Ljava/io/Serializable;

    return-void
.end method

.method public synthetic constructor <init>(Lvb4;Landroid/util/Pair;Lch4;Lhh4;Ljava/io/IOException;Z)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lfg3;->f:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfg3;->h:Ljava/lang/Object;

    iput-object p2, p0, Lfg3;->i:Ljava/lang/Object;

    iput-object p3, p0, Lfg3;->j:Ljava/lang/Object;

    iput-object p4, p0, Lfg3;->k:Ljava/lang/Object;

    iput-object p5, p0, Lfg3;->l:Ljava/io/Serializable;

    iput-boolean p6, p0, Lfg3;->g:Z

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 10

    .line 1
    iget v0, p0, Lfg3;->f:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lfg3;->i:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Landroid/util/Pair;

    .line 9
    .line 10
    iget-object v1, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Ljava/lang/Integer;

    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 15
    .line 16
    .line 17
    move-result v3

    .line 18
    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 19
    .line 20
    move-object v4, v0

    .line 21
    check-cast v4, Lkh4;

    .line 22
    .line 23
    iget-object v0, p0, Lfg3;->h:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v0, Lvb4;

    .line 26
    .line 27
    iget-object v0, v0, Lvb4;->g:Luu0;

    .line 28
    .line 29
    iget-object v0, v0, Luu0;->n:Ljava/lang/Object;

    .line 30
    .line 31
    move-object v2, v0

    .line 32
    check-cast v2, Lmd4;

    .line 33
    .line 34
    iget-object v0, p0, Lfg3;->j:Ljava/lang/Object;

    .line 35
    .line 36
    move-object v5, v0

    .line 37
    check-cast v5, Lch4;

    .line 38
    .line 39
    iget-object v0, p0, Lfg3;->k:Ljava/lang/Object;

    .line 40
    .line 41
    move-object v6, v0

    .line 42
    check-cast v6, Lhh4;

    .line 43
    .line 44
    iget-object v0, p0, Lfg3;->l:Ljava/io/Serializable;

    .line 45
    .line 46
    move-object v7, v0

    .line 47
    check-cast v7, Ljava/io/IOException;

    .line 48
    .line 49
    iget-boolean v8, p0, Lfg3;->g:Z

    .line 50
    .line 51
    invoke-virtual/range {v2 .. v8}, Lmd4;->o(ILkh4;Lch4;Lhh4;Ljava/io/IOException;Z)V

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :pswitch_0
    iget-object v0, p0, Lfg3;->h:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v0, Lhg3;

    .line 58
    .line 59
    iget-object v1, p0, Lfg3;->i:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v1, Ljava/lang/String;

    .line 62
    .line 63
    iget-object v2, p0, Lfg3;->k:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v2, Lyc;

    .line 66
    .line 67
    iget-object v3, p0, Lfg3;->j:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v3, Ljava/lang/String;

    .line 70
    .line 71
    iget-object v4, p0, Lfg3;->l:Ljava/io/Serializable;

    .line 72
    .line 73
    check-cast v4, [B

    .line 74
    .line 75
    const-string v5, "Timeout: "

    .line 76
    .line 77
    const/4 v6, 0x0

    .line 78
    :try_start_0
    invoke-static {v1}, Ljava/net/URI;->create(Ljava/lang/String;)Ljava/net/URI;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    invoke-virtual {v1}, Ljava/net/URI;->toURL()Ljava/net/URL;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    invoke-virtual {v1}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    check-cast v1, Ljava/net/HttpURLConnection;
    :try_end_0
    .catch Ljava/net/SocketTimeoutException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_7

    .line 91
    .line 92
    :try_start_1
    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    new-instance v6, Lbs2;

    .line 96
    .line 97
    const/16 v7, 0x1d

    .line 98
    .line 99
    invoke-direct {v6, v7, v1}, Lbs2;-><init>(ILjava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    iget-object v7, v0, Lhg3;->a:Ljava/util/concurrent/ExecutorService;

    .line 103
    .line 104
    iget-object v8, v2, Lyc;->c:Lup0;

    .line 105
    .line 106
    if-eqz v8, :cond_0

    .line 107
    .line 108
    invoke-virtual {v8, v6, v7}, Lk0;->c(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 109
    .line 110
    .line 111
    :cond_0
    const-string v6, "User-Agent"

    .line 112
    .line 113
    iget-object v7, v0, Lhg3;->b:Ljava/lang/String;

    .line 114
    .line 115
    invoke-virtual {v1, v6, v7}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    iget-wide v6, v0, Lhg3;->c:J

    .line 119
    .line 120
    long-to-int v0, v6

    .line 121
    invoke-virtual {v1, v0}, Ljava/net/URLConnection;->setConnectTimeout(I)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {v1, v0}, Ljava/net/URLConnection;->setReadTimeout(I)V
    :try_end_1
    .catch Ljava/net/SocketTimeoutException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 125
    .line 126
    .line 127
    iget-boolean v0, p0, Lfg3;->g:Z

    .line 128
    .line 129
    if-eqz v0, :cond_2

    .line 130
    .line 131
    const/4 v0, 0x1

    .line 132
    :try_start_2
    invoke-virtual {v1, v0}, Ljava/net/URLConnection;->setDoOutput(Z)V

    .line 133
    .line 134
    .line 135
    const-string v0, "POST"

    .line 136
    .line 137
    invoke-virtual {v1, v0}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    if-eqz v3, :cond_1

    .line 141
    .line 142
    const-string v0, "Content-Type"

    .line 143
    .line 144
    invoke-virtual {v1, v0, v3}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    goto :goto_0

    .line 148
    :catchall_0
    move-exception v0

    .line 149
    goto/16 :goto_a

    .line 150
    .line 151
    :catch_0
    move-exception v0

    .line 152
    goto/16 :goto_b

    .line 153
    .line 154
    :cond_1
    :goto_0
    new-instance v3, Ljava/io/BufferedOutputStream;

    .line 155
    .line 156
    invoke-virtual {v1}, Ljava/net/URLConnection;->getOutputStream()Ljava/io/OutputStream;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    invoke-direct {v3, v0}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;)V
    :try_end_2
    .catch Ljava/net/SocketTimeoutException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 161
    .line 162
    .line 163
    :try_start_3
    invoke-virtual {v3, v4}, Ljava/io/OutputStream;->write([B)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 164
    .line 165
    .line 166
    :try_start_4
    invoke-virtual {v3}, Ljava/io/OutputStream;->close()V
    :try_end_4
    .catch Ljava/net/SocketTimeoutException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 167
    .line 168
    .line 169
    goto :goto_2

    .line 170
    :catchall_1
    move-exception v0

    .line 171
    move-object v4, v0

    .line 172
    :try_start_5
    invoke-virtual {v3}, Ljava/io/OutputStream;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 173
    .line 174
    .line 175
    goto :goto_1

    .line 176
    :catchall_2
    move-exception v0

    .line 177
    :try_start_6
    invoke-virtual {v4, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 178
    .line 179
    .line 180
    :goto_1
    throw v4

    .line 181
    :cond_2
    :goto_2
    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->getResponseCode()I

    .line 182
    .line 183
    .line 184
    move-result v0

    .line 185
    const/16 v3, 0x190

    .line 186
    .line 187
    if-ge v0, v3, :cond_3

    .line 188
    .line 189
    invoke-virtual {v1}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    .line 190
    .line 191
    .line 192
    move-result-object v3

    .line 193
    goto :goto_3

    .line 194
    :cond_3
    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->getErrorStream()Ljava/io/InputStream;

    .line 195
    .line 196
    .line 197
    move-result-object v3
    :try_end_6
    .catch Ljava/net/SocketTimeoutException; {:try_start_6 .. :try_end_6} :catch_0
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 198
    :goto_3
    :try_start_7
    new-instance v4, Ljava/io/ByteArrayOutputStream;

    .line 199
    .line 200
    invoke-direct {v4}, Ljava/io/ByteArrayOutputStream;-><init>()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 201
    .line 202
    .line 203
    const/4 v6, 0x0

    .line 204
    if-nez v3, :cond_4

    .line 205
    .line 206
    :try_start_8
    new-array v6, v6, [B
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    .line 207
    .line 208
    :try_start_9
    invoke-virtual {v4}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    .line 209
    .line 210
    .line 211
    goto :goto_5

    .line 212
    :catchall_3
    move-exception v0

    .line 213
    move-object v4, v0

    .line 214
    goto :goto_8

    .line 215
    :catchall_4
    move-exception v0

    .line 216
    move-object v6, v0

    .line 217
    goto :goto_6

    .line 218
    :cond_4
    const/16 v7, 0x1000

    .line 219
    .line 220
    :try_start_a
    new-array v7, v7, [B

    .line 221
    .line 222
    :goto_4
    invoke-virtual {v3, v7}, Ljava/io/InputStream;->read([B)I

    .line 223
    .line 224
    .line 225
    move-result v8

    .line 226
    const/4 v9, -0x1

    .line 227
    if-eq v8, v9, :cond_5

    .line 228
    .line 229
    invoke-virtual {v4, v7, v6, v8}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    .line 230
    .line 231
    .line 232
    goto :goto_4

    .line 233
    :cond_5
    invoke-virtual {v4}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 234
    .line 235
    .line 236
    move-result-object v6
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_4

    .line 237
    :try_start_b
    invoke-virtual {v4}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_3

    .line 238
    .line 239
    .line 240
    :try_start_c
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V

    .line 241
    .line 242
    .line 243
    :goto_5
    new-instance v3, Lgg3;

    .line 244
    .line 245
    invoke-direct {v3, v0, v6}, Lgg3;-><init>(I[B)V

    .line 246
    .line 247
    .line 248
    invoke-virtual {v2, v3}, Lyc;->a(Ljava/lang/Object;)V
    :try_end_c
    .catch Ljava/net/SocketTimeoutException; {:try_start_c .. :try_end_c} :catch_0
    .catchall {:try_start_c .. :try_end_c} :catchall_0

    .line 249
    .line 250
    .line 251
    goto :goto_f

    .line 252
    :goto_6
    :try_start_d
    invoke-virtual {v4}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_5

    .line 253
    .line 254
    .line 255
    goto :goto_7

    .line 256
    :catchall_5
    move-exception v0

    .line 257
    :try_start_e
    invoke-virtual {v6, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 258
    .line 259
    .line 260
    :goto_7
    throw v6
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_3

    .line 261
    :goto_8
    if-eqz v3, :cond_6

    .line 262
    .line 263
    :try_start_f
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_6

    .line 264
    .line 265
    .line 266
    goto :goto_9

    .line 267
    :catchall_6
    move-exception v0

    .line 268
    :try_start_10
    invoke-virtual {v4, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 269
    .line 270
    .line 271
    :cond_6
    :goto_9
    throw v4
    :try_end_10
    .catch Ljava/net/SocketTimeoutException; {:try_start_10 .. :try_end_10} :catch_0
    .catchall {:try_start_10 .. :try_end_10} :catchall_0

    .line 272
    :goto_a
    move-object v6, v1

    .line 273
    goto :goto_c

    .line 274
    :goto_b
    move-object v6, v1

    .line 275
    goto :goto_e

    .line 276
    :catchall_7
    move-exception v0

    .line 277
    goto :goto_c

    .line 278
    :catch_1
    move-exception v0

    .line 279
    goto :goto_e

    .line 280
    :goto_c
    :try_start_11
    invoke-virtual {v2, v0}, Lyc;->b(Ljava/lang/Throwable;)V

    .line 281
    .line 282
    .line 283
    :goto_d
    move-object v1, v6

    .line 284
    goto :goto_f

    .line 285
    :catchall_8
    move-exception v0

    .line 286
    goto :goto_10

    .line 287
    :goto_e
    new-instance v1, Ljava/util/concurrent/TimeoutException;

    .line 288
    .line 289
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 290
    .line 291
    .line 292
    move-result-object v0

    .line 293
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 294
    .line 295
    .line 296
    move-result-object v3

    .line 297
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 298
    .line 299
    .line 300
    move-result v3

    .line 301
    add-int/lit8 v3, v3, 0x9

    .line 302
    .line 303
    new-instance v4, Ljava/lang/StringBuilder;

    .line 304
    .line 305
    invoke-direct {v4, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 306
    .line 307
    .line 308
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 309
    .line 310
    .line 311
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 312
    .line 313
    .line 314
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 315
    .line 316
    .line 317
    move-result-object v0

    .line 318
    invoke-direct {v1, v0}, Ljava/util/concurrent/TimeoutException;-><init>(Ljava/lang/String;)V

    .line 319
    .line 320
    .line 321
    invoke-virtual {v2, v1}, Lyc;->b(Ljava/lang/Throwable;)V
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_8

    .line 322
    .line 323
    .line 324
    goto :goto_d

    .line 325
    :goto_f
    if-eqz v1, :cond_7

    .line 326
    .line 327
    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 328
    .line 329
    .line 330
    :cond_7
    return-void

    .line 331
    :goto_10
    if-eqz v6, :cond_8

    .line 332
    .line 333
    invoke-virtual {v6}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 334
    .line 335
    .line 336
    :cond_8
    throw v0

    .line 337
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
