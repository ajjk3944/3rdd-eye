.class public final Lcy2;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Liq3;
.implements Lll3;


# instance fields
.field public final f:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcy2;->f:Landroid/content/Context;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public synthetic a()Ljava/lang/Object;
    .locals 2

    .line 1
    new-instance v0, Lid4;

    .line 2
    .line 3
    new-instance v1, Lff1;

    .line 4
    .line 5
    invoke-direct {v1}, Lff1;-><init>()V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lcy2;->f:Landroid/content/Context;

    .line 9
    .line 10
    invoke-direct {v0, v1}, Lid4;-><init>(Landroid/content/Context;)V

    .line 11
    .line 12
    .line 13
    return-object v0
.end method

.method public b(Lg4;)Lzf4;
    .locals 12

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1f

    .line 4
    .line 5
    const/16 v2, 0x8

    .line 6
    .line 7
    const/16 v3, 0x23

    .line 8
    .line 9
    const-string v4, "createCodec:"

    .line 10
    .line 11
    const/4 v5, 0x0

    .line 12
    const/4 v6, 0x0

    .line 13
    if-lt v0, v1, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    iget-object v1, p0, Lcy2;->f:Landroid/content/Context;

    .line 17
    .line 18
    if-eqz v1, :cond_5

    .line 19
    .line 20
    const/16 v7, 0x1c

    .line 21
    .line 22
    if-lt v0, v7, :cond_5

    .line 23
    .line 24
    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    const-string v7, "com.amazon.hardware.tv_screen"

    .line 29
    .line 30
    invoke-virtual {v1, v7}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-nez v1, :cond_1

    .line 35
    .line 36
    goto/16 :goto_6

    .line 37
    .line 38
    :cond_1
    :goto_0
    iget-object v1, p1, Lg4;->h:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v1, Lph4;

    .line 41
    .line 42
    iget-object v1, v1, Lph4;->m:Ljava/lang/String;

    .line 43
    .line 44
    invoke-static {v1}, Lpp1;->g(Ljava/lang/String;)I

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    packed-switch v1, :pswitch_data_0

    .line 49
    .line 50
    .line 51
    const-string v7, "camera motion"

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :pswitch_0
    const-string v7, "metadata"

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :pswitch_1
    const-string v7, "image"

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :pswitch_2
    const-string v7, "text"

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :pswitch_3
    const-string v7, "video"

    .line 64
    .line 65
    goto :goto_1

    .line 66
    :pswitch_4
    const-string v7, "audio"

    .line 67
    .line 68
    goto :goto_1

    .line 69
    :pswitch_5
    const-string v7, "default"

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :pswitch_6
    const-string v7, "unknown"

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :pswitch_7
    const-string v7, "none"

    .line 76
    .line 77
    :goto_1
    const-string v8, "Creating an asynchronous MediaCodec adapter for track type "

    .line 78
    .line 79
    invoke-virtual {v8, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v7

    .line 83
    invoke-static {v7}, La30;->u(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    iget-object v7, p1, Lg4;->g:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast v7, Lbg4;

    .line 89
    .line 90
    iget-object v8, v7, Lbg4;->a:Ljava/lang/String;

    .line 91
    .line 92
    :try_start_0
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 93
    .line 94
    .line 95
    move-result v9

    .line 96
    add-int/lit8 v9, v9, 0xc

    .line 97
    .line 98
    new-instance v10, Ljava/lang/StringBuilder;

    .line 99
    .line 100
    invoke-direct {v10, v9}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v10, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v4

    .line 113
    invoke-static {v4}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    invoke-static {v8}, Landroid/media/MediaCodec;->createByCodecName(Ljava/lang/String;)Landroid/media/MediaCodec;

    .line 117
    .line 118
    .line 119
    move-result-object v4
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2

    .line 120
    :try_start_1
    new-instance v8, Lvf4;

    .line 121
    .line 122
    new-instance v9, Landroid/os/HandlerThread;

    .line 123
    .line 124
    const-string v10, "ExoPlayer:MediaCodecQueueingThread:"

    .line 125
    .line 126
    invoke-static {v10, v1}, Ltf4;->c(Ljava/lang/String;I)Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v10

    .line 130
    invoke-direct {v9, v10}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    invoke-direct {v8, v4, v9}, Lvf4;-><init>(Landroid/media/MediaCodec;Landroid/os/HandlerThread;)V

    .line 134
    .line 135
    .line 136
    new-instance v9, Ltf4;

    .line 137
    .line 138
    new-instance v10, Landroid/os/HandlerThread;

    .line 139
    .line 140
    const-string v11, "ExoPlayer:MediaCodecAsyncAdapter:"

    .line 141
    .line 142
    invoke-static {v11, v1}, Ltf4;->c(Ljava/lang/String;I)Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v1

    .line 146
    invoke-direct {v10, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    iget-object v1, p1, Lg4;->k:Ljava/lang/Object;

    .line 150
    .line 151
    check-cast v1, Lwt2;

    .line 152
    .line 153
    invoke-direct {v9, v4, v10, v8, v1}, Ltf4;-><init>(Landroid/media/MediaCodec;Landroid/os/HandlerThread;Lvf4;Lwt2;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 154
    .line 155
    .line 156
    :try_start_2
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 157
    .line 158
    .line 159
    iget-object v1, p1, Lg4;->i:Ljava/lang/Object;

    .line 160
    .line 161
    check-cast v1, Landroid/view/Surface;

    .line 162
    .line 163
    if-nez v1, :cond_2

    .line 164
    .line 165
    iget-boolean v5, v7, Lbg4;->h:Z

    .line 166
    .line 167
    if-eqz v5, :cond_2

    .line 168
    .line 169
    if-lt v0, v3, :cond_2

    .line 170
    .line 171
    goto :goto_2

    .line 172
    :cond_2
    move v2, v6

    .line 173
    goto :goto_2

    .line 174
    :catch_0
    move-exception p1

    .line 175
    goto :goto_3

    .line 176
    :goto_2
    iget-object p1, p1, Lg4;->j:Ljava/lang/Object;

    .line 177
    .line 178
    check-cast p1, Landroid/media/MediaFormat;

    .line 179
    .line 180
    invoke-virtual {v9, p1, v1, v2}, Ltf4;->a(Landroid/media/MediaFormat;Landroid/view/Surface;I)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 181
    .line 182
    .line 183
    return-object v9

    .line 184
    :goto_3
    move-object v5, v9

    .line 185
    goto :goto_4

    .line 186
    :catch_1
    move-exception p1

    .line 187
    goto :goto_4

    .line 188
    :catch_2
    move-exception p1

    .line 189
    move-object v4, v5

    .line 190
    :goto_4
    if-nez v5, :cond_3

    .line 191
    .line 192
    if-eqz v4, :cond_4

    .line 193
    .line 194
    invoke-virtual {v4}, Landroid/media/MediaCodec;->release()V

    .line 195
    .line 196
    .line 197
    goto :goto_5

    .line 198
    :cond_3
    invoke-virtual {v5}, Ltf4;->k()V

    .line 199
    .line 200
    .line 201
    :cond_4
    :goto_5
    throw p1

    .line 202
    :cond_5
    :goto_6
    :try_start_3
    iget-object v1, p1, Lg4;->g:Ljava/lang/Object;

    .line 203
    .line 204
    check-cast v1, Lbg4;

    .line 205
    .line 206
    iget-object v7, v1, Lbg4;->a:Ljava/lang/String;

    .line 207
    .line 208
    invoke-virtual {v4, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object v4

    .line 212
    invoke-static {v4}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 213
    .line 214
    .line 215
    invoke-static {v7}, Landroid/media/MediaCodec;->createByCodecName(Ljava/lang/String;)Landroid/media/MediaCodec;

    .line 216
    .line 217
    .line 218
    move-result-object v4

    .line 219
    invoke-static {}, Landroid/os/Trace;->endSection()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_6
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_5

    .line 220
    .line 221
    .line 222
    :try_start_4
    const-string v7, "configureCodec"

    .line 223
    .line 224
    invoke-static {v7}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 225
    .line 226
    .line 227
    iget-object v7, p1, Lg4;->i:Ljava/lang/Object;

    .line 228
    .line 229
    check-cast v7, Landroid/view/Surface;

    .line 230
    .line 231
    if-nez v7, :cond_6

    .line 232
    .line 233
    iget-boolean v1, v1, Lbg4;->h:Z

    .line 234
    .line 235
    if-eqz v1, :cond_6

    .line 236
    .line 237
    if-lt v0, v3, :cond_6

    .line 238
    .line 239
    goto :goto_7

    .line 240
    :cond_6
    move v2, v6

    .line 241
    goto :goto_7

    .line 242
    :catch_3
    move-exception p1

    .line 243
    goto :goto_8

    .line 244
    :catch_4
    move-exception p1

    .line 245
    goto :goto_8

    .line 246
    :goto_7
    iget-object v0, p1, Lg4;->j:Ljava/lang/Object;

    .line 247
    .line 248
    check-cast v0, Landroid/media/MediaFormat;

    .line 249
    .line 250
    invoke-virtual {v4, v0, v7, v5, v2}, Landroid/media/MediaCodec;->configure(Landroid/media/MediaFormat;Landroid/view/Surface;Landroid/media/MediaCrypto;I)V

    .line 251
    .line 252
    .line 253
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 254
    .line 255
    .line 256
    const-string v0, "startCodec"

    .line 257
    .line 258
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 259
    .line 260
    .line 261
    invoke-virtual {v4}, Landroid/media/MediaCodec;->start()V

    .line 262
    .line 263
    .line 264
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 265
    .line 266
    .line 267
    new-instance v0, Lmr2;

    .line 268
    .line 269
    iget-object p1, p1, Lg4;->k:Ljava/lang/Object;

    .line 270
    .line 271
    check-cast p1, Lwt2;

    .line 272
    .line 273
    invoke-direct {v0, v4, p1}, Lmr2;-><init>(Landroid/media/MediaCodec;Lwt2;)V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_4
    .catch Ljava/lang/RuntimeException; {:try_start_4 .. :try_end_4} :catch_3

    .line 274
    .line 275
    .line 276
    return-object v0

    .line 277
    :goto_8
    move-object v5, v4

    .line 278
    goto :goto_9

    .line 279
    :catch_5
    move-exception p1

    .line 280
    goto :goto_9

    .line 281
    :catch_6
    move-exception p1

    .line 282
    :goto_9
    if-eqz v5, :cond_7

    .line 283
    .line 284
    invoke-virtual {v5}, Landroid/media/MediaCodec;->release()V

    .line 285
    .line 286
    .line 287
    :cond_7
    throw p1

    .line 288
    nop

    .line 289
    :pswitch_data_0
    .packed-switch -0x2
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

.method public bridge synthetic p(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lny2;

    .line 2
    .line 3
    sget-object p1, Lm02;->j:Lso1;

    .line 4
    .line 5
    invoke-virtual {p1}, Lso1;->w()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Ljava/lang/Boolean;

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    iget-object p1, p0, Lcy2;->f:Landroid/content/Context;

    .line 18
    .line 19
    invoke-static {p1}, Li41;->R(Landroid/content/Context;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    return-void
.end method

.method public s(Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    sget-object v0, Lm02;->h:Lso1;

    .line 2
    .line 3
    invoke-virtual {v0}, Lso1;->w()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    instance-of p1, p1, Lxt1;

    .line 16
    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    iget-object p1, p0, Lcy2;->f:Landroid/content/Context;

    .line 20
    .line 21
    invoke-static {p1}, Li41;->R(Landroid/content/Context;)V

    .line 22
    .line 23
    .line 24
    :cond_0
    return-void
.end method
