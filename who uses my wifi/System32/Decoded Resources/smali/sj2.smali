.class public final Lsj2;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lca4;


# instance fields
.field public final synthetic a:I

.field public final b:Lga4;

.field public final c:Lba4;


# direct methods
.method public synthetic constructor <init>(Lba4;Lga4;I)V
    .locals 0

    .line 1
    iput p3, p0, Lsj2;->a:I

    iput-object p1, p0, Lsj2;->c:Lba4;

    iput-object p2, p0, Lsj2;->b:Lga4;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lga4;Lba4;I)V
    .locals 0

    .line 2
    iput p3, p0, Lsj2;->a:I

    iput-object p1, p0, Lsj2;->b:Lga4;

    iput-object p2, p0, Lsj2;->c:Lba4;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lw13;
    .locals 3

    .line 1
    iget-object v0, p0, Lsj2;->c:Lba4;

    .line 2
    .line 3
    invoke-virtual {v0}, Lba4;->d()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lh23;

    .line 8
    .line 9
    iget-object v1, p0, Lsj2;->b:Lga4;

    .line 10
    .line 11
    invoke-interface {v1}, Lga4;->d()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    check-cast v1, Lyu2;

    .line 16
    .line 17
    new-instance v2, Lw13;

    .line 18
    .line 19
    invoke-direct {v2, v0, v1}, Lw13;-><init>(Lh23;Lyu2;)V

    .line 20
    .line 21
    .line 22
    return-object v2
.end method

