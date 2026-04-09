.class public final LB/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LB/x;
.implements Landroidx/compose/ui/layout/m;


# instance fields
.field private final a:LB/r;

.field private final b:LC0/U;

.field private final c:LB/t;

.field private final d:Ljava/util/HashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LB/r;LC0/U;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LB/y;->a:LB/r;

    iput-object p2, p0, LB/y;->b:LC0/U;

    invoke-virtual {p1}, LB/r;->d()Lmh/a;

    move-result-object p1

    invoke-interface {p1}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LB/t;

    iput-object p1, p0, LB/y;->c:LB/t;

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, LB/y;->d:Ljava/util/HashMap;

    return-void
.end method


# virtual methods
.method public F0(F)J
    .locals 2

    iget-object v0, p0, LB/y;->b:LC0/U;

    invoke-interface {v0, p1}, LY0/d;->F0(F)J

    move-result-wide v0

    return-wide v0
.end method

.method public K1(J)J
    .locals 1

    iget-object v0, p0, LB/y;->b:LC0/U;

    invoke-interface {v0, p1, p2}, LY0/d;->K1(J)J

    move-result-wide p1

    return-wide p1
.end method

.method public M0(IJ)Ljava/util/List;
    .locals 5

    iget-object v0, p0, LB/y;->d:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    iget-object v0, p0, LB/y;->c:LB/t;

    invoke-interface {v0, p1}, LB/t;->b(I)Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, LB/y;->c:LB/t;

    invoke-interface {v1, p1}, LB/t;->d(I)Ljava/lang/Object;

    move-result-object v1

    iget-object v2, p0, LB/y;->a:LB/r;

    invoke-virtual {v2, p1, v0, v1}, LB/r;->b(ILjava/lang/Object;Ljava/lang/Object;)Lmh/p;

    move-result-object v1

    iget-object v2, p0, LB/y;->b:LC0/U;

    invoke-interface {v2, v0, v1}, LC0/U;->Q1(Ljava/lang/Object;Lmh/p;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, v1}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_1

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LC0/B;

    invoke-interface {v4, p2, p3}, LC0/B;->T(J)Landroidx/compose/ui/layout/t;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iget-object p2, p0, LB/y;->d:Ljava/util/HashMap;

    invoke-interface {p2, p1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object v0, v2

    :goto_1
    return-object v0
.end method

.method public N0(F)F
    .locals 1

    iget-object v0, p0, LB/y;->b:LC0/U;

    invoke-interface {v0, p1}, LY0/d;->N0(F)F

    move-result p1

    return p1
.end method

.method public N1(J)F
    .locals 1

    iget-object v0, p0, LB/y;->b:LC0/U;

    invoke-interface {v0, p1, p2}, LY0/d;->N1(J)F

    move-result p1

    return p1
.end method

.method public a1()Z
    .locals 1

    iget-object v0, p0, LB/y;->b:LC0/U;

    invoke-interface {v0}, LC0/o;->a1()Z

    move-result v0

    return v0
.end method

.method public d1(F)F
    .locals 1

    iget-object v0, p0, LB/y;->b:LC0/U;

    invoke-interface {v0, p1}, LY0/d;->d1(F)F

    move-result p1

    return p1
.end method

.method public e0(F)J
    .locals 2

    iget-object v0, p0, LB/y;->b:LC0/U;

    invoke-interface {v0, p1}, LY0/l;->e0(F)J

    move-result-wide v0

    return-wide v0
.end method

.method public f0(J)J
    .locals 1

    iget-object v0, p0, LB/y;->b:LC0/U;

    invoke-interface {v0, p1, p2}, LY0/d;->f0(J)J

    move-result-wide p1

    return-wide p1
.end method

.method public getDensity()F
    .locals 1

    iget-object v0, p0, LB/y;->b:LC0/U;

    invoke-interface {v0}, LY0/d;->getDensity()F

    move-result v0

    return v0
.end method

.method public getLayoutDirection()LY0/t;
    .locals 1

    iget-object v0, p0, LB/y;->b:LC0/U;

    invoke-interface {v0}, LC0/o;->getLayoutDirection()LY0/t;

    move-result-object v0

    return-object v0
.end method

.method public i1(IILjava/util/Map;Lmh/l;Lmh/l;)LC0/D;
    .locals 6

    iget-object v0, p0, LB/y;->b:LC0/U;

    move v1, p1

    move v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-interface/range {v0 .. v5}, Landroidx/compose/ui/layout/m;->i1(IILjava/util/Map;Lmh/l;Lmh/l;)LC0/D;

    move-result-object p1

    return-object p1
.end method

.method public n0(J)F
    .locals 1

    iget-object v0, p0, LB/y;->b:LC0/U;

    invoke-interface {v0, p1, p2}, LY0/l;->n0(J)F

    move-result p1

    return p1
.end method

.method public v1(IILjava/util/Map;Lmh/l;)LC0/D;
    .locals 1

    iget-object v0, p0, LB/y;->b:LC0/U;

    invoke-interface {v0, p1, p2, p3, p4}, Landroidx/compose/ui/layout/m;->v1(IILjava/util/Map;Lmh/l;)LC0/D;

    move-result-object p1

    return-object p1
.end method

.method public x(I)F
    .locals 1

    iget-object v0, p0, LB/y;->b:LC0/U;

    invoke-interface {v0, p1}, LY0/d;->x(I)F

    move-result p1

    return p1
.end method

.method public x1(F)I
    .locals 1

    iget-object v0, p0, LB/y;->b:LC0/U;

    invoke-interface {v0, p1}, LY0/d;->x1(F)I

    move-result p1

    return p1
.end method

.method public y()F
    .locals 1

    iget-object v0, p0, LB/y;->b:LC0/U;

    invoke-interface {v0}, LY0/l;->y()F

    move-result v0

    return v0
.end method
