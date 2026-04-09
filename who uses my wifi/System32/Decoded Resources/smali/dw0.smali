.class public final synthetic Ldw0;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ljava/util/function/Function;


# instance fields
.field public final synthetic a:Lew0;

.field public final synthetic b:I

.field public final synthetic c:Lme0;

.field public final synthetic d:Z

.field public final synthetic e:Ljava/util/concurrent/Executor;


# direct methods
.method public synthetic constructor <init>(Lew0;ILme0;ZLjava/util/concurrent/Executor;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ldw0;->a:Lew0;

    .line 5
    .line 6
    iput p2, p0, Ldw0;->b:I

    .line 7
    .line 8
    iput-object p3, p0, Ldw0;->c:Lme0;

    .line 9
    .line 10
    iput-boolean p4, p0, Ldw0;->d:Z

    .line 11
    .line 12
    iput-object p5, p0, Ldw0;->e:Ljava/util/concurrent/Executor;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    check-cast p1, [B

    .line 2
    .line 3
    new-instance v0, Ljava/util/concurrent/CompletableFuture;

    .line 4
    .line 5
    invoke-direct {v0}, Ljava/util/concurrent/CompletableFuture;-><init>()V

    .line 6
    .line 7
    .line 8
    array-length v1, p1

    .line 9
    const/16 v2, 0xc

    .line 10
    .line 11
    if-ge v1, v2, :cond_0

    .line 12
    .line 13
    new-instance p1, Lt91;

    .line 14
    .line 15
    const-string v1, "invalid DNS header - too short"

    .line 16
    .line 17
    invoke-direct {p1, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, p1}, Ljava/util/concurrent/CompletableFuture;->completeExceptionally(Ljava/lang/Throwable;)Z

    .line 21
    .line 22
    .line 23
    return-object v0

    .line 24
    :cond_0
    const/4 v1, 0x0

    .line 25
    aget-byte v1, p1, v1

    .line 26
    .line 27
    and-int/lit16 v1, v1, 0xff

    .line 28
    .line 29
    shl-int/lit8 v1, v1, 0x8

    .line 30
    .line 31
    const/4 v2, 0x1

    .line 32
    aget-byte v3, p1, v2

    .line 33
    .line 34
    and-int/lit16 v3, v3, 0xff

    .line 35
    .line 36
    add-int/2addr v1, v3

    .line 37
    iget v3, p0, Ldw0;->b:I

    .line 38
    .line 39
    if-eq v1, v3, :cond_1

    .line 40
    .line 41
    new-instance p1, Lt91;

    .line 42
    .line 43
    new-instance v2, Ljava/lang/StringBuilder;

    .line 44
    .line 45
    const-string v4, "invalid message id: expected "

    .line 46
    .line 47
    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const-string v3, "; got id "

    .line 54
    .line 55
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    invoke-direct {p1, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0, p1}, Ljava/util/concurrent/CompletableFuture;->completeExceptionally(Ljava/lang/Throwable;)Z

    .line 69
    .line 70
    .line 71
    return-object v0

    .line 72
    :cond_1
    :try_start_0
    new-instance v1, Lme0;

    .line 73
    .line 74
    invoke-direct {v1, p1}, Lme0;-><init>([B)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 75
    .line 76
    .line 77
    iget-object p1, p0, Ldw0;->c:Lme0;

    .line 78
    .line 79
    iget-object v4, p1, Lme0;->f:Ll00;

    .line 80
    .line 81
    invoke-virtual {v4}, Ll00;->d()I

    .line 82
    .line 83
    .line 84
    move-result v4

    .line 85
    const/4 v5, 0x5

    .line 86
    if-ne v4, v5, :cond_2

    .line 87
    .line 88
    iget-object v4, v1, Lme0;->f:Ll00;

    .line 89
    .line 90
    invoke-virtual {v4}, Ll00;->d()I

    .line 91
    .line 92
    .line 93
    move-result v4

    .line 94
    if-eq v4, v5, :cond_6

    .line 95
    .line 96
    new-instance p1, Lt91;

    .line 97
    .line 98
    const-string v1, "invalid message: opcode response is not UPDATE"

    .line 99
    .line 100
    invoke-direct {p1, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v0, p1}, Ljava/util/concurrent/CompletableFuture;->completeExceptionally(Ljava/lang/Throwable;)Z

    .line 104
    .line 105
    .line 106
    return-object v0

    .line 107
    :cond_2
    invoke-virtual {v1}, Lme0;->e()Ltn0;

    .line 108
    .line 109
    .line 110
    move-result-object v4

    .line 111
    if-nez v4, :cond_3

    .line 112
    .line 113
    new-instance p1, Lt91;

    .line 114
    .line 115
    const-string v1, "invalid message: question section missing"

    .line 116
    .line 117
    invoke-direct {p1, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {v0, p1}, Ljava/util/concurrent/CompletableFuture;->completeExceptionally(Ljava/lang/Throwable;)Z

    .line 121
    .line 122
    .line 123
    return-object v0

    .line 124
    :cond_3
    invoke-virtual {p1}, Lme0;->e()Ltn0;

    .line 125
    .line 126
    .line 127
    move-result-object v4

    .line 128
    iget-object v4, v4, Ltn0;->f:Lgg0;

    .line 129
    .line 130
    invoke-virtual {v1}, Lme0;->e()Ltn0;

    .line 131
    .line 132
    .line 133
    move-result-object v5

    .line 134
    iget-object v5, v5, Ltn0;->f:Lgg0;

    .line 135
    .line 136
    invoke-virtual {v4, v5}, Lgg0;->equals(Ljava/lang/Object;)Z

    .line 137
    .line 138
    .line 139
    move-result v4

    .line 140
    const-string v5, "; got "

    .line 141
    .line 142
    if-nez v4, :cond_4

    .line 143
    .line 144
    new-instance v2, Lt91;

    .line 145
    .line 146
    new-instance v3, Ljava/lang/StringBuilder;

    .line 147
    .line 148
    const-string v4, "invalid name in message: expected "

    .line 149
    .line 150
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {p1}, Lme0;->e()Ltn0;

    .line 154
    .line 155
    .line 156
    move-result-object p1

    .line 157
    iget-object p1, p1, Ltn0;->f:Lgg0;

    .line 158
    .line 159
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 160
    .line 161
    .line 162
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 163
    .line 164
    .line 165
    invoke-virtual {v1}, Lme0;->e()Ltn0;

    .line 166
    .line 167
    .line 168
    move-result-object p1

    .line 169
    iget-object p1, p1, Ltn0;->f:Lgg0;

    .line 170
    .line 171
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 172
    .line 173
    .line 174
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object p1

    .line 178
    invoke-direct {v2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 179
    .line 180
    .line 181
    invoke-virtual {v0, v2}, Ljava/util/concurrent/CompletableFuture;->completeExceptionally(Ljava/lang/Throwable;)Z

    .line 182
    .line 183
    .line 184
    return-object v0

    .line 185
    :cond_4
    invoke-virtual {p1}, Lme0;->e()Ltn0;

    .line 186
    .line 187
    .line 188
    move-result-object v4

    .line 189
    iget v4, v4, Ltn0;->h:I

    .line 190
    .line 191
    invoke-virtual {v1}, Lme0;->e()Ltn0;

    .line 192
    .line 193
    .line 194
    move-result-object v6

    .line 195
    iget v6, v6, Ltn0;->h:I

    .line 196
    .line 197
    if-eq v4, v6, :cond_5

    .line 198
    .line 199
    new-instance v2, Lt91;

    .line 200
    .line 201
    new-instance v3, Ljava/lang/StringBuilder;

    .line 202
    .line 203
    const-string v4, "invalid class in message: expected "

    .line 204
    .line 205
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 206
    .line 207
    .line 208
    invoke-virtual {p1}, Lme0;->e()Ltn0;

    .line 209
    .line 210
    .line 211
    move-result-object p1

    .line 212
    iget p1, p1, Ltn0;->h:I

    .line 213
    .line 214
    sget-object v4, Lyl;->a:Lxl;

    .line 215
    .line 216
    invoke-virtual {v4, p1}, Lue0;->e(I)Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    move-result-object p1

    .line 220
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 221
    .line 222
    .line 223
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 224
    .line 225
    .line 226
    invoke-virtual {v1}, Lme0;->e()Ltn0;

    .line 227
    .line 228
    .line 229
    move-result-object p1

    .line 230
    iget p1, p1, Ltn0;->h:I

    .line 231
    .line 232
    invoke-virtual {v4, p1}, Lue0;->e(I)Ljava/lang/String;

    .line 233
    .line 234
    .line 235
    move-result-object p1

    .line 236
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 237
    .line 238
    .line 239
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 240
    .line 241
    .line 242
    move-result-object p1

    .line 243
    invoke-direct {v2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 244
    .line 245
    .line 246
    invoke-virtual {v0, v2}, Ljava/util/concurrent/CompletableFuture;->completeExceptionally(Ljava/lang/Throwable;)Z

    .line 247
    .line 248
    .line 249
    return-object v0

    .line 250
    :cond_5
    invoke-virtual {p1}, Lme0;->e()Ltn0;

    .line 251
    .line 252
    .line 253
    move-result-object v4

    .line 254
    iget v4, v4, Ltn0;->g:I

    .line 255
    .line 256
    invoke-virtual {v1}, Lme0;->e()Ltn0;

    .line 257
    .line 258
    .line 259
    move-result-object v6

    .line 260
    iget v6, v6, Ltn0;->g:I

    .line 261
    .line 262
    if-eq v4, v6, :cond_6

    .line 263
    .line 264
    new-instance v2, Lt91;

    .line 265
    .line 266
    new-instance v3, Ljava/lang/StringBuilder;

    .line 267
    .line 268
    const-string v4, "invalid type in message: expected "

    .line 269
    .line 270
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 271
    .line 272
    .line 273
    invoke-virtual {p1}, Lme0;->e()Ltn0;

    .line 274
    .line 275
    .line 276
    move-result-object p1

    .line 277
    iget p1, p1, Ltn0;->g:I

    .line 278
    .line 279
    sget-object v4, Lk31;->a:Lbs0;

    .line 280
    .line 281
    invoke-virtual {v4, p1}, Lue0;->e(I)Ljava/lang/String;

    .line 282
    .line 283
    .line 284
    move-result-object p1

    .line 285
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 286
    .line 287
    .line 288
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 289
    .line 290
    .line 291
    invoke-virtual {v1}, Lme0;->e()Ltn0;

    .line 292
    .line 293
    .line 294
    move-result-object p1

    .line 295
    iget p1, p1, Ltn0;->g:I

    .line 296
    .line 297
    invoke-virtual {v4, p1}, Lue0;->e(I)Ljava/lang/String;

    .line 298
    .line 299
    .line 300
    move-result-object p1

    .line 301
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 302
    .line 303
    .line 304
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 305
    .line 306
    .line 307
    move-result-object p1

    .line 308
    invoke-direct {v2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 309
    .line 310
    .line 311
    invoke-virtual {v0, v2}, Ljava/util/concurrent/CompletableFuture;->completeExceptionally(Ljava/lang/Throwable;)Z

    .line 312
    .line 313
    .line 314
    return-object v0

    .line 315
    :cond_6
    iget-boolean v4, p0, Ldw0;->d:Z

    .line 316
    .line 317
    if-nez v4, :cond_8

    .line 318
    .line 319
    iget-object v4, v1, Lme0;->f:Ll00;

    .line 320
    .line 321
    const/4 v5, 0x6

    .line 322
    iget v4, v4, Ll00;->g:I

    .line 323
    .line 324
    invoke-static {v4, v5}, Ll00;->c(II)Z

    .line 325
    .line 326
    .line 327
    move-result v4

    .line 328
    if-eqz v4, :cond_8

    .line 329
    .line 330
    sget-object v0, Lew0;->e:Li80;

    .line 331
    .line 332
    invoke-interface {v0}, Li80;->s()Z

    .line 333
    .line 334
    .line 335
    move-result v4

    .line 336
    if-eqz v4, :cond_7

    .line 337
    .line 338
    const-string v4, "Got truncated response for id {}, retrying via TCP, response:\n{}"

    .line 339
    .line 340
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 341
    .line 342
    .line 343
    move-result-object v3

    .line 344
    invoke-interface {v0, v4, v3, v1}, Li80;->j(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 345
    .line 346
    .line 347
    goto :goto_0

    .line 348
    :cond_7
    const-string v1, "Got truncated response for id {}, retrying via TCP"

    .line 349
    .line 350
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 351
    .line 352
    .line 353
    move-result-object v3

    .line 354
    invoke-interface {v0, v3, v1}, Li80;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 355
    .line 356
    .line 357
    :goto_0
    iget-object v0, p0, Ldw0;->a:Lew0;

    .line 358
    .line 359
    iget-object v1, p0, Ldw0;->e:Ljava/util/concurrent/Executor;

    .line 360
    .line 361
    invoke-virtual {v0, p1, v2, v1}, Lew0;->e(Lme0;ZLjava/util/concurrent/Executor;)Ljava/util/concurrent/CompletableFuture;

    .line 362
    .line 363
    .line 364
    move-result-object p1

    .line 365
    return-object p1

    .line 366
    :cond_8
    invoke-virtual {v0, v1}, Ljava/util/concurrent/CompletableFuture;->complete(Ljava/lang/Object;)Z

    .line 367
    .line 368
    .line 369
    return-object v0

    .line 370
    :catch_0
    move-exception p1

    .line 371
    :try_start_1
    instance-of v1, p1, Lt91;

    .line 372
    .line 373
    if-nez v1, :cond_9

    .line 374
    .line 375
    new-instance v1, Lt91;

    .line 376
    .line 377
    const-string v2, "Error parsing message"

    .line 378
    .line 379
    invoke-direct {v1, v2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 380
    .line 381
    .line 382
    throw v1

    .line 383
    :cond_9
    check-cast p1, Lt91;

    .line 384
    .line 385
    throw p1
    :try_end_1
    .catch Lt91; {:try_start_1 .. :try_end_1} :catch_1

    .line 386
    :catch_1
    move-exception p1

    .line 387
    invoke-virtual {v0, p1}, Ljava/util/concurrent/CompletableFuture;->completeExceptionally(Ljava/lang/Throwable;)Z

    .line 388
    .line 389
    .line 390
    return-object v0
.end method