.method public final d()Ljava/lang/Object;
    .locals 5

    .line 1
    iget v0, p0, Lsj2;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lsj2;->b:Lga4;

    .line 7
    .line 8
    invoke-interface {v0}, Lga4;->d()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Landroid/content/Context;

    .line 13
    .line 14
    iget-object v1, p0, Lsj2;->c:Lba4;

    .line 15
    .line 16
    invoke-virtual {v1}, Lba4;->d()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, Lgd3;

    .line 21
    .line 22
    invoke-static {v0, v1}, Lgi2;->J(Landroid/content/Context;Lgd3;)Lav1;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    return-object v0

    .line 27
    :pswitch_0
    iget-object v0, p0, Lsj2;->c:Lba4;

    .line 28
    .line 29
    invoke-virtual {v0}, Lba4;->d()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    check-cast v0, Ln70;

    .line 34
    .line 35
    sget-object v1, Lmd2;->a:Lld2;

    .line 36
    .line 37
    invoke-static {v1}, Li41;->M(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    iget-object v2, p0, Lsj2;->b:Lga4;

    .line 41
    .line 42
    invoke-interface {v2}, Lga4;->d()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    check-cast v2, Ljava/util/concurrent/ScheduledExecutorService;

    .line 47
    .line 48
    new-instance v3, Lk33;

    .line 49
    .line 50
    const/4 v4, 0x0

    .line 51
    invoke-direct {v3, v0, v1, v2, v4}, Lk33;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 52
    .line 53
    .line 54
    return-object v3

    .line 55
    :pswitch_1
    invoke-virtual {p0}, Lsj2;->a()Lw13;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    return-object v0

    .line 60
    :pswitch_2
    iget-object v0, p0, Lsj2;->c:Lba4;

    .line 61
    .line 62
    invoke-virtual {v0}, Lba4;->d()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    check-cast v0, Lpo2;

    .line 67
    .line 68
    iget-object v1, p0, Lsj2;->b:Lga4;

    .line 69
    .line 70
    invoke-interface {v1}, Lga4;->d()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    check-cast v1, Ljava/util/concurrent/Executor;

    .line 75
    .line 76
    new-instance v2, Lup2;

    .line 77
    .line 78
    invoke-direct {v2, v0, v1}, Lup2;-><init>(Ljava/lang/Object;Ljava/util/concurrent/Executor;)V

    .line 79
    .line 80
    .line 81
    return-object v2

    .line 82
    :pswitch_3
    iget-object v0, p0, Lsj2;->c:Lba4;

    .line 83
    .line 84
    invoke-virtual {v0}, Lba4;->d()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    check-cast v0, Lpo2;

    .line 89
    .line 90
    iget-object v1, p0, Lsj2;->b:Lga4;

    .line 91
    .line 92
    invoke-interface {v1}, Lga4;->d()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    check-cast v1, Ljava/util/concurrent/Executor;

    .line 97
    .line 98
    new-instance v2, Lup2;

    .line 99
    .line 100
    invoke-direct {v2, v0, v1}, Lup2;-><init>(Ljava/lang/Object;Ljava/util/concurrent/Executor;)V

    .line 101
    .line 102
    .line 103
    return-object v2

    .line 104
    :pswitch_4
    iget-object v0, p0, Lsj2;->c:Lba4;

    .line 105
    .line 106
    invoke-virtual {v0}, Lba4;->d()Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    check-cast v0, Lpo2;

    .line 111
    .line 112
    iget-object v1, p0, Lsj2;->b:Lga4;

    .line 113
    .line 114
    invoke-interface {v1}, Lga4;->d()Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v1

    .line 118
    check-cast v1, Ljava/util/concurrent/Executor;

    .line 119
    .line 120
    new-instance v2, Lup2;

    .line 121
    .line 122
    invoke-direct {v2, v0, v1}, Lup2;-><init>(Ljava/lang/Object;Ljava/util/concurrent/Executor;)V

    .line 123
    .line 124
    .line 125
    return-object v2

    .line 126
    :pswitch_5
    iget-object v0, p0, Lsj2;->c:Lba4;

    .line 127
    .line 128
    invoke-virtual {v0}, Lba4;->d()Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    check-cast v0, Lpo2;

    .line 133
    .line 134
    iget-object v1, p0, Lsj2;->b:Lga4;

    .line 135
    .line 136
    invoke-interface {v1}, Lga4;->d()Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v1

    .line 140
    check-cast v1, Ljava/util/concurrent/Executor;

    .line 141
    .line 142
    new-instance v2, Lup2;

    .line 143
    .line 144
    invoke-direct {v2, v0, v1}, Lup2;-><init>(Ljava/lang/Object;Ljava/util/concurrent/Executor;)V

    .line 145
    .line 146
    .line 147
    return-object v2

    .line 148
    :pswitch_6
    iget-object v0, p0, Lsj2;->c:Lba4;

    .line 149
    .line 150
    invoke-virtual {v0}, Lba4;->d()Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    check-cast v0, Lpo2;

    .line 155
    .line 156
    iget-object v1, p0, Lsj2;->b:Lga4;

    .line 157
    .line 158
    invoke-interface {v1}, Lga4;->d()Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object v1

    .line 162
    check-cast v1, Ljava/util/concurrent/Executor;

    .line 163
    .line 164
    new-instance v2, Lup2;

    .line 165
    .line 166
    invoke-direct {v2, v0, v1}, Lup2;-><init>(Ljava/lang/Object;Ljava/util/concurrent/Executor;)V

    .line 167
    .line 168
    .line 169
    return-object v2

    .line 170
    :pswitch_7
    iget-object v0, p0, Lsj2;->c:Lba4;

    .line 171
    .line 172
    invoke-virtual {v0}, Lba4;->d()Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    check-cast v0, Lpo2;

    .line 177
    .line 178
    iget-object v1, p0, Lsj2;->b:Lga4;

    .line 179
    .line 180
    invoke-interface {v1}, Lga4;->d()Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v1

    .line 184
    check-cast v1, Ljava/util/concurrent/Executor;

    .line 185
    .line 186
    new-instance v2, Lup2;

    .line 187
    .line 188
    invoke-direct {v2, v0, v1}, Lup2;-><init>(Ljava/lang/Object;Ljava/util/concurrent/Executor;)V

    .line 189
    .line 190
    .line 191
    return-object v2

    .line 192
    :pswitch_8
    iget-object v0, p0, Lsj2;->c:Lba4;

    .line 193
    .line 194
    invoke-virtual {v0}, Lba4;->d()Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object v0

    .line 198
    check-cast v0, Lpo2;

    .line 199
    .line 200
    iget-object v1, p0, Lsj2;->b:Lga4;

    .line 201
    .line 202
    invoke-interface {v1}, Lga4;->d()Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object v1

    .line 206
    check-cast v1, Ljava/util/concurrent/Executor;

    .line 207
    .line 208
    new-instance v2, Lup2;

    .line 209
    .line 210
    invoke-direct {v2, v0, v1}, Lup2;-><init>(Ljava/lang/Object;Ljava/util/concurrent/Executor;)V

    .line 211
    .line 212
    .line 213
    return-object v2

    .line 214
    :pswitch_9
    iget-object v0, p0, Lsj2;->c:Lba4;

    .line 215
    .line 216
    invoke-virtual {v0}, Lba4;->d()Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    move-result-object v0

    .line 220
    check-cast v0, Lpo2;

    .line 221
    .line 222
    iget-object v1, p0, Lsj2;->b:Lga4;

    .line 223
    .line 224
    invoke-interface {v1}, Lga4;->d()Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object v1

    .line 228
    check-cast v1, Ljava/util/concurrent/Executor;

    .line 229
    .line 230
    new-instance v2, Lup2;

    .line 231
    .line 232
    invoke-direct {v2, v0, v1}, Lup2;-><init>(Ljava/lang/Object;Ljava/util/concurrent/Executor;)V

    .line 233
    .line 234
    .line 235
    return-object v2

    .line 236
    :pswitch_a
    iget-object v0, p0, Lsj2;->b:Lga4;

    .line 237
    .line 238
    invoke-interface {v0}, Lga4;->d()Ljava/lang/Object;

    .line 239
    .line 240
    .line 241
    move-result-object v0

    .line 242
    check-cast v0, Landroid/content/Context;

    .line 243
    .line 244
    iget-object v1, p0, Lsj2;->c:Lba4;

    .line 245
    .line 246
    invoke-virtual {v1}, Lba4;->d()Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    move-result-object v1

    .line 250
    check-cast v1, Lsb2;

    .line 251
    .line 252
    new-instance v2, Lsu1;

    .line 253
    .line 254
    invoke-direct {v2, v0, v1}, Lsu1;-><init>(Landroid/content/Context;Lsb2;)V

    .line 255
    .line 256
    .line 257
    return-object v2

    .line 258
    :pswitch_b
    iget-object v0, p0, Lsj2;->b:Lga4;

    .line 259
    .line 260
    invoke-interface {v0}, Lga4;->d()Ljava/lang/Object;

    .line 261
    .line 262
    .line 263
    move-result-object v0

    .line 264
    check-cast v0, Lym;

    .line 265
    .line 266
    iget-object v1, p0, Lsj2;->c:Lba4;

    .line 267
    .line 268
    invoke-virtual {v1}, Lba4;->d()Ljava/lang/Object;

    .line 269
    .line 270
    .line 271
    move-result-object v1

    .line 272
    check-cast v1, Ldd2;

    .line 273
    .line 274
    new-instance v2, Lrl2;

    .line 275
    .line 276
    invoke-direct {v2, v0, v1}, Lrl2;-><init>(Lym;Ldd2;)V

    .line 277
    .line 278
    .line 279
    return-object v2

    .line 280
    :pswitch_c
    iget-object v0, p0, Lsj2;->b:Lga4;

    .line 281
    .line 282
    check-cast v0, Lhh2;

    .line 283
    .line 284
    invoke-virtual {v0}, Lhh2;->a()Landroid/content/Context;

    .line 285
    .line 286
    .line 287
    move-result-object v0

    .line 288
    iget-object v1, p0, Lsj2;->c:Lba4;

    .line 289
    .line 290
    invoke-virtual {v1}, Lba4;->d()Ljava/lang/Object;

    .line 291
    .line 292
    .line 293
    move-result-object v1

    .line 294
    check-cast v1, Lmv1;

    .line 295
    .line 296
    new-instance v2, Lrj2;

    .line 297
    .line 298
    invoke-direct {v2, v0, v1}, Lrj2;-><init>(Landroid/content/Context;Lmv1;)V

    .line 299
    .line 300
    .line 301
    return-object v2

    .line 302
    nop

    .line 303
    :pswitch_data_0
    .packed-switch 0x0
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
