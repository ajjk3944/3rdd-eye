.class public final Lew0;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lvp0;


# static fields
.field public static final e:Li80;

.field public static final f:Ljava/net/InetSocketAddress;


# instance fields
.field public a:Ljava/net/InetSocketAddress;

.field public b:Lki0;

.field public c:Ljava/time/Duration;

.field public d:Ldn;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const-class v0, Lew0;

    .line 2
    .line 3
    invoke-static {v0}, Lk80;->d(Ljava/lang/Class;)Li80;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lew0;->e:Li80;

    .line 8
    .line 9
    new-instance v0, Ljava/net/InetSocketAddress;

    .line 10
    .line 11
    invoke-static {}, Ljava/net/InetAddress;->getLoopbackAddress()Ljava/net/InetAddress;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    const/16 v2, 0x35

    .line 16
    .line 17
    invoke-direct {v0, v1, v2}, Ljava/net/InetSocketAddress;-><init>(Ljava/net/InetAddress;I)V

    .line 18
    .line 19
    .line 20
    sput-object v0, Lew0;->f:Ljava/net/InetSocketAddress;

    .line 21
    .line 22
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lki0;

    .line 5
    .line 6
    invoke-direct {v0}, Lki0;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lew0;->b:Lki0;

    .line 10
    .line 11
    const-wide/16 v0, 0xa

    .line 12
    .line 13
    invoke-static {v0, v1}, Ljava/time/Duration;->ofSeconds(J)Ljava/time/Duration;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iput-object v0, p0, Lew0;->c:Ljava/time/Duration;

    .line 18
    .line 19
    new-instance v0, Ldn;

    .line 20
    .line 21
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object v0, p0, Lew0;->d:Ldn;

    .line 25
    .line 26
    if-nez p1, :cond_1

    .line 27
    .line 28
    invoke-static {}, Lwp0;->a()Lwp0;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    iget-object p1, p1, Lwp0;->a:Ljava/util/ArrayList;

    .line 33
    .line 34
    const/4 v0, 0x0

    .line 35
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    check-cast p1, Ljava/net/InetSocketAddress;

    .line 40
    .line 41
    iput-object p1, p0, Lew0;->a:Ljava/net/InetSocketAddress;

    .line 42
    .line 43
    if-nez p1, :cond_0

    .line 44
    .line 45
    sget-object p1, Lew0;->f:Ljava/net/InetSocketAddress;

    .line 46
    .line 47
    iput-object p1, p0, Lew0;->a:Ljava/net/InetSocketAddress;

    .line 48
    .line 49
    :cond_0
    return-void

    .line 50
    :cond_1
    const-string v0, "0"

    .line 51
    .line 52
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    if-eqz v0, :cond_2

    .line 57
    .line 58
    invoke-static {}, Ljava/net/InetAddress;->getLoopbackAddress()Ljava/net/InetAddress;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    goto :goto_0

    .line 63
    :cond_2
    invoke-static {p1}, Ljava/net/InetAddress;->getByName(Ljava/lang/String;)Ljava/net/InetAddress;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    :goto_0
    new-instance v0, Ljava/net/InetSocketAddress;

    .line 68
    .line 69
    const/16 v1, 0x35

    .line 70
    .line 71
    invoke-direct {v0, p1, v1}, Ljava/net/InetSocketAddress;-><init>(Ljava/net/InetAddress;I)V

    .line 72
    .line 73
    .line 74
    iput-object v0, p0, Lew0;->a:Ljava/net/InetSocketAddress;

    .line 75
    .line 76
    return-void
.end method


# virtual methods
.method public final a(Lme0;)Ljava/util/concurrent/CompletionStage;
    .locals 1

    .line 1
    invoke-static {}, Ljava/util/concurrent/ForkJoinPool;->commonPool()Ljava/util/concurrent/ForkJoinPool;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0, p1, v0}, Lew0;->f(Lme0;Ljava/util/concurrent/Executor;)Ljava/util/concurrent/CompletionStage;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method

.method public final b()Ljava/time/Duration;
    .locals 1

    .line 1
    iget-object v0, p0, Lew0;->c:Ljava/time/Duration;

    .line 2
    .line 3
    return-object v0
