.class public final Lwa1;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field public static final y:Ljava/lang/String;


# instance fields
.field public f:Landroid/content/Context;

.field public g:Ljava/lang/String;

.field public h:Ljava/util/List;

.field public i:Lt83;

.field public j:Loa1;

.field public k:Landroidx/work/ListenableWorker;

.field public l:Lxb4;

.field public m:Lr70;

.field public n:Lru0;

.field public o:Lom0;

.field public p:Landroidx/work/impl/WorkDatabase;

.field public q:Lh2;

.field public r:Ll92;

.field public s:Ll92;

.field public t:Ljava/util/ArrayList;

.field public u:Ljava/lang/String;

.field public v:Lou0;

.field public w:Ln70;

.field public volatile x:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "WorkerWrapper"

    .line 2
    .line 3
    invoke-static {v0}, Lh80;->f(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lwa1;->y:Ljava/lang/String;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final a(Lr70;)V
    .locals 13

    .line 1
    instance-of v0, p1, Lq70;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_5

    .line 5
    .line 6
    invoke-static {}, Lh80;->d()Lh80;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    new-array v0, v1, [Ljava/lang/Throwable;

    .line 11
    .line 12
    invoke-virtual {p1, v0}, Lh80;->e([Ljava/lang/Throwable;)V

    .line 13
    .line 14
    .line 15
    iget-object p1, p0, Lwa1;->j:Loa1;

    .line 16
    .line 17
    invoke-virtual {p1}, Loa1;->c()Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    if-eqz p1, :cond_0

    .line 22
    .line 23
    invoke-virtual {p0}, Lwa1;->d()V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_0
    iget-object p1, p0, Lwa1;->r:Ll92;

    .line 28
    .line 29
    iget-object v0, p0, Lwa1;->g:Ljava/lang/String;

    .line 30
    .line 31
    iget-object v2, p0, Lwa1;->q:Lh2;

    .line 32
    .line 33
    iget-object v3, p0, Lwa1;->p:Landroidx/work/impl/WorkDatabase;

    .line 34
    .line 35
    invoke-virtual {v3}, Lpq0;->c()V

    .line 36
    .line 37
    .line 38
    :try_start_0
    filled-new-array {v0}, [Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v4

    .line 42
    const/4 v5, 0x3

    .line 43
    invoke-virtual {v2, v5, v4}, Lh2;->n(I[Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    iget-object v4, p0, Lwa1;->m:Lr70;

    .line 47
    .line 48
    check-cast v4, Lq70;

    .line 49
    .line 50
    iget-object v4, v4, Lq70;->a:Lim;

    .line 51
    .line 52
    invoke-virtual {v2, v0, v4}, Lh2;->l(Ljava/lang/String;Lim;)V

    .line 53
    .line 54
    .line 55
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 56
    .line 57
    .line 58
    move-result-wide v4

    .line 59
    invoke-virtual {p1, v0}, Ll92;->x(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 64
    .line 65
    .line 66
    move-result v6

    .line 67
    move v7, v1

    .line 68
    :cond_1
    :goto_0
    if-ge v7, v6, :cond_4

    .line 69
    .line 70
    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v8

    .line 74
    add-int/lit8 v7, v7, 0x1

    .line 75
    .line 76
    check-cast v8, Ljava/lang/String;

    .line 77
    .line 78
    invoke-virtual {v2, v8}, Lh2;->e(Ljava/lang/String;)I

    .line 79
    .line 80
    .line 81
    move-result v9

    .line 82
    const/4 v10, 0x5

    .line 83
    if-ne v9, v10, :cond_1

    .line 84
    .line 85
    iget-object v9, p1, Ll92;->f:Ljava/lang/Object;

    .line 86
    .line 87
    check-cast v9, Landroidx/work/impl/WorkDatabase_Impl;

    .line 88
    .line 89
    const-string v10, "SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)"

    .line 90
    .line 91
    const/4 v11, 0x1

    .line 92
    invoke-static {v10, v11}, Lrq0;->f(Ljava/lang/String;I)Lrq0;

    .line 93
    .line 94
    .line 95
    move-result-object v10

    .line 96
    if-nez v8, :cond_2

    .line 97
    .line 98
    invoke-virtual {v10, v11}, Lrq0;->h(I)V

    .line 99
    .line 100
    .line 101
    goto :goto_1

    .line 102
    :cond_2
    invoke-virtual {v10, v8, v11}, Lrq0;->i(Ljava/lang/String;I)V

    .line 103
    .line 104
    .line 105
    :goto_1
    invoke-virtual {v9}, Lpq0;->b()V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v9, v10}, Lpq0;->g(Llz0;)Landroid/database/Cursor;

    .line 109
    .line 110
    .line 111
    move-result-object v9
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 112
    :try_start_1
    invoke-interface {v9}, Landroid/database/Cursor;->moveToFirst()Z

    .line 113
    .line 114
    .line 115
    move-result v12

    .line 116
    if-eqz v12, :cond_3

    .line 117
    .line 118
    invoke-interface {v9, v1}, Landroid/database/Cursor;->getInt(I)I

    .line 119
    .line 120
    .line 121
    move-result v12
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 122
    if-eqz v12, :cond_3

    .line 123
    .line 124
    move v12, v11

    .line 125
    goto :goto_2

    .line 126
    :catchall_0
    move-exception p1

    .line 127
    goto :goto_3

    .line 128
    :cond_3
    move v12, v1

    .line 129
    :goto_2
    :try_start_2
    invoke-interface {v9}, Landroid/database/Cursor;->close()V

    .line 130
    .line 131
    .line 132
    invoke-virtual {v10}, Lrq0;->k()V

    .line 133
    .line 134
    .line 135
    if-eqz v12, :cond_1

    .line 136
    .line 137
    invoke-static {}, Lh80;->d()Lh80;

    .line 138
    .line 139
    .line 140
    move-result-object v9

    .line 141
    new-array v10, v1, [Ljava/lang/Throwable;

    .line 142
    .line 143
    invoke-virtual {v9, v10}, Lh80;->e([Ljava/lang/Throwable;)V

    .line 144
    .line 145
    .line 146
    filled-new-array {v8}, [Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object v9

    .line 150
    invoke-virtual {v2, v11, v9}, Lh2;->n(I[Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {v2, v8, v4, v5}, Lh2;->m(Ljava/lang/String;J)V

    .line 154
    .line 155
    .line 156
    goto :goto_0

    .line 157
    :catchall_1
    move-exception p1

    .line 158
    goto :goto_4

    .line 159
    :goto_3
    invoke-interface {v9}, Landroid/database/Cursor;->close()V

    .line 160
    .line 161
    .line 162
    invoke-virtual {v10}, Lrq0;->k()V

    .line 163
    .line 164
    .line 165
    throw p1

    .line 166
    :cond_4
    invoke-virtual {v3}, Lpq0;->h()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 167
    .line 168
    .line 169
    invoke-virtual {v3}, Lpq0;->f()V

    .line 170
    .line 171
    .line 172
    invoke-virtual {p0, v1}, Lwa1;->e(Z)V

    .line 173
    .line 174
    .line 175
    return-void

    .line 176
    :goto_4
    invoke-virtual {v3}, Lpq0;->f()V

    .line 177
    .line 178
    .line 179
    invoke-virtual {p0, v1}, Lwa1;->e(Z)V

    .line 180
    .line 181
    .line 182
    throw p1

    .line 183
    :cond_5
    instance-of p1, p1, Lp70;

    .line 184
    .line 185
    if-eqz p1, :cond_6

    .line 186
    .line 187
    invoke-static {}, Lh80;->d()Lh80;

    .line 188
    .line 189
    .line 190
    move-result-object p1

    .line 191
    new-array v0, v1, [Ljava/lang/Throwable;

    .line 192
    .line 193
    invoke-virtual {p1, v0}, Lh80;->e([Ljava/lang/Throwable;)V

    .line 194
    .line 195
    .line 196
    invoke-virtual {p0}, Lwa1;->c()V

    .line 197
    .line 198
    .line 199
    return-void

    .line 200
    :cond_6
    invoke-static {}, Lh80;->d()Lh80;

    .line 201
    .line 202
    .line 203
    move-result-object p1

    .line 204
    new-array v0, v1, [Ljava/lang/Throwable;

    .line 205
    .line 206
    invoke-virtual {p1, v0}, Lh80;->e([Ljava/lang/Throwable;)V

    .line 207
    .line 208
    .line 209
    iget-object p1, p0, Lwa1;->j:Loa1;

    .line 210
    .line 211
    invoke-virtual {p1}, Loa1;->c()Z

    .line 212
    .line 213
    .line 214
    move-result p1

    .line 215
    if-eqz p1, :cond_7

    .line 216
    .line 217
    invoke-virtual {p0}, Lwa1;->d()V

    .line 218
    .line 219
    .line 220
    return-void

    .line 221
    :cond_7
    invoke-virtual {p0}, Lwa1;->g()V

    .line 222
    .line 223
    .line 224
    return-void
.end method

.method public final b()V
    .locals 8

    .line 1
    iget-object v0, p0, Lwa1;->h:Ljava/util/List;

    .line 2
    .line 3
    iget-object v1, p0, Lwa1;->g:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v2, p0, Lwa1;->p:Landroidx/work/impl/WorkDatabase;

    .line 6
    .line 7
    invoke-virtual {p0}, Lwa1;->h()Z

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    if-nez v3, :cond_4

    .line 12
    .line 13
    invoke-virtual {v2}, Lpq0;->c()V

    .line 14
    .line 15
    .line 16
    :try_start_0
    iget-object v3, p0, Lwa1;->q:Lh2;

    .line 17
    .line 18
    invoke-virtual {v3, v1}, Lh2;->e(Ljava/lang/String;)I

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    invoke-virtual {v2}, Landroidx/work/impl/WorkDatabase;->m()Lmc2;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    iget-object v5, v4, Lmc2;->g:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v5, Landroidx/work/impl/WorkDatabase_Impl;

    .line 29
    .line 30
    invoke-virtual {v5}, Lpq0;->b()V

    .line 31
    .line 32
    .line 33
    iget-object v4, v4, Lmc2;->i:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v4, Ltz0;

    .line 36
    .line 37
    invoke-virtual {v4}, Lsv0;->a()Lpx;

    .line 38
    .line 39
    .line 40
    move-result-object v6

    .line 41
    const/4 v7, 0x1

    .line 42
    if-nez v1, :cond_0

    .line 43
    .line 44
    invoke-virtual {v6, v7}, Llx;->g(I)V

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    invoke-virtual {v6, v1, v7}, Llx;->h(Ljava/lang/String;I)V

    .line 49
    .line 50
    .line 51
    :goto_0
    invoke-virtual {v5}, Lpq0;->c()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 52
    .line 53
    .line 54
    :try_start_1
    invoke-virtual {v6}, Lpx;->t()V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v5}, Lpq0;->h()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 58
    .line 59
    .line 60
    :try_start_2
    invoke-virtual {v5}, Lpq0;->f()V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v4, v6}, Lsv0;->c(Lpx;)V

    .line 64
    .line 65
    .line 66
    if-nez v3, :cond_1

    .line 67
    .line 68
    const/4 v3, 0x0

    .line 69
    invoke-virtual {p0, v3}, Lwa1;->e(Z)V

    .line 70
    .line 71
    .line 72
    goto :goto_1

    .line 73
    :catchall_0
    move-exception v0

    .line 74
    goto :goto_2

    .line 75
    :cond_1
    const/4 v4, 0x2

    .line 76
    if-ne v3, v4, :cond_2

    .line 77
    .line 78
    iget-object v3, p0, Lwa1;->m:Lr70;

    .line 79
    .line 80
    invoke-virtual {p0, v3}, Lwa1;->a(Lr70;)V

    .line 81
    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_2
    invoke-static {v3}, Lga1;->a(I)Z

    .line 85
    .line 86
    .line 87
    move-result v3

    .line 88
    if-nez v3, :cond_3

    .line 89
    .line 90
    invoke-virtual {p0}, Lwa1;->c()V

    .line 91
    .line 92
    .line 93
    :cond_3
    :goto_1
    invoke-virtual {v2}, Lpq0;->h()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 94
    .line 95
    .line 96
    invoke-virtual {v2}, Lpq0;->f()V

    .line 97
    .line 98
    .line 99
    goto :goto_3

    .line 100
    :catchall_1
    move-exception v0

    .line 101
    :try_start_3
    invoke-virtual {v5}, Lpq0;->f()V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v4, v6}, Lsv0;->c(Lpx;)V

    .line 105
    .line 106
    .line 107
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 108
    :goto_2
    invoke-virtual {v2}, Lpq0;->f()V

    .line 109
    .line 110
    .line 111
    throw v0

    .line 112
    :cond_4
    :goto_3
    if-eqz v0, :cond_6

    .line 113
    .line 114
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 115
    .line 116
    .line 117
    move-result-object v3

    .line 118
    :goto_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 119
    .line 120
    .line 121
    move-result v4

    .line 122
    if-eqz v4, :cond_5

    .line 123
    .line 124
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v4

    .line 128
    check-cast v4, Let0;

    .line 129
    .line 130
    invoke-interface {v4, v1}, Let0;->b(Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    goto :goto_4

    .line 134
    :cond_5
    iget-object v1, p0, Lwa1;->n:Lru0;

    .line 135
    .line 136
    invoke-static {v1, v2, v0}, Lgt0;->a(Lru0;Landroidx/work/impl/WorkDatabase;Ljava/util/List;)V

    .line 137
    .line 138
    .line 139
    :cond_6
    return-void
.end method

.method public final c()V
    .locals 6

    .line 1
    iget-object v0, p0, Lwa1;->g:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v1, p0, Lwa1;->q:Lh2;

    .line 4
    .line 5
    iget-object v2, p0, Lwa1;->p:Landroidx/work/impl/WorkDatabase;

    .line 6
    .line 7
    invoke-virtual {v2}, Lpq0;->c()V

    .line 8
    .line 9
    .line 10
    const/4 v3, 0x1

    .line 11
    :try_start_0
    filled-new-array {v0}, [Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v4

    .line 15
    invoke-virtual {v1, v3, v4}, Lh2;->n(I[Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 19
    .line 20
    .line 21
    move-result-wide v4

    .line 22
    invoke-virtual {v1, v0, v4, v5}, Lh2;->m(Ljava/lang/String;J)V

    .line 23
    .line 24
    .line 25
    const-wide/16 v4, -0x1

    .line 26
    .line 27
    invoke-virtual {v1, v0, v4, v5}, Lh2;->j(Ljava/lang/String;J)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v2}, Lpq0;->h()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 31
    .line 32
    .line 33
    invoke-virtual {v2}, Lpq0;->f()V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0, v3}, Lwa1;->e(Z)V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :catchall_0
    move-exception v0

    .line 41
    invoke-virtual {v2}, Lpq0;->f()V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0, v3}, Lwa1;->e(Z)V

    .line 45
    .line 46
    .line 47
    throw v0
.end method

.method public final d()V
    .locals 6

    .line 1
    iget-object v0, p0, Lwa1;->g:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v1, p0, Lwa1;->q:Lh2;

    .line 4
    .line 5
    iget-object v2, p0, Lwa1;->p:Landroidx/work/impl/WorkDatabase;

    .line 6
    .line 7
    invoke-virtual {v2}, Lpq0;->c()V

    .line 8
    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    :try_start_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 12
    .line 13
    .line 14
    move-result-wide v4

    .line 15
    invoke-virtual {v1, v0, v4, v5}, Lh2;->m(Ljava/lang/String;J)V

    .line 16
    .line 17
    .line 18
    filled-new-array {v0}, [Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v4

    .line 22
    const/4 v5, 0x1

    .line 23
    invoke-virtual {v1, v5, v4}, Lh2;->n(I[Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1, v0}, Lh2;->k(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    const-wide/16 v4, -0x1

    .line 30
    .line 31
    invoke-virtual {v1, v0, v4, v5}, Lh2;->j(Ljava/lang/String;J)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v2}, Lpq0;->h()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 35
    .line 36
    .line 37
    invoke-virtual {v2}, Lpq0;->f()V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0, v3}, Lwa1;->e(Z)V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :catchall_0
    move-exception v0

    .line 45
    invoke-virtual {v2}, Lpq0;->f()V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0, v3}, Lwa1;->e(Z)V

    .line 49
    .line 50
    .line 51
    throw v0
.end method

.method public final e(Z)V
    .locals 5

    .line 1
    iget-object v0, p0, Lwa1;->p:Landroidx/work/impl/WorkDatabase;

    .line 2
    .line 3
    invoke-virtual {v0}, Lpq0;->c()V

    .line 4
    .line 5
    .line 6
    :try_start_0
    iget-object v0, p0, Lwa1;->p:Landroidx/work/impl/WorkDatabase;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->n()Lh2;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    const-string v1, "SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1"

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    invoke-static {v1, v2}, Lrq0;->f(Ljava/lang/String;I)Lrq0;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    iget-object v0, v0, Lh2;->a:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v0, Landroidx/work/impl/WorkDatabase_Impl;

    .line 25
    .line 26
    invoke-virtual {v0}, Lpq0;->b()V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, v1}, Lpq0;->g(Llz0;)Landroid/database/Cursor;

    .line 30
    .line 31
    .line 32
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 33
    :try_start_1
    invoke-interface {v0}, Landroid/database/Cursor;->moveToFirst()Z

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    const/4 v4, 0x1

    .line 38
    if-eqz v3, :cond_0

    .line 39
    .line 40
    invoke-interface {v0, v2}, Landroid/database/Cursor;->getInt(I)I

    .line 41
    .line 42
    .line 43
    move-result v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 44
    if-eqz v3, :cond_0

    .line 45
    .line 46
    move v3, v4

    .line 47
    goto :goto_0

    .line 48
    :catchall_0
    move-exception p1

    .line 49
    goto :goto_3

    .line 50
    :cond_0
    move v3, v2

    .line 51
    :goto_0
    :try_start_2
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1}, Lrq0;->k()V

    .line 55
    .line 56
    .line 57
    if-nez v3, :cond_1

    .line 58
    .line 59
    iget-object v0, p0, Lwa1;->f:Landroid/content/Context;

    .line 60
    .line 61
    const-class v1, Landroidx/work/impl/background/systemalarm/RescheduleReceiver;

    .line 62
    .line 63
    invoke-static {v0, v1, v2}, Lyj0;->a(Landroid/content/Context;Ljava/lang/Class;Z)V

    .line 64
    .line 65
    .line 66
    goto :goto_1

    .line 67
    :catchall_1
    move-exception p1

    .line 68
    goto :goto_4

    .line 69
    :cond_1
    :goto_1
    if-eqz p1, :cond_2

    .line 70
    .line 71
    iget-object v0, p0, Lwa1;->q:Lh2;

    .line 72
    .line 73
    iget-object v1, p0, Lwa1;->g:Ljava/lang/String;

    .line 74
    .line 75
    filled-new-array {v1}, [Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    invoke-virtual {v0, v4, v1}, Lh2;->n(I[Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    iget-object v0, p0, Lwa1;->q:Lh2;

    .line 83
    .line 84
    iget-object v1, p0, Lwa1;->g:Ljava/lang/String;

    .line 85
    .line 86
    const-wide/16 v2, -0x1

    .line 87
    .line 88
    invoke-virtual {v0, v1, v2, v3}, Lh2;->j(Ljava/lang/String;J)V

    .line 89
    .line 90
    .line 91
    :cond_2
    iget-object v0, p0, Lwa1;->j:Loa1;

    .line 92
    .line 93
    if-eqz v0, :cond_3

    .line 94
    .line 95
    iget-object v0, p0, Lwa1;->k:Landroidx/work/ListenableWorker;

    .line 96
    .line 97
    if-eqz v0, :cond_3

    .line 98
    .line 99
    invoke-virtual {v0}, Landroidx/work/ListenableWorker;->isRunInForeground()Z

    .line 100
    .line 101
    .line 102
    move-result v0

    .line 103
    if-eqz v0, :cond_3

    .line 104
    .line 105
    iget-object v0, p0, Lwa1;->o:Lom0;

    .line 106
    .line 107
    iget-object v1, p0, Lwa1;->g:Ljava/lang/String;

    .line 108
    .line 109
    iget-object v2, v0, Lom0;->p:Ljava/lang/Object;

    .line 110
    .line 111
    monitor-enter v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 112
    :try_start_3
    iget-object v3, v0, Lom0;->k:Ljava/util/HashMap;

    .line 113
    .line 114
    invoke-virtual {v3, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v0}, Lom0;->h()V

    .line 118
    .line 119
    .line 120
    monitor-exit v2

    .line 121
    goto :goto_2

    .line 122
    :catchall_2
    move-exception p1

    .line 123
    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 124
    :try_start_4
    throw p1

    .line 125
    :cond_3
    :goto_2
    iget-object v0, p0, Lwa1;->p:Landroidx/work/impl/WorkDatabase;

    .line 126
    .line 127
    invoke-virtual {v0}, Lpq0;->h()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 128
    .line 129
    .line 130
    iget-object v0, p0, Lwa1;->p:Landroidx/work/impl/WorkDatabase;

    .line 131
    .line 132
    invoke-virtual {v0}, Lpq0;->f()V

    .line 133
    .line 134
    .line 135
    iget-object v0, p0, Lwa1;->v:Lou0;

    .line 136
    .line 137
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    invoke-virtual {v0, p1}, Lou0;->i(Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    return-void

    .line 145
    :goto_3
    :try_start_5
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    .line 146
    .line 147
    .line 148
    invoke-virtual {v1}, Lrq0;->k()V

    .line 149
    .line 150
    .line 151
    throw p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 152
    :goto_4
    iget-object v0, p0, Lwa1;->p:Landroidx/work/impl/WorkDatabase;

    .line 153
    .line 154
    invoke-virtual {v0}, Lpq0;->f()V

    .line 155
    .line 156
    .line 157
    throw p1
.end method

.method public final f()V
    .locals 3

    .line 1
    iget-object v0, p0, Lwa1;->q:Lh2;

    .line 2
    .line 3
    iget-object v1, p0, Lwa1;->g:Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lh2;->e(Ljava/lang/String;)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x2

    .line 10
    const/4 v2, 0x0

    .line 11
    if-ne v0, v1, :cond_0

    .line 12
    .line 13
    invoke-static {}, Lh80;->d()Lh80;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    new-array v1, v2, [Ljava/lang/Throwable;

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Lh80;->a([Ljava/lang/Throwable;)V

    .line 20
    .line 21
    .line 22
    const/4 v0, 0x1

    .line 23
    invoke-virtual {p0, v0}, Lwa1;->e(Z)V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_0
    invoke-static {}, Lh80;->d()Lh80;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    new-array v1, v2, [Ljava/lang/Throwable;

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Lh80;->a([Ljava/lang/Throwable;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0, v2}, Lwa1;->e(Z)V

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method public final g()V
    .locals 8

    .line 1
    iget-object v0, p0, Lwa1;->q:Lh2;

    .line 2
    .line 3
    iget-object v1, p0, Lwa1;->g:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v2, p0, Lwa1;->p:Landroidx/work/impl/WorkDatabase;

    .line 6
    .line 7
    invoke-virtual {v2}, Lpq0;->c()V

    .line 8
    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    :try_start_0
    new-instance v4, Ljava/util/LinkedList;

    .line 12
    .line 13
    invoke-direct {v4}, Ljava/util/LinkedList;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v4, v1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    :goto_0
    invoke-virtual {v4}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 20
    .line 21
    .line 22
    move-result v5

    .line 23
    if-nez v5, :cond_1

    .line 24
    .line 25
    invoke-virtual {v4}, Ljava/util/LinkedList;->remove()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v5

    .line 29
    check-cast v5, Ljava/lang/String;

    .line 30
    .line 31
    invoke-virtual {v0, v5}, Lh2;->e(Ljava/lang/String;)I

    .line 32
    .line 33
    .line 34
    move-result v6

    .line 35
    const/4 v7, 0x6

    .line 36
    if-eq v6, v7, :cond_0

    .line 37
    .line 38
    filled-new-array {v5}, [Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v6

    .line 42
    const/4 v7, 0x4

    .line 43
    invoke-virtual {v0, v7, v6}, Lh2;->n(I[Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    :cond_0
    iget-object v6, p0, Lwa1;->r:Ll92;

    .line 47
    .line 48
    invoke-virtual {v6, v5}, Ll92;->x(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 49
    .line 50
    .line 51
    move-result-object v5

    .line 52
    invoke-virtual {v4, v5}, Ljava/util/LinkedList;->addAll(Ljava/util/Collection;)Z

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_1
    iget-object v4, p0, Lwa1;->m:Lr70;

    .line 57
    .line 58
    check-cast v4, Lo70;

    .line 59
    .line 60
    iget-object v4, v4, Lo70;->a:Lim;

    .line 61
    .line 62
    invoke-virtual {v0, v1, v4}, Lh2;->l(Ljava/lang/String;Lim;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v2}, Lpq0;->h()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 66
    .line 67
    .line 68
    invoke-virtual {v2}, Lpq0;->f()V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p0, v3}, Lwa1;->e(Z)V

    .line 72
    .line 73
    .line 74
    return-void

    .line 75
    :catchall_0
    move-exception v0

    .line 76
    invoke-virtual {v2}, Lpq0;->f()V

    .line 77
    .line 78
    .line 79
    invoke-virtual {p0, v3}, Lwa1;->e(Z)V

    .line 80
    .line 81
    .line 82
    throw v0
.end method

.method public final h()Z
    .locals 3

    .line 1
    iget-boolean v0, p0, Lwa1;->x:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    invoke-static {}, Lh80;->d()Lh80;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    new-array v2, v1, [Ljava/lang/Throwable;

    .line 11
    .line 12
    invoke-virtual {v0, v2}, Lh80;->a([Ljava/lang/Throwable;)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Lwa1;->q:Lh2;

    .line 16
    .line 17
    iget-object v2, p0, Lwa1;->g:Ljava/lang/String;

    .line 18
    .line 19
    invoke-virtual {v0, v2}, Lh2;->e(Ljava/lang/String;)I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    const/4 v2, 0x1

    .line 24
    if-nez v0, :cond_0

    .line 25
    .line 26
    invoke-virtual {p0, v1}, Lwa1;->e(Z)V

    .line 27
    .line 28
    .line 29
    return v2

    .line 30
    :cond_0
    invoke-static {v0}, Lga1;->a(I)Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    xor-int/2addr v0, v2

    .line 35
    invoke-virtual {p0, v0}, Lwa1;->e(Z)V

    .line 36
    .line 37
    .line 38
    return v2

    .line 39
    :cond_1
    return v1
.end method

.method public final run()V
    .locals 24

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v0, v1, Lwa1;->s:Ll92;

    .line 4
    .line 5
    iget-object v2, v1, Lwa1;->g:Ljava/lang/String;

    .line 6
    .line 7
    invoke-virtual {v0, v2}, Ll92;->z(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iput-object v0, v1, Lwa1;->t:Ljava/util/ArrayList;

    .line 12
    .line 13
    new-instance v3, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    const-string v4, "Work [ id="

    .line 16
    .line 17
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v4, ", tags={ "

    .line 24
    .line 25
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    const/4 v5, 0x0

    .line 33
    const/4 v6, 0x1

    .line 34
    move v8, v5

    .line 35
    move v7, v6

    .line 36
    :goto_0
    if-ge v8, v4, :cond_1

    .line 37
    .line 38
    invoke-virtual {v0, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v9

    .line 42
    add-int/lit8 v8, v8, 0x1

    .line 43
    .line 44
    check-cast v9, Ljava/lang/String;

    .line 45
    .line 46
    if-eqz v7, :cond_0

    .line 47
    .line 48
    move v7, v5

    .line 49
    goto :goto_1

    .line 50
    :cond_0
    const-string v10, ", "

    .line 51
    .line 52
    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    :goto_1
    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_1
    const-string v0, " } ]"

    .line 60
    .line 61
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    iput-object v0, v1, Lwa1;->u:Ljava/lang/String;

    .line 69
    .line 70
    iget-object v3, v1, Lwa1;->n:Lru0;

    .line 71
    .line 72
    iget-object v4, v1, Lwa1;->q:Lh2;

    .line 73
    .line 74
    iget-object v7, v1, Lwa1;->l:Lxb4;

    .line 75
    .line 76
    iget-object v8, v1, Lwa1;->p:Landroidx/work/impl/WorkDatabase;

    .line 77
    .line 78
    const-string v0, "Didn\'t find WorkSpec for id "

    .line 79
    .line 80
    invoke-virtual {v1}, Lwa1;->h()Z

    .line 81
    .line 82
    .line 83
    move-result v9

    .line 84
    if-eqz v9, :cond_2

    .line 85
    .line 86
    goto/16 :goto_9

    .line 87
    .line 88
    :cond_2
    invoke-virtual {v8}, Lpq0;->c()V

    .line 89
    .line 90
    .line 91
    :try_start_0
    invoke-virtual {v4, v2}, Lh2;->h(Ljava/lang/String;)Loa1;

    .line 92
    .line 93
    .line 94
    move-result-object v9

    .line 95
    iput-object v9, v1, Lwa1;->j:Loa1;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 96
    .line 97
    sget-object v10, Lwa1;->y:Ljava/lang/String;

    .line 98
    .line 99
    if-nez v9, :cond_3

    .line 100
    .line 101
    :try_start_1
    invoke-static {}, Lh80;->d()Lh80;

    .line 102
    .line 103
    .line 104
    move-result-object v3

    .line 105
    new-instance v4, Ljava/lang/StringBuilder;

    .line 106
    .line 107
    invoke-direct {v4, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    new-array v2, v5, [Ljava/lang/Throwable;

    .line 118
    .line 119
    invoke-virtual {v3, v10, v0, v2}, Lh80;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v1, v5}, Lwa1;->e(Z)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {v8}, Lpq0;->h()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 126
    .line 127
    .line 128
    invoke-virtual {v8}, Lpq0;->f()V

    .line 129
    .line 130
    .line 131
    return-void

    .line 132
    :catchall_0
    move-exception v0

    .line 133
    goto/16 :goto_c

    .line 134
    .line 135
    :cond_3
    :try_start_2
    iget v0, v9, Loa1;->b:I

    .line 136
    .line 137
    if-eq v0, v6, :cond_4

    .line 138
    .line 139
    invoke-virtual {v1}, Lwa1;->f()V

    .line 140
    .line 141
    .line 142
    invoke-virtual {v8}, Lpq0;->h()V

    .line 143
    .line 144
    .line 145
    invoke-static {}, Lh80;->d()Lh80;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    iget-object v2, v1, Lwa1;->j:Loa1;

    .line 150
    .line 151
    iget-object v2, v2, Loa1;->c:Ljava/lang/String;

    .line 152
    .line 153
    new-array v2, v5, [Ljava/lang/Throwable;

    .line 154
    .line 155
    invoke-virtual {v0, v2}, Lh80;->a([Ljava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 156
    .line 157
    .line 158
    invoke-virtual {v8}, Lpq0;->f()V

    .line 159
    .line 160
    .line 161
    return-void

    .line 162
    :cond_4
    :try_start_3
    invoke-virtual {v9}, Loa1;->c()Z

    .line 163
    .line 164
    .line 165
    move-result v0

    .line 166
    if-nez v0, :cond_6

    .line 167
    .line 168
    iget-object v0, v1, Lwa1;->j:Loa1;

    .line 169
    .line 170
    iget v9, v0, Loa1;->b:I

    .line 171
    .line 172
    if-ne v9, v6, :cond_5

    .line 173
    .line 174
    iget v0, v0, Loa1;->k:I

    .line 175
    .line 176
    if-lez v0, :cond_5

    .line 177
    .line 178
    move v0, v6

    .line 179
    goto :goto_2

    .line 180
    :cond_5
    move v0, v5

    .line 181
    :goto_2
    if-eqz v0, :cond_8

    .line 182
    .line 183
    :cond_6
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 184
    .line 185
    .line 186
    move-result-wide v11

    .line 187
    iget-object v0, v1, Lwa1;->j:Loa1;

    .line 188
    .line 189
    iget-wide v13, v0, Loa1;->n:J

    .line 190
    .line 191
    const-wide/16 v15, 0x0

    .line 192
    .line 193
    cmp-long v9, v13, v15

    .line 194
    .line 195
    if-nez v9, :cond_7

    .line 196
    .line 197
    goto :goto_3

    .line 198
    :cond_7
    invoke-virtual {v0}, Loa1;->a()J

    .line 199
    .line 200
    .line 201
    move-result-wide v13

    .line 202
    cmp-long v0, v11, v13

    .line 203
    .line 204
    if-gez v0, :cond_8

    .line 205
    .line 206
    invoke-static {}, Lh80;->d()Lh80;

    .line 207
    .line 208
    .line 209
    move-result-object v0

    .line 210
    iget-object v2, v1, Lwa1;->j:Loa1;

    .line 211
    .line 212
    iget-object v2, v2, Loa1;->c:Ljava/lang/String;

    .line 213
    .line 214
    new-array v2, v5, [Ljava/lang/Throwable;

    .line 215
    .line 216
    invoke-virtual {v0, v2}, Lh80;->a([Ljava/lang/Throwable;)V

    .line 217
    .line 218
    .line 219
    invoke-virtual {v1, v6}, Lwa1;->e(Z)V

    .line 220
    .line 221
    .line 222
    invoke-virtual {v8}, Lpq0;->h()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 223
    .line 224
    .line 225
    invoke-virtual {v8}, Lpq0;->f()V

    .line 226
    .line 227
    .line 228
    return-void

    .line 229
    :cond_8
    :goto_3
    :try_start_4
    invoke-virtual {v8}, Lpq0;->h()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 230
    .line 231
    .line 232
    invoke-virtual {v8}, Lpq0;->f()V

    .line 233
    .line 234
    .line 235
    iget-object v0, v1, Lwa1;->j:Loa1;

    .line 236
    .line 237
    invoke-virtual {v0}, Loa1;->c()Z

    .line 238
    .line 239
    .line 240
    move-result v0

    .line 241
    if-eqz v0, :cond_9

    .line 242
    .line 243
    iget-object v0, v1, Lwa1;->j:Loa1;

    .line 244
    .line 245
    iget-object v0, v0, Loa1;->e:Lim;

    .line 246
    .line 247
    goto/16 :goto_7

    .line 248
    .line 249
    :cond_9
    iget-object v0, v3, Lru0;->g:Ljava/lang/Object;

    .line 250
    .line 251
    check-cast v0, Lpz;

    .line 252
    .line 253
    iget-object v9, v1, Lwa1;->j:Loa1;

    .line 254
    .line 255
    iget-object v9, v9, Loa1;->d:Ljava/lang/String;

    .line 256
    .line 257
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 258
    .line 259
    .line 260
    sget-object v0, Lv20;->a:Ljava/lang/String;

    .line 261
    .line 262
    :try_start_5
    invoke-static {v9}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 263
    .line 264
    .line 265
    move-result-object v0

    .line 266
    invoke-virtual {v0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    .line 267
    .line 268
    .line 269
    move-result-object v0

    .line 270
    check-cast v0, Lv20;
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0

    .line 271
    .line 272
    goto :goto_4

    .line 273
    :catch_0
    move-exception v0

    .line 274
    invoke-static {}, Lh80;->d()Lh80;

    .line 275
    .line 276
    .line 277
    move-result-object v11

    .line 278
    sget-object v12, Lv20;->a:Ljava/lang/String;

    .line 279
    .line 280
    new-instance v13, Ljava/lang/StringBuilder;

    .line 281
    .line 282
    const-string v14, "Trouble instantiating + "

    .line 283
    .line 284
    invoke-direct {v13, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 285
    .line 286
    .line 287
    invoke-virtual {v13, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 288
    .line 289
    .line 290
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 291
    .line 292
    .line 293
    move-result-object v9

    .line 294
    new-array v13, v6, [Ljava/lang/Throwable;

    .line 295
    .line 296
    aput-object v0, v13, v5

    .line 297
    .line 298
    invoke-virtual {v11, v12, v9, v13}, Lh80;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    .line 299
    .line 300
    .line 301
    const/4 v0, 0x0

    .line 302
    :goto_4
    if-nez v0, :cond_a

    .line 303
    .line 304
    invoke-static {}, Lh80;->d()Lh80;

    .line 305
    .line 306
    .line 307
    move-result-object v0

    .line 308
    iget-object v2, v1, Lwa1;->j:Loa1;

    .line 309
    .line 310
    iget-object v2, v2, Loa1;->d:Ljava/lang/String;

    .line 311
    .line 312
    new-instance v3, Ljava/lang/StringBuilder;

    .line 313
    .line 314
    const-string v4, "Could not create Input Merger "

    .line 315
    .line 316
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 317
    .line 318
    .line 319
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 320
    .line 321
    .line 322
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 323
    .line 324
    .line 325
    move-result-object v2

    .line 326
    new-array v3, v5, [Ljava/lang/Throwable;

    .line 327
    .line 328
    invoke-virtual {v0, v10, v2, v3}, Lh80;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    .line 329
    .line 330
    .line 331
    invoke-virtual {v1}, Lwa1;->g()V

    .line 332
    .line 333
    .line 334
    goto/16 :goto_9

    .line 335
    .line 336
    :cond_a
    new-instance v9, Ljava/util/ArrayList;

    .line 337
    .line 338
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 339
    .line 340
    .line 341
    iget-object v11, v1, Lwa1;->j:Loa1;

    .line 342
    .line 343
    iget-object v11, v11, Loa1;->e:Lim;

    .line 344
    .line 345
    invoke-virtual {v9, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 346
    .line 347
    .line 348
    iget-object v11, v4, Lh2;->a:Ljava/lang/Object;

    .line 349
    .line 350
    check-cast v11, Landroidx/work/impl/WorkDatabase_Impl;

    .line 351
    .line 352
    const-string v12, "SELECT output FROM workspec WHERE id IN (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)"

    .line 353
    .line 354
    invoke-static {v12, v6}, Lrq0;->f(Ljava/lang/String;I)Lrq0;

    .line 355
    .line 356
    .line 357
    move-result-object v12

    .line 358
    if-nez v2, :cond_b

    .line 359
    .line 360
    invoke-virtual {v12, v6}, Lrq0;->h(I)V

    .line 361
    .line 362
    .line 363
    goto :goto_5

    .line 364
    :cond_b
    invoke-virtual {v12, v2, v6}, Lrq0;->i(Ljava/lang/String;I)V

    .line 365
    .line 366
    .line 367
    :goto_5
    invoke-virtual {v11}, Lpq0;->b()V

    .line 368
    .line 369
    .line 370
    invoke-virtual {v11, v12}, Lpq0;->g(Llz0;)Landroid/database/Cursor;

    .line 371
    .line 372
    .line 373
    move-result-object v11

    .line 374
    :try_start_6
    new-instance v13, Ljava/util/ArrayList;

    .line 375
    .line 376
    invoke-interface {v11}, Landroid/database/Cursor;->getCount()I

    .line 377
    .line 378
    .line 379
    move-result v14

    .line 380
    invoke-direct {v13, v14}, Ljava/util/ArrayList;-><init>(I)V

    .line 381
    .line 382
    .line 383
    :goto_6
    invoke-interface {v11}, Landroid/database/Cursor;->moveToNext()Z

    .line 384
    .line 385
    .line 386
    move-result v14

    .line 387
    if-eqz v14, :cond_c

    .line 388
    .line 389
    invoke-interface {v11, v5}, Landroid/database/Cursor;->getBlob(I)[B

    .line 390
    .line 391
    .line 392
    move-result-object v14

    .line 393
    invoke-static {v14}, Lim;->a([B)Lim;

    .line 394
    .line 395
    .line 396
    move-result-object v14

    .line 397
    invoke-virtual {v13, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 398
    .line 399
    .line 400
    goto :goto_6

    .line 401
    :catchall_1
    move-exception v0

    .line 402
    goto/16 :goto_b

    .line 403
    .line 404
    :cond_c
    invoke-interface {v11}, Landroid/database/Cursor;->close()V

    .line 405
    .line 406
    .line 407
    invoke-virtual {v12}, Lrq0;->k()V

    .line 408
    .line 409
    .line 410
    invoke-virtual {v9, v13}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 411
    .line 412
    .line 413
    invoke-virtual {v0, v9}, Lv20;->a(Ljava/util/ArrayList;)Lim;

    .line 414
    .line 415
    .line 416
    move-result-object v0

    .line 417
    :goto_7
    new-instance v9, Landroidx/work/WorkerParameters;

    .line 418
    .line 419
    invoke-static {v2}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    .line 420
    .line 421
    .line 422
    move-result-object v11

    .line 423
    iget-object v12, v1, Lwa1;->t:Ljava/util/ArrayList;

    .line 424
    .line 425
    iget-object v13, v1, Lwa1;->i:Lt83;

    .line 426
    .line 427
    iget-object v14, v1, Lwa1;->j:Loa1;

    .line 428
    .line 429
    iget v14, v14, Loa1;->k:I

    .line 430
    .line 431
    iget-object v15, v3, Lru0;->d:Ljava/lang/Object;

    .line 432
    .line 433
    check-cast v15, Ljava/util/concurrent/ExecutorService;

    .line 434
    .line 435
    iget-object v3, v3, Lru0;->f:Ljava/lang/Object;

    .line 436
    .line 437
    check-cast v3, Lua1;

    .line 438
    .line 439
    new-instance v6, Lla1;

    .line 440
    .line 441
    invoke-direct {v6, v8, v7}, Lla1;-><init>(Landroidx/work/impl/WorkDatabase;Lxb4;)V

    .line 442
    .line 443
    .line 444
    new-instance v5, Lfa1;

    .line 445
    .line 446
    move-object/from16 v18, v2

    .line 447
    .line 448
    iget-object v2, v1, Lwa1;->o:Lom0;

    .line 449
    .line 450
    invoke-direct {v5, v8, v2, v7}, Lfa1;-><init>(Landroidx/work/impl/WorkDatabase;Lom0;Lxb4;)V

    .line 451
    .line 452
    .line 453
    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    .line 454
    .line 455
    .line 456
    iput-object v11, v9, Landroidx/work/WorkerParameters;->a:Ljava/util/UUID;

    .line 457
    .line 458
    iput-object v0, v9, Landroidx/work/WorkerParameters;->b:Lim;

    .line 459
    .line 460
    new-instance v0, Ljava/util/HashSet;

    .line 461
    .line 462
    invoke-direct {v0, v12}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 463
    .line 464
    .line 465
    iput-object v0, v9, Landroidx/work/WorkerParameters;->c:Ljava/util/HashSet;

    .line 466
    .line 467
    iput-object v13, v9, Landroidx/work/WorkerParameters;->d:Lt83;

    .line 468
    .line 469
    iput v14, v9, Landroidx/work/WorkerParameters;->e:I

    .line 470
    .line 471
    iput-object v15, v9, Landroidx/work/WorkerParameters;->f:Ljava/util/concurrent/ExecutorService;

    .line 472
    .line 473
    iput-object v7, v9, Landroidx/work/WorkerParameters;->g:Lxb4;

    .line 474
    .line 475
    iput-object v3, v9, Landroidx/work/WorkerParameters;->h:Lua1;

    .line 476
    .line 477
    iput-object v6, v9, Landroidx/work/WorkerParameters;->i:Lla1;

    .line 478
    .line 479
    iput-object v5, v9, Landroidx/work/WorkerParameters;->j:Lfa1;

    .line 480
    .line 481
    iget-object v0, v1, Lwa1;->k:Landroidx/work/ListenableWorker;

    .line 482
    .line 483
    if-nez v0, :cond_d

    .line 484
    .line 485
    iget-object v0, v1, Lwa1;->f:Landroid/content/Context;

    .line 486
    .line 487
    iget-object v2, v1, Lwa1;->j:Loa1;

    .line 488
    .line 489
    iget-object v2, v2, Loa1;->c:Ljava/lang/String;

    .line 490
    .line 491
    invoke-virtual {v3, v0, v2, v9}, Lva1;->a(Landroid/content/Context;Ljava/lang/String;Landroidx/work/WorkerParameters;)Landroidx/work/ListenableWorker;

    .line 492
    .line 493
    .line 494
    move-result-object v0

    .line 495
    iput-object v0, v1, Lwa1;->k:Landroidx/work/ListenableWorker;

    .line 496
    .line 497
    :cond_d
    iget-object v0, v1, Lwa1;->k:Landroidx/work/ListenableWorker;

    .line 498
    .line 499
    if-nez v0, :cond_e

    .line 500
    .line 501
    invoke-static {}, Lh80;->d()Lh80;

    .line 502
    .line 503
    .line 504
    move-result-object v0

    .line 505
    iget-object v2, v1, Lwa1;->j:Loa1;

    .line 506
    .line 507
    iget-object v2, v2, Loa1;->c:Ljava/lang/String;

    .line 508
    .line 509
    new-instance v3, Ljava/lang/StringBuilder;

    .line 510
    .line 511
    const-string v4, "Could not create Worker "

    .line 512
    .line 513
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 514
    .line 515
    .line 516
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 517
    .line 518
    .line 519
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 520
    .line 521
    .line 522
    move-result-object v2

    .line 523
    const/4 v3, 0x0

    .line 524
    new-array v3, v3, [Ljava/lang/Throwable;

    .line 525
    .line 526
    invoke-virtual {v0, v10, v2, v3}, Lh80;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    .line 527
    .line 528
    .line 529
    invoke-virtual {v1}, Lwa1;->g()V

    .line 530
    .line 531
    .line 532
    goto/16 :goto_9

    .line 533
    .line 534
    :cond_e
    invoke-virtual {v0}, Landroidx/work/ListenableWorker;->isUsed()Z

    .line 535
    .line 536
    .line 537
    move-result v0

    .line 538
    if-eqz v0, :cond_f

    .line 539
    .line 540
    invoke-static {}, Lh80;->d()Lh80;

    .line 541
    .line 542
    .line 543
    move-result-object v0

    .line 544
    iget-object v2, v1, Lwa1;->j:Loa1;

    .line 545
    .line 546
    iget-object v2, v2, Loa1;->c:Ljava/lang/String;

    .line 547
    .line 548
    const-string v3, "Received an already-used Worker "

    .line 549
    .line 550
    const-string v4, "; WorkerFactory should return new instances"

    .line 551
    .line 552
    invoke-static {v3, v2, v4}, Lex0;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 553
    .line 554
    .line 555
    move-result-object v2

    .line 556
    const/4 v3, 0x0

    .line 557
    new-array v3, v3, [Ljava/lang/Throwable;

    .line 558
    .line 559
    invoke-virtual {v0, v10, v2, v3}, Lh80;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    .line 560
    .line 561
    .line 562
    invoke-virtual {v1}, Lwa1;->g()V

    .line 563
    .line 564
    .line 565
    goto/16 :goto_9

    .line 566
    .line 567
    :cond_f
    const/4 v3, 0x0

    .line 568
    iget-object v0, v1, Lwa1;->k:Landroidx/work/ListenableWorker;

    .line 569
    .line 570
    invoke-virtual {v0}, Landroidx/work/ListenableWorker;->setUsed()V

    .line 571
    .line 572
    .line 573
    invoke-virtual {v8}, Lpq0;->c()V

    .line 574
    .line 575
    .line 576
    move-object/from16 v2, v18

    .line 577
    .line 578
    :try_start_7
    invoke-virtual {v4, v2}, Lh2;->e(Ljava/lang/String;)I

    .line 579
    .line 580
    .line 581
    move-result v0

    .line 582
    const/4 v6, 0x1

    .line 583
    if-ne v0, v6, :cond_10

    .line 584
    .line 585
    filled-new-array {v2}, [Ljava/lang/String;

    .line 586
    .line 587
    .line 588
    move-result-object v0

    .line 589
    const/4 v3, 0x2

    .line 590
    invoke-virtual {v4, v3, v0}, Lh2;->n(I[Ljava/lang/String;)V

    .line 591
    .line 592
    .line 593
    invoke-virtual {v4, v2}, Lh2;->i(Ljava/lang/String;)V

    .line 594
    .line 595
    .line 596
    move v3, v6

    .line 597
    goto :goto_8

    .line 598
    :catchall_2
    move-exception v0

    .line 599
    goto :goto_a

    .line 600
    :cond_10
    :goto_8
    invoke-virtual {v8}, Lpq0;->h()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 601
    .line 602
    .line 603
    invoke-virtual {v8}, Lpq0;->f()V

    .line 604
    .line 605
    .line 606
    if-eqz v3, :cond_12

    .line 607
    .line 608
    invoke-virtual {v1}, Lwa1;->h()Z

    .line 609
    .line 610
    .line 611
    move-result v0

    .line 612
    if-eqz v0, :cond_11

    .line 613
    .line 614
    goto :goto_9

    .line 615
    :cond_11
    new-instance v2, Lou0;

    .line 616
    .line 617
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 618
    .line 619
    .line 620
    new-instance v17, Lda1;

    .line 621
    .line 622
    iget-object v0, v1, Lwa1;->f:Landroid/content/Context;

    .line 623
    .line 624
    iget-object v3, v1, Lwa1;->j:Loa1;

    .line 625
    .line 626
    iget-object v4, v1, Lwa1;->k:Landroidx/work/ListenableWorker;

    .line 627
    .line 628
    iget-object v6, v1, Lwa1;->l:Lxb4;

    .line 629
    .line 630
    move-object/from16 v18, v0

    .line 631
    .line 632
    move-object/from16 v19, v3

    .line 633
    .line 634
    move-object/from16 v20, v4

    .line 635
    .line 636
    move-object/from16 v21, v5

    .line 637
    .line 638
    move-object/from16 v22, v6

    .line 639
    .line 640
    invoke-direct/range {v17 .. v22}, Lda1;-><init>(Landroid/content/Context;Loa1;Landroidx/work/ListenableWorker;Lfa1;Lxb4;)V

    .line 641
    .line 642
    .line 643
    move-object/from16 v0, v17

    .line 644
    .line 645
    iget-object v3, v7, Lxb4;->i:Ljava/lang/Object;

    .line 646
    .line 647
    check-cast v3, Lia1;

    .line 648
    .line 649
    invoke-virtual {v3, v0}, Lia1;->execute(Ljava/lang/Runnable;)V

    .line 650
    .line 651
    .line 652
    new-instance v3, Lgi;

    .line 653
    .line 654
    const/4 v4, 0x7

    .line 655
    const/4 v5, 0x0

    .line 656
    iget-object v0, v0, Lda1;->f:Lou0;

    .line 657
    .line 658
    move-object/from16 v23, v2

    .line 659
    .line 660
    move-object v2, v0

    .line 661
    move-object v0, v3

    .line 662
    move-object/from16 v3, v23

    .line 663
    .line 664
    invoke-direct/range {v0 .. v5}, Lgi;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 665
    .line 666
    .line 667
    move-object v3, v2

    .line 668
    move-object/from16 v2, v23

    .line 669
    .line 670
    iget-object v4, v7, Lxb4;->i:Ljava/lang/Object;

    .line 671
    .line 672
    check-cast v4, Lia1;

    .line 673
    .line 674
    invoke-virtual {v3, v0, v4}, Ly;->c(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 675
    .line 676
    .line 677
    iget-object v3, v1, Lwa1;->u:Ljava/lang/String;

    .line 678
    .line 679
    new-instance v0, Lgi;

    .line 680
    .line 681
    const/16 v4, 0x8

    .line 682
    .line 683
    invoke-direct/range {v0 .. v5}, Lgi;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 684
    .line 685
    .line 686
    iget-object v1, v7, Lxb4;->g:Ljava/lang/Object;

    .line 687
    .line 688
    check-cast v1, Llu0;

    .line 689
    .line 690
    invoke-virtual {v2, v0, v1}, Ly;->c(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 691
    .line 692
    .line 693
    goto :goto_9

    .line 694
    :cond_12
    invoke-virtual/range {p0 .. p0}, Lwa1;->f()V

    .line 695
    .line 696
    .line 697
    :goto_9
    return-void

    .line 698
    :goto_a
    invoke-virtual {v8}, Lpq0;->f()V

    .line 699
    .line 700
    .line 701
    throw v0

    .line 702
    :goto_b
    invoke-interface {v11}, Landroid/database/Cursor;->close()V

    .line 703
    .line 704
    .line 705
    invoke-virtual {v12}, Lrq0;->k()V

    .line 706
    .line 707
    .line 708
    throw v0

    .line 709
    :goto_c
    invoke-virtual {v8}, Lpq0;->f()V

    .line 710
    .line 711
    .line 712
    throw v0
.end method
