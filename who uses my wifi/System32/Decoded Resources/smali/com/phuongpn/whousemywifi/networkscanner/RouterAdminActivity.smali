.class public final Lcom/phuongpn/whousemywifi/networkscanner/RouterAdminActivity;
.super Li5;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# static fields
.field public static final synthetic F:I


# instance fields
.field public C:Lmc2;

.field public D:Lk52;

.field public E:Z


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

.method public static y(Landroid/view/View;)V
    .locals 2

    .line 1
    :try_start_0
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "input_method"

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const-string v1, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager"

    .line 12
    .line 13
    invoke-static {v0, v1}, Li30;->k(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    .line 17
    .line 18
    invoke-virtual {p0}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    const/4 v1, 0x0

    .line 23
    invoke-virtual {v0, p0, v1}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :catch_0
    move-exception p0

    .line 28
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 29
    .line 30
    .line 31
    return-void
.end method


# virtual methods
.method public final onCreate(Landroid/os/Bundle;)V
    .locals 10

    .line 1
    invoke-super {p0, p1}, Li5;->onCreate(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    const v0, 0x7f0c0020

    .line 9
    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    const/4 v2, 0x0

    .line 13
    invoke-virtual {p1, v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    const v0, 0x7f090159

    .line 18
    .line 19
    .line 20
    invoke-static {p1, v0}, La30;->e(Landroid/view/View;I)Landroid/view/View;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    move-object v6, v3

    .line 25
    check-cast v6, Landroid/widget/RelativeLayout;

    .line 26
    .line 27
    if-eqz v6, :cond_a

    .line 28
    .line 29
    const v0, 0x7f0901f0

    .line 30
    .line 31
    .line 32
    invoke-static {p1, v0}, La30;->e(Landroid/view/View;I)Landroid/view/View;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    check-cast v3, Landroid/widget/ProgressBar;

    .line 37
    .line 38
    if-eqz v3, :cond_a

    .line 39
    .line 40
    const v0, 0x7f090264

    .line 41
    .line 42
    .line 43
    invoke-static {p1, v0}, La30;->e(Landroid/view/View;I)Landroid/view/View;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    if-eqz v3, :cond_a

    .line 48
    .line 49
    invoke-static {v3}, Lp21;->h(Landroid/view/View;)Lp21;

    .line 50
    .line 51
    .line 52
    move-result-object v7

    .line 53
    const v0, 0x7f090275

    .line 54
    .line 55
    .line 56
    invoke-static {p1, v0}, La30;->e(Landroid/view/View;I)Landroid/view/View;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    move-object v8, v3

    .line 61
    check-cast v8, Landroid/widget/TextView;

    .line 62
    .line 63
    if-eqz v8, :cond_a

    .line 64
    .line 65
    const v0, 0x7f0902bc

    .line 66
    .line 67
    .line 68
    invoke-static {p1, v0}, La30;->e(Landroid/view/View;I)Landroid/view/View;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    move-object v9, v3

    .line 73
    check-cast v9, Landroid/webkit/WebView;

    .line 74
    .line 75
    if-eqz v9, :cond_a

    .line 76
    .line 77
    new-instance v4, Lmc2;

    .line 78
    .line 79
    move-object v5, p1

    .line 80
    check-cast v5, Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    .line 81
    .line 82
    invoke-direct/range {v4 .. v9}, Lmc2;-><init>(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/widget/RelativeLayout;Lp21;Landroid/widget/TextView;Landroid/webkit/WebView;)V

    .line 83
    .line 84
    .line 85
    iput-object v4, p0, Lcom/phuongpn/whousemywifi/networkscanner/RouterAdminActivity;->C:Lmc2;

    .line 86
    .line 87
    const-string p1, "getRoot(...)"

    .line 88
    .line 89
    invoke-static {v5, p1}, Li30;->l(Ljava/lang/Object;Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {p0, v5}, Li5;->setContentView(Landroid/view/View;)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    const-string v0, "connectivity"

    .line 100
    .line 101
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    const-string v0, "null cannot be cast to non-null type android.net.ConnectivityManager"

    .line 106
    .line 107
    invoke-static {p1, v0}, Li30;->k(Ljava/lang/Object;Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    check-cast p1, Landroid/net/ConnectivityManager;

    .line 111
    .line 112
    invoke-virtual {p1}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    const-string v0, "binding"

    .line 117
    .line 118
    if-eqz p1, :cond_4

    .line 119
    .line 120
    invoke-virtual {p1}, Landroid/net/NetworkInfo;->isConnected()Z

    .line 121
    .line 122
    .line 123
    move-result p1

    .line 124
    if-eqz p1, :cond_4

    .line 125
    .line 126
    iget-object p1, p0, Lcom/phuongpn/whousemywifi/networkscanner/RouterAdminActivity;->C:Lmc2;

    .line 127
    .line 128
    if-eqz p1, :cond_3

    .line 129
    .line 130
    iget-object p1, p1, Lmc2;->j:Ljava/lang/Object;

    .line 131
    .line 132
    check-cast p1, Landroid/webkit/WebView;

    .line 133
    .line 134
    invoke-virtual {p1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    const/4 v3, 0x1

    .line 139
    invoke-virtual {p1, v3}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {p1, v3}, Landroid/webkit/WebSettings;->setJavaScriptCanOpenWindowsAutomatically(Z)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {p1, v3}, Landroid/webkit/WebSettings;->setSupportZoom(Z)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {p1, v3}, Landroid/webkit/WebSettings;->setBuiltInZoomControls(Z)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {p1, v2}, Landroid/webkit/WebSettings;->setDisplayZoomControls(Z)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {p1, v3}, Landroid/webkit/WebSettings;->setUseWideViewPort(Z)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {p1, v3}, Landroid/webkit/WebSettings;->setLoadWithOverviewMode(Z)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {p1, v3}, Landroid/webkit/WebSettings;->setSaveFormData(Z)V

    .line 161
    .line 162
    .line 163
    const-string v3, "Mozilla/5.0 (iPhone; CPU iPhone OS 9_1 like Mac OS X) AppleWebKit/601.1.46 (KHTML, like Gecko) Version/9.0 Mobile/13B143 Safari/601.1"

    .line 164
    .line 165
    invoke-virtual {p1, v3}, Landroid/webkit/WebSettings;->setUserAgentString(Ljava/lang/String;)V

    .line 166
    .line 167
    .line 168
    iget-object p1, p0, Lcom/phuongpn/whousemywifi/networkscanner/RouterAdminActivity;->C:Lmc2;

    .line 169
    .line 170
    if-eqz p1, :cond_2

    .line 171
    .line 172
    iget-object p1, p1, Lmc2;->j:Ljava/lang/Object;

    .line 173
    .line 174
    check-cast p1, Landroid/webkit/WebView;

    .line 175
    .line 176
    new-instance v3, Ler0;

    .line 177
    .line 178
    const/4 v4, 0x0

    .line 179
    invoke-direct {v3, v4, p0}, Ler0;-><init>(ILjava/lang/Object;)V

    .line 180
    .line 181
    .line 182
    invoke-virtual {p1, v3}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    .line 183
    .line 184
    .line 185
    invoke-virtual {p0}, Lcom/phuongpn/whousemywifi/networkscanner/RouterAdminActivity;->x()Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object p1

    .line 189
    const-string v3, "http://"

    .line 190
    .line 191
    invoke-static {p1, v3, v2}, Lsy0;->y(Ljava/lang/String;Ljava/lang/CharSequence;Z)Z

    .line 192
    .line 193
    .line 194
    move-result v4

    .line 195
    if-nez v4, :cond_0

    .line 196
    .line 197
    const-string v4, "https://"

    .line 198
    .line 199
    invoke-static {p1, v4, v2}, Lsy0;->y(Ljava/lang/String;Ljava/lang/CharSequence;Z)Z

    .line 200
    .line 201
    .line 202
    move-result v4

    .line 203
    if-nez v4, :cond_0

    .line 204
    .line 205
    invoke-virtual {v3, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object p1

    .line 209
    :cond_0
    iget-object v3, p0, Lcom/phuongpn/whousemywifi/networkscanner/RouterAdminActivity;->C:Lmc2;

    .line 210
    .line 211
    if-eqz v3, :cond_1

    .line 212
    .line 213
    iget-object v3, v3, Lmc2;->j:Ljava/lang/Object;

    .line 214
    .line 215
    check-cast v3, Landroid/webkit/WebView;

    .line 216
    .line 217
    invoke-virtual {v3, p1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 218
    .line 219
    .line 220
    goto :goto_0

    .line 221
    :cond_1
    invoke-static {v0}, Li30;->S(Ljava/lang/String;)V

    .line 222
    .line 223
    .line 224
    throw v1

    .line 225
    :cond_2
    invoke-static {v0}, Li30;->S(Ljava/lang/String;)V

    .line 226
    .line 227
    .line 228
    throw v1

    .line 229
    :cond_3
    invoke-static {v0}, Li30;->S(Ljava/lang/String;)V

    .line 230
    .line 231
    .line 232
    throw v1

    .line 233
    :cond_4
    iget-object p1, p0, Lcom/phuongpn/whousemywifi/networkscanner/RouterAdminActivity;->C:Lmc2;

    .line 234
    .line 235
    if-eqz p1, :cond_9

    .line 236
    .line 237
    iget-object p1, p1, Lmc2;->j:Ljava/lang/Object;

    .line 238
    .line 239
    check-cast p1, Landroid/webkit/WebView;

    .line 240
    .line 241
    const/16 v3, 0x8

    .line 242
    .line 243
    invoke-virtual {p1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 244
    .line 245
    .line 246
    iget-object p1, p0, Lcom/phuongpn/whousemywifi/networkscanner/RouterAdminActivity;->C:Lmc2;

    .line 247
    .line 248
    if-eqz p1, :cond_8

    .line 249
    .line 250
    iget-object p1, p1, Lmc2;->i:Ljava/lang/Object;

    .line 251
    .line 252
    check-cast p1, Landroid/widget/TextView;

    .line 253
    .line 254
    const-string v3, "ERR_INTERNET_DISCONNECTED"

    .line 255
    .line 256
    invoke-virtual {p1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 257
    .line 258
    .line 259
    :goto_0
    new-instance p1, La3;

    .line 260
    .line 261
    const/4 v3, 0x1

    .line 262
    invoke-direct {p1, v3}, Lf74;-><init>(I)V

    .line 263
    .line 264
    .line 265
    new-instance v3, Lb3;

    .line 266
    .line 267
    invoke-direct {v3, p1}, Lb3;-><init>(Lf74;)V

    .line 268
    .line 269
    .line 270
    const p1, 0x7f120027

    .line 271
    .line 272
    .line 273
    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 274
    .line 275
    .line 276
    move-result-object p1

    .line 277
    new-instance v4, Lfr0;

    .line 278
    .line 279
    const/4 v5, 0x0

    .line 280
    invoke-direct {v4, p0, v5}, Lfr0;-><init>(Li5;I)V

    .line 281
    .line 282
    .line 283
    invoke-static {p0, p1, v3, v4}, Lg30;->a(Landroid/content/Context;Ljava/lang/String;Lb3;Lh30;)V

    .line 284
    .line 285
    .line 286
    iget-object p1, p0, Lcom/phuongpn/whousemywifi/networkscanner/RouterAdminActivity;->C:Lmc2;

    .line 287
    .line 288
    if-eqz p1, :cond_7

    .line 289
    .line 290
    iget-object p1, p1, Lmc2;->h:Ljava/lang/Object;

    .line 291
    .line 292
    check-cast p1, Lp21;

    .line 293
    .line 294
    iget-object v0, p1, Lp21;->g:Ljava/lang/Object;

    .line 295
    .line 296
    check-cast v0, Lcom/google/android/material/button/MaterialButton;

    .line 297
    .line 298
    iget-object v1, p1, Lp21;->f:Ljava/lang/Object;

    .line 299
    .line 300
    check-cast v1, Lcom/google/android/material/button/MaterialButton;

    .line 301
    .line 302
    iget-object v3, p1, Lp21;->i:Ljava/lang/Object;

    .line 303
    .line 304
    check-cast v3, Lcom/google/android/material/textfield/TextInputEditText;

    .line 305
    .line 306
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 307
    .line 308
    .line 309
    new-instance v2, Lar0;

    .line 310
    .line 311
    const/4 v4, 0x0

    .line 312
    invoke-direct {v2, p0, v4}, Lar0;-><init>(Lcom/phuongpn/whousemywifi/networkscanner/RouterAdminActivity;I)V

    .line 313
    .line 314
    .line 315
    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 316
    .line 317
    .line 318
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 319
    .line 320
    .line 321
    move-result-object v2

    .line 322
    const-string v4, "ping_ip_arg"

    .line 323
    .line 324
    invoke-virtual {v2, v4}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 325
    .line 326
    .line 327
    move-result-object v2

    .line 328
    if-eqz v2, :cond_6

    .line 329
    .line 330
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 331
    .line 332
    .line 333
    move-result v4

    .line 334
    if-nez v4, :cond_5

    .line 335
    .line 336
    goto :goto_1

    .line 337
    :cond_5
    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 338
    .line 339
    .line 340
    goto :goto_2

    .line 341
    :cond_6
    :goto_1
    invoke-virtual {p0}, Lcom/phuongpn/whousemywifi/networkscanner/RouterAdminActivity;->x()Ljava/lang/String;

    .line 342
    .line 343
    .line 344
    move-result-object v2

    .line 345
    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 346
    .line 347
    .line 348
    :goto_2
    new-instance v2, Lbr0;

    .line 349
    .line 350
    invoke-direct {v2, p1}, Lbr0;-><init>(Lp21;)V

    .line 351
    .line 352
    .line 353
    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setOnEditorActionListener(Landroid/widget/TextView$OnEditorActionListener;)V

    .line 354
    .line 355
    .line 356
    new-instance v2, Lcr0;

    .line 357
    .line 358
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 359
    .line 360
    .line 361
    invoke-virtual {v3, v2}, Landroid/view/View;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    .line 362
    .line 363
    .line 364
    iget-object v2, p1, Lp21;->h:Ljava/lang/Object;

    .line 365
    .line 366
    check-cast v2, Lcom/google/android/material/button/MaterialButton;

    .line 367
    .line 368
    new-instance v3, Lia0;

    .line 369
    .line 370
    const/4 v4, 0x3

    .line 371
    invoke-direct {v3, p1, p0, v4}, Lia0;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 372
    .line 373
    .line 374
    invoke-virtual {v2, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 375
    .line 376
    .line 377
    new-instance p1, Lar0;

    .line 378
    .line 379
    const/4 v2, 0x1

    .line 380
    invoke-direct {p1, p0, v2}, Lar0;-><init>(Lcom/phuongpn/whousemywifi/networkscanner/RouterAdminActivity;I)V

    .line 381
    .line 382
    .line 383
    invoke-virtual {v0, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 384
    .line 385
    .line 386
    new-instance p1, Lar0;

    .line 387
    .line 388
    const/4 v0, 0x2

    .line 389
    invoke-direct {p1, p0, v0}, Lar0;-><init>(Lcom/phuongpn/whousemywifi/networkscanner/RouterAdminActivity;I)V

    .line 390
    .line 391
    .line 392
    invoke-virtual {v1, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 393
    .line 394
    .line 395
    invoke-virtual {p0}, Lch;->i()Laj0;

    .line 396
    .line 397
    .line 398
    move-result-object p1

    .line 399
    new-instance v0, Lqw;

    .line 400
    .line 401
    const/4 v1, 0x1

    .line 402
    invoke-direct {v0, p0, v1}, Lqw;-><init>(Li5;I)V

    .line 403
    .line 404
    .line 405
    invoke-virtual {p1, p0, v0}, Laj0;->a(Lb60;Lqw;)V

    .line 406
    .line 407
    .line 408
    return-void

    .line 409
    :cond_7
    invoke-static {v0}, Li30;->S(Ljava/lang/String;)V

    .line 410
    .line 411
    .line 412
    throw v1

    .line 413
    :cond_8
    invoke-static {v0}, Li30;->S(Ljava/lang/String;)V

    .line 414
    .line 415
    .line 416
    throw v1

    .line 417
    :cond_9
    invoke-static {v0}, Li30;->S(Ljava/lang/String;)V

    .line 418
    .line 419
    .line 420
    throw v1

    .line 421
    :cond_a
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 422
    .line 423
    .line 424
    move-result-object p1

    .line 425
    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 426
    .line 427
    .line 428
    move-result-object p1

    .line 429
    new-instance v0, Ljava/lang/NullPointerException;

    .line 430
    .line 431
    const-string v1, "Missing required view with ID: "

    .line 432
    .line 433
    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 434
    .line 435
    .line 436
    move-result-object p1

    .line 437
    invoke-direct {v0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 438
    .line 439
    .line 440
    throw v0
.end method

.method public final x()Ljava/lang/String;
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "wifi"

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const-string v1, "null cannot be cast to non-null type android.net.wifi.WifiManager"

    .line 12
    .line 13
    invoke-static {v0, v1}, Li30;->k(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    check-cast v0, Landroid/net/wifi/WifiManager;

    .line 17
    .line 18
    invoke-virtual {v0}, Landroid/net/wifi/WifiManager;->getDhcpInfo()Landroid/net/DhcpInfo;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iget v0, v0, Landroid/net/DhcpInfo;->gateway:I

    .line 23
    .line 24
    invoke-static {v0}, Landroid/text/format/Formatter;->formatIpAddress(I)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    const-string v1, "formatIpAddress(...)"

    .line 29
    .line 30
    invoke-static {v0, v1}, Li30;->l(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    return-object v0
.end method
