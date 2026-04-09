.class public final Lzc3;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# static fields
.field public static final g:Lzc3;

.field public static final h:Landroid/os/Handler;

.field public static i:Landroid/os/Handler;

.field public static final j:Lvr;

.field public static final k:Lvr;


# instance fields
.field public final a:Ljava/util/ArrayList;

.field public final b:Ljava/util/ArrayList;

.field public final c:Lmr2;

.field public final d:Lx03;

.field public final e:Llv2;

.field public f:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lzc3;

    .line 2
    .line 3
    invoke-direct {v0}, Lzc3;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lzc3;->g:Lzc3;

    .line 7
    .line 8
    new-instance v0, Landroid/os/Handler;

    .line 9
    .line 10
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 15
    .line 16
    .line 17
    sput-object v0, Lzc3;->h:Landroid/os/Handler;

    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    sput-object v0, Lzc3;->i:Landroid/os/Handler;

    .line 21
    .line 22
    new-instance v0, Lvr;

    .line 23
    .line 24
    const/4 v1, 0x7

    .line 25
    invoke-direct {v0, v1}, Lvr;-><init>(I)V

    .line 26
    .line 27
    .line 28
    sput-object v0, Lzc3;->j:Lvr;

    .line 29
    .line 30
    new-instance v0, Lvr;

    .line 31
    .line 32
    const/16 v1, 0x8

    .line 33
    .line 34
    invoke-direct {v0, v1}, Lvr;-><init>(I)V

    .line 35
    .line 36
    .line 37
    sput-object v0, Lzc3;->k:Lvr;

    .line 38
    .line 39
    return-void
.end method

.method public constructor <init>()V
    .locals 3

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
    iput-object v0, p0, Lzc3;->a:Ljava/util/ArrayList;

    .line 10
    .line 11
    new-instance v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lzc3;->b:Ljava/util/ArrayList;

    .line 17
    .line 18
    new-instance v0, Lx03;

    .line 19
    .line 20
    invoke-direct {v0}, Lx03;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lzc3;->d:Lx03;

    .line 24
    .line 25
    new-instance v0, Lmr2;

    .line 26
    .line 27
    const/16 v1, 0xa

    .line 28
    .line 29
    invoke-direct {v0, v1}, Lmr2;-><init>(I)V

    .line 30
    .line 31
    .line 32
    iput-object v0, p0, Lzc3;->c:Lmr2;

    .line 33
    .line 34
    new-instance v0, Llv2;

    .line 35
    .line 36
    new-instance v1, Lt83;

    .line 37
    .line 38
    const/16 v2, 0x1d

    .line 39
    .line 40
    invoke-direct {v1, v2}, Lt83;-><init>(I)V

    .line 41
    .line 42
    .line 43
    invoke-direct {v0, v1}, Llv2;-><init>(Lt83;)V

    .line 44
    .line 45
    .line 46
    iput-object v0, p0, Lzc3;->e:Llv2;

    .line 47
    .line 48
    return-void
.end method

.method public static b()V
    .locals 4

    .line 1
    sget-object v0, Lzc3;->i:Landroid/os/Handler;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Landroid/os/Handler;

    .line 6
    .line 7
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lzc3;->i:Landroid/os/Handler;

    .line 15
    .line 16
    sget-object v1, Lzc3;->j:Lvr;

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 19
    .line 20
    .line 21
    sget-object v0, Lzc3;->i:Landroid/os/Handler;

    .line 22
    .line 23
    sget-object v1, Lzc3;->k:Lvr;

    .line 24
    .line 25
    const-wide/16 v2, 0xc8

    .line 26
    .line 27
    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 28
    .line 29
    .line 30
    :cond_0
    return-void
.end method


