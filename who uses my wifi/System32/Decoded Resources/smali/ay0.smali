.class public final Lay0;
.super Lm0;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lpf0;
.implements Lyu;


# static fields
.field public static final synthetic j:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;


# instance fields
.field private volatile synthetic _state$volatile:Ljava/lang/Object;

.field public i:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const-class v0, Ljava/lang/Object;

    .line 2
    .line 3
    const-string v1, "_state$volatile"

    .line 4
    .line 5
    const-class v2, Lay0;

    .line 6
    .line 7
    invoke-static {v2, v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sput-object v0, Lay0;->j:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 12
    .line 13
    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lay0;->_state$volatile:Ljava/lang/Object;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final E()Ljava/lang/Object;
    .locals 2

    .line 1
    sget-object v0, Lyc0;->b:Lgs3;

    .line 2
    .line 3
    sget-object v1, Lay0;->j:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 4
    .line 5
    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-ne v1, v0, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    return-object v0

    .line 13
    :cond_0
    return-object v1
.end method

.method public final F(Ljava/lang/Object;)V
    .locals 8

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    sget-object p1, Lyc0;->b:Lgs3;

    .line 4
    .line 5
    :cond_0
    monitor-enter p0

    .line 6
    :try_start_0
    sget-object v0, Lay0;->j:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 7
    .line 8
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-static {v1, p1}, Li30;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 16
    if-eqz v1, :cond_1

    .line 17
    .line 18
    monitor-exit p0

    .line 19
    return-void

    .line 20
    :cond_1
    :try_start_1
    invoke-virtual {v0, p0, p1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    iget p1, p0, Lay0;->i:I

    .line 24
    .line 25
    and-int/lit8 v0, p1, 0x1

    .line 26
    .line 27
    if-nez v0, :cond_b

    .line 28
    .line 29
    add-int/lit8 p1, p1, 0x1

    .line 30
    .line 31
    iput p1, p0, Lay0;->i:I

    .line 32
    .line 33
    iget-object v0, p0, Lm0;->h:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v0, [Lby0;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 36
    .line 37
    monitor-exit p0

    .line 38
    :goto_0
    if-eqz v0, :cond_9

    .line 39
    .line 40
    array-length v1, v0

    .line 41
    const/4 v2, 0x0

    .line 42
    :goto_1
    if-ge v2, v1, :cond_9

    .line 43
    .line 44
    aget-object v3, v0, v2

    .line 45
    .line 46
    if-eqz v3, :cond_8

    .line 47
    .line 48
    iget-object v3, v3, Lby0;->a:Ljava/util/concurrent/atomic/AtomicReference;

    .line 49
    .line 50
    :goto_2
    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v4

    .line 54
    if-nez v4, :cond_2

    .line 55
    .line 56
    goto :goto_3

    .line 57
    :cond_2
    sget-object v5, Lgi2;->d:Lgs3;

    .line 58
    .line 59
    if-ne v4, v5, :cond_3

    .line 60
    .line 61
    goto :goto_3

    .line 62
    :cond_3
    sget-object v6, Lgi2;->c:Lgs3;

    .line 63
    .line 64
    if-ne v4, v6, :cond_6

    .line 65
    .line 66
    :cond_4
    invoke-virtual {v3, v4, v5}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v6

    .line 70
    if-eqz v6, :cond_5

    .line 71
    .line 72
    goto :goto_3

    .line 73
    :cond_5
    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v6

    .line 77
    if-eq v6, v4, :cond_4

    .line 78
    .line 79
    goto :goto_2

    .line 80
    :cond_6
    invoke-virtual {v3, v4, v6}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result v5

    .line 84
    if-eqz v5, :cond_7

    .line 85
    .line 86
    check-cast v4, Lkd;

    .line 87
    .line 88
    sget-object v3, Lz31;->a:Lz31;

    .line 89
    .line 90
    invoke-virtual {v4, v3}, Lkd;->e(Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    goto :goto_3

    .line 94
    :cond_7
    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v5

    .line 98
    if-eq v5, v4, :cond_6

    .line 99
    .line 100
    goto :goto_2

    .line 101
    :cond_8
    :goto_3
    add-int/lit8 v2, v2, 0x1

    .line 102
    .line 103
    goto :goto_1

    .line 104
    :cond_9
    monitor-enter p0

    .line 105
    :try_start_2
    iget v0, p0, Lay0;->i:I

    .line 106
    .line 107
    if-ne v0, p1, :cond_a

    .line 108
    .line 109
    add-int/lit8 p1, p1, 0x1

    .line 110
    .line 111
    iput p1, p0, Lay0;->i:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 112
    .line 113
    monitor-exit p0

    .line 114
    return-void

    .line 115
    :catchall_0
    move-exception p1

    .line 116
    goto :goto_4

    .line 117
    :cond_a
    :try_start_3
    iget-object p1, p0, Lm0;->h:Ljava/lang/Object;

    .line 118
    .line 119
    check-cast p1, [Lby0;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 120
    .line 121
    monitor-exit p0

    .line 122
    move v7, v0

    .line 123
    move-object v0, p1

    .line 124
    move p1, v7

    .line 125
    goto :goto_0

    .line 126
    :goto_4
    monitor-exit p0

    .line 127
    throw p1

    .line 128
    :catchall_1
    move-exception p1

    .line 129
    goto :goto_5

    .line 130
    :cond_b
    add-int/lit8 p1, p1, 0x2

    .line 131
    .line 132
    :try_start_4
    iput p1, p0, Lay0;->i:I
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 133
    .line 134
    monitor-exit p0

    .line 135
    return-void

    .line 136
    :goto_5
    monitor-exit p0

    .line 137
    throw p1
.end method

.method public final b(Lav;Loj;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p2

    .line 4
    .line 5
    instance-of v2, v0, Lzx0;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v0

    .line 10
    check-cast v2, Lzx0;

    .line 11
    .line 12
    iget v3, v2, Lzx0;->p:I

    .line 13
    .line 14
    const/high16 v4, -0x80000000

    .line 15
    .line 16
    and-int v5, v3, v4

    .line 17
    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    sub-int/2addr v3, v4

    .line 21
    iput v3, v2, Lzx0;->p:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, Lzx0;

    .line 25
    .line 26
    check-cast v0, Lqj;

    .line 27
    .line 28
    invoke-direct {v2, v1, v0}, Lzx0;-><init>(Lay0;Lqj;)V

    .line 29
    .line 30
    .line 31
    :goto_0
    iget-object v0, v2, Lzx0;->n:Ljava/lang/Object;

    .line 32
    .line 33
    sget-object v3, Lrk;->f:Lrk;

    .line 34
    .line 35
    iget v4, v2, Lzx0;->p:I

    .line 36
    .line 37
    const/4 v5, 0x3

    .line 38
    const/4 v6, 0x0

    .line 39
    const/4 v7, 0x0

    .line 40
    const/4 v8, 0x2

    .line 41
    const/4 v9, 0x1

    .line 42
    if-eqz v4, :cond_4

    .line 43
    .line 44
    if-eq v4, v9, :cond_3

    .line 45
    .line 46
    if-eq v4, v8, :cond_2

    .line 47
    .line 48
    if-ne v4, v5, :cond_1

    .line 49
    .line 50
    iget-object v4, v2, Lzx0;->m:Ljava/lang/Object;

    .line 51
    .line 52
    iget-object v10, v2, Lzx0;->l:Lw30;

    .line 53
    .line 54
    iget-object v11, v2, Lzx0;->k:Lby0;

    .line 55
    .line 56
    iget-object v12, v2, Lzx0;->j:Lav;

    .line 57
    .line 58
    iget-object v13, v2, Lzx0;->i:Lay0;

    .line 59
    .line 60
    :try_start_0
    invoke-static {v0}, Lbd2;->x(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 61
    .line 62
    .line 63
    move-object v0, v4

    .line 64
    goto/16 :goto_b

    .line 65
    .line 66
    :catchall_0
    move-exception v0

    .line 67
    goto/16 :goto_c

    .line 68
    .line 69
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 70
    .line 71
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 72
    .line 73
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    throw v0

    .line 77
    :cond_2
    iget-object v4, v2, Lzx0;->m:Ljava/lang/Object;

    .line 78
    .line 79
    iget-object v10, v2, Lzx0;->l:Lw30;

    .line 80
    .line 81
    iget-object v11, v2, Lzx0;->k:Lby0;

    .line 82
    .line 83
    iget-object v12, v2, Lzx0;->j:Lav;

    .line 84
    .line 85
    iget-object v13, v2, Lzx0;->i:Lay0;

    .line 86
    .line 87
    :try_start_1
    invoke-static {v0}, Lbd2;->x(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 88
    .line 89
    .line 90
    goto/16 :goto_7

    .line 91
    .line 92
    :cond_3
    iget-object v11, v2, Lzx0;->k:Lby0;

    .line 93
    .line 94
    iget-object v4, v2, Lzx0;->j:Lav;

    .line 95
    .line 96
    iget-object v13, v2, Lzx0;->i:Lay0;

    .line 97
    .line 98
    :try_start_2
    invoke-static {v0}, Lbd2;->x(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 99
    .line 100
    .line 101
    goto :goto_3

    .line 102
    :cond_4
    invoke-static {v0}, Lbd2;->x(Ljava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    monitor-enter p0

    .line 106
    :try_start_3
    iget-object v0, v1, Lm0;->h:Ljava/lang/Object;

    .line 107
    .line 108
    check-cast v0, [Lby0;

    .line 109
    .line 110
    if-nez v0, :cond_5

    .line 111
    .line 112
    new-array v0, v8, [Lby0;

    .line 113
    .line 114
    iput-object v0, v1, Lm0;->h:Ljava/lang/Object;

    .line 115
    .line 116
    goto :goto_1

    .line 117
    :catchall_1
    move-exception v0

    .line 118
    goto/16 :goto_f

    .line 119
    .line 120
    :cond_5
    iget v4, v1, Lm0;->f:I

    .line 121
    .line 122
    array-length v10, v0

    .line 123
    if-lt v4, v10, :cond_6

    .line 124
    .line 125
    array-length v4, v0

    .line 126
    mul-int/2addr v4, v8

    .line 127
    invoke-static {v0, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    const-string v4, "copyOf(...)"

    .line 132
    .line 133
    invoke-static {v0, v4}, Li30;->l(Ljava/lang/Object;Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    move-object v4, v0

    .line 137
    check-cast v4, [Lby0;

    .line 138
    .line 139
    iput-object v4, v1, Lm0;->h:Ljava/lang/Object;

    .line 140
    .line 141
    check-cast v0, [Lby0;

    .line 142
    .line 143
    :cond_6
    :goto_1
    iget v4, v1, Lm0;->g:I

    .line 144
    .line 145
    :goto_2
    aget-object v10, v0, v4

    .line 146
    .line 147
    if-nez v10, :cond_7

    .line 148
    .line 149
    new-instance v10, Lby0;

    .line 150
    .line 151
    invoke-direct {v10}, Lby0;-><init>()V

    .line 152
    .line 153
    .line 154
    aput-object v10, v0, v4

    .line 155
    .line 156
    :cond_7
    add-int/lit8 v4, v4, 0x1

    .line 157
    .line 158
    array-length v11, v0

    .line 159
    if-lt v4, v11, :cond_8

    .line 160
    .line 161
    move v4, v7

    .line 162
    :cond_8
    iget-object v11, v10, Lby0;->a:Ljava/util/concurrent/atomic/AtomicReference;

    .line 163
    .line 164
    invoke-virtual {v11}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v12

    .line 168
    if-eqz v12, :cond_9

    .line 169
    .line 170
    goto :goto_2

    .line 171
    :cond_9
    sget-object v0, Lgi2;->c:Lgs3;

    .line 172
    .line 173
    invoke-virtual {v11, v0}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 174
    .line 175
    .line 176
    iput v4, v1, Lm0;->g:I

    .line 177
    .line 178
    iget v0, v1, Lm0;->f:I

    .line 179
    .line 180
    add-int/2addr v0, v9

    .line 181
    iput v0, v1, Lm0;->f:I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 182
    .line 183
    monitor-exit p0

    .line 184
    move-object/from16 v4, p1

    .line 185
    .line 186
    move-object v13, v1

    .line 187
    move-object v11, v10

    .line 188
    :goto_3
    :try_start_4
    iget-object v0, v2, Lqj;->g:Lhk;

    .line 189
    .line 190
    invoke-static {v0}, Li30;->j(Ljava/lang/Object;)V

    .line 191
    .line 192
    .line 193
    sget-object v10, Lfr;->j:Lfr;

    .line 194
    .line 195
    invoke-interface {v0, v10}, Lhk;->h(Lgk;)Lfk;

    .line 196
    .line 197
    .line 198
    move-result-object v0

    .line 199
    check-cast v0, Lw30;

    .line 200
    .line 201
    move-object v10, v0

    .line 202
    move-object v12, v4

    .line 203
    move-object v0, v6

    .line 204
    :goto_4
    sget-object v4, Lay0;->j:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 205
    .line 206
    invoke-virtual {v4, v13}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object v4

    .line 210
    if-eqz v10, :cond_b

    .line 211
    .line 212
    invoke-interface {v10}, Lw30;->a()Z

    .line 213
    .line 214
    .line 215
    move-result v14

    .line 216
    if-eqz v14, :cond_a

    .line 217
    .line 218
    goto :goto_5

    .line 219
    :cond_a
    check-cast v10, Lg40;

    .line 220
    .line 221
    invoke-virtual {v10}, Lg40;->v()Ljava/util/concurrent/CancellationException;

    .line 222
    .line 223
    .line 224
    move-result-object v0

    .line 225
    throw v0

    .line 226
    :cond_b
    :goto_5
    if-eqz v0, :cond_c

    .line 227
    .line 228
    invoke-virtual {v0, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 229
    .line 230
    .line 231
    move-result v14

    .line 232
    if-nez v14, :cond_f

    .line 233
    .line 234
    :cond_c
    sget-object v0, Lyc0;->b:Lgs3;

    .line 235
    .line 236
    if-ne v4, v0, :cond_d

    .line 237
    .line 238
    move-object v0, v6

    .line 239
    goto :goto_6

    .line 240
    :cond_d
    move-object v0, v4

    .line 241
    :goto_6
    iput-object v13, v2, Lzx0;->i:Lay0;

    .line 242
    .line 243
    iput-object v12, v2, Lzx0;->j:Lav;

    .line 244
    .line 245
    iput-object v11, v2, Lzx0;->k:Lby0;

    .line 246
    .line 247
    iput-object v10, v2, Lzx0;->l:Lw30;

    .line 248
    .line 249
    iput-object v4, v2, Lzx0;->m:Ljava/lang/Object;

    .line 250
    .line 251
    iput v8, v2, Lzx0;->p:I

    .line 252
    .line 253
    invoke-interface {v12, v0, v2}, Lav;->d(Ljava/lang/Object;Lqj;)Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    move-result-object v0

    .line 257
    if-ne v0, v3, :cond_e

    .line 258
    .line 259
    goto :goto_a

    .line 260
    :cond_e
    :goto_7
    move-object v0, v4

    .line 261
    :cond_f
    iget-object v4, v11, Lby0;->a:Ljava/util/concurrent/atomic/AtomicReference;

    .line 262
    .line 263
    sget-object v14, Lgi2;->c:Lgs3;

    .line 264
    .line 265
    invoke-virtual {v4, v14}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    .line 266
    .line 267
    .line 268
    move-result-object v4

    .line 269
    invoke-static {v4}, Li30;->j(Ljava/lang/Object;)V

    .line 270
    .line 271
    .line 272
    sget-object v15, Lgi2;->d:Lgs3;

    .line 273
    .line 274
    if-ne v4, v15, :cond_10

    .line 275
    .line 276
    goto :goto_4

    .line 277
    :cond_10
    iput-object v13, v2, Lzx0;->i:Lay0;

    .line 278
    .line 279
    iput-object v12, v2, Lzx0;->j:Lav;

    .line 280
    .line 281
    iput-object v11, v2, Lzx0;->k:Lby0;

    .line 282
    .line 283
    iput-object v10, v2, Lzx0;->l:Lw30;

    .line 284
    .line 285
    iput-object v0, v2, Lzx0;->m:Ljava/lang/Object;

    .line 286
    .line 287
    iput v5, v2, Lzx0;->p:I

    .line 288
    .line 289
    sget-object v4, Lz31;->a:Lz31;

    .line 290
    .line 291
    new-instance v15, Lkd;

    .line 292
    .line 293
    invoke-static {v2}, Luk2;->r(Loj;)Loj;

    .line 294
    .line 295
    .line 296
    move-result-object v5

    .line 297
    invoke-direct {v15, v9, v5}, Lkd;-><init>(ILoj;)V

    .line 298
    .line 299
    .line 300
    invoke-virtual {v15}, Lkd;->u()V

    .line 301
    .line 302
    .line 303
    iget-object v5, v11, Lby0;->a:Ljava/util/concurrent/atomic/AtomicReference;

    .line 304
    .line 305
    :goto_8
    invoke-virtual {v5, v14, v15}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 306
    .line 307
    .line 308
    move-result v16

    .line 309
    if-eqz v16, :cond_11

    .line 310
    .line 311
    goto :goto_9

    .line 312
    :cond_11
    invoke-virtual {v5}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 313
    .line 314
    .line 315
    move-result-object v8

    .line 316
    if-eq v8, v14, :cond_14

    .line 317
    .line 318
    invoke-virtual {v15, v4}, Lkd;->e(Ljava/lang/Object;)V

    .line 319
    .line 320
    .line 321
    :goto_9
    invoke-virtual {v15}, Lkd;->t()Ljava/lang/Object;

    .line 322
    .line 323
    .line 324
    move-result-object v5

    .line 325
    sget-object v8, Lrk;->f:Lrk;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 326
    .line 327
    if-ne v5, v8, :cond_12

    .line 328
    .line 329
    move-object v4, v5

    .line 330
    :cond_12
    if-ne v4, v3, :cond_13

    .line 331
    .line 332
    :goto_a
    return-object v3

    .line 333
    :cond_13
    :goto_b
    const/4 v5, 0x3

    .line 334
    const/4 v8, 0x2

    .line 335
    goto/16 :goto_4

    .line 336
    .line 337
    :cond_14
    const/4 v8, 0x2

    .line 338
    goto :goto_8

    .line 339
    :goto_c
    monitor-enter v13

    .line 340
    :try_start_5
    iget v2, v13, Lm0;->f:I

    .line 341
    .line 342
    add-int/lit8 v2, v2, -0x1

    .line 343
    .line 344
    iput v2, v13, Lm0;->f:I

    .line 345
    .line 346
    if-nez v2, :cond_15

    .line 347
    .line 348
    iput v7, v13, Lm0;->g:I

    .line 349
    .line 350
    goto :goto_d

    .line 351
    :catchall_2
    move-exception v0

    .line 352
    goto :goto_e

    .line 353
    :cond_15
    :goto_d
    const-string v2, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>"

    .line 354
    .line 355
    invoke-static {v11, v2}, Li30;->k(Ljava/lang/Object;Ljava/lang/String;)V

    .line 356
    .line 357
    .line 358
    iget-object v2, v11, Lby0;->a:Ljava/util/concurrent/atomic/AtomicReference;

    .line 359
    .line 360
    invoke-virtual {v2, v6}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 361
    .line 362
    .line 363
    monitor-exit v13

    .line 364
    throw v0

    .line 365
    :goto_e
    monitor-exit v13

    .line 366
    throw v0

    .line 367
    :goto_f
    monitor-exit p0

    .line 368
    throw v0
.end method

.method public final d(Ljava/lang/Object;Lqj;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lay0;->F(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    sget-object p1, Lz31;->a:Lz31;

    .line 5
    .line 6
    return-object p1
.end method
