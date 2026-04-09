.class public abstract LG9/m;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Ls9/b;IILT/l;I)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, LG9/m;->c(Ls9/b;IILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Ls9/b;LT/l;II)V
    .locals 20

    move/from16 v0, p2

    move/from16 v1, p3

    const v2, 0x522f2aee

    move-object/from16 v3, p1

    invoke-interface {v3, v2}, LT/l;->r(I)LT/l;

    move-result-object v10

    and-int/lit8 v3, v1, 0x1

    const/4 v4, 0x2

    const/4 v5, 0x4

    if-eqz v3, :cond_0

    or-int/lit8 v6, v0, 0x6

    move v7, v6

    move-object/from16 v6, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v6, v0, 0x6

    if-nez v6, :cond_2

    move-object/from16 v6, p0

    invoke-interface {v10, v6}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1

    move v7, v5

    goto :goto_0

    :cond_1
    move v7, v4

    :goto_0
    or-int/2addr v7, v0

    goto :goto_1

    :cond_2
    move-object/from16 v6, p0

    move v7, v0

    :goto_1
    and-int/lit8 v8, v7, 0x3

    if-ne v8, v4, :cond_4

    invoke-interface {v10}, LT/l;->v()Z

    move-result v4

    if-nez v4, :cond_3

    goto :goto_2

    :cond_3
    invoke-interface {v10}, LT/l;->C()V

    goto/16 :goto_4

    :cond_4
    :goto_2
    if-eqz v3, :cond_5

    sget-object v3, LF9/Y;->a:LF9/Y;

    invoke-virtual {v3}, LF9/Y;->a()Ls9/b;

    move-result-object v3

    move-object v11, v3

    goto :goto_3

    :cond_5
    move-object v11, v6

    :goto_3
    invoke-static {}, LT/o;->H()Z

    move-result v3

    if-eqz v3, :cond_6

    const/4 v3, -0x1

    const-string/jumbo v4, "com.ui.core.ui.component.settings.widget.UiSettingsWidgetTrailingIcon (UiSettingsWidgetTrailingIcon.kt:14)"

    invoke-static {v2, v7, v3, v4}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_6
    sget-object v2, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/16 v3, 0x18

    int-to-float v3, v3

    invoke-static {v3}, LY0/h;->j(F)F

    move-result v3

    invoke-static {v2, v3}, Landroidx/compose/foundation/layout/r;->i(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v12

    const/4 v2, 0x7

    int-to-float v2, v2

    invoke-static {v2}, LY0/h;->j(F)F

    move-result v13

    int-to-float v2, v5

    invoke-static {v2}, LY0/h;->j(F)F

    move-result v14

    invoke-static {v2}, LY0/h;->j(F)F

    move-result v16

    const/16 v17, 0x4

    const/16 v18, 0x0

    const/4 v15, 0x0

    invoke-static/range {v12 .. v18}, Landroidx/compose/foundation/layout/o;->m(Landroidx/compose/ui/e;FFFFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v4

    sget-object v2, Lla/a;->a:Lla/a;

    sget v3, Lla/a;->b:I

    invoke-virtual {v2, v10, v3}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v2

    invoke-virtual {v2}, Lma/a;->c()Lma/a$c;

    move-result-object v2

    invoke-virtual {v2}, Lma/a$c;->a()J

    move-result-wide v12

    invoke-static {}, LN/s;->a()LT/H0;

    move-result-object v2

    invoke-interface {v10, v2}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    move-result v14

    const/16 v18, 0xe

    const/16 v19, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-static/range {v12 .. v19}, Lm0/v0;->k(JFFFFILjava/lang/Object;)J

    move-result-wide v2

    invoke-static {v2, v3}, Lm0/v0;->g(J)Lm0/v0;

    move-result-object v5

    and-int/lit8 v2, v7, 0xe

    or-int/lit8 v8, v2, 0x30

    const/4 v9, 0x4

    const/4 v6, 0x0

    move-object v3, v11

    move-object v7, v10

    invoke-static/range {v3 .. v9}, Lta/c;->c(Ls9/b;Landroidx/compose/ui/e;Lm0/v0;Ljava/lang/String;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_7

    invoke-static {}, LT/o;->P()V

    :cond_7
    move-object v6, v11

    :goto_4
    invoke-interface {v10}, LT/l;->z()LT/X0;

    move-result-object v2

    if-eqz v2, :cond_8

    new-instance v3, LG9/l;

    invoke-direct {v3, v6, v0, v1}, LG9/l;-><init>(Ls9/b;II)V

    invoke-interface {v2, v3}, LT/X0;->a(Lmh/p;)V

    :cond_8
    return-void
.end method

.method private static final c(Ls9/b;IILT/l;I)LYg/J;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, LT/L0;->a(I)I

    move-result p1

    invoke-static {p0, p3, p1, p2}, LG9/m;->b(Ls9/b;LT/l;II)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method
