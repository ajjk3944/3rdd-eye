.class public final synthetic Lea0;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic f:I

.field public final synthetic g:Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;I)V
    .locals 0

    .line 1
    iput p2, p0, Lea0;->f:I

    .line 2
    .line 3
    iput-object p1, p0, Lea0;->g:Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 12

    .line 1
    iget p1, p0, Lea0;->f:I

    .line 2
    .line 3
    iget-object v0, p0, Lea0;->g:Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget-object p1, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->d0:[I

    .line 9
    .line 10
    new-instance p1, Ly00;

    .line 11
    .line 12
    invoke-direct {p1}, Ly00;-><init>()V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Li5;->o()Lxw;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    const-string v1, "ModalBottomSheet"

    .line 20
    .line 21
    invoke-virtual {p1, v0, v1}, Lxo;->Q(Lxw;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :pswitch_0
    sget-object p1, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->d0:[I

    .line 26
    .line 27
    invoke-virtual {v0}, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->D()V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :pswitch_1
    sget-object p1, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->d0:[I

    .line 32
    .line 33
    invoke-virtual {v0}, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->z()V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :pswitch_2
    sget-object p1, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->d0:[I

    .line 38
    .line 39
    invoke-virtual {v0}, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->D()V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :pswitch_3
    sget-object p1, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->d0:[I

    .line 44
    .line 45
    new-instance p1, Ljava/util/ArrayList;

    .line 46
    .line 47
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 48
    .line 49
    .line 50
    iget-object v1, v0, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->G:Landroid/net/wifi/WifiManager;

    .line 51
    .line 52
    const/4 v2, 0x0

    .line 53
    const-string v3, "wifiManager"

    .line 54
    .line 55
    if-eqz v1, :cond_7

    .line 56
    .line 57
    invoke-virtual {v1}, Landroid/net/wifi/WifiManager;->getConnectionInfo()Landroid/net/wifi/WifiInfo;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    iget-object v4, v0, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->C:Lf2;

    .line 62
    .line 63
    if-eqz v4, :cond_6

    .line 64
    .line 65
    iget-object v4, v4, Lf2;->f:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v4, Lxi;

    .line 68
    .line 69
    iget-object v5, v4, Lxi;->j:Landroid/widget/TextView;

    .line 70
    .line 71
    const v6, 0x7f120121

    .line 72
    .line 73
    .line 74
    invoke-virtual {v0, v6}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v6

    .line 78
    const-string v7, "getString(...)"

    .line 79
    .line 80
    invoke-static {v6, v7}, Li30;->l(Ljava/lang/Object;Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v1}, Landroid/net/wifi/WifiInfo;->getSupplicantState()Landroid/net/wifi/SupplicantState;

    .line 84
    .line 85
    .line 86
    move-result-object v8

    .line 87
    sget-object v9, Landroid/net/wifi/SupplicantState;->COMPLETED:Landroid/net/wifi/SupplicantState;

    .line 88
    .line 89
    const v10, 0x7f120134

    .line 90
    .line 91
    .line 92
    const v11, 0x7f0800ce

    .line 93
    .line 94
    .line 95
    if-ne v8, v9, :cond_5

    .line 96
    .line 97
    iget-object v8, v4, Lxi;->m:Landroid/widget/TextView;

    .line 98
    .line 99
    invoke-virtual {v8}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 100
    .line 101
    .line 102
    move-result-object v8

    .line 103
    invoke-virtual {v8}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v8

    .line 107
    new-instance v9, Lk81;

    .line 108
    .line 109
    invoke-virtual {v0, v10}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v10

    .line 113
    invoke-static {v10, v7}, Li30;->l(Ljava/lang/Object;Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v5}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 117
    .line 118
    .line 119
    move-result-object v5

    .line 120
    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v5

    .line 124
    invoke-direct {v9, v11, v10, v5}, Lk81;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {p1, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    new-instance v5, Lk81;

    .line 131
    .line 132
    const v9, 0x7f120133

    .line 133
    .line 134
    .line 135
    invoke-virtual {v0, v9}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v9

    .line 139
    invoke-static {v9, v7}, Li30;->l(Ljava/lang/Object;Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    iget-object v10, v4, Lxi;->f:Landroid/widget/TextView;

    .line 143
    .line 144
    invoke-virtual {v10}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 145
    .line 146
    .line 147
    move-result-object v10

    .line 148
    invoke-virtual {v10}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v10

    .line 152
    const v11, 0x7f0800ca

    .line 153
    .line 154
    .line 155
    invoke-direct {v5, v11, v9, v10}, Lk81;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    invoke-virtual {p1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 159
    .line 160
    .line 161
    iget-object v5, v0, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->G:Landroid/net/wifi/WifiManager;

    .line 162
    .line 163
    if-eqz v5, :cond_4

    .line 164
    .line 165
    invoke-virtual {v5}, Landroid/net/wifi/WifiManager;->getDhcpInfo()Landroid/net/DhcpInfo;

    .line 166
    .line 167
    .line 168
    move-result-object v2

    .line 169
    iget v3, v2, Landroid/net/DhcpInfo;->dns1:I

    .line 170
    .line 171
    invoke-static {v3}, Lum;->l(I)Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v3

    .line 175
    iget v2, v2, Landroid/net/DhcpInfo;->dns2:I

    .line 176
    .line 177
    invoke-static {v2}, Lum;->l(I)Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object v2

    .line 181
    new-instance v5, Lk81;

    .line 182
    .line 183
    const v9, 0x7f120128

    .line 184
    .line 185
    .line 186
    invoke-virtual {v0, v9}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object v9

    .line 190
    invoke-static {v9, v7}, Li30;->l(Ljava/lang/Object;Ljava/lang/String;)V

    .line 191
    .line 192
    .line 193
    new-instance v10, Ljava/lang/StringBuilder;

    .line 194
    .line 195
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 196
    .line 197
    .line 198
    invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 199
    .line 200
    .line 201
    const-string v3, "\n"

    .line 202
    .line 203
    invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 204
    .line 205
    .line 206
    invoke-virtual {v10, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 207
    .line 208
    .line 209
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 210
    .line 211
    .line 212
    move-result-object v2

    .line 213
    const v10, 0x7f0800cb

    .line 214
    .line 215
    .line 216
    invoke-direct {v5, v10, v9, v2}, Lk81;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 217
    .line 218
    .line 219
    invoke-virtual {p1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 220
    .line 221
    .line 222
    new-instance v2, Lk81;

    .line 223
    .line 224
    iget-object v5, v4, Lxi;->k:Landroid/widget/TextView;

    .line 225
    .line 226
    invoke-virtual {v5}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 227
    .line 228
    .line 229
    move-result-object v5

    .line 230
    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 231
    .line 232
    .line 233
    move-result-object v5

    .line 234
    iget-object v4, v4, Lxi;->l:Landroid/widget/TextView;

    .line 235
    .line 236
    invoke-virtual {v4}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 237
    .line 238
    .line 239
    move-result-object v4

    .line 240
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 241
    .line 242
    .line 243
    move-result-object v4

    .line 244
    const v9, 0x7f0800cf

    .line 245
    .line 246
    .line 247
    invoke-direct {v2, v9, v5, v4}, Lk81;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 248
    .line 249
    .line 250
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 251
    .line 252
    .line 253
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 254
    .line 255
    const/16 v4, 0x1e

    .line 256
    .line 257
    const-string v5, "getApplicationContext(...)"

    .line 258
    .line 259
    if-lt v2, v4, :cond_0

    .line 260
    .line 261
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 262
    .line 263
    .line 264
    move-result-object v2

    .line 265
    invoke-static {v2, v5}, Li30;->l(Ljava/lang/Object;Ljava/lang/String;)V

    .line 266
    .line 267
    .line 268
    invoke-static {v2, v1}, Lum;->o(Landroid/content/Context;Landroid/net/wifi/WifiInfo;)Lf31;

    .line 269
    .line 270
    .line 271
    move-result-object v2

    .line 272
    new-instance v4, Lk81;

    .line 273
    .line 274
    const v9, 0x7f120154

    .line 275
    .line 276
    .line 277
    invoke-virtual {v0, v9}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 278
    .line 279
    .line 280
    move-result-object v9

    .line 281
    invoke-static {v9, v7}, Li30;->l(Ljava/lang/Object;Ljava/lang/String;)V

    .line 282
    .line 283
    .line 284
    iget-object v10, v2, Lf31;->g:Ljava/lang/Object;

    .line 285
    .line 286
    iget-object v2, v2, Lf31;->f:Ljava/lang/Object;

    .line 287
    .line 288
    new-instance v11, Ljava/lang/StringBuilder;

    .line 289
    .line 290
    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    .line 291
    .line 292
    .line 293
    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 294
    .line 295
    .line 296
    invoke-virtual {v11, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 297
    .line 298
    .line 299
    invoke-virtual {v11, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 300
    .line 301
    .line 302
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 303
    .line 304
    .line 305
    move-result-object v2

    .line 306
    const v3, 0x7f0800d0

    .line 307
    .line 308
    .line 309
    invoke-direct {v4, v3, v9, v2}, Lk81;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 310
    .line 311
    .line 312
    invoke-virtual {p1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 313
    .line 314
    .line 315
    :cond_0
    new-instance v2, Lk81;

    .line 316
    .line 317
    const v3, 0x7f120136

    .line 318
    .line 319
    .line 320
    invoke-virtual {v0, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 321
    .line 322
    .line 323
    move-result-object v3

    .line 324
    invoke-static {v3, v7}, Li30;->l(Ljava/lang/Object;Ljava/lang/String;)V

    .line 325
    .line 326
    .line 327
    invoke-virtual {v1}, Landroid/net/wifi/WifiInfo;->getLinkSpeed()I

    .line 328
    .line 329
    .line 330
    move-result v4

    .line 331
    new-instance v9, Ljava/lang/StringBuilder;

    .line 332
    .line 333
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 334
    .line 335
    .line 336
    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 337
    .line 338
    .line 339
    const-string v4, " Mbps"

    .line 340
    .line 341
    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 342
    .line 343
    .line 344
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 345
    .line 346
    .line 347
    move-result-object v4

    .line 348
    const v9, 0x7f0800cd

    .line 349
    .line 350
    .line 351
    invoke-direct {v2, v9, v3, v4}, Lk81;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 352
    .line 353
    .line 354
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 355
    .line 356
    .line 357
    new-instance v2, Lk81;

    .line 358
    .line 359
    const v3, 0x7f120149

    .line 360
    .line 361
    .line 362
    invoke-virtual {v0, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 363
    .line 364
    .line 365
    move-result-object v3

    .line 366
    invoke-static {v3, v7}, Li30;->l(Ljava/lang/Object;Ljava/lang/String;)V

    .line 367
    .line 368
    .line 369
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 370
    .line 371
    .line 372
    move-result-object v4

    .line 373
    invoke-static {v4, v5}, Li30;->l(Ljava/lang/Object;Ljava/lang/String;)V

    .line 374
    .line 375
    .line 376
    invoke-virtual {v1}, Landroid/net/wifi/WifiInfo;->getRssi()I

    .line 377
    .line 378
    .line 379
    move-result v1

    .line 380
    const/16 v5, -0x37

    .line 381
    .line 382
    if-gt v5, v1, :cond_1

    .line 383
    .line 384
    const/16 v5, 0x24

    .line 385
    .line 386
    if-ge v1, v5, :cond_1

    .line 387
    .line 388
    const v1, 0x7f12010d

    .line 389
    .line 390
    .line 391
    invoke-virtual {v4, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 392
    .line 393
    .line 394
    move-result-object v1

    .line 395
    invoke-static {v1}, Li30;->j(Ljava/lang/Object;)V

    .line 396
    .line 397
    .line 398
    goto :goto_0

    .line 399
    :cond_1
    const/16 v5, -0x4b

    .line 400
    .line 401
    if-gt v5, v1, :cond_2

    .line 402
    .line 403
    const/16 v5, -0x36

    .line 404
    .line 405
    if-ge v1, v5, :cond_2

    .line 406
    .line 407
    const v1, 0x7f12010e

    .line 408
    .line 409
    .line 410
    invoke-virtual {v4, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 411
    .line 412
    .line 413
    move-result-object v1

    .line 414
    invoke-static {v1}, Li30;->j(Ljava/lang/Object;)V

    .line 415
    .line 416
    .line 417
    goto :goto_0

    .line 418
    :cond_2
    const/16 v5, -0x55

    .line 419
    .line 420
    if-gt v5, v1, :cond_3

    .line 421
    .line 422
    const/16 v5, -0x4a

    .line 423
    .line 424
    if-ge v1, v5, :cond_3

    .line 425
    .line 426
    const v1, 0x7f120033

    .line 427
    .line 428
    .line 429
    invoke-virtual {v4, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 430
    .line 431
    .line 432
    move-result-object v1

    .line 433
    invoke-static {v1}, Li30;->j(Ljava/lang/Object;)V

    .line 434
    .line 435
    .line 436
    goto :goto_0

    .line 437
    :cond_3
    const v1, 0x7f12010f

    .line 438
    .line 439
    .line 440
    invoke-virtual {v4, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 441
    .line 442
    .line 443
    move-result-object v1

    .line 444
    invoke-static {v1, v7}, Li30;->l(Ljava/lang/Object;Ljava/lang/String;)V

    .line 445
    .line 446
    .line 447
    :goto_0
    const v4, 0x7f0800d2

    .line 448
    .line 449
    .line 450
    invoke-direct {v2, v4, v3, v1}, Lk81;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 451
    .line 452
    .line 453
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 454
    .line 455
    .line 456
    goto :goto_1

    .line 457
    :cond_4
    invoke-static {v3}, Li30;->S(Ljava/lang/String;)V

    .line 458
    .line 459
    .line 460
    throw v2

    .line 461
    :cond_5
    new-instance v1, Lk81;

    .line 462
    .line 463
    invoke-virtual {v0, v10}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 464
    .line 465
    .line 466
    move-result-object v2

    .line 467
    invoke-static {v2, v7}, Li30;->l(Ljava/lang/Object;Ljava/lang/String;)V

    .line 468
    .line 469
    .line 470
    invoke-virtual {v5}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 471
    .line 472
    .line 473
    move-result-object v3

    .line 474
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 475
    .line 476
    .line 477
    move-result-object v3

    .line 478
    invoke-direct {v1, v11, v2, v3}, Lk81;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 479
    .line 480
    .line 481
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 482
    .line 483
    .line 484
    const v1, 0x7f120125

    .line 485
    .line 486
    .line 487
    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 488
    .line 489
    .line 490
    move-result-object v6

    .line 491
    invoke-static {v6, v7}, Li30;->l(Ljava/lang/Object;Ljava/lang/String;)V

    .line 492
    .line 493
    .line 494
    const v1, 0x7f12011f

    .line 495
    .line 496
    .line 497
    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 498
    .line 499
    .line 500
    move-result-object v8

    .line 501
    invoke-static {v8, v7}, Li30;->l(Ljava/lang/Object;Ljava/lang/String;)V

    .line 502
    .line 503
    .line 504
    :goto_1
    new-instance v1, Lk81;

    .line 505
    .line 506
    const v2, 0x7f120150

    .line 507
    .line 508
    .line 509
    invoke-virtual {v0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 510
    .line 511
    .line 512
    move-result-object v2

    .line 513
    invoke-static {v2, v7}, Li30;->l(Ljava/lang/Object;Ljava/lang/String;)V

    .line 514
    .line 515
    .line 516
    const v3, 0x7f0800cc

    .line 517
    .line 518
    .line 519
    invoke-direct {v1, v3, v2, v6}, Lk81;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 520
    .line 521
    .line 522
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 523
    .line 524
    .line 525
    new-instance v1, Lj81;

    .line 526
    .line 527
    invoke-direct {v1}, Lj81;-><init>()V

    .line 528
    .line 529
    .line 530
    const-string v1, "dialogTitle"

    .line 531
    .line 532
    invoke-static {v8, v1}, Li30;->m(Ljava/lang/Object;Ljava/lang/String;)V

    .line 533
    .line 534
    .line 535
    new-instance v1, Lj81;

    .line 536
    .line 537
    invoke-direct {v1}, Lj81;-><init>()V

    .line 538
    .line 539
    .line 540
    iget-object v2, v1, Lj81;->q0:Ljava/util/ArrayList;

    .line 541
    .line 542
    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 543
    .line 544
    .line 545
    iput-object v8, v1, Lj81;->r0:Ljava/lang/String;

    .line 546
    .line 547
    invoke-virtual {v0}, Li5;->o()Lxw;

    .line 548
    .line 549
    .line 550
    move-result-object p1

    .line 551
    const-string v0, "wifi_dialog"

    .line 552
    .line 553
    invoke-virtual {v1, p1, v0}, Lxo;->Q(Lxw;Ljava/lang/String;)V

    .line 554
    .line 555
    .line 556
    return-void

    .line 557
    :cond_6
    const-string p1, "binding"

    .line 558
    .line 559
    invoke-static {p1}, Li30;->S(Ljava/lang/String;)V

    .line 560
    .line 561
    .line 562
    throw v2

    .line 563
    :cond_7
    invoke-static {v3}, Li30;->S(Ljava/lang/String;)V

    .line 564
    .line 565
    .line 566
    throw v2

    .line 567
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
