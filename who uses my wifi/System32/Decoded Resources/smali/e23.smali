.class public final Le23;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final a:Ls62;

.field public final b:Lfr;

.field public final c:Lj51;

.field public final d:Lcx2;

.field public e:Lfd1;

.field public f:Lt2;

.field public g:[Ld3;

.field public h:Lb8;

.field public i:Lba2;

.field public j:Ll51;

.field public k:Ljava/lang/String;

.field public final l:Lr9;

.field public m:Z

.field public final n:Ljava/util/concurrent/atomic/AtomicLong;


# direct methods
.method public constructor <init>(Lr9;)V
    .locals 2

    .line 1
    sget-object v0, Lfr;->s:Lfr;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Ls62;

    .line 7
    .line 8
    invoke-direct {v1}, Ls62;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object v1, p0, Le23;->a:Ls62;

    .line 12
    .line 13
    new-instance v1, Lj51;

    .line 14
    .line 15
    invoke-direct {v1}, Lj51;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object v1, p0, Le23;->c:Lj51;

    .line 19
    .line 20
    new-instance v1, Lcx2;

    .line 21
    .line 22
    invoke-direct {v1, p0}, Lcx2;-><init>(Le23;)V

    .line 23
    .line 24
    .line 25
    iput-object v1, p0, Le23;->d:Lcx2;

    .line 26
    .line 27
    new-instance v1, Ljava/util/concurrent/atomic/AtomicLong;

    .line 28
    .line 29
    invoke-direct {v1}, Ljava/util/concurrent/atomic/AtomicLong;-><init>()V

    .line 30
    .line 31
    .line 32
    iput-object v1, p0, Le23;->n:Ljava/util/concurrent/atomic/AtomicLong;

    .line 33
    .line 34
    iput-object p1, p0, Le23;->l:Lr9;

    .line 35
    .line 36
    iput-object v0, p0, Le23;->b:Lfr;

    .line 37
    .line 38
    const/4 p1, 0x0

    .line 39
    iput-object p1, p0, Le23;->i:Lba2;

    .line 40
    .line 41
    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 42
    .line 43
    const/4 v0, 0x0

    .line 44
    invoke-direct {p1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 45
    .line 46
    .line 47
    return-void
.end method

.method public static a(Landroid/content/Context;[Ld3;)Lxe4;
    .locals 21

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/4 v2, 0x0

    .line 5
    move v3, v2

    .line 6
    :goto_0
    if-ge v3, v1, :cond_1

    .line 7
    .line 8
    aget-object v4, v0, v3

    .line 9
    .line 10
    sget-object v5, Ld3;->k:Ld3;

    .line 11
    .line 12
    invoke-virtual {v4, v5}, Ld3;->equals(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v4

    .line 16
    if-eqz v4, :cond_0

    .line 17
    .line 18
    new-instance v5, Lxe4;

    .line 19
    .line 20
    const/16 v19, 0x0

    .line 21
    .line 22
    const/16 v20, 0x0

    .line 23
    .line 24
    const-string v6, "invalid"

    .line 25
    .line 26
    const/4 v7, 0x0

    .line 27
    const/4 v8, 0x0

    .line 28
    const/4 v9, 0x0

    .line 29
    const/4 v10, 0x0

    .line 30
    const/4 v11, 0x0

    .line 31
    const/4 v12, 0x0

    .line 32
    const/4 v13, 0x0

    .line 33
    const/4 v14, 0x0

    .line 34
    const/4 v15, 0x0

    .line 35
    const/16 v16, 0x1

    .line 36
    .line 37
    const/16 v17, 0x0

    .line 38
    .line 39
    const/16 v18, 0x0

    .line 40
    .line 41
    invoke-direct/range {v5 .. v20}, Lxe4;-><init>(Ljava/lang/String;IIZII[Lxe4;ZZZZZZZZ)V

    .line 42
    .line 43
    .line 44
    return-object v5

    .line 45
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_1
    new-instance v1, Lxe4;

    .line 49
    .line 50
    move-object/from16 v3, p0

    .line 51
    .line 52
    invoke-direct {v1, v3, v0}, Lxe4;-><init>(Landroid/content/Context;[Ld3;)V

    .line 53
    .line 54
    .line 55
    iput-boolean v2, v1, Lxe4;->o:Z

    .line 56
    .line 57
    return-object v1
.end method


# virtual methods
.method public final b(Le13;)V
    .locals 12

    .line 1
    const-string v1, "#007 Could not call remote method."

    .line 2
    .line 3
    :try_start_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 4
    .line 5
    .line 6
    move-result-wide v2

    .line 7
    iget-object v0, p0, Le23;->i:Lba2;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 8
    .line 9
    iget-object v4, p0, Le23;->l:Lr9;

    .line 10
    .line 11
    if-nez v0, :cond_7

    .line 12
    .line 13
    :try_start_1
    iget-object v0, p0, Le23;->g:[Ld3;

    .line 14
    .line 15
    if-eqz v0, :cond_6

    .line 16
    .line 17
    iget-object v0, p0, Le23;->k:Ljava/lang/String;

    .line 18
    .line 19
    if-eqz v0, :cond_6

    .line 20
    .line 21
    invoke-virtual {v4}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 22
    .line 23
    .line 24
    move-result-object v7

    .line 25
    iget-object v0, p0, Le23;->g:[Ld3;

    .line 26
    .line 27
    invoke-static {v7, v0}, Le23;->a(Landroid/content/Context;[Ld3;)Lxe4;

    .line 28
    .line 29
    .line 30
    move-result-object v8

    .line 31
    const-string v0, "search_v2"

    .line 32
    .line 33
    iget-object v5, v8, Lxe4;->f:Ljava/lang/String;

    .line 34
    .line 35
    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    const/4 v11, 0x0

    .line 40
    if-eqz v0, :cond_0

    .line 41
    .line 42
    sget-object v0, Lsv1;->f:Lsv1;

    .line 43
    .line 44
    iget-object v0, v0, Lsv1;->b:Lbu1;

    .line 45
    .line 46
    iget-object v5, p0, Le23;->k:Ljava/lang/String;

    .line 47
    .line 48
    new-instance v6, Lsm1;

    .line 49
    .line 50
    invoke-direct {v6, v0, v7, v8, v5}, Lsm1;-><init>(Lbu1;Landroid/content/Context;Lxe4;Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v6, v7, v11}, Lzu1;->d(Landroid/content/Context;Z)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    check-cast v0, Lba2;

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :catch_0
    move-exception v0

    .line 61
    move-object p1, v0

    .line 62
    goto/16 :goto_3

    .line 63
    .line 64
    :cond_0
    sget-object v0, Lsv1;->f:Lsv1;

    .line 65
    .line 66
    iget-object v6, v0, Lsv1;->b:Lbu1;

    .line 67
    .line 68
    iget-object v9, p0, Le23;->k:Ljava/lang/String;

    .line 69
    .line 70
    iget-object v10, p0, Le23;->a:Ls62;

    .line 71
    .line 72
    new-instance v5, Lal1;

    .line 73
    .line 74
    invoke-direct/range {v5 .. v10}, Lal1;-><init>(Lbu1;Landroid/content/Context;Lxe4;Ljava/lang/String;Lu62;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v5, v7, v11}, Lzu1;->d(Landroid/content/Context;Z)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    check-cast v0, Lba2;

    .line 82
    .line 83
    :goto_0
    iput-object v0, p0, Le23;->i:Lba2;

    .line 84
    .line 85
    new-instance v5, Ldh3;

    .line 86
    .line 87
    iget-object v6, p0, Le23;->d:Lcx2;

    .line 88
    .line 89
    invoke-direct {v5, v6}, Ldh3;-><init>(Lt2;)V

    .line 90
    .line 91
    .line 92
    invoke-interface {v0, v5}, Lba2;->W2(Ld32;)V

    .line 93
    .line 94
    .line 95
    iget-object v0, p0, Le23;->e:Lfd1;

    .line 96
    .line 97
    if-eqz v0, :cond_1

    .line 98
    .line 99
    iget-object v5, p0, Le23;->i:Lba2;

    .line 100
    .line 101
    new-instance v6, Ltu1;

    .line 102
    .line 103
    invoke-direct {v6, v0}, Ltu1;-><init>(Lfd1;)V

    .line 104
    .line 105
    .line 106
    invoke-interface {v5, v6}, Lba2;->H2(Lb12;)V

    .line 107
    .line 108
    .line 109
    :cond_1
    iget-object v0, p0, Le23;->h:Lb8;

    .line 110
    .line 111
    if-eqz v0, :cond_2

    .line 112
    .line 113
    iget-object v5, p0, Le23;->i:Lba2;

    .line 114
    .line 115
    new-instance v6, Ltv1;

    .line 116
    .line 117
    invoke-direct {v6, v0}, Ltv1;-><init>(Lb8;)V

    .line 118
    .line 119
    .line 120
    invoke-interface {v5, v6}, Lba2;->I0(Lwi2;)V

    .line 121
    .line 122
    .line 123
    :cond_2
    iget-object v0, p0, Le23;->j:Ll51;

    .line 124
    .line 125
    if-eqz v0, :cond_3

    .line 126
    .line 127
    iget-object v5, p0, Le23;->i:Lba2;

    .line 128
    .line 129
    new-instance v6, Lih3;

    .line 130
    .line 131
    invoke-direct {v6, v0}, Lih3;-><init>(Ll51;)V

    .line 132
    .line 133
    .line 134
    invoke-interface {v5, v6}, Lba2;->J2(Lih3;)V

    .line 135
    .line 136
    .line 137
    :cond_3
    iget-object v0, p0, Le23;->i:Lba2;

    .line 138
    .line 139
    new-instance v5, Lkd3;

    .line 140
    .line 141
    invoke-direct {v5}, Lkd3;-><init>()V

    .line 142
    .line 143
    .line 144
    invoke-interface {v0, v5}, Lba2;->Z1(Lzu2;)V

    .line 145
    .line 146
    .line 147
    iget-object v0, p0, Le23;->i:Lba2;

    .line 148
    .line 149
    iget-boolean v5, p0, Le23;->m:Z

    .line 150
    .line 151
    invoke-interface {v0, v5}, Lba2;->g1(Z)V

    .line 152
    .line 153
    .line 154
    iget-object v0, p0, Le23;->i:Lba2;
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0

    .line 155
    .line 156
    if-nez v0, :cond_4

    .line 157
    .line 158
    goto :goto_2

    .line 159
    :cond_4
    :try_start_2
    invoke-interface {v0}, Lba2;->d()Lu10;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    if-eqz v0, :cond_7

    .line 164
    .line 165
    sget-object v5, Lq02;->f:Lso1;

    .line 166
    .line 167
    invoke-virtual {v5}, Lso1;->w()Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v5

    .line 171
    check-cast v5, Ljava/lang/Boolean;

    .line 172
    .line 173
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 174
    .line 175
    .line 176
    move-result v5

    .line 177
    if-eqz v5, :cond_5

    .line 178
    .line 179
    sget-object v5, Lmz1;->Wb:Liz1;

    .line 180
    .line 181
    sget-object v6, Ltw1;->e:Ltw1;

    .line 182
    .line 183
    iget-object v6, v6, Ltw1;->c:Lkz1;

    .line 184
    .line 185
    invoke-virtual {v6, v5}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v5

    .line 189
    check-cast v5, Ljava/lang/Boolean;

    .line 190
    .line 191
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 192
    .line 193
    .line 194
    move-result v5

    .line 195
    if-eqz v5, :cond_5

    .line 196
    .line 197
    sget-object v5, Lj63;->b:Lwc1;

    .line 198
    .line 199
    new-instance v6, Lsz2;

    .line 200
    .line 201
    const/4 v7, 0x3

    .line 202
    invoke-direct {v6, p0, v0, v7}, Lsz2;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 203
    .line 204
    .line 205
    invoke-virtual {v5, v6}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 206
    .line 207
    .line 208
    goto :goto_2

    .line 209
    :catch_1
    move-exception v0

    .line 210
    goto :goto_1

    .line 211
    :cond_5
    invoke-static {v0}, Loi0;->l1(Lu10;)Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object v0

    .line 215
    check-cast v0, Landroid/view/View;

    .line 216
    .line 217
    invoke-virtual {v4, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_1

    .line 218
    .line 219
    .line 220
    goto :goto_2

    .line 221
    :goto_1
    :try_start_3
    invoke-static {v1, v0}, Lgi2;->p0(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 222
    .line 223
    .line 224
    goto :goto_2

    .line 225
    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 226
    .line 227
    const-string v0, "The ad size and ad unit ID must be set before loadAd is called."

    .line 228
    .line 229
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 230
    .line 231
    .line 232
    throw p1

    .line 233
    :cond_7
    :goto_2
    iput-wide v2, p1, Le13;->m:J

    .line 234
    .line 235
    iget-object v0, p0, Le23;->i:Lba2;

    .line 236
    .line 237
    if-eqz v0, :cond_9

    .line 238
    .line 239
    iget-object v2, p0, Le23;->n:Ljava/util/concurrent/atomic/AtomicLong;

    .line 240
    .line 241
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    .line 242
    .line 243
    .line 244
    move-result-wide v5

    .line 245
    const-wide/16 v7, 0x0

    .line 246
    .line 247
    cmp-long v3, v5, v7

    .line 248
    .line 249
    if-eqz v3, :cond_8

    .line 250
    .line 251
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    .line 252
    .line 253
    .line 254
    move-result-wide v2

    .line 255
    invoke-interface {v0, v2, v3}, Lba2;->s1(J)V

    .line 256
    .line 257
    .line 258
    :cond_8
    iget-object v2, p0, Le23;->b:Lfr;

    .line 259
    .line 260
    invoke-virtual {v4}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 261
    .line 262
    .line 263
    move-result-object v3

    .line 264
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 265
    .line 266
    .line 267
    invoke-static {v3, p1}, Lfr;->o(Landroid/content/Context;Le13;)Lpc4;

    .line 268
    .line 269
    .line 270
    move-result-object p1

    .line 271
    invoke-interface {v0, p1}, Lba2;->Z(Lpc4;)Z

    .line 272
    .line 273
    .line 274
    return-void

    .line 275
    :cond_9
    const/4 p1, 0x0

    .line 276
    throw p1
    :try_end_3
    .catch Landroid/os/RemoteException; {:try_start_3 .. :try_end_3} :catch_0

    .line 277
    :goto_3
    invoke-static {v1, p1}, Lgi2;->p0(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 278
    .line 279
    .line 280
    return-void
.end method

.method public final c(Lfd1;)V
    .locals 2

    .line 1
    :try_start_0
    iput-object p1, p0, Le23;->e:Lfd1;

    .line 2
    .line 3
    iget-object v0, p0, Le23;->i:Lba2;

    .line 4
    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    new-instance v1, Ltu1;

    .line 10
    .line 11
    invoke-direct {v1, p1}, Ltu1;-><init>(Lfd1;)V

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :catch_0
    move-exception p1

    .line 16
    goto :goto_1

    .line 17
    :cond_0
    const/4 v1, 0x0

    .line 18
    :goto_0
    invoke-interface {v0, v1}, Lba2;->H2(Lb12;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 19
    .line 20
    .line 21
    :cond_1
    return-void

    .line 22
    :goto_1
    const-string v0, "#007 Could not call remote method."

    .line 23
    .line 24
    invoke-static {v0, p1}, Lgi2;->p0(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public final varargs d([Ld3;)V
    .locals 3

    .line 1
    iget-object v0, p0, Le23;->l:Lr9;

    .line 2
    .line 3
    iput-object p1, p0, Le23;->g:[Ld3;

    .line 4
    .line 5
    :try_start_0
    iget-object p1, p0, Le23;->i:Lba2;

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget-object v2, p0, Le23;->g:[Ld3;

    .line 14
    .line 15
    invoke-static {v1, v2}, Le23;->a(Landroid/content/Context;[Ld3;)Lxe4;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-interface {p1, v1}, Lba2;->N0(Lxe4;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :catch_0
    move-exception p1

    .line 24
    const-string v1, "#007 Could not call remote method."

    .line 25
    .line 26
    invoke-static {v1, p1}, Lgi2;->p0(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 27
    .line 28
    .line 29
    :cond_0
    :goto_0
    invoke-virtual {v0}, Landroid/view/View;->requestLayout()V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public final e(Lb8;)V
    .locals 2

    .line 1
    :try_start_0
    iput-object p1, p0, Le23;->h:Lb8;

    .line 2
    .line 3
    iget-object v0, p0, Le23;->i:Lba2;

    .line 4
    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    new-instance v1, Ltv1;

    .line 10
    .line 11
    invoke-direct {v1, p1}, Ltv1;-><init>(Lb8;)V

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :catch_0
    move-exception p1

    .line 16
    goto :goto_1

    .line 17
    :cond_0
    const/4 v1, 0x0

    .line 18
    :goto_0
    invoke-interface {v0, v1}, Lba2;->I0(Lwi2;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 19
    .line 20
    .line 21
    :cond_1
    return-void

    .line 22
    :goto_1
    const-string v0, "#007 Could not call remote method."

    .line 23
    .line 24
    invoke-static {v0, p1}, Lgi2;->p0(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method
