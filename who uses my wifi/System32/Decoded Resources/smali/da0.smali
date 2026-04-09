.class public final synthetic Lda0;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lmz;
.implements Lig0;


# instance fields
.field public final synthetic f:Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lda0;->f:Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a(Lbw;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lda0;->f:Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    sget-object v1, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->d0:[I

    .line 6
    .line 7
    iget v1, p1, Lbw;->b:I

    .line 8
    .line 9
    iget-object p1, p1, Lbw;->a:Ljava/lang/String;

    .line 10
    .line 11
    new-instance v2, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    const-string v1, ": "

    .line 20
    .line 21
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    const-string v1, "msg"

    .line 32
    .line 33
    invoke-static {p1, v1}, Li30;->m(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    :cond_0
    iget-object p1, v0, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->X:Lf20;

    .line 37
    .line 38
    const/4 v1, 0x0

    .line 39
    if-eqz p1, :cond_4

    .line 40
    .line 41
    iget-object p1, p1, Lf20;->g:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast p1, Lva4;

    .line 44
    .line 45
    invoke-virtual {p1}, Lva4;->a()Z

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    if-eqz p1, :cond_3

    .line 50
    .line 51
    iget-object p1, v0, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->Y:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 52
    .line 53
    const/4 v2, 0x1

    .line 54
    invoke-virtual {p1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    .line 55
    .line 56
    .line 57
    move-result p1

    .line 58
    if-eqz p1, :cond_1

    .line 59
    .line 60
    goto :goto_2

    .line 61
    :cond_1
    const-string p1, "D95CBDBF1A2CCD1B6766C3D9D2B99818"

    .line 62
    .line 63
    const-string v2, "33C61DE73F8EAEB87B9ECE6E920D98CC"

    .line 64
    .line 65
    const-string v3, "8BB648896523BB8F17DB8AD774027092"

    .line 66
    .line 67
    filled-new-array {p1, v2, v3}, [Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    invoke-static {p1}, Lzf;->j0([Ljava/lang/Object;)Ljava/util/List;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    new-instance v2, Ljava/util/ArrayList;

    .line 76
    .line 77
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 84
    .line 85
    .line 86
    new-instance p1, Lpp0;

    .line 87
    .line 88
    invoke-direct {p1, v2}, Lpp0;-><init>(Ljava/util/ArrayList;)V

    .line 89
    .line 90
    .line 91
    invoke-static {}, Lf53;->d()Lf53;

    .line 92
    .line 93
    .line 94
    move-result-object v2

    .line 95
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    iget-object v3, v2, Lf53;->e:Ljava/lang/Object;

    .line 99
    .line 100
    monitor-enter v3

    .line 101
    :try_start_0
    iget-object v4, v2, Lf53;->g:Lpp0;

    .line 102
    .line 103
    iput-object p1, v2, Lf53;->g:Lpp0;

    .line 104
    .line 105
    iget-object p1, v2, Lf53;->f:Lzn2;

    .line 106
    .line 107
    if-nez p1, :cond_2

    .line 108
    .line 109
    monitor-exit v3

    .line 110
    goto :goto_0

    .line 111
    :catchall_0
    move-exception p1

    .line 112
    goto :goto_1

    .line 113
    :cond_2
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 114
    .line 115
    .line 116
    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 117
    :goto_0
    sget-object p1, Lfp;->b:Len;

    .line 118
    .line 119
    invoke-static {p1}, Lwl2;->a(Lhk;)Lmj;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    new-instance v2, Lta0;

    .line 124
    .line 125
    invoke-direct {v2, v0, v1}, Lta0;-><init>(Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;Loj;)V

    .line 126
    .line 127
    .line 128
    const/4 v0, 0x3

    .line 129
    invoke-static {p1, v1, v2, v0}, Lgi2;->q(Lqk;Lhk;Lhy;I)Lyn;

    .line 130
    .line 131
    .line 132
    return-void

    .line 133
    :goto_1
    :try_start_1
    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 134
    throw p1

    .line 135
    :cond_3
    :goto_2
    return-void

    .line 136
    :cond_4
    const-string p1, "googleMobileAdsConsentManager"

    .line 137
    .line 138
    invoke-static {p1}, Li30;->S(Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    throw v1
.end method

.method public c(Lr82;)V
    .locals 14

    .line 1
    sget-object v0, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->d0:[I

    .line 2
    .line 3
    iget-object v0, p0, Lda0;->f:Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const v2, 0x7f0c0023

    .line 10
    .line 11
    .line 12
    const/4 v3, 0x0

    .line 13
    const/4 v4, 0x0

    .line 14
    invoke-virtual {v1, v2, v3, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    const v2, 0x7f090055

    .line 19
    .line 20
    .line 21
    invoke-static {v1, v2}, La30;->e(Landroid/view/View;I)Landroid/view/View;

    .line 22
    .line 23
    .line 24
    move-result-object v5

    .line 25
    check-cast v5, Landroid/widget/TextView;

    .line 26
    .line 27
    if-eqz v5, :cond_c

    .line 28
    .line 29
    const v2, 0x7f090056

    .line 30
    .line 31
    .line 32
    invoke-static {v1, v2}, La30;->e(Landroid/view/View;I)Landroid/view/View;

    .line 33
    .line 34
    .line 35
    move-result-object v6

    .line 36
    check-cast v6, Landroid/widget/ImageView;

    .line 37
    .line 38
    if-eqz v6, :cond_c

    .line 39
    .line 40
    const v2, 0x7f090057

    .line 41
    .line 42
    .line 43
    invoke-static {v1, v2}, La30;->e(Landroid/view/View;I)Landroid/view/View;

    .line 44
    .line 45
    .line 46
    move-result-object v7

    .line 47
    check-cast v7, Landroid/widget/TextView;

    .line 48
    .line 49
    if-eqz v7, :cond_c

    .line 50
    .line 51
    const v2, 0x7f090058

    .line 52
    .line 53
    .line 54
    invoke-static {v1, v2}, La30;->e(Landroid/view/View;I)Landroid/view/View;

    .line 55
    .line 56
    .line 57
    move-result-object v8

    .line 58
    check-cast v8, Landroid/widget/Button;

    .line 59
    .line 60
    if-eqz v8, :cond_c

    .line 61
    .line 62
    const v2, 0x7f090059

    .line 63
    .line 64
    .line 65
    invoke-static {v1, v2}, La30;->e(Landroid/view/View;I)Landroid/view/View;

    .line 66
    .line 67
    .line 68
    move-result-object v9

    .line 69
    check-cast v9, Landroid/widget/TextView;

    .line 70
    .line 71
    if-eqz v9, :cond_c

    .line 72
    .line 73
    const v2, 0x7f09005c

    .line 74
    .line 75
    .line 76
    invoke-static {v1, v2}, La30;->e(Landroid/view/View;I)Landroid/view/View;

    .line 77
    .line 78
    .line 79
    move-result-object v10

    .line 80
    check-cast v10, Lcom/google/android/gms/ads/nativead/MediaView;

    .line 81
    .line 82
    if-eqz v10, :cond_c

    .line 83
    .line 84
    const v2, 0x7f09005d

    .line 85
    .line 86
    .line 87
    invoke-static {v1, v2}, La30;->e(Landroid/view/View;I)Landroid/view/View;

    .line 88
    .line 89
    .line 90
    move-result-object v11

    .line 91
    check-cast v11, Landroid/widget/TextView;

    .line 92
    .line 93
    if-eqz v11, :cond_c

    .line 94
    .line 95
    const v2, 0x7f09005e

    .line 96
    .line 97
    .line 98
    invoke-static {v1, v2}, La30;->e(Landroid/view/View;I)Landroid/view/View;

    .line 99
    .line 100
    .line 101
    move-result-object v12

    .line 102
    check-cast v12, Landroid/widget/RatingBar;

    .line 103
    .line 104
    if-eqz v12, :cond_c

    .line 105
    .line 106
    const v2, 0x7f09005f

    .line 107
    .line 108
    .line 109
    invoke-static {v1, v2}, La30;->e(Landroid/view/View;I)Landroid/view/View;

    .line 110
    .line 111
    .line 112
    move-result-object v13

    .line 113
    check-cast v13, Landroid/widget/TextView;

    .line 114
    .line 115
    if-eqz v13, :cond_c

    .line 116
    .line 117
    check-cast v1, Lcom/google/android/gms/ads/nativead/NativeAdView;

    .line 118
    .line 119
    const-string v2, "getRoot(...)"

    .line 120
    .line 121
    invoke-static {v1, v2}, Li30;->l(Ljava/lang/Object;Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {v1, v10}, Lcom/google/android/gms/ads/nativead/NativeAdView;->setMediaView(Lcom/google/android/gms/ads/nativead/MediaView;)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {v1, v9}, Lcom/google/android/gms/ads/nativead/NativeAdView;->setHeadlineView(Landroid/view/View;)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {v1, v7}, Lcom/google/android/gms/ads/nativead/NativeAdView;->setBodyView(Landroid/view/View;)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {v1, v8}, Lcom/google/android/gms/ads/nativead/NativeAdView;->setCallToActionView(Landroid/view/View;)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {v1, v6}, Lcom/google/android/gms/ads/nativead/NativeAdView;->setIconView(Landroid/view/View;)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {v1, v11}, Lcom/google/android/gms/ads/nativead/NativeAdView;->setPriceView(Landroid/view/View;)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {v1, v12}, Lcom/google/android/gms/ads/nativead/NativeAdView;->setStarRatingView(Landroid/view/View;)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {v1, v13}, Lcom/google/android/gms/ads/nativead/NativeAdView;->setStoreView(Landroid/view/View;)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {v1, v5}, Lcom/google/android/gms/ads/nativead/NativeAdView;->setAdvertiserView(Landroid/view/View;)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {p1}, Lr82;->b()Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object v2

    .line 155
    invoke-virtual {v9, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 156
    .line 157
    .line 158
    :try_start_0
    iget-object v2, p1, Lr82;->a:Lf32;

    .line 159
    .line 160
    invoke-interface {v2}, Lf32;->A()Lz12;

    .line 161
    .line 162
    .line 163
    move-result-object v9

    .line 164
    if-eqz v9, :cond_0

    .line 165
    .line 166
    new-instance v9, Lr73;

    .line 167
    .line 168
    invoke-interface {v2}, Lf32;->A()Lz12;

    .line 169
    .line 170
    .line 171
    move-result-object v2

    .line 172
    invoke-direct {v9, v2}, Lr73;-><init>(Lz12;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 173
    .line 174
    .line 175
    goto :goto_2

    .line 176
    :catch_0
    move-exception v2

    .line 177
    goto :goto_1

    .line 178
    :cond_0
    :goto_0
    move-object v9, v3

    .line 179
    goto :goto_2

    .line 180
    :goto_1
    const-string v9, ""

    .line 181
    .line 182
    invoke-static {v9, v2}, Lgi2;->c0(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 183
    .line 184
    .line 185
    goto :goto_0

    .line 186
    :goto_2
    if-eqz v9, :cond_1

    .line 187
    .line 188
    invoke-virtual {v10, v9}, Lcom/google/android/gms/ads/nativead/MediaView;->setMediaContent(Lxc0;)V

    .line 189
    .line 190
    .line 191
    :cond_1
    invoke-virtual {p1}, Lr82;->a()Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object v2

    .line 195
    const/4 v9, 0x4

    .line 196
    if-nez v2, :cond_2

    .line 197
    .line 198
    invoke-virtual {v7, v9}, Landroid/view/View;->setVisibility(I)V

    .line 199
    .line 200
    .line 201
    goto :goto_3

    .line 202
    :cond_2
    invoke-virtual {v7, v4}, Landroid/view/View;->setVisibility(I)V

    .line 203
    .line 204
    .line 205
    invoke-virtual {p1}, Lr82;->a()Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object v2

    .line 209
    invoke-virtual {v7, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 210
    .line 211
    .line 212
    :goto_3
    invoke-virtual {p1}, Lr82;->f()Ljava/lang/String;

    .line 213
    .line 214
    .line 215
    move-result-object v2

    .line 216
    if-nez v2, :cond_3

    .line 217
    .line 218
    invoke-virtual {v8, v9}, Landroid/view/View;->setVisibility(I)V

    .line 219
    .line 220
    .line 221
    goto :goto_4

    .line 222
    :cond_3
    invoke-virtual {v8, v4}, Landroid/view/View;->setVisibility(I)V

    .line 223
    .line 224
    .line 225
    invoke-virtual {p1}, Lr82;->f()Ljava/lang/String;

    .line 226
    .line 227
    .line 228
    move-result-object v2

    .line 229
    invoke-virtual {v8, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 230
    .line 231
    .line 232
    :goto_4
    iget-object v2, p1, Lr82;->c:Ll92;

    .line 233
    .line 234
    if-nez v2, :cond_4

    .line 235
    .line 236
    const/16 v2, 0x8

    .line 237
    .line 238
    invoke-virtual {v6, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 239
    .line 240
    .line 241
    goto :goto_6

    .line 242
    :cond_4
    if-eqz v2, :cond_5

    .line 243
    .line 244
    iget-object v2, v2, Ll92;->g:Ljava/lang/Object;

    .line 245
    .line 246
    check-cast v2, Landroid/graphics/drawable/Drawable;

    .line 247
    .line 248
    goto :goto_5

    .line 249
    :cond_5
    move-object v2, v3

    .line 250
    :goto_5
    invoke-virtual {v6, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 251
    .line 252
    .line 253
    invoke-virtual {v6, v4}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 254
    .line 255
    .line 256
    :goto_6
    invoke-virtual {p1}, Lr82;->g()Ljava/lang/String;

    .line 257
    .line 258
    .line 259
    move-result-object v2

    .line 260
    if-nez v2, :cond_6

    .line 261
    .line 262
    invoke-virtual {v11, v9}, Landroid/view/View;->setVisibility(I)V

    .line 263
    .line 264
    .line 265
    goto :goto_7

    .line 266
    :cond_6
    invoke-virtual {v11, v4}, Landroid/view/View;->setVisibility(I)V

    .line 267
    .line 268
    .line 269
    invoke-virtual {p1}, Lr82;->g()Ljava/lang/String;

    .line 270
    .line 271
    .line 272
    move-result-object v2

    .line 273
    invoke-virtual {v11, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 274
    .line 275
    .line 276
    :goto_7
    invoke-virtual {p1}, Lr82;->i()Ljava/lang/String;

    .line 277
    .line 278
    .line 279
    move-result-object v2

    .line 280
    if-nez v2, :cond_7

    .line 281
    .line 282
    invoke-virtual {v13, v9}, Landroid/view/View;->setVisibility(I)V

    .line 283
    .line 284
    .line 285
    goto :goto_8

    .line 286
    :cond_7
    invoke-virtual {v13, v4}, Landroid/view/View;->setVisibility(I)V

    .line 287
    .line 288
    .line 289
    invoke-virtual {p1}, Lr82;->i()Ljava/lang/String;

    .line 290
    .line 291
    .line 292
    move-result-object v2

    .line 293
    invoke-virtual {v13, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 294
    .line 295
    .line 296
    :goto_8
    invoke-virtual {p1}, Lr82;->h()Ljava/lang/Double;

    .line 297
    .line 298
    .line 299
    move-result-object v2

    .line 300
    if-nez v2, :cond_8

    .line 301
    .line 302
    invoke-virtual {v12, v9}, Landroid/view/View;->setVisibility(I)V

    .line 303
    .line 304
    .line 305
    goto :goto_9

    .line 306
    :cond_8
    invoke-virtual {p1}, Lr82;->h()Ljava/lang/Double;

    .line 307
    .line 308
    .line 309
    move-result-object v2

    .line 310
    invoke-static {v2}, Li30;->j(Ljava/lang/Object;)V

    .line 311
    .line 312
    .line 313
    invoke-virtual {v2}, Ljava/lang/Double;->doubleValue()D

    .line 314
    .line 315
    .line 316
    move-result-wide v6

    .line 317
    double-to-float v2, v6

    .line 318
    invoke-virtual {v12, v2}, Landroid/widget/RatingBar;->setRating(F)V

    .line 319
    .line 320
    .line 321
    invoke-virtual {v12, v4}, Landroid/view/View;->setVisibility(I)V

    .line 322
    .line 323
    .line 324
    :goto_9
    invoke-virtual {p1}, Lr82;->e()Ljava/lang/String;

    .line 325
    .line 326
    .line 327
    move-result-object v2

    .line 328
    if-nez v2, :cond_9

    .line 329
    .line 330
    invoke-virtual {v5, v9}, Landroid/view/View;->setVisibility(I)V

    .line 331
    .line 332
    .line 333
    goto :goto_a

    .line 334
    :cond_9
    invoke-virtual {p1}, Lr82;->e()Ljava/lang/String;

    .line 335
    .line 336
    .line 337
    move-result-object v2

    .line 338
    invoke-virtual {v5, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 339
    .line 340
    .line 341
    invoke-virtual {v5, v4}, Landroid/view/View;->setVisibility(I)V

    .line 342
    .line 343
    .line 344
    :goto_a
    invoke-virtual {v1, p1}, Lcom/google/android/gms/ads/nativead/NativeAdView;->setNativeAd(Lcom/google/android/gms/ads/nativead/NativeAd;)V

    .line 345
    .line 346
    .line 347
    iget-object p1, v0, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->C:Lf2;

    .line 348
    .line 349
    const-string v2, "binding"

    .line 350
    .line 351
    if-eqz p1, :cond_b

    .line 352
    .line 353
    iget-object p1, p1, Lf2;->d:Ljava/lang/Object;

    .line 354
    .line 355
    check-cast p1, Landroid/widget/FrameLayout;

    .line 356
    .line 357
    invoke-virtual {p1}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 358
    .line 359
    .line 360
    iget-object p1, v0, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->C:Lf2;

    .line 361
    .line 362
    if-eqz p1, :cond_a

    .line 363
    .line 364
    iget-object p1, p1, Lf2;->d:Ljava/lang/Object;

    .line 365
    .line 366
    check-cast p1, Landroid/widget/FrameLayout;

    .line 367
    .line 368
    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 369
    .line 370
    .line 371
    return-void

    .line 372
    :cond_a
    invoke-static {v2}, Li30;->S(Ljava/lang/String;)V

    .line 373
    .line 374
    .line 375
    throw v3

    .line 376
    :cond_b
    invoke-static {v2}, Li30;->S(Ljava/lang/String;)V

    .line 377
    .line 378
    .line 379
    throw v3

    .line 380
    :cond_c
    invoke-virtual {v1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 381
    .line 382
    .line 383
    move-result-object p1

    .line 384
    invoke-virtual {p1, v2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 385
    .line 386
    .line 387
    move-result-object p1

    .line 388
    new-instance v0, Ljava/lang/NullPointerException;

    .line 389
    .line 390
    const-string v1, "Missing required view with ID: "

    .line 391
    .line 392
    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 393
    .line 394
    .line 395
    move-result-object p1

    .line 396
    invoke-direct {v0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 397
    .line 398
    .line 399
    throw v0
.end method
