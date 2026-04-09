.class public abstract LG9/c;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Lz/Y;ZLmh/a;ILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p5}, LG9/c;->d(Lz/Y;ZLmh/a;ILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Lz/Y;ZLmh/a;LT/l;I)V
    .locals 21

    move-object/from16 v10, p0

    move/from16 v11, p1

    move-object/from16 v12, p2

    move/from16 v13, p4

    const-string v0, "<this>"

    invoke-static {v10, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "onClick"

    invoke-static {v12, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x6923d278

    move-object/from16 v1, p3

    invoke-interface {v1, v0}, LT/l;->r(I)LT/l;

    move-result-object v14

    and-int/lit8 v1, v13, 0x6

    if-nez v1, :cond_1

    invoke-interface {v14, v10}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, v13

    goto :goto_1

    :cond_1
    move v1, v13

    :goto_1
    and-int/lit8 v2, v13, 0x30

    if-nez v2, :cond_3

    invoke-interface {v14, v11}, LT/l;->c(Z)Z

    move-result v2

    if-eqz v2, :cond_2

    const/16 v2, 0x20

    goto :goto_2

    :cond_2
    const/16 v2, 0x10

    :goto_2
    or-int/2addr v1, v2

    :cond_3
    and-int/lit16 v2, v13, 0x180

    if-nez v2, :cond_5

    invoke-interface {v14, v12}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    const/16 v2, 0x100

    goto :goto_3

    :cond_4
    const/16 v2, 0x80

    :goto_3
    or-int/2addr v1, v2

    :cond_5
    move v9, v1

    and-int/lit16 v1, v9, 0x93

    const/16 v2, 0x92

    if-ne v1, v2, :cond_7

    invoke-interface {v14}, LT/l;->v()Z

    move-result v1

    if-nez v1, :cond_6

    goto :goto_4

    :cond_6
    invoke-interface {v14}, LT/l;->C()V

    goto/16 :goto_6

    :cond_7
    :goto_4
    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_8

    const/4 v1, -0x1

    const-string/jumbo v2, "com.ui.core.ui.component.settings.widget.UiSettingsWidgetClearTextAction (UiSettingsWidgetClearTextAction.kt:27)"

    invoke-static {v0, v9, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_8
    const/high16 v0, 0x43c80000    # 400.0f

    const/4 v1, 0x5

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v2, v0, v3, v1, v3}, Lr/j;->j(FFLjava/lang/Object;ILjava/lang/Object;)Lr/h0;

    move-result-object v0

    if-eqz v11, :cond_9

    const/high16 v1, 0x3f800000    # 1.0f

    goto :goto_5

    :cond_9
    move v1, v2

    :goto_5
    const/16 v7, 0xc30

    const/16 v8, 0x14

    const/4 v3, 0x0

    const-string/jumbo v4, "clear_text_icon_alpha"

    const/4 v5, 0x0

    move-object v2, v0

    move-object v6, v14

    invoke-static/range {v1 .. v8}, Lr/c;->d(FLr/i;FLjava/lang/String;Lmh/l;LT/l;II)LT/z1;

    move-result-object v0

    const/16 v5, 0xb

    const/4 v6, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Landroidx/compose/animation/g;->i(Lr/H;Lf0/c$b;ZLmh/l;ILjava/lang/Object;)Landroidx/compose/animation/i;

    move-result-object v3

    const/16 v19, 0xb

    const/16 v20, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    invoke-static/range {v15 .. v20}, Landroidx/compose/animation/g;->u(Lr/H;Lf0/c$b;ZLmh/l;ILjava/lang/Object;)Landroidx/compose/animation/k;

    move-result-object v4

    new-instance v1, LG9/c$a;

    invoke-direct {v1, v10, v12, v0}, LG9/c$a;-><init>(Lz/Y;Lmh/a;LT/z1;)V

    const/16 v0, 0x36

    const v2, -0x18d8ea50

    const/4 v5, 0x1

    invoke-static {v2, v5, v1, v14, v0}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v6

    and-int/lit8 v0, v9, 0xe

    const v1, 0x186c00

    or-int/2addr v0, v1

    and-int/lit8 v1, v9, 0x70

    or-int v8, v0, v1

    const/16 v9, 0x12

    const/4 v2, 0x0

    const/4 v5, 0x0

    move-object/from16 v0, p0

    move/from16 v1, p1

    move-object v7, v14

    invoke-static/range {v0 .. v9}, Lq/d;->e(Lz/Y;ZLandroidx/compose/ui/e;Landroidx/compose/animation/i;Landroidx/compose/animation/k;Ljava/lang/String;Lmh/q;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-static {}, LT/o;->P()V

    :cond_a
    :goto_6
    invoke-interface {v14}, LT/l;->z()LT/X0;

    move-result-object v0

    if-eqz v0, :cond_b

    new-instance v1, LG9/b;

    invoke-direct {v1, v10, v11, v12, v13}, LG9/b;-><init>(Lz/Y;ZLmh/a;I)V

    invoke-interface {v0, v1}, LT/X0;->a(Lmh/p;)V

    :cond_b
    return-void
.end method

.method private static final c(LT/z1;)F
    .locals 0

    invoke-interface {p0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    move-result p0

    return p0
.end method

.method private static final d(Lz/Y;ZLmh/a;ILT/l;I)LYg/J;
    .locals 0

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, LT/L0;->a(I)I

    move-result p3

    invoke-static {p0, p1, p2, p4, p3}, LG9/c;->b(Lz/Y;ZLmh/a;LT/l;I)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method public static final synthetic e(LT/z1;)F
    .locals 0

    invoke-static {p0}, LG9/c;->c(LT/z1;)F

    move-result p0

    return p0
.end method
