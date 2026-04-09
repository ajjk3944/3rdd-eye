.class public final Lgi;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic f:I

.field public g:Ljava/lang/Object;

.field public h:Ljava/lang/Object;

.field public i:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lgi;->f:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Lb3;Lwm0;)V
    .locals 1

    const/16 v0, 0x9

    iput v0, p0, Lgi;->f:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lgi;->h:Ljava/lang/Object;

    iput-object p2, p0, Lgi;->g:Ljava/lang/Object;

    iput-object p3, p0, Lgi;->i:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/view/View;La91;Lvq2;Landroid/animation/ValueAnimator;)V
    .locals 0

    const/4 p2, 0x6

    iput p2, p0, Lgi;->f:I

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lgi;->g:Ljava/lang/Object;

    iput-object p3, p0, Lgi;->h:Ljava/lang/Object;

    iput-object p4, p0, Lgi;->i:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 3
    iput p4, p0, Lgi;->f:I

    iput-object p1, p0, Lgi;->g:Ljava/lang/Object;

    iput-object p2, p0, Lgi;->h:Ljava/lang/Object;

    iput-object p3, p0, Lgi;->i:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IZ)V
    .locals 0

    .line 4
    iput p4, p0, Lgi;->f:I

    iput-object p1, p0, Lgi;->i:Ljava/lang/Object;

    iput-object p2, p0, Lgi;->g:Ljava/lang/Object;

    iput-object p3, p0, Lgi;->h:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lmj3;Ljava/util/HashMap;Landroid/content/Context;)V
    .locals 1

    const/16 v0, 0x16

    iput v0, p0, Lgi;->f:I

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lgi;->g:Ljava/lang/Object;

    iput-object p2, p0, Lgi;->i:Ljava/lang/Object;

    iput-object p3, p0, Lgi;->h:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lyv1;Luv1;Landroid/webkit/WebView;Z)V
    .locals 1

    const/16 v0, 0xc

    iput v0, p0, Lgi;->f:I

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p3, p0, Lgi;->h:Ljava/lang/Object;

    iput-object p1, p0, Lgi;->i:Ljava/lang/Object;

    new-instance p1, Lxv1;

    invoke-direct {p1, p0, p2, p3, p4}, Lxv1;-><init>(Lgi;Luv1;Landroid/webkit/WebView;Z)V

    iput-object p1, p0, Lgi;->g:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 11

    .line 1
    iget v0, p0, Lgi;->f:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x2

    .line 5
    const/4 v3, 0x1

    .line 6
    const/4 v4, 0x0

    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lgi;->g:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Lgi1;

    .line 13
    .line 14
    iget-object v1, p0, Lgi;->h:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v1, Luh;

    .line 17
    .line 18
    iget-object v3, p0, Lgi;->i:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v3, Lpi1;

    .line 21
    .line 22
    new-instance v4, Lbh3;

    .line 23
    .line 24
    const/16 v5, 0xf

    .line 25
    .line 26
    invoke-direct {v4, v5, v1}, Lbh3;-><init>(ILjava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    iget-object v1, v0, Lgi1;->g:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v1, Landroid/os/Handler;

    .line 32
    .line 33
    invoke-virtual {v1, v4}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 34
    .line 35
    .line 36
    iget v1, v3, Lpi1;->g:I

    .line 37
    .line 38
    if-eq v1, v2, :cond_0

    .line 39
    .line 40
    iget-object v0, v0, Lgi1;->j:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v0, Lz42;

    .line 43
    .line 44
    invoke-virtual {v0}, Lz42;->a()V

    .line 45
    .line 46
    .line 47
    :cond_0
    return-void

    .line 48
    :pswitch_0
    iget-object v0, p0, Lgi;->g:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v0, Lwt2;

    .line 51
    .line 52
    iget-object v1, p0, Lgi;->h:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v1, Lph4;

    .line 55
    .line 56
    iget-object v2, p0, Lgi;->i:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v2, Lw34;

    .line 59
    .line 60
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    sget-object v3, Lv23;->a:Ljava/lang/String;

    .line 64
    .line 65
    iget-object v0, v0, Lwt2;->h:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v0, Loa4;

    .line 68
    .line 69
    iget-object v0, v0, Loa4;->f:Lya4;

    .line 70
    .line 71
    iget-object v0, v0, Lya4;->y:Lmd4;

    .line 72
    .line 73
    invoke-virtual {v0}, Lmd4;->y()Lad4;

    .line 74
    .line 75
    .line 76
    move-result-object v3

    .line 77
    new-instance v4, Lld4;

    .line 78
    .line 79
    invoke-direct {v4, v3, v1, v2}, Lld4;-><init>(Lad4;Lph4;Lw34;)V

    .line 80
    .line 81
    .line 82
    const/16 v1, 0x3f1

    .line 83
    .line 84
    invoke-virtual {v0, v3, v1, v4}, Lmd4;->s(Lad4;ILks2;)V

    .line 85
    .line 86
    .line 87
    return-void

    .line 88
    :pswitch_1
    iget-object v0, p0, Lgi;->g:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v0, Ljd4;

    .line 91
    .line 92
    iget-object v1, p0, Lgi;->h:Ljava/lang/Object;

    .line 93
    .line 94
    iget-object v2, p0, Lgi;->i:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v2, Landroid/util/Pair;

    .line 97
    .line 98
    instance-of v5, v1, Landroid/webkit/WebView;

    .line 99
    .line 100
    if-nez v5, :cond_1

    .line 101
    .line 102
    goto :goto_0

    .line 103
    :cond_1
    iget-object v5, v0, Ljd4;->c:Landroid/content/Context;

    .line 104
    .line 105
    sget-object v5, Lhg4;->C:Lhg4;

    .line 106
    .line 107
    iget-object v5, v5, Lhg4;->f:Lnh4;

    .line 108
    .line 109
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    invoke-static {}, Lbd2;->D()Landroid/webkit/CookieManager;

    .line 113
    .line 114
    .line 115
    move-result-object v5

    .line 116
    if-nez v5, :cond_2

    .line 117
    .line 118
    goto :goto_0

    .line 119
    :cond_2
    check-cast v1, Landroid/webkit/WebView;

    .line 120
    .line 121
    invoke-virtual {v5, v1}, Landroid/webkit/CookieManager;->acceptThirdPartyCookies(Landroid/webkit/WebView;)Z

    .line 122
    .line 123
    .line 124
    move-result v4

    .line 125
    :goto_0
    iget-object v1, v0, Ljd4;->a:Ljava/util/HashMap;

    .line 126
    .line 127
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 128
    .line 129
    .line 130
    move-result-object v4

    .line 131
    invoke-virtual {v1, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v1

    .line 135
    check-cast v1, Lge4;

    .line 136
    .line 137
    if-eqz v1, :cond_4

    .line 138
    .line 139
    sget-object v5, Lhg4;->C:Lhg4;

    .line 140
    .line 141
    iget-object v5, v5, Lhg4;->k:Lym;

    .line 142
    .line 143
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 144
    .line 145
    .line 146
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 147
    .line 148
    .line 149
    move-result-wide v5

    .line 150
    iget-wide v7, v1, Lge4;->c:J

    .line 151
    .line 152
    cmp-long v5, v7, v5

    .line 153
    .line 154
    if-gtz v5, :cond_3

    .line 155
    .line 156
    goto :goto_1

    .line 157
    :cond_3
    invoke-virtual {v0, v1, v2, v3}, Ljd4;->e(Lge4;Landroid/util/Pair;Z)V

    .line 158
    .line 159
    .line 160
    goto :goto_2

    .line 161
    :cond_4
    :goto_1
    iget-object v0, v0, Ljd4;->b:Ljava/util/HashMap;

    .line 162
    .line 163
    invoke-virtual {v0, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v1

    .line 167
    check-cast v1, Ljava/util/List;

    .line 168
    .line 169
    if-nez v1, :cond_5

    .line 170
    .line 171
    new-instance v1, Ljava/util/ArrayList;

    .line 172
    .line 173
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 174
    .line 175
    .line 176
    invoke-virtual {v0, v4, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    :cond_5
    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 180
    .line 181
    .line 182
    :goto_2
    return-void

    .line 183
    :pswitch_2
    iget-object v0, p0, Lgi;->h:Ljava/lang/Object;

    .line 184
    .line 185
    check-cast v0, Landroid/util/Pair;

    .line 186
    .line 187
    iget-object v1, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 188
    .line 189
    check-cast v1, Ljava/lang/Integer;

    .line 190
    .line 191
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 192
    .line 193
    .line 194
    move-result v1

    .line 195
    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 196
    .line 197
    check-cast v0, Lkh4;

    .line 198
    .line 199
    iget-object v2, p0, Lgi;->g:Ljava/lang/Object;

    .line 200
    .line 201
    check-cast v2, Lvb4;

    .line 202
    .line 203
    iget-object v2, v2, Lvb4;->g:Luu0;

    .line 204
    .line 205
    iget-object v2, v2, Luu0;->n:Ljava/lang/Object;

    .line 206
    .line 207
    check-cast v2, Lmd4;

    .line 208
    .line 209
    iget-object v3, p0, Lgi;->i:Ljava/lang/Object;

    .line 210
    .line 211
    check-cast v3, Lhh4;

    .line 212
    .line 213
    invoke-virtual {v2, v1, v0, v3}, Lmd4;->p(ILkh4;Lhh4;)V

    .line 214
    .line 215
    .line 216
    return-void

    .line 217
    :pswitch_3
    iget-object v0, p0, Lgi;->g:Ljava/lang/Object;

    .line 218
    .line 219
    check-cast v0, Lrb4;

    .line 220
    .line 221
    iget-object v1, p0, Lgi;->h:Ljava/lang/Object;

    .line 222
    .line 223
    check-cast v1, Lum3;

    .line 224
    .line 225
    iget-object v2, p0, Lgi;->i:Ljava/lang/Object;

    .line 226
    .line 227
    check-cast v2, Lkh4;

    .line 228
    .line 229
    iget-object v0, v0, Lrb4;->c:Lmd4;

    .line 230
    .line 231
    invoke-virtual {v1}, Lum3;->f()Lsn3;

    .line 232
    .line 233
    .line 234
    move-result-object v1

    .line 235
    iget-object v3, v0, Lmd4;->l:Lf74;

    .line 236
    .line 237
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 238
    .line 239
    .line 240
    iget-object v0, v0, Lmd4;->i:Lbu1;

    .line 241
    .line 242
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 243
    .line 244
    .line 245
    invoke-static {v1}, Lxm3;->m(Ljava/util/Collection;)Lxm3;

    .line 246
    .line 247
    .line 248
    move-result-object v5

    .line 249
    iput-object v5, v0, Lbu1;->h:Ljava/lang/Object;

    .line 250
    .line 251
    invoke-virtual {v1}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 252
    .line 253
    .line 254
    move-result v5

    .line 255
    if-nez v5, :cond_6

    .line 256
    .line 257
    invoke-virtual {v1, v4}, Lsn3;->get(I)Ljava/lang/Object;

    .line 258
    .line 259
    .line 260
    move-result-object v1

    .line 261
    check-cast v1, Lkh4;

    .line 262
    .line 263
    iput-object v1, v0, Lbu1;->k:Ljava/lang/Object;

    .line 264
    .line 265
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 266
    .line 267
    .line 268
    iput-object v2, v0, Lbu1;->l:Ljava/lang/Object;

    .line 269
    .line 270
    :cond_6
    iget-object v1, v0, Lbu1;->j:Ljava/lang/Object;

    .line 271
    .line 272
    check-cast v1, Lkh4;

    .line 273
    .line 274
    if-nez v1, :cond_7

    .line 275
    .line 276
    iget-object v1, v0, Lbu1;->h:Ljava/lang/Object;

    .line 277
    .line 278
    check-cast v1, Lxm3;

    .line 279
    .line 280
    iget-object v2, v0, Lbu1;->k:Ljava/lang/Object;

    .line 281
    .line 282
    check-cast v2, Lkh4;

    .line 283
    .line 284
    iget-object v4, v0, Lbu1;->g:Ljava/lang/Object;

    .line 285
    .line 286
    check-cast v4, Lsw1;

    .line 287
    .line 288
    invoke-static {v3, v1, v2, v4}, Lbu1;->D(Lf74;Lxm3;Lkh4;Lsw1;)Lkh4;

    .line 289
    .line 290
    .line 291
    move-result-object v1

    .line 292
    iput-object v1, v0, Lbu1;->j:Ljava/lang/Object;

    .line 293
    .line 294
    :cond_7
    invoke-virtual {v3}, Lf74;->K1()Loz1;

    .line 295
    .line 296
    .line 297
    move-result-object v1

    .line 298
    invoke-virtual {v0, v1}, Lbu1;->B(Loz1;)V

    .line 299
    .line 300
    .line 301
    return-void

    .line 302
    :pswitch_4
    iget-object v0, p0, Lgi;->g:Ljava/lang/Object;

    .line 303
    .line 304
    check-cast v0, Lrk3;

    .line 305
    .line 306
    iget-object v2, p0, Lgi;->h:Ljava/lang/Object;

    .line 307
    .line 308
    check-cast v2, Lnk3;

    .line 309
    .line 310
    iget-object v5, p0, Lgi;->i:Ljava/lang/Object;

    .line 311
    .line 312
    check-cast v5, Lit3;

    .line 313
    .line 314
    iget-object v6, v0, Lrk3;->b:Ljava/lang/String;

    .line 315
    .line 316
    :try_start_0
    iget-object v7, v0, Lrk3;->a:Lx03;

    .line 317
    .line 318
    if-eqz v7, :cond_e

    .line 319
    .line 320
    iget-object v7, v7, Lx03;->o:Ljava/lang/Object;

    .line 321
    .line 322
    check-cast v7, Lkk3;

    .line 323
    .line 324
    if-nez v7, :cond_8

    .line 325
    .line 326
    goto/16 :goto_4

    .line 327
    .line 328
    :cond_8
    new-instance v8, Landroid/os/Bundle;

    .line 329
    .line 330
    invoke-direct {v8}, Landroid/os/Bundle;-><init>()V

    .line 331
    .line 332
    .line 333
    const-string v9, "callerPackage"

    .line 334
    .line 335
    invoke-virtual {v8, v9, v6}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 336
    .line 337
    .line 338
    const-string v9, "windowToken"

    .line 339
    .line 340
    iget-object v10, v2, Lnk3;->a:Landroid/os/IBinder;

    .line 341
    .line 342
    invoke-virtual {v8, v9, v10}, Landroid/os/Bundle;->putBinder(Ljava/lang/String;Landroid/os/IBinder;)V

    .line 343
    .line 344
    .line 345
    iget-object v9, v2, Lnk3;->f:Ljava/lang/String;

    .line 346
    .line 347
    invoke-static {v9}, Lrk3;->b(Ljava/lang/String;)Z

    .line 348
    .line 349
    .line 350
    move-result v10

    .line 351
    if-nez v10, :cond_9

    .line 352
    .line 353
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 354
    .line 355
    .line 356
    invoke-virtual {v9}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 357
    .line 358
    .line 359
    move-result-object v9

    .line 360
    const-string v10, "adFieldEnifd"

    .line 361
    .line 362
    invoke-virtual {v8, v10, v9}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 363
    .line 364
    .line 365
    :cond_9
    const-string v9, "layoutGravity"

    .line 366
    .line 367
    iget v10, v2, Lnk3;->c:I

    .line 368
    .line 369
    invoke-virtual {v8, v9, v10}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 370
    .line 371
    .line 372
    const-string v9, "layoutVerticalMargin"

    .line 373
    .line 374
    iget v10, v2, Lnk3;->d:F

    .line 375
    .line 376
    invoke-virtual {v8, v9, v10}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    .line 377
    .line 378
    .line 379
    const-string v9, "displayMode"

    .line 380
    .line 381
    invoke-virtual {v8, v9, v4}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 382
    .line 383
    .line 384
    const-string v9, "triggerMode"

    .line 385
    .line 386
    invoke-virtual {v8, v9, v4}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 387
    .line 388
    .line 389
    const-string v4, "windowWidthPx"

    .line 390
    .line 391
    iget v9, v2, Lnk3;->e:I

    .line 392
    .line 393
    invoke-virtual {v8, v4, v9}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 394
    .line 395
    .line 396
    invoke-static {v1}, Lrk3;->b(Ljava/lang/String;)Z

    .line 397
    .line 398
    .line 399
    move-result v4

    .line 400
    if-eqz v4, :cond_d

    .line 401
    .line 402
    invoke-static {v1}, Lrk3;->b(Ljava/lang/String;)Z

    .line 403
    .line 404
    .line 405
    move-result v4

    .line 406
    if-eqz v4, :cond_c

    .line 407
    .line 408
    iget-object v2, v2, Lnk3;->b:Ljava/lang/String;

    .line 409
    .line 410
    invoke-static {v2}, Lrk3;->b(Ljava/lang/String;)Z

    .line 411
    .line 412
    .line 413
    move-result v4

    .line 414
    if-nez v4, :cond_a

    .line 415
    .line 416
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 417
    .line 418
    .line 419
    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 420
    .line 421
    .line 422
    move-result-object v2

    .line 423
    const-string v4, "appId"

    .line 424
    .line 425
    invoke-virtual {v8, v4, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 426
    .line 427
    .line 428
    :cond_a
    invoke-static {v1}, Lrk3;->b(Ljava/lang/String;)Z

    .line 429
    .line 430
    .line 431
    move-result v2

    .line 432
    if-eqz v2, :cond_b

    .line 433
    .line 434
    const-string v1, "stableSessionToken"

    .line 435
    .line 436
    invoke-virtual {v8, v1, v3}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 437
    .line 438
    .line 439
    new-instance v1, Lqk3;

    .line 440
    .line 441
    invoke-direct {v1, v0, v5}, Lqk3;-><init>(Lrk3;Lit3;)V

    .line 442
    .line 443
    .line 444
    check-cast v7, Lik3;

    .line 445
    .line 446
    invoke-virtual {v7}, Lsb1;->U()Landroid/os/Parcel;

    .line 447
    .line 448
    .line 449
    move-result-object v0

    .line 450
    invoke-virtual {v0, v6}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 451
    .line 452
    .line 453
    invoke-static {v0, v8}, Liv1;->c(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    .line 454
    .line 455
    .line 456
    invoke-static {v0, v1}, Liv1;->e(Landroid/os/Parcel;Landroid/os/IInterface;)V

    .line 457
    .line 458
    .line 459
    invoke-virtual {v7, v0, v3}, Lsb1;->X0(Landroid/os/Parcel;I)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 460
    .line 461
    .line 462
    goto :goto_4

    .line 463
    :catch_0
    move-exception v0

    .line 464
    goto :goto_3

    .line 465
    :cond_b
    throw v1

    .line 466
    :cond_c
    throw v1

    .line 467
    :cond_d
    throw v1

    .line 468
    :cond_e
    :try_start_1
    throw v1
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0

    .line 469
    :goto_3
    sget-object v1, Lrk3;->c:Ler3;

    .line 470
    .line 471
    filled-new-array {v6}, [Ljava/lang/Object;

    .line 472
    .line 473
    .line 474
    move-result-object v2

    .line 475
    const-string v3, "show overlay display from: %s"

    .line 476
    .line 477
    invoke-virtual {v1, v0, v3, v2}, Ler3;->f(Landroid/os/RemoteException;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 478
    .line 479
    .line 480
    :goto_4
    return-void

    .line 481
    :pswitch_5
    iget-object v0, p0, Lgi;->g:Ljava/lang/Object;

    .line 482
    .line 483
    check-cast v0, Lrk3;

    .line 484
    .line 485
    iget-object v3, p0, Lgi;->h:Ljava/lang/Object;

    .line 486
    .line 487
    check-cast v3, Llk3;

    .line 488
    .line 489
    iget-object v4, p0, Lgi;->i:Ljava/lang/Object;

    .line 490
    .line 491
    check-cast v4, Lit3;

    .line 492
    .line 493
    iget-object v5, v0, Lrk3;->b:Ljava/lang/String;

    .line 494
    .line 495
    :try_start_2
    iget-object v6, v0, Lrk3;->a:Lx03;

    .line 496
    .line 497
    if-eqz v6, :cond_12

    .line 498
    .line 499
    iget-object v1, v6, Lx03;->o:Ljava/lang/Object;

    .line 500
    .line 501
    check-cast v1, Lkk3;

    .line 502
    .line 503
    if-nez v1, :cond_f

    .line 504
    .line 505
    goto :goto_6

    .line 506
    :cond_f
    new-instance v6, Landroid/os/Bundle;

    .line 507
    .line 508
    invoke-direct {v6}, Landroid/os/Bundle;-><init>()V

    .line 509
    .line 510
    .line 511
    const-string v7, "callerPackage"

    .line 512
    .line 513
    invoke-virtual {v6, v7, v5}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 514
    .line 515
    .line 516
    iget-object v7, v3, Llk3;->a:Ljava/lang/String;

    .line 517
    .line 518
    invoke-static {v7}, Lrk3;->b(Ljava/lang/String;)Z

    .line 519
    .line 520
    .line 521
    move-result v8

    .line 522
    if-nez v8, :cond_10

    .line 523
    .line 524
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 525
    .line 526
    .line 527
    invoke-virtual {v7}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 528
    .line 529
    .line 530
    move-result-object v7

    .line 531
    const-string v8, "sessionToken"

    .line 532
    .line 533
    invoke-virtual {v6, v8, v7}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 534
    .line 535
    .line 536
    :cond_10
    iget-object v3, v3, Llk3;->b:Ljava/lang/String;

    .line 537
    .line 538
    invoke-static {v3}, Lrk3;->b(Ljava/lang/String;)Z

    .line 539
    .line 540
    .line 541
    move-result v7

    .line 542
    if-nez v7, :cond_11

    .line 543
    .line 544
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 545
    .line 546
    .line 547
    invoke-virtual {v3}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 548
    .line 549
    .line 550
    move-result-object v3

    .line 551
    const-string v7, "appId"

    .line 552
    .line 553
    invoke-virtual {v6, v7, v3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 554
    .line 555
    .line 556
    :cond_11
    new-instance v3, Lqk3;

    .line 557
    .line 558
    invoke-direct {v3, v0, v4}, Lqk3;-><init>(Lrk3;Lit3;)V

    .line 559
    .line 560
    .line 561
    check-cast v1, Lik3;

    .line 562
    .line 563
    invoke-virtual {v1}, Lsb1;->U()Landroid/os/Parcel;

    .line 564
    .line 565
    .line 566
    move-result-object v0

    .line 567
    invoke-static {v0, v6}, Liv1;->c(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    .line 568
    .line 569
    .line 570
    invoke-static {v0, v3}, Liv1;->e(Landroid/os/Parcel;Landroid/os/IInterface;)V

    .line 571
    .line 572
    .line 573
    invoke-virtual {v1, v0, v2}, Lsb1;->X0(Landroid/os/Parcel;I)V

    .line 574
    .line 575
    .line 576
    goto :goto_6

    .line 577
    :catch_1
    move-exception v0

    .line 578
    goto :goto_5

    .line 579
    :cond_12
    throw v1
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_1

    .line 580
    :goto_5
    sget-object v1, Lrk3;->c:Ler3;

    .line 581
    .line 582
    filled-new-array {v5}, [Ljava/lang/Object;

    .line 583
    .line 584
    .line 585
    move-result-object v2

    .line 586
    const-string v3, "dismiss overlay display from: %s"

    .line 587
    .line 588
    invoke-virtual {v1, v0, v3, v2}, Ler3;->f(Landroid/os/RemoteException;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 589
    .line 590
    .line 591
    :goto_6
    return-void

    .line 592
    :pswitch_6
    iget-object v0, p0, Lgi;->g:Ljava/lang/Object;

    .line 593
    .line 594
    check-cast v0, Lmj3;

    .line 595
    .line 596
    iget-object v1, p0, Lgi;->i:Ljava/lang/Object;

    .line 597
    .line 598
    check-cast v1, Ljava/util/HashMap;

    .line 599
    .line 600
    iget-object v2, p0, Lgi;->h:Ljava/lang/Object;

    .line 601
    .line 602
    check-cast v2, Landroid/content/Context;

    .line 603
    .line 604
    iget-object v3, v0, Lmj3;->d:Lxj3;

    .line 605
    .line 606
    invoke-virtual {v3}, Lxj3;->a()Ljava/util/HashMap;

    .line 607
    .line 608
    .line 609
    move-result-object v3

    .line 610
    invoke-virtual {v1, v3}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V

    .line 611
    .line 612
    .line 613
    invoke-virtual {v0, v1}, Lmj3;->g(Ljava/util/HashMap;)V

    .line 614
    .line 615
    .line 616
    const-string v0, "f"

    .line 617
    .line 618
    const-string v3, "q"

    .line 619
    .line 620
    invoke-virtual {v1, v0, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 621
    .line 622
    .line 623
    const-string v0, "ctx"

    .line 624
    .line 625
    invoke-virtual {v1, v0, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 626
    .line 627
    .line 628
    return-void

    .line 629
    :pswitch_7
    iget-object v0, p0, Lgi;->g:Ljava/lang/Object;

    .line 630
    .line 631
    check-cast v0, Llj3;

    .line 632
    .line 633
    iget-object v1, p0, Lgi;->h:Ljava/lang/Object;

    .line 634
    .line 635
    check-cast v1, Lg4;

    .line 636
    .line 637
    iget-object v3, p0, Lgi;->i:Ljava/lang/Object;

    .line 638
    .line 639
    check-cast v3, Ljh3;

    .line 640
    .line 641
    iget-object v4, v0, Llj3;->a:Lfe3;

    .line 642
    .line 643
    invoke-virtual {v4, v1}, Lfe3;->a(Lg4;)Z

    .line 644
    .line 645
    .line 646
    move-result v1

    .line 647
    if-eqz v1, :cond_13

    .line 648
    .line 649
    iget-object v0, v0, Llj3;->g:Ljava/util/concurrent/atomic/AtomicReference;

    .line 650
    .line 651
    invoke-virtual {v3}, Ljh3;->A()Lfv1;

    .line 652
    .line 653
    .line 654
    move-result-object v1

    .line 655
    invoke-virtual {v1}, Lfv1;->A()Ljava/lang/String;

    .line 656
    .line 657
    .line 658
    move-result-object v1

    .line 659
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 660
    .line 661
    .line 662
    move-result-object v1

    .line 663
    const-string v2, "2."

    .line 664
    .line 665
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 666
    .line 667
    .line 668
    move-result-object v1

    .line 669
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 670
    .line 671
    .line 672
    return-void

    .line 673
    :cond_13
    new-instance v0, Lrg;

    .line 674
    .line 675
    invoke-direct {v0, v2}, Lrg;-><init>(I)V

    .line 676
    .line 677
    .line 678
    throw v0

    .line 679
    :pswitch_8
    iget-object v0, p0, Lgi;->g:Ljava/lang/Object;

    .line 680
    .line 681
    check-cast v0, Lh83;

    .line 682
    .line 683
    iget-object v1, p0, Lgi;->h:Ljava/lang/Object;

    .line 684
    .line 685
    check-cast v1, La83;

    .line 686
    .line 687
    iget-object v2, p0, Lgi;->i:Ljava/lang/Object;

    .line 688
    .line 689
    check-cast v2, Lc03;

    .line 690
    .line 691
    invoke-static {v0, v1, v2}, Lt13;->c(Lh83;La83;Lc03;)V

    .line 692
    .line 693
    .line 694
    return-void

    .line 695
    :pswitch_9
    iget-object v0, p0, Lgi;->g:Ljava/lang/Object;

    .line 696
    .line 697
    check-cast v0, Landroid/database/sqlite/SQLiteDatabase;

    .line 698
    .line 699
    iget-object v1, p0, Lgi;->h:Ljava/lang/Object;

    .line 700
    .line 701
    check-cast v1, Ljava/lang/String;

    .line 702
    .line 703
    iget-object v2, p0, Lgi;->i:Ljava/lang/Object;

    .line 704
    .line 705
    check-cast v2, Lug4;

    .line 706
    .line 707
    new-instance v4, Landroid/content/ContentValues;

    .line 708
    .line 709
    invoke-direct {v4}, Landroid/content/ContentValues;-><init>()V

    .line 710
    .line 711
    .line 712
    const-string v5, "event_state"

    .line 713
    .line 714
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 715
    .line 716
    .line 717
    move-result-object v3

    .line 718
    invoke-virtual {v4, v5, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 719
    .line 720
    .line 721
    filled-new-array {v1}, [Ljava/lang/String;

    .line 722
    .line 723
    .line 724
    move-result-object v1

    .line 725
    const-string v3, "offline_buffered_pings"

    .line 726
    .line 727
    const-string v5, "gws_query_id = ?"

    .line 728
    .line 729
    invoke-virtual {v0, v3, v4, v5, v1}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    .line 730
    .line 731
    .line 732
    invoke-static {v0, v2}, Ljz2;->f(Landroid/database/sqlite/SQLiteDatabase;Lug4;)V

    .line 733
    .line 734
    .line 735
    return-void

    .line 736
    :pswitch_a
    iget-object v0, p0, Lgi;->g:Ljava/lang/Object;

    .line 737
    .line 738
    check-cast v0, Leb3;

    .line 739
    .line 740
    iget-object v2, p0, Lgi;->h:Ljava/lang/Object;

    .line 741
    .line 742
    check-cast v2, Ljava/lang/String;

    .line 743
    .line 744
    iget-object v3, p0, Lgi;->i:Ljava/lang/Object;

    .line 745
    .line 746
    check-cast v3, Lx34;

    .line 747
    .line 748
    invoke-virtual {v0, v2, v3, v1, v1}, Leb3;->b(Ljava/lang/String;Lx34;Lda3;Lao2;)V

    .line 749
    .line 750
    .line 751
    return-void

    .line 752
    :pswitch_b
    iget-object v0, p0, Lgi;->g:Ljava/lang/Object;

    .line 753
    .line 754
    check-cast v0, Lah2;

    .line 755
    .line 756
    iget-object v1, p0, Lgi;->h:Ljava/lang/Object;

    .line 757
    .line 758
    check-cast v1, Landroid/content/Context;

    .line 759
    .line 760
    iget-object v2, p0, Lgi;->i:Ljava/lang/Object;

    .line 761
    .line 762
    check-cast v2, Le51;

    .line 763
    .line 764
    const-string v3, "webview_startup_l"

    .line 765
    .line 766
    sget-object v4, Lhg4;->C:Lhg4;

    .line 767
    .line 768
    iget-object v5, v4, Lhg4;->k:Lym;

    .line 769
    .line 770
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 771
    .line 772
    .line 773
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 774
    .line 775
    .line 776
    move-result-wide v5

    .line 777
    iget-object v7, v4, Lhg4;->c:Llf4;

    .line 778
    .line 779
    iget-object v2, v2, Le51;->f:Ljava/lang/String;

    .line 780
    .line 781
    invoke-virtual {v7, v1, v2}, Llf4;->D(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    .line 782
    .line 783
    .line 784
    sget-object v1, Lmz1;->xe:Liz1;

    .line 785
    .line 786
    sget-object v2, Ltw1;->e:Ltw1;

    .line 787
    .line 788
    iget-object v7, v2, Ltw1;->c:Lkz1;

    .line 789
    .line 790
    invoke-virtual {v7, v1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 791
    .line 792
    .line 793
    move-result-object v1

    .line 794
    check-cast v1, Ljava/lang/Boolean;

    .line 795
    .line 796
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 797
    .line 798
    .line 799
    move-result v1

    .line 800
    if-eqz v1, :cond_14

    .line 801
    .line 802
    iget-object v1, v4, Lhg4;->k:Lym;

    .line 803
    .line 804
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 805
    .line 806
    .line 807
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 808
    .line 809
    .line 810
    move-result-wide v7

    .line 811
    sub-long/2addr v7, v5

    .line 812
    iget-object v1, v0, Lah2;->b:Lmv2;

    .line 813
    .line 814
    invoke-virtual {v1}, Lmv2;->a()Llv2;

    .line 815
    .line 816
    .line 817
    move-result-object v1

    .line 818
    const-string v4, "action"

    .line 819
    .line 820
    invoke-virtual {v1, v4, v3}, Llv2;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 821
    .line 822
    .line 823
    invoke-static {v7, v8}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 824
    .line 825
    .line 826
    move-result-object v4

    .line 827
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 828
    .line 829
    .line 830
    move-result v4

    .line 831
    new-instance v5, Ljava/lang/StringBuilder;

    .line 832
    .line 833
    invoke-direct {v5, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 834
    .line 835
    .line 836
    invoke-virtual {v5, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 837
    .line 838
    .line 839
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 840
    .line 841
    .line 842
    move-result-object v4

    .line 843
    invoke-virtual {v1, v3, v4}, Llv2;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 844
    .line 845
    .line 846
    invoke-virtual {v1}, Llv2;->m()V

    .line 847
    .line 848
    .line 849
    :cond_14
    sget-object v1, Lmz1;->De:Liz1;

    .line 850
    .line 851
    iget-object v2, v2, Ltw1;->c:Lkz1;

    .line 852
    .line 853
    invoke-virtual {v2, v1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 854
    .line 855
    .line 856
    move-result-object v1

    .line 857
    check-cast v1, Ljava/lang/Boolean;

    .line 858
    .line 859
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 860
    .line 861
    .line 862
    move-result v1

    .line 863
    if-eqz v1, :cond_15

    .line 864
    .line 865
    sget-object v1, Lmd2;->f:Lld2;

    .line 866
    .line 867
    new-instance v2, Lfu1;

    .line 868
    .line 869
    const/16 v3, 0x13

    .line 870
    .line 871
    invoke-direct {v2, v3, v0}, Lfu1;-><init>(ILjava/lang/Object;)V

    .line 872
    .line 873
    .line 874
    invoke-virtual {v1, v2}, Lld2;->execute(Ljava/lang/Runnable;)V

    .line 875
    .line 876
    .line 877
    :cond_15
    return-void

    .line 878
    :pswitch_c
    iget-object v0, p0, Lgi;->g:Ljava/lang/Object;

    .line 879
    .line 880
    check-cast v0, Log2;

    .line 881
    .line 882
    iget-object v1, p0, Lgi;->h:Ljava/lang/Object;

    .line 883
    .line 884
    check-cast v1, Ljava/lang/String;

    .line 885
    .line 886
    iget-object v2, p0, Lgi;->i:Ljava/lang/Object;

    .line 887
    .line 888
    check-cast v2, Landroid/webkit/ValueCallback;

    .line 889
    .line 890
    invoke-virtual {v0, v1, v2}, Log2;->R(Ljava/lang/String;Landroid/webkit/ValueCallback;)V

    .line 891
    .line 892
    .line 893
    return-void

    .line 894
    :pswitch_d
    iget-object v0, p0, Lgi;->i:Ljava/lang/Object;

    .line 895
    .line 896
    check-cast v0, Lyd2;

    .line 897
    .line 898
    iget-object v0, v0, Lyd2;->v:Lee2;

    .line 899
    .line 900
    if-eqz v0, :cond_16

    .line 901
    .line 902
    iget-object v1, p0, Lgi;->g:Ljava/lang/Object;

    .line 903
    .line 904
    check-cast v1, Ljava/lang/String;

    .line 905
    .line 906
    iget-object v2, p0, Lgi;->h:Ljava/lang/Object;

    .line 907
    .line 908
    check-cast v2, Ljava/lang/String;

    .line 909
    .line 910
    const-string v3, "what"

    .line 911
    .line 912
    const-string v4, "extra"

    .line 913
    .line 914
    filled-new-array {v3, v1, v4, v2}, [Ljava/lang/String;

    .line 915
    .line 916
    .line 917
    move-result-object v1

    .line 918
    const-string v2, "error"

    .line 919
    .line 920
    invoke-virtual {v0, v2, v1}, Lee2;->c(Ljava/lang/String;[Ljava/lang/String;)V

    .line 921
    .line 922
    .line 923
    :cond_16
    return-void

    .line 924
    :pswitch_e
    iget-object v0, p0, Lgi;->g:Ljava/lang/Object;

    .line 925
    .line 926
    check-cast v0, Ljava/lang/String;

    .line 927
    .line 928
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 929
    .line 930
    .line 931
    move-result v1

    .line 932
    if-eqz v1, :cond_17

    .line 933
    .line 934
    goto :goto_a

    .line 935
    :cond_17
    iget-object v1, p0, Lgi;->h:Ljava/lang/Object;

    .line 936
    .line 937
    check-cast v1, Ljava/lang/String;

    .line 938
    .line 939
    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 940
    .line 941
    .line 942
    move-result-object v0

    .line 943
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 944
    .line 945
    .line 946
    move-result v3

    .line 947
    if-eqz v3, :cond_18

    .line 948
    .line 949
    new-instance v1, Lorg/json/JSONObject;

    .line 950
    .line 951
    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 952
    .line 953
    .line 954
    goto :goto_7

    .line 955
    :cond_18
    :try_start_3
    new-instance v3, Lorg/json/JSONObject;

    .line 956
    .line 957
    invoke-direct {v3, v1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_3
    .catch Lorg/json/JSONException; {:try_start_3 .. :try_end_3} :catch_4

    .line 958
    .line 959
    .line 960
    move-object v1, v3

    .line 961
    :goto_7
    iget-object v3, p0, Lgi;->i:Ljava/lang/Object;

    .line 962
    .line 963
    check-cast v3, [Lln2;

    .line 964
    .line 965
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 966
    .line 967
    .line 968
    :goto_8
    array-length v5, v3

    .line 969
    if-ge v4, v5, :cond_19

    .line 970
    .line 971
    aget-object v5, v3, v4

    .line 972
    .line 973
    new-instance v6, Ljava/util/concurrent/FutureTask;

    .line 974
    .line 975
    new-instance v7, Lyi1;

    .line 976
    .line 977
    invoke-direct {v7, v5, v0, v1, v2}, Lyi1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 978
    .line 979
    .line 980
    invoke-direct {v6, v7}, Ljava/util/concurrent/FutureTask;-><init>(Ljava/util/concurrent/Callable;)V

    .line 981
    .line 982
    .line 983
    invoke-interface {v5}, Lln2;->a()Ljava/util/concurrent/Executor;

    .line 984
    .line 985
    .line 986
    move-result-object v5

    .line 987
    invoke-interface {v5, v6}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 988
    .line 989
    .line 990
    :try_start_4
    invoke-virtual {v6}, Ljava/util/concurrent/FutureTask;->get()Ljava/lang/Object;

    .line 991
    .line 992
    .line 993
    move-result-object v5

    .line 994
    check-cast v5, Ljava/lang/Boolean;

    .line 995
    .line 996
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 997
    .line 998
    .line 999
    move-result v5
    :try_end_4
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_4 .. :try_end_4} :catch_2
    .catch Ljava/lang/InterruptedException; {:try_start_4 .. :try_end_4} :catch_3

    .line 1000
    if-nez v5, :cond_19

    .line 1001
    .line 1002
    goto :goto_9

    .line 1003
    :catch_2
    move-exception v5

    .line 1004
    invoke-virtual {v5}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 1005
    .line 1006
    .line 1007
    :catch_3
    :goto_9
    add-int/lit8 v4, v4, 0x1

    .line 1008
    .line 1009
    goto :goto_8

    .line 1010
    :catch_4
    :cond_19
    :goto_a
    return-void

    .line 1011
    :pswitch_f
    iget-object v0, p0, Lgi;->g:Ljava/lang/Object;

    .line 1012
    .line 1013
    check-cast v0, Li01;

    .line 1014
    .line 1015
    iget-object v1, p0, Lgi;->h:Ljava/lang/Object;

    .line 1016
    .line 1017
    check-cast v1, Landroid/os/Bundle;

    .line 1018
    .line 1019
    iget-object v2, p0, Lgi;->i:Ljava/lang/Object;

    .line 1020
    .line 1021
    check-cast v2, La02;

    .line 1022
    .line 1023
    sget-object v5, Lhg4;->C:Lhg4;

    .line 1024
    .line 1025
    iget-object v5, v5, Lhg4;->f:Lnh4;

    .line 1026
    .line 1027
    iget-object v6, v0, Li01;->a:Landroid/content/Context;

    .line 1028
    .line 1029
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1030
    .line 1031
    .line 1032
    invoke-static {}, Lbd2;->D()Landroid/webkit/CookieManager;

    .line 1033
    .line 1034
    .line 1035
    move-result-object v5

    .line 1036
    if-eqz v5, :cond_1a

    .line 1037
    .line 1038
    iget-object v0, v0, Li01;->b:Landroid/webkit/WebView;

    .line 1039
    .line 1040
    invoke-virtual {v5, v0}, Landroid/webkit/CookieManager;->acceptThirdPartyCookies(Landroid/webkit/WebView;)Z

    .line 1041
    .line 1042
    .line 1043
    move-result v4

    .line 1044
    :cond_1a
    const-string v0, "accept_3p_cookie"

    .line 1045
    .line 1046
    invoke-virtual {v1, v0, v4}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 1047
    .line 1048
    .line 1049
    new-instance v0, La3;

    .line 1050
    .line 1051
    invoke-direct {v0, v3}, Lf74;-><init>(I)V

    .line 1052
    .line 1053
    .line 1054
    invoke-virtual {v0, v1}, Lf74;->i1(Landroid/os/Bundle;)Lf74;

    .line 1055
    .line 1056
    .line 1057
    move-result-object v0

    .line 1058
    check-cast v0, La3;

    .line 1059
    .line 1060
    new-instance v1, Lb3;

    .line 1061
    .line 1062
    invoke-direct {v1, v0}, Lb3;-><init>(Lf74;)V

    .line 1063
    .line 1064
    .line 1065
    invoke-static {v6, v1, v2}, Lug0;->r(Landroid/content/Context;Lb3;Lwm0;)V

    .line 1066
    .line 1067
    .line 1068
    return-void

    .line 1069
    :pswitch_10
    iget-object v0, p0, Lgi;->g:Ljava/lang/Object;

    .line 1070
    .line 1071
    check-cast v0, Lxv1;

    .line 1072
    .line 1073
    iget-object v1, p0, Lgi;->h:Ljava/lang/Object;

    .line 1074
    .line 1075
    check-cast v1, Landroid/webkit/WebView;

    .line 1076
    .line 1077
    invoke-virtual {v1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    .line 1078
    .line 1079
    .line 1080
    move-result-object v2

    .line 1081
    invoke-virtual {v2}, Landroid/webkit/WebSettings;->getJavaScriptEnabled()Z

    .line 1082
    .line 1083
    .line 1084
    move-result v2

    .line 1085
    if-eqz v2, :cond_1b

    .line 1086
    .line 1087
    :try_start_5
    const-string v2, "(function() { return  {text:document.body.innerText}})();"

    .line 1088
    .line 1089
    invoke-virtual {v1, v2, v0}, Landroid/webkit/WebView;->evaluateJavascript(Ljava/lang/String;Landroid/webkit/ValueCallback;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 1090
    .line 1091
    .line 1092
    goto :goto_b

    .line 1093
    :catchall_0
    const-string v1, ""

    .line 1094
    .line 1095
    invoke-virtual {v0, v1}, Lxv1;->onReceiveValue(Ljava/lang/Object;)V

    .line 1096
    .line 1097
    .line 1098
    :cond_1b
    :goto_b
    return-void

    .line 1099
    :pswitch_11
    iget-object v0, p0, Lgi;->g:Ljava/lang/Object;

    .line 1100
    .line 1101
    check-cast v0, Ljo1;

    .line 1102
    .line 1103
    iget-object v1, v0, Ljo1;->j:Ljava/lang/Object;

    .line 1104
    .line 1105
    monitor-enter v1

    .line 1106
    :try_start_6
    monitor-exit v1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 1107
    iget-object v1, p0, Lgi;->h:Ljava/lang/Object;

    .line 1108
    .line 1109
    check-cast v1, Lrl;

    .line 1110
    .line 1111
    iget-object v2, v1, Lrl;->i:Ljava/lang/Object;

    .line 1112
    .line 1113
    check-cast v2, Loo1;

    .line 1114
    .line 1115
    if-nez v2, :cond_1c

    .line 1116
    .line 1117
    iget-object v2, v1, Lrl;->g:Ljava/lang/Object;

    .line 1118
    .line 1119
    invoke-virtual {v0, v2}, Ljo1;->i(Ljava/lang/Object;)V

    .line 1120
    .line 1121
    .line 1122
    goto :goto_c

    .line 1123
    :cond_1c
    iget-object v3, v0, Ljo1;->j:Ljava/lang/Object;

    .line 1124
    .line 1125
    monitor-enter v3

    .line 1126
    :try_start_7
    iget-object v4, v0, Ljo1;->k:Llo1;

    .line 1127
    .line 1128
    monitor-exit v3
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 1129
    invoke-interface {v4, v2}, Llo1;->d(Loo1;)V

    .line 1130
    .line 1131
    .line 1132
    :goto_c
    iget-boolean v1, v1, Lrl;->f:Z

    .line 1133
    .line 1134
    if-eqz v1, :cond_1d

    .line 1135
    .line 1136
    const-string v1, "intermediate-response"

    .line 1137
    .line 1138
    invoke-virtual {v0, v1}, Ljo1;->a(Ljava/lang/String;)V

    .line 1139
    .line 1140
    .line 1141
    goto :goto_d

    .line 1142
    :cond_1d
    const-string v1, "done"

    .line 1143
    .line 1144
    invoke-virtual {v0, v1}, Ljo1;->b(Ljava/lang/String;)V

    .line 1145
    .line 1146
    .line 1147
    :goto_d
    iget-object v0, p0, Lgi;->i:Ljava/lang/Object;

    .line 1148
    .line 1149
    check-cast v0, Ljava/lang/Runnable;

    .line 1150
    .line 1151
    if-eqz v0, :cond_1e

    .line 1152
    .line 1153
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    .line 1154
    .line 1155
    .line 1156
    :cond_1e
    return-void

    .line 1157
    :catchall_1
    move-exception v0

    .line 1158
    :try_start_8
    monitor-exit v3
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    .line 1159
    throw v0

    .line 1160
    :catchall_2
    move-exception v0

    .line 1161
    :try_start_9
    monitor-exit v1
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    .line 1162
    throw v0

    .line 1163
    :pswitch_12
    iget-object v0, p0, Lgi;->g:Ljava/lang/Object;

    .line 1164
    .line 1165
    check-cast v0, Lgw3;

    .line 1166
    .line 1167
    iget-object v1, p0, Lgi;->h:Ljava/lang/Object;

    .line 1168
    .line 1169
    check-cast v1, Lph4;

    .line 1170
    .line 1171
    iget-object v2, p0, Lgi;->i:Ljava/lang/Object;

    .line 1172
    .line 1173
    check-cast v2, Lw34;

    .line 1174
    .line 1175
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1176
    .line 1177
    .line 1178
    sget-object v3, Lv23;->a:Ljava/lang/String;

    .line 1179
    .line 1180
    iget-object v0, v0, Lgw3;->h:Ljava/lang/Object;

    .line 1181
    .line 1182
    check-cast v0, Loa4;

    .line 1183
    .line 1184
    iget-object v0, v0, Loa4;->f:Lya4;

    .line 1185
    .line 1186
    iget-object v0, v0, Lya4;->y:Lmd4;

    .line 1187
    .line 1188
    invoke-virtual {v0}, Lmd4;->y()Lad4;

    .line 1189
    .line 1190
    .line 1191
    move-result-object v3

    .line 1192
    new-instance v4, Lit3;

    .line 1193
    .line 1194
    invoke-direct {v4, v3, v1, v2}, Lit3;-><init>(Lad4;Lph4;Lw34;)V

    .line 1195
    .line 1196
    .line 1197
    const/16 v1, 0x3f9

    .line 1198
    .line 1199
    invoke-virtual {v0, v3, v1, v4}, Lmd4;->s(Lad4;ILks2;)V

    .line 1200
    .line 1201
    .line 1202
    return-void

    .line 1203
    :pswitch_13
    iget-object v0, p0, Lgi;->g:Ljava/lang/Object;

    .line 1204
    .line 1205
    check-cast v0, Lb3;

    .line 1206
    .line 1207
    new-instance v1, Ll92;

    .line 1208
    .line 1209
    iget-object v0, v0, Lb3;->a:Le13;

    .line 1210
    .line 1211
    iget-object v2, p0, Lgi;->i:Ljava/lang/Object;

    .line 1212
    .line 1213
    check-cast v2, Lwm0;

    .line 1214
    .line 1215
    iget-object v3, p0, Lgi;->h:Ljava/lang/Object;

    .line 1216
    .line 1217
    check-cast v3, Landroid/content/Context;

    .line 1218
    .line 1219
    invoke-direct {v1, v3, v0}, Ll92;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1220
    .line 1221
    .line 1222
    invoke-virtual {v1, v2}, Ll92;->L(Lwm0;)V

    .line 1223
    .line 1224
    .line 1225
    return-void

    .line 1226
    :pswitch_14
    iget-object v0, p0, Lgi;->h:Ljava/lang/Object;

    .line 1227
    .line 1228
    check-cast v0, Ljava/lang/String;

    .line 1229
    .line 1230
    iget-object v1, p0, Lgi;->i:Ljava/lang/Object;

    .line 1231
    .line 1232
    check-cast v1, Lwa1;

    .line 1233
    .line 1234
    :try_start_a
    iget-object v2, p0, Lgi;->g:Ljava/lang/Object;

    .line 1235
    .line 1236
    check-cast v2, Lou0;

    .line 1237
    .line 1238
    invoke-virtual {v2}, Ly;->get()Ljava/lang/Object;

    .line 1239
    .line 1240
    .line 1241
    move-result-object v2

    .line 1242
    check-cast v2, Lr70;

    .line 1243
    .line 1244
    if-nez v2, :cond_1f

    .line 1245
    .line 1246
    invoke-static {}, Lh80;->d()Lh80;

    .line 1247
    .line 1248
    .line 1249
    move-result-object v2

    .line 1250
    sget-object v5, Lwa1;->y:Ljava/lang/String;

    .line 1251
    .line 1252
    iget-object v6, v1, Lwa1;->j:Loa1;

    .line 1253
    .line 1254
    iget-object v6, v6, Loa1;->c:Ljava/lang/String;

    .line 1255
    .line 1256
    new-instance v7, Ljava/lang/StringBuilder;

    .line 1257
    .line 1258
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 1259
    .line 1260
    .line 1261
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1262
    .line 1263
    .line 1264
    const-string v6, " returned a null result. Treating it as a failure."

    .line 1265
    .line 1266
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1267
    .line 1268
    .line 1269
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1270
    .line 1271
    .line 1272
    move-result-object v6

    .line 1273
    new-array v7, v4, [Ljava/lang/Throwable;

    .line 1274
    .line 1275
    invoke-virtual {v2, v5, v6, v7}, Lh80;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    .line 1276
    .line 1277
    .line 1278
    goto :goto_e

    .line 1279
    :catchall_3
    move-exception v0

    .line 1280
    goto :goto_12

    .line 1281
    :catch_5
    move-exception v2

    .line 1282
    goto :goto_f

    .line 1283
    :catch_6
    move-exception v2

    .line 1284
    goto :goto_f

    .line 1285
    :catch_7
    move-exception v0

    .line 1286
    goto :goto_10

    .line 1287
    :cond_1f
    invoke-static {}, Lh80;->d()Lh80;

    .line 1288
    .line 1289
    .line 1290
    move-result-object v5

    .line 1291
    sget-object v6, Lwa1;->y:Ljava/lang/String;

    .line 1292
    .line 1293
    const-string v6, "%s returned a %s result."

    .line 1294
    .line 1295
    iget-object v7, v1, Lwa1;->j:Loa1;

    .line 1296
    .line 1297
    iget-object v7, v7, Loa1;->c:Ljava/lang/String;

    .line 1298
    .line 1299
    filled-new-array {v7, v2}, [Ljava/lang/Object;

    .line 1300
    .line 1301
    .line 1302
    move-result-object v7

    .line 1303
    invoke-static {v6, v7}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 1304
    .line 1305
    .line 1306
    new-array v6, v4, [Ljava/lang/Throwable;

    .line 1307
    .line 1308
    invoke-virtual {v5, v6}, Lh80;->a([Ljava/lang/Throwable;)V

    .line 1309
    .line 1310
    .line 1311
    iput-object v2, v1, Lwa1;->m:Lr70;
    :try_end_a
    .catch Ljava/util/concurrent/CancellationException; {:try_start_a .. :try_end_a} :catch_7
    .catch Ljava/lang/InterruptedException; {:try_start_a .. :try_end_a} :catch_6
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_a .. :try_end_a} :catch_5
    .catchall {:try_start_a .. :try_end_a} :catchall_3

    .line 1312
    .line 1313
    :goto_e
    invoke-virtual {v1}, Lwa1;->b()V

    .line 1314
    .line 1315
    .line 1316
    goto :goto_11

    .line 1317
    :goto_f
    :try_start_b
    invoke-static {}, Lh80;->d()Lh80;

    .line 1318
    .line 1319
    .line 1320
    move-result-object v5

    .line 1321
    sget-object v6, Lwa1;->y:Ljava/lang/String;

    .line 1322
    .line 1323
    new-instance v7, Ljava/lang/StringBuilder;

    .line 1324
    .line 1325
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 1326
    .line 1327
    .line 1328
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1329
    .line 1330
    .line 1331
    const-string v0, " failed because it threw an exception/error"

    .line 1332
    .line 1333
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1334
    .line 1335
    .line 1336
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1337
    .line 1338
    .line 1339
    move-result-object v0

    .line 1340
    new-array v3, v3, [Ljava/lang/Throwable;

    .line 1341
    .line 1342
    aput-object v2, v3, v4

    .line 1343
    .line 1344
    invoke-virtual {v5, v6, v0, v3}, Lh80;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    .line 1345
    .line 1346
    .line 1347
    goto :goto_e

    .line 1348
    :goto_10
    invoke-static {}, Lh80;->d()Lh80;

    .line 1349
    .line 1350
    .line 1351
    move-result-object v2

    .line 1352
    sget-object v5, Lwa1;->y:Ljava/lang/String;

    .line 1353
    .line 1354
    new-array v3, v3, [Ljava/lang/Throwable;

    .line 1355
    .line 1356
    aput-object v0, v3, v4

    .line 1357
    .line 1358
    invoke-virtual {v2, v3}, Lh80;->e([Ljava/lang/Throwable;)V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_3

    .line 1359
    .line 1360
    .line 1361
    goto :goto_e

    .line 1362
    :goto_11
    return-void

    .line 1363
    :goto_12
    invoke-virtual {v1}, Lwa1;->b()V

    .line 1364
    .line 1365
    .line 1366
    throw v0

    .line 1367
    :pswitch_15
    iget-object v0, p0, Lgi;->h:Ljava/lang/Object;

    .line 1368
    .line 1369
    check-cast v0, Lou0;

    .line 1370
    .line 1371
    iget-object v1, p0, Lgi;->i:Ljava/lang/Object;

    .line 1372
    .line 1373
    check-cast v1, Lwa1;

    .line 1374
    .line 1375
    :try_start_c
    iget-object v2, p0, Lgi;->g:Ljava/lang/Object;

    .line 1376
    .line 1377
    check-cast v2, Ln70;

    .line 1378
    .line 1379
    invoke-interface {v2}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 1380
    .line 1381
    .line 1382
    invoke-static {}, Lh80;->d()Lh80;

    .line 1383
    .line 1384
    .line 1385
    move-result-object v2

    .line 1386
    sget-object v3, Lwa1;->y:Ljava/lang/String;

    .line 1387
    .line 1388
    iget-object v3, v1, Lwa1;->j:Loa1;

    .line 1389
    .line 1390
    iget-object v3, v3, Loa1;->c:Ljava/lang/String;

    .line 1391
    .line 1392
    new-array v3, v4, [Ljava/lang/Throwable;

    .line 1393
    .line 1394
    invoke-virtual {v2, v3}, Lh80;->a([Ljava/lang/Throwable;)V

    .line 1395
    .line 1396
    .line 1397
    iget-object v2, v1, Lwa1;->k:Landroidx/work/ListenableWorker;

    .line 1398
    .line 1399
    invoke-virtual {v2}, Landroidx/work/ListenableWorker;->startWork()Ln70;

    .line 1400
    .line 1401
    .line 1402
    move-result-object v2

    .line 1403
    iput-object v2, v1, Lwa1;->w:Ln70;

    .line 1404
    .line 1405
    invoke-virtual {v0, v2}, Lou0;->k(Ln70;)Z
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_4

    .line 1406
    .line 1407
    .line 1408
    goto :goto_13

    .line 1409
    :catchall_4
    move-exception v1

    .line 1410
    invoke-virtual {v0, v1}, Lou0;->j(Ljava/lang/Throwable;)Z

    .line 1411
    .line 1412
    .line 1413
    :goto_13
    return-void

    .line 1414
    :pswitch_16
    iget-object v0, p0, Lgi;->g:Ljava/lang/Object;

    .line 1415
    .line 1416
    check-cast v0, Landroid/view/View;

    .line 1417
    .line 1418
    iget-object v1, p0, Lgi;->h:Ljava/lang/Object;

    .line 1419
    .line 1420
    check-cast v1, Lvq2;

    .line 1421
    .line 1422
    invoke-static {v0, v1}, Lw81;->h(Landroid/view/View;Lvq2;)V

    .line 1423
    .line 1424
    .line 1425
    iget-object v0, p0, Lgi;->i:Ljava/lang/Object;

    .line 1426
    .line 1427
    check-cast v0, Landroid/animation/ValueAnimator;

    .line 1428
    .line 1429
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    .line 1430
    .line 1431
    .line 1432
    return-void

    .line 1433
    :pswitch_17
    iget-object v0, p0, Lgi;->g:Ljava/lang/Object;

    .line 1434
    .line 1435
    check-cast v0, Landroidx/work/impl/WorkDatabase;

    .line 1436
    .line 1437
    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->n()Lh2;

    .line 1438
    .line 1439
    .line 1440
    move-result-object v0

    .line 1441
    iget-object v1, p0, Lgi;->h:Ljava/lang/Object;

    .line 1442
    .line 1443
    check-cast v1, Ljava/lang/String;

    .line 1444
    .line 1445
    invoke-virtual {v0, v1}, Lh2;->h(Ljava/lang/String;)Loa1;

    .line 1446
    .line 1447
    .line 1448
    move-result-object v0

    .line 1449
    if-eqz v0, :cond_20

    .line 1450
    .line 1451
    invoke-virtual {v0}, Loa1;->b()Z

    .line 1452
    .line 1453
    .line 1454
    move-result v1

    .line 1455
    if-eqz v1, :cond_20

    .line 1456
    .line 1457
    iget-object v1, p0, Lgi;->i:Ljava/lang/Object;

    .line 1458
    .line 1459
    check-cast v1, Lrz0;

    .line 1460
    .line 1461
    iget-object v1, v1, Lrz0;->h:Ljava/lang/Object;

    .line 1462
    .line 1463
    monitor-enter v1

    .line 1464
    :try_start_d
    iget-object v2, p0, Lgi;->i:Ljava/lang/Object;

    .line 1465
    .line 1466
    check-cast v2, Lrz0;

    .line 1467
    .line 1468
    iget-object v2, v2, Lrz0;->k:Ljava/util/HashMap;

    .line 1469
    .line 1470
    iget-object v3, p0, Lgi;->h:Ljava/lang/Object;

    .line 1471
    .line 1472
    check-cast v3, Ljava/lang/String;

    .line 1473
    .line 1474
    invoke-virtual {v2, v3, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1475
    .line 1476
    .line 1477
    iget-object v2, p0, Lgi;->i:Ljava/lang/Object;

    .line 1478
    .line 1479
    check-cast v2, Lrz0;

    .line 1480
    .line 1481
    iget-object v2, v2, Lrz0;->l:Ljava/util/HashSet;

    .line 1482
    .line 1483
    invoke-virtual {v2, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 1484
    .line 1485
    .line 1486
    iget-object v0, p0, Lgi;->i:Ljava/lang/Object;

    .line 1487
    .line 1488
    check-cast v0, Lrz0;

    .line 1489
    .line 1490
    iget-object v2, v0, Lrz0;->m:Lv91;

    .line 1491
    .line 1492
    iget-object v0, v0, Lrz0;->l:Ljava/util/HashSet;

    .line 1493
    .line 1494
    invoke-virtual {v2, v0}, Lv91;->b(Ljava/util/Collection;)V

    .line 1495
    .line 1496
    .line 1497
    monitor-exit v1

    .line 1498
    goto :goto_14

    .line 1499
    :catchall_5
    move-exception v0

    .line 1500
    monitor-exit v1
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_5

    .line 1501
    throw v0

    .line 1502
    :cond_20
    :goto_14
    return-void

    .line 1503
    :pswitch_18
    iget-object v0, p0, Lgi;->g:Ljava/lang/Object;

    .line 1504
    .line 1505
    check-cast v0, Lha1;

    .line 1506
    .line 1507
    iget-object v0, v0, Lha1;->u:Lom0;

    .line 1508
    .line 1509
    iget-object v1, p0, Lgi;->h:Ljava/lang/Object;

    .line 1510
    .line 1511
    check-cast v1, Ljava/lang/String;

    .line 1512
    .line 1513
    iget-object v2, p0, Lgi;->i:Ljava/lang/Object;

    .line 1514
    .line 1515
    check-cast v2, Lt83;

    .line 1516
    .line 1517
    invoke-virtual {v0, v1, v2}, Lom0;->g(Ljava/lang/String;Lt83;)Z

    .line 1518
    .line 1519
    .line 1520
    return-void

    .line 1521
    :pswitch_19
    :try_start_e
    iget-object v0, p0, Lgi;->g:Ljava/lang/Object;

    .line 1522
    .line 1523
    check-cast v0, Lnv;

    .line 1524
    .line 1525
    invoke-virtual {v0}, Lnv;->call()Ljava/lang/Object;

    .line 1526
    .line 1527
    .line 1528
    move-result-object v1
    :try_end_e
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_8

    .line 1529
    :catch_8
    iget-object v0, p0, Lgi;->h:Ljava/lang/Object;

    .line 1530
    .line 1531
    check-cast v0, Lov;

    .line 1532
    .line 1533
    iget-object v2, p0, Lgi;->i:Ljava/lang/Object;

    .line 1534
    .line 1535
    check-cast v2, Landroid/os/Handler;

    .line 1536
    .line 1537
    new-instance v3, Ljq3;

    .line 1538
    .line 1539
    const/16 v4, 0xe

    .line 1540
    .line 1541
    invoke-direct {v3, v0, v1, v4}, Ljq3;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 1542
    .line 1543
    .line 1544
    invoke-virtual {v2, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 1545
    .line 1546
    .line 1547
    return-void

    .line 1548
    :pswitch_1a
    :try_start_f
    iget-object v0, p0, Lgi;->i:Ljava/lang/Object;

    .line 1549
    .line 1550
    check-cast v0, Lou0;

    .line 1551
    .line 1552
    invoke-virtual {v0}, Ly;->get()Ljava/lang/Object;

    .line 1553
    .line 1554
    .line 1555
    move-result-object v0

    .line 1556
    check-cast v0, Ljava/lang/Boolean;

    .line 1557
    .line 1558
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1559
    .line 1560
    .line 1561
    move-result v3
    :try_end_f
    .catch Ljava/lang/InterruptedException; {:try_start_f .. :try_end_f} :catch_9
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_f .. :try_end_f} :catch_9

    .line 1562
    :catch_9
    iget-object v0, p0, Lgi;->g:Ljava/lang/Object;

    .line 1563
    .line 1564
    check-cast v0, Lom0;

    .line 1565
    .line 1566
    iget-object v1, p0, Lgi;->h:Ljava/lang/Object;

    .line 1567
    .line 1568
    check-cast v1, Ljava/lang/String;

    .line 1569
    .line 1570
    invoke-virtual {v0, v1, v3}, Lom0;->a(Ljava/lang/String;Z)V

    .line 1571
    .line 1572
    .line 1573
    return-void

    .line 1574
    :pswitch_1b
    iget-object v0, p0, Lgi;->g:Ljava/lang/Object;

    .line 1575
    .line 1576
    check-cast v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    .line 1577
    .line 1578
    iget-object v1, p0, Lgi;->i:Ljava/lang/Object;

    .line 1579
    .line 1580
    check-cast v1, Lm00;

    .line 1581
    .line 1582
    iget-object v2, p0, Lgi;->h:Ljava/lang/Object;

    .line 1583
    .line 1584
    check-cast v2, Landroid/view/View;

    .line 1585
    .line 1586
    if-eqz v2, :cond_22

    .line 1587
    .line 1588
    iget-object v3, v1, Lm00;->d:Landroid/widget/OverScroller;

    .line 1589
    .line 1590
    if-eqz v3, :cond_22

    .line 1591
    .line 1592
    invoke-virtual {v3}, Landroid/widget/OverScroller;->computeScrollOffset()Z

    .line 1593
    .line 1594
    .line 1595
    move-result v3

    .line 1596
    if-eqz v3, :cond_21

    .line 1597
    .line 1598
    iget-object v3, v1, Lm00;->d:Landroid/widget/OverScroller;

    .line 1599
    .line 1600
    invoke-virtual {v3}, Landroid/widget/OverScroller;->getCurrY()I

    .line 1601
    .line 1602
    .line 1603
    move-result v3

    .line 1604
    invoke-virtual {v1, v0, v2, v3}, Lm00;->A(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;I)V

    .line 1605
    .line 1606
    .line 1607
    invoke-virtual {v2, p0}, Landroid/view/View;->postOnAnimation(Ljava/lang/Runnable;)V

    .line 1608
    .line 1609
    .line 1610
    goto :goto_15

    .line 1611
    :cond_21
    check-cast v1, Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior;

    .line 1612
    .line 1613
    check-cast v2, Lcom/google/android/material/appbar/AppBarLayout;

    .line 1614
    .line 1615
    invoke-virtual {v1, v0, v2}, Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior;->G(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Lcom/google/android/material/appbar/AppBarLayout;)V

    .line 1616
    .line 1617
    .line 1618
    iget-boolean v1, v2, Lcom/google/android/material/appbar/AppBarLayout;->p:Z

    .line 1619
    .line 1620
    if-eqz v1, :cond_22

    .line 1621
    .line 1622
    invoke-static {v0}, Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior;->D(Landroidx/coordinatorlayout/widget/CoordinatorLayout;)Landroid/view/View;

    .line 1623
    .line 1624
    .line 1625
    move-result-object v0

    .line 1626
    invoke-virtual {v2, v0}, Lcom/google/android/material/appbar/AppBarLayout;->f(Landroid/view/View;)Z

    .line 1627
    .line 1628
    .line 1629
    move-result v0

    .line 1630
    invoke-virtual {v2, v0}, Lcom/google/android/material/appbar/AppBarLayout;->e(Z)Z

    .line 1631
    .line 1632
    .line 1633
    :cond_22
    :goto_15
    return-void

    .line 1634
    :pswitch_1c
    iget-object v0, p0, Lgi;->i:Ljava/lang/Object;

    .line 1635
    .line 1636
    check-cast v0, Landroid/content/BroadcastReceiver$PendingResult;

    .line 1637
    .line 1638
    iget-object v1, p0, Lgi;->h:Ljava/lang/Object;

    .line 1639
    .line 1640
    check-cast v1, Landroid/content/Context;

    .line 1641
    .line 1642
    iget-object v2, p0, Lgi;->g:Ljava/lang/Object;

    .line 1643
    .line 1644
    check-cast v2, Landroid/content/Intent;

    .line 1645
    .line 1646
    :try_start_10
    const-string v3, "KEY_BATTERY_NOT_LOW_PROXY_ENABLED"

    .line 1647
    .line 1648
    invoke-virtual {v2, v3, v4}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 1649
    .line 1650
    .line 1651
    move-result v3

    .line 1652
    const-string v5, "KEY_BATTERY_CHARGING_PROXY_ENABLED"

    .line 1653
    .line 1654
    invoke-virtual {v2, v5, v4}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 1655
    .line 1656
    .line 1657
    move-result v5

    .line 1658
    const-string v6, "KEY_STORAGE_NOT_LOW_PROXY_ENABLED"

    .line 1659
    .line 1660
    invoke-virtual {v2, v6, v4}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 1661
    .line 1662
    .line 1663
    move-result v6

    .line 1664
    const-string v7, "KEY_NETWORK_STATE_PROXY_ENABLED"

    .line 1665
    .line 1666
    invoke-virtual {v2, v7, v4}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 1667
    .line 1668
    .line 1669
    move-result v2

    .line 1670
    invoke-static {}, Lh80;->d()Lh80;

    .line 1671
    .line 1672
    .line 1673
    move-result-object v7

    .line 1674
    sget v8, Landroidx/work/impl/background/systemalarm/ConstraintProxyUpdateReceiver;->a:I

    .line 1675
    .line 1676
    new-array v4, v4, [Ljava/lang/Throwable;

    .line 1677
    .line 1678
    invoke-virtual {v7, v4}, Lh80;->a([Ljava/lang/Throwable;)V

    .line 1679
    .line 1680
    .line 1681
    const-class v4, Landroidx/work/impl/background/systemalarm/ConstraintProxy$BatteryNotLowProxy;

    .line 1682
    .line 1683
    invoke-static {v1, v4, v3}, Lyj0;->a(Landroid/content/Context;Ljava/lang/Class;Z)V

    .line 1684
    .line 1685
    .line 1686
    const-class v3, Landroidx/work/impl/background/systemalarm/ConstraintProxy$BatteryChargingProxy;

    .line 1687
    .line 1688
    invoke-static {v1, v3, v5}, Lyj0;->a(Landroid/content/Context;Ljava/lang/Class;Z)V

    .line 1689
    .line 1690
    .line 1691
    const-class v3, Landroidx/work/impl/background/systemalarm/ConstraintProxy$StorageNotLowProxy;

    .line 1692
    .line 1693
    invoke-static {v1, v3, v6}, Lyj0;->a(Landroid/content/Context;Ljava/lang/Class;Z)V

    .line 1694
    .line 1695
    .line 1696
    const-class v3, Landroidx/work/impl/background/systemalarm/ConstraintProxy$NetworkStateProxy;

    .line 1697
    .line 1698
    invoke-static {v1, v3, v2}, Lyj0;->a(Landroid/content/Context;Ljava/lang/Class;Z)V
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_6

    .line 1699
    .line 1700
    .line 1701
    invoke-virtual {v0}, Landroid/content/BroadcastReceiver$PendingResult;->finish()V

    .line 1702
    .line 1703
    .line 1704
    return-void

    .line 1705
    :catchall_6
    move-exception v1

    .line 1706
    invoke-virtual {v0}, Landroid/content/BroadcastReceiver$PendingResult;->finish()V

    .line 1707
    .line 1708
    .line 1709
    throw v1

    .line 1710
    nop

    .line 1711
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
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
