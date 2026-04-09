.class public final Lh33;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ln53;


# instance fields
.field public final a:Ll83;

.field public final b:J


# direct methods
.method public constructor <init>(Ll83;J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lh33;->a:Ll83;

    .line 5
    .line 6
    iput-wide p2, p0, Lh33;->b:J

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Object;)V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    check-cast v1, Ljm2;

    .line 6
    .line 7
    iget-object v1, v1, Ljm2;->a:Landroid/os/Bundle;

    .line 8
    .line 9
    iget-object v2, v0, Lh33;->a:Ll83;

    .line 10
    .line 11
    iget-object v3, v2, Ll83;->d:Lpc4;

    .line 12
    .line 13
    iget v4, v3, Lpc4;->B:I

    .line 14
    .line 15
    iget-object v5, v3, Lpc4;->h:Landroid/os/Bundle;

    .line 16
    .line 17
    const-string v6, "http_timeout_millis"

    .line 18
    .line 19
    invoke-virtual {v1, v6, v4}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    const-string v4, "slotname"

    .line 23
    .line 24
    iget-object v6, v2, Ll83;->g:Ljava/lang/String;

    .line 25
    .line 26
    invoke-virtual {v1, v4, v6}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    iget-object v4, v2, Ll83;->p:Lh80;

    .line 30
    .line 31
    iget v4, v4, Lh80;->g:I

    .line 32
    .line 33
    if-eqz v4, :cond_e

    .line 34
    .line 35
    const/4 v6, -0x1

    .line 36
    add-int/2addr v4, v6

    .line 37
    const/4 v7, 0x2

    .line 38
    const/4 v8, 0x1

    .line 39
    if-eq v4, v8, :cond_1

    .line 40
    .line 41
    if-eq v4, v7, :cond_0

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_0
    const-string v4, "is_rewarded_interstitial"

    .line 45
    .line 46
    invoke-virtual {v1, v4, v8}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_1
    const-string v4, "is_new_rewarded"

    .line 51
    .line 52
    invoke-virtual {v1, v4, v8}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 53
    .line 54
    .line 55
    :goto_0
    iget-wide v9, v0, Lh33;->b:J

    .line 56
    .line 57
    const-string v4, "start_signals_timestamp"

    .line 58
    .line 59
    invoke-virtual {v1, v4, v9, v10}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 60
    .line 61
    .line 62
    const-string v4, "is_sdk_preload"

    .line 63
    .line 64
    const/4 v9, 0x0

    .line 65
    invoke-virtual {v5, v4, v9}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 66
    .line 67
    .line 68
    move-result v10

    .line 69
    invoke-static {v1, v4, v8, v10}, Li30;->n0(Landroid/os/Bundle;Ljava/lang/String;ZZ)V

    .line 70
    .line 71
    .line 72
    const-string v4, "zenith_v2"

    .line 73
    .line 74
    invoke-virtual {v5, v4, v9}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 75
    .line 76
    .line 77
    move-result v10

    .line 78
    const-string v11, "prefetch_type"

    .line 79
    .line 80
    invoke-static {v1, v11, v4, v10}, Li30;->h0(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 81
    .line 82
    .line 83
    new-instance v4, Ljava/text/SimpleDateFormat;

    .line 84
    .line 85
    const-string v10, "yyyyMMdd"

    .line 86
    .line 87
    sget-object v11, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 88
    .line 89
    invoke-direct {v4, v10, v11}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 90
    .line 91
    .line 92
    iget-wide v10, v3, Lpc4;->g:J

    .line 93
    .line 94
    new-instance v12, Ljava/util/Date;

    .line 95
    .line 96
    invoke-direct {v12, v10, v11}, Ljava/util/Date;-><init>(J)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v4, v12}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v4

    .line 103
    const-wide/16 v12, -0x1

    .line 104
    .line 105
    cmp-long v10, v10, v12

    .line 106
    .line 107
    if-eqz v10, :cond_2

    .line 108
    .line 109
    move v10, v8

    .line 110
    goto :goto_1

    .line 111
    :cond_2
    move v10, v9

    .line 112
    :goto_1
    const-string v11, "cust_age"

    .line 113
    .line 114
    invoke-static {v1, v11, v4, v10}, Li30;->h0(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 115
    .line 116
    .line 117
    if-eqz v5, :cond_3

    .line 118
    .line 119
    const-string v4, "extras"

    .line 120
    .line 121
    invoke-virtual {v1, v4, v5}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 122
    .line 123
    .line 124
    :cond_3
    iget v4, v3, Lpc4;->i:I

    .line 125
    .line 126
    if-eq v4, v6, :cond_4

    .line 127
    .line 128
    move v5, v8

    .line 129
    goto :goto_2

    .line 130
    :cond_4
    move v5, v9

    .line 131
    :goto_2
    const-string v10, "cust_gender"

    .line 132
    .line 133
    invoke-static {v1, v10, v4, v5}, Li30;->j0(Landroid/os/Bundle;Ljava/lang/String;IZ)V

    .line 134
    .line 135
    .line 136
    iget-object v4, v3, Lpc4;->j:Ljava/util/List;

    .line 137
    .line 138
    const-string v5, "kw"

    .line 139
    .line 140
    invoke-static {v1, v5, v4}, Li30;->r0(Landroid/os/Bundle;Ljava/lang/String;Ljava/util/List;)V

    .line 141
    .line 142
    .line 143
    iget v4, v3, Lpc4;->l:I

    .line 144
    .line 145
    if-eq v4, v6, :cond_5

    .line 146
    .line 147
    move v5, v8

    .line 148
    goto :goto_3

    .line 149
    :cond_5
    move v5, v9

    .line 150
    :goto_3
    const-string v10, "tag_for_child_directed_treatment"

    .line 151
    .line 152
    invoke-static {v1, v10, v4, v5}, Li30;->j0(Landroid/os/Bundle;Ljava/lang/String;IZ)V

    .line 153
    .line 154
    .line 155
    iget-boolean v4, v3, Lpc4;->k:Z

    .line 156
    .line 157
    if-eqz v4, :cond_6

    .line 158
    .line 159
    const-string v4, "test_request"

    .line 160
    .line 161
    invoke-virtual {v1, v4, v8}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 162
    .line 163
    .line 164
    :cond_6
    iget v4, v3, Lpc4;->D:I

    .line 165
    .line 166
    const-string v5, "ppt_p13n"

    .line 167
    .line 168
    invoke-virtual {v1, v5, v4}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 169
    .line 170
    .line 171
    iget v4, v3, Lpc4;->f:I

    .line 172
    .line 173
    if-lt v4, v7, :cond_7

    .line 174
    .line 175
    iget-boolean v5, v3, Lpc4;->m:Z

    .line 176
    .line 177
    if-eqz v5, :cond_7

    .line 178
    .line 179
    move v5, v8

    .line 180
    goto :goto_4

    .line 181
    :cond_7
    move v5, v9

    .line 182
    :goto_4
    const-string v10, "d_imp_hdr"

    .line 183
    .line 184
    invoke-static {v1, v10, v8, v5}, Li30;->j0(Landroid/os/Bundle;Ljava/lang/String;IZ)V

    .line 185
    .line 186
    .line 187
    iget-object v5, v3, Lpc4;->n:Ljava/lang/String;

    .line 188
    .line 189
    if-lt v4, v7, :cond_8

    .line 190
    .line 191
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 192
    .line 193
    .line 194
    move-result v7

    .line 195
    if-nez v7, :cond_8

    .line 196
    .line 197
    move v7, v8

    .line 198
    goto :goto_5

    .line 199
    :cond_8
    move v7, v9

    .line 200
    :goto_5
    const-string v10, "ppid"

    .line 201
    .line 202
    invoke-static {v1, v10, v5, v7}, Li30;->h0(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 203
    .line 204
    .line 205
    iget-object v5, v3, Lpc4;->p:Landroid/location/Location;

    .line 206
    .line 207
    if-eqz v5, :cond_9

    .line 208
    .line 209
    invoke-virtual {v5}, Landroid/location/Location;->getAccuracy()F

    .line 210
    .line 211
    .line 212
    move-result v7

    .line 213
    const/high16 v10, 0x447a0000    # 1000.0f

    .line 214
    .line 215
    mul-float/2addr v7, v10

    .line 216
    invoke-virtual {v5}, Landroid/location/Location;->getTime()J

    .line 217
    .line 218
    .line 219
    move-result-wide v10

    .line 220
    const-wide/16 v12, 0x3e8

    .line 221
    .line 222
    mul-long/2addr v10, v12

    .line 223
    invoke-virtual {v5}, Landroid/location/Location;->getLatitude()D

    .line 224
    .line 225
    .line 226
    move-result-wide v12

    .line 227
    const-wide v14, 0x416312d000000000L    # 1.0E7

    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    mul-double/2addr v12, v14

    .line 233
    invoke-virtual {v5}, Landroid/location/Location;->getLongitude()D

    .line 234
    .line 235
    .line 236
    move-result-wide v16

    .line 237
    mul-double v14, v14, v16

    .line 238
    .line 239
    new-instance v5, Landroid/os/Bundle;

    .line 240
    .line 241
    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    .line 242
    .line 243
    .line 244
    const-string v8, "radius"

    .line 245
    .line 246
    invoke-virtual {v5, v8, v7}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    .line 247
    .line 248
    .line 249
    const-string v7, "lat"

    .line 250
    .line 251
    double-to-long v12, v12

    .line 252
    invoke-virtual {v5, v7, v12, v13}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 253
    .line 254
    .line 255
    const-string v7, "long"

    .line 256
    .line 257
    double-to-long v12, v14

    .line 258
    invoke-virtual {v5, v7, v12, v13}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 259
    .line 260
    .line 261
    const-string v7, "time"

    .line 262
    .line 263
    invoke-virtual {v5, v7, v10, v11}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 264
    .line 265
    .line 266
    const-string v7, "uule"

    .line 267
    .line 268
    invoke-virtual {v1, v7, v5}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 269
    .line 270
    .line 271
    :cond_9
    iget-object v5, v3, Lpc4;->q:Ljava/lang/String;

    .line 272
    .line 273
    const-string v7, "url"

    .line 274
    .line 275
    invoke-static {v7, v1, v5}, Li30;->p0(Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;)V

    .line 276
    .line 277
    .line 278
    iget-object v5, v3, Lpc4;->A:Ljava/util/List;

    .line 279
    .line 280
    const-string v7, "neighboring_content_urls"

    .line 281
    .line 282
    invoke-static {v1, v7, v5}, Li30;->r0(Landroid/os/Bundle;Ljava/lang/String;Ljava/util/List;)V

    .line 283
    .line 284
    .line 285
    iget-object v5, v3, Lpc4;->s:Landroid/os/Bundle;

    .line 286
    .line 287
    if-eqz v5, :cond_a

    .line 288
    .line 289
    const-string v7, "custom_targeting"

    .line 290
    .line 291
    invoke-virtual {v1, v7, v5}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 292
    .line 293
    .line 294
    :cond_a
    iget-object v5, v3, Lpc4;->t:Ljava/util/List;

    .line 295
    .line 296
    const-string v7, "category_exclusions"

    .line 297
    .line 298
    invoke-static {v1, v7, v5}, Li30;->r0(Landroid/os/Bundle;Ljava/lang/String;Ljava/util/List;)V

    .line 299
    .line 300
    .line 301
    iget-object v5, v3, Lpc4;->u:Ljava/lang/String;

    .line 302
    .line 303
    const-string v7, "request_agent"

    .line 304
    .line 305
    invoke-static {v7, v1, v5}, Li30;->p0(Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;)V

    .line 306
    .line 307
    .line 308
    iget-object v5, v3, Lpc4;->v:Ljava/lang/String;

    .line 309
    .line 310
    const-string v7, "request_pkg"

    .line 311
    .line 312
    invoke-static {v7, v1, v5}, Li30;->p0(Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;)V

    .line 313
    .line 314
    .line 315
    iget-boolean v5, v3, Lpc4;->w:Z

    .line 316
    .line 317
    const/4 v7, 0x7

    .line 318
    if-lt v4, v7, :cond_b

    .line 319
    .line 320
    const/4 v7, 0x1

    .line 321
    goto :goto_6

    .line 322
    :cond_b
    move v7, v9

    .line 323
    :goto_6
    const-string v8, "is_designed_for_families"

    .line 324
    .line 325
    invoke-static {v1, v8, v5, v7}, Li30;->n0(Landroid/os/Bundle;Ljava/lang/String;ZZ)V

    .line 326
    .line 327
    .line 328
    const/16 v5, 0x8

    .line 329
    .line 330
    if-lt v4, v5, :cond_d

    .line 331
    .line 332
    iget v4, v3, Lpc4;->y:I

    .line 333
    .line 334
    if-eq v4, v6, :cond_c

    .line 335
    .line 336
    const/4 v8, 0x1

    .line 337
    goto :goto_7

    .line 338
    :cond_c
    move v8, v9

    .line 339
    :goto_7
    const-string v5, "tag_for_under_age_of_consent"

    .line 340
    .line 341
    invoke-static {v1, v5, v4, v8}, Li30;->j0(Landroid/os/Bundle;Ljava/lang/String;IZ)V

    .line 342
    .line 343
    .line 344
    iget-object v3, v3, Lpc4;->z:Ljava/lang/String;

    .line 345
    .line 346
    const-string v4, "max_ad_content_rating"

    .line 347
    .line 348
    invoke-static {v4, v1, v3}, Li30;->p0(Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;)V

    .line 349
    .line 350
    .line 351
    :cond_d
    iget-object v2, v2, Ll83;->e:Landroid/os/Bundle;

    .line 352
    .line 353
    const-string v3, "plcs"

    .line 354
    .line 355
    invoke-virtual {v2, v3}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 356
    .line 357
    .line 358
    move-result v4

    .line 359
    invoke-virtual {v1, v3, v4}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 360
    .line 361
    .line 362
    const-string v3, "plbs"

    .line 363
    .line 364
    invoke-virtual {v2, v3}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 365
    .line 366
    .line 367
    move-result v4

    .line 368
    invoke-virtual {v1, v3, v4}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 369
    .line 370
    .line 371
    const-string v3, "plid"

    .line 372
    .line 373
    invoke-virtual {v2, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 374
    .line 375
    .line 376
    move-result-object v2

    .line 377
    invoke-static {v3, v1, v2}, Li30;->p0(Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;)V

    .line 378
    .line 379
    .line 380
    return-void

    .line 381
    :cond_e
    const/4 v1, 0x0

    .line 382
    throw v1
.end method

.method public final p(Ljava/lang/Object;)V
    .locals 7

    .line 1
    check-cast p1, Ljm2;

    .line 2
    .line 3
    iget-object p1, p1, Ljm2;->b:Landroid/os/Bundle;

    .line 4
    .line 5
    const-string v0, "slotname"

    .line 6
    .line 7
    iget-object v1, p0, Lh33;->a:Ll83;

    .line 8
    .line 9
    iget-object v2, v1, Ll83;->g:Ljava/lang/String;

    .line 10
    .line 11
    invoke-virtual {p1, v0, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    iget-object v0, v1, Ll83;->d:Lpc4;

    .line 15
    .line 16
    iget-boolean v1, v0, Lpc4;->k:Z

    .line 17
    .line 18
    const/4 v2, 0x1

    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    const-string v1, "test_request"

    .line 22
    .line 23
    invoke-virtual {p1, v1, v2}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 24
    .line 25
    .line 26
    :cond_0
    iget v1, v0, Lpc4;->l:I

    .line 27
    .line 28
    const/4 v3, 0x0

    .line 29
    const/4 v4, -0x1

    .line 30
    if-eq v1, v4, :cond_1

    .line 31
    .line 32
    move v5, v2

    .line 33
    goto :goto_0

    .line 34
    :cond_1
    move v5, v3

    .line 35
    :goto_0
    const-string v6, "tag_for_child_directed_treatment"

    .line 36
    .line 37
    invoke-static {p1, v6, v1, v5}, Li30;->j0(Landroid/os/Bundle;Ljava/lang/String;IZ)V

    .line 38
    .line 39
    .line 40
    iget v1, v0, Lpc4;->f:I

    .line 41
    .line 42
    const/16 v5, 0x8

    .line 43
    .line 44
    if-lt v1, v5, :cond_3

    .line 45
    .line 46
    iget v1, v0, Lpc4;->y:I

    .line 47
    .line 48
    if-eq v1, v4, :cond_2

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_2
    move v2, v3

    .line 52
    :goto_1
    const-string v3, "tag_for_under_age_of_consent"

    .line 53
    .line 54
    invoke-static {p1, v3, v1, v2}, Li30;->j0(Landroid/os/Bundle;Ljava/lang/String;IZ)V

    .line 55
    .line 56
    .line 57
    :cond_3
    iget-object v1, v0, Lpc4;->q:Ljava/lang/String;

    .line 58
    .line 59
    const-string v2, "url"

    .line 60
    .line 61
    invoke-static {v2, p1, v1}, Li30;->p0(Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    iget-object v1, v0, Lpc4;->A:Ljava/util/List;

    .line 65
    .line 66
    const-string v2, "neighboring_content_urls"

    .line 67
    .line 68
    invoke-static {p1, v2, v1}, Li30;->r0(Landroid/os/Bundle;Ljava/lang/String;Ljava/util/List;)V

    .line 69
    .line 70
    .line 71
    iget-object v0, v0, Lpc4;->h:Landroid/os/Bundle;

    .line 72
    .line 73
    invoke-virtual {v0}, Landroid/os/Bundle;->clone()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    check-cast v1, Landroid/os/Bundle;

    .line 78
    .line 79
    new-instance v2, Ljava/util/HashSet;

    .line 80
    .line 81
    sget-object v3, Lmz1;->W7:Liz1;

    .line 82
    .line 83
    sget-object v5, Ltw1;->e:Ltw1;

    .line 84
    .line 85
    iget-object v5, v5, Ltw1;->c:Lkz1;

    .line 86
    .line 87
    invoke-virtual {v5, v3}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v3

    .line 91
    check-cast v3, Ljava/lang/String;

    .line 92
    .line 93
    const-string v5, ","

    .line 94
    .line 95
    invoke-virtual {v3, v5, v4}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v3

    .line 99
    invoke-static {v3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 100
    .line 101
    .line 102
    move-result-object v3

    .line 103
    invoke-direct {v2, v3}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v0}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    :cond_4
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 115
    .line 116
    .line 117
    move-result v3

    .line 118
    if-eqz v3, :cond_5

    .line 119
    .line 120
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v3

    .line 124
    check-cast v3, Ljava/lang/String;

    .line 125
    .line 126
    invoke-virtual {v2, v3}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    move-result v4

    .line 130
    if-nez v4, :cond_4

    .line 131
    .line 132
    invoke-virtual {v1, v3}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    goto :goto_2

    .line 136
    :cond_5
    if-eqz v1, :cond_6

    .line 137
    .line 138
    const-string v0, "extras"

    .line 139
    .line 140
    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 141
    .line 142
    .line 143
    :cond_6
    return-void
.end method
