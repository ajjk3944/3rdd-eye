.class public final Lxv;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field public static final i:Ljava/lang/String;

.field public static final j:J


# instance fields
.field public final f:Landroid/content/Context;

.field public final g:Lha1;

.field public h:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const-string v0, "ForceStopRunnable"

    .line 2
    .line 3
    invoke-static {v0}, Lh80;->f(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lxv;->i:Ljava/lang/String;

    .line 8
    .line 9
    sget-object v0, Ljava/util/concurrent/TimeUnit;->DAYS:Ljava/util/concurrent/TimeUnit;

    .line 10
    .line 11
    const-wide/16 v1, 0xe42

    .line 12
    .line 13
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    .line 14
    .line 15
    .line 16
    move-result-wide v0

    .line 17
    sput-wide v0, Lxv;->j:J

    .line 18
    .line 19
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lha1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iput-object p1, p0, Lxv;->f:Landroid/content/Context;

    .line 9
    .line 10
    iput-object p2, p0, Lxv;->g:Lha1;

    .line 11
    .line 12
    const/4 p1, 0x0

    .line 13
    iput p1, p0, Lxv;->h:I

    .line 14
    .line 15
    return-void
.end method

.method public static b(Landroid/content/Context;)V
    .locals 5

    .line 1
    const-string v0, "alarm"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroid/app/AlarmManager;

    .line 8
    .line 9
    invoke-static {}, Lgc;->a()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    const/high16 v1, 0xa000000

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/high16 v1, 0x8000000

    .line 19
    .line 20
    :goto_0
    new-instance v2, Landroid/content/Intent;

    .line 21
    .line 22
    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 23
    .line 24
    .line 25
    new-instance v3, Landroid/content/ComponentName;

    .line 26
    .line 27
    const-class v4, Landroidx/work/impl/utils/ForceStopRunnable$BroadcastReceiver;

    .line 28
    .line 29
    invoke-direct {v3, p0, v4}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v2, v3}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 33
    .line 34
    .line 35
    const-string v3, "ACTION_FORCE_STOP_RESCHEDULE"

    .line 36
    .line 37
    invoke-virtual {v2, v3}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 38
    .line 39
    .line 40
    const/4 v3, -0x1

    .line 41
    invoke-static {p0, v3, v2, v1}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 46
    .line 47
    .line 48
    move-result-wide v1

    .line 49
    sget-wide v3, Lxv;->j:J

    .line 50
    .line 51
    add-long/2addr v1, v3

    .line 52
    if-eqz v0, :cond_1

    .line 53
    .line 54
    const/4 v3, 0x0

    .line 55
    invoke-virtual {v0, v3, v1, v2, p0}, Landroid/app/AlarmManager;->setExact(IJLandroid/app/PendingIntent;)V

    .line 56
    .line 57
    .line 58
    :cond_1
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    sget-object v0, Lvz0;->j:Ljava/lang/String;

    .line 4
    .line 5
    const-string v0, "jobscheduler"

    .line 6
    .line 7
    iget-object v2, v1, Lxv;->f:Landroid/content/Context;

    .line 8
    .line 9
    invoke-virtual {v2, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Landroid/app/job/JobScheduler;

    .line 14
    .line 15
    invoke-static {v2, v0}, Lvz0;->c(Landroid/content/Context;Landroid/app/job/JobScheduler;)Ljava/util/ArrayList;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    iget-object v4, v1, Lxv;->g:Lha1;

    .line 20
    .line 21
    iget-object v5, v4, Lha1;->r:Landroidx/work/impl/WorkDatabase;

    .line 22
    .line 23
    invoke-virtual {v5}, Landroidx/work/impl/WorkDatabase;->k()Lt83;

    .line 24
    .line 25
    .line 26
    move-result-object v5

    .line 27
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    const-string v6, "SELECT DISTINCT work_spec_id FROM SystemIdInfo"

    .line 31
    .line 32
    const/4 v7, 0x0

    .line 33
    invoke-static {v6, v7}, Lrq0;->f(Ljava/lang/String;I)Lrq0;

    .line 34
    .line 35
    .line 36
    move-result-object v6

    .line 37
    iget-object v5, v5, Lt83;->g:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v5, Landroidx/work/impl/WorkDatabase_Impl;

    .line 40
    .line 41
    invoke-virtual {v5}, Lpq0;->b()V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v5, v6}, Lpq0;->g(Llz0;)Landroid/database/Cursor;

    .line 45
    .line 46
    .line 47
    move-result-object v5

    .line 48
    :try_start_0
    new-instance v8, Ljava/util/ArrayList;

    .line 49
    .line 50
    invoke-interface {v5}, Landroid/database/Cursor;->getCount()I

    .line 51
    .line 52
    .line 53
    move-result v9

    .line 54
    invoke-direct {v8, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 55
    .line 56
    .line 57
    :goto_0
    invoke-interface {v5}, Landroid/database/Cursor;->moveToNext()Z

    .line 58
    .line 59
    .line 60
    move-result v9

    .line 61
    if-eqz v9, :cond_0

    .line 62
    .line 63
    invoke-interface {v5, v7}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v9

    .line 67
    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 68
    .line 69
    .line 70
    goto :goto_0

    .line 71
    :catchall_0
    move-exception v0

    .line 72
    goto/16 :goto_12

    .line 73
    .line 74
    :cond_0
    invoke-interface {v5}, Landroid/database/Cursor;->close()V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v6}, Lrq0;->k()V

    .line 78
    .line 79
    .line 80
    if-eqz v3, :cond_1

    .line 81
    .line 82
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 83
    .line 84
    .line 85
    move-result v5

    .line 86
    goto :goto_1

    .line 87
    :cond_1
    move v5, v7

    .line 88
    :goto_1
    new-instance v6, Ljava/util/HashSet;

    .line 89
    .line 90
    invoke-direct {v6, v5}, Ljava/util/HashSet;-><init>(I)V

    .line 91
    .line 92
    .line 93
    if-eqz v3, :cond_4

    .line 94
    .line 95
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 96
    .line 97
    .line 98
    move-result v5

    .line 99
    if-nez v5, :cond_4

    .line 100
    .line 101
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 102
    .line 103
    .line 104
    move-result v5

    .line 105
    move v9, v7

    .line 106
    :goto_2
    if-ge v9, v5, :cond_4

    .line 107
    .line 108
    invoke-virtual {v3, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v10

    .line 112
    add-int/lit8 v9, v9, 0x1

    .line 113
    .line 114
    check-cast v10, Landroid/app/job/JobInfo;

    .line 115
    .line 116
    const-string v11, "EXTRA_WORK_SPEC_ID"

    .line 117
    .line 118
    invoke-virtual {v10}, Landroid/app/job/JobInfo;->getExtras()Landroid/os/PersistableBundle;

    .line 119
    .line 120
    .line 121
    move-result-object v12

    .line 122
    if-eqz v12, :cond_2

    .line 123
    .line 124
    :try_start_1
    invoke-virtual {v12, v11}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 125
    .line 126
    .line 127
    move-result v13

    .line 128
    if-eqz v13, :cond_2

    .line 129
    .line 130
    invoke-virtual {v12, v11}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v11
    :try_end_1
    .catch Ljava/lang/NullPointerException; {:try_start_1 .. :try_end_1} :catch_0

    .line 134
    goto :goto_3

    .line 135
    :catch_0
    :cond_2
    const/4 v11, 0x0

    .line 136
    :goto_3
    invoke-static {v11}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 137
    .line 138
    .line 139
    move-result v12

    .line 140
    if-nez v12, :cond_3

    .line 141
    .line 142
    invoke-virtual {v6, v11}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    goto :goto_2

    .line 146
    :cond_3
    invoke-virtual {v10}, Landroid/app/job/JobInfo;->getId()I

    .line 147
    .line 148
    .line 149
    move-result v10

    .line 150
    invoke-static {v0, v10}, Lvz0;->a(Landroid/app/job/JobScheduler;I)V

    .line 151
    .line 152
    .line 153
    goto :goto_2

    .line 154
    :cond_4
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 155
    .line 156
    .line 157
    move-result v0

    .line 158
    move v3, v7

    .line 159
    :cond_5
    const/4 v5, 0x1

    .line 160
    if-ge v3, v0, :cond_6

    .line 161
    .line 162
    invoke-virtual {v8, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v9

    .line 166
    add-int/lit8 v3, v3, 0x1

    .line 167
    .line 168
    check-cast v9, Ljava/lang/String;

    .line 169
    .line 170
    invoke-virtual {v6, v9}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 171
    .line 172
    .line 173
    move-result v9

    .line 174
    if-nez v9, :cond_5

    .line 175
    .line 176
    invoke-static {}, Lh80;->d()Lh80;

    .line 177
    .line 178
    .line 179
    move-result-object v0

    .line 180
    sget-object v3, Lvz0;->j:Ljava/lang/String;

    .line 181
    .line 182
    new-array v3, v7, [Ljava/lang/Throwable;

    .line 183
    .line 184
    invoke-virtual {v0, v3}, Lh80;->a([Ljava/lang/Throwable;)V

    .line 185
    .line 186
    .line 187
    move v0, v5

    .line 188
    goto :goto_4

    .line 189
    :cond_6
    move v0, v7

    .line 190
    :goto_4
    const-wide/16 v9, -0x1

    .line 191
    .line 192
    if-eqz v0, :cond_8

    .line 193
    .line 194
    iget-object v3, v4, Lha1;->r:Landroidx/work/impl/WorkDatabase;

    .line 195
    .line 196
    invoke-virtual {v3}, Lpq0;->c()V

    .line 197
    .line 198
    .line 199
    :try_start_2
    invoke-virtual {v3}, Landroidx/work/impl/WorkDatabase;->n()Lh2;

    .line 200
    .line 201
    .line 202
    move-result-object v6

    .line 203
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 204
    .line 205
    .line 206
    move-result v11

    .line 207
    move v12, v7

    .line 208
    :goto_5
    if-ge v12, v11, :cond_7

    .line 209
    .line 210
    invoke-virtual {v8, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object v13

    .line 214
    add-int/lit8 v12, v12, 0x1

    .line 215
    .line 216
    check-cast v13, Ljava/lang/String;

    .line 217
    .line 218
    invoke-virtual {v6, v13, v9, v10}, Lh2;->j(Ljava/lang/String;J)V

    .line 219
    .line 220
    .line 221
    goto :goto_5

    .line 222
    :catchall_1
    move-exception v0

    .line 223
    goto :goto_6

    .line 224
    :cond_7
    invoke-virtual {v3}, Lpq0;->h()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 225
    .line 226
    .line 227
    invoke-virtual {v3}, Lpq0;->f()V

    .line 228
    .line 229
    .line 230
    goto :goto_7

    .line 231
    :goto_6
    invoke-virtual {v3}, Lpq0;->f()V

    .line 232
    .line 233
    .line 234
    throw v0

    .line 235
    :cond_8
    :goto_7
    iget-object v3, v4, Lha1;->r:Landroidx/work/impl/WorkDatabase;

    .line 236
    .line 237
    invoke-virtual {v3}, Landroidx/work/impl/WorkDatabase;->n()Lh2;

    .line 238
    .line 239
    .line 240
    move-result-object v6

    .line 241
    invoke-virtual {v3}, Landroidx/work/impl/WorkDatabase;->m()Lmc2;

    .line 242
    .line 243
    .line 244
    move-result-object v8

    .line 245
    invoke-virtual {v3}, Lpq0;->c()V

    .line 246
    .line 247
    .line 248
    :try_start_3
    invoke-virtual {v6}, Lh2;->c()Ljava/util/ArrayList;

    .line 249
    .line 250
    .line 251
    move-result-object v11

    .line 252
    invoke-virtual {v11}, Ljava/util/ArrayList;->isEmpty()Z

    .line 253
    .line 254
    .line 255
    move-result v12

    .line 256
    if-nez v12, :cond_9

    .line 257
    .line 258
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    .line 259
    .line 260
    .line 261
    move-result v13

    .line 262
    move v14, v7

    .line 263
    :goto_8
    if-ge v14, v13, :cond_9

    .line 264
    .line 265
    invoke-virtual {v11, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 266
    .line 267
    .line 268
    move-result-object v15

    .line 269
    add-int/lit8 v14, v14, 0x1

    .line 270
    .line 271
    check-cast v15, Loa1;

    .line 272
    .line 273
    iget-object v7, v15, Loa1;->a:Ljava/lang/String;

    .line 274
    .line 275
    filled-new-array {v7}, [Ljava/lang/String;

    .line 276
    .line 277
    .line 278
    move-result-object v7

    .line 279
    invoke-virtual {v6, v5, v7}, Lh2;->n(I[Ljava/lang/String;)V

    .line 280
    .line 281
    .line 282
    iget-object v7, v15, Loa1;->a:Ljava/lang/String;

    .line 283
    .line 284
    invoke-virtual {v6, v7, v9, v10}, Lh2;->j(Ljava/lang/String;J)V

    .line 285
    .line 286
    .line 287
    const/4 v7, 0x0

    .line 288
    goto :goto_8

    .line 289
    :catchall_2
    move-exception v0

    .line 290
    goto/16 :goto_11

    .line 291
    .line 292
    :cond_9
    iget-object v6, v8, Lmc2;->g:Ljava/lang/Object;

    .line 293
    .line 294
    check-cast v6, Landroidx/work/impl/WorkDatabase_Impl;

    .line 295
    .line 296
    invoke-virtual {v6}, Lpq0;->b()V

    .line 297
    .line 298
    .line 299
    iget-object v7, v8, Lmc2;->j:Ljava/lang/Object;

    .line 300
    .line 301
    check-cast v7, Ltz0;

    .line 302
    .line 303
    invoke-virtual {v7}, Lsv0;->a()Lpx;

    .line 304
    .line 305
    .line 306
    move-result-object v8

    .line 307
    invoke-virtual {v6}, Lpq0;->c()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 308
    .line 309
    .line 310
    :try_start_4
    invoke-virtual {v8}, Lpx;->t()V

    .line 311
    .line 312
    .line 313
    invoke-virtual {v6}, Lpq0;->h()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 314
    .line 315
    .line 316
    :try_start_5
    invoke-virtual {v6}, Lpq0;->f()V

    .line 317
    .line 318
    .line 319
    invoke-virtual {v7, v8}, Lsv0;->c(Lpx;)V

    .line 320
    .line 321
    .line 322
    invoke-virtual {v3}, Lpq0;->h()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 323
    .line 324
    .line 325
    invoke-virtual {v3}, Lpq0;->f()V

    .line 326
    .line 327
    .line 328
    if-eqz v12, :cond_b

    .line 329
    .line 330
    if-eqz v0, :cond_a

    .line 331
    .line 332
    goto :goto_9

    .line 333
    :cond_a
    const/4 v0, 0x0

    .line 334
    goto :goto_a

    .line 335
    :cond_b
    :goto_9
    move v0, v5

    .line 336
    :goto_a
    iget-object v3, v4, Lha1;->v:Lkf3;

    .line 337
    .line 338
    iget-object v3, v3, Lkf3;->g:Ljava/lang/Object;

    .line 339
    .line 340
    check-cast v3, Landroidx/work/impl/WorkDatabase;

    .line 341
    .line 342
    invoke-virtual {v3}, Landroidx/work/impl/WorkDatabase;->j()Ll92;

    .line 343
    .line 344
    .line 345
    move-result-object v3

    .line 346
    const-string v6, "reschedule_needed"

    .line 347
    .line 348
    invoke-virtual {v3, v6}, Ll92;->y(Ljava/lang/String;)Ljava/lang/Long;

    .line 349
    .line 350
    .line 351
    move-result-object v3

    .line 352
    if-eqz v3, :cond_c

    .line 353
    .line 354
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 355
    .line 356
    .line 357
    move-result-wide v7

    .line 358
    const-wide/16 v9, 0x1

    .line 359
    .line 360
    cmp-long v3, v7, v9

    .line 361
    .line 362
    if-nez v3, :cond_c

    .line 363
    .line 364
    invoke-static {}, Lh80;->d()Lh80;

    .line 365
    .line 366
    .line 367
    move-result-object v0

    .line 368
    const/4 v2, 0x0

    .line 369
    new-array v2, v2, [Ljava/lang/Throwable;

    .line 370
    .line 371
    invoke-virtual {v0, v2}, Lh80;->a([Ljava/lang/Throwable;)V

    .line 372
    .line 373
    .line 374
    invoke-virtual {v4}, Lha1;->m0()V

    .line 375
    .line 376
    .line 377
    iget-object v0, v4, Lha1;->v:Lkf3;

    .line 378
    .line 379
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 380
    .line 381
    .line 382
    new-instance v2, Lxl0;

    .line 383
    .line 384
    const-wide/16 v3, 0x0

    .line 385
    .line 386
    invoke-direct {v2, v6, v3, v4}, Lxl0;-><init>(Ljava/lang/String;J)V

    .line 387
    .line 388
    .line 389
    iget-object v0, v0, Lkf3;->g:Ljava/lang/Object;

    .line 390
    .line 391
    check-cast v0, Landroidx/work/impl/WorkDatabase;

    .line 392
    .line 393
    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->j()Ll92;

    .line 394
    .line 395
    .line 396
    move-result-object v0

    .line 397
    invoke-virtual {v0, v2}, Ll92;->A(Lxl0;)V

    .line 398
    .line 399
    .line 400
    return-void

    .line 401
    :cond_c
    :try_start_6
    invoke-static {}, Lgc;->a()Z

    .line 402
    .line 403
    .line 404
    move-result v3

    .line 405
    if-eqz v3, :cond_d

    .line 406
    .line 407
    const/high16 v3, 0x22000000

    .line 408
    .line 409
    goto :goto_b

    .line 410
    :cond_d
    const/high16 v3, 0x20000000

    .line 411
    .line 412
    :goto_b
    new-instance v6, Landroid/content/Intent;

    .line 413
    .line 414
    invoke-direct {v6}, Landroid/content/Intent;-><init>()V

    .line 415
    .line 416
    .line 417
    new-instance v7, Landroid/content/ComponentName;

    .line 418
    .line 419
    const-class v8, Landroidx/work/impl/utils/ForceStopRunnable$BroadcastReceiver;

    .line 420
    .line 421
    invoke-direct {v7, v2, v8}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 422
    .line 423
    .line 424
    invoke-virtual {v6, v7}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 425
    .line 426
    .line 427
    const-string v7, "ACTION_FORCE_STOP_RESCHEDULE"

    .line 428
    .line 429
    invoke-virtual {v6, v7}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 430
    .line 431
    .line 432
    const/4 v7, -0x1

    .line 433
    invoke-static {v2, v7, v6, v3}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    .line 434
    .line 435
    .line 436
    move-result-object v3

    .line 437
    sget v6, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 438
    .line 439
    const/16 v7, 0x1e

    .line 440
    .line 441
    if-lt v6, v7, :cond_10

    .line 442
    .line 443
    if-eqz v3, :cond_e

    .line 444
    .line 445
    invoke-virtual {v3}, Landroid/app/PendingIntent;->cancel()V

    .line 446
    .line 447
    .line 448
    goto :goto_c

    .line 449
    :catch_1
    move-exception v0

    .line 450
    goto :goto_f

    .line 451
    :catch_2
    move-exception v0

    .line 452
    goto :goto_f

    .line 453
    :cond_e
    :goto_c
    const-string v3, "activity"

    .line 454
    .line 455
    invoke-virtual {v2, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 456
    .line 457
    .line 458
    move-result-object v2

    .line 459
    check-cast v2, Landroid/app/ActivityManager;

    .line 460
    .line 461
    invoke-static {v2}, Lu0;->o(Landroid/app/ActivityManager;)Ljava/util/List;

    .line 462
    .line 463
    .line 464
    move-result-object v2

    .line 465
    if-eqz v2, :cond_11

    .line 466
    .line 467
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 468
    .line 469
    .line 470
    move-result v3

    .line 471
    if-nez v3, :cond_11

    .line 472
    .line 473
    const/4 v3, 0x0

    .line 474
    :goto_d
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 475
    .line 476
    .line 477
    move-result v6

    .line 478
    if-ge v3, v6, :cond_11

    .line 479
    .line 480
    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 481
    .line 482
    .line 483
    move-result-object v6

    .line 484
    invoke-static {v6}, Lu0;->g(Ljava/lang/Object;)Landroid/app/ApplicationExitInfo;

    .line 485
    .line 486
    .line 487
    move-result-object v6

    .line 488
    invoke-static {v6}, Lu0;->c(Landroid/app/ApplicationExitInfo;)I

    .line 489
    .line 490
    .line 491
    move-result v6

    .line 492
    const/16 v7, 0xa

    .line 493
    .line 494
    if-ne v6, v7, :cond_f

    .line 495
    .line 496
    :goto_e
    const/4 v5, 0x0

    .line 497
    goto :goto_10

    .line 498
    :cond_f
    add-int/lit8 v3, v3, 0x1

    .line 499
    .line 500
    goto :goto_d

    .line 501
    :cond_10
    if-nez v3, :cond_11

    .line 502
    .line 503
    invoke-static {v2}, Lxv;->b(Landroid/content/Context;)V
    :try_end_6
    .catch Ljava/lang/SecurityException; {:try_start_6 .. :try_end_6} :catch_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_6 .. :try_end_6} :catch_1

    .line 504
    .line 505
    .line 506
    goto :goto_e

    .line 507
    :cond_11
    if-eqz v0, :cond_12

    .line 508
    .line 509
    invoke-static {}, Lh80;->d()Lh80;

    .line 510
    .line 511
    .line 512
    move-result-object v0

    .line 513
    const/4 v2, 0x0

    .line 514
    new-array v2, v2, [Ljava/lang/Throwable;

    .line 515
    .line 516
    invoke-virtual {v0, v2}, Lh80;->a([Ljava/lang/Throwable;)V

    .line 517
    .line 518
    .line 519
    iget-object v0, v4, Lha1;->q:Lru0;

    .line 520
    .line 521
    iget-object v2, v4, Lha1;->r:Landroidx/work/impl/WorkDatabase;

    .line 522
    .line 523
    iget-object v3, v4, Lha1;->t:Ljava/util/List;

    .line 524
    .line 525
    invoke-static {v0, v2, v3}, Lgt0;->a(Lru0;Landroidx/work/impl/WorkDatabase;Ljava/util/List;)V

    .line 526
    .line 527
    .line 528
    :cond_12
    return-void

    .line 529
    :goto_f
    invoke-static {}, Lh80;->d()Lh80;

    .line 530
    .line 531
    .line 532
    move-result-object v2

    .line 533
    new-array v3, v5, [Ljava/lang/Throwable;

    .line 534
    .line 535
    const/4 v5, 0x0

    .line 536
    aput-object v0, v3, v5

    .line 537
    .line 538
    invoke-virtual {v2, v3}, Lh80;->g([Ljava/lang/Throwable;)V

    .line 539
    .line 540
    .line 541
    :goto_10
    invoke-static {}, Lh80;->d()Lh80;

    .line 542
    .line 543
    .line 544
    move-result-object v0

    .line 545
    new-array v2, v5, [Ljava/lang/Throwable;

    .line 546
    .line 547
    invoke-virtual {v0, v2}, Lh80;->a([Ljava/lang/Throwable;)V

    .line 548
    .line 549
    .line 550
    invoke-virtual {v4}, Lha1;->m0()V

    .line 551
    .line 552
    .line 553
    return-void

    .line 554
    :catchall_3
    move-exception v0

    .line 555
    :try_start_7
    invoke-virtual {v6}, Lpq0;->f()V

    .line 556
    .line 557
    .line 558
    invoke-virtual {v7, v8}, Lsv0;->c(Lpx;)V

    .line 559
    .line 560
    .line 561
    throw v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 562
    :goto_11
    invoke-virtual {v3}, Lpq0;->f()V

    .line 563
    .line 564
    .line 565
    throw v0

    .line 566
    :goto_12
    invoke-interface {v5}, Landroid/database/Cursor;->close()V

    .line 567
    .line 568
    .line 569
    invoke-virtual {v6}, Lrq0;->k()V

    .line 570
    .line 571
    .line 572
    throw v0
.end method

.method public final run()V
    .locals 9

    .line 1
    sget-object v0, Lxv;->i:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v1, p0, Lxv;->g:Lha1;

    .line 4
    .line 5
    :try_start_0
    iget-object v2, v1, Lha1;->q:Lru0;

    .line 6
    .line 7
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 12
    .line 13
    .line 14
    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    iget-object v4, p0, Lxv;->f:Landroid/content/Context;

    .line 16
    .line 17
    const/4 v5, 0x1

    .line 18
    const/4 v6, 0x0

    .line 19
    if-eqz v3, :cond_0

    .line 20
    .line 21
    :try_start_1
    invoke-static {}, Lh80;->d()Lh80;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    new-array v3, v6, [Ljava/lang/Throwable;

    .line 26
    .line 27
    invoke-virtual {v2, v3}, Lh80;->a([Ljava/lang/Throwable;)V

    .line 28
    .line 29
    .line 30
    move v2, v5

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    invoke-static {v4, v2}, Lnm0;->a(Landroid/content/Context;Lru0;)Z

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    invoke-static {}, Lh80;->d()Lh80;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    new-array v7, v6, [Ljava/lang/Throwable;

    .line 41
    .line 42
    invoke-virtual {v3, v7}, Lh80;->a([Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 43
    .line 44
    .line 45
    :goto_0
    if-nez v2, :cond_1

    .line 46
    .line 47
    invoke-virtual {v1}, Lha1;->l0()V

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :catch_0
    :cond_1
    :goto_1
    :try_start_2
    invoke-static {v4}, Lba1;->a(Landroid/content/Context;)V

    .line 52
    .line 53
    .line 54
    invoke-static {}, Lh80;->d()Lh80;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    new-array v3, v6, [Ljava/lang/Throwable;

    .line 59
    .line 60
    invoke-virtual {v2, v3}, Lh80;->a([Ljava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 61
    .line 62
    .line 63
    :try_start_3
    invoke-virtual {p0}, Lxv;->a()V
    :try_end_3
    .catch Landroid/database/sqlite/SQLiteCantOpenDatabaseException; {:try_start_3 .. :try_end_3} :catch_6
    .catch Landroid/database/sqlite/SQLiteDatabaseCorruptException; {:try_start_3 .. :try_end_3} :catch_5
    .catch Landroid/database/sqlite/SQLiteDatabaseLockedException; {:try_start_3 .. :try_end_3} :catch_4
    .catch Landroid/database/sqlite/SQLiteTableLockedException; {:try_start_3 .. :try_end_3} :catch_3
    .catch Landroid/database/sqlite/SQLiteConstraintException; {:try_start_3 .. :try_end_3} :catch_2
    .catch Landroid/database/sqlite/SQLiteAccessPermException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 64
    .line 65
    .line 66
    invoke-virtual {v1}, Lha1;->l0()V

    .line 67
    .line 68
    .line 69
    return-void

    .line 70
    :catchall_0
    move-exception v0

    .line 71
    goto :goto_3

    .line 72
    :catch_1
    move-exception v2

    .line 73
    goto :goto_2

    .line 74
    :catch_2
    move-exception v2

    .line 75
    goto :goto_2

    .line 76
    :catch_3
    move-exception v2

    .line 77
    goto :goto_2

    .line 78
    :catch_4
    move-exception v2

    .line 79
    goto :goto_2

    .line 80
    :catch_5
    move-exception v2

    .line 81
    goto :goto_2

    .line 82
    :catch_6
    move-exception v2

    .line 83
    :goto_2
    :try_start_4
    iget v3, p0, Lxv;->h:I

    .line 84
    .line 85
    add-int/2addr v3, v5

    .line 86
    iput v3, p0, Lxv;->h:I

    .line 87
    .line 88
    const/4 v7, 0x3

    .line 89
    if-ge v3, v7, :cond_2

    .line 90
    .line 91
    invoke-static {}, Lh80;->d()Lh80;

    .line 92
    .line 93
    .line 94
    move-result-object v3

    .line 95
    new-array v7, v5, [Ljava/lang/Throwable;

    .line 96
    .line 97
    aput-object v2, v7, v6

    .line 98
    .line 99
    invoke-virtual {v3, v7}, Lh80;->a([Ljava/lang/Throwable;)V

    .line 100
    .line 101
    .line 102
    iget v2, p0, Lxv;->h:I
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 103
    .line 104
    int-to-long v2, v2

    .line 105
    const-wide/16 v7, 0x12c

    .line 106
    .line 107
    mul-long/2addr v2, v7

    .line 108
    :try_start_5
    invoke-static {v2, v3}, Ljava/lang/Thread;->sleep(J)V
    :try_end_5
    .catch Ljava/lang/InterruptedException; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 109
    .line 110
    .line 111
    goto :goto_1

    .line 112
    :cond_2
    :try_start_6
    const-string v3, "The file system on the device is in a bad state. WorkManager cannot access the app\'s internal data store."

    .line 113
    .line 114
    invoke-static {}, Lh80;->d()Lh80;

    .line 115
    .line 116
    .line 117
    move-result-object v4

    .line 118
    new-array v5, v5, [Ljava/lang/Throwable;

    .line 119
    .line 120
    aput-object v2, v5, v6

    .line 121
    .line 122
    invoke-virtual {v4, v0, v3, v5}, Lh80;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    .line 123
    .line 124
    .line 125
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 126
    .line 127
    invoke-direct {v0, v3, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 128
    .line 129
    .line 130
    iget-object v2, v1, Lha1;->q:Lru0;

    .line 131
    .line 132
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 133
    .line 134
    .line 135
    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 136
    :goto_3
    invoke-virtual {v1}, Lha1;->l0()V

    .line 137
    .line 138
    .line 139
    throw v0
.end method
