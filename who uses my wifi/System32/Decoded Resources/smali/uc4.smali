.class public final Luc4;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final a:I

.field public b:Ljava/lang/Object;

.field public c:I

.field public d:I

.field public e:J

.field public f:J

.field public g:Z

.field public h:J

.field public final synthetic i:Lyc4;


# direct methods
.method public constructor <init>(Lyc4;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Luc4;->i:Lyc4;

    .line 5
    .line 6
    iput p2, p0, Luc4;->a:I

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
    iget-object v1, v0, Luc4;->i:Lyc4;

    .line 4
    .line 5
    iget-object v2, v1, Lyc4;->f:Lya4;

    .line 6
    .line 7
    iget-object v3, v1, Lyc4;->i:Ld13;

    .line 8
    .line 9
    invoke-virtual {v2}, Lya4;->C1()I

    .line 10
    .line 11
    .line 12
    move-result v4

    .line 13
    const/4 v5, 0x1

    .line 14
    const/4 v6, 0x2

    .line 15
    if-ne v4, v6, :cond_6

    .line 16
    .line 17
    invoke-virtual {v2}, Lya4;->H1()Z

    .line 18
    .line 19
    .line 20
    move-result v4

    .line 21
    if-eqz v4, :cond_6

    .line 22
    .line 23
    invoke-virtual {v2}, Lya4;->D1()I

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    if-eqz v4, :cond_0

    .line 28
    .line 29
    goto/16 :goto_1

    .line 30
    .line 31
    :cond_0
    invoke-virtual {v2}, Lya4;->K1()Loz1;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    invoke-virtual {v4}, Loz1;->g()Z

    .line 36
    .line 37
    .line 38
    move-result v7

    .line 39
    if-eqz v7, :cond_1

    .line 40
    .line 41
    const/4 v7, 0x0

    .line 42
    goto :goto_0

    .line 43
    :cond_1
    invoke-virtual {v2}, Lya4;->N1()I

    .line 44
    .line 45
    .line 46
    move-result v7

    .line 47
    invoke-virtual {v4, v7}, Loz1;->f(I)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v7

    .line 51
    :goto_0
    invoke-virtual {v2}, Lya4;->d()I

    .line 52
    .line 53
    .line 54
    move-result v8

    .line 55
    invoke-virtual {v2}, Lya4;->T1()I

    .line 56
    .line 57
    .line 58
    move-result v9

    .line 59
    invoke-virtual {v2}, Lya4;->o2()J

    .line 60
    .line 61
    .line 62
    move-result-wide v10

    .line 63
    invoke-virtual {v2}, Lya4;->Q1()J

    .line 64
    .line 65
    .line 66
    move-result-wide v12

    .line 67
    sub-long v12, v10, v12

    .line 68
    .line 69
    const-wide/16 v14, 0x0

    .line 70
    .line 71
    invoke-static {v14, v15, v12, v13}, Ljava/lang/Math;->max(JJ)J

    .line 72
    .line 73
    .line 74
    move-result-wide v12

    .line 75
    invoke-virtual {v2}, Lya4;->R1()J

    .line 76
    .line 77
    .line 78
    move-result-wide v16

    .line 79
    sub-long v12, v16, v12

    .line 80
    .line 81
    invoke-static {v14, v15, v12, v13}, Ljava/lang/Math;->max(JJ)J

    .line 82
    .line 83
    .line 84
    move-result-wide v12

    .line 85
    if-eqz v7, :cond_2

    .line 86
    .line 87
    const/4 v2, -0x1

    .line 88
    if-ne v8, v2, :cond_2

    .line 89
    .line 90
    iget-object v8, v1, Lyc4;->h:Lsw1;

    .line 91
    .line 92
    invoke-virtual {v4, v7, v8}, Loz1;->o(Ljava/lang/Object;Lsw1;)Lsw1;

    .line 93
    .line 94
    .line 95
    invoke-static {v14, v15}, Lv23;->q(J)J

    .line 96
    .line 97
    .line 98
    move-result-wide v14

    .line 99
    sub-long/2addr v10, v14

    .line 100
    move v8, v2

    .line 101
    :cond_2
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 102
    .line 103
    .line 104
    move-result-wide v14

    .line 105
    iget-boolean v2, v0, Luc4;->g:Z

    .line 106
    .line 107
    iget v4, v0, Luc4;->a:I

    .line 108
    .line 109
    if-eqz v2, :cond_4

    .line 110
    .line 111
    iget-object v2, v0, Luc4;->b:Ljava/lang/Object;

    .line 112
    .line 113
    invoke-static {v7, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    move-result v2

    .line 117
    if-eqz v2, :cond_4

    .line 118
    .line 119
    iget v2, v0, Luc4;->c:I

    .line 120
    .line 121
    if-ne v8, v2, :cond_4

    .line 122
    .line 123
    iget v2, v0, Luc4;->d:I

    .line 124
    .line 125
    if-ne v9, v2, :cond_4

    .line 126
    .line 127
    move-object/from16 v16, v7

    .line 128
    .line 129
    iget-wide v6, v0, Luc4;->e:J

    .line 130
    .line 131
    cmp-long v6, v10, v6

    .line 132
    .line 133
    if-nez v6, :cond_5

    .line 134
    .line 135
    iget-wide v6, v0, Luc4;->f:J

    .line 136
    .line 137
    cmp-long v6, v12, v6

    .line 138
    .line 139
    if-nez v6, :cond_5

    .line 140
    .line 141
    iget-wide v6, v0, Luc4;->h:J

    .line 142
    .line 143
    sub-long/2addr v14, v6

    .line 144
    int-to-long v6, v4

    .line 145
    cmp-long v3, v14, v6

    .line 146
    .line 147
    if-ltz v3, :cond_3

    .line 148
    .line 149
    iget-object v1, v1, Lyc4;->g:Loa4;

    .line 150
    .line 151
    new-instance v3, Lzc4;

    .line 152
    .line 153
    invoke-direct {v3, v5, v4}, Lzc4;-><init>(II)V

    .line 154
    .line 155
    .line 156
    iget-object v1, v1, Loa4;->f:Lya4;

    .line 157
    .line 158
    new-instance v4, Lb84;

    .line 159
    .line 160
    const/16 v5, 0x3eb

    .line 161
    .line 162
    const/4 v2, 0x2

    .line 163
    invoke-direct {v4, v2, v3, v5}, Lb84;-><init>(ILjava/lang/Exception;I)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {v1, v4}, Lya4;->Y1(Lb84;)V

    .line 167
    .line 168
    .line 169
    :cond_3
    return-void

    .line 170
    :cond_4
    move-object/from16 v16, v7

    .line 171
    .line 172
    :cond_5
    iput-boolean v5, v0, Luc4;->g:Z

    .line 173
    .line 174
    iput-wide v14, v0, Luc4;->h:J

    .line 175
    .line 176
    move-object/from16 v7, v16

    .line 177
    .line 178
    iput-object v7, v0, Luc4;->b:Ljava/lang/Object;

    .line 179
    .line 180
    iput v8, v0, Luc4;->c:I

    .line 181
    .line 182
    iput v9, v0, Luc4;->d:I

    .line 183
    .line 184
    iput-wide v10, v0, Luc4;->e:J

    .line 185
    .line 186
    iput-wide v12, v0, Luc4;->f:J

    .line 187
    .line 188
    invoke-virtual {v3, v5}, Ld13;->c(I)V

    .line 189
    .line 190
    .line 191
    int-to-long v1, v4

    .line 192
    iget-object v3, v3, Ld13;->a:Landroid/os/Handler;

    .line 193
    .line 194
    invoke-virtual {v3, v5, v1, v2}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 195
    .line 196
    .line 197
    return-void

    .line 198
    :cond_6
    :goto_1
    iget-boolean v1, v0, Luc4;->g:Z

    .line 199
    .line 200
    if-eqz v1, :cond_7

    .line 201
    .line 202
    invoke-virtual {v3, v5}, Ld13;->c(I)V

    .line 203
    .line 204
    .line 205
    :cond_7
    const/4 v1, 0x0

    .line 206
    iput-boolean v1, v0, Luc4;->g:Z

    .line 207
    .line 208
    return-void
.end method
