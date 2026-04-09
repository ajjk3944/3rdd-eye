.class public final Lej/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lej/g;


# instance fields
.field public final a:Lej/D;

.field public final b:Lej/e;

.field public c:Z


# direct methods
.method public constructor <init>(Lej/D;)V
    .locals 1

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lej/x;->a:Lej/D;

    new-instance p1, Lej/e;

    invoke-direct {p1}, Lej/e;-><init>()V

    iput-object p1, p0, Lej/x;->b:Lej/e;

    return-void
.end method


# virtual methods
.method public A()J
    .locals 10

    const-wide/16 v0, 0x1

    invoke-virtual {p0, v0, v1}, Lej/x;->g0(J)V

    const-wide/16 v2, 0x0

    move-wide v4, v2

    :goto_0
    add-long v6, v4, v0

    invoke-virtual {p0, v6, v7}, Lej/x;->request(J)Z

    move-result v8

    if-eqz v8, :cond_4

    iget-object v8, p0, Lej/x;->b:Lej/e;

    invoke-virtual {v8, v4, v5}, Lej/e;->f0(J)B

    move-result v8

    const/16 v9, 0x30

    if-lt v8, v9, :cond_0

    const/16 v9, 0x39

    if-le v8, v9, :cond_1

    :cond_0
    cmp-long v4, v4, v2

    if-nez v4, :cond_2

    const/16 v5, 0x2d

    if-eq v8, v5, :cond_1

    goto :goto_1

    :cond_1
    move-wide v4, v6

    goto :goto_0

    :cond_2
    :goto_1
    if-eqz v4, :cond_3

    goto :goto_2

    :cond_3
    new-instance v0, Ljava/lang/NumberFormatException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Expected a digit or \'-\' but was 0x"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0x10

    invoke-static {v2}, Lkotlin/text/a;->a(I)I

    move-result v2

    invoke-static {v8, v2}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v2

    const-string v3, "toString(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    :goto_2
    iget-object v0, p0, Lej/x;->b:Lej/e;

    invoke-virtual {v0}, Lej/e;->A()J

    move-result-wide v0

    return-wide v0
.end method

