.class public final Ljh0;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final a:Lme0;

.field public final b:[B

.field public final c:J

.field public final d:Ljava/nio/channels/SocketChannel;

.field public final e:Ljava/util/concurrent/CompletableFuture;

.field public f:Ljava/nio/ByteBuffer;

.field public g:J


# direct methods
.method public constructor <init>(Lme0;[BJLjava/nio/channels/SocketChannel;Ljava/util/concurrent/CompletableFuture;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-wide/16 v0, 0x0

    .line 5
    .line 6
    iput-wide v0, p0, Ljh0;->g:J

    .line 7
    .line 8
    iput-object p1, p0, Ljh0;->a:Lme0;

    .line 9
    .line 10
    iput-object p2, p0, Ljh0;->b:[B

    .line 11
    .line 12
    iput-wide p3, p0, Ljh0;->c:J

    .line 13
    .line 14
    iput-object p5, p0, Ljh0;->d:Ljava/nio/channels/SocketChannel;

    .line 15
    .line 16
    iput-object p6, p0, Ljh0;->e:Ljava/util/concurrent/CompletableFuture;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 12

    .line 1
    iget-wide v0, p0, Ljh0;->g:J

    .line 2
    .line 3
    iget-object v2, p0, Ljh0;->b:[B

    .line 4
    .line 5
    array-length v3, v2

    .line 6
    add-int/lit8 v3, v3, 0x2

    .line 7
    .line 8
    int-to-long v3, v3

    .line 9
    cmp-long v0, v0, v3

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    return v1

    .line 15
    :cond_0
    iget-object v0, p0, Ljh0;->f:Ljava/nio/ByteBuffer;

    .line 16
    .line 17
    if-nez v0, :cond_1

    .line 18
    .line 19
    array-length v0, v2

    .line 20
    add-int/lit8 v0, v0, 0x2

    .line 21
    .line 22
    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    iput-object v0, p0, Ljh0;->f:Ljava/nio/ByteBuffer;

    .line 27
    .line 28
    array-length v3, v2

    .line 29
    ushr-int/lit8 v3, v3, 0x8

    .line 30
    .line 31
    int-to-byte v3, v3

    .line 32
    invoke-virtual {v0, v3}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 33
    .line 34
    .line 35
    iget-object v0, p0, Ljh0;->f:Ljava/nio/ByteBuffer;

    .line 36
    .line 37
    array-length v3, v2

    .line 38
    and-int/lit16 v3, v3, 0xff

    .line 39
    .line 40
    int-to-byte v3, v3

    .line 41
    invoke-virtual {v0, v3}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 42
    .line 43
    .line 44
    iget-object v0, p0, Ljh0;->f:Ljava/nio/ByteBuffer;

    .line 45
    .line 46
    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 47
    .line 48
    .line 49
    iget-object v0, p0, Ljh0;->f:Ljava/nio/ByteBuffer;

    .line 50
    .line 51
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    .line 52
    .line 53
    .line 54
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 55
    .line 56
    const-string v3, "TCP write: transaction id="

    .line 57
    .line 58
    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    iget-object v3, p0, Ljh0;->a:Lme0;

    .line 62
    .line 63
    iget-object v4, v3, Lme0;->f:Ll00;

    .line 64
    .line 65
    iget v4, v4, Ll00;->f:I

    .line 66
    .line 67
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    iget-object v4, p0, Ljh0;->d:Ljava/nio/channels/SocketChannel;

    .line 75
    .line 76
    invoke-virtual {v4}, Ljava/nio/channels/SocketChannel;->socket()Ljava/net/Socket;

    .line 77
    .line 78
    .line 79
    move-result-object v5

    .line 80
    invoke-virtual {v5}, Ljava/net/Socket;->getLocalSocketAddress()Ljava/net/SocketAddress;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v4}, Ljava/nio/channels/SocketChannel;->socket()Ljava/net/Socket;

    .line 84
    .line 85
    .line 86
    move-result-object v5

    .line 87
    invoke-virtual {v5}, Ljava/net/Socket;->getRemoteSocketAddress()Ljava/net/SocketAddress;

    .line 88
    .line 89
    .line 90
    iget-object v5, p0, Ljh0;->f:Ljava/nio/ByteBuffer;

    .line 91
    .line 92
    sget-object v6, Ldh0;->a:Li80;

    .line 93
    .line 94
    invoke-interface {v6}, Li80;->s()Z

    .line 95
    .line 96
    .line 97
    move-result v6

    .line 98
    const/4 v7, 0x0

    .line 99
    if-nez v6, :cond_2

    .line 100
    .line 101
    goto :goto_0

    .line 102
    :cond_2
    invoke-virtual {v5}, Ljava/nio/Buffer;->remaining()I

    .line 103
    .line 104
    .line 105
    move-result v6

    .line 106
    new-array v6, v6, [B

    .line 107
    .line 108
    invoke-virtual {v5}, Ljava/nio/Buffer;->position()I

    .line 109
    .line 110
    .line 111
    move-result v8

    .line 112
    invoke-virtual {v5}, Ljava/nio/Buffer;->remaining()I

    .line 113
    .line 114
    .line 115
    move-result v9

    .line 116
    invoke-virtual {v5, v6, v7, v9}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    .line 117
    .line 118
    .line 119
    invoke-virtual {v5, v8}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 120
    .line 121
    .line 122
    invoke-static {v0, v6}, Ldh0;->d(Ljava/lang/String;[B)V

    .line 123
    .line 124
    .line 125
    :cond_3
    :goto_0
    iget-object v0, p0, Ljh0;->f:Ljava/nio/ByteBuffer;

    .line 126
    .line 127
    invoke-virtual {v0}, Ljava/nio/Buffer;->hasRemaining()Z

    .line 128
    .line 129
    .line 130
    move-result v0

    .line 131
    if-eqz v0, :cond_5

    .line 132
    .line 133
    iget-object v0, p0, Ljh0;->f:Ljava/nio/ByteBuffer;

    .line 134
    .line 135
    invoke-virtual {v4, v0}, Ljava/nio/channels/SocketChannel;->write(Ljava/nio/ByteBuffer;)I

    .line 136
    .line 137
    .line 138
    move-result v0

    .line 139
    int-to-long v5, v0

    .line 140
    iget-wide v8, p0, Ljh0;->g:J

    .line 141
    .line 142
    add-long/2addr v8, v5

    .line 143
    iput-wide v8, p0, Ljh0;->g:J

    .line 144
    .line 145
    const-wide/16 v10, 0x0

    .line 146
    .line 147
    cmp-long v0, v5, v10

    .line 148
    .line 149
    if-nez v0, :cond_4

    .line 150
    .line 151
    sget-object v0, Lkh0;->k:Li80;

    .line 152
    .line 153
    iget-object v1, v3, Lme0;->f:Ll00;

    .line 154
    .line 155
    iget v1, v1, Ll00;->f:I

    .line 156
    .line 157
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 158
    .line 159
    .line 160
    move-result-object v1

    .line 161
    const-string v2, "Insufficient room for the data in the underlying output buffer for transaction {}, retrying"

    .line 162
    .line 163
    invoke-interface {v0, v1, v2}, Li80;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 164
    .line 165
    .line 166
    return v7

    .line 167
    :cond_4
    array-length v0, v2

    .line 168
    int-to-long v5, v0

    .line 169
    cmp-long v0, v8, v5

    .line 170
    .line 171
    if-gez v0, :cond_3

    .line 172
    .line 173
    sget-object v0, Lkh0;->k:Li80;

    .line 174
    .line 175
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 176
    .line 177
    .line 178
    move-result-object v5

    .line 179
    array-length v6, v2

    .line 180
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 181
    .line 182
    .line 183
    move-result-object v6

    .line 184
    iget-object v8, v3, Lme0;->f:Ll00;

    .line 185
    .line 186
    iget v8, v8, Ll00;->f:I

    .line 187
    .line 188
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 189
    .line 190
    .line 191
    move-result-object v8

    .line 192
    filled-new-array {v5, v6, v8}, [Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object v5

    .line 196
    const-string v6, "Wrote {} of {} bytes data for transaction {}"

    .line 197
    .line 198
    invoke-interface {v0, v6, v5}, Li80;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 199
    .line 200
    .line 201
    goto :goto_0

    .line 202
    :cond_5
    sget-object v0, Lkh0;->k:Li80;

    .line 203
    .line 204
    iget-object v2, v3, Lme0;->f:Ll00;

    .line 205
    .line 206
    iget v2, v2, Ll00;->f:I

    .line 207
    .line 208
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 209
    .line 210
    .line 211
    move-result-object v2

    .line 212
    iget-wide v3, p0, Ljh0;->g:J

    .line 213
    .line 214
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 215
    .line 216
    .line 217
    move-result-object v3

    .line 218
    const-string v4, "Send for transaction {} is complete, wrote {} bytes"

    .line 219
    .line 220
    invoke-interface {v0, v4, v2, v3}, Li80;->f(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 221
    .line 222
    .line 223
    return v1
.end method
