.class public final synthetic Lmi2;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic f:I

.field public final synthetic g:Loi2;


# direct methods
.method public synthetic constructor <init>(Loi2;I)V
    .locals 0

    .line 1
    iput p2, p0, Lmi2;->f:I

    .line 2
    .line 3
    iput-object p1, p0, Lmi2;->g:Loi2;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 1
    iget v0, p0, Lmi2;->f:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lmi2;->g:Loi2;

    .line 7
    .line 8
    sget-object v1, Lhg4;->C:Lhg4;

    .line 9
    .line 10
    iget-object v2, v1, Lhg4;->h:Lgd2;

    .line 11
    .line 12
    invoke-virtual {v2}, Lgd2;->g()Lra4;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    invoke-virtual {v2}, Lra4;->h()V

    .line 17
    .line 18
    .line 19
    iget-object v3, v2, Lra4;->a:Ljava/lang/Object;

    .line 20
    .line 21
    monitor-enter v3

    .line 22
    :try_start_0
    iget-boolean v2, v2, Lra4;->y:Z

    .line 23
    .line 24
    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 25
    if-eqz v2, :cond_0

    .line 26
    .line 27
    iget-object v2, v1, Lhg4;->h:Lgd2;

    .line 28
    .line 29
    invoke-virtual {v2}, Lgd2;->g()Lra4;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    invoke-virtual {v2}, Lra4;->h()V

    .line 34
    .line 35
    .line 36
    iget-object v3, v2, Lra4;->a:Ljava/lang/Object;

    .line 37
    .line 38
    monitor-enter v3

    .line 39
    :try_start_1
    iget-object v2, v2, Lra4;->z:Ljava/lang/String;

    .line 40
    .line 41
    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 42
    iget-object v3, v0, Loi2;->f:Landroid/content/Context;

    .line 43
    .line 44
    iget-object v0, v0, Loi2;->g:Le51;

    .line 45
    .line 46
    iget-object v4, v1, Lhg4;->o:Lus1;

    .line 47
    .line 48
    iget-object v0, v0, Le51;->f:Ljava/lang/String;

    .line 49
    .line 50
    invoke-virtual {v4, v3, v2, v0}, Lus1;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Z

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-nez v0, :cond_0

    .line 55
    .line 56
    iget-object v0, v1, Lhg4;->h:Lgd2;

    .line 57
    .line 58
    invoke-virtual {v0}, Lgd2;->g()Lra4;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    const/4 v2, 0x0

    .line 63
    invoke-virtual {v0, v2}, Lra4;->e(Z)V

    .line 64
    .line 65
    .line 66
    iget-object v0, v1, Lhg4;->h:Lgd2;

    .line 67
    .line 68
    invoke-virtual {v0}, Lgd2;->g()Lra4;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    const-string v1, ""

    .line 73
    .line 74
    invoke-virtual {v0, v1}, Lra4;->f(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    goto :goto_0

    .line 78
    :catchall_0
    move-exception v0

    .line 79
    :try_start_2
    monitor-exit v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 80
    throw v0

    .line 81
    :cond_0
    :goto_0
    return-void

    .line 82
    :catchall_1
    move-exception v0

    .line 83
    :try_start_3
    monitor-exit v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 84
    throw v0

    .line 85
    :pswitch_0
    iget-object v0, p0, Lmi2;->g:Loi2;

    .line 86
    .line 87
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    new-instance v1, Lt92;

    .line 91
    .line 92
    const-string v2, "com.google.android.gms.ads.internal.report.IDynamiteErrorEventListener"

    .line 93
    .line 94
    invoke-direct {v1, v2}, Lhv1;-><init>(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    iget-object v0, v0, Loi2;->o:Lnc3;

    .line 98
    .line 99
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    :try_start_4
    iget-object v0, v0, Lnc3;->f:Landroid/content/Context;

    .line 103
    .line 104
    const-string v2, "com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy"
    :try_end_4
    .catch Lze4; {:try_start_4 .. :try_end_4} :catch_2
    .catch Landroid/os/RemoteException; {:try_start_4 .. :try_end_4} :catch_1

    .line 105
    .line 106
    :try_start_5
    invoke-static {v0}, Lpu1;->z(Landroid/content/Context;)Lar;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    invoke-virtual {v0, v2}, Lar;->b(Ljava/lang/String;)Landroid/os/IBinder;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    const-string v2, "com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy"

    .line 115
    .line 116
    check-cast v0, Landroid/os/IBinder;

    .line 117
    .line 118
    if-nez v0, :cond_1

    .line 119
    .line 120
    const/4 v0, 0x0

    .line 121
    goto :goto_1

    .line 122
    :cond_1
    invoke-interface {v0, v2}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 123
    .line 124
    .line 125
    move-result-object v3

    .line 126
    instance-of v4, v3, Lm12;

    .line 127
    .line 128
    if-eqz v4, :cond_2

    .line 129
    .line 130
    move-object v0, v3

    .line 131
    check-cast v0, Lm12;

    .line 132
    .line 133
    goto :goto_1

    .line 134
    :cond_2
    new-instance v3, Lm12;

    .line 135
    .line 136
    const/4 v4, 0x2

    .line 137
    invoke-direct {v3, v0, v2, v4}, Lsb1;-><init>(Landroid/os/IBinder;Ljava/lang/String;I)V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0

    .line 138
    .line 139
    .line 140
    move-object v0, v3

    .line 141
    :goto_1
    :try_start_6
    invoke-virtual {v0}, Lsb1;->U()Landroid/os/Parcel;

    .line 142
    .line 143
    .line 144
    move-result-object v2

    .line 145
    invoke-static {v2, v1}, Liv1;->e(Landroid/os/Parcel;Landroid/os/IInterface;)V

    .line 146
    .line 147
    .line 148
    const/4 v1, 0x1

    .line 149
    invoke-virtual {v0, v2, v1}, Lsb1;->M0(Landroid/os/Parcel;I)V

    .line 150
    .line 151
    .line 152
    goto :goto_4

    .line 153
    :catch_0
    move-exception v0

    .line 154
    new-instance v1, Lze4;

    .line 155
    .line 156
    invoke-direct {v1, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    .line 157
    .line 158
    .line 159
    throw v1
    :try_end_6
    .catch Lze4; {:try_start_6 .. :try_end_6} :catch_2
    .catch Landroid/os/RemoteException; {:try_start_6 .. :try_end_6} :catch_1

    .line 160
    :catch_1
    move-exception v0

    .line 161
    goto :goto_2

    .line 162
    :catch_2
    move-exception v0

    .line 163
    goto :goto_3

    .line 164
    :goto_2
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object v0

    .line 172
    const-string v1, "Error calling setFlagsAccessedBeforeInitializedListener: "

    .line 173
    .line 174
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    invoke-static {v0}, Lgi2;->i0(Ljava/lang/String;)V

    .line 179
    .line 180
    .line 181
    goto :goto_4

    .line 182
    :goto_3
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object v0

    .line 186
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    const-string v1, "Could not load com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy:"

    .line 191
    .line 192
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object v0

    .line 196
    invoke-static {v0}, Lgi2;->i0(Ljava/lang/String;)V

    .line 197
    .line 198
    .line 199
    :goto_4
    return-void

    .line 200
    :pswitch_1
    iget-object v0, p0, Lmi2;->g:Loi2;

    .line 201
    .line 202
    sget-object v1, Lhg4;->C:Lhg4;

    .line 203
    .line 204
    iget-object v1, v1, Lhg4;->n:Lxz1;

    .line 205
    .line 206
    iget-object v2, v0, Loi2;->f:Landroid/content/Context;

    .line 207
    .line 208
    iget-object v0, v0, Loi2;->s:Lmv2;

    .line 209
    .line 210
    iget-object v3, v1, Lxz1;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 211
    .line 212
    const/4 v4, 0x1

    .line 213
    invoke-virtual {v3, v4}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    .line 214
    .line 215
    .line 216
    move-result v3

    .line 217
    if-eqz v3, :cond_3

    .line 218
    .line 219
    goto :goto_5

    .line 220
    :cond_3
    iput-object v2, v1, Lxz1;->c:Landroid/content/Context;

    .line 221
    .line 222
    iput-object v0, v1, Lxz1;->d:Lmv2;

    .line 223
    .line 224
    iget-object v0, v1, Lxz1;->f:Lsl;

    .line 225
    .line 226
    if-nez v0, :cond_6

    .line 227
    .line 228
    if-nez v2, :cond_4

    .line 229
    .line 230
    goto :goto_5

    .line 231
    :cond_4
    invoke-static {v2}, Lsl;->a(Landroid/content/Context;)Ljava/lang/String;

    .line 232
    .line 233
    .line 234
    move-result-object v0

    .line 235
    if-eqz v0, :cond_6

    .line 236
    .line 237
    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 238
    .line 239
    .line 240
    move-result-object v3

    .line 241
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 242
    .line 243
    .line 244
    move-result v3

    .line 245
    if-nez v3, :cond_6

    .line 246
    .line 247
    invoke-virtual {v2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 248
    .line 249
    .line 250
    move-result-object v3

    .line 251
    iput-object v3, v1, Ltl;->a:Landroid/content/Context;

    .line 252
    .line 253
    new-instance v3, Landroid/content/Intent;

    .line 254
    .line 255
    const-string v4, "android.support.customtabs.action.CustomTabsService"

    .line 256
    .line 257
    invoke-direct {v3, v4}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 258
    .line 259
    .line 260
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 261
    .line 262
    .line 263
    move-result v4

    .line 264
    if-nez v4, :cond_5

    .line 265
    .line 266
    invoke-virtual {v3, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 267
    .line 268
    .line 269
    :cond_5
    const/16 v0, 0x21

    .line 270
    .line 271
    invoke-virtual {v2, v3, v1, v0}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    .line 272
    .line 273
    .line 274
    :cond_6
    :goto_5
    return-void

    .line 275
    :pswitch_2
    iget-object v0, p0, Lmi2;->g:Loi2;

    .line 276
    .line 277
    iget-object v0, v0, Loi2;->f:Landroid/content/Context;

    .line 278
    .line 279
    const/4 v1, 0x1

    .line 280
    invoke-static {v0, v1}, Li41;->J(Landroid/content/Context;Z)V

    .line 281
    .line 282
    .line 283
    return-void

    .line 284
    nop

    .line 285
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
