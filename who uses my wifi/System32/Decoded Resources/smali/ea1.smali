.class public final Lea1;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic f:I

.field public final synthetic g:Ljava/lang/Object;

.field public final synthetic h:Ljava/lang/Object;

.field public final synthetic i:Ljava/lang/Object;

.field public final synthetic j:Ljava/lang/Object;

.field public final synthetic k:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p6, p0, Lea1;->f:I

    iput-object p1, p0, Lea1;->k:Ljava/lang/Object;

    iput-object p2, p0, Lea1;->g:Ljava/lang/Object;

    iput-object p3, p0, Lea1;->h:Ljava/lang/Object;

    iput-object p4, p0, Lea1;->i:Ljava/lang/Object;

    iput-object p5, p0, Lea1;->j:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IZ)V
    .locals 0

    .line 2
    iput p6, p0, Lea1;->f:I

    iput-object p1, p0, Lea1;->g:Ljava/lang/Object;

    iput-object p2, p0, Lea1;->h:Ljava/lang/Object;

    iput-object p3, p0, Lea1;->i:Ljava/lang/Object;

    iput-object p4, p0, Lea1;->j:Ljava/lang/Object;

    iput-object p5, p0, Lea1;->k:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lmj3;Ljava/util/HashMap;Landroid/content/Context;Landroid/view/View;Ljava/lang/Object;I)V
    .locals 0

    .line 3
    iput p6, p0, Lea1;->f:I

    iput-object p1, p0, Lea1;->g:Ljava/lang/Object;

    iput-object p2, p0, Lea1;->h:Ljava/lang/Object;

    iput-object p3, p0, Lea1;->j:Ljava/lang/Object;

    iput-object p4, p0, Lea1;->i:Ljava/lang/Object;

    iput-object p5, p0, Lea1;->k:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 9

    .line 1
    iget v0, p0, Lea1;->f:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lea1;->g:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lgi1;

    .line 9
    .line 10
    iget-object v1, v0, Lgi1;->g:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Landroid/os/Handler;

    .line 13
    .line 14
    iget-object v2, p0, Lea1;->h:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v2, Li5;

    .line 17
    .line 18
    iget-object v3, p0, Lea1;->i:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v3, Lfr;

    .line 21
    .line 22
    iget-object v4, p0, Lea1;->j:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v4, Luh;

    .line 25
    .line 26
    iget-object v5, p0, Lea1;->k:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v5, Lth;

    .line 29
    .line 30
    :try_start_0
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    iget-object v6, v0, Lgi1;->f:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v6, Landroid/app/Application;

    .line 36
    .line 37
    invoke-static {v6}, Lgi2;->B(Landroid/content/Context;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    iget-object v6, v0, Lgi1;->k:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v6, Lwt2;

    .line 43
    .line 44
    invoke-virtual {v6, v2, v3}, Lwt2;->j(Li5;Lfr;)Lh2;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    invoke-virtual {v0, v2}, Lgi1;->d(Lh2;)Lvh2;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    iget-object v3, v0, Lgi1;->l:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v3, Ljr3;

    .line 55
    .line 56
    new-instance v6, Lts;

    .line 57
    .line 58
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 59
    .line 60
    .line 61
    const/4 v7, 0x0

    .line 62
    iput v7, v6, Lts;->a:I

    .line 63
    .line 64
    const/4 v7, 0x1

    .line 65
    iput v7, v6, Lts;->b:I

    .line 66
    .line 67
    iput-object v3, v6, Lts;->c:Ljava/lang/Object;

    .line 68
    .line 69
    iput-object v2, v6, Lts;->d:Ljava/lang/Object;

    .line 70
    .line 71
    invoke-virtual {v6}, Lts;->a()Lpi1;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    iget-object v3, v0, Lgi1;->i:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast v3, Lmo1;

    .line 78
    .line 79
    iget v6, v2, Lpi1;->f:I

    .line 80
    .line 81
    iget-object v7, v3, Lmo1;->b:Landroid/content/SharedPreferences;

    .line 82
    .line 83
    invoke-interface {v7}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 84
    .line 85
    .line 86
    move-result-object v7

    .line 87
    const-string v8, "consent_status"

    .line 88
    .line 89
    invoke-interface {v7, v8, v6}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 90
    .line 91
    .line 92
    move-result-object v6

    .line 93
    invoke-interface {v6}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 94
    .line 95
    .line 96
    iget v6, v2, Lpi1;->g:I

    .line 97
    .line 98
    iget-object v3, v3, Lmo1;->b:Landroid/content/SharedPreferences;

    .line 99
    .line 100
    invoke-interface {v3}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 101
    .line 102
    .line 103
    move-result-object v3

    .line 104
    const-string v7, "privacy_options_requirement_status"

    .line 105
    .line 106
    const/4 v8, 0x1

    .line 107
    if-eq v6, v8, :cond_2

    .line 108
    .line 109
    const/4 v8, 0x2

    .line 110
    if-eq v6, v8, :cond_1

    .line 111
    .line 112
    const/4 v8, 0x3

    .line 113
    if-ne v6, v8, :cond_0

    .line 114
    .line 115
    const-string v6, "REQUIRED"

    .line 116
    .line 117
    goto :goto_0

    .line 118
    :cond_0
    const/4 v0, 0x0

    .line 119
    throw v0

    .line 120
    :cond_1
    const-string v6, "NOT_REQUIRED"

    .line 121
    .line 122
    goto :goto_0

    .line 123
    :cond_2
    const-string v6, "UNKNOWN"

    .line 124
    .line 125
    :goto_0
    invoke-interface {v3, v7, v6}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 126
    .line 127
    .line 128
    move-result-object v3

    .line 129
    invoke-interface {v3}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 130
    .line 131
    .line 132
    iget-object v3, v0, Lgi1;->j:Ljava/lang/Object;

    .line 133
    .line 134
    check-cast v3, Lz42;

    .line 135
    .line 136
    iget-object v6, v2, Lpi1;->h:Ljava/lang/Object;

    .line 137
    .line 138
    check-cast v6, Lz52;

    .line 139
    .line 140
    iget-object v3, v3, Lz42;->c:Ljava/util/concurrent/atomic/AtomicReference;

    .line 141
    .line 142
    invoke-virtual {v3, v6}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 143
    .line 144
    .line 145
    iget-object v3, v0, Lgi1;->m:Ljava/lang/Object;

    .line 146
    .line 147
    check-cast v3, Llx2;

    .line 148
    .line 149
    iget-object v3, v3, Llx2;->a:Ljava/util/concurrent/Executor;

    .line 150
    .line 151
    new-instance v6, Lgi;

    .line 152
    .line 153
    const/16 v7, 0x1d

    .line 154
    .line 155
    invoke-direct {v6, v0, v4, v2, v7}, Lgi;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 156
    .line 157
    .line 158
    invoke-interface {v3, v6}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Lah3; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 159
    .line 160
    .line 161
    goto :goto_3

    .line 162
    :catch_0
    move-exception v0

    .line 163
    goto :goto_1

    .line 164
    :catch_1
    move-exception v0

    .line 165
    goto :goto_2

    .line 166
    :goto_1
    new-instance v2, Lah3;

    .line 167
    .line 168
    invoke-static {v0}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object v0

    .line 172
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    const-string v3, "Caught exception when trying to request consent info update: "

    .line 177
    .line 178
    invoke-virtual {v3, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    const/4 v3, 0x1

    .line 183
    invoke-direct {v2, v0, v3}, Lah3;-><init>(Ljava/lang/String;I)V

    .line 184
    .line 185
    .line 186
    new-instance v0, Lwe4;

    .line 187
    .line 188
    invoke-direct {v0, v5, v2, v3}, Lwe4;-><init>(Lth;Lah3;I)V

    .line 189
    .line 190
    .line 191
    invoke-virtual {v1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 192
    .line 193
    .line 194
    goto :goto_3

    .line 195
    :goto_2
    new-instance v2, Lwe4;

    .line 196
    .line 197
    const/4 v3, 0x0

    .line 198
    invoke-direct {v2, v5, v0, v3}, Lwe4;-><init>(Lth;Lah3;I)V

    .line 199
    .line 200
    .line 201
    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 202
    .line 203
    .line 204
    :goto_3
    return-void

    .line 205
    :pswitch_0
    iget-object v0, p0, Lea1;->k:Ljava/lang/Object;

    .line 206
    .line 207
    check-cast v0, Ljava/lang/String;

    .line 208
    .line 209
    iget-object v1, p0, Lea1;->g:Ljava/lang/Object;

    .line 210
    .line 211
    check-cast v1, Lmj3;

    .line 212
    .line 213
    iget-object v2, p0, Lea1;->h:Ljava/lang/Object;

    .line 214
    .line 215
    check-cast v2, Ljava/util/HashMap;

    .line 216
    .line 217
    iget-object v3, p0, Lea1;->j:Ljava/lang/Object;

    .line 218
    .line 219
    check-cast v3, Landroid/content/Context;

    .line 220
    .line 221
    iget-object v4, p0, Lea1;->i:Ljava/lang/Object;

    .line 222
    .line 223
    check-cast v4, Landroid/view/View;

    .line 224
    .line 225
    iget-object v5, v1, Lmj3;->d:Lxj3;

    .line 226
    .line 227
    invoke-virtual {v5}, Lxj3;->c()Ljava/util/HashMap;

    .line 228
    .line 229
    .line 230
    move-result-object v5

    .line 231
    invoke-virtual {v2, v5}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V

    .line 232
    .line 233
    .line 234
    invoke-virtual {v1, v2}, Lmj3;->g(Ljava/util/HashMap;)V

    .line 235
    .line 236
    .line 237
    const-string v1, "f"

    .line 238
    .line 239
    const-string v5, "c"

    .line 240
    .line 241
    invoke-virtual {v2, v1, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 242
    .line 243
    .line 244
    const-string v1, "ctx"

    .line 245
    .line 246
    invoke-virtual {v2, v1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    const-string v1, "view"

    .line 250
    .line 251
    invoke-virtual {v2, v1, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 252
    .line 253
    .line 254
    const-string v1, "act"

    .line 255
    .line 256
    const/4 v3, 0x0

    .line 257
    invoke-virtual {v2, v1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 258
    .line 259
    .line 260
    const-string v1, "bds"

    .line 261
    .line 262
    invoke-virtual {v2, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 263
    .line 264
    .line 265
    return-void

    .line 266
    :pswitch_1
    iget-object v0, p0, Lea1;->g:Ljava/lang/Object;

    .line 267
    .line 268
    check-cast v0, Lmj3;

    .line 269
    .line 270
    iget-object v1, p0, Lea1;->h:Ljava/lang/Object;

    .line 271
    .line 272
    check-cast v1, Ljava/util/HashMap;

    .line 273
    .line 274
    iget-object v2, p0, Lea1;->j:Ljava/lang/Object;

    .line 275
    .line 276
    check-cast v2, Landroid/content/Context;

    .line 277
    .line 278
    iget-object v3, p0, Lea1;->i:Ljava/lang/Object;

    .line 279
    .line 280
    check-cast v3, Landroid/view/View;

    .line 281
    .line 282
    iget-object v4, p0, Lea1;->k:Ljava/lang/Object;

    .line 283
    .line 284
    check-cast v4, Landroid/app/Activity;

    .line 285
    .line 286
    iget-object v5, v0, Lmj3;->d:Lxj3;

    .line 287
    .line 288
    invoke-virtual {v5, v2, v3}, Lxj3;->b(Landroid/content/Context;Landroid/view/View;)Ljava/util/HashMap;

    .line 289
    .line 290
    .line 291
    move-result-object v5

    .line 292
    invoke-virtual {v1, v5}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V

    .line 293
    .line 294
    .line 295
    invoke-virtual {v0, v1}, Lmj3;->g(Ljava/util/HashMap;)V

    .line 296
    .line 297
    .line 298
    const-string v0, "f"

    .line 299
    .line 300
    const-string v5, "v"

    .line 301
    .line 302
    invoke-virtual {v1, v0, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 303
    .line 304
    .line 305
    const-string v0, "ctx"

    .line 306
    .line 307
    invoke-virtual {v1, v0, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 308
    .line 309
    .line 310
    const-string v0, "view"

    .line 311
    .line 312
    invoke-virtual {v1, v0, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 313
    .line 314
    .line 315
    const-string v0, "act"

    .line 316
    .line 317
    invoke-virtual {v1, v0, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 318
    .line 319
    .line 320
    const-string v0, "bds"

    .line 321
    .line 322
    const/4 v2, 0x0

    .line 323
    invoke-virtual {v1, v0, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 324
    .line 325
    .line 326
    return-void

    .line 327
    :pswitch_2
    iget-object v0, p0, Lea1;->g:Ljava/lang/Object;

    .line 328
    .line 329
    check-cast v0, Lmw2;

    .line 330
    .line 331
    iget-object v1, p0, Lea1;->h:Ljava/lang/Object;

    .line 332
    .line 333
    check-cast v1, Ljava/lang/String;

    .line 334
    .line 335
    iget-object v2, p0, Lea1;->i:Ljava/lang/Object;

    .line 336
    .line 337
    check-cast v2, Ljw2;

    .line 338
    .line 339
    iget-object v3, p0, Lea1;->j:Ljava/lang/Object;

    .line 340
    .line 341
    check-cast v3, Lu83;

    .line 342
    .line 343
    iget-object v4, p0, Lea1;->k:Ljava/lang/Object;

    .line 344
    .line 345
    check-cast v4, Ljava/util/ArrayList;

    .line 346
    .line 347
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 348
    .line 349
    .line 350
    const-string v5, " does not implement the initialize() method."

    .line 351
    .line 352
    const-string v6, "Failed to initialize adapter. "

    .line 353
    .line 354
    :try_start_1
    const-string v7, "com.google.ads.mediation.admob.AdMobAdapter"

    .line 355
    .line 356
    invoke-static {v1, v7}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 357
    .line 358
    .line 359
    move-result v7

    .line 360
    if-eqz v7, :cond_3

    .line 361
    .line 362
    invoke-virtual {v2}, Ljw2;->b()V

    .line 363
    .line 364
    .line 365
    goto :goto_6

    .line 366
    :catch_2
    move-exception v0

    .line 367
    goto :goto_5

    .line 368
    :cond_3
    iget-object v7, v0, Lmw2;->g:Ljava/lang/ref/WeakReference;

    .line 369
    .line 370
    invoke-virtual {v7}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 371
    .line 372
    .line 373
    move-result-object v7

    .line 374
    check-cast v7, Landroid/content/Context;

    .line 375
    .line 376
    if-eqz v7, :cond_4

    .line 377
    .line 378
    goto :goto_4

    .line 379
    :cond_4
    iget-object v7, v0, Lmw2;->f:Landroid/content/Context;
    :try_end_1
    .catch Ln83; {:try_start_1 .. :try_end_1} :catch_3
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_2

    .line 380
    .line 381
    :goto_4
    :try_start_2
    iget-object v0, v3, Lu83;->a:Lw62;

    .line 382
    .line 383
    new-instance v3, Loi0;

    .line 384
    .line 385
    invoke-direct {v3, v7}, Loi0;-><init>(Ljava/lang/Object;)V

    .line 386
    .line 387
    .line 388
    invoke-interface {v0, v3, v2, v4}, Lw62;->J0(Lu10;Lb52;Ljava/util/ArrayList;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 389
    .line 390
    .line 391
    goto :goto_6

    .line 392
    :catchall_0
    move-exception v0

    .line 393
    :try_start_3
    new-instance v3, Ln83;

    .line 394
    .line 395
    invoke-direct {v3, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    .line 396
    .line 397
    .line 398
    throw v3
    :try_end_3
    .catch Ln83; {:try_start_3 .. :try_end_3} :catch_3
    .catch Landroid/os/RemoteException; {:try_start_3 .. :try_end_3} :catch_2

    .line 399
    :goto_5
    new-instance v1, Lrg;

    .line 400
    .line 401
    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 402
    .line 403
    .line 404
    throw v1

    .line 405
    :catch_3
    :try_start_4
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 406
    .line 407
    .line 408
    move-result-object v0

    .line 409
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 410
    .line 411
    .line 412
    move-result v0

    .line 413
    add-int/lit8 v0, v0, 0x4a

    .line 414
    .line 415
    new-instance v3, Ljava/lang/StringBuilder;

    .line 416
    .line 417
    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 418
    .line 419
    .line 420
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 421
    .line 422
    .line 423
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 424
    .line 425
    .line 426
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 427
    .line 428
    .line 429
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 430
    .line 431
    .line 432
    move-result-object v0

    .line 433
    invoke-virtual {v2, v0}, Ljw2;->B3(Ljava/lang/String;)V
    :try_end_4
    .catch Landroid/os/RemoteException; {:try_start_4 .. :try_end_4} :catch_4

    .line 434
    .line 435
    .line 436
    goto :goto_6

    .line 437
    :catch_4
    move-exception v0

    .line 438
    const-string v1, ""

    .line 439
    .line 440
    invoke-static {v1, v0}, Lgi2;->c0(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 441
    .line 442
    .line 443
    :goto_6
    return-void

    .line 444
    :pswitch_3
    sget-object v0, Lmz1;->db:Liz1;

    .line 445
    .line 446
    sget-object v1, Ltw1;->e:Ltw1;

    .line 447
    .line 448
    iget-object v1, v1, Ltw1;->c:Lkz1;

    .line 449
    .line 450
    invoke-virtual {v1, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 451
    .line 452
    .line 453
    move-result-object v0

    .line 454
    check-cast v0, Ljava/lang/Boolean;

    .line 455
    .line 456
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 457
    .line 458
    .line 459
    move-result v0

    .line 460
    iget-object v1, p0, Lea1;->h:Ljava/lang/Object;

    .line 461
    .line 462
    check-cast v1, Ljava/lang/Throwable;

    .line 463
    .line 464
    iget-object v2, p0, Lea1;->g:Ljava/lang/Object;

    .line 465
    .line 466
    check-cast v2, Lmc2;

    .line 467
    .line 468
    iget-object v2, v2, Lmc2;->j:Ljava/lang/Object;

    .line 469
    .line 470
    check-cast v2, Lgj2;

    .line 471
    .line 472
    if-eqz v0, :cond_5

    .line 473
    .line 474
    iget-object v0, v2, Lgj2;->a:Landroid/content/Context;

    .line 475
    .line 476
    invoke-static {v0}, Lr92;->c(Landroid/content/Context;)Ls92;

    .line 477
    .line 478
    .line 479
    move-result-object v0

    .line 480
    const-string v2, "AttributionReporting.registerSourceAndPingClickUrl"

    .line 481
    .line 482
    invoke-interface {v0, v2, v1}, Ls92;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 483
    .line 484
    .line 485
    goto :goto_7

    .line 486
    :cond_5
    iget-object v0, v2, Lgj2;->a:Landroid/content/Context;

    .line 487
    .line 488
    invoke-static {v0}, Lr92;->a(Landroid/content/Context;)Ls92;

    .line 489
    .line 490
    .line 491
    move-result-object v0

    .line 492
    const-string v2, "AttributionReportingSampled.registerSourceAndPingClickUrl"

    .line 493
    .line 494
    invoke-interface {v0, v2, v1}, Ls92;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 495
    .line 496
    .line 497
    :goto_7
    iget-object v0, p0, Lea1;->k:Ljava/lang/Object;

    .line 498
    .line 499
    check-cast v0, Lx34;

    .line 500
    .line 501
    iget-object v1, p0, Lea1;->j:Ljava/lang/Object;

    .line 502
    .line 503
    check-cast v1, Ljava/lang/String;

    .line 504
    .line 505
    iget-object v2, p0, Lea1;->i:Ljava/lang/Object;

    .line 506
    .line 507
    check-cast v2, Leb3;

    .line 508
    .line 509
    const/4 v3, 0x0

    .line 510
    invoke-virtual {v2, v1, v0, v3, v3}, Leb3;->b(Ljava/lang/String;Lx34;Lda3;Lao2;)V

    .line 511
    .line 512
    .line 513
    return-void

    .line 514
    :pswitch_4
    new-instance v0, Ljava/util/HashMap;

    .line 515
    .line 516
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 517
    .line 518
    .line 519
    const-string v1, "event"

    .line 520
    .line 521
    const-string v2, "precacheCanceled"

    .line 522
    .line 523
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 524
    .line 525
    .line 526
    iget-object v1, p0, Lea1;->g:Ljava/lang/Object;

    .line 527
    .line 528
    check-cast v1, Ljava/lang/String;

    .line 529
    .line 530
    const-string v2, "src"

    .line 531
    .line 532
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 533
    .line 534
    .line 535
    iget-object v1, p0, Lea1;->h:Ljava/lang/Object;

    .line 536
    .line 537
    check-cast v1, Ljava/lang/String;

    .line 538
    .line 539
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 540
    .line 541
    .line 542
    move-result v2

    .line 543
    if-nez v2, :cond_6

    .line 544
    .line 545
    const-string v2, "cachedSrc"

    .line 546
    .line 547
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 548
    .line 549
    .line 550
    :cond_6
    iget-object v1, p0, Lea1;->i:Ljava/lang/Object;

    .line 551
    .line 552
    check-cast v1, Ljava/lang/String;

    .line 553
    .line 554
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 555
    .line 556
    .line 557
    move-result v2

    .line 558
    const-string v3, "internal"

    .line 559
    .line 560
    sparse-switch v2, :sswitch_data_0

    .line 561
    .line 562
    .line 563
    goto :goto_c

    .line 564
    :sswitch_0
    const-string v2, "noCacheDir"

    .line 565
    .line 566
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 567
    .line 568
    .line 569
    move-result v2

    .line 570
    if-eqz v2, :cond_7

    .line 571
    .line 572
    goto :goto_8

    .line 573
    :sswitch_1
    const-string v2, "expireFailed"

    .line 574
    .line 575
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 576
    .line 577
    .line 578
    move-result v2

    .line 579
    if-eqz v2, :cond_7

    .line 580
    .line 581
    :goto_8
    const-string v3, "io"

    .line 582
    .line 583
    goto :goto_c

    .line 584
    :sswitch_2
    const-string v2, "error"

    .line 585
    .line 586
    :goto_9
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 587
    .line 588
    .line 589
    goto :goto_c

    .line 590
    :sswitch_3
    const-string v2, "noop"

    .line 591
    .line 592
    goto :goto_9

    .line 593
    :sswitch_4
    const-string v2, "externalAbort"

    .line 594
    .line 595
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 596
    .line 597
    .line 598
    move-result v2

    .line 599
    if-eqz v2, :cond_7

    .line 600
    .line 601
    goto :goto_a

    .line 602
    :sswitch_5
    const-string v2, "sizeExceeded"

    .line 603
    .line 604
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 605
    .line 606
    .line 607
    move-result v2

    .line 608
    if-eqz v2, :cond_7

    .line 609
    .line 610
    :goto_a
    const-string v3, "policy"

    .line 611
    .line 612
    goto :goto_c

    .line 613
    :sswitch_6
    const-string v2, "playerFailed"

    .line 614
    .line 615
    goto :goto_9

    .line 616
    :sswitch_7
    const-string v2, "contentLengthMissing"

    .line 617
    .line 618
    goto :goto_9

    .line 619
    :sswitch_8
    const-string v2, "downloadTimeout"

    .line 620
    .line 621
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 622
    .line 623
    .line 624
    move-result v2

    .line 625
    if-eqz v2, :cond_7

    .line 626
    .line 627
    goto :goto_b

    .line 628
    :sswitch_9
    const-string v2, "inProgress"

    .line 629
    .line 630
    goto :goto_9

    .line 631
    :sswitch_a
    const-string v2, "badUrl"

    .line 632
    .line 633
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 634
    .line 635
    .line 636
    move-result v2

    .line 637
    if-eqz v2, :cond_7

    .line 638
    .line 639
    :goto_b
    const-string v3, "network"

    .line 640
    .line 641
    goto :goto_c

    .line 642
    :sswitch_b
    const-string v2, "interrupted"

    .line 643
    .line 644
    goto :goto_9

    .line 645
    :cond_7
    :goto_c
    const-string v2, "type"

    .line 646
    .line 647
    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 648
    .line 649
    .line 650
    const-string v2, "reason"

    .line 651
    .line 652
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 653
    .line 654
    .line 655
    iget-object v1, p0, Lea1;->j:Ljava/lang/Object;

    .line 656
    .line 657
    check-cast v1, Ljava/lang/String;

    .line 658
    .line 659
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 660
    .line 661
    .line 662
    move-result v2

    .line 663
    if-nez v2, :cond_8

    .line 664
    .line 665
    const-string v2, "message"

    .line 666
    .line 667
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 668
    .line 669
    .line 670
    :cond_8
    iget-object v1, p0, Lea1;->k:Ljava/lang/Object;

    .line 671
    .line 672
    check-cast v1, Lff2;

    .line 673
    .line 674
    invoke-virtual {v1, v0}, Lff2;->n(Ljava/util/HashMap;)V

    .line 675
    .line 676
    .line 677
    return-void

    .line 678
    :pswitch_5
    :try_start_5
    iget-object v0, p0, Lea1;->g:Ljava/lang/Object;

    .line 679
    .line 680
    check-cast v0, Lou0;

    .line 681
    .line 682
    iget-object v0, v0, Ly;->f:Ljava/lang/Object;

    .line 683
    .line 684
    instance-of v0, v0, Lq;

    .line 685
    .line 686
    if-nez v0, :cond_a

    .line 687
    .line 688
    iget-object v0, p0, Lea1;->h:Ljava/lang/Object;

    .line 689
    .line 690
    check-cast v0, Ljava/util/UUID;

    .line 691
    .line 692
    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 693
    .line 694
    .line 695
    move-result-object v0

    .line 696
    iget-object v1, p0, Lea1;->k:Ljava/lang/Object;

    .line 697
    .line 698
    check-cast v1, Lfa1;

    .line 699
    .line 700
    iget-object v1, v1, Lfa1;->c:Lh2;

    .line 701
    .line 702
    invoke-virtual {v1, v0}, Lh2;->e(Ljava/lang/String;)I

    .line 703
    .line 704
    .line 705
    move-result v1

    .line 706
    if-eqz v1, :cond_9

    .line 707
    .line 708
    invoke-static {v1}, Lga1;->a(I)Z

    .line 709
    .line 710
    .line 711
    move-result v1

    .line 712
    if-nez v1, :cond_9

    .line 713
    .line 714
    iget-object v1, p0, Lea1;->k:Ljava/lang/Object;

    .line 715
    .line 716
    check-cast v1, Lfa1;

    .line 717
    .line 718
    iget-object v1, v1, Lfa1;->b:Law;

    .line 719
    .line 720
    iget-object v2, p0, Lea1;->i:Ljava/lang/Object;

    .line 721
    .line 722
    check-cast v2, Lyv;

    .line 723
    .line 724
    check-cast v1, Lom0;

    .line 725
    .line 726
    invoke-virtual {v1, v0, v2}, Lom0;->f(Ljava/lang/String;Lyv;)V

    .line 727
    .line 728
    .line 729
    iget-object v1, p0, Lea1;->j:Ljava/lang/Object;

    .line 730
    .line 731
    check-cast v1, Landroid/content/Context;

    .line 732
    .line 733
    iget-object v2, p0, Lea1;->i:Ljava/lang/Object;

    .line 734
    .line 735
    check-cast v2, Lyv;

    .line 736
    .line 737
    invoke-static {v1, v0, v2}, Lrz0;->b(Landroid/content/Context;Ljava/lang/String;Lyv;)Landroid/content/Intent;

    .line 738
    .line 739
    .line 740
    move-result-object v0

    .line 741
    iget-object v1, p0, Lea1;->j:Ljava/lang/Object;

    .line 742
    .line 743
    check-cast v1, Landroid/content/Context;

    .line 744
    .line 745
    invoke-virtual {v1, v0}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 746
    .line 747
    .line 748
    goto :goto_d

    .line 749
    :catchall_1
    move-exception v0

    .line 750
    goto :goto_e

    .line 751
    :cond_9
    const-string v0, "Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result."

    .line 752
    .line 753
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 754
    .line 755
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 756
    .line 757
    .line 758
    throw v1

    .line 759
    :cond_a
    :goto_d
    iget-object v0, p0, Lea1;->g:Ljava/lang/Object;

    .line 760
    .line 761
    check-cast v0, Lou0;

    .line 762
    .line 763
    const/4 v1, 0x0

    .line 764
    invoke-virtual {v0, v1}, Lou0;->i(Ljava/lang/Object;)Z
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 765
    .line 766
    .line 767
    goto :goto_f

    .line 768
    :goto_e
    iget-object v1, p0, Lea1;->g:Ljava/lang/Object;

    .line 769
    .line 770
    check-cast v1, Lou0;

    .line 771
    .line 772
    invoke-virtual {v1, v0}, Lou0;->j(Ljava/lang/Throwable;)Z

    .line 773
    .line 774
    .line 775
    :goto_f
    return-void

    .line 776
    nop

    .line 777
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    :sswitch_data_0
    .sparse-switch
        -0x7416d1be -> :sswitch_b
        -0x533f68d6 -> :sswitch_a
        -0x5049c18e -> :sswitch_9
        -0x36c40c47 -> :sswitch_8
        -0x274d4859 -> :sswitch_7
        -0x26475182 -> :sswitch_6
        -0x151a598c -> :sswitch_5
        -0x1e989db -> :sswitch_4
        0x33af62 -> :sswitch_3
        0x5c4d208 -> :sswitch_2
        0x2293ea3c -> :sswitch_1
        0x2b3e368c -> :sswitch_0
    .end sparse-switch
.end method
