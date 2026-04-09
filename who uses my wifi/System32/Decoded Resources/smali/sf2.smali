.class public final Lsf2;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lws3;
.implements Lbd4;


# static fields
.field public static final A:Ljava/util/concurrent/atomic/AtomicInteger;

.field public static final z:Ljava/util/concurrent/atomic/AtomicInteger;


# instance fields
.field public final f:Landroid/content/Context;

.field public final g:Lmf2;

.field public final h:Llj4;

.field public final i:Lje2;

.field public final j:Ljava/lang/ref/WeakReference;

.field public final k:Lr2;

.field public l:Lmc4;

.field public m:Ljava/nio/ByteBuffer;

.field public n:Z

.field public o:Lfe2;

.field public p:I

.field public q:I

.field public r:J

.field public final s:Ljava/lang/String;

.field public final t:I

.field public final u:Ljava/lang/Object;

.field public v:Ljava/lang/Integer;

.field public final w:Ljava/util/ArrayList;

.field public volatile x:Lnf2;

.field public final y:Ljava/util/HashSet;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lsf2;->z:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 8
    .line 9
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 10
    .line 11
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lsf2;->A:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 15
    .line 16
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lje2;Lag2;Ljava/lang/Integer;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/Object;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lsf2;->u:Ljava/lang/Object;

    .line 10
    .line 11
    new-instance v0, Ljava/util/HashSet;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lsf2;->y:Ljava/util/HashSet;

    .line 17
    .line 18
    iput-object p1, p0, Lsf2;->f:Landroid/content/Context;

    .line 19
    .line 20
    iput-object p2, p0, Lsf2;->i:Lje2;

    .line 21
    .line 22
    iput-object p4, p0, Lsf2;->v:Ljava/lang/Integer;

    .line 23
    .line 24
    new-instance p4, Ljava/lang/ref/WeakReference;

    .line 25
    .line 26
    invoke-direct {p4, p3}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    iput-object p4, p0, Lsf2;->j:Ljava/lang/ref/WeakReference;

    .line 30
    .line 31
    new-instance p4, Lmf2;

    .line 32
    .line 33
    invoke-direct {p4}, Lmf2;-><init>()V

    .line 34
    .line 35
    .line 36
    iput-object p4, p0, Lsf2;->g:Lmf2;

    .line 37
    .line 38
    new-instance v0, Llj4;

    .line 39
    .line 40
    invoke-direct {v0, p1}, Llj4;-><init>(Landroid/content/Context;)V

    .line 41
    .line 42
    .line 43
    iput-object v0, p0, Lsf2;->h:Llj4;

    .line 44
    .line 45
    invoke-static {}, Lgi2;->R()Z

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    if-eqz v1, :cond_0

    .line 50
    .line 51
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    const-string v2, "SimpleExoPlayerAdapter initialize "

    .line 56
    .line 57
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    invoke-static {v1}, Lgi2;->G(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    :cond_0
    sget-object v1, Lsf2;->z:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 65
    .line 66
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 67
    .line 68
    .line 69
    new-instance v1, Lug0;

    .line 70
    .line 71
    const/16 v2, 0x12

    .line 72
    .line 73
    invoke-direct {v1, v2, p0}, Lug0;-><init>(ILjava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    new-instance v2, Lka4;

    .line 77
    .line 78
    invoke-direct {v2, v1, p1}, Lka4;-><init>(Lug0;Landroid/content/Context;)V

    .line 79
    .line 80
    .line 81
    iget-boolean v1, v2, Lka4;->v:Z

    .line 82
    .line 83
    const/4 v3, 0x1

    .line 84
    xor-int/2addr v1, v3

    .line 85
    invoke-static {v1}, Lzt0;->b0(Z)V

    .line 86
    .line 87
    .line 88
    new-instance v1, Lyf3;

    .line 89
    .line 90
    invoke-direct {v1, v0}, Lyf3;-><init>(Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    iput-object v1, v2, Lka4;->e:Lll3;

    .line 94
    .line 95
    iget-boolean v0, v2, Lka4;->v:Z

    .line 96
    .line 97
    xor-int/2addr v0, v3

    .line 98
    invoke-static {v0}, Lzt0;->b0(Z)V

    .line 99
    .line 100
    .line 101
    new-instance v0, Lit3;

    .line 102
    .line 103
    const/4 v1, 0x2

    .line 104
    invoke-direct {v0, v1, p4}, Lit3;-><init>(ILjava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    iput-object v0, v2, Lka4;->f:Lll3;

    .line 108
    .line 109
    iget-boolean p4, v2, Lka4;->v:Z

    .line 110
    .line 111
    xor-int/2addr p4, v3

    .line 112
    invoke-static {p4}, Lzt0;->b0(Z)V

    .line 113
    .line 114
    .line 115
    iput-boolean v3, v2, Lka4;->v:Z

    .line 116
    .line 117
    new-instance p4, Lmc4;

    .line 118
    .line 119
    invoke-direct {p4, v2}, Lmc4;-><init>(Lka4;)V

    .line 120
    .line 121
    .line 122
    iput-object p4, p0, Lsf2;->l:Lmc4;

    .line 123
    .line 124
    iget-object v0, p4, Lmc4;->j:Lhp2;

    .line 125
    .line 126
    invoke-virtual {v0}, Lhp2;->b()V

    .line 127
    .line 128
    .line 129
    iget-object p4, p4, Lmc4;->i:Lya4;

    .line 130
    .line 131
    invoke-virtual {p4, p0}, Lya4;->V1(Lbd4;)V

    .line 132
    .line 133
    .line 134
    const/4 p4, 0x0

    .line 135
    iput p4, p0, Lsf2;->p:I

    .line 136
    .line 137
    const-wide/16 v0, 0x0

    .line 138
    .line 139
    iput-wide v0, p0, Lsf2;->r:J

    .line 140
    .line 141
    iput p4, p0, Lsf2;->q:I

    .line 142
    .line 143
    new-instance v0, Ljava/util/ArrayList;

    .line 144
    .line 145
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 146
    .line 147
    .line 148
    iput-object v0, p0, Lsf2;->w:Ljava/util/ArrayList;

    .line 149
    .line 150
    const/4 v0, 0x0

    .line 151
    iput-object v0, p0, Lsf2;->x:Lnf2;

    .line 152
    .line 153
    if-eqz p3, :cond_1

    .line 154
    .line 155
    invoke-interface {p3}, Lag2;->o()Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    :cond_1
    if-nez v0, :cond_2

    .line 160
    .line 161
    sget-object v0, Lxk3;->f:Lxk3;

    .line 162
    .line 163
    goto :goto_0

    .line 164
    :cond_2
    new-instance v1, Lfl3;

    .line 165
    .line 166
    invoke-direct {v1, v0}, Lfl3;-><init>(Ljava/lang/Object;)V

    .line 167
    .line 168
    .line 169
    move-object v0, v1

    .line 170
    :goto_0
    invoke-virtual {v0}, Ljq0;->b()Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    check-cast v0, Ljava/lang/String;

    .line 175
    .line 176
    iput-object v0, p0, Lsf2;->s:Ljava/lang/String;

    .line 177
    .line 178
    if-eqz p3, :cond_3

    .line 179
    .line 180
    invoke-interface {p3}, Lag2;->q()I

    .line 181
    .line 182
    .line 183
    move-result v0

    .line 184
    goto :goto_1

    .line 185
    :cond_3
    move v0, p4

    .line 186
    :goto_1
    iput v0, p0, Lsf2;->t:I

    .line 187
    .line 188
    new-instance v0, Lr2;

    .line 189
    .line 190
    sget-object v1, Lhg4;->C:Lhg4;

    .line 191
    .line 192
    iget-object v1, v1, Lhg4;->c:Llf4;

    .line 193
    .line 194
    invoke-interface {p3}, Lag2;->u()Le51;

    .line 195
    .line 196
    .line 197
    move-result-object p3

    .line 198
    iget-object p3, p3, Le51;->f:Ljava/lang/String;

    .line 199
    .line 200
    invoke-virtual {v1, p1, p3}, Llf4;->D(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object p1

    .line 204
    iget-boolean p3, p0, Lsf2;->n:Z

    .line 205
    .line 206
    if-eqz p3, :cond_4

    .line 207
    .line 208
    iget-object p3, p0, Lsf2;->m:Ljava/nio/ByteBuffer;

    .line 209
    .line 210
    invoke-virtual {p3}, Ljava/nio/Buffer;->limit()I

    .line 211
    .line 212
    .line 213
    move-result p3

    .line 214
    if-lez p3, :cond_4

    .line 215
    .line 216
    iget-object p1, p0, Lsf2;->m:Ljava/nio/ByteBuffer;

    .line 217
    .line 218
    invoke-virtual {p1}, Ljava/nio/Buffer;->limit()I

    .line 219
    .line 220
    .line 221
    move-result p1

    .line 222
    new-array p1, p1, [B

    .line 223
    .line 224
    iget-object p2, p0, Lsf2;->m:Ljava/nio/ByteBuffer;

    .line 225
    .line 226
    invoke-virtual {p2, p1}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    .line 227
    .line 228
    .line 229
    new-instance p2, Lf20;

    .line 230
    .line 231
    const/16 p3, 0x11

    .line 232
    .line 233
    invoke-direct {p2, p3, p1}, Lf20;-><init>(ILjava/lang/Object;)V

    .line 234
    .line 235
    .line 236
    goto/16 :goto_5

    .line 237
    .line 238
    :cond_4
    sget-object p3, Lmz1;->g2:Liz1;

    .line 239
    .line 240
    sget-object v1, Ltw1;->e:Ltw1;

    .line 241
    .line 242
    iget-object v2, v1, Ltw1;->c:Lkz1;

    .line 243
    .line 244
    invoke-virtual {v2, p3}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 245
    .line 246
    .line 247
    move-result-object p3

    .line 248
    check-cast p3, Ljava/lang/Boolean;

    .line 249
    .line 250
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 251
    .line 252
    .line 253
    move-result p3

    .line 254
    if-eqz p3, :cond_5

    .line 255
    .line 256
    sget-object p3, Lmz1;->Y1:Liz1;

    .line 257
    .line 258
    iget-object v1, v1, Ltw1;->c:Lkz1;

    .line 259
    .line 260
    invoke-virtual {v1, p3}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 261
    .line 262
    .line 263
    move-result-object p3

    .line 264
    check-cast p3, Ljava/lang/Boolean;

    .line 265
    .line 266
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 267
    .line 268
    .line 269
    move-result p3

    .line 270
    if-nez p3, :cond_7

    .line 271
    .line 272
    :cond_5
    iget-boolean p3, p2, Lje2;->i:Z

    .line 273
    .line 274
    if-nez p3, :cond_6

    .line 275
    .line 276
    goto :goto_2

    .line 277
    :cond_6
    move v3, p4

    .line 278
    :cond_7
    :goto_2
    iget-boolean p3, p2, Lje2;->l:Z

    .line 279
    .line 280
    if-eqz p3, :cond_8

    .line 281
    .line 282
    new-instance p3, Lpf2;

    .line 283
    .line 284
    const/4 p4, 0x0

    .line 285
    invoke-direct {p3, p0, p1, v3, p4}, Lpf2;-><init>(Lsf2;Ljava/lang/String;ZI)V

    .line 286
    .line 287
    .line 288
    goto :goto_3

    .line 289
    :cond_8
    iget p3, p2, Lje2;->h:I

    .line 290
    .line 291
    if-lez p3, :cond_9

    .line 292
    .line 293
    new-instance p3, Lpf2;

    .line 294
    .line 295
    const/4 p4, 0x2

    .line 296
    invoke-direct {p3, p0, p1, v3, p4}, Lpf2;-><init>(Lsf2;Ljava/lang/String;ZI)V

    .line 297
    .line 298
    .line 299
    goto :goto_3

    .line 300
    :cond_9
    new-instance p3, Lpf2;

    .line 301
    .line 302
    const/4 p4, 0x1

    .line 303
    invoke-direct {p3, p0, p1, v3, p4}, Lpf2;-><init>(Lsf2;Ljava/lang/String;ZI)V

    .line 304
    .line 305
    .line 306
    :goto_3
    iget-boolean p1, p2, Lje2;->i:Z

    .line 307
    .line 308
    if-eqz p1, :cond_a

    .line 309
    .line 310
    new-instance p1, Lgw3;

    .line 311
    .line 312
    const/16 p2, 0x19

    .line 313
    .line 314
    const/4 p4, 0x0

    .line 315
    invoke-direct {p1, p0, p3, p2, p4}, Lgw3;-><init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 316
    .line 317
    .line 318
    move-object p2, p1

    .line 319
    goto :goto_4

    .line 320
    :cond_a
    move-object p2, p3

    .line 321
    :goto_4
    iget-object p1, p0, Lsf2;->m:Ljava/nio/ByteBuffer;

    .line 322
    .line 323
    if-eqz p1, :cond_b

    .line 324
    .line 325
    invoke-virtual {p1}, Ljava/nio/Buffer;->limit()I

    .line 326
    .line 327
    .line 328
    move-result p1

    .line 329
    if-lez p1, :cond_b

    .line 330
    .line 331
    iget-object p1, p0, Lsf2;->m:Ljava/nio/ByteBuffer;

    .line 332
    .line 333
    invoke-virtual {p1}, Ljava/nio/Buffer;->limit()I

    .line 334
    .line 335
    .line 336
    move-result p1

    .line 337
    new-array p1, p1, [B

    .line 338
    .line 339
    iget-object p3, p0, Lsf2;->m:Ljava/nio/ByteBuffer;

    .line 340
    .line 341
    invoke-virtual {p3, p1}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    .line 342
    .line 343
    .line 344
    new-instance p3, Ll92;

    .line 345
    .line 346
    invoke-direct {p3, p2, p1}, Ll92;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 347
    .line 348
    .line 349
    move-object p2, p3

    .line 350
    :cond_b
    :goto_5
    sget-object p1, Lmz1;->o:Liz1;

    .line 351
    .line 352
    sget-object p3, Ltw1;->e:Ltw1;

    .line 353
    .line 354
    iget-object p3, p3, Ltw1;->c:Lkz1;

    .line 355
    .line 356
    invoke-virtual {p3, p1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 357
    .line 358
    .line 359
    move-result-object p1

    .line 360
    check-cast p1, Ljava/lang/Boolean;

    .line 361
    .line 362
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 363
    .line 364
    .line 365
    move-result p1

    .line 366
    if-eqz p1, :cond_c

    .line 367
    .line 368
    sget-object p1, Lqd2;->g:Lqd2;

    .line 369
    .line 370
    goto :goto_6

    .line 371
    :cond_c
    sget-object p1, Lsd2;->g:Lsd2;

    .line 372
    .line 373
    :goto_6
    invoke-direct {v0, p2, p1}, Lr2;-><init>(Lhh3;Lof1;)V

    .line 374
    .line 375
    .line 376
    iput-object v0, p0, Lsf2;->k:Lr2;

    .line 377
    .line 378
    return-void
.end method


# virtual methods
.method public final a(I)V
    .locals 1

    .line 1
    iget v0, p0, Lsf2;->q:I

    .line 2
    .line 3
    add-int/2addr v0, p1

    .line 4
    iput v0, p0, Lsf2;->q:I

    .line 5
    .line 6
    return-void
.end method

.method public final c(Lij3;Z)V
    .locals 0

    .line 1
    return-void
.end method

.method public final d(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lsf2;->o:Lfe2;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0, p1}, Lfe2;->f0(I)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public final e(Lzd3;Lij3;Z)V
    .locals 2

    .line 1
    instance-of p2, p1, Lfq3;

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    iget-object p2, p0, Lsf2;->u:Ljava/lang/Object;

    .line 6
    .line 7
    monitor-enter p2

    .line 8
    :try_start_0
    iget-object p3, p0, Lsf2;->w:Ljava/util/ArrayList;

    .line 9
    .line 10
    check-cast p1, Lfq3;

    .line 11
    .line 12
    invoke-virtual {p3, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    monitor-exit p2

    .line 16
    return-void

    .line 17
    :catchall_0
    move-exception p1

    .line 18
    monitor-exit p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    throw p1

    .line 20
    :cond_0
    instance-of p2, p1, Lnf2;

    .line 21
    .line 22
    if-eqz p2, :cond_1

    .line 23
    .line 24
    check-cast p1, Lnf2;

    .line 25
    .line 26
    iput-object p1, p0, Lsf2;->x:Lnf2;

    .line 27
    .line 28
    iget-object p1, p0, Lsf2;->j:Ljava/lang/ref/WeakReference;

    .line 29
    .line 30
    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    check-cast p1, Lag2;

    .line 35
    .line 36
    sget-object p2, Lmz1;->Y1:Liz1;

    .line 37
    .line 38
    sget-object p3, Ltw1;->e:Ltw1;

    .line 39
    .line 40
    iget-object p3, p3, Ltw1;->c:Lkz1;

    .line 41
    .line 42
    invoke-virtual {p3, p2}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p2

    .line 46
    check-cast p2, Ljava/lang/Boolean;

    .line 47
    .line 48
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 49
    .line 50
    .line 51
    move-result p2

    .line 52
    if-eqz p2, :cond_1

    .line 53
    .line 54
    if-eqz p1, :cond_1

    .line 55
    .line 56
    iget-object p2, p0, Lsf2;->x:Lnf2;

    .line 57
    .line 58
    iget-boolean p2, p2, Lnf2;->t:Z

    .line 59
    .line 60
    if-eqz p2, :cond_1

    .line 61
    .line 62
    new-instance p2, Ljava/util/HashMap;

    .line 63
    .line 64
    invoke-direct {p2}, Ljava/util/HashMap;-><init>()V

    .line 65
    .line 66
    .line 67
    iget-object p3, p0, Lsf2;->x:Lnf2;

    .line 68
    .line 69
    iget-boolean p3, p3, Lnf2;->v:Z

    .line 70
    .line 71
    invoke-static {p3}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object p3

    .line 75
    const-string v0, "gcacheHit"

    .line 76
    .line 77
    invoke-virtual {p2, v0, p3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    iget-object p3, p0, Lsf2;->x:Lnf2;

    .line 81
    .line 82
    iget-boolean p3, p3, Lnf2;->w:Z

    .line 83
    .line 84
    invoke-static {p3}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object p3

    .line 88
    const-string v0, "gcacheDownloaded"

    .line 89
    .line 90
    invoke-virtual {p2, v0, p3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    sget-object p3, Llf4;->l:Li63;

    .line 94
    .line 95
    new-instance v0, Ln62;

    .line 96
    .line 97
    const/16 v1, 0x9

    .line 98
    .line 99
    invoke-direct {v0, p1, p2, v1}, Ln62;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {p3, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 103
    .line 104
    .line 105
    :cond_1
    return-void
.end method

.method public final f(Lij3;ZI)V
    .locals 0

    .line 1
    iget p1, p0, Lsf2;->p:I

    .line 2
    .line 3
    add-int/2addr p1, p3

    .line 4
    iput p1, p0, Lsf2;->p:I

    .line 5
    .line 6
    return-void
.end method

.method public final finalize()V
    .locals 2

    .line 1
    sget-object v0, Lsf2;->z:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lgi2;->R()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const-string v1, "SimpleExoPlayerAdapter finalize "

    .line 17
    .line 18
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-static {v0}, Lgi2;->G(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    :cond_0
    return-void
.end method

.method public final g(Lph4;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lsf2;->j:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lag2;

    .line 8
    .line 9
    sget-object v1, Lmz1;->Y1:Liz1;

    .line 10
    .line 11
    sget-object v2, Ltw1;->e:Ltw1;

    .line 12
    .line 13
    iget-object v2, v2, Ltw1;->c:Lkz1;

    .line 14
    .line 15
    invoke-virtual {v2, v1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, Ljava/lang/Boolean;

    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_3

    .line 26
    .line 27
    if-eqz v0, :cond_3

    .line 28
    .line 29
    new-instance v1, Ljava/util/HashMap;

    .line 30
    .line 31
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 32
    .line 33
    .line 34
    iget-object v2, p1, Lph4;->l:Ljava/lang/String;

    .line 35
    .line 36
    if-eqz v2, :cond_0

    .line 37
    .line 38
    const-string v3, "audioMime"

    .line 39
    .line 40
    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    :cond_0
    iget-object v2, p1, Lph4;->m:Ljava/lang/String;

    .line 44
    .line 45
    if-eqz v2, :cond_1

    .line 46
    .line 47
    const-string v3, "audioSampleMime"

    .line 48
    .line 49
    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    :cond_1
    iget-object p1, p1, Lph4;->j:Ljava/lang/String;

    .line 53
    .line 54
    if-eqz p1, :cond_2

    .line 55
    .line 56
    const-string v2, "audioCodec"

    .line 57
    .line 58
    invoke-virtual {v1, v2, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    :cond_2
    const-string p1, "onMetadataEvent"

    .line 62
    .line 63
    invoke-interface {v0, p1, v1}, Ll52;->a(Ljava/lang/String;Ljava/util/Map;)V

    .line 64
    .line 65
    .line 66
    :cond_3
    return-void
.end method

.method public final j(Lb84;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lsf2;->o:Lfe2;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const-string v1, "onPlayerError"

    .line 6
    .line 7
    invoke-interface {v0, v1, p1}, Lfe2;->x(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public final k(Lt82;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lsf2;->o:Lfe2;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget v1, p1, Lt82;->a:I

    .line 6
    .line 7
    iget p1, p1, Lt82;->b:I

    .line 8
    .line 9
    invoke-interface {v0, v1, p1}, Lfe2;->w(II)V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public final l(Lph4;)V
    .locals 7

    .line 1
    iget-object v0, p0, Lsf2;->j:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lag2;

    .line 8
    .line 9
    sget-object v1, Lmz1;->Y1:Liz1;

    .line 10
    .line 11
    sget-object v2, Ltw1;->e:Ltw1;

    .line 12
    .line 13
    iget-object v2, v2, Ltw1;->c:Lkz1;

    .line 14
    .line 15
    invoke-virtual {v2, v1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, Ljava/lang/Boolean;

    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_3

    .line 26
    .line 27
    if-eqz v0, :cond_3

    .line 28
    .line 29
    new-instance v1, Ljava/util/HashMap;

    .line 30
    .line 31
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 32
    .line 33
    .line 34
    iget v2, p1, Lph4;->x:F

    .line 35
    .line 36
    const-string v3, "frameRate"

    .line 37
    .line 38
    invoke-static {v2}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    iget v2, p1, Lph4;->i:I

    .line 46
    .line 47
    const-string v3, "bitRate"

    .line 48
    .line 49
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    iget v2, p1, Lph4;->t:I

    .line 57
    .line 58
    iget v3, p1, Lph4;->u:I

    .line 59
    .line 60
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 65
    .line 66
    .line 67
    move-result v4

    .line 68
    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v5

    .line 72
    add-int/lit8 v4, v4, 0x1

    .line 73
    .line 74
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 75
    .line 76
    .line 77
    move-result v5

    .line 78
    new-instance v6, Ljava/lang/StringBuilder;

    .line 79
    .line 80
    add-int/2addr v4, v5

    .line 81
    invoke-direct {v6, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    const-string v2, "x"

    .line 88
    .line 89
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    const-string v3, "resolution"

    .line 100
    .line 101
    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    iget-object v2, p1, Lph4;->l:Ljava/lang/String;

    .line 105
    .line 106
    if-eqz v2, :cond_0

    .line 107
    .line 108
    const-string v3, "videoMime"

    .line 109
    .line 110
    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    :cond_0
    iget-object v2, p1, Lph4;->m:Ljava/lang/String;

    .line 114
    .line 115
    if-eqz v2, :cond_1

    .line 116
    .line 117
    const-string v3, "videoSampleMime"

    .line 118
    .line 119
    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    :cond_1
    iget-object p1, p1, Lph4;->j:Ljava/lang/String;

    .line 123
    .line 124
    if-eqz p1, :cond_2

    .line 125
    .line 126
    const-string v2, "videoCodec"

    .line 127
    .line 128
    invoke-virtual {v1, v2, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    :cond_2
    const-string p1, "onMetadataEvent"

    .line 132
    .line 133
    invoke-interface {v0, p1, v1}, Ll52;->a(Ljava/lang/String;Ljava/util/Map;)V

    .line 134
    .line 135
    .line 136
    :cond_3
    return-void
.end method

.method public final o(Ljava/io/IOException;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lsf2;->o:Lfe2;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v1, p0, Lsf2;->i:Lje2;

    .line 6
    .line 7
    iget-boolean v1, v1, Lje2;->j:Z

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-interface {v0, p1}, Lfe2;->u(Ljava/io/IOException;)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    const-string v1, "onLoadError"

    .line 16
    .line 17
    invoke-interface {v0, v1, p1}, Lfe2;->x(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 18
    .line 19
    .line 20
    :cond_1
    return-void
.end method

.method public final p()V
    .locals 1

    .line 1
    iget-object v0, p0, Lsf2;->o:Lfe2;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lfe2;->t()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public final q()J
    .locals 4

    .line 1
    iget-object v0, p0, Lsf2;->x:Lnf2;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lsf2;->x:Lnf2;

    .line 6
    .line 7
    iget-boolean v0, v0, Lnf2;->u:Z

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lsf2;->x:Lnf2;

    .line 12
    .line 13
    iget-boolean v0, v0, Lnf2;->v:Z

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    iget v0, p0, Lsf2;->p:I

    .line 18
    .line 19
    int-to-long v0, v0

    .line 20
    iget-object v2, p0, Lsf2;->x:Lnf2;

    .line 21
    .line 22
    iget-wide v2, v2, Lnf2;->x:J

    .line 23
    .line 24
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->min(JJ)J

    .line 25
    .line 26
    .line 27
    move-result-wide v0

    .line 28
    return-wide v0

    .line 29
    :cond_0
    const-wide/16 v0, 0x0

    .line 30
    .line 31
    return-wide v0
.end method

.method public final r()J
    .locals 10

    .line 1
    iget-object v0, p0, Lsf2;->x:Lnf2;

    .line 2
    .line 3
    if-eqz v0, :cond_4

    .line 4
    .line 5
    iget-object v0, p0, Lsf2;->x:Lnf2;

    .line 6
    .line 7
    iget-boolean v0, v0, Lnf2;->u:Z

    .line 8
    .line 9
    if-eqz v0, :cond_4

    .line 10
    .line 11
    iget-object v0, p0, Lsf2;->x:Lnf2;

    .line 12
    .line 13
    iget-object v1, v0, Lnf2;->s:Lww1;

    .line 14
    .line 15
    const-wide/16 v2, -0x1

    .line 16
    .line 17
    if-nez v1, :cond_0

    .line 18
    .line 19
    goto :goto_1

    .line 20
    :cond_0
    iget-object v1, v0, Lnf2;->z:Ljava/util/concurrent/atomic/AtomicLong;

    .line 21
    .line 22
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    .line 23
    .line 24
    .line 25
    move-result-wide v4

    .line 26
    cmp-long v4, v4, v2

    .line 27
    .line 28
    if-eqz v4, :cond_1

    .line 29
    .line 30
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    .line 31
    .line 32
    .line 33
    move-result-wide v0

    .line 34
    return-wide v0

    .line 35
    :cond_1
    monitor-enter v0

    .line 36
    :try_start_0
    iget-object v1, v0, Lnf2;->y:Ln70;

    .line 37
    .line 38
    if-nez v1, :cond_2

    .line 39
    .line 40
    sget-object v1, Lmd2;->a:Lld2;

    .line 41
    .line 42
    new-instance v4, Lxs1;

    .line 43
    .line 44
    const/4 v5, 0x4

    .line 45
    invoke-direct {v4, v5, v0}, Lxs1;-><init>(ILjava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v1, v4}, Lld2;->c(Ljava/util/concurrent/Callable;)Ln70;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    iput-object v1, v0, Lnf2;->y:Ln70;

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :catchall_0
    move-exception v1

    .line 56
    goto :goto_2

    .line 57
    :cond_2
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 58
    iget-object v1, v0, Lnf2;->y:Ln70;

    .line 59
    .line 60
    invoke-interface {v1}, Ljava/util/concurrent/Future;->isDone()Z

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    if-eqz v1, :cond_3

    .line 65
    .line 66
    :try_start_1
    iget-object v1, v0, Lnf2;->z:Ljava/util/concurrent/atomic/AtomicLong;

    .line 67
    .line 68
    iget-object v4, v0, Lnf2;->y:Ln70;

    .line 69
    .line 70
    invoke-interface {v4}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v4

    .line 74
    check-cast v4, Ljava/lang/Long;

    .line 75
    .line 76
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 77
    .line 78
    .line 79
    move-result-wide v4

    .line 80
    invoke-virtual {v1, v2, v3, v4, v5}, Ljava/util/concurrent/atomic/AtomicLong;->compareAndSet(JJ)Z
    :try_end_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0

    .line 81
    .line 82
    .line 83
    iget-object v0, v0, Lnf2;->z:Ljava/util/concurrent/atomic/AtomicLong;

    .line 84
    .line 85
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    .line 86
    .line 87
    .line 88
    move-result-wide v0

    .line 89
    return-wide v0

    .line 90
    :catch_0
    :cond_3
    :goto_1
    return-wide v2

    .line 91
    :goto_2
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 92
    throw v1

    .line 93
    :cond_4
    iget-object v0, p0, Lsf2;->u:Ljava/lang/Object;

    .line 94
    .line 95
    monitor-enter v0

    .line 96
    :goto_3
    :try_start_3
    iget-object v1, p0, Lsf2;->w:Ljava/util/ArrayList;

    .line 97
    .line 98
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 99
    .line 100
    .line 101
    move-result v2

    .line 102
    if-nez v2, :cond_7

    .line 103
    .line 104
    iget-wide v2, p0, Lsf2;->r:J

    .line 105
    .line 106
    const/4 v4, 0x0

    .line 107
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    check-cast v1, Lfq3;

    .line 112
    .line 113
    invoke-interface {v1}, Lfq3;->g()Ljava/util/Map;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    const-wide/16 v5, 0x0

    .line 118
    .line 119
    if-eqz v1, :cond_6

    .line 120
    .line 121
    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 122
    .line 123
    .line 124
    move-result-object v1

    .line 125
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 126
    .line 127
    .line 128
    move-result-object v1

    .line 129
    :catch_1
    :cond_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 130
    .line 131
    .line 132
    move-result v7

    .line 133
    if-eqz v7, :cond_6

    .line 134
    .line 135
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v7

    .line 139
    check-cast v7, Ljava/util/Map$Entry;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 140
    .line 141
    if-eqz v7, :cond_5

    .line 142
    .line 143
    :try_start_4
    invoke-interface {v7}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v8

    .line 147
    if-eqz v8, :cond_5

    .line 148
    .line 149
    const-string v8, "content-length"

    .line 150
    .line 151
    invoke-interface {v7}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v9

    .line 155
    check-cast v9, Ljava/lang/CharSequence;

    .line 156
    .line 157
    invoke-static {v8, v9}, Lum;->L(Ljava/lang/String;Ljava/lang/CharSequence;)Z

    .line 158
    .line 159
    .line 160
    move-result v8

    .line 161
    if-eqz v8, :cond_5

    .line 162
    .line 163
    invoke-interface {v7}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v8

    .line 167
    if-eqz v8, :cond_5

    .line 168
    .line 169
    invoke-interface {v7}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v8

    .line 173
    check-cast v8, Ljava/util/List;

    .line 174
    .line 175
    invoke-interface {v8, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object v8

    .line 179
    if-eqz v8, :cond_5

    .line 180
    .line 181
    invoke-interface {v7}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object v7

    .line 185
    check-cast v7, Ljava/util/List;

    .line 186
    .line 187
    invoke-interface {v7, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object v7

    .line 191
    check-cast v7, Ljava/lang/String;

    .line 192
    .line 193
    invoke-static {v7}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 194
    .line 195
    .line 196
    move-result-wide v5
    :try_end_4
    .catch Ljava/lang/NumberFormatException; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 197
    goto :goto_4

    .line 198
    :catchall_1
    move-exception v1

    .line 199
    goto :goto_5

    .line 200
    :cond_6
    :goto_4
    add-long/2addr v2, v5

    .line 201
    :try_start_5
    iput-wide v2, p0, Lsf2;->r:J

    .line 202
    .line 203
    goto :goto_3

    .line 204
    :cond_7
    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 205
    iget-wide v0, p0, Lsf2;->r:J

    .line 206
    .line 207
    return-wide v0

    .line 208
    :goto_5
    :try_start_6
    monitor-exit v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 209
    throw v1
.end method

.method public final s(Z)V
    .locals 6

    .line 1
    iget-object v0, p0, Lsf2;->l:Lmc4;

    .line 2
    .line 3
    if-eqz v0, :cond_4

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    :goto_0
    iget-object v1, p0, Lsf2;->l:Lmc4;

    .line 7
    .line 8
    iget-object v2, v1, Lmc4;->j:Lhp2;

    .line 9
    .line 10
    invoke-virtual {v2}, Lhp2;->b()V

    .line 11
    .line 12
    .line 13
    iget-object v1, v1, Lmc4;->i:Lya4;

    .line 14
    .line 15
    invoke-virtual {v1}, Lya4;->j2()V

    .line 16
    .line 17
    .line 18
    iget-object v1, v1, Lya4;->n:[Lkg4;

    .line 19
    .line 20
    array-length v1, v1

    .line 21
    const/4 v1, 0x2

    .line 22
    if-ge v0, v1, :cond_4

    .line 23
    .line 24
    iget-object v1, p0, Lsf2;->h:Llj4;

    .line 25
    .line 26
    iget-object v2, v1, Llj4;->c:Ljava/lang/Object;

    .line 27
    .line 28
    monitor-enter v2

    .line 29
    :try_start_0
    iget-object v3, v1, Llj4;->e:Ldj4;

    .line 30
    .line 31
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 32
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    new-instance v2, Lcj4;

    .line 36
    .line 37
    invoke-direct {v2, v3}, Lcj4;-><init>(Ldj4;)V

    .line 38
    .line 39
    .line 40
    xor-int/lit8 v3, p1, 0x1

    .line 41
    .line 42
    iget-object v4, v2, Lcj4;->E:Landroid/util/SparseBooleanArray;

    .line 43
    .line 44
    invoke-virtual {v4, v0}, Landroid/util/SparseBooleanArray;->get(I)Z

    .line 45
    .line 46
    .line 47
    move-result v5

    .line 48
    if-ne v5, v3, :cond_0

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_0
    if-nez p1, :cond_1

    .line 52
    .line 53
    const/4 v3, 0x1

    .line 54
    invoke-virtual {v4, v0, v3}, Landroid/util/SparseBooleanArray;->put(IZ)V

    .line 55
    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_1
    invoke-virtual {v4, v0}, Landroid/util/SparseBooleanArray;->delete(I)V

    .line 59
    .line 60
    .line 61
    :goto_1
    new-instance v3, Ldj4;

    .line 62
    .line 63
    invoke-direct {v3, v2}, Ldj4;-><init>(Lcj4;)V

    .line 64
    .line 65
    .line 66
    iget-object v4, v1, Llj4;->c:Ljava/lang/Object;

    .line 67
    .line 68
    monitor-enter v4

    .line 69
    :try_start_1
    iget-object v2, v1, Llj4;->e:Ldj4;

    .line 70
    .line 71
    invoke-virtual {v2, v3}, Ldj4;->equals(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result v2

    .line 75
    iput-object v3, v1, Llj4;->e:Ldj4;

    .line 76
    .line 77
    monitor-exit v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 78
    if-nez v2, :cond_3

    .line 79
    .line 80
    iget-boolean v2, v3, Ldj4;->A:Z

    .line 81
    .line 82
    if-eqz v2, :cond_2

    .line 83
    .line 84
    iget-object v2, v1, Llj4;->d:Landroid/content/Context;

    .line 85
    .line 86
    if-nez v2, :cond_2

    .line 87
    .line 88
    const-string v2, "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument."

    .line 89
    .line 90
    invoke-static {v2}, La30;->x(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    :cond_2
    iget-object v1, v1, Llj4;->a:Ljb4;

    .line 94
    .line 95
    if-eqz v1, :cond_3

    .line 96
    .line 97
    iget-object v1, v1, Ljb4;->m:Ld13;

    .line 98
    .line 99
    const/16 v2, 0xa

    .line 100
    .line 101
    invoke-virtual {v1, v2}, Ld13;->b(I)Z

    .line 102
    .line 103
    .line 104
    :cond_3
    add-int/lit8 v0, v0, 0x1

    .line 105
    .line 106
    goto :goto_0

    .line 107
    :catchall_0
    move-exception p1

    .line 108
    :try_start_2
    monitor-exit v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 109
    throw p1

    .line 110
    :catchall_1
    move-exception p1

    .line 111
    :try_start_3
    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 112
    throw p1

    .line 113
    :cond_4
    return-void
.end method

.method public final t(Landroid/net/Uri;)Lhi4;
    .locals 12

    .line 1
    sget-object v0, Lxm3;->g:Lvm3;

    .line 2
    .line 3
    sget-object v0, Lsn3;->j:Lsn3;

    .line 4
    .line 5
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 6
    .line 7
    sget-object v0, Lsn3;->j:Lsn3;

    .line 8
    .line 9
    sget-object v1, Lzi1;->a:Lzi1;

    .line 10
    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    new-instance v1, Lkh1;

    .line 14
    .line 15
    invoke-direct {v1, p1, v0}, Lkh1;-><init>(Landroid/net/Uri;Lxm3;)V

    .line 16
    .line 17
    .line 18
    :goto_0
    move-object v5, v1

    .line 19
    goto :goto_1

    .line 20
    :cond_0
    const/4 v1, 0x0

    .line 21
    goto :goto_0

    .line 22
    :goto_1
    new-instance v2, Lfk1;

    .line 23
    .line 24
    new-instance v4, Lse1;

    .line 25
    .line 26
    invoke-direct {v4}, Lce1;-><init>()V

    .line 27
    .line 28
    .line 29
    new-instance v6, Lqg1;

    .line 30
    .line 31
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 32
    .line 33
    .line 34
    sget-object v7, Lrm1;->B:Lrm1;

    .line 35
    .line 36
    const-string v3, ""

    .line 37
    .line 38
    invoke-direct/range {v2 .. v7}, Lfk1;-><init>(Ljava/lang/String;Lse1;Lkh1;Lqg1;Lrm1;)V

    .line 39
    .line 40
    .line 41
    iget-object p1, p0, Lsf2;->i:Lje2;

    .line 42
    .line 43
    iget p1, p1, Lje2;->f:I

    .line 44
    .line 45
    iget-object v0, p0, Lsf2;->k:Lr2;

    .line 46
    .line 47
    iput p1, v0, Lr2;->g:I

    .line 48
    .line 49
    iget-object p1, v2, Lfk1;->b:Lkh1;

    .line 50
    .line 51
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    iget-object p1, v0, Lr2;->h:Ljava/lang/Object;

    .line 55
    .line 56
    move-object v8, p1

    .line 57
    check-cast v8, Lhh3;

    .line 58
    .line 59
    iget-object p1, v0, Lr2;->i:Ljava/lang/Object;

    .line 60
    .line 61
    move-object v9, p1

    .line 62
    check-cast v9, Lyf3;

    .line 63
    .line 64
    iget-object p1, v0, Lr2;->j:Ljava/lang/Object;

    .line 65
    .line 66
    move-object v10, p1

    .line 67
    check-cast v10, Lhd4;

    .line 68
    .line 69
    new-instance v6, Lhi4;

    .line 70
    .line 71
    iget v11, v0, Lr2;->g:I

    .line 72
    .line 73
    move-object v7, v2

    .line 74
    invoke-direct/range {v6 .. v11}, Lhi4;-><init>(Lfk1;Lhh3;Lyf3;Lhd4;I)V

    .line 75
    .line 76
    .line 77
    return-object v6
.end method

.method public final u([Landroid/net/Uri;Ljava/nio/ByteBuffer;Z)V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Lsf2;->l:Lmc4;

    .line 6
    .line 7
    if-eqz v2, :cond_11

    .line 8
    .line 9
    move-object/from16 v2, p2

    .line 10
    .line 11
    iput-object v2, v0, Lsf2;->m:Ljava/nio/ByteBuffer;

    .line 12
    .line 13
    move/from16 v2, p3

    .line 14
    .line 15
    iput-boolean v2, v0, Lsf2;->n:Z

    .line 16
    .line 17
    array-length v2, v1

    .line 18
    const/4 v3, 0x1

    .line 19
    const/4 v4, 0x0

    .line 20
    if-ne v2, v3, :cond_0

    .line 21
    .line 22
    aget-object v1, v1, v4

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Lsf2;->t(Landroid/net/Uri;)Lhi4;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    goto :goto_1

    .line 29
    :cond_0
    new-array v2, v2, [Lpg4;

    .line 30
    .line 31
    :goto_0
    array-length v3, v1

    .line 32
    if-ge v4, v3, :cond_1

    .line 33
    .line 34
    aget-object v3, v1, v4

    .line 35
    .line 36
    invoke-virtual {v0, v3}, Lsf2;->t(Landroid/net/Uri;)Lhi4;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    aput-object v3, v2, v4

    .line 41
    .line 42
    add-int/lit8 v4, v4, 0x1

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    new-instance v1, Lvh4;

    .line 46
    .line 47
    new-instance v3, Lhd4;

    .line 48
    .line 49
    const/16 v4, 0xa

    .line 50
    .line 51
    invoke-direct {v3, v4}, Lhd4;-><init>(I)V

    .line 52
    .line 53
    .line 54
    invoke-direct {v1, v3, v2}, Lvh4;-><init>(Lhd4;[Lpg4;)V

    .line 55
    .line 56
    .line 57
    :goto_1
    iget-object v2, v0, Lsf2;->l:Lmc4;

    .line 58
    .line 59
    iget-object v3, v2, Lmc4;->j:Lhp2;

    .line 60
    .line 61
    invoke-virtual {v3}, Lhp2;->b()V

    .line 62
    .line 63
    .line 64
    iget-object v4, v2, Lmc4;->i:Lya4;

    .line 65
    .line 66
    invoke-virtual {v4}, Lya4;->j2()V

    .line 67
    .line 68
    .line 69
    invoke-static {v1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    invoke-virtual {v4}, Lya4;->j2()V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v4}, Lya4;->j2()V

    .line 77
    .line 78
    .line 79
    iget-object v2, v4, Lya4;->c0:Ldc4;

    .line 80
    .line 81
    invoke-virtual {v4, v2}, Lya4;->Z1(Ldc4;)I

    .line 82
    .line 83
    .line 84
    invoke-virtual {v4}, Lya4;->Q1()J

    .line 85
    .line 86
    .line 87
    iget v2, v4, Lya4;->J:I

    .line 88
    .line 89
    const/4 v3, 0x1

    .line 90
    add-int/2addr v2, v3

    .line 91
    iput v2, v4, Lya4;->J:I

    .line 92
    .line 93
    iget-object v2, v4, Lya4;->w:Ljava/util/ArrayList;

    .line 94
    .line 95
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 96
    .line 97
    .line 98
    move-result v5

    .line 99
    const/4 v6, 0x0

    .line 100
    if-nez v5, :cond_6

    .line 101
    .line 102
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 103
    .line 104
    .line 105
    move-result v5

    .line 106
    add-int/lit8 v7, v5, -0x1

    .line 107
    .line 108
    :goto_2
    if-ltz v7, :cond_2

    .line 109
    .line 110
    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    add-int/lit8 v7, v7, -0x1

    .line 114
    .line 115
    goto :goto_2

    .line 116
    :cond_2
    iget-object v7, v4, Lya4;->f0:Lni4;

    .line 117
    .line 118
    iget-object v8, v7, Lni4;->b:[I

    .line 119
    .line 120
    array-length v9, v8

    .line 121
    sub-int/2addr v9, v5

    .line 122
    new-array v9, v9, [I

    .line 123
    .line 124
    move v10, v6

    .line 125
    move v11, v10

    .line 126
    :goto_3
    array-length v12, v8

    .line 127
    if-ge v10, v12, :cond_5

    .line 128
    .line 129
    aget v12, v8, v10

    .line 130
    .line 131
    if-ltz v12, :cond_3

    .line 132
    .line 133
    if-ge v12, v5, :cond_3

    .line 134
    .line 135
    add-int/lit8 v11, v11, 0x1

    .line 136
    .line 137
    goto :goto_4

    .line 138
    :cond_3
    sub-int v13, v10, v11

    .line 139
    .line 140
    if-ltz v12, :cond_4

    .line 141
    .line 142
    sub-int/2addr v12, v5

    .line 143
    :cond_4
    aput v12, v9, v13

    .line 144
    .line 145
    :goto_4
    add-int/lit8 v10, v10, 0x1

    .line 146
    .line 147
    goto :goto_3

    .line 148
    :cond_5
    iget-object v5, v7, Lni4;->a:Ljava/util/Random;

    .line 149
    .line 150
    new-instance v7, Lni4;

    .line 151
    .line 152
    new-instance v8, Ljava/util/Random;

    .line 153
    .line 154
    invoke-virtual {v5}, Ljava/util/Random;->nextLong()J

    .line 155
    .line 156
    .line 157
    move-result-wide v10

    .line 158
    invoke-direct {v8, v10, v11}, Ljava/util/Random;-><init>(J)V

    .line 159
    .line 160
    .line 161
    invoke-direct {v7, v9, v8}, Lni4;-><init>([ILjava/util/Random;)V

    .line 162
    .line 163
    .line 164
    iput-object v7, v4, Lya4;->f0:Lni4;

    .line 165
    .line 166
    :cond_6
    new-instance v13, Ljava/util/ArrayList;

    .line 167
    .line 168
    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 169
    .line 170
    .line 171
    move v5, v6

    .line 172
    :goto_5
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 173
    .line 174
    .line 175
    move-result v7

    .line 176
    if-ge v5, v7, :cond_7

    .line 177
    .line 178
    new-instance v7, Lbc4;

    .line 179
    .line 180
    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v8

    .line 184
    check-cast v8, Lpg4;

    .line 185
    .line 186
    iget-boolean v9, v4, Lya4;->x:Z

    .line 187
    .line 188
    invoke-direct {v7, v8, v9}, Lbc4;-><init>(Lpg4;Z)V

    .line 189
    .line 190
    .line 191
    invoke-virtual {v13, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 192
    .line 193
    .line 194
    new-instance v8, Lxa4;

    .line 195
    .line 196
    iget-object v9, v7, Lbc4;->b:Ljava/lang/Object;

    .line 197
    .line 198
    iget-object v7, v7, Lbc4;->a:Lgh4;

    .line 199
    .line 200
    invoke-direct {v8, v9, v7}, Lxa4;-><init>(Ljava/lang/Object;Lgh4;)V

    .line 201
    .line 202
    .line 203
    invoke-virtual {v2, v5, v8}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 204
    .line 205
    .line 206
    add-int/lit8 v5, v5, 0x1

    .line 207
    .line 208
    goto :goto_5

    .line 209
    :cond_7
    iget-object v1, v4, Lya4;->f0:Lni4;

    .line 210
    .line 211
    invoke-virtual {v13}, Ljava/util/ArrayList;->size()I

    .line 212
    .line 213
    .line 214
    move-result v5

    .line 215
    invoke-virtual {v1, v5}, Lni4;->a(I)Lni4;

    .line 216
    .line 217
    .line 218
    move-result-object v1

    .line 219
    iput-object v1, v4, Lya4;->f0:Lni4;

    .line 220
    .line 221
    new-instance v1, Lic4;

    .line 222
    .line 223
    iget-object v5, v4, Lya4;->f0:Lni4;

    .line 224
    .line 225
    invoke-direct {v1, v2, v5}, Lic4;-><init>(Ljava/util/List;Lni4;)V

    .line 226
    .line 227
    .line 228
    invoke-virtual {v1}, Loz1;->g()Z

    .line 229
    .line 230
    .line 231
    move-result v2

    .line 232
    iget v5, v1, Lic4;->d:I

    .line 233
    .line 234
    if-nez v2, :cond_9

    .line 235
    .line 236
    if-ltz v5, :cond_8

    .line 237
    .line 238
    goto :goto_6

    .line 239
    :cond_8
    new-instance v1, Lvf;

    .line 240
    .line 241
    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 242
    .line 243
    .line 244
    throw v1

    .line 245
    :cond_9
    :goto_6
    invoke-virtual {v1, v6}, Lic4;->k(Z)I

    .line 246
    .line 247
    .line 248
    move-result v15

    .line 249
    iget-object v2, v4, Lya4;->c0:Ldc4;

    .line 250
    .line 251
    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    invoke-virtual {v4, v1, v15, v7, v8}, Lya4;->g2(Loz1;IJ)Landroid/util/Pair;

    .line 257
    .line 258
    .line 259
    move-result-object v9

    .line 260
    invoke-virtual {v4, v2, v1, v9}, Lya4;->e2(Ldc4;Loz1;Landroid/util/Pair;)Ldc4;

    .line 261
    .line 262
    .line 263
    move-result-object v2

    .line 264
    iget v9, v2, Ldc4;->e:I

    .line 265
    .line 266
    if-ne v9, v3, :cond_a

    .line 267
    .line 268
    move v9, v3

    .line 269
    goto :goto_8

    .line 270
    :cond_a
    invoke-virtual {v1}, Loz1;->g()Z

    .line 271
    .line 272
    .line 273
    move-result v1

    .line 274
    const/4 v10, 0x4

    .line 275
    if-eqz v1, :cond_b

    .line 276
    .line 277
    :goto_7
    move v9, v10

    .line 278
    goto :goto_8

    .line 279
    :cond_b
    const/4 v1, -0x1

    .line 280
    if-ne v15, v1, :cond_c

    .line 281
    .line 282
    goto :goto_8

    .line 283
    :cond_c
    if-lt v15, v5, :cond_d

    .line 284
    .line 285
    goto :goto_7

    .line 286
    :cond_d
    const/4 v9, 0x2

    .line 287
    :goto_8
    invoke-static {v2, v9}, Lya4;->f2(Ldc4;I)Ldc4;

    .line 288
    .line 289
    .line 290
    move-result-object v5

    .line 291
    iget-object v1, v4, Lya4;->s:Ljb4;

    .line 292
    .line 293
    invoke-static {v7, v8}, Lv23;->r(J)J

    .line 294
    .line 295
    .line 296
    move-result-wide v16

    .line 297
    iget-object v14, v4, Lya4;->f0:Lni4;

    .line 298
    .line 299
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 300
    .line 301
    .line 302
    new-instance v12, Lhb4;

    .line 303
    .line 304
    invoke-direct/range {v12 .. v17}, Lhb4;-><init>(Ljava/util/ArrayList;Lni4;IJ)V

    .line 305
    .line 306
    .line 307
    iget-object v1, v1, Ljb4;->m:Ld13;

    .line 308
    .line 309
    const/16 v2, 0x11

    .line 310
    .line 311
    invoke-virtual {v1, v2, v12}, Ld13;->a(ILjava/lang/Object;)Lv03;

    .line 312
    .line 313
    .line 314
    move-result-object v1

    .line 315
    invoke-virtual {v1}, Lv03;->a()V

    .line 316
    .line 317
    .line 318
    iget-object v1, v4, Lya4;->c0:Ldc4;

    .line 319
    .line 320
    iget-object v1, v1, Ldc4;->b:Lkh4;

    .line 321
    .line 322
    iget-object v1, v1, Lkh4;->a:Ljava/lang/Object;

    .line 323
    .line 324
    iget-object v2, v5, Ldc4;->b:Lkh4;

    .line 325
    .line 326
    iget-object v2, v2, Lkh4;->a:Ljava/lang/Object;

    .line 327
    .line 328
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 329
    .line 330
    .line 331
    move-result v1

    .line 332
    if-nez v1, :cond_e

    .line 333
    .line 334
    iget-object v1, v4, Lya4;->c0:Ldc4;

    .line 335
    .line 336
    iget-object v1, v1, Ldc4;->a:Loz1;

    .line 337
    .line 338
    invoke-virtual {v1}, Loz1;->g()Z

    .line 339
    .line 340
    .line 341
    move-result v1

    .line 342
    if-nez v1, :cond_e

    .line 343
    .line 344
    move v7, v3

    .line 345
    goto :goto_9

    .line 346
    :cond_e
    move v7, v6

    .line 347
    :goto_9
    invoke-virtual {v4, v5}, Lya4;->b2(Ldc4;)J

    .line 348
    .line 349
    .line 350
    move-result-wide v9

    .line 351
    const/4 v11, -0x1

    .line 352
    const/4 v6, 0x0

    .line 353
    const/4 v8, 0x4

    .line 354
    invoke-virtual/range {v4 .. v11}, Lya4;->c2(Ldc4;IZIJI)V

    .line 355
    .line 356
    .line 357
    iget-object v1, v0, Lsf2;->l:Lmc4;

    .line 358
    .line 359
    iget-object v2, v1, Lmc4;->j:Lhp2;

    .line 360
    .line 361
    invoke-virtual {v2}, Lhp2;->b()V

    .line 362
    .line 363
    .line 364
    iget-object v3, v1, Lmc4;->i:Lya4;

    .line 365
    .line 366
    invoke-virtual {v3}, Lya4;->j2()V

    .line 367
    .line 368
    .line 369
    iget-object v1, v3, Lya4;->c0:Ldc4;

    .line 370
    .line 371
    iget v2, v1, Ldc4;->e:I

    .line 372
    .line 373
    const/4 v4, 0x1

    .line 374
    if-eq v2, v4, :cond_f

    .line 375
    .line 376
    goto :goto_b

    .line 377
    :cond_f
    const/4 v2, 0x0

    .line 378
    invoke-virtual {v1, v2}, Ldc4;->e(Lb84;)Ldc4;

    .line 379
    .line 380
    .line 381
    move-result-object v1

    .line 382
    iget-object v2, v1, Ldc4;->a:Loz1;

    .line 383
    .line 384
    invoke-virtual {v2}, Loz1;->g()Z

    .line 385
    .line 386
    .line 387
    move-result v2

    .line 388
    if-eq v4, v2, :cond_10

    .line 389
    .line 390
    const/4 v2, 0x2

    .line 391
    goto :goto_a

    .line 392
    :cond_10
    const/4 v2, 0x4

    .line 393
    :goto_a
    invoke-static {v1, v2}, Lya4;->f2(Ldc4;I)Ldc4;

    .line 394
    .line 395
    .line 396
    move-result-object v1

    .line 397
    iget v2, v3, Lya4;->J:I

    .line 398
    .line 399
    add-int/2addr v2, v4

    .line 400
    iput v2, v3, Lya4;->J:I

    .line 401
    .line 402
    iget-object v2, v3, Lya4;->s:Ljb4;

    .line 403
    .line 404
    iget-object v2, v2, Ljb4;->m:Ld13;

    .line 405
    .line 406
    iget-object v2, v2, Ld13;->a:Landroid/os/Handler;

    .line 407
    .line 408
    invoke-static {}, Ld13;->f()Lv03;

    .line 409
    .line 410
    .line 411
    move-result-object v4

    .line 412
    const/16 v5, 0x1d

    .line 413
    .line 414
    invoke-virtual {v2, v5}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    .line 415
    .line 416
    .line 417
    move-result-object v2

    .line 418
    iput-object v2, v4, Lv03;->a:Landroid/os/Message;

    .line 419
    .line 420
    invoke-virtual {v4}, Lv03;->a()V

    .line 421
    .line 422
    .line 423
    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    const/4 v10, -0x1

    .line 429
    const/4 v5, 0x1

    .line 430
    const/4 v6, 0x0

    .line 431
    const/4 v7, 0x5

    .line 432
    move-object v4, v1

    .line 433
    invoke-virtual/range {v3 .. v10}, Lya4;->c2(Ldc4;IZIJI)V

    .line 434
    .line 435
    .line 436
    :goto_b
    sget-object v1, Lsf2;->A:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 437
    .line 438
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 439
    .line 440
    .line 441
    :cond_11
    return-void
.end method
