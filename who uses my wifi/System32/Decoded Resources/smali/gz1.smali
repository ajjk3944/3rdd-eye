.class public final synthetic Lgz1;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ljava/util/concurrent/Callable;


# static fields
.field public static final synthetic b:Lgz1;

.field public static final synthetic c:Lgz1;

.field public static final synthetic d:Lgz1;

.field public static final synthetic e:Lgz1;

.field public static final synthetic f:Lgz1;


# instance fields
.field public final synthetic a:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lgz1;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lgz1;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lgz1;->b:Lgz1;

    .line 8
    .line 9
    new-instance v0, Lgz1;

    .line 10
    .line 11
    const/4 v1, 0x2

    .line 12
    invoke-direct {v0, v1}, Lgz1;-><init>(I)V

    .line 13
    .line 14
    .line 15
    sput-object v0, Lgz1;->c:Lgz1;

    .line 16
    .line 17
    new-instance v0, Lgz1;

    .line 18
    .line 19
    const/4 v1, 0x3

    .line 20
    invoke-direct {v0, v1}, Lgz1;-><init>(I)V

    .line 21
    .line 22
    .line 23
    sput-object v0, Lgz1;->d:Lgz1;

    .line 24
    .line 25
    new-instance v0, Lgz1;

    .line 26
    .line 27
    const/4 v1, 0x6

    .line 28
    invoke-direct {v0, v1}, Lgz1;-><init>(I)V

    .line 29
    .line 30
    .line 31
    sput-object v0, Lgz1;->e:Lgz1;

    .line 32
    .line 33
    new-instance v0, Lgz1;

    .line 34
    .line 35
    const/4 v1, 0x7

    .line 36
    invoke-direct {v0, v1}, Lgz1;-><init>(I)V

    .line 37
    .line 38
    .line 39
    sput-object v0, Lgz1;->f:Lgz1;

    .line 40
    .line 41
    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lgz1;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lg43;)V
    .locals 0

    const/4 p1, 0x4

    iput p1, p0, Lgz1;->a:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, Lgz1;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    return-object v0

    .line 8
    :pswitch_0
    new-instance v0, Ljava/util/HashMap;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 11
    .line 12
    .line 13
    sget-object v1, Lmz1;->V:Liz1;

    .line 14
    .line 15
    sget-object v2, Ltw1;->e:Ltw1;

    .line 16
    .line 17
    iget-object v3, v2, Ltw1;->c:Lkz1;

    .line 18
    .line 19
    invoke-virtual {v3, v1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    check-cast v1, Ljava/lang/String;

    .line 24
    .line 25
    if-eqz v1, :cond_0

    .line 26
    .line 27
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    if-nez v3, :cond_0

    .line 32
    .line 33
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 34
    .line 35
    sget-object v4, Lmz1;->W:Liz1;

    .line 36
    .line 37
    iget-object v2, v2, Ltw1;->c:Lkz1;

    .line 38
    .line 39
    invoke-virtual {v2, v4}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    check-cast v2, Ljava/lang/Integer;

    .line 44
    .line 45
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    if-lt v3, v2, :cond_0

    .line 50
    .line 51
    const-string v2, ","

    .line 52
    .line 53
    const/4 v3, -0x1

    .line 54
    invoke-virtual {v1, v2, v3}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    array-length v2, v1

    .line 59
    const/4 v3, 0x0

    .line 60
    :goto_0
    if-ge v3, v2, :cond_0

    .line 61
    .line 62
    aget-object v4, v1, v3

    .line 63
    .line 64
    invoke-static {v4}, Lcg2;->a(Ljava/lang/String;)Ljava/util/List;

    .line 65
    .line 66
    .line 67
    move-result-object v5

    .line 68
    invoke-virtual {v0, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    add-int/lit8 v3, v3, 0x1

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_0
    new-instance v1, Lw43;

    .line 75
    .line 76
    const/4 v2, 0x1

    .line 77
    invoke-direct {v1, v0, v2}, Lw43;-><init>(Ljava/util/HashMap;I)V

    .line 78
    .line 79
    .line 80
    return-object v1

    .line 81
    :pswitch_1
    new-instance v0, Lq33;

    .line 82
    .line 83
    new-instance v1, Lorg/json/JSONObject;

    .line 84
    .line 85
    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 86
    .line 87
    .line 88
    const/4 v2, 0x2

    .line 89
    invoke-direct {v0, v2, v1}, Lq33;-><init>(ILjava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    return-object v0

    .line 93
    :pswitch_2
    sget-object v0, Lmz1;->G5:Liz1;

    .line 94
    .line 95
    sget-object v1, Ltw1;->e:Ltw1;

    .line 96
    .line 97
    iget-object v2, v1, Ltw1;->c:Lkz1;

    .line 98
    .line 99
    invoke-virtual {v2, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    check-cast v0, Ljava/lang/Boolean;

    .line 104
    .line 105
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 106
    .line 107
    .line 108
    move-result v0

    .line 109
    if-eqz v0, :cond_3

    .line 110
    .line 111
    sget-object v0, Lmz1;->P5:Liz1;

    .line 112
    .line 113
    iget-object v1, v1, Ltw1;->c:Lkz1;

    .line 114
    .line 115
    invoke-virtual {v1, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    check-cast v0, Ljava/lang/Boolean;

    .line 120
    .line 121
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 122
    .line 123
    .line 124
    move-result v0

    .line 125
    if-eqz v0, :cond_2

    .line 126
    .line 127
    sget-object v0, Lg43;->c:Ljava/lang/String;

    .line 128
    .line 129
    if-nez v0, :cond_1

    .line 130
    .line 131
    sget-object v0, Lhg4;->C:Lhg4;

    .line 132
    .line 133
    iget-object v0, v0, Lhg4;->x:Lsu2;

    .line 134
    .line 135
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 136
    .line 137
    .line 138
    invoke-static {}, Lsu2;->h()Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    sput-object v0, Lg43;->c:Ljava/lang/String;

    .line 143
    .line 144
    :cond_1
    new-instance v0, Lj33;

    .line 145
    .line 146
    sget-object v1, Lg43;->c:Ljava/lang/String;

    .line 147
    .line 148
    const/4 v2, 0x3

    .line 149
    invoke-direct {v0, v1, v2}, Lj33;-><init>(Ljava/lang/String;I)V

    .line 150
    .line 151
    .line 152
    goto :goto_1

    .line 153
    :cond_2
    new-instance v0, Lj33;

    .line 154
    .line 155
    sget-object v1, Lhg4;->C:Lhg4;

    .line 156
    .line 157
    iget-object v1, v1, Lhg4;->x:Lsu2;

    .line 158
    .line 159
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 160
    .line 161
    .line 162
    invoke-static {}, Lsu2;->h()Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v1

    .line 166
    const/4 v2, 0x3

    .line 167
    invoke-direct {v0, v1, v2}, Lj33;-><init>(Ljava/lang/String;I)V

    .line 168
    .line 169
    .line 170
    goto :goto_1

    .line 171
    :cond_3
    new-instance v0, Lj33;

    .line 172
    .line 173
    const/4 v1, 0x0

    .line 174
    const/4 v2, 0x3

    .line 175
    invoke-direct {v0, v1, v2}, Lj33;-><init>(Ljava/lang/String;I)V

    .line 176
    .line 177
    .line 178
    :goto_1
    return-object v0

    .line 179
    :pswitch_3
    new-instance v0, Landroid/os/Bundle;

    .line 180
    .line 181
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 182
    .line 183
    .line 184
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    .line 185
    .line 186
    .line 187
    move-result-object v1

    .line 188
    invoke-virtual {v1}, Ljava/lang/Runtime;->freeMemory()J

    .line 189
    .line 190
    .line 191
    move-result-wide v2

    .line 192
    const-string v4, "runtime_free"

    .line 193
    .line 194
    invoke-virtual {v0, v4, v2, v3}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 195
    .line 196
    .line 197
    invoke-virtual {v1}, Ljava/lang/Runtime;->maxMemory()J

    .line 198
    .line 199
    .line 200
    move-result-wide v2

    .line 201
    const-string v4, "runtime_max"

    .line 202
    .line 203
    invoke-virtual {v0, v4, v2, v3}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 204
    .line 205
    .line 206
    invoke-virtual {v1}, Ljava/lang/Runtime;->totalMemory()J

    .line 207
    .line 208
    .line 209
    move-result-wide v1

    .line 210
    const-string v3, "runtime_total"

    .line 211
    .line 212
    invoke-virtual {v0, v3, v1, v2}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 213
    .line 214
    .line 215
    sget-object v1, Lhg4;->C:Lhg4;

    .line 216
    .line 217
    iget-object v1, v1, Lhg4;->h:Lgd2;

    .line 218
    .line 219
    iget-object v1, v1, Lgd2;->k:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 220
    .line 221
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 222
    .line 223
    .line 224
    move-result v1

    .line 225
    const-string v2, "web_view_count"

    .line 226
    .line 227
    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 228
    .line 229
    .line 230
    new-instance v1, Lm33;

    .line 231
    .line 232
    const/4 v2, 0x1

    .line 233
    invoke-direct {v1, v2, v0}, Lm33;-><init>(ILandroid/os/Bundle;)V

    .line 234
    .line 235
    .line 236
    return-object v1

    .line 237
    :pswitch_4
    new-instance v0, Lo43;

    .line 238
    .line 239
    sget-object v1, Lhg4;->C:Lhg4;

    .line 240
    .line 241
    iget-object v2, v1, Lhg4;->o:Lus1;

    .line 242
    .line 243
    iget-object v3, v2, Lus1;->a:Ljava/lang/Object;

    .line 244
    .line 245
    monitor-enter v3

    .line 246
    :try_start_0
    iget-object v2, v2, Lus1;->c:Ljava/lang/String;

    .line 247
    .line 248
    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 249
    iget-object v1, v1, Lhg4;->o:Lus1;

    .line 250
    .line 251
    invoke-virtual {v1}, Lus1;->h()Z

    .line 252
    .line 253
    .line 254
    move-result v1

    .line 255
    invoke-direct {v0, v2, v1}, Lo43;-><init>(Ljava/lang/String;Z)V

    .line 256
    .line 257
    .line 258
    return-object v0

    .line 259
    :catchall_0
    move-exception v0

    .line 260
    :try_start_1
    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 261
    throw v0

    .line 262
    :pswitch_5
    new-instance v0, Lh43;

    .line 263
    .line 264
    sget-object v1, Lhg4;->C:Lhg4;

    .line 265
    .line 266
    iget-object v2, v1, Lhg4;->k:Lym;

    .line 267
    .line 268
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 269
    .line 270
    .line 271
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 272
    .line 273
    .line 274
    move-result-wide v2

    .line 275
    iget-object v1, v1, Lhg4;->h:Lgd2;

    .line 276
    .line 277
    invoke-virtual {v1}, Lgd2;->g()Lra4;

    .line 278
    .line 279
    .line 280
    move-result-object v1

    .line 281
    invoke-virtual {v1}, Lra4;->m()Led2;

    .line 282
    .line 283
    .line 284
    move-result-object v1

    .line 285
    iget-wide v4, v1, Led2;->f:J

    .line 286
    .line 287
    sub-long/2addr v2, v4

    .line 288
    invoke-direct {v0, v2, v3}, Lh43;-><init>(J)V

    .line 289
    .line 290
    .line 291
    return-object v0

    .line 292
    :pswitch_6
    const-string v0, "mounted"

    .line 293
    .line 294
    invoke-static {}, Landroid/os/Environment;->getExternalStorageState()Ljava/lang/String;

    .line 295
    .line 296
    .line 297
    move-result-object v1

    .line 298
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 299
    .line 300
    .line 301
    move-result v0

    .line 302
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 303
    .line 304
    .line 305
    move-result-object v0

    .line 306
    return-object v0

    .line 307
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
