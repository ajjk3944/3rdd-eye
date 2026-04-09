.class public final Ldr1;
.super Lzu1;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final synthetic b:Landroid/content/Context;

.field public final synthetic c:Lbu1;


# direct methods
.method public constructor <init>(Lbu1;Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Ldr1;->b:Landroid/content/Context;

    .line 5
    .line 6
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Ldr1;->c:Lbu1;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Ldr1;->b:Landroid/content/Context;

    .line 2
    .line 3
    const-string v1, "mobile_ads_settings"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lbu1;->F(Landroid/content/Context;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    new-instance v0, Lma3;

    .line 9
    .line 10
    invoke-direct {v0}, Lpn2;-><init>()V

    .line 11
    .line 12
    .line 13
    return-object v0
.end method

.method public final b()Ljava/lang/Object;
    .locals 10

    .line 1
    iget-object v0, p0, Ldr1;->b:Landroid/content/Context;

    .line 2
    .line 3
    invoke-static {v0}, Lmz1;->a(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    sget-object v1, Lmz1;->wb:Liz1;

    .line 7
    .line 8
    sget-object v2, Ltw1;->e:Ltw1;

    .line 9
    .line 10
    iget-object v2, v2, Ltw1;->c:Lkz1;

    .line 11
    .line 12
    invoke-virtual {v2, v1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    check-cast v1, Ljava/lang/Boolean;

    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    const v2, 0xf212370

    .line 23
    .line 24
    .line 25
    const/4 v3, 0x1

    .line 26
    iget-object v4, p0, Ldr1;->c:Lbu1;

    .line 27
    .line 28
    const-string v5, "com.google.android.gms.ads.internal.client.IMobileAdsSettingManager"

    .line 29
    .line 30
    const/4 v6, 0x0

    .line 31
    if-eqz v1, :cond_4

    .line 32
    .line 33
    :try_start_0
    new-instance v1, Loi0;

    .line 34
    .line 35
    invoke-direct {v1, v0}, Loi0;-><init>(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    const-string v7, "com.google.android.gms.ads.ChimeraMobileAdsSettingManagerCreatorImpl"
    :try_end_0
    .catch Lze4; {:try_start_0 .. :try_end_0} :catch_2
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    .line 39
    .line 40
    :try_start_1
    invoke-static {v0}, Lpu1;->z(Landroid/content/Context;)Lar;

    .line 41
    .line 42
    .line 43
    move-result-object v8

    .line 44
    invoke-virtual {v8, v7}, Lar;->b(Ljava/lang/String;)Landroid/os/IBinder;

    .line 45
    .line 46
    .line 47
    move-result-object v7

    .line 48
    check-cast v7, Landroid/os/IBinder;

    .line 49
    .line 50
    if-nez v7, :cond_0

    .line 51
    .line 52
    move-object v8, v6

    .line 53
    goto :goto_0

    .line 54
    :cond_0
    const-string v8, "com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator"

    .line 55
    .line 56
    invoke-interface {v7, v8}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 57
    .line 58
    .line 59
    move-result-object v8

    .line 60
    instance-of v9, v8, Llo2;

    .line 61
    .line 62
    if-eqz v9, :cond_1

    .line 63
    .line 64
    check-cast v8, Llo2;

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_1
    new-instance v8, Llo2;

    .line 68
    .line 69
    invoke-direct {v8, v7}, Llo2;-><init>(Landroid/os/IBinder;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_3

    .line 70
    .line 71
    .line 72
    :goto_0
    :try_start_2
    invoke-virtual {v8}, Lsb1;->U()Landroid/os/Parcel;

    .line 73
    .line 74
    .line 75
    move-result-object v7

    .line 76
    invoke-static {v7, v1}, Liv1;->e(Landroid/os/Parcel;Landroid/os/IInterface;)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v7, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v8, v7, v3}, Lsb1;->Y(Landroid/os/Parcel;I)Landroid/os/Parcel;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    invoke-virtual {v1}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 91
    .line 92
    .line 93
    if-nez v2, :cond_2

    .line 94
    .line 95
    return-object v6

    .line 96
    :cond_2
    invoke-interface {v2, v5}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    instance-of v3, v1, Lzn2;

    .line 101
    .line 102
    if-eqz v3, :cond_3

    .line 103
    .line 104
    check-cast v1, Lzn2;

    .line 105
    .line 106
    return-object v1

    .line 107
    :catch_0
    move-exception v1

    .line 108
    goto :goto_1

    .line 109
    :catch_1
    move-exception v1

    .line 110
    goto :goto_1

    .line 111
    :catch_2
    move-exception v1

    .line 112
    goto :goto_1

    .line 113
    :cond_3
    new-instance v1, Lzm2;

    .line 114
    .line 115
    invoke-direct {v1, v2}, Lzm2;-><init>(Landroid/os/IBinder;)V

    .line 116
    .line 117
    .line 118
    return-object v1

    .line 119
    :catch_3
    move-exception v1

    .line 120
    new-instance v2, Lze4;

    .line 121
    .line 122
    invoke-direct {v2, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    .line 123
    .line 124
    .line 125
    throw v2
    :try_end_2
    .catch Lze4; {:try_start_2 .. :try_end_2} :catch_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/NullPointerException; {:try_start_2 .. :try_end_2} :catch_0

    .line 126
    :goto_1
    invoke-static {v0}, Lr92;->a(Landroid/content/Context;)Ls92;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 131
    .line 132
    .line 133
    const-string v2, "ClientApiBroker.getMobileAdsSettingsManager"

    .line 134
    .line 135
    invoke-interface {v0, v2, v1}, Ls92;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 136
    .line 137
    .line 138
    goto :goto_3

    .line 139
    :cond_4
    iget-object v1, v4, Lbu1;->i:Ljava/lang/Object;

    .line 140
    .line 141
    check-cast v1, Lg32;

    .line 142
    .line 143
    :try_start_3
    new-instance v4, Loi0;

    .line 144
    .line 145
    invoke-direct {v4, v0}, Loi0;-><init>(Ljava/lang/Object;)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {v1, v0}, Le6;->j(Landroid/content/Context;)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    check-cast v0, Llo2;

    .line 153
    .line 154
    invoke-virtual {v0}, Lsb1;->U()Landroid/os/Parcel;

    .line 155
    .line 156
    .line 157
    move-result-object v1

    .line 158
    invoke-static {v1, v4}, Liv1;->e(Landroid/os/Parcel;Landroid/os/IInterface;)V

    .line 159
    .line 160
    .line 161
    invoke-virtual {v1, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 162
    .line 163
    .line 164
    invoke-virtual {v0, v1, v3}, Lsb1;->Y(Landroid/os/Parcel;I)Landroid/os/Parcel;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    invoke-virtual {v0}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 169
    .line 170
    .line 171
    move-result-object v1

    .line 172
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 173
    .line 174
    .line 175
    if-nez v1, :cond_5

    .line 176
    .line 177
    goto :goto_3

    .line 178
    :cond_5
    invoke-interface {v1, v5}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    instance-of v2, v0, Lzn2;

    .line 183
    .line 184
    if-eqz v2, :cond_6

    .line 185
    .line 186
    check-cast v0, Lzn2;

    .line 187
    .line 188
    :goto_2
    move-object v6, v0

    .line 189
    goto :goto_3

    .line 190
    :cond_6
    new-instance v0, Lzm2;

    .line 191
    .line 192
    invoke-direct {v0, v1}, Lzm2;-><init>(Landroid/os/IBinder;)V
    :try_end_3
    .catch Landroid/os/RemoteException; {:try_start_3 .. :try_end_3} :catch_4
    .catch Lhp0; {:try_start_3 .. :try_end_3} :catch_4

    .line 193
    .line 194
    .line 195
    goto :goto_2

    .line 196
    :catch_4
    const/4 v0, 0x5

    .line 197
    invoke-static {v0}, Lgi2;->q0(I)Z

    .line 198
    .line 199
    .line 200
    :goto_3
    return-object v6
.end method

.method public final c(Lek2;)Ljava/lang/Object;
    .locals 2

    .line 1
    new-instance v0, Loi0;

    .line 2
    .line 3
    iget-object v1, p0, Ldr1;->b:Landroid/content/Context;

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
    invoke-interface {p1, v0, v1}, Lek2;->I2(Lu10;I)Lzn2;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
.end method
