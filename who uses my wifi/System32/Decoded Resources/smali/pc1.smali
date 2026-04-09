.class public final Lpc1;
.super Lcc1;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final b:Lrb;

.field public final c:Lk01;

.field public final d:Lfr;


# direct methods
.method public constructor <init>(ILrb;Lk01;Lfr;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcc1;-><init>(I)V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, Lpc1;->c:Lk01;

    .line 5
    .line 6
    iput-object p2, p0, Lpc1;->b:Lrb;

    .line 7
    .line 8
    iput-object p4, p0, Lpc1;->d:Lfr;

    .line 9
    .line 10
    const/4 p3, 0x2

    .line 11
    if-ne p1, p3, :cond_1

    .line 12
    .line 13
    iget-boolean p1, p2, Lrb;->c:Z

    .line 14
    .line 15
    if-nez p1, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 19
    .line 20
    const-string p2, "Best-effort write calls cannot pass methods that should auto-resolve missing features."

    .line 21
    .line 22
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    throw p1

    .line 26
    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public final a(Lxb1;)Z
    .locals 0

    .line 1
    iget-object p1, p0, Lpc1;->b:Lrb;

    .line 2
    .line 3
    iget-boolean p1, p1, Lrb;->c:Z

    .line 4
    .line 5
    return p1
.end method

.method public final b(Lxb1;)[Lju;
    .locals 0

    .line 1
    iget-object p1, p0, Lpc1;->b:Lrb;

    .line 2
    .line 3
    iget-object p1, p1, Lrb;->d:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p1, [Lju;

    .line 6
    .line 7
    return-object p1
.end method

.method public final c(Lcom/google/android/gms/common/api/Status;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lpc1;->d:Lfr;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v0, p1, Lcom/google/android/gms/common/api/Status;->h:Landroid/app/PendingIntent;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    new-instance v0, Ltp0;

    .line 11
    .line 12
    invoke-direct {v0, p1}, Ly4;-><init>(Lcom/google/android/gms/common/api/Status;)V

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    new-instance v0, Ly4;

    .line 17
    .line 18
    invoke-direct {v0, p1}, Ly4;-><init>(Lcom/google/android/gms/common/api/Status;)V

    .line 19
    .line 20
    .line 21
    :goto_0
    iget-object p1, p0, Lpc1;->c:Lk01;

    .line 22
    .line 23
    invoke-virtual {p1, v0}, Lk01;->a(Ljava/lang/Exception;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public final d(Ljava/lang/Exception;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lpc1;->c:Lk01;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lk01;->a(Ljava/lang/Exception;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final e(Lxb1;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lpc1;->c:Lk01;

    .line 2
    .line 3
    :try_start_0
    iget-object v1, p0, Lpc1;->b:Lrb;

    .line 4
    .line 5
    iget-object p1, p1, Lxb1;->g:Lv4;

    .line 6
    .line 7
    iget-object v1, v1, Lrb;->e:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, Lsq0;

    .line 10
    .line 11
    iget-object v1, v1, Lsq0;->g:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v1, Lgp0;

    .line 14
    .line 15
    invoke-interface {v1, p1, v0}, Lgp0;->accept(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/os/DeadObjectException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :catch_0
    move-exception p1

    .line 20
    goto :goto_0

    .line 21
    :catch_1
    move-exception p1

    .line 22
    goto :goto_1

    .line 23
    :catch_2
    move-exception p1

    .line 24
    goto :goto_2

    .line 25
    :goto_0
    invoke-virtual {v0, p1}, Lk01;->a(Ljava/lang/Exception;)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :goto_1
    invoke-static {p1}, Lcc1;->g(Landroid/os/RemoteException;)Lcom/google/android/gms/common/api/Status;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-virtual {p0, p1}, Lpc1;->c(Lcom/google/android/gms/common/api/Status;)V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :goto_2
    throw p1
.end method

.method public final f(Ltb1;Z)V
    .locals 3

    .line 1
    iget-object v0, p1, Ltb1;->b:Ljava/util/Map;

    .line 2
    .line 3
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    iget-object v1, p0, Lpc1;->c:Lk01;

    .line 8
    .line 9
    invoke-interface {v0, v1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    iget-object p2, v1, Lk01;->a:Lgi4;

    .line 13
    .line 14
    new-instance v0, Lgw3;

    .line 15
    .line 16
    const/16 v2, 0x10

    .line 17
    .line 18
    invoke-direct {v0, p1, v1, v2}, Lgw3;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    sget-object p1, Lm01;->a:Lia1;

    .line 25
    .line 26
    new-instance v1, Lmn2;

    .line 27
    .line 28
    invoke-direct {v1, p1, v0}, Lmn2;-><init>(Ljava/util/concurrent/Executor;Ldj0;)V

    .line 29
    .line 30
    .line 31
    iget-object p1, p2, Lgi4;->b:Lwy0;

    .line 32
    .line 33
    invoke-virtual {p1, v1}, Lwy0;->c(Lje4;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p2}, Lgi4;->h()V

    .line 37
    .line 38
    .line 39
    return-void
.end method
