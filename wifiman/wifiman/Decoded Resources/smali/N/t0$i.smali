.class final LN/t0$i;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN/t0;->x(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:F


# direct methods
.method constructor <init>(F)V
    .locals 0

    iput p1, p0, LN/t0$i;->a:F

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/ui/layout/m;LC0/B;J)LC0/D;
    .locals 9

    iget v0, p0, LN/t0$i;->a:F

    invoke-interface {p1, v0}, LY0/d;->x1(F)I

    move-result v0

    mul-int/lit8 v1, v0, 0x2

    const/4 v2, 0x0

    invoke-static {p3, p4, v2, v1}, LY0/c;->n(JII)J

    move-result-wide p3

    invoke-interface {p2, p3, p4}, LC0/B;->T(J)Landroidx/compose/ui/layout/t;

    move-result-object p2

    invoke-virtual {p2}, Landroidx/compose/ui/layout/t;->C0()I

    move-result p3

    sub-int v4, p3, v1

    invoke-virtual {p2}, Landroidx/compose/ui/layout/t;->I0()I

    move-result v3

    new-instance v6, LN/t0$i$a;

    invoke-direct {v6, p2, v0}, LN/t0$i$a;-><init>(Landroidx/compose/ui/layout/t;I)V

    const/4 v7, 0x4

    const/4 v8, 0x0

    const/4 v5, 0x0

    move-object v2, p1

    invoke-static/range {v2 .. v8}, Landroidx/compose/ui/layout/m;->x0(Landroidx/compose/ui/layout/m;IILjava/util/Map;Lmh/l;ILjava/lang/Object;)LC0/D;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Landroidx/compose/ui/layout/m;

    check-cast p2, LC0/B;

    check-cast p3, LY0/b;

    invoke-virtual {p3}, LY0/b;->r()J

    move-result-wide v0

    invoke-virtual {p0, p1, p2, v0, v1}, LN/t0$i;->a(Landroidx/compose/ui/layout/m;LC0/B;J)LC0/D;

    move-result-object p1

    return-object p1
.end method
