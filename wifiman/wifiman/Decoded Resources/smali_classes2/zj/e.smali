.class public Lzj/e;
.super Lzj/a;
.source "SourceFile"

# interfaces
.implements Lyj/g;


# direct methods
.method public constructor <init>([B)V
    .locals 0

    invoke-direct {p0, p1}, Lzj/a;-><init>([B)V

    return-void
.end method


# virtual methods
.method public bridge synthetic F()Lyj/b;
    .locals 1

    invoke-virtual {p0}, Lzj/e;->Q()Lyj/g;

    move-result-object v0

    return-object v0
.end method

.method public Q()Lyj/g;
    .locals 0

    return-object p0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    instance-of v0, p1, Lyj/u;

    const/4 v1, 0x0

    if-nez v0, :cond_1

    return v1

    :cond_1
    check-cast p1, Lyj/u;

    invoke-interface {p1}, Lyj/u;->e()Z

    move-result v0

    if-nez v0, :cond_2

    return v1

    :cond_2
    instance-of v0, p1, Lzj/e;

    if-eqz v0, :cond_3

    check-cast p1, Lzj/e;

    iget-object v0, p0, Lzj/a;->a:[B

    iget-object p1, p1, Lzj/a;->a:[B

    invoke-static {v0, p1}, Ljava/util/Arrays;->equals([B[B)Z

    move-result p1

    return p1

    :cond_3
    iget-object v0, p0, Lzj/a;->a:[B

    invoke-interface {p1}, Lyj/u;->F()Lyj/b;

    move-result-object p1

    invoke-interface {p1}, Lyj/s;->u()[B

    move-result-object p1

    invoke-static {v0, p1}, Ljava/util/Arrays;->equals([B[B)Z

    move-result p1

    return p1
.end method

.method public f(Lorg/msgpack/core/e;)V
    .locals 1

    iget-object v0, p0, Lzj/a;->a:[B

    array-length v0, v0

    invoke-virtual {p1, v0}, Lorg/msgpack/core/e;->p(I)Lorg/msgpack/core/e;

    iget-object v0, p0, Lzj/a;->a:[B

    invoke-virtual {p1, v0}, Lorg/msgpack/core/e;->o0([B)Lorg/msgpack/core/e;

    return-void
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lzj/a;->a:[B

    invoke-static {v0}, Ljava/util/Arrays;->hashCode([B)I

    move-result v0

    return v0
.end method

.method public k()Lyj/w;
    .locals 1

    sget-object v0, Lyj/w;->BINARY:Lyj/w;

    return-object v0
.end method
