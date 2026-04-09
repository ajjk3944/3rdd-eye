.class public final Lb62;
.super Le6;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final c:Ljava/lang/Object;

.field public d:Z

.field public e:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Le6;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/Object;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lb62;->c:Ljava/lang/Object;

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    iput-boolean v0, p0, Lb62;->d:Z

    .line 13
    .line 14
    iput v0, p0, Lb62;->e:I

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final w()Lx52;
    .locals 4

    .line 1
    new-instance v0, Lx52;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lx52;-><init>(Lb62;)V

    .line 4
    .line 5
    .line 6
    const-string v1, "createNewReference: Trying to acquire lock"

    .line 7
    .line 8
    invoke-static {v1}, Lgi2;->G(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Lb62;->c:Ljava/lang/Object;

    .line 12
    .line 13
    monitor-enter v1

    .line 14
    :try_start_0
    const-string v2, "createNewReference: Lock acquired"

    .line 15
    .line 16
    invoke-static {v2}, Lgi2;->G(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    new-instance v2, Lkf3;

    .line 20
    .line 21
    invoke-direct {v2, p0, v0}, Lkf3;-><init>(Lb62;Lx52;)V

    .line 22
    .line 23
    .line 24
    new-instance v3, Lof3;

    .line 25
    .line 26
    invoke-direct {v3, p0, v0}, Lof3;-><init>(Lb62;Lx52;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0, v2, v3}, Le6;->t(Ltd2;Lrd2;)V

    .line 30
    .line 31
    .line 32
    iget v2, p0, Lb62;->e:I

    .line 33
    .line 34
    if-ltz v2, :cond_0

    .line 35
    .line 36
    add-int/lit8 v2, v2, 0x1

    .line 37
    .line 38
    iput v2, p0, Lb62;->e:I

    .line 39
    .line 40
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 41
    const-string v1, "createNewReference: Lock released"

    .line 42
    .line 43
    invoke-static {v1}, Lgi2;->G(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    return-object v0

    .line 47
    :catchall_0
    move-exception v0

    .line 48
    goto :goto_0

    .line 49
    :cond_0
    :try_start_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 50
    .line 51
    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    .line 52
    .line 53
    .line 54
    throw v0

    .line 55
    :goto_0
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 56
    throw v0
.end method

.method public final x()V
    .locals 2

    .line 1
    const-string v0, "releaseOneReference: Trying to acquire lock"

    .line 2
    .line 3
    invoke-static {v0}, Lgi2;->G(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lb62;->c:Ljava/lang/Object;

    .line 7
    .line 8
    monitor-enter v0

    .line 9
    :try_start_0
    const-string v1, "releaseOneReference: Lock acquired"

    .line 10
    .line 11
    invoke-static {v1}, Lgi2;->G(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    iget v1, p0, Lb62;->e:I

    .line 15
    .line 16
    if-lez v1, :cond_0

    .line 17
    .line 18
    const-string v1, "Releasing 1 reference for JS Engine"

    .line 19
    .line 20
    invoke-static {v1}, Lgi2;->G(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    iget v1, p0, Lb62;->e:I

    .line 24
    .line 25
    add-int/lit8 v1, v1, -0x1

    .line 26
    .line 27
    iput v1, p0, Lb62;->e:I

    .line 28
    .line 29
    invoke-virtual {p0}, Lb62;->z()V

    .line 30
    .line 31
    .line 32
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    const-string v0, "releaseOneReference: Lock released"

    .line 34
    .line 35
    invoke-static {v0}, Lgi2;->G(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :catchall_0
    move-exception v1

    .line 40
    goto :goto_0

    .line 41
    :cond_0
    :try_start_1
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 42
    .line 43
    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 44
    .line 45
    .line 46
    throw v1

    .line 47
    :goto_0
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 48
    throw v1
.end method

.method public final y()V
    .locals 2

    .line 1
    const-string v0, "markAsDestroyable: Trying to acquire lock"

    .line 2
    .line 3
    invoke-static {v0}, Lgi2;->G(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lb62;->c:Ljava/lang/Object;

    .line 7
    .line 8
    monitor-enter v0

    .line 9
    :try_start_0
    const-string v1, "markAsDestroyable: Lock acquired"

    .line 10
    .line 11
    invoke-static {v1}, Lgi2;->G(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    iget v1, p0, Lb62;->e:I

    .line 15
    .line 16
    if-ltz v1, :cond_0

    .line 17
    .line 18
    const-string v1, "Releasing root reference. JS Engine will be destroyed once other references are released."

    .line 19
    .line 20
    invoke-static {v1}, Lgi2;->G(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    const/4 v1, 0x1

    .line 24
    iput-boolean v1, p0, Lb62;->d:Z

    .line 25
    .line 26
    invoke-virtual {p0}, Lb62;->z()V

    .line 27
    .line 28
    .line 29
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    const-string v0, "markAsDestroyable: Lock released"

    .line 31
    .line 32
    invoke-static {v0}, Lgi2;->G(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :catchall_0
    move-exception v1

    .line 37
    goto :goto_0

    .line 38
    :cond_0
    :try_start_1
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 39
    .line 40
    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 41
    .line 42
    .line 43
    throw v1

    .line 44
    :goto_0
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 45
    throw v1
.end method

.method public final z()V
    .locals 4

    .line 1
    const-string v0, "maybeDestroy: Trying to acquire lock"

    .line 2
    .line 3
    invoke-static {v0}, Lgi2;->G(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lb62;->c:Ljava/lang/Object;

    .line 7
    .line 8
    monitor-enter v0

    .line 9
    :try_start_0
    const-string v1, "maybeDestroy: Lock acquired"

    .line 10
    .line 11
    invoke-static {v1}, Lgi2;->G(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    iget v1, p0, Lb62;->e:I

    .line 15
    .line 16
    if-ltz v1, :cond_1

    .line 17
    .line 18
    iget-boolean v2, p0, Lb62;->d:Z

    .line 19
    .line 20
    if-eqz v2, :cond_0

    .line 21
    .line 22
    if-nez v1, :cond_0

    .line 23
    .line 24
    const-string v1, "No reference is left (including root). Cleaning up engine."

    .line 25
    .line 26
    invoke-static {v1}, Lgi2;->G(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    new-instance v1, Lts0;

    .line 30
    .line 31
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 32
    .line 33
    .line 34
    new-instance v2, Lsd2;

    .line 35
    .line 36
    const/4 v3, 0x0

    .line 37
    invoke-direct {v2, v3}, Lsd2;-><init>(I)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0, v1, v2}, Le6;->t(Ltd2;Lrd2;)V

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :catchall_0
    move-exception v1

    .line 45
    goto :goto_1

    .line 46
    :cond_0
    const-string v1, "There are still references to the engine. Not destroying."

    .line 47
    .line 48
    invoke-static {v1}, Lgi2;->G(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 52
    const-string v0, "maybeDestroy: Lock released"

    .line 53
    .line 54
    invoke-static {v0}, Lgi2;->G(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    :cond_1
    :try_start_1
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 59
    .line 60
    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 61
    .line 62
    .line 63
    throw v1

    .line 64
    :goto_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 65
    throw v1
.end method
