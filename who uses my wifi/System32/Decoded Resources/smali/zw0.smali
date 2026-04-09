.class public final Lzw0;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Landroid/os/Handler$Callback;


# instance fields
.field public final synthetic f:I

.field public final synthetic g:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lzw0;->f:I

    .line 2
    .line 3
    iput-object p2, p0, Lzw0;->g:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)Z
    .locals 7

    .line 1
    iget v0, p0, Lzw0;->f:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const-string v0, "Timeout waiting for ServiceConnection callback "

    .line 7
    .line 8
    iget v1, p1, Landroid/os/Message;->what:I

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    const/4 v3, 0x1

    .line 12
    if-eqz v1, :cond_4

    .line 13
    .line 14
    if-eq v1, v3, :cond_0

    .line 15
    .line 16
    goto/16 :goto_4

    .line 17
    .line 18
    :cond_0
    iget-object v1, p0, Lzw0;->g:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v1, Lnf4;

    .line 21
    .line 22
    iget-object v1, v1, Lnf4;->a:Ljava/util/HashMap;

    .line 23
    .line 24
    monitor-enter v1

    .line 25
    :try_start_0
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast p1, Lkd4;

    .line 28
    .line 29
    iget-object v2, p0, Lzw0;->g:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v2, Lnf4;

    .line 32
    .line 33
    iget-object v2, v2, Lnf4;->a:Ljava/util/HashMap;

    .line 34
    .line 35
    invoke-virtual {v2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    check-cast v2, Lud4;

    .line 40
    .line 41
    if-eqz v2, :cond_3

    .line 42
    .line 43
    iget v4, v2, Lud4;->b:I

    .line 44
    .line 45
    const/4 v5, 0x3

    .line 46
    if-ne v4, v5, :cond_3

    .line 47
    .line 48
    const-string v4, "GmsClientSupervisor"

    .line 49
    .line 50
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v5

    .line 54
    invoke-virtual {v0, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    new-instance v5, Ljava/lang/Exception;

    .line 59
    .line 60
    invoke-direct {v5}, Ljava/lang/Exception;-><init>()V

    .line 61
    .line 62
    .line 63
    invoke-static {v4, v0, v5}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 64
    .line 65
    .line 66
    iget-object v0, v2, Lud4;->f:Landroid/content/ComponentName;

    .line 67
    .line 68
    if-nez v0, :cond_1

    .line 69
    .line 70
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    const/4 v0, 0x0

    .line 74
    goto :goto_0

    .line 75
    :catchall_0
    move-exception p1

    .line 76
    goto :goto_2

    .line 77
    :cond_1
    :goto_0
    if-nez v0, :cond_2

    .line 78
    .line 79
    new-instance v0, Landroid/content/ComponentName;

    .line 80
    .line 81
    iget-object p1, p1, Lkd4;->b:Ljava/lang/String;

    .line 82
    .line 83
    invoke-static {p1}, Lou1;->j(Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    const-string v4, "unknown"

    .line 87
    .line 88
    invoke-direct {v0, p1, v4}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    :cond_2
    invoke-virtual {v2, v0}, Lud4;->onServiceDisconnected(Landroid/content/ComponentName;)V

    .line 92
    .line 93
    .line 94
    :cond_3
    monitor-exit v1

    .line 95
    :goto_1
    move v2, v3

    .line 96
    goto :goto_4

    .line 97
    :goto_2
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 98
    throw p1

    .line 99
    :cond_4
    iget-object v0, p0, Lzw0;->g:Ljava/lang/Object;

    .line 100
    .line 101
    check-cast v0, Lnf4;

    .line 102
    .line 103
    iget-object v0, v0, Lnf4;->a:Ljava/util/HashMap;

    .line 104
    .line 105
    monitor-enter v0

    .line 106
    :try_start_1
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 107
    .line 108
    check-cast p1, Lkd4;

    .line 109
    .line 110
    iget-object v1, p0, Lzw0;->g:Ljava/lang/Object;

    .line 111
    .line 112
    check-cast v1, Lnf4;

    .line 113
    .line 114
    iget-object v1, v1, Lnf4;->a:Ljava/util/HashMap;

    .line 115
    .line 116
    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    check-cast v1, Lud4;

    .line 121
    .line 122
    if-eqz v1, :cond_6

    .line 123
    .line 124
    iget-object v4, v1, Lud4;->a:Ljava/util/HashMap;

    .line 125
    .line 126
    invoke-virtual {v4}, Ljava/util/HashMap;->isEmpty()Z

    .line 127
    .line 128
    .line 129
    move-result v4

    .line 130
    if-eqz v4, :cond_6

    .line 131
    .line 132
    iget-boolean v4, v1, Lud4;->c:Z

    .line 133
    .line 134
    if-eqz v4, :cond_5

    .line 135
    .line 136
    iget-object v4, v1, Lud4;->e:Lkd4;

    .line 137
    .line 138
    iget-object v5, v1, Lud4;->g:Lnf4;

    .line 139
    .line 140
    iget-object v5, v5, Lnf4;->c:Lwc1;

    .line 141
    .line 142
    invoke-virtual {v5, v3, v4}, Landroid/os/Handler;->removeMessages(ILjava/lang/Object;)V

    .line 143
    .line 144
    .line 145
    iget-object v4, v1, Lud4;->g:Lnf4;

    .line 146
    .line 147
    iget-object v5, v4, Lnf4;->d:Lsq0;

    .line 148
    .line 149
    iget-object v4, v4, Lnf4;->b:Landroid/content/Context;

    .line 150
    .line 151
    invoke-virtual {v5, v4, v1}, Lsq0;->o(Landroid/content/Context;Landroid/content/ServiceConnection;)V

    .line 152
    .line 153
    .line 154
    iput-boolean v2, v1, Lud4;->c:Z

    .line 155
    .line 156
    const/4 v2, 0x2

    .line 157
    iput v2, v1, Lud4;->b:I

    .line 158
    .line 159
    :cond_5
    iget-object v1, p0, Lzw0;->g:Ljava/lang/Object;

    .line 160
    .line 161
    check-cast v1, Lnf4;

    .line 162
    .line 163
    iget-object v1, v1, Lnf4;->a:Ljava/util/HashMap;

    .line 164
    .line 165
    invoke-virtual {v1, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    goto :goto_3

    .line 169
    :catchall_1
    move-exception p1

    .line 170
    goto :goto_5

    .line 171
    :cond_6
    :goto_3
    monitor-exit v0

    .line 172
    goto :goto_1

    .line 173
    :goto_4
    return v2

    .line 174
    :goto_5
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 175
    throw p1

    .line 176
    :pswitch_0
    iget-object p1, p0, Lzw0;->g:Ljava/lang/Object;

    .line 177
    .line 178
    check-cast p1, Lmu2;

    .line 179
    .line 180
    iget-object v0, p1, Lmu2;->f:Ljava/lang/Object;

    .line 181
    .line 182
    check-cast v0, Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 183
    .line 184
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    .line 185
    .line 186
    .line 187
    move-result-object v0

    .line 188
    :cond_7
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 189
    .line 190
    .line 191
    move-result v1

    .line 192
    const/4 v2, 0x1

    .line 193
    if-eqz v1, :cond_9

    .line 194
    .line 195
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    move-result-object v1

    .line 199
    check-cast v1, Lht2;

    .line 200
    .line 201
    iget-object v3, p1, Lmu2;->e:Ljava/lang/Object;

    .line 202
    .line 203
    check-cast v3, Lvs2;

    .line 204
    .line 205
    iget-boolean v4, v1, Lht2;->d:Z

    .line 206
    .line 207
    if-nez v4, :cond_8

    .line 208
    .line 209
    iget-boolean v4, v1, Lht2;->c:Z

    .line 210
    .line 211
    if-eqz v4, :cond_8

    .line 212
    .line 213
    iget-object v4, v1, Lht2;->b:Lnb;

    .line 214
    .line 215
    invoke-virtual {v4}, Lnb;->g()Lof4;

    .line 216
    .line 217
    .line 218
    move-result-object v4

    .line 219
    new-instance v5, Lnb;

    .line 220
    .line 221
    const/4 v6, 0x6

    .line 222
    invoke-direct {v5, v6}, Lnb;-><init>(I)V

    .line 223
    .line 224
    .line 225
    iput-object v5, v1, Lht2;->b:Lnb;

    .line 226
    .line 227
    const/4 v5, 0x0

    .line 228
    iput-boolean v5, v1, Lht2;->c:Z

    .line 229
    .line 230
    iget-object v1, v1, Lht2;->a:Ljava/lang/Object;

    .line 231
    .line 232
    invoke-interface {v3, v1, v4}, Lvs2;->e(Ljava/lang/Object;Lof4;)V

    .line 233
    .line 234
    .line 235
    :cond_8
    iget-object v1, p1, Lmu2;->d:Ljava/lang/Object;

    .line 236
    .line 237
    check-cast v1, Ld13;

    .line 238
    .line 239
    iget-object v1, v1, Ld13;->a:Landroid/os/Handler;

    .line 240
    .line 241
    invoke-virtual {v1, v2}, Landroid/os/Handler;->hasMessages(I)Z

    .line 242
    .line 243
    .line 244
    move-result v1

    .line 245
    if-eqz v1, :cond_7

    .line 246
    .line 247
    :cond_9
    return v2

    .line 248
    :pswitch_1
    iget v0, p1, Landroid/os/Message;->what:I

    .line 249
    .line 250
    if-eqz v0, :cond_a

    .line 251
    .line 252
    const/4 p1, 0x0

    .line 253
    return p1

    .line 254
    :cond_a
    iget-object v0, p0, Lzw0;->g:Ljava/lang/Object;

    .line 255
    .line 256
    check-cast v0, Lax0;

    .line 257
    .line 258
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 259
    .line 260
    if-nez p1, :cond_b

    .line 261
    .line 262
    iget-object p1, v0, Lax0;->f:Ljava/lang/Object;

    .line 263
    .line 264
    monitor-enter p1

    .line 265
    const/4 v0, 0x0

    .line 266
    :try_start_2
    throw v0

    .line 267
    :catchall_2
    move-exception v0

    .line 268
    monitor-exit p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 269
    throw v0

    .line 270
    :cond_b
    new-instance p1, Ljava/lang/ClassCastException;

    .line 271
    .line 272
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 273
    .line 274
    .line 275
    throw p1

    .line 276
    nop

    .line 277
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
