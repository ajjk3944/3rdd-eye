.class public abstract Ldf/h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ldf/h$b;
    }
.end annotation


# direct methods
.method public static synthetic a(Lmh/l;Ldf/b;)LYg/J;
    .locals 0

    invoke-static {p0, p1}, Ldf/h;->h(Lmh/l;Ldf/b;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroidx/compose/ui/e;Ldf/b;ILT/l;I)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Ldf/h;->f(Landroidx/compose/ui/e;Ldf/b;ILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Landroidx/compose/ui/e;Ldf/c;IILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p5}, Ldf/h;->k(Landroidx/compose/ui/e;Ldf/c;IILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Landroidx/compose/ui/e;LCi/c;Lmh/l;ILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p5}, Ldf/h;->i(Landroidx/compose/ui/e;LCi/c;Lmh/l;ILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method private static final e(Landroidx/compose/ui/e;Ldf/b;LT/l;I)V
    .locals 37

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p3

    const v3, -0x6d324d8f

    move-object/from16 v4, p2

    invoke-interface {v4, v3}, LT/l;->r(I)LT/l;

    move-result-object v15

    const/4 v4, 0x6

    and-int/lit8 v5, v2, 0x6

    if-nez v5, :cond_1

    invoke-interface {v15, v0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    const/4 v5, 0x4

    goto :goto_0

    :cond_0
    const/4 v5, 0x2

    :goto_0
    or-int/2addr v5, v2

    goto :goto_1

    :cond_1
    move v5, v2

    :goto_1
    and-int/lit8 v6, v2, 0x30

    const/16 v7, 0x10

    if-nez v6, :cond_3

    invoke-interface {v15, v1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    const/16 v6, 0x20

    goto :goto_2

    :cond_2
    move v6, v7

    :goto_2
    or-int/2addr v5, v6

    :cond_3
    and-int/lit8 v6, v5, 0x13

    const/16 v8, 0x12

    if-ne v6, v8, :cond_5

    invoke-interface {v15}, LT/l;->v()Z

    move-result v6

    if-nez v6, :cond_4

    goto :goto_3

    :cond_4
    invoke-interface {v15}, LT/l;->C()V

    move-object v5, v15

    goto/16 :goto_5

    :cond_5
    :goto_3
    invoke-static {}, LT/o;->H()Z

    move-result v6

    if-eqz v6, :cond_6

    const/4 v6, -0x1

    const-string v8, "com.ui.wifiman.ui.speed.isp.ContactsItem (IspDetailUi.kt:168)"

    invoke-static {v3, v5, v6, v8}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_6
    const/4 v3, 0x1

    int-to-float v3, v3

    invoke-static {v3}, LY0/h;->j(F)F

    move-result v3

    sget-object v13, Lla/a;->a:Lla/a;

    sget v14, Lla/a;->b:I

    invoke-virtual {v13, v15, v14}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v5

    invoke-virtual {v5}, Lma/a;->a()Lma/a$a;

    move-result-object v5

    invoke-virtual {v5}, Lma/a$a;->g()Lr9/a$b;

    move-result-object v5

    invoke-virtual {v5}, Lr9/a$b;->g()J

    move-result-wide v5

    invoke-static {v3, v5, v6}, Ls/h;->a(FJ)Ls/g;

    move-result-object v3

    int-to-float v4, v4

    invoke-static {v4}, LY0/h;->j(F)F

    move-result v4

    invoke-static {v4}, LE/h;->d(F)LE/g;

    move-result-object v4

    invoke-static {v0, v3, v4}, Ls/e;->e(Landroidx/compose/ui/e;Ls/g;Lm0/i1;)Landroidx/compose/ui/e;

    move-result-object v16

    const/16 v3, 0xdc

    int-to-float v3, v3

    invoke-static {v3}, LY0/h;->j(F)F

    move-result v19

    const/16 v21, 0xb

    const/16 v22, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v20, 0x0

    invoke-static/range {v16 .. v22}, Landroidx/compose/foundation/layout/r;->r(Landroidx/compose/ui/e;FFFFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v23

    const/16 v3, 0x38

    int-to-float v3, v3

    invoke-static {v3}, LY0/h;->j(F)F

    move-result v25

    const/16 v28, 0xd

    const/16 v29, 0x0

    const/16 v24, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    invoke-static/range {v23 .. v29}, Landroidx/compose/foundation/layout/r;->y(Landroidx/compose/ui/e;FFFFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v3

    int-to-float v4, v7

    invoke-static {v4}, LY0/h;->j(F)F

    move-result v4

    const/16 v5, 0x8

    int-to-float v5, v5

    invoke-static {v5}, LY0/h;->j(F)F

    move-result v5

    invoke-static {v3, v4, v5}, Landroidx/compose/foundation/layout/o;->j(Landroidx/compose/ui/e;FF)Landroidx/compose/ui/e;

    move-result-object v3

    sget-object v4, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v4}, Lf0/c$a;->g()Lf0/c$b;

    move-result-object v4

    sget-object v5, Lz/c;->a:Lz/c;

    invoke-virtual {v5}, Lz/c;->b()Lz/c$f;

    move-result-object v5

    const/16 v6, 0x36

    invoke-static {v5, v4, v15, v6}, Lz/h;->a(Lz/c$m;Lf0/c$b;LT/l;I)LC0/C;

    move-result-object v4

    const/4 v11, 0x0

    invoke-static {v15, v11}, LT/j;->a(LT/l;I)I

    move-result v5

    invoke-interface {v15}, LT/l;->G()LT/x;

    move-result-object v6

    invoke-static {v15, v3}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v3

    sget-object v7, LE0/g;->K:LE0/g$a;

    invoke-virtual {v7}, LE0/g$a;->a()Lmh/a;

    move-result-object v8

    invoke-interface {v15}, LT/l;->x()LT/f;

    move-result-object v9

    if-nez v9, :cond_7

    invoke-static {}, LT/j;->c()V

    :cond_7
    invoke-interface {v15}, LT/l;->u()V

    invoke-interface {v15}, LT/l;->o()Z

    move-result v9

    if-eqz v9, :cond_8

    invoke-interface {v15, v8}, LT/l;->D(Lmh/a;)V

    goto :goto_4

    :cond_8
    invoke-interface {v15}, LT/l;->I()V

    :goto_4
    invoke-static {v15}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v8

    invoke-virtual {v7}, LE0/g$a;->e()Lmh/p;

    move-result-object v9

    invoke-static {v8, v4, v9}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v7}, LE0/g$a;->g()Lmh/p;

    move-result-object v4

    invoke-static {v8, v6, v4}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v7}, LE0/g$a;->b()Lmh/p;

    move-result-object v4

    invoke-interface {v8}, LT/l;->o()Z

    move-result v6

    if-nez v6, :cond_9

    invoke-interface {v8}, LT/l;->f()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v6, v9}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_a

    :cond_9
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v8, v6}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v8, v5, v4}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_a
    invoke-virtual {v7}, LE0/g$a;->f()Lmh/p;

    move-result-object v4

    invoke-static {v8, v3, v4}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v3, Lz/k;->a:Lz/k;

    invoke-static/range {p1 .. p1}, Ldf/h;->m(Ldf/b;)Ls9/b;

    move-result-object v4

    sget-object v3, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    move-object v12, v3

    const/16 v5, 0x18

    int-to-float v5, v5

    invoke-static {v5}, LY0/h;->j(F)F

    move-result v5

    invoke-static {v3, v5}, Landroidx/compose/foundation/layout/r;->v(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v5

    invoke-virtual {v13, v15, v14}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v3

    invoke-virtual {v3}, Lma/a;->c()Lma/a$c;

    move-result-object v3

    invoke-virtual {v3}, Lma/a$c;->a()J

    move-result-wide v6

    invoke-static {v6, v7}, Lm0/v0;->g(J)Lm0/v0;

    move-result-object v6

    const/16 v9, 0x30

    const/4 v10, 0x4

    const/4 v7, 0x0

    move-object v8, v15

    invoke-static/range {v4 .. v10}, Lta/c;->c(Ls9/b;Landroidx/compose/ui/e;Lm0/v0;Ljava/lang/String;LT/l;II)V

    invoke-static/range {p1 .. p1}, Ldf/h;->n(Ldf/b;)Ls9/d;

    move-result-object v3

    invoke-static {v3, v15, v11}, Lsa/a;->a(Ls9/d;LT/l;I)LL0/d;

    move-result-object v11

    invoke-virtual {v13, v15, v14}, Lla/a;->c(LT/l;I)Lpa/c;

    move-result-object v3

    invoke-virtual {v3}, Lpa/c;->a()Lpa/b;

    move-result-object v3

    invoke-virtual {v3}, Lpa/b;->f()LL0/U;

    move-result-object v32

    invoke-virtual {v13, v15, v14}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v3

    invoke-virtual {v3}, Lma/a;->f()Lma/a$f;

    move-result-object v3

    invoke-virtual {v3}, Lma/a$f;->c()J

    move-result-wide v13

    const/16 v35, 0x0

    const v36, 0x1fff8

    const-wide/16 v3, 0x0

    move-object v5, v15

    move-wide v15, v3

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const-wide/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const-wide/16 v24, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v34, 0x30

    move-object/from16 v33, v5

    invoke-static/range {v11 .. v36}, LN/a1;->c(LL0/d;Landroidx/compose/ui/e;JJLQ0/v;LQ0/A;LQ0/k;JLW0/k;LW0/j;JIZIILjava/util/Map;Lmh/l;LL0/U;LT/l;III)V

    invoke-interface {v5}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result v3

    if-eqz v3, :cond_b

    invoke-static {}, LT/o;->P()V

    :cond_b
    :goto_5
    invoke-interface {v5}, LT/l;->z()LT/X0;

    move-result-object v3

    if-eqz v3, :cond_c

    new-instance v4, Ldf/g;

    invoke-direct {v4, v0, v1, v2}, Ldf/g;-><init>(Landroidx/compose/ui/e;Ldf/b;I)V

    invoke-interface {v3, v4}, LT/X0;->a(Lmh/p;)V

    :cond_c
    return-void
.end method

.method private static final f(Landroidx/compose/ui/e;Ldf/b;ILT/l;I)LYg/J;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LT/L0;->a(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Ldf/h;->e(Landroidx/compose/ui/e;Ldf/b;LT/l;I)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final g(Landroidx/compose/ui/e;LCi/c;Lmh/l;LT/l;I)V
    .locals 27

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move/from16 v3, p4

    const v4, 0x3680039f

    move-object/from16 v5, p3

    invoke-interface {v5, v4}, LT/l;->r(I)LT/l;

    move-result-object v5

    and-int/lit8 v6, v3, 0x6

    if-nez v6, :cond_1

    invoke-interface {v5, v0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_0

    const/4 v6, 0x4

    goto :goto_0

    :cond_0
    const/4 v6, 0x2

    :goto_0
    or-int/2addr v6, v3

    goto :goto_1

    :cond_1
    move v6, v3

    :goto_1
    and-int/lit8 v7, v3, 0x30

    const/16 v8, 0x10

    if-nez v7, :cond_3

    invoke-interface {v5, v1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_2

    const/16 v7, 0x20

    goto :goto_2

    :cond_2
    move v7, v8

    :goto_2
    or-int/2addr v6, v7

    :cond_3
    and-int/lit16 v7, v3, 0x180

    const/16 v9, 0x100

    if-nez v7, :cond_5

    invoke-interface {v5, v2}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_4

    move v7, v9

    goto :goto_3

    :cond_4
    const/16 v7, 0x80

    :goto_3
    or-int/2addr v6, v7

    :cond_5
    and-int/lit16 v7, v6, 0x93

    const/16 v10, 0x92

    if-ne v7, v10, :cond_7

    invoke-interface {v5}, LT/l;->v()Z

    move-result v7

    if-nez v7, :cond_6

    goto :goto_4

    :cond_6
    invoke-interface {v5}, LT/l;->C()V

    goto/16 :goto_8

    :cond_7
    :goto_4
    invoke-static {}, LT/o;->H()Z

    move-result v7

    if-eqz v7, :cond_8

    const/4 v7, -0x1

    const-string v10, "com.ui.wifiman.ui.speed.isp.ContactsRow (IspDetailUi.kt:148)"

    invoke-static {v4, v6, v7, v10}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_8
    sget-object v4, Lz/c;->a:Lz/c;

    int-to-float v7, v8

    invoke-static {v7}, LY0/h;->j(F)F

    move-result v7

    invoke-virtual {v4, v7}, Lz/c;->n(F)Lz/c$f;

    move-result-object v4

    sget-object v7, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v7}, Lf0/c$a;->l()Lf0/c$c;

    move-result-object v7

    const/4 v8, 0x6

    invoke-static {v4, v7, v5, v8}, Lz/W;->b(Lz/c$e;Lf0/c$c;LT/l;I)LC0/C;

    move-result-object v4

    const/4 v7, 0x0

    invoke-static {v5, v7}, LT/j;->a(LT/l;I)I

    move-result v8

    invoke-interface {v5}, LT/l;->G()LT/x;

    move-result-object v10

    invoke-static {v5, v0}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v11

    sget-object v12, LE0/g;->K:LE0/g$a;

    invoke-virtual {v12}, LE0/g$a;->a()Lmh/a;

    move-result-object v13

    invoke-interface {v5}, LT/l;->x()LT/f;

    move-result-object v14

    if-nez v14, :cond_9

    invoke-static {}, LT/j;->c()V

    :cond_9
    invoke-interface {v5}, LT/l;->u()V

    invoke-interface {v5}, LT/l;->o()Z

    move-result v14

    if-eqz v14, :cond_a

    invoke-interface {v5, v13}, LT/l;->D(Lmh/a;)V

    goto :goto_5

    :cond_a
    invoke-interface {v5}, LT/l;->I()V

    :goto_5
    invoke-static {v5}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v13

    invoke-virtual {v12}, LE0/g$a;->e()Lmh/p;

    move-result-object v14

    invoke-static {v13, v4, v14}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v12}, LE0/g$a;->g()Lmh/p;

    move-result-object v4

    invoke-static {v13, v10, v4}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v12}, LE0/g$a;->b()Lmh/p;

    move-result-object v4

    invoke-interface {v13}, LT/l;->o()Z

    move-result v10

    if-nez v10, :cond_b

    invoke-interface {v13}, LT/l;->f()Ljava/lang/Object;

    move-result-object v10

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v10, v14}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_c

    :cond_b
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-interface {v13, v10}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-interface {v13, v8, v4}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_c
    invoke-virtual {v12}, LE0/g$a;->f()Lmh/p;

    move-result-object v4

    invoke-static {v13, v11, v4}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v4, Lz/Z;->a:Lz/Z;

    const v8, -0x7ac4fa7b

    invoke-interface {v5, v8}, LT/l;->U(I)V

    invoke-interface/range {p1 .. p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_6
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_10

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ldf/b;

    sget-object v15, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/16 v18, 0x2

    const/16 v19, 0x0

    const/high16 v16, 0x3f800000    # 1.0f

    const/16 v17, 0x0

    move-object v14, v4

    invoke-static/range {v14 .. v19}, Lz/Y;->b(Lz/Y;Landroidx/compose/ui/e;FZILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v20

    const v11, 0x37b9732a

    invoke-interface {v5, v11}, LT/l;->U(I)V

    and-int/lit16 v11, v6, 0x380

    if-ne v11, v9, :cond_d

    const/4 v11, 0x1

    goto :goto_7

    :cond_d
    move v11, v7

    :goto_7
    invoke-interface {v5, v10}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v12

    or-int/2addr v11, v12

    invoke-interface {v5}, LT/l;->f()Ljava/lang/Object;

    move-result-object v12

    if-nez v11, :cond_e

    sget-object v11, LT/l;->a:LT/l$a;

    invoke-virtual {v11}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v11

    if-ne v12, v11, :cond_f

    :cond_e
    new-instance v12, Ldf/e;

    invoke-direct {v12, v2, v10}, Ldf/e;-><init>(Lmh/l;Ldf/b;)V

    invoke-interface {v5, v12}, LT/l;->K(Ljava/lang/Object;)V

    :cond_f
    move-object/from16 v24, v12

    check-cast v24, Lmh/a;

    invoke-interface {v5}, LT/l;->J()V

    const/16 v25, 0x7

    const/16 v26, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    invoke-static/range {v20 .. v26}, Landroidx/compose/foundation/d;->d(Landroidx/compose/ui/e;ZLjava/lang/String;LJ0/g;Lmh/a;ILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v11

    invoke-static {v11, v10, v5, v7}, Ldf/h;->e(Landroidx/compose/ui/e;Ldf/b;LT/l;I)V

    goto :goto_6

    :cond_10
    invoke-interface {v5}, LT/l;->J()V

    invoke-interface {v5}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result v4

    if-eqz v4, :cond_11

    invoke-static {}, LT/o;->P()V

    :cond_11
    :goto_8
    invoke-interface {v5}, LT/l;->z()LT/X0;

    move-result-object v4

    if-eqz v4, :cond_12

    new-instance v5, Ldf/f;

    invoke-direct {v5, v0, v1, v2, v3}, Ldf/f;-><init>(Landroidx/compose/ui/e;LCi/c;Lmh/l;I)V

    invoke-interface {v4, v5}, LT/X0;->a(Lmh/p;)V

    :cond_12
    return-void
.end method

.method private static final h(Lmh/l;Ldf/b;)LYg/J;
    .locals 0

    invoke-interface {p0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final i(Landroidx/compose/ui/e;LCi/c;Lmh/l;ILT/l;I)LYg/J;
    .locals 0

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, LT/L0;->a(I)I

    move-result p3

    invoke-static {p0, p1, p2, p4, p3}, Ldf/h;->g(Landroidx/compose/ui/e;LCi/c;Lmh/l;LT/l;I)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method public static final j(Landroidx/compose/ui/e;Ldf/c;LT/l;II)V
    .locals 11

    const v0, 0x7931ea25

    invoke-interface {p2, v0}, LT/l;->r(I)LT/l;

    move-result-object p2

    and-int/lit8 v1, p4, 0x1

    if-eqz v1, :cond_0

    or-int/lit8 v2, p3, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v2, p3, 0x6

    if-nez v2, :cond_2

    invoke-interface {p2, p0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v2, 0x4

    goto :goto_0

    :cond_1
    const/4 v2, 0x2

    :goto_0
    or-int/2addr v2, p3

    goto :goto_1

    :cond_2
    move v2, p3

    :goto_1
    and-int/lit8 v3, p3, 0x30

    if-nez v3, :cond_4

    and-int/lit8 v3, p4, 0x2

    if-nez v3, :cond_3

    invoke-interface {p2, p1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    const/16 v3, 0x20

    goto :goto_2

    :cond_3
    const/16 v3, 0x10

    :goto_2
    or-int/2addr v2, v3

    :cond_4
    move v9, v2

    and-int/lit8 v2, v9, 0x13

    const/16 v3, 0x12

    if-ne v2, v3, :cond_6

    invoke-interface {p2}, LT/l;->v()Z

    move-result v2

    if-nez v2, :cond_5

    goto :goto_3

    :cond_5
    invoke-interface {p2}, LT/l;->C()V

    goto/16 :goto_7

    :cond_6
    :goto_3
    invoke-interface {p2}, LT/l;->q()V

    and-int/lit8 v2, p3, 0x1

    if-eqz v2, :cond_8

    invoke-interface {p2}, LT/l;->H()Z

    move-result v2

    if-eqz v2, :cond_7

    goto :goto_5

    :cond_7
    invoke-interface {p2}, LT/l;->C()V

    and-int/lit8 v1, p4, 0x2

    if-eqz v1, :cond_d

    :goto_4
    and-int/lit8 v9, v9, -0x71

    goto/16 :goto_6

    :cond_8
    :goto_5
    if-eqz v1, :cond_9

    sget-object p0, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    :cond_9
    and-int/lit8 v1, p4, 0x2

    if-eqz v1, :cond_d

    const p1, -0x72e5f4af

    invoke-interface {p2, p1}, LT/l;->U(I)V

    sget-object p1, Lc2/a;->a:Lc2/a;

    sget v1, Lc2/a;->c:I

    invoke-virtual {p1, p2, v1}, Lc2/a;->a(LT/l;I)Landroidx/lifecycle/S;

    move-result-object v2

    if-eqz v2, :cond_c

    invoke-static {}, Lye/j;->c()LT/H0;

    move-result-object p1

    invoke-interface {p2, p1}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object p1

    move-object v4, p1

    check-cast v4, Landroidx/lifecycle/P$c;

    const/4 v7, 0x0

    const/16 v8, 0x10

    const-class v1, Ldf/c;

    const/4 v3, 0x0

    const/4 v5, 0x0

    move-object v6, p2

    invoke-static/range {v1 .. v8}, Lc2/c;->b(Ljava/lang/Class;Landroidx/lifecycle/S;Ljava/lang/String;Landroidx/lifecycle/P$c;Lb2/a;LT/l;II)Landroidx/lifecycle/N;

    move-result-object p1

    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->getLocalLifecycleOwner()LT/H0;

    move-result-object v1

    invoke-interface {p2, v1}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/lifecycle/o;

    invoke-static {}, Ld/c;->a()LT/H0;

    move-result-object v2

    invoke-interface {p2, v2}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v2

    const-string v3, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Landroidx/appcompat/app/c;

    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->getLocalLifecycleOwner()LT/H0;

    move-result-object v3

    invoke-interface {p2, v3}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v3

    const v4, 0x318a4a49

    invoke-interface {p2, v4}, LT/l;->U(I)V

    invoke-interface {p2, p1}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v4

    invoke-interface {p2, v2}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v4, v5

    invoke-interface {p2, v1}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v4, v5

    invoke-interface {p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v5

    if-nez v4, :cond_a

    sget-object v4, LT/l;->a:LT/l$a;

    invoke-virtual {v4}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v4

    if-ne v5, v4, :cond_b

    :cond_a
    new-instance v5, Lye/i;

    invoke-direct {v5, p1, v1, v2}, Lye/i;-><init>(Landroidx/lifecycle/N;Landroidx/lifecycle/o;Landroidx/appcompat/app/c;)V

    invoke-interface {p2, v5}, LT/l;->K(Ljava/lang/Object;)V

    :cond_b
    check-cast v5, Lmh/l;

    invoke-interface {p2}, LT/l;->J()V

    const/4 v1, 0x0

    invoke-static {v3, v5, p2, v1}, LT/O;->c(Ljava/lang/Object;Lmh/l;LT/l;I)V

    invoke-interface {p2}, LT/l;->J()V

    check-cast p1, Ldf/c;

    goto/16 :goto_4

    :cond_c
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_d
    :goto_6
    invoke-interface {p2}, LT/l;->S()V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_e

    const/4 v1, -0x1

    const-string v2, "com.ui.wifiman.ui.speed.isp.IspDetailUi (IspDetailUi.kt:58)"

    invoke-static {v0, v9, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_e
    sget-object v0, Lla/a;->a:Lla/a;

    sget v1, Lla/a;->b:I

    invoke-virtual {v0, p2, v1}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v0

    invoke-virtual {v0}, Lma/a;->e()Lma/a$e;

    move-result-object v0

    invoke-virtual {v0}, Lma/a$e;->b()J

    move-result-wide v2

    new-instance v0, Ldf/h$a;

    invoke-direct {v0, p1}, Ldf/h$a;-><init>(Ldf/c;)V

    const/16 v1, 0x36

    const v4, -0x5daffbde

    const/4 v5, 0x1

    invoke-static {v4, v5, v0, p2, v1}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v7

    and-int/lit8 v0, v9, 0xe

    const v1, 0x30c00

    or-int v9, v0, v1

    const/16 v10, 0x14

    const/4 v4, 0x0

    const/4 v6, 0x0

    move-object v1, p0

    move-object v8, p2

    invoke-static/range {v1 .. v10}, LFe/g;->b(Landroidx/compose/ui/e;JLmh/q;ZFLmh/q;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_f

    invoke-static {}, LT/o;->P()V

    :cond_f
    :goto_7
    invoke-interface {p2}, LT/l;->z()LT/X0;

    move-result-object p2

    if-eqz p2, :cond_10

    new-instance v0, Ldf/d;

    invoke-direct {v0, p0, p1, p3, p4}, Ldf/d;-><init>(Landroidx/compose/ui/e;Ldf/c;II)V

    invoke-interface {p2, v0}, LT/X0;->a(Lmh/p;)V

    :cond_10
    return-void
.end method

.method private static final k(Landroidx/compose/ui/e;Ldf/c;IILT/l;I)LYg/J;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LT/L0;->a(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Ldf/h;->j(Landroidx/compose/ui/e;Ldf/c;LT/l;II)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method public static final synthetic l(Landroidx/compose/ui/e;LCi/c;Lmh/l;LT/l;I)V
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Ldf/h;->g(Landroidx/compose/ui/e;LCi/c;Lmh/l;LT/l;I)V

    return-void
.end method

.method private static final m(Ldf/b;)Ls9/b;
    .locals 1

    sget-object v0, Ldf/h$b;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_2

    const/4 v0, 0x2

    if-eq p0, v0, :cond_1

    const/4 v0, 0x3

    if-ne p0, v0, :cond_0

    sget-object p0, LN9/b;->a:LN9/b;

    invoke-virtual {p0}, LN9/b;->B()Ls9/b;

    move-result-object p0

    goto :goto_0

    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_1
    sget-object p0, LN9/b;->a:LN9/b;

    invoke-virtual {p0}, LN9/b;->C()Ls9/b;

    move-result-object p0

    goto :goto_0

    :cond_2
    sget-object p0, LPe/a;->a:LPe/a;

    invoke-virtual {p0}, LPe/a;->q()Ls9/b;

    move-result-object p0

    :goto_0
    return-object p0
.end method

.method private static final n(Ldf/b;)Ls9/d;
    .locals 2

    new-instance v0, Ls9/d$b;

    sget-object v1, Ldf/h$b;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v1, p0

    const/4 v1, 0x1

    if-eq p0, v1, :cond_2

    const/4 v1, 0x2

    if-eq p0, v1, :cond_1

    const/4 v1, 0x3

    if-ne p0, v1, :cond_0

    sget p0, Lm8/c;->q1:I

    goto :goto_0

    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_1
    sget p0, Lm8/c;->o1:I

    goto :goto_0

    :cond_2
    sget p0, Lm8/c;->p1:I

    :goto_0
    invoke-direct {v0, p0}, Ls9/d$b;-><init>(I)V

    return-object v0
.end method
