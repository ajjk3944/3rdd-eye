.class public final Lq3;
.super Landroid/os/Handler;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final synthetic a:I

.field public b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, Lq3;->a:I

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method

.method public constructor <init>(Lbm0;Landroid/os/Looper;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lq3;->a:I

    .line 3
    iput-object p1, p0, Lq3;->b:Ljava/lang/Object;

    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-void
.end method

.method public constructor <init>(Lvf4;Landroid/os/Looper;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lq3;->a:I

    .line 2
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lq3;->b:Ljava/lang/Object;

    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)V
    .locals 11

    .line 1
    iget v0, p0, Lq3;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lq3;->b:Ljava/lang/Object;

    .line 7
    .line 8
    move-object v1, v0

    .line 9
    check-cast v1, Lvf4;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    iget v0, p1, Landroid/os/Message;->what:I

    .line 15
    .line 16
    const/4 v2, 0x1

    .line 17
    const/4 v3, 0x0

    .line 18
    if-eq v0, v2, :cond_9

    .line 19
    .line 20
    const/4 v2, 0x2

    .line 21
    if-eq v0, v2, :cond_6

    .line 22
    .line 23
    const/4 v2, 0x3

    .line 24
    if-eq v0, v2, :cond_5

    .line 25
    .line 26
    const/4 v2, 0x4

    .line 27
    if-eq v0, v2, :cond_2

    .line 28
    .line 29
    iget-object v0, v1, Lvf4;->d:Ljava/util/concurrent/atomic/AtomicReference;

    .line 30
    .line 31
    new-instance v2, Ljava/lang/IllegalStateException;

    .line 32
    .line 33
    iget p1, p1, Landroid/os/Message;->what:I

    .line 34
    .line 35
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-direct {v2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    :cond_0
    invoke-virtual {v0, v3, v2}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    if-eqz p1, :cond_1

    .line 47
    .line 48
    goto/16 :goto_2

    .line 49
    .line 50
    :cond_1
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    if-eqz p1, :cond_0

    .line 55
    .line 56
    goto/16 :goto_2

    .line 57
    .line 58
    :cond_2
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast p1, Landroid/os/Bundle;

    .line 61
    .line 62
    :try_start_0
    iget-object v0, v1, Lvf4;->a:Landroid/media/MediaCodec;

    .line 63
    .line 64
    invoke-virtual {v0, p1}, Landroid/media/MediaCodec;->setParameters(Landroid/os/Bundle;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 65
    .line 66
    .line 67
    goto/16 :goto_2

    .line 68
    .line 69
    :catch_0
    move-exception v0

    .line 70
    move-object p1, v0

    .line 71
    iget-object v0, v1, Lvf4;->d:Ljava/util/concurrent/atomic/AtomicReference;

    .line 72
    .line 73
    :cond_3
    invoke-virtual {v0, v3, p1}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v1

    .line 77
    if-eqz v1, :cond_4

    .line 78
    .line 79
    goto :goto_2

    .line 80
    :cond_4
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    if-eqz v1, :cond_3

    .line 85
    .line 86
    goto :goto_2

    .line 87
    :cond_5
    iget-object p1, v1, Lvf4;->e:Lhp2;

    .line 88
    .line 89
    invoke-virtual {p1}, Lhp2;->a()Z

    .line 90
    .line 91
    .line 92
    goto :goto_2

    .line 93
    :cond_6
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 94
    .line 95
    move-object v2, p1

    .line 96
    check-cast v2, Luf4;

    .line 97
    .line 98
    iget v5, v2, Luf4;->a:I

    .line 99
    .line 100
    iget-object v7, v2, Luf4;->c:Landroid/media/MediaCodec$CryptoInfo;

    .line 101
    .line 102
    iget-wide v8, v2, Luf4;->d:J

    .line 103
    .line 104
    iget v10, v2, Luf4;->e:I

    .line 105
    .line 106
    :try_start_1
    sget-object p1, Lvf4;->h:Ljava/lang/Object;

    .line 107
    .line 108
    monitor-enter p1
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_1

    .line 109
    :try_start_2
    iget-object v4, v1, Lvf4;->a:Landroid/media/MediaCodec;

    .line 110
    .line 111
    const/4 v6, 0x0

    .line 112
    invoke-virtual/range {v4 .. v10}, Landroid/media/MediaCodec;->queueSecureInputBuffer(IILandroid/media/MediaCodec$CryptoInfo;JI)V

    .line 113
    .line 114
    .line 115
    monitor-exit p1

    .line 116
    goto :goto_0

    .line 117
    :catchall_0
    move-exception v0

    .line 118
    monitor-exit p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 119
    :try_start_3
    throw v0
    :try_end_3
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_1

    .line 120
    :catch_1
    move-exception v0

    .line 121
    move-object p1, v0

    .line 122
    iget-object v4, v1, Lvf4;->d:Ljava/util/concurrent/atomic/AtomicReference;

    .line 123
    .line 124
    :cond_7
    invoke-virtual {v4, v3, v0}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    move-result p1

    .line 128
    if-eqz p1, :cond_8

    .line 129
    .line 130
    goto :goto_0

    .line 131
    :cond_8
    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object p1

    .line 135
    if-eqz p1, :cond_7

    .line 136
    .line 137
    :goto_0
    move-object v3, v2

    .line 138
    goto :goto_2

    .line 139
    :cond_9
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 140
    .line 141
    move-object v2, p1

    .line 142
    check-cast v2, Luf4;

    .line 143
    .line 144
    iget v5, v2, Luf4;->a:I

    .line 145
    .line 146
    iget v7, v2, Luf4;->b:I

    .line 147
    .line 148
    iget-wide v8, v2, Luf4;->d:J

    .line 149
    .line 150
    iget v10, v2, Luf4;->e:I

    .line 151
    .line 152
    :try_start_4
    iget-object v4, v1, Lvf4;->a:Landroid/media/MediaCodec;

    .line 153
    .line 154
    const/4 v6, 0x0

    .line 155
    invoke-virtual/range {v4 .. v10}, Landroid/media/MediaCodec;->queueInputBuffer(IIIJI)V
    :try_end_4
    .catch Ljava/lang/RuntimeException; {:try_start_4 .. :try_end_4} :catch_2

    .line 156
    .line 157
    .line 158
    goto :goto_1

    .line 159
    :catch_2
    move-exception v0

    .line 160
    move-object p1, v0

    .line 161
    iget-object v1, v1, Lvf4;->d:Ljava/util/concurrent/atomic/AtomicReference;

    .line 162
    .line 163
    :cond_a
    invoke-virtual {v1, v3, v0}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 164
    .line 165
    .line 166
    move-result p1

    .line 167
    if-eqz p1, :cond_b

    .line 168
    .line 169
    goto :goto_1

    .line 170
    :cond_b
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object p1

    .line 174
    if-eqz p1, :cond_a

    .line 175
    .line 176
    :goto_1
    goto :goto_0

    .line 177
    :goto_2
    if-eqz v3, :cond_c

    .line 178
    .line 179
    sget-object p1, Lvf4;->g:Ljava/util/ArrayDeque;

    .line 180
    .line 181
    monitor-enter p1

    .line 182
    :try_start_5
    invoke-virtual {p1, v3}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 183
    .line 184
    .line 185
    monitor-exit p1

    .line 186
    goto :goto_3

    .line 187
    :catchall_1
    move-exception v0

    .line 188
    monitor-exit p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 189
    throw v0

    .line 190
    :cond_c
    :goto_3
    return-void

    .line 191
    :pswitch_0
    iget p1, p1, Landroid/os/Message;->what:I

    .line 192
    .line 193
    const/4 v0, 0x1

    .line 194
    if-eq p1, v0, :cond_d

    .line 195
    .line 196
    goto :goto_4

    .line 197
    :cond_d
    iget-object p1, p0, Lq3;->b:Ljava/lang/Object;

    .line 198
    .line 199
    check-cast p1, Lbm0;

    .line 200
    .line 201
    iget-object v0, p1, Lbm0;->a0:Lgm0;

    .line 202
    .line 203
    iget-object v0, v0, Lgm0;->g:Landroidx/preference/PreferenceScreen;

    .line 204
    .line 205
    if-eqz v0, :cond_e

    .line 206
    .line 207
    iget-object p1, p1, Lbm0;->b0:Landroidx/recyclerview/widget/RecyclerView;

    .line 208
    .line 209
    new-instance v1, Lem0;

    .line 210
    .line 211
    invoke-direct {v1, v0}, Lem0;-><init>(Landroidx/preference/PreferenceGroup;)V

    .line 212
    .line 213
    .line 214
    invoke-virtual {p1, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Lao0;)V

    .line 215
    .line 216
    .line 217
    invoke-virtual {v0}, Landroidx/preference/PreferenceGroup;->j()V

    .line 218
    .line 219
    .line 220
    :cond_e
    :goto_4
    return-void

    .line 221
    :pswitch_1
    iget v0, p1, Landroid/os/Message;->what:I

    .line 222
    .line 223
    const/4 v1, -0x3

    .line 224
    if-eq v0, v1, :cond_10

    .line 225
    .line 226
    const/4 v1, -0x2

    .line 227
    if-eq v0, v1, :cond_10

    .line 228
    .line 229
    const/4 v1, -0x1

    .line 230
    if-eq v0, v1, :cond_10

    .line 231
    .line 232
    const/4 v1, 0x1

    .line 233
    if-eq v0, v1, :cond_f

    .line 234
    .line 235
    goto :goto_5

    .line 236
    :cond_f
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 237
    .line 238
    check-cast p1, Landroid/content/DialogInterface;

    .line 239
    .line 240
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    .line 241
    .line 242
    .line 243
    goto :goto_5

    .line 244
    :cond_10
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 245
    .line 246
    check-cast v0, Landroid/content/DialogInterface$OnClickListener;

    .line 247
    .line 248
    iget-object v1, p0, Lq3;->b:Ljava/lang/Object;

    .line 249
    .line 250
    check-cast v1, Ljava/lang/ref/WeakReference;

    .line 251
    .line 252
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 253
    .line 254
    .line 255
    move-result-object v1

    .line 256
    check-cast v1, Landroid/content/DialogInterface;

    .line 257
    .line 258
    iget p1, p1, Landroid/os/Message;->what:I

    .line 259
    .line 260
    invoke-interface {v0, v1, p1}, Landroid/content/DialogInterface$OnClickListener;->onClick(Landroid/content/DialogInterface;I)V

    .line 261
    .line 262
    .line 263
    :goto_5
    return-void

    .line 264
    nop

    .line 265
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
