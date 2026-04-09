.class public final Lmu1;
.super Lwc1;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final synthetic b:Lw9;


# direct methods
.method public constructor <init>(Lw9;Landroid/os/Looper;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lmu1;->b:Lw9;

    .line 2
    .line 3
    const/4 p1, 0x3

    .line 4
    invoke-direct {p0, p2, p1}, Lwc1;-><init>(Landroid/os/Looper;I)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)V
    .locals 9

    .line 1
    iget-object v0, p0, Lmu1;->b:Lw9;

    .line 2
    .line 3
    iget-object v0, v0, Lw9;->w:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    iget v1, p1, Landroid/os/Message;->arg1:I

    .line 10
    .line 11
    const/4 v2, 0x7

    .line 12
    const/4 v3, 0x2

    .line 13
    const/4 v4, 0x1

    .line 14
    if-eq v0, v1, :cond_2

    .line 15
    .line 16
    iget v0, p1, Landroid/os/Message;->what:I

    .line 17
    .line 18
    if-eq v0, v3, :cond_1

    .line 19
    .line 20
    if-eq v0, v4, :cond_1

    .line 21
    .line 22
    if-ne v0, v2, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    return-void

    .line 26
    :cond_1
    :goto_0
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast p1, Lad1;

    .line 29
    .line 30
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1}, Lad1;->c()V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :cond_2
    iget v0, p1, Landroid/os/Message;->what:I

    .line 38
    .line 39
    const/4 v1, 0x4

    .line 40
    const/4 v5, 0x5

    .line 41
    if-eq v0, v4, :cond_4

    .line 42
    .line 43
    if-eq v0, v2, :cond_4

    .line 44
    .line 45
    if-ne v0, v1, :cond_3

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_3
    if-ne v0, v5, :cond_5

    .line 49
    .line 50
    :cond_4
    :goto_1
    iget-object v0, p0, Lmu1;->b:Lw9;

    .line 51
    .line 52
    invoke-virtual {v0}, Lw9;->f()Z

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    if-eqz v0, :cond_1a

    .line 57
    .line 58
    :cond_5
    iget v0, p1, Landroid/os/Message;->what:I

    .line 59
    .line 60
    const/16 v6, 0x8

    .line 61
    .line 62
    const/4 v7, 0x3

    .line 63
    const/4 v8, 0x0

    .line 64
    if-ne v0, v1, :cond_b

    .line 65
    .line 66
    iget-object v0, p0, Lmu1;->b:Lw9;

    .line 67
    .line 68
    new-instance v1, Lrh;

    .line 69
    .line 70
    iget p1, p1, Landroid/os/Message;->arg2:I

    .line 71
    .line 72
    invoke-direct {v1, p1}, Lrh;-><init>(I)V

    .line 73
    .line 74
    .line 75
    iput-object v1, v0, Lw9;->t:Lrh;

    .line 76
    .line 77
    iget-boolean p1, v0, Lw9;->u:Z

    .line 78
    .line 79
    if-eqz p1, :cond_6

    .line 80
    .line 81
    goto :goto_2

    .line 82
    :cond_6
    invoke-virtual {v0}, Lw9;->u()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 87
    .line 88
    .line 89
    move-result p1

    .line 90
    if-eqz p1, :cond_7

    .line 91
    .line 92
    goto :goto_2

    .line 93
    :cond_7
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 94
    .line 95
    .line 96
    move-result p1

    .line 97
    if-eqz p1, :cond_8

    .line 98
    .line 99
    goto :goto_2

    .line 100
    :cond_8
    :try_start_0
    invoke-virtual {v0}, Lw9;->u()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    invoke-static {p1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 105
    .line 106
    .line 107
    iget-object p1, p0, Lmu1;->b:Lw9;

    .line 108
    .line 109
    iget-boolean v0, p1, Lw9;->u:Z

    .line 110
    .line 111
    if-eqz v0, :cond_9

    .line 112
    .line 113
    goto :goto_2

    .line 114
    :cond_9
    invoke-virtual {p1, v7, v8}, Lw9;->y(ILandroid/os/IInterface;)V

    .line 115
    .line 116
    .line 117
    return-void

    .line 118
    :catch_0
    :goto_2
    iget-object p1, p0, Lmu1;->b:Lw9;

    .line 119
    .line 120
    iget-object v0, p1, Lw9;->t:Lrh;

    .line 121
    .line 122
    if-eqz v0, :cond_a

    .line 123
    .line 124
    goto :goto_3

    .line 125
    :cond_a
    new-instance v0, Lrh;

    .line 126
    .line 127
    invoke-direct {v0, v6}, Lrh;-><init>(I)V

    .line 128
    .line 129
    .line 130
    :goto_3
    iget-object p1, p1, Lw9;->j:Lv9;

    .line 131
    .line 132
    invoke-interface {p1, v0}, Lv9;->e(Lrh;)V

    .line 133
    .line 134
    .line 135
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 136
    .line 137
    .line 138
    return-void

    .line 139
    :cond_b
    if-ne v0, v5, :cond_d

    .line 140
    .line 141
    iget-object p1, p0, Lmu1;->b:Lw9;

    .line 142
    .line 143
    iget-object v0, p1, Lw9;->t:Lrh;

    .line 144
    .line 145
    if-eqz v0, :cond_c

    .line 146
    .line 147
    goto :goto_4

    .line 148
    :cond_c
    new-instance v0, Lrh;

    .line 149
    .line 150
    invoke-direct {v0, v6}, Lrh;-><init>(I)V

    .line 151
    .line 152
    .line 153
    :goto_4
    iget-object p1, p1, Lw9;->j:Lv9;

    .line 154
    .line 155
    invoke-interface {p1, v0}, Lv9;->e(Lrh;)V

    .line 156
    .line 157
    .line 158
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 159
    .line 160
    .line 161
    return-void

    .line 162
    :cond_d
    if-ne v0, v7, :cond_f

    .line 163
    .line 164
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 165
    .line 166
    instance-of v1, v0, Landroid/app/PendingIntent;

    .line 167
    .line 168
    if-eqz v1, :cond_e

    .line 169
    .line 170
    move-object v8, v0

    .line 171
    check-cast v8, Landroid/app/PendingIntent;

    .line 172
    .line 173
    :cond_e
    new-instance v0, Lrh;

    .line 174
    .line 175
    iget p1, p1, Landroid/os/Message;->arg2:I

    .line 176
    .line 177
    invoke-direct {v0, p1, v8}, Lrh;-><init>(ILandroid/app/PendingIntent;)V

    .line 178
    .line 179
    .line 180
    iget-object p1, p0, Lmu1;->b:Lw9;

    .line 181
    .line 182
    iget-object p1, p1, Lw9;->j:Lv9;

    .line 183
    .line 184
    invoke-interface {p1, v0}, Lv9;->e(Lrh;)V

    .line 185
    .line 186
    .line 187
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 188
    .line 189
    .line 190
    return-void

    .line 191
    :cond_f
    const/4 v1, 0x6

    .line 192
    if-ne v0, v1, :cond_11

    .line 193
    .line 194
    iget-object v0, p0, Lmu1;->b:Lw9;

    .line 195
    .line 196
    invoke-virtual {v0, v5, v8}, Lw9;->y(ILandroid/os/IInterface;)V

    .line 197
    .line 198
    .line 199
    iget-object v0, p0, Lmu1;->b:Lw9;

    .line 200
    .line 201
    iget-object v0, v0, Lw9;->o:Lt9;

    .line 202
    .line 203
    if-eqz v0, :cond_10

    .line 204
    .line 205
    iget p1, p1, Landroid/os/Message;->arg2:I

    .line 206
    .line 207
    invoke-interface {v0, p1}, Lt9;->T(I)V

    .line 208
    .line 209
    .line 210
    :cond_10
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 211
    .line 212
    .line 213
    iget-object p1, p0, Lmu1;->b:Lw9;

    .line 214
    .line 215
    invoke-static {p1, v5, v4, v8}, Lw9;->x(Lw9;IILandroid/os/IInterface;)Z

    .line 216
    .line 217
    .line 218
    return-void

    .line 219
    :cond_11
    if-ne v0, v3, :cond_13

    .line 220
    .line 221
    iget-object v0, p0, Lmu1;->b:Lw9;

    .line 222
    .line 223
    invoke-virtual {v0}, Lw9;->a()Z

    .line 224
    .line 225
    .line 226
    move-result v0

    .line 227
    if-eqz v0, :cond_12

    .line 228
    .line 229
    goto :goto_5

    .line 230
    :cond_12
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 231
    .line 232
    check-cast p1, Lad1;

    .line 233
    .line 234
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 235
    .line 236
    .line 237
    invoke-virtual {p1}, Lad1;->c()V

    .line 238
    .line 239
    .line 240
    return-void

    .line 241
    :cond_13
    :goto_5
    iget v0, p1, Landroid/os/Message;->what:I

    .line 242
    .line 243
    if-eq v0, v3, :cond_15

    .line 244
    .line 245
    if-eq v0, v4, :cond_15

    .line 246
    .line 247
    if-ne v0, v2, :cond_14

    .line 248
    .line 249
    goto :goto_6

    .line 250
    :cond_14
    const-string p1, "Don\'t know how to handle message: "

    .line 251
    .line 252
    invoke-static {p1, v0}, Lex0;->f(Ljava/lang/String;I)Ljava/lang/String;

    .line 253
    .line 254
    .line 255
    move-result-object p1

    .line 256
    new-instance v0, Ljava/lang/Exception;

    .line 257
    .line 258
    invoke-direct {v0}, Ljava/lang/Exception;-><init>()V

    .line 259
    .line 260
    .line 261
    const-string v1, "GmsClient"

    .line 262
    .line 263
    invoke-static {v1, p1, v0}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 264
    .line 265
    .line 266
    return-void

    .line 267
    :cond_15
    :goto_6
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 268
    .line 269
    move-object v0, p1

    .line 270
    check-cast v0, Lad1;

    .line 271
    .line 272
    monitor-enter v0

    .line 273
    :try_start_1
    iget-object p1, v0, Lad1;->a:Ljava/lang/Boolean;

    .line 274
    .line 275
    iget-boolean v1, v0, Lad1;->b:Z

    .line 276
    .line 277
    if-eqz v1, :cond_16

    .line 278
    .line 279
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 280
    .line 281
    .line 282
    goto :goto_7

    .line 283
    :catchall_0
    move-exception p1

    .line 284
    goto :goto_9

    .line 285
    :cond_16
    :goto_7
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 286
    if-eqz p1, :cond_19

    .line 287
    .line 288
    iget-object p1, v0, Lad1;->f:Lw9;

    .line 289
    .line 290
    iget v1, v0, Lad1;->d:I

    .line 291
    .line 292
    if-nez v1, :cond_17

    .line 293
    .line 294
    invoke-virtual {v0}, Lad1;->b()Z

    .line 295
    .line 296
    .line 297
    move-result v1

    .line 298
    if-nez v1, :cond_19

    .line 299
    .line 300
    invoke-virtual {p1, v4, v8}, Lw9;->y(ILandroid/os/IInterface;)V

    .line 301
    .line 302
    .line 303
    new-instance p1, Lrh;

    .line 304
    .line 305
    invoke-direct {p1, v6, v8}, Lrh;-><init>(ILandroid/app/PendingIntent;)V

    .line 306
    .line 307
    .line 308
    invoke-virtual {v0, p1}, Lad1;->a(Lrh;)V

    .line 309
    .line 310
    .line 311
    goto :goto_8

    .line 312
    :cond_17
    invoke-virtual {p1, v4, v8}, Lw9;->y(ILandroid/os/IInterface;)V

    .line 313
    .line 314
    .line 315
    iget-object p1, v0, Lad1;->e:Landroid/os/Bundle;

    .line 316
    .line 317
    if-eqz p1, :cond_18

    .line 318
    .line 319
    const-string v2, "pendingIntent"

    .line 320
    .line 321
    invoke-virtual {p1, v2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 322
    .line 323
    .line 324
    move-result-object p1

    .line 325
    move-object v8, p1

    .line 326
    check-cast v8, Landroid/app/PendingIntent;

    .line 327
    .line 328
    :cond_18
    new-instance p1, Lrh;

    .line 329
    .line 330
    invoke-direct {p1, v1, v8}, Lrh;-><init>(ILandroid/app/PendingIntent;)V

    .line 331
    .line 332
    .line 333
    invoke-virtual {v0, p1}, Lad1;->a(Lrh;)V

    .line 334
    .line 335
    .line 336
    :cond_19
    :goto_8
    monitor-enter v0

    .line 337
    :try_start_2
    iput-boolean v4, v0, Lad1;->b:Z

    .line 338
    .line 339
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 340
    invoke-virtual {v0}, Lad1;->c()V

    .line 341
    .line 342
    .line 343
    return-void

    .line 344
    :catchall_1
    move-exception p1

    .line 345
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 346
    throw p1

    .line 347
    :goto_9
    :try_start_4
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 348
    throw p1

    .line 349
    :cond_1a
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 350
    .line 351
    check-cast p1, Lad1;

    .line 352
    .line 353
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 354
    .line 355
    .line 356
    invoke-virtual {p1}, Lad1;->c()V

    .line 357
    .line 358
    .line 359
    return-void
.end method
