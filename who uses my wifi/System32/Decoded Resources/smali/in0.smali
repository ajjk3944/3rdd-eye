.class public final Lin0;
.super Ltn0;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public k:Lgg0;

.field public l:Lgg0;


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
    iput-object v0, p0, Lin0;->k:Lgg0;

    .line 7
    .line 8
    new-instance v0, Lgg0;

    .line 9
    .line 10
    invoke-direct {v0, p1}, Lgg0;-><init>(Lcm;)V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Lin0;->l:Lgg0;

    .line 14
    .line 15
    return-void
.end method

.method public final l()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lin0;->k:Lgg0;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    const-string v1, " "

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    iget-object v1, p0, Lin0;->l:Lgg0;

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    return-object v0
.end method

.method public final m(Lt3;Ljh;Z)V
    .locals 1

    .line 1
    iget-object p2, p0, Lin0;->k:Lgg0;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-virtual {p2, p1, v0, p3}, Lgg0;->r(Lt3;Ljh;Z)V

    .line 5
    .line 6
    .line 7
    iget-object p2, p0, Lin0;->l:Lgg0;

    .line 8
    .line 9
    invoke-virtual {p2, p1, v0, p3}, Lgg0;->r(Lt3;Ljh;Z)V

    .line 10
    .line 11
    .line 12
    return-void
.end method
