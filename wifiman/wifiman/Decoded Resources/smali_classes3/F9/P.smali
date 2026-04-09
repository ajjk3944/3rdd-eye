.class public abstract LF9/P;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Landroidx/compose/ui/e;Landroidx/compose/foundation/o;Lz/N;Lmh/q;IILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p7}, LF9/P;->c(Landroidx/compose/ui/e;Landroidx/compose/foundation/o;Lz/N;Lmh/q;IILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Landroidx/compose/ui/e;Landroidx/compose/foundation/o;Lz/N;Lmh/q;LT/l;II)V
    .locals 19

    move-object/from16 v1, p0

    move-object/from16 v4, p3

    move/from16 v5, p5

    const-string/jumbo v0, "modifier"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "content"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x3253de4e

    move-object/from16 v2, p4

    invoke-interface {v2, v0}, LT/l;->r(I)LT/l;

    move-result-object v2

    and-int/lit8 v3, p6, 0x1

    if-eqz v3, :cond_0

    or-int/lit8 v3, v5, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v3, v5, 0x6

    if-nez v3, :cond_2

    invoke-interface {v2, v1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 v3, 0x4

    goto :goto_0

    :cond_1
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v3, v5

    goto :goto_1

    :cond_2
    move v3, v5

    :goto_1
    and-int/lit8 v6, v5, 0x30

    const/16 v7, 0x10

    if-nez v6, :cond_5

    and-int/lit8 v6, p6, 0x2

    if-nez v6, :cond_3

    move-object/from16 v6, p1

    invoke-interface {v2, v6}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_4

    const/16 v8, 0x20

    goto :goto_2

    :cond_3
    move-object/from16 v6, p1

    :cond_4
    move v8, v7

    :goto_2
    or-int/2addr v3, v8

    goto :goto_3

    :cond_5
    move-object/from16 v6, p1

    :goto_3
    and-int/lit16 v8, v5, 0x180

    if-nez v8, :cond_8

    and-int/lit8 v8, p6, 0x4

    if-nez v8, :cond_6

    move-object/from16 v8, p2

    invoke-interface {v2, v8}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_7

    const/16 v9, 0x100

    goto :goto_4

    :cond_6
    move-object/from16 v8, p2

    :cond_7
    const/16 v9, 0x80

    :goto_4
    or-int/2addr v3, v9

    goto :goto_5

    :cond_8
    move-object/from16 v8, p2

    :goto_5
    and-int/lit8 v9, p6, 0x8

    if-eqz v9, :cond_9

    or-int/lit16 v3, v3, 0xc00

    goto :goto_7

    :cond_9
    and-int/lit16 v9, v5, 0xc00

    if-nez v9, :cond_b

    invoke-interface {v2, v4}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_a

    const/16 v9, 0x800

    goto :goto_6

    :cond_a
    const/16 v9, 0x400

    :goto_6
    or-int/2addr v3, v9

    :cond_b
    :goto_7
    and-int/lit16 v9, v3, 0x493

    const/16 v10, 0x492

    if-ne v9, v10, :cond_e

    invoke-interface {v2}, LT/l;->v()Z

    move-result v9

    if-nez v9, :cond_c

    goto :goto_9

    :cond_c
    invoke-interface {v2}, LT/l;->C()V

    :cond_d
    :goto_8
    move-object v3, v8

    goto/16 :goto_e

    :cond_e
    :goto_9
    invoke-interface {v2}, LT/l;->q()V

    and-int/lit8 v9, v5, 0x1

    const/4 v10, 0x0

    const/4 v11, 0x1

    if-eqz v9, :cond_11

    invoke-interface {v2}, LT/l;->H()Z

    move-result v9

    if-eqz v9, :cond_f

    goto :goto_b

    :cond_f
    invoke-interface {v2}, LT/l;->C()V

    and-int/lit8 v9, p6, 0x2

    if-eqz v9, :cond_10

    and-int/lit8 v3, v3, -0x71

    :cond_10
    and-int/lit8 v9, p6, 0x4

    if-eqz v9, :cond_13

    :goto_a
    and-int/lit16 v3, v3, -0x381

    goto :goto_c

    :cond_11
    :goto_b
    and-int/lit8 v9, p6, 0x2

    if-eqz v9, :cond_12

    invoke-static {v10, v2, v10, v11}, Landroidx/compose/foundation/m;->a(ILT/l;II)Landroidx/compose/foundation/o;

    move-result-object v6

    and-int/lit8 v3, v3, -0x71

    :cond_12
    and-int/lit8 v9, p6, 0x4

    if-eqz v9, :cond_13

    sget-object v8, Lla/a;->a:Lla/a;

    sget v9, Lla/a;->b:I

    invoke-virtual {v8, v2, v9}, Lla/a;->d(LT/l;I)Lra/a;

    move-result-object v12

    invoke-virtual {v12}, Lra/a;->a()Lra/b;

    move-result-object v12

    invoke-virtual {v12}, Lra/b;->a()Lra/b$a$a;

    move-result-object v12

    invoke-virtual {v12}, Lra/b$a$a;->c()F

    move-result v13

    invoke-virtual {v8, v2, v9}, Lla/a;->d(LT/l;I)Lra/a;

    move-result-object v8

    invoke-virtual {v8}, Lra/a;->a()Lra/b;

    move-result-object v8

    invoke-virtual {v8}, Lra/b;->a()Lra/b$a$a;

    move-result-object v8

    invoke-virtual {v8}, Lra/b$a$a;->c()F

    move-result v15

    int-to-float v8, v7

    invoke-static {v8}, LY0/h;->j(F)F

    move-result v14

    const/16 v17, 0x8

    const/16 v18, 0x0

    const/16 v16, 0x0

    invoke-static/range {v13 .. v18}, Landroidx/compose/foundation/layout/o;->e(FFFFILjava/lang/Object;)Lz/N;

    move-result-object v8

    goto :goto_a

    :cond_13
    :goto_c
    invoke-interface {v2}, LT/l;->S()V

    invoke-static {}, LT/o;->H()Z

    move-result v9

    if-eqz v9, :cond_14

    const/4 v9, -0x1

    const-string/jumbo v12, "com.ui.core.ui.component.settings.UiSettings (UiSettings.kt:38)"

    invoke-static {v0, v3, v9, v12}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_14
    const/4 v0, 0x0

    const/4 v9, 0x0

    invoke-static {v1, v0, v11, v9}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v12

    const/16 v17, 0xe

    const/16 v18, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    move-object v13, v6

    invoke-static/range {v12 .. v18}, Landroidx/compose/foundation/m;->d(Landroidx/compose/ui/e;Landroidx/compose/foundation/o;ZLw/n;ZILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v0

    invoke-static {v0, v8}, Landroidx/compose/foundation/layout/o;->h(Landroidx/compose/ui/e;Lz/N;)Landroidx/compose/ui/e;

    move-result-object v0

    sget-object v9, Lz/c;->a:Lz/c;

    int-to-float v7, v7

    invoke-static {v7}, LY0/h;->j(F)F

    move-result v7

    invoke-virtual {v9, v7}, Lz/c;->n(F)Lz/c$f;

    move-result-object v7

    sget-object v9, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v9}, Lf0/c$a;->k()Lf0/c$b;

    move-result-object v9

    const/4 v11, 0x6

    invoke-static {v7, v9, v2, v11}, Lz/h;->a(Lz/c$m;Lf0/c$b;LT/l;I)LC0/C;

    move-result-object v7

    invoke-static {v2, v10}, LT/j;->a(LT/l;I)I

    move-result v9

    invoke-interface {v2}, LT/l;->G()LT/x;

    move-result-object v10

    invoke-static {v2, v0}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v0

    sget-object v12, LE0/g;->K:LE0/g$a;

    invoke-virtual {v12}, LE0/g$a;->a()Lmh/a;

    move-result-object v13

    invoke-interface {v2}, LT/l;->x()LT/f;

    move-result-object v14

    if-nez v14, :cond_15

    invoke-static {}, LT/j;->c()V

    :cond_15
    invoke-interface {v2}, LT/l;->u()V

    invoke-interface {v2}, LT/l;->o()Z

    move-result v14

    if-eqz v14, :cond_16

    invoke-interface {v2, v13}, LT/l;->D(Lmh/a;)V

    goto :goto_d

    :cond_16
    invoke-interface {v2}, LT/l;->I()V

    :goto_d
    invoke-static {v2}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v13

    invoke-virtual {v12}, LE0/g$a;->e()Lmh/p;

    move-result-object v14

    invoke-static {v13, v7, v14}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v12}, LE0/g$a;->g()Lmh/p;

    move-result-object v7

    invoke-static {v13, v10, v7}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v12}, LE0/g$a;->b()Lmh/p;

    move-result-object v7

    invoke-interface {v13}, LT/l;->o()Z

    move-result v10

    if-nez v10, :cond_17

    invoke-interface {v13}, LT/l;->f()Ljava/lang/Object;

    move-result-object v10

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v10, v14}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_18

    :cond_17
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-interface {v13, v10}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-interface {v13, v9, v7}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_18
    invoke-virtual {v12}, LE0/g$a;->f()Lmh/p;

    move-result-object v7

    invoke-static {v13, v0, v7}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v0, Lz/k;->a:Lz/k;

    shr-int/2addr v3, v11

    and-int/lit8 v3, v3, 0x70

    or-int/2addr v3, v11

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v4, v0, v2, v3}, Lmh/q;->s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v2}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_d

    invoke-static {}, LT/o;->P()V

    goto/16 :goto_8

    :goto_e
    invoke-interface {v2}, LT/l;->z()LT/X0;

    move-result-object v7

    if-eqz v7, :cond_19

    new-instance v8, LF9/O;

    move-object v0, v8

    move-object/from16 v1, p0

    move-object v2, v6

    move-object/from16 v4, p3

    move/from16 v5, p5

    move/from16 v6, p6

    invoke-direct/range {v0 .. v6}, LF9/O;-><init>(Landroidx/compose/ui/e;Landroidx/compose/foundation/o;Lz/N;Lmh/q;II)V

    invoke-interface {v7, v8}, LT/X0;->a(Lmh/p;)V

    :cond_19
    return-void
.end method

.method private static final c(Landroidx/compose/ui/e;Landroidx/compose/foundation/o;Lz/N;Lmh/q;IILT/l;I)LYg/J;
    .locals 7

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, LT/L0;->a(I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p6

    move v6, p5

    invoke-static/range {v0 .. v6}, LF9/P;->b(Landroidx/compose/ui/e;Landroidx/compose/foundation/o;Lz/N;Lmh/q;LT/l;II)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method
