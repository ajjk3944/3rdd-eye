.class public final Lml2;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lye4;


# instance fields
.field public final f:Lgn2;

.field public final g:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final h:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method public constructor <init>(Lgn2;)V
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
    iput-object v0, p0, Lml2;->g:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 11
    .line 12
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 13
    .line 14
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Lml2;->h:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 18
    .line 19
    iput-object p1, p0, Lml2;->f:Lgn2;

    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final B1()V
    .locals 0

    .line 1
    return-void
.end method

.method public final E1()V
    .locals 0

    .line 1
    return-void
.end method

.method public final G1(I)V
    .locals 2

    .line 1
    iget-object p1, p0, Lml2;->g:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    invoke-virtual {p1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 5
    .line 6
    .line 7
    iget-object p1, p0, Lml2;->h:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-nez v1, :cond_0

    .line 14
    .line 15
    invoke-virtual {p1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 16
    .line 17
    .line 18
    iget-object p1, p0, Lml2;->f:Lgn2;

    .line 19
    .line 20
    sget-object v0, Lsd2;->l:Lsd2;

    .line 21
    .line 22
    invoke-virtual {p1, v0}, Lf74;->P1(Ldp2;)V

    .line 23
    .line 24
    .line 25
    :cond_0
    return-void
.end method

.method public final M1()V
    .locals 2

    .line 1
    iget-object v0, p0, Lml2;->h:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Lml2;->f:Lgn2;

    .line 14
    .line 15
    sget-object v1, Lsd2;->l:Lsd2;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Lf74;->P1(Ldp2;)V

    .line 18
    .line 19
    .line 20
    :cond_0
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

.method public final f()V
    .locals 2

    .line 1
    iget-object v0, p0, Lml2;->f:Lgn2;

    .line 2
    .line 3
    sget-object v1, Lqd2;->j:Lqd2;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lf74;->P1(Ldp2;)V

    .line 6
    .line 7
    .line 8
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
