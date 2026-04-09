.class public final Lo44;
.super Lgi2;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# static fields
.field public static final j:Lo44;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lo44;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lo44;->j:Lo44;

    .line 7
    .line 8
    return-void
.end method

.method public static r0(Lr44;Lb44;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lr44;->f:Ln44;

    .line 2
    .line 3
    const-string v1, "null"

    .line 4
    .line 5
    if-eqz p1, :cond_17

    .line 6
    .line 7
    instance-of v2, p1, Lc44;

    .line 8
    .line 9
    if-eqz v2, :cond_0

    .line 10
    .line 11
    goto/16 :goto_6

    .line 12
    .line 13
    :cond_0
    instance-of v2, p1, Lf44;

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    if-eqz v2, :cond_c

    .line 17
    .line 18
    invoke-virtual {p1}, Lb44;->c()Lf44;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    iget-object v2, p1, Lf44;->f:Ljava/io/Serializable;

    .line 23
    .line 24
    instance-of v4, v2, Ljava/lang/Number;

    .line 25
    .line 26
    if-eqz v4, :cond_7

    .line 27
    .line 28
    invoke-virtual {p1}, Lf44;->d()Ljava/lang/Number;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-virtual {p0}, Lr44;->f()V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    const-class v2, Ljava/lang/Integer;

    .line 44
    .line 45
    if-eq p1, v2, :cond_6

    .line 46
    .line 47
    const-class v2, Ljava/lang/Long;

    .line 48
    .line 49
    if-eq p1, v2, :cond_6

    .line 50
    .line 51
    const-class v2, Ljava/lang/Byte;

    .line 52
    .line 53
    if-eq p1, v2, :cond_6

    .line 54
    .line 55
    const-class v2, Ljava/lang/Short;

    .line 56
    .line 57
    if-eq p1, v2, :cond_6

    .line 58
    .line 59
    const-class v2, Ljava/math/BigDecimal;

    .line 60
    .line 61
    if-eq p1, v2, :cond_6

    .line 62
    .line 63
    const-class v2, Ljava/math/BigInteger;

    .line 64
    .line 65
    if-eq p1, v2, :cond_6

    .line 66
    .line 67
    const-class v2, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 68
    .line 69
    if-eq p1, v2, :cond_6

    .line 70
    .line 71
    const-class v2, Ljava/util/concurrent/atomic/AtomicLong;

    .line 72
    .line 73
    if-ne p1, v2, :cond_1

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_1
    const-string v2, "-Infinity"

    .line 77
    .line 78
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v2

    .line 82
    if-nez v2, :cond_4

    .line 83
    .line 84
    const-string v2, "Infinity"

    .line 85
    .line 86
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v2

    .line 90
    if-nez v2, :cond_4

    .line 91
    .line 92
    const-string v2, "NaN"

    .line 93
    .line 94
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result v2

    .line 98
    if-eqz v2, :cond_2

    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_2
    const-class v2, Ljava/lang/Float;

    .line 102
    .line 103
    if-eq p1, v2, :cond_6

    .line 104
    .line 105
    const-class v2, Ljava/lang/Double;

    .line 106
    .line 107
    if-eq p1, v2, :cond_6

    .line 108
    .line 109
    sget-object v2, Lr44;->o:Ljava/util/regex/Pattern;

    .line 110
    .line 111
    invoke-virtual {v2, v1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 112
    .line 113
    .line 114
    move-result-object v2

    .line 115
    invoke-virtual {v2}, Ljava/util/regex/Matcher;->matches()Z

    .line 116
    .line 117
    .line 118
    move-result v2

    .line 119
    if-eqz v2, :cond_3

    .line 120
    .line 121
    goto :goto_1

    .line 122
    :cond_3
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 123
    .line 124
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 129
    .line 130
    .line 131
    move-result v0

    .line 132
    add-int/lit8 v0, v0, 0x2f

    .line 133
    .line 134
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 135
    .line 136
    .line 137
    move-result v2

    .line 138
    new-instance v3, Ljava/lang/StringBuilder;

    .line 139
    .line 140
    add-int/2addr v0, v2

    .line 141
    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 142
    .line 143
    .line 144
    const-string v0, "String created by "

    .line 145
    .line 146
    const-string v2, " is not a valid JSON number: "

    .line 147
    .line 148
    invoke-static {v3, v0, p1, v2, v1}, Lex0;->m(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object p1

    .line 152
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    throw p0

    .line 156
    :cond_4
    :goto_0
    iget p1, p0, Lr44;->m:I

    .line 157
    .line 158
    if-ne p1, v3, :cond_5

    .line 159
    .line 160
    goto :goto_1

    .line 161
    :cond_5
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 162
    .line 163
    const-string p1, "Numeric values must be finite, but was "

    .line 164
    .line 165
    invoke-virtual {p1, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object p1

    .line 169
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    throw p0

    .line 173
    :cond_6
    :goto_1
    invoke-virtual {p0}, Lr44;->i()V

    .line 174
    .line 175
    .line 176
    invoke-virtual {v0, v1}, Ln44;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;

    .line 177
    .line 178
    .line 179
    return-void

    .line 180
    :cond_7
    instance-of v4, v2, Ljava/lang/Boolean;

    .line 181
    .line 182
    if-eqz v4, :cond_9

    .line 183
    .line 184
    check-cast v2, Ljava/lang/Boolean;

    .line 185
    .line 186
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 187
    .line 188
    .line 189
    move-result p1

    .line 190
    invoke-virtual {p0}, Lr44;->f()V

    .line 191
    .line 192
    .line 193
    invoke-virtual {p0}, Lr44;->i()V

    .line 194
    .line 195
    .line 196
    if-eq v3, p1, :cond_8

    .line 197
    .line 198
    const-string p0, "false"

    .line 199
    .line 200
    goto :goto_2

    .line 201
    :cond_8
    const-string p0, "true"

    .line 202
    .line 203
    :goto_2
    invoke-virtual {v0, p0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 204
    .line 205
    .line 206
    return-void

    .line 207
    :cond_9
    invoke-virtual {p1}, Lf44;->a()Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    move-result-object p1

    .line 211
    if-nez p1, :cond_b

    .line 212
    .line 213
    iget-object p1, p0, Lr44;->n:Ljava/lang/String;

    .line 214
    .line 215
    if-eqz p1, :cond_a

    .line 216
    .line 217
    invoke-virtual {p0}, Lr44;->f()V

    .line 218
    .line 219
    .line 220
    :cond_a
    invoke-virtual {p0}, Lr44;->i()V

    .line 221
    .line 222
    .line 223
    invoke-virtual {v0, v1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 224
    .line 225
    .line 226
    return-void

    .line 227
    :cond_b
    invoke-virtual {p0}, Lr44;->f()V

    .line 228
    .line 229
    .line 230
    invoke-virtual {p0}, Lr44;->i()V

    .line 231
    .line 232
    .line 233
    invoke-virtual {p0, p1}, Lr44;->g(Ljava/lang/String;)V

    .line 234
    .line 235
    .line 236
    return-void

    .line 237
    :cond_c
    instance-of v1, p1, La44;

    .line 238
    .line 239
    if-eqz v1, :cond_10

    .line 240
    .line 241
    invoke-virtual {p0}, Lr44;->f()V

    .line 242
    .line 243
    .line 244
    invoke-virtual {p0}, Lr44;->i()V

    .line 245
    .line 246
    .line 247
    iget v2, p0, Lr44;->h:I

    .line 248
    .line 249
    iget-object v4, p0, Lr44;->g:[I

    .line 250
    .line 251
    array-length v5, v4

    .line 252
    if-ne v2, v5, :cond_d

    .line 253
    .line 254
    add-int/2addr v2, v2

    .line 255
    invoke-static {v4, v2}, Ljava/util/Arrays;->copyOf([II)[I

    .line 256
    .line 257
    .line 258
    move-result-object v2

    .line 259
    iput-object v2, p0, Lr44;->g:[I

    .line 260
    .line 261
    :cond_d
    iget-object v2, p0, Lr44;->g:[I

    .line 262
    .line 263
    iget v4, p0, Lr44;->h:I

    .line 264
    .line 265
    add-int/lit8 v5, v4, 0x1

    .line 266
    .line 267
    iput v5, p0, Lr44;->h:I

    .line 268
    .line 269
    aput v3, v2, v4

    .line 270
    .line 271
    const/16 v2, 0x5b

    .line 272
    .line 273
    invoke-virtual {v0, v2}, Ln44;->write(I)V

    .line 274
    .line 275
    .line 276
    if-eqz v1, :cond_f

    .line 277
    .line 278
    check-cast p1, La44;

    .line 279
    .line 280
    iget-object p1, p1, La44;->f:Ljava/util/ArrayList;

    .line 281
    .line 282
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 283
    .line 284
    .line 285
    move-result v0

    .line 286
    const/4 v1, 0x0

    .line 287
    :goto_3
    if-ge v1, v0, :cond_e

    .line 288
    .line 289
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 290
    .line 291
    .line 292
    move-result-object v2

    .line 293
    add-int/lit8 v1, v1, 0x1

    .line 294
    .line 295
    check-cast v2, Lb44;

    .line 296
    .line 297
    invoke-static {p0, v2}, Lo44;->r0(Lr44;Lb44;)V

    .line 298
    .line 299
    .line 300
    goto :goto_3

    .line 301
    :cond_e
    const/4 p1, 0x2

    .line 302
    const/16 v0, 0x5d

    .line 303
    .line 304
    invoke-virtual {p0, v3, p1, v0}, Lr44;->a(IIC)V

    .line 305
    .line 306
    .line 307
    return-void

    .line 308
    :cond_f
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 309
    .line 310
    invoke-virtual {p1}, Lb44;->toString()Ljava/lang/String;

    .line 311
    .line 312
    .line 313
    move-result-object p1

    .line 314
    const-string v0, "Not a JSON Array: "

    .line 315
    .line 316
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 317
    .line 318
    .line 319
    move-result-object p1

    .line 320
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 321
    .line 322
    .line 323
    throw p0

    .line 324
    :cond_10
    instance-of v1, p1, Ld44;

    .line 325
    .line 326
    if-eqz v1, :cond_16

    .line 327
    .line 328
    invoke-virtual {p0}, Lr44;->f()V

    .line 329
    .line 330
    .line 331
    invoke-virtual {p0}, Lr44;->i()V

    .line 332
    .line 333
    .line 334
    iget v1, p0, Lr44;->h:I

    .line 335
    .line 336
    iget-object v2, p0, Lr44;->g:[I

    .line 337
    .line 338
    array-length v3, v2

    .line 339
    if-ne v1, v3, :cond_11

    .line 340
    .line 341
    add-int/2addr v1, v1

    .line 342
    invoke-static {v2, v1}, Ljava/util/Arrays;->copyOf([II)[I

    .line 343
    .line 344
    .line 345
    move-result-object v1

    .line 346
    iput-object v1, p0, Lr44;->g:[I

    .line 347
    .line 348
    :cond_11
    iget-object v1, p0, Lr44;->g:[I

    .line 349
    .line 350
    iget v2, p0, Lr44;->h:I

    .line 351
    .line 352
    add-int/lit8 v3, v2, 0x1

    .line 353
    .line 354
    iput v3, p0, Lr44;->h:I

    .line 355
    .line 356
    const/4 v3, 0x3

    .line 357
    aput v3, v1, v2

    .line 358
    .line 359
    const/16 v1, 0x7b

    .line 360
    .line 361
    invoke-virtual {v0, v1}, Ln44;->write(I)V

    .line 362
    .line 363
    .line 364
    invoke-virtual {p1}, Lb44;->b()Ld44;

    .line 365
    .line 366
    .line 367
    move-result-object p1

    .line 368
    iget-object p1, p1, Ld44;->f:Lk44;

    .line 369
    .line 370
    invoke-virtual {p1}, Lk44;->entrySet()Ljava/util/Set;

    .line 371
    .line 372
    .line 373
    move-result-object p1

    .line 374
    check-cast p1, Li44;

    .line 375
    .line 376
    invoke-virtual {p1}, Li44;->iterator()Ljava/util/Iterator;

    .line 377
    .line 378
    .line 379
    move-result-object p1

    .line 380
    :goto_4
    move-object v0, p1

    .line 381
    check-cast v0, Lh44;

    .line 382
    .line 383
    invoke-virtual {v0}, Lh44;->hasNext()Z

    .line 384
    .line 385
    .line 386
    move-result v0

    .line 387
    const/4 v1, 0x5

    .line 388
    if-eqz v0, :cond_15

    .line 389
    .line 390
    move-object v0, p1

    .line 391
    check-cast v0, Lh44;

    .line 392
    .line 393
    invoke-virtual {v0}, Lh44;->b()Lj44;

    .line 394
    .line 395
    .line 396
    move-result-object v0

    .line 397
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 398
    .line 399
    .line 400
    move-result-object v2

    .line 401
    check-cast v2, Ljava/lang/String;

    .line 402
    .line 403
    const-string v4, "name == null"

    .line 404
    .line 405
    invoke-static {v2, v4}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 406
    .line 407
    .line 408
    iget-object v4, p0, Lr44;->n:Ljava/lang/String;

    .line 409
    .line 410
    if-nez v4, :cond_14

    .line 411
    .line 412
    invoke-virtual {p0}, Lr44;->c()I

    .line 413
    .line 414
    .line 415
    move-result v4

    .line 416
    if-eq v4, v3, :cond_13

    .line 417
    .line 418
    if-ne v4, v1, :cond_12

    .line 419
    .line 420
    goto :goto_5

    .line 421
    :cond_12
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 422
    .line 423
    const-string p1, "Please begin an object before writing a name."

    .line 424
    .line 425
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 426
    .line 427
    .line 428
    throw p0

    .line 429
    :cond_13
    :goto_5
    iput-object v2, p0, Lr44;->n:Ljava/lang/String;

    .line 430
    .line 431
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 432
    .line 433
    .line 434
    move-result-object v0

    .line 435
    check-cast v0, Lb44;

    .line 436
    .line 437
    invoke-static {p0, v0}, Lo44;->r0(Lr44;Lb44;)V

    .line 438
    .line 439
    .line 440
    goto :goto_4

    .line 441
    :cond_14
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 442
    .line 443
    const-string p1, "Already wrote a name, expecting a value."

    .line 444
    .line 445
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 446
    .line 447
    .line 448
    throw p0

    .line 449
    :cond_15
    const/16 p1, 0x7d

    .line 450
    .line 451
    invoke-virtual {p0, v3, v1, p1}, Lr44;->a(IIC)V

    .line 452
    .line 453
    .line 454
    return-void

    .line 455
    :cond_16
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 456
    .line 457
    .line 458
    move-result-object p0

    .line 459
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 460
    .line 461
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 462
    .line 463
    .line 464
    move-result-object p0

    .line 465
    const-string v0, "Couldn\'t write "

    .line 466
    .line 467
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 468
    .line 469
    .line 470
    move-result-object p0

    .line 471
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 472
    .line 473
    .line 474
    throw p1

    .line 475
    :cond_17
    :goto_6
    iget-object p1, p0, Lr44;->n:Ljava/lang/String;

    .line 476
    .line 477
    if-eqz p1, :cond_18

    .line 478
    .line 479
    invoke-virtual {p0}, Lr44;->f()V

    .line 480
    .line 481
    .line 482
    :cond_18
    invoke-virtual {p0}, Lr44;->i()V

    .line 483
    .line 484
    .line 485
    invoke-virtual {v0, v1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 486
    .line 487
    .line 488
    return-void
.end method
