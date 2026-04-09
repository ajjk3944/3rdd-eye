.class public final synthetic Le2;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic f:I

.field public final synthetic g:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Le2;->f:I

    .line 2
    .line 3
    iput-object p2, p0, Le2;->g:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 36

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget v0, v1, Le2;->f:I

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x3

    .line 7
    const/4 v4, 0x2

    .line 8
    const/4 v5, 0x1

    .line 9
    const/4 v6, 0x0

    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    iget-object v0, v1, Le2;->g:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, Lcom/google/android/material/textfield/TextInputLayout;

    .line 16
    .line 17
    iget-object v0, v0, Lcom/google/android/material/textfield/TextInputLayout;->j:Landroid/widget/EditText;

    .line 18
    .line 19
    invoke-virtual {v0}, Landroid/view/View;->requestLayout()V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :pswitch_0
    iget-object v0, v1, Le2;->g:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v0, Lrb;

    .line 26
    .line 27
    iput-boolean v6, v0, Lrb;->c:Z

    .line 28
    .line 29
    iget-object v2, v0, Lrb;->e:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v2, Lcom/google/android/material/sidesheet/SideSheetBehavior;

    .line 32
    .line 33
    iget-object v3, v2, Lcom/google/android/material/sidesheet/SideSheetBehavior;->i:Li61;

    .line 34
    .line 35
    if-eqz v3, :cond_0

    .line 36
    .line 37
    invoke-virtual {v3}, Li61;->f()Z

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    if-eqz v3, :cond_0

    .line 42
    .line 43
    iget v2, v0, Lrb;->b:I

    .line 44
    .line 45
    invoke-virtual {v0, v2}, Lrb;->a(I)V

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_0
    iget v3, v2, Lcom/google/android/material/sidesheet/SideSheetBehavior;->h:I

    .line 50
    .line 51
    if-ne v3, v4, :cond_1

    .line 52
    .line 53
    iget v0, v0, Lrb;->b:I

    .line 54
    .line 55
    invoke-virtual {v2, v0}, Lcom/google/android/material/sidesheet/SideSheetBehavior;->x(I)V

    .line 56
    .line 57
    .line 58
    :cond_1
    :goto_0
    return-void

    .line 59
    :pswitch_1
    iget-object v0, v1, Le2;->g:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v0, Lmn0;

    .line 62
    .line 63
    invoke-virtual {v0}, Lmn0;->m()V

    .line 64
    .line 65
    .line 66
    return-void

    .line 67
    :pswitch_2
    iget-object v0, v1, Le2;->g:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v0, Lmm0;

    .line 70
    .line 71
    iget-object v2, v0, Lmm0;->k:Ld60;

    .line 72
    .line 73
    iget v3, v0, Lmm0;->g:I

    .line 74
    .line 75
    if-nez v3, :cond_2

    .line 76
    .line 77
    iput-boolean v5, v0, Lmm0;->h:Z

    .line 78
    .line 79
    sget-object v3, Lt50;->ON_PAUSE:Lt50;

    .line 80
    .line 81
    invoke-virtual {v2, v3}, Ld60;->d(Lt50;)V

    .line 82
    .line 83
    .line 84
    :cond_2
    iget v3, v0, Lmm0;->f:I

    .line 85
    .line 86
    if-nez v3, :cond_3

    .line 87
    .line 88
    iget-boolean v3, v0, Lmm0;->h:Z

    .line 89
    .line 90
    if-eqz v3, :cond_3

    .line 91
    .line 92
    sget-object v3, Lt50;->ON_STOP:Lt50;

    .line 93
    .line 94
    invoke-virtual {v2, v3}, Ld60;->d(Lt50;)V

    .line 95
    .line 96
    .line 97
    iput-boolean v5, v0, Lmm0;->i:Z

    .line 98
    .line 99
    :cond_3
    return-void

    .line 100
    :pswitch_3
    iget-object v0, v1, Le2;->g:Ljava/lang/Object;

    .line 101
    .line 102
    check-cast v0, Lcom/google/android/material/button/MaterialButton;

    .line 103
    .line 104
    invoke-static {v0}, Lcom/google/android/material/button/MaterialButton;->a(Lcom/google/android/material/button/MaterialButton;)V

    .line 105
    .line 106
    .line 107
    return-void

    .line 108
    :pswitch_4
    iget-object v0, v1, Le2;->g:Ljava/lang/Object;

    .line 109
    .line 110
    check-cast v0, Lq90;

    .line 111
    .line 112
    invoke-virtual {v0}, Lq90;->c()V

    .line 113
    .line 114
    .line 115
    return-void

    .line 116
    :pswitch_5
    iget-object v0, v1, Le2;->g:Ljava/lang/Object;

    .line 117
    .line 118
    check-cast v0, Li90;

    .line 119
    .line 120
    iget-object v2, v0, Li90;->R:Ljava/util/concurrent/Semaphore;

    .line 121
    .line 122
    iget-object v3, v0, Li90;->t:Lfh;

    .line 123
    .line 124
    if-nez v3, :cond_4

    .line 125
    .line 126
    goto :goto_1

    .line 127
    :cond_4
    :try_start_0
    invoke-virtual {v2}, Ljava/util/concurrent/Semaphore;->acquire()V

    .line 128
    .line 129
    .line 130
    iget-object v0, v0, Li90;->g:Ls90;

    .line 131
    .line 132
    invoke-virtual {v0}, Ls90;->a()F

    .line 133
    .line 134
    .line 135
    move-result v0

    .line 136
    invoke-virtual {v3, v0}, Lfh;->r(F)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 137
    .line 138
    .line 139
    :catch_0
    invoke-virtual {v2}, Ljava/util/concurrent/Semaphore;->release()V

    .line 140
    .line 141
    .line 142
    goto :goto_1

    .line 143
    :catchall_0
    move-exception v0

    .line 144
    invoke-virtual {v2}, Ljava/util/concurrent/Semaphore;->release()V

    .line 145
    .line 146
    .line 147
    throw v0

    .line 148
    :goto_1
    return-void

    .line 149
    :pswitch_6
    iget-object v0, v1, Le2;->g:Ljava/lang/Object;

    .line 150
    .line 151
    check-cast v0, Ljava/io/ByteArrayInputStream;

    .line 152
    .line 153
    invoke-static {v0}, Ll41;->b(Ljava/io/Closeable;)V

    .line 154
    .line 155
    .line 156
    return-void

    .line 157
    :pswitch_7
    iget-object v0, v1, Le2;->g:Ljava/lang/Object;

    .line 158
    .line 159
    check-cast v0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 160
    .line 161
    invoke-virtual {v0, v3}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->I(I)V

    .line 162
    .line 163
    .line 164
    return-void

    .line 165
    :pswitch_8
    iget-object v0, v1, Le2;->g:Ljava/lang/Object;

    .line 166
    .line 167
    move-object v2, v0

    .line 168
    check-cast v2, Llv;

    .line 169
    .line 170
    const-string v0, "fetchFonts result is not OK. ("

    .line 171
    .line 172
    iget-object v3, v2, Llv;->i:Ljava/lang/Object;

    .line 173
    .line 174
    monitor-enter v3

    .line 175
    :try_start_1
    iget-object v5, v2, Llv;->m:Lou1;

    .line 176
    .line 177
    if-nez v5, :cond_5

    .line 178
    .line 179
    monitor-exit v3

    .line 180
    goto/16 :goto_7

    .line 181
    .line 182
    :catchall_1
    move-exception v0

    .line 183
    goto/16 :goto_9

    .line 184
    .line 185
    :cond_5
    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 186
    :try_start_2
    invoke-virtual {v2}, Llv;->c()Lwv;

    .line 187
    .line 188
    .line 189
    move-result-object v3

    .line 190
    iget v5, v3, Lwv;->e:I

    .line 191
    .line 192
    if-ne v5, v4, :cond_6

    .line 193
    .line 194
    iget-object v4, v2, Llv;->i:Ljava/lang/Object;

    .line 195
    .line 196
    monitor-enter v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    .line 197
    :try_start_3
    monitor-exit v4

    .line 198
    goto :goto_2

    .line 199
    :catchall_2
    move-exception v0

    .line 200
    monitor-exit v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 201
    :try_start_4
    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 202
    :catchall_3
    move-exception v0

    .line 203
    goto/16 :goto_5

    .line 204
    .line 205
    :cond_6
    :goto_2
    if-nez v5, :cond_9

    .line 206
    .line 207
    :try_start_5
    const-string v0, "EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface"

    .line 208
    .line 209
    sget v4, Lo21;->a:I

    .line 210
    .line 211
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 212
    .line 213
    .line 214
    iget-object v0, v2, Llv;->h:Lpz;

    .line 215
    .line 216
    iget-object v4, v2, Llv;->f:Landroid/content/Context;

    .line 217
    .line 218
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 219
    .line 220
    .line 221
    filled-new-array {v3}, [Lwv;

    .line 222
    .line 223
    .line 224
    move-result-object v0

    .line 225
    sget-object v5, Lm31;->a:Luk2;

    .line 226
    .line 227
    invoke-virtual {v5, v4, v0, v6}, Luk2;->l(Landroid/content/Context;[Lwv;I)Landroid/graphics/Typeface;

    .line 228
    .line 229
    .line 230
    move-result-object v0

    .line 231
    iget-object v4, v2, Llv;->f:Landroid/content/Context;

    .line 232
    .line 233
    iget-object v3, v3, Lwv;->a:Landroid/net/Uri;

    .line 234
    .line 235
    invoke-static {v4, v3}, Lwl2;->q(Landroid/content/Context;Landroid/net/Uri;)Ljava/nio/MappedByteBuffer;

    .line 236
    .line 237
    .line 238
    move-result-object v3
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_6

    .line 239
    if-eqz v3, :cond_8

    .line 240
    .line 241
    if-eqz v0, :cond_8

    .line 242
    .line 243
    :try_start_6
    const-string v4, "EmojiCompat.MetadataRepo.create"

    .line 244
    .line 245
    invoke-static {v4}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 246
    .line 247
    .line 248
    new-instance v4, Lmc2;

    .line 249
    .line 250
    invoke-static {v3}, Luk2;->v(Ljava/nio/MappedByteBuffer;)Lpe0;

    .line 251
    .line 252
    .line 253
    move-result-object v3

    .line 254
    invoke-direct {v4, v0, v3}, Lmc2;-><init>(Landroid/graphics/Typeface;Lpe0;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    .line 255
    .line 256
    .line 257
    :try_start_7
    invoke-static {}, Landroid/os/Trace;->endSection()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_6

    .line 258
    .line 259
    .line 260
    :try_start_8
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 261
    .line 262
    .line 263
    iget-object v3, v2, Llv;->i:Ljava/lang/Object;

    .line 264
    .line 265
    monitor-enter v3
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    .line 266
    :try_start_9
    iget-object v0, v2, Llv;->m:Lou1;

    .line 267
    .line 268
    if-eqz v0, :cond_7

    .line 269
    .line 270
    invoke-virtual {v0, v4}, Lou1;->s(Lmc2;)V

    .line 271
    .line 272
    .line 273
    goto :goto_3

    .line 274
    :catchall_4
    move-exception v0

    .line 275
    goto :goto_4

    .line 276
    :cond_7
    :goto_3
    monitor-exit v3
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    .line 277
    :try_start_a
    invoke-virtual {v2}, Llv;->b()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_3

    .line 278
    .line 279
    .line 280
    goto :goto_7

    .line 281
    :goto_4
    :try_start_b
    monitor-exit v3
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_4

    .line 282
    :try_start_c
    throw v0
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_3

    .line 283
    :catchall_5
    move-exception v0

    .line 284
    :try_start_d
    sget v3, Lo21;->a:I

    .line 285
    .line 286
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 287
    .line 288
    .line 289
    throw v0

    .line 290
    :cond_8
    new-instance v0, Ljava/lang/RuntimeException;

    .line 291
    .line 292
    const-string v3, "Unable to open file."

    .line 293
    .line 294
    invoke-direct {v0, v3}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 295
    .line 296
    .line 297
    throw v0
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_6

    .line 298
    :catchall_6
    move-exception v0

    .line 299
    :try_start_e
    sget v3, Lo21;->a:I

    .line 300
    .line 301
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 302
    .line 303
    .line 304
    throw v0

    .line 305
    :cond_9
    new-instance v3, Ljava/lang/RuntimeException;

    .line 306
    .line 307
    new-instance v4, Ljava/lang/StringBuilder;

    .line 308
    .line 309
    invoke-direct {v4, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 310
    .line 311
    .line 312
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 313
    .line 314
    .line 315
    const-string v0, ")"

    .line 316
    .line 317
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 318
    .line 319
    .line 320
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 321
    .line 322
    .line 323
    move-result-object v0

    .line 324
    invoke-direct {v3, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 325
    .line 326
    .line 327
    throw v3
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_3

    .line 328
    :goto_5
    iget-object v4, v2, Llv;->i:Ljava/lang/Object;

    .line 329
    .line 330
    monitor-enter v4

    .line 331
    :try_start_f
    iget-object v3, v2, Llv;->m:Lou1;

    .line 332
    .line 333
    if-eqz v3, :cond_a

    .line 334
    .line 335
    invoke-virtual {v3, v0}, Lou1;->r(Ljava/lang/Throwable;)V

    .line 336
    .line 337
    .line 338
    goto :goto_6

    .line 339
    :catchall_7
    move-exception v0

    .line 340
    goto :goto_8

    .line 341
    :cond_a
    :goto_6
    monitor-exit v4
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_7

    .line 342
    invoke-virtual {v2}, Llv;->b()V

    .line 343
    .line 344
    .line 345
    :goto_7
    return-void

    .line 346
    :goto_8
    :try_start_10
    monitor-exit v4
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_7

    .line 347
    throw v0

    .line 348
    :goto_9
    :try_start_11
    monitor-exit v3
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_1

    .line 349
    throw v0

    .line 350
    :pswitch_9
    iget-object v0, v1, Le2;->g:Ljava/lang/Object;

    .line 351
    .line 352
    check-cast v0, Ltq;

    .line 353
    .line 354
    iget-object v2, v0, Ltq;->h:Landroid/widget/AutoCompleteTextView;

    .line 355
    .line 356
    invoke-virtual {v2}, Landroid/widget/AutoCompleteTextView;->isPopupShowing()Z

    .line 357
    .line 358
    .line 359
    move-result v2

    .line 360
    invoke-virtual {v0, v2}, Ltq;->s(Z)V

    .line 361
    .line 362
    .line 363
    iput-boolean v2, v0, Ltq;->m:Z

    .line 364
    .line 365
    return-void

    .line 366
    :pswitch_a
    iget-object v0, v1, Le2;->g:Ljava/lang/Object;

    .line 367
    .line 368
    check-cast v0, Leh;

    .line 369
    .line 370
    invoke-static {v0}, Leh;->b(Leh;)V

    .line 371
    .line 372
    .line 373
    return-void

    .line 374
    :pswitch_b
    iget-object v0, v1, Le2;->g:Ljava/lang/Object;

    .line 375
    .line 376
    check-cast v0, Lah;

    .line 377
    .line 378
    iget-object v3, v0, Lah;->g:Ljava/lang/Runnable;

    .line 379
    .line 380
    if-eqz v3, :cond_b

    .line 381
    .line 382
    invoke-interface {v3}, Ljava/lang/Runnable;->run()V

    .line 383
    .line 384
    .line 385
    iput-object v2, v0, Lah;->g:Ljava/lang/Runnable;

    .line 386
    .line 387
    :cond_b
    return-void

    .line 388
    :pswitch_c
    iget-object v0, v1, Le2;->g:Ljava/lang/Object;

    .line 389
    .line 390
    check-cast v0, Lqf;

    .line 391
    .line 392
    invoke-virtual {v0, v5}, Lqf;->s(Z)V

    .line 393
    .line 394
    .line 395
    return-void

    .line 396
    :pswitch_d
    iget-object v0, v1, Le2;->g:Ljava/lang/Object;

    .line 397
    .line 398
    check-cast v0, Lcom/google/android/material/carousel/CarouselLayoutManager;

    .line 399
    .line 400
    invoke-virtual {v0}, Lho0;->m0()V

    .line 401
    .line 402
    .line 403
    return-void

    .line 404
    :pswitch_e
    iget-object v0, v1, Le2;->g:Ljava/lang/Object;

    .line 405
    .line 406
    check-cast v0, Lq4;

    .line 407
    .line 408
    iget-object v0, v0, Lq4;->c:Lof3;

    .line 409
    .line 410
    iget-object v0, v0, Lof3;->g:Ljava/lang/Object;

    .line 411
    .line 412
    check-cast v0, Lq4;

    .line 413
    .line 414
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 415
    .line 416
    .line 417
    move-result-wide v3

    .line 418
    iget-object v7, v0, Lq4;->b:Ljava/util/ArrayList;

    .line 419
    .line 420
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 421
    .line 422
    .line 423
    move-result-wide v8

    .line 424
    move v10, v6

    .line 425
    :goto_a
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 426
    .line 427
    .line 428
    move-result v11

    .line 429
    if-ge v10, v11, :cond_1a

    .line 430
    .line 431
    invoke-virtual {v7, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 432
    .line 433
    .line 434
    move-result-object v11

    .line 435
    check-cast v11, Lnx0;

    .line 436
    .line 437
    if-nez v11, :cond_d

    .line 438
    .line 439
    :cond_c
    :goto_b
    move-wide/from16 v26, v3

    .line 440
    .line 441
    move-object/from16 v35, v7

    .line 442
    .line 443
    goto/16 :goto_15

    .line 444
    .line 445
    :cond_d
    iget-object v12, v0, Lq4;->a:Lbw0;

    .line 446
    .line 447
    invoke-virtual {v12, v11}, Lbw0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 448
    .line 449
    .line 450
    move-result-object v13

    .line 451
    check-cast v13, Ljava/lang/Long;

    .line 452
    .line 453
    if-nez v13, :cond_e

    .line 454
    .line 455
    goto :goto_c

    .line 456
    :cond_e
    invoke-virtual {v13}, Ljava/lang/Long;->longValue()J

    .line 457
    .line 458
    .line 459
    move-result-wide v13

    .line 460
    cmp-long v13, v13, v8

    .line 461
    .line 462
    if-gez v13, :cond_c

    .line 463
    .line 464
    invoke-virtual {v12, v11}, Lbw0;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 465
    .line 466
    .line 467
    :goto_c
    iget-wide v12, v11, Lnx0;->g:J

    .line 468
    .line 469
    const-wide/16 v14, 0x0

    .line 470
    .line 471
    cmp-long v16, v12, v14

    .line 472
    .line 473
    if-nez v16, :cond_f

    .line 474
    .line 475
    iput-wide v3, v11, Lnx0;->g:J

    .line 476
    .line 477
    iget v12, v11, Lnx0;->b:F

    .line 478
    .line 479
    invoke-virtual {v11, v12}, Lnx0;->c(F)V

    .line 480
    .line 481
    .line 482
    goto :goto_b

    .line 483
    :cond_f
    sub-long v12, v3, v12

    .line 484
    .line 485
    iput-wide v3, v11, Lnx0;->g:J

    .line 486
    .line 487
    invoke-static {}, Lnx0;->b()Lq4;

    .line 488
    .line 489
    .line 490
    move-result-object v14

    .line 491
    iget v14, v14, Lq4;->g:F

    .line 492
    .line 493
    const/4 v15, 0x0

    .line 494
    cmpl-float v18, v14, v15

    .line 495
    .line 496
    if-nez v18, :cond_10

    .line 497
    .line 498
    const-wide/32 v12, 0x7fffffff

    .line 499
    .line 500
    .line 501
    :goto_d
    move-wide/from16 v23, v12

    .line 502
    .line 503
    goto :goto_e

    .line 504
    :cond_10
    long-to-float v12, v12

    .line 505
    div-float/2addr v12, v14

    .line 506
    float-to-long v12, v12

    .line 507
    goto :goto_d

    .line 508
    :goto_e
    iget-boolean v12, v11, Lnx0;->m:Z

    .line 509
    .line 510
    const v13, 0x7f7fffff    # Float.MAX_VALUE

    .line 511
    .line 512
    .line 513
    const v14, -0x800001

    .line 514
    .line 515
    .line 516
    if-eqz v12, :cond_12

    .line 517
    .line 518
    iget v12, v11, Lnx0;->l:F

    .line 519
    .line 520
    cmpl-float v18, v12, v13

    .line 521
    .line 522
    if-eqz v18, :cond_11

    .line 523
    .line 524
    iget-object v5, v11, Lnx0;->k:Lox0;

    .line 525
    .line 526
    move-wide/from16 v26, v3

    .line 527
    .line 528
    float-to-double v2, v12

    .line 529
    iput-wide v2, v5, Lox0;->i:D

    .line 530
    .line 531
    iput v13, v11, Lnx0;->l:F

    .line 532
    .line 533
    goto :goto_f

    .line 534
    :cond_11
    move-wide/from16 v26, v3

    .line 535
    .line 536
    :goto_f
    iget-object v2, v11, Lnx0;->k:Lox0;

    .line 537
    .line 538
    iget-wide v2, v2, Lox0;->i:D

    .line 539
    .line 540
    double-to-float v2, v2

    .line 541
    iput v2, v11, Lnx0;->b:F

    .line 542
    .line 543
    iput v15, v11, Lnx0;->a:F

    .line 544
    .line 545
    iput-boolean v6, v11, Lnx0;->m:Z

    .line 546
    .line 547
    move-object/from16 v35, v7

    .line 548
    .line 549
    :goto_10
    const/4 v2, 0x1

    .line 550
    goto/16 :goto_12

    .line 551
    .line 552
    :cond_12
    move-wide/from16 v26, v3

    .line 553
    .line 554
    iget v2, v11, Lnx0;->l:F

    .line 555
    .line 556
    cmpl-float v2, v2, v13

    .line 557
    .line 558
    if-eqz v2, :cond_13

    .line 559
    .line 560
    iget-object v2, v11, Lnx0;->k:Lox0;

    .line 561
    .line 562
    iget v3, v11, Lnx0;->b:F

    .line 563
    .line 564
    float-to-double v3, v3

    .line 565
    iget v5, v11, Lnx0;->a:F

    .line 566
    .line 567
    move-object/from16 v35, v7

    .line 568
    .line 569
    float-to-double v6, v5

    .line 570
    const-wide/16 v18, 0x2

    .line 571
    .line 572
    div-long v33, v23, v18

    .line 573
    .line 574
    move-object/from16 v28, v2

    .line 575
    .line 576
    move-wide/from16 v29, v3

    .line 577
    .line 578
    move-wide/from16 v31, v6

    .line 579
    .line 580
    invoke-virtual/range {v28 .. v34}, Lox0;->c(DDJ)Lvq;

    .line 581
    .line 582
    .line 583
    move-result-object v2

    .line 584
    iget-object v3, v11, Lnx0;->k:Lox0;

    .line 585
    .line 586
    iget v4, v11, Lnx0;->l:F

    .line 587
    .line 588
    float-to-double v4, v4

    .line 589
    iput-wide v4, v3, Lox0;->i:D

    .line 590
    .line 591
    iput v13, v11, Lnx0;->l:F

    .line 592
    .line 593
    iget v4, v2, Lvq;->a:F

    .line 594
    .line 595
    float-to-double v4, v4

    .line 596
    iget v2, v2, Lvq;->b:F

    .line 597
    .line 598
    float-to-double v6, v2

    .line 599
    move-object/from16 v28, v3

    .line 600
    .line 601
    move-wide/from16 v29, v4

    .line 602
    .line 603
    move-wide/from16 v31, v6

    .line 604
    .line 605
    invoke-virtual/range {v28 .. v34}, Lox0;->c(DDJ)Lvq;

    .line 606
    .line 607
    .line 608
    move-result-object v2

    .line 609
    iget v3, v2, Lvq;->a:F

    .line 610
    .line 611
    iput v3, v11, Lnx0;->b:F

    .line 612
    .line 613
    iget v2, v2, Lvq;->b:F

    .line 614
    .line 615
    iput v2, v11, Lnx0;->a:F

    .line 616
    .line 617
    goto :goto_11

    .line 618
    :cond_13
    move-object/from16 v35, v7

    .line 619
    .line 620
    iget-object v2, v11, Lnx0;->k:Lox0;

    .line 621
    .line 622
    iget v3, v11, Lnx0;->b:F

    .line 623
    .line 624
    float-to-double v3, v3

    .line 625
    iget v5, v11, Lnx0;->a:F

    .line 626
    .line 627
    float-to-double v5, v5

    .line 628
    move-object/from16 v18, v2

    .line 629
    .line 630
    move-wide/from16 v19, v3

    .line 631
    .line 632
    move-wide/from16 v21, v5

    .line 633
    .line 634
    invoke-virtual/range {v18 .. v24}, Lox0;->c(DDJ)Lvq;

    .line 635
    .line 636
    .line 637
    move-result-object v2

    .line 638
    iget v3, v2, Lvq;->a:F

    .line 639
    .line 640
    iput v3, v11, Lnx0;->b:F

    .line 641
    .line 642
    iget v2, v2, Lvq;->b:F

    .line 643
    .line 644
    iput v2, v11, Lnx0;->a:F

    .line 645
    .line 646
    :goto_11
    iget v2, v11, Lnx0;->b:F

    .line 647
    .line 648
    invoke-static {v2, v14}, Ljava/lang/Math;->max(FF)F

    .line 649
    .line 650
    .line 651
    move-result v2

    .line 652
    iput v2, v11, Lnx0;->b:F

    .line 653
    .line 654
    invoke-static {v2, v13}, Ljava/lang/Math;->min(FF)F

    .line 655
    .line 656
    .line 657
    move-result v2

    .line 658
    iput v2, v11, Lnx0;->b:F

    .line 659
    .line 660
    iget v3, v11, Lnx0;->a:F

    .line 661
    .line 662
    iget-object v4, v11, Lnx0;->k:Lox0;

    .line 663
    .line 664
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 665
    .line 666
    .line 667
    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    .line 668
    .line 669
    .line 670
    move-result v3

    .line 671
    float-to-double v5, v3

    .line 672
    iget-wide v12, v4, Lox0;->e:D

    .line 673
    .line 674
    cmpg-double v5, v5, v12

    .line 675
    .line 676
    if-gez v5, :cond_14

    .line 677
    .line 678
    iget-wide v5, v4, Lox0;->i:D

    .line 679
    .line 680
    double-to-float v5, v5

    .line 681
    sub-float/2addr v2, v5

    .line 682
    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    .line 683
    .line 684
    .line 685
    move-result v2

    .line 686
    float-to-double v5, v2

    .line 687
    iget-wide v12, v4, Lox0;->d:D

    .line 688
    .line 689
    cmpg-double v2, v5, v12

    .line 690
    .line 691
    if-gez v2, :cond_14

    .line 692
    .line 693
    iget-object v2, v11, Lnx0;->k:Lox0;

    .line 694
    .line 695
    iget-wide v4, v2, Lox0;->i:D

    .line 696
    .line 697
    double-to-float v2, v4

    .line 698
    iput v2, v11, Lnx0;->b:F

    .line 699
    .line 700
    iput v15, v11, Lnx0;->a:F

    .line 701
    .line 702
    goto/16 :goto_10

    .line 703
    .line 704
    :cond_14
    const/4 v2, 0x0

    .line 705
    :goto_12
    iget v4, v11, Lnx0;->b:F

    .line 706
    .line 707
    const v3, 0x7f7fffff    # Float.MAX_VALUE

    .line 708
    .line 709
    .line 710
    invoke-static {v4, v3}, Ljava/lang/Math;->min(FF)F

    .line 711
    .line 712
    .line 713
    move-result v3

    .line 714
    iput v3, v11, Lnx0;->b:F

    .line 715
    .line 716
    invoke-static {v3, v14}, Ljava/lang/Math;->max(FF)F

    .line 717
    .line 718
    .line 719
    move-result v3

    .line 720
    iput v3, v11, Lnx0;->b:F

    .line 721
    .line 722
    invoke-virtual {v11, v3}, Lnx0;->c(F)V

    .line 723
    .line 724
    .line 725
    if-eqz v2, :cond_19

    .line 726
    .line 727
    iget-object v2, v11, Lnx0;->i:Ljava/util/ArrayList;

    .line 728
    .line 729
    const/4 v12, 0x0

    .line 730
    iput-boolean v12, v11, Lnx0;->f:Z

    .line 731
    .line 732
    invoke-static {}, Lnx0;->b()Lq4;

    .line 733
    .line 734
    .line 735
    move-result-object v3

    .line 736
    iget-object v4, v3, Lq4;->a:Lbw0;

    .line 737
    .line 738
    invoke-virtual {v4, v11}, Lbw0;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 739
    .line 740
    .line 741
    iget-object v4, v3, Lq4;->b:Ljava/util/ArrayList;

    .line 742
    .line 743
    invoke-virtual {v4, v11}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    .line 744
    .line 745
    .line 746
    move-result v5

    .line 747
    if-ltz v5, :cond_15

    .line 748
    .line 749
    const/4 v6, 0x0

    .line 750
    invoke-virtual {v4, v5, v6}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 751
    .line 752
    .line 753
    const/4 v4, 0x1

    .line 754
    iput-boolean v4, v3, Lq4;->f:Z

    .line 755
    .line 756
    :cond_15
    const-wide/16 v3, 0x0

    .line 757
    .line 758
    iput-wide v3, v11, Lnx0;->g:J

    .line 759
    .line 760
    const/4 v12, 0x0

    .line 761
    iput-boolean v12, v11, Lnx0;->c:Z

    .line 762
    .line 763
    const/4 v3, 0x0

    .line 764
    :goto_13
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 765
    .line 766
    .line 767
    move-result v4

    .line 768
    if-ge v3, v4, :cond_17

    .line 769
    .line 770
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 771
    .line 772
    .line 773
    move-result-object v4

    .line 774
    if-nez v4, :cond_16

    .line 775
    .line 776
    add-int/lit8 v3, v3, 0x1

    .line 777
    .line 778
    goto :goto_13

    .line 779
    :cond_16
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 780
    .line 781
    .line 782
    move-result-object v0

    .line 783
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 784
    .line 785
    .line 786
    new-instance v0, Ljava/lang/ClassCastException;

    .line 787
    .line 788
    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    .line 789
    .line 790
    .line 791
    throw v0

    .line 792
    :cond_17
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 793
    .line 794
    .line 795
    move-result v3

    .line 796
    const/16 v25, 0x1

    .line 797
    .line 798
    add-int/lit8 v3, v3, -0x1

    .line 799
    .line 800
    :goto_14
    if-ltz v3, :cond_19

    .line 801
    .line 802
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 803
    .line 804
    .line 805
    move-result-object v4

    .line 806
    if-nez v4, :cond_18

    .line 807
    .line 808
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 809
    .line 810
    .line 811
    :cond_18
    add-int/lit8 v3, v3, -0x1

    .line 812
    .line 813
    goto :goto_14

    .line 814
    :cond_19
    :goto_15
    add-int/lit8 v10, v10, 0x1

    .line 815
    .line 816
    move-wide/from16 v3, v26

    .line 817
    .line 818
    move-object/from16 v7, v35

    .line 819
    .line 820
    const/4 v2, 0x0

    .line 821
    const/4 v5, 0x1

    .line 822
    const/4 v6, 0x0

    .line 823
    goto/16 :goto_a

    .line 824
    .line 825
    :cond_1a
    move-object/from16 v35, v7

    .line 826
    .line 827
    iget-boolean v2, v0, Lq4;->f:Z

    .line 828
    .line 829
    if-eqz v2, :cond_1e

    .line 830
    .line 831
    invoke-virtual/range {v35 .. v35}, Ljava/util/ArrayList;->size()I

    .line 832
    .line 833
    .line 834
    move-result v2

    .line 835
    const/16 v25, 0x1

    .line 836
    .line 837
    add-int/lit8 v2, v2, -0x1

    .line 838
    .line 839
    :goto_16
    if-ltz v2, :cond_1c

    .line 840
    .line 841
    move-object/from16 v3, v35

    .line 842
    .line 843
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 844
    .line 845
    .line 846
    move-result-object v4

    .line 847
    if-nez v4, :cond_1b

    .line 848
    .line 849
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 850
    .line 851
    .line 852
    :cond_1b
    add-int/lit8 v2, v2, -0x1

    .line 853
    .line 854
    move-object/from16 v35, v3

    .line 855
    .line 856
    goto :goto_16

    .line 857
    :cond_1c
    move-object/from16 v3, v35

    .line 858
    .line 859
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 860
    .line 861
    .line 862
    move-result v2

    .line 863
    if-nez v2, :cond_1d

    .line 864
    .line 865
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 866
    .line 867
    const/16 v4, 0x21

    .line 868
    .line 869
    if-lt v2, v4, :cond_1d

    .line 870
    .line 871
    iget-object v2, v0, Lq4;->h:Ll92;

    .line 872
    .line 873
    iget-object v4, v2, Ll92;->f:Ljava/lang/Object;

    .line 874
    .line 875
    check-cast v4, Lo4;

    .line 876
    .line 877
    invoke-static {v4}, Lt0;->o(Lo4;)Z

    .line 878
    .line 879
    .line 880
    const/4 v6, 0x0

    .line 881
    iput-object v6, v2, Ll92;->f:Ljava/lang/Object;

    .line 882
    .line 883
    :cond_1d
    const/4 v12, 0x0

    .line 884
    iput-boolean v12, v0, Lq4;->f:Z

    .line 885
    .line 886
    goto :goto_17

    .line 887
    :cond_1e
    move-object/from16 v3, v35

    .line 888
    .line 889
    :goto_17
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 890
    .line 891
    .line 892
    move-result v2

    .line 893
    if-lez v2, :cond_1f

    .line 894
    .line 895
    iget-object v2, v0, Lq4;->e:Lvq2;

    .line 896
    .line 897
    iget-object v0, v0, Lq4;->d:Le2;

    .line 898
    .line 899
    iget-object v2, v2, Lvq2;->g:Ljava/lang/Object;

    .line 900
    .line 901
    check-cast v2, Landroid/view/Choreographer;

    .line 902
    .line 903
    new-instance v3, Lp4;

    .line 904
    .line 905
    invoke-direct {v3, v0}, Lp4;-><init>(Ljava/lang/Runnable;)V

    .line 906
    .line 907
    .line 908
    invoke-virtual {v2, v3}, Landroid/view/Choreographer;->postFrameCallback(Landroid/view/Choreographer$FrameCallback;)V

    .line 909
    .line 910
    .line 911
    :cond_1f
    return-void

    .line 912
    :pswitch_f
    move/from16 v25, v5

    .line 913
    .line 914
    iget-object v0, v1, Le2;->g:Ljava/lang/Object;

    .line 915
    .line 916
    move-object v2, v0

    .line 917
    check-cast v2, Landroid/app/Activity;

    .line 918
    .line 919
    invoke-virtual {v2}, Landroid/app/Activity;->isFinishing()Z

    .line 920
    .line 921
    .line 922
    move-result v0

    .line 923
    if-nez v0, :cond_29

    .line 924
    .line 925
    sget-object v5, Lj2;->g:Landroid/os/Handler;

    .line 926
    .line 927
    sget-object v0, Lj2;->f:Ljava/lang/reflect/Method;

    .line 928
    .line 929
    sget v6, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 930
    .line 931
    const/16 v7, 0x1c

    .line 932
    .line 933
    if-lt v6, v7, :cond_20

    .line 934
    .line 935
    invoke-virtual {v2}, Landroid/app/Activity;->recreate()V

    .line 936
    .line 937
    .line 938
    goto/16 :goto_1c

    .line 939
    .line 940
    :cond_20
    const/16 v7, 0x1b

    .line 941
    .line 942
    const/16 v8, 0x1a

    .line 943
    .line 944
    if-eq v6, v8, :cond_21

    .line 945
    .line 946
    if-ne v6, v7, :cond_22

    .line 947
    .line 948
    :cond_21
    if-nez v0, :cond_22

    .line 949
    .line 950
    goto/16 :goto_1b

    .line 951
    .line 952
    :cond_22
    sget-object v9, Lj2;->e:Ljava/lang/reflect/Method;

    .line 953
    .line 954
    if-nez v9, :cond_23

    .line 955
    .line 956
    sget-object v9, Lj2;->d:Ljava/lang/reflect/Method;

    .line 957
    .line 958
    if-nez v9, :cond_23

    .line 959
    .line 960
    goto :goto_1b

    .line 961
    :cond_23
    :try_start_12
    sget-object v9, Lj2;->c:Ljava/lang/reflect/Field;

    .line 962
    .line 963
    invoke-virtual {v9, v2}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 964
    .line 965
    .line 966
    move-result-object v13

    .line 967
    if-nez v13, :cond_24

    .line 968
    .line 969
    goto :goto_1b

    .line 970
    :cond_24
    sget-object v9, Lj2;->b:Ljava/lang/reflect/Field;

    .line 971
    .line 972
    invoke-virtual {v9, v2}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 973
    .line 974
    .line 975
    move-result-object v9

    .line 976
    if-nez v9, :cond_25

    .line 977
    .line 978
    goto :goto_1b

    .line 979
    :cond_25
    invoke-virtual {v2}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 980
    .line 981
    .line 982
    move-result-object v10

    .line 983
    new-instance v11, Li2;

    .line 984
    .line 985
    invoke-direct {v11, v2}, Li2;-><init>(Landroid/app/Activity;)V

    .line 986
    .line 987
    .line 988
    invoke-virtual {v10, v11}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 989
    .line 990
    .line 991
    new-instance v14, Ljq3;

    .line 992
    .line 993
    invoke-direct {v14, v11, v13, v4}, Ljq3;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 994
    .line 995
    .line 996
    invoke-virtual {v5, v14}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_9

    .line 997
    .line 998
    .line 999
    if-eq v6, v8, :cond_27

    .line 1000
    .line 1001
    if-ne v6, v7, :cond_26

    .line 1002
    .line 1003
    goto :goto_18

    .line 1004
    :cond_26
    const/16 v25, 0x0

    .line 1005
    .line 1006
    :cond_27
    :goto_18
    if-eqz v25, :cond_28

    .line 1007
    .line 1008
    const/4 v12, 0x0

    .line 1009
    :try_start_13
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1010
    .line 1011
    .line 1012
    move-result-object v16

    .line 1013
    sget-object v17, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 1014
    .line 1015
    const/16 v18, 0x0

    .line 1016
    .line 1017
    const/16 v19, 0x0

    .line 1018
    .line 1019
    const/4 v14, 0x0

    .line 1020
    const/4 v15, 0x0

    .line 1021
    move-object/from16 v20, v17

    .line 1022
    .line 1023
    move-object/from16 v21, v17

    .line 1024
    .line 1025
    filled-new-array/range {v13 .. v21}, [Ljava/lang/Object;

    .line 1026
    .line 1027
    .line 1028
    move-result-object v4

    .line 1029
    invoke-virtual {v0, v9, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 1030
    .line 1031
    .line 1032
    goto :goto_19

    .line 1033
    :catchall_8
    move-exception v0

    .line 1034
    goto :goto_1a

    .line 1035
    :cond_28
    invoke-virtual {v2}, Landroid/app/Activity;->recreate()V
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_8

    .line 1036
    .line 1037
    .line 1038
    :goto_19
    :try_start_14
    new-instance v0, Ljq3;

    .line 1039
    .line 1040
    invoke-direct {v0, v10, v11, v3}, Ljq3;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 1041
    .line 1042
    .line 1043
    invoke-virtual {v5, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 1044
    .line 1045
    .line 1046
    goto :goto_1c

    .line 1047
    :goto_1a
    new-instance v4, Ljq3;

    .line 1048
    .line 1049
    invoke-direct {v4, v10, v11, v3}, Ljq3;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 1050
    .line 1051
    .line 1052
    invoke-virtual {v5, v4}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 1053
    .line 1054
    .line 1055
    throw v0
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_9

    .line 1056
    :catchall_9
    :goto_1b
    invoke-virtual {v2}, Landroid/app/Activity;->recreate()V

    .line 1057
    .line 1058
    .line 1059
    :cond_29
    :goto_1c
    return-void

    .line 1060
    nop

    .line 1061
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
