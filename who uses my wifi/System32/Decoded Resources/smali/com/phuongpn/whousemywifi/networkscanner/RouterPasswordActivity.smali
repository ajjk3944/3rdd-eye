.class public final Lcom/phuongpn/whousemywifi/networkscanner/RouterPasswordActivity;
.super Li5;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lpt0;


# static fields
.field public static final synthetic H:I


# instance fields
.field public C:Lxb4;

.field public D:Ljr0;

.field public E:Ljava/util/ArrayList;

.field public F:Landroid/content/SharedPreferences;

.field public G:Lk52;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Li5;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final hidePrompt(Landroid/view/View;)V
    .locals 2

    .line 1
    const-string v0, "v"

    .line 2
    .line 3
    invoke-static {p1, v0}, Li30;->m(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lcom/phuongpn/whousemywifi/networkscanner/RouterPasswordActivity;->C:Lxb4;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    if-eqz p1, :cond_1

    .line 10
    .line 11
    iget-object p1, p1, Lxb4;->g:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p1, Landroid/widget/LinearLayout;

    .line 14
    .line 15
    const/16 v1, 0x8

    .line 16
    .line 17
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 18
    .line 19
    .line 20
    :try_start_0
    iget-object p1, p0, Lcom/phuongpn/whousemywifi/networkscanner/RouterPasswordActivity;->F:Landroid/content/SharedPreferences;

    .line 21
    .line 22
    if-eqz p1, :cond_0

    .line 23
    .line 24
    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    const-string v0, "rtpss_promt"

    .line 29
    .line 30
    const/4 v1, 0x0

    .line 31
    invoke-interface {p1, v0, v1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :cond_0
    const-string p1, "prefs"

    .line 40
    .line 41
    invoke-static {p1}, Li30;->S(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    throw v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 45
    :catch_0
    return-void

    .line 46
    :cond_1
    const-string p1, "binding"

    .line 47
    .line 48
    invoke-static {p1}, Li30;->S(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    throw v0
.end method

.method public final onCreate(Landroid/os/Bundle;)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-super/range {p0 .. p1}, Li5;->onCreate(Landroid/os/Bundle;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    const v2, 0x7f0c0021

    .line 11
    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    const/4 v4, 0x0

    .line 15
    invoke-virtual {v1, v2, v3, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    const v2, 0x7f0901f1

    .line 20
    .line 21
    .line 22
    invoke-static {v1, v2}, La30;->e(Landroid/view/View;I)Landroid/view/View;

    .line 23
    .line 24
    .line 25
    move-result-object v5

    .line 26
    check-cast v5, Landroid/widget/LinearLayout;

    .line 27
    .line 28
    if-eqz v5, :cond_15

    .line 29
    .line 30
    const v2, 0x7f0901f5

    .line 31
    .line 32
    .line 33
    invoke-static {v1, v2}, La30;->e(Landroid/view/View;I)Landroid/view/View;

    .line 34
    .line 35
    .line 36
    move-result-object v6

    .line 37
    check-cast v6, Landroidx/recyclerview/widget/RecyclerView;

    .line 38
    .line 39
    if-eqz v6, :cond_15

    .line 40
    .line 41
    const v2, 0x7f090263

    .line 42
    .line 43
    .line 44
    invoke-static {v1, v2}, La30;->e(Landroid/view/View;I)Landroid/view/View;

    .line 45
    .line 46
    .line 47
    move-result-object v7

    .line 48
    check-cast v7, Landroidx/appcompat/widget/Toolbar;

    .line 49
    .line 50
    if-eqz v7, :cond_15

    .line 51
    .line 52
    new-instance v2, Lxb4;

    .line 53
    .line 54
    check-cast v1, Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    .line 55
    .line 56
    invoke-direct {v2, v1, v5, v6, v7}, Lxb4;-><init>(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/widget/LinearLayout;Landroidx/recyclerview/widget/RecyclerView;Landroidx/appcompat/widget/Toolbar;)V

    .line 57
    .line 58
    .line 59
    iput-object v2, v0, Lcom/phuongpn/whousemywifi/networkscanner/RouterPasswordActivity;->C:Lxb4;

    .line 60
    .line 61
    const-string v2, "getRoot(...)"

    .line 62
    .line 63
    invoke-static {v1, v2}, Li30;->l(Ljava/lang/Object;Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0, v1}, Li5;->setContentView(Landroid/view/View;)V

    .line 67
    .line 68
    .line 69
    iget-object v1, v0, Lcom/phuongpn/whousemywifi/networkscanner/RouterPasswordActivity;->C:Lxb4;

    .line 70
    .line 71
    const-string v2, "binding"

    .line 72
    .line 73
    if-eqz v1, :cond_14

    .line 74
    .line 75
    iget-object v1, v1, Lxb4;->i:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast v1, Landroidx/appcompat/widget/Toolbar;

    .line 78
    .line 79
    invoke-virtual {v0, v1}, Li5;->w(Landroidx/appcompat/widget/Toolbar;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v0}, Li5;->n()Lm54;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    const/4 v5, 0x1

    .line 87
    if-eqz v1, :cond_0

    .line 88
    .line 89
    invoke-virtual {v1, v5}, Lm54;->y(Z)V

    .line 90
    .line 91
    .line 92
    :cond_0
    new-instance v1, La3;

    .line 93
    .line 94
    const/4 v6, 0x1

    .line 95
    invoke-direct {v1, v6}, Lf74;-><init>(I)V

    .line 96
    .line 97
    .line 98
    new-instance v6, Lb3;

    .line 99
    .line 100
    invoke-direct {v6, v1}, Lb3;-><init>(Lf74;)V

    .line 101
    .line 102
    .line 103
    const v1, 0x7f120027

    .line 104
    .line 105
    .line 106
    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    new-instance v7, Lfr0;

    .line 111
    .line 112
    const/4 v8, 0x1

    .line 113
    invoke-direct {v7, v0, v8}, Lfr0;-><init>(Li5;I)V

    .line 114
    .line 115
    .line 116
    invoke-static {v0, v1, v6, v7}, Lg30;->a(Landroid/content/Context;Ljava/lang/String;Lb3;Lh30;)V

    .line 117
    .line 118
    .line 119
    new-instance v1, Ljava/util/ArrayList;

    .line 120
    .line 121
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 122
    .line 123
    .line 124
    iput-object v1, v0, Lcom/phuongpn/whousemywifi/networkscanner/RouterPasswordActivity;->E:Ljava/util/ArrayList;

    .line 125
    .line 126
    invoke-virtual {v0}, Li5;->getResources()Landroid/content/res/Resources;

    .line 127
    .line 128
    .line 129
    move-result-object v1

    .line 130
    const v6, 0x7f030eb9

    .line 131
    .line 132
    .line 133
    invoke-virtual {v1, v6}, Landroid/content/res/Resources;->obtainTypedArray(I)Landroid/content/res/TypedArray;

    .line 134
    .line 135
    .line 136
    move-result-object v1

    .line 137
    const-string v6, "obtainTypedArray(...)"

    .line 138
    .line 139
    invoke-static {v1, v6}, Li30;->l(Ljava/lang/Object;Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {v1}, Landroid/content/res/TypedArray;->length()I

    .line 143
    .line 144
    .line 145
    move-result v6

    .line 146
    new-array v7, v6, [[Ljava/lang/String;

    .line 147
    .line 148
    iget-object v8, v0, Lcom/phuongpn/whousemywifi/networkscanner/RouterPasswordActivity;->E:Ljava/util/ArrayList;

    .line 149
    .line 150
    const-string v9, "routers"

    .line 151
    .line 152
    if-eqz v8, :cond_13

    .line 153
    .line 154
    invoke-virtual {v8}, Ljava/util/ArrayList;->isEmpty()Z

    .line 155
    .line 156
    .line 157
    move-result v8

    .line 158
    if-nez v8, :cond_2

    .line 159
    .line 160
    iget-object v8, v0, Lcom/phuongpn/whousemywifi/networkscanner/RouterPasswordActivity;->E:Ljava/util/ArrayList;

    .line 161
    .line 162
    if-eqz v8, :cond_1

    .line 163
    .line 164
    invoke-virtual {v8}, Ljava/util/ArrayList;->clear()V

    .line 165
    .line 166
    .line 167
    goto :goto_0

    .line 168
    :cond_1
    invoke-static {v9}, Li30;->S(Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    throw v3

    .line 172
    :cond_2
    :goto_0
    move v8, v4

    .line 173
    :goto_1
    if-ge v8, v6, :cond_d

    .line 174
    .line 175
    invoke-virtual {v1, v8, v4}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 176
    .line 177
    .line 178
    move-result v10

    .line 179
    if-lez v10, :cond_c

    .line 180
    .line 181
    invoke-virtual {v0}, Li5;->getResources()Landroid/content/res/Resources;

    .line 182
    .line 183
    .line 184
    move-result-object v11

    .line 185
    invoke-virtual {v11, v10}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object v10

    .line 189
    aput-object v10, v7, v8

    .line 190
    .line 191
    const/4 v11, 0x2

    .line 192
    if-eqz v10, :cond_3

    .line 193
    .line 194
    aget-object v12, v10, v11

    .line 195
    .line 196
    goto :goto_2

    .line 197
    :cond_3
    move-object v12, v3

    .line 198
    :goto_2
    const-string v13, ""

    .line 199
    .line 200
    if-eqz v12, :cond_5

    .line 201
    .line 202
    if-eqz v10, :cond_4

    .line 203
    .line 204
    aget-object v10, v10, v11

    .line 205
    .line 206
    goto :goto_3

    .line 207
    :cond_4
    move-object v10, v3

    .line 208
    :goto_3
    invoke-static {v10}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object v10

    .line 212
    invoke-static {v10}, Lsy0;->J(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 213
    .line 214
    .line 215
    move-result-object v10

    .line 216
    invoke-virtual {v10}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    move-result-object v10

    .line 220
    goto :goto_4

    .line 221
    :cond_5
    move-object v10, v13

    .line 222
    :goto_4
    aget-object v11, v7, v8

    .line 223
    .line 224
    const/4 v12, 0x3

    .line 225
    if-eqz v11, :cond_6

    .line 226
    .line 227
    aget-object v14, v11, v12

    .line 228
    .line 229
    goto :goto_5

    .line 230
    :cond_6
    move-object v14, v3

    .line 231
    :goto_5
    if-eqz v14, :cond_8

    .line 232
    .line 233
    if-eqz v11, :cond_7

    .line 234
    .line 235
    aget-object v11, v11, v12

    .line 236
    .line 237
    goto :goto_6

    .line 238
    :cond_7
    move-object v11, v3

    .line 239
    :goto_6
    invoke-static {v11}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 240
    .line 241
    .line 242
    move-result-object v11

    .line 243
    invoke-static {v11}, Lsy0;->J(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 244
    .line 245
    .line 246
    move-result-object v11

    .line 247
    invoke-virtual {v11}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 248
    .line 249
    .line 250
    move-result-object v13

    .line 251
    :cond_8
    iget-object v11, v0, Lcom/phuongpn/whousemywifi/networkscanner/RouterPasswordActivity;->E:Ljava/util/ArrayList;

    .line 252
    .line 253
    if-eqz v11, :cond_b

    .line 254
    .line 255
    new-instance v12, Lhr0;

    .line 256
    .line 257
    aget-object v14, v7, v8

    .line 258
    .line 259
    if-eqz v14, :cond_9

    .line 260
    .line 261
    aget-object v14, v14, v4

    .line 262
    .line 263
    goto :goto_7

    .line 264
    :cond_9
    move-object v14, v3

    .line 265
    :goto_7
    invoke-static {v14}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 266
    .line 267
    .line 268
    move-result-object v14

    .line 269
    aget-object v15, v7, v8

    .line 270
    .line 271
    if-eqz v15, :cond_a

    .line 272
    .line 273
    aget-object v15, v15, v5

    .line 274
    .line 275
    goto :goto_8

    .line 276
    :cond_a
    move-object v15, v3

    .line 277
    :goto_8
    invoke-static {v15}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 278
    .line 279
    .line 280
    move-result-object v15

    .line 281
    move-object/from16 p1, v3

    .line 282
    .line 283
    const-string v3, "username"

    .line 284
    .line 285
    invoke-static {v10, v3}, Li30;->m(Ljava/lang/Object;Ljava/lang/String;)V

    .line 286
    .line 287
    .line 288
    const-string v3, "password"

    .line 289
    .line 290
    invoke-static {v13, v3}, Li30;->m(Ljava/lang/Object;Ljava/lang/String;)V

    .line 291
    .line 292
    .line 293
    invoke-direct {v12}, Ljava/lang/Object;-><init>()V

    .line 294
    .line 295
    .line 296
    iput-object v14, v12, Lhr0;->a:Ljava/lang/String;

    .line 297
    .line 298
    iput-object v15, v12, Lhr0;->b:Ljava/lang/String;

    .line 299
    .line 300
    iput-object v10, v12, Lhr0;->c:Ljava/lang/String;

    .line 301
    .line 302
    iput-object v13, v12, Lhr0;->d:Ljava/lang/String;

    .line 303
    .line 304
    invoke-virtual {v11, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 305
    .line 306
    .line 307
    goto :goto_9

    .line 308
    :cond_b
    move-object/from16 p1, v3

    .line 309
    .line 310
    invoke-static {v9}, Li30;->S(Ljava/lang/String;)V

    .line 311
    .line 312
    .line 313
    throw p1

    .line 314
    :cond_c
    move-object/from16 p1, v3

    .line 315
    .line 316
    :goto_9
    add-int/lit8 v8, v8, 0x1

    .line 317
    .line 318
    move-object/from16 v3, p1

    .line 319
    .line 320
    goto/16 :goto_1

    .line 321
    .line 322
    :cond_d
    move-object/from16 p1, v3

    .line 323
    .line 324
    invoke-virtual {v1}, Landroid/content/res/TypedArray;->recycle()V

    .line 325
    .line 326
    .line 327
    new-instance v1, Ljr0;

    .line 328
    .line 329
    iget-object v3, v0, Lcom/phuongpn/whousemywifi/networkscanner/RouterPasswordActivity;->E:Ljava/util/ArrayList;

    .line 330
    .line 331
    if-eqz v3, :cond_12

    .line 332
    .line 333
    new-instance v6, Lwk0;

    .line 334
    .line 335
    const/4 v7, 0x2

    .line 336
    invoke-direct {v6, v7}, Lwk0;-><init>(I)V

    .line 337
    .line 338
    .line 339
    invoke-direct {v1, v3, v6}, Ljr0;-><init>(Ljava/util/ArrayList;Lwk0;)V

    .line 340
    .line 341
    .line 342
    iput-object v1, v0, Lcom/phuongpn/whousemywifi/networkscanner/RouterPasswordActivity;->D:Ljr0;

    .line 343
    .line 344
    iget-object v1, v0, Lcom/phuongpn/whousemywifi/networkscanner/RouterPasswordActivity;->C:Lxb4;

    .line 345
    .line 346
    if-eqz v1, :cond_11

    .line 347
    .line 348
    iget-object v1, v1, Lxb4;->h:Ljava/lang/Object;

    .line 349
    .line 350
    check-cast v1, Landroidx/recyclerview/widget/RecyclerView;

    .line 351
    .line 352
    invoke-virtual {v1, v5}, Landroidx/recyclerview/widget/RecyclerView;->setHasFixedSize(Z)V

    .line 353
    .line 354
    .line 355
    new-instance v3, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 356
    .line 357
    invoke-direct {v3, v5}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(I)V

    .line 358
    .line 359
    .line 360
    invoke-virtual {v1, v3}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Lho0;)V

    .line 361
    .line 362
    .line 363
    iget-object v3, v0, Lcom/phuongpn/whousemywifi/networkscanner/RouterPasswordActivity;->D:Ljr0;

    .line 364
    .line 365
    if-eqz v3, :cond_10

    .line 366
    .line 367
    invoke-virtual {v1, v3}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Lao0;)V

    .line 368
    .line 369
    .line 370
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 371
    .line 372
    .line 373
    move-result-object v1

    .line 374
    invoke-static {v1}, Lgm0;->a(Landroid/content/Context;)Ljava/lang/String;

    .line 375
    .line 376
    .line 377
    move-result-object v3

    .line 378
    invoke-virtual {v1, v3, v4}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 379
    .line 380
    .line 381
    move-result-object v1

    .line 382
    const-string v3, "getDefaultSharedPreferences(...)"

    .line 383
    .line 384
    invoke-static {v1, v3}, Li30;->l(Ljava/lang/Object;Ljava/lang/String;)V

    .line 385
    .line 386
    .line 387
    iput-object v1, v0, Lcom/phuongpn/whousemywifi/networkscanner/RouterPasswordActivity;->F:Landroid/content/SharedPreferences;

    .line 388
    .line 389
    const-string v3, "rtpss_promt"

    .line 390
    .line 391
    invoke-interface {v1, v3, v5}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 392
    .line 393
    .line 394
    move-result v1

    .line 395
    if-nez v1, :cond_f

    .line 396
    .line 397
    iget-object v1, v0, Lcom/phuongpn/whousemywifi/networkscanner/RouterPasswordActivity;->C:Lxb4;

    .line 398
    .line 399
    if-eqz v1, :cond_e

    .line 400
    .line 401
    iget-object v1, v1, Lxb4;->g:Ljava/lang/Object;

    .line 402
    .line 403
    check-cast v1, Landroid/widget/LinearLayout;

    .line 404
    .line 405
    const/16 v2, 0x8

    .line 406
    .line 407
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 408
    .line 409
    .line 410
    goto :goto_a

    .line 411
    :cond_e
    invoke-static {v2}, Li30;->S(Ljava/lang/String;)V

    .line 412
    .line 413
    .line 414
    throw p1

    .line 415
    :cond_f
    :goto_a
    invoke-virtual {v0}, Lch;->i()Laj0;

    .line 416
    .line 417
    .line 418
    move-result-object v1

    .line 419
    new-instance v2, Lqw;

    .line 420
    .line 421
    const/4 v3, 0x2

    .line 422
    invoke-direct {v2, v0, v3}, Lqw;-><init>(Li5;I)V

    .line 423
    .line 424
    .line 425
    invoke-virtual {v1, v0, v2}, Laj0;->a(Lb60;Lqw;)V

    .line 426
    .line 427
    .line 428
    return-void

    .line 429
    :cond_10
    const-string v1, "routerAdapter"

    .line 430
    .line 431
    invoke-static {v1}, Li30;->S(Ljava/lang/String;)V

    .line 432
    .line 433
    .line 434
    throw p1

    .line 435
    :cond_11
    invoke-static {v2}, Li30;->S(Ljava/lang/String;)V

    .line 436
    .line 437
    .line 438
    throw p1

    .line 439
    :cond_12
    invoke-static {v9}, Li30;->S(Ljava/lang/String;)V

    .line 440
    .line 441
    .line 442
    throw p1

    .line 443
    :cond_13
    move-object/from16 p1, v3

    .line 444
    .line 445
    invoke-static {v9}, Li30;->S(Ljava/lang/String;)V

    .line 446
    .line 447
    .line 448
    throw p1

    .line 449
    :cond_14
    move-object/from16 p1, v3

    .line 450
    .line 451
    invoke-static {v2}, Li30;->S(Ljava/lang/String;)V

    .line 452
    .line 453
    .line 454
    throw p1

    .line 455
    :cond_15
    invoke-virtual {v1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 456
    .line 457
    .line 458
    move-result-object v1

    .line 459
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 460
    .line 461
    .line 462
    move-result-object v1

    .line 463
    new-instance v2, Ljava/lang/NullPointerException;

    .line 464
    .line 465
    const-string v3, "Missing required view with ID: "

    .line 466
    .line 467
    invoke-virtual {v3, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 468
    .line 469
    .line 470
    move-result-object v1

    .line 471
    invoke-direct {v2, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 472
    .line 473
    .line 474
    throw v2
.end method

.method public final onCreateOptionsMenu(Landroid/view/Menu;)Z
    .locals 2

    .line 1
    const-string v0, "menu"

    .line 2
    .line 3
    invoke-static {p1, v0}, Li30;->m(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Li5;->getMenuInflater()Landroid/view/MenuInflater;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const v1, 0x7f0e0002

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v1, p1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    .line 14
    .line 15
    .line 16
    const v0, 0x7f09004c

    .line 17
    .line 18
    .line 19
    invoke-interface {p1, v0}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    const-string v0, "findItem(...)"

    .line 24
    .line 25
    invoke-static {p1, v0}, Li30;->l(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    const/16 v0, 0xa

    .line 29
    .line 30
    invoke-interface {p1, v0}, Landroid/view/MenuItem;->setShowAsActionFlags(I)Landroid/view/MenuItem;

    .line 31
    .line 32
    .line 33
    invoke-interface {p1}, Landroid/view/MenuItem;->getActionView()Landroid/view/View;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    const-string v0, "null cannot be cast to non-null type androidx.appcompat.widget.SearchView"

    .line 38
    .line 39
    invoke-static {p1, v0}, Li30;->k(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    check-cast p1, Landroidx/appcompat/widget/SearchView;

    .line 43
    .line 44
    const v0, 0x7f120146

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/SearchView;->setQueryHint(Ljava/lang/CharSequence;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p1, p0}, Landroidx/appcompat/widget/SearchView;->setOnQueryTextListener(Lpt0;)V

    .line 55
    .line 56
    .line 57
    const/4 p1, 0x1

    .line 58
    return p1
.end method

.method public final onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 2

    .line 1
    const-string v0, "item"

    .line 2
    .line 3
    invoke-static {p1, v0}, Li30;->m(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const v1, 0x7f09003f

    .line 11
    .line 12
    .line 13
    if-ne v0, v1, :cond_0

    .line 14
    .line 15
    new-instance v0, Landroid/content/Intent;

    .line 16
    .line 17
    const-class v1, Lcom/phuongpn/whousemywifi/networkscanner/HelpActivity;

    .line 18
    .line 19
    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    const v1, 0x102002c

    .line 31
    .line 32
    .line 33
    if-ne v0, v1, :cond_1

    .line 34
    .line 35
    invoke-virtual {p0}, Lch;->i()Laj0;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-virtual {p1}, Laj0;->c()V

    .line 40
    .line 41
    .line 42
    const/4 p1, 0x1

    .line 43
    return p1

    .line 44
    :cond_1
    :goto_0
    invoke-super {p0, p1}, Landroid/app/Activity;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    return p1
.end method
