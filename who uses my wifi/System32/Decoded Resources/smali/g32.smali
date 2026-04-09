.class public final Lg32;
.super Le6;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 1
    iput p2, p0, Lg32;->c:I

    .line 2
    .line 3
    invoke-direct {p0, p1}, Le6;-><init>(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final synthetic i(Landroid/os/IBinder;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Lg32;->c:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    if-nez p1, :cond_0

    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const-string v0, "com.google.android.gms.ads.internal.client.IAdPreloaderCreator"

    .line 11
    .line 12
    invoke-interface {p1, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    instance-of v1, v0, Lwh2;

    .line 17
    .line 18
    if-eqz v1, :cond_1

    .line 19
    .line 20
    move-object p1, v0

    .line 21
    check-cast p1, Lwh2;

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    new-instance v0, Lwh2;

    .line 25
    .line 26
    invoke-direct {v0, p1}, Lwh2;-><init>(Landroid/os/IBinder;)V

    .line 27
    .line 28
    .line 29
    move-object p1, v0

    .line 30
    :goto_0
    return-object p1

    .line 31
    :pswitch_0
    if-nez p1, :cond_2

    .line 32
    .line 33
    const/4 p1, 0x0

    .line 34
    goto :goto_1

    .line 35
    :cond_2
    const-string v0, "com.google.android.gms.ads.internal.client.IAdManagerCreator"

    .line 36
    .line 37
    invoke-interface {p1, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    instance-of v1, v0, Loa2;

    .line 42
    .line 43
    if-eqz v1, :cond_3

    .line 44
    .line 45
    move-object p1, v0

    .line 46
    check-cast p1, Loa2;

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_3
    new-instance v0, Loa2;

    .line 50
    .line 51
    invoke-direct {v0, p1}, Loa2;-><init>(Landroid/os/IBinder;)V

    .line 52
    .line 53
    .line 54
    move-object p1, v0

    .line 55
    :goto_1
    return-object p1

    .line 56
    :pswitch_1
    if-nez p1, :cond_4

    .line 57
    .line 58
    const/4 p1, 0x0

    .line 59
    goto :goto_2

    .line 60
    :cond_4
    const-string v0, "com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator"

    .line 61
    .line 62
    invoke-interface {p1, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    instance-of v1, v0, Lk82;

    .line 67
    .line 68
    if-eqz v1, :cond_5

    .line 69
    .line 70
    move-object p1, v0

    .line 71
    check-cast p1, Lk82;

    .line 72
    .line 73
    goto :goto_2

    .line 74
    :cond_5
    new-instance v0, Lk82;

    .line 75
    .line 76
    invoke-direct {v0, p1}, Lk82;-><init>(Landroid/os/IBinder;)V

    .line 77
    .line 78
    .line 79
    move-object p1, v0

    .line 80
    :goto_2
    return-object p1

    .line 81
    :pswitch_2
    if-nez p1, :cond_6

    .line 82
    .line 83
    const/4 p1, 0x0

    .line 84
    goto :goto_3

    .line 85
    :cond_6
    const-string v0, "com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator"

    .line 86
    .line 87
    invoke-interface {p1, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    instance-of v1, v0, Llo2;

    .line 92
    .line 93
    if-eqz v1, :cond_7

    .line 94
    .line 95
    move-object p1, v0

    .line 96
    check-cast p1, Llo2;

    .line 97
    .line 98
    goto :goto_3

    .line 99
    :cond_7
    new-instance v0, Llo2;

    .line 100
    .line 101
    invoke-direct {v0, p1}, Llo2;-><init>(Landroid/os/IBinder;)V

    .line 102
    .line 103
    .line 104
    move-object p1, v0

    .line 105
    :goto_3
    return-object p1

    .line 106
    :pswitch_3
    if-nez p1, :cond_8

    .line 107
    .line 108
    const/4 p1, 0x0

    .line 109
    goto :goto_4

    .line 110
    :cond_8
    const-string v0, "com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator"

    .line 111
    .line 112
    invoke-interface {p1, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    instance-of v1, v0, Lf92;

    .line 117
    .line 118
    if-eqz v1, :cond_9

    .line 119
    .line 120
    move-object p1, v0

    .line 121
    check-cast p1, Lf92;

    .line 122
    .line 123
    goto :goto_4

    .line 124
    :cond_9
    new-instance v0, Ld92;

    .line 125
    .line 126
    invoke-direct {v0, p1}, Ld92;-><init>(Landroid/os/IBinder;)V

    .line 127
    .line 128
    .line 129
    move-object p1, v0

    .line 130
    :goto_4
    return-object p1

    .line 131
    :pswitch_4
    if-nez p1, :cond_a

    .line 132
    .line 133
    const/4 p1, 0x0

    .line 134
    goto :goto_5

    .line 135
    :cond_a
    const-string v0, "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator"

    .line 136
    .line 137
    invoke-interface {p1, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    instance-of v1, v0, Li22;

    .line 142
    .line 143
    if-eqz v1, :cond_b

    .line 144
    .line 145
    move-object p1, v0

    .line 146
    check-cast p1, Li22;

    .line 147
    .line 148
    goto :goto_5

    .line 149
    :cond_b
    new-instance v0, Lg22;

    .line 150
    .line 151
    invoke-direct {v0, p1}, Lg22;-><init>(Landroid/os/IBinder;)V

    .line 152
    .line 153
    .line 154
    move-object p1, v0

    .line 155
    :goto_5
    return-object p1

    .line 156
    nop

    .line 157
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public w(Landroid/content/Context;Lxe4;Ljava/lang/String;Lu62;I)Lba2;
    .locals 9

    .line 1
    invoke-static {p1}, Lmz1;->a(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lmz1;->wb:Liz1;

    .line 5
    .line 6
    sget-object v1, Ltw1;->e:Ltw1;

    .line 7
    .line 8
    iget-object v1, v1, Ltw1;->c:Lkz1;

    .line 9
    .line 10
    invoke-virtual {v1, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    check-cast v0, Ljava/lang/Boolean;

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    const-string v1, "com.google.android.gms.ads.internal.client.IAdManager"

    .line 21
    .line 22
    const/4 v2, 0x0

    .line 23
    if-eqz v0, :cond_4

    .line 24
    .line 25
    :try_start_0
    new-instance v4, Loi0;

    .line 26
    .line 27
    invoke-direct {v4, p1}, Loi0;-><init>(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    const-string v0, "com.google.android.gms.ads.ChimeraAdManagerCreatorImpl"
    :try_end_0
    .catch Lze4; {:try_start_0 .. :try_end_0} :catch_2
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    .line 31
    .line 32
    :try_start_1
    invoke-static {p1}, Lpu1;->z(Landroid/content/Context;)Lar;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    invoke-virtual {v3, v0}, Lar;->b(Ljava/lang/String;)Landroid/os/IBinder;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    check-cast v0, Landroid/os/IBinder;

    .line 41
    .line 42
    if-nez v0, :cond_0

    .line 43
    .line 44
    move-object v5, p2

    .line 45
    move-object v6, p3

    .line 46
    move-object v7, p4

    .line 47
    move v8, p5

    .line 48
    move-object v3, v2

    .line 49
    goto :goto_1

    .line 50
    :cond_0
    const-string v3, "com.google.android.gms.ads.internal.client.IAdManagerCreator"

    .line 51
    .line 52
    invoke-interface {v0, v3}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    instance-of v5, v3, Loa2;

    .line 57
    .line 58
    if-eqz v5, :cond_1

    .line 59
    .line 60
    check-cast v3, Loa2;

    .line 61
    .line 62
    :goto_0
    move-object v5, p2

    .line 63
    move-object v6, p3

    .line 64
    move-object v7, p4

    .line 65
    move v8, p5

    .line 66
    goto :goto_1

    .line 67
    :cond_1
    new-instance v3, Loa2;

    .line 68
    .line 69
    invoke-direct {v3, v0}, Loa2;-><init>(Landroid/os/IBinder;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_3

    .line 70
    .line 71
    .line 72
    goto :goto_0

    .line 73
    :goto_1
    :try_start_2
    invoke-virtual/range {v3 .. v8}, Loa2;->l1(Loi0;Lxe4;Ljava/lang/String;Lu62;I)Landroid/os/IBinder;

    .line 74
    .line 75
    .line 76
    move-result-object p2

    .line 77
    if-nez p2, :cond_2

    .line 78
    .line 79
    goto :goto_4

    .line 80
    :cond_2
    invoke-interface {p2, v1}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 81
    .line 82
    .line 83
    move-result-object p3

    .line 84
    instance-of p4, p3, Lba2;

    .line 85
    .line 86
    if-eqz p4, :cond_3

    .line 87
    .line 88
    check-cast p3, Lba2;

    .line 89
    .line 90
    return-object p3

    .line 91
    :catch_0
    move-exception v0

    .line 92
    :goto_2
    move-object p2, v0

    .line 93
    goto :goto_3

    .line 94
    :catch_1
    move-exception v0

    .line 95
    goto :goto_2

    .line 96
    :catch_2
    move-exception v0

    .line 97
    goto :goto_2

    .line 98
    :cond_3
    new-instance p3, Lv82;

    .line 99
    .line 100
    invoke-direct {p3, p2}, Lv82;-><init>(Landroid/os/IBinder;)V

    .line 101
    .line 102
    .line 103
    return-object p3

    .line 104
    :catch_3
    move-exception v0

    .line 105
    move-object p2, v0

    .line 106
    new-instance p3, Lze4;

    .line 107
    .line 108
    invoke-direct {p3, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    .line 109
    .line 110
    .line 111
    throw p3
    :try_end_2
    .catch Lze4; {:try_start_2 .. :try_end_2} :catch_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/NullPointerException; {:try_start_2 .. :try_end_2} :catch_0

    .line 112
    :goto_3
    invoke-static {p1}, Lr92;->a(Landroid/content/Context;)Ls92;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    const-string p3, "AdManagerCreator.newAdManagerByDynamiteLoader"

    .line 117
    .line 118
    invoke-interface {p1, p3, p2}, Ls92;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 119
    .line 120
    .line 121
    const-string p1, "#007 Could not call remote method."

    .line 122
    .line 123
    invoke-static {p1, p2}, Lgi2;->p0(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 124
    .line 125
    .line 126
    return-object v2

    .line 127
    :cond_4
    move-object v5, p2

    .line 128
    move-object v6, p3

    .line 129
    move-object v7, p4

    .line 130
    move v8, p5

    .line 131
    :try_start_3
    new-instance v4, Loi0;

    .line 132
    .line 133
    invoke-direct {v4, p1}, Loi0;-><init>(Ljava/lang/Object;)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {p0, p1}, Le6;->j(Landroid/content/Context;)Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    move-object v3, p1

    .line 141
    check-cast v3, Loa2;

    .line 142
    .line 143
    invoke-virtual/range {v3 .. v8}, Loa2;->l1(Loi0;Lxe4;Ljava/lang/String;Lu62;I)Landroid/os/IBinder;

    .line 144
    .line 145
    .line 146
    move-result-object p1

    .line 147
    if-nez p1, :cond_5

    .line 148
    .line 149
    :goto_4
    return-object v2

    .line 150
    :cond_5
    invoke-interface {p1, v1}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 151
    .line 152
    .line 153
    move-result-object p2

    .line 154
    instance-of p3, p2, Lba2;

    .line 155
    .line 156
    if-eqz p3, :cond_6

    .line 157
    .line 158
    check-cast p2, Lba2;

    .line 159
    .line 160
    return-object p2

    .line 161
    :cond_6
    new-instance p2, Lv82;

    .line 162
    .line 163
    invoke-direct {p2, p1}, Lv82;-><init>(Landroid/os/IBinder;)V
    :try_end_3
    .catch Landroid/os/RemoteException; {:try_start_3 .. :try_end_3} :catch_4
    .catch Lhp0; {:try_start_3 .. :try_end_3} :catch_4

    .line 164
    .line 165
    .line 166
    return-object p2

    .line 167
    :catch_4
    const/4 p1, 0x3

    .line 168
    invoke-static {p1}, Lgi2;->q0(I)Z

    .line 169
    .line 170
    .line 171
    return-object v2
.end method
