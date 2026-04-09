.class public final Lxv2;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final a:Ljava/util/concurrent/ConcurrentHashMap;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lxv2;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final declared-synchronized a(IJJ)V
    .locals 7

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    sget-object v0, Lmz1;->l8:Liz1;

    .line 3
    .line 4
    sget-object v1, Ltw1;->e:Ltw1;

    .line 5
    .line 6
    iget-object v2, v1, Ltw1;->c:Lkz1;

    .line 7
    .line 8
    invoke-virtual {v2, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Ljava/lang/Boolean;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    goto/16 :goto_5

    .line 21
    .line 22
    :cond_0
    const/4 v0, 0x1

    .line 23
    int-to-byte v2, v0

    .line 24
    const/4 v3, 0x2

    .line 25
    or-int/2addr v2, v3

    .line 26
    int-to-byte v2, v2

    .line 27
    const/4 v4, 0x3

    .line 28
    if-eq v2, v4, :cond_3

    .line 29
    .line 30
    new-instance p1, Ljava/lang/StringBuilder;

    .line 31
    .line 32
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 33
    .line 34
    .line 35
    and-int/lit8 p2, v2, 0x1

    .line 36
    .line 37
    if-nez p2, :cond_1

    .line 38
    .line 39
    const-string p2, " id"

    .line 40
    .line 41
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    :cond_1
    and-int/lit8 p2, v2, 0x2

    .line 45
    .line 46
    if-nez p2, :cond_2

    .line 47
    .line 48
    const-string p2, " eventType"

    .line 49
    .line 50
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    :cond_2
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 54
    .line 55
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    const-string p3, "Missing required properties:"

    .line 60
    .line 61
    invoke-virtual {p3, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    throw p2

    .line 69
    :cond_3
    new-instance v2, Lwv2;

    .line 70
    .line 71
    invoke-direct {v2, p1, p2, p3}, Lwv2;-><init>(IJ)V

    .line 72
    .line 73
    .line 74
    const/4 p2, 0x0

    .line 75
    if-eqz p1, :cond_4

    .line 76
    .line 77
    if-eq p1, v0, :cond_7

    .line 78
    .line 79
    if-eq p1, v3, :cond_6

    .line 80
    .line 81
    if-eq p1, v4, :cond_5

    .line 82
    .line 83
    :cond_4
    move p1, p2

    .line 84
    goto :goto_0

    .line 85
    :cond_5
    sget-object p1, Lmz1;->t8:Liz1;

    .line 86
    .line 87
    iget-object p3, v1, Ltw1;->c:Lkz1;

    .line 88
    .line 89
    invoke-virtual {p3, p1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    check-cast p1, Ljava/lang/Integer;

    .line 94
    .line 95
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 96
    .line 97
    .line 98
    move-result p1

    .line 99
    goto :goto_0

    .line 100
    :catchall_0
    move-exception p1

    .line 101
    goto/16 :goto_6

    .line 102
    .line 103
    :cond_6
    sget-object p1, Lmz1;->s8:Liz1;

    .line 104
    .line 105
    iget-object p3, v1, Ltw1;->c:Lkz1;

    .line 106
    .line 107
    invoke-virtual {p3, p1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    check-cast p1, Ljava/lang/Integer;

    .line 112
    .line 113
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 114
    .line 115
    .line 116
    move-result p1

    .line 117
    goto :goto_0

    .line 118
    :cond_7
    sget-object p1, Lmz1;->r8:Liz1;

    .line 119
    .line 120
    iget-object p3, v1, Ltw1;->c:Lkz1;

    .line 121
    .line 122
    invoke-virtual {p3, p1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    check-cast p1, Ljava/lang/Integer;

    .line 127
    .line 128
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 129
    .line 130
    .line 131
    move-result p1

    .line 132
    :goto_0
    if-lez p1, :cond_f

    .line 133
    .line 134
    iget-object p3, p0, Lxv2;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 135
    .line 136
    invoke-virtual {p3, v2}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    check-cast v0, Ljava/util/ArrayDeque;

    .line 141
    .line 142
    if-nez v0, :cond_8

    .line 143
    .line 144
    new-instance v0, Ljava/util/ArrayDeque;

    .line 145
    .line 146
    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    .line 147
    .line 148
    .line 149
    invoke-virtual {p3, v2, v0}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    :cond_8
    invoke-static {p4, p5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 153
    .line 154
    .line 155
    move-result-object p4

    .line 156
    invoke-virtual {v0, p4}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    .line 157
    .line 158
    .line 159
    :goto_1
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->size()I

    .line 160
    .line 161
    .line 162
    move-result p4

    .line 163
    if-le p4, p1, :cond_9

    .line 164
    .line 165
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->removeFirst()Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    goto :goto_1

    .line 169
    :cond_9
    invoke-virtual {p0}, Lxv2;->b()V

    .line 170
    .line 171
    .line 172
    sget-object p1, Lmz1;->u8:Liz1;

    .line 173
    .line 174
    sget-object p4, Ltw1;->e:Ltw1;

    .line 175
    .line 176
    iget-object p4, p4, Ltw1;->c:Lkz1;

    .line 177
    .line 178
    invoke-virtual {p4, p1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object p1

    .line 182
    check-cast p1, Ljava/lang/Integer;

    .line 183
    .line 184
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 185
    .line 186
    .line 187
    move-result p1

    .line 188
    if-lez p1, :cond_e

    .line 189
    .line 190
    :cond_a
    :goto_2
    invoke-virtual {p3}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    .line 191
    .line 192
    .line 193
    move-result-object p4

    .line 194
    invoke-interface {p4}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 195
    .line 196
    .line 197
    move-result-object p4

    .line 198
    move p5, p2

    .line 199
    :goto_3
    invoke-interface {p4}, Ljava/util/Iterator;->hasNext()Z

    .line 200
    .line 201
    .line 202
    move-result v0

    .line 203
    if-eqz v0, :cond_b

    .line 204
    .line 205
    invoke-interface {p4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object v0

    .line 209
    check-cast v0, Ljava/util/ArrayDeque;

    .line 210
    .line 211
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->size()I

    .line 212
    .line 213
    .line 214
    move-result v0

    .line 215
    add-int/2addr p5, v0

    .line 216
    goto :goto_3

    .line 217
    :cond_b
    if-le p5, p1, :cond_f

    .line 218
    .line 219
    invoke-virtual {p3}, Ljava/util/concurrent/ConcurrentHashMap;->isEmpty()Z

    .line 220
    .line 221
    .line 222
    move-result p4

    .line 223
    if-nez p4, :cond_a

    .line 224
    .line 225
    const-wide p4, 0x7fffffffffffffffL

    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    invoke-static {p4, p5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 231
    .line 232
    .line 233
    move-result-object p4

    .line 234
    invoke-virtual {p3}, Ljava/util/concurrent/ConcurrentHashMap;->entrySet()Ljava/util/Set;

    .line 235
    .line 236
    .line 237
    move-result-object p5

    .line 238
    invoke-interface {p5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 239
    .line 240
    .line 241
    move-result-object p5

    .line 242
    const/4 v0, 0x0

    .line 243
    :cond_c
    :goto_4
    invoke-interface {p5}, Ljava/util/Iterator;->hasNext()Z

    .line 244
    .line 245
    .line 246
    move-result v1

    .line 247
    if-eqz v1, :cond_d

    .line 248
    .line 249
    invoke-interface {p5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 250
    .line 251
    .line 252
    move-result-object v1

    .line 253
    check-cast v1, Ljava/util/Map$Entry;

    .line 254
    .line 255
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 256
    .line 257
    .line 258
    move-result-object v2

    .line 259
    check-cast v2, Ljava/util/ArrayDeque;

    .line 260
    .line 261
    invoke-virtual {v2}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 262
    .line 263
    .line 264
    move-result v3

    .line 265
    if-nez v3, :cond_c

    .line 266
    .line 267
    invoke-virtual {v2}, Ljava/util/ArrayDeque;->peekFirst()Ljava/lang/Object;

    .line 268
    .line 269
    .line 270
    move-result-object v2

    .line 271
    check-cast v2, Ljava/lang/Long;

    .line 272
    .line 273
    if-eqz v2, :cond_c

    .line 274
    .line 275
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 276
    .line 277
    .line 278
    move-result-wide v3

    .line 279
    invoke-virtual {p4}, Ljava/lang/Long;->longValue()J

    .line 280
    .line 281
    .line 282
    move-result-wide v5

    .line 283
    cmp-long v3, v3, v5

    .line 284
    .line 285
    if-gez v3, :cond_c

    .line 286
    .line 287
    move-object v0, v1

    .line 288
    move-object p4, v2

    .line 289
    goto :goto_4

    .line 290
    :cond_d
    if-eqz v0, :cond_a

    .line 291
    .line 292
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 293
    .line 294
    .line 295
    move-result-object p4

    .line 296
    check-cast p4, Ljava/util/ArrayDeque;

    .line 297
    .line 298
    if-eqz p4, :cond_a

    .line 299
    .line 300
    invoke-virtual {p4}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 301
    .line 302
    .line 303
    move-result p5

    .line 304
    if-nez p5, :cond_a

    .line 305
    .line 306
    invoke-virtual {p4}, Ljava/util/ArrayDeque;->removeFirst()Ljava/lang/Object;

    .line 307
    .line 308
    .line 309
    invoke-virtual {p4}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 310
    .line 311
    .line 312
    move-result p4

    .line 313
    if-eqz p4, :cond_a

    .line 314
    .line 315
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 316
    .line 317
    .line 318
    move-result-object p4

    .line 319
    invoke-virtual {p3, p4}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 320
    .line 321
    .line 322
    goto/16 :goto_2

    .line 323
    .line 324
    :cond_e
    invoke-virtual {p3}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 325
    .line 326
    .line 327
    monitor-exit p0

    .line 328
    return-void

    .line 329
    :cond_f
    :goto_5
    monitor-exit p0

    .line 330
    return-void

    .line 331
    :goto_6
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 332
    throw p1
.end method

.method public final b()V
    .locals 9

    .line 1
    sget-object v0, Lhg4;->C:Lhg4;

    .line 2
    .line 3
    iget-object v0, v0, Lhg4;->k:Lym;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 9
    .line 10
    .line 11
    move-result-wide v0

    .line 12
    iget-object v2, p0, Lxv2;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 13
    .line 14
    invoke-virtual {v2}, Ljava/util/concurrent/ConcurrentHashMap;->entrySet()Ljava/util/Set;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    if-eqz v3, :cond_7

    .line 27
    .line 28
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    check-cast v3, Ljava/util/Map$Entry;

    .line 33
    .line 34
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    check-cast v4, Lwv2;

    .line 39
    .line 40
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    check-cast v3, Ljava/util/ArrayDeque;

    .line 45
    .line 46
    iget v4, v4, Lwv2;->b:I

    .line 47
    .line 48
    const-wide/16 v5, 0x0

    .line 49
    .line 50
    if-eqz v4, :cond_1

    .line 51
    .line 52
    const/4 v7, 0x1

    .line 53
    if-eq v4, v7, :cond_4

    .line 54
    .line 55
    const/4 v7, 0x2

    .line 56
    if-eq v4, v7, :cond_3

    .line 57
    .line 58
    const/4 v7, 0x3

    .line 59
    if-eq v4, v7, :cond_2

    .line 60
    .line 61
    :cond_1
    move-wide v7, v5

    .line 62
    goto :goto_1

    .line 63
    :cond_2
    sget-object v4, Lmz1;->q8:Liz1;

    .line 64
    .line 65
    sget-object v7, Ltw1;->e:Ltw1;

    .line 66
    .line 67
    iget-object v7, v7, Ltw1;->c:Lkz1;

    .line 68
    .line 69
    invoke-virtual {v7, v4}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v4

    .line 73
    check-cast v4, Ljava/lang/Long;

    .line 74
    .line 75
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 76
    .line 77
    .line 78
    move-result-wide v7

    .line 79
    goto :goto_1

    .line 80
    :cond_3
    sget-object v4, Lmz1;->p8:Liz1;

    .line 81
    .line 82
    sget-object v7, Ltw1;->e:Ltw1;

    .line 83
    .line 84
    iget-object v7, v7, Ltw1;->c:Lkz1;

    .line 85
    .line 86
    invoke-virtual {v7, v4}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v4

    .line 90
    check-cast v4, Ljava/lang/Long;

    .line 91
    .line 92
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 93
    .line 94
    .line 95
    move-result-wide v7

    .line 96
    goto :goto_1

    .line 97
    :cond_4
    sget-object v4, Lmz1;->o8:Liz1;

    .line 98
    .line 99
    sget-object v7, Ltw1;->e:Ltw1;

    .line 100
    .line 101
    iget-object v7, v7, Ltw1;->c:Lkz1;

    .line 102
    .line 103
    invoke-virtual {v7, v4}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v4

    .line 107
    check-cast v4, Ljava/lang/Long;

    .line 108
    .line 109
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 110
    .line 111
    .line 112
    move-result-wide v7

    .line 113
    :goto_1
    cmp-long v4, v7, v5

    .line 114
    .line 115
    if-nez v4, :cond_5

    .line 116
    .line 117
    invoke-interface {v2}, Ljava/util/Iterator;->remove()V

    .line 118
    .line 119
    .line 120
    move-wide v7, v5

    .line 121
    :cond_5
    cmp-long v4, v7, v5

    .line 122
    .line 123
    if-lez v4, :cond_0

    .line 124
    .line 125
    invoke-virtual {v3}, Ljava/util/ArrayDeque;->iterator()Ljava/util/Iterator;

    .line 126
    .line 127
    .line 128
    move-result-object v4

    .line 129
    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 130
    .line 131
    .line 132
    move-result v5

    .line 133
    if-eqz v5, :cond_6

    .line 134
    .line 135
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v5

    .line 139
    check-cast v5, Ljava/lang/Long;

    .line 140
    .line 141
    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    .line 142
    .line 143
    .line 144
    move-result-wide v5

    .line 145
    sub-long v5, v0, v5

    .line 146
    .line 147
    cmp-long v5, v5, v7

    .line 148
    .line 149
    if-lez v5, :cond_6

    .line 150
    .line 151
    invoke-interface {v4}, Ljava/util/Iterator;->remove()V

    .line 152
    .line 153
    .line 154
    goto :goto_2

    .line 155
    :cond_6
    invoke-virtual {v3}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 156
    .line 157
    .line 158
    move-result v3

    .line 159
    if-eqz v3, :cond_0

    .line 160
    .line 161
    invoke-interface {v2}, Ljava/util/Iterator;->remove()V

    .line 162
    .line 163
    .line 164
    goto/16 :goto_0

    .line 165
    .line 166
    :cond_7
    return-void
.end method
