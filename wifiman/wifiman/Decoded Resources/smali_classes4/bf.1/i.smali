.class public abstract Lbf/i;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lbf/i$b;
    }
.end annotation


# direct methods
.method public static synthetic a(Landroidx/compose/ui/e;IILT/l;I)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lbf/i;->d(Landroidx/compose/ui/e;IILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroidx/compose/ui/e;Lbf/e;ZLbf/a;Lmh/l;IILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p8}, Lbf/i;->f(Landroidx/compose/ui/e;Lbf/e;ZLbf/a;Lmh/l;IILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Landroidx/compose/ui/e;LT/l;II)V
    .locals 19

    move/from16 v0, p2

    move/from16 v1, p3

    const v2, 0x66a6d743

    move-object/from16 v3, p1

    invoke-interface {v3, v2}, LT/l;->r(I)LT/l;

    move-result-object v3

    const/4 v4, 0x1

    and-int/lit8 v5, v1, 0x1

    const/4 v6, 0x2

    if-eqz v5, :cond_0

    or-int/lit8 v7, v0, 0x6

    move v8, v7

    move-object/from16 v7, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v7, v0, 0x6

    if-nez v7, :cond_2

    move-object/from16 v7, p0

    invoke-interface {v3, v7}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_1

    const/4 v8, 0x4

    goto :goto_0

    :cond_1
    move v8, v6

    :goto_0
    or-int/2addr v8, v0

    goto :goto_1

    :cond_2
    move-object/from16 v7, p0

    move v8, v0

    :goto_1
    and-int/lit8 v9, v8, 0x3

    if-ne v9, v6, :cond_4

    invoke-interface {v3}, LT/l;->v()Z

    move-result v6

    if-nez v6, :cond_3

    goto :goto_2

    :cond_3
    invoke-interface {v3}, LT/l;->C()V

    move-object v5, v7

    goto/16 :goto_5

    :cond_4
    :goto_2
    if-eqz v5, :cond_5

    sget-object v5, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    goto :goto_3

    :cond_5
    move-object v5, v7

    :goto_3
    invoke-static {}, LT/o;->H()Z

    move-result v6

    if-eqz v6, :cond_6

    const/4 v6, -0x1

    const-string v7, "com.ui.wifiman.ui.speed.hosts.NetworkHostlistDivider (NetworkHostListItem.kt:192)"

    invoke-static {v2, v8, v6, v7}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_6
    int-to-float v2, v4

    invoke-static {v2}, LY0/h;->j(F)F

    move-result v2

    invoke-static {v5, v2}, Landroidx/compose/foundation/layout/r;->i(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v6

    const/16 v2, 0x38

    int-to-float v2, v2

    invoke-static {v2}, LY0/h;->j(F)F

    move-result v7

    const/16 v11, 0xe

    const/4 v12, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static/range {v6 .. v12}, Landroidx/compose/foundation/layout/o;->m(Landroidx/compose/ui/e;FFFFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v13

    sget-object v2, Lla/a;->a:Lla/a;

    sget v4, Lla/a;->b:I

    invoke-virtual {v2, v3, v4}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v2

    invoke-virtual {v2}, Lma/a;->a()Lma/a$a;

    move-result-object v2

    invoke-virtual {v2}, Lma/a$a;->g()Lr9/a$b;

    move-result-object v2

    invoke-virtual {v2}, Lr9/a$b;->e()J

    move-result-wide v14

    const/16 v17, 0x2

    const/16 v18, 0x0

    const/16 v16, 0x0

    invoke-static/range {v13 .. v18}, Landroidx/compose/foundation/b;->d(Landroidx/compose/ui/e;JLm0/i1;ILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v2

    sget-object v4, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v4}, Lf0/c$a;->o()Lf0/c;

    move-result-object v4

    const/4 v6, 0x0

    invoke-static {v4, v6}, Landroidx/compose/foundation/layout/d;->h(Lf0/c;Z)LC0/C;

    move-result-object v4

    invoke-static {v3, v6}, LT/j;->a(LT/l;I)I

    move-result v6

    invoke-interface {v3}, LT/l;->G()LT/x;

    move-result-object v7

    invoke-static {v3, v2}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v2

    sget-object v8, LE0/g;->K:LE0/g$a;

    invoke-virtual {v8}, LE0/g$a;->a()Lmh/a;

    move-result-object v9

    invoke-interface {v3}, LT/l;->x()LT/f;

    move-result-object v10

    if-nez v10, :cond_7

    invoke-static {}, LT/j;->c()V

    :cond_7
    invoke-interface {v3}, LT/l;->u()V

    invoke-interface {v3}, LT/l;->o()Z

    move-result v10

    if-eqz v10, :cond_8

    invoke-interface {v3, v9}, LT/l;->D(Lmh/a;)V

    goto :goto_4

    :cond_8
    invoke-interface {v3}, LT/l;->I()V

    :goto_4
    invoke-static {v3}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v9

    invoke-virtual {v8}, LE0/g$a;->e()Lmh/p;

    move-result-object v10

    invoke-static {v9, v4, v10}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v8}, LE0/g$a;->g()Lmh/p;

    move-result-object v4

    invoke-static {v9, v7, v4}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v8}, LE0/g$a;->b()Lmh/p;

    move-result-object v4

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

    invoke-interface {v9, v6, v4}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_a
    invoke-virtual {v8}, LE0/g$a;->f()Lmh/p;

    move-result-object v4

    invoke-static {v9, v2, v4}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v2, Landroidx/compose/foundation/layout/f;->a:Landroidx/compose/foundation/layout/f;

    invoke-interface {v3}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_b

    invoke-static {}, LT/o;->P()V

    :cond_b
    :goto_5
    invoke-interface {v3}, LT/l;->z()LT/X0;

    move-result-object v2

    if-eqz v2, :cond_c

    new-instance v3, Lbf/g;

    invoke-direct {v3, v5, v0, v1}, Lbf/g;-><init>(Landroidx/compose/ui/e;II)V

    invoke-interface {v2, v3}, LT/X0;->a(Lmh/p;)V

    :cond_c
    return-void
