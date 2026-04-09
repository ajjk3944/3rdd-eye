.class public abstract LIi/i0;
.super LIi/J;
.source "SourceFile"


# instance fields
.field private c:J

.field private d:Z

.field private e:LZg/m;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, LIi/J;-><init>()V

    return-void
.end method

.method public static synthetic q0(LIi/i0;ZILjava/lang/Object;)V
    .locals 0

    if-nez p3, :cond_1

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-virtual {p0, p1}, LIi/i0;->p0(Z)V

    return-void

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: decrementUseCount"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private final r0(Z)J
    .locals 2

    if-eqz p1, :cond_0

    const-wide v0, 0x100000000L

    goto :goto_0

    :cond_0
    const-wide/16 v0, 0x1

    :goto_0
    return-wide v0
.end method

.method public static synthetic v0(LIi/i0;ZILjava/lang/Object;)V
    .locals 0

    if-nez p3, :cond_1

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-virtual {p0, p1}, LIi/i0;->u0(Z)V

    return-void

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: incrementUseCount"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public A0()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final n0(ILjava/lang/String;)LIi/J;
    .locals 0

    invoke-static {p1}, LNi/k;->a(I)V

    invoke-static {p0, p2}, LNi/k;->b(LIi/J;Ljava/lang/String;)LIi/J;

    move-result-object p1

    return-object p1
.end method

.method public final p0(Z)V
    .locals 4

    iget-wide v0, p0, LIi/i0;->c:J

    invoke-direct {p0, p1}, LIi/i0;->r0(Z)J

    move-result-wide v2

    sub-long/2addr v0, v2

    iput-wide v0, p0, LIi/i0;->c:J

    const-wide/16 v2, 0x0

    cmp-long p1, v0, v2

    if-lez p1, :cond_0

    return-void

    :cond_0
    iget-boolean p1, p0, LIi/i0;->d:Z

    if-eqz p1, :cond_1

    invoke-virtual {p0}, LIi/i0;->shutdown()V

    :cond_1
    return-void
.end method

.method public final s0(LIi/a0;)V
    .locals 1

    iget-object v0, p0, LIi/i0;->e:LZg/m;

    if-nez v0, :cond_0

    new-instance v0, LZg/m;

    invoke-direct {v0}, LZg/m;-><init>()V

    iput-object v0, p0, LIi/i0;->e:LZg/m;

    :cond_0
    invoke-virtual {v0, p1}, LZg/m;->addLast(Ljava/lang/Object;)V

    return-void
.end method

.method public abstract shutdown()V
.end method

.method protected t0()J
    .locals 3

    iget-object v0, p0, LIi/i0;->e:LZg/m;

    const-wide v1, 0x7fffffffffffffffL

    if-nez v0, :cond_0

    return-wide v1

    :cond_0
    invoke-virtual {v0}, LZg/m;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    const-wide/16 v1, 0x0

    :goto_0
    return-wide v1
.end method

.method public final u0(Z)V
    .locals 4

    iget-wide v0, p0, LIi/i0;->c:J

    invoke-direct {p0, p1}, LIi/i0;->r0(Z)J

    move-result-wide v2

    add-long/2addr v0, v2

    iput-wide v0, p0, LIi/i0;->c:J

    if-nez p1, :cond_0

    const/4 p1, 0x1

    iput-boolean p1, p0, LIi/i0;->d:Z

    :cond_0
    return-void
.end method

.method public final w0()Z
    .locals 5

    iget-wide v0, p0, LIi/i0;->c:J

    const/4 v2, 0x1

    invoke-direct {p0, v2}, LIi/i0;->r0(Z)J

    move-result-wide v3

    cmp-long v0, v0, v3

    if-ltz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    return v2
.end method

.method public final x0()Z
    .locals 1

    iget-object v0, p0, LIi/i0;->e:LZg/m;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LZg/m;->isEmpty()Z

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0
.end method

.method public abstract y0()J
.end method

.method public final z0()Z
    .locals 2

    iget-object v0, p0, LIi/i0;->e:LZg/m;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {v0}, LZg/m;->N0()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LIi/a0;

    if-nez v0, :cond_1

    return v1

    :cond_1
    invoke-virtual {v0}, LIi/a0;->run()V

    const/4 v0, 0x1

    return v0
.end method
