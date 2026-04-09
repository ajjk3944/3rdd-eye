.class public final Lk62;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lyp3;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/lang/Object;

.field public final d:Ljava/lang/Object;

.field public final e:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lft2;Ljava/lang/String;Lqb2;Lsu1;)V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, Lk62;->a:I

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk62;->c:Ljava/lang/Object;

    iput-object p2, p0, Lk62;->b:Ljava/lang/Object;

    iput-object p3, p0, Lk62;->d:Ljava/lang/Object;

    iput-object p4, p0, Lk62;->e:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Lgj2;Landroid/net/Uri$Builder;Ljava/lang/String;Landroid/view/InputEvent;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lk62;->a:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk62;->c:Ljava/lang/Object;

    iput-object p2, p0, Lk62;->d:Ljava/lang/Object;

    iput-object p3, p0, Lk62;->b:Ljava/lang/Object;

    iput-object p4, p0, Lk62;->e:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p5, p0, Lk62;->a:I

    iput-object p1, p0, Lk62;->c:Ljava/lang/Object;

    iput-object p2, p0, Lk62;->d:Ljava/lang/Object;

    iput-object p3, p0, Lk62;->e:Ljava/lang/Object;

    iput-object p4, p0, Lk62;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lmm2;Ljava/lang/String;Lg62;Lf62;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lk62;->a:I

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk62;->e:Ljava/lang/Object;

    iput-object p2, p0, Lk62;->b:Ljava/lang/Object;

    iput-object p3, p0, Lk62;->d:Ljava/lang/Object;

    iput-object p4, p0, Lk62;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ltf3;Landroid/content/Context;Landroid/view/View;Landroid/app/Activity;)V
    .locals 1

    const/4 v0, 0x7

    iput v0, p0, Lk62;->a:I

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lk62;->c:Ljava/lang/Object;

    iput-object p3, p0, Lk62;->d:Ljava/lang/Object;

    iput-object p4, p0, Lk62;->e:Ljava/lang/Object;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lk62;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ltf3;Landroid/content/Context;Ljava/lang/String;Landroid/view/View;)V
    .locals 1

    const/16 v0, 0x8

    iput v0, p0, Lk62;->a:I

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lk62;->c:Ljava/lang/Object;

    iput-object p3, p0, Lk62;->b:Ljava/lang/Object;

    iput-object p4, p0, Lk62;->d:Ljava/lang/Object;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lk62;->e:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)Ln70;
    .locals 6

    .line 1
    new-instance v4, Lpd2;

    .line 2
    .line 3
    invoke-direct {v4}, Lpd2;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lk62;->e:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lmm2;

    .line 9
    .line 10
    invoke-virtual {v0}, Lmm2;->c()Lx52;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    const-string v0, "callJs > getEngine: Promise created"

    .line 15
    .line 16
    invoke-static {v0}, Lgi2;->G(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    new-instance v0, Lmc2;

    .line 20
    .line 21
    const/16 v5, 0xb

    .line 22
    .line 23
    move-object v1, p0

    .line 24
    move-object v3, p1

    .line 25
    invoke-direct/range {v0 .. v5}, Lmc2;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 26
    .line 27
    .line 28
    new-instance p1, Ll92;

    .line 29
    .line 30
    invoke-direct {p1, p0, v4, v2}, Ll92;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v2, v0, p1}, Le6;->t(Ltd2;Lrd2;)V

    .line 34
    .line 35
    .line 36
    return-object v4
.end method

