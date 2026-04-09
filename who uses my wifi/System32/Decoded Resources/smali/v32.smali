.class public final synthetic Lv32;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ly32;


# instance fields
.field public final synthetic f:I

.field public final g:Ljava/lang/Object;

.field public final h:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lv32;->f:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lv32;->g:Ljava/lang/Object;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lv32;->h:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ldr2;Landroid/view/View;)V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, Lv32;->f:I

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lv32;->g:Ljava/lang/Object;

    .line 4
    sget-object p1, Lmz1;->Jd:Liz1;

    .line 5
    sget-object v0, Ltw1;->e:Ltw1;

    iget-object v0, v0, Ltw1;->c:Lkz1;

    .line 6
    invoke-virtual {v0, p1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    move-result-object p1

    .line 7
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_0

    new-instance p1, Ljava/lang/ref/WeakReference;

    .line 8
    invoke-direct {p1, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lv32;->h:Ljava/lang/Object;

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/ref/WeakReference;

    const/4 p2, 0x0

    .line 9
    invoke-direct {p1, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lv32;->h:Ljava/lang/Object;

    :goto_0
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p3, p0, Lv32;->f:I

    iput-object p1, p0, Lv32;->g:Ljava/lang/Object;

    iput-object p2, p0, Lv32;->h:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Lk42;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lv32;->g:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lv32;->h:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v1, Ljava/util/HashMap;

    .line 7
    .line 8
    invoke-virtual {v1, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    monitor-exit v0

    .line 12
    return-void

    .line 13
    :catchall_0
    move-exception p1

    .line 14
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    throw p1
.end method

.method public final c(Ljava/lang/Object;Ljava/util/Map;)V
    .locals 8

    .line 1
    iget v0, p0, Lv32;->f:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const-string v0, "u"

    .line 7
    .line 8
    check-cast p1, Lag2;

    .line 9
    .line 10
    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p2

    .line 14
    move-object v4, p2

    .line 15
    check-cast v4, Ljava/lang/String;

    .line 16
    .line 17
    if-nez v4, :cond_0

    .line 18
    .line 19
    const-string p1, "URL missing from httpTrack GMSG."

    .line 20
    .line 21
    invoke-static {p1}, Lgi2;->i0(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_0
    invoke-interface {p1}, Lag2;->F()La83;

    .line 26
    .line 27
    .line 28
    move-result-object p2

    .line 29
    if-eqz p2, :cond_2

    .line 30
    .line 31
    iget-boolean v0, p2, La83;->i0:Z

    .line 32
    .line 33
    if-eqz v0, :cond_1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    iget-object p1, p0, Lv32;->g:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast p1, Leb3;

    .line 39
    .line 40
    iget-object p2, p2, La83;->x0:Lx34;

    .line 41
    .line 42
    const/4 v0, 0x0

    .line 43
    invoke-virtual {p1, v4, p2, v0, v0}, Leb3;->b(Ljava/lang/String;Lx34;Lda3;Lao2;)V

    .line 44
    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_2
    :goto_0
    invoke-interface {p1}, Lag2;->F0()Lc83;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    if-nez p1, :cond_3

    .line 52
    .line 53
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 54
    .line 55
    const-string p2, "Common configuration cannot be null"

    .line 56
    .line 57
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    const-string p2, "BufferingGmsgHandlers.getBufferingHttpTrackGmsgHandler"

    .line 61
    .line 62
    sget-object v0, Lhg4;->C:Lhg4;

    .line 63
    .line 64
    iget-object v0, v0, Lhg4;->h:Lgd2;

    .line 65
    .line 66
    invoke-virtual {v0, p2, p1}, Lgd2;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 67
    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_3
    iget-object p2, p0, Lv32;->h:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast p2, Ljz2;

    .line 73
    .line 74
    new-instance v0, Lwo1;

    .line 75
    .line 76
    sget-object v1, Lhg4;->C:Lhg4;

    .line 77
    .line 78
    iget-object v1, v1, Lhg4;->k:Lym;

    .line 79
    .line 80
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 84
    .line 85
    .line 86
    move-result-wide v1

    .line 87
    iget-object v3, p1, Lc83;->b:Ljava/lang/String;

    .line 88
    .line 89
    const/4 v5, 0x2

    .line 90
    invoke-direct/range {v0 .. v5}, Lwo1;-><init>(JLjava/lang/String;Ljava/lang/String;I)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 94
    .line 95
    .line 96
    new-instance p1, Lmr2;

    .line 97
    .line 98
    const/4 v1, 0x4

    .line 99
    const/4 v2, 0x0

    .line 100
    invoke-direct {p1, p2, v0, v1, v2}, Lmr2;-><init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {p2, p1}, Ljz2;->a(Lo93;)V

    .line 104
    .line 105
    .line 106
    :goto_1
    return-void

    .line 107
    :pswitch_0
    iget-object p2, p0, Lv32;->g:Ljava/lang/Object;

    .line 108
    .line 109
    check-cast p2, Lou2;

    .line 110
    .line 111
    iget-object v0, p0, Lv32;->h:Ljava/lang/Object;

    .line 112
    .line 113
    check-cast v0, Lag2;

    .line 114
    .line 115
    check-cast p1, Lag2;

    .line 116
    .line 117
    iget-object p1, p2, Lou2;->i:Lxj2;

    .line 118
    .line 119
    monitor-enter p1

    .line 120
    :try_start_0
    iget-object p2, p1, Lxj2;->h:Ljava/util/HashSet;

    .line 121
    .line 122
    invoke-virtual {p2, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    iget-object p2, p1, Lxj2;->f:Lqj2;

    .line 126
    .line 127
    const-string v1, "/updateActiveView"

    .line 128
    .line 129
    iget-object v2, p2, Lqj2;->e:Lpj2;

    .line 130
    .line 131
    invoke-interface {v0, v1, v2}, Lag2;->v0(Ljava/lang/String;Ly32;)V

    .line 132
    .line 133
    .line 134
    const-string v1, "/untrackActiveViewUnit"

    .line 135
    .line 136
    iget-object p2, p2, Lqj2;->f:Lpj2;

    .line 137
    .line 138
    invoke-interface {v0, v1, p2}, Lag2;->v0(Ljava/lang/String;Ly32;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 139
    .line 140
    .line 141
    monitor-exit p1

    .line 142
    return-void

    .line 143
    :catchall_0
    move-exception v0

    .line 144
    move-object p2, v0

    .line 145
    :try_start_1
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 146
    throw p2

    .line 147
    :pswitch_1
    iget-object p1, p0, Lv32;->g:Ljava/lang/Object;

    .line 148
    .line 149
    check-cast p1, Lhs2;

    .line 150
    .line 151
    :try_start_2
    const-string v0, "timestamp"

    .line 152
    .line 153
    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    check-cast v0, Ljava/lang/String;

    .line 158
    .line 159
    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 160
    .line 161
    .line 162
    move-result-wide v0

    .line 163
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    iput-object v0, p1, Lhs2;->k:Ljava/lang/Long;
    :try_end_2
    .catch Ljava/lang/NumberFormatException; {:try_start_2 .. :try_end_2} :catch_0

    .line 168
    .line 169
    goto :goto_2

    .line 170
    :catch_0
    const-string v0, "Failed to call parse unconfirmedClickTimestamp."

    .line 171
    .line 172
    invoke-static {v0}, Lgi2;->Z(Ljava/lang/String;)V

    .line 173
    .line 174
    .line 175
    :goto_2
    iget-object v0, p0, Lv32;->h:Ljava/lang/Object;

    .line 176
    .line 177
    check-cast v0, La32;

    .line 178
    .line 179
    const-string v1, "id"

    .line 180
    .line 181
    invoke-interface {p2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object v1

    .line 185
    check-cast v1, Ljava/lang/String;

    .line 186
    .line 187
    iput-object v1, p1, Lhs2;->j:Ljava/lang/String;

    .line 188
    .line 189
    const-string p1, "asset_id"

    .line 190
    .line 191
    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object p1

    .line 195
    check-cast p1, Ljava/lang/String;

    .line 196
    .line 197
    if-nez v0, :cond_4

    .line 198
    .line 199
    const-string p1, "Received unconfirmed click but UnconfirmedClickListener is null."

    .line 200
    .line 201
    invoke-static {p1}, Lgi2;->U(Ljava/lang/String;)V

    .line 202
    .line 203
    .line 204
    goto :goto_3

    .line 205
    :cond_4
    :try_start_3
    invoke-virtual {v0}, Lsb1;->U()Landroid/os/Parcel;

    .line 206
    .line 207
    .line 208
    move-result-object p2

    .line 209
    invoke-virtual {p2, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 210
    .line 211
    .line 212
    const/4 p1, 0x1

    .line 213
    invoke-virtual {v0, p2, p1}, Lsb1;->M0(Landroid/os/Parcel;I)V
    :try_end_3
    .catch Landroid/os/RemoteException; {:try_start_3 .. :try_end_3} :catch_1

    .line 214
    .line 215
    .line 216
    goto :goto_3

    .line 217
    :catch_1
    move-exception v0

    .line 218
    move-object p1, v0

    .line 219
    const-string p2, "#007 Could not call remote method."

    .line 220
    .line 221
    invoke-static {p2, p1}, Lgi2;->p0(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 222
    .line 223
    .line 224
    :goto_3
    return-void

    .line 225
    :pswitch_2
    iget-object p1, p0, Lv32;->g:Ljava/lang/Object;

    .line 226
    .line 227
    check-cast p1, Ljava/lang/ref/WeakReference;

    .line 228
    .line 229
    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    move-result-object p1

    .line 233
    check-cast p1, Ldr2;

    .line 234
    .line 235
    if-nez p1, :cond_5

    .line 236
    .line 237
    goto :goto_6

    .line 238
    :cond_5
    iget-object p2, p1, Ldr2;->l:Lcn2;

    .line 239
    .line 240
    invoke-virtual {p2}, Lcn2;->a()V

    .line 241
    .line 242
    .line 243
    sget-object p2, Lmz1;->Jd:Liz1;

    .line 244
    .line 245
    sget-object v0, Ltw1;->e:Ltw1;

    .line 246
    .line 247
    iget-object v1, v0, Ltw1;->c:Lkz1;

    .line 248
    .line 249
    invoke-virtual {v1, p2}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 250
    .line 251
    .line 252
    move-result-object v1

    .line 253
    check-cast v1, Ljava/lang/Boolean;

    .line 254
    .line 255
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 256
    .line 257
    .line 258
    move-result v1

    .line 259
    if-eqz v1, :cond_9

    .line 260
    .line 261
    iget-object v1, p0, Lv32;->h:Ljava/lang/Object;

    .line 262
    .line 263
    check-cast v1, Ljava/lang/ref/WeakReference;

    .line 264
    .line 265
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 266
    .line 267
    .line 268
    move-result-object v1

    .line 269
    check-cast v1, Landroid/view/View;

    .line 270
    .line 271
    iget-object v2, p1, Ldr2;->o:La83;

    .line 272
    .line 273
    iget-object p1, p1, Ldr2;->J:Lfs2;

    .line 274
    .line 275
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 276
    .line 277
    .line 278
    const-string v3, "hcp"

    .line 279
    .line 280
    iget-object v0, v0, Ltw1;->c:Lkz1;

    .line 281
    .line 282
    invoke-virtual {v0, p2}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 283
    .line 284
    .line 285
    move-result-object p2

    .line 286
    check-cast p2, Ljava/lang/Boolean;

    .line 287
    .line 288
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 289
    .line 290
    .line 291
    move-result p2

    .line 292
    if-eqz p2, :cond_9

    .line 293
    .line 294
    if-nez v1, :cond_6

    .line 295
    .line 296
    goto :goto_6

    .line 297
    :cond_6
    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 298
    .line 299
    .line 300
    move-result-object p2

    .line 301
    :goto_4
    if-eqz p2, :cond_8

    .line 302
    .line 303
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 304
    .line 305
    .line 306
    move-result-object v0

    .line 307
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 308
    .line 309
    .line 310
    move-result-object v0

    .line 311
    const-string v1, "androidx.compose.ui"

    .line 312
    .line 313
    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 314
    .line 315
    .line 316
    move-result v0

    .line 317
    if-eqz v0, :cond_7

    .line 318
    .line 319
    const-string p2, "1"

    .line 320
    .line 321
    goto :goto_5

    .line 322
    :cond_7
    invoke-interface {p2}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    .line 323
    .line 324
    .line 325
    move-result-object p2

    .line 326
    goto :goto_4

    .line 327
    :cond_8
    const-string p2, "0"

    .line 328
    .line 329
    :goto_5
    iget-object p1, p1, Lfs2;->a:Lmv2;

    .line 330
    .line 331
    invoke-virtual {p1}, Lmv2;->a()Llv2;

    .line 332
    .line 333
    .line 334
    move-result-object p1

    .line 335
    const-string v0, "action"

    .line 336
    .line 337
    invoke-virtual {p1, v0, v3}, Llv2;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 338
    .line 339
    .line 340
    invoke-virtual {p1, v3, p2}, Llv2;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 341
    .line 342
    .line 343
    invoke-virtual {p1, v2}, Llv2;->i(La83;)V

    .line 344
    .line 345
    .line 346
    invoke-virtual {p1}, Llv2;->m()V

    .line 347
    .line 348
    .line 349
    :cond_9
    :goto_6
    return-void

    .line 350
    :pswitch_3
    const-string p1, "id"

    .line 351
    .line 352
    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 353
    .line 354
    .line 355
    move-result-object p1

    .line 356
    check-cast p1, Ljava/lang/String;

    .line 357
    .line 358
    const-string v0, "fail"

    .line 359
    .line 360
    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 361
    .line 362
    .line 363
    move-result-object v0

    .line 364
    check-cast v0, Ljava/lang/String;

    .line 365
    .line 366
    const-string v1, "fail_reason"

    .line 367
    .line 368
    invoke-interface {p2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 369
    .line 370
    .line 371
    move-result-object v1

    .line 372
    check-cast v1, Ljava/lang/String;

    .line 373
    .line 374
    const-string v2, "fail_stack"

    .line 375
    .line 376
    invoke-interface {p2, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 377
    .line 378
    .line 379
    move-result-object v2

    .line 380
    check-cast v2, Ljava/lang/String;

    .line 381
    .line 382
    const-string v3, "result"

    .line 383
    .line 384
    invoke-interface {p2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 385
    .line 386
    .line 387
    move-result-object p2

    .line 388
    check-cast p2, Ljava/lang/String;

    .line 389
    .line 390
    const/4 v3, 0x1

    .line 391
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 392
    .line 393
    .line 394
    move-result v4

    .line 395
    if-ne v3, v4, :cond_a

    .line 396
    .line 397
    const-string v1, "Unknown Fail Reason."

    .line 398
    .line 399
    :cond_a
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 400
    .line 401
    .line 402
    move-result v3

    .line 403
    const-string v4, "Result GMSG: "

    .line 404
    .line 405
    const-string v5, "Received result for unexpected method invocation: "

    .line 406
    .line 407
    if-eqz v3, :cond_b

    .line 408
    .line 409
    const-string v2, ""

    .line 410
    .line 411
    goto :goto_7

    .line 412
    :cond_b
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 413
    .line 414
    .line 415
    move-result-object v2

    .line 416
    const-string v3, "\n"

    .line 417
    .line 418
    invoke-virtual {v3, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 419
    .line 420
    .line 421
    move-result-object v2

    .line 422
    :goto_7
    iget-object v3, p0, Lv32;->g:Ljava/lang/Object;

    .line 423
    .line 424
    monitor-enter v3

    .line 425
    :try_start_4
    iget-object v6, p0, Lv32;->h:Ljava/lang/Object;

    .line 426
    .line 427
    check-cast v6, Ljava/util/HashMap;

    .line 428
    .line 429
    invoke-virtual {v6, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 430
    .line 431
    .line 432
    move-result-object v6

    .line 433
    check-cast v6, Lk42;

    .line 434
    .line 435
    if-nez v6, :cond_c

    .line 436
    .line 437
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 438
    .line 439
    .line 440
    move-result-object p2

    .line 441
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 442
    .line 443
    .line 444
    move-result p2

    .line 445
    add-int/lit8 p2, p2, 0x32

    .line 446
    .line 447
    new-instance v0, Ljava/lang/StringBuilder;

    .line 448
    .line 449
    invoke-direct {v0, p2}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 450
    .line 451
    .line 452
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 453
    .line 454
    .line 455
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 456
    .line 457
    .line 458
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 459
    .line 460
    .line 461
    move-result-object p1

    .line 462
    invoke-static {p1}, Lgi2;->i0(Ljava/lang/String;)V

    .line 463
    .line 464
    .line 465
    monitor-exit v3

    .line 466
    goto/16 :goto_b

    .line 467
    .line 468
    :catchall_1
    move-exception v0

    .line 469
    move-object p1, v0

    .line 470
    goto :goto_c

    .line 471
    :cond_c
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 472
    .line 473
    .line 474
    move-result p1

    .line 475
    if-nez p1, :cond_d

    .line 476
    .line 477
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 478
    .line 479
    .line 480
    move-result-object p1

    .line 481
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 482
    .line 483
    .line 484
    move-result p1

    .line 485
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 486
    .line 487
    .line 488
    move-result p2

    .line 489
    add-int/2addr p1, p2

    .line 490
    new-instance p2, Ljava/lang/StringBuilder;

    .line 491
    .line 492
    invoke-direct {p2, p1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 493
    .line 494
    .line 495
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 496
    .line 497
    .line 498
    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 499
    .line 500
    .line 501
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 502
    .line 503
    .line 504
    move-result-object p1

    .line 505
    invoke-interface {v6, p1}, Lk42;->w(Ljava/lang/String;)V

    .line 506
    .line 507
    .line 508
    monitor-exit v3

    .line 509
    goto :goto_b

    .line 510
    :cond_d
    if-nez p2, :cond_e

    .line 511
    .line 512
    const/4 p1, 0x0

    .line 513
    invoke-interface {v6, p1}, Lk42;->x(Lorg/json/JSONObject;)V

    .line 514
    .line 515
    .line 516
    monitor-exit v3
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 517
    goto :goto_b

    .line 518
    :cond_e
    :try_start_5
    new-instance p1, Lorg/json/JSONObject;

    .line 519
    .line 520
    invoke-direct {p1, p2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 521
    .line 522
    .line 523
    invoke-static {}, Lgi2;->R()Z

    .line 524
    .line 525
    .line 526
    move-result p2

    .line 527
    if-eqz p2, :cond_f

    .line 528
    .line 529
    const/4 p2, 0x2

    .line 530
    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->toString(I)Ljava/lang/String;

    .line 531
    .line 532
    .line 533
    move-result-object p2

    .line 534
    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 535
    .line 536
    .line 537
    move-result-object v0

    .line 538
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 539
    .line 540
    .line 541
    move-result v0

    .line 542
    add-int/lit8 v0, v0, 0xd

    .line 543
    .line 544
    new-instance v1, Ljava/lang/StringBuilder;

    .line 545
    .line 546
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 547
    .line 548
    .line 549
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 550
    .line 551
    .line 552
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 553
    .line 554
    .line 555
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 556
    .line 557
    .line 558
    move-result-object p2

    .line 559
    invoke-static {p2}, Lgi2;->G(Ljava/lang/String;)V

    .line 560
    .line 561
    .line 562
    goto :goto_8

    .line 563
    :catch_2
    move-exception v0

    .line 564
    move-object p1, v0

    .line 565
    goto :goto_9

    .line 566
    :cond_f
    :goto_8
    invoke-interface {v6, p1}, Lk42;->x(Lorg/json/JSONObject;)V
    :try_end_5
    .catch Lorg/json/JSONException; {:try_start_5 .. :try_end_5} :catch_2
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 567
    .line 568
    .line 569
    goto :goto_a

    .line 570
    :goto_9
    :try_start_6
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 571
    .line 572
    .line 573
    move-result-object p1

    .line 574
    invoke-interface {v6, p1}, Lk42;->w(Ljava/lang/String;)V

    .line 575
    .line 576
    .line 577
    :goto_a
    monitor-exit v3

    .line 578
    :goto_b
    return-void

    .line 579
    :goto_c
    monitor-exit v3
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 580
    throw p1

    .line 581
    :pswitch_4
    const-string p1, "_aa"

    .line 582
    .line 583
    const-string v0, "_ac"

    .line 584
    .line 585
    iget-object v1, p0, Lv32;->h:Ljava/lang/Object;

    .line 586
    .line 587
    check-cast v1, Ljava/util/Map;

    .line 588
    .line 589
    const-string v2, "_ai"

    .line 590
    .line 591
    sget-object v3, Lhg4;->C:Lhg4;

    .line 592
    .line 593
    iget-object v4, v3, Lhg4;->y:Loc2;

    .line 594
    .line 595
    iget-object v3, v3, Lhg4;->y:Loc2;

    .line 596
    .line 597
    iget-object v5, p0, Lv32;->g:Ljava/lang/Object;

    .line 598
    .line 599
    check-cast v5, Landroid/content/Context;

    .line 600
    .line 601
    invoke-virtual {v4, v5}, Loc2;->a(Landroid/content/Context;)Z

    .line 602
    .line 603
    .line 604
    move-result v4

    .line 605
    if-nez v4, :cond_10

    .line 606
    .line 607
    goto :goto_e

    .line 608
    :cond_10
    const-string v4, "eventName"

    .line 609
    .line 610
    invoke-interface {p2, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 611
    .line 612
    .line 613
    move-result-object v4

    .line 614
    check-cast v4, Ljava/lang/String;

    .line 615
    .line 616
    const-string v6, "eventId"

    .line 617
    .line 618
    invoke-interface {p2, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 619
    .line 620
    .line 621
    move-result-object p2

    .line 622
    check-cast p2, Ljava/lang/String;

    .line 623
    .line 624
    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    .line 625
    .line 626
    .line 627
    move-result v6

    .line 628
    const v7, 0x170bf

    .line 629
    .line 630
    .line 631
    if-eq v6, v7, :cond_13

    .line 632
    .line 633
    const p1, 0x170c1

    .line 634
    .line 635
    .line 636
    if-eq v6, p1, :cond_12

    .line 637
    .line 638
    const p1, 0x170c7

    .line 639
    .line 640
    .line 641
    if-eq v6, p1, :cond_11

    .line 642
    .line 643
    goto :goto_d

    .line 644
    :cond_11
    invoke-virtual {v4, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 645
    .line 646
    .line 647
    move-result p1

    .line 648
    if-eqz p1, :cond_14

    .line 649
    .line 650
    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 651
    .line 652
    .line 653
    move-result-object p1

    .line 654
    check-cast p1, Ljava/util/Map;

    .line 655
    .line 656
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 657
    .line 658
    .line 659
    invoke-static {p1}, Loc2;->f(Ljava/util/Map;)Landroid/os/Bundle;

    .line 660
    .line 661
    .line 662
    move-result-object p1

    .line 663
    invoke-virtual {v3, v5, v2, p2, p1}, Loc2;->h(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 664
    .line 665
    .line 666
    goto :goto_e

    .line 667
    :cond_12
    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 668
    .line 669
    .line 670
    move-result p1

    .line 671
    if-eqz p1, :cond_14

    .line 672
    .line 673
    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 674
    .line 675
    .line 676
    move-result-object p1

    .line 677
    check-cast p1, Ljava/util/Map;

    .line 678
    .line 679
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 680
    .line 681
    .line 682
    invoke-static {p1}, Loc2;->f(Ljava/util/Map;)Landroid/os/Bundle;

    .line 683
    .line 684
    .line 685
    move-result-object p1

    .line 686
    invoke-virtual {v3, v5, v0, p2, p1}, Loc2;->h(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 687
    .line 688
    .line 689
    goto :goto_e

    .line 690
    :cond_13
    invoke-virtual {v4, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 691
    .line 692
    .line 693
    move-result v0

    .line 694
    if-eqz v0, :cond_14

    .line 695
    .line 696
    const/4 v0, 0x0

    .line 697
    invoke-virtual {v3, v5, p1, p2, v0}, Loc2;->h(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 698
    .line 699
    .line 700
    goto :goto_e

    .line 701
    :cond_14
    :goto_d
    const-string p1, "logScionEvent gmsg contained unsupported eventName"

    .line 702
    .line 703
    invoke-static {p1}, Lgi2;->Z(Ljava/lang/String;)V

    .line 704
    .line 705
    .line 706
    :goto_e
    return-void

    .line 707
    :pswitch_5
    check-cast p1, Lag2;

    .line 708
    .line 709
    iget-object v0, p0, Lv32;->g:Ljava/lang/Object;

    .line 710
    .line 711
    check-cast v0, Lxp2;

    .line 712
    .line 713
    invoke-static {p2, v0}, Lx32;->b(Ljava/util/Map;Lxp2;)V

    .line 714
    .line 715
    .line 716
    const-string v0, "u"

    .line 717
    .line 718
    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 719
    .line 720
    .line 721
    move-result-object p2

    .line 722
    check-cast p2, Ljava/lang/String;

    .line 723
    .line 724
    if-nez p2, :cond_15

    .line 725
    .line 726
    const-string p1, "URL missing from click GMSG."

    .line 727
    .line 728
    invoke-static {p1}, Lgi2;->i0(Ljava/lang/String;)V

    .line 729
    .line 730
    .line 731
    goto :goto_f

    .line 732
    :cond_15
    iget-object v0, p0, Lv32;->h:Ljava/lang/Object;

    .line 733
    .line 734
    check-cast v0, Lgj2;

    .line 735
    .line 736
    invoke-static {p1, p2}, Lx32;->a(Lag2;Ljava/lang/String;)Ln70;

    .line 737
    .line 738
    .line 739
    move-result-object v1

    .line 740
    invoke-static {v1}, Lgq3;->r(Ln70;)Lgq3;

    .line 741
    .line 742
    .line 743
    move-result-object v1

    .line 744
    new-instance v2, Lw32;

    .line 745
    .line 746
    const/4 v3, 0x0

    .line 747
    invoke-direct {v2, v0, p2, v3}, Lw32;-><init>(Lgj2;Ljava/lang/String;I)V

    .line 748
    .line 749
    .line 750
    sget-object p2, Lmd2;->a:Lld2;

    .line 751
    .line 752
    invoke-static {v1, v2, p2}, Lpu1;->O(Ln70;Lyp3;Ljava/util/concurrent/Executor;)Lqp3;

    .line 753
    .line 754
    .line 755
    move-result-object v0

    .line 756
    new-instance v1, Lt32;

    .line 757
    .line 758
    invoke-direct {v1, p1}, Lt32;-><init>(Lag2;)V

    .line 759
    .line 760
    .line 761
    new-instance p1, Ljq3;

    .line 762
    .line 763
    const/4 v2, 0x0

    .line 764
    invoke-direct {p1, v0, v1, v2}, Ljq3;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 765
    .line 766
    .line 767
    invoke-interface {v0, p1, p2}, Ln70;->c(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 768
    .line 769
    .line 770
    :goto_f
    return-void

    .line 771
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
