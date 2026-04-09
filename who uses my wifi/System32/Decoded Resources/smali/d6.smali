.class public final Ld6;
.super Landroid/content/BroadcastReceiver;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x6

    iput v0, p0, Ld6;->a:I

    sget-object v0, Lqc3;->d:Lqc3;

    .line 2
    iput-object v0, p0, Ld6;->b:Ljava/lang/Object;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Ld6;->a:I

    iput-object p2, p0, Ld6;->b:Ljava/lang/Object;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method

.method public constructor <init>(Ltt3;Ld13;)V
    .locals 0

    const/4 p1, 0x7

    iput p1, p0, Ld6;->a:I

    .line 3
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    iput-object p2, p0, Ld6;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 6

    .line 1
    iget v0, p0, Ld6;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Ld6;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p1, Llf4;

    .line 9
    .line 10
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const-string v1, "android.intent.action.USER_PRESENT"

    .line 15
    .line 16
    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    const/4 p2, 0x1

    .line 23
    iput-boolean p2, p1, Llf4;->e:Z

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p2

    .line 30
    const-string v0, "android.intent.action.SCREEN_OFF"

    .line 31
    .line 32
    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result p2

    .line 36
    if-eqz p2, :cond_1

    .line 37
    .line 38
    const/4 p2, 0x0

    .line 39
    iput-boolean p2, p1, Llf4;->e:Z

    .line 40
    .line 41
    :cond_1
    :goto_0
    return-void

    .line 42
    :pswitch_0
    invoke-virtual {p0}, Landroid/content/BroadcastReceiver;->isInitialStickyBroadcast()Z

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    if-nez v0, :cond_2

    .line 47
    .line 48
    iget-object v0, p0, Ld6;->b:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v0, Lx03;

    .line 51
    .line 52
    iget-object v1, v0, Lx03;->o:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v1, Lin2;

    .line 55
    .line 56
    iget-object v2, v0, Lx03;->n:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v2, Landroid/media/AudioDeviceInfo;

    .line 59
    .line 60
    invoke-static {p1, p2, v1, v2}, Lae4;->b(Landroid/content/Context;Landroid/content/Intent;Lin2;Landroid/media/AudioDeviceInfo;)Lae4;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    invoke-virtual {v0, p1}, Lx03;->b(Lae4;)V

    .line 65
    .line 66
    .line 67
    :cond_2
    return-void

    .line 68
    :pswitch_1
    const-string p1, "android.media.AUDIO_BECOMING_NOISY"

    .line 69
    .line 70
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p2

    .line 74
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result p1

    .line 78
    if-eqz p1, :cond_3

    .line 79
    .line 80
    iget-object p1, p0, Ld6;->b:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast p1, Ld13;

    .line 83
    .line 84
    new-instance p2, Lvr;

    .line 85
    .line 86
    const/16 v0, 0xa

    .line 87
    .line 88
    invoke-direct {p2, v0}, Lvr;-><init>(I)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {p1, p2}, Ld13;->d(Ljava/lang/Runnable;)Z

    .line 92
    .line 93
    .line 94
    :cond_3
    return-void

    .line 95
    :pswitch_2
    iget-object p1, p0, Ld6;->b:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast p1, Lqc3;

    .line 98
    .line 99
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    const-string v1, "android.intent.action.SCREEN_OFF"

    .line 104
    .line 105
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    move-result v0

    .line 109
    if-eqz v0, :cond_4

    .line 110
    .line 111
    iget-boolean p2, p1, Lqc3;->c:Z

    .line 112
    .line 113
    const/4 v0, 0x1

    .line 114
    invoke-virtual {p1, v0, p2}, Lqc3;->a(ZZ)V

    .line 115
    .line 116
    .line 117
    iput-boolean v0, p1, Lqc3;->b:Z

    .line 118
    .line 119
    goto :goto_1

    .line 120
    :cond_4
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object p2

    .line 124
    const-string v0, "android.intent.action.SCREEN_ON"

    .line 125
    .line 126
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    move-result p2

    .line 130
    if-eqz p2, :cond_5

    .line 131
    .line 132
    iget-boolean p2, p1, Lqc3;->c:Z

    .line 133
    .line 134
    const/4 v0, 0x0

    .line 135
    invoke-virtual {p1, v0, p2}, Lqc3;->a(ZZ)V

    .line 136
    .line 137
    .line 138
    iput-boolean v0, p1, Lqc3;->b:Z

    .line 139
    .line 140
    :cond_5
    :goto_1
    return-void

    .line 141
    :pswitch_3
    new-instance p2, Ln62;

    .line 142
    .line 143
    const/16 v0, 0x1d

    .line 144
    .line 145
    invoke-direct {p2, p0, p1, v0}, Ln62;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 146
    .line 147
    .line 148
    iget-object p1, p0, Ld6;->b:Ljava/lang/Object;

    .line 149
    .line 150
    check-cast p1, Lvy2;

    .line 151
    .line 152
    iget-object p1, p1, Lvy2;->c:Ljava/lang/Object;

    .line 153
    .line 154
    check-cast p1, Ljava/util/concurrent/Executor;

    .line 155
    .line 156
    invoke-interface {p1, p2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 157
    .line 158
    .line 159
    return-void

    .line 160
    :pswitch_4
    iget-object v0, p0, Ld6;->b:Ljava/lang/Object;

    .line 161
    .line 162
    check-cast v0, Lm30;

    .line 163
    .line 164
    monitor-enter v0

    .line 165
    :try_start_0
    new-instance v1, Ljava/util/ArrayList;

    .line 166
    .line 167
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 168
    .line 169
    .line 170
    iget-object v2, v0, Lm30;->i:Ljava/lang/Object;

    .line 171
    .line 172
    check-cast v2, Ljava/util/WeakHashMap;

    .line 173
    .line 174
    invoke-virtual {v2}, Ljava/util/WeakHashMap;->entrySet()Ljava/util/Set;

    .line 175
    .line 176
    .line 177
    move-result-object v2

    .line 178
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 179
    .line 180
    .line 181
    move-result-object v2

    .line 182
    :cond_6
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 183
    .line 184
    .line 185
    move-result v3

    .line 186
    if-eqz v3, :cond_7

    .line 187
    .line 188
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object v3

    .line 192
    check-cast v3, Ljava/util/Map$Entry;

    .line 193
    .line 194
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object v4

    .line 198
    check-cast v4, Landroid/content/IntentFilter;

    .line 199
    .line 200
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object v5

    .line 204
    invoke-virtual {v4, v5}, Landroid/content/IntentFilter;->hasAction(Ljava/lang/String;)Z

    .line 205
    .line 206
    .line 207
    move-result v4

    .line 208
    if-eqz v4, :cond_6

    .line 209
    .line 210
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object v3

    .line 214
    check-cast v3, Landroid/content/BroadcastReceiver;

    .line 215
    .line 216
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 217
    .line 218
    .line 219
    goto :goto_2

    .line 220
    :catchall_0
    move-exception p1

    .line 221
    goto :goto_4

    .line 222
    :cond_7
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 223
    .line 224
    .line 225
    move-result v2

    .line 226
    const/4 v3, 0x0

    .line 227
    :goto_3
    if-ge v3, v2, :cond_8

    .line 228
    .line 229
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    move-result-object v4

    .line 233
    check-cast v4, Landroid/content/BroadcastReceiver;

    .line 234
    .line 235
    invoke-virtual {v4, p1, p2}, Landroid/content/BroadcastReceiver;->onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 236
    .line 237
    .line 238
    add-int/lit8 v3, v3, 0x1

    .line 239
    .line 240
    goto :goto_3

    .line 241
    :cond_8
    monitor-exit v0

    .line 242
    return-void

    .line 243
    :goto_4
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 244
    throw p1

    .line 245
    :pswitch_5
    iget-object p1, p0, Ld6;->b:Ljava/lang/Object;

    .line 246
    .line 247
    check-cast p1, Lpv1;

    .line 248
    .line 249
    const/4 p2, 0x3

    .line 250
    invoke-virtual {p1, p2}, Lpv1;->d(I)V

    .line 251
    .line 252
    .line 253
    return-void

    .line 254
    :pswitch_6
    iget-object p1, p0, Ld6;->b:Ljava/lang/Object;

    .line 255
    .line 256
    check-cast p1, Lnt1;

    .line 257
    .line 258
    invoke-virtual {p1}, Lnt1;->c()V

    .line 259
    .line 260
    .line 261
    return-void

    .line 262
    :pswitch_7
    if-eqz p2, :cond_9

    .line 263
    .line 264
    iget-object p1, p0, Ld6;->b:Ljava/lang/Object;

    .line 265
    .line 266
    check-cast p1, Lzb;

    .line 267
    .line 268
    invoke-virtual {p1, p2}, Lzb;->g(Landroid/content/Intent;)V

    .line 269
    .line 270
    .line 271
    :cond_9
    return-void

    .line 272
    :pswitch_8
    iget-object p1, p0, Ld6;->b:Ljava/lang/Object;

    .line 273
    .line 274
    check-cast p1, Le6;

    .line 275
    .line 276
    invoke-virtual {p1}, Le6;->l()V

    .line 277
    .line 278
    .line 279
    return-void

    .line 280
    nop

    .line 281
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
