.class final LC/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx0/a;


# instance fields
.field private final a:LC/C;

.field private final b:Lw/q;


# direct methods
.method public constructor <init>(LC/C;Lw/q;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LC/a;->a:LC/C;

    iput-object p2, p0, LC/a;->b:Lw/q;

    return-void
.end method

.method private final b(J)F
    .locals 2

    iget-object v0, p0, LC/a;->b:Lw/q;

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


# virtual methods
.method public L1(JJI)J
    .locals 0

    sget-object p1, Lx0/e;->a:Lx0/e$a;

    invoke-virtual {p1}, Lx0/e$a;->a()I

    move-result p1

    invoke-static {p5, p1}, Lx0/e;->d(II)Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-direct {p0, p3, p4}, LC/a;->b(J)F

    move-result p1

    const/4 p2, 0x0

    cmpg-float p1, p1, p2

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/util/concurrent/CancellationException;

    const-string p2, "Scroll cancelled"

    invoke-direct {p1, p2}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    sget-object p1, Ll0/g;->b:Ll0/g$a;

    invoke-virtual {p1}, Ll0/g$a;->c()J

    move-result-wide p1

    return-wide p1
.end method

.method public V0(JI)J
    .locals 5

    sget-object v0, Lx0/e;->a:Lx0/e$a;

    invoke-virtual {v0}, Lx0/e$a;->b()I

    move-result v0

    invoke-static {p3, v0}, Lx0/e;->d(II)Z

    move-result p3

    if-eqz p3, :cond_4

    iget-object p3, p0, LC/a;->a:LC/C;

    invoke-virtual {p3}, LC/C;->w()F

    move-result p3

    invoke-static {p3}, Ljava/lang/Math;->abs(F)F

    move-result p3

    float-to-double v0, p3

    const-wide v2, 0x3eb0c6f7a0b5ed8dL    # 1.0E-6

    cmpl-double p3, v0, v2

    if-lez p3, :cond_4

    iget-object p3, p0, LC/a;->a:LC/C;

    invoke-virtual {p3}, LC/C;->w()F

    move-result p3

    iget-object v0, p0, LC/a;->a:LC/C;

    invoke-virtual {v0}, LC/C;->G()I

    move-result v0

    int-to-float v0, v0

    mul-float/2addr p3, v0

    iget-object v0, p0, LC/a;->a:LC/C;

    invoke-virtual {v0}, LC/C;->C()LC/n;

    move-result-object v0

    invoke-interface {v0}, LC/n;->i()I

    move-result v0

    iget-object v1, p0, LC/a;->a:LC/C;

    invoke-virtual {v1}, LC/C;->C()LC/n;

    move-result-object v1

    invoke-interface {v1}, LC/n;->j()I

    move-result v1

    add-int/2addr v0, v1

    int-to-float v0, v0

    iget-object v1, p0, LC/a;->a:LC/C;

    invoke-virtual {v1}, LC/C;->w()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Math;->signum(F)F

    move-result v1

    neg-float v1, v1

    mul-float/2addr v0, v1

    add-float/2addr v0, p3

    iget-object v1, p0, LC/a;->a:LC/C;

    invoke-virtual {v1}, LC/C;->w()F

    move-result v1

    const/4 v2, 0x0

    cmpl-float v1, v1, v2

    if-lez v1, :cond_0

    move v4, v0

    move v0, p3

    move p3, v4

    :cond_0
    iget-object v1, p0, LC/a;->b:Lw/q;

    sget-object v2, Lw/q;->Horizontal:Lw/q;

    if-ne v1, v2, :cond_1

    invoke-static {p1, p2}, Ll0/g;->m(J)F

    move-result v1

    goto :goto_0

    :cond_1
    invoke-static {p1, p2}, Ll0/g;->n(J)F

    move-result v1

    :goto_0
    invoke-static {v1, p3, v0}, Lsh/m;->j(FFF)F

    move-result p3

    iget-object v0, p0, LC/a;->a:LC/C;

    neg-float p3, p3

    invoke-virtual {v0, p3}, LC/C;->f(F)F

    move-result p3

    neg-float p3, p3

    iget-object v0, p0, LC/a;->b:Lw/q;

    if-ne v0, v2, :cond_2

    move v0, p3

    goto :goto_1

    :cond_2
    invoke-static {p1, p2}, Ll0/g;->m(J)F

    move-result v0

    :goto_1
    iget-object v1, p0, LC/a;->b:Lw/q;

    sget-object v2, Lw/q;->Vertical:Lw/q;

    if-ne v1, v2, :cond_3

    goto :goto_2

    :cond_3
    invoke-static {p1, p2}, Ll0/g;->n(J)F

    move-result p3

    :goto_2
    invoke-static {p1, p2, v0, p3}, Ll0/g;->f(JFF)J

    move-result-wide p1

    goto :goto_3

    :cond_4
    sget-object p1, Ll0/g;->b:Ll0/g$a;

    invoke-virtual {p1}, Ll0/g$a;->c()J

    move-result-wide p1

    :goto_3
    return-wide p1
.end method

.method public final a(JLw/q;)J
    .locals 7

    sget-object v0, Lw/q;->Vertical:Lw/q;

    if-ne p3, v0, :cond_0

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-wide v1, p1

    invoke-static/range {v1 .. v6}, LY0/y;->e(JFFILjava/lang/Object;)J

    move-result-wide p1

    goto :goto_0

    :cond_0
    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-wide v0, p1

    invoke-static/range {v0 .. v5}, LY0/y;->e(JFFILjava/lang/Object;)J

    move-result-wide p1

    :goto_0
    return-wide p1
.end method

.method public g1(JJLdh/e;)Ljava/lang/Object;
    .locals 0

    iget-object p1, p0, LC/a;->b:Lw/q;

    invoke-virtual {p0, p3, p4, p1}, LC/a;->a(JLw/q;)J

    move-result-wide p1

    invoke-static {p1, p2}, LY0/y;->b(J)LY0/y;

    move-result-object p1

    return-object p1
.end method
