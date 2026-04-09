.class public final Lra0;
.super Landroid/net/ConnectivityManager$NetworkCallback;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lra0;->a:I

    iput-object p2, p0, Lra0;->b:Ljava/lang/Object;

    invoke-direct {p0}, Landroid/net/ConnectivityManager$NetworkCallback;-><init>()V

    return-void
.end method

.method public constructor <init>(Lgb3;)V
    .locals 1

    const/4 v0, 0x4

    iput v0, p0, Lra0;->a:I

    .line 3
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lra0;->b:Ljava/lang/Object;

    invoke-direct {p0}, Landroid/net/ConnectivityManager$NetworkCallback;-><init>()V

    return-void
.end method

.method public constructor <init>(Lgd2;)V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, Lra0;->a:I

    .line 2
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lra0;->b:Ljava/lang/Object;

    invoke-direct {p0}, Landroid/net/ConnectivityManager$NetworkCallback;-><init>()V

    return-void
.end method

.method public constructor <init>(Lnb3;)V
    .locals 1

    const/4 v0, 0x5

    iput v0, p0, Lra0;->a:I

    .line 4
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lra0;->b:Ljava/lang/Object;

    invoke-direct {p0}, Landroid/net/ConnectivityManager$NetworkCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public onAvailable(Landroid/net/Network;)V
    .locals 3

    .line 1
    iget v0, p0, Lra0;->a:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    packed-switch v0, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    :pswitch_0
    invoke-super {p0, p1}, Landroid/net/ConnectivityManager$NetworkCallback;->onAvailable(Landroid/net/Network;)V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :pswitch_1
    iget-object p1, p0, Lra0;->b:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p1, Lnb3;

    .line 14
    .line 15
    invoke-virtual {p1, v1}, Lnb3;->b(Z)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :pswitch_2
    iget-object p1, p0, Lra0;->b:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast p1, Lgb3;

    .line 22
    .line 23
    invoke-virtual {p1, v1}, Lgb3;->a(Z)V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :pswitch_3
    iget-object p1, p0, Lra0;->b:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast p1, Lgd2;

    .line 30
    .line 31
    iget-object p1, p1, Lgd2;->p:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 32
    .line 33
    invoke-virtual {p1, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :pswitch_4
    const-string v0, "network"

    .line 38
    .line 39
    invoke-static {p1, v0}, Li30;->m(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    invoke-super {p0, p1}, Landroid/net/ConnectivityManager$NetworkCallback;->onAvailable(Landroid/net/Network;)V

    .line 43
    .line 44
    .line 45
    iget-object p1, p0, Lra0;->b:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast p1, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;

    .line 48
    .line 49
    sget-object v0, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->d0:[I

    .line 50
    .line 51
    monitor-enter p1

    .line 52
    :try_start_0
    new-instance v0, Ljava/lang/Thread;

    .line 53
    .line 54
    new-instance v1, Lla0;

    .line 55
    .line 56
    const/4 v2, 0x6

    .line 57
    invoke-direct {v1, p1, v2}, Lla0;-><init>(Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;I)V

    .line 58
    .line 59
    .line 60
    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 64
    .line 65
    .line 66
    monitor-exit p1

    .line 67
    return-void

    .line 68
    :catchall_0
    move-exception v0

    .line 69
    :try_start_1
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 70
    throw v0

    .line 71
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_0
        :pswitch_0
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public onCapabilitiesChanged(Landroid/net/Network;Landroid/net/NetworkCapabilities;)V
    .locals 1

    .line 1
    iget v0, p0, Lra0;->a:I

    .line 2
    .line 3
    sparse-switch v0, :sswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1, p2}, Landroid/net/ConnectivityManager$NetworkCallback;->onCapabilitiesChanged(Landroid/net/Network;Landroid/net/NetworkCapabilities;)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :sswitch_0
    iget-object p1, p0, Lra0;->b:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p1, Lak3;

    .line 13
    .line 14
    monitor-enter p1

    .line 15
    :try_start_0
    iput-object p2, p1, Lak3;->c:Landroid/net/NetworkCapabilities;

    .line 16
    .line 17
    monitor-exit p1

    .line 18
    return-void

    .line 19
    :catchall_0
    move-exception p2

    .line 20
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    throw p2

    .line 22
    :sswitch_1
    const-class p1, Lzs1;

    .line 23
    .line 24
    monitor-enter p1

    .line 25
    :try_start_1
    iget-object v0, p0, Lra0;->b:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v0, Lzs1;

    .line 28
    .line 29
    iput-object p2, v0, Lzs1;->g:Ljava/lang/Object;

    .line 30
    .line 31
    monitor-exit p1

    .line 32
    return-void

    .line 33
    :catchall_1
    move-exception p2

    .line 34
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 35
    throw p2

    .line 36
    :sswitch_2
    invoke-static {}, Lh80;->d()Lh80;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    sget-object v0, Lzg0;->i:Ljava/lang/String;

    .line 41
    .line 42
    invoke-static {p2}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    const/4 p2, 0x0

    .line 46
    new-array p2, p2, [Ljava/lang/Throwable;

    .line 47
    .line 48
    invoke-virtual {p1, p2}, Lh80;->a([Ljava/lang/Throwable;)V

    .line 49
    .line 50
    .line 51
    iget-object p1, p0, Lra0;->b:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast p1, Lzg0;

    .line 54
    .line 55
    invoke-virtual {p1}, Lzg0;->f()Lyg0;

    .line 56
    .line 57
    .line 58
    move-result-object p2

    .line 59
    invoke-virtual {p1, p2}, Loi;->c(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    return-void

    .line 63
    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_2
        0x2 -> :sswitch_1
        0x6 -> :sswitch_0
    .end sparse-switch
.end method

.method public onLinkPropertiesChanged(Landroid/net/Network;Landroid/net/LinkProperties;)V
    .locals 2

    .line 1
    iget v0, p0, Lra0;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1, p2}, Landroid/net/ConnectivityManager$NetworkCallback;->onLinkPropertiesChanged(Landroid/net/Network;Landroid/net/LinkProperties;)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    const-string v0, "network"

    .line 11
    .line 12
    invoke-static {p1, v0}, Li30;->m(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const-string v0, "linkProperties"

    .line 16
    .line 17
    invoke-static {p2, v0}, Li30;->m(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-super {p0, p1, p2}, Landroid/net/ConnectivityManager$NetworkCallback;->onLinkPropertiesChanged(Landroid/net/Network;Landroid/net/LinkProperties;)V

    .line 21
    .line 22
    .line 23
    iget-object v0, p0, Lra0;->b:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v0, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;

    .line 26
    .line 27
    iget-object v1, v0, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->V:Ljava/util/ArrayList;

    .line 28
    .line 29
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 30
    .line 31
    .line 32
    iget-object v1, v0, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->V:Ljava/util/ArrayList;

    .line 33
    .line 34
    invoke-virtual {p2}, Landroid/net/LinkProperties;->getLinkAddresses()Ljava/util/List;

    .line 35
    .line 36
    .line 37
    move-result-object p2

    .line 38
    invoke-virtual {v1, p2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 39
    .line 40
    .line 41
    iget-object p2, v0, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->F:Landroid/net/ConnectivityManager;

    .line 42
    .line 43
    if-eqz p2, :cond_3

    .line 44
    .line 45
    invoke-virtual {p2, p1}, Landroid/net/ConnectivityManager;->getNetworkCapabilities(Landroid/net/Network;)Landroid/net/NetworkCapabilities;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    if-eqz p1, :cond_2

    .line 50
    .line 51
    const/4 p2, 0x1

    .line 52
    invoke-virtual {p1, p2}, Landroid/net/NetworkCapabilities;->hasTransport(I)Z

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    if-eqz v1, :cond_0

    .line 57
    .line 58
    invoke-static {v0, p2}, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->x(Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;I)V

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_0
    const/4 p2, 0x0

    .line 63
    invoke-virtual {p1, p2}, Landroid/net/NetworkCapabilities;->hasTransport(I)Z

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    if-eqz v1, :cond_1

    .line 68
    .line 69
    invoke-static {v0, p2}, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->x(Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;I)V

    .line 70
    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_1
    const/4 p2, 0x2

    .line 74
    invoke-virtual {p1, p2}, Landroid/net/NetworkCapabilities;->hasTransport(I)Z

    .line 75
    .line 76
    .line 77
    move-result p1

    .line 78
    if-eqz p1, :cond_2

    .line 79
    .line 80
    invoke-static {v0, p2}, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->x(Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;I)V

    .line 81
    .line 82
    .line 83
    :cond_2
    :goto_0
    return-void

    .line 84
    :cond_3
    const-string p1, "conMgr"

    .line 85
    .line 86
    invoke-static {p1}, Li30;->S(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    const/4 p1, 0x0

    .line 90
    throw p1

    .line 91
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final onLost(Landroid/net/Network;)V
    .locals 4

    .line 1
    iget v0, p0, Lra0;->a:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object p1, p0, Lra0;->b:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p1, Lak3;

    .line 11
    .line 12
    monitor-enter p1

    .line 13
    :try_start_0
    iput-object v1, p1, Lak3;->c:Landroid/net/NetworkCapabilities;

    .line 14
    .line 15
    monitor-exit p1

    .line 16
    return-void

    .line 17
    :catchall_0
    move-exception v0

    .line 18
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    throw v0

    .line 20
    :pswitch_0
    iget-object p1, p0, Lra0;->b:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast p1, Lnb3;

    .line 23
    .line 24
    invoke-virtual {p1, v2}, Lnb3;->b(Z)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :pswitch_1
    iget-object p1, p0, Lra0;->b:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast p1, Lgb3;

    .line 31
    .line 32
    invoke-virtual {p1, v2}, Lgb3;->a(Z)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :pswitch_2
    iget-object p1, p0, Lra0;->b:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast p1, Lgd2;

    .line 39
    .line 40
    iget-object p1, p1, Lgd2;->p:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 41
    .line 42
    invoke-virtual {p1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :pswitch_3
    const-class p1, Lzs1;

    .line 47
    .line 48
    monitor-enter p1

    .line 49
    :try_start_1
    iget-object v0, p0, Lra0;->b:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v0, Lzs1;

    .line 52
    .line 53
    iput-object v1, v0, Lzs1;->g:Ljava/lang/Object;

    .line 54
    .line 55
    monitor-exit p1

    .line 56
    return-void

    .line 57
    :catchall_1
    move-exception v0

    .line 58
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 59
    throw v0

    .line 60
    :pswitch_4
    invoke-static {}, Lh80;->d()Lh80;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    sget-object v0, Lzg0;->i:Ljava/lang/String;

    .line 65
    .line 66
    new-array v0, v2, [Ljava/lang/Throwable;

    .line 67
    .line 68
    invoke-virtual {p1, v0}, Lh80;->a([Ljava/lang/Throwable;)V

    .line 69
    .line 70
    .line 71
    iget-object p1, p0, Lra0;->b:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast p1, Lzg0;

    .line 74
    .line 75
    invoke-virtual {p1}, Lzg0;->f()Lyg0;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    invoke-virtual {p1, v0}, Loi;->c(Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    return-void

    .line 83
    :pswitch_5
    const-string v0, "network"

    .line 84
    .line 85
    invoke-static {p1, v0}, Li30;->m(Ljava/lang/Object;Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    invoke-super {p0, p1}, Landroid/net/ConnectivityManager$NetworkCallback;->onLost(Landroid/net/Network;)V

    .line 89
    .line 90
    .line 91
    iget-object p1, p0, Lra0;->b:Ljava/lang/Object;

    .line 92
    .line 93
    check-cast p1, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;

    .line 94
    .line 95
    const-string v0, "conMgr"

    .line 96
    .line 97
    iget-object v3, p1, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->F:Landroid/net/ConnectivityManager;

    .line 98
    .line 99
    if-eqz v3, :cond_4

    .line 100
    .line 101
    invoke-virtual {v3}, Landroid/net/ConnectivityManager;->getActiveNetwork()Landroid/net/Network;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    invoke-virtual {v3, v0}, Landroid/net/ConnectivityManager;->getNetworkCapabilities(Landroid/net/Network;)Landroid/net/NetworkCapabilities;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    const/4 v1, 0x1

    .line 110
    if-eqz v0, :cond_3

    .line 111
    .line 112
    invoke-virtual {v0, v2}, Landroid/net/NetworkCapabilities;->hasTransport(I)Z

    .line 113
    .line 114
    .line 115
    move-result v3

    .line 116
    if-eqz v3, :cond_0

    .line 117
    .line 118
    goto :goto_0

    .line 119
    :cond_0
    invoke-virtual {v0, v1}, Landroid/net/NetworkCapabilities;->hasTransport(I)Z

    .line 120
    .line 121
    .line 122
    move-result v3

    .line 123
    if-eqz v3, :cond_1

    .line 124
    .line 125
    goto :goto_0

    .line 126
    :cond_1
    const/4 v3, 0x3

    .line 127
    invoke-virtual {v0, v3}, Landroid/net/NetworkCapabilities;->hasTransport(I)Z

    .line 128
    .line 129
    .line 130
    move-result v3

    .line 131
    if-eqz v3, :cond_2

    .line 132
    .line 133
    goto :goto_0

    .line 134
    :cond_2
    const/4 v3, 0x2

    .line 135
    invoke-virtual {v0, v3}, Landroid/net/NetworkCapabilities;->hasTransport(I)Z

    .line 136
    .line 137
    .line 138
    move-result v0

    .line 139
    if-eqz v0, :cond_3

    .line 140
    .line 141
    goto :goto_0

    .line 142
    :cond_3
    invoke-virtual {p1}, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->A()V

    .line 143
    .line 144
    .line 145
    new-instance v0, Lna0;

    .line 146
    .line 147
    invoke-direct {v0, v2, p1, v1}, Lna0;-><init>(ZLcom/phuongpn/whousemywifi/networkscanner/MainActivity;I)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {p1, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 151
    .line 152
    .line 153
    :goto_0
    return-void

    .line 154
    :cond_4
    invoke-static {v0}, Li30;->S(Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    throw v1

    .line 158
    nop

    .line 159
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
