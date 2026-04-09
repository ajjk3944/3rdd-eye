.class public final Lrx2;
.super Lt2;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final f:Lcom/google/ads/mediation/AbstractAdViewAdapter;

.field public final g:Ljd0;


# direct methods
.method public constructor <init>(Lcom/google/ads/mediation/AbstractAdViewAdapter;Ljd0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lrx2;->f:Lcom/google/ads/mediation/AbstractAdViewAdapter;

    .line 5
    .line 6
    iput-object p2, p0, Lrx2;->g:Ljd0;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final C()V
    .locals 4

    .line 1
    iget-object v0, p0, Lrx2;->g:Ljd0;

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
    iget-object v1, v0, Lxb4;->h:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v1, Lhd1;

    .line 16
    .line 17
    iget-object v2, v0, Lxb4;->i:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v2, Lf23;

    .line 20
    .line 21
    const-string v3, "#007 Could not call remote method."

    .line 22
    .line 23
    if-nez v2, :cond_2

    .line 24
    .line 25
    if-nez v1, :cond_0

    .line 26
    .line 27
    const/4 v0, 0x0

    .line 28
    invoke-static {v3, v0}, Lgi2;->p0(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :cond_0
    iget-boolean v1, v1, Lhd1;->n:Z

    .line 33
    .line 34
    if-eqz v1, :cond_1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    const-string v0, "Could not call onAdClicked since setOverrideClickHandling is not set to true"

    .line 38
    .line 39
    invoke-static {v0}, Lgi2;->U(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :cond_2
    :goto_0
    const-string v1, "Adapter called onAdClicked."

    .line 44
    .line 45
    invoke-static {v1}, Lgi2;->U(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    :try_start_0
    iget-object v0, v0, Lxb4;->g:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v0, Lz62;

    .line 51
    .line 52
    invoke-interface {v0}, Lz62;->b()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :catch_0
    move-exception v0

    .line 57
    invoke-static {v3, v0}, Lgi2;->p0(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 58
    .line 59
    .line 60
    return-void
.end method

.method public final a()V
    .locals 2

    .line 1
    iget-object v0, p0, Lrx2;->g:Ljd0;

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
    iget-object v0, p0, Lrx2;->g:Ljd0;

    .line 2
    .line 3
    check-cast v0, Lxb4;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lxb4;->w(Lr2;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final c()V
    .locals 4

    .line 1
    iget-object v0, p0, Lrx2;->g:Ljd0;

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
    iget-object v1, v0, Lxb4;->h:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v1, Lhd1;

    .line 16
    .line 17
    iget-object v2, v0, Lxb4;->i:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v2, Lf23;

    .line 20
    .line 21
    const-string v3, "#007 Could not call remote method."

    .line 22
    .line 23
    if-nez v2, :cond_2

    .line 24
    .line 25
    if-nez v1, :cond_0

    .line 26
    .line 27
    const/4 v0, 0x0

    .line 28
    invoke-static {v3, v0}, Lgi2;->p0(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :cond_0
    iget-boolean v1, v1, Lhd1;->m:Z

    .line 33
    .line 34
    if-eqz v1, :cond_1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    const-string v0, "Could not call onAdImpression since setOverrideImpressionRecording is not set to true"

    .line 38
    .line 39
    invoke-static {v0}, Lgi2;->U(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :cond_2
    :goto_0
    const-string v1, "Adapter called onAdImpression."

    .line 44
    .line 45
    invoke-static {v1}, Lgi2;->U(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    :try_start_0
    iget-object v0, v0, Lxb4;->g:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v0, Lz62;

    .line 51
    .line 52
    invoke-interface {v0}, Lz62;->k()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :catch_0
    move-exception v0

    .line 57
    invoke-static {v3, v0}, Lgi2;->p0(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 58
    .line 59
    .line 60
    return-void
.end method

.method public final e()V
    .locals 0

    .line 1
    return-void
.end method

.method public final h()V
    .locals 2

    .line 1
    iget-object v0, p0, Lrx2;->g:Ljd0;

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
