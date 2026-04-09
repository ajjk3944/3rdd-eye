.class public final Lcom/google/android/gms/internal/ads/zzbub;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lcom/google/android/gms/ads/mediation/MediationInterstitialAdapter;


# instance fields
.field public a:Landroid/app/Activity;

.field public b:Lhd0;

.field public c:Landroid/net/Uri;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final onDestroy()V
    .locals 1

    .line 1
    const-string v0, "Destroying AdMobCustomTabsAdapter adapter."

    .line 2
    .line 3
    invoke-static {v0}, Lgi2;->U(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final onPause()V
    .locals 1

    .line 1
    const-string v0, "Pausing AdMobCustomTabsAdapter adapter."

    .line 2
    .line 3
    invoke-static {v0}, Lgi2;->U(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final onResume()V
    .locals 1

    .line 1
    const-string v0, "Resuming AdMobCustomTabsAdapter adapter."

    .line 2
    .line 3
    invoke-static {v0}, Lgi2;->U(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final requestInterstitialAd(Landroid/content/Context;Lhd0;Landroid/os/Bundle;Lbd0;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzbub;->b:Lhd0;

    .line 2
    .line 3
    if-nez p2, :cond_0

    .line 4
    .line 5
    const-string p1, "Listener not set for mediation. Returning."

    .line 6
    .line 7
    invoke-static {p1}, Lgi2;->i0(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    instance-of p2, p1, Landroid/app/Activity;

    .line 12
    .line 13
    if-eqz p2, :cond_3

    .line 14
    .line 15
    invoke-static {p1}, Lyz1;->a(Landroid/content/Context;)Z

    .line 16
    .line 17
    .line 18
    move-result p2

    .line 19
    if-nez p2, :cond_1

    .line 20
    .line 21
    const-string p1, "Default browser does not support custom tabs. Bailing out."

    .line 22
    .line 23
    invoke-static {p1}, Lgi2;->i0(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzbub;->b:Lhd0;

    .line 27
    .line 28
    check-cast p1, Lxb4;

    .line 29
    .line 30
    invoke-virtual {p1}, Lxb4;->s()V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :cond_1
    const-string p2, "tab_url"

    .line 35
    .line 36
    invoke-virtual {p3, p2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p2

    .line 40
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 41
    .line 42
    .line 43
    move-result p3

    .line 44
    if-eqz p3, :cond_2

    .line 45
    .line 46
    const-string p1, "The tab_url retrieved from mediation metadata is empty. Bailing out."

    .line 47
    .line 48
    invoke-static {p1}, Lgi2;->i0(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzbub;->b:Lhd0;

    .line 52
    .line 53
    check-cast p1, Lxb4;

    .line 54
    .line 55
    invoke-virtual {p1}, Lxb4;->s()V

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :cond_2
    check-cast p1, Landroid/app/Activity;

    .line 60
    .line 61
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzbub;->a:Landroid/app/Activity;

    .line 62
    .line 63
    invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzbub;->c:Landroid/net/Uri;

    .line 68
    .line 69
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzbub;->b:Lhd0;

    .line 70
    .line 71
    check-cast p1, Lxb4;

    .line 72
    .line 73
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    const-string p2, "#008 Must be called on the main UI thread."

    .line 77
    .line 78
    invoke-static {p2}, Lou1;->h(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    const-string p2, "Adapter called onAdLoaded."

    .line 82
    .line 83
    invoke-static {p2}, Lgi2;->U(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    :try_start_0
    iget-object p1, p1, Lxb4;->g:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast p1, Lz62;

    .line 89
    .line 90
    invoke-interface {p1}, Lz62;->g()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 91
    .line 92
    .line 93
    return-void

    .line 94
    :catch_0
    move-exception p1

    .line 95
    const-string p2, "#007 Could not call remote method."

    .line 96
    .line 97
    invoke-static {p2, p1}, Lgi2;->p0(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 98
    .line 99
    .line 100
    return-void

    .line 101
    :cond_3
    const-string p1, "AdMobCustomTabs can only work with Activity context. Bailing out."

    .line 102
    .line 103
    invoke-static {p1}, Lgi2;->i0(Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzbub;->b:Lhd0;

    .line 107
    .line 108
    check-cast p1, Lxb4;

    .line 109
    .line 110
    invoke-virtual {p1}, Lxb4;->s()V

    .line 111
    .line 112
    .line 113
    return-void
.end method

.method public final showInterstitial()V
    .locals 12

    .line 1
    new-instance v0, Lrl;

    .line 2
    .line 3
    invoke-direct {v0}, Lrl;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Lrl;->a()Ll92;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iget-object v1, v0, Ll92;->f:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Landroid/content/Intent;

    .line 13
    .line 14
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzbub;->c:Landroid/net/Uri;

    .line 15
    .line 16
    invoke-virtual {v1, v2}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 17
    .line 18
    .line 19
    new-instance v4, Lfc2;

    .line 20
    .line 21
    iget-object v0, v0, Ll92;->f:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v0, Landroid/content/Intent;

    .line 24
    .line 25
    const/4 v1, 0x0

    .line 26
    invoke-direct {v4, v0, v1}, Lfc2;-><init>(Landroid/content/Intent;Lid1;)V

    .line 27
    .line 28
    .line 29
    new-instance v3, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    .line 30
    .line 31
    new-instance v6, Lj82;

    .line 32
    .line 33
    invoke-direct {v6, p0}, Lj82;-><init>(Lcom/google/android/gms/internal/ads/zzbub;)V

    .line 34
    .line 35
    .line 36
    new-instance v8, Le51;

    .line 37
    .line 38
    const/4 v0, 0x0

    .line 39
    invoke-direct {v8, v0, v0, v0}, Le51;-><init>(IIZ)V

    .line 40
    .line 41
    .line 42
    const/4 v10, 0x0

    .line 43
    const-string v11, ""

    .line 44
    .line 45
    const/4 v5, 0x0

    .line 46
    const/4 v7, 0x0

    .line 47
    const/4 v9, 0x0

    .line 48
    invoke-direct/range {v3 .. v11}, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;-><init>(Lfc2;Lfd1;Lye4;Lkf1;Le51;Ljg2;Lxp2;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    sget-object v0, Llf4;->l:Li63;

    .line 52
    .line 53
    new-instance v1, Ln62;

    .line 54
    .line 55
    const/4 v2, 0x2

    .line 56
    const/4 v4, 0x0

    .line 57
    invoke-direct {v1, p0, v3, v2, v4}, Ln62;-><init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 61
    .line 62
    .line 63
    sget-object v0, Lhg4;->C:Lhg4;

    .line 64
    .line 65
    iget-object v1, v0, Lhg4;->h:Lgd2;

    .line 66
    .line 67
    iget-object v1, v1, Lgd2;->m:Lfd2;

    .line 68
    .line 69
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    iget-object v2, v0, Lhg4;->k:Lym;

    .line 73
    .line 74
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 78
    .line 79
    .line 80
    move-result-wide v2

    .line 81
    iget-object v4, v1, Lfd2;->a:Ljava/lang/Object;

    .line 82
    .line 83
    monitor-enter v4

    .line 84
    :try_start_0
    iget v5, v1, Lfd2;->c:I

    .line 85
    .line 86
    const/4 v6, 0x3

    .line 87
    if-ne v5, v6, :cond_0

    .line 88
    .line 89
    iget-wide v7, v1, Lfd2;->b:J

    .line 90
    .line 91
    sget-object v5, Lmz1;->q6:Liz1;

    .line 92
    .line 93
    sget-object v9, Ltw1;->e:Ltw1;

    .line 94
    .line 95
    iget-object v9, v9, Ltw1;->c:Lkz1;

    .line 96
    .line 97
    invoke-virtual {v9, v5}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v5

    .line 101
    check-cast v5, Ljava/lang/Long;

    .line 102
    .line 103
    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    .line 104
    .line 105
    .line 106
    move-result-wide v9

    .line 107
    add-long/2addr v7, v9

    .line 108
    cmp-long v2, v7, v2

    .line 109
    .line 110
    if-gtz v2, :cond_0

    .line 111
    .line 112
    const/4 v2, 0x1

    .line 113
    iput v2, v1, Lfd2;->c:I

    .line 114
    .line 115
    goto :goto_0

    .line 116
    :catchall_0
    move-exception v0

    .line 117
    goto :goto_2

    .line 118
    :cond_0
    :goto_0
    monitor-exit v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 119
    iget-object v0, v0, Lhg4;->k:Lym;

    .line 120
    .line 121
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 122
    .line 123
    .line 124
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 125
    .line 126
    .line 127
    move-result-wide v2

    .line 128
    iget-object v5, v1, Lfd2;->a:Ljava/lang/Object;

    .line 129
    .line 130
    monitor-enter v5

    .line 131
    :try_start_1
    iget v0, v1, Lfd2;->c:I

    .line 132
    .line 133
    const/4 v4, 0x2

    .line 134
    if-eq v0, v4, :cond_1

    .line 135
    .line 136
    monitor-exit v5

    .line 137
    return-void

    .line 138
    :catchall_1
    move-exception v0

    .line 139
    goto :goto_1

    .line 140
    :cond_1
    iput v6, v1, Lfd2;->c:I

    .line 141
    .line 142
    iget v0, v1, Lfd2;->c:I

    .line 143
    .line 144
    if-ne v0, v6, :cond_2

    .line 145
    .line 146
    iput-wide v2, v1, Lfd2;->b:J

    .line 147
    .line 148
    :cond_2
    monitor-exit v5

    .line 149
    return-void

    .line 150
    :goto_1
    monitor-exit v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 151
    throw v0

    .line 152
    :goto_2
    :try_start_2
    monitor-exit v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 153
    throw v0
.end method
