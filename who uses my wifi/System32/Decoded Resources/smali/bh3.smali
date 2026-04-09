.class public final Lbh3;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic f:I

.field public g:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>()V
    .locals 1

    .line 1
    const/4 v0, 0x6

    iput v0, p0, Lbh3;->f:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 2
    iput p1, p0, Lbh3;->f:I

    iput-object p2, p0, Lbh3;->g:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljb4;I)V
    .locals 0

    const/16 p2, 0xa

    iput p2, p0, Lbh3;->f:I

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbh3;->g:Ljava/lang/Object;

    return-void
.end method

.method private final a()V
    .locals 5

    .line 1
    iget-object v0, p0, Lbh3;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lgc4;

    .line 4
    .line 5
    :try_start_0
    monitor-enter v0

    .line 6
    monitor-exit v0
    :try_end_0
    .catch Lb84; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    const/4 v1, 0x1

    .line 8
    :try_start_1
    iget-object v2, v0, Lgc4;->a:Lfc4;

    .line 9
    .line 10
    iget v3, v0, Lgc4;->c:I

    .line 11
    .line 12
    iget-object v4, v0, Lgc4;->d:Ljava/lang/Object;

    .line 13
    .line 14
    invoke-interface {v2, v3, v4}, Lfc4;->a(ILjava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 15
    .line 16
    .line 17
    :try_start_2
    invoke-virtual {v0, v1}, Lgc4;->b(Z)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :catchall_0
    move-exception v2

    .line 22
    invoke-virtual {v0, v1}, Lgc4;->b(Z)V

    .line 23
    .line 24
    .line 25
    throw v2
    :try_end_2
    .catch Lb84; {:try_start_2 .. :try_end_2} :catch_0

    .line 26
    :catch_0
    move-exception v0

    .line 27
    const-string v1, "ExoPlayerImplInternal"

    .line 28
    .line 29
    const-string v2, "Unexpected error delivering message on external thread."

    .line 30
    .line 31
    invoke-static {v1, v2, v0}, La30;->C(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 32
    .line 33
    .line 34
    new-instance v1, Ljava/lang/RuntimeException;

    .line 35
    .line 36
    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 37
    .line 38
    .line 39
    throw v1
.end method

.method private final synthetic b()V
    .locals 6

    .line 1
    iget-object v0, p0, Lbh3;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lwf4;

    .line 4
    .line 5
    iget-object v1, v0, Lwf4;->a:Ljava/lang/Object;

    .line 6
    .line 7
    monitor-enter v1

    .line 8
    :try_start_0
    iget-boolean v2, v0, Lwf4;->m:Z

    .line 9
    .line 10
    if-eqz v2, :cond_0

    .line 11
    .line 12
    monitor-exit v1

    .line 13
    return-void

    .line 14
    :catchall_0
    move-exception v0

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    iget-wide v2, v0, Lwf4;->l:J

    .line 17
    .line 18
    const-wide/16 v4, -0x1

    .line 19
    .line 20
    add-long/2addr v2, v4

    .line 21
    iput-wide v2, v0, Lwf4;->l:J

    .line 22
    .line 23
    const-wide/16 v4, 0x0

    .line 24
    .line 25
    cmp-long v2, v2, v4

    .line 26
    .line 27
    if-lez v2, :cond_1

    .line 28
    .line 29
    monitor-exit v1

    .line 30
    return-void

    .line 31
    :cond_1
    if-gez v2, :cond_2

    .line 32
    .line 33
    new-instance v2, Ljava/lang/IllegalStateException;

    .line 34
    .line 35
    invoke-direct {v2}, Ljava/lang/IllegalStateException;-><init>()V

    .line 36
    .line 37
    .line 38
    monitor-enter v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 39
    :try_start_1
    iput-object v2, v0, Lwf4;->n:Ljava/lang/IllegalStateException;

    .line 40
    .line 41
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 42
    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 43
    return-void

    .line 44
    :catchall_1
    move-exception v0

    .line 45
    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 46
    :try_start_4
    throw v0

    .line 47
    :cond_2
    invoke-virtual {v0}, Lwf4;->a()V

    .line 48
    .line 49
    .line 50
    monitor-exit v1

    .line 51
    return-void

    .line 52
    :goto_0
    monitor-exit v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 53
    throw v0
.end method


# virtual methods
.method public final run()V
    .locals 11

    .line 1
    iget v0, p0, Lbh3;->f:I

    .line 2
    .line 3
    const/4 v1, 0x6

    .line 4
    const/4 v2, 0x1

    .line 5
    const/4 v3, 0x0

    .line 6
    const/4 v4, 0x0

    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lbh3;->g:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Lmd1;

    .line 13
    .line 14
    iget-object v0, v0, Lmd1;->h:Lne1;

    .line 15
    .line 16
    invoke-interface {v0}, Lne1;->a()V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :pswitch_0
    iget-object v0, p0, Lbh3;->g:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v0, Lzj4;

    .line 23
    .line 24
    check-cast v0, Lbi4;

    .line 25
    .line 26
    iget-object v1, v0, Lbi4;->w:[Lki4;

    .line 27
    .line 28
    array-length v5, v1

    .line 29
    :goto_0
    if-ge v3, v5, :cond_1

    .line 30
    .line 31
    aget-object v6, v1, v3

    .line 32
    .line 33
    invoke-virtual {v6, v2}, Lki4;->i(Z)V

    .line 34
    .line 35
    .line 36
    iget-object v7, v6, Lki4;->g:Lci3;

    .line 37
    .line 38
    if-eqz v7, :cond_0

    .line 39
    .line 40
    iput-object v4, v6, Lki4;->g:Lci3;

    .line 41
    .line 42
    iput-object v4, v6, Lki4;->f:Lph4;

    .line 43
    .line 44
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_1
    iget-object v0, v0, Lbi4;->p:Ljr3;

    .line 48
    .line 49
    iget-object v1, v0, Ljr3;->h:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v1, Llf1;

    .line 52
    .line 53
    if-eqz v1, :cond_2

    .line 54
    .line 55
    iput-object v4, v0, Ljr3;->h:Ljava/lang/Object;

    .line 56
    .line 57
    :cond_2
    iput-object v4, v0, Ljr3;->i:Ljava/lang/Object;

    .line 58
    .line 59
    return-void

    .line 60
    :pswitch_1
    iget-object v0, p0, Lbh3;->g:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v0, Luh;

    .line 63
    .line 64
    invoke-interface {v0}, Luh;->d()V

    .line 65
    .line 66
    .line 67
    return-void

    .line 68
    :pswitch_2
    invoke-direct {p0}, Lbh3;->b()V

    .line 69
    .line 70
    .line 71
    return-void

    .line 72
    :pswitch_3
    iget-object v0, p0, Lbh3;->g:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v0, Ldf4;

    .line 75
    .line 76
    iget-wide v3, v0, Ldf4;->Y:J

    .line 77
    .line 78
    const-wide/32 v5, 0x493e0

    .line 79
    .line 80
    .line 81
    cmp-long v1, v3, v5

    .line 82
    .line 83
    if-ltz v1, :cond_3

    .line 84
    .line 85
    iget-object v1, v0, Ldf4;->n:Lbi3;

    .line 86
    .line 87
    iget-object v1, v1, Lbi3;->g:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast v1, Lef4;

    .line 90
    .line 91
    iput-boolean v2, v1, Lef4;->K0:Z

    .line 92
    .line 93
    const-wide/16 v1, 0x0

    .line 94
    .line 95
    iput-wide v1, v0, Ldf4;->Y:J

    .line 96
    .line 97
    :cond_3
    return-void

    .line 98
    :pswitch_4
    iget-object v0, p0, Lbh3;->g:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast v0, Lmd4;

    .line 101
    .line 102
    invoke-virtual {v0}, Lmd4;->t()Lad4;

    .line 103
    .line 104
    .line 105
    move-result-object v2

    .line 106
    new-instance v3, Lhd4;

    .line 107
    .line 108
    invoke-direct {v3, v1}, Lhd4;-><init>(I)V

    .line 109
    .line 110
    .line 111
    const/16 v1, 0x404

    .line 112
    .line 113
    invoke-virtual {v0, v2, v1, v3}, Lmd4;->s(Lad4;ILks2;)V

    .line 114
    .line 115
    .line 116
    iget-object v0, v0, Lmd4;->k:Lmu2;

    .line 117
    .line 118
    invoke-virtual {v0}, Lmu2;->e()V

    .line 119
    .line 120
    .line 121
    return-void

    .line 122
    :pswitch_5
    invoke-direct {p0}, Lbh3;->a()V

    .line 123
    .line 124
    .line 125
    return-void

    .line 126
    :pswitch_6
    iget-object v0, p0, Lbh3;->g:Ljava/lang/Object;

    .line 127
    .line 128
    check-cast v0, Ljb4;

    .line 129
    .line 130
    iget-object v0, v0, Ljb4;->A:Lmd4;

    .line 131
    .line 132
    invoke-virtual {v0}, Lmd4;->t()Lad4;

    .line 133
    .line 134
    .line 135
    move-result-object v1

    .line 136
    new-instance v2, Lt24;

    .line 137
    .line 138
    const/16 v4, 0x19

    .line 139
    .line 140
    invoke-direct {v2, v4, v3}, Lt24;-><init>(IB)V

    .line 141
    .line 142
    .line 143
    const/16 v3, 0x40a

    .line 144
    .line 145
    invoke-virtual {v0, v1, v3, v2}, Lmd4;->s(Lad4;ILks2;)V

    .line 146
    .line 147
    .line 148
    return-void

    .line 149
    :pswitch_7
    iget-object v0, p0, Lbh3;->g:Ljava/lang/Object;

    .line 150
    .line 151
    check-cast v0, Lya4;

    .line 152
    .line 153
    sget-object v1, Lv23;->a:Ljava/lang/String;

    .line 154
    .line 155
    iget-object v1, v0, Lya4;->l:Landroid/content/Context;

    .line 156
    .line 157
    invoke-static {v1}, Lbd2;->B(Landroid/content/Context;)Landroid/media/AudioManager;

    .line 158
    .line 159
    .line 160
    move-result-object v1

    .line 161
    invoke-virtual {v1}, Landroid/media/AudioManager;->generateAudioSessionId()I

    .line 162
    .line 163
    .line 164
    move-result v1

    .line 165
    const/4 v2, -0x1

    .line 166
    if-ne v1, v2, :cond_4

    .line 167
    .line 168
    goto :goto_1

    .line 169
    :cond_4
    move v3, v1

    .line 170
    :goto_1
    iget-object v0, v0, Lya4;->H:Lfw3;

    .line 171
    .line 172
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 173
    .line 174
    .line 175
    move-result-object v1

    .line 176
    iput-object v1, v0, Lfw3;->k:Ljava/lang/Object;

    .line 177
    .line 178
    new-instance v2, Ln62;

    .line 179
    .line 180
    const/16 v3, 0xf

    .line 181
    .line 182
    invoke-direct {v2, v0, v1, v3}, Ln62;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 183
    .line 184
    .line 185
    iget-object v0, v0, Lfw3;->h:Ljava/lang/Object;

    .line 186
    .line 187
    check-cast v0, Ld13;

    .line 188
    .line 189
    iget-object v1, v0, Ld13;->a:Landroid/os/Handler;

    .line 190
    .line 191
    invoke-virtual {v1}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 192
    .line 193
    .line 194
    move-result-object v1

    .line 195
    invoke-virtual {v1}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 196
    .line 197
    .line 198
    move-result-object v1

    .line 199
    invoke-virtual {v1}, Ljava/lang/Thread;->isAlive()Z

    .line 200
    .line 201
    .line 202
    move-result v1

    .line 203
    if-nez v1, :cond_5

    .line 204
    .line 205
    goto :goto_2

    .line 206
    :cond_5
    invoke-virtual {v0, v2}, Ld13;->d(Ljava/lang/Runnable;)Z

    .line 207
    .line 208
    .line 209
    :goto_2
    return-void

    .line 210
    :pswitch_8
    iget-object v0, p0, Lbh3;->g:Ljava/lang/Object;

    .line 211
    .line 212
    check-cast v0, Lxb4;

    .line 213
    .line 214
    iget-object v0, v0, Lxb4;->g:Ljava/lang/Object;

    .line 215
    .line 216
    check-cast v0, Landroid/content/Context;

    .line 217
    .line 218
    invoke-static {v0}, Lxb4;->I(Landroid/content/Context;)Landroid/content/SharedPreferences;

    .line 219
    .line 220
    .line 221
    move-result-object v1

    .line 222
    const-string v2, "app_set_id_last_used_time"

    .line 223
    .line 224
    const-wide/16 v4, -0x1

    .line 225
    .line 226
    invoke-interface {v1, v2, v4, v5}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    .line 227
    .line 228
    .line 229
    move-result-wide v6

    .line 230
    cmp-long v1, v6, v4

    .line 231
    .line 232
    if-eqz v1, :cond_6

    .line 233
    .line 234
    const-wide v8, 0x7d8702800L

    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    add-long/2addr v6, v8

    .line 240
    goto :goto_3

    .line 241
    :cond_6
    move-wide v6, v4

    .line 242
    :goto_3
    cmp-long v1, v6, v4

    .line 243
    .line 244
    if-eqz v1, :cond_a

    .line 245
    .line 246
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 247
    .line 248
    .line 249
    move-result-wide v4

    .line 250
    cmp-long v1, v4, v6

    .line 251
    .line 252
    if-lez v1, :cond_a

    .line 253
    .line 254
    const-string v1, "AppSet"

    .line 255
    .line 256
    invoke-static {v0}, Lxb4;->I(Landroid/content/Context;)Landroid/content/SharedPreferences;

    .line 257
    .line 258
    .line 259
    move-result-object v4

    .line 260
    invoke-interface {v4}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 261
    .line 262
    .line 263
    move-result-object v4

    .line 264
    const-string v5, "app_set_id"

    .line 265
    .line 266
    invoke-interface {v4, v5}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 267
    .line 268
    .line 269
    move-result-object v4

    .line 270
    invoke-interface {v4}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 271
    .line 272
    .line 273
    move-result v4

    .line 274
    if-nez v4, :cond_8

    .line 275
    .line 276
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 277
    .line 278
    .line 279
    move-result-object v4

    .line 280
    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 281
    .line 282
    .line 283
    move-result-object v4

    .line 284
    const-string v5, "Failed to clear app set ID generated for App "

    .line 285
    .line 286
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 287
    .line 288
    .line 289
    move-result v6

    .line 290
    if-eqz v6, :cond_7

    .line 291
    .line 292
    invoke-virtual {v5, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 293
    .line 294
    .line 295
    move-result-object v4

    .line 296
    goto :goto_4

    .line 297
    :cond_7
    new-instance v4, Ljava/lang/String;

    .line 298
    .line 299
    invoke-direct {v4, v5}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    .line 300
    .line 301
    .line 302
    :goto_4
    invoke-static {v1, v4}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 303
    .line 304
    .line 305
    :cond_8
    const-string v4, "app_set_id_storage"

    .line 306
    .line 307
    invoke-virtual {v0, v4, v3}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 308
    .line 309
    .line 310
    move-result-object v3

    .line 311
    invoke-interface {v3}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 312
    .line 313
    .line 314
    move-result-object v3

    .line 315
    invoke-interface {v3, v2}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 316
    .line 317
    .line 318
    move-result-object v2

    .line 319
    invoke-interface {v2}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 320
    .line 321
    .line 322
    move-result v2

    .line 323
    if-nez v2, :cond_a

    .line 324
    .line 325
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 326
    .line 327
    .line 328
    move-result-object v0

    .line 329
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 330
    .line 331
    .line 332
    move-result-object v0

    .line 333
    const-string v2, "Failed to clear app set ID last used time for App "

    .line 334
    .line 335
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 336
    .line 337
    .line 338
    move-result v3

    .line 339
    if-eqz v3, :cond_9

    .line 340
    .line 341
    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 342
    .line 343
    .line 344
    move-result-object v0

    .line 345
    goto :goto_5

    .line 346
    :cond_9
    new-instance v0, Ljava/lang/String;

    .line 347
    .line 348
    invoke-direct {v0, v2}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    .line 349
    .line 350
    .line 351
    :goto_5
    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 352
    .line 353
    .line 354
    :cond_a
    return-void

    .line 355
    :pswitch_9
    iget-object v0, p0, Lbh3;->g:Ljava/lang/Object;

    .line 356
    .line 357
    check-cast v0, Lra4;

    .line 358
    .line 359
    iget-boolean v1, v0, Lra4;->b:Z

    .line 360
    .line 361
    if-nez v1, :cond_b

    .line 362
    .line 363
    goto :goto_7

    .line 364
    :cond_b
    invoke-virtual {v0}, Lra4;->k()Z

    .line 365
    .line 366
    .line 367
    move-result v1

    .line 368
    if-eqz v1, :cond_c

    .line 369
    .line 370
    invoke-virtual {v0}, Lra4;->l()Z

    .line 371
    .line 372
    .line 373
    move-result v1

    .line 374
    if-nez v1, :cond_11

    .line 375
    .line 376
    :cond_c
    sget-object v1, Ll02;->b:Lso1;

    .line 377
    .line 378
    invoke-virtual {v1}, Lso1;->w()Ljava/lang/Object;

    .line 379
    .line 380
    .line 381
    move-result-object v1

    .line 382
    check-cast v1, Ljava/lang/Boolean;

    .line 383
    .line 384
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 385
    .line 386
    .line 387
    move-result v1

    .line 388
    if-nez v1, :cond_d

    .line 389
    .line 390
    goto :goto_7

    .line 391
    :cond_d
    iget-object v1, v0, Lra4;->a:Ljava/lang/Object;

    .line 392
    .line 393
    monitor-enter v1

    .line 394
    :try_start_0
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 395
    .line 396
    .line 397
    move-result-object v3

    .line 398
    if-nez v3, :cond_e

    .line 399
    .line 400
    monitor-exit v1

    .line 401
    goto :goto_7

    .line 402
    :catchall_0
    move-exception v0

    .line 403
    goto :goto_9

    .line 404
    :cond_e
    iget-object v3, v0, Lra4;->e:Lyv1;

    .line 405
    .line 406
    if-nez v3, :cond_f

    .line 407
    .line 408
    new-instance v3, Lyv1;

    .line 409
    .line 410
    invoke-direct {v3}, Lyv1;-><init>()V

    .line 411
    .line 412
    .line 413
    iput-object v3, v0, Lra4;->e:Lyv1;

    .line 414
    .line 415
    :cond_f
    iget-object v0, v0, Lra4;->e:Lyv1;

    .line 416
    .line 417
    iget-object v3, v0, Lyv1;->h:Ljava/lang/Object;

    .line 418
    .line 419
    monitor-enter v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 420
    :try_start_1
    iget-boolean v4, v0, Lyv1;->f:Z

    .line 421
    .line 422
    if-eqz v4, :cond_10

    .line 423
    .line 424
    const-string v0, "Content hash thread already started, quitting..."

    .line 425
    .line 426
    invoke-static {v0}, Lgi2;->U(Ljava/lang/String;)V

    .line 427
    .line 428
    .line 429
    monitor-exit v3

    .line 430
    goto :goto_6

    .line 431
    :catchall_1
    move-exception v0

    .line 432
    goto :goto_8

    .line 433
    :cond_10
    iput-boolean v2, v0, Lyv1;->f:Z

    .line 434
    .line 435
    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 436
    :try_start_2
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 437
    .line 438
    .line 439
    :goto_6
    const-string v0, "start fetching content..."

    .line 440
    .line 441
    invoke-static {v0}, Lgi2;->f0(Ljava/lang/String;)V

    .line 442
    .line 443
    .line 444
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 445
    :cond_11
    :goto_7
    return-void

    .line 446
    :goto_8
    :try_start_3
    monitor-exit v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 447
    :try_start_4
    throw v0

    .line 448
    :goto_9
    monitor-exit v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 449
    throw v0

    .line 450
    :pswitch_a
    const-string v0, "Timed out (timeout delayed by "

    .line 451
    .line 452
    const-string v1, ": "

    .line 453
    .line 454
    const-string v3, " ms after scheduled time)"

    .line 455
    .line 456
    iget-object v5, p0, Lbh3;->g:Ljava/lang/Object;

    .line 457
    .line 458
    check-cast v5, Lyq3;

    .line 459
    .line 460
    if-nez v5, :cond_12

    .line 461
    .line 462
    goto/16 :goto_d

    .line 463
    .line 464
    :cond_12
    iget-object v6, v5, Lyq3;->m:Ln70;

    .line 465
    .line 466
    if-eqz v6, :cond_15

    .line 467
    .line 468
    iput-object v4, p0, Lbh3;->g:Ljava/lang/Object;

    .line 469
    .line 470
    invoke-interface {v6}, Ljava/util/concurrent/Future;->isDone()Z

    .line 471
    .line 472
    .line 473
    move-result v7

    .line 474
    if-eqz v7, :cond_13

    .line 475
    .line 476
    invoke-virtual {v5, v6}, Lgp3;->m(Ln70;)V

    .line 477
    .line 478
    .line 479
    goto/16 :goto_d

    .line 480
    .line 481
    :cond_13
    :try_start_5
    iget-object v7, v5, Lyq3;->n:Ljava/util/concurrent/ScheduledFuture;

    .line 482
    .line 483
    iput-object v4, v5, Lyq3;->n:Ljava/util/concurrent/ScheduledFuture;

    .line 484
    .line 485
    const-string v4, "Timed out"
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 486
    .line 487
    if-eqz v7, :cond_14

    .line 488
    .line 489
    :try_start_6
    sget-object v8, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 490
    .line 491
    invoke-interface {v7, v8}, Ljava/util/concurrent/Delayed;->getDelay(Ljava/util/concurrent/TimeUnit;)J

    .line 492
    .line 493
    .line 494
    move-result-wide v7

    .line 495
    invoke-static {v7, v8}, Ljava/lang/Math;->abs(J)J

    .line 496
    .line 497
    .line 498
    move-result-wide v7

    .line 499
    const-wide/16 v9, 0xa

    .line 500
    .line 501
    cmp-long v9, v7, v9

    .line 502
    .line 503
    if-lez v9, :cond_14

    .line 504
    .line 505
    invoke-static {v7, v8}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 506
    .line 507
    .line 508
    move-result-object v9

    .line 509
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    .line 510
    .line 511
    .line 512
    move-result v9

    .line 513
    add-int/lit8 v9, v9, 0x37

    .line 514
    .line 515
    new-instance v10, Ljava/lang/StringBuilder;

    .line 516
    .line 517
    invoke-direct {v10, v9}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 518
    .line 519
    .line 520
    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 521
    .line 522
    .line 523
    invoke-virtual {v10, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 524
    .line 525
    .line 526
    invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 527
    .line 528
    .line 529
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 530
    .line 531
    .line 532
    move-result-object v4

    .line 533
    goto :goto_a

    .line 534
    :catchall_2
    move-exception v0

    .line 535
    goto :goto_b

    .line 536
    :cond_14
    :goto_a
    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 537
    .line 538
    .line 539
    move-result-object v0

    .line 540
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 541
    .line 542
    .line 543
    move-result v3

    .line 544
    add-int/lit8 v3, v3, 0x2

    .line 545
    .line 546
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 547
    .line 548
    .line 549
    move-result v7

    .line 550
    add-int/2addr v3, v7

    .line 551
    new-instance v7, Ljava/lang/StringBuilder;

    .line 552
    .line 553
    invoke-direct {v7, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 554
    .line 555
    .line 556
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 557
    .line 558
    .line 559
    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 560
    .line 561
    .line 562
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 563
    .line 564
    .line 565
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 566
    .line 567
    .line 568
    move-result-object v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 569
    :try_start_7
    new-instance v1, Lxq3;

    .line 570
    .line 571
    invoke-direct {v1, v0}, Ljava/util/concurrent/TimeoutException;-><init>(Ljava/lang/String;)V

    .line 572
    .line 573
    .line 574
    invoke-virtual {v5, v1}, Lgp3;->e(Ljava/lang/Throwable;)Z
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 575
    .line 576
    .line 577
    invoke-interface {v6, v2}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 578
    .line 579
    .line 580
    goto :goto_d

    .line 581
    :catchall_3
    move-exception v0

    .line 582
    goto :goto_c

    .line 583
    :goto_b
    :try_start_8
    new-instance v1, Lxq3;

    .line 584
    .line 585
    invoke-direct {v1, v4}, Ljava/util/concurrent/TimeoutException;-><init>(Ljava/lang/String;)V

    .line 586
    .line 587
    .line 588
    invoke-virtual {v5, v1}, Lgp3;->e(Ljava/lang/Throwable;)Z

    .line 589
    .line 590
    .line 591
    throw v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    .line 592
    :goto_c
    invoke-interface {v6, v2}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 593
    .line 594
    .line 595
    throw v0

    .line 596
    :cond_15
    :goto_d
    return-void

    .line 597
    :pswitch_b
    iget-object v0, p0, Lbh3;->g:Ljava/lang/Object;

    .line 598
    .line 599
    check-cast v0, Lx03;

    .line 600
    .line 601
    iget-object v1, v0, Lx03;->o:Ljava/lang/Object;

    .line 602
    .line 603
    check-cast v1, Lkk3;

    .line 604
    .line 605
    if-eqz v1, :cond_16

    .line 606
    .line 607
    iget-object v1, v0, Lx03;->i:Ljava/lang/Object;

    .line 608
    .line 609
    check-cast v1, Ler3;

    .line 610
    .line 611
    const-string v2, "Unbind from service."

    .line 612
    .line 613
    new-array v5, v3, [Ljava/lang/Object;

    .line 614
    .line 615
    invoke-virtual {v1, v2, v5}, Ler3;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 616
    .line 617
    .line 618
    iget-object v1, v0, Lx03;->g:Ljava/lang/Object;

    .line 619
    .line 620
    check-cast v1, Landroid/content/Context;

    .line 621
    .line 622
    iget-object v2, v0, Lx03;->n:Ljava/lang/Object;

    .line 623
    .line 624
    check-cast v2, Lsk3;

    .line 625
    .line 626
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 627
    .line 628
    .line 629
    invoke-virtual {v1, v2}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V

    .line 630
    .line 631
    .line 632
    iput-boolean v3, v0, Lx03;->f:Z

    .line 633
    .line 634
    iput-object v4, v0, Lx03;->o:Ljava/lang/Object;

    .line 635
    .line 636
    iput-object v4, v0, Lx03;->n:Ljava/lang/Object;

    .line 637
    .line 638
    iget-object v0, v0, Lx03;->k:Ljava/lang/Object;

    .line 639
    .line 640
    check-cast v0, Ljava/util/ArrayList;

    .line 641
    .line 642
    monitor-enter v0

    .line 643
    :try_start_9
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 644
    .line 645
    .line 646
    monitor-exit v0

    .line 647
    goto :goto_e

    .line 648
    :catchall_4
    move-exception v1

    .line 649
    monitor-exit v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    .line 650
    throw v1

    .line 651
    :cond_16
    :goto_e
    return-void

    .line 652
    :pswitch_c
    iget-object v0, p0, Lbh3;->g:Ljava/lang/Object;

    .line 653
    .line 654
    check-cast v0, Lsk3;

    .line 655
    .line 656
    iget-object v0, v0, Lsk3;->a:Lx03;

    .line 657
    .line 658
    iget-object v1, v0, Lx03;->i:Ljava/lang/Object;

    .line 659
    .line 660
    check-cast v1, Ler3;

    .line 661
    .line 662
    const-string v2, "unlinkToDeath"

    .line 663
    .line 664
    new-array v5, v3, [Ljava/lang/Object;

    .line 665
    .line 666
    invoke-virtual {v1, v2, v5}, Ler3;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 667
    .line 668
    .line 669
    iget-object v1, v0, Lx03;->o:Ljava/lang/Object;

    .line 670
    .line 671
    check-cast v1, Lkk3;

    .line 672
    .line 673
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 674
    .line 675
    .line 676
    check-cast v1, Lsb1;

    .line 677
    .line 678
    iget-object v1, v1, Lsb1;->g:Landroid/os/IBinder;

    .line 679
    .line 680
    iget-object v2, v0, Lx03;->m:Ljava/lang/Object;

    .line 681
    .line 682
    check-cast v2, Ltk3;

    .line 683
    .line 684
    invoke-interface {v1, v2, v3}, Landroid/os/IBinder;->unlinkToDeath(Landroid/os/IBinder$DeathRecipient;I)Z

    .line 685
    .line 686
    .line 687
    iput-object v4, v0, Lx03;->o:Ljava/lang/Object;

    .line 688
    .line 689
    iput-boolean v3, v0, Lx03;->f:Z

    .line 690
    .line 691
    return-void

    .line 692
    :pswitch_d
    iget-object v0, p0, Lbh3;->g:Ljava/lang/Object;

    .line 693
    .line 694
    check-cast v0, Lek3;

    .line 695
    .line 696
    new-instance v1, Lot1;

    .line 697
    .line 698
    invoke-direct {v1, v2, v0}, Lot1;-><init>(ILjava/lang/Object;)V

    .line 699
    .line 700
    .line 701
    :try_start_a
    iget-object v2, v0, Lek3;->a:Landroid/content/Context;

    .line 702
    .line 703
    const-string v3, "appops"

    .line 704
    .line 705
    invoke-virtual {v2, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 706
    .line 707
    .line 708
    move-result-object v2

    .line 709
    if-eqz v2, :cond_17

    .line 710
    .line 711
    check-cast v2, Landroid/app/AppOpsManager;

    .line 712
    .line 713
    sget-object v3, Lek3;->g:[Ljava/lang/String;

    .line 714
    .line 715
    iget-object v0, v0, Lek3;->b:Ljava/util/concurrent/ExecutorService;

    .line 716
    .line 717
    invoke-static {v2, v3, v0, v1}, Lm91;->r(Landroid/app/AppOpsManager;[Ljava/lang/String;Ljava/util/concurrent/Executor;Lot1;)V

    .line 718
    .line 719
    .line 720
    goto :goto_f

    .line 721
    :cond_17
    throw v4
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_5

    .line 722
    :catchall_5
    :goto_f
    return-void

    .line 723
    :pswitch_e
    iget-object v0, p0, Lbh3;->g:Ljava/lang/Object;

    .line 724
    .line 725
    check-cast v0, Lak3;

    .line 726
    .line 727
    new-instance v2, Lra0;

    .line 728
    .line 729
    invoke-direct {v2, v1, v0}, Lra0;-><init>(ILjava/lang/Object;)V

    .line 730
    .line 731
    .line 732
    :try_start_b
    iget-object v0, v0, Lak3;->a:Landroid/content/Context;

    .line 733
    .line 734
    const-string v1, "connectivity"

    .line 735
    .line 736
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 737
    .line 738
    .line 739
    move-result-object v0

    .line 740
    if-eqz v0, :cond_18

    .line 741
    .line 742
    check-cast v0, Landroid/net/ConnectivityManager;

    .line 743
    .line 744
    invoke-virtual {v0, v2}, Landroid/net/ConnectivityManager;->registerDefaultNetworkCallback(Landroid/net/ConnectivityManager$NetworkCallback;)V

    .line 745
    .line 746
    .line 747
    goto :goto_10

    .line 748
    :cond_18
    throw v4
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_6

    .line 749
    :catchall_6
    :goto_10
    return-void

    .line 750
    :pswitch_f
    iget-object v0, p0, Lbh3;->g:Ljava/lang/Object;

    .line 751
    .line 752
    check-cast v0, Lzj3;

    .line 753
    .line 754
    new-instance v1, Lw53;

    .line 755
    .line 756
    const/16 v2, 0xa

    .line 757
    .line 758
    invoke-direct {v1, v2, v0}, Lw53;-><init>(ILjava/lang/Object;)V

    .line 759
    .line 760
    .line 761
    iget-object v2, v0, Lzj3;->d:Lpq3;

    .line 762
    .line 763
    check-cast v2, Lld2;

    .line 764
    .line 765
    invoke-virtual {v2, v1}, Lld2;->c(Ljava/util/concurrent/Callable;)Ln70;

    .line 766
    .line 767
    .line 768
    move-result-object v1

    .line 769
    iget-object v2, v0, Lzj3;->c:Lgk3;

    .line 770
    .line 771
    const/16 v3, 0x35

    .line 772
    .line 773
    invoke-virtual {v2, v3, v1}, Lgk3;->d(ILn70;)V

    .line 774
    .line 775
    .line 776
    iput-object v1, v0, Lzj3;->g:Ln70;

    .line 777
    .line 778
    return-void

    .line 779
    :pswitch_10
    iget-object v0, p0, Lbh3;->g:Ljava/lang/Object;

    .line 780
    .line 781
    check-cast v0, Lft3;

    .line 782
    .line 783
    iget-object v0, v0, Lft3;->h:Ljava/lang/Object;

    .line 784
    .line 785
    monitor-enter v0

    .line 786
    :try_start_c
    iget-object v1, p0, Lbh3;->g:Ljava/lang/Object;

    .line 787
    .line 788
    check-cast v1, Lft3;

    .line 789
    .line 790
    iget-object v1, v1, Lft3;->i:Lmn2;

    .line 791
    .line 792
    iget-object v1, v1, Lmn2;->h:Ljava/lang/Object;

    .line 793
    .line 794
    check-cast v1, Lgi4;

    .line 795
    .line 796
    invoke-virtual {v1}, Lgi4;->f()V

    .line 797
    .line 798
    .line 799
    monitor-exit v0

    .line 800
    return-void

    .line 801
    :catchall_7
    move-exception v1

    .line 802
    monitor-exit v0
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_7

    .line 803
    throw v1

    .line 804
    nop

    .line 805
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
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
