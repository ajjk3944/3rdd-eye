.class public final Lp63;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lca4;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lp63;->a:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final d()Ljava/lang/Object;
    .locals 9

    .line 1
    iget v0, p0, Lp63;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Lbk3;

    .line 7
    .line 8
    invoke-direct {v0}, Lbk3;-><init>()V

    .line 9
    .line 10
    .line 11
    return-object v0

    .line 12
    :pswitch_0
    new-instance v0, Lqj3;

    .line 13
    .line 14
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 15
    .line 16
    .line 17
    return-object v0

    .line 18
    :pswitch_1
    new-instance v0, Lfd3;

    .line 19
    .line 20
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 21
    .line 22
    .line 23
    return-object v0

    .line 24
    :pswitch_2
    new-instance v0, Lsh3;

    .line 25
    .line 26
    invoke-direct {v0}, Lsh3;-><init>()V

    .line 27
    .line 28
    .line 29
    return-object v0

    .line 30
    :pswitch_3
    new-instance v0, Lfi3;

    .line 31
    .line 32
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 33
    .line 34
    .line 35
    return-object v0

    .line 36
    :pswitch_4
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadScheduledExecutor()Ljava/util/concurrent/ScheduledExecutorService;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-static {v0}, Li41;->M(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    return-object v0

    .line 44
    :pswitch_5
    new-instance v0, Lrf3;

    .line 45
    .line 46
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 47
    .line 48
    .line 49
    return-object v0

    .line 50
    :pswitch_6
    new-instance v0, Lun;

    .line 51
    .line 52
    const/4 v1, 0x2

    .line 53
    invoke-direct {v0, v1}, Lun;-><init>(I)V

    .line 54
    .line 55
    .line 56
    return-object v0

    .line 57
    :pswitch_7
    sget-object v0, Lmd2;->f:Lld2;

    .line 58
    .line 59
    invoke-static {v0}, Li41;->M(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    return-object v0

    .line 63
    :pswitch_8
    sget-object v0, Lmd2;->e:Luq3;

    .line 64
    .line 65
    invoke-static {v0}, Li41;->M(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    return-object v0

    .line 69
    :pswitch_9
    invoke-static {}, Ljava/util/concurrent/Executors;->defaultThreadFactory()Ljava/util/concurrent/ThreadFactory;

    .line 70
    .line 71
    .line 72
    move-result-object v8

    .line 73
    new-instance v1, Ljava/util/concurrent/ThreadPoolExecutor;

    .line 74
    .line 75
    sget-object v6, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 76
    .line 77
    new-instance v7, Ljava/util/concurrent/LinkedBlockingQueue;

    .line 78
    .line 79
    invoke-direct {v7}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    .line 80
    .line 81
    .line 82
    const/4 v2, 0x1

    .line 83
    const-wide/16 v4, 0x3c

    .line 84
    .line 85
    move v3, v2

    .line 86
    invoke-direct/range {v1 .. v8}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    .line 87
    .line 88
    .line 89
    const/4 v0, 0x1

    .line 90
    invoke-virtual {v1, v0}, Ljava/util/concurrent/ThreadPoolExecutor;->allowCoreThreadTimeOut(Z)V

    .line 91
    .line 92
    .line 93
    invoke-static {v1}, Ljava/util/concurrent/Executors;->unconfigurableExecutorService(Ljava/util/concurrent/ExecutorService;)Ljava/util/concurrent/ExecutorService;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    instance-of v1, v0, Lpq3;

    .line 98
    .line 99
    if-eqz v1, :cond_0

    .line 100
    .line 101
    check-cast v0, Lpq3;

    .line 102
    .line 103
    goto :goto_1

    .line 104
    :cond_0
    instance-of v1, v0, Ljava/util/concurrent/ScheduledExecutorService;

    .line 105
    .line 106
    if-eqz v1, :cond_1

    .line 107
    .line 108
    new-instance v1, Luq3;

    .line 109
    .line 110
    check-cast v0, Ljava/util/concurrent/ScheduledExecutorService;

    .line 111
    .line 112
    invoke-direct {v1, v0}, Luq3;-><init>(Ljava/util/concurrent/ScheduledExecutorService;)V

    .line 113
    .line 114
    .line 115
    :goto_0
    move-object v0, v1

    .line 116
    goto :goto_1

    .line 117
    :cond_1
    new-instance v1, Lld2;

    .line 118
    .line 119
    invoke-direct {v1, v0}, Lld2;-><init>(Ljava/util/concurrent/ExecutorService;)V

    .line 120
    .line 121
    .line 122
    goto :goto_0

    .line 123
    :goto_1
    return-object v0

    .line 124
    :pswitch_a
    sget-object v0, Lmd2;->f:Lld2;

    .line 125
    .line 126
    invoke-static {v0}, Li41;->M(Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    return-object v0

    .line 130
    :pswitch_b
    new-instance v0, Lj93;

    .line 131
    .line 132
    invoke-direct {v0}, Lj93;-><init>()V

    .line 133
    .line 134
    .line 135
    return-object v0

    .line 136
    :pswitch_c
    new-instance v0, Lx83;

    .line 137
    .line 138
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 139
    .line 140
    .line 141
    const/4 v1, 0x0

    .line 142
    iput-object v1, v0, Lx83;->a:Lvg0;

    .line 143
    .line 144
    return-object v0

    .line 145
    :pswitch_d
    sget-object v0, Lym;->a:Lym;

    .line 146
    .line 147
    return-object v0

    .line 148
    :pswitch_e
    new-instance v0, Ls83;

    .line 149
    .line 150
    invoke-direct {v0}, Ls83;-><init>()V

    .line 151
    .line 152
    .line 153
    return-object v0

    .line 154
    :pswitch_f
    new-instance v1, Lr83;

    .line 155
    .line 156
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 157
    .line 158
    .line 159
    :try_start_0
    invoke-static {}, Lqr3;->a()V
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 160
    .line 161
    .line 162
    goto :goto_2

    .line 163
    :catch_0
    move-exception v0

    .line 164
    const-string v2, "Failed to Configure Aead. "

    .line 165
    .line 166
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object v3

    .line 170
    invoke-virtual {v2, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object v2

    .line 174
    invoke-static {v2}, Lgi2;->G(Ljava/lang/String;)V

    .line 175
    .line 176
    .line 177
    sget-object v2, Lhg4;->C:Lhg4;

    .line 178
    .line 179
    iget-object v2, v2, Lhg4;->h:Lgd2;

    .line 180
    .line 181
    const-string v3, "CryptoUtils.registerAead"

    .line 182
    .line 183
    invoke-virtual {v2, v3, v0}, Lgd2;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 184
    .line 185
    .line 186
    :goto_2
    return-object v1

    .line 187
    :pswitch_10
    new-instance v0, Li83;

    .line 188
    .line 189
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 190
    .line 191
    .line 192
    return-object v0

    .line 193
    :pswitch_11
    new-instance v0, Lj83;

    .line 194
    .line 195
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 196
    .line 197
    .line 198
    return-object v0

    .line 199
    :pswitch_12
    sget-object v0, Lmd2;->a:Lld2;

    .line 200
    .line 201
    invoke-static {v0}, Li41;->M(Ljava/lang/Object;)V

    .line 202
    .line 203
    .line 204
    new-instance v1, Lg43;

    .line 205
    .line 206
    const/4 v2, 0x5

    .line 207
    invoke-direct {v1, v0, v2}, Lg43;-><init>(Lpq3;I)V

    .line 208
    .line 209
    .line 210
    return-object v1

    .line 211
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
