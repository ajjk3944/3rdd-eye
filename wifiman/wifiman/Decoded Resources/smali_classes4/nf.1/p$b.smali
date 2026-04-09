.class final Lnf/p$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnf/p;->j(Landroidx/compose/ui/e;Lnf/h;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnf/p$b$a;
    }
.end annotation


# instance fields
.field final synthetic a:Lnf/c;


# direct methods
.method constructor <init>(Lnf/c;)V
    .locals 0

    iput-object p1, p0, Lnf/p$b;->a:Lnf/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(ZLT/l;I)V
    .locals 34

    move-object/from16 v0, p0

    move/from16 v1, p1

    move-object/from16 v3, p2

    const/4 v2, 0x6

    and-int/lit8 v4, p3, 0x6

    const/4 v5, 0x2

    if-nez v4, :cond_1

    invoke-interface {v3, v1}, LT/l;->c(Z)Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 v4, 0x4

    goto :goto_0

    :cond_0
    move v4, v5

    :goto_0
    or-int v4, p3, v4

    goto :goto_1

    :cond_1
    move/from16 v4, p3

    :goto_1
    and-int/lit8 v6, v4, 0x13

    const/16 v7, 0x12

    if-ne v6, v7, :cond_3

    invoke-interface/range {p2 .. p2}, LT/l;->v()Z

    move-result v6

    if-nez v6, :cond_2

    goto :goto_2

    :cond_2
    invoke-interface/range {p2 .. p2}, LT/l;->C()V

    goto/16 :goto_7

    :cond_3
    :goto_2
    invoke-static {}, LT/o;->H()Z

    move-result v6

    if-eqz v6, :cond_4

    const/4 v6, -0x1

    const-string v7, "com.ui.wifiman.ui.speedtest.test.SpeedtestProcessContainer.<anonymous>.<anonymous> (SpeedtestProcessUi.kt:290)"

    const v8, 0x44642827

    invoke-static {v8, v4, v6, v7}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_4
    iget-object v4, v0, Lnf/p$b;->a:Lnf/c;

    invoke-virtual {v4}, Lnf/c;->c()Lnf/g;

    move-result-object v4

    sget-object v6, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x1

    invoke-static {v6, v8, v9, v7}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v6

    if-eqz v1, :cond_5

    const/high16 v8, 0x3f800000    # 1.0f

    :cond_5
    invoke-static {v6, v8}, Lj0/a;->a(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v1

    sget-object v6, Lz/c;->a:Lz/c;

    const/16 v7, 0x10

    int-to-float v7, v7

    invoke-static {v7}, LY0/h;->j(F)F

    move-result v7

    invoke-virtual {v6, v7}, Lz/c;->n(F)Lz/c$f;

    move-result-object v6

    sget-object v7, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v7}, Lf0/c$a;->g()Lf0/c$b;

    move-result-object v7

    iget-object v14, v0, Lnf/p$b;->a:Lnf/c;

    const/16 v8, 0x36

    invoke-static {v6, v7, v3, v8}, Lz/h;->a(Lz/c$m;Lf0/c$b;LT/l;I)LC0/C;

    move-result-object v6

    const/4 v15, 0x0

    invoke-static {v3, v15}, LT/j;->a(LT/l;I)I

    move-result v7

    invoke-interface/range {p2 .. p2}, LT/l;->G()LT/x;

    move-result-object v8

    invoke-static {v3, v1}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v1

    sget-object v10, LE0/g;->K:LE0/g$a;

    invoke-virtual {v10}, LE0/g$a;->a()Lmh/a;

    move-result-object v11

    invoke-interface/range {p2 .. p2}, LT/l;->x()LT/f;

    move-result-object v12

    if-nez v12, :cond_6

    invoke-static {}, LT/j;->c()V

    :cond_6
    invoke-interface/range {p2 .. p2}, LT/l;->u()V

    invoke-interface/range {p2 .. p2}, LT/l;->o()Z

    move-result v12

    if-eqz v12, :cond_7

    invoke-interface {v3, v11}, LT/l;->D(Lmh/a;)V

    goto :goto_3

    :cond_7
    invoke-interface/range {p2 .. p2}, LT/l;->I()V

    :goto_3
    invoke-static/range {p2 .. p2}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v11

    invoke-virtual {v10}, LE0/g$a;->e()Lmh/p;

    move-result-object v12

    invoke-static {v11, v6, v12}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v10}, LE0/g$a;->g()Lmh/p;

    move-result-object v6

    invoke-static {v11, v8, v6}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v10}, LE0/g$a;->b()Lmh/p;

    move-result-object v6

    invoke-interface {v11}, LT/l;->o()Z

    move-result v8

    if-nez v8, :cond_8

    invoke-interface {v11}, LT/l;->f()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v8, v12}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_9

    :cond_8
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-interface {v11, v8}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v11, v7, v6}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_9
    invoke-virtual {v10}, LE0/g$a;->f()Lmh/p;

    move-result-object v6

    invoke-static {v11, v1, v6}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v1, Lz/k;->a:Lz/k;

    sget-object v1, Lnf/p$b$a;->a:[I

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v6

    aget v6, v1, v6

    const/4 v7, 0x3

    if-eq v6, v9, :cond_c

    if-eq v6, v5, :cond_b

    if-ne v6, v7, :cond_a

    new-instance v6, Ls9/d$b;

    sget v8, Lm8/c;->m3:I

    invoke-direct {v6, v8}, Ls9/d$b;-><init>(I)V

    goto :goto_4

    :cond_a
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :cond_b
    new-instance v6, Ls9/d$b;

    sget v8, Lm8/c;->j3:I

    invoke-direct {v6, v8}, Ls9/d$b;-><init>(I)V

    goto :goto_4

    :cond_c
    new-instance v6, Ls9/d$b;

    sget v8, Lm8/c;->l3:I

    invoke-direct {v6, v8}, Ls9/d$b;-><init>(I)V

    :goto_4
    invoke-static {v6, v3, v15}, Lsa/a;->a(Ls9/d;LT/l;I)LL0/d;

    move-result-object v22

    sget-object v13, Lla/a;->a:Lla/a;

    sget v12, Lla/a;->b:I

    invoke-virtual {v13, v3, v12}, Lla/a;->c(LT/l;I)Lpa/c;

    move-result-object v6

    invoke-virtual {v6}, Lpa/c;->a()Lpa/b;

    move-result-object v6

    invoke-virtual {v6}, Lpa/b;->c()LL0/U;

    move-result-object v23

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    aget v1, v1, v4

    if-eq v1, v9, :cond_f

    if-eq v1, v5, :cond_e

    if-ne v1, v7, :cond_d

    const v1, 0x74111cac

    invoke-interface {v3, v1}, LT/l;->U(I)V

    sget-object v1, Lff/a;->UP:Lff/a;

    invoke-static {v1, v3, v2}, Lff/c;->a(Lff/a;LT/l;I)J

    move-result-wide v1

    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    :goto_5
    move-wide/from16 v27, v1

    goto :goto_6

    :cond_d
    const v1, 0x7410fdc2

    invoke-interface {v3, v1}, LT/l;->U(I)V

    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :cond_e
    const v1, 0x7411124c

    invoke-interface {v3, v1}, LT/l;->U(I)V

    sget-object v1, Lff/a;->DOWN:Lff/a;

    invoke-static {v1, v3, v2}, Lff/c;->a(Lff/a;LT/l;I)J

    move-result-wide v1

    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    goto :goto_5

    :cond_f
    const v1, 0x74110807

    invoke-interface {v3, v1}, LT/l;->U(I)V

    invoke-virtual {v13, v3, v12}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v1

    invoke-virtual {v1}, Lma/a;->f()Lma/a$f;

    move-result-object v1

    invoke-virtual {v1}, Lma/a$f;->c()J

    move-result-wide v1

    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    goto :goto_5

    :goto_6
    const/16 v25, 0x0

    const v26, 0x1fffa

    const/4 v2, 0x0

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const-wide/16 v10, 0x0

    const/4 v1, 0x0

    move v4, v12

    move-object v12, v1

    move-object/from16 v29, v13

    move-object v13, v1

    const-wide/16 v16, 0x0

    move-object/from16 v30, v14

    move v1, v15

    move-wide/from16 v14, v16

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v24, 0x0

    move-object/from16 v1, v22

    move/from16 v31, v4

    move-wide/from16 v3, v27

    move-object/from16 v22, v23

    move-object/from16 v23, p2

    invoke-static/range {v1 .. v26}, LN/a1;->c(LL0/d;Landroidx/compose/ui/e;JJLQ0/v;LQ0/A;LQ0/k;JLW0/k;LW0/j;JIZIILjava/util/Map;Lmh/l;LL0/U;LT/l;III)V

    invoke-virtual/range {v30 .. v30}, Lnf/c;->e()Ls9/d;

    move-result-object v1

    move-object/from16 v14, p2

    const/4 v15, 0x0

    invoke-static {v1, v14, v15}, Lsa/a;->a(Ls9/d;LT/l;I)LL0/d;

    move-result-object v1

    invoke-static {v14, v15}, Lnf/p;->r(LT/l;I)LL0/U;

    move-result-object v22

    move-object/from16 v13, v29

    move/from16 v12, v31

    invoke-virtual {v13, v14, v12}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v2

    invoke-virtual {v2}, Lma/a;->f()Lma/a$f;

    move-result-object v2

    invoke-virtual {v2}, Lma/a$f;->a()J

    move-result-wide v3

    const/4 v2, 0x0

    const/16 v16, 0x0

    move/from16 v32, v12

    move-object/from16 v12, v16

    move-object/from16 v33, v13

    move-object/from16 v13, v16

    const-wide/16 v16, 0x0

    move-wide/from16 v14, v16

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-static/range {v1 .. v26}, LN/a1;->c(LL0/d;Landroidx/compose/ui/e;JJLQ0/v;LQ0/A;LQ0/k;JLW0/k;LW0/j;JIZIILjava/util/Map;Lmh/l;LL0/U;LT/l;III)V

    invoke-virtual/range {v30 .. v30}, Lnf/c;->d()Ls9/d;

    move-result-object v1

    move-object/from16 v14, p2

    const/4 v2, 0x0

    invoke-static {v1, v14, v2}, Lsa/a;->a(Ls9/d;LT/l;I)LL0/d;

    move-result-object v1

    move/from16 v3, v32

    move-object/from16 v2, v33

    invoke-virtual {v2, v14, v3}, Lla/a;->c(LT/l;I)Lpa/c;

    move-result-object v4

    invoke-virtual {v4}, Lpa/c;->a()Lpa/b;

    move-result-object v4

    invoke-virtual {v4}, Lpa/b;->c()LL0/U;

    move-result-object v22

    invoke-virtual {v2, v14, v3}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v2

    invoke-virtual {v2}, Lma/a;->f()Lma/a$f;

    move-result-object v2

    invoke-virtual {v2}, Lma/a$f;->c()J

    move-result-wide v3

    const/4 v2, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const-wide/16 v15, 0x0

    move-wide v14, v15

    const/16 v16, 0x0

    invoke-static/range {v1 .. v26}, LN/a1;->c(LL0/d;Landroidx/compose/ui/e;JJLQ0/v;LQ0/A;LQ0/k;JLW0/k;LW0/j;JIZIILjava/util/Map;Lmh/l;LL0/U;LT/l;III)V

    invoke-interface/range {p2 .. p2}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_10

    invoke-static {}, LT/o;->P()V

    :cond_10
    :goto_7
    return-void
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lnf/p$b;->a(ZLT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
