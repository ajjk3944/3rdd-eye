.class public final Ljv2;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final a:Ljava/util/concurrent/ConcurrentHashMap;

.field public final b:Lid2;

.field public final c:Ll83;

.field public final d:Lvs1;

.field public final e:Landroid/os/Bundle;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lpv2;Lid2;Ll83;Ljava/lang/String;Ljava/lang/String;Lvs1;)V
    .locals 4

    .line 1
    iget-object v0, p4, Ll83;->d:Lpc4;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Landroid/os/Bundle;

    .line 7
    .line 8
    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object v1, p0, Ljv2;->e:Landroid/os/Bundle;

    .line 12
    .line 13
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    new-instance v1, Ljava/util/concurrent/ConcurrentHashMap;

    .line 17
    .line 18
    iget-object p2, p2, Lpv2;->a:Ljava/util/HashMap;

    .line 19
    .line 20
    invoke-direct {v1, p2}, Ljava/util/concurrent/ConcurrentHashMap;-><init>(Ljava/util/Map;)V

    .line 21
    .line 22
    .line 23
    iput-object v1, p0, Ljv2;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 24
    .line 25
    iput-object p3, p0, Ljv2;->b:Lid2;

    .line 26
    .line 27
    iput-object p4, p0, Ljv2;->c:Ll83;

    .line 28
    .line 29
    iput-object p7, p0, Ljv2;->d:Lvs1;

    .line 30
    .line 31
    sget-object p2, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 32
    .line 33
    invoke-virtual {p6, p2}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p2

    .line 37
    const-string p3, "ad_format"

    .line 38
    .line 39
    invoke-virtual {v1, p3, p2}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0}, Ljv2;->c()V

    .line 43
    .line 44
    .line 45
    sget-object p2, Lmz1;->m2:Liz1;

    .line 46
    .line 47
    sget-object p3, Ltw1;->e:Ltw1;

    .line 48
    .line 49
    iget-object p6, p3, Ltw1;->c:Lkz1;

    .line 50
    .line 51
    iget-object p3, p3, Ltw1;->c:Lkz1;

    .line 52
    .line 53
    invoke-virtual {p6, p2}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object p2

    .line 57
    check-cast p2, Ljava/lang/Boolean;

    .line 58
    .line 59
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 60
    .line 61
    .line 62
    move-result p2

    .line 63
    const/4 p6, 0x1

    .line 64
    if-eqz p2, :cond_2

    .line 65
    .line 66
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    .line 67
    .line 68
    .line 69
    move-result-object p2

    .line 70
    invoke-virtual {p2}, Ljava/lang/Runtime;->freeMemory()J

    .line 71
    .line 72
    .line 73
    move-result-wide v2

    .line 74
    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object p7

    .line 78
    const-string v2, "rt_f"

    .line 79
    .line 80
    invoke-virtual {p0, v2, p7}, Ljv2;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {p2}, Ljava/lang/Runtime;->maxMemory()J

    .line 84
    .line 85
    .line 86
    move-result-wide v2

    .line 87
    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object p7

    .line 91
    const-string v2, "rt_m"

    .line 92
    .line 93
    invoke-virtual {p0, v2, p7}, Ljv2;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {p2}, Ljava/lang/Runtime;->totalMemory()J

    .line 97
    .line 98
    .line 99
    move-result-wide v2

    .line 100
    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object p2

    .line 104
    const-string p7, "rt_t"

    .line 105
    .line 106
    invoke-virtual {p0, p7, p2}, Ljv2;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    sget-object p2, Lhg4;->C:Lhg4;

    .line 110
    .line 111
    iget-object p2, p2, Lhg4;->h:Lgd2;

    .line 112
    .line 113
    iget-object p2, p2, Lgd2;->k:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 114
    .line 115
    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 116
    .line 117
    .line 118
    move-result p2

    .line 119
    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object p2

    .line 123
    const-string p7, "wv_c"

    .line 124
    .line 125
    invoke-virtual {p0, p7, p2}, Ljv2;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    sget-object p2, Lmz1;->u2:Liz1;

    .line 129
    .line 130
    invoke-virtual {p3, p2}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object p2

    .line 134
    check-cast p2, Ljava/lang/Boolean;

    .line 135
    .line 136
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 137
    .line 138
    .line 139
    move-result p2

    .line 140
    if-eqz p2, :cond_2

    .line 141
    .line 142
    const-string p2, "activity"

    .line 143
    .line 144
    invoke-virtual {p1, p2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object p1

    .line 148
    check-cast p1, Landroid/app/ActivityManager;

    .line 149
    .line 150
    if-nez p1, :cond_0

    .line 151
    .line 152
    const/4 p1, 0x0

    .line 153
    goto :goto_1

    .line 154
    :cond_0
    new-instance p2, Landroid/app/ActivityManager$MemoryInfo;

    .line 155
    .line 156
    invoke-direct {p2}, Landroid/app/ActivityManager$MemoryInfo;-><init>()V

    .line 157
    .line 158
    .line 159
    :try_start_0
    invoke-virtual {p1, p2}, Landroid/app/ActivityManager;->getMemoryInfo(Landroid/app/ActivityManager$MemoryInfo;)V
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    .line 160
    .line 161
    .line 162
    :goto_0
    move-object p1, p2

    .line 163
    goto :goto_1

    .line 164
    :catch_0
    const-string p1, "Error retrieving the memory information."

    .line 165
    .line 166
    invoke-static {p1}, Lgi2;->i0(Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    goto :goto_0

    .line 170
    :goto_1
    if-eqz p1, :cond_2

    .line 171
    .line 172
    iget-wide v2, p1, Landroid/app/ActivityManager$MemoryInfo;->availMem:J

    .line 173
    .line 174
    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object p2

    .line 178
    const-string p7, "mem_avl"

    .line 179
    .line 180
    invoke-virtual {p0, p7, p2}, Ljv2;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 181
    .line 182
    .line 183
    iget-wide v2, p1, Landroid/app/ActivityManager$MemoryInfo;->totalMem:J

    .line 184
    .line 185
    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object p2

    .line 189
    const-string p7, "mem_tt"

    .line 190
    .line 191
    invoke-virtual {p0, p7, p2}, Ljv2;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 192
    .line 193
    .line 194
    iget-boolean p1, p1, Landroid/app/ActivityManager$MemoryInfo;->lowMemory:Z

    .line 195
    .line 196
    if-eq p6, p1, :cond_1

    .line 197
    .line 198
    const-string p1, "0"

    .line 199
    .line 200
    goto :goto_2

    .line 201
    :cond_1
    const-string p1, "1"

    .line 202
    .line 203
    :goto_2
    const-string p2, "low_m"

    .line 204
    .line 205
    invoke-virtual {p0, p2, p1}, Ljv2;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 206
    .line 207
    .line 208
    :cond_2
    sget-object p1, Lmz1;->w2:Liz1;

    .line 209
    .line 210
    invoke-virtual {p3, p1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object p1

    .line 214
    check-cast p1, Ljava/lang/Boolean;

    .line 215
    .line 216
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 217
    .line 218
    .line 219
    move-result p1

    .line 220
    if-eqz p1, :cond_3

    .line 221
    .line 222
    iget-object p1, p4, Ll83;->g:Ljava/lang/String;

    .line 223
    .line 224
    const-string p2, "ad_unit_id"

    .line 225
    .line 226
    invoke-virtual {p0, p2, p1}, Ljv2;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 227
    .line 228
    .line 229
    :cond_3
    sget-object p1, Lmz1;->n7:Liz1;

    .line 230
    .line 231
    invoke-virtual {p3, p1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 232
    .line 233
    .line 234
    move-result-object p1

    .line 235
    check-cast p1, Ljava/lang/Boolean;

    .line 236
    .line 237
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 238
    .line 239
    .line 240
    move-result p1

    .line 241
    if-nez p1, :cond_4

    .line 242
    .line 243
    return-void

    .line 244
    :cond_4
    invoke-static {p4}, La30;->D(Ll83;)I

    .line 245
    .line 246
    .line 247
    move-result p1

    .line 248
    add-int/lit8 p1, p1, -0x1

    .line 249
    .line 250
    const-string p2, "scar"

    .line 251
    .line 252
    const-string p3, "request_id"

    .line 253
    .line 254
    if-eqz p1, :cond_8

    .line 255
    .line 256
    const-string p4, "se"

    .line 257
    .line 258
    if-eq p1, p6, :cond_7

    .line 259
    .line 260
    const/4 p3, 0x2

    .line 261
    if-eq p1, p3, :cond_6

    .line 262
    .line 263
    const/4 p3, 0x3

    .line 264
    if-eq p1, p3, :cond_5

    .line 265
    .line 266
    const-string p1, "r_both"

    .line 267
    .line 268
    invoke-virtual {v1, p4, p1}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 269
    .line 270
    .line 271
    goto :goto_3

    .line 272
    :cond_5
    const-string p1, "r_adstring"

    .line 273
    .line 274
    invoke-virtual {v1, p4, p1}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 275
    .line 276
    .line 277
    goto :goto_3

    .line 278
    :cond_6
    const-string p1, "r_adinfo"

    .line 279
    .line 280
    invoke-virtual {v1, p4, p1}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 281
    .line 282
    .line 283
    goto :goto_3

    .line 284
    :cond_7
    invoke-virtual {v1, p3, p5}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 285
    .line 286
    .line 287
    const-string p1, "query_g"

    .line 288
    .line 289
    invoke-virtual {v1, p4, p1}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 290
    .line 291
    .line 292
    :goto_3
    const-string p1, "true"

    .line 293
    .line 294
    invoke-virtual {v1, p2, p1}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 295
    .line 296
    .line 297
    iget-object p1, v0, Lpc4;->u:Ljava/lang/String;

    .line 298
    .line 299
    const-string p2, "ragent"

    .line 300
    .line 301
    invoke-virtual {p0, p2, p1}, Ljv2;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 302
    .line 303
    .line 304
    invoke-static {v0}, La30;->w(Lpc4;)Ljava/lang/String;

    .line 305
    .line 306
    .line 307
    move-result-object p1

    .line 308
    invoke-static {p1}, La30;->s(Ljava/lang/String;)Ljava/lang/String;

    .line 309
    .line 310
    .line 311
    move-result-object p1

    .line 312
    const-string p2, "rtype"

    .line 313
    .line 314
    invoke-virtual {p0, p2, p1}, Ljv2;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 315
    .line 316
    .line 317
    return-void

    .line 318
    :cond_8
    invoke-virtual {v1, p3, p5}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 319
    .line 320
    .line 321
    const-string p1, "false"

    .line 322
    .line 323
    invoke-virtual {v1, p2, p1}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 324
    .line 325
    .line 326
    return-void
.end method


# virtual methods
.method public final a(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    const-string v0, "cnt"

    .line 5
    .line 6
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-eqz v1, :cond_1

    .line 11
    .line 12
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    const-string v1, "network_coarse"

    .line 21
    .line 22
    invoke-virtual {p0, v1, v0}, Ljv2;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    :cond_1
    const-string v0, "gnt"

    .line 26
    .line 27
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    const-string v0, "network_fine"

    .line 42
    .line 43
    invoke-virtual {p0, v0, p1}, Ljv2;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    :cond_2
    :goto_0
    return-void
.end method

.method public final b(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Ljv2;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 14
    .line 15
    invoke-virtual {v0, p1, p2}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public final c()V
    .locals 4

    .line 1
    sget-object v0, Lmz1;->pa:Liz1;

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
    if-nez v0, :cond_0

    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    iget-object v0, p0, Ljv2;->d:Lvs1;

    .line 21
    .line 22
    iget-object v0, v0, Lvs1;->b:Lrs1;

    .line 23
    .line 24
    instance-of v1, v0, Lgb4;

    .line 25
    .line 26
    const-string v2, "asv"

    .line 27
    .line 28
    iget-object v3, p0, Ljv2;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 29
    .line 30
    if-eqz v1, :cond_3

    .line 31
    .line 32
    check-cast v0, Lgb4;

    .line 33
    .line 34
    iget v0, v0, Lgb4;->t:I

    .line 35
    .line 36
    add-int/lit8 v1, v0, -0x1

    .line 37
    .line 38
    if-eqz v0, :cond_2

    .line 39
    .line 40
    if-eqz v1, :cond_1

    .line 41
    .line 42
    const-string v0, "2"

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    const-string v0, "1"

    .line 46
    .line 47
    :goto_0
    invoke-virtual {v3, v2, v0}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :cond_2
    const/4 v0, 0x0

    .line 52
    throw v0

    .line 53
    :cond_3
    instance-of v1, v0, Ldh2;

    .line 54
    .line 55
    if-eqz v1, :cond_8

    .line 56
    .line 57
    check-cast v0, Ldh2;

    .line 58
    .line 59
    iget-object v0, v0, Ldh2;->g:Lz71;

    .line 60
    .line 61
    iget-object v0, v0, Lz71;->g:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v0, Ltf3;

    .line 64
    .line 65
    iget-object v0, v0, Ltf3;->b:Loh3;

    .line 66
    .line 67
    iget-object v0, v0, Loh3;->f:Ljava/util/concurrent/atomic/AtomicReference;

    .line 68
    .line 69
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    check-cast v0, Lkh3;

    .line 74
    .line 75
    const/4 v1, 0x1

    .line 76
    if-nez v0, :cond_4

    .line 77
    .line 78
    move v0, v1

    .line 79
    goto :goto_1

    .line 80
    :cond_4
    invoke-interface {v0}, Lkh3;->e()I

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    :goto_1
    add-int/lit8 v0, v0, -0x1

    .line 85
    .line 86
    if-eq v0, v1, :cond_7

    .line 87
    .line 88
    const/4 v1, 0x2

    .line 89
    if-eq v0, v1, :cond_6

    .line 90
    .line 91
    const/4 v1, 0x3

    .line 92
    if-eq v0, v1, :cond_5

    .line 93
    .line 94
    const-string v0, "uns"

    .line 95
    .line 96
    goto :goto_2

    .line 97
    :cond_5
    const-string v0, "3.0"

    .line 98
    .line 99
    goto :goto_2

    .line 100
    :cond_6
    const-string v0, "2.0"

    .line 101
    .line 102
    goto :goto_2

    .line 103
    :cond_7
    const-string v0, "1.0"

    .line 104
    .line 105
    :goto_2
    invoke-virtual {v3, v2, v0}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    return-void

    .line 109
    :cond_8
    const-string v0, "NA"

    .line 110
    .line 111
    invoke-virtual {v3, v2, v0}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    return-void
.end method
