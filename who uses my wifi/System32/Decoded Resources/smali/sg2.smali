.class public final Lsg2;
.super Landroid/webkit/WebViewClient;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lfd1;
.implements Lxp2;


# static fields
.field public static final synthetic M:I


# instance fields
.field public A:Lq82;

.field public B:Lsu1;

.field public C:Lo82;

.field public D:Lsb2;

.field public E:Lmv2;

.field public F:Z

.field public G:Z

.field public H:I

.field public I:Z

.field public final J:Ljava/util/HashSet;

.field public final K:Lpz2;

.field public L:Lmw;

.field public final f:Ljg2;

.field public final g:Lcx1;

.field public final h:Ljava/util/HashMap;

.field public final i:Ljava/lang/Object;

.field public j:Lfd1;

.field public k:Lye4;

.field public l:Lug2;

.field public m:Lvg2;

.field public n:Ll32;

.field public o:Lm32;

.field public p:Lxp2;

.field public q:Z

.field public r:Z

.field public s:I

.field public t:Ljava/lang/String;

.field public u:Ljava/lang/String;

.field public v:Z

.field public w:Z

.field public x:Z

.field public y:Z

.field public z:Lkf1;


# direct methods
.method public constructor <init>(Ljg2;Lcx1;ZLpz2;)V
    .locals 4

    .line 1
    new-instance v0, Lq82;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljg2;->a0()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    new-instance v2, Lsq0;

    .line 8
    .line 9
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    invoke-direct {v2, v3}, Lsq0;-><init>(Landroid/content/Context;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {v0, p1, v1, v2}, Lq82;-><init>(Ljg2;Landroid/content/Context;Lsq0;)V

    .line 17
    .line 18
    .line 19
    invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V

    .line 20
    .line 21
    .line 22
    new-instance v1, Ljava/util/HashMap;

    .line 23
    .line 24
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 25
    .line 26
    .line 27
    iput-object v1, p0, Lsg2;->h:Ljava/util/HashMap;

    .line 28
    .line 29
    new-instance v1, Ljava/lang/Object;

    .line 30
    .line 31
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 32
    .line 33
    .line 34
    iput-object v1, p0, Lsg2;->i:Ljava/lang/Object;

    .line 35
    .line 36
    const/4 v1, 0x0

    .line 37
    iput v1, p0, Lsg2;->s:I

    .line 38
    .line 39
    const-string v1, ""

    .line 40
    .line 41
    iput-object v1, p0, Lsg2;->t:Ljava/lang/String;

    .line 42
    .line 43
    iput-object v1, p0, Lsg2;->u:Ljava/lang/String;

    .line 44
    .line 45
    iput-object p2, p0, Lsg2;->g:Lcx1;

    .line 46
    .line 47
    iput-object p1, p0, Lsg2;->f:Ljg2;

    .line 48
    .line 49
    iput-boolean p3, p0, Lsg2;->v:Z

    .line 50
    .line 51
    iput-object v0, p0, Lsg2;->A:Lq82;

    .line 52
    .line 53
    const/4 p1, 0x0

    .line 54
    iput-object p1, p0, Lsg2;->C:Lo82;

    .line 55
    .line 56
    new-instance p1, Ljava/util/HashSet;

    .line 57
    .line 58
    sget-object p2, Lmz1;->d6:Liz1;

    .line 59
    .line 60
    sget-object p3, Ltw1;->e:Ltw1;

    .line 61
    .line 62
    iget-object p3, p3, Ltw1;->c:Lkz1;

    .line 63
    .line 64
    invoke-virtual {p3, p2}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object p2

    .line 68
    check-cast p2, Ljava/lang/String;

    .line 69
    .line 70
    const-string p3, ","

    .line 71
    .line 72
    invoke-virtual {p2, p3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object p2

    .line 76
    invoke-static {p2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 77
    .line 78
    .line 79
    move-result-object p2

    .line 80
    invoke-direct {p1, p2}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 81
    .line 82
    .line 83
    iput-object p1, p0, Lsg2;->J:Ljava/util/HashSet;

    .line 84
    .line 85
    iput-object p4, p0, Lsg2;->K:Lpz2;

    .line 86
    .line 87
    return-void
.end method

.method public static final J(Ljg2;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Ljg2;->f:Log2;

    .line 2
    .line 3
    iget-object p0, p0, Log2;->o:La83;

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, La83;->b()Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    const/4 p0, 0x1

    .line 14
    return p0

    .line 15
    :cond_0
    const/4 p0, 0x0

    .line 16
    return p0
.end method

.method public static final O(ZLjg2;)Z
    .locals 0

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    iget-object p0, p1, Ljg2;->f:Log2;

    .line 4
    .line 5
    invoke-virtual {p0}, Log2;->x()Lzq;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0}, Lzq;->b()Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    if-nez p0, :cond_0

    .line 14
    .line 15
    iget-object p0, p1, Ljg2;->f:Log2;

    .line 16
    .line 17
    invoke-virtual {p0}, Log2;->V()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    const-string p1, "interstitial_mb"

    .line 22
    .line 23
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    if-nez p0, :cond_0

    .line 28
    .line 29
    const/4 p0, 0x1

    .line 30
    return p0

    .line 31
    :cond_0
    const/4 p0, 0x0

    .line 32
    return p0
.end method

.method public static w()Landroid/webkit/WebResourceResponse;
    .locals 3

    .line 1
    sget-object v0, Lmz1;->S0:Liz1;

    .line 2
    .line 3
    sget-object v1, Ltw1;->e:Ltw1;

    .line 4
    .line 5
    iget-object v1, v1, Ltw1;->c:Lkz1;

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Ljava/lang/Boolean;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    new-instance v0, Landroid/webkit/WebResourceResponse;

    .line 20
    .line 21
    new-instance v1, Ljava/io/ByteArrayInputStream;

    .line 22
    .line 23
    const/4 v2, 0x0

    .line 24
    new-array v2, v2, [B

    .line 25
    .line 26
    invoke-direct {v1, v2}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 27
    .line 28
    .line 29
    const-string v2, ""

    .line 30
    .line 31
    invoke-direct {v0, v2, v2, v1}, Landroid/webkit/WebResourceResponse;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/io/InputStream;)V

    .line 32
    .line 33
    .line 34
    return-object v0

    .line 35
    :cond_0
    const/4 v0, 0x0

    .line 36
    return-object v0
.end method


# virtual methods
.method public final B(Ljava/lang/String;Ljava/util/Map;)Landroid/webkit/WebResourceResponse;
    .locals 17

    .line 1
    new-instance v0, Ljava/net/URL;

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const-string v1, "Unsupported scheme: "

    .line 9
    .line 10
    const-string v2, "Redirecting to "

    .line 11
    .line 12
    const/16 v3, 0x108

    .line 13
    .line 14
    :try_start_0
    invoke-static {v3}, Landroid/net/TrafficStats;->setThreadStatsTag(I)V

    .line 15
    .line 16
    .line 17
    const/4 v3, 0x0

    .line 18
    move v4, v3

    .line 19
    :goto_0
    const/4 v5, 0x1

    .line 20
    add-int/2addr v4, v5

    .line 21
    const/16 v6, 0x14

    .line 22
    .line 23
    if-gt v4, v6, :cond_e

    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    .line 26
    .line 27
    .line 28
    move-result-object v7

    .line 29
    const/16 v8, 0x2710

    .line 30
    .line 31
    invoke-virtual {v7, v8}, Ljava/net/URLConnection;->setConnectTimeout(I)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v7, v8}, Ljava/net/URLConnection;->setReadTimeout(I)V

    .line 35
    .line 36
    .line 37
    invoke-interface/range {p2 .. p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 38
    .line 39
    .line 40
    move-result-object v8

    .line 41
    invoke-interface {v8}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 42
    .line 43
    .line 44
    move-result-object v8

    .line 45
    :goto_1
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 46
    .line 47
    .line 48
    move-result v9

    .line 49
    if-eqz v9, :cond_0

    .line 50
    .line 51
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v9

    .line 55
    check-cast v9, Ljava/util/Map$Entry;

    .line 56
    .line 57
    invoke-interface {v9}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v10

    .line 61
    check-cast v10, Ljava/lang/String;

    .line 62
    .line 63
    invoke-interface {v9}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v9

    .line 67
    check-cast v9, Ljava/lang/String;

    .line 68
    .line 69
    invoke-virtual {v7, v10, v9}, Ljava/net/URLConnection;->addRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    goto :goto_1

    .line 73
    :catchall_0
    move-exception v0

    .line 74
    move-object/from16 v9, p0

    .line 75
    .line 76
    goto/16 :goto_8

    .line 77
    .line 78
    :cond_0
    instance-of v8, v7, Ljava/net/HttpURLConnection;

    .line 79
    .line 80
    if-eqz v8, :cond_d

    .line 81
    .line 82
    check-cast v7, Ljava/net/HttpURLConnection;

    .line 83
    .line 84
    sget-object v8, Lhg4;->C:Lhg4;

    .line 85
    .line 86
    iget-object v8, v8, Lhg4;->c:Llf4;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 87
    .line 88
    move-object/from16 v9, p0

    .line 89
    .line 90
    :try_start_1
    iget-object v10, v9, Lsg2;->f:Ljg2;

    .line 91
    .line 92
    invoke-virtual {v10}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 93
    .line 94
    .line 95
    move-result-object v11

    .line 96
    iget-object v10, v10, Ljg2;->f:Log2;

    .line 97
    .line 98
    iget-object v10, v10, Log2;->j:Le51;

    .line 99
    .line 100
    iget-object v10, v10, Le51;->f:Ljava/lang/String;

    .line 101
    .line 102
    const v12, 0xea60

    .line 103
    .line 104
    .line 105
    invoke-virtual {v8, v11, v10, v7, v12}, Llf4;->A(Landroid/content/Context;Ljava/lang/String;Ljava/net/HttpURLConnection;I)V

    .line 106
    .line 107
    .line 108
    new-instance v8, Lwb4;

    .line 109
    .line 110
    invoke-direct {v8}, Lwb4;-><init>()V

    .line 111
    .line 112
    .line 113
    const/4 v10, 0x0

    .line 114
    invoke-virtual {v8, v7, v10}, Lwb4;->a(Ljava/net/HttpURLConnection;[B)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v7}, Ljava/net/HttpURLConnection;->getResponseCode()I

    .line 118
    .line 119
    .line 120
    move-result v11

    .line 121
    invoke-virtual {v8, v7, v11}, Lwb4;->b(Ljava/net/HttpURLConnection;I)V

    .line 122
    .line 123
    .line 124
    const/16 v8, 0x12c

    .line 125
    .line 126
    if-lt v11, v8, :cond_5

    .line 127
    .line 128
    const/16 v8, 0x190

    .line 129
    .line 130
    if-ge v11, v8, :cond_5

    .line 131
    .line 132
    const-string v5, "Location"

    .line 133
    .line 134
    invoke-virtual {v7, v5}, Ljava/net/URLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v5

    .line 138
    if-eqz v5, :cond_4

    .line 139
    .line 140
    const-string v8, "tel:"

    .line 141
    .line 142
    invoke-virtual {v5, v8}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 143
    .line 144
    .line 145
    move-result v8

    .line 146
    if-eqz v8, :cond_1

    .line 147
    .line 148
    goto/16 :goto_7

    .line 149
    .line 150
    :cond_1
    new-instance v8, Ljava/net/URL;

    .line 151
    .line 152
    invoke-direct {v8, v0, v5}, Ljava/net/URL;-><init>(Ljava/net/URL;Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {v8}, Ljava/net/URL;->getProtocol()Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    if-nez v0, :cond_2

    .line 160
    .line 161
    const-string v0, "Protocol is null"

    .line 162
    .line 163
    invoke-static {v0}, Lgi2;->i0(Ljava/lang/String;)V

    .line 164
    .line 165
    .line 166
    invoke-static {}, Lsg2;->w()Landroid/webkit/WebResourceResponse;

    .line 167
    .line 168
    .line 169
    move-result-object v10

    .line 170
    goto/16 :goto_7

    .line 171
    .line 172
    :catchall_1
    move-exception v0

    .line 173
    goto/16 :goto_8

    .line 174
    .line 175
    :cond_2
    const-string v10, "http"

    .line 176
    .line 177
    invoke-virtual {v0, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 178
    .line 179
    .line 180
    move-result v10

    .line 181
    if-nez v10, :cond_3

    .line 182
    .line 183
    const-string v10, "https"

    .line 184
    .line 185
    invoke-virtual {v0, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 186
    .line 187
    .line 188
    move-result v10

    .line 189
    if-nez v10, :cond_3

    .line 190
    .line 191
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 192
    .line 193
    .line 194
    move-result v2

    .line 195
    add-int/2addr v2, v6

    .line 196
    new-instance v3, Ljava/lang/StringBuilder;

    .line 197
    .line 198
    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 199
    .line 200
    .line 201
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 202
    .line 203
    .line 204
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 205
    .line 206
    .line 207
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    move-result-object v0

    .line 211
    invoke-static {v0}, Lgi2;->i0(Ljava/lang/String;)V

    .line 212
    .line 213
    .line 214
    invoke-static {}, Lsg2;->w()Landroid/webkit/WebResourceResponse;

    .line 215
    .line 216
    .line 217
    move-result-object v10

    .line 218
    goto/16 :goto_7

    .line 219
    .line 220
    :cond_3
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 221
    .line 222
    .line 223
    move-result v0

    .line 224
    add-int/lit8 v0, v0, 0xf

    .line 225
    .line 226
    new-instance v6, Ljava/lang/StringBuilder;

    .line 227
    .line 228
    invoke-direct {v6, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 229
    .line 230
    .line 231
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 232
    .line 233
    .line 234
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 235
    .line 236
    .line 237
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 238
    .line 239
    .line 240
    move-result-object v0

    .line 241
    invoke-static {v0}, Lgi2;->U(Ljava/lang/String;)V

    .line 242
    .line 243
    .line 244
    invoke-virtual {v7}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 245
    .line 246
    .line 247
    move-object v0, v8

    .line 248
    goto/16 :goto_0

    .line 249
    .line 250
    :cond_4
    new-instance v0, Ljava/io/IOException;

    .line 251
    .line 252
    const-string v1, "Missing Location header in redirect"

    .line 253
    .line 254
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 255
    .line 256
    .line 257
    throw v0

    .line 258
    :cond_5
    invoke-virtual {v7}, Ljava/net/URLConnection;->getContentType()Ljava/lang/String;

    .line 259
    .line 260
    .line 261
    move-result-object v0

    .line 262
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 263
    .line 264
    .line 265
    move-result v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 266
    const-string v2, ";"

    .line 267
    .line 268
    const-string v4, ""

    .line 269
    .line 270
    if-eqz v1, :cond_6

    .line 271
    .line 272
    move-object v11, v4

    .line 273
    goto :goto_2

    .line 274
    :cond_6
    :try_start_2
    invoke-virtual {v0, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 275
    .line 276
    .line 277
    move-result-object v0

    .line 278
    aget-object v0, v0, v3

    .line 279
    .line 280
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 281
    .line 282
    .line 283
    move-result-object v0

    .line 284
    move-object v11, v0

    .line 285
    :goto_2
    invoke-virtual {v7}, Ljava/net/URLConnection;->getContentType()Ljava/lang/String;

    .line 286
    .line 287
    .line 288
    move-result-object v0

    .line 289
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 290
    .line 291
    .line 292
    move-result v1

    .line 293
    if-eqz v1, :cond_8

    .line 294
    .line 295
    :cond_7
    :goto_3
    move-object v12, v4

    .line 296
    goto :goto_5

    .line 297
    :cond_8
    invoke-virtual {v0, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 298
    .line 299
    .line 300
    move-result-object v0

    .line 301
    array-length v1, v0

    .line 302
    if-ne v1, v5, :cond_9

    .line 303
    .line 304
    goto :goto_3

    .line 305
    :cond_9
    move v1, v5

    .line 306
    :goto_4
    array-length v2, v0

    .line 307
    if-ge v1, v2, :cond_7

    .line 308
    .line 309
    aget-object v2, v0, v1

    .line 310
    .line 311
    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 312
    .line 313
    .line 314
    move-result-object v2

    .line 315
    const-string v6, "charset"

    .line 316
    .line 317
    invoke-virtual {v2, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 318
    .line 319
    .line 320
    move-result v2

    .line 321
    if-eqz v2, :cond_a

    .line 322
    .line 323
    aget-object v2, v0, v1

    .line 324
    .line 325
    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 326
    .line 327
    .line 328
    move-result-object v2

    .line 329
    const-string v6, "="

    .line 330
    .line 331
    invoke-virtual {v2, v6}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 332
    .line 333
    .line 334
    move-result-object v2

    .line 335
    array-length v6, v2

    .line 336
    if-le v6, v5, :cond_a

    .line 337
    .line 338
    aget-object v0, v2, v5

    .line 339
    .line 340
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 341
    .line 342
    .line 343
    move-result-object v4

    .line 344
    goto :goto_3

    .line 345
    :cond_a
    add-int/lit8 v1, v1, 0x1

    .line 346
    .line 347
    goto :goto_4

    .line 348
    :goto_5
    invoke-virtual {v7}, Ljava/net/URLConnection;->getHeaderFields()Ljava/util/Map;

    .line 349
    .line 350
    .line 351
    move-result-object v0

    .line 352
    new-instance v15, Ljava/util/HashMap;

    .line 353
    .line 354
    invoke-interface {v0}, Ljava/util/Map;->size()I

    .line 355
    .line 356
    .line 357
    move-result v1

    .line 358
    invoke-direct {v15, v1}, Ljava/util/HashMap;-><init>(I)V

    .line 359
    .line 360
    .line 361
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 362
    .line 363
    .line 364
    move-result-object v0

    .line 365
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 366
    .line 367
    .line 368
    move-result-object v0

    .line 369
    :cond_b
    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 370
    .line 371
    .line 372
    move-result v1

    .line 373
    if-eqz v1, :cond_c

    .line 374
    .line 375
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 376
    .line 377
    .line 378
    move-result-object v1

    .line 379
    check-cast v1, Ljava/util/Map$Entry;

    .line 380
    .line 381
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 382
    .line 383
    .line 384
    move-result-object v2

    .line 385
    if-eqz v2, :cond_b

    .line 386
    .line 387
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 388
    .line 389
    .line 390
    move-result-object v2

    .line 391
    if-eqz v2, :cond_b

    .line 392
    .line 393
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 394
    .line 395
    .line 396
    move-result-object v2

    .line 397
    check-cast v2, Ljava/util/List;

    .line 398
    .line 399
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 400
    .line 401
    .line 402
    move-result v2

    .line 403
    if-nez v2, :cond_b

    .line 404
    .line 405
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 406
    .line 407
    .line 408
    move-result-object v2

    .line 409
    check-cast v2, Ljava/lang/String;

    .line 410
    .line 411
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 412
    .line 413
    .line 414
    move-result-object v1

    .line 415
    check-cast v1, Ljava/util/List;

    .line 416
    .line 417
    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 418
    .line 419
    .line 420
    move-result-object v1

    .line 421
    check-cast v1, Ljava/lang/String;

    .line 422
    .line 423
    invoke-virtual {v15, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 424
    .line 425
    .line 426
    goto :goto_6

    .line 427
    :cond_c
    sget-object v0, Lhg4;->C:Lhg4;

    .line 428
    .line 429
    iget-object v0, v0, Lhg4;->f:Lnh4;

    .line 430
    .line 431
    invoke-virtual {v7}, Ljava/net/HttpURLConnection;->getResponseCode()I

    .line 432
    .line 433
    .line 434
    move-result v13

    .line 435
    invoke-virtual {v7}, Ljava/net/HttpURLConnection;->getResponseMessage()Ljava/lang/String;

    .line 436
    .line 437
    .line 438
    move-result-object v14

    .line 439
    invoke-virtual {v7}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    .line 440
    .line 441
    .line 442
    move-result-object v16

    .line 443
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 444
    .line 445
    .line 446
    new-instance v10, Landroid/webkit/WebResourceResponse;

    .line 447
    .line 448
    invoke-direct/range {v10 .. v16}, Landroid/webkit/WebResourceResponse;-><init>(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/util/Map;Ljava/io/InputStream;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 449
    .line 450
    .line 451
    :goto_7
    invoke-static {}, Landroid/net/TrafficStats;->clearThreadStatsTag()V

    .line 452
    .line 453
    .line 454
    return-object v10

    .line 455
    :cond_d
    move-object/from16 v9, p0

    .line 456
    .line 457
    :try_start_3
    new-instance v0, Ljava/io/IOException;

    .line 458
    .line 459
    const-string v1, "Invalid protocol."

    .line 460
    .line 461
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 462
    .line 463
    .line 464
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 465
    :cond_e
    move-object/from16 v9, p0

    .line 466
    .line 467
    invoke-static {}, Landroid/net/TrafficStats;->clearThreadStatsTag()V

    .line 468
    .line 469
    .line 470
    new-instance v0, Ljava/io/IOException;

    .line 471
    .line 472
    const-string v1, "Too many redirects (20)"

    .line 473
    .line 474
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 475
    .line 476
    .line 477
    throw v0

    .line 478
    :goto_8
    invoke-static {}, Landroid/net/TrafficStats;->clearThreadStatsTag()V

    .line 479
    .line 480
    .line 481
    throw v0
.end method

.method public final C()V
    .locals 1

    .line 1
    iget-object v0, p0, Lsg2;->j:Lfd1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lfd1;->C()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public final H(Ljava/util/Map;Ljava/util/List;Ljava/lang/String;)V
    .locals 5

    .line 1
    invoke-static {}, Lgi2;->R()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const-string v0, "Received GMSG: "

    .line 8
    .line 9
    invoke-virtual {v0, p3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p3

    .line 13
    invoke-static {p3}, Lgi2;->G(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-interface {p1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 17
    .line 18
    .line 19
    move-result-object p3

    .line 20
    invoke-interface {p3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object p3

    .line 24
    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-eqz v0, :cond_0

    .line 29
    .line 30
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    check-cast v0, Ljava/lang/String;

    .line 35
    .line 36
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    check-cast v1, Ljava/lang/String;

    .line 41
    .line 42
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    add-int/lit8 v2, v2, 0x4

    .line 55
    .line 56
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 57
    .line 58
    .line 59
    move-result v3

    .line 60
    new-instance v4, Ljava/lang/StringBuilder;

    .line 61
    .line 62
    add-int/2addr v2, v3

    .line 63
    invoke-direct {v4, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 64
    .line 65
    .line 66
    const-string v2, "  "

    .line 67
    .line 68
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    const-string v0, ": "

    .line 75
    .line 76
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    invoke-static {v0}, Lgi2;->G(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_0
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 91
    .line 92
    .line 93
    move-result-object p2

    .line 94
    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 95
    .line 96
    .line 97
    move-result p3

    .line 98
    if-eqz p3, :cond_1

    .line 99
    .line 100
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object p3

    .line 104
    check-cast p3, Ly32;

    .line 105
    .line 106
    iget-object v0, p0, Lsg2;->f:Ljg2;

    .line 107
    .line 108
    invoke-interface {p3, v0, p1}, Ly32;->c(Ljava/lang/Object;Ljava/util/Map;)V

    .line 109
    .line 110
    .line 111
    goto :goto_1

    .line 112
    :cond_1
    return-void
.end method

.method public final R(Lgj2;Ljz2;Leb3;)V
    .locals 3

    .line 1
    const-string v0, "/click"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lsg2;->c(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    if-eqz p2, :cond_0

    .line 7
    .line 8
    if-eqz p3, :cond_0

    .line 9
    .line 10
    iget-object v1, p0, Lsg2;->p:Lxp2;

    .line 11
    .line 12
    new-instance v2, Lcr2;

    .line 13
    .line 14
    invoke-direct {v2, v1, p1, p3, p2}, Lcr2;-><init>(Lxp2;Lgj2;Leb3;Ljz2;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, v0, v2}, Lsg2;->b(Ljava/lang/String;Ly32;)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    iget-object p2, p0, Lsg2;->p:Lxp2;

    .line 22
    .line 23
    sget-object p3, Lx32;->a:Lo32;

    .line 24
    .line 25
    new-instance p3, Lv32;

    .line 26
    .line 27
    const/4 v1, 0x0

    .line 28
    invoke-direct {p3, p2, p1, v1}, Lv32;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0, v0, p3}, Lsg2;->b(Ljava/lang/String;Ly32;)V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public final S(Lgj2;Ljz2;Lmv2;)V
    .locals 8

    .line 1
    const-string v0, "/open"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lsg2;->c(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v1, Li42;

    .line 7
    .line 8
    iget-object v2, p0, Lsg2;->B:Lsu1;

    .line 9
    .line 10
    iget-object v3, p0, Lsg2;->C:Lo82;

    .line 11
    .line 12
    const/4 v7, 0x0

    .line 13
    move-object v6, p1

    .line 14
    move-object v4, p2

    .line 15
    move-object v5, p3

    .line 16
    invoke-direct/range {v1 .. v7}, Li42;-><init>(Lsu1;Lo82;Ljz2;Lmv2;Lgj2;Lim2;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0, v0, v1}, Lsg2;->b(Ljava/lang/String;Ly32;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public final T()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lsg2;->i:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-boolean v1, p0, Lsg2;->w:Z

    .line 5
    .line 6
    monitor-exit v0

    .line 7
    return v1

    .line 8
    :catchall_0
    move-exception v1

    .line 9
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    throw v1
.end method

.method public final U()V
    .locals 4

    .line 1
    iget-object v0, p0, Lsg2;->D:Lsb2;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    iget-object v1, p0, Lsg2;->f:Ljg2;

    .line 6
    .line 7
    iget-object v2, v1, Ljg2;->f:Log2;

    .line 8
    .line 9
    sget-object v3, Le61;->a:Ljava/util/WeakHashMap;

    .line 10
    .line 11
    invoke-virtual {v2}, Landroid/view/View;->isAttachedToWindow()Z

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    if-eqz v3, :cond_0

    .line 16
    .line 17
    const/16 v1, 0xa

    .line 18
    .line 19
    invoke-virtual {p0, v2, v0, v1}, Lsg2;->s(Landroid/view/View;Lsb2;I)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    iget-object v2, p0, Lsg2;->L:Lmw;

    .line 24
    .line 25
    if-nez v2, :cond_1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    invoke-virtual {v1, v2}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 29
    .line 30
    .line 31
    :goto_0
    new-instance v2, Lmw;

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    invoke-direct {v2, p0, v0, v3}, Lmw;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 35
    .line 36
    .line 37
    iput-object v2, p0, Lsg2;->L:Lmw;

    .line 38
    .line 39
    invoke-virtual {v1, v2}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 40
    .line 41
    .line 42
    :cond_2
    return-void
.end method

.method public final U0()V
    .locals 1

    .line 1
    iget-object v0, p0, Lsg2;->p:Lxp2;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lxp2;->U0()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public final Y()V
    .locals 6

    .line 1
    iget-object v0, p0, Lsg2;->l:Lug2;

    .line 2
    .line 3
    iget-object v1, p0, Lsg2;->f:Ljg2;

    .line 4
    .line 5
    if-eqz v0, :cond_4

    .line 6
    .line 7
    iget-boolean v0, p0, Lsg2;->F:Z

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget v0, p0, Lsg2;->H:I

    .line 12
    .line 13
    if-lez v0, :cond_1

    .line 14
    .line 15
    :cond_0
    iget-boolean v0, p0, Lsg2;->G:Z

    .line 16
    .line 17
    if-nez v0, :cond_1

    .line 18
    .line 19
    iget-boolean v0, p0, Lsg2;->r:Z

    .line 20
    .line 21
    if-eqz v0, :cond_4

    .line 22
    .line 23
    :cond_1
    sget-object v0, Lmz1;->Y1:Liz1;

    .line 24
    .line 25
    sget-object v2, Ltw1;->e:Ltw1;

    .line 26
    .line 27
    iget-object v2, v2, Ltw1;->c:Lkz1;

    .line 28
    .line 29
    invoke-virtual {v2, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    check-cast v0, Ljava/lang/Boolean;

    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-eqz v0, :cond_2

    .line 40
    .line 41
    iget-object v0, v1, Ljg2;->f:Log2;

    .line 42
    .line 43
    iget-object v2, v0, Log2;->Q:Lvq2;

    .line 44
    .line 45
    if-eqz v2, :cond_2

    .line 46
    .line 47
    iget-object v2, v2, Lvq2;->h:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v2, Ltz1;

    .line 50
    .line 51
    iget-object v0, v0, Log2;->O:Lrz1;

    .line 52
    .line 53
    const-string v3, "awfllc"

    .line 54
    .line 55
    filled-new-array {v3}, [Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    invoke-static {v2, v0, v3}, Lpu1;->t(Ltz1;Lrz1;[Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    :cond_2
    iget-object v0, p0, Lsg2;->l:Lug2;

    .line 63
    .line 64
    iget-boolean v2, p0, Lsg2;->G:Z

    .line 65
    .line 66
    const/4 v3, 0x0

    .line 67
    if-nez v2, :cond_3

    .line 68
    .line 69
    iget-boolean v2, p0, Lsg2;->r:Z

    .line 70
    .line 71
    if-nez v2, :cond_3

    .line 72
    .line 73
    const/4 v3, 0x1

    .line 74
    :cond_3
    iget v2, p0, Lsg2;->s:I

    .line 75
    .line 76
    iget-object v4, p0, Lsg2;->t:Ljava/lang/String;

    .line 77
    .line 78
    iget-object v5, p0, Lsg2;->u:Ljava/lang/String;

    .line 79
    .line 80
    invoke-interface {v0, v4, v2, v5, v3}, Lug2;->v(Ljava/lang/String;ILjava/lang/String;Z)V

    .line 81
    .line 82
    .line 83
    const/4 v0, 0x0

    .line 84
    iput-object v0, p0, Lsg2;->l:Lug2;

    .line 85
    .line 86
    :cond_4
    iget-object v0, v1, Ljg2;->f:Log2;

    .line 87
    .line 88
    iget-object v1, v0, Log2;->P:Lrz1;

    .line 89
    .line 90
    if-nez v1, :cond_5

    .line 91
    .line 92
    iget-object v1, v0, Log2;->Q:Lvq2;

    .line 93
    .line 94
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    invoke-static {}, Ltz1;->d()Lrz1;

    .line 98
    .line 99
    .line 100
    move-result-object v2

    .line 101
    iput-object v2, v0, Log2;->P:Lrz1;

    .line 102
    .line 103
    iget-object v0, v1, Lvq2;->g:Ljava/lang/Object;

    .line 104
    .line 105
    check-cast v0, Ljava/util/HashMap;

    .line 106
    .line 107
    const-string v1, "native:view_load"

    .line 108
    .line 109
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    :cond_5
    return-void
.end method

.method public final a(Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lsg2;->C:Lo82;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    iget-object v3, v0, Lo82;->q:Ljava/lang/Object;

    .line 8
    .line 9
    monitor-enter v3

    .line 10
    :try_start_0
    iget-object v0, v0, Lo82;->x:Landroid/widget/PopupWindow;

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    move v1, v2

    .line 15
    :cond_0
    monitor-exit v3

    .line 16
    goto :goto_0

    .line 17
    :catchall_0
    move-exception p1

    .line 18
    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    throw p1

    .line 20
    :cond_1
    :goto_0
    sget-object v0, Lhg4;->C:Lhg4;

    .line 21
    .line 22
    iget-object v0, v0, Lhg4;->b:Ly24;

    .line 23
    .line 24
    iget-object v0, p0, Lsg2;->f:Ljg2;

    .line 25
    .line 26
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    xor-int/2addr v1, v2

    .line 31
    iget-object v2, p0, Lsg2;->E:Lmv2;

    .line 32
    .line 33
    invoke-static {v0, p1, v1, v2}, Ly24;->b(Landroid/content/Context;Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;ZLmv2;)V

    .line 34
    .line 35
    .line 36
    iget-object v0, p0, Lsg2;->D:Lsb2;

    .line 37
    .line 38
    if-eqz v0, :cond_3

    .line 39
    .line 40
    iget-object v1, p1, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->q:Ljava/lang/String;

    .line 41
    .line 42
    if-nez v1, :cond_2

    .line 43
    .line 44
    iget-object p1, p1, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->f:Lfc2;

    .line 45
    .line 46
    if-eqz p1, :cond_2

    .line 47
    .line 48
    iget-object v1, p1, Lfc2;->g:Ljava/lang/String;

    .line 49
    .line 50
    :cond_2
    check-cast v0, Lqb2;

    .line 51
    .line 52
    invoke-virtual {v0, v1}, Lqb2;->a(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    :cond_3
    return-void
.end method

.method public final b(Ljava/lang/String;Ly32;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lsg2;->i:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lsg2;->h:Ljava/util/HashMap;

    .line 5
    .line 6
    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    check-cast v2, Ljava/util/List;

    .line 11
    .line 12
    if-nez v2, :cond_0

    .line 13
    .line 14
    new-instance v2, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 15
    .line 16
    invoke-direct {v2}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1, p1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :catchall_0
    move-exception p1

    .line 24
    goto :goto_1

    .line 25
    :cond_0
    :goto_0
    invoke-interface {v2, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    monitor-exit v0

    .line 29
    return-void

    .line 30
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 31
    throw p1
.end method

.method public final c(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lsg2;->i:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lsg2;->h:Ljava/util/HashMap;

    .line 5
    .line 6
    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    check-cast p1, Ljava/util/List;

    .line 11
    .line 12
    if-nez p1, :cond_0

    .line 13
    .line 14
    monitor-exit v0

    .line 15
    return-void

    .line 16
    :catchall_0
    move-exception p1

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->clear()V

    .line 19
    .line 20
    .line 21
    monitor-exit v0

    .line 22
    return-void

    .line 23
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    throw p1
.end method

.method public final d0(Lfc2;ZZLjava/lang/String;)V
    .locals 9

    .line 1
    iget-object v6, p0, Lsg2;->f:Ljg2;

    .line 2
    .line 3
    iget-object v0, v6, Ljg2;->f:Log2;

    .line 4
    .line 5
    invoke-virtual {v0}, Log2;->Y0()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    invoke-static {v0, v6}, Lsg2;->O(ZLjg2;)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    const/4 v2, 0x0

    .line 14
    const/4 v3, 0x1

    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    if-eqz p3, :cond_1

    .line 18
    .line 19
    :cond_0
    move p3, v3

    .line 20
    goto :goto_0

    .line 21
    :cond_1
    move p3, v2

    .line 22
    :goto_0
    if-nez p3, :cond_2

    .line 23
    .line 24
    if-nez p2, :cond_3

    .line 25
    .line 26
    :cond_2
    move p2, v0

    .line 27
    move v2, v3

    .line 28
    goto :goto_1

    .line 29
    :cond_3
    move p2, v0

    .line 30
    :goto_1
    new-instance v0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    .line 31
    .line 32
    const/4 v1, 0x0

    .line 33
    if-eqz p3, :cond_4

    .line 34
    .line 35
    move-object p3, v1

    .line 36
    goto :goto_2

    .line 37
    :cond_4
    iget-object p3, p0, Lsg2;->j:Lfd1;

    .line 38
    .line 39
    :goto_2
    if-eqz p2, :cond_5

    .line 40
    .line 41
    move-object v3, v1

    .line 42
    goto :goto_3

    .line 43
    :cond_5
    iget-object p2, p0, Lsg2;->k:Lye4;

    .line 44
    .line 45
    move-object v3, p2

    .line 46
    :goto_3
    iget-object v4, p0, Lsg2;->z:Lkf1;

    .line 47
    .line 48
    iget-object p2, v6, Ljg2;->f:Log2;

    .line 49
    .line 50
    iget-object v5, p2, Log2;->j:Le51;

    .line 51
    .line 52
    if-eqz v2, :cond_6

    .line 53
    .line 54
    :goto_4
    move-object v2, p3

    .line 55
    move-object v8, p4

    .line 56
    move-object v7, v1

    .line 57
    move-object v1, p1

    .line 58
    goto :goto_5

    .line 59
    :cond_6
    iget-object v1, p0, Lsg2;->p:Lxp2;

    .line 60
    .line 61
    goto :goto_4

    .line 62
    :goto_5
    invoke-direct/range {v0 .. v8}, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;-><init>(Lfc2;Lfd1;Lye4;Lkf1;Le51;Ljg2;Lxp2;Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p0, v0}, Lsg2;->a(Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;)V

    .line 66
    .line 67
    .line 68
    return-void
.end method

.method public final e()V
    .locals 9

    .line 1
    iget-object v0, p0, Lsg2;->D:Lsb2;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    check-cast v0, Lqb2;

    .line 7
    .line 8
    iget-object v2, v0, Lqb2;->h:Ljava/lang/Object;

    .line 9
    .line 10
    monitor-enter v2

    .line 11
    :try_start_0
    iget-object v3, v0, Lqb2;->b:Ljava/util/LinkedHashMap;

    .line 12
    .line 13
    invoke-virtual {v3}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    .line 14
    .line 15
    .line 16
    sget-object v3, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 17
    .line 18
    invoke-static {v3}, Lpu1;->r(Ljava/lang/Object;)Llq3;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    new-instance v4, Lu42;

    .line 23
    .line 24
    const/4 v5, 0x1

    .line 25
    invoke-direct {v4, v5, v0}, Lu42;-><init>(ILjava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    sget-object v5, Lmd2;->g:Lld2;

    .line 29
    .line 30
    invoke-static {v3, v4, v5}, Lpu1;->O(Ln70;Lyp3;Ljava/util/concurrent/Executor;)Lqp3;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    sget-object v4, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 35
    .line 36
    sget-object v6, Lmd2;->d:Lkd2;

    .line 37
    .line 38
    const-wide/16 v7, 0xa

    .line 39
    .line 40
    invoke-static {v3, v7, v8, v4, v6}, Lpu1;->N(Ln70;JLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/ScheduledExecutorService;)Ln70;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    new-instance v6, Lz71;

    .line 45
    .line 46
    invoke-direct {v6, v0, v4}, Lz71;-><init>(Lqb2;Ln70;)V

    .line 47
    .line 48
    .line 49
    new-instance v0, Ljq3;

    .line 50
    .line 51
    const/4 v7, 0x0

    .line 52
    invoke-direct {v0, v3, v6, v7}, Ljq3;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v3, v0, v5}, Lgp3;->c(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 56
    .line 57
    .line 58
    sget-object v0, Lqb2;->l:Ljava/util/List;

    .line 59
    .line 60
    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 64
    iput-object v1, p0, Lsg2;->D:Lsb2;

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :catchall_0
    move-exception v0

    .line 68
    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 69
    throw v0

    .line 70
    :cond_0
    :goto_0
    iget-object v0, p0, Lsg2;->L:Lmw;

    .line 71
    .line 72
    if-nez v0, :cond_1

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_1
    iget-object v2, p0, Lsg2;->f:Ljg2;

    .line 76
    .line 77
    invoke-virtual {v2, v0}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 78
    .line 79
    .line 80
    :goto_1
    iget-object v0, p0, Lsg2;->i:Ljava/lang/Object;

    .line 81
    .line 82
    monitor-enter v0

    .line 83
    :try_start_2
    iget-object v2, p0, Lsg2;->h:Ljava/util/HashMap;

    .line 84
    .line 85
    invoke-virtual {v2}, Ljava/util/HashMap;->clear()V

    .line 86
    .line 87
    .line 88
    iput-object v1, p0, Lsg2;->j:Lfd1;

    .line 89
    .line 90
    iput-object v1, p0, Lsg2;->k:Lye4;

    .line 91
    .line 92
    iput-object v1, p0, Lsg2;->l:Lug2;

    .line 93
    .line 94
    iput-object v1, p0, Lsg2;->m:Lvg2;

    .line 95
    .line 96
    iput-object v1, p0, Lsg2;->n:Ll32;

    .line 97
    .line 98
    iput-object v1, p0, Lsg2;->o:Lm32;

    .line 99
    .line 100
    const/4 v2, 0x0

    .line 101
    iput-boolean v2, p0, Lsg2;->q:Z

    .line 102
    .line 103
    iput-boolean v2, p0, Lsg2;->v:Z

    .line 104
    .line 105
    iput-boolean v2, p0, Lsg2;->w:Z

    .line 106
    .line 107
    iput-boolean v2, p0, Lsg2;->x:Z

    .line 108
    .line 109
    iput-object v1, p0, Lsg2;->z:Lkf1;

    .line 110
    .line 111
    iput-object v1, p0, Lsg2;->B:Lsu1;

    .line 112
    .line 113
    iput-object v1, p0, Lsg2;->A:Lq82;

    .line 114
    .line 115
    iget-object v2, p0, Lsg2;->C:Lo82;

    .line 116
    .line 117
    if-eqz v2, :cond_2

    .line 118
    .line 119
    const/4 v3, 0x1

    .line 120
    invoke-virtual {v2, v3}, Lo82;->K(Z)V

    .line 121
    .line 122
    .line 123
    iput-object v1, p0, Lsg2;->C:Lo82;

    .line 124
    .line 125
    goto :goto_2

    .line 126
    :catchall_1
    move-exception v1

    .line 127
    goto :goto_3

    .line 128
    :cond_2
    :goto_2
    monitor-exit v0

    .line 129
    return-void

    .line 130
    :goto_3
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 131
    throw v1
.end method

.method public final h(Ljava/lang/String;Ljava/util/Map;)Landroid/webkit/WebResourceResponse;
    .locals 23

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v6, p1

    .line 4
    .line 5
    const-string v2, "AdWebViewClient.interceptRequest.gcache"

    .line 6
    .line 7
    const-string v0, "X-Afma-Gcache-CachedBytes"

    .line 8
    .line 9
    const-string v3, "X-Afma-Gcache-IsDownloaded"

    .line 10
    .line 11
    const-string v4, "X-Afma-Gcache-IsGcacheHit"

    .line 12
    .line 13
    const-string v5, "X-Afma-Gcache-HasAdditionalMetadataFromReadV2"

    .line 14
    .line 15
    const-string v7, "range"

    .line 16
    .line 17
    const-string v8, "ms"

    .line 18
    .line 19
    const-string v9, "Cache connection took "

    .line 20
    .line 21
    :try_start_0
    new-instance v10, Ljava/util/HashMap;

    .line 22
    .line 23
    invoke-direct {v10}, Ljava/util/HashMap;-><init>()V

    .line 24
    .line 25
    .line 26
    iget-object v11, v1, Lsg2;->f:Ljg2;

    .line 27
    .line 28
    iget-object v12, v11, Ljg2;->f:Log2;

    .line 29
    .line 30
    iget-object v12, v12, Log2;->o:La83;

    .line 31
    .line 32
    if-eqz v12, :cond_0

    .line 33
    .line 34
    iget-object v10, v12, La83;->w0:Ljava/util/HashMap;

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :catch_0
    move-exception v0

    .line 38
    goto/16 :goto_17

    .line 39
    .line 40
    :catch_1
    move-exception v0

    .line 41
    goto/16 :goto_17

    .line 42
    .line 43
    :cond_0
    :goto_0
    invoke-virtual {v11}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 44
    .line 45
    .line 46
    move-result-object v12

    .line 47
    iget-boolean v13, v1, Lsg2;->I:Z

    .line 48
    .line 49
    invoke-static {v6, v12, v13, v10}, Lm54;->E(Ljava/lang/String;Landroid/content/Context;ZLjava/util/HashMap;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v10

    .line 53
    invoke-virtual {v10, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v12

    .line 57
    if-nez v12, :cond_1

    .line 58
    .line 59
    move-object/from16 v12, p2

    .line 60
    .line 61
    invoke-virtual {v1, v10, v12}, Lsg2;->B(Ljava/lang/String;Ljava/util/Map;)Landroid/webkit/WebResourceResponse;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    return-object v0

    .line 66
    :cond_1
    move-object/from16 v12, p2

    .line 67
    .line 68
    invoke-static {v6}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 69
    .line 70
    .line 71
    move-result-object v10

    .line 72
    invoke-static {v10}, Lww1;->a(Landroid/net/Uri;)Lww1;

    .line 73
    .line 74
    .line 75
    move-result-object v10

    .line 76
    if-eqz v10, :cond_c

    .line 77
    .line 78
    new-instance v14, Ljava/util/HashMap;

    .line 79
    .line 80
    invoke-direct {v14}, Ljava/util/HashMap;-><init>()V

    .line 81
    .line 82
    .line 83
    const-string v15, "Access-Control-Allow-Origin"

    .line 84
    .line 85
    const/16 v16, 0x0

    .line 86
    .line 87
    const-string v13, "*"

    .line 88
    .line 89
    invoke-virtual {v14, v15, v13}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    invoke-static {v6}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 93
    .line 94
    .line 95
    move-result-object v13

    .line 96
    invoke-virtual {v13}, Landroid/net/Uri;->getQueryParameterNames()Ljava/util/Set;

    .line 97
    .line 98
    .line 99
    move-result-object v15

    .line 100
    invoke-interface {v15, v7}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    move-result v15

    .line 104
    if-eqz v15, :cond_3

    .line 105
    .line 106
    new-instance v15, Lyk3;

    .line 107
    .line 108
    const/16 v6, 0x2d

    .line 109
    .line 110
    invoke-direct {v15, v6}, Lyk3;-><init>(C)V

    .line 111
    .line 112
    .line 113
    invoke-static {v15}, Lsq0;->p(Lyk3;)Lsq0;

    .line 114
    .line 115
    .line 116
    move-result-object v6

    .line 117
    invoke-virtual {v13, v7}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v7

    .line 121
    invoke-virtual {v6, v7}, Lsq0;->v(Ljava/lang/CharSequence;)Ljava/util/List;

    .line 122
    .line 123
    .line 124
    move-result-object v6

    .line 125
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 126
    .line 127
    .line 128
    move-result v7

    .line 129
    const/4 v13, 0x2

    .line 130
    if-ne v7, v13, :cond_3

    .line 131
    .line 132
    const/4 v7, 0x0

    .line 133
    invoke-interface {v6, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v13

    .line 137
    check-cast v13, Ljava/lang/String;

    .line 138
    .line 139
    invoke-static {v13}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 140
    .line 141
    .line 142
    move-result v13

    .line 143
    const/4 v15, 0x1

    .line 144
    invoke-interface {v6, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v6

    .line 148
    check-cast v6, Ljava/lang/String;

    .line 149
    .line 150
    invoke-static {v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 151
    .line 152
    .line 153
    move-result v6

    .line 154
    add-int/2addr v6, v15

    .line 155
    if-lez v13, :cond_2

    .line 156
    .line 157
    move-object v15, v8

    .line 158
    int-to-long v7, v13

    .line 159
    iput-wide v7, v10, Lww1;->m:J

    .line 160
    .line 161
    goto :goto_1

    .line 162
    :cond_2
    move-object v15, v8

    .line 163
    :goto_1
    sub-int/2addr v6, v13

    .line 164
    goto :goto_2

    .line 165
    :cond_3
    move-object v15, v8

    .line 166
    const/4 v6, -0x1

    .line 167
    :goto_2
    sget-object v7, Lmz1;->J4:Liz1;

    .line 168
    .line 169
    sget-object v8, Ltw1;->e:Ltw1;

    .line 170
    .line 171
    iget-object v13, v8, Ltw1;->c:Lkz1;

    .line 172
    .line 173
    invoke-virtual {v13, v7}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v7

    .line 177
    check-cast v7, Ljava/lang/Boolean;

    .line 178
    .line 179
    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    .line 180
    .line 181
    .line 182
    move-result v7

    .line 183
    if-eqz v7, :cond_a

    .line 184
    .line 185
    iget-object v7, v11, Ljg2;->f:Log2;

    .line 186
    .line 187
    invoke-virtual {v7}, Log2;->o()Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object v7

    .line 191
    if-nez v7, :cond_4

    .line 192
    .line 193
    const-string v7, ""

    .line 194
    .line 195
    :cond_4
    iput-object v7, v10, Lww1;->n:Ljava/lang/String;

    .line 196
    .line 197
    iget-object v7, v11, Ljg2;->f:Log2;

    .line 198
    .line 199
    invoke-virtual {v7}, Log2;->q()I

    .line 200
    .line 201
    .line 202
    move-result v7

    .line 203
    iput v7, v10, Lww1;->o:I

    .line 204
    .line 205
    iget-boolean v7, v10, Lww1;->l:Z

    .line 206
    .line 207
    if-eqz v7, :cond_5

    .line 208
    .line 209
    sget-object v7, Lmz1;->L4:Liz1;

    .line 210
    .line 211
    iget-object v8, v8, Ltw1;->c:Lkz1;

    .line 212
    .line 213
    invoke-virtual {v8, v7}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object v7

    .line 217
    check-cast v7, Ljava/lang/Long;

    .line 218
    .line 219
    goto :goto_3

    .line 220
    :cond_5
    sget-object v7, Lmz1;->K4:Liz1;

    .line 221
    .line 222
    iget-object v8, v8, Ltw1;->c:Lkz1;

    .line 223
    .line 224
    invoke-virtual {v8, v7}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object v7

    .line 228
    check-cast v7, Ljava/lang/Long;

    .line 229
    .line 230
    :goto_3
    invoke-virtual {v7}, Ljava/lang/Long;->longValue()J

    .line 231
    .line 232
    .line 233
    move-result-wide v7

    .line 234
    sget-object v13, Lhg4;->C:Lhg4;

    .line 235
    .line 236
    move-object/from16 v20, v11

    .line 237
    .line 238
    iget-object v11, v13, Lhg4;->k:Lym;

    .line 239
    .line 240
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 241
    .line 242
    .line 243
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 244
    .line 245
    .line 246
    move-result-wide v21

    .line 247
    invoke-virtual/range {v20 .. v20}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 248
    .line 249
    .line 250
    move-result-object v11

    .line 251
    invoke-static {v11, v10}, Lus0;->n(Landroid/content/Context;Lww1;)Lyw1;

    .line 252
    .line 253
    .line 254
    move-result-object v10
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/NoClassDefFoundError; {:try_start_0 .. :try_end_0} :catch_0

    .line 255
    :try_start_1
    sget-object v11, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 256
    .line 257
    iget-object v12, v10, Lpd2;->f:Lwq3;

    .line 258
    .line 259
    invoke-virtual {v12, v7, v8, v11}, Lgp3;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    .line 260
    .line 261
    .line 262
    move-result-object v7

    .line 263
    check-cast v7, Lax1;
    :try_end_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_1 .. :try_end_1} :catch_a
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_1 .. :try_end_1} :catch_9
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_8
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 264
    .line 265
    :try_start_2
    iget-boolean v8, v7, Lax1;->b:Z

    .line 266
    .line 267
    invoke-static {v8}, Ljava/lang/Boolean;->toString(Z)Ljava/lang/String;

    .line 268
    .line 269
    .line 270
    move-result-object v8

    .line 271
    invoke-virtual {v14, v5, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 272
    .line 273
    .line 274
    iget-boolean v5, v7, Lax1;->c:Z

    .line 275
    .line 276
    invoke-static {v5}, Ljava/lang/Boolean;->toString(Z)Ljava/lang/String;

    .line 277
    .line 278
    .line 279
    move-result-object v5

    .line 280
    invoke-virtual {v14, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 281
    .line 282
    .line 283
    iget-boolean v4, v7, Lax1;->e:Z

    .line 284
    .line 285
    invoke-static {v4}, Ljava/lang/Boolean;->toString(Z)Ljava/lang/String;

    .line 286
    .line 287
    .line 288
    move-result-object v4

    .line 289
    invoke-virtual {v14, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 290
    .line 291
    .line 292
    iget-wide v3, v7, Lax1;->d:J

    .line 293
    .line 294
    invoke-static {v3, v4}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    .line 295
    .line 296
    .line 297
    move-result-object v3

    .line 298
    invoke-virtual {v14, v0, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 299
    .line 300
    .line 301
    iget-object v3, v7, Lax1;->a:Lzw1;
    :try_end_2
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_2 .. :try_end_2} :catch_7
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_2 .. :try_end_2} :catch_6
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_5
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 302
    .line 303
    const/4 v0, -0x1

    .line 304
    if-eq v6, v0, :cond_6

    .line 305
    .line 306
    int-to-long v4, v6

    .line 307
    :try_start_3
    sget v0, Lmo3;->a:I

    .line 308
    .line 309
    new-instance v0, Luo1;

    .line 310
    .line 311
    invoke-direct {v0, v3, v4, v5}, Luo1;-><init>(Ljava/io/InputStream;J)V
    :try_end_3
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_3 .. :try_end_3} :catch_3
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_3 .. :try_end_3} :catch_2
    .catch Ljava/lang/InterruptedException; {:try_start_3 .. :try_end_3} :catch_4
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 312
    .line 313
    .line 314
    move-object v3, v0

    .line 315
    goto :goto_7

    .line 316
    :catch_2
    move-exception v0

    .line 317
    goto :goto_5

    .line 318
    :catch_3
    move-exception v0

    .line 319
    goto :goto_5

    .line 320
    :catch_4
    move-exception v0

    .line 321
    move-object v6, v3

    .line 322
    :goto_4
    const/16 v18, 0x1

    .line 323
    .line 324
    goto/16 :goto_d

    .line 325
    .line 326
    :goto_5
    move-object v6, v3

    .line 327
    :goto_6
    const/16 v18, 0x1

    .line 328
    .line 329
    goto/16 :goto_13

    .line 330
    .line 331
    :cond_6
    :goto_7
    :try_start_4
    iget-object v0, v13, Lhg4;->k:Lym;

    .line 332
    .line 333
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 334
    .line 335
    .line 336
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 337
    .line 338
    .line 339
    move-result-wide v4

    .line 340
    sub-long v4, v4, v21

    .line 341
    .line 342
    sget-object v0, Llf4;->l:Li63;

    .line 343
    .line 344
    new-instance v2, Ldg2;

    .line 345
    .line 346
    invoke-direct {v2, v1, v4, v5}, Ldg2;-><init>(Lsg2;J)V

    .line 347
    .line 348
    .line 349
    invoke-virtual {v0, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 350
    .line 351
    .line 352
    invoke-static {v4, v5}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 353
    .line 354
    .line 355
    move-result-object v0

    .line 356
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 357
    .line 358
    .line 359
    move-result v0

    .line 360
    add-int/lit8 v0, v0, 0x18

    .line 361
    .line 362
    new-instance v2, Ljava/lang/StringBuilder;

    .line 363
    .line 364
    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 365
    .line 366
    .line 367
    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 368
    .line 369
    .line 370
    invoke-virtual {v2, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 371
    .line 372
    .line 373
    invoke-virtual {v2, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 374
    .line 375
    .line 376
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 377
    .line 378
    .line 379
    move-result-object v0

    .line 380
    invoke-static {v0}, Lgi2;->G(Ljava/lang/String;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/lang/NoClassDefFoundError; {:try_start_4 .. :try_end_4} :catch_0

    .line 381
    .line 382
    .line 383
    :cond_7
    move-object/from16 v20, v3

    .line 384
    .line 385
    goto/16 :goto_16

    .line 386
    .line 387
    :catchall_0
    move-exception v0

    .line 388
    goto :goto_8

    .line 389
    :catch_5
    move-exception v0

    .line 390
    goto :goto_9

    .line 391
    :catch_6
    move-exception v0

    .line 392
    goto :goto_a

    .line 393
    :catch_7
    move-exception v0

    .line 394
    goto :goto_a

    .line 395
    :goto_8
    move-object v6, v0

    .line 396
    const/4 v2, 0x1

    .line 397
    goto/16 :goto_15

    .line 398
    .line 399
    :goto_9
    move-object/from16 v6, v16

    .line 400
    .line 401
    goto :goto_4

    .line 402
    :goto_a
    move-object/from16 v6, v16

    .line 403
    .line 404
    goto :goto_6

    .line 405
    :catchall_1
    move-exception v0

    .line 406
    goto :goto_b

    .line 407
    :catch_8
    move-exception v0

    .line 408
    goto :goto_c

    .line 409
    :catch_9
    move-exception v0

    .line 410
    goto/16 :goto_12

    .line 411
    .line 412
    :catch_a
    move-exception v0

    .line 413
    goto/16 :goto_12

    .line 414
    .line 415
    :goto_b
    move-object v6, v0

    .line 416
    const/4 v2, 0x0

    .line 417
    goto/16 :goto_15

    .line 418
    .line 419
    :goto_c
    move-object/from16 v6, v16

    .line 420
    .line 421
    const/16 v18, 0x0

    .line 422
    .line 423
    :goto_d
    :try_start_5
    sget-object v3, Lmz1;->O4:Liz1;

    .line 424
    .line 425
    sget-object v4, Ltw1;->e:Ltw1;

    .line 426
    .line 427
    iget-object v4, v4, Ltw1;->c:Lkz1;

    .line 428
    .line 429
    invoke-virtual {v4, v3}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 430
    .line 431
    .line 432
    move-result-object v3

    .line 433
    check-cast v3, Ljava/lang/Boolean;

    .line 434
    .line 435
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 436
    .line 437
    .line 438
    move-result v3

    .line 439
    if-eqz v3, :cond_8

    .line 440
    .line 441
    sget-object v3, Lhg4;->C:Lhg4;

    .line 442
    .line 443
    iget-object v3, v3, Lhg4;->h:Lgd2;

    .line 444
    .line 445
    invoke-virtual {v3, v2, v0}, Lgd2;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 446
    .line 447
    .line 448
    :cond_8
    const/4 v2, 0x1

    .line 449
    goto :goto_f

    .line 450
    :catchall_2
    move-exception v0

    .line 451
    :goto_e
    move/from16 v2, v18

    .line 452
    .line 453
    goto :goto_11

    .line 454
    :goto_f
    invoke-virtual {v10, v2}, Lyw1;->cancel(Z)Z

    .line 455
    .line 456
    .line 457
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 458
    .line 459
    .line 460
    move-result-object v0

    .line 461
    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 462
    .line 463
    .line 464
    :try_start_6
    sget-object v0, Lhg4;->C:Lhg4;

    .line 465
    .line 466
    iget-object v0, v0, Lhg4;->k:Lym;

    .line 467
    .line 468
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 469
    .line 470
    .line 471
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 472
    .line 473
    .line 474
    move-result-wide v2

    .line 475
    sub-long v3, v2, v21

    .line 476
    .line 477
    sget-object v7, Llf4;->l:Li63;

    .line 478
    .line 479
    new-instance v0, Leg2;

    .line 480
    .line 481
    const/4 v5, 0x1

    .line 482
    move/from16 v2, v18

    .line 483
    .line 484
    invoke-direct/range {v0 .. v5}, Leg2;-><init>(Lsg2;ZJI)V

    .line 485
    .line 486
    .line 487
    invoke-virtual {v7, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 488
    .line 489
    .line 490
    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 491
    .line 492
    .line 493
    move-result-object v0

    .line 494
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 495
    .line 496
    .line 497
    move-result v0

    .line 498
    add-int/lit8 v0, v0, 0x18

    .line 499
    .line 500
    new-instance v1, Ljava/lang/StringBuilder;

    .line 501
    .line 502
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 503
    .line 504
    .line 505
    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 506
    .line 507
    .line 508
    invoke-virtual {v1, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 509
    .line 510
    .line 511
    invoke-virtual {v1, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 512
    .line 513
    .line 514
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 515
    .line 516
    .line 517
    move-result-object v0

    .line 518
    :goto_10
    invoke-static {v0}, Lgi2;->G(Ljava/lang/String;)V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_1
    .catch Ljava/lang/NoClassDefFoundError; {:try_start_6 .. :try_end_6} :catch_0

    .line 519
    .line 520
    .line 521
    move-object/from16 v20, v6

    .line 522
    .line 523
    goto/16 :goto_16

    .line 524
    .line 525
    :goto_11
    move-object v6, v0

    .line 526
    goto :goto_15

    .line 527
    :goto_12
    move-object/from16 v6, v16

    .line 528
    .line 529
    const/16 v18, 0x0

    .line 530
    .line 531
    :goto_13
    :try_start_7
    sget-object v1, Lmz1;->O4:Liz1;

    .line 532
    .line 533
    sget-object v3, Ltw1;->e:Ltw1;

    .line 534
    .line 535
    iget-object v3, v3, Ltw1;->c:Lkz1;

    .line 536
    .line 537
    invoke-virtual {v3, v1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 538
    .line 539
    .line 540
    move-result-object v1

    .line 541
    check-cast v1, Ljava/lang/Boolean;

    .line 542
    .line 543
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 544
    .line 545
    .line 546
    move-result v1

    .line 547
    if-eqz v1, :cond_9

    .line 548
    .line 549
    sget-object v1, Lhg4;->C:Lhg4;

    .line 550
    .line 551
    iget-object v1, v1, Lhg4;->h:Lgd2;

    .line 552
    .line 553
    invoke-virtual {v1, v2, v0}, Lgd2;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 554
    .line 555
    .line 556
    :cond_9
    const/4 v2, 0x1

    .line 557
    goto :goto_14

    .line 558
    :catchall_3
    move-exception v0

    .line 559
    goto :goto_e

    .line 560
    :goto_14
    invoke-virtual {v10, v2}, Lyw1;->cancel(Z)Z
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 561
    .line 562
    .line 563
    :try_start_8
    sget-object v0, Lhg4;->C:Lhg4;

    .line 564
    .line 565
    iget-object v0, v0, Lhg4;->k:Lym;

    .line 566
    .line 567
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 568
    .line 569
    .line 570
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 571
    .line 572
    .line 573
    move-result-wide v0

    .line 574
    sub-long v3, v0, v21

    .line 575
    .line 576
    sget-object v7, Llf4;->l:Li63;

    .line 577
    .line 578
    new-instance v0, Leg2;

    .line 579
    .line 580
    const/4 v5, 0x0

    .line 581
    move-object/from16 v1, p0

    .line 582
    .line 583
    move/from16 v2, v18

    .line 584
    .line 585
    invoke-direct/range {v0 .. v5}, Leg2;-><init>(Lsg2;ZJI)V

    .line 586
    .line 587
    .line 588
    invoke-virtual {v7, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 589
    .line 590
    .line 591
    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 592
    .line 593
    .line 594
    move-result-object v0

    .line 595
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 596
    .line 597
    .line 598
    move-result v0

    .line 599
    add-int/lit8 v0, v0, 0x18

    .line 600
    .line 601
    new-instance v1, Ljava/lang/StringBuilder;

    .line 602
    .line 603
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 604
    .line 605
    .line 606
    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 607
    .line 608
    .line 609
    invoke-virtual {v1, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 610
    .line 611
    .line 612
    invoke-virtual {v1, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 613
    .line 614
    .line 615
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 616
    .line 617
    .line 618
    move-result-object v0

    .line 619
    goto :goto_10

    .line 620
    :goto_15
    sget-object v0, Lhg4;->C:Lhg4;

    .line 621
    .line 622
    iget-object v0, v0, Lhg4;->k:Lym;

    .line 623
    .line 624
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 625
    .line 626
    .line 627
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 628
    .line 629
    .line 630
    move-result-wide v0

    .line 631
    sub-long v3, v0, v21

    .line 632
    .line 633
    sget-object v7, Llf4;->l:Li63;

    .line 634
    .line 635
    new-instance v0, Leg2;

    .line 636
    .line 637
    const/4 v5, 0x2

    .line 638
    move-object/from16 v1, p0

    .line 639
    .line 640
    invoke-direct/range {v0 .. v5}, Leg2;-><init>(Lsg2;ZJI)V

    .line 641
    .line 642
    .line 643
    invoke-virtual {v7, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 644
    .line 645
    .line 646
    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 647
    .line 648
    .line 649
    move-result-object v0

    .line 650
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 651
    .line 652
    .line 653
    move-result v0

    .line 654
    add-int/lit8 v0, v0, 0x18

    .line 655
    .line 656
    new-instance v1, Ljava/lang/StringBuilder;

    .line 657
    .line 658
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 659
    .line 660
    .line 661
    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 662
    .line 663
    .line 664
    invoke-virtual {v1, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 665
    .line 666
    .line 667
    invoke-virtual {v1, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 668
    .line 669
    .line 670
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 671
    .line 672
    .line 673
    move-result-object v0

    .line 674
    invoke-static {v0}, Lgi2;->G(Ljava/lang/String;)V

    .line 675
    .line 676
    .line 677
    throw v6

    .line 678
    :cond_a
    sget-object v1, Lhg4;->C:Lhg4;

    .line 679
    .line 680
    iget-object v1, v1, Lhg4;->j:Lbu1;

    .line 681
    .line 682
    invoke-virtual {v1, v10}, Lbu1;->t(Lww1;)Luw1;

    .line 683
    .line 684
    .line 685
    move-result-object v1

    .line 686
    if-eqz v1, :cond_b

    .line 687
    .line 688
    invoke-virtual {v1}, Luw1;->a()Z

    .line 689
    .line 690
    .line 691
    move-result v2

    .line 692
    if-eqz v2, :cond_b

    .line 693
    .line 694
    monitor-enter v1
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_1
    .catch Ljava/lang/NoClassDefFoundError; {:try_start_8 .. :try_end_8} :catch_0

    .line 695
    :try_start_9
    iget-boolean v2, v1, Luw1;->g:Z
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_5

    .line 696
    .line 697
    :try_start_a
    monitor-exit v1

    .line 698
    invoke-static {v2}, Ljava/lang/Boolean;->toString(Z)Ljava/lang/String;

    .line 699
    .line 700
    .line 701
    move-result-object v2

    .line 702
    invoke-virtual {v14, v5, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 703
    .line 704
    .line 705
    invoke-virtual {v1}, Luw1;->d()Z

    .line 706
    .line 707
    .line 708
    move-result v2

    .line 709
    invoke-static {v2}, Ljava/lang/Boolean;->toString(Z)Ljava/lang/String;

    .line 710
    .line 711
    .line 712
    move-result-object v2

    .line 713
    invoke-virtual {v14, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 714
    .line 715
    .line 716
    invoke-virtual {v1}, Luw1;->c()Z

    .line 717
    .line 718
    .line 719
    move-result v2

    .line 720
    invoke-static {v2}, Ljava/lang/Boolean;->toString(Z)Ljava/lang/String;

    .line 721
    .line 722
    .line 723
    move-result-object v2

    .line 724
    invoke-virtual {v14, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 725
    .line 726
    .line 727
    monitor-enter v1
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_1
    .catch Ljava/lang/NoClassDefFoundError; {:try_start_a .. :try_end_a} :catch_0

    .line 728
    :try_start_b
    iget-wide v2, v1, Luw1;->i:J
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_4

    .line 729
    .line 730
    :try_start_c
    monitor-exit v1

    .line 731
    invoke-static {v2, v3}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    .line 732
    .line 733
    .line 734
    move-result-object v2

    .line 735
    invoke-virtual {v14, v0, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 736
    .line 737
    .line 738
    invoke-virtual {v1}, Luw1;->b()Landroid/os/ParcelFileDescriptor$AutoCloseInputStream;

    .line 739
    .line 740
    .line 741
    move-result-object v3

    .line 742
    const/4 v0, -0x1

    .line 743
    if-eq v6, v0, :cond_7

    .line 744
    .line 745
    int-to-long v0, v6

    .line 746
    sget v2, Lmo3;->a:I

    .line 747
    .line 748
    new-instance v2, Luo1;

    .line 749
    .line 750
    invoke-direct {v2, v3, v0, v1}, Luo1;-><init>(Ljava/io/InputStream;J)V
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_1
    .catch Ljava/lang/NoClassDefFoundError; {:try_start_c .. :try_end_c} :catch_0

    .line 751
    .line 752
    .line 753
    move-object/from16 v20, v2

    .line 754
    .line 755
    goto :goto_16

    .line 756
    :catchall_4
    move-exception v0

    .line 757
    :try_start_d
    monitor-exit v1
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_4

    .line 758
    :try_start_e
    throw v0
    :try_end_e
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_1
    .catch Ljava/lang/NoClassDefFoundError; {:try_start_e .. :try_end_e} :catch_0

    .line 759
    :catchall_5
    move-exception v0

    .line 760
    :try_start_f
    monitor-exit v1
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_5

    .line 761
    :try_start_10
    throw v0

    .line 762
    :cond_b
    move-object/from16 v20, v16

    .line 763
    .line 764
    :goto_16
    if-eqz v20, :cond_d

    .line 765
    .line 766
    move-object/from16 v19, v14

    .line 767
    .line 768
    new-instance v14, Landroid/webkit/WebResourceResponse;

    .line 769
    .line 770
    const-string v15, ""

    .line 771
    .line 772
    const-string v16, ""

    .line 773
    .line 774
    const-string v18, "OK"

    .line 775
    .line 776
    const/16 v17, 0xc8

    .line 777
    .line 778
    invoke-direct/range {v14 .. v20}, Landroid/webkit/WebResourceResponse;-><init>(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/util/Map;Ljava/io/InputStream;)V

    .line 779
    .line 780
    .line 781
    return-object v14

    .line 782
    :cond_c
    const/16 v16, 0x0

    .line 783
    .line 784
    :cond_d
    invoke-static {}, Lwb4;->c()Z

    .line 785
    .line 786
    .line 787
    move-result v0

    .line 788
    if-eqz v0, :cond_e

    .line 789
    .line 790
    sget-object v0, Lp02;->b:Lso1;

    .line 791
    .line 792
    invoke-virtual {v0}, Lso1;->w()Ljava/lang/Object;

    .line 793
    .line 794
    .line 795
    move-result-object v0

    .line 796
    check-cast v0, Ljava/lang/Boolean;

    .line 797
    .line 798
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 799
    .line 800
    .line 801
    move-result v0

    .line 802
    if-eqz v0, :cond_e

    .line 803
    .line 804
    invoke-virtual/range {p0 .. p2}, Lsg2;->B(Ljava/lang/String;Ljava/util/Map;)Landroid/webkit/WebResourceResponse;

    .line 805
    .line 806
    .line 807
    move-result-object v0
    :try_end_10
    .catch Ljava/lang/Exception; {:try_start_10 .. :try_end_10} :catch_1
    .catch Ljava/lang/NoClassDefFoundError; {:try_start_10 .. :try_end_10} :catch_0

    .line 808
    return-object v0

    .line 809
    :cond_e
    return-object v16

    .line 810
    :goto_17
    const-string v1, "AdWebViewClient.interceptRequest"

    .line 811
    .line 812
    sget-object v2, Lhg4;->C:Lhg4;

    .line 813
    .line 814
    iget-object v2, v2, Lhg4;->h:Lgd2;

    .line 815
    .line 816
    invoke-virtual {v2, v1, v0}, Lgd2;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 817
    .line 818
    .line 819
    invoke-static {}, Lsg2;->w()Landroid/webkit/WebResourceResponse;

    .line 820
    .line 821
    .line 822
    move-result-object v0

    .line 823
    return-object v0
.end method

.method public final l(Landroid/net/Uri;)V
    .locals 7

    .line 1
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "Received GMSG: "

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, Lgi2;->G(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v4

    .line 18
    iget-object v0, p0, Lsg2;->h:Ljava/util/HashMap;

    .line 19
    .line 20
    invoke-virtual {v0, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    move-object v3, v0

    .line 25
    check-cast v3, Ljava/util/List;

    .line 26
    .line 27
    if-eqz v4, :cond_0

    .line 28
    .line 29
    if-nez v3, :cond_1

    .line 30
    .line 31
    :cond_0
    move-object v2, p0

    .line 32
    move-object v5, p1

    .line 33
    goto/16 :goto_0

    .line 34
    .line 35
    :cond_1
    invoke-virtual {p1}, Landroid/net/Uri;->getEncodedQuery()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    sget-object v1, Lmz1;->c6:Liz1;

    .line 40
    .line 41
    sget-object v2, Ltw1;->e:Ltw1;

    .line 42
    .line 43
    iget-object v5, v2, Ltw1;->c:Lkz1;

    .line 44
    .line 45
    invoke-virtual {v5, v1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    check-cast v1, Ljava/lang/Boolean;

    .line 50
    .line 51
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    if-eqz v1, :cond_2

    .line 56
    .line 57
    iget-object v1, p0, Lsg2;->J:Ljava/util/HashSet;

    .line 58
    .line 59
    invoke-virtual {v1, v4}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    if-eqz v1, :cond_2

    .line 64
    .line 65
    if-eqz v0, :cond_2

    .line 66
    .line 67
    sget-object v1, Lmz1;->e6:Liz1;

    .line 68
    .line 69
    iget-object v2, v2, Ltw1;->c:Lkz1;

    .line 70
    .line 71
    invoke-virtual {v2, v1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    check-cast v1, Ljava/lang/Integer;

    .line 76
    .line 77
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    if-lt v0, v1, :cond_2

    .line 86
    .line 87
    const-string v0, "Parsing gmsg query params on BG thread: "

    .line 88
    .line 89
    invoke-virtual {v0, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    invoke-static {v0}, Lgi2;->G(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    sget-object v0, Lhg4;->C:Lhg4;

    .line 97
    .line 98
    iget-object v0, v0, Lhg4;->c:Llf4;

    .line 99
    .line 100
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    new-instance v1, Lw53;

    .line 104
    .line 105
    const/16 v2, 0xc

    .line 106
    .line 107
    invoke-direct {v1, v2, p1}, Lw53;-><init>(ILjava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    iget-object v0, v0, Llf4;->k:Ljava/util/concurrent/ExecutorService;

    .line 111
    .line 112
    invoke-static {v1, v0}, Lpu1;->D(Ljava/util/concurrent/Callable;Ljava/util/concurrent/Executor;)Lar3;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    new-instance v1, Lmc2;

    .line 117
    .line 118
    const/16 v6, 0xc

    .line 119
    .line 120
    move-object v2, p0

    .line 121
    move-object v5, p1

    .line 122
    invoke-direct/range {v1 .. v6}, Lmc2;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 123
    .line 124
    .line 125
    sget-object p1, Lmd2;->f:Lld2;

    .line 126
    .line 127
    new-instance v3, Ljq3;

    .line 128
    .line 129
    const/4 v4, 0x0

    .line 130
    invoke-direct {v3, v0, v1, v4}, Ljq3;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {v0, v3, p1}, Lgp3;->c(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 134
    .line 135
    .line 136
    return-void

    .line 137
    :cond_2
    move-object v2, p0

    .line 138
    move-object v5, p1

    .line 139
    sget-object p1, Lhg4;->C:Lhg4;

    .line 140
    .line 141
    iget-object p1, p1, Lhg4;->c:Llf4;

    .line 142
    .line 143
    invoke-static {v5}, Llf4;->o(Landroid/net/Uri;)Ljava/util/HashMap;

    .line 144
    .line 145
    .line 146
    move-result-object p1

    .line 147
    invoke-virtual {p0, p1, v3, v4}, Lsg2;->H(Ljava/util/Map;Ljava/util/List;Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    return-void

    .line 151
    :goto_0
    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object p1

    .line 155
    const-string v0, "No GMSG handler found for GMSG: "

    .line 156
    .line 157
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object p1

    .line 161
    invoke-static {p1}, Lgi2;->G(Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    sget-object p1, Lmz1;->c7:Liz1;

    .line 165
    .line 166
    sget-object v0, Ltw1;->e:Ltw1;

    .line 167
    .line 168
    iget-object v0, v0, Ltw1;->c:Lkz1;

    .line 169
    .line 170
    invoke-virtual {v0, p1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object p1

    .line 174
    check-cast p1, Ljava/lang/Boolean;

    .line 175
    .line 176
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 177
    .line 178
    .line 179
    move-result p1

    .line 180
    if-eqz p1, :cond_6

    .line 181
    .line 182
    sget-object p1, Lhg4;->C:Lhg4;

    .line 183
    .line 184
    iget-object p1, p1, Lhg4;->h:Lgd2;

    .line 185
    .line 186
    invoke-virtual {p1}, Lgd2;->a()Lh2;

    .line 187
    .line 188
    .line 189
    move-result-object p1

    .line 190
    if-nez p1, :cond_3

    .line 191
    .line 192
    goto :goto_3

    .line 193
    :cond_3
    if-eqz v4, :cond_5

    .line 194
    .line 195
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 196
    .line 197
    .line 198
    move-result p1

    .line 199
    const/4 v0, 0x2

    .line 200
    if-ge p1, v0, :cond_4

    .line 201
    .line 202
    goto :goto_1

    .line 203
    :cond_4
    const/4 p1, 0x1

    .line 204
    invoke-virtual {v4, p1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 205
    .line 206
    .line 207
    move-result-object p1

    .line 208
    goto :goto_2

    .line 209
    :cond_5
    :goto_1
    const-string p1, "null"

    .line 210
    .line 211
    :goto_2
    sget-object v0, Lmd2;->a:Lld2;

    .line 212
    .line 213
    new-instance v1, Lfu1;

    .line 214
    .line 215
    const/16 v3, 0x11

    .line 216
    .line 217
    invoke-direct {v1, v3, p1}, Lfu1;-><init>(ILjava/lang/Object;)V

    .line 218
    .line 219
    .line 220
    invoke-virtual {v0, v1}, Lld2;->execute(Ljava/lang/Runnable;)V

    .line 221
    .line 222
    .line 223
    :cond_6
    :goto_3
    return-void
.end method

.method public final onLoadResource(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string p1, "Loading resource: "

    .line 2
    .line 3
    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {p1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-static {p1}, Lgi2;->G(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-virtual {p1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    const-string v0, "gmsg"

    .line 23
    .line 24
    invoke-virtual {v0, p2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 25
    .line 26
    .line 27
    move-result p2

    .line 28
    if-eqz p2, :cond_0

    .line 29
    .line 30
    invoke-virtual {p1}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p2

    .line 34
    const-string v0, "mobileads.google.com"

    .line 35
    .line 36
    invoke-virtual {v0, p2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 37
    .line 38
    .line 39
    move-result p2

    .line 40
    if-eqz p2, :cond_0

    .line 41
    .line 42
    invoke-virtual {p0, p1}, Lsg2;->l(Landroid/net/Uri;)V

    .line 43
    .line 44
    .line 45
    :cond_0
    return-void
.end method

.method public final onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object p1, p0, Lsg2;->i:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter p1

    .line 4
    :try_start_0
    iget-object v0, p0, Lsg2;->f:Ljg2;

    .line 5
    .line 6
    iget-object v1, v0, Ljg2;->f:Log2;

    .line 7
    .line 8
    invoke-virtual {v1}, Log2;->o0()Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    const-string p2, "Blank page loaded, 1..."

    .line 15
    .line 16
    invoke-static {p2}, Lgi2;->G(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Ljg2;->r()V

    .line 20
    .line 21
    .line 22
    monitor-exit p1

    .line 23
    return-void

    .line 24
    :catchall_0
    move-exception p2

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    const/4 p1, 0x1

    .line 28
    iput-boolean p1, p0, Lsg2;->F:Z

    .line 29
    .line 30
    iget-object p1, p0, Lsg2;->m:Lvg2;

    .line 31
    .line 32
    if-eqz p1, :cond_1

    .line 33
    .line 34
    invoke-interface {p1}, Lvg2;->a()V

    .line 35
    .line 36
    .line 37
    const/4 p1, 0x0

    .line 38
    iput-object p1, p0, Lsg2;->m:Lvg2;

    .line 39
    .line 40
    :cond_1
    invoke-virtual {p0}, Lsg2;->Y()V

    .line 41
    .line 42
    .line 43
    iget-object p1, p0, Lsg2;->f:Ljg2;

    .line 44
    .line 45
    iget-object v0, p1, Ljg2;->f:Log2;

    .line 46
    .line 47
    invoke-virtual {v0}, Log2;->z0()Ljh1;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    if-eqz v0, :cond_2

    .line 52
    .line 53
    sget-object v0, Lmz1;->Ic:Liz1;

    .line 54
    .line 55
    sget-object v1, Ltw1;->e:Ltw1;

    .line 56
    .line 57
    iget-object v1, v1, Ltw1;->c:Lkz1;

    .line 58
    .line 59
    invoke-virtual {v1, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    check-cast v0, Ljava/lang/Boolean;

    .line 64
    .line 65
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    if-eqz v0, :cond_2

    .line 70
    .line 71
    iget-object p1, p1, Ljg2;->f:Log2;

    .line 72
    .line 73
    invoke-virtual {p1}, Log2;->z0()Ljh1;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    iget-object p1, p1, Ljh1;->A:Landroid/widget/Toolbar;

    .line 78
    .line 79
    if-eqz p1, :cond_2

    .line 80
    .line 81
    invoke-virtual {p1, p2}, Landroid/widget/Toolbar;->setSubtitle(Ljava/lang/CharSequence;)V

    .line 82
    .line 83
    .line 84
    :cond_2
    return-void

    .line 85
    :goto_0
    :try_start_1
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 86
    throw p2
.end method

.method public final onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    const/4 p1, 0x1

    .line 2
    iput-boolean p1, p0, Lsg2;->r:Z

    .line 3
    .line 4
    iput p2, p0, Lsg2;->s:I

    .line 5
    .line 6
    iput-object p3, p0, Lsg2;->t:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p4, p0, Lsg2;->u:Ljava/lang/String;

    .line 9
    .line 10
    return-void
.end method

.method public final onRenderProcessGone(Landroid/webkit/WebView;Landroid/webkit/RenderProcessGoneDetail;)Z
    .locals 5

    .line 1
    invoke-virtual {p2}, Landroid/webkit/RenderProcessGoneDetail;->didCrash()Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    invoke-virtual {p2}, Landroid/webkit/RenderProcessGoneDetail;->rendererPriorityAtExit()I

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    iget-object v0, p0, Lsg2;->f:Ljg2;

    .line 10
    .line 11
    iget-object v1, v0, Ljg2;->h:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    const/4 v3, 0x1

    .line 15
    invoke-virtual {v1, v2, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-nez v1, :cond_0

    .line 20
    .line 21
    :goto_0
    move v2, v3

    .line 22
    goto :goto_1

    .line 23
    :cond_0
    sget-object v1, Lmz1;->U0:Liz1;

    .line 24
    .line 25
    sget-object v4, Ltw1;->e:Ltw1;

    .line 26
    .line 27
    iget-object v4, v4, Ltw1;->c:Lkz1;

    .line 28
    .line 29
    invoke-virtual {v4, v1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    check-cast v1, Ljava/lang/Boolean;

    .line 34
    .line 35
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-eqz v1, :cond_1

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    iget-object v0, v0, Ljg2;->f:Log2;

    .line 43
    .line 44
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    instance-of v1, v1, Landroid/view/ViewGroup;

    .line 49
    .line 50
    if-eqz v1, :cond_2

    .line 51
    .line 52
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    check-cast v1, Landroid/view/ViewGroup;

    .line 57
    .line 58
    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 59
    .line 60
    .line 61
    :cond_2
    invoke-virtual {v0}, Log2;->destroy()V

    .line 62
    .line 63
    .line 64
    new-instance v1, Llg2;

    .line 65
    .line 66
    invoke-direct {v1, p2, p1}, Llg2;-><init>(IZ)V

    .line 67
    .line 68
    .line 69
    iget-object p1, v0, Log2;->f0:Lcx1;

    .line 70
    .line 71
    invoke-virtual {p1, v1}, Lcx1;->a(Lbx1;)V

    .line 72
    .line 73
    .line 74
    const/16 p2, 0x2713

    .line 75
    .line 76
    invoke-virtual {p1, p2}, Lcx1;->b(I)V

    .line 77
    .line 78
    .line 79
    goto :goto_0

    .line 80
    :goto_1
    return v2
.end method

.method public final p(Lfd1;Ll32;Lye4;Lm32;Lkf1;ZLe42;Lsu1;Lof3;Lsb2;Ljz2;Leb3;Lmv2;Lz32;Lxp2;Lk32;Lk32;Lz32;Lgj2;Lxv2;Lim2;)V
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move-object/from16 v2, p4

    move-object/from16 v3, p7

    move-object/from16 v4, p9

    move-object/from16 v5, p10

    move-object/from16 v11, p12

    move-object/from16 v12, p14

    move-object/from16 v13, p15

    move-object/from16 v14, p16

    move-object/from16 v15, p17

    .line 1
    iget-object v6, v0, Lsg2;->f:Ljg2;

    if-nez p8, :cond_0

    new-instance v7, Lsu1;

    invoke-virtual {v6}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v8

    invoke-direct {v7, v8, v5}, Lsu1;-><init>(Landroid/content/Context;Lsb2;)V

    goto :goto_0

    :cond_0
    move-object/from16 v7, p8

    .line 2
    :goto_0
    new-instance v8, Lo82;

    invoke-direct {v8, v6, v4}, Lo82;-><init>(Ljg2;Lof3;)V

    iput-object v8, v0, Lsg2;->C:Lo82;

    iput-object v5, v0, Lsg2;->D:Lsb2;

    .line 3
    sget-object v5, Lmz1;->b1:Liz1;

    .line 4
    sget-object v8, Ltw1;->e:Ltw1;

    iget-object v9, v8, Ltw1;->c:Lkz1;

    iget-object v8, v8, Ltw1;->c:Lkz1;

    .line 5
    invoke-virtual {v9, v5}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    move-result-object v5

    .line 6
    check-cast v5, Ljava/lang/Boolean;

    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    if-eqz v5, :cond_1

    new-instance v5, Lk32;

    const/4 v9, 0x0

    invoke-direct {v5, v9, v1}, Lk32;-><init>(ILjava/lang/Object;)V

    const-string v9, "/adMetadata"

    .line 7
    invoke-virtual {v0, v9, v5}, Lsg2;->b(Ljava/lang/String;Ly32;)V

    :cond_1
    if-eqz v2, :cond_2

    new-instance v5, Lk32;

    const/4 v9, 0x1

    invoke-direct {v5, v9, v2}, Lk32;-><init>(ILjava/lang/Object;)V

    const-string v9, "/appEvent"

    .line 8
    invoke-virtual {v0, v9, v5}, Lsg2;->b(Ljava/lang/String;Ly32;)V

    :cond_2
    const-string v5, "/backButton"

    .line 9
    sget-object v9, Lx32;->e:Lo32;

    invoke-virtual {v0, v5, v9}, Lsg2;->b(Ljava/lang/String;Ly32;)V

    const-string v5, "/refresh"

    sget-object v9, Lx32;->f:Lo32;

    .line 10
    invoke-virtual {v0, v5, v9}, Lsg2;->b(Ljava/lang/String;Ly32;)V

    const-string v5, "/canOpenApp"

    sget-object v9, Lo32;->g:Lo32;

    .line 11
    invoke-virtual {v0, v5, v9}, Lsg2;->b(Ljava/lang/String;Ly32;)V

    const-string v5, "/canOpenURLs"

    sget-object v9, Lo32;->k:Lo32;

    .line 12
    invoke-virtual {v0, v5, v9}, Lsg2;->b(Ljava/lang/String;Ly32;)V

    const-string v5, "/canOpenIntents"

    sget-object v9, Lo32;->h:Lo32;

    .line 13
    invoke-virtual {v0, v5, v9}, Lsg2;->b(Ljava/lang/String;Ly32;)V

    const-string v5, "/close"

    sget-object v9, Lx32;->a:Lo32;

    .line 14
    invoke-virtual {v0, v5, v9}, Lsg2;->b(Ljava/lang/String;Ly32;)V

    const-string v5, "/customClose"

    sget-object v9, Lx32;->b:Lo32;

    .line 15
    invoke-virtual {v0, v5, v9}, Lsg2;->b(Ljava/lang/String;Ly32;)V

    const-string v5, "/instrument"

    sget-object v9, Lx32;->i:Ln32;

    .line 16
    invoke-virtual {v0, v5, v9}, Lsg2;->b(Ljava/lang/String;Ly32;)V

    const-string v5, "/delayPageLoaded"

    sget-object v9, Lx32;->k:Lo32;

    .line 17
    invoke-virtual {v0, v5, v9}, Lsg2;->b(Ljava/lang/String;Ly32;)V

    const-string v5, "/delayPageClosed"

    sget-object v9, Lx32;->l:Lo32;

    .line 18
    invoke-virtual {v0, v5, v9}, Lsg2;->b(Ljava/lang/String;Ly32;)V

    const-string v5, "/getLocationInfo"

    sget-object v9, Lx32;->m:Lo32;

    .line 19
    invoke-virtual {v0, v5, v9}, Lsg2;->b(Ljava/lang/String;Ly32;)V

    const-string v5, "/log"

    sget-object v9, Lx32;->c:Lo32;

    .line 20
    invoke-virtual {v0, v5, v9}, Lsg2;->b(Ljava/lang/String;Ly32;)V

    .line 21
    new-instance v5, Lf42;

    iget-object v9, v0, Lsg2;->C:Lo82;

    invoke-direct {v5, v7, v9, v4}, Lf42;-><init>(Lsu1;Lo82;Lof3;)V

    const-string v4, "/mraid"

    invoke-virtual {v0, v4, v5}, Lsg2;->b(Ljava/lang/String;Ly32;)V

    iget-object v4, v0, Lsg2;->A:Lq82;

    if-eqz v4, :cond_3

    const-string v5, "/mraidLoaded"

    .line 22
    invoke-virtual {v0, v5, v4}, Lsg2;->b(Ljava/lang/String;Ly32;)V

    :cond_3
    new-instance v4, Li42;

    move-object v5, v6

    iget-object v6, v0, Lsg2;->C:Lo82;

    move-object/from16 v9, p19

    move-object/from16 v1, p20

    move-object/from16 v10, p21

    move-object/from16 p8, v5

    move-object v5, v7

    move-object v2, v8

    move-object/from16 v7, p11

    move-object/from16 v8, p13

    .line 23
    invoke-direct/range {v4 .. v10}, Li42;-><init>(Lsu1;Lo82;Ljz2;Lmv2;Lgj2;Lim2;)V

    const-string v6, "/open"

    invoke-virtual {v0, v6, v4}, Lsg2;->b(Ljava/lang/String;Ly32;)V

    new-instance v4, Lo32;

    const/16 v6, 0x1a

    .line 24
    invoke-direct {v4, v6}, Lo32;-><init>(I)V

    .line 25
    const-string v6, "/precache"

    .line 26
    invoke-virtual {v0, v6, v4}, Lsg2;->b(Ljava/lang/String;Ly32;)V

    const-string v4, "/touch"

    sget-object v6, Lo32;->j:Lo32;

    .line 27
    invoke-virtual {v0, v4, v6}, Lsg2;->b(Ljava/lang/String;Ly32;)V

    const-string v4, "/video"

    sget-object v6, Lx32;->g:Lve2;

    .line 28
    invoke-virtual {v0, v4, v6}, Lsg2;->b(Ljava/lang/String;Ly32;)V

    const-string v4, "/videoMeta"

    sget-object v6, Lx32;->h:Lo32;

    .line 29
    invoke-virtual {v0, v4, v6}, Lsg2;->b(Ljava/lang/String;Ly32;)V

    const-string v4, "/httpTrack"

    const-string v6, "/click"

    if-eqz v7, :cond_4

    if-eqz v11, :cond_4

    .line 30
    new-instance v8, Lcr2;

    invoke-direct {v8, v13, v9, v11, v7}, Lcr2;-><init>(Lxp2;Lgj2;Leb3;Ljz2;)V

    .line 31
    invoke-virtual {v0, v6, v8}, Lsg2;->b(Ljava/lang/String;Ly32;)V

    .line 32
    new-instance v6, Lv32;

    const/4 v8, 0x6

    invoke-direct {v6, v11, v7, v8}, Lv32;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 33
    invoke-virtual {v0, v4, v6}, Lsg2;->b(Ljava/lang/String;Ly32;)V

    goto :goto_1

    .line 34
    :cond_4
    new-instance v7, Lv32;

    const/4 v8, 0x0

    invoke-direct {v7, v13, v9, v8}, Lv32;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 35
    invoke-virtual {v0, v6, v7}, Lsg2;->b(Ljava/lang/String;Ly32;)V

    sget-object v6, Lo32;->i:Lo32;

    .line 36
    invoke-virtual {v0, v4, v6}, Lsg2;->b(Ljava/lang/String;Ly32;)V

    .line 37
    :goto_1
    sget-object v4, Lhg4;->C:Lhg4;

    iget-object v4, v4, Lhg4;->y:Loc2;

    .line 38
    invoke-virtual/range {p8 .. p8}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v6

    move-object/from16 v7, p8

    iget-object v8, v7, Ljg2;->f:Log2;

    invoke-virtual {v4, v6}, Loc2;->a(Landroid/content/Context;)Z

    move-result v4

    if-eqz v4, :cond_6

    new-instance v4, Ljava/util/HashMap;

    .line 39
    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 40
    iget-object v6, v8, Log2;->o:La83;

    if-eqz v6, :cond_5

    .line 41
    iget-object v4, v6, La83;->w0:Ljava/util/HashMap;

    :cond_5
    new-instance v6, Lv32;

    .line 42
    invoke-virtual {v7}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v7

    const/4 v9, 0x1

    invoke-direct {v6, v7, v4, v9}, Lv32;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    const-string v4, "/logScionEvent"

    .line 43
    invoke-virtual {v0, v4, v6}, Lsg2;->b(Ljava/lang/String;Ly32;)V

    :cond_6
    if-eqz v3, :cond_7

    new-instance v4, Lk32;

    const/4 v6, 0x2

    invoke-direct {v4, v6, v3}, Lk32;-><init>(ILjava/lang/Object;)V

    const-string v3, "/setInterstitialProperties"

    .line 44
    invoke-virtual {v0, v3, v4}, Lsg2;->b(Ljava/lang/String;Ly32;)V

    :cond_7
    if-eqz v12, :cond_8

    sget-object v3, Lmz1;->I9:Liz1;

    .line 45
    invoke-virtual {v2, v3}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    move-result-object v3

    .line 46
    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_8

    const-string v3, "/inspectorNetworkExtras"

    .line 47
    invoke-virtual {v0, v3, v12}, Lsg2;->b(Ljava/lang/String;Ly32;)V

    :cond_8
    sget-object v3, Lmz1;->ba:Liz1;

    .line 48
    invoke-virtual {v2, v3}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    move-result-object v3

    .line 49
    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_9

    if-eqz v14, :cond_9

    const-string v3, "/shareSheet"

    .line 50
    invoke-virtual {v0, v3, v14}, Lsg2;->b(Ljava/lang/String;Ly32;)V

    :cond_9
    sget-object v3, Lmz1;->l8:Liz1;

    .line 51
    invoke-virtual {v2, v3}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    move-result-object v3

    .line 52
    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_a

    if-eqz v1, :cond_a

    new-instance v3, Lk32;

    const/4 v4, 0x3

    invoke-direct {v3, v4, v1}, Lk32;-><init>(ILjava/lang/Object;)V

    const-string v1, "/onDeviceStorageEvent"

    .line 53
    invoke-virtual {v0, v1, v3}, Lsg2;->b(Ljava/lang/String;Ly32;)V

    :cond_a
    sget-object v1, Lmz1;->ga:Liz1;

    .line 54
    invoke-virtual {v2, v1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    move-result-object v1

    .line 55
    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_b

    if-eqz v15, :cond_b

    const-string v1, "/inspectorOutOfContextTest"

    .line 56
    invoke-virtual {v0, v1, v15}, Lsg2;->b(Ljava/lang/String;Ly32;)V

    :cond_b
    sget-object v1, Lmz1;->la:Liz1;

    .line 57
    invoke-virtual {v2, v1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    move-result-object v1

    .line 58
    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_c

    if-eqz p18, :cond_c

    const-string v1, "/inspectorStorage"

    move-object/from16 v3, p18

    .line 59
    invoke-virtual {v0, v1, v3}, Lsg2;->b(Ljava/lang/String;Ly32;)V

    :cond_c
    sget-object v1, Lmz1;->nc:Liz1;

    .line 60
    invoke-virtual {v2, v1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    move-result-object v1

    .line 61
    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_d

    const-string v1, "/bindPlayStoreOverlay"

    sget-object v3, Lx32;->p:Lo32;

    .line 62
    invoke-virtual {v0, v1, v3}, Lsg2;->b(Ljava/lang/String;Ly32;)V

    const-string v1, "/presentPlayStoreOverlay"

    sget-object v3, Lx32;->q:Lo32;

    .line 63
    invoke-virtual {v0, v1, v3}, Lsg2;->b(Ljava/lang/String;Ly32;)V

    const-string v1, "/expandPlayStoreOverlay"

    sget-object v3, Lx32;->r:Lo32;

    .line 64
    invoke-virtual {v0, v1, v3}, Lsg2;->b(Ljava/lang/String;Ly32;)V

    const-string v1, "/collapsePlayStoreOverlay"

    sget-object v3, Lx32;->s:Lo32;

    .line 65
    invoke-virtual {v0, v1, v3}, Lsg2;->b(Ljava/lang/String;Ly32;)V

    const-string v1, "/closePlayStoreOverlay"

    sget-object v3, Lx32;->t:Lo32;

    .line 66
    invoke-virtual {v0, v1, v3}, Lsg2;->b(Ljava/lang/String;Ly32;)V

    :cond_d
    sget-object v1, Lmz1;->E3:Liz1;

    .line 67
    invoke-virtual {v2, v1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    move-result-object v1

    .line 68
    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_e

    const-string v1, "/setPAIDPersonalizationEnabled"

    sget-object v3, Lx32;->v:Lo32;

    .line 69
    invoke-virtual {v0, v1, v3}, Lsg2;->b(Ljava/lang/String;Ly32;)V

    const-string v1, "/resetPAID"

    sget-object v3, Lx32;->u:Lo32;

    .line 70
    invoke-virtual {v0, v1, v3}, Lsg2;->b(Ljava/lang/String;Ly32;)V

    :cond_e
    sget-object v1, Lmz1;->Hc:Liz1;

    .line 71
    invoke-virtual {v2, v1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    move-result-object v1

    .line 72
    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_f

    .line 73
    iget-object v1, v8, Log2;->o:La83;

    if-eqz v1, :cond_f

    .line 74
    iget-boolean v1, v1, La83;->r0:Z

    if-eqz v1, :cond_f

    const-string v1, "/writeToLocalStorage"

    sget-object v2, Lx32;->w:Lo32;

    .line 75
    invoke-virtual {v0, v1, v2}, Lsg2;->b(Ljava/lang/String;Ly32;)V

    const-string v1, "/clearLocalStorageKeys"

    sget-object v2, Lx32;->x:Lo32;

    .line 76
    invoke-virtual {v0, v1, v2}, Lsg2;->b(Ljava/lang/String;Ly32;)V

    :cond_f
    move-object/from16 v1, p1

    iput-object v1, v0, Lsg2;->j:Lfd1;

    move-object/from16 v1, p3

    iput-object v1, v0, Lsg2;->k:Lye4;

    move-object/from16 v1, p2

    iput-object v1, v0, Lsg2;->n:Ll32;

    move-object/from16 v2, p4

    iput-object v2, v0, Lsg2;->o:Lm32;

    move-object/from16 v1, p5

    iput-object v1, v0, Lsg2;->z:Lkf1;

    iput-object v5, v0, Lsg2;->B:Lsu1;

    iput-object v13, v0, Lsg2;->p:Lxp2;

    move-object/from16 v8, p13

    iput-object v8, v0, Lsg2;->E:Lmv2;

    move/from16 v1, p6

    iput-boolean v1, v0, Lsg2;->q:Z

    return-void
.end method

.method public final r(II)V
    .locals 2

    .line 1
    iget-object v0, p0, Lsg2;->A:Lq82;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1, p2}, Lq82;->K(II)V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget-object v0, p0, Lsg2;->C:Lo82;

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    iget-object v1, v0, Lo82;->q:Ljava/lang/Object;

    .line 13
    .line 14
    monitor-enter v1

    .line 15
    :try_start_0
    iput p1, v0, Lo82;->k:I

    .line 16
    .line 17
    iput p2, v0, Lo82;->l:I

    .line 18
    .line 19
    monitor-exit v1

    .line 20
    return-void

    .line 21
    :catchall_0
    move-exception p1

    .line 22
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    throw p1

    .line 24
    :cond_1
    return-void
.end method

.method public final s(Landroid/view/View;Lsb2;I)V
    .locals 7

    .line 1
    check-cast p2, Lqb2;

    .line 2
    .line 3
    iget-object v0, p2, Lqb2;->g:Lrb2;

    .line 4
    .line 5
    iget-boolean v0, v0, Lrb2;->h:Z

    .line 6
    .line 7
    if-eqz v0, :cond_9

    .line 8
    .line 9
    iget-boolean v1, p2, Lqb2;->j:Z

    .line 10
    .line 11
    if-nez v1, :cond_9

    .line 12
    .line 13
    if-lez p3, :cond_9

    .line 14
    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    goto/16 :goto_7

    .line 18
    .line 19
    :cond_0
    if-nez v1, :cond_8

    .line 20
    .line 21
    sget-object v0, Lhg4;->C:Lhg4;

    .line 22
    .line 23
    iget-object v0, v0, Lhg4;->c:Llf4;

    .line 24
    .line 25
    const/4 v0, 0x1

    .line 26
    const/4 v1, 0x0

    .line 27
    if-nez p1, :cond_1

    .line 28
    .line 29
    goto :goto_6

    .line 30
    :cond_1
    :try_start_0
    invoke-virtual {p1}, Landroid/view/View;->isDrawingCacheEnabled()Z

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    invoke-virtual {p1, v0}, Landroid/view/View;->setDrawingCacheEnabled(Z)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p1}, Landroid/view/View;->getDrawingCache()Landroid/graphics/Bitmap;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    if-eqz v3, :cond_2

    .line 42
    .line 43
    invoke-static {v3}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    .line 44
    .line 45
    .line 46
    move-result-object v3
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 47
    goto :goto_0

    .line 48
    :catch_0
    move-exception v2

    .line 49
    goto :goto_1

    .line 50
    :cond_2
    move-object v3, v1

    .line 51
    :goto_0
    :try_start_1
    invoke-virtual {p1, v2}, Landroid/view/View;->setDrawingCacheEnabled(Z)V
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_1

    .line 52
    .line 53
    .line 54
    goto :goto_3

    .line 55
    :catch_1
    move-exception v2

    .line 56
    goto :goto_2

    .line 57
    :goto_1
    move-object v3, v1

    .line 58
    :goto_2
    const-string v4, "Fail to capture the web view"

    .line 59
    .line 60
    invoke-static {v4, v2}, Lgi2;->c0(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 61
    .line 62
    .line 63
    :goto_3
    if-nez v3, :cond_5

    .line 64
    .line 65
    :try_start_2
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 66
    .line 67
    .line 68
    move-result v2

    .line 69
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    .line 70
    .line 71
    .line 72
    move-result v3

    .line 73
    if-eqz v2, :cond_4

    .line 74
    .line 75
    if-nez v3, :cond_3

    .line 76
    .line 77
    goto :goto_4

    .line 78
    :cond_3
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 79
    .line 80
    .line 81
    move-result v4

    .line 82
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    .line 83
    .line 84
    .line 85
    move-result v5

    .line 86
    sget-object v6, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;

    .line 87
    .line 88
    invoke-static {v4, v5, v6}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 89
    .line 90
    .line 91
    move-result-object v4

    .line 92
    new-instance v5, Landroid/graphics/Canvas;

    .line 93
    .line 94
    invoke-direct {v5, v4}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 95
    .line 96
    .line 97
    const/4 v6, 0x0

    .line 98
    invoke-virtual {p1, v6, v6, v2, v3}, Landroid/view/View;->layout(IIII)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {p1, v5}, Landroid/view/View;->draw(Landroid/graphics/Canvas;)V

    .line 102
    .line 103
    .line 104
    move-object v1, v4

    .line 105
    goto :goto_6

    .line 106
    :catch_2
    move-exception v2

    .line 107
    goto :goto_5

    .line 108
    :cond_4
    :goto_4
    const-string v2, "Width or height of view is zero"

    .line 109
    .line 110
    invoke-static {v2}, Lgi2;->i0(Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_2

    .line 111
    .line 112
    .line 113
    goto :goto_6

    .line 114
    :goto_5
    const-string v3, "Fail to capture the webview"

    .line 115
    .line 116
    invoke-static {v3, v2}, Lgi2;->c0(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 117
    .line 118
    .line 119
    goto :goto_6

    .line 120
    :cond_5
    move-object v1, v3

    .line 121
    :goto_6
    if-nez v1, :cond_6

    .line 122
    .line 123
    const-string v0, "Failed to capture the webview bitmap."

    .line 124
    .line 125
    invoke-static {v0}, Lwl2;->F(Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    goto :goto_7

    .line 129
    :cond_6
    iput-boolean v0, p2, Lqb2;->j:Z

    .line 130
    .line 131
    new-instance v0, Ln62;

    .line 132
    .line 133
    const/4 v2, 0x4

    .line 134
    invoke-direct {v0, p2, v1, v2}, Ln62;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 135
    .line 136
    .line 137
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 138
    .line 139
    .line 140
    move-result-object v1

    .line 141
    invoke-virtual {v1}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 142
    .line 143
    .line 144
    move-result-object v1

    .line 145
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 146
    .line 147
    .line 148
    move-result-object v2

    .line 149
    if-eq v1, v2, :cond_7

    .line 150
    .line 151
    invoke-virtual {v0}, Ln62;->run()V

    .line 152
    .line 153
    .line 154
    goto :goto_7

    .line 155
    :cond_7
    sget-object v1, Lmd2;->a:Lld2;

    .line 156
    .line 157
    invoke-virtual {v1, v0}, Lld2;->execute(Ljava/lang/Runnable;)V

    .line 158
    .line 159
    .line 160
    :cond_8
    :goto_7
    iget-object v0, p2, Lqb2;->g:Lrb2;

    .line 161
    .line 162
    iget-boolean v0, v0, Lrb2;->h:Z

    .line 163
    .line 164
    if-eqz v0, :cond_9

    .line 165
    .line 166
    iget-boolean v0, p2, Lqb2;->j:Z

    .line 167
    .line 168
    if-nez v0, :cond_9

    .line 169
    .line 170
    sget-object v0, Llf4;->l:Li63;

    .line 171
    .line 172
    new-instance v1, Ldf2;

    .line 173
    .line 174
    invoke-direct {v1, p0, p1, p2, p3}, Ldf2;-><init>(Lsg2;Landroid/view/View;Lsb2;I)V

    .line 175
    .line 176
    .line 177
    const-wide/16 p1, 0x64

    .line 178
    .line 179
    invoke-virtual {v0, v1, p1, p2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 180
    .line 181
    .line 182
    :cond_9
    return-void
.end method

.method public final s0()V
    .locals 1

    .line 1
    iget-object v0, p0, Lsg2;->p:Lxp2;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lxp2;->s0()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public final shouldInterceptRequest(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Landroid/webkit/WebResourceResponse;
    .locals 7

    const/4 v0, 0x0

    if-eqz p2, :cond_8

    .line 1
    invoke-interface {p2}, Landroid/webkit/WebResourceRequest;->getUrl()Landroid/net/Uri;

    move-result-object v1

    if-nez v1, :cond_0

    goto/16 :goto_2

    .line 2
    :cond_0
    invoke-interface {p2}, Landroid/webkit/WebResourceRequest;->getUrl()Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2}, Landroid/webkit/WebResourceRequest;->getRequestHeaders()Ljava/util/Map;

    move-result-object p2

    .line 3
    instance-of v2, p1, Lag2;

    if-nez v2, :cond_1

    const-string p1, "Tried to intercept request from a WebView that wasn\'t an AdWebView."

    .line 4
    invoke-static {p1}, Lgi2;->i0(Ljava/lang/String;)V

    return-object v0

    .line 5
    :cond_1
    check-cast p1, Lag2;

    iget-object v2, p0, Lsg2;->D:Lsb2;

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    .line 6
    check-cast v2, Lqb2;

    invoke-virtual {v2, v1, p2, v3}, Lqb2;->b(Ljava/lang/String;Ljava/util/Map;I)V

    :cond_2
    new-instance v2, Ljava/io/File;

    .line 7
    invoke-direct {v2, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v2

    const-string v4, "mraid.js"

    .line 8
    invoke-virtual {v4, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_4

    if-nez p2, :cond_3

    .line 9
    sget-object p2, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 10
    :cond_3
    invoke-virtual {p0, v1, p2}, Lsg2;->h(Ljava/lang/String;Ljava/util/Map;)Landroid/webkit/WebResourceResponse;

    move-result-object p1

    return-object p1

    .line 11
    :cond_4
    invoke-interface {p1}, Lag2;->e0()Lsg2;

    move-result-object p2

    const/4 v1, 0x0

    if-eqz p2, :cond_5

    .line 12
    invoke-interface {p1}, Lag2;->e0()Lsg2;

    move-result-object p2

    .line 13
    iget-object v2, p2, Lsg2;->i:Ljava/lang/Object;

    monitor-enter v2

    :try_start_0
    iput-boolean v1, p2, Lsg2;->q:Z

    iput-boolean v3, p2, Lsg2;->v:Z

    .line 14
    sget-object v3, Lmd2;->f:Lld2;

    new-instance v4, Lfu1;

    const/16 v5, 0x10

    invoke-direct {v4, v5, p2}, Lfu1;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v3, v4}, Lld2;->execute(Ljava/lang/Runnable;)V

    .line 15
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception p1

    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    .line 16
    :cond_5
    :goto_0
    invoke-interface {p1}, Lag2;->x()Lzq;

    move-result-object p2

    invoke-virtual {p2}, Lzq;->b()Z

    move-result p2

    if-eqz p2, :cond_6

    .line 17
    sget-object p2, Lmz1;->Z:Liz1;

    .line 18
    sget-object v2, Ltw1;->e:Ltw1;

    iget-object v2, v2, Ltw1;->c:Lkz1;

    .line 19
    invoke-virtual {v2, p2}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    move-result-object p2

    .line 20
    check-cast p2, Ljava/lang/String;

    goto :goto_1

    .line 21
    :cond_6
    invoke-interface {p1}, Lag2;->Y0()Z

    move-result p2

    if-eqz p2, :cond_7

    .line 22
    sget-object p2, Lmz1;->Y:Liz1;

    .line 23
    sget-object v2, Ltw1;->e:Ltw1;

    iget-object v2, v2, Ltw1;->c:Lkz1;

    .line 24
    invoke-virtual {v2, p2}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    move-result-object p2

    .line 25
    check-cast p2, Ljava/lang/String;

    goto :goto_1

    .line 26
    :cond_7
    sget-object p2, Lmz1;->X:Liz1;

    .line 27
    sget-object v2, Ltw1;->e:Ltw1;

    iget-object v2, v2, Ltw1;->c:Lkz1;

    .line 28
    invoke-virtual {v2, p2}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    move-result-object p2

    .line 29
    check-cast p2, Ljava/lang/String;

    .line 30
    :goto_1
    sget-object v2, Lhg4;->C:Lhg4;

    iget-object v3, v2, Lhg4;->c:Llf4;

    .line 31
    invoke-interface {p1}, Lag2;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-interface {p1}, Lag2;->u()Le51;

    move-result-object p1

    iget-object p1, p1, Le51;->f:Ljava/lang/String;

    .line 32
    const-string v4, "UTF-8"

    :try_start_1
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    const-string v6, "User-Agent"

    .line 33
    iget-object v2, v2, Lhg4;->c:Llf4;

    .line 34
    invoke-virtual {v2, v3, p1}, Llf4;->D(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v5, v6, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p1, "Cache-Control"

    const-string v2, "max-stale=3600"

    .line 35
    invoke-virtual {v5, p1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p1, Lp32;

    .line 36
    invoke-direct {p1, v3}, Lp32;-><init>(Landroid/content/Context;)V

    .line 37
    invoke-virtual {p1, v1, p2, v5, v0}, Lp32;->a(ILjava/lang/String;Ljava/util/HashMap;[B)Lt12;

    move-result-object p1

    sget-object p2, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 38
    iget-object p1, p1, Lpd2;->f:Lwq3;

    const-wide/16 v1, 0x3c

    invoke-virtual {p1, v1, v2, p2}, Lgp3;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object p1

    .line 39
    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_8

    .line 40
    new-instance p2, Landroid/webkit/WebResourceResponse;

    const-string v1, "application/javascript"

    new-instance v2, Ljava/io/ByteArrayInputStream;

    .line 41
    invoke-virtual {p1, v4}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object p1

    invoke-direct {v2, p1}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    invoke-direct {p2, v1, v4, v2}, Landroid/webkit/WebResourceResponse;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/io/InputStream;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_1 .. :try_end_1} :catch_0

    return-object p2

    :catch_0
    const/4 p1, 0x5

    .line 42
    invoke-static {p1}, Lgi2;->q0(I)Z

    :cond_8
    :goto_2
    return-object v0
.end method

.method public final shouldInterceptRequest(Landroid/webkit/WebView;Ljava/lang/String;)Landroid/webkit/WebResourceResponse;
    .locals 0

    .line 43
    sget-object p1, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    invoke-virtual {p0, p2, p1}, Lsg2;->h(Ljava/lang/String;Ljava/util/Map;)Landroid/webkit/WebResourceResponse;

    move-result-object p1

    return-object p1
.end method

.method public final shouldOverrideKeyEvent(Landroid/webkit/WebView;Landroid/view/KeyEvent;)Z
    .locals 0

    .line 1
    invoke-virtual {p2}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    const/16 p2, 0x4f

    .line 6
    .line 7
    if-eq p1, p2, :cond_0

    .line 8
    .line 9
    const/16 p2, 0xde

    .line 10
    .line 11
    if-eq p1, p2, :cond_0

    .line 12
    .line 13
    packed-switch p1, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    packed-switch p1, :pswitch_data_1

    .line 17
    .line 18
    .line 19
    const/4 p1, 0x0

    .line 20
    return p1

    .line 21
    :cond_0
    :pswitch_0
    const/4 p1, 0x1

    .line 22
    return p1

    .line 23
    :pswitch_data_0
    .packed-switch 0x55
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    :pswitch_data_1
    .packed-switch 0x7e
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z
    .locals 13

    .line 1
    const-string v0, "AdWebView shouldOverrideUrlLoading: "

    .line 2
    .line 3
    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, Lgi2;->G(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {v0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    const-string v2, "gmsg"

    .line 23
    .line 24
    invoke-virtual {v2, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    const/4 v2, 0x1

    .line 29
    if-eqz v1, :cond_0

    .line 30
    .line 31
    invoke-virtual {v0}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    const-string v3, "mobileads.google.com"

    .line 36
    .line 37
    invoke-virtual {v3, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-eqz v1, :cond_0

    .line 42
    .line 43
    invoke-virtual {p0, v0}, Lsg2;->l(Landroid/net/Uri;)V

    .line 44
    .line 45
    .line 46
    return v2

    .line 47
    :cond_0
    iget-boolean v1, p0, Lsg2;->q:Z

    .line 48
    .line 49
    iget-object v3, p0, Lsg2;->f:Ljg2;

    .line 50
    .line 51
    if-eqz v1, :cond_5

    .line 52
    .line 53
    iget-object v1, v3, Ljg2;->f:Log2;

    .line 54
    .line 55
    if-ne p1, v1, :cond_5

    .line 56
    .line 57
    invoke-virtual {v0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    const-string v4, "http"

    .line 62
    .line 63
    invoke-virtual {v4, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 64
    .line 65
    .line 66
    move-result v4

    .line 67
    if-nez v4, :cond_1

    .line 68
    .line 69
    const-string v4, "https"

    .line 70
    .line 71
    invoke-virtual {v4, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    if-eqz v1, :cond_5

    .line 76
    .line 77
    :cond_1
    iget-object v0, p0, Lsg2;->j:Lfd1;

    .line 78
    .line 79
    const/4 v1, 0x0

    .line 80
    if-eqz v0, :cond_3

    .line 81
    .line 82
    invoke-interface {v0}, Lfd1;->C()V

    .line 83
    .line 84
    .line 85
    iget-object v0, p0, Lsg2;->D:Lsb2;

    .line 86
    .line 87
    if-eqz v0, :cond_2

    .line 88
    .line 89
    check-cast v0, Lqb2;

    .line 90
    .line 91
    invoke-virtual {v0, p2}, Lqb2;->a(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    :cond_2
    iput-object v1, p0, Lsg2;->j:Lfd1;

    .line 95
    .line 96
    :cond_3
    iget-object v0, p0, Lsg2;->p:Lxp2;

    .line 97
    .line 98
    if-eqz v0, :cond_4

    .line 99
    .line 100
    invoke-interface {v0}, Lxp2;->s0()V

    .line 101
    .line 102
    .line 103
    iput-object v1, p0, Lsg2;->p:Lxp2;

    .line 104
    .line 105
    :cond_4
    invoke-super {p0, p1, p2}, Landroid/webkit/WebViewClient;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z

    .line 106
    .line 107
    .line 108
    move-result p1

    .line 109
    return p1

    .line 110
    :cond_5
    iget-object p1, v3, Ljg2;->f:Log2;

    .line 111
    .line 112
    iget-object v1, v3, Ljg2;->f:Log2;

    .line 113
    .line 114
    invoke-virtual {p1}, Landroid/view/View;->willNotDraw()Z

    .line 115
    .line 116
    .line 117
    move-result p1

    .line 118
    if-nez p1, :cond_a

    .line 119
    .line 120
    :try_start_0
    iget-object p1, v1, Log2;->g:Lvs1;

    .line 121
    .line 122
    iget-object v4, v1, Log2;->h:Lm83;

    .line 123
    .line 124
    sget-object v5, Lmz1;->Mc:Liz1;

    .line 125
    .line 126
    sget-object v6, Ltw1;->e:Ltw1;

    .line 127
    .line 128
    iget-object v6, v6, Ltw1;->c:Lkz1;

    .line 129
    .line 130
    invoke-virtual {v6, v5}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v5

    .line 134
    check-cast v5, Ljava/lang/Boolean;

    .line 135
    .line 136
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 137
    .line 138
    .line 139
    move-result v5

    .line 140
    if-eqz v5, :cond_6

    .line 141
    .line 142
    if-eqz v4, :cond_6

    .line 143
    .line 144
    if-eqz p1, :cond_7

    .line 145
    .line 146
    invoke-virtual {p1, v0}, Lvs1;->a(Landroid/net/Uri;)Z

    .line 147
    .line 148
    .line 149
    move-result p1

    .line 150
    if-eqz p1, :cond_7

    .line 151
    .line 152
    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 153
    .line 154
    .line 155
    move-result-object p1

    .line 156
    invoke-virtual {v3}, Ljg2;->g()Landroid/app/Activity;

    .line 157
    .line 158
    .line 159
    move-result-object v5

    .line 160
    invoke-virtual {v4, v0, p1, v3, v5}, Lm83;->a(Landroid/net/Uri;Landroid/content/Context;Landroid/view/View;Landroid/app/Activity;)Landroid/net/Uri;

    .line 161
    .line 162
    .line 163
    move-result-object v0

    .line 164
    goto :goto_0

    .line 165
    :cond_6
    if-eqz p1, :cond_7

    .line 166
    .line 167
    invoke-virtual {p1, v0}, Lvs1;->a(Landroid/net/Uri;)Z

    .line 168
    .line 169
    .line 170
    move-result v4

    .line 171
    if-eqz v4, :cond_7

    .line 172
    .line 173
    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 174
    .line 175
    .line 176
    move-result-object v4

    .line 177
    invoke-virtual {v3}, Ljg2;->g()Landroid/app/Activity;

    .line 178
    .line 179
    .line 180
    move-result-object v5

    .line 181
    invoke-virtual {p1, v0, v4, v3, v5}, Lvs1;->b(Landroid/net/Uri;Landroid/content/Context;Landroid/view/View;Landroid/app/Activity;)Landroid/net/Uri;

    .line 182
    .line 183
    .line 184
    move-result-object v0
    :try_end_0
    .catch Lws1; {:try_start_0 .. :try_end_0} :catch_0

    .line 185
    goto :goto_0

    .line 186
    :catch_0
    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object p1

    .line 190
    const-string v3, "Unable to append parameter to URL: "

    .line 191
    .line 192
    invoke-virtual {v3, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object p1

    .line 196
    invoke-static {p1}, Lgi2;->i0(Ljava/lang/String;)V

    .line 197
    .line 198
    .line 199
    :cond_7
    :goto_0
    iget-object p1, p0, Lsg2;->B:Lsu1;

    .line 200
    .line 201
    if-eqz p1, :cond_9

    .line 202
    .line 203
    invoke-virtual {p1}, Lsu1;->a()Z

    .line 204
    .line 205
    .line 206
    move-result v3

    .line 207
    if-eqz v3, :cond_8

    .line 208
    .line 209
    goto :goto_1

    .line 210
    :cond_8
    invoke-virtual {p1, p2}, Lsu1;->b(Ljava/lang/String;)V

    .line 211
    .line 212
    .line 213
    goto :goto_2

    .line 214
    :cond_9
    :goto_1
    new-instance v4, Lfc2;

    .line 215
    .line 216
    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    move-result-object v6

    .line 220
    const/4 v11, 0x0

    .line 221
    const/4 v12, 0x0

    .line 222
    const-string v5, "android.intent.action.VIEW"

    .line 223
    .line 224
    const/4 v7, 0x0

    .line 225
    const/4 v8, 0x0

    .line 226
    const/4 v9, 0x0

    .line 227
    const/4 v10, 0x0

    .line 228
    invoke-direct/range {v4 .. v12}, Lfc2;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lid1;)V

    .line 229
    .line 230
    .line 231
    invoke-virtual {v1}, Log2;->o()Ljava/lang/String;

    .line 232
    .line 233
    .line 234
    move-result-object p1

    .line 235
    const/4 p2, 0x0

    .line 236
    invoke-virtual {p0, v4, v2, p2, p1}, Lsg2;->d0(Lfc2;ZZLjava/lang/String;)V

    .line 237
    .line 238
    .line 239
    :goto_2
    return v2

    .line 240
    :cond_a
    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 241
    .line 242
    .line 243
    move-result-object p1

    .line 244
    const-string p2, "AdWebView unable to handle URL: "

    .line 245
    .line 246
    invoke-virtual {p2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 247
    .line 248
    .line 249
    move-result-object p1

    .line 250
    invoke-static {p1}, Lgi2;->i0(Ljava/lang/String;)V

    .line 251
    .line 252
    .line 253
    return v2
.end method
