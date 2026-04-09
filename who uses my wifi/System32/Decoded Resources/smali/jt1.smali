.class public final Ljt1;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final a:Landroid/content/Context;

.field public b:Ljava/util/concurrent/ExecutorService;

.field public c:Ldalvik/system/DexClassLoader;

.field public d:Lfr;

.field public e:[B

.field public volatile f:Lk3;

.field public final g:Z

.field public volatile h:Lqr1;

.field public i:Ljava/util/concurrent/Future;

.field public j:Lvg0;

.field public k:Lqs1;

.field public l:Z

.field public final m:Ljava/util/HashMap;

.field public n:Z

.field public final o:Let1;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Ljt1;->f:Lk3;

    .line 6
    .line 7
    iput-object v0, p0, Ljt1;->h:Lqr1;

    .line 8
    .line 9
    iput-object v0, p0, Ljt1;->i:Ljava/util/concurrent/Future;

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    iput-boolean v0, p0, Ljt1;->l:Z

    .line 13
    .line 14
    iput-boolean v0, p0, Ljt1;->n:Z

    .line 15
    .line 16
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    const/4 v0, 0x1

    .line 23
    :cond_0
    iput-boolean v0, p0, Ljt1;->g:Z

    .line 24
    .line 25
    if-eqz v1, :cond_1

    .line 26
    .line 27
    move-object p1, v1

    .line 28
    :cond_1
    iput-object p1, p0, Ljt1;->a:Landroid/content/Context;

    .line 29
    .line 30
    new-instance v0, Ljava/util/HashMap;

    .line 31
    .line 32
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 33
    .line 34
    .line 35
    iput-object v0, p0, Ljt1;->m:Ljava/util/HashMap;

    .line 36
    .line 37
    iget-object v0, p0, Ljt1;->o:Let1;

    .line 38
    .line 39
    if-eqz v0, :cond_2

    .line 40
    .line 41
    return-void

    .line 42
    :cond_2
    new-instance v0, Let1;

    .line 43
    .line 44
    invoke-direct {v0, p1}, Let1;-><init>(Landroid/content/Context;)V

    .line 45
    .line 46
    .line 47
    iput-object v0, p0, Ljt1;->o:Let1;

    .line 48
    .line 49
    return-void
.end method

.method public static a(Landroid/content/Context;ZLvg0;)Ljt1;
    .locals 9

    .line 1
    const-string v0, "%s/%s.dex"

    .line 2
    .line 3
    const-string v1, "1754603592408"

    .line 4
    .line 5
    new-instance v2, Ljt1;

    .line 6
    .line 7
    invoke-direct {v2, p0}, Ljt1;-><init>(Landroid/content/Context;)V

    .line 8
    .line 9
    .line 10
    iget-object p0, v2, Ljt1;->a:Landroid/content/Context;

    .line 11
    .line 12
    :try_start_0
    new-instance v3, Lzc1;

    .line 13
    .line 14
    invoke-direct {v3}, Lzc1;-><init>()V

    .line 15
    .line 16
    .line 17
    invoke-static {v3}, Ljava/util/concurrent/Executors;->newCachedThreadPool(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    iput-object v3, v2, Ljt1;->b:Ljava/util/concurrent/ExecutorService;

    .line 22
    .line 23
    const/4 v4, 0x0

    .line 24
    if-eqz p1, :cond_0

    .line 25
    .line 26
    new-instance p1, Lit1;

    .line 27
    .line 28
    invoke-direct {p1, v2, v4}, Lit1;-><init>(Ljt1;I)V

    .line 29
    .line 30
    .line 31
    invoke-interface {v3, p1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 32
    .line 33
    .line 34
    :cond_0
    iget-object p1, v2, Ljt1;->b:Ljava/util/concurrent/ExecutorService;

    .line 35
    .line 36
    new-instance v3, Lit1;

    .line 37
    .line 38
    const/4 v5, 0x1

    .line 39
    invoke-direct {v3, v2, v5}, Lit1;-><init>(Ljt1;I)V

    .line 40
    .line 41
    .line 42
    invoke-interface {p1, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ldt1; {:try_start_0 .. :try_end_0} :catch_7

    .line 43
    .line 44
    .line 45
    :try_start_1
    sget-object p1, Lgz;->b:Lgz;

    .line 46
    .line 47
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    invoke-static {p0}, Lgz;->a(Landroid/content/Context;)I

    .line 51
    .line 52
    .line 53
    sget v3, Lgz;->a:I

    .line 54
    .line 55
    invoke-virtual {p1, p0, v3}, Lgz;->c(Landroid/content/Context;I)I

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    if-nez p1, :cond_1

    .line 60
    .line 61
    move p1, v5

    .line 62
    goto :goto_0

    .line 63
    :cond_1
    move p1, v4

    .line 64
    :goto_0
    iput-boolean p1, v2, Ljt1;->l:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 65
    .line 66
    :catchall_0
    if-eqz p2, :cond_2

    .line 67
    .line 68
    :try_start_2
    iput-object p2, v2, Ljt1;->j:Lvg0;

    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_2
    iget-boolean p1, v2, Ljt1;->l:Z

    .line 72
    .line 73
    if-nez p1, :cond_3

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_3
    iget-object p1, v2, Ljt1;->b:Ljava/util/concurrent/ExecutorService;

    .line 77
    .line 78
    new-instance p2, Lcd;

    .line 79
    .line 80
    const/4 v3, 0x5

    .line 81
    invoke-direct {p2, v2, v4, v3}, Lcd;-><init>(Ljava/lang/Object;II)V

    .line 82
    .line 83
    .line 84
    invoke-interface {p1, p2}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    iput-object p1, v2, Ljt1;->i:Ljava/util/concurrent/Future;

    .line 89
    .line 90
    :goto_1
    sget-object p1, Llt1;->a:[C

    .line 91
    .line 92
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 97
    .line 98
    .line 99
    move-result-object p2

    .line 100
    if-ne p1, p2, :cond_4

    .line 101
    .line 102
    move p1, v5

    .line 103
    goto :goto_2

    .line 104
    :cond_4
    move p1, v4

    .line 105
    :goto_2
    if-eqz p1, :cond_6

    .line 106
    .line 107
    sget-object p1, Lmz1;->G3:Liz1;

    .line 108
    .line 109
    sget-object p2, Ltw1;->e:Ltw1;

    .line 110
    .line 111
    iget-object p2, p2, Ltw1;->c:Lkz1;

    .line 112
    .line 113
    invoke-virtual {p2, p1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    check-cast p1, Ljava/lang/Boolean;

    .line 118
    .line 119
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 120
    .line 121
    .line 122
    move-result p1

    .line 123
    if-nez p1, :cond_5

    .line 124
    .line 125
    goto :goto_3

    .line 126
    :cond_5
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 127
    .line 128
    const-string p1, "Task Context initialization must not be called from the UI thread."

    .line 129
    .line 130
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    throw p0

    .line 134
    :cond_6
    :goto_3
    new-instance p1, Lfr;

    .line 135
    .line 136
    const/16 p2, 0x8

    .line 137
    .line 138
    invoke-direct {p1, p2}, Lfr;-><init>(I)V

    .line 139
    .line 140
    .line 141
    iput-object p1, v2, Ljt1;->d:Lfr;
    :try_end_2
    .catch Ldt1; {:try_start_2 .. :try_end_2} :catch_7

    .line 142
    .line 143
    :try_start_3
    const-string p1, "JcrU7fy5RNbMaDqzZNwiOwL0nfU2rS7VBZgzra8NDIE="
    :try_end_3
    .catch Lat1; {:try_start_3 .. :try_end_3} :catch_0
    .catch Ldt1; {:try_start_3 .. :try_end_3} :catch_7

    .line 144
    .line 145
    const/4 p2, 0x2

    .line 146
    :try_start_4
    invoke-static {p1, p2}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    .line 147
    .line 148
    .line 149
    move-result-object p2

    .line 150
    array-length v3, p2

    .line 151
    if-eqz v3, :cond_d

    .line 152
    .line 153
    array-length p1, p2

    .line 154
    const/16 v3, 0x20

    .line 155
    .line 156
    if-ne p1, v3, :cond_c

    .line 157
    .line 158
    const/4 p1, 0x4

    .line 159
    const/16 v3, 0x10

    .line 160
    .line 161
    invoke-static {p2, p1, v3}, Ljava/nio/ByteBuffer;->wrap([BII)Ljava/nio/ByteBuffer;

    .line 162
    .line 163
    .line 164
    move-result-object p1

    .line 165
    new-array p2, v3, [B

    .line 166
    .line 167
    invoke-virtual {p1, p2}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    .line 168
    .line 169
    .line 170
    move p1, v4

    .line 171
    :goto_4
    if-ge p1, v3, :cond_7

    .line 172
    .line 173
    aget-byte v6, p2, p1

    .line 174
    .line 175
    xor-int/lit8 v6, v6, 0x44

    .line 176
    .line 177
    int-to-byte v6, v6

    .line 178
    aput-byte v6, p2, p1
    :try_end_4
    .catch Ljava/lang/IllegalArgumentException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Lat1; {:try_start_4 .. :try_end_4} :catch_0
    .catch Ldt1; {:try_start_4 .. :try_end_4} :catch_7

    .line 179
    .line 180
    add-int/lit8 p1, p1, 0x1

    .line 181
    .line 182
    goto :goto_4

    .line 183
    :catch_0
    move-exception p0

    .line 184
    goto/16 :goto_c

    .line 185
    .line 186
    :catch_1
    move-exception p0

    .line 187
    goto/16 :goto_b

    .line 188
    .line 189
    :cond_7
    :try_start_5
    iput-object p2, v2, Ljt1;->e:[B
    :try_end_5
    .catch Lat1; {:try_start_5 .. :try_end_5} :catch_0
    .catch Ldt1; {:try_start_5 .. :try_end_5} :catch_7

    .line 190
    .line 191
    :try_start_6
    invoke-virtual {p0}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 192
    .line 193
    .line 194
    move-result-object p1

    .line 195
    if-nez p1, :cond_9

    .line 196
    .line 197
    const-string p1, "dex"

    .line 198
    .line 199
    invoke-virtual {p0, p1, v4}, Landroid/content/Context;->getDir(Ljava/lang/String;I)Ljava/io/File;

    .line 200
    .line 201
    .line 202
    move-result-object p1

    .line 203
    if-eqz p1, :cond_8

    .line 204
    .line 205
    goto :goto_5

    .line 206
    :cond_8
    new-instance p0, Ldt1;

    .line 207
    .line 208
    invoke-direct {p0}, Ljava/lang/Exception;-><init>()V

    .line 209
    .line 210
    .line 211
    throw p0

    .line 212
    :catch_2
    move-exception p0

    .line 213
    goto/16 :goto_7

    .line 214
    .line 215
    :catch_3
    move-exception p0

    .line 216
    goto/16 :goto_8

    .line 217
    .line 218
    :catch_4
    move-exception p0

    .line 219
    goto/16 :goto_9

    .line 220
    .line 221
    :catch_5
    move-exception p0

    .line 222
    goto/16 :goto_a

    .line 223
    .line 224
    :cond_9
    :goto_5
    const-string p2, "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"

    .line 225
    .line 226
    new-instance v3, Ljava/io/File;

    .line 227
    .line 228
    const-string v6, "%s/%s.jar"

    .line 229
    .line 230
    filled-new-array {p1, v1}, [Ljava/lang/Object;

    .line 231
    .line 232
    .line 233
    move-result-object v7

    .line 234
    invoke-static {v6, v7}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 235
    .line 236
    .line 237
    move-result-object v6

    .line 238
    invoke-direct {v3, v6}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 239
    .line 240
    .line 241
    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    .line 242
    .line 243
    .line 244
    move-result v6

    .line 245
    if-nez v6, :cond_b

    .line 246
    .line 247
    iget-object v6, v2, Ljt1;->d:Lfr;

    .line 248
    .line 249
    iget-object v7, v2, Ljt1;->e:[B

    .line 250
    .line 251
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 252
    .line 253
    .line 254
    invoke-static {p2, v7}, Lfr;->p(Ljava/lang/String;[B)[B

    .line 255
    .line 256
    .line 257
    move-result-object p2

    .line 258
    invoke-virtual {v3}, Ljava/io/File;->createNewFile()Z

    .line 259
    .line 260
    .line 261
    new-instance v6, Ljava/io/FileOutputStream;

    .line 262
    .line 263
    invoke-direct {v6, v3}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    .line 264
    .line 265
    .line 266
    sget v7, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 267
    .line 268
    const/16 v8, 0x21

    .line 269
    .line 270
    if-lt v7, v8, :cond_a

    .line 271
    .line 272
    invoke-virtual {v3}, Ljava/io/File;->setReadOnly()Z

    .line 273
    .line 274
    .line 275
    :cond_a
    array-length v7, p2

    .line 276
    invoke-virtual {v6, p2, v4, v7}, Ljava/io/FileOutputStream;->write([BII)V

    .line 277
    .line 278
    .line 279
    invoke-virtual {v6}, Ljava/io/FileOutputStream;->close()V

    .line 280
    .line 281
    .line 282
    :cond_b
    invoke-virtual {v2, p1}, Ljt1;->g(Ljava/io/File;)V
    :try_end_6
    .catch Ljava/io/FileNotFoundException; {:try_start_6 .. :try_end_6} :catch_5
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_4
    .catch Lat1; {:try_start_6 .. :try_end_6} :catch_3
    .catch Ljava/lang/NullPointerException; {:try_start_6 .. :try_end_6} :catch_2
    .catch Ldt1; {:try_start_6 .. :try_end_6} :catch_7

    .line 283
    .line 284
    .line 285
    :try_start_7
    new-instance p2, Ldalvik/system/DexClassLoader;

    .line 286
    .line 287
    invoke-virtual {v3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 288
    .line 289
    .line 290
    move-result-object v4

    .line 291
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 292
    .line 293
    .line 294
    move-result-object v6

    .line 295
    invoke-virtual {p0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 296
    .line 297
    .line 298
    move-result-object p0

    .line 299
    const/4 v7, 0x0

    .line 300
    invoke-direct {p2, v4, v6, v7, p0}, Ldalvik/system/DexClassLoader;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/ClassLoader;)V

    .line 301
    .line 302
    .line 303
    iput-object p2, v2, Ljt1;->c:Ldalvik/system/DexClassLoader;
    :try_end_7
    .catch Ljava/lang/SecurityException; {:try_start_7 .. :try_end_7} :catch_6
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 304
    .line 305
    :try_start_8
    invoke-static {v3}, Ljt1;->h(Ljava/io/File;)V

    .line 306
    .line 307
    .line 308
    invoke-virtual {v2, p1}, Ljt1;->f(Ljava/io/File;)V

    .line 309
    .line 310
    .line 311
    filled-new-array {p1, v1}, [Ljava/lang/Object;

    .line 312
    .line 313
    .line 314
    move-result-object p0

    .line 315
    invoke-static {v0, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 316
    .line 317
    .line 318
    move-result-object p0

    .line 319
    new-instance p1, Ljava/io/File;

    .line 320
    .line 321
    invoke-direct {p1, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 322
    .line 323
    .line 324
    invoke-static {p1}, Ljt1;->h(Ljava/io/File;)V
    :try_end_8
    .catch Ljava/io/FileNotFoundException; {:try_start_8 .. :try_end_8} :catch_5
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_4
    .catch Lat1; {:try_start_8 .. :try_end_8} :catch_3
    .catch Ljava/lang/NullPointerException; {:try_start_8 .. :try_end_8} :catch_2
    .catch Ldt1; {:try_start_8 .. :try_end_8} :catch_7

    .line 325
    .line 326
    .line 327
    :try_start_9
    new-instance p0, Lqs1;

    .line 328
    .line 329
    invoke-direct {p0, v2}, Lqs1;-><init>(Ljt1;)V

    .line 330
    .line 331
    .line 332
    iput-object p0, v2, Ljt1;->k:Lqs1;

    .line 333
    .line 334
    iput-boolean v5, v2, Ljt1;->n:Z
    :try_end_9
    .catch Ldt1; {:try_start_9 .. :try_end_9} :catch_7

    .line 335
    .line 336
    goto :goto_d

    .line 337
    :catchall_1
    move-exception p0

    .line 338
    goto :goto_6

    .line 339
    :catch_6
    move-exception p0

    .line 340
    :try_start_a
    new-instance p2, Ldt1;

    .line 341
    .line 342
    invoke-direct {p2, p0}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    .line 343
    .line 344
    .line 345
    throw p2
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_1

    .line 346
    :goto_6
    :try_start_b
    invoke-static {v3}, Ljt1;->h(Ljava/io/File;)V

    .line 347
    .line 348
    .line 349
    invoke-virtual {v2, p1}, Ljt1;->f(Ljava/io/File;)V

    .line 350
    .line 351
    .line 352
    filled-new-array {p1, v1}, [Ljava/lang/Object;

    .line 353
    .line 354
    .line 355
    move-result-object p1

    .line 356
    invoke-static {v0, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 357
    .line 358
    .line 359
    move-result-object p1

    .line 360
    new-instance p2, Ljava/io/File;

    .line 361
    .line 362
    invoke-direct {p2, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 363
    .line 364
    .line 365
    invoke-static {p2}, Ljt1;->h(Ljava/io/File;)V

    .line 366
    .line 367
    .line 368
    throw p0
    :try_end_b
    .catch Ljava/io/FileNotFoundException; {:try_start_b .. :try_end_b} :catch_5
    .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_4
    .catch Lat1; {:try_start_b .. :try_end_b} :catch_3
    .catch Ljava/lang/NullPointerException; {:try_start_b .. :try_end_b} :catch_2
    .catch Ldt1; {:try_start_b .. :try_end_b} :catch_7

    .line 369
    :goto_7
    :try_start_c
    new-instance p1, Ldt1;

    .line 370
    .line 371
    invoke-direct {p1, p0}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    .line 372
    .line 373
    .line 374
    throw p1

    .line 375
    :goto_8
    new-instance p1, Ldt1;

    .line 376
    .line 377
    invoke-direct {p1, p0}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    .line 378
    .line 379
    .line 380
    throw p1

    .line 381
    :goto_9
    new-instance p1, Ldt1;

    .line 382
    .line 383
    invoke-direct {p1, p0}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    .line 384
    .line 385
    .line 386
    throw p1

    .line 387
    :goto_a
    new-instance p1, Ldt1;

    .line 388
    .line 389
    invoke-direct {p1, p0}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    .line 390
    .line 391
    .line 392
    throw p1
    :try_end_c
    .catch Ldt1; {:try_start_c .. :try_end_c} :catch_7

    .line 393
    :cond_c
    :try_start_d
    new-instance p0, Lat1;

    .line 394
    .line 395
    invoke-direct {p0}, Ljava/lang/Exception;-><init>()V

    .line 396
    .line 397
    .line 398
    throw p0

    .line 399
    :cond_d
    const-string p0, "Unable to decode "

    .line 400
    .line 401
    invoke-virtual {p0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 402
    .line 403
    .line 404
    move-result-object p0

    .line 405
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 406
    .line 407
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 408
    .line 409
    .line 410
    throw p1
    :try_end_d
    .catch Ljava/lang/IllegalArgumentException; {:try_start_d .. :try_end_d} :catch_1
    .catch Lat1; {:try_start_d .. :try_end_d} :catch_0
    .catch Ldt1; {:try_start_d .. :try_end_d} :catch_7

    .line 411
    :goto_b
    :try_start_e
    new-instance p1, Lat1;

    .line 412
    .line 413
    invoke-direct {p1, p0}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    .line 414
    .line 415
    .line 416
    throw p1
    :try_end_e
    .catch Lat1; {:try_start_e .. :try_end_e} :catch_0
    .catch Ldt1; {:try_start_e .. :try_end_e} :catch_7

    .line 417
    :goto_c
    :try_start_f
    new-instance p1, Ldt1;

    .line 418
    .line 419
    invoke-direct {p1, p0}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    .line 420
    .line 421
    .line 422
    throw p1
    :try_end_f
    .catch Ldt1; {:try_start_f .. :try_end_f} :catch_7

    .line 423
    :catch_7
    :goto_d
    return-object v2
.end method

.method public static final h(Ljava/io/File;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/io/File;->exists()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    invoke-virtual {p0}, Ljava/io/File;->delete()Z

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final b()Lqr1;
    .locals 1

    .line 1
    iget-object v0, p0, Ljt1;->j:Lvg0;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v0, v0, Lvg0;->g:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Lar3;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0}, Lgp3;->isDone()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    :try_start_0
    iget-object v0, p0, Ljt1;->j:Lvg0;

    .line 18
    .line 19
    iget-object v0, v0, Lvg0;->g:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v0, Lar3;

    .line 22
    .line 23
    invoke-virtual {v0}, Lgp3;->get()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    check-cast v0, Lqr1;
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    .line 28
    .line 29
    return-object v0

    .line 30
    :catch_0
    invoke-static {}, Lqr1;->D0()Lqr1;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    return-object v0

    .line 35
    :cond_0
    invoke-static {}, Lqr1;->D0()Lqr1;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    return-object v0

    .line 40
    :cond_1
    iget-object v0, p0, Ljt1;->h:Lqr1;

    .line 41
    .line 42
    return-object v0
.end method

.method public final varargs c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;)V
    .locals 3

    .line 1
    new-instance v0, Landroid/util/Pair;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Ljt1;->m:Ljava/util/HashMap;

    .line 7
    .line 8
    invoke-virtual {v1, v0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    if-nez v2, :cond_0

    .line 13
    .line 14
    new-instance v2, Lgu1;

    .line 15
    .line 16
    invoke-direct {v2, p0, p1, p2, p3}, Lgu1;-><init>(Ljt1;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1, v0, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    :cond_0
    return-void
.end method

.method public final d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/reflect/Method;
    .locals 3

    .line 1
    new-instance v0, Landroid/util/Pair;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Ljt1;->m:Ljava/util/HashMap;

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    check-cast p1, Lgu1;

    .line 13
    .line 14
    if-nez p1, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    iget-object p2, p1, Lgu1;->d:Ljava/lang/reflect/Method;

    .line 18
    .line 19
    if-eqz p2, :cond_1

    .line 20
    .line 21
    iget-object p1, p1, Lgu1;->d:Ljava/lang/reflect/Method;

    .line 22
    .line 23
    return-object p1

    .line 24
    :cond_1
    :try_start_0
    iget-object p2, p1, Lgu1;->f:Ljava/util/concurrent/CountDownLatch;

    .line 25
    .line 26
    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 27
    .line 28
    const-wide/16 v1, 0x2

    .line 29
    .line 30
    invoke-virtual {p2, v1, v2, v0}, Ljava/util/concurrent/CountDownLatch;->await(JLjava/util/concurrent/TimeUnit;)Z

    .line 31
    .line 32
    .line 33
    move-result p2

    .line 34
    if-nez p2, :cond_2

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_2
    iget-object p1, p1, Lgu1;->d:Ljava/lang/reflect/Method;
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 38
    .line 39
    return-object p1

    .line 40
    :catch_0
    :goto_0
    const/4 p1, 0x0

    .line 41
    return-object p1
.end method

.method public final e()I
    .locals 2

    .line 1
    iget-object v0, p0, Ljt1;->k:Lqs1;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    sget-object v0, Lqs1;->c:Landroid/os/ConditionVariable;

    .line 6
    .line 7
    :try_start_0
    invoke-static {}, Ljava/util/concurrent/ThreadLocalRandom;->current()Ljava/util/concurrent/ThreadLocalRandom;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Ljava/util/concurrent/ThreadLocalRandom;->nextInt()I

    .line 12
    .line 13
    .line 14
    move-result v0
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 15
    return v0

    .line 16
    :catch_0
    sget-object v0, Lqs1;->e:Ljava/util/Random;

    .line 17
    .line 18
    if-nez v0, :cond_1

    .line 19
    .line 20
    const-class v0, Lqs1;

    .line 21
    .line 22
    monitor-enter v0

    .line 23
    :try_start_1
    sget-object v1, Lqs1;->e:Ljava/util/Random;

    .line 24
    .line 25
    if-nez v1, :cond_0

    .line 26
    .line 27
    new-instance v1, Ljava/util/Random;

    .line 28
    .line 29
    invoke-direct {v1}, Ljava/util/Random;-><init>()V

    .line 30
    .line 31
    .line 32
    sput-object v1, Lqs1;->e:Ljava/util/Random;

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :catchall_0
    move-exception v1

    .line 36
    goto :goto_1

    .line 37
    :cond_0
    :goto_0
    monitor-exit v0

    .line 38
    goto :goto_2

    .line 39
    :goto_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 40
    throw v1

    .line 41
    :cond_1
    :goto_2
    sget-object v0, Lqs1;->e:Ljava/util/Random;

    .line 42
    .line 43
    invoke-virtual {v0}, Ljava/util/Random;->nextInt()I

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    return v0

    .line 48
    :cond_2
    const/high16 v0, -0x80000000

    .line 49
    .line 50
    return v0
.end method

.method public final f(Ljava/io/File;)V
    .locals 9

    .line 1
    const-string v0, "test"

    .line 2
    .line 3
    new-instance v1, Ljava/io/File;

    .line 4
    .line 5
    const-string v2, "1754603592408"

    .line 6
    .line 7
    filled-new-array {p1, v2}, [Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    const-string v4, "%s/%s.tmp"

    .line 12
    .line 13
    invoke-static {v4, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    invoke-direct {v1, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    if-eqz v3, :cond_0

    .line 25
    .line 26
    goto/16 :goto_4

    .line 27
    .line 28
    :cond_0
    new-instance v3, Ljava/io/File;

    .line 29
    .line 30
    filled-new-array {p1, v2}, [Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    const-string v4, "%s/%s.dex"

    .line 35
    .line 36
    invoke-static {v4, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-direct {v3, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    if-eqz p1, :cond_6

    .line 48
    .line 49
    invoke-virtual {v3}, Ljava/io/File;->length()J

    .line 50
    .line 51
    .line 52
    move-result-wide v4

    .line 53
    const-wide/16 v6, 0x0

    .line 54
    .line 55
    cmp-long p1, v4, v6

    .line 56
    .line 57
    if-lez p1, :cond_6

    .line 58
    .line 59
    long-to-int p1, v4

    .line 60
    new-array p1, p1, [B

    .line 61
    .line 62
    const/4 v4, 0x0

    .line 63
    :try_start_0
    new-instance v5, Ljava/io/FileInputStream;

    .line 64
    .line 65
    invoke-direct {v5, v3}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_7
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_7
    .catch Lat1; {:try_start_0 .. :try_end_0} :catch_7
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 66
    .line 67
    .line 68
    :try_start_1
    invoke-virtual {v5, p1}, Ljava/io/FileInputStream;->read([B)I

    .line 69
    .line 70
    .line 71
    move-result v6
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_4
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_1 .. :try_end_1} :catch_4
    .catch Lat1; {:try_start_1 .. :try_end_1} :catch_4
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 72
    if-gtz v6, :cond_1

    .line 73
    .line 74
    :try_start_2
    invoke-virtual {v5}, Ljava/io/FileInputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    .line 75
    .line 76
    .line 77
    :catch_0
    invoke-static {v3}, Ljt1;->h(Ljava/io/File;)V

    .line 78
    .line 79
    .line 80
    return-void

    .line 81
    :cond_1
    :try_start_3
    sget-object v6, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 82
    .line 83
    invoke-virtual {v6, v0}, Ljava/io/PrintStream;->print(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    sget-object v6, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 87
    .line 88
    invoke-virtual {v6, v0}, Ljava/io/PrintStream;->print(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    sget-object v6, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 92
    .line 93
    invoke-virtual {v6, v0}, Ljava/io/PrintStream;->print(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    invoke-static {}, Lvr1;->F()Lur1;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    sget-object v6, Landroid/os/Build$VERSION;->SDK:Ljava/lang/String;

    .line 101
    .line 102
    invoke-virtual {v6}, Ljava/lang/String;->getBytes()[B

    .line 103
    .line 104
    .line 105
    move-result-object v6

    .line 106
    sget-object v7, La54;->g:Ly44;

    .line 107
    .line 108
    array-length v7, v6

    .line 109
    const/4 v8, 0x0

    .line 110
    invoke-static {v6, v8, v7}, La54;->n([BII)Ly44;

    .line 111
    .line 112
    .line 113
    move-result-object v6

    .line 114
    invoke-virtual {v0}, Ln54;->b()V

    .line 115
    .line 116
    .line 117
    iget-object v7, v0, Ln54;->g:Lp54;

    .line 118
    .line 119
    check-cast v7, Lvr1;

    .line 120
    .line 121
    invoke-virtual {v7, v6}, Lvr1;->J(Ly44;)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {v2}, Ljava/lang/String;->getBytes()[B

    .line 125
    .line 126
    .line 127
    move-result-object v2

    .line 128
    array-length v6, v2

    .line 129
    invoke-static {v2, v8, v6}, La54;->n([BII)Ly44;

    .line 130
    .line 131
    .line 132
    move-result-object v2

    .line 133
    invoke-virtual {v0}, Ln54;->b()V

    .line 134
    .line 135
    .line 136
    iget-object v6, v0, Ln54;->g:Lp54;

    .line 137
    .line 138
    check-cast v6, Lvr1;

    .line 139
    .line 140
    invoke-virtual {v6, v2}, Lvr1;->I(La54;)V

    .line 141
    .line 142
    .line 143
    iget-object v2, p0, Ljt1;->d:Lfr;

    .line 144
    .line 145
    iget-object v6, p0, Ljt1;->e:[B

    .line 146
    .line 147
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 148
    .line 149
    .line 150
    invoke-static {v6, p1}, Lfr;->n([B[B)Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object p1

    .line 154
    invoke-virtual {p1}, Ljava/lang/String;->getBytes()[B

    .line 155
    .line 156
    .line 157
    move-result-object p1

    .line 158
    array-length v2, p1

    .line 159
    invoke-static {p1, v8, v2}, La54;->n([BII)Ly44;

    .line 160
    .line 161
    .line 162
    move-result-object v2

    .line 163
    invoke-virtual {v0, v2}, Lur1;->g(Ly44;)V

    .line 164
    .line 165
    .line 166
    invoke-static {p1}, Lhs1;->c([B)[B

    .line 167
    .line 168
    .line 169
    move-result-object p1

    .line 170
    array-length v2, p1

    .line 171
    invoke-static {p1, v8, v2}, La54;->n([BII)Ly44;

    .line 172
    .line 173
    .line 174
    move-result-object p1

    .line 175
    invoke-virtual {v0, p1}, Lur1;->h(Ly44;)V

    .line 176
    .line 177
    .line 178
    invoke-virtual {v1}, Ljava/io/File;->createNewFile()Z

    .line 179
    .line 180
    .line 181
    new-instance p1, Ljava/io/FileOutputStream;

    .line 182
    .line 183
    invoke-direct {p1, v1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_4
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_3 .. :try_end_3} :catch_4
    .catch Lat1; {:try_start_3 .. :try_end_3} :catch_4
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 184
    .line 185
    .line 186
    :try_start_4
    invoke-virtual {v0}, Ln54;->d()Lp54;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    check-cast v0, Lvr1;

    .line 191
    .line 192
    invoke-virtual {v0}, Ls44;->b()[B

    .line 193
    .line 194
    .line 195
    move-result-object v0

    .line 196
    array-length v1, v0

    .line 197
    invoke-virtual {p1, v0, v8, v1}, Ljava/io/FileOutputStream;->write([BII)V

    .line 198
    .line 199
    .line 200
    invoke-virtual {p1}, Ljava/io/FileOutputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_4 .. :try_end_4} :catch_3
    .catch Lat1; {:try_start_4 .. :try_end_4} :catch_3
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 201
    .line 202
    .line 203
    :try_start_5
    invoke-virtual {v5}, Ljava/io/FileInputStream;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_1

    .line 204
    .line 205
    .line 206
    :catch_1
    :try_start_6
    invoke-virtual {p1}, Ljava/io/FileOutputStream;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_2

    .line 207
    .line 208
    .line 209
    :catch_2
    invoke-static {v3}, Ljt1;->h(Ljava/io/File;)V

    .line 210
    .line 211
    .line 212
    return-void

    .line 213
    :catchall_0
    move-exception v0

    .line 214
    :goto_0
    move-object v4, v5

    .line 215
    goto :goto_2

    .line 216
    :catch_3
    :goto_1
    move-object v4, v5

    .line 217
    goto :goto_3

    .line 218
    :catchall_1
    move-exception p1

    .line 219
    move-object v0, p1

    .line 220
    move-object p1, v4

    .line 221
    goto :goto_0

    .line 222
    :catch_4
    move-object p1, v4

    .line 223
    goto :goto_1

    .line 224
    :catchall_2
    move-exception p1

    .line 225
    move-object v0, p1

    .line 226
    move-object p1, v4

    .line 227
    :goto_2
    if-eqz v4, :cond_2

    .line 228
    .line 229
    :try_start_7
    invoke-virtual {v4}, Ljava/io/FileInputStream;->close()V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_5

    .line 230
    .line 231
    .line 232
    :catch_5
    :cond_2
    if-eqz p1, :cond_3

    .line 233
    .line 234
    :try_start_8
    invoke-virtual {p1}, Ljava/io/FileOutputStream;->close()V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_6

    .line 235
    .line 236
    .line 237
    :catch_6
    :cond_3
    invoke-static {v3}, Ljt1;->h(Ljava/io/File;)V

    .line 238
    .line 239
    .line 240
    throw v0

    .line 241
    :catch_7
    move-object p1, v4

    .line 242
    :goto_3
    if-eqz v4, :cond_4

    .line 243
    .line 244
    :try_start_9
    invoke-virtual {v4}, Ljava/io/FileInputStream;->close()V
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_8

    .line 245
    .line 246
    .line 247
    :catch_8
    :cond_4
    if-eqz p1, :cond_5

    .line 248
    .line 249
    :try_start_a
    invoke-virtual {p1}, Ljava/io/FileOutputStream;->close()V
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_9

    .line 250
    .line 251
    .line 252
    :catch_9
    :cond_5
    invoke-static {v3}, Ljt1;->h(Ljava/io/File;)V

    .line 253
    .line 254
    .line 255
    :cond_6
    :goto_4
    return-void
.end method

.method public final g(Ljava/io/File;)V
    .locals 7

    .line 1
    new-instance v0, Ljava/io/File;

    .line 2
    .line 3
    const-string v1, "1754603592408"

    .line 4
    .line 5
    filled-new-array {p1, v1}, [Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    const-string v3, "%s/%s.tmp"

    .line 10
    .line 11
    invoke-static {v3, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-direct {v0, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-nez v2, :cond_0

    .line 23
    .line 24
    goto/16 :goto_7

    .line 25
    .line 26
    :cond_0
    new-instance v2, Ljava/io/File;

    .line 27
    .line 28
    filled-new-array {p1, v1}, [Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    const-string v3, "%s/%s.dex"

    .line 33
    .line 34
    invoke-static {v3, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-direct {v2, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    if-nez p1, :cond_8

    .line 46
    .line 47
    const/4 p1, 0x0

    .line 48
    :try_start_0
    invoke-virtual {v0}, Ljava/io/File;->length()J

    .line 49
    .line 50
    .line 51
    move-result-wide v3

    .line 52
    const-wide/16 v5, 0x0

    .line 53
    .line 54
    cmp-long v5, v3, v5

    .line 55
    .line 56
    if-gtz v5, :cond_1

    .line 57
    .line 58
    invoke-static {v0}, Ljt1;->h(Ljava/io/File;)V

    .line 59
    .line 60
    .line 61
    return-void

    .line 62
    :catchall_0
    move-exception v0

    .line 63
    goto/16 :goto_4

    .line 64
    .line 65
    :cond_1
    long-to-int v3, v3

    .line 66
    new-array v3, v3, [B

    .line 67
    .line 68
    new-instance v4, Ljava/io/FileInputStream;

    .line 69
    .line 70
    invoke-direct {v4, v0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_9
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_9
    .catch Lat1; {:try_start_0 .. :try_end_0} :catch_9
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 71
    .line 72
    .line 73
    :try_start_1
    invoke-virtual {v4, v3}, Ljava/io/FileInputStream;->read([B)I

    .line 74
    .line 75
    .line 76
    move-result v5

    .line 77
    if-gtz v5, :cond_2

    .line 78
    .line 79
    invoke-static {v0}, Ljt1;->h(Ljava/io/File;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_6
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_1 .. :try_end_1} :catch_6
    .catch Lat1; {:try_start_1 .. :try_end_1} :catch_6
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 80
    .line 81
    .line 82
    :try_start_2
    invoke-virtual {v4}, Ljava/io/FileInputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    .line 83
    .line 84
    .line 85
    :catch_0
    return-void

    .line 86
    :catchall_1
    move-exception v0

    .line 87
    goto/16 :goto_3

    .line 88
    .line 89
    :cond_2
    :try_start_3
    sget-object v5, Lh54;->a:Lh54;

    .line 90
    .line 91
    sget v5, Lu44;->a:I

    .line 92
    .line 93
    sget-object v5, Lh54;->b:Lh54;

    .line 94
    .line 95
    invoke-static {v3, v5}, Lvr1;->E([BLh54;)Lvr1;

    .line 96
    .line 97
    .line 98
    move-result-object v3
    :try_end_3
    .catch Ljava/lang/NullPointerException; {:try_start_3 .. :try_end_3} :catch_5
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_6
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_3 .. :try_end_3} :catch_6
    .catch Lat1; {:try_start_3 .. :try_end_3} :catch_6
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 99
    :try_start_4
    new-instance v5, Ljava/lang/String;

    .line 100
    .line 101
    invoke-virtual {v3}, Lvr1;->C()La54;

    .line 102
    .line 103
    .line 104
    move-result-object v6

    .line 105
    invoke-virtual {v6}, La54;->p()[B

    .line 106
    .line 107
    .line 108
    move-result-object v6

    .line 109
    invoke-direct {v5, v6}, Ljava/lang/String;-><init>([B)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    move-result v1

    .line 116
    if-eqz v1, :cond_4

    .line 117
    .line 118
    invoke-virtual {v3}, Lvr1;->B()La54;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    invoke-virtual {v1}, La54;->p()[B

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    invoke-virtual {v3}, Lvr1;->A()La54;

    .line 127
    .line 128
    .line 129
    move-result-object v5

    .line 130
    invoke-virtual {v5}, La54;->p()[B

    .line 131
    .line 132
    .line 133
    move-result-object v5

    .line 134
    invoke-static {v5}, Lhs1;->c([B)[B

    .line 135
    .line 136
    .line 137
    move-result-object v5

    .line 138
    invoke-static {v1, v5}, Ljava/util/Arrays;->equals([B[B)Z

    .line 139
    .line 140
    .line 141
    move-result v1

    .line 142
    if-eqz v1, :cond_4

    .line 143
    .line 144
    invoke-virtual {v3}, Lvr1;->D()La54;

    .line 145
    .line 146
    .line 147
    move-result-object v1

    .line 148
    invoke-virtual {v1}, La54;->p()[B

    .line 149
    .line 150
    .line 151
    move-result-object v1

    .line 152
    sget-object v5, Landroid/os/Build$VERSION;->SDK:Ljava/lang/String;

    .line 153
    .line 154
    invoke-virtual {v5}, Ljava/lang/String;->getBytes()[B

    .line 155
    .line 156
    .line 157
    move-result-object v5

    .line 158
    invoke-static {v1, v5}, Ljava/util/Arrays;->equals([B[B)Z

    .line 159
    .line 160
    .line 161
    move-result v1

    .line 162
    if-nez v1, :cond_3

    .line 163
    .line 164
    goto :goto_2

    .line 165
    :cond_3
    iget-object v0, p0, Ljt1;->d:Lfr;

    .line 166
    .line 167
    iget-object v1, p0, Ljt1;->e:[B

    .line 168
    .line 169
    new-instance v5, Ljava/lang/String;

    .line 170
    .line 171
    invoke-virtual {v3}, Lvr1;->A()La54;

    .line 172
    .line 173
    .line 174
    move-result-object v3

    .line 175
    invoke-virtual {v3}, La54;->p()[B

    .line 176
    .line 177
    .line 178
    move-result-object v3

    .line 179
    invoke-direct {v5, v3}, Ljava/lang/String;-><init>([B)V

    .line 180
    .line 181
    .line 182
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 183
    .line 184
    .line 185
    invoke-static {v5, v1}, Lfr;->p(Ljava/lang/String;[B)[B

    .line 186
    .line 187
    .line 188
    move-result-object v0

    .line 189
    invoke-virtual {v2}, Ljava/io/File;->createNewFile()Z

    .line 190
    .line 191
    .line 192
    new-instance v1, Ljava/io/FileOutputStream;

    .line 193
    .line 194
    invoke-direct {v1, v2}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_6
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_4 .. :try_end_4} :catch_6
    .catch Lat1; {:try_start_4 .. :try_end_4} :catch_6
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 195
    .line 196
    .line 197
    :try_start_5
    array-length p1, v0

    .line 198
    const/4 v2, 0x0

    .line 199
    invoke-virtual {v1, v0, v2, p1}, Ljava/io/FileOutputStream;->write([BII)V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_3
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_5 .. :try_end_5} :catch_3
    .catch Lat1; {:try_start_5 .. :try_end_5} :catch_3
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 200
    .line 201
    .line 202
    :try_start_6
    invoke-virtual {v4}, Ljava/io/FileInputStream;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_1

    .line 203
    .line 204
    .line 205
    :catch_1
    :try_start_7
    invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_2

    .line 206
    .line 207
    .line 208
    :catch_2
    return-void

    .line 209
    :catchall_2
    move-exception p1

    .line 210
    move-object v0, p1

    .line 211
    :goto_0
    move-object p1, v4

    .line 212
    goto :goto_5

    .line 213
    :catch_3
    :goto_1
    move-object p1, v4

    .line 214
    goto :goto_6

    .line 215
    :cond_4
    :goto_2
    :try_start_8
    invoke-static {v0}, Ljt1;->h(Ljava/io/File;)V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_6
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_8 .. :try_end_8} :catch_6
    .catch Lat1; {:try_start_8 .. :try_end_8} :catch_6
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    .line 216
    .line 217
    .line 218
    :try_start_9
    invoke-virtual {v4}, Ljava/io/FileInputStream;->close()V
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_4

    .line 219
    .line 220
    .line 221
    :catch_4
    return-void

    .line 222
    :catch_5
    :try_start_a
    invoke-virtual {v4}, Ljava/io/FileInputStream;->close()V
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_b

    .line 223
    .line 224
    .line 225
    goto :goto_7

    .line 226
    :goto_3
    move-object v1, p1

    .line 227
    goto :goto_0

    .line 228
    :catch_6
    move-object v1, p1

    .line 229
    goto :goto_1

    .line 230
    :goto_4
    move-object v1, p1

    .line 231
    :goto_5
    if-eqz p1, :cond_5

    .line 232
    .line 233
    :try_start_b
    invoke-virtual {p1}, Ljava/io/FileInputStream;->close()V
    :try_end_b
    .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_7

    .line 234
    .line 235
    .line 236
    :catch_7
    :cond_5
    if-eqz v1, :cond_6

    .line 237
    .line 238
    :try_start_c
    invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V
    :try_end_c
    .catch Ljava/io/IOException; {:try_start_c .. :try_end_c} :catch_8

    .line 239
    .line 240
    .line 241
    :catch_8
    :cond_6
    throw v0

    .line 242
    :catch_9
    move-object v1, p1

    .line 243
    :goto_6
    if-eqz p1, :cond_7

    .line 244
    .line 245
    :try_start_d
    invoke-virtual {p1}, Ljava/io/FileInputStream;->close()V
    :try_end_d
    .catch Ljava/io/IOException; {:try_start_d .. :try_end_d} :catch_a

    .line 246
    .line 247
    .line 248
    :catch_a
    :cond_7
    if-eqz v1, :cond_8

    .line 249
    .line 250
    :try_start_e
    invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V
    :try_end_e
    .catch Ljava/io/IOException; {:try_start_e .. :try_end_e} :catch_b

    .line 251
    .line 252
    .line 253
    :catch_b
    :cond_8
    :goto_7
    return-void
.end method
