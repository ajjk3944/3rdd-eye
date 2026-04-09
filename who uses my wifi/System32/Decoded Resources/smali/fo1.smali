.class public final Lfo1;
.super Ljava/lang/Thread;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final f:Ljava/util/concurrent/BlockingQueue;

.field public final g:Leo1;

.field public final h:Lwo1;

.field public volatile i:Z

.field public final j:Lf20;


# direct methods
.method public constructor <init>(Ljava/util/concurrent/PriorityBlockingQueue;Lvq2;Lwo1;Lf20;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lfo1;->i:Z

    .line 6
    .line 7
    iput-object p1, p0, Lfo1;->f:Ljava/util/concurrent/BlockingQueue;

    .line 8
    .line 9
    iput-object p2, p0, Lfo1;->g:Leo1;

    .line 10
    .line 11
    iput-object p3, p0, Lfo1;->h:Lwo1;

    .line 12
    .line 13
    iput-object p4, p0, Lfo1;->j:Lf20;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 7

    .line 1
    iget-object v0, p0, Lfo1;->j:Lf20;

    .line 2
    .line 3
    iget-object v1, p0, Lfo1;->f:Ljava/util/concurrent/BlockingQueue;

    .line 4
    .line 5
    invoke-interface {v1}, Ljava/util/concurrent/BlockingQueue;->take()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    check-cast v1, Ljo1;

    .line 10
    .line 11
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1}, Ljo1;->c()V

    .line 15
    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    :try_start_0
    const-string v3, "network-queue-take"

    .line 19
    .line 20
    invoke-virtual {v1, v3}, Ljo1;->a(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    iget-object v3, v1, Ljo1;->j:Ljava/lang/Object;

    .line 24
    .line 25
    monitor-enter v3
    :try_end_0
    .catch Loo1; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    :try_start_1
    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 27
    :try_start_2
    iget v3, v1, Ljo1;->i:I

    .line 28
    .line 29
    invoke-static {v3}, Landroid/net/TrafficStats;->setThreadStatsTag(I)V

    .line 30
    .line 31
    .line 32
    iget-object v3, p0, Lfo1;->g:Leo1;

    .line 33
    .line 34
    invoke-interface {v3, v1}, Leo1;->c(Ljo1;)Lho1;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    const-string v4, "network-http-complete"

    .line 39
    .line 40
    invoke-virtual {v1, v4}, Ljo1;->a(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    iget-boolean v4, v3, Lho1;->e:Z

    .line 44
    .line 45
    if-eqz v4, :cond_0

    .line 46
    .line 47
    invoke-virtual {v1}, Ljo1;->g()Z

    .line 48
    .line 49
    .line 50
    move-result v4

    .line 51
    if-eqz v4, :cond_0

    .line 52
    .line 53
    const-string v3, "not-modified"

    .line 54
    .line 55
    invoke-virtual {v1, v3}, Ljo1;->b(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v1}, Ljo1;->k()V

    .line 59
    .line 60
    .line 61
    goto/16 :goto_2

    .line 62
    .line 63
    :catchall_0
    move-exception v0

    .line 64
    goto/16 :goto_3

    .line 65
    .line 66
    :catch_0
    move-exception v3

    .line 67
    goto :goto_0

    .line 68
    :catch_1
    move-exception v3

    .line 69
    goto :goto_1

    .line 70
    :cond_0
    invoke-virtual {v1, v3}, Ljo1;->h(Lho1;)Lrl;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    const-string v4, "network-parse-complete"

    .line 75
    .line 76
    invoke-virtual {v1, v4}, Ljo1;->a(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    iget-object v4, v3, Lrl;->h:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast v4, Lao1;

    .line 82
    .line 83
    if-eqz v4, :cond_1

    .line 84
    .line 85
    iget-object v5, p0, Lfo1;->h:Lwo1;

    .line 86
    .line 87
    invoke-virtual {v1}, Ljo1;->d()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v6

    .line 91
    invoke-virtual {v5, v6, v4}, Lwo1;->b(Ljava/lang/String;Lao1;)V

    .line 92
    .line 93
    .line 94
    const-string v4, "network-cache-written"

    .line 95
    .line 96
    invoke-virtual {v1, v4}, Ljo1;->a(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    :cond_1
    iget-object v4, v1, Ljo1;->j:Ljava/lang/Object;

    .line 100
    .line 101
    monitor-enter v4
    :try_end_2
    .catch Loo1; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 102
    const/4 v5, 0x1

    .line 103
    :try_start_3
    iput-boolean v5, v1, Ljo1;->n:Z

    .line 104
    .line 105
    monitor-exit v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 106
    :try_start_4
    invoke-virtual {v0, v1, v3, v2}, Lf20;->l(Ljo1;Lrl;Ljq3;)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v1, v3}, Ljo1;->j(Lrl;)V
    :try_end_4
    .catch Loo1; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 110
    .line 111
    .line 112
    goto :goto_2

    .line 113
    :catchall_1
    move-exception v3

    .line 114
    :try_start_5
    monitor-exit v4
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 115
    :try_start_6
    throw v3
    :try_end_6
    .catch Loo1; {:try_start_6 .. :try_end_6} :catch_1
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_0
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 116
    :catchall_2
    move-exception v4

    .line 117
    :try_start_7
    monitor-exit v3
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 118
    :try_start_8
    throw v4
    :try_end_8
    .catch Loo1; {:try_start_8 .. :try_end_8} :catch_1
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_0
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 119
    :goto_0
    :try_start_9
    const-string v4, "Unhandled exception %s"

    .line 120
    .line 121
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v5

    .line 125
    filled-new-array {v5}, [Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v5

    .line 129
    const-string v6, "Volley"

    .line 130
    .line 131
    invoke-static {v4, v5}, Lro1;->c(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v4

    .line 135
    invoke-static {v6, v4, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 136
    .line 137
    .line 138
    new-instance v4, Loo1;

    .line 139
    .line 140
    invoke-direct {v4, v3}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    .line 141
    .line 142
    .line 143
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 144
    .line 145
    .line 146
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 147
    .line 148
    .line 149
    const-string v3, "post-error"

    .line 150
    .line 151
    invoke-virtual {v1, v3}, Ljo1;->a(Ljava/lang/String;)V

    .line 152
    .line 153
    .line 154
    new-instance v3, Lrl;

    .line 155
    .line 156
    invoke-direct {v3, v4}, Lrl;-><init>(Loo1;)V

    .line 157
    .line 158
    .line 159
    new-instance v4, Lgi;

    .line 160
    .line 161
    const/16 v5, 0xb

    .line 162
    .line 163
    invoke-direct {v4, v1, v3, v2, v5}, Lgi;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 164
    .line 165
    .line 166
    iget-object v0, v0, Lf20;->g:Ljava/lang/Object;

    .line 167
    .line 168
    check-cast v0, Lvb1;

    .line 169
    .line 170
    iget-object v0, v0, Lvb1;->g:Landroid/os/Handler;

    .line 171
    .line 172
    invoke-virtual {v0, v4}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 173
    .line 174
    .line 175
    invoke-virtual {v1}, Ljo1;->k()V

    .line 176
    .line 177
    .line 178
    goto :goto_2

    .line 179
    :goto_1
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 180
    .line 181
    .line 182
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 183
    .line 184
    .line 185
    const-string v4, "post-error"

    .line 186
    .line 187
    invoke-virtual {v1, v4}, Ljo1;->a(Ljava/lang/String;)V

    .line 188
    .line 189
    .line 190
    new-instance v4, Lrl;

    .line 191
    .line 192
    invoke-direct {v4, v3}, Lrl;-><init>(Loo1;)V

    .line 193
    .line 194
    .line 195
    new-instance v3, Lgi;

    .line 196
    .line 197
    const/16 v5, 0xb

    .line 198
    .line 199
    invoke-direct {v3, v1, v4, v2, v5}, Lgi;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 200
    .line 201
    .line 202
    iget-object v0, v0, Lf20;->g:Ljava/lang/Object;

    .line 203
    .line 204
    check-cast v0, Lvb1;

    .line 205
    .line 206
    iget-object v0, v0, Lvb1;->g:Landroid/os/Handler;

    .line 207
    .line 208
    invoke-virtual {v0, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 209
    .line 210
    .line 211
    invoke-virtual {v1}, Ljo1;->k()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    .line 212
    .line 213
    .line 214
    :goto_2
    invoke-virtual {v1}, Ljo1;->c()V

    .line 215
    .line 216
    .line 217
    return-void

    .line 218
    :goto_3
    invoke-virtual {v1}, Ljo1;->c()V

    .line 219
    .line 220
    .line 221
    throw v0
.end method

.method public final run()V
    .locals 2

    .line 1
    const/16 v0, 0xa

    .line 2
    .line 3
    invoke-static {v0}, Landroid/os/Process;->setThreadPriority(I)V

    .line 4
    .line 5
    .line 6
    :goto_0
    :try_start_0
    invoke-virtual {p0}, Lfo1;->a()V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    .line 8
    .line 9
    goto :goto_0

    .line 10
    :catch_0
    iget-boolean v0, p0, Lfo1;->i:Z

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :cond_0
    const/4 v0, 0x0

    .line 23
    new-array v0, v0, [Ljava/lang/Object;

    .line 24
    .line 25
    const-string v1, "Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it"

    .line 26
    .line 27
    invoke-static {v1, v0}, Lro1;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0
.end method
