.class public final Lft1;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lge3;


# instance fields
.field public final a:Lid3;

.field public final b:Lp21;

.field public final c:Lnt1;

.field public final d:Let1;

.field public final e:Lzs1;

.field public final f:Lpt1;

.field public final g:Lxe1;

.field public final h:Ldm1;


# direct methods
.method public constructor <init>(Lid3;Lp21;Lnt1;Let1;Lzs1;Lpt1;Lxe1;Ldm1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lft1;->a:Lid3;

    .line 5
    .line 6
    iput-object p2, p0, Lft1;->b:Lp21;

    .line 7
    .line 8
    iput-object p3, p0, Lft1;->c:Lnt1;

    .line 9
    .line 10
    iput-object p4, p0, Lft1;->d:Let1;

    .line 11
    .line 12
    iput-object p5, p0, Lft1;->e:Lzs1;

    .line 13
    .line 14
    iput-object p6, p0, Lft1;->f:Lpt1;

    .line 15
    .line 16
    iput-object p7, p0, Lft1;->g:Lxe1;

    .line 17
    .line 18
    iput-object p8, p0, Lft1;->h:Ldm1;

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final a()Ljava/util/HashMap;
    .locals 8

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lft1;->a:Lid3;

    .line 7
    .line 8
    iget-object v2, p0, Lft1;->b:Lp21;

    .line 9
    .line 10
    iget-object v2, v2, Lp21;->i:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v2, Lgi4;

    .line 13
    .line 14
    sget-object v3, Lnd3;->a:Lqr1;

    .line 15
    .line 16
    invoke-virtual {v2}, Lgi4;->c()Z

    .line 17
    .line 18
    .line 19
    move-result v4

    .line 20
    if-nez v4, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    invoke-virtual {v2}, Lgi4;->b()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    move-object v3, v2

    .line 28
    check-cast v3, Lqr1;

    .line 29
    .line 30
    :goto_0
    const-string v2, "v"

    .line 31
    .line 32
    iget-object v4, v1, Lid3;->a:Ljava/lang/String;

    .line 33
    .line 34
    invoke-virtual {v0, v2, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    iget-boolean v1, v1, Lid3;->c:Z

    .line 38
    .line 39
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    const-string v2, "gms"

    .line 44
    .line 45
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v3}, Lqr1;->x0()J

    .line 49
    .line 50
    .line 51
    move-result-wide v1

    .line 52
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    const-string v2, "gv"

    .line 57
    .line 58
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v3}, Lqr1;->v0()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    const-string v2, "int"

    .line 66
    .line 67
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v3}, Lqr1;->A0()Lzr1;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    invoke-virtual {v1}, Lzr1;->B()J

    .line 75
    .line 76
    .line 77
    move-result-wide v1

    .line 78
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    const-string v2, "attts"

    .line 83
    .line 84
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v3}, Lqr1;->A0()Lzr1;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    invoke-virtual {v1}, Lzr1;->D()La54;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    const-string v2, "att"

    .line 96
    .line 97
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    invoke-virtual {v3}, Lqr1;->A0()Lzr1;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    invoke-virtual {v1}, Lzr1;->C()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    const-string v2, "attkid"

    .line 109
    .line 110
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    iget-object v1, p0, Lft1;->d:Let1;

    .line 114
    .line 115
    iget-boolean v1, v1, Let1;->a:Z

    .line 116
    .line 117
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    const-string v2, "up"

    .line 122
    .line 123
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    new-instance v1, Ljava/lang/Throwable;

    .line 127
    .line 128
    invoke-direct {v1}, Ljava/lang/Throwable;-><init>()V

    .line 129
    .line 130
    .line 131
    const-string v2, "t"

    .line 132
    .line 133
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    iget-object v1, p0, Lft1;->g:Lxe1;

    .line 137
    .line 138
    if-eqz v1, :cond_6

    .line 139
    .line 140
    iget-wide v2, v1, Lxe1;->a:J

    .line 141
    .line 142
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 143
    .line 144
    .line 145
    move-result-object v2

    .line 146
    const-string v3, "tcq"

    .line 147
    .line 148
    invoke-virtual {v0, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    iget-wide v2, v1, Lxe1;->b:J

    .line 152
    .line 153
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 154
    .line 155
    .line 156
    move-result-object v2

    .line 157
    const-string v3, "tpq"

    .line 158
    .line 159
    invoke-virtual {v0, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    iget-wide v2, v1, Lxe1;->c:J

    .line 163
    .line 164
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 165
    .line 166
    .line 167
    move-result-object v2

    .line 168
    const-string v3, "tcv"

    .line 169
    .line 170
    invoke-virtual {v0, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    iget-wide v2, v1, Lxe1;->d:J

    .line 174
    .line 175
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 176
    .line 177
    .line 178
    move-result-object v2

    .line 179
    const-string v3, "tpv"

    .line 180
    .line 181
    invoke-virtual {v0, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    iget-wide v2, v1, Lxe1;->e:J

    .line 185
    .line 186
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 187
    .line 188
    .line 189
    move-result-object v2

    .line 190
    const-string v3, "tchv"

    .line 191
    .line 192
    invoke-virtual {v0, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    iget-wide v2, v1, Lxe1;->f:J

    .line 196
    .line 197
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 198
    .line 199
    .line 200
    move-result-object v2

    .line 201
    const-string v3, "tphv"

    .line 202
    .line 203
    invoke-virtual {v0, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    iget-wide v2, v1, Lxe1;->g:J

    .line 207
    .line 208
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 209
    .line 210
    .line 211
    move-result-object v2

    .line 212
    const-string v3, "tcc"

    .line 213
    .line 214
    invoke-virtual {v0, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    iget-wide v1, v1, Lxe1;->h:J

    .line 218
    .line 219
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 220
    .line 221
    .line 222
    move-result-object v1

    .line 223
    const-string v2, "tpc"

    .line 224
    .line 225
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    iget-object v1, p0, Lft1;->e:Lzs1;

    .line 229
    .line 230
    const-wide/16 v2, -0x1

    .line 231
    .line 232
    if-eqz v1, :cond_4

    .line 233
    .line 234
    const-class v4, Lzs1;

    .line 235
    .line 236
    monitor-enter v4

    .line 237
    :try_start_0
    iget-object v5, v1, Lzs1;->g:Ljava/lang/Object;

    .line 238
    .line 239
    check-cast v5, Landroid/net/NetworkCapabilities;

    .line 240
    .line 241
    if-eqz v5, :cond_3

    .line 242
    .line 243
    const/4 v6, 0x4

    .line 244
    invoke-virtual {v5, v6}, Landroid/net/NetworkCapabilities;->hasTransport(I)Z

    .line 245
    .line 246
    .line 247
    move-result v5

    .line 248
    if-eqz v5, :cond_1

    .line 249
    .line 250
    monitor-exit v4

    .line 251
    const-wide/16 v4, 0x2

    .line 252
    .line 253
    goto :goto_1

    .line 254
    :catchall_0
    move-exception v0

    .line 255
    goto :goto_2

    .line 256
    :cond_1
    iget-object v5, v1, Lzs1;->g:Ljava/lang/Object;

    .line 257
    .line 258
    check-cast v5, Landroid/net/NetworkCapabilities;

    .line 259
    .line 260
    const/4 v6, 0x1

    .line 261
    invoke-virtual {v5, v6}, Landroid/net/NetworkCapabilities;->hasTransport(I)Z

    .line 262
    .line 263
    .line 264
    move-result v5

    .line 265
    if-eqz v5, :cond_2

    .line 266
    .line 267
    monitor-exit v4

    .line 268
    const-wide/16 v4, 0x1

    .line 269
    .line 270
    goto :goto_1

    .line 271
    :cond_2
    iget-object v1, v1, Lzs1;->g:Ljava/lang/Object;

    .line 272
    .line 273
    check-cast v1, Landroid/net/NetworkCapabilities;

    .line 274
    .line 275
    const/4 v5, 0x0

    .line 276
    invoke-virtual {v1, v5}, Landroid/net/NetworkCapabilities;->hasTransport(I)Z

    .line 277
    .line 278
    .line 279
    move-result v1

    .line 280
    if-eqz v1, :cond_3

    .line 281
    .line 282
    monitor-exit v4

    .line 283
    const-wide/16 v4, 0x0

    .line 284
    .line 285
    goto :goto_1

    .line 286
    :cond_3
    monitor-exit v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 287
    move-wide v4, v2

    .line 288
    :goto_1
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 289
    .line 290
    .line 291
    move-result-object v1

    .line 292
    const-string v4, "nt"

    .line 293
    .line 294
    invoke-virtual {v0, v4, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 295
    .line 296
    .line 297
    goto :goto_3

    .line 298
    :goto_2
    :try_start_1
    monitor-exit v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 299
    throw v0

    .line 300
    :cond_4
    :goto_3
    iget-object v1, p0, Lft1;->f:Lpt1;

    .line 301
    .line 302
    if-eqz v1, :cond_6

    .line 303
    .line 304
    iget-boolean v4, v1, Lpt1;->d:Z

    .line 305
    .line 306
    if-eqz v4, :cond_5

    .line 307
    .line 308
    iget-wide v4, v1, Lpt1;->b:J

    .line 309
    .line 310
    iget-wide v6, v1, Lpt1;->a:J

    .line 311
    .line 312
    sub-long/2addr v4, v6

    .line 313
    goto :goto_4

    .line 314
    :cond_5
    move-wide v4, v2

    .line 315
    :goto_4
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 316
    .line 317
    .line 318
    move-result-object v4

    .line 319
    const-string v5, "vs"

    .line 320
    .line 321
    invoke-virtual {v0, v5, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 322
    .line 323
    .line 324
    iget-wide v4, v1, Lpt1;->c:J

    .line 325
    .line 326
    iput-wide v2, v1, Lpt1;->c:J

    .line 327
    .line 328
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 329
    .line 330
    .line 331
    move-result-object v1

    .line 332
    const-string v2, "vf"

    .line 333
    .line 334
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 335
    .line 336
    .line 337
    :cond_6
    return-object v0
.end method

.method public final b()Ljava/util/HashMap;
    .locals 3

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Ljava/lang/Throwable;

    .line 7
    .line 8
    invoke-direct {v1}, Ljava/lang/Throwable;-><init>()V

    .line 9
    .line 10
    .line 11
    const-string v2, "t"

    .line 12
    .line 13
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    return-object v0
.end method

.method public final d()Ljava/util/HashMap;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lft1;->a()Ljava/util/HashMap;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final h()Ljava/util/HashMap;
    .locals 4

    .line 1
    invoke-virtual {p0}, Lft1;->a()Ljava/util/HashMap;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lft1;->h:Ldm1;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    iget-object v2, v1, Ldm1;->a:Ljava/util/List;

    .line 10
    .line 11
    sget-object v3, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 12
    .line 13
    iput-object v3, v1, Ldm1;->a:Ljava/util/List;

    .line 14
    .line 15
    const-string v1, "vst"

    .line 16
    .line 17
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    :cond_0
    return-object v0
.end method

.method public final l()Ljava/util/HashMap;
    .locals 6

    .line 1
    invoke-virtual {p0}, Lft1;->a()Ljava/util/HashMap;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lft1;->c:Lnt1;

    .line 6
    .line 7
    iget-wide v2, v1, Lnt1;->q:J

    .line 8
    .line 9
    const-wide/16 v4, -0x2

    .line 10
    .line 11
    cmp-long v2, v2, v4

    .line 12
    .line 13
    if-gtz v2, :cond_1

    .line 14
    .line 15
    iget-object v2, v1, Lnt1;->m:Ljava/lang/ref/WeakReference;

    .line 16
    .line 17
    if-eqz v2, :cond_0

    .line 18
    .line 19
    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    check-cast v2, Landroid/view/View;

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 v2, 0x0

    .line 27
    :goto_0
    if-nez v2, :cond_1

    .line 28
    .line 29
    const-wide/16 v2, -0x3

    .line 30
    .line 31
    iput-wide v2, v1, Lnt1;->q:J

    .line 32
    .line 33
    :cond_1
    iget-wide v1, v1, Lnt1;->q:J

    .line 34
    .line 35
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    const-string v2, "lts"

    .line 40
    .line 41
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    return-object v0
.end method