.end method

.method public final d(Lme0;)Lme0;
    .locals 6

    .line 1
    invoke-virtual {p1}, Lme0;->e()Ltn0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, Ltn0;->f:Lgg0;

    .line 6
    .line 7
    iget-object v1, p0, Lew0;->a:Ljava/net/InetSocketAddress;

    .line 8
    .line 9
    new-instance v2, Lnb1;

    .line 10
    .line 11
    invoke-direct {v2, v0, v1}, Lnb1;-><init>(Lgg0;Ljava/net/SocketAddress;)V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lew0;->c:Ljava/time/Duration;

    .line 15
    .line 16
    iput-object v0, v2, Lnb1;->g:Ljava/time/Duration;

    .line 17
    .line 18
    :try_start_0
    new-instance v0, Lvq2;

    .line 19
    .line 20
    const/16 v1, 0x10

    .line 21
    .line 22
    invoke-direct {v0, v1}, Lvq2;-><init>(I)V

    .line 23
    .line 24
    .line 25
    iput-object v0, v2, Lnb1;->d:Lvq2;
    :try_end_0
    .catch Llb1; {:try_start_0 .. :try_end_0} :catch_2

    .line 26
    .line 27
    :try_start_1
    invoke-virtual {v2}, Lnb1;->c()V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v2}, Lnb1;->a()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 31
    .line 32
    .line 33
    :try_start_2
    iget-object v0, v2, Lnb1;->f:Lxz0;

    .line 34
    .line 35
    if-eqz v0, :cond_0

    .line 36
    .line 37
    invoke-virtual {v0}, Lxz0;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Llb1; {:try_start_2 .. :try_end_2} :catch_2

    .line 38
    .line 39
    .line 40
    :catch_0
    :cond_0
    iget-object v0, v2, Lnb1;->d:Lvq2;

    .line 41
    .line 42
    if-eqz v0, :cond_2

    .line 43
    .line 44
    iget-object v0, v0, Lvq2;->g:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v0, Ljava/util/ArrayList;

    .line 47
    .line 48
    new-instance v1, Lme0;

    .line 49
    .line 50
    iget-object v2, p1, Lme0;->f:Ll00;

    .line 51
    .line 52
    iget v2, v2, Ll00;->f:I

    .line 53
    .line 54
    new-instance v3, Ll00;

    .line 55
    .line 56
    invoke-direct {v3, v2}, Ll00;-><init>(I)V

    .line 57
    .line 58
    .line 59
    invoke-direct {v1, v3}, Lme0;-><init>(Ll00;)V

    .line 60
    .line 61
    .line 62
    const/4 v2, 0x5

    .line 63
    invoke-static {v2}, Ll00;->a(I)V

    .line 64
    .line 65
    .line 66
    iget v4, v3, Ll00;->g:I

    .line 67
    .line 68
    invoke-static {v2}, Ll00;->a(I)V

    .line 69
    .line 70
    .line 71
    or-int/lit16 v2, v4, 0x400

    .line 72
    .line 73
    iput v2, v3, Ll00;->g:I

    .line 74
    .line 75
    iget-object v2, v1, Lme0;->f:Ll00;

    .line 76
    .line 77
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    const/4 v3, 0x0

    .line 81
    invoke-static {v3}, Ll00;->a(I)V

    .line 82
    .line 83
    .line 84
    iget v4, v2, Ll00;->g:I

    .line 85
    .line 86
    invoke-static {v3}, Ll00;->a(I)V

    .line 87
    .line 88
    .line 89
    const v5, 0x8000

    .line 90
    .line 91
    .line 92
    or-int/2addr v4, v5

    .line 93
    iput v4, v2, Ll00;->g:I

    .line 94
    .line 95
    invoke-virtual {p1}, Lme0;->e()Ltn0;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    invoke-virtual {v1, p1, v3}, Lme0;->b(Ltn0;I)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 103
    .line 104
    .line 105
    move-result p1

    .line 106
    :goto_0
    if-ge v3, p1, :cond_1

    .line 107
    .line 108
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v2

    .line 112
    add-int/lit8 v3, v3, 0x1

    .line 113
    .line 114
    check-cast v2, Ltn0;

    .line 115
    .line 116
    const/4 v4, 0x1

    .line 117
    invoke-virtual {v1, v2, v4}, Lme0;->b(Ltn0;I)V

    .line 118
    .line 119
    .line 120
    goto :goto_0

    .line 121
    :cond_1
    return-object v1

    .line 122
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 123
    .line 124
    const-string v0, "ZoneTransferIn used callback interface"

    .line 125
    .line 126
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    throw p1

    .line 130
    :catchall_0
    move-exception p1

    .line 131
    :try_start_3
    iget-object v0, v2, Lnb1;->f:Lxz0;

    .line 132
    .line 133
    if-eqz v0, :cond_3

    .line 134
    .line 135
    invoke-virtual {v0}, Lxz0;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Llb1; {:try_start_3 .. :try_end_3} :catch_2

    .line 136
    .line 137
    .line 138
    :catch_1
    :cond_3
    :try_start_4
    throw p1
    :try_end_4
    .catch Llb1; {:try_start_4 .. :try_end_4} :catch_2

    .line 139
    :catch_2
    move-exception p1

    .line 140
    new-instance v0, Lt91;

    .line 141
    .line 142
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object p1

    .line 146
    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    throw v0
