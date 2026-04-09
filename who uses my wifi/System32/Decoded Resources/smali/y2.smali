.class public final Ly2;
.super Lr9;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# virtual methods
.method public getAdSizes()[Ld3;
    .locals 1

    .line 1
    iget-object v0, p0, Lr9;->f:Le23;

    .line 2
    .line 3
    iget-object v0, v0, Le23;->g:[Ld3;

    .line 4
    .line 5
    return-object v0
.end method

.method public getAppEventListener()Lb8;
    .locals 1

    .line 1
    iget-object v0, p0, Lr9;->f:Le23;

    .line 2
    .line 3
    iget-object v0, v0, Le23;->h:Lb8;

    .line 4
    .line 5
    return-object v0
.end method

.method public getVideoController()Lj51;
    .locals 1

    .line 1
    iget-object v0, p0, Lr9;->f:Le23;

    .line 2
    .line 3
    iget-object v0, v0, Le23;->c:Lj51;

    .line 4
    .line 5
    return-object v0
.end method

.method public getVideoOptions()Ll51;
    .locals 1

    .line 1
    iget-object v0, p0, Lr9;->f:Le23;

    .line 2
    .line 3
    iget-object v0, v0, Le23;->j:Ll51;

    .line 4
    .line 5
    return-object v0
.end method

.method public varargs setAdSizes([Ld3;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    array-length v0, p1

    .line 4
    if-lez v0, :cond_0

    .line 5
    .line 6
    iget-object v0, p0, Lr9;->f:Le23;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Le23;->d([Ld3;)V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 13
    .line 14
    const-string v0, "The supported ad sizes must contain at least one valid ad size."

    .line 15
    .line 16
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    throw p1
.end method

.method public setAppEventListener(Lb8;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lr9;->f:Le23;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Le23;->e(Lb8;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setManualImpressionsEnabled(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lr9;->f:Le23;

    .line 2
    .line 3
    iput-boolean p1, v0, Le23;->m:Z

    .line 4
    .line 5
    :try_start_0
    iget-object v0, v0, Le23;->i:Lba2;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-interface {v0, p1}, Lba2;->g1(Z)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :catch_0
    move-exception p1

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    return-void

    .line 16
    :goto_0
    const-string v0, "#007 Could not call remote method."

    .line 17
    .line 18
    invoke-static {v0, p1}, Lgi2;->p0(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public setVideoOptions(Ll51;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lr9;->f:Le23;

    .line 2
    .line 3
    iput-object p1, v0, Le23;->j:Ll51;

    .line 4
    .line 5
    :try_start_0
    iget-object v0, v0, Le23;->i:Lba2;

    .line 6
    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    if-nez p1, :cond_0

    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    new-instance v1, Lih3;

    .line 14
    .line 15
    invoke-direct {v1, p1}, Lih3;-><init>(Ll51;)V

    .line 16
    .line 17
    .line 18
    move-object p1, v1

    .line 19
    :goto_0
    invoke-interface {v0, p1}, Lba2;->J2(Lih3;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :catch_0
    move-exception p1

    .line 24
    goto :goto_1

    .line 25
    :cond_1
    return-void

    .line 26
    :goto_1
    const-string v0, "#007 Could not call remote method."

    .line 27
    .line 28
    invoke-static {v0, p1}, Lgi2;->p0(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 29
    .line 30
    .line 31
    return-void
.end method
