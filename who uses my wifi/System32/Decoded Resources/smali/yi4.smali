.class public final Lyi4;
.super Ljj4;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ljava/lang/Comparable;


# instance fields
.field public final A:Z

.field public final B:Z

.field public final C:Z

.field public final j:I

.field public final k:Z

.field public final l:Ljava/lang/String;

.field public final m:Ldj4;

.field public final n:Z

.field public final o:I

.field public final p:I

.field public final q:I

.field public final r:I

.field public final s:Z

.field public final t:I

.field public final u:I

.field public final v:Z

.field public final w:I

.field public final x:I

.field public final y:I

.field public final z:I


# direct methods
.method public constructor <init>(ILd02;ILdj4;IZLzi4;)V
    .locals 7

    .line 1
    invoke-direct {p0, p1, p2, p3}, Ljj4;-><init>(ILd02;I)V

    .line 2
    .line 3
    .line 4
    iput-object p4, p0, Lyi4;->m:Ldj4;

    .line 5
    .line 6
    iget-boolean p1, p4, Ldj4;->z:Z

    .line 7
    .line 8
    iget-object p2, p4, Lr32;->p:Lxm3;

    .line 9
    .line 10
    iget-object p3, p4, Lr32;->l:Lxm3;

    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    if-eq v0, p1, :cond_0

    .line 14
    .line 15
    const/16 p1, 0x10

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/16 p1, 0x18

    .line 19
    .line 20
    :goto_0
    iget-object v1, p0, Ljj4;->i:Lph4;

    .line 21
    .line 22
    iget-object v1, v1, Lph4;->d:Ljava/lang/String;

    .line 23
    .line 24
    invoke-static {v1}, Llj4;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    iput-object v1, p0, Lyi4;->l:Ljava/lang/String;

    .line 29
    .line 30
    const/4 v1, 0x0

    .line 31
    invoke-static {p5, v1}, Lkg4;->I(IZ)Z

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    iput-boolean v2, p0, Lyi4;->n:Z

    .line 36
    .line 37
    move v2, v1

    .line 38
    :goto_1
    invoke-virtual {p3}, Ljava/util/AbstractCollection;->size()I

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    const v4, 0x7fffffff

    .line 43
    .line 44
    .line 45
    if-ge v2, v3, :cond_2

    .line 46
    .line 47
    iget-object v3, p0, Ljj4;->i:Lph4;

    .line 48
    .line 49
    invoke-interface {p3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v5

    .line 53
    check-cast v5, Ljava/lang/String;

    .line 54
    .line 55
    invoke-static {v3, v5, v1}, Llj4;->d(Lph4;Ljava/lang/String;Z)I

    .line 56
    .line 57
    .line 58
    move-result v3

    .line 59
    if-lez v3, :cond_1

    .line 60
    .line 61
    goto :goto_2

    .line 62
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_2
    move v3, v1

    .line 66
    move v2, v4

    .line 67
    :goto_2
    iput v2, p0, Lyi4;->p:I

    .line 68
    .line 69
    iput v3, p0, Lyi4;->o:I

    .line 70
    .line 71
    iget-object p3, p0, Ljj4;->i:Lph4;

    .line 72
    .line 73
    iget p3, p3, Lph4;->f:I

    .line 74
    .line 75
    if-eqz p3, :cond_3

    .line 76
    .line 77
    if-nez p3, :cond_3

    .line 78
    .line 79
    move p3, v4

    .line 80
    goto :goto_3

    .line 81
    :cond_3
    invoke-static {v1}, Ljava/lang/Integer;->bitCount(I)I

    .line 82
    .line 83
    .line 84
    move-result p3

    .line 85
    :goto_3
    iput p3, p0, Lyi4;->q:I

    .line 86
    .line 87
    iget-object p3, p0, Ljj4;->i:Lph4;

    .line 88
    .line 89
    iget-object v2, p4, Lr32;->m:Lxm3;

    .line 90
    .line 91
    invoke-static {p3, v2}, Llj4;->e(Lph4;Lxm3;)I

    .line 92
    .line 93
    .line 94
    move-result p3

    .line 95
    iput p3, p0, Lyi4;->r:I

    .line 96
    .line 97
    iget-object p3, p0, Ljj4;->i:Lph4;

    .line 98
    .line 99
    iget v2, p3, Lph4;->f:I

    .line 100
    .line 101
    if-eqz v2, :cond_4

    .line 102
    .line 103
    and-int/2addr v2, v0

    .line 104
    if-eqz v2, :cond_5

    .line 105
    .line 106
    :cond_4
    move v2, v0

    .line 107
    goto :goto_4

    .line 108
    :cond_5
    move v2, v1

    .line 109
    :goto_4
    iput-boolean v2, p0, Lyi4;->s:Z

    .line 110
    .line 111
    iget v2, p3, Lph4;->e:I

    .line 112
    .line 113
    and-int/2addr v2, v0

    .line 114
    if-eq v0, v2, :cond_6

    .line 115
    .line 116
    move v2, v1

    .line 117
    goto :goto_5

    .line 118
    :cond_6
    move v2, v0

    .line 119
    :goto_5
    iput-boolean v2, p0, Lyi4;->v:Z

    .line 120
    .line 121
    iget-object v2, p3, Lph4;->m:Ljava/lang/String;

    .line 122
    .line 123
    if-nez v2, :cond_8

    .line 124
    .line 125
    :cond_7
    :goto_6
    move v2, v1

    .line 126
    goto :goto_8

    .line 127
    :cond_8
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 128
    .line 129
    .line 130
    move-result v3

    .line 131
    const v5, -0x7e929daa

    .line 132
    .line 133
    .line 134
    if-eq v3, v5, :cond_b

    .line 135
    .line 136
    const v5, 0xb269699

    .line 137
    .line 138
    .line 139
    if-eq v3, v5, :cond_a

    .line 140
    .line 141
    const v5, 0x59afdf4a

    .line 142
    .line 143
    .line 144
    if-eq v3, v5, :cond_9

    .line 145
    .line 146
    goto :goto_6

    .line 147
    :cond_9
    const-string v3, "audio/iamf"

    .line 148
    .line 149
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 150
    .line 151
    .line 152
    move-result v2

    .line 153
    if-eqz v2, :cond_7

    .line 154
    .line 155
    goto :goto_7

    .line 156
    :cond_a
    const-string v3, "audio/ac4"

    .line 157
    .line 158
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 159
    .line 160
    .line 161
    move-result v2

    .line 162
    if-eqz v2, :cond_7

    .line 163
    .line 164
    goto :goto_7

    .line 165
    :cond_b
    const-string v3, "audio/eac3-joc"

    .line 166
    .line 167
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 168
    .line 169
    .line 170
    move-result v2

    .line 171
    if-eqz v2, :cond_7

    .line 172
    .line 173
    :goto_7
    move v2, v0

    .line 174
    :goto_8
    iput-boolean v2, p0, Lyi4;->C:Z

    .line 175
    .line 176
    iget v2, p3, Lph4;->E:I

    .line 177
    .line 178
    iput v2, p0, Lyi4;->w:I

    .line 179
    .line 180
    iget v3, p3, Lph4;->F:I

    .line 181
    .line 182
    iput v3, p0, Lyi4;->x:I

    .line 183
    .line 184
    iget v3, p3, Lph4;->i:I

    .line 185
    .line 186
    iput v3, p0, Lyi4;->y:I

    .line 187
    .line 188
    const/4 v5, -0x1

    .line 189
    if-eq v3, v5, :cond_d

    .line 190
    .line 191
    iget v6, p4, Lr32;->o:I

    .line 192
    .line 193
    if-gt v3, v6, :cond_c

    .line 194
    .line 195
    goto :goto_9

    .line 196
    :cond_c
    move p3, v1

    .line 197
    goto :goto_a

    .line 198
    :cond_d
    :goto_9
    if-eq v2, v5, :cond_e

    .line 199
    .line 200
    iget p4, p4, Lr32;->n:I

    .line 201
    .line 202
    if-gt v2, p4, :cond_c

    .line 203
    .line 204
    :cond_e
    invoke-virtual {p7, p3}, Lzi4;->c(Ljava/lang/Object;)Z

    .line 205
    .line 206
    .line 207
    move-result p3

    .line 208
    if-eqz p3, :cond_c

    .line 209
    .line 210
    move p3, v0

    .line 211
    :goto_a
    iput-boolean p3, p0, Lyi4;->k:Z

    .line 212
    .line 213
    sget-object p3, Lv23;->a:Ljava/lang/String;

    .line 214
    .line 215
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 216
    .line 217
    .line 218
    move-result-object p3

    .line 219
    invoke-virtual {p3}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 220
    .line 221
    .line 222
    move-result-object p3

    .line 223
    invoke-virtual {p3}, Landroid/content/res/Configuration;->getLocales()Landroid/os/LocaleList;

    .line 224
    .line 225
    .line 226
    move-result-object p3

    .line 227
    invoke-virtual {p3}, Landroid/os/LocaleList;->toLanguageTags()Ljava/lang/String;

    .line 228
    .line 229
    .line 230
    move-result-object p3

    .line 231
    const-string p4, ","

    .line 232
    .line 233
    invoke-virtual {p3, p4, v5}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    .line 234
    .line 235
    .line 236
    move-result-object p3

    .line 237
    move p4, v1

    .line 238
    :goto_b
    array-length p7, p3

    .line 239
    if-ge p4, p7, :cond_f

    .line 240
    .line 241
    aget-object p7, p3, p4

    .line 242
    .line 243
    invoke-static {p7}, Lv23;->n(Ljava/lang/String;)Ljava/lang/String;

    .line 244
    .line 245
    .line 246
    move-result-object p7

    .line 247
    aput-object p7, p3, p4

    .line 248
    .line 249
    add-int/lit8 p4, p4, 0x1

    .line 250
    .line 251
    goto :goto_b

    .line 252
    :cond_f
    move p4, v1

    .line 253
    :goto_c
    array-length p7, p3

    .line 254
    if-ge p4, p7, :cond_11

    .line 255
    .line 256
    iget-object p7, p0, Ljj4;->i:Lph4;

    .line 257
    .line 258
    aget-object v2, p3, p4

    .line 259
    .line 260
    invoke-static {p7, v2, v1}, Llj4;->d(Lph4;Ljava/lang/String;Z)I

    .line 261
    .line 262
    .line 263
    move-result p7

    .line 264
    if-lez p7, :cond_10

    .line 265
    .line 266
    goto :goto_d

    .line 267
    :cond_10
    add-int/lit8 p4, p4, 0x1

    .line 268
    .line 269
    goto :goto_c

    .line 270
    :cond_11
    move p7, v1

    .line 271
    move p4, v4

    .line 272
    :goto_d
    iput p4, p0, Lyi4;->t:I

    .line 273
    .line 274
    iput p7, p0, Lyi4;->u:I

    .line 275
    .line 276
    move p3, v1

    .line 277
    :goto_e
    invoke-virtual {p2}, Ljava/util/AbstractCollection;->size()I

    .line 278
    .line 279
    .line 280
    move-result p4

    .line 281
    if-ge p3, p4, :cond_13

    .line 282
    .line 283
    iget-object p4, p0, Ljj4;->i:Lph4;

    .line 284
    .line 285
    iget-object p4, p4, Lph4;->m:Ljava/lang/String;

    .line 286
    .line 287
    if-eqz p4, :cond_12

    .line 288
    .line 289
    invoke-interface {p2, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 290
    .line 291
    .line 292
    move-result-object p7

    .line 293
    invoke-virtual {p4, p7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 294
    .line 295
    .line 296
    move-result p4

    .line 297
    if-eqz p4, :cond_12

    .line 298
    .line 299
    move v4, p3

    .line 300
    goto :goto_f

    .line 301
    :cond_12
    add-int/lit8 p3, p3, 0x1

    .line 302
    .line 303
    goto :goto_e

    .line 304
    :cond_13
    :goto_f
    iput v4, p0, Lyi4;->z:I

    .line 305
    .line 306
    and-int/lit16 p2, p5, 0x180

    .line 307
    .line 308
    const/16 p3, 0x80

    .line 309
    .line 310
    if-ne p2, p3, :cond_14

    .line 311
    .line 312
    move p2, v0

    .line 313
    goto :goto_10

    .line 314
    :cond_14
    move p2, v1

    .line 315
    :goto_10
    iput-boolean p2, p0, Lyi4;->A:Z

    .line 316
    .line 317
    and-int/lit8 p2, p5, 0x40

    .line 318
    .line 319
    const/16 p3, 0x40

    .line 320
    .line 321
    if-ne p2, p3, :cond_15

    .line 322
    .line 323
    move p2, v0

    .line 324
    goto :goto_11

    .line 325
    :cond_15
    move p2, v1

    .line 326
    :goto_11
    iput-boolean p2, p0, Lyi4;->B:Z

    .line 327
    .line 328
    iget-object p2, p0, Lyi4;->m:Ldj4;

    .line 329
    .line 330
    iget-boolean p3, p2, Ldj4;->B:Z

    .line 331
    .line 332
    invoke-static {p5, p3}, Lkg4;->I(IZ)Z

    .line 333
    .line 334
    .line 335
    move-result p3

    .line 336
    if-nez p3, :cond_16

    .line 337
    .line 338
    :goto_12
    move v0, v1

    .line 339
    goto :goto_13

    .line 340
    :cond_16
    iget-boolean p3, p0, Lyi4;->k:Z

    .line 341
    .line 342
    if-nez p3, :cond_17

    .line 343
    .line 344
    iget-boolean p4, p2, Ldj4;->y:Z

    .line 345
    .line 346
    if-nez p4, :cond_17

    .line 347
    .line 348
    goto :goto_12

    .line 349
    :cond_17
    iget-object p4, p2, Lr32;->q:Lm22;

    .line 350
    .line 351
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 352
    .line 353
    .line 354
    invoke-static {p5, v1}, Lkg4;->I(IZ)Z

    .line 355
    .line 356
    .line 357
    move-result p4

    .line 358
    if-eqz p4, :cond_19

    .line 359
    .line 360
    if-eqz p3, :cond_19

    .line 361
    .line 362
    iget-object p3, p0, Ljj4;->i:Lph4;

    .line 363
    .line 364
    iget p3, p3, Lph4;->i:I

    .line 365
    .line 366
    if-eq p3, v5, :cond_19

    .line 367
    .line 368
    iget-boolean p2, p2, Ldj4;->C:Z

    .line 369
    .line 370
    if-nez p2, :cond_18

    .line 371
    .line 372
    if-nez p6, :cond_19

    .line 373
    .line 374
    :cond_18
    and-int/2addr p1, p5

    .line 375
    if-eqz p1, :cond_19

    .line 376
    .line 377
    const/4 v0, 0x2

    .line 378
    :cond_19
    :goto_13
    iput v0, p0, Lyi4;->j:I

    .line 379
    .line 380
    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    .line 1
    iget v0, p0, Lyi4;->j:I

    .line 2
    .line 3
    return v0
.end method

.method public final bridge synthetic b(Ljj4;)Z
    .locals 5

    .line 1
    check-cast p1, Lyi4;

    .line 2
    .line 3
    iget-object v0, p0, Lyi4;->m:Ldj4;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Ljj4;->i:Lph4;

    .line 9
    .line 10
    iget v1, v0, Lph4;->E:I

    .line 11
    .line 12
    const/4 v2, -0x1

    .line 13
    if-eq v1, v2, :cond_0

    .line 14
    .line 15
    iget-object v3, p1, Ljj4;->i:Lph4;

    .line 16
    .line 17
    iget v4, v3, Lph4;->E:I

    .line 18
    .line 19
    if-ne v1, v4, :cond_0

    .line 20
    .line 21
    iget-object v1, v0, Lph4;->m:Ljava/lang/String;

    .line 22
    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    iget-object v4, v3, Lph4;->m:Ljava/lang/String;

    .line 26
    .line 27
    invoke-static {v1, v4}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_0

    .line 32
    .line 33
    iget v0, v0, Lph4;->F:I

    .line 34
    .line 35
    if-eq v0, v2, :cond_0

    .line 36
    .line 37
    iget v1, v3, Lph4;->F:I

    .line 38
    .line 39
    if-ne v0, v1, :cond_0

    .line 40
    .line 41
    iget-boolean v0, p0, Lyi4;->A:Z

    .line 42
    .line 43
    iget-boolean v1, p1, Lyi4;->A:Z

    .line 44
    .line 45
    if-ne v0, v1, :cond_0

    .line 46
    .line 47
    iget-boolean v0, p0, Lyi4;->B:Z

    .line 48
    .line 49
    iget-boolean p1, p1, Lyi4;->B:Z

    .line 50
    .line 51
    if-ne v0, p1, :cond_0

    .line 52
    .line 53
    const/4 p1, 0x1

    .line 54
    return p1

    .line 55
    :cond_0
    const/4 p1, 0x0

    .line 56
    return p1
.end method

.method public final c(Lyi4;)I
    .locals 6

    .line 1
    iget-boolean v0, p0, Lyi4;->n:Z

    .line 2
    .line 3
    iget-boolean v1, p0, Lyi4;->k:Z

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    sget-object v2, Llj4;->k:Lmm3;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    new-instance v2, Lzn3;

    .line 13
    .line 14
    invoke-direct {v2}, Lzn3;-><init>()V

    .line 15
    .line 16
    .line 17
    :goto_0
    sget-object v3, Lpm3;->a:Lnm3;

    .line 18
    .line 19
    iget-boolean v4, p1, Lyi4;->n:Z

    .line 20
    .line 21
    invoke-virtual {v3, v0, v4}, Lnm3;->d(ZZ)Lpm3;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    iget v3, p0, Lyi4;->p:I

    .line 26
    .line 27
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    iget v4, p1, Lyi4;->p:I

    .line 32
    .line 33
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    sget-object v5, Lqn3;->h:Lqn3;

    .line 38
    .line 39
    invoke-virtual {v0, v3, v4, v5}, Lpm3;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lpm3;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    iget v3, p0, Lyi4;->o:I

    .line 44
    .line 45
    iget v4, p1, Lyi4;->o:I

    .line 46
    .line 47
    invoke-virtual {v0, v3, v4}, Lpm3;->b(II)Lpm3;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    iget v3, p0, Lyi4;->q:I

    .line 52
    .line 53
    iget v4, p1, Lyi4;->q:I

    .line 54
    .line 55
    invoke-virtual {v0, v3, v4}, Lpm3;->b(II)Lpm3;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    iget v3, p0, Lyi4;->r:I

    .line 60
    .line 61
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    iget v4, p1, Lyi4;->r:I

    .line 66
    .line 67
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 68
    .line 69
    .line 70
    move-result-object v4

    .line 71
    invoke-virtual {v0, v3, v4, v5}, Lpm3;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lpm3;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    iget-boolean v3, p0, Lyi4;->v:Z

    .line 76
    .line 77
    iget-boolean v4, p1, Lyi4;->v:Z

    .line 78
    .line 79
    invoke-virtual {v0, v3, v4}, Lpm3;->d(ZZ)Lpm3;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    iget-boolean v3, p0, Lyi4;->s:Z

    .line 84
    .line 85
    iget-boolean v4, p1, Lyi4;->s:Z

    .line 86
    .line 87
    invoke-virtual {v0, v3, v4}, Lpm3;->d(ZZ)Lpm3;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    iget v3, p0, Lyi4;->t:I

    .line 92
    .line 93
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 94
    .line 95
    .line 96
    move-result-object v3

    .line 97
    iget v4, p1, Lyi4;->t:I

    .line 98
    .line 99
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 100
    .line 101
    .line 102
    move-result-object v4

    .line 103
    invoke-virtual {v0, v3, v4, v5}, Lpm3;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lpm3;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    iget v3, p0, Lyi4;->u:I

    .line 108
    .line 109
    iget v4, p1, Lyi4;->u:I

    .line 110
    .line 111
    invoke-virtual {v0, v3, v4}, Lpm3;->b(II)Lpm3;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    iget-boolean v3, p1, Lyi4;->k:Z

    .line 116
    .line 117
    invoke-virtual {v0, v1, v3}, Lpm3;->d(ZZ)Lpm3;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    iget v1, p0, Lyi4;->z:I

    .line 122
    .line 123
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    iget v3, p1, Lyi4;->z:I

    .line 128
    .line 129
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 130
    .line 131
    .line 132
    move-result-object v3

    .line 133
    invoke-virtual {v0, v1, v3, v5}, Lpm3;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lpm3;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    iget-object v1, p0, Lyi4;->m:Ldj4;

    .line 138
    .line 139
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 140
    .line 141
    .line 142
    iget-boolean v1, p0, Lyi4;->A:Z

    .line 143
    .line 144
    iget-boolean v3, p1, Lyi4;->A:Z

    .line 145
    .line 146
    invoke-virtual {v0, v1, v3}, Lpm3;->d(ZZ)Lpm3;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    iget-boolean v1, p0, Lyi4;->B:Z

    .line 151
    .line 152
    iget-boolean v3, p1, Lyi4;->B:Z

    .line 153
    .line 154
    invoke-virtual {v0, v1, v3}, Lpm3;->d(ZZ)Lpm3;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    iget-boolean v1, p0, Lyi4;->C:Z

    .line 159
    .line 160
    iget-boolean v3, p1, Lyi4;->C:Z

    .line 161
    .line 162
    invoke-virtual {v0, v1, v3}, Lpm3;->d(ZZ)Lpm3;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    iget v1, p0, Lyi4;->w:I

    .line 167
    .line 168
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 169
    .line 170
    .line 171
    move-result-object v1

    .line 172
    iget v3, p1, Lyi4;->w:I

    .line 173
    .line 174
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 175
    .line 176
    .line 177
    move-result-object v3

    .line 178
    invoke-virtual {v0, v1, v3, v2}, Lpm3;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lpm3;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    iget v1, p0, Lyi4;->x:I

    .line 183
    .line 184
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 185
    .line 186
    .line 187
    move-result-object v1

    .line 188
    iget v3, p1, Lyi4;->x:I

    .line 189
    .line 190
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 191
    .line 192
    .line 193
    move-result-object v3

    .line 194
    invoke-virtual {v0, v1, v3, v2}, Lpm3;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lpm3;

    .line 195
    .line 196
    .line 197
    move-result-object v0

    .line 198
    iget-object v1, p0, Lyi4;->l:Ljava/lang/String;

    .line 199
    .line 200
    iget-object v3, p1, Lyi4;->l:Ljava/lang/String;

    .line 201
    .line 202
    invoke-static {v1, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 203
    .line 204
    .line 205
    move-result v1

    .line 206
    if-eqz v1, :cond_1

    .line 207
    .line 208
    iget v1, p0, Lyi4;->y:I

    .line 209
    .line 210
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 211
    .line 212
    .line 213
    move-result-object v1

    .line 214
    iget p1, p1, Lyi4;->y:I

    .line 215
    .line 216
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 217
    .line 218
    .line 219
    move-result-object p1

    .line 220
    invoke-virtual {v0, v1, p1, v2}, Lpm3;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lpm3;

    .line 221
    .line 222
    .line 223
    move-result-object v0

    .line 224
    :cond_1
    invoke-virtual {v0}, Lpm3;->e()I

    .line 225
    .line 226
    .line 227
    move-result p1

    .line 228
    return p1
.end method

.method public final bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Lyi4;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lyi4;->c(Lyi4;)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method
