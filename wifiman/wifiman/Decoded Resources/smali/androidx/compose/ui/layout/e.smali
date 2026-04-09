.class public final Landroidx/compose/ui/layout/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/layout/m;
.implements LC0/o;


# instance fields
.field private final a:LY0/t;

.field private final synthetic b:LC0/o;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LC0/o;LY0/t;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Landroidx/compose/ui/layout/e;->a:LY0/t;

    iput-object p1, p0, Landroidx/compose/ui/layout/e;->b:LC0/o;

    return-void
.end method


# virtual methods
.method public F0(F)J
    .locals 2

    iget-object v0, p0, Landroidx/compose/ui/layout/e;->b:LC0/o;

    invoke-interface {v0, p1}, LY0/d;->F0(F)J

    move-result-wide v0

    return-wide v0
.end method

.method public K1(J)J
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/layout/e;->b:LC0/o;

    invoke-interface {v0, p1, p2}, LY0/d;->K1(J)J

    move-result-wide p1

    return-wide p1
.end method

.method public N0(F)F
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/layout/e;->b:LC0/o;

    invoke-interface {v0, p1}, LY0/d;->N0(F)F

    move-result p1

    return p1
.end method

.method public N1(J)F
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/layout/e;->b:LC0/o;

    invoke-interface {v0, p1, p2}, LY0/d;->N1(J)F

    move-result p1

    return p1
.end method

.method public a1()Z
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/layout/e;->b:LC0/o;

    invoke-interface {v0}, LC0/o;->a1()Z

    move-result v0

    return v0
.end method

.method public d1(F)F
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/layout/e;->b:LC0/o;

    invoke-interface {v0, p1}, LY0/d;->d1(F)F

    move-result p1

    return p1
.end method

.method public e0(F)J
    .locals 2

    iget-object v0, p0, Landroidx/compose/ui/layout/e;->b:LC0/o;

    invoke-interface {v0, p1}, LY0/l;->e0(F)J

    move-result-wide v0

    return-wide v0
.end method

.method public f0(J)J
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/layout/e;->b:LC0/o;

    invoke-interface {v0, p1, p2}, LY0/d;->f0(J)J

    move-result-wide p1

    return-wide p1
.end method

.method public getDensity()F
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/layout/e;->b:LC0/o;

    invoke-interface {v0}, LY0/d;->getDensity()F

    move-result v0

    return v0
.end method

.method public getLayoutDirection()LY0/t;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/layout/e;->a:LY0/t;

    return-object v0
.end method

.method public i1(IILjava/util/Map;Lmh/l;Lmh/l;)LC0/D;
    .locals 2

    const/4 p5, 0x0

    invoke-static {p1, p5}, Lsh/m;->d(II)I

    move-result p1

    invoke-static {p2, p5}, Lsh/m;->d(II)I

    move-result p2

    const/high16 v0, -0x1000000

    and-int v1, p1, v0

    if-nez v1, :cond_0

    and-int/2addr v0, p2

    if-nez v0, :cond_0

    const/4 p5, 0x1

    :cond_0
    if-nez p5, :cond_1

    new-instance p5, Ljava/lang/StringBuilder;

    invoke-direct {p5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Size("

    invoke-virtual {p5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p5, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " x "

    invoke-virtual {p5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p5, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ") is out of range. Each dimension must be between 0 and 16777215."

    invoke-virtual {p5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p5

    invoke-static {p5}, LB0/a;->b(Ljava/lang/String;)V

    :cond_1
    new-instance p5, Landroidx/compose/ui/layout/e$a;

    invoke-direct {p5, p1, p2, p3, p4}, Landroidx/compose/ui/layout/e$a;-><init>(IILjava/util/Map;Lmh/l;)V

    return-object p5
.end method

.method public n0(J)F
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/layout/e;->b:LC0/o;

    invoke-interface {v0, p1, p2}, LY0/l;->n0(J)F

    move-result p1

    return p1
.end method

.method public x(I)F
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/layout/e;->b:LC0/o;

    invoke-interface {v0, p1}, LY0/d;->x(I)F

    move-result p1

    return p1
.end method

.method public x1(F)I
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/layout/e;->b:LC0/o;

    invoke-interface {v0, p1}, LY0/d;->x1(F)I

    move-result p1

    return p1
.end method

.method public y()F
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/layout/e;->b:LC0/o;

    invoke-interface {v0}, LY0/l;->y()F

    move-result v0

    return v0
.end method
