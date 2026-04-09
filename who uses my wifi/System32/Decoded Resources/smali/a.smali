.class public final La;
.super Ltn0;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public k:I

.field public l:Ljava/net/InetAddress;

.field public m:Lgg0;


# virtual methods
.method public final k(Lcm;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Lcm;->i()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iput v0, p0, La;->k:I

    .line 6
    .line 7
    rsub-int v1, v0, 0x87

    .line 8
    .line 9
    div-int/lit8 v1, v1, 0x8

    .line 10
    .line 11
    const/16 v2, 0x80

    .line 12
    .line 13
    if-ge v0, v2, :cond_0

    .line 14
    .line 15
    const/16 v0, 0x10

    .line 16
    .line 17
    new-array v0, v0, [B

    .line 18
    .line 19
    rsub-int/lit8 v2, v1, 0x10

    .line 20
    .line 21
    invoke-virtual {p1, v1}, Lcm;->j(I)V

    .line 22
    .line 23
    .line 24
    iget-object v3, p1, Lcm;->j:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v3, Ljava/nio/ByteBuffer;

    .line 27
    .line 28
    invoke-virtual {v3, v0, v2, v1}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    .line 29
    .line 30
    .line 31
    invoke-static {v0}, Ljava/net/InetAddress;->getByAddress([B)Ljava/net/InetAddress;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    iput-object v0, p0, La;->l:Ljava/net/InetAddress;

    .line 36
    .line 37
    :cond_0
    iget v0, p0, La;->k:I

    .line 38
    .line 39
    if-lez v0, :cond_1

    .line 40
    .line 41
    new-instance v0, Lgg0;

    .line 42
    .line 43
    invoke-direct {v0, p1}, Lgg0;-><init>(Lcm;)V

    .line 44
    .line 45
    .line 46
    iput-object v0, p0, La;->m:Lgg0;

    .line 47
    .line 48
    :cond_1
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
    iget v1, p0, La;->k:I

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, La;->l:Ljava/net/InetAddress;

    .line 12
    .line 13
    const-string v2, " "

    .line 14
    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    iget-object v1, p0, La;->l:Ljava/net/InetAddress;

    .line 21
    .line 22
    invoke-virtual {v1}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    :cond_0
    iget-object v1, p0, La;->m:Lgg0;

    .line 30
    .line 31
    if-eqz v1, :cond_1

    .line 32
    .line 33
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    iget-object v1, p0, La;->m:Lgg0;

    .line 37
    .line 38
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    return-object v0
.end method

.method public final m(Lt3;Ljh;Z)V
    .locals 2

    .line 1
    iget p2, p0, La;->k:I

    .line 2
    .line 3
    invoke-virtual {p1, p2}, Lt3;->q(I)V

    .line 4
    .line 5
    .line 6
    iget-object p2, p0, La;->l:Ljava/net/InetAddress;

    .line 7
    .line 8
    if-eqz p2, :cond_0

    .line 9
    .line 10
    iget v0, p0, La;->k:I

    .line 11
    .line 12
    rsub-int v0, v0, 0x87

    .line 13
    .line 14
    div-int/lit8 v0, v0, 0x8

    .line 15
    .line 16
    invoke-virtual {p2}, Ljava/net/InetAddress;->getAddress()[B

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    rsub-int/lit8 v1, v0, 0x10

    .line 21
    .line 22
    invoke-virtual {p1, p2, v1, v0}, Lt3;->k([BII)V

    .line 23
    .line 24
    .line 25
    :cond_0
    iget-object p2, p0, La;->m:Lgg0;

    .line 26
    .line 27
    if-eqz p2, :cond_1

    .line 28
    .line 29
    const/4 v0, 0x0

    .line 30
    invoke-virtual {p2, p1, v0, p3}, Lgg0;->r(Lt3;Ljh;Z)V

    .line 31
    .line 32
    .line 33
    :cond_1
    return-void
.end method
