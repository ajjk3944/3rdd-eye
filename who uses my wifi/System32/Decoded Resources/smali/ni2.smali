.class public final synthetic Lni2;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic f:I

.field public final synthetic g:Loi2;

.field public final synthetic h:Ljava/lang/Runnable;


# direct methods
.method public synthetic constructor <init>(Loi2;Ljava/lang/Runnable;I)V
    .locals 0

    .line 1
    iput p3, p0, Lni2;->f:I

    .line 2
    .line 3
    iput-object p1, p0, Lni2;->g:Loi2;

    .line 4
    .line 5
    iput-object p2, p0, Lni2;->h:Ljava/lang/Runnable;

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
    .locals 11

    .line 1
    iget v0, p0, Lni2;->f:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const-string v0, "Adapters must be initialized on the main thread."

    .line 7
    .line 8
    invoke-static {v0}, Lou1;->h(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sget-object v0, Lhg4;->C:Lhg4;

    .line 12
    .line 13
    iget-object v0, v0, Lhg4;->h:Lgd2;

    .line 14
    .line 15
    invoke-virtual {v0}, Lgd2;->g()Lra4;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v0}, Lra4;->m()Led2;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iget-object v0, v0, Led2;->c:Ljava/util/HashMap;

    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/util/HashMap;->isEmpty()Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    const-string v2, "Initialized rewarded video mediation adapter "

    .line 30
    .line 31
    if-eqz v1, :cond_0

    .line 32
    .line 33
    goto/16 :goto_3

    .line 34
    .line 35
    :cond_0
    iget-object v1, p0, Lni2;->h:Ljava/lang/Runnable;

    .line 36
    .line 37
    const/4 v3, 0x5

    .line 38
    if-eqz v1, :cond_1

    .line 39
    .line 40
    :try_start_0
    invoke-interface {v1}, Ljava/lang/Runnable;->run()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :catchall_0
    invoke-static {v3}, Lgi2;->q0(I)Z

    .line 45
    .line 46
    .line 47
    goto/16 :goto_3

    .line 48
    .line 49
    :cond_1
    :goto_0
    iget-object v1, p0, Lni2;->g:Loi2;

    .line 50
    .line 51
    iget-object v4, v1, Loi2;->h:Lyu2;

    .line 52
    .line 53
    iget-object v4, v4, Lyu2;->a:Lt83;

    .line 54
    .line 55
    iget-object v4, v4, Lt83;->i:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v4, Ljava/util/concurrent/atomic/AtomicReference;

    .line 58
    .line 59
    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    check-cast v4, Lu62;

    .line 64
    .line 65
    if-eqz v4, :cond_8

    .line 66
    .line 67
    new-instance v4, Ljava/util/HashMap;

    .line 68
    .line 69
    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 81
    .line 82
    .line 83
    move-result v5

    .line 84
    if-eqz v5, :cond_6

    .line 85
    .line 86
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v5

    .line 90
    check-cast v5, Lr62;

    .line 91
    .line 92
    iget-object v5, v5, Lr62;->a:Ljava/util/List;

    .line 93
    .line 94
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 95
    .line 96
    .line 97
    move-result-object v5

    .line 98
    :cond_3
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 99
    .line 100
    .line 101
    move-result v6

    .line 102
    if-eqz v6, :cond_2

    .line 103
    .line 104
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v6

    .line 108
    check-cast v6, Lq62;

    .line 109
    .line 110
    iget-object v7, v6, Lq62;->b:Ljava/lang/String;

    .line 111
    .line 112
    iget-object v6, v6, Lq62;->a:Ljava/util/List;

    .line 113
    .line 114
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 115
    .line 116
    .line 117
    move-result-object v6

    .line 118
    :cond_4
    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 119
    .line 120
    .line 121
    move-result v8

    .line 122
    if-eqz v8, :cond_3

    .line 123
    .line 124
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v8

    .line 128
    check-cast v8, Ljava/lang/String;

    .line 129
    .line 130
    invoke-virtual {v4, v8}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 131
    .line 132
    .line 133
    move-result v9

    .line 134
    if-nez v9, :cond_5

    .line 135
    .line 136
    new-instance v9, Ljava/util/ArrayList;

    .line 137
    .line 138
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 139
    .line 140
    .line 141
    invoke-virtual {v4, v8, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    :cond_5
    if-eqz v7, :cond_4

    .line 145
    .line 146
    invoke-virtual {v4, v8}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v8

    .line 150
    check-cast v8, Ljava/util/List;

    .line 151
    .line 152
    invoke-interface {v8, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    goto :goto_1

    .line 156
    :cond_6
    new-instance v0, Lorg/json/JSONObject;

    .line 157
    .line 158
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 159
    .line 160
    .line 161
    invoke-virtual {v4}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 162
    .line 163
    .line 164
    move-result-object v4

    .line 165
    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 166
    .line 167
    .line 168
    move-result-object v4

    .line 169
    :cond_7
    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 170
    .line 171
    .line 172
    move-result v5

    .line 173
    if-eqz v5, :cond_8

    .line 174
    .line 175
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object v5

    .line 179
    check-cast v5, Ljava/util/Map$Entry;

    .line 180
    .line 181
    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object v6

    .line 185
    check-cast v6, Ljava/lang/String;

    .line 186
    .line 187
    :try_start_1
    iget-object v7, v1, Loi2;->i:Lb03;

    .line 188
    .line 189
    invoke-interface {v7, v6, v0}, Lb03;->a(Ljava/lang/String;Lorg/json/JSONObject;)Lc03;

    .line 190
    .line 191
    .line 192
    move-result-object v7

    .line 193
    if-eqz v7, :cond_7

    .line 194
    .line 195
    iget-object v8, v7, Lc03;->b:Ljava/lang/Object;

    .line 196
    .line 197
    check-cast v8, Lu83;

    .line 198
    .line 199
    invoke-virtual {v8}, Lu83;->a()Z

    .line 200
    .line 201
    .line 202
    move-result v9
    :try_end_1
    .catch Ln83; {:try_start_1 .. :try_end_1} :catch_0

    .line 203
    iget-object v8, v8, Lu83;->a:Lw62;

    .line 204
    .line 205
    if-nez v9, :cond_7

    .line 206
    .line 207
    :try_start_2
    invoke-interface {v8}, Lw62;->K()Z

    .line 208
    .line 209
    .line 210
    move-result v9
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 211
    if-eqz v9, :cond_7

    .line 212
    .line 213
    :try_start_3
    iget-object v7, v7, Lc03;->c:Lhv1;

    .line 214
    .line 215
    check-cast v7, Lw03;

    .line 216
    .line 217
    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    move-result-object v5

    .line 221
    check-cast v5, Ljava/util/List;

    .line 222
    .line 223
    iget-object v9, v1, Loi2;->f:Landroid/content/Context;
    :try_end_3
    .catch Ln83; {:try_start_3 .. :try_end_3} :catch_0

    .line 224
    .line 225
    :try_start_4
    new-instance v10, Loi0;

    .line 226
    .line 227
    invoke-direct {v10, v9}, Loi0;-><init>(Ljava/lang/Object;)V

    .line 228
    .line 229
    .line 230
    invoke-interface {v8, v10, v7, v5}, Lw62;->V2(Lu10;Lsa2;Ljava/util/List;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 231
    .line 232
    .line 233
    :try_start_5
    invoke-static {v6}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 234
    .line 235
    .line 236
    move-result-object v5

    .line 237
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 238
    .line 239
    .line 240
    move-result v5

    .line 241
    add-int/lit8 v5, v5, 0x2d

    .line 242
    .line 243
    new-instance v7, Ljava/lang/StringBuilder;

    .line 244
    .line 245
    invoke-direct {v7, v5}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 246
    .line 247
    .line 248
    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 249
    .line 250
    .line 251
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 252
    .line 253
    .line 254
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 255
    .line 256
    .line 257
    move-result-object v5

    .line 258
    invoke-static {v5}, Lgi2;->U(Ljava/lang/String;)V

    .line 259
    .line 260
    .line 261
    goto :goto_2

    .line 262
    :catchall_1
    move-exception v5

    .line 263
    new-instance v7, Ln83;

    .line 264
    .line 265
    invoke-direct {v7, v5}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    .line 266
    .line 267
    .line 268
    throw v7

    .line 269
    :catchall_2
    move-exception v5

    .line 270
    new-instance v7, Ln83;

    .line 271
    .line 272
    invoke-direct {v7, v5}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    .line 273
    .line 274
    .line 275
    throw v7
    :try_end_5
    .catch Ln83; {:try_start_5 .. :try_end_5} :catch_0

    .line 276
    :catch_0
    invoke-static {v6}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 277
    .line 278
    .line 279
    move-result-object v5

    .line 280
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 281
    .line 282
    .line 283
    move-result v5

    .line 284
    new-instance v6, Ljava/lang/StringBuilder;

    .line 285
    .line 286
    add-int/lit8 v5, v5, 0x38

    .line 287
    .line 288
    invoke-direct {v6, v5}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 289
    .line 290
    .line 291
    invoke-static {v3}, Lgi2;->q0(I)Z

    .line 292
    .line 293
    .line 294
    goto :goto_2

    .line 295
    :cond_8
    :goto_3
    return-void

    .line 296
    :pswitch_0
    sget-object v0, Lmd2;->f:Lld2;

    .line 297
    .line 298
    new-instance v1, Lni2;

    .line 299
    .line 300
    iget-object v2, p0, Lni2;->h:Ljava/lang/Runnable;

    .line 301
    .line 302
    const/4 v3, 0x1

    .line 303
    iget-object v4, p0, Lni2;->g:Loi2;

    .line 304
    .line 305
    invoke-direct {v1, v4, v2, v3}, Lni2;-><init>(Loi2;Ljava/lang/Runnable;I)V

    .line 306
    .line 307
    .line 308
    invoke-virtual {v0, v1}, Lld2;->execute(Ljava/lang/Runnable;)V

    .line 309
    .line 310
    .line 311
    return-void

    .line 312
    nop

    .line 313
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
