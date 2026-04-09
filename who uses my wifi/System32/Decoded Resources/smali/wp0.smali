.class public final Lwp0;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# static fields
.field public static final d:Li80;

.field public static e:Lwp0;

.field public static f:Ljava/util/ArrayList;


# instance fields
.field public final a:Ljava/util/ArrayList;

.field public final b:Ljava/util/ArrayList;

.field public final c:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-class v0, Lwp0;

    .line 2
    .line 3
    invoke-static {v0}, Lk80;->d(Ljava/lang/Class;)Li80;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lwp0;->d:Li80;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    const/4 v1, 0x2

    .line 7
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lwp0;->a:Ljava/util/ArrayList;

    .line 11
    .line 12
    new-instance v0, Ljava/util/ArrayList;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Lwp0;->b:Ljava/util/ArrayList;

    .line 19
    .line 20
    const/4 v0, 0x1

    .line 21
    iput v0, p0, Lwp0;->c:I

    .line 22
    .line 23
    const-class v2, Lwp0;

    .line 24
    .line 25
    monitor-enter v2

    .line 26
    :try_start_0
    sget-object v3, Lwp0;->f:Ljava/util/ArrayList;

    .line 27
    .line 28
    if-nez v3, :cond_2

    .line 29
    .line 30
    new-instance v3, Ljava/util/ArrayList;

    .line 31
    .line 32
    const/16 v4, 0x8

    .line 33
    .line 34
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 35
    .line 36
    .line 37
    sput-object v3, Lwp0;->f:Ljava/util/ArrayList;

    .line 38
    .line 39
    const-string v3, "dnsjava.configprovider.skipinit"

    .line 40
    .line 41
    invoke-static {v3}, Ljava/lang/Boolean;->getBoolean(Ljava/lang/String;)Z

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    if-nez v3, :cond_2

    .line 46
    .line 47
    sget-object v3, Lwp0;->f:Ljava/util/ArrayList;

    .line 48
    .line 49
    new-instance v4, Lum0;

    .line 50
    .line 51
    const/4 v5, 0x0

    .line 52
    invoke-direct {v4, v5}, Lum0;-><init>(I)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    sget-object v3, Lwp0;->f:Ljava/util/ArrayList;

    .line 59
    .line 60
    new-instance v4, Lum0;

    .line 61
    .line 62
    const/4 v5, 0x1

    .line 63
    invoke-direct {v4, v5}, Lum0;-><init>(I)V

    .line 64
    .line 65
    .line 66
    iput v0, v4, Lum0;->g:I

    .line 67
    .line 68
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    sget-object v0, Lwp0;->f:Ljava/util/ArrayList;

    .line 72
    .line 73
    new-instance v3, Ls91;

    .line 74
    .line 75
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 76
    .line 77
    .line 78
    const-string v4, "os.name"

    .line 79
    .line 80
    invoke-static {v4}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v4

    .line 84
    const-string v5, "Windows"

    .line 85
    .line 86
    invoke-virtual {v4, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 87
    .line 88
    .line 89
    move-result v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 90
    if-eqz v4, :cond_0

    .line 91
    .line 92
    :try_start_1
    new-instance v4, Lr91;

    .line 93
    .line 94
    invoke-direct {v4}, Lja;-><init>()V

    .line 95
    .line 96
    .line 97
    iput-object v4, v3, Ls91;->a:Lr91;
    :try_end_1
    .catch Ljava/lang/NoClassDefFoundError; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 98
    .line 99
    goto :goto_0

    .line 100
    :catch_0
    :try_start_2
    sget-object v4, Ls91;->b:Li80;

    .line 101
    .line 102
    const-string v5, "JNA not available"

    .line 103
    .line 104
    invoke-interface {v4, v5}, Li80;->r(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    :cond_0
    :goto_0
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    sget-object v0, Lwp0;->f:Ljava/util/ArrayList;

    .line 111
    .line 112
    new-instance v3, Ly3;

    .line 113
    .line 114
    invoke-direct {v3}, Lja;-><init>()V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    sget-object v0, Lwp0;->f:Ljava/util/ArrayList;

    .line 121
    .line 122
    new-instance v3, Lv30;

    .line 123
    .line 124
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 125
    .line 126
    .line 127
    const-string v4, "java.vendor"

    .line 128
    .line 129
    invoke-static {v4}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v4

    .line 133
    const-string v5, "Android"

    .line 134
    .line 135
    invoke-virtual {v4, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 136
    .line 137
    .line 138
    move-result v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 139
    if-nez v4, :cond_1

    .line 140
    .line 141
    :try_start_3
    new-instance v4, Lu30;

    .line 142
    .line 143
    invoke-direct {v4}, Lja;-><init>()V

    .line 144
    .line 145
    .line 146
    iput-object v4, v3, Lv30;->a:Lu30;
    :try_end_3
    .catch Ljava/lang/NoClassDefFoundError; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 147
    .line 148
    goto :goto_1

    .line 149
    :catch_1
    :try_start_4
    sget-object v4, Lv30;->b:Li80;

    .line 150
    .line 151
    const-string v5, "JNDI DNS not available"

    .line 152
    .line 153
    invoke-interface {v4, v5}, Li80;->r(Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    :cond_1
    :goto_1
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 157
    .line 158
    .line 159
    sget-object v0, Lwp0;->f:Ljava/util/ArrayList;

    .line 160
    .line 161
    new-instance v3, Laz0;

    .line 162
    .line 163
    invoke-direct {v3}, Lja;-><init>()V

    .line 164
    .line 165
    .line 166
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 167
    .line 168
    .line 169
    sget-object v0, Lwp0;->f:Ljava/util/ArrayList;

    .line 170
    .line 171
    new-instance v3, Lcu;

    .line 172
    .line 173
    const/4 v4, 0x0

    .line 174
    invoke-direct {v3, v4}, Lum0;-><init>(I)V

    .line 175
    .line 176
    .line 177
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 178
    .line 179
    .line 180
    goto :goto_2

    .line 181
    :catchall_0
    move-exception v0

    .line 182
    goto/16 :goto_7

    .line 183
    .line 184
    :cond_2
    :goto_2
    monitor-exit v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 185
    sget-object v0, Lwp0;->f:Ljava/util/ArrayList;

    .line 186
    .line 187
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 188
    .line 189
    .line 190
    move-result v2

    .line 191
    :cond_3
    :goto_3
    if-ge v1, v2, :cond_6

    .line 192
    .line 193
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object v3

    .line 197
    add-int/lit8 v1, v1, 0x1

    .line 198
    .line 199
    check-cast v3, Lxp0;

    .line 200
    .line 201
    invoke-interface {v3}, Lxp0;->isEnabled()Z

    .line 202
    .line 203
    .line 204
    move-result v4

    .line 205
    if-eqz v4, :cond_3

    .line 206
    .line 207
    :try_start_5
    invoke-interface {v3}, Lxp0;->a()V

    .line 208
    .line 209
    .line 210
    iget-object v4, p0, Lwp0;->a:Ljava/util/ArrayList;

    .line 211
    .line 212
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    .line 213
    .line 214
    .line 215
    move-result v4

    .line 216
    if-eqz v4, :cond_4

    .line 217
    .line 218
    iget-object v4, p0, Lwp0;->a:Ljava/util/ArrayList;

    .line 219
    .line 220
    invoke-interface {v3}, Lxp0;->c()Ljava/util/List;

    .line 221
    .line 222
    .line 223
    move-result-object v5

    .line 224
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 225
    .line 226
    .line 227
    goto :goto_4

    .line 228
    :catch_2
    move-exception v3

    .line 229
    goto :goto_5

    .line 230
    :cond_4
    :goto_4
    iget-object v4, p0, Lwp0;->b:Ljava/util/ArrayList;

    .line 231
    .line 232
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    .line 233
    .line 234
    .line 235
    move-result v4

    .line 236
    if-eqz v4, :cond_5

    .line 237
    .line 238
    invoke-interface {v3}, Lxp0;->d()Ljava/util/List;

    .line 239
    .line 240
    .line 241
    move-result-object v4

    .line 242
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    .line 243
    .line 244
    .line 245
    move-result v5

    .line 246
    if-nez v5, :cond_5

    .line 247
    .line 248
    iget-object v5, p0, Lwp0;->b:Ljava/util/ArrayList;

    .line 249
    .line 250
    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 251
    .line 252
    .line 253
    invoke-interface {v3}, Lxp0;->b()I

    .line 254
    .line 255
    .line 256
    move-result v3

    .line 257
    iput v3, p0, Lwp0;->c:I

    .line 258
    .line 259
    :cond_5
    iget-object v3, p0, Lwp0;->a:Ljava/util/ArrayList;

    .line 260
    .line 261
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 262
    .line 263
    .line 264
    move-result v3

    .line 265
    if-nez v3, :cond_3

    .line 266
    .line 267
    iget-object v3, p0, Lwp0;->b:Ljava/util/ArrayList;

    .line 268
    .line 269
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 270
    .line 271
    .line 272
    move-result v3
    :try_end_5
    .catch Ls20; {:try_start_5 .. :try_end_5} :catch_2

    .line 273
    if-nez v3, :cond_3

    .line 274
    .line 275
    goto :goto_6

    .line 276
    :goto_5
    sget-object v4, Lwp0;->d:Li80;

    .line 277
    .line 278
    const-string v5, "Failed to initialize provider"

    .line 279
    .line 280
    invoke-interface {v4, v5, v3}, Li80;->p(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 281
    .line 282
    .line 283
    goto :goto_3

    .line 284
    :cond_6
    iget-object v0, p0, Lwp0;->a:Ljava/util/ArrayList;

    .line 285
    .line 286
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 287
    .line 288
    .line 289
    move-result v0

    .line 290
    if-eqz v0, :cond_7

    .line 291
    .line 292
    iget-object v0, p0, Lwp0;->a:Ljava/util/ArrayList;

    .line 293
    .line 294
    new-instance v1, Ljava/net/InetSocketAddress;

    .line 295
    .line 296
    invoke-static {}, Ljava/net/InetAddress;->getLoopbackAddress()Ljava/net/InetAddress;

    .line 297
    .line 298
    .line 299
    move-result-object v2

    .line 300
    const/16 v3, 0x35

    .line 301
    .line 302
    invoke-direct {v1, v2, v3}, Ljava/net/InetSocketAddress;-><init>(Ljava/net/InetAddress;I)V

    .line 303
    .line 304
    .line 305
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 306
    .line 307
    .line 308
    :cond_7
    :goto_6
    return-void

    .line 309
    :goto_7
    :try_start_6
    monitor-exit v2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 310
    throw v0
.end method

.method public static declared-synchronized a()Lwp0;
    .locals 3

    .line 1
    const-class v0, Lwp0;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lwp0;->e:Lwp0;

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    sget-object v1, Lwp0;->f:Ljava/util/ArrayList;

    .line 9
    .line 10
    if-nez v1, :cond_1

    .line 11
    .line 12
    :cond_0
    new-instance v1, Lwp0;

    .line 13
    .line 14
    invoke-direct {v1}, Lwp0;-><init>()V

    .line 15
    .line 16
    .line 17
    const-class v2, Lwp0;

    .line 18
    .line 19
    monitor-enter v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    :try_start_1
    sput-object v1, Lwp0;->e:Lwp0;

    .line 21
    .line 22
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 23
    :cond_1
    :try_start_2
    sget-object v1, Lwp0;->e:Lwp0;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 24
    .line 25
    monitor-exit v0

    .line 26
    return-object v1

    .line 27
    :catchall_0
    move-exception v1

    .line 28
    goto :goto_0

    .line 29
    :catchall_1
    move-exception v1

    .line 30
    :try_start_3
    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 31
    :try_start_4
    throw v1

    .line 32
    :goto_0
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 33
    throw v1
.end method
