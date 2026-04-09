.class public final synthetic Lo00;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# instance fields
.field public final synthetic f:I

.field public final synthetic g:Li5;


# direct methods
.method public synthetic constructor <init>(Li5;I)V
    .locals 0

    .line 1
    iput p2, p0, Lo00;->f:I

    .line 2
    .line 3
    iput-object p1, p0, Lo00;->g:Li5;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onGlobalLayout()V
    .locals 8

    .line 1
    iget v0, p0, Lo00;->f:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lo00;->g:Li5;

    .line 7
    .line 8
    check-cast v0, Lcom/phuongpn/whousemywifi/networkscanner/PortActivity;

    .line 9
    .line 10
    iget-boolean v1, v0, Lcom/phuongpn/whousemywifi/networkscanner/PortActivity;->J:Z

    .line 11
    .line 12
    if-nez v1, :cond_5

    .line 13
    .line 14
    const/4 v1, 0x1

    .line 15
    iput-boolean v1, v0, Lcom/phuongpn/whousemywifi/networkscanner/PortActivity;->J:Z

    .line 16
    .line 17
    iget-object v1, v0, Lcom/phuongpn/whousemywifi/networkscanner/PortActivity;->I:Le3;

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    const-string v3, "adView"

    .line 21
    .line 22
    if-eqz v1, :cond_4

    .line 23
    .line 24
    const v4, 0x7f120026

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    invoke-virtual {v1, v4}, Lr9;->setAdUnitId(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    iget-object v1, v0, Lcom/phuongpn/whousemywifi/networkscanner/PortActivity;->I:Le3;

    .line 35
    .line 36
    if-eqz v1, :cond_3

    .line 37
    .line 38
    invoke-virtual {v0}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;

    .line 39
    .line 40
    .line 41
    move-result-object v4

    .line 42
    invoke-interface {v4}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    new-instance v5, Landroid/util/DisplayMetrics;

    .line 47
    .line 48
    invoke-direct {v5}, Landroid/util/DisplayMetrics;-><init>()V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v4, v5}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V

    .line 52
    .line 53
    .line 54
    iget v4, v5, Landroid/util/DisplayMetrics;->density:F

    .line 55
    .line 56
    invoke-virtual {v0}, Lcom/phuongpn/whousemywifi/networkscanner/PortActivity;->y()Lh2;

    .line 57
    .line 58
    .line 59
    move-result-object v6

    .line 60
    iget-object v6, v6, Lh2;->c:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v6, Landroid/widget/FrameLayout;

    .line 63
    .line 64
    invoke-virtual {v6}, Landroid/view/View;->getWidth()I

    .line 65
    .line 66
    .line 67
    move-result v6

    .line 68
    int-to-float v6, v6

    .line 69
    const/4 v7, 0x0

    .line 70
    cmpg-float v7, v6, v7

    .line 71
    .line 72
    if-nez v7, :cond_0

    .line 73
    .line 74
    iget v5, v5, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 75
    .line 76
    int-to-float v6, v5

    .line 77
    :cond_0
    div-float/2addr v6, v4

    .line 78
    float-to-int v4, v6

    .line 79
    invoke-static {v0, v4}, Ld3;->a(Landroid/content/Context;I)Ld3;

    .line 80
    .line 81
    .line 82
    move-result-object v4

    .line 83
    invoke-virtual {v1, v4}, Lr9;->setAdSize(Ld3;)V

    .line 84
    .line 85
    .line 86
    new-instance v1, La3;

    .line 87
    .line 88
    const/4 v4, 0x1

    .line 89
    invoke-direct {v1, v4}, Lf74;-><init>(I)V

    .line 90
    .line 91
    .line 92
    new-instance v4, Lb3;

    .line 93
    .line 94
    invoke-direct {v4, v1}, Lb3;-><init>(Lf74;)V

    .line 95
    .line 96
    .line 97
    iget-object v1, v0, Lcom/phuongpn/whousemywifi/networkscanner/PortActivity;->I:Le3;

    .line 98
    .line 99
    if-eqz v1, :cond_2

    .line 100
    .line 101
    new-instance v5, Lq00;

    .line 102
    .line 103
    const/4 v6, 0x3

    .line 104
    invoke-direct {v5, v0, v6}, Lq00;-><init>(Li5;I)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v1, v5}, Lr9;->setAdListener(Lt2;)V

    .line 108
    .line 109
    .line 110
    iget-object v0, v0, Lcom/phuongpn/whousemywifi/networkscanner/PortActivity;->I:Le3;

    .line 111
    .line 112
    if-eqz v0, :cond_1

    .line 113
    .line 114
    invoke-virtual {v0, v4}, Lr9;->b(Lb3;)V

    .line 115
    .line 116
    .line 117
    goto :goto_0

    .line 118
    :cond_1
    invoke-static {v3}, Li30;->S(Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    throw v2

    .line 122
    :cond_2
    invoke-static {v3}, Li30;->S(Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    throw v2

    .line 126
    :cond_3
    invoke-static {v3}, Li30;->S(Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    throw v2

    .line 130
    :cond_4
    invoke-static {v3}, Li30;->S(Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    throw v2

    .line 134
    :cond_5
    :goto_0
    return-void

    .line 135
    :pswitch_0
    iget-object v0, p0, Lo00;->g:Li5;

    .line 136
    .line 137
    check-cast v0, Lcom/phuongpn/whousemywifi/networkscanner/PingActivity;

    .line 138
    .line 139
    iget-boolean v1, v0, Lcom/phuongpn/whousemywifi/networkscanner/PingActivity;->F:Z

    .line 140
    .line 141
    if-nez v1, :cond_c

    .line 142
    .line 143
    const/4 v1, 0x1

    .line 144
    iput-boolean v1, v0, Lcom/phuongpn/whousemywifi/networkscanner/PingActivity;->F:Z

    .line 145
    .line 146
    iget-object v1, v0, Lcom/phuongpn/whousemywifi/networkscanner/PingActivity;->E:Le3;

    .line 147
    .line 148
    const/4 v2, 0x0

    .line 149
    const-string v3, "adView"

    .line 150
    .line 151
    if-eqz v1, :cond_b

    .line 152
    .line 153
    const v4, 0x7f120026

    .line 154
    .line 155
    .line 156
    invoke-virtual {v0, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object v4

    .line 160
    invoke-virtual {v1, v4}, Lr9;->setAdUnitId(Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    iget-object v1, v0, Lcom/phuongpn/whousemywifi/networkscanner/PingActivity;->E:Le3;

    .line 164
    .line 165
    if-eqz v1, :cond_a

    .line 166
    .line 167
    invoke-virtual {v0}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;

    .line 168
    .line 169
    .line 170
    move-result-object v4

    .line 171
    invoke-interface {v4}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    .line 172
    .line 173
    .line 174
    move-result-object v4

    .line 175
    new-instance v5, Landroid/util/DisplayMetrics;

    .line 176
    .line 177
    invoke-direct {v5}, Landroid/util/DisplayMetrics;-><init>()V

    .line 178
    .line 179
    .line 180
    invoke-virtual {v4, v5}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V

    .line 181
    .line 182
    .line 183
    iget v4, v5, Landroid/util/DisplayMetrics;->density:F

    .line 184
    .line 185
    iget-object v6, v0, Lcom/phuongpn/whousemywifi/networkscanner/PingActivity;->D:Lg2;

    .line 186
    .line 187
    if-eqz v6, :cond_9

    .line 188
    .line 189
    iget-object v6, v6, Lg2;->b:Landroid/widget/FrameLayout;

    .line 190
    .line 191
    invoke-virtual {v6}, Landroid/view/View;->getWidth()I

    .line 192
    .line 193
    .line 194
    move-result v6

    .line 195
    int-to-float v6, v6

    .line 196
    const/4 v7, 0x0

    .line 197
    cmpg-float v7, v6, v7

    .line 198
    .line 199
    if-nez v7, :cond_6

    .line 200
    .line 201
    iget v5, v5, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 202
    .line 203
    int-to-float v6, v5

    .line 204
    :cond_6
    div-float/2addr v6, v4

    .line 205
    float-to-int v4, v6

    .line 206
    invoke-static {v0, v4}, Ld3;->a(Landroid/content/Context;I)Ld3;

    .line 207
    .line 208
    .line 209
    move-result-object v4

    .line 210
    invoke-virtual {v1, v4}, Lr9;->setAdSize(Ld3;)V

    .line 211
    .line 212
    .line 213
    new-instance v1, La3;

    .line 214
    .line 215
    const/4 v4, 0x1

    .line 216
    invoke-direct {v1, v4}, Lf74;-><init>(I)V

    .line 217
    .line 218
    .line 219
    new-instance v4, Lb3;

    .line 220
    .line 221
    invoke-direct {v4, v1}, Lb3;-><init>(Lf74;)V

    .line 222
    .line 223
    .line 224
    iget-object v1, v0, Lcom/phuongpn/whousemywifi/networkscanner/PingActivity;->E:Le3;

    .line 225
    .line 226
    if-eqz v1, :cond_8

    .line 227
    .line 228
    new-instance v5, Lq00;

    .line 229
    .line 230
    const/4 v6, 0x2

    .line 231
    invoke-direct {v5, v0, v6}, Lq00;-><init>(Li5;I)V

    .line 232
    .line 233
    .line 234
    invoke-virtual {v1, v5}, Lr9;->setAdListener(Lt2;)V

    .line 235
    .line 236
    .line 237
    iget-object v0, v0, Lcom/phuongpn/whousemywifi/networkscanner/PingActivity;->E:Le3;

    .line 238
    .line 239
    if-eqz v0, :cond_7

    .line 240
    .line 241
    invoke-virtual {v0, v4}, Lr9;->b(Lb3;)V

    .line 242
    .line 243
    .line 244
    goto :goto_1

    .line 245
    :cond_7
    invoke-static {v3}, Li30;->S(Ljava/lang/String;)V

    .line 246
    .line 247
    .line 248
    throw v2

    .line 249
    :cond_8
    invoke-static {v3}, Li30;->S(Ljava/lang/String;)V

    .line 250
    .line 251
    .line 252
    throw v2

    .line 253
    :cond_9
    const-string v0, "binding"

    .line 254
    .line 255
    invoke-static {v0}, Li30;->S(Ljava/lang/String;)V

    .line 256
    .line 257
    .line 258
    throw v2

    .line 259
    :cond_a
    invoke-static {v3}, Li30;->S(Ljava/lang/String;)V

    .line 260
    .line 261
    .line 262
    throw v2

    .line 263
    :cond_b
    invoke-static {v3}, Li30;->S(Ljava/lang/String;)V

    .line 264
    .line 265
    .line 266
    throw v2

    .line 267
    :cond_c
    :goto_1
    return-void

    .line 268
    :pswitch_1
    iget-object v0, p0, Lo00;->g:Li5;

    .line 269
    .line 270
    check-cast v0, Lcom/phuongpn/whousemywifi/networkscanner/HelpActivity;

    .line 271
    .line 272
    iget-boolean v1, v0, Lcom/phuongpn/whousemywifi/networkscanner/HelpActivity;->E:Z

    .line 273
    .line 274
    if-nez v1, :cond_13

    .line 275
    .line 276
    const/4 v1, 0x1

    .line 277
    iput-boolean v1, v0, Lcom/phuongpn/whousemywifi/networkscanner/HelpActivity;->E:Z

    .line 278
    .line 279
    iget-object v1, v0, Lcom/phuongpn/whousemywifi/networkscanner/HelpActivity;->D:Le3;

    .line 280
    .line 281
    const/4 v2, 0x0

    .line 282
    const-string v3, "adView"

    .line 283
    .line 284
    if-eqz v1, :cond_12

    .line 285
    .line 286
    const v4, 0x7f120026

    .line 287
    .line 288
    .line 289
    invoke-virtual {v0, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 290
    .line 291
    .line 292
    move-result-object v4

    .line 293
    invoke-virtual {v1, v4}, Lr9;->setAdUnitId(Ljava/lang/String;)V

    .line 294
    .line 295
    .line 296
    iget-object v1, v0, Lcom/phuongpn/whousemywifi/networkscanner/HelpActivity;->D:Le3;

    .line 297
    .line 298
    if-eqz v1, :cond_11

    .line 299
    .line 300
    invoke-virtual {v0}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;

    .line 301
    .line 302
    .line 303
    move-result-object v4

    .line 304
    invoke-interface {v4}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    .line 305
    .line 306
    .line 307
    move-result-object v4

    .line 308
    new-instance v5, Landroid/util/DisplayMetrics;

    .line 309
    .line 310
    invoke-direct {v5}, Landroid/util/DisplayMetrics;-><init>()V

    .line 311
    .line 312
    .line 313
    invoke-virtual {v4, v5}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V

    .line 314
    .line 315
    .line 316
    iget v4, v5, Landroid/util/DisplayMetrics;->density:F

    .line 317
    .line 318
    iget-object v6, v0, Lcom/phuongpn/whousemywifi/networkscanner/HelpActivity;->C:Lp21;

    .line 319
    .line 320
    if-eqz v6, :cond_10

    .line 321
    .line 322
    iget-object v6, v6, Lp21;->g:Ljava/lang/Object;

    .line 323
    .line 324
    check-cast v6, Landroid/widget/FrameLayout;

    .line 325
    .line 326
    invoke-virtual {v6}, Landroid/view/View;->getWidth()I

    .line 327
    .line 328
    .line 329
    move-result v6

    .line 330
    int-to-float v6, v6

    .line 331
    const/4 v7, 0x0

    .line 332
    cmpg-float v7, v6, v7

    .line 333
    .line 334
    if-nez v7, :cond_d

    .line 335
    .line 336
    iget v5, v5, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 337
    .line 338
    int-to-float v6, v5

    .line 339
    :cond_d
    div-float/2addr v6, v4

    .line 340
    float-to-int v4, v6

    .line 341
    invoke-static {v0, v4}, Ld3;->a(Landroid/content/Context;I)Ld3;

    .line 342
    .line 343
    .line 344
    move-result-object v4

    .line 345
    invoke-virtual {v1, v4}, Lr9;->setAdSize(Ld3;)V

    .line 346
    .line 347
    .line 348
    new-instance v1, La3;

    .line 349
    .line 350
    const/4 v4, 0x1

    .line 351
    invoke-direct {v1, v4}, Lf74;-><init>(I)V

    .line 352
    .line 353
    .line 354
    new-instance v4, Lb3;

    .line 355
    .line 356
    invoke-direct {v4, v1}, Lb3;-><init>(Lf74;)V

    .line 357
    .line 358
    .line 359
    iget-object v1, v0, Lcom/phuongpn/whousemywifi/networkscanner/HelpActivity;->D:Le3;

    .line 360
    .line 361
    if-eqz v1, :cond_f

    .line 362
    .line 363
    new-instance v5, Lq00;

    .line 364
    .line 365
    const/4 v6, 0x0

    .line 366
    invoke-direct {v5, v0, v6}, Lq00;-><init>(Li5;I)V

    .line 367
    .line 368
    .line 369
    invoke-virtual {v1, v5}, Lr9;->setAdListener(Lt2;)V

    .line 370
    .line 371
    .line 372
    iget-object v0, v0, Lcom/phuongpn/whousemywifi/networkscanner/HelpActivity;->D:Le3;

    .line 373
    .line 374
    if-eqz v0, :cond_e

    .line 375
    .line 376
    invoke-virtual {v0, v4}, Lr9;->b(Lb3;)V

    .line 377
    .line 378
    .line 379
    goto :goto_2

    .line 380
    :cond_e
    invoke-static {v3}, Li30;->S(Ljava/lang/String;)V

    .line 381
    .line 382
    .line 383
    throw v2

    .line 384
    :cond_f
    invoke-static {v3}, Li30;->S(Ljava/lang/String;)V

    .line 385
    .line 386
    .line 387
    throw v2

    .line 388
    :cond_10
    const-string v0, "binding"

    .line 389
    .line 390
    invoke-static {v0}, Li30;->S(Ljava/lang/String;)V

    .line 391
    .line 392
    .line 393
    throw v2

    .line 394
    :cond_11
    invoke-static {v3}, Li30;->S(Ljava/lang/String;)V

    .line 395
    .line 396
    .line 397
    throw v2

    .line 398
    :cond_12
    invoke-static {v3}, Li30;->S(Ljava/lang/String;)V

    .line 399
    .line 400
    .line 401
    throw v2

    .line 402
    :cond_13
    :goto_2
    return-void

    .line 403
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
