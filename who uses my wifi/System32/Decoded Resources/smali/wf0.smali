.class public final Lwf0;
.super Ltn0;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public k:[B


# virtual methods
.method public final k(Lcm;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Lcm;->b()[B

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, Lwf0;->k:[B

    .line 6
    .line 7
    return-void
.end method

.method public final l()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "0x"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lwf0;->k:[B

    .line 9
    .line 10
    invoke-static {v1}, Lyb;->s([B)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    return-object v0
.end method

.method public final m(Lt3;Ljh;Z)V
    .locals 0

    .line 1
    iget-object p2, p0, Lwf0;->k:[B

    .line 2
    .line 3
    invoke-virtual {p1, p2}, Lt3;->j([B)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