.end method

.method public final e(Lme0;ZLjava/util/concurrent/Executor;)Ljava/util/concurrent/CompletableFuture;
    .locals 29

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v3, p1

    .line 4
    .line 5
    iget-object v0, v1, Lew0;->d:Ldn;

    .line 6
    .line 7
    iget-object v9, v1, Lew0;->a:Ljava/net/InetSocketAddress;

    .line 8
    .line 9
    iget-object v2, v3, Lme0;->f:Ll00;

    .line 10
    .line 11
    iget v10, v2, Ll00;->f:I

    .line 12
    .line 13
    invoke-virtual {v2}, Ll00;->d()I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    const/4 v4, 0x5

    .line 18
    const/4 v11, 0x0

    .line 19
    const/4 v5, 0x1

    .line 20
    if-eq v2, v4, :cond_0

    .line 21
    .line 22
    move v2, v5

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move v2, v11

    .line 25
    :goto_0
    :try_start_0
    new-instance v4, Lt3;

    .line 26
    .line 27
    const/4 v6, 0x2

    .line 28
    const/4 v7, 0x0

    .line 29
    invoke-direct {v4, v6, v7}, Lt3;-><init>(IB)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v3, v4}, Lme0;->l(Lt3;)Z

    .line 33
    .line 34
    .line 35
    move-result v6

    .line 36
    if-nez v6, :cond_2

    .line 37
    .line 38
    if-eqz v2, :cond_1

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    new-instance v0, Lne0;

    .line 42
    .line 43
    const-string v2, "Message size would exceed the allowed maximum of 65535 bytes"

    .line 44
    .line 45
    invoke-direct {v0, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    throw v0

    .line 49
    :cond_2
    :goto_1
    iget v2, v4, Lt3;->g:I

    .line 50
    .line 51
    iput v2, v3, Lme0;->h:I

    .line 52
    .line 53
    invoke-virtual {v4}, Lt3;->i()[B

    .line 54
    .line 55
    .line 56
    move-result-object v15
    :try_end_0
    .catch Lne0; {:try_start_0 .. :try_end_0} :catch_6

    .line 57
    invoke-virtual {v3}, Lme0;->d()Lki0;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    if-nez v2, :cond_3

    .line 62
    .line 63
    const/16 v2, 0x200

    .line 64
    .line 65
    :goto_2
    move v12, v2

    .line 66
    goto :goto_3

    .line 67
    :cond_3
    iget v2, v2, Ltn0;->h:I

    .line 68
    .line 69
    goto :goto_2

    .line 70
    :goto_3
    if-nez p2, :cond_5

    .line 71
    .line 72
    array-length v2, v15

    .line 73
    if-le v2, v12, :cond_4

    .line 74
    .line 75
    goto :goto_4

    .line 76
    :cond_4
    move/from16 v21, v11

    .line 77
    .line 78
    goto :goto_5

    .line 79
    :cond_5
    :goto_4
    move/from16 v21, v5

    .line 80
    .line 81
    :goto_5
    sget-object v13, Lew0;->e:Li80;

    .line 82
    .line 83
    invoke-interface {v13}, Li80;->s()Z

    .line 84
    .line 85
    .line 86
    move-result v2

    .line 87
    const-string v4, "udp"

    .line 88
    .line 89
    const-string v5, "tcp"

    .line 90
    .line 91
    if-eqz v2, :cond_7

    .line 92
    .line 93
    invoke-virtual {v3}, Lme0;->e()Ltn0;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    iget-object v2, v2, Ltn0;->f:Lgg0;

    .line 98
    .line 99
    invoke-virtual {v3}, Lme0;->e()Ltn0;

    .line 100
    .line 101
    .line 102
    move-result-object v6

    .line 103
    iget v6, v6, Ltn0;->g:I

    .line 104
    .line 105
    sget-object v7, Lk31;->a:Lbs0;

    .line 106
    .line 107
    invoke-virtual {v7, v6}, Lue0;->e(I)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v6

    .line 111
    move-object v7, v4

    .line 112
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 113
    .line 114
    .line 115
    move-result-object v4

    .line 116
    if-eqz v21, :cond_6

    .line 117
    .line 118
    goto :goto_6

    .line 119
    :cond_6
    move-object v5, v7

    .line 120
    :goto_6
    invoke-virtual {v9}, Ljava/net/InetSocketAddress;->getAddress()Ljava/net/InetAddress;

    .line 121
    .line 122
    .line 123
    move-result-object v7

    .line 124
    invoke-virtual {v7}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v7

    .line 128
    invoke-virtual {v9}, Ljava/net/InetSocketAddress;->getPort()I

    .line 129
    .line 130
    .line 131
    move-result v8

    .line 132
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 133
    .line 134
    .line 135
    move-result-object v8

    .line 136
    move-object/from16 v28, v8

    .line 137
    .line 138
    move-object v8, v3

    .line 139
    move-object v3, v6

    .line 140
    move-object v6, v7

    .line 141
    move-object/from16 v7, v28

    .line 142
    .line 143
    filled-new-array/range {v2 .. v8}, [Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v2

    .line 147
    move-object v3, v8

    .line 148
    const-string v4, "Sending {}/{}, id={} to {}/{}:{}, query:\n{}"

    .line 149
    .line 150
    invoke-interface {v13, v4, v2}, Li80;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 151
    .line 152
    .line 153
    goto :goto_8

    .line 154
    :cond_7
    move-object v7, v4

    .line 155
    invoke-interface {v13}, Li80;->h()Z

    .line 156
    .line 157
    .line 158
    move-result v2

    .line 159
    if-eqz v2, :cond_9

    .line 160
    .line 161
    invoke-virtual {v3}, Lme0;->e()Ltn0;

    .line 162
    .line 163
    .line 164
    move-result-object v2

    .line 165
    iget-object v2, v2, Ltn0;->f:Lgg0;

    .line 166
    .line 167
    invoke-virtual {v3}, Lme0;->e()Ltn0;

    .line 168
    .line 169
    .line 170
    move-result-object v4

    .line 171
    iget v4, v4, Ltn0;->g:I

    .line 172
    .line 173
    sget-object v6, Lk31;->a:Lbs0;

    .line 174
    .line 175
    invoke-virtual {v6, v4}, Lue0;->e(I)Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object v23

    .line 179
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 180
    .line 181
    .line 182
    move-result-object v24

    .line 183
    if-eqz v21, :cond_8

    .line 184
    .line 185
    move-object/from16 v25, v5

    .line 186
    .line 187
    goto :goto_7

    .line 188
    :cond_8
    move-object/from16 v25, v7

    .line 189
    .line 190
    :goto_7
    invoke-virtual {v9}, Ljava/net/InetSocketAddress;->getAddress()Ljava/net/InetAddress;

    .line 191
    .line 192
    .line 193
    move-result-object v4

    .line 194
    invoke-virtual {v4}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object v26

    .line 198
    invoke-virtual {v9}, Ljava/net/InetSocketAddress;->getPort()I

    .line 199
    .line 200
    .line 201
    move-result v4

    .line 202
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 203
    .line 204
    .line 205
    move-result-object v27

    .line 206
    move-object/from16 v22, v2

    .line 207
    .line 208
    filled-new-array/range {v22 .. v27}, [Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    move-result-object v2

    .line 212
    const-string v4, "Sending {}/{}, id={} to {}/{}:{}"

    .line 213
    .line 214
    invoke-interface {v13, v4, v2}, Li80;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 215
    .line 216
    .line 217
    :cond_9
    :goto_8
    if-eqz v21, :cond_a

    .line 218
    .line 219
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 220
    .line 221
    .line 222
    sget-object v0, Ldn;->a:Lvq2;

    .line 223
    .line 224
    iget-object v2, v1, Lew0;->c:Ljava/time/Duration;

    .line 225
    .line 226
    iget-object v0, v0, Lvq2;->g:Ljava/lang/Object;

    .line 227
    .line 228
    check-cast v0, Lkh0;

    .line 229
    .line 230
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 231
    .line 232
    .line 233
    new-instance v8, Ljava/util/concurrent/CompletableFuture;

    .line 234
    .line 235
    invoke-direct {v8}, Ljava/util/concurrent/CompletableFuture;-><init>()V

    .line 236
    .line 237
    .line 238
    :try_start_1
    invoke-static {}, Ldh0;->c()Ljava/nio/channels/Selector;

    .line 239
    .line 240
    .line 241
    move-result-object v11

    .line 242
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 243
    .line 244
    .line 245
    move-result-wide v4

    .line 246
    invoke-virtual {v2}, Ljava/time/Duration;->toNanos()J

    .line 247
    .line 248
    .line 249
    move-result-wide v6

    .line 250
    add-long v5, v4, v6

    .line 251
    .line 252
    iget-object v2, v0, Lkh0;->j:Ljava/util/concurrent/ConcurrentHashMap;

    .line 253
    .line 254
    new-instance v4, Lhh0;

    .line 255
    .line 256
    invoke-direct {v4, v9}, Lhh0;-><init>(Ljava/net/InetSocketAddress;)V

    .line 257
    .line 258
    .line 259
    new-instance v7, Lgh0;

    .line 260
    .line 261
    invoke-direct {v7, v0, v9, v8}, Lgh0;-><init>(Lkh0;Ljava/net/InetSocketAddress;Ljava/util/concurrent/CompletableFuture;)V

    .line 262
    .line 263
    .line 264
    invoke-virtual {v2, v4, v7}, Ljava/util/concurrent/ConcurrentHashMap;->computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;

    .line 265
    .line 266
    .line 267
    move-result-object v2

    .line 268
    move-object v9, v2

    .line 269
    check-cast v9, Lih0;

    .line 270
    .line 271
    if-eqz v9, :cond_d

    .line 272
    .line 273
    sget-object v2, Lkh0;->k:Li80;

    .line 274
    .line 275
    const-string v4, "Creating transaction for id {} ({}/{})"

    .line 276
    .line 277
    iget-object v7, v3, Lme0;->f:Ll00;

    .line 278
    .line 279
    iget v7, v7, Ll00;->f:I

    .line 280
    .line 281
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 282
    .line 283
    .line 284
    move-result-object v7

    .line 285
    invoke-virtual {v3}, Lme0;->e()Ltn0;

    .line 286
    .line 287
    .line 288
    move-result-object v12

    .line 289
    iget-object v12, v12, Ltn0;->f:Lgg0;

    .line 290
    .line 291
    invoke-virtual {v3}, Lme0;->e()Ltn0;

    .line 292
    .line 293
    .line 294
    move-result-object v13

    .line 295
    iget v13, v13, Ltn0;->g:I

    .line 296
    .line 297
    sget-object v14, Lk31;->a:Lbs0;

    .line 298
    .line 299
    invoke-virtual {v14, v13}, Lue0;->e(I)Ljava/lang/String;

    .line 300
    .line 301
    .line 302
    move-result-object v13

    .line 303
    filled-new-array {v7, v12, v13}, [Ljava/lang/Object;

    .line 304
    .line 305
    .line 306
    move-result-object v7

    .line 307
    invoke-interface {v2, v4, v7}, Li80;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 308
    .line 309
    .line 310
    new-instance v2, Ljh0;

    .line 311
    .line 312
    iget-object v7, v9, Lih0;->a:Ljava/nio/channels/SocketChannel;

    .line 313
    .line 314
    move-object v4, v15

    .line 315
    invoke-direct/range {v2 .. v8}, Ljh0;-><init>(Lme0;[BJLjava/nio/channels/SocketChannel;Ljava/util/concurrent/CompletableFuture;)V

    .line 316
    .line 317
    .line 318
    iget-object v4, v9, Lih0;->b:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 319
    .line 320
    invoke-virtual {v4, v2}, Ljava/util/concurrent/ConcurrentLinkedQueue;->add(Ljava/lang/Object;)Z

    .line 321
    .line 322
    .line 323
    iget-object v0, v0, Lkh0;->i:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 324
    .line 325
    invoke-virtual {v0, v9}, Ljava/util/concurrent/ConcurrentLinkedQueue;->add(Ljava/lang/Object;)Z

    .line 326
    .line 327
    .line 328
    invoke-virtual {v11}, Ljava/nio/channels/Selector;->wakeup()Ljava/nio/channels/Selector;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 329
    .line 330
    .line 331
    goto/16 :goto_10

    .line 332
    .line 333
    :catch_0
    move-exception v0

    .line 334
    invoke-virtual {v8, v0}, Ljava/util/concurrent/CompletableFuture;->completeExceptionally(Ljava/lang/Throwable;)Z

    .line 335
    .line 336
    .line 337
    goto/16 :goto_10

    .line 338
    .line 339
    :cond_a
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 340
    .line 341
    .line 342
    sget-object v0, Ldn;->a:Lvq2;

    .line 343
    .line 344
    iget-object v2, v1, Lew0;->c:Ljava/time/Duration;

    .line 345
    .line 346
    iget-object v0, v0, Lvq2;->h:Ljava/lang/Object;

    .line 347
    .line 348
    move-object v13, v0

    .line 349
    check-cast v13, Lnh0;

    .line 350
    .line 351
    iget v0, v13, Lnh0;->i:I

    .line 352
    .line 353
    iget v4, v13, Lnh0;->j:I

    .line 354
    .line 355
    iget-object v5, v13, Lnh0;->k:Ljava/security/SecureRandom;

    .line 356
    .line 357
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 358
    .line 359
    .line 360
    move-result-wide v6

    .line 361
    invoke-virtual {v2}, Ljava/time/Duration;->toNanos()J

    .line 362
    .line 363
    .line 364
    move-result-wide v16

    .line 365
    add-long v17, v16, v6

    .line 366
    .line 367
    new-instance v20, Ljava/util/concurrent/CompletableFuture;

    .line 368
    .line 369
    invoke-direct/range {v20 .. v20}, Ljava/util/concurrent/CompletableFuture;-><init>()V

    .line 370
    .line 371
    .line 372
    const/4 v2, 0x0

    .line 373
    :try_start_2
    invoke-static {}, Ldh0;->c()Ljava/nio/channels/Selector;

    .line 374
    .line 375
    .line 376
    move-result-object v6

    .line 377
    invoke-static {}, Ljava/nio/channels/DatagramChannel;->open()Ljava/nio/channels/DatagramChannel;

    .line 378
    .line 379
    .line 380
    move-result-object v7
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_5
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 381
    :try_start_3
    invoke-virtual {v7, v11}, Ljava/nio/channels/SelectableChannel;->configureBlocking(Z)Ljava/nio/channels/SelectableChannel;

    .line 382
    .line 383
    .line 384
    move/from16 v16, v12

    .line 385
    .line 386
    new-instance v12, Lmh0;

    .line 387
    .line 388
    iget-object v8, v3, Lme0;->f:Ll00;

    .line 389
    .line 390
    iget v14, v8, Ll00;->f:I
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_4
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 391
    .line 392
    move-object/from16 v19, v7

    .line 393
    .line 394
    :try_start_4
    invoke-direct/range {v12 .. v20}, Lmh0;-><init>(Lnh0;I[BIJLjava/nio/channels/DatagramChannel;Ljava/util/concurrent/CompletableFuture;)V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 395
    .line 396
    .line 397
    move-object/from16 v7, v19

    .line 398
    .line 399
    move-object/from16 v8, v20

    .line 400
    .line 401
    :goto_9
    const/16 v14, 0x400

    .line 402
    .line 403
    if-ge v11, v14, :cond_c

    .line 404
    .line 405
    if-eqz v5, :cond_b

    .line 406
    .line 407
    :try_start_5
    new-instance v14, Ljava/net/InetSocketAddress;

    .line 408
    .line 409
    invoke-virtual {v5, v4}, Ljava/util/Random;->nextInt(I)I

    .line 410
    .line 411
    .line 412
    move-result v15

    .line 413
    add-int/2addr v15, v0

    .line 414
    invoke-direct {v14, v15}, Ljava/net/InetSocketAddress;-><init>(I)V

    .line 415
    .line 416
    .line 417
    goto :goto_c

    .line 418
    :catchall_0
    move-exception v0

    .line 419
    :goto_a
    move-object v2, v7

    .line 420
    goto :goto_e

    .line 421
    :catch_1
    move-exception v0

    .line 422
    :goto_b
    move-object v2, v7

    .line 423
    goto :goto_f

    .line 424
    :cond_b
    move-object v14, v2

    .line 425
    :goto_c
    invoke-virtual {v7, v14}, Ljava/nio/channels/DatagramChannel;->bind(Ljava/net/SocketAddress;)Ljava/nio/channels/DatagramChannel;
    :try_end_5
    .catch Ljava/net/SocketException; {:try_start_5 .. :try_end_5} :catch_2
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_1
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 426
    .line 427
    .line 428
    :try_start_6
    invoke-virtual {v7, v9}, Ljava/nio/channels/DatagramChannel;->connect(Ljava/net/SocketAddress;)Ljava/nio/channels/DatagramChannel;

    .line 429
    .line 430
    .line 431
    iget-object v0, v13, Lnh0;->m:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 432
    .line 433
    invoke-virtual {v0, v12}, Ljava/util/concurrent/ConcurrentLinkedQueue;->add(Ljava/lang/Object;)Z

    .line 434
    .line 435
    .line 436
    iget-object v0, v13, Lnh0;->l:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 437
    .line 438
    invoke-virtual {v0, v12}, Ljava/util/concurrent/ConcurrentLinkedQueue;->add(Ljava/lang/Object;)Z

    .line 439
    .line 440
    .line 441
    invoke-virtual {v6}, Ljava/nio/channels/Selector;->wakeup()Ljava/nio/channels/Selector;

    .line 442
    .line 443
    .line 444
    goto :goto_10

    .line 445
    :catch_2
    add-int/lit8 v11, v11, 0x1

    .line 446
    .line 447
    goto :goto_9

    .line 448
    :cond_c
    new-instance v0, Ljava/io/IOException;

    .line 449
    .line 450
    const-string v2, "No available source port found"

    .line 451
    .line 452
    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 453
    .line 454
    .line 455
    invoke-virtual {v12, v0}, Lmh0;->b(Ljava/io/IOException;)V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_1
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 456
    .line 457
    .line 458
    goto :goto_10

    .line 459
    :catchall_1
    move-exception v0

    .line 460
    move-object/from16 v7, v19

    .line 461
    .line 462
    goto :goto_a

    .line 463
    :catch_3
    move-exception v0

    .line 464
    move-object/from16 v7, v19

    .line 465
    .line 466
    :goto_d
    move-object/from16 v8, v20

    .line 467
    .line 468
    goto :goto_b

    .line 469
    :catch_4
    move-exception v0

    .line 470
    goto :goto_d

    .line 471
    :catchall_2
    move-exception v0

    .line 472
    goto :goto_e

    .line 473
    :catch_5
    move-exception v0

    .line 474
    move-object/from16 v8, v20

    .line 475
    .line 476
    goto :goto_f

    .line 477
    :goto_e
    invoke-static {v2}, Lnh0;->e(Ljava/nio/channels/DatagramChannel;)V

    .line 478
    .line 479
    .line 480
    throw v0

    .line 481
    :goto_f
    invoke-static {v2}, Lnh0;->e(Ljava/nio/channels/DatagramChannel;)V

    .line 482
    .line 483
    .line 484
    invoke-virtual {v8, v0}, Ljava/util/concurrent/CompletableFuture;->completeExceptionally(Ljava/lang/Throwable;)Z

    .line 485
    .line 486
    .line 487
    :cond_d
    :goto_10
    new-instance v0, Ldw0;

    .line 488
    .line 489
    move-object/from16 v5, p3

    .line 490
    .line 491
    move v2, v10

    .line 492
    move/from16 v4, v21

    .line 493
    .line 494
    invoke-direct/range {v0 .. v5}, Ldw0;-><init>(Lew0;ILme0;ZLjava/util/concurrent/Executor;)V

    .line 495
    .line 496
    .line 497
    invoke-virtual {v8, v0, v5}, Ljava/util/concurrent/CompletableFuture;->thenComposeAsync(Ljava/util/function/Function;Ljava/util/concurrent/Executor;)Ljava/util/concurrent/CompletableFuture;

    .line 498
    .line 499
    .line 500
    move-result-object v0

    .line 501
    return-object v0

    .line 502
    :catch_6
    move-exception v0

    .line 503
    new-instance v1, Ljava/util/concurrent/CompletableFuture;

    .line 504
    .line 505
    invoke-direct {v1}, Ljava/util/concurrent/CompletableFuture;-><init>()V

    .line 506
    .line 507
    .line 508
    invoke-virtual {v1, v0}, Ljava/util/concurrent/CompletableFuture;->completeExceptionally(Ljava/lang/Throwable;)Z

    .line 509
    .line 510
    .line 511
    return-object v1
.end method

.method public final f(Lme0;Ljava/util/concurrent/Executor;)Ljava/util/concurrent/CompletionStage;
    .locals 3

    .line 1
    iget-object v0, p1, Lme0;->f:Ll00;

    .line 2
    .line 3
    invoke-virtual {v0}, Ll00;->d()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p1}, Lme0;->e()Ltn0;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    iget v0, v0, Ltn0;->g:I

    .line 16
    .line 17
    const/16 v1, 0xfc

    .line 18
    .line 19
    if-ne v0, v1, :cond_0

    .line 20
    .line 21
    new-instance v0, Ljava/util/concurrent/CompletableFuture;

    .line 22
    .line 23
    invoke-direct {v0}, Ljava/util/concurrent/CompletableFuture;-><init>()V

    .line 24
    .line 25
    .line 26
    new-instance v1, Ltr;

    .line 27
    .line 28
    const/4 v2, 0x2

    .line 29
    invoke-direct {v1, p0, v0, p1, v2}, Ltr;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 30
    .line 31
    .line 32
    invoke-static {v1, p2}, Ljava/util/concurrent/CompletableFuture;->runAsync(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)Ljava/util/concurrent/CompletableFuture;

    .line 33
    .line 34
    .line 35
    return-object v0

    .line 36
    :cond_0
    invoke-virtual {p1}, Lme0;->c()Lme0;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    iget-object v0, p0, Lew0;->b:Lki0;

    .line 41
    .line 42
    if-eqz v0, :cond_2

    .line 43
    .line 44
    invoke-virtual {p1}, Lme0;->d()Lki0;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    if-eqz v1, :cond_1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_1
    const/4 v1, 0x3

    .line 52
    invoke-virtual {p1, v0, v1}, Lme0;->b(Ltn0;I)V

    .line 53
    .line 54
    .line 55
    :cond_2
    :goto_0
    const/4 v0, 0x0

    .line 56
    invoke-virtual {p0, p1, v0, p2}, Lew0;->e(Lme0;ZLjava/util/concurrent/Executor;)Ljava/util/concurrent/CompletableFuture;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    return-object p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "SimpleResolver ["

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lew0;->a:Ljava/net/InetSocketAddress;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, "]"

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    return-object v0
.end method
