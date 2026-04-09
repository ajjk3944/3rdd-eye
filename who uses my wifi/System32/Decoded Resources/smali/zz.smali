.class public final Lzz;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Let0;
.implements Lu91;
.implements Lgt;


# instance fields
.field public final f:Landroid/content/Context;

.field public final g:Lha1;

.field public final h:Lv91;

.field public final i:Ljava/util/HashSet;

.field public final j:Lbo;

.field public k:Z

.field public final l:Ljava/lang/Object;

.field public m:Ljava/lang/Boolean;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "GreedyScheduler"

    .line 2
    .line 3
    invoke-static {v0}, Lh80;->f(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lru0;Lxb4;Lha1;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/HashSet;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lzz;->i:Ljava/util/HashSet;

    .line 10
    .line 11
    iput-object p1, p0, Lzz;->f:Landroid/content/Context;

    .line 12
    .line 13
    iput-object p4, p0, Lzz;->g:Lha1;

    .line 14
    .line 15
    new-instance p4, Lv91;

    .line 16
    .line 17
    invoke-direct {p4, p1, p3, p0}, Lv91;-><init>(Landroid/content/Context;Ll01;Lu91;)V

    .line 18
    .line 19
    .line 20
    iput-object p4, p0, Lzz;->h:Lv91;

    .line 21
    .line 22
    new-instance p1, Lbo;

    .line 23
    .line 24
    iget-object p2, p2, Lru0;->h:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast p2, Lf20;

    .line 27
    .line 28
    invoke-direct {p1, p0, p2}, Lbo;-><init>(Lzz;Lf20;)V

    .line 29
    .line 30
    .line 31
    iput-object p1, p0, Lzz;->j:Lbo;

    .line 32
    .line 33
    new-instance p1, Ljava/lang/Object;

    .line 34
    .line 35
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 36
    .line 37
    .line 38
    iput-object p1, p0, Lzz;->l:Ljava/lang/Object;

    .line 39
    .line 40
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Z)V
    .locals 3

    .line 1
    iget-object p2, p0, Lzz;->l:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter p2

    .line 4
    :try_start_0
    iget-object v0, p0, Lzz;->i:Ljava/util/HashSet;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, Loa1;

    .line 21
    .line 22
    iget-object v2, v1, Loa1;->a:Ljava/lang/String;

    .line 23
    .line 24
    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-eqz v2, :cond_0

    .line 29
    .line 30
    invoke-static {}, Lh80;->d()Lh80;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    const/4 v0, 0x0

    .line 35
    new-array v0, v0, [Ljava/lang/Throwable;

    .line 36
    .line 37
    invoke-virtual {p1, v0}, Lh80;->a([Ljava/lang/Throwable;)V

    .line 38
    .line 39
    .line 40
    iget-object p1, p0, Lzz;->i:Ljava/util/HashSet;

    .line 41
    .line 42
    invoke-virtual {p1, v1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    iget-object p1, p0, Lzz;->h:Lv91;

    .line 46
    .line 47
    iget-object v0, p0, Lzz;->i:Ljava/util/HashSet;

    .line 48
    .line 49
    invoke-virtual {p1, v0}, Lv91;->b(Ljava/util/Collection;)V

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :catchall_0
    move-exception p1

    .line 54
    goto :goto_1

    .line 55
    :cond_1
    :goto_0
    monitor-exit p2

    .line 56
    return-void

    .line 57
    :goto_1
    monitor-exit p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 58
    throw p1
.end method

.method public final b(Ljava/lang/String;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lzz;->m:Ljava/lang/Boolean;

    .line 2
    .line 3
    iget-object v1, p0, Lzz;->g:Lha1;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-object v0, v1, Lha1;->q:Lru0;

    .line 8
    .line 9
    iget-object v2, p0, Lzz;->f:Landroid/content/Context;

    .line 10
    .line 11
    invoke-static {v2, v0}, Lnm0;->a(Landroid/content/Context;Lru0;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iput-object v0, p0, Lzz;->m:Ljava/lang/Boolean;

    .line 20
    .line 21
    :cond_0
    iget-object v0, p0, Lzz;->m:Ljava/lang/Boolean;

    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    const/4 v2, 0x0

    .line 28
    if-nez v0, :cond_1

    .line 29
    .line 30
    invoke-static {}, Lh80;->d()Lh80;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    new-array v0, v2, [Ljava/lang/Throwable;

    .line 35
    .line 36
    invoke-virtual {p1, v0}, Lh80;->e([Ljava/lang/Throwable;)V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :cond_1
    iget-boolean v0, p0, Lzz;->k:Z

    .line 41
    .line 42
    if-nez v0, :cond_2

    .line 43
    .line 44
    iget-object v0, v1, Lha1;->u:Lom0;

    .line 45
    .line 46
    invoke-virtual {v0, p0}, Lom0;->b(Lgt;)V

    .line 47
    .line 48
    .line 49
    const/4 v0, 0x1

    .line 50
    iput-boolean v0, p0, Lzz;->k:Z

    .line 51
    .line 52
    :cond_2
    invoke-static {}, Lh80;->d()Lh80;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    new-array v2, v2, [Ljava/lang/Throwable;

    .line 57
    .line 58
    invoke-virtual {v0, v2}, Lh80;->a([Ljava/lang/Throwable;)V

    .line 59
    .line 60
    .line 61
    iget-object v0, p0, Lzz;->j:Lbo;

    .line 62
    .line 63
    if-eqz v0, :cond_3

    .line 64
    .line 65
    iget-object v2, v0, Lbo;->c:Ljava/util/HashMap;

    .line 66
    .line 67
    invoke-virtual {v2, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    check-cast v2, Ljava/lang/Runnable;

    .line 72
    .line 73
    if-eqz v2, :cond_3

    .line 74
    .line 75
    iget-object v0, v0, Lbo;->b:Lf20;

    .line 76
    .line 77
    iget-object v0, v0, Lf20;->g:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast v0, Landroid/os/Handler;

    .line 80
    .line 81
    invoke-virtual {v0, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 82
    .line 83
    .line 84
    :cond_3
    invoke-virtual {v1, p1}, Lha1;->o0(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    return-void
.end method

.method public final c(Ljava/util/ArrayList;)V
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    move v2, v1

    .line 7
    :goto_0
    if-ge v2, v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    add-int/lit8 v2, v2, 0x1

    .line 14
    .line 15
    check-cast v3, Ljava/lang/String;

    .line 16
    .line 17
    invoke-static {}, Lh80;->d()Lh80;

    .line 18
    .line 19
    .line 20
    move-result-object v4

    .line 21
    new-array v5, v1, [Ljava/lang/Throwable;

    .line 22
    .line 23
    invoke-virtual {v4, v5}, Lh80;->a([Ljava/lang/Throwable;)V

    .line 24
    .line 25
    .line 26
    iget-object v4, p0, Lzz;->g:Lha1;

    .line 27
    .line 28
    invoke-virtual {v4, v3}, Lha1;->o0(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    return-void
.end method

.method public final varargs d([Loa1;)V
    .locals 13

    .line 1
    iget-object v0, p0, Lzz;->m:Ljava/lang/Boolean;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lzz;->g:Lha1;

    .line 6
    .line 7
    iget-object v0, v0, Lha1;->q:Lru0;

    .line 8
    .line 9
    iget-object v1, p0, Lzz;->f:Landroid/content/Context;

    .line 10
    .line 11
    invoke-static {v1, v0}, Lnm0;->a(Landroid/content/Context;Lru0;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iput-object v0, p0, Lzz;->m:Ljava/lang/Boolean;

    .line 20
    .line 21
    :cond_0
    iget-object v0, p0, Lzz;->m:Ljava/lang/Boolean;

    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    const/4 v1, 0x0

    .line 28
    if-nez v0, :cond_1

    .line 29
    .line 30
    invoke-static {}, Lh80;->d()Lh80;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    new-array v0, v1, [Ljava/lang/Throwable;

    .line 35
    .line 36
    invoke-virtual {p1, v0}, Lh80;->e([Ljava/lang/Throwable;)V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :cond_1
    iget-boolean v0, p0, Lzz;->k:Z

    .line 41
    .line 42
    const/4 v2, 0x1

    .line 43
    if-nez v0, :cond_2

    .line 44
    .line 45
    iget-object v0, p0, Lzz;->g:Lha1;

    .line 46
    .line 47
    iget-object v0, v0, Lha1;->u:Lom0;

    .line 48
    .line 49
    invoke-virtual {v0, p0}, Lom0;->b(Lgt;)V

    .line 50
    .line 51
    .line 52
    iput-boolean v2, p0, Lzz;->k:Z

    .line 53
    .line 54
    :cond_2
    new-instance v0, Ljava/util/HashSet;

    .line 55
    .line 56
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 57
    .line 58
    .line 59
    new-instance v3, Ljava/util/HashSet;

    .line 60
    .line 61
    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    .line 62
    .line 63
    .line 64
    array-length v4, p1

    .line 65
    move v5, v1

    .line 66
    :goto_0
    if-ge v5, v4, :cond_9

    .line 67
    .line 68
    aget-object v6, p1, v5

    .line 69
    .line 70
    invoke-virtual {v6}, Loa1;->a()J

    .line 71
    .line 72
    .line 73
    move-result-wide v7

    .line 74
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 75
    .line 76
    .line 77
    move-result-wide v9

    .line 78
    iget v11, v6, Loa1;->b:I

    .line 79
    .line 80
    if-ne v11, v2, :cond_8

    .line 81
    .line 82
    cmp-long v7, v9, v7

    .line 83
    .line 84
    if-gez v7, :cond_4

    .line 85
    .line 86
    iget-object v7, p0, Lzz;->j:Lbo;

    .line 87
    .line 88
    if-eqz v7, :cond_8

    .line 89
    .line 90
    iget-object v8, v7, Lbo;->b:Lf20;

    .line 91
    .line 92
    iget-object v9, v7, Lbo;->c:Ljava/util/HashMap;

    .line 93
    .line 94
    iget-object v10, v6, Loa1;->a:Ljava/lang/String;

    .line 95
    .line 96
    invoke-virtual {v9, v10}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v10

    .line 100
    check-cast v10, Ljava/lang/Runnable;

    .line 101
    .line 102
    if-eqz v10, :cond_3

    .line 103
    .line 104
    iget-object v11, v8, Lf20;->g:Ljava/lang/Object;

    .line 105
    .line 106
    check-cast v11, Landroid/os/Handler;

    .line 107
    .line 108
    invoke-virtual {v11, v10}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 109
    .line 110
    .line 111
    :cond_3
    new-instance v10, Ljq3;

    .line 112
    .line 113
    const/16 v11, 0xa

    .line 114
    .line 115
    const/4 v12, 0x0

    .line 116
    invoke-direct {v10, v7, v6, v11, v12}, Ljq3;-><init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 117
    .line 118
    .line 119
    iget-object v7, v6, Loa1;->a:Ljava/lang/String;

    .line 120
    .line 121
    invoke-virtual {v9, v7, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 125
    .line 126
    .line 127
    move-result-wide v11

    .line 128
    invoke-virtual {v6}, Loa1;->a()J

    .line 129
    .line 130
    .line 131
    move-result-wide v6

    .line 132
    sub-long/2addr v6, v11

    .line 133
    iget-object v8, v8, Lf20;->g:Ljava/lang/Object;

    .line 134
    .line 135
    check-cast v8, Landroid/os/Handler;

    .line 136
    .line 137
    invoke-virtual {v8, v10, v6, v7}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 138
    .line 139
    .line 140
    goto :goto_1

    .line 141
    :cond_4
    invoke-virtual {v6}, Loa1;->b()Z

    .line 142
    .line 143
    .line 144
    move-result v7

    .line 145
    if-eqz v7, :cond_7

    .line 146
    .line 147
    iget-object v7, v6, Loa1;->j:Lri;

    .line 148
    .line 149
    iget-boolean v8, v7, Lri;->c:Z

    .line 150
    .line 151
    if-eqz v8, :cond_5

    .line 152
    .line 153
    invoke-static {}, Lh80;->d()Lh80;

    .line 154
    .line 155
    .line 156
    move-result-object v7

    .line 157
    invoke-virtual {v6}, Loa1;->toString()Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    new-array v6, v1, [Ljava/lang/Throwable;

    .line 161
    .line 162
    invoke-virtual {v7, v6}, Lh80;->a([Ljava/lang/Throwable;)V

    .line 163
    .line 164
    .line 165
    goto :goto_1

    .line 166
    :cond_5
    iget-object v7, v7, Lri;->h:Lhj;

    .line 167
    .line 168
    iget-object v7, v7, Lhj;->a:Ljava/util/HashSet;

    .line 169
    .line 170
    invoke-virtual {v7}, Ljava/util/HashSet;->size()I

    .line 171
    .line 172
    .line 173
    move-result v7

    .line 174
    if-lez v7, :cond_6

    .line 175
    .line 176
    invoke-static {}, Lh80;->d()Lh80;

    .line 177
    .line 178
    .line 179
    move-result-object v7

    .line 180
    invoke-virtual {v6}, Loa1;->toString()Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    new-array v6, v1, [Ljava/lang/Throwable;

    .line 184
    .line 185
    invoke-virtual {v7, v6}, Lh80;->a([Ljava/lang/Throwable;)V

    .line 186
    .line 187
    .line 188
    goto :goto_1

    .line 189
    :cond_6
    invoke-virtual {v0, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 190
    .line 191
    .line 192
    iget-object v6, v6, Loa1;->a:Ljava/lang/String;

    .line 193
    .line 194
    invoke-virtual {v3, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 195
    .line 196
    .line 197
    goto :goto_1

    .line 198
    :cond_7
    invoke-static {}, Lh80;->d()Lh80;

    .line 199
    .line 200
    .line 201
    move-result-object v7

    .line 202
    new-array v8, v1, [Ljava/lang/Throwable;

    .line 203
    .line 204
    invoke-virtual {v7, v8}, Lh80;->a([Ljava/lang/Throwable;)V

    .line 205
    .line 206
    .line 207
    iget-object v7, p0, Lzz;->g:Lha1;

    .line 208
    .line 209
    iget-object v6, v6, Loa1;->a:Ljava/lang/String;

    .line 210
    .line 211
    const/4 v8, 0x0

    .line 212
    invoke-virtual {v7, v6, v8}, Lha1;->n0(Ljava/lang/String;Lt83;)V

    .line 213
    .line 214
    .line 215
    :cond_8
    :goto_1
    add-int/lit8 v5, v5, 0x1

    .line 216
    .line 217
    goto/16 :goto_0

    .line 218
    .line 219
    :cond_9
    iget-object p1, p0, Lzz;->l:Ljava/lang/Object;

    .line 220
    .line 221
    monitor-enter p1

    .line 222
    :try_start_0
    invoke-virtual {v0}, Ljava/util/HashSet;->isEmpty()Z

    .line 223
    .line 224
    .line 225
    move-result v2

    .line 226
    if-nez v2, :cond_a

    .line 227
    .line 228
    invoke-static {}, Lh80;->d()Lh80;

    .line 229
    .line 230
    .line 231
    move-result-object v2

    .line 232
    const-string v4, ","

    .line 233
    .line 234
    invoke-static {v4, v3}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;

    .line 235
    .line 236
    .line 237
    new-array v1, v1, [Ljava/lang/Throwable;

    .line 238
    .line 239
    invoke-virtual {v2, v1}, Lh80;->a([Ljava/lang/Throwable;)V

    .line 240
    .line 241
    .line 242
    iget-object v1, p0, Lzz;->i:Ljava/util/HashSet;

    .line 243
    .line 244
    invoke-interface {v1, v0}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 245
    .line 246
    .line 247
    iget-object v0, p0, Lzz;->h:Lv91;

    .line 248
    .line 249
    iget-object v1, p0, Lzz;->i:Ljava/util/HashSet;

    .line 250
    .line 251
    invoke-virtual {v0, v1}, Lv91;->b(Ljava/util/Collection;)V

    .line 252
    .line 253
    .line 254
    goto :goto_2

    .line 255
    :catchall_0
    move-exception v0

    .line 256
    goto :goto_3

    .line 257
    :cond_a
    :goto_2
    monitor-exit p1

    .line 258
    return-void

    .line 259
    :goto_3
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 260
    throw v0
.end method

.method public final e(Ljava/util/List;)V
    .locals 6

    .line 1
    check-cast p1, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    move v2, v1

    .line 9
    :goto_0
    if-ge v2, v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    add-int/lit8 v2, v2, 0x1

    .line 16
    .line 17
    check-cast v3, Ljava/lang/String;

    .line 18
    .line 19
    invoke-static {}, Lh80;->d()Lh80;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    new-array v5, v1, [Ljava/lang/Throwable;

    .line 24
    .line 25
    invoke-virtual {v4, v5}, Lh80;->a([Ljava/lang/Throwable;)V

    .line 26
    .line 27
    .line 28
    iget-object v4, p0, Lzz;->g:Lha1;

    .line 29
    .line 30
    const/4 v5, 0x0

    .line 31
    invoke-virtual {v4, v3, v5}, Lha1;->n0(Ljava/lang/String;Lt83;)V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    return-void
.end method

.method public final f()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method
