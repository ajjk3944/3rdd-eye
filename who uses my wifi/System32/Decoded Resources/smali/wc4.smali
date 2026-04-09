.class public final Lwc4;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final a:I

.field public b:Ljava/lang/Object;

.field public c:I

.field public d:I

.field public e:Z

.field public f:J

.field public final synthetic g:Lyc4;


# direct methods
.method public constructor <init>(Lyc4;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lwc4;->g:Lyc4;

    .line 5
    .line 6
    iput p2, p0, Lwc4;->a:I

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lwc4;->g:Lyc4;

    .line 4
    .line 5
    iget-object v2, v1, Lyc4;->f:Lya4;

    .line 6
    .line 7
    iget-object v3, v1, Lyc4;->h:Lsw1;

    .line 8
    .line 9
    iget-object v4, v1, Lyc4;->i:Ld13;

    .line 10
    .line 11
    invoke-virtual {v2}, Lya4;->K1()Loz1;

    .line 12
    .line 13
    .line 14
    move-result-object v5

    .line 15
    invoke-virtual {v5}, Loz1;->g()Z

    .line 16
    .line 17
    .line 18
    move-result v6

    .line 19
    if-eqz v6, :cond_0

    .line 20
    .line 21
    const/4 v6, 0x0

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    invoke-virtual {v2}, Lya4;->N1()I

    .line 24
    .line 25
    .line 26
    move-result v6

    .line 27
    invoke-virtual {v5, v6}, Loz1;->f(I)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v6

    .line 31
    :goto_0
    invoke-virtual {v2}, Lya4;->d()I

    .line 32
    .line 33
    .line 34
    move-result v7

    .line 35
    invoke-virtual {v2}, Lya4;->T1()I

    .line 36
    .line 37
    .line 38
    move-result v8

    .line 39
    invoke-virtual {v2}, Lya4;->Q1()J

    .line 40
    .line 41
    .line 42
    move-result-wide v9

    .line 43
    const/4 v13, -0x1

    .line 44
    if-eqz v6, :cond_1

    .line 45
    .line 46
    if-ne v7, v13, :cond_1

    .line 47
    .line 48
    invoke-virtual {v5, v6, v3}, Loz1;->o(Ljava/lang/Object;Lsw1;)Lsw1;

    .line 49
    .line 50
    .line 51
    const-wide/16 v14, 0x0

    .line 52
    .line 53
    invoke-static {v14, v15}, Lv23;->q(J)J

    .line 54
    .line 55
    .line 56
    move-result-wide v14

    .line 57
    sub-long/2addr v9, v14

    .line 58
    iget-wide v14, v3, Lsw1;->d:J

    .line 59
    .line 60
    invoke-static {v14, v15}, Lv23;->q(J)J

    .line 61
    .line 62
    .line 63
    move-result-wide v14

    .line 64
    move v7, v13

    .line 65
    goto :goto_1

    .line 66
    :cond_1
    if-eq v7, v13, :cond_2

    .line 67
    .line 68
    invoke-virtual {v2}, Lya4;->n2()J

    .line 69
    .line 70
    .line 71
    move-result-wide v14

    .line 72
    goto :goto_1

    .line 73
    :cond_2
    const-wide v14, -0x7fffffffffffffffL    # -4.9E-324

    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    :goto_1
    invoke-virtual {v2}, Lf74;->C1()I

    .line 79
    .line 80
    .line 81
    move-result v3

    .line 82
    const/4 v5, 0x0

    .line 83
    const/4 v13, 0x1

    .line 84
    const-wide v16, -0x7fffffffffffffffL    # -4.9E-324

    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    const/4 v11, 0x3

    .line 90
    if-ne v3, v11, :cond_3

    .line 91
    .line 92
    invoke-virtual {v2}, Lf74;->H1()Z

    .line 93
    .line 94
    .line 95
    move-result v3

    .line 96
    if-eqz v3, :cond_3

    .line 97
    .line 98
    invoke-virtual {v2}, Lf74;->D1()I

    .line 99
    .line 100
    .line 101
    move-result v3

    .line 102
    if-nez v3, :cond_3

    .line 103
    .line 104
    move v3, v13

    .line 105
    goto :goto_2

    .line 106
    :cond_3
    move v3, v5

    .line 107
    :goto_2
    if-eqz v3, :cond_7

    .line 108
    .line 109
    cmp-long v12, v14, v16

    .line 110
    .line 111
    if-eqz v12, :cond_7

    .line 112
    .line 113
    cmp-long v12, v9, v14

    .line 114
    .line 115
    if-gez v12, :cond_4

    .line 116
    .line 117
    goto :goto_3

    .line 118
    :cond_4
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 119
    .line 120
    .line 121
    move-result-wide v2

    .line 122
    iget-boolean v5, v0, Lwc4;->e:Z

    .line 123
    .line 124
    iget v9, v0, Lwc4;->a:I

    .line 125
    .line 126
    if-eqz v5, :cond_6

    .line 127
    .line 128
    iget-object v5, v0, Lwc4;->b:Ljava/lang/Object;

    .line 129
    .line 130
    invoke-static {v6, v5}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 131
    .line 132
    .line 133
    move-result v5

    .line 134
    if-eqz v5, :cond_6

    .line 135
    .line 136
    iget v5, v0, Lwc4;->c:I

    .line 137
    .line 138
    if-ne v7, v5, :cond_6

    .line 139
    .line 140
    iget v5, v0, Lwc4;->d:I

    .line 141
    .line 142
    if-ne v8, v5, :cond_6

    .line 143
    .line 144
    iget-wide v4, v0, Lwc4;->f:J

    .line 145
    .line 146
    sub-long/2addr v2, v4

    .line 147
    int-to-long v4, v9

    .line 148
    cmp-long v2, v2, v4

    .line 149
    .line 150
    if-ltz v2, :cond_5

    .line 151
    .line 152
    iget-object v1, v1, Lyc4;->g:Loa4;

    .line 153
    .line 154
    new-instance v2, Lzc4;

    .line 155
    .line 156
    invoke-direct {v2, v11, v9}, Lzc4;-><init>(II)V

    .line 157
    .line 158
    .line 159
    iget-object v1, v1, Loa4;->f:Lya4;

    .line 160
    .line 161
    new-instance v3, Lb84;

    .line 162
    .line 163
    const/4 v4, 0x2

    .line 164
    const/16 v5, 0x3eb

    .line 165
    .line 166
    invoke-direct {v3, v4, v2, v5}, Lb84;-><init>(ILjava/lang/Exception;I)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {v1, v3}, Lya4;->Y1(Lb84;)V

    .line 170
    .line 171
    .line 172
    :cond_5
    return-void

    .line 173
    :cond_6
    iput-boolean v13, v0, Lwc4;->e:Z

    .line 174
    .line 175
    iput-wide v2, v0, Lwc4;->f:J

    .line 176
    .line 177
    iput-object v6, v0, Lwc4;->b:Ljava/lang/Object;

    .line 178
    .line 179
    iput v7, v0, Lwc4;->c:I

    .line 180
    .line 181
    iput v8, v0, Lwc4;->d:I

    .line 182
    .line 183
    invoke-virtual {v4, v11}, Ld13;->c(I)V

    .line 184
    .line 185
    .line 186
    int-to-long v1, v9

    .line 187
    iget-object v3, v4, Ld13;->a:Landroid/os/Handler;

    .line 188
    .line 189
    invoke-virtual {v3, v11, v1, v2}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 190
    .line 191
    .line 192
    return-void

    .line 193
    :cond_7
    :goto_3
    invoke-virtual {v4, v11}, Ld13;->c(I)V

    .line 194
    .line 195
    .line 196
    if-eqz v3, :cond_8

    .line 197
    .line 198
    cmp-long v1, v14, v16

    .line 199
    .line 200
    if-eqz v1, :cond_8

    .line 201
    .line 202
    sub-long/2addr v14, v9

    .line 203
    invoke-virtual {v2}, Lya4;->j2()V

    .line 204
    .line 205
    .line 206
    iget-object v1, v2, Lya4;->c0:Ldc4;

    .line 207
    .line 208
    iget-object v1, v1, Ldc4;->o:Lsr1;

    .line 209
    .line 210
    iget v1, v1, Lsr1;->a:F

    .line 211
    .line 212
    long-to-float v2, v14

    .line 213
    div-float/2addr v2, v1

    .line 214
    float-to-double v1, v2

    .line 215
    invoke-static {v1, v2}, Ljava/lang/Math;->ceil(D)D

    .line 216
    .line 217
    .line 218
    move-result-wide v1

    .line 219
    double-to-int v1, v1

    .line 220
    int-to-long v1, v1

    .line 221
    iget-object v3, v4, Ld13;->a:Landroid/os/Handler;

    .line 222
    .line 223
    invoke-virtual {v3, v11, v1, v2}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 224
    .line 225
    .line 226
    :cond_8
    iput-boolean v5, v0, Lwc4;->e:Z

    .line 227
    .line 228
    return-void
.end method
