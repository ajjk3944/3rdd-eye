.class public abstract LN/m0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:F

.field private static final b:F

.field private static final c:F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x38

    int-to-float v0, v0

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v0

    sput v0, LN/m0;->a:F

    const/16 v0, 0x7d

    int-to-float v0, v0

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v0

    sput v0, LN/m0;->b:F

    const/16 v0, 0x280

    int-to-float v0, v0

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v0

    sput v0, LN/m0;->c:F

    return-void
.end method

.method private static final a(LN/b;Lw/q;)Lx0/a;
    .locals 1

    new-instance v0, LN/m0$a;

    invoke-direct {v0, p0, p1}, LN/m0$a;-><init>(LN/b;Lw/q;)V

    return-object v0
.end method

.method public static final b(Lmh/q;Landroidx/compose/ui/e;LN/n0;ZLm0/i1;FJJJLmh/p;LT/l;II)V
    .locals 38

    move-object/from16 v1, p0

    move-object/from16 v13, p12

    move/from16 v14, p14

    move/from16 v15, p15

    const v0, -0x58a9d30

    move-object/from16 v2, p13

    invoke-interface {v2, v0}, LT/l;->r(I)LT/l;

    move-result-object v9

    and-int/lit8 v2, v15, 0x1

    if-eqz v2, :cond_0

    or-int/lit8 v2, v14, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v2, v14, 0x6

    if-nez v2, :cond_2

    invoke-interface {v9, v1}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v2, 0x4

    goto :goto_0

    :cond_1
    const/4 v2, 0x2

    :goto_0
    or-int/2addr v2, v14

    goto :goto_1

    :cond_2
    move v2, v14

    :goto_1
    and-int/lit8 v3, v15, 0x2

    if-eqz v3, :cond_4

    or-int/lit8 v2, v2, 0x30

    :cond_3
    move-object/from16 v4, p1

    goto :goto_3

    :cond_4
    and-int/lit8 v4, v14, 0x30

    if-nez v4, :cond_3

    move-object/from16 v4, p1

    invoke-interface {v9, v4}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_5

    const/16 v5, 0x20

    goto :goto_2

    :cond_5
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v2, v5

    :goto_3
    and-int/lit16 v5, v14, 0x180

    if-nez v5, :cond_8

    and-int/lit8 v5, v15, 0x4

    if-nez v5, :cond_6

    move-object/from16 v5, p2

    invoke-interface {v9, v5}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_7

    const/16 v6, 0x100

    goto :goto_4

    :cond_6
    move-object/from16 v5, p2

    :cond_7
    const/16 v6, 0x80

    :goto_4
    or-int/2addr v2, v6

    goto :goto_5

    :cond_8
    move-object/from16 v5, p2

    :goto_5
    and-int/lit8 v11, v15, 0x8

    if-eqz v11, :cond_9

    or-int/lit16 v2, v2, 0xc00

    move/from16 v12, p3

    goto :goto_7

    :cond_9
    and-int/lit16 v6, v14, 0xc00

    move/from16 v12, p3

    if-nez v6, :cond_b

    invoke-interface {v9, v12}, LT/l;->c(Z)Z

    move-result v6

    if-eqz v6, :cond_a

    const/16 v6, 0x800

    goto :goto_6

    :cond_a
    const/16 v6, 0x400

    :goto_6
    or-int/2addr v2, v6

    :cond_b
    :goto_7
    and-int/lit16 v6, v14, 0x6000

    if-nez v6, :cond_d

    and-int/lit8 v6, v15, 0x10

    move-object/from16 v8, p4

    if-nez v6, :cond_c

    invoke-interface {v9, v8}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_c

    const/16 v6, 0x4000

    goto :goto_8

    :cond_c
    const/16 v6, 0x2000

    :goto_8
    or-int/2addr v2, v6

    goto :goto_9

    :cond_d
    move-object/from16 v8, p4

    :goto_9
    const/high16 v6, 0x30000

    and-int/2addr v6, v14

    if-nez v6, :cond_f

    and-int/lit8 v6, v15, 0x20

    move/from16 v7, p5

    if-nez v6, :cond_e

    invoke-interface {v9, v7}, LT/l;->g(F)Z

    move-result v6

    if-eqz v6, :cond_e

    const/high16 v6, 0x20000

    goto :goto_a

    :cond_e
    const/high16 v6, 0x10000

    :goto_a
    or-int/2addr v2, v6

    goto :goto_b

    :cond_f
    move/from16 v7, p5

    :goto_b
    const/high16 v16, 0x180000

    and-int v6, v14, v16

    if-nez v6, :cond_11

    and-int/lit8 v6, v15, 0x40

    move-wide/from16 v0, p6

    if-nez v6, :cond_10

    invoke-interface {v9, v0, v1}, LT/l;->j(J)Z

    move-result v6

    if-eqz v6, :cond_10

    const/high16 v6, 0x100000

    goto :goto_c

    :cond_10
    const/high16 v6, 0x80000

    :goto_c
    or-int/2addr v2, v6

    goto :goto_d

    :cond_11
    move-wide/from16 v0, p6

    :goto_d
    const/high16 v6, 0xc00000

    and-int/2addr v6, v14

    if-nez v6, :cond_13

    and-int/lit16 v6, v15, 0x80

    move/from16 v18, v11

    move-wide/from16 v10, p8

    if-nez v6, :cond_12

    invoke-interface {v9, v10, v11}, LT/l;->j(J)Z

    move-result v6

    if-eqz v6, :cond_12

    const/high16 v6, 0x800000

    goto :goto_e

    :cond_12
    const/high16 v6, 0x400000

    :goto_e
    or-int/2addr v2, v6

    goto :goto_f

    :cond_13
    move/from16 v18, v11

    move-wide/from16 v10, p8

    :goto_f
    const/high16 v6, 0x6000000

    and-int/2addr v6, v14

    if-nez v6, :cond_15

    and-int/lit16 v6, v15, 0x100

    move-wide/from16 v7, p10

    if-nez v6, :cond_14

    invoke-interface {v9, v7, v8}, LT/l;->j(J)Z

    move-result v6

    if-eqz v6, :cond_14

    const/high16 v6, 0x4000000

    goto :goto_10

    :cond_14
    const/high16 v6, 0x2000000

    :goto_10
    or-int/2addr v2, v6

    goto :goto_11

    :cond_15
    move-wide/from16 v7, p10

    :goto_11
    and-int/lit16 v6, v15, 0x200

    const/high16 v19, 0x30000000

    if-eqz v6, :cond_17

    or-int v2, v2, v19

    :cond_16
    :goto_12
    move v6, v2

    goto :goto_14

    :cond_17
    and-int v6, v14, v19

    if-nez v6, :cond_16

    invoke-interface {v9, v13}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_18

    const/high16 v6, 0x20000000

    goto :goto_13

    :cond_18
    const/high16 v6, 0x10000000

    :goto_13
    or-int/2addr v2, v6

    goto :goto_12

    :goto_14
    const v2, 0x12492493

    and-int/2addr v2, v6

    const v0, 0x12492492

    if-ne v2, v0, :cond_1a

    invoke-interface {v9}, LT/l;->v()Z

    move-result v0

    if-nez v0, :cond_19

    goto :goto_15

    :cond_19
    invoke-interface {v9}, LT/l;->C()V

    move-object/from16 v3, p0

    move-object/from16 v34, p4

    move/from16 v6, p5

    move-object v2, v4

    move-wide/from16 v28, v7

    move v4, v12

    move-wide/from16 v7, p6

    goto/16 :goto_24

    :cond_1a
    :goto_15
    invoke-interface {v9}, LT/l;->q()V

    and-int/lit8 v0, v14, 0x1

    const v1, -0x380001

    const v19, -0x70001

    const v20, -0xe001

    const/4 v2, 0x0

    const/4 v8, 0x1

    if-eqz v0, :cond_22

    invoke-interface {v9}, LT/l;->H()Z

    move-result v0

    if-eqz v0, :cond_1b

    goto :goto_16

    :cond_1b
    invoke-interface {v9}, LT/l;->C()V

    and-int/lit8 v0, v15, 0x4

    if-eqz v0, :cond_1c

    and-int/lit16 v6, v6, -0x381

    :cond_1c
    and-int/lit8 v0, v15, 0x10

    if-eqz v0, :cond_1d

    and-int v6, v6, v20

    :cond_1d
    and-int/lit8 v0, v15, 0x20

    if-eqz v0, :cond_1e

    and-int v6, v6, v19

    :cond_1e
    and-int/lit8 v0, v15, 0x40

    if-eqz v0, :cond_1f

    and-int/2addr v6, v1

    :cond_1f
    and-int/lit16 v0, v15, 0x80

    if-eqz v0, :cond_20

    const v0, -0x1c00001

    and-int/2addr v6, v0

    :cond_20
    and-int/lit16 v0, v15, 0x100

    if-eqz v0, :cond_21

    const v0, -0xe000001

    and-int/2addr v6, v0

    :cond_21
    move-object/from16 v1, p4

    move/from16 v3, p5

    move-wide/from16 v28, p10

    move v0, v8

    move-wide/from16 v7, p6

    move-object/from16 v37, v5

    move v5, v2

    move-object/from16 v2, v37

    goto/16 :goto_1d

    :cond_22
    :goto_16
    if-eqz v3, :cond_23

    sget-object v0, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    goto :goto_17

    :cond_23
    move-object v0, v4

    :goto_17
    and-int/lit8 v3, v15, 0x4

    if-eqz v3, :cond_24

    sget-object v3, LN/o0;->Hidden:LN/o0;

    const/4 v7, 0x6

    const/16 v21, 0xe

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/16 v22, 0x0

    move-object v2, v3

    move-object v3, v4

    move-object v4, v5

    move/from16 v5, v22

    move v1, v6

    move-object v6, v9

    move-object/from16 p1, v0

    move v0, v8

    move/from16 v8, v21

    invoke-static/range {v2 .. v8}, LN/m0;->j(LN/o0;Lr/i;Lmh/l;ZLT/l;II)LN/n0;

    move-result-object v2

    and-int/lit16 v6, v1, -0x381

    goto :goto_18

    :cond_24
    move-object/from16 p1, v0

    move v1, v6

    move v0, v8

    move-object v2, v5

    :goto_18
    if-eqz v18, :cond_25

    move v12, v0

    :cond_25
    and-int/lit8 v1, v15, 0x10

    const/4 v3, 0x6

    if-eqz v1, :cond_26

    sget-object v1, LN/f0;->a:LN/f0;

    invoke-virtual {v1, v9, v3}, LN/f0;->b(LT/l;I)LN/F0;

    move-result-object v1

    invoke-virtual {v1}, LN/F0;->a()LE/a;

    move-result-object v1

    and-int v6, v6, v20

    goto :goto_19

    :cond_26
    move-object/from16 v1, p4

    :goto_19
    and-int/lit8 v4, v15, 0x20

    if-eqz v4, :cond_27

    sget-object v4, LN/l0;->a:LN/l0;

    invoke-virtual {v4}, LN/l0;->b()F

    move-result v4

    and-int v6, v6, v19

    goto :goto_1a

    :cond_27
    move/from16 v4, p5

    :goto_1a
    and-int/lit8 v5, v15, 0x40

    if-eqz v5, :cond_28

    sget-object v5, LN/f0;->a:LN/f0;

    invoke-virtual {v5, v9, v3}, LN/f0;->a(LT/l;I)LN/m;

    move-result-object v3

    invoke-virtual {v3}, LN/m;->n()J

    move-result-wide v7

    const v3, -0x380001

    and-int/2addr v6, v3

    goto :goto_1b

    :cond_28
    move-wide/from16 v7, p6

    :goto_1b
    and-int/lit16 v3, v15, 0x80

    if-eqz v3, :cond_29

    shr-int/lit8 v3, v6, 0x12

    and-int/lit8 v3, v3, 0xe

    invoke-static {v7, v8, v9, v3}, LN/n;->b(JLT/l;I)J

    move-result-wide v10

    const v3, -0x1c00001

    and-int/2addr v3, v6

    move v6, v3

    :cond_29
    and-int/lit16 v3, v15, 0x100

    if-eqz v3, :cond_2a

    sget-object v3, LN/l0;->a:LN/l0;

    const/4 v5, 0x0

    invoke-virtual {v3, v9, v5}, LN/l0;->c(LT/l;I)J

    move-result-wide v18

    const v3, -0xe000001

    and-int/2addr v6, v3

    move v3, v4

    move-wide/from16 v28, v18

    :goto_1c
    move-object/from16 v4, p1

    goto :goto_1d

    :cond_2a
    const/4 v5, 0x0

    move-wide/from16 v28, p10

    move v3, v4

    goto :goto_1c

    :goto_1d
    invoke-interface {v9}, LT/l;->S()V

    invoke-static {}, LT/o;->H()Z

    move-result v18

    if-eqz v18, :cond_2b

    const/4 v0, -0x1

    const-string v5, "androidx.compose.material.ModalBottomSheetLayout (ModalBottomSheet.kt:361)"

    const v14, -0x58a9d30

    invoke-static {v14, v6, v0, v5}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2b
    invoke-interface {v9}, LT/l;->f()Ljava/lang/Object;

    move-result-object v0

    sget-object v5, LT/l;->a:LT/l$a;

    invoke-virtual {v5}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v14

    if-ne v0, v14, :cond_2c

    sget-object v0, Ldh/j;->a:Ldh/j;

    invoke-static {v0, v9}, LT/O;->i(Ldh/i;LT/l;)LIi/N;

    move-result-object v0

    new-instance v14, LT/A;

    invoke-direct {v14, v0}, LT/A;-><init>(LIi/N;)V

    invoke-interface {v9, v14}, LT/l;->K(Ljava/lang/Object;)V

    move-object v0, v14

    :cond_2c
    check-cast v0, LT/A;

    invoke-virtual {v0}, LT/A;->a()LIi/N;

    move-result-object v0

    sget-object v14, Lw/q;->Vertical:Lw/q;

    sget-object v17, Lf0/c;->a:Lf0/c$a;

    invoke-virtual/range {v17 .. v17}, Lf0/c$a;->o()Lf0/c;

    move-result-object v15

    move/from16 p10, v3

    const/4 v3, 0x0

    invoke-static {v15, v3}, Landroidx/compose/foundation/layout/d;->h(Lf0/c;Z)LC0/C;

    move-result-object v15

    invoke-static {v9, v3}, LT/j;->a(LT/l;I)I

    move-result v20

    invoke-interface {v9}, LT/l;->G()LT/x;

    move-result-object v3

    move-wide/from16 v30, v10

    invoke-static {v9, v4}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v10

    sget-object v11, LE0/g;->K:LE0/g$a;

    move-object/from16 p11, v4

    invoke-virtual {v11}, LE0/g$a;->a()Lmh/a;

    move-result-object v4

    invoke-interface {v9}, LT/l;->x()LT/f;

    move-result-object v21

    if-nez v21, :cond_2d

    invoke-static {}, LT/j;->c()V

    :cond_2d
    invoke-interface {v9}, LT/l;->u()V

    invoke-interface {v9}, LT/l;->o()Z

    move-result v21

    if-eqz v21, :cond_2e

    invoke-interface {v9, v4}, LT/l;->D(Lmh/a;)V

    goto :goto_1e

    :cond_2e
    invoke-interface {v9}, LT/l;->I()V

    :goto_1e
    invoke-static {v9}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v4

    move-wide/from16 v32, v7

    invoke-virtual {v11}, LE0/g$a;->e()Lmh/p;

    move-result-object v7

    invoke-static {v4, v15, v7}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v11}, LE0/g$a;->g()Lmh/p;

    move-result-object v7

    invoke-static {v4, v3, v7}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v11}, LE0/g$a;->b()Lmh/p;

    move-result-object v3

    invoke-interface {v4}, LT/l;->o()Z

    move-result v7

    if-nez v7, :cond_2f

    invoke-interface {v4}, LT/l;->f()Ljava/lang/Object;

    move-result-object v7

    invoke-static/range {v20 .. v20}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v7, v8}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_30

    :cond_2f
    invoke-static/range {v20 .. v20}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v4, v7}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static/range {v20 .. v20}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v4, v7, v3}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_30
    invoke-virtual {v11}, LE0/g$a;->f()Lmh/p;

    move-result-object v3

    invoke-static {v4, v10, v3}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v3, Landroidx/compose/foundation/layout/f;->a:Landroidx/compose/foundation/layout/f;

    sget-object v4, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x1

    invoke-static {v4, v7, v10, v8}, Landroidx/compose/foundation/layout/r;->f(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v15

    invoke-virtual/range {v17 .. v17}, Lf0/c$a;->o()Lf0/c;

    move-result-object v10

    const/4 v7, 0x0

    invoke-static {v10, v7}, Landroidx/compose/foundation/layout/d;->h(Lf0/c;Z)LC0/C;

    move-result-object v10

    invoke-static {v9, v7}, LT/j;->a(LT/l;I)I

    move-result v20

    invoke-interface {v9}, LT/l;->G()LT/x;

    move-result-object v7

    invoke-static {v9, v15}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v15

    invoke-virtual {v11}, LE0/g$a;->a()Lmh/a;

    move-result-object v8

    invoke-interface {v9}, LT/l;->x()LT/f;

    move-result-object v22

    if-nez v22, :cond_31

    invoke-static {}, LT/j;->c()V

    :cond_31
    invoke-interface {v9}, LT/l;->u()V

    invoke-interface {v9}, LT/l;->o()Z

    move-result v22

    if-eqz v22, :cond_32

    invoke-interface {v9, v8}, LT/l;->D(Lmh/a;)V

    goto :goto_1f

    :cond_32
    invoke-interface {v9}, LT/l;->I()V

    :goto_1f
    invoke-static {v9}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v8

    move-object/from16 v34, v1

    invoke-virtual {v11}, LE0/g$a;->e()Lmh/p;

    move-result-object v1

    invoke-static {v8, v10, v1}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v11}, LE0/g$a;->g()Lmh/p;

    move-result-object v1

    invoke-static {v8, v7, v1}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v11}, LE0/g$a;->b()Lmh/p;

    move-result-object v1

    invoke-interface {v8}, LT/l;->o()Z

    move-result v7

    if-nez v7, :cond_33

    invoke-interface {v8}, LT/l;->f()Ljava/lang/Object;

    move-result-object v7

    invoke-static/range {v20 .. v20}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v7, v10}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_34

    :cond_33
    invoke-static/range {v20 .. v20}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v8, v7}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static/range {v20 .. v20}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v8, v7, v1}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_34
    invoke-virtual {v11}, LE0/g$a;->f()Lmh/p;

    move-result-object v1

    invoke-static {v8, v15, v1}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    shr-int/lit8 v1, v6, 0x1b

    and-int/lit8 v1, v1, 0xe

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v13, v9, v1}, Lmh/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v9, v2}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v1

    invoke-interface {v9, v0}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v7

    or-int/2addr v1, v7

    invoke-interface {v9}, LT/l;->f()Ljava/lang/Object;

    move-result-object v7

    if-nez v1, :cond_35

    invoke-virtual {v5}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v7, v1, :cond_36

    :cond_35
    new-instance v7, LN/m0$b;

    invoke-direct {v7, v2, v0}, LN/m0$b;-><init>(LN/n0;LIi/N;)V

    invoke-interface {v9, v7}, LT/l;->K(Ljava/lang/Object;)V

    :cond_36
    move-object v1, v7

    check-cast v1, Lmh/a;

    invoke-virtual {v2}, LN/n0;->d()LN/b;

    move-result-object v7

    invoke-virtual {v7}, LN/b;->x()Ljava/lang/Object;

    move-result-object v7

    sget-object v8, LN/o0;->Hidden:LN/o0;

    if-eq v7, v8, :cond_37

    const/4 v7, 0x1

    goto :goto_20

    :cond_37
    const/4 v7, 0x0

    :goto_20
    shr-int/lit8 v10, v6, 0x18

    and-int/lit8 v10, v10, 0xe

    move-wide/from16 p1, v28

    move-object/from16 p3, v1

    move/from16 p4, v7

    move-object/from16 p5, v9

    move/from16 p6, v10

    invoke-static/range {p1 .. p6}, LN/m0;->c(JLmh/a;ZLT/l;I)V

    invoke-interface {v9}, LT/l;->R()V

    invoke-virtual/range {v17 .. v17}, Lf0/c$a;->m()Lf0/c;

    move-result-object v1

    invoke-interface {v3, v4, v1}, Lz/d;->f(Landroidx/compose/ui/e;Lf0/c;)Landroidx/compose/ui/e;

    move-result-object v1

    sget v3, LN/m0;->c:F

    const/4 v7, 0x1

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-static {v1, v10, v3, v7, v11}, Landroidx/compose/foundation/layout/r;->B(Landroidx/compose/ui/e;FFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    invoke-static {v1, v10, v7, v11}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    if-eqz v12, :cond_3a

    const v3, -0x353a2b13    # -6482550.5f

    invoke-interface {v9, v3}, LT/l;->U(I)V

    invoke-virtual {v2}, LN/n0;->d()LN/b;

    move-result-object v3

    invoke-interface {v9, v3}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v3

    invoke-interface {v9}, LT/l;->f()Ljava/lang/Object;

    move-result-object v7

    if-nez v3, :cond_38

    invoke-virtual {v5}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v3

    if-ne v7, v3, :cond_39

    :cond_38
    invoke-virtual {v2}, LN/n0;->d()LN/b;

    move-result-object v3

    invoke-static {v3, v14}, LN/m0;->a(LN/b;Lw/q;)Lx0/a;

    move-result-object v7

    invoke-interface {v9, v7}, LT/l;->K(Ljava/lang/Object;)V

    :cond_39
    check-cast v7, Lx0/a;

    const/4 v3, 0x2

    const/4 v10, 0x0

    invoke-static {v4, v7, v10, v3, v10}, Landroidx/compose/ui/input/nestedscroll/a;->b(Landroidx/compose/ui/e;Lx0/a;Lx0/b;ILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v3

    invoke-interface {v9}, LT/l;->J()V

    goto :goto_21

    :cond_3a
    const v3, -0x9f96382

    invoke-interface {v9, v3}, LT/l;->U(I)V

    invoke-interface {v9}, LT/l;->J()V

    move-object v3, v4

    :goto_21
    invoke-interface {v1, v3}, Landroidx/compose/ui/e;->b0(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v1

    invoke-static {v1, v2}, LN/m0;->i(Landroidx/compose/ui/e;LN/n0;)Landroidx/compose/ui/e;

    move-result-object v1

    invoke-virtual {v2}, LN/n0;->d()LN/b;

    move-result-object v3

    if-eqz v12, :cond_3b

    invoke-virtual {v2}, LN/n0;->d()LN/b;

    move-result-object v7

    invoke-virtual {v7}, LN/b;->s()Ljava/lang/Object;

    move-result-object v7

    if-eq v7, v8, :cond_3b

    const/4 v7, 0x1

    goto :goto_22

    :cond_3b
    const/4 v7, 0x0

    :goto_22
    const/16 v8, 0x38

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v15, 0x0

    const/16 v17, 0x0

    move-object/from16 p1, v1

    move-object/from16 p2, v3

    move-object/from16 p3, v14

    move/from16 p4, v7

    move/from16 p5, v11

    move-object/from16 p6, v15

    move/from16 p7, v17

    move/from16 p8, v8

    move-object/from16 p9, v10

    invoke-static/range {p1 .. p9}, Landroidx/compose/material/a;->e(Landroidx/compose/ui/e;LN/b;Lw/q;ZZLy/m;ZILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    if-eqz v12, :cond_3e

    const v3, -0x352b5e89    # -6967483.5f

    invoke-interface {v9, v3}, LT/l;->U(I)V

    invoke-interface {v9, v2}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v3

    invoke-interface {v9, v0}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v7

    or-int/2addr v3, v7

    invoke-interface {v9}, LT/l;->f()Ljava/lang/Object;

    move-result-object v7

    if-nez v3, :cond_3c

    invoke-virtual {v5}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v3

    if-ne v7, v3, :cond_3d

    :cond_3c
    new-instance v7, LN/m0$c;

    invoke-direct {v7, v2, v0}, LN/m0$c;-><init>(LN/n0;LIi/N;)V

    invoke-interface {v9, v7}, LT/l;->K(Ljava/lang/Object;)V

    :cond_3d
    check-cast v7, Lmh/l;

    const/4 v0, 0x0

    const/4 v3, 0x1

    const/4 v5, 0x0

    invoke-static {v4, v0, v7, v3, v5}, LJ0/m;->c(Landroidx/compose/ui/e;ZLmh/l;ILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v4

    invoke-interface {v9}, LT/l;->J()V

    goto :goto_23

    :cond_3e
    const v0, -0x9f84002

    invoke-interface {v9, v0}, LT/l;->U(I)V

    invoke-interface {v9}, LT/l;->J()V

    :goto_23
    invoke-interface {v1, v4}, Landroidx/compose/ui/e;->b0(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v0

    new-instance v1, LN/m0$d;

    move-object/from16 v3, p0

    invoke-direct {v1, v3}, LN/m0$d;-><init>(Lmh/q;)V

    const/16 v4, 0x36

    const v5, 0x109734e

    const/4 v7, 0x1

    invoke-static {v5, v7, v1, v9, v4}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v24

    shr-int/lit8 v1, v6, 0x9

    and-int/lit8 v1, v1, 0x70

    or-int v1, v1, v16

    shr-int/lit8 v4, v6, 0xc

    and-int/lit16 v5, v4, 0x380

    or-int/2addr v1, v5

    and-int/lit16 v4, v4, 0x1c00

    or-int/2addr v1, v4

    const/high16 v4, 0x70000

    and-int/2addr v4, v6

    or-int v26, v1, v4

    const/16 v27, 0x10

    const/16 v22, 0x0

    move-object/from16 v16, v0

    move-object/from16 v17, v34

    move-wide/from16 v18, v32

    move-wide/from16 v20, v30

    move/from16 v23, p10

    move-object/from16 v25, v9

    invoke-static/range {v16 .. v27}, LN/O0;->a(Landroidx/compose/ui/e;Lm0/i1;JJLs/g;FLmh/p;LT/l;II)V

    invoke-interface {v9}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_3f

    invoke-static {}, LT/o;->P()V

    :cond_3f
    move/from16 v6, p10

    move-object v5, v2

    move v4, v12

    move-wide/from16 v10, v30

    move-wide/from16 v7, v32

    move-object/from16 v2, p11

    :goto_24
    invoke-interface {v9}, LT/l;->z()LT/X0;

    move-result-object v15

    if-eqz v15, :cond_40

    new-instance v14, LN/m0$e;

    move-object v0, v14

    move-object/from16 v1, p0

    move-object v3, v5

    move-object/from16 v5, v34

    move-wide v9, v10

    move-wide/from16 v11, v28

    move-object/from16 v13, p12

    move-object/from16 v35, v14

    move/from16 v14, p14

    move-object/from16 v36, v15

    move/from16 v15, p15

    invoke-direct/range {v0 .. v15}, LN/m0$e;-><init>(Lmh/q;Landroidx/compose/ui/e;LN/n0;ZLm0/i1;FJJJLmh/p;II)V

    move-object/from16 v1, v35

    move-object/from16 v0, v36

    invoke-interface {v0, v1}, LT/X0;->a(Lmh/p;)V

    :cond_40
    return-void
.end method

.method private static final c(JLmh/a;ZLT/l;I)V
    .locals 22

    move-wide/from16 v1, p0

    move-object/from16 v3, p2

    move/from16 v4, p3

    move/from16 v5, p5

    const v0, -0x1f62403c

    move-object/from16 v6, p4

    invoke-interface {v6, v0}, LT/l;->r(I)LT/l;

    move-result-object v14

    and-int/lit8 v6, v5, 0x6

    if-nez v6, :cond_1

    invoke-interface {v14, v1, v2}, LT/l;->j(J)Z

    move-result v6

    if-eqz v6, :cond_0

    const/4 v6, 0x4

    goto :goto_0

    :cond_0
    const/4 v6, 0x2

    :goto_0
    or-int/2addr v6, v5

    goto :goto_1

    :cond_1
    move v6, v5

    :goto_1
    and-int/lit8 v7, v5, 0x30

    const/16 v13, 0x20

    if-nez v7, :cond_3

    invoke-interface {v14, v3}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_2

    move v7, v13

    goto :goto_2

    :cond_2
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v6, v7

    :cond_3
    and-int/lit16 v7, v5, 0x180

    if-nez v7, :cond_5

    invoke-interface {v14, v4}, LT/l;->c(Z)Z

    move-result v7

    if-eqz v7, :cond_4

    const/16 v7, 0x100

    goto :goto_3

    :cond_4
    const/16 v7, 0x80

    :goto_3
    or-int/2addr v6, v7

    :cond_5
    move v12, v6

    and-int/lit16 v6, v12, 0x93

    const/16 v7, 0x92

    if-ne v6, v7, :cond_7

    invoke-interface {v14}, LT/l;->v()Z

    move-result v6

    if-nez v6, :cond_6

    goto :goto_4

    :cond_6
    invoke-interface {v14}, LT/l;->C()V

    goto/16 :goto_b

    :cond_7
    :goto_4
    invoke-static {}, LT/o;->H()Z

    move-result v6

    if-eqz v6, :cond_8

    const/4 v6, -0x1

    const-string v7, "androidx.compose.material.Scrim (ModalBottomSheet.kt:496)"

    invoke-static {v0, v12, v6, v7}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_8
    const-wide/16 v6, 0x10

    cmp-long v0, v1, v6

    if-eqz v0, :cond_14

    const v0, 0x1c72cbb1

    invoke-interface {v14, v0}, LT/l;->U(I)V

    const/4 v0, 0x0

    if-eqz v4, :cond_9

    const/high16 v6, 0x3f800000    # 1.0f

    goto :goto_5

    :cond_9
    move v6, v0

    :goto_5
    new-instance v7, Lr/r0;

    const/16 v20, 0x7

    const/16 v21, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    move-object/from16 v16, v7

    invoke-direct/range {v16 .. v21}, Lr/r0;-><init>(IILr/E;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v16, 0x30

    const/16 v17, 0x1c

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v11, v14

    move/from16 v18, v12

    move/from16 v12, v16

    move v15, v13

    move/from16 v13, v17

    invoke-static/range {v6 .. v13}, Lr/c;->d(FLr/i;FLjava/lang/String;Lmh/l;LT/l;II)LT/z1;

    move-result-object v6

    sget-object v7, LN/M0;->a:LN/M0$a;

    invoke-virtual {v7}, LN/M0$a;->b()I

    move-result v7

    const/4 v8, 0x6

    invoke-static {v7, v14, v8}, LN/N0;->a(ILT/l;I)Ljava/lang/String;

    move-result-object v7

    const/4 v8, 0x0

    const/4 v10, 0x1

    if-eqz v4, :cond_10

    const v11, 0x1c7640a5

    invoke-interface {v14, v11}, LT/l;->U(I)V

    sget-object v11, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    and-int/lit8 v12, v18, 0x70

    if-ne v12, v15, :cond_a

    move v13, v10

    goto :goto_6

    :cond_a
    const/4 v13, 0x0

    :goto_6
    invoke-interface {v14}, LT/l;->f()Ljava/lang/Object;

    move-result-object v9

    if-nez v13, :cond_b

    sget-object v13, LT/l;->a:LT/l$a;

    invoke-virtual {v13}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v13

    if-ne v9, v13, :cond_c

    :cond_b
    new-instance v9, LN/m0$h;

    invoke-direct {v9, v3, v8}, LN/m0$h;-><init>(Lmh/a;Ldh/e;)V

    invoke-interface {v14, v9}, LT/l;->K(Ljava/lang/Object;)V

    :cond_c
    check-cast v9, Lmh/p;

    invoke-static {v11, v3, v9}, Ly0/P;->d(Landroidx/compose/ui/e;Ljava/lang/Object;Lmh/p;)Landroidx/compose/ui/e;

    move-result-object v9

    invoke-interface {v14, v7}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v11

    if-ne v12, v15, :cond_d

    move v12, v10

    goto :goto_7

    :cond_d
    const/4 v12, 0x0

    :goto_7
    or-int/2addr v11, v12

    invoke-interface {v14}, LT/l;->f()Ljava/lang/Object;

    move-result-object v12

    if-nez v11, :cond_e

    sget-object v11, LT/l;->a:LT/l$a;

    invoke-virtual {v11}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v11

    if-ne v12, v11, :cond_f

    :cond_e
    new-instance v12, LN/m0$i;

    invoke-direct {v12, v7, v3}, LN/m0$i;-><init>(Ljava/lang/String;Lmh/a;)V

    invoke-interface {v14, v12}, LT/l;->K(Ljava/lang/Object;)V

    :cond_f
    check-cast v12, Lmh/l;

    invoke-static {v9, v10, v12}, LJ0/m;->b(Landroidx/compose/ui/e;ZLmh/l;)Landroidx/compose/ui/e;

    move-result-object v7

    invoke-interface {v14}, LT/l;->J()V

    goto :goto_8

    :cond_10
    const v7, 0x1c7a89a2

    invoke-interface {v14, v7}, LT/l;->U(I)V

    invoke-interface {v14}, LT/l;->J()V

    sget-object v7, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    :goto_8
    sget-object v9, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    invoke-static {v9, v0, v10, v8}, Landroidx/compose/foundation/layout/r;->f(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v0

    invoke-interface {v0, v7}, Landroidx/compose/ui/e;->b0(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v0

    and-int/lit8 v7, v18, 0xe

    const/4 v8, 0x4

    if-ne v7, v8, :cond_11

    goto :goto_9

    :cond_11
    const/4 v10, 0x0

    :goto_9
    invoke-interface {v14, v6}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v7

    or-int/2addr v7, v10

    invoke-interface {v14}, LT/l;->f()Ljava/lang/Object;

    move-result-object v8

    if-nez v7, :cond_12

    sget-object v7, LT/l;->a:LT/l$a;

    invoke-virtual {v7}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v7

    if-ne v8, v7, :cond_13

    :cond_12
    new-instance v8, LN/m0$f;

    invoke-direct {v8, v1, v2, v6}, LN/m0$f;-><init>(JLT/z1;)V

    invoke-interface {v14, v8}, LT/l;->K(Ljava/lang/Object;)V

    :cond_13
    check-cast v8, Lmh/l;

    const/4 v6, 0x0

    invoke-static {v0, v8, v14, v6}, Ls/i;->a(Landroidx/compose/ui/e;Lmh/l;LT/l;I)V

    invoke-interface {v14}, LT/l;->J()V

    goto :goto_a

    :cond_14
    const v0, 0x1c7dd662

    invoke-interface {v14, v0}, LT/l;->U(I)V

    invoke-interface {v14}, LT/l;->J()V

    :goto_a
    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_15

    invoke-static {}, LT/o;->P()V

    :cond_15
    :goto_b
    invoke-interface {v14}, LT/l;->z()LT/X0;

    move-result-object v6

    if-eqz v6, :cond_16

    new-instance v7, LN/m0$g;

    move-object v0, v7

    move-wide/from16 v1, p0

    move-object/from16 v3, p2

    move/from16 v4, p3

    move/from16 v5, p5

    invoke-direct/range {v0 .. v5}, LN/m0$g;-><init>(JLmh/a;ZI)V

    invoke-interface {v6, v7}, LT/X0;->a(Lmh/p;)V

    :cond_16
    return-void
.end method

.method private static final d(LT/z1;)F
    .locals 0

    invoke-interface {p0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    move-result p0

    return p0
.end method

.method public static final synthetic e(JLmh/a;ZLT/l;I)V
    .locals 0

    invoke-static/range {p0 .. p5}, LN/m0;->c(JLmh/a;ZLT/l;I)V

    return-void
.end method

.method public static final synthetic f(LT/z1;)F
    .locals 0

    invoke-static {p0}, LN/m0;->d(LT/z1;)F

    move-result p0

    return p0
.end method

.method public static final synthetic g()F
    .locals 1

    sget v0, LN/m0;->a:F

    return v0
.end method

.method public static final synthetic h()F
    .locals 1

    sget v0, LN/m0;->b:F

    return v0
.end method

.method private static final i(Landroidx/compose/ui/e;LN/n0;)Landroidx/compose/ui/e;
    .locals 3

    invoke-virtual {p1}, LN/n0;->d()LN/b;

    move-result-object v0

    sget-object v1, Lw/q;->Vertical:Lw/q;

    new-instance v2, LN/m0$j;

    invoke-direct {v2, p1}, LN/m0$j;-><init>(LN/n0;)V

    invoke-static {p0, v0, v1, v2}, Landroidx/compose/material/a;->h(Landroidx/compose/ui/e;LN/b;Lw/q;Lmh/p;)Landroidx/compose/ui/e;

    move-result-object p0

    return-object p0
.end method

.method public static final j(LN/o0;Lr/i;Lmh/l;ZLT/l;II)LN/n0;
    .locals 14

    move-object v1, p0

    move-object/from16 v7, p4

    move/from16 v0, p5

    and-int/lit8 v2, p6, 0x2

    if-eqz v2, :cond_0

    sget-object v2, LN/l0;->a:LN/l0;

    invoke-virtual {v2}, LN/l0;->a()Lr/i;

    move-result-object v2

    move-object v4, v2

    goto :goto_0

    :cond_0
    move-object v4, p1

    :goto_0
    and-int/lit8 v2, p6, 0x4

    if-eqz v2, :cond_1

    sget-object v2, LN/m0$k;->a:LN/m0$k;

    move-object v3, v2

    goto :goto_1

    :cond_1
    move-object/from16 v3, p2

    :goto_1
    and-int/lit8 v2, p6, 0x8

    const/4 v5, 0x0

    if-eqz v2, :cond_2

    move v6, v5

    goto :goto_2

    :cond_2
    move/from16 v6, p3

    :goto_2
    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_3

    const/4 v2, -0x1

    const-string v8, "androidx.compose.material.rememberModalBottomSheetState (ModalBottomSheet.kt:291)"

    const v9, -0x788e558

    invoke-static {v9, v0, v2, v8}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_3
    invoke-static {}, Landroidx/compose/ui/platform/k0;->g()LT/H0;

    move-result-object v2

    invoke-interface {v7, v2}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LY0/d;

    const v8, 0x3a3374bf

    invoke-interface {v7, v8, p0}, LT/l;->s(ILjava/lang/Object;)V

    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v8

    filled-new-array {p0, v4, v8, v3, v2}, [Ljava/lang/Object;

    move-result-object v8

    sget-object v9, LN/n0;->d:LN/n0$a;

    invoke-virtual {v9, v4, v3, v6, v2}, LN/n0$a;->a(Lr/i;Lmh/l;ZLY0/d;)Lc0/k;

    move-result-object v9

    and-int/lit8 v10, v0, 0xe

    xor-int/lit8 v10, v10, 0x6

    const/4 v11, 0x1

    const/4 v12, 0x4

    if-le v10, v12, :cond_4

    invoke-interface {v7, p0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_5

    :cond_4
    and-int/lit8 v10, v0, 0x6

    if-ne v10, v12, :cond_6

    :cond_5
    move v10, v11

    goto :goto_3

    :cond_6
    move v10, v5

    :goto_3
    invoke-interface {v7, v2}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v12

    or-int/2addr v10, v12

    and-int/lit16 v12, v0, 0x380

    xor-int/lit16 v12, v12, 0x180

    const/16 v13, 0x100

    if-le v12, v13, :cond_7

    invoke-interface {v7, v3}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_8

    :cond_7
    and-int/lit16 v12, v0, 0x180

    if-ne v12, v13, :cond_9

    :cond_8
    move v12, v11

    goto :goto_4

    :cond_9
    move v12, v5

    :goto_4
    or-int/2addr v10, v12

    invoke-interface {v7, v4}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v12

    or-int/2addr v10, v12

    and-int/lit16 v12, v0, 0x1c00

    xor-int/lit16 v12, v12, 0xc00

    const/16 v13, 0x800

    if-le v12, v13, :cond_a

    invoke-interface {v7, v6}, LT/l;->c(Z)Z

    move-result v12

    if-nez v12, :cond_b

    :cond_a
    and-int/lit16 v0, v0, 0xc00

    if-ne v0, v13, :cond_c

    :cond_b
    move v5, v11

    :cond_c
    or-int v0, v10, v5

    invoke-interface/range {p4 .. p4}, LT/l;->f()Ljava/lang/Object;

    move-result-object v5

    if-nez v0, :cond_d

    sget-object v0, LT/l;->a:LT/l$a;

    invoke-virtual {v0}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v5, v0, :cond_e

    :cond_d
    new-instance v10, LN/m0$l;

    move-object v0, v10

    move-object v1, p0

    move v5, v6

    invoke-direct/range {v0 .. v5}, LN/m0$l;-><init>(LN/o0;LY0/d;Lmh/l;Lr/i;Z)V

    invoke-interface {v7, v10}, LT/l;->K(Ljava/lang/Object;)V

    move-object v5, v10

    :cond_e
    move-object v3, v5

    check-cast v3, Lmh/a;

    const/4 v5, 0x0

    const/4 v6, 0x4

    const/4 v2, 0x0

    move-object v0, v8

    move-object v1, v9

    move-object/from16 v4, p4

    invoke-static/range {v0 .. v6}, Lc0/c;->e([Ljava/lang/Object;Lc0/k;Ljava/lang/String;Lmh/a;LT/l;II)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LN/n0;

    invoke-interface/range {p4 .. p4}, LT/l;->N()V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_f

    invoke-static {}, LT/o;->P()V

    :cond_f
    return-object v0
.end method
