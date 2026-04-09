.class public final Ls13;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lyp3;


# instance fields
.field public final a:Lu93;

.field public final b:Lvm2;

.field public final c:Ldb3;

.field public final d:Leb3;

.field public final e:Ljava/util/concurrent/Executor;

.field public final f:Ljava/util/concurrent/ScheduledExecutorService;

.field public final g:Lgl2;

.field public final h:Lo13;

.field public final i:Le03;

.field public final j:Landroid/content/Context;

.field public final k:Lda3;

.field public final l:Lh2;

.field public final m:Ljv2;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lu93;Lo13;Lvm2;Ldb3;Leb3;Lgl2;Lld2;Ljava/util/concurrent/ScheduledExecutorService;Le03;Lda3;Lh2;Ljv2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ls13;->j:Landroid/content/Context;

    .line 5
    .line 6
    iput-object p2, p0, Ls13;->a:Lu93;

    .line 7
    .line 8
    iput-object p3, p0, Ls13;->h:Lo13;

    .line 9
    .line 10
    iput-object p4, p0, Ls13;->b:Lvm2;

    .line 11
    .line 12
    iput-object p5, p0, Ls13;->c:Ldb3;

    .line 13
    .line 14
    iput-object p6, p0, Ls13;->d:Leb3;

    .line 15
    .line 16
    iput-object p7, p0, Ls13;->g:Lgl2;

    .line 17
    .line 18
    iput-object p8, p0, Ls13;->e:Ljava/util/concurrent/Executor;

    .line 19
    .line 20
    iput-object p9, p0, Ls13;->f:Ljava/util/concurrent/ScheduledExecutorService;

    .line 21
    .line 22
    iput-object p10, p0, Ls13;->i:Le03;

    .line 23
    .line 24
    iput-object p11, p0, Ls13;->k:Lda3;

    .line 25
    .line 26
    iput-object p12, p0, Ls13;->l:Lh2;

    .line 27
    .line 28
    iput-object p13, p0, Ls13;->m:Ljv2;

    .line 29
    .line 30
    return-void
.end method

