.class public final synthetic Lg53;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lxp3;
.implements Lob4;


# instance fields
.field public f:Z

.field public g:Z

.field public final h:Ljava/lang/Object;

.field public final i:Ljava/lang/Object;

.field public j:Ljava/lang/Object;

.field public k:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Li53;Ljava/lang/String;Ljava/util/List;Landroid/os/Bundle;ZZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg53;->h:Ljava/lang/Object;

    iput-object p2, p0, Lg53;->i:Ljava/lang/Object;

    iput-object p3, p0, Lg53;->j:Ljava/lang/Object;

    iput-object p4, p0, Lg53;->k:Ljava/lang/Object;

    iput-boolean p5, p0, Lg53;->f:Z

    iput-boolean p6, p0, Lg53;->g:Z

    return-void
.end method

.method public constructor <init>(Ljb4;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg53;->i:Ljava/lang/Object;

    new-instance p1, Lnc4;

    .line 3
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lsr1;->d:Lsr1;

    iput-object v0, p1, Lnc4;->i:Lsr1;

    .line 4
    iput-object p1, p0, Lg53;->h:Ljava/lang/Object;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lg53;->f:Z

    return-void
.end method


# virtual methods
.method public a()Ln70;
    .locals 14

    .line 1
    iget-object v0, p0, Lg53;->h:Ljava/lang/Object;

    .line 2
    .line 3
    move-object v2, v0

    .line 4
    check-cast v2, Li53;

    .line 5
    .line 6
    iget-object v0, p0, Lg53;->i:Ljava/lang/Object;

    .line 7
    .line 8
    move-object v4, v0

    .line 9
    check-cast v4, Ljava/lang/String;

    .line 10
    .line 11
    iget-object v0, p0, Lg53;->j:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Ljava/util/List;

    .line 14
    .line 15
    iget-object v1, p0, Lg53;->k:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v1, Landroid/os/Bundle;

    .line 18
    .line 19
    iget-boolean v9, p0, Lg53;->f:Z

    .line 20
    .line 21
    iget-boolean v3, p0, Lg53;->g:Z

    .line 22
    .line 23
    new-instance v6, Lpd2;

    .line 24
    .line 25
    invoke-direct {v6}, Lpd2;-><init>()V

    .line 26
    .line 27
    .line 28
    const/4 v5, 0x0

    .line 29
    if-eqz v3, :cond_0

    .line 30
    .line 31
    sget-object v3, Lmz1;->M1:Liz1;

    .line 32
    .line 33
    sget-object v7, Ltw1;->e:Ltw1;

    .line 34
    .line 35
    iget-object v7, v7, Ltw1;->c:Lkz1;

    .line 36
    .line 37
    invoke-virtual {v7, v3}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    check-cast v3, Ljava/lang/Boolean;

    .line 42
    .line 43
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    if-nez v3, :cond_0

    .line 48
    .line 49
    iget-object v3, v2, Li53;->f:Lh23;

    .line 50
    .line 51
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    :try_start_0
    iget-object v7, v3, Lh23;->b:Lyu2;

    .line 55
    .line 56
    invoke-virtual {v7, v4}, Lyu2;->b(Ljava/lang/String;)Ld82;

    .line 57
    .line 58
    .line 59
    move-result-object v7

    .line 60
    iget-object v8, v3, Lh23;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 61
    .line 62
    invoke-virtual {v8, v4, v7}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 63
    .line 64
    .line 65
    goto :goto_0

    .line 66
    :catch_0
    invoke-static {}, Lgi2;->R()Z

    .line 67
    .line 68
    .line 69
    :goto_0
    iget-object v3, v3, Lh23;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 70
    .line 71
    invoke-virtual {v3, v4}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result v7

    .line 75
    if-eqz v7, :cond_1

    .line 76
    .line 77
    invoke-virtual {v3, v4}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v3

    .line 81
    check-cast v3, Ld82;

    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_0
    :try_start_1
    iget-object v3, v2, Li53;->g:Lyu2;

    .line 85
    .line 86
    invoke-virtual {v3, v4}, Lyu2;->b(Ljava/lang/String;)Ld82;

    .line 87
    .line 88
    .line 89
    move-result-object v3
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_1

    .line 90
    goto :goto_1

    .line 91
    :catch_1
    invoke-static {}, Lgi2;->R()Z

    .line 92
    .line 93
    .line 94
    :cond_1
    move-object v3, v5

    .line 95
    :goto_1
    const/4 v10, 0x1

    .line 96
    if-nez v3, :cond_4

    .line 97
    .line 98
    sget-object v0, Lmz1;->C1:Liz1;

    .line 99
    .line 100
    sget-object v1, Ltw1;->e:Ltw1;

    .line 101
    .line 102
    iget-object v2, v1, Ltw1;->c:Lkz1;

    .line 103
    .line 104
    invoke-virtual {v2, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    check-cast v0, Ljava/lang/Boolean;

    .line 109
    .line 110
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 111
    .line 112
    .line 113
    move-result v0

    .line 114
    if-eqz v0, :cond_3

    .line 115
    .line 116
    sget v0, Ll23;->j:I

    .line 117
    .line 118
    const-class v2, Ll23;

    .line 119
    .line 120
    monitor-enter v2

    .line 121
    :try_start_2
    new-instance v0, Lorg/json/JSONObject;

    .line 122
    .line 123
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 124
    .line 125
    .line 126
    :try_start_3
    const-string v3, "name"

    .line 127
    .line 128
    invoke-virtual {v0, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 129
    .line 130
    .line 131
    const-string v3, "signal_error"

    .line 132
    .line 133
    const-string v4, "Adapter failed to instantiate"

    .line 134
    .line 135
    invoke-virtual {v0, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 136
    .line 137
    .line 138
    sget-object v3, Lmz1;->I1:Liz1;

    .line 139
    .line 140
    iget-object v1, v1, Ltw1;->c:Lkz1;

    .line 141
    .line 142
    invoke-virtual {v1, v3}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v1

    .line 146
    check-cast v1, Ljava/lang/Boolean;

    .line 147
    .line 148
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 149
    .line 150
    .line 151
    move-result v1

    .line 152
    if-eqz v1, :cond_2

    .line 153
    .line 154
    const-string v1, "signal_error_code"

    .line 155
    .line 156
    invoke-virtual {v0, v1, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 157
    .line 158
    .line 159
    goto :goto_2

    .line 160
    :catchall_0
    move-exception v0

    .line 161
    goto :goto_3

    .line 162
    :cond_2
    :goto_2
    invoke-virtual {v6, v0}, Lpd2;->a(Ljava/lang/Object;)Z
    :try_end_3
    .catch Lorg/json/JSONException; {:try_start_3 .. :try_end_3} :catch_2
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 163
    .line 164
    .line 165
    :catch_2
    monitor-exit v2

    .line 166
    move-object v0, v6

    .line 167
    goto/16 :goto_5

    .line 168
    .line 169
    :goto_3
    :try_start_4
    monitor-exit v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 170
    throw v0

    .line 171
    :cond_3
    throw v5

    .line 172
    :cond_4
    new-instance v11, Ll23;

    .line 173
    .line 174
    sget-object v5, Lhg4;->C:Lhg4;

    .line 175
    .line 176
    iget-object v5, v5, Lhg4;->k:Lym;

    .line 177
    .line 178
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 179
    .line 180
    .line 181
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 182
    .line 183
    .line 184
    move-result-wide v7

    .line 185
    move-object v5, v3

    .line 186
    move-object v3, v11

    .line 187
    invoke-direct/range {v3 .. v8}, Ll23;-><init>(Ljava/lang/String;Ld82;Lpd2;J)V

    .line 188
    .line 189
    .line 190
    sget-object v4, Lmz1;->H1:Liz1;

    .line 191
    .line 192
    sget-object v7, Ltw1;->e:Ltw1;

    .line 193
    .line 194
    iget-object v8, v7, Ltw1;->c:Lkz1;

    .line 195
    .line 196
    invoke-virtual {v8, v4}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object v4

    .line 200
    check-cast v4, Ljava/lang/Boolean;

    .line 201
    .line 202
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 203
    .line 204
    .line 205
    move-result v4

    .line 206
    if-eqz v4, :cond_5

    .line 207
    .line 208
    iget-object v4, v2, Li53;->b:Ljava/util/concurrent/ScheduledExecutorService;

    .line 209
    .line 210
    new-instance v8, Lbs2;

    .line 211
    .line 212
    const/16 v11, 0xc

    .line 213
    .line 214
    invoke-direct {v8, v11, v3}, Lbs2;-><init>(ILjava/lang/Object;)V

    .line 215
    .line 216
    .line 217
    sget-object v11, Lmz1;->A1:Liz1;

    .line 218
    .line 219
    iget-object v12, v7, Ltw1;->c:Lkz1;

    .line 220
    .line 221
    invoke-virtual {v12, v11}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    move-result-object v11

    .line 225
    check-cast v11, Ljava/lang/Long;

    .line 226
    .line 227
    invoke-virtual {v11}, Ljava/lang/Long;->longValue()J

    .line 228
    .line 229
    .line 230
    move-result-wide v11

    .line 231
    sget-object v13, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 232
    .line 233
    invoke-interface {v4, v8, v11, v12, v13}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 234
    .line 235
    .line 236
    :cond_5
    const/4 v4, 0x0

    .line 237
    if-eqz v9, :cond_7

    .line 238
    .line 239
    sget-object v8, Lmz1;->O1:Liz1;

    .line 240
    .line 241
    iget-object v7, v7, Ltw1;->c:Lkz1;

    .line 242
    .line 243
    invoke-virtual {v7, v8}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 244
    .line 245
    .line 246
    move-result-object v7

    .line 247
    check-cast v7, Ljava/lang/Boolean;

    .line 248
    .line 249
    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    .line 250
    .line 251
    .line 252
    move-result v7

    .line 253
    if-eqz v7, :cond_6

    .line 254
    .line 255
    iget-object v8, v2, Li53;->a:Lpq3;

    .line 256
    .line 257
    move-object v4, v1

    .line 258
    new-instance v1, Lh53;

    .line 259
    .line 260
    move-object v7, v6

    .line 261
    move-object v6, v3

    .line 262
    move-object v3, v5

    .line 263
    move-object v5, v0

    .line 264
    invoke-direct/range {v1 .. v7}, Lh53;-><init>(Li53;Ld82;Landroid/os/Bundle;Ljava/util/List;Ll23;Lpd2;)V

    .line 265
    .line 266
    .line 267
    move-object v0, v7

    .line 268
    check-cast v8, Lld2;

    .line 269
    .line 270
    invoke-virtual {v8, v1}, Lld2;->a(Ljava/lang/Runnable;)Ln70;

    .line 271
    .line 272
    .line 273
    goto :goto_5

    .line 274
    :cond_6
    move-object v8, v5

    .line 275
    move-object v5, v0

    .line 276
    move-object v0, v6

    .line 277
    move-object v6, v3

    .line 278
    move-object v3, v8

    .line 279
    move-object v8, v1

    .line 280
    iget-object v1, v2, Li53;->d:Landroid/content/Context;

    .line 281
    .line 282
    move-object v11, v6

    .line 283
    new-instance v6, Loi0;

    .line 284
    .line 285
    invoke-direct {v6, v1}, Loi0;-><init>(Ljava/lang/Object;)V

    .line 286
    .line 287
    .line 288
    invoke-interface {v5, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 289
    .line 290
    .line 291
    move-result-object v1

    .line 292
    move-object v9, v1

    .line 293
    check-cast v9, Landroid/os/Bundle;

    .line 294
    .line 295
    iget-object v7, v2, Li53;->j:Ljava/lang/String;

    .line 296
    .line 297
    iget-object v1, v2, Li53;->e:Ll83;

    .line 298
    .line 299
    iget-object v10, v1, Ll83;->f:Lxe4;

    .line 300
    .line 301
    move-object v5, v3

    .line 302
    invoke-interface/range {v5 .. v11}, Ld82;->q3(Lu10;Ljava/lang/String;Landroid/os/Bundle;Landroid/os/Bundle;Lxe4;Lf82;)V

    .line 303
    .line 304
    .line 305
    goto :goto_5

    .line 306
    :cond_7
    move-object v0, v6

    .line 307
    monitor-enter v3

    .line 308
    :try_start_5
    iget-boolean v1, v3, Ll23;->i:Z
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 309
    .line 310
    if-eqz v1, :cond_8

    .line 311
    .line 312
    monitor-exit v3

    .line 313
    goto :goto_5

    .line 314
    :cond_8
    :try_start_6
    sget-object v1, Lmz1;->I1:Liz1;

    .line 315
    .line 316
    iget-object v2, v7, Ltw1;->c:Lkz1;

    .line 317
    .line 318
    invoke-virtual {v2, v1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 319
    .line 320
    .line 321
    move-result-object v1

    .line 322
    check-cast v1, Ljava/lang/Boolean;

    .line 323
    .line 324
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 325
    .line 326
    .line 327
    move-result v1

    .line 328
    if-eqz v1, :cond_9

    .line 329
    .line 330
    iget-object v1, v3, Ll23;->g:Lorg/json/JSONObject;

    .line 331
    .line 332
    const-string v2, "signal_error_code"

    .line 333
    .line 334
    invoke-virtual {v1, v2, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    :try_end_6
    .catch Lorg/json/JSONException; {:try_start_6 .. :try_end_6} :catch_3
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 335
    .line 336
    .line 337
    goto :goto_4

    .line 338
    :catchall_1
    move-exception v0

    .line 339
    goto :goto_6

    .line 340
    :catch_3
    :cond_9
    :goto_4
    :try_start_7
    iget-object v1, v3, Ll23;->f:Lpd2;

    .line 341
    .line 342
    iget-object v2, v3, Ll23;->g:Lorg/json/JSONObject;

    .line 343
    .line 344
    invoke-virtual {v1, v2}, Lpd2;->a(Ljava/lang/Object;)Z

    .line 345
    .line 346
    .line 347
    iput-boolean v10, v3, Ll23;->i:Z
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 348
    .line 349
    monitor-exit v3

    .line 350
    :goto_5
    return-object v0

    .line 351
    :goto_6
    :try_start_8
    monitor-exit v3
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    .line 352
    throw v0
.end method

.method public b(Lsr1;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lg53;->k:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lob4;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-interface {v0, p1}, Lob4;->b(Lsr1;)V

    .line 8
    .line 9
    .line 10
    iget-object p1, p0, Lg53;->k:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p1, Lob4;

    .line 13
    .line 14
    invoke-interface {p1}, Lob4;->g()Lsr1;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    :cond_0
    iget-object v0, p0, Lg53;->h:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, Lnc4;

    .line 21
    .line 22
    invoke-virtual {v0, p1}, Lnc4;->b(Lsr1;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public c(Lkg4;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Lkg4;->m0()Lob4;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    iget-object v1, p0, Lg53;->k:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, Lob4;

    .line 10
    .line 11
    if-eq v0, v1, :cond_1

    .line 12
    .line 13
    if-nez v1, :cond_0

    .line 14
    .line 15
    iput-object v0, p0, Lg53;->k:Ljava/lang/Object;

    .line 16
    .line 17
    iput-object p1, p0, Lg53;->j:Ljava/lang/Object;

    .line 18
    .line 19
    iget-object p1, p0, Lg53;->h:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast p1, Lnc4;

    .line 22
    .line 23
    iget-object p1, p1, Lnc4;->i:Lsr1;

    .line 24
    .line 25
    check-cast v0, Lef4;

    .line 26
    .line 27
    invoke-virtual {v0, p1}, Lef4;->b(Lsr1;)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 32
    .line 33
    const-string v0, "Multiple renderer media clocks enabled."

    .line 34
    .line 35
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    new-instance v0, Lb84;

    .line 39
    .line 40
    const/4 v1, 0x2

    .line 41
    const/16 v2, 0x3e8

    .line 42
    .line 43
    invoke-direct {v0, v1, p1, v2}, Lb84;-><init>(ILjava/lang/Exception;I)V

    .line 44
    .line 45
    .line 46
    throw v0

    .line 47
    :cond_1
    return-void
.end method

.method public e()J
    .locals 2

    .line 1
    iget-boolean v0, p0, Lg53;->f:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lg53;->h:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Lnc4;

    .line 8
    .line 9
    invoke-virtual {v0}, Lnc4;->e()J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    return-wide v0

    .line 14
    :cond_0
    iget-object v0, p0, Lg53;->k:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, Lob4;

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    invoke-interface {v0}, Lob4;->e()J

    .line 22
    .line 23
    .line 24
    move-result-wide v0

    .line 25
    return-wide v0
.end method

.method public f()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lg53;->f:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    return v0

    .line 7
    :cond_0
    iget-object v0, p0, Lg53;->k:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Lob4;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    invoke-interface {v0}, Lob4;->f()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    return v0
.end method

.method public g()Lsr1;
    .locals 1

    .line 1
    iget-object v0, p0, Lg53;->k:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lob4;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-interface {v0}, Lob4;->g()Lsr1;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0

    .line 12
    :cond_0
    iget-object v0, p0, Lg53;->h:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Lnc4;

    .line 15
    .line 16
    iget-object v0, v0, Lnc4;->i:Lsr1;

    .line 17
    .line 18
    return-object v0
.end method
