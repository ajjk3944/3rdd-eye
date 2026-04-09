.class public final Lar;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# static fields
.field public static final b:Ltv2;

.field public static c:Ljava/lang/Boolean; = null

.field public static d:Ljava/lang/String; = null

.field public static e:Z = false

.field public static f:I = -0x1

.field public static g:Ljava/lang/Boolean;

.field public static final h:Ljava/lang/ThreadLocal;

.field public static final i:Ldu;

.field public static final j:Lsu2;

.field public static k:Lhe4;

.field public static l:Laf4;


# instance fields
.field public final a:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/ThreadLocal;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lar;->h:Ljava/lang/ThreadLocal;

    .line 7
    .line 8
    new-instance v0, Ldu;

    .line 9
    .line 10
    const/4 v1, 0x6

    .line 11
    invoke-direct {v0, v1}, Ldu;-><init>(I)V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lar;->i:Ldu;

    .line 15
    .line 16
    new-instance v0, Lsu2;

    .line 17
    .line 18
    const/4 v1, 0x2

    .line 19
    invoke-direct {v0, v1}, Lsu2;-><init>(I)V

    .line 20
    .line 21
    .line 22
    sput-object v0, Lar;->j:Lsu2;

    .line 23
    .line 24
    new-instance v0, Ltv2;

    .line 25
    .line 26
    const/4 v1, 0x5

    .line 27
    const/4 v2, 0x0

    .line 28
    invoke-direct {v0, v1, v2}, Ltv2;-><init>(IB)V

    .line 29
    .line 30
    .line 31
    sput-object v0, Lar;->b:Ltv2;

    .line 32
    .line 33
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lar;->a:Landroid/content/Context;

    .line 5
    .line 6
    return-void
.end method

