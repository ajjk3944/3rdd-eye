.class final Landroidx/compose/ui/layout/h$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LC0/U;
.implements Landroidx/compose/ui/layout/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/compose/ui/layout/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "b"
.end annotation


# instance fields
.field private final synthetic a:Landroidx/compose/ui/layout/h$c;

.field final synthetic b:Landroidx/compose/ui/layout/h;


# direct methods
.method public constructor <init>(Landroidx/compose/ui/layout/h;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/layout/h$b;->b:Landroidx/compose/ui/layout/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Landroidx/compose/ui/layout/h;->l(Landroidx/compose/ui/layout/h;)Landroidx/compose/ui/layout/h$c;

    move-result-object p1

    iput-object p1, p0, Landroidx/compose/ui/layout/h$b;->a:Landroidx/compose/ui/layout/h$c;

    return-void
.end method


# virtual methods
.method public F0(F)J
    .locals 2

    iget-object v0, p0, Landroidx/compose/ui/layout/h$b;->a:Landroidx/compose/ui/layout/h$c;

    invoke-interface {v0, p1}, LY0/d;->F0(F)J

    move-result-wide v0

    return-wide v0
.end method

.method public K1(J)J
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/layout/h$b;->a:Landroidx/compose/ui/layout/h$c;

    invoke-interface {v0, p1, p2}, LY0/d;->K1(J)J

    move-result-wide p1

    return-wide p1
.end method

.method public N0(F)F
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/layout/h$b;->a:Landroidx/compose/ui/layout/h$c;

    invoke-interface {v0, p1}, LY0/d;->N0(F)F

    move-result p1

    return p1
.end method

.method public N1(J)F
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/layout/h$b;->a:Landroidx/compose/ui/layout/h$c;

    invoke-interface {v0, p1, p2}, LY0/d;->N1(J)F

    move-result p1

    return p1
.end method

.method public Q1(Ljava/lang/Object;Lmh/p;)Ljava/util/List;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/layout/h$b;->b:Landroidx/compose/ui/layout/h;

    invoke-static {v0}, Landroidx/compose/ui/layout/h;->m(Landroidx/compose/ui/layout/h;)Ljava/util/HashMap;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LE0/G;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LE0/G;->G()Ljava/util/List;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    return-object v0

    :cond_1
    iget-object v0, p0, Landroidx/compose/ui/layout/h$b;->b:Landroidx/compose/ui/layout/h;

    invoke-static {v0, p1, p2}, Landroidx/compose/ui/layout/h;->o(Landroidx/compose/ui/layout/h;Ljava/lang/Object;Lmh/p;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public a1()Z
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/layout/h$b;->a:Landroidx/compose/ui/layout/h$c;

    invoke-virtual {v0}, Landroidx/compose/ui/layout/h$c;->a1()Z

    move-result v0

    return v0
.end method

.method public d1(F)F
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/layout/h$b;->a:Landroidx/compose/ui/layout/h$c;

    invoke-interface {v0, p1}, LY0/d;->d1(F)F

    move-result p1

    return p1
.end method

.method public e0(F)J
    .locals 2

    iget-object v0, p0, Landroidx/compose/ui/layout/h$b;->a:Landroidx/compose/ui/layout/h$c;

    invoke-interface {v0, p1}, LY0/l;->e0(F)J

    move-result-wide v0

    return-wide v0
.end method

.method public f0(J)J
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/layout/h$b;->a:Landroidx/compose/ui/layout/h$c;

    invoke-interface {v0, p1, p2}, LY0/d;->f0(J)J

    move-result-wide p1

    return-wide p1
.end method

.method public getDensity()F
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/layout/h$b;->a:Landroidx/compose/ui/layout/h$c;

    invoke-virtual {v0}, Landroidx/compose/ui/layout/h$c;->getDensity()F

    move-result v0

    return v0
.end method

.method public getLayoutDirection()LY0/t;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/layout/h$b;->a:Landroidx/compose/ui/layout/h$c;

    invoke-virtual {v0}, Landroidx/compose/ui/layout/h$c;->getLayoutDirection()LY0/t;

    move-result-object v0

    return-object v0
.end method

.method public i1(IILjava/util/Map;Lmh/l;Lmh/l;)LC0/D;
    .locals 6

    iget-object v0, p0, Landroidx/compose/ui/layout/h$b;->a:Landroidx/compose/ui/layout/h$c;

    move v1, p1

    move v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-virtual/range {v0 .. v5}, Landroidx/compose/ui/layout/h$c;->i1(IILjava/util/Map;Lmh/l;Lmh/l;)LC0/D;

    move-result-object p1

    return-object p1
.end method

.method public n0(J)F
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/layout/h$b;->a:Landroidx/compose/ui/layout/h$c;

    invoke-interface {v0, p1, p2}, LY0/l;->n0(J)F

    move-result p1

    return p1
.end method

.method public v1(IILjava/util/Map;Lmh/l;)LC0/D;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/layout/h$b;->a:Landroidx/compose/ui/layout/h$c;

    invoke-interface {v0, p1, p2, p3, p4}, Landroidx/compose/ui/layout/m;->v1(IILjava/util/Map;Lmh/l;)LC0/D;

    move-result-object p1

    return-object p1
.end method

.method public x(I)F
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/layout/h$b;->a:Landroidx/compose/ui/layout/h$c;

    invoke-interface {v0, p1}, LY0/d;->x(I)F

    move-result p1

    return p1
.end method

.method public x1(F)I
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/layout/h$b;->a:Landroidx/compose/ui/layout/h$c;

    invoke-interface {v0, p1}, LY0/d;->x1(F)I

    move-result p1

    return p1
.end method

.method public y()F
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/layout/h$b;->a:Landroidx/compose/ui/layout/h$c;

    invoke-virtual {v0}, Landroidx/compose/ui/layout/h$c;->y()F

    move-result v0

    return v0
.end method
