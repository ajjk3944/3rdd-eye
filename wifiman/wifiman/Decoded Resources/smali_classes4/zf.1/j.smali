.class public abstract Lzf/j;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Landroidx/compose/ui/e;Lzf/h;ILT/l;I)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lzf/j;->c(Landroidx/compose/ui/e;Lzf/h;ILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Landroidx/compose/ui/e;Lzf/h;LT/l;I)V
    .locals 32

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p3

    const-string v3, "modifier"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "model"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v3, 0x6a3be529

    move-object/from16 v4, p2

    invoke-interface {v4, v3}, LT/l;->r(I)LT/l;

    move-result-object v4

    and-int/lit8 v5, v2, 0x6

    if-nez v5, :cond_1

    invoke-interface {v4, v0}, LT/l;->T(Ljava/lang/Object;)Z

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

    invoke-interface {v4, v1}, LT/l;->T(Ljava/lang/Object;)Z

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

    invoke-interface {v4}, LT/l;->v()Z

    move-result v6

    if-nez v6, :cond_4

    goto :goto_3

    :cond_4
    invoke-interface {v4}, LT/l;->C()V

    move-object/from16 v30, v4

    goto/16 :goto_9

    :cond_5
    :goto_3
    invoke-static {}, LT/o;->H()Z

    move-result v6

    if-eqz v6, :cond_6

    const/4 v6, -0x1

    const-string v8, "com.ui.wifiman.ui.wifi.channel.component.WifiChannelHealthItem (WifiChannelHealthItem.kt:38)"

    invoke-static {v3, v5, v6, v8}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_6
    int-to-float v3, v7

    invoke-static {v3}, LY0/h;->j(F)F

    move-result v5

    invoke-static {v3}, LY0/h;->j(F)F

    move-result v6

    invoke-static {v0, v5, v6}, Landroidx/compose/foundation/layout/o;->j(Landroidx/compose/ui/e;FF)Landroidx/compose/ui/e;

    move-result-object v5

    sget-object v6, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v6}, Lf0/c$a;->i()Lf0/c$c;

    move-result-object v6

    sget-object v7, Lz/c;->a:Lz/c;

    invoke-static {v3}, LY0/h;->j(F)F

    move-result v3

    invoke-virtual {v7, v3}, Lz/c;->n(F)Lz/c$f;

    move-result-object v3

    const/16 v7, 0x36

    invoke-static {v3, v6, v4, v7}, Lz/W;->b(Lz/c$e;Lf0/c$c;LT/l;I)LC0/C;

    move-result-object v3

    const/4 v15, 0x0

    invoke-static {v4, v15}, LT/j;->a(LT/l;I)I

    move-result v6

    invoke-interface {v4}, LT/l;->G()LT/x;

    move-result-object v7

    invoke-static {v4, v5}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v5

    sget-object v8, LE0/g;->K:LE0/g$a;

    invoke-virtual {v8}, LE0/g$a;->a()Lmh/a;

    move-result-object v9

    invoke-interface {v4}, LT/l;->x()LT/f;

    move-result-object v10

    if-nez v10, :cond_7

    invoke-static {}, LT/j;->c()V

    :cond_7
    invoke-interface {v4}, LT/l;->u()V

    invoke-interface {v4}, LT/l;->o()Z

    move-result v10

    if-eqz v10, :cond_8

    invoke-interface {v4, v9}, LT/l;->D(Lmh/a;)V

    goto :goto_4

    :cond_8
    invoke-interface {v4}, LT/l;->I()V

    :goto_4
    invoke-static {v4}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v9

    invoke-virtual {v8}, LE0/g$a;->e()Lmh/p;

    move-result-object v10

    invoke-static {v9, v3, v10}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v8}, LE0/g$a;->g()Lmh/p;

    move-result-object v3

    invoke-static {v9, v7, v3}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v8}, LE0/g$a;->b()Lmh/p;

    move-result-object v3

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

    invoke-interface {v9, v6, v3}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_a
    invoke-virtual {v8}, LE0/g$a;->f()Lmh/p;

    move-result-object v3

    invoke-static {v9, v5, v3}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v3, Lz/Z;->a:Lz/Z;

    invoke-virtual/range {p1 .. p1}, Lzf/h;->c()LS8/d;

    move-result-object v5

    invoke-static {v5}, LNe/i;->a(LS8/d;)Ls9/d;

    move-result-object v5

    invoke-static {v5, v4, v15}, Lsa/a;->a(Ls9/d;LT/l;I)LL0/d;

    move-result-object v25

    invoke-virtual/range {p1 .. p1}, Lzf/h;->b()Z

    move-result v5

    if-eqz v5, :cond_b

    const v5, 0x4c64f2b7    # 6.0017372E7f

    invoke-interface {v4, v5}, LT/l;->U(I)V

    sget-object v5, Lla/a;->a:Lla/a;

    sget v6, Lla/a;->b:I

    invoke-virtual {v5, v4, v6}, Lla/a;->c(LT/l;I)Lpa/c;

    move-result-object v5

    invoke-virtual {v5}, Lpa/c;->a()Lpa/b;

    move-result-object v5

    invoke-virtual {v5}, Lpa/b;->b()LL0/U;

    move-result-object v5

    invoke-interface {v4}, LT/l;->J()V

    :goto_5
    move-object/from16 v26, v5

    goto :goto_6

    :cond_b
    const v5, 0x4c660254    # 6.0295504E7f

    invoke-interface {v4, v5}, LT/l;->U(I)V

    sget-object v5, Lla/a;->a:Lla/a;

    sget v6, Lla/a;->b:I

    invoke-virtual {v5, v4, v6}, Lla/a;->c(LT/l;I)Lpa/c;

    move-result-object v5

    invoke-virtual {v5}, Lpa/c;->b()Lpa/b;

    move-result-object v5

    invoke-virtual {v5}, Lpa/b;->b()LL0/U;

    move-result-object v5

    invoke-interface {v4}, LT/l;->J()V

    goto :goto_5

    :goto_6
    sget-object v13, Lla/a;->a:Lla/a;

    sget v14, Lla/a;->b:I

    invoke-virtual {v13, v4, v14}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v5

    invoke-virtual {v5}, Lma/a;->f()Lma/a$f;

    move-result-object v5

    invoke-virtual {v5}, Lma/a$f;->a()J

    move-result-wide v6

    sget-object v5, LW0/t;->a:LW0/t$a;

    invoke-virtual {v5}, LW0/t$a;->b()I

    move-result v19

    const/16 v28, 0xc30

    const v29, 0x1d7fa

    const/4 v5, 0x0

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const-wide/16 v16, 0x0

    move-object/from16 v30, v13

    move/from16 v31, v14

    move-wide/from16 v13, v16

    const/16 v16, 0x0

    move-object/from16 v15, v16

    const-wide/16 v17, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x1

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v27, 0x0

    move-object/from16 p2, v4

    move-object/from16 v4, v25

    move-object/from16 v25, v26

    move-object/from16 v26, p2

    invoke-static/range {v4 .. v29}, LN/a1;->c(LL0/d;Landroidx/compose/ui/e;JJLQ0/v;LQ0/A;LQ0/k;JLW0/k;LW0/j;JIZIILjava/util/Map;Lmh/l;LL0/U;LT/l;III)V

    const v4, 0x448784d3

    move-object/from16 v15, p2

    invoke-interface {v15, v4}, LT/l;->U(I)V

    invoke-virtual/range {p1 .. p1}, Lzf/h;->b()Z

    move-result v4

    if-eqz v4, :cond_c

    sget-object v4, LAf/b;->a:LAf/b;

    const/4 v5, 0x6

    invoke-virtual {v4, v15, v5}, LAf/b;->c(LT/l;I)V

    :cond_c
    invoke-interface {v15}, LT/l;->J()V

    sget-object v17, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/16 v20, 0x2

    const/16 v21, 0x0

    const/high16 v18, 0x3f800000    # 1.0f

    const/16 v19, 0x0

    move-object/from16 v16, v3

    invoke-static/range {v16 .. v21}, Lz/Y;->b(Lz/Y;Landroidx/compose/ui/e;FZILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v3

    const/4 v4, 0x0

    invoke-static {v3, v15, v4}, Lz/a0;->a(Landroidx/compose/ui/e;LT/l;I)V

    invoke-virtual/range {p1 .. p1}, Lzf/h;->a()Ls9/d;

    move-result-object v3

    invoke-static {v3, v15, v4}, Lsa/a;->a(Ls9/d;LT/l;I)LL0/d;

    move-result-object v4

    invoke-virtual/range {p1 .. p1}, Lzf/h;->b()Z

    move-result v3

    if-eqz v3, :cond_d

    const v3, 0x4c6c6157    # 6.196566E7f

    invoke-interface {v15, v3}, LT/l;->U(I)V

    move-object/from16 v3, v30

    move/from16 v5, v31

    invoke-virtual {v3, v15, v5}, Lla/a;->c(LT/l;I)Lpa/c;

    move-result-object v3

    invoke-virtual {v3}, Lpa/c;->a()Lpa/b;

    move-result-object v3

    invoke-virtual {v3}, Lpa/b;->c()LL0/U;

    move-result-object v3

    invoke-interface {v15}, LT/l;->J()V

    :goto_7
    move-object/from16 v25, v3

    goto :goto_8

    :cond_d
    move-object/from16 v3, v30

    move/from16 v5, v31

    const v6, 0x4c6d70f4    # 6.224379E7f

    invoke-interface {v15, v6}, LT/l;->U(I)V

    invoke-virtual {v3, v15, v5}, Lla/a;->c(LT/l;I)Lpa/c;

    move-result-object v3

    invoke-virtual {v3}, Lpa/c;->b()Lpa/b;

    move-result-object v3

    invoke-virtual {v3}, Lpa/b;->c()LL0/U;

    move-result-object v3

    invoke-interface {v15}, LT/l;->J()V

    goto :goto_7

    :goto_8
    const/16 v28, 0xc00

    const v29, 0x1dffe

    const/4 v5, 0x0

    const-wide/16 v6, 0x0

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

    const/16 v21, 0x1

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v27, 0x0

    move-object/from16 v26, v30

    invoke-static/range {v4 .. v29}, LN/a1;->c(LL0/d;Landroidx/compose/ui/e;JJLQ0/v;LQ0/A;LQ0/k;JLW0/k;LW0/j;JIZIILjava/util/Map;Lmh/l;LL0/U;LT/l;III)V

    invoke-interface/range {v30 .. v30}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result v3

    if-eqz v3, :cond_e

    invoke-static {}, LT/o;->P()V

    :cond_e
    :goto_9
    invoke-interface/range {v30 .. v30}, LT/l;->z()LT/X0;

    move-result-object v3

    if-eqz v3, :cond_f

    new-instance v4, Lzf/i;

    invoke-direct {v4, v0, v1, v2}, Lzf/i;-><init>(Landroidx/compose/ui/e;Lzf/h;I)V

    invoke-interface {v3, v4}, LT/X0;->a(Lmh/p;)V

    :cond_f
    return-void
.end method

.method private static final c(Landroidx/compose/ui/e;Lzf/h;ILT/l;I)LYg/J;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LT/L0;->a(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lzf/j;->b(Landroidx/compose/ui/e;Lzf/h;LT/l;I)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method
