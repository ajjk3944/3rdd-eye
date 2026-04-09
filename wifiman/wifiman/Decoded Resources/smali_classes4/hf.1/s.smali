.class public abstract Lhf/s;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lhf/s$a;
    }
.end annotation


# direct methods
.method public static synthetic a(Landroidx/compose/ui/e;Lhf/b;ILT/l;I)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lhf/s;->e(Landroidx/compose/ui/e;Lhf/b;ILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroidx/compose/ui/e;Lhf/o;ILT/l;I)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lhf/s;->g(Landroidx/compose/ui/e;Lhf/o;ILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Landroidx/compose/ui/e;Lhf/n;ILT/l;I)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lhf/s;->i(Landroidx/compose/ui/e;Lhf/n;ILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method private static final d(Landroidx/compose/ui/e;Lhf/b;LT/l;I)V
    .locals 31

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p3

    const v3, 0x3a595012

    move-object/from16 v4, p2

    invoke-interface {v4, v3}, LT/l;->r(I)LT/l;

    move-result-object v15

    and-int/lit8 v4, v2, 0x6

    const/4 v10, 0x2

    if-nez v4, :cond_1

    invoke-interface {v15, v0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 v4, 0x4

    goto :goto_0

    :cond_0
    move v4, v10

    :goto_0
    or-int/2addr v4, v2

    goto :goto_1

    :cond_1
    move v4, v2

    :goto_1
    and-int/lit8 v5, v2, 0x30

    const/16 v6, 0x10

    if-nez v5, :cond_3

    invoke-interface {v15, v1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    const/16 v5, 0x20

    goto :goto_2

    :cond_2
    move v5, v6

    :goto_2
    or-int/2addr v4, v5

    :cond_3
    and-int/lit8 v5, v4, 0x13

    const/16 v7, 0x12

    if-ne v5, v7, :cond_5

    invoke-interface {v15}, LT/l;->v()Z

    move-result v5

    if-nez v5, :cond_4

    goto :goto_3

    :cond_4
    invoke-interface {v15}, LT/l;->C()V

    move-object/from16 v30, v15

    goto/16 :goto_7

    :cond_5
    :goto_3
    invoke-static {}, LT/o;->H()Z

    move-result v5

    if-eqz v5, :cond_6

    const/4 v5, -0x1

    const-string v7, "com.ui.wifiman.ui.speedtest.component.MeasurementDirectionRow (SpeedtestResultListItem.kt:128)"

    invoke-static {v3, v4, v5, v7}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_6
    sget-object v3, Lz/c;->a:Lz/c;

    int-to-float v4, v6

    invoke-static {v4}, LY0/h;->j(F)F

    move-result v4

    invoke-virtual {v3, v4}, Lz/c;->n(F)Lz/c$f;

    move-result-object v3

    sget-object v4, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v4}, Lf0/c$a;->i()Lf0/c$c;

    move-result-object v4

    const/16 v5, 0x36

    invoke-static {v3, v4, v15, v5}, Lz/W;->b(Lz/c$e;Lf0/c$c;LT/l;I)LC0/C;

    move-result-object v3

    const/4 v4, 0x0

    invoke-static {v15, v4}, LT/j;->a(LT/l;I)I

    move-result v4

    invoke-interface {v15}, LT/l;->G()LT/x;

    move-result-object v5

    invoke-static {v15, v0}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v6

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

    invoke-static {v8, v3, v9}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v7}, LE0/g$a;->g()Lmh/p;

    move-result-object v3

    invoke-static {v8, v5, v3}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v7}, LE0/g$a;->b()Lmh/p;

    move-result-object v3

    invoke-interface {v8}, LT/l;->o()Z

    move-result v5

    if-nez v5, :cond_9

    invoke-interface {v8}, LT/l;->f()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v5, v9}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_a

    :cond_9
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v8, v5}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v8, v4, v3}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_a
    invoke-virtual {v7}, LE0/g$a;->f()Lmh/p;

    move-result-object v3

    invoke-static {v8, v6, v3}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v3, Lz/Z;->a:Lz/Z;

    sget-object v4, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/16 v5, 0xd

    int-to-float v5, v5

    invoke-static {v5}, LY0/h;->j(F)F

    move-result v5

    invoke-static {v4, v5}, Landroidx/compose/foundation/layout/r;->i(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v4

    const/high16 v5, 0x3f800000    # 1.0f

    const/4 v11, 0x1

    invoke-interface {v3, v4, v5, v11}, Lz/Y;->a(Landroidx/compose/ui/e;FZ)Landroidx/compose/ui/e;

    move-result-object v4

    invoke-virtual/range {p1 .. p1}, Lhf/b;->b()LW7/a;

    move-result-object v3

    invoke-virtual {v3}, LW7/a;->c()F

    move-result v3

    invoke-virtual/range {p1 .. p1}, Lhf/b;->c()LW7/a;

    move-result-object v5

    invoke-virtual {v5}, LW7/a;->c()F

    move-result v5

    div-float v5, v3, v5

    invoke-virtual/range {p1 .. p1}, Lhf/b;->a()Lff/a;

    move-result-object v6

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v7, v15

    invoke-static/range {v4 .. v9}, Lhf/g;->c(Landroidx/compose/ui/e;FLff/a;LT/l;II)V

    invoke-virtual/range {p1 .. p1}, Lhf/b;->a()Lff/a;

    move-result-object v3

    sget-object v4, Lhf/s$a;->a:[I

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v3, v4, v3

    if-eq v3, v11, :cond_c

    if-ne v3, v10, :cond_b

    const v3, -0x32de31c4

    invoke-interface {v15, v3}, LT/l;->U(I)V

    sget-object v4, Lhf/c;->a:Lhf/c;

    invoke-virtual/range {p1 .. p1}, Lhf/b;->b()LW7/a;

    move-result-object v7

    const v12, 0x1b0006

    const/16 v13, 0x1a

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v11, v15

    invoke-virtual/range {v4 .. v13}, Lhf/c;->a(LW7/a;ZLW7/a;ZLjava/lang/String;Ls9/d;LT/l;II)LL0/d;

    move-result-object v3

    invoke-interface {v15}, LT/l;->J()V

    :goto_5
    move-object v4, v3

    goto :goto_6

    :cond_b
    const v0, -0x32de5550

    invoke-interface {v15, v0}, LT/l;->U(I)V

    invoke-interface {v15}, LT/l;->J()V

    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_c
    const v3, -0x32de4b84    # -1.6956E8f

    invoke-interface {v15, v3}, LT/l;->U(I)V

    sget-object v4, Lhf/c;->a:Lhf/c;

    invoke-virtual/range {p1 .. p1}, Lhf/b;->b()LW7/a;

    move-result-object v5

    const v12, 0x1b0180

    const/16 v13, 0x1a

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v11, v15

    invoke-virtual/range {v4 .. v13}, Lhf/c;->a(LW7/a;ZLW7/a;ZLjava/lang/String;Ls9/d;LT/l;II)LL0/d;

    move-result-object v3

    invoke-interface {v15}, LT/l;->J()V

    goto :goto_5

    :goto_6
    sget-object v3, Lhf/c;->a:Lhf/c;

    sget-object v5, Lla/a;->a:Lla/a;

    sget v6, Lla/a;->b:I

    invoke-virtual {v5, v15, v6}, Lla/a;->c(LT/l;I)Lpa/c;

    move-result-object v7

    invoke-virtual {v7}, Lpa/c;->b()Lpa/b;

    move-result-object v7

    invoke-virtual {v7}, Lpa/b;->f()LL0/U;

    move-result-object v7

    invoke-virtual {v7}, LL0/U;->l()J

    move-result-wide v7

    invoke-static {v7, v8}, LY0/w;->b(J)V

    invoke-static {v7, v8}, LY0/v;->f(J)J

    move-result-wide v9

    invoke-static {v7, v8}, LY0/v;->h(J)F

    move-result v7

    const v8, 0x3f4ccccd    # 0.8f

    mul-float/2addr v7, v8

    invoke-static {v9, v10, v7}, LY0/w;->j(JF)J

    move-result-wide v7

    const/16 v9, 0x30

    invoke-virtual {v3, v7, v8, v15, v9}, Lhf/c;->f(JLT/l;I)Ljava/util/Map;

    move-result-object v23

    invoke-virtual {v5, v15, v6}, Lla/a;->c(LT/l;I)Lpa/c;

    move-result-object v3

    invoke-virtual {v3}, Lpa/c;->b()Lpa/b;

    move-result-object v3

    invoke-virtual {v3}, Lpa/b;->f()LL0/U;

    move-result-object v25

    invoke-virtual {v5, v15, v6}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v3

    invoke-virtual {v3}, Lma/a;->f()Lma/a$f;

    move-result-object v3

    invoke-virtual {v3}, Lma/a$f;->a()J

    move-result-wide v6

    const/16 v28, 0x0

    const v29, 0x17ffa

    const/4 v5, 0x0

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    const/4 v3, 0x0

    move-object/from16 v30, v15

    move-object v15, v3

    const/16 v16, 0x0

    const-wide/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v24, 0x0

    const/16 v27, 0x0

    move-object/from16 v26, v30

    invoke-static/range {v4 .. v29}, LN/a1;->c(LL0/d;Landroidx/compose/ui/e;JJLQ0/v;LQ0/A;LQ0/k;JLW0/k;LW0/j;JIZIILjava/util/Map;Lmh/l;LL0/U;LT/l;III)V

    invoke-interface/range {v30 .. v30}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result v3

    if-eqz v3, :cond_d

    invoke-static {}, LT/o;->P()V

    :cond_d
    :goto_7
    invoke-interface/range {v30 .. v30}, LT/l;->z()LT/X0;

    move-result-object v3

    if-eqz v3, :cond_e

    new-instance v4, Lhf/r;

    invoke-direct {v4, v0, v1, v2}, Lhf/r;-><init>(Landroidx/compose/ui/e;Lhf/b;I)V

    invoke-interface {v3, v4}, LT/X0;->a(Lmh/p;)V

    :cond_e
    return-void
.end method

.method private static final e(Landroidx/compose/ui/e;Lhf/b;ILT/l;I)LYg/J;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LT/L0;->a(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lhf/s;->d(Landroidx/compose/ui/e;Lhf/b;LT/l;I)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method public static final f(Landroidx/compose/ui/e;Lhf/o;LT/l;I)V
    .locals 33

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p3

    const/16 v3, 0x30

    const-string v4, "modifier"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "model"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v4, 0x5f8995f0

    move-object/from16 v5, p2

    invoke-interface {v5, v4}, LT/l;->r(I)LT/l;

    move-result-object v14

    const/4 v15, 0x6

    and-int/lit8 v5, v2, 0x6

    if-nez v5, :cond_1

    invoke-interface {v14, v0}, LT/l;->T(Ljava/lang/Object;)Z

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

    if-nez v6, :cond_3

    invoke-interface {v14, v1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    const/16 v6, 0x20

    goto :goto_2

    :cond_2
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v5, v6

    :cond_3
    and-int/lit8 v6, v5, 0x13

    const/16 v7, 0x12

    if-ne v6, v7, :cond_5

    invoke-interface {v14}, LT/l;->v()Z

    move-result v6

    if-nez v6, :cond_4

    goto :goto_3

    :cond_4
    invoke-interface {v14}, LT/l;->C()V

    move-object v4, v14

    goto/16 :goto_7

    :cond_5
    :goto_3
    invoke-static {}, LT/o;->H()Z

    move-result v6

    if-eqz v6, :cond_6

    const/4 v6, -0x1

    const-string v7, "com.ui.wifiman.ui.speedtest.component.SpeedtestResultListItem (SpeedtestResultListItem.kt:68)"

    invoke-static {v4, v5, v6, v7}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_6
    sget-object v4, Lz/c;->a:Lz/c;

    const/16 v5, 0x8

    int-to-float v5, v5

    invoke-static {v5}, LY0/h;->j(F)F

    move-result v5

    invoke-virtual {v4, v5}, Lz/c;->n(F)Lz/c$f;

    move-result-object v5

    sget-object v6, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v6}, Lf0/c$a;->k()Lf0/c$b;

    move-result-object v7

    invoke-static {v5, v7, v14, v15}, Lz/h;->a(Lz/c$m;Lf0/c$b;LT/l;I)LC0/C;

    move-result-object v5

    const/4 v11, 0x0

    invoke-static {v14, v11}, LT/j;->a(LT/l;I)I

    move-result v7

    invoke-interface {v14}, LT/l;->G()LT/x;

    move-result-object v8

    invoke-static {v14, v0}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v9

    sget-object v10, LE0/g;->K:LE0/g$a;

    invoke-virtual {v10}, LE0/g$a;->a()Lmh/a;

    move-result-object v12

    invoke-interface {v14}, LT/l;->x()LT/f;

    move-result-object v16

    if-nez v16, :cond_7

    invoke-static {}, LT/j;->c()V

    :cond_7
    invoke-interface {v14}, LT/l;->u()V

    invoke-interface {v14}, LT/l;->o()Z

    move-result v16

    if-eqz v16, :cond_8

    invoke-interface {v14, v12}, LT/l;->D(Lmh/a;)V

    goto :goto_4

    :cond_8
    invoke-interface {v14}, LT/l;->I()V

    :goto_4
    invoke-static {v14}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v12

    invoke-virtual {v10}, LE0/g$a;->e()Lmh/p;

    move-result-object v13

    invoke-static {v12, v5, v13}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v10}, LE0/g$a;->g()Lmh/p;

    move-result-object v5

    invoke-static {v12, v8, v5}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v10}, LE0/g$a;->b()Lmh/p;

    move-result-object v5

    invoke-interface {v12}, LT/l;->o()Z

    move-result v8

    if-nez v8, :cond_9

    invoke-interface {v12}, LT/l;->f()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v8, v13}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_a

    :cond_9
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-interface {v12, v8}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v12, v7, v5}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_a
    invoke-virtual {v10}, LE0/g$a;->f()Lmh/p;

    move-result-object v5

    invoke-static {v12, v9, v5}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v5, Lz/k;->a:Lz/k;

    sget-object v13, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/4 v12, 0x0

    const/4 v9, 0x1

    const/4 v7, 0x0

    invoke-static {v13, v12, v9, v7}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v5

    invoke-virtual {v6}, Lf0/c$a;->i()Lf0/c$c;

    move-result-object v6

    invoke-virtual {v4}, Lz/c;->f()Lz/c$e;

    move-result-object v4

    invoke-static {v4, v6, v14, v3}, Lz/W;->b(Lz/c$e;Lf0/c$c;LT/l;I)LC0/C;

    move-result-object v3

    invoke-static {v14, v11}, LT/j;->a(LT/l;I)I

    move-result v4

    invoke-interface {v14}, LT/l;->G()LT/x;

    move-result-object v6

    invoke-static {v14, v5}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v5

    invoke-virtual {v10}, LE0/g$a;->a()Lmh/a;

    move-result-object v8

    invoke-interface {v14}, LT/l;->x()LT/f;

    move-result-object v17

    if-nez v17, :cond_b

    invoke-static {}, LT/j;->c()V

    :cond_b
    invoke-interface {v14}, LT/l;->u()V

    invoke-interface {v14}, LT/l;->o()Z

    move-result v17

    if-eqz v17, :cond_c

    invoke-interface {v14, v8}, LT/l;->D(Lmh/a;)V

    goto :goto_5

    :cond_c
    invoke-interface {v14}, LT/l;->I()V

    :goto_5
    invoke-static {v14}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v8

    invoke-virtual {v10}, LE0/g$a;->e()Lmh/p;

    move-result-object v7

    invoke-static {v8, v3, v7}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v10}, LE0/g$a;->g()Lmh/p;

    move-result-object v3

    invoke-static {v8, v6, v3}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v10}, LE0/g$a;->b()Lmh/p;

    move-result-object v3

    invoke-interface {v8}, LT/l;->o()Z

    move-result v6

    if-nez v6, :cond_d

    invoke-interface {v8}, LT/l;->f()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v6, v7}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_e

    :cond_d
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v8, v6}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v8, v4, v3}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_e
    invoke-virtual {v10}, LE0/g$a;->f()Lmh/p;

    move-result-object v3

    invoke-static {v8, v5, v3}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v3, Lz/Z;->a:Lz/Z;

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-interface {v3, v13, v4, v11}, Lz/Y;->a(Landroidx/compose/ui/e;FZ)Landroidx/compose/ui/e;

    move-result-object v6

    invoke-virtual/range {p1 .. p1}, Lhf/o;->d()Ls9/d;

    move-result-object v5

    invoke-static {v5, v14, v11}, Lsa/a;->a(Ls9/d;LT/l;I)LL0/d;

    move-result-object v5

    sget-object v10, Lla/a;->a:Lla/a;

    sget v7, Lla/a;->b:I

    invoke-virtual {v10, v14, v7}, Lla/a;->c(LT/l;I)Lpa/c;

    move-result-object v8

    invoke-virtual {v8}, Lpa/c;->a()Lpa/b;

    move-result-object v8

    invoke-virtual {v8}, Lpa/b;->f()LL0/U;

    move-result-object v26

    invoke-virtual {v10, v14, v7}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v8

    invoke-virtual {v8}, Lma/a;->f()Lma/a$f;

    move-result-object v8

    invoke-virtual {v8}, Lma/a$f;->b()J

    move-result-wide v18

    move v4, v7

    move-wide/from16 v7, v18

    const/16 v29, 0x0

    const v30, 0x1fff8

    const-wide/16 v17, 0x0

    move-object/from16 v31, v10

    move-wide/from16 v9, v17

    const/16 v17, 0x0

    move-object/from16 v11, v17

    move-object/from16 v12, v17

    move-object/from16 v32, v13

    move-object/from16 v13, v17

    const-wide/16 v16, 0x0

    move-object/from16 p2, v14

    move-wide/from16 v14, v16

    const/16 v16, 0x0

    const/16 v17, 0x0

    const-wide/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v28, 0x0

    move-object/from16 v27, p2

    invoke-static/range {v5 .. v30}, LN/a1;->c(LL0/d;Landroidx/compose/ui/e;JJLQ0/v;LQ0/A;LQ0/k;JLW0/k;LW0/j;JIZIILjava/util/Map;Lmh/l;LL0/U;LT/l;III)V

    const/16 v5, 0x10

    int-to-float v5, v5

    invoke-static {v5}, LY0/h;->j(F)F

    move-result v5

    move-object/from16 v12, v32

    invoke-static {v12, v5}, Landroidx/compose/foundation/layout/r;->z(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v5

    move-object/from16 v14, p2

    const/4 v15, 0x6

    invoke-static {v5, v14, v15}, Lz/a0;->a(Landroidx/compose/ui/e;LT/l;I)V

    invoke-virtual/range {p1 .. p1}, Lhf/o;->a()Ls9/b;

    move-result-object v5

    const/16 v6, 0x14

    int-to-float v6, v6

    invoke-static {v6}, LY0/h;->j(F)F

    move-result v6

    invoke-static {v12, v6}, Landroidx/compose/foundation/layout/r;->v(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v6

    move-object/from16 v13, v31

    invoke-virtual {v13, v14, v4}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v7

    invoke-virtual {v7}, Lma/a;->c()Lma/a$c;

    move-result-object v7

    invoke-virtual {v7}, Lma/a$c;->a()J

    move-result-wide v7

    invoke-static {v7, v8}, Lm0/v0;->g(J)Lm0/v0;

    move-result-object v7

    const/16 v10, 0x30

    const/4 v11, 0x4

    const/4 v8, 0x0

    move-object v9, v14

    invoke-static/range {v5 .. v11}, Lta/c;->c(Ls9/b;Landroidx/compose/ui/e;Lm0/v0;Ljava/lang/String;LT/l;II)V

    const/4 v5, 0x2

    int-to-float v5, v5

    invoke-static {v5}, LY0/h;->j(F)F

    move-result v5

    invoke-static {v12, v5}, Landroidx/compose/foundation/layout/r;->z(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v5

    invoke-static {v5, v14, v15}, Lz/a0;->a(Landroidx/compose/ui/e;LT/l;I)V

    const/4 v5, 0x0

    const/high16 v6, 0x3f800000    # 1.0f

    invoke-interface {v3, v12, v6, v5}, Lz/Y;->a(Landroidx/compose/ui/e;FZ)Landroidx/compose/ui/e;

    move-result-object v6

    invoke-virtual/range {p1 .. p1}, Lhf/o;->b()Ls9/d;

    move-result-object v3

    invoke-static {v3, v14, v5}, Lsa/a;->a(Ls9/d;LT/l;I)LL0/d;

    move-result-object v5

    invoke-virtual {v13, v14, v4}, Lla/a;->c(LT/l;I)Lpa/c;

    move-result-object v3

    invoke-virtual {v3}, Lpa/c;->b()Lpa/b;

    move-result-object v3

    invoke-virtual {v3}, Lpa/b;->f()LL0/U;

    move-result-object v26

    invoke-virtual {v13, v14, v4}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v3

    invoke-virtual {v3}, Lma/a;->f()Lma/a$f;

    move-result-object v3

    invoke-virtual {v3}, Lma/a$f;->b()J

    move-result-wide v7

    sget-object v3, LW0/t;->a:LW0/t$a;

    invoke-virtual {v3}, LW0/t$a;->b()I

    move-result v20

    const/16 v29, 0xc30

    const v30, 0x1d7f8

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const-wide/16 v3, 0x0

    move-wide v14, v3

    const/16 v22, 0x1

    invoke-static/range {v5 .. v30}, LN/a1;->c(LL0/d;Landroidx/compose/ui/e;JJLQ0/v;LQ0/A;LQ0/k;JLW0/k;LW0/j;JIZIILjava/util/Map;Lmh/l;LL0/U;LT/l;III)V

    invoke-interface/range {p2 .. p2}, LT/l;->R()V

    const v3, 0x5ce5f434

    move-object/from16 v4, p2

    invoke-interface {v4, v3}, LT/l;->U(I)V

    invoke-virtual/range {p1 .. p1}, Lhf/o;->c()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_6
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_f

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lhf/n;

    sget-object v6, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/4 v7, 0x0

    const/4 v8, 0x1

    const/4 v9, 0x0

    invoke-static {v6, v7, v8, v9}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v6

    const/4 v10, 0x6

    invoke-static {v6, v5, v4, v10}, Lhf/s;->h(Landroidx/compose/ui/e;Lhf/n;LT/l;I)V

    goto :goto_6

    :cond_f
    invoke-interface {v4}, LT/l;->J()V

    invoke-interface {v4}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result v3

    if-eqz v3, :cond_10

    invoke-static {}, LT/o;->P()V

    :cond_10
    :goto_7
    invoke-interface {v4}, LT/l;->z()LT/X0;

    move-result-object v3

    if-eqz v3, :cond_11

    new-instance v4, Lhf/p;

    invoke-direct {v4, v0, v1, v2}, Lhf/p;-><init>(Landroidx/compose/ui/e;Lhf/o;I)V

    invoke-interface {v3, v4}, LT/X0;->a(Lmh/p;)V

    :cond_11
    return-void
.end method

.method private static final g(Landroidx/compose/ui/e;Lhf/o;ILT/l;I)LYg/J;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LT/L0;->a(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lhf/s;->f(Landroidx/compose/ui/e;Lhf/o;LT/l;I)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method public static final h(Landroidx/compose/ui/e;Lhf/n;LT/l;I)V
    .locals 34

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p3

    const-string v3, "modifier"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "model"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v3, 0x4b427945    # 1.2745029E7f

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

    if-nez v6, :cond_3

    invoke-interface {v15, v1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    const/16 v6, 0x20

    goto :goto_2

    :cond_2
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v5, v6

    :cond_3
    and-int/lit8 v6, v5, 0x13

    const/16 v7, 0x12

    if-ne v6, v7, :cond_5

    invoke-interface {v15}, LT/l;->v()Z

    move-result v6

    if-nez v6, :cond_4

    goto :goto_3

    :cond_4
    invoke-interface {v15}, LT/l;->C()V

    move-object/from16 v30, v15

    goto/16 :goto_9

    :cond_5
    :goto_3
    invoke-static {}, LT/o;->H()Z

    move-result v6

    if-eqz v6, :cond_6

    const/4 v6, -0x1

    const-string v7, "com.ui.wifiman.ui.speedtest.component.SpeedtestResultMeasurement (SpeedtestResultListItem.kt:171)"

    invoke-static {v3, v5, v6, v7}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_6
    sget-object v3, Lz/c;->a:Lz/c;

    const/16 v5, 0x8

    int-to-float v5, v5

    invoke-static {v5}, LY0/h;->j(F)F

    move-result v6

    invoke-virtual {v3, v6}, Lz/c;->n(F)Lz/c$f;

    move-result-object v6

    sget-object v7, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v7}, Lf0/c$a;->k()Lf0/c$b;

    move-result-object v8

    invoke-static {v6, v8, v15, v4}, Lz/h;->a(Lz/c$m;Lf0/c$b;LT/l;I)LC0/C;

    move-result-object v6

    const/4 v14, 0x0

    invoke-static {v15, v14}, LT/j;->a(LT/l;I)I

    move-result v8

    invoke-interface {v15}, LT/l;->G()LT/x;

    move-result-object v9

    invoke-static {v15, v0}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v10

    sget-object v11, LE0/g;->K:LE0/g$a;

    invoke-virtual {v11}, LE0/g$a;->a()Lmh/a;

    move-result-object v12

    invoke-interface {v15}, LT/l;->x()LT/f;

    move-result-object v16

    if-nez v16, :cond_7

    invoke-static {}, LT/j;->c()V

    :cond_7
    invoke-interface {v15}, LT/l;->u()V

    invoke-interface {v15}, LT/l;->o()Z

    move-result v16

    if-eqz v16, :cond_8

    invoke-interface {v15, v12}, LT/l;->D(Lmh/a;)V

    goto :goto_4

    :cond_8
    invoke-interface {v15}, LT/l;->I()V

    :goto_4
    invoke-static {v15}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v12

    invoke-virtual {v11}, LE0/g$a;->e()Lmh/p;

    move-result-object v13

    invoke-static {v12, v6, v13}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v11}, LE0/g$a;->g()Lmh/p;

    move-result-object v6

    invoke-static {v12, v9, v6}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v11}, LE0/g$a;->b()Lmh/p;

    move-result-object v6

    invoke-interface {v12}, LT/l;->o()Z

    move-result v9

    if-nez v9, :cond_9

    invoke-interface {v12}, LT/l;->f()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v9, v13}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_a

    :cond_9
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-interface {v12, v9}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-interface {v12, v8, v6}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_a
    invoke-virtual {v11}, LE0/g$a;->f()Lmh/p;

    move-result-object v6

    invoke-static {v12, v10, v6}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v6, Lz/k;->a:Lz/k;

    invoke-virtual/range {p1 .. p1}, Lhf/n;->a()LW7/a;

    move-result-object v6

    const v8, 0x70bbb338

    invoke-interface {v15, v8}, LT/l;->U(I)V

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v13, 0x1

    if-nez v6, :cond_b

    goto :goto_5

    :cond_b
    sget-object v10, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    invoke-static {v10, v9, v13, v8}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v10

    invoke-virtual/range {p1 .. p1}, Lhf/n;->e()LW7/a;

    move-result-object v12

    sget-object v14, Lff/a;->DOWN:Lff/a;

    new-instance v8, Lhf/b;

    invoke-direct {v8, v14, v6, v12}, Lhf/b;-><init>(Lff/a;LW7/a;LW7/a;)V

    invoke-static {v10, v8, v15, v4}, Lhf/s;->d(Landroidx/compose/ui/e;Lhf/b;LT/l;I)V

    sget-object v6, LYg/J;->a:LYg/J;

    :goto_5
    invoke-interface {v15}, LT/l;->J()V

    invoke-virtual/range {p1 .. p1}, Lhf/n;->f()LW7/a;

    move-result-object v6

    const v8, 0x70bbded6

    invoke-interface {v15, v8}, LT/l;->U(I)V

    if-nez v6, :cond_c

    const/4 v10, 0x0

    goto :goto_6

    :cond_c
    sget-object v8, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/4 v10, 0x0

    invoke-static {v8, v9, v13, v10}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v8

    invoke-virtual/range {p1 .. p1}, Lhf/n;->e()LW7/a;

    move-result-object v12

    sget-object v14, Lff/a;->UP:Lff/a;

    new-instance v9, Lhf/b;

    invoke-direct {v9, v14, v6, v12}, Lhf/b;-><init>(Lff/a;LW7/a;LW7/a;)V

    invoke-static {v8, v9, v15, v4}, Lhf/s;->d(Landroidx/compose/ui/e;Lhf/b;LT/l;I)V

    sget-object v4, LYg/J;->a:LYg/J;

    :goto_6
    invoke-interface {v15}, LT/l;->J()V

    sget-object v14, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/4 v4, 0x0

    invoke-static {v14, v4, v13, v10}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v4

    invoke-static {v5}, LY0/h;->j(F)F

    move-result v5

    invoke-virtual {v3, v5}, Lz/c;->n(F)Lz/c$f;

    move-result-object v3

    invoke-virtual {v7}, Lf0/c$a;->i()Lf0/c$c;

    move-result-object v5

    const/16 v6, 0x36

    invoke-static {v3, v5, v15, v6}, Lz/W;->b(Lz/c$e;Lf0/c$c;LT/l;I)LC0/C;

    move-result-object v3

    const/4 v5, 0x0

    invoke-static {v15, v5}, LT/j;->a(LT/l;I)I

    move-result v6

    invoke-interface {v15}, LT/l;->G()LT/x;

    move-result-object v5

    invoke-static {v15, v4}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v4

    invoke-virtual {v11}, LE0/g$a;->a()Lmh/a;

    move-result-object v7

    invoke-interface {v15}, LT/l;->x()LT/f;

    move-result-object v8

    if-nez v8, :cond_d

    invoke-static {}, LT/j;->c()V

    :cond_d
    invoke-interface {v15}, LT/l;->u()V

    invoke-interface {v15}, LT/l;->o()Z

    move-result v8

    if-eqz v8, :cond_e

    invoke-interface {v15, v7}, LT/l;->D(Lmh/a;)V

    goto :goto_7

    :cond_e
    invoke-interface {v15}, LT/l;->I()V

    :goto_7
    invoke-static {v15}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v7

    invoke-virtual {v11}, LE0/g$a;->e()Lmh/p;

    move-result-object v8

    invoke-static {v7, v3, v8}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v11}, LE0/g$a;->g()Lmh/p;

    move-result-object v3

    invoke-static {v7, v5, v3}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v11}, LE0/g$a;->b()Lmh/p;

    move-result-object v3

    invoke-interface {v7}, LT/l;->o()Z

    move-result v5

    if-nez v5, :cond_f

    invoke-interface {v7}, LT/l;->f()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v5, v8}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_10

    :cond_f
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v7, v5}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v7, v5, v3}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_10
    invoke-virtual {v11}, LE0/g$a;->f()Lmh/p;

    move-result-object v3

    invoke-static {v7, v4, v3}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v3, Lz/Z;->a:Lz/Z;

    invoke-virtual/range {p1 .. p1}, Lhf/n;->c()Ls9/b;

    move-result-object v4

    const/16 v5, 0x18

    int-to-float v5, v5

    invoke-static {v5}, LY0/h;->j(F)F

    move-result v5

    invoke-static {v14, v5}, Landroidx/compose/foundation/layout/r;->v(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v5

    sget-object v12, Lla/a;->a:Lla/a;

    sget v11, Lla/a;->b:I

    invoke-virtual {v12, v15, v11}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v6

    invoke-virtual {v6}, Lma/a;->c()Lma/a$c;

    move-result-object v6

    invoke-virtual {v6}, Lma/a$c;->a()J

    move-result-wide v6

    invoke-static {v6, v7}, Lm0/v0;->g(J)Lm0/v0;

    move-result-object v6

    const/16 v9, 0x30

    const/4 v10, 0x4

    const/4 v7, 0x0

    move-object v8, v15

    invoke-static/range {v4 .. v10}, Lta/c;->c(Ls9/b;Landroidx/compose/ui/e;Lm0/v0;Ljava/lang/String;LT/l;II)V

    const/high16 v4, 0x3f800000    # 1.0f

    const/4 v10, 0x0

    invoke-interface {v3, v14, v4, v10}, Lz/Y;->a(Landroidx/compose/ui/e;FZ)Landroidx/compose/ui/e;

    move-result-object v5

    invoke-virtual/range {p1 .. p1}, Lhf/n;->b()Ls9/d;

    move-result-object v3

    invoke-static {v3, v15, v10}, Lsa/a;->a(Ls9/d;LT/l;I)LL0/d;

    move-result-object v4

    invoke-virtual {v12, v15, v11}, Lla/a;->c(LT/l;I)Lpa/c;

    move-result-object v3

    invoke-virtual {v3}, Lpa/c;->b()Lpa/b;

    move-result-object v3

    invoke-virtual {v3}, Lpa/b;->f()LL0/U;

    move-result-object v25

    invoke-virtual {v12, v15, v11}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v3

    invoke-virtual {v3}, Lma/a;->f()Lma/a$f;

    move-result-object v3

    invoke-virtual {v3}, Lma/a$f;->c()J

    move-result-wide v6

    sget-object v3, LW0/t;->a:LW0/t$a;

    invoke-virtual {v3}, LW0/t$a;->b()I

    move-result v19

    const/16 v28, 0xc30

    const v29, 0x1d7f8

    const-wide/16 v8, 0x0

    const/4 v3, 0x0

    move/from16 v16, v10

    move-object v10, v3

    move/from16 v30, v11

    move-object v11, v3

    move-object/from16 v31, v12

    move-object v12, v3

    const-wide/16 v17, 0x0

    move v3, v13

    move-object/from16 v32, v14

    move-wide/from16 v13, v17

    const/16 v16, 0x0

    move-object/from16 v33, v15

    move-object/from16 v15, v16

    const/16 v20, 0x0

    const/16 v21, 0x1

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v27, 0x0

    move-object/from16 v26, v33

    invoke-static/range {v4 .. v29}, LN/a1;->c(LL0/d;Landroidx/compose/ui/e;JJLQ0/v;LQ0/A;LQ0/k;JLW0/k;LW0/j;JIZIILjava/util/Map;Lmh/l;LL0/U;LT/l;III)V

    invoke-virtual/range {p1 .. p1}, Lhf/n;->d()Lb8/b;

    move-result-object v4

    const v5, 0x2ff1971d

    move-object/from16 v15, v33

    invoke-interface {v15, v5}, LT/l;->U(I)V

    if-nez v4, :cond_11

    move-object/from16 v30, v15

    goto/16 :goto_8

    :cond_11
    const/16 v4, 0xa

    int-to-float v4, v4

    invoke-static {v4}, LY0/h;->j(F)F

    move-result v4

    int-to-float v3, v3

    invoke-static {v3}, LY0/h;->j(F)F

    move-result v3

    move-object/from16 v5, v32

    invoke-static {v5, v3, v4}, Landroidx/compose/foundation/layout/r;->w(Landroidx/compose/ui/e;FF)Landroidx/compose/ui/e;

    move-result-object v3

    const/4 v4, 0x2

    int-to-float v4, v4

    invoke-static {v4}, LY0/h;->j(F)F

    move-result v4

    invoke-static {v4}, LE/h;->d(F)LE/g;

    move-result-object v4

    move/from16 v7, v30

    move-object/from16 v6, v31

    invoke-virtual {v6, v15, v7}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v8

    invoke-virtual {v8}, Lma/a;->f()Lma/a$f;

    move-result-object v8

    invoke-virtual {v8}, Lma/a$f;->c()J

    move-result-wide v8

    invoke-static {v3, v8, v9, v4}, Landroidx/compose/foundation/b;->c(Landroidx/compose/ui/e;JLm0/i1;)Landroidx/compose/ui/e;

    move-result-object v3

    const/4 v4, 0x0

    invoke-static {v3, v15, v4}, Landroidx/compose/foundation/layout/d;->a(Landroidx/compose/ui/e;LT/l;I)V

    invoke-virtual/range {p1 .. p1}, Lhf/n;->d()Lb8/b;

    move-result-object v3

    invoke-static {v3, v4}, LNe/d;->c(Lb8/b;Z)Ls9/d;

    move-result-object v3

    invoke-static {v3, v15, v4}, Lsa/a;->a(Ls9/d;LT/l;I)LL0/d;

    move-result-object v4

    invoke-virtual {v6, v15, v7}, Lla/a;->c(LT/l;I)Lpa/c;

    move-result-object v3

    invoke-virtual {v3}, Lpa/c;->b()Lpa/b;

    move-result-object v3

    invoke-virtual {v3}, Lpa/b;->f()LL0/U;

    move-result-object v25

    invoke-virtual {v6, v15, v7}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v3

    invoke-virtual {v3}, Lma/a;->f()Lma/a$f;

    move-result-object v3

    invoke-virtual {v3}, Lma/a$f;->c()J

    move-result-wide v6

    const/16 v28, 0x0

    const v29, 0x1fff8

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    const/4 v3, 0x0

    move-object/from16 v30, v15

    move-object v15, v3

    const/16 v16, 0x0

    const-wide/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v27, 0x30

    move-object/from16 v26, v30

    invoke-static/range {v4 .. v29}, LN/a1;->c(LL0/d;Landroidx/compose/ui/e;JJLQ0/v;LQ0/A;LQ0/k;JLW0/k;LW0/j;JIZIILjava/util/Map;Lmh/l;LL0/U;LT/l;III)V

    sget-object v3, LYg/J;->a:LYg/J;

    :goto_8
    invoke-interface/range {v30 .. v30}, LT/l;->J()V

    invoke-interface/range {v30 .. v30}, LT/l;->R()V

    invoke-interface/range {v30 .. v30}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result v3

    if-eqz v3, :cond_12

    invoke-static {}, LT/o;->P()V

    :cond_12
    :goto_9
    invoke-interface/range {v30 .. v30}, LT/l;->z()LT/X0;

    move-result-object v3

    if-eqz v3, :cond_13

    new-instance v4, Lhf/q;

    invoke-direct {v4, v0, v1, v2}, Lhf/q;-><init>(Landroidx/compose/ui/e;Lhf/n;I)V

    invoke-interface {v3, v4}, LT/X0;->a(Lmh/p;)V

    :cond_13
    return-void
.end method

.method private static final i(Landroidx/compose/ui/e;Lhf/n;ILT/l;I)LYg/J;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LT/L0;->a(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lhf/s;->h(Landroidx/compose/ui/e;Lhf/n;LT/l;I)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method
