.class public final Landroidx/compose/ui/layout/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LC0/d;
.implements Landroidx/compose/ui/layout/m;
.implements Landroidx/compose/ui/layout/j;


# instance fields
.field private final a:LE0/C;

.field private b:Landroidx/compose/ui/layout/b;

.field private c:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LE0/C;Landroidx/compose/ui/layout/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/compose/ui/layout/d;->a:LE0/C;

    iput-object p2, p0, Landroidx/compose/ui/layout/d;->b:Landroidx/compose/ui/layout/b;

    return-void
.end method


# virtual methods
.method public F0(F)J
    .locals 2

    iget-object v0, p0, Landroidx/compose/ui/layout/d;->a:LE0/C;

    invoke-interface {v0, p1}, LY0/d;->F0(F)J

    move-result-wide v0

    return-wide v0
.end method

.method public K1(J)J
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/layout/d;->a:LE0/C;

    invoke-interface {v0, p1, p2}, LY0/d;->K1(J)J

    move-result-wide p1

    return-wide p1
.end method

.method public N()J
    .locals 2

    iget-object v0, p0, Landroidx/compose/ui/layout/d;->a:LE0/C;

    invoke-virtual {v0}, LE0/C;->C2()LE0/Q;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {v0}, LE0/Q;->h1()LC0/D;

    move-result-object v0

    invoke-interface {v0}, LC0/D;->getWidth()I

    move-result v1

    invoke-interface {v0}, LC0/D;->getHeight()I

    move-result v0

    invoke-static {v1, v0}, LY0/s;->a(II)J

    move-result-wide v0

    return-wide v0
.end method

.method public N0(F)F
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/layout/d;->a:LE0/C;

    invoke-interface {v0, p1}, LY0/d;->N0(F)F

    move-result p1

    return p1
.end method

.method public N1(J)F
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/layout/d;->a:LE0/C;

    invoke-interface {v0, p1, p2}, LY0/d;->N1(J)F

    move-result p1

    return p1
.end method

.method public a1()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final b()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/compose/ui/layout/d;->c:Z

    return v0
.end method

.method public d1(F)F
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/layout/d;->a:LE0/C;

    invoke-interface {v0, p1}, LY0/d;->d1(F)F

    move-result p1

    return p1
.end method

.method public e0(F)J
    .locals 2

    iget-object v0, p0, Landroidx/compose/ui/layout/d;->a:LE0/C;

    invoke-interface {v0, p1}, LY0/l;->e0(F)J

    move-result-wide v0

    return-wide v0
.end method

.method public f0(J)J
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/layout/d;->a:LE0/C;

    invoke-interface {v0, p1, p2}, LY0/d;->f0(J)J

    move-result-wide p1

    return-wide p1
.end method

.method public getDensity()F
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/layout/d;->a:LE0/C;

    invoke-virtual {v0}, LE0/c0;->getDensity()F

    move-result v0

    return v0
.end method

.method public getLayoutDirection()LY0/t;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/layout/d;->a:LE0/C;

    invoke-virtual {v0}, LE0/c0;->getLayoutDirection()LY0/t;

    move-result-object v0

    return-object v0
.end method

.method public i1(IILjava/util/Map;Lmh/l;Lmh/l;)LC0/D;
    .locals 8

    const/high16 v0, -0x1000000

    and-int v1, p1, v0

    if-nez v1, :cond_0

    and-int/2addr v0, p2

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Size("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " x "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ") is out of range. Each dimension must be between 0 and 16777215."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LB0/a;->b(Ljava/lang/String;)V

    :cond_1
    new-instance v0, Landroidx/compose/ui/layout/d$a;

    move-object v1, v0

    move v2, p1

    move v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p0

    invoke-direct/range {v1 .. v7}, Landroidx/compose/ui/layout/d$a;-><init>(IILjava/util/Map;Lmh/l;Lmh/l;Landroidx/compose/ui/layout/d;)V

    return-object v0
.end method

.method public n0(J)F
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/layout/d;->a:LE0/C;

    invoke-interface {v0, p1, p2}, LY0/l;->n0(J)F

    move-result p1

    return p1
.end method

.method public final p()Landroidx/compose/ui/layout/b;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/layout/d;->b:Landroidx/compose/ui/layout/b;

    return-object v0
.end method

.method public final q()LE0/C;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/layout/d;->a:LE0/C;

    return-object v0
.end method

.method public final r(Z)V
    .locals 0

    iput-boolean p1, p0, Landroidx/compose/ui/layout/d;->c:Z

    return-void
.end method

.method public final s(Landroidx/compose/ui/layout/b;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/layout/d;->b:Landroidx/compose/ui/layout/b;

    return-void
.end method

.method public v1(IILjava/util/Map;Lmh/l;)LC0/D;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/layout/d;->a:LE0/C;

    invoke-interface {v0, p1, p2, p3, p4}, Landroidx/compose/ui/layout/m;->v1(IILjava/util/Map;Lmh/l;)LC0/D;

    move-result-object p1

    return-object p1
.end method

.method public x(I)F
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/layout/d;->a:LE0/C;

    invoke-interface {v0, p1}, LY0/d;->x(I)F

    move-result p1

    return p1
.end method

.method public x1(F)I
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/layout/d;->a:LE0/C;

    invoke-interface {v0, p1}, LY0/d;->x1(F)I

    move-result p1

    return p1
.end method

.method public y()F
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/layout/d;->a:LE0/C;

    invoke-virtual {v0}, LE0/c0;->y()F

    move-result v0

    return v0
.end method
