.class public final Lhq2;
.super Lel2;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final l:Landroid/content/Context;

.field public final m:Ljava/lang/ref/WeakReference;

.field public final n:Lt93;

.field public final o:Lqq2;

.field public final p:Lml2;

.field public final q:Lmd3;

.field public final r:Lan2;

.field public final s:Lid2;

.field public final t:Lmv2;

.field public u:Z


# direct methods
.method public constructor <init>(Lko1;Landroid/content/Context;Lag2;Lt93;Lqq2;Lml2;Lmd3;Lan2;Lid2;Lmv2;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lel2;-><init>(Lko1;)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    iput-boolean p1, p0, Lhq2;->u:Z

    .line 6
    .line 7
    iput-object p2, p0, Lhq2;->l:Landroid/content/Context;

    .line 8
    .line 9
    new-instance p1, Ljava/lang/ref/WeakReference;

    .line 10
    .line 11
    invoke-direct {p1, p3}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lhq2;->m:Ljava/lang/ref/WeakReference;

    .line 15
    .line 16
    iput-object p4, p0, Lhq2;->n:Lt93;

    .line 17
    .line 18
    iput-object p5, p0, Lhq2;->o:Lqq2;

    .line 19
    .line 20
    iput-object p6, p0, Lhq2;->p:Lml2;

    .line 21
    .line 22
    iput-object p7, p0, Lhq2;->q:Lmd3;

    .line 23
    .line 24
    iput-object p8, p0, Lhq2;->r:Lan2;

    .line 25
    .line 26
    iput-object p9, p0, Lhq2;->s:Lid2;

    .line 27
    .line 28
    iput-object p10, p0, Lhq2;->t:Lmv2;

    .line 29
    .line 30
    return-void
.end method


# virtual methods
.method public final c(Landroid/app/Activity;Z)V
    .locals 9

    .line 1
    iget-object v0, p0, Lhq2;->l:Landroid/content/Context;

    .line 2
    .line 3
    iget-object v1, p0, Lhq2;->r:Lan2;

    .line 4
    .line 5
    iget-object v2, p0, Lhq2;->n:Lt93;

    .line 6
    .line 7
    sget-object v3, Lsd2;->x:Lsd2;

    .line 8
    .line 9
    invoke-virtual {v2, v3}, Lf74;->P1(Ldp2;)V

    .line 10
    .line 11
    .line 12
    sget-object v3, Lhg4;->C:Lhg4;

    .line 13
    .line 14
    iget-object v3, v3, Lhg4;->c:Llf4;

    .line 15
    .line 16
    iget-object v3, p0, Lhq2;->o:Lqq2;

    .line 17
    .line 18
    invoke-interface {v3}, Lqq2;->d()La83;

    .line 19
    .line 20
    .line 21
    move-result-object v4

    .line 22
    invoke-static {v4}, Llf4;->m(La83;)Z

    .line 23
    .line 24
    .line 25
    move-result v4

    .line 26
    if-nez v4, :cond_1

    .line 27
    .line 28
    sget-object v4, Lmz1;->le:Liz1;

    .line 29
    .line 30
    sget-object v5, Ltw1;->e:Ltw1;

    .line 31
    .line 32
    iget-object v6, v5, Ltw1;->c:Lkz1;

    .line 33
    .line 34
    invoke-virtual {v6, v4}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    check-cast v4, Ljava/lang/Boolean;

    .line 39
    .line 40
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 41
    .line 42
    .line 43
    move-result v4

    .line 44
    if-eqz v4, :cond_0

    .line 45
    .line 46
    iget-object v4, p0, Lel2;->b:La83;

    .line 47
    .line 48
    iget-object v6, p0, Lhq2;->t:Lmv2;

    .line 49
    .line 50
    invoke-static {v0, v4, v6}, Llf4;->l(Landroid/content/Context;La83;Lmv2;)V

    .line 51
    .line 52
    .line 53
    :cond_0
    sget-object v4, Lmz1;->K0:Liz1;

    .line 54
    .line 55
    iget-object v6, v5, Ltw1;->c:Lkz1;

    .line 56
    .line 57
    invoke-virtual {v6, v4}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v4

    .line 61
    check-cast v4, Ljava/lang/Boolean;

    .line 62
    .line 63
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 64
    .line 65
    .line 66
    move-result v4

    .line 67
    if-eqz v4, :cond_1

    .line 68
    .line 69
    invoke-static {v0}, Llf4;->g(Landroid/content/Context;)Z

    .line 70
    .line 71
    .line 72
    move-result v4

    .line 73
    if-eqz v4, :cond_1

    .line 74
    .line 75
    const-string p1, "Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://goo.gle/admob-interstitial-policies"

    .line 76
    .line 77
    invoke-static {p1}, Lgi2;->i0(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v1}, Lan2;->b()V

    .line 81
    .line 82
    .line 83
    sget-object p1, Lmz1;->L0:Liz1;

    .line 84
    .line 85
    iget-object p2, v5, Ltw1;->c:Lkz1;

    .line 86
    .line 87
    invoke-virtual {p2, p1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    check-cast p1, Ljava/lang/Boolean;

    .line 92
    .line 93
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 94
    .line 95
    .line 96
    move-result p1

    .line 97
    if-eqz p1, :cond_5

    .line 98
    .line 99
    iget-object p1, p0, Lhq2;->q:Lmd3;

    .line 100
    .line 101
    iget-object p2, p0, Lel2;->a:Lh83;

    .line 102
    .line 103
    iget-object p2, p2, Lh83;->b:Lp21;

    .line 104
    .line 105
    iget-object p2, p2, Lp21;->g:Ljava/lang/Object;

    .line 106
    .line 107
    check-cast p2, Lc83;

    .line 108
    .line 109
    iget-object p2, p2, Lc83;->b:Ljava/lang/String;

    .line 110
    .line 111
    invoke-virtual {p1, p2}, Lmd3;->a(Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    return-void

    .line 115
    :cond_1
    iget-object v4, p0, Lhq2;->m:Ljava/lang/ref/WeakReference;

    .line 116
    .line 117
    invoke-virtual {v4}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v4

    .line 121
    check-cast v4, Lag2;

    .line 122
    .line 123
    sget-object v5, Lmz1;->Hc:Liz1;

    .line 124
    .line 125
    sget-object v6, Ltw1;->e:Ltw1;

    .line 126
    .line 127
    iget-object v6, v6, Ltw1;->c:Lkz1;

    .line 128
    .line 129
    invoke-virtual {v6, v5}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v5

    .line 133
    check-cast v5, Ljava/lang/Boolean;

    .line 134
    .line 135
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 136
    .line 137
    .line 138
    move-result v5

    .line 139
    const/4 v6, 0x0

    .line 140
    if-eqz v5, :cond_2

    .line 141
    .line 142
    if-eqz v4, :cond_2

    .line 143
    .line 144
    invoke-interface {v4}, Lag2;->F()La83;

    .line 145
    .line 146
    .line 147
    move-result-object v4

    .line 148
    if-eqz v4, :cond_2

    .line 149
    .line 150
    iget-boolean v5, v4, La83;->r0:Z

    .line 151
    .line 152
    if-eqz v5, :cond_2

    .line 153
    .line 154
    iget v4, v4, La83;->s0:I

    .line 155
    .line 156
    iget-object v5, p0, Lhq2;->s:Lid2;

    .line 157
    .line 158
    iget-object v7, v5, Lid2;->f:Ljava/lang/Object;

    .line 159
    .line 160
    monitor-enter v7

    .line 161
    :try_start_0
    iget-object v5, v5, Lid2;->i:Lhd2;

    .line 162
    .line 163
    iget-object v8, v5, Lhd2;->f:Ljava/lang/Object;

    .line 164
    .line 165
    monitor-enter v8
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 166
    :try_start_1
    iget v5, v5, Lhd2;->k:I

    .line 167
    .line 168
    monitor-exit v8
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 169
    :try_start_2
    monitor-exit v7
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 170
    if-eq v4, v5, :cond_2

    .line 171
    .line 172
    const-string p1, "The interstitial consent form has been shown."

    .line 173
    .line 174
    invoke-static {p1}, Lgi2;->i0(Ljava/lang/String;)V

    .line 175
    .line 176
    .line 177
    const/16 p1, 0xc

    .line 178
    .line 179
    const-string p2, "The consent form has already been shown."

    .line 180
    .line 181
    invoke-static {p1, p2, v6}, Lzt0;->Q(ILjava/lang/String;Lnx2;)Lnx2;

    .line 182
    .line 183
    .line 184
    move-result-object p1

    .line 185
    invoke-virtual {v1, p1}, Lan2;->O(Lnx2;)V

    .line 186
    .line 187
    .line 188
    return-void

    .line 189
    :catchall_0
    move-exception p1

    .line 190
    goto :goto_0

    .line 191
    :catchall_1
    move-exception p1

    .line 192
    :try_start_3
    monitor-exit v8
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 193
    :try_start_4
    throw p1

    .line 194
    :goto_0
    monitor-exit v7
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 195
    throw p1

    .line 196
    :cond_2
    iget-boolean v4, p0, Lhq2;->u:Z

    .line 197
    .line 198
    if-eqz v4, :cond_3

    .line 199
    .line 200
    const-string v4, "The interstitial ad has been shown."

    .line 201
    .line 202
    invoke-static {v4}, Lgi2;->i0(Ljava/lang/String;)V

    .line 203
    .line 204
    .line 205
    const/16 v4, 0xa

    .line 206
    .line 207
    invoke-static {v4, v6, v6}, Lzt0;->Q(ILjava/lang/String;Lnx2;)Lnx2;

    .line 208
    .line 209
    .line 210
    move-result-object v4

    .line 211
    invoke-virtual {v1, v4}, Lan2;->O(Lnx2;)V

    .line 212
    .line 213
    .line 214
    :cond_3
    iget-boolean v4, p0, Lhq2;->u:Z

    .line 215
    .line 216
    if-nez v4, :cond_5

    .line 217
    .line 218
    if-nez p1, :cond_4

    .line 219
    .line 220
    move-object p1, v0

    .line 221
    :cond_4
    :try_start_5
    invoke-interface {v3, p2, p1, v1}, Lqq2;->q(ZLandroid/content/Context;Lan2;)V

    .line 222
    .line 223
    .line 224
    invoke-virtual {v2}, Lt93;->U1()V
    :try_end_5
    .catch Lpq2; {:try_start_5 .. :try_end_5} :catch_0

    .line 225
    .line 226
    .line 227
    const/4 p1, 0x1

    .line 228
    iput-boolean p1, p0, Lhq2;->u:Z

    .line 229
    .line 230
    return-void

    .line 231
    :catch_0
    move-exception p1

    .line 232
    invoke-virtual {v1, p1}, Lan2;->R(Lpq2;)V

    .line 233
    .line 234
    .line 235
    :cond_5
    return-void
.end method

.method public final finalize()V
    .locals 4

    .line 1
    :try_start_0
    iget-object v0, p0, Lhq2;->m:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lag2;

    .line 8
    .line 9
    sget-object v1, Lmz1;->b7:Liz1;

    .line 10
    .line 11
    sget-object v2, Ltw1;->e:Ltw1;

    .line 12
    .line 13
    iget-object v2, v2, Ltw1;->c:Lkz1;

    .line 14
    .line 15
    invoke-virtual {v2, v1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, Ljava/lang/Boolean;

    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_0

    .line 26
    .line 27
    iget-boolean v1, p0, Lhq2;->u:Z

    .line 28
    .line 29
    if-nez v1, :cond_1

    .line 30
    .line 31
    if-eqz v0, :cond_1

    .line 32
    .line 33
    sget-object v1, Lmd2;->f:Lld2;

    .line 34
    .line 35
    new-instance v2, Lig2;

    .line 36
    .line 37
    const/4 v3, 0x4

    .line 38
    invoke-direct {v2, v0, v3}, Lig2;-><init>(Lag2;I)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1, v2}, Lld2;->execute(Ljava/lang/Runnable;)V

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :catchall_0
    move-exception v0

    .line 46
    goto :goto_1

    .line 47
    :cond_0
    if-eqz v0, :cond_1

    .line 48
    .line 49
    invoke-interface {v0}, Lag2;->destroy()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 50
    .line 51
    .line 52
    :cond_1
    :goto_0
    invoke-super {p0}, Ljava/lang/Object;->finalize()V

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :goto_1
    invoke-super {p0}, Ljava/lang/Object;->finalize()V

    .line 57
    .line 58
    .line 59
    throw v0
.end method
