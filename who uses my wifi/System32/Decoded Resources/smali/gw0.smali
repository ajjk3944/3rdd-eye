.class public abstract Lgw0;
.super Ltn0;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public k:Lgg0;


# virtual methods
.method public final k(Lcm;)V
    .locals 1

    .line 1
    new-instance v0, Lgg0;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Lgg0;-><init>(Lcm;)V

    .line 4
    .line 5
    .line 6
    iput-object v0, p0, Lgw0;->k:Lgg0;

    .line 7
    .line 8
    return-void
.end method

.method public final l()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lgw0;->k:Lgg0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, v1}, Lgg0;->p(Z)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    return-object v0
.end method

.method public m(Lt3;Ljh;Z)V
    .locals 1

    .line 1
    iget-object p2, p0, Lgw0;->k:Lgg0;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-virtual {p2, p1, v0, p3}, Lgg0;->r(Lt3;Ljh;Z)V

    .line 5
    .line 6
    .line 7
    return-void
.end method
