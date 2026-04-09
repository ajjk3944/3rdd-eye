.class public abstract LJe/l;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Landroidx/compose/ui/e;LJe/c;ILT/l;I)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, LJe/l;->c(Landroidx/compose/ui/e;LJe/c;ILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Landroidx/compose/ui/e;LJe/c;LT/l;I)V
    .locals 22

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p3

    const/4 v3, 0x3

    const-string v4, "modifier"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "vm"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v4, 0x1f8ab36c

    move-object/from16 v5, p2

    invoke-interface {v5, v4}, LT/l;->r(I)LT/l;

    move-result-object v5

    const/4 v6, 0x6

    and-int/lit8 v7, v2, 0x6

    const/4 v8, 0x2

    if-nez v7, :cond_1

    invoke-interface {v5, v0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_0

    const/4 v7, 0x4

    goto :goto_0

    :cond_0
    move v7, v8

    :goto_0
    or-int/2addr v7, v2

    goto :goto_1

    :cond_1
    move v7, v2

    :goto_1
    and-int/lit8 v9, v7, 0x3

    if-ne v9, v8, :cond_3

    invoke-interface {v5}, LT/l;->v()Z

    move-result v9

    if-nez v9, :cond_2

    goto :goto_2

    :cond_2
    invoke-interface {v5}, LT/l;->C()V

    goto/16 :goto_5

    :cond_3
    :goto_2
    invoke-static {}, LT/o;->H()Z

    move-result v9

    if-eqz v9, :cond_4

    const/4 v9, -0x1

    const-string v10, "com.ui.wifiman.ui.device.DeviceDetailUiLoading (DeviceDetailUiLoading.kt:30)"

    invoke-static {v4, v7, v9, v10}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_4
    sget-object v4, Lla/a;->a:Lla/a;

    sget v7, Lla/a;->b:I

    invoke-virtual {v4, v5, v7}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v9

    invoke-virtual {v9}, Lma/a;->a()Lma/a$a;

    move-result-object v9

    invoke-virtual {v9}, Lma/a$a;->g()Lr9/a$b;

    move-result-object v9

    invoke-virtual {v9}, Lr9/a$b;->f()J

    move-result-wide v16

    invoke-virtual {v4, v5, v7}, Lla/a;->d(LT/l;I)Lra/a;

    move-result-object v9

    invoke-virtual {v9}, Lra/a;->a()Lra/b;

    move-result-object v9

    invoke-virtual {v9}, Lra/b;->a()Lra/b$a$a;

    move-result-object v9

    invoke-virtual {v9}, Lra/b$a$a;->c()F

    move-result v9

    const/4 v15, 0x0

    const/4 v14, 0x0

    invoke-static {v0, v9, v15, v8, v14}, Landroidx/compose/foundation/layout/o;->k(Landroidx/compose/ui/e;FFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v8

    const/4 v9, 0x0

    invoke-static {v8, v5, v9}, LH9/a;->a(Landroidx/compose/ui/e;LT/l;I)Landroidx/compose/ui/e;

    move-result-object v8

    sget-object v10, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v10}, Lf0/c$a;->g()Lf0/c$b;

    move-result-object v10

    sget-object v11, Lz/c;->a:Lz/c;

    invoke-virtual {v11}, Lz/c;->g()Lz/c$m;

    move-result-object v11

    const/16 v12, 0x30

    invoke-static {v11, v10, v5, v12}, Lz/h;->a(Lz/c$m;Lf0/c$b;LT/l;I)LC0/C;

    move-result-object v10

    invoke-static {v5, v9}, LT/j;->a(LT/l;I)I

    move-result v11

    invoke-interface {v5}, LT/l;->G()LT/x;

    move-result-object v12

    invoke-static {v5, v8}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v8

    sget-object v13, LE0/g;->K:LE0/g$a;

    invoke-virtual {v13}, LE0/g$a;->a()Lmh/a;

    move-result-object v15

    invoke-interface {v5}, LT/l;->x()LT/f;

    move-result-object v18

    if-nez v18, :cond_5

    invoke-static {}, LT/j;->c()V

    :cond_5
    invoke-interface {v5}, LT/l;->u()V

    invoke-interface {v5}, LT/l;->o()Z

    move-result v18

    if-eqz v18, :cond_6

    invoke-interface {v5, v15}, LT/l;->D(Lmh/a;)V

    goto :goto_3

    :cond_6
    invoke-interface {v5}, LT/l;->I()V

    :goto_3
    invoke-static {v5}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v15

    invoke-virtual {v13}, LE0/g$a;->e()Lmh/p;

    move-result-object v3

    invoke-static {v15, v10, v3}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v13}, LE0/g$a;->g()Lmh/p;

    move-result-object v3

    invoke-static {v15, v12, v3}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v13}, LE0/g$a;->b()Lmh/p;

    move-result-object v3

    invoke-interface {v15}, LT/l;->o()Z

    move-result v10

    if-nez v10, :cond_7

    invoke-interface {v15}, LT/l;->f()Ljava/lang/Object;

    move-result-object v10

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v10, v12}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_8

    :cond_7
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-interface {v15, v10}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-interface {v15, v10, v3}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_8
    invoke-virtual {v13}, LE0/g$a;->f()Lmh/p;

    move-result-object v3

    invoke-static {v15, v8, v3}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v3, Lz/k;->a:Lz/k;

    const/4 v3, 0x1

    invoke-static {v14, v5, v9, v3}, LBe/v0;->b(Landroidx/compose/ui/e;LT/l;II)V

    sget-object v8, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/16 v10, 0x10

    int-to-float v10, v10

    invoke-static {v10}, LY0/h;->j(F)F

    move-result v10

    invoke-static {v8, v10}, Landroidx/compose/foundation/layout/r;->i(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v10

    invoke-static {v10, v5, v6}, Lz/a0;->a(Landroidx/compose/ui/e;LT/l;I)V

    const/16 v10, 0x51

    int-to-float v10, v10

    invoke-static {v10}, LY0/h;->j(F)F

    move-result v10

    invoke-static {v8, v10}, Landroidx/compose/foundation/layout/r;->v(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v10

    const/4 v15, 0x2

    const/16 v19, 0x0

    const/4 v13, 0x0

    move-wide/from16 v11, v16

    move v14, v15

    move-object/from16 v15, v19

    invoke-static/range {v10 .. v15}, Landroidx/compose/foundation/b;->d(Landroidx/compose/ui/e;JLm0/i1;ILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v10

    invoke-virtual {v4, v5, v7}, Lla/a;->b(LT/l;I)Loa/a;

    move-result-object v11

    invoke-virtual {v11}, Loa/a;->a()LE/a;

    move-result-object v11

    invoke-static {v10, v11}, Lj0/e;->a(Landroidx/compose/ui/e;Lm0/i1;)Landroidx/compose/ui/e;

    move-result-object v10

    invoke-static {v10, v5, v9}, Lz/a0;->a(Landroidx/compose/ui/e;LT/l;I)V

    const/16 v10, 0x8

    int-to-float v15, v10

    invoke-static {v15}, LY0/h;->j(F)F

    move-result v10

    invoke-static {v8, v10}, Landroidx/compose/foundation/layout/r;->i(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v10

    invoke-static {v10, v5, v6}, Lz/a0;->a(Landroidx/compose/ui/e;LT/l;I)V

    const/16 v10, 0x18

    int-to-float v14, v10

    invoke-static {v14}, LY0/h;->j(F)F

    move-result v10

    invoke-static {v8, v10}, Landroidx/compose/foundation/layout/r;->i(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v10

    const/16 v11, 0x50

    int-to-float v11, v11

    invoke-static {v11}, LY0/h;->j(F)F

    move-result v11

    invoke-static {v10, v11}, Landroidx/compose/foundation/layout/r;->z(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v10

    const/16 v19, 0x2

    const/16 v20, 0x0

    move-wide/from16 v11, v16

    move/from16 v21, v14

    move/from16 v14, v19

    move/from16 v19, v15

    move-object/from16 v15, v20

    invoke-static/range {v10 .. v15}, Landroidx/compose/foundation/b;->d(Landroidx/compose/ui/e;JLm0/i1;ILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v10

    invoke-virtual {v4, v5, v7}, Lla/a;->b(LT/l;I)Loa/a;

    move-result-object v11

    invoke-virtual {v11}, Loa/a;->a()LE/a;

    move-result-object v11

    invoke-static {v10, v11}, Lj0/e;->a(Landroidx/compose/ui/e;Lm0/i1;)Landroidx/compose/ui/e;

    move-result-object v10

    invoke-static {v10, v5, v9}, Lz/a0;->a(Landroidx/compose/ui/e;LT/l;I)V

    invoke-static/range {v19 .. v19}, LY0/h;->j(F)F

    move-result v10

    invoke-static {v8, v10}, Landroidx/compose/foundation/layout/r;->i(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v10

    invoke-static {v10, v5, v6}, Lz/a0;->a(Landroidx/compose/ui/e;LT/l;I)V

    invoke-static/range {v21 .. v21}, LY0/h;->j(F)F

    move-result v6

    invoke-static {v8, v6}, Landroidx/compose/foundation/layout/r;->i(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v6

    const/16 v8, 0x64

    int-to-float v8, v8

    invoke-static {v8}, LY0/h;->j(F)F

    move-result v8

    invoke-static {v6, v8}, Landroidx/compose/foundation/layout/r;->z(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v10

    const/4 v14, 0x2

    const/4 v15, 0x0

    move-wide/from16 v11, v16

    invoke-static/range {v10 .. v15}, Landroidx/compose/foundation/b;->d(Landroidx/compose/ui/e;JLm0/i1;ILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v6

    invoke-virtual {v4, v5, v7}, Lla/a;->b(LT/l;I)Loa/a;

    move-result-object v4

    invoke-virtual {v4}, Loa/a;->a()LE/a;

    move-result-object v4

    invoke-static {v6, v4}, Lj0/e;->a(Landroidx/compose/ui/e;Lm0/i1;)Landroidx/compose/ui/e;

    move-result-object v4

    invoke-static {v4, v5, v9}, Lz/a0;->a(Landroidx/compose/ui/e;LT/l;I)V

    const/4 v4, 0x0

    invoke-static {v4, v5, v9, v3}, LBe/v0;->b(Landroidx/compose/ui/e;LT/l;II)V

    const v6, -0x53fb9550

    invoke-interface {v5, v6}, LT/l;->U(I)V

    const/4 v6, 0x3

    invoke-static {v9, v6}, Lsh/m;->s(II)Lsh/i;

    move-result-object v6

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_4
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_9

    move-object v7, v6

    check-cast v7, LZg/Q;

    invoke-virtual {v7}, LZg/Q;->d()I

    invoke-static {v4, v5, v9, v3}, LBe/v0;->b(Landroidx/compose/ui/e;LT/l;II)V

    sget-object v7, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/4 v8, 0x0

    invoke-static {v7, v8, v3, v4}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v7

    const/16 v10, 0x96

    int-to-float v10, v10

    invoke-static {v10}, LY0/h;->j(F)F

    move-result v10

    invoke-static {v7, v10}, Landroidx/compose/foundation/layout/r;->i(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v10

    const/4 v14, 0x2

    const/4 v15, 0x0

    const/4 v13, 0x0

    move-wide/from16 v11, v16

    invoke-static/range {v10 .. v15}, Landroidx/compose/foundation/b;->d(Landroidx/compose/ui/e;JLm0/i1;ILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v7

    sget-object v10, Lla/a;->a:Lla/a;

    sget v11, Lla/a;->b:I

    invoke-virtual {v10, v5, v11}, Lla/a;->b(LT/l;I)Loa/a;

    move-result-object v10

    invoke-virtual {v10}, Loa/a;->a()LE/a;

    move-result-object v10

    invoke-static {v7, v10}, Lj0/e;->a(Landroidx/compose/ui/e;Lm0/i1;)Landroidx/compose/ui/e;

    move-result-object v7

    invoke-static {v7, v5, v9}, Lz/a0;->a(Landroidx/compose/ui/e;LT/l;I)V

    goto :goto_4

    :cond_9
    invoke-interface {v5}, LT/l;->J()V

    invoke-static {v4, v5, v9, v3}, LBe/v0;->b(Landroidx/compose/ui/e;LT/l;II)V

    invoke-interface {v5}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result v3

    if-eqz v3, :cond_a

    invoke-static {}, LT/o;->P()V

    :cond_a
    :goto_5
    invoke-interface {v5}, LT/l;->z()LT/X0;

    move-result-object v3

    if-eqz v3, :cond_b

    new-instance v4, LJe/k;

    invoke-direct {v4, v0, v1, v2}, LJe/k;-><init>(Landroidx/compose/ui/e;LJe/c;I)V

    invoke-interface {v3, v4}, LT/X0;->a(Lmh/p;)V

    :cond_b
    return-void
.end method

.method private static final c(Landroidx/compose/ui/e;LJe/c;ILT/l;I)LYg/J;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LT/L0;->a(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, LJe/l;->b(Landroidx/compose/ui/e;LJe/c;LT/l;I)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method
