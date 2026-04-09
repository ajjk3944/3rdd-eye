.class public abstract Lq9/f;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Landroidx/compose/ui/e;Ls9/c;Ls9/a$b;FLs/g;IILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p8}, Lq9/f;->e(Landroidx/compose/ui/e;Ls9/c;Ls9/a$b;FLs/g;IILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroidx/compose/ui/graphics/c;)LYg/J;
    .locals 0

    invoke-static {p0}, Lq9/f;->d(Landroidx/compose/ui/graphics/c;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Landroidx/compose/ui/e;Ls9/c;Ls9/a$b;FLs/g;LT/l;II)V
    .locals 20

    move-object/from16 v12, p1

    move-object/from16 v13, p2

    move/from16 v14, p3

    move/from16 v15, p6

    const-string/jumbo v0, "image"

    invoke-static {v12, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "placeholder"

    invoke-static {v13, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x79fb2895

    move-object/from16 v1, p5

    invoke-interface {v1, v0}, LT/l;->r(I)LT/l;

    move-result-object v11

    and-int/lit8 v1, p7, 0x1

    if-eqz v1, :cond_0

    or-int/lit8 v2, v15, 0x6

    move v3, v2

    move-object/from16 v2, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v2, v15, 0x6

    if-nez v2, :cond_2

    move-object/from16 v2, p0

    invoke-interface {v11, v2}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 v3, 0x4

    goto :goto_0

    :cond_1
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v3, v15

    goto :goto_1

    :cond_2
    move-object/from16 v2, p0

    move v3, v15

    :goto_1
    and-int/lit8 v4, p7, 0x2

    if-eqz v4, :cond_3

    or-int/lit8 v3, v3, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v4, v15, 0x30

    if-nez v4, :cond_5

    invoke-interface {v11, v12}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    const/16 v4, 0x20

    goto :goto_2

    :cond_4
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v3, v4

    :cond_5
    :goto_3
    and-int/lit8 v4, p7, 0x4

    if-eqz v4, :cond_6

    or-int/lit16 v3, v3, 0x180

    goto :goto_5

    :cond_6
    and-int/lit16 v4, v15, 0x180

    if-nez v4, :cond_8

    invoke-interface {v11, v13}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_7

    const/16 v4, 0x100

    goto :goto_4

    :cond_7
    const/16 v4, 0x80

    :goto_4
    or-int/2addr v3, v4

    :cond_8
    :goto_5
    and-int/lit8 v4, p7, 0x8

    if-eqz v4, :cond_9

    or-int/lit16 v3, v3, 0xc00

    goto :goto_7

    :cond_9
    and-int/lit16 v4, v15, 0xc00

    if-nez v4, :cond_b

    invoke-interface {v11, v14}, LT/l;->g(F)Z

    move-result v4

    if-eqz v4, :cond_a

    const/16 v4, 0x800

    goto :goto_6

    :cond_a
    const/16 v4, 0x400

    :goto_6
    or-int/2addr v3, v4

    :cond_b
    :goto_7
    and-int/lit8 v4, p7, 0x10

    if-eqz v4, :cond_d

    or-int/lit16 v3, v3, 0x6000

    :cond_c
    move-object/from16 v5, p4

    goto :goto_9

    :cond_d
    and-int/lit16 v5, v15, 0x6000

    if-nez v5, :cond_c

    move-object/from16 v5, p4

    invoke-interface {v11, v5}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_e

    const/16 v6, 0x4000

    goto :goto_8

    :cond_e
    const/16 v6, 0x2000

    :goto_8
    or-int/2addr v3, v6

    :goto_9
    and-int/lit16 v6, v3, 0x2493

    const/16 v7, 0x2492

    if-ne v6, v7, :cond_10

    invoke-interface {v11}, LT/l;->v()Z

    move-result v6

    if-nez v6, :cond_f

    goto :goto_a

    :cond_f
    invoke-interface {v11}, LT/l;->C()V

    move-object v1, v2

    move-object/from16 v16, v11

    goto/16 :goto_e

    :cond_10
    :goto_a
    if-eqz v1, :cond_11

    sget-object v1, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    move-object v10, v1

    goto :goto_b

    :cond_11
    move-object v10, v2

    :goto_b
    if-eqz v4, :cond_12

    const/4 v1, 0x0

    move-object v9, v1

    goto :goto_c

    :cond_12
    move-object v9, v5

    :goto_c
    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_13

    const/4 v1, -0x1

    const-string/jumbo v2, "com.ui.core.ui.account.UiAccountAvatar (UiAccountAvatar.kt:27)"

    invoke-static {v0, v3, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_13
    const v0, -0x3e08b5f8

    invoke-interface {v11, v0}, LT/l;->U(I)V

    invoke-interface {v11}, LT/l;->f()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, LT/l;->a:LT/l$a;

    invoke-virtual {v1}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v0, v1, :cond_14

    new-instance v0, Lq9/d;

    invoke-direct {v0}, Lq9/d;-><init>()V

    invoke-interface {v11, v0}, LT/l;->K(Ljava/lang/Object;)V

    :cond_14
    check-cast v0, Lmh/l;

    invoke-interface {v11}, LT/l;->J()V

    invoke-static {v10, v0}, Landroidx/compose/ui/graphics/b;->a(Landroidx/compose/ui/e;Lmh/l;)Landroidx/compose/ui/e;

    move-result-object v0

    if-eqz v9, :cond_15

    sget-object v1, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    invoke-static {}, LE/h;->g()LE/g;

    move-result-object v2

    invoke-static {v1, v9, v2}, Ls/e;->e(Landroidx/compose/ui/e;Ls/g;Lm0/i1;)Landroidx/compose/ui/e;

    move-result-object v1

    goto :goto_d

    :cond_15
    sget-object v1, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    :goto_d
    invoke-interface {v0, v1}, Landroidx/compose/ui/e;->b0(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v0

    invoke-static {v0, v14}, Landroidx/compose/foundation/layout/r;->o(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v1

    sget-object v0, LC0/h;->a:LC0/h$a;

    invoke-virtual {v0}, LC0/h$a;->b()LC0/h;

    move-result-object v6

    shr-int/lit8 v0, v3, 0x3

    and-int/lit8 v0, v0, 0xe

    const/high16 v2, 0x180000

    or-int/2addr v0, v2

    and-int/lit16 v2, v3, 0x380

    or-int v16, v0, v2

    const/16 v17, 0xdc

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object/from16 v0, p1

    move-object/from16 v2, p2

    move-object/from16 v18, v9

    move-object v9, v11

    move-object/from16 v19, v10

    move/from16 v10, v16

    move-object/from16 v16, v11

    move/from16 v11, v17

    invoke-static/range {v0 .. v11}, Lta/c;->e(Ls9/a;Landroidx/compose/ui/e;Ls9/a$b;Ls9/a$b;Ljava/lang/String;Lf0/c;LC0/h;FLm0/w0;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_16

    invoke-static {}, LT/o;->P()V

    :cond_16
    move-object/from16 v5, v18

    move-object/from16 v1, v19

    :goto_e
    invoke-interface/range {v16 .. v16}, LT/l;->z()LT/X0;

    move-result-object v8

    if-eqz v8, :cond_17

    new-instance v9, Lq9/e;

    move-object v0, v9

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p3

    move/from16 v6, p6

    move/from16 v7, p7

    invoke-direct/range {v0 .. v7}, Lq9/e;-><init>(Landroidx/compose/ui/e;Ls9/c;Ls9/a$b;FLs/g;II)V

    invoke-interface {v8, v9}, LT/X0;->a(Lmh/p;)V

    :cond_17
    return-void
.end method

.method private static final d(Landroidx/compose/ui/graphics/c;)LYg/J;
    .locals 1

    const-string v0, "$this$graphicsLayer"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LE/h;->g()LE/g;

    move-result-object v0

    invoke-interface {p0, v0}, Landroidx/compose/ui/graphics/c;->I1(Lm0/i1;)V

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Landroidx/compose/ui/graphics/c;->G(Z)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final e(Landroidx/compose/ui/e;Ls9/c;Ls9/a$b;FLs/g;IILT/l;I)LYg/J;
    .locals 9

    or-int/lit8 v0, p5, 0x1

    invoke-static {v0}, LT/L0;->a(I)I

    move-result v7

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move-object v5, p4

    move-object/from16 v6, p7

    move v8, p6

    invoke-static/range {v1 .. v8}, Lq9/f;->c(Landroidx/compose/ui/e;Ls9/c;Ls9/a$b;FLs/g;LT/l;II)V

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method