.method public static a(Lh83;)Ljava/lang/String;
    .locals 6

    .line 1
    sget-object v0, Lmz1;->X5:Liz1;

    .line 2
    .line 3
    sget-object v1, Ltw1;->e:Ltw1;

    .line 4
    .line 5
    iget-object v2, v1, Ltw1;->c:Lkz1;

    .line 6
    .line 7
    invoke-virtual {v2, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

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
    const-string v2, "No fill."

    .line 18
    .line 19
    const/4 v3, 0x1

    .line 20
    if-eq v3, v0, :cond_0

    .line 21
    .line 22
    const-string v0, "No ad config."

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    move-object v0, v2

    .line 26
    :goto_0
    iget-object p0, p0, Lh83;->b:Lp21;

    .line 27
    .line 28
    iget-object p0, p0, Lp21;->g:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast p0, Lc83;

    .line 31
    .line 32
    iget v3, p0, Lc83;->f:I

    .line 33
    .line 34
    if-eqz v3, :cond_3

    .line 35
    .line 36
    const/16 v4, 0xc8

    .line 37
    .line 38
    const/16 v5, 0x12c

    .line 39
    .line 40
    if-lt v3, v4, :cond_1

    .line 41
    .line 42
    if-ge v3, v5, :cond_1

    .line 43
    .line 44
    sget-object v3, Lmz1;->W5:Liz1;

    .line 45
    .line 46
    iget-object v1, v1, Ltw1;->c:Lkz1;

    .line 47
    .line 48
    invoke-virtual {v1, v3}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    check-cast v1, Ljava/lang/Boolean;

    .line 53
    .line 54
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    if-nez v1, :cond_3

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_1
    if-lt v3, v5, :cond_2

    .line 62
    .line 63
    const/16 v0, 0x190

    .line 64
    .line 65
    if-ge v3, v0, :cond_2

    .line 66
    .line 67
    const-string v2, "No location header to follow redirect or too many redirects."

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_2
    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    new-instance v1, Ljava/lang/StringBuilder;

    .line 79
    .line 80
    add-int/lit8 v0, v0, 0x23

    .line 81
    .line 82
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 83
    .line 84
    .line 85
    const-string v0, "Received error HTTP response code: "

    .line 86
    .line 87
    invoke-static {v1, v0, v3}, Lex0;->j(Ljava/lang/StringBuilder;Ljava/lang/String;I)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    goto :goto_1

    .line 92
    :cond_3
    move-object v2, v0

    .line 93
    :goto_1
    iget-object p0, p0, Lc83;->j:Lls3;

    .line 94
    .line 95
    if-eqz p0, :cond_4

    .line 96
    .line 97
    iget-object p0, p0, Lls3;->b:Ljava/lang/String;

    .line 98
    .line 99
    return-object p0

    .line 100
    :cond_4
    return-object v2
.end method


# virtual methods
.method public final c(Ljava/lang/Object;)Ln70;
    .locals 22

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v3, p1

    .line 4
    .line 5
    check-cast v3, Lh83;

    .line 6
    .line 7
    sget-object v0, Lmz1;->m2:Liz1;

    .line 8
    .line 9
    sget-object v2, Ltw1;->e:Ltw1;

    .line 10
    .line 11
    iget-object v4, v2, Ltw1;->c:Lkz1;

    .line 12
    .line 13
    invoke-virtual {v4, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

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
    iget-object v0, v3, Lh83;->b:Lp21;

    .line 26
    .line 27
    iget-object v0, v0, Lp21;->i:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v0, Landroid/os/Bundle;

    .line 30
    .line 31
    if-eqz v0, :cond_0

    .line 32
    .line 33
    iget-object v4, v1, Ls13;->m:Ljv2;

    .line 34
    .line 35
    iget-object v4, v4, Ljv2;->e:Landroid/os/Bundle;

    .line 36
    .line 37
    invoke-virtual {v4, v0}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    .line 38
    .line 39
    .line 40
    :cond_0
    sget-object v0, Lmz1;->n2:Liz1;

    .line 41
    .line 42
    iget-object v4, v2, Ltw1;->c:Lkz1;

    .line 43
    .line 44
    invoke-virtual {v4, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    check-cast v0, Ljava/lang/Boolean;

    .line 49
    .line 50
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-eqz v0, :cond_1

    .line 55
    .line 56
    iget-object v0, v1, Ls13;->m:Ljv2;

    .line 57
    .line 58
    iget-object v0, v0, Ljv2;->e:Landroid/os/Bundle;

    .line 59
    .line 60
    const-string v4, "rendering-start"

    .line 61
    .line 62
    sget-object v5, Lhg4;->C:Lhg4;

    .line 63
    .line 64
    iget-object v5, v5, Lhg4;->k:Lym;

    .line 65
    .line 66
    invoke-static {v5, v0, v4}, Lga1;->n(Lym;Landroid/os/Bundle;Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    :cond_1
    invoke-static {v3}, Ls13;->a(Lh83;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    iget-object v4, v1, Ls13;->i:Le03;

    .line 74
    .line 75
    iget-object v10, v3, Lh83;->b:Lp21;

    .line 76
    .line 77
    iget-object v5, v10, Lp21;->g:Ljava/lang/Object;

    .line 78
    .line 79
    move-object v11, v5

    .line 80
    check-cast v11, Lc83;

    .line 81
    .line 82
    iput-object v11, v4, Le03;->d:Lc83;

    .line 83
    .line 84
    sget-object v5, Lmz1;->W8:Liz1;

    .line 85
    .line 86
    iget-object v6, v2, Ltw1;->c:Lkz1;

    .line 87
    .line 88
    invoke-virtual {v6, v5}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v5

    .line 92
    check-cast v5, Ljava/lang/Boolean;

    .line 93
    .line 94
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 95
    .line 96
    .line 97
    move-result v5

    .line 98
    const/4 v12, 0x3

    .line 99
    if-eqz v5, :cond_3

    .line 100
    .line 101
    iget v5, v11, Lc83;->f:I

    .line 102
    .line 103
    if-eqz v5, :cond_3

    .line 104
    .line 105
    const/16 v6, 0xc8

    .line 106
    .line 107
    if-lt v5, v6, :cond_2

    .line 108
    .line 109
    const/16 v6, 0x12c

    .line 110
    .line 111
    if-lt v5, v6, :cond_3

    .line 112
    .line 113
    :cond_2
    new-instance v2, Lr13;

    .line 114
    .line 115
    invoke-direct {v2, v0, v12}, Lhx2;-><init>(Ljava/lang/String;I)V

    .line 116
    .line 117
    .line 118
    invoke-static {v2}, Lpu1;->B(Ljava/lang/Throwable;)Lkq3;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    return-object v0

    .line 123
    :cond_3
    iget-object v5, v11, Lc83;->q:Ljava/lang/String;

    .line 124
    .line 125
    sget-object v0, Lmz1;->V3:Liz1;

    .line 126
    .line 127
    iget-object v2, v2, Ltw1;->c:Lkz1;

    .line 128
    .line 129
    invoke-virtual {v2, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    check-cast v0, Ljava/lang/Boolean;

    .line 134
    .line 135
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 136
    .line 137
    .line 138
    move-result v0

    .line 139
    const/4 v2, 0x1

    .line 140
    if-eqz v0, :cond_6

    .line 141
    .line 142
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 143
    .line 144
    .line 145
    move-result v0

    .line 146
    if-nez v0, :cond_6

    .line 147
    .line 148
    iget-object v0, v10, Lp21;->f:Ljava/lang/Object;

    .line 149
    .line 150
    move-object v6, v0

    .line 151
    check-cast v6, Ljava/util/List;

    .line 152
    .line 153
    monitor-enter v4

    .line 154
    :try_start_0
    iget-object v0, v4, Le03;->b:Ljava/util/Map;

    .line 155
    .line 156
    invoke-interface {v0, v5}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 157
    .line 158
    .line 159
    move-result v7

    .line 160
    if-nez v7, :cond_4

    .line 161
    .line 162
    goto :goto_2

    .line 163
    :cond_4
    invoke-interface {v0, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    check-cast v0, Lqh4;

    .line 168
    .line 169
    iget-object v7, v4, Le03;->a:Ljava/util/List;

    .line 170
    .line 171
    invoke-interface {v7, v0}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    .line 172
    .line 173
    .line 174
    move-result v8
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 175
    :try_start_1
    invoke-interface {v7, v8}, Ljava/util/List;->remove(I)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 176
    .line 177
    .line 178
    goto :goto_0

    .line 179
    :catchall_0
    move-exception v0

    .line 180
    goto :goto_3

    .line 181
    :catch_0
    move-exception v0

    .line 182
    :try_start_2
    const-string v7, "AdapterResponseInfoCollector.replaceAdapterResponseInfoEntry"

    .line 183
    .line 184
    sget-object v9, Lhg4;->C:Lhg4;

    .line 185
    .line 186
    iget-object v9, v9, Lhg4;->h:Lgd2;

    .line 187
    .line 188
    invoke-virtual {v9, v7, v0}, Lgd2;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 189
    .line 190
    .line 191
    :goto_0
    iget-object v0, v4, Le03;->b:Ljava/util/Map;

    .line 192
    .line 193
    invoke-interface {v0, v5}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 197
    .line 198
    .line 199
    move-result-object v0

    .line 200
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 201
    .line 202
    .line 203
    move-result v5

    .line 204
    if-eqz v5, :cond_5

    .line 205
    .line 206
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object v5

    .line 210
    check-cast v5, La83;

    .line 211
    .line 212
    invoke-virtual {v4, v5, v8}, Le03;->b(La83;I)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 213
    .line 214
    .line 215
    add-int/lit8 v8, v8, 0x1

    .line 216
    .line 217
    goto :goto_1

    .line 218
    :cond_5
    :goto_2
    monitor-exit v4

    .line 219
    goto :goto_5

    .line 220
    :goto_3
    :try_start_3
    monitor-exit v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 221
    throw v0

    .line 222
    :cond_6
    iget-object v0, v10, Lp21;->f:Ljava/lang/Object;

    .line 223
    .line 224
    check-cast v0, Ljava/util/List;

    .line 225
    .line 226
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 227
    .line 228
    .line 229
    move-result-object v0

    .line 230
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 231
    .line 232
    .line 233
    move-result v5

    .line 234
    if-eqz v5, :cond_9

    .line 235
    .line 236
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    move-result-object v5

    .line 240
    check-cast v5, La83;

    .line 241
    .line 242
    iget-object v6, v4, Le03;->a:Ljava/util/List;

    .line 243
    .line 244
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 245
    .line 246
    .line 247
    move-result v6

    .line 248
    invoke-virtual {v4, v5, v6}, Le03;->b(La83;I)V

    .line 249
    .line 250
    .line 251
    iget-object v6, v5, La83;->a:Ljava/util/List;

    .line 252
    .line 253
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 254
    .line 255
    .line 256
    move-result-object v6

    .line 257
    :cond_7
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 258
    .line 259
    .line 260
    move-result v7

    .line 261
    if-eqz v7, :cond_8

    .line 262
    .line 263
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 264
    .line 265
    .line 266
    move-result-object v7

    .line 267
    check-cast v7, Ljava/lang/String;

    .line 268
    .line 269
    iget-object v8, v1, Ls13;->g:Lgl2;

    .line 270
    .line 271
    iget v9, v5, La83;->b:I

    .line 272
    .line 273
    invoke-interface {v8, v7, v9}, Lgl2;->a(Ljava/lang/String;I)Lzz2;

    .line 274
    .line 275
    .line 276
    move-result-object v7

    .line 277
    if-eqz v7, :cond_7

    .line 278
    .line 279
    invoke-interface {v7, v3, v5}, Lzz2;->a(Lh83;La83;)Z

    .line 280
    .line 281
    .line 282
    move-result v7

    .line 283
    if-eqz v7, :cond_7

    .line 284
    .line 285
    goto :goto_4

    .line 286
    :cond_8
    const/4 v6, 0x0

    .line 287
    invoke-static {v2, v6, v6}, Lzt0;->Q(ILjava/lang/String;Lnx2;)Lnx2;

    .line 288
    .line 289
    .line 290
    move-result-object v8

    .line 291
    const/4 v9, 0x0

    .line 292
    const-wide/16 v6, 0x0

    .line 293
    .line 294
    invoke-virtual/range {v4 .. v9}, Le03;->c(La83;JLnx2;Z)V

    .line 295
    .line 296
    .line 297
    goto :goto_4

    .line 298
    :cond_9
    :goto_5
    iget-object v0, v1, Ls13;->b:Lvm2;

    .line 299
    .line 300
    iget-object v4, v1, Ls13;->d:Leb3;

    .line 301
    .line 302
    iget-object v5, v1, Ls13;->c:Ldb3;

    .line 303
    .line 304
    new-instance v6, Lkj2;

    .line 305
    .line 306
    invoke-direct {v6, v3, v4, v5}, Lkj2;-><init>(Lh83;Leb3;Ldb3;)V

    .line 307
    .line 308
    .line 309
    iget-object v7, v1, Ls13;->e:Ljava/util/concurrent/Executor;

    .line 310
    .line 311
    invoke-virtual {v0, v6, v7}, Lf74;->L1(Ljava/lang/Object;Ljava/util/concurrent/Executor;)V

    .line 312
    .line 313
    .line 314
    iget v0, v11, Lc83;->r:I

    .line 315
    .line 316
    if-le v0, v2, :cond_c

    .line 317
    .line 318
    iget-object v4, v1, Ls13;->l:Lh2;

    .line 319
    .line 320
    monitor-enter v4

    .line 321
    :try_start_4
    iget-object v0, v4, Lh2;->g:Ljava/lang/Object;

    .line 322
    .line 323
    check-cast v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 324
    .line 325
    invoke-virtual {v0, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    .line 326
    .line 327
    .line 328
    move-result v0

    .line 329
    if-nez v0, :cond_b

    .line 330
    .line 331
    iget-object v0, v3, Lh83;->b:Lp21;

    .line 332
    .line 333
    iget-object v0, v0, Lp21;->f:Ljava/lang/Object;

    .line 334
    .line 335
    check-cast v0, Ljava/util/List;

    .line 336
    .line 337
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 338
    .line 339
    .line 340
    move-result v2

    .line 341
    if-eqz v2, :cond_a

    .line 342
    .line 343
    iget-object v0, v4, Lh2;->f:Ljava/lang/Object;

    .line 344
    .line 345
    check-cast v0, Lwq3;

    .line 346
    .line 347
    new-instance v2, Lr13;

    .line 348
    .line 349
    invoke-static {v3}, Ls13;->a(Lh83;)Ljava/lang/String;

    .line 350
    .line 351
    .line 352
    move-result-object v3

    .line 353
    invoke-direct {v2, v3, v12}, Lhx2;-><init>(Ljava/lang/String;I)V

    .line 354
    .line 355
    .line 356
    invoke-virtual {v0, v2}, Lgp3;->e(Ljava/lang/Throwable;)Z

    .line 357
    .line 358
    .line 359
    goto :goto_7

    .line 360
    :catchall_1
    move-exception v0

    .line 361
    goto :goto_8

    .line 362
    :cond_a
    iput-object v3, v4, Lh2;->i:Ljava/lang/Object;

    .line 363
    .line 364
    iget-object v2, v4, Lh2;->d:Ljava/lang/Object;

    .line 365
    .line 366
    check-cast v2, Lo13;

    .line 367
    .line 368
    iget-object v5, v4, Lh2;->f:Ljava/lang/Object;

    .line 369
    .line 370
    check-cast v5, Lwq3;

    .line 371
    .line 372
    new-instance v6, Lh13;

    .line 373
    .line 374
    invoke-direct {v6, v3, v2, v5}, Lh13;-><init>(Lh83;Lo13;Lwq3;)V

    .line 375
    .line 376
    .line 377
    iput-object v6, v4, Lh2;->h:Ljava/lang/Object;

    .line 378
    .line 379
    invoke-virtual {v2, v0}, Lo13;->a(Ljava/util/List;)V

    .line 380
    .line 381
    .line 382
    iget-object v0, v4, Lh2;->h:Ljava/lang/Object;

    .line 383
    .line 384
    check-cast v0, Lh13;

    .line 385
    .line 386
    invoke-virtual {v0}, Lh13;->a()La83;

    .line 387
    .line 388
    .line 389
    move-result-object v0

    .line 390
    :goto_6
    if-eqz v0, :cond_b

    .line 391
    .line 392
    invoke-virtual {v4, v0}, Lh2;->q(La83;)V

    .line 393
    .line 394
    .line 395
    iget-object v0, v4, Lh2;->h:Ljava/lang/Object;

    .line 396
    .line 397
    check-cast v0, Lh13;

    .line 398
    .line 399
    invoke-virtual {v0}, Lh13;->a()La83;

    .line 400
    .line 401
    .line 402
    move-result-object v0

    .line 403
    goto :goto_6

    .line 404
    :cond_b
    :goto_7
    iget-object v0, v4, Lh2;->f:Ljava/lang/Object;

    .line 405
    .line 406
    check-cast v0, Lwq3;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 407
    .line 408
    monitor-exit v4

    .line 409
    goto/16 :goto_c

    .line 410
    .line 411
    :goto_8
    :try_start_5
    monitor-exit v4
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 412
    throw v0

    .line 413
    :cond_c
    invoke-static {v3}, Ls13;->a(Lh83;)Ljava/lang/String;

    .line 414
    .line 415
    .line 416
    move-result-object v0

    .line 417
    iget-object v14, v1, Ls13;->a:Lu93;

    .line 418
    .line 419
    sget-object v15, Ls93;->q:Ls93;

    .line 420
    .line 421
    invoke-static {v14}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 422
    .line 423
    .line 424
    new-instance v2, Lr13;

    .line 425
    .line 426
    invoke-direct {v2, v0, v12}, Lhx2;-><init>(Ljava/lang/String;I)V

    .line 427
    .line 428
    .line 429
    invoke-static {v2}, Lpu1;->B(Ljava/lang/Throwable;)Lkq3;

    .line 430
    .line 431
    .line 432
    move-result-object v19

    .line 433
    new-instance v13, Lbu1;

    .line 434
    .line 435
    sget-object v17, Lu93;->d:Llq3;

    .line 436
    .line 437
    sget-object v18, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 438
    .line 439
    const/16 v16, 0x0

    .line 440
    .line 441
    invoke-direct/range {v13 .. v19}, Lbu1;-><init>(Lu93;Ljava/lang/Object;Ljava/lang/String;Ln70;Ljava/util/List;Ln70;)V

    .line 442
    .line 443
    .line 444
    invoke-virtual {v13}, Lbu1;->A()Lq93;

    .line 445
    .line 446
    .line 447
    move-result-object v0

    .line 448
    iget-object v6, v1, Ls13;->h:Lo13;

    .line 449
    .line 450
    monitor-enter v6

    .line 451
    :try_start_6
    iget-object v2, v6, Lo13;->a:Lym;

    .line 452
    .line 453
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 454
    .line 455
    .line 456
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 457
    .line 458
    .line 459
    move-result-wide v4

    .line 460
    iput-wide v4, v6, Lo13;->i:J
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 461
    .line 462
    monitor-exit v6

    .line 463
    iget-object v2, v10, Lp21;->f:Ljava/lang/Object;

    .line 464
    .line 465
    check-cast v2, Ljava/util/List;

    .line 466
    .line 467
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 468
    .line 469
    .line 470
    move-result-object v8

    .line 471
    const/4 v2, 0x0

    .line 472
    move v9, v2

    .line 473
    :goto_9
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 474
    .line 475
    .line 476
    move-result v2

    .line 477
    if-eqz v2, :cond_f

    .line 478
    .line 479
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 480
    .line 481
    .line 482
    move-result-object v2

    .line 483
    check-cast v2, La83;

    .line 484
    .line 485
    iget-object v4, v2, La83;->a:Ljava/util/List;

    .line 486
    .line 487
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 488
    .line 489
    .line 490
    move-result-object v4

    .line 491
    :goto_a
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 492
    .line 493
    .line 494
    move-result v5

    .line 495
    if-eqz v5, :cond_e

    .line 496
    .line 497
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 498
    .line 499
    .line 500
    move-result-object v5

    .line 501
    check-cast v5, Ljava/lang/String;

    .line 502
    .line 503
    iget-object v10, v1, Ls13;->g:Lgl2;

    .line 504
    .line 505
    iget v11, v2, La83;->b:I

    .line 506
    .line 507
    invoke-interface {v10, v5, v11}, Lgl2;->a(Ljava/lang/String;I)Lzz2;

    .line 508
    .line 509
    .line 510
    move-result-object v10

    .line 511
    if-eqz v10, :cond_d

    .line 512
    .line 513
    invoke-interface {v10, v3, v2}, Lzz2;->a(Lh83;La83;)Z

    .line 514
    .line 515
    .line 516
    move-result v11

    .line 517
    if-eqz v11, :cond_d

    .line 518
    .line 519
    sget-object v4, Ls93;->r:Ls93;

    .line 520
    .line 521
    invoke-virtual {v14, v0, v4}, Lu93;->a(Ln70;Ljava/lang/Object;)Lbu1;

    .line 522
    .line 523
    .line 524
    move-result-object v0

    .line 525
    invoke-static {v9}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 526
    .line 527
    .line 528
    move-result-object v4

    .line 529
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 530
    .line 531
    .line 532
    move-result v4

    .line 533
    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 534
    .line 535
    .line 536
    move-result-object v11

    .line 537
    add-int/lit8 v4, v4, 0xf

    .line 538
    .line 539
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    .line 540
    .line 541
    .line 542
    move-result v11

    .line 543
    new-instance v12, Ljava/lang/StringBuilder;

    .line 544
    .line 545
    add-int/2addr v4, v11

    .line 546
    invoke-direct {v12, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 547
    .line 548
    .line 549
    const-string v4, "render-config-"

    .line 550
    .line 551
    invoke-virtual {v12, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 552
    .line 553
    .line 554
    invoke-virtual {v12, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 555
    .line 556
    .line 557
    const-string v4, "-"

    .line 558
    .line 559
    invoke-virtual {v12, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 560
    .line 561
    .line 562
    invoke-virtual {v12, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 563
    .line 564
    .line 565
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 566
    .line 567
    .line 568
    move-result-object v18

    .line 569
    iget-object v4, v0, Lbu1;->i:Ljava/lang/Object;

    .line 570
    .line 571
    move-object/from16 v19, v4

    .line 572
    .line 573
    check-cast v19, Ln70;

    .line 574
    .line 575
    iget-object v4, v0, Lbu1;->j:Ljava/lang/Object;

    .line 576
    .line 577
    move-object/from16 v20, v4

    .line 578
    .line 579
    check-cast v20, Ljava/util/List;

    .line 580
    .line 581
    iget-object v4, v0, Lbu1;->k:Ljava/lang/Object;

    .line 582
    .line 583
    move-object v11, v4

    .line 584
    check-cast v11, Ln70;

    .line 585
    .line 586
    iget-object v4, v0, Lbu1;->l:Ljava/lang/Object;

    .line 587
    .line 588
    move-object v12, v4

    .line 589
    check-cast v12, Lu93;

    .line 590
    .line 591
    iget-object v13, v0, Lbu1;->g:Ljava/lang/Object;

    .line 592
    .line 593
    invoke-static {v12}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 594
    .line 595
    .line 596
    new-instance v0, Lk62;

    .line 597
    .line 598
    const/4 v5, 0x5

    .line 599
    move-object v4, v10

    .line 600
    invoke-direct/range {v0 .. v5}, Lk62;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 601
    .line 602
    .line 603
    const-class v1, Ljava/lang/Throwable;

    .line 604
    .line 605
    new-instance v15, Lbu1;

    .line 606
    .line 607
    iget-object v2, v12, Lu93;->a:Lpq3;

    .line 608
    .line 609
    invoke-static {v11, v1, v0, v2}, Lpu1;->L(Ln70;Ljava/lang/Class;Lyp3;Ljava/util/concurrent/Executor;)Lwo3;

    .line 610
    .line 611
    .line 612
    move-result-object v21

    .line 613
    move-object/from16 v16, v12

    .line 614
    .line 615
    move-object/from16 v17, v13

    .line 616
    .line 617
    invoke-direct/range {v15 .. v21}, Lbu1;-><init>(Lu93;Ljava/lang/Object;Ljava/lang/String;Ln70;Ljava/util/List;Ln70;)V

    .line 618
    .line 619
    .line 620
    invoke-virtual {v15}, Lbu1;->A()Lq93;

    .line 621
    .line 622
    .line 623
    move-result-object v0

    .line 624
    goto :goto_b

    .line 625
    :cond_d
    move-object/from16 v1, p0

    .line 626
    .line 627
    goto/16 :goto_a

    .line 628
    .line 629
    :cond_e
    :goto_b
    add-int/lit8 v9, v9, 0x1

    .line 630
    .line 631
    move-object/from16 v1, p0

    .line 632
    .line 633
    goto/16 :goto_9

    .line 634
    .line 635
    :cond_f
    new-instance v1, Lbs2;

    .line 636
    .line 637
    const/16 v2, 0xb

    .line 638
    .line 639
    invoke-direct {v1, v2, v6}, Lbs2;-><init>(ILjava/lang/Object;)V

    .line 640
    .line 641
    .line 642
    invoke-virtual {v0, v1, v7}, Lq93;->c(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 643
    .line 644
    .line 645
    :goto_c
    return-object v0

    .line 646
    :catchall_2
    move-exception v0

    .line 647
    :try_start_7
    monitor-exit v6
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 648
    throw v0
.end method
