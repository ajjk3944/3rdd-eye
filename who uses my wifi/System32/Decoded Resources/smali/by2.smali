.class public final Lby2;
.super Lfy2;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final l:Landroid/content/Context;

.field public final m:Le51;

.field public final n:Lz71;


# direct methods
.method public constructor <init>(Landroid/content/Context;Le51;Lz71;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lfy2;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lby2;->l:Landroid/content/Context;

    .line 5
    .line 6
    iput-object p2, p0, Lby2;->m:Le51;

    .line 7
    .line 8
    iput-object p3, p0, Lby2;->n:Lz71;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final T(I)V
    .locals 3

    .line 1
    const-string v0, "Cannot connect to remote service, fallback to local instance."

    .line 2
    .line 3
    invoke-static {v0}, Lgi2;->U(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Landroid/os/RemoteException;

    .line 7
    .line 8
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    new-instance v2, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    add-int/lit8 v1, v1, 0x21

    .line 19
    .line 20
    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 21
    .line 22
    .line 23
    const-string v1, "Connection suspended with cause: "

    .line 24
    .line 25
    invoke-static {v2, v1, p1}, Lex0;->j(Ljava/lang/StringBuilder;Ljava/lang/String;I)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-direct {v0, p1}, Landroid/os/RemoteException;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    iget-object p1, p0, Lby2;->n:Lz71;

    .line 33
    .line 34
    invoke-virtual {p1, v0}, Lz71;->m(Landroid/os/RemoteException;)V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public final U(Lrh;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Lfy2;->U(Lrh;)V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/os/RemoteException;

    .line 5
    .line 6
    iget-object p1, p1, Lrh;->i:Ljava/lang/String;

    .line 7
    .line 8
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    const-string v1, "Connection failed: "

    .line 13
    .line 14
    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-direct {v0, p1}, Landroid/os/RemoteException;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    iget-object p1, p0, Lby2;->n:Lz71;

    .line 22
    .line 23
    invoke-virtual {p1, v0}, Lz71;->m(Landroid/os/RemoteException;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public final Y()V
    .locals 3

    .line 1
    iget-object v0, p0, Lfy2;->g:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-boolean v1, p0, Lfy2;->i:Z

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    iput-boolean v1, p0, Lfy2;->i:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    .line 11
    :try_start_1
    iget-object v1, p0, Lfy2;->k:Lvw1;

    .line 12
    .line 13
    invoke-virtual {v1}, Lw9;->t()Landroid/os/IInterface;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Ly92;

    .line 18
    .line 19
    iget-object v2, p0, Lby2;->m:Le51;

    .line 20
    .line 21
    iget-object v2, v2, Le51;->f:Ljava/lang/String;

    .line 22
    .line 23
    invoke-interface {v1, v2}, Ly92;->q0(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    iget-object v1, p0, Lby2;->n:Lz71;

    .line 27
    .line 28
    invoke-virtual {v1}, Lz71;->a()V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :catchall_0
    move-exception v1

    .line 33
    goto :goto_1

    .line 34
    :catch_0
    move-exception v1

    .line 35
    :try_start_2
    iget-object v2, p0, Lby2;->n:Lz71;

    .line 36
    .line 37
    invoke-virtual {v2, v1}, Lz71;->m(Landroid/os/RemoteException;)V

    .line 38
    .line 39
    .line 40
    :cond_0
    :goto_0
    monitor-exit v0

    .line 41
    return-void

    .line 42
    :goto_1
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 43
    throw v1
.end method
