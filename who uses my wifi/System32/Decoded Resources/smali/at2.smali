.class public final synthetic Lat2;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lp21;

.field public final synthetic b:Ln70;

.field public final synthetic c:Ln70;

.field public final synthetic d:Ln70;

.field public final synthetic e:Ln70;

.field public final synthetic f:Ln70;

.field public final synthetic g:Lorg/json/JSONObject;

.field public final synthetic h:Ln70;

.field public final synthetic i:Ln70;

.field public final synthetic j:Ln70;

.field public final synthetic k:Ln70;

.field public final synthetic l:Ln70;


# direct methods
.method public synthetic constructor <init>(Lp21;Ln70;Ln70;Ln70;Ln70;Ln70;Lorg/json/JSONObject;Ln70;Ln70;Ln70;Ln70;Ln70;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lat2;->a:Lp21;

    .line 5
    .line 6
    iput-object p2, p0, Lat2;->b:Ln70;

    .line 7
    .line 8
    iput-object p3, p0, Lat2;->c:Ln70;

    .line 9
    .line 10
    iput-object p4, p0, Lat2;->d:Ln70;

    .line 11
    .line 12
    iput-object p5, p0, Lat2;->e:Ln70;

    .line 13
    .line 14
    iput-object p6, p0, Lat2;->f:Ln70;

    .line 15
    .line 16
    iput-object p7, p0, Lat2;->g:Lorg/json/JSONObject;

    .line 17
    .line 18
    iput-object p8, p0, Lat2;->h:Ln70;

    .line 19
    .line 20
    iput-object p9, p0, Lat2;->i:Ln70;

    .line 21
    .line 22
    iput-object p10, p0, Lat2;->j:Ln70;

    .line 23
    .line 24
    iput-object p11, p0, Lat2;->k:Ln70;

    .line 25
    .line 26
    iput-object p12, p0, Lat2;->l:Ln70;

    .line 27
    .line 28
    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 14

    .line 1
    iget-object v0, p0, Lat2;->a:Lp21;

    .line 2
    .line 3
    iget-object v1, p0, Lat2;->b:Ln70;

    .line 4
    .line 5
    iget-object v2, p0, Lat2;->c:Ln70;

    .line 6
    .line 7
    iget-object v3, p0, Lat2;->d:Ln70;

    .line 8
    .line 9
    iget-object v4, p0, Lat2;->e:Ln70;

    .line 10
    .line 11
    iget-object v5, p0, Lat2;->f:Ln70;

    .line 12
    .line 13
    iget-object v6, p0, Lat2;->g:Lorg/json/JSONObject;

    .line 14
    .line 15
    iget-object v7, p0, Lat2;->h:Ln70;

    .line 16
    .line 17
    iget-object v8, p0, Lat2;->i:Ln70;

    .line 18
    .line 19
    iget-object v9, p0, Lat2;->j:Ln70;

    .line 20
    .line 21
    iget-object v10, p0, Lat2;->k:Ln70;

    .line 22
    .line 23
    iget-object v11, p0, Lat2;->l:Ln70;

    .line 24
    .line 25
    sget-object v12, Lmz1;->o2:Liz1;

    .line 26
    .line 27
    sget-object v13, Ltw1;->e:Ltw1;

    .line 28
    .line 29
    iget-object v13, v13, Ltw1;->c:Lkz1;

    .line 30
    .line 31
    invoke-virtual {v13, v12}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v12

    .line 35
    check-cast v12, Ljava/lang/Boolean;

    .line 36
    .line 37
    invoke-virtual {v12}, Ljava/lang/Boolean;->booleanValue()Z

    .line 38
    .line 39
    .line 40
    move-result v12

    .line 41
    if-eqz v12, :cond_0

    .line 42
    .line 43
    iget-object v0, v0, Lp21;->i:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v0, Ljv2;

    .line 46
    .line 47
    iget-object v0, v0, Ljv2;->e:Landroid/os/Bundle;

    .line 48
    .line 49
    const-string v12, "rendering-native-assets-loading-end"

    .line 50
    .line 51
    sget-object v13, Lhg4;->C:Lhg4;

    .line 52
    .line 53
    iget-object v13, v13, Lhg4;->k:Lym;

    .line 54
    .line 55
    invoke-static {v13, v0, v12}, Lga1;->n(Lym;Landroid/os/Bundle;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    :cond_0
    invoke-interface {v1}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    check-cast v0, Ltr2;

    .line 63
    .line 64
    invoke-interface {v2}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    check-cast v1, Ljava/util/List;

    .line 69
    .line 70
    monitor-enter v0

    .line 71
    :try_start_0
    iput-object v1, v0, Ltr2;->e:Ljava/util/List;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_e

    .line 72
    .line 73
    monitor-exit v0

    .line 74
    invoke-interface {v3}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    check-cast v1, Lb22;

    .line 79
    .line 80
    monitor-enter v0

    .line 81
    :try_start_1
    iput-object v1, v0, Ltr2;->s:Lb22;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_d

    .line 82
    .line 83
    monitor-exit v0

    .line 84
    invoke-interface {v4}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    check-cast v1, Lb22;

    .line 89
    .line 90
    monitor-enter v0

    .line 91
    :try_start_2
    iput-object v1, v0, Ltr2;->t:Lb22;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_c

    .line 92
    .line 93
    monitor-exit v0

    .line 94
    invoke-interface {v5}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    check-cast v1, Lx12;

    .line 99
    .line 100
    monitor-enter v0

    .line 101
    :try_start_3
    iput-object v1, v0, Ltr2;->c:Lx12;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_b

    .line 102
    .line 103
    monitor-exit v0

    .line 104
    const-string v1, "mute"

    .line 105
    .line 106
    invoke-virtual {v6, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    if-nez v1, :cond_1

    .line 111
    .line 112
    sget-object v1, Lxm3;->g:Lvm3;

    .line 113
    .line 114
    sget-object v1, Lsn3;->j:Lsn3;

    .line 115
    .line 116
    goto :goto_2

    .line 117
    :cond_1
    const-string v2, "reasons"

    .line 118
    .line 119
    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 120
    .line 121
    .line 122
    move-result-object v1

    .line 123
    if-eqz v1, :cond_5

    .line 124
    .line 125
    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    .line 126
    .line 127
    .line 128
    move-result v2

    .line 129
    if-gtz v2, :cond_2

    .line 130
    .line 131
    goto :goto_1

    .line 132
    :cond_2
    new-instance v2, Ljava/util/ArrayList;

    .line 133
    .line 134
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 135
    .line 136
    .line 137
    const/4 v3, 0x0

    .line 138
    :goto_0
    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    .line 139
    .line 140
    .line 141
    move-result v4

    .line 142
    if-ge v3, v4, :cond_4

    .line 143
    .line 144
    invoke-virtual {v1, v3}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 145
    .line 146
    .line 147
    move-result-object v4

    .line 148
    invoke-static {v4}, Lft2;->e(Lorg/json/JSONObject;)Lc63;

    .line 149
    .line 150
    .line 151
    move-result-object v4

    .line 152
    if-eqz v4, :cond_3

    .line 153
    .line 154
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 155
    .line 156
    .line 157
    :cond_3
    add-int/lit8 v3, v3, 0x1

    .line 158
    .line 159
    goto :goto_0

    .line 160
    :cond_4
    invoke-static {v2}, Lxm3;->m(Ljava/util/Collection;)Lxm3;

    .line 161
    .line 162
    .line 163
    move-result-object v1

    .line 164
    goto :goto_2

    .line 165
    :cond_5
    :goto_1
    sget-object v1, Lxm3;->g:Lvm3;

    .line 166
    .line 167
    sget-object v1, Lsn3;->j:Lsn3;

    .line 168
    .line 169
    :goto_2
    monitor-enter v0

    .line 170
    :try_start_4
    iput-object v1, v0, Ltr2;->f:Ljava/util/List;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_a

    .line 171
    .line 172
    monitor-exit v0

    .line 173
    const-string v1, "mute"

    .line 174
    .line 175
    invoke-virtual {v6, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 176
    .line 177
    .line 178
    move-result-object v1

    .line 179
    if-nez v1, :cond_6

    .line 180
    .line 181
    goto :goto_3

    .line 182
    :cond_6
    const-string v2, "default_reason"

    .line 183
    .line 184
    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 185
    .line 186
    .line 187
    move-result-object v1

    .line 188
    if-eqz v1, :cond_7

    .line 189
    .line 190
    invoke-static {v1}, Lft2;->e(Lorg/json/JSONObject;)Lc63;

    .line 191
    .line 192
    .line 193
    move-result-object v1

    .line 194
    goto :goto_4

    .line 195
    :cond_7
    :goto_3
    const/4 v1, 0x0

    .line 196
    :goto_4
    monitor-enter v0

    .line 197
    :try_start_5
    iput-object v1, v0, Ltr2;->g:Lc63;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_9

    .line 198
    .line 199
    monitor-exit v0

    .line 200
    invoke-interface {v7}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    move-result-object v1

    .line 204
    check-cast v1, Lag2;

    .line 205
    .line 206
    if-eqz v1, :cond_8

    .line 207
    .line 208
    monitor-enter v0

    .line 209
    :try_start_6
    iput-object v1, v0, Ltr2;->i:Lag2;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 210
    .line 211
    monitor-exit v0

    .line 212
    invoke-interface {v1}, Lag2;->p0()Landroid/view/View;

    .line 213
    .line 214
    .line 215
    move-result-object v2

    .line 216
    monitor-enter v0

    .line 217
    :try_start_7
    iput-object v2, v0, Ltr2;->o:Landroid/view/View;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 218
    .line 219
    monitor-exit v0

    .line 220
    invoke-interface {v1}, Lag2;->f()Lqg2;

    .line 221
    .line 222
    .line 223
    move-result-object v1

    .line 224
    monitor-enter v0

    .line 225
    :try_start_8
    iput-object v1, v0, Ltr2;->b:Lpy2;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 226
    .line 227
    monitor-exit v0

    .line 228
    goto :goto_5

    .line 229
    :catchall_0
    move-exception v1

    .line 230
    :try_start_9
    monitor-exit v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    .line 231
    throw v1

    .line 232
    :catchall_1
    move-exception v1

    .line 233
    :try_start_a
    monitor-exit v0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_1

    .line 234
    throw v1

    .line 235
    :catchall_2
    move-exception v1

    .line 236
    :try_start_b
    monitor-exit v0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_2

    .line 237
    throw v1

    .line 238
    :cond_8
    :goto_5
    invoke-virtual {v0}, Ltr2;->d()Landroid/os/Bundle;

    .line 239
    .line 240
    .line 241
    move-result-object v1

    .line 242
    invoke-interface {v8}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    move-result-object v2

    .line 246
    check-cast v2, Landroid/os/Bundle;

    .line 247
    .line 248
    invoke-virtual {v1, v2}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    .line 249
    .line 250
    .line 251
    invoke-interface {v9}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 252
    .line 253
    .line 254
    move-result-object v1

    .line 255
    check-cast v1, Lag2;

    .line 256
    .line 257
    if-eqz v1, :cond_9

    .line 258
    .line 259
    monitor-enter v0

    .line 260
    :try_start_c
    iput-object v1, v0, Ltr2;->j:Lag2;
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_4

    .line 261
    .line 262
    monitor-exit v0

    .line 263
    invoke-interface {v1}, Lag2;->p0()Landroid/view/View;

    .line 264
    .line 265
    .line 266
    move-result-object v1

    .line 267
    monitor-enter v0

    .line 268
    :try_start_d
    iput-object v1, v0, Ltr2;->p:Landroid/view/View;
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_3

    .line 269
    .line 270
    monitor-exit v0

    .line 271
    goto :goto_6

    .line 272
    :catchall_3
    move-exception v1

    .line 273
    :try_start_e
    monitor-exit v0
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_3

    .line 274
    throw v1

    .line 275
    :catchall_4
    move-exception v1

    .line 276
    :try_start_f
    monitor-exit v0
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_4

    .line 277
    throw v1

    .line 278
    :cond_9
    :goto_6
    sget-object v1, Lmz1;->N5:Liz1;

    .line 279
    .line 280
    sget-object v2, Ltw1;->e:Ltw1;

    .line 281
    .line 282
    iget-object v2, v2, Ltw1;->c:Lkz1;

    .line 283
    .line 284
    invoke-virtual {v2, v1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 285
    .line 286
    .line 287
    move-result-object v1

    .line 288
    check-cast v1, Ljava/lang/Boolean;

    .line 289
    .line 290
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 291
    .line 292
    .line 293
    move-result v1

    .line 294
    if-eqz v1, :cond_b

    .line 295
    .line 296
    const-string v1, "template_id"

    .line 297
    .line 298
    invoke-virtual {v6, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    .line 299
    .line 300
    .line 301
    move-result v1

    .line 302
    const/4 v2, 0x3

    .line 303
    if-ne v1, v2, :cond_a

    .line 304
    .line 305
    goto :goto_7

    .line 306
    :cond_a
    monitor-enter v0

    .line 307
    :try_start_10
    iput-object v10, v0, Ltr2;->m:Ln70;
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_6

    .line 308
    .line 309
    monitor-exit v0

    .line 310
    new-instance v1, Lpd2;

    .line 311
    .line 312
    invoke-direct {v1}, Lpd2;-><init>()V

    .line 313
    .line 314
    .line 315
    monitor-enter v0

    .line 316
    :try_start_11
    iput-object v1, v0, Ltr2;->n:Lpd2;
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_5

    .line 317
    .line 318
    monitor-exit v0

    .line 319
    goto :goto_8

    .line 320
    :catchall_5
    move-exception v1

    .line 321
    :try_start_12
    monitor-exit v0
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_5

    .line 322
    throw v1

    .line 323
    :catchall_6
    move-exception v1

    .line 324
    :try_start_13
    monitor-exit v0
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_6

    .line 325
    throw v1

    .line 326
    :cond_b
    :goto_7
    invoke-interface {v10}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 327
    .line 328
    .line 329
    move-result-object v1

    .line 330
    check-cast v1, Lag2;

    .line 331
    .line 332
    if-eqz v1, :cond_c

    .line 333
    .line 334
    monitor-enter v0

    .line 335
    :try_start_14
    iput-object v1, v0, Ltr2;->k:Lag2;
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_7

    .line 336
    .line 337
    monitor-exit v0

    .line 338
    goto :goto_8

    .line 339
    :catchall_7
    move-exception v1

    .line 340
    :try_start_15
    monitor-exit v0
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_7

    .line 341
    throw v1

    .line 342
    :cond_c
    :goto_8
    invoke-interface {v11}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 343
    .line 344
    .line 345
    move-result-object v1

    .line 346
    check-cast v1, Ljava/util/List;

    .line 347
    .line 348
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 349
    .line 350
    .line 351
    move-result-object v1

    .line 352
    :goto_9
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 353
    .line 354
    .line 355
    move-result v2

    .line 356
    if-eqz v2, :cond_f

    .line 357
    .line 358
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 359
    .line 360
    .line 361
    move-result-object v2

    .line 362
    check-cast v2, Lit2;

    .line 363
    .line 364
    iget v3, v2, Lit2;->a:I

    .line 365
    .line 366
    const/4 v4, 0x1

    .line 367
    if-eq v3, v4, :cond_e

    .line 368
    .line 369
    iget-object v3, v2, Lit2;->b:Ljava/lang/String;

    .line 370
    .line 371
    iget-object v2, v2, Lit2;->d:Lp12;

    .line 372
    .line 373
    monitor-enter v0

    .line 374
    if-nez v2, :cond_d

    .line 375
    .line 376
    :try_start_16
    iget-object v2, v0, Ltr2;->v:Lbw0;

    .line 377
    .line 378
    invoke-virtual {v2, v3}, Lbw0;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_8

    .line 379
    .line 380
    .line 381
    monitor-exit v0

    .line 382
    goto :goto_9

    .line 383
    :catchall_8
    move-exception v1

    .line 384
    goto :goto_a

    .line 385
    :cond_d
    :try_start_17
    iget-object v4, v0, Ltr2;->v:Lbw0;

    .line 386
    .line 387
    invoke-virtual {v4, v3, v2}, Lbw0;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_8

    .line 388
    .line 389
    .line 390
    monitor-exit v0

    .line 391
    goto :goto_9

    .line 392
    :goto_a
    :try_start_18
    monitor-exit v0
    :try_end_18
    .catchall {:try_start_18 .. :try_end_18} :catchall_8

    .line 393
    throw v1

    .line 394
    :cond_e
    iget-object v3, v2, Lit2;->b:Ljava/lang/String;

    .line 395
    .line 396
    iget-object v2, v2, Lit2;->c:Ljava/lang/String;

    .line 397
    .line 398
    invoke-virtual {v0, v3, v2}, Ltr2;->o(Ljava/lang/String;Ljava/lang/String;)V

    .line 399
    .line 400
    .line 401
    goto :goto_9

    .line 402
    :cond_f
    return-object v0

    .line 403
    :catchall_9
    move-exception v1

    .line 404
    :try_start_19
    monitor-exit v0
    :try_end_19
    .catchall {:try_start_19 .. :try_end_19} :catchall_9

    .line 405
    throw v1

    .line 406
    :catchall_a
    move-exception v1

    .line 407
    :try_start_1a
    monitor-exit v0
    :try_end_1a
    .catchall {:try_start_1a .. :try_end_1a} :catchall_a

    .line 408
    throw v1

    .line 409
    :catchall_b
    move-exception v1

    .line 410
    :try_start_1b
    monitor-exit v0
    :try_end_1b
    .catchall {:try_start_1b .. :try_end_1b} :catchall_b

    .line 411
    throw v1

    .line 412
    :catchall_c
    move-exception v1

    .line 413
    :try_start_1c
    monitor-exit v0
    :try_end_1c
    .catchall {:try_start_1c .. :try_end_1c} :catchall_c

    .line 414
    throw v1

    .line 415
    :catchall_d
    move-exception v1

    .line 416
    :try_start_1d
    monitor-exit v0
    :try_end_1d
    .catchall {:try_start_1d .. :try_end_1d} :catchall_d

    .line 417
    throw v1

    .line 418
    :catchall_e
    move-exception v1

    .line 419
    :try_start_1e
    monitor-exit v0
    :try_end_1e
    .catchall {:try_start_1e .. :try_end_1e} :catchall_e

    .line 420
    throw v1
.end method
