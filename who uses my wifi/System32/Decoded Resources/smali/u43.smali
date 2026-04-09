.class public final Lu43;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lca4;


# instance fields
.field public final synthetic a:I

.field public b:Lga4;


# direct methods
.method public synthetic constructor <init>()V
    .locals 1

    .line 1
    const/16 v0, 0x12

    iput v0, p0, Lu43;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lga4;I)V
    .locals 0

    .line 2
    iput p2, p0, Lu43;->a:I

    iput-object p1, p0, Lu43;->b:Lga4;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Lu43;Lga4;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lu43;->b:Lga4;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iput-object p1, p0, Lu43;->b:Lga4;

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 9
    .line 10
    invoke-direct {p0}, Ljava/lang/IllegalStateException;-><init>()V

    .line 11
    .line 12
    .line 13
    throw p0
.end method


# virtual methods
.method public final d()Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, Lu43;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lu43;->b:Lga4;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-interface {v0}, Lga4;->d()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    return-object v0

    .line 15
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 16
    .line 17
    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    .line 18
    .line 19
    .line 20
    throw v0

    .line 21
    :pswitch_0
    iget-object v0, p0, Lu43;->b:Lga4;

    .line 22
    .line 23
    invoke-interface {v0}, Lga4;->d()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    check-cast v0, Ljava/io/File;

    .line 28
    .line 29
    new-instance v1, Ljava/io/File;

    .line 30
    .line 31
    const-string v2, "ocs"

    .line 32
    .line 33
    invoke-direct {v1, v0, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    new-instance v0, Ljava/io/File;

    .line 37
    .line 38
    const-string v2, "pcam.jar"

    .line 39
    .line 40
    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    return-object v0

    .line 44
    :pswitch_1
    iget-object v0, p0, Lu43;->b:Lga4;

    .line 45
    .line 46
    invoke-interface {v0}, Lga4;->d()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    check-cast v0, Ljava/io/File;

    .line 51
    .line 52
    new-instance v1, Ljava/io/File;

    .line 53
    .line 54
    const-string v2, "ocs"

    .line 55
    .line 56
    invoke-direct {v1, v0, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    new-instance v0, Ljava/io/File;

    .line 60
    .line 61
    const-string v2, "pcbc"

    .line 62
    .line 63
    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    return-object v0

    .line 67
    :pswitch_2
    iget-object v0, p0, Lu43;->b:Lga4;

    .line 68
    .line 69
    invoke-interface {v0}, Lga4;->d()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    check-cast v0, Ljava/io/File;

    .line 74
    .line 75
    new-instance v1, Ljava/io/File;

    .line 76
    .line 77
    const-string v2, "ocs"

    .line 78
    .line 79
    invoke-direct {v1, v0, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    new-instance v0, Ljava/io/File;

    .line 83
    .line 84
    const-string v2, "pmtd"

    .line 85
    .line 86
    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    return-object v0

    .line 90
    :pswitch_3
    iget-object v0, p0, Lu43;->b:Lga4;

    .line 91
    .line 92
    invoke-interface {v0}, Lga4;->d()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    check-cast v0, Ljava/io/File;

    .line 97
    .line 98
    new-instance v1, Ljava/io/File;

    .line 99
    .line 100
    const-string v2, "dgd"

    .line 101
    .line 102
    invoke-direct {v1, v0, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    new-instance v0, Ljava/io/File;

    .line 106
    .line 107
    const-string v2, "pcam.jar"

    .line 108
    .line 109
    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    return-object v0

    .line 113
    :pswitch_4
    iget-object v0, p0, Lu43;->b:Lga4;

    .line 114
    .line 115
    invoke-interface {v0}, Lga4;->d()Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    check-cast v0, Ljava/io/File;

    .line 120
    .line 121
    new-instance v1, Ljava/io/File;

    .line 122
    .line 123
    const-string v2, "dgd"

    .line 124
    .line 125
    invoke-direct {v1, v0, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    new-instance v0, Ljava/io/File;

    .line 129
    .line 130
    const-string v2, "pcam.jar.tmp"

    .line 131
    .line 132
    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    return-object v0

    .line 136
    :pswitch_5
    iget-object v0, p0, Lu43;->b:Lga4;

    .line 137
    .line 138
    invoke-interface {v0}, Lga4;->d()Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    check-cast v0, Ljava/io/File;

    .line 143
    .line 144
    new-instance v1, Ljava/io/File;

    .line 145
    .line 146
    const-string v2, "dgd"

    .line 147
    .line 148
    invoke-direct {v1, v0, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    new-instance v0, Ljava/io/File;

    .line 152
    .line 153
    const-string v2, "pcbc"

    .line 154
    .line 155
    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    return-object v0

    .line 159
    :pswitch_6
    iget-object v0, p0, Lu43;->b:Lga4;

    .line 160
    .line 161
    invoke-interface {v0}, Lga4;->d()Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    check-cast v0, Ljava/io/File;

    .line 166
    .line 167
    new-instance v1, Ljava/io/File;

    .line 168
    .line 169
    const-string v2, "dgd"

    .line 170
    .line 171
    invoke-direct {v1, v0, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 172
    .line 173
    .line 174
    new-instance v0, Ljava/io/File;

    .line 175
    .line 176
    const-string v2, "pcopt"

    .line 177
    .line 178
    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 179
    .line 180
    .line 181
    return-object v0

    .line 182
    :pswitch_7
    iget-object v0, p0, Lu43;->b:Lga4;

    .line 183
    .line 184
    invoke-interface {v0}, Lga4;->d()Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v0

    .line 188
    check-cast v0, Ljava/io/File;

    .line 189
    .line 190
    new-instance v1, Ljava/io/File;

    .line 191
    .line 192
    const-string v2, "dgd"

    .line 193
    .line 194
    invoke-direct {v1, v0, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 195
    .line 196
    .line 197
    new-instance v0, Ljava/io/File;

    .line 198
    .line 199
    const-string v2, "pmtd"

    .line 200
    .line 201
    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 202
    .line 203
    .line 204
    return-object v0

    .line 205
    :pswitch_8
    iget-object v0, p0, Lu43;->b:Lga4;

    .line 206
    .line 207
    invoke-interface {v0}, Lga4;->d()Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object v0

    .line 211
    check-cast v0, Lea3;

    .line 212
    .line 213
    new-instance v1, Lda3;

    .line 214
    .line 215
    invoke-direct {v1, v0}, Lda3;-><init>(Lea3;)V

    .line 216
    .line 217
    .line 218
    return-object v1

    .line 219
    :pswitch_9
    iget-object v0, p0, Lu43;->b:Lga4;

    .line 220
    .line 221
    invoke-interface {v0}, Lga4;->d()Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    move-result-object v0

    .line 225
    check-cast v0, Lea3;

    .line 226
    .line 227
    new-instance v1, Lda3;

    .line 228
    .line 229
    invoke-direct {v1, v0}, Lda3;-><init>(Lea3;)V

    .line 230
    .line 231
    .line 232
    return-object v1

    .line 233
    :pswitch_a
    iget-object v0, p0, Lu43;->b:Lga4;

    .line 234
    .line 235
    invoke-interface {v0}, Lga4;->d()Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    move-result-object v0

    .line 239
    check-cast v0, Lx83;

    .line 240
    .line 241
    new-instance v1, Ls73;

    .line 242
    .line 243
    invoke-direct {v1, v0}, Ls73;-><init>(Lx83;)V

    .line 244
    .line 245
    .line 246
    return-object v1

    .line 247
    :pswitch_b
    iget-object v0, p0, Lu43;->b:Lga4;

    .line 248
    .line 249
    invoke-interface {v0}, Lga4;->d()Ljava/lang/Object;

    .line 250
    .line 251
    .line 252
    move-result-object v0

    .line 253
    check-cast v0, Lx83;

    .line 254
    .line 255
    new-instance v1, Ls63;

    .line 256
    .line 257
    invoke-direct {v1, v0}, Ls63;-><init>(Lx83;)V

    .line 258
    .line 259
    .line 260
    return-object v1

    .line 261
    :pswitch_c
    sget-object v0, Lmd2;->a:Lld2;

    .line 262
    .line 263
    invoke-static {v0}, Li41;->M(Ljava/lang/Object;)V

    .line 264
    .line 265
    .line 266
    iget-object v1, p0, Lu43;->b:Lga4;

    .line 267
    .line 268
    check-cast v1, Lhh2;

    .line 269
    .line 270
    invoke-virtual {v1}, Lhh2;->a()Landroid/content/Context;

    .line 271
    .line 272
    .line 273
    new-instance v1, Lg43;

    .line 274
    .line 275
    const/4 v2, 0x4

    .line 276
    invoke-direct {v1, v0, v2}, Lg43;-><init>(Lpq3;I)V

    .line 277
    .line 278
    .line 279
    return-object v1

    .line 280
    :pswitch_d
    sget-object v0, Lmd2;->a:Lld2;

    .line 281
    .line 282
    invoke-static {v0}, Li41;->M(Ljava/lang/Object;)V

    .line 283
    .line 284
    .line 285
    iget-object v1, p0, Lu43;->b:Lga4;

    .line 286
    .line 287
    check-cast v1, Lhh2;

    .line 288
    .line 289
    invoke-virtual {v1}, Lhh2;->a()Landroid/content/Context;

    .line 290
    .line 291
    .line 292
    move-result-object v1

    .line 293
    new-instance v2, Lo33;

    .line 294
    .line 295
    const/4 v3, 0x5

    .line 296
    invoke-direct {v2, v0, v1, v3}, Lo33;-><init>(Lpq3;Landroid/content/Context;I)V

    .line 297
    .line 298
    .line 299
    return-object v2

    .line 300
    :pswitch_e
    sget-object v0, Lmd2;->a:Lld2;

    .line 301
    .line 302
    invoke-static {v0}, Li41;->M(Ljava/lang/Object;)V

    .line 303
    .line 304
    .line 305
    iget-object v1, p0, Lu43;->b:Lga4;

    .line 306
    .line 307
    invoke-interface {v1}, Lga4;->d()Ljava/lang/Object;

    .line 308
    .line 309
    .line 310
    move-result-object v1

    .line 311
    check-cast v1, Lxv2;

    .line 312
    .line 313
    new-instance v2, Lg33;

    .line 314
    .line 315
    const/4 v3, 0x6

    .line 316
    invoke-direct {v2, v0, v1, v3}, Lg33;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 317
    .line 318
    .line 319
    return-object v2

    .line 320
    :pswitch_f
    sget-object v0, Lmd2;->a:Lld2;

    .line 321
    .line 322
    invoke-static {v0}, Li41;->M(Ljava/lang/Object;)V

    .line 323
    .line 324
    .line 325
    iget-object v1, p0, Lu43;->b:Lga4;

    .line 326
    .line 327
    check-cast v1, Lhh2;

    .line 328
    .line 329
    invoke-virtual {v1}, Lhh2;->a()Landroid/content/Context;

    .line 330
    .line 331
    .line 332
    move-result-object v1

    .line 333
    new-instance v2, Lg43;

    .line 334
    .line 335
    invoke-direct {v2, v1, v0}, Lg43;-><init>(Landroid/content/Context;Lpq3;)V

    .line 336
    .line 337
    .line 338
    return-object v2

    .line 339
    :pswitch_10
    iget-object v0, p0, Lu43;->b:Lga4;

    .line 340
    .line 341
    invoke-interface {v0}, Lga4;->d()Ljava/lang/Object;

    .line 342
    .line 343
    .line 344
    move-result-object v0

    .line 345
    check-cast v0, Lz73;

    .line 346
    .line 347
    new-instance v1, Lb33;

    .line 348
    .line 349
    const/4 v2, 0x4

    .line 350
    invoke-direct {v1, v2, v0}, Lb33;-><init>(ILjava/lang/Object;)V

    .line 351
    .line 352
    .line 353
    return-object v1

    .line 354
    :pswitch_11
    sget-object v0, Lmd2;->a:Lld2;

    .line 355
    .line 356
    invoke-static {v0}, Li41;->M(Ljava/lang/Object;)V

    .line 357
    .line 358
    .line 359
    iget-object v1, p0, Lu43;->b:Lga4;

    .line 360
    .line 361
    invoke-interface {v1}, Lga4;->d()Ljava/lang/Object;

    .line 362
    .line 363
    .line 364
    move-result-object v1

    .line 365
    check-cast v1, Lzw2;

    .line 366
    .line 367
    new-instance v2, Lg33;

    .line 368
    .line 369
    const/4 v3, 0x5

    .line 370
    invoke-direct {v2, v0, v1, v3}, Lg33;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 371
    .line 372
    .line 373
    return-object v2

    .line 374
    nop

    .line 375
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
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
