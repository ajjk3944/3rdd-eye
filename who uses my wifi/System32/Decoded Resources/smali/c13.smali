.class public final Lc13;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lzz2;


# instance fields
.field public final a:Lsh2;

.field public final b:Lpq3;

.field public final c:Lp21;

.field public final d:Lv83;

.field public final e:Ldu2;

.field public final f:Ljv2;

.field public final g:Le51;

.field public final h:Landroid/content/Context;


# direct methods
.method public constructor <init>(Lsh2;Lpq3;Lp21;Lv83;Ldu2;Ljv2;Le51;Landroid/content/Context;Lus0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p7, p0, Lc13;->g:Le51;

    .line 5
    .line 6
    iput-object p8, p0, Lc13;->h:Landroid/content/Context;

    .line 7
    .line 8
    iput-object p1, p0, Lc13;->a:Lsh2;

    .line 9
    .line 10
    iput-object p2, p0, Lc13;->b:Lpq3;

    .line 11
    .line 12
    iput-object p3, p0, Lc13;->c:Lp21;

    .line 13
    .line 14
    iput-object p4, p0, Lc13;->d:Lv83;

    .line 15
    .line 16
    iput-object p5, p0, Lc13;->e:Ldu2;

    .line 17
    .line 18
    iput-object p6, p0, Lc13;->f:Ljv2;

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final a(Lh83;La83;)Z
    .locals 0

    .line 1
    iget-object p1, p2, La83;->s:Le83;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    iget-object p1, p1, Le83;->c:Lorg/json/JSONObject;

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    return p1

    .line 11
    :cond_0
    const/4 p1, 0x0

    .line 12
    return p1
.end method

.method public final b(Lh83;La83;)Ln70;
    .locals 4

    .line 1
    sget-object v0, Lmz1;->o2:Liz1;

    .line 2
    .line 3
    sget-object v1, Ltw1;->e:Ltw1;

    .line 4
    .line 5
    iget-object v1, v1, Ltw1;->c:Lkz1;

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Ljava/lang/Boolean;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    iget-object v0, p0, Lc13;->f:Ljv2;

    .line 20
    .line 21
    iget-object v0, v0, Ljv2;->e:Landroid/os/Bundle;

    .line 22
    .line 23
    sget-object v1, Lhg4;->C:Lhg4;

    .line 24
    .line 25
    iget-object v1, v1, Lhg4;->k:Lym;

    .line 26
    .line 27
    const-string v2, "rendering-native-ads-native-js-webview-start"

    .line 28
    .line 29
    invoke-static {v1, v0, v2}, Lga1;->n(Lym;Landroid/os/Bundle;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    :cond_0
    iget-object v0, p0, Lc13;->d:Lv83;

    .line 33
    .line 34
    invoke-virtual {v0}, Lv83;->b()Ln70;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    new-instance v1, Lz02;

    .line 39
    .line 40
    const/16 v2, 0xc

    .line 41
    .line 42
    invoke-direct {v1, p0, p2, v2}, Lz02;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 43
    .line 44
    .line 45
    iget-object v2, p0, Lc13;->b:Lpq3;

    .line 46
    .line 47
    invoke-static {v0, v1, v2}, Lpu1;->O(Ln70;Lyp3;Ljava/util/concurrent/Executor;)Lqp3;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    new-instance v1, Lop1;

    .line 52
    .line 53
    const/16 v3, 0x9

    .line 54
    .line 55
    invoke-direct {v1, p0, p1, p2, v3}, Lop1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 56
    .line 57
    .line 58
    invoke-static {v0, v1, v2}, Lpu1;->O(Ln70;Lyp3;Ljava/util/concurrent/Executor;)Lqp3;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    return-object p1
.end method

.method public final c(Lh83;La83;Lorg/json/JSONObject;)Lcq3;
    .locals 32

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v5, p2

    .line 4
    .line 5
    sget-object v0, Lmz1;->p2:Liz1;

    .line 6
    .line 7
    sget-object v2, Ltw1;->e:Ltw1;

    .line 8
    .line 9
    iget-object v3, v2, Ltw1;->c:Lkz1;

    .line 10
    .line 11
    iget-object v12, v2, Ltw1;->c:Lkz1;

    .line 12
    .line 13
    invoke-virtual {v3, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Ljava/lang/Boolean;

    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    iget-object v0, v1, Lc13;->f:Ljv2;

    .line 26
    .line 27
    iget-object v0, v0, Ljv2;->e:Landroid/os/Bundle;

    .line 28
    .line 29
    sget-object v2, Lhg4;->C:Lhg4;

    .line 30
    .line 31
    iget-object v2, v2, Lhg4;->k:Lym;

    .line 32
    .line 33
    const-string v3, "rendering-webview-creation-start"

    .line 34
    .line 35
    invoke-static {v2, v0, v3}, Lga1;->n(Lym;Landroid/os/Bundle;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    :cond_0
    iget-object v0, v1, Lc13;->d:Lv83;

    .line 39
    .line 40
    invoke-virtual {v0}, Lv83;->b()Ln70;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    sget-object v2, Lmz1;->pe:Liz1;

    .line 45
    .line 46
    invoke-virtual {v12, v2}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    check-cast v2, Ljava/lang/Boolean;

    .line 51
    .line 52
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    iget-object v3, v1, Lc13;->h:Landroid/content/Context;

    .line 57
    .line 58
    const/4 v13, 0x0

    .line 59
    if-eqz v2, :cond_3

    .line 60
    .line 61
    iget-object v2, v5, La83;->A:Lrb2;

    .line 62
    .line 63
    if-eqz v2, :cond_2

    .line 64
    .line 65
    iget-object v4, v5, La83;->s:Le83;

    .line 66
    .line 67
    if-nez v4, :cond_1

    .line 68
    .line 69
    move-object v4, v13

    .line 70
    goto :goto_0

    .line 71
    :cond_1
    iget-object v4, v4, Le83;->b:Ljava/lang/String;

    .line 72
    .line 73
    :goto_0
    new-instance v6, Lqb2;

    .line 74
    .line 75
    iget-object v7, v1, Lc13;->g:Le51;

    .line 76
    .line 77
    invoke-direct {v6, v3, v7, v2, v4}, Lqb2;-><init>(Landroid/content/Context;Le51;Lrb2;Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_2
    move-object v6, v13

    .line 82
    :goto_1
    new-instance v2, Lsu1;

    .line 83
    .line 84
    invoke-direct {v2, v3, v6}, Lsu1;-><init>(Landroid/content/Context;Lsb2;)V

    .line 85
    .line 86
    .line 87
    move-object v9, v6

    .line 88
    :goto_2
    move-object v8, v2

    .line 89
    goto :goto_3

    .line 90
    :cond_3
    new-instance v2, Lsu1;

    .line 91
    .line 92
    invoke-direct {v2, v3, v13}, Lsu1;-><init>(Landroid/content/Context;Lsb2;)V

    .line 93
    .line 94
    .line 95
    move-object v9, v13

    .line 96
    goto :goto_2

    .line 97
    :goto_3
    iget-object v3, v1, Lc13;->c:Lp21;

    .line 98
    .line 99
    iget-object v2, v3, Lp21;->f:Ljava/lang/Object;

    .line 100
    .line 101
    move-object v15, v2

    .line 102
    check-cast v15, Lpq3;

    .line 103
    .line 104
    iget-object v2, v3, Lp21;->g:Ljava/lang/Object;

    .line 105
    .line 106
    move-object v10, v2

    .line 107
    check-cast v10, Lft2;

    .line 108
    .line 109
    iget-object v14, v10, Lft2;->h:Lr12;

    .line 110
    .line 111
    sget-object v2, Lmz1;->o2:Liz1;

    .line 112
    .line 113
    invoke-virtual {v12, v2}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v2

    .line 117
    check-cast v2, Ljava/lang/Boolean;

    .line 118
    .line 119
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 120
    .line 121
    .line 122
    move-result v2

    .line 123
    if-eqz v2, :cond_4

    .line 124
    .line 125
    iget-object v2, v3, Lp21;->i:Ljava/lang/Object;

    .line 126
    .line 127
    check-cast v2, Ljv2;

    .line 128
    .line 129
    iget-object v2, v2, Ljv2;->e:Landroid/os/Bundle;

    .line 130
    .line 131
    sget-object v4, Lhg4;->C:Lhg4;

    .line 132
    .line 133
    iget-object v4, v4, Lhg4;->k:Lym;

    .line 134
    .line 135
    const-string v6, "rendering-native-assets-loading-start"

    .line 136
    .line 137
    invoke-static {v4, v2, v6}, Lga1;->n(Lym;Landroid/os/Bundle;Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    :cond_4
    new-instance v2, Lbt2;

    .line 141
    .line 142
    const/4 v7, 0x0

    .line 143
    move-object/from16 v4, p1

    .line 144
    .line 145
    move-object/from16 v6, p3

    .line 146
    .line 147
    invoke-direct/range {v2 .. v7}, Lbt2;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 148
    .line 149
    .line 150
    move-object v4, v3

    .line 151
    move-object v3, v2

    .line 152
    move-object v2, v6

    .line 153
    move-object v5, v15

    .line 154
    check-cast v5, Lld2;

    .line 155
    .line 156
    invoke-virtual {v5, v3}, Lld2;->c(Ljava/util/concurrent/Callable;)Ln70;

    .line 157
    .line 158
    .line 159
    move-result-object v3

    .line 160
    const/16 v5, 0x2e

    .line 161
    .line 162
    invoke-virtual {v4, v5, v3}, Lp21;->M(ILn70;)V

    .line 163
    .line 164
    .line 165
    iget-object v5, v10, Lft2;->r:Ljv2;

    .line 166
    .line 167
    const-string v6, "images"

    .line 168
    .line 169
    invoke-virtual {v2, v6}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 170
    .line 171
    .line 172
    move-result-object v7

    .line 173
    iget-boolean v11, v14, Lr12;->g:Z

    .line 174
    .line 175
    iget-boolean v13, v14, Lr12;->i:Z

    .line 176
    .line 177
    move-object/from16 v17, v0

    .line 178
    .line 179
    const/16 v0, 0x2f

    .line 180
    .line 181
    invoke-virtual {v10, v7, v11, v13, v0}, Lft2;->a(Lorg/json/JSONArray;ZZI)Ln70;

    .line 182
    .line 183
    .line 184
    move-result-object v0

    .line 185
    const/16 v7, 0x30

    .line 186
    .line 187
    invoke-virtual {v4, v7, v0}, Lp21;->M(ILn70;)V

    .line 188
    .line 189
    .line 190
    move-object/from16 v13, p1

    .line 191
    .line 192
    iget-object v7, v13, Lh83;->b:Lp21;

    .line 193
    .line 194
    iget-object v7, v7, Lp21;->g:Ljava/lang/Object;

    .line 195
    .line 196
    check-cast v7, Lc83;

    .line 197
    .line 198
    sget-object v11, Lmz1;->Oa:Liz1;

    .line 199
    .line 200
    invoke-virtual {v12, v11}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    move-result-object v11

    .line 204
    check-cast v11, Ljava/lang/Boolean;

    .line 205
    .line 206
    invoke-virtual {v11}, Ljava/lang/Boolean;->booleanValue()Z

    .line 207
    .line 208
    .line 209
    move-result v11

    .line 210
    move/from16 v18, v11

    .line 211
    .line 212
    const-string v11, "html"

    .line 213
    .line 214
    if-nez v18, :cond_5

    .line 215
    .line 216
    sget-object v18, Llq3;->g:Llq3;

    .line 217
    .line 218
    :goto_4
    move-object/from16 v25, v3

    .line 219
    .line 220
    move-object/from16 v27, v4

    .line 221
    .line 222
    move-object/from16 v26, v5

    .line 223
    .line 224
    move-object/from16 v29, v6

    .line 225
    .line 226
    move-object v5, v7

    .line 227
    move-object v6, v8

    .line 228
    move-object v7, v9

    .line 229
    move-object v2, v10

    .line 230
    move-object/from16 v28, v11

    .line 231
    .line 232
    move-object/from16 v24, v15

    .line 233
    .line 234
    move-object/from16 v1, v18

    .line 235
    .line 236
    const/4 v15, 0x0

    .line 237
    goto/16 :goto_a

    .line 238
    .line 239
    :cond_5
    invoke-virtual {v2, v6}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 240
    .line 241
    .line 242
    move-result-object v1

    .line 243
    if-eqz v1, :cond_6

    .line 244
    .line 245
    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    .line 246
    .line 247
    .line 248
    move-result v18

    .line 249
    if-gtz v18, :cond_7

    .line 250
    .line 251
    :cond_6
    move-object/from16 v25, v3

    .line 252
    .line 253
    move-object/from16 v27, v4

    .line 254
    .line 255
    move-object/from16 v26, v5

    .line 256
    .line 257
    move-object/from16 v29, v6

    .line 258
    .line 259
    move-object v5, v7

    .line 260
    move-object v6, v8

    .line 261
    move-object v7, v9

    .line 262
    move-object v2, v10

    .line 263
    move-object/from16 v28, v11

    .line 264
    .line 265
    move-object/from16 v24, v15

    .line 266
    .line 267
    const/4 v15, 0x0

    .line 268
    goto/16 :goto_9

    .line 269
    .line 270
    :cond_7
    const/4 v2, 0x0

    .line 271
    invoke-virtual {v1, v2}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 272
    .line 273
    .line 274
    move-result-object v1

    .line 275
    if-nez v1, :cond_8

    .line 276
    .line 277
    sget-object v18, Llq3;->g:Llq3;

    .line 278
    .line 279
    goto :goto_4

    .line 280
    :cond_8
    sget-object v2, Lmz1;->o4:Liz1;

    .line 281
    .line 282
    invoke-virtual {v12, v2}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 283
    .line 284
    .line 285
    move-result-object v2

    .line 286
    check-cast v2, Ljava/lang/Boolean;

    .line 287
    .line 288
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 289
    .line 290
    .line 291
    move-result v2

    .line 292
    if-eqz v2, :cond_a

    .line 293
    .line 294
    sget-object v2, Lmz1;->p4:Liz1;

    .line 295
    .line 296
    invoke-virtual {v12, v2}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 297
    .line 298
    .line 299
    move-result-object v2

    .line 300
    check-cast v2, Ljava/lang/String;

    .line 301
    .line 302
    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 303
    .line 304
    .line 305
    move-result v2

    .line 306
    if-nez v2, :cond_9

    .line 307
    .line 308
    goto :goto_5

    .line 309
    :cond_9
    sget-object v18, Llq3;->g:Llq3;

    .line 310
    .line 311
    goto :goto_4

    .line 312
    :cond_a
    :goto_5
    const-string v2, "base_url"

    .line 313
    .line 314
    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 315
    .line 316
    .line 317
    move-result-object v2

    .line 318
    invoke-virtual {v1, v11}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 319
    .line 320
    .line 321
    move-result-object v18

    .line 322
    move-object/from16 v20, v2

    .line 323
    .line 324
    const-string v2, "width"

    .line 325
    .line 326
    move-object/from16 v21, v3

    .line 327
    .line 328
    const/4 v3, 0x0

    .line 329
    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 330
    .line 331
    .line 332
    move-result v2

    .line 333
    move/from16 v19, v2

    .line 334
    .line 335
    const-string v2, "height"

    .line 336
    .line 337
    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 338
    .line 339
    .line 340
    move-result v1

    .line 341
    if-nez v19, :cond_c

    .line 342
    .line 343
    if-eqz v1, :cond_b

    .line 344
    .line 345
    move v2, v3

    .line 346
    goto :goto_6

    .line 347
    :cond_b
    invoke-static {}, Lxe4;->a()Lxe4;

    .line 348
    .line 349
    .line 350
    move-result-object v1

    .line 351
    move-object/from16 v22, v4

    .line 352
    .line 353
    move-object/from16 v23, v6

    .line 354
    .line 355
    move-object v4, v1

    .line 356
    goto :goto_7

    .line 357
    :cond_c
    move/from16 v2, v19

    .line 358
    .line 359
    :goto_6
    iget-object v3, v10, Lft2;->a:Landroid/content/Context;

    .line 360
    .line 361
    move-object/from16 v22, v4

    .line 362
    .line 363
    new-instance v4, Lxe4;

    .line 364
    .line 365
    move-object/from16 v23, v6

    .line 366
    .line 367
    new-instance v6, Ld3;

    .line 368
    .line 369
    invoke-direct {v6, v2, v1}, Ld3;-><init>(II)V

    .line 370
    .line 371
    .line 372
    invoke-direct {v4, v3, v6}, Lxe4;-><init>(Landroid/content/Context;Ld3;)V

    .line 373
    .line 374
    .line 375
    :goto_7
    invoke-static/range {v18 .. v18}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 376
    .line 377
    .line 378
    move-result v1

    .line 379
    if-nez v1, :cond_e

    .line 380
    .line 381
    sget-object v1, Lmz1;->t2:Liz1;

    .line 382
    .line 383
    invoke-virtual {v12, v1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 384
    .line 385
    .line 386
    move-result-object v1

    .line 387
    check-cast v1, Ljava/lang/Boolean;

    .line 388
    .line 389
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 390
    .line 391
    .line 392
    move-result v1

    .line 393
    if-eqz v1, :cond_d

    .line 394
    .line 395
    iget-object v1, v5, Ljv2;->e:Landroid/os/Bundle;

    .line 396
    .line 397
    sget-object v2, Lhg4;->C:Lhg4;

    .line 398
    .line 399
    iget-object v2, v2, Lhg4;->k:Lym;

    .line 400
    .line 401
    const-string v3, "native-assets-loading-image-composition-start"

    .line 402
    .line 403
    invoke-static {v2, v1, v3}, Lga1;->n(Lym;Landroid/os/Bundle;Ljava/lang/String;)V

    .line 404
    .line 405
    .line 406
    :cond_d
    sget-object v1, Llq3;->g:Llq3;

    .line 407
    .line 408
    new-instance v2, Ldt2;

    .line 409
    .line 410
    move-object v3, v11

    .line 411
    const/4 v11, 0x0

    .line 412
    move-object/from16 v28, v3

    .line 413
    .line 414
    move-object/from16 v26, v5

    .line 415
    .line 416
    move-object v6, v7

    .line 417
    move-object v7, v8

    .line 418
    move-object v8, v9

    .line 419
    move-object v3, v10

    .line 420
    move-object/from16 v24, v15

    .line 421
    .line 422
    move-object/from16 v10, v18

    .line 423
    .line 424
    move-object/from16 v9, v20

    .line 425
    .line 426
    move-object/from16 v25, v21

    .line 427
    .line 428
    move-object/from16 v27, v22

    .line 429
    .line 430
    move-object/from16 v29, v23

    .line 431
    .line 432
    const/4 v15, 0x0

    .line 433
    move-object/from16 v5, p2

    .line 434
    .line 435
    invoke-direct/range {v2 .. v11}, Ldt2;-><init>(Ljava/lang/Object;Lxe4;La83;Lc83;Lsu1;Lsb2;Ljava/lang/String;Ljava/lang/String;I)V

    .line 436
    .line 437
    .line 438
    move-object v5, v3

    .line 439
    move-object v3, v2

    .line 440
    move-object v2, v5

    .line 441
    move-object v5, v6

    .line 442
    move-object v6, v7

    .line 443
    move-object v7, v8

    .line 444
    sget-object v4, Lmd2;->f:Lld2;

    .line 445
    .line 446
    invoke-static {v1, v3, v4}, Lpu1;->O(Ln70;Lyp3;Ljava/util/concurrent/Executor;)Lqp3;

    .line 447
    .line 448
    .line 449
    move-result-object v1

    .line 450
    new-instance v3, Let2;

    .line 451
    .line 452
    invoke-direct {v3, v1, v15}, Let2;-><init>(Lqp3;I)V

    .line 453
    .line 454
    .line 455
    sget-object v4, Lmd2;->g:Lld2;

    .line 456
    .line 457
    invoke-static {v1, v3, v4}, Lpu1;->O(Ln70;Lyp3;Ljava/util/concurrent/Executor;)Lqp3;

    .line 458
    .line 459
    .line 460
    move-result-object v18

    .line 461
    :goto_8
    move-object/from16 v1, v18

    .line 462
    .line 463
    goto :goto_a

    .line 464
    :cond_e
    move-object/from16 v26, v5

    .line 465
    .line 466
    move-object v5, v7

    .line 467
    move-object v6, v8

    .line 468
    move-object v7, v9

    .line 469
    move-object v2, v10

    .line 470
    move-object/from16 v28, v11

    .line 471
    .line 472
    move-object/from16 v24, v15

    .line 473
    .line 474
    move-object/from16 v25, v21

    .line 475
    .line 476
    move-object/from16 v27, v22

    .line 477
    .line 478
    move-object/from16 v29, v23

    .line 479
    .line 480
    const/4 v15, 0x0

    .line 481
    sget-object v18, Llq3;->g:Llq3;

    .line 482
    .line 483
    goto :goto_8

    .line 484
    :goto_9
    sget-object v18, Llq3;->g:Llq3;

    .line 485
    .line 486
    goto :goto_8

    .line 487
    :goto_a
    const/16 v3, 0x32

    .line 488
    .line 489
    move-object/from16 v8, v27

    .line 490
    .line 491
    invoke-virtual {v8, v3, v1}, Lp21;->M(ILn70;)V

    .line 492
    .line 493
    .line 494
    const-string v3, "secondary_image"

    .line 495
    .line 496
    move-object/from16 v9, p3

    .line 497
    .line 498
    invoke-virtual {v9, v3}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 499
    .line 500
    .line 501
    move-result-object v3

    .line 502
    iget-boolean v4, v14, Lr12;->g:Z

    .line 503
    .line 504
    const/16 v10, 0x33

    .line 505
    .line 506
    invoke-virtual {v2, v3, v4, v10}, Lft2;->b(Lorg/json/JSONObject;ZI)Ln70;

    .line 507
    .line 508
    .line 509
    move-result-object v10

    .line 510
    const/16 v3, 0x34

    .line 511
    .line 512
    invoke-virtual {v8, v3, v10}, Lp21;->M(ILn70;)V

    .line 513
    .line 514
    .line 515
    const-string v3, "app_icon"

    .line 516
    .line 517
    invoke-virtual {v9, v3}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 518
    .line 519
    .line 520
    move-result-object v3

    .line 521
    iget-boolean v4, v14, Lr12;->g:Z

    .line 522
    .line 523
    const/16 v11, 0x35

    .line 524
    .line 525
    invoke-virtual {v2, v3, v4, v11}, Lft2;->b(Lorg/json/JSONObject;ZI)Ln70;

    .line 526
    .line 527
    .line 528
    move-result-object v11

    .line 529
    const/16 v3, 0x36

    .line 530
    .line 531
    invoke-virtual {v8, v3, v11}, Lp21;->M(ILn70;)V

    .line 532
    .line 533
    .line 534
    const-string v3, "attribution"

    .line 535
    .line 536
    invoke-virtual {v9, v3}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 537
    .line 538
    .line 539
    move-result-object v3

    .line 540
    const-class v4, Ljava/lang/Exception;

    .line 541
    .line 542
    const-string v14, "image"

    .line 543
    .line 544
    if-nez v3, :cond_f

    .line 545
    .line 546
    sget-object v3, Llq3;->g:Llq3;

    .line 547
    .line 548
    move-object/from16 v22, v5

    .line 549
    .line 550
    move-object/from16 v23, v11

    .line 551
    .line 552
    :goto_b
    move-object v11, v3

    .line 553
    goto :goto_c

    .line 554
    :cond_f
    move-object/from16 v15, v29

    .line 555
    .line 556
    invoke-virtual {v3, v15}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 557
    .line 558
    .line 559
    move-result-object v15

    .line 560
    move-object/from16 v22, v5

    .line 561
    .line 562
    invoke-virtual {v3, v14}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 563
    .line 564
    .line 565
    move-result-object v5

    .line 566
    if-nez v15, :cond_10

    .line 567
    .line 568
    if-eqz v5, :cond_10

    .line 569
    .line 570
    new-instance v15, Lorg/json/JSONArray;

    .line 571
    .line 572
    invoke-direct {v15}, Lorg/json/JSONArray;-><init>()V

    .line 573
    .line 574
    .line 575
    invoke-virtual {v15, v5}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 576
    .line 577
    .line 578
    :cond_10
    const/16 v5, 0x37

    .line 579
    .line 580
    move-object/from16 v23, v11

    .line 581
    .line 582
    const/4 v11, 0x0

    .line 583
    const/4 v13, 0x1

    .line 584
    invoke-virtual {v2, v15, v11, v13, v5}, Lft2;->a(Lorg/json/JSONArray;ZZI)Ln70;

    .line 585
    .line 586
    .line 587
    move-result-object v5

    .line 588
    new-instance v11, Ldn1;

    .line 589
    .line 590
    const/4 v13, 0x2

    .line 591
    invoke-direct {v11, v2, v3, v13}, Ldn1;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 592
    .line 593
    .line 594
    iget-object v13, v2, Lft2;->g:Ljava/util/concurrent/Executor;

    .line 595
    .line 596
    invoke-static {v5, v11, v13}, Lpu1;->P(Ln70;Lzk3;Ljava/util/concurrent/Executor;)Lrp3;

    .line 597
    .line 598
    .line 599
    move-result-object v5

    .line 600
    const-string v11, "require"

    .line 601
    .line 602
    invoke-virtual {v3, v11}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    .line 603
    .line 604
    .line 605
    move-result v3

    .line 606
    if-eqz v3, :cond_11

    .line 607
    .line 608
    new-instance v3, Lu42;

    .line 609
    .line 610
    const/4 v11, 0x5

    .line 611
    invoke-direct {v3, v11, v5}, Lu42;-><init>(ILjava/lang/Object;)V

    .line 612
    .line 613
    .line 614
    sget-object v11, Lmd2;->g:Lld2;

    .line 615
    .line 616
    invoke-static {v5, v3, v11}, Lpu1;->O(Ln70;Lyp3;Ljava/util/concurrent/Executor;)Lqp3;

    .line 617
    .line 618
    .line 619
    move-result-object v3

    .line 620
    goto :goto_b

    .line 621
    :cond_11
    new-instance v3, Lfi1;

    .line 622
    .line 623
    const/4 v13, 0x2

    .line 624
    invoke-direct {v3, v13}, Lfi1;-><init>(I)V

    .line 625
    .line 626
    .line 627
    sget-object v11, Lmd2;->g:Lld2;

    .line 628
    .line 629
    invoke-static {v5, v4, v3, v11}, Lpu1;->L(Ln70;Ljava/lang/Class;Lyp3;Ljava/util/concurrent/Executor;)Lwo3;

    .line 630
    .line 631
    .line 632
    move-result-object v3

    .line 633
    goto :goto_b

    .line 634
    :goto_c
    const/16 v3, 0x38

    .line 635
    .line 636
    invoke-virtual {v8, v3, v11}, Lp21;->M(ILn70;)V

    .line 637
    .line 638
    .line 639
    const-string v3, "html_containers"

    .line 640
    .line 641
    const-string v5, "instream"

    .line 642
    .line 643
    filled-new-array {v3, v5}, [Ljava/lang/String;

    .line 644
    .line 645
    .line 646
    move-result-object v3

    .line 647
    invoke-static {v9, v3}, Lbd2;->b0(Lorg/json/JSONObject;[Ljava/lang/String;)Lorg/json/JSONObject;

    .line 648
    .line 649
    .line 650
    move-result-object v5

    .line 651
    if-nez v5, :cond_12

    .line 652
    .line 653
    const/4 v3, 0x0

    .line 654
    goto :goto_d

    .line 655
    :cond_12
    const/16 v20, 0x1

    .line 656
    .line 657
    aget-object v3, v3, v20

    .line 658
    .line 659
    invoke-virtual {v5, v3}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 660
    .line 661
    .line 662
    move-result-object v13

    .line 663
    move-object v3, v13

    .line 664
    :goto_d
    const-string v13, "video"

    .line 665
    .line 666
    if-nez v3, :cond_18

    .line 667
    .line 668
    invoke-virtual {v9, v13}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 669
    .line 670
    .line 671
    move-result-object v3

    .line 672
    if-nez v3, :cond_13

    .line 673
    .line 674
    sget-object v3, Llq3;->g:Llq3;

    .line 675
    .line 676
    :goto_e
    move-object v4, v2

    .line 677
    move-object v15, v6

    .line 678
    move-object v2, v7

    .line 679
    goto/16 :goto_13

    .line 680
    .line 681
    :cond_13
    const-string v5, "vast_xml"

    .line 682
    .line 683
    invoke-virtual {v3, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 684
    .line 685
    .line 686
    move-result-object v5

    .line 687
    sget-object v15, Lmz1;->Na:Liz1;

    .line 688
    .line 689
    invoke-virtual {v12, v15}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 690
    .line 691
    .line 692
    move-result-object v15

    .line 693
    check-cast v15, Ljava/lang/Boolean;

    .line 694
    .line 695
    invoke-virtual {v15}, Ljava/lang/Boolean;->booleanValue()Z

    .line 696
    .line 697
    .line 698
    move-result v15

    .line 699
    if-eqz v15, :cond_14

    .line 700
    .line 701
    move-object/from16 v15, v28

    .line 702
    .line 703
    invoke-virtual {v3, v15}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 704
    .line 705
    .line 706
    move-result v15

    .line 707
    if-eqz v15, :cond_14

    .line 708
    .line 709
    const/4 v15, 0x1

    .line 710
    goto :goto_f

    .line 711
    :cond_14
    const/4 v15, 0x0

    .line 712
    :goto_f
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 713
    .line 714
    .line 715
    move-result v5

    .line 716
    if-eqz v5, :cond_16

    .line 717
    .line 718
    if-nez v15, :cond_15

    .line 719
    .line 720
    const-string v3, "Required field \'vast_xml\' or \'html\' is missing"

    .line 721
    .line 722
    invoke-static {v3}, Lgi2;->i0(Ljava/lang/String;)V

    .line 723
    .line 724
    .line 725
    sget-object v3, Llq3;->g:Llq3;

    .line 726
    .line 727
    goto :goto_e

    .line 728
    :cond_15
    move-object v15, v4

    .line 729
    move-object/from16 v5, v22

    .line 730
    .line 731
    move-object/from16 v4, p2

    .line 732
    .line 733
    goto :goto_11

    .line 734
    :cond_16
    if-nez v15, :cond_15

    .line 735
    .line 736
    iget-object v5, v2, Lft2;->i:Lmt2;

    .line 737
    .line 738
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 739
    .line 740
    .line 741
    sget-object v15, Lmz1;->t2:Liz1;

    .line 742
    .line 743
    invoke-virtual {v12, v15}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 744
    .line 745
    .line 746
    move-result-object v15

    .line 747
    check-cast v15, Ljava/lang/Boolean;

    .line 748
    .line 749
    invoke-virtual {v15}, Ljava/lang/Boolean;->booleanValue()Z

    .line 750
    .line 751
    .line 752
    move-result v15

    .line 753
    if-eqz v15, :cond_17

    .line 754
    .line 755
    iget-object v15, v5, Lmt2;->i:Ljv2;

    .line 756
    .line 757
    iget-object v15, v15, Ljv2;->e:Landroid/os/Bundle;

    .line 758
    .line 759
    move-object/from16 v16, v2

    .line 760
    .line 761
    sget-object v2, Lhg4;->C:Lhg4;

    .line 762
    .line 763
    iget-object v2, v2, Lhg4;->k:Lym;

    .line 764
    .line 765
    move-object/from16 v27, v4

    .line 766
    .line 767
    const-string v4, "native-assets-loading-video-start"

    .line 768
    .line 769
    invoke-static {v2, v15, v4}, Lga1;->n(Lym;Landroid/os/Bundle;Ljava/lang/String;)V

    .line 770
    .line 771
    .line 772
    goto :goto_10

    .line 773
    :cond_17
    move-object/from16 v16, v2

    .line 774
    .line 775
    move-object/from16 v27, v4

    .line 776
    .line 777
    :goto_10
    sget-object v2, Llq3;->g:Llq3;

    .line 778
    .line 779
    new-instance v4, Lop1;

    .line 780
    .line 781
    const/4 v15, 0x2

    .line 782
    invoke-direct {v4, v5, v6, v7, v15}, Lop1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 783
    .line 784
    .line 785
    iget-object v15, v5, Lmt2;->b:Ljava/util/concurrent/Executor;

    .line 786
    .line 787
    invoke-static {v2, v4, v15}, Lpu1;->O(Ln70;Lyp3;Ljava/util/concurrent/Executor;)Lqp3;

    .line 788
    .line 789
    .line 790
    move-result-object v2

    .line 791
    new-instance v4, Lz02;

    .line 792
    .line 793
    move-object/from16 v28, v6

    .line 794
    .line 795
    const/4 v6, 0x5

    .line 796
    invoke-direct {v4, v5, v3, v6}, Lz02;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 797
    .line 798
    .line 799
    invoke-static {v2, v4, v15}, Lpu1;->O(Ln70;Lyp3;Ljava/util/concurrent/Executor;)Lqp3;

    .line 800
    .line 801
    .line 802
    move-result-object v2

    .line 803
    move-object v3, v2

    .line 804
    move-object/from16 v2, v16

    .line 805
    .line 806
    move-object/from16 v15, v27

    .line 807
    .line 808
    move-object/from16 v6, v28

    .line 809
    .line 810
    goto :goto_12

    .line 811
    :goto_11
    invoke-virtual/range {v2 .. v7}, Lft2;->d(Lorg/json/JSONObject;La83;Lc83;Lsu1;Lqb2;)Lqp3;

    .line 812
    .line 813
    .line 814
    move-result-object v3

    .line 815
    :goto_12
    sget-object v4, Lmz1;->g4:Liz1;

    .line 816
    .line 817
    invoke-virtual {v12, v4}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 818
    .line 819
    .line 820
    move-result-object v4

    .line 821
    check-cast v4, Ljava/lang/Integer;

    .line 822
    .line 823
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 824
    .line 825
    .line 826
    move-result v4

    .line 827
    int-to-long v4, v4

    .line 828
    move-object/from16 v28, v6

    .line 829
    .line 830
    iget-object v6, v2, Lft2;->k:Ljava/util/concurrent/ScheduledExecutorService;

    .line 831
    .line 832
    move-object/from16 v16, v2

    .line 833
    .line 834
    sget-object v2, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 835
    .line 836
    invoke-static {v3, v4, v5, v2, v6}, Lpu1;->N(Ln70;JLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/ScheduledExecutorService;)Ln70;

    .line 837
    .line 838
    .line 839
    move-result-object v2

    .line 840
    new-instance v3, Lfi1;

    .line 841
    .line 842
    const/4 v4, 0x2

    .line 843
    invoke-direct {v3, v4}, Lfi1;-><init>(I)V

    .line 844
    .line 845
    .line 846
    sget-object v4, Lmd2;->g:Lld2;

    .line 847
    .line 848
    invoke-static {v2, v15, v3, v4}, Lpu1;->L(Ln70;Ljava/lang/Class;Lyp3;Ljava/util/concurrent/Executor;)Lwo3;

    .line 849
    .line 850
    .line 851
    move-result-object v3

    .line 852
    move-object v2, v7

    .line 853
    move-object/from16 v4, v16

    .line 854
    .line 855
    move-object/from16 v15, v28

    .line 856
    .line 857
    goto :goto_13

    .line 858
    :cond_18
    move-object/from16 v4, p2

    .line 859
    .line 860
    move-object/from16 v5, v22

    .line 861
    .line 862
    invoke-virtual/range {v2 .. v7}, Lft2;->d(Lorg/json/JSONObject;La83;Lc83;Lsu1;Lqb2;)Lqp3;

    .line 863
    .line 864
    .line 865
    move-result-object v3

    .line 866
    goto/16 :goto_e

    .line 867
    .line 868
    :goto_13
    const/16 v5, 0x3a

    .line 869
    .line 870
    invoke-virtual {v8, v5, v3}, Lp21;->M(ILn70;)V

    .line 871
    .line 872
    .line 873
    sget-object v5, Lmz1;->Nd:Liz1;

    .line 874
    .line 875
    invoke-virtual {v12, v5}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 876
    .line 877
    .line 878
    move-result-object v5

    .line 879
    check-cast v5, Ljava/lang/Boolean;

    .line 880
    .line 881
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 882
    .line 883
    .line 884
    move-result v5

    .line 885
    if-eqz v5, :cond_19

    .line 886
    .line 887
    invoke-virtual {v9, v13}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 888
    .line 889
    .line 890
    move-result v5

    .line 891
    if-eqz v5, :cond_19

    .line 892
    .line 893
    invoke-virtual {v9, v13}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 894
    .line 895
    .line 896
    move-result-object v5

    .line 897
    const-string v7, "flags"

    .line 898
    .line 899
    invoke-virtual {v5, v7}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 900
    .line 901
    .line 902
    move-result v12

    .line 903
    if-eqz v12, :cond_19

    .line 904
    .line 905
    invoke-virtual {v5, v7}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 906
    .line 907
    .line 908
    move-result-object v5

    .line 909
    if-nez v5, :cond_1a

    .line 910
    .line 911
    :catch_0
    :cond_19
    move-object/from16 v18, v11

    .line 912
    .line 913
    move-object/from16 v6, v26

    .line 914
    .line 915
    goto/16 :goto_16

    .line 916
    .line 917
    :cond_1a
    const/4 v7, 0x0

    .line 918
    :goto_14
    invoke-virtual {v5}, Lorg/json/JSONArray;->length()I

    .line 919
    .line 920
    .line 921
    move-result v12

    .line 922
    if-ge v7, v12, :cond_19

    .line 923
    .line 924
    invoke-virtual {v5, v7}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 925
    .line 926
    .line 927
    move-result-object v12

    .line 928
    if-eqz v12, :cond_1c

    .line 929
    .line 930
    const-string v13, "key"

    .line 931
    .line 932
    invoke-virtual {v12, v13}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 933
    .line 934
    .line 935
    move-result-object v13

    .line 936
    const-string v6, "afma_video_player_type"

    .line 937
    .line 938
    invoke-virtual {v13, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 939
    .line 940
    .line 941
    move-result v6

    .line 942
    if-eqz v6, :cond_1c

    .line 943
    .line 944
    :try_start_0
    const-string v5, "value"

    .line 945
    .line 946
    invoke-virtual {v12, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 947
    .line 948
    .line 949
    move-result-object v5

    .line 950
    invoke-static {v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 951
    .line 952
    .line 953
    move-result v5
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 954
    const/4 v6, 0x3

    .line 955
    if-ne v5, v6, :cond_19

    .line 956
    .line 957
    sget-object v5, Lmz1;->t2:Liz1;

    .line 958
    .line 959
    sget-object v6, Ltw1;->e:Ltw1;

    .line 960
    .line 961
    iget-object v6, v6, Ltw1;->c:Lkz1;

    .line 962
    .line 963
    invoke-virtual {v6, v5}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 964
    .line 965
    .line 966
    move-result-object v5

    .line 967
    check-cast v5, Ljava/lang/Boolean;

    .line 968
    .line 969
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 970
    .line 971
    .line 972
    move-result v5

    .line 973
    move-object/from16 v6, v26

    .line 974
    .line 975
    if-eqz v5, :cond_1b

    .line 976
    .line 977
    iget-object v5, v6, Ljv2;->e:Landroid/os/Bundle;

    .line 978
    .line 979
    sget-object v7, Lhg4;->C:Lhg4;

    .line 980
    .line 981
    iget-object v7, v7, Lhg4;->k:Lym;

    .line 982
    .line 983
    const-string v12, "native-assets-loading-media-start"

    .line 984
    .line 985
    invoke-static {v7, v5, v12}, Lga1;->n(Lym;Landroid/os/Bundle;Ljava/lang/String;)V

    .line 986
    .line 987
    .line 988
    :cond_1b
    new-instance v5, Lpd2;

    .line 989
    .line 990
    invoke-direct {v5}, Lpd2;-><init>()V

    .line 991
    .line 992
    .line 993
    new-instance v7, Lv42;

    .line 994
    .line 995
    invoke-direct {v7, v4, v5}, Lv42;-><init>(Lft2;Lpd2;)V

    .line 996
    .line 997
    .line 998
    sget-object v12, Lmd2;->f:Lld2;

    .line 999
    .line 1000
    new-instance v13, Ljq3;

    .line 1001
    .line 1002
    move-object/from16 v18, v11

    .line 1003
    .line 1004
    const/4 v11, 0x0

    .line 1005
    invoke-direct {v13, v3, v7, v11}, Ljq3;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 1006
    .line 1007
    .line 1008
    invoke-interface {v3, v13, v12}, Ln70;->c(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 1009
    .line 1010
    .line 1011
    const/16 v7, 0x3d

    .line 1012
    .line 1013
    invoke-virtual {v8, v7, v5}, Lp21;->M(ILn70;)V

    .line 1014
    .line 1015
    .line 1016
    :goto_15
    move-object v11, v5

    .line 1017
    goto :goto_17

    .line 1018
    :cond_1c
    move-object/from16 v18, v11

    .line 1019
    .line 1020
    move-object/from16 v6, v26

    .line 1021
    .line 1022
    add-int/lit8 v7, v7, 0x1

    .line 1023
    .line 1024
    move-object/from16 v26, v6

    .line 1025
    .line 1026
    move-object/from16 v11, v18

    .line 1027
    .line 1028
    goto :goto_14

    .line 1029
    :goto_16
    new-instance v5, Landroid/os/Bundle;

    .line 1030
    .line 1031
    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    .line 1032
    .line 1033
    .line 1034
    invoke-static {v5}, Lpu1;->r(Ljava/lang/Object;)Llq3;

    .line 1035
    .line 1036
    .line 1037
    move-result-object v5

    .line 1038
    goto :goto_15

    .line 1039
    :goto_17
    iget-object v5, v8, Lp21;->h:Ljava/lang/Object;

    .line 1040
    .line 1041
    check-cast v5, Lxb4;

    .line 1042
    .line 1043
    iget-object v7, v5, Lxb4;->g:Ljava/lang/Object;

    .line 1044
    .line 1045
    check-cast v7, Ljava/util/concurrent/Executor;

    .line 1046
    .line 1047
    const-string v12, "custom_assets"

    .line 1048
    .line 1049
    invoke-virtual {v9, v12}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 1050
    .line 1051
    .line 1052
    move-result-object v12

    .line 1053
    if-nez v12, :cond_1d

    .line 1054
    .line 1055
    sget-object v5, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 1056
    .line 1057
    invoke-static {v5}, Lpu1;->r(Ljava/lang/Object;)Llq3;

    .line 1058
    .line 1059
    .line 1060
    move-result-object v5

    .line 1061
    move-object/from16 v26, v3

    .line 1062
    .line 1063
    move-object/from16 v30, v10

    .line 1064
    .line 1065
    move-object/from16 v22, v11

    .line 1066
    .line 1067
    const/4 v10, 0x1

    .line 1068
    const/4 v13, 0x2

    .line 1069
    :goto_18
    move-object v14, v5

    .line 1070
    goto/16 :goto_1e

    .line 1071
    .line 1072
    :cond_1d
    sget-object v13, Lmz1;->t2:Liz1;

    .line 1073
    .line 1074
    move-object/from16 v22, v11

    .line 1075
    .line 1076
    sget-object v11, Ltw1;->e:Ltw1;

    .line 1077
    .line 1078
    iget-object v11, v11, Ltw1;->c:Lkz1;

    .line 1079
    .line 1080
    invoke-virtual {v11, v13}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 1081
    .line 1082
    .line 1083
    move-result-object v11

    .line 1084
    check-cast v11, Ljava/lang/Boolean;

    .line 1085
    .line 1086
    invoke-virtual {v11}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1087
    .line 1088
    .line 1089
    move-result v11

    .line 1090
    if-eqz v11, :cond_1e

    .line 1091
    .line 1092
    iget-object v11, v5, Lxb4;->i:Ljava/lang/Object;

    .line 1093
    .line 1094
    check-cast v11, Ljv2;

    .line 1095
    .line 1096
    iget-object v11, v11, Ljv2;->e:Landroid/os/Bundle;

    .line 1097
    .line 1098
    sget-object v13, Lhg4;->C:Lhg4;

    .line 1099
    .line 1100
    iget-object v13, v13, Lhg4;->k:Lym;

    .line 1101
    .line 1102
    move-object/from16 v26, v3

    .line 1103
    .line 1104
    const-string v3, "native-assets-loading-custom-start"

    .line 1105
    .line 1106
    invoke-static {v13, v11, v3}, Lga1;->n(Lym;Landroid/os/Bundle;Ljava/lang/String;)V

    .line 1107
    .line 1108
    .line 1109
    goto :goto_19

    .line 1110
    :cond_1e
    move-object/from16 v26, v3

    .line 1111
    .line 1112
    :goto_19
    new-instance v3, Ljava/util/ArrayList;

    .line 1113
    .line 1114
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 1115
    .line 1116
    .line 1117
    invoke-virtual {v12}, Lorg/json/JSONArray;->length()I

    .line 1118
    .line 1119
    .line 1120
    move-result v11

    .line 1121
    const/4 v13, 0x0

    .line 1122
    :goto_1a
    if-ge v13, v11, :cond_23

    .line 1123
    .line 1124
    move/from16 v27, v11

    .line 1125
    .line 1126
    invoke-virtual {v12, v13}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 1127
    .line 1128
    .line 1129
    move-result-object v11

    .line 1130
    if-nez v11, :cond_1f

    .line 1131
    .line 1132
    sget-object v11, Llq3;->g:Llq3;

    .line 1133
    .line 1134
    move-object/from16 v31, v5

    .line 1135
    .line 1136
    move-object/from16 v30, v10

    .line 1137
    .line 1138
    move-object/from16 v28, v12

    .line 1139
    .line 1140
    :goto_1b
    move/from16 v29, v13

    .line 1141
    .line 1142
    :goto_1c
    const/4 v13, 0x2

    .line 1143
    goto :goto_1d

    .line 1144
    :cond_1f
    move-object/from16 v28, v12

    .line 1145
    .line 1146
    const-string v12, "name"

    .line 1147
    .line 1148
    invoke-virtual {v11, v12}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 1149
    .line 1150
    .line 1151
    move-result-object v12

    .line 1152
    if-nez v12, :cond_20

    .line 1153
    .line 1154
    sget-object v11, Llq3;->g:Llq3;

    .line 1155
    .line 1156
    move-object/from16 v31, v5

    .line 1157
    .line 1158
    move-object/from16 v30, v10

    .line 1159
    .line 1160
    goto :goto_1b

    .line 1161
    :cond_20
    move/from16 v29, v13

    .line 1162
    .line 1163
    const-string v13, "type"

    .line 1164
    .line 1165
    invoke-virtual {v11, v13}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 1166
    .line 1167
    .line 1168
    move-result-object v13

    .line 1169
    move-object/from16 v30, v10

    .line 1170
    .line 1171
    const-string v10, "string"

    .line 1172
    .line 1173
    invoke-virtual {v10, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1174
    .line 1175
    .line 1176
    move-result v10

    .line 1177
    if-eqz v10, :cond_21

    .line 1178
    .line 1179
    new-instance v10, Lit2;

    .line 1180
    .line 1181
    const-string v13, "string_value"

    .line 1182
    .line 1183
    invoke-virtual {v11, v13}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 1184
    .line 1185
    .line 1186
    move-result-object v11

    .line 1187
    invoke-direct {v10, v12, v11}, Lit2;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 1188
    .line 1189
    .line 1190
    invoke-static {v10}, Lpu1;->r(Ljava/lang/Object;)Llq3;

    .line 1191
    .line 1192
    .line 1193
    move-result-object v11

    .line 1194
    move-object/from16 v31, v5

    .line 1195
    .line 1196
    goto :goto_1c

    .line 1197
    :cond_21
    invoke-virtual {v14, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1198
    .line 1199
    .line 1200
    move-result v10

    .line 1201
    if-eqz v10, :cond_22

    .line 1202
    .line 1203
    iget-object v10, v5, Lxb4;->h:Ljava/lang/Object;

    .line 1204
    .line 1205
    check-cast v10, Lft2;

    .line 1206
    .line 1207
    iget-object v13, v10, Lft2;->h:Lr12;

    .line 1208
    .line 1209
    move-object/from16 v31, v5

    .line 1210
    .line 1211
    const-string v5, "image_value"

    .line 1212
    .line 1213
    invoke-virtual {v11, v5}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 1214
    .line 1215
    .line 1216
    move-result-object v5

    .line 1217
    iget-boolean v11, v13, Lr12;->g:Z

    .line 1218
    .line 1219
    const/4 v13, 0x0

    .line 1220
    invoke-virtual {v10, v5, v11, v13}, Lft2;->b(Lorg/json/JSONObject;ZI)Ln70;

    .line 1221
    .line 1222
    .line 1223
    move-result-object v5

    .line 1224
    new-instance v10, Lu32;

    .line 1225
    .line 1226
    const/4 v13, 0x2

    .line 1227
    invoke-direct {v10, v12, v13}, Lu32;-><init>(Ljava/lang/String;I)V

    .line 1228
    .line 1229
    .line 1230
    invoke-static {v5, v10, v7}, Lpu1;->P(Ln70;Lzk3;Ljava/util/concurrent/Executor;)Lrp3;

    .line 1231
    .line 1232
    .line 1233
    move-result-object v11

    .line 1234
    goto :goto_1d

    .line 1235
    :cond_22
    move-object/from16 v31, v5

    .line 1236
    .line 1237
    const/4 v13, 0x2

    .line 1238
    sget-object v11, Llq3;->g:Llq3;

    .line 1239
    .line 1240
    :goto_1d
    invoke-virtual {v3, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1241
    .line 1242
    .line 1243
    add-int/lit8 v5, v29, 0x1

    .line 1244
    .line 1245
    move v13, v5

    .line 1246
    move/from16 v11, v27

    .line 1247
    .line 1248
    move-object/from16 v12, v28

    .line 1249
    .line 1250
    move-object/from16 v10, v30

    .line 1251
    .line 1252
    move-object/from16 v5, v31

    .line 1253
    .line 1254
    goto/16 :goto_1a

    .line 1255
    .line 1256
    :cond_23
    move-object/from16 v30, v10

    .line 1257
    .line 1258
    const/4 v13, 0x2

    .line 1259
    new-instance v5, Lzp3;

    .line 1260
    .line 1261
    invoke-static {v3}, Lxm3;->m(Ljava/util/Collection;)Lxm3;

    .line 1262
    .line 1263
    .line 1264
    move-result-object v3

    .line 1265
    const/4 v10, 0x1

    .line 1266
    invoke-direct {v5, v3, v10}, Lzp3;-><init>(Lxm3;Z)V

    .line 1267
    .line 1268
    .line 1269
    sget-object v3, Lgj1;->l:Lgj1;

    .line 1270
    .line 1271
    invoke-static {v5, v3, v7}, Lpu1;->P(Ln70;Lzk3;Ljava/util/concurrent/Executor;)Lrp3;

    .line 1272
    .line 1273
    .line 1274
    move-result-object v5

    .line 1275
    goto/16 :goto_18

    .line 1276
    .line 1277
    :goto_1e
    const/16 v3, 0x3f

    .line 1278
    .line 1279
    invoke-virtual {v8, v3, v14}, Lp21;->M(ILn70;)V

    .line 1280
    .line 1281
    .line 1282
    const-string v3, "enable_omid"

    .line 1283
    .line 1284
    invoke-virtual {v9, v3}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    .line 1285
    .line 1286
    .line 1287
    move-result v3

    .line 1288
    if-nez v3, :cond_24

    .line 1289
    .line 1290
    sget-object v3, Llq3;->g:Llq3;

    .line 1291
    .line 1292
    goto :goto_1f

    .line 1293
    :cond_24
    const-string v3, "omid_settings"

    .line 1294
    .line 1295
    invoke-virtual {v9, v3}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 1296
    .line 1297
    .line 1298
    move-result-object v3

    .line 1299
    if-nez v3, :cond_25

    .line 1300
    .line 1301
    sget-object v3, Llq3;->g:Llq3;

    .line 1302
    .line 1303
    goto :goto_1f

    .line 1304
    :cond_25
    const-string v5, "omid_html"

    .line 1305
    .line 1306
    invoke-virtual {v3, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 1307
    .line 1308
    .line 1309
    move-result-object v3

    .line 1310
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 1311
    .line 1312
    .line 1313
    move-result v5

    .line 1314
    if-eqz v5, :cond_26

    .line 1315
    .line 1316
    sget-object v3, Llq3;->g:Llq3;

    .line 1317
    .line 1318
    goto :goto_1f

    .line 1319
    :cond_26
    sget-object v5, Lmz1;->t2:Liz1;

    .line 1320
    .line 1321
    sget-object v7, Ltw1;->e:Ltw1;

    .line 1322
    .line 1323
    iget-object v7, v7, Ltw1;->c:Lkz1;

    .line 1324
    .line 1325
    invoke-virtual {v7, v5}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 1326
    .line 1327
    .line 1328
    move-result-object v5

    .line 1329
    check-cast v5, Ljava/lang/Boolean;

    .line 1330
    .line 1331
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1332
    .line 1333
    .line 1334
    move-result v5

    .line 1335
    if-eqz v5, :cond_27

    .line 1336
    .line 1337
    iget-object v5, v6, Ljv2;->e:Landroid/os/Bundle;

    .line 1338
    .line 1339
    sget-object v6, Lhg4;->C:Lhg4;

    .line 1340
    .line 1341
    iget-object v6, v6, Lhg4;->k:Lym;

    .line 1342
    .line 1343
    const-string v7, "native-assets-loading-omid-start"

    .line 1344
    .line 1345
    invoke-static {v6, v5, v7}, Lga1;->n(Lym;Landroid/os/Bundle;Ljava/lang/String;)V

    .line 1346
    .line 1347
    .line 1348
    :cond_27
    sget-object v5, Llq3;->g:Llq3;

    .line 1349
    .line 1350
    new-instance v6, Lk62;

    .line 1351
    .line 1352
    invoke-direct {v6, v4, v3, v2, v15}, Lk62;-><init>(Lft2;Ljava/lang/String;Lqb2;Lsu1;)V

    .line 1353
    .line 1354
    .line 1355
    sget-object v3, Lmd2;->f:Lld2;

    .line 1356
    .line 1357
    invoke-static {v5, v6, v3}, Lpu1;->O(Ln70;Lyp3;Ljava/util/concurrent/Executor;)Lqp3;

    .line 1358
    .line 1359
    .line 1360
    move-result-object v3

    .line 1361
    :goto_1f
    const/16 v4, 0x41

    .line 1362
    .line 1363
    invoke-virtual {v8, v4, v3}, Lp21;->M(ILn70;)V

    .line 1364
    .line 1365
    .line 1366
    new-instance v4, Ljava/util/ArrayList;

    .line 1367
    .line 1368
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 1369
    .line 1370
    .line 1371
    move-object/from16 v5, v25

    .line 1372
    .line 1373
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1374
    .line 1375
    .line 1376
    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1377
    .line 1378
    .line 1379
    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1380
    .line 1381
    .line 1382
    move-object/from16 v7, v30

    .line 1383
    .line 1384
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1385
    .line 1386
    .line 1387
    move-object/from16 v6, v23

    .line 1388
    .line 1389
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1390
    .line 1391
    .line 1392
    move-object/from16 v11, v18

    .line 1393
    .line 1394
    invoke-virtual {v4, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1395
    .line 1396
    .line 1397
    move-object/from16 v12, v26

    .line 1398
    .line 1399
    invoke-virtual {v4, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1400
    .line 1401
    .line 1402
    move-object/from16 v10, v22

    .line 1403
    .line 1404
    invoke-virtual {v4, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1405
    .line 1406
    .line 1407
    invoke-virtual {v4, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1408
    .line 1409
    .line 1410
    sget-object v13, Lmz1;->N5:Liz1;

    .line 1411
    .line 1412
    move-object/from16 v18, v0

    .line 1413
    .line 1414
    sget-object v0, Ltw1;->e:Ltw1;

    .line 1415
    .line 1416
    iget-object v0, v0, Ltw1;->c:Lkz1;

    .line 1417
    .line 1418
    invoke-virtual {v0, v13}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 1419
    .line 1420
    .line 1421
    move-result-object v0

    .line 1422
    check-cast v0, Ljava/lang/Boolean;

    .line 1423
    .line 1424
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1425
    .line 1426
    .line 1427
    move-result v0

    .line 1428
    if-eqz v0, :cond_28

    .line 1429
    .line 1430
    const-string v0, "template_id"

    .line 1431
    .line 1432
    invoke-virtual {v9, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    .line 1433
    .line 1434
    .line 1435
    move-result v0

    .line 1436
    const/4 v13, 0x3

    .line 1437
    if-ne v0, v13, :cond_29

    .line 1438
    .line 1439
    :cond_28
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1440
    .line 1441
    .line 1442
    :cond_29
    invoke-static {v4}, Lxm3;->m(Ljava/util/Collection;)Lxm3;

    .line 1443
    .line 1444
    .line 1445
    move-result-object v0

    .line 1446
    move-object v13, v2

    .line 1447
    new-instance v2, Lat2;

    .line 1448
    .line 1449
    move-object v4, v5

    .line 1450
    move-object/from16 v16, v13

    .line 1451
    .line 1452
    move-object/from16 v5, v18

    .line 1453
    .line 1454
    move-object v13, v3

    .line 1455
    move-object v3, v8

    .line 1456
    move-object v8, v11

    .line 1457
    move-object v11, v10

    .line 1458
    move-object v10, v12

    .line 1459
    move-object v12, v1

    .line 1460
    const/4 v1, 0x2

    .line 1461
    invoke-direct/range {v2 .. v14}, Lat2;-><init>(Lp21;Ln70;Ln70;Ln70;Ln70;Ln70;Lorg/json/JSONObject;Ln70;Ln70;Ln70;Ln70;Ln70;)V

    .line 1462
    .line 1463
    .line 1464
    new-instance v3, Lcq3;

    .line 1465
    .line 1466
    const/4 v11, 0x0

    .line 1467
    invoke-direct {v3, v0, v11, v11}, Ltp3;-><init>(Ltm3;ZZ)V

    .line 1468
    .line 1469
    .line 1470
    new-instance v0, Lbq3;

    .line 1471
    .line 1472
    move-object/from16 v4, v24

    .line 1473
    .line 1474
    invoke-direct {v0, v3, v2, v4}, Lbq3;-><init>(Lcq3;Ljava/util/concurrent/Callable;Ljava/util/concurrent/Executor;)V

    .line 1475
    .line 1476
    .line 1477
    iput-object v0, v3, Lcq3;->u:Lbq3;

    .line 1478
    .line 1479
    invoke-virtual {v3}, Ltp3;->v()V

    .line 1480
    .line 1481
    .line 1482
    new-array v0, v1, [Ln70;

    .line 1483
    .line 1484
    aput-object v17, v0, v11

    .line 1485
    .line 1486
    const/4 v13, 0x1

    .line 1487
    aput-object v3, v0, v13

    .line 1488
    .line 1489
    invoke-static {v0}, Lxm3;->n([Ljava/lang/Object;)Lsn3;

    .line 1490
    .line 1491
    .line 1492
    move-result-object v9

    .line 1493
    new-instance v0, Lb13;

    .line 1494
    .line 1495
    move-object/from16 v1, p0

    .line 1496
    .line 1497
    move-object/from16 v4, p1

    .line 1498
    .line 1499
    move-object/from16 v5, p2

    .line 1500
    .line 1501
    move-object/from16 v6, p3

    .line 1502
    .line 1503
    move-object v2, v3

    .line 1504
    move-object v7, v15

    .line 1505
    move-object/from16 v8, v16

    .line 1506
    .line 1507
    move-object/from16 v3, v17

    .line 1508
    .line 1509
    invoke-direct/range {v0 .. v8}, Lb13;-><init>(Lc13;Lcq3;Ln70;Lh83;La83;Lorg/json/JSONObject;Lsu1;Lqb2;)V

    .line 1510
    .line 1511
    .line 1512
    new-instance v2, Lcq3;

    .line 1513
    .line 1514
    invoke-direct {v2, v9, v13, v11}, Ltp3;-><init>(Ltm3;ZZ)V

    .line 1515
    .line 1516
    .line 1517
    new-instance v3, Lbq3;

    .line 1518
    .line 1519
    iget-object v4, v1, Lc13;->b:Lpq3;

    .line 1520
    .line 1521
    invoke-direct {v3, v2, v0, v4}, Lbq3;-><init>(Lcq3;Ljava/util/concurrent/Callable;Ljava/util/concurrent/Executor;)V

    .line 1522
    .line 1523
    .line 1524
    iput-object v3, v2, Lcq3;->u:Lbq3;

    .line 1525
    .line 1526
    invoke-virtual {v2}, Ltp3;->v()V

    .line 1527
    .line 1528
    .line 1529
    return-object v2
.end method
