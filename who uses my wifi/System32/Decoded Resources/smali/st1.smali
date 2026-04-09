.class public final Lst1;
.super Lhu1;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# static fields
.field public static final k:Lzs1;


# instance fields
.field public final h:Lyq1;

.field public final i:Landroid/content/Context;

.field public final j:Lt83;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lzs1;

    .line 2
    .line 3
    const/16 v1, 0xd

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lzs1;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lst1;->k:Lzs1;

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>(Ljt1;Lfr1;ILandroid/content/Context;Lyq1;Lt83;)V
    .locals 7

    .line 1
    const-string v3, "5ZNtOO3srzHnbl5PLlxEIuHlg0l+6HDun864hT7P5ko="

    .line 2
    .line 3
    const/16 v6, 0x1b

    .line 4
    .line 5
    const-string v2, "yYlfo3JOLIfvdgBq3U3deu0pC6YiXdEdqGnVULE/KCllAkaO/XSsVQU+sKDN/uG0"

    .line 6
    .line 7
    move-object v0, p0

    .line 8
    move-object v1, p1

    .line 9
    move-object v4, p2

    .line 10
    move v5, p3

    .line 11
    invoke-direct/range {v0 .. v6}, Lhu1;-><init>(Ljt1;Ljava/lang/String;Ljava/lang/String;Lfr1;II)V

    .line 12
    .line 13
    .line 14
    iput-object p4, v0, Lst1;->i:Landroid/content/Context;

    .line 15
    .line 16
    iput-object p5, v0, Lst1;->h:Lyq1;

    .line 17
    .line 18
    iput-object p6, v0, Lst1;->j:Lt83;

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 9

    .line 1
    sget-object v0, Lst1;->k:Lzs1;

    .line 2
    .line 3
    iget-object v1, p0, Lst1;->i:Landroid/content/Context;

    .line 4
    .line 5
    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    invoke-virtual {v0, v2}, Lzs1;->B(Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReference;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    monitor-enter v0

    .line 14
    :try_start_0
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    check-cast v2, Les1;

    .line 19
    .line 20
    const/4 v3, 0x0

    .line 21
    const/4 v4, 0x1

    .line 22
    if-eqz v2, :cond_2

    .line 23
    .line 24
    iget-object v5, v2, Les1;->t:Ljava/lang/String;

    .line 25
    .line 26
    sget-object v6, Llt1;->a:[C

    .line 27
    .line 28
    if-eqz v5, :cond_1

    .line 29
    .line 30
    invoke-virtual {v5}, Ljava/lang/String;->isEmpty()Z

    .line 31
    .line 32
    .line 33
    move-result v5

    .line 34
    if-eqz v5, :cond_0

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    move v5, v3

    .line 38
    goto :goto_1

    .line 39
    :cond_1
    :goto_0
    move v5, v4

    .line 40
    :goto_1
    if-nez v5, :cond_2

    .line 41
    .line 42
    iget-object v5, v2, Les1;->t:Ljava/lang/String;

    .line 43
    .line 44
    const-string v6, "E"

    .line 45
    .line 46
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v5

    .line 50
    if-nez v5, :cond_2

    .line 51
    .line 52
    iget-object v2, v2, Les1;->t:Ljava/lang/String;

    .line 53
    .line 54
    const-string v5, "0000000000000000000000000000000000000000000000000000000000000000"

    .line 55
    .line 56
    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    if-eqz v2, :cond_f

    .line 61
    .line 62
    goto :goto_2

    .line 63
    :catchall_0
    move-exception v1

    .line 64
    goto/16 :goto_c

    .line 65
    .line 66
    :cond_2
    :goto_2
    sget-object v2, Llt1;->a:[C

    .line 67
    .line 68
    iget-object v2, p0, Lst1;->j:Lt83;

    .line 69
    .line 70
    if-eqz v2, :cond_3

    .line 71
    .line 72
    invoke-virtual {p0}, Lst1;->c()Les1;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    goto/16 :goto_9

    .line 77
    .line 78
    :cond_3
    iget-object v2, p0, Lst1;->h:Lyq1;

    .line 79
    .line 80
    invoke-virtual {v2}, Lyq1;->A()Z

    .line 81
    .line 82
    .line 83
    move-result v2

    .line 84
    xor-int/2addr v2, v4

    .line 85
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    sget-object v5, Lmz1;->H2:Liz1;

    .line 90
    .line 91
    sget-object v6, Ltw1;->e:Ltw1;

    .line 92
    .line 93
    iget-object v7, v6, Ltw1;->c:Lkz1;

    .line 94
    .line 95
    invoke-virtual {v7, v5}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v5

    .line 99
    check-cast v5, Ljava/lang/Boolean;

    .line 100
    .line 101
    sget-object v7, Lmz1;->G2:Liz1;

    .line 102
    .line 103
    iget-object v6, v6, Ltw1;->c:Lkz1;

    .line 104
    .line 105
    invoke-virtual {v6, v7}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v6

    .line 109
    check-cast v6, Ljava/lang/Boolean;

    .line 110
    .line 111
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    .line 112
    .line 113
    .line 114
    move-result v6

    .line 115
    const/4 v7, 0x0

    .line 116
    if-eqz v6, :cond_4

    .line 117
    .line 118
    invoke-virtual {p0}, Lst1;->b()Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v6

    .line 122
    goto :goto_3

    .line 123
    :cond_4
    move-object v6, v7

    .line 124
    :goto_3
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 125
    .line 126
    .line 127
    move-result v5

    .line 128
    if-eqz v5, :cond_b

    .line 129
    .line 130
    iget-object v5, p0, Lhu1;->a:Ljt1;

    .line 131
    .line 132
    iget-boolean v5, v5, Ljt1;->l:Z

    .line 133
    .line 134
    if-eqz v5, :cond_b

    .line 135
    .line 136
    if-eqz v6, :cond_6

    .line 137
    .line 138
    invoke-virtual {v6}, Ljava/lang/String;->isEmpty()Z

    .line 139
    .line 140
    .line 141
    move-result v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 142
    if-eqz v5, :cond_5

    .line 143
    .line 144
    goto :goto_4

    .line 145
    :cond_5
    move v5, v3

    .line 146
    goto :goto_5

    .line 147
    :cond_6
    :goto_4
    move v5, v4

    .line 148
    :goto_5
    if-eqz v5, :cond_b

    .line 149
    .line 150
    :try_start_1
    iget-object v5, p0, Lhu1;->a:Ljt1;

    .line 151
    .line 152
    iget-object v6, v5, Ljt1;->j:Lvg0;

    .line 153
    .line 154
    if-eqz v6, :cond_7

    .line 155
    .line 156
    iget-object v8, v6, Lvg0;->g:Ljava/lang/Object;

    .line 157
    .line 158
    check-cast v8, Lar3;

    .line 159
    .line 160
    goto :goto_6

    .line 161
    :cond_7
    iget-object v8, v5, Ljt1;->i:Ljava/util/concurrent/Future;

    .line 162
    .line 163
    :goto_6
    if-eqz v8, :cond_9

    .line 164
    .line 165
    if-eqz v6, :cond_8

    .line 166
    .line 167
    iget-object v6, v6, Lvg0;->g:Ljava/lang/Object;

    .line 168
    .line 169
    check-cast v6, Lar3;

    .line 170
    .line 171
    goto :goto_7

    .line 172
    :cond_8
    iget-object v6, v5, Ljt1;->i:Ljava/util/concurrent/Future;

    .line 173
    .line 174
    :goto_7
    invoke-interface {v6}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    :cond_9
    invoke-virtual {v5}, Ljt1;->b()Lqr1;

    .line 178
    .line 179
    .line 180
    move-result-object v5

    .line 181
    if-eqz v5, :cond_a

    .line 182
    .line 183
    invoke-virtual {v5}, Lqr1;->a0()Z

    .line 184
    .line 185
    .line 186
    move-result v6

    .line 187
    if-eqz v6, :cond_a

    .line 188
    .line 189
    invoke-virtual {v5}, Lqr1;->v0()Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object v5
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 193
    move-object v6, v5

    .line 194
    goto :goto_8

    .line 195
    :catch_0
    :cond_a
    move-object v6, v7

    .line 196
    :cond_b
    :goto_8
    :try_start_2
    iget-object v5, p0, Lhu1;->e:Ljava/lang/reflect/Method;

    .line 197
    .line 198
    filled-new-array {v1, v2, v6}, [Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object v1

    .line 202
    invoke-virtual {v5, v7, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object v1

    .line 206
    check-cast v1, Ljava/lang/String;

    .line 207
    .line 208
    new-instance v2, Les1;

    .line 209
    .line 210
    invoke-direct {v2, v1}, Les1;-><init>(Ljava/lang/String;)V

    .line 211
    .line 212
    .line 213
    iget-object v1, v2, Les1;->t:Ljava/lang/String;

    .line 214
    .line 215
    if-eqz v1, :cond_c

    .line 216
    .line 217
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    .line 218
    .line 219
    .line 220
    move-result v1

    .line 221
    if-eqz v1, :cond_d

    .line 222
    .line 223
    :cond_c
    move v3, v4

    .line 224
    :cond_d
    if-nez v3, :cond_e

    .line 225
    .line 226
    iget-object v1, v2, Les1;->t:Ljava/lang/String;

    .line 227
    .line 228
    const-string v3, "E"

    .line 229
    .line 230
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 231
    .line 232
    .line 233
    move-result v1

    .line 234
    :cond_e
    move-object v1, v2

    .line 235
    :goto_9
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 236
    .line 237
    .line 238
    :cond_f
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 239
    .line 240
    .line 241
    move-result-object v1

    .line 242
    check-cast v1, Les1;

    .line 243
    .line 244
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 245
    iget-object v2, p0, Lhu1;->d:Lfr1;

    .line 246
    .line 247
    monitor-enter v2

    .line 248
    if-eqz v1, :cond_10

    .line 249
    .line 250
    :try_start_3
    iget-object v0, v1, Les1;->t:Ljava/lang/String;

    .line 251
    .line 252
    invoke-virtual {v2}, Ln54;->b()V

    .line 253
    .line 254
    .line 255
    iget-object v3, v2, Ln54;->g:Lp54;

    .line 256
    .line 257
    check-cast v3, Lqr1;

    .line 258
    .line 259
    invoke-virtual {v3, v0}, Lqr1;->S0(Ljava/lang/String;)V

    .line 260
    .line 261
    .line 262
    iget-wide v3, v1, Les1;->u:J

    .line 263
    .line 264
    invoke-virtual {v2}, Ln54;->b()V

    .line 265
    .line 266
    .line 267
    iget-object v0, v2, Ln54;->g:Lp54;

    .line 268
    .line 269
    check-cast v0, Lqr1;

    .line 270
    .line 271
    invoke-virtual {v0, v3, v4}, Lqr1;->F(J)V

    .line 272
    .line 273
    .line 274
    iget-object v0, v1, Les1;->v:Ljava/lang/String;

    .line 275
    .line 276
    invoke-virtual {v2}, Ln54;->b()V

    .line 277
    .line 278
    .line 279
    iget-object v3, v2, Ln54;->g:Lp54;

    .line 280
    .line 281
    check-cast v3, Lqr1;

    .line 282
    .line 283
    invoke-virtual {v3, v0}, Lqr1;->E(Ljava/lang/String;)V

    .line 284
    .line 285
    .line 286
    iget-object v0, v1, Les1;->w:Ljava/lang/String;

    .line 287
    .line 288
    invoke-virtual {v2}, Ln54;->b()V

    .line 289
    .line 290
    .line 291
    iget-object v3, v2, Ln54;->g:Lp54;

    .line 292
    .line 293
    check-cast v3, Lqr1;

    .line 294
    .line 295
    invoke-virtual {v3, v0}, Lqr1;->O(Ljava/lang/String;)V

    .line 296
    .line 297
    .line 298
    iget-object v0, v1, Les1;->x:Ljava/lang/String;

    .line 299
    .line 300
    invoke-virtual {v2}, Ln54;->b()V

    .line 301
    .line 302
    .line 303
    iget-object v1, v2, Ln54;->g:Lp54;

    .line 304
    .line 305
    check-cast v1, Lqr1;

    .line 306
    .line 307
    invoke-virtual {v1, v0}, Lqr1;->P(Ljava/lang/String;)V

    .line 308
    .line 309
    .line 310
    goto :goto_a

    .line 311
    :catchall_1
    move-exception v0

    .line 312
    goto :goto_b

    .line 313
    :cond_10
    :goto_a
    monitor-exit v2

    .line 314
    return-void

    .line 315
    :goto_b
    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 316
    throw v0

    .line 317
    :goto_c
    :try_start_4
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 318
    throw v1
.end method

.method public final b()Ljava/lang/String;
    .locals 5

    .line 1
    :try_start_0
    const-string v0, "X.509"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/security/cert/CertificateFactory;->getInstance(Ljava/lang/String;)Ljava/security/cert/CertificateFactory;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sget-object v1, Lmz1;->I2:Liz1;

    .line 8
    .line 9
    sget-object v2, Ltw1;->e:Ltw1;

    .line 10
    .line 11
    iget-object v3, v2, Ltw1;->c:Lkz1;

    .line 12
    .line 13
    invoke-virtual {v3, v1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Ljava/lang/String;

    .line 18
    .line 19
    invoke-static {v1}, Llt1;->a(Ljava/lang/String;)[B

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    new-instance v3, Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 26
    .line 27
    .line 28
    new-instance v4, Ljava/io/ByteArrayInputStream;

    .line 29
    .line 30
    invoke-direct {v4, v1}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, v4}, Ljava/security/cert/CertificateFactory;->generateCertificate(Ljava/io/InputStream;)Ljava/security/cert/Certificate;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    sget-object v1, Landroid/os/Build;->TYPE:Ljava/lang/String;

    .line 41
    .line 42
    const-string v4, "user"

    .line 43
    .line 44
    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    if-nez v1, :cond_0

    .line 49
    .line 50
    sget-object v1, Lmz1;->J2:Liz1;

    .line 51
    .line 52
    iget-object v2, v2, Ltw1;->c:Lkz1;

    .line 53
    .line 54
    invoke-virtual {v2, v1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    check-cast v1, Ljava/lang/String;

    .line 59
    .line 60
    invoke-static {v1}, Llt1;->a(Ljava/lang/String;)[B

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    new-instance v2, Ljava/io/ByteArrayInputStream;

    .line 65
    .line 66
    invoke-direct {v2, v1}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0, v2}, Ljava/security/cert/CertificateFactory;->generateCertificate(Ljava/io/InputStream;)Ljava/security/cert/Certificate;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    :cond_0
    iget-object v0, p0, Lst1;->i:Landroid/content/Context;

    .line 77
    .line 78
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    iget-object v2, p0, Lhu1;->a:Ljt1;

    .line 83
    .line 84
    iget-object v2, v2, Ljt1;->b:Ljava/util/concurrent/ExecutorService;

    .line 85
    .line 86
    invoke-static {v0, v1, v3}, Li30;->Z(Landroid/content/Context;Ljava/lang/String;Ljava/util/ArrayList;)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v0
    :try_end_0
    .catch Ljava/security/cert/CertificateEncodingException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/security/cert/CertificateException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NoClassDefFoundError; {:try_start_0 .. :try_end_0} :catch_0

    .line 90
    return-object v0

    .line 91
    :catch_0
    const/4 v0, 0x0

    .line 92
    return-object v0
.end method

.method public final c()Les1;
    .locals 5

    .line 1
    sget-object v0, Lmz1;->T2:Liz1;

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
    sget-object v0, Lmz1;->Z2:Liz1;

    .line 20
    .line 21
    iget-object v1, v1, Ltw1;->c:Lkz1;

    .line 22
    .line 23
    invoke-virtual {v1, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    check-cast v0, Ljava/lang/Integer;

    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    goto :goto_0

    .line 34
    :cond_0
    iget-object v0, p0, Lst1;->h:Lyq1;

    .line 35
    .line 36
    invoke-virtual {v0}, Lyq1;->B()I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    :goto_0
    iget-object v1, p0, Lhu1;->e:Ljava/lang/reflect/Method;

    .line 41
    .line 42
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 43
    .line 44
    const-string v3, ""

    .line 45
    .line 46
    iget-object v4, p0, Lst1;->i:Landroid/content/Context;

    .line 47
    .line 48
    filled-new-array {v4, v2, v3}, [Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    const/4 v3, 0x0

    .line 53
    invoke-virtual {v1, v3, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    check-cast v1, Ljava/lang/String;

    .line 58
    .line 59
    new-instance v2, Les1;

    .line 60
    .line 61
    invoke-direct {v2, v1}, Les1;-><init>(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    iget-object v1, p0, Lst1;->j:Lt83;

    .line 65
    .line 66
    if-eqz v1, :cond_1

    .line 67
    .line 68
    iget-object v1, v1, Lt83;->g:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v1, Lar3;

    .line 71
    .line 72
    if-eqz v1, :cond_1

    .line 73
    .line 74
    int-to-long v3, v0

    .line 75
    :try_start_0
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 76
    .line 77
    invoke-virtual {v1, v3, v4, v0}, Lgp3;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    check-cast v0, Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_0

    .line 82
    .line 83
    goto :goto_1

    .line 84
    :catch_0
    :cond_1
    const-string v0, "E"

    .line 85
    .line 86
    :goto_1
    iput-object v0, v2, Les1;->t:Ljava/lang/String;

    .line 87
    .line 88
    return-object v2
.end method
