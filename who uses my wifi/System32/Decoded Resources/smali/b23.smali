.class public final Lb23;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lzz2;


# instance fields
.field public final synthetic a:I

.field public final b:Lpq3;

.field public final c:Lu93;

.field public final d:Ljava/lang/Object;

.field public final e:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lu93;Lpq3;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p5, p0, Lb23;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lb23;->c:Lu93;

    .line 4
    .line 5
    iput-object p2, p0, Lb23;->b:Lpq3;

    .line 6
    .line 7
    iput-object p4, p0, Lb23;->e:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p3, p0, Lb23;->d:Ljava/lang/Object;

    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public static final c(Ljava/lang/String;I)Ljava/lang/String;
    .locals 3

    .line 1
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    new-instance v2, Ljava/lang/StringBuilder;

    .line 18
    .line 19
    add-int/lit8 v0, v0, 0x14

    .line 20
    .line 21
    add-int/2addr v0, v1

    .line 22
    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 23
    .line 24
    .line 25
    const-string v0, "Error from: "

    .line 26
    .line 27
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string p0, ", code: "

    .line 34
    .line 35
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    return-object p0
.end method


# virtual methods
.method public final a(Lh83;La83;)Z
    .locals 0

    .line 1
    iget p1, p0, Lb23;->a:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lb23;->d:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p1, Lvz1;

    .line 9
    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    iget-object p1, p2, La83;->s:Le83;

    .line 13
    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    iget-object p1, p1, Le83;->a:Ljava/lang/String;

    .line 17
    .line 18
    if-eqz p1, :cond_0

    .line 19
    .line 20
    const/4 p1, 0x1

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/4 p1, 0x0

    .line 23
    :goto_0
    return p1

    .line 24
    :pswitch_0
    iget-object p1, p2, La83;->t:Ljava/util/List;

    .line 25
    .line 26
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    xor-int/lit8 p1, p1, 0x1

    .line 31
    .line 32
    return p1

    .line 33
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final b(Lh83;La83;)Ln70;
    .locals 15

    .line 1
    iget v0, p0, Lb23;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v2, Lpd2;

    .line 7
    .line 8
    invoke-direct {v2}, Lpd2;-><init>()V

    .line 9
    .line 10
    .line 11
    new-instance v5, Lsq0;

    .line 12
    .line 13
    const/16 v0, 0x12

    .line 14
    .line 15
    invoke-direct {v5, v0}, Lsq0;-><init>(I)V

    .line 16
    .line 17
    .line 18
    new-instance v0, Lg4;

    .line 19
    .line 20
    const/16 v6, 0xb

    .line 21
    .line 22
    const/4 v7, 0x0

    .line 23
    move-object v1, p0

    .line 24
    move-object/from16 v3, p1

    .line 25
    .line 26
    move-object/from16 v4, p2

    .line 27
    .line 28
    invoke-direct/range {v0 .. v7}, Lg4;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 29
    .line 30
    .line 31
    move-object v3, v4

    .line 32
    monitor-enter v5

    .line 33
    :try_start_0
    iput-object v0, v5, Lsq0;->g:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    .line 35
    monitor-exit v5

    .line 36
    new-instance v0, Luz1;

    .line 37
    .line 38
    iget-object v3, v3, La83;->s:Le83;

    .line 39
    .line 40
    iget-object v4, v3, Le83;->b:Ljava/lang/String;

    .line 41
    .line 42
    iget-object v3, v3, Le83;->a:Ljava/lang/String;

    .line 43
    .line 44
    invoke-direct {v0, v5, v4, v3}, Luz1;-><init>(Lch3;Ljava/lang/String;Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    sget-object v8, Ls93;->v:Ls93;

    .line 48
    .line 49
    iget-object v7, p0, Lb23;->c:Lu93;

    .line 50
    .line 51
    invoke-static {v7}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    new-instance v3, Llv2;

    .line 55
    .line 56
    const/4 v4, 0x4

    .line 57
    invoke-direct {v3, p0, v0, v4}, Llv2;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 58
    .line 59
    .line 60
    iget-object v0, p0, Lb23;->b:Lpq3;

    .line 61
    .line 62
    new-instance v4, Lw53;

    .line 63
    .line 64
    const/4 v5, 0x3

    .line 65
    invoke-direct {v4, v5, v3}, Lw53;-><init>(ILjava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    new-instance v6, Lbu1;

    .line 69
    .line 70
    sget-object v10, Lu93;->d:Llq3;

    .line 71
    .line 72
    sget-object v11, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 73
    .line 74
    check-cast v0, Lld2;

    .line 75
    .line 76
    invoke-virtual {v0, v4}, Lld2;->c(Ljava/util/concurrent/Callable;)Ln70;

    .line 77
    .line 78
    .line 79
    move-result-object v12

    .line 80
    const/4 v9, 0x0

    .line 81
    invoke-direct/range {v6 .. v12}, Lbu1;-><init>(Lu93;Ljava/lang/Object;Ljava/lang/String;Ln70;Ljava/util/List;Ln70;)V

    .line 82
    .line 83
    .line 84
    sget-object v0, Ls93;->w:Ls93;

    .line 85
    .line 86
    iget-object v3, v6, Lbu1;->l:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast v3, Lu93;

    .line 89
    .line 90
    invoke-virtual {v6}, Lbu1;->A()Lq93;

    .line 91
    .line 92
    .line 93
    move-result-object v4

    .line 94
    invoke-virtual {v3, v4, v0}, Lu93;->a(Ln70;Ljava/lang/Object;)Lbu1;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    new-instance v3, Lp62;

    .line 99
    .line 100
    const/4 v4, 0x1

    .line 101
    invoke-direct {v3, v4, v2}, Lp62;-><init>(ILn70;)V

    .line 102
    .line 103
    .line 104
    sget-object v2, Lmd2;->g:Lld2;

    .line 105
    .line 106
    new-instance v4, Lbu1;

    .line 107
    .line 108
    iget-object v5, v0, Lbu1;->k:Ljava/lang/Object;

    .line 109
    .line 110
    check-cast v5, Ln70;

    .line 111
    .line 112
    iget-object v6, v0, Lbu1;->l:Ljava/lang/Object;

    .line 113
    .line 114
    check-cast v6, Lu93;

    .line 115
    .line 116
    move-object v7, v6

    .line 117
    iget-object v6, v0, Lbu1;->g:Ljava/lang/Object;

    .line 118
    .line 119
    iget-object v8, v0, Lbu1;->h:Ljava/lang/Object;

    .line 120
    .line 121
    check-cast v8, Ljava/lang/String;

    .line 122
    .line 123
    iget-object v9, v0, Lbu1;->i:Ljava/lang/Object;

    .line 124
    .line 125
    check-cast v9, Ln70;

    .line 126
    .line 127
    iget-object v0, v0, Lbu1;->j:Ljava/lang/Object;

    .line 128
    .line 129
    check-cast v0, Ljava/util/List;

    .line 130
    .line 131
    invoke-static {v5, v3, v2}, Lpu1;->O(Ln70;Lyp3;Ljava/util/concurrent/Executor;)Lqp3;

    .line 132
    .line 133
    .line 134
    move-result-object v10

    .line 135
    move-object v5, v7

    .line 136
    move-object v7, v8

    .line 137
    move-object v8, v9

    .line 138
    move-object v9, v0

    .line 139
    invoke-direct/range {v4 .. v10}, Lbu1;-><init>(Lu93;Ljava/lang/Object;Ljava/lang/String;Ln70;Ljava/util/List;Ln70;)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {v4}, Lbu1;->A()Lq93;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    return-object v0

    .line 147
    :catchall_0
    move-exception v0

    .line 148
    :try_start_1
    monitor-exit v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 149
    throw v0

    .line 150
    :pswitch_0
    move-object/from16 v2, p1

    .line 151
    .line 152
    move-object/from16 v3, p2

    .line 153
    .line 154
    const-class v0, Lcom/google/ads/mediation/admob/AdMobAdapter;

    .line 155
    .line 156
    iget-object v4, v3, La83;->t:Ljava/util/List;

    .line 157
    .line 158
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 159
    .line 160
    .line 161
    move-result-object v4

    .line 162
    :catch_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 163
    .line 164
    .line 165
    move-result v5

    .line 166
    if-eqz v5, :cond_0

    .line 167
    .line 168
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v5

    .line 172
    check-cast v5, Ljava/lang/String;

    .line 173
    .line 174
    :try_start_2
    iget-object v6, p0, Lb23;->d:Ljava/lang/Object;

    .line 175
    .line 176
    check-cast v6, Lb03;

    .line 177
    .line 178
    iget-object v7, v3, La83;->v:Lorg/json/JSONObject;

    .line 179
    .line 180
    invoke-interface {v6, v5, v7}, Lb03;->a(Ljava/lang/String;Lorg/json/JSONObject;)Lc03;

    .line 181
    .line 182
    .line 183
    move-result-object v4
    :try_end_2
    .catch Ln83; {:try_start_2 .. :try_end_2} :catch_0

    .line 184
    goto :goto_0

    .line 185
    :cond_0
    const/4 v4, 0x0

    .line 186
    :goto_0
    if-nez v4, :cond_1

    .line 187
    .line 188
    new-instance v0, Lg13;

    .line 189
    .line 190
    const/4 v2, 0x3

    .line 191
    const-string v3, "Unable to instantiate mediation adapter class."

    .line 192
    .line 193
    invoke-direct {v0, v3, v2}, Lhx2;-><init>(Ljava/lang/String;I)V

    .line 194
    .line 195
    .line 196
    invoke-static {v0}, Lpu1;->B(Ljava/lang/Throwable;)Lkq3;

    .line 197
    .line 198
    .line 199
    move-result-object v0

    .line 200
    goto/16 :goto_1

    .line 201
    .line 202
    :cond_1
    new-instance v7, Lpd2;

    .line 203
    .line 204
    invoke-direct {v7}, Lpd2;-><init>()V

    .line 205
    .line 206
    .line 207
    new-instance v5, Lwy0;

    .line 208
    .line 209
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 210
    .line 211
    .line 212
    iput-object v4, v5, Lwy0;->g:Ljava/lang/Object;

    .line 213
    .line 214
    iput-object v7, v5, Lwy0;->h:Ljava/lang/Object;

    .line 215
    .line 216
    const/4 v6, 0x0

    .line 217
    iput-boolean v6, v5, Lwy0;->f:Z

    .line 218
    .line 219
    iget-object v6, v4, Lc03;->c:Lhv1;

    .line 220
    .line 221
    invoke-interface {v6, v5}, Lhn2;->l1(Lwy0;)V

    .line 222
    .line 223
    .line 224
    iget-boolean v5, v3, La83;->M:Z

    .line 225
    .line 226
    if-eqz v5, :cond_3

    .line 227
    .line 228
    iget-object v5, v2, Lh83;->a:Lf20;

    .line 229
    .line 230
    iget-object v5, v5, Lf20;->g:Ljava/lang/Object;

    .line 231
    .line 232
    check-cast v5, Ll83;

    .line 233
    .line 234
    iget-object v5, v5, Ll83;->d:Lpc4;

    .line 235
    .line 236
    iget-object v5, v5, Lpc4;->r:Landroid/os/Bundle;

    .line 237
    .line 238
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 239
    .line 240
    .line 241
    move-result-object v6

    .line 242
    invoke-virtual {v5, v6}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 243
    .line 244
    .line 245
    move-result-object v6

    .line 246
    if-nez v6, :cond_2

    .line 247
    .line 248
    new-instance v6, Landroid/os/Bundle;

    .line 249
    .line 250
    invoke-direct {v6}, Landroid/os/Bundle;-><init>()V

    .line 251
    .line 252
    .line 253
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 254
    .line 255
    .line 256
    move-result-object v0

    .line 257
    invoke-virtual {v5, v0, v6}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 258
    .line 259
    .line 260
    :cond_2
    const-string v0, "render_test_ad_label"

    .line 261
    .line 262
    const/4 v5, 0x1

    .line 263
    invoke-virtual {v6, v0, v5}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 264
    .line 265
    .line 266
    :cond_3
    iget-object v9, p0, Lb23;->c:Lu93;

    .line 267
    .line 268
    sget-object v10, Ls93;->s:Ls93;

    .line 269
    .line 270
    invoke-static {v9}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 271
    .line 272
    .line 273
    new-instance v0, Lmc2;

    .line 274
    .line 275
    const/16 v5, 0x12

    .line 276
    .line 277
    const/4 v6, 0x0

    .line 278
    move-object v1, p0

    .line 279
    invoke-direct/range {v0 .. v6}, Lmc2;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 280
    .line 281
    .line 282
    iget-object v5, p0, Lb23;->b:Lpq3;

    .line 283
    .line 284
    new-instance v6, Lw53;

    .line 285
    .line 286
    const/4 v8, 0x3

    .line 287
    invoke-direct {v6, v8, v0}, Lw53;-><init>(ILjava/lang/Object;)V

    .line 288
    .line 289
    .line 290
    new-instance v8, Lbu1;

    .line 291
    .line 292
    sget-object v12, Lu93;->d:Llq3;

    .line 293
    .line 294
    sget-object v13, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 295
    .line 296
    check-cast v5, Lld2;

    .line 297
    .line 298
    invoke-virtual {v5, v6}, Lld2;->c(Ljava/util/concurrent/Callable;)Ln70;

    .line 299
    .line 300
    .line 301
    move-result-object v14

    .line 302
    const/4 v11, 0x0

    .line 303
    invoke-direct/range {v8 .. v14}, Lbu1;-><init>(Lu93;Ljava/lang/Object;Ljava/lang/String;Ln70;Ljava/util/List;Ln70;)V

    .line 304
    .line 305
    .line 306
    sget-object v0, Ls93;->t:Ls93;

    .line 307
    .line 308
    iget-object v5, v8, Lbu1;->l:Ljava/lang/Object;

    .line 309
    .line 310
    check-cast v5, Lu93;

    .line 311
    .line 312
    invoke-virtual {v8}, Lbu1;->A()Lq93;

    .line 313
    .line 314
    .line 315
    move-result-object v6

    .line 316
    invoke-virtual {v5, v6, v0}, Lu93;->a(Ln70;Ljava/lang/Object;)Lbu1;

    .line 317
    .line 318
    .line 319
    move-result-object v0

    .line 320
    new-instance v5, Lp62;

    .line 321
    .line 322
    const/4 v6, 0x1

    .line 323
    invoke-direct {v5, v6, v7}, Lp62;-><init>(ILn70;)V

    .line 324
    .line 325
    .line 326
    sget-object v6, Lmd2;->g:Lld2;

    .line 327
    .line 328
    new-instance v7, Lbu1;

    .line 329
    .line 330
    iget-object v8, v0, Lbu1;->k:Ljava/lang/Object;

    .line 331
    .line 332
    check-cast v8, Ln70;

    .line 333
    .line 334
    iget-object v9, v0, Lbu1;->l:Ljava/lang/Object;

    .line 335
    .line 336
    check-cast v9, Lu93;

    .line 337
    .line 338
    move-object v10, v9

    .line 339
    iget-object v9, v0, Lbu1;->g:Ljava/lang/Object;

    .line 340
    .line 341
    iget-object v11, v0, Lbu1;->h:Ljava/lang/Object;

    .line 342
    .line 343
    check-cast v11, Ljava/lang/String;

    .line 344
    .line 345
    iget-object v12, v0, Lbu1;->i:Ljava/lang/Object;

    .line 346
    .line 347
    check-cast v12, Ln70;

    .line 348
    .line 349
    iget-object v0, v0, Lbu1;->j:Ljava/lang/Object;

    .line 350
    .line 351
    check-cast v0, Ljava/util/List;

    .line 352
    .line 353
    invoke-static {v8, v5, v6}, Lpu1;->O(Ln70;Lyp3;Ljava/util/concurrent/Executor;)Lqp3;

    .line 354
    .line 355
    .line 356
    move-result-object v13

    .line 357
    move-object v8, v10

    .line 358
    move-object v10, v11

    .line 359
    move-object v11, v12

    .line 360
    move-object v12, v0

    .line 361
    invoke-direct/range {v7 .. v13}, Lbu1;-><init>(Lu93;Ljava/lang/Object;Ljava/lang/String;Ln70;Ljava/util/List;Ln70;)V

    .line 362
    .line 363
    .line 364
    sget-object v0, Ls93;->u:Ls93;

    .line 365
    .line 366
    iget-object v5, v7, Lbu1;->l:Ljava/lang/Object;

    .line 367
    .line 368
    check-cast v5, Lu93;

    .line 369
    .line 370
    invoke-virtual {v7}, Lbu1;->A()Lq93;

    .line 371
    .line 372
    .line 373
    move-result-object v6

    .line 374
    invoke-virtual {v5, v6, v0}, Lu93;->a(Ln70;Ljava/lang/Object;)Lbu1;

    .line 375
    .line 376
    .line 377
    move-result-object v0

    .line 378
    new-instance v5, Lp21;

    .line 379
    .line 380
    invoke-direct {v5, p0, v2, v3, v4}, Lp21;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 381
    .line 382
    .line 383
    invoke-virtual {v0, v5}, Lbu1;->q(Lo93;)Lbu1;

    .line 384
    .line 385
    .line 386
    move-result-object v0

    .line 387
    invoke-virtual {v0}, Lbu1;->A()Lq93;

    .line 388
    .line 389
    .line 390
    move-result-object v0

    .line 391
    :goto_1
    return-object v0

    .line 392
    nop

    .line 393
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
