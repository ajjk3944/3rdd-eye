.class public final Li03;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lca4;


# instance fields
.field public final synthetic a:I

.field public final b:Lba4;

.field public final c:Lga4;

.field public final d:Lqm2;

.field public final e:Lga4;

.field public final f:Lda4;

.field public final g:Lba4;

.field public final h:Lga4;

.field public final i:Lba4;

.field public final j:Lga4;


# direct methods
.method public synthetic constructor <init>(Lba4;Lph2;Lqm2;Lba4;Lda4;Lba4;Lba4;Lba4;Lba4;I)V
    .locals 0

    .line 1
    iput p10, p0, Li03;->a:I

    iput-object p1, p0, Li03;->b:Lba4;

    iput-object p2, p0, Li03;->c:Lga4;

    iput-object p3, p0, Li03;->d:Lqm2;

    iput-object p4, p0, Li03;->e:Lga4;

    iput-object p5, p0, Li03;->f:Lda4;

    iput-object p6, p0, Li03;->g:Lba4;

    iput-object p7, p0, Li03;->h:Lga4;

    iput-object p8, p0, Li03;->i:Lba4;

    iput-object p9, p0, Li03;->j:Lga4;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lda4;Lba4;Lba4;Lba4;Lqm2;Lph2;Lba4;Lba4;Lba4;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Li03;->a:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li03;->f:Lda4;

    iput-object p2, p0, Li03;->b:Lba4;

    iput-object p3, p0, Li03;->c:Lga4;

    iput-object p4, p0, Li03;->g:Lba4;

    iput-object p5, p0, Li03;->d:Lqm2;

    iput-object p6, p0, Li03;->e:Lga4;

    iput-object p7, p0, Li03;->h:Lga4;

    iput-object p8, p0, Li03;->i:Lba4;

    iput-object p9, p0, Li03;->j:Lga4;

    return-void
.end method


