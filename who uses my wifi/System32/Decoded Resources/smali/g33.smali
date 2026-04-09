.class public final Lg33;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lq53;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Le51;Lpq3;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lg33;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg33;->c:Ljava/lang/Object;

    iput-object p2, p0, Lg33;->b:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 2
    iput p3, p0, Lg33;->a:I

    iput-object p1, p0, Lg33;->b:Ljava/lang/Object;

    iput-object p2, p0, Lg33;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Ln70;
    .locals 5

    .line 1
    iget v0, p0, Lg33;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Lw53;

    .line 7
    .line 8
    const/4 v1, 0x2

    .line 9
    invoke-direct {v0, v1, p0}, Lw53;-><init>(ILjava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    iget-object v1, p0, Lg33;->b:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v1, Lpq3;

    .line 15
    .line 16
    check-cast v1, Lld2;

    .line 17
    .line 18
    invoke-virtual {v1, v0}, Lld2;->c(Ljava/util/concurrent/Callable;)Ln70;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    return-object v0

    .line 23
    :pswitch_0
    iget-object v0, p0, Lg33;->c:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v0, Ljava/lang/String;

    .line 26
    .line 27
    invoke-static {v0}, Lpu1;->r(Ljava/lang/Object;)Llq3;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    sget-object v1, Lgj1;->p:Lgj1;

    .line 32
    .line 33
    iget-object v2, p0, Lg33;->b:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v2, Ljava/util/concurrent/Executor;

    .line 36
    .line 37
    invoke-static {v0, v1, v2}, Lpu1;->P(Ln70;Lzk3;Ljava/util/concurrent/Executor;)Lrp3;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    new-instance v1, Lu42;

    .line 42
    .line 43
    const/16 v3, 0xb

    .line 44
    .line 45
    invoke-direct {v1, v3, p0}, Lu42;-><init>(ILjava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    const-class v3, Ljava/lang/Throwable;

    .line 49
    .line 50
    invoke-static {v0, v3, v1, v2}, Lpu1;->L(Ln70;Ljava/lang/Class;Lyp3;Ljava/util/concurrent/Executor;)Lwo3;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    return-object v0

    .line 55
    :pswitch_1
    new-instance v0, Lxs1;

    .line 56
    .line 57
    const/16 v1, 0x17

    .line 58
    .line 59
    invoke-direct {v0, v1, p0}, Lxs1;-><init>(ILjava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    iget-object v1, p0, Lg33;->b:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v1, Lpq3;

    .line 65
    .line 66
    check-cast v1, Lld2;

    .line 67
    .line 68
    invoke-virtual {v1, v0}, Lld2;->c(Ljava/util/concurrent/Callable;)Ln70;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    return-object v0

    .line 73
    :pswitch_2
    new-instance v0, Lxs1;

    .line 74
    .line 75
    const/16 v1, 0x15

    .line 76
    .line 77
    invoke-direct {v0, v1, p0}, Lxs1;-><init>(ILjava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    iget-object v1, p0, Lg33;->b:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast v1, Lpq3;

    .line 83
    .line 84
    check-cast v1, Lld2;

    .line 85
    .line 86
    invoke-virtual {v1, v0}, Lld2;->c(Ljava/util/concurrent/Callable;)Ln70;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    return-object v0

    .line 91
    :pswitch_3
    const-string v0, "HsdpMigrationSignal.produce"

    .line 92
    .line 93
    invoke-static {v0}, Lgi2;->G(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    sget-object v0, Lmz1;->Dd:Liz1;

    .line 97
    .line 98
    sget-object v1, Ltw1;->e:Ltw1;

    .line 99
    .line 100
    iget-object v1, v1, Ltw1;->c:Lkz1;

    .line 101
    .line 102
    invoke-virtual {v1, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    check-cast v0, Ljava/lang/Boolean;

    .line 107
    .line 108
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 109
    .line 110
    .line 111
    move-result v0

    .line 112
    if-eqz v0, :cond_1

    .line 113
    .line 114
    new-instance v0, Lr43;

    .line 115
    .line 116
    const/4 v1, 0x0

    .line 117
    :try_start_0
    iget-object v2, p0, Lg33;->b:Ljava/lang/Object;

    .line 118
    .line 119
    check-cast v2, Landroid/content/Context;

    .line 120
    .line 121
    invoke-virtual {v2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 122
    .line 123
    .line 124
    move-result-object v2

    .line 125
    iget-object v3, p0, Lg33;->c:Ljava/lang/Object;

    .line 126
    .line 127
    check-cast v3, Landroid/content/Intent;

    .line 128
    .line 129
    invoke-virtual {v3, v2}, Landroid/content/Intent;->resolveActivity(Landroid/content/pm/PackageManager;)Landroid/content/ComponentName;

    .line 130
    .line 131
    .line 132
    move-result-object v2

    .line 133
    if-eqz v2, :cond_0

    .line 134
    .line 135
    const-string v2, "HSDP intent is supported"

    .line 136
    .line 137
    invoke-static {v2}, Lgi2;->G(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 138
    .line 139
    .line 140
    const/4 v1, 0x1

    .line 141
    goto :goto_0

    .line 142
    :catch_0
    move-exception v2

    .line 143
    sget-object v3, Lhg4;->C:Lhg4;

    .line 144
    .line 145
    iget-object v3, v3, Lhg4;->h:Lgd2;

    .line 146
    .line 147
    const-string v4, "HsdpMigrationSignal.isHsdpMigrationSupported"

    .line 148
    .line 149
    invoke-virtual {v3, v4, v2}, Lgd2;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 150
    .line 151
    .line 152
    :cond_0
    :goto_0
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 153
    .line 154
    .line 155
    move-result-object v1

    .line 156
    const/4 v2, 0x1

    .line 157
    invoke-direct {v0, v1, v2}, Lr43;-><init>(Ljava/lang/Boolean;I)V

    .line 158
    .line 159
    .line 160
    invoke-static {v0}, Lpu1;->r(Ljava/lang/Object;)Llq3;

    .line 161
    .line 162
    .line 163
    move-result-object v0

    .line 164
    goto :goto_1

    .line 165
    :cond_1
    new-instance v0, Lr43;

    .line 166
    .line 167
    const/4 v1, 0x0

    .line 168
    const/4 v2, 0x1

    .line 169
    invoke-direct {v0, v1, v2}, Lr43;-><init>(Ljava/lang/Boolean;I)V

    .line 170
    .line 171
    .line 172
    invoke-static {v0}, Lpu1;->r(Ljava/lang/Object;)Llq3;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    :goto_1
    return-object v0

    .line 177
    :pswitch_4
    new-instance v0, Lxs1;

    .line 178
    .line 179
    const/16 v1, 0x13

    .line 180
    .line 181
    invoke-direct {v0, v1, p0}, Lxs1;-><init>(ILjava/lang/Object;)V

    .line 182
    .line 183
    .line 184
    iget-object v1, p0, Lg33;->b:Ljava/lang/Object;

    .line 185
    .line 186
    check-cast v1, Lpq3;

    .line 187
    .line 188
    check-cast v1, Lld2;

    .line 189
    .line 190
    invoke-virtual {v1, v0}, Lld2;->c(Ljava/util/concurrent/Callable;)Ln70;

    .line 191
    .line 192
    .line 193
    move-result-object v0

    .line 194
    return-object v0

    .line 195
    :pswitch_5
    new-instance v0, Lxs1;

    .line 196
    .line 197
    const/16 v1, 0xd

    .line 198
    .line 199
    invoke-direct {v0, v1, p0}, Lxs1;-><init>(ILjava/lang/Object;)V

    .line 200
    .line 201
    .line 202
    iget-object v1, p0, Lg33;->b:Ljava/lang/Object;

    .line 203
    .line 204
    check-cast v1, Lpq3;

    .line 205
    .line 206
    check-cast v1, Lld2;

    .line 207
    .line 208
    invoke-virtual {v1, v0}, Lld2;->c(Ljava/util/concurrent/Callable;)Ln70;

    .line 209
    .line 210
    .line 211
    move-result-object v0

    .line 212
    return-object v0

    .line 213
    :pswitch_6
    sget-object v0, Lmz1;->j3:Liz1;

    .line 214
    .line 215
    sget-object v1, Ltw1;->e:Ltw1;

    .line 216
    .line 217
    iget-object v1, v1, Ltw1;->c:Lkz1;

    .line 218
    .line 219
    invoke-virtual {v1, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 220
    .line 221
    .line 222
    move-result-object v0

    .line 223
    check-cast v0, Ljava/lang/Boolean;

    .line 224
    .line 225
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 226
    .line 227
    .line 228
    move-result v0

    .line 229
    if-eqz v0, :cond_2

    .line 230
    .line 231
    new-instance v0, Lq33;

    .line 232
    .line 233
    const/4 v1, 0x0

    .line 234
    const/4 v2, 0x0

    .line 235
    invoke-direct {v0, v2, v1}, Lq33;-><init>(ILjava/lang/Object;)V

    .line 236
    .line 237
    .line 238
    invoke-static {v0}, Lpu1;->r(Ljava/lang/Object;)Llq3;

    .line 239
    .line 240
    .line 241
    move-result-object v0

    .line 242
    goto :goto_2

    .line 243
    :cond_2
    iget-object v0, p0, Lg33;->c:Ljava/lang/Object;

    .line 244
    .line 245
    check-cast v0, Lgd2;

    .line 246
    .line 247
    iget-object v1, p0, Lg33;->b:Ljava/lang/Object;

    .line 248
    .line 249
    check-cast v1, Ljava/util/concurrent/Executor;

    .line 250
    .line 251
    invoke-virtual {v0}, Lgd2;->h()Ln70;

    .line 252
    .line 253
    .line 254
    move-result-object v0

    .line 255
    sget-object v2, Lgj1;->n:Lgj1;

    .line 256
    .line 257
    invoke-static {v0, v2, v1}, Lpu1;->P(Ln70;Lzk3;Ljava/util/concurrent/Executor;)Lrp3;

    .line 258
    .line 259
    .line 260
    move-result-object v0

    .line 261
    :goto_2
    return-object v0

    .line 262
    :pswitch_7
    new-instance v0, Lh33;

    .line 263
    .line 264
    iget-object v1, p0, Lg33;->b:Ljava/lang/Object;

    .line 265
    .line 266
    check-cast v1, Lym;

    .line 267
    .line 268
    iget-object v2, p0, Lg33;->c:Ljava/lang/Object;

    .line 269
    .line 270
    check-cast v2, Ll83;

    .line 271
    .line 272
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 273
    .line 274
    .line 275
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 276
    .line 277
    .line 278
    move-result-wide v3

    .line 279
    invoke-direct {v0, v2, v3, v4}, Lh33;-><init>(Ll83;J)V

    .line 280
    .line 281
    .line 282
    invoke-static {v0}, Lpu1;->r(Ljava/lang/Object;)Llq3;

    .line 283
    .line 284
    .line 285
    move-result-object v0

    .line 286
    return-object v0

    .line 287
    :pswitch_data_0
    .packed-switch 0x0
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

.method public final d()I
    .locals 1

    .line 1
    iget v0, p0, Lg33;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const/16 v0, 0x30

    .line 7
    .line 8
    return v0

    .line 9
    :pswitch_0
    const/16 v0, 0x29

    .line 10
    .line 11
    return v0

    .line 12
    :pswitch_1
    const/16 v0, 0x3e

    .line 13
    .line 14
    return v0

    .line 15
    :pswitch_2
    const/16 v0, 0x17

    .line 16
    .line 17
    return v0

    .line 18
    :pswitch_3
    const/16 v0, 0x3c

    .line 19
    .line 20
    return v0

    .line 21
    :pswitch_4
    const/16 v0, 0x15

    .line 22
    .line 23
    return v0

    .line 24
    :pswitch_5
    const/16 v0, 0x36

    .line 25
    .line 26
    return v0

    .line 27
    :pswitch_6
    const/16 v0, 0xa

    .line 28
    .line 29
    return v0

    .line 30
    :pswitch_7
    const/4 v0, 0x4

    .line 31
    return v0

    .line 32
    nop

    .line 33
    :pswitch_data_0
    .packed-switch 0x0
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
