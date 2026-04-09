.class public final Lxh0;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Ljava/util/ArrayList;

.field public final c:Ljava/util/ArrayList;

.field public final d:Ljava/util/ArrayList;

.field public e:Ljava/lang/CharSequence;

.field public f:Ljava/lang/CharSequence;

.field public g:Landroid/app/PendingIntent;

.field public h:Landroidx/core/graphics/drawable/IconCompat;

.field public i:I

.field public final j:Z

.field public k:Lf74;

.field public l:Z

.field public m:Landroid/os/Bundle;

.field public n:Ljava/lang/String;

.field public final o:Z

.field public final p:Landroid/app/Notification;

.field public final q:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
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
    iput-object v0, p0, Lxh0;->b:Ljava/util/ArrayList;

    .line 10
    .line 11
    new-instance v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lxh0;->c:Ljava/util/ArrayList;

    .line 17
    .line 18
    new-instance v0, Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lxh0;->d:Ljava/util/ArrayList;

    .line 24
    .line 25
    const/4 v0, 0x1

    .line 26
    iput-boolean v0, p0, Lxh0;->j:Z

    .line 27
    .line 28
    const/4 v1, 0x0

    .line 29
    iput-boolean v1, p0, Lxh0;->l:Z

    .line 30
    .line 31
    new-instance v2, Landroid/app/Notification;

    .line 32
    .line 33
    invoke-direct {v2}, Landroid/app/Notification;-><init>()V

    .line 34
    .line 35
    .line 36
    iput-object v2, p0, Lxh0;->p:Landroid/app/Notification;

    .line 37
    .line 38
    iput-object p1, p0, Lxh0;->a:Landroid/content/Context;

    .line 39
    .line 40
    iput-object p2, p0, Lxh0;->n:Ljava/lang/String;

    .line 41
    .line 42
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 43
    .line 44
    .line 45
    move-result-wide p1

    .line 46
    iput-wide p1, v2, Landroid/app/Notification;->when:J

    .line 47
    .line 48
    const/4 p1, -0x1

    .line 49
    iput p1, v2, Landroid/app/Notification;->audioStreamType:I

    .line 50
    .line 51
    iput v1, p0, Lxh0;->i:I

    .line 52
    .line 53
    new-instance p1, Ljava/util/ArrayList;

    .line 54
    .line 55
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 56
    .line 57
    .line 58
    iput-object p1, p0, Lxh0;->q:Ljava/util/ArrayList;

    .line 59
    .line 60
    iput-boolean v0, p0, Lxh0;->o:Z

    .line 61
    .line 62
    return-void
.end method

