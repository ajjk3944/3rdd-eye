.class public final Lsw2;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lca4;


# instance fields
.field public final synthetic a:I

.field public final b:Lba4;


# direct methods
.method public synthetic constructor <init>(Lba4;I)V
    .locals 0

    .line 1
    iput p2, p0, Lsw2;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lsw2;->b:Lba4;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final d()Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, Lsw2;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lsw2;->b:Lba4;

    .line 7
    .line 8
    invoke-virtual {v0}, Lba4;->d()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Lpv2;

    .line 13
    .line 14
    new-instance v1, Loh4;

    .line 15
    .line 16
    invoke-direct {v1, v0}, Loh4;-><init>(Lpv2;)V

    .line 17
    .line 18
    .line 19
    return-object v1

    .line 20
    :pswitch_0
    iget-object v0, p0, Lsw2;->b:Lba4;

    .line 21
    .line 22
    invoke-virtual {v0}, Lba4;->d()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    check-cast v0, Lrf3;

    .line 27
    .line 28
    new-instance v0, Lck3;

    .line 29
    .line 30
    invoke-direct {v0}, Lck3;-><init>()V

    .line 31
    .line 32
    .line 33
    return-object v0

    .line 34
    :pswitch_1
    iget-object v0, p0, Lsw2;->b:Lba4;

    .line 35
    .line 36
    invoke-virtual {v0}, Lba4;->d()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    check-cast v0, Lgk3;

    .line 41
    .line 42
    new-instance v1, Lwh3;

    .line 43
    .line 44
    invoke-direct {v1, v0}, Lwh3;-><init>(Lgk3;)V

    .line 45
    .line 46
    .line 47
    return-object v1

    .line 48
    :pswitch_2
    iget-object v0, p0, Lsw2;->b:Lba4;

    .line 49
    .line 50
    invoke-virtual {v0}, Lba4;->d()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    check-cast v0, Ljz2;

    .line 55
    .line 56
    new-instance v1, Lbb3;

    .line 57
    .line 58
    invoke-direct {v1, v0}, Lbb3;-><init>(Ljz2;)V

    .line 59
    .line 60
    .line 61
    return-object v1

    .line 62
    :pswitch_3
    iget-object v0, p0, Lsw2;->b:Lba4;

    .line 63
    .line 64
    invoke-virtual {v0}, Lba4;->d()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    check-cast v0, Ljava/util/concurrent/ThreadFactory;

    .line 69
    .line 70
    const/4 v1, 0x1

    .line 71
    invoke-static {v1, v0}, Ljava/util/concurrent/Executors;->newScheduledThreadPool(ILjava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ScheduledExecutorService;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    invoke-static {v0}, Ljava/util/concurrent/Executors;->unconfigurableScheduledExecutorService(Ljava/util/concurrent/ScheduledExecutorService;)Ljava/util/concurrent/ScheduledExecutorService;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    invoke-static {v0}, Li41;->M(Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    return-object v0

    .line 83
    :pswitch_4
    iget-object v0, p0, Lsw2;->b:Lba4;

    .line 84
    .line 85
    invoke-virtual {v0}, Lba4;->d()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    check-cast v0, Lw83;

    .line 90
    .line 91
    new-instance v1, Lup2;

    .line 92
    .line 93
    sget-object v2, Lmd2;->g:Lld2;

    .line 94
    .line 95
    invoke-direct {v1, v0, v2}, Lup2;-><init>(Ljava/lang/Object;Ljava/util/concurrent/Executor;)V

    .line 96
    .line 97
    .line 98
    return-object v1

    .line 99
    :pswitch_5
    iget-object v0, p0, Lsw2;->b:Lba4;

    .line 100
    .line 101
    invoke-virtual {v0}, Lba4;->d()Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    check-cast v0, Lvs1;

    .line 106
    .line 107
    new-instance v1, Lm83;

    .line 108
    .line 109
    invoke-direct {v1, v0}, Lm83;-><init>(Lvs1;)V

    .line 110
    .line 111
    .line 112
    return-object v1

    .line 113
    :pswitch_6
    iget-object v0, p0, Lsw2;->b:Lba4;

    .line 114
    .line 115
    invoke-virtual {v0}, Lba4;->d()Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    check-cast v0, Ldz2;

    .line 120
    .line 121
    sget-object v1, Lmd2;->a:Lld2;

    .line 122
    .line 123
    invoke-static {v1}, Li41;->M(Ljava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    new-instance v2, Lup2;

    .line 127
    .line 128
    invoke-direct {v2, v0, v1}, Lup2;-><init>(Ljava/lang/Object;Ljava/util/concurrent/Executor;)V

    .line 129
    .line 130
    .line 131
    return-object v2

    .line 132
    :pswitch_7
    iget-object v0, p0, Lsw2;->b:Lba4;

    .line 133
    .line 134
    invoke-virtual {v0}, Lba4;->d()Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    check-cast v0, Ldz2;

    .line 139
    .line 140
    sget-object v1, Lmd2;->a:Lld2;

    .line 141
    .line 142
    invoke-static {v1}, Li41;->M(Ljava/lang/Object;)V

    .line 143
    .line 144
    .line 145
    new-instance v2, Lup2;

    .line 146
    .line 147
    invoke-direct {v2, v0, v1}, Lup2;-><init>(Ljava/lang/Object;Ljava/util/concurrent/Executor;)V

    .line 148
    .line 149
    .line 150
    return-object v2

    .line 151
    :pswitch_8
    iget-object v0, p0, Lsw2;->b:Lba4;

    .line 152
    .line 153
    invoke-virtual {v0}, Lba4;->d()Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    check-cast v0, Landroid/content/Context;

    .line 158
    .line 159
    sget-object v1, Lmd2;->a:Lld2;

    .line 160
    .line 161
    invoke-static {v1}, Li41;->M(Ljava/lang/Object;)V

    .line 162
    .line 163
    .line 164
    new-instance v2, Lay2;

    .line 165
    .line 166
    const/4 v3, 0x0

    .line 167
    invoke-direct {v2, v0, v1, v3}, Lay2;-><init>(Landroid/content/Context;Lld2;I)V

    .line 168
    .line 169
    .line 170
    return-object v2

    .line 171
    :pswitch_9
    iget-object v0, p0, Lsw2;->b:Lba4;

    .line 172
    .line 173
    invoke-virtual {v0}, Lba4;->d()Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v0

    .line 177
    check-cast v0, Lix2;

    .line 178
    .line 179
    new-instance v1, Lup2;

    .line 180
    .line 181
    sget-object v2, Lmd2;->g:Lld2;

    .line 182
    .line 183
    invoke-direct {v1, v0, v2}, Lup2;-><init>(Ljava/lang/Object;Ljava/util/concurrent/Executor;)V

    .line 184
    .line 185
    .line 186
    return-object v1

    .line 187
    :pswitch_a
    iget-object v0, p0, Lsw2;->b:Lba4;

    .line 188
    .line 189
    invoke-virtual {v0}, Lba4;->d()Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    move-result-object v0

    .line 193
    check-cast v0, Lix2;

    .line 194
    .line 195
    new-instance v1, Lup2;

    .line 196
    .line 197
    sget-object v2, Lmd2;->g:Lld2;

    .line 198
    .line 199
    invoke-direct {v1, v0, v2}, Lup2;-><init>(Ljava/lang/Object;Ljava/util/concurrent/Executor;)V

    .line 200
    .line 201
    .line 202
    return-object v1

    .line 203
    :pswitch_b
    iget-object v0, p0, Lsw2;->b:Lba4;

    .line 204
    .line 205
    invoke-virtual {v0}, Lba4;->d()Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object v0

    .line 209
    check-cast v0, Lix2;

    .line 210
    .line 211
    new-instance v1, Lup2;

    .line 212
    .line 213
    sget-object v2, Lmd2;->g:Lld2;

    .line 214
    .line 215
    invoke-direct {v1, v0, v2}, Lup2;-><init>(Ljava/lang/Object;Ljava/util/concurrent/Executor;)V

    .line 216
    .line 217
    .line 218
    return-object v1

    .line 219
    :pswitch_c
    iget-object v0, p0, Lsw2;->b:Lba4;

    .line 220
    .line 221
    invoke-virtual {v0}, Lba4;->d()Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    move-result-object v0

    .line 225
    check-cast v0, Lrw2;

    .line 226
    .line 227
    sget-object v1, Lmd2;->a:Lld2;

    .line 228
    .line 229
    invoke-static {v1}, Li41;->M(Ljava/lang/Object;)V

    .line 230
    .line 231
    .line 232
    new-instance v2, Lup2;

    .line 233
    .line 234
    invoke-direct {v2, v0, v1}, Lup2;-><init>(Ljava/lang/Object;Ljava/util/concurrent/Executor;)V

    .line 235
    .line 236
    .line 237
    return-object v2

    .line 238
    :pswitch_d
    iget-object v0, p0, Lsw2;->b:Lba4;

    .line 239
    .line 240
    invoke-virtual {v0}, Lba4;->d()Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    move-result-object v0

    .line 244
    check-cast v0, Lrw2;

    .line 245
    .line 246
    sget-object v1, Lmd2;->a:Lld2;

    .line 247
    .line 248
    invoke-static {v1}, Li41;->M(Ljava/lang/Object;)V

    .line 249
    .line 250
    .line 251
    new-instance v2, Lup2;

    .line 252
    .line 253
    invoke-direct {v2, v0, v1}, Lup2;-><init>(Ljava/lang/Object;Ljava/util/concurrent/Executor;)V

    .line 254
    .line 255
    .line 256
    return-object v2

    .line 257
    :pswitch_e
    iget-object v0, p0, Lsw2;->b:Lba4;

    .line 258
    .line 259
    invoke-virtual {v0}, Lba4;->d()Ljava/lang/Object;

    .line 260
    .line 261
    .line 262
    move-result-object v0

    .line 263
    check-cast v0, Lrw2;

    .line 264
    .line 265
    sget-object v1, Lmd2;->a:Lld2;

    .line 266
    .line 267
    invoke-static {v1}, Li41;->M(Ljava/lang/Object;)V

    .line 268
    .line 269
    .line 270
    new-instance v2, Lup2;

    .line 271
    .line 272
    invoke-direct {v2, v0, v1}, Lup2;-><init>(Ljava/lang/Object;Ljava/util/concurrent/Executor;)V

    .line 273
    .line 274
    .line 275
    return-object v2

    .line 276
    nop

    .line 277
    :pswitch_data_0
    .packed-switch 0x0
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
