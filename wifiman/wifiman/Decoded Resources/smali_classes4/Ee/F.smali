.class public abstract LEe/F;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Landroidx/compose/ui/e;Ls9/d;ILT/l;I)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, LEe/F;->c(Landroidx/compose/ui/e;Ls9/d;ILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Landroidx/compose/ui/e;Ls9/d;LT/l;I)V
    .locals 31

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p3

    const-string v3, "modifier"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "text"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v3, 0x176f3288

    move-object/from16 v4, p2

    invoke-interface {v4, v3}, LT/l;->r(I)LT/l;

    move-result-object v15

    and-int/lit8 v4, v2, 0x6

    if-nez v4, :cond_1

    invoke-interface {v15, v0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 v4, 0x4

    goto :goto_0

    :cond_0
    const/4 v4, 0x2

    :goto_0
    or-int/2addr v4, v2

    goto :goto_1

    :cond_1
    move v4, v2

    :goto_1
    and-int/lit8 v5, v2, 0x30

    if-nez v5, :cond_3

    invoke-interface {v15, v1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    const/16 v5, 0x20

    goto :goto_2

    :cond_2
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v4, v5

    :cond_3
    and-int/lit8 v5, v4, 0x13

    const/16 v6, 0x12

    if-ne v5, v6, :cond_5

    invoke-interface {v15}, LT/l;->v()Z

    move-result v5

    if-nez v5, :cond_4

    goto :goto_3

    :cond_4
    invoke-interface {v15}, LT/l;->C()V

    move-object/from16 v30, v15

    goto/16 :goto_5

    :cond_5
    :goto_3
    invoke-static {}, LT/o;->H()Z

    move-result v5

    if-eqz v5, :cond_6

    const/4 v5, -0x1

    const-string v6, "com.ui.wifiman.ui.component.list.ListEmptyDescriptionItem (ListEmptyDescriptionItem.kt:22)"

    invoke-static {v3, v4, v5, v6}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_6
    const/16 v3, 0x3c

    int-to-float v3, v3

    invoke-static {v3}, LY0/h;->j(F)F

    move-result v3

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static {v0, v7, v3, v5, v6}, Landroidx/compose/foundation/layout/r;->b(Landroidx/compose/ui/e;FFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v3

    const/16 v5, 0x18

    int-to-float v5, v5

    invoke-static {v5}, LY0/h;->j(F)F

    move-result v6

    invoke-static {v5}, LY0/h;->j(F)F

    move-result v5

    invoke-static {v3, v6, v5}, Landroidx/compose/foundation/layout/o;->j(Landroidx/compose/ui/e;FF)Landroidx/compose/ui/e;

    move-result-object v3

    sget-object v5, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v5}, Lf0/c$a;->e()Lf0/c;

    move-result-object v5

    const/4 v6, 0x0

    invoke-static {v5, v6}, Landroidx/compose/foundation/layout/d;->h(Lf0/c;Z)LC0/C;

    move-result-object v5

    invoke-static {v15, v6}, LT/j;->a(LT/l;I)I

    move-result v6

    invoke-interface {v15}, LT/l;->G()LT/x;

    move-result-object v7

    invoke-static {v15, v3}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v3

    sget-object v8, LE0/g;->K:LE0/g$a;

    invoke-virtual {v8}, LE0/g$a;->a()Lmh/a;

    move-result-object v9

    invoke-interface {v15}, LT/l;->x()LT/f;

    move-result-object v10

    if-nez v10, :cond_7

    invoke-static {}, LT/j;->c()V

    :cond_7
    invoke-interface {v15}, LT/l;->u()V

    invoke-interface {v15}, LT/l;->o()Z

    move-result v10

    if-eqz v10, :cond_8

    invoke-interface {v15, v9}, LT/l;->D(Lmh/a;)V

    goto :goto_4

    :cond_8
    invoke-interface {v15}, LT/l;->I()V

    :goto_4
    invoke-static {v15}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v9

    invoke-virtual {v8}, LE0/g$a;->e()Lmh/p;

    move-result-object v10

    invoke-static {v9, v5, v10}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v8}, LE0/g$a;->g()Lmh/p;

    move-result-object v5

    invoke-static {v9, v7, v5}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v8}, LE0/g$a;->b()Lmh/p;

    move-result-object v5

    invoke-interface {v9}, LT/l;->o()Z

    move-result v7

    if-nez v7, :cond_9

    invoke-interface {v9}, LT/l;->f()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v7, v10}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_a

    :cond_9
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v9, v7}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v9, v6, v5}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_a
    invoke-virtual {v8}, LE0/g$a;->f()Lmh/p;

    move-result-object v5

    invoke-static {v9, v3, v5}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v3, Landroidx/compose/foundation/layout/f;->a:Landroidx/compose/foundation/layout/f;

    shr-int/lit8 v3, v4, 0x3

    and-int/lit8 v3, v3, 0xe

    invoke-static {v1, v15, v3}, Lsa/a;->a(Ls9/d;LT/l;I)LL0/d;

    move-result-object v4

    sget-object v3, Lla/a;->a:Lla/a;

    sget v5, Lla/a;->b:I

    invoke-virtual {v3, v15, v5}, Lla/a;->c(LT/l;I)Lpa/c;

    move-result-object v6

    invoke-virtual {v6}, Lpa/c;->a()Lpa/b;

    move-result-object v6

    invoke-virtual {v6}, Lpa/b;->a()LL0/U;

    move-result-object v25

    invoke-virtual {v3, v15, v5}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v3

    invoke-virtual {v3}, Lma/a;->f()Lma/a$f;

    move-result-object v3

    invoke-virtual {v3}, Lma/a$f;->c()J

    move-result-wide v6

    sget-object v3, LW0/j;->b:LW0/j$a;

    invoke-virtual {v3}, LW0/j$a;->a()I

    move-result v3

    invoke-static {v3}, LW0/j;->h(I)LW0/j;

    move-result-object v16

    const/16 v28, 0x0

    const v29, 0x1fdfa

    const/4 v5, 0x0

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    const/4 v3, 0x0

    move-object/from16 v30, v15

    move-object v15, v3

    const-wide/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v27, 0x0

    move-object/from16 v26, v30

    invoke-static/range {v4 .. v29}, LN/a1;->c(LL0/d;Landroidx/compose/ui/e;JJLQ0/v;LQ0/A;LQ0/k;JLW0/k;LW0/j;JIZIILjava/util/Map;Lmh/l;LL0/U;LT/l;III)V

    invoke-interface/range {v30 .. v30}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result v3

    if-eqz v3, :cond_b

    invoke-static {}, LT/o;->P()V

    :cond_b
    :goto_5
    invoke-interface/range {v30 .. v30}, LT/l;->z()LT/X0;

    move-result-object v3

    if-eqz v3, :cond_c

    new-instance v4, LEe/E;

    invoke-direct {v4, v0, v1, v2}, LEe/E;-><init>(Landroidx/compose/ui/e;Ls9/d;I)V

    invoke-interface {v3, v4}, LT/X0;->a(Lmh/p;)V

    :cond_c
    return-void
.end method

.method private static final c(Landroidx/compose/ui/e;Ls9/d;ILT/l;I)LYg/J;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LT/L0;->a(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, LEe/F;->b(Landroidx/compose/ui/e;Ls9/d;LT/l;I)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method