.end method

.method private static final d(Landroidx/compose/ui/e;IILT/l;I)LYg/J;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, LT/L0;->a(I)I

    move-result p1

    invoke-static {p0, p3, p1, p2}, Lbf/i;->c(Landroidx/compose/ui/e;LT/l;II)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method public static final e(Landroidx/compose/ui/e;Lbf/e;ZLbf/a;Lmh/l;LT/l;II)V
    .locals 22

    move-object/from16 v2, p1

    move-object/from16 v5, p4

    move/from16 v6, p6

    const-string v0, "model"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onDeleteClicked"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x44ee0d1b

    move-object/from16 v1, p5

    invoke-interface {v1, v0}, LT/l;->r(I)LT/l;

    move-result-object v1

    and-int/lit8 v3, p7, 0x1

    const/4 v4, 0x2

    const/4 v7, 0x4

    if-eqz v3, :cond_0

    or-int/lit8 v8, v6, 0x6

    move v9, v8

    move-object/from16 v8, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v8, v6, 0x6

    if-nez v8, :cond_2

    move-object/from16 v8, p0

    invoke-interface {v1, v8}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1

    move v9, v7

    goto :goto_0

    :cond_1
    move v9, v4

    :goto_0
    or-int/2addr v9, v6

    goto :goto_1

    :cond_2
    move-object/from16 v8, p0

    move v9, v6

    :goto_1
    and-int/lit8 v10, p7, 0x2

    if-eqz v10, :cond_3

    or-int/lit8 v9, v9, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v10, v6, 0x30

    if-nez v10, :cond_5

    invoke-interface {v1, v2}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_4

    const/16 v10, 0x20

    goto :goto_2

    :cond_4
    const/16 v10, 0x10

    :goto_2
    or-int/2addr v9, v10

    :cond_5
    :goto_3
    and-int/lit8 v10, p7, 0x4

    if-eqz v10, :cond_7

    or-int/lit16 v9, v9, 0x180

    :cond_6
    move/from16 v11, p2

    goto :goto_5

    :cond_7
    and-int/lit16 v11, v6, 0x180

    if-nez v11, :cond_6

    move/from16 v11, p2

    invoke-interface {v1, v11}, LT/l;->c(Z)Z

    move-result v12

    if-eqz v12, :cond_8

    const/16 v12, 0x100

    goto :goto_4

    :cond_8
    const/16 v12, 0x80

    :goto_4
    or-int/2addr v9, v12

    :goto_5
    and-int/lit8 v12, p7, 0x8

    if-eqz v12, :cond_a

    or-int/lit16 v9, v9, 0xc00

    :cond_9
    move-object/from16 v13, p3

    goto :goto_7

    :cond_a
    and-int/lit16 v13, v6, 0xc00

    if-nez v13, :cond_9

    move-object/from16 v13, p3

    invoke-interface {v1, v13}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_b

    const/16 v14, 0x800

    goto :goto_6

    :cond_b
    const/16 v14, 0x400

    :goto_6
    or-int/2addr v9, v14

    :goto_7
    and-int/lit8 v14, p7, 0x10

    if-eqz v14, :cond_c

    or-int/lit16 v9, v9, 0x6000

    goto :goto_9

    :cond_c
    and-int/lit16 v14, v6, 0x6000

    if-nez v14, :cond_e

    invoke-interface {v1, v5}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_d

    const/16 v14, 0x4000

    goto :goto_8

    :cond_d
    const/16 v14, 0x2000

    :goto_8
    or-int/2addr v9, v14

    :cond_e
    :goto_9
    and-int/lit16 v14, v9, 0x2493

    const/16 v15, 0x2492

    if-ne v14, v15, :cond_10

    invoke-interface {v1}, LT/l;->v()Z

    move-result v14

    if-nez v14, :cond_f

    goto :goto_a

    :cond_f
    invoke-interface {v1}, LT/l;->C()V

    move v3, v11

    move-object v4, v13

    goto/16 :goto_10

    :cond_10
    :goto_a
    if-eqz v3, :cond_11

    sget-object v3, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    goto :goto_b

    :cond_11
    move-object v3, v8

    :goto_b
    if-eqz v10, :cond_12

    const/4 v15, 0x0

    goto :goto_c

    :cond_12
    move v15, v11

    :goto_c
    if-eqz v12, :cond_13

    sget-object v10, Lbf/a;->ON_LIST_TOP_BOTTOM:Lbf/a;

    move-object v14, v10

    goto :goto_d

    :cond_13
    move-object v14, v13

    :goto_d
    invoke-static {}, LT/o;->H()Z

    move-result v10

    if-eqz v10, :cond_14

    const/4 v10, -0x1

    const-string v11, "com.ui.wifiman.ui.speed.hosts.NetworkHostlistItem (NetworkHostListItem.kt:71)"

    invoke-static {v0, v9, v10, v11}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_14
    sget-object v0, Lla/a;->a:Lla/a;

    sget v10, Lla/a;->b:I

    invoke-virtual {v0, v1, v10}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v11

    invoke-virtual {v11}, Lma/a;->e()Lma/a$e;

    move-result-object v11

    invoke-virtual {v11}, Lma/a$e;->b()J

    move-result-wide v11

    sget-object v13, Lbf/i$b;->a:[I

    invoke-virtual {v14}, Ljava/lang/Enum;->ordinal()I

    move-result v16

    aget v13, v13, v16

    const/4 v8, 0x1

    if-eq v13, v8, :cond_19

    if-eq v13, v4, :cond_18

    const/4 v4, 0x3

    if-eq v13, v4, :cond_17

    if-eq v13, v7, :cond_16

    const/4 v0, 0x5

    if-ne v13, v0, :cond_15

    goto :goto_e

    :cond_15
    const v0, -0x58291f13

    invoke-interface {v1, v0}, LT/l;->U(I)V

    invoke-interface {v1}, LT/l;->J()V

    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_16
    :goto_e
    const v0, -0x5828deef

    invoke-interface {v1, v0}, LT/l;->U(I)V

    invoke-interface {v1}, LT/l;->J()V

    const/4 v0, 0x0

    int-to-float v0, v0

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v0

    invoke-static {v0}, LE/h;->d(F)LE/g;

    move-result-object v0

    goto :goto_f

    :cond_17
    const v4, -0x5828e8e3

    invoke-interface {v1, v4}, LT/l;->U(I)V

    invoke-virtual {v0, v1, v10}, Lla/a;->b(LT/l;I)Loa/a;

    move-result-object v0

    invoke-virtual {v0}, Loa/a;->a()LE/a;

    move-result-object v0

    invoke-interface {v1}, LT/l;->J()V

    goto :goto_f

    :cond_18
    const v4, 0x5308b3f6

    invoke-interface {v1, v4}, LT/l;->U(I)V

    invoke-virtual {v0, v1, v10}, Lla/a;->b(LT/l;I)Loa/a;

    move-result-object v4

    invoke-virtual {v4}, Loa/a;->b()Loa/a$a;

    move-result-object v4

    invoke-virtual {v4}, Loa/a$a;->a()F

    move-result v19

    invoke-virtual {v0, v1, v10}, Lla/a;->b(LT/l;I)Loa/a;

    move-result-object v0

    invoke-virtual {v0}, Loa/a;->b()Loa/a$a;

    move-result-object v0

    invoke-virtual {v0}, Loa/a$a;->a()F

    move-result v18

    const/16 v20, 0x3

    const/16 v21, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-static/range {v16 .. v21}, LE/h;->f(FFFFILjava/lang/Object;)LE/g;

    move-result-object v0

    invoke-interface {v1}, LT/l;->J()V

    goto :goto_f

    :cond_19
    const v4, -0x5829197a

    invoke-interface {v1, v4}, LT/l;->U(I)V

    invoke-virtual {v0, v1, v10}, Lla/a;->b(LT/l;I)Loa/a;

    move-result-object v4

    invoke-virtual {v4}, Loa/a;->b()Loa/a$a;

    move-result-object v4

    invoke-virtual {v4}, Loa/a$a;->a()F

    move-result v16

    invoke-virtual {v0, v1, v10}, Lla/a;->b(LT/l;I)Loa/a;

    move-result-object v0

    invoke-virtual {v0}, Loa/a;->b()Loa/a$a;

    move-result-object v0

    invoke-virtual {v0}, Loa/a$a;->a()F

    move-result v17

    const/16 v20, 0xc

    const/16 v21, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-static/range {v16 .. v21}, LE/h;->f(FFFFILjava/lang/Object;)LE/g;

    move-result-object v0

    invoke-interface {v1}, LT/l;->J()V

    :goto_f
    new-instance v4, Lbf/i$a;

    invoke-direct {v4, v14, v15, v2, v5}, Lbf/i$a;-><init>(Lbf/a;ZLbf/e;Lmh/l;)V

    const/16 v7, 0x36

    const v10, 0x7daf675f

    invoke-static {v10, v8, v4, v1, v7}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v4

    and-int/lit8 v7, v9, 0xe

    const/high16 v8, 0x180000

    or-int v17, v7, v8

    const/16 v18, 0x38

    const-wide/16 v19, 0x0

    const/4 v13, 0x0

    const/16 v16, 0x0

    move-object v7, v3

    move-object v8, v0

    move-wide v9, v11

    move-wide/from16 v11, v19

    move-object v0, v14

    move/from16 v14, v16

    move/from16 v19, v15

    move-object v15, v4

    move-object/from16 v16, v1

    invoke-static/range {v7 .. v18}, LN/O0;->a(Landroidx/compose/ui/e;Lm0/i1;JJLs/g;FLmh/p;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result v4

    if-eqz v4, :cond_1a

    invoke-static {}, LT/o;->P()V

    :cond_1a
    move-object v4, v0

    move-object v8, v3

    move/from16 v3, v19

    :goto_10
    invoke-interface {v1}, LT/l;->z()LT/X0;

    move-result-object v9

    if-eqz v9, :cond_1b

    new-instance v10, Lbf/f;

    move-object v0, v10

    move-object v1, v8

    move-object/from16 v2, p1

    move-object/from16 v5, p4

    move/from16 v6, p6

    move/from16 v7, p7

    invoke-direct/range {v0 .. v7}, Lbf/f;-><init>(Landroidx/compose/ui/e;Lbf/e;ZLbf/a;Lmh/l;II)V

    invoke-interface {v9, v10}, LT/X0;->a(Lmh/p;)V

    :cond_1b
    return-void
.end method

.method private static final f(Landroidx/compose/ui/e;Lbf/e;ZLbf/a;Lmh/l;IILT/l;I)LYg/J;
    .locals 9

    or-int/lit8 v0, p5, 0x1

    invoke-static {v0}, LT/L0;->a(I)I

    move-result v7

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object/from16 v6, p7

    move v8, p6

    invoke-static/range {v1 .. v8}, Lbf/i;->e(Landroidx/compose/ui/e;Lbf/e;ZLbf/a;Lmh/l;LT/l;II)V

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method

.method public static final synthetic g(Landroidx/compose/ui/e;LT/l;II)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lbf/i;->c(Landroidx/compose/ui/e;LT/l;II)V

    return-void
.end method

.method public static final h(Ljava/lang/String;Ls9/a;Ls9/d;Ls9/d;ZLb8/b;)Lbf/e;
    .locals 9

    const-string v0, "id"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "icon"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "title"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "subtitle"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lbf/e;

    const/4 v8, 0x1

    move-object v1, v0

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move v6, p4

    move-object v7, p5

    invoke-direct/range {v1 .. v8}, Lbf/e;-><init>(Ljava/lang/String;Ls9/a;Ls9/d;Ls9/d;ZLb8/b;Z)V

    return-object v0
.end method

.method public static synthetic i(Ljava/lang/String;Ls9/a;Ls9/d;Ls9/d;ZLb8/b;ILjava/lang/Object;)Lbf/e;
    .locals 3

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    const-string p0, ""

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    new-instance p1, Ls9/c$a;

    sget p7, Lm8/a;->z0:I

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-direct {p1, p7, v0, v1, v0}, Ls9/c$a;-><init>(ILs9/d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :cond_1
    move-object p7, p1

    and-int/lit8 p1, p6, 0x4

    if-eqz p1, :cond_2

    new-instance p2, Ls9/d$c;

    const-string p1, "google.com"

    invoke-direct {p2, p1}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    :cond_2
    move-object v0, p2

    and-int/lit8 p1, p6, 0x8

    if-eqz p1, :cond_3

    new-instance p3, Ls9/d$c;

    const-string p1, "177.156.452.215"

    invoke-direct {p3, p1}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    :cond_3
    move-object v1, p3

    and-int/lit8 p1, p6, 0x10

    if-eqz p1, :cond_4

    const/4 p4, 0x1

    :cond_4
    move v2, p4

    and-int/lit8 p1, p6, 0x20

    if-eqz p1, :cond_5

    sget-object p1, Lb8/b;->a:Lb8/b$b;

    const/16 p2, 0x14

    invoke-virtual {p1, p2}, Lb8/b$b;->a(I)Lb8/b;

    move-result-object p5

    :cond_5
    move-object p6, p5

    move-object p1, p0

    move-object p2, p7

    move-object p3, v0

    move-object p4, v1

    move p5, v2

    invoke-static/range {p1 .. p6}, Lbf/i;->h(Ljava/lang/String;Ls9/a;Ls9/d;Ls9/d;ZLb8/b;)Lbf/e;

    move-result-object p0

    return-object p0
.end method
