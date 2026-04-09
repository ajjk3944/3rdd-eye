.class public abstract LEe/B;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Landroidx/compose/ui/e;JIILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p6}, LEe/B;->c(Landroidx/compose/ui/e;JIILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Landroidx/compose/ui/e;JLT/l;II)V
    .locals 16

    const v0, 0x348b77b7

    move-object/from16 v1, p3

    invoke-interface {v1, v0}, LT/l;->r(I)LT/l;

    move-result-object v1

    and-int/lit8 v2, p5, 0x1

    if-eqz v2, :cond_0

    or-int/lit8 v3, p4, 0x6

    move v4, v3

    move-object/from16 v3, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v3, p4, 0x6

    if-nez v3, :cond_2

    move-object/from16 v3, p0

    invoke-interface {v1, v3}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    const/4 v4, 0x4

    goto :goto_0

    :cond_1
    const/4 v4, 0x2

    :goto_0
    or-int v4, p4, v4

    goto :goto_1

    :cond_2
    move-object/from16 v3, p0

    move/from16 v4, p4

    :goto_1
    and-int/lit8 v5, p4, 0x30

    const/16 v6, 0x20

    if-nez v5, :cond_4

    and-int/lit8 v5, p5, 0x2

    move-wide/from16 v7, p1

    if-nez v5, :cond_3

    invoke-interface {v1, v7, v8}, LT/l;->j(J)Z

    move-result v5

    if-eqz v5, :cond_3

    move v5, v6

    goto :goto_2

    :cond_3
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v4, v5

    goto :goto_3

    :cond_4
    move-wide/from16 v7, p1

    :goto_3
    and-int/lit8 v5, v4, 0x13

    const/16 v9, 0x12

    if-ne v5, v9, :cond_6

    invoke-interface {v1}, LT/l;->v()Z

    move-result v5

    if-nez v5, :cond_5

    goto :goto_4

    :cond_5
    invoke-interface {v1}, LT/l;->C()V

    move-object v2, v3

    move-wide v3, v7

    goto/16 :goto_a

    :cond_6
    :goto_4
    invoke-interface {v1}, LT/l;->q()V

    and-int/lit8 v5, p4, 0x1

    if-eqz v5, :cond_a

    invoke-interface {v1}, LT/l;->H()Z

    move-result v5

    if-eqz v5, :cond_7

    goto :goto_6

    :cond_7
    invoke-interface {v1}, LT/l;->C()V

    and-int/lit8 v2, p5, 0x2

    if-eqz v2, :cond_8

    and-int/lit8 v4, v4, -0x71

    :cond_8
    move-object v2, v3

    :cond_9
    :goto_5
    move v5, v4

    move-wide v3, v7

    goto :goto_8

    :cond_a
    :goto_6
    if-eqz v2, :cond_b

    sget-object v2, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    goto :goto_7

    :cond_b
    move-object v2, v3

    :goto_7
    and-int/lit8 v3, p5, 0x2

    if-eqz v3, :cond_9

    sget-object v3, Lla/a;->a:Lla/a;

    sget v5, Lla/a;->b:I

    invoke-virtual {v3, v1, v5}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v3

    invoke-virtual {v3}, Lma/a;->e()Lma/a$e;

    move-result-object v3

    invoke-virtual {v3}, Lma/a$e;->a()J

    move-result-wide v7

    and-int/lit8 v4, v4, -0x71

    goto :goto_5

    :goto_8
    invoke-interface {v1}, LT/l;->S()V

    invoke-static {}, LT/o;->H()Z

    move-result v7

    if-eqz v7, :cond_c

    const/4 v7, -0x1

    const-string v8, "com.ui.wifiman.ui.component.list.LazyColumnCardTopScrollOverlay (LazyColumnCardTopScrollOverlay.kt:20)"

    invoke-static {v0, v5, v7, v8}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_c
    const/16 v0, 0x18

    int-to-float v0, v0

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v0

    invoke-static {v2, v0}, Landroidx/compose/foundation/layout/r;->i(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x1

    invoke-static {v0, v7, v9, v8}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v0

    const v7, 0x239f2618

    invoke-interface {v1, v7}, LT/l;->U(I)V

    and-int/lit8 v7, v5, 0x70

    xor-int/lit8 v7, v7, 0x30

    const/4 v15, 0x0

    if-le v7, v6, :cond_d

    invoke-interface {v1, v3, v4}, LT/l;->j(J)Z

    move-result v7

    if-nez v7, :cond_f

    :cond_d
    and-int/lit8 v5, v5, 0x30

    if-ne v5, v6, :cond_e

    goto :goto_9

    :cond_e
    move v9, v15

    :cond_f
    :goto_9
    invoke-interface {v1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v5

    if-nez v9, :cond_10

    sget-object v6, LT/l;->a:LT/l$a;

    invoke-virtual {v6}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v6

    if-ne v5, v6, :cond_11

    :cond_10
    sget-object v5, Lm0/l0;->b:Lm0/l0$a;

    invoke-static {v3, v4}, Lm0/v0;->g(J)Lm0/v0;

    move-result-object v6

    const/16 v13, 0xe

    const/4 v14, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-wide v7, v3

    invoke-static/range {v7 .. v14}, Lm0/v0;->k(JFFFFILjava/lang/Object;)J

    move-result-wide v7

    invoke-static {v7, v8}, Lm0/v0;->g(J)Lm0/v0;

    move-result-object v7

    filled-new-array {v6, v7}, [Lm0/v0;

    move-result-object v6

    invoke-static {v6}, LZg/v;->o([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v8

    const/16 v12, 0xe

    const/4 v13, 0x0

    const/4 v11, 0x0

    move-object v7, v5

    invoke-static/range {v7 .. v13}, Lm0/l0$a;->i(Lm0/l0$a;Ljava/util/List;FFIILjava/lang/Object;)Lm0/l0;

    move-result-object v5

    invoke-interface {v1, v5}, LT/l;->K(Ljava/lang/Object;)V

    :cond_11
    move-object v11, v5

    check-cast v11, Lm0/l0;

    invoke-interface {v1}, LT/l;->J()V

    const/4 v14, 0x6

    const/4 v5, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object v10, v0

    move v0, v15

    move-object v15, v5

    invoke-static/range {v10 .. v15}, Landroidx/compose/foundation/b;->b(Landroidx/compose/ui/e;Lm0/l0;Lm0/i1;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v5

    invoke-static {v5, v1, v0}, Lz/a0;->a(Landroidx/compose/ui/e;LT/l;I)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_12

    invoke-static {}, LT/o;->P()V

    :cond_12
    :goto_a
    invoke-interface {v1}, LT/l;->z()LT/X0;

    move-result-object v6

    if-eqz v6, :cond_13

    new-instance v7, LEe/A;

    move-object v0, v7

    move-object v1, v2

    move-wide v2, v3

    move/from16 v4, p4

    move/from16 v5, p5

    invoke-direct/range {v0 .. v5}, LEe/A;-><init>(Landroidx/compose/ui/e;JII)V

    invoke-interface {v6, v7}, LT/X0;->a(Lmh/p;)V

    :cond_13
    return-void
.end method

.method private static final c(Landroidx/compose/ui/e;JIILT/l;I)LYg/J;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, LT/L0;->a(I)I

    move-result v4

    move-object v0, p0

    move-wide v1, p1

    move-object v3, p5

    move v5, p4

    invoke-static/range {v0 .. v5}, LEe/B;->b(Landroidx/compose/ui/e;JLT/l;II)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method
