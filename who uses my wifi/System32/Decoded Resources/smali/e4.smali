.class public final Le4;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lj4;


# instance fields
.field public final f:Lc4;

.field public final g:Lc4;


# direct methods
.method public constructor <init>(Lc4;Lc4;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Le4;->f:Lc4;

    .line 5
    .line 6
    iput-object p2, p0, Le4;->g:Lc4;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final Q0()Lba;
    .locals 3

    .line 1
    new-instance v0, Lmx0;

    .line 2
    .line 3
    iget-object v1, p0, Le4;->f:Lc4;

    .line 4
    .line 5
    invoke-virtual {v1}, Lc4;->U1()Lpu;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget-object v2, p0, Le4;->g:Lc4;

    .line 10
    .line 11
    invoke-virtual {v2}, Lc4;->U1()Lpu;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-direct {v0, v1, v2}, Lmx0;-><init>(Lpu;Lpu;)V

    .line 16
    .line 17
    .line 18
    return-object v0
.end method

.method public final c1()Ljava/util/List;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    const-string v1, "Cannot call getKeyframes on AnimatableSplitDimensionPathValue."

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw v0
.end method

.method public final g1()Z
    .locals 1

    .line 1
    iget-object v0, p0, Le4;->f:Lc4;

    .line 2
    .line 3
    invoke-virtual {v0}, Lf74;->g1()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Le4;->g:Lc4;

    .line 10
    .line 11
    invoke-virtual {v0}, Lf74;->g1()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    return v0

    .line 19
    :cond_0
    const/4 v0, 0x0

    .line 20
    return v0
.end method
