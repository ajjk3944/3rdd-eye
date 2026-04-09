.class public final Lxj0;
.super Ltn0;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public k:I

.field public l:Lgg0;

.field public m:Lgg0;


# virtual methods
.method public final k(Lcm;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Lcm;->f()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iput v0, p0, Lxj0;->k:I

    .line 6
    .line 7
    new-instance v0, Lgg0;

    .line 8
    .line 9
    invoke-direct {v0, p1}, Lgg0;-><init>(Lcm;)V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lxj0;->l:Lgg0;

    .line 13
    .line 14
    new-instance v0, Lgg0;

    .line 15
    .line 16
    invoke-direct {v0, p1}, Lgg0;-><init>(Lcm;)V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, Lxj0;->m:Lgg0;

    .line 20
    .line 21
    return-void
.end method

.method public final l()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget v1, p0, Lxj0;->k:I

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

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
    iget-object v2, p0, Lxj0;->l:Lgg0;

    .line 17
    .line 18
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    iget-object v1, p0, Lxj0;->m:Lgg0;

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    return-object v0
.end method

.method public final m(Lt3;Ljh;Z)V
    .locals 1

    .line 1
    iget p2, p0, Lxj0;->k:I

    .line 2
    .line 3
    invoke-virtual {p1, p2}, Lt3;->m(I)V

    .line 4
    .line 5
    .line 6
    iget-object p2, p0, Lxj0;->l:Lgg0;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    invoke-virtual {p2, p1, v0, p3}, Lgg0;->r(Lt3;Ljh;Z)V

    .line 10
    .line 11
    .line 12
    iget-object p2, p0, Lxj0;->m:Lgg0;

    .line 13
    .line 14
    invoke-virtual {p2, p1, v0, p3}, Lgg0;->r(Lt3;Ljh;Z)V

    .line 15
    .line 16
    .line 17
    return-void
.end method
