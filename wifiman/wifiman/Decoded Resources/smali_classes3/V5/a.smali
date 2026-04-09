.class public abstract LV5/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(ZFLandroid/graphics/RectF;LT/l;I)Lu6/f;
    .locals 8

    const-string/jumbo v0, "canvasBounds"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x24d9e9f3

    invoke-interface {p3, v0}, LT/l;->e(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string/jumbo v2, "com.patrykandpatrick.vico.compose.layout.getMeasureContext (MeasureContextExtensions.kt:35)"

    invoke-static {v0, p4, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    const p4, -0x1d58f75c

    invoke-interface {p3, p4}, LT/l;->e(I)V

    invoke-interface {p3}, LT/l;->f()Ljava/lang/Object;

    move-result-object p4

    sget-object v0, LT/l;->a:LT/l$a;

    invoke-virtual {v0}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne p4, v0, :cond_1

    new-instance p4, Lu6/f;

    const/4 v4, 0x0

    const/4 v5, 0x1

    const/4 v3, 0x0

    move-object v1, p4

    move-object v2, p2

    move v6, p0

    move v7, p1

    invoke-direct/range {v1 .. v7}, Lu6/f;-><init>(Landroid/graphics/RectF;FFZZF)V

    invoke-interface {p3, p4}, LT/l;->K(Ljava/lang/Object;)V

    :cond_1
    invoke-interface {p3}, LT/l;->P()V

    check-cast p4, Lu6/f;

    invoke-static {}, Landroidx/compose/ui/platform/k0;->g()LT/H0;

    move-result-object p2

    invoke-interface {p3, p2}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, LY0/d;

    invoke-interface {p2}, LY0/d;->getDensity()F

    move-result p2

    invoke-virtual {p4, p2}, Lu6/f;->v(F)V

    invoke-static {}, Landroidx/compose/ui/platform/k0;->g()LT/H0;

    move-result-object p2

    invoke-interface {p3, p2}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, LY0/d;

    invoke-interface {p2}, LY0/l;->y()F

    move-result p2

    invoke-static {}, Landroidx/compose/ui/platform/k0;->g()LT/H0;

    move-result-object v0

    invoke-interface {p3, v0}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LY0/d;

    invoke-interface {v0}, LY0/d;->getDensity()F

    move-result v0

    mul-float/2addr p2, v0

    invoke-virtual {p4, p2}, Lu6/f;->w(F)V

    invoke-static {}, Landroidx/compose/ui/platform/k0;->m()LT/H0;

    move-result-object p2

    invoke-interface {p3, p2}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object p2

    sget-object v0, LY0/t;->Ltr:LY0/t;

    if-ne p2, v0, :cond_2

    const/4 p2, 0x1

    goto :goto_0

    :cond_2
    const/4 p2, 0x0

    :goto_0
    invoke-virtual {p4, p2}, Lu6/f;->z(Z)V

    invoke-virtual {p4, p0}, Lu6/f;->x(Z)V

    invoke-virtual {p4, p1}, Lu6/f;->u(F)V

    invoke-static {}, LT/o;->H()Z

    move-result p0

    if-eqz p0, :cond_3

    invoke-static {}, LT/o;->P()V

    :cond_3
    invoke-interface {p3}, LT/l;->P()V

    return-object p4
.end method
