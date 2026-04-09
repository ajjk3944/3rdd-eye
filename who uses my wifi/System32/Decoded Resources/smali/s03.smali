.class public final synthetic Ls03;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lyp3;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;

.field public final synthetic f:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p6, p0, Ls03;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Ls03;->b:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p2, p0, Ls03;->c:Ljava/lang/Object;

    .line 6
    .line 7
    iput-object p3, p0, Ls03;->d:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p4, p0, Ls03;->e:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p5, p0, Ls03;->f:Ljava/lang/Object;

    .line 12
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Object;)Ln70;
    .locals 14

    .line 1
    iget v0, p0, Ls03;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ls03;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lbu1;

    .line 9
    .line 10
    iget-object v1, p0, Ls03;->c:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Llv2;

    .line 13
    .line 14
    iget-object v2, p0, Ls03;->d:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v2, La73;

    .line 17
    .line 18
    iget-object v3, p0, Ls03;->e:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v3, Lj73;

    .line 21
    .line 22
    iget-object v4, p0, Ls03;->f:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v4, Llm2;

    .line 25
    .line 26
    check-cast p1, Lc73;

    .line 27
    .line 28
    if-eqz p1, :cond_6

    .line 29
    .line 30
    iget-object v6, v2, La73;->a:Lj73;

    .line 31
    .line 32
    iget-object v7, v2, La73;->b:Llv2;

    .line 33
    .line 34
    iget-object v8, v2, La73;->c:Lpc4;

    .line 35
    .line 36
    iget-object v9, v2, La73;->d:Ljava/lang/String;

    .line 37
    .line 38
    iget-object v10, v2, La73;->e:Ljava/util/concurrent/Executor;

    .line 39
    .line 40
    iget-object v11, v2, La73;->f:Lvi4;

    .line 41
    .line 42
    iget-object v12, p1, Lc73;->a:Lf93;

    .line 43
    .line 44
    new-instance v5, La73;

    .line 45
    .line 46
    invoke-direct/range {v5 .. v12}, La73;-><init>(Lj73;Llv2;Lpc4;Ljava/lang/String;Ljava/util/concurrent/Executor;Lvi4;Lf93;)V

    .line 47
    .line 48
    .line 49
    iget-object v2, p1, Lc73;->c:Le93;

    .line 50
    .line 51
    const/4 v6, 0x0

    .line 52
    if-eqz v2, :cond_0

    .line 53
    .line 54
    iput-object v6, v0, Lbu1;->k:Ljava/lang/Object;

    .line 55
    .line 56
    iget-object p1, v0, Lbu1;->i:Ljava/lang/Object;

    .line 57
    .line 58
    move-object v7, p1

    .line 59
    check-cast v7, Lpj4;

    .line 60
    .line 61
    monitor-enter v7

    .line 62
    :try_start_0
    iget-object p1, v7, Lpj4;->i:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast p1, Ljava/util/ArrayDeque;

    .line 65
    .line 66
    invoke-virtual {p1, v5}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 67
    .line 68
    .line 69
    monitor-exit v7

    .line 70
    invoke-virtual {v0, v2, v1}, Lbu1;->w(Le93;Llv2;)Ln70;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    goto/16 :goto_7

    .line 75
    .line 76
    :catchall_0
    move-exception v0

    .line 77
    move-object p1, v0

    .line 78
    :try_start_1
    monitor-exit v7
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 79
    throw p1

    .line 80
    :cond_0
    iget-object v2, v0, Lbu1;->i:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast v2, Lpj4;

    .line 83
    .line 84
    monitor-enter v2

    .line 85
    const/4 v7, 0x2

    .line 86
    :try_start_2
    iput v7, v2, Lpj4;->f:I

    .line 87
    .line 88
    monitor-enter v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_4

    .line 89
    :try_start_3
    iget-object v7, v2, Lpj4;->j:Ljava/lang/Object;

    .line 90
    .line 91
    check-cast v7, Lgc3;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 92
    .line 93
    const/4 v8, 0x1

    .line 94
    if-nez v7, :cond_1

    .line 95
    .line 96
    :try_start_4
    monitor-exit v2

    .line 97
    move v9, v8

    .line 98
    goto :goto_0

    .line 99
    :cond_1
    monitor-exit v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 100
    const/4 v9, 0x0

    .line 101
    :goto_0
    if-eqz v9, :cond_2

    .line 102
    .line 103
    monitor-exit v2

    .line 104
    move-object v8, v6

    .line 105
    goto :goto_3

    .line 106
    :cond_2
    :try_start_5
    monitor-enter v7
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 107
    :try_start_6
    iget-boolean v9, v7, Lgc3;->b:Z

    .line 108
    .line 109
    if-nez v9, :cond_4

    .line 110
    .line 111
    iget-boolean v9, v7, Lgc3;->a:Z

    .line 112
    .line 113
    if-eqz v9, :cond_3

    .line 114
    .line 115
    goto :goto_1

    .line 116
    :cond_3
    iget-object v9, v7, Lgc3;->c:Ljava/lang/Object;

    .line 117
    .line 118
    check-cast v9, La73;

    .line 119
    .line 120
    iget-object v9, v9, La73;->g:Lf93;

    .line 121
    .line 122
    if-eqz v9, :cond_4

    .line 123
    .line 124
    invoke-virtual {v9, v12}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    move-result v9

    .line 128
    if-eqz v9, :cond_4

    .line 129
    .line 130
    iput-boolean v8, v7, Lgc3;->a:Z

    .line 131
    .line 132
    iget-object v8, v7, Lgc3;->d:Ljava/lang/Object;

    .line 133
    .line 134
    check-cast v8, Lwo3;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 135
    .line 136
    :try_start_7
    monitor-exit v7

    .line 137
    goto :goto_2

    .line 138
    :catchall_1
    move-exception v0

    .line 139
    move-object p1, v0

    .line 140
    goto :goto_4

    .line 141
    :cond_4
    :goto_1
    monitor-exit v7
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    .line 142
    move-object v8, v6

    .line 143
    :goto_2
    monitor-exit v2

    .line 144
    :goto_3
    if-eqz v8, :cond_5

    .line 145
    .line 146
    iput-object v6, v0, Lbu1;->k:Ljava/lang/Object;

    .line 147
    .line 148
    new-instance p1, Lu42;

    .line 149
    .line 150
    const/16 v1, 0xc

    .line 151
    .line 152
    invoke-direct {p1, v1, v0}, Lu42;-><init>(ILjava/lang/Object;)V

    .line 153
    .line 154
    .line 155
    iget-object v0, v0, Lbu1;->l:Ljava/lang/Object;

    .line 156
    .line 157
    check-cast v0, Ljava/util/concurrent/Executor;

    .line 158
    .line 159
    invoke-static {v8, p1, v0}, Lpu1;->O(Ln70;Lyp3;Ljava/util/concurrent/Executor;)Lqp3;

    .line 160
    .line 161
    .line 162
    move-result-object p1

    .line 163
    goto :goto_7

    .line 164
    :cond_5
    monitor-enter v2

    .line 165
    :try_start_8
    iget-object v6, v2, Lpj4;->i:Ljava/lang/Object;

    .line 166
    .line 167
    check-cast v6, Ljava/util/ArrayDeque;

    .line 168
    .line 169
    invoke-virtual {v6, v5}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    .line 170
    .line 171
    .line 172
    monitor-exit v2

    .line 173
    iget-object v1, v1, Llv2;->h:Ljava/lang/Object;

    .line 174
    .line 175
    check-cast v1, Li73;

    .line 176
    .line 177
    iget-object p1, p1, Lc73;->b:Lfa2;

    .line 178
    .line 179
    new-instance v2, Llv2;

    .line 180
    .line 181
    const/4 v5, 0x5

    .line 182
    const/4 v6, 0x0

    .line 183
    invoke-direct {v2, v1, p1, v5, v6}, Llv2;-><init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 184
    .line 185
    .line 186
    move-object v1, v2

    .line 187
    goto :goto_6

    .line 188
    :catchall_2
    move-exception v0

    .line 189
    move-object p1, v0

    .line 190
    :try_start_9
    monitor-exit v2
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    .line 191
    throw p1

    .line 192
    :goto_4
    :try_start_a
    monitor-exit v7
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_1

    .line 193
    :try_start_b
    throw p1
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_4

    .line 194
    :goto_5
    :try_start_c
    monitor-exit v2
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_3

    .line 195
    :try_start_d
    throw p1

    .line 196
    :catchall_3
    move-exception v0

    .line 197
    move-object p1, v0

    .line 198
    goto :goto_5

    .line 199
    :catchall_4
    move-exception v0

    .line 200
    move-object p1, v0

    .line 201
    monitor-exit v2
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_4

    .line 202
    throw p1

    .line 203
    :cond_6
    :goto_6
    iget-object p1, v0, Lbu1;->g:Ljava/lang/Object;

    .line 204
    .line 205
    check-cast p1, Lmr2;

    .line 206
    .line 207
    invoke-virtual {p1, v1, v3, v4}, Lmr2;->w(Llv2;Lj73;Llm2;)Ln70;

    .line 208
    .line 209
    .line 210
    move-result-object p1

    .line 211
    iput-object v4, v0, Lbu1;->k:Ljava/lang/Object;

    .line 212
    .line 213
    :goto_7
    return-object p1

    .line 214
    :pswitch_0
    iget-object p1, p0, Ls03;->b:Ljava/lang/Object;

    .line 215
    .line 216
    check-cast p1, Lt03;

    .line 217
    .line 218
    iget-object v0, p0, Ls03;->c:Ljava/lang/Object;

    .line 219
    .line 220
    check-cast v0, Landroid/net/Uri;

    .line 221
    .line 222
    iget-object v1, p0, Ls03;->d:Ljava/lang/Object;

    .line 223
    .line 224
    check-cast v1, Lh83;

    .line 225
    .line 226
    iget-object v2, p0, Ls03;->e:Ljava/lang/Object;

    .line 227
    .line 228
    check-cast v2, La83;

    .line 229
    .line 230
    iget-object v3, p0, Ls03;->f:Ljava/lang/Object;

    .line 231
    .line 232
    check-cast v3, Lc83;

    .line 233
    .line 234
    :try_start_e
    new-instance v4, Lrl;

    .line 235
    .line 236
    invoke-direct {v4}, Lrl;-><init>()V

    .line 237
    .line 238
    .line 239
    invoke-virtual {v4}, Lrl;->a()Ll92;

    .line 240
    .line 241
    .line 242
    move-result-object v4

    .line 243
    iget-object v4, v4, Ll92;->f:Ljava/lang/Object;

    .line 244
    .line 245
    check-cast v4, Landroid/content/Intent;

    .line 246
    .line 247
    invoke-virtual {v4, v0}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 248
    .line 249
    .line 250
    new-instance v6, Lfc2;

    .line 251
    .line 252
    const/4 v0, 0x0

    .line 253
    invoke-direct {v6, v4, v0}, Lfc2;-><init>(Landroid/content/Intent;Lid1;)V

    .line 254
    .line 255
    .line 256
    new-instance v4, Lpd2;

    .line 257
    .line 258
    invoke-direct {v4}, Lpd2;-><init>()V

    .line 259
    .line 260
    .line 261
    iget-object v5, p1, Lt03;->c:Ljava/lang/Object;

    .line 262
    .line 263
    check-cast v5, Lei2;

    .line 264
    .line 265
    new-instance v7, Lxb4;

    .line 266
    .line 267
    invoke-direct {v7, v1, v2, v0}, Lxb4;-><init>(Lh83;La83;Ljava/lang/String;)V

    .line 268
    .line 269
    .line 270
    new-instance v1, Ll92;

    .line 271
    .line 272
    new-instance v8, Lt83;

    .line 273
    .line 274
    const/16 v9, 0x19

    .line 275
    .line 276
    invoke-direct {v8, p1, v4, v2, v9}, Lt83;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 277
    .line 278
    .line 279
    invoke-direct {v1, v8, v0}, Ll92;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 280
    .line 281
    .line 282
    new-instance v0, Ldi2;

    .line 283
    .line 284
    iget-object v2, v5, Lei2;->b:Lth2;

    .line 285
    .line 286
    iget-object v5, v5, Lei2;->c:Lei2;

    .line 287
    .line 288
    invoke-direct {v0, v2, v5, v7, v1}, Ldi2;-><init>(Lth2;Lei2;Lxb4;Ll92;)V

    .line 289
    .line 290
    .line 291
    new-instance v5, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    .line 292
    .line 293
    iget-object v1, v0, Ldi2;->F:Lba4;

    .line 294
    .line 295
    invoke-virtual {v1}, Lba4;->d()Ljava/lang/Object;

    .line 296
    .line 297
    .line 298
    move-result-object v1

    .line 299
    move-object v8, v1

    .line 300
    check-cast v8, Lxn2;

    .line 301
    .line 302
    new-instance v10, Le51;

    .line 303
    .line 304
    const/4 v1, 0x0

    .line 305
    invoke-direct {v10, v1, v1, v1}, Le51;-><init>(IIZ)V

    .line 306
    .line 307
    .line 308
    iget-object v13, v3, Lc83;->b:Ljava/lang/String;

    .line 309
    .line 310
    const/4 v7, 0x0

    .line 311
    const/4 v9, 0x0

    .line 312
    const/4 v11, 0x0

    .line 313
    const/4 v12, 0x0

    .line 314
    invoke-direct/range {v5 .. v13}, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;-><init>(Lfc2;Lfd1;Lye4;Lkf1;Le51;Ljg2;Lxp2;Ljava/lang/String;)V

    .line 315
    .line 316
    .line 317
    invoke-virtual {v4, v5}, Lpd2;->a(Ljava/lang/Object;)Z

    .line 318
    .line 319
    .line 320
    iget-object p1, p1, Lt03;->e:Ljava/lang/Object;

    .line 321
    .line 322
    check-cast p1, Lz73;

    .line 323
    .line 324
    const/4 v1, 0x2

    .line 325
    const/4 v2, 0x3

    .line 326
    invoke-virtual {p1, v1, v2}, Lz73;->c(II)V

    .line 327
    .line 328
    .line 329
    invoke-virtual {v0}, Ldi2;->y()Lhq2;

    .line 330
    .line 331
    .line 332
    move-result-object p1

    .line 333
    invoke-static {p1}, Lpu1;->r(Ljava/lang/Object;)Llq3;

    .line 334
    .line 335
    .line 336
    move-result-object p1
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_5

    .line 337
    return-object p1

    .line 338
    :catchall_5
    move-exception v0

    .line 339
    move-object p1, v0

    .line 340
    const-string v0, "Error in CustomTabsAdRenderer"

    .line 341
    .line 342
    invoke-static {v0, p1}, Lgi2;->c0(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 343
    .line 344
    .line 345
    throw p1

    .line 346
    nop

    .line 347
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
