.class public final Lej/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lej/D;


# instance fields
.field private final a:Lej/g;

.field private final b:Lej/e;

.field private c:Lej/y;

.field private d:I

.field private e:Z

.field private f:J


# direct methods
.method public constructor <init>(Lej/g;)V
    .locals 1

    const-string v0, "upstream"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lej/u;->a:Lej/g;

    invoke-interface {p1}, Lej/g;->b()Lej/e;

    move-result-object p1

    iput-object p1, p0, Lej/u;->b:Lej/e;

    iget-object p1, p1, Lej/e;->a:Lej/y;

    iput-object p1, p0, Lej/u;->c:Lej/y;

    if-eqz p1, :cond_0

    iget p1, p1, Lej/y;->b:I

    goto :goto_0

    :cond_0
    const/4 p1, -0x1

    :goto_0
    iput p1, p0, Lej/u;->d:I

    return-void
.end method


# virtual methods
.method public U(Lej/e;J)J
    .locals 8

    const-string v0, "sink"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/16 v0, 0x0

    cmp-long v2, p2, v0

    if-ltz v2, :cond_6

    iget-boolean v3, p0, Lej/u;->e:Z

    if-nez v3, :cond_5

    iget-object v3, p0, Lej/u;->c:Lej/y;

    if-eqz v3, :cond_1

    iget-object v4, p0, Lej/u;->b:Lej/e;

    iget-object v4, v4, Lej/e;->a:Lej/y;

    if-ne v3, v4, :cond_0

    iget v3, p0, Lej/u;->d:I

    invoke-static {v4}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    iget v4, v4, Lej/y;->b:I

    if-ne v3, v4, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Peek source is invalid because upstream source was used"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    if-nez v2, :cond_2

    return-wide v0

    :cond_2
    iget-object v0, p0, Lej/u;->a:Lej/g;

    iget-wide v1, p0, Lej/u;->f:J

    const-wide/16 v3, 0x1

    add-long/2addr v1, v3

    invoke-interface {v0, v1, v2}, Lej/g;->request(J)Z

    move-result v0

    if-nez v0, :cond_3

    const-wide/16 p1, -0x1

    return-wide p1

    :cond_3
    iget-object v0, p0, Lej/u;->c:Lej/y;

    if-nez v0, :cond_4

    iget-object v0, p0, Lej/u;->b:Lej/e;

    iget-object v0, v0, Lej/e;->a:Lej/y;

    if-eqz v0, :cond_4

    iput-object v0, p0, Lej/u;->c:Lej/y;

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    iget v0, v0, Lej/y;->b:I

    iput v0, p0, Lej/u;->d:I

    :cond_4
    iget-object v0, p0, Lej/u;->b:Lej/e;

    invoke-virtual {v0}, Lej/e;->D0()J

    move-result-wide v0

    iget-wide v2, p0, Lej/u;->f:J

    sub-long/2addr v0, v2

    invoke-static {p2, p3, v0, v1}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p2

    iget-object v2, p0, Lej/u;->b:Lej/e;

    iget-wide v4, p0, Lej/u;->f:J

    move-object v3, p1

    move-wide v6, p2

    invoke-virtual/range {v2 .. v7}, Lej/e;->S(Lej/e;JJ)Lej/e;

    iget-wide v0, p0, Lej/u;->f:J

    add-long/2addr v0, p2

    iput-wide v0, p0, Lej/u;->f:J

    return-wide p2

    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
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

.method public c()Lej/E;
    .locals 1

    iget-object v0, p0, Lej/u;->a:Lej/g;

    invoke-interface {v0}, Lej/D;->c()Lej/E;

    move-result-object v0

    return-object v0
.end method

.method public close()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lej/u;->e:Z

    return-void
.end method
