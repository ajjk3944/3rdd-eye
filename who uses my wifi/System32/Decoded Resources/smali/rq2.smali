.class public final Lrq2;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lrn2;
.implements Lye4;
.implements Ldn2;


# instance fields
.field public final f:Landroid/content/Context;

.field public final g:Lag2;

.field public final h:La83;

.field public final i:Le51;

.field public final j:Lwz2;

.field public k:Lxz2;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lag2;La83;Le51;Lwz2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lrq2;->f:Landroid/content/Context;

    .line 5
    .line 6
    iput-object p2, p0, Lrq2;->g:Lag2;

    .line 7
    .line 8
    iput-object p3, p0, Lrq2;->h:La83;

    .line 9
    .line 10
    iput-object p4, p0, Lrq2;->i:Le51;

    .line 11
    .line 12
    iput-object p5, p0, Lrq2;->j:Lwz2;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final B1()V
    .locals 0

    .line 1
    return-void
.end method

.method public final D0()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lrq2;->a()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lrq2;->j:Lwz2;

    .line 8
    .line 9
    invoke-virtual {v0}, Lwz2;->c()V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    iget-object v0, p0, Lrq2;->k:Lxz2;

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    iget-object v0, p0, Lrq2;->g:Lag2;

    .line 18
    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    sget-object v1, Lmz1;->M5:Liz1;

    .line 22
    .line 23
    sget-object v2, Ltw1;->e:Ltw1;

    .line 24
    .line 25
    iget-object v2, v2, Ltw1;->c:Lkz1;

    .line 26
    .line 27
    invoke-virtual {v2, v1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    check-cast v1, Ljava/lang/Boolean;

    .line 32
    .line 33
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-eqz v1, :cond_1

    .line 38
    .line 39
    new-instance v1, Ls8;

    .line 40
    .line 41
    const/4 v2, 0x0

    .line 42
    invoke-direct {v1, v2}, Lbw0;-><init>(I)V

    .line 43
    .line 44
    .line 45
    const-string v2, "onSdkImpression"

    .line 46
    .line 47
    invoke-interface {v0, v2, v1}, Ll52;->a(Ljava/lang/String;Ljava/util/Map;)V

    .line 48
    .line 49
    .line 50
    :cond_1
    return-void
.end method

.method public final E1()V
    .locals 0

    .line 1
    return-void
.end method

.method public final G1(I)V
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    iput-object p1, p0, Lrq2;->k:Lxz2;

    .line 3
    .line 4
    return-void
.end method

.method public final M1()V
    .locals 0

    .line 1
    return-void
.end method

.method public final R2()V
    .locals 0

    .line 1
    return-void
.end method

.method public final U()V
    .locals 0

    .line 1
    return-void
.end method

.method public final Y()V
    .locals 0

    .line 1
    return-void
.end method

.method public final a()Z
    .locals 2

    .line 1
    sget-object v0, Lmz1;->J5:Liz1;

    .line 2
    .line 3
    sget-object v1, Ltw1;->e:Ltw1;

    .line 4
    .line 5
    iget-object v1, v1, Ltw1;->c:Lkz1;

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Ljava/lang/Boolean;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    iget-object v0, p0, Lrq2;->j:Lwz2;

    .line 20
    .line 21
    monitor-enter v0

    .line 22
    :try_start_0
    iget-object v1, v0, Lwz2;->f:Lcc3;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    .line 24
    monitor-exit v0

    .line 25
    if-eqz v1, :cond_0

    .line 26
    .line 27
    const/4 v0, 0x1

    .line 28
    return v0

    .line 29
    :catchall_0
    move-exception v1

    .line 30
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 31
    throw v1

    .line 32
    :cond_0
    const/4 v0, 0x0

    .line 33
    return v0
.end method

.method public final e()V
    .locals 15

    .line 1
    iget-object v0, p0, Lrq2;->h:La83;

    .line 2
    .line 3
    iget-boolean v1, v0, La83;->T:Z

    .line 4
    .line 5
    if-eqz v1, :cond_6

    .line 6
    .line 7
    iget-object v1, p0, Lrq2;->g:Lag2;

    .line 8
    .line 9
    if-eqz v1, :cond_6

    .line 10
    .line 11
    sget-object v2, Lhg4;->C:Lhg4;

    .line 12
    .line 13
    iget-object v3, v2, Lhg4;->x:Lsu2;

    .line 14
    .line 15
    iget-object v2, v2, Lhg4;->x:Lsu2;

    .line 16
    .line 17
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    iget-object v3, p0, Lrq2;->f:Landroid/content/Context;

    .line 21
    .line 22
    invoke-static {v3}, Lsu2;->d(Landroid/content/Context;)Z

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    if-eqz v3, :cond_6

    .line 27
    .line 28
    invoke-virtual {p0}, Lrq2;->a()Z

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    if-eqz v3, :cond_0

    .line 33
    .line 34
    iget-object v0, p0, Lrq2;->j:Lwz2;

    .line 35
    .line 36
    invoke-virtual {v0}, Lwz2;->b()V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :cond_0
    iget-object v3, p0, Lrq2;->i:Le51;

    .line 41
    .line 42
    iget v4, v3, Le51;->g:I

    .line 43
    .line 44
    iget v3, v3, Le51;->h:I

    .line 45
    .line 46
    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v5

    .line 50
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 51
    .line 52
    .line 53
    move-result v5

    .line 54
    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v6

    .line 58
    const/4 v7, 0x1

    .line 59
    add-int/2addr v5, v7

    .line 60
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 61
    .line 62
    .line 63
    move-result v6

    .line 64
    new-instance v8, Ljava/lang/StringBuilder;

    .line 65
    .line 66
    add-int/2addr v5, v6

    .line 67
    invoke-direct {v8, v5}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    const-string v4, "."

    .line 74
    .line 75
    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v12

    .line 85
    iget-object v3, v0, La83;->V:Lug0;

    .line 86
    .line 87
    invoke-virtual {v3}, Lug0;->A()I

    .line 88
    .line 89
    .line 90
    move-result v4

    .line 91
    add-int/lit8 v4, v4, -0x1

    .line 92
    .line 93
    if-eq v4, v7, :cond_1

    .line 94
    .line 95
    const-string v4, "javascript"

    .line 96
    .line 97
    :goto_0
    move-object v13, v4

    .line 98
    goto :goto_1

    .line 99
    :cond_1
    const/4 v4, 0x0

    .line 100
    goto :goto_0

    .line 101
    :goto_1
    invoke-virtual {v3}, Lug0;->A()I

    .line 102
    .line 103
    .line 104
    move-result v3

    .line 105
    const/4 v4, 0x2

    .line 106
    if-ne v3, v7, :cond_2

    .line 107
    .line 108
    const/4 v7, 0x3

    .line 109
    :goto_2
    move v9, v4

    .line 110
    move v10, v7

    .line 111
    goto :goto_3

    .line 112
    :cond_2
    iget v3, v0, La83;->Y:I

    .line 113
    .line 114
    if-ne v3, v4, :cond_3

    .line 115
    .line 116
    const/4 v3, 0x4

    .line 117
    move v4, v3

    .line 118
    goto :goto_2

    .line 119
    :cond_3
    move v4, v7

    .line 120
    goto :goto_2

    .line 121
    :goto_3
    iget-object v14, v0, La83;->l0:Ljava/lang/String;

    .line 122
    .line 123
    invoke-interface {v1}, Lag2;->t()Landroid/webkit/WebView;

    .line 124
    .line 125
    .line 126
    move-result-object v11

    .line 127
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 128
    .line 129
    .line 130
    invoke-static/range {v9 .. v14}, Lsu2;->i(IILandroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lxz2;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    iput-object v0, p0, Lrq2;->k:Lxz2;

    .line 135
    .line 136
    if-eqz v0, :cond_6

    .line 137
    .line 138
    iget-object v0, v0, Lxz2;->a:Lxb3;

    .line 139
    .line 140
    sget-object v3, Lmz1;->I5:Liz1;

    .line 141
    .line 142
    sget-object v4, Ltw1;->e:Ltw1;

    .line 143
    .line 144
    iget-object v4, v4, Ltw1;->c:Lkz1;

    .line 145
    .line 146
    invoke-virtual {v4, v3}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v3

    .line 150
    check-cast v3, Ljava/lang/Boolean;

    .line 151
    .line 152
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 153
    .line 154
    .line 155
    move-result v3

    .line 156
    const/4 v4, 0x0

    .line 157
    if-eqz v3, :cond_4

    .line 158
    .line 159
    invoke-interface {v1}, Lag2;->t()Landroid/webkit/WebView;

    .line 160
    .line 161
    .line 162
    move-result-object v3

    .line 163
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 164
    .line 165
    .line 166
    invoke-static {v0, v3}, Lsu2;->k(Lxb3;Landroid/view/View;)V

    .line 167
    .line 168
    .line 169
    invoke-interface {v1}, Lag2;->A()Ljava/util/ArrayList;

    .line 170
    .line 171
    .line 172
    move-result-object v2

    .line 173
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 174
    .line 175
    .line 176
    move-result v3

    .line 177
    move v5, v4

    .line 178
    :goto_4
    if-ge v5, v3, :cond_5

    .line 179
    .line 180
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v6

    .line 184
    add-int/lit8 v5, v5, 0x1

    .line 185
    .line 186
    check-cast v6, Landroid/view/View;

    .line 187
    .line 188
    sget-object v7, Lhg4;->C:Lhg4;

    .line 189
    .line 190
    iget-object v7, v7, Lhg4;->x:Lsu2;

    .line 191
    .line 192
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 193
    .line 194
    .line 195
    new-instance v7, Lrz2;

    .line 196
    .line 197
    const/4 v8, 0x0

    .line 198
    invoke-direct {v7, v0, v6, v8}, Lrz2;-><init>(Lxb3;Landroid/view/View;I)V

    .line 199
    .line 200
    .line 201
    invoke-static {v7}, Lsu2;->t(Ljava/lang/Runnable;)V

    .line 202
    .line 203
    .line 204
    goto :goto_4

    .line 205
    :cond_4
    invoke-interface {v1}, Lag2;->p0()Landroid/view/View;

    .line 206
    .line 207
    .line 208
    move-result-object v3

    .line 209
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 210
    .line 211
    .line 212
    invoke-static {v0, v3}, Lsu2;->k(Lxb3;Landroid/view/View;)V

    .line 213
    .line 214
    .line 215
    :cond_5
    iget-object v2, p0, Lrq2;->k:Lxz2;

    .line 216
    .line 217
    invoke-interface {v1, v2}, Lag2;->m0(Lxz2;)V

    .line 218
    .line 219
    .line 220
    sget-object v2, Lhg4;->C:Lhg4;

    .line 221
    .line 222
    iget-object v2, v2, Lhg4;->x:Lsu2;

    .line 223
    .line 224
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 225
    .line 226
    .line 227
    invoke-static {v0}, Lsu2;->j(Lxb3;)V

    .line 228
    .line 229
    .line 230
    new-instance v0, Ls8;

    .line 231
    .line 232
    invoke-direct {v0, v4}, Lbw0;-><init>(I)V

    .line 233
    .line 234
    .line 235
    const-string v2, "onSdkLoaded"

    .line 236
    .line 237
    invoke-interface {v1, v2, v0}, Ll52;->a(Ljava/lang/String;Ljava/util/Map;)V

    .line 238
    .line 239
    .line 240
    :cond_6
    return-void
.end method

.method public final f()V
    .locals 3

    .line 1
    sget-object v0, Lmz1;->M5:Liz1;

    .line 2
    .line 3
    sget-object v1, Ltw1;->e:Ltw1;

    .line 4
    .line 5
    iget-object v1, v1, Ltw1;->c:Lkz1;

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Ljava/lang/Boolean;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_2

    .line 18
    .line 19
    iget-object v0, p0, Lrq2;->g:Lag2;

    .line 20
    .line 21
    if-eqz v0, :cond_2

    .line 22
    .line 23
    iget-object v1, p0, Lrq2;->k:Lxz2;

    .line 24
    .line 25
    if-nez v1, :cond_0

    .line 26
    .line 27
    invoke-virtual {p0}, Lrq2;->a()Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    :cond_0
    iget-object v1, p0, Lrq2;->k:Lxz2;

    .line 34
    .line 35
    if-eqz v1, :cond_1

    .line 36
    .line 37
    new-instance v1, Ls8;

    .line 38
    .line 39
    const/4 v2, 0x0

    .line 40
    invoke-direct {v1, v2}, Lbw0;-><init>(I)V

    .line 41
    .line 42
    .line 43
    const-string v2, "onSdkImpression"

    .line 44
    .line 45
    invoke-interface {v0, v2, v1}, Ll52;->a(Ljava/lang/String;Ljava/util/Map;)V

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :cond_1
    iget-object v0, p0, Lrq2;->j:Lwz2;

    .line 50
    .line 51
    invoke-virtual {v0}, Lwz2;->c()V

    .line 52
    .line 53
    .line 54
    :cond_2
    return-void
.end method

.method public final f3()V
    .locals 0

    .line 1
    return-void
.end method

.method public final h3()V
    .locals 0

    .line 1
    return-void
.end method

.method public final m2()V
    .locals 0

    .line 1
    return-void
.end method
