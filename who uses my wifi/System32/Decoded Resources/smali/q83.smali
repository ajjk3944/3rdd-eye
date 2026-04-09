.class public final Lq83;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final a:La83;

.field public final b:Lc83;

.field public final c:Leb3;

.field public final d:Lbb3;

.field public final e:Lda3;

.field public final f:Lgj2;


# direct methods
.method public constructor <init>(Leb3;Lbb3;La83;Lc83;Lgj2;Lda3;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, Lq83;->a:La83;

    .line 5
    .line 6
    iput-object p4, p0, Lq83;->b:Lc83;

    .line 7
    .line 8
    iput-object p1, p0, Lq83;->c:Leb3;

    .line 9
    .line 10
    iput-object p2, p0, Lq83;->d:Lbb3;

    .line 11
    .line 12
    iput-object p5, p0, Lq83;->f:Lgj2;

    .line 13
    .line 14
    iput-object p6, p0, Lq83;->e:Lda3;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final a(Ljava/util/ArrayList;Lao2;)V
    .locals 9

    .line 1
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    :goto_0
    if-ge v1, v0, :cond_1

    .line 7
    .line 8
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    add-int/lit8 v1, v1, 0x1

    .line 13
    .line 14
    move-object v7, v2

    .line 15
    check-cast v7, Ljava/lang/String;

    .line 16
    .line 17
    iget-object v2, p0, Lq83;->a:La83;

    .line 18
    .line 19
    iget-boolean v3, v2, La83;->i0:Z

    .line 20
    .line 21
    if-nez v3, :cond_0

    .line 22
    .line 23
    iget-object v3, p0, Lq83;->e:Lda3;

    .line 24
    .line 25
    iget-object v2, v2, La83;->x0:Lx34;

    .line 26
    .line 27
    iget-object v4, p0, Lq83;->c:Leb3;

    .line 28
    .line 29
    invoke-virtual {v4, v7, v2, v3, p2}, Leb3;->b(Ljava/lang/String;Lx34;Lda3;Lao2;)V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    iget-object v2, p0, Lq83;->b:Lc83;

    .line 34
    .line 35
    iget-object v6, v2, Lc83;->b:Ljava/lang/String;

    .line 36
    .line 37
    iget-object v2, p0, Lq83;->d:Lbb3;

    .line 38
    .line 39
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    new-instance v3, Lwo1;

    .line 43
    .line 44
    sget-object v4, Lhg4;->C:Lhg4;

    .line 45
    .line 46
    iget-object v4, v4, Lhg4;->k:Lym;

    .line 47
    .line 48
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 52
    .line 53
    .line 54
    move-result-wide v4

    .line 55
    const/4 v8, 0x2

    .line 56
    invoke-direct/range {v3 .. v8}, Lwo1;-><init>(JLjava/lang/String;Ljava/lang/String;I)V

    .line 57
    .line 58
    .line 59
    iget-object v2, v2, Lbb3;->a:Ljz2;

    .line 60
    .line 61
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    new-instance v4, Lmr2;

    .line 65
    .line 66
    const/4 v5, 0x4

    .line 67
    const/4 v6, 0x0

    .line 68
    invoke-direct {v4, v2, v3, v5, v6}, Lmr2;-><init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v2, v4}, Ljz2;->a(Lo93;)V

    .line 72
    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_1
    return-void
.end method

.method public final b(ILjava/util/ArrayList;)V
    .locals 7

    .line 1
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    :goto_0
    if-ge v1, v0, :cond_1

    .line 7
    .line 8
    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    add-int/lit8 v1, v1, 0x1

    .line 13
    .line 14
    check-cast v2, Ljava/lang/String;

    .line 15
    .line 16
    sget-object v3, Lmz1;->Pa:Liz1;

    .line 17
    .line 18
    sget-object v4, Ltw1;->e:Ltw1;

    .line 19
    .line 20
    iget-object v4, v4, Ltw1;->c:Lkz1;

    .line 21
    .line 22
    invoke-virtual {v4, v3}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    check-cast v3, Ljava/lang/Boolean;

    .line 27
    .line 28
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    if-eqz v3, :cond_0

    .line 33
    .line 34
    invoke-static {v2}, Lgj2;->b(Ljava/lang/String;)Z

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    if-eqz v3, :cond_0

    .line 39
    .line 40
    sget-object v3, Lsv1;->f:Lsv1;

    .line 41
    .line 42
    iget-object v3, v3, Lsv1;->e:Ljava/util/Random;

    .line 43
    .line 44
    iget-object v4, p0, Lq83;->f:Lgj2;

    .line 45
    .line 46
    invoke-virtual {v4, v2, v3}, Lgj2;->a(Ljava/lang/String;Ljava/util/Random;)Ln70;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    goto :goto_1

    .line 51
    :cond_0
    invoke-static {v2}, Lpu1;->r(Ljava/lang/Object;)Llq3;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    :goto_1
    new-instance v3, Lt3;

    .line 56
    .line 57
    const/16 v4, 0xe

    .line 58
    .line 59
    invoke-direct {v3, p0, p1, v4}, Lt3;-><init>(Ljava/lang/Object;II)V

    .line 60
    .line 61
    .line 62
    sget-object v4, Lmd2;->a:Lld2;

    .line 63
    .line 64
    new-instance v5, Ljq3;

    .line 65
    .line 66
    const/4 v6, 0x0

    .line 67
    invoke-direct {v5, v2, v3, v6}, Ljq3;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 68
    .line 69
    .line 70
    invoke-interface {v2, v5, v4}, Ln70;->c(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 71
    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_1
    return-void
.end method
