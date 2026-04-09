.class public final Ljw2;
.super Lhv1;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lb52;


# instance fields
.field public final synthetic f:Ljava/lang/Object;

.field public final synthetic g:Ljava/lang/String;

.field public final synthetic h:J

.field public final synthetic i:Laa3;

.field public final synthetic j:Lpd2;

.field public final synthetic k:Lmw2;


# direct methods
.method public constructor <init>(JLjava/lang/Object;Ljava/lang/String;Lpd2;Lmw2;Laa3;)V
    .locals 0

    .line 1
    iput-object p3, p0, Ljw2;->f:Ljava/lang/Object;

    .line 2
    .line 3
    iput-object p4, p0, Ljw2;->g:Ljava/lang/String;

    .line 4
    .line 5
    iput-wide p1, p0, Ljw2;->h:J

    .line 6
    .line 7
    iput-object p7, p0, Ljw2;->i:Laa3;

    .line 8
    .line 9
    iput-object p5, p0, Ljw2;->j:Lpd2;

    .line 10
    .line 11
    invoke-static {p6}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    iput-object p6, p0, Ljw2;->k:Lmw2;

    .line 15
    .line 16
    const-string p1, "com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback"

    .line 17
    .line 18
    invoke-direct {p0, p1}, Lhv1;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final A3(ILandroid/os/Parcel;Landroid/os/Parcel;)Z
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    if-eq p1, v0, :cond_1

    .line 3
    .line 4
    const/4 v0, 0x3

    .line 5
    if-eq p1, v0, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    return p1

    .line 9
    :cond_0
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-static {p2}, Liv1;->f(Landroid/os/Parcel;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, p1}, Ljw2;->B3(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_1
    invoke-virtual {p0}, Ljw2;->b()V

    .line 21
    .line 22
    .line 23
    :goto_0
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 24
    .line 25
    .line 26
    const/4 p1, 0x1

    .line 27
    return p1
.end method

.method public final B3(Ljava/lang/String;)V
    .locals 7

    .line 1
    iget-object v0, p0, Ljw2;->f:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Ljw2;->k:Lmw2;

    .line 5
    .line 6
    iget-object v2, p0, Ljw2;->g:Ljava/lang/String;

    .line 7
    .line 8
    sget-object v3, Lhg4;->C:Lhg4;

    .line 9
    .line 10
    iget-object v3, v3, Lhg4;->k:Lym;

    .line 11
    .line 12
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 16
    .line 17
    .line 18
    move-result-wide v3

    .line 19
    iget-wide v5, p0, Ljw2;->h:J

    .line 20
    .line 21
    sub-long/2addr v3, v5

    .line 22
    long-to-int v3, v3

    .line 23
    const/4 v4, 0x0

    .line 24
    invoke-virtual {v1, v2, v3, p1, v4}, Lmw2;->d(Ljava/lang/String;ILjava/lang/String;Z)V

    .line 25
    .line 26
    .line 27
    iget-object v3, v1, Lmw2;->l:Lrv2;

    .line 28
    .line 29
    const-string v5, "error"

    .line 30
    .line 31
    invoke-virtual {v3, v2, v5}, Lrv2;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    iget-object v3, v1, Lmw2;->o:Lkp2;

    .line 35
    .line 36
    const-string v5, "error"

    .line 37
    .line 38
    invoke-virtual {v3, v2, v5}, Lkp2;->s(Ljava/lang/String;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    iget-object v1, v1, Lmw2;->p:Lea3;

    .line 42
    .line 43
    iget-object v2, p0, Ljw2;->i:Laa3;

    .line 44
    .line 45
    invoke-interface {v2, p1}, Laa3;->m(Ljava/lang/String;)Laa3;

    .line 46
    .line 47
    .line 48
    invoke-interface {v2, v4}, Laa3;->b(Z)Laa3;

    .line 49
    .line 50
    .line 51
    invoke-interface {v2}, Laa3;->n()Lca3;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    invoke-virtual {v1, p1}, Lea3;->b(Lca3;)V

    .line 56
    .line 57
    .line 58
    iget-object p1, p0, Ljw2;->j:Lpd2;

    .line 59
    .line 60
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 61
    .line 62
    invoke-virtual {p1, v1}, Lpd2;->a(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    monitor-exit v0

    .line 66
    return-void

    .line 67
    :catchall_0
    move-exception p1

    .line 68
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 69
    throw p1
.end method

.method public final b()V
    .locals 8

    .line 1
    iget-object v0, p0, Ljw2;->f:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Ljw2;->k:Lmw2;

    .line 5
    .line 6
    iget-object v2, p0, Ljw2;->g:Ljava/lang/String;

    .line 7
    .line 8
    const-string v3, ""

    .line 9
    .line 10
    sget-object v4, Lhg4;->C:Lhg4;

    .line 11
    .line 12
    iget-object v4, v4, Lhg4;->k:Lym;

    .line 13
    .line 14
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 18
    .line 19
    .line 20
    move-result-wide v4

    .line 21
    iget-wide v6, p0, Ljw2;->h:J

    .line 22
    .line 23
    sub-long/2addr v4, v6

    .line 24
    long-to-int v4, v4

    .line 25
    const/4 v5, 0x1

    .line 26
    invoke-virtual {v1, v2, v4, v3, v5}, Lmw2;->d(Ljava/lang/String;ILjava/lang/String;Z)V

    .line 27
    .line 28
    .line 29
    iget-object v3, v1, Lmw2;->l:Lrv2;

    .line 30
    .line 31
    invoke-virtual {v3, v2}, Lrv2;->b(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    iget-object v3, v1, Lmw2;->o:Lkp2;

    .line 35
    .line 36
    invoke-virtual {v3, v2}, Lkp2;->w(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    iget-object v1, v1, Lmw2;->p:Lea3;

    .line 40
    .line 41
    iget-object v2, p0, Ljw2;->i:Laa3;

    .line 42
    .line 43
    invoke-interface {v2, v5}, Laa3;->b(Z)Laa3;

    .line 44
    .line 45
    .line 46
    invoke-interface {v2}, Laa3;->n()Lca3;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    invoke-virtual {v1, v2}, Lea3;->b(Lca3;)V

    .line 51
    .line 52
    .line 53
    iget-object v1, p0, Ljw2;->j:Lpd2;

    .line 54
    .line 55
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 56
    .line 57
    invoke-virtual {v1, v2}, Lpd2;->a(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    monitor-exit v0

    .line 61
    return-void

    .line 62
    :catchall_0
    move-exception v1

    .line 63
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 64
    throw v1
.end method
