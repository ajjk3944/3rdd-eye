.class public final Lbg0;
.super Ltn0;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public k:Lgg0;

.field public l:Ll31;


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
    iput-object v0, p0, Lbg0;->k:Lgg0;

    .line 7
    .line 8
    new-instance v0, Ll31;

    .line 9
    .line 10
    invoke-direct {v0, p1}, Ll31;-><init>(Lcm;)V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Lbg0;->l:Ll31;

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
    iget-object v1, p0, Lbg0;->k:Lgg0;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Lbg0;->l:Ll31;

    .line 12
    .line 13
    iget-object v1, v1, Ll31;->f:Ljava/util/TreeSet;

    .line 14
    .line 15
    invoke-virtual {v1}, Ljava/util/TreeSet;->isEmpty()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-nez v1, :cond_0

    .line 20
    .line 21
    const/16 v1, 0x20

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    iget-object v1, p0, Lbg0;->l:Ll31;

    .line 27
    .line 28
    invoke-virtual {v1}, Ll31;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    :cond_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    return-object v0
.end method

.method public final m(Lt3;Ljh;Z)V
    .locals 0

    .line 1
    iget-object p2, p0, Lbg0;->k:Lgg0;

    .line 2
    .line 3
    const/4 p3, 0x0

    .line 4
    invoke-virtual {p2, p1, p3}, Lgg0;->q(Lt3;Ljh;)V

    .line 5
    .line 6
    .line 7
    iget-object p2, p0, Lbg0;->l:Ll31;

    .line 8
    .line 9
    invoke-virtual {p2, p1}, Ll31;->b(Lt3;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method
