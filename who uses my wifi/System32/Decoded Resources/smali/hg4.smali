.class public final Lhg4;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# static fields
.field public static final C:Lhg4;


# instance fields
.field public final A:Lxe2;

.field public final B:Lqd2;

.field public final a:Lus0;

.field public final b:Ly24;

.field public final c:Llf4;

.field public final d:Lsd2;

.field public final e:Ljd2;

.field public final f:Lnh4;

.field public final g:Lwy0;

.field public final h:Lgd2;

.field public final i:Ljd1;

.field public final j:Lbu1;

.field public final k:Lym;

.field public final l:Lue;

.field public final m:Lts0;

.field public final n:Lxz1;

.field public final o:Lus1;

.field public final p:Lug0;

.field public final q:Lqd2;

.field public final r:Lp21;

.field public final s:Lzb1;

.field public final t:Lr2;

.field public final u:Lts0;

.field public final v:Lus0;

.field public final w:Lug0;

.field public final x:Lsu2;

.field public final y:Loc2;

.field public final z:Lm30;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lhg4;

    .line 2
    .line 3
    invoke-direct {v0}, Lhg4;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lhg4;->C:Lhg4;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 29

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v1, Lus0;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    new-instance v2, Ly24;

    .line 9
    .line 10
    const/16 v3, 0x17

    .line 11
    .line 12
    invoke-direct {v2, v3}, Ly24;-><init>(I)V

    .line 13
    .line 14
    .line 15
    new-instance v3, Llf4;

    .line 16
    .line 17
    invoke-direct {v3}, Llf4;-><init>()V

    .line 18
    .line 19
    .line 20
    new-instance v4, Lsd2;

    .line 21
    .line 22
    const/4 v5, 0x3

    .line 23
    invoke-direct {v4, v5}, Lsd2;-><init>(I)V

    .line 24
    .line 25
    .line 26
    new-instance v5, Ljd2;

    .line 27
    .line 28
    invoke-direct {v5}, Ljd2;-><init>()V

    .line 29
    .line 30
    .line 31
    sget v6, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 32
    .line 33
    const/16 v7, 0x1e

    .line 34
    .line 35
    if-lt v6, v7, :cond_0

    .line 36
    .line 37
    new-instance v6, Lij4;

    .line 38
    .line 39
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    const/16 v7, 0x1c

    .line 44
    .line 45
    if-lt v6, v7, :cond_1

    .line 46
    .line 47
    new-instance v6, Lti4;

    .line 48
    .line 49
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_1
    new-instance v6, Lnh4;

    .line 54
    .line 55
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 56
    .line 57
    .line 58
    :goto_0
    new-instance v7, Lwy0;

    .line 59
    .line 60
    const/4 v8, 0x2

    .line 61
    invoke-direct {v7, v8}, Lwy0;-><init>(I)V

    .line 62
    .line 63
    .line 64
    new-instance v8, Lgd2;

    .line 65
    .line 66
    invoke-direct {v8}, Lgd2;-><init>()V

    .line 67
    .line 68
    .line 69
    new-instance v9, Ljd1;

    .line 70
    .line 71
    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    .line 72
    .line 73
    .line 74
    const/4 v10, 0x0

    .line 75
    iput-boolean v10, v9, Ljd1;->a:Z

    .line 76
    .line 77
    const/high16 v11, 0x3f800000    # 1.0f

    .line 78
    .line 79
    iput v11, v9, Ljd1;->b:F

    .line 80
    .line 81
    new-instance v11, Lbu1;

    .line 82
    .line 83
    const/4 v12, 0x4

    .line 84
    invoke-direct {v11, v12}, Lbu1;-><init>(I)V

    .line 85
    .line 86
    .line 87
    new-instance v12, Lue;

    .line 88
    .line 89
    const/4 v13, 0x7

    .line 90
    invoke-direct {v12, v13}, Lue;-><init>(I)V

    .line 91
    .line 92
    .line 93
    const-wide/16 v13, 0x0

    .line 94
    .line 95
    iput-wide v13, v12, Lue;->g:J

    .line 96
    .line 97
    new-instance v13, Lts0;

    .line 98
    .line 99
    invoke-direct {v13}, Ljava/lang/Object;-><init>()V

    .line 100
    .line 101
    .line 102
    new-instance v14, Lxz1;

    .line 103
    .line 104
    invoke-direct {v14}, Lxz1;-><init>()V

    .line 105
    .line 106
    .line 107
    new-instance v15, Lus1;

    .line 108
    .line 109
    invoke-direct {v15}, Lus1;-><init>()V

    .line 110
    .line 111
    .line 112
    new-instance v10, Lug0;

    .line 113
    .line 114
    move-object/from16 v17, v15

    .line 115
    .line 116
    const/16 v15, 0x11

    .line 117
    .line 118
    invoke-direct {v10, v15}, Lug0;-><init>(I)V

    .line 119
    .line 120
    .line 121
    new-instance v15, Lqd2;

    .line 122
    .line 123
    move-object/from16 v18, v10

    .line 124
    .line 125
    const/4 v10, 0x0

    .line 126
    invoke-direct {v15, v10}, Lqd2;-><init>(I)V

    .line 127
    .line 128
    .line 129
    new-instance v10, Lp21;

    .line 130
    .line 131
    move-object/from16 v19, v15

    .line 132
    .line 133
    const/16 v15, 0xb

    .line 134
    .line 135
    invoke-direct {v10, v15}, Lp21;-><init>(I)V

    .line 136
    .line 137
    .line 138
    new-instance v15, Lzb1;

    .line 139
    .line 140
    invoke-direct {v15}, Ljava/lang/Object;-><init>()V

    .line 141
    .line 142
    .line 143
    move-object/from16 v20, v10

    .line 144
    .line 145
    const/4 v10, 0x0

    .line 146
    iput-object v10, v15, Lzb1;->i:Ljava/lang/Object;

    .line 147
    .line 148
    move-object/from16 v21, v14

    .line 149
    .line 150
    const/4 v14, 0x0

    .line 151
    iput-boolean v14, v15, Lzb1;->f:Z

    .line 152
    .line 153
    iput-object v10, v15, Lzb1;->g:Ljava/lang/Object;

    .line 154
    .line 155
    iput-object v10, v15, Lzb1;->j:Ljava/lang/Object;

    .line 156
    .line 157
    iput-object v10, v15, Lzb1;->h:Ljava/lang/Object;

    .line 158
    .line 159
    new-instance v10, Lr2;

    .line 160
    .line 161
    const/4 v14, 0x3

    .line 162
    invoke-direct {v10, v14}, Lr2;-><init>(I)V

    .line 163
    .line 164
    .line 165
    new-instance v14, Lts0;

    .line 166
    .line 167
    invoke-direct {v14}, Ljava/lang/Object;-><init>()V

    .line 168
    .line 169
    .line 170
    move-object/from16 v16, v14

    .line 171
    .line 172
    new-instance v14, Lus0;

    .line 173
    .line 174
    invoke-direct {v14}, Ljava/lang/Object;-><init>()V

    .line 175
    .line 176
    .line 177
    move-object/from16 v22, v14

    .line 178
    .line 179
    new-instance v14, Lug0;

    .line 180
    .line 181
    move-object/from16 v23, v15

    .line 182
    .line 183
    const/16 v15, 0x10

    .line 184
    .line 185
    invoke-direct {v14, v15}, Lug0;-><init>(I)V

    .line 186
    .line 187
    .line 188
    new-instance v15, Lsu2;

    .line 189
    .line 190
    move-object/from16 v24, v14

    .line 191
    .line 192
    const/4 v14, 0x4

    .line 193
    invoke-direct {v15, v14}, Lsu2;-><init>(I)V

    .line 194
    .line 195
    .line 196
    new-instance v14, Loc2;

    .line 197
    .line 198
    invoke-direct {v14}, Loc2;-><init>()V

    .line 199
    .line 200
    .line 201
    move-object/from16 v25, v14

    .line 202
    .line 203
    new-instance v14, Lm30;

    .line 204
    .line 205
    invoke-direct {v14}, Lm30;-><init>()V

    .line 206
    .line 207
    .line 208
    move-object/from16 v26, v14

    .line 209
    .line 210
    new-instance v14, Lxe2;

    .line 211
    .line 212
    invoke-direct {v14}, Lxe2;-><init>()V

    .line 213
    .line 214
    .line 215
    move-object/from16 v27, v14

    .line 216
    .line 217
    new-instance v14, Lqd2;

    .line 218
    .line 219
    move-object/from16 v28, v15

    .line 220
    .line 221
    const/4 v15, 0x1

    .line 222
    invoke-direct {v14, v15}, Lqd2;-><init>(I)V

    .line 223
    .line 224
    .line 225
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 226
    .line 227
    .line 228
    iput-object v1, v0, Lhg4;->a:Lus0;

    .line 229
    .line 230
    iput-object v2, v0, Lhg4;->b:Ly24;

    .line 231
    .line 232
    iput-object v3, v0, Lhg4;->c:Llf4;

    .line 233
    .line 234
    iput-object v4, v0, Lhg4;->d:Lsd2;

    .line 235
    .line 236
    iput-object v5, v0, Lhg4;->e:Ljd2;

    .line 237
    .line 238
    iput-object v6, v0, Lhg4;->f:Lnh4;

    .line 239
    .line 240
    iput-object v7, v0, Lhg4;->g:Lwy0;

    .line 241
    .line 242
    iput-object v8, v0, Lhg4;->h:Lgd2;

    .line 243
    .line 244
    iput-object v9, v0, Lhg4;->i:Ljd1;

    .line 245
    .line 246
    iput-object v11, v0, Lhg4;->j:Lbu1;

    .line 247
    .line 248
    sget-object v1, Lym;->a:Lym;

    .line 249
    .line 250
    iput-object v1, v0, Lhg4;->k:Lym;

    .line 251
    .line 252
    iput-object v12, v0, Lhg4;->l:Lue;

    .line 253
    .line 254
    iput-object v13, v0, Lhg4;->m:Lts0;

    .line 255
    .line 256
    move-object/from16 v1, v21

    .line 257
    .line 258
    iput-object v1, v0, Lhg4;->n:Lxz1;

    .line 259
    .line 260
    move-object/from16 v1, v17

    .line 261
    .line 262
    iput-object v1, v0, Lhg4;->o:Lus1;

    .line 263
    .line 264
    move-object/from16 v1, v18

    .line 265
    .line 266
    iput-object v1, v0, Lhg4;->p:Lug0;

    .line 267
    .line 268
    move-object/from16 v1, v19

    .line 269
    .line 270
    iput-object v1, v0, Lhg4;->q:Lqd2;

    .line 271
    .line 272
    move-object/from16 v1, v20

    .line 273
    .line 274
    iput-object v1, v0, Lhg4;->r:Lp21;

    .line 275
    .line 276
    iput-object v10, v0, Lhg4;->t:Lr2;

    .line 277
    .line 278
    move-object/from16 v1, v23

    .line 279
    .line 280
    iput-object v1, v0, Lhg4;->s:Lzb1;

    .line 281
    .line 282
    move-object/from16 v1, v16

    .line 283
    .line 284
    iput-object v1, v0, Lhg4;->u:Lts0;

    .line 285
    .line 286
    move-object/from16 v1, v22

    .line 287
    .line 288
    iput-object v1, v0, Lhg4;->v:Lus0;

    .line 289
    .line 290
    move-object/from16 v1, v24

    .line 291
    .line 292
    iput-object v1, v0, Lhg4;->w:Lug0;

    .line 293
    .line 294
    move-object/from16 v1, v28

    .line 295
    .line 296
    iput-object v1, v0, Lhg4;->x:Lsu2;

    .line 297
    .line 298
    move-object/from16 v1, v25

    .line 299
    .line 300
    iput-object v1, v0, Lhg4;->y:Loc2;

    .line 301
    .line 302
    move-object/from16 v1, v26

    .line 303
    .line 304
    iput-object v1, v0, Lhg4;->z:Lm30;

    .line 305
    .line 306
    move-object/from16 v1, v27

    .line 307
    .line 308
    iput-object v1, v0, Lhg4;->A:Lxe2;

    .line 309
    .line 310
    iput-object v14, v0, Lhg4;->B:Lqd2;

    .line 311
    .line 312
    return-void
.end method
