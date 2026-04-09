.class public final Lbn3;
.super Ltm3;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final transient g:Lfn3;


# direct methods
.method public constructor <init>(Lfn3;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/util/AbstractCollection;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lbn3;->g:Lfn3;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a()Lyq2;
    .locals 2

    .line 1
    new-instance v0, Lan3;

    .line 2
    .line 3
    iget-object v1, p0, Lbn3;->g:Lfn3;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lan3;-><init>(Lfn3;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public final contains(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lbn3;->g:Lfn3;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lfn3;->c(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final g([Ljava/lang/Object;I)I
    .locals 2

    .line 1
    iget-object v0, p0, Lbn3;->g:Lfn3;

    .line 2
    .line 3
    iget-object v0, v0, Lfn3;->i:Lxn3;

    .line 4
    .line 5
    invoke-virtual {v0}, Lxn3;->c()Ltm3;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Lxm3;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-virtual {v0, v1}, Lxm3;->p(I)Lvm3;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    :goto_0
    invoke-virtual {v0}, Lql3;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    invoke-virtual {v0}, Lql3;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    check-cast v1, Ltm3;

    .line 27
    .line 28
    invoke-virtual {v1, p1, p2}, Ltm3;->g([Ljava/lang/Object;I)I

    .line 29
    .line 30
    .line 31
    move-result p2

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    return p2
.end method

.method public final synthetic iterator()Ljava/util/Iterator;
    .locals 2

    .line 1
    new-instance v0, Lan3;

    .line 2
    .line 3
    iget-object v1, p0, Lbn3;->g:Lfn3;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lan3;-><init>(Lfn3;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public final size()I
    .locals 1

    .line 1
    iget-object v0, p0, Lbn3;->g:Lfn3;

    .line 2
    .line 3
    iget v0, v0, Lfn3;->j:I

    .line 4
    .line 5
    return v0
.end method
