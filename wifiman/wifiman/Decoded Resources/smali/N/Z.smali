.class public abstract LN/Z;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x18

    int-to-float v0, v0

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v0

    sput v0, LN/Z;->a:F

    return-void
.end method

.method public static final a(Lmh/a;Landroidx/compose/ui/e;ZLy/m;Lmh/p;LT/l;II)V
    .locals 25

    move-object/from16 v5, p4

    move/from16 v6, p6

    const/16 v0, 0x10

    const/4 v1, 0x2

    const/4 v2, 0x4

    const/4 v3, 0x6

    const v4, -0x69eb252

    move-object/from16 v7, p5

    invoke-interface {v7, v4}, LT/l;->r(I)LT/l;

    move-result-object v14

    const/4 v7, 0x1

    and-int/lit8 v8, p7, 0x1

    if-eqz v8, :cond_0

    or-int/lit8 v8, v6, 0x6

    move-object/from16 v15, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v8, v6, 0x6

    move-object/from16 v15, p0

    if-nez v8, :cond_2

    invoke-interface {v14, v15}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_1

    move v8, v2

    goto :goto_0

    :cond_1
    move v8, v1

    :goto_0
    or-int/2addr v8, v6

    goto :goto_1

    :cond_2
    move v8, v6

    :goto_1
    and-int/lit8 v1, p7, 0x2

    if-eqz v1, :cond_4

    or-int/lit8 v8, v8, 0x30

    :cond_3
    move-object/from16 v9, p1

    goto :goto_3

    :cond_4
    and-int/lit8 v9, v6, 0x30

    if-nez v9, :cond_3

    move-object/from16 v9, p1

    invoke-interface {v14, v9}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_5

    const/16 v10, 0x20

    goto :goto_2

    :cond_5
    move v10, v0

    :goto_2
    or-int/2addr v8, v10

    :goto_3
    and-int/lit8 v2, p7, 0x4

    if-eqz v2, :cond_7

    or-int/lit16 v8, v8, 0x180

    :cond_6
    move/from16 v10, p2

    goto :goto_5

    :cond_7
    and-int/lit16 v10, v6, 0x180

    if-nez v10, :cond_6

    move/from16 v10, p2

    invoke-interface {v14, v10}, LT/l;->c(Z)Z

    move-result v11

    if-eqz v11, :cond_8

    const/16 v11, 0x100

    goto :goto_4

    :cond_8
    const/16 v11, 0x80

    :goto_4
    or-int/2addr v8, v11

    :goto_5
    and-int/lit8 v11, p7, 0x8

    if-eqz v11, :cond_a

    or-int/lit16 v8, v8, 0xc00

    :cond_9
    move-object/from16 v12, p3

    goto :goto_7

    :cond_a
    and-int/lit16 v12, v6, 0xc00

    if-nez v12, :cond_9

    move-object/from16 v12, p3

    invoke-interface {v14, v12}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_b

    const/16 v13, 0x800

    goto :goto_6

    :cond_b
    const/16 v13, 0x400

    :goto_6
    or-int/2addr v8, v13

    :goto_7
    and-int/lit8 v0, p7, 0x10

    if-eqz v0, :cond_d

    or-int/lit16 v8, v8, 0x6000

    :cond_c
    :goto_8
    move v0, v8

    goto :goto_a

    :cond_d
    and-int/lit16 v0, v6, 0x6000

    if-nez v0, :cond_c

    invoke-interface {v14, v5}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_e

    const/16 v0, 0x4000

    goto :goto_9

    :cond_e
    const/16 v0, 0x2000

    :goto_9
    or-int/2addr v8, v0

    goto :goto_8

    :goto_a
    and-int/lit16 v8, v0, 0x2493

    const/16 v13, 0x2492

    if-ne v8, v13, :cond_10

    invoke-interface {v14}, LT/l;->v()Z

    move-result v8

    if-nez v8, :cond_f

    goto :goto_b

    :cond_f
    invoke-interface {v14}, LT/l;->C()V

    move-object v2, v9

    move v3, v10

    move-object v4, v12

    goto/16 :goto_12

    :cond_10
    :goto_b
    if-eqz v1, :cond_11

    sget-object v1, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    goto :goto_c

    :cond_11
    move-object v1, v9

    :goto_c
    if-eqz v2, :cond_12

    move v2, v7

    goto :goto_d

    :cond_12
    move v2, v10

    :goto_d
    if-eqz v11, :cond_13

    const/4 v7, 0x0

    move-object/from16 v24, v7

    goto :goto_e

    :cond_13
    move-object/from16 v24, v12

    :goto_e
    invoke-static {}, LT/o;->H()Z

    move-result v7

    if-eqz v7, :cond_14

    const/4 v7, -0x1

    const-string v8, "androidx.compose.material.IconButton (IconButton.kt:62)"

    invoke-static {v4, v0, v7, v8}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_14
    invoke-static {v1}, LN/c0;->d(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v4

    sget-object v7, LJ0/g;->b:LJ0/g$a;

    invoke-virtual {v7}, LJ0/g$a;->a()I

    move-result v16

    sget v8, LN/Z;->a:F

    const/16 v12, 0x36

    const/4 v13, 0x4

    const/4 v7, 0x0

    const-wide/16 v9, 0x0

    move-object v11, v14

    invoke-static/range {v7 .. v13}, LN/A0;->g(ZFJLT/l;II)Ls/G;

    move-result-object v17

    invoke-static/range {v16 .. v16}, LJ0/g;->h(I)LJ0/g;

    move-result-object v20

    const/16 v22, 0x8

    const/16 v23, 0x0

    const/16 v19, 0x0

    move-object v15, v4

    move-object/from16 v16, v24

    move/from16 v18, v2

    move-object/from16 v21, p0

    invoke-static/range {v15 .. v23}, Landroidx/compose/foundation/d;->b(Landroidx/compose/ui/e;Ly/m;Ls/G;ZLjava/lang/String;LJ0/g;Lmh/a;ILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v4

    sget-object v7, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v7}, Lf0/c$a;->e()Lf0/c;

    move-result-object v7

    const/4 v8, 0x0

    invoke-static {v7, v8}, Landroidx/compose/foundation/layout/d;->h(Lf0/c;Z)LC0/C;

    move-result-object v7

    invoke-static {v14, v8}, LT/j;->a(LT/l;I)I

    move-result v8

    invoke-interface {v14}, LT/l;->G()LT/x;

    move-result-object v9

    invoke-static {v14, v4}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v4

    sget-object v10, LE0/g;->K:LE0/g$a;

    invoke-virtual {v10}, LE0/g$a;->a()Lmh/a;

    move-result-object v11

    invoke-interface {v14}, LT/l;->x()LT/f;

    move-result-object v12

    if-nez v12, :cond_15

    invoke-static {}, LT/j;->c()V

    :cond_15
    invoke-interface {v14}, LT/l;->u()V

    invoke-interface {v14}, LT/l;->o()Z

    move-result v12

    if-eqz v12, :cond_16

    invoke-interface {v14, v11}, LT/l;->D(Lmh/a;)V

    goto :goto_f

    :cond_16
    invoke-interface {v14}, LT/l;->I()V

    :goto_f
    invoke-static {v14}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v11

    invoke-virtual {v10}, LE0/g$a;->e()Lmh/p;

    move-result-object v12

    invoke-static {v11, v7, v12}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v10}, LE0/g$a;->g()Lmh/p;

    move-result-object v7

    invoke-static {v11, v9, v7}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v10}, LE0/g$a;->b()Lmh/p;

    move-result-object v7

    invoke-interface {v11}, LT/l;->o()Z

    move-result v9

    if-nez v9, :cond_17

    invoke-interface {v11}, LT/l;->f()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v9, v12}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_18

    :cond_17
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-interface {v11, v9}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-interface {v11, v8, v7}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_18
    invoke-virtual {v10}, LE0/g$a;->f()Lmh/p;

    move-result-object v7

    invoke-static {v11, v4, v7}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v4, Landroidx/compose/foundation/layout/f;->a:Landroidx/compose/foundation/layout/f;

    if-eqz v2, :cond_19

    const v3, 0x7060cdb7

    invoke-interface {v14, v3}, LT/l;->U(I)V

    invoke-static {}, LN/s;->a()LT/H0;

    move-result-object v3

    invoke-interface {v14, v3}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    move-result v3

    :goto_10
    invoke-interface {v14}, LT/l;->J()V

    goto :goto_11

    :cond_19
    const v4, 0x7060d0f8

    invoke-interface {v14, v4}, LT/l;->U(I)V

    sget-object v4, LN/r;->a:LN/r;

    invoke-virtual {v4, v14, v3}, LN/r;->b(LT/l;I)F

    move-result v3

    goto :goto_10

    :goto_11
    invoke-static {}, LN/s;->a()LT/H0;

    move-result-object v4

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    invoke-virtual {v4, v3}, LT/H0;->d(Ljava/lang/Object;)LT/I0;

    move-result-object v3

    sget v4, LT/I0;->i:I

    shr-int/lit8 v0, v0, 0x9

    and-int/lit8 v0, v0, 0x70

    or-int/2addr v0, v4

    invoke-static {v3, v5, v14, v0}, LT/w;->a(LT/I0;Lmh/p;LT/l;I)V

    invoke-interface {v14}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_1a

    invoke-static {}, LT/o;->P()V

    :cond_1a
    move v3, v2

    move-object/from16 v4, v24

    move-object v2, v1

    :goto_12
    invoke-interface {v14}, LT/l;->z()LT/X0;

    move-result-object v8

    if-eqz v8, :cond_1b

    new-instance v9, LN/Z$a;

    move-object v0, v9

    move-object/from16 v1, p0

    move-object/from16 v5, p4

    move/from16 v6, p6

    move/from16 v7, p7

    invoke-direct/range {v0 .. v7}, LN/Z$a;-><init>(Lmh/a;Landroidx/compose/ui/e;ZLy/m;Lmh/p;II)V

    invoke-interface {v8, v9}, LT/X0;->a(Lmh/p;)V

    :cond_1b
    return-void
.end method
