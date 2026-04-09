.class public abstract Ln24;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget v0, Lj04;->zza:I

    .line 2
    .line 3
    :try_start_0
    invoke-static {}, Ln24;->a()V
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :catch_0
    move-exception v0

    .line 8
    new-instance v1, Ljava/lang/ExceptionInInitializerError;

    .line 9
    .line 10
    invoke-direct {v1, v0}, Ljava/lang/ExceptionInInitializerError;-><init>(Ljava/lang/Throwable;)V

    .line 11
    .line 12
    .line 13
    throw v1
.end method

.method public static a()V
    .locals 16

    .line 1
    sget-object v0, Lv14;->a:Lv14;

    .line 2
    .line 3
    sget-object v0, Lpv3;->b:Lpv3;

    .line 4
    .line 5
    sget-object v1, Lv14;->a:Lv14;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lpv3;->b(Lew3;)V

    .line 8
    .line 9
    .line 10
    sget-object v1, Lv14;->b:Law3;

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Lpv3;->a(Law3;)V

    .line 13
    .line 14
    .line 15
    sget-object v1, Ly14;->a:Ly14;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Lpv3;->b(Lew3;)V

    .line 18
    .line 19
    .line 20
    sget-object v1, Ly14;->b:Law3;

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Lpv3;->a(Law3;)V

    .line 23
    .line 24
    .line 25
    sget v1, Lo14;->f:I

    .line 26
    .line 27
    invoke-static {v1}, Lyb;->x(I)Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    if-eqz v2, :cond_4

    .line 32
    .line 33
    sget-object v2, Lq24;->a:Lvv3;

    .line 34
    .line 35
    sget-object v2, Lrv3;->b:Lrv3;

    .line 36
    .line 37
    sget-object v3, Lq24;->a:Lvv3;

    .line 38
    .line 39
    invoke-virtual {v2, v3}, Lrv3;->c(Lvv3;)V

    .line 40
    .line 41
    .line 42
    sget-object v3, Lq24;->b:Ltv3;

    .line 43
    .line 44
    invoke-virtual {v2, v3}, Lrv3;->d(Ltv3;)V

    .line 45
    .line 46
    .line 47
    sget-object v3, Lq24;->c:Lzu3;

    .line 48
    .line 49
    invoke-virtual {v2, v3}, Lrv3;->a(Lzu3;)V

    .line 50
    .line 51
    .line 52
    sget-object v3, Lq24;->d:Lwu3;

    .line 53
    .line 54
    invoke-virtual {v2, v3}, Lrv3;->b(Lwu3;)V

    .line 55
    .line 56
    .line 57
    sget-object v3, Lq24;->e:Lzu3;

    .line 58
    .line 59
    invoke-virtual {v2, v3}, Lrv3;->a(Lzu3;)V

    .line 60
    .line 61
    .line 62
    sget-object v3, Lq24;->f:Lwu3;

    .line 63
    .line 64
    invoke-virtual {v2, v3}, Lrv3;->b(Lwu3;)V

    .line 65
    .line 66
    .line 67
    sget-object v3, Lov3;->b:Lov3;

    .line 68
    .line 69
    new-instance v4, Ljava/util/HashMap;

    .line 70
    .line 71
    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 72
    .line 73
    .line 74
    const-string v5, "ECDSA_P256"

    .line 75
    .line 76
    sget-object v6, Lu14;->a:Ll14;

    .line 77
    .line 78
    invoke-virtual {v4, v5, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    const-string v5, "ECDSA_P256_IEEE_P1363"

    .line 82
    .line 83
    sget-object v6, Lu14;->d:Ll14;

    .line 84
    .line 85
    invoke-virtual {v4, v5, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    new-instance v5, Lp21;

    .line 89
    .line 90
    const/16 v6, 0x1a

    .line 91
    .line 92
    invoke-direct {v5, v6}, Lp21;-><init>(I)V

    .line 93
    .line 94
    .line 95
    sget-object v7, Lls3;->f:Lls3;

    .line 96
    .line 97
    iput-object v7, v5, Lp21;->h:Ljava/lang/Object;

    .line 98
    .line 99
    sget-object v7, Lj14;->c:Lj14;

    .line 100
    .line 101
    iput-object v7, v5, Lp21;->g:Ljava/lang/Object;

    .line 102
    .line 103
    sget-object v7, Lps3;->k:Lps3;

    .line 104
    .line 105
    iput-object v7, v5, Lp21;->f:Ljava/lang/Object;

    .line 106
    .line 107
    sget-object v7, Lts3;->n:Lts3;

    .line 108
    .line 109
    iput-object v7, v5, Lp21;->i:Ljava/lang/Object;

    .line 110
    .line 111
    invoke-virtual {v5}, Lp21;->L()Ll14;

    .line 112
    .line 113
    .line 114
    move-result-object v5

    .line 115
    const-string v7, "ECDSA_P256_RAW"

    .line 116
    .line 117
    invoke-virtual {v4, v7, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    const-string v5, "ECDSA_P256_IEEE_P1363_WITHOUT_PREFIX"

    .line 121
    .line 122
    sget-object v7, Lu14;->f:Ll14;

    .line 123
    .line 124
    invoke-virtual {v4, v5, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    const-string v5, "ECDSA_P384"

    .line 128
    .line 129
    sget-object v7, Lu14;->b:Ll14;

    .line 130
    .line 131
    invoke-virtual {v4, v5, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    const-string v5, "ECDSA_P384_IEEE_P1363"

    .line 135
    .line 136
    sget-object v7, Lu14;->e:Ll14;

    .line 137
    .line 138
    invoke-virtual {v4, v5, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    new-instance v5, Lp21;

    .line 142
    .line 143
    invoke-direct {v5, v6}, Lp21;-><init>(I)V

    .line 144
    .line 145
    .line 146
    sget-object v7, Lls3;->h:Lls3;

    .line 147
    .line 148
    iput-object v7, v5, Lp21;->h:Ljava/lang/Object;

    .line 149
    .line 150
    sget-object v7, Lj14;->d:Lj14;

    .line 151
    .line 152
    iput-object v7, v5, Lp21;->g:Ljava/lang/Object;

    .line 153
    .line 154
    sget-object v8, Lps3;->l:Lps3;

    .line 155
    .line 156
    iput-object v8, v5, Lp21;->f:Ljava/lang/Object;

    .line 157
    .line 158
    sget-object v9, Lts3;->k:Lts3;

    .line 159
    .line 160
    iput-object v9, v5, Lp21;->i:Ljava/lang/Object;

    .line 161
    .line 162
    invoke-virtual {v5}, Lp21;->L()Ll14;

    .line 163
    .line 164
    .line 165
    move-result-object v5

    .line 166
    const-string v10, "ECDSA_P384_SHA512"

    .line 167
    .line 168
    invoke-virtual {v4, v10, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    new-instance v5, Lp21;

    .line 172
    .line 173
    invoke-direct {v5, v6}, Lp21;-><init>(I)V

    .line 174
    .line 175
    .line 176
    sget-object v6, Lls3;->g:Lls3;

    .line 177
    .line 178
    iput-object v6, v5, Lp21;->h:Ljava/lang/Object;

    .line 179
    .line 180
    iput-object v7, v5, Lp21;->g:Ljava/lang/Object;

    .line 181
    .line 182
    iput-object v8, v5, Lp21;->f:Ljava/lang/Object;

    .line 183
    .line 184
    iput-object v9, v5, Lp21;->i:Ljava/lang/Object;

    .line 185
    .line 186
    invoke-virtual {v5}, Lp21;->L()Ll14;

    .line 187
    .line 188
    .line 189
    move-result-object v5

    .line 190
    const-string v6, "ECDSA_P384_SHA384"

    .line 191
    .line 192
    invoke-virtual {v4, v6, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    const-string v5, "ECDSA_P521"

    .line 196
    .line 197
    sget-object v6, Lu14;->c:Ll14;

    .line 198
    .line 199
    invoke-virtual {v4, v5, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    const-string v5, "ECDSA_P521_IEEE_P1363"

    .line 203
    .line 204
    sget-object v6, Lu14;->g:Ll14;

    .line 205
    .line 206
    invoke-virtual {v4, v5, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    invoke-static {v4}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 210
    .line 211
    .line 212
    move-result-object v4

    .line 213
    invoke-virtual {v3, v4}, Lov3;->b(Ljava/util/Map;)V

    .line 214
    .line 215
    .line 216
    sget-object v4, Lo14;->a:Law3;

    .line 217
    .line 218
    invoke-virtual {v0, v4}, Lpv3;->a(Law3;)V

    .line 219
    .line 220
    .line 221
    sget-object v4, Lo14;->b:Law3;

    .line 222
    .line 223
    invoke-virtual {v0, v4}, Lpv3;->a(Law3;)V

    .line 224
    .line 225
    .line 226
    sget-object v4, Ljv3;->b:Ljv3;

    .line 227
    .line 228
    sget-object v5, Lo14;->e:Lyr3;

    .line 229
    .line 230
    const-class v6, Ll14;

    .line 231
    .line 232
    invoke-virtual {v4, v5, v6}, Ljv3;->a(Liv3;Ljava/lang/Class;)V

    .line 233
    .line 234
    .line 235
    sget-object v5, Lvu3;->d:Lvu3;

    .line 236
    .line 237
    sget-object v6, Lo14;->c:Lbv3;

    .line 238
    .line 239
    const/4 v7, 0x1

    .line 240
    invoke-virtual {v5, v6, v1, v7}, Lvu3;->c(Lcv3;IZ)V

    .line 241
    .line 242
    .line 243
    sget-object v6, Lo14;->d:Lcv3;

    .line 244
    .line 245
    const/4 v8, 0x0

    .line 246
    invoke-virtual {v5, v6, v1, v8}, Lvu3;->c(Lcv3;IZ)V

    .line 247
    .line 248
    .line 249
    sget v1, Lf24;->f:I

    .line 250
    .line 251
    invoke-static {v1}, Lyb;->x(I)Z

    .line 252
    .line 253
    .line 254
    move-result v6

    .line 255
    if-eqz v6, :cond_3

    .line 256
    .line 257
    sget-object v6, Lz24;->a:Lvv3;

    .line 258
    .line 259
    invoke-virtual {v2, v6}, Lrv3;->c(Lvv3;)V

    .line 260
    .line 261
    .line 262
    sget-object v6, Lz24;->b:Ltv3;

    .line 263
    .line 264
    invoke-virtual {v2, v6}, Lrv3;->d(Ltv3;)V

    .line 265
    .line 266
    .line 267
    sget-object v6, Lz24;->c:Lzu3;

    .line 268
    .line 269
    invoke-virtual {v2, v6}, Lrv3;->a(Lzu3;)V

    .line 270
    .line 271
    .line 272
    sget-object v6, Lz24;->d:Lwu3;

    .line 273
    .line 274
    invoke-virtual {v2, v6}, Lrv3;->b(Lwu3;)V

    .line 275
    .line 276
    .line 277
    sget-object v6, Lz24;->e:Lzu3;

    .line 278
    .line 279
    invoke-virtual {v2, v6}, Lrv3;->a(Lzu3;)V

    .line 280
    .line 281
    .line 282
    sget-object v6, Lz24;->f:Lwu3;

    .line 283
    .line 284
    invoke-virtual {v2, v6}, Lrv3;->b(Lwu3;)V

    .line 285
    .line 286
    .line 287
    new-instance v6, Ljava/util/HashMap;

    .line 288
    .line 289
    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    .line 290
    .line 291
    .line 292
    const-string v9, "RSA_SSA_PKCS1_3072_SHA256_F4"

    .line 293
    .line 294
    sget-object v10, Lu14;->h:Lc24;

    .line 295
    .line 296
    invoke-virtual {v6, v9, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 297
    .line 298
    .line 299
    sget-object v9, Lc24;->e:Ljava/math/BigInteger;

    .line 300
    .line 301
    new-instance v9, Lz14;

    .line 302
    .line 303
    invoke-direct {v9}, Lz14;-><init>()V

    .line 304
    .line 305
    .line 306
    sget-object v10, La24;->b:La24;

    .line 307
    .line 308
    iput-object v10, v9, Lz14;->c:La24;

    .line 309
    .line 310
    const/16 v10, 0xc00

    .line 311
    .line 312
    invoke-virtual {v9, v10}, Lz14;->a(I)V

    .line 313
    .line 314
    .line 315
    sget-object v11, Lc24;->e:Ljava/math/BigInteger;

    .line 316
    .line 317
    iput-object v11, v9, Lz14;->b:Ljava/math/BigInteger;

    .line 318
    .line 319
    sget-object v12, Lb24;->e:Lb24;

    .line 320
    .line 321
    iput-object v12, v9, Lz14;->d:Lb24;

    .line 322
    .line 323
    invoke-virtual {v9}, Lz14;->b()Lc24;

    .line 324
    .line 325
    .line 326
    move-result-object v9

    .line 327
    const-string v13, "RSA_SSA_PKCS1_3072_SHA256_F4_RAW"

    .line 328
    .line 329
    invoke-virtual {v6, v13, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 330
    .line 331
    .line 332
    const-string v9, "RSA_SSA_PKCS1_3072_SHA256_F4_WITHOUT_PREFIX"

    .line 333
    .line 334
    sget-object v13, Lu14;->i:Lc24;

    .line 335
    .line 336
    invoke-virtual {v6, v9, v13}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 337
    .line 338
    .line 339
    const-string v9, "RSA_SSA_PKCS1_4096_SHA512_F4"

    .line 340
    .line 341
    sget-object v13, Lu14;->j:Lc24;

    .line 342
    .line 343
    invoke-virtual {v6, v9, v13}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 344
    .line 345
    .line 346
    new-instance v9, Lz14;

    .line 347
    .line 348
    invoke-direct {v9}, Lz14;-><init>()V

    .line 349
    .line 350
    .line 351
    sget-object v13, La24;->d:La24;

    .line 352
    .line 353
    iput-object v13, v9, Lz14;->c:La24;

    .line 354
    .line 355
    const/16 v13, 0x1000

    .line 356
    .line 357
    invoke-virtual {v9, v13}, Lz14;->a(I)V

    .line 358
    .line 359
    .line 360
    iput-object v11, v9, Lz14;->b:Ljava/math/BigInteger;

    .line 361
    .line 362
    iput-object v12, v9, Lz14;->d:Lb24;

    .line 363
    .line 364
    invoke-virtual {v9}, Lz14;->b()Lc24;

    .line 365
    .line 366
    .line 367
    move-result-object v9

    .line 368
    const-string v11, "RSA_SSA_PKCS1_4096_SHA512_F4_RAW"

    .line 369
    .line 370
    invoke-virtual {v6, v11, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 371
    .line 372
    .line 373
    invoke-virtual {v3, v6}, Lov3;->b(Ljava/util/Map;)V

    .line 374
    .line 375
    .line 376
    sget-object v6, Lf24;->a:Law3;

    .line 377
    .line 378
    invoke-virtual {v0, v6}, Lpv3;->a(Law3;)V

    .line 379
    .line 380
    .line 381
    sget-object v6, Lf24;->b:Law3;

    .line 382
    .line 383
    invoke-virtual {v0, v6}, Lpv3;->a(Law3;)V

    .line 384
    .line 385
    .line 386
    sget-object v6, Lf24;->e:Lyr3;

    .line 387
    .line 388
    const-class v9, Lc24;

    .line 389
    .line 390
    invoke-virtual {v4, v6, v9}, Ljv3;->a(Liv3;Ljava/lang/Class;)V

    .line 391
    .line 392
    .line 393
    sget-object v6, Lf24;->c:Lbv3;

    .line 394
    .line 395
    invoke-virtual {v5, v6, v1, v7}, Lvu3;->c(Lcv3;IZ)V

    .line 396
    .line 397
    .line 398
    sget-object v6, Lf24;->d:Lcv3;

    .line 399
    .line 400
    invoke-virtual {v5, v6, v1, v8}, Lvu3;->c(Lcv3;IZ)V

    .line 401
    .line 402
    .line 403
    sget v1, Lm24;->f:I

    .line 404
    .line 405
    invoke-static {v1}, Lyb;->x(I)Z

    .line 406
    .line 407
    .line 408
    move-result v6

    .line 409
    if-eqz v6, :cond_2

    .line 410
    .line 411
    sget-object v6, Lc34;->a:Lvv3;

    .line 412
    .line 413
    invoke-virtual {v2, v6}, Lrv3;->c(Lvv3;)V

    .line 414
    .line 415
    .line 416
    sget-object v6, Lc34;->b:Ltv3;

    .line 417
    .line 418
    invoke-virtual {v2, v6}, Lrv3;->d(Ltv3;)V

    .line 419
    .line 420
    .line 421
    sget-object v6, Lc34;->c:Lzu3;

    .line 422
    .line 423
    invoke-virtual {v2, v6}, Lrv3;->a(Lzu3;)V

    .line 424
    .line 425
    .line 426
    sget-object v6, Lc34;->d:Lwu3;

    .line 427
    .line 428
    invoke-virtual {v2, v6}, Lrv3;->b(Lwu3;)V

    .line 429
    .line 430
    .line 431
    sget-object v6, Lc34;->e:Lzu3;

    .line 432
    .line 433
    invoke-virtual {v2, v6}, Lrv3;->a(Lzu3;)V

    .line 434
    .line 435
    .line 436
    sget-object v6, Lc34;->f:Lwu3;

    .line 437
    .line 438
    invoke-virtual {v2, v6}, Lrv3;->b(Lwu3;)V

    .line 439
    .line 440
    .line 441
    new-instance v6, Ljava/util/HashMap;

    .line 442
    .line 443
    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    .line 444
    .line 445
    .line 446
    sget-object v9, Lj24;->g:Ljava/math/BigInteger;

    .line 447
    .line 448
    new-instance v9, Lg24;

    .line 449
    .line 450
    invoke-direct {v9}, Lg24;-><init>()V

    .line 451
    .line 452
    .line 453
    sget-object v11, Lh24;->b:Lh24;

    .line 454
    .line 455
    iput-object v11, v9, Lg24;->c:Lh24;

    .line 456
    .line 457
    iput-object v11, v9, Lg24;->d:Lh24;

    .line 458
    .line 459
    const/16 v12, 0x20

    .line 460
    .line 461
    invoke-virtual {v9, v12}, Lg24;->b(I)V

    .line 462
    .line 463
    .line 464
    invoke-virtual {v9, v10}, Lg24;->a(I)V

    .line 465
    .line 466
    .line 467
    sget-object v14, Lj24;->g:Ljava/math/BigInteger;

    .line 468
    .line 469
    iput-object v14, v9, Lg24;->b:Ljava/math/BigInteger;

    .line 470
    .line 471
    sget-object v15, Li24;->b:Li24;

    .line 472
    .line 473
    iput-object v15, v9, Lg24;->f:Li24;

    .line 474
    .line 475
    invoke-virtual {v9}, Lg24;->c()Lj24;

    .line 476
    .line 477
    .line 478
    move-result-object v9

    .line 479
    const-string v8, "RSA_SSA_PSS_3072_SHA256_F4"

    .line 480
    .line 481
    invoke-virtual {v6, v8, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 482
    .line 483
    .line 484
    new-instance v8, Lg24;

    .line 485
    .line 486
    invoke-direct {v8}, Lg24;-><init>()V

    .line 487
    .line 488
    .line 489
    iput-object v11, v8, Lg24;->c:Lh24;

    .line 490
    .line 491
    iput-object v11, v8, Lg24;->d:Lh24;

    .line 492
    .line 493
    invoke-virtual {v8, v12}, Lg24;->b(I)V

    .line 494
    .line 495
    .line 496
    invoke-virtual {v8, v10}, Lg24;->a(I)V

    .line 497
    .line 498
    .line 499
    iput-object v14, v8, Lg24;->b:Ljava/math/BigInteger;

    .line 500
    .line 501
    sget-object v9, Li24;->e:Li24;

    .line 502
    .line 503
    iput-object v9, v8, Lg24;->f:Li24;

    .line 504
    .line 505
    invoke-virtual {v8}, Lg24;->c()Lj24;

    .line 506
    .line 507
    .line 508
    move-result-object v8

    .line 509
    const-string v10, "RSA_SSA_PSS_3072_SHA256_F4_RAW"

    .line 510
    .line 511
    invoke-virtual {v6, v10, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 512
    .line 513
    .line 514
    const-string v8, "RSA_SSA_PSS_3072_SHA256_SHA256_32_F4"

    .line 515
    .line 516
    sget-object v10, Lu14;->k:Lj24;

    .line 517
    .line 518
    invoke-virtual {v6, v8, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 519
    .line 520
    .line 521
    new-instance v8, Lg24;

    .line 522
    .line 523
    invoke-direct {v8}, Lg24;-><init>()V

    .line 524
    .line 525
    .line 526
    sget-object v10, Lh24;->d:Lh24;

    .line 527
    .line 528
    iput-object v10, v8, Lg24;->c:Lh24;

    .line 529
    .line 530
    iput-object v10, v8, Lg24;->d:Lh24;

    .line 531
    .line 532
    const/16 v11, 0x40

    .line 533
    .line 534
    invoke-virtual {v8, v11}, Lg24;->b(I)V

    .line 535
    .line 536
    .line 537
    invoke-virtual {v8, v13}, Lg24;->a(I)V

    .line 538
    .line 539
    .line 540
    iput-object v14, v8, Lg24;->b:Ljava/math/BigInteger;

    .line 541
    .line 542
    iput-object v15, v8, Lg24;->f:Li24;

    .line 543
    .line 544
    invoke-virtual {v8}, Lg24;->c()Lj24;

    .line 545
    .line 546
    .line 547
    move-result-object v8

    .line 548
    const-string v12, "RSA_SSA_PSS_4096_SHA512_F4"

    .line 549
    .line 550
    invoke-virtual {v6, v12, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 551
    .line 552
    .line 553
    new-instance v8, Lg24;

    .line 554
    .line 555
    invoke-direct {v8}, Lg24;-><init>()V

    .line 556
    .line 557
    .line 558
    iput-object v10, v8, Lg24;->c:Lh24;

    .line 559
    .line 560
    iput-object v10, v8, Lg24;->d:Lh24;

    .line 561
    .line 562
    invoke-virtual {v8, v11}, Lg24;->b(I)V

    .line 563
    .line 564
    .line 565
    invoke-virtual {v8, v13}, Lg24;->a(I)V

    .line 566
    .line 567
    .line 568
    iput-object v14, v8, Lg24;->b:Ljava/math/BigInteger;

    .line 569
    .line 570
    iput-object v9, v8, Lg24;->f:Li24;

    .line 571
    .line 572
    invoke-virtual {v8}, Lg24;->c()Lj24;

    .line 573
    .line 574
    .line 575
    move-result-object v8

    .line 576
    const-string v9, "RSA_SSA_PSS_4096_SHA512_F4_RAW"

    .line 577
    .line 578
    invoke-virtual {v6, v9, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 579
    .line 580
    .line 581
    const-string v8, "RSA_SSA_PSS_4096_SHA512_SHA512_64_F4"

    .line 582
    .line 583
    sget-object v9, Lu14;->l:Lj24;

    .line 584
    .line 585
    invoke-virtual {v6, v8, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 586
    .line 587
    .line 588
    invoke-static {v6}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 589
    .line 590
    .line 591
    move-result-object v6

    .line 592
    invoke-virtual {v3, v6}, Lov3;->b(Ljava/util/Map;)V

    .line 593
    .line 594
    .line 595
    sget-object v6, Lm24;->a:Law3;

    .line 596
    .line 597
    invoke-virtual {v0, v6}, Lpv3;->a(Law3;)V

    .line 598
    .line 599
    .line 600
    sget-object v6, Lm24;->b:Law3;

    .line 601
    .line 602
    invoke-virtual {v0, v6}, Lpv3;->a(Law3;)V

    .line 603
    .line 604
    .line 605
    sget-object v6, Lm24;->e:Lyr3;

    .line 606
    .line 607
    const-class v8, Lj24;

    .line 608
    .line 609
    invoke-virtual {v4, v6, v8}, Ljv3;->a(Liv3;Ljava/lang/Class;)V

    .line 610
    .line 611
    .line 612
    sget-object v6, Lm24;->c:Lbv3;

    .line 613
    .line 614
    invoke-virtual {v5, v6, v1, v7}, Lvu3;->c(Lcv3;IZ)V

    .line 615
    .line 616
    .line 617
    sget-object v6, Lm24;->d:Lcv3;

    .line 618
    .line 619
    const/4 v8, 0x0

    .line 620
    invoke-virtual {v5, v6, v1, v8}, Lvu3;->c(Lcv3;IZ)V

    .line 621
    .line 622
    .line 623
    invoke-static {}, Lmu3;->a()Z

    .line 624
    .line 625
    .line 626
    move-result v1

    .line 627
    if-eqz v1, :cond_0

    .line 628
    .line 629
    return-void

    .line 630
    :cond_0
    sget-object v1, Ls14;->a:Law3;

    .line 631
    .line 632
    invoke-static {v7}, Lyb;->x(I)Z

    .line 633
    .line 634
    .line 635
    move-result v1

    .line 636
    if-eqz v1, :cond_1

    .line 637
    .line 638
    sget-object v1, Lu24;->a:Lvv3;

    .line 639
    .line 640
    invoke-virtual {v2, v1}, Lrv3;->c(Lvv3;)V

    .line 641
    .line 642
    .line 643
    sget-object v1, Lu24;->b:Ltv3;

    .line 644
    .line 645
    invoke-virtual {v2, v1}, Lrv3;->d(Ltv3;)V

    .line 646
    .line 647
    .line 648
    sget-object v1, Lu24;->c:Lzu3;

    .line 649
    .line 650
    invoke-virtual {v2, v1}, Lrv3;->a(Lzu3;)V

    .line 651
    .line 652
    .line 653
    sget-object v1, Lu24;->d:Lwu3;

    .line 654
    .line 655
    invoke-virtual {v2, v1}, Lrv3;->b(Lwu3;)V

    .line 656
    .line 657
    .line 658
    sget-object v1, Lu24;->e:Lzu3;

    .line 659
    .line 660
    invoke-virtual {v2, v1}, Lrv3;->a(Lzu3;)V

    .line 661
    .line 662
    .line 663
    sget-object v1, Lu24;->f:Lwu3;

    .line 664
    .line 665
    invoke-virtual {v2, v1}, Lrv3;->b(Lwu3;)V

    .line 666
    .line 667
    .line 668
    new-instance v1, Ljava/util/HashMap;

    .line 669
    .line 670
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 671
    .line 672
    .line 673
    new-instance v2, Lq14;

    .line 674
    .line 675
    sget-object v6, Lp14;->b:Lp14;

    .line 676
    .line 677
    invoke-direct {v2, v6}, Lq14;-><init>(Lp14;)V

    .line 678
    .line 679
    .line 680
    const-string v6, "ED25519"

    .line 681
    .line 682
    invoke-virtual {v1, v6, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 683
    .line 684
    .line 685
    new-instance v2, Lq14;

    .line 686
    .line 687
    sget-object v6, Lp14;->e:Lp14;

    .line 688
    .line 689
    invoke-direct {v2, v6}, Lq14;-><init>(Lp14;)V

    .line 690
    .line 691
    .line 692
    const-string v8, "ED25519_RAW"

    .line 693
    .line 694
    invoke-virtual {v1, v8, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 695
    .line 696
    .line 697
    new-instance v2, Lq14;

    .line 698
    .line 699
    invoke-direct {v2, v6}, Lq14;-><init>(Lp14;)V

    .line 700
    .line 701
    .line 702
    const-string v6, "ED25519WithRawOutput"

    .line 703
    .line 704
    invoke-virtual {v1, v6, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 705
    .line 706
    .line 707
    invoke-static {v1}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 708
    .line 709
    .line 710
    move-result-object v1

    .line 711
    invoke-virtual {v3, v1}, Lov3;->b(Ljava/util/Map;)V

    .line 712
    .line 713
    .line 714
    sget-object v1, Ls14;->f:Lyr3;

    .line 715
    .line 716
    const-class v2, Lq14;

    .line 717
    .line 718
    invoke-virtual {v4, v1, v2}, Ljv3;->a(Liv3;Ljava/lang/Class;)V

    .line 719
    .line 720
    .line 721
    sget-object v1, Llv3;->b:Llv3;

    .line 722
    .line 723
    sget-object v3, Ls14;->e:Lzr3;

    .line 724
    .line 725
    invoke-virtual {v1, v3, v2}, Llv3;->a(Lkv3;Ljava/lang/Class;)V

    .line 726
    .line 727
    .line 728
    sget-object v1, Ls14;->a:Law3;

    .line 729
    .line 730
    invoke-virtual {v0, v1}, Lpv3;->a(Law3;)V

    .line 731
    .line 732
    .line 733
    sget-object v1, Ls14;->b:Law3;

    .line 734
    .line 735
    invoke-virtual {v0, v1}, Lpv3;->a(Law3;)V

    .line 736
    .line 737
    .line 738
    sget-object v0, Ls14;->c:Lbv3;

    .line 739
    .line 740
    invoke-virtual {v5, v0, v7}, Lvu3;->a(Lcv3;Z)V

    .line 741
    .line 742
    .line 743
    sget-object v0, Ls14;->d:Lcv3;

    .line 744
    .line 745
    const/4 v8, 0x0

    .line 746
    invoke-virtual {v5, v0, v8}, Lvu3;->a(Lcv3;Z)V

    .line 747
    .line 748
    .line 749
    return-void

    .line 750
    :cond_1
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 751
    .line 752
    const-string v1, "Registering AES GCM SIV is not supported in FIPS mode"

    .line 753
    .line 754
    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 755
    .line 756
    .line 757
    throw v0

    .line 758
    :cond_2
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 759
    .line 760
    const-string v1, "Can not use RSA SSA PSS in FIPS-mode, as BoringCrypto module is not available."

    .line 761
    .line 762
    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 763
    .line 764
    .line 765
    throw v0

    .line 766
    :cond_3
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 767
    .line 768
    const-string v1, "Can not use RSA SSA PKCS1 in FIPS-mode, as BoringCrypto module is not available."

    .line 769
    .line 770
    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 771
    .line 772
    .line 773
    throw v0

    .line 774
    :cond_4
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 775
    .line 776
    const-string v1, "Can not use ECDSA in FIPS-mode, as BoringCrypto module is not available."

    .line 777
    .line 778
    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 779
    .line 780
    .line 781
    throw v0
.end method