.method public static a(Landroid/content/Context;)I
    .locals 8

    .line 1
    const-string v0, "\' didn\'t match expected id \'com.google.android.gms.ads.dynamite\'"

    .line 2
    .line 3
    const-string v1, "com.google.android.gms.ads.dynamite"

    .line 4
    .line 5
    const-string v2, "DynamiteModule"

    .line 6
    .line 7
    const-string v3, "Module descriptor id \'"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-virtual {p0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    const-string v5, "com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor"

    .line 19
    .line 20
    invoke-virtual {p0, v5}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    const-string v5, "MODULE_ID"

    .line 25
    .line 26
    invoke-virtual {p0, v5}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 27
    .line 28
    .line 29
    move-result-object v5

    .line 30
    const-string v6, "MODULE_VERSION"

    .line 31
    .line 32
    invoke-virtual {p0, v6}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    const/4 v6, 0x0

    .line 37
    invoke-virtual {v5, v6}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v7

    .line 41
    invoke-static {v7, v1}, La30;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    if-nez v1, :cond_0

    .line 46
    .line 47
    invoke-virtual {v5, v6}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    new-instance v1, Ljava/lang/StringBuilder;

    .line 56
    .line 57
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    invoke-static {v2, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 71
    .line 72
    .line 73
    return v4

    .line 74
    :catch_0
    move-exception p0

    .line 75
    goto :goto_0

    .line 76
    :cond_0
    invoke-virtual {p0, v6}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I

    .line 77
    .line 78
    .line 79
    move-result p0
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 80
    return p0

    .line 81
    :goto_0
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    const-string v0, "Failed to load module descriptor class: "

    .line 90
    .line 91
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    invoke-static {v2, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 96
    .line 97
    .line 98
    :catch_1
    return v4
.end method

.method public static c(Landroid/content/Context;Ltv2;)Lar;
    .locals 18

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    const-string v0, "No acceptable module com.google.android.gms.ads.dynamite found. Local version is "

    .line 6
    .line 7
    const-string v3, "VersionPolicy returned invalid code:"

    .line 8
    .line 9
    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 10
    .line 11
    .line 12
    move-result-object v4

    .line 13
    if-eqz v4, :cond_17

    .line 14
    .line 15
    sget-object v5, Lar;->h:Ljava/lang/ThreadLocal;

    .line 16
    .line 17
    invoke-virtual {v5}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v6

    .line 21
    check-cast v6, Lfd4;

    .line 22
    .line 23
    new-instance v7, Lfd4;

    .line 24
    .line 25
    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v5, v7}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    sget-object v8, Lar;->i:Ldu;

    .line 32
    .line 33
    invoke-virtual {v8}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v9

    .line 37
    check-cast v9, Ljava/lang/Long;

    .line 38
    .line 39
    invoke-virtual {v9}, Ljava/lang/Long;->longValue()J

    .line 40
    .line 41
    .line 42
    move-result-wide v10

    .line 43
    :try_start_0
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 44
    .line 45
    .line 46
    move-result-wide v14

    .line 47
    invoke-static {v14, v15}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 48
    .line 49
    .line 50
    move-result-object v14

    .line 51
    invoke-virtual {v8, v14}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    sget-object v8, Lar;->j:Lsu2;

    .line 55
    .line 56
    invoke-virtual {v2, v1, v8}, Ltv2;->e(Landroid/content/Context;Lyq;)Lzq;

    .line 57
    .line 58
    .line 59
    move-result-object v8

    .line 60
    iget v14, v8, Lzq;->a:I

    .line 61
    .line 62
    iget v15, v8, Lzq;->b:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_5

    .line 63
    .line 64
    const-wide/16 v16, 0x0

    .line 65
    .line 66
    :try_start_1
    iget v12, v8, Lzq;->c:I

    .line 67
    .line 68
    if-eqz v12, :cond_14

    .line 69
    .line 70
    const/4 v13, -0x1

    .line 71
    if-ne v12, v13, :cond_0

    .line 72
    .line 73
    if-eqz v14, :cond_14

    .line 74
    .line 75
    move v12, v13

    .line 76
    :cond_0
    const/4 v14, 0x1

    .line 77
    if-ne v12, v14, :cond_1

    .line 78
    .line 79
    if-eqz v15, :cond_14

    .line 80
    .line 81
    :cond_1
    if-ne v12, v13, :cond_2

    .line 82
    .line 83
    const-string v0, "com.google.android.gms.ads.dynamite"

    .line 84
    .line 85
    const-string v1, "Selected local version of "

    .line 86
    .line 87
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    new-instance v0, Lar;

    .line 91
    .line 92
    invoke-direct {v0, v4}, Lar;-><init>(Landroid/content/Context;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_4

    .line 93
    .line 94
    .line 95
    goto/16 :goto_9

    .line 96
    .line 97
    :cond_2
    if-ne v12, v14, :cond_13

    .line 98
    .line 99
    :try_start_2
    const-class v3, Lar;

    .line 100
    .line 101
    monitor-enter v3
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Lxq; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 102
    :try_start_3
    invoke-static {v1}, Lar;->g(Landroid/content/Context;)Z

    .line 103
    .line 104
    .line 105
    move-result v0

    .line 106
    if-eqz v0, :cond_f

    .line 107
    .line 108
    sget-object v0, Lar;->c:Ljava/lang/Boolean;

    .line 109
    .line 110
    monitor-exit v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 111
    if-eqz v0, :cond_e

    .line 112
    .line 113
    :try_start_4
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 114
    .line 115
    .line 116
    move-result v0

    .line 117
    const/4 v3, 0x2

    .line 118
    if-eqz v0, :cond_8

    .line 119
    .line 120
    const-class v12, Lar;

    .line 121
    .line 122
    monitor-enter v12
    :try_end_4
    .catch Landroid/os/RemoteException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Lxq; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 123
    :try_start_5
    sget-object v0, Lar;->l:Laf4;

    .line 124
    .line 125
    monitor-exit v12
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 126
    if-eqz v0, :cond_7

    .line 127
    .line 128
    :try_start_6
    invoke-virtual {v5}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v5

    .line 132
    check-cast v5, Lfd4;

    .line 133
    .line 134
    if-eqz v5, :cond_6

    .line 135
    .line 136
    iget-object v12, v5, Lfd4;->a:Landroid/database/Cursor;

    .line 137
    .line 138
    if-eqz v12, :cond_6

    .line 139
    .line 140
    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 141
    .line 142
    .line 143
    move-result-object v12

    .line 144
    iget-object v5, v5, Lfd4;->a:Landroid/database/Cursor;

    .line 145
    .line 146
    new-instance v14, Loi0;

    .line 147
    .line 148
    const/4 v13, 0x0

    .line 149
    invoke-direct {v14, v13}, Loi0;-><init>(Ljava/lang/Object;)V

    .line 150
    .line 151
    .line 152
    const-class v13, Lar;

    .line 153
    .line 154
    monitor-enter v13
    :try_end_6
    .catch Landroid/os/RemoteException; {:try_start_6 .. :try_end_6} :catch_1
    .catch Lxq; {:try_start_6 .. :try_end_6} :catch_0
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 155
    :try_start_7
    sget v14, Lar;->f:I

    .line 156
    .line 157
    if-lt v14, v3, :cond_3

    .line 158
    .line 159
    const/4 v14, 0x1

    .line 160
    goto :goto_0

    .line 161
    :cond_3
    const/4 v14, 0x0

    .line 162
    :goto_0
    monitor-exit v13
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 163
    if-eqz v14, :cond_4

    .line 164
    .line 165
    :try_start_8
    new-instance v3, Loi0;

    .line 166
    .line 167
    invoke-direct {v3, v12}, Loi0;-><init>(Ljava/lang/Object;)V

    .line 168
    .line 169
    .line 170
    new-instance v12, Loi0;

    .line 171
    .line 172
    invoke-direct {v12, v5}, Loi0;-><init>(Ljava/lang/Object;)V

    .line 173
    .line 174
    .line 175
    invoke-virtual {v0, v3, v15, v12}, Laf4;->B1(Loi0;ILoi0;)Lu10;

    .line 176
    .line 177
    .line 178
    move-result-object v0

    .line 179
    goto :goto_1

    .line 180
    :catchall_0
    move-exception v0

    .line 181
    goto/16 :goto_5

    .line 182
    .line 183
    :catch_0
    move-exception v0

    .line 184
    goto/16 :goto_6

    .line 185
    .line 186
    :catch_1
    move-exception v0

    .line 187
    goto/16 :goto_7

    .line 188
    .line 189
    :cond_4
    new-instance v3, Loi0;

    .line 190
    .line 191
    invoke-direct {v3, v12}, Loi0;-><init>(Ljava/lang/Object;)V

    .line 192
    .line 193
    .line 194
    new-instance v12, Loi0;

    .line 195
    .line 196
    invoke-direct {v12, v5}, Loi0;-><init>(Ljava/lang/Object;)V

    .line 197
    .line 198
    .line 199
    invoke-virtual {v0, v3, v15, v12}, Laf4;->l1(Loi0;ILoi0;)Lu10;

    .line 200
    .line 201
    .line 202
    move-result-object v0

    .line 203
    :goto_1
    invoke-static {v0}, Loi0;->l1(Lu10;)Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object v0

    .line 207
    check-cast v0, Landroid/content/Context;

    .line 208
    .line 209
    if-eqz v0, :cond_5

    .line 210
    .line 211
    new-instance v3, Lar;

    .line 212
    .line 213
    invoke-direct {v3, v0}, Lar;-><init>(Landroid/content/Context;)V

    .line 214
    .line 215
    .line 216
    :goto_2
    move-object v0, v3

    .line 217
    goto/16 :goto_9

    .line 218
    .line 219
    :cond_5
    new-instance v0, Lxq;

    .line 220
    .line 221
    const-string v3, "Failed to get module context"

    .line 222
    .line 223
    invoke-direct {v0, v3}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 224
    .line 225
    .line 226
    throw v0
    :try_end_8
    .catch Landroid/os/RemoteException; {:try_start_8 .. :try_end_8} :catch_1
    .catch Lxq; {:try_start_8 .. :try_end_8} :catch_0
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 227
    :catchall_1
    move-exception v0

    .line 228
    :try_start_9
    monitor-exit v13
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    .line 229
    :try_start_a
    throw v0

    .line 230
    :cond_6
    new-instance v0, Lxq;

    .line 231
    .line 232
    const-string v3, "No result cursor"

    .line 233
    .line 234
    invoke-direct {v0, v3}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 235
    .line 236
    .line 237
    throw v0

    .line 238
    :cond_7
    new-instance v0, Lxq;

    .line 239
    .line 240
    const-string v3, "DynamiteLoaderV2 was not cached."

    .line 241
    .line 242
    invoke-direct {v0, v3}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 243
    .line 244
    .line 245
    throw v0
    :try_end_a
    .catch Landroid/os/RemoteException; {:try_start_a .. :try_end_a} :catch_1
    .catch Lxq; {:try_start_a .. :try_end_a} :catch_0
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    .line 246
    :catchall_2
    move-exception v0

    .line 247
    :try_start_b
    monitor-exit v12
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_2

    .line 248
    :try_start_c
    throw v0

    .line 249
    :cond_8
    invoke-static {v1}, Lar;->h(Landroid/content/Context;)Lhe4;

    .line 250
    .line 251
    .line 252
    move-result-object v0

    .line 253
    if-eqz v0, :cond_d

    .line 254
    .line 255
    invoke-virtual {v0}, Lsb1;->U()Landroid/os/Parcel;

    .line 256
    .line 257
    .line 258
    move-result-object v12

    .line 259
    const/4 v13, 0x6

    .line 260
    invoke-virtual {v0, v12, v13}, Lsb1;->T(Landroid/os/Parcel;I)Landroid/os/Parcel;

    .line 261
    .line 262
    .line 263
    move-result-object v12

    .line 264
    invoke-virtual {v12}, Landroid/os/Parcel;->readInt()I

    .line 265
    .line 266
    .line 267
    move-result v13

    .line 268
    invoke-virtual {v12}, Landroid/os/Parcel;->recycle()V

    .line 269
    .line 270
    .line 271
    const/4 v12, 0x3

    .line 272
    if-lt v13, v12, :cond_a

    .line 273
    .line 274
    invoke-virtual {v5}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 275
    .line 276
    .line 277
    move-result-object v3

    .line 278
    check-cast v3, Lfd4;

    .line 279
    .line 280
    if-eqz v3, :cond_9

    .line 281
    .line 282
    new-instance v5, Loi0;

    .line 283
    .line 284
    invoke-direct {v5, v1}, Loi0;-><init>(Ljava/lang/Object;)V

    .line 285
    .line 286
    .line 287
    iget-object v3, v3, Lfd4;->a:Landroid/database/Cursor;

    .line 288
    .line 289
    new-instance v12, Loi0;

    .line 290
    .line 291
    invoke-direct {v12, v3}, Loi0;-><init>(Ljava/lang/Object;)V

    .line 292
    .line 293
    .line 294
    invoke-virtual {v0, v5, v15, v12}, Lhe4;->B1(Loi0;ILoi0;)Lu10;

    .line 295
    .line 296
    .line 297
    move-result-object v0

    .line 298
    goto :goto_3

    .line 299
    :cond_9
    new-instance v0, Lxq;

    .line 300
    .line 301
    const-string v3, "No cached result cursor holder"

    .line 302
    .line 303
    invoke-direct {v0, v3}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 304
    .line 305
    .line 306
    throw v0

    .line 307
    :cond_a
    if-ne v13, v3, :cond_b

    .line 308
    .line 309
    new-instance v3, Loi0;

    .line 310
    .line 311
    invoke-direct {v3, v1}, Loi0;-><init>(Ljava/lang/Object;)V

    .line 312
    .line 313
    .line 314
    invoke-virtual {v0, v3, v15}, Lhe4;->E1(Loi0;I)Lu10;

    .line 315
    .line 316
    .line 317
    move-result-object v0

    .line 318
    goto :goto_3

    .line 319
    :cond_b
    new-instance v3, Loi0;

    .line 320
    .line 321
    invoke-direct {v3, v1}, Loi0;-><init>(Ljava/lang/Object;)V

    .line 322
    .line 323
    .line 324
    invoke-virtual {v0, v3, v15}, Lhe4;->l1(Loi0;I)Lu10;

    .line 325
    .line 326
    .line 327
    move-result-object v0

    .line 328
    :goto_3
    invoke-static {v0}, Loi0;->l1(Lu10;)Ljava/lang/Object;

    .line 329
    .line 330
    .line 331
    move-result-object v0

    .line 332
    if-eqz v0, :cond_c

    .line 333
    .line 334
    new-instance v3, Lar;

    .line 335
    .line 336
    check-cast v0, Landroid/content/Context;

    .line 337
    .line 338
    invoke-direct {v3, v0}, Lar;-><init>(Landroid/content/Context;)V

    .line 339
    .line 340
    .line 341
    goto :goto_2

    .line 342
    :cond_c
    new-instance v0, Lxq;

    .line 343
    .line 344
    const-string v3, "Failed to load remote module."

    .line 345
    .line 346
    invoke-direct {v0, v3}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 347
    .line 348
    .line 349
    throw v0

    .line 350
    :cond_d
    new-instance v0, Lxq;

    .line 351
    .line 352
    const-string v3, "Failed to create IDynamiteLoader."

    .line 353
    .line 354
    invoke-direct {v0, v3}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 355
    .line 356
    .line 357
    throw v0

    .line 358
    :cond_e
    new-instance v0, Lxq;

    .line 359
    .line 360
    const-string v3, "Failed to determine which loading route to use."

    .line 361
    .line 362
    invoke-direct {v0, v3}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 363
    .line 364
    .line 365
    throw v0
    :try_end_c
    .catch Landroid/os/RemoteException; {:try_start_c .. :try_end_c} :catch_1
    .catch Lxq; {:try_start_c .. :try_end_c} :catch_0
    .catchall {:try_start_c .. :try_end_c} :catchall_0

    .line 366
    :catchall_3
    move-exception v0

    .line 367
    goto :goto_4

    .line 368
    :cond_f
    :try_start_d
    new-instance v0, Lxq;

    .line 369
    .line 370
    const-string v5, "Remote loading disabled"

    .line 371
    .line 372
    invoke-direct {v0, v5}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 373
    .line 374
    .line 375
    throw v0

    .line 376
    :goto_4
    monitor-exit v3
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_3

    .line 377
    :try_start_e
    throw v0
    :try_end_e
    .catch Landroid/os/RemoteException; {:try_start_e .. :try_end_e} :catch_1
    .catch Lxq; {:try_start_e .. :try_end_e} :catch_0
    .catchall {:try_start_e .. :try_end_e} :catchall_0

    .line 378
    :goto_5
    :try_start_f
    invoke-static {v1, v0}, Lm54;->a(Landroid/content/Context;Ljava/lang/Throwable;)V

    .line 379
    .line 380
    .line 381
    new-instance v3, Lxq;

    .line 382
    .line 383
    const-string v5, "Failed to load remote module."

    .line 384
    .line 385
    invoke-direct {v3, v5, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 386
    .line 387
    .line 388
    throw v3

    .line 389
    :catchall_4
    move-exception v0

    .line 390
    goto/16 :goto_b

    .line 391
    .line 392
    :catch_2
    move-exception v0

    .line 393
    goto :goto_8

    .line 394
    :goto_6
    throw v0

    .line 395
    :goto_7
    new-instance v3, Lxq;

    .line 396
    .line 397
    const-string v5, "Failed to load remote module."

    .line 398
    .line 399
    invoke-direct {v3, v5, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 400
    .line 401
    .line 402
    throw v3
    :try_end_f
    .catch Lxq; {:try_start_f .. :try_end_f} :catch_2
    .catchall {:try_start_f .. :try_end_f} :catchall_4

    .line 403
    :goto_8
    :try_start_10
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 404
    .line 405
    .line 406
    iget v3, v8, Lzq;->a:I

    .line 407
    .line 408
    if-eqz v3, :cond_12

    .line 409
    .line 410
    new-instance v5, Lh80;

    .line 411
    .line 412
    const/16 v8, 0xc

    .line 413
    .line 414
    invoke-direct {v5, v3, v8}, Lh80;-><init>(II)V

    .line 415
    .line 416
    .line 417
    invoke-virtual {v2, v1, v5}, Ltv2;->e(Landroid/content/Context;Lyq;)Lzq;

    .line 418
    .line 419
    .line 420
    move-result-object v1

    .line 421
    iget v1, v1, Lzq;->c:I

    .line 422
    .line 423
    const/4 v2, -0x1

    .line 424
    if-ne v1, v2, :cond_12

    .line 425
    .line 426
    const-string v0, "com.google.android.gms.ads.dynamite"

    .line 427
    .line 428
    const-string v1, "Selected local version of "

    .line 429
    .line 430
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 431
    .line 432
    .line 433
    new-instance v0, Lar;

    .line 434
    .line 435
    invoke-direct {v0, v4}, Lar;-><init>(Landroid/content/Context;)V
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_4

    .line 436
    .line 437
    .line 438
    :goto_9
    cmp-long v1, v10, v16

    .line 439
    .line 440
    if-nez v1, :cond_10

    .line 441
    .line 442
    sget-object v1, Lar;->i:Ldu;

    .line 443
    .line 444
    invoke-virtual {v1}, Ljava/lang/ThreadLocal;->remove()V

    .line 445
    .line 446
    .line 447
    goto :goto_a

    .line 448
    :cond_10
    sget-object v1, Lar;->i:Ldu;

    .line 449
    .line 450
    invoke-virtual {v1, v9}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 451
    .line 452
    .line 453
    :goto_a
    iget-object v1, v7, Lfd4;->a:Landroid/database/Cursor;

    .line 454
    .line 455
    if-eqz v1, :cond_11

    .line 456
    .line 457
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 458
    .line 459
    .line 460
    :cond_11
    sget-object v1, Lar;->h:Ljava/lang/ThreadLocal;

    .line 461
    .line 462
    invoke-virtual {v1, v6}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 463
    .line 464
    .line 465
    return-object v0

    .line 466
    :cond_12
    :try_start_11
    new-instance v1, Lxq;

    .line 467
    .line 468
    const-string v2, "Remote load failed. No local fallback found."

    .line 469
    .line 470
    invoke-direct {v1, v2, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 471
    .line 472
    .line 473
    throw v1

    .line 474
    :cond_13
    new-instance v0, Lxq;

    .line 475
    .line 476
    new-instance v1, Ljava/lang/StringBuilder;

    .line 477
    .line 478
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 479
    .line 480
    .line 481
    invoke-virtual {v1, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 482
    .line 483
    .line 484
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 485
    .line 486
    .line 487
    move-result-object v1

    .line 488
    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 489
    .line 490
    .line 491
    throw v0

    .line 492
    :cond_14
    new-instance v1, Lxq;

    .line 493
    .line 494
    iget v2, v8, Lzq;->a:I

    .line 495
    .line 496
    iget v3, v8, Lzq;->b:I

    .line 497
    .line 498
    new-instance v4, Ljava/lang/StringBuilder;

    .line 499
    .line 500
    invoke-direct {v4, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 501
    .line 502
    .line 503
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 504
    .line 505
    .line 506
    const-string v0, " and remote version is "

    .line 507
    .line 508
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 509
    .line 510
    .line 511
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 512
    .line 513
    .line 514
    const-string v0, "."

    .line 515
    .line 516
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 517
    .line 518
    .line 519
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 520
    .line 521
    .line 522
    move-result-object v0

    .line 523
    invoke-direct {v1, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 524
    .line 525
    .line 526
    throw v1
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_4

    .line 527
    :catchall_5
    move-exception v0

    .line 528
    const-wide/16 v16, 0x0

    .line 529
    .line 530
    :goto_b
    cmp-long v1, v10, v16

    .line 531
    .line 532
    if-nez v1, :cond_15

    .line 533
    .line 534
    sget-object v1, Lar;->i:Ldu;

    .line 535
    .line 536
    invoke-virtual {v1}, Ljava/lang/ThreadLocal;->remove()V

    .line 537
    .line 538
    .line 539
    goto :goto_c

    .line 540
    :cond_15
    sget-object v1, Lar;->i:Ldu;

    .line 541
    .line 542
    invoke-virtual {v1, v9}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 543
    .line 544
    .line 545
    :goto_c
    iget-object v1, v7, Lfd4;->a:Landroid/database/Cursor;

    .line 546
    .line 547
    if-eqz v1, :cond_16

    .line 548
    .line 549
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 550
    .line 551
    .line 552
    :cond_16
    sget-object v1, Lar;->h:Ljava/lang/ThreadLocal;

    .line 553
    .line 554
    invoke-virtual {v1, v6}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 555
    .line 556
    .line 557
    throw v0

    .line 558
    :cond_17
    new-instance v0, Lxq;

    .line 559
    .line 560
    const-string v1, "null application Context"

    .line 561
    .line 562
    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 563
    .line 564
    .line 565
    throw v0
.end method

.method public static d(Landroid/content/Context;Z)I
    .locals 12

    .line 1
    const-string v0, "com.google.android.gms.ads.dynamite"

    .line 2
    .line 3
    :try_start_0
    const-class v1, Lar;

    .line 4
    .line 5
    monitor-enter v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 6
    :try_start_1
    sget-object v2, Lar;->c:Ljava/lang/Boolean;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 7
    .line 8
    const/4 v3, 0x1

    .line 9
    const/4 v4, 0x0

    .line 10
    const/4 v5, 0x0

    .line 11
    if-nez v2, :cond_9

    .line 12
    .line 13
    :try_start_2
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-virtual {v2}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    const-class v6, Lcom/google/android/gms/dynamite/DynamiteModule$DynamiteLoaderClassLoader;

    .line 22
    .line 23
    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v6

    .line 27
    invoke-virtual {v2, v6}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    const-string v6, "sClassLoader"

    .line 32
    .line 33
    invoke-virtual {v2, v6}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    invoke-virtual {v2}, Ljava/lang/reflect/Field;->getDeclaringClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    move-result-object v6

    .line 41
    monitor-enter v6
    :try_end_2
    .catch Ljava/lang/ClassNotFoundException; {:try_start_2 .. :try_end_2} :catch_4
    .catch Ljava/lang/IllegalAccessException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljava/lang/NoSuchFieldException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 42
    :try_start_3
    invoke-virtual {v2, v4}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v7

    .line 46
    check-cast v7, Ljava/lang/ClassLoader;

    .line 47
    .line 48
    invoke-static {}, Ljava/lang/ClassLoader;->getSystemClassLoader()Ljava/lang/ClassLoader;

    .line 49
    .line 50
    .line 51
    move-result-object v8

    .line 52
    if-ne v7, v8, :cond_0

    .line 53
    .line 54
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 55
    .line 56
    goto/16 :goto_3

    .line 57
    .line 58
    :catchall_0
    move-exception v2

    .line 59
    goto/16 :goto_4

    .line 60
    .line 61
    :cond_0
    if-eqz v7, :cond_1

    .line 62
    .line 63
    :try_start_4
    invoke-static {v7}, Lar;->f(Ljava/lang/ClassLoader;)V
    :try_end_4
    .catch Lxq; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 64
    .line 65
    .line 66
    :catch_0
    :try_start_5
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 67
    .line 68
    goto/16 :goto_3

    .line 69
    .line 70
    :cond_1
    invoke-static {p0}, Lar;->g(Landroid/content/Context;)Z

    .line 71
    .line 72
    .line 73
    move-result v7

    .line 74
    if-nez v7, :cond_2

    .line 75
    .line 76
    monitor-exit v6
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 77
    :try_start_6
    monitor-exit v1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 78
    return v5

    .line 79
    :catchall_1
    move-exception p1

    .line 80
    goto/16 :goto_12

    .line 81
    .line 82
    :cond_2
    :try_start_7
    sget-boolean v7, Lar;->e:Z

    .line 83
    .line 84
    if-nez v7, :cond_8

    .line 85
    .line 86
    sget-object v7, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 87
    .line 88
    invoke-virtual {v7, v4}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result v8
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 92
    if-eqz v8, :cond_3

    .line 93
    .line 94
    goto :goto_2

    .line 95
    :cond_3
    :try_start_8
    invoke-static {p0, p1, v3}, Lar;->e(Landroid/content/Context;ZZ)I

    .line 96
    .line 97
    .line 98
    move-result v8

    .line 99
    sget-object v9, Lar;->d:Ljava/lang/String;

    .line 100
    .line 101
    if-eqz v9, :cond_7

    .line 102
    .line 103
    invoke-virtual {v9}, Ljava/lang/String;->isEmpty()Z

    .line 104
    .line 105
    .line 106
    move-result v9

    .line 107
    if-eqz v9, :cond_4

    .line 108
    .line 109
    goto :goto_1

    .line 110
    :cond_4
    invoke-static {}, Lou1;->E()Ljava/lang/ClassLoader;

    .line 111
    .line 112
    .line 113
    move-result-object v9

    .line 114
    if-eqz v9, :cond_5

    .line 115
    .line 116
    goto :goto_0

    .line 117
    :cond_5
    sget v9, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 118
    .line 119
    const/16 v10, 0x1d

    .line 120
    .line 121
    if-lt v9, v10, :cond_6

    .line 122
    .line 123
    invoke-static {}, Lwq;->b()V

    .line 124
    .line 125
    .line 126
    sget-object v9, Lar;->d:Ljava/lang/String;

    .line 127
    .line 128
    invoke-static {v9}, Lou1;->j(Ljava/lang/Object;)V

    .line 129
    .line 130
    .line 131
    invoke-static {}, Ljava/lang/ClassLoader;->getSystemClassLoader()Ljava/lang/ClassLoader;

    .line 132
    .line 133
    .line 134
    move-result-object v10

    .line 135
    invoke-static {v10, v9}, Lwq;->a(Ljava/lang/ClassLoader;Ljava/lang/String;)Ldalvik/system/DelegateLastClassLoader;

    .line 136
    .line 137
    .line 138
    move-result-object v9

    .line 139
    goto :goto_0

    .line 140
    :cond_6
    new-instance v9, Lyb2;

    .line 141
    .line 142
    sget-object v10, Lar;->d:Ljava/lang/String;

    .line 143
    .line 144
    invoke-static {v10}, Lou1;->j(Ljava/lang/Object;)V

    .line 145
    .line 146
    .line 147
    invoke-static {}, Ljava/lang/ClassLoader;->getSystemClassLoader()Ljava/lang/ClassLoader;

    .line 148
    .line 149
    .line 150
    move-result-object v11

    .line 151
    invoke-direct {v9, v10, v11}, Ldalvik/system/PathClassLoader;-><init>(Ljava/lang/String;Ljava/lang/ClassLoader;)V

    .line 152
    .line 153
    .line 154
    :goto_0
    invoke-static {v9}, Lar;->f(Ljava/lang/ClassLoader;)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {v2, v4, v9}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 158
    .line 159
    .line 160
    sput-object v7, Lar;->c:Ljava/lang/Boolean;
    :try_end_8
    .catch Lxq; {:try_start_8 .. :try_end_8} :catch_1
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 161
    .line 162
    :try_start_9
    monitor-exit v6
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    .line 163
    :try_start_a
    monitor-exit v1
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_1

    .line 164
    return v8

    .line 165
    :cond_7
    :goto_1
    :try_start_b
    monitor-exit v6
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_0

    .line 166
    :try_start_c
    monitor-exit v1
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_1

    .line 167
    return v8

    .line 168
    :catch_1
    :try_start_d
    invoke-static {}, Ljava/lang/ClassLoader;->getSystemClassLoader()Ljava/lang/ClassLoader;

    .line 169
    .line 170
    .line 171
    move-result-object v7

    .line 172
    invoke-virtual {v2, v4, v7}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 173
    .line 174
    .line 175
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 176
    .line 177
    goto :goto_3

    .line 178
    :cond_8
    :goto_2
    invoke-static {}, Ljava/lang/ClassLoader;->getSystemClassLoader()Ljava/lang/ClassLoader;

    .line 179
    .line 180
    .line 181
    move-result-object v7

    .line 182
    invoke-virtual {v2, v4, v7}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 183
    .line 184
    .line 185
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 186
    .line 187
    :goto_3
    monitor-exit v6

    .line 188
    goto :goto_6

    .line 189
    :goto_4
    monitor-exit v6
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_0

    .line 190
    :try_start_e
    throw v2
    :try_end_e
    .catch Ljava/lang/ClassNotFoundException; {:try_start_e .. :try_end_e} :catch_4
    .catch Ljava/lang/IllegalAccessException; {:try_start_e .. :try_end_e} :catch_3
    .catch Ljava/lang/NoSuchFieldException; {:try_start_e .. :try_end_e} :catch_2
    .catchall {:try_start_e .. :try_end_e} :catchall_1

    .line 191
    :catch_2
    move-exception v2

    .line 192
    goto :goto_5

    .line 193
    :catch_3
    move-exception v2

    .line 194
    goto :goto_5

    .line 195
    :catch_4
    move-exception v2

    .line 196
    :goto_5
    :try_start_f
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 200
    .line 201
    :goto_6
    sput-object v2, Lar;->c:Ljava/lang/Boolean;

    .line 202
    .line 203
    :cond_9
    monitor-exit v1
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_1

    .line 204
    :try_start_10
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 205
    .line 206
    .line 207
    move-result v1
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_2

    .line 208
    if-eqz v1, :cond_a

    .line 209
    .line 210
    :try_start_11
    invoke-static {p0, p1, v5}, Lar;->e(Landroid/content/Context;ZZ)I

    .line 211
    .line 212
    .line 213
    move-result p0
    :try_end_11
    .catch Lxq; {:try_start_11 .. :try_end_11} :catch_5
    .catchall {:try_start_11 .. :try_end_11} :catchall_2

    .line 214
    return p0

    .line 215
    :catchall_2
    move-exception p1

    .line 216
    goto/16 :goto_13

    .line 217
    .line 218
    :catch_5
    move-exception p1

    .line 219
    :try_start_12
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 220
    .line 221
    .line 222
    return v5

    .line 223
    :cond_a
    invoke-static {p0}, Lar;->h(Landroid/content/Context;)Lhe4;

    .line 224
    .line 225
    .line 226
    move-result-object v1
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_2

    .line 227
    if-nez v1, :cond_b

    .line 228
    .line 229
    goto/16 :goto_10

    .line 230
    .line 231
    :cond_b
    :try_start_13
    invoke-virtual {v1}, Lsb1;->U()Landroid/os/Parcel;

    .line 232
    .line 233
    .line 234
    move-result-object v2

    .line 235
    const/4 v6, 0x6

    .line 236
    invoke-virtual {v1, v2, v6}, Lsb1;->T(Landroid/os/Parcel;I)Landroid/os/Parcel;

    .line 237
    .line 238
    .line 239
    move-result-object v2

    .line 240
    invoke-virtual {v2}, Landroid/os/Parcel;->readInt()I

    .line 241
    .line 242
    .line 243
    move-result v6

    .line 244
    invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V

    .line 245
    .line 246
    .line 247
    const/4 v2, 0x3

    .line 248
    if-lt v6, v2, :cond_12

    .line 249
    .line 250
    sget-object v0, Lar;->h:Ljava/lang/ThreadLocal;

    .line 251
    .line 252
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 253
    .line 254
    .line 255
    move-result-object v2

    .line 256
    check-cast v2, Lfd4;

    .line 257
    .line 258
    if-eqz v2, :cond_c

    .line 259
    .line 260
    iget-object v2, v2, Lfd4;->a:Landroid/database/Cursor;

    .line 261
    .line 262
    if-eqz v2, :cond_c

    .line 263
    .line 264
    invoke-interface {v2, v5}, Landroid/database/Cursor;->getInt(I)I

    .line 265
    .line 266
    .line 267
    move-result v5

    .line 268
    goto/16 :goto_10

    .line 269
    .line 270
    :catchall_3
    move-exception p1

    .line 271
    goto/16 :goto_d

    .line 272
    .line 273
    :catch_6
    move-exception p1

    .line 274
    goto/16 :goto_e

    .line 275
    .line 276
    :cond_c
    new-instance v2, Loi0;

    .line 277
    .line 278
    invoke-direct {v2, p0}, Loi0;-><init>(Ljava/lang/Object;)V

    .line 279
    .line 280
    .line 281
    sget-object v6, Lar;->i:Ldu;

    .line 282
    .line 283
    invoke-virtual {v6}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 284
    .line 285
    .line 286
    move-result-object v6

    .line 287
    check-cast v6, Ljava/lang/Long;

    .line 288
    .line 289
    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    .line 290
    .line 291
    .line 292
    move-result-wide v6

    .line 293
    invoke-virtual {v1, v2, p1, v6, v7}, Lhe4;->G1(Loi0;ZJ)Lu10;

    .line 294
    .line 295
    .line 296
    move-result-object p1

    .line 297
    invoke-static {p1}, Loi0;->l1(Lu10;)Ljava/lang/Object;

    .line 298
    .line 299
    .line 300
    move-result-object p1

    .line 301
    check-cast p1, Landroid/database/Cursor;
    :try_end_13
    .catch Landroid/os/RemoteException; {:try_start_13 .. :try_end_13} :catch_6
    .catchall {:try_start_13 .. :try_end_13} :catchall_3

    .line 302
    .line 303
    if-eqz p1, :cond_11

    .line 304
    .line 305
    :try_start_14
    invoke-interface {p1}, Landroid/database/Cursor;->moveToFirst()Z

    .line 306
    .line 307
    .line 308
    move-result v1

    .line 309
    if-nez v1, :cond_d

    .line 310
    .line 311
    goto :goto_b

    .line 312
    :cond_d
    invoke-interface {p1, v5}, Landroid/database/Cursor;->getInt(I)I

    .line 313
    .line 314
    .line 315
    move-result v1

    .line 316
    if-lez v1, :cond_f

    .line 317
    .line 318
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 319
    .line 320
    .line 321
    move-result-object v0

    .line 322
    check-cast v0, Lfd4;

    .line 323
    .line 324
    if-eqz v0, :cond_e

    .line 325
    .line 326
    iget-object v2, v0, Lfd4;->a:Landroid/database/Cursor;

    .line 327
    .line 328
    if-nez v2, :cond_e

    .line 329
    .line 330
    iput-object p1, v0, Lfd4;->a:Landroid/database/Cursor;
    :try_end_14
    .catch Landroid/os/RemoteException; {:try_start_14 .. :try_end_14} :catch_7
    .catchall {:try_start_14 .. :try_end_14} :catchall_4

    .line 331
    .line 332
    goto :goto_7

    .line 333
    :cond_e
    move v3, v5

    .line 334
    :goto_7
    if-eqz v3, :cond_f

    .line 335
    .line 336
    goto :goto_8

    .line 337
    :cond_f
    move-object v4, p1

    .line 338
    :goto_8
    if-eqz v4, :cond_10

    .line 339
    .line 340
    :try_start_15
    invoke-interface {v4}, Landroid/database/Cursor;->close()V

    .line 341
    .line 342
    .line 343
    :cond_10
    move v5, v1

    .line 344
    goto :goto_10

    .line 345
    :catchall_4
    move-exception v0

    .line 346
    goto :goto_9

    .line 347
    :catch_7
    move-exception v0

    .line 348
    goto :goto_a

    .line 349
    :goto_9
    move-object v4, p1

    .line 350
    goto :goto_11

    .line 351
    :goto_a
    move-object v4, p1

    .line 352
    goto :goto_f

    .line 353
    :cond_11
    :goto_b
    if-eqz p1, :cond_14

    .line 354
    .line 355
    invoke-interface {p1}, Landroid/database/Cursor;->close()V
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_2

    .line 356
    .line 357
    .line 358
    goto :goto_10

    .line 359
    :cond_12
    const/4 v3, 0x2

    .line 360
    if-ne v6, v3, :cond_13

    .line 361
    .line 362
    :try_start_16
    new-instance v2, Loi0;

    .line 363
    .line 364
    invoke-direct {v2, p0}, Loi0;-><init>(Ljava/lang/Object;)V

    .line 365
    .line 366
    .line 367
    invoke-virtual {v1}, Lsb1;->U()Landroid/os/Parcel;

    .line 368
    .line 369
    .line 370
    move-result-object v3

    .line 371
    invoke-static {v3, v2}, Lcc2;->c(Landroid/os/Parcel;Landroid/os/IInterface;)V

    .line 372
    .line 373
    .line 374
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 375
    .line 376
    .line 377
    invoke-virtual {v3, p1}, Landroid/os/Parcel;->writeInt(I)V

    .line 378
    .line 379
    .line 380
    const/4 p1, 0x5

    .line 381
    invoke-virtual {v1, v3, p1}, Lsb1;->T(Landroid/os/Parcel;I)Landroid/os/Parcel;

    .line 382
    .line 383
    .line 384
    move-result-object p1

    .line 385
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 386
    .line 387
    .line 388
    move-result v0

    .line 389
    invoke-virtual {p1}, Landroid/os/Parcel;->recycle()V

    .line 390
    .line 391
    .line 392
    :goto_c
    move v5, v0

    .line 393
    goto :goto_10

    .line 394
    :cond_13
    new-instance v3, Loi0;

    .line 395
    .line 396
    invoke-direct {v3, p0}, Loi0;-><init>(Ljava/lang/Object;)V

    .line 397
    .line 398
    .line 399
    invoke-virtual {v1}, Lsb1;->U()Landroid/os/Parcel;

    .line 400
    .line 401
    .line 402
    move-result-object v6

    .line 403
    invoke-static {v6, v3}, Lcc2;->c(Landroid/os/Parcel;Landroid/os/IInterface;)V

    .line 404
    .line 405
    .line 406
    invoke-virtual {v6, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 407
    .line 408
    .line 409
    invoke-virtual {v6, p1}, Landroid/os/Parcel;->writeInt(I)V

    .line 410
    .line 411
    .line 412
    invoke-virtual {v1, v6, v2}, Lsb1;->T(Landroid/os/Parcel;I)Landroid/os/Parcel;

    .line 413
    .line 414
    .line 415
    move-result-object p1

    .line 416
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 417
    .line 418
    .line 419
    move-result v0

    .line 420
    invoke-virtual {p1}, Landroid/os/Parcel;->recycle()V
    :try_end_16
    .catch Landroid/os/RemoteException; {:try_start_16 .. :try_end_16} :catch_6
    .catchall {:try_start_16 .. :try_end_16} :catchall_3

    .line 421
    .line 422
    .line 423
    goto :goto_c

    .line 424
    :goto_d
    move-object v0, p1

    .line 425
    goto :goto_11

    .line 426
    :goto_e
    move-object v0, p1

    .line 427
    :goto_f
    :try_start_17
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_5

    .line 428
    .line 429
    .line 430
    if-eqz v4, :cond_14

    .line 431
    .line 432
    :try_start_18
    invoke-interface {v4}, Landroid/database/Cursor;->close()V

    .line 433
    .line 434
    .line 435
    :cond_14
    :goto_10
    return v5

    .line 436
    :catchall_5
    move-exception v0

    .line 437
    :goto_11
    if-eqz v4, :cond_15

    .line 438
    .line 439
    invoke-interface {v4}, Landroid/database/Cursor;->close()V

    .line 440
    .line 441
    .line 442
    :cond_15
    throw v0
    :try_end_18
    .catchall {:try_start_18 .. :try_end_18} :catchall_2

    .line 443
    :goto_12
    :try_start_19
    monitor-exit v1
    :try_end_19
    .catchall {:try_start_19 .. :try_end_19} :catchall_1

    .line 444
    :try_start_1a
    throw p1
    :try_end_1a
    .catchall {:try_start_1a .. :try_end_1a} :catchall_2

    .line 445
    :goto_13
    invoke-static {p0, p1}, Lm54;->a(Landroid/content/Context;Ljava/lang/Throwable;)V

    .line 446
    .line 447
    .line 448
    throw p1
.end method

.method public static e(Landroid/content/Context;ZZ)I
    .locals 9

    .line 1
    const-string v0, "com.google.android.gms.ads.dynamite"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 5
    .line 6
    .line 7
    move-result-object v2

    .line 8
    sget-object p0, Lar;->i:Ldu;

    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, Ljava/lang/Long;

    .line 15
    .line 16
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    .line 17
    .line 18
    .line 19
    move-result-wide v3

    .line 20
    const-string p0, "api_force_staging"

    .line 21
    .line 22
    const-string v5, "api"

    .line 23
    .line 24
    const/4 v8, 0x1

    .line 25
    if-eq v8, p1, :cond_0

    .line 26
    .line 27
    move-object p0, v5

    .line 28
    :cond_0
    new-instance p1, Landroid/net/Uri$Builder;

    .line 29
    .line 30
    invoke-direct {p1}, Landroid/net/Uri$Builder;-><init>()V

    .line 31
    .line 32
    .line 33
    const-string v5, "content"

    .line 34
    .line 35
    invoke-virtual {p1, v5}, Landroid/net/Uri$Builder;->scheme(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    const-string v5, "com.google.android.gms.chimera"

    .line 40
    .line 41
    invoke-virtual {p1, v5}, Landroid/net/Uri$Builder;->authority(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-virtual {p1, p0}, Landroid/net/Uri$Builder;->path(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    invoke-virtual {p0, v0}, Landroid/net/Uri$Builder;->appendPath(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    const-string p1, "requestStartTime"

    .line 54
    .line 55
    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-virtual {p0, p1, v0}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    invoke-virtual {p0}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    const/4 v6, 0x0

    .line 68
    const/4 v7, 0x0

    .line 69
    const/4 v4, 0x0

    .line 70
    const/4 v5, 0x0

    .line 71
    invoke-virtual/range {v2 .. v7}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    .line 72
    .line 73
    .line 74
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 75
    if-eqz p0, :cond_a

    .line 76
    .line 77
    :try_start_1
    invoke-interface {p0}, Landroid/database/Cursor;->moveToFirst()Z

    .line 78
    .line 79
    .line 80
    move-result p1

    .line 81
    if-eqz p1, :cond_a

    .line 82
    .line 83
    const/4 p1, 0x0

    .line 84
    invoke-interface {p0, p1}, Landroid/database/Cursor;->getInt(I)I

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    if-lez v0, :cond_6

    .line 89
    .line 90
    const-class v2, Lar;

    .line 91
    .line 92
    monitor-enter v2
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 93
    const/4 v3, 0x2

    .line 94
    :try_start_2
    invoke-interface {p0, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v3

    .line 98
    sput-object v3, Lar;->d:Ljava/lang/String;

    .line 99
    .line 100
    const-string v3, "loaderVersion"

    .line 101
    .line 102
    invoke-interface {p0, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    .line 103
    .line 104
    .line 105
    move-result v3

    .line 106
    if-ltz v3, :cond_1

    .line 107
    .line 108
    invoke-interface {p0, v3}, Landroid/database/Cursor;->getInt(I)I

    .line 109
    .line 110
    .line 111
    move-result v3

    .line 112
    sput v3, Lar;->f:I

    .line 113
    .line 114
    goto :goto_0

    .line 115
    :catchall_0
    move-exception v0

    .line 116
    move-object p1, v0

    .line 117
    goto :goto_5

    .line 118
    :cond_1
    :goto_0
    const-string v3, "disableStandaloneDynamiteLoader2"

    .line 119
    .line 120
    invoke-interface {p0, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    .line 121
    .line 122
    .line 123
    move-result v3

    .line 124
    if-ltz v3, :cond_3

    .line 125
    .line 126
    invoke-interface {p0, v3}, Landroid/database/Cursor;->getInt(I)I

    .line 127
    .line 128
    .line 129
    move-result v3

    .line 130
    if-eqz v3, :cond_2

    .line 131
    .line 132
    move v3, v8

    .line 133
    goto :goto_1

    .line 134
    :cond_2
    move v3, p1

    .line 135
    :goto_1
    sput-boolean v3, Lar;->e:Z

    .line 136
    .line 137
    goto :goto_2

    .line 138
    :cond_3
    move v3, p1

    .line 139
    :goto_2
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 140
    :try_start_3
    sget-object v2, Lar;->h:Ljava/lang/ThreadLocal;

    .line 141
    .line 142
    invoke-virtual {v2}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v2

    .line 146
    check-cast v2, Lfd4;

    .line 147
    .line 148
    if-eqz v2, :cond_4

    .line 149
    .line 150
    iget-object v4, v2, Lfd4;->a:Landroid/database/Cursor;

    .line 151
    .line 152
    if-nez v4, :cond_4

    .line 153
    .line 154
    iput-object p0, v2, Lfd4;->a:Landroid/database/Cursor;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 155
    .line 156
    goto :goto_3

    .line 157
    :cond_4
    move v8, p1

    .line 158
    :goto_3
    if-eqz v8, :cond_5

    .line 159
    .line 160
    :goto_4
    move p1, v3

    .line 161
    goto :goto_6

    .line 162
    :cond_5
    move-object v1, p0

    .line 163
    goto :goto_4

    .line 164
    :goto_5
    :try_start_4
    monitor-exit v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 165
    :try_start_5
    throw p1
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 166
    :catchall_1
    move-exception v0

    .line 167
    move-object p1, v0

    .line 168
    goto :goto_8

    .line 169
    :catch_0
    move-exception v0

    .line 170
    move-object p1, v0

    .line 171
    goto :goto_9

    .line 172
    :cond_6
    move-object v1, p0

    .line 173
    :goto_6
    if-eqz p2, :cond_8

    .line 174
    .line 175
    if-nez p1, :cond_7

    .line 176
    .line 177
    goto :goto_7

    .line 178
    :cond_7
    :try_start_6
    new-instance p0, Lxq;

    .line 179
    .line 180
    const-string p1, "forcing fallback to container DynamiteLoader impl"

    .line 181
    .line 182
    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 183
    .line 184
    .line 185
    throw p0
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_1
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 186
    :catchall_2
    move-exception v0

    .line 187
    move-object p0, v0

    .line 188
    goto :goto_b

    .line 189
    :catch_1
    move-exception v0

    .line 190
    move-object p0, v0

    .line 191
    goto :goto_a

    .line 192
    :cond_8
    :goto_7
    if-eqz v1, :cond_9

    .line 193
    .line 194
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 195
    .line 196
    .line 197
    :cond_9
    return v0

    .line 198
    :cond_a
    :try_start_7
    new-instance p1, Lxq;

    .line 199
    .line 200
    const-string p2, "Failed to connect to dynamite module ContentResolver."

    .line 201
    .line 202
    invoke-direct {p1, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 203
    .line 204
    .line 205
    throw p1
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_0
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 206
    :goto_8
    move-object v1, p0

    .line 207
    move-object p0, p1

    .line 208
    goto :goto_b

    .line 209
    :goto_9
    move-object v1, p0

    .line 210
    move-object p0, p1

    .line 211
    :goto_a
    :try_start_8
    nop

    .line 212
    instance-of p1, p0, Lxq;

    .line 213
    .line 214
    if-eqz p1, :cond_b

    .line 215
    .line 216
    throw p0

    .line 217
    :cond_b
    new-instance p1, Lxq;

    .line 218
    .line 219
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 220
    .line 221
    .line 222
    move-result-object p2

    .line 223
    new-instance v0, Ljava/lang/StringBuilder;

    .line 224
    .line 225
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 226
    .line 227
    .line 228
    const-string v2, "V2 version check failed: "

    .line 229
    .line 230
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 231
    .line 232
    .line 233
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 234
    .line 235
    .line 236
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 237
    .line 238
    .line 239
    move-result-object p2

    .line 240
    invoke-direct {p1, p2, p0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 241
    .line 242
    .line 243
    throw p1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    .line 244
    :goto_b
    if-eqz v1, :cond_c

    .line 245
    .line 246
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 247
    .line 248
    .line 249
    :cond_c
    throw p0
.end method

.method public static f(Ljava/lang/ClassLoader;)V
    .locals 3

    .line 1
    const-string v0, "com.google.android.gms.dynamite.IDynamiteLoaderV2"

    .line 2
    .line 3
    :try_start_0
    const-string v1, "com.google.android.gms.dynamiteloader.DynamiteLoaderV2"

    .line 4
    .line 5
    invoke-virtual {p0, v1}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-virtual {p0, v1}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-virtual {p0, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    check-cast p0, Landroid/os/IBinder;

    .line 19
    .line 20
    if-nez p0, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    invoke-interface {p0, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    instance-of v2, v1, Laf4;

    .line 28
    .line 29
    if-eqz v2, :cond_1

    .line 30
    .line 31
    check-cast v1, Laf4;

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    new-instance v1, Laf4;

    .line 35
    .line 36
    const/4 v2, 0x1

    .line 37
    invoke-direct {v1, p0, v0, v2}, Lsb1;-><init>(Landroid/os/IBinder;Ljava/lang/String;I)V

    .line 38
    .line 39
    .line 40
    :goto_0
    sput-object v1, Lar;->l:Laf4;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    .line 41
    .line 42
    return-void

    .line 43
    :catch_0
    move-exception p0

    .line 44
    new-instance v0, Lxq;

    .line 45
    .line 46
    const-string v1, "Failed to instantiate dynamite loader"

    .line 47
    .line 48
    invoke-direct {v0, v1, p0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 49
    .line 50
    .line 51
    throw v0
.end method

.method public static g(Landroid/content/Context;)Z
    .locals 5

    .line 1
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, v1}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    const/4 v2, 0x1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    return v2

    .line 12
    :cond_0
    sget-object v1, Lar;->g:Ljava/lang/Boolean;

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    return v2

    .line 21
    :cond_1
    sget-object v0, Lar;->g:Ljava/lang/Boolean;

    .line 22
    .line 23
    const/4 v1, 0x0

    .line 24
    if-nez v0, :cond_3

    .line 25
    .line 26
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    const-string v3, "com.google.android.gms.chimera"

    .line 31
    .line 32
    invoke-virtual {v0, v3, v1}, Landroid/content/pm/PackageManager;->resolveContentProvider(Ljava/lang/String;I)Landroid/content/pm/ProviderInfo;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    sget-object v3, Lgz;->b:Lgz;

    .line 37
    .line 38
    const v4, 0x989680

    .line 39
    .line 40
    .line 41
    invoke-virtual {v3, p0, v4}, Lgz;->c(Landroid/content/Context;I)I

    .line 42
    .line 43
    .line 44
    move-result p0

    .line 45
    if-nez p0, :cond_2

    .line 46
    .line 47
    if-eqz v0, :cond_2

    .line 48
    .line 49
    const-string p0, "com.google.android.gms"

    .line 50
    .line 51
    iget-object v3, v0, Landroid/content/pm/ProviderInfo;->packageName:Ljava/lang/String;

    .line 52
    .line 53
    invoke-virtual {p0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result p0

    .line 57
    if-eqz p0, :cond_2

    .line 58
    .line 59
    move v1, v2

    .line 60
    :cond_2
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    sput-object p0, Lar;->g:Ljava/lang/Boolean;

    .line 65
    .line 66
    if-eqz v1, :cond_3

    .line 67
    .line 68
    iget-object p0, v0, Landroid/content/pm/ProviderInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    .line 69
    .line 70
    if-eqz p0, :cond_3

    .line 71
    .line 72
    iget p0, p0, Landroid/content/pm/ApplicationInfo;->flags:I

    .line 73
    .line 74
    and-int/lit16 p0, p0, 0x81

    .line 75
    .line 76
    if-nez p0, :cond_3

    .line 77
    .line 78
    sput-boolean v2, Lar;->e:Z

    .line 79
    .line 80
    :cond_3
    if-nez v1, :cond_4

    .line 81
    .line 82
    const-string p0, "DynamiteModule"

    .line 83
    .line 84
    const-string v0, "Invalid GmsCore APK, remote loading disabled."

    .line 85
    .line 86
    invoke-static {p0, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 87
    .line 88
    .line 89
    :cond_4
    return v1
.end method

.method public static h(Landroid/content/Context;)Lhe4;
    .locals 6

    .line 1
    const-string v0, "Failed to load IDynamiteLoader from GmsCore: "

    .line 2
    .line 3
    const-class v1, Lar;

    .line 4
    .line 5
    monitor-enter v1

    .line 6
    :try_start_0
    sget-object v2, Lar;->k:Lhe4;

    .line 7
    .line 8
    if-eqz v2, :cond_0

    .line 9
    .line 10
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    return-object v2

    .line 12
    :catchall_0
    move-exception p0

    .line 13
    goto :goto_2

    .line 14
    :cond_0
    const/4 v2, 0x0

    .line 15
    :try_start_1
    const-string v3, "com.google.android.gms"

    .line 16
    .line 17
    const/4 v4, 0x3

    .line 18
    invoke-virtual {p0, v3, v4}, Landroid/content/Context;->createPackageContext(Ljava/lang/String;I)Landroid/content/Context;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-virtual {p0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    const-string v3, "com.google.android.gms.chimera.container.DynamiteLoaderImpl"

    .line 27
    .line 28
    invoke-virtual {p0, v3}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-virtual {p0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    check-cast p0, Landroid/os/IBinder;

    .line 37
    .line 38
    if-nez p0, :cond_1

    .line 39
    .line 40
    move-object v3, v2

    .line 41
    goto :goto_0

    .line 42
    :cond_1
    const-string v3, "com.google.android.gms.dynamite.IDynamiteLoader"

    .line 43
    .line 44
    invoke-interface {p0, v3}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    instance-of v4, v3, Lhe4;

    .line 49
    .line 50
    if-eqz v4, :cond_2

    .line 51
    .line 52
    check-cast v3, Lhe4;

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :catch_0
    move-exception p0

    .line 56
    goto :goto_1

    .line 57
    :cond_2
    new-instance v3, Lhe4;

    .line 58
    .line 59
    const-string v4, "com.google.android.gms.dynamite.IDynamiteLoader"

    .line 60
    .line 61
    const/4 v5, 0x1

    .line 62
    invoke-direct {v3, p0, v4, v5}, Lsb1;-><init>(Landroid/os/IBinder;Ljava/lang/String;I)V

    .line 63
    .line 64
    .line 65
    :goto_0
    if-eqz v3, :cond_3

    .line 66
    .line 67
    sput-object v3, Lar;->k:Lhe4;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 68
    .line 69
    :try_start_2
    monitor-exit v1

    .line 70
    return-object v3

    .line 71
    :goto_1
    const-string v3, "DynamiteModule"

    .line 72
    .line 73
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    new-instance v4, Ljava/lang/StringBuilder;

    .line 78
    .line 79
    invoke-direct {v4, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    invoke-static {v3, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 90
    .line 91
    .line 92
    :cond_3
    monitor-exit v1

    .line 93
    return-object v2

    .line 94
    :goto_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 95
    throw p0
.end method


# virtual methods
.method public final b(Ljava/lang/String;)Landroid/os/IBinder;
    .locals 3

    .line 1
    :try_start_0
    iget-object v0, p0, Lar;->a:Landroid/content/Context;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0, p1}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Landroid/os/IBinder;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    .line 16
    .line 17
    return-object v0

    .line 18
    :catch_0
    move-exception v0

    .line 19
    goto :goto_0

    .line 20
    :catch_1
    move-exception v0

    .line 21
    goto :goto_0

    .line 22
    :catch_2
    move-exception v0

    .line 23
    :goto_0
    new-instance v1, Lxq;

    .line 24
    .line 25
    const-string v2, "Failed to instantiate module class: "

    .line 26
    .line 27
    invoke-virtual {v2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-direct {v1, p1, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 32
    .line 33
    .line 34
    throw v1
.end method
