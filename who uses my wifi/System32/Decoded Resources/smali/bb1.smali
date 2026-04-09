.class public final Lbb1;
.super Ltn0;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public k:[B


# virtual methods
.method public final k(Lcm;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Lcm;->e()[B

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, Lbb1;->k:[B

    .line 6
    .line 7
    return-void
.end method

.method public final l()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lbb1;->k:[B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-static {v0, v1}, Ltn0;->a([BZ)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    return-object v0
.end method

.method public final m(Lt3;Ljh;Z)V
    .locals 0

    .line 1
    iget-object p2, p0, Lbb1;->k:[B

    .line 2
    .line 3
    invoke-virtual {p1, p2}, Lt3;->l([B)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
