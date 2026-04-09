.class public final synthetic Ltt;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ljava/util/function/IntUnaryOperator;


# virtual methods
.method public final applyAsInt(I)I
    .locals 2

    .line 1
    if-lez p1, :cond_0

    .line 2
    .line 3
    int-to-double v0, p1

    .line 4
    invoke-static {v0, v1}, Ljava/lang/Math;->log(D)D

    .line 5
    .line 6
    .line 7
    move-result-wide v0

    .line 8
    double-to-int p1, v0

    .line 9
    return p1

    .line 10
    :cond_0
    const/4 p1, 0x0

    .line 11
    return p1
.end method
