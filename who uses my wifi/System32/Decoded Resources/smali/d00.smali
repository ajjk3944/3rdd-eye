.class public final Ld00;
.super Ltn0;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public k:[B

.field public l:[B


# virtual methods
.method public final k(Lcm;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Lcm;->e()[B

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iput-object v0, p0, Ld00;->k:[B

    .line 6
    .line 7
    invoke-virtual {p1}, Lcm;->e()[B

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    iput-object p1, p0, Ld00;->l:[B

    .line 12
    .line 13
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
    iget-object v1, p0, Ld00;->k:[B

    .line 7
    .line 8
    const/4 v2, 0x1

    .line 9
    invoke-static {v1, v2}, Ltn0;->a([BZ)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    const-string v1, " "

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    iget-object v1, p0, Ld00;->l:[B

    .line 22
    .line 23
    invoke-static {v1, v2}, Ltn0;->a([BZ)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    return-object v0
.end method

.method public final m(Lt3;Ljh;Z)V
    .locals 0

    .line 1
    iget-object p2, p0, Ld00;->k:[B

    .line 2
    .line 3
    invoke-virtual {p1, p2}, Lt3;->l([B)V

    .line 4
    .line 5
    .line 6
    iget-object p2, p0, Ld00;->l:[B

    .line 7
    .line 8
    invoke-virtual {p1, p2}, Lt3;->l([B)V

    .line 9
    .line 10
    .line 11
    return-void
.end method