# virtual methods
.method public final d()Ljava/lang/Object;
    .locals 12

    .line 1
    iget v0, p0, Li03;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Li03;->b:Lba4;

    .line 7
    .line 8
    invoke-virtual {v0}, Lba4;->d()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    move-object v2, v0

    .line 13
    check-cast v2, Landroid/content/Context;

    .line 14
    .line 15
    iget-object v0, p0, Li03;->c:Lga4;

    .line 16
    .line 17
    check-cast v0, Lph2;

    .line 18
    .line 19
    invoke-virtual {v0}, Lph2;->a()Le51;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    iget-object v0, p0, Li03;->d:Lqm2;

    .line 24
    .line 25
    invoke-virtual {v0}, Lqm2;->a()Ll83;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    iget-object v0, p0, Li03;->e:Lga4;

    .line 30
    .line 31
    invoke-interface {v0}, Lga4;->d()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    move-object v5, v0

    .line 36
    check-cast v5, Ljava/util/concurrent/Executor;

    .line 37
    .line 38
    iget-object v0, p0, Li03;->f:Lda4;

    .line 39
    .line 40
    iget-object v0, v0, Lda4;->a:Ljava/lang/Object;

    .line 41
    .line 42
    move-object v6, v0

    .line 43
    check-cast v6, Lji2;

    .line 44
    .line 45
    iget-object v0, p0, Li03;->g:Lba4;

    .line 46
    .line 47
    invoke-virtual {v0}, Lba4;->d()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    move-object v7, v0

    .line 52
    check-cast v7, Lpu2;

    .line 53
    .line 54
    new-instance v8, Le42;

    .line 55
    .line 56
    invoke-direct {v8}, Le42;-><init>()V

    .line 57
    .line 58
    .line 59
    iget-object v0, p0, Li03;->h:Lga4;

    .line 60
    .line 61
    invoke-interface {v0}, Lga4;->d()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    move-object v9, v0

    .line 66
    check-cast v9, Lpz2;

    .line 67
    .line 68
    iget-object v0, p0, Li03;->i:Lba4;

    .line 69
    .line 70
    invoke-virtual {v0}, Lba4;->d()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    move-object v10, v0

    .line 75
    check-cast v10, Ljv2;

    .line 76
    .line 77
    iget-object v0, p0, Li03;->j:Lga4;

    .line 78
    .line 79
    invoke-interface {v0}, Lga4;->d()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    move-object v11, v0

    .line 84
    check-cast v11, Lmv2;

    .line 85
    .line 86
    new-instance v1, Ly03;

    .line 87
    .line 88
    invoke-direct/range {v1 .. v11}, Ly03;-><init>(Landroid/content/Context;Le51;Ll83;Ljava/util/concurrent/Executor;Lji2;Lpu2;Le42;Lpz2;Ljv2;Lmv2;)V

    .line 89
    .line 90
    .line 91
    return-object v1

    .line 92
    :pswitch_0
    iget-object v0, p0, Li03;->b:Lba4;

    .line 93
    .line 94
    invoke-virtual {v0}, Lba4;->d()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    move-object v2, v0

    .line 99
    check-cast v2, Landroid/content/Context;

    .line 100
    .line 101
    iget-object v0, p0, Li03;->c:Lga4;

    .line 102
    .line 103
    check-cast v0, Lph2;

    .line 104
    .line 105
    invoke-virtual {v0}, Lph2;->a()Le51;

    .line 106
    .line 107
    .line 108
    move-result-object v3

    .line 109
    iget-object v0, p0, Li03;->d:Lqm2;

    .line 110
    .line 111
    invoke-virtual {v0}, Lqm2;->a()Ll83;

    .line 112
    .line 113
    .line 114
    move-result-object v4

    .line 115
    iget-object v0, p0, Li03;->e:Lga4;

    .line 116
    .line 117
    invoke-interface {v0}, Lga4;->d()Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    move-object v5, v0

    .line 122
    check-cast v5, Ljava/util/concurrent/Executor;

    .line 123
    .line 124
    iget-object v0, p0, Li03;->f:Lda4;

    .line 125
    .line 126
    iget-object v0, v0, Lda4;->a:Ljava/lang/Object;

    .line 127
    .line 128
    move-object v6, v0

    .line 129
    check-cast v6, Lei2;

    .line 130
    .line 131
    iget-object v0, p0, Li03;->g:Lba4;

    .line 132
    .line 133
    invoke-virtual {v0}, Lba4;->d()Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    move-object v7, v0

    .line 138
    check-cast v7, Lpu2;

    .line 139
    .line 140
    new-instance v8, Le42;

    .line 141
    .line 142
    invoke-direct {v8}, Le42;-><init>()V

    .line 143
    .line 144
    .line 145
    iget-object v0, p0, Li03;->h:Lga4;

    .line 146
    .line 147
    invoke-interface {v0}, Lga4;->d()Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    move-object v9, v0

    .line 152
    check-cast v9, Lpz2;

    .line 153
    .line 154
    iget-object v0, p0, Li03;->i:Lba4;

    .line 155
    .line 156
    invoke-virtual {v0}, Lba4;->d()Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    move-object v10, v0

    .line 161
    check-cast v10, Ljv2;

    .line 162
    .line 163
    iget-object v0, p0, Li03;->j:Lga4;

    .line 164
    .line 165
    invoke-interface {v0}, Lga4;->d()Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    move-object v11, v0

    .line 170
    check-cast v11, Lmv2;

    .line 171
    .line 172
    new-instance v1, Ly03;

    .line 173
    .line 174
    invoke-direct/range {v1 .. v11}, Ly03;-><init>(Landroid/content/Context;Le51;Ll83;Ljava/util/concurrent/Executor;Lei2;Lpu2;Le42;Lpz2;Ljv2;Lmv2;)V

    .line 175
    .line 176
    .line 177
    return-object v1

    .line 178
    :pswitch_1
    iget-object v0, p0, Li03;->f:Lda4;

    .line 179
    .line 180
    iget-object v0, v0, Lda4;->a:Ljava/lang/Object;

    .line 181
    .line 182
    move-object v2, v0

    .line 183
    check-cast v2, Lzh2;

    .line 184
    .line 185
    iget-object v0, p0, Li03;->b:Lba4;

    .line 186
    .line 187
    invoke-virtual {v0}, Lba4;->d()Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object v0

    .line 191
    check-cast v0, Landroid/content/Context;

    .line 192
    .line 193
    iget-object v0, p0, Li03;->c:Lga4;

    .line 194
    .line 195
    invoke-interface {v0}, Lga4;->d()Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    move-result-object v0

    .line 199
    move-object v3, v0

    .line 200
    check-cast v3, Ljava/util/concurrent/Executor;

    .line 201
    .line 202
    iget-object v0, p0, Li03;->g:Lba4;

    .line 203
    .line 204
    invoke-virtual {v0}, Lba4;->d()Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object v0

    .line 208
    move-object v4, v0

    .line 209
    check-cast v4, Lpu2;

    .line 210
    .line 211
    iget-object v0, p0, Li03;->d:Lqm2;

    .line 212
    .line 213
    invoke-virtual {v0}, Lqm2;->a()Ll83;

    .line 214
    .line 215
    .line 216
    move-result-object v5

    .line 217
    iget-object v0, p0, Li03;->e:Lga4;

    .line 218
    .line 219
    check-cast v0, Lph2;

    .line 220
    .line 221
    invoke-virtual {v0}, Lph2;->a()Le51;

    .line 222
    .line 223
    .line 224
    move-result-object v6

    .line 225
    new-instance v7, Le42;

    .line 226
    .line 227
    invoke-direct {v7}, Le42;-><init>()V

    .line 228
    .line 229
    .line 230
    iget-object v0, p0, Li03;->h:Lga4;

    .line 231
    .line 232
    invoke-interface {v0}, Lga4;->d()Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    move-result-object v0

    .line 236
    move-object v8, v0

    .line 237
    check-cast v8, Lpz2;

    .line 238
    .line 239
    iget-object v0, p0, Li03;->i:Lba4;

    .line 240
    .line 241
    invoke-virtual {v0}, Lba4;->d()Ljava/lang/Object;

    .line 242
    .line 243
    .line 244
    move-result-object v0

    .line 245
    move-object v9, v0

    .line 246
    check-cast v9, Ljv2;

    .line 247
    .line 248
    iget-object v0, p0, Li03;->j:Lga4;

    .line 249
    .line 250
    invoke-interface {v0}, Lga4;->d()Ljava/lang/Object;

    .line 251
    .line 252
    .line 253
    move-result-object v0

    .line 254
    move-object v10, v0

    .line 255
    check-cast v10, Lmv2;

    .line 256
    .line 257
    new-instance v1, Lh03;

    .line 258
    .line 259
    invoke-direct/range {v1 .. v10}, Lh03;-><init>(Lzh2;Ljava/util/concurrent/Executor;Lpu2;Ll83;Le51;Le42;Lpz2;Ljv2;Lmv2;)V

    .line 260
    .line 261
    .line 262
    return-object v1

    .line 263
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
