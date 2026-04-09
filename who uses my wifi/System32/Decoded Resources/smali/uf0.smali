.class public final Luf0;
.super Ltn0;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public k:I

.field public l:I

.field public m:[B

.field public n:[B

.field public o:[B

.field public p:Lgg0;


# virtual methods
.method public final f()Lgg0;
    .locals 1

    .line 1
    iget-object v0, p0, Luf0;->p:Lgg0;

    .line 2
    .line 3
    return-object v0
.end method

.method public final k(Lcm;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Lcm;->f()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iput v0, p0, Luf0;->k:I

    .line 6
    .line 7
    invoke-virtual {p1}, Lcm;->f()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    iput v0, p0, Luf0;->l:I

    .line 12
    .line 13
    invoke-virtual {p1}, Lcm;->e()[B

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iput-object v0, p0, Luf0;->m:[B

    .line 18
    .line 19
    invoke-virtual {p1}, Lcm;->e()[B

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iput-object v0, p0, Luf0;->n:[B

    .line 24
    .line 25
    invoke-virtual {p1}, Lcm;->e()[B

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    iput-object v0, p0, Luf0;->o:[B

    .line 30
    .line 31
    new-instance v0, Lgg0;

    .line 32
    .line 33
    invoke-direct {v0, p1}, Lgg0;-><init>(Lcm;)V

    .line 34
    .line 35
    .line 36
    iput-object v0, p0, Luf0;->p:Lgg0;

    .line 37
    .line 38
    return-void
.end method

.method public final l()Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget v1, p0, Luf0;->k:I

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
    iget v2, p0, Luf0;->l:I

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
    iget-object v2, p0, Luf0;->m:[B

    .line 25
    .line 26
    const/4 v3, 0x1

    .line 27
    invoke-static {v2, v3}, Ltn0;->a([BZ)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    iget-object v2, p0, Luf0;->n:[B

    .line 38
    .line 39
    invoke-static {v2, v3}, Ltn0;->a([BZ)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    iget-object v2, p0, Luf0;->o:[B

    .line 50
    .line 51
    invoke-static {v2, v3}, Ltn0;->a([BZ)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    iget-object v1, p0, Luf0;->p:Lgg0;

    .line 62
    .line 63
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    return-object v0
.end method

.method public final m(Lt3;Ljh;Z)V
    .locals 1

    .line 1
    iget p2, p0, Luf0;->k:I

    .line 2
    .line 3
    invoke-virtual {p1, p2}, Lt3;->m(I)V

    .line 4
    .line 5
    .line 6
    iget p2, p0, Luf0;->l:I

    .line 7
    .line 8
    invoke-virtual {p1, p2}, Lt3;->m(I)V

    .line 9
    .line 10
    .line 11
    iget-object p2, p0, Luf0;->m:[B

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lt3;->l([B)V

    .line 14
    .line 15
    .line 16
    iget-object p2, p0, Luf0;->n:[B

    .line 17
    .line 18
    invoke-virtual {p1, p2}, Lt3;->l([B)V

    .line 19
    .line 20
    .line 21
    iget-object p2, p0, Luf0;->o:[B

    .line 22
    .line 23
    invoke-virtual {p1, p2}, Lt3;->l([B)V

    .line 24
    .line 25
    .line 26
    iget-object p2, p0, Luf0;->p:Lgg0;

    .line 27
    .line 28
    const/4 v0, 0x0

    .line 29
    invoke-virtual {p2, p1, v0, p3}, Lgg0;->r(Lt3;Ljh;Z)V

    .line 30
    .line 31
    .line 32
    return-void
.end method
