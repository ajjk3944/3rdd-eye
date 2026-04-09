.class public final Lzg1;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final a:Lwe1;

.field public final b:Laf1;

.field public c:Lxe1;

.field public final d:I


# direct methods
.method public constructor <init>(Lye1;Laf1;JJJJJI)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lzg1;->b:Laf1;

    .line 5
    .line 6
    iput p13, p0, Lzg1;->d:I

    .line 7
    .line 8
    move-object p2, p1

    .line 9
    new-instance p1, Lwe1;

    .line 10
    .line 11
    invoke-direct/range {p1 .. p12}, Lwe1;-><init>(Lye1;JJJJJ)V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lzg1;->a:Lwe1;

    .line 15
    .line 16
    return-void
.end method

.method public static final c(Lmf1;JLpf1;)I
    .locals 2

    .line 1
    invoke-interface {p0}, Lmf1;->o()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    cmp-long p0, p1, v0

    .line 6
    .line 7
    if-nez p0, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x0

    .line 10
    return p0

    .line 11
    :cond_0
    iput-wide p1, p3, Lpf1;->a:J

    .line 12
    .line 13
    const/4 p0, 0x1

    .line 14
    return p0
.end method

.method public static synthetic d(I[B)I
    .locals 3

    .line 1
    aget-byte v0, p1, p0

    .line 2
    .line 3
    and-int/lit16 v0, v0, 0xff

    .line 4
    .line 5
    add-int/lit8 v1, p0, 0x1

    .line 6
    .line 7
    aget-byte v1, p1, v1

    .line 8
    .line 9
    and-int/lit16 v1, v1, 0xff

    .line 10
    .line 11
    add-int/lit8 v2, p0, 0x2

    .line 12
    .line 13
    aget-byte v2, p1, v2

    .line 14
    .line 15
    and-int/lit16 v2, v2, 0xff

    .line 16
    .line 17
    add-int/lit8 p0, p0, 0x3

    .line 18
    .line 19
    aget-byte p0, p1, p0

    .line 20
    .line 21
    and-int/lit16 p0, p0, 0xff

    .line 22
    .line 23
    shl-int/lit8 p1, v0, 0x18

    .line 24
    .line 25
    shl-int/lit8 v0, v1, 0x10

    .line 26
    .line 27
    or-int/2addr p1, v0

    .line 28
    shl-int/lit8 v0, v2, 0x8

    .line 29
    .line 30
    or-int/2addr p1, v0

    .line 31
    or-int/2addr p0, p1

    .line 32
    return p0
.end method


# virtual methods
.method public final a(J)V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-wide/from16 v1, p1

    .line 4
    .line 5
    iget-object v3, v0, Lzg1;->c:Lxe1;

    .line 6
    .line 7
    if-eqz v3, :cond_0

    .line 8
    .line 9
    iget-wide v3, v3, Lxe1;->a:J

    .line 10
    .line 11
    cmp-long v3, v3, v1

    .line 12
    .line 13
    if-nez v3, :cond_0

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    new-instance v3, Lxe1;

    .line 17
    .line 18
    iget-object v4, v0, Lzg1;->a:Lwe1;

    .line 19
    .line 20
    iget-object v5, v4, Lwe1;->a:Lye1;

    .line 21
    .line 22
    invoke-interface {v5, v1, v2}, Lye1;->d(J)J

    .line 23
    .line 24
    .line 25
    move-result-wide v6

    .line 26
    iget-wide v10, v4, Lwe1;->c:J

    .line 27
    .line 28
    iget-wide v12, v4, Lwe1;->d:J

    .line 29
    .line 30
    iget-wide v14, v4, Lwe1;->e:J

    .line 31
    .line 32
    iget-wide v4, v4, Lwe1;->f:J

    .line 33
    .line 34
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 35
    .line 36
    .line 37
    iput-wide v1, v3, Lxe1;->a:J

    .line 38
    .line 39
    iput-wide v6, v3, Lxe1;->b:J

    .line 40
    .line 41
    const-wide/16 v1, 0x0

    .line 42
    .line 43
    iput-wide v1, v3, Lxe1;->d:J

    .line 44
    .line 45
    iput-wide v10, v3, Lxe1;->e:J

    .line 46
    .line 47
    iput-wide v12, v3, Lxe1;->f:J

    .line 48
    .line 49
    iput-wide v14, v3, Lxe1;->g:J

    .line 50
    .line 51
    iput-wide v4, v3, Lxe1;->c:J

    .line 52
    .line 53
    const-wide/16 v8, 0x0

    .line 54
    .line 55
    move-wide/from16 v16, v4

    .line 56
    .line 57
    invoke-static/range {v6 .. v17}, Lxe1;->a(JJJJJJ)J

    .line 58
    .line 59
    .line 60
    move-result-wide v1

    .line 61
    iput-wide v1, v3, Lxe1;->h:J

    .line 62
    .line 63
    iput-object v3, v0, Lzg1;->c:Lxe1;

    .line 64
    .line 65
    return-void
.end method

.method public final b(Lmf1;Lpf1;)I
    .locals 27

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    :goto_0
    iget-object v3, v0, Lzg1;->c:Lxe1;

    .line 8
    .line 9
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    iget-wide v4, v3, Lxe1;->f:J

    .line 13
    .line 14
    iget-wide v6, v3, Lxe1;->g:J

    .line 15
    .line 16
    iget-wide v8, v3, Lxe1;->h:J

    .line 17
    .line 18
    sub-long/2addr v6, v4

    .line 19
    iget v10, v0, Lzg1;->d:I

    .line 20
    .line 21
    int-to-long v10, v10

    .line 22
    cmp-long v6, v6, v10

    .line 23
    .line 24
    const/4 v7, 0x0

    .line 25
    iget-object v10, v0, Lzg1;->b:Laf1;

    .line 26
    .line 27
    if-gtz v6, :cond_0

    .line 28
    .line 29
    iput-object v7, v0, Lzg1;->c:Lxe1;

    .line 30
    .line 31
    invoke-interface {v10}, Laf1;->d()V

    .line 32
    .line 33
    .line 34
    invoke-static {v1, v4, v5, v2}, Lzg1;->c(Lmf1;JLpf1;)I

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    return v1

    .line 39
    :cond_0
    invoke-interface {v1}, Lmf1;->o()J

    .line 40
    .line 41
    .line 42
    move-result-wide v4

    .line 43
    sub-long v4, v8, v4

    .line 44
    .line 45
    const-wide/16 v11, 0x0

    .line 46
    .line 47
    cmp-long v6, v4, v11

    .line 48
    .line 49
    if-ltz v6, :cond_5

    .line 50
    .line 51
    const-wide/32 v13, 0x40000

    .line 52
    .line 53
    .line 54
    cmp-long v6, v4, v13

    .line 55
    .line 56
    if-gtz v6, :cond_5

    .line 57
    .line 58
    long-to-int v4, v4

    .line 59
    invoke-interface {v1, v4}, Lmf1;->t(I)V

    .line 60
    .line 61
    .line 62
    invoke-interface {v1}, Lmf1;->i()V

    .line 63
    .line 64
    .line 65
    iget-wide v4, v3, Lxe1;->b:J

    .line 66
    .line 67
    invoke-interface {v10, v1, v4, v5}, Laf1;->f(Lmf1;J)Lze1;

    .line 68
    .line 69
    .line 70
    move-result-object v4

    .line 71
    iget v5, v4, Lze1;->c:I

    .line 72
    .line 73
    move-wide v15, v11

    .line 74
    iget-wide v11, v4, Lze1;->a:J

    .line 75
    .line 76
    move-wide/from16 v17, v13

    .line 77
    .line 78
    iget-wide v13, v4, Lze1;->b:J

    .line 79
    .line 80
    const/4 v4, -0x3

    .line 81
    if-eq v5, v4, :cond_4

    .line 82
    .line 83
    const/4 v4, -0x2

    .line 84
    if-eq v5, v4, :cond_3

    .line 85
    .line 86
    const/4 v4, -0x1

    .line 87
    if-eq v5, v4, :cond_2

    .line 88
    .line 89
    invoke-interface {v1}, Lmf1;->o()J

    .line 90
    .line 91
    .line 92
    move-result-wide v3

    .line 93
    sub-long v3, v13, v3

    .line 94
    .line 95
    cmp-long v5, v3, v15

    .line 96
    .line 97
    if-ltz v5, :cond_1

    .line 98
    .line 99
    cmp-long v5, v3, v17

    .line 100
    .line 101
    if-gtz v5, :cond_1

    .line 102
    .line 103
    long-to-int v3, v3

    .line 104
    invoke-interface {v1, v3}, Lmf1;->t(I)V

    .line 105
    .line 106
    .line 107
    :cond_1
    iput-object v7, v0, Lzg1;->c:Lxe1;

    .line 108
    .line 109
    invoke-interface {v10}, Laf1;->d()V

    .line 110
    .line 111
    .line 112
    invoke-static {v1, v13, v14, v2}, Lzg1;->c(Lmf1;JLpf1;)I

    .line 113
    .line 114
    .line 115
    move-result v1

    .line 116
    return v1

    .line 117
    :cond_2
    iput-wide v11, v3, Lxe1;->e:J

    .line 118
    .line 119
    iput-wide v13, v3, Lxe1;->g:J

    .line 120
    .line 121
    iget-wide v4, v3, Lxe1;->b:J

    .line 122
    .line 123
    iget-wide v6, v3, Lxe1;->d:J

    .line 124
    .line 125
    iget-wide v8, v3, Lxe1;->f:J

    .line 126
    .line 127
    move-wide v15, v4

    .line 128
    iget-wide v4, v3, Lxe1;->c:J

    .line 129
    .line 130
    move-wide/from16 v25, v4

    .line 131
    .line 132
    move-wide/from16 v17, v6

    .line 133
    .line 134
    move-wide/from16 v21, v8

    .line 135
    .line 136
    move-wide/from16 v19, v11

    .line 137
    .line 138
    move-wide/from16 v23, v13

    .line 139
    .line 140
    invoke-static/range {v15 .. v26}, Lxe1;->a(JJJJJJ)J

    .line 141
    .line 142
    .line 143
    move-result-wide v4

    .line 144
    iput-wide v4, v3, Lxe1;->h:J

    .line 145
    .line 146
    goto/16 :goto_0

    .line 147
    .line 148
    :cond_3
    move-wide v4, v11

    .line 149
    move-wide v6, v13

    .line 150
    iput-wide v4, v3, Lxe1;->d:J

    .line 151
    .line 152
    iput-wide v6, v3, Lxe1;->f:J

    .line 153
    .line 154
    iget-wide v8, v3, Lxe1;->b:J

    .line 155
    .line 156
    iget-wide v10, v3, Lxe1;->e:J

    .line 157
    .line 158
    iget-wide v12, v3, Lxe1;->g:J

    .line 159
    .line 160
    iget-wide v14, v3, Lxe1;->c:J

    .line 161
    .line 162
    move-wide/from16 v17, v4

    .line 163
    .line 164
    move-wide/from16 v21, v6

    .line 165
    .line 166
    move-wide/from16 v19, v10

    .line 167
    .line 168
    move-wide/from16 v23, v12

    .line 169
    .line 170
    move-wide/from16 v25, v14

    .line 171
    .line 172
    move-wide v15, v8

    .line 173
    invoke-static/range {v15 .. v26}, Lxe1;->a(JJJJJJ)J

    .line 174
    .line 175
    .line 176
    move-result-wide v4

    .line 177
    iput-wide v4, v3, Lxe1;->h:J

    .line 178
    .line 179
    goto/16 :goto_0

    .line 180
    .line 181
    :cond_4
    iput-object v7, v0, Lzg1;->c:Lxe1;

    .line 182
    .line 183
    invoke-interface {v10}, Laf1;->d()V

    .line 184
    .line 185
    .line 186
    invoke-static {v1, v8, v9, v2}, Lzg1;->c(Lmf1;JLpf1;)I

    .line 187
    .line 188
    .line 189
    move-result v1

    .line 190
    return v1

    .line 191
    :cond_5
    invoke-static {v1, v8, v9, v2}, Lzg1;->c(Lmf1;JLpf1;)I

    .line 192
    .line 193
    .line 194
    move-result v1

    .line 195
    return v1
.end method
