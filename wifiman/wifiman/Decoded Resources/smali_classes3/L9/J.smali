.class public abstract LL9/J;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Landroidx/compose/ui/e;ZIILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p5}, LL9/J;->c(Landroidx/compose/ui/e;ZIILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Landroidx/compose/ui/e;ZLT/l;II)V
    .locals 10

    const v0, 0x75635933

    invoke-interface {p2, v0}, LT/l;->r(I)LT/l;

    move-result-object p2

    and-int/lit8 v1, p4, 0x1

    if-eqz v1, :cond_0

    or-int/lit8 v2, p3, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v2, p3, 0x6

    if-nez v2, :cond_2

    invoke-interface {p2, p0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v2, 0x4

    goto :goto_0

    :cond_1
    const/4 v2, 0x2

    :goto_0
    or-int/2addr v2, p3

    goto :goto_1

    :cond_2
    move v2, p3

    :goto_1
    and-int/lit8 v3, p4, 0x2

    if-eqz v3, :cond_3

    or-int/lit8 v2, v2, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v3, p3, 0x30

    if-nez v3, :cond_5

    invoke-interface {p2, p1}, LT/l;->c(Z)Z

    move-result v3

    if-eqz v3, :cond_4

    const/16 v3, 0x20

    goto :goto_2

    :cond_4
    const/16 v3, 0x10

    :goto_2
    or-int/2addr v2, v3

    :cond_5
    :goto_3
    and-int/lit8 v3, v2, 0x13

    const/16 v4, 0x12

    if-ne v3, v4, :cond_7

    invoke-interface {p2}, LT/l;->v()Z

    move-result v3

    if-nez v3, :cond_6

    goto :goto_4

    :cond_6
    invoke-interface {p2}, LT/l;->C()V

    goto :goto_5

    :cond_7
    :goto_4
    if-eqz v1, :cond_8

    sget-object p0, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    :cond_8
    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_9

    const/4 v1, -0x1

    const-string/jumbo v3, "com.ui.core.ui.component.toolbar.UiToolbarProgressIndicator (UiToolbarProgressIndicator.kt:17)"

    invoke-static {v0, v2, v1, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_9
    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v3, 0x3

    invoke-static {v0, v1, v3, v0}, Landroidx/compose/animation/g;->o(Lr/H;FILjava/lang/Object;)Landroidx/compose/animation/i;

    move-result-object v4

    invoke-static {v0, v1, v3, v0}, Landroidx/compose/animation/g;->q(Lr/H;FILjava/lang/Object;)Landroidx/compose/animation/k;

    move-result-object v0

    new-instance v1, LL9/J$a;

    invoke-direct {v1, p0}, LL9/J$a;-><init>(Landroidx/compose/ui/e;)V

    const/16 v5, 0x36

    const v6, -0x4fb772a5

    const/4 v7, 0x1

    invoke-static {v6, v7, v1, p2, v5}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v6

    shr-int/lit8 v1, v2, 0x3

    and-int/lit8 v1, v1, 0xe

    const v2, 0x30d80

    or-int v8, v1, v2

    const/16 v9, 0x12

    const/4 v2, 0x0

    const/4 v5, 0x0

    move v1, p1

    move-object v3, v4

    move-object v4, v0

    move-object v7, p2

    invoke-static/range {v1 .. v9}, Lq/d;->f(ZLandroidx/compose/ui/e;Landroidx/compose/animation/i;Landroidx/compose/animation/k;Ljava/lang/String;Lmh/q;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-static {}, LT/o;->P()V

    :cond_a
    :goto_5
    invoke-interface {p2}, LT/l;->z()LT/X0;

    move-result-object p2

    if-eqz p2, :cond_b

    new-instance v0, LL9/I;

    invoke-direct {v0, p0, p1, p3, p4}, LL9/I;-><init>(Landroidx/compose/ui/e;ZII)V

    invoke-interface {p2, v0}, LT/X0;->a(Lmh/p;)V

    :cond_b
    return-void
.end method

.method private static final c(Landroidx/compose/ui/e;ZIILT/l;I)LYg/J;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LT/L0;->a(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, LL9/J;->b(Landroidx/compose/ui/e;ZLT/l;II)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method
