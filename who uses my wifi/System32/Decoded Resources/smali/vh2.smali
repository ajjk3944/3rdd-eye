.class public final Lvh2;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ltz2;


# instance fields
.field public f:Ljava/lang/String;

.field public g:Ljava/lang/String;

.field public h:Ljava/lang/String;

.field public i:I

.field public j:I

.field public k:Ljava/lang/Object;

.field public l:Ljava/lang/Object;


# direct methods
.method public static b(Landroid/util/JsonReader;)Lvh2;
    .locals 8

    .line 1
    new-instance v0, Lvh2;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    iput v1, v0, Lvh2;->i:I

    .line 8
    .line 9
    sget-object v2, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 10
    .line 11
    iput-object v2, v0, Lvh2;->k:Ljava/lang/Object;

    .line 12
    .line 13
    iput-object v2, v0, Lvh2;->l:Ljava/lang/Object;

    .line 14
    .line 15
    iput v1, v0, Lvh2;->j:I

    .line 16
    .line 17
    invoke-virtual {p0}, Landroid/util/JsonReader;->beginObject()V

    .line 18
    .line 19
    .line 20
    :goto_0
    invoke-virtual {p0}, Landroid/util/JsonReader;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-eqz v2, :cond_e

    .line 25
    .line 26
    invoke-virtual {p0}, Landroid/util/JsonReader;->nextName()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    const/4 v4, 0x3

    .line 35
    const/4 v5, 0x2

    .line 36
    sparse-switch v3, :sswitch_data_0

    .line 37
    .line 38
    .line 39
    goto/16 :goto_9

    .line 40
    .line 41
    :sswitch_0
    const-string v3, "consent_form_payload"

    .line 42
    .line 43
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    if-eqz v2, :cond_d

    .line 48
    .line 49
    invoke-virtual {p0}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    iput-object v2, v0, Lvh2;->f:Ljava/lang/String;

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :sswitch_1
    const-string v3, "request_info_keys"

    .line 57
    .line 58
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    if-eqz v2, :cond_d

    .line 63
    .line 64
    new-instance v2, Ljava/util/ArrayList;

    .line 65
    .line 66
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 67
    .line 68
    .line 69
    iput-object v2, v0, Lvh2;->k:Ljava/lang/Object;

    .line 70
    .line 71
    invoke-virtual {p0}, Landroid/util/JsonReader;->beginArray()V

    .line 72
    .line 73
    .line 74
    :goto_1
    invoke-virtual {p0}, Landroid/util/JsonReader;->hasNext()Z

    .line 75
    .line 76
    .line 77
    move-result v2

    .line 78
    if-eqz v2, :cond_0

    .line 79
    .line 80
    invoke-virtual {p0}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    iget-object v3, v0, Lvh2;->k:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast v3, Ljava/util/List;

    .line 87
    .line 88
    invoke-interface {v3, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    goto :goto_1

    .line 92
    :cond_0
    invoke-virtual {p0}, Landroid/util/JsonReader;->endArray()V

    .line 93
    .line 94
    .line 95
    goto :goto_0

    .line 96
    :sswitch_2
    const-string v3, "actions"

    .line 97
    .line 98
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    move-result v2

    .line 102
    if-eqz v2, :cond_d

    .line 103
    .line 104
    new-instance v2, Ljava/util/ArrayList;

    .line 105
    .line 106
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 107
    .line 108
    .line 109
    iput-object v2, v0, Lvh2;->l:Ljava/lang/Object;

    .line 110
    .line 111
    invoke-virtual {p0}, Landroid/util/JsonReader;->beginArray()V

    .line 112
    .line 113
    .line 114
    :goto_2
    invoke-virtual {p0}, Landroid/util/JsonReader;->hasNext()Z

    .line 115
    .line 116
    .line 117
    move-result v2

    .line 118
    if-eqz v2, :cond_8

    .line 119
    .line 120
    new-instance v2, Ljh2;

    .line 121
    .line 122
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 123
    .line 124
    .line 125
    iput v1, v2, Ljh2;->b:I

    .line 126
    .line 127
    invoke-virtual {p0}, Landroid/util/JsonReader;->beginObject()V

    .line 128
    .line 129
    .line 130
    :goto_3
    invoke-virtual {p0}, Landroid/util/JsonReader;->hasNext()Z

    .line 131
    .line 132
    .line 133
    move-result v3

    .line 134
    if-eqz v3, :cond_7

    .line 135
    .line 136
    invoke-virtual {p0}, Landroid/util/JsonReader;->nextName()Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v3

    .line 140
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 141
    .line 142
    .line 143
    move-result v6

    .line 144
    const v7, -0x7d8028f6

    .line 145
    .line 146
    .line 147
    if-eq v6, v7, :cond_5

    .line 148
    .line 149
    const v7, 0x5e663ba3

    .line 150
    .line 151
    .line 152
    if-eq v6, v7, :cond_1

    .line 153
    .line 154
    goto :goto_5

    .line 155
    :cond_1
    const-string v6, "action_type"

    .line 156
    .line 157
    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 158
    .line 159
    .line 160
    move-result v3

    .line 161
    if-eqz v3, :cond_6

    .line 162
    .line 163
    invoke-virtual {p0}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v3

    .line 167
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 168
    .line 169
    .line 170
    move-result v6

    .line 171
    const v7, 0x3d3be2d

    .line 172
    .line 173
    .line 174
    if-eq v6, v7, :cond_3

    .line 175
    .line 176
    const v7, 0x4f05fbf

    .line 177
    .line 178
    .line 179
    if-eq v6, v7, :cond_2

    .line 180
    .line 181
    const v7, 0x6ea5670e

    .line 182
    .line 183
    .line 184
    if-ne v6, v7, :cond_4

    .line 185
    .line 186
    const-string v6, "UNKNOWN_ACTION_TYPE"

    .line 187
    .line 188
    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 189
    .line 190
    .line 191
    move-result v6

    .line 192
    if-eqz v6, :cond_4

    .line 193
    .line 194
    move v3, v1

    .line 195
    goto :goto_4

    .line 196
    :cond_2
    const-string v6, "WRITE"

    .line 197
    .line 198
    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 199
    .line 200
    .line 201
    move-result v6

    .line 202
    if-eqz v6, :cond_4

    .line 203
    .line 204
    move v3, v5

    .line 205
    goto :goto_4

    .line 206
    :cond_3
    const-string v6, "CLEAR"

    .line 207
    .line 208
    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 209
    .line 210
    .line 211
    move-result v6

    .line 212
    if-eqz v6, :cond_4

    .line 213
    .line 214
    move v3, v4

    .line 215
    :goto_4
    iput v3, v2, Ljh2;->b:I

    .line 216
    .line 217
    goto :goto_3

    .line 218
    :cond_4
    new-instance p0, Ljava/io/IOException;

    .line 219
    .line 220
    const-string v0, "Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.Action.ActionTypefrom: "

    .line 221
    .line 222
    invoke-virtual {v0, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object v0

    .line 226
    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 227
    .line 228
    .line 229
    throw p0

    .line 230
    :cond_5
    const-string v6, "args_json"

    .line 231
    .line 232
    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 233
    .line 234
    .line 235
    move-result v3

    .line 236
    if-eqz v3, :cond_6

    .line 237
    .line 238
    invoke-virtual {p0}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;

    .line 239
    .line 240
    .line 241
    move-result-object v3

    .line 242
    iput-object v3, v2, Ljh2;->a:Ljava/lang/String;

    .line 243
    .line 244
    goto :goto_3

    .line 245
    :cond_6
    :goto_5
    invoke-virtual {p0}, Landroid/util/JsonReader;->skipValue()V

    .line 246
    .line 247
    .line 248
    goto :goto_3

    .line 249
    :cond_7
    invoke-virtual {p0}, Landroid/util/JsonReader;->endObject()V

    .line 250
    .line 251
    .line 252
    iget-object v3, v0, Lvh2;->l:Ljava/lang/Object;

    .line 253
    .line 254
    check-cast v3, Ljava/util/List;

    .line 255
    .line 256
    invoke-interface {v3, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 257
    .line 258
    .line 259
    goto/16 :goto_2

    .line 260
    .line 261
    :cond_8
    invoke-virtual {p0}, Landroid/util/JsonReader;->endArray()V

    .line 262
    .line 263
    .line 264
    goto/16 :goto_0

    .line 265
    .line 266
    :sswitch_3
    const-string v3, "privacy_options_required"

    .line 267
    .line 268
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 269
    .line 270
    .line 271
    move-result v2

    .line 272
    if-eqz v2, :cond_d

    .line 273
    .line 274
    invoke-virtual {p0}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;

    .line 275
    .line 276
    .line 277
    move-result-object v2

    .line 278
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 279
    .line 280
    .line 281
    move-result v3

    .line 282
    const v6, -0x70970855

    .line 283
    .line 284
    .line 285
    if-eq v3, v6, :cond_a

    .line 286
    .line 287
    const v4, 0x17371b9f

    .line 288
    .line 289
    .line 290
    if-eq v3, v4, :cond_9

    .line 291
    .line 292
    const v4, 0x19d1382a

    .line 293
    .line 294
    .line 295
    if-ne v3, v4, :cond_b

    .line 296
    .line 297
    const-string v3, "UNKNOWN"

    .line 298
    .line 299
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 300
    .line 301
    .line 302
    move-result v3

    .line 303
    if-eqz v3, :cond_b

    .line 304
    .line 305
    move v4, v1

    .line 306
    goto :goto_6

    .line 307
    :cond_9
    const-string v3, "REQUIRED"

    .line 308
    .line 309
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 310
    .line 311
    .line 312
    move-result v3

    .line 313
    if-eqz v3, :cond_b

    .line 314
    .line 315
    move v4, v5

    .line 316
    goto :goto_6

    .line 317
    :cond_a
    const-string v3, "NOT_REQUIRED"

    .line 318
    .line 319
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 320
    .line 321
    .line 322
    move-result v3

    .line 323
    if-eqz v3, :cond_b

    .line 324
    .line 325
    :goto_6
    iput v4, v0, Lvh2;->j:I

    .line 326
    .line 327
    goto/16 :goto_0

    .line 328
    .line 329
    :cond_b
    new-instance p0, Ljava/io/IOException;

    .line 330
    .line 331
    const-string v0, "Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.PrivacyOptionsRequirementStatusfrom: "

    .line 332
    .line 333
    invoke-virtual {v0, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 334
    .line 335
    .line 336
    move-result-object v0

    .line 337
    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 338
    .line 339
    .line 340
    throw p0

    .line 341
    :sswitch_4
    const-string v3, "consent_form_base_url"

    .line 342
    .line 343
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 344
    .line 345
    .line 346
    move-result v2

    .line 347
    if-eqz v2, :cond_d

    .line 348
    .line 349
    invoke-virtual {p0}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;

    .line 350
    .line 351
    .line 352
    move-result-object v2

    .line 353
    iput-object v2, v0, Lvh2;->g:Ljava/lang/String;

    .line 354
    .line 355
    goto/16 :goto_0

    .line 356
    .line 357
    :sswitch_5
    const-string v3, "error_message"

    .line 358
    .line 359
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 360
    .line 361
    .line 362
    move-result v2

    .line 363
    if-eqz v2, :cond_d

    .line 364
    .line 365
    invoke-virtual {p0}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;

    .line 366
    .line 367
    .line 368
    move-result-object v2

    .line 369
    iput-object v2, v0, Lvh2;->h:Ljava/lang/String;

    .line 370
    .line 371
    goto/16 :goto_0

    .line 372
    .line 373
    :sswitch_6
    const-string v3, "consent_signal"

    .line 374
    .line 375
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 376
    .line 377
    .line 378
    move-result v2

    .line 379
    if-eqz v2, :cond_d

    .line 380
    .line 381
    invoke-virtual {p0}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;

    .line 382
    .line 383
    .line 384
    move-result-object v2

    .line 385
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 386
    .line 387
    .line 388
    move-result v3

    .line 389
    sparse-switch v3, :sswitch_data_1

    .line 390
    .line 391
    .line 392
    goto :goto_8

    .line 393
    :sswitch_7
    const-string v3, "CONSENT_SIGNAL_NOT_REQUIRED"

    .line 394
    .line 395
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 396
    .line 397
    .line 398
    move-result v3

    .line 399
    if-eqz v3, :cond_c

    .line 400
    .line 401
    const/4 v4, 0x6

    .line 402
    goto :goto_7

    .line 403
    :sswitch_8
    const-string v3, "CONSENT_SIGNAL_PERSONALIZED_ADS"

    .line 404
    .line 405
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 406
    .line 407
    .line 408
    move-result v3

    .line 409
    if-eqz v3, :cond_c

    .line 410
    .line 411
    move v4, v5

    .line 412
    goto :goto_7

    .line 413
    :sswitch_9
    const-string v3, "CONSENT_SIGNAL_SUFFICIENT"

    .line 414
    .line 415
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 416
    .line 417
    .line 418
    move-result v3

    .line 419
    if-eqz v3, :cond_c

    .line 420
    .line 421
    const/4 v4, 0x4

    .line 422
    goto :goto_7

    .line 423
    :sswitch_a
    const-string v3, "CONSENT_SIGNAL_PUBLISHER_MISCONFIGURATION"

    .line 424
    .line 425
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 426
    .line 427
    .line 428
    move-result v3

    .line 429
    if-eqz v3, :cond_c

    .line 430
    .line 431
    const/16 v4, 0x8

    .line 432
    .line 433
    goto :goto_7

    .line 434
    :sswitch_b
    const-string v3, "CONSENT_SIGNAL_NON_PERSONALIZED_ADS"

    .line 435
    .line 436
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 437
    .line 438
    .line 439
    move-result v3

    .line 440
    if-eqz v3, :cond_c

    .line 441
    .line 442
    goto :goto_7

    .line 443
    :sswitch_c
    const-string v3, "CONSENT_SIGNAL_UNKNOWN"

    .line 444
    .line 445
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 446
    .line 447
    .line 448
    move-result v3

    .line 449
    if-eqz v3, :cond_c

    .line 450
    .line 451
    move v4, v1

    .line 452
    goto :goto_7

    .line 453
    :sswitch_d
    const-string v3, "CONSENT_SIGNAL_ERROR"

    .line 454
    .line 455
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 456
    .line 457
    .line 458
    move-result v3

    .line 459
    if-eqz v3, :cond_c

    .line 460
    .line 461
    const/4 v4, 0x7

    .line 462
    goto :goto_7

    .line 463
    :sswitch_e
    const-string v3, "CONSENT_SIGNAL_COLLECT_CONSENT"

    .line 464
    .line 465
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 466
    .line 467
    .line 468
    move-result v3

    .line 469
    if-eqz v3, :cond_c

    .line 470
    .line 471
    const/4 v4, 0x5

    .line 472
    :goto_7
    iput v4, v0, Lvh2;->i:I

    .line 473
    .line 474
    goto/16 :goto_0

    .line 475
    .line 476
    :cond_c
    :goto_8
    new-instance p0, Ljava/io/IOException;

    .line 477
    .line 478
    const-string v0, "Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.ConsentSignalfrom: "

    .line 479
    .line 480
    invoke-virtual {v0, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 481
    .line 482
    .line 483
    move-result-object v0

    .line 484
    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 485
    .line 486
    .line 487
    throw p0

    .line 488
    :cond_d
    :goto_9
    invoke-virtual {p0}, Landroid/util/JsonReader;->skipValue()V

    .line 489
    .line 490
    .line 491
    goto/16 :goto_0

    .line 492
    .line 493
    :cond_e
    invoke-virtual {p0}, Landroid/util/JsonReader;->endObject()V

    .line 494
    .line 495
    .line 496
    return-object v0

    .line 497
    :sswitch_data_0
    .sparse-switch
        -0x774ac593 -> :sswitch_6
        -0x738f0f30 -> :sswitch_5
        -0x6e5c3749 -> :sswitch_4
        -0x4ef2d809 -> :sswitch_3
        -0x453fb703 -> :sswitch_2
        -0x3ad17acb -> :sswitch_1
        -0x2f244ae8 -> :sswitch_0
    .end sparse-switch

    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    :sswitch_data_1
    .sparse-switch
        -0x7ab5a7ed -> :sswitch_e
        -0x755d1a4a -> :sswitch_d
        -0x4b527788 -> :sswitch_c
        -0x38e1da9b -> :sswitch_b
        -0x36c1e70c -> :sswitch_a
        0x19984e10 -> :sswitch_9
        0x1be36b13 -> :sswitch_8
        0x66d8a81d -> :sswitch_7
    .end sparse-switch
.end method


# virtual methods
.method public a()Ljava/lang/Object;
    .locals 12

    .line 1
    iget-object v0, p0, Lvh2;->f:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v1, p0, Lvh2;->g:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v2, p0, Lvh2;->h:Ljava/lang/String;

    .line 6
    .line 7
    iget v3, p0, Lvh2;->i:I

    .line 8
    .line 9
    iget-object v4, p0, Lvh2;->k:Ljava/lang/Object;

    .line 10
    .line 11
    move-object v7, v4

    .line 12
    check-cast v7, Landroid/webkit/WebView;

    .line 13
    .line 14
    iget-object v4, p0, Lvh2;->l:Ljava/lang/Object;

    .line 15
    .line 16
    move-object v8, v4

    .line 17
    check-cast v8, Ljava/lang/String;

    .line 18
    .line 19
    iget v4, p0, Lvh2;->j:I

    .line 20
    .line 21
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 22
    .line 23
    .line 24
    move-result v5

    .line 25
    if-nez v5, :cond_5

    .line 26
    .line 27
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 28
    .line 29
    .line 30
    move-result v5

    .line 31
    if-nez v5, :cond_4

    .line 32
    .line 33
    new-instance v6, Lof0;

    .line 34
    .line 35
    invoke-direct {v6, v0, v1}, Lof0;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    const-string v0, "javascript"

    .line 39
    .line 40
    invoke-static {v0}, Lsu2;->n(Ljava/lang/String;)Ldc3;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-static {v2}, Lsu2;->n(Ljava/lang/String;)Ldc3;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    invoke-static {v3}, Lga1;->c(I)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v5

    .line 52
    invoke-static {v5}, Lsu2;->q(Ljava/lang/String;)Lyb3;

    .line 53
    .line 54
    .line 55
    move-result-object v11

    .line 56
    const/4 v5, 0x0

    .line 57
    sget-object v9, Ldc3;->i:Ldc3;

    .line 58
    .line 59
    if-ne v0, v9, :cond_0

    .line 60
    .line 61
    const-string v0, "Omid js session error; Unable to parse impression owner: javascript"

    .line 62
    .line 63
    invoke-static {v0}, Lgi2;->i0(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    return-object v5

    .line 67
    :cond_0
    if-nez v11, :cond_1

    .line 68
    .line 69
    invoke-static {v3}, Lga1;->s(I)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    const-string v1, "Omid js session error; Unable to parse creative type: "

    .line 74
    .line 75
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    invoke-static {v0}, Lgi2;->i0(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    return-object v5

    .line 83
    :cond_1
    sget-object v3, Lyb3;->j:Lyb3;

    .line 84
    .line 85
    if-ne v11, v3, :cond_2

    .line 86
    .line 87
    if-ne v1, v9, :cond_2

    .line 88
    .line 89
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    const-string v1, "Omid js session error; Video events owner unknown for video creative: "

    .line 94
    .line 95
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    invoke-static {v0}, Lgi2;->i0(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    return-object v5

    .line 103
    :cond_2
    new-instance v5, Luk1;

    .line 104
    .line 105
    sget-object v10, Lwb3;->h:Lwb3;

    .line 106
    .line 107
    const-string v9, ""

    .line 108
    .line 109
    invoke-direct/range {v5 .. v10}, Luk1;-><init>(Lof0;Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Lwb3;)V

    .line 110
    .line 111
    .line 112
    invoke-static {v4}, Lga1;->d(I)Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v2

    .line 116
    invoke-static {v2}, Lsu2;->o(Ljava/lang/String;)Lbc3;

    .line 117
    .line 118
    .line 119
    move-result-object v2

    .line 120
    const/4 v3, 0x1

    .line 121
    invoke-static {v11, v2, v0, v1, v3}, Lde3;->b(Lyb3;Lbc3;Ldc3;Ldc3;Z)Lde3;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    sget-object v1, Lm54;->f:Lkj1;

    .line 126
    .line 127
    iget-boolean v1, v1, Lkj1;->g:Z

    .line 128
    .line 129
    if-eqz v1, :cond_3

    .line 130
    .line 131
    new-instance v1, Lxb3;

    .line 132
    .line 133
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 134
    .line 135
    .line 136
    move-result-object v2

    .line 137
    invoke-virtual {v2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v2

    .line 141
    invoke-direct {v1, v0, v5, v2}, Lxb3;-><init>(Lde3;Luk1;Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    new-instance v0, Lxz2;

    .line 145
    .line 146
    invoke-direct {v0, v1, v5}, Lxz2;-><init>(Lxb3;Luk1;)V

    .line 147
    .line 148
    .line 149
    return-object v0

    .line 150
    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 151
    .line 152
    const-string v1, "Method called before OM SDK activation"

    .line 153
    .line 154
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    throw v0

    .line 158
    :cond_4
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 159
    .line 160
    const-string v1, "Version is null or empty"

    .line 161
    .line 162
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    throw v0

    .line 166
    :cond_5
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 167
    .line 168
    const-string v1, "Name is null or empty"

    .line 169
    .line 170
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 171
    .line 172
    .line 173
    throw v0
.end method
