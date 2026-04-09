.class public final Li13;
.super Lj13;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final synthetic a:I

.field public final b:Lth2;

.field public final c:Lmm2;

.field public final d:Lfp2;

.field public final e:Lo13;

.field public final f:Le03;

.field public final g:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lth2;Lmm2;Lf23;Lfp2;Lo13;Le03;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Li13;->a:I

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-object p1, p0, Li13;->b:Lth2;

    iput-object p2, p0, Li13;->c:Lmm2;

    iput-object p3, p0, Li13;->g:Ljava/lang/Object;

    iput-object p4, p0, Li13;->d:Lfp2;

    iput-object p5, p0, Li13;->e:Lo13;

    iput-object p6, p0, Li13;->f:Le03;

    return-void
.end method

.method public constructor <init>(Lth2;Lmm2;Lfp2;Li83;Lo13;Le03;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Li13;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Li13;->b:Lth2;

    iput-object p2, p0, Li13;->c:Lmm2;

    iput-object p3, p0, Li13;->d:Lfp2;

    iput-object p4, p0, Li13;->g:Ljava/lang/Object;

    iput-object p5, p0, Li13;->e:Lo13;

    iput-object p6, p0, Li13;->f:Le03;

    return-void
.end method

.method public constructor <init>(Lth2;Lvq2;Lmm2;Lfp2;Lo13;Le03;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Li13;->a:I

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    iput-object p1, p0, Li13;->b:Lth2;

    iput-object p2, p0, Li13;->g:Ljava/lang/Object;

    iput-object p3, p0, Li13;->c:Lmm2;

    iput-object p4, p0, Li13;->d:Lfp2;

    iput-object p5, p0, Li13;->e:Lo13;

    iput-object p6, p0, Li13;->f:Le03;

    return-void
.end method


# virtual methods
.method public final c(Ll83;Landroid/os/Bundle;La83;Lh83;)Lq93;
    .locals 10

    .line 1
    iget v0, p0, Li13;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Li13;->c:Lmm2;

    .line 7
    .line 8
    iput-object p1, v0, Lmm2;->b:Ljava/lang/Object;

    .line 9
    .line 10
    iput-object p2, v0, Lmm2;->c:Ljava/lang/Object;

    .line 11
    .line 12
    new-instance v1, Lt83;

    .line 13
    .line 14
    const/16 v5, 0x13

    .line 15
    .line 16
    const/4 v6, 0x0

    .line 17
    iget-object v4, p0, Li13;->e:Lo13;

    .line 18
    .line 19
    move-object v3, p3

    .line 20
    move-object v2, p4

    .line 21
    invoke-direct/range {v1 .. v6}, Lt83;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 22
    .line 23
    .line 24
    iput-object v1, v0, Lmm2;->e:Ljava/lang/Object;

    .line 25
    .line 26
    sget-object p1, Lmz1;->U3:Liz1;

    .line 27
    .line 28
    sget-object p2, Ltw1;->e:Ltw1;

    .line 29
    .line 30
    iget-object p3, p2, Ltw1;->c:Lkz1;

    .line 31
    .line 32
    invoke-virtual {p3, p1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    check-cast p1, Ljava/lang/Boolean;

    .line 37
    .line 38
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    if-eqz p1, :cond_0

    .line 43
    .line 44
    iget-object p1, p0, Li13;->g:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast p1, Li83;

    .line 47
    .line 48
    if-eqz p1, :cond_0

    .line 49
    .line 50
    iput-object p1, v0, Lmm2;->d:Ljava/lang/Object;

    .line 51
    .line 52
    :cond_0
    sget-object p1, Lmz1;->V3:Liz1;

    .line 53
    .line 54
    iget-object p2, p2, Ltw1;->c:Lkz1;

    .line 55
    .line 56
    invoke-virtual {p2, p1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    check-cast p1, Ljava/lang/Boolean;

    .line 61
    .line 62
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 63
    .line 64
    .line 65
    move-result p1

    .line 66
    if-eqz p1, :cond_1

    .line 67
    .line 68
    iget-object p1, p0, Li13;->f:Le03;

    .line 69
    .line 70
    iput-object p1, v0, Lmm2;->f:Ljava/lang/Object;

    .line 71
    .line 72
    :cond_1
    iget-object p1, p0, Li13;->b:Lth2;

    .line 73
    .line 74
    iget-object v2, p1, Lth2;->b:Lth2;

    .line 75
    .line 76
    new-instance v5, Lmm2;

    .line 77
    .line 78
    invoke-direct {v5, v0}, Lmm2;-><init>(Lmm2;)V

    .line 79
    .line 80
    .line 81
    const-class p1, Lfp2;

    .line 82
    .line 83
    iget-object v4, p0, Li13;->d:Lfp2;

    .line 84
    .line 85
    invoke-static {v4, p1}, Li41;->P(Ljava/lang/Object;Ljava/lang/Class;)V

    .line 86
    .line 87
    .line 88
    new-instance v1, Lji2;

    .line 89
    .line 90
    new-instance v3, Ltv2;

    .line 91
    .line 92
    const/4 p1, 0x0

    .line 93
    const/4 p2, 0x0

    .line 94
    invoke-direct {v3, p1, p2}, Ltv2;-><init>(IB)V

    .line 95
    .line 96
    .line 97
    new-instance v6, Lf23;

    .line 98
    .line 99
    const/16 p1, 0x19

    .line 100
    .line 101
    invoke-direct {v6, p1}, Lf23;-><init>(I)V

    .line 102
    .line 103
    .line 104
    const/4 v7, 0x0

    .line 105
    const/4 v8, 0x0

    .line 106
    invoke-direct/range {v1 .. v8}, Lji2;-><init>(Lth2;Ltv2;Lfp2;Lmm2;Lf23;Lm73;Lb73;)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v1}, Lji2;->a()Lnl2;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    invoke-virtual {p1}, Lnl2;->b()Lq93;

    .line 114
    .line 115
    .line 116
    move-result-object p2

    .line 117
    invoke-virtual {p1, p2}, Lnl2;->c(Ln70;)Lq93;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    return-object p1

    .line 122
    :pswitch_0
    move-object v2, p3

    .line 123
    move-object v1, p4

    .line 124
    iget-object p3, p0, Li13;->c:Lmm2;

    .line 125
    .line 126
    iput-object p1, p3, Lmm2;->b:Ljava/lang/Object;

    .line 127
    .line 128
    iput-object p2, p3, Lmm2;->c:Ljava/lang/Object;

    .line 129
    .line 130
    new-instance v0, Lt83;

    .line 131
    .line 132
    const/16 v4, 0x13

    .line 133
    .line 134
    const/4 v5, 0x0

    .line 135
    iget-object v3, p0, Li13;->e:Lo13;

    .line 136
    .line 137
    invoke-direct/range {v0 .. v5}, Lt83;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 138
    .line 139
    .line 140
    iput-object v0, p3, Lmm2;->e:Ljava/lang/Object;

    .line 141
    .line 142
    sget-object p1, Lmz1;->V3:Liz1;

    .line 143
    .line 144
    sget-object p2, Ltw1;->e:Ltw1;

    .line 145
    .line 146
    iget-object p2, p2, Ltw1;->c:Lkz1;

    .line 147
    .line 148
    invoke-virtual {p2, p1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object p1

    .line 152
    check-cast p1, Ljava/lang/Boolean;

    .line 153
    .line 154
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 155
    .line 156
    .line 157
    move-result p1

    .line 158
    if-eqz p1, :cond_2

    .line 159
    .line 160
    iget-object p1, p0, Li13;->f:Le03;

    .line 161
    .line 162
    iput-object p1, p3, Lmm2;->f:Ljava/lang/Object;

    .line 163
    .line 164
    :cond_2
    iget-object p1, p0, Li13;->b:Lth2;

    .line 165
    .line 166
    iget-object v1, p1, Lth2;->b:Lth2;

    .line 167
    .line 168
    new-instance v4, Lmm2;

    .line 169
    .line 170
    invoke-direct {v4, p3}, Lmm2;-><init>(Lmm2;)V

    .line 171
    .line 172
    .line 173
    iget-object p1, p0, Li13;->g:Ljava/lang/Object;

    .line 174
    .line 175
    move-object v6, p1

    .line 176
    check-cast v6, Lf23;

    .line 177
    .line 178
    const-class p1, Lfp2;

    .line 179
    .line 180
    iget-object v3, p0, Li13;->d:Lfp2;

    .line 181
    .line 182
    invoke-static {v3, p1}, Li41;->P(Ljava/lang/Object;Ljava/lang/Class;)V

    .line 183
    .line 184
    .line 185
    const-class p1, Lf23;

    .line 186
    .line 187
    invoke-static {v6, p1}, Li41;->P(Ljava/lang/Object;Ljava/lang/Class;)V

    .line 188
    .line 189
    .line 190
    new-instance v0, Lei2;

    .line 191
    .line 192
    new-instance v2, Ltv2;

    .line 193
    .line 194
    const/4 p1, 0x0

    .line 195
    const/4 p2, 0x0

    .line 196
    invoke-direct {v2, p1, p2}, Ltv2;-><init>(IB)V

    .line 197
    .line 198
    .line 199
    new-instance v5, Lf23;

    .line 200
    .line 201
    const/16 p1, 0x19

    .line 202
    .line 203
    invoke-direct {v5, p1}, Lf23;-><init>(I)V

    .line 204
    .line 205
    .line 206
    const/4 v7, 0x0

    .line 207
    const/4 v8, 0x0

    .line 208
    invoke-direct/range {v0 .. v8}, Lei2;-><init>(Lth2;Ltv2;Lfp2;Lmm2;Lf23;Lf23;Lm73;Lb73;)V

    .line 209
    .line 210
    .line 211
    iget-object p1, v0, Lei2;->m:Lba4;

    .line 212
    .line 213
    invoke-virtual {p1}, Lba4;->d()Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object p1

    .line 217
    check-cast p1, Lnl2;

    .line 218
    .line 219
    invoke-virtual {p1}, Lnl2;->b()Lq93;

    .line 220
    .line 221
    .line 222
    move-result-object p2

    .line 223
    invoke-virtual {p1, p2}, Lnl2;->c(Ln70;)Lq93;

    .line 224
    .line 225
    .line 226
    move-result-object p1

    .line 227
    return-object p1

    .line 228
    :pswitch_1
    move-object v2, p3

    .line 229
    move-object v1, p4

    .line 230
    iget-object p3, p0, Li13;->c:Lmm2;

    .line 231
    .line 232
    iput-object p1, p3, Lmm2;->b:Ljava/lang/Object;

    .line 233
    .line 234
    iput-object p2, p3, Lmm2;->c:Ljava/lang/Object;

    .line 235
    .line 236
    new-instance v0, Lt83;

    .line 237
    .line 238
    const/16 v4, 0x13

    .line 239
    .line 240
    const/4 v5, 0x0

    .line 241
    iget-object v3, p0, Li13;->e:Lo13;

    .line 242
    .line 243
    invoke-direct/range {v0 .. v5}, Lt83;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 244
    .line 245
    .line 246
    iput-object v0, p3, Lmm2;->e:Ljava/lang/Object;

    .line 247
    .line 248
    sget-object p1, Lmz1;->V3:Liz1;

    .line 249
    .line 250
    sget-object p2, Ltw1;->e:Ltw1;

    .line 251
    .line 252
    iget-object p2, p2, Ltw1;->c:Lkz1;

    .line 253
    .line 254
    invoke-virtual {p2, p1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 255
    .line 256
    .line 257
    move-result-object p1

    .line 258
    check-cast p1, Ljava/lang/Boolean;

    .line 259
    .line 260
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 261
    .line 262
    .line 263
    move-result p1

    .line 264
    if-eqz p1, :cond_3

    .line 265
    .line 266
    iget-object p1, p0, Li13;->f:Le03;

    .line 267
    .line 268
    iput-object p1, p3, Lmm2;->f:Ljava/lang/Object;

    .line 269
    .line 270
    :cond_3
    iget-object p1, p0, Li13;->b:Lth2;

    .line 271
    .line 272
    iget-object v1, p1, Lth2;->b:Lth2;

    .line 273
    .line 274
    new-instance v6, Lmm2;

    .line 275
    .line 276
    invoke-direct {v6, p3}, Lmm2;-><init>(Lmm2;)V

    .line 277
    .line 278
    .line 279
    iget-object p1, p0, Li13;->g:Ljava/lang/Object;

    .line 280
    .line 281
    move-object v3, p1

    .line 282
    check-cast v3, Lvq2;

    .line 283
    .line 284
    new-instance v2, Lug0;

    .line 285
    .line 286
    const/4 p1, 0x0

    .line 287
    const/16 p2, 0x13

    .line 288
    .line 289
    invoke-direct {v2, p2, p1}, Lug0;-><init>(ILjava/lang/Object;)V

    .line 290
    .line 291
    .line 292
    const-class p1, Lfp2;

    .line 293
    .line 294
    iget-object v5, p0, Li13;->d:Lfp2;

    .line 295
    .line 296
    invoke-static {v5, p1}, Li41;->P(Ljava/lang/Object;Ljava/lang/Class;)V

    .line 297
    .line 298
    .line 299
    const-class p1, Lvq2;

    .line 300
    .line 301
    invoke-static {v3, p1}, Li41;->P(Ljava/lang/Object;Ljava/lang/Class;)V

    .line 302
    .line 303
    .line 304
    new-instance v0, Lsh2;

    .line 305
    .line 306
    new-instance v4, Ltv2;

    .line 307
    .line 308
    const/4 p1, 0x0

    .line 309
    const/4 p2, 0x0

    .line 310
    invoke-direct {v4, p1, p2}, Ltv2;-><init>(IB)V

    .line 311
    .line 312
    .line 313
    new-instance v7, Lf23;

    .line 314
    .line 315
    const/16 p1, 0x19

    .line 316
    .line 317
    invoke-direct {v7, p1}, Lf23;-><init>(I)V

    .line 318
    .line 319
    .line 320
    const/4 v8, 0x0

    .line 321
    const/4 v9, 0x0

    .line 322
    invoke-direct/range {v0 .. v9}, Lsh2;-><init>(Lth2;Lug0;Lvq2;Ltv2;Lfp2;Lmm2;Lf23;Lm73;Lb73;)V

    .line 323
    .line 324
    .line 325
    iget-object p1, v0, Lsh2;->n:Lba4;

    .line 326
    .line 327
    invoke-virtual {p1}, Lba4;->d()Ljava/lang/Object;

    .line 328
    .line 329
    .line 330
    move-result-object p1

    .line 331
    check-cast p1, Lnl2;

    .line 332
    .line 333
    invoke-virtual {p1}, Lnl2;->b()Lq93;

    .line 334
    .line 335
    .line 336
    move-result-object p2

    .line 337
    invoke-virtual {p1, p2}, Lnl2;->c(Ln70;)Lq93;

    .line 338
    .line 339
    .line 340
    move-result-object p1

    .line 341
    return-object p1

    .line 342
    nop

    .line 343
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
