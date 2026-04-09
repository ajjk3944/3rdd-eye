.class public final Lf20;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lti0;
.implements Lm2;
.implements Lqm0;
.implements Lyu;
.implements Lb2;
.implements Lvg2;
.implements Ltd2;
.implements Lhh3;
.implements Liq3;
.implements Ldp2;
.implements Lug2;
.implements Loy2;
.implements Lqq2;
.implements Lj73;


# static fields
.field public static final h:Lfr;

.field public static volatile i:Lf20;


# instance fields
.field public final synthetic f:I

.field public g:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lfr;

    .line 2
    .line 3
    const/16 v1, 0x17

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lfr;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lf20;->h:Lfr;

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>(I)V
    .locals 4

    iput p1, p0, Lf20;->f:I

    packed-switch p1, :pswitch_data_0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p1

    .line 11
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_0

    .line 12
    invoke-static {p1}, Lvn;->b(Landroid/os/Looper;)Landroid/os/Handler;

    move-result-object p1

    goto :goto_1

    .line 13
    :cond_0
    :try_start_0
    const-class v0, Landroid/os/Handler;

    const-class v1, Landroid/os/Looper;

    const-class v2, Landroid/os/Handler$Callback;

    sget-object v3, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    filled-new-array {v1, v2, v3}, [Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    .line 14
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    const/4 v2, 0x0

    filled-new-array {p1, v2, v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Handler;
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    move-object p1, v0

    goto :goto_1

    :catch_0
    move-exception p1

    .line 15
    invoke-virtual {p1}, Ljava/lang/reflect/InvocationTargetException;->getCause()Ljava/lang/Throwable;

    move-result-object p1

    .line 16
    instance-of v0, p1, Ljava/lang/RuntimeException;

    if-nez v0, :cond_2

    .line 17
    instance-of v0, p1, Ljava/lang/Error;

    if-eqz v0, :cond_1

    .line 18
    check-cast p1, Ljava/lang/Error;

    throw p1

    .line 19
    :cond_1
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    .line 20
    :cond_2
    check-cast p1, Ljava/lang/RuntimeException;

    throw p1

    .line 21
    :catch_1
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0, p1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    goto :goto_0

    .line 22
    :goto_1
    iput-object p1, p0, Lf20;->g:Ljava/lang/Object;

    return-void

    .line 23
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, Lkz2;

    const/16 v0, 0xa

    invoke-direct {p1, v0}, Lkz2;-><init>(I)V

    iput-object p1, p0, Lf20;->g:Ljava/lang/Object;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0xb
        :pswitch_0
    .end packed-switch
.end method

.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lf20;->f:I

    iput-object p2, p0, Lf20;->g:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(IZ)V
    .locals 0

    .line 2
    iput p1, p0, Lf20;->f:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lf20;->f:I

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    invoke-static {p1}, Lgi1;->c(Landroid/content/Context;)Lgi1;

    move-result-object p1

    .line 7
    iget-object p1, p1, Lgi1;->l:Ljava/lang/Object;

    check-cast p1, Lls2;

    invoke-virtual {p1}, Lls2;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lva4;

    .line 8
    const-string v0, "getConsentInformation(...)"

    invoke-static {p1, v0}, Li30;->l(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lf20;->g:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/os/Handler;)V
    .locals 1

    const/16 v0, 0xd

    iput v0, p0, Lf20;->f:I

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lvb1;

    invoke-direct {v0, p0, p1}, Lvb1;-><init>(Lf20;Landroid/os/Handler;)V

    iput-object v0, p0, Lf20;->g:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lvg0;La83;)V
    .locals 0

    const/16 p1, 0x18

    iput p1, p0, Lf20;->f:I

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lf20;->g:Ljava/lang/Object;

    return-void
.end method

.method private final m(Ljava/lang/Throwable;)V
    .locals 0

    .line 1
    return-void
.end method


# virtual methods
.method public B(Landroid/view/View;Lo91;)Lo91;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    iget v3, v0, Lf20;->f:I

    .line 8
    .line 9
    packed-switch v3, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    iget-object v1, v0, Lf20;->g:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v1, Lvb;

    .line 15
    .line 16
    iget-object v3, v1, Lvb;->s:Lub;

    .line 17
    .line 18
    if-eqz v3, :cond_0

    .line 19
    .line 20
    iget-object v4, v1, Lvb;->k:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 21
    .line 22
    iget-object v4, v4, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->Y:Ljava/util/ArrayList;

    .line 23
    .line 24
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    :cond_0
    new-instance v3, Lub;

    .line 28
    .line 29
    iget-object v4, v1, Lvb;->n:Landroid/widget/FrameLayout;

    .line 30
    .line 31
    invoke-direct {v3, v4, v2}, Lub;-><init>(Landroid/view/View;Lo91;)V

    .line 32
    .line 33
    .line 34
    iput-object v3, v1, Lvb;->s:Lub;

    .line 35
    .line 36
    invoke-virtual {v1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    invoke-virtual {v3, v4}, Lub;->e(Landroid/view/Window;)V

    .line 41
    .line 42
    .line 43
    iget-object v3, v1, Lvb;->k:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 44
    .line 45
    iget-object v1, v1, Lvb;->s:Lub;

    .line 46
    .line 47
    iget-object v3, v3, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->Y:Ljava/util/ArrayList;

    .line 48
    .line 49
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v4

    .line 53
    if-nez v4, :cond_1

    .line 54
    .line 55
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    :cond_1
    return-object v2

    .line 59
    :pswitch_0
    invoke-virtual {v2}, Lo91;->d()I

    .line 60
    .line 61
    .line 62
    move-result v3

    .line 63
    iget-object v4, v0, Lf20;->g:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v4, Lh6;

    .line 66
    .line 67
    iget-object v5, v4, Lh6;->p:Landroid/content/Context;

    .line 68
    .line 69
    invoke-virtual {v2}, Lo91;->d()I

    .line 70
    .line 71
    .line 72
    move-result v6

    .line 73
    iget-object v7, v4, Lh6;->A:Landroidx/appcompat/widget/ActionBarContextView;

    .line 74
    .line 75
    const/16 v8, 0x1d

    .line 76
    .line 77
    if-eqz v7, :cond_13

    .line 78
    .line 79
    invoke-virtual {v7}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 80
    .line 81
    .line 82
    move-result-object v7

    .line 83
    instance-of v7, v7, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 84
    .line 85
    if-eqz v7, :cond_13

    .line 86
    .line 87
    iget-object v7, v4, Lh6;->A:Landroidx/appcompat/widget/ActionBarContextView;

    .line 88
    .line 89
    invoke-virtual {v7}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 90
    .line 91
    .line 92
    move-result-object v7

    .line 93
    check-cast v7, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 94
    .line 95
    iget-object v11, v4, Lh6;->A:Landroidx/appcompat/widget/ActionBarContextView;

    .line 96
    .line 97
    invoke-virtual {v11}, Landroid/view/View;->isShown()Z

    .line 98
    .line 99
    .line 100
    move-result v11

    .line 101
    const/4 v12, 0x1

    .line 102
    if-eqz v11, :cond_11

    .line 103
    .line 104
    iget-object v11, v4, Lh6;->h0:Landroid/graphics/Rect;

    .line 105
    .line 106
    if-nez v11, :cond_2

    .line 107
    .line 108
    new-instance v11, Landroid/graphics/Rect;

    .line 109
    .line 110
    invoke-direct {v11}, Landroid/graphics/Rect;-><init>()V

    .line 111
    .line 112
    .line 113
    iput-object v11, v4, Lh6;->h0:Landroid/graphics/Rect;

    .line 114
    .line 115
    new-instance v11, Landroid/graphics/Rect;

    .line 116
    .line 117
    invoke-direct {v11}, Landroid/graphics/Rect;-><init>()V

    .line 118
    .line 119
    .line 120
    iput-object v11, v4, Lh6;->i0:Landroid/graphics/Rect;

    .line 121
    .line 122
    :cond_2
    iget-object v11, v4, Lh6;->h0:Landroid/graphics/Rect;

    .line 123
    .line 124
    iget-object v13, v4, Lh6;->i0:Landroid/graphics/Rect;

    .line 125
    .line 126
    invoke-virtual {v2}, Lo91;->b()I

    .line 127
    .line 128
    .line 129
    move-result v14

    .line 130
    invoke-virtual {v2}, Lo91;->d()I

    .line 131
    .line 132
    .line 133
    move-result v15

    .line 134
    invoke-virtual {v2}, Lo91;->c()I

    .line 135
    .line 136
    .line 137
    move-result v10

    .line 138
    invoke-virtual {v2}, Lo91;->a()I

    .line 139
    .line 140
    .line 141
    move-result v9

    .line 142
    invoke-virtual {v11, v14, v15, v10, v9}, Landroid/graphics/Rect;->set(IIII)V

    .line 143
    .line 144
    .line 145
    iget-object v9, v4, Lh6;->F:Landroid/view/ViewGroup;

    .line 146
    .line 147
    const-class v10, Landroid/graphics/Rect;

    .line 148
    .line 149
    sget v14, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 150
    .line 151
    if-lt v14, v8, :cond_3

    .line 152
    .line 153
    sget-boolean v10, Lg71;->a:Z

    .line 154
    .line 155
    invoke-static {v9, v11, v13}, Lc71;->a(Landroid/view/View;Landroid/graphics/Rect;Landroid/graphics/Rect;)V

    .line 156
    .line 157
    .line 158
    goto :goto_0

    .line 159
    :cond_3
    sget-boolean v14, Lg71;->a:Z

    .line 160
    .line 161
    if-nez v14, :cond_4

    .line 162
    .line 163
    sput-boolean v12, Lg71;->a:Z

    .line 164
    .line 165
    :try_start_0
    const-class v14, Landroid/view/View;

    .line 166
    .line 167
    const-string v15, "computeFitSystemWindows"

    .line 168
    .line 169
    filled-new-array {v10, v10}, [Ljava/lang/Class;

    .line 170
    .line 171
    .line 172
    move-result-object v10

    .line 173
    invoke-virtual {v14, v15, v10}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 174
    .line 175
    .line 176
    move-result-object v10

    .line 177
    sput-object v10, Lg71;->b:Ljava/lang/reflect/Method;

    .line 178
    .line 179
    invoke-virtual {v10}, Ljava/lang/reflect/AccessibleObject;->isAccessible()Z

    .line 180
    .line 181
    .line 182
    move-result v10

    .line 183
    if-nez v10, :cond_4

    .line 184
    .line 185
    sget-object v10, Lg71;->b:Ljava/lang/reflect/Method;

    .line 186
    .line 187
    invoke-virtual {v10, v12}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    .line 188
    .line 189
    .line 190
    :catch_0
    :cond_4
    sget-object v10, Lg71;->b:Ljava/lang/reflect/Method;

    .line 191
    .line 192
    if-eqz v10, :cond_5

    .line 193
    .line 194
    :try_start_1
    filled-new-array {v11, v13}, [Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object v13

    .line 198
    invoke-virtual {v10, v9, v13}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 199
    .line 200
    .line 201
    :catch_1
    :cond_5
    :goto_0
    iget v9, v11, Landroid/graphics/Rect;->top:I

    .line 202
    .line 203
    iget v10, v11, Landroid/graphics/Rect;->left:I

    .line 204
    .line 205
    iget v11, v11, Landroid/graphics/Rect;->right:I

    .line 206
    .line 207
    iget-object v13, v4, Lh6;->F:Landroid/view/ViewGroup;

    .line 208
    .line 209
    sget-object v14, Le61;->a:Ljava/util/WeakHashMap;

    .line 210
    .line 211
    invoke-static {v13}, Lu51;->a(Landroid/view/View;)Lo91;

    .line 212
    .line 213
    .line 214
    move-result-object v13

    .line 215
    if-nez v13, :cond_6

    .line 216
    .line 217
    const/4 v14, 0x0

    .line 218
    goto :goto_1

    .line 219
    :cond_6
    invoke-virtual {v13}, Lo91;->b()I

    .line 220
    .line 221
    .line 222
    move-result v14

    .line 223
    :goto_1
    if-nez v13, :cond_7

    .line 224
    .line 225
    const/4 v13, 0x0

    .line 226
    goto :goto_2

    .line 227
    :cond_7
    invoke-virtual {v13}, Lo91;->c()I

    .line 228
    .line 229
    .line 230
    move-result v13

    .line 231
    :goto_2
    iget v15, v7, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 232
    .line 233
    if-ne v15, v9, :cond_9

    .line 234
    .line 235
    iget v15, v7, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 236
    .line 237
    if-ne v15, v10, :cond_9

    .line 238
    .line 239
    iget v15, v7, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 240
    .line 241
    if-eq v15, v11, :cond_8

    .line 242
    .line 243
    goto :goto_3

    .line 244
    :cond_8
    const/4 v10, 0x0

    .line 245
    goto :goto_4

    .line 246
    :cond_9
    :goto_3
    iput v9, v7, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 247
    .line 248
    iput v10, v7, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 249
    .line 250
    iput v11, v7, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 251
    .line 252
    move v10, v12

    .line 253
    :goto_4
    if-lez v9, :cond_a

    .line 254
    .line 255
    iget-object v9, v4, Lh6;->H:Landroid/view/View;

    .line 256
    .line 257
    if-nez v9, :cond_a

    .line 258
    .line 259
    new-instance v9, Landroid/view/View;

    .line 260
    .line 261
    invoke-direct {v9, v5}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 262
    .line 263
    .line 264
    iput-object v9, v4, Lh6;->H:Landroid/view/View;

    .line 265
    .line 266
    const/16 v11, 0x8

    .line 267
    .line 268
    invoke-virtual {v9, v11}, Landroid/view/View;->setVisibility(I)V

    .line 269
    .line 270
    .line 271
    new-instance v9, Landroid/widget/FrameLayout$LayoutParams;

    .line 272
    .line 273
    iget v15, v7, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 274
    .line 275
    const/16 v11, 0x33

    .line 276
    .line 277
    const/4 v12, -0x1

    .line 278
    invoke-direct {v9, v12, v15, v11}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    .line 279
    .line 280
    .line 281
    iput v14, v9, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    .line 282
    .line 283
    iput v13, v9, Landroid/widget/FrameLayout$LayoutParams;->rightMargin:I

    .line 284
    .line 285
    iget-object v11, v4, Lh6;->F:Landroid/view/ViewGroup;

    .line 286
    .line 287
    iget-object v13, v4, Lh6;->H:Landroid/view/View;

    .line 288
    .line 289
    invoke-virtual {v11, v13, v12, v9}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    .line 290
    .line 291
    .line 292
    goto :goto_5

    .line 293
    :cond_a
    iget-object v9, v4, Lh6;->H:Landroid/view/View;

    .line 294
    .line 295
    if-eqz v9, :cond_c

    .line 296
    .line 297
    invoke-virtual {v9}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 298
    .line 299
    .line 300
    move-result-object v9

    .line 301
    check-cast v9, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 302
    .line 303
    iget v11, v9, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    .line 304
    .line 305
    iget v12, v7, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 306
    .line 307
    if-ne v11, v12, :cond_b

    .line 308
    .line 309
    iget v11, v9, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 310
    .line 311
    if-ne v11, v14, :cond_b

    .line 312
    .line 313
    iget v11, v9, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 314
    .line 315
    if-eq v11, v13, :cond_c

    .line 316
    .line 317
    :cond_b
    iput v12, v9, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    .line 318
    .line 319
    iput v14, v9, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 320
    .line 321
    iput v13, v9, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 322
    .line 323
    iget-object v11, v4, Lh6;->H:Landroid/view/View;

    .line 324
    .line 325
    invoke-virtual {v11, v9}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 326
    .line 327
    .line 328
    :cond_c
    :goto_5
    iget-object v9, v4, Lh6;->H:Landroid/view/View;

    .line 329
    .line 330
    if-eqz v9, :cond_d

    .line 331
    .line 332
    const/4 v12, 0x1

    .line 333
    goto :goto_6

    .line 334
    :cond_d
    const/4 v12, 0x0

    .line 335
    :goto_6
    if-eqz v12, :cond_f

    .line 336
    .line 337
    invoke-virtual {v9}, Landroid/view/View;->getVisibility()I

    .line 338
    .line 339
    .line 340
    move-result v9

    .line 341
    if-eqz v9, :cond_f

    .line 342
    .line 343
    iget-object v9, v4, Lh6;->H:Landroid/view/View;

    .line 344
    .line 345
    invoke-virtual {v9}, Landroid/view/View;->getWindowSystemUiVisibility()I

    .line 346
    .line 347
    .line 348
    move-result v11

    .line 349
    and-int/lit16 v11, v11, 0x2000

    .line 350
    .line 351
    if-eqz v11, :cond_e

    .line 352
    .line 353
    const v11, 0x7f060006

    .line 354
    .line 355
    .line 356
    invoke-static {v5, v11}, Lkj;->a(Landroid/content/Context;I)I

    .line 357
    .line 358
    .line 359
    move-result v5

    .line 360
    goto :goto_7

    .line 361
    :cond_e
    const v11, 0x7f060005

    .line 362
    .line 363
    .line 364
    invoke-static {v5, v11}, Lkj;->a(Landroid/content/Context;I)I

    .line 365
    .line 366
    .line 367
    move-result v5

    .line 368
    :goto_7
    invoke-virtual {v9, v5}, Landroid/view/View;->setBackgroundColor(I)V

    .line 369
    .line 370
    .line 371
    :cond_f
    iget-boolean v5, v4, Lh6;->M:Z

    .line 372
    .line 373
    if-nez v5, :cond_10

    .line 374
    .line 375
    if-eqz v12, :cond_10

    .line 376
    .line 377
    const/4 v6, 0x0

    .line 378
    :cond_10
    move/from16 v16, v10

    .line 379
    .line 380
    move v5, v12

    .line 381
    const/4 v12, 0x0

    .line 382
    goto :goto_8

    .line 383
    :cond_11
    iget v5, v7, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 384
    .line 385
    const/4 v12, 0x0

    .line 386
    if-eqz v5, :cond_12

    .line 387
    .line 388
    iput v12, v7, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 389
    .line 390
    move v5, v12

    .line 391
    const/16 v16, 0x1

    .line 392
    .line 393
    goto :goto_8

    .line 394
    :cond_12
    move v5, v12

    .line 395
    move/from16 v16, v5

    .line 396
    .line 397
    :goto_8
    if-eqz v16, :cond_14

    .line 398
    .line 399
    iget-object v9, v4, Lh6;->A:Landroidx/appcompat/widget/ActionBarContextView;

    .line 400
    .line 401
    invoke-virtual {v9, v7}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 402
    .line 403
    .line 404
    goto :goto_9

    .line 405
    :cond_13
    const/4 v12, 0x0

    .line 406
    move v5, v12

    .line 407
    :cond_14
    :goto_9
    iget-object v4, v4, Lh6;->H:Landroid/view/View;

    .line 408
    .line 409
    if-eqz v4, :cond_16

    .line 410
    .line 411
    if-eqz v5, :cond_15

    .line 412
    .line 413
    move v9, v12

    .line 414
    goto :goto_a

    .line 415
    :cond_15
    const/16 v9, 0x8

    .line 416
    .line 417
    :goto_a
    invoke-virtual {v4, v9}, Landroid/view/View;->setVisibility(I)V

    .line 418
    .line 419
    .line 420
    :cond_16
    if-eq v3, v6, :cond_19

    .line 421
    .line 422
    invoke-virtual {v2}, Lo91;->b()I

    .line 423
    .line 424
    .line 425
    move-result v3

    .line 426
    invoke-virtual {v2}, Lo91;->c()I

    .line 427
    .line 428
    .line 429
    move-result v4

    .line 430
    invoke-virtual {v2}, Lo91;->a()I

    .line 431
    .line 432
    .line 433
    move-result v5

    .line 434
    sget v7, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 435
    .line 436
    const/16 v9, 0x1e

    .line 437
    .line 438
    if-lt v7, v9, :cond_17

    .line 439
    .line 440
    new-instance v7, Le91;

    .line 441
    .line 442
    invoke-direct {v7, v2}, Le91;-><init>(Lo91;)V

    .line 443
    .line 444
    .line 445
    goto :goto_b

    .line 446
    :cond_17
    if-lt v7, v8, :cond_18

    .line 447
    .line 448
    new-instance v7, Ld91;

    .line 449
    .line 450
    invoke-direct {v7, v2}, Ld91;-><init>(Lo91;)V

    .line 451
    .line 452
    .line 453
    goto :goto_b

    .line 454
    :cond_18
    new-instance v7, Lc91;

    .line 455
    .line 456
    invoke-direct {v7, v2}, Lc91;-><init>(Lo91;)V

    .line 457
    .line 458
    .line 459
    :goto_b
    invoke-static {v3, v6, v4, v5}, Ly20;->b(IIII)Ly20;

    .line 460
    .line 461
    .line 462
    move-result-object v2

    .line 463
    invoke-virtual {v7, v2}, Lf91;->g(Ly20;)V

    .line 464
    .line 465
    .line 466
    invoke-virtual {v7}, Lf91;->b()Lo91;

    .line 467
    .line 468
    .line 469
    move-result-object v2

    .line 470
    :cond_19
    sget-object v3, Le61;->a:Ljava/util/WeakHashMap;

    .line 471
    .line 472
    invoke-virtual {v2}, Lo91;->f()Landroid/view/WindowInsets;

    .line 473
    .line 474
    .line 475
    move-result-object v3

    .line 476
    if-eqz v3, :cond_1a

    .line 477
    .line 478
    invoke-static {v1, v3}, Lr51;->b(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;

    .line 479
    .line 480
    .line 481
    move-result-object v4

    .line 482
    invoke-virtual {v4, v3}, Landroid/view/WindowInsets;->equals(Ljava/lang/Object;)Z

    .line 483
    .line 484
    .line 485
    move-result v3

    .line 486
    if-nez v3, :cond_1a

    .line 487
    .line 488
    invoke-static {v1, v4}, Lo91;->g(Landroid/view/View;Landroid/view/WindowInsets;)Lo91;

    .line 489
    .line 490
    .line 491
    move-result-object v2

    .line 492
    :cond_1a
    return-object v2

    .line 493
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
.end method

.method public synthetic a()Lth3;
    .locals 2

    sget-object v0, Lsf2;->z:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 1
    new-instance v0, Lcf3;

    iget-object v1, p0, Lf20;->g:Ljava/lang/Object;

    check-cast v1, [B

    invoke-direct {v0, v1}, Lcf3;-><init>([B)V

    return-object v0
.end method

.method public a()V
    .locals 11

    iget-object v0, p0, Lf20;->g:Ljava/lang/Object;

    check-cast v0, Lw52;

    .line 2
    sget-object v1, Lhg4;->C:Lhg4;

    iget-object v1, v1, Lhg4;->k:Lym;

    .line 3
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    .line 5
    iget-wide v8, v0, Lw52;->c:J

    sub-long/2addr v1, v8

    iget-object v7, v0, Lw52;->b:Ljava/util/ArrayList;

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    .line 6
    invoke-virtual {v7, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v1, 0x0

    .line 7
    invoke-virtual {v7, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    new-instance v3, Ljava/lang/StringBuilder;

    add-int/lit8 v2, v2, 0x34

    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v2, "LoadNewJavascriptEngine(onEngLoaded) latency is "

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " ms."

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 8
    invoke-static {v1}, Lgi2;->G(Ljava/lang/String;)V

    .line 9
    sget-object v1, Llf4;->l:Li63;

    new-instance v3, Lv52;

    iget-object v4, v0, Lw52;->a:Lmm2;

    iget-object v5, v0, Lw52;->d:Lb62;

    iget-object v6, v0, Lw52;->e:Lq52;

    const/4 v10, 0x1

    invoke-direct/range {v3 .. v10}, Lv52;-><init>(Lmm2;Lb62;Lq52;Ljava/util/ArrayList;JI)V

    sget-object v0, Lmz1;->c:Liz1;

    .line 10
    sget-object v2, Ltw1;->e:Ltw1;

    iget-object v2, v2, Ltw1;->c:Lkz1;

    .line 11
    invoke-virtual {v2, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    move-result-object v0

    .line 12
    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    int-to-long v4, v0

    .line 13
    invoke-virtual {v1, v3, v4, v5}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method public b(Lav;Loj;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p2, Lp;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lp;

    .line 7
    .line 8
    iget v1, v0, Lp;->l:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lp;->l:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lp;

    .line 21
    .line 22
    check-cast p2, Lqj;

    .line 23
    .line 24
    invoke-direct {v0, p0, p2}, Lp;-><init>(Lf20;Lqj;)V

    .line 25
    .line 26
    .line 27
    :goto_0
    iget-object p2, v0, Lp;->j:Ljava/lang/Object;

    .line 28
    .line 29
    iget v1, v0, Lp;->l:I

    .line 30
    .line 31
    sget-object v2, Lz31;->a:Lz31;

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    if-eqz v1, :cond_2

    .line 35
    .line 36
    if-ne v1, v3, :cond_1

    .line 37
    .line 38
    iget-object p1, v0, Lp;->i:Lgs0;

    .line 39
    .line 40
    :try_start_0
    invoke-static {p2}, Lbd2;->x(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 41
    .line 42
    .line 43
    goto :goto_2

    .line 44
    :catchall_0
    move-exception p2

    .line 45
    goto :goto_4

    .line 46
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 47
    .line 48
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 49
    .line 50
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    throw p1

    .line 54
    :cond_2
    invoke-static {p2}, Lbd2;->x(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    new-instance p2, Lgs0;

    .line 58
    .line 59
    iget-object v1, v0, Lqj;->g:Lhk;

    .line 60
    .line 61
    invoke-static {v1}, Li30;->j(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    invoke-direct {p2, p1, v1}, Lgs0;-><init>(Lav;Lhk;)V

    .line 65
    .line 66
    .line 67
    :try_start_1
    iput-object p2, v0, Lp;->i:Lgs0;

    .line 68
    .line 69
    iput v3, v0, Lp;->l:I

    .line 70
    .line 71
    iget-object p1, p0, Lf20;->g:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast p1, Llw0;

    .line 74
    .line 75
    invoke-virtual {p1, p2, v0}, Llw0;->f(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 79
    sget-object v0, Lrk;->f:Lrk;

    .line 80
    .line 81
    if-ne p1, v0, :cond_3

    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_3
    move-object p1, v2

    .line 85
    :goto_1
    if-ne p1, v0, :cond_4

    .line 86
    .line 87
    return-object v0

    .line 88
    :cond_4
    move-object p1, p2

    .line 89
    :goto_2
    invoke-virtual {p1}, Lqj;->n()V

    .line 90
    .line 91
    .line 92
    return-object v2

    .line 93
    :goto_3
    move-object v4, p2

    .line 94
    move-object p2, p1

    .line 95
    move-object p1, v4

    .line 96
    goto :goto_4

    .line 97
    :catchall_1
    move-exception p1

    .line 98
    goto :goto_3

    .line 99
    :goto_4
    invoke-virtual {p1}, Lqj;->n()V

    .line 100
    .line 101
    .line 102
    throw p2
.end method

.method public synthetic c(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget v0, p0, Lf20;->f:I

    .line 2
    .line 3
    sparse-switch v0, :sswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljo2;

    .line 7
    .line 8
    iget-object v0, p0, Lf20;->g:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Lfa2;

    .line 11
    .line 12
    invoke-interface {p1, v0}, Ljo2;->G0(Lfa2;)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :sswitch_0
    check-cast p1, Lxm2;

    .line 17
    .line 18
    iget-object v0, p0, Lf20;->g:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, Lpq2;

    .line 21
    .line 22
    invoke-interface {p1, v0}, Lxm2;->R(Lpq2;)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :sswitch_1
    iget-object v0, p0, Lf20;->g:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v0, Lpd2;

    .line 29
    .line 30
    check-cast p1, Lc62;

    .line 31
    .line 32
    invoke-virtual {v0, p1}, Lpd2;->a(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    nop

    .line 37
    :sswitch_data_0
    .sparse-switch
        0xf -> :sswitch_1
        0x13 -> :sswitch_0
    .end sparse-switch
.end method

.method public d()La83;
    .locals 1

    .line 1
    iget-object v0, p0, Lf20;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La83;

    .line 4
    .line 5
    return-object v0
.end method

.method public synthetic e(Lfa2;)Ln70;
    .locals 2

    .line 1
    iget-object v0, p0, Lf20;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lt83;

    .line 4
    .line 5
    iget-object v0, v0, Lt83;->i:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Lz94;

    .line 8
    .line 9
    invoke-interface {v0}, Lz94;->d()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Lxy2;

    .line 14
    .line 15
    invoke-static {}, Landroid/os/Binder;->getCallingUid()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    invoke-virtual {v0, p1, v1}, Lxy2;->C3(Lfa2;I)Ln70;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    return-object p1
.end method

.method public f(Ljava/lang/Object;)V
    .locals 3

    .line 1
    check-cast p1, Ll2;

    .line 2
    .line 3
    iget-object v0, p0, Lf20;->g:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Lxw;

    .line 6
    .line 7
    iget-object v1, v0, Lxw;->C:Ljava/util/ArrayDeque;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->pollFirst()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    check-cast v1, Luw;

    .line 14
    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    iget-object v2, v1, Luw;->f:Ljava/lang/String;

    .line 19
    .line 20
    iget v1, v1, Luw;->g:I

    .line 21
    .line 22
    iget-object v0, v0, Lxw;->c:Lp21;

    .line 23
    .line 24
    invoke-virtual {v0, v2}, Lp21;->j(Ljava/lang/String;)Liw;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    if-nez v0, :cond_1

    .line 29
    .line 30
    :goto_0
    return-void

    .line 31
    :cond_1
    iget v2, p1, Ll2;->f:I

    .line 32
    .line 33
    iget-object p1, p1, Ll2;->g:Landroid/content/Intent;

    .line 34
    .line 35
    invoke-virtual {v0, v1, v2, p1}, Liw;->s(IILandroid/content/Intent;)V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public g(Li5;Lmz;)V
    .locals 11

    .line 1
    new-instance v0, Lvq2;

    .line 2
    .line 3
    const/4 v1, 0x5

    .line 4
    invoke-direct {v0, p1, v1}, Lvq2;-><init>(Landroid/content/Context;I)V

    .line 5
    .line 6
    .line 7
    const-string v1, "D95CBDBF1A2CCD1B6766C3D9D2B99818"

    .line 8
    .line 9
    iget-object v2, v0, Lvq2;->g:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v2, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    const-string v1, "33C61DE73F8EAEB87B9ECE6E920D98CC"

    .line 17
    .line 18
    iget-object v2, v0, Lvq2;->g:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v2, Ljava/util/ArrayList;

    .line 21
    .line 22
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    const-string v1, "8BB648896523BB8F17DB8AD774027092"

    .line 26
    .line 27
    iget-object v2, v0, Lvq2;->g:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v2, Ljava/util/ArrayList;

    .line 30
    .line 31
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0}, Lvq2;->d()Lkj1;

    .line 35
    .line 36
    .line 37
    new-instance v6, Lfr;

    .line 38
    .line 39
    const/16 v0, 0x10

    .line 40
    .line 41
    invoke-direct {v6, v0}, Lfr;-><init>(I)V

    .line 42
    .line 43
    .line 44
    iget-object v0, p0, Lf20;->g:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v0, Lva4;

    .line 47
    .line 48
    new-instance v7, Lkz;

    .line 49
    .line 50
    invoke-direct {v7, p1, p2}, Lkz;-><init>(Li5;Lmz;)V

    .line 51
    .line 52
    .line 53
    new-instance v8, Ldk;

    .line 54
    .line 55
    invoke-direct {v8, p2}, Ldk;-><init>(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    iget-object p2, v0, Lva4;->d:Ljava/lang/Object;

    .line 59
    .line 60
    monitor-enter p2

    .line 61
    const/4 v1, 0x1

    .line 62
    :try_start_0
    iput-boolean v1, v0, Lva4;->f:Z

    .line 63
    .line 64
    monitor-exit p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 65
    iput-object v6, v0, Lva4;->h:Lfr;

    .line 66
    .line 67
    iget-object v4, v0, Lva4;->b:Lgi1;

    .line 68
    .line 69
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    new-instance v3, Lea1;

    .line 73
    .line 74
    const/4 v9, 0x6

    .line 75
    const/4 v10, 0x0

    .line 76
    move-object v5, p1

    .line 77
    invoke-direct/range {v3 .. v10}, Lea1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 78
    .line 79
    .line 80
    iget-object p1, v4, Lgi1;->h:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast p1, Ljava/util/concurrent/Executor;

    .line 83
    .line 84
    invoke-interface {p1, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 85
    .line 86
    .line 87
    return-void

    .line 88
    :catchall_0
    move-exception v0

    .line 89
    move-object p1, v0

    .line 90
    :try_start_1
    monitor-exit p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 91
    throw p1
.end method

.method public synthetic h(Li73;)Lyh2;
    .locals 1

    .line 1
    iget-object v0, p0, Lf20;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lt63;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lt63;->b(Li73;)Lyh2;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method

.method public i(ILjava/lang/Object;)V
    .locals 2

    .line 1
    packed-switch p1, :pswitch_data_0

    .line 2
    .line 3
    .line 4
    :pswitch_0
    const-string v0, ""

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :pswitch_1
    const-string v0, "RESULT_DELETE_SKIP_FILE_SUCCESS"

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :pswitch_2
    const-string v0, "RESULT_INSTALL_SKIP_FILE_SUCCESS"

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :pswitch_3
    const-string v0, "RESULT_PARSE_EXCEPTION"

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :pswitch_4
    const-string v0, "RESULT_IO_EXCEPTION"

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :pswitch_5
    const-string v0, "RESULT_BASELINE_PROFILE_NOT_FOUND"

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :pswitch_6
    const-string v0, "RESULT_DESIRED_FORMAT_UNSUPPORTED"

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :pswitch_7
    const-string v0, "RESULT_NOT_WRITABLE"

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :pswitch_8
    const-string v0, "RESULT_UNSUPPORTED_ART_VERSION"

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :pswitch_9
    const-string v0, "RESULT_ALREADY_INSTALLED"

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :pswitch_a
    const-string v0, "RESULT_INSTALL_SUCCESS"

    .line 35
    .line 36
    :goto_0
    const/4 v1, 0x6

    .line 37
    if-eq p1, v1, :cond_0

    .line 38
    .line 39
    const/4 v1, 0x7

    .line 40
    if-eq p1, v1, :cond_0

    .line 41
    .line 42
    const/16 v1, 0x8

    .line 43
    .line 44
    if-eq p1, v1, :cond_0

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_0
    const-string v1, "ProfileInstaller"

    .line 48
    .line 49
    check-cast p2, Ljava/lang/Throwable;

    .line 50
    .line 51
    invoke-static {v1, v0, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 52
    .line 53
    .line 54
    :goto_1
    iget-object p2, p0, Lf20;->g:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast p2, Landroidx/profileinstaller/ProfileInstallReceiver;

    .line 57
    .line 58
    invoke-virtual {p2, p1}, Landroid/content/BroadcastReceiver;->setResultCode(I)V

    .line 59
    .line 60
    .line 61
    return-void

    .line 62
    nop

    .line 63
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public j(I)I
    .locals 10

    .line 1
    const-class v0, Lf20;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    const-string v1, "next_job_scheduler_id"

    .line 5
    .line 6
    iget-object v2, p0, Lf20;->g:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v2, Landroidx/work/impl/WorkDatabase;

    .line 9
    .line 10
    invoke-virtual {v2}, Lpq0;->c()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 11
    .line 12
    .line 13
    :try_start_1
    invoke-virtual {v2}, Landroidx/work/impl/WorkDatabase;->j()Ll92;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    invoke-virtual {v3, v1}, Ll92;->y(Ljava/lang/String;)Ljava/lang/Long;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    const/4 v4, 0x0

    .line 22
    if-eqz v3, :cond_0

    .line 23
    .line 24
    invoke-virtual {v3}, Ljava/lang/Long;->intValue()I

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    goto :goto_0

    .line 29
    :catchall_0
    move-exception p1

    .line 30
    goto :goto_4

    .line 31
    :cond_0
    move v3, v4

    .line 32
    :goto_0
    const v5, 0x7fffffff

    .line 33
    .line 34
    .line 35
    if-ne v3, v5, :cond_1

    .line 36
    .line 37
    move v5, v4

    .line 38
    goto :goto_1

    .line 39
    :cond_1
    add-int/lit8 v5, v3, 0x1

    .line 40
    .line 41
    :goto_1
    invoke-virtual {v2}, Landroidx/work/impl/WorkDatabase;->j()Ll92;

    .line 42
    .line 43
    .line 44
    move-result-object v6

    .line 45
    new-instance v7, Lxl0;

    .line 46
    .line 47
    int-to-long v8, v5

    .line 48
    invoke-direct {v7, v1, v8, v9}, Lxl0;-><init>(Ljava/lang/String;J)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v6, v7}, Ll92;->A(Lxl0;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v2}, Lpq0;->h()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 55
    .line 56
    .line 57
    :try_start_2
    invoke-virtual {v2}, Lpq0;->f()V

    .line 58
    .line 59
    .line 60
    if-ltz v3, :cond_3

    .line 61
    .line 62
    if-le v3, p1, :cond_2

    .line 63
    .line 64
    goto :goto_2

    .line 65
    :cond_2
    move v4, v3

    .line 66
    goto :goto_3

    .line 67
    :cond_3
    :goto_2
    const-string p1, "next_job_scheduler_id"

    .line 68
    .line 69
    iget-object v1, p0, Lf20;->g:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v1, Landroidx/work/impl/WorkDatabase;

    .line 72
    .line 73
    invoke-virtual {v1}, Landroidx/work/impl/WorkDatabase;->j()Ll92;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    new-instance v2, Lxl0;

    .line 78
    .line 79
    const/4 v3, 0x1

    .line 80
    int-to-long v5, v3

    .line 81
    invoke-direct {v2, p1, v5, v6}, Lxl0;-><init>(Ljava/lang/String;J)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v1, v2}, Ll92;->A(Lxl0;)V

    .line 85
    .line 86
    .line 87
    :goto_3
    monitor-exit v0

    .line 88
    return v4

    .line 89
    :catchall_1
    move-exception p1

    .line 90
    goto :goto_5

    .line 91
    :goto_4
    invoke-virtual {v2}, Lpq0;->f()V

    .line 92
    .line 93
    .line 94
    throw p1

    .line 95
    :goto_5
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 96
    throw p1
.end method

.method public k(Lmf1;Lus0;I)Lwn1;
    .locals 17

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p0

    .line 4
    .line 5
    iget-object v2, v1, Lf20;->g:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v2, Lkz2;

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    move v5, v4

    .line 11
    const/4 v6, 0x0

    .line 12
    :goto_0
    move v7, v4

    .line 13
    :cond_0
    rem-int/lit8 v8, v7, 0xa

    .line 14
    .line 15
    const/16 v9, 0xa

    .line 16
    .line 17
    if-nez v8, :cond_2

    .line 18
    .line 19
    if-eqz v7, :cond_1

    .line 20
    .line 21
    iget-object v10, v2, Lkz2;->a:[B

    .line 22
    .line 23
    const/16 v11, 0x9

    .line 24
    .line 25
    invoke-static {v10, v9, v10, v4, v11}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 26
    .line 27
    .line 28
    :cond_1
    move v10, v4

    .line 29
    goto :goto_1

    .line 30
    :cond_2
    move v10, v8

    .line 31
    :goto_1
    const/4 v11, 0x1

    .line 32
    if-nez v7, :cond_3

    .line 33
    .line 34
    move v12, v9

    .line 35
    goto :goto_2

    .line 36
    :cond_3
    move v12, v11

    .line 37
    :goto_2
    :try_start_0
    iget-object v13, v2, Lkz2;->a:[B

    .line 38
    .line 39
    add-int/lit8 v8, v8, 0xa

    .line 40
    .line 41
    sub-int v14, v8, v12

    .line 42
    .line 43
    invoke-interface {v0, v13, v14, v12}, Lmf1;->u([BII)V
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    .line 44
    .line 45
    .line 46
    invoke-virtual {v2, v10}, Lkz2;->E(I)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v2, v8}, Lkz2;->C(I)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v2}, Lkz2;->B()I

    .line 53
    .line 54
    .line 55
    move-result v8

    .line 56
    const/4 v10, 0x3

    .line 57
    if-lt v8, v10, :cond_17

    .line 58
    .line 59
    invoke-virtual {v2}, Lkz2;->O()I

    .line 60
    .line 61
    .line 62
    move-result v8

    .line 63
    iget v12, v2, Lkz2;->b:I

    .line 64
    .line 65
    add-int/lit8 v12, v12, -0x3

    .line 66
    .line 67
    iput v12, v2, Lkz2;->b:I

    .line 68
    .line 69
    const v13, 0x494433

    .line 70
    .line 71
    .line 72
    if-ne v8, v13, :cond_14

    .line 73
    .line 74
    const/4 v7, 0x6

    .line 75
    invoke-virtual {v2, v7}, Lkz2;->G(I)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v2}, Lkz2;->g()I

    .line 79
    .line 80
    .line 81
    move-result v8

    .line 82
    add-int/lit8 v14, v8, 0xa

    .line 83
    .line 84
    if-nez v6, :cond_13

    .line 85
    .line 86
    new-array v6, v14, [B

    .line 87
    .line 88
    iget-object v15, v2, Lkz2;->a:[B

    .line 89
    .line 90
    invoke-static {v15, v12, v6, v4, v9}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 91
    .line 92
    .line 93
    invoke-interface {v0, v6, v9, v8}, Lmf1;->u([BII)V

    .line 94
    .line 95
    .line 96
    new-instance v8, Ljava/util/ArrayList;

    .line 97
    .line 98
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 99
    .line 100
    .line 101
    new-instance v12, Lkz2;

    .line 102
    .line 103
    invoke-direct {v12, v14, v6}, Lkz2;-><init>(I[B)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v12}, Lkz2;->B()I

    .line 107
    .line 108
    .line 109
    move-result v6

    .line 110
    const/4 v15, 0x2

    .line 111
    const/4 v3, 0x4

    .line 112
    if-ge v6, v9, :cond_4

    .line 113
    .line 114
    const-string v6, "Data too short to be an ID3 tag"

    .line 115
    .line 116
    invoke-static {v6}, La30;->x(Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    :goto_3
    const/4 v13, 0x0

    .line 120
    goto/16 :goto_7

    .line 121
    .line 122
    :cond_4
    invoke-virtual {v12}, Lkz2;->O()I

    .line 123
    .line 124
    .line 125
    move-result v6

    .line 126
    if-eq v6, v13, :cond_5

    .line 127
    .line 128
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 129
    .line 130
    .line 131
    move-result-object v6

    .line 132
    filled-new-array {v6}, [Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v6

    .line 136
    const-string v10, "%06X"

    .line 137
    .line 138
    invoke-static {v10, v6}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v6

    .line 142
    const-string v10, "Unexpected first three bytes of ID3 tag header: 0x"

    .line 143
    .line 144
    invoke-virtual {v10, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v6

    .line 148
    invoke-static {v6}, La30;->x(Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    goto :goto_3

    .line 152
    :cond_5
    invoke-virtual {v12}, Lkz2;->K()I

    .line 153
    .line 154
    .line 155
    move-result v6

    .line 156
    invoke-virtual {v12, v11}, Lkz2;->G(I)V

    .line 157
    .line 158
    .line 159
    invoke-virtual {v12}, Lkz2;->K()I

    .line 160
    .line 161
    .line 162
    move-result v13

    .line 163
    invoke-virtual {v12}, Lkz2;->g()I

    .line 164
    .line 165
    .line 166
    move-result v16

    .line 167
    if-ne v6, v15, :cond_6

    .line 168
    .line 169
    and-int/lit8 v10, v13, 0x40

    .line 170
    .line 171
    if-eqz v10, :cond_7

    .line 172
    .line 173
    const-string v6, "Skipped ID3 tag with majorVersion=2 and undefined compression scheme"

    .line 174
    .line 175
    invoke-static {v6}, La30;->x(Ljava/lang/String;)V

    .line 176
    .line 177
    .line 178
    goto :goto_3

    .line 179
    :cond_6
    if-ne v6, v10, :cond_8

    .line 180
    .line 181
    and-int/lit8 v10, v13, 0x40

    .line 182
    .line 183
    if-eqz v10, :cond_7

    .line 184
    .line 185
    invoke-virtual {v12}, Lkz2;->b()I

    .line 186
    .line 187
    .line 188
    move-result v10

    .line 189
    invoke-virtual {v12, v10}, Lkz2;->G(I)V

    .line 190
    .line 191
    .line 192
    add-int/2addr v10, v3

    .line 193
    sub-int v16, v16, v10

    .line 194
    .line 195
    :cond_7
    :goto_4
    move/from16 v7, v16

    .line 196
    .line 197
    goto :goto_5

    .line 198
    :cond_8
    if-ne v6, v3, :cond_b

    .line 199
    .line 200
    and-int/lit8 v10, v13, 0x40

    .line 201
    .line 202
    if-eqz v10, :cond_9

    .line 203
    .line 204
    invoke-virtual {v12}, Lkz2;->g()I

    .line 205
    .line 206
    .line 207
    move-result v10

    .line 208
    add-int/lit8 v7, v10, -0x4

    .line 209
    .line 210
    invoke-virtual {v12, v7}, Lkz2;->G(I)V

    .line 211
    .line 212
    .line 213
    sub-int v16, v16, v10

    .line 214
    .line 215
    :cond_9
    and-int/lit8 v7, v13, 0x10

    .line 216
    .line 217
    if-eqz v7, :cond_7

    .line 218
    .line 219
    add-int/lit8 v16, v16, -0xa

    .line 220
    .line 221
    goto :goto_4

    .line 222
    :goto_5
    if-ge v6, v3, :cond_a

    .line 223
    .line 224
    and-int/lit16 v10, v13, 0x80

    .line 225
    .line 226
    if-eqz v10, :cond_a

    .line 227
    .line 228
    move v10, v11

    .line 229
    goto :goto_6

    .line 230
    :cond_a
    move v10, v4

    .line 231
    :goto_6
    new-instance v13, Lvh1;

    .line 232
    .line 233
    invoke-direct {v13, v6, v7, v10}, Lvh1;-><init>(IIZ)V

    .line 234
    .line 235
    .line 236
    goto :goto_7

    .line 237
    :cond_b
    invoke-static {v6}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 238
    .line 239
    .line 240
    move-result-object v7

    .line 241
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 242
    .line 243
    .line 244
    move-result v7

    .line 245
    new-instance v10, Ljava/lang/StringBuilder;

    .line 246
    .line 247
    add-int/lit8 v7, v7, 0x2e

    .line 248
    .line 249
    invoke-direct {v10, v7}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 250
    .line 251
    .line 252
    const-string v7, "Skipped ID3 tag with unsupported majorVersion="

    .line 253
    .line 254
    invoke-static {v10, v6, v7}, Lga1;->q(Ljava/lang/StringBuilder;ILjava/lang/String;)V

    .line 255
    .line 256
    .line 257
    goto/16 :goto_3

    .line 258
    .line 259
    :goto_7
    if-nez v13, :cond_c

    .line 260
    .line 261
    :goto_8
    move-object/from16 v3, p2

    .line 262
    .line 263
    const/4 v6, 0x0

    .line 264
    goto :goto_a

    .line 265
    :cond_c
    iget v6, v13, Lvh1;->a:I

    .line 266
    .line 267
    iget v7, v12, Lkz2;->b:I

    .line 268
    .line 269
    if-ne v6, v15, :cond_d

    .line 270
    .line 271
    const/4 v9, 0x6

    .line 272
    :cond_d
    iget-boolean v10, v13, Lvh1;->b:Z

    .line 273
    .line 274
    iget v13, v13, Lvh1;->c:I

    .line 275
    .line 276
    if-eqz v10, :cond_e

    .line 277
    .line 278
    invoke-static {v13, v12}, Lgi2;->V(ILkz2;)I

    .line 279
    .line 280
    .line 281
    move-result v13

    .line 282
    :cond_e
    add-int/2addr v7, v13

    .line 283
    invoke-virtual {v12, v7}, Lkz2;->C(I)V

    .line 284
    .line 285
    .line 286
    invoke-static {v12, v6, v9, v4}, Lgi2;->M(Lkz2;IIZ)Z

    .line 287
    .line 288
    .line 289
    move-result v7

    .line 290
    if-nez v7, :cond_10

    .line 291
    .line 292
    if-ne v6, v3, :cond_f

    .line 293
    .line 294
    invoke-static {v12, v3, v9, v11}, Lgi2;->M(Lkz2;IIZ)Z

    .line 295
    .line 296
    .line 297
    move-result v3

    .line 298
    if-eqz v3, :cond_f

    .line 299
    .line 300
    goto :goto_9

    .line 301
    :cond_f
    invoke-static {v6}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 302
    .line 303
    .line 304
    move-result-object v3

    .line 305
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 306
    .line 307
    .line 308
    move-result v3

    .line 309
    new-instance v7, Ljava/lang/StringBuilder;

    .line 310
    .line 311
    add-int/lit8 v3, v3, 0x2d

    .line 312
    .line 313
    invoke-direct {v7, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 314
    .line 315
    .line 316
    const-string v3, "Failed to validate ID3 tag with majorVersion="

    .line 317
    .line 318
    invoke-static {v7, v6, v3}, Lga1;->q(Ljava/lang/StringBuilder;ILjava/lang/String;)V

    .line 319
    .line 320
    .line 321
    goto :goto_8

    .line 322
    :cond_10
    move v11, v4

    .line 323
    :cond_11
    :goto_9
    invoke-virtual {v12}, Lkz2;->B()I

    .line 324
    .line 325
    .line 326
    move-result v3

    .line 327
    if-lt v3, v9, :cond_12

    .line 328
    .line 329
    move-object/from16 v3, p2

    .line 330
    .line 331
    invoke-static {v6, v12, v11, v3}, Lgi2;->P(ILkz2;ZLus0;)Lwh1;

    .line 332
    .line 333
    .line 334
    move-result-object v7

    .line 335
    if-eqz v7, :cond_11

    .line 336
    .line 337
    invoke-virtual {v8, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 338
    .line 339
    .line 340
    goto :goto_9

    .line 341
    :cond_12
    move-object/from16 v3, p2

    .line 342
    .line 343
    new-instance v6, Lwn1;

    .line 344
    .line 345
    invoke-direct {v6, v8}, Lwn1;-><init>(Ljava/util/List;)V

    .line 346
    .line 347
    .line 348
    goto :goto_a

    .line 349
    :cond_13
    move-object/from16 v3, p2

    .line 350
    .line 351
    invoke-interface {v0, v8}, Lmf1;->A(I)V

    .line 352
    .line 353
    .line 354
    :goto_a
    add-int/2addr v5, v14

    .line 355
    goto/16 :goto_0

    .line 356
    .line 357
    :cond_14
    move-object/from16 v3, p2

    .line 358
    .line 359
    invoke-virtual {v2}, Lkz2;->J()I

    .line 360
    .line 361
    .line 362
    move-result v8

    .line 363
    invoke-static {v8}, Li41;->G(I)I

    .line 364
    .line 365
    .line 366
    move-result v8

    .line 367
    const/4 v9, -0x1

    .line 368
    if-eq v8, v9, :cond_15

    .line 369
    .line 370
    goto :goto_b

    .line 371
    :cond_15
    if-nez v7, :cond_16

    .line 372
    .line 373
    const/16 v8, 0x14

    .line 374
    .line 375
    invoke-virtual {v2, v8}, Lkz2;->A(I)V

    .line 376
    .line 377
    .line 378
    :cond_16
    add-int/lit8 v7, v7, 0x1

    .line 379
    .line 380
    move/from16 v8, p3

    .line 381
    .line 382
    if-le v7, v8, :cond_0

    .line 383
    .line 384
    goto :goto_b

    .line 385
    :cond_17
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    .line 386
    .line 387
    iget v3, v2, Lkz2;->b:I

    .line 388
    .line 389
    iget v2, v2, Lkz2;->c:I

    .line 390
    .line 391
    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 392
    .line 393
    .line 394
    move-result-object v4

    .line 395
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 396
    .line 397
    .line 398
    move-result v4

    .line 399
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 400
    .line 401
    .line 402
    move-result-object v5

    .line 403
    add-int/lit8 v4, v4, 0x11

    .line 404
    .line 405
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 406
    .line 407
    .line 408
    move-result v5

    .line 409
    new-instance v6, Ljava/lang/StringBuilder;

    .line 410
    .line 411
    add-int/2addr v4, v5

    .line 412
    invoke-direct {v6, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 413
    .line 414
    .line 415
    const-string v4, "position="

    .line 416
    .line 417
    const-string v5, ", limit="

    .line 418
    .line 419
    invoke-static {v6, v4, v3, v5, v2}, Lga1;->l(Ljava/lang/StringBuilder;Ljava/lang/String;ILjava/lang/String;I)Ljava/lang/String;

    .line 420
    .line 421
    .line 422
    move-result-object v2

    .line 423
    invoke-direct {v0, v2}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 424
    .line 425
    .line 426
    throw v0

    .line 427
    :catch_0
    :goto_b
    invoke-interface {v0}, Lmf1;->i()V

    .line 428
    .line 429
    .line 430
    invoke-interface {v0, v5}, Lmf1;->A(I)V

    .line 431
    .line 432
    .line 433
    return-object v6
.end method

.method public l(Ljo1;Lrl;Ljq3;)V
    .locals 2

    .line 1
    iget-object v0, p1, Ljo1;->j:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    const/4 v1, 0x1

    .line 5
    :try_start_0
    iput-boolean v1, p1, Ljo1;->n:Z

    .line 6
    .line 7
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    const-string v0, "post-response"

    .line 9
    .line 10
    invoke-virtual {p1, v0}, Ljo1;->a(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    new-instance v0, Lgi;

    .line 14
    .line 15
    const/16 v1, 0xb

    .line 16
    .line 17
    invoke-direct {v0, p1, p2, p3, v1}, Lgi;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 18
    .line 19
    .line 20
    iget-object p1, p0, Lf20;->g:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast p1, Lvb1;

    .line 23
    .line 24
    iget-object p1, p1, Lvb1;->g:Landroid/os/Handler;

    .line 25
    .line 26
    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :catchall_0
    move-exception p1

    .line 31
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 32
    throw p1
.end method

.method public varargs n(Ljava/lang/Object;[Ljava/lang/Object;)V
    .locals 3

    .line 1
    invoke-static {p2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    if-nez p1, :cond_2

    .line 6
    .line 7
    new-instance p1, Ljava/lang/NullPointerException;

    .line 8
    .line 9
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    new-instance v0, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    const-string v1, "["

    .line 16
    .line 17
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const/4 v1, 0x1

    .line 21
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-eqz v2, :cond_1

    .line 26
    .line 27
    if-nez v1, :cond_0

    .line 28
    .line 29
    const-string v1, ", "

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    :cond_0
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    const/4 v1, 0x0

    .line 42
    goto :goto_0

    .line 43
    :cond_1
    const/16 p2, 0x5d

    .line 44
    .line 45
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p2

    .line 52
    const-string v0, "null key in entry: null="

    .line 53
    .line 54
    invoke-virtual {v0, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p2

    .line 58
    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    throw p1

    .line 62
    :cond_2
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    if-nez v1, :cond_3

    .line 71
    .line 72
    goto :goto_2

    .line 73
    :cond_3
    iget-object v1, p0, Lf20;->g:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v1, Llm3;

    .line 76
    .line 77
    if-nez v1, :cond_4

    .line 78
    .line 79
    new-instance v1, Llm3;

    .line 80
    .line 81
    invoke-direct {v1}, Llm3;-><init>()V

    .line 82
    .line 83
    .line 84
    iput-object v1, p0, Lf20;->g:Ljava/lang/Object;

    .line 85
    .line 86
    :cond_4
    invoke-virtual {v1, p1}, Llm3;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    check-cast v1, Lrm3;

    .line 91
    .line 92
    if-nez v1, :cond_7

    .line 93
    .line 94
    instance-of v1, p2, Ljava/util/Set;

    .line 95
    .line 96
    const/4 v2, 0x4

    .line 97
    if-eqz v1, :cond_5

    .line 98
    .line 99
    check-cast p2, Ljava/util/Set;

    .line 100
    .line 101
    invoke-interface {p2}, Ljava/util/Set;->size()I

    .line 102
    .line 103
    .line 104
    move-result p2

    .line 105
    invoke-static {v2, p2}, Ljava/lang/Math;->max(II)I

    .line 106
    .line 107
    .line 108
    move-result v2

    .line 109
    :cond_5
    invoke-static {v2}, Ldn3;->l(I)Lcn3;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    iget-object p2, p0, Lf20;->g:Ljava/lang/Object;

    .line 114
    .line 115
    check-cast p2, Llm3;

    .line 116
    .line 117
    if-nez p2, :cond_6

    .line 118
    .line 119
    new-instance p2, Llm3;

    .line 120
    .line 121
    invoke-direct {p2}, Llm3;-><init>()V

    .line 122
    .line 123
    .line 124
    iput-object p2, p0, Lf20;->g:Ljava/lang/Object;

    .line 125
    .line 126
    :cond_6
    invoke-virtual {p2, p1, v1}, Llm3;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    :cond_7
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 130
    .line 131
    .line 132
    move-result p2

    .line 133
    if-eqz p2, :cond_8

    .line 134
    .line 135
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object p2

    .line 139
    invoke-static {p1, p2}, Lob1;->v(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {v1, p2}, Lrm3;->c(Ljava/lang/Object;)Lrm3;

    .line 143
    .line 144
    .line 145
    goto :goto_1

    .line 146
    :cond_8
    :goto_2
    return-void
.end method

.method public o(J)V
    .locals 2

    .line 1
    new-instance v0, Lbu1;

    .line 2
    .line 3
    const-string v1, "creation"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lbu1;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    iput-object p1, v0, Lbu1;->g:Ljava/lang/Object;

    .line 13
    .line 14
    const-string p1, "nativeObjectNotCreated"

    .line 15
    .line 16
    iput-object p1, v0, Lbu1;->i:Ljava/lang/Object;

    .line 17
    .line 18
    invoke-virtual {p0, v0}, Lf20;->r(Lbu1;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public p(Ljava/lang/Object;)V
    .locals 9

    .line 1
    iget v0, p0, Lf20;->f:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lf20;->g:Ljava/lang/Object;

    .line 7
    .line 8
    move-object v1, v0

    .line 9
    check-cast v1, Ljb3;

    .line 10
    .line 11
    monitor-enter v1

    .line 12
    :try_start_0
    iget-object v0, v1, Ljb3;->l:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    invoke-virtual {v0, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 16
    .line 17
    .line 18
    const/4 v0, 0x1

    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    iget-object v3, v1, Ljb3;->j:Lkb3;

    .line 22
    .line 23
    iget-wide v4, v3, Lkb3;->a:J

    .line 24
    .line 25
    iput-wide v4, v3, Lkb3;->e:J

    .line 26
    .line 27
    const-wide/16 v4, 0x0

    .line 28
    .line 29
    iput-wide v4, v3, Lkb3;->c:J

    .line 30
    .line 31
    iget-object v3, v1, Ljb3;->o:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 32
    .line 33
    invoke-virtual {v3, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v1, p1}, Ljb3;->a(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :catchall_0
    move-exception v0

    .line 41
    move-object p1, v0

    .line 42
    goto :goto_1

    .line 43
    :cond_0
    :goto_0
    if-nez p1, :cond_1

    .line 44
    .line 45
    move v2, v0

    .line 46
    :cond_1
    invoke-virtual {v1, v2}, Ljb3;->b(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 47
    .line 48
    .line 49
    monitor-exit v1

    .line 50
    return-void

    .line 51
    :goto_1
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 52
    throw p1

    .line 53
    :pswitch_0
    iget-object v0, p0, Lf20;->g:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v0, Lnj2;

    .line 56
    .line 57
    iget-object v1, v0, Lnj2;->l:Ldb3;

    .line 58
    .line 59
    iget-object v2, v0, Lnj2;->j:Lh83;

    .line 60
    .line 61
    iget-object v3, v0, Lnj2;->k:La83;

    .line 62
    .line 63
    const-string v5, ""

    .line 64
    .line 65
    move-object v6, p1

    .line 66
    check-cast v6, Ljava/lang/String;

    .line 67
    .line 68
    iget-object v7, v3, La83;->c:Ljava/util/List;

    .line 69
    .line 70
    const/4 v8, 0x0

    .line 71
    const/4 v4, 0x0

    .line 72
    invoke-virtual/range {v1 .. v8}, Ldb3;->b(Lh83;La83;ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;Lgm2;)Ljava/util/ArrayList;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    sget-object v1, Lhg4;->C:Lhg4;

    .line 77
    .line 78
    iget-object v1, v1, Lhg4;->h:Lgd2;

    .line 79
    .line 80
    iget-object v2, v0, Lnj2;->f:Landroid/content/Context;

    .line 81
    .line 82
    invoke-virtual {v1, v2}, Lgd2;->i(Landroid/content/Context;)Z

    .line 83
    .line 84
    .line 85
    move-result v1

    .line 86
    const/4 v2, 0x1

    .line 87
    if-eq v2, v1, :cond_2

    .line 88
    .line 89
    goto :goto_2

    .line 90
    :cond_2
    const/4 v2, 0x2

    .line 91
    :goto_2
    iget-object v0, v0, Lnj2;->m:Lq83;

    .line 92
    .line 93
    invoke-virtual {v0, v2, p1}, Lq83;->b(ILjava/util/ArrayList;)V

    .line 94
    .line 95
    .line 96
    return-void

    .line 97
    :pswitch_data_0
    .packed-switch 0x12
        :pswitch_0
    .end packed-switch
.end method

.method public q(ZLandroid/content/Context;Lan2;)V
    .locals 0

    .line 1
    return-void
.end method

.method public r(Lbu1;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Lbu1;->j()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const-string v0, "Dispatching AFMA event on publisher webview: "

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, Lgi2;->f0(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lf20;->g:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, Lm42;

    .line 17
    .line 18
    invoke-virtual {v0}, Lsb1;->U()Landroid/os/Parcel;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual {v1, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    const/4 p1, 0x1

    .line 26
    invoke-virtual {v0, v1, p1}, Lsb1;->M0(Landroid/os/Parcel;I)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public s(Ljava/lang/Throwable;)V
    .locals 3

    .line 1
    iget v0, p0, Lf20;->f:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lf20;->g:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Ljb3;

    .line 9
    .line 10
    monitor-enter v0

    .line 11
    :try_start_0
    iget-object v1, v0, Ljb3;->l:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-virtual {v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 15
    .line 16
    .line 17
    instance-of v1, p1, Lfb3;

    .line 18
    .line 19
    if-eqz v1, :cond_1

    .line 20
    .line 21
    check-cast p1, Lfb3;

    .line 22
    .line 23
    iget p1, p1, Lfb3;->f:I

    .line 24
    .line 25
    if-eqz p1, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/4 p1, 0x0

    .line 29
    throw p1

    .line 30
    :catchall_0
    move-exception p1

    .line 31
    goto :goto_1

    .line 32
    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 33
    invoke-virtual {v0, p1}, Ljb3;->b(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    .line 35
    .line 36
    monitor-exit v0

    .line 37
    return-void

    .line 38
    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 39
    throw p1

    .line 40
    :pswitch_0
    return-void

    :pswitch_data_0
    .packed-switch 0x12
        :pswitch_0
    .end packed-switch
.end method

.method public synthetic v(Ljava/lang/String;ILjava/lang/String;Z)V
    .locals 0

    .line 1
    iget-object p1, p0, Lf20;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p1, Lyw1;

    .line 4
    .line 5
    invoke-virtual {p1}, Lyw1;->d()V

    .line 6
    .line 7
    .line 8
    return-void
.end method