.method public static b(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
    .locals 2

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    return-object p0

    .line 4
    :cond_0
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    const/16 v1, 0x1400

    .line 9
    .line 10
    if-le v0, v1, :cond_1

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-interface {p0, v0, v1}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    :cond_1
    return-object p0
.end method


# virtual methods
.method public final a()Landroid/app/Notification;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v1, Lp21;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    new-instance v2, Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 11
    .line 12
    .line 13
    new-instance v2, Landroid/os/Bundle;

    .line 14
    .line 15
    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object v2, v1, Lp21;->i:Ljava/lang/Object;

    .line 19
    .line 20
    iput-object v0, v1, Lp21;->h:Ljava/lang/Object;

    .line 21
    .line 22
    iget-object v2, v0, Lxh0;->a:Landroid/content/Context;

    .line 23
    .line 24
    iput-object v2, v1, Lp21;->f:Ljava/lang/Object;

    .line 25
    .line 26
    iget-object v3, v0, Lxh0;->n:Ljava/lang/String;

    .line 27
    .line 28
    invoke-static {v2, v3}, Lci0;->a(Landroid/content/Context;Ljava/lang/String;)Landroid/app/Notification$Builder;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    iput-object v3, v1, Lp21;->g:Ljava/lang/Object;

    .line 33
    .line 34
    iget-object v4, v0, Lxh0;->p:Landroid/app/Notification;

    .line 35
    .line 36
    iget-wide v5, v4, Landroid/app/Notification;->when:J

    .line 37
    .line 38
    invoke-virtual {v3, v5, v6}, Landroid/app/Notification$Builder;->setWhen(J)Landroid/app/Notification$Builder;

    .line 39
    .line 40
    .line 41
    move-result-object v5

    .line 42
    iget v6, v4, Landroid/app/Notification;->icon:I

    .line 43
    .line 44
    iget v7, v4, Landroid/app/Notification;->iconLevel:I

    .line 45
    .line 46
    invoke-virtual {v5, v6, v7}, Landroid/app/Notification$Builder;->setSmallIcon(II)Landroid/app/Notification$Builder;

    .line 47
    .line 48
    .line 49
    move-result-object v5

    .line 50
    iget-object v6, v4, Landroid/app/Notification;->contentView:Landroid/widget/RemoteViews;

    .line 51
    .line 52
    invoke-virtual {v5, v6}, Landroid/app/Notification$Builder;->setContent(Landroid/widget/RemoteViews;)Landroid/app/Notification$Builder;

    .line 53
    .line 54
    .line 55
    move-result-object v5

    .line 56
    iget-object v6, v4, Landroid/app/Notification;->tickerText:Ljava/lang/CharSequence;

    .line 57
    .line 58
    const/4 v7, 0x0

    .line 59
    invoke-virtual {v5, v6, v7}, Landroid/app/Notification$Builder;->setTicker(Ljava/lang/CharSequence;Landroid/widget/RemoteViews;)Landroid/app/Notification$Builder;

    .line 60
    .line 61
    .line 62
    move-result-object v5

    .line 63
    iget-object v6, v4, Landroid/app/Notification;->vibrate:[J

    .line 64
    .line 65
    invoke-virtual {v5, v6}, Landroid/app/Notification$Builder;->setVibrate([J)Landroid/app/Notification$Builder;

    .line 66
    .line 67
    .line 68
    move-result-object v5

    .line 69
    iget v6, v4, Landroid/app/Notification;->ledARGB:I

    .line 70
    .line 71
    iget v8, v4, Landroid/app/Notification;->ledOnMS:I

    .line 72
    .line 73
    iget v9, v4, Landroid/app/Notification;->ledOffMS:I

    .line 74
    .line 75
    invoke-virtual {v5, v6, v8, v9}, Landroid/app/Notification$Builder;->setLights(III)Landroid/app/Notification$Builder;

    .line 76
    .line 77
    .line 78
    move-result-object v5

    .line 79
    iget v6, v4, Landroid/app/Notification;->flags:I

    .line 80
    .line 81
    and-int/lit8 v6, v6, 0x2

    .line 82
    .line 83
    const/4 v8, 0x1

    .line 84
    const/4 v9, 0x0

    .line 85
    if-eqz v6, :cond_0

    .line 86
    .line 87
    move v6, v8

    .line 88
    goto :goto_0

    .line 89
    :cond_0
    move v6, v9

    .line 90
    :goto_0
    invoke-virtual {v5, v6}, Landroid/app/Notification$Builder;->setOngoing(Z)Landroid/app/Notification$Builder;

    .line 91
    .line 92
    .line 93
    move-result-object v5

    .line 94
    iget v6, v4, Landroid/app/Notification;->flags:I

    .line 95
    .line 96
    and-int/lit8 v6, v6, 0x8

    .line 97
    .line 98
    if-eqz v6, :cond_1

    .line 99
    .line 100
    move v6, v8

    .line 101
    goto :goto_1

    .line 102
    :cond_1
    move v6, v9

    .line 103
    :goto_1
    invoke-virtual {v5, v6}, Landroid/app/Notification$Builder;->setOnlyAlertOnce(Z)Landroid/app/Notification$Builder;

    .line 104
    .line 105
    .line 106
    move-result-object v5

    .line 107
    iget v6, v4, Landroid/app/Notification;->flags:I

    .line 108
    .line 109
    and-int/lit8 v6, v6, 0x10

    .line 110
    .line 111
    if-eqz v6, :cond_2

    .line 112
    .line 113
    move v6, v8

    .line 114
    goto :goto_2

    .line 115
    :cond_2
    move v6, v9

    .line 116
    :goto_2
    invoke-virtual {v5, v6}, Landroid/app/Notification$Builder;->setAutoCancel(Z)Landroid/app/Notification$Builder;

    .line 117
    .line 118
    .line 119
    move-result-object v5

    .line 120
    iget v6, v4, Landroid/app/Notification;->defaults:I

    .line 121
    .line 122
    invoke-virtual {v5, v6}, Landroid/app/Notification$Builder;->setDefaults(I)Landroid/app/Notification$Builder;

    .line 123
    .line 124
    .line 125
    move-result-object v5

    .line 126
    iget-object v6, v0, Lxh0;->e:Ljava/lang/CharSequence;

    .line 127
    .line 128
    invoke-virtual {v5, v6}, Landroid/app/Notification$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    .line 129
    .line 130
    .line 131
    move-result-object v5

    .line 132
    iget-object v6, v0, Lxh0;->f:Ljava/lang/CharSequence;

    .line 133
    .line 134
    invoke-virtual {v5, v6}, Landroid/app/Notification$Builder;->setContentText(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    .line 135
    .line 136
    .line 137
    move-result-object v5

    .line 138
    invoke-virtual {v5, v7}, Landroid/app/Notification$Builder;->setContentInfo(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    .line 139
    .line 140
    .line 141
    move-result-object v5

    .line 142
    iget-object v6, v0, Lxh0;->g:Landroid/app/PendingIntent;

    .line 143
    .line 144
    invoke-virtual {v5, v6}, Landroid/app/Notification$Builder;->setContentIntent(Landroid/app/PendingIntent;)Landroid/app/Notification$Builder;

    .line 145
    .line 146
    .line 147
    move-result-object v5

    .line 148
    iget-object v6, v4, Landroid/app/Notification;->deleteIntent:Landroid/app/PendingIntent;

    .line 149
    .line 150
    invoke-virtual {v5, v6}, Landroid/app/Notification$Builder;->setDeleteIntent(Landroid/app/PendingIntent;)Landroid/app/Notification$Builder;

    .line 151
    .line 152
    .line 153
    move-result-object v5

    .line 154
    iget v6, v4, Landroid/app/Notification;->flags:I

    .line 155
    .line 156
    and-int/lit16 v6, v6, 0x80

    .line 157
    .line 158
    if-eqz v6, :cond_3

    .line 159
    .line 160
    goto :goto_3

    .line 161
    :cond_3
    move v8, v9

    .line 162
    :goto_3
    invoke-virtual {v5, v7, v8}, Landroid/app/Notification$Builder;->setFullScreenIntent(Landroid/app/PendingIntent;Z)Landroid/app/Notification$Builder;

    .line 163
    .line 164
    .line 165
    move-result-object v5

    .line 166
    invoke-virtual {v5, v9}, Landroid/app/Notification$Builder;->setNumber(I)Landroid/app/Notification$Builder;

    .line 167
    .line 168
    .line 169
    move-result-object v5

    .line 170
    invoke-virtual {v5, v9, v9, v9}, Landroid/app/Notification$Builder;->setProgress(IIZ)Landroid/app/Notification$Builder;

    .line 171
    .line 172
    .line 173
    iget-object v5, v0, Lxh0;->h:Landroidx/core/graphics/drawable/IconCompat;

    .line 174
    .line 175
    if-nez v5, :cond_4

    .line 176
    .line 177
    move-object v2, v7

    .line 178
    goto :goto_4

    .line 179
    :cond_4
    invoke-static {v5, v2}, Lb20;->c(Landroidx/core/graphics/drawable/IconCompat;Landroid/content/Context;)Landroid/graphics/drawable/Icon;

    .line 180
    .line 181
    .line 182
    move-result-object v2

    .line 183
    :goto_4
    invoke-static {v3, v2}, Lai0;->b(Landroid/app/Notification$Builder;Landroid/graphics/drawable/Icon;)Landroid/app/Notification$Builder;

    .line 184
    .line 185
    .line 186
    invoke-virtual {v3, v7}, Landroid/app/Notification$Builder;->setSubText(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    .line 187
    .line 188
    .line 189
    move-result-object v2

    .line 190
    invoke-virtual {v2, v9}, Landroid/app/Notification$Builder;->setUsesChronometer(Z)Landroid/app/Notification$Builder;

    .line 191
    .line 192
    .line 193
    move-result-object v2

    .line 194
    iget v3, v0, Lxh0;->i:I

    .line 195
    .line 196
    invoke-virtual {v2, v3}, Landroid/app/Notification$Builder;->setPriority(I)Landroid/app/Notification$Builder;

    .line 197
    .line 198
    .line 199
    iget-object v2, v0, Lxh0;->b:Ljava/util/ArrayList;

    .line 200
    .line 201
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 202
    .line 203
    .line 204
    move-result v3

    .line 205
    move v5, v9

    .line 206
    :goto_5
    const/16 v6, 0x1d

    .line 207
    .line 208
    const-string v8, "android.support.allowGeneratedReplies"

    .line 209
    .line 210
    const/16 v10, 0x1c

    .line 211
    .line 212
    if-ge v5, v3, :cond_b

    .line 213
    .line 214
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object v11

    .line 218
    add-int/lit8 v5, v5, 0x1

    .line 219
    .line 220
    check-cast v11, Lsh0;

    .line 221
    .line 222
    iget-object v12, v11, Lsh0;->b:Landroidx/core/graphics/drawable/IconCompat;

    .line 223
    .line 224
    if-nez v12, :cond_5

    .line 225
    .line 226
    iget v12, v11, Lsh0;->e:I

    .line 227
    .line 228
    if-eqz v12, :cond_5

    .line 229
    .line 230
    invoke-static {v12}, Landroidx/core/graphics/drawable/IconCompat;->a(I)Landroidx/core/graphics/drawable/IconCompat;

    .line 231
    .line 232
    .line 233
    move-result-object v12

    .line 234
    iput-object v12, v11, Lsh0;->b:Landroidx/core/graphics/drawable/IconCompat;

    .line 235
    .line 236
    :cond_5
    iget-object v12, v11, Lsh0;->b:Landroidx/core/graphics/drawable/IconCompat;

    .line 237
    .line 238
    iget-boolean v13, v11, Lsh0;->c:Z

    .line 239
    .line 240
    iget-object v14, v11, Lsh0;->a:Landroid/os/Bundle;

    .line 241
    .line 242
    if-eqz v12, :cond_6

    .line 243
    .line 244
    invoke-static {v12, v7}, Lb20;->c(Landroidx/core/graphics/drawable/IconCompat;Landroid/content/Context;)Landroid/graphics/drawable/Icon;

    .line 245
    .line 246
    .line 247
    move-result-object v12

    .line 248
    goto :goto_6

    .line 249
    :cond_6
    move-object v12, v7

    .line 250
    :goto_6
    iget-object v15, v11, Lsh0;->f:Ljava/lang/CharSequence;

    .line 251
    .line 252
    iget-object v7, v11, Lsh0;->g:Landroid/app/PendingIntent;

    .line 253
    .line 254
    invoke-static {v12, v15, v7}, Lai0;->a(Landroid/graphics/drawable/Icon;Ljava/lang/CharSequence;Landroid/app/PendingIntent;)Landroid/app/Notification$Action$Builder;

    .line 255
    .line 256
    .line 257
    move-result-object v7

    .line 258
    if-eqz v14, :cond_7

    .line 259
    .line 260
    new-instance v12, Landroid/os/Bundle;

    .line 261
    .line 262
    invoke-direct {v12, v14}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    .line 263
    .line 264
    .line 265
    goto :goto_7

    .line 266
    :cond_7
    new-instance v12, Landroid/os/Bundle;

    .line 267
    .line 268
    invoke-direct {v12}, Landroid/os/Bundle;-><init>()V

    .line 269
    .line 270
    .line 271
    :goto_7
    invoke-virtual {v12, v8, v13}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 272
    .line 273
    .line 274
    sget v8, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 275
    .line 276
    invoke-static {v7, v13}, Lbi0;->a(Landroid/app/Notification$Action$Builder;Z)Landroid/app/Notification$Action$Builder;

    .line 277
    .line 278
    .line 279
    const-string v13, "android.support.action.semanticAction"

    .line 280
    .line 281
    invoke-virtual {v12, v13, v9}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 282
    .line 283
    .line 284
    if-lt v8, v10, :cond_8

    .line 285
    .line 286
    invoke-static {v7, v9}, Ldi0;->b(Landroid/app/Notification$Action$Builder;I)Landroid/app/Notification$Action$Builder;

    .line 287
    .line 288
    .line 289
    :cond_8
    if-lt v8, v6, :cond_9

    .line 290
    .line 291
    invoke-static {v7, v9}, Lei0;->c(Landroid/app/Notification$Action$Builder;Z)Landroid/app/Notification$Action$Builder;

    .line 292
    .line 293
    .line 294
    :cond_9
    const/16 v6, 0x1f

    .line 295
    .line 296
    if-lt v8, v6, :cond_a

    .line 297
    .line 298
    invoke-static {v7, v9}, Lfi0;->a(Landroid/app/Notification$Action$Builder;Z)Landroid/app/Notification$Action$Builder;

    .line 299
    .line 300
    .line 301
    :cond_a
    const-string v6, "android.support.action.showsUserInterface"

    .line 302
    .line 303
    iget-boolean v8, v11, Lsh0;->d:Z

    .line 304
    .line 305
    invoke-virtual {v12, v6, v8}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 306
    .line 307
    .line 308
    invoke-static {v7, v12}, Lyh0;->b(Landroid/app/Notification$Action$Builder;Landroid/os/Bundle;)Landroid/app/Notification$Action$Builder;

    .line 309
    .line 310
    .line 311
    iget-object v6, v1, Lp21;->g:Ljava/lang/Object;

    .line 312
    .line 313
    check-cast v6, Landroid/app/Notification$Builder;

    .line 314
    .line 315
    invoke-static {v7}, Lyh0;->d(Landroid/app/Notification$Action$Builder;)Landroid/app/Notification$Action;

    .line 316
    .line 317
    .line 318
    move-result-object v7

    .line 319
    invoke-static {v6, v7}, Lyh0;->a(Landroid/app/Notification$Builder;Landroid/app/Notification$Action;)Landroid/app/Notification$Builder;

    .line 320
    .line 321
    .line 322
    const/4 v7, 0x0

    .line 323
    goto :goto_5

    .line 324
    :cond_b
    iget-object v2, v0, Lxh0;->m:Landroid/os/Bundle;

    .line 325
    .line 326
    if-eqz v2, :cond_c

    .line 327
    .line 328
    iget-object v3, v1, Lp21;->i:Ljava/lang/Object;

    .line 329
    .line 330
    check-cast v3, Landroid/os/Bundle;

    .line 331
    .line 332
    invoke-virtual {v3, v2}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    .line 333
    .line 334
    .line 335
    :cond_c
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 336
    .line 337
    iget-object v3, v1, Lp21;->g:Ljava/lang/Object;

    .line 338
    .line 339
    check-cast v3, Landroid/app/Notification$Builder;

    .line 340
    .line 341
    iget-boolean v5, v0, Lxh0;->j:Z

    .line 342
    .line 343
    invoke-virtual {v3, v5}, Landroid/app/Notification$Builder;->setShowWhen(Z)Landroid/app/Notification$Builder;

    .line 344
    .line 345
    .line 346
    iget-object v3, v1, Lp21;->g:Ljava/lang/Object;

    .line 347
    .line 348
    check-cast v3, Landroid/app/Notification$Builder;

    .line 349
    .line 350
    iget-boolean v5, v0, Lxh0;->l:Z

    .line 351
    .line 352
    invoke-static {v3, v5}, Lyh0;->i(Landroid/app/Notification$Builder;Z)Landroid/app/Notification$Builder;

    .line 353
    .line 354
    .line 355
    iget-object v3, v1, Lp21;->g:Ljava/lang/Object;

    .line 356
    .line 357
    check-cast v3, Landroid/app/Notification$Builder;

    .line 358
    .line 359
    const/4 v5, 0x0

    .line 360
    invoke-static {v3, v5}, Lyh0;->g(Landroid/app/Notification$Builder;Ljava/lang/String;)Landroid/app/Notification$Builder;

    .line 361
    .line 362
    .line 363
    iget-object v3, v1, Lp21;->g:Ljava/lang/Object;

    .line 364
    .line 365
    check-cast v3, Landroid/app/Notification$Builder;

    .line 366
    .line 367
    invoke-static {v3, v5}, Lyh0;->j(Landroid/app/Notification$Builder;Ljava/lang/String;)Landroid/app/Notification$Builder;

    .line 368
    .line 369
    .line 370
    iget-object v3, v1, Lp21;->g:Ljava/lang/Object;

    .line 371
    .line 372
    check-cast v3, Landroid/app/Notification$Builder;

    .line 373
    .line 374
    invoke-static {v3, v9}, Lyh0;->h(Landroid/app/Notification$Builder;Z)Landroid/app/Notification$Builder;

    .line 375
    .line 376
    .line 377
    iget-object v3, v1, Lp21;->g:Ljava/lang/Object;

    .line 378
    .line 379
    check-cast v3, Landroid/app/Notification$Builder;

    .line 380
    .line 381
    invoke-static {v3, v5}, Lzh0;->b(Landroid/app/Notification$Builder;Ljava/lang/String;)Landroid/app/Notification$Builder;

    .line 382
    .line 383
    .line 384
    iget-object v3, v1, Lp21;->g:Ljava/lang/Object;

    .line 385
    .line 386
    check-cast v3, Landroid/app/Notification$Builder;

    .line 387
    .line 388
    invoke-static {v3, v9}, Lzh0;->c(Landroid/app/Notification$Builder;I)Landroid/app/Notification$Builder;

    .line 389
    .line 390
    .line 391
    iget-object v3, v1, Lp21;->g:Ljava/lang/Object;

    .line 392
    .line 393
    check-cast v3, Landroid/app/Notification$Builder;

    .line 394
    .line 395
    invoke-static {v3, v9}, Lzh0;->f(Landroid/app/Notification$Builder;I)Landroid/app/Notification$Builder;

    .line 396
    .line 397
    .line 398
    iget-object v3, v1, Lp21;->g:Ljava/lang/Object;

    .line 399
    .line 400
    check-cast v3, Landroid/app/Notification$Builder;

    .line 401
    .line 402
    invoke-static {v3, v5}, Lzh0;->d(Landroid/app/Notification$Builder;Landroid/app/Notification;)Landroid/app/Notification$Builder;

    .line 403
    .line 404
    .line 405
    iget-object v3, v1, Lp21;->g:Ljava/lang/Object;

    .line 406
    .line 407
    check-cast v3, Landroid/app/Notification$Builder;

    .line 408
    .line 409
    iget-object v5, v4, Landroid/app/Notification;->sound:Landroid/net/Uri;

    .line 410
    .line 411
    iget-object v4, v4, Landroid/app/Notification;->audioAttributes:Landroid/media/AudioAttributes;

    .line 412
    .line 413
    invoke-static {v3, v5, v4}, Lzh0;->e(Landroid/app/Notification$Builder;Landroid/net/Uri;Ljava/lang/Object;)Landroid/app/Notification$Builder;

    .line 414
    .line 415
    .line 416
    iget-object v3, v0, Lxh0;->q:Ljava/util/ArrayList;

    .line 417
    .line 418
    iget-object v4, v0, Lxh0;->c:Ljava/util/ArrayList;

    .line 419
    .line 420
    if-ge v2, v10, :cond_11

    .line 421
    .line 422
    if-nez v4, :cond_d

    .line 423
    .line 424
    const/4 v2, 0x0

    .line 425
    goto :goto_8

    .line 426
    :cond_d
    new-instance v2, Ljava/util/ArrayList;

    .line 427
    .line 428
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 429
    .line 430
    .line 431
    move-result v5

    .line 432
    invoke-direct {v2, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 433
    .line 434
    .line 435
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 436
    .line 437
    .line 438
    move-result-object v5

    .line 439
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 440
    .line 441
    .line 442
    move-result v7

    .line 443
    if-nez v7, :cond_10

    .line 444
    .line 445
    :goto_8
    if-nez v2, :cond_e

    .line 446
    .line 447
    goto :goto_9

    .line 448
    :cond_e
    if-nez v3, :cond_f

    .line 449
    .line 450
    move-object v3, v2

    .line 451
    goto :goto_9

    .line 452
    :cond_f
    new-instance v5, Lu8;

    .line 453
    .line 454
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 455
    .line 456
    .line 457
    move-result v7

    .line 458
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 459
    .line 460
    .line 461
    move-result v11

    .line 462
    add-int/2addr v11, v7

    .line 463
    invoke-direct {v5, v11}, Lu8;-><init>(I)V

    .line 464
    .line 465
    .line 466
    invoke-virtual {v5, v2}, Lu8;->addAll(Ljava/util/Collection;)Z

    .line 467
    .line 468
    .line 469
    invoke-virtual {v5, v3}, Lu8;->addAll(Ljava/util/Collection;)Z

    .line 470
    .line 471
    .line 472
    new-instance v3, Ljava/util/ArrayList;

    .line 473
    .line 474
    invoke-direct {v3, v5}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 475
    .line 476
    .line 477
    goto :goto_9

    .line 478
    :cond_10
    invoke-static {v5}, Lex0;->e(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    .line 479
    .line 480
    .line 481
    move-result-object v1

    .line 482
    throw v1

    .line 483
    :cond_11
    :goto_9
    if-eqz v3, :cond_12

    .line 484
    .line 485
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 486
    .line 487
    .line 488
    move-result v2

    .line 489
    if-nez v2, :cond_12

    .line 490
    .line 491
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 492
    .line 493
    .line 494
    move-result v2

    .line 495
    move v5, v9

    .line 496
    :goto_a
    if-ge v5, v2, :cond_12

    .line 497
    .line 498
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 499
    .line 500
    .line 501
    move-result-object v7

    .line 502
    add-int/lit8 v5, v5, 0x1

    .line 503
    .line 504
    check-cast v7, Ljava/lang/String;

    .line 505
    .line 506
    iget-object v11, v1, Lp21;->g:Ljava/lang/Object;

    .line 507
    .line 508
    check-cast v11, Landroid/app/Notification$Builder;

    .line 509
    .line 510
    invoke-static {v11, v7}, Lzh0;->a(Landroid/app/Notification$Builder;Ljava/lang/String;)Landroid/app/Notification$Builder;

    .line 511
    .line 512
    .line 513
    goto :goto_a

    .line 514
    :cond_12
    iget-object v2, v0, Lxh0;->d:Ljava/util/ArrayList;

    .line 515
    .line 516
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 517
    .line 518
    .line 519
    move-result v3

    .line 520
    if-lez v3, :cond_1a

    .line 521
    .line 522
    iget-object v3, v0, Lxh0;->m:Landroid/os/Bundle;

    .line 523
    .line 524
    if-nez v3, :cond_13

    .line 525
    .line 526
    new-instance v3, Landroid/os/Bundle;

    .line 527
    .line 528
    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 529
    .line 530
    .line 531
    iput-object v3, v0, Lxh0;->m:Landroid/os/Bundle;

    .line 532
    .line 533
    :cond_13
    iget-object v3, v0, Lxh0;->m:Landroid/os/Bundle;

    .line 534
    .line 535
    const-string v5, "android.car.EXTENSIONS"

    .line 536
    .line 537
    invoke-virtual {v3, v5}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 538
    .line 539
    .line 540
    move-result-object v3

    .line 541
    if-nez v3, :cond_14

    .line 542
    .line 543
    new-instance v3, Landroid/os/Bundle;

    .line 544
    .line 545
    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 546
    .line 547
    .line 548
    :cond_14
    new-instance v7, Landroid/os/Bundle;

    .line 549
    .line 550
    invoke-direct {v7, v3}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    .line 551
    .line 552
    .line 553
    new-instance v11, Landroid/os/Bundle;

    .line 554
    .line 555
    invoke-direct {v11}, Landroid/os/Bundle;-><init>()V

    .line 556
    .line 557
    .line 558
    move v12, v9

    .line 559
    :goto_b
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 560
    .line 561
    .line 562
    move-result v13

    .line 563
    if-ge v12, v13, :cond_18

    .line 564
    .line 565
    invoke-static {v12}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 566
    .line 567
    .line 568
    move-result-object v13

    .line 569
    invoke-virtual {v2, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 570
    .line 571
    .line 572
    move-result-object v14

    .line 573
    check-cast v14, Lsh0;

    .line 574
    .line 575
    new-instance v15, Landroid/os/Bundle;

    .line 576
    .line 577
    invoke-direct {v15}, Landroid/os/Bundle;-><init>()V

    .line 578
    .line 579
    .line 580
    iget-object v6, v14, Lsh0;->b:Landroidx/core/graphics/drawable/IconCompat;

    .line 581
    .line 582
    if-nez v6, :cond_15

    .line 583
    .line 584
    iget v6, v14, Lsh0;->e:I

    .line 585
    .line 586
    if-eqz v6, :cond_15

    .line 587
    .line 588
    invoke-static {v6}, Landroidx/core/graphics/drawable/IconCompat;->a(I)Landroidx/core/graphics/drawable/IconCompat;

    .line 589
    .line 590
    .line 591
    move-result-object v6

    .line 592
    iput-object v6, v14, Lsh0;->b:Landroidx/core/graphics/drawable/IconCompat;

    .line 593
    .line 594
    :cond_15
    iget-object v6, v14, Lsh0;->b:Landroidx/core/graphics/drawable/IconCompat;

    .line 595
    .line 596
    iget-object v10, v14, Lsh0;->a:Landroid/os/Bundle;

    .line 597
    .line 598
    if-eqz v6, :cond_16

    .line 599
    .line 600
    invoke-virtual {v6}, Landroidx/core/graphics/drawable/IconCompat;->b()I

    .line 601
    .line 602
    .line 603
    move-result v6

    .line 604
    goto :goto_c

    .line 605
    :cond_16
    move v6, v9

    .line 606
    :goto_c
    const-string v9, "icon"

    .line 607
    .line 608
    invoke-virtual {v15, v9, v6}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 609
    .line 610
    .line 611
    const-string v6, "title"

    .line 612
    .line 613
    iget-object v9, v14, Lsh0;->f:Ljava/lang/CharSequence;

    .line 614
    .line 615
    invoke-virtual {v15, v6, v9}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    .line 616
    .line 617
    .line 618
    const-string v6, "actionIntent"

    .line 619
    .line 620
    iget-object v9, v14, Lsh0;->g:Landroid/app/PendingIntent;

    .line 621
    .line 622
    invoke-virtual {v15, v6, v9}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 623
    .line 624
    .line 625
    if-eqz v10, :cond_17

    .line 626
    .line 627
    new-instance v6, Landroid/os/Bundle;

    .line 628
    .line 629
    invoke-direct {v6, v10}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    .line 630
    .line 631
    .line 632
    goto :goto_d

    .line 633
    :cond_17
    new-instance v6, Landroid/os/Bundle;

    .line 634
    .line 635
    invoke-direct {v6}, Landroid/os/Bundle;-><init>()V

    .line 636
    .line 637
    .line 638
    :goto_d
    iget-boolean v9, v14, Lsh0;->c:Z

    .line 639
    .line 640
    invoke-virtual {v6, v8, v9}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 641
    .line 642
    .line 643
    const-string v9, "extras"

    .line 644
    .line 645
    invoke-virtual {v15, v9, v6}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 646
    .line 647
    .line 648
    const-string v6, "remoteInputs"

    .line 649
    .line 650
    const/4 v9, 0x0

    .line 651
    invoke-virtual {v15, v6, v9}, Landroid/os/Bundle;->putParcelableArray(Ljava/lang/String;[Landroid/os/Parcelable;)V

    .line 652
    .line 653
    .line 654
    const-string v6, "showsUserInterface"

    .line 655
    .line 656
    iget-boolean v9, v14, Lsh0;->d:Z

    .line 657
    .line 658
    invoke-virtual {v15, v6, v9}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 659
    .line 660
    .line 661
    const-string v6, "semanticAction"

    .line 662
    .line 663
    const/4 v9, 0x0

    .line 664
    invoke-virtual {v15, v6, v9}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 665
    .line 666
    .line 667
    invoke-virtual {v11, v13, v15}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 668
    .line 669
    .line 670
    add-int/lit8 v12, v12, 0x1

    .line 671
    .line 672
    const/16 v6, 0x1d

    .line 673
    .line 674
    const/4 v9, 0x0

    .line 675
    const/16 v10, 0x1c

    .line 676
    .line 677
    goto :goto_b

    .line 678
    :cond_18
    const-string v2, "invisible_actions"

    .line 679
    .line 680
    invoke-virtual {v3, v2, v11}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 681
    .line 682
    .line 683
    invoke-virtual {v7, v2, v11}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 684
    .line 685
    .line 686
    iget-object v2, v0, Lxh0;->m:Landroid/os/Bundle;

    .line 687
    .line 688
    if-nez v2, :cond_19

    .line 689
    .line 690
    new-instance v2, Landroid/os/Bundle;

    .line 691
    .line 692
    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 693
    .line 694
    .line 695
    iput-object v2, v0, Lxh0;->m:Landroid/os/Bundle;

    .line 696
    .line 697
    :cond_19
    iget-object v2, v0, Lxh0;->m:Landroid/os/Bundle;

    .line 698
    .line 699
    invoke-virtual {v2, v5, v3}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 700
    .line 701
    .line 702
    iget-object v2, v1, Lp21;->i:Ljava/lang/Object;

    .line 703
    .line 704
    check-cast v2, Landroid/os/Bundle;

    .line 705
    .line 706
    invoke-virtual {v2, v5, v7}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 707
    .line 708
    .line 709
    :cond_1a
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 710
    .line 711
    iget-object v3, v1, Lp21;->g:Ljava/lang/Object;

    .line 712
    .line 713
    check-cast v3, Landroid/app/Notification$Builder;

    .line 714
    .line 715
    iget-object v5, v0, Lxh0;->m:Landroid/os/Bundle;

    .line 716
    .line 717
    invoke-virtual {v3, v5}, Landroid/app/Notification$Builder;->setExtras(Landroid/os/Bundle;)Landroid/app/Notification$Builder;

    .line 718
    .line 719
    .line 720
    iget-object v3, v1, Lp21;->g:Ljava/lang/Object;

    .line 721
    .line 722
    check-cast v3, Landroid/app/Notification$Builder;

    .line 723
    .line 724
    const/4 v5, 0x0

    .line 725
    invoke-static {v3, v5}, Lbi0;->e(Landroid/app/Notification$Builder;[Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    .line 726
    .line 727
    .line 728
    iget-object v3, v1, Lp21;->g:Ljava/lang/Object;

    .line 729
    .line 730
    check-cast v3, Landroid/app/Notification$Builder;

    .line 731
    .line 732
    const/4 v9, 0x0

    .line 733
    invoke-static {v3, v9}, Lci0;->b(Landroid/app/Notification$Builder;I)Landroid/app/Notification$Builder;

    .line 734
    .line 735
    .line 736
    iget-object v3, v1, Lp21;->g:Ljava/lang/Object;

    .line 737
    .line 738
    check-cast v3, Landroid/app/Notification$Builder;

    .line 739
    .line 740
    invoke-static {v3, v5}, Lci0;->e(Landroid/app/Notification$Builder;Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    .line 741
    .line 742
    .line 743
    iget-object v3, v1, Lp21;->g:Ljava/lang/Object;

    .line 744
    .line 745
    check-cast v3, Landroid/app/Notification$Builder;

    .line 746
    .line 747
    invoke-static {v3, v5}, Lci0;->f(Landroid/app/Notification$Builder;Ljava/lang/String;)Landroid/app/Notification$Builder;

    .line 748
    .line 749
    .line 750
    iget-object v3, v1, Lp21;->g:Ljava/lang/Object;

    .line 751
    .line 752
    check-cast v3, Landroid/app/Notification$Builder;

    .line 753
    .line 754
    const-wide/16 v5, 0x0

    .line 755
    .line 756
    invoke-static {v3, v5, v6}, Lci0;->g(Landroid/app/Notification$Builder;J)Landroid/app/Notification$Builder;

    .line 757
    .line 758
    .line 759
    iget-object v3, v1, Lp21;->g:Ljava/lang/Object;

    .line 760
    .line 761
    check-cast v3, Landroid/app/Notification$Builder;

    .line 762
    .line 763
    const/4 v9, 0x0

    .line 764
    invoke-static {v3, v9}, Lci0;->d(Landroid/app/Notification$Builder;I)Landroid/app/Notification$Builder;

    .line 765
    .line 766
    .line 767
    iget-object v3, v0, Lxh0;->n:Ljava/lang/String;

    .line 768
    .line 769
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 770
    .line 771
    .line 772
    move-result v3

    .line 773
    if-nez v3, :cond_1b

    .line 774
    .line 775
    iget-object v3, v1, Lp21;->g:Ljava/lang/Object;

    .line 776
    .line 777
    check-cast v3, Landroid/app/Notification$Builder;

    .line 778
    .line 779
    const/4 v5, 0x0

    .line 780
    invoke-virtual {v3, v5}, Landroid/app/Notification$Builder;->setSound(Landroid/net/Uri;)Landroid/app/Notification$Builder;

    .line 781
    .line 782
    .line 783
    move-result-object v3

    .line 784
    invoke-virtual {v3, v9}, Landroid/app/Notification$Builder;->setDefaults(I)Landroid/app/Notification$Builder;

    .line 785
    .line 786
    .line 787
    move-result-object v3

    .line 788
    invoke-virtual {v3, v9, v9, v9}, Landroid/app/Notification$Builder;->setLights(III)Landroid/app/Notification$Builder;

    .line 789
    .line 790
    .line 791
    move-result-object v3

    .line 792
    invoke-virtual {v3, v5}, Landroid/app/Notification$Builder;->setVibrate([J)Landroid/app/Notification$Builder;

    .line 793
    .line 794
    .line 795
    :cond_1b
    const/16 v3, 0x1c

    .line 796
    .line 797
    if-lt v2, v3, :cond_1c

    .line 798
    .line 799
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 800
    .line 801
    .line 802
    move-result-object v3

    .line 803
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 804
    .line 805
    .line 806
    move-result v4

    .line 807
    if-nez v4, :cond_1d

    .line 808
    .line 809
    :cond_1c
    const/16 v3, 0x1d

    .line 810
    .line 811
    goto :goto_e

    .line 812
    :cond_1d
    invoke-static {v3}, Lex0;->e(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    .line 813
    .line 814
    .line 815
    move-result-object v1

    .line 816
    throw v1

    .line 817
    :goto_e
    if-lt v2, v3, :cond_1e

    .line 818
    .line 819
    iget-object v2, v1, Lp21;->g:Ljava/lang/Object;

    .line 820
    .line 821
    check-cast v2, Landroid/app/Notification$Builder;

    .line 822
    .line 823
    iget-boolean v3, v0, Lxh0;->o:Z

    .line 824
    .line 825
    invoke-static {v2, v3}, Lei0;->a(Landroid/app/Notification$Builder;Z)Landroid/app/Notification$Builder;

    .line 826
    .line 827
    .line 828
    iget-object v2, v1, Lp21;->g:Ljava/lang/Object;

    .line 829
    .line 830
    check-cast v2, Landroid/app/Notification$Builder;

    .line 831
    .line 832
    const/4 v5, 0x0

    .line 833
    invoke-static {v2, v5}, Lei0;->b(Landroid/app/Notification$Builder;Landroid/app/Notification$BubbleMetadata;)Landroid/app/Notification$Builder;

    .line 834
    .line 835
    .line 836
    :cond_1e
    iget-object v2, v1, Lp21;->h:Ljava/lang/Object;

    .line 837
    .line 838
    check-cast v2, Lxh0;

    .line 839
    .line 840
    iget-object v3, v2, Lxh0;->k:Lf74;

    .line 841
    .line 842
    if-eqz v3, :cond_1f

    .line 843
    .line 844
    invoke-virtual {v3, v1}, Lf74;->j1(Lp21;)V

    .line 845
    .line 846
    .line 847
    :cond_1f
    iget-object v1, v1, Lp21;->g:Ljava/lang/Object;

    .line 848
    .line 849
    check-cast v1, Landroid/app/Notification$Builder;

    .line 850
    .line 851
    invoke-virtual {v1}, Landroid/app/Notification$Builder;->build()Landroid/app/Notification;

    .line 852
    .line 853
    .line 854
    move-result-object v1

    .line 855
    if-eqz v3, :cond_20

    .line 856
    .line 857
    iget-object v2, v2, Lxh0;->k:Lf74;

    .line 858
    .line 859
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 860
    .line 861
    .line 862
    :cond_20
    if-eqz v3, :cond_21

    .line 863
    .line 864
    iget-object v2, v1, Landroid/app/Notification;->extras:Landroid/os/Bundle;

    .line 865
    .line 866
    if-eqz v2, :cond_21

    .line 867
    .line 868
    invoke-virtual {v3}, Lf74;->k1()Ljava/lang/String;

    .line 869
    .line 870
    .line 871
    move-result-object v3

    .line 872
    const-string v4, "androidx.core.app.extra.COMPAT_TEMPLATE"

    .line 873
    .line 874
    invoke-virtual {v2, v4, v3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 875
    .line 876
    .line 877
    :cond_21
    return-object v1
.end method

.method public final c(Landroid/graphics/Bitmap;)V
    .locals 7

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1b

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-lt v0, v1, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    iget-object v0, p0, Lxh0;->a:Landroid/content/Context;

    .line 10
    .line 11
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const v1, 0x7f070068

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    const v3, 0x7f070067

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    if-gt v3, v1, :cond_1

    .line 34
    .line 35
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    if-gt v3, v0, :cond_1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    int-to-double v3, v1

    .line 43
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    invoke-static {v2, v1}, Ljava/lang/Math;->max(II)I

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    int-to-double v5, v1

    .line 52
    div-double/2addr v3, v5

    .line 53
    int-to-double v0, v0

    .line 54
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    .line 55
    .line 56
    .line 57
    move-result v5

    .line 58
    invoke-static {v2, v5}, Ljava/lang/Math;->max(II)I

    .line 59
    .line 60
    .line 61
    move-result v5

    .line 62
    int-to-double v5, v5

    .line 63
    div-double/2addr v0, v5

    .line 64
    invoke-static {v3, v4, v0, v1}, Ljava/lang/Math;->min(DD)D

    .line 65
    .line 66
    .line 67
    move-result-wide v0

    .line 68
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    .line 69
    .line 70
    .line 71
    move-result v3

    .line 72
    int-to-double v3, v3

    .line 73
    mul-double/2addr v3, v0

    .line 74
    invoke-static {v3, v4}, Ljava/lang/Math;->ceil(D)D

    .line 75
    .line 76
    .line 77
    move-result-wide v3

    .line 78
    double-to-int v3, v3

    .line 79
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    .line 80
    .line 81
    .line 82
    move-result v4

    .line 83
    int-to-double v4, v4

    .line 84
    mul-double/2addr v4, v0

    .line 85
    invoke-static {v4, v5}, Ljava/lang/Math;->ceil(D)D

    .line 86
    .line 87
    .line 88
    move-result-wide v0

    .line 89
    double-to-int v0, v0

    .line 90
    invoke-static {p1, v3, v0, v2}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    :goto_0
    sget-object v0, Landroidx/core/graphics/drawable/IconCompat;->k:Landroid/graphics/PorterDuff$Mode;

    .line 95
    .line 96
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    new-instance v0, Landroidx/core/graphics/drawable/IconCompat;

    .line 100
    .line 101
    invoke-direct {v0, v2}, Landroidx/core/graphics/drawable/IconCompat;-><init>(I)V

    .line 102
    .line 103
    .line 104
    iput-object p1, v0, Landroidx/core/graphics/drawable/IconCompat;->b:Ljava/lang/Object;

    .line 105
    .line 106
    iput-object v0, p0, Lxh0;->h:Landroidx/core/graphics/drawable/IconCompat;

    .line 107
    .line 108
    return-void
.end method

.method public final d(Lf74;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lxh0;->k:Lf74;

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iput-object p1, p0, Lxh0;->k:Lf74;

    .line 6
    .line 7
    iget-object v0, p1, Lf74;->g:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Lxh0;

    .line 10
    .line 11
    if-eq v0, p0, :cond_0

    .line 12
    .line 13
    iput-object p0, p1, Lf74;->g:Ljava/lang/Object;

    .line 14
    .line 15
    invoke-virtual {p0, p1}, Lxh0;->d(Lf74;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method
