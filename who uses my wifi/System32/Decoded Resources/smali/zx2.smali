.class public final Lzx2;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# static fields
.field public static final p:Ljava/util/regex/Pattern;


# instance fields
.field public final a:Lth2;

.field public final b:Landroid/content/Context;

.field public final c:Le51;

.field public final d:Ll83;

.field public final e:Ljava/util/concurrent/Executor;

.field public final f:Ljava/util/concurrent/ScheduledExecutorService;

.field public final g:Ljava/lang/String;

.field public final h:Lda3;

.field public final i:Ljv2;

.field public final j:Leb3;

.field public final k:Lio2;

.field public final l:Ljava/lang/Object;

.field public m:Ljava/lang/String;

.field public n:Ljava/util/List;

.field public o:Landroid/os/Bundle;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "\\?"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lzx2;->p:Ljava/util/regex/Pattern;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Lth2;Landroid/content/Context;Le51;Ll83;Lld2;Ljava/lang/String;Lda3;Ljv2;Lts0;Ljava/util/concurrent/ScheduledExecutorService;Leb3;Lio2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance p9, Ljava/lang/Object;

    .line 5
    .line 6
    invoke-direct {p9}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p9, p0, Lzx2;->l:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p1, p0, Lzx2;->a:Lth2;

    .line 12
    .line 13
    iput-object p2, p0, Lzx2;->b:Landroid/content/Context;

    .line 14
    .line 15
    iput-object p3, p0, Lzx2;->c:Le51;

    .line 16
    .line 17
    iput-object p4, p0, Lzx2;->d:Ll83;

    .line 18
    .line 19
    iput-object p5, p0, Lzx2;->e:Ljava/util/concurrent/Executor;

    .line 20
    .line 21
    iput-object p6, p0, Lzx2;->g:Ljava/lang/String;

    .line 22
    .line 23
    iput-object p7, p0, Lzx2;->h:Lda3;

    .line 24
    .line 25
    iget-object p1, p1, Lth2;->O:Lba4;

    .line 26
    .line 27
    invoke-virtual {p1}, Lba4;->d()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    check-cast p1, Lr83;

    .line 32
    .line 33
    iput-object p8, p0, Lzx2;->i:Ljv2;

    .line 34
    .line 35
    iput-object p10, p0, Lzx2;->f:Ljava/util/concurrent/ScheduledExecutorService;

    .line 36
    .line 37
    iput-object p11, p0, Lzx2;->j:Leb3;

    .line 38
    .line 39
    iput-object p12, p0, Lzx2;->k:Lio2;

    .line 40
    .line 41
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ljava/lang/String;)Lgp3;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const-string v1, ""

    .line 4
    .line 5
    invoke-static/range {p1 .. p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    if-eqz v2, :cond_0

    .line 10
    .line 11
    new-instance v1, Lr13;

    .line 12
    .line 13
    const/16 v2, 0xf

    .line 14
    .line 15
    const-string v3, "Invalid ad string."

    .line 16
    .line 17
    invoke-direct {v1, v3, v2}, Lhx2;-><init>(Ljava/lang/String;I)V

    .line 18
    .line 19
    .line 20
    invoke-static {v1}, Lpu1;->B(Ljava/lang/Throwable;)Lkq3;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    return-object v1

    .line 25
    :cond_0
    const/16 v2, 0xb

    .line 26
    .line 27
    iget-object v3, v0, Lzx2;->b:Landroid/content/Context;

    .line 28
    .line 29
    invoke-static {v3, v2}, Laa3;->l(Landroid/content/Context;I)Laa3;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    invoke-interface {v2}, Laa3;->a()Laa3;

    .line 34
    .line 35
    .line 36
    sget-object v4, Lhg4;->C:Lhg4;

    .line 37
    .line 38
    iget-object v4, v4, Lhg4;->r:Lp21;

    .line 39
    .line 40
    iget-object v5, v0, Lzx2;->a:Lth2;

    .line 41
    .line 42
    invoke-virtual {v5}, Lth2;->c()Lea3;

    .line 43
    .line 44
    .line 45
    move-result-object v5

    .line 46
    iget-object v6, v0, Lzx2;->c:Le51;

    .line 47
    .line 48
    invoke-virtual {v4, v3, v6, v5}, Lp21;->C(Landroid/content/Context;Le51;Lea3;)Li62;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    const-string v4, "google.afma.response.normalize"

    .line 53
    .line 54
    sget-object v5, Lh62;->b:Lus0;

    .line 55
    .line 56
    invoke-virtual {v3, v4, v5, v5}, Li62;->a(Ljava/lang/String;Lg62;Lf62;)Lk62;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    sget-object v4, Lmz1;->w7:Liz1;

    .line 61
    .line 62
    sget-object v5, Ltw1;->e:Ltw1;

    .line 63
    .line 64
    iget-object v5, v5, Ltw1;->c:Lkz1;

    .line 65
    .line 66
    invoke-virtual {v5, v4}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v4

    .line 70
    check-cast v4, Ljava/lang/Boolean;

    .line 71
    .line 72
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 73
    .line 74
    .line 75
    move-result v4

    .line 76
    const-string v5, "1"

    .line 77
    .line 78
    iget-object v6, v0, Lzx2;->e:Ljava/util/concurrent/Executor;

    .line 79
    .line 80
    const-string v7, "sst"

    .line 81
    .line 82
    iget-object v8, v0, Lzx2;->i:Ljv2;

    .line 83
    .line 84
    if-eqz v4, :cond_4

    .line 85
    .line 86
    const/4 v4, 0x0

    .line 87
    :try_start_0
    new-instance v9, Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 88
    .line 89
    move-object/from16 v10, p1

    .line 90
    .line 91
    :try_start_1
    invoke-direct {v9, v10}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    const-string v11, "fetch_url"

    .line 95
    .line 96
    invoke-virtual {v9, v11, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v11

    .line 100
    iput-object v11, v0, Lzx2;->m:Ljava/lang/String;

    .line 101
    .line 102
    new-instance v11, Lorg/json/JSONObject;

    .line 103
    .line 104
    const-string v12, "settings"

    .line 105
    .line 106
    invoke-virtual {v9, v12, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v9

    .line 110
    invoke-direct {v11, v9}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    const-string v9, "nofill_urls"

    .line 114
    .line 115
    invoke-virtual {v11, v9}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 116
    .line 117
    .line 118
    move-result-object v9

    .line 119
    invoke-static {v9, v4}, Lbd2;->F(Lorg/json/JSONArray;Ljava/util/ArrayList;)Ljava/util/List;

    .line 120
    .line 121
    .line 122
    move-result-object v9

    .line 123
    iput-object v9, v0, Lzx2;->n:Ljava/util/List;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    .line 124
    .line 125
    goto :goto_0

    .line 126
    :catch_0
    move-object/from16 v10, p1

    .line 127
    .line 128
    :catch_1
    const-string v9, "Invalid ad response."

    .line 129
    .line 130
    invoke-static {v9}, Lgi2;->i0(Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    :goto_0
    iget-object v9, v0, Lzx2;->m:Ljava/lang/String;

    .line 134
    .line 135
    iget-object v11, v0, Lzx2;->n:Ljava/util/List;

    .line 136
    .line 137
    invoke-static {v9}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 138
    .line 139
    .line 140
    move-result v12

    .line 141
    if-nez v12, :cond_3

    .line 142
    .line 143
    const-string v5, "2"

    .line 144
    .line 145
    invoke-virtual {v8, v7, v5}, Ljv2;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    sget-object v5, Lmz1;->y7:Liz1;

    .line 149
    .line 150
    sget-object v7, Ltw1;->e:Ltw1;

    .line 151
    .line 152
    iget-object v8, v7, Ltw1;->c:Lkz1;

    .line 153
    .line 154
    iget-object v7, v7, Ltw1;->c:Lkz1;

    .line 155
    .line 156
    invoke-virtual {v8, v5}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v5

    .line 160
    move-object/from16 v17, v5

    .line 161
    .line 162
    check-cast v17, Ljava/lang/String;

    .line 163
    .line 164
    sget-object v5, Lmz1;->x7:Liz1;

    .line 165
    .line 166
    invoke-virtual {v7, v5}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v5

    .line 170
    check-cast v5, Ljava/lang/Boolean;

    .line 171
    .line 172
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 173
    .line 174
    .line 175
    move-result v5

    .line 176
    if-eqz v5, :cond_2

    .line 177
    .line 178
    new-instance v5, Lal3;

    .line 179
    .line 180
    sget-object v8, Lzx2;->p:Ljava/util/regex/Pattern;

    .line 181
    .line 182
    invoke-direct {v5, v8}, Lal3;-><init>(Ljava/util/regex/Pattern;)V

    .line 183
    .line 184
    .line 185
    invoke-virtual {v8, v1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 186
    .line 187
    .line 188
    move-result-object v1

    .line 189
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 190
    .line 191
    .line 192
    invoke-virtual {v1}, Ljava/util/regex/Matcher;->matches()Z

    .line 193
    .line 194
    .line 195
    move-result v1

    .line 196
    const/4 v8, 0x1

    .line 197
    xor-int/2addr v1, v8

    .line 198
    const-string v10, "The pattern may not match the empty string: %s"

    .line 199
    .line 200
    invoke-static {v1, v10, v5}, Lzt0;->X(ZLjava/lang/String;Ljava/lang/Object;)V

    .line 201
    .line 202
    .line 203
    new-instance v1, Lsq0;

    .line 204
    .line 205
    new-instance v10, Lil3;

    .line 206
    .line 207
    const/4 v12, 0x0

    .line 208
    invoke-direct {v10, v12, v5}, Lil3;-><init>(ILjava/lang/Object;)V

    .line 209
    .line 210
    .line 211
    const/16 v5, 0x15

    .line 212
    .line 213
    invoke-direct {v1, v5, v10}, Lsq0;-><init>(ILjava/lang/Object;)V

    .line 214
    .line 215
    .line 216
    invoke-virtual {v1, v9}, Lsq0;->v(Ljava/lang/CharSequence;)Ljava/util/List;

    .line 217
    .line 218
    .line 219
    move-result-object v1

    .line 220
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 221
    .line 222
    .line 223
    move-result v5

    .line 224
    const/4 v10, 0x2

    .line 225
    if-ge v5, v10, :cond_1

    .line 226
    .line 227
    new-instance v1, Lr13;

    .line 228
    .line 229
    const-string v4, "Invalid fetch URL."

    .line 230
    .line 231
    invoke-direct {v1, v4, v8}, Lhx2;-><init>(Ljava/lang/String;I)V

    .line 232
    .line 233
    .line 234
    invoke-static {v1}, Lpu1;->B(Ljava/lang/Throwable;)Lkq3;

    .line 235
    .line 236
    .line 237
    move-result-object v1

    .line 238
    goto/16 :goto_1

    .line 239
    .line 240
    :cond_1
    invoke-interface {v1, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    move-result-object v1

    .line 244
    check-cast v1, Ljava/lang/String;

    .line 245
    .line 246
    sget-object v5, Lhg4;->C:Lhg4;

    .line 247
    .line 248
    iget-object v5, v5, Lhg4;->c:Llf4;

    .line 249
    .line 250
    invoke-static {v9}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 251
    .line 252
    .line 253
    move-result-object v5

    .line 254
    invoke-virtual {v5}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    .line 255
    .line 256
    .line 257
    move-result-object v5

    .line 258
    invoke-virtual {v5, v4}, Landroid/net/Uri$Builder;->query(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 259
    .line 260
    .line 261
    move-result-object v4

    .line 262
    invoke-virtual {v4}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    .line 263
    .line 264
    .line 265
    move-result-object v4

    .line 266
    invoke-virtual {v4}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 267
    .line 268
    .line 269
    move-result-object v9

    .line 270
    :cond_2
    move-object v13, v9

    .line 271
    new-instance v12, Lyy2;

    .line 272
    .line 273
    new-instance v15, Ljava/util/HashMap;

    .line 274
    .line 275
    invoke-direct {v15}, Ljava/util/HashMap;-><init>()V

    .line 276
    .line 277
    .line 278
    sget-object v4, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 279
    .line 280
    invoke-virtual {v1, v4}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 281
    .line 282
    .line 283
    move-result-object v16

    .line 284
    const v14, 0xea60

    .line 285
    .line 286
    .line 287
    invoke-direct/range {v12 .. v17}, Lyy2;-><init>(Ljava/lang/String;ILjava/util/HashMap;[BLjava/lang/String;)V

    .line 288
    .line 289
    .line 290
    sget-object v1, Lmd2;->a:Lld2;

    .line 291
    .line 292
    new-instance v4, Lgs1;

    .line 293
    .line 294
    const/16 v5, 0x9

    .line 295
    .line 296
    invoke-direct {v4, v0, v12, v5}, Lgs1;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 297
    .line 298
    .line 299
    invoke-virtual {v1, v4}, Lld2;->c(Ljava/util/concurrent/Callable;)Ln70;

    .line 300
    .line 301
    .line 302
    move-result-object v1

    .line 303
    invoke-static {v1}, Lgq3;->r(Ln70;)Lgq3;

    .line 304
    .line 305
    .line 306
    move-result-object v1

    .line 307
    sget-object v4, Lmz1;->z7:Liz1;

    .line 308
    .line 309
    invoke-virtual {v7, v4}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 310
    .line 311
    .line 312
    move-result-object v4

    .line 313
    check-cast v4, Ljava/lang/Integer;

    .line 314
    .line 315
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 316
    .line 317
    .line 318
    move-result v4

    .line 319
    int-to-long v4, v4

    .line 320
    iget-object v7, v0, Lzx2;->f:Ljava/util/concurrent/ScheduledExecutorService;

    .line 321
    .line 322
    sget-object v8, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 323
    .line 324
    invoke-static {v1, v4, v5, v8, v7}, Lpu1;->N(Ln70;JLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/ScheduledExecutorService;)Ln70;

    .line 325
    .line 326
    .line 327
    move-result-object v1

    .line 328
    check-cast v1, Lgq3;

    .line 329
    .line 330
    new-instance v4, Lz02;

    .line 331
    .line 332
    const/4 v5, 0x7

    .line 333
    invoke-direct {v4, v0, v11, v5}, Lz02;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 334
    .line 335
    .line 336
    const-class v5, Ljava/lang/Exception;

    .line 337
    .line 338
    invoke-static {v1, v5, v4, v6}, Lpu1;->L(Ln70;Ljava/lang/Class;Lyp3;Ljava/util/concurrent/Executor;)Lwo3;

    .line 339
    .line 340
    .line 341
    move-result-object v1

    .line 342
    goto :goto_1

    .line 343
    :cond_3
    invoke-static {v10}, Lpu1;->r(Ljava/lang/Object;)Llq3;

    .line 344
    .line 345
    .line 346
    move-result-object v1

    .line 347
    invoke-virtual {v8, v7, v5}, Ljv2;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 348
    .line 349
    .line 350
    goto :goto_1

    .line 351
    :cond_4
    move-object/from16 v10, p1

    .line 352
    .line 353
    invoke-static {v10}, Lpu1;->r(Ljava/lang/Object;)Llq3;

    .line 354
    .line 355
    .line 356
    move-result-object v1

    .line 357
    invoke-virtual {v8, v7, v5}, Ljv2;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 358
    .line 359
    .line 360
    :goto_1
    new-instance v4, Lu42;

    .line 361
    .line 362
    const/16 v5, 0x8

    .line 363
    .line 364
    move-object/from16 v7, p2

    .line 365
    .line 366
    invoke-direct {v4, v5, v7}, Lu42;-><init>(ILjava/lang/Object;)V

    .line 367
    .line 368
    .line 369
    invoke-static {v1, v4, v6}, Lpu1;->O(Ln70;Lyp3;Ljava/util/concurrent/Executor;)Lqp3;

    .line 370
    .line 371
    .line 372
    move-result-object v1

    .line 373
    new-instance v4, Lz02;

    .line 374
    .line 375
    const/4 v5, 0x6

    .line 376
    invoke-direct {v4, v0, v3, v5}, Lz02;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 377
    .line 378
    .line 379
    invoke-static {v1, v4, v6}, Lpu1;->O(Ln70;Lyp3;Ljava/util/concurrent/Executor;)Lqp3;

    .line 380
    .line 381
    .line 382
    move-result-object v1

    .line 383
    new-instance v3, Lu42;

    .line 384
    .line 385
    const/4 v4, 0x7

    .line 386
    invoke-direct {v3, v4, v0}, Lu42;-><init>(ILjava/lang/Object;)V

    .line 387
    .line 388
    .line 389
    invoke-static {v1, v3, v6}, Lpu1;->O(Ln70;Lyp3;Ljava/util/concurrent/Executor;)Lqp3;

    .line 390
    .line 391
    .line 392
    move-result-object v1

    .line 393
    iget-object v3, v0, Lzx2;->h:Lda3;

    .line 394
    .line 395
    const/4 v4, 0x0

    .line 396
    invoke-static {v1, v3, v2, v4}, Lqb1;->P(Ln70;Lda3;Laa3;Z)V

    .line 397
    .line 398
    .line 399
    new-instance v2, Lf23;

    .line 400
    .line 401
    const/16 v3, 0x17

    .line 402
    .line 403
    invoke-direct {v2, v3, v0}, Lf23;-><init>(ILjava/lang/Object;)V

    .line 404
    .line 405
    .line 406
    sget-object v3, Lmd2;->g:Lld2;

    .line 407
    .line 408
    new-instance v4, Ljq3;

    .line 409
    .line 410
    const/4 v5, 0x0

    .line 411
    invoke-direct {v4, v1, v2, v5}, Ljq3;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 412
    .line 413
    .line 414
    invoke-virtual {v1, v4, v3}, Lgp3;->c(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 415
    .line 416
    .line 417
    return-object v1
.end method

.method public final b(I)V
    .locals 3

    .line 1
    iget-object v0, p0, Lzx2;->i:Ljv2;

    .line 2
    .line 3
    iget-object v0, v0, Ljv2;->e:Landroid/os/Bundle;

    .line 4
    .line 5
    sget-object v1, Lmz1;->B7:Liz1;

    .line 6
    .line 7
    sget-object v2, Ltw1;->e:Ltw1;

    .line 8
    .line 9
    iget-object v2, v2, Ltw1;->c:Lkz1;

    .line 10
    .line 11
    invoke-virtual {v2, v1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    check-cast v1, Ljava/lang/Boolean;

    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    invoke-static {p1}, Lga1;->b(I)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    sget-object v1, Lhg4;->C:Lhg4;

    .line 28
    .line 29
    iget-object v1, v1, Lhg4;->k:Lym;

    .line 30
    .line 31
    invoke-static {v1, v0, p1}, Lga1;->n(Lym;Landroid/os/Bundle;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    :cond_0
    return-void
.end method

.method public final c(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, "ad_types"

    .line 2
    .line 3
    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    .line 4
    .line 5
    invoke-direct {v1, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    if-eqz v2, :cond_0

    .line 13
    .line 14
    const-string v3, "unknown"

    .line 15
    .line 16
    const/4 v4, 0x0

    .line 17
    invoke-virtual {v2, v4}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-eqz v2, :cond_0

    .line 26
    .line 27
    new-instance v2, Lorg/json/JSONArray;

    .line 28
    .line 29
    invoke-direct {v2}, Lorg/json/JSONArray;-><init>()V

    .line 30
    .line 31
    .line 32
    iget-object v3, p0, Lzx2;->g:Ljava/lang/String;

    .line 33
    .line 34
    invoke-virtual {v2, v3}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :catch_0
    move-exception v0

    .line 43
    goto :goto_1

    .line 44
    :cond_0
    :goto_0
    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p1
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 48
    return-object p1

    .line 49
    :goto_1
    const-string v1, "Failed to update the ad types for rendering. "

    .line 50
    .line 51
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-static {v0}, Lgi2;->i0(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    return-object p1
.end method
