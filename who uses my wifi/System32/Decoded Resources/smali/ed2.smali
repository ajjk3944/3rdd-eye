.class public final Led2;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final a:Ljava/util/ArrayList;

.field public final b:Ljava/util/ArrayList;

.field public final c:Ljava/util/HashMap;

.field public d:Ljava/lang/String;

.field public e:Ljava/lang/String;

.field public f:J

.field public g:Lorg/json/JSONObject;

.field public h:Z

.field public final i:Ljava/util/ArrayList;

.field public j:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;J)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Led2;->a:Ljava/util/ArrayList;

    .line 10
    .line 11
    new-instance v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Led2;->b:Ljava/util/ArrayList;

    .line 17
    .line 18
    new-instance v0, Ljava/util/HashMap;

    .line 19
    .line 20
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Led2;->c:Ljava/util/HashMap;

    .line 24
    .line 25
    const-string v0, ""

    .line 26
    .line 27
    iput-object v0, p0, Led2;->d:Ljava/lang/String;

    .line 28
    .line 29
    const/4 v0, 0x0

    .line 30
    iput-boolean v0, p0, Led2;->h:Z

    .line 31
    .line 32
    new-instance v1, Ljava/util/ArrayList;

    .line 33
    .line 34
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 35
    .line 36
    .line 37
    iput-object v1, p0, Led2;->i:Ljava/util/ArrayList;

    .line 38
    .line 39
    iput-boolean v0, p0, Led2;->j:Z

    .line 40
    .line 41
    iput-object p1, p0, Led2;->e:Ljava/lang/String;

    .line 42
    .line 43
    iput-wide p2, p0, Led2;->f:J

    .line 44
    .line 45
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 46
    .line 47
    .line 48
    move-result p2

    .line 49
    if-eqz p2, :cond_0

    .line 50
    .line 51
    goto/16 :goto_5

    .line 52
    .line 53
    :cond_0
    :try_start_0
    new-instance p2, Lorg/json/JSONObject;

    .line 54
    .line 55
    invoke-direct {p2, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    iput-object p2, p0, Led2;->g:Lorg/json/JSONObject;

    .line 59
    .line 60
    sget-object p1, Lmz1;->uc:Liz1;

    .line 61
    .line 62
    sget-object p2, Ltw1;->e:Ltw1;

    .line 63
    .line 64
    iget-object p2, p2, Ltw1;->c:Lkz1;

    .line 65
    .line 66
    invoke-virtual {p2, p1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    check-cast p1, Ljava/lang/Boolean;

    .line 71
    .line 72
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 73
    .line 74
    .line 75
    move-result p1

    .line 76
    if-eqz p1, :cond_1

    .line 77
    .line 78
    invoke-virtual {p0}, Led2;->a()Z

    .line 79
    .line 80
    .line 81
    move-result p1

    .line 82
    if-nez p1, :cond_a

    .line 83
    .line 84
    goto :goto_0

    .line 85
    :catch_0
    move-exception p1

    .line 86
    goto/16 :goto_6

    .line 87
    .line 88
    :cond_1
    :goto_0
    iget-object p1, p0, Led2;->g:Lorg/json/JSONObject;

    .line 89
    .line 90
    const-string p2, "status"

    .line 91
    .line 92
    const/4 p3, -0x1

    .line 93
    invoke-virtual {p1, p2, p3}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 94
    .line 95
    .line 96
    move-result p1

    .line 97
    const/4 p2, 0x1

    .line 98
    if-eq p1, p2, :cond_2

    .line 99
    .line 100
    iput-boolean v0, p0, Led2;->h:Z

    .line 101
    .line 102
    const-string p1, "App settings could not be fetched successfully."

    .line 103
    .line 104
    invoke-static {p1}, Lgi2;->i0(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    return-void

    .line 108
    :cond_2
    iput-boolean p2, p0, Led2;->h:Z

    .line 109
    .line 110
    iget-object p1, p0, Led2;->g:Lorg/json/JSONObject;

    .line 111
    .line 112
    const-string p2, "app_id"

    .line 113
    .line 114
    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    iput-object p1, p0, Led2;->d:Ljava/lang/String;

    .line 119
    .line 120
    iget-object p1, p0, Led2;->g:Lorg/json/JSONObject;

    .line 121
    .line 122
    const-string p2, "ad_unit_id_settings"

    .line 123
    .line 124
    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    if-eqz p1, :cond_7

    .line 129
    .line 130
    move p2, v0

    .line 131
    :goto_1
    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    .line 132
    .line 133
    .line 134
    move-result p3

    .line 135
    if-ge p2, p3, :cond_7

    .line 136
    .line 137
    invoke-virtual {p1, p2}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    .line 138
    .line 139
    .line 140
    move-result-object p3

    .line 141
    const-string v1, "format"

    .line 142
    .line 143
    invoke-virtual {p3, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v1

    .line 147
    const-string v2, "ad_unit_id"

    .line 148
    .line 149
    invoke-virtual {p3, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object v2

    .line 153
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 154
    .line 155
    .line 156
    move-result v3

    .line 157
    if-nez v3, :cond_6

    .line 158
    .line 159
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 160
    .line 161
    .line 162
    move-result v3

    .line 163
    if-eqz v3, :cond_3

    .line 164
    .line 165
    goto :goto_2

    .line 166
    :cond_3
    const-string v3, "interstitial"

    .line 167
    .line 168
    invoke-virtual {v3, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 169
    .line 170
    .line 171
    move-result v3

    .line 172
    if-eqz v3, :cond_4

    .line 173
    .line 174
    iget-object p3, p0, Led2;->b:Ljava/util/ArrayList;

    .line 175
    .line 176
    invoke-virtual {p3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 177
    .line 178
    .line 179
    goto :goto_2

    .line 180
    :cond_4
    const-string v3, "rewarded"

    .line 181
    .line 182
    invoke-virtual {v3, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 183
    .line 184
    .line 185
    move-result v3

    .line 186
    if-nez v3, :cond_5

    .line 187
    .line 188
    const-string v3, "rewarded_interstitial"

    .line 189
    .line 190
    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 191
    .line 192
    .line 193
    move-result v1

    .line 194
    if-eqz v1, :cond_6

    .line 195
    .line 196
    :cond_5
    const-string v1, "mediation_config"

    .line 197
    .line 198
    invoke-virtual {p3, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 199
    .line 200
    .line 201
    move-result-object p3

    .line 202
    if-eqz p3, :cond_6

    .line 203
    .line 204
    new-instance v1, Lr62;

    .line 205
    .line 206
    invoke-direct {v1, p3}, Lr62;-><init>(Lorg/json/JSONObject;)V

    .line 207
    .line 208
    .line 209
    iget-object p3, p0, Led2;->c:Ljava/util/HashMap;

    .line 210
    .line 211
    invoke-virtual {p3, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    :cond_6
    :goto_2
    add-int/lit8 p2, p2, 0x1

    .line 215
    .line 216
    goto :goto_1

    .line 217
    :cond_7
    iget-object p1, p0, Led2;->g:Lorg/json/JSONObject;

    .line 218
    .line 219
    const-string p2, "persistable_banner_ad_unit_ids"

    .line 220
    .line 221
    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 222
    .line 223
    .line 224
    move-result-object p1

    .line 225
    if-eqz p1, :cond_8

    .line 226
    .line 227
    move p2, v0

    .line 228
    :goto_3
    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    .line 229
    .line 230
    .line 231
    move-result p3

    .line 232
    if-ge p2, p3, :cond_8

    .line 233
    .line 234
    invoke-virtual {p1, p2}, Lorg/json/JSONArray;->optString(I)Ljava/lang/String;

    .line 235
    .line 236
    .line 237
    move-result-object p3

    .line 238
    iget-object v1, p0, Led2;->a:Ljava/util/ArrayList;

    .line 239
    .line 240
    invoke-virtual {v1, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 241
    .line 242
    .line 243
    add-int/lit8 p2, p2, 0x1

    .line 244
    .line 245
    goto :goto_3

    .line 246
    :cond_8
    sget-object p1, Lmz1;->j7:Liz1;

    .line 247
    .line 248
    sget-object p2, Ltw1;->e:Ltw1;

    .line 249
    .line 250
    iget-object p2, p2, Ltw1;->c:Lkz1;

    .line 251
    .line 252
    invoke-virtual {p2, p1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 253
    .line 254
    .line 255
    move-result-object p1

    .line 256
    check-cast p1, Ljava/lang/Boolean;

    .line 257
    .line 258
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 259
    .line 260
    .line 261
    move-result p1
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 262
    const-string p2, "common_settings"

    .line 263
    .line 264
    if-eqz p1, :cond_9

    .line 265
    .line 266
    :try_start_1
    iget-object p1, p0, Led2;->g:Lorg/json/JSONObject;

    .line 267
    .line 268
    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 269
    .line 270
    .line 271
    move-result-object p1

    .line 272
    if-eqz p1, :cond_9

    .line 273
    .line 274
    const-string p3, "loeid"

    .line 275
    .line 276
    invoke-virtual {p1, p3}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 277
    .line 278
    .line 279
    move-result-object p1

    .line 280
    if-eqz p1, :cond_9

    .line 281
    .line 282
    move p3, v0

    .line 283
    :goto_4
    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    .line 284
    .line 285
    .line 286
    move-result v1

    .line 287
    if-ge p3, v1, :cond_9

    .line 288
    .line 289
    iget-object v1, p0, Led2;->i:Ljava/util/ArrayList;

    .line 290
    .line 291
    invoke-virtual {p1, p3}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;

    .line 292
    .line 293
    .line 294
    move-result-object v2

    .line 295
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 296
    .line 297
    .line 298
    move-result-object v2

    .line 299
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 300
    .line 301
    .line 302
    add-int/lit8 p3, p3, 0x1

    .line 303
    .line 304
    goto :goto_4

    .line 305
    :cond_9
    sget-object p1, Lmz1;->F6:Liz1;

    .line 306
    .line 307
    sget-object p3, Ltw1;->e:Ltw1;

    .line 308
    .line 309
    iget-object p3, p3, Ltw1;->c:Lkz1;

    .line 310
    .line 311
    invoke-virtual {p3, p1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 312
    .line 313
    .line 314
    move-result-object p1

    .line 315
    check-cast p1, Ljava/lang/Boolean;

    .line 316
    .line 317
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 318
    .line 319
    .line 320
    move-result p1

    .line 321
    if-eqz p1, :cond_a

    .line 322
    .line 323
    iget-object p1, p0, Led2;->g:Lorg/json/JSONObject;

    .line 324
    .line 325
    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 326
    .line 327
    .line 328
    move-result-object p1

    .line 329
    if-eqz p1, :cond_a

    .line 330
    .line 331
    const-string p2, "is_prefetching_enabled"

    .line 332
    .line 333
    invoke-virtual {p1, p2, v0}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 334
    .line 335
    .line 336
    move-result p1

    .line 337
    iput-boolean p1, p0, Led2;->j:Z
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    .line 338
    .line 339
    :cond_a
    :goto_5
    return-void

    .line 340
    :goto_6
    const/4 p2, 0x5

    .line 341
    invoke-static {p2}, Lgi2;->q0(I)Z

    .line 342
    .line 343
    .line 344
    sget-object p2, Lhg4;->C:Lhg4;

    .line 345
    .line 346
    iget-object p2, p2, Lhg4;->h:Lgd2;

    .line 347
    .line 348
    const-string p3, "AppSettings.parseAppSettingsJson"

    .line 349
    .line 350
    invoke-virtual {p2, p3, p1}, Lgd2;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 351
    .line 352
    .line 353
    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 5

    .line 1
    invoke-virtual {p0}, Led2;->b()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    sget-object v0, Lmz1;->B4:Liz1;

    .line 10
    .line 11
    sget-object v2, Ltw1;->e:Ltw1;

    .line 12
    .line 13
    iget-object v2, v2, Ltw1;->c:Lkz1;

    .line 14
    .line 15
    invoke-virtual {v2, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Ljava/lang/Boolean;

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    sget-object v0, Lhg4;->C:Lhg4;

    .line 28
    .line 29
    iget-object v2, v0, Lhg4;->h:Lgd2;

    .line 30
    .line 31
    iget-object v2, v2, Lgd2;->i:Lmv2;

    .line 32
    .line 33
    if-eqz v2, :cond_1

    .line 34
    .line 35
    invoke-virtual {v2}, Lmv2;->a()Llv2;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    const-string v3, "action"

    .line 40
    .line 41
    const-string v4, "cld_reset"

    .line 42
    .line 43
    invoke-virtual {v2, v3, v4}, Llv2;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    iget-wide v3, p0, Led2;->f:J

    .line 47
    .line 48
    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    const-string v4, "cld_lut_ms"

    .line 53
    .line 54
    invoke-virtual {v2, v4, v3}, Llv2;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    iget-object v0, v0, Lhg4;->k:Lym;

    .line 58
    .line 59
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 63
    .line 64
    .line 65
    move-result-wide v3

    .line 66
    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    const-string v3, "event_timestamp"

    .line 71
    .line 72
    invoke-virtual {v2, v3, v0}, Llv2;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {p0}, Led2;->c()J

    .line 76
    .line 77
    .line 78
    move-result-wide v3

    .line 79
    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    const-string v3, "cld_ttl_sec"

    .line 84
    .line 85
    invoke-virtual {v2, v3, v0}, Llv2;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v2}, Llv2;->m()V

    .line 89
    .line 90
    .line 91
    :cond_1
    iget-object v0, p0, Led2;->a:Ljava/util/ArrayList;

    .line 92
    .line 93
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 94
    .line 95
    .line 96
    iget-object v0, p0, Led2;->b:Ljava/util/ArrayList;

    .line 97
    .line 98
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 99
    .line 100
    .line 101
    iget-object v0, p0, Led2;->c:Ljava/util/HashMap;

    .line 102
    .line 103
    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 104
    .line 105
    .line 106
    const-string v0, ""

    .line 107
    .line 108
    iput-object v0, p0, Led2;->d:Ljava/lang/String;

    .line 109
    .line 110
    iput-object v0, p0, Led2;->e:Ljava/lang/String;

    .line 111
    .line 112
    const/4 v0, 0x0

    .line 113
    iput-object v0, p0, Led2;->g:Lorg/json/JSONObject;

    .line 114
    .line 115
    iput-boolean v1, p0, Led2;->h:Z

    .line 116
    .line 117
    iget-object v0, p0, Led2;->i:Ljava/util/ArrayList;

    .line 118
    .line 119
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 120
    .line 121
    .line 122
    iput-boolean v1, p0, Led2;->j:Z

    .line 123
    .line 124
    const/4 v0, 0x1

    .line 125
    return v0
.end method

.method public final b()Z
    .locals 7

    .line 1
    iget-object v0, p0, Led2;->e:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_2

    .line 8
    .line 9
    iget-object v0, p0, Led2;->g:Lorg/json/JSONObject;

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    invoke-virtual {p0}, Led2;->c()J

    .line 15
    .line 16
    .line 17
    move-result-wide v0

    .line 18
    sget-object v2, Lhg4;->C:Lhg4;

    .line 19
    .line 20
    iget-object v2, v2, Lhg4;->k:Lym;

    .line 21
    .line 22
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 26
    .line 27
    .line 28
    move-result-wide v2

    .line 29
    const-wide/16 v4, 0x0

    .line 30
    .line 31
    cmp-long v4, v0, v4

    .line 32
    .line 33
    if-ltz v4, :cond_2

    .line 34
    .line 35
    iget-wide v4, p0, Led2;->f:J

    .line 36
    .line 37
    cmp-long v6, v4, v2

    .line 38
    .line 39
    if-gtz v6, :cond_1

    .line 40
    .line 41
    sget-object v6, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 42
    .line 43
    sub-long/2addr v2, v4

    .line 44
    invoke-virtual {v6, v2, v3}, Ljava/util/concurrent/TimeUnit;->toSeconds(J)J

    .line 45
    .line 46
    .line 47
    move-result-wide v2

    .line 48
    cmp-long v0, v2, v0

    .line 49
    .line 50
    if-gtz v0, :cond_1

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_1
    const/4 v0, 0x0

    .line 54
    return v0

    .line 55
    :cond_2
    :goto_0
    const/4 v0, 0x1

    .line 56
    return v0
.end method

.method public final c()J
    .locals 5

    .line 1
    sget-object v0, Lmz1;->xc:Liz1;

    .line 2
    .line 3
    sget-object v1, Ltw1;->e:Ltw1;

    .line 4
    .line 5
    iget-object v2, v1, Ltw1;->c:Lkz1;

    .line 6
    .line 7
    invoke-virtual {v2, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    check-cast v2, Ljava/lang/Long;

    .line 12
    .line 13
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 14
    .line 15
    .line 16
    move-result-wide v2

    .line 17
    sget-object v4, Lmz1;->wc:Liz1;

    .line 18
    .line 19
    iget-object v1, v1, Ltw1;->c:Lkz1;

    .line 20
    .line 21
    invoke-virtual {v1, v4}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    check-cast v4, Ljava/lang/Boolean;

    .line 26
    .line 27
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    if-eqz v4, :cond_0

    .line 32
    .line 33
    iget-object v4, p0, Led2;->e:Ljava/lang/String;

    .line 34
    .line 35
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 36
    .line 37
    .line 38
    move-result v4

    .line 39
    if-nez v4, :cond_0

    .line 40
    .line 41
    iget-object v2, p0, Led2;->g:Lorg/json/JSONObject;

    .line 42
    .line 43
    invoke-virtual {v1, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    check-cast v0, Ljava/lang/Long;

    .line 48
    .line 49
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 50
    .line 51
    .line 52
    move-result-wide v0

    .line 53
    const-string v3, "cache_ttl_sec"

    .line 54
    .line 55
    invoke-virtual {v2, v3, v0, v1}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    .line 56
    .line 57
    .line 58
    move-result-wide v0

    .line 59
    return-wide v0

    .line 60
    :cond_0
    return-wide v2
.end method
