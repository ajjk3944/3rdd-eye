.class public final Lu31;
.super Ltn0;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public k:I

.field public l:I

.field public m:[B


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
    iput v0, p0, Lu31;->k:I

    .line 6
    .line 7
    invoke-virtual {p1}, Lcm;->f()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    iput v0, p0, Lu31;->l:I

    .line 12
    .line 13
    invoke-virtual {p1}, Lcm;->b()[B

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    iput-object p1, p0, Lu31;->m:[B

    .line 18
    .line 19
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
    iget v1, p0, Lu31;->k:I

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
    iget v2, p0, Lu31;->l:I

    .line 17
    .line 18
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    iget-object v1, p0, Lu31;->m:[B

    .line 25
    .line 26
    const/4 v2, 0x1

    .line 27
    invoke-static {v1, v2}, Ltn0;->a([BZ)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    return-object v0
.end method

.method public final m(Lt3;Ljh;Z)V
    .locals 0

    .line 1
    iget p2, p0, Lu31;->k:I

    .line 2
    .line 3
    invoke-virtual {p1, p2}, Lt3;->m(I)V

    .line 4
    .line 5
    .line 6
    iget p2, p0, Lu31;->l:I

    .line 7
    .line 8
    invoke-virtual {p1, p2}, Lt3;->m(I)V

    .line 9
    .line 10
    .line 11
    iget-object p2, p0, Lu31;->m:[B

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lt3;->j([B)V

    .line 14
    .line 15
    .line 16
    return-void
.end method
