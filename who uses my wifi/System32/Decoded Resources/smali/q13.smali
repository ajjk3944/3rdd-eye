.class public final Lq13;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lca4;


# instance fields
.field public final synthetic a:I

.field public final b:Lga4;

.field public final c:Lga4;

.field public final d:Lga4;


# direct methods
.method public synthetic constructor <init>(Lga4;Lga4;Lga4;I)V
    .locals 0

    .line 1
    iput p4, p0, Lq13;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lq13;->b:Lga4;

    .line 4
    .line 5
    iput-object p2, p0, Lq13;->c:Lga4;

    .line 6
    .line 7
    iput-object p3, p0, Lq13;->d:Lga4;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public a()Le33;
    .locals 6

    .line 1
    sget-object v1, Lmd2;->a:Lld2;

    .line 2
    .line 3
    invoke-static {v1}, Li41;->M(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lq13;->b:Lga4;

    .line 7
    .line 8
    invoke-interface {v0}, Lga4;->d()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    move-object v2, v0

    .line 13
    check-cast v2, Lyu2;

    .line 14
    .line 15
    iget-object v0, p0, Lq13;->c:Lga4;

    .line 16
    .line 17
    invoke-interface {v0}, Lga4;->d()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    move-object v3, v0

    .line 22
    check-cast v3, Lmw2;

    .line 23
    .line 24
    iget-object v0, p0, Lq13;->d:Lga4;

    .line 25
    .line 26
    invoke-interface {v0}, Lga4;->d()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    move-object v4, v0

    .line 31
    check-cast v4, Ln33;

    .line 32
    .line 33
    new-instance v0, Le33;

    .line 34
    .line 35
    const/4 v5, 0x2

    .line 36
    invoke-direct/range {v0 .. v5}, Le33;-><init>(Lpq3;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 37
    .line 38
    .line 39
    return-object v0
.end method

.method public final d()Ljava/lang/Object;
    .locals 7

    .line 1
    iget v0, p0, Lq13;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lq13;->b:Lga4;

    .line 7
    .line 8
    invoke-interface {v0}, Lga4;->d()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Lrf3;

    .line 13
    .line 14
    iget-object v0, p0, Lq13;->c:Lga4;

    .line 15
    .line 16
    invoke-interface {v0}, Lga4;->d()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    check-cast v0, Lgk3;

    .line 21
    .line 22
    iget-object v1, p0, Lq13;->d:Lga4;

    .line 23
    .line 24
    invoke-interface {v1}, Lga4;->d()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    check-cast v1, Lvf3;

    .line 29
    .line 30
    new-instance v2, Lwj3;

    .line 31
    .line 32
    invoke-virtual {v1}, Lvf3;->K()Lcg3;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-virtual {v1}, Lcg3;->B()J

    .line 37
    .line 38
    .line 39
    move-result-wide v3

    .line 40
    invoke-direct {v2, v0, v3, v4}, Lwj3;-><init>(Lgk3;J)V

    .line 41
    .line 42
    .line 43
    return-object v2

    .line 44
    :pswitch_0
    iget-object v0, p0, Lq13;->b:Lga4;

    .line 45
    .line 46
    invoke-interface {v0}, Lga4;->d()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    check-cast v0, Landroid/content/Context;

    .line 51
    .line 52
    iget-object v1, p0, Lq13;->c:Lga4;

    .line 53
    .line 54
    invoke-interface {v1}, Lga4;->d()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    check-cast v1, Ljava/util/concurrent/ExecutorService;

    .line 59
    .line 60
    iget-object v2, p0, Lq13;->d:Lga4;

    .line 61
    .line 62
    invoke-interface {v2}, Lga4;->d()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    check-cast v2, Lpg3;

    .line 67
    .line 68
    new-instance v3, Lgj3;

    .line 69
    .line 70
    invoke-direct {v3, v0, v1, v2}, Lgj3;-><init>(Landroid/content/Context;Ljava/util/concurrent/ExecutorService;Lpg3;)V

    .line 71
    .line 72
    .line 73
    return-object v3

    .line 74
    :pswitch_1
    iget-object v0, p0, Lq13;->b:Lga4;

    .line 75
    .line 76
    invoke-interface {v0}, Lga4;->d()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    check-cast v0, Landroid/content/Context;

    .line 81
    .line 82
    iget-object v1, p0, Lq13;->c:Lga4;

    .line 83
    .line 84
    invoke-interface {v1}, Lga4;->d()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    check-cast v1, Lvf3;

    .line 89
    .line 90
    iget-object v2, p0, Lq13;->d:Lga4;

    .line 91
    .line 92
    invoke-interface {v2}, Lga4;->d()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    check-cast v2, Lxj3;

    .line 97
    .line 98
    new-instance v3, Lhj3;

    .line 99
    .line 100
    invoke-direct {v3, v0, v1, v2}, Lhj3;-><init>(Landroid/content/Context;Lvf3;Lxj3;)V

    .line 101
    .line 102
    .line 103
    return-object v3

    .line 104
    :pswitch_2
    iget-object v0, p0, Lq13;->b:Lga4;

    .line 105
    .line 106
    check-cast v0, Lz43;

    .line 107
    .line 108
    invoke-virtual {v0}, Lz43;->a()Lk33;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    iget-object v1, p0, Lq13;->c:Lga4;

    .line 113
    .line 114
    invoke-interface {v1}, Lga4;->d()Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v1

    .line 118
    check-cast v1, Lf43;

    .line 119
    .line 120
    iget-object v2, p0, Lq13;->d:Lga4;

    .line 121
    .line 122
    invoke-interface {v2}, Lga4;->d()Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v2

    .line 126
    check-cast v2, Ljava/util/List;

    .line 127
    .line 128
    const-string v3, "29"

    .line 129
    .line 130
    invoke-interface {v2, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 131
    .line 132
    .line 133
    move-result v2

    .line 134
    const/4 v3, 0x1

    .line 135
    if-eq v3, v2, :cond_0

    .line 136
    .line 137
    goto :goto_0

    .line 138
    :cond_0
    move-object v0, v1

    .line 139
    :goto_0
    invoke-static {v0}, Li41;->M(Ljava/lang/Object;)V

    .line 140
    .line 141
    .line 142
    return-object v0

    .line 143
    :pswitch_3
    sget-object v0, Lmd2;->a:Lld2;

    .line 144
    .line 145
    invoke-static {v0}, Li41;->M(Ljava/lang/Object;)V

    .line 146
    .line 147
    .line 148
    new-instance v1, Lg43;

    .line 149
    .line 150
    const/4 v2, 0x2

    .line 151
    invoke-direct {v1, v0, v2}, Lg43;-><init>(Lpq3;I)V

    .line 152
    .line 153
    .line 154
    iget-object v0, p0, Lq13;->b:Lga4;

    .line 155
    .line 156
    invoke-interface {v0}, Lga4;->d()Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    check-cast v0, Lf43;

    .line 161
    .line 162
    iget-object v2, p0, Lq13;->c:Lga4;

    .line 163
    .line 164
    invoke-interface {v2}, Lga4;->d()Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v2

    .line 168
    check-cast v2, Ljava/util/List;

    .line 169
    .line 170
    iget-object v3, p0, Lq13;->d:Lga4;

    .line 171
    .line 172
    invoke-interface {v3}, Lga4;->d()Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v3

    .line 176
    check-cast v3, Ljava/util/concurrent/ScheduledExecutorService;

    .line 177
    .line 178
    const-string v4, "24"

    .line 179
    .line 180
    invoke-interface {v2, v4}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 181
    .line 182
    .line 183
    move-result v2

    .line 184
    if-eqz v2, :cond_1

    .line 185
    .line 186
    new-instance v1, Lx43;

    .line 187
    .line 188
    sget-object v2, Lmz1;->Wc:Liz1;

    .line 189
    .line 190
    sget-object v4, Ltw1;->e:Ltw1;

    .line 191
    .line 192
    iget-object v4, v4, Ltw1;->c:Lkz1;

    .line 193
    .line 194
    invoke-virtual {v4, v2}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object v2

    .line 198
    check-cast v2, Ljava/lang/Integer;

    .line 199
    .line 200
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 201
    .line 202
    .line 203
    move-result v2

    .line 204
    int-to-long v4, v2

    .line 205
    invoke-direct {v1, v0, v4, v5, v3}, Lx43;-><init>(Lq53;JLjava/util/concurrent/ScheduledExecutorService;)V

    .line 206
    .line 207
    .line 208
    goto :goto_1

    .line 209
    :cond_1
    new-instance v0, Lx43;

    .line 210
    .line 211
    sget-object v2, Lmz1;->Wc:Liz1;

    .line 212
    .line 213
    sget-object v4, Ltw1;->e:Ltw1;

    .line 214
    .line 215
    iget-object v4, v4, Ltw1;->c:Lkz1;

    .line 216
    .line 217
    invoke-virtual {v4, v2}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    move-result-object v2

    .line 221
    check-cast v2, Ljava/lang/Integer;

    .line 222
    .line 223
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 224
    .line 225
    .line 226
    move-result v2

    .line 227
    int-to-long v4, v2

    .line 228
    invoke-direct {v0, v1, v4, v5, v3}, Lx43;-><init>(Lq53;JLjava/util/concurrent/ScheduledExecutorService;)V

    .line 229
    .line 230
    .line 231
    move-object v1, v0

    .line 232
    :goto_1
    return-object v1

    .line 233
    :pswitch_4
    iget-object v0, p0, Lq13;->b:Lga4;

    .line 234
    .line 235
    check-cast v0, Ld33;

    .line 236
    .line 237
    iget-object v0, v0, Ld33;->a:Lga4;

    .line 238
    .line 239
    check-cast v0, Lhh2;

    .line 240
    .line 241
    invoke-virtual {v0}, Lhh2;->a()Landroid/content/Context;

    .line 242
    .line 243
    .line 244
    move-result-object v0

    .line 245
    new-instance v1, Lb33;

    .line 246
    .line 247
    const/4 v2, 0x0

    .line 248
    invoke-direct {v1, v2, v0}, Lb33;-><init>(ILjava/lang/Object;)V

    .line 249
    .line 250
    .line 251
    iget-object v0, p0, Lq13;->c:Lga4;

    .line 252
    .line 253
    invoke-interface {v0}, Lga4;->d()Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    move-result-object v0

    .line 257
    check-cast v0, Lf43;

    .line 258
    .line 259
    iget-object v2, p0, Lq13;->d:Lga4;

    .line 260
    .line 261
    invoke-interface {v2}, Lga4;->d()Ljava/lang/Object;

    .line 262
    .line 263
    .line 264
    move-result-object v2

    .line 265
    check-cast v2, Ljava/util/List;

    .line 266
    .line 267
    const-string v3, "2"

    .line 268
    .line 269
    invoke-interface {v2, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 270
    .line 271
    .line 272
    move-result v2

    .line 273
    const/4 v3, 0x1

    .line 274
    if-eq v3, v2, :cond_2

    .line 275
    .line 276
    goto :goto_2

    .line 277
    :cond_2
    move-object v1, v0

    .line 278
    :goto_2
    invoke-static {v1}, Li41;->M(Ljava/lang/Object;)V

    .line 279
    .line 280
    .line 281
    return-object v1

    .line 282
    :pswitch_5
    iget-object v0, p0, Lq13;->b:Lga4;

    .line 283
    .line 284
    check-cast v0, Lhh2;

    .line 285
    .line 286
    invoke-virtual {v0}, Lhh2;->a()Landroid/content/Context;

    .line 287
    .line 288
    .line 289
    move-result-object v0

    .line 290
    iget-object v1, p0, Lq13;->c:Lga4;

    .line 291
    .line 292
    invoke-interface {v1}, Lga4;->d()Ljava/lang/Object;

    .line 293
    .line 294
    .line 295
    move-result-object v1

    .line 296
    check-cast v1, Lgd2;

    .line 297
    .line 298
    iget-object v2, p0, Lq13;->d:Lga4;

    .line 299
    .line 300
    invoke-interface {v2}, Lga4;->d()Ljava/lang/Object;

    .line 301
    .line 302
    .line 303
    move-result-object v2

    .line 304
    check-cast v2, Ljava/util/concurrent/ScheduledExecutorService;

    .line 305
    .line 306
    sget-object v3, Lmd2;->a:Lld2;

    .line 307
    .line 308
    invoke-static {v3}, Li41;->M(Ljava/lang/Object;)V

    .line 309
    .line 310
    .line 311
    new-instance v4, Ls33;

    .line 312
    .line 313
    invoke-direct {v4, v0, v1, v2, v3}, Ls33;-><init>(Landroid/content/Context;Lgd2;Ljava/util/concurrent/ScheduledExecutorService;Lpq3;)V

    .line 314
    .line 315
    .line 316
    return-object v4

    .line 317
    :pswitch_6
    invoke-virtual {p0}, Lq13;->a()Le33;

    .line 318
    .line 319
    .line 320
    move-result-object v0

    .line 321
    return-object v0

    .line 322
    :pswitch_7
    iget-object v0, p0, Lq13;->b:Lga4;

    .line 323
    .line 324
    invoke-interface {v0}, Lga4;->d()Ljava/lang/Object;

    .line 325
    .line 326
    .line 327
    move-result-object v0

    .line 328
    move-object v2, v0

    .line 329
    check-cast v2, Ls83;

    .line 330
    .line 331
    iget-object v0, p0, Lq13;->c:Lga4;

    .line 332
    .line 333
    invoke-interface {v0}, Lga4;->d()Ljava/lang/Object;

    .line 334
    .line 335
    .line 336
    move-result-object v0

    .line 337
    move-object v3, v0

    .line 338
    check-cast v3, Lxu2;

    .line 339
    .line 340
    iget-object v0, p0, Lq13;->d:Lga4;

    .line 341
    .line 342
    invoke-interface {v0}, Lga4;->d()Ljava/lang/Object;

    .line 343
    .line 344
    .line 345
    move-result-object v0

    .line 346
    move-object v4, v0

    .line 347
    check-cast v4, Lmv2;

    .line 348
    .line 349
    new-instance v1, Lt83;

    .line 350
    .line 351
    const/16 v5, 0x1a

    .line 352
    .line 353
    const/4 v6, 0x0

    .line 354
    invoke-direct/range {v1 .. v6}, Lt83;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 355
    .line 356
    .line 357
    return-object v1

    .line 358
    nop

    .line 359
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
