.class public final Ltj;
.super Lcr;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public g:[B

.field public h:[B


# virtual methods
.method public final a(Lcm;)V
    .locals 3

    .line 1
    iget-object v0, p1, Lcm;->j:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/nio/ByteBuffer;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/nio/Buffer;->remaining()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/16 v1, 0x8

    .line 10
    .line 11
    if-lt v0, v1, :cond_2

    .line 12
    .line 13
    invoke-virtual {p1, v1}, Lcm;->c(I)[B

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    iput-object v2, p0, Ltj;->g:[B

    .line 18
    .line 19
    if-le v0, v1, :cond_1

    .line 20
    .line 21
    const/16 v1, 0x10

    .line 22
    .line 23
    if-lt v0, v1, :cond_0

    .line 24
    .line 25
    const/16 v1, 0x28

    .line 26
    .line 27
    if-gt v0, v1, :cond_0

    .line 28
    .line 29
    invoke-virtual {p1}, Lcm;->b()[B

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    iput-object p1, p0, Ltj;->h:[B

    .line 34
    .line 35
    return-void

    .line 36
    :cond_0
    new-instance p1, Lt91;

    .line 37
    .line 38
    const-string v0, "invalid length of server cookie"

    .line 39
    .line 40
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    throw p1

    .line 44
    :cond_1
    return-void

    .line 45
    :cond_2
    new-instance p1, Lt91;

    .line 46
    .line 47
    const-string v0, "invalid length of client cookie"

    .line 48
    .line 49
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    throw p1
.end method

.method public final b()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Ltj;->h:[B

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 8
    .line 9
    .line 10
    iget-object v1, p0, Ltj;->g:[B

    .line 11
    .line 12
    invoke-static {v1}, Lyb;->s([B)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    const-string v1, " "

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    iget-object v1, p0, Ltj;->h:[B

    .line 25
    .line 26
    invoke-static {v1}, Lyb;->s([B)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    return-object v0

    .line 38
    :cond_0
    iget-object v0, p0, Ltj;->g:[B

    .line 39
    .line 40
    invoke-static {v0}, Lyb;->s([B)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    return-object v0
.end method

.method public final c(Lt3;)V
    .locals 3

    .line 1
    iget-object v0, p0, Ltj;->g:[B

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Lt3;->j([B)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ltj;->h:[B

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    array-length v2, v0

    .line 12
    invoke-virtual {p1, v0, v1, v2}, Lt3;->k([BII)V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void
.end method
