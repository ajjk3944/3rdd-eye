.class final LD9/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/window/q;


# instance fields
.field private final a:Ll0/i;

.field private final b:LY0/d;

.field private final c:Lmh/p;


# direct methods
.method public constructor <init>(Ll0/i;LY0/d;Lmh/p;)V
    .locals 1

    const-string/jumbo v0, "anchor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "density"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "onSizeAndPositionChanged"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LD9/q;->a:Ll0/i;

    iput-object p2, p0, LD9/q;->b:LY0/d;

    iput-object p3, p0, LD9/q;->c:Lmh/p;

    return-void
.end method


# virtual methods
.method public a(LY0/p;JLY0/t;J)J
    .locals 4

    const-string/jumbo v0, "anchorBounds"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo p1, "layoutDirection"

    invoke-static {p4, p1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, LD9/q;->b:LY0/d;

    invoke-interface {p1}, LY0/d;->getDensity()F

    move-result p1

    const/16 p4, 0x10

    int-to-float p4, p4

    mul-float/2addr p1, p4

    iget-object p4, p0, LD9/q;->a:Ll0/i;

    invoke-virtual {p4}, Ll0/i;->e()F

    move-result p4

    add-float/2addr p4, p1

    invoke-static {p5, p6}, LY0/r;->f(J)I

    move-result v0

    int-to-float v0, v0

    add-float/2addr p4, v0

    invoke-static {p2, p3}, LY0/r;->f(J)I

    move-result v0

    int-to-float v0, v0

    cmpl-float p4, p4, v0

    if-lez p4, :cond_0

    iget-object p4, p0, LD9/q;->a:Ll0/i;

    invoke-virtual {p4}, Ll0/i;->n()F

    move-result p4

    sub-float/2addr p4, p1

    invoke-static {p5, p6}, LY0/r;->f(J)I

    move-result v0

    int-to-float v0, v0

    sub-float/2addr p4, v0

    goto :goto_0

    :cond_0
    iget-object p4, p0, LD9/q;->a:Ll0/i;

    invoke-virtual {p4}, Ll0/i;->e()F

    move-result p4

    add-float/2addr p4, p1

    :goto_0
    iget-object v0, p0, LD9/q;->a:Ll0/i;

    invoke-virtual {v0}, Ll0/i;->k()F

    move-result v0

    iget-object v1, p0, LD9/q;->a:Ll0/i;

    invoke-virtual {v1}, Ll0/i;->m()J

    move-result-wide v1

    invoke-static {v1, v2}, Ll0/m;->i(J)F

    move-result v1

    const/4 v2, 0x2

    int-to-float v3, v2

    div-float/2addr v1, v3

    add-float/2addr v0, v1

    invoke-static {p5, p6}, LY0/r;->g(J)I

    move-result v1

    div-int/2addr v1, v2

    int-to-float v1, v1

    sub-float/2addr v0, v1

    float-to-int v0, v0

    if-gez v0, :cond_2

    iget-object v0, p0, LD9/q;->a:Ll0/i;

    invoke-virtual {v0}, Ll0/i;->k()F

    move-result v0

    invoke-static {p5, p6}, LY0/r;->g(J)I

    move-result v1

    int-to-float v1, v1

    add-float/2addr v0, v1

    invoke-static {p2, p3}, LY0/r;->g(J)I

    move-result p2

    int-to-float p2, p2

    sub-float/2addr p2, p1

    cmpl-float p2, v0, p2

    if-lez p2, :cond_1

    iget-object p2, p0, LD9/q;->a:Ll0/i;

    invoke-virtual {p2}, Ll0/i;->k()F

    move-result p2

    float-to-int p2, p2

    float-to-int p1, p1

    sub-int v0, p2, p1

    goto :goto_1

    :cond_1
    iget-object p1, p0, LD9/q;->a:Ll0/i;

    invoke-virtual {p1}, Ll0/i;->k()F

    move-result p1

    float-to-int v0, p1

    goto :goto_1

    :cond_2
    invoke-static {p5, p6}, LY0/r;->g(J)I

    move-result p1

    add-int/2addr p1, v0

    invoke-static {p2, p3}, LY0/r;->g(J)I

    move-result p2

    if-le p1, p2, :cond_3

    iget-object p1, p0, LD9/q;->a:Ll0/i;

    invoke-virtual {p1}, Ll0/i;->l()F

    move-result p1

    float-to-int p1, p1

    invoke-static {p5, p6}, LY0/r;->g(J)I

    move-result p2

    sub-int v0, p1, p2

    :cond_3
    :goto_1
    float-to-int p1, p4

    invoke-static {v0, p1}, LY0/o;->a(II)J

    move-result-wide p1

    iget-object p3, p0, LD9/q;->c:Lmh/p;

    invoke-static {p1, p2}, LY0/n;->b(J)LY0/n;

    move-result-object p4

    invoke-static {p5, p6}, LY0/r;->b(J)LY0/r;

    move-result-object p5

    invoke-interface {p3, p4, p5}, Lmh/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-wide p1
.end method
