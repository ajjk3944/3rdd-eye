.class public abstract LG9/e;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Ljava/lang/String;Landroidx/compose/ui/e;IILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p5}, LG9/e;->c(Ljava/lang/String;Landroidx/compose/ui/e;IILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Ljava/lang/String;Landroidx/compose/ui/e;LT/l;II)V
    .locals 21

    move-object/from16 v0, p0

    move/from16 v1, p3

    move/from16 v2, p4

    const v3, -0x3bcd89e2

    move-object/from16 v4, p2

    invoke-interface {v4, v3}, LT/l;->r(I)LT/l;

    move-result-object v13

    and-int/lit8 v4, v2, 0x1

    if-eqz v4, :cond_0

    or-int/lit8 v4, v1, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v4, v1, 0x6

    if-nez v4, :cond_2

    invoke-interface {v13, v0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    const/4 v4, 0x4

    goto :goto_0

    :cond_1
    const/4 v4, 0x2

    :goto_0
    or-int/2addr v4, v1

    goto :goto_1

    :cond_2
    move v4, v1

    :goto_1
    and-int/lit8 v5, v2, 0x2

    if-eqz v5, :cond_4

    or-int/lit8 v4, v4, 0x30

    :cond_3
    move-object/from16 v6, p1

    goto :goto_3

    :cond_4
    and-int/lit8 v6, v1, 0x30

    if-nez v6, :cond_3

    move-object/from16 v6, p1

    invoke-interface {v13, v6}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_5

    const/16 v7, 0x20

    goto :goto_2

    :cond_5
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v4, v7

    :goto_3
    and-int/lit8 v7, v4, 0x13

    const/16 v8, 0x12

    if-ne v7, v8, :cond_7

    invoke-interface {v13}, LT/l;->v()Z

    move-result v7

    if-nez v7, :cond_6

    goto :goto_4

    :cond_6
    invoke-interface {v13}, LT/l;->C()V

    move-object v14, v6

    goto :goto_7

    :cond_7
    :goto_4
    if-eqz v5, :cond_8

    sget-object v5, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    move-object v14, v5

    goto :goto_5

    :cond_8
    move-object v14, v6

    :goto_5
    invoke-static {}, LT/o;->H()Z

    move-result v5

    if-eqz v5, :cond_9

    const/4 v5, -0x1

    const-string/jumbo v6, "com.ui.core.ui.component.settings.widget.UiSettingsWidgetError (UiSettingsWidgetError.kt:19)"

    invoke-static {v3, v4, v5, v6}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_9
    const/4 v3, 0x1

    if-eqz v0, :cond_a

    move v4, v3

    goto :goto_6

    :cond_a
    const/4 v4, 0x0

    :goto_6
    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x3

    invoke-static {v5, v6, v7, v5}, Landroidx/compose/animation/g;->o(Lr/H;FILjava/lang/Object;)Landroidx/compose/animation/i;

    move-result-object v8

    const/16 v19, 0xf

    const/16 v20, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    invoke-static/range {v15 .. v20}, Landroidx/compose/animation/g;->m(Lr/H;Lf0/c$c;ZLmh/l;ILjava/lang/Object;)Landroidx/compose/animation/i;

    move-result-object v9

    invoke-virtual {v8, v9}, Landroidx/compose/animation/i;->c(Landroidx/compose/animation/i;)Landroidx/compose/animation/i;

    move-result-object v8

    invoke-static/range {v15 .. v20}, Landroidx/compose/animation/g;->y(Lr/H;Lf0/c$c;ZLmh/l;ILjava/lang/Object;)Landroidx/compose/animation/k;

    move-result-object v9

    invoke-static {v5, v6, v7, v5}, Landroidx/compose/animation/g;->q(Lr/H;FILjava/lang/Object;)Landroidx/compose/animation/k;

    move-result-object v5

    invoke-virtual {v9, v5}, Landroidx/compose/animation/k;->c(Landroidx/compose/animation/k;)Landroidx/compose/animation/k;

    move-result-object v7

    new-instance v5, LG9/e$a;

    invoke-direct {v5, v0, v14}, LG9/e$a;-><init>(Ljava/lang/String;Landroidx/compose/ui/e;)V

    const/16 v6, 0x36

    const v9, 0x7c2df2f6

    invoke-static {v9, v3, v5, v13, v6}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v9

    const v11, 0x30d80

    const/16 v12, 0x12

    const/4 v5, 0x0

    const/4 v3, 0x0

    move-object v6, v8

    move-object v8, v3

    move-object v10, v13

    invoke-static/range {v4 .. v12}, Lq/d;->f(ZLandroidx/compose/ui/e;Landroidx/compose/animation/i;Landroidx/compose/animation/k;Ljava/lang/String;Lmh/q;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result v3

    if-eqz v3, :cond_b

    invoke-static {}, LT/o;->P()V

    :cond_b
    :goto_7
    invoke-interface {v13}, LT/l;->z()LT/X0;

    move-result-object v3

    if-eqz v3, :cond_c

    new-instance v4, LG9/d;

    invoke-direct {v4, v0, v14, v1, v2}, LG9/d;-><init>(Ljava/lang/String;Landroidx/compose/ui/e;II)V

    invoke-interface {v3, v4}, LT/X0;->a(Lmh/p;)V

    :cond_c
    return-void
.end method

.method private static final c(Ljava/lang/String;Landroidx/compose/ui/e;IILT/l;I)LYg/J;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LT/L0;->a(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, LG9/e;->b(Ljava/lang/String;Landroidx/compose/ui/e;LT/l;II)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method
