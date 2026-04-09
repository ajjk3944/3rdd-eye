.class public abstract LBe/G;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Landroidx/compose/ui/e;Lmh/p;IILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p5}, LBe/G;->c(Landroidx/compose/ui/e;Lmh/p;IILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Landroidx/compose/ui/e;Lmh/p;LT/l;II)V
    .locals 17

    move-object/from16 v12, p1

    move/from16 v13, p3

    move/from16 v14, p4

    const-string v0, "content"

    invoke-static {v12, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x3ff5aa1

    move-object/from16 v1, p2

    invoke-interface {v1, v0}, LT/l;->r(I)LT/l;

    move-result-object v15

    and-int/lit8 v1, v14, 0x1

    if-eqz v1, :cond_0

    or-int/lit8 v2, v13, 0x6

    move v3, v2

    move-object/from16 v2, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v2, v13, 0x6

    if-nez v2, :cond_2

    move-object/from16 v2, p0

    invoke-interface {v15, v2}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 v3, 0x4

    goto :goto_0

    :cond_1
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v3, v13

    goto :goto_1

    :cond_2
    move-object/from16 v2, p0

    move v3, v13

    :goto_1
    and-int/lit8 v4, v14, 0x2

    if-eqz v4, :cond_3

    or-int/lit8 v3, v3, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v4, v13, 0x30

    if-nez v4, :cond_5

    invoke-interface {v15, v12}, LT/l;->l(Ljava/lang/Object;)Z

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
    and-int/lit8 v4, v3, 0x13

    const/16 v5, 0x12

    if-ne v4, v5, :cond_7

    invoke-interface {v15}, LT/l;->v()Z

    move-result v4

    if-nez v4, :cond_6

    goto :goto_4

    :cond_6
    invoke-interface {v15}, LT/l;->C()V

    goto/16 :goto_7

    :cond_7
    :goto_4
    if-eqz v1, :cond_8

    sget-object v1, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    move-object/from16 v16, v1

    goto :goto_5

    :cond_8
    move-object/from16 v16, v2

    :goto_5
    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_9

    const/4 v1, -0x1

    const-string v2, "com.ui.wifiman.ui.component.SurfaceCardSecondary (SurfaceCardSecondary.kt:17)"

    invoke-static {v0, v3, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_9
    sget-object v0, Lla/a;->a:Lla/a;

    sget v1, Lla/a;->b:I

    invoke-virtual {v0, v15, v1}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v2

    const v4, 0x1e8ad365

    invoke-interface {v15, v4}, LT/l;->U(I)V

    invoke-interface {v15, v2}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v4

    invoke-interface {v15}, LT/l;->f()Ljava/lang/Object;

    move-result-object v5

    if-nez v4, :cond_a

    sget-object v4, LT/l;->a:LT/l$a;

    invoke-virtual {v4}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v4

    if-ne v5, v4, :cond_c

    :cond_a
    instance-of v4, v2, Lma/a$d;

    if-eqz v4, :cond_b

    const-wide/high16 v4, 0x3fe0000000000000L    # 0.5

    double-to-float v2, v4

    invoke-static {v2}, LY0/h;->j(F)F

    move-result v2

    goto :goto_6

    :cond_b
    instance-of v2, v2, Lma/a$b;

    if-eqz v2, :cond_f

    const/4 v2, 0x0

    int-to-float v2, v2

    invoke-static {v2}, LY0/h;->j(F)F

    move-result v2

    :goto_6
    invoke-static {v2}, LY0/h;->d(F)LY0/h;

    move-result-object v5

    invoke-interface {v15, v5}, LT/l;->K(Ljava/lang/Object;)V

    :cond_c
    check-cast v5, LY0/h;

    invoke-virtual {v5}, LY0/h;->s()F

    move-result v7

    invoke-interface {v15}, LT/l;->J()V

    invoke-virtual {v0, v15, v1}, Lla/a;->b(LT/l;I)Loa/a;

    move-result-object v2

    invoke-virtual {v2}, Loa/a;->a()LE/a;

    move-result-object v2

    invoke-virtual {v0, v15, v1}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v0

    invoke-virtual {v0}, Lma/a;->a()Lma/a$a;

    move-result-object v0

    invoke-virtual {v0}, Lma/a$a;->g()Lr9/a$b;

    move-result-object v0

    invoke-virtual {v0}, Lr9/a$b;->e()J

    move-result-wide v4

    and-int/lit8 v0, v3, 0xe

    shl-int/lit8 v1, v3, 0xf

    const/high16 v3, 0x380000

    and-int/2addr v1, v3

    or-int v10, v0, v1

    const/16 v11, 0x18

    const-wide/16 v8, 0x0

    const/4 v6, 0x0

    move-object/from16 v0, v16

    move-object v1, v2

    move-wide v2, v4

    move-wide v4, v8

    move-object/from16 v8, p1

    move-object v9, v15

    invoke-static/range {v0 .. v11}, LN/O0;->a(Landroidx/compose/ui/e;Lm0/i1;JJLs/g;FLmh/p;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_d

    invoke-static {}, LT/o;->P()V

    :cond_d
    move-object/from16 v2, v16

    :goto_7
    invoke-interface {v15}, LT/l;->z()LT/X0;

    move-result-object v0

    if-eqz v0, :cond_e

    new-instance v1, LBe/F;

    invoke-direct {v1, v2, v12, v13, v14}, LBe/F;-><init>(Landroidx/compose/ui/e;Lmh/p;II)V

    invoke-interface {v0, v1}, LT/X0;->a(Lmh/p;)V

    :cond_e
    return-void

    :cond_f
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method

.method private static final c(Landroidx/compose/ui/e;Lmh/p;IILT/l;I)LYg/J;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LT/L0;->a(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, LBe/G;->b(Landroidx/compose/ui/e;Lmh/p;LT/l;II)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method
