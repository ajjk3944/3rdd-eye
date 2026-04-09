.class public final Lu2;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lx72;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 3

    .line 1
    const-string v0, "context cannot be null"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lou1;->k(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lsv1;->f:Lsv1;

    .line 7
    .line 8
    iget-object v0, v0, Lsv1;->b:Lbu1;

    .line 9
    .line 10
    new-instance v1, Ls62;

    .line 11
    .line 12
    invoke-direct {v1}, Ls62;-><init>()V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    new-instance v2, Lno1;

    .line 19
    .line 20
    invoke-direct {v2, v0, p1, p2, v1}, Lno1;-><init>(Lbu1;Landroid/content/Context;Ljava/lang/String;Ls62;)V

    .line 21
    .line 22
    .line 23
    const/4 p2, 0x0

    .line 24
    invoke-virtual {v2, p1, p2}, Lzu1;->d(Landroid/content/Context;Z)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p2

    .line 28
    check-cast p2, Lx72;

    .line 29
    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    .line 32
    .line 33
    iput-object p1, p0, Lu2;->a:Landroid/content/Context;

    .line 34
    .line 35
    iput-object p2, p0, Lu2;->b:Lx72;

    .line 36
    .line 37
    return-void
.end method


# virtual methods
.method public final a()Lv2;
    .locals 4

    .line 1
    iget-object v0, p0, Lu2;->a:Landroid/content/Context;

    .line 2
    .line 3
    :try_start_0
    new-instance v1, Lv2;

    .line 4
    .line 5
    iget-object v2, p0, Lu2;->b:Lx72;

    .line 6
    .line 7
    invoke-interface {v2}, Lx72;->b()La62;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-direct {v1, v0, v2}, Lv2;-><init>(Landroid/content/Context;La62;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    .line 13
    .line 14
    return-object v1

    .line 15
    :catch_0
    move-exception v1

    .line 16
    const-string v2, "Failed to build AdLoader."

    .line 17
    .line 18
    invoke-static {v2, v1}, Lgi2;->c0(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 19
    .line 20
    .line 21
    new-instance v1, Ly83;

    .line 22
    .line 23
    invoke-direct {v1}, Lh72;-><init>()V

    .line 24
    .line 25
    .line 26
    new-instance v2, Lv2;

    .line 27
    .line 28
    new-instance v3, Lp83;

    .line 29
    .line 30
    invoke-direct {v3, v1}, Lp83;-><init>(Ly83;)V

    .line 31
    .line 32
    .line 33
    invoke-direct {v2, v0, v3}, Lv2;-><init>(Landroid/content/Context;La62;)V

    .line 34
    .line 35
    .line 36
    return-object v2
.end method

.method public final b(Lt2;)V
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, Lu2;->b:Lx72;

    .line 2
    .line 3
    new-instance v1, Ldh3;

    .line 4
    .line 5
    invoke-direct {v1, p1}, Ldh3;-><init>(Lt2;)V

    .line 6
    .line 7
    .line 8
    invoke-interface {v0, v1}, Lx72;->v0(Ld32;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :catch_0
    const/4 p1, 0x5

    .line 13
    invoke-static {p1}, Lgi2;->q0(I)Z

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final c(Ljg0;)V
    .locals 13

    .line 1
    :try_start_0
    iget-object v0, p0, Lu2;->b:Lx72;

    .line 2
    .line 3
    new-instance v1, Lr12;

    .line 4
    .line 5
    iget-boolean v3, p1, Ljg0;->a:Z

    .line 6
    .line 7
    iget-boolean v5, p1, Ljg0;->c:Z

    .line 8
    .line 9
    iget v6, p1, Ljg0;->d:I

    .line 10
    .line 11
    iget-object v2, p1, Ljg0;->e:Ll51;

    .line 12
    .line 13
    if-eqz v2, :cond_0

    .line 14
    .line 15
    new-instance v4, Lih3;

    .line 16
    .line 17
    invoke-direct {v4, v2}, Lih3;-><init>(Ll51;)V

    .line 18
    .line 19
    .line 20
    :goto_0
    move-object v7, v4

    .line 21
    goto :goto_1

    .line 22
    :cond_0
    const/4 v4, 0x0

    .line 23
    goto :goto_0

    .line 24
    :goto_1
    iget-boolean v8, p1, Ljg0;->f:Z

    .line 25
    .line 26
    iget v9, p1, Ljg0;->b:I

    .line 27
    .line 28
    iget v10, p1, Ljg0;->h:I

    .line 29
    .line 30
    iget-boolean v11, p1, Ljg0;->g:Z

    .line 31
    .line 32
    iget p1, p1, Ljg0;->i:I

    .line 33
    .line 34
    add-int/lit8 v12, p1, -0x1

    .line 35
    .line 36
    const/4 v2, 0x4

    .line 37
    const/4 v4, -0x1

    .line 38
    invoke-direct/range {v1 .. v12}, Lr12;-><init>(IZIZILih3;ZIIZI)V

    .line 39
    .line 40
    .line 41
    invoke-interface {v0, v1}, Lx72;->w1(Lr12;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :catch_0
    const/4 p1, 0x5

    .line 46
    invoke-static {p1}, Lgi2;->q0(I)Z

    .line 47
    .line 48
    .line 49
    return-void
.end method
