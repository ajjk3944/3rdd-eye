.class public Lcom/google/android/gms/ads/internal/util/WorkManagerUtil;
.super Lhv1;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ly42;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    const-string v0, "com.google.android.gms.ads.internal.util.IWorkManagerUtil"

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lhv1;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final A3(ILandroid/os/Parcel;Landroid/os/Parcel;)Z
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    if-eq p1, v0, :cond_2

    .line 3
    .line 4
    const/4 v1, 0x2

    .line 5
    if-eq p1, v1, :cond_1

    .line 6
    .line 7
    const/4 v1, 0x3

    .line 8
    if-eq p1, v1, :cond_0

    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    return p1

    .line 12
    :cond_0
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-static {p1}, Loi0;->X0(Landroid/os/IBinder;)Lu10;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    sget-object v1, Lgd1;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 21
    .line 22
    invoke-static {p2, v1}, Liv1;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    check-cast v1, Lgd1;

    .line 27
    .line 28
    invoke-static {p2}, Liv1;->f(Landroid/os/Parcel;)V

    .line 29
    .line 30
    .line 31
    invoke-interface {p0, p1, v1}, Ly42;->zzg(Lu10;Lgd1;)Z

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeInt(I)V

    .line 39
    .line 40
    .line 41
    return v0

    .line 42
    :cond_1
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-static {p1}, Loi0;->X0(Landroid/os/IBinder;)Lu10;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-static {p2}, Liv1;->f(Landroid/os/Parcel;)V

    .line 51
    .line 52
    .line 53
    invoke-interface {p0, p1}, Ly42;->zzf(Lu10;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 57
    .line 58
    .line 59
    return v0

    .line 60
    :cond_2
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    invoke-static {p1}, Loi0;->X0(Landroid/os/IBinder;)Lu10;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    invoke-static {p2}, Liv1;->f(Landroid/os/Parcel;)V

    .line 77
    .line 78
    .line 79
    invoke-interface {p0, p1, v1, v2}, Ly42;->zze(Lu10;Ljava/lang/String;Ljava/lang/String;)Z

    .line 80
    .line 81
    .line 82
    move-result p1

    .line 83
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 84
    .line 85
    .line 86
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeInt(I)V

    .line 87
    .line 88
    .line 89
    return v0
.end method

.method public final zze(Lu10;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 2

    .line 1
    new-instance v0, Lgd1;

    .line 2
    .line 3
    const-string v1, ""

    .line 4
    .line 5
    invoke-direct {v0, p2, p3, v1}, Lgd1;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/ads/internal/util/WorkManagerUtil;->zzg(Lu10;Lgd1;)Z

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    return p1
.end method

.method public final zzf(Lu10;)V
    .locals 6

    .line 1
    invoke-static {p1}, Loi0;->l1(Lu10;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Landroid/content/Context;

    .line 6
    .line 7
    :try_start_0
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    new-instance v1, Lpz;

    .line 12
    .line 13
    const/16 v2, 0xf

    .line 14
    .line 15
    invoke-direct {v1, v2}, Lpz;-><init>(I)V

    .line 16
    .line 17
    .line 18
    new-instance v2, Lru0;

    .line 19
    .line 20
    invoke-direct {v2, v1}, Lru0;-><init>(Lpz;)V

    .line 21
    .line 22
    .line 23
    invoke-static {v0, v2}, Lha1;->k0(Landroid/content/Context;Lru0;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 24
    .line 25
    .line 26
    :catch_0
    :try_start_1
    invoke-static {p1}, Lha1;->j0(Landroid/content/Context;)Lha1;

    .line 27
    .line 28
    .line 29
    move-result-object p1
    :try_end_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_1

    .line 30
    new-instance v0, Lfd;

    .line 31
    .line 32
    const/4 v1, 0x0

    .line 33
    invoke-direct {v0, p1, v1}, Lfd;-><init>(Lha1;I)V

    .line 34
    .line 35
    .line 36
    iget-object v1, p1, Lha1;->s:Lxb4;

    .line 37
    .line 38
    invoke-virtual {v1, v0}, Lxb4;->j(Ljava/lang/Runnable;)V

    .line 39
    .line 40
    .line 41
    new-instance v0, Lhj;

    .line 42
    .line 43
    invoke-direct {v0}, Lhj;-><init>()V

    .line 44
    .line 45
    .line 46
    new-instance v1, Lri;

    .line 47
    .line 48
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 49
    .line 50
    .line 51
    const/4 v2, 0x1

    .line 52
    iput v2, v1, Lri;->a:I

    .line 53
    .line 54
    const-wide/16 v2, -0x1

    .line 55
    .line 56
    iput-wide v2, v1, Lri;->f:J

    .line 57
    .line 58
    iput-wide v2, v1, Lri;->g:J

    .line 59
    .line 60
    new-instance v4, Ljava/util/HashSet;

    .line 61
    .line 62
    invoke-direct {v4}, Ljava/util/HashSet;-><init>()V

    .line 63
    .line 64
    .line 65
    const/4 v4, 0x0

    .line 66
    iput-boolean v4, v1, Lri;->b:Z

    .line 67
    .line 68
    iput-boolean v4, v1, Lri;->c:Z

    .line 69
    .line 70
    const/4 v5, 0x2

    .line 71
    iput v5, v1, Lri;->a:I

    .line 72
    .line 73
    iput-boolean v4, v1, Lri;->d:Z

    .line 74
    .line 75
    iput-boolean v4, v1, Lri;->e:Z

    .line 76
    .line 77
    iput-object v0, v1, Lri;->h:Lhj;

    .line 78
    .line 79
    iput-wide v2, v1, Lri;->f:J

    .line 80
    .line 81
    iput-wide v2, v1, Lri;->g:J

    .line 82
    .line 83
    new-instance v0, Lxb4;

    .line 84
    .line 85
    const-class v2, Lcom/google/android/gms/ads/internal/offline/buffering/OfflinePingSender;

    .line 86
    .line 87
    invoke-direct {v0, v2}, Lxb4;-><init>(Ljava/lang/Class;)V

    .line 88
    .line 89
    .line 90
    iget-object v2, v0, Lxb4;->h:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast v2, Loa1;

    .line 93
    .line 94
    iput-object v1, v2, Loa1;->j:Lri;

    .line 95
    .line 96
    iget-object v1, v0, Lxb4;->i:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast v1, Ljava/util/HashSet;

    .line 99
    .line 100
    const-string v2, "offline_ping_sender_work"

    .line 101
    .line 102
    invoke-virtual {v1, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    invoke-virtual {v0}, Lxb4;->f()Lmj0;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    invoke-virtual {p1, v0}, Luk2;->n(Lmj0;)V

    .line 110
    .line 111
    .line 112
    return-void

    .line 113
    :catch_1
    const/4 p1, 0x5

    .line 114
    invoke-static {p1}, Lgi2;->q0(I)Z

    .line 115
    .line 116
    .line 117
    return-void
.end method

.method public final zzg(Lu10;Lgd1;)Z
    .locals 7

    .line 1
    invoke-static {p1}, Loi0;->l1(Lu10;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Landroid/content/Context;

    .line 6
    .line 7
    :try_start_0
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    new-instance v1, Lpz;

    .line 12
    .line 13
    const/16 v2, 0xf

    .line 14
    .line 15
    invoke-direct {v1, v2}, Lpz;-><init>(I)V

    .line 16
    .line 17
    .line 18
    new-instance v2, Lru0;

    .line 19
    .line 20
    invoke-direct {v2, v1}, Lru0;-><init>(Lpz;)V

    .line 21
    .line 22
    .line 23
    invoke-static {v0, v2}, Lha1;->k0(Landroid/content/Context;Lru0;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 24
    .line 25
    .line 26
    :catch_0
    new-instance v0, Lhj;

    .line 27
    .line 28
    invoke-direct {v0}, Lhj;-><init>()V

    .line 29
    .line 30
    .line 31
    new-instance v1, Lri;

    .line 32
    .line 33
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 34
    .line 35
    .line 36
    const/4 v2, 0x1

    .line 37
    iput v2, v1, Lri;->a:I

    .line 38
    .line 39
    const-wide/16 v3, -0x1

    .line 40
    .line 41
    iput-wide v3, v1, Lri;->f:J

    .line 42
    .line 43
    iput-wide v3, v1, Lri;->g:J

    .line 44
    .line 45
    new-instance v5, Ljava/util/HashSet;

    .line 46
    .line 47
    invoke-direct {v5}, Ljava/util/HashSet;-><init>()V

    .line 48
    .line 49
    .line 50
    const/4 v5, 0x0

    .line 51
    iput-boolean v5, v1, Lri;->b:Z

    .line 52
    .line 53
    iput-boolean v5, v1, Lri;->c:Z

    .line 54
    .line 55
    const/4 v6, 0x2

    .line 56
    iput v6, v1, Lri;->a:I

    .line 57
    .line 58
    iput-boolean v5, v1, Lri;->d:Z

    .line 59
    .line 60
    iput-boolean v5, v1, Lri;->e:Z

    .line 61
    .line 62
    iput-object v0, v1, Lri;->h:Lhj;

    .line 63
    .line 64
    iput-wide v3, v1, Lri;->f:J

    .line 65
    .line 66
    iput-wide v3, v1, Lri;->g:J

    .line 67
    .line 68
    new-instance v0, Ljava/util/HashMap;

    .line 69
    .line 70
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 71
    .line 72
    .line 73
    const-string v3, "uri"

    .line 74
    .line 75
    iget-object v4, p2, Lgd1;->f:Ljava/lang/String;

    .line 76
    .line 77
    invoke-virtual {v0, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    const-string v3, "gws_query_id"

    .line 81
    .line 82
    iget-object v4, p2, Lgd1;->g:Ljava/lang/String;

    .line 83
    .line 84
    invoke-virtual {v0, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    const-string v3, "image_url"

    .line 88
    .line 89
    iget-object p2, p2, Lgd1;->h:Ljava/lang/String;

    .line 90
    .line 91
    invoke-virtual {v0, v3, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    new-instance p2, Lim;

    .line 95
    .line 96
    invoke-direct {p2, v0}, Lim;-><init>(Ljava/util/HashMap;)V

    .line 97
    .line 98
    .line 99
    invoke-static {p2}, Lim;->c(Lim;)[B

    .line 100
    .line 101
    .line 102
    new-instance v0, Lxb4;

    .line 103
    .line 104
    const-class v3, Lcom/google/android/gms/ads/internal/offline/buffering/OfflineNotificationPoster;

    .line 105
    .line 106
    invoke-direct {v0, v3}, Lxb4;-><init>(Ljava/lang/Class;)V

    .line 107
    .line 108
    .line 109
    iget-object v3, v0, Lxb4;->h:Ljava/lang/Object;

    .line 110
    .line 111
    check-cast v3, Loa1;

    .line 112
    .line 113
    iput-object v1, v3, Loa1;->j:Lri;

    .line 114
    .line 115
    iput-object p2, v3, Loa1;->e:Lim;

    .line 116
    .line 117
    iget-object p2, v0, Lxb4;->i:Ljava/lang/Object;

    .line 118
    .line 119
    check-cast p2, Ljava/util/HashSet;

    .line 120
    .line 121
    const-string v1, "offline_notification_work"

    .line 122
    .line 123
    invoke-virtual {p2, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    invoke-virtual {v0}, Lxb4;->f()Lmj0;

    .line 127
    .line 128
    .line 129
    move-result-object p2

    .line 130
    :try_start_1
    invoke-static {p1}, Lha1;->j0(Landroid/content/Context;)Lha1;

    .line 131
    .line 132
    .line 133
    move-result-object p1
    :try_end_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_1

    .line 134
    invoke-virtual {p1, p2}, Luk2;->n(Lmj0;)V

    .line 135
    .line 136
    .line 137
    return v2

    .line 138
    :catch_1
    const/4 p1, 0x5

    .line 139
    invoke-static {p1}, Lgi2;->q0(I)Z

    .line 140
    .line 141
    .line 142
    return v5
.end method
