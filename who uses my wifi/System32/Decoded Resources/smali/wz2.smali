.class public final Lwz2;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Le51;

.field public final c:La83;

.field public final d:Lag2;

.field public final e:Lmv2;

.field public f:Lcc3;


# direct methods
.method public constructor <init>(Landroid/content/Context;Le51;La83;Lag2;Lmv2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lwz2;->a:Landroid/content/Context;

    .line 5
    .line 6
    iput-object p2, p0, Lwz2;->b:Le51;

    .line 7
    .line 8
    iput-object p3, p0, Lwz2;->c:La83;

    .line 9
    .line 10
    iput-object p4, p0, Lwz2;->d:Lag2;

    .line 11
    .line 12
    iput-object p5, p0, Lwz2;->e:Lmv2;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final declared-synchronized a()Z
    .locals 8

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lwz2;->c:La83;

    .line 3
    .line 4
    iget-boolean v1, v0, La83;->T:Z

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    if-eqz v1, :cond_6

    .line 8
    .line 9
    sget-object v1, Lmz1;->G5:Liz1;

    .line 10
    .line 11
    sget-object v3, Ltw1;->e:Ltw1;

    .line 12
    .line 13
    iget-object v4, v3, Ltw1;->c:Lkz1;

    .line 14
    .line 15
    invoke-virtual {v4, v1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

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
    if-eqz v1, :cond_6

    .line 26
    .line 27
    sget-object v1, Lmz1;->J5:Liz1;

    .line 28
    .line 29
    iget-object v4, v3, Ltw1;->c:Lkz1;

    .line 30
    .line 31
    invoke-virtual {v4, v1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    check-cast v1, Ljava/lang/Boolean;

    .line 36
    .line 37
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-eqz v1, :cond_6

    .line 42
    .line 43
    iget-object v1, p0, Lwz2;->d:Lag2;

    .line 44
    .line 45
    if-nez v1, :cond_0

    .line 46
    .line 47
    goto/16 :goto_1

    .line 48
    .line 49
    :cond_0
    iget-object v4, p0, Lwz2;->f:Lcc3;

    .line 50
    .line 51
    if-eqz v4, :cond_1

    .line 52
    .line 53
    const-string v0, "Omid javascript session service already started for ad."

    .line 54
    .line 55
    invoke-static {v0}, Lgi2;->i0(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 56
    .line 57
    .line 58
    monitor-exit p0

    .line 59
    return v2

    .line 60
    :catchall_0
    move-exception v0

    .line 61
    goto/16 :goto_2

    .line 62
    .line 63
    :cond_1
    :try_start_1
    iget-object v4, p0, Lwz2;->a:Landroid/content/Context;

    .line 64
    .line 65
    sget-object v5, Lhg4;->C:Lhg4;

    .line 66
    .line 67
    iget-object v6, v5, Lhg4;->x:Lsu2;

    .line 68
    .line 69
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    invoke-static {v4}, Lsu2;->d(Landroid/content/Context;)Z

    .line 73
    .line 74
    .line 75
    move-result v4

    .line 76
    if-nez v4, :cond_2

    .line 77
    .line 78
    const-string v0, "Unable to initialize omid."

    .line 79
    .line 80
    invoke-static {v0}, Lgi2;->i0(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 81
    .line 82
    .line 83
    monitor-exit p0

    .line 84
    return v2

    .line 85
    :cond_2
    :try_start_2
    iget-object v0, v0, La83;->V:Lug0;

    .line 86
    .line 87
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    sget-object v4, Lmz1;->L5:Liz1;

    .line 91
    .line 92
    iget-object v6, v3, Ltw1;->c:Lkz1;

    .line 93
    .line 94
    invoke-virtual {v6, v4}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v4

    .line 98
    check-cast v4, Ljava/lang/String;

    .line 99
    .line 100
    iget-object v0, v0, Lug0;->g:Ljava/lang/Object;

    .line 101
    .line 102
    check-cast v0, Lorg/json/JSONObject;

    .line 103
    .line 104
    const/4 v6, 0x1

    .line 105
    invoke-virtual {v0, v4, v6}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 106
    .line 107
    .line 108
    move-result v0

    .line 109
    if-eqz v0, :cond_6

    .line 110
    .line 111
    iget-object v0, p0, Lwz2;->b:Le51;

    .line 112
    .line 113
    iget-object v4, v5, Lhg4;->x:Lsu2;

    .line 114
    .line 115
    invoke-interface {v1}, Lag2;->t()Landroid/webkit/WebView;

    .line 116
    .line 117
    .line 118
    move-result-object v5

    .line 119
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 120
    .line 121
    .line 122
    new-instance v4, Llv2;

    .line 123
    .line 124
    const/4 v7, 0x2

    .line 125
    invoke-direct {v4, v0, v5, v7}, Llv2;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 126
    .line 127
    .line 128
    invoke-static {v4}, Lsu2;->r(Ltz2;)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    check-cast v0, Lcc3;

    .line 133
    .line 134
    sget-object v4, Lmz1;->K5:Liz1;

    .line 135
    .line 136
    iget-object v3, v3, Ltw1;->c:Lkz1;

    .line 137
    .line 138
    invoke-virtual {v3, v4}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v3

    .line 142
    check-cast v3, Ljava/lang/Boolean;

    .line 143
    .line 144
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 145
    .line 146
    .line 147
    move-result v3

    .line 148
    if-eqz v3, :cond_4

    .line 149
    .line 150
    iget-object v3, p0, Lwz2;->e:Lmv2;

    .line 151
    .line 152
    if-eqz v0, :cond_3

    .line 153
    .line 154
    const-string v4, "1"

    .line 155
    .line 156
    goto :goto_0

    .line 157
    :cond_3
    const-string v4, "0"

    .line 158
    .line 159
    :goto_0
    invoke-virtual {v3}, Lmv2;->a()Llv2;

    .line 160
    .line 161
    .line 162
    move-result-object v3

    .line 163
    const-string v5, "omid_js_session_success"

    .line 164
    .line 165
    invoke-virtual {v3, v5, v4}, Llv2;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 166
    .line 167
    .line 168
    invoke-virtual {v3}, Llv2;->m()V

    .line 169
    .line 170
    .line 171
    :cond_4
    if-nez v0, :cond_5

    .line 172
    .line 173
    const-string v0, "Unable to create javascript session service."

    .line 174
    .line 175
    invoke-static {v0}, Lgi2;->i0(Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 176
    .line 177
    .line 178
    monitor-exit p0

    .line 179
    return v2

    .line 180
    :cond_5
    :try_start_3
    const-string v2, "Created omid javascript session service."

    .line 181
    .line 182
    invoke-static {v2}, Lgi2;->f0(Ljava/lang/String;)V

    .line 183
    .line 184
    .line 185
    iput-object v0, p0, Lwz2;->f:Lcc3;

    .line 186
    .line 187
    invoke-interface {v1, p0}, Lag2;->G(Lwz2;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 188
    .line 189
    .line 190
    monitor-exit p0

    .line 191
    return v6

    .line 192
    :cond_6
    :goto_1
    monitor-exit p0

    .line 193
    return v2

    .line 194
    :goto_2
    :try_start_4
    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 195
    throw v0
.end method

.method public final declared-synchronized b()V
    .locals 8

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lwz2;->f:Lcc3;

    .line 3
    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    iget-object v1, p0, Lwz2;->d:Lag2;

    .line 7
    .line 8
    if-eqz v1, :cond_1

    .line 9
    .line 10
    invoke-interface {v1}, Lag2;->A()Ljava/util/ArrayList;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 15
    .line 16
    .line 17
    move-result v3

    .line 18
    const/4 v4, 0x0

    .line 19
    :goto_0
    if-ge v4, v3, :cond_0

    .line 20
    .line 21
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v5

    .line 25
    add-int/lit8 v4, v4, 0x1

    .line 26
    .line 27
    check-cast v5, Landroid/view/View;

    .line 28
    .line 29
    sget-object v6, Lhg4;->C:Lhg4;

    .line 30
    .line 31
    iget-object v6, v6, Lhg4;->x:Lsu2;

    .line 32
    .line 33
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    new-instance v6, Lsz2;

    .line 37
    .line 38
    const/4 v7, 0x1

    .line 39
    invoke-direct {v6, v0, v5, v7}, Lsz2;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 40
    .line 41
    .line 42
    invoke-static {v6}, Lsu2;->t(Ljava/lang/Runnable;)V

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :catchall_0
    move-exception v0

    .line 47
    goto :goto_1

    .line 48
    :cond_0
    const-string v0, "onSdkLoaded"

    .line 49
    .line 50
    sget-object v2, Lxn3;->l:Lxn3;

    .line 51
    .line 52
    invoke-interface {v1, v0, v2}, Ll52;->a(Ljava/lang/String;Ljava/util/Map;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 53
    .line 54
    .line 55
    monitor-exit p0

    .line 56
    return-void

    .line 57
    :cond_1
    monitor-exit p0

    .line 58
    return-void

    .line 59
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 60
    throw v0
.end method

.method public final declared-synchronized c()V
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lwz2;->f:Lcc3;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget-object v0, p0, Lwz2;->d:Lag2;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    const-string v1, "onSdkImpression"

    .line 11
    .line 12
    sget-object v2, Lxn3;->l:Lxn3;

    .line 13
    .line 14
    invoke-interface {v0, v1, v2}, Ll52;->a(Ljava/lang/String;Ljava/util/Map;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    .line 16
    .line 17
    monitor-exit p0

    .line 18
    return-void

    .line 19
    :catchall_0
    move-exception v0

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    monitor-exit p0

    .line 22
    return-void

    .line 23
    :goto_0
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 24
    throw v0
.end method
