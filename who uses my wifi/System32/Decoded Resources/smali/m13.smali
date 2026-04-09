.class public final Lm13;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Liq3;


# instance fields
.field public final synthetic f:J

.field public final synthetic g:Lc83;

.field public final synthetic h:La83;

.field public final synthetic i:Ljava/lang/String;

.field public final synthetic j:Ldb3;

.field public final synthetic k:Lh83;

.field public final synthetic l:Lo13;


# direct methods
.method public constructor <init>(Lo13;JLc83;La83;Ljava/lang/String;Ldb3;Lh83;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p2, p0, Lm13;->f:J

    .line 5
    .line 6
    iput-object p4, p0, Lm13;->g:Lc83;

    .line 7
    .line 8
    iput-object p5, p0, Lm13;->h:La83;

    .line 9
    .line 10
    iput-object p6, p0, Lm13;->i:Ljava/lang/String;

    .line 11
    .line 12
    iput-object p7, p0, Lm13;->j:Ldb3;

    .line 13
    .line 14
    iput-object p8, p0, Lm13;->k:Lh83;

    .line 15
    .line 16
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, Lm13;->l:Lo13;

    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final p(Ljava/lang/Object;)V
    .locals 11

    .line 1
    iget-object p1, p0, Lm13;->l:Lo13;

    .line 2
    .line 3
    iget-object v0, p1, Lo13;->a:Lym;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 9
    .line 10
    .line 11
    move-result-wide v0

    .line 12
    iget-wide v2, p0, Lm13;->f:J

    .line 13
    .line 14
    sub-long v6, v0, v2

    .line 15
    .line 16
    monitor-enter p1

    .line 17
    :try_start_0
    iget-boolean v0, p1, Lo13;->e:Z

    .line 18
    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    iget-object v4, p1, Lo13;->b:Lt83;

    .line 22
    .line 23
    iget-object v5, p0, Lm13;->g:Lc83;

    .line 24
    .line 25
    move-wide v8, v6

    .line 26
    iget-object v6, p0, Lm13;->h:La83;

    .line 27
    .line 28
    const/4 v7, 0x0

    .line 29
    move-wide v9, v8

    .line 30
    const/4 v8, 0x0

    .line 31
    invoke-virtual/range {v4 .. v10}, Lt83;->V(Lc83;La83;ILd03;J)V

    .line 32
    .line 33
    .line 34
    move-wide v8, v9

    .line 35
    goto :goto_0

    .line 36
    :catchall_0
    move-exception v0

    .line 37
    goto :goto_3

    .line 38
    :cond_0
    move-wide v8, v6

    .line 39
    :goto_0
    iget-boolean v0, p1, Lo13;->g:Z

    .line 40
    .line 41
    if-eqz v0, :cond_1

    .line 42
    .line 43
    monitor-exit p1

    .line 44
    return-void

    .line 45
    :cond_1
    iget-object v0, p0, Lm13;->h:La83;

    .line 46
    .line 47
    monitor-enter p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 48
    :try_start_1
    iget-object v1, p1, Lo13;->d:Ljava/util/LinkedHashMap;

    .line 49
    .line 50
    invoke-virtual {v1, v0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    check-cast v1, Ln13;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 55
    .line 56
    if-nez v1, :cond_3

    .line 57
    .line 58
    :cond_2
    :try_start_2
    monitor-exit p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 59
    goto :goto_1

    .line 60
    :cond_3
    :try_start_3
    iget v1, v1, Ln13;->c:I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 61
    .line 62
    const/16 v2, 0x8

    .line 63
    .line 64
    if-ne v1, v2, :cond_2

    .line 65
    .line 66
    :try_start_4
    monitor-exit p1

    .line 67
    iget-object v1, p1, Lo13;->d:Ljava/util/LinkedHashMap;

    .line 68
    .line 69
    invoke-virtual {v1, v0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    check-cast v1, Ln13;

    .line 74
    .line 75
    iput-wide v8, v1, Ln13;->d:J

    .line 76
    .line 77
    goto :goto_2

    .line 78
    :goto_1
    iget-object v1, p1, Lo13;->d:Ljava/util/LinkedHashMap;

    .line 79
    .line 80
    new-instance v4, Ln13;

    .line 81
    .line 82
    iget-object v5, p0, Lm13;->i:Ljava/lang/String;

    .line 83
    .line 84
    iget-object v6, v0, La83;->f0:Ljava/lang/String;

    .line 85
    .line 86
    const/4 v7, 0x0

    .line 87
    const/4 v10, 0x0

    .line 88
    invoke-direct/range {v4 .. v10}, Ln13;-><init>(Ljava/lang/String;Ljava/lang/String;IJLjava/lang/Integer;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v1, v0, v4}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    :goto_2
    iget-object v4, p1, Lo13;->f:Le03;

    .line 95
    .line 96
    move-wide v9, v8

    .line 97
    const/4 v8, 0x0

    .line 98
    move-wide v6, v9

    .line 99
    const/4 v9, 0x1

    .line 100
    move-object v5, v0

    .line 101
    invoke-virtual/range {v4 .. v9}, Le03;->c(La83;JLnx2;Z)V

    .line 102
    .line 103
    .line 104
    monitor-exit p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 105
    return-void

    .line 106
    :catchall_1
    move-exception v0

    .line 107
    :try_start_5
    monitor-exit p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 108
    :try_start_6
    throw v0

    .line 109
    :goto_3
    monitor-exit p1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 110
    throw v0
.end method

.method public final s(Ljava/lang/Throwable;)V
    .locals 13

    .line 1
    iget-object v1, p0, Lm13;->l:Lo13;

    .line 2
    .line 3
    iget-object v0, v1, Lo13;->a:Lym;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 9
    .line 10
    .line 11
    move-result-wide v2

    .line 12
    iget-wide v4, p0, Lm13;->f:J

    .line 13
    .line 14
    sub-long v8, v2, v4

    .line 15
    .line 16
    instance-of v0, p1, Ljava/util/concurrent/TimeoutException;

    .line 17
    .line 18
    const/4 v2, 0x3

    .line 19
    const/4 v3, 0x0

    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    const/4 v0, 0x2

    .line 23
    :cond_0
    :goto_0
    move-object v4, v3

    .line 24
    goto :goto_2

    .line 25
    :cond_1
    instance-of v0, p1, Lg13;

    .line 26
    .line 27
    if-eqz v0, :cond_2

    .line 28
    .line 29
    move v0, v2

    .line 30
    goto :goto_0

    .line 31
    :cond_2
    instance-of v0, p1, Ljava/util/concurrent/CancellationException;

    .line 32
    .line 33
    if-eqz v0, :cond_3

    .line 34
    .line 35
    const/4 v0, 0x4

    .line 36
    goto :goto_0

    .line 37
    :cond_3
    instance-of v0, p1, Ln83;

    .line 38
    .line 39
    if-eqz v0, :cond_4

    .line 40
    .line 41
    const/4 v0, 0x5

    .line 42
    goto :goto_0

    .line 43
    :cond_4
    instance-of v0, p1, Lhx2;

    .line 44
    .line 45
    const/4 v4, 0x6

    .line 46
    if-eqz v0, :cond_6

    .line 47
    .line 48
    invoke-static {p1}, Lzt0;->A(Ljava/lang/Throwable;)Lnx2;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    iget v0, v0, Lnx2;->f:I

    .line 53
    .line 54
    if-ne v0, v2, :cond_5

    .line 55
    .line 56
    const/4 v0, 0x1

    .line 57
    goto :goto_1

    .line 58
    :cond_5
    move v0, v4

    .line 59
    :goto_1
    sget-object v4, Lmz1;->K1:Liz1;

    .line 60
    .line 61
    sget-object v5, Ltw1;->e:Ltw1;

    .line 62
    .line 63
    iget-object v5, v5, Ltw1;->c:Lkz1;

    .line 64
    .line 65
    invoke-virtual {v5, v4}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v4

    .line 69
    check-cast v4, Ljava/lang/Boolean;

    .line 70
    .line 71
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 72
    .line 73
    .line 74
    move-result v4

    .line 75
    if-eqz v4, :cond_0

    .line 76
    .line 77
    instance-of v4, p1, Ld03;

    .line 78
    .line 79
    if-eqz v4, :cond_0

    .line 80
    .line 81
    move-object v4, p1

    .line 82
    check-cast v4, Ld03;

    .line 83
    .line 84
    iget-object v4, v4, Ld03;->g:Lnx2;

    .line 85
    .line 86
    if-eqz v4, :cond_0

    .line 87
    .line 88
    iget v4, v4, Lnx2;->f:I

    .line 89
    .line 90
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 91
    .line 92
    .line 93
    move-result-object v4

    .line 94
    goto :goto_2

    .line 95
    :cond_6
    move v0, v4

    .line 96
    goto :goto_0

    .line 97
    :goto_2
    monitor-enter v1

    .line 98
    :try_start_0
    iget-boolean v5, v1, Lo13;->e:Z

    .line 99
    .line 100
    if-eqz v5, :cond_8

    .line 101
    .line 102
    iget-object v6, v1, Lo13;->b:Lt83;

    .line 103
    .line 104
    iget-object v7, p0, Lm13;->g:Lc83;

    .line 105
    .line 106
    move-wide v10, v8

    .line 107
    iget-object v8, p0, Lm13;->h:La83;

    .line 108
    .line 109
    instance-of v5, p1, Ld03;

    .line 110
    .line 111
    if-eqz v5, :cond_7

    .line 112
    .line 113
    move-object v3, p1

    .line 114
    check-cast v3, Ld03;

    .line 115
    .line 116
    :cond_7
    move v9, v0

    .line 117
    move-wide v11, v10

    .line 118
    move-object v10, v3

    .line 119
    goto :goto_3

    .line 120
    :catchall_0
    move-exception v0

    .line 121
    move-object p1, v0

    .line 122
    goto/16 :goto_5

    .line 123
    .line 124
    :goto_3
    invoke-virtual/range {v6 .. v12}, Lt83;->V(Lc83;La83;ILd03;J)V

    .line 125
    .line 126
    .line 127
    move-wide v10, v11

    .line 128
    goto :goto_4

    .line 129
    :cond_8
    move-wide v10, v8

    .line 130
    move v9, v0

    .line 131
    :goto_4
    sget-object v0, Lmz1;->Y8:Liz1;

    .line 132
    .line 133
    sget-object v3, Ltw1;->e:Ltw1;

    .line 134
    .line 135
    iget-object v3, v3, Ltw1;->c:Lkz1;

    .line 136
    .line 137
    invoke-virtual {v3, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    check-cast v0, Ljava/lang/Boolean;

    .line 142
    .line 143
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 144
    .line 145
    .line 146
    move-result v0

    .line 147
    if-eqz v0, :cond_9

    .line 148
    .line 149
    iget-object v0, v1, Lo13;->c:Leb3;

    .line 150
    .line 151
    iget-object v3, p0, Lm13;->j:Ldb3;

    .line 152
    .line 153
    iget-object v5, p0, Lm13;->k:Lh83;

    .line 154
    .line 155
    iget-object v6, p0, Lm13;->h:La83;

    .line 156
    .line 157
    iget-object v7, v6, La83;->n:Ljava/util/List;

    .line 158
    .line 159
    invoke-virtual {v3, v5, v6, v7}, Ldb3;->a(Lh83;La83;Ljava/util/List;)Ljava/util/ArrayList;

    .line 160
    .line 161
    .line 162
    move-result-object v3

    .line 163
    iget-object v5, v6, La83;->x0:Lx34;

    .line 164
    .line 165
    invoke-virtual {v0, v3, v5}, Leb3;->a(Ljava/util/List;Lx34;)V

    .line 166
    .line 167
    .line 168
    :cond_9
    iget-boolean v0, v1, Lo13;->g:Z

    .line 169
    .line 170
    if-eqz v0, :cond_a

    .line 171
    .line 172
    monitor-exit v1

    .line 173
    return-void

    .line 174
    :cond_a
    iget-object v0, v1, Lo13;->d:Ljava/util/LinkedHashMap;

    .line 175
    .line 176
    iget-object v3, p0, Lm13;->h:La83;

    .line 177
    .line 178
    new-instance v6, Ln13;

    .line 179
    .line 180
    iget-object v7, p0, Lm13;->i:Ljava/lang/String;

    .line 181
    .line 182
    iget-object v8, v3, La83;->f0:Ljava/lang/String;

    .line 183
    .line 184
    move-object v12, v4

    .line 185
    invoke-direct/range {v6 .. v12}, Ln13;-><init>(Ljava/lang/String;Ljava/lang/String;IJLjava/lang/Integer;)V

    .line 186
    .line 187
    .line 188
    invoke-virtual {v0, v3, v6}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    invoke-static {p1}, Lzt0;->A(Ljava/lang/Throwable;)Lnx2;

    .line 192
    .line 193
    .line 194
    move-result-object p1

    .line 195
    iget v0, p1, Lnx2;->f:I

    .line 196
    .line 197
    if-eq v0, v2, :cond_b

    .line 198
    .line 199
    if-nez v0, :cond_c

    .line 200
    .line 201
    :cond_b
    iget-object v0, p1, Lnx2;->i:Lnx2;

    .line 202
    .line 203
    if-eqz v0, :cond_c

    .line 204
    .line 205
    iget-object v0, v0, Lnx2;->h:Ljava/lang/String;

    .line 206
    .line 207
    const-string v2, "com.google.android.gms.ads"

    .line 208
    .line 209
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 210
    .line 211
    .line 212
    move-result v0

    .line 213
    if-nez v0, :cond_c

    .line 214
    .line 215
    new-instance v0, Ld03;

    .line 216
    .line 217
    iget-object p1, p1, Lnx2;->i:Lnx2;

    .line 218
    .line 219
    const/16 v2, 0xd

    .line 220
    .line 221
    invoke-direct {v0, v2, p1}, Ld03;-><init>(ILnx2;)V

    .line 222
    .line 223
    .line 224
    invoke-static {v0}, Lzt0;->A(Ljava/lang/Throwable;)Lnx2;

    .line 225
    .line 226
    .line 227
    move-result-object p1

    .line 228
    :cond_c
    iget-object v6, v1, Lo13;->f:Le03;

    .line 229
    .line 230
    move-wide v8, v10

    .line 231
    const/4 v11, 0x0

    .line 232
    move-object v10, p1

    .line 233
    move-object v7, v3

    .line 234
    invoke-virtual/range {v6 .. v11}, Le03;->c(La83;JLnx2;Z)V

    .line 235
    .line 236
    .line 237
    monitor-exit v1

    .line 238
    return-void

    .line 239
    :goto_5
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 240
    throw p1
.end method
