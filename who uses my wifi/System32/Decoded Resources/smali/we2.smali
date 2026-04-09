.class public final Lwe2;
.super Lf74;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final i:Lag2;

.field public final j:Lff2;

.field public final k:Ljava/lang/String;

.field public final l:[Ljava/lang/String;


# direct methods
.method public constructor <init>(Lag2;Lff2;Ljava/lang/String;[Ljava/lang/String;)V
    .locals 1

    .line 1
    const/4 v0, 0x6

    .line 2
    invoke-direct {p0, v0}, Lf74;-><init>(I)V

    .line 3
    .line 4
    .line 5
    iput-object p1, p0, Lwe2;->i:Lag2;

    .line 6
    .line 7
    iput-object p2, p0, Lwe2;->j:Lff2;

    .line 8
    .line 9
    iput-object p3, p0, Lwe2;->k:Ljava/lang/String;

    .line 10
    .line 11
    iput-object p4, p0, Lwe2;->l:[Ljava/lang/String;

    .line 12
    .line 13
    sget-object p1, Lhg4;->C:Lhg4;

    .line 14
    .line 15
    iget-object p1, p1, Lhg4;->A:Lxe2;

    .line 16
    .line 17
    iget-object p1, p1, Lxe2;->f:Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public final p1()V
    .locals 4

    .line 1
    :try_start_0
    iget-object v0, p0, Lwe2;->j:Lff2;

    .line 2
    .line 3
    iget-object v1, p0, Lwe2;->k:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v2, p0, Lwe2;->l:[Ljava/lang/String;

    .line 6
    .line 7
    invoke-virtual {v0, v1, v2}, Lff2;->d(Ljava/lang/String;[Ljava/lang/String;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    .line 9
    .line 10
    sget-object v0, Llf4;->l:Li63;

    .line 11
    .line 12
    new-instance v1, Lfu1;

    .line 13
    .line 14
    const/16 v2, 0xe

    .line 15
    .line 16
    invoke-direct {v1, v2, p0}, Lfu1;-><init>(ILjava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :catchall_0
    move-exception v0

    .line 24
    sget-object v1, Llf4;->l:Li63;

    .line 25
    .line 26
    new-instance v2, Lfu1;

    .line 27
    .line 28
    const/16 v3, 0xe

    .line 29
    .line 30
    invoke-direct {v2, v3, p0}, Lfu1;-><init>(ILjava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 34
    .line 35
    .line 36
    throw v0
.end method

.method public final r1()Ln70;
    .locals 3

    .line 1
    sget-object v0, Lmz1;->e2:Liz1;

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
    if-eqz v0, :cond_0

    .line 18
    .line 19
    iget-object v0, p0, Lwe2;->j:Lff2;

    .line 20
    .line 21
    instance-of v0, v0, Ljf2;

    .line 22
    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    sget-object v0, Lmd2;->f:Lld2;

    .line 26
    .line 27
    new-instance v1, Lxs1;

    .line 28
    .line 29
    const/4 v2, 0x3

    .line 30
    invoke-direct {v1, v2, p0}, Lxs1;-><init>(ILjava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, v1}, Lld2;->c(Ljava/util/concurrent/Callable;)Ln70;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    return-object v0

    .line 38
    :cond_0
    invoke-super {p0}, Lf74;->r1()Ln70;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    return-object v0
.end method
