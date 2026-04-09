.class public final Lcq2;
.super Lf74;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ll42;


# virtual methods
.method public final T(Lta2;)V
    .locals 2

    .line 1
    new-instance v0, Lsq0;

    .line 2
    .line 3
    const/16 v1, 0xf

    .line 4
    .line 5
    invoke-direct {v0, v1, p1}, Lsq0;-><init>(ILjava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, v0}, Lf74;->P1(Ldp2;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final declared-synchronized a()V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    sget-object v0, Lsd2;->B:Lsd2;

    .line 3
    .line 4
    invoke-virtual {p0, v0}, Lf74;->P1(Ldp2;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    .line 6
    .line 7
    monitor-exit p0

    .line 8
    return-void

    .line 9
    :catchall_0
    move-exception v0

    .line 10
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 11
    throw v0
.end method

.method public final r()V
    .locals 1

    .line 1
    sget-object v0, Lqd2;->B:Lqd2;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lf74;->P1(Ldp2;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
