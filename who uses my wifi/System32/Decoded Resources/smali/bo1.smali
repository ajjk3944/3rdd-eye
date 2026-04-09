.class public final Lbo1;
.super Ljava/lang/Thread;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# static fields
.field public static final l:Z


# instance fields
.field public final f:Ljava/util/concurrent/BlockingQueue;

.field public final g:Ljava/util/concurrent/BlockingQueue;

.field public final h:Lwo1;

.field public volatile i:Z

.field public final j:Lmc2;

.field public final k:Lf20;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-boolean v0, Lro1;->a:Z

    .line 2
    .line 3
    sput-boolean v0, Lbo1;->l:Z

    .line 4
    .line 5
    return-void
.end method

.method public constructor <init>(Ljava/util/concurrent/PriorityBlockingQueue;Ljava/util/concurrent/PriorityBlockingQueue;Lwo1;Lf20;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lbo1;->i:Z

    .line 6
    .line 7
    iput-object p1, p0, Lbo1;->f:Ljava/util/concurrent/BlockingQueue;

    .line 8
    .line 9
    iput-object p2, p0, Lbo1;->g:Ljava/util/concurrent/BlockingQueue;

    .line 10
    .line 11
    iput-object p3, p0, Lbo1;->h:Lwo1;

    .line 12
    .line 13
    iput-object p4, p0, Lbo1;->k:Lf20;

    .line 14
    .line 15
    new-instance p1, Lmc2;

    .line 16
    .line 17
    invoke-direct {p1, p0, p2, p4}, Lmc2;-><init>(Lbo1;Ljava/util/concurrent/BlockingQueue;Lf20;)V

    .line 18
    .line 19
    .line 20
    iput-object p1, p0, Lbo1;->j:Lmc2;

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 14

    .line 1
    iget-object v0, p0, Lbo1;->f:Ljava/util/concurrent/BlockingQueue;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/concurrent/BlockingQueue;->take()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    move-object v1, v0

    .line 8
    check-cast v1, Ljo1;

    .line 9
    .line 10
    const-string v0, "cache-queue-take"

    .line 11
    .line 12
    invoke-virtual {v1, v0}, Ljo1;->a(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1}, Ljo1;->c()V

    .line 16
    .line 17
    .line 18
    :try_start_0
    iget-object v2, v1, Ljo1;->j:Ljava/lang/Object;

    .line 19
    .line 20
    monitor-enter v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 22
    :try_start_2
    iget-object v2, p0, Lbo1;->h:Lwo1;

    .line 23
    .line 24
    invoke-virtual {v1}, Ljo1;->d()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-virtual {v2, v0}, Lwo1;->a(Ljava/lang/String;)Lao1;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    if-nez v0, :cond_0

    .line 33
    .line 34
    const-string v0, "cache-miss"

    .line 35
    .line 36
    invoke-virtual {v1, v0}, Ljo1;->a(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    iget-object v0, p0, Lbo1;->j:Lmc2;

    .line 40
    .line 41
    invoke-virtual {v0, v1}, Lmc2;->u(Ljo1;)Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-nez v0, :cond_8

    .line 46
    .line 47
    iget-object v0, p0, Lbo1;->g:Ljava/util/concurrent/BlockingQueue;

    .line 48
    .line 49
    invoke-interface {v0, v1}, Ljava/util/concurrent/BlockingQueue;->put(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    goto/16 :goto_3

    .line 53
    .line 54
    :catchall_0
    move-exception v0

    .line 55
    goto/16 :goto_4

    .line 56
    .line 57
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 58
    .line 59
    .line 60
    move-result-wide v3

    .line 61
    iget-wide v5, v0, Lao1;->e:J

    .line 62
    .line 63
    cmp-long v5, v5, v3

    .line 64
    .line 65
    const/4 v6, 0x0

    .line 66
    const/4 v7, 0x1

    .line 67
    if-gez v5, :cond_1

    .line 68
    .line 69
    move v5, v7

    .line 70
    goto :goto_0

    .line 71
    :cond_1
    move v5, v6

    .line 72
    :goto_0
    if-eqz v5, :cond_2

    .line 73
    .line 74
    const-string v2, "cache-hit-expired"

    .line 75
    .line 76
    invoke-virtual {v1, v2}, Ljo1;->a(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    iput-object v0, v1, Ljo1;->o:Lao1;

    .line 80
    .line 81
    iget-object v0, p0, Lbo1;->j:Lmc2;

    .line 82
    .line 83
    invoke-virtual {v0, v1}, Lmc2;->u(Ljo1;)Z

    .line 84
    .line 85
    .line 86
    move-result v0

    .line 87
    if-nez v0, :cond_8

    .line 88
    .line 89
    iget-object v0, p0, Lbo1;->g:Ljava/util/concurrent/BlockingQueue;

    .line 90
    .line 91
    invoke-interface {v0, v1}, Ljava/util/concurrent/BlockingQueue;->put(Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    goto/16 :goto_3

    .line 95
    .line 96
    :cond_2
    const-string v5, "cache-hit"

    .line 97
    .line 98
    invoke-virtual {v1, v5}, Ljo1;->a(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    new-instance v8, Lho1;

    .line 102
    .line 103
    iget-object v10, v0, Lao1;->a:[B

    .line 104
    .line 105
    iget-object v11, v0, Lao1;->g:Ljava/util/Map;

    .line 106
    .line 107
    invoke-static {v11}, Lho1;->a(Ljava/util/Map;)Ljava/util/List;

    .line 108
    .line 109
    .line 110
    move-result-object v12

    .line 111
    const/4 v13, 0x0

    .line 112
    const/16 v9, 0xc8

    .line 113
    .line 114
    invoke-direct/range {v8 .. v13}, Lho1;-><init>(I[BLjava/util/Map;Ljava/util/List;Z)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v1, v8}, Ljo1;->h(Lho1;)Lrl;

    .line 118
    .line 119
    .line 120
    move-result-object v5

    .line 121
    const-string v8, "cache-hit-parsed"

    .line 122
    .line 123
    invoke-virtual {v1, v8}, Ljo1;->a(Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    iget-object v8, v5, Lrl;->i:Ljava/lang/Object;

    .line 127
    .line 128
    check-cast v8, Loo1;

    .line 129
    .line 130
    if-nez v8, :cond_3

    .line 131
    .line 132
    move v6, v7

    .line 133
    :cond_3
    const/4 v8, 0x0

    .line 134
    if-nez v6, :cond_5

    .line 135
    .line 136
    const-string v0, "cache-parsing-failed"

    .line 137
    .line 138
    invoke-virtual {v1, v0}, Ljo1;->a(Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {v1}, Ljo1;->d()Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    monitor-enter v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 146
    :try_start_3
    invoke-virtual {v2, v0}, Lwo1;->a(Ljava/lang/String;)Lao1;

    .line 147
    .line 148
    .line 149
    move-result-object v3

    .line 150
    if-eqz v3, :cond_4

    .line 151
    .line 152
    const-wide/16 v4, 0x0

    .line 153
    .line 154
    iput-wide v4, v3, Lao1;->f:J

    .line 155
    .line 156
    iput-wide v4, v3, Lao1;->e:J

    .line 157
    .line 158
    invoke-virtual {v2, v0, v3}, Lwo1;->b(Ljava/lang/String;Lao1;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 159
    .line 160
    .line 161
    goto :goto_1

    .line 162
    :catchall_1
    move-exception v0

    .line 163
    goto :goto_2

    .line 164
    :cond_4
    :goto_1
    :try_start_4
    monitor-exit v2

    .line 165
    iput-object v8, v1, Ljo1;->o:Lao1;

    .line 166
    .line 167
    iget-object v0, p0, Lbo1;->j:Lmc2;

    .line 168
    .line 169
    invoke-virtual {v0, v1}, Lmc2;->u(Ljo1;)Z

    .line 170
    .line 171
    .line 172
    move-result v0

    .line 173
    if-nez v0, :cond_8

    .line 174
    .line 175
    iget-object v0, p0, Lbo1;->g:Ljava/util/concurrent/BlockingQueue;

    .line 176
    .line 177
    invoke-interface {v0, v1}, Ljava/util/concurrent/BlockingQueue;->put(Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 178
    .line 179
    .line 180
    goto :goto_3

    .line 181
    :goto_2
    :try_start_5
    monitor-exit v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 182
    :try_start_6
    throw v0

    .line 183
    :cond_5
    iget-wide v9, v0, Lao1;->f:J

    .line 184
    .line 185
    cmp-long v2, v9, v3

    .line 186
    .line 187
    if-gez v2, :cond_7

    .line 188
    .line 189
    const-string v2, "cache-hit-refresh-needed"

    .line 190
    .line 191
    invoke-virtual {v1, v2}, Ljo1;->a(Ljava/lang/String;)V

    .line 192
    .line 193
    .line 194
    iput-object v0, v1, Ljo1;->o:Lao1;

    .line 195
    .line 196
    iput-boolean v7, v5, Lrl;->f:Z

    .line 197
    .line 198
    iget-object v0, p0, Lbo1;->j:Lmc2;

    .line 199
    .line 200
    invoke-virtual {v0, v1}, Lmc2;->u(Ljo1;)Z

    .line 201
    .line 202
    .line 203
    move-result v0

    .line 204
    if-nez v0, :cond_6

    .line 205
    .line 206
    iget-object v0, p0, Lbo1;->k:Lf20;

    .line 207
    .line 208
    new-instance v2, Ljq3;

    .line 209
    .line 210
    const/16 v3, 0x17

    .line 211
    .line 212
    const/4 v4, 0x0

    .line 213
    invoke-direct {v2, p0, v1, v3, v4}, Ljq3;-><init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 214
    .line 215
    .line 216
    invoke-virtual {v0, v1, v5, v2}, Lf20;->l(Ljo1;Lrl;Ljq3;)V

    .line 217
    .line 218
    .line 219
    goto :goto_3

    .line 220
    :cond_6
    iget-object v0, p0, Lbo1;->k:Lf20;

    .line 221
    .line 222
    invoke-virtual {v0, v1, v5, v8}, Lf20;->l(Ljo1;Lrl;Ljq3;)V

    .line 223
    .line 224
    .line 225
    goto :goto_3

    .line 226
    :cond_7
    iget-object v0, p0, Lbo1;->k:Lf20;

    .line 227
    .line 228
    invoke-virtual {v0, v1, v5, v8}, Lf20;->l(Ljo1;Lrl;Ljq3;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 229
    .line 230
    .line 231
    :cond_8
    :goto_3
    invoke-virtual {v1}, Ljo1;->c()V

    .line 232
    .line 233
    .line 234
    return-void

    .line 235
    :catchall_2
    move-exception v0

    .line 236
    :try_start_7
    monitor-exit v2
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 237
    :try_start_8
    throw v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 238
    :goto_4
    invoke-virtual {v1}, Ljo1;->c()V

    .line 239
    .line 240
    .line 241
    throw v0
.end method

.method public final run()V
    .locals 3

    .line 1
    sget-boolean v0, Lbo1;->l:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    new-array v0, v1, [Ljava/lang/Object;

    .line 7
    .line 8
    const-string v2, "start new dispatcher"

    .line 9
    .line 10
    invoke-static {v2, v0}, Lro1;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    :cond_0
    const/16 v0, 0xa

    .line 14
    .line 15
    invoke-static {v0}, Landroid/os/Process;->setThreadPriority(I)V

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, Lbo1;->h:Lwo1;

    .line 19
    .line 20
    invoke-virtual {v0}, Lwo1;->c()V

    .line 21
    .line 22
    .line 23
    :goto_0
    :try_start_0
    invoke-virtual {p0}, Lbo1;->a()V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :catch_0
    iget-boolean v0, p0, Lbo1;->i:Z

    .line 28
    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :cond_1
    new-array v0, v1, [Ljava/lang/Object;

    .line 40
    .line 41
    const-string v2, "Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it"

    .line 42
    .line 43
    invoke-static {v2, v0}, Lro1;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    goto :goto_0
.end method
