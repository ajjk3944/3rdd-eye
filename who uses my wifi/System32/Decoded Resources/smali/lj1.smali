.class public final Llj1;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lcg1;


# instance fields
.field public final a:J

.field public final b:[Lmj1;

.field public final c:I


# direct methods
.method public constructor <init>(J[Lmj1;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p1, p0, Llj1;->a:J

    .line 5
    .line 6
    iput-object p3, p0, Llj1;->b:[Lmj1;

    .line 7
    .line 8
    iput p4, p0, Llj1;->c:I

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a()J
    .locals 2

    .line 1
    iget-wide v0, p0, Llj1;->a:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final b(J)Lbg1;
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-wide/from16 v1, p1

    .line 4
    .line 5
    iget-object v3, v0, Llj1;->b:[Lmj1;

    .line 6
    .line 7
    array-length v4, v3

    .line 8
    sget-object v5, Ldg1;->c:Ldg1;

    .line 9
    .line 10
    if-nez v4, :cond_0

    .line 11
    .line 12
    new-instance v1, Lbg1;

    .line 13
    .line 14
    invoke-direct {v1, v5, v5}, Lbg1;-><init>(Ldg1;Ldg1;)V

    .line 15
    .line 16
    .line 17
    return-object v1

    .line 18
    :cond_0
    const/4 v4, 0x0

    .line 19
    const/4 v6, -0x1

    .line 20
    iget v11, v0, Llj1;->c:I

    .line 21
    .line 22
    if-eq v11, v6, :cond_6

    .line 23
    .line 24
    aget-object v12, v3, v11

    .line 25
    .line 26
    iget-object v12, v12, Lmj1;->b:Ltj1;

    .line 27
    .line 28
    iget-object v13, v12, Ltj1;->f:[J

    .line 29
    .line 30
    invoke-static {v13, v1, v2, v4}, Lv23;->p([JJZ)I

    .line 31
    .line 32
    .line 33
    move-result v14

    .line 34
    :goto_0
    if-ltz v14, :cond_2

    .line 35
    .line 36
    iget-object v15, v12, Ltj1;->g:[I

    .line 37
    .line 38
    aget v15, v15, v14

    .line 39
    .line 40
    and-int/lit8 v15, v15, 0x1

    .line 41
    .line 42
    if-eqz v15, :cond_1

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_1
    add-int/lit8 v14, v14, -0x1

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_2
    move v14, v6

    .line 49
    :goto_1
    if-ne v14, v6, :cond_3

    .line 50
    .line 51
    invoke-virtual {v12, v1, v2}, Ltj1;->a(J)I

    .line 52
    .line 53
    .line 54
    move-result v14

    .line 55
    :cond_3
    if-ne v14, v6, :cond_4

    .line 56
    .line 57
    new-instance v1, Lbg1;

    .line 58
    .line 59
    invoke-direct {v1, v5, v5}, Lbg1;-><init>(Ldg1;Ldg1;)V

    .line 60
    .line 61
    .line 62
    return-object v1

    .line 63
    :cond_4
    aget-wide v15, v13, v14

    .line 64
    .line 65
    iget-object v5, v12, Ltj1;->c:[J

    .line 66
    .line 67
    aget-wide v17, v5, v14

    .line 68
    .line 69
    cmp-long v19, v15, v1

    .line 70
    .line 71
    if-gez v19, :cond_5

    .line 72
    .line 73
    iget v7, v12, Ltj1;->b:I

    .line 74
    .line 75
    add-int/2addr v7, v6

    .line 76
    if-ge v14, v7, :cond_5

    .line 77
    .line 78
    invoke-virtual {v12, v1, v2}, Ltj1;->a(J)I

    .line 79
    .line 80
    .line 81
    move-result v1

    .line 82
    if-eq v1, v6, :cond_5

    .line 83
    .line 84
    if-eq v1, v14, :cond_5

    .line 85
    .line 86
    aget-wide v7, v13, v1

    .line 87
    .line 88
    aget-wide v1, v5, v1

    .line 89
    .line 90
    move-wide/from16 v21, v7

    .line 91
    .line 92
    move-wide v7, v1

    .line 93
    move-wide/from16 v1, v21

    .line 94
    .line 95
    goto :goto_2

    .line 96
    :cond_5
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    const-wide/16 v7, -0x1

    .line 102
    .line 103
    :goto_2
    move-wide/from16 v19, v7

    .line 104
    .line 105
    move-wide v7, v1

    .line 106
    move-wide v1, v15

    .line 107
    goto :goto_3

    .line 108
    :cond_6
    const-wide v17, 0x7fffffffffffffffL

    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    const-wide/16 v19, -0x1

    .line 119
    .line 120
    :goto_3
    move v5, v4

    .line 121
    move-wide/from16 v12, v17

    .line 122
    .line 123
    move-wide/from16 v14, v19

    .line 124
    .line 125
    const-wide v16, -0x7fffffffffffffffL    # -4.9E-324

    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    :goto_4
    array-length v9, v3

    .line 131
    if-ge v5, v9, :cond_11

    .line 132
    .line 133
    if-eq v5, v11, :cond_10

    .line 134
    .line 135
    aget-object v9, v3, v5

    .line 136
    .line 137
    iget-object v9, v9, Lmj1;->b:Ltj1;

    .line 138
    .line 139
    iget-object v10, v9, Ltj1;->c:[J

    .line 140
    .line 141
    iget-object v6, v9, Ltj1;->g:[I

    .line 142
    .line 143
    iget-object v0, v9, Ltj1;->f:[J

    .line 144
    .line 145
    invoke-static {v0, v1, v2, v4}, Lv23;->p([JJZ)I

    .line 146
    .line 147
    .line 148
    move-result v19

    .line 149
    :goto_5
    if-ltz v19, :cond_8

    .line 150
    .line 151
    aget v20, v6, v19

    .line 152
    .line 153
    and-int/lit8 v20, v20, 0x1

    .line 154
    .line 155
    if-eqz v20, :cond_7

    .line 156
    .line 157
    move/from16 v4, v19

    .line 158
    .line 159
    :goto_6
    move-object/from16 v20, v3

    .line 160
    .line 161
    const/4 v3, -0x1

    .line 162
    goto :goto_7

    .line 163
    :cond_7
    add-int/lit8 v19, v19, -0x1

    .line 164
    .line 165
    goto :goto_5

    .line 166
    :cond_8
    const/4 v4, -0x1

    .line 167
    goto :goto_6

    .line 168
    :goto_7
    if-ne v4, v3, :cond_9

    .line 169
    .line 170
    invoke-virtual {v9, v1, v2}, Ltj1;->a(J)I

    .line 171
    .line 172
    .line 173
    move-result v4

    .line 174
    :cond_9
    if-ne v4, v3, :cond_a

    .line 175
    .line 176
    goto :goto_8

    .line 177
    :cond_a
    aget-wide v3, v10, v4

    .line 178
    .line 179
    invoke-static {v3, v4, v12, v13}, Ljava/lang/Math;->min(JJ)J

    .line 180
    .line 181
    .line 182
    move-result-wide v12

    .line 183
    :goto_8
    cmp-long v3, v7, v16

    .line 184
    .line 185
    if-eqz v3, :cond_f

    .line 186
    .line 187
    const/4 v3, 0x0

    .line 188
    invoke-static {v0, v7, v8, v3}, Lv23;->p([JJZ)I

    .line 189
    .line 190
    .line 191
    move-result v0

    .line 192
    :goto_9
    if-ltz v0, :cond_c

    .line 193
    .line 194
    aget v4, v6, v0

    .line 195
    .line 196
    and-int/lit8 v4, v4, 0x1

    .line 197
    .line 198
    if-eqz v4, :cond_b

    .line 199
    .line 200
    :goto_a
    const/4 v4, -0x1

    .line 201
    goto :goto_b

    .line 202
    :cond_b
    add-int/lit8 v0, v0, -0x1

    .line 203
    .line 204
    goto :goto_9

    .line 205
    :cond_c
    const/4 v0, -0x1

    .line 206
    goto :goto_a

    .line 207
    :goto_b
    if-ne v0, v4, :cond_d

    .line 208
    .line 209
    invoke-virtual {v9, v7, v8}, Ltj1;->a(J)I

    .line 210
    .line 211
    .line 212
    move-result v0

    .line 213
    :cond_d
    if-ne v0, v4, :cond_e

    .line 214
    .line 215
    goto :goto_c

    .line 216
    :cond_e
    aget-wide v9, v10, v0

    .line 217
    .line 218
    invoke-static {v9, v10, v14, v15}, Ljava/lang/Math;->min(JJ)J

    .line 219
    .line 220
    .line 221
    move-result-wide v14

    .line 222
    goto :goto_c

    .line 223
    :cond_f
    const/4 v3, 0x0

    .line 224
    const/4 v4, -0x1

    .line 225
    goto :goto_c

    .line 226
    :cond_10
    move-object/from16 v20, v3

    .line 227
    .line 228
    move v3, v4

    .line 229
    move v4, v6

    .line 230
    :goto_c
    add-int/lit8 v5, v5, 0x1

    .line 231
    .line 232
    move-object/from16 v0, p0

    .line 233
    .line 234
    move v6, v4

    .line 235
    move v4, v3

    .line 236
    move-object/from16 v3, v20

    .line 237
    .line 238
    goto :goto_4

    .line 239
    :cond_11
    new-instance v0, Ldg1;

    .line 240
    .line 241
    invoke-direct {v0, v1, v2, v12, v13}, Ldg1;-><init>(JJ)V

    .line 242
    .line 243
    .line 244
    cmp-long v1, v7, v16

    .line 245
    .line 246
    if-nez v1, :cond_12

    .line 247
    .line 248
    new-instance v1, Lbg1;

    .line 249
    .line 250
    invoke-direct {v1, v0, v0}, Lbg1;-><init>(Ldg1;Ldg1;)V

    .line 251
    .line 252
    .line 253
    return-object v1

    .line 254
    :cond_12
    new-instance v1, Ldg1;

    .line 255
    .line 256
    invoke-direct {v1, v7, v8, v14, v15}, Ldg1;-><init>(JJ)V

    .line 257
    .line 258
    .line 259
    new-instance v2, Lbg1;

    .line 260
    .line 261
    invoke-direct {v2, v0, v1}, Lbg1;-><init>(Ldg1;Ldg1;)V

    .line 262
    .line 263
    .line 264
    return-object v2
.end method

.method public final d()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method
