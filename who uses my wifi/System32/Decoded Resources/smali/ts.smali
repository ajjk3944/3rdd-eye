.class public final Lts;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public a:I

.field public b:I

.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0xa

    new-array v1, v0, [J

    iput-object v1, p0, Lts;->c:Ljava/lang/Object;

    new-array v0, v0, [Ljava/lang/Object;

    iput-object v0, p0, Lts;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(ILjava/util/ArrayList;ILxo1;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lts;->a:I

    iput-object p2, p0, Lts;->c:Ljava/lang/Object;

    iput p3, p0, Lts;->b:I

    iput-object p4, p0, Lts;->d:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a()Lpi1;
    .locals 13

    .line 1
    iget-object v0, p0, Lts;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lvh2;

    .line 4
    .line 5
    iget v1, v0, Lvh2;->i:I

    .line 6
    .line 7
    const/16 v2, 0x8

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    const/4 v4, 0x1

    .line 11
    if-ne v1, v2, :cond_0

    .line 12
    .line 13
    move v2, v4

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move v2, v3

    .line 16
    :goto_0
    iget-object v5, p0, Lts;->c:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v5, Ljr3;

    .line 19
    .line 20
    iget-object v6, v5, Ljr3;->i:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v6, Lmo1;

    .line 23
    .line 24
    iget-object v6, v6, Lmo1;->b:Landroid/content/SharedPreferences;

    .line 25
    .line 26
    invoke-interface {v6}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 27
    .line 28
    .line 29
    move-result-object v6

    .line 30
    const-string v7, "is_pub_misconfigured"

    .line 31
    .line 32
    invoke-interface {v6, v7, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    invoke-interface {v2}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 37
    .line 38
    .line 39
    add-int/lit8 v2, v1, -0x1

    .line 40
    .line 41
    const/4 v6, 0x0

    .line 42
    if-eqz v1, :cond_b

    .line 43
    .line 44
    const/4 v1, 0x3

    .line 45
    const-string v7, "Invalid response from server."

    .line 46
    .line 47
    const/4 v8, 0x2

    .line 48
    packed-switch v2, :pswitch_data_0

    .line 49
    .line 50
    .line 51
    new-instance v0, Lah3;

    .line 52
    .line 53
    invoke-direct {v0, v7, v4}, Lah3;-><init>(Ljava/lang/String;I)V

    .line 54
    .line 55
    .line 56
    throw v0

    .line 57
    :pswitch_0
    new-instance v2, Lah3;

    .line 58
    .line 59
    iget-object v0, v0, Lvh2;->h:Ljava/lang/String;

    .line 60
    .line 61
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    const-string v3, "Publisher misconfiguration: "

    .line 66
    .line 67
    invoke-virtual {v3, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    invoke-direct {v2, v0, v1}, Lah3;-><init>(Ljava/lang/String;I)V

    .line 72
    .line 73
    .line 74
    throw v2

    .line 75
    :pswitch_1
    new-instance v1, Lah3;

    .line 76
    .line 77
    iget-object v0, v0, Lvh2;->h:Ljava/lang/String;

    .line 78
    .line 79
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    const-string v2, "Invalid response from server: "

    .line 84
    .line 85
    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    invoke-direct {v1, v0, v4}, Lah3;-><init>(Ljava/lang/String;I)V

    .line 90
    .line 91
    .line 92
    throw v1

    .line 93
    :pswitch_2
    iput v4, p0, Lts;->a:I

    .line 94
    .line 95
    goto :goto_1

    .line 96
    :pswitch_3
    iput v8, p0, Lts;->a:I

    .line 97
    .line 98
    goto :goto_1

    .line 99
    :pswitch_4
    iput v1, p0, Lts;->a:I

    .line 100
    .line 101
    :goto_1
    iget v2, v0, Lvh2;->j:I

    .line 102
    .line 103
    add-int/lit8 v9, v2, -0x1

    .line 104
    .line 105
    if-eqz v2, :cond_a

    .line 106
    .line 107
    if-eq v9, v4, :cond_2

    .line 108
    .line 109
    if-ne v9, v8, :cond_1

    .line 110
    .line 111
    iput v8, p0, Lts;->b:I

    .line 112
    .line 113
    goto :goto_2

    .line 114
    :cond_1
    new-instance v0, Lah3;

    .line 115
    .line 116
    invoke-direct {v0, v7, v4}, Lah3;-><init>(Ljava/lang/String;I)V

    .line 117
    .line 118
    .line 119
    throw v0

    .line 120
    :cond_2
    iput v1, p0, Lts;->b:I

    .line 121
    .line 122
    :goto_2
    iget-object v1, v0, Lvh2;->f:Ljava/lang/String;

    .line 123
    .line 124
    if-nez v1, :cond_3

    .line 125
    .line 126
    move-object v2, v6

    .line 127
    goto :goto_3

    .line 128
    :cond_3
    new-instance v2, Lz52;

    .line 129
    .line 130
    iget-object v7, v0, Lvh2;->g:Ljava/lang/String;

    .line 131
    .line 132
    invoke-direct {v2, v7, v1}, Lz52;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    :goto_3
    iget-object v1, v5, Ljr3;->i:Ljava/lang/Object;

    .line 136
    .line 137
    check-cast v1, Lmo1;

    .line 138
    .line 139
    new-instance v7, Ljava/util/HashSet;

    .line 140
    .line 141
    iget-object v9, v0, Lvh2;->k:Ljava/lang/Object;

    .line 142
    .line 143
    check-cast v9, Ljava/util/List;

    .line 144
    .line 145
    invoke-direct {v7, v9}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 146
    .line 147
    .line 148
    iget-object v1, v1, Lmo1;->b:Landroid/content/SharedPreferences;

    .line 149
    .line 150
    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 151
    .line 152
    .line 153
    move-result-object v1

    .line 154
    const-string v9, "stored_info"

    .line 155
    .line 156
    invoke-interface {v1, v9, v7}, Landroid/content/SharedPreferences$Editor;->putStringSet(Ljava/lang/String;Ljava/util/Set;)Landroid/content/SharedPreferences$Editor;

    .line 157
    .line 158
    .line 159
    move-result-object v1

    .line 160
    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 161
    .line 162
    .line 163
    iget-object v0, v0, Lvh2;->l:Ljava/lang/Object;

    .line 164
    .line 165
    check-cast v0, Ljava/util/List;

    .line 166
    .line 167
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 168
    .line 169
    .line 170
    move-result-object v0

    .line 171
    :cond_4
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 172
    .line 173
    .line 174
    move-result v1

    .line 175
    if-eqz v1, :cond_9

    .line 176
    .line 177
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v1

    .line 181
    check-cast v1, Ljh2;

    .line 182
    .line 183
    iget v7, v1, Ljh2;->b:I

    .line 184
    .line 185
    add-int/lit8 v9, v7, -0x1

    .line 186
    .line 187
    if-eqz v7, :cond_8

    .line 188
    .line 189
    if-eqz v9, :cond_5

    .line 190
    .line 191
    if-eq v9, v4, :cond_7

    .line 192
    .line 193
    if-eq v9, v8, :cond_6

    .line 194
    .line 195
    :cond_5
    move-object v7, v6

    .line 196
    goto :goto_5

    .line 197
    :cond_6
    const-string v7, "clear"

    .line 198
    .line 199
    goto :goto_5

    .line 200
    :cond_7
    const-string v7, "write"

    .line 201
    .line 202
    :goto_5
    if-eqz v7, :cond_4

    .line 203
    .line 204
    iget-object v9, v5, Ljr3;->g:Ljava/lang/Object;

    .line 205
    .line 206
    check-cast v9, Llx2;

    .line 207
    .line 208
    iget-object v1, v1, Ljh2;->a:Ljava/lang/String;

    .line 209
    .line 210
    iget-object v10, v5, Ljr3;->h:Ljava/lang/Object;

    .line 211
    .line 212
    check-cast v10, Lp21;

    .line 213
    .line 214
    new-array v11, v4, [Lln2;

    .line 215
    .line 216
    aput-object v10, v11, v3

    .line 217
    .line 218
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 219
    .line 220
    .line 221
    new-instance v10, Lgi;

    .line 222
    .line 223
    const/16 v12, 0xe

    .line 224
    .line 225
    invoke-direct {v10, v7, v1, v11, v12}, Lgi;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 226
    .line 227
    .line 228
    iget-object v1, v9, Llx2;->a:Ljava/util/concurrent/Executor;

    .line 229
    .line 230
    invoke-interface {v1, v10}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 231
    .line 232
    .line 233
    goto :goto_4

    .line 234
    :cond_8
    throw v6

    .line 235
    :cond_9
    new-instance v0, Lpi1;

    .line 236
    .line 237
    iget v1, p0, Lts;->a:I

    .line 238
    .line 239
    iget v3, p0, Lts;->b:I

    .line 240
    .line 241
    invoke-direct {v0, v1, v2, v3}, Lpi1;-><init>(ILjava/lang/Object;I)V

    .line 242
    .line 243
    .line 244
    return-object v0

    .line 245
    :cond_a
    throw v6

    .line 246
    :cond_b
    throw v6

    .line 247
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public declared-synchronized b(JLjava/lang/Object;)V
    .locals 6

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget v0, p0, Lts;->b:I

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    if-lez v0, :cond_0

    .line 6
    .line 7
    iget v2, p0, Lts;->a:I

    .line 8
    .line 9
    add-int/2addr v2, v0

    .line 10
    iget-object v0, p0, Lts;->d:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, [Ljava/lang/Object;

    .line 13
    .line 14
    add-int/lit8 v2, v2, -0x1

    .line 15
    .line 16
    array-length v0, v0

    .line 17
    rem-int/2addr v2, v0

    .line 18
    iget-object v0, p0, Lts;->c:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, [J

    .line 21
    .line 22
    aget-wide v2, v0, v2

    .line 23
    .line 24
    cmp-long v0, p1, v2

    .line 25
    .line 26
    if-gtz v0, :cond_0

    .line 27
    .line 28
    monitor-enter p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 29
    :try_start_1
    iput v1, p0, Lts;->a:I

    .line 30
    .line 31
    iput v1, p0, Lts;->b:I

    .line 32
    .line 33
    iget-object v0, p0, Lts;->d:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v0, [Ljava/lang/Object;

    .line 36
    .line 37
    const/4 v2, 0x0

    .line 38
    invoke-static {v0, v2}, Ljava/util/Arrays;->fill([Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 39
    .line 40
    .line 41
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 42
    goto :goto_0

    .line 43
    :catchall_0
    move-exception p1

    .line 44
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 45
    :try_start_4
    throw p1

    .line 46
    :catchall_1
    move-exception p1

    .line 47
    goto :goto_2

    .line 48
    :cond_0
    :goto_0
    iget-object v0, p0, Lts;->d:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v0, [Ljava/lang/Object;

    .line 51
    .line 52
    array-length v0, v0

    .line 53
    iget v2, p0, Lts;->b:I

    .line 54
    .line 55
    if-ge v2, v0, :cond_1

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_1
    add-int v2, v0, v0

    .line 59
    .line 60
    new-array v3, v2, [J

    .line 61
    .line 62
    new-array v2, v2, [Ljava/lang/Object;

    .line 63
    .line 64
    iget v4, p0, Lts;->a:I

    .line 65
    .line 66
    sub-int/2addr v0, v4

    .line 67
    iget-object v5, p0, Lts;->c:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v5, [J

    .line 70
    .line 71
    invoke-static {v5, v4, v3, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 72
    .line 73
    .line 74
    iget-object v4, p0, Lts;->d:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast v4, [Ljava/lang/Object;

    .line 77
    .line 78
    iget v5, p0, Lts;->a:I

    .line 79
    .line 80
    invoke-static {v4, v5, v2, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 81
    .line 82
    .line 83
    iget v4, p0, Lts;->a:I

    .line 84
    .line 85
    if-lez v4, :cond_2

    .line 86
    .line 87
    iget-object v5, p0, Lts;->c:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast v5, [J

    .line 90
    .line 91
    invoke-static {v5, v1, v3, v0, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 92
    .line 93
    .line 94
    iget-object v4, p0, Lts;->d:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v4, [Ljava/lang/Object;

    .line 97
    .line 98
    iget v5, p0, Lts;->a:I

    .line 99
    .line 100
    invoke-static {v4, v1, v2, v0, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 101
    .line 102
    .line 103
    :cond_2
    iput-object v3, p0, Lts;->c:Ljava/lang/Object;

    .line 104
    .line 105
    iput-object v2, p0, Lts;->d:Ljava/lang/Object;

    .line 106
    .line 107
    iput v1, p0, Lts;->a:I

    .line 108
    .line 109
    :goto_1
    iget v0, p0, Lts;->a:I

    .line 110
    .line 111
    iget v1, p0, Lts;->b:I

    .line 112
    .line 113
    add-int/2addr v0, v1

    .line 114
    iget-object v2, p0, Lts;->d:Ljava/lang/Object;

    .line 115
    .line 116
    check-cast v2, [Ljava/lang/Object;

    .line 117
    .line 118
    array-length v3, v2

    .line 119
    rem-int/2addr v0, v3

    .line 120
    iget-object v3, p0, Lts;->c:Ljava/lang/Object;

    .line 121
    .line 122
    check-cast v3, [J

    .line 123
    .line 124
    aput-wide p1, v3, v0

    .line 125
    .line 126
    aput-object p3, v2, v0

    .line 127
    .line 128
    add-int/lit8 v1, v1, 0x1

    .line 129
    .line 130
    iput v1, p0, Lts;->b:I
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 131
    .line 132
    monitor-exit p0

    .line 133
    return-void

    .line 134
    :goto_2
    :try_start_5
    monitor-exit p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 135
    throw p1
.end method

.method public declared-synchronized c()I
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget v0, p0, Lts;->b:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    monitor-exit p0

    .line 5
    return v0

    .line 6
    :catchall_0
    move-exception v0

    .line 7
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 8
    throw v0
.end method

.method public declared-synchronized d()Ljava/lang/Object;
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget v0, p0, Lts;->b:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    monitor-exit p0

    .line 7
    const/4 v0, 0x0

    .line 8
    return-object v0

    .line 9
    :cond_0
    :try_start_1
    invoke-virtual {p0}, Lts;->f()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 13
    monitor-exit p0

    .line 14
    return-object v0

    .line 15
    :catchall_0
    move-exception v0

    .line 16
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 17
    throw v0
.end method

.method public declared-synchronized e(J)Ljava/lang/Object;
    .locals 5

    .line 1
    monitor-enter p0

    .line 2
    const/4 v0, 0x0

    .line 3
    :goto_0
    :try_start_0
    iget v1, p0, Lts;->b:I

    .line 4
    .line 5
    if-lez v1, :cond_1

    .line 6
    .line 7
    iget-object v1, p0, Lts;->c:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, [J

    .line 10
    .line 11
    iget v2, p0, Lts;->a:I

    .line 12
    .line 13
    aget-wide v2, v1, v2

    .line 14
    .line 15
    sub-long v1, p1, v2

    .line 16
    .line 17
    const-wide/16 v3, 0x0

    .line 18
    .line 19
    cmp-long v1, v1, v3

    .line 20
    .line 21
    if-gez v1, :cond_0

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_0
    invoke-virtual {p0}, Lts;->f()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    goto :goto_0

    .line 29
    :catchall_0
    move-exception p1

    .line 30
    goto :goto_2

    .line 31
    :cond_1
    :goto_1
    monitor-exit p0

    .line 32
    return-object v0

    .line 33
    :goto_2
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 34
    throw p1
.end method

.method public f()Ljava/lang/Object;
    .locals 5

    .line 1
    iget v0, p0, Lts;->b:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-lez v0, :cond_0

    .line 5
    .line 6
    move v0, v1

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    :goto_0
    invoke-static {v0}, Lzt0;->b0(Z)V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lts;->d:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, [Ljava/lang/Object;

    .line 15
    .line 16
    iget v2, p0, Lts;->a:I

    .line 17
    .line 18
    aget-object v3, v0, v2

    .line 19
    .line 20
    const/4 v4, 0x0

    .line 21
    aput-object v4, v0, v2

    .line 22
    .line 23
    add-int/2addr v2, v1

    .line 24
    array-length v0, v0

    .line 25
    rem-int/2addr v2, v0

    .line 26
    iput v2, p0, Lts;->a:I

    .line 27
    .line 28
    iget v0, p0, Lts;->b:I

    .line 29
    .line 30
    add-int/lit8 v0, v0, -0x1

    .line 31
    .line 32
    iput v0, p0, Lts;->b:I

    .line 33
    .line 34
    return-object v3
.end method
