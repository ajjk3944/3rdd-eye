.class public final Lfk2;
.super Lel2;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final l:Lag2;

.field public final m:I

.field public final n:Landroid/content/Context;

.field public final o:Lgw3;

.field public final p:Lqq2;

.field public final q:Lt93;

.field public final r:Lan2;

.field public final s:Z

.field public final t:Lid2;

.field public final u:Lmv2;

.field public v:Z


# direct methods
.method public constructor <init>(Lko1;Landroid/content/Context;Lag2;ILgw3;Lqq2;Lt93;Lan2;Lid2;Lmv2;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lel2;-><init>(Lko1;)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    iput-boolean p1, p0, Lfk2;->v:Z

    .line 6
    .line 7
    iput-object p3, p0, Lfk2;->l:Lag2;

    .line 8
    .line 9
    iput-object p2, p0, Lfk2;->n:Landroid/content/Context;

    .line 10
    .line 11
    iput p4, p0, Lfk2;->m:I

    .line 12
    .line 13
    iput-object p5, p0, Lfk2;->o:Lgw3;

    .line 14
    .line 15
    iput-object p6, p0, Lfk2;->p:Lqq2;

    .line 16
    .line 17
    iput-object p7, p0, Lfk2;->q:Lt93;

    .line 18
    .line 19
    iput-object p8, p0, Lfk2;->r:Lan2;

    .line 20
    .line 21
    sget-object p1, Lmz1;->R5:Liz1;

    .line 22
    .line 23
    sget-object p2, Ltw1;->e:Ltw1;

    .line 24
    .line 25
    iget-object p2, p2, Ltw1;->c:Lkz1;

    .line 26
    .line 27
    invoke-virtual {p2, p1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    check-cast p1, Ljava/lang/Boolean;

    .line 32
    .line 33
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    iput-boolean p1, p0, Lfk2;->s:Z

    .line 38
    .line 39
    iput-object p9, p0, Lfk2;->t:Lid2;

    .line 40
    .line 41
    iput-object p10, p0, Lfk2;->u:Lmv2;

    .line 42
    .line 43
    return-void
.end method


# virtual methods
.method public final c(Landroid/app/Activity;Z)V
    .locals 9

    .line 1
    iget-object v0, p0, Lfk2;->q:Lt93;

    .line 2
    .line 3
    iget-object v1, p0, Lfk2;->r:Lan2;

    .line 4
    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    iget-object p1, p0, Lfk2;->n:Landroid/content/Context;

    .line 8
    .line 9
    :cond_0
    iget-boolean v2, p0, Lfk2;->s:Z

    .line 10
    .line 11
    if-eqz v2, :cond_1

    .line 12
    .line 13
    sget-object v3, Lsd2;->x:Lsd2;

    .line 14
    .line 15
    invoke-virtual {v0, v3}, Lf74;->P1(Ldp2;)V

    .line 16
    .line 17
    .line 18
    :cond_1
    sget-object v3, Lhg4;->C:Lhg4;

    .line 19
    .line 20
    iget-object v4, v3, Lhg4;->c:Llf4;

    .line 21
    .line 22
    iget-object v4, p0, Lfk2;->p:Lqq2;

    .line 23
    .line 24
    invoke-interface {v4}, Lqq2;->d()La83;

    .line 25
    .line 26
    .line 27
    move-result-object v5

    .line 28
    invoke-static {v5}, Llf4;->m(La83;)Z

    .line 29
    .line 30
    .line 31
    move-result v5

    .line 32
    if-nez v5, :cond_3

    .line 33
    .line 34
    sget-object v5, Lmz1;->le:Liz1;

    .line 35
    .line 36
    sget-object v6, Ltw1;->e:Ltw1;

    .line 37
    .line 38
    iget-object v7, v6, Ltw1;->c:Lkz1;

    .line 39
    .line 40
    invoke-virtual {v7, v5}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v5

    .line 44
    check-cast v5, Ljava/lang/Boolean;

    .line 45
    .line 46
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 47
    .line 48
    .line 49
    move-result v5

    .line 50
    if-eqz v5, :cond_2

    .line 51
    .line 52
    iget-object v5, p0, Lel2;->b:La83;

    .line 53
    .line 54
    iget-object v7, p0, Lfk2;->u:Lmv2;

    .line 55
    .line 56
    invoke-static {p1, v5, v7}, Llf4;->l(Landroid/content/Context;La83;Lmv2;)V

    .line 57
    .line 58
    .line 59
    :cond_2
    sget-object v5, Lmz1;->K0:Liz1;

    .line 60
    .line 61
    iget-object v7, v6, Ltw1;->c:Lkz1;

    .line 62
    .line 63
    invoke-virtual {v7, v5}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v5

    .line 67
    check-cast v5, Ljava/lang/Boolean;

    .line 68
    .line 69
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 70
    .line 71
    .line 72
    move-result v5

    .line 73
    if-eqz v5, :cond_3

    .line 74
    .line 75
    invoke-static {p1}, Llf4;->g(Landroid/content/Context;)Z

    .line 76
    .line 77
    .line 78
    move-result v5

    .line 79
    if-eqz v5, :cond_3

    .line 80
    .line 81
    const-string p2, "Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit https://goo.gle/admob-interstitial-policies"

    .line 82
    .line 83
    invoke-static {p2}, Lgi2;->i0(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v1}, Lan2;->b()V

    .line 87
    .line 88
    .line 89
    sget-object p2, Lmz1;->L0:Liz1;

    .line 90
    .line 91
    iget-object v0, v6, Ltw1;->c:Lkz1;

    .line 92
    .line 93
    invoke-virtual {v0, p2}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object p2

    .line 97
    check-cast p2, Ljava/lang/Boolean;

    .line 98
    .line 99
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 100
    .line 101
    .line 102
    move-result p2

    .line 103
    if-eqz p2, :cond_8

    .line 104
    .line 105
    new-instance p2, Lmd3;

    .line 106
    .line 107
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    iget-object v0, v3, Lhg4;->t:Lr2;

    .line 112
    .line 113
    invoke-virtual {v0}, Lr2;->a()Landroid/os/Looper;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    invoke-direct {p2, p1, v0}, Lmd3;-><init>(Landroid/content/Context;Landroid/os/Looper;)V

    .line 118
    .line 119
    .line 120
    iget-object p1, p0, Lel2;->a:Lh83;

    .line 121
    .line 122
    iget-object p1, p1, Lh83;->b:Lp21;

    .line 123
    .line 124
    iget-object p1, p1, Lp21;->g:Ljava/lang/Object;

    .line 125
    .line 126
    check-cast p1, Lc83;

    .line 127
    .line 128
    iget-object p1, p1, Lc83;->b:Ljava/lang/String;

    .line 129
    .line 130
    invoke-virtual {p2, p1}, Lmd3;->a(Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    return-void

    .line 134
    :cond_3
    sget-object v3, Lmz1;->Hc:Liz1;

    .line 135
    .line 136
    sget-object v5, Ltw1;->e:Ltw1;

    .line 137
    .line 138
    iget-object v5, v5, Ltw1;->c:Lkz1;

    .line 139
    .line 140
    invoke-virtual {v5, v3}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v3

    .line 144
    check-cast v3, Ljava/lang/Boolean;

    .line 145
    .line 146
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 147
    .line 148
    .line 149
    move-result v3

    .line 150
    const/4 v5, 0x0

    .line 151
    if-eqz v3, :cond_5

    .line 152
    .line 153
    iget-object v3, p0, Lfk2;->l:Lag2;

    .line 154
    .line 155
    if-eqz v3, :cond_5

    .line 156
    .line 157
    invoke-interface {v3}, Lag2;->F()La83;

    .line 158
    .line 159
    .line 160
    move-result-object v3

    .line 161
    if-eqz v3, :cond_5

    .line 162
    .line 163
    iget-boolean v6, v3, La83;->r0:Z

    .line 164
    .line 165
    if-eqz v6, :cond_5

    .line 166
    .line 167
    iget v3, v3, La83;->s0:I

    .line 168
    .line 169
    iget-object v6, p0, Lfk2;->t:Lid2;

    .line 170
    .line 171
    iget-object v7, v6, Lid2;->f:Ljava/lang/Object;

    .line 172
    .line 173
    monitor-enter v7

    .line 174
    :try_start_0
    iget-object v6, v6, Lid2;->i:Lhd2;

    .line 175
    .line 176
    iget-object v8, v6, Lhd2;->f:Ljava/lang/Object;

    .line 177
    .line 178
    monitor-enter v8
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 179
    :try_start_1
    iget v6, v6, Lhd2;->k:I

    .line 180
    .line 181
    monitor-exit v8
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 182
    :try_start_2
    monitor-exit v7
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 183
    if-ne v3, v6, :cond_4

    .line 184
    .line 185
    goto :goto_1

    .line 186
    :cond_4
    const-string p1, "The app open consent form has been shown."

    .line 187
    .line 188
    invoke-static {p1}, Lgi2;->i0(Ljava/lang/String;)V

    .line 189
    .line 190
    .line 191
    const/16 p1, 0xc

    .line 192
    .line 193
    const-string p2, "The consent form has already been shown."

    .line 194
    .line 195
    invoke-static {p1, p2, v5}, Lzt0;->Q(ILjava/lang/String;Lnx2;)Lnx2;

    .line 196
    .line 197
    .line 198
    move-result-object p1

    .line 199
    invoke-virtual {v1, p1}, Lan2;->O(Lnx2;)V

    .line 200
    .line 201
    .line 202
    return-void

    .line 203
    :catchall_0
    move-exception p1

    .line 204
    goto :goto_0

    .line 205
    :catchall_1
    move-exception p1

    .line 206
    :try_start_3
    monitor-exit v8
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 207
    :try_start_4
    throw p1

    .line 208
    :goto_0
    monitor-exit v7
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 209
    throw p1

    .line 210
    :cond_5
    :goto_1
    iget-boolean v3, p0, Lfk2;->v:Z

    .line 211
    .line 212
    if-eqz v3, :cond_6

    .line 213
    .line 214
    const-string v3, "App open interstitial ad is already visible."

    .line 215
    .line 216
    invoke-static {v3}, Lgi2;->i0(Ljava/lang/String;)V

    .line 217
    .line 218
    .line 219
    const/16 v3, 0xa

    .line 220
    .line 221
    invoke-static {v3, v5, v5}, Lzt0;->Q(ILjava/lang/String;Lnx2;)Lnx2;

    .line 222
    .line 223
    .line 224
    move-result-object v3

    .line 225
    invoke-virtual {v1, v3}, Lan2;->O(Lnx2;)V

    .line 226
    .line 227
    .line 228
    :cond_6
    iget-boolean v3, p0, Lfk2;->v:Z

    .line 229
    .line 230
    if-nez v3, :cond_8

    .line 231
    .line 232
    :try_start_5
    invoke-interface {v4, p2, p1, v1}, Lqq2;->q(ZLandroid/content/Context;Lan2;)V

    .line 233
    .line 234
    .line 235
    if-eqz v2, :cond_7

    .line 236
    .line 237
    invoke-virtual {v0}, Lt93;->U1()V
    :try_end_5
    .catch Lpq2; {:try_start_5 .. :try_end_5} :catch_0

    .line 238
    .line 239
    .line 240
    goto :goto_2

    .line 241
    :catch_0
    move-exception p1

    .line 242
    goto :goto_3

    .line 243
    :cond_7
    :goto_2
    const/4 p1, 0x1

    .line 244
    iput-boolean p1, p0, Lfk2;->v:Z

    .line 245
    .line 246
    return-void

    .line 247
    :goto_3
    invoke-virtual {v1, p1}, Lan2;->R(Lpq2;)V

    .line 248
    .line 249
    .line 250
    :cond_8
    return-void
.end method

.method public final d()V
    .locals 4

    .line 1
    iget-object v0, p0, Lel2;->c:Lfn2;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    new-instance v1, Lz71;

    .line 7
    .line 8
    const/16 v2, 0x14

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    invoke-direct {v1, v2, v3}, Lz71;-><init>(ILjava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1}, Lf74;->P1(Ldp2;)V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Lfk2;->l:Lag2;

    .line 18
    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    invoke-interface {v0}, Lag2;->destroy()V

    .line 22
    .line 23
    .line 24
    :cond_0
    return-void
.end method

.method public final e(IJ)V
    .locals 3

    .line 1
    iget-object v0, p0, Lfk2;->o:Lgw3;

    .line 2
    .line 3
    iget-object v1, v0, Lgw3;->g:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Lmv2;

    .line 6
    .line 7
    invoke-virtual {v1}, Lmv2;->a()Llv2;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    iget-object v0, v0, Lgw3;->h:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Lh83;

    .line 14
    .line 15
    iget-object v0, v0, Lh83;->b:Lp21;

    .line 16
    .line 17
    iget-object v0, v0, Lp21;->g:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v0, Lc83;

    .line 20
    .line 21
    const-string v2, "gqi"

    .line 22
    .line 23
    iget-object v0, v0, Lc83;->b:Ljava/lang/String;

    .line 24
    .line 25
    invoke-virtual {v1, v2, v0}, Llv2;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    const-string v0, "action"

    .line 29
    .line 30
    const-string v2, "ad_closed"

    .line 31
    .line 32
    invoke-virtual {v1, v0, v2}, Llv2;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    const-string v0, "show_time"

    .line 36
    .line 37
    invoke-static {p2, p3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    invoke-virtual {v1, v0, p2}, Llv2;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    const-string p2, "ad_format"

    .line 45
    .line 46
    const-string p3, "app_open_ad"

    .line 47
    .line 48
    invoke-virtual {v1, p2, p3}, Llv2;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    add-int/lit8 p1, p1, -0x1

    .line 52
    .line 53
    if-eqz p1, :cond_4

    .line 54
    .line 55
    const/4 p2, 0x1

    .line 56
    if-eq p1, p2, :cond_3

    .line 57
    .line 58
    const/4 p2, 0x2

    .line 59
    if-eq p1, p2, :cond_2

    .line 60
    .line 61
    const/4 p2, 0x3

    .line 62
    if-eq p1, p2, :cond_1

    .line 63
    .line 64
    const/4 p2, 0x4

    .line 65
    if-eq p1, p2, :cond_0

    .line 66
    .line 67
    const-string p1, "u"

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_0
    const-string p1, "ac"

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_1
    const-string p1, "cb"

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_2
    const-string p1, "cc"

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_3
    const-string p1, "bb"

    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_4
    const-string p1, "h"

    .line 83
    .line 84
    :goto_0
    const-string p2, "acr"

    .line 85
    .line 86
    invoke-virtual {v1, p2, p1}, Llv2;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v1}, Llv2;->m()V

    .line 90
    .line 91
    .line 92
    return-void
.end method
