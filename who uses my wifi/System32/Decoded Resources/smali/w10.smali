.class public final Lw10;
.super Ltn0;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public k:I

.field public l:I

.field public m:I

.field public n:Ljava/io/Serializable;

.field public o:[B


# virtual methods
.method public final k(Lcm;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Lcm;->i()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iput v0, p0, Lw10;->k:I

    .line 6
    .line 7
    invoke-virtual {p1}, Lcm;->i()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    iput v0, p0, Lw10;->l:I

    .line 12
    .line 13
    invoke-virtual {p1}, Lcm;->i()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    iput v0, p0, Lw10;->m:I

    .line 18
    .line 19
    iget v0, p0, Lw10;->l:I

    .line 20
    .line 21
    if-eqz v0, :cond_3

    .line 22
    .line 23
    const/4 v1, 0x1

    .line 24
    if-eq v0, v1, :cond_2

    .line 25
    .line 26
    const/4 v1, 0x2

    .line 27
    if-eq v0, v1, :cond_1

    .line 28
    .line 29
    const/4 v1, 0x3

    .line 30
    if-ne v0, v1, :cond_0

    .line 31
    .line 32
    new-instance v0, Lgg0;

    .line 33
    .line 34
    invoke-direct {v0, p1}, Lgg0;-><init>(Lcm;)V

    .line 35
    .line 36
    .line 37
    iput-object v0, p0, Lw10;->n:Ljava/io/Serializable;

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    new-instance p1, Lt91;

    .line 41
    .line 42
    const-string v0, "invalid gateway type"

    .line 43
    .line 44
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    throw p1

    .line 48
    :cond_1
    const/16 v0, 0x10

    .line 49
    .line 50
    invoke-virtual {p1, v0}, Lcm;->c(I)[B

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-static {v0}, Ljava/net/InetAddress;->getByAddress([B)Ljava/net/InetAddress;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    iput-object v0, p0, Lw10;->n:Ljava/io/Serializable;

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_2
    const/4 v0, 0x4

    .line 62
    invoke-virtual {p1, v0}, Lcm;->c(I)[B

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    invoke-static {v0}, Ljava/net/InetAddress;->getByAddress([B)Ljava/net/InetAddress;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    iput-object v0, p0, Lw10;->n:Ljava/io/Serializable;

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_3
    const/4 v0, 0x0

    .line 74
    iput-object v0, p0, Lw10;->n:Ljava/io/Serializable;

    .line 75
    .line 76
    :goto_0
    iget-object v0, p1, Lcm;->j:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v0, Ljava/nio/ByteBuffer;

    .line 79
    .line 80
    invoke-virtual {v0}, Ljava/nio/Buffer;->remaining()I

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    if-lez v0, :cond_4

    .line 85
    .line 86
    invoke-virtual {p1}, Lcm;->b()[B

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    iput-object p1, p0, Lw10;->o:[B

    .line 91
    .line 92
    :cond_4
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
    iget v1, p0, Lw10;->k:I

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
    iget v2, p0, Lw10;->l:I

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
    iget v2, p0, Lw10;->m:I

    .line 25
    .line 26
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    iget v2, p0, Lw10;->l:I

    .line 33
    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    const/4 v3, 0x1

    .line 37
    if-eq v2, v3, :cond_1

    .line 38
    .line 39
    const/4 v3, 0x2

    .line 40
    if-eq v2, v3, :cond_1

    .line 41
    .line 42
    const/4 v3, 0x3

    .line 43
    if-eq v2, v3, :cond_0

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_0
    iget-object v2, p0, Lw10;->n:Ljava/io/Serializable;

    .line 47
    .line 48
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_1
    iget-object v2, p0, Lw10;->n:Ljava/io/Serializable;

    .line 53
    .line 54
    check-cast v2, Ljava/net/InetAddress;

    .line 55
    .line 56
    invoke-virtual {v2}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_2
    const-string v2, "."

    .line 65
    .line 66
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    :goto_0
    iget-object v2, p0, Lw10;->o:[B

    .line 70
    .line 71
    if-eqz v2, :cond_3

    .line 72
    .line 73
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    iget-object v1, p0, Lw10;->o:[B

    .line 77
    .line 78
    invoke-static {v1}, Lum;->y([B)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    :cond_3
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    return-object v0
.end method

.method public final m(Lt3;Ljh;Z)V
    .locals 1

    .line 1
    iget p2, p0, Lw10;->k:I

    .line 2
    .line 3
    invoke-virtual {p1, p2}, Lt3;->q(I)V

    .line 4
    .line 5
    .line 6
    iget p2, p0, Lw10;->l:I

    .line 7
    .line 8
    invoke-virtual {p1, p2}, Lt3;->q(I)V

    .line 9
    .line 10
    .line 11
    iget p2, p0, Lw10;->m:I

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lt3;->q(I)V

    .line 14
    .line 15
    .line 16
    iget p2, p0, Lw10;->l:I

    .line 17
    .line 18
    const/4 v0, 0x1

    .line 19
    if-eq p2, v0, :cond_1

    .line 20
    .line 21
    const/4 v0, 0x2

    .line 22
    if-eq p2, v0, :cond_1

    .line 23
    .line 24
    const/4 v0, 0x3

    .line 25
    if-eq p2, v0, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    iget-object p2, p0, Lw10;->n:Ljava/io/Serializable;

    .line 29
    .line 30
    check-cast p2, Lgg0;

    .line 31
    .line 32
    const/4 v0, 0x0

    .line 33
    invoke-virtual {p2, p1, v0, p3}, Lgg0;->r(Lt3;Ljh;Z)V

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    iget-object p2, p0, Lw10;->n:Ljava/io/Serializable;

    .line 38
    .line 39
    check-cast p2, Ljava/net/InetAddress;

    .line 40
    .line 41
    invoke-virtual {p2}, Ljava/net/InetAddress;->getAddress()[B

    .line 42
    .line 43
    .line 44
    move-result-object p2

    .line 45
    invoke-virtual {p1, p2}, Lt3;->j([B)V

    .line 46
    .line 47
    .line 48
    :goto_0
    iget-object p2, p0, Lw10;->o:[B

    .line 49
    .line 50
    if-eqz p2, :cond_2

    .line 51
    .line 52
    const/4 p3, 0x0

    .line 53
    array-length v0, p2

    .line 54
    invoke-virtual {p1, p2, p3, v0}, Lt3;->k([BII)V

    .line 55
    .line 56
    .line 57
    :cond_2
    return-void
.end method
