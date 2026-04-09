.class public final Lqp1;
.super Lzu1;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final synthetic b:Landroid/content/Context;

.field public final synthetic c:Ls62;

.field public final synthetic d:Lbu1;


# direct methods
.method public constructor <init>(Lbu1;Landroid/content/Context;Ls62;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lqp1;->b:Landroid/content/Context;

    .line 5
    .line 6
    iput-object p3, p0, Lqp1;->c:Ls62;

    .line 7
    .line 8
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Lqp1;->d:Lbu1;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final bridge synthetic a()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lqp1;->b:Landroid/content/Context;

    .line 2
    .line 3
    const-string v1, "ads_preloader"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lbu1;->F(Landroid/content/Context;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    return-object v0
.end method

.method public final b()Ljava/lang/Object;
    .locals 11

    .line 1
    new-instance v0, Loi0;

    .line 2
    .line 3
    iget-object v1, p0, Lqp1;->b:Landroid/content/Context;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Loi0;-><init>(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    invoke-static {v1}, Lmz1;->a(Landroid/content/Context;)V

    .line 9
    .line 10
    .line 11
    sget-object v2, Lmz1;->wb:Liz1;

    .line 12
    .line 13
    sget-object v3, Ltw1;->e:Ltw1;

    .line 14
    .line 15
    iget-object v3, v3, Ltw1;->c:Lkz1;

    .line 16
    .line 17
    invoke-virtual {v3, v2}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    check-cast v2, Ljava/lang/Boolean;

    .line 22
    .line 23
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    const v3, 0xf212370

    .line 28
    .line 29
    .line 30
    const/4 v4, 0x1

    .line 31
    iget-object v5, p0, Lqp1;->d:Lbu1;

    .line 32
    .line 33
    const-string v6, "com.google.android.gms.ads.internal.client.IAdPreloader"

    .line 34
    .line 35
    iget-object v7, p0, Lqp1;->c:Ls62;

    .line 36
    .line 37
    const/4 v8, 0x0

    .line 38
    if-eqz v2, :cond_4

    .line 39
    .line 40
    :try_start_0
    const-string v2, "com.google.android.gms.ads.ChimeraAdPreloaderCreatorImpl"
    :try_end_0
    .catch Lze4; {:try_start_0 .. :try_end_0} :catch_2
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    .line 41
    .line 42
    :try_start_1
    invoke-static {v1}, Lpu1;->z(Landroid/content/Context;)Lar;

    .line 43
    .line 44
    .line 45
    move-result-object v9

    .line 46
    invoke-virtual {v9, v2}, Lar;->b(Ljava/lang/String;)Landroid/os/IBinder;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    check-cast v2, Landroid/os/IBinder;

    .line 51
    .line 52
    if-nez v2, :cond_0

    .line 53
    .line 54
    move-object v9, v8

    .line 55
    goto :goto_0

    .line 56
    :cond_0
    const-string v9, "com.google.android.gms.ads.internal.client.IAdPreloaderCreator"

    .line 57
    .line 58
    invoke-interface {v2, v9}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 59
    .line 60
    .line 61
    move-result-object v9

    .line 62
    instance-of v10, v9, Lwh2;

    .line 63
    .line 64
    if-eqz v10, :cond_1

    .line 65
    .line 66
    check-cast v9, Lwh2;

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_1
    new-instance v9, Lwh2;

    .line 70
    .line 71
    invoke-direct {v9, v2}, Lwh2;-><init>(Landroid/os/IBinder;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_3

    .line 72
    .line 73
    .line 74
    :goto_0
    :try_start_2
    invoke-virtual {v9}, Lsb1;->U()Landroid/os/Parcel;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    invoke-static {v2, v0}, Liv1;->e(Landroid/os/Parcel;Landroid/os/IInterface;)V

    .line 79
    .line 80
    .line 81
    invoke-static {v2, v7}, Liv1;->e(Landroid/os/Parcel;Landroid/os/IInterface;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v2, v3}, Landroid/os/Parcel;->writeInt(I)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v9, v2, v4}, Lsb1;->Y(Landroid/os/Parcel;I)Landroid/os/Parcel;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    invoke-virtual {v0}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 92
    .line 93
    .line 94
    move-result-object v2

    .line 95
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 96
    .line 97
    .line 98
    if-nez v2, :cond_2

    .line 99
    .line 100
    move-object v0, v8

    .line 101
    goto :goto_1

    .line 102
    :cond_2
    invoke-interface {v2, v6}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    instance-of v3, v0, Lkh2;

    .line 107
    .line 108
    if-eqz v3, :cond_3

    .line 109
    .line 110
    check-cast v0, Lkh2;

    .line 111
    .line 112
    goto :goto_1

    .line 113
    :catch_0
    move-exception v0

    .line 114
    goto :goto_2

    .line 115
    :catch_1
    move-exception v0

    .line 116
    goto :goto_2

    .line 117
    :catch_2
    move-exception v0

    .line 118
    goto :goto_2

    .line 119
    :cond_3
    new-instance v0, Lng2;

    .line 120
    .line 121
    invoke-direct {v0, v2}, Lng2;-><init>(Landroid/os/IBinder;)V

    .line 122
    .line 123
    .line 124
    :goto_1
    invoke-interface {v0, v7}, Lkh2;->f1(Ls62;)V

    .line 125
    .line 126
    .line 127
    return-object v0

    .line 128
    :catch_3
    move-exception v0

    .line 129
    new-instance v2, Lze4;

    .line 130
    .line 131
    invoke-direct {v2, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    .line 132
    .line 133
    .line 134
    throw v2
    :try_end_2
    .catch Lze4; {:try_start_2 .. :try_end_2} :catch_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/NullPointerException; {:try_start_2 .. :try_end_2} :catch_0

    .line 135
    :goto_2
    invoke-static {v1}, Lr92;->a(Landroid/content/Context;)Ls92;

    .line 136
    .line 137
    .line 138
    move-result-object v1

    .line 139
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 140
    .line 141
    .line 142
    const-string v2, "ClientApiBroker.getAdPreloader"

    .line 143
    .line 144
    invoke-interface {v1, v2, v0}, Ls92;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 145
    .line 146
    .line 147
    goto :goto_4

    .line 148
    :cond_4
    iget-object v0, v5, Lbu1;->l:Ljava/lang/Object;

    .line 149
    .line 150
    check-cast v0, Lg32;

    .line 151
    .line 152
    :try_start_3
    new-instance v2, Loi0;

    .line 153
    .line 154
    invoke-direct {v2, v1}, Loi0;-><init>(Ljava/lang/Object;)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {v0, v1}, Le6;->j(Landroid/content/Context;)Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    check-cast v0, Lwh2;

    .line 162
    .line 163
    invoke-virtual {v0}, Lsb1;->U()Landroid/os/Parcel;

    .line 164
    .line 165
    .line 166
    move-result-object v1

    .line 167
    invoke-static {v1, v2}, Liv1;->e(Landroid/os/Parcel;Landroid/os/IInterface;)V

    .line 168
    .line 169
    .line 170
    invoke-static {v1, v7}, Liv1;->e(Landroid/os/Parcel;Landroid/os/IInterface;)V

    .line 171
    .line 172
    .line 173
    invoke-virtual {v1, v3}, Landroid/os/Parcel;->writeInt(I)V

    .line 174
    .line 175
    .line 176
    invoke-virtual {v0, v1, v4}, Lsb1;->Y(Landroid/os/Parcel;I)Landroid/os/Parcel;

    .line 177
    .line 178
    .line 179
    move-result-object v0

    .line 180
    invoke-virtual {v0}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 181
    .line 182
    .line 183
    move-result-object v1

    .line 184
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 185
    .line 186
    .line 187
    if-nez v1, :cond_5

    .line 188
    .line 189
    move-object v0, v8

    .line 190
    goto :goto_3

    .line 191
    :cond_5
    invoke-interface {v1, v6}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 192
    .line 193
    .line 194
    move-result-object v0

    .line 195
    instance-of v2, v0, Lkh2;

    .line 196
    .line 197
    if-eqz v2, :cond_6

    .line 198
    .line 199
    check-cast v0, Lkh2;

    .line 200
    .line 201
    goto :goto_3

    .line 202
    :cond_6
    new-instance v0, Lng2;

    .line 203
    .line 204
    invoke-direct {v0, v1}, Lng2;-><init>(Landroid/os/IBinder;)V

    .line 205
    .line 206
    .line 207
    :goto_3
    invoke-interface {v0, v7}, Lkh2;->f1(Ls62;)V
    :try_end_3
    .catch Landroid/os/RemoteException; {:try_start_3 .. :try_end_3} :catch_4
    .catch Lhp0; {:try_start_3 .. :try_end_3} :catch_4

    .line 208
    .line 209
    .line 210
    move-object v8, v0

    .line 211
    goto :goto_4

    .line 212
    :catch_4
    const/4 v0, 0x5

    .line 213
    invoke-static {v0}, Lgi2;->q0(I)Z

    .line 214
    .line 215
    .line 216
    :goto_4
    return-object v8
.end method

.method public final c(Lek2;)Ljava/lang/Object;
    .locals 3

    .line 1
    new-instance v0, Loi0;

    .line 2
    .line 3
    iget-object v1, p0, Lqp1;->b:Landroid/content/Context;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Loi0;-><init>(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    const v1, 0xf212370

    .line 9
    .line 10
    .line 11
    iget-object v2, p0, Lqp1;->c:Ls62;

    .line 12
    .line 13
    invoke-interface {p1, v0, v2, v1}, Lek2;->T0(Lu10;Lu62;I)Lkh2;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-interface {p1, v2}, Lkh2;->f1(Ls62;)V

    .line 18
    .line 19
    .line 20
    return-object p1
.end method
