.class public Lzj/g;
.super Lzj/b;
.source "SourceFile"

# interfaces
.implements Lyj/j;


# instance fields
.field private final a:D


# direct methods
.method public constructor <init>(D)V
    .locals 0

    invoke-direct {p0}, Lzj/b;-><init>()V

    iput-wide p1, p0, Lzj/g;->a:D

    return-void
.end method


# virtual methods
.method public bridge synthetic A()Lyj/e;
    .locals 1

    invoke-virtual {p0}, Lzj/g;->T()Lyj/j;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic C()Z
    .locals 1

    invoke-super {p0}, Lzj/b;->C()Z

    move-result v0

    return v0
.end method

.method public bridge synthetic G()Z
    .locals 1

    invoke-super {p0}, Lzj/b;->G()Z

    move-result v0

    return v0
.end method

.method public bridge synthetic H()Z
    .locals 1

    invoke-super {p0}, Lzj/b;->H()Z

    move-result v0

    return v0
.end method

.method public bridge synthetic I()Z
    .locals 1

    invoke-super {p0}, Lzj/b;->I()Z

    move-result v0

    return v0
.end method

.method public bridge synthetic N()Z
    .locals 1

    invoke-super {p0}, Lzj/b;->N()Z

    move-result v0

    return v0
.end method

.method public bridge synthetic O()Lyj/f;
    .locals 1

    invoke-super {p0}, Lzj/b;->O()Lyj/f;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic Q()Lyj/g;
    .locals 1

    invoke-super {p0}, Lzj/b;->Q()Lyj/g;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic R()Lyj/h;
    .locals 1

    invoke-super {p0}, Lzj/b;->R()Lyj/h;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic S()Lyj/i;
    .locals 1

    invoke-super {p0}, Lzj/b;->S()Lyj/i;

    move-result-object v0

    return-object v0
.end method

.method public T()Lyj/j;
    .locals 0

    return-object p0
.end method

.method public bridge synthetic U()Lyj/k;
    .locals 1

    invoke-super {p0}, Lzj/b;->U()Lyj/k;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic V()Lyj/l;
    .locals 1

    invoke-super {p0}, Lzj/b;->V()Lyj/l;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic W()Lyj/n;
    .locals 1

    invoke-super {p0}, Lzj/b;->W()Lyj/n;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic e()Z
    .locals 1

    invoke-super {p0}, Lzj/b;->e()Z

    move-result v0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lyj/u;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lyj/u;

    invoke-interface {p1}, Lyj/u;->N()Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, Lzj/g;->a:D

    invoke-interface {p1}, Lyj/u;->A()Lyj/e;

    move-result-object p1

    invoke-interface {p1}, Lyj/r;->m()D

    move-result-wide v5

    cmpl-double p1, v3, v5

    if-nez p1, :cond_3

    goto :goto_0

    :cond_3
    move v0, v2

    :goto_0
    return v0
.end method

.method public f(Lorg/msgpack/core/e;)V
    .locals 2

    iget-wide v0, p0, Lzj/g;->a:D

    invoke-virtual {p1, v0, v1}, Lorg/msgpack/core/e;->v(D)Lorg/msgpack/core/e;

    return-void
.end method

.method public g()Ljava/lang/String;
    .locals 2

    iget-wide v0, p0, Lzj/g;->a:D

    invoke-static {v0, v1}, Ljava/lang/Double;->isNaN(D)Z

    move-result v0

    if-nez v0, :cond_1

    iget-wide v0, p0, Lzj/g;->a:D

    invoke-static {v0, v1}, Ljava/lang/Double;->isInfinite(D)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-wide v0, p0, Lzj/g;->a:D

    invoke-static {v0, v1}, Ljava/lang/Double;->toString(D)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_1
    :goto_0
    const-string v0, "null"

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-wide v0, p0, Lzj/g;->a:D

    invoke-static {v0, v1}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v0

    const/16 v2, 0x20

    ushr-long v2, v0, v2

    xor-long/2addr v0, v2

    long-to-int v0, v0

    return v0
.end method

.method public bridge synthetic j()Z
    .locals 1

    invoke-super {p0}, Lzj/b;->j()Z

    move-result v0

    return v0
.end method

.method public k()Lyj/w;
    .locals 1

    sget-object v0, Lyj/w;->FLOAT:Lyj/w;

    return-object v0
.end method

.method public m()D
    .locals 2

    iget-wide v0, p0, Lzj/g;->a:D

    return-wide v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    iget-wide v0, p0, Lzj/g;->a:D

    invoke-static {v0, v1}, Ljava/lang/Double;->toString(D)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic v()Z
    .locals 1

    invoke-super {p0}, Lzj/b;->v()Z

    move-result v0

    return v0
.end method

.method public bridge synthetic y()Z
    .locals 1

    invoke-super {p0}, Lzj/b;->y()Z

    move-result v0

    return v0
.end method

.method public bridge synthetic z()Z
    .locals 1

    invoke-super {p0}, Lzj/b;->z()Z

    move-result v0

    return v0
.end method