.method public D(J)Ljava/lang/String;
    .locals 13

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-ltz v0, :cond_3

    const-wide v0, 0x7fffffffffffffffL

    cmp-long v2, p1, v0

    const-wide/16 v3, 0x1

    if-nez v2, :cond_0

    move-wide v5, v0

    goto :goto_0

    :cond_0
    add-long v5, p1, v3

    :goto_0
    const/16 v8, 0xa

    const-wide/16 v9, 0x0

    move-object v7, p0

    move-wide v11, v5

    invoke-virtual/range {v7 .. v12}, Lej/x;->a(BJJ)J

    move-result-wide v7

    const-wide/16 v9, -0x1

    cmp-long v2, v7, v9

    if-eqz v2, :cond_1

    iget-object p1, p0, Lej/x;->b:Lej/e;

    invoke-static {p1, v7, v8}, Lfj/a;->d(Lej/e;J)Ljava/lang/String;

    move-result-object p1

    goto :goto_1

    :cond_1
    cmp-long v0, v5, v0

    if-gez v0, :cond_2

    invoke-virtual {p0, v5, v6}, Lej/x;->request(J)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lej/x;->b:Lej/e;

    sub-long v1, v5, v3

    invoke-virtual {v0, v1, v2}, Lej/e;->f0(J)B

    move-result v0

    const/16 v1, 0xd

    if-ne v0, v1, :cond_2

    add-long/2addr v3, v5

    invoke-virtual {p0, v3, v4}, Lej/x;->request(J)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lej/x;->b:Lej/e;

    invoke-virtual {v0, v5, v6}, Lej/e;->f0(J)B

    move-result v0

    const/16 v1, 0xa

    if-ne v0, v1, :cond_2

    iget-object p1, p0, Lej/x;->b:Lej/e;

    invoke-static {p1, v5, v6}, Lfj/a;->d(Lej/e;J)Ljava/lang/String;

    move-result-object p1

    :goto_1
    return-object p1

    :cond_2
    new-instance v6, Lej/e;

    invoke-direct {v6}, Lej/e;-><init>()V

    iget-object v0, p0, Lej/x;->b:Lej/e;

    invoke-virtual {v0}, Lej/e;->D0()J

    move-result-wide v1

    const/16 v3, 0x20

    int-to-long v3, v3

    invoke-static {v3, v4, v1, v2}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v4

    const-wide/16 v2, 0x0

    move-object v1, v6

    invoke-virtual/range {v0 .. v5}, Lej/e;->S(Lej/e;JJ)Lej/e;

    new-instance v0, Ljava/io/EOFException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "\\n not found: limit="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lej/x;->b:Lej/e;

    invoke-virtual {v2}, Lej/e;->D0()J

    move-result-wide v2

    invoke-static {v2, v3, p1, p2}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p1

    invoke-virtual {v1, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p1, " content="

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Lej/e;->v0()Lej/h;

    move-result-object p1

    invoke-virtual {p1}, Lej/h;->t()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p1, 0x2026

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "limit < 0: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public E(Lej/s;)I
    .locals 5

    const-string v0, "options"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Lej/x;->c:Z

    if-nez v0, :cond_3

    :cond_0
    iget-object v0, p0, Lej/x;->b:Lej/e;

    const/4 v1, 0x1

    invoke-static {v0, p1, v1}, Lfj/a;->e(Lej/e;Lej/s;Z)I

    move-result v0

    const/4 v1, -0x2

    const/4 v2, -0x1

    if-eq v0, v1, :cond_2

    if-eq v0, v2, :cond_1

    invoke-virtual {p1}, Lej/s;->C()[Lej/h;

    move-result-object p1

    aget-object p1, p1, v0

    invoke-virtual {p1}, Lej/h;->b0()I

    move-result p1

    iget-object v1, p0, Lej/x;->b:Lej/e;

    int-to-long v2, p1

    invoke-virtual {v1, v2, v3}, Lej/e;->d(J)V

    goto :goto_1

    :cond_1
    :goto_0
    move v0, v2

    goto :goto_1

    :cond_2
    iget-object v0, p0, Lej/x;->a:Lej/D;

    iget-object v1, p0, Lej/x;->b:Lej/e;

    const-wide/16 v3, 0x2000

    invoke-interface {v0, v1, v3, v4}, Lej/D;->U(Lej/e;J)J

    move-result-wide v0

    const-wide/16 v3, -0x1

    cmp-long v0, v0, v3

    if-nez v0, :cond_0

    goto :goto_0

    :goto_1
    return v0

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "closed"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public G(Ljava/nio/charset/Charset;)Ljava/lang/String;
    .locals 2

    const-string v0, "charset"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lej/x;->b:Lej/e;

    iget-object v1, p0, Lej/x;->a:Lej/D;

    invoke-virtual {v0, v1}, Lej/e;->e0(Lej/D;)J

    iget-object v0, p0, Lej/x;->b:Lej/e;

    invoke-virtual {v0, p1}, Lej/e;->G(Ljava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public M(Lej/h;)J
    .locals 2

    const-string v0, "targetBytes"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/16 v0, 0x0

    invoke-virtual {p0, p1, v0, v1}, Lej/x;->h(Lej/h;J)J

    move-result-wide v0

    return-wide v0
.end method

.method public Q()Ljava/lang/String;
    .locals 2

    const-wide v0, 0x7fffffffffffffffL

    invoke-virtual {p0, v0, v1}, Lej/x;->D(J)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public U(Lej/e;J)J
    .locals 4

    const-string v0, "sink"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/16 v0, 0x0

    cmp-long v2, p2, v0

    if-ltz v2, :cond_2

    iget-boolean v2, p0, Lej/x;->c:Z

    if-nez v2, :cond_1

    iget-object v2, p0, Lej/x;->b:Lej/e;

    invoke-virtual {v2}, Lej/e;->D0()J

    move-result-wide v2

    cmp-long v0, v2, v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lej/x;->a:Lej/D;

    iget-object v1, p0, Lej/x;->b:Lej/e;

    const-wide/16 v2, 0x2000

    invoke-interface {v0, v1, v2, v3}, Lej/D;->U(Lej/e;J)J

    move-result-wide v0

    const-wide/16 v2, -0x1

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lej/x;->b:Lej/e;

    invoke-virtual {v0}, Lej/e;->D0()J

    move-result-wide v0

    invoke-static {p2, p3, v0, v1}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p2

    iget-object v0, p0, Lej/x;->b:Lej/e;

    invoke-virtual {v0, p1, p2, p3}, Lej/e;->U(Lej/e;J)J

    move-result-wide v2

    :goto_0
    return-wide v2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "byteCount < 0: "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public V(J)[B
    .locals 1

    invoke-virtual {p0, p1, p2}, Lej/x;->g0(J)V

    iget-object v0, p0, Lej/x;->b:Lej/e;

    invoke-virtual {v0, p1, p2}, Lej/e;->V(J)[B

    move-result-object p1

    return-object p1
.end method

.method public W(Lej/h;)J
    .locals 2

    const-string v0, "bytes"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/16 v0, 0x0

    invoke-virtual {p0, p1, v0, v1}, Lej/x;->g(Lej/h;J)J

    move-result-wide v0

    return-wide v0
.end method

.method public a(BJJ)J
    .locals 9

    iget-boolean v0, p0, Lej/x;->c:Z

    if-nez v0, :cond_4

    const-wide/16 v0, 0x0

    cmp-long v0, v0, p2

    if-gtz v0, :cond_3

    cmp-long v0, p2, p4

    if-gtz v0, :cond_3

    :goto_0
    cmp-long v0, p2, p4

    const-wide/16 v7, -0x1

    if-gez v0, :cond_2

    iget-object v1, p0, Lej/x;->b:Lej/e;

    move v2, p1

    move-wide v3, p2

    move-wide v5, p4

    invoke-virtual/range {v1 .. v6}, Lej/e;->m0(BJJ)J

    move-result-wide v0

    cmp-long v2, v0, v7

    if-eqz v2, :cond_0

    move-wide v7, v0

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lej/x;->b:Lej/e;

    invoke-virtual {v0}, Lej/e;->D0()J

    move-result-wide v0

    cmp-long v2, v0, p4

    if-gez v2, :cond_2

    iget-object v2, p0, Lej/x;->a:Lej/D;

    iget-object v3, p0, Lej/x;->b:Lej/e;

    const-wide/16 v4, 0x2000

    invoke-interface {v2, v3, v4, v5}, Lej/D;->U(Lej/e;J)J

    move-result-wide v2

    cmp-long v2, v2, v7

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-static {p2, p3, v0, v1}, Ljava/lang/Math;->max(JJ)J

    move-result-wide p2

    goto :goto_0

    :cond_2
    :goto_1
    return-wide v7

    :cond_3
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "fromIndex="

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p2, " toIndex="

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p4, p5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public b()Lej/e;
    .locals 1

    iget-object v0, p0, Lej/x;->b:Lej/e;

    return-object v0
.end method

.method public c()Lej/E;
    .locals 1

    iget-object v0, p0, Lej/x;->a:Lej/D;

    invoke-interface {v0}, Lej/D;->c()Lej/E;

    move-result-object v0

    return-object v0
.end method

.method public close()V
    .locals 1

    iget-boolean v0, p0, Lej/x;->c:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lej/x;->c:Z

    iget-object v0, p0, Lej/x;->a:Lej/D;

    invoke-interface {v0}, Lej/D;->close()V

    iget-object v0, p0, Lej/x;->b:Lej/e;

    invoke-virtual {v0}, Lej/e;->clear()V

    :cond_0
    return-void
.end method

.method public d(J)V
    .locals 4

    iget-boolean v0, p0, Lej/x;->c:Z

    if-nez v0, :cond_3

    :goto_0
    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-lez v2, :cond_2

    iget-object v2, p0, Lej/x;->b:Lej/e;

    invoke-virtual {v2}, Lej/e;->D0()J

    move-result-wide v2

    cmp-long v0, v2, v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lej/x;->a:Lej/D;

    iget-object v1, p0, Lej/x;->b:Lej/e;

    const-wide/16 v2, 0x2000

    invoke-interface {v0, v1, v2, v3}, Lej/D;->U(Lej/e;J)J

    move-result-wide v0

    const-wide/16 v2, -0x1

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/io/EOFException;

    invoke-direct {p1}, Ljava/io/EOFException;-><init>()V

    throw p1

    :cond_1
    :goto_1
    iget-object v0, p0, Lej/x;->b:Lej/e;

    invoke-virtual {v0}, Lej/e;->D0()J

    move-result-wide v0

    invoke-static {p1, p2, v0, v1}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    iget-object v2, p0, Lej/x;->b:Lej/e;

    invoke-virtual {v2, v0, v1}, Lej/e;->d(J)V

    sub-long/2addr p1, v0

    goto :goto_0

    :cond_2
    return-void

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public g(Lej/h;J)J
    .locals 8

    const-string v0, "bytes"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Lej/x;->c:Z

    if-nez v0, :cond_2

    :goto_0
    iget-object v0, p0, Lej/x;->b:Lej/e;

    invoke-virtual {v0, p1, p2, p3}, Lej/e;->n0(Lej/h;J)J

    move-result-wide v0

    const-wide/16 v2, -0x1

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lej/x;->b:Lej/e;

    invoke-virtual {v0}, Lej/e;->D0()J

    move-result-wide v0

    iget-object v4, p0, Lej/x;->a:Lej/D;

    iget-object v5, p0, Lej/x;->b:Lej/e;

    const-wide/16 v6, 0x2000

    invoke-interface {v4, v5, v6, v7}, Lej/D;->U(Lej/e;J)J

    move-result-wide v4

    cmp-long v4, v4, v2

    if-nez v4, :cond_1

    move-wide v0, v2

    :goto_1
    return-wide v0

    :cond_1
    invoke-virtual {p1}, Lej/h;->b0()I

    move-result v2

    int-to-long v2, v2

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    invoke-static {p2, p3, v0, v1}, Ljava/lang/Math;->max(JJ)J

    move-result-wide p2

    goto :goto_0

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public g0(J)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lej/x;->request(J)Z

    move-result p1

    if-eqz p1, :cond_0

    return-void

    :cond_0
    new-instance p1, Ljava/io/EOFException;

    invoke-direct {p1}, Ljava/io/EOFException;-><init>()V

    throw p1
.end method

.method public h(Lej/h;J)J
    .locals 8

    const-string v0, "targetBytes"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Lej/x;->c:Z

    if-nez v0, :cond_2

    :goto_0
    iget-object v0, p0, Lej/x;->b:Lej/e;

    invoke-virtual {v0, p1, p2, p3}, Lej/e;->o0(Lej/h;J)J

    move-result-wide v0

    const-wide/16 v2, -0x1

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lej/x;->b:Lej/e;

    invoke-virtual {v0}, Lej/e;->D0()J

    move-result-wide v0

    iget-object v4, p0, Lej/x;->a:Lej/D;

    iget-object v5, p0, Lej/x;->b:Lej/e;

    const-wide/16 v6, 0x2000

    invoke-interface {v4, v5, v6, v7}, Lej/D;->U(Lej/e;J)J

    move-result-wide v4

    cmp-long v4, v4, v2

    if-nez v4, :cond_1

    move-wide v0, v2

    :goto_1
    return-wide v0

    :cond_1
    invoke-static {p2, p3, v0, v1}, Ljava/lang/Math;->max(JJ)J

    move-result-wide p2

    goto :goto_0

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public i0(JLej/h;)Z
    .locals 7

    const-string v0, "bytes"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p3}, Lej/h;->b0()I

    move-result v6

    const/4 v5, 0x0

    move-object v1, p0

    move-wide v2, p1

    move-object v4, p3

    invoke-virtual/range {v1 .. v6}, Lej/x;->j(JLej/h;II)Z

    move-result p1

    return p1
.end method

.method public isOpen()Z
    .locals 1

    iget-boolean v0, p0, Lej/x;->c:Z

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public j(JLej/h;II)Z
    .locals 6

    const-string v0, "bytes"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Lej/x;->c:Z

    if-nez v0, :cond_5

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    const/4 v1, 0x0

    if-ltz v0, :cond_4

    if-ltz p4, :cond_4

    if-ltz p5, :cond_4

    invoke-virtual {p3}, Lej/h;->b0()I

    move-result v0

    sub-int/2addr v0, p4

    if-ge v0, p5, :cond_0

    goto :goto_1

    :cond_0
    move v0, v1

    :goto_0
    if-ge v0, p5, :cond_3

    int-to-long v2, v0

    add-long/2addr v2, p1

    const-wide/16 v4, 0x1

    add-long/2addr v4, v2

    invoke-virtual {p0, v4, v5}, Lej/x;->request(J)Z

    move-result v4

    if-nez v4, :cond_1

    goto :goto_1

    :cond_1
    iget-object v4, p0, Lej/x;->b:Lej/e;

    invoke-virtual {v4, v2, v3}, Lej/e;->f0(J)B

    move-result v2

    add-int v3, p4, v0

    invoke-virtual {p3, v3}, Lej/h;->l(I)B

    move-result v3

    if-eq v2, v3, :cond_2

    goto :goto_1

    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_3
    const/4 v1, 0x1

    :cond_4
    :goto_1
    return v1

    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public j0(B)J
    .locals 6

    const-wide/16 v2, 0x0

    const-wide v4, 0x7fffffffffffffffL

    move-object v0, p0

    move v1, p1

    invoke-virtual/range {v0 .. v5}, Lej/x;->a(BJJ)J

    move-result-wide v0

    return-wide v0
.end method

.method public k()Lej/e;
    .locals 1

    iget-object v0, p0, Lej/x;->b:Lej/e;

    return-object v0
.end method

.method public k0()J
    .locals 5

    const-wide/16 v0, 0x1

    invoke-virtual {p0, v0, v1}, Lej/x;->g0(J)V

    const/4 v0, 0x0

    :goto_0
    add-int/lit8 v1, v0, 0x1

    int-to-long v2, v1

    invoke-virtual {p0, v2, v3}, Lej/x;->request(J)Z

    move-result v2

    if-eqz v2, :cond_5

    iget-object v2, p0, Lej/x;->b:Lej/e;

    int-to-long v3, v0

    invoke-virtual {v2, v3, v4}, Lej/e;->f0(J)B

    move-result v2

    const/16 v3, 0x30

    if-lt v2, v3, :cond_0

    const/16 v3, 0x39

    if-le v2, v3, :cond_2

    :cond_0
    const/16 v3, 0x61

    if-lt v2, v3, :cond_1

    const/16 v3, 0x66

    if-le v2, v3, :cond_2

    :cond_1
    const/16 v3, 0x41

    if-lt v2, v3, :cond_3

    const/16 v3, 0x46

    if-le v2, v3, :cond_2

    goto :goto_1

    :cond_2
    move v0, v1

    goto :goto_0

    :cond_3
    :goto_1
    if-eqz v0, :cond_4

    goto :goto_2

    :cond_4
    new-instance v0, Ljava/lang/NumberFormatException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Expected leading [0-9a-fA-F] character but was 0x"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v3, 0x10

    invoke-static {v3}, Lkotlin/text/a;->a(I)I

    move-result v3

    invoke-static {v2, v3}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v2

    const-string v3, "toString(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5
    :goto_2
    iget-object v0, p0, Lej/x;->b:Lej/e;

    invoke-virtual {v0}, Lej/e;->k0()J

    move-result-wide v0

    return-wide v0
.end method

.method public l(J)Lej/h;
    .locals 1

    invoke-virtual {p0, p1, p2}, Lej/x;->g0(J)V

    iget-object v0, p0, Lej/x;->b:Lej/e;

    invoke-virtual {v0, p1, p2}, Lej/e;->l(J)Lej/h;

    move-result-object p1

    return-object p1
.end method

.method public l0()Ljava/io/InputStream;
    .locals 1

    new-instance v0, Lej/x$a;

    invoke-direct {v0, p0}, Lej/x$a;-><init>(Lej/x;)V

    return-object v0
.end method

.method public p()I
    .locals 2

    const-wide/16 v0, 0x4

    invoke-virtual {p0, v0, v1}, Lej/x;->g0(J)V

    iget-object v0, p0, Lej/x;->b:Lej/e;

    invoke-virtual {v0}, Lej/e;->w0()I

    move-result v0

    return v0
.end method

.method public peek()Lej/g;
    .locals 1

    new-instance v0, Lej/u;

    invoke-direct {v0, p0}, Lej/u;-><init>(Lej/g;)V

    invoke-static {v0}, Lej/p;->d(Lej/D;)Lej/g;

    move-result-object v0

    return-object v0
.end method

.method public q(Lej/B;)J
    .locals 8

    const-string v0, "sink"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/16 v0, 0x0

    move-wide v2, v0

    :cond_0
    :goto_0
    iget-object v4, p0, Lej/x;->a:Lej/D;

    iget-object v5, p0, Lej/x;->b:Lej/e;

    const-wide/16 v6, 0x2000

    invoke-interface {v4, v5, v6, v7}, Lej/D;->U(Lej/e;J)J

    move-result-wide v4

    const-wide/16 v6, -0x1

    cmp-long v4, v4, v6

    if-eqz v4, :cond_1

    iget-object v4, p0, Lej/x;->b:Lej/e;

    invoke-virtual {v4}, Lej/e;->p()J

    move-result-wide v4

    cmp-long v6, v4, v0

    if-lez v6, :cond_0

    add-long/2addr v2, v4

    iget-object v6, p0, Lej/x;->b:Lej/e;

    invoke-interface {p1, v6, v4, v5}, Lej/B;->Z(Lej/e;J)V

    goto :goto_0

    :cond_1
    iget-object v4, p0, Lej/x;->b:Lej/e;

    invoke-virtual {v4}, Lej/e;->D0()J

    move-result-wide v4

    cmp-long v0, v4, v0

    if-lez v0, :cond_2

    iget-object v0, p0, Lej/x;->b:Lej/e;

    invoke-virtual {v0}, Lej/e;->D0()J

    move-result-wide v0

    add-long/2addr v2, v0

    iget-object v0, p0, Lej/x;->b:Lej/e;

    invoke-virtual {v0}, Lej/e;->D0()J

    move-result-wide v4

    invoke-interface {p1, v0, v4, v5}, Lej/B;->Z(Lej/e;J)V

    :cond_2
    return-wide v2
.end method

.method public r()[B
    .locals 2

    iget-object v0, p0, Lej/x;->b:Lej/e;

    iget-object v1, p0, Lej/x;->a:Lej/D;

    invoke-virtual {v0, v1}, Lej/e;->e0(Lej/D;)J

    iget-object v0, p0, Lej/x;->b:Lej/e;

    invoke-virtual {v0}, Lej/e;->r()[B

    move-result-object v0

    return-object v0
.end method

.method public read(Ljava/nio/ByteBuffer;)I
    .locals 4

    const-string v0, "sink"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lej/x;->b:Lej/e;

    invoke-virtual {v0}, Lej/e;->D0()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    iget-object v0, p0, Lej/x;->a:Lej/D;

    iget-object v1, p0, Lej/x;->b:Lej/e;

    const-wide/16 v2, 0x2000

    invoke-interface {v0, v1, v2, v3}, Lej/D;->U(Lej/e;J)J

    move-result-wide v0

    const-wide/16 v2, -0x1

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    const/4 p1, -0x1

    return p1

    :cond_0
    iget-object v0, p0, Lej/x;->b:Lej/e;

    invoke-virtual {v0, p1}, Lej/e;->read(Ljava/nio/ByteBuffer;)I

    move-result p1

    return p1
.end method

.method public readByte()B
    .locals 2

    const-wide/16 v0, 0x1

    invoke-virtual {p0, v0, v1}, Lej/x;->g0(J)V

    iget-object v0, p0, Lej/x;->b:Lej/e;

    invoke-virtual {v0}, Lej/e;->readByte()B

    move-result v0

    return v0
.end method

.method public readFully([B)V
    .locals 6

    const-string v0, "sink"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    array-length v0, p1

    int-to-long v0, v0

    invoke-virtual {p0, v0, v1}, Lej/x;->g0(J)V
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    iget-object v0, p0, Lej/x;->b:Lej/e;

    invoke-virtual {v0, p1}, Lej/e;->readFully([B)V

    return-void

    :catch_0
    move-exception v0

    const/4 v1, 0x0

    :goto_0
    iget-object v2, p0, Lej/x;->b:Lej/e;

    invoke-virtual {v2}, Lej/e;->D0()J

    move-result-wide v2

    const-wide/16 v4, 0x0

    cmp-long v2, v2, v4

    if-lez v2, :cond_1

    iget-object v2, p0, Lej/x;->b:Lej/e;

    invoke-virtual {v2}, Lej/e;->D0()J

    move-result-wide v3

    long-to-int v3, v3

    invoke-virtual {v2, p1, v1, v3}, Lej/e;->s0([BII)I

    move-result v2

    const/4 v3, -0x1

    if-eq v2, v3, :cond_0

    add-int/2addr v1, v2

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    throw p1

    :cond_1
    throw v0
.end method

.method public readInt()I
    .locals 2

    const-wide/16 v0, 0x4

    invoke-virtual {p0, v0, v1}, Lej/x;->g0(J)V

    iget-object v0, p0, Lej/x;->b:Lej/e;

    invoke-virtual {v0}, Lej/e;->readInt()I

    move-result v0

    return v0
.end method

.method public readLong()J
    .locals 2

    const-wide/16 v0, 0x8

    invoke-virtual {p0, v0, v1}, Lej/x;->g0(J)V

    iget-object v0, p0, Lej/x;->b:Lej/e;

    invoke-virtual {v0}, Lej/e;->readLong()J

    move-result-wide v0

    return-wide v0
.end method

.method public readShort()S
    .locals 2

    const-wide/16 v0, 0x2

    invoke-virtual {p0, v0, v1}, Lej/x;->g0(J)V

    iget-object v0, p0, Lej/x;->b:Lej/e;

    invoke-virtual {v0}, Lej/e;->readShort()S

    move-result v0

    return v0
.end method

.method public request(J)Z
    .locals 4

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-ltz v0, :cond_3

    iget-boolean v0, p0, Lej/x;->c:Z

    if-nez v0, :cond_2

    :cond_0
    iget-object v0, p0, Lej/x;->b:Lej/e;

    invoke-virtual {v0}, Lej/e;->D0()J

    move-result-wide v0

    cmp-long v0, v0, p1

    if-gez v0, :cond_1

    iget-object v0, p0, Lej/x;->a:Lej/D;

    iget-object v1, p0, Lej/x;->b:Lej/e;

    const-wide/16 v2, 0x2000

    invoke-interface {v0, v1, v2, v3}, Lej/D;->U(Lej/e;J)J

    move-result-wide v0

    const-wide/16 v2, -0x1

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_1
    const/4 p1, 0x1

    :goto_0
    return p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "byteCount < 0: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public s()S
    .locals 2

    const-wide/16 v0, 0x2

    invoke-virtual {p0, v0, v1}, Lej/x;->g0(J)V

    iget-object v0, p0, Lej/x;->b:Lej/e;

    invoke-virtual {v0}, Lej/e;->x0()S

    move-result v0

    return v0
.end method

.method public t()Z
    .locals 4

    iget-boolean v0, p0, Lej/x;->c:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Lej/x;->b:Lej/e;

    invoke-virtual {v0}, Lej/e;->t()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lej/x;->a:Lej/D;

    iget-object v1, p0, Lej/x;->b:Lej/e;

    const-wide/16 v2, 0x2000

    invoke-interface {v0, v1, v2, v3}, Lej/D;->U(Lej/e;J)J

    move-result-wide v0

    const-wide/16 v2, -0x1

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "closed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "buffer("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lej/x;->a:Lej/D;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public w(Lej/e;J)V
    .locals 1

    const-string v0, "sink"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    invoke-virtual {p0, p2, p3}, Lej/x;->g0(J)V
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    iget-object v0, p0, Lej/x;->b:Lej/e;

    invoke-virtual {v0, p1, p2, p3}, Lej/e;->w(Lej/e;J)V

    return-void

    :catch_0
    move-exception p2

    iget-object p3, p0, Lej/x;->b:Lej/e;

    invoke-virtual {p1, p3}, Lej/e;->e0(Lej/D;)J

    throw p2
.end method
