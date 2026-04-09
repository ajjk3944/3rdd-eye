.class public final Lvu1;
.super Lt2;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lb8;
.implements Lfd1;


# instance fields
.field public final f:Lfd0;


# direct methods
.method public constructor <init>(Lcom/google/ads/mediation/AbstractAdViewAdapter;Lfd0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lvu1;->f:Lfd0;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final C()V
    .locals 2

    .line 1
    iget-object v0, p0, Lvu1;->f:Lfd0;

    .line 2
    .line 3
    check-cast v0, Lxb4;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    const-string v1, "#008 Must be called on the main UI thread."

    .line 9
    .line 10
    invoke-static {v1}, Lou1;->h(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    const-string v1, "Adapter called onAdClicked."

    .line 14
    .line 15
    invoke-static {v1}, Lgi2;->U(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    :try_start_0
    iget-object v0, v0, Lxb4;->g:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, Lz62;

    .line 21
    .line 22
    invoke-interface {v0}, Lz62;->b()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :catch_0
    move-exception v0

    .line 27
    const-string v1, "#007 Could not call remote method."

    .line 28
    .line 29
    invoke-static {v1, v0}, Lgi2;->p0(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public final O(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lvu1;->f:Lfd0;

    .line 2
    .line 3
    check-cast v0, Lxb4;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    const-string v1, "#008 Must be called on the main UI thread."

    .line 9
    .line 10
    invoke-static {v1}, Lou1;->h(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    const-string v1, "Adapter called onAppEvent."

    .line 14
    .line 15
    invoke-static {v1}, Lgi2;->U(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    :try_start_0
    iget-object v0, v0, Lxb4;->g:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, Lz62;

    .line 21
    .line 22
    invoke-interface {v0, p1, p2}, Lz62;->v2(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :catch_0
    move-exception p1

    .line 27
    const-string p2, "#007 Could not call remote method."

    .line 28
    .line 29
    invoke-static {p2, p1}, Lgi2;->p0(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public final a()V
    .locals 2

    .line 1
    iget-object v0, p0, Lvu1;->f:Lfd0;

    .line 2
    .line 3
    check-cast v0, Lxb4;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    const-string v1, "#008 Must be called on the main UI thread."

    .line 9
    .line 10
    invoke-static {v1}, Lou1;->h(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    const-string v1, "Adapter called onAdClosed."

    .line 14
    .line 15
    invoke-static {v1}, Lgi2;->U(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    :try_start_0
    iget-object v0, v0, Lxb4;->g:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, Lz62;

    .line 21
    .line 22
    invoke-interface {v0}, Lz62;->c()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :catch_0
    move-exception v0

    .line 27
    const-string v1, "#007 Could not call remote method."

    .line 28
    .line 29
    invoke-static {v1, v0}, Lgi2;->p0(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public final b(Lu70;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lvu1;->f:Lfd0;

    .line 2
    .line 3
    check-cast v0, Lxb4;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lxb4;->t(Lr2;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final e()V
    .locals 2

    .line 1
    iget-object v0, p0, Lvu1;->f:Lfd0;

    .line 2
    .line 3
    check-cast v0, Lxb4;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    const-string v1, "#008 Must be called on the main UI thread."

    .line 9
    .line 10
    invoke-static {v1}, Lou1;->h(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    const-string v1, "Adapter called onAdLoaded."

    .line 14
    .line 15
    invoke-static {v1}, Lgi2;->U(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    :try_start_0
    iget-object v0, v0, Lxb4;->g:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, Lz62;

    .line 21
    .line 22
    invoke-interface {v0}, Lz62;->g()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :catch_0
    move-exception v0

    .line 27
    const-string v1, "#007 Could not call remote method."

    .line 28
    .line 29
    invoke-static {v1, v0}, Lgi2;->p0(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public final h()V
    .locals 2

    .line 1
    iget-object v0, p0, Lvu1;->f:Lfd0;

    .line 2
    .line 3
    check-cast v0, Lxb4;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    const-string v1, "#008 Must be called on the main UI thread."

    .line 9
    .line 10
    invoke-static {v1}, Lou1;->h(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    const-string v1, "Adapter called onAdOpened."

    .line 14
    .line 15
    invoke-static {v1}, Lgi2;->U(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    :try_start_0
    iget-object v0, v0, Lxb4;->g:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, Lz62;

    .line 21
    .line 22
    invoke-interface {v0}, Lz62;->j()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :catch_0
    move-exception v0

    .line 27
    const-string v1, "#007 Could not call remote method."

    .line 28
    .line 29
    invoke-static {v1, v0}, Lgi2;->p0(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 30
    .line 31
    .line 32
    return-void
.end method