.method public final c(Ljava/lang/Object;)Ln70;
    .locals 22

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget v0, v1, Lk62;->a:I

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    move-object/from16 v0, p1

    .line 9
    .line 10
    check-cast v0, Ljava/lang/Void;

    .line 11
    .line 12
    iget-object v0, v1, Lk62;->e:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Ltf3;

    .line 15
    .line 16
    iget-object v0, v0, Ltf3;->b:Loh3;

    .line 17
    .line 18
    iget-object v2, v1, Lk62;->c:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v2, Landroid/content/Context;

    .line 21
    .line 22
    iget-object v3, v1, Lk62;->b:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v3, Ljava/lang/String;

    .line 25
    .line 26
    iget-object v4, v1, Lk62;->d:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v4, Landroid/view/View;

    .line 29
    .line 30
    iget-object v0, v0, Loh3;->f:Ljava/util/concurrent/atomic/AtomicReference;

    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    check-cast v0, Lkh3;

    .line 37
    .line 38
    invoke-interface {v0, v2, v3, v4}, Lkh3;->f(Landroid/content/Context;Ljava/lang/String;Landroid/view/View;)Ln70;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    return-object v0

    .line 43
    :pswitch_0
    move-object/from16 v0, p1

    .line 44
    .line 45
    check-cast v0, Ljava/lang/Void;

    .line 46
    .line 47
    iget-object v0, v1, Lk62;->d:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v0, Landroid/view/View;

    .line 50
    .line 51
    iget-object v2, v1, Lk62;->e:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v2, Landroid/app/Activity;

    .line 54
    .line 55
    iget-object v3, v1, Lk62;->b:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v3, Ltf3;

    .line 58
    .line 59
    iget-object v3, v3, Ltf3;->b:Loh3;

    .line 60
    .line 61
    iget-object v4, v1, Lk62;->c:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v4, Landroid/content/Context;

    .line 64
    .line 65
    iget-object v3, v3, Loh3;->f:Ljava/util/concurrent/atomic/AtomicReference;

    .line 66
    .line 67
    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v3

    .line 71
    check-cast v3, Lkh3;

    .line 72
    .line 73
    invoke-interface {v3, v4, v0, v2}, Lkh3;->b(Landroid/content/Context;Landroid/view/View;Landroid/app/Activity;)Ln70;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    return-object v0

    .line 78
    :pswitch_1
    iget-object v0, v1, Lk62;->c:Ljava/lang/Object;

    .line 79
    .line 80
    move-object v2, v0

    .line 81
    check-cast v2, Lgc3;

    .line 82
    .line 83
    iget-object v0, v1, Lk62;->d:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast v0, Lz71;

    .line 86
    .line 87
    iget-object v3, v1, Lk62;->e:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast v3, Lt83;

    .line 90
    .line 91
    iget-object v4, v1, Lk62;->b:Ljava/lang/Object;

    .line 92
    .line 93
    check-cast v4, La73;

    .line 94
    .line 95
    move-object/from16 v5, p1

    .line 96
    .line 97
    check-cast v5, Le93;

    .line 98
    .line 99
    monitor-enter v2

    .line 100
    const/4 v6, 0x1

    .line 101
    :try_start_0
    iput-boolean v6, v2, Lgc3;->b:Z

    .line 102
    .line 103
    iget-object v0, v0, Lz71;->g:Ljava/lang/Object;

    .line 104
    .line 105
    check-cast v0, Lvg0;

    .line 106
    .line 107
    iget-object v0, v0, Lvg0;->g:Ljava/lang/Object;

    .line 108
    .line 109
    check-cast v0, Llm2;

    .line 110
    .line 111
    iput-object v0, v5, Le93;->a:Llm2;

    .line 112
    .line 113
    iget-boolean v0, v2, Lgc3;->a:Z

    .line 114
    .line 115
    if-nez v0, :cond_0

    .line 116
    .line 117
    iget-object v0, v4, La73;->g:Lf93;

    .line 118
    .line 119
    invoke-virtual {v3, v0, v5}, Lt83;->W(Lf93;Le93;)V

    .line 120
    .line 121
    .line 122
    sget-object v0, Llq3;->g:Llq3;

    .line 123
    .line 124
    monitor-exit v2

    .line 125
    goto :goto_0

    .line 126
    :catchall_0
    move-exception v0

    .line 127
    goto :goto_1

    .line 128
    :cond_0
    new-instance v0, Lk93;

    .line 129
    .line 130
    invoke-direct {v0, v5, v4}, Lk93;-><init>(Le93;La73;)V

    .line 131
    .line 132
    .line 133
    invoke-static {v0}, Lpu1;->r(Ljava/lang/Object;)Llq3;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    monitor-exit v2

    .line 138
    :goto_0
    return-object v0

    .line 139
    :goto_1
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 140
    throw v0

    .line 141
    :pswitch_2
    iget-object v0, v1, Lk62;->c:Ljava/lang/Object;

    .line 142
    .line 143
    check-cast v0, Ls13;

    .line 144
    .line 145
    iget-object v2, v1, Lk62;->d:Ljava/lang/Object;

    .line 146
    .line 147
    check-cast v2, La83;

    .line 148
    .line 149
    iget-object v3, v1, Lk62;->e:Ljava/lang/Object;

    .line 150
    .line 151
    check-cast v3, Lh83;

    .line 152
    .line 153
    iget-object v4, v1, Lk62;->b:Ljava/lang/Object;

    .line 154
    .line 155
    check-cast v4, Lzz2;

    .line 156
    .line 157
    move-object/from16 v5, p1

    .line 158
    .line 159
    check-cast v5, Ljava/lang/Throwable;

    .line 160
    .line 161
    iget-object v5, v0, Ls13;->j:Landroid/content/Context;

    .line 162
    .line 163
    const/16 v6, 0xc

    .line 164
    .line 165
    invoke-static {v5, v6}, Laa3;->l(Landroid/content/Context;I)Laa3;

    .line 166
    .line 167
    .line 168
    move-result-object v5

    .line 169
    iget-object v6, v2, La83;->E:Ljava/lang/String;

    .line 170
    .line 171
    invoke-interface {v5, v6}, Laa3;->q0(Ljava/lang/String;)Laa3;

    .line 172
    .line 173
    .line 174
    invoke-interface {v5}, Laa3;->a()Laa3;

    .line 175
    .line 176
    .line 177
    invoke-interface {v4, v3, v2}, Lzz2;->b(Lh83;La83;)Ln70;

    .line 178
    .line 179
    .line 180
    move-result-object v4

    .line 181
    iget v6, v2, La83;->R:I

    .line 182
    .line 183
    int-to-long v6, v6

    .line 184
    sget-object v8, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 185
    .line 186
    iget-object v9, v0, Ls13;->f:Ljava/util/concurrent/ScheduledExecutorService;

    .line 187
    .line 188
    invoke-static {v4, v6, v7, v8, v9}, Lpu1;->N(Ln70;JLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/ScheduledExecutorService;)Ln70;

    .line 189
    .line 190
    .line 191
    move-result-object v4

    .line 192
    iget-object v6, v0, Ls13;->c:Ldb3;

    .line 193
    .line 194
    iget-object v7, v0, Ls13;->h:Lo13;

    .line 195
    .line 196
    invoke-virtual {v7, v3, v2, v4, v6}, Lo13;->b(Lh83;La83;Ln70;Ldb3;)V

    .line 197
    .line 198
    .line 199
    iget-object v0, v0, Ls13;->k:Lda3;

    .line 200
    .line 201
    const/4 v2, 0x0

    .line 202
    invoke-static {v4, v0, v5, v2}, Lqb1;->P(Ln70;Lda3;Laa3;Z)V

    .line 203
    .line 204
    .line 205
    return-object v4

    .line 206
    :pswitch_3
    iget-object v0, v1, Lk62;->c:Ljava/lang/Object;

    .line 207
    .line 208
    check-cast v0, Lt83;

    .line 209
    .line 210
    iget-object v2, v1, Lk62;->d:Ljava/lang/Object;

    .line 211
    .line 212
    check-cast v2, Loy2;

    .line 213
    .line 214
    iget-object v3, v1, Lk62;->e:Ljava/lang/Object;

    .line 215
    .line 216
    check-cast v3, Lfa2;

    .line 217
    .line 218
    iget-object v4, v1, Lk62;->b:Ljava/lang/Object;

    .line 219
    .line 220
    check-cast v4, Lyp3;

    .line 221
    .line 222
    move-object/from16 v5, p1

    .line 223
    .line 224
    check-cast v5, Lmy2;

    .line 225
    .line 226
    iget-object v0, v0, Lt83;->g:Ljava/lang/Object;

    .line 227
    .line 228
    check-cast v0, Lpq3;

    .line 229
    .line 230
    invoke-interface {v2, v3}, Loy2;->e(Lfa2;)Ln70;

    .line 231
    .line 232
    .line 233
    move-result-object v2

    .line 234
    invoke-static {v2, v4, v0}, Lpu1;->O(Ln70;Lyp3;Ljava/util/concurrent/Executor;)Lqp3;

    .line 235
    .line 236
    .line 237
    move-result-object v0

    .line 238
    return-object v0

    .line 239
    :pswitch_4
    iget-object v0, v1, Lk62;->c:Ljava/lang/Object;

    .line 240
    .line 241
    check-cast v0, Lft2;

    .line 242
    .line 243
    iget-object v2, v1, Lk62;->b:Ljava/lang/Object;

    .line 244
    .line 245
    check-cast v2, Ljava/lang/String;

    .line 246
    .line 247
    iget-object v3, v1, Lk62;->d:Ljava/lang/Object;

    .line 248
    .line 249
    check-cast v3, Lsb2;

    .line 250
    .line 251
    iget-object v4, v1, Lk62;->e:Ljava/lang/Object;

    .line 252
    .line 253
    check-cast v4, Lsu1;

    .line 254
    .line 255
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 256
    .line 257
    .line 258
    sget-object v5, Lhg4;->C:Lhg4;

    .line 259
    .line 260
    iget-object v5, v5, Lhg4;->d:Lsd2;

    .line 261
    .line 262
    iget-object v6, v0, Lft2;->a:Landroid/content/Context;

    .line 263
    .line 264
    iget-object v5, v0, Lft2;->p:Lpz2;

    .line 265
    .line 266
    new-instance v7, Lzq;

    .line 267
    .line 268
    const/4 v8, 0x0

    .line 269
    invoke-direct {v7, v8, v8, v8}, Lzq;-><init>(III)V

    .line 270
    .line 271
    .line 272
    iget-object v11, v0, Lft2;->c:Lvs1;

    .line 273
    .line 274
    iget-object v15, v0, Lft2;->e:Ll92;

    .line 275
    .line 276
    iget-object v8, v0, Lft2;->q:Lm83;

    .line 277
    .line 278
    move-object/from16 v20, v8

    .line 279
    .line 280
    const-string v8, "native-omid"

    .line 281
    .line 282
    iget-object v13, v0, Lft2;->d:Le51;

    .line 283
    .line 284
    iget-object v9, v0, Lft2;->f:Lcx1;

    .line 285
    .line 286
    const/16 v18, 0x0

    .line 287
    .line 288
    iget-object v0, v0, Lft2;->m:Lmv2;

    .line 289
    .line 290
    move-object/from16 v16, v9

    .line 291
    .line 292
    const/4 v9, 0x0

    .line 293
    const/4 v10, 0x0

    .line 294
    const/4 v12, 0x0

    .line 295
    const/4 v14, 0x0

    .line 296
    const/16 v17, 0x0

    .line 297
    .line 298
    move-object/from16 v21, v0

    .line 299
    .line 300
    move-object/from16 v19, v5

    .line 301
    .line 302
    invoke-static/range {v6 .. v21}, Lsd2;->b(Landroid/content/Context;Lzq;Ljava/lang/String;ZZLvs1;Lf02;Le51;Lkf3;Ll92;Lcx1;La83;Lc83;Lpz2;Lm83;Lmv2;)Lag2;

    .line 303
    .line 304
    .line 305
    move-result-object v0

    .line 306
    new-instance v5, Lyw1;

    .line 307
    .line 308
    invoke-direct {v5, v0}, Lyw1;-><init>(Ljava/lang/Object;)V

    .line 309
    .line 310
    .line 311
    invoke-interface {v0}, Lag2;->e0()Lsg2;

    .line 312
    .line 313
    .line 314
    move-result-object v6

    .line 315
    new-instance v7, Lf20;

    .line 316
    .line 317
    const/16 v8, 0x15

    .line 318
    .line 319
    invoke-direct {v7, v8, v5}, Lf20;-><init>(ILjava/lang/Object;)V

    .line 320
    .line 321
    .line 322
    iput-object v7, v6, Lsg2;->l:Lug2;

    .line 323
    .line 324
    invoke-virtual {v2}, Ljava/lang/String;->getBytes()[B

    .line 325
    .line 326
    .line 327
    move-result-object v2

    .line 328
    const/4 v6, 0x1

    .line 329
    invoke-static {v2, v6}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    .line 330
    .line 331
    .line 332
    move-result-object v2

    .line 333
    const-string v6, "text/html"

    .line 334
    .line 335
    const-string v7, "base64"

    .line 336
    .line 337
    invoke-interface {v0, v2, v6, v7}, Lag2;->loadData(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 338
    .line 339
    .line 340
    sget-object v2, Lmz1;->pe:Liz1;

    .line 341
    .line 342
    sget-object v6, Ltw1;->e:Ltw1;

    .line 343
    .line 344
    iget-object v6, v6, Ltw1;->c:Lkz1;

    .line 345
    .line 346
    invoke-virtual {v6, v2}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 347
    .line 348
    .line 349
    move-result-object v2

    .line 350
    check-cast v2, Ljava/lang/Boolean;

    .line 351
    .line 352
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 353
    .line 354
    .line 355
    move-result v2

    .line 356
    if-eqz v2, :cond_2

    .line 357
    .line 358
    if-eqz v3, :cond_1

    .line 359
    .line 360
    invoke-interface {v0}, Lag2;->e0()Lsg2;

    .line 361
    .line 362
    .line 363
    move-result-object v2

    .line 364
    iput-object v3, v2, Lsg2;->D:Lsb2;

    .line 365
    .line 366
    :cond_1
    invoke-interface {v0}, Lag2;->e0()Lsg2;

    .line 367
    .line 368
    .line 369
    move-result-object v0

    .line 370
    iput-object v4, v0, Lsg2;->B:Lsu1;

    .line 371
    .line 372
    :cond_2
    return-object v5

    .line 373
    :pswitch_5
    iget-object v0, v1, Lk62;->c:Ljava/lang/Object;

    .line 374
    .line 375
    check-cast v0, Ljava/lang/Long;

    .line 376
    .line 377
    iget-object v2, v1, Lk62;->d:Ljava/lang/Object;

    .line 378
    .line 379
    check-cast v2, Lmv2;

    .line 380
    .line 381
    iget-object v3, v1, Lk62;->e:Ljava/lang/Object;

    .line 382
    .line 383
    check-cast v3, Laa3;

    .line 384
    .line 385
    iget-object v4, v1, Lk62;->b:Ljava/lang/Object;

    .line 386
    .line 387
    check-cast v4, Lea3;

    .line 388
    .line 389
    move-object/from16 v5, p1

    .line 390
    .line 391
    check-cast v5, Lorg/json/JSONObject;

    .line 392
    .line 393
    const-string v6, "isSuccessful"

    .line 394
    .line 395
    const/4 v7, 0x0

    .line 396
    invoke-virtual {v5, v6, v7}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 397
    .line 398
    .line 399
    move-result v6

    .line 400
    if-eqz v6, :cond_7

    .line 401
    .line 402
    const-string v8, "appSettingsJson"

    .line 403
    .line 404
    invoke-virtual {v5, v8}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 405
    .line 406
    .line 407
    move-result-object v8

    .line 408
    sget-object v9, Lhg4;->C:Lhg4;

    .line 409
    .line 410
    iget-object v10, v9, Lhg4;->h:Lgd2;

    .line 411
    .line 412
    invoke-virtual {v10}, Lgd2;->g()Lra4;

    .line 413
    .line 414
    .line 415
    move-result-object v10

    .line 416
    invoke-virtual {v10}, Lra4;->h()V

    .line 417
    .line 418
    .line 419
    iget-object v11, v10, Lra4;->a:Ljava/lang/Object;

    .line 420
    .line 421
    monitor-enter v11

    .line 422
    :try_start_1
    iget-object v9, v9, Lhg4;->k:Lym;

    .line 423
    .line 424
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 425
    .line 426
    .line 427
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 428
    .line 429
    .line 430
    move-result-wide v12

    .line 431
    if-eqz v8, :cond_6

    .line 432
    .line 433
    iget-object v9, v10, Lra4;->n:Led2;

    .line 434
    .line 435
    iget-object v9, v9, Led2;->e:Ljava/lang/String;

    .line 436
    .line 437
    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 438
    .line 439
    .line 440
    move-result v9

    .line 441
    if-eqz v9, :cond_3

    .line 442
    .line 443
    goto :goto_4

    .line 444
    :cond_3
    new-instance v9, Led2;

    .line 445
    .line 446
    invoke-direct {v9, v8, v12, v13}, Led2;-><init>(Ljava/lang/String;J)V

    .line 447
    .line 448
    .line 449
    iput-object v9, v10, Lra4;->n:Led2;

    .line 450
    .line 451
    iget-object v9, v10, Lra4;->g:Landroid/content/SharedPreferences$Editor;

    .line 452
    .line 453
    if-eqz v9, :cond_4

    .line 454
    .line 455
    const-string v14, "app_settings_json"

    .line 456
    .line 457
    invoke-interface {v9, v14, v8}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 458
    .line 459
    .line 460
    iget-object v8, v10, Lra4;->g:Landroid/content/SharedPreferences$Editor;

    .line 461
    .line 462
    const-string v9, "app_settings_last_update_ms"

    .line 463
    .line 464
    invoke-interface {v8, v9, v12, v13}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 465
    .line 466
    .line 467
    iget-object v8, v10, Lra4;->g:Landroid/content/SharedPreferences$Editor;

    .line 468
    .line 469
    invoke-interface {v8}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 470
    .line 471
    .line 472
    goto :goto_2

    .line 473
    :catchall_1
    move-exception v0

    .line 474
    goto :goto_6

    .line 475
    :cond_4
    :goto_2
    invoke-virtual {v10}, Lra4;->i()V

    .line 476
    .line 477
    .line 478
    iget-object v8, v10, Lra4;->c:Ljava/util/ArrayList;

    .line 479
    .line 480
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 481
    .line 482
    .line 483
    move-result v9

    .line 484
    :goto_3
    if-ge v7, v9, :cond_5

    .line 485
    .line 486
    invoke-virtual {v8, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 487
    .line 488
    .line 489
    move-result-object v10

    .line 490
    add-int/lit8 v7, v7, 0x1

    .line 491
    .line 492
    check-cast v10, Ljava/lang/Runnable;

    .line 493
    .line 494
    invoke-interface {v10}, Ljava/lang/Runnable;->run()V

    .line 495
    .line 496
    .line 497
    goto :goto_3

    .line 498
    :cond_5
    monitor-exit v11

    .line 499
    goto :goto_5

    .line 500
    :cond_6
    :goto_4
    iget-object v7, v10, Lra4;->n:Led2;

    .line 501
    .line 502
    iput-wide v12, v7, Led2;->f:J

    .line 503
    .line 504
    monitor-exit v11
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 505
    :goto_5
    if-eqz v0, :cond_7

    .line 506
    .line 507
    sget-object v7, Lhg4;->C:Lhg4;

    .line 508
    .line 509
    iget-object v7, v7, Lhg4;->k:Lym;

    .line 510
    .line 511
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 512
    .line 513
    .line 514
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 515
    .line 516
    .line 517
    move-result-wide v7

    .line 518
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 519
    .line 520
    .line 521
    move-result-wide v9

    .line 522
    sub-long/2addr v7, v9

    .line 523
    const-string v0, "cld_s"

    .line 524
    .line 525
    invoke-static {v2, v0, v7, v8}, Lue;->G(Lmv2;Ljava/lang/String;J)V

    .line 526
    .line 527
    .line 528
    goto :goto_7

    .line 529
    :goto_6
    :try_start_2
    monitor-exit v11
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 530
    throw v0

    .line 531
    :cond_7
    :goto_7
    const-string v0, "errorReason"

    .line 532
    .line 533
    const-string v2, ""

    .line 534
    .line 535
    invoke-virtual {v5, v0, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 536
    .line 537
    .line 538
    move-result-object v0

    .line 539
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 540
    .line 541
    .line 542
    move-result v2

    .line 543
    if-nez v2, :cond_8

    .line 544
    .line 545
    invoke-interface {v3, v0}, Laa3;->m(Ljava/lang/String;)Laa3;

    .line 546
    .line 547
    .line 548
    :cond_8
    invoke-interface {v3, v6}, Laa3;->b(Z)Laa3;

    .line 549
    .line 550
    .line 551
    invoke-interface {v3}, Laa3;->n()Lca3;

    .line 552
    .line 553
    .line 554
    move-result-object v0

    .line 555
    invoke-virtual {v4, v0}, Lea3;->b(Lca3;)V

    .line 556
    .line 557
    .line 558
    sget-object v0, Llq3;->g:Llq3;

    .line 559
    .line 560
    return-object v0

    .line 561
    :pswitch_6
    iget-object v0, v1, Lk62;->c:Ljava/lang/Object;

    .line 562
    .line 563
    move-object v2, v0

    .line 564
    check-cast v2, Lgj2;

    .line 565
    .line 566
    iget-object v0, v1, Lk62;->d:Ljava/lang/Object;

    .line 567
    .line 568
    move-object v3, v0

    .line 569
    check-cast v3, Landroid/net/Uri$Builder;

    .line 570
    .line 571
    iget-object v0, v1, Lk62;->b:Ljava/lang/Object;

    .line 572
    .line 573
    check-cast v0, Ljava/lang/String;

    .line 574
    .line 575
    iget-object v4, v1, Lk62;->e:Ljava/lang/Object;

    .line 576
    .line 577
    check-cast v4, Landroid/view/InputEvent;

    .line 578
    .line 579
    move-object/from16 v5, p1

    .line 580
    .line 581
    check-cast v5, Ljava/lang/Integer;

    .line 582
    .line 583
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 584
    .line 585
    .line 586
    move-result v5

    .line 587
    const/4 v6, 0x1

    .line 588
    if-ne v5, v6, :cond_a

    .line 589
    .line 590
    invoke-virtual {v3}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    .line 591
    .line 592
    .line 593
    move-result-object v5

    .line 594
    invoke-virtual {v5}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    .line 595
    .line 596
    .line 597
    move-result-object v5

    .line 598
    sget-object v6, Lmz1;->Za:Liz1;

    .line 599
    .line 600
    sget-object v7, Ltw1;->e:Ltw1;

    .line 601
    .line 602
    iget-object v7, v7, Ltw1;->c:Lkz1;

    .line 603
    .line 604
    invoke-virtual {v7, v6}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 605
    .line 606
    .line 607
    move-result-object v6

    .line 608
    check-cast v6, Ljava/lang/String;

    .line 609
    .line 610
    const-string v8, "1"

    .line 611
    .line 612
    invoke-virtual {v5, v6, v8}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 613
    .line 614
    .line 615
    sget-object v6, Lmz1;->Ya:Liz1;

    .line 616
    .line 617
    invoke-virtual {v7, v6}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 618
    .line 619
    .line 620
    move-result-object v6

    .line 621
    check-cast v6, Ljava/lang/String;

    .line 622
    .line 623
    const-string v8, "12"

    .line 624
    .line 625
    invoke-virtual {v5, v6, v8}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 626
    .line 627
    .line 628
    sget-object v6, Lmz1;->ab:Liz1;

    .line 629
    .line 630
    invoke-virtual {v7, v6}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 631
    .line 632
    .line 633
    move-result-object v6

    .line 634
    check-cast v6, Ljava/lang/CharSequence;

    .line 635
    .line 636
    invoke-virtual {v0, v6}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 637
    .line 638
    .line 639
    move-result v0

    .line 640
    if-eqz v0, :cond_9

    .line 641
    .line 642
    sget-object v0, Lmz1;->bb:Liz1;

    .line 643
    .line 644
    invoke-virtual {v7, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 645
    .line 646
    .line 647
    move-result-object v0

    .line 648
    check-cast v0, Ljava/lang/String;

    .line 649
    .line 650
    invoke-virtual {v5, v0}, Landroid/net/Uri$Builder;->authority(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 651
    .line 652
    .line 653
    :cond_9
    iget-object v0, v2, Lgj2;->c:Lyz2;

    .line 654
    .line 655
    invoke-virtual {v5}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    .line 656
    .line 657
    .line 658
    move-result-object v5

    .line 659
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 660
    .line 661
    .line 662
    :try_start_3
    iget-object v0, v0, Lyz2;->a:Lwc0;

    .line 663
    .line 664
    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 665
    .line 666
    .line 667
    invoke-virtual {v0, v5, v4}, Lwc0;->c(Landroid/net/Uri;Landroid/view/InputEvent;)Ln70;

    .line 668
    .line 669
    .line 670
    move-result-object v0
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    .line 671
    goto :goto_8

    .line 672
    :catch_0
    move-exception v0

    .line 673
    invoke-static {v0}, Lpu1;->B(Ljava/lang/Throwable;)Lkq3;

    .line 674
    .line 675
    .line 676
    move-result-object v0

    .line 677
    :goto_8
    invoke-static {v0}, Lgq3;->r(Ln70;)Lgq3;

    .line 678
    .line 679
    .line 680
    move-result-object v0

    .line 681
    new-instance v4, Lu42;

    .line 682
    .line 683
    const/4 v5, 0x2

    .line 684
    invoke-direct {v4, v5, v3}, Lu42;-><init>(ILjava/lang/Object;)V

    .line 685
    .line 686
    .line 687
    iget-object v2, v2, Lgj2;->f:Lpq3;

    .line 688
    .line 689
    invoke-static {v0, v4, v2}, Lpu1;->O(Ln70;Lyp3;Ljava/util/concurrent/Executor;)Lqp3;

    .line 690
    .line 691
    .line 692
    move-result-object v0

    .line 693
    goto :goto_9

    .line 694
    :cond_a
    sget-object v0, Lmz1;->Ya:Liz1;

    .line 695
    .line 696
    sget-object v2, Ltw1;->e:Ltw1;

    .line 697
    .line 698
    iget-object v2, v2, Ltw1;->c:Lkz1;

    .line 699
    .line 700
    invoke-virtual {v2, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 701
    .line 702
    .line 703
    move-result-object v0

    .line 704
    check-cast v0, Ljava/lang/String;

    .line 705
    .line 706
    const-string v2, "10"

    .line 707
    .line 708
    invoke-virtual {v3, v0, v2}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 709
    .line 710
    .line 711
    invoke-virtual {v3}, Landroid/net/Uri$Builder;->toString()Ljava/lang/String;

    .line 712
    .line 713
    .line 714
    move-result-object v0

    .line 715
    invoke-static {v0}, Lpu1;->r(Ljava/lang/Object;)Llq3;

    .line 716
    .line 717
    .line 718
    move-result-object v0

    .line 719
    :goto_9
    return-object v0

    .line 720
    :pswitch_7
    invoke-virtual/range {p0 .. p1}, Lk62;->a(Ljava/lang/Object;)Ln70;

    .line 721
    .line 722
    .line 723
    move-result-object v0

    .line 724
    return-object v0

    .line 725
    :pswitch_data_0
    .packed-switch 0x0
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
