.class public final synthetic Lr5;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic f:I

.field public final synthetic g:Ljava/lang/Object;

.field public final synthetic h:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p3, p0, Lr5;->f:I

    .line 2
    .line 3
    iput-object p1, p0, Lr5;->g:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p2, p0, Lr5;->h:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    .line 1
    iget v0, p0, Lr5;->f:I

    .line 2
    .line 3
    const-string v1, "binding"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object v3, p0, Lr5;->h:Ljava/lang/Object;

    .line 7
    .line 8
    iget-object v4, p0, Lr5;->g:Ljava/lang/Object;

    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    check-cast v4, Lcom/phuongpn/whousemywifi/networkscanner/RouterAdminActivity;

    .line 14
    .line 15
    check-cast v3, Ljava/lang/String;

    .line 16
    .line 17
    iget-object v0, v4, Lcom/phuongpn/whousemywifi/networkscanner/RouterAdminActivity;->C:Lmc2;

    .line 18
    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    iget-object v0, v0, Lmc2;->h:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v0, Lp21;

    .line 24
    .line 25
    iget-object v0, v0, Lp21;->i:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v0, Lcom/google/android/material/textfield/TextInputEditText;

    .line 28
    .line 29
    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :cond_0
    invoke-static {v1}, Li30;->S(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    throw v2

    .line 37
    :pswitch_0
    check-cast v4, Lg82;

    .line 38
    .line 39
    check-cast v3, Landroid/graphics/Typeface;

    .line 40
    .line 41
    invoke-virtual {v4, v3}, Lg82;->p(Landroid/graphics/Typeface;)V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :pswitch_1
    check-cast v4, Lcom/phuongpn/whousemywifi/networkscanner/PingActivity;

    .line 46
    .line 47
    check-cast v3, Lal0;

    .line 48
    .line 49
    iget-object v0, v4, Lcom/phuongpn/whousemywifi/networkscanner/PingActivity;->K:Lo9;

    .line 50
    .line 51
    if-eqz v0, :cond_3

    .line 52
    .line 53
    iget v1, v3, Lal0;->b:F

    .line 54
    .line 55
    float-to-int v1, v1

    .line 56
    iget-object v2, v0, Lo9;->d:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v2, Lg2;

    .line 59
    .line 60
    iget-object v3, v2, Lg2;->e:Lcom/github/mikephil/charting/charts/LineChart;

    .line 61
    .line 62
    invoke-virtual {v3}, Lje;->getData()Lle;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    check-cast v3, Lj60;

    .line 67
    .line 68
    if-eqz v3, :cond_2

    .line 69
    .line 70
    const/4 v4, 0x0

    .line 71
    invoke-virtual {v3, v4}, Lle;->d(I)Lq10;

    .line 72
    .line 73
    .line 74
    move-result-object v5

    .line 75
    check-cast v5, Ll60;

    .line 76
    .line 77
    if-nez v5, :cond_1

    .line 78
    .line 79
    invoke-virtual {v0}, Lo9;->b()Ll60;

    .line 80
    .line 81
    .line 82
    move-result-object v5

    .line 83
    invoke-virtual {v3, v5}, Lle;->a(Ll60;)V

    .line 84
    .line 85
    .line 86
    :cond_1
    new-instance v0, Lxs;

    .line 87
    .line 88
    iget-object v5, v5, Ll60;->o:Ljava/util/ArrayList;

    .line 89
    .line 90
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 91
    .line 92
    .line 93
    move-result v5

    .line 94
    int-to-float v5, v5

    .line 95
    int-to-float v1, v1

    .line 96
    invoke-direct {v0, v5, v1}, Lxs;-><init>(FF)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v3, v0, v4}, Lle;->b(Lxs;I)V

    .line 100
    .line 101
    .line 102
    iget-object v0, v2, Lg2;->e:Lcom/github/mikephil/charting/charts/LineChart;

    .line 103
    .line 104
    invoke-virtual {v0}, Lk9;->d()V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    .line 108
    .line 109
    .line 110
    :cond_2
    return-void

    .line 111
    :cond_3
    const-string v0, "pingChart"

    .line 112
    .line 113
    invoke-static {v0}, Li30;->S(Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    throw v2

    .line 117
    :pswitch_2
    check-cast v4, Lcom/phuongpn/whousemywifi/networkscanner/PingActivity;

    .line 118
    .line 119
    check-cast v3, Lbl0;

    .line 120
    .line 121
    iget-object v0, v4, Lcom/phuongpn/whousemywifi/networkscanner/PingActivity;->D:Lg2;

    .line 122
    .line 123
    iget-object v4, v4, Lcom/phuongpn/whousemywifi/networkscanner/PingActivity;->J:Ljava/text/DecimalFormat;

    .line 124
    .line 125
    if-eqz v0, :cond_6

    .line 126
    .line 127
    iget-object v1, v0, Lg2;->m:Landroid/widget/TextView;

    .line 128
    .line 129
    iget-object v2, v3, Lbl0;->a:Ljava/net/InetAddress;

    .line 130
    .line 131
    invoke-virtual {v2}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v5

    .line 135
    if-eqz v5, :cond_5

    .line 136
    .line 137
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 138
    .line 139
    .line 140
    move-result v5

    .line 141
    if-nez v5, :cond_4

    .line 142
    .line 143
    goto :goto_0

    .line 144
    :cond_4
    invoke-virtual {v2}, Ljava/net/InetAddress;->getHostName()Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v2

    .line 148
    goto :goto_1

    .line 149
    :cond_5
    :goto_0
    invoke-virtual {v2}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object v2

    .line 153
    :goto_1
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 154
    .line 155
    .line 156
    iget-object v1, v0, Lg2;->k:Landroid/widget/TextView;

    .line 157
    .line 158
    iget v2, v3, Lbl0;->e:F

    .line 159
    .line 160
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 161
    .line 162
    .line 163
    move-result-object v2

    .line 164
    invoke-virtual {v4, v2}, Ljava/text/Format;->format(Ljava/lang/Object;)Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v2

    .line 168
    new-instance v5, Ljava/lang/StringBuilder;

    .line 169
    .line 170
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 171
    .line 172
    .line 173
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 174
    .line 175
    .line 176
    const-string v2, " ms"

    .line 177
    .line 178
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 179
    .line 180
    .line 181
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object v5

    .line 185
    invoke-virtual {v1, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 186
    .line 187
    .line 188
    iget-object v1, v0, Lg2;->j:Landroid/widget/TextView;

    .line 189
    .line 190
    iget v5, v3, Lbl0;->f:F

    .line 191
    .line 192
    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 193
    .line 194
    .line 195
    move-result-object v5

    .line 196
    invoke-virtual {v4, v5}, Ljava/text/Format;->format(Ljava/lang/Object;)Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object v5

    .line 200
    new-instance v6, Ljava/lang/StringBuilder;

    .line 201
    .line 202
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 203
    .line 204
    .line 205
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 206
    .line 207
    .line 208
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 209
    .line 210
    .line 211
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 212
    .line 213
    .line 214
    move-result-object v5

    .line 215
    invoke-virtual {v1, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 216
    .line 217
    .line 218
    iget-object v1, v0, Lg2;->i:Landroid/widget/TextView;

    .line 219
    .line 220
    iget v5, v3, Lbl0;->d:F

    .line 221
    .line 222
    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 223
    .line 224
    .line 225
    move-result-object v5

    .line 226
    invoke-virtual {v4, v5}, Ljava/text/Format;->format(Ljava/lang/Object;)Ljava/lang/String;

    .line 227
    .line 228
    .line 229
    move-result-object v5

    .line 230
    new-instance v6, Ljava/lang/StringBuilder;

    .line 231
    .line 232
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 233
    .line 234
    .line 235
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 236
    .line 237
    .line 238
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 239
    .line 240
    .line 241
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 242
    .line 243
    .line 244
    move-result-object v2

    .line 245
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 246
    .line 247
    .line 248
    iget-object v0, v0, Lg2;->l:Landroid/widget/TextView;

    .line 249
    .line 250
    iget-wide v1, v3, Lbl0;->c:J

    .line 251
    .line 252
    iget-wide v5, v3, Lbl0;->b:J

    .line 253
    .line 254
    div-long/2addr v1, v5

    .line 255
    const/16 v3, 0x64

    .line 256
    .line 257
    int-to-long v5, v3

    .line 258
    mul-long/2addr v1, v5

    .line 259
    invoke-virtual {v4, v1, v2}, Ljava/text/NumberFormat;->format(J)Ljava/lang/String;

    .line 260
    .line 261
    .line 262
    move-result-object v1

    .line 263
    new-instance v2, Ljava/lang/StringBuilder;

    .line 264
    .line 265
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 266
    .line 267
    .line 268
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 269
    .line 270
    .line 271
    const-string v1, " %"

    .line 272
    .line 273
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 274
    .line 275
    .line 276
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 277
    .line 278
    .line 279
    move-result-object v1

    .line 280
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 281
    .line 282
    .line 283
    return-void

    .line 284
    :cond_6
    invoke-static {v1}, Li30;->S(Ljava/lang/String;)V

    .line 285
    .line 286
    .line 287
    throw v2

    .line 288
    :pswitch_3
    check-cast v4, Lcp0;

    .line 289
    .line 290
    check-cast v3, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;

    .line 291
    .line 292
    sget-object v0, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->d0:[I

    .line 293
    .line 294
    iget-object v0, v4, Lcp0;->f:Ljava/lang/Object;

    .line 295
    .line 296
    check-cast v0, Ljava/lang/CharSequence;

    .line 297
    .line 298
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 299
    .line 300
    .line 301
    move-result v0

    .line 302
    if-nez v0, :cond_8

    .line 303
    .line 304
    iget-object v0, v3, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->C:Lf2;

    .line 305
    .line 306
    if-eqz v0, :cond_7

    .line 307
    .line 308
    iget-object v0, v0, Lf2;->f:Ljava/lang/Object;

    .line 309
    .line 310
    check-cast v0, Lxi;

    .line 311
    .line 312
    iget-object v0, v0, Lxi;->k:Landroid/widget/TextView;

    .line 313
    .line 314
    const v1, 0x7f120145

    .line 315
    .line 316
    .line 317
    invoke-virtual {v3, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 318
    .line 319
    .line 320
    move-result-object v1

    .line 321
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 322
    .line 323
    .line 324
    goto :goto_2

    .line 325
    :cond_7
    invoke-static {v1}, Li30;->S(Ljava/lang/String;)V

    .line 326
    .line 327
    .line 328
    throw v2

    .line 329
    :cond_8
    iget-object v0, v3, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->C:Lf2;

    .line 330
    .line 331
    if-eqz v0, :cond_9

    .line 332
    .line 333
    iget-object v0, v0, Lf2;->f:Ljava/lang/Object;

    .line 334
    .line 335
    check-cast v0, Lxi;

    .line 336
    .line 337
    iget-object v0, v0, Lxi;->k:Landroid/widget/TextView;

    .line 338
    .line 339
    iget-object v1, v4, Lcp0;->f:Ljava/lang/Object;

    .line 340
    .line 341
    check-cast v1, Ljava/lang/CharSequence;

    .line 342
    .line 343
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 344
    .line 345
    .line 346
    :goto_2
    return-void

    .line 347
    :cond_9
    invoke-static {v1}, Li30;->S(Ljava/lang/String;)V

    .line 348
    .line 349
    .line 350
    throw v2

    .line 351
    :pswitch_4
    check-cast v4, Li5;

    .line 352
    .line 353
    check-cast v3, Laj0;

    .line 354
    .line 355
    iget-object v0, v4, Lch;->f:Ld60;

    .line 356
    .line 357
    new-instance v1, Lug;

    .line 358
    .line 359
    invoke-direct {v1, v3, v4}, Lug;-><init>(Laj0;Lch;)V

    .line 360
    .line 361
    .line 362
    invoke-virtual {v0, v1}, Ld60;->a(La60;)V

    .line 363
    .line 364
    .line 365
    return-void

    .line 366
    :pswitch_5
    check-cast v4, Ls5;

    .line 367
    .line 368
    check-cast v3, Ljava/lang/Runnable;

    .line 369
    .line 370
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 371
    .line 372
    .line 373
    :try_start_0
    invoke-interface {v3}, Ljava/lang/Runnable;->run()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 374
    .line 375
    .line 376
    invoke-virtual {v4}, Ls5;->a()V

    .line 377
    .line 378
    .line 379
    return-void

    .line 380
    :catchall_0
    move-exception v0

    .line 381
    invoke-virtual {v4}, Ls5;->a()V

    .line 382
    .line 383
    .line 384
    throw v0

    .line 385
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
