.class public final Ln23;
.super Ln92;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final f:Landroid/content/Context;

.field public final g:Ld32;

.field public final h:Ll83;

.field public final i:Lik2;

.field public final j:Landroid/widget/FrameLayout;

.field public final k:Lmv2;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ld32;Ll83;Lik2;Lmv2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ln92;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ln23;->f:Landroid/content/Context;

    .line 5
    .line 6
    iput-object p2, p0, Ln23;->g:Ld32;

    .line 7
    .line 8
    iput-object p3, p0, Ln23;->h:Ll83;

    .line 9
    .line 10
    iput-object p4, p0, Ln23;->i:Lik2;

    .line 11
    .line 12
    iput-object p5, p0, Ln23;->k:Lmv2;

    .line 13
    .line 14
    new-instance p2, Landroid/widget/FrameLayout;

    .line 15
    .line 16
    invoke-direct {p2, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p2}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 20
    .line 21
    .line 22
    iget-object p1, p4, Lik2;->m:Landroid/view/View;

    .line 23
    .line 24
    sget-object p3, Lhg4;->C:Lhg4;

    .line 25
    .line 26
    iget-object p3, p3, Lhg4;->c:Llf4;

    .line 27
    .line 28
    new-instance p3, Landroid/view/ViewGroup$LayoutParams;

    .line 29
    .line 30
    const/4 p4, -0x1

    .line 31
    invoke-direct {p3, p4, p4}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p2, p1, p3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0}, Ln23;->o()Lxe4;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    iget p1, p1, Lxe4;->h:I

    .line 42
    .line 43
    invoke-virtual {p2, p1}, Landroid/view/View;->setMinimumHeight(I)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0}, Ln23;->o()Lxe4;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    iget p1, p1, Lxe4;->k:I

    .line 51
    .line 52
    invoke-virtual {p2, p1}, Landroid/view/View;->setMinimumWidth(I)V

    .line 53
    .line 54
    .line 55
    iput-object p2, p0, Ln23;->j:Landroid/widget/FrameLayout;

    .line 56
    .line 57
    return-void
.end method


# virtual methods
.method public final A()Lpy2;
    .locals 1

    .line 1
    iget-object v0, p0, Ln23;->i:Lik2;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    :try_start_0
    iget-object v0, v0, Lik2;->p:Ldl2;

    .line 7
    .line 8
    invoke-interface {v0}, Ldl2;->a()Lpy2;

    .line 9
    .line 10
    .line 11
    move-result-object v0
    :try_end_0
    .catch Ln83; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    return-object v0

    .line 13
    :catch_0
    const/4 v0, 0x0

    .line 14
    return-object v0
.end method

