.class public final synthetic Lsz2;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic f:I

.field public final synthetic g:Ljava/lang/Object;

.field public final synthetic h:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lfr;Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 0

    const/16 p1, 0xd

    iput p1, p0, Lsz2;->f:I

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lsz2;->g:Ljava/lang/Object;

    iput-object p3, p0, Lsz2;->h:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p3, p0, Lsz2;->f:I

    iput-object p1, p0, Lsz2;->g:Ljava/lang/Object;

    iput-object p2, p0, Lsz2;->h:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V
    .locals 0

    .line 2
    iput p3, p0, Lsz2;->f:I

    iput-object p2, p0, Lsz2;->g:Ljava/lang/Object;

    iput-object p1, p0, Lsz2;->h:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final a()V
    .locals 5

    .line 1
    iget-object v0, p0, Lsz2;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljb3;

    .line 4
    .line 5
    iget-object v1, p0, Lsz2;->g:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lnx2;

    .line 8
    .line 9
    monitor-enter v0

    .line 10
    :try_start_0
    iget-object v2, v0, Ljb3;->h:Lbf2;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    .line 12
    if-eqz v2, :cond_0

    .line 13
    .line 14
    :try_start_1
    iget-object v3, v0, Ljb3;->k:Ljava/lang/String;

    .line 15
    .line 16
    invoke-virtual {v2}, Lsb1;->U()Landroid/os/Parcel;

    .line 17
    .line 18
    .line 19
    move-result-object v4

    .line 20
    invoke-virtual {v4, v3}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-static {v4, v1}, Liv1;->c(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    .line 24
    .line 25
    .line 26
    const/4 v1, 0x3

    .line 27
    invoke-virtual {v2, v4, v1}, Lsb1;->M0(Landroid/os/Parcel;I)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 28
    .line 29
    .line 30
    monitor-exit v0

    .line 31
    return-void

    .line 32
    :catchall_0
    move-exception v1

    .line 33
    goto :goto_0

    .line 34
    :catch_0
    :try_start_2
    const-string v1, "Failed to call onAdFailedToPreload"

    .line 35
    .line 36
    invoke-static {v1}, Lgi2;->i0(Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 37
    .line 38
    .line 39
    monitor-exit v0

    .line 40
    return-void

    .line 41
    :cond_0
    monitor-exit v0

    .line 42
    return-void

    .line 43
    :goto_0
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 44
    throw v1
.end method

.method private final b()V
    .locals 7

    .line 1
    iget-object v0, p0, Lsz2;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/os/IBinder;

    .line 4
    .line 5
    sget v1, Ljk3;->f:I

    .line 6
    .line 7
    const-string v1, "com.google.android.play.core.lmd.protocol.ILmdOverlayService"

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    move-object v3, v2

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    invoke-interface {v0, v1}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    instance-of v4, v3, Lkk3;

    .line 19
    .line 20
    if-eqz v4, :cond_1

    .line 21
    .line 22
    check-cast v3, Lkk3;

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    new-instance v3, Lik3;

    .line 26
    .line 27
    const/4 v4, 0x2

    .line 28
    invoke-direct {v3, v0, v1, v4}, Lsb1;-><init>(Landroid/os/IBinder;Ljava/lang/String;I)V

    .line 29
    .line 30
    .line 31
    :goto_0
    iget-object v0, p0, Lsz2;->g:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v0, Lsk3;

    .line 34
    .line 35
    iget-object v1, v0, Lsk3;->a:Lx03;

    .line 36
    .line 37
    iput-object v3, v1, Lx03;->o:Ljava/lang/Object;

    .line 38
    .line 39
    iget-object v3, v1, Lx03;->i:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v3, Ler3;

    .line 42
    .line 43
    const-string v4, "linkToDeath"

    .line 44
    .line 45
    const/4 v5, 0x0

    .line 46
    new-array v6, v5, [Ljava/lang/Object;

    .line 47
    .line 48
    invoke-virtual {v3, v4, v6}, Ler3;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    :try_start_0
    iget-object v3, v1, Lx03;->o:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v3, Lkk3;

    .line 54
    .line 55
    if-eqz v3, :cond_2

    .line 56
    .line 57
    check-cast v3, Lsb1;

    .line 58
    .line 59
    iget-object v2, v3, Lsb1;->g:Landroid/os/IBinder;

    .line 60
    .line 61
    iget-object v1, v1, Lx03;->m:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v1, Ltk3;

    .line 64
    .line 65
    invoke-interface {v2, v1, v5}, Landroid/os/IBinder;->linkToDeath(Landroid/os/IBinder$DeathRecipient;I)V

    .line 66
    .line 67
    .line 68
    goto :goto_2

    .line 69
    :catch_0
    move-exception v1

    .line 70
    goto :goto_1

    .line 71
    :cond_2
    throw v2
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 72
    :goto_1
    iget-object v2, v0, Lsk3;->a:Lx03;

    .line 73
    .line 74
    new-array v3, v5, [Ljava/lang/Object;

    .line 75
    .line 76
    iget-object v2, v2, Lx03;->i:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v2, Ler3;

    .line 79
    .line 80
    const-string v4, "linkToDeath failed"

    .line 81
    .line 82
    invoke-virtual {v2, v1, v4, v3}, Ler3;->f(Landroid/os/RemoteException;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    :goto_2
    iget-object v0, v0, Lsk3;->a:Lx03;

    .line 86
    .line 87
    iput-boolean v5, v0, Lx03;->f:Z

    .line 88
    .line 89
    iget-object v1, v0, Lx03;->k:Ljava/lang/Object;

    .line 90
    .line 91
    check-cast v1, Ljava/util/ArrayList;

    .line 92
    .line 93
    monitor-enter v1

    .line 94
    :try_start_1
    iget-object v2, v0, Lx03;->k:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v2, Ljava/util/ArrayList;

    .line 97
    .line 98
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 99
    .line 100
    .line 101
    move-result v3

    .line 102
    :goto_3
    if-ge v5, v3, :cond_3

    .line 103
    .line 104
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v4

    .line 108
    add-int/lit8 v5, v5, 0x1

    .line 109
    .line 110
    check-cast v4, Ljava/lang/Runnable;

    .line 111
    .line 112
    invoke-interface {v4}, Ljava/lang/Runnable;->run()V

    .line 113
    .line 114
    .line 115
    goto :goto_3

    .line 116
    :catchall_0
    move-exception v0

    .line 117
    goto :goto_4

    .line 118
    :cond_3
    iget-object v0, v0, Lx03;->k:Ljava/lang/Object;

    .line 119
    .line 120
    check-cast v0, Ljava/util/ArrayList;

    .line 121
    .line 122
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 123
    .line 124
    .line 125
    monitor-exit v1

    .line 126
    return-void

    .line 127
    :goto_4
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 128
    throw v0
.end method

.method private final c()V
    .locals 3

    .line 1
    iget-object v0, p0, Lsz2;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lmn2;

    .line 4
    .line 5
    iget-object v0, v0, Lmn2;->i:Ljava/lang/Object;

    .line 6
    .line 7
    monitor-enter v0

    .line 8
    :try_start_0
    iget-object v1, p0, Lsz2;->h:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Lmn2;

    .line 11
    .line 12
    iget-object v1, v1, Lmn2;->h:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v1, Ldj0;

    .line 15
    .line 16
    iget-object v2, p0, Lsz2;->g:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v2, Lgi4;

    .line 19
    .line 20
    invoke-interface {v1, v2}, Ldj0;->i(Lgi4;)V

    .line 21
    .line 22
    .line 23
    monitor-exit v0

    .line 24
    return-void

    .line 25
    :catchall_0
    move-exception v1

    .line 26
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    throw v1
.end method

.method private final d()V
    .locals 7

    .line 1
    iget-object v0, p0, Lsz2;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lra4;

    .line 4
    .line 5
    iget-object v1, p0, Lsz2;->h:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Landroid/content/Context;

    .line 8
    .line 9
    const-string v2, "admob"

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    invoke-virtual {v1, v2, v3}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    :try_start_0
    iget-object v3, v0, Lra4;->a:Ljava/lang/Object;

    .line 21
    .line 22
    monitor-enter v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 23
    :try_start_1
    iput-object v1, v0, Lra4;->f:Landroid/content/SharedPreferences;

    .line 24
    .line 25
    iput-object v2, v0, Lra4;->g:Landroid/content/SharedPreferences$Editor;

    .line 26
    .line 27
    invoke-static {}, Landroid/security/NetworkSecurityPolicy;->getInstance()Landroid/security/NetworkSecurityPolicy;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-virtual {v1}, Landroid/security/NetworkSecurityPolicy;->isCleartextTrafficPermitted()Z

    .line 32
    .line 33
    .line 34
    iget-object v1, v0, Lra4;->f:Landroid/content/SharedPreferences;

    .line 35
    .line 36
    const-string v2, "use_https"

    .line 37
    .line 38
    iget-boolean v4, v0, Lra4;->h:Z

    .line 39
    .line 40
    invoke-interface {v1, v2, v4}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    iput-boolean v1, v0, Lra4;->h:Z

    .line 45
    .line 46
    iget-object v1, v0, Lra4;->f:Landroid/content/SharedPreferences;

    .line 47
    .line 48
    const-string v2, "content_url_opted_out"

    .line 49
    .line 50
    iget-boolean v4, v0, Lra4;->u:Z

    .line 51
    .line 52
    invoke-interface {v1, v2, v4}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    iput-boolean v1, v0, Lra4;->u:Z

    .line 57
    .line 58
    iget-object v1, v0, Lra4;->f:Landroid/content/SharedPreferences;

    .line 59
    .line 60
    const-string v2, "content_url_hashes"

    .line 61
    .line 62
    iget-object v4, v0, Lra4;->i:Ljava/lang/String;

    .line 63
    .line 64
    invoke-interface {v1, v2, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    iput-object v1, v0, Lra4;->i:Ljava/lang/String;

    .line 69
    .line 70
    iget-object v1, v0, Lra4;->f:Landroid/content/SharedPreferences;

    .line 71
    .line 72
    const-string v2, "gad_idless"

    .line 73
    .line 74
    iget-boolean v4, v0, Lra4;->k:Z

    .line 75
    .line 76
    invoke-interface {v1, v2, v4}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 77
    .line 78
    .line 79
    move-result v1

    .line 80
    iput-boolean v1, v0, Lra4;->k:Z

    .line 81
    .line 82
    iget-object v1, v0, Lra4;->f:Landroid/content/SharedPreferences;

    .line 83
    .line 84
    const-string v2, "content_vertical_opted_out"

    .line 85
    .line 86
    iget-boolean v4, v0, Lra4;->v:Z

    .line 87
    .line 88
    invoke-interface {v1, v2, v4}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 89
    .line 90
    .line 91
    move-result v1

    .line 92
    iput-boolean v1, v0, Lra4;->v:Z

    .line 93
    .line 94
    iget-object v1, v0, Lra4;->f:Landroid/content/SharedPreferences;

    .line 95
    .line 96
    const-string v2, "content_vertical_hashes"

    .line 97
    .line 98
    iget-object v4, v0, Lra4;->j:Ljava/lang/String;

    .line 99
    .line 100
    invoke-interface {v1, v2, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    iput-object v1, v0, Lra4;->j:Ljava/lang/String;

    .line 105
    .line 106
    iget-object v1, v0, Lra4;->f:Landroid/content/SharedPreferences;

    .line 107
    .line 108
    const-string v2, "version_code"

    .line 109
    .line 110
    iget v4, v0, Lra4;->r:I

    .line 111
    .line 112
    invoke-interface {v1, v2, v4}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 113
    .line 114
    .line 115
    move-result v1

    .line 116
    iput v1, v0, Lra4;->r:I

    .line 117
    .line 118
    sget-object v1, Lm02;->g:Lso1;

    .line 119
    .line 120
    invoke-virtual {v1}, Lso1;->w()Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v1

    .line 124
    check-cast v1, Ljava/lang/Boolean;

    .line 125
    .line 126
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 127
    .line 128
    .line 129
    move-result v1

    .line 130
    if-eqz v1, :cond_0

    .line 131
    .line 132
    sget-object v1, Ltw1;->e:Ltw1;

    .line 133
    .line 134
    iget-object v1, v1, Ltw1;->c:Lkz1;

    .line 135
    .line 136
    iget-boolean v1, v1, Lkz1;->j:Z

    .line 137
    .line 138
    if-eqz v1, :cond_0

    .line 139
    .line 140
    new-instance v1, Led2;

    .line 141
    .line 142
    const-string v2, ""

    .line 143
    .line 144
    const-wide/16 v4, 0x0

    .line 145
    .line 146
    invoke-direct {v1, v2, v4, v5}, Led2;-><init>(Ljava/lang/String;J)V

    .line 147
    .line 148
    .line 149
    iput-object v1, v0, Lra4;->n:Led2;

    .line 150
    .line 151
    goto :goto_0

    .line 152
    :catchall_0
    move-exception v0

    .line 153
    goto/16 :goto_2

    .line 154
    .line 155
    :cond_0
    iget-object v1, v0, Lra4;->f:Landroid/content/SharedPreferences;

    .line 156
    .line 157
    const-string v2, "app_settings_json"

    .line 158
    .line 159
    iget-object v4, v0, Lra4;->n:Led2;

    .line 160
    .line 161
    iget-object v4, v4, Led2;->e:Ljava/lang/String;

    .line 162
    .line 163
    invoke-interface {v1, v2, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v1

    .line 167
    iget-object v2, v0, Lra4;->f:Landroid/content/SharedPreferences;

    .line 168
    .line 169
    const-string v4, "app_settings_last_update_ms"

    .line 170
    .line 171
    iget-object v5, v0, Lra4;->n:Led2;

    .line 172
    .line 173
    iget-wide v5, v5, Led2;->f:J

    .line 174
    .line 175
    invoke-interface {v2, v4, v5, v6}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    .line 176
    .line 177
    .line 178
    move-result-wide v4

    .line 179
    new-instance v2, Led2;

    .line 180
    .line 181
    invoke-direct {v2, v1, v4, v5}, Led2;-><init>(Ljava/lang/String;J)V

    .line 182
    .line 183
    .line 184
    iput-object v2, v0, Lra4;->n:Led2;

    .line 185
    .line 186
    :goto_0
    iget-object v1, v0, Lra4;->f:Landroid/content/SharedPreferences;

    .line 187
    .line 188
    const-string v2, "app_last_background_time_ms"

    .line 189
    .line 190
    iget-wide v4, v0, Lra4;->o:J

    .line 191
    .line 192
    invoke-interface {v1, v2, v4, v5}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    .line 193
    .line 194
    .line 195
    move-result-wide v1

    .line 196
    iput-wide v1, v0, Lra4;->o:J

    .line 197
    .line 198
    iget-object v1, v0, Lra4;->f:Landroid/content/SharedPreferences;

    .line 199
    .line 200
    const-string v2, "request_in_session_count"

    .line 201
    .line 202
    iget v4, v0, Lra4;->q:I

    .line 203
    .line 204
    invoke-interface {v1, v2, v4}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 205
    .line 206
    .line 207
    move-result v1

    .line 208
    iput v1, v0, Lra4;->q:I

    .line 209
    .line 210
    iget-object v1, v0, Lra4;->f:Landroid/content/SharedPreferences;

    .line 211
    .line 212
    const-string v2, "first_ad_req_time_ms"

    .line 213
    .line 214
    iget-wide v4, v0, Lra4;->p:J

    .line 215
    .line 216
    invoke-interface {v1, v2, v4, v5}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    .line 217
    .line 218
    .line 219
    move-result-wide v1

    .line 220
    iput-wide v1, v0, Lra4;->p:J

    .line 221
    .line 222
    iget-object v1, v0, Lra4;->f:Landroid/content/SharedPreferences;

    .line 223
    .line 224
    const-string v2, "never_pool_slots"

    .line 225
    .line 226
    iget-object v4, v0, Lra4;->s:Ljava/util/Set;

    .line 227
    .line 228
    invoke-interface {v1, v2, v4}, Landroid/content/SharedPreferences;->getStringSet(Ljava/lang/String;Ljava/util/Set;)Ljava/util/Set;

    .line 229
    .line 230
    .line 231
    move-result-object v1

    .line 232
    iput-object v1, v0, Lra4;->s:Ljava/util/Set;

    .line 233
    .line 234
    iget-object v1, v0, Lra4;->f:Landroid/content/SharedPreferences;

    .line 235
    .line 236
    const-string v2, "display_cutout"

    .line 237
    .line 238
    iget-object v4, v0, Lra4;->w:Ljava/lang/String;

    .line 239
    .line 240
    invoke-interface {v1, v2, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 241
    .line 242
    .line 243
    move-result-object v1

    .line 244
    iput-object v1, v0, Lra4;->w:Ljava/lang/String;

    .line 245
    .line 246
    iget-object v1, v0, Lra4;->f:Landroid/content/SharedPreferences;

    .line 247
    .line 248
    const-string v2, "app_measurement_npa"

    .line 249
    .line 250
    iget v4, v0, Lra4;->B:I

    .line 251
    .line 252
    invoke-interface {v1, v2, v4}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 253
    .line 254
    .line 255
    move-result v1

    .line 256
    iput v1, v0, Lra4;->B:I

    .line 257
    .line 258
    iget-object v1, v0, Lra4;->f:Landroid/content/SharedPreferences;

    .line 259
    .line 260
    const-string v2, "sd_app_measure_npa"

    .line 261
    .line 262
    iget v4, v0, Lra4;->C:I

    .line 263
    .line 264
    invoke-interface {v1, v2, v4}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 265
    .line 266
    .line 267
    move-result v1

    .line 268
    iput v1, v0, Lra4;->C:I

    .line 269
    .line 270
    iget-object v1, v0, Lra4;->f:Landroid/content/SharedPreferences;

    .line 271
    .line 272
    const-string v2, "sd_app_measure_npa_ts"

    .line 273
    .line 274
    iget-wide v4, v0, Lra4;->D:J

    .line 275
    .line 276
    invoke-interface {v1, v2, v4, v5}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    .line 277
    .line 278
    .line 279
    move-result-wide v1

    .line 280
    iput-wide v1, v0, Lra4;->D:J

    .line 281
    .line 282
    iget-object v1, v0, Lra4;->f:Landroid/content/SharedPreferences;

    .line 283
    .line 284
    const-string v2, "inspector_info"

    .line 285
    .line 286
    iget-object v4, v0, Lra4;->x:Ljava/lang/String;

    .line 287
    .line 288
    invoke-interface {v1, v2, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 289
    .line 290
    .line 291
    move-result-object v1

    .line 292
    iput-object v1, v0, Lra4;->x:Ljava/lang/String;

    .line 293
    .line 294
    iget-object v1, v0, Lra4;->f:Landroid/content/SharedPreferences;

    .line 295
    .line 296
    const-string v2, "linked_device"

    .line 297
    .line 298
    iget-boolean v4, v0, Lra4;->y:Z

    .line 299
    .line 300
    invoke-interface {v1, v2, v4}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 301
    .line 302
    .line 303
    move-result v1

    .line 304
    iput-boolean v1, v0, Lra4;->y:Z

    .line 305
    .line 306
    iget-object v1, v0, Lra4;->f:Landroid/content/SharedPreferences;

    .line 307
    .line 308
    const-string v2, "linked_ad_unit"

    .line 309
    .line 310
    iget-object v4, v0, Lra4;->z:Ljava/lang/String;

    .line 311
    .line 312
    invoke-interface {v1, v2, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 313
    .line 314
    .line 315
    move-result-object v1

    .line 316
    iput-object v1, v0, Lra4;->z:Ljava/lang/String;

    .line 317
    .line 318
    iget-object v1, v0, Lra4;->f:Landroid/content/SharedPreferences;

    .line 319
    .line 320
    const-string v2, "inspector_ui_storage"

    .line 321
    .line 322
    iget-object v4, v0, Lra4;->A:Ljava/lang/String;

    .line 323
    .line 324
    invoke-interface {v1, v2, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 325
    .line 326
    .line 327
    move-result-object v1

    .line 328
    iput-object v1, v0, Lra4;->A:Ljava/lang/String;

    .line 329
    .line 330
    iget-object v1, v0, Lra4;->f:Landroid/content/SharedPreferences;

    .line 331
    .line 332
    const-string v2, "IABTCF_TCString"

    .line 333
    .line 334
    iget-object v4, v0, Lra4;->l:Ljava/lang/String;

    .line 335
    .line 336
    invoke-interface {v1, v2, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 337
    .line 338
    .line 339
    move-result-object v1

    .line 340
    iput-object v1, v0, Lra4;->l:Ljava/lang/String;

    .line 341
    .line 342
    iget-object v1, v0, Lra4;->f:Landroid/content/SharedPreferences;

    .line 343
    .line 344
    const-string v2, "gad_has_consent_for_cookies"

    .line 345
    .line 346
    iget v4, v0, Lra4;->m:I

    .line 347
    .line 348
    invoke-interface {v1, v2, v4}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 349
    .line 350
    .line 351
    move-result v1

    .line 352
    iput v1, v0, Lra4;->m:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 353
    .line 354
    :try_start_2
    new-instance v1, Lorg/json/JSONObject;

    .line 355
    .line 356
    iget-object v2, v0, Lra4;->f:Landroid/content/SharedPreferences;

    .line 357
    .line 358
    const-string v4, "native_advanced_settings"

    .line 359
    .line 360
    const-string v5, "{}"

    .line 361
    .line 362
    invoke-interface {v2, v4, v5}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 363
    .line 364
    .line 365
    move-result-object v2

    .line 366
    invoke-direct {v1, v2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 367
    .line 368
    .line 369
    iput-object v1, v0, Lra4;->t:Lorg/json/JSONObject;
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 370
    .line 371
    goto :goto_1

    .line 372
    :catch_0
    const/4 v1, 0x5

    .line 373
    :try_start_3
    invoke-static {v1}, Lgi2;->q0(I)Z

    .line 374
    .line 375
    .line 376
    :goto_1
    invoke-virtual {v0}, Lra4;->i()V

    .line 377
    .line 378
    .line 379
    monitor-exit v3

    .line 380
    goto :goto_3

    .line 381
    :goto_2
    monitor-exit v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 382
    :try_start_4
    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 383
    :catchall_1
    move-exception v0

    .line 384
    const-string v1, "AdSharedPreferenceManagerImpl.initializeOnBackgroundThread"

    .line 385
    .line 386
    sget-object v2, Lhg4;->C:Lhg4;

    .line 387
    .line 388
    iget-object v2, v2, Lhg4;->h:Lgd2;

    .line 389
    .line 390
    invoke-virtual {v2, v1, v0}, Lgd2;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 391
    .line 392
    .line 393
    invoke-static {}, Lgi2;->R()Z

    .line 394
    .line 395
    .line 396
    :goto_3
    return-void
.end method

.method private final e()V
    .locals 3

    .line 1
    iget-object v0, p0, Lsz2;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lmn2;

    .line 4
    .line 5
    iget-object v0, v0, Lmn2;->i:Ljava/lang/Object;

    .line 6
    .line 7
    monitor-enter v0

    .line 8
    :try_start_0
    iget-object v1, p0, Lsz2;->h:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Lmn2;

    .line 11
    .line 12
    iget-object v1, v1, Lmn2;->h:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v1, Lgj0;

    .line 15
    .line 16
    iget-object v2, p0, Lsz2;->g:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v2, Lgi4;

    .line 19
    .line 20
    invoke-virtual {v2}, Lgi4;->a()Ljava/lang/Exception;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-static {v2}, Lou1;->j(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    invoke-interface {v1, v2}, Lgj0;->q(Ljava/lang/Exception;)V

    .line 28
    .line 29
    .line 30
    monitor-exit v0

    .line 31
    return-void

    .line 32
    :catchall_0
    move-exception v1

    .line 33
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    throw v1
.end method

.method private final f()V
    .locals 3

    .line 1
    iget-object v0, p0, Lsz2;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lft3;

    .line 4
    .line 5
    iget-object v0, v0, Lft3;->h:Ljava/lang/Object;

    .line 6
    .line 7
    monitor-enter v0

    .line 8
    :try_start_0
    iget-object v1, p0, Lsz2;->h:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Lft3;

    .line 11
    .line 12
    iget-object v1, v1, Lft3;->i:Lmn2;

    .line 13
    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    iget-object v2, p0, Lsz2;->g:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v2, Lgi4;

    .line 19
    .line 20
    invoke-virtual {v2}, Lgi4;->b()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    iget-object v1, v1, Lmn2;->h:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v1, Lgi4;

    .line 27
    .line 28
    invoke-virtual {v1, v2}, Lgi4;->e(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :catchall_0
    move-exception v1

    .line 33
    goto :goto_1

    .line 34
    :cond_0
    :goto_0
    monitor-exit v0

    .line 35
    return-void

    .line 36
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    throw v1
.end method


# virtual methods
.method public final run()V
    .locals 13

    .line 1
    iget v0, p0, Lsz2;->f:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lsz2;->g:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Lwt2;

    .line 11
    .line 12
    iget-object v1, p0, Lsz2;->h:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v1, Ln34;

    .line 15
    .line 16
    monitor-enter v1

    .line 17
    monitor-exit v1

    .line 18
    sget-object v1, Lv23;->a:Ljava/lang/String;

    .line 19
    .line 20
    iget-object v0, v0, Lwt2;->h:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v0, Loa4;

    .line 23
    .line 24
    iget-object v0, v0, Loa4;->f:Lya4;

    .line 25
    .line 26
    iget-object v0, v0, Lya4;->y:Lmd4;

    .line 27
    .line 28
    iget-object v1, v0, Lmd4;->i:Lbu1;

    .line 29
    .line 30
    iget-object v1, v1, Lbu1;->k:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v1, Lkh4;

    .line 33
    .line 34
    invoke-virtual {v0, v1}, Lmd4;->x(Lkh4;)Lad4;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    new-instance v3, Lt24;

    .line 39
    .line 40
    const/16 v4, 0x13

    .line 41
    .line 42
    invoke-direct {v3, v4, v2}, Lt24;-><init>(IB)V

    .line 43
    .line 44
    .line 45
    const/16 v2, 0x3f5

    .line 46
    .line 47
    invoke-virtual {v0, v1, v2, v3}, Lmd4;->s(Lad4;ILks2;)V

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :pswitch_0
    iget-object v0, p0, Lsz2;->g:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v0, Lrd4;

    .line 54
    .line 55
    iget-object v1, p0, Lsz2;->h:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v1, Landroid/media/metrics/PlaybackErrorEvent;

    .line 58
    .line 59
    iget-object v0, v0, Lrd4;->i:Landroid/media/metrics/PlaybackSession;

    .line 60
    .line 61
    invoke-static {v0, v1}, Lqd4;->u(Landroid/media/metrics/PlaybackSession;Landroid/media/metrics/PlaybackErrorEvent;)V

    .line 62
    .line 63
    .line 64
    return-void

    .line 65
    :pswitch_1
    iget-object v0, p0, Lsz2;->g:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v0, Lrd4;

    .line 68
    .line 69
    iget-object v1, p0, Lsz2;->h:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v1, Landroid/media/metrics/PlaybackMetrics;

    .line 72
    .line 73
    iget-object v0, v0, Lrd4;->i:Landroid/media/metrics/PlaybackSession;

    .line 74
    .line 75
    invoke-static {v0, v1}, Lqd4;->v(Landroid/media/metrics/PlaybackSession;Landroid/media/metrics/PlaybackMetrics;)V

    .line 76
    .line 77
    .line 78
    return-void

    .line 79
    :pswitch_2
    iget-object v0, p0, Lsz2;->g:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast v0, Lrd4;

    .line 82
    .line 83
    iget-object v1, p0, Lsz2;->h:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast v1, Landroid/media/metrics/TrackChangeEvent;

    .line 86
    .line 87
    iget-object v0, v0, Lrd4;->i:Landroid/media/metrics/PlaybackSession;

    .line 88
    .line 89
    invoke-static {v0, v1}, Lqd4;->x(Landroid/media/metrics/PlaybackSession;Landroid/media/metrics/TrackChangeEvent;)V

    .line 90
    .line 91
    .line 92
    return-void

    .line 93
    :pswitch_3
    iget-object v0, p0, Lsz2;->g:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast v0, Lrd4;

    .line 96
    .line 97
    iget-object v1, p0, Lsz2;->h:Ljava/lang/Object;

    .line 98
    .line 99
    check-cast v1, Landroid/media/metrics/PlaybackStateEvent;

    .line 100
    .line 101
    iget-object v0, v0, Lrd4;->i:Landroid/media/metrics/PlaybackSession;

    .line 102
    .line 103
    invoke-static {v0, v1}, Lqd4;->w(Landroid/media/metrics/PlaybackSession;Landroid/media/metrics/PlaybackStateEvent;)V

    .line 104
    .line 105
    .line 106
    return-void

    .line 107
    :pswitch_4
    iget-object v0, p0, Lsz2;->g:Ljava/lang/Object;

    .line 108
    .line 109
    check-cast v0, Lrd4;

    .line 110
    .line 111
    iget-object v1, p0, Lsz2;->h:Ljava/lang/Object;

    .line 112
    .line 113
    check-cast v1, Landroid/media/metrics/NetworkEvent;

    .line 114
    .line 115
    iget-object v0, v0, Lrd4;->i:Landroid/media/metrics/PlaybackSession;

    .line 116
    .line 117
    invoke-static {v0, v1}, Lqd4;->t(Landroid/media/metrics/PlaybackSession;Landroid/media/metrics/NetworkEvent;)V

    .line 118
    .line 119
    .line 120
    return-void

    .line 121
    :pswitch_5
    invoke-direct {p0}, Lsz2;->f()V

    .line 122
    .line 123
    .line 124
    return-void

    .line 125
    :pswitch_6
    iget-object v0, p0, Lsz2;->g:Ljava/lang/Object;

    .line 126
    .line 127
    check-cast v0, Lgc2;

    .line 128
    .line 129
    iget-object v0, v0, Lgc2;->j:Ljava/lang/Object;

    .line 130
    .line 131
    check-cast v0, Ljh1;

    .line 132
    .line 133
    iget-object v0, v0, Ljh1;->g:Landroid/app/Activity;

    .line 134
    .line 135
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    iget-object v1, p0, Lsz2;->h:Ljava/lang/Object;

    .line 140
    .line 141
    check-cast v1, Landroid/graphics/drawable/BitmapDrawable;

    .line 142
    .line 143
    invoke-virtual {v0, v1}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 144
    .line 145
    .line 146
    return-void

    .line 147
    :pswitch_7
    invoke-direct {p0}, Lsz2;->e()V

    .line 148
    .line 149
    .line 150
    return-void

    .line 151
    :pswitch_8
    iget-object v0, p0, Lsz2;->g:Ljava/lang/Object;

    .line 152
    .line 153
    move-object v3, v0

    .line 154
    check-cast v3, Lya4;

    .line 155
    .line 156
    iget-object v0, p0, Lsz2;->h:Ljava/lang/Object;

    .line 157
    .line 158
    check-cast v0, Lr60;

    .line 159
    .line 160
    iget v4, v3, Lya4;->J:I

    .line 161
    .line 162
    iget v5, v0, Lr60;->b:I

    .line 163
    .line 164
    sub-int/2addr v4, v5

    .line 165
    iput v4, v3, Lya4;->J:I

    .line 166
    .line 167
    iget-boolean v5, v0, Lr60;->d:Z

    .line 168
    .line 169
    if-eqz v5, :cond_0

    .line 170
    .line 171
    iget v5, v0, Lr60;->e:I

    .line 172
    .line 173
    iput v5, v3, Lya4;->K:I

    .line 174
    .line 175
    iput-boolean v1, v3, Lya4;->L:Z

    .line 176
    .line 177
    :cond_0
    if-nez v4, :cond_a

    .line 178
    .line 179
    iget-object v4, v0, Lr60;->f:Ljava/lang/Object;

    .line 180
    .line 181
    check-cast v4, Ldc4;

    .line 182
    .line 183
    iget-object v4, v4, Ldc4;->a:Loz1;

    .line 184
    .line 185
    iget-object v5, v3, Lya4;->c0:Ldc4;

    .line 186
    .line 187
    iget-object v5, v5, Ldc4;->a:Loz1;

    .line 188
    .line 189
    invoke-virtual {v5}, Loz1;->g()Z

    .line 190
    .line 191
    .line 192
    move-result v5

    .line 193
    if-nez v5, :cond_1

    .line 194
    .line 195
    invoke-virtual {v4}, Loz1;->g()Z

    .line 196
    .line 197
    .line 198
    move-result v5

    .line 199
    if-eqz v5, :cond_1

    .line 200
    .line 201
    const/4 v5, -0x1

    .line 202
    iput v5, v3, Lya4;->d0:I

    .line 203
    .line 204
    const-wide/16 v5, 0x0

    .line 205
    .line 206
    iput-wide v5, v3, Lya4;->e0:J

    .line 207
    .line 208
    :cond_1
    invoke-virtual {v4}, Loz1;->g()Z

    .line 209
    .line 210
    .line 211
    move-result v5

    .line 212
    if-nez v5, :cond_3

    .line 213
    .line 214
    move-object v5, v4

    .line 215
    check-cast v5, Lic4;

    .line 216
    .line 217
    iget-object v5, v5, Lic4;->h:[Loz1;

    .line 218
    .line 219
    invoke-static {v5}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 220
    .line 221
    .line 222
    move-result-object v5

    .line 223
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 224
    .line 225
    .line 226
    move-result v6

    .line 227
    iget-object v7, v3, Lya4;->w:Ljava/util/ArrayList;

    .line 228
    .line 229
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 230
    .line 231
    .line 232
    move-result v8

    .line 233
    if-ne v6, v8, :cond_2

    .line 234
    .line 235
    move v6, v1

    .line 236
    goto :goto_0

    .line 237
    :cond_2
    move v6, v2

    .line 238
    :goto_0
    invoke-static {v6}, Lzt0;->b0(Z)V

    .line 239
    .line 240
    .line 241
    move v6, v2

    .line 242
    :goto_1
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 243
    .line 244
    .line 245
    move-result v8

    .line 246
    if-ge v6, v8, :cond_3

    .line 247
    .line 248
    invoke-virtual {v7, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 249
    .line 250
    .line 251
    move-result-object v8

    .line 252
    check-cast v8, Lxa4;

    .line 253
    .line 254
    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 255
    .line 256
    .line 257
    move-result-object v9

    .line 258
    check-cast v9, Loz1;

    .line 259
    .line 260
    iput-object v9, v8, Lxa4;->b:Loz1;

    .line 261
    .line 262
    add-int/lit8 v6, v6, 0x1

    .line 263
    .line 264
    goto :goto_1

    .line 265
    :cond_3
    iget-boolean v5, v3, Lya4;->L:Z

    .line 266
    .line 267
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    if-eqz v5, :cond_9

    .line 273
    .line 274
    iget-object v5, v0, Lr60;->f:Ljava/lang/Object;

    .line 275
    .line 276
    check-cast v5, Ldc4;

    .line 277
    .line 278
    iget-object v5, v5, Ldc4;->b:Lkh4;

    .line 279
    .line 280
    iget-object v8, v3, Lya4;->c0:Ldc4;

    .line 281
    .line 282
    iget-object v8, v8, Ldc4;->b:Lkh4;

    .line 283
    .line 284
    invoke-virtual {v5, v8}, Lkh4;->equals(Ljava/lang/Object;)Z

    .line 285
    .line 286
    .line 287
    move-result v5

    .line 288
    if-eqz v5, :cond_5

    .line 289
    .line 290
    iget-object v5, v0, Lr60;->f:Ljava/lang/Object;

    .line 291
    .line 292
    check-cast v5, Ldc4;

    .line 293
    .line 294
    iget-wide v8, v5, Ldc4;->d:J

    .line 295
    .line 296
    iget-object v5, v3, Lya4;->c0:Ldc4;

    .line 297
    .line 298
    iget-wide v10, v5, Ldc4;->r:J

    .line 299
    .line 300
    cmp-long v5, v8, v10

    .line 301
    .line 302
    if-eqz v5, :cond_4

    .line 303
    .line 304
    goto :goto_2

    .line 305
    :cond_4
    move v1, v2

    .line 306
    :cond_5
    :goto_2
    if-eqz v1, :cond_8

    .line 307
    .line 308
    invoke-virtual {v4}, Loz1;->g()Z

    .line 309
    .line 310
    .line 311
    move-result v5

    .line 312
    if-nez v5, :cond_7

    .line 313
    .line 314
    iget-object v5, v0, Lr60;->f:Ljava/lang/Object;

    .line 315
    .line 316
    check-cast v5, Ldc4;

    .line 317
    .line 318
    iget-object v5, v5, Ldc4;->b:Lkh4;

    .line 319
    .line 320
    invoke-virtual {v5}, Lkh4;->b()Z

    .line 321
    .line 322
    .line 323
    move-result v5

    .line 324
    if-eqz v5, :cond_6

    .line 325
    .line 326
    goto :goto_3

    .line 327
    :cond_6
    iget-object v5, v0, Lr60;->f:Ljava/lang/Object;

    .line 328
    .line 329
    check-cast v5, Ldc4;

    .line 330
    .line 331
    iget-object v6, v5, Ldc4;->b:Lkh4;

    .line 332
    .line 333
    iget-wide v7, v5, Ldc4;->d:J

    .line 334
    .line 335
    iget-object v5, v6, Lkh4;->a:Ljava/lang/Object;

    .line 336
    .line 337
    iget-object v6, v3, Lya4;->v:Lsw1;

    .line 338
    .line 339
    invoke-virtual {v4, v5, v6}, Loz1;->o(Ljava/lang/Object;Lsw1;)Lsw1;

    .line 340
    .line 341
    .line 342
    move-wide v6, v7

    .line 343
    goto :goto_4

    .line 344
    :cond_7
    :goto_3
    iget-object v4, v0, Lr60;->f:Ljava/lang/Object;

    .line 345
    .line 346
    check-cast v4, Ldc4;

    .line 347
    .line 348
    iget-wide v4, v4, Ldc4;->d:J

    .line 349
    .line 350
    move-wide v6, v4

    .line 351
    :cond_8
    :goto_4
    move-wide v8, v6

    .line 352
    move v6, v1

    .line 353
    goto :goto_5

    .line 354
    :cond_9
    move-wide v8, v6

    .line 355
    move v6, v2

    .line 356
    :goto_5
    iput-boolean v2, v3, Lya4;->L:Z

    .line 357
    .line 358
    iget-object v0, v0, Lr60;->f:Ljava/lang/Object;

    .line 359
    .line 360
    move-object v4, v0

    .line 361
    check-cast v4, Ldc4;

    .line 362
    .line 363
    iget v7, v3, Lya4;->K:I

    .line 364
    .line 365
    const/4 v10, -0x1

    .line 366
    const/4 v5, 0x1

    .line 367
    invoke-virtual/range {v3 .. v10}, Lya4;->c2(Ldc4;IZIJI)V

    .line 368
    .line 369
    .line 370
    :cond_a
    return-void

    .line 371
    :pswitch_9
    invoke-direct {p0}, Lsz2;->d()V

    .line 372
    .line 373
    .line 374
    return-void

    .line 375
    :pswitch_a
    invoke-direct {p0}, Lsz2;->c()V

    .line 376
    .line 377
    .line 378
    return-void

    .line 379
    :pswitch_b
    const-string v0, "app_set_id_storage"

    .line 380
    .line 381
    iget-object v3, p0, Lsz2;->g:Ljava/lang/Object;

    .line 382
    .line 383
    check-cast v3, Lxb4;

    .line 384
    .line 385
    iget-object v4, p0, Lsz2;->h:Ljava/lang/Object;

    .line 386
    .line 387
    check-cast v4, Lk01;

    .line 388
    .line 389
    iget-object v4, v4, Lk01;->a:Lgi4;

    .line 390
    .line 391
    const-string v5, "AppSet"

    .line 392
    .line 393
    iget-object v3, v3, Lxb4;->g:Ljava/lang/Object;

    .line 394
    .line 395
    check-cast v3, Landroid/content/Context;

    .line 396
    .line 397
    invoke-static {v3}, Lxb4;->I(Landroid/content/Context;)Landroid/content/SharedPreferences;

    .line 398
    .line 399
    .line 400
    move-result-object v6

    .line 401
    const-string v7, "app_set_id"

    .line 402
    .line 403
    const/4 v8, 0x0

    .line 404
    invoke-interface {v6, v7, v8}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 405
    .line 406
    .line 407
    move-result-object v6

    .line 408
    invoke-static {v3}, Lxb4;->I(Landroid/content/Context;)Landroid/content/SharedPreferences;

    .line 409
    .line 410
    .line 411
    move-result-object v8

    .line 412
    const-string v9, "app_set_id_last_used_time"

    .line 413
    .line 414
    const-wide/16 v10, -0x1

    .line 415
    .line 416
    invoke-interface {v8, v9, v10, v11}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    .line 417
    .line 418
    .line 419
    move-result-wide v8

    .line 420
    cmp-long v12, v8, v10

    .line 421
    .line 422
    if-eqz v12, :cond_b

    .line 423
    .line 424
    const-wide v10, 0x7d8702800L

    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    add-long/2addr v10, v8

    .line 430
    :cond_b
    if-eqz v6, :cond_d

    .line 431
    .line 432
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 433
    .line 434
    .line 435
    move-result-wide v8

    .line 436
    cmp-long v8, v8, v10

    .line 437
    .line 438
    if-lez v8, :cond_c

    .line 439
    .line 440
    goto :goto_6

    .line 441
    :cond_c
    :try_start_0
    invoke-static {v3}, Lxb4;->K(Landroid/content/Context;)V
    :try_end_0
    .catch Lfb4; {:try_start_0 .. :try_end_0} :catch_0

    .line 442
    .line 443
    .line 444
    goto/16 :goto_9

    .line 445
    .line 446
    :catch_0
    move-exception v0

    .line 447
    invoke-virtual {v4, v0}, Lgi4;->d(Ljava/lang/Exception;)V

    .line 448
    .line 449
    .line 450
    goto/16 :goto_b

    .line 451
    .line 452
    :cond_d
    :goto_6
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 453
    .line 454
    .line 455
    move-result-object v6

    .line 456
    invoke-virtual {v6}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 457
    .line 458
    .line 459
    move-result-object v6

    .line 460
    :try_start_1
    invoke-virtual {v3, v0, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 461
    .line 462
    .line 463
    move-result-object v8

    .line 464
    invoke-interface {v8}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 465
    .line 466
    .line 467
    move-result-object v8

    .line 468
    invoke-interface {v8, v7, v6}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 469
    .line 470
    .line 471
    move-result-object v7

    .line 472
    invoke-interface {v7}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 473
    .line 474
    .line 475
    move-result v7

    .line 476
    if-nez v7, :cond_f

    .line 477
    .line 478
    const-string v0, "Failed to store app set ID generated for App "

    .line 479
    .line 480
    invoke-virtual {v3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 481
    .line 482
    .line 483
    move-result-object v1

    .line 484
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 485
    .line 486
    .line 487
    move-result-object v1

    .line 488
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 489
    .line 490
    .line 491
    move-result v2

    .line 492
    if-eqz v2, :cond_e

    .line 493
    .line 494
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 495
    .line 496
    .line 497
    move-result-object v0

    .line 498
    goto :goto_7

    .line 499
    :catch_1
    move-exception v0

    .line 500
    goto :goto_a

    .line 501
    :cond_e
    new-instance v1, Ljava/lang/String;

    .line 502
    .line 503
    invoke-direct {v1, v0}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    .line 504
    .line 505
    .line 506
    move-object v0, v1

    .line 507
    :goto_7
    invoke-static {v5, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 508
    .line 509
    .line 510
    new-instance v0, Lfb4;

    .line 511
    .line 512
    const-string v1, "Failed to store the app set ID."

    .line 513
    .line 514
    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 515
    .line 516
    .line 517
    throw v0

    .line 518
    :cond_f
    invoke-static {v3}, Lxb4;->K(Landroid/content/Context;)V

    .line 519
    .line 520
    .line 521
    invoke-virtual {v3, v0, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 522
    .line 523
    .line 524
    move-result-object v0

    .line 525
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 526
    .line 527
    .line 528
    move-result-wide v7

    .line 529
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 530
    .line 531
    .line 532
    move-result-object v0

    .line 533
    const-string v2, "app_set_id_creation_time"

    .line 534
    .line 535
    invoke-interface {v0, v2, v7, v8}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 536
    .line 537
    .line 538
    move-result-object v0

    .line 539
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 540
    .line 541
    .line 542
    move-result v0

    .line 543
    if-nez v0, :cond_11

    .line 544
    .line 545
    const-string v0, "Failed to store app set ID creation time for App "

    .line 546
    .line 547
    invoke-virtual {v3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 548
    .line 549
    .line 550
    move-result-object v1

    .line 551
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 552
    .line 553
    .line 554
    move-result-object v1

    .line 555
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 556
    .line 557
    .line 558
    move-result v2

    .line 559
    if-eqz v2, :cond_10

    .line 560
    .line 561
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 562
    .line 563
    .line 564
    move-result-object v0

    .line 565
    goto :goto_8

    .line 566
    :cond_10
    new-instance v1, Ljava/lang/String;

    .line 567
    .line 568
    invoke-direct {v1, v0}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    .line 569
    .line 570
    .line 571
    move-object v0, v1

    .line 572
    :goto_8
    invoke-static {v5, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 573
    .line 574
    .line 575
    new-instance v0, Lfb4;

    .line 576
    .line 577
    const-string v1, "Failed to store the app set ID creation time."

    .line 578
    .line 579
    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 580
    .line 581
    .line 582
    throw v0
    :try_end_1
    .catch Lfb4; {:try_start_1 .. :try_end_1} :catch_1

    .line 583
    :cond_11
    :goto_9
    new-instance v0, Lh8;

    .line 584
    .line 585
    invoke-direct {v0, v6, v1}, Lh8;-><init>(Ljava/lang/String;I)V

    .line 586
    .line 587
    .line 588
    invoke-virtual {v4, v0}, Lgi4;->e(Ljava/lang/Object;)V

    .line 589
    .line 590
    .line 591
    goto :goto_b

    .line 592
    :goto_a
    invoke-virtual {v4, v0}, Lgi4;->d(Ljava/lang/Exception;)V

    .line 593
    .line 594
    .line 595
    :goto_b
    return-void

    .line 596
    :pswitch_c
    iget-object v0, p0, Lsz2;->g:Ljava/lang/Object;

    .line 597
    .line 598
    check-cast v0, Ltp3;

    .line 599
    .line 600
    iget-object v1, p0, Lsz2;->h:Ljava/lang/Object;

    .line 601
    .line 602
    check-cast v1, Ltm3;

    .line 603
    .line 604
    invoke-virtual {v0, v1}, Ltp3;->u(Ltm3;)V

    .line 605
    .line 606
    .line 607
    return-void

    .line 608
    :pswitch_d
    invoke-direct {p0}, Lsz2;->b()V

    .line 609
    .line 610
    .line 611
    return-void

    .line 612
    :pswitch_e
    iget-object v0, p0, Lsz2;->g:Ljava/lang/Object;

    .line 613
    .line 614
    check-cast v0, Landroid/content/Context;

    .line 615
    .line 616
    const-string v1, "GLAS"

    .line 617
    .line 618
    iget-object v2, p0, Lsz2;->h:Ljava/lang/Object;

    .line 619
    .line 620
    check-cast v2, Lk01;

    .line 621
    .line 622
    invoke-static {v0, v1}, Lhe3;->a(Landroid/content/Context;Ljava/lang/String;)Lhe3;

    .line 623
    .line 624
    .line 625
    move-result-object v0

    .line 626
    iget-object v1, v2, Lk01;->a:Lgi4;

    .line 627
    .line 628
    invoke-virtual {v1, v0}, Lgi4;->e(Ljava/lang/Object;)V

    .line 629
    .line 630
    .line 631
    return-void

    .line 632
    :pswitch_f
    iget-object v0, p0, Lsz2;->g:Ljava/lang/Object;

    .line 633
    .line 634
    check-cast v0, Landroid/webkit/WebView;

    .line 635
    .line 636
    iget-object v1, p0, Lsz2;->h:Ljava/lang/Object;

    .line 637
    .line 638
    check-cast v1, Ljava/lang/String;

    .line 639
    .line 640
    invoke-static {v0, v1}, Lfr;->t(Landroid/webkit/WebView;Ljava/lang/String;)V

    .line 641
    .line 642
    .line 643
    return-void

    .line 644
    :pswitch_10
    invoke-direct {p0}, Lsz2;->a()V

    .line 645
    .line 646
    .line 647
    return-void

    .line 648
    :pswitch_11
    iget-object v0, p0, Lsz2;->h:Ljava/lang/Object;

    .line 649
    .line 650
    move-object v2, v0

    .line 651
    check-cast v2, Ljb3;

    .line 652
    .line 653
    iget-object v0, p0, Lsz2;->g:Ljava/lang/Object;

    .line 654
    .line 655
    check-cast v0, Ltx2;

    .line 656
    .line 657
    monitor-enter v2

    .line 658
    :try_start_2
    iget-object v3, v2, Ljb3;->g:Lod2;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 659
    .line 660
    if-eqz v3, :cond_12

    .line 661
    .line 662
    :try_start_3
    iget-object v4, v2, Ljb3;->e:Lae3;

    .line 663
    .line 664
    invoke-virtual {v3}, Lsb1;->U()Landroid/os/Parcel;

    .line 665
    .line 666
    .line 667
    move-result-object v5

    .line 668
    invoke-static {v5, v4}, Liv1;->c(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    .line 669
    .line 670
    .line 671
    invoke-virtual {v3, v5, v1}, Lsb1;->M0(Landroid/os/Parcel;I)V
    :try_end_3
    .catch Landroid/os/RemoteException; {:try_start_3 .. :try_end_3} :catch_2
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 672
    .line 673
    .line 674
    goto :goto_c

    .line 675
    :catchall_0
    move-exception v0

    .line 676
    goto :goto_e

    .line 677
    :catch_2
    :try_start_4
    const-string v3, "Failed to call onAdsAvailable"

    .line 678
    .line 679
    invoke-static {v3}, Lgi2;->i0(Ljava/lang/String;)V

    .line 680
    .line 681
    .line 682
    :cond_12
    :goto_c
    iget-object v3, v2, Ljb3;->h:Lbf2;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 683
    .line 684
    if-eqz v3, :cond_13

    .line 685
    .line 686
    :try_start_5
    iget-object v4, v2, Ljb3;->k:Ljava/lang/String;

    .line 687
    .line 688
    invoke-virtual {v3}, Lsb1;->U()Landroid/os/Parcel;

    .line 689
    .line 690
    .line 691
    move-result-object v5

    .line 692
    invoke-virtual {v5, v4}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 693
    .line 694
    .line 695
    invoke-static {v5, v0}, Liv1;->e(Landroid/os/Parcel;Landroid/os/IInterface;)V

    .line 696
    .line 697
    .line 698
    invoke-virtual {v3, v5, v1}, Lsb1;->M0(Landroid/os/Parcel;I)V
    :try_end_5
    .catch Landroid/os/RemoteException; {:try_start_5 .. :try_end_5} :catch_3
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 699
    .line 700
    .line 701
    :cond_13
    monitor-exit v2

    .line 702
    goto :goto_d

    .line 703
    :catch_3
    :try_start_6
    const-string v0, "Failed to call onAdPreloaded"

    .line 704
    .line 705
    invoke-static {v0}, Lgi2;->i0(Ljava/lang/String;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 706
    .line 707
    .line 708
    monitor-exit v2

    .line 709
    :goto_d
    return-void

    .line 710
    :goto_e
    :try_start_7
    monitor-exit v2
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 711
    throw v0

    .line 712
    :pswitch_12
    iget-object v0, p0, Lsz2;->g:Ljava/lang/Object;

    .line 713
    .line 714
    move-object v3, v0

    .line 715
    check-cast v3, Lea3;

    .line 716
    .line 717
    iget-object v0, p0, Lsz2;->h:Ljava/lang/Object;

    .line 718
    .line 719
    move-object v9, v0

    .line 720
    check-cast v9, Lca3;

    .line 721
    .line 722
    sget-object v10, Lea3;->q:Ljava/lang/Object;

    .line 723
    .line 724
    monitor-enter v10

    .line 725
    :try_start_8
    iget-boolean v0, v3, Lea3;->n:Z

    .line 726
    .line 727
    if-eqz v0, :cond_14

    .line 728
    .line 729
    monitor-exit v10

    .line 730
    goto/16 :goto_13

    .line 731
    .line 732
    :catchall_1
    move-exception v0

    .line 733
    goto/16 :goto_18

    .line 734
    .line 735
    :cond_14
    iput-boolean v1, v3, Lea3;->n:Z

    .line 736
    .line 737
    invoke-static {}, Lea3;->a()Z

    .line 738
    .line 739
    .line 740
    move-result v0

    .line 741
    if-nez v0, :cond_15

    .line 742
    .line 743
    monitor-exit v10
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    .line 744
    goto/16 :goto_13

    .line 745
    .line 746
    :cond_15
    :try_start_9
    sget-object v0, Lhg4;->C:Lhg4;

    .line 747
    .line 748
    iget-object v0, v0, Lhg4;->c:Llf4;

    .line 749
    .line 750
    iget-object v0, v3, Lea3;->f:Landroid/content/Context;

    .line 751
    .line 752
    invoke-static {v0}, Llf4;->M(Landroid/content/Context;)Ljava/lang/String;

    .line 753
    .line 754
    .line 755
    move-result-object v0

    .line 756
    iput-object v0, v3, Lea3;->i:Ljava/lang/String;
    :try_end_9
    .catch Ljava/lang/RuntimeException; {:try_start_9 .. :try_end_9} :catch_5
    .catch Landroid/os/RemoteException; {:try_start_9 .. :try_end_9} :catch_4
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    .line 757
    .line 758
    goto :goto_10

    .line 759
    :catch_4
    move-exception v0

    .line 760
    goto :goto_f

    .line 761
    :catch_5
    move-exception v0

    .line 762
    :goto_f
    :try_start_a
    sget-object v2, Lhg4;->C:Lhg4;

    .line 763
    .line 764
    iget-object v2, v2, Lhg4;->h:Lgd2;

    .line 765
    .line 766
    const-string v4, "CuiMonitor.gettingAppIdFromManifest"

    .line 767
    .line 768
    invoke-virtual {v2, v4, v0}, Lgd2;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 769
    .line 770
    .line 771
    :goto_10
    sget-object v0, Lgz;->b:Lgz;

    .line 772
    .line 773
    iget-object v2, v3, Lea3;->f:Landroid/content/Context;

    .line 774
    .line 775
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 776
    .line 777
    .line 778
    invoke-static {v2}, Lgz;->a(Landroid/content/Context;)I

    .line 779
    .line 780
    .line 781
    move-result v0

    .line 782
    iput v0, v3, Lea3;->j:I

    .line 783
    .line 784
    sget-object v0, Lmz1;->t9:Liz1;

    .line 785
    .line 786
    sget-object v11, Ltw1;->e:Ltw1;

    .line 787
    .line 788
    iget-object v2, v11, Ltw1;->c:Lkz1;

    .line 789
    .line 790
    invoke-virtual {v2, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 791
    .line 792
    .line 793
    move-result-object v0

    .line 794
    check-cast v0, Ljava/lang/Integer;

    .line 795
    .line 796
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 797
    .line 798
    .line 799
    move-result v0

    .line 800
    sget-object v2, Lmz1;->Gc:Liz1;

    .line 801
    .line 802
    iget-object v4, v11, Ltw1;->c:Lkz1;

    .line 803
    .line 804
    invoke-virtual {v4, v2}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 805
    .line 806
    .line 807
    move-result-object v2

    .line 808
    check-cast v2, Ljava/lang/Boolean;

    .line 809
    .line 810
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 811
    .line 812
    .line 813
    move-result v2

    .line 814
    if-eqz v2, :cond_16

    .line 815
    .line 816
    sget-object v2, Lmd2;->d:Lkd2;

    .line 817
    .line 818
    int-to-long v4, v0

    .line 819
    sget-object v8, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 820
    .line 821
    move-wide v6, v4

    .line 822
    invoke-virtual/range {v2 .. v8}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->scheduleWithFixedDelay(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 823
    .line 824
    .line 825
    goto :goto_11

    .line 826
    :cond_16
    sget-object v2, Lmd2;->d:Lkd2;

    .line 827
    .line 828
    int-to-long v4, v0

    .line 829
    sget-object v8, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 830
    .line 831
    move-wide v6, v4

    .line 832
    invoke-virtual/range {v2 .. v8}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->scheduleAtFixedRate(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 833
    .line 834
    .line 835
    :goto_11
    sget-object v0, Lmz1;->z9:Liz1;

    .line 836
    .line 837
    iget-object v2, v11, Ltw1;->c:Lkz1;

    .line 838
    .line 839
    invoke-virtual {v2, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 840
    .line 841
    .line 842
    move-result-object v2

    .line 843
    check-cast v2, Ljava/lang/Boolean;

    .line 844
    .line 845
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 846
    .line 847
    .line 848
    move-result v2

    .line 849
    if-eqz v2, :cond_18

    .line 850
    .line 851
    iget-object v2, v3, Lea3;->m:Lch2;

    .line 852
    .line 853
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 854
    .line 855
    .line 856
    iget-object v4, v11, Ltw1;->c:Lkz1;

    .line 857
    .line 858
    invoke-virtual {v4, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 859
    .line 860
    .line 861
    move-result-object v0

    .line 862
    check-cast v0, Ljava/lang/Boolean;

    .line 863
    .line 864
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 865
    .line 866
    .line 867
    move-result v0

    .line 868
    if-nez v0, :cond_17

    .line 869
    .line 870
    goto :goto_12

    .line 871
    :cond_17
    iget-object v0, v2, Lch2;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 872
    .line 873
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    .line 874
    .line 875
    .line 876
    move-result v0

    .line 877
    if-nez v0, :cond_18

    .line 878
    .line 879
    invoke-virtual {v2}, Lch2;->a()V

    .line 880
    .line 881
    .line 882
    :cond_18
    :goto_12
    monitor-exit v10
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_1

    .line 883
    :goto_13
    invoke-static {}, Lea3;->a()Z

    .line 884
    .line 885
    .line 886
    move-result v0

    .line 887
    if-nez v0, :cond_19

    .line 888
    .line 889
    goto/16 :goto_17

    .line 890
    .line 891
    :cond_19
    if-eqz v9, :cond_20

    .line 892
    .line 893
    sget-object v1, Lea3;->p:Ljava/lang/Object;

    .line 894
    .line 895
    monitor-enter v1

    .line 896
    :try_start_b
    iget-object v0, v3, Lea3;->h:Lha3;

    .line 897
    .line 898
    iget-object v2, v0, Ln54;->g:Lp54;

    .line 899
    .line 900
    check-cast v2, Lka3;

    .line 901
    .line 902
    invoke-virtual {v2}, Lka3;->A()I

    .line 903
    .line 904
    .line 905
    move-result v2

    .line 906
    sget-object v4, Lmz1;->u9:Liz1;

    .line 907
    .line 908
    sget-object v5, Ltw1;->e:Ltw1;

    .line 909
    .line 910
    iget-object v6, v5, Ltw1;->c:Lkz1;

    .line 911
    .line 912
    invoke-virtual {v6, v4}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 913
    .line 914
    .line 915
    move-result-object v4

    .line 916
    check-cast v4, Ljava/lang/Integer;

    .line 917
    .line 918
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 919
    .line 920
    .line 921
    move-result v4

    .line 922
    if-lt v2, v4, :cond_1a

    .line 923
    .line 924
    monitor-exit v1

    .line 925
    goto/16 :goto_17

    .line 926
    .line 927
    :catchall_2
    move-exception v0

    .line 928
    goto/16 :goto_16

    .line 929
    .line 930
    :cond_1a
    invoke-static {}, Lga3;->C()Lfa3;

    .line 931
    .line 932
    .line 933
    move-result-object v2

    .line 934
    iget v4, v9, Lca3;->m:I

    .line 935
    .line 936
    invoke-virtual {v2}, Ln54;->b()V

    .line 937
    .line 938
    .line 939
    iget-object v6, v2, Ln54;->g:Lp54;

    .line 940
    .line 941
    check-cast v6, Lga3;

    .line 942
    .line 943
    invoke-virtual {v6, v4}, Lga3;->Y(I)V

    .line 944
    .line 945
    .line 946
    iget-boolean v4, v9, Lca3;->b:Z

    .line 947
    .line 948
    invoke-virtual {v2}, Ln54;->b()V

    .line 949
    .line 950
    .line 951
    iget-object v6, v2, Ln54;->g:Lp54;

    .line 952
    .line 953
    check-cast v6, Lga3;

    .line 954
    .line 955
    invoke-virtual {v6, v4}, Lga3;->D(Z)V

    .line 956
    .line 957
    .line 958
    iget-wide v6, v9, Lca3;->a:J

    .line 959
    .line 960
    invoke-virtual {v2}, Ln54;->b()V

    .line 961
    .line 962
    .line 963
    iget-object v4, v2, Ln54;->g:Lp54;

    .line 964
    .line 965
    check-cast v4, Lga3;

    .line 966
    .line 967
    invoke-virtual {v4, v6, v7}, Lga3;->E(J)V

    .line 968
    .line 969
    .line 970
    invoke-virtual {v2}, Ln54;->b()V

    .line 971
    .line 972
    .line 973
    iget-object v4, v2, Ln54;->g:Lp54;

    .line 974
    .line 975
    check-cast v4, Lga3;

    .line 976
    .line 977
    invoke-virtual {v4}, Lga3;->Z()V

    .line 978
    .line 979
    .line 980
    iget-object v4, v3, Lea3;->g:Le51;

    .line 981
    .line 982
    iget-object v4, v4, Le51;->f:Ljava/lang/String;

    .line 983
    .line 984
    invoke-virtual {v2}, Ln54;->b()V

    .line 985
    .line 986
    .line 987
    iget-object v6, v2, Ln54;->g:Lp54;

    .line 988
    .line 989
    check-cast v6, Lga3;

    .line 990
    .line 991
    invoke-virtual {v6, v4}, Lga3;->G(Ljava/lang/String;)V

    .line 992
    .line 993
    .line 994
    iget-object v4, v3, Lea3;->i:Ljava/lang/String;

    .line 995
    .line 996
    invoke-virtual {v2}, Ln54;->b()V

    .line 997
    .line 998
    .line 999
    iget-object v6, v2, Ln54;->g:Lp54;

    .line 1000
    .line 1001
    check-cast v6, Lga3;

    .line 1002
    .line 1003
    invoke-virtual {v6, v4}, Lga3;->H(Ljava/lang/String;)V

    .line 1004
    .line 1005
    .line 1006
    sget-object v4, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    .line 1007
    .line 1008
    invoke-virtual {v2}, Ln54;->b()V

    .line 1009
    .line 1010
    .line 1011
    iget-object v6, v2, Ln54;->g:Lp54;

    .line 1012
    .line 1013
    check-cast v6, Lga3;

    .line 1014
    .line 1015
    invoke-virtual {v6, v4}, Lga3;->I(Ljava/lang/String;)V

    .line 1016
    .line 1017
    .line 1018
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 1019
    .line 1020
    invoke-virtual {v2}, Ln54;->b()V

    .line 1021
    .line 1022
    .line 1023
    iget-object v6, v2, Ln54;->g:Lp54;

    .line 1024
    .line 1025
    check-cast v6, Lga3;

    .line 1026
    .line 1027
    invoke-virtual {v6, v4}, Lga3;->J(I)V

    .line 1028
    .line 1029
    .line 1030
    iget v4, v9, Lca3;->o:I

    .line 1031
    .line 1032
    invoke-virtual {v2}, Ln54;->b()V

    .line 1033
    .line 1034
    .line 1035
    iget-object v6, v2, Ln54;->g:Lp54;

    .line 1036
    .line 1037
    check-cast v6, Lga3;

    .line 1038
    .line 1039
    invoke-virtual {v6, v4}, Lga3;->A(I)V

    .line 1040
    .line 1041
    .line 1042
    iget v4, v9, Lca3;->c:I

    .line 1043
    .line 1044
    invoke-virtual {v2}, Ln54;->b()V

    .line 1045
    .line 1046
    .line 1047
    iget-object v6, v2, Ln54;->g:Lp54;

    .line 1048
    .line 1049
    check-cast v6, Lga3;

    .line 1050
    .line 1051
    invoke-virtual {v6, v4}, Lga3;->L(I)V

    .line 1052
    .line 1053
    .line 1054
    iget v4, v3, Lea3;->j:I

    .line 1055
    .line 1056
    int-to-long v6, v4

    .line 1057
    invoke-virtual {v2}, Ln54;->b()V

    .line 1058
    .line 1059
    .line 1060
    iget-object v4, v2, Ln54;->g:Lp54;

    .line 1061
    .line 1062
    check-cast v4, Lga3;

    .line 1063
    .line 1064
    invoke-virtual {v4, v6, v7}, Lga3;->M(J)V

    .line 1065
    .line 1066
    .line 1067
    iget v4, v9, Lca3;->n:I

    .line 1068
    .line 1069
    invoke-virtual {v2}, Ln54;->b()V

    .line 1070
    .line 1071
    .line 1072
    iget-object v6, v2, Ln54;->g:Lp54;

    .line 1073
    .line 1074
    check-cast v6, Lga3;

    .line 1075
    .line 1076
    invoke-virtual {v6, v4}, Lga3;->B(I)V

    .line 1077
    .line 1078
    .line 1079
    iget-object v4, v9, Lca3;->d:Ljava/lang/String;

    .line 1080
    .line 1081
    invoke-virtual {v2}, Ln54;->b()V

    .line 1082
    .line 1083
    .line 1084
    iget-object v6, v2, Ln54;->g:Lp54;

    .line 1085
    .line 1086
    check-cast v6, Lga3;

    .line 1087
    .line 1088
    invoke-virtual {v6, v4}, Lga3;->N(Ljava/lang/String;)V

    .line 1089
    .line 1090
    .line 1091
    iget-object v4, v9, Lca3;->e:Ljava/lang/String;

    .line 1092
    .line 1093
    invoke-virtual {v2}, Ln54;->b()V

    .line 1094
    .line 1095
    .line 1096
    iget-object v6, v2, Ln54;->g:Lp54;

    .line 1097
    .line 1098
    check-cast v6, Lga3;

    .line 1099
    .line 1100
    invoke-virtual {v6, v4}, Lga3;->O(Ljava/lang/String;)V

    .line 1101
    .line 1102
    .line 1103
    iget-object v4, v9, Lca3;->f:Ljava/lang/String;

    .line 1104
    .line 1105
    invoke-virtual {v2}, Ln54;->b()V

    .line 1106
    .line 1107
    .line 1108
    iget-object v6, v2, Ln54;->g:Lp54;

    .line 1109
    .line 1110
    check-cast v6, Lga3;

    .line 1111
    .line 1112
    invoke-virtual {v6, v4}, Lga3;->P(Ljava/lang/String;)V

    .line 1113
    .line 1114
    .line 1115
    iget-object v4, v3, Lea3;->k:Lxu2;

    .line 1116
    .line 1117
    iget-object v6, v9, Lca3;->f:Ljava/lang/String;

    .line 1118
    .line 1119
    invoke-virtual {v4, v6}, Lxu2;->b(Ljava/lang/String;)Lwu2;

    .line 1120
    .line 1121
    .line 1122
    move-result-object v4

    .line 1123
    if-eqz v4, :cond_1c

    .line 1124
    .line 1125
    iget-object v4, v4, Lwu2;->b:Li82;

    .line 1126
    .line 1127
    if-nez v4, :cond_1b

    .line 1128
    .line 1129
    goto :goto_14

    .line 1130
    :cond_1b
    invoke-virtual {v4}, Li82;->toString()Ljava/lang/String;

    .line 1131
    .line 1132
    .line 1133
    move-result-object v4

    .line 1134
    goto :goto_15

    .line 1135
    :cond_1c
    :goto_14
    const-string v4, ""

    .line 1136
    .line 1137
    :goto_15
    invoke-virtual {v2}, Ln54;->b()V

    .line 1138
    .line 1139
    .line 1140
    iget-object v6, v2, Ln54;->g:Lp54;

    .line 1141
    .line 1142
    check-cast v6, Lga3;

    .line 1143
    .line 1144
    invoke-virtual {v6, v4}, Lga3;->Q(Ljava/lang/String;)V

    .line 1145
    .line 1146
    .line 1147
    iget-object v4, v9, Lca3;->g:Ljava/lang/String;

    .line 1148
    .line 1149
    invoke-virtual {v2}, Ln54;->b()V

    .line 1150
    .line 1151
    .line 1152
    iget-object v6, v2, Ln54;->g:Lp54;

    .line 1153
    .line 1154
    check-cast v6, Lga3;

    .line 1155
    .line 1156
    invoke-virtual {v6, v4}, Lga3;->R(Ljava/lang/String;)V

    .line 1157
    .line 1158
    .line 1159
    iget v4, v9, Lca3;->h:I

    .line 1160
    .line 1161
    invoke-virtual {v2}, Ln54;->b()V

    .line 1162
    .line 1163
    .line 1164
    iget-object v6, v2, Ln54;->g:Lp54;

    .line 1165
    .line 1166
    check-cast v6, Lga3;

    .line 1167
    .line 1168
    invoke-virtual {v6, v4}, Lga3;->V(I)V

    .line 1169
    .line 1170
    .line 1171
    iget-object v4, v9, Lca3;->k:Ljava/lang/String;

    .line 1172
    .line 1173
    invoke-virtual {v2}, Ln54;->b()V

    .line 1174
    .line 1175
    .line 1176
    iget-object v6, v2, Ln54;->g:Lp54;

    .line 1177
    .line 1178
    check-cast v6, Lga3;

    .line 1179
    .line 1180
    invoke-virtual {v6, v4}, Lga3;->U(Ljava/lang/String;)V

    .line 1181
    .line 1182
    .line 1183
    iget-object v4, v9, Lca3;->i:Ljava/lang/String;

    .line 1184
    .line 1185
    invoke-virtual {v2}, Ln54;->b()V

    .line 1186
    .line 1187
    .line 1188
    iget-object v6, v2, Ln54;->g:Lp54;

    .line 1189
    .line 1190
    check-cast v6, Lga3;

    .line 1191
    .line 1192
    invoke-virtual {v6, v4}, Lga3;->S(Ljava/lang/String;)V

    .line 1193
    .line 1194
    .line 1195
    iget-object v4, v9, Lca3;->j:Ljava/lang/String;

    .line 1196
    .line 1197
    invoke-virtual {v2}, Ln54;->b()V

    .line 1198
    .line 1199
    .line 1200
    iget-object v6, v2, Ln54;->g:Lp54;

    .line 1201
    .line 1202
    check-cast v6, Lga3;

    .line 1203
    .line 1204
    invoke-virtual {v6, v4}, Lga3;->T(Ljava/lang/String;)V

    .line 1205
    .line 1206
    .line 1207
    iget-wide v6, v9, Lca3;->l:J

    .line 1208
    .line 1209
    invoke-virtual {v2}, Ln54;->b()V

    .line 1210
    .line 1211
    .line 1212
    iget-object v4, v2, Ln54;->g:Lp54;

    .line 1213
    .line 1214
    check-cast v4, Lga3;

    .line 1215
    .line 1216
    invoke-virtual {v4, v6, v7}, Lga3;->F(J)V

    .line 1217
    .line 1218
    .line 1219
    sget-object v4, Lmz1;->y9:Liz1;

    .line 1220
    .line 1221
    iget-object v6, v5, Ltw1;->c:Lkz1;

    .line 1222
    .line 1223
    invoke-virtual {v6, v4}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 1224
    .line 1225
    .line 1226
    move-result-object v4

    .line 1227
    check-cast v4, Ljava/lang/Boolean;

    .line 1228
    .line 1229
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1230
    .line 1231
    .line 1232
    move-result v4

    .line 1233
    if-eqz v4, :cond_1d

    .line 1234
    .line 1235
    iget-object v4, v3, Lea3;->l:Ljava/util/AbstractCollection;

    .line 1236
    .line 1237
    invoke-virtual {v2}, Ln54;->b()V

    .line 1238
    .line 1239
    .line 1240
    iget-object v6, v2, Ln54;->g:Lp54;

    .line 1241
    .line 1242
    check-cast v6, Lga3;

    .line 1243
    .line 1244
    invoke-virtual {v6, v4}, Lga3;->K(Ljava/util/AbstractCollection;)V

    .line 1245
    .line 1246
    .line 1247
    :cond_1d
    sget-object v4, Lmz1;->z9:Liz1;

    .line 1248
    .line 1249
    iget-object v5, v5, Ltw1;->c:Lkz1;

    .line 1250
    .line 1251
    invoke-virtual {v5, v4}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 1252
    .line 1253
    .line 1254
    move-result-object v4

    .line 1255
    check-cast v4, Ljava/lang/Boolean;

    .line 1256
    .line 1257
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1258
    .line 1259
    .line 1260
    move-result v4

    .line 1261
    if-eqz v4, :cond_1f

    .line 1262
    .line 1263
    iget-object v3, v3, Lea3;->m:Lch2;

    .line 1264
    .line 1265
    iget-object v4, v3, Lch2;->b:Lq74;

    .line 1266
    .line 1267
    iget-object v3, v3, Lch2;->a:Ljava/lang/String;

    .line 1268
    .line 1269
    if-eqz v4, :cond_1e

    .line 1270
    .line 1271
    invoke-virtual {v2}, Ln54;->b()V

    .line 1272
    .line 1273
    .line 1274
    iget-object v5, v2, Ln54;->g:Lp54;

    .line 1275
    .line 1276
    check-cast v5, Lga3;

    .line 1277
    .line 1278
    invoke-virtual {v5, v4}, Lga3;->W(Lq74;)V

    .line 1279
    .line 1280
    .line 1281
    :cond_1e
    if-eqz v3, :cond_1f

    .line 1282
    .line 1283
    invoke-virtual {v2}, Ln54;->b()V

    .line 1284
    .line 1285
    .line 1286
    iget-object v4, v2, Ln54;->g:Lp54;

    .line 1287
    .line 1288
    check-cast v4, Lga3;

    .line 1289
    .line 1290
    invoke-virtual {v4, v3}, Lga3;->X(Ljava/lang/String;)V

    .line 1291
    .line 1292
    .line 1293
    :cond_1f
    invoke-static {}, Lja3;->A()Lia3;

    .line 1294
    .line 1295
    .line 1296
    move-result-object v3

    .line 1297
    invoke-virtual {v3}, Ln54;->b()V

    .line 1298
    .line 1299
    .line 1300
    iget-object v4, v3, Ln54;->g:Lp54;

    .line 1301
    .line 1302
    check-cast v4, Lja3;

    .line 1303
    .line 1304
    invoke-virtual {v2}, Ln54;->d()Lp54;

    .line 1305
    .line 1306
    .line 1307
    move-result-object v2

    .line 1308
    check-cast v2, Lga3;

    .line 1309
    .line 1310
    invoke-virtual {v4, v2}, Lja3;->B(Lga3;)V

    .line 1311
    .line 1312
    .line 1313
    invoke-virtual {v0}, Ln54;->b()V

    .line 1314
    .line 1315
    .line 1316
    iget-object v0, v0, Ln54;->g:Lp54;

    .line 1317
    .line 1318
    check-cast v0, Lka3;

    .line 1319
    .line 1320
    invoke-virtual {v3}, Ln54;->d()Lp54;

    .line 1321
    .line 1322
    .line 1323
    move-result-object v2

    .line 1324
    check-cast v2, Lja3;

    .line 1325
    .line 1326
    invoke-virtual {v0, v2}, Lka3;->C(Lja3;)V

    .line 1327
    .line 1328
    .line 1329
    monitor-exit v1

    .line 1330
    goto :goto_17

    .line 1331
    :goto_16
    monitor-exit v1
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_2

    .line 1332
    throw v0

    .line 1333
    :cond_20
    :goto_17
    return-void

    .line 1334
    :goto_18
    :try_start_c
    monitor-exit v10
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_1

    .line 1335
    throw v0

    .line 1336
    :pswitch_13
    iget-object v0, p0, Lsz2;->g:Ljava/lang/Object;

    .line 1337
    .line 1338
    check-cast v0, Lbu1;

    .line 1339
    .line 1340
    iget-object v0, v0, Lbu1;->l:Ljava/lang/Object;

    .line 1341
    .line 1342
    check-cast v0, Lu93;

    .line 1343
    .line 1344
    iget-object v0, v0, Lu93;->c:Lt93;

    .line 1345
    .line 1346
    iget-object v1, p0, Lsz2;->h:Ljava/lang/Object;

    .line 1347
    .line 1348
    check-cast v1, Lq93;

    .line 1349
    .line 1350
    new-instance v2, Lz71;

    .line 1351
    .line 1352
    const/16 v3, 0x1d

    .line 1353
    .line 1354
    invoke-direct {v2, v3, v1}, Lz71;-><init>(ILjava/lang/Object;)V

    .line 1355
    .line 1356
    .line 1357
    invoke-virtual {v0, v2}, Lf74;->P1(Ldp2;)V

    .line 1358
    .line 1359
    .line 1360
    return-void

    .line 1361
    :pswitch_14
    iget-object v0, p0, Lsz2;->h:Ljava/lang/Object;

    .line 1362
    .line 1363
    check-cast v0, Landroid/os/ParcelFileDescriptor;

    .line 1364
    .line 1365
    iget-object v1, p0, Lsz2;->g:Ljava/lang/Object;

    .line 1366
    .line 1367
    check-cast v1, Ljava/io/InputStream;

    .line 1368
    .line 1369
    :try_start_d
    new-instance v3, Landroid/os/ParcelFileDescriptor$AutoCloseOutputStream;

    .line 1370
    .line 1371
    invoke-direct {v3, v0}, Landroid/os/ParcelFileDescriptor$AutoCloseOutputStream;-><init>(Landroid/os/ParcelFileDescriptor;)V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_3

    .line 1372
    .line 1373
    .line 1374
    :try_start_e
    invoke-static {v1, v3, v2}, Lg82;->e(Ljava/io/InputStream;Ljava/io/OutputStream;Z)J
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_4

    .line 1375
    .line 1376
    .line 1377
    :try_start_f
    invoke-virtual {v3}, Ljava/io/OutputStream;->close()V
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_3

    .line 1378
    .line 1379
    .line 1380
    :try_start_10
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_10
    .catch Ljava/io/IOException; {:try_start_10 .. :try_end_10} :catch_6

    .line 1381
    .line 1382
    .line 1383
    goto :goto_1c

    .line 1384
    :catchall_3
    move-exception v0

    .line 1385
    move-object v2, v0

    .line 1386
    goto :goto_1a

    .line 1387
    :catchall_4
    move-exception v0

    .line 1388
    move-object v2, v0

    .line 1389
    :try_start_11
    invoke-virtual {v3}, Ljava/io/OutputStream;->close()V
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_5

    .line 1390
    .line 1391
    .line 1392
    goto :goto_19

    .line 1393
    :catchall_5
    move-exception v0

    .line 1394
    :try_start_12
    invoke-virtual {v2, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 1395
    .line 1396
    .line 1397
    :goto_19
    throw v2
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_3

    .line 1398
    :goto_1a
    if-eqz v1, :cond_21

    .line 1399
    .line 1400
    :try_start_13
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_6

    .line 1401
    .line 1402
    .line 1403
    goto :goto_1b

    .line 1404
    :catchall_6
    move-exception v0

    .line 1405
    :try_start_14
    invoke-virtual {v2, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 1406
    .line 1407
    .line 1408
    :cond_21
    :goto_1b
    throw v2
    :try_end_14
    .catch Ljava/io/IOException; {:try_start_14 .. :try_end_14} :catch_6

    .line 1409
    :catch_6
    :goto_1c
    return-void

    .line 1410
    :pswitch_15
    iget-object v0, p0, Lsz2;->g:Ljava/lang/Object;

    .line 1411
    .line 1412
    check-cast v0, Lg4;

    .line 1413
    .line 1414
    iget-object v0, v0, Lg4;->k:Ljava/lang/Object;

    .line 1415
    .line 1416
    check-cast v0, Lv73;

    .line 1417
    .line 1418
    iget-object v0, v0, Lv73;->d:Ls73;

    .line 1419
    .line 1420
    iget-object v1, p0, Lsz2;->h:Ljava/lang/Object;

    .line 1421
    .line 1422
    check-cast v1, Lnx2;

    .line 1423
    .line 1424
    invoke-virtual {v0, v1}, Ls73;->d0(Lnx2;)V

    .line 1425
    .line 1426
    .line 1427
    return-void

    .line 1428
    :pswitch_16
    iget-object v0, p0, Lsz2;->g:Ljava/lang/Object;

    .line 1429
    .line 1430
    check-cast v0, Lz63;

    .line 1431
    .line 1432
    iget-object v1, p0, Lsz2;->h:Ljava/lang/Object;

    .line 1433
    .line 1434
    check-cast v1, Lnx2;

    .line 1435
    .line 1436
    iget-object v0, v0, Lz63;->d:Ls23;

    .line 1437
    .line 1438
    invoke-virtual {v0, v1}, Ls23;->d0(Lnx2;)V

    .line 1439
    .line 1440
    .line 1441
    return-void

    .line 1442
    :pswitch_17
    iget-object v0, p0, Lsz2;->g:Ljava/lang/Object;

    .line 1443
    .line 1444
    check-cast v0, Lg4;

    .line 1445
    .line 1446
    iget-object v0, v0, Lg4;->k:Ljava/lang/Object;

    .line 1447
    .line 1448
    check-cast v0, Lt63;

    .line 1449
    .line 1450
    iget-object v0, v0, Lt63;->d:Ls63;

    .line 1451
    .line 1452
    iget-object v1, p0, Lsz2;->h:Ljava/lang/Object;

    .line 1453
    .line 1454
    check-cast v1, Lnx2;

    .line 1455
    .line 1456
    invoke-virtual {v0, v1}, Ls63;->d0(Lnx2;)V

    .line 1457
    .line 1458
    .line 1459
    return-void

    .line 1460
    :pswitch_18
    iget-object v0, p0, Lsz2;->g:Ljava/lang/Object;

    .line 1461
    .line 1462
    check-cast v0, Lg4;

    .line 1463
    .line 1464
    iget-object v0, v0, Lg4;->k:Ljava/lang/Object;

    .line 1465
    .line 1466
    check-cast v0, Lbu1;

    .line 1467
    .line 1468
    iget-object v0, v0, Lbu1;->j:Ljava/lang/Object;

    .line 1469
    .line 1470
    check-cast v0, Lt83;

    .line 1471
    .line 1472
    iget-object v0, v0, Lt83;->i:Ljava/lang/Object;

    .line 1473
    .line 1474
    check-cast v0, Lx23;

    .line 1475
    .line 1476
    iget-object v1, p0, Lsz2;->h:Ljava/lang/Object;

    .line 1477
    .line 1478
    check-cast v1, Lnx2;

    .line 1479
    .line 1480
    invoke-virtual {v0, v1}, Lx23;->d0(Lnx2;)V

    .line 1481
    .line 1482
    .line 1483
    return-void

    .line 1484
    :pswitch_19
    iget-object v0, p0, Lsz2;->g:Ljava/lang/Object;

    .line 1485
    .line 1486
    check-cast v0, Le23;

    .line 1487
    .line 1488
    iget-object v1, p0, Lsz2;->h:Ljava/lang/Object;

    .line 1489
    .line 1490
    check-cast v1, Lu10;

    .line 1491
    .line 1492
    invoke-static {v1}, Loi0;->l1(Lu10;)Ljava/lang/Object;

    .line 1493
    .line 1494
    .line 1495
    move-result-object v1

    .line 1496
    check-cast v1, Landroid/view/View;

    .line 1497
    .line 1498
    iget-object v0, v0, Le23;->l:Lr9;

    .line 1499
    .line 1500
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1501
    .line 1502
    .line 1503
    return-void

    .line 1504
    :pswitch_1a
    iget-object v0, p0, Lsz2;->g:Ljava/lang/Object;

    .line 1505
    .line 1506
    check-cast v0, Lo03;

    .line 1507
    .line 1508
    iget-object v1, p0, Lsz2;->h:Ljava/lang/Object;

    .line 1509
    .line 1510
    check-cast v1, Lag2;

    .line 1511
    .line 1512
    invoke-interface {v1}, Lag2;->L0()V

    .line 1513
    .line 1514
    .line 1515
    iget-object v0, v0, Lo03;->d:Ll83;

    .line 1516
    .line 1517
    invoke-interface {v1}, Lag2;->f()Lqg2;

    .line 1518
    .line 1519
    .line 1520
    move-result-object v2

    .line 1521
    iget-object v0, v0, Ll83;->a:Lih3;

    .line 1522
    .line 1523
    if-eqz v0, :cond_22

    .line 1524
    .line 1525
    if-eqz v2, :cond_22

    .line 1526
    .line 1527
    invoke-virtual {v2, v0}, Lqg2;->C3(Lih3;)V

    .line 1528
    .line 1529
    .line 1530
    :cond_22
    sget-object v0, Lmz1;->r1:Liz1;

    .line 1531
    .line 1532
    sget-object v2, Ltw1;->e:Ltw1;

    .line 1533
    .line 1534
    iget-object v2, v2, Ltw1;->c:Lkz1;

    .line 1535
    .line 1536
    invoke-virtual {v2, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 1537
    .line 1538
    .line 1539
    move-result-object v0

    .line 1540
    check-cast v0, Ljava/lang/Boolean;

    .line 1541
    .line 1542
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1543
    .line 1544
    .line 1545
    move-result v0

    .line 1546
    if-eqz v0, :cond_23

    .line 1547
    .line 1548
    invoke-interface {v1}, Lag2;->isAttachedToWindow()Z

    .line 1549
    .line 1550
    .line 1551
    move-result v0

    .line 1552
    if-nez v0, :cond_23

    .line 1553
    .line 1554
    invoke-interface {v1}, Lag2;->onPause()V

    .line 1555
    .line 1556
    .line 1557
    invoke-interface {v1}, Lag2;->K0()V

    .line 1558
    .line 1559
    .line 1560
    :cond_23
    return-void

    .line 1561
    :pswitch_1b
    iget-object v0, p0, Lsz2;->g:Ljava/lang/Object;

    .line 1562
    .line 1563
    check-cast v0, Lcc3;

    .line 1564
    .line 1565
    iget-object v1, p0, Lsz2;->h:Ljava/lang/Object;

    .line 1566
    .line 1567
    check-cast v1, Landroid/view/View;

    .line 1568
    .line 1569
    sget-object v2, Lac3;->f:Lac3;

    .line 1570
    .line 1571
    iget-object v3, v0, Lcc3;->d:Ljava/util/HashMap;

    .line 1572
    .line 1573
    invoke-virtual {v3}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 1574
    .line 1575
    .line 1576
    move-result-object v3

    .line 1577
    invoke-interface {v3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 1578
    .line 1579
    .line 1580
    move-result-object v3

    .line 1581
    :goto_1d
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 1582
    .line 1583
    .line 1584
    move-result v4

    .line 1585
    if-eqz v4, :cond_25

    .line 1586
    .line 1587
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1588
    .line 1589
    .line 1590
    move-result-object v4

    .line 1591
    check-cast v4, Lxb3;

    .line 1592
    .line 1593
    iget-boolean v5, v4, Lxb3;->f:Z

    .line 1594
    .line 1595
    if-eqz v5, :cond_24

    .line 1596
    .line 1597
    goto :goto_1d

    .line 1598
    :cond_24
    iget-object v4, v4, Lxb3;->b:Lmc3;

    .line 1599
    .line 1600
    invoke-virtual {v4, v1, v2}, Lmc3;->a(Landroid/view/View;Lac3;)V

    .line 1601
    .line 1602
    .line 1603
    goto :goto_1d

    .line 1604
    :cond_25
    iget-object v0, v0, Lcc3;->e:Lmc3;

    .line 1605
    .line 1606
    invoke-virtual {v0, v1, v2}, Lmc3;->a(Landroid/view/View;Lac3;)V

    .line 1607
    .line 1608
    .line 1609
    return-void

    .line 1610
    :pswitch_1c
    iget-object v0, p0, Lsz2;->g:Ljava/lang/Object;

    .line 1611
    .line 1612
    check-cast v0, Lcc3;

    .line 1613
    .line 1614
    iget-object v1, p0, Lsz2;->h:Ljava/lang/Object;

    .line 1615
    .line 1616
    check-cast v1, Lf23;

    .line 1617
    .line 1618
    iget-object v2, v0, Lcc3;->d:Ljava/util/HashMap;

    .line 1619
    .line 1620
    invoke-virtual {v2}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 1621
    .line 1622
    .line 1623
    move-result-object v2

    .line 1624
    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 1625
    .line 1626
    .line 1627
    move-result-object v2

    .line 1628
    :goto_1e
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 1629
    .line 1630
    .line 1631
    move-result v3

    .line 1632
    if-eqz v3, :cond_26

    .line 1633
    .line 1634
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1635
    .line 1636
    .line 1637
    move-result-object v3

    .line 1638
    check-cast v3, Lxb3;

    .line 1639
    .line 1640
    invoke-virtual {v3}, Lxb3;->c()V

    .line 1641
    .line 1642
    .line 1643
    goto :goto_1e

    .line 1644
    :cond_26
    new-instance v2, Ljava/util/Timer;

    .line 1645
    .line 1646
    invoke-direct {v2}, Ljava/util/Timer;-><init>()V

    .line 1647
    .line 1648
    .line 1649
    new-instance v3, Llz2;

    .line 1650
    .line 1651
    invoke-direct {v3, v0, v1, v2}, Llz2;-><init>(Lcc3;Lf23;Ljava/util/Timer;)V

    .line 1652
    .line 1653
    .line 1654
    const-wide/16 v0, 0x3e8

    .line 1655
    .line 1656
    invoke-virtual {v2, v3, v0, v1}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V

    .line 1657
    .line 1658
    .line 1659
    return-void

    .line 1660
    nop

    .line 1661
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
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
