.class public final Lf42;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ly32;


# static fields
.field public static final i:Ljava/util/Map;


# instance fields
.field public final f:Lsu1;

.field public final g:Lo82;

.field public final h:Lof3;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 1
    const-string v5, "closeResizedAd"

    .line 2
    .line 3
    const-string v6, "unload"

    .line 4
    .line 5
    const-string v0, "resize"

    .line 6
    .line 7
    const-string v1, "playVideo"

    .line 8
    .line 9
    const-string v2, "storePicture"

    .line 10
    .line 11
    const-string v3, "createCalendarEvent"

    .line 12
    .line 13
    const-string v4, "setOrientationProperties"

    .line 14
    .line 15
    filled-new-array/range {v0 .. v6}, [Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    const/4 v1, 0x1

    .line 20
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    const/4 v1, 0x2

    .line 25
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    const/4 v1, 0x3

    .line 30
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    const/4 v1, 0x4

    .line 35
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 36
    .line 37
    .line 38
    move-result-object v5

    .line 39
    const/4 v1, 0x5

    .line 40
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 41
    .line 42
    .line 43
    move-result-object v6

    .line 44
    const/4 v1, 0x6

    .line 45
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 46
    .line 47
    .line 48
    move-result-object v7

    .line 49
    const/4 v1, 0x7

    .line 50
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 51
    .line 52
    .line 53
    move-result-object v8

    .line 54
    filled-new-array/range {v2 .. v8}, [Ljava/lang/Integer;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    new-instance v3, Ls8;

    .line 59
    .line 60
    invoke-direct {v3, v1}, Lbw0;-><init>(I)V

    .line 61
    .line 62
    .line 63
    const/4 v4, 0x0

    .line 64
    :goto_0
    if-ge v4, v1, :cond_0

    .line 65
    .line 66
    aget-object v5, v0, v4

    .line 67
    .line 68
    aget-object v6, v2, v4

    .line 69
    .line 70
    invoke-interface {v3, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    add-int/lit8 v4, v4, 0x1

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_0
    invoke-static {v3}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    sput-object v0, Lf42;->i:Ljava/util/Map;

    .line 81
    .line 82
    return-void
.end method

.method public constructor <init>(Lsu1;Lo82;Lof3;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lf42;->f:Lsu1;

    .line 5
    .line 6
    iput-object p2, p0, Lf42;->g:Lo82;

    .line 7
    .line 8
    iput-object p3, p0, Lf42;->h:Lof3;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Object;Ljava/util/Map;)V
    .locals 18

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p2

    .line 4
    .line 5
    const-string v2, "a"

    .line 6
    .line 7
    move-object/from16 v3, p1

    .line 8
    .line 9
    check-cast v3, Lag2;

    .line 10
    .line 11
    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    check-cast v2, Ljava/lang/String;

    .line 16
    .line 17
    sget-object v4, Lf42;->i:Ljava/util/Map;

    .line 18
    .line 19
    invoke-interface {v4, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    check-cast v2, Ljava/lang/Integer;

    .line 24
    .line 25
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    const/4 v6, 0x6

    .line 30
    const/4 v7, 0x7

    .line 31
    const/4 v8, 0x1

    .line 32
    const/4 v9, 0x5

    .line 33
    if-eq v2, v9, :cond_1

    .line 34
    .line 35
    if-eq v2, v7, :cond_37

    .line 36
    .line 37
    iget-object v10, v1, Lf42;->f:Lsu1;

    .line 38
    .line 39
    invoke-virtual {v10}, Lsu1;->a()Z

    .line 40
    .line 41
    .line 42
    move-result v11

    .line 43
    if-eqz v11, :cond_36

    .line 44
    .line 45
    const/4 v10, 0x0

    .line 46
    if-eq v2, v8, :cond_14

    .line 47
    .line 48
    const/4 v11, 0x3

    .line 49
    const v12, 0x7f120103

    .line 50
    .line 51
    .line 52
    const v13, 0x7f120102

    .line 53
    .line 54
    .line 55
    if-eq v2, v11, :cond_9

    .line 56
    .line 57
    const/4 v11, 0x4

    .line 58
    if-eq v2, v11, :cond_2

    .line 59
    .line 60
    if-eq v2, v9, :cond_1

    .line 61
    .line 62
    if-eq v2, v6, :cond_0

    .line 63
    .line 64
    if-eq v2, v7, :cond_37

    .line 65
    .line 66
    const-string v0, "Unknown MRAID command called."

    .line 67
    .line 68
    invoke-static {v0}, Lgi2;->f0(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    return-void

    .line 72
    :cond_0
    iget-object v0, v1, Lf42;->g:Lo82;

    .line 73
    .line 74
    invoke-virtual {v0, v8}, Lo82;->K(Z)V

    .line 75
    .line 76
    .line 77
    return-void

    .line 78
    :cond_1
    move v9, v8

    .line 79
    const/16 v8, 0xe

    .line 80
    .line 81
    const/4 v13, -0x1

    .line 82
    goto/16 :goto_1a

    .line 83
    .line 84
    :cond_2
    new-instance v2, Lm82;

    .line 85
    .line 86
    invoke-direct {v2, v3, v0}, Lm82;-><init>(Lag2;Ljava/util/Map;)V

    .line 87
    .line 88
    .line 89
    iget-object v0, v2, Lm82;->j:Landroid/app/Activity;

    .line 90
    .line 91
    if-nez v0, :cond_3

    .line 92
    .line 93
    const-string v0, "Activity context is not available."

    .line 94
    .line 95
    invoke-virtual {v2, v0}, Lgw3;->G(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    return-void

    .line 99
    :cond_3
    sget-object v3, Lhg4;->C:Lhg4;

    .line 100
    .line 101
    iget-object v4, v3, Lhg4;->c:Llf4;

    .line 102
    .line 103
    new-instance v4, Landroid/content/Intent;

    .line 104
    .line 105
    const-string v5, "android.intent.action.INSERT"

    .line 106
    .line 107
    invoke-direct {v4, v5}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    const-string v5, "vnd.android.cursor.dir/event"

    .line 111
    .line 112
    invoke-virtual {v4, v5}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 113
    .line 114
    .line 115
    move-result-object v4

    .line 116
    const-string v5, "Intent can not be null"

    .line 117
    .line 118
    invoke-static {v4, v5}, Lou1;->k(Ljava/lang/Object;Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 122
    .line 123
    .line 124
    move-result-object v5

    .line 125
    invoke-virtual {v5, v4, v10}, Landroid/content/pm/PackageManager;->queryIntentActivities(Landroid/content/Intent;I)Ljava/util/List;

    .line 126
    .line 127
    .line 128
    move-result-object v4

    .line 129
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    .line 130
    .line 131
    .line 132
    move-result v4

    .line 133
    if-eqz v4, :cond_4

    .line 134
    .line 135
    const-string v0, "This feature is not available on the device."

    .line 136
    .line 137
    invoke-virtual {v2, v0}, Lgw3;->G(Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    return-void

    .line 141
    :cond_4
    invoke-static {v0}, Llf4;->k(Landroid/content/Context;)Landroid/app/AlertDialog$Builder;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    iget-object v3, v3, Lhg4;->h:Lgd2;

    .line 146
    .line 147
    invoke-virtual {v3}, Lgd2;->c()Landroid/content/res/Resources;

    .line 148
    .line 149
    .line 150
    move-result-object v3

    .line 151
    if-eqz v3, :cond_5

    .line 152
    .line 153
    const v4, 0x7f120104

    .line 154
    .line 155
    .line 156
    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object v4

    .line 160
    goto :goto_0

    .line 161
    :cond_5
    const-string v4, "Create calendar event"

    .line 162
    .line 163
    :goto_0
    invoke-virtual {v0, v4}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 164
    .line 165
    .line 166
    if-eqz v3, :cond_6

    .line 167
    .line 168
    const v4, 0x7f120105

    .line 169
    .line 170
    .line 171
    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v4

    .line 175
    goto :goto_1

    .line 176
    :cond_6
    const-string v4, "Allow Ad to create a calendar event?"

    .line 177
    .line 178
    :goto_1
    invoke-virtual {v0, v4}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 179
    .line 180
    .line 181
    if-eqz v3, :cond_7

    .line 182
    .line 183
    invoke-virtual {v3, v13}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object v4

    .line 187
    goto :goto_2

    .line 188
    :cond_7
    const-string v4, "Accept"

    .line 189
    .line 190
    :goto_2
    new-instance v5, Ll82;

    .line 191
    .line 192
    const/4 v6, 0x0

    .line 193
    invoke-direct {v5, v2, v6}, Ll82;-><init>(Lm82;I)V

    .line 194
    .line 195
    .line 196
    invoke-virtual {v0, v4, v5}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 197
    .line 198
    .line 199
    if-eqz v3, :cond_8

    .line 200
    .line 201
    invoke-virtual {v3, v12}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object v3

    .line 205
    goto :goto_3

    .line 206
    :cond_8
    const-string v3, "Decline"

    .line 207
    .line 208
    :goto_3
    new-instance v4, Ll82;

    .line 209
    .line 210
    const/4 v5, 0x1

    .line 211
    invoke-direct {v4, v2, v5}, Ll82;-><init>(Lm82;I)V

    .line 212
    .line 213
    .line 214
    invoke-virtual {v0, v3, v4}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 215
    .line 216
    .line 217
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    .line 218
    .line 219
    .line 220
    move-result-object v0

    .line 221
    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    .line 222
    .line 223
    .line 224
    return-void

    .line 225
    :cond_9
    new-instance v2, Lp82;

    .line 226
    .line 227
    invoke-direct {v2, v3, v0}, Lp82;-><init>(Lag2;Ljava/util/Map;)V

    .line 228
    .line 229
    .line 230
    iget-object v3, v2, Lp82;->i:Landroid/app/Activity;

    .line 231
    .line 232
    if-nez v3, :cond_a

    .line 233
    .line 234
    const-string v0, "Activity context is not available"

    .line 235
    .line 236
    invoke-virtual {v2, v0}, Lgw3;->G(Ljava/lang/String;)V

    .line 237
    .line 238
    .line 239
    return-void

    .line 240
    :cond_a
    sget-object v4, Lhg4;->C:Lhg4;

    .line 241
    .line 242
    iget-object v5, v4, Lhg4;->c:Llf4;

    .line 243
    .line 244
    sget-object v5, Lgz1;->b:Lgz1;

    .line 245
    .line 246
    invoke-static {v3, v5}, Lyb;->u(Landroid/content/Context;Ljava/util/concurrent/Callable;)Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    move-result-object v5

    .line 250
    check-cast v5, Ljava/lang/Boolean;

    .line 251
    .line 252
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 253
    .line 254
    .line 255
    move-result v5

    .line 256
    if-eqz v5, :cond_13

    .line 257
    .line 258
    invoke-static {v3}, Lza1;->a(Landroid/content/Context;)Lzj0;

    .line 259
    .line 260
    .line 261
    move-result-object v5

    .line 262
    const-string v6, "android.permission.WRITE_EXTERNAL_STORAGE"

    .line 263
    .line 264
    iget-object v5, v5, Lzj0;->f:Landroid/content/Context;

    .line 265
    .line 266
    invoke-virtual {v5, v6}, Landroid/content/Context;->checkCallingOrSelfPermission(Ljava/lang/String;)I

    .line 267
    .line 268
    .line 269
    move-result v5

    .line 270
    if-nez v5, :cond_13

    .line 271
    .line 272
    const-string v5, "iurl"

    .line 273
    .line 274
    invoke-interface {v0, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 275
    .line 276
    .line 277
    move-result-object v0

    .line 278
    check-cast v0, Ljava/lang/String;

    .line 279
    .line 280
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 281
    .line 282
    .line 283
    move-result v5

    .line 284
    if-eqz v5, :cond_b

    .line 285
    .line 286
    const-string v0, "Image url cannot be empty."

    .line 287
    .line 288
    invoke-virtual {v2, v0}, Lgw3;->G(Ljava/lang/String;)V

    .line 289
    .line 290
    .line 291
    return-void

    .line 292
    :cond_b
    invoke-static {v0}, Landroid/webkit/URLUtil;->isValidUrl(Ljava/lang/String;)Z

    .line 293
    .line 294
    .line 295
    move-result v5

    .line 296
    if-eqz v5, :cond_12

    .line 297
    .line 298
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 299
    .line 300
    .line 301
    move-result-object v5

    .line 302
    invoke-virtual {v5}, Landroid/net/Uri;->getLastPathSegment()Ljava/lang/String;

    .line 303
    .line 304
    .line 305
    move-result-object v5

    .line 306
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 307
    .line 308
    .line 309
    move-result v6

    .line 310
    if-eqz v6, :cond_c

    .line 311
    .line 312
    goto :goto_8

    .line 313
    :cond_c
    const-string v6, "([^\\s]+(\\.(?i)(jpg|png|gif|bmp|webp))$)"

    .line 314
    .line 315
    invoke-virtual {v5, v6}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    .line 316
    .line 317
    .line 318
    move-result v6

    .line 319
    if-eqz v6, :cond_11

    .line 320
    .line 321
    iget-object v4, v4, Lhg4;->h:Lgd2;

    .line 322
    .line 323
    invoke-virtual {v4}, Lgd2;->c()Landroid/content/res/Resources;

    .line 324
    .line 325
    .line 326
    move-result-object v4

    .line 327
    invoke-static {v3}, Llf4;->k(Landroid/content/Context;)Landroid/app/AlertDialog$Builder;

    .line 328
    .line 329
    .line 330
    move-result-object v3

    .line 331
    if-eqz v4, :cond_d

    .line 332
    .line 333
    const v6, 0x7f120100

    .line 334
    .line 335
    .line 336
    invoke-virtual {v4, v6}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 337
    .line 338
    .line 339
    move-result-object v6

    .line 340
    goto :goto_4

    .line 341
    :cond_d
    const-string v6, "Save image"

    .line 342
    .line 343
    :goto_4
    invoke-virtual {v3, v6}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 344
    .line 345
    .line 346
    if-eqz v4, :cond_e

    .line 347
    .line 348
    const v6, 0x7f120101

    .line 349
    .line 350
    .line 351
    invoke-virtual {v4, v6}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 352
    .line 353
    .line 354
    move-result-object v6

    .line 355
    goto :goto_5

    .line 356
    :cond_e
    const-string v6, "Allow Ad to store image in Picture gallery?"

    .line 357
    .line 358
    :goto_5
    invoke-virtual {v3, v6}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 359
    .line 360
    .line 361
    if-eqz v4, :cond_f

    .line 362
    .line 363
    invoke-virtual {v4, v13}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 364
    .line 365
    .line 366
    move-result-object v6

    .line 367
    goto :goto_6

    .line 368
    :cond_f
    const-string v6, "Accept"

    .line 369
    .line 370
    :goto_6
    new-instance v7, Loz2;

    .line 371
    .line 372
    invoke-direct {v7, v2, v0, v5}, Loz2;-><init>(Lp82;Ljava/lang/String;Ljava/lang/String;)V

    .line 373
    .line 374
    .line 375
    invoke-virtual {v3, v6, v7}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 376
    .line 377
    .line 378
    if-eqz v4, :cond_10

    .line 379
    .line 380
    invoke-virtual {v4, v12}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 381
    .line 382
    .line 383
    move-result-object v0

    .line 384
    goto :goto_7

    .line 385
    :cond_10
    const-string v0, "Decline"

    .line 386
    .line 387
    :goto_7
    new-instance v4, Lk70;

    .line 388
    .line 389
    const/4 v5, 0x4

    .line 390
    invoke-direct {v4, v5, v2}, Lk70;-><init>(ILjava/lang/Object;)V

    .line 391
    .line 392
    .line 393
    invoke-virtual {v3, v0, v4}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 394
    .line 395
    .line 396
    invoke-virtual {v3}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    .line 397
    .line 398
    .line 399
    move-result-object v0

    .line 400
    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    .line 401
    .line 402
    .line 403
    return-void

    .line 404
    :cond_11
    :goto_8
    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 405
    .line 406
    .line 407
    move-result-object v0

    .line 408
    const-string v3, "Image type not recognized: "

    .line 409
    .line 410
    invoke-virtual {v3, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 411
    .line 412
    .line 413
    move-result-object v0

    .line 414
    invoke-virtual {v2, v0}, Lgw3;->G(Ljava/lang/String;)V

    .line 415
    .line 416
    .line 417
    return-void

    .line 418
    :cond_12
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 419
    .line 420
    .line 421
    move-result-object v0

    .line 422
    const-string v3, "Invalid image url: "

    .line 423
    .line 424
    invoke-virtual {v3, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 425
    .line 426
    .line 427
    move-result-object v0

    .line 428
    invoke-virtual {v2, v0}, Lgw3;->G(Ljava/lang/String;)V

    .line 429
    .line 430
    .line 431
    return-void

    .line 432
    :cond_13
    const-string v0, "Feature is not supported by the device."

    .line 433
    .line 434
    invoke-virtual {v2, v0}, Lgw3;->G(Ljava/lang/String;)V

    .line 435
    .line 436
    .line 437
    return-void

    .line 438
    :cond_14
    iget-object v2, v1, Lf42;->g:Lo82;

    .line 439
    .line 440
    iget-object v3, v2, Lo82;->q:Ljava/lang/Object;

    .line 441
    .line 442
    const-string v6, "Cannot show popup window: "

    .line 443
    .line 444
    monitor-enter v3

    .line 445
    :try_start_0
    iget-object v7, v2, Lo82;->s:Landroid/app/Activity;

    .line 446
    .line 447
    if-nez v7, :cond_15

    .line 448
    .line 449
    const-string v0, "Not an activity context. Cannot resize."

    .line 450
    .line 451
    invoke-virtual {v2, v0}, Lgw3;->G(Ljava/lang/String;)V

    .line 452
    .line 453
    .line 454
    monitor-exit v3

    .line 455
    return-void

    .line 456
    :catchall_0
    move-exception v0

    .line 457
    goto/16 :goto_19

    .line 458
    .line 459
    :cond_15
    iget-object v9, v2, Lo82;->r:Lag2;

    .line 460
    .line 461
    invoke-interface {v9}, Lag2;->x()Lzq;

    .line 462
    .line 463
    .line 464
    move-result-object v11

    .line 465
    if-nez v11, :cond_16

    .line 466
    .line 467
    const-string v0, "Webview is not yet available, size is not set."

    .line 468
    .line 469
    invoke-virtual {v2, v0}, Lgw3;->G(Ljava/lang/String;)V

    .line 470
    .line 471
    .line 472
    monitor-exit v3

    .line 473
    return-void

    .line 474
    :cond_16
    invoke-interface {v9}, Lag2;->x()Lzq;

    .line 475
    .line 476
    .line 477
    move-result-object v11

    .line 478
    invoke-virtual {v11}, Lzq;->b()Z

    .line 479
    .line 480
    .line 481
    move-result v11

    .line 482
    if-eqz v11, :cond_17

    .line 483
    .line 484
    const-string v0, "Is interstitial. Cannot resize an interstitial."

    .line 485
    .line 486
    invoke-virtual {v2, v0}, Lgw3;->G(Ljava/lang/String;)V

    .line 487
    .line 488
    .line 489
    monitor-exit v3

    .line 490
    return-void

    .line 491
    :cond_17
    invoke-interface {v9}, Lag2;->Y0()Z

    .line 492
    .line 493
    .line 494
    move-result v11

    .line 495
    if-eqz v11, :cond_18

    .line 496
    .line 497
    const-string v0, "Cannot resize an expanded banner."

    .line 498
    .line 499
    invoke-virtual {v2, v0}, Lgw3;->G(Ljava/lang/String;)V

    .line 500
    .line 501
    .line 502
    monitor-exit v3

    .line 503
    return-void

    .line 504
    :cond_18
    const-string v11, "width"

    .line 505
    .line 506
    invoke-interface {v0, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 507
    .line 508
    .line 509
    move-result-object v11

    .line 510
    check-cast v11, Ljava/lang/CharSequence;

    .line 511
    .line 512
    invoke-static {v11}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 513
    .line 514
    .line 515
    move-result v11

    .line 516
    if-nez v11, :cond_19

    .line 517
    .line 518
    sget-object v11, Lhg4;->C:Lhg4;

    .line 519
    .line 520
    iget-object v11, v11, Lhg4;->c:Llf4;

    .line 521
    .line 522
    const-string v11, "width"

    .line 523
    .line 524
    invoke-interface {v0, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 525
    .line 526
    .line 527
    move-result-object v11

    .line 528
    check-cast v11, Ljava/lang/String;

    .line 529
    .line 530
    invoke-static {v11}, Llf4;->n(Ljava/lang/String;)I

    .line 531
    .line 532
    .line 533
    move-result v11

    .line 534
    iput v11, v2, Lo82;->p:I

    .line 535
    .line 536
    :cond_19
    const-string v11, "height"

    .line 537
    .line 538
    invoke-interface {v0, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 539
    .line 540
    .line 541
    move-result-object v11

    .line 542
    check-cast v11, Ljava/lang/CharSequence;

    .line 543
    .line 544
    invoke-static {v11}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 545
    .line 546
    .line 547
    move-result v11

    .line 548
    if-nez v11, :cond_1a

    .line 549
    .line 550
    sget-object v11, Lhg4;->C:Lhg4;

    .line 551
    .line 552
    iget-object v11, v11, Lhg4;->c:Llf4;

    .line 553
    .line 554
    const-string v11, "height"

    .line 555
    .line 556
    invoke-interface {v0, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 557
    .line 558
    .line 559
    move-result-object v11

    .line 560
    check-cast v11, Ljava/lang/String;

    .line 561
    .line 562
    invoke-static {v11}, Llf4;->n(Ljava/lang/String;)I

    .line 563
    .line 564
    .line 565
    move-result v11

    .line 566
    iput v11, v2, Lo82;->m:I

    .line 567
    .line 568
    :cond_1a
    const-string v11, "offsetX"

    .line 569
    .line 570
    invoke-interface {v0, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 571
    .line 572
    .line 573
    move-result-object v11

    .line 574
    check-cast v11, Ljava/lang/CharSequence;

    .line 575
    .line 576
    invoke-static {v11}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 577
    .line 578
    .line 579
    move-result v11

    .line 580
    if-nez v11, :cond_1b

    .line 581
    .line 582
    sget-object v11, Lhg4;->C:Lhg4;

    .line 583
    .line 584
    iget-object v11, v11, Lhg4;->c:Llf4;

    .line 585
    .line 586
    const-string v11, "offsetX"

    .line 587
    .line 588
    invoke-interface {v0, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 589
    .line 590
    .line 591
    move-result-object v11

    .line 592
    check-cast v11, Ljava/lang/String;

    .line 593
    .line 594
    invoke-static {v11}, Llf4;->n(Ljava/lang/String;)I

    .line 595
    .line 596
    .line 597
    move-result v11

    .line 598
    iput v11, v2, Lo82;->n:I

    .line 599
    .line 600
    :cond_1b
    const-string v11, "offsetY"

    .line 601
    .line 602
    invoke-interface {v0, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 603
    .line 604
    .line 605
    move-result-object v11

    .line 606
    check-cast v11, Ljava/lang/CharSequence;

    .line 607
    .line 608
    invoke-static {v11}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 609
    .line 610
    .line 611
    move-result v11

    .line 612
    if-nez v11, :cond_1c

    .line 613
    .line 614
    sget-object v11, Lhg4;->C:Lhg4;

    .line 615
    .line 616
    iget-object v11, v11, Lhg4;->c:Llf4;

    .line 617
    .line 618
    const-string v11, "offsetY"

    .line 619
    .line 620
    invoke-interface {v0, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 621
    .line 622
    .line 623
    move-result-object v11

    .line 624
    check-cast v11, Ljava/lang/String;

    .line 625
    .line 626
    invoke-static {v11}, Llf4;->n(Ljava/lang/String;)I

    .line 627
    .line 628
    .line 629
    move-result v11

    .line 630
    iput v11, v2, Lo82;->o:I

    .line 631
    .line 632
    :cond_1c
    const-string v11, "allowOffscreen"

    .line 633
    .line 634
    invoke-interface {v0, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 635
    .line 636
    .line 637
    move-result-object v11

    .line 638
    check-cast v11, Ljava/lang/CharSequence;

    .line 639
    .line 640
    invoke-static {v11}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 641
    .line 642
    .line 643
    move-result v11

    .line 644
    if-nez v11, :cond_1d

    .line 645
    .line 646
    const-string v11, "allowOffscreen"

    .line 647
    .line 648
    invoke-interface {v0, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 649
    .line 650
    .line 651
    move-result-object v11

    .line 652
    check-cast v11, Ljava/lang/String;

    .line 653
    .line 654
    invoke-static {v11}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    .line 655
    .line 656
    .line 657
    move-result v11

    .line 658
    iput-boolean v11, v2, Lo82;->j:Z

    .line 659
    .line 660
    :cond_1d
    const-string v11, "customClosePosition"

    .line 661
    .line 662
    invoke-interface {v0, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 663
    .line 664
    .line 665
    move-result-object v0

    .line 666
    check-cast v0, Ljava/lang/String;

    .line 667
    .line 668
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 669
    .line 670
    .line 671
    move-result v11

    .line 672
    if-nez v11, :cond_1e

    .line 673
    .line 674
    iput-object v0, v2, Lo82;->i:Ljava/lang/String;

    .line 675
    .line 676
    :cond_1e
    iget v0, v2, Lo82;->p:I

    .line 677
    .line 678
    if-ltz v0, :cond_35

    .line 679
    .line 680
    iget v0, v2, Lo82;->m:I

    .line 681
    .line 682
    if-ltz v0, :cond_35

    .line 683
    .line 684
    invoke-virtual {v7}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 685
    .line 686
    .line 687
    move-result-object v0

    .line 688
    if-eqz v0, :cond_34

    .line 689
    .line 690
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 691
    .line 692
    .line 693
    move-result-object v11

    .line 694
    if-nez v11, :cond_1f

    .line 695
    .line 696
    goto/16 :goto_18

    .line 697
    .line 698
    :cond_1f
    sget-object v11, Lhg4;->C:Lhg4;

    .line 699
    .line 700
    iget-object v11, v11, Lhg4;->c:Llf4;

    .line 701
    .line 702
    invoke-static {v7}, Llf4;->p(Landroid/app/Activity;)[I

    .line 703
    .line 704
    .line 705
    move-result-object v11

    .line 706
    sget-object v13, Lsv1;->f:Lsv1;

    .line 707
    .line 708
    iget-object v14, v13, Lsv1;->a:Lj63;

    .line 709
    .line 710
    aget v15, v11, v10

    .line 711
    .line 712
    invoke-virtual {v14, v7, v15}, Lj63;->h(Landroid/content/Context;I)I

    .line 713
    .line 714
    .line 715
    move-result v14

    .line 716
    iget-object v15, v13, Lsv1;->a:Lj63;

    .line 717
    .line 718
    aget v11, v11, v8

    .line 719
    .line 720
    invoke-virtual {v15, v7, v11}, Lj63;->h(Landroid/content/Context;I)I

    .line 721
    .line 722
    .line 723
    move-result v11

    .line 724
    filled-new-array {v14, v11}, [I

    .line 725
    .line 726
    .line 727
    move-result-object v11

    .line 728
    invoke-static {v7}, Llf4;->q(Landroid/app/Activity;)[I

    .line 729
    .line 730
    .line 731
    move-result-object v14

    .line 732
    aget v15, v11, v10

    .line 733
    .line 734
    aget v11, v11, v8

    .line 735
    .line 736
    iget v12, v2, Lo82;->p:I

    .line 737
    .line 738
    const/16 v5, 0x32

    .line 739
    .line 740
    if-lt v12, v5, :cond_20

    .line 741
    .line 742
    if-le v12, v15, :cond_21

    .line 743
    .line 744
    :cond_20
    move/from16 p2, v5

    .line 745
    .line 746
    goto/16 :goto_13

    .line 747
    .line 748
    :cond_21
    iget v4, v2, Lo82;->m:I

    .line 749
    .line 750
    if-lt v4, v5, :cond_22

    .line 751
    .line 752
    if-le v4, v11, :cond_23

    .line 753
    .line 754
    :cond_22
    move/from16 p2, v5

    .line 755
    .line 756
    goto/16 :goto_12

    .line 757
    .line 758
    :cond_23
    if-ne v4, v11, :cond_25

    .line 759
    .line 760
    if-ne v12, v15, :cond_25

    .line 761
    .line 762
    const-string v4, "Cannot resize to a full-screen ad."

    .line 763
    .line 764
    invoke-static {v4}, Lgi2;->i0(Ljava/lang/String;)V

    .line 765
    .line 766
    .line 767
    move/from16 p2, v5

    .line 768
    .line 769
    :cond_24
    :goto_9
    const/4 v12, 0x0

    .line 770
    goto/16 :goto_14

    .line 771
    .line 772
    :cond_25
    iget-boolean v11, v2, Lo82;->j:Z

    .line 773
    .line 774
    if-eqz v11, :cond_29

    .line 775
    .line 776
    iget-object v11, v2, Lo82;->i:Ljava/lang/String;

    .line 777
    .line 778
    invoke-virtual {v11}, Ljava/lang/String;->hashCode()I

    .line 779
    .line 780
    .line 781
    move-result v17
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 782
    sparse-switch v17, :sswitch_data_0

    .line 783
    .line 784
    .line 785
    :cond_26
    move/from16 p2, v5

    .line 786
    .line 787
    goto/16 :goto_d

    .line 788
    .line 789
    :sswitch_0
    const-string v4, "top-center"

    .line 790
    .line 791
    invoke-virtual {v11, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 792
    .line 793
    .line 794
    move-result v4

    .line 795
    if-eqz v4, :cond_26

    .line 796
    .line 797
    :try_start_1
    iget v4, v2, Lo82;->k:I

    .line 798
    .line 799
    iget v11, v2, Lo82;->n:I

    .line 800
    .line 801
    shr-int/2addr v12, v8

    .line 802
    add-int/2addr v4, v11

    .line 803
    add-int/2addr v4, v12

    .line 804
    add-int/lit8 v4, v4, -0x19

    .line 805
    .line 806
    iget v11, v2, Lo82;->l:I

    .line 807
    .line 808
    iget v12, v2, Lo82;->o:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 809
    .line 810
    add-int/2addr v11, v12

    .line 811
    move/from16 p2, v5

    .line 812
    .line 813
    goto/16 :goto_f

    .line 814
    .line 815
    :sswitch_1
    move/from16 p2, v5

    .line 816
    .line 817
    const-string v5, "bottom-center"

    .line 818
    .line 819
    invoke-virtual {v11, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 820
    .line 821
    .line 822
    move-result v5

    .line 823
    if-eqz v5, :cond_27

    .line 824
    .line 825
    :try_start_2
    iget v5, v2, Lo82;->k:I

    .line 826
    .line 827
    iget v11, v2, Lo82;->n:I

    .line 828
    .line 829
    shr-int/2addr v12, v8

    .line 830
    add-int/2addr v5, v11

    .line 831
    add-int/2addr v5, v12

    .line 832
    add-int/lit8 v5, v5, -0x19

    .line 833
    .line 834
    iget v11, v2, Lo82;->l:I

    .line 835
    .line 836
    :goto_a
    iget v12, v2, Lo82;->o:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 837
    .line 838
    add-int/2addr v11, v12

    .line 839
    add-int/2addr v11, v4

    .line 840
    add-int/lit8 v11, v11, -0x32

    .line 841
    .line 842
    :goto_b
    move v4, v5

    .line 843
    goto :goto_f

    .line 844
    :sswitch_2
    move/from16 p2, v5

    .line 845
    .line 846
    const-string v5, "bottom-right"

    .line 847
    .line 848
    invoke-virtual {v11, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 849
    .line 850
    .line 851
    move-result v5

    .line 852
    if-eqz v5, :cond_27

    .line 853
    .line 854
    :try_start_3
    iget v5, v2, Lo82;->k:I

    .line 855
    .line 856
    iget v11, v2, Lo82;->n:I

    .line 857
    .line 858
    add-int/2addr v5, v11

    .line 859
    add-int/2addr v5, v12

    .line 860
    add-int/lit8 v5, v5, -0x32

    .line 861
    .line 862
    iget v11, v2, Lo82;->l:I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 863
    .line 864
    goto :goto_a

    .line 865
    :sswitch_3
    move/from16 p2, v5

    .line 866
    .line 867
    const-string v5, "bottom-left"

    .line 868
    .line 869
    invoke-virtual {v11, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 870
    .line 871
    .line 872
    move-result v5

    .line 873
    if-eqz v5, :cond_27

    .line 874
    .line 875
    :try_start_4
    iget v5, v2, Lo82;->k:I

    .line 876
    .line 877
    iget v11, v2, Lo82;->n:I

    .line 878
    .line 879
    add-int/2addr v5, v11

    .line 880
    iget v11, v2, Lo82;->l:I
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 881
    .line 882
    goto :goto_a

    .line 883
    :sswitch_4
    move/from16 p2, v5

    .line 884
    .line 885
    const-string v4, "top-left"

    .line 886
    .line 887
    invoke-virtual {v11, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 888
    .line 889
    .line 890
    move-result v4

    .line 891
    if-eqz v4, :cond_27

    .line 892
    .line 893
    :try_start_5
    iget v4, v2, Lo82;->k:I

    .line 894
    .line 895
    iget v5, v2, Lo82;->n:I

    .line 896
    .line 897
    add-int/2addr v4, v5

    .line 898
    iget v5, v2, Lo82;->l:I
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 899
    .line 900
    goto :goto_e

    .line 901
    :goto_c
    add-int/2addr v11, v5

    .line 902
    goto :goto_f

    .line 903
    :sswitch_5
    move/from16 p2, v5

    .line 904
    .line 905
    const-string v5, "center"

    .line 906
    .line 907
    invoke-virtual {v11, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 908
    .line 909
    .line 910
    move-result v5

    .line 911
    if-eqz v5, :cond_27

    .line 912
    .line 913
    :try_start_6
    iget v5, v2, Lo82;->k:I

    .line 914
    .line 915
    iget v11, v2, Lo82;->n:I

    .line 916
    .line 917
    shr-int/2addr v12, v8

    .line 918
    add-int/2addr v5, v11

    .line 919
    add-int/2addr v5, v12

    .line 920
    add-int/lit8 v5, v5, -0x19

    .line 921
    .line 922
    iget v11, v2, Lo82;->l:I

    .line 923
    .line 924
    iget v12, v2, Lo82;->o:I

    .line 925
    .line 926
    add-int/2addr v11, v12

    .line 927
    shr-int/2addr v4, v8

    .line 928
    add-int/2addr v11, v4

    .line 929
    add-int/lit8 v11, v11, -0x19

    .line 930
    .line 931
    goto :goto_b

    .line 932
    :cond_27
    :goto_d
    iget v4, v2, Lo82;->k:I

    .line 933
    .line 934
    iget v5, v2, Lo82;->n:I

    .line 935
    .line 936
    add-int/2addr v4, v5

    .line 937
    add-int/2addr v4, v12

    .line 938
    add-int/lit8 v4, v4, -0x32

    .line 939
    .line 940
    iget v5, v2, Lo82;->l:I

    .line 941
    .line 942
    :goto_e
    iget v11, v2, Lo82;->o:I

    .line 943
    .line 944
    goto :goto_c

    .line 945
    :goto_f
    if-ltz v4, :cond_24

    .line 946
    .line 947
    add-int/lit8 v4, v4, 0x32

    .line 948
    .line 949
    if-gt v4, v15, :cond_24

    .line 950
    .line 951
    aget v4, v14, v10

    .line 952
    .line 953
    if-lt v11, v4, :cond_24

    .line 954
    .line 955
    add-int/lit8 v11, v11, 0x32

    .line 956
    .line 957
    aget v4, v14, v8

    .line 958
    .line 959
    if-le v11, v4, :cond_28

    .line 960
    .line 961
    goto/16 :goto_9

    .line 962
    .line 963
    :cond_28
    iget v4, v2, Lo82;->k:I

    .line 964
    .line 965
    iget v5, v2, Lo82;->n:I

    .line 966
    .line 967
    add-int/2addr v4, v5

    .line 968
    iget v5, v2, Lo82;->l:I

    .line 969
    .line 970
    iget v11, v2, Lo82;->o:I

    .line 971
    .line 972
    add-int/2addr v5, v11

    .line 973
    filled-new-array {v4, v5}, [I

    .line 974
    .line 975
    .line 976
    move-result-object v12

    .line 977
    goto :goto_14

    .line 978
    :cond_29
    move/from16 p2, v5

    .line 979
    .line 980
    invoke-static {v7}, Llf4;->p(Landroid/app/Activity;)[I

    .line 981
    .line 982
    .line 983
    move-result-object v4

    .line 984
    iget-object v5, v13, Lsv1;->a:Lj63;

    .line 985
    .line 986
    aget v11, v4, v10

    .line 987
    .line 988
    invoke-virtual {v5, v7, v11}, Lj63;->h(Landroid/content/Context;I)I

    .line 989
    .line 990
    .line 991
    move-result v5

    .line 992
    iget-object v11, v13, Lsv1;->a:Lj63;

    .line 993
    .line 994
    aget v4, v4, v8

    .line 995
    .line 996
    invoke-virtual {v11, v7, v4}, Lj63;->h(Landroid/content/Context;I)I

    .line 997
    .line 998
    .line 999
    move-result v4

    .line 1000
    filled-new-array {v5, v4}, [I

    .line 1001
    .line 1002
    .line 1003
    move-result-object v4

    .line 1004
    invoke-static {v7}, Llf4;->q(Landroid/app/Activity;)[I

    .line 1005
    .line 1006
    .line 1007
    move-result-object v5

    .line 1008
    aget v4, v4, v10

    .line 1009
    .line 1010
    iget v11, v2, Lo82;->k:I

    .line 1011
    .line 1012
    iget v12, v2, Lo82;->n:I

    .line 1013
    .line 1014
    add-int/2addr v11, v12

    .line 1015
    iget v12, v2, Lo82;->l:I

    .line 1016
    .line 1017
    iget v14, v2, Lo82;->o:I

    .line 1018
    .line 1019
    add-int/2addr v12, v14

    .line 1020
    if-gez v11, :cond_2a

    .line 1021
    .line 1022
    move v11, v10

    .line 1023
    goto :goto_10

    .line 1024
    :cond_2a
    iget v14, v2, Lo82;->p:I

    .line 1025
    .line 1026
    add-int v15, v11, v14

    .line 1027
    .line 1028
    if-le v15, v4, :cond_2b

    .line 1029
    .line 1030
    sub-int v11, v4, v14

    .line 1031
    .line 1032
    :cond_2b
    :goto_10
    aget v4, v5, v10

    .line 1033
    .line 1034
    if-ge v12, v4, :cond_2c

    .line 1035
    .line 1036
    move v12, v4

    .line 1037
    goto :goto_11

    .line 1038
    :cond_2c
    iget v4, v2, Lo82;->m:I

    .line 1039
    .line 1040
    add-int v14, v12, v4

    .line 1041
    .line 1042
    aget v5, v5, v8

    .line 1043
    .line 1044
    if-le v14, v5, :cond_2d

    .line 1045
    .line 1046
    sub-int v12, v5, v4

    .line 1047
    .line 1048
    :cond_2d
    :goto_11
    filled-new-array {v11, v12}, [I

    .line 1049
    .line 1050
    .line 1051
    move-result-object v12

    .line 1052
    goto :goto_14

    .line 1053
    :goto_12
    const-string v4, "Height is too small or too large."

    .line 1054
    .line 1055
    invoke-static {v4}, Lgi2;->i0(Ljava/lang/String;)V

    .line 1056
    .line 1057
    .line 1058
    goto/16 :goto_9

    .line 1059
    .line 1060
    :goto_13
    const-string v4, "Width is too small or too large."

    .line 1061
    .line 1062
    invoke-static {v4}, Lgi2;->i0(Ljava/lang/String;)V

    .line 1063
    .line 1064
    .line 1065
    goto/16 :goto_9

    .line 1066
    .line 1067
    :goto_14
    if-nez v12, :cond_2e

    .line 1068
    .line 1069
    const-string v0, "Resize location out of screen or close button is not visible."

    .line 1070
    .line 1071
    invoke-virtual {v2, v0}, Lgw3;->G(Ljava/lang/String;)V

    .line 1072
    .line 1073
    .line 1074
    monitor-exit v3

    .line 1075
    return-void

    .line 1076
    :cond_2e
    iget-object v4, v13, Lsv1;->a:Lj63;

    .line 1077
    .line 1078
    iget v4, v2, Lo82;->p:I

    .line 1079
    .line 1080
    invoke-virtual {v7}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 1081
    .line 1082
    .line 1083
    move-result-object v5

    .line 1084
    invoke-virtual {v5}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 1085
    .line 1086
    .line 1087
    move-result-object v5

    .line 1088
    invoke-static {v5, v4}, Lj63;->m(Landroid/util/DisplayMetrics;I)I

    .line 1089
    .line 1090
    .line 1091
    move-result v4

    .line 1092
    iget v5, v2, Lo82;->m:I

    .line 1093
    .line 1094
    invoke-virtual {v7}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 1095
    .line 1096
    .line 1097
    move-result-object v11

    .line 1098
    invoke-virtual {v11}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 1099
    .line 1100
    .line 1101
    move-result-object v11

    .line 1102
    invoke-static {v11, v5}, Lj63;->m(Landroid/util/DisplayMetrics;I)I

    .line 1103
    .line 1104
    .line 1105
    move-result v5

    .line 1106
    move-object v11, v9

    .line 1107
    check-cast v11, Landroid/view/View;

    .line 1108
    .line 1109
    invoke-virtual {v11}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 1110
    .line 1111
    .line 1112
    move-result-object v11

    .line 1113
    instance-of v13, v11, Landroid/view/ViewGroup;

    .line 1114
    .line 1115
    if-eqz v13, :cond_33

    .line 1116
    .line 1117
    check-cast v11, Landroid/view/ViewGroup;

    .line 1118
    .line 1119
    move-object v13, v9

    .line 1120
    check-cast v13, Landroid/view/View;

    .line 1121
    .line 1122
    invoke-virtual {v11, v13}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 1123
    .line 1124
    .line 1125
    iget-object v13, v2, Lo82;->x:Landroid/widget/PopupWindow;

    .line 1126
    .line 1127
    if-nez v13, :cond_2f

    .line 1128
    .line 1129
    iput-object v11, v2, Lo82;->z:Landroid/view/ViewGroup;

    .line 1130
    .line 1131
    move-object v11, v9

    .line 1132
    check-cast v11, Landroid/view/View;

    .line 1133
    .line 1134
    invoke-virtual {v11, v8}, Landroid/view/View;->setDrawingCacheEnabled(Z)V

    .line 1135
    .line 1136
    .line 1137
    move-object v11, v9

    .line 1138
    check-cast v11, Landroid/view/View;

    .line 1139
    .line 1140
    invoke-virtual {v11}, Landroid/view/View;->getDrawingCache()Landroid/graphics/Bitmap;

    .line 1141
    .line 1142
    .line 1143
    move-result-object v11

    .line 1144
    invoke-static {v11}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    .line 1145
    .line 1146
    .line 1147
    move-result-object v11

    .line 1148
    move-object v13, v9

    .line 1149
    check-cast v13, Landroid/view/View;

    .line 1150
    .line 1151
    invoke-virtual {v13, v10}, Landroid/view/View;->setDrawingCacheEnabled(Z)V

    .line 1152
    .line 1153
    .line 1154
    new-instance v13, Landroid/widget/ImageView;

    .line 1155
    .line 1156
    invoke-direct {v13, v7}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 1157
    .line 1158
    .line 1159
    iput-object v13, v2, Lo82;->u:Landroid/widget/ImageView;

    .line 1160
    .line 1161
    invoke-virtual {v13, v11}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 1162
    .line 1163
    .line 1164
    invoke-interface {v9}, Lag2;->x()Lzq;

    .line 1165
    .line 1166
    .line 1167
    move-result-object v11

    .line 1168
    iput-object v11, v2, Lo82;->t:Lzq;

    .line 1169
    .line 1170
    iget-object v11, v2, Lo82;->z:Landroid/view/ViewGroup;

    .line 1171
    .line 1172
    iget-object v13, v2, Lo82;->u:Landroid/widget/ImageView;

    .line 1173
    .line 1174
    invoke-virtual {v11, v13}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1175
    .line 1176
    .line 1177
    goto :goto_15

    .line 1178
    :cond_2f
    invoke-virtual {v13}, Landroid/widget/PopupWindow;->dismiss()V

    .line 1179
    .line 1180
    .line 1181
    :goto_15
    new-instance v11, Landroid/widget/RelativeLayout;

    .line 1182
    .line 1183
    invoke-direct {v11, v7}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    .line 1184
    .line 1185
    .line 1186
    iput-object v11, v2, Lo82;->y:Landroid/widget/RelativeLayout;

    .line 1187
    .line 1188
    invoke-virtual {v11, v10}, Landroid/view/View;->setBackgroundColor(I)V

    .line 1189
    .line 1190
    .line 1191
    iget-object v11, v2, Lo82;->y:Landroid/widget/RelativeLayout;

    .line 1192
    .line 1193
    new-instance v13, Landroid/view/ViewGroup$LayoutParams;

    .line 1194
    .line 1195
    invoke-direct {v13, v4, v5}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 1196
    .line 1197
    .line 1198
    invoke-virtual {v11, v13}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1199
    .line 1200
    .line 1201
    iget-object v11, v2, Lo82;->y:Landroid/widget/RelativeLayout;

    .line 1202
    .line 1203
    new-instance v13, Landroid/widget/PopupWindow;

    .line 1204
    .line 1205
    invoke-direct {v13, v11, v4, v5, v10}, Landroid/widget/PopupWindow;-><init>(Landroid/view/View;IIZ)V

    .line 1206
    .line 1207
    .line 1208
    iput-object v13, v2, Lo82;->x:Landroid/widget/PopupWindow;

    .line 1209
    .line 1210
    invoke-virtual {v13, v10}, Landroid/widget/PopupWindow;->setOutsideTouchable(Z)V

    .line 1211
    .line 1212
    .line 1213
    iget-object v11, v2, Lo82;->x:Landroid/widget/PopupWindow;

    .line 1214
    .line 1215
    invoke-virtual {v11, v8}, Landroid/widget/PopupWindow;->setTouchable(Z)V

    .line 1216
    .line 1217
    .line 1218
    iget-object v11, v2, Lo82;->x:Landroid/widget/PopupWindow;

    .line 1219
    .line 1220
    iget-boolean v13, v2, Lo82;->j:Z

    .line 1221
    .line 1222
    xor-int/2addr v13, v8

    .line 1223
    invoke-virtual {v11, v13}, Landroid/widget/PopupWindow;->setClippingEnabled(Z)V

    .line 1224
    .line 1225
    .line 1226
    iget-object v11, v2, Lo82;->y:Landroid/widget/RelativeLayout;

    .line 1227
    .line 1228
    check-cast v9, Landroid/view/View;

    .line 1229
    .line 1230
    const/4 v13, -0x1

    .line 1231
    invoke-virtual {v11, v9, v13, v13}, Landroid/view/ViewGroup;->addView(Landroid/view/View;II)V

    .line 1232
    .line 1233
    .line 1234
    new-instance v9, Landroid/widget/LinearLayout;

    .line 1235
    .line 1236
    invoke-direct {v9, v7}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 1237
    .line 1238
    .line 1239
    iput-object v9, v2, Lo82;->v:Landroid/widget/LinearLayout;

    .line 1240
    .line 1241
    new-instance v9, Landroid/widget/RelativeLayout$LayoutParams;

    .line 1242
    .line 1243
    invoke-virtual {v7}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 1244
    .line 1245
    .line 1246
    move-result-object v11

    .line 1247
    invoke-virtual {v11}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 1248
    .line 1249
    .line 1250
    move-result-object v11

    .line 1251
    move/from16 v13, p2

    .line 1252
    .line 1253
    invoke-static {v11, v13}, Lj63;->m(Landroid/util/DisplayMetrics;I)I

    .line 1254
    .line 1255
    .line 1256
    move-result v11

    .line 1257
    invoke-virtual {v7}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 1258
    .line 1259
    .line 1260
    move-result-object v14

    .line 1261
    invoke-virtual {v14}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 1262
    .line 1263
    .line 1264
    move-result-object v14

    .line 1265
    invoke-static {v14, v13}, Lj63;->m(Landroid/util/DisplayMetrics;I)I

    .line 1266
    .line 1267
    .line 1268
    move-result v13

    .line 1269
    invoke-direct {v9, v11, v13}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 1270
    .line 1271
    .line 1272
    iget-object v11, v2, Lo82;->i:Ljava/lang/String;

    .line 1273
    .line 1274
    invoke-virtual {v11}, Ljava/lang/String;->hashCode()I

    .line 1275
    .line 1276
    .line 1277
    move-result v13
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 1278
    const/16 v14, 0x9

    .line 1279
    .line 1280
    const/16 v15, 0xb

    .line 1281
    .line 1282
    move/from16 p1, v8

    .line 1283
    .line 1284
    const/16 v8, 0xc

    .line 1285
    .line 1286
    move/from16 v16, v10

    .line 1287
    .line 1288
    const/16 v10, 0xa

    .line 1289
    .line 1290
    sparse-switch v13, :sswitch_data_1

    .line 1291
    .line 1292
    .line 1293
    goto :goto_16

    .line 1294
    :sswitch_6
    const-string v8, "top-center"

    .line 1295
    .line 1296
    invoke-virtual {v11, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1297
    .line 1298
    .line 1299
    move-result v8

    .line 1300
    if-eqz v8, :cond_30

    .line 1301
    .line 1302
    :try_start_7
    invoke-virtual {v9, v10}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 1303
    .line 1304
    .line 1305
    const/16 v8, 0xe

    .line 1306
    .line 1307
    invoke-virtual {v9, v8}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 1308
    .line 1309
    .line 1310
    goto :goto_17

    .line 1311
    :sswitch_7
    const-string v13, "bottom-center"

    .line 1312
    .line 1313
    invoke-virtual {v11, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1314
    .line 1315
    .line 1316
    move-result v11

    .line 1317
    if-eqz v11, :cond_30

    .line 1318
    .line 1319
    :try_start_8
    invoke-virtual {v9, v8}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 1320
    .line 1321
    .line 1322
    const/16 v8, 0xe

    .line 1323
    .line 1324
    invoke-virtual {v9, v8}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 1325
    .line 1326
    .line 1327
    goto :goto_17

    .line 1328
    :sswitch_8
    const-string v13, "bottom-right"

    .line 1329
    .line 1330
    invoke-virtual {v11, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1331
    .line 1332
    .line 1333
    move-result v11

    .line 1334
    if-eqz v11, :cond_30

    .line 1335
    .line 1336
    :try_start_9
    invoke-virtual {v9, v8}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 1337
    .line 1338
    .line 1339
    invoke-virtual {v9, v15}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    .line 1340
    .line 1341
    .line 1342
    goto :goto_17

    .line 1343
    :sswitch_9
    const-string v13, "bottom-left"

    .line 1344
    .line 1345
    invoke-virtual {v11, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1346
    .line 1347
    .line 1348
    move-result v11

    .line 1349
    if-eqz v11, :cond_30

    .line 1350
    .line 1351
    :try_start_a
    invoke-virtual {v9, v8}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 1352
    .line 1353
    .line 1354
    invoke-virtual {v9, v14}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    .line 1355
    .line 1356
    .line 1357
    goto :goto_17

    .line 1358
    :sswitch_a
    const-string v8, "top-left"

    .line 1359
    .line 1360
    invoke-virtual {v11, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1361
    .line 1362
    .line 1363
    move-result v8

    .line 1364
    if-eqz v8, :cond_30

    .line 1365
    .line 1366
    :try_start_b
    invoke-virtual {v9, v10}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 1367
    .line 1368
    .line 1369
    invoke-virtual {v9, v14}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_0

    .line 1370
    .line 1371
    .line 1372
    goto :goto_17

    .line 1373
    :sswitch_b
    const-string v8, "center"

    .line 1374
    .line 1375
    invoke-virtual {v11, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1376
    .line 1377
    .line 1378
    move-result v8

    .line 1379
    if-eqz v8, :cond_30

    .line 1380
    .line 1381
    const/16 v8, 0xd

    .line 1382
    .line 1383
    :try_start_c
    invoke-virtual {v9, v8}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 1384
    .line 1385
    .line 1386
    goto :goto_17

    .line 1387
    :cond_30
    :goto_16
    invoke-virtual {v9, v10}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 1388
    .line 1389
    .line 1390
    invoke-virtual {v9, v15}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 1391
    .line 1392
    .line 1393
    :goto_17
    iget-object v8, v2, Lo82;->v:Landroid/widget/LinearLayout;

    .line 1394
    .line 1395
    new-instance v10, Lm1;

    .line 1396
    .line 1397
    invoke-direct {v10, v2}, Lm1;-><init>(Lo82;)V

    .line 1398
    .line 1399
    .line 1400
    invoke-virtual {v8, v10}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1401
    .line 1402
    .line 1403
    iget-object v8, v2, Lo82;->v:Landroid/widget/LinearLayout;

    .line 1404
    .line 1405
    const-string v10, "Close button"

    .line 1406
    .line 1407
    invoke-virtual {v8, v10}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 1408
    .line 1409
    .line 1410
    iget-object v8, v2, Lo82;->y:Landroid/widget/RelativeLayout;

    .line 1411
    .line 1412
    iget-object v10, v2, Lo82;->v:Landroid/widget/LinearLayout;

    .line 1413
    .line 1414
    invoke-virtual {v8, v10, v9}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_0

    .line 1415
    .line 1416
    .line 1417
    :try_start_d
    iget-object v8, v2, Lo82;->x:Landroid/widget/PopupWindow;

    .line 1418
    .line 1419
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 1420
    .line 1421
    .line 1422
    move-result-object v0

    .line 1423
    aget v9, v12, v16

    .line 1424
    .line 1425
    invoke-virtual {v7}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 1426
    .line 1427
    .line 1428
    move-result-object v10

    .line 1429
    invoke-virtual {v10}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 1430
    .line 1431
    .line 1432
    move-result-object v10

    .line 1433
    invoke-static {v10, v9}, Lj63;->m(Landroid/util/DisplayMetrics;I)I

    .line 1434
    .line 1435
    .line 1436
    move-result v9

    .line 1437
    aget v10, v12, p1

    .line 1438
    .line 1439
    invoke-virtual {v7}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 1440
    .line 1441
    .line 1442
    move-result-object v7

    .line 1443
    invoke-virtual {v7}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 1444
    .line 1445
    .line 1446
    move-result-object v7

    .line 1447
    invoke-static {v7, v10}, Lj63;->m(Landroid/util/DisplayMetrics;I)I

    .line 1448
    .line 1449
    .line 1450
    move-result v7

    .line 1451
    move/from16 v10, v16

    .line 1452
    .line 1453
    invoke-virtual {v8, v0, v10, v9, v7}, Landroid/widget/PopupWindow;->showAtLocation(Landroid/view/View;III)V
    :try_end_d
    .catch Ljava/lang/RuntimeException; {:try_start_d .. :try_end_d} :catch_0
    .catchall {:try_start_d .. :try_end_d} :catchall_0

    .line 1454
    .line 1455
    .line 1456
    :try_start_e
    aget v0, v12, v10

    .line 1457
    .line 1458
    aget v0, v12, p1

    .line 1459
    .line 1460
    iget-object v0, v2, Lo82;->w:Lof3;

    .line 1461
    .line 1462
    if-eqz v0, :cond_31

    .line 1463
    .line 1464
    iget-object v0, v0, Lof3;->g:Ljava/lang/Object;

    .line 1465
    .line 1466
    check-cast v0, Lou2;

    .line 1467
    .line 1468
    iget-object v0, v0, Lou2;->c:Lgn2;

    .line 1469
    .line 1470
    sget-object v6, Lqd2;->j:Lqd2;

    .line 1471
    .line 1472
    invoke-virtual {v0, v6}, Lf74;->P1(Ldp2;)V

    .line 1473
    .line 1474
    .line 1475
    :cond_31
    iget-object v0, v2, Lo82;->r:Lag2;

    .line 1476
    .line 1477
    new-instance v6, Lzq;

    .line 1478
    .line 1479
    move/from16 v9, p1

    .line 1480
    .line 1481
    invoke-direct {v6, v9, v4, v5}, Lzq;-><init>(III)V

    .line 1482
    .line 1483
    .line 1484
    invoke-interface {v0, v6}, Lag2;->Z(Lzq;)V

    .line 1485
    .line 1486
    .line 1487
    const/16 v16, 0x0

    .line 1488
    .line 1489
    aget v0, v12, v16

    .line 1490
    .line 1491
    aget v4, v12, v9

    .line 1492
    .line 1493
    iget-object v5, v2, Lo82;->s:Landroid/app/Activity;

    .line 1494
    .line 1495
    invoke-static {v5}, Llf4;->q(Landroid/app/Activity;)[I

    .line 1496
    .line 1497
    .line 1498
    move-result-object v5

    .line 1499
    aget v5, v5, v16

    .line 1500
    .line 1501
    sub-int/2addr v4, v5

    .line 1502
    iget v5, v2, Lo82;->p:I

    .line 1503
    .line 1504
    iget v6, v2, Lo82;->m:I

    .line 1505
    .line 1506
    invoke-virtual {v2, v0, v4, v5, v6}, Lgw3;->H(IIII)V

    .line 1507
    .line 1508
    .line 1509
    const-string v0, "resized"

    .line 1510
    .line 1511
    invoke-virtual {v2, v0}, Lgw3;->I(Ljava/lang/String;)V

    .line 1512
    .line 1513
    .line 1514
    monitor-exit v3

    .line 1515
    return-void

    .line 1516
    :catch_0
    move-exception v0

    .line 1517
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1518
    .line 1519
    .line 1520
    move-result-object v0

    .line 1521
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 1522
    .line 1523
    .line 1524
    move-result-object v4

    .line 1525
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 1526
    .line 1527
    .line 1528
    move-result v4

    .line 1529
    add-int/lit8 v4, v4, 0x1a

    .line 1530
    .line 1531
    new-instance v5, Ljava/lang/StringBuilder;

    .line 1532
    .line 1533
    invoke-direct {v5, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 1534
    .line 1535
    .line 1536
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1537
    .line 1538
    .line 1539
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1540
    .line 1541
    .line 1542
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1543
    .line 1544
    .line 1545
    move-result-object v0

    .line 1546
    invoke-virtual {v2, v0}, Lgw3;->G(Ljava/lang/String;)V

    .line 1547
    .line 1548
    .line 1549
    iget-object v0, v2, Lo82;->y:Landroid/widget/RelativeLayout;

    .line 1550
    .line 1551
    iget-object v4, v2, Lo82;->r:Lag2;

    .line 1552
    .line 1553
    move-object v5, v4

    .line 1554
    check-cast v5, Landroid/view/View;

    .line 1555
    .line 1556
    invoke-virtual {v0, v5}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 1557
    .line 1558
    .line 1559
    iget-object v0, v2, Lo82;->z:Landroid/view/ViewGroup;

    .line 1560
    .line 1561
    if-eqz v0, :cond_32

    .line 1562
    .line 1563
    iget-object v5, v2, Lo82;->u:Landroid/widget/ImageView;

    .line 1564
    .line 1565
    invoke-virtual {v0, v5}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 1566
    .line 1567
    .line 1568
    iget-object v0, v2, Lo82;->z:Landroid/view/ViewGroup;

    .line 1569
    .line 1570
    move-object v5, v4

    .line 1571
    check-cast v5, Landroid/view/View;

    .line 1572
    .line 1573
    invoke-virtual {v0, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1574
    .line 1575
    .line 1576
    iget-object v0, v2, Lo82;->t:Lzq;

    .line 1577
    .line 1578
    invoke-interface {v4, v0}, Lag2;->Z(Lzq;)V

    .line 1579
    .line 1580
    .line 1581
    :cond_32
    monitor-exit v3

    .line 1582
    return-void

    .line 1583
    :cond_33
    const-string v0, "Webview is detached, probably in the middle of a resize or expand."

    .line 1584
    .line 1585
    invoke-virtual {v2, v0}, Lgw3;->G(Ljava/lang/String;)V

    .line 1586
    .line 1587
    .line 1588
    monitor-exit v3

    .line 1589
    return-void

    .line 1590
    :cond_34
    :goto_18
    const-string v0, "Activity context is not ready, cannot get window or decor view."

    .line 1591
    .line 1592
    invoke-virtual {v2, v0}, Lgw3;->G(Ljava/lang/String;)V

    .line 1593
    .line 1594
    .line 1595
    monitor-exit v3

    .line 1596
    return-void

    .line 1597
    :cond_35
    const-string v0, "Invalid width and height options. Cannot resize."

    .line 1598
    .line 1599
    invoke-virtual {v2, v0}, Lgw3;->G(Ljava/lang/String;)V

    .line 1600
    .line 1601
    .line 1602
    monitor-exit v3

    .line 1603
    return-void

    .line 1604
    :goto_19
    monitor-exit v3
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_0

    .line 1605
    throw v0

    .line 1606
    :cond_36
    const/4 v0, 0x0

    .line 1607
    invoke-virtual {v10, v0}, Lsu1;->b(Ljava/lang/String;)V

    .line 1608
    .line 1609
    .line 1610
    return-void

    .line 1611
    :cond_37
    iget-object v0, v1, Lf42;->h:Lof3;

    .line 1612
    .line 1613
    iget-object v0, v0, Lof3;->g:Ljava/lang/Object;

    .line 1614
    .line 1615
    check-cast v0, Lou2;

    .line 1616
    .line 1617
    iget-object v0, v0, Lou2;->m:Lqo2;

    .line 1618
    .line 1619
    invoke-virtual {v0}, Lqo2;->a()V

    .line 1620
    .line 1621
    .line 1622
    return-void

    .line 1623
    :goto_1a
    const-string v2, "forceOrientation"

    .line 1624
    .line 1625
    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1626
    .line 1627
    .line 1628
    move-result-object v2

    .line 1629
    check-cast v2, Ljava/lang/String;

    .line 1630
    .line 1631
    const-string v4, "allowOrientationChange"

    .line 1632
    .line 1633
    invoke-interface {v0, v4}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 1634
    .line 1635
    .line 1636
    move-result v4

    .line 1637
    if-eqz v4, :cond_38

    .line 1638
    .line 1639
    const-string v4, "allowOrientationChange"

    .line 1640
    .line 1641
    invoke-interface {v0, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1642
    .line 1643
    .line 1644
    move-result-object v0

    .line 1645
    check-cast v0, Ljava/lang/String;

    .line 1646
    .line 1647
    invoke-static {v0}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    .line 1648
    .line 1649
    .line 1650
    move-result v0

    .line 1651
    goto :goto_1b

    .line 1652
    :cond_38
    move v0, v9

    .line 1653
    :goto_1b
    if-nez v3, :cond_39

    .line 1654
    .line 1655
    const-string v0, "AdWebView is null"

    .line 1656
    .line 1657
    invoke-static {v0}, Lgi2;->i0(Ljava/lang/String;)V

    .line 1658
    .line 1659
    .line 1660
    return-void

    .line 1661
    :cond_39
    const-string v4, "portrait"

    .line 1662
    .line 1663
    invoke-virtual {v4, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1664
    .line 1665
    .line 1666
    move-result v4

    .line 1667
    if-eqz v4, :cond_3a

    .line 1668
    .line 1669
    move v4, v7

    .line 1670
    goto :goto_1c

    .line 1671
    :cond_3a
    const-string v4, "landscape"

    .line 1672
    .line 1673
    invoke-virtual {v4, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1674
    .line 1675
    .line 1676
    move-result v2

    .line 1677
    if-eqz v2, :cond_3b

    .line 1678
    .line 1679
    move v4, v6

    .line 1680
    goto :goto_1c

    .line 1681
    :cond_3b
    if-eqz v0, :cond_3c

    .line 1682
    .line 1683
    move v4, v13

    .line 1684
    goto :goto_1c

    .line 1685
    :cond_3c
    move v4, v8

    .line 1686
    :goto_1c
    invoke-interface {v3, v4}, Lag2;->y(I)V

    .line 1687
    .line 1688
    .line 1689
    return-void

    .line 1690
    nop

    .line 1691
    :sswitch_data_0
    .sparse-switch
        -0x514d33ab -> :sswitch_5
        -0x3c587281 -> :sswitch_4
        -0x27103597 -> :sswitch_3
        0x455fe3fa -> :sswitch_2
        0x4ccee637 -> :sswitch_1
        0x68a23bcd -> :sswitch_0
    .end sparse-switch

    .line 1692
    .line 1693
    .line 1694
    .line 1695
    .line 1696
    .line 1697
    .line 1698
    .line 1699
    .line 1700
    .line 1701
    .line 1702
    .line 1703
    .line 1704
    .line 1705
    .line 1706
    .line 1707
    .line 1708
    .line 1709
    .line 1710
    .line 1711
    .line 1712
    .line 1713
    .line 1714
    .line 1715
    .line 1716
    .line 1717
    :sswitch_data_1
    .sparse-switch
        -0x514d33ab -> :sswitch_b
        -0x3c587281 -> :sswitch_a
        -0x27103597 -> :sswitch_9
        0x455fe3fa -> :sswitch_8
        0x4ccee637 -> :sswitch_7
        0x68a23bcd -> :sswitch_6
    .end sparse-switch
.end method
