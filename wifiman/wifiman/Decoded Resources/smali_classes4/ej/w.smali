.class public final Lej/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lej/f;


# instance fields
.field public final a:Lej/B;

.field public final b:Lej/e;

.field public c:Z


# direct methods
.method public constructor <init>(Lej/B;)V
    .locals 1

    const-string v0, "sink"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lej/w;->a:Lej/B;

    new-instance p1, Lej/e;

    invoke-direct {p1}, Lej/e;-><init>()V

    iput-object p1, p0, Lej/w;->b:Lej/e;

    return-void
.end method


# virtual methods
.method public F(Ljava/lang/String;)Lej/f;
    .locals 1

    const-string v0, "string"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Lej/w;->c:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lej/w;->b:Lej/e;

    invoke-virtual {v0, p1}, Lej/e;->S0(Ljava/lang/String;)Lej/e;

    invoke-virtual {p0}, Lej/w;->z()Lej/f;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "closed"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public H(Ljava/lang/String;II)Lej/f;
    .locals 1

    const-string v0, "string"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Lej/w;->c:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lej/w;->b:Lej/e;

    invoke-virtual {v0, p1, p2, p3}, Lej/e;->T0(Ljava/lang/String;II)Lej/e;

    invoke-virtual {p0}, Lej/w;->z()Lej/f;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public K(J)Lej/f;
    .locals 1

    iget-boolean v0, p0, Lej/w;->c:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lej/w;->b:Lej/e;

    invoke-virtual {v0, p1, p2}, Lej/e;->N0(J)Lej/e;

    invoke-virtual {p0}, Lej/w;->z()Lej/f;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public R(Lej/h;)Lej/f;
    .locals 1

    const-string v0, "byteString"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Lej/w;->c:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lej/w;->b:Lej/e;

    invoke-virtual {v0, p1}, Lej/e;->H0(Lej/h;)Lej/e;

    invoke-virtual {p0}, Lej/w;->z()Lej/f;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "closed"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public X([B)Lej/f;
    .locals 1

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Lej/w;->c:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lej/w;->b:Lej/e;

    invoke-virtual {v0, p1}, Lej/e;->I0([B)Lej/e;

    invoke-virtual {p0}, Lej/w;->z()Lej/f;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "closed"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public Z(Lej/e;J)V
    .locals 1

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Lej/w;->c:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lej/w;->b:Lej/e;

    invoke-virtual {v0, p1, p2, p3}, Lej/e;->Z(Lej/e;J)V

    invoke-virtual {p0}, Lej/w;->z()Lej/f;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public b()Lej/e;
    .locals 1

    iget-object v0, p0, Lej/w;->b:Lej/e;

    return-object v0
.end method

.method public c()Lej/E;
    .locals 1

    iget-object v0, p0, Lej/w;->a:Lej/B;

    invoke-interface {v0}, Lej/B;->c()Lej/E;

    move-result-object v0

    return-object v0
.end method

.method public close()V
    .locals 4

    iget-boolean v0, p0, Lej/w;->c:Z

    if-nez v0, :cond_3

    :try_start_0
    iget-object v0, p0, Lej/w;->b:Lej/e;

    invoke-virtual {v0}, Lej/e;->D0()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    iget-object v0, p0, Lej/w;->a:Lej/B;

    iget-object v1, p0, Lej/w;->b:Lej/e;

    invoke-virtual {v1}, Lej/e;->D0()J

    move-result-wide v2

    invoke-interface {v0, v1, v2, v3}, Lej/B;->Z(Lej/e;J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    const/4 v0, 0x0

    :goto_1
    :try_start_1
    iget-object v1, p0, Lej/w;->a:Lej/B;

    invoke-interface {v1}, Lej/B;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception v1

    if-nez v0, :cond_1

    move-object v0, v1

    :cond_1
    :goto_2
    const/4 v1, 0x1

    iput-boolean v1, p0, Lej/w;->c:Z

    if-nez v0, :cond_2

    goto :goto_3

    :cond_2
    throw v0

    :cond_3
    :goto_3
    return-void
.end method

.method public e0(Lej/D;)J
    .locals 6

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/16 v0, 0x0

    :goto_0
    iget-object v2, p0, Lej/w;->b:Lej/e;

    const-wide/16 v3, 0x2000

    invoke-interface {p1, v2, v3, v4}, Lej/D;->U(Lej/e;J)J

    move-result-wide v2

    const-wide/16 v4, -0x1

    cmp-long v4, v2, v4

    if-eqz v4, :cond_0

    add-long/2addr v0, v2

    invoke-virtual {p0}, Lej/w;->z()Lej/f;

    goto :goto_0

    :cond_0
    return-wide v0
.end method

.method public flush()V
    .locals 4

    iget-boolean v0, p0, Lej/w;->c:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Lej/w;->b:Lej/e;

    invoke-virtual {v0}, Lej/e;->D0()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    iget-object v0, p0, Lej/w;->a:Lej/B;

    iget-object v1, p0, Lej/w;->b:Lej/e;

    invoke-virtual {v1}, Lej/e;->D0()J

    move-result-wide v2

    invoke-interface {v0, v1, v2, v3}, Lej/B;->Z(Lej/e;J)V

    :cond_0
    iget-object v0, p0, Lej/w;->a:Lej/B;

    invoke-interface {v0}, Lej/B;->flush()V

    return-void

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "closed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public h0(J)Lej/f;
    .locals 1

    iget-boolean v0, p0, Lej/w;->c:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lej/w;->b:Lej/e;

    invoke-virtual {v0, p1, p2}, Lej/e;->M0(J)Lej/e;

    invoke-virtual {p0}, Lej/w;->z()Lej/f;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public isOpen()Z
    .locals 1

    iget-boolean v0, p0, Lej/w;->c:Z

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public m()Lej/f;
    .locals 4

    iget-boolean v0, p0, Lej/w;->c:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Lej/w;->b:Lej/e;

    invoke-virtual {v0}, Lej/e;->D0()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-lez v2, :cond_0

    iget-object v2, p0, Lej/w;->a:Lej/B;

    iget-object v3, p0, Lej/w;->b:Lej/e;

    invoke-interface {v2, v3, v0, v1}, Lej/B;->Z(Lej/e;J)V

    :cond_0
    return-object p0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "closed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public n(I)Lej/f;
    .locals 1

    iget-boolean v0, p0, Lej/w;->c:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lej/w;->b:Lej/e;

    invoke-virtual {v0, p1}, Lej/e;->Q0(I)Lej/e;

    invoke-virtual {p0}, Lej/w;->z()Lej/f;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "closed"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public o(I)Lej/f;
    .locals 1

    iget-boolean v0, p0, Lej/w;->c:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lej/w;->b:Lej/e;

    invoke-virtual {v0, p1}, Lej/e;->O0(I)Lej/e;

    invoke-virtual {p0}, Lej/w;->z()Lej/f;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "closed"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "buffer("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lej/w;->a:Lej/B;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public u(I)Lej/f;
    .locals 1

    iget-boolean v0, p0, Lej/w;->c:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lej/w;->b:Lej/e;

    invoke-virtual {v0, p1}, Lej/e;->L0(I)Lej/e;

    invoke-virtual {p0}, Lej/w;->z()Lej/f;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "closed"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public write(Ljava/nio/ByteBuffer;)I
    .locals 1

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-boolean v0, p0, Lej/w;->c:Z

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lej/w;->b:Lej/e;

    .line 3
    invoke-virtual {v0, p1}, Lej/e;->write(Ljava/nio/ByteBuffer;)I

    move-result p1

    .line 4
    invoke-virtual {p0}, Lej/w;->z()Lej/f;

    return p1

    .line 5
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "closed"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public write([BII)Lej/f;
    .locals 1

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    iget-boolean v0, p0, Lej/w;->c:Z

    if-nez v0, :cond_0

    .line 7
    iget-object v0, p0, Lej/w;->b:Lej/e;

    .line 8
    invoke-virtual {v0, p1, p2, p3}, Lej/e;->J0([BII)Lej/e;

    .line 9
    invoke-virtual {p0}, Lej/w;->z()Lej/f;

    move-result-object p1

    return-object p1

    .line 10
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public z()Lej/f;
    .locals 4

    iget-boolean v0, p0, Lej/w;->c:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Lej/w;->b:Lej/e;

    invoke-virtual {v0}, Lej/e;->p()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-lez v2, :cond_0

    iget-object v2, p0, Lej/w;->a:Lej/B;

    iget-object v3, p0, Lej/w;->b:Lej/e;

    invoke-interface {v2, v3, v0, v1}, Lej/B;->Z(Lej/e;J)V

    :cond_0
    return-object p0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "closed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
