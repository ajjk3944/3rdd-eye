.class public final synthetic Lfa0;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lhy;


# instance fields
.field public final synthetic f:I

.field public final synthetic g:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lfa0;->f:I

    .line 2
    .line 3
    iput-object p2, p0, Lfa0;->g:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final f(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget v0, p0, Lfa0;->f:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    const/4 v3, 0x0

    .line 6
    iget-object v4, p0, Lfa0;->g:Ljava/lang/Object;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    check-cast v4, Ljava/util/List;

    .line 12
    .line 13
    check-cast p1, Ljava/lang/CharSequence;

    .line 14
    .line 15
    check-cast p2, Ljava/lang/Integer;

    .line 16
    .line 17
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 18
    .line 19
    .line 20
    move-result p2

    .line 21
    const-string v0, "$this$DelimitedRangesSequence"

    .line 22
    .line 23
    invoke-static {p1, v0}, Li30;->m(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-interface {v4}, Ljava/util/Collection;->size()I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-ne v0, v2, :cond_4

    .line 31
    .line 32
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v0, :cond_3

    .line 37
    .line 38
    if-ne v0, v2, :cond_2

    .line 39
    .line 40
    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    check-cast v0, Ljava/lang/String;

    .line 45
    .line 46
    const/4 v2, 0x4

    .line 47
    invoke-static {p1, v0, p2, v3, v2}, Lsy0;->C(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    if-gez p1, :cond_1

    .line 52
    .line 53
    :cond_0
    :goto_0
    move-object p2, v1

    .line 54
    goto/16 :goto_6

    .line 55
    .line 56
    :cond_1
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    new-instance p2, Lgk0;

    .line 61
    .line 62
    invoke-direct {p2, p1, v0}, Lgk0;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    goto/16 :goto_6

    .line 66
    .line 67
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 68
    .line 69
    const-string p2, "List has more than one element."

    .line 70
    .line 71
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    throw p1

    .line 75
    :cond_3
    new-instance p1, Ljava/util/NoSuchElementException;

    .line 76
    .line 77
    const-string p2, "List is empty."

    .line 78
    .line 79
    invoke-direct {p1, p2}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    throw p1

    .line 83
    :cond_4
    new-instance v0, Ld30;

    .line 84
    .line 85
    if-gez p2, :cond_5

    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_5
    move v3, p2

    .line 89
    :goto_1
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 90
    .line 91
    .line 92
    move-result p2

    .line 93
    invoke-direct {v0, v3, p2, v2}, Lb30;-><init>(III)V

    .line 94
    .line 95
    .line 96
    instance-of p2, p1, Ljava/lang/String;

    .line 97
    .line 98
    const/4 v10, 0x0

    .line 99
    iget v0, v0, Lb30;->g:I

    .line 100
    .line 101
    if-eqz p2, :cond_a

    .line 102
    .line 103
    if-le v3, v0, :cond_6

    .line 104
    .line 105
    goto :goto_0

    .line 106
    :cond_6
    move v6, v3

    .line 107
    :goto_2
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 108
    .line 109
    .line 110
    move-result-object p2

    .line 111
    :cond_7
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 112
    .line 113
    .line 114
    move-result v2

    .line 115
    if-eqz v2, :cond_8

    .line 116
    .line 117
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v2

    .line 121
    move-object v8, v2

    .line 122
    check-cast v8, Ljava/lang/String;

    .line 123
    .line 124
    move-object v9, p1

    .line 125
    check-cast v9, Ljava/lang/String;

    .line 126
    .line 127
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 128
    .line 129
    .line 130
    move-result v7

    .line 131
    const/4 v5, 0x0

    .line 132
    invoke-static/range {v5 .. v10}, Lsy0;->F(IIILjava/lang/String;Ljava/lang/String;Z)Z

    .line 133
    .line 134
    .line 135
    move-result v3

    .line 136
    if-eqz v3, :cond_7

    .line 137
    .line 138
    goto :goto_3

    .line 139
    :cond_8
    move-object v2, v1

    .line 140
    :goto_3
    check-cast v2, Ljava/lang/String;

    .line 141
    .line 142
    if-eqz v2, :cond_9

    .line 143
    .line 144
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 145
    .line 146
    .line 147
    move-result-object p1

    .line 148
    new-instance p2, Lgk0;

    .line 149
    .line 150
    invoke-direct {p2, p1, v2}, Lgk0;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 151
    .line 152
    .line 153
    goto :goto_6

    .line 154
    :cond_9
    if-eq v6, v0, :cond_0

    .line 155
    .line 156
    add-int/lit8 v6, v6, 0x1

    .line 157
    .line 158
    goto :goto_2

    .line 159
    :cond_a
    if-le v3, v0, :cond_b

    .line 160
    .line 161
    goto :goto_0

    .line 162
    :cond_b
    :goto_4
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 163
    .line 164
    .line 165
    move-result-object p2

    .line 166
    :cond_c
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 167
    .line 168
    .line 169
    move-result v2

    .line 170
    if-eqz v2, :cond_d

    .line 171
    .line 172
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v2

    .line 176
    move-object v5, v2

    .line 177
    check-cast v5, Ljava/lang/String;

    .line 178
    .line 179
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 180
    .line 181
    .line 182
    move-result v6

    .line 183
    invoke-static {v5, p1, v3, v6, v10}, Lsy0;->G(Ljava/lang/CharSequence;Ljava/lang/CharSequence;IIZ)Z

    .line 184
    .line 185
    .line 186
    move-result v5

    .line 187
    if-eqz v5, :cond_c

    .line 188
    .line 189
    goto :goto_5

    .line 190
    :cond_d
    move-object v2, v1

    .line 191
    :goto_5
    check-cast v2, Ljava/lang/String;

    .line 192
    .line 193
    if-eqz v2, :cond_e

    .line 194
    .line 195
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 196
    .line 197
    .line 198
    move-result-object p1

    .line 199
    new-instance p2, Lgk0;

    .line 200
    .line 201
    invoke-direct {p2, p1, v2}, Lgk0;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 202
    .line 203
    .line 204
    goto :goto_6

    .line 205
    :cond_e
    if-eq v3, v0, :cond_0

    .line 206
    .line 207
    add-int/lit8 v3, v3, 0x1

    .line 208
    .line 209
    goto :goto_4

    .line 210
    :goto_6
    if-eqz p2, :cond_f

    .line 211
    .line 212
    iget-object p1, p2, Lgk0;->f:Ljava/lang/Object;

    .line 213
    .line 214
    iget-object p2, p2, Lgk0;->g:Ljava/lang/Object;

    .line 215
    .line 216
    check-cast p2, Ljava/lang/String;

    .line 217
    .line 218
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 219
    .line 220
    .line 221
    move-result p2

    .line 222
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 223
    .line 224
    .line 225
    move-result-object p2

    .line 226
    new-instance v1, Lgk0;

    .line 227
    .line 228
    invoke-direct {v1, p1, p2}, Lgk0;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 229
    .line 230
    .line 231
    :cond_f
    return-object v1

    .line 232
    :pswitch_0
    check-cast v4, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;

    .line 233
    .line 234
    check-cast p1, Landroid/view/View;

    .line 235
    .line 236
    check-cast p2, Ld10;

    .line 237
    .line 238
    sget-object v0, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->d0:[I

    .line 239
    .line 240
    const-string v0, "v"

    .line 241
    .line 242
    invoke-static {p1, v0}, Li30;->m(Ljava/lang/Object;Ljava/lang/String;)V

    .line 243
    .line 244
    .line 245
    const-string v0, "hostObj"

    .line 246
    .line 247
    invoke-static {p2, v0}, Li30;->m(Ljava/lang/Object;Ljava/lang/String;)V

    .line 248
    .line 249
    .line 250
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    .line 251
    .line 252
    .line 253
    move-result v0

    .line 254
    const v5, 0x7f09008e

    .line 255
    .line 256
    .line 257
    if-ne v0, v5, :cond_10

    .line 258
    .line 259
    const v0, 0x7f12001f

    .line 260
    .line 261
    .line 262
    invoke-virtual {v4, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 263
    .line 264
    .line 265
    move-result-object v0

    .line 266
    const v1, 0x7f120124

    .line 267
    .line 268
    .line 269
    invoke-virtual {v4, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 270
    .line 271
    .line 272
    move-result-object v1

    .line 273
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 274
    .line 275
    .line 276
    move-result-object v0

    .line 277
    new-instance v1, Ljb0;

    .line 278
    .line 279
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 280
    .line 281
    .line 282
    move-result-object p1

    .line 283
    invoke-direct {v1, p1}, Ljb0;-><init>(Landroid/content/Context;)V

    .line 284
    .line 285
    .line 286
    iget-object p1, v1, Lt3;->h:Ljava/lang/Object;

    .line 287
    .line 288
    check-cast p1, Lp3;

    .line 289
    .line 290
    const-string v2, "80 http"

    .line 291
    .line 292
    iput-object v2, p1, Lp3;->d:Ljava/lang/CharSequence;

    .line 293
    .line 294
    check-cast v0, [Ljava/lang/CharSequence;

    .line 295
    .line 296
    new-instance v2, Lja0;

    .line 297
    .line 298
    invoke-direct {v2, v4, p2}, Lja0;-><init>(Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;Ld10;)V

    .line 299
    .line 300
    .line 301
    iput-object v0, p1, Lp3;->l:[Ljava/lang/CharSequence;

    .line 302
    .line 303
    iput-object v2, p1, Lp3;->n:Landroid/content/DialogInterface$OnClickListener;

    .line 304
    .line 305
    invoke-virtual {v1}, Ljb0;->b()Lu3;

    .line 306
    .line 307
    .line 308
    move-result-object p1

    .line 309
    invoke-virtual {p1}, Landroid/app/Dialog;->show()V

    .line 310
    .line 311
    .line 312
    goto/16 :goto_7

    .line 313
    .line 314
    :cond_10
    iget-object p1, v4, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->W:Lvb;

    .line 315
    .line 316
    const-string v0, "bottomSheetDialog"

    .line 317
    .line 318
    if-eqz p1, :cond_18

    .line 319
    .line 320
    const v5, 0x7f090142

    .line 321
    .line 322
    .line 323
    invoke-virtual {p1, v5}, Lj6;->findViewById(I)Landroid/view/View;

    .line 324
    .line 325
    .line 326
    move-result-object v5

    .line 327
    check-cast v5, Landroid/widget/ImageView;

    .line 328
    .line 329
    const v6, 0x7f090288

    .line 330
    .line 331
    .line 332
    invoke-virtual {p1, v6}, Lj6;->findViewById(I)Landroid/view/View;

    .line 333
    .line 334
    .line 335
    move-result-object v6

    .line 336
    check-cast v6, Landroid/widget/TextView;

    .line 337
    .line 338
    const v7, 0x7f090283

    .line 339
    .line 340
    .line 341
    invoke-virtual {p1, v7}, Lj6;->findViewById(I)Landroid/view/View;

    .line 342
    .line 343
    .line 344
    move-result-object v7

    .line 345
    check-cast v7, Landroid/widget/TextView;

    .line 346
    .line 347
    const v8, 0x7f090284

    .line 348
    .line 349
    .line 350
    invoke-virtual {p1, v8}, Lj6;->findViewById(I)Landroid/view/View;

    .line 351
    .line 352
    .line 353
    move-result-object v8

    .line 354
    check-cast v8, Landroid/widget/TextView;

    .line 355
    .line 356
    const v9, 0x7f090096

    .line 357
    .line 358
    .line 359
    invoke-virtual {p1, v9}, Lj6;->findViewById(I)Landroid/view/View;

    .line 360
    .line 361
    .line 362
    move-result-object v9

    .line 363
    check-cast v9, Landroid/widget/TextView;

    .line 364
    .line 365
    const v10, 0x7f090098

    .line 366
    .line 367
    .line 368
    invoke-virtual {p1, v10}, Lj6;->findViewById(I)Landroid/view/View;

    .line 369
    .line 370
    .line 371
    move-result-object v10

    .line 372
    check-cast v10, Landroid/widget/TextView;

    .line 373
    .line 374
    if-eqz v5, :cond_11

    .line 375
    .line 376
    iget v11, p2, Ld10;->f:I

    .line 377
    .line 378
    invoke-virtual {v5, v11}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 379
    .line 380
    .line 381
    :cond_11
    if-eqz v6, :cond_12

    .line 382
    .line 383
    iget-object v5, p2, Ld10;->c:Ljava/lang/String;

    .line 384
    .line 385
    iget-object v11, p2, Ld10;->e:Ljava/lang/String;

    .line 386
    .line 387
    invoke-static {v5, v11}, Lum;->j(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 388
    .line 389
    .line 390
    move-result-object v5

    .line 391
    invoke-virtual {v6, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 392
    .line 393
    .line 394
    :cond_12
    if-eqz v7, :cond_13

    .line 395
    .line 396
    iget-object v5, p2, Ld10;->b:Ljava/lang/String;

    .line 397
    .line 398
    invoke-virtual {v7, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 399
    .line 400
    .line 401
    :cond_13
    iget-object v5, p2, Ld10;->d:Ljava/lang/String;

    .line 402
    .line 403
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 404
    .line 405
    .line 406
    move-result v6

    .line 407
    if-lez v6, :cond_14

    .line 408
    .line 409
    const-string v6, "00:00:00:00:00:00"

    .line 410
    .line 411
    invoke-virtual {v5, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 412
    .line 413
    .line 414
    move-result v6

    .line 415
    if-nez v6, :cond_14

    .line 416
    .line 417
    if-eqz v8, :cond_14

    .line 418
    .line 419
    invoke-virtual {v8, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 420
    .line 421
    .line 422
    :cond_14
    if-eqz v9, :cond_15

    .line 423
    .line 424
    new-instance v5, Loa0;

    .line 425
    .line 426
    invoke-direct {v5, v4, p2, p1, v3}, Loa0;-><init>(Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;Ld10;Lvb;I)V

    .line 427
    .line 428
    .line 429
    invoke-virtual {v9, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 430
    .line 431
    .line 432
    :cond_15
    if-eqz v10, :cond_16

    .line 433
    .line 434
    new-instance v3, Loa0;

    .line 435
    .line 436
    invoke-direct {v3, v4, p2, p1, v2}, Loa0;-><init>(Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;Ld10;Lvb;I)V

    .line 437
    .line 438
    .line 439
    invoke-virtual {v10, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 440
    .line 441
    .line 442
    :cond_16
    iget-object p1, v4, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->W:Lvb;

    .line 443
    .line 444
    if-eqz p1, :cond_17

    .line 445
    .line 446
    invoke-virtual {p1}, Landroid/app/Dialog;->show()V

    .line 447
    .line 448
    .line 449
    :goto_7
    sget-object p1, Lz31;->a:Lz31;

    .line 450
    .line 451
    return-object p1

    .line 452
    :cond_17
    invoke-static {v0}, Li30;->S(Ljava/lang/String;)V

    .line 453
    .line 454
    .line 455
    throw v1

    .line 456
    :cond_18
    invoke-static {v0}, Li30;->S(Ljava/lang/String;)V

    .line 457
    .line 458
    .line 459
    throw v1

    .line 460
    nop

    .line 461
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
