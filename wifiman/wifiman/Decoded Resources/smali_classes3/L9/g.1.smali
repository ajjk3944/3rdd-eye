.class public abstract LL9/g;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:LE/g;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x8

    int-to-float v0, v0

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v0

    invoke-static {v0}, LE/h;->d(F)LE/g;

    move-result-object v0

    sput-object v0, LL9/g;->a:LE/g;

    return-void
.end method

.method public static synthetic a()LYg/J;
    .locals 1

    invoke-static {}, LL9/g;->d()LYg/J;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic b(Landroidx/compose/ui/e;ZLmh/a;Ly/m;Ls/G;Lmh/p;IILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p9}, LL9/g;->e(Landroidx/compose/ui/e;ZLmh/a;Ly/m;Ls/G;Lmh/p;IILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Landroidx/compose/ui/e;ZLmh/a;Ly/m;Ls/G;Lmh/p;LT/l;II)V
    .locals 33

    move-object/from16 v6, p5

    move/from16 v7, p7

    const/16 v0, 0x20

    const/4 v1, 0x2

    const/4 v2, 0x4

    const/16 v3, 0x10

    const-string/jumbo v4, "content"

    invoke-static {v6, v4}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v4, 0x2f7ad513

    move-object/from16 v5, p6

    invoke-interface {v5, v4}, LT/l;->r(I)LT/l;

    move-result-object v5

    const/4 v8, 0x1

    and-int/lit8 v9, p8, 0x1

    if-eqz v9, :cond_0

    or-int/lit8 v10, v7, 0x6

    move v11, v10

    move-object/from16 v10, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v10, v7, 0x6

    if-nez v10, :cond_2

    move-object/from16 v10, p0

    invoke-interface {v5, v10}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_1

    move v11, v2

    goto :goto_0

    :cond_1
    move v11, v1

    :goto_0
    or-int/2addr v11, v7

    goto :goto_1

    :cond_2
    move-object/from16 v10, p0

    move v11, v7

    :goto_1
    and-int/lit8 v1, p8, 0x2

    if-eqz v1, :cond_4

    or-int/lit8 v11, v11, 0x30

    :cond_3
    move/from16 v12, p1

    goto :goto_3

    :cond_4
    and-int/lit8 v12, v7, 0x30

    if-nez v12, :cond_3

    move/from16 v12, p1

    invoke-interface {v5, v12}, LT/l;->c(Z)Z

    move-result v13

    if-eqz v13, :cond_5

    move v13, v0

    goto :goto_2

    :cond_5
    move v13, v3

    :goto_2
    or-int/2addr v11, v13

    :goto_3
    and-int/lit8 v2, p8, 0x4

    if-eqz v2, :cond_7

    or-int/lit16 v11, v11, 0x180

    :cond_6
    move-object/from16 v13, p2

    goto :goto_5

    :cond_7
    and-int/lit16 v13, v7, 0x180

    if-nez v13, :cond_6

    move-object/from16 v13, p2

    invoke-interface {v5, v13}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_8

    const/16 v14, 0x100

    goto :goto_4

    :cond_8
    const/16 v14, 0x80

    :goto_4
    or-int/2addr v11, v14

    :goto_5
    and-int/lit8 v14, p8, 0x8

    if-eqz v14, :cond_a

    or-int/lit16 v11, v11, 0xc00

    :cond_9
    move-object/from16 v15, p3

    goto :goto_7

    :cond_a
    and-int/lit16 v15, v7, 0xc00

    if-nez v15, :cond_9

    move-object/from16 v15, p3

    invoke-interface {v5, v15}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_b

    const/16 v16, 0x800

    goto :goto_6

    :cond_b
    const/16 v16, 0x400

    :goto_6
    or-int v11, v11, v16

    :goto_7
    and-int/lit16 v4, v7, 0x6000

    if-nez v4, :cond_e

    and-int/lit8 v4, p8, 0x10

    if-nez v4, :cond_c

    move-object/from16 v4, p4

    invoke-interface {v5, v4}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_d

    const/16 v17, 0x4000

    goto :goto_8

    :cond_c
    move-object/from16 v4, p4

    :cond_d
    const/16 v17, 0x2000

    :goto_8
    or-int v11, v11, v17

    goto :goto_9

    :cond_e
    move-object/from16 v4, p4

    :goto_9
    and-int/lit8 v0, p8, 0x20

    const/high16 v17, 0x30000

    if-eqz v0, :cond_f

    or-int v11, v11, v17

    goto :goto_b

    :cond_f
    and-int v0, v7, v17

    if-nez v0, :cond_11

    invoke-interface {v5, v6}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_10

    const/high16 v0, 0x20000

    goto :goto_a

    :cond_10
    const/high16 v0, 0x10000

    :goto_a
    or-int/2addr v11, v0

    :cond_11
    :goto_b
    const v0, 0x12493

    and-int/2addr v0, v11

    const v3, 0x12492

    if-ne v0, v3, :cond_13

    invoke-interface {v5}, LT/l;->v()Z

    move-result v0

    if-nez v0, :cond_12

    goto :goto_d

    :cond_12
    invoke-interface {v5}, LT/l;->C()V

    move-object v8, v4

    move-object v1, v10

    move v2, v12

    move-object v3, v13

    :goto_c
    move-object v4, v15

    goto/16 :goto_12

    :cond_13
    :goto_d
    invoke-interface {v5}, LT/l;->q()V

    and-int/lit8 v0, v7, 0x1

    const v3, -0xe001

    if-eqz v0, :cond_16

    invoke-interface {v5}, LT/l;->H()Z

    move-result v0

    if-eqz v0, :cond_14

    goto :goto_e

    :cond_14
    invoke-interface {v5}, LT/l;->C()V

    const/16 v0, 0x10

    and-int/lit8 v0, p8, 0x10

    if-eqz v0, :cond_15

    and-int/2addr v11, v3

    :cond_15
    move v8, v12

    goto :goto_10

    :cond_16
    :goto_e
    if-eqz v9, :cond_17

    sget-object v0, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    move-object v10, v0

    :cond_17
    if-eqz v1, :cond_18

    goto :goto_f

    :cond_18
    move v8, v12

    :goto_f
    if-eqz v2, :cond_1a

    const v0, 0x24d326b0

    invoke-interface {v5, v0}, LT/l;->U(I)V

    invoke-interface {v5}, LT/l;->f()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, LT/l;->a:LT/l$a;

    invoke-virtual {v1}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v0, v1, :cond_19

    new-instance v0, LL9/e;

    invoke-direct {v0}, LL9/e;-><init>()V

    invoke-interface {v5, v0}, LT/l;->K(Ljava/lang/Object;)V

    :cond_19
    check-cast v0, Lmh/a;

    invoke-interface {v5}, LT/l;->J()V

    move-object v13, v0

    :cond_1a
    if-eqz v14, :cond_1c

    const v0, 0x24d32d95

    invoke-interface {v5, v0}, LT/l;->U(I)V

    invoke-interface {v5}, LT/l;->f()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, LT/l;->a:LT/l$a;

    invoke-virtual {v1}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v0, v1, :cond_1b

    invoke-static {}, Ly/l;->a()Ly/m;

    move-result-object v0

    invoke-interface {v5, v0}, LT/l;->K(Ljava/lang/Object;)V

    :cond_1b
    check-cast v0, Ly/m;

    invoke-interface {v5}, LT/l;->J()V

    move-object v15, v0

    :cond_1c
    const/16 v0, 0x10

    and-int/lit8 v0, p8, 0x10

    if-eqz v0, :cond_1d

    invoke-static {}, Landroidx/compose/foundation/j;->a()LT/H0;

    move-result-object v0

    invoke-interface {v5, v0}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ls/G;

    and-int/2addr v11, v3

    move-object v4, v0

    :cond_1d
    :goto_10
    invoke-interface {v5}, LT/l;->S()V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_1e

    const/4 v0, -0x1

    const-string/jumbo v1, "com.ui.core.ui.component.toolbar.UiToolbarActionButtonContainer (UiToolbarActionButtonContainer.kt:29)"

    const v2, 0x2f7ad513

    invoke-static {v2, v11, v0, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_1e
    sget-object v0, LL9/g;->a:LE/g;

    invoke-static {v10, v0}, Lj0/e;->a(Landroidx/compose/ui/e;Lm0/i1;)Landroidx/compose/ui/e;

    move-result-object v17

    sget-object v0, LJ0/g;->b:LJ0/g$a;

    invoke-virtual {v0}, LJ0/g$a;->a()I

    move-result v0

    invoke-static {v0}, LJ0/g;->h(I)LJ0/g;

    move-result-object v22

    const/16 v24, 0x8

    const/16 v25, 0x0

    const/16 v21, 0x0

    move-object/from16 v18, v15

    move-object/from16 v19, v4

    move/from16 v20, v8

    move-object/from16 v23, v13

    invoke-static/range {v17 .. v25}, Landroidx/compose/foundation/d;->b(Landroidx/compose/ui/e;Ly/m;Ls/G;ZLjava/lang/String;LJ0/g;Lmh/a;ILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v26

    const/16 v0, 0x26

    int-to-float v0, v0

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v27

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v28

    const/16 v31, 0xc

    const/16 v32, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    invoke-static/range {v26 .. v32}, Landroidx/compose/foundation/layout/r;->y(Landroidx/compose/ui/e;FFFFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v0

    sget-object v1, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v1}, Lf0/c$a;->e()Lf0/c;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v1, v2}, Landroidx/compose/foundation/layout/d;->h(Lf0/c;Z)LC0/C;

    move-result-object v1

    invoke-static {v5, v2}, LT/j;->a(LT/l;I)I

    move-result v2

    invoke-interface {v5}, LT/l;->G()LT/x;

    move-result-object v3

    invoke-static {v5, v0}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v0

    sget-object v9, LE0/g;->K:LE0/g$a;

    invoke-virtual {v9}, LE0/g$a;->a()Lmh/a;

    move-result-object v12

    invoke-interface {v5}, LT/l;->x()LT/f;

    move-result-object v14

    if-nez v14, :cond_1f

    invoke-static {}, LT/j;->c()V

    :cond_1f
    invoke-interface {v5}, LT/l;->u()V

    invoke-interface {v5}, LT/l;->o()Z

    move-result v14

    if-eqz v14, :cond_20

    invoke-interface {v5, v12}, LT/l;->D(Lmh/a;)V

    goto :goto_11

    :cond_20
    invoke-interface {v5}, LT/l;->I()V

    :goto_11
    invoke-static {v5}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v12

    invoke-virtual {v9}, LE0/g$a;->e()Lmh/p;

    move-result-object v14

    invoke-static {v12, v1, v14}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v9}, LE0/g$a;->g()Lmh/p;

    move-result-object v1

    invoke-static {v12, v3, v1}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v9}, LE0/g$a;->b()Lmh/p;

    move-result-object v1

    invoke-interface {v12}, LT/l;->o()Z

    move-result v3

    if-nez v3, :cond_21

    invoke-interface {v12}, LT/l;->f()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v3, v14}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_22

    :cond_21
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v12, v3}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v12, v2, v1}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_22
    invoke-virtual {v9}, LE0/g$a;->f()Lmh/p;

    move-result-object v1

    invoke-static {v12, v0, v1}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v0, Landroidx/compose/foundation/layout/f;->a:Landroidx/compose/foundation/layout/f;

    shr-int/lit8 v0, v11, 0xf

    and-int/lit8 v0, v0, 0xe

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v6, v5, v0}, Lmh/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v5}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_23

    invoke-static {}, LT/o;->P()V

    :cond_23
    move v2, v8

    move-object v1, v10

    move-object v3, v13

    move-object v8, v4

    goto/16 :goto_c

    :goto_12
    invoke-interface {v5}, LT/l;->z()LT/X0;

    move-result-object v9

    if-eqz v9, :cond_24

    new-instance v10, LL9/f;

    move-object v0, v10

    move-object v5, v8

    move-object/from16 v6, p5

    move/from16 v7, p7

    move/from16 v8, p8

    invoke-direct/range {v0 .. v8}, LL9/f;-><init>(Landroidx/compose/ui/e;ZLmh/a;Ly/m;Ls/G;Lmh/p;II)V

    invoke-interface {v9, v10}, LT/X0;->a(Lmh/p;)V

    :cond_24
    return-void
.end method

.method private static final d()LYg/J;
    .locals 1

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method

.method private static final e(Landroidx/compose/ui/e;ZLmh/a;Ly/m;Ls/G;Lmh/p;IILT/l;I)LYg/J;
    .locals 10

    or-int/lit8 v0, p6, 0x1

    invoke-static {v0}, LT/L0;->a(I)I

    move-result v8

    move-object v1, p0

    move v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object/from16 v7, p8

    move/from16 v9, p7

    invoke-static/range {v1 .. v9}, LL9/g;->c(Landroidx/compose/ui/e;ZLmh/a;Ly/m;Ls/G;Lmh/p;LT/l;II)V

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method
