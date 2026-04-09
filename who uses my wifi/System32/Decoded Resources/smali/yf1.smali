.class public final synthetic Lyf1;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic f:I

.field public final synthetic g:Lmq1;


# direct methods
.method public synthetic constructor <init>(Lmq1;I)V
    .locals 0

    .line 1
    iput p2, p0, Lyf1;->f:I

    .line 2
    .line 3
    iput-object p1, p0, Lyf1;->g:Lmq1;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 10

    .line 1
    iget v0, p0, Lyf1;->f:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lyf1;->g:Lmq1;

    .line 7
    .line 8
    const/4 v1, 0x4

    .line 9
    iput v1, v0, Lmq1;->g:I

    .line 10
    .line 11
    invoke-virtual {v0}, Lmq1;->b()V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :pswitch_0
    iget-object v0, p0, Lyf1;->g:Lmq1;

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    sget-object v1, Lhg4;->C:Lhg4;

    .line 21
    .line 22
    iget-object v1, v1, Lhg4;->o:Lus1;

    .line 23
    .line 24
    iget-object v0, v0, Lmq1;->a:Landroid/content/Context;

    .line 25
    .line 26
    invoke-virtual {v1, v0}, Lus1;->a(Landroid/content/Context;)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :pswitch_1
    iget-object v0, p0, Lyf1;->g:Lmq1;

    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    sget-object v1, Lhg4;->C:Lhg4;

    .line 36
    .line 37
    iget-object v1, v1, Lhg4;->o:Lus1;

    .line 38
    .line 39
    iget-object v0, v0, Lmq1;->a:Landroid/content/Context;

    .line 40
    .line 41
    invoke-virtual {v1, v0}, Lus1;->a(Landroid/content/Context;)V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :pswitch_2
    iget-object v0, p0, Lyf1;->g:Lmq1;

    .line 46
    .line 47
    iget-object v1, v0, Lmq1;->a:Landroid/content/Context;

    .line 48
    .line 49
    invoke-virtual {v0, v1}, Lmq1;->d(Landroid/content/Context;)V

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :pswitch_3
    iget-object v0, p0, Lyf1;->g:Lmq1;

    .line 54
    .line 55
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    sget-object v1, Lhg4;->C:Lhg4;

    .line 59
    .line 60
    iget-object v1, v1, Lhg4;->o:Lus1;

    .line 61
    .line 62
    iget-object v2, v0, Lmq1;->d:Ljava/lang/String;

    .line 63
    .line 64
    iget-object v3, v0, Lmq1;->e:Ljava/lang/String;

    .line 65
    .line 66
    iget-object v4, v0, Lmq1;->f:Ljava/lang/String;

    .line 67
    .line 68
    invoke-virtual {v1}, Lus1;->h()Z

    .line 69
    .line 70
    .line 71
    move-result v5

    .line 72
    iget-object v0, v0, Lmq1;->a:Landroid/content/Context;

    .line 73
    .line 74
    invoke-virtual {v1, v0, v2, v3}, Lus1;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Z

    .line 75
    .line 76
    .line 77
    move-result v6

    .line 78
    iget-object v7, v1, Lus1;->a:Ljava/lang/Object;

    .line 79
    .line 80
    monitor-enter v7

    .line 81
    :try_start_0
    iput-boolean v6, v1, Lus1;->d:Z

    .line 82
    .line 83
    monitor-exit v7
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 84
    invoke-virtual {v1}, Lus1;->h()Z

    .line 85
    .line 86
    .line 87
    move-result v6

    .line 88
    if-eqz v6, :cond_1

    .line 89
    .line 90
    if-nez v5, :cond_0

    .line 91
    .line 92
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 93
    .line 94
    .line 95
    move-result v5

    .line 96
    if-nez v5, :cond_0

    .line 97
    .line 98
    invoke-virtual {v1, v0, v3, v4, v2}, Lus1;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    :cond_0
    const-string v2, "Device is linked for debug signals."

    .line 102
    .line 103
    invoke-static {v2}, Lgi2;->U(Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    const-string v2, "The device is successfully linked for troubleshooting."

    .line 107
    .line 108
    const/4 v3, 0x0

    .line 109
    const/4 v4, 0x1

    .line 110
    invoke-virtual {v1, v0, v2, v3, v4}, Lus1;->i(Landroid/content/Context;Ljava/lang/String;ZZ)V

    .line 111
    .line 112
    .line 113
    goto :goto_0

    .line 114
    :cond_1
    invoke-virtual {v1, v0, v2, v3}, Lus1;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    :goto_0
    return-void

    .line 118
    :catchall_0
    move-exception v0

    .line 119
    :try_start_1
    monitor-exit v7
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 120
    throw v0

    .line 121
    :pswitch_4
    iget-object v0, p0, Lyf1;->g:Lmq1;

    .line 122
    .line 123
    sget-object v1, Lhg4;->C:Lhg4;

    .line 124
    .line 125
    iget-object v2, v1, Lhg4;->o:Lus1;

    .line 126
    .line 127
    iget-object v3, v0, Lmq1;->a:Landroid/content/Context;

    .line 128
    .line 129
    iget-object v4, v0, Lmq1;->d:Ljava/lang/String;

    .line 130
    .line 131
    iget-object v0, v0, Lmq1;->e:Ljava/lang/String;

    .line 132
    .line 133
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 134
    .line 135
    .line 136
    sget-object v5, Lmz1;->p5:Liz1;

    .line 137
    .line 138
    sget-object v6, Ltw1;->e:Ltw1;

    .line 139
    .line 140
    iget-object v7, v6, Ltw1;->c:Lkz1;

    .line 141
    .line 142
    invoke-virtual {v7, v5}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v5

    .line 146
    check-cast v5, Ljava/lang/String;

    .line 147
    .line 148
    invoke-virtual {v2, v3, v5, v4, v0}, Lus1;->k(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    .line 149
    .line 150
    .line 151
    move-result-object v5

    .line 152
    invoke-virtual {v5}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object v5

    .line 156
    invoke-static {v3, v5, v0}, Lus1;->j(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object v5

    .line 160
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 161
    .line 162
    .line 163
    move-result v7

    .line 164
    const/4 v8, 0x1

    .line 165
    if-eqz v7, :cond_2

    .line 166
    .line 167
    const-string v0, "Not linked for in app preview."

    .line 168
    .line 169
    invoke-static {v0}, Lgi2;->U(Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    goto/16 :goto_3

    .line 173
    .line 174
    :cond_2
    invoke-virtual {v5}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object v5

    .line 178
    :try_start_2
    new-instance v7, Lorg/json/JSONObject;

    .line 179
    .line 180
    invoke-direct {v7, v5}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 181
    .line 182
    .line 183
    const-string v5, "gct"

    .line 184
    .line 185
    invoke-virtual {v7, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object v5

    .line 189
    const-string v9, "status"

    .line 190
    .line 191
    invoke-virtual {v7, v9}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object v7

    .line 195
    iput-object v7, v2, Lus1;->f:Ljava/lang/String;

    .line 196
    .line 197
    sget-object v7, Lmz1;->X9:Liz1;

    .line 198
    .line 199
    iget-object v6, v6, Ltw1;->c:Lkz1;

    .line 200
    .line 201
    invoke-virtual {v6, v7}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object v6

    .line 205
    check-cast v6, Ljava/lang/Boolean;

    .line 206
    .line 207
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    .line 208
    .line 209
    .line 210
    move-result v6

    .line 211
    const/4 v7, 0x0

    .line 212
    if-eqz v6, :cond_6

    .line 213
    .line 214
    const-string v6, "0"

    .line 215
    .line 216
    iget-object v9, v2, Lus1;->f:Ljava/lang/String;

    .line 217
    .line 218
    invoke-virtual {v6, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 219
    .line 220
    .line 221
    move-result v6

    .line 222
    if-nez v6, :cond_3

    .line 223
    .line 224
    const-string v6, "2"

    .line 225
    .line 226
    iget-object v9, v2, Lus1;->f:Ljava/lang/String;

    .line 227
    .line 228
    invoke-virtual {v6, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 229
    .line 230
    .line 231
    move-result v6

    .line 232
    if-eqz v6, :cond_4

    .line 233
    .line 234
    :cond_3
    move v6, v8

    .line 235
    goto :goto_1

    .line 236
    :cond_4
    move v6, v7

    .line 237
    :goto_1
    invoke-virtual {v2, v6}, Lus1;->f(Z)V

    .line 238
    .line 239
    .line 240
    iget-object v1, v1, Lhg4;->h:Lgd2;

    .line 241
    .line 242
    invoke-virtual {v1}, Lgd2;->g()Lra4;

    .line 243
    .line 244
    .line 245
    move-result-object v1

    .line 246
    if-nez v6, :cond_5

    .line 247
    .line 248
    const-string v6, ""

    .line 249
    .line 250
    goto :goto_2

    .line 251
    :cond_5
    move-object v6, v4

    .line 252
    :goto_2
    invoke-virtual {v1, v6}, Lra4;->f(Ljava/lang/String;)V
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_0

    .line 253
    .line 254
    .line 255
    :cond_6
    iget-object v1, v2, Lus1;->a:Ljava/lang/Object;

    .line 256
    .line 257
    monitor-enter v1

    .line 258
    :try_start_3
    iput-object v5, v2, Lus1;->c:Ljava/lang/String;

    .line 259
    .line 260
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 261
    iget-object v1, v2, Lus1;->f:Ljava/lang/String;

    .line 262
    .line 263
    const-string v5, "2"

    .line 264
    .line 265
    invoke-virtual {v5, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 266
    .line 267
    .line 268
    move-result v1

    .line 269
    if-eqz v1, :cond_7

    .line 270
    .line 271
    const-string v0, "Creative is not pushed for this device."

    .line 272
    .line 273
    invoke-static {v0}, Lgi2;->U(Ljava/lang/String;)V

    .line 274
    .line 275
    .line 276
    const-string v0, "There was no creative pushed from DFP to the device."

    .line 277
    .line 278
    invoke-virtual {v2, v3, v0, v7, v7}, Lus1;->i(Landroid/content/Context;Ljava/lang/String;ZZ)V

    .line 279
    .line 280
    .line 281
    goto :goto_4

    .line 282
    :cond_7
    iget-object v1, v2, Lus1;->f:Ljava/lang/String;

    .line 283
    .line 284
    const-string v5, "1"

    .line 285
    .line 286
    invoke-virtual {v5, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 287
    .line 288
    .line 289
    move-result v1

    .line 290
    if-eqz v1, :cond_8

    .line 291
    .line 292
    const-string v1, "The app is not linked for creative preview."

    .line 293
    .line 294
    invoke-static {v1}, Lgi2;->U(Ljava/lang/String;)V

    .line 295
    .line 296
    .line 297
    invoke-virtual {v2, v3, v4, v0}, Lus1;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 298
    .line 299
    .line 300
    goto :goto_4

    .line 301
    :cond_8
    iget-object v0, v2, Lus1;->f:Ljava/lang/String;

    .line 302
    .line 303
    const-string v1, "0"

    .line 304
    .line 305
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 306
    .line 307
    .line 308
    move-result v0

    .line 309
    if-eqz v0, :cond_9

    .line 310
    .line 311
    const-string v0, "Device is linked for in app preview."

    .line 312
    .line 313
    invoke-static {v0}, Lgi2;->U(Ljava/lang/String;)V

    .line 314
    .line 315
    .line 316
    const-string v0, "The device is successfully linked for creative preview."

    .line 317
    .line 318
    invoke-virtual {v2, v3, v0, v7, v8}, Lus1;->i(Landroid/content/Context;Ljava/lang/String;ZZ)V

    .line 319
    .line 320
    .line 321
    goto :goto_4

    .line 322
    :catchall_1
    move-exception v0

    .line 323
    :try_start_4
    monitor-exit v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 324
    throw v0

    .line 325
    :catch_0
    const/4 v0, 0x5

    .line 326
    invoke-static {v0}, Lgi2;->q0(I)Z

    .line 327
    .line 328
    .line 329
    :goto_3
    const-string v0, "In-app preview failed to load because of a system error. Please try again later."

    .line 330
    .line 331
    invoke-virtual {v2, v3, v0, v8, v8}, Lus1;->i(Landroid/content/Context;Ljava/lang/String;ZZ)V

    .line 332
    .line 333
    .line 334
    :cond_9
    :goto_4
    return-void

    .line 335
    :pswitch_5
    iget-object v0, p0, Lyf1;->g:Lmq1;

    .line 336
    .line 337
    iget-object v1, v0, Lmq1;->a:Landroid/content/Context;

    .line 338
    .line 339
    invoke-virtual {v0, v1}, Lmq1;->d(Landroid/content/Context;)V

    .line 340
    .line 341
    .line 342
    return-void

    .line 343
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
