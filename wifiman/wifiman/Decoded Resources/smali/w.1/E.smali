.class final Lw/E;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lw/q;

.field private b:J


# direct methods
.method public constructor <init>(Lw/q;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw/E;->a:Lw/q;

    sget-object p1, Ll0/g;->b:Ll0/g$a;

    invoke-virtual {p1}, Ll0/g$a;->c()J

    move-result-wide v0

    iput-wide v0, p0, Lw/E;->b:J

    return-void
.end method

.method private final b(F)J
    .locals 4

    iget-object v0, p0, Lw/E;->a:Lw/q;

    if-nez v0, :cond_0

    iget-wide v0, p0, Lw/E;->b:J

    invoke-static {v0, v1}, Ll0/g;->k(J)F

    move-result v2

    invoke-static {v0, v1, v2}, Ll0/g;->h(JF)J

    move-result-wide v0

    invoke-static {v0, v1, p1}, Ll0/g;->s(JF)J

    move-result-wide v0

    iget-wide v2, p0, Lw/E;->b:J

    invoke-static {v2, v3, v0, v1}, Ll0/g;->q(JJ)J

    move-result-wide v0

    goto :goto_0

    :cond_0
    iget-wide v0, p0, Lw/E;->b:J

    invoke-virtual {p0, v0, v1}, Lw/E;->d(J)F

    move-result v0

    iget-wide v1, p0, Lw/E;->b:J

    invoke-virtual {p0, v1, v2}, Lw/E;->d(J)F

    move-result v1

    invoke-static {v1}, Ljava/lang/Math;->signum(F)F

    move-result v1

    mul-float/2addr v1, p1

    sub-float/2addr v0, v1

    iget-wide v1, p0, Lw/E;->b:J

    invoke-virtual {p0, v1, v2}, Lw/E;->c(J)F

    move-result p1

    iget-object v1, p0, Lw/E;->a:Lw/q;

    sget-object v2, Lw/q;->Horizontal:Lw/q;

    if-ne v1, v2, :cond_1

    invoke-static {v0, p1}, Ll0/h;->a(FF)J

    move-result-wide v0

    goto :goto_0

    :cond_1
    invoke-static {p1, v0}, Ll0/h;->a(FF)J

    move-result-wide v0

    :goto_0
    return-wide v0
.end method


# virtual methods
.method public final a(Ly0/y;F)Ll0/g;
    .locals 4

    invoke-virtual {p1}, Ly0/y;->h()J

    move-result-wide v0

    invoke-virtual {p1}, Ly0/y;->k()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Ll0/g;->q(JJ)J

    move-result-wide v0

    iget-wide v2, p0, Lw/E;->b:J

    invoke-static {v2, v3, v0, v1}, Ll0/g;->r(JJ)J

    move-result-wide v0

    iput-wide v0, p0, Lw/E;->b:J

    iget-object p1, p0, Lw/E;->a:Lw/q;

    if-nez p1, :cond_0

    invoke-static {v0, v1}, Ll0/g;->k(J)F

    move-result p1

    goto :goto_0

    :cond_0
    invoke-virtual {p0, v0, v1}, Lw/E;->d(J)F

    move-result p1

    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result p1

    :goto_0
    cmpl-float p1, p1, p2

    if-ltz p1, :cond_1

    invoke-direct {p0, p2}, Lw/E;->b(F)J

    move-result-wide p1

    invoke-static {p1, p2}, Ll0/g;->d(J)Ll0/g;

    move-result-object p1

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    :goto_1
    return-object p1
.end method

.method public final c(J)F
    .locals 2

    iget-object v0, p0, Lw/E;->a:Lw/q;

    sget-object v1, Lw/q;->Horizontal:Lw/q;

    if-ne v0, v1, :cond_0

    invoke-static {p1, p2}, Ll0/g;->n(J)F

    move-result p1

    goto :goto_0

    :cond_0
    invoke-static {p1, p2}, Ll0/g;->m(J)F

    move-result p1

    :goto_0
    return p1
.end method

.method public final d(J)F
    .locals 2

    iget-object v0, p0, Lw/E;->a:Lw/q;

    sget-object v1, Lw/q;->Horizontal:Lw/q;

    if-ne v0, v1, :cond_0

    invoke-static {p1, p2}, Ll0/g;->m(J)F

    move-result p1

    goto :goto_0

    :cond_0
    invoke-static {p1, p2}, Ll0/g;->n(J)F

    move-result p1

    :goto_0
    return p1
.end method

.method public final e()V
    .locals 2

    sget-object v0, Ll0/g;->b:Ll0/g$a;

    invoke-virtual {v0}, Ll0/g$a;->c()J

    move-result-wide v0

    iput-wide v0, p0, Lw/E;->b:J

    return-void
.end method
