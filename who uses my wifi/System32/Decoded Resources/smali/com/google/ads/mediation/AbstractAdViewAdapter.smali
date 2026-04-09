.class public abstract Lcom/google/ads/mediation/AbstractAdViewAdapter;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lcom/google/android/gms/ads/mediation/MediationBannerAdapter;
.implements Lcom/google/android/gms/ads/mediation/MediationInterstitialAdapter;
.implements Lcom/google/android/gms/ads/mediation/MediationNativeAdapter;


# static fields
.field public static final AD_UNIT_ID_PARAMETER:Ljava/lang/String; = "pubid"


# instance fields
.field private adLoader:Lv2;

.field protected mAdView:Le3;

.field protected mInterstitialAd:Lg30;


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
.method public buildAdRequest(Landroid/content/Context;Lbd0;Landroid/os/Bundle;Landroid/os/Bundle;)Lb3;
    .locals 5

    .line 1
    new-instance v0, La3;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, Lf74;-><init>(I)V

    .line 5
    .line 6
    .line 7
    iget-object v1, v0, Lf74;->g:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, Lo7;

    .line 10
    .line 11
    invoke-interface {p2}, Lbd0;->c()Ljava/util/Set;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    if-eqz v3, :cond_0

    .line 26
    .line 27
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    check-cast v3, Ljava/lang/String;

    .line 32
    .line 33
    iget-object v4, v1, Lo7;->d:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v4, Ljava/util/HashSet;

    .line 36
    .line 37
    invoke-virtual {v4, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    invoke-interface {p2}, Lbd0;->b()Z

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    if-eqz v2, :cond_1

    .line 46
    .line 47
    sget-object v2, Lsv1;->f:Lsv1;

    .line 48
    .line 49
    iget-object v2, v2, Lsv1;->a:Lj63;

    .line 50
    .line 51
    invoke-static {p1}, Lj63;->c(Landroid/content/Context;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    iget-object v2, v1, Lo7;->g:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v2, Ljava/util/HashSet;

    .line 58
    .line 59
    invoke-virtual {v2, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    :cond_1
    invoke-interface {p2}, Lbd0;->d()I

    .line 63
    .line 64
    .line 65
    move-result p1

    .line 66
    const/4 v2, -0x1

    .line 67
    if-eq p1, v2, :cond_3

    .line 68
    .line 69
    invoke-interface {p2}, Lbd0;->d()I

    .line 70
    .line 71
    .line 72
    move-result p1

    .line 73
    const/4 v2, 0x1

    .line 74
    if-ne p1, v2, :cond_2

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_2
    const/4 v2, 0x0

    .line 78
    :goto_1
    iput v2, v1, Lo7;->a:I

    .line 79
    .line 80
    :cond_3
    invoke-interface {p2}, Lbd0;->a()Z

    .line 81
    .line 82
    .line 83
    move-result p1

    .line 84
    iput-boolean p1, v1, Lo7;->b:Z

    .line 85
    .line 86
    invoke-virtual {p0, p3, p4}, Lcom/google/ads/mediation/AbstractAdViewAdapter;->buildExtrasBundle(Landroid/os/Bundle;Landroid/os/Bundle;)Landroid/os/Bundle;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    invoke-virtual {v0, p1}, Lf74;->i1(Landroid/os/Bundle;)Lf74;

    .line 91
    .line 92
    .line 93
    new-instance p1, Lb3;

    .line 94
    .line 95
    invoke-direct {p1, v0}, Lb3;-><init>(Lf74;)V

    .line 96
    .line 97
    .line 98
    return-object p1
.end method

.method public abstract buildExtrasBundle(Landroid/os/Bundle;Landroid/os/Bundle;)Landroid/os/Bundle;
.end method

.method public getAdUnitId(Landroid/os/Bundle;)Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "pubid"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public getBannerView()Landroid/view/View;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/ads/mediation/AbstractAdViewAdapter;->mAdView:Le3;

    .line 2
    .line 3
    return-object v0
.end method

.method public getInterstitialAd()Lg30;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/ads/mediation/AbstractAdViewAdapter;->mInterstitialAd:Lg30;

    .line 2
    .line 3
    return-object v0
.end method

.method public getVideoController()Lpy2;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/ads/mediation/AbstractAdViewAdapter;->mAdView:Le3;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, v0, Lr9;->f:Le23;

    .line 6
    .line 7
    iget-object v0, v0, Le23;->c:Lj51;

    .line 8
    .line 9
    iget-object v1, v0, Lj51;->a:Ljava/lang/Object;

    .line 10
    .line 11
    monitor-enter v1

    .line 12
    :try_start_0
    iget-object v0, v0, Lj51;->b:Lpy2;

    .line 13
    .line 14
    monitor-exit v1

    .line 15
    return-object v0

    .line 16
    :catchall_0
    move-exception v0

    .line 17
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    throw v0

    .line 19
    :cond_0
    const/4 v0, 0x0

    .line 20
    return-object v0
.end method

.method public newAdLoader(Landroid/content/Context;Ljava/lang/String;)Lu2;
    .locals 1

    .line 1
    new-instance v0, Lu2;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2}, Lu2;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public onDestroy()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/ads/mediation/AbstractAdViewAdapter;->mAdView:Le3;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {v0}, Lr9;->a()V

    .line 7
    .line 8
    .line 9
    iput-object v1, p0, Lcom/google/ads/mediation/AbstractAdViewAdapter;->mAdView:Le3;

    .line 10
    .line 11
    :cond_0
    iget-object v0, p0, Lcom/google/ads/mediation/AbstractAdViewAdapter;->mInterstitialAd:Lg30;

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    iput-object v1, p0, Lcom/google/ads/mediation/AbstractAdViewAdapter;->mInterstitialAd:Lg30;

    .line 16
    .line 17
    :cond_1
    iget-object v0, p0, Lcom/google/ads/mediation/AbstractAdViewAdapter;->adLoader:Lv2;

    .line 18
    .line 19
    if-eqz v0, :cond_2

    .line 20
    .line 21
    iput-object v1, p0, Lcom/google/ads/mediation/AbstractAdViewAdapter;->adLoader:Lv2;

    .line 22
    .line 23
    :cond_2
    return-void
.end method

.method public onImmersiveModeUpdated(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/ads/mediation/AbstractAdViewAdapter;->mInterstitialAd:Lg30;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast v0, Lk52;

    .line 6
    .line 7
    :try_start_0
    iget-object v0, v0, Lk52;->c:Lba2;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-interface {v0, p1}, Lba2;->t1(Z)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :catch_0
    move-exception p1

    .line 16
    const-string v0, "#007 Could not call remote method."

    .line 17
    .line 18
    invoke-static {v0, p1}, Lgi2;->p0(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 19
    .line 20
    .line 21
    :cond_0
    return-void
.end method

.method public onPause()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/ads/mediation/AbstractAdViewAdapter;->mAdView:Le3;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lr9;->c()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public onResume()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/ads/mediation/AbstractAdViewAdapter;->mAdView:Le3;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lr9;->d()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public requestBannerAd(Landroid/content/Context;Lfd0;Landroid/os/Bundle;Ld3;Lbd0;Landroid/os/Bundle;)V
    .locals 3

    .line 1
    new-instance v0, Le3;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Le3;-><init>(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    iput-object v0, p0, Lcom/google/ads/mediation/AbstractAdViewAdapter;->mAdView:Le3;

    .line 7
    .line 8
    new-instance v1, Ld3;

    .line 9
    .line 10
    iget v2, p4, Ld3;->a:I

    .line 11
    .line 12
    iget p4, p4, Ld3;->b:I

    .line 13
    .line 14
    invoke-direct {v1, v2, p4}, Ld3;-><init>(II)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, Lr9;->setAdSize(Ld3;)V

    .line 18
    .line 19
    .line 20
    iget-object p4, p0, Lcom/google/ads/mediation/AbstractAdViewAdapter;->mAdView:Le3;

    .line 21
    .line 22
    invoke-virtual {p0, p3}, Lcom/google/ads/mediation/AbstractAdViewAdapter;->getAdUnitId(Landroid/os/Bundle;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-virtual {p4, v0}, Lr9;->setAdUnitId(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    iget-object p4, p0, Lcom/google/ads/mediation/AbstractAdViewAdapter;->mAdView:Le3;

    .line 30
    .line 31
    new-instance v0, Lvu1;

    .line 32
    .line 33
    invoke-direct {v0, p0, p2}, Lvu1;-><init>(Lcom/google/ads/mediation/AbstractAdViewAdapter;Lfd0;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p4, v0}, Lr9;->setAdListener(Lt2;)V

    .line 37
    .line 38
    .line 39
    iget-object p2, p0, Lcom/google/ads/mediation/AbstractAdViewAdapter;->mAdView:Le3;

    .line 40
    .line 41
    invoke-virtual {p0, p1, p5, p6, p3}, Lcom/google/ads/mediation/AbstractAdViewAdapter;->buildAdRequest(Landroid/content/Context;Lbd0;Landroid/os/Bundle;Landroid/os/Bundle;)Lb3;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-virtual {p2, p1}, Lr9;->b(Lb3;)V

    .line 46
    .line 47
    .line 48
    return-void
.end method

.method public requestInterstitialAd(Landroid/content/Context;Lhd0;Landroid/os/Bundle;Lbd0;Landroid/os/Bundle;)V
    .locals 1

    .line 1
    invoke-virtual {p0, p3}, Lcom/google/ads/mediation/AbstractAdViewAdapter;->getAdUnitId(Landroid/os/Bundle;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0, p1, p4, p5, p3}, Lcom/google/ads/mediation/AbstractAdViewAdapter;->buildAdRequest(Landroid/content/Context;Lbd0;Landroid/os/Bundle;Landroid/os/Bundle;)Lb3;

    .line 6
    .line 7
    .line 8
    move-result-object p3

    .line 9
    new-instance p4, Lcom/google/ads/mediation/a;

    .line 10
    .line 11
    invoke-direct {p4, p0, p2}, Lcom/google/ads/mediation/a;-><init>(Lcom/google/ads/mediation/AbstractAdViewAdapter;Lhd0;)V

    .line 12
    .line 13
    .line 14
    invoke-static {p1, v0, p3, p4}, Lg30;->a(Landroid/content/Context;Ljava/lang/String;Lb3;Lh30;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public requestNativeAd(Landroid/content/Context;Ljd0;Landroid/os/Bundle;Llg0;Landroid/os/Bundle;)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    move-object/from16 v3, p4

    .line 8
    .line 9
    new-instance v4, Lrx2;

    .line 10
    .line 11
    move-object/from16 v5, p2

    .line 12
    .line 13
    invoke-direct {v4, v0, v5}, Lrx2;-><init>(Lcom/google/ads/mediation/AbstractAdViewAdapter;Ljd0;)V

    .line 14
    .line 15
    .line 16
    const-string v5, "pubid"

    .line 17
    .line 18
    invoke-virtual {v2, v5}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v5

    .line 22
    invoke-virtual {v0, v1, v5}, Lcom/google/ads/mediation/AbstractAdViewAdapter;->newAdLoader(Landroid/content/Context;Ljava/lang/String;)Lu2;

    .line 23
    .line 24
    .line 25
    move-result-object v5

    .line 26
    invoke-virtual {v5, v4}, Lu2;->b(Lt2;)V

    .line 27
    .line 28
    .line 29
    iget-object v6, v5, Lu2;->b:Lx72;

    .line 30
    .line 31
    move-object v7, v3

    .line 32
    check-cast v7, Lo72;

    .line 33
    .line 34
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    new-instance v8, Lkg0;

    .line 38
    .line 39
    invoke-direct {v8}, Lkg0;-><init>()V

    .line 40
    .line 41
    .line 42
    iget-object v9, v7, Lo72;->d:Lr12;

    .line 43
    .line 44
    const/4 v10, 0x4

    .line 45
    const/4 v11, 0x3

    .line 46
    const/4 v12, 0x2

    .line 47
    if-nez v9, :cond_0

    .line 48
    .line 49
    new-instance v9, Lkg0;

    .line 50
    .line 51
    invoke-direct {v9, v8}, Lkg0;-><init>(Lkg0;)V

    .line 52
    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_0
    iget v13, v9, Lr12;->f:I

    .line 56
    .line 57
    if-eq v13, v12, :cond_3

    .line 58
    .line 59
    if-eq v13, v11, :cond_2

    .line 60
    .line 61
    if-eq v13, v10, :cond_1

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_1
    iget-boolean v13, v9, Lr12;->l:Z

    .line 65
    .line 66
    iput-boolean v13, v8, Lkg0;->g:Z

    .line 67
    .line 68
    iget v13, v9, Lr12;->m:I

    .line 69
    .line 70
    iput v13, v8, Lkg0;->c:I

    .line 71
    .line 72
    :cond_2
    iget-object v13, v9, Lr12;->k:Lih3;

    .line 73
    .line 74
    if-eqz v13, :cond_3

    .line 75
    .line 76
    new-instance v14, Ll51;

    .line 77
    .line 78
    invoke-direct {v14, v13}, Ll51;-><init>(Lih3;)V

    .line 79
    .line 80
    .line 81
    iput-object v14, v8, Lkg0;->f:Ll51;

    .line 82
    .line 83
    :cond_3
    iget v13, v9, Lr12;->j:I

    .line 84
    .line 85
    iput v13, v8, Lkg0;->e:I

    .line 86
    .line 87
    :goto_0
    iget-boolean v13, v9, Lr12;->g:Z

    .line 88
    .line 89
    iput-boolean v13, v8, Lkg0;->a:Z

    .line 90
    .line 91
    iget v13, v9, Lr12;->h:I

    .line 92
    .line 93
    iput v13, v8, Lkg0;->b:I

    .line 94
    .line 95
    iget-boolean v9, v9, Lr12;->i:Z

    .line 96
    .line 97
    iput-boolean v9, v8, Lkg0;->d:Z

    .line 98
    .line 99
    new-instance v9, Lkg0;

    .line 100
    .line 101
    invoke-direct {v9, v8}, Lkg0;-><init>(Lkg0;)V

    .line 102
    .line 103
    .line 104
    :goto_1
    const/4 v8, 0x5

    .line 105
    :try_start_0
    new-instance v13, Lr12;

    .line 106
    .line 107
    invoke-direct {v13, v9}, Lr12;-><init>(Lkg0;)V

    .line 108
    .line 109
    .line 110
    invoke-interface {v6, v13}, Lx72;->w1(Lr12;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 111
    .line 112
    .line 113
    goto :goto_2

    .line 114
    :catch_0
    invoke-static {v8}, Lgi2;->q0(I)Z

    .line 115
    .line 116
    .line 117
    :goto_2
    iget-object v9, v7, Lo72;->g:Ljava/util/HashMap;

    .line 118
    .line 119
    iget-object v13, v7, Lo72;->e:Ljava/util/ArrayList;

    .line 120
    .line 121
    iget-object v7, v7, Lo72;->d:Lr12;

    .line 122
    .line 123
    new-instance v14, Ljg0;

    .line 124
    .line 125
    invoke-direct {v14}, Ljg0;-><init>()V

    .line 126
    .line 127
    .line 128
    const/4 v15, 0x1

    .line 129
    if-nez v7, :cond_4

    .line 130
    .line 131
    new-instance v7, Ljg0;

    .line 132
    .line 133
    invoke-direct {v7, v14}, Ljg0;-><init>(Ljg0;)V

    .line 134
    .line 135
    .line 136
    move/from16 p2, v8

    .line 137
    .line 138
    goto :goto_5

    .line 139
    :cond_4
    move/from16 p2, v8

    .line 140
    .line 141
    iget v8, v7, Lr12;->f:I

    .line 142
    .line 143
    if-eq v8, v12, :cond_a

    .line 144
    .line 145
    if-eq v8, v11, :cond_9

    .line 146
    .line 147
    if-eq v8, v10, :cond_5

    .line 148
    .line 149
    goto :goto_4

    .line 150
    :cond_5
    iget-boolean v8, v7, Lr12;->l:Z

    .line 151
    .line 152
    iput-boolean v8, v14, Ljg0;->f:Z

    .line 153
    .line 154
    iget v8, v7, Lr12;->m:I

    .line 155
    .line 156
    iput v8, v14, Ljg0;->b:I

    .line 157
    .line 158
    iget v8, v7, Lr12;->n:I

    .line 159
    .line 160
    iget-boolean v10, v7, Lr12;->o:Z

    .line 161
    .line 162
    iput-boolean v10, v14, Ljg0;->g:Z

    .line 163
    .line 164
    iput v8, v14, Ljg0;->h:I

    .line 165
    .line 166
    iget v8, v7, Lr12;->p:I

    .line 167
    .line 168
    if-nez v8, :cond_7

    .line 169
    .line 170
    :cond_6
    move v11, v15

    .line 171
    goto :goto_3

    .line 172
    :cond_7
    if-ne v8, v12, :cond_8

    .line 173
    .line 174
    goto :goto_3

    .line 175
    :cond_8
    if-ne v8, v15, :cond_6

    .line 176
    .line 177
    move v11, v12

    .line 178
    :goto_3
    iput v11, v14, Ljg0;->i:I

    .line 179
    .line 180
    :cond_9
    iget-object v8, v7, Lr12;->k:Lih3;

    .line 181
    .line 182
    if-eqz v8, :cond_a

    .line 183
    .line 184
    new-instance v10, Ll51;

    .line 185
    .line 186
    invoke-direct {v10, v8}, Ll51;-><init>(Lih3;)V

    .line 187
    .line 188
    .line 189
    iput-object v10, v14, Ljg0;->e:Ll51;

    .line 190
    .line 191
    :cond_a
    iget v8, v7, Lr12;->j:I

    .line 192
    .line 193
    iput v8, v14, Ljg0;->d:I

    .line 194
    .line 195
    :goto_4
    iget-boolean v8, v7, Lr12;->g:Z

    .line 196
    .line 197
    iput-boolean v8, v14, Ljg0;->a:Z

    .line 198
    .line 199
    iget-boolean v7, v7, Lr12;->i:Z

    .line 200
    .line 201
    iput-boolean v7, v14, Ljg0;->c:Z

    .line 202
    .line 203
    new-instance v7, Ljg0;

    .line 204
    .line 205
    invoke-direct {v7, v14}, Ljg0;-><init>(Ljg0;)V

    .line 206
    .line 207
    .line 208
    :goto_5
    invoke-virtual {v5, v7}, Lu2;->c(Ljg0;)V

    .line 209
    .line 210
    .line 211
    const-string v7, "6"

    .line 212
    .line 213
    invoke-virtual {v13, v7}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 214
    .line 215
    .line 216
    move-result v7

    .line 217
    if-eqz v7, :cond_b

    .line 218
    .line 219
    :try_start_1
    new-instance v7, Lj32;

    .line 220
    .line 221
    const/4 v8, 0x0

    .line 222
    invoke-direct {v7, v8, v4}, Lj32;-><init>(ILjava/lang/Object;)V

    .line 223
    .line 224
    .line 225
    invoke-interface {v6, v7}, Lx72;->q1(Lz22;)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_1

    .line 226
    .line 227
    .line 228
    goto :goto_6

    .line 229
    :catch_1
    invoke-static/range {p2 .. p2}, Lgi2;->q0(I)Z

    .line 230
    .line 231
    .line 232
    :cond_b
    :goto_6
    const-string v7, "3"

    .line 233
    .line 234
    invoke-virtual {v13, v7}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 235
    .line 236
    .line 237
    move-result v7

    .line 238
    if-eqz v7, :cond_e

    .line 239
    .line 240
    invoke-virtual {v9}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    .line 241
    .line 242
    .line 243
    move-result-object v7

    .line 244
    invoke-interface {v7}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 245
    .line 246
    .line 247
    move-result-object v7

    .line 248
    :goto_7
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 249
    .line 250
    .line 251
    move-result v8

    .line 252
    if-eqz v8, :cond_e

    .line 253
    .line 254
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 255
    .line 256
    .line 257
    move-result-object v8

    .line 258
    check-cast v8, Ljava/lang/String;

    .line 259
    .line 260
    invoke-virtual {v9, v8}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 261
    .line 262
    .line 263
    move-result-object v10

    .line 264
    check-cast v10, Ljava/lang/Boolean;

    .line 265
    .line 266
    invoke-virtual {v10}, Ljava/lang/Boolean;->booleanValue()Z

    .line 267
    .line 268
    .line 269
    move-result v10

    .line 270
    const/4 v11, 0x0

    .line 271
    if-eq v15, v10, :cond_c

    .line 272
    .line 273
    move-object v10, v11

    .line 274
    goto :goto_8

    .line 275
    :cond_c
    move-object v10, v4

    .line 276
    :goto_8
    new-instance v12, Lt83;

    .line 277
    .line 278
    invoke-direct {v12, v4, v10}, Lt83;-><init>(Lrx2;Lrx2;)V

    .line 279
    .line 280
    .line 281
    :try_start_2
    new-instance v13, Li32;

    .line 282
    .line 283
    invoke-direct {v13, v12}, Li32;-><init>(Lt83;)V

    .line 284
    .line 285
    .line 286
    if-nez v10, :cond_d

    .line 287
    .line 288
    goto :goto_9

    .line 289
    :cond_d
    new-instance v11, Lh32;

    .line 290
    .line 291
    invoke-direct {v11, v12}, Lh32;-><init>(Lt83;)V

    .line 292
    .line 293
    .line 294
    :goto_9
    invoke-interface {v6, v8, v13, v11}, Lx72;->m1(Ljava/lang/String;Lv22;Lt22;)V
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_2

    .line 295
    .line 296
    .line 297
    goto :goto_7

    .line 298
    :catch_2
    invoke-static/range {p2 .. p2}, Lgi2;->q0(I)Z

    .line 299
    .line 300
    .line 301
    goto :goto_7

    .line 302
    :cond_e
    invoke-virtual {v5}, Lu2;->a()Lv2;

    .line 303
    .line 304
    .line 305
    move-result-object v4

    .line 306
    iput-object v4, v0, Lcom/google/ads/mediation/AbstractAdViewAdapter;->adLoader:Lv2;

    .line 307
    .line 308
    move-object/from16 v5, p5

    .line 309
    .line 310
    invoke-virtual {v0, v1, v3, v5, v2}, Lcom/google/ads/mediation/AbstractAdViewAdapter;->buildAdRequest(Landroid/content/Context;Lbd0;Landroid/os/Bundle;Landroid/os/Bundle;)Lb3;

    .line 311
    .line 312
    .line 313
    move-result-object v1

    .line 314
    invoke-virtual {v4, v1}, Lv2;->a(Lb3;)V

    .line 315
    .line 316
    .line 317
    return-void
.end method

.method public showInterstitial()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/ads/mediation/AbstractAdViewAdapter;->mInterstitialAd:Lg30;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-virtual {v0, v1}, Lg30;->c(Landroid/app/Activity;)V

    .line 7
    .line 8
    .line 9
    :cond_0
    return-void
.end method
