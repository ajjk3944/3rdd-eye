.class public final Lc4;
.super Lf74;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# virtual methods
.method public final bridge synthetic Q0()Lba;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lc4;->U1()Lpu;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final U1()Lpu;
    .locals 2

    .line 1
    new-instance v0, Lpu;

    .line 2
    .line 3
    iget-object v1, p0, Lf74;->g:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Ljava/util/List;

    .line 6
    .line 7
    invoke-direct {v0, v1}, Lba;-><init>(Ljava/util/List;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method
