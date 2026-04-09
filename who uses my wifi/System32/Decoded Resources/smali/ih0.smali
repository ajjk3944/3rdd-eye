.class public final Lih0;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lch0;


# instance fields
.field public final a:Ljava/nio/channels/SocketChannel;

.field public final b:Ljava/util/concurrent/ConcurrentLinkedQueue;

.field public final c:Ljava/nio/ByteBuffer;

.field public final d:Ljava/nio/ByteBuffer;

.field public e:I

.field public final synthetic f:Lkh0;


# direct methods
.method public constructor <init>(Lkh0;Ljava/nio/channels/SocketChannel;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lih0;->f:Lkh0;

    .line 5
    .line 6
    new-instance p1, Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 7
    .line 8
    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentLinkedQueue;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Lih0;->b:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 12
    .line 13
    const/4 p1, 0x2

    .line 14
    invoke-static {p1}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    iput-object p1, p0, Lih0;->c:Ljava/nio/ByteBuffer;

    .line 19
    .line 20
    const p1, 0xffff

    .line 21
    .line 22
    .line 23
    invoke-static {p1}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    iput-object p1, p0, Lih0;->d:Ljava/nio/ByteBuffer;

    .line 28
    .line 29
    const/4 p1, 0x0

    .line 30
    iput p1, p0, Lih0;->e:I

    .line 31
    .line 32
    iput-object p2, p0, Lih0;->a:Ljava/nio/channels/SocketChannel;

    .line 33
    .line 34
    return-void
.end method


# virtual methods
.method public final a(Ljava/nio/channels/SelectionKey;)V
    .locals 9

    .line 1
    invoke-virtual {p1}, Ljava/nio/channels/SelectionKey;->isValid()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_b

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/nio/channels/SelectionKey;->isConnectable()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x4

    .line 12
    iget-object v2, p0, Lih0;->a:Ljava/nio/channels/SocketChannel;

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    :try_start_0
    invoke-virtual {v2}, Ljava/nio/channels/SocketChannel;->finishConnect()Z

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1, v1}, Ljava/nio/channels/SelectionKey;->interestOps(I)Ljava/nio/channels/SelectionKey;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 20
    .line 21
    .line 22
    goto/16 :goto_3

    .line 23
    .line 24
    :catch_0
    move-exception p1

    .line 25
    invoke-virtual {p0, p1}, Lih0;->b(Ljava/io/IOException;)V

    .line 26
    .line 27
    .line 28
    goto/16 :goto_3

    .line 29
    .line 30
    :cond_0
    invoke-virtual {p1}, Ljava/nio/channels/SelectionKey;->isWritable()Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    const/4 v3, 0x1

    .line 35
    iget-object v4, p0, Lih0;->b:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 36
    .line 37
    if-eqz v0, :cond_3

    .line 38
    .line 39
    invoke-virtual {v4}, Ljava/util/concurrent/ConcurrentLinkedQueue;->iterator()Ljava/util/Iterator;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 44
    .line 45
    .line 46
    move-result v5

    .line 47
    if-eqz v5, :cond_2

    .line 48
    .line 49
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v5

    .line 53
    check-cast v5, Ljh0;

    .line 54
    .line 55
    :try_start_1
    invoke-virtual {v5}, Ljh0;->a()Z

    .line 56
    .line 57
    .line 58
    move-result v6

    .line 59
    if-nez v6, :cond_1

    .line 60
    .line 61
    invoke-virtual {p1, v1}, Ljava/nio/channels/SelectionKey;->interestOps(I)Ljava/nio/channels/SelectionKey;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    .line 62
    .line 63
    .line 64
    goto :goto_1

    .line 65
    :catch_1
    move-exception v6

    .line 66
    iget-object v5, v5, Ljh0;->e:Ljava/util/concurrent/CompletableFuture;

    .line 67
    .line 68
    invoke-virtual {v5, v6}, Ljava/util/concurrent/CompletableFuture;->completeExceptionally(Ljava/lang/Throwable;)Z

    .line 69
    .line 70
    .line 71
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    .line 72
    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_2
    invoke-virtual {p1, v3}, Ljava/nio/channels/SelectionKey;->interestOps(I)Ljava/nio/channels/SelectionKey;

    .line 76
    .line 77
    .line 78
    :cond_3
    :goto_1
    invoke-virtual {p1}, Ljava/nio/channels/SelectionKey;->isReadable()Z

    .line 79
    .line 80
    .line 81
    move-result p1

    .line 82
    if-eqz p1, :cond_b

    .line 83
    .line 84
    iget-object p1, p0, Lih0;->c:Ljava/nio/ByteBuffer;

    .line 85
    .line 86
    :try_start_2
    iget v0, p0, Lih0;->e:I
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2

    .line 87
    .line 88
    const/4 v1, 0x2

    .line 89
    const/4 v5, 0x0

    .line 90
    iget-object v6, p0, Lih0;->d:Ljava/nio/ByteBuffer;

    .line 91
    .line 92
    if-nez v0, :cond_5

    .line 93
    .line 94
    :try_start_3
    invoke-virtual {v2, p1}, Ljava/nio/channels/SocketChannel;->read(Ljava/nio/ByteBuffer;)I

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    if-gez v0, :cond_4

    .line 99
    .line 100
    new-instance p1, Ljava/io/EOFException;

    .line 101
    .line 102
    invoke-direct {p1}, Ljava/io/EOFException;-><init>()V

    .line 103
    .line 104
    .line 105
    invoke-virtual {p0, p1}, Lih0;->b(Ljava/io/IOException;)V

    .line 106
    .line 107
    .line 108
    goto/16 :goto_3

    .line 109
    .line 110
    :catch_2
    move-exception p1

    .line 111
    goto/16 :goto_2

    .line 112
    .line 113
    :cond_4
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    .line 114
    .line 115
    .line 116
    move-result v0

    .line 117
    if-ne v0, v1, :cond_5

    .line 118
    .line 119
    invoke-virtual {p1, v5}, Ljava/nio/ByteBuffer;->get(I)B

    .line 120
    .line 121
    .line 122
    move-result v0

    .line 123
    and-int/lit16 v0, v0, 0xff

    .line 124
    .line 125
    shl-int/lit8 v0, v0, 0x8

    .line 126
    .line 127
    invoke-virtual {p1, v3}, Ljava/nio/ByteBuffer;->get(I)B

    .line 128
    .line 129
    .line 130
    move-result v7

    .line 131
    and-int/lit16 v7, v7, 0xff

    .line 132
    .line 133
    add-int/2addr v0, v7

    .line 134
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    .line 135
    .line 136
    .line 137
    invoke-virtual {v6, v0}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    .line 138
    .line 139
    .line 140
    iput v3, p0, Lih0;->e:I

    .line 141
    .line 142
    :cond_5
    invoke-virtual {v2, v6}, Ljava/nio/channels/SocketChannel;->read(Ljava/nio/ByteBuffer;)I

    .line 143
    .line 144
    .line 145
    move-result p1

    .line 146
    if-gez p1, :cond_6

    .line 147
    .line 148
    new-instance p1, Ljava/io/EOFException;

    .line 149
    .line 150
    invoke-direct {p1}, Ljava/io/EOFException;-><init>()V

    .line 151
    .line 152
    .line 153
    invoke-virtual {p0, p1}, Lih0;->b(Ljava/io/IOException;)V

    .line 154
    .line 155
    .line 156
    goto/16 :goto_3

    .line 157
    .line 158
    :cond_6
    invoke-virtual {v6}, Ljava/nio/Buffer;->hasRemaining()Z

    .line 159
    .line 160
    .line 161
    move-result p1
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    .line 162
    if-eqz p1, :cond_7

    .line 163
    .line 164
    goto/16 :goto_3

    .line 165
    .line 166
    :cond_7
    iput v5, p0, Lih0;->e:I

    .line 167
    .line 168
    invoke-virtual {v6}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    .line 169
    .line 170
    .line 171
    invoke-virtual {v6}, Ljava/nio/Buffer;->limit()I

    .line 172
    .line 173
    .line 174
    move-result p1

    .line 175
    new-array v0, p1, [B

    .line 176
    .line 177
    invoke-virtual {v6}, Ljava/nio/ByteBuffer;->array()[B

    .line 178
    .line 179
    .line 180
    move-result-object v7

    .line 181
    invoke-virtual {v6}, Ljava/nio/ByteBuffer;->arrayOffset()I

    .line 182
    .line 183
    .line 184
    move-result v8

    .line 185
    invoke-virtual {v6}, Ljava/nio/Buffer;->limit()I

    .line 186
    .line 187
    .line 188
    move-result v6

    .line 189
    invoke-static {v7, v8, v0, v5, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 190
    .line 191
    .line 192
    if-ge p1, v1, :cond_8

    .line 193
    .line 194
    invoke-virtual {v2}, Ljava/nio/channels/SocketChannel;->socket()Ljava/net/Socket;

    .line 195
    .line 196
    .line 197
    move-result-object p1

    .line 198
    invoke-virtual {p1}, Ljava/net/Socket;->getLocalSocketAddress()Ljava/net/SocketAddress;

    .line 199
    .line 200
    .line 201
    invoke-virtual {v2}, Ljava/nio/channels/SocketChannel;->socket()Ljava/net/Socket;

    .line 202
    .line 203
    .line 204
    move-result-object p1

    .line 205
    invoke-virtual {p1}, Ljava/net/Socket;->getRemoteSocketAddress()Ljava/net/SocketAddress;

    .line 206
    .line 207
    .line 208
    const-string p1, "TCP read: response too short for a valid reply, discarding"

    .line 209
    .line 210
    invoke-static {p1, v0}, Ldh0;->d(Ljava/lang/String;[B)V

    .line 211
    .line 212
    .line 213
    goto :goto_3

    .line 214
    :cond_8
    aget-byte p1, v0, v5

    .line 215
    .line 216
    and-int/lit16 p1, p1, 0xff

    .line 217
    .line 218
    shl-int/lit8 p1, p1, 0x8

    .line 219
    .line 220
    aget-byte v1, v0, v3

    .line 221
    .line 222
    and-int/lit16 v1, v1, 0xff

    .line 223
    .line 224
    add-int/2addr p1, v1

    .line 225
    const-string v1, "TCP read: transaction id="

    .line 226
    .line 227
    invoke-static {v1, p1}, Lex0;->f(Ljava/lang/String;I)Ljava/lang/String;

    .line 228
    .line 229
    .line 230
    move-result-object v1

    .line 231
    invoke-virtual {v2}, Ljava/nio/channels/SocketChannel;->socket()Ljava/net/Socket;

    .line 232
    .line 233
    .line 234
    move-result-object v3

    .line 235
    invoke-virtual {v3}, Ljava/net/Socket;->getLocalSocketAddress()Ljava/net/SocketAddress;

    .line 236
    .line 237
    .line 238
    invoke-virtual {v2}, Ljava/nio/channels/SocketChannel;->socket()Ljava/net/Socket;

    .line 239
    .line 240
    .line 241
    move-result-object v2

    .line 242
    invoke-virtual {v2}, Ljava/net/Socket;->getRemoteSocketAddress()Ljava/net/SocketAddress;

    .line 243
    .line 244
    .line 245
    invoke-static {v1, v0}, Ldh0;->d(Ljava/lang/String;[B)V

    .line 246
    .line 247
    .line 248
    invoke-virtual {v4}, Ljava/util/concurrent/ConcurrentLinkedQueue;->iterator()Ljava/util/Iterator;

    .line 249
    .line 250
    .line 251
    move-result-object v1

    .line 252
    :cond_9
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 253
    .line 254
    .line 255
    move-result v2

    .line 256
    if-eqz v2, :cond_a

    .line 257
    .line 258
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 259
    .line 260
    .line 261
    move-result-object v2

    .line 262
    check-cast v2, Ljh0;

    .line 263
    .line 264
    iget-object v3, v2, Ljh0;->a:Lme0;

    .line 265
    .line 266
    iget-object v3, v3, Lme0;->f:Ll00;

    .line 267
    .line 268
    iget v3, v3, Ll00;->f:I

    .line 269
    .line 270
    if-ne p1, v3, :cond_9

    .line 271
    .line 272
    iget-object p1, v2, Ljh0;->e:Ljava/util/concurrent/CompletableFuture;

    .line 273
    .line 274
    invoke-virtual {p1, v0}, Ljava/util/concurrent/CompletableFuture;->complete(Ljava/lang/Object;)Z

    .line 275
    .line 276
    .line 277
    invoke-interface {v1}, Ljava/util/Iterator;->remove()V

    .line 278
    .line 279
    .line 280
    goto :goto_3

    .line 281
    :cond_a
    sget-object v0, Lkh0;->k:Li80;

    .line 282
    .line 283
    const-string v1, "Transaction for answer to id {} not found"

    .line 284
    .line 285
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 286
    .line 287
    .line 288
    move-result-object p1

    .line 289
    invoke-interface {v0, p1, v1}, Li80;->m(Ljava/lang/Object;Ljava/lang/String;)V

    .line 290
    .line 291
    .line 292
    goto :goto_3

    .line 293
    :goto_2
    invoke-virtual {p0, p1}, Lih0;->b(Ljava/io/IOException;)V

    .line 294
    .line 295
    .line 296
    :cond_b
    :goto_3
    return-void
.end method

.method public final b(Ljava/io/IOException;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lih0;->b:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Ljh0;

    .line 18
    .line 19
    iget-object v1, v1, Ljh0;->e:Ljava/util/concurrent/CompletableFuture;

    .line 20
    .line 21
    invoke-virtual {v1, p1}, Ljava/util/concurrent/CompletableFuture;->completeExceptionally(Ljava/lang/Throwable;)Z

    .line 22
    .line 23
    .line 24
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    iget-object p1, p0, Lih0;->f:Lkh0;

    .line 29
    .line 30
    iget-object p1, p1, Lkh0;->j:Ljava/util/concurrent/ConcurrentHashMap;

    .line 31
    .line 32
    invoke-virtual {p1}, Ljava/util/concurrent/ConcurrentHashMap;->entrySet()Ljava/util/Set;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    if-eqz v1, :cond_2

    .line 45
    .line 46
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    check-cast v1, Ljava/util/Map$Entry;

    .line 51
    .line 52
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    if-ne v2, p0, :cond_1

    .line 57
    .line 58
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    invoke-virtual {p1, v0}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    :try_start_0
    iget-object p1, p0, Lih0;->a:Ljava/nio/channels/SocketChannel;

    .line 66
    .line 67
    invoke-virtual {p1}, Ljava/nio/channels/spi/AbstractInterruptibleChannel;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 68
    .line 69
    .line 70
    return-void

    .line 71
    :catch_0
    move-exception p1

    .line 72
    sget-object v0, Lkh0;->k:Li80;

    .line 73
    .line 74
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    check-cast v2, Lhh0;

    .line 79
    .line 80
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    check-cast v1, Lhh0;

    .line 88
    .line 89
    iget-object v1, v1, Lhh0;->a:Ljava/net/InetSocketAddress;

    .line 90
    .line 91
    const/4 v2, 0x0

    .line 92
    filled-new-array {v2, v1, p1}, [Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    const-string v1, "Failed to close channel l={}/r={}"

    .line 97
    .line 98
    invoke-interface {v0, v1, p1}, Li80;->n(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    :cond_2
    return-void
.end method
