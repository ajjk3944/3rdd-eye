.class public final Lbw2;
.super Lhv1;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final f:Lci2;

.field public final g:Lf20;

.field public final h:Ljava/util/HashMap;


# direct methods
.method public constructor <init>(Lci2;Lf20;)V
    .locals 1

    .line 1
    const-string v0, "com.google.android.gms.ads.internal.h5.client.IH5AdsManager"

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lhv1;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/util/HashMap;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lbw2;->h:Ljava/util/HashMap;

    .line 12
    .line 13
    iput-object p1, p0, Lbw2;->f:Lci2;

    .line 14
    .line 15
    iput-object p2, p0, Lbw2;->g:Lf20;

    .line 16
    .line 17
    return-void
.end method

.method public static B3(Ljava/util/HashMap;)Lpc4;
    .locals 38

    .line 1
    new-instance v4, Landroid/os/Bundle;

    .line 2
    .line 3
    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v6, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    .line 11
    new-instance v21, Landroid/os/Bundle;

    .line 12
    .line 13
    invoke-direct/range {v21 .. v21}, Landroid/os/Bundle;-><init>()V

    .line 14
    .line 15
    .line 16
    new-instance v15, Landroid/os/Bundle;

    .line 17
    .line 18
    invoke-direct {v15}, Landroid/os/Bundle;-><init>()V

    .line 19
    .line 20
    .line 21
    new-instance v16, Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-direct/range {v16 .. v16}, Ljava/util/ArrayList;-><init>()V

    .line 24
    .line 25
    .line 26
    new-instance v23, Ljava/util/ArrayList;

    .line 27
    .line 28
    invoke-direct/range {v23 .. v23}, Ljava/util/ArrayList;-><init>()V

    .line 29
    .line 30
    .line 31
    const-string v0, "ad_request"

    .line 32
    .line 33
    move-object/from16 v1, p0

    .line 34
    .line 35
    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    check-cast v0, Ljava/lang/String;

    .line 40
    .line 41
    const/4 v7, 0x0

    .line 42
    const/4 v8, -0x1

    .line 43
    const/16 v22, 0x0

    .line 44
    .line 45
    const v24, 0xea60

    .line 46
    .line 47
    .line 48
    const-wide/16 v34, 0x0

    .line 49
    .line 50
    if-nez v0, :cond_0

    .line 51
    .line 52
    new-instance v0, Lpc4;

    .line 53
    .line 54
    const/16 v25, 0x0

    .line 55
    .line 56
    const-wide/16 v29, 0x0

    .line 57
    .line 58
    const/16 v1, 0x8

    .line 59
    .line 60
    const-wide/16 v2, -0x1

    .line 61
    .line 62
    const/4 v5, -0x1

    .line 63
    const/4 v9, 0x0

    .line 64
    const/4 v10, 0x0

    .line 65
    const/4 v11, 0x0

    .line 66
    const/4 v12, 0x0

    .line 67
    const/4 v13, 0x0

    .line 68
    const/16 v17, 0x0

    .line 69
    .line 70
    const/16 v18, 0x0

    .line 71
    .line 72
    const/16 v19, 0x0

    .line 73
    .line 74
    const/16 v20, 0x0

    .line 75
    .line 76
    const/16 v26, 0x0

    .line 77
    .line 78
    move-object/from16 v14, v21

    .line 79
    .line 80
    move/from16 v21, v8

    .line 81
    .line 82
    move-wide/from16 v27, v34

    .line 83
    .line 84
    invoke-direct/range {v0 .. v30}, Lpc4;-><init>(IJLandroid/os/Bundle;ILjava/util/List;ZIZLjava/lang/String;Lqf3;Landroid/location/Location;Ljava/lang/String;Landroid/os/Bundle;Landroid/os/Bundle;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;ZLec2;ILjava/lang/String;Ljava/util/List;ILjava/lang/String;IJJ)V

    .line 85
    .line 86
    .line 87
    return-object v0

    .line 88
    :cond_0
    move-object/from16 v14, v21

    .line 89
    .line 90
    invoke-static {v0}, Landroid/net/Uri;->decode(Ljava/lang/String;)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    new-instance v1, Landroid/util/JsonReader;

    .line 95
    .line 96
    new-instance v2, Ljava/io/StringReader;

    .line 97
    .line 98
    invoke-direct {v2, v0}, Ljava/io/StringReader;-><init>(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    invoke-direct {v1, v2}, Landroid/util/JsonReader;-><init>(Ljava/io/Reader;)V

    .line 102
    .line 103
    .line 104
    :try_start_0
    invoke-virtual {v1}, Landroid/util/JsonReader;->beginObject()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 105
    .line 106
    .line 107
    move v0, v8

    .line 108
    :cond_1
    :goto_0
    :try_start_1
    invoke-virtual {v1}, Landroid/util/JsonReader;->hasNext()Z

    .line 109
    .line 110
    .line 111
    move-result v2

    .line 112
    if-eqz v2, :cond_7

    .line 113
    .line 114
    invoke-virtual {v1}, Landroid/util/JsonReader;->nextName()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v2

    .line 118
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 119
    .line 120
    .line 121
    move-result v3
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    .line 122
    const/4 v5, 0x0

    .line 123
    const/4 v9, 0x1

    .line 124
    sparse-switch v3, :sswitch_data_0

    .line 125
    .line 126
    .line 127
    goto/16 :goto_3

    .line 128
    .line 129
    :sswitch_0
    const-string v3, "tagForChildDirectedTreatment"

    .line 130
    .line 131
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    move-result v2

    .line 135
    if-eqz v2, :cond_6

    .line 136
    .line 137
    :try_start_2
    invoke-virtual {v1}, Landroid/util/JsonReader;->nextBoolean()Z

    .line 138
    .line 139
    .line 140
    move-result v2
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    .line 141
    if-eqz v2, :cond_2

    .line 142
    .line 143
    move v8, v9

    .line 144
    goto :goto_0

    .line 145
    :cond_2
    move v8, v5

    .line 146
    goto :goto_0

    .line 147
    :sswitch_1
    const-string v3, "maxAdContentRating"

    .line 148
    .line 149
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 150
    .line 151
    .line 152
    move-result v2

    .line 153
    if-eqz v2, :cond_6

    .line 154
    .line 155
    :try_start_3
    invoke-virtual {v1}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v2

    .line 159
    sget-object v3, Lpp0;->b:Ljava/util/List;

    .line 160
    .line 161
    invoke-interface {v3, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 162
    .line 163
    .line 164
    move-result v3
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1

    .line 165
    if-eqz v3, :cond_1

    .line 166
    .line 167
    move-object/from16 v22, v2

    .line 168
    .line 169
    goto :goto_0

    .line 170
    :sswitch_2
    const-string v3, "keywords"

    .line 171
    .line 172
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 173
    .line 174
    .line 175
    move-result v2

    .line 176
    if-eqz v2, :cond_6

    .line 177
    .line 178
    :try_start_4
    invoke-virtual {v1}, Landroid/util/JsonReader;->beginArray()V

    .line 179
    .line 180
    .line 181
    new-instance v2, Ljava/util/ArrayList;

    .line 182
    .line 183
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 184
    .line 185
    .line 186
    :goto_1
    invoke-virtual {v1}, Landroid/util/JsonReader;->hasNext()Z

    .line 187
    .line 188
    .line 189
    move-result v3

    .line 190
    if-eqz v3, :cond_3

    .line 191
    .line 192
    invoke-virtual {v1}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object v3

    .line 196
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 197
    .line 198
    .line 199
    goto :goto_1

    .line 200
    :cond_3
    invoke-virtual {v1}, Landroid/util/JsonReader;->endArray()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1

    .line 201
    .line 202
    .line 203
    move-object v6, v2

    .line 204
    goto :goto_0

    .line 205
    :sswitch_3
    const-string v3, "httpTimeoutMillis"

    .line 206
    .line 207
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 208
    .line 209
    .line 210
    move-result v2

    .line 211
    if-eqz v2, :cond_6

    .line 212
    .line 213
    :try_start_5
    invoke-virtual {v1}, Landroid/util/JsonReader;->nextInt()I

    .line 214
    .line 215
    .line 216
    move-result v24
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_1

    .line 217
    goto :goto_0

    .line 218
    :sswitch_4
    const-string v3, "tagForUnderAgeOfConsent"

    .line 219
    .line 220
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 221
    .line 222
    .line 223
    move-result v2

    .line 224
    if-eqz v2, :cond_6

    .line 225
    .line 226
    :try_start_6
    invoke-virtual {v1}, Landroid/util/JsonReader;->nextBoolean()Z

    .line 227
    .line 228
    .line 229
    move-result v0
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_1

    .line 230
    if-eqz v0, :cond_4

    .line 231
    .line 232
    move v0, v9

    .line 233
    goto :goto_0

    .line 234
    :cond_4
    move v0, v5

    .line 235
    goto :goto_0

    .line 236
    :sswitch_5
    const-string v3, "isTestDevice"

    .line 237
    .line 238
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 239
    .line 240
    .line 241
    move-result v2

    .line 242
    if-eqz v2, :cond_6

    .line 243
    .line 244
    :try_start_7
    invoke-virtual {v1}, Landroid/util/JsonReader;->nextBoolean()Z

    .line 245
    .line 246
    .line 247
    move-result v7
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_1

    .line 248
    goto/16 :goto_0

    .line 249
    .line 250
    :sswitch_6
    const-string v3, "extras"

    .line 251
    .line 252
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 253
    .line 254
    .line 255
    move-result v2

    .line 256
    if-eqz v2, :cond_6

    .line 257
    .line 258
    :try_start_8
    invoke-virtual {v1}, Landroid/util/JsonReader;->beginObject()V

    .line 259
    .line 260
    .line 261
    new-instance v2, Landroid/os/Bundle;

    .line 262
    .line 263
    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 264
    .line 265
    .line 266
    :goto_2
    invoke-virtual {v1}, Landroid/util/JsonReader;->hasNext()Z

    .line 267
    .line 268
    .line 269
    move-result v3

    .line 270
    if-eqz v3, :cond_5

    .line 271
    .line 272
    invoke-virtual {v1}, Landroid/util/JsonReader;->nextName()Ljava/lang/String;

    .line 273
    .line 274
    .line 275
    move-result-object v3

    .line 276
    invoke-virtual {v1}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;

    .line 277
    .line 278
    .line 279
    move-result-object v5

    .line 280
    invoke-virtual {v2, v3, v5}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 281
    .line 282
    .line 283
    goto :goto_2

    .line 284
    :cond_5
    invoke-virtual {v1}, Landroid/util/JsonReader;->endObject()V

    .line 285
    .line 286
    .line 287
    move-object v4, v2

    .line 288
    goto/16 :goto_0

    .line 289
    .line 290
    :cond_6
    :goto_3
    invoke-virtual {v1}, Landroid/util/JsonReader;->skipValue()V

    .line 291
    .line 292
    .line 293
    goto/16 :goto_0

    .line 294
    .line 295
    :cond_7
    invoke-virtual {v1}, Landroid/util/JsonReader;->endObject()V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_1

    .line 296
    .line 297
    .line 298
    :goto_4
    move/from16 v28, v0

    .line 299
    .line 300
    move-object v13, v6

    .line 301
    move-object/from16 v29, v22

    .line 302
    .line 303
    move/from16 v31, v24

    .line 304
    .line 305
    goto :goto_5

    .line 306
    :catch_0
    move v0, v8

    .line 307
    :catch_1
    const-string v1, "Ad Request json was malformed, parsing ended early."

    .line 308
    .line 309
    invoke-static {v1}, Lgi2;->U(Ljava/lang/String;)V

    .line 310
    .line 311
    .line 312
    goto :goto_4

    .line 313
    :goto_5
    new-instance v0, Landroid/os/Bundle;

    .line 314
    .line 315
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 316
    .line 317
    .line 318
    const-string v0, "com.google.ads.mediation.admob.AdMobAdapter"

    .line 319
    .line 320
    invoke-virtual {v14, v0}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 321
    .line 322
    .line 323
    move-result-object v1

    .line 324
    if-nez v1, :cond_8

    .line 325
    .line 326
    invoke-virtual {v14, v0, v4}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 327
    .line 328
    .line 329
    move-object v11, v4

    .line 330
    :goto_6
    move-object/from16 v21, v14

    .line 331
    .line 332
    move v14, v7

    .line 333
    goto :goto_7

    .line 334
    :cond_8
    move-object v11, v1

    .line 335
    goto :goto_6

    .line 336
    :goto_7
    new-instance v7, Lpc4;

    .line 337
    .line 338
    move-object/from16 v22, v15

    .line 339
    .line 340
    move v15, v8

    .line 341
    const/16 v8, 0x8

    .line 342
    .line 343
    const-wide/16 v9, -0x1

    .line 344
    .line 345
    const/4 v12, -0x1

    .line 346
    move-object/from16 v30, v23

    .line 347
    .line 348
    move-object/from16 v23, v16

    .line 349
    .line 350
    const/16 v16, 0x0

    .line 351
    .line 352
    const/16 v17, 0x0

    .line 353
    .line 354
    const/16 v18, 0x0

    .line 355
    .line 356
    const/16 v19, 0x0

    .line 357
    .line 358
    const/16 v20, 0x0

    .line 359
    .line 360
    const/16 v24, 0x0

    .line 361
    .line 362
    const/16 v25, 0x0

    .line 363
    .line 364
    const/16 v26, 0x0

    .line 365
    .line 366
    const/16 v27, 0x0

    .line 367
    .line 368
    const/16 v32, 0x0

    .line 369
    .line 370
    const/16 v33, 0x0

    .line 371
    .line 372
    const-wide/16 v36, 0x0

    .line 373
    .line 374
    invoke-direct/range {v7 .. v37}, Lpc4;-><init>(IJLandroid/os/Bundle;ILjava/util/List;ZIZLjava/lang/String;Lqf3;Landroid/location/Location;Ljava/lang/String;Landroid/os/Bundle;Landroid/os/Bundle;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;ZLec2;ILjava/lang/String;Ljava/util/List;ILjava/lang/String;IJJ)V

    .line 375
    .line 376
    .line 377
    return-object v7

    .line 378
    nop

    .line 379
    :sswitch_data_0
    .sparse-switch
        -0x4cd5119d -> :sswitch_6
        -0x3203e9ae -> :sswitch_5
        -0x2bb75c13 -> :sswitch_4
        -0x5f434a1 -> :sswitch_3
        0x1f2e9faa -> :sswitch_2
        0x239f260f -> :sswitch_1
        0x54230b03 -> :sswitch_0
    .end sparse-switch
.end method


# virtual methods
.method public final A3(ILandroid/os/Parcel;Landroid/os/Parcel;)Z
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Lbw2;->h:Ljava/util/HashMap;

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    if-eq v1, v3, :cond_1

    .line 9
    .line 10
    const/4 v4, 0x2

    .line 11
    if-eq v1, v4, :cond_0

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    return v1

    .line 15
    :cond_0
    invoke-virtual {v2}, Ljava/util/HashMap;->clear()V

    .line 16
    .line 17
    .line 18
    :goto_0
    move/from16 v16, v3

    .line 19
    .line 20
    goto/16 :goto_4

    .line 21
    .line 22
    :cond_1
    invoke-virtual/range {p2 .. p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-static/range {p2 .. p2}, Liv1;->f(Landroid/os/Parcel;)V

    .line 27
    .line 28
    .line 29
    sget-object v4, Lmz1;->Ka:Liz1;

    .line 30
    .line 31
    sget-object v5, Ltw1;->e:Ltw1;

    .line 32
    .line 33
    iget-object v5, v5, Ltw1;->c:Lkz1;

    .line 34
    .line 35
    invoke-virtual {v5, v4}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    check-cast v4, Ljava/lang/Boolean;

    .line 40
    .line 41
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 42
    .line 43
    .line 44
    move-result v4

    .line 45
    if-nez v4, :cond_2

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_2
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    const-string v6, "Received H5 gmsg: "

    .line 53
    .line 54
    invoke-virtual {v6, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    invoke-static {v4}, Lgi2;->G(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    sget-object v4, Lhg4;->C:Lhg4;

    .line 66
    .line 67
    iget-object v4, v4, Lhg4;->c:Llf4;

    .line 68
    .line 69
    invoke-static {v1}, Llf4;->o(Landroid/net/Uri;)Ljava/util/HashMap;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    const-string v4, "action"

    .line 74
    .line 75
    invoke-virtual {v1, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v4

    .line 79
    check-cast v4, Ljava/lang/String;

    .line 80
    .line 81
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 82
    .line 83
    .line 84
    move-result v6

    .line 85
    if-eqz v6, :cond_3

    .line 86
    .line 87
    const-string v1, "H5 gmsg did not contain an action"

    .line 88
    .line 89
    invoke-static {v1}, Lgi2;->U(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_3
    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    .line 94
    .line 95
    .line 96
    move-result v6

    .line 97
    const v7, 0x2283a781

    .line 98
    .line 99
    .line 100
    iget-object v8, v0, Lbw2;->g:Lf20;

    .line 101
    .line 102
    if-eq v6, v7, :cond_5

    .line 103
    .line 104
    const v7, 0x33ebcb90

    .line 105
    .line 106
    .line 107
    if-eq v6, v7, :cond_4

    .line 108
    .line 109
    goto :goto_2

    .line 110
    :cond_4
    const-string v6, "initialize"

    .line 111
    .line 112
    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    move-result v7

    .line 116
    if-eqz v7, :cond_7

    .line 117
    .line 118
    invoke-virtual {v2}, Ljava/util/HashMap;->clear()V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 122
    .line 123
    .line 124
    new-instance v1, Lbu1;

    .line 125
    .line 126
    invoke-direct {v1, v6}, Lbu1;-><init>(Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v8, v1}, Lf20;->r(Lbu1;)V

    .line 130
    .line 131
    .line 132
    goto :goto_0

    .line 133
    :cond_5
    const-string v6, "dispose_all"

    .line 134
    .line 135
    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    move-result v6

    .line 139
    if-eqz v6, :cond_7

    .line 140
    .line 141
    invoke-virtual {v2}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 142
    .line 143
    .line 144
    move-result-object v1

    .line 145
    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 146
    .line 147
    .line 148
    move-result-object v1

    .line 149
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 150
    .line 151
    .line 152
    move-result v4

    .line 153
    if-eqz v4, :cond_6

    .line 154
    .line 155
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v4

    .line 159
    check-cast v4, Lzv2;

    .line 160
    .line 161
    invoke-interface {v4}, Lzv2;->h()V

    .line 162
    .line 163
    .line 164
    goto :goto_1

    .line 165
    :cond_6
    invoke-virtual {v2}, Ljava/util/HashMap;->clear()V

    .line 166
    .line 167
    .line 168
    goto/16 :goto_0

    .line 169
    .line 170
    :cond_7
    :goto_2
    const-string v6, "obj_id"

    .line 171
    .line 172
    invoke-virtual {v1, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v6

    .line 176
    check-cast v6, Ljava/lang/String;

    .line 177
    .line 178
    :try_start_0
    invoke-static {v6}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    invoke-static {v6}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 182
    .line 183
    .line 184
    move-result-wide v10
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    .line 185
    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    .line 186
    .line 187
    .line 188
    move-result v6

    .line 189
    const-string v7, "rewarded"

    .line 190
    .line 191
    const-string v9, "interstitial"

    .line 192
    .line 193
    const-string v12, "nativeObjectCreated"

    .line 194
    .line 195
    const-string v13, "creation"

    .line 196
    .line 197
    const-string v14, "onNativeAdObjectNotAvailable"

    .line 198
    .line 199
    const-string v15, " with ad unit "

    .line 200
    .line 201
    move/from16 v16, v3

    .line 202
    .line 203
    iget-object v3, v0, Lbw2;->f:Lci2;

    .line 204
    .line 205
    const-string v17, "Could not create H5 ad, missing ad unit id"

    .line 206
    .line 207
    const-string v0, "ad_unit"

    .line 208
    .line 209
    const-string v18, "Could not create H5 ad, object ID already exists"

    .line 210
    .line 211
    const-string v19, "Could not create H5 ad, too many existing objects"

    .line 212
    .line 213
    const-string v20, "Could not load H5 ad, object ID does not exist"

    .line 214
    .line 215
    const-string v21, "Could not show H5 ad, object ID does not exist"

    .line 216
    .line 217
    sparse-switch v6, :sswitch_data_0

    .line 218
    .line 219
    .line 220
    goto/16 :goto_3

    .line 221
    .line 222
    :sswitch_0
    const-string v6, "create_rewarded_ad"

    .line 223
    .line 224
    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 225
    .line 226
    .line 227
    move-result v6

    .line 228
    if-eqz v6, :cond_13

    .line 229
    .line 230
    invoke-virtual {v2}, Ljava/util/HashMap;->size()I

    .line 231
    .line 232
    .line 233
    move-result v4

    .line 234
    sget-object v6, Lmz1;->La:Liz1;

    .line 235
    .line 236
    invoke-virtual {v5, v6}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    move-result-object v5

    .line 240
    check-cast v5, Ljava/lang/Integer;

    .line 241
    .line 242
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 243
    .line 244
    .line 245
    move-result v5

    .line 246
    if-lt v4, v5, :cond_8

    .line 247
    .line 248
    invoke-static/range {v19 .. v19}, Lgi2;->i0(Ljava/lang/String;)V

    .line 249
    .line 250
    .line 251
    invoke-virtual {v8, v10, v11}, Lf20;->o(J)V

    .line 252
    .line 253
    .line 254
    goto/16 :goto_4

    .line 255
    .line 256
    :cond_8
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 257
    .line 258
    .line 259
    move-result-object v4

    .line 260
    invoke-virtual {v2, v4}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 261
    .line 262
    .line 263
    move-result v5

    .line 264
    if-eqz v5, :cond_9

    .line 265
    .line 266
    invoke-static/range {v18 .. v18}, Lgi2;->U(Ljava/lang/String;)V

    .line 267
    .line 268
    .line 269
    invoke-virtual {v8, v10, v11}, Lf20;->o(J)V

    .line 270
    .line 271
    .line 272
    goto/16 :goto_4

    .line 273
    .line 274
    :cond_9
    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 275
    .line 276
    .line 277
    move-result-object v0

    .line 278
    check-cast v0, Ljava/lang/String;

    .line 279
    .line 280
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 281
    .line 282
    .line 283
    move-result v1

    .line 284
    if-eqz v1, :cond_a

    .line 285
    .line 286
    invoke-static/range {v17 .. v17}, Lgi2;->i0(Ljava/lang/String;)V

    .line 287
    .line 288
    .line 289
    invoke-virtual {v8, v10, v11}, Lf20;->o(J)V

    .line 290
    .line 291
    .line 292
    goto/16 :goto_4

    .line 293
    .line 294
    :cond_a
    iget-object v14, v3, Lci2;->c:Lth2;

    .line 295
    .line 296
    iget-object v1, v3, Lci2;->d:Lci2;

    .line 297
    .line 298
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 299
    .line 300
    .line 301
    move-object v3, v12

    .line 302
    iget-object v12, v1, Lci2;->a:Landroid/content/Context;

    .line 303
    .line 304
    iget-object v1, v1, Lci2;->b:Lm42;

    .line 305
    .line 306
    move-object v5, v13

    .line 307
    new-instance v13, Lf20;

    .line 308
    .line 309
    const/16 v6, 0x16

    .line 310
    .line 311
    invoke-direct {v13, v6, v1}, Lf20;-><init>(ILjava/lang/Object;)V

    .line 312
    .line 313
    .line 314
    new-instance v9, Liw2;

    .line 315
    .line 316
    move-object v6, v15

    .line 317
    move-object v15, v0

    .line 318
    move-object v0, v6

    .line 319
    move-object v6, v3

    .line 320
    move-object v7, v5

    .line 321
    invoke-direct/range {v9 .. v15}, Liw2;-><init>(JLandroid/content/Context;Lf20;Lth2;Ljava/lang/String;)V

    .line 322
    .line 323
    .line 324
    invoke-virtual {v2, v4, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 325
    .line 326
    .line 327
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 328
    .line 329
    .line 330
    new-instance v1, Lbu1;

    .line 331
    .line 332
    invoke-direct {v1, v7}, Lbu1;-><init>(Ljava/lang/String;)V

    .line 333
    .line 334
    .line 335
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 336
    .line 337
    .line 338
    move-result-object v2

    .line 339
    iput-object v2, v1, Lbu1;->g:Ljava/lang/Object;

    .line 340
    .line 341
    iput-object v6, v1, Lbu1;->i:Ljava/lang/Object;

    .line 342
    .line 343
    invoke-virtual {v8, v1}, Lf20;->r(Lbu1;)V

    .line 344
    .line 345
    .line 346
    invoke-static {v10, v11}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 347
    .line 348
    .line 349
    move-result-object v1

    .line 350
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 351
    .line 352
    .line 353
    move-result v1

    .line 354
    add-int/lit8 v1, v1, 0x23

    .line 355
    .line 356
    invoke-virtual {v15}, Ljava/lang/String;->length()I

    .line 357
    .line 358
    .line 359
    move-result v2

    .line 360
    new-instance v3, Ljava/lang/StringBuilder;

    .line 361
    .line 362
    add-int/2addr v1, v2

    .line 363
    invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 364
    .line 365
    .line 366
    const-string v1, "Created H5 rewarded #"

    .line 367
    .line 368
    invoke-static {v3, v1, v10, v11, v0}, Lex0;->p(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)V

    .line 369
    .line 370
    .line 371
    invoke-virtual {v3, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 372
    .line 373
    .line 374
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 375
    .line 376
    .line 377
    move-result-object v0

    .line 378
    invoke-static {v0}, Lgi2;->G(Ljava/lang/String;)V

    .line 379
    .line 380
    .line 381
    goto/16 :goto_4

    .line 382
    .line 383
    :sswitch_1
    const-string v0, "dispose"

    .line 384
    .line 385
    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 386
    .line 387
    .line 388
    move-result v0

    .line 389
    if-eqz v0, :cond_13

    .line 390
    .line 391
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 392
    .line 393
    .line 394
    move-result-object v0

    .line 395
    invoke-virtual {v2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 396
    .line 397
    .line 398
    move-result-object v1

    .line 399
    check-cast v1, Lzv2;

    .line 400
    .line 401
    if-nez v1, :cond_b

    .line 402
    .line 403
    const-string v0, "Could not dispose H5 ad, object ID does not exist"

    .line 404
    .line 405
    invoke-static {v0}, Lgi2;->U(Ljava/lang/String;)V

    .line 406
    .line 407
    .line 408
    goto/16 :goto_4

    .line 409
    .line 410
    :cond_b
    invoke-interface {v1}, Lzv2;->h()V

    .line 411
    .line 412
    .line 413
    invoke-virtual {v2, v0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 414
    .line 415
    .line 416
    invoke-static {v10, v11}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 417
    .line 418
    .line 419
    move-result-object v0

    .line 420
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 421
    .line 422
    .line 423
    move-result v0

    .line 424
    new-instance v1, Ljava/lang/StringBuilder;

    .line 425
    .line 426
    add-int/lit8 v0, v0, 0x10

    .line 427
    .line 428
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 429
    .line 430
    .line 431
    const-string v0, "Disposed H5 ad #"

    .line 432
    .line 433
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 434
    .line 435
    .line 436
    invoke-virtual {v1, v10, v11}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 437
    .line 438
    .line 439
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 440
    .line 441
    .line 442
    move-result-object v0

    .line 443
    invoke-static {v0}, Lgi2;->G(Ljava/lang/String;)V

    .line 444
    .line 445
    .line 446
    goto/16 :goto_4

    .line 447
    .line 448
    :sswitch_2
    const-string v0, "load_interstitial_ad"

    .line 449
    .line 450
    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 451
    .line 452
    .line 453
    move-result v0

    .line 454
    if-eqz v0, :cond_13

    .line 455
    .line 456
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 457
    .line 458
    .line 459
    move-result-object v0

    .line 460
    invoke-virtual {v2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 461
    .line 462
    .line 463
    move-result-object v0

    .line 464
    check-cast v0, Lzv2;

    .line 465
    .line 466
    if-nez v0, :cond_c

    .line 467
    .line 468
    invoke-static/range {v20 .. v20}, Lgi2;->U(Ljava/lang/String;)V

    .line 469
    .line 470
    .line 471
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 472
    .line 473
    .line 474
    new-instance v0, Lbu1;

    .line 475
    .line 476
    invoke-direct {v0, v9}, Lbu1;-><init>(Ljava/lang/String;)V

    .line 477
    .line 478
    .line 479
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 480
    .line 481
    .line 482
    move-result-object v1

    .line 483
    iput-object v1, v0, Lbu1;->g:Ljava/lang/Object;

    .line 484
    .line 485
    iput-object v14, v0, Lbu1;->i:Ljava/lang/Object;

    .line 486
    .line 487
    invoke-virtual {v8, v0}, Lf20;->r(Lbu1;)V

    .line 488
    .line 489
    .line 490
    goto/16 :goto_4

    .line 491
    .line 492
    :cond_c
    invoke-static {v1}, Lbw2;->B3(Ljava/util/HashMap;)Lpc4;

    .line 493
    .line 494
    .line 495
    move-result-object v1

    .line 496
    invoke-interface {v0, v1}, Lzv2;->a(Lpc4;)V

    .line 497
    .line 498
    .line 499
    goto/16 :goto_4

    .line 500
    .line 501
    :sswitch_3
    move-object v6, v12

    .line 502
    move-object v7, v13

    .line 503
    move-object v9, v15

    .line 504
    const-string v12, "create_interstitial_ad"

    .line 505
    .line 506
    invoke-virtual {v4, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 507
    .line 508
    .line 509
    move-result v12

    .line 510
    if-eqz v12, :cond_13

    .line 511
    .line 512
    invoke-virtual {v2}, Ljava/util/HashMap;->size()I

    .line 513
    .line 514
    .line 515
    move-result v4

    .line 516
    sget-object v12, Lmz1;->La:Liz1;

    .line 517
    .line 518
    invoke-virtual {v5, v12}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 519
    .line 520
    .line 521
    move-result-object v5

    .line 522
    check-cast v5, Ljava/lang/Integer;

    .line 523
    .line 524
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 525
    .line 526
    .line 527
    move-result v5

    .line 528
    if-lt v4, v5, :cond_d

    .line 529
    .line 530
    invoke-static/range {v19 .. v19}, Lgi2;->i0(Ljava/lang/String;)V

    .line 531
    .line 532
    .line 533
    invoke-virtual {v8, v10, v11}, Lf20;->o(J)V

    .line 534
    .line 535
    .line 536
    goto/16 :goto_4

    .line 537
    .line 538
    :cond_d
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 539
    .line 540
    .line 541
    move-result-object v4

    .line 542
    invoke-virtual {v2, v4}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 543
    .line 544
    .line 545
    move-result v5

    .line 546
    if-eqz v5, :cond_e

    .line 547
    .line 548
    invoke-static/range {v18 .. v18}, Lgi2;->U(Ljava/lang/String;)V

    .line 549
    .line 550
    .line 551
    invoke-virtual {v8, v10, v11}, Lf20;->o(J)V

    .line 552
    .line 553
    .line 554
    goto/16 :goto_4

    .line 555
    .line 556
    :cond_e
    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 557
    .line 558
    .line 559
    move-result-object v0

    .line 560
    move-object v15, v0

    .line 561
    check-cast v15, Ljava/lang/String;

    .line 562
    .line 563
    invoke-static {v15}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 564
    .line 565
    .line 566
    move-result v0

    .line 567
    if-eqz v0, :cond_f

    .line 568
    .line 569
    invoke-static/range {v17 .. v17}, Lgi2;->i0(Ljava/lang/String;)V

    .line 570
    .line 571
    .line 572
    invoke-virtual {v8, v10, v11}, Lf20;->o(J)V

    .line 573
    .line 574
    .line 575
    goto/16 :goto_4

    .line 576
    .line 577
    :cond_f
    iget-object v14, v3, Lci2;->c:Lth2;

    .line 578
    .line 579
    iget-object v0, v3, Lci2;->d:Lci2;

    .line 580
    .line 581
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 582
    .line 583
    .line 584
    iget-object v12, v0, Lci2;->a:Landroid/content/Context;

    .line 585
    .line 586
    iget-object v0, v0, Lci2;->b:Lm42;

    .line 587
    .line 588
    new-instance v13, Lf20;

    .line 589
    .line 590
    const/16 v1, 0x16

    .line 591
    .line 592
    invoke-direct {v13, v1, v0}, Lf20;-><init>(ILjava/lang/Object;)V

    .line 593
    .line 594
    .line 595
    move-object v0, v9

    .line 596
    new-instance v9, Lfw2;

    .line 597
    .line 598
    invoke-direct/range {v9 .. v15}, Lfw2;-><init>(JLandroid/content/Context;Lf20;Lth2;Ljava/lang/String;)V

    .line 599
    .line 600
    .line 601
    invoke-virtual {v2, v4, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 602
    .line 603
    .line 604
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 605
    .line 606
    .line 607
    new-instance v1, Lbu1;

    .line 608
    .line 609
    invoke-direct {v1, v7}, Lbu1;-><init>(Ljava/lang/String;)V

    .line 610
    .line 611
    .line 612
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 613
    .line 614
    .line 615
    move-result-object v2

    .line 616
    iput-object v2, v1, Lbu1;->g:Ljava/lang/Object;

    .line 617
    .line 618
    iput-object v6, v1, Lbu1;->i:Ljava/lang/Object;

    .line 619
    .line 620
    invoke-virtual {v8, v1}, Lf20;->r(Lbu1;)V

    .line 621
    .line 622
    .line 623
    invoke-static {v10, v11}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 624
    .line 625
    .line 626
    move-result-object v1

    .line 627
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 628
    .line 629
    .line 630
    move-result v1

    .line 631
    add-int/lit8 v1, v1, 0x27

    .line 632
    .line 633
    invoke-virtual {v15}, Ljava/lang/String;->length()I

    .line 634
    .line 635
    .line 636
    move-result v2

    .line 637
    new-instance v3, Ljava/lang/StringBuilder;

    .line 638
    .line 639
    add-int/2addr v1, v2

    .line 640
    invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 641
    .line 642
    .line 643
    const-string v1, "Created H5 interstitial #"

    .line 644
    .line 645
    invoke-static {v3, v1, v10, v11, v0}, Lex0;->p(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)V

    .line 646
    .line 647
    .line 648
    invoke-virtual {v3, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 649
    .line 650
    .line 651
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 652
    .line 653
    .line 654
    move-result-object v0

    .line 655
    invoke-static {v0}, Lgi2;->G(Ljava/lang/String;)V

    .line 656
    .line 657
    .line 658
    goto/16 :goto_4

    .line 659
    .line 660
    :sswitch_4
    const-string v0, "load_rewarded_ad"

    .line 661
    .line 662
    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 663
    .line 664
    .line 665
    move-result v0

    .line 666
    if-eqz v0, :cond_13

    .line 667
    .line 668
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 669
    .line 670
    .line 671
    move-result-object v0

    .line 672
    invoke-virtual {v2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 673
    .line 674
    .line 675
    move-result-object v0

    .line 676
    check-cast v0, Lzv2;

    .line 677
    .line 678
    if-nez v0, :cond_10

    .line 679
    .line 680
    invoke-static/range {v20 .. v20}, Lgi2;->U(Ljava/lang/String;)V

    .line 681
    .line 682
    .line 683
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 684
    .line 685
    .line 686
    new-instance v0, Lbu1;

    .line 687
    .line 688
    invoke-direct {v0, v7}, Lbu1;-><init>(Ljava/lang/String;)V

    .line 689
    .line 690
    .line 691
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 692
    .line 693
    .line 694
    move-result-object v1

    .line 695
    iput-object v1, v0, Lbu1;->g:Ljava/lang/Object;

    .line 696
    .line 697
    iput-object v14, v0, Lbu1;->i:Ljava/lang/Object;

    .line 698
    .line 699
    invoke-virtual {v8, v0}, Lf20;->r(Lbu1;)V

    .line 700
    .line 701
    .line 702
    goto/16 :goto_4

    .line 703
    .line 704
    :cond_10
    invoke-static {v1}, Lbw2;->B3(Ljava/util/HashMap;)Lpc4;

    .line 705
    .line 706
    .line 707
    move-result-object v1

    .line 708
    invoke-interface {v0, v1}, Lzv2;->a(Lpc4;)V

    .line 709
    .line 710
    .line 711
    goto/16 :goto_4

    .line 712
    .line 713
    :sswitch_5
    const-string v0, "show_rewarded_ad"

    .line 714
    .line 715
    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 716
    .line 717
    .line 718
    move-result v0

    .line 719
    if-eqz v0, :cond_13

    .line 720
    .line 721
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 722
    .line 723
    .line 724
    move-result-object v0

    .line 725
    invoke-virtual {v2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 726
    .line 727
    .line 728
    move-result-object v0

    .line 729
    check-cast v0, Lzv2;

    .line 730
    .line 731
    if-nez v0, :cond_11

    .line 732
    .line 733
    invoke-static/range {v21 .. v21}, Lgi2;->U(Ljava/lang/String;)V

    .line 734
    .line 735
    .line 736
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 737
    .line 738
    .line 739
    new-instance v0, Lbu1;

    .line 740
    .line 741
    invoke-direct {v0, v7}, Lbu1;-><init>(Ljava/lang/String;)V

    .line 742
    .line 743
    .line 744
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 745
    .line 746
    .line 747
    move-result-object v1

    .line 748
    iput-object v1, v0, Lbu1;->g:Ljava/lang/Object;

    .line 749
    .line 750
    iput-object v14, v0, Lbu1;->i:Ljava/lang/Object;

    .line 751
    .line 752
    invoke-virtual {v8, v0}, Lf20;->r(Lbu1;)V

    .line 753
    .line 754
    .line 755
    goto :goto_4

    .line 756
    :cond_11
    invoke-interface {v0}, Lzv2;->d()V

    .line 757
    .line 758
    .line 759
    goto :goto_4

    .line 760
    :sswitch_6
    const-string v0, "show_interstitial_ad"

    .line 761
    .line 762
    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 763
    .line 764
    .line 765
    move-result v0

    .line 766
    if-eqz v0, :cond_13

    .line 767
    .line 768
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 769
    .line 770
    .line 771
    move-result-object v0

    .line 772
    invoke-virtual {v2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 773
    .line 774
    .line 775
    move-result-object v0

    .line 776
    check-cast v0, Lzv2;

    .line 777
    .line 778
    if-nez v0, :cond_12

    .line 779
    .line 780
    invoke-static/range {v21 .. v21}, Lgi2;->U(Ljava/lang/String;)V

    .line 781
    .line 782
    .line 783
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 784
    .line 785
    .line 786
    new-instance v0, Lbu1;

    .line 787
    .line 788
    invoke-direct {v0, v9}, Lbu1;-><init>(Ljava/lang/String;)V

    .line 789
    .line 790
    .line 791
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 792
    .line 793
    .line 794
    move-result-object v1

    .line 795
    iput-object v1, v0, Lbu1;->g:Ljava/lang/Object;

    .line 796
    .line 797
    iput-object v14, v0, Lbu1;->i:Ljava/lang/Object;

    .line 798
    .line 799
    invoke-virtual {v8, v0}, Lf20;->r(Lbu1;)V

    .line 800
    .line 801
    .line 802
    goto :goto_4

    .line 803
    :cond_12
    invoke-interface {v0}, Lzv2;->d()V

    .line 804
    .line 805
    .line 806
    goto :goto_4

    .line 807
    :cond_13
    :goto_3
    const-string v0, "H5 gmsg contained invalid action: "

    .line 808
    .line 809
    invoke-virtual {v0, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 810
    .line 811
    .line 812
    move-result-object v0

    .line 813
    invoke-static {v0}, Lgi2;->U(Ljava/lang/String;)V

    .line 814
    .line 815
    .line 816
    goto :goto_4

    .line 817
    :catch_0
    move/from16 v16, v3

    .line 818
    .line 819
    invoke-static {v6}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 820
    .line 821
    .line 822
    move-result-object v0

    .line 823
    const-string v1, "H5 gmsg did not contain a valid object id: "

    .line 824
    .line 825
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 826
    .line 827
    .line 828
    move-result-object v0

    .line 829
    invoke-static {v0}, Lgi2;->U(Ljava/lang/String;)V

    .line 830
    .line 831
    .line 832
    :goto_4
    invoke-virtual/range {p3 .. p3}, Landroid/os/Parcel;->writeNoException()V

    .line 833
    .line 834
    .line 835
    return v16

    .line 836
    nop

    .line 837
    :sswitch_data_0
    .sparse-switch
        -0x6abfbf2c -> :sswitch_6
        -0x4b7b584e -> :sswitch_5
        -0xf5303e5 -> :sswitch_4
        0x177a28d3 -> :sswitch_3
        0x22e638bd -> :sswitch_2
        0x63a5261f -> :sswitch_1
        0x7db86731 -> :sswitch_0
    .end sparse-switch
.end method
