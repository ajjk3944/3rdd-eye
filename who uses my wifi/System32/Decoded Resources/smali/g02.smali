.class public final Lg02;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lca4;


# instance fields
.field public final synthetic a:I

.field public final b:Lba4;

.field public final c:Lga4;

.field public final d:Lga4;


# direct methods
.method public synthetic constructor <init>(Lba4;Lba4;Lba4;I)V
    .locals 0

    .line 1
    iput p4, p0, Lg02;->a:I

    iput-object p1, p0, Lg02;->b:Lba4;

    iput-object p2, p0, Lg02;->c:Lga4;

    iput-object p3, p0, Lg02;->d:Lga4;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lga4;Lga4;Lba4;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lg02;->a:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg02;->c:Lga4;

    iput-object p2, p0, Lg02;->d:Lga4;

    iput-object p3, p0, Lg02;->b:Lba4;

    return-void
.end method


# virtual methods
.method public final d()Ljava/lang/Object;
    .locals 7

    .line 1
    iget v0, p0, Lg02;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lg02;->b:Lba4;

    .line 7
    .line 8
    invoke-virtual {v0}, Lba4;->d()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Ljava/io/File;

    .line 13
    .line 14
    iget-object v1, p0, Lg02;->c:Lga4;

    .line 15
    .line 16
    invoke-interface {v1}, Lga4;->d()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, Lmg3;

    .line 21
    .line 22
    iget-object v2, p0, Lg02;->d:Lga4;

    .line 23
    .line 24
    invoke-interface {v2}, Lga4;->d()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    check-cast v2, Lgk3;

    .line 29
    .line 30
    const/4 v3, 0x0

    .line 31
    new-array v3, v3, [B

    .line 32
    .line 33
    new-instance v4, Lsj3;

    .line 34
    .line 35
    const/4 v5, 0x4

    .line 36
    invoke-direct {v4, v2, v5}, Lsj3;-><init>(Lgk3;I)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1, v0, v3, v4}, Lmg3;->a(Ljava/io/File;[BLjava/util/function/Function;)Llg3;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    return-object v0

    .line 44
    :pswitch_0
    iget-object v0, p0, Lg02;->b:Lba4;

    .line 45
    .line 46
    invoke-virtual {v0}, Lba4;->d()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    check-cast v0, Ljava/io/File;

    .line 51
    .line 52
    iget-object v1, p0, Lg02;->c:Lga4;

    .line 53
    .line 54
    invoke-interface {v1}, Lga4;->d()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    check-cast v1, Lmg3;

    .line 59
    .line 60
    iget-object v2, p0, Lg02;->d:Lga4;

    .line 61
    .line 62
    invoke-interface {v2}, Lga4;->d()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    check-cast v2, Lgk3;

    .line 67
    .line 68
    const/4 v3, 0x0

    .line 69
    new-array v3, v3, [B

    .line 70
    .line 71
    new-instance v4, Lsj3;

    .line 72
    .line 73
    const/4 v5, 0x3

    .line 74
    invoke-direct {v4, v2, v5}, Lsj3;-><init>(Lgk3;I)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v1, v0, v3, v4}, Lmg3;->a(Ljava/io/File;[BLjava/util/function/Function;)Llg3;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    return-object v0

    .line 82
    :pswitch_1
    iget-object v0, p0, Lg02;->b:Lba4;

    .line 83
    .line 84
    invoke-virtual {v0}, Lba4;->d()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    check-cast v0, Ljava/io/File;

    .line 89
    .line 90
    iget-object v1, p0, Lg02;->c:Lga4;

    .line 91
    .line 92
    invoke-interface {v1}, Lga4;->d()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    check-cast v1, Lmg3;

    .line 97
    .line 98
    iget-object v2, p0, Lg02;->d:Lga4;

    .line 99
    .line 100
    invoke-interface {v2}, Lga4;->d()Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    check-cast v2, Lgk3;

    .line 105
    .line 106
    invoke-static {}, Ljh3;->E()Ljh3;

    .line 107
    .line 108
    .line 109
    move-result-object v3

    .line 110
    new-instance v4, Lsj3;

    .line 111
    .line 112
    const/4 v5, 0x5

    .line 113
    invoke-direct {v4, v2, v5}, Lsj3;-><init>(Lgk3;I)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 117
    .line 118
    .line 119
    new-instance v2, Llg3;

    .line 120
    .line 121
    new-instance v5, Lzs1;

    .line 122
    .line 123
    const/16 v6, 0x1d

    .line 124
    .line 125
    invoke-direct {v5, v6, v3}, Lzs1;-><init>(ILjava/lang/Object;)V

    .line 126
    .line 127
    .line 128
    iget-object v1, v1, Lmg3;->a:Ljava/util/concurrent/ExecutorService;

    .line 129
    .line 130
    invoke-direct {v2, v0, v1, v5, v4}, Llg3;-><init>(Ljava/io/File;Ljava/util/concurrent/ExecutorService;Lkg3;Ljava/util/function/Function;)V

    .line 131
    .line 132
    .line 133
    return-object v2

    .line 134
    :pswitch_2
    iget-object v0, p0, Lg02;->b:Lba4;

    .line 135
    .line 136
    invoke-virtual {v0}, Lba4;->d()Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    check-cast v0, Ljava/io/File;

    .line 141
    .line 142
    iget-object v1, p0, Lg02;->c:Lga4;

    .line 143
    .line 144
    invoke-interface {v1}, Lga4;->d()Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v1

    .line 148
    check-cast v1, Lmg3;

    .line 149
    .line 150
    iget-object v2, p0, Lg02;->d:Lga4;

    .line 151
    .line 152
    invoke-interface {v2}, Lga4;->d()Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v2

    .line 156
    check-cast v2, Lgk3;

    .line 157
    .line 158
    const/4 v3, 0x0

    .line 159
    new-array v3, v3, [B

    .line 160
    .line 161
    new-instance v4, Lsj3;

    .line 162
    .line 163
    const/4 v5, 0x1

    .line 164
    invoke-direct {v4, v2, v5}, Lsj3;-><init>(Lgk3;I)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {v1, v0, v3, v4}, Lmg3;->a(Ljava/io/File;[BLjava/util/function/Function;)Llg3;

    .line 168
    .line 169
    .line 170
    move-result-object v0

    .line 171
    return-object v0

    .line 172
    :pswitch_3
    iget-object v0, p0, Lg02;->b:Lba4;

    .line 173
    .line 174
    invoke-virtual {v0}, Lba4;->d()Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    check-cast v0, Ljava/io/File;

    .line 179
    .line 180
    iget-object v1, p0, Lg02;->c:Lga4;

    .line 181
    .line 182
    invoke-interface {v1}, Lga4;->d()Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object v1

    .line 186
    check-cast v1, Lmg3;

    .line 187
    .line 188
    iget-object v2, p0, Lg02;->d:Lga4;

    .line 189
    .line 190
    invoke-interface {v2}, Lga4;->d()Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object v2

    .line 194
    check-cast v2, Lgk3;

    .line 195
    .line 196
    const/4 v3, 0x0

    .line 197
    new-array v3, v3, [B

    .line 198
    .line 199
    new-instance v4, Lsj3;

    .line 200
    .line 201
    const/4 v5, 0x0

    .line 202
    invoke-direct {v4, v2, v5}, Lsj3;-><init>(Lgk3;I)V

    .line 203
    .line 204
    .line 205
    invoke-virtual {v1, v0, v3, v4}, Lmg3;->a(Ljava/io/File;[BLjava/util/function/Function;)Llg3;

    .line 206
    .line 207
    .line 208
    move-result-object v0

    .line 209
    return-object v0

    .line 210
    :pswitch_4
    iget-object v0, p0, Lg02;->b:Lba4;

    .line 211
    .line 212
    invoke-virtual {v0}, Lba4;->d()Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object v0

    .line 216
    check-cast v0, Ljava/io/File;

    .line 217
    .line 218
    iget-object v1, p0, Lg02;->c:Lga4;

    .line 219
    .line 220
    invoke-interface {v1}, Lga4;->d()Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object v1

    .line 224
    check-cast v1, Lmg3;

    .line 225
    .line 226
    iget-object v2, p0, Lg02;->d:Lga4;

    .line 227
    .line 228
    invoke-interface {v2}, Lga4;->d()Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    move-result-object v2

    .line 232
    check-cast v2, Lgk3;

    .line 233
    .line 234
    invoke-static {}, Ljh3;->E()Ljh3;

    .line 235
    .line 236
    .line 237
    move-result-object v3

    .line 238
    new-instance v4, Lsj3;

    .line 239
    .line 240
    const/4 v5, 0x2

    .line 241
    invoke-direct {v4, v2, v5}, Lsj3;-><init>(Lgk3;I)V

    .line 242
    .line 243
    .line 244
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 245
    .line 246
    .line 247
    new-instance v2, Llg3;

    .line 248
    .line 249
    new-instance v5, Lzs1;

    .line 250
    .line 251
    const/16 v6, 0x1d

    .line 252
    .line 253
    invoke-direct {v5, v6, v3}, Lzs1;-><init>(ILjava/lang/Object;)V

    .line 254
    .line 255
    .line 256
    iget-object v1, v1, Lmg3;->a:Ljava/util/concurrent/ExecutorService;

    .line 257
    .line 258
    invoke-direct {v2, v0, v1, v5, v4}, Llg3;-><init>(Ljava/io/File;Ljava/util/concurrent/ExecutorService;Lkg3;Ljava/util/function/Function;)V

    .line 259
    .line 260
    .line 261
    return-object v2

    .line 262
    :pswitch_5
    iget-object v0, p0, Lg02;->c:Lga4;

    .line 263
    .line 264
    check-cast v0, Lhh2;

    .line 265
    .line 266
    invoke-virtual {v0}, Lhh2;->a()Landroid/content/Context;

    .line 267
    .line 268
    .line 269
    iget-object v0, p0, Lg02;->d:Lga4;

    .line 270
    .line 271
    invoke-interface {v0}, Lga4;->d()Ljava/lang/Object;

    .line 272
    .line 273
    .line 274
    move-result-object v0

    .line 275
    check-cast v0, Ljava/util/concurrent/ScheduledExecutorService;

    .line 276
    .line 277
    iget-object v1, p0, Lg02;->b:Lba4;

    .line 278
    .line 279
    invoke-virtual {v1}, Lba4;->d()Ljava/lang/Object;

    .line 280
    .line 281
    .line 282
    move-result-object v1

    .line 283
    check-cast v1, Lda3;

    .line 284
    .line 285
    new-instance v1, Lf02;

    .line 286
    .line 287
    invoke-direct {v1, v0}, Lf02;-><init>(Ljava/util/concurrent/ScheduledExecutorService;)V

    .line 288
    .line 289
    .line 290
    return-object v1

    .line 291
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