.method public final A1(Lvi4;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final C()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public final D1(Ljava/lang/String;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final E()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Ln23;->i:Lik2;

    .line 2
    .line 3
    iget-object v0, v0, Lel2;->f:Lrm2;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, v0, Lrm2;->f:Ljava/lang/String;

    .line 8
    .line 9
    return-object v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return-object v0
.end method

.method public final H()V
    .locals 0

    .line 1
    return-void
.end method

.method public final H2(Lb12;)V
    .locals 0

    .line 1
    const-string p1, "setAdClickListener is not supported in Ad Manager AdView returned by AdLoader."

    .line 2
    .line 3
    invoke-static {p1}, Lgi2;->f0(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final I0(Lwi2;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ln23;->h:Ll83;

    .line 2
    .line 3
    iget-object v0, v0, Ll83;->c:Ls23;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Ls23;->p(Lwi2;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public final J2(Lih3;)V
    .locals 0

    .line 1
    const-string p1, "setVideoOptions is not supported in Ad Manager AdView returned by AdLoader."

    .line 2
    .line 3
    invoke-static {p1}, Lgi2;->f0(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final K2(Lnw1;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final L()Z
    .locals 1

    .line 1
    iget-object v0, p0, Ln23;->i:Lik2;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, v0, Lel2;->b:La83;

    .line 6
    .line 7
    iget-boolean v0, v0, La83;->q0:Z

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    return v0

    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    return v0
.end method

.method public final N()Ltx2;
    .locals 1

    .line 1
    iget-object v0, p0, Ln23;->i:Lik2;

    .line 2
    .line 3
    iget-object v0, v0, Lel2;->f:Lrm2;

    .line 4
    .line 5
    return-object v0
.end method

.method public final N0(Lxe4;)V
    .locals 4

    .line 1
    const-string v0, "setAdSize must be called on the main UI thread."

    .line 2
    .line 3
    invoke-static {v0}, Lou1;->h(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ln23;->i:Lik2;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v1, p0, Ln23;->j:Landroid/widget/FrameLayout;

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    iget-object v2, v0, Lik2;->n:Lag2;

    .line 15
    .line 16
    if-eqz v2, :cond_0

    .line 17
    .line 18
    invoke-static {p1}, Lzq;->a(Lxe4;)Lzq;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    invoke-interface {v2, v3}, Lag2;->Z(Lzq;)V

    .line 23
    .line 24
    .line 25
    iget v2, p1, Lxe4;->h:I

    .line 26
    .line 27
    invoke-virtual {v1, v2}, Landroid/view/View;->setMinimumHeight(I)V

    .line 28
    .line 29
    .line 30
    iget v2, p1, Lxe4;->k:I

    .line 31
    .line 32
    invoke-virtual {v1, v2}, Landroid/view/View;->setMinimumWidth(I)V

    .line 33
    .line 34
    .line 35
    iput-object p1, v0, Lik2;->u:Lxe4;

    .line 36
    .line 37
    :cond_0
    return-void
.end method

.method public final N1(Lpk2;)V
    .locals 0

    .line 1
    const-string p1, "setCorrelationIdProvider is not supported in Ad Manager AdView returned by AdLoader."

    .line 2
    .line 3
    invoke-static {p1}, Lgi2;->f0(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final W2(Ld32;)V
    .locals 0

    .line 1
    const-string p1, "setAdListener is not supported in Ad Manager AdView returned by AdLoader."

    .line 2
    .line 3
    invoke-static {p1}, Lgi2;->f0(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final Z(Lpc4;)Z
    .locals 0

    .line 1
    const-string p1, "loadAd is not supported for an Ad Manager AdView returned from AdLoader."

    .line 2
    .line 3
    invoke-static {p1}, Lgi2;->f0(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    return p1
.end method

.method public final Z1(Lzu2;)V
    .locals 2

    .line 1
    sget-object v0, Lmz1;->pc:Liz1;

    .line 2
    .line 3
    sget-object v1, Ltw1;->e:Ltw1;

    .line 4
    .line 5
    iget-object v1, v1, Ltw1;->c:Lkz1;

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Ljava/lang/Boolean;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_2

    .line 18
    .line 19
    iget-object v0, p0, Ln23;->h:Ll83;

    .line 20
    .line 21
    iget-object v0, v0, Ll83;->c:Ls23;

    .line 22
    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    :try_start_0
    invoke-interface {p1}, Lzu2;->c()Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-nez v1, :cond_0

    .line 30
    .line 31
    iget-object v1, p0, Ln23;->k:Lmv2;

    .line 32
    .line 33
    invoke-virtual {v1}, Lmv2;->b()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :catch_0
    const/4 v1, 0x3

    .line 38
    invoke-static {v1}, Lgi2;->q0(I)Z

    .line 39
    .line 40
    .line 41
    :cond_0
    :goto_0
    iget-object v0, v0, Ls23;->h:Ljava/util/concurrent/atomic/AtomicReference;

    .line 42
    .line 43
    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    :cond_1
    return-void

    .line 47
    :cond_2
    const-string p1, "setOnPaidEventListener is not supported in Ad Manager AdView returned by AdLoader."

    .line 48
    .line 49
    invoke-static {p1}, Lgi2;->f0(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    return-void
.end method

.method public final a1(Lpc4;Lp42;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final c()V
    .locals 3

    .line 1
    const-string v0, "destroy must be called on the main UI thread."

    .line 2
    .line 3
    invoke-static {v0}, Lou1;->h(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ln23;->i:Lik2;

    .line 7
    .line 8
    iget-object v0, v0, Lel2;->c:Lfn2;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    new-instance v1, Lzj0;

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    invoke-direct {v1, v2}, Lzj0;-><init>(Landroid/content/Context;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v1}, Lf74;->P1(Ldp2;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public final d()Lu10;
    .locals 2

    .line 1
    new-instance v0, Loi0;

    .line 2
    .line 3
    iget-object v1, p0, Ln23;->j:Landroid/widget/FrameLayout;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Loi0;-><init>(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public final e()V
    .locals 4

    .line 1
    const-string v0, "destroy must be called on the main UI thread."

    .line 2
    .line 3
    invoke-static {v0}, Lou1;->h(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ln23;->i:Lik2;

    .line 7
    .line 8
    iget-object v0, v0, Lel2;->c:Lfn2;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    new-instance v1, Lnc3;

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    const/4 v3, 0x0

    .line 17
    invoke-direct {v1, v3, v2}, Lnc3;-><init>(Landroid/content/Context;Z)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v1}, Lf74;->P1(Ldp2;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final g1(Z)V
    .locals 0

    .line 1
    const-string p1, "setManualImpressionsEnabled is not supported in Ad Manager AdView returned by AdLoader."

    .line 2
    .line 3
    invoke-static {p1}, Lgi2;->f0(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final i()V
    .locals 0

    .line 1
    return-void
.end method

.method public final i2()V
    .locals 1

    .line 1
    const-string v0, "setAdMetadataListener is not supported in Ad Manager AdView returned by AdLoader."

    .line 2
    .line 3
    invoke-static {v0}, Lgi2;->f0(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final k()Landroid/os/Bundle;
    .locals 1

    .line 1
    const-string v0, "getAdMetadata is not supported in Ad Manager AdView returned by AdLoader."

    .line 2
    .line 3
    invoke-static {v0}, Lgi2;->f0(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Landroid/os/Bundle;

    .line 7
    .line 8
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method public final k0()J
    .locals 2

    .line 1
    iget-object v0, p0, Ln23;->i:Lik2;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, v0, Lel2;->j:Lgm2;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, v0, Lgm2;->a:Ljava/util/concurrent/atomic/AtomicLong;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    return-wide v0

    .line 16
    :cond_0
    const-wide/16 v0, 0x0

    .line 17
    .line 18
    return-wide v0
.end method

.method public final k3(Lu10;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final l()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public final m()V
    .locals 0

    .line 1
    return-void
.end method

.method public final n()V
    .locals 2

    .line 1
    iget-object v0, p0, Ln23;->i:Lik2;

    .line 2
    .line 3
    iget-object v0, v0, Lik2;->r:Lyp2;

    .line 4
    .line 5
    monitor-enter v0

    .line 6
    :try_start_0
    sget-object v1, Lsd2;->A:Lsd2;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Lf74;->P1(Ldp2;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    .line 10
    .line 11
    monitor-exit v0

    .line 12
    return-void

    .line 13
    :catchall_0
    move-exception v1

    .line 14
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 15
    throw v1
.end method

.method public final n2(Lma2;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final o()Lxe4;
    .locals 2

    .line 1
    const-string v0, "getAdSize must be called on the main UI thread."

    .line 2
    .line 3
    invoke-static {v0}, Lou1;->h(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ln23;->i:Lik2;

    .line 7
    .line 8
    invoke-virtual {v0}, Lik2;->c()Lb83;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iget-object v1, p0, Ln23;->f:Landroid/content/Context;

    .line 17
    .line 18
    invoke-static {v1, v0}, La30;->n(Landroid/content/Context;Ljava/util/List;)Lxe4;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    return-object v0
.end method

.method public final o2(Lpl2;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final o3(Lvz1;)V
    .locals 0

    .line 1
    const-string p1, "setOnCustomRenderedAdLoadedListener is not supported in Ad Manager AdView returned by AdLoader."

    .line 2
    .line 3
    invoke-static {p1}, Lgi2;->f0(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final p0()V
    .locals 0

    .line 1
    return-void
.end method

.method public final p2()Ld32;
    .locals 1

    .line 1
    iget-object v0, p0, Ln23;->g:Ld32;

    .line 2
    .line 3
    return-object v0
.end method

.method public final q()V
    .locals 0

    .line 1
    return-void
.end method

.method public final r()V
    .locals 4

    .line 1
    const-string v0, "destroy must be called on the main UI thread."

    .line 2
    .line 3
    invoke-static {v0}, Lou1;->h(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ln23;->i:Lik2;

    .line 7
    .line 8
    iget-object v0, v0, Lel2;->c:Lfn2;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    new-instance v1, Lz71;

    .line 14
    .line 15
    const/16 v2, 0x14

    .line 16
    .line 17
    const/4 v3, 0x0

    .line 18
    invoke-direct {v1, v2, v3}, Lz71;-><init>(ILjava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v1}, Lf74;->P1(Ldp2;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public final s()Lwi2;
    .locals 1

    .line 1
    iget-object v0, p0, Ln23;->h:Ll83;

    .line 2
    .line 3
    iget-object v0, v0, Ll83;->o:Lwi2;

    .line 4
    .line 5
    return-object v0
.end method

.method public final s1(J)V
    .locals 1

    .line 1
    iget-object v0, p0, Ln23;->i:Lik2;

    .line 2
    .line 3
    iget-object v0, v0, Lel2;->j:Lgm2;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0, p1, p2}, Lgm2;->a(J)V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public final t1(Z)V
    .locals 0

    .line 1
    return-void
.end method

.method public final u()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Ln23;->i:Lik2;

    .line 2
    .line 3
    iget-object v0, v0, Lel2;->f:Lrm2;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, v0, Lrm2;->f:Ljava/lang/String;

    .line 8
    .line 9
    return-object v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return-object v0
.end method

.method public final v()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Ln23;->h:Ll83;

    .line 2
    .line 3
    iget-object v0, v0, Ll83;->g:Ljava/lang/String;

    .line 4
    .line 5
    return-object v0
.end method
