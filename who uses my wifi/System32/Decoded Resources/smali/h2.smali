.class public final Lh2;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public a:Ljava/lang/Object;

.field public b:Ljava/lang/Object;

.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;

.field public f:Ljava/lang/Object;

.field public g:Ljava/lang/Object;

.field public h:Ljava/lang/Object;

.field public i:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/ArrayBlockingQueue;

    const/16 v1, 0x64

    invoke-direct {v0, v1}, Ljava/util/concurrent/ArrayBlockingQueue;-><init>(I)V

    iput-object v0, p0, Lh2;->a:Ljava/lang/Object;

    new-instance v0, Ljava/util/LinkedHashMap;

    .line 2
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Lh2;->b:Ljava/lang/Object;

    new-instance v0, Ljava/util/HashMap;

    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lh2;->c:Ljava/lang/Object;

    new-instance v0, Ljava/util/HashSet;

    const-string v1, "viewabilityChanged"

    const-string v2, "visibilityChanged"

    const-string v3, "noop"

    const-string v4, "activeViewPingSent"

    filled-new-array {v3, v4, v1, v2}, [Ljava/lang/String;

    move-result-object v1

    .line 4
    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lh2;->g:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroidx/work/impl/WorkDatabase_Impl;)V
    .locals 2

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    iput-object p1, p0, Lh2;->a:Ljava/lang/Object;

    .line 7
    new-instance v0, Lio;

    const/4 v1, 0x5

    .line 8
    invoke-direct {v0, p1, v1}, Lio;-><init>(Lpq0;I)V

    .line 9
    iput-object v0, p0, Lh2;->b:Ljava/lang/Object;

    .line 10
    new-instance v0, Ltz0;

    const/4 v1, 0x3

    .line 11
    invoke-direct {v0, p1, v1}, Ltz0;-><init>(Lpq0;I)V

    .line 12
    iput-object v0, p0, Lh2;->c:Ljava/lang/Object;

    .line 13
    new-instance v0, Ltz0;

    const/4 v1, 0x4

    .line 14
    invoke-direct {v0, p1, v1}, Ltz0;-><init>(Lpq0;I)V

    .line 15
    iput-object v0, p0, Lh2;->d:Ljava/lang/Object;

    .line 16
    new-instance v0, Ltz0;

    const/4 v1, 0x5

    .line 17
    invoke-direct {v0, p1, v1}, Ltz0;-><init>(Lpq0;I)V

    .line 18
    iput-object v0, p0, Lh2;->e:Ljava/lang/Object;

    .line 19
    new-instance v0, Ltz0;

    const/4 v1, 0x6

    .line 20
    invoke-direct {v0, p1, v1}, Ltz0;-><init>(Lpq0;I)V

    .line 21
    iput-object v0, p0, Lh2;->f:Ljava/lang/Object;

    .line 22
    new-instance v0, Ltz0;

    const/4 v1, 0x7

    .line 23
    invoke-direct {v0, p1, v1}, Ltz0;-><init>(Lpq0;I)V

    .line 24
    iput-object v0, p0, Lh2;->g:Ljava/lang/Object;

    .line 25
    new-instance v0, Ltz0;

    const/16 v1, 0x8

    .line 26
    invoke-direct {v0, p1, v1}, Ltz0;-><init>(Lpq0;I)V

    .line 27
    iput-object v0, p0, Lh2;->h:Ljava/lang/Object;

    .line 28
    new-instance v0, Ltz0;

    const/16 v1, 0x9

    .line 29
    invoke-direct {v0, p1, v1}, Ltz0;-><init>(Lpq0;I)V

    .line 30
    iput-object v0, p0, Lh2;->i:Ljava/lang/Object;

    .line 31
    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    return-void
.end method


