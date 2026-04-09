.class public abstract Lmd2;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# static fields
.field public static final a:Lld2;

.field public static final b:Lld2;

.field public static final c:Lld2;

.field public static final d:Lkd2;

.field public static final e:Luq3;

.field public static final f:Lld2;

.field public static final g:Lld2;


# direct methods
.method static constructor <clinit>()V
    .locals 15

    .line 1
    sget-object v0, Lmz1;->bc:Liz1;

    .line 2
    .line 3
    sget-object v1, Ltw1;->e:Ltw1;

    .line 4
    .line 5
    iget-object v2, v1, Ltw1;->c:Lkz1;

    .line 6
    .line 7
    iget-object v1, v1, Ltw1;->c:Lkz1;

    .line 8
    .line 9
    invoke-virtual {v2, v0}, Lkz1;->b(Liz1;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    const-string v3, "Default"

    .line 14
    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    invoke-virtual {v1, v0}, Lkz1;->b(Liz1;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Ljava/lang/Boolean;

    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    sget-object v0, Lmz1;->cc:Liz1;

    .line 30
    .line 31
    invoke-virtual {v1, v0}, Lkz1;->b(Liz1;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    if-eqz v2, :cond_0

    .line 36
    .line 37
    sget-object v2, Lmz1;->dc:Liz1;

    .line 38
    .line 39
    invoke-virtual {v1, v2}, Lkz1;->b(Liz1;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    if-eqz v4, :cond_0

    .line 44
    .line 45
    new-instance v5, Ljava/util/concurrent/ThreadPoolExecutor;

    .line 46
    .line 47
    invoke-virtual {v1, v0}, Lkz1;->b(Liz1;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    check-cast v4, Ljava/lang/Integer;

    .line 52
    .line 53
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 54
    .line 55
    .line 56
    move-result v6

    .line 57
    invoke-virtual {v1, v0}, Lkz1;->b(Liz1;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    check-cast v0, Ljava/lang/Integer;

    .line 62
    .line 63
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 64
    .line 65
    .line 66
    move-result v7

    .line 67
    sget-object v10, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 68
    .line 69
    new-instance v11, Ljava/util/concurrent/LinkedBlockingQueue;

    .line 70
    .line 71
    invoke-direct {v11}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    .line 72
    .line 73
    .line 74
    new-instance v12, Lzc1;

    .line 75
    .line 76
    const/4 v0, 0x1

    .line 77
    invoke-direct {v12, v3, v0}, Lzc1;-><init>(Ljava/lang/String;I)V

    .line 78
    .line 79
    .line 80
    const-wide/16 v8, 0xa

    .line 81
    .line 82
    invoke-direct/range {v5 .. v12}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v1, v2}, Lkz1;->b(Liz1;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    check-cast v0, Ljava/lang/Boolean;

    .line 90
    .line 91
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    invoke-virtual {v5, v0}, Ljava/util/concurrent/ThreadPoolExecutor;->allowCoreThreadTimeOut(Z)V

    .line 96
    .line 97
    .line 98
    goto :goto_0

    .line 99
    :cond_0
    new-instance v6, Ljava/util/concurrent/ThreadPoolExecutor;

    .line 100
    .line 101
    sget-object v11, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 102
    .line 103
    new-instance v12, Ljava/util/concurrent/SynchronousQueue;

    .line 104
    .line 105
    invoke-direct {v12}, Ljava/util/concurrent/SynchronousQueue;-><init>()V

    .line 106
    .line 107
    .line 108
    new-instance v13, Lzc1;

    .line 109
    .line 110
    const/4 v0, 0x1

    .line 111
    invoke-direct {v13, v3, v0}, Lzc1;-><init>(Ljava/lang/String;I)V

    .line 112
    .line 113
    .line 114
    const/4 v7, 0x2

    .line 115
    const v8, 0x7fffffff

    .line 116
    .line 117
    .line 118
    const-wide/16 v9, 0xa

    .line 119
    .line 120
    invoke-direct/range {v6 .. v13}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    .line 121
    .line 122
    .line 123
    move-object v5, v6

    .line 124
    :goto_0
    new-instance v0, Lld2;

    .line 125
    .line 126
    invoke-direct {v0, v5}, Lld2;-><init>(Ljava/util/concurrent/Executor;)V

    .line 127
    .line 128
    .line 129
    sput-object v0, Lmd2;->a:Lld2;

    .line 130
    .line 131
    new-instance v6, Ljava/util/concurrent/ThreadPoolExecutor;

    .line 132
    .line 133
    sget-object v11, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 134
    .line 135
    new-instance v12, Ljava/util/concurrent/LinkedBlockingQueue;

    .line 136
    .line 137
    invoke-direct {v12}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    .line 138
    .line 139
    .line 140
    new-instance v13, Lzc1;

    .line 141
    .line 142
    const-string v0, "Loader"

    .line 143
    .line 144
    const/4 v1, 0x1

    .line 145
    invoke-direct {v13, v0, v1}, Lzc1;-><init>(Ljava/lang/String;I)V

    .line 146
    .line 147
    .line 148
    const/4 v7, 0x5

    .line 149
    const/4 v8, 0x5

    .line 150
    const-wide/16 v9, 0xa

    .line 151
    .line 152
    invoke-direct/range {v6 .. v13}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    .line 153
    .line 154
    .line 155
    const/4 v0, 0x1

    .line 156
    invoke-virtual {v6, v0}, Ljava/util/concurrent/ThreadPoolExecutor;->allowCoreThreadTimeOut(Z)V

    .line 157
    .line 158
    .line 159
    new-instance v1, Lld2;

    .line 160
    .line 161
    invoke-direct {v1, v6}, Lld2;-><init>(Ljava/util/concurrent/Executor;)V

    .line 162
    .line 163
    .line 164
    sput-object v1, Lmd2;->b:Lld2;

    .line 165
    .line 166
    new-instance v7, Ljava/util/concurrent/ThreadPoolExecutor;

    .line 167
    .line 168
    new-instance v13, Ljava/util/concurrent/LinkedBlockingQueue;

    .line 169
    .line 170
    invoke-direct {v13}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    .line 171
    .line 172
    .line 173
    new-instance v14, Lzc1;

    .line 174
    .line 175
    const-string v1, "Activeview"

    .line 176
    .line 177
    const/4 v2, 0x1

    .line 178
    invoke-direct {v14, v1, v2}, Lzc1;-><init>(Ljava/lang/String;I)V

    .line 179
    .line 180
    .line 181
    const/4 v8, 0x1

    .line 182
    const/4 v9, 0x1

    .line 183
    move-object v12, v11

    .line 184
    const-wide/16 v10, 0xa

    .line 185
    .line 186
    invoke-direct/range {v7 .. v14}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    .line 187
    .line 188
    .line 189
    invoke-virtual {v7, v0}, Ljava/util/concurrent/ThreadPoolExecutor;->allowCoreThreadTimeOut(Z)V

    .line 190
    .line 191
    .line 192
    new-instance v0, Lld2;

    .line 193
    .line 194
    invoke-direct {v0, v7}, Lld2;-><init>(Ljava/util/concurrent/Executor;)V

    .line 195
    .line 196
    .line 197
    sput-object v0, Lmd2;->c:Lld2;

    .line 198
    .line 199
    new-instance v0, Lkd2;

    .line 200
    .line 201
    new-instance v1, Lzc1;

    .line 202
    .line 203
    const-string v2, "Schedule"

    .line 204
    .line 205
    const/4 v3, 0x1

    .line 206
    invoke-direct {v1, v2, v3}, Lzc1;-><init>(Ljava/lang/String;I)V

    .line 207
    .line 208
    .line 209
    const/4 v2, 0x3

    .line 210
    invoke-direct {v0, v2, v1}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;-><init>(ILjava/util/concurrent/ThreadFactory;)V

    .line 211
    .line 212
    .line 213
    sput-object v0, Lmd2;->d:Lkd2;

    .line 214
    .line 215
    new-instance v1, Luq3;

    .line 216
    .line 217
    invoke-direct {v1, v0}, Luq3;-><init>(Ljava/util/concurrent/ScheduledExecutorService;)V

    .line 218
    .line 219
    .line 220
    sput-object v1, Lmd2;->e:Luq3;

    .line 221
    .line 222
    new-instance v0, Lia1;

    .line 223
    .line 224
    const/4 v1, 0x1

    .line 225
    invoke-direct {v0, v1}, Lia1;-><init>(I)V

    .line 226
    .line 227
    .line 228
    new-instance v1, Lld2;

    .line 229
    .line 230
    invoke-direct {v1, v0}, Lld2;-><init>(Ljava/util/concurrent/Executor;)V

    .line 231
    .line 232
    .line 233
    sput-object v1, Lmd2;->f:Lld2;

    .line 234
    .line 235
    new-instance v0, Lld2;

    .line 236
    .line 237
    sget-object v1, Ldq3;->f:Ldq3;

    .line 238
    .line 239
    invoke-direct {v0, v1}, Lld2;-><init>(Ljava/util/concurrent/Executor;)V

    .line 240
    .line 241
    .line 242
    sput-object v0, Lmd2;->g:Lld2;

    .line 243
    .line 244
    return-void
.end method