# virtual methods
.method public final a(Landroid/view/View;Lrc3;Lorg/json/JSONObject;Z)V
    .locals 9

    .line 1
    invoke-static {p1}, Lpu1;->q(Landroid/view/View;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_13

    .line 6
    .line 7
    iget-object v0, p0, Lzc3;->d:Lx03;

    .line 8
    .line 9
    iget-object v1, v0, Lx03;->j:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v1, Ljava/util/HashSet;

    .line 12
    .line 13
    invoke-virtual {v1, p1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    const/4 v2, 0x3

    .line 18
    const/4 v3, 0x1

    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    move v1, v3

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    iget-boolean v1, v0, Lx03;->f:Z

    .line 24
    .line 25
    if-eqz v1, :cond_1

    .line 26
    .line 27
    const/4 v1, 0x2

    .line 28
    goto :goto_0

    .line 29
    :cond_1
    move v1, v2

    .line 30
    :goto_0
    if-ne v1, v2, :cond_2

    .line 31
    .line 32
    goto/16 :goto_f

    .line 33
    .line 34
    :cond_2
    invoke-virtual {p2, p1}, Lrc3;->f(Landroid/view/View;)Lorg/json/JSONObject;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    invoke-static {p3, v2}, Lvc3;->c(Lorg/json/JSONObject;Lorg/json/JSONObject;)V

    .line 39
    .line 40
    .line 41
    iget-object p3, v0, Lx03;->g:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast p3, Ljava/util/HashMap;

    .line 44
    .line 45
    invoke-virtual {p3}, Ljava/util/HashMap;->size()I

    .line 46
    .line 47
    .line 48
    move-result v4

    .line 49
    if-nez v4, :cond_3

    .line 50
    .line 51
    const/4 p3, 0x0

    .line 52
    goto :goto_1

    .line 53
    :cond_3
    invoke-virtual {p3, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v4

    .line 57
    check-cast v4, Ljava/lang/String;

    .line 58
    .line 59
    if-eqz v4, :cond_4

    .line 60
    .line 61
    invoke-virtual {p3, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    :cond_4
    move-object p3, v4

    .line 65
    :goto_1
    const/4 v4, 0x0

    .line 66
    if-eqz p3, :cond_7

    .line 67
    .line 68
    :try_start_0
    const-string p2, "adSessionId"

    .line 69
    .line 70
    invoke-virtual {v2, p2, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 71
    .line 72
    .line 73
    goto :goto_2

    .line 74
    :catch_0
    move-exception p2

    .line 75
    const-string p4, "Error with setting ad session id"

    .line 76
    .line 77
    invoke-static {p4, p2}, Lob1;->w(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 78
    .line 79
    .line 80
    :goto_2
    iget-object p2, v0, Lx03;->o:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast p2, Ljava/util/WeakHashMap;

    .line 83
    .line 84
    invoke-virtual {p2, p1}, Ljava/util/WeakHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result p4

    .line 88
    if-eqz p4, :cond_5

    .line 89
    .line 90
    sget-object p4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 91
    .line 92
    invoke-virtual {p2, p1, p4}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    goto :goto_3

    .line 96
    :cond_5
    move v4, v3

    .line 97
    :goto_3
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    :try_start_1
    const-string p2, "hasWindowFocus"

    .line 102
    .line 103
    invoke-virtual {v2, p2, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    .line 104
    .line 105
    .line 106
    goto :goto_4

    .line 107
    :catch_1
    move-exception p1

    .line 108
    const-string p2, "Error with setting has window focus"

    .line 109
    .line 110
    invoke-static {p2, p1}, Lob1;->w(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 111
    .line 112
    .line 113
    :goto_4
    iget-object p1, v0, Lx03;->n:Ljava/lang/Object;

    .line 114
    .line 115
    check-cast p1, Ljava/util/HashSet;

    .line 116
    .line 117
    invoke-virtual {p1, p3}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    move-result p1

    .line 121
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 122
    .line 123
    .line 124
    move-result-object p2

    .line 125
    if-eqz p1, :cond_6

    .line 126
    .line 127
    :try_start_2
    const-string p1, "isPipActive"

    .line 128
    .line 129
    invoke-virtual {v2, p1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_2

    .line 130
    .line 131
    .line 132
    goto :goto_5

    .line 133
    :catch_2
    move-exception p1

    .line 134
    const-string p2, "Error with setting is picture-in-picture active"

    .line 135
    .line 136
    invoke-static {p2, p1}, Lob1;->w(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 137
    .line 138
    .line 139
    :cond_6
    :goto_5
    iput-boolean v3, v0, Lx03;->f:Z

    .line 140
    .line 141
    goto/16 :goto_f

    .line 142
    .line 143
    :cond_7
    iget-object p3, v0, Lx03;->h:Ljava/lang/Object;

    .line 144
    .line 145
    check-cast p3, Ljava/util/HashMap;

    .line 146
    .line 147
    invoke-virtual {p3, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    check-cast v0, Lxc3;

    .line 152
    .line 153
    if-eqz v0, :cond_8

    .line 154
    .line 155
    invoke-virtual {p3, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    :cond_8
    if-eqz v0, :cond_a

    .line 159
    .line 160
    iget-object p3, v0, Lxc3;->a:Llc3;

    .line 161
    .line 162
    new-instance v5, Lorg/json/JSONArray;

    .line 163
    .line 164
    invoke-direct {v5}, Lorg/json/JSONArray;-><init>()V

    .line 165
    .line 166
    .line 167
    iget-object v0, v0, Lxc3;->b:Ljava/util/ArrayList;

    .line 168
    .line 169
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 170
    .line 171
    .line 172
    move-result v6

    .line 173
    move v7, v4

    .line 174
    :goto_6
    if-ge v7, v6, :cond_9

    .line 175
    .line 176
    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object v8

    .line 180
    check-cast v8, Ljava/lang/String;

    .line 181
    .line 182
    invoke-virtual {v5, v8}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 183
    .line 184
    .line 185
    add-int/lit8 v7, v7, 0x1

    .line 186
    .line 187
    goto :goto_6

    .line 188
    :cond_9
    :try_start_3
    const-string v0, "isFriendlyObstructionFor"

    .line 189
    .line 190
    invoke-virtual {v2, v0, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 191
    .line 192
    .line 193
    const-string v0, "friendlyObstructionClass"

    .line 194
    .line 195
    iget-object v5, p3, Llc3;->b:Ljava/lang/String;

    .line 196
    .line 197
    invoke-virtual {v2, v0, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 198
    .line 199
    .line 200
    const-string v0, "friendlyObstructionPurpose"

    .line 201
    .line 202
    iget-object v5, p3, Llc3;->c:Lac3;

    .line 203
    .line 204
    invoke-virtual {v2, v0, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 205
    .line 206
    .line 207
    const-string v0, "friendlyObstructionReason"

    .line 208
    .line 209
    iget-object p3, p3, Llc3;->d:Ljava/lang/String;

    .line 210
    .line 211
    invoke-virtual {v2, v0, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_3
    .catch Lorg/json/JSONException; {:try_start_3 .. :try_end_3} :catch_3

    .line 212
    .line 213
    .line 214
    :goto_7
    move p3, v3

    .line 215
    goto :goto_8

    .line 216
    :catch_3
    move-exception p3

    .line 217
    const-string v0, "Error with setting friendly obstruction"

    .line 218
    .line 219
    invoke-static {v0, p3}, Lob1;->w(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 220
    .line 221
    .line 222
    goto :goto_7

    .line 223
    :cond_a
    move p3, v4

    .line 224
    :goto_8
    if-nez p4, :cond_b

    .line 225
    .line 226
    if-eqz p3, :cond_c

    .line 227
    .line 228
    :cond_b
    move p3, v3

    .line 229
    goto :goto_9

    .line 230
    :cond_c
    move p3, v4

    .line 231
    :goto_9
    if-ne v1, v3, :cond_d

    .line 232
    .line 233
    goto :goto_a

    .line 234
    :cond_d
    move v3, v4

    .line 235
    :goto_a
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 236
    .line 237
    .line 238
    instance-of p4, p1, Landroid/view/ViewGroup;

    .line 239
    .line 240
    if-nez p4, :cond_e

    .line 241
    .line 242
    goto/16 :goto_f

    .line 243
    .line 244
    :cond_e
    check-cast p1, Landroid/view/ViewGroup;

    .line 245
    .line 246
    const/4 p4, 0x0

    .line 247
    if-eqz v3, :cond_12

    .line 248
    .line 249
    new-instance v0, Ljava/util/HashMap;

    .line 250
    .line 251
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 252
    .line 253
    .line 254
    move v1, p4

    .line 255
    :goto_b
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 256
    .line 257
    .line 258
    move-result v3

    .line 259
    if-ge v1, v3, :cond_10

    .line 260
    .line 261
    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 262
    .line 263
    .line 264
    move-result-object v3

    .line 265
    invoke-virtual {v3}, Landroid/view/View;->getZ()F

    .line 266
    .line 267
    .line 268
    move-result v4

    .line 269
    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 270
    .line 271
    .line 272
    move-result-object v4

    .line 273
    invoke-virtual {v0, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 274
    .line 275
    .line 276
    move-result-object v4

    .line 277
    check-cast v4, Ljava/util/ArrayList;

    .line 278
    .line 279
    if-nez v4, :cond_f

    .line 280
    .line 281
    new-instance v4, Ljava/util/ArrayList;

    .line 282
    .line 283
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 284
    .line 285
    .line 286
    invoke-virtual {v3}, Landroid/view/View;->getZ()F

    .line 287
    .line 288
    .line 289
    move-result v5

    .line 290
    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 291
    .line 292
    .line 293
    move-result-object v5

    .line 294
    invoke-virtual {v0, v5, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 295
    .line 296
    .line 297
    :cond_f
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 298
    .line 299
    .line 300
    add-int/lit8 v1, v1, 0x1

    .line 301
    .line 302
    goto :goto_b

    .line 303
    :cond_10
    new-instance p1, Ljava/util/ArrayList;

    .line 304
    .line 305
    invoke-virtual {v0}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    .line 306
    .line 307
    .line 308
    move-result-object v1

    .line 309
    invoke-direct {p1, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 310
    .line 311
    .line 312
    invoke-static {p1}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 313
    .line 314
    .line 315
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 316
    .line 317
    .line 318
    move-result v1

    .line 319
    move v3, p4

    .line 320
    :goto_c
    if-ge v3, v1, :cond_13

    .line 321
    .line 322
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 323
    .line 324
    .line 325
    move-result-object v4

    .line 326
    check-cast v4, Ljava/lang/Float;

    .line 327
    .line 328
    invoke-virtual {v0, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 329
    .line 330
    .line 331
    move-result-object v4

    .line 332
    check-cast v4, Ljava/util/ArrayList;

    .line 333
    .line 334
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 335
    .line 336
    .line 337
    move-result v5

    .line 338
    move v6, p4

    .line 339
    :goto_d
    add-int/lit8 v7, v3, 0x1

    .line 340
    .line 341
    if-ge v6, v5, :cond_11

    .line 342
    .line 343
    invoke-interface {v4, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 344
    .line 345
    .line 346
    move-result-object v7

    .line 347
    check-cast v7, Landroid/view/View;

    .line 348
    .line 349
    invoke-virtual {p0, v7, p2, v2, p3}, Lzc3;->a(Landroid/view/View;Lrc3;Lorg/json/JSONObject;Z)V

    .line 350
    .line 351
    .line 352
    add-int/lit8 v6, v6, 0x1

    .line 353
    .line 354
    goto :goto_d

    .line 355
    :cond_11
    move v3, v7

    .line 356
    goto :goto_c

    .line 357
    :cond_12
    :goto_e
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 358
    .line 359
    .line 360
    move-result v0

    .line 361
    if-ge p4, v0, :cond_13

    .line 362
    .line 363
    invoke-virtual {p1, p4}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 364
    .line 365
    .line 366
    move-result-object v0

    .line 367
    invoke-virtual {p0, v0, p2, v2, p3}, Lzc3;->a(Landroid/view/View;Lrc3;Lorg/json/JSONObject;Z)V

    .line 368
    .line 369
    .line 370
    add-int/lit8 p4, p4, 0x1

    .line 371
    .line 372
    goto :goto_e

    .line 373
    :cond_13
    :goto_f
    return-void
.end method