# virtual methods
.method public a()Ljava/util/ArrayList;
    .locals 34

    .line 1
    const-string v0, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 ORDER BY period_start_time LIMIT ?"

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-static {v0, v1}, Lrq0;->f(Ljava/lang/String;I)Lrq0;

    .line 5
    .line 6
    .line 7
    move-result-object v2

    .line 8
    const/16 v0, 0xc8

    .line 9
    .line 10
    int-to-long v3, v0

    .line 11
    invoke-virtual {v2, v1, v3, v4}, Lrq0;->g(IJ)V

    .line 12
    .line 13
    .line 14
    move-object/from16 v3, p0

    .line 15
    .line 16
    iget-object v0, v3, Lh2;->a:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, Landroidx/work/impl/WorkDatabase_Impl;

    .line 19
    .line 20
    invoke-virtual {v0}, Lpq0;->b()V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v2}, Lpq0;->g(Llz0;)Landroid/database/Cursor;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    :try_start_0
    const-string v0, "required_network_type"

    .line 28
    .line 29
    invoke-static {v4, v0}, Lyb;->j(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    const-string v5, "requires_charging"

    .line 34
    .line 35
    invoke-static {v4, v5}, Lyb;->j(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 36
    .line 37
    .line 38
    move-result v5

    .line 39
    const-string v6, "requires_device_idle"

    .line 40
    .line 41
    invoke-static {v4, v6}, Lyb;->j(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 42
    .line 43
    .line 44
    move-result v6

    .line 45
    const-string v7, "requires_battery_not_low"

    .line 46
    .line 47
    invoke-static {v4, v7}, Lyb;->j(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 48
    .line 49
    .line 50
    move-result v7

    .line 51
    const-string v8, "requires_storage_not_low"

    .line 52
    .line 53
    invoke-static {v4, v8}, Lyb;->j(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 54
    .line 55
    .line 56
    move-result v8

    .line 57
    const-string v9, "trigger_content_update_delay"

    .line 58
    .line 59
    invoke-static {v4, v9}, Lyb;->j(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 60
    .line 61
    .line 62
    move-result v9

    .line 63
    const-string v10, "trigger_max_content_delay"

    .line 64
    .line 65
    invoke-static {v4, v10}, Lyb;->j(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 66
    .line 67
    .line 68
    move-result v10

    .line 69
    const-string v11, "content_uri_triggers"

    .line 70
    .line 71
    invoke-static {v4, v11}, Lyb;->j(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 72
    .line 73
    .line 74
    move-result v11

    .line 75
    const-string v12, "id"

    .line 76
    .line 77
    invoke-static {v4, v12}, Lyb;->j(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 78
    .line 79
    .line 80
    move-result v12

    .line 81
    const-string v13, "state"

    .line 82
    .line 83
    invoke-static {v4, v13}, Lyb;->j(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 84
    .line 85
    .line 86
    move-result v13

    .line 87
    const-string v14, "worker_class_name"

    .line 88
    .line 89
    invoke-static {v4, v14}, Lyb;->j(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 90
    .line 91
    .line 92
    move-result v14

    .line 93
    const-string v15, "input_merger_class_name"

    .line 94
    .line 95
    invoke-static {v4, v15}, Lyb;->j(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 96
    .line 97
    .line 98
    move-result v15

    .line 99
    const-string v1, "input"

    .line 100
    .line 101
    invoke-static {v4, v1}, Lyb;->j(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 102
    .line 103
    .line 104
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 105
    move-object/from16 v16, v2

    .line 106
    .line 107
    :try_start_1
    const-string v2, "output"

    .line 108
    .line 109
    invoke-static {v4, v2}, Lyb;->j(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 110
    .line 111
    .line 112
    move-result v2

    .line 113
    const-string v3, "initial_delay"

    .line 114
    .line 115
    invoke-static {v4, v3}, Lyb;->j(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 116
    .line 117
    .line 118
    move-result v3

    .line 119
    move/from16 v17, v3

    .line 120
    .line 121
    const-string v3, "interval_duration"

    .line 122
    .line 123
    invoke-static {v4, v3}, Lyb;->j(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 124
    .line 125
    .line 126
    move-result v3

    .line 127
    move/from16 v18, v3

    .line 128
    .line 129
    const-string v3, "flex_duration"

    .line 130
    .line 131
    invoke-static {v4, v3}, Lyb;->j(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 132
    .line 133
    .line 134
    move-result v3

    .line 135
    move/from16 v19, v3

    .line 136
    .line 137
    const-string v3, "run_attempt_count"

    .line 138
    .line 139
    invoke-static {v4, v3}, Lyb;->j(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 140
    .line 141
    .line 142
    move-result v3

    .line 143
    move/from16 v20, v3

    .line 144
    .line 145
    const-string v3, "backoff_policy"

    .line 146
    .line 147
    invoke-static {v4, v3}, Lyb;->j(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 148
    .line 149
    .line 150
    move-result v3

    .line 151
    move/from16 v21, v3

    .line 152
    .line 153
    const-string v3, "backoff_delay_duration"

    .line 154
    .line 155
    invoke-static {v4, v3}, Lyb;->j(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 156
    .line 157
    .line 158
    move-result v3

    .line 159
    move/from16 v22, v3

    .line 160
    .line 161
    const-string v3, "period_start_time"

    .line 162
    .line 163
    invoke-static {v4, v3}, Lyb;->j(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 164
    .line 165
    .line 166
    move-result v3

    .line 167
    move/from16 v23, v3

    .line 168
    .line 169
    const-string v3, "minimum_retention_duration"

    .line 170
    .line 171
    invoke-static {v4, v3}, Lyb;->j(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 172
    .line 173
    .line 174
    move-result v3

    .line 175
    move/from16 v24, v3

    .line 176
    .line 177
    const-string v3, "schedule_requested_at"

    .line 178
    .line 179
    invoke-static {v4, v3}, Lyb;->j(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 180
    .line 181
    .line 182
    move-result v3

    .line 183
    move/from16 v25, v3

    .line 184
    .line 185
    const-string v3, "run_in_foreground"

    .line 186
    .line 187
    invoke-static {v4, v3}, Lyb;->j(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 188
    .line 189
    .line 190
    move-result v3

    .line 191
    move/from16 v26, v3

    .line 192
    .line 193
    const-string v3, "out_of_quota_policy"

    .line 194
    .line 195
    invoke-static {v4, v3}, Lyb;->j(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 196
    .line 197
    .line 198
    move-result v3

    .line 199
    move/from16 v27, v3

    .line 200
    .line 201
    new-instance v3, Ljava/util/ArrayList;

    .line 202
    .line 203
    move/from16 v28, v2

    .line 204
    .line 205
    invoke-interface {v4}, Landroid/database/Cursor;->getCount()I

    .line 206
    .line 207
    .line 208
    move-result v2

    .line 209
    invoke-direct {v3, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 210
    .line 211
    .line 212
    :goto_0
    invoke-interface {v4}, Landroid/database/Cursor;->moveToNext()Z

    .line 213
    .line 214
    .line 215
    move-result v2

    .line 216
    if-eqz v2, :cond_5

    .line 217
    .line 218
    invoke-interface {v4, v12}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object v2

    .line 222
    move/from16 v29, v12

    .line 223
    .line 224
    invoke-interface {v4, v14}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 225
    .line 226
    .line 227
    move-result-object v12

    .line 228
    move/from16 v30, v14

    .line 229
    .line 230
    new-instance v14, Lri;

    .line 231
    .line 232
    invoke-direct {v14}, Lri;-><init>()V

    .line 233
    .line 234
    .line 235
    invoke-interface {v4, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 236
    .line 237
    .line 238
    move-result v31

    .line 239
    move/from16 v32, v0

    .line 240
    .line 241
    invoke-static/range {v31 .. v31}, Lwl2;->l(I)I

    .line 242
    .line 243
    .line 244
    move-result v0

    .line 245
    iput v0, v14, Lri;->a:I

    .line 246
    .line 247
    invoke-interface {v4, v5}, Landroid/database/Cursor;->getInt(I)I

    .line 248
    .line 249
    .line 250
    move-result v0

    .line 251
    const/16 v31, 0x0

    .line 252
    .line 253
    if-eqz v0, :cond_0

    .line 254
    .line 255
    const/4 v0, 0x1

    .line 256
    goto :goto_1

    .line 257
    :cond_0
    move/from16 v0, v31

    .line 258
    .line 259
    :goto_1
    iput-boolean v0, v14, Lri;->b:Z

    .line 260
    .line 261
    invoke-interface {v4, v6}, Landroid/database/Cursor;->getInt(I)I

    .line 262
    .line 263
    .line 264
    move-result v0

    .line 265
    if-eqz v0, :cond_1

    .line 266
    .line 267
    const/4 v0, 0x1

    .line 268
    goto :goto_2

    .line 269
    :cond_1
    move/from16 v0, v31

    .line 270
    .line 271
    :goto_2
    iput-boolean v0, v14, Lri;->c:Z

    .line 272
    .line 273
    invoke-interface {v4, v7}, Landroid/database/Cursor;->getInt(I)I

    .line 274
    .line 275
    .line 276
    move-result v0

    .line 277
    if-eqz v0, :cond_2

    .line 278
    .line 279
    const/4 v0, 0x1

    .line 280
    goto :goto_3

    .line 281
    :cond_2
    move/from16 v0, v31

    .line 282
    .line 283
    :goto_3
    iput-boolean v0, v14, Lri;->d:Z

    .line 284
    .line 285
    invoke-interface {v4, v8}, Landroid/database/Cursor;->getInt(I)I

    .line 286
    .line 287
    .line 288
    move-result v0

    .line 289
    if-eqz v0, :cond_3

    .line 290
    .line 291
    const/4 v0, 0x1

    .line 292
    goto :goto_4

    .line 293
    :cond_3
    move/from16 v0, v31

    .line 294
    .line 295
    :goto_4
    iput-boolean v0, v14, Lri;->e:Z

    .line 296
    .line 297
    move v0, v5

    .line 298
    move/from16 v33, v6

    .line 299
    .line 300
    invoke-interface {v4, v9}, Landroid/database/Cursor;->getLong(I)J

    .line 301
    .line 302
    .line 303
    move-result-wide v5

    .line 304
    iput-wide v5, v14, Lri;->f:J

    .line 305
    .line 306
    invoke-interface {v4, v10}, Landroid/database/Cursor;->getLong(I)J

    .line 307
    .line 308
    .line 309
    move-result-wide v5

    .line 310
    iput-wide v5, v14, Lri;->g:J

    .line 311
    .line 312
    invoke-interface {v4, v11}, Landroid/database/Cursor;->getBlob(I)[B

    .line 313
    .line 314
    .line 315
    move-result-object v5

    .line 316
    invoke-static {v5}, Lwl2;->b([B)Lhj;

    .line 317
    .line 318
    .line 319
    move-result-object v5

    .line 320
    iput-object v5, v14, Lri;->h:Lhj;

    .line 321
    .line 322
    new-instance v5, Loa1;

    .line 323
    .line 324
    invoke-direct {v5, v2, v12}, Loa1;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 325
    .line 326
    .line 327
    invoke-interface {v4, v13}, Landroid/database/Cursor;->getInt(I)I

    .line 328
    .line 329
    .line 330
    move-result v2

    .line 331
    invoke-static {v2}, Lwl2;->n(I)I

    .line 332
    .line 333
    .line 334
    move-result v2

    .line 335
    iput v2, v5, Loa1;->b:I

    .line 336
    .line 337
    invoke-interface {v4, v15}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 338
    .line 339
    .line 340
    move-result-object v2

    .line 341
    iput-object v2, v5, Loa1;->d:Ljava/lang/String;

    .line 342
    .line 343
    invoke-interface {v4, v1}, Landroid/database/Cursor;->getBlob(I)[B

    .line 344
    .line 345
    .line 346
    move-result-object v2

    .line 347
    invoke-static {v2}, Lim;->a([B)Lim;

    .line 348
    .line 349
    .line 350
    move-result-object v2

    .line 351
    iput-object v2, v5, Loa1;->e:Lim;

    .line 352
    .line 353
    move/from16 v2, v28

    .line 354
    .line 355
    invoke-interface {v4, v2}, Landroid/database/Cursor;->getBlob(I)[B

    .line 356
    .line 357
    .line 358
    move-result-object v6

    .line 359
    invoke-static {v6}, Lim;->a([B)Lim;

    .line 360
    .line 361
    .line 362
    move-result-object v6

    .line 363
    iput-object v6, v5, Loa1;->f:Lim;

    .line 364
    .line 365
    move v12, v1

    .line 366
    move/from16 v6, v17

    .line 367
    .line 368
    move/from16 v17, v0

    .line 369
    .line 370
    invoke-interface {v4, v6}, Landroid/database/Cursor;->getLong(I)J

    .line 371
    .line 372
    .line 373
    move-result-wide v0

    .line 374
    iput-wide v0, v5, Loa1;->g:J

    .line 375
    .line 376
    move/from16 v28, v2

    .line 377
    .line 378
    move/from16 v0, v18

    .line 379
    .line 380
    invoke-interface {v4, v0}, Landroid/database/Cursor;->getLong(I)J

    .line 381
    .line 382
    .line 383
    move-result-wide v1

    .line 384
    iput-wide v1, v5, Loa1;->h:J

    .line 385
    .line 386
    move/from16 v18, v6

    .line 387
    .line 388
    move v2, v7

    .line 389
    move/from16 v1, v19

    .line 390
    .line 391
    invoke-interface {v4, v1}, Landroid/database/Cursor;->getLong(I)J

    .line 392
    .line 393
    .line 394
    move-result-wide v6

    .line 395
    iput-wide v6, v5, Loa1;->i:J

    .line 396
    .line 397
    move/from16 v6, v20

    .line 398
    .line 399
    invoke-interface {v4, v6}, Landroid/database/Cursor;->getInt(I)I

    .line 400
    .line 401
    .line 402
    move-result v7

    .line 403
    iput v7, v5, Loa1;->k:I

    .line 404
    .line 405
    move/from16 v7, v21

    .line 406
    .line 407
    invoke-interface {v4, v7}, Landroid/database/Cursor;->getInt(I)I

    .line 408
    .line 409
    .line 410
    move-result v19

    .line 411
    move/from16 v20, v0

    .line 412
    .line 413
    invoke-static/range {v19 .. v19}, Lwl2;->k(I)I

    .line 414
    .line 415
    .line 416
    move-result v0

    .line 417
    iput v0, v5, Loa1;->l:I

    .line 418
    .line 419
    move/from16 v19, v1

    .line 420
    .line 421
    move/from16 v21, v2

    .line 422
    .line 423
    move/from16 v0, v22

    .line 424
    .line 425
    invoke-interface {v4, v0}, Landroid/database/Cursor;->getLong(I)J

    .line 426
    .line 427
    .line 428
    move-result-wide v1

    .line 429
    iput-wide v1, v5, Loa1;->m:J

    .line 430
    .line 431
    move v2, v6

    .line 432
    move/from16 v22, v7

    .line 433
    .line 434
    move/from16 v1, v23

    .line 435
    .line 436
    invoke-interface {v4, v1}, Landroid/database/Cursor;->getLong(I)J

    .line 437
    .line 438
    .line 439
    move-result-wide v6

    .line 440
    iput-wide v6, v5, Loa1;->n:J

    .line 441
    .line 442
    move v7, v0

    .line 443
    move/from16 v23, v1

    .line 444
    .line 445
    move/from16 v6, v24

    .line 446
    .line 447
    invoke-interface {v4, v6}, Landroid/database/Cursor;->getLong(I)J

    .line 448
    .line 449
    .line 450
    move-result-wide v0

    .line 451
    iput-wide v0, v5, Loa1;->o:J

    .line 452
    .line 453
    move/from16 v24, v2

    .line 454
    .line 455
    move/from16 v0, v25

    .line 456
    .line 457
    invoke-interface {v4, v0}, Landroid/database/Cursor;->getLong(I)J

    .line 458
    .line 459
    .line 460
    move-result-wide v1

    .line 461
    iput-wide v1, v5, Loa1;->p:J

    .line 462
    .line 463
    move/from16 v1, v26

    .line 464
    .line 465
    invoke-interface {v4, v1}, Landroid/database/Cursor;->getInt(I)I

    .line 466
    .line 467
    .line 468
    move-result v2

    .line 469
    if-eqz v2, :cond_4

    .line 470
    .line 471
    const/4 v2, 0x1

    .line 472
    goto :goto_5

    .line 473
    :cond_4
    move/from16 v2, v31

    .line 474
    .line 475
    :goto_5
    iput-boolean v2, v5, Loa1;->q:Z

    .line 476
    .line 477
    move/from16 v2, v27

    .line 478
    .line 479
    invoke-interface {v4, v2}, Landroid/database/Cursor;->getInt(I)I

    .line 480
    .line 481
    .line 482
    move-result v25

    .line 483
    move/from16 v26, v0

    .line 484
    .line 485
    invoke-static/range {v25 .. v25}, Lwl2;->m(I)I

    .line 486
    .line 487
    .line 488
    move-result v0

    .line 489
    iput v0, v5, Loa1;->r:I

    .line 490
    .line 491
    iput-object v14, v5, Loa1;->j:Lri;

    .line 492
    .line 493
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 494
    .line 495
    .line 496
    move/from16 v0, v22

    .line 497
    .line 498
    move/from16 v22, v7

    .line 499
    .line 500
    move/from16 v7, v21

    .line 501
    .line 502
    move/from16 v21, v0

    .line 503
    .line 504
    move/from16 v27, v2

    .line 505
    .line 506
    move/from16 v5, v17

    .line 507
    .line 508
    move/from16 v17, v18

    .line 509
    .line 510
    move/from16 v18, v20

    .line 511
    .line 512
    move/from16 v20, v24

    .line 513
    .line 514
    move/from16 v25, v26

    .line 515
    .line 516
    move/from16 v14, v30

    .line 517
    .line 518
    move/from16 v0, v32

    .line 519
    .line 520
    move/from16 v26, v1

    .line 521
    .line 522
    move/from16 v24, v6

    .line 523
    .line 524
    move v1, v12

    .line 525
    move/from16 v12, v29

    .line 526
    .line 527
    move/from16 v6, v33

    .line 528
    .line 529
    goto/16 :goto_0

    .line 530
    .line 531
    :catchall_0
    move-exception v0

    .line 532
    goto :goto_6

    .line 533
    :cond_5
    invoke-interface {v4}, Landroid/database/Cursor;->close()V

    .line 534
    .line 535
    .line 536
    invoke-virtual/range {v16 .. v16}, Lrq0;->k()V

    .line 537
    .line 538
    .line 539
    return-object v3

    .line 540
    :catchall_1
    move-exception v0

    .line 541
    move-object/from16 v16, v2

    .line 542
    .line 543
    :goto_6
    invoke-interface {v4}, Landroid/database/Cursor;->close()V

    .line 544
    .line 545
    .line 546
    invoke-virtual/range {v16 .. v16}, Lrq0;->k()V

    .line 547
    .line 548
    .line 549
    throw v0
.end method

.method public b(I)Ljava/util/ArrayList;
    .locals 33

    .line 1
    const-string v0, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY period_start_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))"

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-static {v0, v1}, Lrq0;->f(Ljava/lang/String;I)Lrq0;

    .line 5
    .line 6
    .line 7
    move-result-object v2

    .line 8
    move/from16 v0, p1

    .line 9
    .line 10
    int-to-long v3, v0

    .line 11
    invoke-virtual {v2, v1, v3, v4}, Lrq0;->g(IJ)V

    .line 12
    .line 13
    .line 14
    move-object/from16 v3, p0

    .line 15
    .line 16
    iget-object v0, v3, Lh2;->a:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, Landroidx/work/impl/WorkDatabase_Impl;

    .line 19
    .line 20
    invoke-virtual {v0}, Lpq0;->b()V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v2}, Lpq0;->g(Llz0;)Landroid/database/Cursor;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    :try_start_0
    const-string v0, "required_network_type"

    .line 28
    .line 29
    invoke-static {v4, v0}, Lyb;->j(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    const-string v5, "requires_charging"

    .line 34
    .line 35
    invoke-static {v4, v5}, Lyb;->j(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 36
    .line 37
    .line 38
    move-result v5

    .line 39
    const-string v6, "requires_device_idle"

    .line 40
    .line 41
    invoke-static {v4, v6}, Lyb;->j(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 42
    .line 43
    .line 44
    move-result v6

    .line 45
    const-string v7, "requires_battery_not_low"

    .line 46
    .line 47
    invoke-static {v4, v7}, Lyb;->j(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 48
    .line 49
    .line 50
    move-result v7

    .line 51
    const-string v8, "requires_storage_not_low"

    .line 52
    .line 53
    invoke-static {v4, v8}, Lyb;->j(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 54
    .line 55
    .line 56
    move-result v8

    .line 57
    const-string v9, "trigger_content_update_delay"

    .line 58
    .line 59
    invoke-static {v4, v9}, Lyb;->j(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 60
    .line 61
    .line 62
    move-result v9

    .line 63
    const-string v10, "trigger_max_content_delay"

    .line 64
    .line 65
    invoke-static {v4, v10}, Lyb;->j(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 66
    .line 67
    .line 68
    move-result v10

    .line 69
    const-string v11, "content_uri_triggers"

    .line 70
    .line 71
    invoke-static {v4, v11}, Lyb;->j(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 72
    .line 73
    .line 74
    move-result v11

    .line 75
    const-string v12, "id"

    .line 76
    .line 77
    invoke-static {v4, v12}, Lyb;->j(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 78
    .line 79
    .line 80
    move-result v12

    .line 81
    const-string v13, "state"

    .line 82
    .line 83
    invoke-static {v4, v13}, Lyb;->j(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 84
    .line 85
    .line 86
    move-result v13

    .line 87
    const-string v14, "worker_class_name"

    .line 88
    .line 89
    invoke-static {v4, v14}, Lyb;->j(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 90
    .line 91
    .line 92
    move-result v14

    .line 93
    const-string v15, "input_merger_class_name"

    .line 94
    .line 95
    invoke-static {v4, v15}, Lyb;->j(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 96
    .line 97
    .line 98
    move-result v15

    .line 99
    const-string v1, "input"

    .line 100
    .line 101
    invoke-static {v4, v1}, Lyb;->j(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 102
    .line 103
    .line 104
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 105
    move-object/from16 v16, v2

    .line 106
    .line 107
    :try_start_1
    const-string v2, "output"

    .line 108
    .line 109
    invoke-static {v4, v2}, Lyb;->j(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 110
    .line 111
    .line 112
    move-result v2

    .line 113
    const-string v3, "initial_delay"

    .line 114
    .line 115
    invoke-static {v4, v3}, Lyb;->j(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 116
    .line 117
    .line 118
    move-result v3

    .line 119
    move/from16 p1, v3

    .line 120
    .line 121
    const-string v3, "interval_duration"

    .line 122
    .line 123
    invoke-static {v4, v3}, Lyb;->j(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 124
    .line 125
    .line 126
    move-result v3

    .line 127
    move/from16 v17, v3

    .line 128
    .line 129
    const-string v3, "flex_duration"

    .line 130
    .line 131
    invoke-static {v4, v3}, Lyb;->j(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 132
    .line 133
    .line 134
    move-result v3

    .line 135
    move/from16 v18, v3

    .line 136
    .line 137
    const-string v3, "run_attempt_count"

    .line 138
    .line 139
    invoke-static {v4, v3}, Lyb;->j(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 140
    .line 141
    .line 142
    move-result v3

    .line 143
    move/from16 v19, v3

    .line 144
    .line 145
    const-string v3, "backoff_policy"

    .line 146
    .line 147
    invoke-static {v4, v3}, Lyb;->j(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 148
    .line 149
    .line 150
    move-result v3

    .line 151
    move/from16 v20, v3

    .line 152
    .line 153
    const-string v3, "backoff_delay_duration"

    .line 154
    .line 155
    invoke-static {v4, v3}, Lyb;->j(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 156
    .line 157
    .line 158
    move-result v3

    .line 159
    move/from16 v21, v3

    .line 160
    .line 161
    const-string v3, "period_start_time"

    .line 162
    .line 163
    invoke-static {v4, v3}, Lyb;->j(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 164
    .line 165
    .line 166
    move-result v3

    .line 167
    move/from16 v22, v3

    .line 168
    .line 169
    const-string v3, "minimum_retention_duration"

    .line 170
    .line 171
    invoke-static {v4, v3}, Lyb;->j(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 172
    .line 173
    .line 174
    move-result v3

    .line 175
    move/from16 v23, v3

    .line 176
    .line 177
    const-string v3, "schedule_requested_at"

    .line 178
    .line 179
    invoke-static {v4, v3}, Lyb;->j(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 180
    .line 181
    .line 182
    move-result v3

    .line 183
    move/from16 v24, v3

    .line 184
    .line 185
    const-string v3, "run_in_foreground"

    .line 186
    .line 187
    invoke-static {v4, v3}, Lyb;->j(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 188
    .line 189
    .line 190
    move-result v3

    .line 191
    move/from16 v25, v3

    .line 192
    .line 193
    const-string v3, "out_of_quota_policy"

    .line 194
    .line 195
    invoke-static {v4, v3}, Lyb;->j(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 196
    .line 197
    .line 198
    move-result v3

    .line 199
    move/from16 v26, v3

    .line 200
    .line 201
    new-instance v3, Ljava/util/ArrayList;

    .line 202
    .line 203
    move/from16 v27, v2

    .line 204
    .line 205
    invoke-interface {v4}, Landroid/database/Cursor;->getCount()I

    .line 206
    .line 207
    .line 208
    move-result v2

    .line 209
    invoke-direct {v3, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 210
    .line 211
    .line 212
    :goto_0
    invoke-interface {v4}, Landroid/database/Cursor;->moveToNext()Z

    .line 213
    .line 214
    .line 215
    move-result v2

    .line 216
    if-eqz v2, :cond_5

    .line 217
    .line 218
    invoke-interface {v4, v12}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object v2

    .line 222
    move/from16 v28, v12

    .line 223
    .line 224
    invoke-interface {v4, v14}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 225
    .line 226
    .line 227
    move-result-object v12

    .line 228
    move/from16 v29, v14

    .line 229
    .line 230
    new-instance v14, Lri;

    .line 231
    .line 232
    invoke-direct {v14}, Lri;-><init>()V

    .line 233
    .line 234
    .line 235
    invoke-interface {v4, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 236
    .line 237
    .line 238
    move-result v30

    .line 239
    move/from16 v31, v0

    .line 240
    .line 241
    invoke-static/range {v30 .. v30}, Lwl2;->l(I)I

    .line 242
    .line 243
    .line 244
    move-result v0

    .line 245
    iput v0, v14, Lri;->a:I

    .line 246
    .line 247
    invoke-interface {v4, v5}, Landroid/database/Cursor;->getInt(I)I

    .line 248
    .line 249
    .line 250
    move-result v0

    .line 251
    const/16 v30, 0x0

    .line 252
    .line 253
    if-eqz v0, :cond_0

    .line 254
    .line 255
    const/4 v0, 0x1

    .line 256
    goto :goto_1

    .line 257
    :cond_0
    move/from16 v0, v30

    .line 258
    .line 259
    :goto_1
    iput-boolean v0, v14, Lri;->b:Z

    .line 260
    .line 261
    invoke-interface {v4, v6}, Landroid/database/Cursor;->getInt(I)I

    .line 262
    .line 263
    .line 264
    move-result v0

    .line 265
    if-eqz v0, :cond_1

    .line 266
    .line 267
    const/4 v0, 0x1

    .line 268
    goto :goto_2

    .line 269
    :cond_1
    move/from16 v0, v30

    .line 270
    .line 271
    :goto_2
    iput-boolean v0, v14, Lri;->c:Z

    .line 272
    .line 273
    invoke-interface {v4, v7}, Landroid/database/Cursor;->getInt(I)I

    .line 274
    .line 275
    .line 276
    move-result v0

    .line 277
    if-eqz v0, :cond_2

    .line 278
    .line 279
    const/4 v0, 0x1

    .line 280
    goto :goto_3

    .line 281
    :cond_2
    move/from16 v0, v30

    .line 282
    .line 283
    :goto_3
    iput-boolean v0, v14, Lri;->d:Z

    .line 284
    .line 285
    invoke-interface {v4, v8}, Landroid/database/Cursor;->getInt(I)I

    .line 286
    .line 287
    .line 288
    move-result v0

    .line 289
    if-eqz v0, :cond_3

    .line 290
    .line 291
    const/4 v0, 0x1

    .line 292
    goto :goto_4

    .line 293
    :cond_3
    move/from16 v0, v30

    .line 294
    .line 295
    :goto_4
    iput-boolean v0, v14, Lri;->e:Z

    .line 296
    .line 297
    move v0, v5

    .line 298
    move/from16 v32, v6

    .line 299
    .line 300
    invoke-interface {v4, v9}, Landroid/database/Cursor;->getLong(I)J

    .line 301
    .line 302
    .line 303
    move-result-wide v5

    .line 304
    iput-wide v5, v14, Lri;->f:J

    .line 305
    .line 306
    invoke-interface {v4, v10}, Landroid/database/Cursor;->getLong(I)J

    .line 307
    .line 308
    .line 309
    move-result-wide v5

    .line 310
    iput-wide v5, v14, Lri;->g:J

    .line 311
    .line 312
    invoke-interface {v4, v11}, Landroid/database/Cursor;->getBlob(I)[B

    .line 313
    .line 314
    .line 315
    move-result-object v5

    .line 316
    invoke-static {v5}, Lwl2;->b([B)Lhj;

    .line 317
    .line 318
    .line 319
    move-result-object v5

    .line 320
    iput-object v5, v14, Lri;->h:Lhj;

    .line 321
    .line 322
    new-instance v5, Loa1;

    .line 323
    .line 324
    invoke-direct {v5, v2, v12}, Loa1;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 325
    .line 326
    .line 327
    invoke-interface {v4, v13}, Landroid/database/Cursor;->getInt(I)I

    .line 328
    .line 329
    .line 330
    move-result v2

    .line 331
    invoke-static {v2}, Lwl2;->n(I)I

    .line 332
    .line 333
    .line 334
    move-result v2

    .line 335
    iput v2, v5, Loa1;->b:I

    .line 336
    .line 337
    invoke-interface {v4, v15}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 338
    .line 339
    .line 340
    move-result-object v2

    .line 341
    iput-object v2, v5, Loa1;->d:Ljava/lang/String;

    .line 342
    .line 343
    invoke-interface {v4, v1}, Landroid/database/Cursor;->getBlob(I)[B

    .line 344
    .line 345
    .line 346
    move-result-object v2

    .line 347
    invoke-static {v2}, Lim;->a([B)Lim;

    .line 348
    .line 349
    .line 350
    move-result-object v2

    .line 351
    iput-object v2, v5, Loa1;->e:Lim;

    .line 352
    .line 353
    move/from16 v2, v27

    .line 354
    .line 355
    invoke-interface {v4, v2}, Landroid/database/Cursor;->getBlob(I)[B

    .line 356
    .line 357
    .line 358
    move-result-object v6

    .line 359
    invoke-static {v6}, Lim;->a([B)Lim;

    .line 360
    .line 361
    .line 362
    move-result-object v6

    .line 363
    iput-object v6, v5, Loa1;->f:Lim;

    .line 364
    .line 365
    move/from16 v6, p1

    .line 366
    .line 367
    move v12, v0

    .line 368
    move/from16 p1, v1

    .line 369
    .line 370
    invoke-interface {v4, v6}, Landroid/database/Cursor;->getLong(I)J

    .line 371
    .line 372
    .line 373
    move-result-wide v0

    .line 374
    iput-wide v0, v5, Loa1;->g:J

    .line 375
    .line 376
    move/from16 v27, v2

    .line 377
    .line 378
    move/from16 v0, v17

    .line 379
    .line 380
    invoke-interface {v4, v0}, Landroid/database/Cursor;->getLong(I)J

    .line 381
    .line 382
    .line 383
    move-result-wide v1

    .line 384
    iput-wide v1, v5, Loa1;->h:J

    .line 385
    .line 386
    move/from16 v17, v6

    .line 387
    .line 388
    move v2, v7

    .line 389
    move/from16 v1, v18

    .line 390
    .line 391
    invoke-interface {v4, v1}, Landroid/database/Cursor;->getLong(I)J

    .line 392
    .line 393
    .line 394
    move-result-wide v6

    .line 395
    iput-wide v6, v5, Loa1;->i:J

    .line 396
    .line 397
    move/from16 v6, v19

    .line 398
    .line 399
    invoke-interface {v4, v6}, Landroid/database/Cursor;->getInt(I)I

    .line 400
    .line 401
    .line 402
    move-result v7

    .line 403
    iput v7, v5, Loa1;->k:I

    .line 404
    .line 405
    move/from16 v7, v20

    .line 406
    .line 407
    invoke-interface {v4, v7}, Landroid/database/Cursor;->getInt(I)I

    .line 408
    .line 409
    .line 410
    move-result v18

    .line 411
    move/from16 v19, v0

    .line 412
    .line 413
    invoke-static/range {v18 .. v18}, Lwl2;->k(I)I

    .line 414
    .line 415
    .line 416
    move-result v0

    .line 417
    iput v0, v5, Loa1;->l:I

    .line 418
    .line 419
    move/from16 v18, v1

    .line 420
    .line 421
    move/from16 v20, v2

    .line 422
    .line 423
    move/from16 v0, v21

    .line 424
    .line 425
    invoke-interface {v4, v0}, Landroid/database/Cursor;->getLong(I)J

    .line 426
    .line 427
    .line 428
    move-result-wide v1

    .line 429
    iput-wide v1, v5, Loa1;->m:J

    .line 430
    .line 431
    move v2, v6

    .line 432
    move/from16 v21, v7

    .line 433
    .line 434
    move/from16 v1, v22

    .line 435
    .line 436
    invoke-interface {v4, v1}, Landroid/database/Cursor;->getLong(I)J

    .line 437
    .line 438
    .line 439
    move-result-wide v6

    .line 440
    iput-wide v6, v5, Loa1;->n:J

    .line 441
    .line 442
    move v7, v0

    .line 443
    move/from16 v22, v1

    .line 444
    .line 445
    move/from16 v6, v23

    .line 446
    .line 447
    invoke-interface {v4, v6}, Landroid/database/Cursor;->getLong(I)J

    .line 448
    .line 449
    .line 450
    move-result-wide v0

    .line 451
    iput-wide v0, v5, Loa1;->o:J

    .line 452
    .line 453
    move/from16 v23, v2

    .line 454
    .line 455
    move/from16 v0, v24

    .line 456
    .line 457
    invoke-interface {v4, v0}, Landroid/database/Cursor;->getLong(I)J

    .line 458
    .line 459
    .line 460
    move-result-wide v1

    .line 461
    iput-wide v1, v5, Loa1;->p:J

    .line 462
    .line 463
    move/from16 v1, v25

    .line 464
    .line 465
    invoke-interface {v4, v1}, Landroid/database/Cursor;->getInt(I)I

    .line 466
    .line 467
    .line 468
    move-result v2

    .line 469
    if-eqz v2, :cond_4

    .line 470
    .line 471
    const/4 v2, 0x1

    .line 472
    goto :goto_5

    .line 473
    :cond_4
    move/from16 v2, v30

    .line 474
    .line 475
    :goto_5
    iput-boolean v2, v5, Loa1;->q:Z

    .line 476
    .line 477
    move/from16 v2, v26

    .line 478
    .line 479
    invoke-interface {v4, v2}, Landroid/database/Cursor;->getInt(I)I

    .line 480
    .line 481
    .line 482
    move-result v24

    .line 483
    move/from16 v25, v0

    .line 484
    .line 485
    invoke-static/range {v24 .. v24}, Lwl2;->m(I)I

    .line 486
    .line 487
    .line 488
    move-result v0

    .line 489
    iput v0, v5, Loa1;->r:I

    .line 490
    .line 491
    iput-object v14, v5, Loa1;->j:Lri;

    .line 492
    .line 493
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 494
    .line 495
    .line 496
    move/from16 v0, v21

    .line 497
    .line 498
    move/from16 v21, v7

    .line 499
    .line 500
    move/from16 v7, v20

    .line 501
    .line 502
    move/from16 v20, v0

    .line 503
    .line 504
    move/from16 v26, v2

    .line 505
    .line 506
    move v5, v12

    .line 507
    move/from16 v24, v25

    .line 508
    .line 509
    move/from16 v12, v28

    .line 510
    .line 511
    move/from16 v14, v29

    .line 512
    .line 513
    move/from16 v0, v31

    .line 514
    .line 515
    move/from16 v25, v1

    .line 516
    .line 517
    move/from16 v1, p1

    .line 518
    .line 519
    move/from16 p1, v17

    .line 520
    .line 521
    move/from16 v17, v19

    .line 522
    .line 523
    move/from16 v19, v23

    .line 524
    .line 525
    move/from16 v23, v6

    .line 526
    .line 527
    move/from16 v6, v32

    .line 528
    .line 529
    goto/16 :goto_0

    .line 530
    .line 531
    :catchall_0
    move-exception v0

    .line 532
    goto :goto_6

    .line 533
    :cond_5
    invoke-interface {v4}, Landroid/database/Cursor;->close()V

    .line 534
    .line 535
    .line 536
    invoke-virtual/range {v16 .. v16}, Lrq0;->k()V

    .line 537
    .line 538
    .line 539
    return-object v3

    .line 540
    :catchall_1
    move-exception v0

    .line 541
    move-object/from16 v16, v2

    .line 542
    .line 543
    :goto_6
    invoke-interface {v4}, Landroid/database/Cursor;->close()V

    .line 544
    .line 545
    .line 546
    invoke-virtual/range {v16 .. v16}, Lrq0;->k()V

    .line 547
    .line 548
    .line 549
    throw v0
.end method

.method public c()Ljava/util/ArrayList;
    .locals 34

    .line 1
    const-string v0, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=1"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {v0, v1}, Lrq0;->f(Ljava/lang/String;I)Lrq0;

    .line 5
    .line 6
    .line 7
    move-result-object v2

    .line 8
    move-object/from16 v3, p0

    .line 9
    .line 10
    iget-object v0, v3, Lh2;->a:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Landroidx/work/impl/WorkDatabase_Impl;

    .line 13
    .line 14
    invoke-virtual {v0}, Lpq0;->b()V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v2}, Lpq0;->g(Llz0;)Landroid/database/Cursor;

    .line 18
    .line 19
    .line 20
    move-result-object v4

    .line 21
    :try_start_0
    const-string v0, "required_network_type"

    .line 22
    .line 23
    invoke-static {v4, v0}, Lyb;->j(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    const-string v5, "requires_charging"

    .line 28
    .line 29
    invoke-static {v4, v5}, Lyb;->j(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 30
    .line 31
    .line 32
    move-result v5

    .line 33
    const-string v6, "requires_device_idle"

    .line 34
    .line 35
    invoke-static {v4, v6}, Lyb;->j(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 36
    .line 37
    .line 38
    move-result v6

    .line 39
    const-string v7, "requires_battery_not_low"

    .line 40
    .line 41
    invoke-static {v4, v7}, Lyb;->j(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 42
    .line 43
    .line 44
    move-result v7

    .line 45
    const-string v8, "requires_storage_not_low"

    .line 46
    .line 47
    invoke-static {v4, v8}, Lyb;->j(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 48
    .line 49
    .line 50
    move-result v8

    .line 51
    const-string v9, "trigger_content_update_delay"

    .line 52
    .line 53
    invoke-static {v4, v9}, Lyb;->j(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 54
    .line 55
    .line 56
    move-result v9

    .line 57
    const-string v10, "trigger_max_content_delay"

    .line 58
    .line 59
    invoke-static {v4, v10}, Lyb;->j(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 60
    .line 61
    .line 62
    move-result v10

    .line 63
    const-string v11, "content_uri_triggers"

    .line 64
    .line 65
    invoke-static {v4, v11}, Lyb;->j(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 66
    .line 67
    .line 68
    move-result v11

    .line 69
    const-string v12, "id"

    .line 70
    .line 71
    invoke-static {v4, v12}, Lyb;->j(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 72
    .line 73
    .line 74
    move-result v12

    .line 75
    const-string v13, "state"

    .line 76
    .line 77
    invoke-static {v4, v13}, Lyb;->j(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 78
    .line 79
    .line 80
    move-result v13

    .line 81
    const-string v14, "worker_class_name"

    .line 82
    .line 83
    invoke-static {v4, v14}, Lyb;->j(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 84
    .line 85
    .line 86
    move-result v14

    .line 87
    const-string v15, "input_merger_class_name"

    .line 88
    .line 89
    invoke-static {v4, v15}, Lyb;->j(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 90
    .line 91
    .line 92
    move-result v15

    .line 93
    const-string v1, "input"

    .line 94
    .line 95
    invoke-static {v4, v1}, Lyb;->j(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 96
    .line 97
    .line 98
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 99
    move-object/from16 v16, v2

    .line 100
    .line 101
    :try_start_1
    const-string v2, "output"

    .line 102
    .line 103
    invoke-static {v4, v2}, Lyb;->j(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 104
    .line 105
    .line 106
    move-result v2

    .line 107
    const-string v3, "initial_delay"

    .line 108
    .line 109
    invoke-static {v4, v3}, Lyb;->j(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 110
    .line 111
    .line 112
    move-result v3

    .line 113
    move/from16 v17, v3

    .line 114
    .line 115
    const-string v3, "interval_duration"

    .line 116
    .line 117
    invoke-static {v4, v3}, Lyb;->j(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 118
    .line 119
    .line 120
    move-result v3

    .line 121
    move/from16 v18, v3

    .line 122
    .line 123
    const-string v3, "flex_duration"

    .line 124
    .line 125
    invoke-static {v4, v3}, Lyb;->j(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 126
    .line 127
    .line 128
    move-result v3

    .line 129
    move/from16 v19, v3

    .line 130
    .line 131
    const-string v3, "run_attempt_count"

    .line 132
    .line 133
    invoke-static {v4, v3}, Lyb;->j(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 134
    .line 135
    .line 136
    move-result v3

    .line 137
    move/from16 v20, v3

    .line 138
    .line 139
    const-string v3, "backoff_policy"

    .line 140
    .line 141
    invoke-static {v4, v3}, Lyb;->j(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 142
    .line 143
    .line 144
    move-result v3

    .line 145
    move/from16 v21, v3

    .line 146
    .line 147
    const-string v3, "backoff_delay_duration"

    .line 148
    .line 149
    invoke-static {v4, v3}, Lyb;->j(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 150
    .line 151
    .line 152
    move-result v3

    .line 153
    move/from16 v22, v3

    .line 154
    .line 155
    const-string v3, "period_start_time"

    .line 156
    .line 157
    invoke-static {v4, v3}, Lyb;->j(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 158
    .line 159
    .line 160
    move-result v3

    .line 161
    move/from16 v23, v3

    .line 162
    .line 163
    const-string v3, "minimum_retention_duration"

    .line 164
    .line 165
    invoke-static {v4, v3}, Lyb;->j(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 166
    .line 167
    .line 168
    move-result v3

    .line 169
    move/from16 v24, v3

    .line 170
    .line 171
    const-string v3, "schedule_requested_at"

    .line 172
    .line 173
    invoke-static {v4, v3}, Lyb;->j(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 174
    .line 175
    .line 176
    move-result v3

    .line 177
    move/from16 v25, v3

    .line 178
    .line 179
    const-string v3, "run_in_foreground"

    .line 180
    .line 181
    invoke-static {v4, v3}, Lyb;->j(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 182
    .line 183
    .line 184
    move-result v3

    .line 185
    move/from16 v26, v3

    .line 186
    .line 187
    const-string v3, "out_of_quota_policy"

    .line 188
    .line 189
    invoke-static {v4, v3}, Lyb;->j(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 190
    .line 191
    .line 192
    move-result v3

    .line 193
    move/from16 v27, v3

    .line 194
    .line 195
    new-instance v3, Ljava/util/ArrayList;

    .line 196
    .line 197
    move/from16 v28, v2

    .line 198
    .line 199
    invoke-interface {v4}, Landroid/database/Cursor;->getCount()I

    .line 200
    .line 201
    .line 202
    move-result v2

    .line 203
    invoke-direct {v3, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 204
    .line 205
    .line 206
    :goto_0
    invoke-interface {v4}, Landroid/database/Cursor;->moveToNext()Z

    .line 207
    .line 208
    .line 209
    move-result v2

    .line 210
    if-eqz v2, :cond_5

    .line 211
    .line 212
    invoke-interface {v4, v12}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 213
    .line 214
    .line 215
    move-result-object v2

    .line 216
    move/from16 v29, v12

    .line 217
    .line 218
    invoke-interface {v4, v14}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object v12

    .line 222
    move/from16 v30, v14

    .line 223
    .line 224
    new-instance v14, Lri;

    .line 225
    .line 226
    invoke-direct {v14}, Lri;-><init>()V

    .line 227
    .line 228
    .line 229
    invoke-interface {v4, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 230
    .line 231
    .line 232
    move-result v31

    .line 233
    move/from16 v32, v0

    .line 234
    .line 235
    invoke-static/range {v31 .. v31}, Lwl2;->l(I)I

    .line 236
    .line 237
    .line 238
    move-result v0

    .line 239
    iput v0, v14, Lri;->a:I

    .line 240
    .line 241
    invoke-interface {v4, v5}, Landroid/database/Cursor;->getInt(I)I

    .line 242
    .line 243
    .line 244
    move-result v0

    .line 245
    const/16 v31, 0x1

    .line 246
    .line 247
    if-eqz v0, :cond_0

    .line 248
    .line 249
    move/from16 v0, v31

    .line 250
    .line 251
    goto :goto_1

    .line 252
    :cond_0
    const/4 v0, 0x0

    .line 253
    :goto_1
    iput-boolean v0, v14, Lri;->b:Z

    .line 254
    .line 255
    invoke-interface {v4, v6}, Landroid/database/Cursor;->getInt(I)I

    .line 256
    .line 257
    .line 258
    move-result v0

    .line 259
    if-eqz v0, :cond_1

    .line 260
    .line 261
    move/from16 v0, v31

    .line 262
    .line 263
    goto :goto_2

    .line 264
    :cond_1
    const/4 v0, 0x0

    .line 265
    :goto_2
    iput-boolean v0, v14, Lri;->c:Z

    .line 266
    .line 267
    invoke-interface {v4, v7}, Landroid/database/Cursor;->getInt(I)I

    .line 268
    .line 269
    .line 270
    move-result v0

    .line 271
    if-eqz v0, :cond_2

    .line 272
    .line 273
    move/from16 v0, v31

    .line 274
    .line 275
    goto :goto_3

    .line 276
    :cond_2
    const/4 v0, 0x0

    .line 277
    :goto_3
    iput-boolean v0, v14, Lri;->d:Z

    .line 278
    .line 279
    invoke-interface {v4, v8}, Landroid/database/Cursor;->getInt(I)I

    .line 280
    .line 281
    .line 282
    move-result v0

    .line 283
    if-eqz v0, :cond_3

    .line 284
    .line 285
    move/from16 v0, v31

    .line 286
    .line 287
    goto :goto_4

    .line 288
    :cond_3
    const/4 v0, 0x0

    .line 289
    :goto_4
    iput-boolean v0, v14, Lri;->e:Z

    .line 290
    .line 291
    move v0, v5

    .line 292
    move/from16 v33, v6

    .line 293
    .line 294
    invoke-interface {v4, v9}, Landroid/database/Cursor;->getLong(I)J

    .line 295
    .line 296
    .line 297
    move-result-wide v5

    .line 298
    iput-wide v5, v14, Lri;->f:J

    .line 299
    .line 300
    invoke-interface {v4, v10}, Landroid/database/Cursor;->getLong(I)J

    .line 301
    .line 302
    .line 303
    move-result-wide v5

    .line 304
    iput-wide v5, v14, Lri;->g:J

    .line 305
    .line 306
    invoke-interface {v4, v11}, Landroid/database/Cursor;->getBlob(I)[B

    .line 307
    .line 308
    .line 309
    move-result-object v5

    .line 310
    invoke-static {v5}, Lwl2;->b([B)Lhj;

    .line 311
    .line 312
    .line 313
    move-result-object v5

    .line 314
    iput-object v5, v14, Lri;->h:Lhj;

    .line 315
    .line 316
    new-instance v5, Loa1;

    .line 317
    .line 318
    invoke-direct {v5, v2, v12}, Loa1;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 319
    .line 320
    .line 321
    invoke-interface {v4, v13}, Landroid/database/Cursor;->getInt(I)I

    .line 322
    .line 323
    .line 324
    move-result v2

    .line 325
    invoke-static {v2}, Lwl2;->n(I)I

    .line 326
    .line 327
    .line 328
    move-result v2

    .line 329
    iput v2, v5, Loa1;->b:I

    .line 330
    .line 331
    invoke-interface {v4, v15}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 332
    .line 333
    .line 334
    move-result-object v2

    .line 335
    iput-object v2, v5, Loa1;->d:Ljava/lang/String;

    .line 336
    .line 337
    invoke-interface {v4, v1}, Landroid/database/Cursor;->getBlob(I)[B

    .line 338
    .line 339
    .line 340
    move-result-object v2

    .line 341
    invoke-static {v2}, Lim;->a([B)Lim;

    .line 342
    .line 343
    .line 344
    move-result-object v2

    .line 345
    iput-object v2, v5, Loa1;->e:Lim;

    .line 346
    .line 347
    move/from16 v2, v28

    .line 348
    .line 349
    invoke-interface {v4, v2}, Landroid/database/Cursor;->getBlob(I)[B

    .line 350
    .line 351
    .line 352
    move-result-object v6

    .line 353
    invoke-static {v6}, Lim;->a([B)Lim;

    .line 354
    .line 355
    .line 356
    move-result-object v6

    .line 357
    iput-object v6, v5, Loa1;->f:Lim;

    .line 358
    .line 359
    move v12, v1

    .line 360
    move/from16 v6, v17

    .line 361
    .line 362
    move/from16 v17, v0

    .line 363
    .line 364
    invoke-interface {v4, v6}, Landroid/database/Cursor;->getLong(I)J

    .line 365
    .line 366
    .line 367
    move-result-wide v0

    .line 368
    iput-wide v0, v5, Loa1;->g:J

    .line 369
    .line 370
    move/from16 v28, v2

    .line 371
    .line 372
    move/from16 v0, v18

    .line 373
    .line 374
    invoke-interface {v4, v0}, Landroid/database/Cursor;->getLong(I)J

    .line 375
    .line 376
    .line 377
    move-result-wide v1

    .line 378
    iput-wide v1, v5, Loa1;->h:J

    .line 379
    .line 380
    move/from16 v18, v6

    .line 381
    .line 382
    move v2, v7

    .line 383
    move/from16 v1, v19

    .line 384
    .line 385
    invoke-interface {v4, v1}, Landroid/database/Cursor;->getLong(I)J

    .line 386
    .line 387
    .line 388
    move-result-wide v6

    .line 389
    iput-wide v6, v5, Loa1;->i:J

    .line 390
    .line 391
    move/from16 v6, v20

    .line 392
    .line 393
    invoke-interface {v4, v6}, Landroid/database/Cursor;->getInt(I)I

    .line 394
    .line 395
    .line 396
    move-result v7

    .line 397
    iput v7, v5, Loa1;->k:I

    .line 398
    .line 399
    move/from16 v7, v21

    .line 400
    .line 401
    invoke-interface {v4, v7}, Landroid/database/Cursor;->getInt(I)I

    .line 402
    .line 403
    .line 404
    move-result v19

    .line 405
    move/from16 v20, v0

    .line 406
    .line 407
    invoke-static/range {v19 .. v19}, Lwl2;->k(I)I

    .line 408
    .line 409
    .line 410
    move-result v0

    .line 411
    iput v0, v5, Loa1;->l:I

    .line 412
    .line 413
    move/from16 v19, v1

    .line 414
    .line 415
    move/from16 v21, v2

    .line 416
    .line 417
    move/from16 v0, v22

    .line 418
    .line 419
    invoke-interface {v4, v0}, Landroid/database/Cursor;->getLong(I)J

    .line 420
    .line 421
    .line 422
    move-result-wide v1

    .line 423
    iput-wide v1, v5, Loa1;->m:J

    .line 424
    .line 425
    move v2, v6

    .line 426
    move/from16 v22, v7

    .line 427
    .line 428
    move/from16 v1, v23

    .line 429
    .line 430
    invoke-interface {v4, v1}, Landroid/database/Cursor;->getLong(I)J

    .line 431
    .line 432
    .line 433
    move-result-wide v6

    .line 434
    iput-wide v6, v5, Loa1;->n:J

    .line 435
    .line 436
    move v7, v0

    .line 437
    move/from16 v23, v1

    .line 438
    .line 439
    move/from16 v6, v24

    .line 440
    .line 441
    invoke-interface {v4, v6}, Landroid/database/Cursor;->getLong(I)J

    .line 442
    .line 443
    .line 444
    move-result-wide v0

    .line 445
    iput-wide v0, v5, Loa1;->o:J

    .line 446
    .line 447
    move/from16 v24, v2

    .line 448
    .line 449
    move/from16 v0, v25

    .line 450
    .line 451
    invoke-interface {v4, v0}, Landroid/database/Cursor;->getLong(I)J

    .line 452
    .line 453
    .line 454
    move-result-wide v1

    .line 455
    iput-wide v1, v5, Loa1;->p:J

    .line 456
    .line 457
    move/from16 v1, v26

    .line 458
    .line 459
    invoke-interface {v4, v1}, Landroid/database/Cursor;->getInt(I)I

    .line 460
    .line 461
    .line 462
    move-result v2

    .line 463
    if-eqz v2, :cond_4

    .line 464
    .line 465
    move/from16 v2, v31

    .line 466
    .line 467
    goto :goto_5

    .line 468
    :cond_4
    const/4 v2, 0x0

    .line 469
    :goto_5
    iput-boolean v2, v5, Loa1;->q:Z

    .line 470
    .line 471
    move/from16 v2, v27

    .line 472
    .line 473
    invoke-interface {v4, v2}, Landroid/database/Cursor;->getInt(I)I

    .line 474
    .line 475
    .line 476
    move-result v25

    .line 477
    move/from16 v26, v0

    .line 478
    .line 479
    invoke-static/range {v25 .. v25}, Lwl2;->m(I)I

    .line 480
    .line 481
    .line 482
    move-result v0

    .line 483
    iput v0, v5, Loa1;->r:I

    .line 484
    .line 485
    iput-object v14, v5, Loa1;->j:Lri;

    .line 486
    .line 487
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 488
    .line 489
    .line 490
    move/from16 v0, v22

    .line 491
    .line 492
    move/from16 v22, v7

    .line 493
    .line 494
    move/from16 v7, v21

    .line 495
    .line 496
    move/from16 v21, v0

    .line 497
    .line 498
    move/from16 v27, v2

    .line 499
    .line 500
    move/from16 v5, v17

    .line 501
    .line 502
    move/from16 v17, v18

    .line 503
    .line 504
    move/from16 v18, v20

    .line 505
    .line 506
    move/from16 v20, v24

    .line 507
    .line 508
    move/from16 v25, v26

    .line 509
    .line 510
    move/from16 v14, v30

    .line 511
    .line 512
    move/from16 v0, v32

    .line 513
    .line 514
    move/from16 v26, v1

    .line 515
    .line 516
    move/from16 v24, v6

    .line 517
    .line 518
    move v1, v12

    .line 519
    move/from16 v12, v29

    .line 520
    .line 521
    move/from16 v6, v33

    .line 522
    .line 523
    goto/16 :goto_0

    .line 524
    .line 525
    :catchall_0
    move-exception v0

    .line 526
    goto :goto_6

    .line 527
    :cond_5
    invoke-interface {v4}, Landroid/database/Cursor;->close()V

    .line 528
    .line 529
    .line 530
    invoke-virtual/range {v16 .. v16}, Lrq0;->k()V

    .line 531
    .line 532
    .line 533
    return-object v3

    .line 534
    :catchall_1
    move-exception v0

    .line 535
    move-object/from16 v16, v2

    .line 536
    .line 537
    :goto_6
    invoke-interface {v4}, Landroid/database/Cursor;->close()V

    .line 538
    .line 539
    .line 540
    invoke-virtual/range {v16 .. v16}, Lrq0;->k()V

    .line 541
    .line 542
    .line 543
    throw v0
.end method

.method public d()Ljava/util/ArrayList;
    .locals 34

    .line 1
    const-string v0, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at<>-1"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {v0, v1}, Lrq0;->f(Ljava/lang/String;I)Lrq0;

    .line 5
    .line 6
    .line 7
    move-result-object v2

    .line 8
    move-object/from16 v3, p0

    .line 9
    .line 10
    iget-object v0, v3, Lh2;->a:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Landroidx/work/impl/WorkDatabase_Impl;

    .line 13
    .line 14
    invoke-virtual {v0}, Lpq0;->b()V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v2}, Lpq0;->g(Llz0;)Landroid/database/Cursor;

    .line 18
    .line 19
    .line 20
    move-result-object v4

    .line 21
    :try_start_0
    const-string v0, "required_network_type"

    .line 22
    .line 23
    invoke-static {v4, v0}, Lyb;->j(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    const-string v5, "requires_charging"

    .line 28
    .line 29
    invoke-static {v4, v5}, Lyb;->j(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 30
    .line 31
    .line 32
    move-result v5

    .line 33
    const-string v6, "requires_device_idle"

    .line 34
    .line 35
    invoke-static {v4, v6}, Lyb;->j(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 36
    .line 37
    .line 38
    move-result v6

    .line 39
    const-string v7, "requires_battery_not_low"

    .line 40
    .line 41
    invoke-static {v4, v7}, Lyb;->j(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 42
    .line 43
    .line 44
    move-result v7

    .line 45
    const-string v8, "requires_storage_not_low"

    .line 46
    .line 47
    invoke-static {v4, v8}, Lyb;->j(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 48
    .line 49
    .line 50
    move-result v8

    .line 51
    const-string v9, "trigger_content_update_delay"

    .line 52
    .line 53
    invoke-static {v4, v9}, Lyb;->j(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 54
    .line 55
    .line 56
    move-result v9

    .line 57
    const-string v10, "trigger_max_content_delay"

    .line 58
    .line 59
    invoke-static {v4, v10}, Lyb;->j(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 60
    .line 61
    .line 62
    move-result v10

    .line 63
    const-string v11, "content_uri_triggers"

    .line 64
    .line 65
    invoke-static {v4, v11}, Lyb;->j(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 66
    .line 67
    .line 68
    move-result v11

    .line 69
    const-string v12, "id"

    .line 70
    .line 71
    invoke-static {v4, v12}, Lyb;->j(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 72
    .line 73
    .line 74
    move-result v12

    .line 75
    const-string v13, "state"

    .line 76
    .line 77
    invoke-static {v4, v13}, Lyb;->j(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 78
    .line 79
    .line 80
    move-result v13

    .line 81
    const-string v14, "worker_class_name"

    .line 82
    .line 83
    invoke-static {v4, v14}, Lyb;->j(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 84
    .line 85
    .line 86
    move-result v14

    .line 87
    const-string v15, "input_merger_class_name"

    .line 88
    .line 89
    invoke-static {v4, v15}, Lyb;->j(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 90
    .line 91
    .line 92
    move-result v15

    .line 93
    const-string v1, "input"

    .line 94
    .line 95
    invoke-static {v4, v1}, Lyb;->j(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 96
    .line 97
    .line 98
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 99
    move-object/from16 v16, v2

    .line 100
    .line 101
    :try_start_1
    const-string v2, "output"

    .line 102
    .line 103
    invoke-static {v4, v2}, Lyb;->j(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 104
    .line 105
    .line 106
    move-result v2

    .line 107
    const-string v3, "initial_delay"

    .line 108
    .line 109
    invoke-static {v4, v3}, Lyb;->j(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 110
    .line 111
    .line 112
    move-result v3

    .line 113
    move/from16 v17, v3

    .line 114
    .line 115
    const-string v3, "interval_duration"

    .line 116
    .line 117
    invoke-static {v4, v3}, Lyb;->j(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 118
    .line 119
    .line 120
    move-result v3

    .line 121
    move/from16 v18, v3

    .line 122
    .line 123
    const-string v3, "flex_duration"

    .line 124
    .line 125
    invoke-static {v4, v3}, Lyb;->j(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 126
    .line 127
    .line 128
    move-result v3

    .line 129
    move/from16 v19, v3

    .line 130
    .line 131
    const-string v3, "run_attempt_count"

    .line 132
    .line 133
    invoke-static {v4, v3}, Lyb;->j(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 134
    .line 135
    .line 136
    move-result v3

    .line 137
    move/from16 v20, v3

    .line 138
    .line 139
    const-string v3, "backoff_policy"

    .line 140
    .line 141
    invoke-static {v4, v3}, Lyb;->j(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 142
    .line 143
    .line 144
    move-result v3

    .line 145
    move/from16 v21, v3

    .line 146
    .line 147
    const-string v3, "backoff_delay_duration"

    .line 148
    .line 149
    invoke-static {v4, v3}, Lyb;->j(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 150
    .line 151
    .line 152
    move-result v3

    .line 153
    move/from16 v22, v3

    .line 154
    .line 155
    const-string v3, "period_start_time"

    .line 156
    .line 157
    invoke-static {v4, v3}, Lyb;->j(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 158
    .line 159
    .line 160
    move-result v3

    .line 161
    move/from16 v23, v3

    .line 162
    .line 163
    const-string v3, "minimum_retention_duration"

    .line 164
    .line 165
    invoke-static {v4, v3}, Lyb;->j(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 166
    .line 167
    .line 168
    move-result v3

    .line 169
    move/from16 v24, v3

    .line 170
    .line 171
    const-string v3, "schedule_requested_at"

    .line 172
    .line 173
    invoke-static {v4, v3}, Lyb;->j(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 174
    .line 175
    .line 176
    move-result v3

    .line 177
    move/from16 v25, v3

    .line 178
    .line 179
    const-string v3, "run_in_foreground"

    .line 180
    .line 181
    invoke-static {v4, v3}, Lyb;->j(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 182
    .line 183
    .line 184
    move-result v3

    .line 185
    move/from16 v26, v3

    .line 186
    .line 187
    const-string v3, "out_of_quota_policy"

    .line 188
    .line 189
    invoke-static {v4, v3}, Lyb;->j(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 190
    .line 191
    .line 192
    move-result v3

    .line 193
    move/from16 v27, v3

    .line 194
    .line 195
    new-instance v3, Ljava/util/ArrayList;

    .line 196
    .line 197
    move/from16 v28, v2

    .line 198
    .line 199
    invoke-interface {v4}, Landroid/database/Cursor;->getCount()I

    .line 200
    .line 201
    .line 202
    move-result v2

    .line 203
    invoke-direct {v3, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 204
    .line 205
    .line 206
    :goto_0
    invoke-interface {v4}, Landroid/database/Cursor;->moveToNext()Z

    .line 207
    .line 208
    .line 209
    move-result v2

    .line 210
    if-eqz v2, :cond_5

    .line 211
    .line 212
    invoke-interface {v4, v12}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 213
    .line 214
    .line 215
    move-result-object v2

    .line 216
    move/from16 v29, v12

    .line 217
    .line 218
    invoke-interface {v4, v14}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object v12

    .line 222
    move/from16 v30, v14

    .line 223
    .line 224
    new-instance v14, Lri;

    .line 225
    .line 226
    invoke-direct {v14}, Lri;-><init>()V

    .line 227
    .line 228
    .line 229
    invoke-interface {v4, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 230
    .line 231
    .line 232
    move-result v31

    .line 233
    move/from16 v32, v0

    .line 234
    .line 235
    invoke-static/range {v31 .. v31}, Lwl2;->l(I)I

    .line 236
    .line 237
    .line 238
    move-result v0

    .line 239
    iput v0, v14, Lri;->a:I

    .line 240
    .line 241
    invoke-interface {v4, v5}, Landroid/database/Cursor;->getInt(I)I

    .line 242
    .line 243
    .line 244
    move-result v0

    .line 245
    const/16 v31, 0x1

    .line 246
    .line 247
    if-eqz v0, :cond_0

    .line 248
    .line 249
    move/from16 v0, v31

    .line 250
    .line 251
    goto :goto_1

    .line 252
    :cond_0
    const/4 v0, 0x0

    .line 253
    :goto_1
    iput-boolean v0, v14, Lri;->b:Z

    .line 254
    .line 255
    invoke-interface {v4, v6}, Landroid/database/Cursor;->getInt(I)I

    .line 256
    .line 257
    .line 258
    move-result v0

    .line 259
    if-eqz v0, :cond_1

    .line 260
    .line 261
    move/from16 v0, v31

    .line 262
    .line 263
    goto :goto_2

    .line 264
    :cond_1
    const/4 v0, 0x0

    .line 265
    :goto_2
    iput-boolean v0, v14, Lri;->c:Z

    .line 266
    .line 267
    invoke-interface {v4, v7}, Landroid/database/Cursor;->getInt(I)I

    .line 268
    .line 269
    .line 270
    move-result v0

    .line 271
    if-eqz v0, :cond_2

    .line 272
    .line 273
    move/from16 v0, v31

    .line 274
    .line 275
    goto :goto_3

    .line 276
    :cond_2
    const/4 v0, 0x0

    .line 277
    :goto_3
    iput-boolean v0, v14, Lri;->d:Z

    .line 278
    .line 279
    invoke-interface {v4, v8}, Landroid/database/Cursor;->getInt(I)I

    .line 280
    .line 281
    .line 282
    move-result v0

    .line 283
    if-eqz v0, :cond_3

    .line 284
    .line 285
    move/from16 v0, v31

    .line 286
    .line 287
    goto :goto_4

    .line 288
    :cond_3
    const/4 v0, 0x0

    .line 289
    :goto_4
    iput-boolean v0, v14, Lri;->e:Z

    .line 290
    .line 291
    move v0, v5

    .line 292
    move/from16 v33, v6

    .line 293
    .line 294
    invoke-interface {v4, v9}, Landroid/database/Cursor;->getLong(I)J

    .line 295
    .line 296
    .line 297
    move-result-wide v5

    .line 298
    iput-wide v5, v14, Lri;->f:J

    .line 299
    .line 300
    invoke-interface {v4, v10}, Landroid/database/Cursor;->getLong(I)J

    .line 301
    .line 302
    .line 303
    move-result-wide v5

    .line 304
    iput-wide v5, v14, Lri;->g:J

    .line 305
    .line 306
    invoke-interface {v4, v11}, Landroid/database/Cursor;->getBlob(I)[B

    .line 307
    .line 308
    .line 309
    move-result-object v5

    .line 310
    invoke-static {v5}, Lwl2;->b([B)Lhj;

    .line 311
    .line 312
    .line 313
    move-result-object v5

    .line 314
    iput-object v5, v14, Lri;->h:Lhj;

    .line 315
    .line 316
    new-instance v5, Loa1;

    .line 317
    .line 318
    invoke-direct {v5, v2, v12}, Loa1;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 319
    .line 320
    .line 321
    invoke-interface {v4, v13}, Landroid/database/Cursor;->getInt(I)I

    .line 322
    .line 323
    .line 324
    move-result v2

    .line 325
    invoke-static {v2}, Lwl2;->n(I)I

    .line 326
    .line 327
    .line 328
    move-result v2

    .line 329
    iput v2, v5, Loa1;->b:I

    .line 330
    .line 331
    invoke-interface {v4, v15}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 332
    .line 333
    .line 334
    move-result-object v2

    .line 335
    iput-object v2, v5, Loa1;->d:Ljava/lang/String;

    .line 336
    .line 337
    invoke-interface {v4, v1}, Landroid/database/Cursor;->getBlob(I)[B

    .line 338
    .line 339
    .line 340
    move-result-object v2

    .line 341
    invoke-static {v2}, Lim;->a([B)Lim;

    .line 342
    .line 343
    .line 344
    move-result-object v2

    .line 345
    iput-object v2, v5, Loa1;->e:Lim;

    .line 346
    .line 347
    move/from16 v2, v28

    .line 348
    .line 349
    invoke-interface {v4, v2}, Landroid/database/Cursor;->getBlob(I)[B

    .line 350
    .line 351
    .line 352
    move-result-object v6

    .line 353
    invoke-static {v6}, Lim;->a([B)Lim;

    .line 354
    .line 355
    .line 356
    move-result-object v6

    .line 357
    iput-object v6, v5, Loa1;->f:Lim;

    .line 358
    .line 359
    move v12, v1

    .line 360
    move/from16 v6, v17

    .line 361
    .line 362
    move/from16 v17, v0

    .line 363
    .line 364
    invoke-interface {v4, v6}, Landroid/database/Cursor;->getLong(I)J

    .line 365
    .line 366
    .line 367
    move-result-wide v0

    .line 368
    iput-wide v0, v5, Loa1;->g:J

    .line 369
    .line 370
    move/from16 v28, v2

    .line 371
    .line 372
    move/from16 v0, v18

    .line 373
    .line 374
    invoke-interface {v4, v0}, Landroid/database/Cursor;->getLong(I)J

    .line 375
    .line 376
    .line 377
    move-result-wide v1

    .line 378
    iput-wide v1, v5, Loa1;->h:J

    .line 379
    .line 380
    move/from16 v18, v6

    .line 381
    .line 382
    move v2, v7

    .line 383
    move/from16 v1, v19

    .line 384
    .line 385
    invoke-interface {v4, v1}, Landroid/database/Cursor;->getLong(I)J

    .line 386
    .line 387
    .line 388
    move-result-wide v6

    .line 389
    iput-wide v6, v5, Loa1;->i:J

    .line 390
    .line 391
    move/from16 v6, v20

    .line 392
    .line 393
    invoke-interface {v4, v6}, Landroid/database/Cursor;->getInt(I)I

    .line 394
    .line 395
    .line 396
    move-result v7

    .line 397
    iput v7, v5, Loa1;->k:I

    .line 398
    .line 399
    move/from16 v7, v21

    .line 400
    .line 401
    invoke-interface {v4, v7}, Landroid/database/Cursor;->getInt(I)I

    .line 402
    .line 403
    .line 404
    move-result v19

    .line 405
    move/from16 v20, v0

    .line 406
    .line 407
    invoke-static/range {v19 .. v19}, Lwl2;->k(I)I

    .line 408
    .line 409
    .line 410
    move-result v0

    .line 411
    iput v0, v5, Loa1;->l:I

    .line 412
    .line 413
    move/from16 v19, v1

    .line 414
    .line 415
    move/from16 v21, v2

    .line 416
    .line 417
    move/from16 v0, v22

    .line 418
    .line 419
    invoke-interface {v4, v0}, Landroid/database/Cursor;->getLong(I)J

    .line 420
    .line 421
    .line 422
    move-result-wide v1

    .line 423
    iput-wide v1, v5, Loa1;->m:J

    .line 424
    .line 425
    move v2, v6

    .line 426
    move/from16 v22, v7

    .line 427
    .line 428
    move/from16 v1, v23

    .line 429
    .line 430
    invoke-interface {v4, v1}, Landroid/database/Cursor;->getLong(I)J

    .line 431
    .line 432
    .line 433
    move-result-wide v6

    .line 434
    iput-wide v6, v5, Loa1;->n:J

    .line 435
    .line 436
    move v7, v0

    .line 437
    move/from16 v23, v1

    .line 438
    .line 439
    move/from16 v6, v24

    .line 440
    .line 441
    invoke-interface {v4, v6}, Landroid/database/Cursor;->getLong(I)J

    .line 442
    .line 443
    .line 444
    move-result-wide v0

    .line 445
    iput-wide v0, v5, Loa1;->o:J

    .line 446
    .line 447
    move/from16 v24, v2

    .line 448
    .line 449
    move/from16 v0, v25

    .line 450
    .line 451
    invoke-interface {v4, v0}, Landroid/database/Cursor;->getLong(I)J

    .line 452
    .line 453
    .line 454
    move-result-wide v1

    .line 455
    iput-wide v1, v5, Loa1;->p:J

    .line 456
    .line 457
    move/from16 v1, v26

    .line 458
    .line 459
    invoke-interface {v4, v1}, Landroid/database/Cursor;->getInt(I)I

    .line 460
    .line 461
    .line 462
    move-result v2

    .line 463
    if-eqz v2, :cond_4

    .line 464
    .line 465
    move/from16 v2, v31

    .line 466
    .line 467
    goto :goto_5

    .line 468
    :cond_4
    const/4 v2, 0x0

    .line 469
    :goto_5
    iput-boolean v2, v5, Loa1;->q:Z

    .line 470
    .line 471
    move/from16 v2, v27

    .line 472
    .line 473
    invoke-interface {v4, v2}, Landroid/database/Cursor;->getInt(I)I

    .line 474
    .line 475
    .line 476
    move-result v25

    .line 477
    move/from16 v26, v0

    .line 478
    .line 479
    invoke-static/range {v25 .. v25}, Lwl2;->m(I)I

    .line 480
    .line 481
    .line 482
    move-result v0

    .line 483
    iput v0, v5, Loa1;->r:I

    .line 484
    .line 485
    iput-object v14, v5, Loa1;->j:Lri;

    .line 486
    .line 487
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 488
    .line 489
    .line 490
    move/from16 v0, v22

    .line 491
    .line 492
    move/from16 v22, v7

    .line 493
    .line 494
    move/from16 v7, v21

    .line 495
    .line 496
    move/from16 v21, v0

    .line 497
    .line 498
    move/from16 v27, v2

    .line 499
    .line 500
    move/from16 v5, v17

    .line 501
    .line 502
    move/from16 v17, v18

    .line 503
    .line 504
    move/from16 v18, v20

    .line 505
    .line 506
    move/from16 v20, v24

    .line 507
    .line 508
    move/from16 v25, v26

    .line 509
    .line 510
    move/from16 v14, v30

    .line 511
    .line 512
    move/from16 v0, v32

    .line 513
    .line 514
    move/from16 v26, v1

    .line 515
    .line 516
    move/from16 v24, v6

    .line 517
    .line 518
    move v1, v12

    .line 519
    move/from16 v12, v29

    .line 520
    .line 521
    move/from16 v6, v33

    .line 522
    .line 523
    goto/16 :goto_0

    .line 524
    .line 525
    :catchall_0
    move-exception v0

    .line 526
    goto :goto_6

    .line 527
    :cond_5
    invoke-interface {v4}, Landroid/database/Cursor;->close()V

    .line 528
    .line 529
    .line 530
    invoke-virtual/range {v16 .. v16}, Lrq0;->k()V

    .line 531
    .line 532
    .line 533
    return-object v3

    .line 534
    :catchall_1
    move-exception v0

    .line 535
    move-object/from16 v16, v2

    .line 536
    .line 537
    :goto_6
    invoke-interface {v4}, Landroid/database/Cursor;->close()V

    .line 538
    .line 539
    .line 540
    invoke-virtual/range {v16 .. v16}, Lrq0;->k()V

    .line 541
    .line 542
    .line 543
    throw v0
.end method

.method public e(Ljava/lang/String;)I
    .locals 3

    .line 1
    iget-object v0, p0, Lh2;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroidx/work/impl/WorkDatabase_Impl;

    .line 4
    .line 5
    const-string v1, "SELECT state FROM workspec WHERE id=?"

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    invoke-static {v1, v2}, Lrq0;->f(Ljava/lang/String;I)Lrq0;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    if-nez p1, :cond_0

    .line 13
    .line 14
    invoke-virtual {v1, v2}, Lrq0;->h(I)V

    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-virtual {v1, p1, v2}, Lrq0;->i(Ljava/lang/String;I)V

    .line 19
    .line 20
    .line 21
    :goto_0
    invoke-virtual {v0}, Lpq0;->b()V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, v1}, Lpq0;->g(Llz0;)Landroid/database/Cursor;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    :try_start_0
    invoke-interface {p1}, Landroid/database/Cursor;->moveToFirst()Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    const/4 v2, 0x0

    .line 33
    if-eqz v0, :cond_1

    .line 34
    .line 35
    invoke-interface {p1, v2}, Landroid/database/Cursor;->getInt(I)I

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    invoke-static {v0}, Lwl2;->n(I)I

    .line 40
    .line 41
    .line 42
    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    goto :goto_1

    .line 44
    :catchall_0
    move-exception v0

    .line 45
    goto :goto_2

    .line 46
    :cond_1
    :goto_1
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v1}, Lrq0;->k()V

    .line 50
    .line 51
    .line 52
    return v2

    .line 53
    :goto_2
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v1}, Lrq0;->k()V

    .line 57
    .line 58
    .line 59
    throw v0
.end method

.method public f()Ljava/util/ArrayList;
    .locals 4

    .line 1
    iget-object v0, p0, Lh2;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroidx/work/impl/WorkDatabase_Impl;

    .line 4
    .line 5
    const-string v1, "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)"

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    invoke-static {v1, v2}, Lrq0;->f(Ljava/lang/String;I)Lrq0;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v1, v2}, Lrq0;->h(I)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Lpq0;->b()V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v1}, Lpq0;->g(Llz0;)Landroid/database/Cursor;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    :try_start_0
    new-instance v2, Ljava/util/ArrayList;

    .line 23
    .line 24
    invoke-interface {v0}, Landroid/database/Cursor;->getCount()I

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 29
    .line 30
    .line 31
    :goto_0
    invoke-interface {v0}, Landroid/database/Cursor;->moveToNext()Z

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    if-eqz v3, :cond_0

    .line 36
    .line 37
    const/4 v3, 0x0

    .line 38
    invoke-interface {v0, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :catchall_0
    move-exception v2

    .line 47
    goto :goto_1

    .line 48
    :cond_0
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v1}, Lrq0;->k()V

    .line 52
    .line 53
    .line 54
    return-object v2

    .line 55
    :goto_1
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v1}, Lrq0;->k()V

    .line 59
    .line 60
    .line 61
    throw v2
.end method

.method public g()Ljava/util/ArrayList;
    .locals 4

    .line 1
    iget-object v0, p0, Lh2;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroidx/work/impl/WorkDatabase_Impl;

    .line 4
    .line 5
    const-string v1, "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)"

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    invoke-static {v1, v2}, Lrq0;->f(Ljava/lang/String;I)Lrq0;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    const-string v3, "offline_ping_sender_work"

    .line 13
    .line 14
    invoke-virtual {v1, v3, v2}, Lrq0;->i(Ljava/lang/String;I)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Lpq0;->b()V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v1}, Lpq0;->g(Llz0;)Landroid/database/Cursor;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    :try_start_0
    new-instance v2, Ljava/util/ArrayList;

    .line 25
    .line 26
    invoke-interface {v0}, Landroid/database/Cursor;->getCount()I

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 31
    .line 32
    .line 33
    :goto_0
    invoke-interface {v0}, Landroid/database/Cursor;->moveToNext()Z

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    if-eqz v3, :cond_0

    .line 38
    .line 39
    const/4 v3, 0x0

    .line 40
    invoke-interface {v0, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :catchall_0
    move-exception v2

    .line 49
    goto :goto_1

    .line 50
    :cond_0
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v1}, Lrq0;->k()V

    .line 54
    .line 55
    .line 56
    return-object v2

    .line 57
    :goto_1
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v1}, Lrq0;->k()V

    .line 61
    .line 62
    .line 63
    throw v2
.end method

.method public h(Ljava/lang/String;)Loa1;
    .locals 27

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    iget-object v2, v1, Lh2;->a:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v2, Landroidx/work/impl/WorkDatabase_Impl;

    .line 8
    .line 9
    const-string v3, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE id=?"

    .line 10
    .line 11
    const/4 v4, 0x1

    .line 12
    invoke-static {v3, v4}, Lrq0;->f(Ljava/lang/String;I)Lrq0;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    invoke-virtual {v3, v4}, Lrq0;->h(I)V

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    invoke-virtual {v3, v0, v4}, Lrq0;->i(Ljava/lang/String;I)V

    .line 23
    .line 24
    .line 25
    :goto_0
    invoke-virtual {v2}, Lpq0;->b()V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v2, v3}, Lpq0;->g(Llz0;)Landroid/database/Cursor;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    :try_start_0
    const-string v0, "required_network_type"

    .line 33
    .line 34
    invoke-static {v2, v0}, Lyb;->j(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    const-string v5, "requires_charging"

    .line 39
    .line 40
    invoke-static {v2, v5}, Lyb;->j(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 41
    .line 42
    .line 43
    move-result v5

    .line 44
    const-string v6, "requires_device_idle"

    .line 45
    .line 46
    invoke-static {v2, v6}, Lyb;->j(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 47
    .line 48
    .line 49
    move-result v6

    .line 50
    const-string v7, "requires_battery_not_low"

    .line 51
    .line 52
    invoke-static {v2, v7}, Lyb;->j(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 53
    .line 54
    .line 55
    move-result v7

    .line 56
    const-string v8, "requires_storage_not_low"

    .line 57
    .line 58
    invoke-static {v2, v8}, Lyb;->j(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 59
    .line 60
    .line 61
    move-result v8

    .line 62
    const-string v9, "trigger_content_update_delay"

    .line 63
    .line 64
    invoke-static {v2, v9}, Lyb;->j(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 65
    .line 66
    .line 67
    move-result v9

    .line 68
    const-string v10, "trigger_max_content_delay"

    .line 69
    .line 70
    invoke-static {v2, v10}, Lyb;->j(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 71
    .line 72
    .line 73
    move-result v10

    .line 74
    const-string v11, "content_uri_triggers"

    .line 75
    .line 76
    invoke-static {v2, v11}, Lyb;->j(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 77
    .line 78
    .line 79
    move-result v11

    .line 80
    const-string v12, "id"

    .line 81
    .line 82
    invoke-static {v2, v12}, Lyb;->j(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 83
    .line 84
    .line 85
    move-result v12

    .line 86
    const-string v13, "state"

    .line 87
    .line 88
    invoke-static {v2, v13}, Lyb;->j(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 89
    .line 90
    .line 91
    move-result v13

    .line 92
    const-string v14, "worker_class_name"

    .line 93
    .line 94
    invoke-static {v2, v14}, Lyb;->j(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 95
    .line 96
    .line 97
    move-result v14

    .line 98
    const-string v15, "input_merger_class_name"

    .line 99
    .line 100
    invoke-static {v2, v15}, Lyb;->j(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 101
    .line 102
    .line 103
    move-result v15

    .line 104
    const-string v4, "input"

    .line 105
    .line 106
    invoke-static {v2, v4}, Lyb;->j(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 107
    .line 108
    .line 109
    move-result v4

    .line 110
    const-string v1, "output"

    .line 111
    .line 112
    invoke-static {v2, v1}, Lyb;->j(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 113
    .line 114
    .line 115
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 116
    move-object/from16 v16, v3

    .line 117
    .line 118
    :try_start_1
    const-string v3, "initial_delay"

    .line 119
    .line 120
    invoke-static {v2, v3}, Lyb;->j(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 121
    .line 122
    .line 123
    move-result v3

    .line 124
    move/from16 p1, v3

    .line 125
    .line 126
    const-string v3, "interval_duration"

    .line 127
    .line 128
    invoke-static {v2, v3}, Lyb;->j(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 129
    .line 130
    .line 131
    move-result v3

    .line 132
    move/from16 v17, v3

    .line 133
    .line 134
    const-string v3, "flex_duration"

    .line 135
    .line 136
    invoke-static {v2, v3}, Lyb;->j(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 137
    .line 138
    .line 139
    move-result v3

    .line 140
    move/from16 v18, v3

    .line 141
    .line 142
    const-string v3, "run_attempt_count"

    .line 143
    .line 144
    invoke-static {v2, v3}, Lyb;->j(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 145
    .line 146
    .line 147
    move-result v3

    .line 148
    move/from16 v19, v3

    .line 149
    .line 150
    const-string v3, "backoff_policy"

    .line 151
    .line 152
    invoke-static {v2, v3}, Lyb;->j(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 153
    .line 154
    .line 155
    move-result v3

    .line 156
    move/from16 v20, v3

    .line 157
    .line 158
    const-string v3, "backoff_delay_duration"

    .line 159
    .line 160
    invoke-static {v2, v3}, Lyb;->j(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 161
    .line 162
    .line 163
    move-result v3

    .line 164
    move/from16 v21, v3

    .line 165
    .line 166
    const-string v3, "period_start_time"

    .line 167
    .line 168
    invoke-static {v2, v3}, Lyb;->j(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 169
    .line 170
    .line 171
    move-result v3

    .line 172
    move/from16 v22, v3

    .line 173
    .line 174
    const-string v3, "minimum_retention_duration"

    .line 175
    .line 176
    invoke-static {v2, v3}, Lyb;->j(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 177
    .line 178
    .line 179
    move-result v3

    .line 180
    move/from16 v23, v3

    .line 181
    .line 182
    const-string v3, "schedule_requested_at"

    .line 183
    .line 184
    invoke-static {v2, v3}, Lyb;->j(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 185
    .line 186
    .line 187
    move-result v3

    .line 188
    move/from16 v24, v3

    .line 189
    .line 190
    const-string v3, "run_in_foreground"

    .line 191
    .line 192
    invoke-static {v2, v3}, Lyb;->j(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 193
    .line 194
    .line 195
    move-result v3

    .line 196
    move/from16 v25, v3

    .line 197
    .line 198
    const-string v3, "out_of_quota_policy"

    .line 199
    .line 200
    invoke-static {v2, v3}, Lyb;->j(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 201
    .line 202
    .line 203
    move-result v3

    .line 204
    invoke-interface {v2}, Landroid/database/Cursor;->moveToFirst()Z

    .line 205
    .line 206
    .line 207
    move-result v26

    .line 208
    if-eqz v26, :cond_6

    .line 209
    .line 210
    invoke-interface {v2, v12}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object v12

    .line 214
    invoke-interface {v2, v14}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 215
    .line 216
    .line 217
    move-result-object v14

    .line 218
    move/from16 v26, v3

    .line 219
    .line 220
    new-instance v3, Lri;

    .line 221
    .line 222
    invoke-direct {v3}, Lri;-><init>()V

    .line 223
    .line 224
    .line 225
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 226
    .line 227
    .line 228
    move-result v0

    .line 229
    invoke-static {v0}, Lwl2;->l(I)I

    .line 230
    .line 231
    .line 232
    move-result v0

    .line 233
    iput v0, v3, Lri;->a:I

    .line 234
    .line 235
    invoke-interface {v2, v5}, Landroid/database/Cursor;->getInt(I)I

    .line 236
    .line 237
    .line 238
    move-result v0

    .line 239
    const/4 v5, 0x0

    .line 240
    if-eqz v0, :cond_1

    .line 241
    .line 242
    const/4 v0, 0x1

    .line 243
    goto :goto_1

    .line 244
    :cond_1
    move v0, v5

    .line 245
    :goto_1
    iput-boolean v0, v3, Lri;->b:Z

    .line 246
    .line 247
    invoke-interface {v2, v6}, Landroid/database/Cursor;->getInt(I)I

    .line 248
    .line 249
    .line 250
    move-result v0

    .line 251
    if-eqz v0, :cond_2

    .line 252
    .line 253
    const/4 v0, 0x1

    .line 254
    goto :goto_2

    .line 255
    :cond_2
    move v0, v5

    .line 256
    :goto_2
    iput-boolean v0, v3, Lri;->c:Z

    .line 257
    .line 258
    invoke-interface {v2, v7}, Landroid/database/Cursor;->getInt(I)I

    .line 259
    .line 260
    .line 261
    move-result v0

    .line 262
    if-eqz v0, :cond_3

    .line 263
    .line 264
    const/4 v0, 0x1

    .line 265
    goto :goto_3

    .line 266
    :cond_3
    move v0, v5

    .line 267
    :goto_3
    iput-boolean v0, v3, Lri;->d:Z

    .line 268
    .line 269
    invoke-interface {v2, v8}, Landroid/database/Cursor;->getInt(I)I

    .line 270
    .line 271
    .line 272
    move-result v0

    .line 273
    if-eqz v0, :cond_4

    .line 274
    .line 275
    const/4 v0, 0x1

    .line 276
    goto :goto_4

    .line 277
    :cond_4
    move v0, v5

    .line 278
    :goto_4
    iput-boolean v0, v3, Lri;->e:Z

    .line 279
    .line 280
    invoke-interface {v2, v9}, Landroid/database/Cursor;->getLong(I)J

    .line 281
    .line 282
    .line 283
    move-result-wide v6

    .line 284
    iput-wide v6, v3, Lri;->f:J

    .line 285
    .line 286
    invoke-interface {v2, v10}, Landroid/database/Cursor;->getLong(I)J

    .line 287
    .line 288
    .line 289
    move-result-wide v6

    .line 290
    iput-wide v6, v3, Lri;->g:J

    .line 291
    .line 292
    invoke-interface {v2, v11}, Landroid/database/Cursor;->getBlob(I)[B

    .line 293
    .line 294
    .line 295
    move-result-object v0

    .line 296
    invoke-static {v0}, Lwl2;->b([B)Lhj;

    .line 297
    .line 298
    .line 299
    move-result-object v0

    .line 300
    iput-object v0, v3, Lri;->h:Lhj;

    .line 301
    .line 302
    new-instance v0, Loa1;

    .line 303
    .line 304
    invoke-direct {v0, v12, v14}, Loa1;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 305
    .line 306
    .line 307
    invoke-interface {v2, v13}, Landroid/database/Cursor;->getInt(I)I

    .line 308
    .line 309
    .line 310
    move-result v6

    .line 311
    invoke-static {v6}, Lwl2;->n(I)I

    .line 312
    .line 313
    .line 314
    move-result v6

    .line 315
    iput v6, v0, Loa1;->b:I

    .line 316
    .line 317
    invoke-interface {v2, v15}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 318
    .line 319
    .line 320
    move-result-object v6

    .line 321
    iput-object v6, v0, Loa1;->d:Ljava/lang/String;

    .line 322
    .line 323
    invoke-interface {v2, v4}, Landroid/database/Cursor;->getBlob(I)[B

    .line 324
    .line 325
    .line 326
    move-result-object v4

    .line 327
    invoke-static {v4}, Lim;->a([B)Lim;

    .line 328
    .line 329
    .line 330
    move-result-object v4

    .line 331
    iput-object v4, v0, Loa1;->e:Lim;

    .line 332
    .line 333
    invoke-interface {v2, v1}, Landroid/database/Cursor;->getBlob(I)[B

    .line 334
    .line 335
    .line 336
    move-result-object v1

    .line 337
    invoke-static {v1}, Lim;->a([B)Lim;

    .line 338
    .line 339
    .line 340
    move-result-object v1

    .line 341
    iput-object v1, v0, Loa1;->f:Lim;

    .line 342
    .line 343
    move/from16 v1, p1

    .line 344
    .line 345
    invoke-interface {v2, v1}, Landroid/database/Cursor;->getLong(I)J

    .line 346
    .line 347
    .line 348
    move-result-wide v6

    .line 349
    iput-wide v6, v0, Loa1;->g:J

    .line 350
    .line 351
    move/from16 v1, v17

    .line 352
    .line 353
    invoke-interface {v2, v1}, Landroid/database/Cursor;->getLong(I)J

    .line 354
    .line 355
    .line 356
    move-result-wide v6

    .line 357
    iput-wide v6, v0, Loa1;->h:J

    .line 358
    .line 359
    move/from16 v1, v18

    .line 360
    .line 361
    invoke-interface {v2, v1}, Landroid/database/Cursor;->getLong(I)J

    .line 362
    .line 363
    .line 364
    move-result-wide v6

    .line 365
    iput-wide v6, v0, Loa1;->i:J

    .line 366
    .line 367
    move/from16 v1, v19

    .line 368
    .line 369
    invoke-interface {v2, v1}, Landroid/database/Cursor;->getInt(I)I

    .line 370
    .line 371
    .line 372
    move-result v1

    .line 373
    iput v1, v0, Loa1;->k:I

    .line 374
    .line 375
    move/from16 v1, v20

    .line 376
    .line 377
    invoke-interface {v2, v1}, Landroid/database/Cursor;->getInt(I)I

    .line 378
    .line 379
    .line 380
    move-result v1

    .line 381
    invoke-static {v1}, Lwl2;->k(I)I

    .line 382
    .line 383
    .line 384
    move-result v1

    .line 385
    iput v1, v0, Loa1;->l:I

    .line 386
    .line 387
    move/from16 v1, v21

    .line 388
    .line 389
    invoke-interface {v2, v1}, Landroid/database/Cursor;->getLong(I)J

    .line 390
    .line 391
    .line 392
    move-result-wide v6

    .line 393
    iput-wide v6, v0, Loa1;->m:J

    .line 394
    .line 395
    move/from16 v1, v22

    .line 396
    .line 397
    invoke-interface {v2, v1}, Landroid/database/Cursor;->getLong(I)J

    .line 398
    .line 399
    .line 400
    move-result-wide v6

    .line 401
    iput-wide v6, v0, Loa1;->n:J

    .line 402
    .line 403
    move/from16 v1, v23

    .line 404
    .line 405
    invoke-interface {v2, v1}, Landroid/database/Cursor;->getLong(I)J

    .line 406
    .line 407
    .line 408
    move-result-wide v6

    .line 409
    iput-wide v6, v0, Loa1;->o:J

    .line 410
    .line 411
    move/from16 v1, v24

    .line 412
    .line 413
    invoke-interface {v2, v1}, Landroid/database/Cursor;->getLong(I)J

    .line 414
    .line 415
    .line 416
    move-result-wide v6

    .line 417
    iput-wide v6, v0, Loa1;->p:J

    .line 418
    .line 419
    move/from16 v1, v25

    .line 420
    .line 421
    invoke-interface {v2, v1}, Landroid/database/Cursor;->getInt(I)I

    .line 422
    .line 423
    .line 424
    move-result v1

    .line 425
    if-eqz v1, :cond_5

    .line 426
    .line 427
    const/4 v4, 0x1

    .line 428
    goto :goto_5

    .line 429
    :cond_5
    move v4, v5

    .line 430
    :goto_5
    iput-boolean v4, v0, Loa1;->q:Z

    .line 431
    .line 432
    move/from16 v1, v26

    .line 433
    .line 434
    invoke-interface {v2, v1}, Landroid/database/Cursor;->getInt(I)I

    .line 435
    .line 436
    .line 437
    move-result v1

    .line 438
    invoke-static {v1}, Lwl2;->m(I)I

    .line 439
    .line 440
    .line 441
    move-result v1

    .line 442
    iput v1, v0, Loa1;->r:I

    .line 443
    .line 444
    iput-object v3, v0, Loa1;->j:Lri;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 445
    .line 446
    goto :goto_6

    .line 447
    :catchall_0
    move-exception v0

    .line 448
    goto :goto_7

    .line 449
    :cond_6
    const/4 v0, 0x0

    .line 450
    :goto_6
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 451
    .line 452
    .line 453
    invoke-virtual/range {v16 .. v16}, Lrq0;->k()V

    .line 454
    .line 455
    .line 456
    return-object v0

    .line 457
    :catchall_1
    move-exception v0

    .line 458
    move-object/from16 v16, v3

    .line 459
    .line 460
    :goto_7
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 461
    .line 462
    .line 463
    invoke-virtual/range {v16 .. v16}, Lrq0;->k()V

    .line 464
    .line 465
    .line 466
    throw v0
.end method

.method public i(Ljava/lang/String;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lh2;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroidx/work/impl/WorkDatabase_Impl;

    .line 4
    .line 5
    invoke-virtual {v0}, Lpq0;->b()V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lh2;->f:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Ltz0;

    .line 11
    .line 12
    invoke-virtual {v1}, Lsv0;->a()Lpx;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    const/4 v3, 0x1

    .line 17
    if-nez p1, :cond_0

    .line 18
    .line 19
    invoke-virtual {v2, v3}, Llx;->g(I)V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    invoke-virtual {v2, p1, v3}, Llx;->h(Ljava/lang/String;I)V

    .line 24
    .line 25
    .line 26
    :goto_0
    invoke-virtual {v0}, Lpq0;->c()V

    .line 27
    .line 28
    .line 29
    :try_start_0
    iget-object p1, v2, Lpx;->i:Landroid/database/sqlite/SQLiteStatement;

    .line 30
    .line 31
    invoke-virtual {p1}, Landroid/database/sqlite/SQLiteStatement;->executeUpdateDelete()I

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0}, Lpq0;->h()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0}, Lpq0;->f()V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1, v2}, Lsv0;->c(Lpx;)V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :catchall_0
    move-exception p1

    .line 45
    invoke-virtual {v0}, Lpq0;->f()V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v1, v2}, Lsv0;->c(Lpx;)V

    .line 49
    .line 50
    .line 51
    throw p1
.end method

.method public j(Ljava/lang/String;J)V
    .locals 4

    .line 1
    iget-object v0, p0, Lh2;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroidx/work/impl/WorkDatabase_Impl;

    .line 4
    .line 5
    invoke-virtual {v0}, Lpq0;->b()V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lh2;->h:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Ltz0;

    .line 11
    .line 12
    invoke-virtual {v1}, Lsv0;->a()Lpx;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    const/4 v3, 0x1

    .line 17
    invoke-virtual {v2, v3, p2, p3}, Llx;->f(IJ)V

    .line 18
    .line 19
    .line 20
    const/4 p2, 0x2

    .line 21
    if-nez p1, :cond_0

    .line 22
    .line 23
    invoke-virtual {v2, p2}, Llx;->g(I)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    invoke-virtual {v2, p1, p2}, Llx;->h(Ljava/lang/String;I)V

    .line 28
    .line 29
    .line 30
    :goto_0
    invoke-virtual {v0}, Lpq0;->c()V

    .line 31
    .line 32
    .line 33
    :try_start_0
    iget-object p1, v2, Lpx;->i:Landroid/database/sqlite/SQLiteStatement;

    .line 34
    .line 35
    invoke-virtual {p1}, Landroid/database/sqlite/SQLiteStatement;->executeUpdateDelete()I

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, Lpq0;->h()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0}, Lpq0;->f()V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v1, v2}, Lsv0;->c(Lpx;)V

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :catchall_0
    move-exception p1

    .line 49
    invoke-virtual {v0}, Lpq0;->f()V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v1, v2}, Lsv0;->c(Lpx;)V

    .line 53
    .line 54
    .line 55
    throw p1
.end method

.method public k(Ljava/lang/String;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lh2;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroidx/work/impl/WorkDatabase_Impl;

    .line 4
    .line 5
    invoke-virtual {v0}, Lpq0;->b()V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lh2;->g:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Ltz0;

    .line 11
    .line 12
    invoke-virtual {v1}, Lsv0;->a()Lpx;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    const/4 v3, 0x1

    .line 17
    if-nez p1, :cond_0

    .line 18
    .line 19
    invoke-virtual {v2, v3}, Llx;->g(I)V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    invoke-virtual {v2, p1, v3}, Llx;->h(Ljava/lang/String;I)V

    .line 24
    .line 25
    .line 26
    :goto_0
    invoke-virtual {v0}, Lpq0;->c()V

    .line 27
    .line 28
    .line 29
    :try_start_0
    iget-object p1, v2, Lpx;->i:Landroid/database/sqlite/SQLiteStatement;

    .line 30
    .line 31
    invoke-virtual {p1}, Landroid/database/sqlite/SQLiteStatement;->executeUpdateDelete()I

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0}, Lpq0;->h()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0}, Lpq0;->f()V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1, v2}, Lsv0;->c(Lpx;)V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :catchall_0
    move-exception p1

    .line 45
    invoke-virtual {v0}, Lpq0;->f()V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v1, v2}, Lsv0;->c(Lpx;)V

    .line 49
    .line 50
    .line 51
    throw p1
.end method

.method public l(Ljava/lang/String;Lim;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lh2;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroidx/work/impl/WorkDatabase_Impl;

    .line 4
    .line 5
    invoke-virtual {v0}, Lpq0;->b()V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lh2;->d:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Ltz0;

    .line 11
    .line 12
    invoke-virtual {v1}, Lsv0;->a()Lpx;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    invoke-static {p2}, Lim;->c(Lim;)[B

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    const/4 v3, 0x1

    .line 21
    if-nez p2, :cond_0

    .line 22
    .line 23
    invoke-virtual {v2, v3}, Llx;->g(I)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    invoke-virtual {v2, v3, p2}, Llx;->c(I[B)V

    .line 28
    .line 29
    .line 30
    :goto_0
    const/4 p2, 0x2

    .line 31
    if-nez p1, :cond_1

    .line 32
    .line 33
    invoke-virtual {v2, p2}, Llx;->g(I)V

    .line 34
    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_1
    invoke-virtual {v2, p1, p2}, Llx;->h(Ljava/lang/String;I)V

    .line 38
    .line 39
    .line 40
    :goto_1
    invoke-virtual {v0}, Lpq0;->c()V

    .line 41
    .line 42
    .line 43
    :try_start_0
    invoke-virtual {v2}, Lpx;->t()V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0}, Lpq0;->h()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0}, Lpq0;->f()V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v1, v2}, Lsv0;->c(Lpx;)V

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :catchall_0
    move-exception p1

    .line 57
    invoke-virtual {v0}, Lpq0;->f()V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v1, v2}, Lsv0;->c(Lpx;)V

    .line 61
    .line 62
    .line 63
    throw p1
.end method

.method public m(Ljava/lang/String;J)V
    .locals 4

    .line 1
    iget-object v0, p0, Lh2;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroidx/work/impl/WorkDatabase_Impl;

    .line 4
    .line 5
    invoke-virtual {v0}, Lpq0;->b()V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lh2;->e:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Ltz0;

    .line 11
    .line 12
    invoke-virtual {v1}, Lsv0;->a()Lpx;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    const/4 v3, 0x1

    .line 17
    invoke-virtual {v2, v3, p2, p3}, Llx;->f(IJ)V

    .line 18
    .line 19
    .line 20
    const/4 p2, 0x2

    .line 21
    if-nez p1, :cond_0

    .line 22
    .line 23
    invoke-virtual {v2, p2}, Llx;->g(I)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    invoke-virtual {v2, p1, p2}, Llx;->h(Ljava/lang/String;I)V

    .line 28
    .line 29
    .line 30
    :goto_0
    invoke-virtual {v0}, Lpq0;->c()V

    .line 31
    .line 32
    .line 33
    :try_start_0
    invoke-virtual {v2}, Lpx;->t()V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0}, Lpq0;->h()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0}, Lpq0;->f()V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1, v2}, Lsv0;->c(Lpx;)V

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :catchall_0
    move-exception p1

    .line 47
    invoke-virtual {v0}, Lpq0;->f()V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v1, v2}, Lsv0;->c(Lpx;)V

    .line 51
    .line 52
    .line 53
    throw p1
.end method

.method public varargs n(I[Ljava/lang/String;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lh2;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroidx/work/impl/WorkDatabase_Impl;

    .line 4
    .line 5
    invoke-virtual {v0}, Lpq0;->b()V

    .line 6
    .line 7
    .line 8
    new-instance v1, Ljava/lang/StringBuilder;

    .line 9
    .line 10
    const-string v2, "UPDATE workspec SET state=? WHERE id IN ("

    .line 11
    .line 12
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    array-length v2, p2

    .line 16
    const/4 v3, 0x0

    .line 17
    move v4, v3

    .line 18
    :goto_0
    if-ge v4, v2, :cond_1

    .line 19
    .line 20
    const-string v5, "?"

    .line 21
    .line 22
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    add-int/lit8 v5, v2, -0x1

    .line 26
    .line 27
    if-ge v4, v5, :cond_0

    .line 28
    .line 29
    const-string v5, ","

    .line 30
    .line 31
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    :cond_0
    add-int/lit8 v4, v4, 0x1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    const-string v2, ")"

    .line 38
    .line 39
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-virtual {v0}, Lpq0;->a()V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0}, Lpq0;->b()V

    .line 50
    .line 51
    .line 52
    iget-object v2, v0, Lpq0;->c:Lkz0;

    .line 53
    .line 54
    invoke-interface {v2}, Lkz0;->j()Llx;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    iget-object v2, v2, Llx;->g:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v2, Landroid/database/sqlite/SQLiteDatabase;

    .line 61
    .line 62
    invoke-virtual {v2, v1}, Landroid/database/sqlite/SQLiteDatabase;->compileStatement(Ljava/lang/String;)Landroid/database/sqlite/SQLiteStatement;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    invoke-static {p1}, Lwl2;->w(I)I

    .line 67
    .line 68
    .line 69
    move-result p1

    .line 70
    int-to-long v4, p1

    .line 71
    const/4 p1, 0x1

    .line 72
    invoke-virtual {v1, p1, v4, v5}, Landroid/database/sqlite/SQLiteProgram;->bindLong(IJ)V

    .line 73
    .line 74
    .line 75
    array-length p1, p2

    .line 76
    const/4 v2, 0x2

    .line 77
    :goto_1
    if-ge v3, p1, :cond_3

    .line 78
    .line 79
    aget-object v4, p2, v3

    .line 80
    .line 81
    if-nez v4, :cond_2

    .line 82
    .line 83
    invoke-virtual {v1, v2}, Landroid/database/sqlite/SQLiteProgram;->bindNull(I)V

    .line 84
    .line 85
    .line 86
    goto :goto_2

    .line 87
    :cond_2
    invoke-virtual {v1, v2, v4}, Landroid/database/sqlite/SQLiteProgram;->bindString(ILjava/lang/String;)V

    .line 88
    .line 89
    .line 90
    :goto_2
    add-int/lit8 v2, v2, 0x1

    .line 91
    .line 92
    add-int/lit8 v3, v3, 0x1

    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_3
    invoke-virtual {v0}, Lpq0;->c()V

    .line 96
    .line 97
    .line 98
    :try_start_0
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteStatement;->executeUpdateDelete()I

    .line 99
    .line 100
    .line 101
    invoke-virtual {v0}, Lpq0;->h()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 102
    .line 103
    .line 104
    invoke-virtual {v0}, Lpq0;->f()V

    .line 105
    .line 106
    .line 107
    return-void

    .line 108
    :catchall_0
    move-exception p1

    .line 109
    invoke-virtual {v0}, Lpq0;->f()V

    .line 110
    .line 111
    .line 112
    throw p1
.end method

.method public o()Lvg0;
    .locals 12

    .line 1
    iget-object v0, p0, Lh2;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/content/Context;

    .line 4
    .line 5
    const-class v1, Landroid/content/Context;

    .line 6
    .line 7
    invoke-static {v0, v1}, Li41;->P(Ljava/lang/Object;Ljava/lang/Class;)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lh2;->g:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Ljava/util/HashMap;

    .line 13
    .line 14
    const-class v1, Ljava/util/Map;

    .line 15
    .line 16
    invoke-static {v0, v1}, Li41;->P(Ljava/lang/Object;Ljava/lang/Class;)V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Lh2;->h:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v0, Lfr1;

    .line 22
    .line 23
    const-class v1, Lfr1;

    .line 24
    .line 25
    invoke-static {v0, v1}, Li41;->P(Ljava/lang/Object;Ljava/lang/Class;)V

    .line 26
    .line 27
    .line 28
    iget-object v0, p0, Lh2;->i:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v0, Leg3;

    .line 31
    .line 32
    const-class v1, Leg3;

    .line 33
    .line 34
    invoke-static {v0, v1}, Li41;->P(Ljava/lang/Object;Ljava/lang/Class;)V

    .line 35
    .line 36
    .line 37
    new-instance v2, Lvg0;

    .line 38
    .line 39
    iget-object v0, p0, Lh2;->a:Ljava/lang/Object;

    .line 40
    .line 41
    move-object v3, v0

    .line 42
    check-cast v3, Lep2;

    .line 43
    .line 44
    iget-object v0, p0, Lh2;->b:Ljava/lang/Object;

    .line 45
    .line 46
    move-object v4, v0

    .line 47
    check-cast v4, Lp21;

    .line 48
    .line 49
    iget-object v0, p0, Lh2;->c:Ljava/lang/Object;

    .line 50
    .line 51
    move-object v5, v0

    .line 52
    check-cast v5, Landroid/content/Context;

    .line 53
    .line 54
    iget-object v0, p0, Lh2;->d:Ljava/lang/Object;

    .line 55
    .line 56
    move-object v6, v0

    .line 57
    check-cast v6, Landroid/view/View;

    .line 58
    .line 59
    iget-object v0, p0, Lh2;->e:Ljava/lang/Object;

    .line 60
    .line 61
    move-object v7, v0

    .line 62
    check-cast v7, Landroid/app/Activity;

    .line 63
    .line 64
    iget-object v0, p0, Lh2;->f:Ljava/lang/Object;

    .line 65
    .line 66
    move-object v8, v0

    .line 67
    check-cast v8, Ljava/lang/String;

    .line 68
    .line 69
    iget-object v0, p0, Lh2;->g:Ljava/lang/Object;

    .line 70
    .line 71
    move-object v9, v0

    .line 72
    check-cast v9, Ljava/util/HashMap;

    .line 73
    .line 74
    iget-object v0, p0, Lh2;->h:Ljava/lang/Object;

    .line 75
    .line 76
    move-object v10, v0

    .line 77
    check-cast v10, Lfr1;

    .line 78
    .line 79
    iget-object v0, p0, Lh2;->i:Ljava/lang/Object;

    .line 80
    .line 81
    move-object v11, v0

    .line 82
    check-cast v11, Leg3;

    .line 83
    .line 84
    invoke-direct/range {v2 .. v11}, Lvg0;-><init>(Lep2;Lp21;Landroid/content/Context;Landroid/view/View;Landroid/app/Activity;Ljava/lang/String;Ljava/util/HashMap;Lfr1;Leg3;)V

    .line 85
    .line 86
    .line 87
    return-object v2
.end method

.method public p(Ljava/util/LinkedHashMap;Ljava/util/Map;)Ljava/util/LinkedHashMap;
    .locals 4

    .line 1
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Ljava/util/LinkedHashMap;-><init>(Ljava/util/Map;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result p2

    .line 18
    if-eqz p2, :cond_1

    .line 19
    .line 20
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    check-cast p2, Ljava/util/Map$Entry;

    .line 25
    .line 26
    invoke-interface {p2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    check-cast v1, Ljava/lang/String;

    .line 31
    .line 32
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p2

    .line 36
    check-cast p2, Ljava/lang/String;

    .line 37
    .line 38
    invoke-virtual {v0, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    check-cast v2, Ljava/lang/String;

    .line 43
    .line 44
    iget-object v3, p0, Lh2;->c:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v3, Ljava/util/HashMap;

    .line 47
    .line 48
    invoke-virtual {v3, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    check-cast v3, Lqz1;

    .line 53
    .line 54
    if-eqz v3, :cond_0

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_0
    sget-object v3, Lqz1;->b:Lqz1;

    .line 58
    .line 59
    :goto_1
    invoke-virtual {v3, v2, p2}, Lqz1;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p2

    .line 63
    invoke-interface {v0, v1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_1
    return-object v0
.end method

.method public q(La83;)V
    .locals 5

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p1, La83;->a:Ljava/util/List;

    .line 3
    .line 4
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-eqz v1, :cond_1

    .line 13
    .line 14
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    check-cast v1, Ljava/lang/String;

    .line 19
    .line 20
    iget-object v2, p0, Lh2;->c:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v2, Lgl2;

    .line 23
    .line 24
    iget v3, p1, La83;->b:I

    .line 25
    .line 26
    invoke-interface {v2, v1, v3}, Lgl2;->a(Ljava/lang/String;I)Lzz2;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    if-eqz v1, :cond_0

    .line 31
    .line 32
    iget-object v2, p0, Lh2;->i:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v2, Lh83;

    .line 35
    .line 36
    invoke-interface {v1, v2, p1}, Lzz2;->a(Lh83;La83;)Z

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    if-eqz v2, :cond_0

    .line 41
    .line 42
    iget-object v0, p0, Lh2;->i:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v0, Lh83;

    .line 45
    .line 46
    invoke-interface {v1, v0, p1}, Lzz2;->b(Lh83;La83;)Ln70;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    iget v1, p1, La83;->R:I

    .line 51
    .line 52
    iget-object v2, p0, Lh2;->b:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v2, Ljava/util/concurrent/ScheduledExecutorService;

    .line 55
    .line 56
    int-to-long v3, v1

    .line 57
    sget-object v1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 58
    .line 59
    invoke-static {v0, v3, v4, v1, v2}, Lpu1;->N(Ln70;JLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/ScheduledExecutorService;)Ln70;

    .line 60
    .line 61
    .line 62
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 63
    monitor-exit p0

    .line 64
    goto :goto_0

    .line 65
    :catchall_0
    move-exception p1

    .line 66
    goto :goto_1

    .line 67
    :cond_1
    :try_start_1
    new-instance v0, Lhx2;

    .line 68
    .line 69
    const/4 v1, 0x3

    .line 70
    invoke-direct {v0, v1}, Lhx2;-><init>(I)V

    .line 71
    .line 72
    .line 73
    invoke-static {v0}, Lpu1;->B(Ljava/lang/Throwable;)Lkq3;

    .line 74
    .line 75
    .line 76
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 77
    monitor-exit p0

    .line 78
    :goto_0
    iget-object v1, p0, Lh2;->e:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast v1, Ldb3;

    .line 81
    .line 82
    iget-object v2, p0, Lh2;->d:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast v2, Lo13;

    .line 85
    .line 86
    iget-object v3, p0, Lh2;->i:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast v3, Lh83;

    .line 89
    .line 90
    invoke-virtual {v2, v3, p1, v0, v1}, Lo13;->b(Lh83;La83;Ln70;Ldb3;)V

    .line 91
    .line 92
    .line 93
    new-instance v1, Lmr2;

    .line 94
    .line 95
    const/4 v2, 0x5

    .line 96
    invoke-direct {v1, p0, p1, v2}, Lmr2;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 97
    .line 98
    .line 99
    iget-object p1, p0, Lh2;->a:Ljava/lang/Object;

    .line 100
    .line 101
    check-cast p1, Ljava/util/concurrent/Executor;

    .line 102
    .line 103
    new-instance v2, Ljq3;

    .line 104
    .line 105
    const/4 v3, 0x0

    .line 106
    invoke-direct {v2, v0, v1, v3}, Ljq3;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 107
    .line 108
    .line 109
    invoke-interface {v0, v2, p1}, Ln70;->c(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 110
    .line 111
    .line 112
    return-void

    .line 113
    :goto_1
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 114
    throw p1
.end method

.method public r(Ljava/util/LinkedHashMap;Lsz1;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lh2;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/lang/String;

    .line 4
    .line 5
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {p1}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_0

    .line 26
    .line 27
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    check-cast v1, Ljava/util/Map$Entry;

    .line 32
    .line 33
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    check-cast v2, Ljava/lang/String;

    .line 38
    .line 39
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    check-cast v1, Ljava/lang/String;

    .line 44
    .line 45
    invoke-virtual {v0, v2, v1}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_0
    invoke-virtual {v0}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    if-eqz p2, :cond_3

    .line 58
    .line 59
    iget-object v0, p2, Lsz1;->g:Ljava/lang/String;

    .line 60
    .line 61
    iget-object p2, p2, Lsz1;->f:Ljava/lang/String;

    .line 62
    .line 63
    new-instance v1, Ljava/lang/StringBuilder;

    .line 64
    .line 65
    invoke-direct {v1, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 69
    .line 70
    .line 71
    move-result p1

    .line 72
    if-nez p1, :cond_1

    .line 73
    .line 74
    const-string p1, "&it="

    .line 75
    .line 76
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    :cond_1
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 83
    .line 84
    .line 85
    move-result p1

    .line 86
    if-nez p1, :cond_2

    .line 87
    .line 88
    const-string p1, "&blat="

    .line 89
    .line 90
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    :cond_2
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    :cond_3
    iget-object p2, p0, Lh2;->h:Ljava/lang/Object;

    .line 101
    .line 102
    check-cast p2, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 103
    .line 104
    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 105
    .line 106
    .line 107
    move-result p2

    .line 108
    const/4 v0, 0x0

    .line 109
    if-eqz p2, :cond_7

    .line 110
    .line 111
    iget-object p2, p0, Lh2;->i:Ljava/lang/Object;

    .line 112
    .line 113
    check-cast p2, Ljava/io/File;

    .line 114
    .line 115
    if-eqz p2, :cond_6

    .line 116
    .line 117
    const/4 v1, 0x5

    .line 118
    :try_start_0
    new-instance v2, Ljava/io/FileOutputStream;

    .line 119
    .line 120
    const/4 v3, 0x1

    .line 121
    invoke-direct {v2, p2, v3}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;Z)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 122
    .line 123
    .line 124
    :try_start_1
    invoke-virtual {p1}, Ljava/lang/String;->getBytes()[B

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    invoke-virtual {v2, p1}, Ljava/io/FileOutputStream;->write([B)V

    .line 129
    .line 130
    .line 131
    const/16 p1, 0xa

    .line 132
    .line 133
    invoke-virtual {v2, p1}, Ljava/io/FileOutputStream;->write(I)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 134
    .line 135
    .line 136
    :try_start_2
    invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    .line 137
    .line 138
    .line 139
    return-void

    .line 140
    :catch_0
    invoke-static {v1}, Lgi2;->q0(I)Z

    .line 141
    .line 142
    .line 143
    return-void

    .line 144
    :catchall_0
    move-exception p1

    .line 145
    move-object v0, v2

    .line 146
    goto :goto_2

    .line 147
    :catch_1
    move-object v0, v2

    .line 148
    :catch_2
    :try_start_3
    invoke-static {v1}, Lgi2;->q0(I)Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 149
    .line 150
    .line 151
    if-eqz v0, :cond_4

    .line 152
    .line 153
    :try_start_4
    invoke-virtual {v0}, Ljava/io/FileOutputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3

    .line 154
    .line 155
    .line 156
    goto :goto_1

    .line 157
    :catch_3
    invoke-static {v1}, Lgi2;->q0(I)Z

    .line 158
    .line 159
    .line 160
    :cond_4
    :goto_1
    return-void

    .line 161
    :catchall_1
    move-exception p1

    .line 162
    :goto_2
    if-eqz v0, :cond_5

    .line 163
    .line 164
    :try_start_5
    invoke-virtual {v0}, Ljava/io/FileOutputStream;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_4

    .line 165
    .line 166
    .line 167
    goto :goto_3

    .line 168
    :catch_4
    invoke-static {v1}, Lgi2;->q0(I)Z

    .line 169
    .line 170
    .line 171
    :cond_5
    :goto_3
    throw p1

    .line 172
    :cond_6
    const-string p1, "CsiReporter: File doesn\'t exist. Cannot write CSI data to file."

    .line 173
    .line 174
    invoke-static {p1}, Lgi2;->i0(Ljava/lang/String;)V

    .line 175
    .line 176
    .line 177
    return-void

    .line 178
    :cond_7
    sget-object p2, Lhg4;->C:Lhg4;

    .line 179
    .line 180
    iget-object p2, p2, Lhg4;->c:Llf4;

    .line 181
    .line 182
    iget-object p2, p0, Lh2;->e:Ljava/lang/Object;

    .line 183
    .line 184
    check-cast p2, Landroid/content/Context;

    .line 185
    .line 186
    iget-object v1, p0, Lh2;->f:Ljava/lang/Object;

    .line 187
    .line 188
    check-cast v1, Ljava/lang/String;

    .line 189
    .line 190
    new-instance v2, Lw72;

    .line 191
    .line 192
    invoke-direct {v2, p2, v1, p1, v0}, Lw72;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lx34;)V

    .line 193
    .line 194
    .line 195
    invoke-virtual {v2}, Lf74;->r1()Ln70;

    .line 196
    .line 197
    .line 198
    return-void
.end method
