.class public final Lgk2;
.super Lhv1;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lkw1;


# instance fields
.field public final f:Lfk2;

.field public final g:Lba2;

.field public final h:Ls63;

.field public i:Z

.field public final j:Lmv2;


# direct methods
.method public constructor <init>(Lfk2;Lba2;Ls63;Lmv2;)V
    .locals 2

    .line 1
    const-string v0, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAd"

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lhv1;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lmz1;->P0:Liz1;

    .line 7
    .line 8
    sget-object v1, Ltw1;->e:Ltw1;

    .line 9
    .line 10
    iget-object v1, v1, Ltw1;->c:Lkz1;

    .line 11
    .line 12
    invoke-virtual {v1, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    check-cast v0, Ljava/lang/Boolean;

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iput-boolean v0, p0, Lgk2;->i:Z

    .line 23
    .line 24
    iput-object p1, p0, Lgk2;->f:Lfk2;

    .line 25
    .line 26
    iput-object p2, p0, Lgk2;->g:Lba2;

    .line 27
    .line 28
    iput-object p3, p0, Lgk2;->h:Ls63;

    .line 29
    .line 30
    iput-object p4, p0, Lgk2;->j:Lmv2;

    .line 31
    .line 32
    return-void
.end method


# virtual methods
.method public final A3(ILandroid/os/Parcel;Landroid/os/Parcel;)Z
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object v1, p0, Lgk2;->g:Lba2;

    .line 3
    .line 4
    iget-object v2, p0, Lgk2;->f:Lfk2;

    .line 5
    .line 6
    packed-switch p1, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    return p1

    .line 11
    :pswitch_0
    invoke-virtual {p2}, Landroid/os/Parcel;->readLong()J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    invoke-static {p2}, Liv1;->f(Landroid/os/Parcel;)V

    .line 16
    .line 17
    .line 18
    if-eqz v2, :cond_0

    .line 19
    .line 20
    iget-object p1, v2, Lel2;->j:Lgm2;

    .line 21
    .line 22
    if-eqz p1, :cond_0

    .line 23
    .line 24
    invoke-virtual {p1, v0, v1}, Lgm2;->a(J)V

    .line 25
    .line 26
    .line 27
    :cond_0
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 28
    .line 29
    .line 30
    goto/16 :goto_5

    .line 31
    .line 32
    :pswitch_1
    if-eqz v2, :cond_1

    .line 33
    .line 34
    iget-object p1, v2, Lel2;->j:Lgm2;

    .line 35
    .line 36
    if-eqz p1, :cond_1

    .line 37
    .line 38
    iget-object p1, p1, Lgm2;->a:Ljava/util/concurrent/atomic/AtomicLong;

    .line 39
    .line 40
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    .line 41
    .line 42
    .line 43
    move-result-wide p1

    .line 44
    goto :goto_0

    .line 45
    :cond_1
    const-wide/16 p1, 0x0

    .line 46
    .line 47
    :goto_0
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p3, p1, p2}, Landroid/os/Parcel;->writeLong(J)V

    .line 51
    .line 52
    .line 53
    goto/16 :goto_5

    .line 54
    .line 55
    :pswitch_2
    :try_start_0
    invoke-interface {v1}, Lba2;->v()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v0
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 59
    goto :goto_1

    .line 60
    :catch_0
    move-exception p1

    .line 61
    const-string p2, "#007 Could not call remote method."

    .line 62
    .line 63
    invoke-static {p2, p1}, Lgi2;->p0(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 64
    .line 65
    .line 66
    :goto_1
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    goto/16 :goto_5

    .line 73
    .line 74
    :pswitch_3
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    invoke-static {p1}, Lkd3;->B3(Landroid/os/IBinder;)Lzu2;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    invoke-static {p2}, Liv1;->f(Landroid/os/Parcel;)V

    .line 83
    .line 84
    .line 85
    const-string p2, "setOnPaidEventListener must be called on the main UI thread."

    .line 86
    .line 87
    invoke-static {p2}, Lou1;->h(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    iget-object p2, p0, Lgk2;->h:Ls63;

    .line 91
    .line 92
    if-eqz p2, :cond_3

    .line 93
    .line 94
    :try_start_1
    invoke-interface {p1}, Lzu2;->c()Z

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    if-nez v0, :cond_2

    .line 99
    .line 100
    iget-object v0, p0, Lgk2;->j:Lmv2;

    .line 101
    .line 102
    invoke-virtual {v0}, Lmv2;->b()V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_1

    .line 103
    .line 104
    .line 105
    goto :goto_2

    .line 106
    :catch_1
    const/4 v0, 0x3

    .line 107
    invoke-static {v0}, Lgi2;->q0(I)Z

    .line 108
    .line 109
    .line 110
    :cond_2
    :goto_2
    iget-object p2, p2, Ls63;->l:Ljava/util/concurrent/atomic/AtomicReference;

    .line 111
    .line 112
    invoke-virtual {p2, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 113
    .line 114
    .line 115
    :cond_3
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 116
    .line 117
    .line 118
    goto :goto_5

    .line 119
    :pswitch_4
    invoke-static {p2}, Liv1;->a(Landroid/os/Parcel;)Z

    .line 120
    .line 121
    .line 122
    move-result p1

    .line 123
    invoke-static {p2}, Liv1;->f(Landroid/os/Parcel;)V

    .line 124
    .line 125
    .line 126
    iput-boolean p1, p0, Lgk2;->i:Z

    .line 127
    .line 128
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 129
    .line 130
    .line 131
    goto :goto_5

    .line 132
    :pswitch_5
    invoke-virtual {p0}, Lgk2;->e()Ltx2;

    .line 133
    .line 134
    .line 135
    move-result-object p1

    .line 136
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 137
    .line 138
    .line 139
    invoke-static {p3, p1}, Liv1;->e(Landroid/os/Parcel;Landroid/os/IInterface;)V

    .line 140
    .line 141
    .line 142
    goto :goto_5

    .line 143
    :pswitch_6
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 144
    .line 145
    .line 146
    move-result-object p1

    .line 147
    invoke-static {p1}, Loi0;->X0(Landroid/os/IBinder;)Lu10;

    .line 148
    .line 149
    .line 150
    move-result-object p1

    .line 151
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 152
    .line 153
    .line 154
    move-result-object v1

    .line 155
    if-nez v1, :cond_4

    .line 156
    .line 157
    goto :goto_3

    .line 158
    :cond_4
    const-string v0, "com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback"

    .line 159
    .line 160
    invoke-interface {v1, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 161
    .line 162
    .line 163
    move-result-object v2

    .line 164
    instance-of v3, v2, Lpw1;

    .line 165
    .line 166
    if-eqz v3, :cond_5

    .line 167
    .line 168
    move-object v0, v2

    .line 169
    check-cast v0, Lpw1;

    .line 170
    .line 171
    goto :goto_3

    .line 172
    :cond_5
    new-instance v2, Low1;

    .line 173
    .line 174
    const/4 v3, 0x2

    .line 175
    invoke-direct {v2, v1, v0, v3}, Lsb1;-><init>(Landroid/os/IBinder;Ljava/lang/String;I)V

    .line 176
    .line 177
    .line 178
    move-object v0, v2

    .line 179
    :goto_3
    invoke-static {p2}, Liv1;->f(Landroid/os/Parcel;)V

    .line 180
    .line 181
    .line 182
    invoke-virtual {p0, p1, v0}, Lgk2;->H1(Lu10;Lpw1;)V

    .line 183
    .line 184
    .line 185
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 186
    .line 187
    .line 188
    goto :goto_5

    .line 189
    :pswitch_7
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 190
    .line 191
    .line 192
    move-result-object p1

    .line 193
    if-nez p1, :cond_6

    .line 194
    .line 195
    goto :goto_4

    .line 196
    :cond_6
    const-string v0, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAdPresentationCallback"

    .line 197
    .line 198
    invoke-interface {p1, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 199
    .line 200
    .line 201
    :goto_4
    invoke-static {p2}, Liv1;->f(Landroid/os/Parcel;)V

    .line 202
    .line 203
    .line 204
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 205
    .line 206
    .line 207
    goto :goto_5

    .line 208
    :pswitch_8
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 209
    .line 210
    .line 211
    invoke-static {p3, v1}, Liv1;->e(Landroid/os/Parcel;Landroid/os/IInterface;)V

    .line 212
    .line 213
    .line 214
    :goto_5
    const/4 p1, 0x1

    .line 215
    return p1

    .line 216
    nop

    .line 217
    :pswitch_data_0
    .packed-switch 0x2
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

.method public final H1(Lu10;Lpw1;)V
    .locals 1

    .line 1
    :try_start_0
    iget-object v0, p0, Lgk2;->h:Ls63;

    .line 2
    .line 3
    iget-object v0, v0, Ls63;->i:Ljava/util/concurrent/atomic/AtomicReference;

    .line 4
    .line 5
    invoke-virtual {v0, p2}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    iget-object p2, p0, Lgk2;->f:Lfk2;

    .line 9
    .line 10
    invoke-static {p1}, Loi0;->l1(Lu10;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Landroid/app/Activity;

    .line 15
    .line 16
    iget-boolean v0, p0, Lgk2;->i:Z

    .line 17
    .line 18
    invoke-virtual {p2, p1, v0}, Lfk2;->c(Landroid/app/Activity;Z)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :catch_0
    move-exception p1

    .line 23
    const-string p2, "#007 Could not call remote method."

    .line 24
    .line 25
    invoke-static {p2, p1}, Lgi2;->p0(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public final e()Ltx2;
    .locals 2

    .line 1
    sget-object v0, Lmz1;->d7:Liz1;

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
    if-nez v0, :cond_0

    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    return-object v0

    .line 21
    :cond_0
    iget-object v0, p0, Lgk2;->f:Lfk2;

    .line 22
    .line 23
    iget-object v0, v0, Lel2;->f:Lrm2;

    .line 24
    .line 25
    return-object v0
.end method
