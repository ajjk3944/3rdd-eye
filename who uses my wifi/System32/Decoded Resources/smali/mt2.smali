.class public final Lmt2;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final a:Ll83;

.field public final b:Ljava/util/concurrent/Executor;

.field public final c:Lpu2;

.field public final d:Ldu2;

.field public final e:Landroid/content/Context;

.field public final f:Lmv2;

.field public final g:Leb3;

.field public final h:Ljz2;

.field public final i:Ljv2;

.field public final j:Lxv2;


# direct methods
.method public constructor <init>(Ll83;Ljava/util/concurrent/Executor;Lpu2;Landroid/content/Context;Lmv2;Leb3;Ljz2;Ldu2;Ljv2;Lxv2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lmt2;->a:Ll83;

    .line 5
    .line 6
    iput-object p2, p0, Lmt2;->b:Ljava/util/concurrent/Executor;

    .line 7
    .line 8
    iput-object p3, p0, Lmt2;->c:Lpu2;

    .line 9
    .line 10
    iput-object p4, p0, Lmt2;->e:Landroid/content/Context;

    .line 11
    .line 12
    iput-object p5, p0, Lmt2;->f:Lmv2;

    .line 13
    .line 14
    iput-object p6, p0, Lmt2;->g:Leb3;

    .line 15
    .line 16
    iput-object p7, p0, Lmt2;->h:Ljz2;

    .line 17
    .line 18
    iput-object p8, p0, Lmt2;->d:Ldu2;

    .line 19
    .line 20
    iput-object p9, p0, Lmt2;->i:Ljv2;

    .line 21
    .line 22
    iput-object p10, p0, Lmt2;->j:Lxv2;

    .line 23
    .line 24
    return-void
.end method

.method public static final b(Lag2;)V
    .locals 3

    .line 1
    const-string v0, "/videoClicked"

    .line 2
    .line 3
    sget-object v1, Lx32;->d:Lo32;

    .line 4
    .line 5
    invoke-interface {p0, v0, v1}, Lag2;->v0(Ljava/lang/String;Ly32;)V

    .line 6
    .line 7
    .line 8
    invoke-interface {p0}, Lag2;->e0()Lsg2;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iget-object v1, v0, Lsg2;->i:Ljava/lang/Object;

    .line 13
    .line 14
    monitor-enter v1

    .line 15
    const/4 v2, 0x1

    .line 16
    :try_start_0
    iput-boolean v2, v0, Lsg2;->w:Z

    .line 17
    .line 18
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    const-string v0, "/getNativeAdViewSignals"

    .line 20
    .line 21
    sget-object v1, Lx32;->n:Lo32;

    .line 22
    .line 23
    invoke-interface {p0, v0, v1}, Lag2;->v0(Ljava/lang/String;Ly32;)V

    .line 24
    .line 25
    .line 26
    const-string v0, "/getNativeClickMeta"

    .line 27
    .line 28
    sget-object v1, Lx32;->o:Lo32;

    .line 29
    .line 30
    invoke-interface {p0, v0, v1}, Lag2;->v0(Ljava/lang/String;Ly32;)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :catchall_0
    move-exception p0

    .line 35
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 36
    throw p0
.end method


# virtual methods
.method public final a(Lag2;Lsu1;Lsb2;)V
    .locals 11

    .line 1
    invoke-static {p1}, Lmt2;->b(Lag2;)V

    .line 2
    .line 3
    .line 4
    const-string v0, "/video"

    .line 5
    .line 6
    sget-object v1, Lx32;->g:Lve2;

    .line 7
    .line 8
    invoke-interface {p1, v0, v1}, Lag2;->v0(Ljava/lang/String;Ly32;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "/videoMeta"

    .line 12
    .line 13
    sget-object v1, Lx32;->h:Lo32;

    .line 14
    .line 15
    invoke-interface {p1, v0, v1}, Lag2;->v0(Ljava/lang/String;Ly32;)V

    .line 16
    .line 17
    .line 18
    new-instance v0, Lo32;

    .line 19
    .line 20
    const/16 v1, 0x1a

    .line 21
    .line 22
    invoke-direct {v0, v1}, Lo32;-><init>(I)V

    .line 23
    .line 24
    .line 25
    const-string v1, "/precache"

    .line 26
    .line 27
    invoke-interface {p1, v1, v0}, Lag2;->v0(Ljava/lang/String;Ly32;)V

    .line 28
    .line 29
    .line 30
    const-string v0, "/delayPageLoaded"

    .line 31
    .line 32
    sget-object v1, Lx32;->k:Lo32;

    .line 33
    .line 34
    invoke-interface {p1, v0, v1}, Lag2;->v0(Ljava/lang/String;Ly32;)V

    .line 35
    .line 36
    .line 37
    const-string v0, "/instrument"

    .line 38
    .line 39
    sget-object v1, Lx32;->i:Ln32;

    .line 40
    .line 41
    invoke-interface {p1, v0, v1}, Lag2;->v0(Ljava/lang/String;Ly32;)V

    .line 42
    .line 43
    .line 44
    const-string v0, "/log"

    .line 45
    .line 46
    sget-object v1, Lx32;->c:Lo32;

    .line 47
    .line 48
    invoke-interface {p1, v0, v1}, Lag2;->v0(Ljava/lang/String;Ly32;)V

    .line 49
    .line 50
    .line 51
    const-string v0, "/click"

    .line 52
    .line 53
    new-instance v1, Lv32;

    .line 54
    .line 55
    const/4 v2, 0x0

    .line 56
    const/4 v3, 0x0

    .line 57
    invoke-direct {v1, v3, v3, v2}, Lv32;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 58
    .line 59
    .line 60
    invoke-interface {p1, v0, v1}, Lag2;->v0(Ljava/lang/String;Ly32;)V

    .line 61
    .line 62
    .line 63
    iget-object v0, p0, Lmt2;->a:Ll83;

    .line 64
    .line 65
    iget-object v0, v0, Ll83;->b:Lf52;

    .line 66
    .line 67
    if-eqz v0, :cond_1

    .line 68
    .line 69
    invoke-interface {p1}, Lag2;->e0()Lsg2;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    iget-object v1, v0, Lsg2;->i:Ljava/lang/Object;

    .line 74
    .line 75
    monitor-enter v1

    .line 76
    const/4 v2, 0x1

    .line 77
    :try_start_0
    iput-boolean v2, v0, Lsg2;->y:Z

    .line 78
    .line 79
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 80
    new-instance v4, Li42;

    .line 81
    .line 82
    sget-object v0, Lmz1;->pe:Liz1;

    .line 83
    .line 84
    sget-object v1, Ltw1;->e:Ltw1;

    .line 85
    .line 86
    iget-object v1, v1, Ltw1;->c:Lkz1;

    .line 87
    .line 88
    invoke-virtual {v1, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    check-cast v0, Ljava/lang/Boolean;

    .line 93
    .line 94
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    if-eq v2, v0, :cond_0

    .line 99
    .line 100
    move-object v5, v3

    .line 101
    goto :goto_0

    .line 102
    :cond_0
    move-object v5, p2

    .line 103
    :goto_0
    const/4 v9, 0x0

    .line 104
    const/4 v10, 0x0

    .line 105
    const/4 v6, 0x0

    .line 106
    const/4 v7, 0x0

    .line 107
    const/4 v8, 0x0

    .line 108
    invoke-direct/range {v4 .. v10}, Li42;-><init>(Lsu1;Lo82;Ljz2;Lmv2;Lgj2;Lim2;)V

    .line 109
    .line 110
    .line 111
    const-string v0, "/open"

    .line 112
    .line 113
    invoke-interface {p1, v0, v4}, Lag2;->v0(Ljava/lang/String;Ly32;)V

    .line 114
    .line 115
    .line 116
    goto :goto_1

    .line 117
    :catchall_0
    move-exception v0

    .line 118
    move-object p1, v0

    .line 119
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 120
    throw p1

    .line 121
    :cond_1
    invoke-interface {p1}, Lag2;->e0()Lsg2;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    iget-object v1, v0, Lsg2;->i:Ljava/lang/Object;

    .line 126
    .line 127
    monitor-enter v1

    .line 128
    const/4 v2, 0x0

    .line 129
    :try_start_2
    iput-boolean v2, v0, Lsg2;->y:Z

    .line 130
    .line 131
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 132
    :goto_1
    sget-object v0, Lhg4;->C:Lhg4;

    .line 133
    .line 134
    iget-object v0, v0, Lhg4;->y:Loc2;

    .line 135
    .line 136
    invoke-interface {p1}, Lag2;->getContext()Landroid/content/Context;

    .line 137
    .line 138
    .line 139
    move-result-object v1

    .line 140
    invoke-virtual {v0, v1}, Loc2;->a(Landroid/content/Context;)Z

    .line 141
    .line 142
    .line 143
    move-result v0

    .line 144
    if-eqz v0, :cond_3

    .line 145
    .line 146
    new-instance v0, Ljava/util/HashMap;

    .line 147
    .line 148
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 149
    .line 150
    .line 151
    invoke-interface {p1}, Lag2;->F()La83;

    .line 152
    .line 153
    .line 154
    move-result-object v1

    .line 155
    if-eqz v1, :cond_2

    .line 156
    .line 157
    invoke-interface {p1}, Lag2;->F()La83;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    iget-object v0, v0, La83;->w0:Ljava/util/HashMap;

    .line 162
    .line 163
    :cond_2
    new-instance v1, Lv32;

    .line 164
    .line 165
    invoke-interface {p1}, Lag2;->getContext()Landroid/content/Context;

    .line 166
    .line 167
    .line 168
    move-result-object v2

    .line 169
    const/4 v3, 0x1

    .line 170
    invoke-direct {v1, v2, v0, v3}, Lv32;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 171
    .line 172
    .line 173
    const-string v0, "/logScionEvent"

    .line 174
    .line 175
    invoke-interface {p1, v0, v1}, Lag2;->v0(Ljava/lang/String;Ly32;)V

    .line 176
    .line 177
    .line 178
    :cond_3
    sget-object v0, Lmz1;->pe:Liz1;

    .line 179
    .line 180
    sget-object v1, Ltw1;->e:Ltw1;

    .line 181
    .line 182
    iget-object v2, v1, Ltw1;->c:Lkz1;

    .line 183
    .line 184
    invoke-virtual {v2, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v0

    .line 188
    check-cast v0, Ljava/lang/Boolean;

    .line 189
    .line 190
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 191
    .line 192
    .line 193
    move-result v0

    .line 194
    if-eqz v0, :cond_4

    .line 195
    .line 196
    invoke-interface {p1}, Lag2;->e0()Lsg2;

    .line 197
    .line 198
    .line 199
    move-result-object v0

    .line 200
    iput-object p2, v0, Lsg2;->B:Lsu1;

    .line 201
    .line 202
    invoke-interface {p1}, Lag2;->e0()Lsg2;

    .line 203
    .line 204
    .line 205
    move-result-object p2

    .line 206
    iput-object p3, p2, Lsg2;->D:Lsb2;

    .line 207
    .line 208
    :cond_4
    sget-object p2, Lmz1;->l8:Liz1;

    .line 209
    .line 210
    iget-object p3, v1, Ltw1;->c:Lkz1;

    .line 211
    .line 212
    invoke-virtual {p3, p2}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object p2

    .line 216
    check-cast p2, Ljava/lang/Boolean;

    .line 217
    .line 218
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 219
    .line 220
    .line 221
    move-result p2

    .line 222
    if-eqz p2, :cond_5

    .line 223
    .line 224
    iget-object p2, p0, Lmt2;->j:Lxv2;

    .line 225
    .line 226
    if-eqz p2, :cond_5

    .line 227
    .line 228
    new-instance p3, Lk32;

    .line 229
    .line 230
    const/4 v0, 0x3

    .line 231
    invoke-direct {p3, v0, p2}, Lk32;-><init>(ILjava/lang/Object;)V

    .line 232
    .line 233
    .line 234
    const-string p2, "/onDeviceStorageEvent"

    .line 235
    .line 236
    invoke-interface {p1, p2, p3}, Lag2;->v0(Ljava/lang/String;Ly32;)V

    .line 237
    .line 238
    .line 239
    :cond_5
    return-void

    .line 240
    :catchall_1
    move-exception v0

    .line 241
    move-object p1, v0

    .line 242
    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 243
    throw p1
.end method
