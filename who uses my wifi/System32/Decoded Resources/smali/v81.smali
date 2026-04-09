.class public final Lv81;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Landroid/view/View$OnApplyWindowInsetsListener;


# instance fields
.field public final a:Lz20;

.field public b:Lo91;


# direct methods
.method public constructor <init>(Landroid/view/View;Lz20;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lv81;->a:Lz20;

    .line 5
    .line 6
    sget-object p2, Le61;->a:Ljava/util/WeakHashMap;

    .line 7
    .line 8
    invoke-static {p1}, Lu51;->a(Landroid/view/View;)Lo91;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    if-eqz p1, :cond_2

    .line 13
    .line 14
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 15
    .line 16
    const/16 v0, 0x1e

    .line 17
    .line 18
    if-lt p2, v0, :cond_0

    .line 19
    .line 20
    new-instance p2, Le91;

    .line 21
    .line 22
    invoke-direct {p2, p1}, Le91;-><init>(Lo91;)V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/16 v0, 0x1d

    .line 27
    .line 28
    if-lt p2, v0, :cond_1

    .line 29
    .line 30
    new-instance p2, Ld91;

    .line 31
    .line 32
    invoke-direct {p2, p1}, Ld91;-><init>(Lo91;)V

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    new-instance p2, Lc91;

    .line 37
    .line 38
    invoke-direct {p2, p1}, Lc91;-><init>(Lo91;)V

    .line 39
    .line 40
    .line 41
    :goto_0
    invoke-virtual {p2}, Lf91;->b()Lo91;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    goto :goto_1

    .line 46
    :cond_2
    const/4 p1, 0x0

    .line 47
    :goto_1
    iput-object p1, p0, Lv81;->b:Lo91;

    .line 48
    .line 49
    return-void
.end method


# virtual methods
.method public final onApplyWindowInsets(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v6, p1

    .line 4
    .line 5
    move-object/from16 v7, p2

    .line 6
    .line 7
    invoke-virtual {v6}, Landroid/view/View;->isLaidOut()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    invoke-static/range {p1 .. p2}, Lo91;->g(Landroid/view/View;Landroid/view/WindowInsets;)Lo91;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    iput-object v1, v0, Lv81;->b:Lo91;

    .line 18
    .line 19
    invoke-static/range {p1 .. p2}, Lw81;->i(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    return-object v1

    .line 24
    :cond_0
    invoke-static/range {p1 .. p2}, Lo91;->g(Landroid/view/View;Landroid/view/WindowInsets;)Lo91;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    iget-object v1, v3, Lo91;->a:Ll91;

    .line 29
    .line 30
    iget-object v2, v0, Lv81;->b:Lo91;

    .line 31
    .line 32
    if-nez v2, :cond_1

    .line 33
    .line 34
    sget-object v2, Le61;->a:Ljava/util/WeakHashMap;

    .line 35
    .line 36
    invoke-static {v6}, Lu51;->a(Landroid/view/View;)Lo91;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    iput-object v2, v0, Lv81;->b:Lo91;

    .line 41
    .line 42
    :cond_1
    iget-object v2, v0, Lv81;->b:Lo91;

    .line 43
    .line 44
    if-nez v2, :cond_2

    .line 45
    .line 46
    iput-object v3, v0, Lv81;->b:Lo91;

    .line 47
    .line 48
    invoke-static/range {p1 .. p2}, Lw81;->i(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    return-object v1

    .line 53
    :cond_2
    invoke-static {v6}, Lw81;->j(Landroid/view/View;)Lz20;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    if-eqz v2, :cond_3

    .line 58
    .line 59
    iget-object v2, v2, Lz20;->c:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v2, Landroid/view/WindowInsets;

    .line 62
    .line 63
    invoke-static {v2, v7}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    if-eqz v2, :cond_3

    .line 68
    .line 69
    invoke-static/range {p1 .. p2}, Lw81;->i(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    return-object v1

    .line 74
    :cond_3
    iget-object v2, v0, Lv81;->b:Lo91;

    .line 75
    .line 76
    const/4 v5, 0x1

    .line 77
    const/4 v8, 0x0

    .line 78
    :goto_0
    const/16 v9, 0x100

    .line 79
    .line 80
    if-gt v5, v9, :cond_5

    .line 81
    .line 82
    invoke-virtual {v1, v5}, Ll91;->f(I)Ly20;

    .line 83
    .line 84
    .line 85
    move-result-object v9

    .line 86
    iget-object v10, v2, Lo91;->a:Ll91;

    .line 87
    .line 88
    invoke-virtual {v10, v5}, Ll91;->f(I)Ly20;

    .line 89
    .line 90
    .line 91
    move-result-object v10

    .line 92
    invoke-virtual {v9, v10}, Ly20;->equals(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    move-result v9

    .line 96
    if-nez v9, :cond_4

    .line 97
    .line 98
    or-int/2addr v8, v5

    .line 99
    :cond_4
    shl-int/lit8 v5, v5, 0x1

    .line 100
    .line 101
    goto :goto_0

    .line 102
    :cond_5
    if-nez v8, :cond_6

    .line 103
    .line 104
    invoke-static/range {p1 .. p2}, Lw81;->i(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    return-object v1

    .line 109
    :cond_6
    iget-object v2, v0, Lv81;->b:Lo91;

    .line 110
    .line 111
    and-int/lit8 v5, v8, 0x8

    .line 112
    .line 113
    if-eqz v5, :cond_8

    .line 114
    .line 115
    const/16 v5, 0x8

    .line 116
    .line 117
    invoke-virtual {v1, v5}, Ll91;->f(I)Ly20;

    .line 118
    .line 119
    .line 120
    move-result-object v9

    .line 121
    iget v9, v9, Ly20;->d:I

    .line 122
    .line 123
    iget-object v10, v2, Lo91;->a:Ll91;

    .line 124
    .line 125
    invoke-virtual {v10, v5}, Ll91;->f(I)Ly20;

    .line 126
    .line 127
    .line 128
    move-result-object v5

    .line 129
    iget v5, v5, Ly20;->d:I

    .line 130
    .line 131
    if-le v9, v5, :cond_7

    .line 132
    .line 133
    sget-object v5, Lw81;->e:Landroid/view/animation/PathInterpolator;

    .line 134
    .line 135
    goto :goto_1

    .line 136
    :cond_7
    sget-object v5, Lw81;->f:Lfu;

    .line 137
    .line 138
    goto :goto_1

    .line 139
    :cond_8
    sget-object v5, Lw81;->g:Landroid/view/animation/DecelerateInterpolator;

    .line 140
    .line 141
    :goto_1
    new-instance v9, La91;

    .line 142
    .line 143
    const-wide/16 v10, 0xa0

    .line 144
    .line 145
    invoke-direct {v9, v8, v5, v10, v11}, La91;-><init>(ILandroid/view/animation/Interpolator;J)V

    .line 146
    .line 147
    .line 148
    iget-object v5, v9, La91;->a:Lz81;

    .line 149
    .line 150
    const/4 v10, 0x0

    .line 151
    invoke-virtual {v5, v10}, Lz81;->d(F)V

    .line 152
    .line 153
    .line 154
    const/4 v10, 0x2

    .line 155
    new-array v5, v10, [F

    .line 156
    .line 157
    fill-array-data v5, :array_0

    .line 158
    .line 159
    .line 160
    invoke-static {v5}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 161
    .line 162
    .line 163
    move-result-object v5

    .line 164
    iget-object v11, v9, La91;->a:Lz81;

    .line 165
    .line 166
    invoke-virtual {v11}, Lz81;->a()J

    .line 167
    .line 168
    .line 169
    move-result-wide v11

    .line 170
    invoke-virtual {v5, v11, v12}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 171
    .line 172
    .line 173
    move-result-object v11

    .line 174
    invoke-virtual {v1, v8}, Ll91;->f(I)Ly20;

    .line 175
    .line 176
    .line 177
    move-result-object v1

    .line 178
    iget-object v5, v2, Lo91;->a:Ll91;

    .line 179
    .line 180
    invoke-virtual {v5, v8}, Ll91;->f(I)Ly20;

    .line 181
    .line 182
    .line 183
    move-result-object v5

    .line 184
    iget v12, v1, Ly20;->a:I

    .line 185
    .line 186
    iget v13, v5, Ly20;->a:I

    .line 187
    .line 188
    invoke-static {v12, v13}, Ljava/lang/Math;->min(II)I

    .line 189
    .line 190
    .line 191
    move-result v12

    .line 192
    iget v13, v1, Ly20;->b:I

    .line 193
    .line 194
    iget v14, v5, Ly20;->b:I

    .line 195
    .line 196
    invoke-static {v13, v14}, Ljava/lang/Math;->min(II)I

    .line 197
    .line 198
    .line 199
    move-result v15

    .line 200
    iget v10, v1, Ly20;->c:I

    .line 201
    .line 202
    iget v4, v5, Ly20;->c:I

    .line 203
    .line 204
    move-object/from16 v16, v2

    .line 205
    .line 206
    invoke-static {v10, v4}, Ljava/lang/Math;->min(II)I

    .line 207
    .line 208
    .line 209
    move-result v2

    .line 210
    move-object/from16 v17, v3

    .line 211
    .line 212
    iget v3, v1, Ly20;->d:I

    .line 213
    .line 214
    move/from16 v18, v8

    .line 215
    .line 216
    iget v8, v5, Ly20;->d:I

    .line 217
    .line 218
    move-object/from16 v19, v9

    .line 219
    .line 220
    invoke-static {v3, v8}, Ljava/lang/Math;->min(II)I

    .line 221
    .line 222
    .line 223
    move-result v9

    .line 224
    invoke-static {v12, v15, v2, v9}, Ly20;->b(IIII)Ly20;

    .line 225
    .line 226
    .line 227
    move-result-object v2

    .line 228
    iget v1, v1, Ly20;->a:I

    .line 229
    .line 230
    iget v5, v5, Ly20;->a:I

    .line 231
    .line 232
    invoke-static {v1, v5}, Ljava/lang/Math;->max(II)I

    .line 233
    .line 234
    .line 235
    move-result v1

    .line 236
    invoke-static {v13, v14}, Ljava/lang/Math;->max(II)I

    .line 237
    .line 238
    .line 239
    move-result v5

    .line 240
    invoke-static {v10, v4}, Ljava/lang/Math;->max(II)I

    .line 241
    .line 242
    .line 243
    move-result v4

    .line 244
    invoke-static {v3, v8}, Ljava/lang/Math;->max(II)I

    .line 245
    .line 246
    .line 247
    move-result v3

    .line 248
    invoke-static {v1, v5, v4, v3}, Ly20;->b(IIII)Ly20;

    .line 249
    .line 250
    .line 251
    move-result-object v1

    .line 252
    new-instance v8, Lvq2;

    .line 253
    .line 254
    const/16 v3, 0xf

    .line 255
    .line 256
    invoke-direct {v8, v2, v1, v3}, Lvq2;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 257
    .line 258
    .line 259
    const/4 v1, 0x0

    .line 260
    invoke-static {v6, v7, v1}, Lw81;->f(Landroid/view/View;Landroid/view/WindowInsets;Z)V

    .line 261
    .line 262
    .line 263
    new-instance v1, Lu81;

    .line 264
    .line 265
    move-object/from16 v4, v16

    .line 266
    .line 267
    move-object/from16 v3, v17

    .line 268
    .line 269
    move/from16 v5, v18

    .line 270
    .line 271
    move-object/from16 v2, v19

    .line 272
    .line 273
    invoke-direct/range {v1 .. v6}, Lu81;-><init>(La91;Lo91;Lo91;ILandroid/view/View;)V

    .line 274
    .line 275
    .line 276
    invoke-virtual {v11, v1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 277
    .line 278
    .line 279
    new-instance v1, Ls21;

    .line 280
    .line 281
    const/4 v4, 0x2

    .line 282
    invoke-direct {v1, v2, v6, v4}, Ls21;-><init>(Ljava/lang/Object;Landroid/view/View;I)V

    .line 283
    .line 284
    .line 285
    invoke-virtual {v11, v1}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 286
    .line 287
    .line 288
    new-instance v1, Lgi;

    .line 289
    .line 290
    invoke-direct {v1, v6, v2, v8, v11}, Lgi;-><init>(Landroid/view/View;La91;Lvq2;Landroid/animation/ValueAnimator;)V

    .line 291
    .line 292
    .line 293
    invoke-static {v6, v1}, Llj0;->a(Landroid/view/View;Ljava/lang/Runnable;)V

    .line 294
    .line 295
    .line 296
    iput-object v3, v0, Lv81;->b:Lo91;

    .line 297
    .line 298
    invoke-static/range {p1 .. p2}, Lw81;->i(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;

    .line 299
    .line 300
    .line 301
    move-result-object v1

    .line 302
    return-object v1

    .line 303
    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method
