.class public final Lf63;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lq53;


# virtual methods
.method public final a()Ln70;
    .locals 6

    .line 1
    sget-object v0, Llq3;->g:Llq3;

    .line 2
    .line 3
    sget-object v1, Lmz1;->k6:Liz1;

    .line 4
    .line 5
    sget-object v2, Ltw1;->e:Ltw1;

    .line 6
    .line 7
    iget-object v2, v2, Ltw1;->c:Lkz1;

    .line 8
    .line 9
    invoke-virtual {v2, v1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    check-cast v1, Ljava/lang/Boolean;

    .line 14
    .line 15
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    const/4 v1, 0x2

    .line 19
    new-array v1, v1, [Ln70;

    .line 20
    .line 21
    const/4 v2, 0x0

    .line 22
    aput-object v0, v1, v2

    .line 23
    .line 24
    const/4 v3, 0x1

    .line 25
    aput-object v0, v1, v3

    .line 26
    .line 27
    invoke-static {v1}, Lxm3;->n([Ljava/lang/Object;)Lsn3;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    new-instance v4, Lw53;

    .line 32
    .line 33
    invoke-direct {v4, v0}, Lw53;-><init>(Llq3;)V

    .line 34
    .line 35
    .line 36
    sget-object v0, Lmd2;->a:Lld2;

    .line 37
    .line 38
    new-instance v5, Lcq3;

    .line 39
    .line 40
    invoke-direct {v5, v1, v3, v2}, Ltp3;-><init>(Ltm3;ZZ)V

    .line 41
    .line 42
    .line 43
    new-instance v1, Lbq3;

    .line 44
    .line 45
    invoke-direct {v1, v5, v4, v0}, Lbq3;-><init>(Lcq3;Ljava/util/concurrent/Callable;Ljava/util/concurrent/Executor;)V

    .line 46
    .line 47
    .line 48
    iput-object v1, v5, Lcq3;->u:Lbq3;

    .line 49
    .line 50
    invoke-virtual {v5}, Ltp3;->v()V

    .line 51
    .line 52
    .line 53
    return-object v5
.end method

.method public final d()I
    .locals 1

    .line 1
    const/16 v0, 0x2f

    .line 2
    .line 3
    return v0
.end method
