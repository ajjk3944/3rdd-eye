.class public final Lgq2;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lye4;
.implements Lfd1;


# instance fields
.field public final f:Luu2;

.field public final g:Lc83;

.field public final h:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method public constructor <init>(Luu2;Lc83;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lgq2;->h:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 11
    .line 12
    iput-object p1, p0, Lgq2;->f:Luu2;

    .line 13
    .line 14
    iput-object p2, p0, Lgq2;->g:Lc83;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final B1()V
    .locals 0

    .line 1
    return-void
.end method

.method public final C()V
    .locals 4

    .line 1
    iget-object v0, p0, Lgq2;->f:Luu2;

    .line 2
    .line 3
    iget-object v1, v0, Luu2;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    iget-object v0, v0, Luu2;->a:Lmu2;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    new-instance v1, Lbf3;

    .line 17
    .line 18
    const/4 v2, 0x1

    .line 19
    const/4 v3, 0x0

    .line 20
    invoke-direct {v1, v0, v3, v2}, Lbf3;-><init>(Ljava/lang/Object;Loj;I)V

    .line 21
    .line 22
    .line 23
    iget-object v0, v0, Lmu2;->c:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v0, Lmj;

    .line 26
    .line 27
    const/4 v2, 0x3

    .line 28
    invoke-static {v0, v3, v1, v2}, Lgi2;->q(Lqk;Lhk;Lhy;I)Lyn;

    .line 29
    .line 30
    .line 31
    :cond_0
    return-void
.end method

.method public final E1()V
    .locals 0

    .line 1
    return-void
.end method

.method public final G1(I)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lgq2;->a()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final M1()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lgq2;->a()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final R2()V
    .locals 0

    .line 1
    return-void
.end method

.method public final U()V
    .locals 0

    .line 1
    return-void
.end method

.method public final Y()V
    .locals 0

    .line 1
    return-void
.end method

.method public final a()V
    .locals 4

    .line 1
    iget-object v0, p0, Lgq2;->h:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    iget-object v0, p0, Lgq2;->f:Luu2;

    .line 11
    .line 12
    iget-object v1, v0, Luu2;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    invoke-virtual {v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-nez v1, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    iget-object v0, v0, Luu2;->a:Lmu2;

    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    new-instance v1, Lbf3;

    .line 28
    .line 29
    const/4 v2, 0x2

    .line 30
    const/4 v3, 0x0

    .line 31
    invoke-direct {v1, v0, v3, v2}, Lbf3;-><init>(Ljava/lang/Object;Loj;I)V

    .line 32
    .line 33
    .line 34
    iget-object v0, v0, Lmu2;->c:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v0, Lmj;

    .line 37
    .line 38
    const/4 v2, 0x3

    .line 39
    invoke-static {v0, v3, v1, v2}, Lgi2;->q(Lqk;Lhk;Lhy;I)Lyn;

    .line 40
    .line 41
    .line 42
    :cond_1
    :goto_0
    return-void
.end method

.method public final f()V
    .locals 5

    .line 1
    iget-object v0, p0, Lgq2;->g:Lc83;

    .line 2
    .line 3
    iget-object v0, v0, Lc83;->b:Ljava/lang/String;

    .line 4
    .line 5
    invoke-static {v0}, Lyc0;->s(Ljava/lang/String;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    iget-object v2, p0, Lgq2;->f:Luu2;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    iget-object v1, v2, Luu2;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 18
    .line 19
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    iget-object v1, v2, Luu2;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 26
    .line 27
    const/4 v3, 0x1

    .line 28
    invoke-virtual {v1, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-nez v1, :cond_1

    .line 33
    .line 34
    iget-object v1, v2, Luu2;->a:Lmu2;

    .line 35
    .line 36
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    const-string v2, "gwsQueryId"

    .line 40
    .line 41
    invoke-static {v0, v2}, Li30;->m(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    new-instance v2, Lkm;

    .line 45
    .line 46
    const/4 v3, 0x7

    .line 47
    const/4 v4, 0x0

    .line 48
    invoke-direct {v2, v1, v0, v4, v3}, Lkm;-><init>(Ljava/lang/Object;Ljava/lang/Object;Loj;I)V

    .line 49
    .line 50
    .line 51
    iget-object v0, v1, Lmu2;->c:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v0, Lmj;

    .line 54
    .line 55
    const/4 v1, 0x3

    .line 56
    invoke-static {v0, v4, v2, v1}, Lgi2;->q(Lqk;Lhk;Lhy;I)Lyn;

    .line 57
    .line 58
    .line 59
    :cond_1
    return-void
.end method

.method public final f3()V
    .locals 0

    .line 1
    return-void
.end method

.method public final h3()V
    .locals 0

    .line 1
    return-void
.end method

.method public final m2()V
    .locals 0

    .line 1
    return-void
.end method
