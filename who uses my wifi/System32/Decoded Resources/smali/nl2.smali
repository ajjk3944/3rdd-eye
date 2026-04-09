.class public final Lnl2;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final a:Lzx2;

.field public final b:Ll83;

.field public final c:Lu93;

.field public final d:Ltb1;

.field public final e:Ls13;

.field public final f:Lzo2;

.field public g:Lh83;

.field public final h:Lt83;

.field public final i:Lkm2;

.field public final j:Ljava/util/concurrent/Executor;

.field public final k:Lky2;

.field public final l:Le03;


# direct methods
.method public constructor <init>(Lzx2;Ll83;Lu93;Ltb1;Ls13;Lzo2;Lh83;Lt83;Lkm2;Lld2;Lky2;Le03;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnl2;->a:Lzx2;

    .line 5
    .line 6
    iput-object p2, p0, Lnl2;->b:Ll83;

    .line 7
    .line 8
    iput-object p3, p0, Lnl2;->c:Lu93;

    .line 9
    .line 10
    iput-object p4, p0, Lnl2;->d:Ltb1;

    .line 11
    .line 12
    iput-object p5, p0, Lnl2;->e:Ls13;

    .line 13
    .line 14
    iput-object p6, p0, Lnl2;->f:Lzo2;

    .line 15
    .line 16
    iput-object p7, p0, Lnl2;->g:Lh83;

    .line 17
    .line 18
    iput-object p8, p0, Lnl2;->h:Lt83;

    .line 19
    .line 20
    iput-object p9, p0, Lnl2;->i:Lkm2;

    .line 21
    .line 22
    iput-object p10, p0, Lnl2;->j:Ljava/util/concurrent/Executor;

    .line 23
    .line 24
    iput-object p11, p0, Lnl2;->k:Lky2;

    .line 25
    .line 26
    iput-object p12, p0, Lnl2;->l:Le03;

    .line 27
    .line 28
    return-void
.end method


# virtual methods
.method public final a(Ln70;)Lq93;
    .locals 8

    .line 1
    iget-object v0, p0, Lnl2;->g:Lh83;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v2, p0, Lnl2;->c:Lu93;

    .line 6
    .line 7
    sget-object v3, Ls93;->i:Ls93;

    .line 8
    .line 9
    invoke-static {v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    iget-object p1, p0, Lnl2;->g:Lh83;

    .line 13
    .line 14
    invoke-static {p1}, Lpu1;->r(Ljava/lang/Object;)Llq3;

    .line 15
    .line 16
    .line 17
    move-result-object v7

    .line 18
    new-instance v1, Lbu1;

    .line 19
    .line 20
    sget-object v5, Lu93;->d:Llq3;

    .line 21
    .line 22
    sget-object v6, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 23
    .line 24
    const/4 v4, 0x0

    .line 25
    invoke-direct/range {v1 .. v7}, Lbu1;-><init>(Lu93;Ljava/lang/Object;Ljava/lang/String;Ln70;Ljava/util/List;Ln70;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1}, Lbu1;->A()Lq93;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    return-object p1

    .line 33
    :cond_0
    sget-object v0, Lhg4;->C:Lhg4;

    .line 34
    .line 35
    iget-object v0, v0, Lhg4;->j:Lbu1;

    .line 36
    .line 37
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    sget-object v1, Lmz1;->G4:Liz1;

    .line 41
    .line 42
    sget-object v2, Ltw1;->e:Ltw1;

    .line 43
    .line 44
    iget-object v3, v2, Ltw1;->c:Lkz1;

    .line 45
    .line 46
    invoke-virtual {v3, v1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    check-cast v1, Ljava/lang/Boolean;

    .line 51
    .line 52
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    if-eqz v1, :cond_2

    .line 57
    .line 58
    iget-object v1, v0, Lbu1;->i:Ljava/lang/Object;

    .line 59
    .line 60
    monitor-enter v1

    .line 61
    :try_start_0
    invoke-virtual {v0}, Lbu1;->E()V

    .line 62
    .line 63
    .line 64
    iget-object v3, v0, Lbu1;->g:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v3, Ljava/util/concurrent/ScheduledFuture;

    .line 67
    .line 68
    if-eqz v3, :cond_1

    .line 69
    .line 70
    const/4 v4, 0x0

    .line 71
    invoke-interface {v3, v4}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 72
    .line 73
    .line 74
    goto :goto_0

    .line 75
    :catchall_0
    move-exception v0

    .line 76
    move-object p1, v0

    .line 77
    goto :goto_1

    .line 78
    :cond_1
    :goto_0
    sget-object v3, Lmd2;->d:Lkd2;

    .line 79
    .line 80
    iget-object v4, v0, Lbu1;->h:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast v4, Lfu1;

    .line 83
    .line 84
    sget-object v5, Lmz1;->H4:Liz1;

    .line 85
    .line 86
    iget-object v2, v2, Ltw1;->c:Lkz1;

    .line 87
    .line 88
    invoke-virtual {v2, v5}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v2

    .line 92
    check-cast v2, Ljava/lang/Long;

    .line 93
    .line 94
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 95
    .line 96
    .line 97
    move-result-wide v5

    .line 98
    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 99
    .line 100
    invoke-virtual {v3, v4, v5, v6, v2}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    iput-object v2, v0, Lbu1;->g:Ljava/lang/Object;

    .line 105
    .line 106
    monitor-exit v1

    .line 107
    goto :goto_2

    .line 108
    :goto_1
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 109
    throw p1

    .line 110
    :cond_2
    :goto_2
    iget-object v0, p0, Lnl2;->c:Lu93;

    .line 111
    .line 112
    sget-object v1, Ls93;->i:Ls93;

    .line 113
    .line 114
    invoke-virtual {v0, p1, v1}, Lu93;->a(Ln70;Ljava/lang/Object;)Lbu1;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    iget-object v0, p0, Lnl2;->k:Lky2;

    .line 119
    .line 120
    new-instance v1, Lu42;

    .line 121
    .line 122
    const/4 v2, 0x4

    .line 123
    invoke-direct {v1, v2, v0}, Lu42;-><init>(ILjava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {p1, v1}, Lbu1;->s(Lyp3;)Lbu1;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    invoke-virtual {p1}, Lbu1;->A()Lq93;

    .line 131
    .line 132
    .line 133
    move-result-object p1

    .line 134
    return-object p1
.end method

.method public final b()Lq93;
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v0, v1, Lnl2;->b:Ll83;

    .line 4
    .line 5
    iget-object v0, v0, Ll83;->d:Lpc4;

    .line 6
    .line 7
    iget-object v2, v0, Lpc4;->C:Ljava/lang/String;

    .line 8
    .line 9
    if-nez v2, :cond_1

    .line 10
    .line 11
    iget-object v0, v0, Lpc4;->x:Lec2;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    iget-object v0, v1, Lnl2;->i:Lkm2;

    .line 17
    .line 18
    invoke-virtual {v0}, Lkm2;->b()Lq93;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {v1, v0}, Lnl2;->a(Ln70;)Lq93;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    return-object v0

    .line 27
    :cond_1
    :goto_0
    iget-object v3, v1, Lnl2;->c:Lu93;

    .line 28
    .line 29
    sget-object v4, Ls93;->C:Ls93;

    .line 30
    .line 31
    invoke-static {v3}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    iget-object v2, v1, Lnl2;->a:Lzx2;

    .line 35
    .line 36
    sget-object v0, Lmz1;->o2:Liz1;

    .line 37
    .line 38
    sget-object v5, Ltw1;->e:Ltw1;

    .line 39
    .line 40
    iget-object v6, v5, Ltw1;->c:Lkz1;

    .line 41
    .line 42
    invoke-virtual {v6, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    check-cast v0, Ljava/lang/Boolean;

    .line 47
    .line 48
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    if-eqz v0, :cond_2

    .line 53
    .line 54
    iget-object v0, v2, Lzx2;->d:Ll83;

    .line 55
    .line 56
    iget-object v0, v0, Ll83;->t:Landroid/os/Bundle;

    .line 57
    .line 58
    iput-object v0, v2, Lzx2;->o:Landroid/os/Bundle;

    .line 59
    .line 60
    iget-object v0, v2, Lzx2;->i:Ljv2;

    .line 61
    .line 62
    iget-object v0, v0, Ljv2;->e:Landroid/os/Bundle;

    .line 63
    .line 64
    const-string v6, "scar-preloader-ready"

    .line 65
    .line 66
    sget-object v7, Lhg4;->C:Lhg4;

    .line 67
    .line 68
    iget-object v7, v7, Lhg4;->k:Lym;

    .line 69
    .line 70
    invoke-static {v7, v0, v6}, Lga1;->n(Lym;Landroid/os/Bundle;Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    :cond_2
    iget-object v0, v2, Lzx2;->d:Ll83;

    .line 74
    .line 75
    iget-object v0, v0, Ll83;->d:Lpc4;

    .line 76
    .line 77
    iget-object v6, v0, Lpc4;->C:Ljava/lang/String;

    .line 78
    .line 79
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    if-nez v0, :cond_14

    .line 84
    .line 85
    const-string v0, ""

    .line 86
    .line 87
    :try_start_0
    new-instance v7, Lorg/json/JSONObject;

    .line 88
    .line 89
    invoke-direct {v7, v6}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 90
    .line 91
    .line 92
    const-string v8, "request_id"

    .line 93
    .line 94
    invoke-virtual {v7, v8, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    :catch_0
    sget-object v7, Lmz1;->s7:Liz1;

    .line 99
    .line 100
    iget-object v8, v5, Ltw1;->c:Lkz1;

    .line 101
    .line 102
    invoke-virtual {v8, v7}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v8

    .line 106
    check-cast v8, Ljava/lang/Boolean;

    .line 107
    .line 108
    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    .line 109
    .line 110
    .line 111
    move-result v8

    .line 112
    const/4 v9, -0x1

    .line 113
    if-eqz v8, :cond_3

    .line 114
    .line 115
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 116
    .line 117
    .line 118
    move-result v8

    .line 119
    if-eqz v8, :cond_3

    .line 120
    .line 121
    const-string v0, "&request_id="

    .line 122
    .line 123
    invoke-virtual {v6, v0}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    .line 124
    .line 125
    .line 126
    move-result v0

    .line 127
    if-eq v0, v9, :cond_4

    .line 128
    .line 129
    add-int/lit8 v0, v0, 0xc

    .line 130
    .line 131
    invoke-virtual {v6, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    :cond_3
    :goto_1
    move-object v8, v0

    .line 136
    goto :goto_2

    .line 137
    :cond_4
    const-string v0, ""

    .line 138
    .line 139
    goto :goto_1

    .line 140
    :goto_2
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 141
    .line 142
    .line 143
    move-result v0

    .line 144
    if-eqz v0, :cond_5

    .line 145
    .line 146
    new-instance v0, Lr13;

    .line 147
    .line 148
    const/16 v2, 0xf

    .line 149
    .line 150
    const-string v5, "Invalid ad string."

    .line 151
    .line 152
    invoke-direct {v0, v5, v2}, Lhx2;-><init>(Ljava/lang/String;I)V

    .line 153
    .line 154
    .line 155
    invoke-static {v0}, Lpu1;->B(Ljava/lang/Throwable;)Lkq3;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    :goto_3
    move-object v8, v0

    .line 160
    goto/16 :goto_16

    .line 161
    .line 162
    :cond_5
    iget-object v10, v2, Lzx2;->l:Ljava/lang/Object;

    .line 163
    .line 164
    monitor-enter v10

    .line 165
    :try_start_1
    iget-object v0, v2, Lzx2;->a:Lth2;

    .line 166
    .line 167
    iget-object v0, v0, Lth2;->N:Lba4;

    .line 168
    .line 169
    invoke-virtual {v0}, Lba4;->d()Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    move-object v11, v0

    .line 174
    check-cast v11, Loh4;

    .line 175
    .line 176
    iget-object v12, v2, Lzx2;->i:Ljv2;

    .line 177
    .line 178
    invoke-virtual {v11, v8, v12}, Loh4;->b(Ljava/lang/String;Ljv2;)Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object v13

    .line 182
    iget-object v0, v5, Ltw1;->c:Lkz1;

    .line 183
    .line 184
    invoke-virtual {v0, v7}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v0

    .line 188
    check-cast v0, Ljava/lang/Boolean;

    .line 189
    .line 190
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 191
    .line 192
    .line 193
    move-result v0

    .line 194
    if-eqz v0, :cond_b

    .line 195
    .line 196
    const-string v15, "Failed to decode the adResponse. "

    .line 197
    .line 198
    invoke-static {v13}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 199
    .line 200
    .line 201
    move-result v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 202
    if-nez v0, :cond_b

    .line 203
    .line 204
    :try_start_2
    new-instance v0, Lorg/json/JSONObject;

    .line 205
    .line 206
    invoke-direct {v0, v13}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 207
    .line 208
    .line 209
    const-string v7, "extras"

    .line 210
    .line 211
    invoke-virtual {v0, v7}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 212
    .line 213
    .line 214
    move-result-object v0

    .line 215
    if-eqz v0, :cond_b

    .line 216
    .line 217
    const-string v7, "query_info_type"

    .line 218
    .line 219
    const-string v14, ""

    .line 220
    .line 221
    invoke-virtual {v0, v7, v14}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 222
    .line 223
    .line 224
    move-result-object v0

    .line 225
    sget-object v7, Lmz1;->u7:Liz1;

    .line 226
    .line 227
    iget-object v14, v5, Ltw1;->c:Lkz1;

    .line 228
    .line 229
    invoke-virtual {v14, v7}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    move-result-object v7

    .line 233
    check-cast v7, Ljava/lang/Boolean;

    .line 234
    .line 235
    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    .line 236
    .line 237
    .line 238
    move-result v7

    .line 239
    if-eqz v7, :cond_6

    .line 240
    .line 241
    sget-object v7, Lmz1;->v7:Liz1;

    .line 242
    .line 243
    iget-object v5, v5, Ltw1;->c:Lkz1;

    .line 244
    .line 245
    invoke-virtual {v5, v7}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 246
    .line 247
    .line 248
    move-result-object v5

    .line 249
    check-cast v5, Ljava/lang/String;

    .line 250
    .line 251
    const-string v7, ","

    .line 252
    .line 253
    invoke-virtual {v5, v7}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 254
    .line 255
    .line 256
    move-result-object v5

    .line 257
    invoke-static {v5}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 258
    .line 259
    .line 260
    move-result-object v5

    .line 261
    goto :goto_4

    .line 262
    :catchall_0
    move-exception v0

    .line 263
    goto/16 :goto_13

    .line 264
    .line 265
    :cond_6
    sget-object v7, Lmz1;->t7:Liz1;

    .line 266
    .line 267
    iget-object v5, v5, Ltw1;->c:Lkz1;

    .line 268
    .line 269
    invoke-virtual {v5, v7}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 270
    .line 271
    .line 272
    move-result-object v5

    .line 273
    check-cast v5, Ljava/lang/String;

    .line 274
    .line 275
    const-string v7, ","

    .line 276
    .line 277
    invoke-virtual {v5, v7}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 278
    .line 279
    .line 280
    move-result-object v5

    .line 281
    invoke-static {v5}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 282
    .line 283
    .line 284
    move-result-object v5

    .line 285
    :goto_4
    invoke-static {v0}, La30;->s(Ljava/lang/String;)Ljava/lang/String;

    .line 286
    .line 287
    .line 288
    move-result-object v0

    .line 289
    invoke-interface {v5, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 290
    .line 291
    .line 292
    move-result v0
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_4
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 293
    if-nez v0, :cond_7

    .line 294
    .line 295
    goto/16 :goto_9

    .line 296
    .line 297
    :cond_7
    :try_start_3
    const-string v0, "&"

    .line 298
    .line 299
    invoke-virtual {v6, v0}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    .line 300
    .line 301
    .line 302
    move-result v0

    .line 303
    if-eq v0, v9, :cond_8

    .line 304
    .line 305
    const/4 v5, 0x0

    .line 306
    invoke-virtual {v6, v5, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 307
    .line 308
    .line 309
    move-result-object v0

    .line 310
    goto :goto_5

    .line 311
    :cond_8
    const/4 v0, 0x0

    .line 312
    :goto_5
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 313
    .line 314
    .line 315
    move-result v5
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 316
    if-eqz v5, :cond_9

    .line 317
    .line 318
    goto :goto_9

    .line 319
    :cond_9
    const/16 v5, 0xb

    .line 320
    .line 321
    :try_start_4
    invoke-static {v0, v5}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    .line 322
    .line 323
    .line 324
    move-result-object v5

    .line 325
    const-string v0, "UTF-8"

    .line 326
    .line 327
    invoke-virtual {v8, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    .line 328
    .line 329
    .line 330
    move-result-object v7

    .line 331
    const-string v9, "Failed to get key from QueryJSONMap"

    .line 332
    .line 333
    invoke-static {v13}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 334
    .line 335
    .line 336
    move-result v0
    :try_end_4
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_4 .. :try_end_4} :catch_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 337
    if-eqz v0, :cond_a

    .line 338
    .line 339
    :goto_6
    const/4 v0, 0x0

    .line 340
    goto :goto_7

    .line 341
    :cond_a
    :try_start_5
    new-instance v0, Lorg/json/JSONObject;

    .line 342
    .line 343
    invoke-direct {v0, v13}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 344
    .line 345
    .line 346
    const-string v14, "arek"

    .line 347
    .line 348
    invoke-virtual {v0, v14}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 349
    .line 350
    .line 351
    move-result-object v0
    :try_end_5
    .catch Lorg/json/JSONException; {:try_start_5 .. :try_end_5} :catch_3
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_5 .. :try_end_5} :catch_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_5 .. :try_end_5} :catch_1
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 352
    goto :goto_7

    .line 353
    :catch_1
    move-exception v0

    .line 354
    goto :goto_8

    .line 355
    :catch_2
    move-exception v0

    .line 356
    goto :goto_8

    .line 357
    :catch_3
    move-exception v0

    .line 358
    :try_start_6
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 359
    .line 360
    .line 361
    move-result-object v14

    .line 362
    invoke-virtual {v9, v14}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 363
    .line 364
    .line 365
    move-result-object v9

    .line 366
    invoke-static {v9}, Lgi2;->G(Ljava/lang/String;)V

    .line 367
    .line 368
    .line 369
    sget-object v9, Lhg4;->C:Lhg4;

    .line 370
    .line 371
    iget-object v9, v9, Lhg4;->h:Lgd2;

    .line 372
    .line 373
    const-string v14, "CryptoUtils.getKeyFromQueryJsonMap"

    .line 374
    .line 375
    invoke-virtual {v9, v14, v0}, Lgd2;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 376
    .line 377
    .line 378
    goto :goto_6

    .line 379
    :goto_7
    invoke-static {v5, v7, v0, v12}, Lr83;->a([B[BLjava/lang/String;Ljv2;)Ljava/lang/String;

    .line 380
    .line 381
    .line 382
    move-result-object v6
    :try_end_6
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_6 .. :try_end_6} :catch_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_6 .. :try_end_6} :catch_1
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 383
    goto :goto_9

    .line 384
    :goto_8
    :try_start_7
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 385
    .line 386
    .line 387
    move-result-object v5

    .line 388
    invoke-virtual {v15, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 389
    .line 390
    .line 391
    move-result-object v5

    .line 392
    invoke-static {v5}, Lgi2;->G(Ljava/lang/String;)V

    .line 393
    .line 394
    .line 395
    sget-object v5, Lhg4;->C:Lhg4;

    .line 396
    .line 397
    iget-object v5, v5, Lhg4;->h:Lgd2;

    .line 398
    .line 399
    const-string v7, "PreloadedLoader.decryptAdResponseIfNecessary"

    .line 400
    .line 401
    invoke-virtual {v5, v7, v0}, Lgd2;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 402
    .line 403
    .line 404
    :catch_4
    :cond_b
    :goto_9
    const-string v5, "Ad grouping: Has render_id, but not base64 encoded: "

    .line 405
    .line 406
    const-string v7, "Ad grouping: Has render_id, but invalid format: "

    .line 407
    .line 408
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 409
    .line 410
    .line 411
    move-result v0

    .line 412
    if-eqz v0, :cond_c

    .line 413
    .line 414
    const-string v0, ""
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 415
    .line 416
    :goto_a
    move-object v9, v0

    .line 417
    goto :goto_b

    .line 418
    :cond_c
    :try_start_8
    new-instance v0, Lorg/json/JSONObject;

    .line 419
    .line 420
    invoke-direct {v0, v6}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_8
    .catch Lorg/json/JSONException; {:try_start_8 .. :try_end_8} :catch_5
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 421
    .line 422
    .line 423
    :try_start_9
    const-string v9, "render_id"

    .line 424
    .line 425
    const-string v12, ""

    .line 426
    .line 427
    invoke-virtual {v0, v9, v12}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 428
    .line 429
    .line 430
    move-result-object v0

    .line 431
    goto :goto_a

    .line 432
    :catch_5
    const-string v0, ""

    .line 433
    .line 434
    goto :goto_a

    .line 435
    :goto_b
    invoke-static {v9}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 436
    .line 437
    .line 438
    move-result v0

    .line 439
    if-nez v0, :cond_e

    .line 440
    .line 441
    const-string v12, ""
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    .line 442
    .line 443
    :try_start_a
    new-instance v0, Ljava/lang/String;

    .line 444
    .line 445
    const/4 v14, 0x0

    .line 446
    invoke-static {v9, v14}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    .line 447
    .line 448
    .line 449
    move-result-object v15

    .line 450
    sget-object v14, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 451
    .line 452
    invoke-direct {v0, v15, v14}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V
    :try_end_a
    .catch Ljava/lang/IllegalArgumentException; {:try_start_a .. :try_end_a} :catch_6
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    .line 453
    .line 454
    .line 455
    move-object v12, v0

    .line 456
    goto :goto_c

    .line 457
    :catch_6
    move-exception v0

    .line 458
    :try_start_b
    invoke-static {v9}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 459
    .line 460
    .line 461
    move-result-object v14

    .line 462
    invoke-virtual {v5, v14}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 463
    .line 464
    .line 465
    move-result-object v5

    .line 466
    invoke-static {v5}, Lgi2;->G(Ljava/lang/String;)V

    .line 467
    .line 468
    .line 469
    sget-object v5, Lhg4;->C:Lhg4;

    .line 470
    .line 471
    iget-object v5, v5, Lhg4;->h:Lgd2;

    .line 472
    .line 473
    const-string v14, "PreloadedLoader.decodeRenderId"

    .line 474
    .line 475
    invoke-virtual {v5, v14, v0}, Lgd2;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 476
    .line 477
    .line 478
    :goto_c
    new-instance v0, Lyk3;

    .line 479
    .line 480
    const/16 v5, 0x3a

    .line 481
    .line 482
    invoke-direct {v0, v5}, Lyk3;-><init>(C)V

    .line 483
    .line 484
    .line 485
    invoke-static {v0}, Lsq0;->p(Lyk3;)Lsq0;

    .line 486
    .line 487
    .line 488
    move-result-object v0

    .line 489
    invoke-virtual {v0, v12}, Lsq0;->v(Ljava/lang/CharSequence;)Ljava/util/List;

    .line 490
    .line 491
    .line 492
    move-result-object v0

    .line 493
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 494
    .line 495
    .line 496
    move-result v5

    .line 497
    const/4 v12, 0x2

    .line 498
    if-ne v5, v12, :cond_d

    .line 499
    .line 500
    const/4 v5, 0x0

    .line 501
    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 502
    .line 503
    .line 504
    move-result-object v7

    .line 505
    check-cast v7, Ljava/lang/String;

    .line 506
    .line 507
    const/4 v5, 0x1

    .line 508
    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 509
    .line 510
    .line 511
    move-result-object v0

    .line 512
    check-cast v0, Ljava/lang/String;

    .line 513
    .line 514
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 515
    .line 516
    .line 517
    move-result v5

    .line 518
    goto :goto_d

    .line 519
    :cond_d
    invoke-static {v9}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 520
    .line 521
    .line 522
    move-result-object v0

    .line 523
    invoke-virtual {v7, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 524
    .line 525
    .line 526
    move-result-object v0

    .line 527
    invoke-static {v0}, Lgi2;->G(Ljava/lang/String;)V

    .line 528
    .line 529
    .line 530
    :cond_e
    const/4 v5, 0x0

    .line 531
    const/4 v7, 0x0

    .line 532
    :goto_d
    if-eqz v7, :cond_f

    .line 533
    .line 534
    new-instance v0, Landroid/util/Pair;

    .line 535
    .line 536
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 537
    .line 538
    .line 539
    move-result-object v5

    .line 540
    invoke-direct {v0, v7, v5}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 541
    .line 542
    .line 543
    goto :goto_e

    .line 544
    :cond_f
    new-instance v0, Landroid/util/Pair;

    .line 545
    .line 546
    const-string v5, ""

    .line 547
    .line 548
    const/16 v16, 0x0

    .line 549
    .line 550
    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 551
    .line 552
    .line 553
    move-result-object v7

    .line 554
    invoke-direct {v0, v5, v7}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 555
    .line 556
    .line 557
    :goto_e
    iget-object v5, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 558
    .line 559
    check-cast v5, Ljava/lang/String;

    .line 560
    .line 561
    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 562
    .line 563
    check-cast v0, Ljava/lang/Integer;

    .line 564
    .line 565
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 566
    .line 567
    .line 568
    move-result v0

    .line 569
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 570
    .line 571
    .line 572
    move-result v7

    .line 573
    if-nez v7, :cond_12

    .line 574
    .line 575
    if-lez v0, :cond_12

    .line 576
    .line 577
    monitor-enter v11
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_0

    .line 578
    :try_start_c
    iget-object v7, v11, Loh4;->e:Ljava/util/Map;

    .line 579
    .line 580
    invoke-interface {v7, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 581
    .line 582
    .line 583
    move-result-object v7

    .line 584
    check-cast v7, Lfg4;

    .line 585
    .line 586
    if-eqz v7, :cond_10

    .line 587
    .line 588
    iget-object v7, v7, Lfg4;->c:Ljava/util/HashSet;

    .line 589
    .line 590
    invoke-virtual {v7, v5}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 591
    .line 592
    .line 593
    move-result v7
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_1

    .line 594
    if-eqz v7, :cond_10

    .line 595
    .line 596
    :try_start_d
    monitor-exit v11

    .line 597
    new-instance v0, Lr13;

    .line 598
    .line 599
    const-string v2, "The ad has already been shown."

    .line 600
    .line 601
    const/16 v5, 0xa

    .line 602
    .line 603
    invoke-direct {v0, v2, v5}, Lhx2;-><init>(Ljava/lang/String;I)V

    .line 604
    .line 605
    .line 606
    invoke-static {v0}, Lpu1;->B(Ljava/lang/Throwable;)Lkq3;

    .line 607
    .line 608
    .line 609
    move-result-object v0

    .line 610
    monitor-exit v10

    .line 611
    goto/16 :goto_3

    .line 612
    .line 613
    :catchall_1
    move-exception v0

    .line 614
    goto :goto_10

    .line 615
    :cond_10
    monitor-exit v11

    .line 616
    monitor-enter v11
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_0

    .line 617
    :try_start_e
    iget-object v7, v11, Loh4;->e:Ljava/util/Map;

    .line 618
    .line 619
    invoke-interface {v7, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 620
    .line 621
    .line 622
    move-result-object v7

    .line 623
    check-cast v7, Lfg4;

    .line 624
    .line 625
    if-eqz v7, :cond_11

    .line 626
    .line 627
    iget-object v7, v7, Lfg4;->c:Ljava/util/HashSet;

    .line 628
    .line 629
    invoke-virtual {v7, v5}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 630
    .line 631
    .line 632
    invoke-virtual {v7}, Ljava/util/HashSet;->size()I

    .line 633
    .line 634
    .line 635
    move-result v5
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_2

    .line 636
    if-ge v5, v0, :cond_11

    .line 637
    .line 638
    :try_start_f
    monitor-exit v11

    .line 639
    goto :goto_12

    .line 640
    :catchall_2
    move-exception v0

    .line 641
    goto :goto_f

    .line 642
    :cond_11
    monitor-exit v11
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_0

    .line 643
    goto :goto_11

    .line 644
    :goto_f
    :try_start_10
    monitor-exit v11
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_2

    .line 645
    :try_start_11
    throw v0
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_0

    .line 646
    :goto_10
    :try_start_12
    monitor-exit v11
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_1

    .line 647
    :try_start_13
    throw v0

    .line 648
    :cond_12
    :goto_11
    monitor-enter v11
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_0

    .line 649
    :try_start_14
    iget-object v0, v11, Loh4;->e:Ljava/util/Map;

    .line 650
    .line 651
    invoke-interface {v0, v8}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_3

    .line 652
    .line 653
    .line 654
    :try_start_15
    monitor-exit v11

    .line 655
    :goto_12
    monitor-exit v10
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_0

    .line 656
    invoke-static {v13}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 657
    .line 658
    .line 659
    move-result v0

    .line 660
    if-eqz v0, :cond_13

    .line 661
    .line 662
    goto :goto_14

    .line 663
    :cond_13
    invoke-virtual {v2, v13}, Lzx2;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 664
    .line 665
    .line 666
    move-result-object v0

    .line 667
    invoke-virtual {v2, v6, v0}, Lzx2;->a(Ljava/lang/String;Ljava/lang/String;)Lgp3;

    .line 668
    .line 669
    .line 670
    move-result-object v0

    .line 671
    goto/16 :goto_3

    .line 672
    .line 673
    :catchall_3
    move-exception v0

    .line 674
    :try_start_16
    monitor-exit v11
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_3

    .line 675
    :try_start_17
    throw v0

    .line 676
    :goto_13
    monitor-exit v10
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_0

    .line 677
    throw v0

    .line 678
    :cond_14
    :goto_14
    iget-object v0, v2, Lzx2;->d:Ll83;

    .line 679
    .line 680
    iget-object v0, v0, Ll83;->d:Lpc4;

    .line 681
    .line 682
    iget-object v0, v0, Lpc4;->x:Lec2;

    .line 683
    .line 684
    if-eqz v0, :cond_17

    .line 685
    .line 686
    sget-object v5, Lmz1;->k7:Liz1;

    .line 687
    .line 688
    sget-object v6, Ltw1;->e:Ltw1;

    .line 689
    .line 690
    iget-object v6, v6, Ltw1;->c:Lkz1;

    .line 691
    .line 692
    invoke-virtual {v6, v5}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 693
    .line 694
    .line 695
    move-result-object v5

    .line 696
    check-cast v5, Ljava/lang/Boolean;

    .line 697
    .line 698
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 699
    .line 700
    .line 701
    move-result v5

    .line 702
    if-nez v5, :cond_15

    .line 703
    .line 704
    goto :goto_15

    .line 705
    :cond_15
    iget-object v5, v0, Lec2;->f:Ljava/lang/String;

    .line 706
    .line 707
    iget-object v6, v0, Lec2;->g:Ljava/lang/String;

    .line 708
    .line 709
    const-string v7, ""

    .line 710
    .line 711
    :try_start_18
    new-instance v8, Lorg/json/JSONObject;

    .line 712
    .line 713
    invoke-direct {v8, v5}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_18
    .catch Lorg/json/JSONException; {:try_start_18 .. :try_end_18} :catch_7

    .line 714
    .line 715
    .line 716
    const-string v5, "request_id"

    .line 717
    .line 718
    invoke-virtual {v8, v5, v7}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 719
    .line 720
    .line 721
    move-result-object v7

    .line 722
    :catch_7
    const-string v5, ""

    .line 723
    .line 724
    :try_start_19
    new-instance v8, Lorg/json/JSONObject;

    .line 725
    .line 726
    invoke-direct {v8, v6}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_19
    .catch Lorg/json/JSONException; {:try_start_19 .. :try_end_19} :catch_8

    .line 727
    .line 728
    .line 729
    const-string v6, "request_id"

    .line 730
    .line 731
    invoke-virtual {v8, v6, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 732
    .line 733
    .line 734
    move-result-object v5

    .line 735
    :catch_8
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 736
    .line 737
    .line 738
    move-result v6

    .line 739
    if-nez v6, :cond_16

    .line 740
    .line 741
    invoke-virtual {v7, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 742
    .line 743
    .line 744
    move-result v5

    .line 745
    if-eqz v5, :cond_16

    .line 746
    .line 747
    iget-object v5, v2, Lzx2;->a:Lth2;

    .line 748
    .line 749
    iget-object v5, v5, Lth2;->N:Lba4;

    .line 750
    .line 751
    invoke-virtual {v5}, Lba4;->d()Ljava/lang/Object;

    .line 752
    .line 753
    .line 754
    move-result-object v5

    .line 755
    check-cast v5, Loh4;

    .line 756
    .line 757
    monitor-enter v5

    .line 758
    :try_start_1a
    iget-object v6, v5, Loh4;->e:Ljava/util/Map;

    .line 759
    .line 760
    invoke-interface {v6, v7}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1a
    .catchall {:try_start_1a .. :try_end_1a} :catchall_4

    .line 761
    .line 762
    .line 763
    monitor-exit v5

    .line 764
    iget-object v5, v2, Lzx2;->i:Ljv2;

    .line 765
    .line 766
    iget-object v5, v5, Ljv2;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 767
    .line 768
    const-string v6, "request_id"

    .line 769
    .line 770
    invoke-virtual {v5, v6, v7}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 771
    .line 772
    .line 773
    :goto_15
    iget-object v5, v0, Lec2;->f:Ljava/lang/String;

    .line 774
    .line 775
    iget-object v0, v0, Lec2;->g:Ljava/lang/String;

    .line 776
    .line 777
    invoke-virtual {v2, v0}, Lzx2;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 778
    .line 779
    .line 780
    move-result-object v0

    .line 781
    invoke-virtual {v2, v5, v0}, Lzx2;->a(Ljava/lang/String;Ljava/lang/String;)Lgp3;

    .line 782
    .line 783
    .line 784
    move-result-object v0

    .line 785
    goto/16 :goto_3

    .line 786
    .line 787
    :catchall_4
    move-exception v0

    .line 788
    :try_start_1b
    monitor-exit v5
    :try_end_1b
    .catchall {:try_start_1b .. :try_end_1b} :catchall_4

    .line 789
    throw v0

    .line 790
    :cond_16
    iget-object v0, v2, Lzx2;->i:Ljv2;

    .line 791
    .line 792
    iget-object v0, v0, Ljv2;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 793
    .line 794
    const-string v2, "ridmm"

    .line 795
    .line 796
    const-string v5, "true"

    .line 797
    .line 798
    invoke-virtual {v0, v2, v5}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 799
    .line 800
    .line 801
    :cond_17
    new-instance v0, Lr13;

    .line 802
    .line 803
    const/16 v2, 0xe

    .line 804
    .line 805
    const-string v5, "Mismatch request IDs."

    .line 806
    .line 807
    invoke-direct {v0, v5, v2}, Lhx2;-><init>(Ljava/lang/String;I)V

    .line 808
    .line 809
    .line 810
    invoke-static {v0}, Lpu1;->B(Ljava/lang/Throwable;)Lkq3;

    .line 811
    .line 812
    .line 813
    move-result-object v0

    .line 814
    goto/16 :goto_3

    .line 815
    .line 816
    :goto_16
    new-instance v2, Lbu1;

    .line 817
    .line 818
    sget-object v6, Lu93;->d:Llq3;

    .line 819
    .line 820
    sget-object v7, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 821
    .line 822
    const/4 v5, 0x0

    .line 823
    invoke-direct/range {v2 .. v8}, Lbu1;-><init>(Lu93;Ljava/lang/Object;Ljava/lang/String;Ln70;Ljava/util/List;Ln70;)V

    .line 824
    .line 825
    .line 826
    invoke-virtual {v2}, Lbu1;->A()Lq93;

    .line 827
    .line 828
    .line 829
    move-result-object v0

    .line 830
    return-object v0
.end method

.method public final c(Ln70;)Lq93;
    .locals 3

    .line 1
    iget-object v0, p0, Lnl2;->c:Lu93;

    .line 2
    .line 3
    sget-object v1, Ls93;->j:Ls93;

    .line 4
    .line 5
    invoke-virtual {v0, p1, v1}, Lu93;->a(Ln70;Ljava/lang/Object;)Lbu1;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    new-instance v0, Lzs1;

    .line 10
    .line 11
    const/16 v1, 0x12

    .line 12
    .line 13
    invoke-direct {v0, v1, p0}, Lzs1;-><init>(ILjava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1, v0}, Lbu1;->q(Lo93;)Lbu1;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iget-object v0, p0, Lnl2;->e:Ls13;

    .line 21
    .line 22
    invoke-virtual {p1, v0}, Lbu1;->s(Lyp3;)Lbu1;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    sget-object v0, Lmz1;->Y5:Liz1;

    .line 27
    .line 28
    sget-object v1, Ltw1;->e:Ltw1;

    .line 29
    .line 30
    iget-object v2, v1, Ltw1;->c:Lkz1;

    .line 31
    .line 32
    invoke-virtual {v2, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    check-cast v0, Ljava/lang/Boolean;

    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-nez v0, :cond_0

    .line 43
    .line 44
    sget-object v0, Lmz1;->Z5:Liz1;

    .line 45
    .line 46
    iget-object v1, v1, Ltw1;->c:Lkz1;

    .line 47
    .line 48
    invoke-virtual {v1, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    check-cast v0, Ljava/lang/Integer;

    .line 53
    .line 54
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    int-to-long v0, v0

    .line 59
    sget-object v2, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 60
    .line 61
    invoke-virtual {p1, v0, v1}, Lbu1;->z(J)Lbu1;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    :cond_0
    invoke-virtual {p1}, Lbu1;->A()Lq93;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    return-object p1
.end method
