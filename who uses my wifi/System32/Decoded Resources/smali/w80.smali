.class public final synthetic Lw80;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Landroid/content/Context;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 0

    .line 1
    iput p4, p0, Lw80;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lw80;->b:Landroid/content/Context;

    .line 4
    .line 5
    iput-object p2, p0, Lw80;->c:Ljava/lang/String;

    .line 6
    .line 7
    iput-object p3, p0, Lw80;->d:Ljava/lang/String;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 11

    .line 1
    iget v0, p0, Lw80;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lw80;->b:Landroid/content/Context;

    .line 7
    .line 8
    iget-object v1, p0, Lw80;->c:Ljava/lang/String;

    .line 9
    .line 10
    iget-object v2, p0, Lw80;->d:Ljava/lang/String;

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, Lz80;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Lo90;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    return-object v0

    .line 17
    :pswitch_0
    iget-object v2, p0, Lw80;->b:Landroid/content/Context;

    .line 18
    .line 19
    iget-object v3, p0, Lw80;->c:Ljava/lang/String;

    .line 20
    .line 21
    iget-object v6, p0, Lw80;->d:Ljava/lang/String;

    .line 22
    .line 23
    sget-object v0, La30;->r:Lvg0;

    .line 24
    .line 25
    if-nez v0, :cond_3

    .line 26
    .line 27
    const-class v1, Lvg0;

    .line 28
    .line 29
    monitor-enter v1

    .line 30
    :try_start_0
    sget-object v0, La30;->r:Lvg0;

    .line 31
    .line 32
    if-nez v0, :cond_2

    .line 33
    .line 34
    new-instance v0, Lvg0;

    .line 35
    .line 36
    invoke-virtual {v2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    sget-object v5, La30;->s:Lug0;

    .line 41
    .line 42
    if-nez v5, :cond_1

    .line 43
    .line 44
    const-class v5, Lug0;

    .line 45
    .line 46
    monitor-enter v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 47
    :try_start_1
    sget-object v7, La30;->s:Lug0;

    .line 48
    .line 49
    if-nez v7, :cond_0

    .line 50
    .line 51
    new-instance v7, Lug0;

    .line 52
    .line 53
    new-instance v8, Ldk;

    .line 54
    .line 55
    invoke-direct {v8, v4}, Ldk;-><init>(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    const/4 v4, 0x0

    .line 59
    invoke-direct {v7, v4, v8}, Lug0;-><init>(ILjava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    sput-object v7, La30;->s:Lug0;

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :catchall_0
    move-exception v0

    .line 66
    goto :goto_1

    .line 67
    :cond_0
    :goto_0
    monitor-exit v5

    .line 68
    move-object v5, v7

    .line 69
    goto :goto_2

    .line 70
    :goto_1
    monitor-exit v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 71
    :try_start_2
    throw v0

    .line 72
    :cond_1
    :goto_2
    new-instance v4, Lfr;

    .line 73
    .line 74
    const/16 v7, 0x12

    .line 75
    .line 76
    invoke-direct {v4, v7}, Lfr;-><init>(I)V

    .line 77
    .line 78
    .line 79
    invoke-direct {v0, v5, v4}, Lvg0;-><init>(Lug0;Lfr;)V

    .line 80
    .line 81
    .line 82
    sput-object v0, La30;->r:Lvg0;

    .line 83
    .line 84
    goto :goto_3

    .line 85
    :catchall_1
    move-exception v0

    .line 86
    goto :goto_4

    .line 87
    :cond_2
    :goto_3
    monitor-exit v1

    .line 88
    :cond_3
    move-object v1, v0

    .line 89
    goto :goto_5

    .line 90
    :goto_4
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 91
    throw v0

    .line 92
    :goto_5
    const/4 v4, 0x2

    .line 93
    const/4 v5, 0x1

    .line 94
    const/4 v7, 0x0

    .line 95
    if-eqz v6, :cond_7

    .line 96
    .line 97
    iget-object v0, v1, Lvg0;->g:Ljava/lang/Object;

    .line 98
    .line 99
    check-cast v0, Lug0;

    .line 100
    .line 101
    :try_start_3
    invoke-virtual {v0, v3}, Lug0;->u(Ljava/lang/String;)Ljava/io/File;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    if-nez v0, :cond_4

    .line 106
    .line 107
    :catch_0
    move-object v0, v7

    .line 108
    goto :goto_7

    .line 109
    :cond_4
    new-instance v8, Ljava/io/FileInputStream;

    .line 110
    .line 111
    invoke-direct {v8, v0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_3
    .catch Ljava/io/FileNotFoundException; {:try_start_3 .. :try_end_3} :catch_0

    .line 112
    .line 113
    .line 114
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v9

    .line 118
    const-string v10, ".zip"

    .line 119
    .line 120
    invoke-virtual {v9, v10}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 121
    .line 122
    .line 123
    move-result v9

    .line 124
    if-eqz v9, :cond_5

    .line 125
    .line 126
    sget-object v9, Lku;->h:Lku;

    .line 127
    .line 128
    goto :goto_6

    .line 129
    :cond_5
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v9

    .line 133
    const-string v10, ".gz"

    .line 134
    .line 135
    invoke-virtual {v9, v10}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 136
    .line 137
    .line 138
    move-result v9

    .line 139
    if-eqz v9, :cond_6

    .line 140
    .line 141
    sget-object v9, Lku;->i:Lku;

    .line 142
    .line 143
    goto :goto_6

    .line 144
    :cond_6
    sget-object v9, Lku;->g:Lku;

    .line 145
    .line 146
    :goto_6
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    invoke-static {}, Lj80;->a()V

    .line 150
    .line 151
    .line 152
    new-instance v0, Landroid/util/Pair;

    .line 153
    .line 154
    invoke-direct {v0, v9, v8}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 155
    .line 156
    .line 157
    :goto_7
    if-nez v0, :cond_8

    .line 158
    .line 159
    :cond_7
    move-object v0, v7

    .line 160
    goto :goto_9

    .line 161
    :cond_8
    iget-object v8, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 162
    .line 163
    check-cast v8, Lku;

    .line 164
    .line 165
    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 166
    .line 167
    check-cast v0, Ljava/io/InputStream;

    .line 168
    .line 169
    invoke-virtual {v8}, Ljava/lang/Enum;->ordinal()I

    .line 170
    .line 171
    .line 172
    move-result v8

    .line 173
    if-eq v8, v5, :cond_a

    .line 174
    .line 175
    if-eq v8, v4, :cond_9

    .line 176
    .line 177
    invoke-static {v0, v6}, Lz80;->d(Ljava/io/InputStream;Ljava/lang/String;)Lo90;

    .line 178
    .line 179
    .line 180
    move-result-object v0

    .line 181
    goto :goto_8

    .line 182
    :cond_9
    :try_start_4
    new-instance v8, Ljava/util/zip/GZIPInputStream;

    .line 183
    .line 184
    invoke-direct {v8, v0}, Ljava/util/zip/GZIPInputStream;-><init>(Ljava/io/InputStream;)V

    .line 185
    .line 186
    .line 187
    invoke-static {v8, v6}, Lz80;->d(Ljava/io/InputStream;Ljava/lang/String;)Lo90;

    .line 188
    .line 189
    .line 190
    move-result-object v0
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1

    .line 191
    goto :goto_8

    .line 192
    :catch_1
    move-exception v0

    .line 193
    new-instance v8, Lo90;

    .line 194
    .line 195
    invoke-direct {v8, v0}, Lo90;-><init>(Ljava/lang/Throwable;)V

    .line 196
    .line 197
    .line 198
    move-object v0, v8

    .line 199
    goto :goto_8

    .line 200
    :cond_a
    new-instance v8, Ljava/util/zip/ZipInputStream;

    .line 201
    .line 202
    invoke-direct {v8, v0}, Ljava/util/zip/ZipInputStream;-><init>(Ljava/io/InputStream;)V

    .line 203
    .line 204
    .line 205
    invoke-static {v2, v8, v6}, Lz80;->g(Landroid/content/Context;Ljava/util/zip/ZipInputStream;Ljava/lang/String;)Lo90;

    .line 206
    .line 207
    .line 208
    move-result-object v0

    .line 209
    :goto_8
    iget-object v0, v0, Lo90;->a:Lu80;

    .line 210
    .line 211
    if-eqz v0, :cond_7

    .line 212
    .line 213
    :goto_9
    if-eqz v0, :cond_b

    .line 214
    .line 215
    new-instance v1, Lo90;

    .line 216
    .line 217
    invoke-direct {v1, v0}, Lo90;-><init>(Lu80;)V

    .line 218
    .line 219
    .line 220
    goto :goto_d

    .line 221
    :cond_b
    invoke-static {}, Lj80;->a()V

    .line 222
    .line 223
    .line 224
    const-string v8, "LottieFetchResult close failed "

    .line 225
    .line 226
    invoke-static {}, Lj80;->a()V

    .line 227
    .line 228
    .line 229
    :try_start_5
    invoke-static {v3}, Lfr;->c(Ljava/lang/String;)Llx;

    .line 230
    .line 231
    .line 232
    move-result-object v7

    .line 233
    iget-object v0, v7, Llx;->g:Ljava/lang/Object;

    .line 234
    .line 235
    check-cast v0, Ljava/net/HttpURLConnection;
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_3
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 236
    .line 237
    const/4 v9, 0x0

    .line 238
    :try_start_6
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getResponseCode()I

    .line 239
    .line 240
    .line 241
    move-result v10

    .line 242
    div-int/lit8 v10, v10, 0x64
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_2
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_3
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 243
    .line 244
    if-ne v10, v4, :cond_c

    .line 245
    .line 246
    goto :goto_a

    .line 247
    :catch_2
    :cond_c
    move v5, v9

    .line 248
    :goto_a
    if-eqz v5, :cond_d

    .line 249
    .line 250
    :try_start_7
    invoke-virtual {v0}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    .line 251
    .line 252
    .line 253
    move-result-object v4

    .line 254
    invoke-virtual {v0}, Ljava/net/URLConnection;->getContentType()Ljava/lang/String;

    .line 255
    .line 256
    .line 257
    move-result-object v5

    .line 258
    invoke-virtual/range {v1 .. v6}, Lvg0;->j(Landroid/content/Context;Ljava/lang/String;Ljava/io/InputStream;Ljava/lang/String;Ljava/lang/String;)Lo90;

    .line 259
    .line 260
    .line 261
    move-result-object v1

    .line 262
    iget-object v0, v1, Lo90;->a:Lu80;

    .line 263
    .line 264
    invoke-static {}, Lj80;->a()V

    .line 265
    .line 266
    .line 267
    goto :goto_c

    .line 268
    :catchall_2
    move-exception v0

    .line 269
    move-object v1, v0

    .line 270
    goto :goto_e

    .line 271
    :catch_3
    move-exception v0

    .line 272
    goto :goto_b

    .line 273
    :cond_d
    new-instance v1, Lo90;

    .line 274
    .line 275
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 276
    .line 277
    invoke-virtual {v7}, Llx;->l()Ljava/lang/String;

    .line 278
    .line 279
    .line 280
    move-result-object v2

    .line 281
    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 282
    .line 283
    .line 284
    invoke-direct {v1, v0}, Lo90;-><init>(Ljava/lang/Throwable;)V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_3
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 285
    .line 286
    .line 287
    goto :goto_c

    .line 288
    :goto_b
    :try_start_8
    new-instance v1, Lo90;

    .line 289
    .line 290
    invoke-direct {v1, v0}, Lo90;-><init>(Ljava/lang/Throwable;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    .line 291
    .line 292
    .line 293
    if-eqz v7, :cond_e

    .line 294
    .line 295
    :goto_c
    :try_start_9
    invoke-virtual {v7}, Llx;->close()V
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_4

    .line 296
    .line 297
    .line 298
    goto :goto_d

    .line 299
    :catch_4
    move-exception v0

    .line 300
    invoke-static {v8, v0}, Lj80;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 301
    .line 302
    .line 303
    :cond_e
    :goto_d
    if-eqz v6, :cond_f

    .line 304
    .line 305
    iget-object v0, v1, Lo90;->a:Lu80;

    .line 306
    .line 307
    if-eqz v0, :cond_f

    .line 308
    .line 309
    sget-object v2, Lv80;->b:Lv80;

    .line 310
    .line 311
    iget-object v2, v2, Lv80;->a:Lt90;

    .line 312
    .line 313
    invoke-virtual {v2, v6, v0}, Lt90;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 314
    .line 315
    .line 316
    :cond_f
    return-object v1

    .line 317
    :goto_e
    if-eqz v7, :cond_10

    .line 318
    .line 319
    :try_start_a
    invoke-virtual {v7}, Llx;->close()V
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_5

    .line 320
    .line 321
    .line 322
    goto :goto_f

    .line 323
    :catch_5
    move-exception v0

    .line 324
    invoke-static {v8, v0}, Lj80;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 325
    .line 326
    .line 327
    :cond_10
    :goto_f
    throw v1

    .line 328
    nop

    .line 329
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
