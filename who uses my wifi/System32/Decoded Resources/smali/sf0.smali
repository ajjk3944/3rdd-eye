.class public final Lsf0;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ljd;
.implements Lw71;


# instance fields
.field public final f:Lkd;

.field public final synthetic g:Ltf0;


# direct methods
.method public constructor <init>(Ltf0;Lkd;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lsf0;->g:Ltf0;

    .line 5
    .line 6
    iput-object p2, p0, Lsf0;->f:Lkd;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(Lyt0;I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lsf0;->f:Lkd;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Lkd;->a(Lyt0;I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final e(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lsf0;->f:Lkd;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lkd;->e(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final getContext()Lhk;
    .locals 1

    .line 1
    iget-object v0, p0, Lsf0;->f:Lkd;

    .line 2
    .line 3
    iget-object v0, v0, Lkd;->j:Lhk;

    .line 4
    .line 5
    return-object v0
.end method

.method public final j(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lsf0;->f:Lkd;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lkd;->j(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final k(Ljava/lang/Object;Ldy;)V
    .locals 1

    .line 1
    sget-object p1, Ltf0;->h:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 2
    .line 3
    const/4 p2, 0x0

    .line 4
    iget-object v0, p0, Lsf0;->g:Ltf0;

    .line 5
    .line 6
    invoke-virtual {p1, v0, p2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    new-instance p1, Lrf0;

    .line 10
    .line 11
    const/4 p2, 0x0

    .line 12
    invoke-direct {p1, v0, p0, p2}, Lrf0;-><init>(Ltf0;Lsf0;I)V

    .line 13
    .line 14
    .line 15
    iget-object p2, p0, Lsf0;->f:Lkd;

    .line 16
    .line 17
    sget-object v0, Lz31;->a:Lz31;

    .line 18
    .line 19
    invoke-virtual {p2, v0, p1}, Lkd;->k(Ljava/lang/Object;Ldy;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public final l(Ljava/lang/Object;Ldy;)Lgs3;
    .locals 2

    .line 1
    check-cast p1, Lz31;

    .line 2
    .line 3
    new-instance p2, Lrf0;

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iget-object v1, p0, Lsf0;->g:Ltf0;

    .line 7
    .line 8
    invoke-direct {p2, v1, p0, v0}, Lrf0;-><init>(Ltf0;Lsf0;I)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lsf0;->f:Lkd;

    .line 12
    .line 13
    invoke-virtual {v0, p1, p2}, Lkd;->l(Ljava/lang/Object;Ldy;)Lgs3;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    sget-object p2, Ltf0;->h:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 20
    .line 21
    const/4 v0, 0x0

    .line 22
    invoke-virtual {p2, v1, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    :cond_0
    return-object p1
.end method
