.class public final Lw83;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lwm2;


# instance fields
.field public final f:Ljava/util/HashSet;

.field public final g:Landroid/content/Context;

.field public final h:Lid2;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lid2;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/HashSet;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lw83;->f:Ljava/util/HashSet;

    .line 10
    .line 11
    iput-object p1, p0, Lw83;->g:Landroid/content/Context;

    .line 12
    .line 13
    iput-object p2, p0, Lw83;->h:Lid2;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final a()Landroid/os/Bundle;
    .locals 14

    .line 1
    iget-object v0, p0, Lw83;->h:Lid2;

    .line 2
    .line 3
    iget-object v1, p0, Lw83;->g:Landroid/content/Context;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    new-instance v2, Ljava/util/HashSet;

    .line 9
    .line 10
    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    .line 11
    .line 12
    .line 13
    iget-object v3, v0, Lid2;->f:Ljava/lang/Object;

    .line 14
    .line 15
    monitor-enter v3

    .line 16
    :try_start_0
    iget-object v4, v0, Lid2;->j:Ljava/util/HashSet;

    .line 17
    .line 18
    invoke-virtual {v2, v4}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    .line 19
    .line 20
    .line 21
    invoke-virtual {v4}, Ljava/util/HashSet;->clear()V

    .line 22
    .line 23
    .line 24
    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_5

    .line 25
    new-instance v3, Landroid/os/Bundle;

    .line 26
    .line 27
    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 28
    .line 29
    .line 30
    iget-object v4, v0, Lid2;->i:Lhd2;

    .line 31
    .line 32
    iget-object v5, v0, Lid2;->h:Ll92;

    .line 33
    .line 34
    monitor-enter v5

    .line 35
    :try_start_1
    iget-object v6, v5, Ll92;->g:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v6, Ljava/lang/String;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_4

    .line 38
    .line 39
    monitor-exit v5

    .line 40
    iget-object v7, v4, Lhd2;->f:Ljava/lang/Object;

    .line 41
    .line 42
    monitor-enter v7

    .line 43
    :try_start_2
    new-instance v5, Landroid/os/Bundle;

    .line 44
    .line 45
    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    .line 46
    .line 47
    .line 48
    iget-object v8, v4, Lhd2;->h:Lra4;

    .line 49
    .line 50
    invoke-virtual {v8}, Lra4;->s()Z

    .line 51
    .line 52
    .line 53
    move-result v8

    .line 54
    if-nez v8, :cond_0

    .line 55
    .line 56
    const-string v8, "session_id"

    .line 57
    .line 58
    iget-object v9, v4, Lhd2;->g:Ljava/lang/String;

    .line 59
    .line 60
    invoke-virtual {v5, v8, v9}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :catchall_0
    move-exception v0

    .line 65
    goto/16 :goto_7

    .line 66
    .line 67
    :cond_0
    :goto_0
    const-string v8, "basets"

    .line 68
    .line 69
    iget-wide v9, v4, Lhd2;->b:J

    .line 70
    .line 71
    invoke-virtual {v5, v8, v9, v10}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 72
    .line 73
    .line 74
    const-string v8, "currts"

    .line 75
    .line 76
    iget-wide v9, v4, Lhd2;->a:J

    .line 77
    .line 78
    invoke-virtual {v5, v8, v9, v10}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 79
    .line 80
    .line 81
    const-string v8, "seq_num"

    .line 82
    .line 83
    invoke-virtual {v5, v8, v6}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    const-string v6, "preqs"

    .line 87
    .line 88
    iget v8, v4, Lhd2;->c:I

    .line 89
    .line 90
    invoke-virtual {v5, v6, v8}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 91
    .line 92
    .line 93
    const-string v6, "preqs_in_session"

    .line 94
    .line 95
    iget v8, v4, Lhd2;->d:I

    .line 96
    .line 97
    invoke-virtual {v5, v6, v8}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 98
    .line 99
    .line 100
    const-string v6, "time_in_session"

    .line 101
    .line 102
    iget-wide v8, v4, Lhd2;->e:J

    .line 103
    .line 104
    invoke-virtual {v5, v6, v8, v9}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 105
    .line 106
    .line 107
    const-string v6, "pclick"

    .line 108
    .line 109
    iget v8, v4, Lhd2;->i:I

    .line 110
    .line 111
    invoke-virtual {v5, v6, v8}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 112
    .line 113
    .line 114
    const-string v6, "pimp"

    .line 115
    .line 116
    iget v8, v4, Lhd2;->j:I

    .line 117
    .line 118
    invoke-virtual {v5, v6, v8}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 119
    .line 120
    .line 121
    const-string v6, "support_transparent_background"

    .line 122
    .line 123
    sget v8, Lw11;->b:I

    .line 124
    .line 125
    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 126
    .line 127
    .line 128
    move-result-object v8

    .line 129
    if-nez v8, :cond_1

    .line 130
    .line 131
    goto :goto_1

    .line 132
    :cond_1
    move-object v1, v8

    .line 133
    :goto_1
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 134
    .line 135
    .line 136
    move-result-object v8

    .line 137
    const-string v9, "Theme.Translucent"

    .line 138
    .line 139
    const-string v10, "style"

    .line 140
    .line 141
    const-string v11, "android"

    .line 142
    .line 143
    invoke-virtual {v8, v9, v10, v11}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    .line 144
    .line 145
    .line 146
    move-result v8

    .line 147
    const/4 v9, 0x0

    .line 148
    if-nez v8, :cond_2

    .line 149
    .line 150
    const-string v1, "Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad."

    .line 151
    .line 152
    invoke-static {v1}, Lgi2;->f0(Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    :goto_2
    move v1, v9

    .line 156
    goto :goto_3

    .line 157
    :cond_2
    new-instance v10, Landroid/content/ComponentName;

    .line 158
    .line 159
    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v11

    .line 163
    const-string v12, "com.google.android.gms.ads.AdActivity"

    .line 164
    .line 165
    invoke-direct {v10, v11, v12}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 166
    .line 167
    .line 168
    :try_start_3
    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 169
    .line 170
    .line 171
    move-result-object v1

    .line 172
    invoke-virtual {v1, v10, v9}, Landroid/content/pm/PackageManager;->getActivityInfo(Landroid/content/ComponentName;I)Landroid/content/pm/ActivityInfo;

    .line 173
    .line 174
    .line 175
    move-result-object v1

    .line 176
    iget v1, v1, Landroid/content/pm/ActivityInfo;->theme:I

    .line 177
    .line 178
    if-ne v8, v1, :cond_3

    .line 179
    .line 180
    const/4 v1, 0x1

    .line 181
    goto :goto_3

    .line 182
    :cond_3
    const-string v1, "Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad."

    .line 183
    .line 184
    invoke-static {v1}, Lgi2;->f0(Ljava/lang/String;)V
    :try_end_3
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 185
    .line 186
    .line 187
    goto :goto_2

    .line 188
    :catch_0
    :try_start_4
    const-string v1, "Fail to fetch AdActivity theme"

    .line 189
    .line 190
    invoke-static {v1}, Lgi2;->i0(Ljava/lang/String;)V

    .line 191
    .line 192
    .line 193
    const-string v1, "Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad."

    .line 194
    .line 195
    invoke-static {v1}, Lgi2;->f0(Ljava/lang/String;)V

    .line 196
    .line 197
    .line 198
    goto :goto_2

    .line 199
    :goto_3
    invoke-virtual {v5, v6, v1}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 200
    .line 201
    .line 202
    const-string v1, "consent_form_action_identifier"

    .line 203
    .line 204
    iget-object v6, v4, Lhd2;->f:Ljava/lang/Object;

    .line 205
    .line 206
    monitor-enter v6
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 207
    :try_start_5
    iget v4, v4, Lhd2;->k:I

    .line 208
    .line 209
    monitor-exit v6
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 210
    :try_start_6
    invoke-virtual {v5, v1, v4}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 211
    .line 212
    .line 213
    monitor-exit v7
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 214
    const-string v1, "app"

    .line 215
    .line 216
    invoke-virtual {v3, v1, v5}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 217
    .line 218
    .line 219
    new-instance v1, Landroid/os/Bundle;

    .line 220
    .line 221
    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 222
    .line 223
    .line 224
    iget-object v0, v0, Lid2;->k:Ljava/util/HashSet;

    .line 225
    .line 226
    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 227
    .line 228
    .line 229
    move-result-object v0

    .line 230
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 231
    .line 232
    .line 233
    move-result v4

    .line 234
    if-nez v4, :cond_6

    .line 235
    .line 236
    const-string v0, "slots"

    .line 237
    .line 238
    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 239
    .line 240
    .line 241
    new-instance v0, Ljava/util/ArrayList;

    .line 242
    .line 243
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 244
    .line 245
    .line 246
    invoke-virtual {v2}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 247
    .line 248
    .line 249
    move-result-object v1

    .line 250
    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 251
    .line 252
    .line 253
    move-result v4

    .line 254
    if-eqz v4, :cond_5

    .line 255
    .line 256
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 257
    .line 258
    .line 259
    move-result-object v4

    .line 260
    check-cast v4, Ldd2;

    .line 261
    .line 262
    iget-object v5, v4, Ldd2;->d:Ljava/lang/Object;

    .line 263
    .line 264
    monitor-enter v5

    .line 265
    :try_start_7
    new-instance v6, Landroid/os/Bundle;

    .line 266
    .line 267
    invoke-direct {v6}, Landroid/os/Bundle;-><init>()V

    .line 268
    .line 269
    .line 270
    const-string v7, "seq_num"

    .line 271
    .line 272
    iget-object v8, v4, Ldd2;->e:Ljava/lang/String;

    .line 273
    .line 274
    invoke-virtual {v6, v7, v8}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 275
    .line 276
    .line 277
    const-string v7, "slotid"

    .line 278
    .line 279
    iget-object v8, v4, Ldd2;->f:Ljava/lang/String;

    .line 280
    .line 281
    invoke-virtual {v6, v7, v8}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 282
    .line 283
    .line 284
    const-string v7, "ismediation"

    .line 285
    .line 286
    invoke-virtual {v6, v7, v9}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 287
    .line 288
    .line 289
    const-string v7, "treq"

    .line 290
    .line 291
    iget-wide v10, v4, Ldd2;->j:J

    .line 292
    .line 293
    invoke-virtual {v6, v7, v10, v11}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 294
    .line 295
    .line 296
    const-string v7, "tresponse"

    .line 297
    .line 298
    iget-wide v10, v4, Ldd2;->k:J

    .line 299
    .line 300
    invoke-virtual {v6, v7, v10, v11}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 301
    .line 302
    .line 303
    const-string v7, "timp"

    .line 304
    .line 305
    iget-wide v10, v4, Ldd2;->g:J

    .line 306
    .line 307
    invoke-virtual {v6, v7, v10, v11}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 308
    .line 309
    .line 310
    const-string v7, "tload"

    .line 311
    .line 312
    iget-wide v10, v4, Ldd2;->h:J

    .line 313
    .line 314
    invoke-virtual {v6, v7, v10, v11}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 315
    .line 316
    .line 317
    const-string v7, "pcc"

    .line 318
    .line 319
    iget-wide v10, v4, Ldd2;->i:J

    .line 320
    .line 321
    invoke-virtual {v6, v7, v10, v11}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 322
    .line 323
    .line 324
    const-string v7, "tfetch"

    .line 325
    .line 326
    const-wide/16 v10, -0x1

    .line 327
    .line 328
    invoke-virtual {v6, v7, v10, v11}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 329
    .line 330
    .line 331
    new-instance v7, Ljava/util/ArrayList;

    .line 332
    .line 333
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 334
    .line 335
    .line 336
    iget-object v4, v4, Ldd2;->c:Ljava/util/LinkedList;

    .line 337
    .line 338
    invoke-virtual {v4}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    .line 339
    .line 340
    .line 341
    move-result-object v4

    .line 342
    :goto_5
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 343
    .line 344
    .line 345
    move-result v8

    .line 346
    if-eqz v8, :cond_4

    .line 347
    .line 348
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 349
    .line 350
    .line 351
    move-result-object v8

    .line 352
    check-cast v8, Lcd2;

    .line 353
    .line 354
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 355
    .line 356
    .line 357
    new-instance v10, Landroid/os/Bundle;

    .line 358
    .line 359
    invoke-direct {v10}, Landroid/os/Bundle;-><init>()V

    .line 360
    .line 361
    .line 362
    const-string v11, "topen"

    .line 363
    .line 364
    iget-wide v12, v8, Lcd2;->a:J

    .line 365
    .line 366
    invoke-virtual {v10, v11, v12, v13}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 367
    .line 368
    .line 369
    const-string v11, "tclose"

    .line 370
    .line 371
    iget-wide v12, v8, Lcd2;->b:J

    .line 372
    .line 373
    invoke-virtual {v10, v11, v12, v13}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 374
    .line 375
    .line 376
    invoke-virtual {v7, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 377
    .line 378
    .line 379
    goto :goto_5

    .line 380
    :catchall_1
    move-exception v0

    .line 381
    goto :goto_6

    .line 382
    :cond_4
    const-string v4, "tclick"

    .line 383
    .line 384
    invoke-virtual {v6, v4, v7}, Landroid/os/Bundle;->putParcelableArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 385
    .line 386
    .line 387
    monitor-exit v5
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 388
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 389
    .line 390
    .line 391
    goto/16 :goto_4

    .line 392
    .line 393
    :goto_6
    :try_start_8
    monitor-exit v5
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    .line 394
    throw v0

    .line 395
    :cond_5
    const-string v1, "ads"

    .line 396
    .line 397
    invoke-virtual {v3, v1, v0}, Landroid/os/Bundle;->putParcelableArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 398
    .line 399
    .line 400
    monitor-enter p0

    .line 401
    :try_start_9
    iget-object v0, p0, Lw83;->f:Ljava/util/HashSet;

    .line 402
    .line 403
    invoke-virtual {v0}, Ljava/util/HashSet;->clear()V

    .line 404
    .line 405
    .line 406
    invoke-virtual {v0, v2}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    .line 407
    .line 408
    .line 409
    monitor-exit p0

    .line 410
    return-object v3

    .line 411
    :catchall_2
    move-exception v0

    .line 412
    :try_start_a
    monitor-exit p0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_2

    .line 413
    throw v0

    .line 414
    :cond_6
    invoke-static {v0}, Lex0;->e(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    .line 415
    .line 416
    .line 417
    move-result-object v0

    .line 418
    throw v0

    .line 419
    :catchall_3
    move-exception v0

    .line 420
    :try_start_b
    monitor-exit v6
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_3

    .line 421
    :try_start_c
    throw v0

    .line 422
    :goto_7
    monitor-exit v7
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_0

    .line 423
    throw v0

    .line 424
    :goto_8
    :try_start_d
    monitor-exit v5
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_4

    .line 425
    throw v0

    .line 426
    :catchall_4
    move-exception v0

    .line 427
    goto :goto_8

    .line 428
    :catchall_5
    move-exception v0

    .line 429
    :try_start_e
    monitor-exit v3
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_5

    .line 430
    throw v0
.end method

.method public final declared-synchronized d0(Lnx2;)V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget p1, p1, Lnx2;->f:I

    .line 3
    .line 4
    const/4 v0, 0x3

    .line 5
    if-eq p1, v0, :cond_0

    .line 6
    .line 7
    iget-object p1, p0, Lw83;->h:Lid2;

    .line 8
    .line 9
    iget-object v0, p0, Lw83;->f:Ljava/util/HashSet;

    .line 10
    .line 11
    iget-object v1, p1, Lid2;->f:Ljava/lang/Object;

    .line 12
    .line 13
    monitor-enter v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 14
    :try_start_1
    iget-object p1, p1, Lid2;->j:Ljava/util/HashSet;

    .line 15
    .line 16
    invoke-virtual {p1, v0}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    .line 17
    .line 18
    .line 19
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 20
    monitor-exit p0

    .line 21
    return-void

    .line 22
    :catchall_0
    move-exception p1

    .line 23
    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 24
    :try_start_3
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 25
    :catchall_1
    move-exception p1

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    monitor-exit p0

    .line 28
    return-void

    .line 29
    :goto_0
    :try_start_4
    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 30
    throw p1
.end method
