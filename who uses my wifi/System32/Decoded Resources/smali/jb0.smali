.class public final Ljb0;
.super Lt3;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final i:Lnc0;

.field public final j:Landroid/graphics/Rect;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 13

    .line 1
    const v0, 0x7f040362

    .line 2
    .line 3
    .line 4
    invoke-static {p1, v0}, Lqb1;->n(Landroid/content/Context;I)Landroid/util/TypedValue;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    const/4 v2, 0x0

    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    move v1, v2

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    iget v1, v1, Landroid/util/TypedValue;->data:I

    .line 14
    .line 15
    :goto_0
    new-array v3, v2, [I

    .line 16
    .line 17
    const/4 v4, 0x0

    .line 18
    const v5, 0x7f040031

    .line 19
    .line 20
    .line 21
    const v6, 0x7f13013b

    .line 22
    .line 23
    .line 24
    invoke-static {p1, v4, v5, v6, v3}, Lum;->A(Landroid/content/Context;Landroid/util/AttributeSet;II[I)Landroid/content/Context;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    if-nez v1, :cond_1

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_1
    new-instance v7, Lnj;

    .line 32
    .line 33
    invoke-direct {v7, v3, v1}, Lnj;-><init>(Landroid/content/Context;I)V

    .line 34
    .line 35
    .line 36
    move-object v3, v7

    .line 37
    :goto_1
    invoke-static {p1, v0}, Lqb1;->n(Landroid/content/Context;I)Landroid/util/TypedValue;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    if-nez p1, :cond_2

    .line 42
    .line 43
    move p1, v2

    .line 44
    goto :goto_2

    .line 45
    :cond_2
    iget p1, p1, Landroid/util/TypedValue;->data:I

    .line 46
    .line 47
    :goto_2
    invoke-direct {p0, v3, p1}, Lt3;-><init>(Landroid/content/Context;I)V

    .line 48
    .line 49
    .line 50
    iget-object p1, p0, Lt3;->h:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast p1, Lp3;

    .line 53
    .line 54
    iget-object v7, p1, Lp3;->a:Landroid/view/ContextThemeWrapper;

    .line 55
    .line 56
    invoke-virtual {v7}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    new-array v12, v2, [I

    .line 61
    .line 62
    const/4 v8, 0x0

    .line 63
    const v10, 0x7f040031

    .line 64
    .line 65
    .line 66
    const v11, 0x7f13013b

    .line 67
    .line 68
    .line 69
    invoke-static {v7, v8, v10, v11}, Luk2;->h(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 70
    .line 71
    .line 72
    sget-object v9, Lgn0;->p:[I

    .line 73
    .line 74
    invoke-static/range {v7 .. v12}, Luk2;->i(Landroid/content/Context;Landroid/util/AttributeSet;[III[I)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v7, v8, v9, v10, v11}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    invoke-virtual {v7}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    const v3, 0x7f070345

    .line 86
    .line 87
    .line 88
    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 89
    .line 90
    .line 91
    move-result v1

    .line 92
    const/4 v3, 0x2

    .line 93
    invoke-virtual {v0, v3, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 94
    .line 95
    .line 96
    move-result v1

    .line 97
    invoke-virtual {v7}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 98
    .line 99
    .line 100
    move-result-object v3

    .line 101
    const v8, 0x7f070346

    .line 102
    .line 103
    .line 104
    invoke-virtual {v3, v8}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 105
    .line 106
    .line 107
    move-result v3

    .line 108
    const/4 v8, 0x3

    .line 109
    invoke-virtual {v0, v8, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 110
    .line 111
    .line 112
    move-result v3

    .line 113
    invoke-virtual {v7}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 114
    .line 115
    .line 116
    move-result-object v8

    .line 117
    const v10, 0x7f070344

    .line 118
    .line 119
    .line 120
    invoke-virtual {v8, v10}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 121
    .line 122
    .line 123
    move-result v8

    .line 124
    const/4 v10, 0x1

    .line 125
    invoke-virtual {v0, v10, v8}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 126
    .line 127
    .line 128
    move-result v8

    .line 129
    invoke-virtual {v7}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 130
    .line 131
    .line 132
    move-result-object v11

    .line 133
    const v12, 0x7f070343

    .line 134
    .line 135
    .line 136
    invoke-virtual {v11, v12}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 137
    .line 138
    .line 139
    move-result v11

    .line 140
    invoke-virtual {v0, v2, v11}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 141
    .line 142
    .line 143
    move-result v2

    .line 144
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 145
    .line 146
    .line 147
    invoke-virtual {v7}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    invoke-virtual {v0}, Landroid/content/res/Configuration;->getLayoutDirection()I

    .line 156
    .line 157
    .line 158
    move-result v0

    .line 159
    if-ne v0, v10, :cond_3

    .line 160
    .line 161
    move v11, v8

    .line 162
    goto :goto_3

    .line 163
    :cond_3
    move v11, v1

    .line 164
    :goto_3
    if-ne v0, v10, :cond_4

    .line 165
    .line 166
    goto :goto_4

    .line 167
    :cond_4
    move v1, v8

    .line 168
    :goto_4
    new-instance v0, Landroid/graphics/Rect;

    .line 169
    .line 170
    invoke-direct {v0, v11, v3, v1, v2}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 171
    .line 172
    .line 173
    iput-object v0, p0, Ljb0;->j:Landroid/graphics/Rect;

    .line 174
    .line 175
    const-class v0, Ljb0;

    .line 176
    .line 177
    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object v0

    .line 181
    const v1, 0x7f04013a

    .line 182
    .line 183
    .line 184
    invoke-static {v1, v7, v0}, Lqb1;->p(ILandroid/content/Context;Ljava/lang/String;)Landroid/util/TypedValue;

    .line 185
    .line 186
    .line 187
    move-result-object v0

    .line 188
    iget v1, v0, Landroid/util/TypedValue;->resourceId:I

    .line 189
    .line 190
    if-eqz v1, :cond_5

    .line 191
    .line 192
    invoke-static {v7, v1}, Lkj;->a(Landroid/content/Context;I)I

    .line 193
    .line 194
    .line 195
    move-result v0

    .line 196
    goto :goto_5

    .line 197
    :cond_5
    iget v0, v0, Landroid/util/TypedValue;->data:I

    .line 198
    .line 199
    :goto_5
    invoke-virtual {v7, v4, v9, v5, v6}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 200
    .line 201
    .line 202
    move-result-object v1

    .line 203
    const/4 v2, 0x4

    .line 204
    invoke-virtual {v1, v2, v0}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 205
    .line 206
    .line 207
    move-result v0

    .line 208
    invoke-virtual {v1}, Landroid/content/res/TypedArray;->recycle()V

    .line 209
    .line 210
    .line 211
    new-instance v1, Lnc0;

    .line 212
    .line 213
    invoke-direct {v1, v7, v4, v5, v6}, Lnc0;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 214
    .line 215
    .line 216
    invoke-virtual {v1, v7}, Lnc0;->m(Landroid/content/Context;)V

    .line 217
    .line 218
    .line 219
    invoke-static {v0}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 220
    .line 221
    .line 222
    move-result-object v0

    .line 223
    invoke-virtual {v1, v0}, Lnc0;->q(Landroid/content/res/ColorStateList;)V

    .line 224
    .line 225
    .line 226
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 227
    .line 228
    const/16 v2, 0x1c

    .line 229
    .line 230
    if-lt v0, v2, :cond_6

    .line 231
    .line 232
    new-instance v0, Landroid/util/TypedValue;

    .line 233
    .line 234
    invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V

    .line 235
    .line 236
    .line 237
    const v2, 0x1010571

    .line 238
    .line 239
    .line 240
    invoke-virtual {p1, v2, v0, v10}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 241
    .line 242
    .line 243
    iget-object p1, p0, Lt3;->h:Ljava/lang/Object;

    .line 244
    .line 245
    check-cast p1, Lp3;

    .line 246
    .line 247
    iget-object p1, p1, Lp3;->a:Landroid/view/ContextThemeWrapper;

    .line 248
    .line 249
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 250
    .line 251
    .line 252
    move-result-object p1

    .line 253
    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 254
    .line 255
    .line 256
    move-result-object p1

    .line 257
    invoke-virtual {v0, p1}, Landroid/util/TypedValue;->getDimension(Landroid/util/DisplayMetrics;)F

    .line 258
    .line 259
    .line 260
    move-result p1

    .line 261
    iget v0, v0, Landroid/util/TypedValue;->type:I

    .line 262
    .line 263
    const/4 v2, 0x5

    .line 264
    if-ne v0, v2, :cond_6

    .line 265
    .line 266
    const/4 v0, 0x0

    .line 267
    cmpl-float v0, p1, v0

    .line 268
    .line 269
    if-ltz v0, :cond_6

    .line 270
    .line 271
    iget-object v0, v1, Lnc0;->g:Llc0;

    .line 272
    .line 273
    iget-object v0, v0, Llc0;->a:Lsu0;

    .line 274
    .line 275
    invoke-virtual {v0}, Lsu0;->f()Lf2;

    .line 276
    .line 277
    .line 278
    move-result-object v0

    .line 279
    new-instance v2, Ll;

    .line 280
    .line 281
    invoke-direct {v2, p1}, Ll;-><init>(F)V

    .line 282
    .line 283
    .line 284
    iput-object v2, v0, Lf2;->e:Ljava/lang/Object;

    .line 285
    .line 286
    new-instance v2, Ll;

    .line 287
    .line 288
    invoke-direct {v2, p1}, Ll;-><init>(F)V

    .line 289
    .line 290
    .line 291
    iput-object v2, v0, Lf2;->f:Ljava/lang/Object;

    .line 292
    .line 293
    new-instance v2, Ll;

    .line 294
    .line 295
    invoke-direct {v2, p1}, Ll;-><init>(F)V

    .line 296
    .line 297
    .line 298
    iput-object v2, v0, Lf2;->g:Ljava/lang/Object;

    .line 299
    .line 300
    new-instance v2, Ll;

    .line 301
    .line 302
    invoke-direct {v2, p1}, Ll;-><init>(F)V

    .line 303
    .line 304
    .line 305
    iput-object v2, v0, Lf2;->h:Ljava/lang/Object;

    .line 306
    .line 307
    invoke-virtual {v0}, Lf2;->a()Lsu0;

    .line 308
    .line 309
    .line 310
    move-result-object p1

    .line 311
    invoke-virtual {v1, p1}, Lnc0;->setShapeAppearanceModel(Lsu0;)V

    .line 312
    .line 313
    .line 314
    :cond_6
    iput-object v1, p0, Ljb0;->i:Lnc0;

    .line 315
    .line 316
    return-void
.end method


# virtual methods
.method public final b()Lu3;
    .locals 10

    .line 1
    invoke-super {p0}, Lt3;->b()Lu3;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    iget-object v4, p0, Ljb0;->i:Lnc0;

    .line 14
    .line 15
    if-eqz v4, :cond_0

    .line 16
    .line 17
    invoke-virtual {v2}, Landroid/view/View;->getElevation()F

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    invoke-virtual {v4, v3}, Lnc0;->p(F)V

    .line 22
    .line 23
    .line 24
    :cond_0
    new-instance v3, Landroid/graphics/drawable/InsetDrawable;

    .line 25
    .line 26
    iget-object v9, p0, Ljb0;->j:Landroid/graphics/Rect;

    .line 27
    .line 28
    iget v5, v9, Landroid/graphics/Rect;->left:I

    .line 29
    .line 30
    iget v6, v9, Landroid/graphics/Rect;->top:I

    .line 31
    .line 32
    iget v7, v9, Landroid/graphics/Rect;->right:I

    .line 33
    .line 34
    iget v8, v9, Landroid/graphics/Rect;->bottom:I

    .line 35
    .line 36
    invoke-direct/range {v3 .. v8}, Landroid/graphics/drawable/InsetDrawable;-><init>(Landroid/graphics/drawable/Drawable;IIII)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1, v3}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 40
    .line 41
    .line 42
    new-instance v1, Lw20;

    .line 43
    .line 44
    invoke-direct {v1, v0, v9}, Lw20;-><init>(Landroid/app/Dialog;Landroid/graphics/Rect;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v2, v1}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 48
    .line 49
    .line 50
    return-object v0
.end method

.method public final g(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)V
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    invoke-super {p0, p1, p1}, Lt3;->g(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)V

    .line 3
    .line 4
    .line 5
    return-void
.end method
