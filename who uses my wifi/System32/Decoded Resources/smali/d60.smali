.class public final Ld60;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final a:Z

.field public b:Lgu;

.field public c:Lu50;

.field public final d:Ljava/lang/ref/WeakReference;

.field public e:I

.field public f:Z

.field public g:Z

.field public final h:Ljava/util/ArrayList;

.field public final i:Lay0;


# direct methods
.method public constructor <init>(Lb60;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    new-instance v1, Ljava/util/concurrent/atomic/AtomicReference;

    .line 6
    .line 7
    invoke-direct {v1, v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    iput-boolean v0, p0, Ld60;->a:Z

    .line 12
    .line 13
    new-instance v0, Lgu;

    .line 14
    .line 15
    invoke-direct {v0}, Lgu;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Ld60;->b:Lgu;

    .line 19
    .line 20
    sget-object v0, Lu50;->g:Lu50;

    .line 21
    .line 22
    iput-object v0, p0, Ld60;->c:Lu50;

    .line 23
    .line 24
    new-instance v1, Ljava/util/ArrayList;

    .line 25
    .line 26
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 27
    .line 28
    .line 29
    iput-object v1, p0, Ld60;->h:Ljava/util/ArrayList;

    .line 30
    .line 31
    new-instance v1, Ljava/lang/ref/WeakReference;

    .line 32
    .line 33
    invoke-direct {v1, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    iput-object v1, p0, Ld60;->d:Ljava/lang/ref/WeakReference;

    .line 37
    .line 38
    new-instance p1, Lay0;

    .line 39
    .line 40
    invoke-direct {p1, v0}, Lay0;-><init>(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    iput-object p1, p0, Ld60;->i:Lay0;

    .line 44
    .line 45
    return-void
.end method


# virtual methods
.method public final a(La60;)V
    .locals 9

    .line 1
    const-string v0, "addObserver"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Ld60;->c(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ld60;->c:Lu50;

    .line 7
    .line 8
    sget-object v1, Lu50;->f:Lu50;

    .line 9
    .line 10
    if-ne v0, v1, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    sget-object v1, Lu50;->g:Lu50;

    .line 14
    .line 15
    :goto_0
    new-instance v0, Lc60;

    .line 16
    .line 17
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 18
    .line 19
    .line 20
    sget-object v2, Lf60;->a:Ljava/util/HashMap;

    .line 21
    .line 22
    instance-of v2, p1, Ly50;

    .line 23
    .line 24
    instance-of v3, p1, Lsr;

    .line 25
    .line 26
    const/4 v4, 0x2

    .line 27
    const/4 v5, 0x0

    .line 28
    const/4 v6, 0x0

    .line 29
    const/4 v7, 0x1

    .line 30
    if-eqz v2, :cond_1

    .line 31
    .line 32
    if-eqz v3, :cond_1

    .line 33
    .line 34
    new-instance v2, Lnn;

    .line 35
    .line 36
    move-object v3, p1

    .line 37
    check-cast v3, Lsr;

    .line 38
    .line 39
    move-object v8, p1

    .line 40
    check-cast v8, Ly50;

    .line 41
    .line 42
    invoke-direct {v2, v3, v8, v6}, Lnn;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 43
    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_1
    if-eqz v3, :cond_2

    .line 47
    .line 48
    new-instance v2, Lnn;

    .line 49
    .line 50
    move-object v3, p1

    .line 51
    check-cast v3, Lsr;

    .line 52
    .line 53
    invoke-direct {v2, v3, v5, v6}, Lnn;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 54
    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_2
    if-eqz v2, :cond_3

    .line 58
    .line 59
    move-object v2, p1

    .line 60
    check-cast v2, Ly50;

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    invoke-static {v2}, Lf60;->b(Ljava/lang/Class;)I

    .line 68
    .line 69
    .line 70
    move-result v3

    .line 71
    if-ne v3, v4, :cond_6

    .line 72
    .line 73
    sget-object v3, Lf60;->b:Ljava/util/HashMap;

    .line 74
    .line 75
    invoke-virtual {v3, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    invoke-static {v2}, Li30;->j(Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    check-cast v2, Ljava/util/List;

    .line 83
    .line 84
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 85
    .line 86
    .line 87
    move-result v3

    .line 88
    if-eq v3, v7, :cond_5

    .line 89
    .line 90
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 91
    .line 92
    .line 93
    move-result v3

    .line 94
    new-array v8, v3, [Lvy;

    .line 95
    .line 96
    if-gtz v3, :cond_4

    .line 97
    .line 98
    new-instance v2, Lun0;

    .line 99
    .line 100
    invoke-direct {v2, v4, v8}, Lun0;-><init>(ILjava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    goto :goto_1

    .line 104
    :cond_4
    invoke-interface {v2, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    check-cast v0, Ljava/lang/reflect/Constructor;

    .line 109
    .line 110
    invoke-static {v0, p1}, Lf60;->a(Ljava/lang/reflect/Constructor;La60;)V

    .line 111
    .line 112
    .line 113
    throw v5

    .line 114
    :cond_5
    invoke-interface {v2, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    check-cast v0, Ljava/lang/reflect/Constructor;

    .line 119
    .line 120
    invoke-static {v0, p1}, Lf60;->a(Ljava/lang/reflect/Constructor;La60;)V

    .line 121
    .line 122
    .line 123
    throw v5

    .line 124
    :cond_6
    new-instance v2, Lnn;

    .line 125
    .line 126
    invoke-direct {v2, p1}, Lnn;-><init>(La60;)V

    .line 127
    .line 128
    .line 129
    :goto_1
    iput-object v2, v0, Lc60;->b:Ly50;

    .line 130
    .line 131
    iput-object v1, v0, Lc60;->a:Lu50;

    .line 132
    .line 133
    iget-object v1, p0, Ld60;->b:Lgu;

    .line 134
    .line 135
    invoke-virtual {v1, p1}, Lgu;->a(Ljava/lang/Object;)Lls0;

    .line 136
    .line 137
    .line 138
    move-result-object v2

    .line 139
    if-eqz v2, :cond_7

    .line 140
    .line 141
    iget-object v1, v2, Lls0;->g:Ljava/lang/Object;

    .line 142
    .line 143
    goto :goto_3

    .line 144
    :cond_7
    iget-object v2, v1, Lgu;->j:Ljava/util/HashMap;

    .line 145
    .line 146
    new-instance v3, Lls0;

    .line 147
    .line 148
    invoke-direct {v3, p1, v0}, Lls0;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 149
    .line 150
    .line 151
    iget v8, v1, Los0;->i:I

    .line 152
    .line 153
    add-int/2addr v8, v7

    .line 154
    iput v8, v1, Los0;->i:I

    .line 155
    .line 156
    iget-object v8, v1, Los0;->g:Lls0;

    .line 157
    .line 158
    if-nez v8, :cond_8

    .line 159
    .line 160
    iput-object v3, v1, Los0;->f:Lls0;

    .line 161
    .line 162
    iput-object v3, v1, Los0;->g:Lls0;

    .line 163
    .line 164
    goto :goto_2

    .line 165
    :cond_8
    iput-object v3, v8, Lls0;->h:Lls0;

    .line 166
    .line 167
    iput-object v8, v3, Lls0;->i:Lls0;

    .line 168
    .line 169
    iput-object v3, v1, Los0;->g:Lls0;

    .line 170
    .line 171
    :goto_2
    invoke-virtual {v2, p1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-object v1, v5

    .line 175
    :goto_3
    check-cast v1, Lc60;

    .line 176
    .line 177
    if-eqz v1, :cond_9

    .line 178
    .line 179
    goto :goto_4

    .line 180
    :cond_9
    iget-object v1, p0, Ld60;->d:Ljava/lang/ref/WeakReference;

    .line 181
    .line 182
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object v1

    .line 186
    check-cast v1, Lb60;

    .line 187
    .line 188
    if-nez v1, :cond_a

    .line 189
    .line 190
    :goto_4
    return-void

    .line 191
    :cond_a
    iget v2, p0, Ld60;->e:I

    .line 192
    .line 193
    if-nez v2, :cond_b

    .line 194
    .line 195
    iget-boolean v2, p0, Ld60;->f:Z

    .line 196
    .line 197
    if-eqz v2, :cond_c

    .line 198
    .line 199
    :cond_b
    move v6, v7

    .line 200
    :cond_c
    invoke-virtual {p0, p1}, Ld60;->b(La60;)Lu50;

    .line 201
    .line 202
    .line 203
    move-result-object v2

    .line 204
    iget v3, p0, Ld60;->e:I

    .line 205
    .line 206
    add-int/2addr v3, v7

    .line 207
    iput v3, p0, Ld60;->e:I

    .line 208
    .line 209
    :goto_5
    iget-object v3, v0, Lc60;->a:Lu50;

    .line 210
    .line 211
    invoke-virtual {v3, v2}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 212
    .line 213
    .line 214
    move-result v2

    .line 215
    if-gez v2, :cond_11

    .line 216
    .line 217
    iget-object v2, p0, Ld60;->b:Lgu;

    .line 218
    .line 219
    iget-object v2, v2, Lgu;->j:Ljava/util/HashMap;

    .line 220
    .line 221
    invoke-virtual {v2, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 222
    .line 223
    .line 224
    move-result v2

    .line 225
    if-eqz v2, :cond_11

    .line 226
    .line 227
    iget-object v2, v0, Lc60;->a:Lu50;

    .line 228
    .line 229
    iget-object v3, p0, Ld60;->h:Ljava/util/ArrayList;

    .line 230
    .line 231
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 232
    .line 233
    .line 234
    sget-object v2, Lt50;->Companion:Lr50;

    .line 235
    .line 236
    iget-object v8, v0, Lc60;->a:Lu50;

    .line 237
    .line 238
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 239
    .line 240
    .line 241
    const-string v2, "state"

    .line 242
    .line 243
    invoke-static {v8, v2}, Li30;->m(Ljava/lang/Object;Ljava/lang/String;)V

    .line 244
    .line 245
    .line 246
    invoke-virtual {v8}, Ljava/lang/Enum;->ordinal()I

    .line 247
    .line 248
    .line 249
    move-result v2

    .line 250
    if-eq v2, v7, :cond_f

    .line 251
    .line 252
    if-eq v2, v4, :cond_e

    .line 253
    .line 254
    const/4 v8, 0x3

    .line 255
    if-eq v2, v8, :cond_d

    .line 256
    .line 257
    move-object v2, v5

    .line 258
    goto :goto_6

    .line 259
    :cond_d
    sget-object v2, Lt50;->ON_RESUME:Lt50;

    .line 260
    .line 261
    goto :goto_6

    .line 262
    :cond_e
    sget-object v2, Lt50;->ON_START:Lt50;

    .line 263
    .line 264
    goto :goto_6

    .line 265
    :cond_f
    sget-object v2, Lt50;->ON_CREATE:Lt50;

    .line 266
    .line 267
    :goto_6
    if-eqz v2, :cond_10

    .line 268
    .line 269
    invoke-virtual {v0, v1, v2}, Lc60;->a(Lb60;Lt50;)V

    .line 270
    .line 271
    .line 272
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 273
    .line 274
    .line 275
    move-result v2

    .line 276
    sub-int/2addr v2, v7

    .line 277
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 278
    .line 279
    .line 280
    invoke-virtual {p0, p1}, Ld60;->b(La60;)Lu50;

    .line 281
    .line 282
    .line 283
    move-result-object v2

    .line 284
    goto :goto_5

    .line 285
    :cond_10
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 286
    .line 287
    new-instance v1, Ljava/lang/StringBuilder;

    .line 288
    .line 289
    const-string v2, "no event up from "

    .line 290
    .line 291
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 292
    .line 293
    .line 294
    iget-object v0, v0, Lc60;->a:Lu50;

    .line 295
    .line 296
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 297
    .line 298
    .line 299
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 300
    .line 301
    .line 302
    move-result-object v0

    .line 303
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 304
    .line 305
    .line 306
    throw p1

    .line 307
    :cond_11
    if-nez v6, :cond_12

    .line 308
    .line 309
    invoke-virtual {p0}, Ld60;->h()V

    .line 310
    .line 311
    .line 312
    :cond_12
    iget p1, p0, Ld60;->e:I

    .line 313
    .line 314
    add-int/lit8 p1, p1, -0x1

    .line 315
    .line 316
    iput p1, p0, Ld60;->e:I

    .line 317
    .line 318
    return-void
.end method

.method public final b(La60;)Lu50;
    .locals 3

    .line 1
    iget-object v0, p0, Ld60;->b:Lgu;

    .line 2
    .line 3
    iget-object v0, v0, Lgu;->j:Ljava/util/HashMap;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x0

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    check-cast p1, Lls0;

    .line 17
    .line 18
    iget-object p1, p1, Lls0;->i:Lls0;

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move-object p1, v2

    .line 22
    :goto_0
    if-eqz p1, :cond_1

    .line 23
    .line 24
    iget-object p1, p1, Lls0;->g:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast p1, Lc60;

    .line 27
    .line 28
    iget-object p1, p1, Lc60;->a:Lu50;

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_1
    move-object p1, v2

    .line 32
    :goto_1
    iget-object v0, p0, Ld60;->h:Ljava/util/ArrayList;

    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-nez v1, :cond_2

    .line 39
    .line 40
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    add-int/lit8 v1, v1, -0x1

    .line 45
    .line 46
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    move-object v2, v0

    .line 51
    check-cast v2, Lu50;

    .line 52
    .line 53
    :cond_2
    iget-object v0, p0, Ld60;->c:Lu50;

    .line 54
    .line 55
    const-string v1, "state1"

    .line 56
    .line 57
    invoke-static {v0, v1}, Li30;->m(Ljava/lang/Object;Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    if-eqz p1, :cond_3

    .line 61
    .line 62
    invoke-virtual {p1, v0}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    if-gez v1, :cond_3

    .line 67
    .line 68
    goto :goto_2

    .line 69
    :cond_3
    move-object p1, v0

    .line 70
    :goto_2
    if-eqz v2, :cond_4

    .line 71
    .line 72
    invoke-virtual {v2, p1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    if-gez v0, :cond_4

    .line 77
    .line 78
    return-object v2

    .line 79
    :cond_4
    return-object p1
.end method

.method public final c(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Ld60;->a:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-static {}, Lj8;->T()Lj8;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v0, v0, Lj8;->D:Lwn;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {v0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    if-ne v0, v1, :cond_0

    .line 27
    .line 28
    return-void

    .line 29
    :cond_0
    const-string v0, "Method "

    .line 30
    .line 31
    const-string v1, " must be called on the main thread"

    .line 32
    .line 33
    invoke-static {v0, p1, v1}, Lex0;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 38
    .line 39
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    throw v0

    .line 47
    :cond_1
    return-void
.end method

.method public final d(Lt50;)V
    .locals 1

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p1, v0}, Li30;->m(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "handleLifecycleEvent"

    .line 7
    .line 8
    invoke-virtual {p0, v0}, Ld60;->c(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Lt50;->a()Lu50;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p0, p1}, Ld60;->e(Lu50;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final e(Lu50;)V
    .locals 5

    .line 1
    iget-object v0, p0, Ld60;->c:Lu50;

    .line 2
    .line 3
    if-ne v0, p1, :cond_0

    .line 4
    .line 5
    goto/16 :goto_2

    .line 6
    .line 7
    :cond_0
    iget-object v0, p0, Ld60;->d:Ljava/lang/ref/WeakReference;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Lb60;

    .line 14
    .line 15
    iget-object v1, p0, Ld60;->c:Lu50;

    .line 16
    .line 17
    const-string v2, "current"

    .line 18
    .line 19
    invoke-static {v1, v2}, Li30;->m(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    sget-object v2, Lu50;->g:Lu50;

    .line 23
    .line 24
    sget-object v3, Lu50;->f:Lu50;

    .line 25
    .line 26
    if-ne v1, v2, :cond_2

    .line 27
    .line 28
    if-eq p1, v3, :cond_1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 32
    .line 33
    new-instance v2, Ljava/lang/StringBuilder;

    .line 34
    .line 35
    const-string v3, "State must be at least \'"

    .line 36
    .line 37
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    sget-object v3, Lu50;->h:Lu50;

    .line 41
    .line 42
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    const-string v3, "\' to be moved to \'"

    .line 46
    .line 47
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const-string p1, "\' in component "

    .line 54
    .line 55
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    invoke-direct {v1, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    throw v1

    .line 73
    :cond_2
    :goto_0
    if-ne v1, v3, :cond_4

    .line 74
    .line 75
    if-ne v1, p1, :cond_3

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_3
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 79
    .line 80
    new-instance v2, Ljava/lang/StringBuilder;

    .line 81
    .line 82
    const-string v4, "State is \'"

    .line 83
    .line 84
    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    const-string v3, "\' and cannot be moved to `"

    .line 91
    .line 92
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    const-string p1, "` in component "

    .line 99
    .line 100
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    invoke-direct {v1, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    throw v1

    .line 118
    :cond_4
    :goto_1
    iput-object p1, p0, Ld60;->c:Lu50;

    .line 119
    .line 120
    iget-boolean p1, p0, Ld60;->f:Z

    .line 121
    .line 122
    const/4 v0, 0x1

    .line 123
    if-nez p1, :cond_7

    .line 124
    .line 125
    iget p1, p0, Ld60;->e:I

    .line 126
    .line 127
    if-eqz p1, :cond_5

    .line 128
    .line 129
    goto :goto_3

    .line 130
    :cond_5
    iput-boolean v0, p0, Ld60;->f:Z

    .line 131
    .line 132
    invoke-virtual {p0}, Ld60;->h()V

    .line 133
    .line 134
    .line 135
    const/4 p1, 0x0

    .line 136
    iput-boolean p1, p0, Ld60;->f:Z

    .line 137
    .line 138
    iget-object p1, p0, Ld60;->c:Lu50;

    .line 139
    .line 140
    if-ne p1, v3, :cond_6

    .line 141
    .line 142
    new-instance p1, Lgu;

    .line 143
    .line 144
    invoke-direct {p1}, Lgu;-><init>()V

    .line 145
    .line 146
    .line 147
    iput-object p1, p0, Ld60;->b:Lgu;

    .line 148
    .line 149
    :cond_6
    :goto_2
    return-void

    .line 150
    :cond_7
    :goto_3
    iput-boolean v0, p0, Ld60;->g:Z

    .line 151
    .line 152
    return-void
.end method

.method public final f(La60;)V
    .locals 1

    .line 1
    const-string v0, "removeObserver"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Ld60;->c(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ld60;->b:Lgu;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lgu;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final g()V
    .locals 1

    .line 1
    const-string v0, "setCurrentState"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Ld60;->c(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lu50;->h:Lu50;

    .line 7
    .line 8
    invoke-virtual {p0, v0}, Ld60;->e(Lu50;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final h()V
    .locals 12

    .line 1
    iget-object v0, p0, Ld60;->d:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lb60;

    .line 8
    .line 9
    if-eqz v0, :cond_e

    .line 10
    .line 11
    :cond_0
    iget-object v1, p0, Ld60;->b:Lgu;

    .line 12
    .line 13
    iget v2, v1, Los0;->i:I

    .line 14
    .line 15
    const/4 v3, 0x0

    .line 16
    if-nez v2, :cond_1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_1
    iget-object v1, v1, Los0;->f:Lls0;

    .line 20
    .line 21
    invoke-static {v1}, Li30;->j(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    iget-object v1, v1, Lls0;->g:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v1, Lc60;

    .line 27
    .line 28
    iget-object v1, v1, Lc60;->a:Lu50;

    .line 29
    .line 30
    iget-object v2, p0, Ld60;->b:Lgu;

    .line 31
    .line 32
    iget-object v2, v2, Los0;->g:Lls0;

    .line 33
    .line 34
    invoke-static {v2}, Li30;->j(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    iget-object v2, v2, Lls0;->g:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v2, Lc60;

    .line 40
    .line 41
    iget-object v2, v2, Lc60;->a:Lu50;

    .line 42
    .line 43
    if-ne v1, v2, :cond_2

    .line 44
    .line 45
    iget-object v1, p0, Ld60;->c:Lu50;

    .line 46
    .line 47
    if-ne v1, v2, :cond_2

    .line 48
    .line 49
    :goto_0
    iput-boolean v3, p0, Ld60;->g:Z

    .line 50
    .line 51
    iget-object v0, p0, Ld60;->i:Lay0;

    .line 52
    .line 53
    iget-object v1, p0, Ld60;->c:Lu50;

    .line 54
    .line 55
    invoke-virtual {v0, v1}, Lay0;->F(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :cond_2
    iput-boolean v3, p0, Ld60;->g:Z

    .line 60
    .line 61
    iget-object v1, p0, Ld60;->c:Lu50;

    .line 62
    .line 63
    iget-object v2, p0, Ld60;->b:Lgu;

    .line 64
    .line 65
    iget-object v2, v2, Los0;->f:Lls0;

    .line 66
    .line 67
    invoke-static {v2}, Li30;->j(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    iget-object v2, v2, Lls0;->g:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast v2, Lc60;

    .line 73
    .line 74
    iget-object v2, v2, Lc60;->a:Lu50;

    .line 75
    .line 76
    invoke-virtual {v1, v2}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 77
    .line 78
    .line 79
    move-result v1

    .line 80
    const/4 v2, 0x0

    .line 81
    const/4 v3, 0x3

    .line 82
    const/4 v4, 0x2

    .line 83
    const-string v5, "state"

    .line 84
    .line 85
    const/4 v6, 0x1

    .line 86
    iget-object v7, p0, Ld60;->h:Ljava/util/ArrayList;

    .line 87
    .line 88
    if-gez v1, :cond_8

    .line 89
    .line 90
    iget-object v1, p0, Ld60;->b:Lgu;

    .line 91
    .line 92
    new-instance v8, Lks0;

    .line 93
    .line 94
    iget-object v9, v1, Los0;->g:Lls0;

    .line 95
    .line 96
    iget-object v10, v1, Los0;->f:Lls0;

    .line 97
    .line 98
    const/4 v11, 0x1

    .line 99
    invoke-direct {v8, v9, v10, v11}, Lks0;-><init>(Lls0;Lls0;I)V

    .line 100
    .line 101
    .line 102
    iget-object v1, v1, Los0;->h:Ljava/util/WeakHashMap;

    .line 103
    .line 104
    sget-object v9, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 105
    .line 106
    invoke-virtual {v1, v8, v9}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    :cond_3
    invoke-virtual {v8}, Lks0;->hasNext()Z

    .line 110
    .line 111
    .line 112
    move-result v1

    .line 113
    if-eqz v1, :cond_8

    .line 114
    .line 115
    iget-boolean v1, p0, Ld60;->g:Z

    .line 116
    .line 117
    if-nez v1, :cond_8

    .line 118
    .line 119
    invoke-virtual {v8}, Lks0;->next()Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v1

    .line 123
    check-cast v1, Ljava/util/Map$Entry;

    .line 124
    .line 125
    invoke-static {v1}, Li30;->j(Ljava/lang/Object;)V

    .line 126
    .line 127
    .line 128
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v9

    .line 132
    check-cast v9, La60;

    .line 133
    .line 134
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v1

    .line 138
    check-cast v1, Lc60;

    .line 139
    .line 140
    :goto_1
    iget-object v10, v1, Lc60;->a:Lu50;

    .line 141
    .line 142
    iget-object v11, p0, Ld60;->c:Lu50;

    .line 143
    .line 144
    invoke-virtual {v10, v11}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 145
    .line 146
    .line 147
    move-result v10

    .line 148
    if-lez v10, :cond_3

    .line 149
    .line 150
    iget-boolean v10, p0, Ld60;->g:Z

    .line 151
    .line 152
    if-nez v10, :cond_3

    .line 153
    .line 154
    iget-object v10, p0, Ld60;->b:Lgu;

    .line 155
    .line 156
    iget-object v10, v10, Lgu;->j:Ljava/util/HashMap;

    .line 157
    .line 158
    invoke-virtual {v10, v9}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 159
    .line 160
    .line 161
    move-result v10

    .line 162
    if-eqz v10, :cond_3

    .line 163
    .line 164
    sget-object v10, Lt50;->Companion:Lr50;

    .line 165
    .line 166
    iget-object v11, v1, Lc60;->a:Lu50;

    .line 167
    .line 168
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 169
    .line 170
    .line 171
    invoke-static {v11, v5}, Li30;->m(Ljava/lang/Object;Ljava/lang/String;)V

    .line 172
    .line 173
    .line 174
    invoke-virtual {v11}, Ljava/lang/Enum;->ordinal()I

    .line 175
    .line 176
    .line 177
    move-result v10

    .line 178
    if-eq v10, v4, :cond_6

    .line 179
    .line 180
    if-eq v10, v3, :cond_5

    .line 181
    .line 182
    const/4 v11, 0x4

    .line 183
    if-eq v10, v11, :cond_4

    .line 184
    .line 185
    move-object v10, v2

    .line 186
    goto :goto_2

    .line 187
    :cond_4
    sget-object v10, Lt50;->ON_PAUSE:Lt50;

    .line 188
    .line 189
    goto :goto_2

    .line 190
    :cond_5
    sget-object v10, Lt50;->ON_STOP:Lt50;

    .line 191
    .line 192
    goto :goto_2

    .line 193
    :cond_6
    sget-object v10, Lt50;->ON_DESTROY:Lt50;

    .line 194
    .line 195
    :goto_2
    if-eqz v10, :cond_7

    .line 196
    .line 197
    invoke-virtual {v10}, Lt50;->a()Lu50;

    .line 198
    .line 199
    .line 200
    move-result-object v11

    .line 201
    invoke-virtual {v7, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 202
    .line 203
    .line 204
    invoke-virtual {v1, v0, v10}, Lc60;->a(Lb60;Lt50;)V

    .line 205
    .line 206
    .line 207
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 208
    .line 209
    .line 210
    move-result v10

    .line 211
    sub-int/2addr v10, v6

    .line 212
    invoke-virtual {v7, v10}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    goto :goto_1

    .line 216
    :cond_7
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 217
    .line 218
    new-instance v2, Ljava/lang/StringBuilder;

    .line 219
    .line 220
    const-string v3, "no event down from "

    .line 221
    .line 222
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 223
    .line 224
    .line 225
    iget-object v1, v1, Lc60;->a:Lu50;

    .line 226
    .line 227
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 228
    .line 229
    .line 230
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 231
    .line 232
    .line 233
    move-result-object v1

    .line 234
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 235
    .line 236
    .line 237
    throw v0

    .line 238
    :cond_8
    iget-object v1, p0, Ld60;->b:Lgu;

    .line 239
    .line 240
    iget-object v1, v1, Los0;->g:Lls0;

    .line 241
    .line 242
    iget-boolean v8, p0, Ld60;->g:Z

    .line 243
    .line 244
    if-nez v8, :cond_0

    .line 245
    .line 246
    if-eqz v1, :cond_0

    .line 247
    .line 248
    iget-object v8, p0, Ld60;->c:Lu50;

    .line 249
    .line 250
    iget-object v1, v1, Lls0;->g:Ljava/lang/Object;

    .line 251
    .line 252
    check-cast v1, Lc60;

    .line 253
    .line 254
    iget-object v1, v1, Lc60;->a:Lu50;

    .line 255
    .line 256
    invoke-virtual {v8, v1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 257
    .line 258
    .line 259
    move-result v1

    .line 260
    if-lez v1, :cond_0

    .line 261
    .line 262
    iget-object v1, p0, Ld60;->b:Lgu;

    .line 263
    .line 264
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 265
    .line 266
    .line 267
    new-instance v8, Lms0;

    .line 268
    .line 269
    invoke-direct {v8, v1}, Lms0;-><init>(Los0;)V

    .line 270
    .line 271
    .line 272
    iget-object v1, v1, Los0;->h:Ljava/util/WeakHashMap;

    .line 273
    .line 274
    sget-object v9, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 275
    .line 276
    invoke-virtual {v1, v8, v9}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 277
    .line 278
    .line 279
    :cond_9
    invoke-virtual {v8}, Lms0;->hasNext()Z

    .line 280
    .line 281
    .line 282
    move-result v1

    .line 283
    if-eqz v1, :cond_0

    .line 284
    .line 285
    iget-boolean v1, p0, Ld60;->g:Z

    .line 286
    .line 287
    if-nez v1, :cond_0

    .line 288
    .line 289
    invoke-virtual {v8}, Lms0;->next()Ljava/lang/Object;

    .line 290
    .line 291
    .line 292
    move-result-object v1

    .line 293
    check-cast v1, Ljava/util/Map$Entry;

    .line 294
    .line 295
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 296
    .line 297
    .line 298
    move-result-object v9

    .line 299
    check-cast v9, La60;

    .line 300
    .line 301
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 302
    .line 303
    .line 304
    move-result-object v1

    .line 305
    check-cast v1, Lc60;

    .line 306
    .line 307
    :goto_3
    iget-object v10, v1, Lc60;->a:Lu50;

    .line 308
    .line 309
    iget-object v11, p0, Ld60;->c:Lu50;

    .line 310
    .line 311
    invoke-virtual {v10, v11}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 312
    .line 313
    .line 314
    move-result v10

    .line 315
    if-gez v10, :cond_9

    .line 316
    .line 317
    iget-boolean v10, p0, Ld60;->g:Z

    .line 318
    .line 319
    if-nez v10, :cond_9

    .line 320
    .line 321
    iget-object v10, p0, Ld60;->b:Lgu;

    .line 322
    .line 323
    iget-object v10, v10, Lgu;->j:Ljava/util/HashMap;

    .line 324
    .line 325
    invoke-virtual {v10, v9}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 326
    .line 327
    .line 328
    move-result v10

    .line 329
    if-eqz v10, :cond_9

    .line 330
    .line 331
    iget-object v10, v1, Lc60;->a:Lu50;

    .line 332
    .line 333
    invoke-virtual {v7, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 334
    .line 335
    .line 336
    sget-object v10, Lt50;->Companion:Lr50;

    .line 337
    .line 338
    iget-object v11, v1, Lc60;->a:Lu50;

    .line 339
    .line 340
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 341
    .line 342
    .line 343
    invoke-static {v11, v5}, Li30;->m(Ljava/lang/Object;Ljava/lang/String;)V

    .line 344
    .line 345
    .line 346
    invoke-virtual {v11}, Ljava/lang/Enum;->ordinal()I

    .line 347
    .line 348
    .line 349
    move-result v10

    .line 350
    if-eq v10, v6, :cond_c

    .line 351
    .line 352
    if-eq v10, v4, :cond_b

    .line 353
    .line 354
    if-eq v10, v3, :cond_a

    .line 355
    .line 356
    move-object v10, v2

    .line 357
    goto :goto_4

    .line 358
    :cond_a
    sget-object v10, Lt50;->ON_RESUME:Lt50;

    .line 359
    .line 360
    goto :goto_4

    .line 361
    :cond_b
    sget-object v10, Lt50;->ON_START:Lt50;

    .line 362
    .line 363
    goto :goto_4

    .line 364
    :cond_c
    sget-object v10, Lt50;->ON_CREATE:Lt50;

    .line 365
    .line 366
    :goto_4
    if-eqz v10, :cond_d

    .line 367
    .line 368
    invoke-virtual {v1, v0, v10}, Lc60;->a(Lb60;Lt50;)V

    .line 369
    .line 370
    .line 371
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 372
    .line 373
    .line 374
    move-result v10

    .line 375
    sub-int/2addr v10, v6

    .line 376
    invoke-virtual {v7, v10}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 377
    .line 378
    .line 379
    goto :goto_3

    .line 380
    :cond_d
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 381
    .line 382
    new-instance v2, Ljava/lang/StringBuilder;

    .line 383
    .line 384
    const-string v3, "no event up from "

    .line 385
    .line 386
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 387
    .line 388
    .line 389
    iget-object v1, v1, Lc60;->a:Lu50;

    .line 390
    .line 391
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 392
    .line 393
    .line 394
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 395
    .line 396
    .line 397
    move-result-object v1

    .line 398
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 399
    .line 400
    .line 401
    throw v0

    .line 402
    :cond_e
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 403
    .line 404
    const-string v1, "LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state."

    .line 405
    .line 406
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 407
    .line 408
    .line 409
    throw v0
.end method
