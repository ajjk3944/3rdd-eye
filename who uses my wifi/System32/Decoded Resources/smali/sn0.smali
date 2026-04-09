.class public final Lsn0;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lec;


# instance fields
.field public final f:Lac;

.field public final g:Lgx0;

.field public h:Z


# direct methods
.method public constructor <init>(Lgx0;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lac;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lsn0;->f:Lac;

    .line 10
    .line 11
    iput-object p1, p0, Lsn0;->g:Lgx0;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final a(Ljc;)J
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-boolean v2, v0, Lsn0;->h:Z

    .line 6
    .line 7
    if-nez v2, :cond_f

    .line 8
    .line 9
    const-wide/16 v2, 0x0

    .line 10
    .line 11
    :goto_0
    const-wide/16 v4, 0x0

    .line 12
    .line 13
    cmp-long v6, v2, v4

    .line 14
    .line 15
    iget-object v7, v0, Lsn0;->f:Lac;

    .line 16
    .line 17
    if-ltz v6, :cond_e

    .line 18
    .line 19
    iget-object v6, v7, Lac;->f:Lxt0;

    .line 20
    .line 21
    if-nez v6, :cond_0

    .line 22
    .line 23
    goto/16 :goto_a

    .line 24
    .line 25
    :cond_0
    iget-wide v8, v7, Lac;->g:J

    .line 26
    .line 27
    sub-long v10, v8, v2

    .line 28
    .line 29
    cmp-long v10, v10, v2

    .line 30
    .line 31
    if-gez v10, :cond_1

    .line 32
    .line 33
    :goto_1
    cmp-long v4, v8, v2

    .line 34
    .line 35
    if-lez v4, :cond_3

    .line 36
    .line 37
    iget-object v6, v6, Lxt0;->g:Lxt0;

    .line 38
    .line 39
    iget v4, v6, Lxt0;->c:I

    .line 40
    .line 41
    iget v5, v6, Lxt0;->b:I

    .line 42
    .line 43
    sub-int/2addr v4, v5

    .line 44
    int-to-long v4, v4

    .line 45
    sub-long/2addr v8, v4

    .line 46
    goto :goto_1

    .line 47
    :cond_1
    :goto_2
    iget v8, v6, Lxt0;->c:I

    .line 48
    .line 49
    iget v9, v6, Lxt0;->b:I

    .line 50
    .line 51
    sub-int/2addr v8, v9

    .line 52
    int-to-long v8, v8

    .line 53
    add-long/2addr v8, v4

    .line 54
    cmp-long v10, v8, v2

    .line 55
    .line 56
    if-gez v10, :cond_2

    .line 57
    .line 58
    iget-object v6, v6, Lxt0;->f:Lxt0;

    .line 59
    .line 60
    move-wide v4, v8

    .line 61
    goto :goto_2

    .line 62
    :cond_2
    move-wide v8, v4

    .line 63
    :cond_3
    invoke-virtual {v1}, Ljc;->g()I

    .line 64
    .line 65
    .line 66
    move-result v4

    .line 67
    const/4 v5, 0x2

    .line 68
    const/4 v10, 0x0

    .line 69
    if-ne v4, v5, :cond_7

    .line 70
    .line 71
    invoke-virtual {v1, v10}, Ljc;->b(I)B

    .line 72
    .line 73
    .line 74
    move-result v4

    .line 75
    const/4 v5, 0x1

    .line 76
    invoke-virtual {v1, v5}, Ljc;->b(I)B

    .line 77
    .line 78
    .line 79
    move-result v5

    .line 80
    move-wide v10, v2

    .line 81
    :goto_3
    iget-wide v12, v7, Lac;->g:J

    .line 82
    .line 83
    cmp-long v12, v8, v12

    .line 84
    .line 85
    if-gez v12, :cond_b

    .line 86
    .line 87
    iget-object v12, v6, Lxt0;->a:[B

    .line 88
    .line 89
    iget v13, v6, Lxt0;->b:I

    .line 90
    .line 91
    int-to-long v13, v13

    .line 92
    add-long/2addr v13, v10

    .line 93
    sub-long/2addr v13, v8

    .line 94
    long-to-int v10, v13

    .line 95
    iget v11, v6, Lxt0;->c:I

    .line 96
    .line 97
    :goto_4
    if-ge v10, v11, :cond_6

    .line 98
    .line 99
    aget-byte v13, v12, v10

    .line 100
    .line 101
    if-eq v13, v4, :cond_5

    .line 102
    .line 103
    if-ne v13, v5, :cond_4

    .line 104
    .line 105
    goto :goto_5

    .line 106
    :cond_4
    add-int/lit8 v10, v10, 0x1

    .line 107
    .line 108
    goto :goto_4

    .line 109
    :cond_5
    :goto_5
    iget v4, v6, Lxt0;->b:I

    .line 110
    .line 111
    sub-int/2addr v10, v4

    .line 112
    int-to-long v4, v10

    .line 113
    :goto_6
    add-long/2addr v4, v8

    .line 114
    goto :goto_b

    .line 115
    :cond_6
    iget v10, v6, Lxt0;->c:I

    .line 116
    .line 117
    iget v11, v6, Lxt0;->b:I

    .line 118
    .line 119
    sub-int/2addr v10, v11

    .line 120
    int-to-long v10, v10

    .line 121
    add-long/2addr v10, v8

    .line 122
    iget-object v6, v6, Lxt0;->f:Lxt0;

    .line 123
    .line 124
    move-wide v8, v10

    .line 125
    goto :goto_3

    .line 126
    :cond_7
    invoke-virtual {v1}, Ljc;->d()[B

    .line 127
    .line 128
    .line 129
    move-result-object v4

    .line 130
    move-wide v11, v2

    .line 131
    :goto_7
    iget-wide v13, v7, Lac;->g:J

    .line 132
    .line 133
    cmp-long v5, v8, v13

    .line 134
    .line 135
    if-gez v5, :cond_b

    .line 136
    .line 137
    iget-object v5, v6, Lxt0;->a:[B

    .line 138
    .line 139
    iget v13, v6, Lxt0;->b:I

    .line 140
    .line 141
    int-to-long v13, v13

    .line 142
    add-long/2addr v13, v11

    .line 143
    sub-long/2addr v13, v8

    .line 144
    long-to-int v11, v13

    .line 145
    iget v12, v6, Lxt0;->c:I

    .line 146
    .line 147
    :goto_8
    if-ge v11, v12, :cond_a

    .line 148
    .line 149
    aget-byte v13, v5, v11

    .line 150
    .line 151
    array-length v14, v4

    .line 152
    move v15, v10

    .line 153
    :goto_9
    if-ge v15, v14, :cond_9

    .line 154
    .line 155
    aget-byte v10, v4, v15

    .line 156
    .line 157
    if-ne v13, v10, :cond_8

    .line 158
    .line 159
    iget v4, v6, Lxt0;->b:I

    .line 160
    .line 161
    sub-int/2addr v11, v4

    .line 162
    int-to-long v4, v11

    .line 163
    goto :goto_6

    .line 164
    :cond_8
    add-int/lit8 v15, v15, 0x1

    .line 165
    .line 166
    const/4 v10, 0x0

    .line 167
    goto :goto_9

    .line 168
    :cond_9
    add-int/lit8 v11, v11, 0x1

    .line 169
    .line 170
    const/4 v10, 0x0

    .line 171
    goto :goto_8

    .line 172
    :cond_a
    iget v5, v6, Lxt0;->c:I

    .line 173
    .line 174
    iget v10, v6, Lxt0;->b:I

    .line 175
    .line 176
    sub-int/2addr v5, v10

    .line 177
    int-to-long v10, v5

    .line 178
    add-long v11, v8, v10

    .line 179
    .line 180
    iget-object v6, v6, Lxt0;->f:Lxt0;

    .line 181
    .line 182
    move-wide v8, v11

    .line 183
    const/4 v10, 0x0

    .line 184
    goto :goto_7

    .line 185
    :cond_b
    :goto_a
    const-wide/16 v4, -0x1

    .line 186
    .line 187
    :goto_b
    const-wide/16 v8, -0x1

    .line 188
    .line 189
    cmp-long v6, v4, v8

    .line 190
    .line 191
    if-eqz v6, :cond_c

    .line 192
    .line 193
    return-wide v4

    .line 194
    :cond_c
    iget-wide v4, v7, Lac;->g:J

    .line 195
    .line 196
    iget-object v6, v0, Lsn0;->g:Lgx0;

    .line 197
    .line 198
    const-wide/16 v10, 0x2000

    .line 199
    .line 200
    invoke-interface {v6, v7, v10, v11}, Lgx0;->e(Lac;J)J

    .line 201
    .line 202
    .line 203
    move-result-wide v6

    .line 204
    cmp-long v6, v6, v8

    .line 205
    .line 206
    if-nez v6, :cond_d

    .line 207
    .line 208
    return-wide v8

    .line 209
    :cond_d
    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->max(JJ)J

    .line 210
    .line 211
    .line 212
    move-result-wide v2

    .line 213
    goto/16 :goto_0

    .line 214
    .line 215
    :cond_e
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 216
    .line 217
    .line 218
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 219
    .line 220
    const-string v2, "fromIndex < 0"

    .line 221
    .line 222
    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 223
    .line 224
    .line 225
    throw v1

    .line 226
    :cond_f
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 227
    .line 228
    const-string v2, "closed"

    .line 229
    .line 230
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 231
    .line 232
    .line 233
    throw v1
.end method

.method public final b()Lac;
    .locals 1

    .line 1
    iget-object v0, p0, Lsn0;->f:Lac;

    .line 2
    .line 3
    return-object v0
.end method

.method public final close()V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lsn0;->h:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, Lsn0;->h:Z

    .line 8
    .line 9
    iget-object v0, p0, Lsn0;->g:Lgx0;

    .line 10
    .line 11
    invoke-interface {v0}, Ljava/io/Closeable;->close()V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lsn0;->f:Lac;

    .line 15
    .line 16
    :try_start_0
    iget-wide v1, v0, Lac;->g:J

    .line 17
    .line 18
    invoke-virtual {v0, v1, v2}, Lac;->h(J)V
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :catch_0
    move-exception v0

    .line 23
    new-instance v1, Ljava/lang/AssertionError;

    .line 24
    .line 25
    invoke-direct {v1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    throw v1
.end method

.method public final d(J)Z
    .locals 4

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v0, p1, v0

    .line 4
    .line 5
    if-ltz v0, :cond_3

    .line 6
    .line 7
    iget-boolean v0, p0, Lsn0;->h:Z

    .line 8
    .line 9
    if-nez v0, :cond_2

    .line 10
    .line 11
    :cond_0
    iget-object v0, p0, Lsn0;->f:Lac;

    .line 12
    .line 13
    iget-wide v1, v0, Lac;->g:J

    .line 14
    .line 15
    cmp-long v1, v1, p1

    .line 16
    .line 17
    if-gez v1, :cond_1

    .line 18
    .line 19
    iget-object v1, p0, Lsn0;->g:Lgx0;

    .line 20
    .line 21
    const-wide/16 v2, 0x2000

    .line 22
    .line 23
    invoke-interface {v1, v0, v2, v3}, Lgx0;->e(Lac;J)J

    .line 24
    .line 25
    .line 26
    move-result-wide v0

    .line 27
    const-wide/16 v2, -0x1

    .line 28
    .line 29
    cmp-long v0, v0, v2

    .line 30
    .line 31
    if-nez v0, :cond_0

    .line 32
    .line 33
    const/4 p1, 0x0

    .line 34
    return p1

    .line 35
    :cond_1
    const/4 p1, 0x1

    .line 36
    return p1

    .line 37
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 38
    .line 39
    const-string p2, "closed"

    .line 40
    .line 41
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    throw p1

    .line 45
    :cond_3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 46
    .line 47
    new-instance v1, Ljava/lang/StringBuilder;

    .line 48
    .line 49
    const-string v2, "byteCount < 0: "

    .line 50
    .line 51
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    throw v0
.end method

.method public final e(Lac;J)J
    .locals 6

    .line 1
    iget-boolean p2, p0, Lsn0;->h:Z

    .line 2
    .line 3
    if-nez p2, :cond_1

    .line 4
    .line 5
    iget-object p2, p0, Lsn0;->f:Lac;

    .line 6
    .line 7
    iget-wide v0, p2, Lac;->g:J

    .line 8
    .line 9
    const-wide/16 v2, 0x0

    .line 10
    .line 11
    cmp-long p3, v0, v2

    .line 12
    .line 13
    const-wide/16 v0, 0x2000

    .line 14
    .line 15
    if-nez p3, :cond_0

    .line 16
    .line 17
    iget-object p3, p0, Lsn0;->g:Lgx0;

    .line 18
    .line 19
    invoke-interface {p3, p2, v0, v1}, Lgx0;->e(Lac;J)J

    .line 20
    .line 21
    .line 22
    move-result-wide v2

    .line 23
    const-wide/16 v4, -0x1

    .line 24
    .line 25
    cmp-long p3, v2, v4

    .line 26
    .line 27
    if-nez p3, :cond_0

    .line 28
    .line 29
    return-wide v4

    .line 30
    :cond_0
    iget-wide v2, p2, Lac;->g:J

    .line 31
    .line 32
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->min(JJ)J

    .line 33
    .line 34
    .line 35
    move-result-wide v0

    .line 36
    invoke-virtual {p2, p1, v0, v1}, Lac;->e(Lac;J)J

    .line 37
    .line 38
    .line 39
    move-result-wide p1

    .line 40
    return-wide p1

    .line 41
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 42
    .line 43
    const-string p2, "closed"

    .line 44
    .line 45
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    throw p1
.end method

.method public final isOpen()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lsn0;->h:Z

    .line 2
    .line 3
    xor-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    return v0
.end method

.method public final read(Ljava/nio/ByteBuffer;)I
    .locals 5

    .line 1
    iget-object v0, p0, Lsn0;->f:Lac;

    .line 2
    .line 3
    iget-wide v1, v0, Lac;->g:J

    .line 4
    .line 5
    const-wide/16 v3, 0x0

    .line 6
    .line 7
    cmp-long v1, v1, v3

    .line 8
    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    iget-object v1, p0, Lsn0;->g:Lgx0;

    .line 12
    .line 13
    const-wide/16 v2, 0x2000

    .line 14
    .line 15
    invoke-interface {v1, v0, v2, v3}, Lgx0;->e(Lac;J)J

    .line 16
    .line 17
    .line 18
    move-result-wide v1

    .line 19
    const-wide/16 v3, -0x1

    .line 20
    .line 21
    cmp-long v1, v1, v3

    .line 22
    .line 23
    if-nez v1, :cond_0

    .line 24
    .line 25
    const/4 p1, -0x1

    .line 26
    return p1

    .line 27
    :cond_0
    invoke-virtual {v0, p1}, Lac;->read(Ljava/nio/ByteBuffer;)I

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    return p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "buffer("

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lsn0;->g:Lgx0;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ")"

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    return-object v0
.end method
