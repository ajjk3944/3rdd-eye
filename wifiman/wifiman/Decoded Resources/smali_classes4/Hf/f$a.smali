.class final LHf/f$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LHf/f;->b(LHf/d;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LHf/d;


# direct methods
.method constructor <init>(LHf/d;)V
    .locals 0

    iput-object p1, p0, LHf/f$a;->a:LHf/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lz/N;LT/l;I)V
    .locals 38

    move-object/from16 v0, p1

    move-object/from16 v15, p2

    const-string v1, "scaffoldPadding"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x6

    and-int/lit8 v2, p3, 0x6

    if-nez v2, :cond_1

    invoke-interface {v15, v0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    :goto_0
    or-int v2, p3, v2

    goto :goto_1

    :cond_1
    move/from16 v2, p3

    :goto_1
    and-int/lit8 v3, v2, 0x13

    const/16 v4, 0x12

    if-ne v3, v4, :cond_3

    invoke-interface/range {p2 .. p2}, LT/l;->v()Z

    move-result v3

    if-nez v3, :cond_2

    goto :goto_2

    :cond_2
    invoke-interface/range {p2 .. p2}, LT/l;->C()V

    goto/16 :goto_b

    :cond_3
    :goto_2
    invoke-static {}, LT/o;->H()Z

    move-result v3

    if-eqz v3, :cond_4

    const/4 v3, -0x1

    const-string v4, "com.ui.wifiman.ui.wizard.AppWizardStepUi.<anonymous> (AppWizardStep.kt:64)"

    const v5, 0x57c67396

    invoke-static {v5, v2, v3, v4}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_4
    sget-object v14, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/4 v11, 0x0

    const/4 v12, 0x1

    const/4 v10, 0x0

    invoke-static {v14, v11, v12, v10}, Landroidx/compose/foundation/layout/r;->f(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v2

    invoke-static {v2, v0}, Landroidx/compose/foundation/layout/o;->h(Landroidx/compose/ui/e;Lz/N;)Landroidx/compose/ui/e;

    move-result-object v0

    sget-object v9, Lla/a;->a:Lla/a;

    sget v8, Lla/a;->b:I

    invoke-virtual {v9, v15, v8}, Lla/a;->d(LT/l;I)Lra/a;

    move-result-object v2

    invoke-virtual {v2}, Lra/a;->a()Lra/b;

    move-result-object v2

    invoke-virtual {v2}, Lra/b;->b()Lra/b$a$b;

    move-result-object v2

    invoke-virtual {v2}, Lra/b$a$b;->d()F

    move-result v2

    invoke-static {v0, v11, v2, v12, v10}, Landroidx/compose/foundation/layout/o;->k(Landroidx/compose/ui/e;FFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v0

    sget-object v2, Lz/c;->a:Lz/c;

    const/16 v3, 0x8

    int-to-float v3, v3

    invoke-static {v3}, LY0/h;->j(F)F

    move-result v3

    invoke-virtual {v2, v3}, Lz/c;->n(F)Lz/c$f;

    move-result-object v3

    move-object/from16 v6, p0

    iget-object v7, v6, LHf/f$a;->a:LHf/d;

    sget-object v26, Lf0/c;->a:Lf0/c$a;

    invoke-virtual/range {v26 .. v26}, Lf0/c$a;->k()Lf0/c$b;

    move-result-object v4

    invoke-static {v3, v4, v15, v1}, Lz/h;->a(Lz/c$m;Lf0/c$b;LT/l;I)LC0/C;

    move-result-object v1

    const/4 v5, 0x0

    invoke-static {v15, v5}, LT/j;->a(LT/l;I)I

    move-result v3

    invoke-interface/range {p2 .. p2}, LT/l;->G()LT/x;

    move-result-object v4

    invoke-static {v15, v0}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v0

    sget-object v27, LE0/g;->K:LE0/g$a;

    invoke-virtual/range {v27 .. v27}, LE0/g$a;->a()Lmh/a;

    move-result-object v13

    invoke-interface/range {p2 .. p2}, LT/l;->x()LT/f;

    move-result-object v17

    if-nez v17, :cond_5

    invoke-static {}, LT/j;->c()V

    :cond_5
    invoke-interface/range {p2 .. p2}, LT/l;->u()V

    invoke-interface/range {p2 .. p2}, LT/l;->o()Z

    move-result v17

    if-eqz v17, :cond_6

    invoke-interface {v15, v13}, LT/l;->D(Lmh/a;)V

    goto :goto_3

    :cond_6
    invoke-interface/range {p2 .. p2}, LT/l;->I()V

    :goto_3
    invoke-static/range {p2 .. p2}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v13

    invoke-virtual/range {v27 .. v27}, LE0/g$a;->e()Lmh/p;

    move-result-object v5

    invoke-static {v13, v1, v5}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v27 .. v27}, LE0/g$a;->g()Lmh/p;

    move-result-object v1

    invoke-static {v13, v4, v1}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v27 .. v27}, LE0/g$a;->b()Lmh/p;

    move-result-object v1

    invoke-interface {v13}, LT/l;->o()Z

    move-result v4

    if-nez v4, :cond_7

    invoke-interface {v13}, LT/l;->f()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_8

    :cond_7
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v13, v4}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v13, v3, v1}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_8
    invoke-virtual/range {v27 .. v27}, LE0/g$a;->f()Lmh/p;

    move-result-object v1

    invoke-static {v13, v0, v1}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v28, Lz/k;->a:Lz/k;

    invoke-static {v14, v11, v12, v10}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v18

    const/16 v21, 0x2

    const/16 v22, 0x0

    const/high16 v19, 0x3f800000    # 1.0f

    const/16 v20, 0x0

    move-object/from16 v17, v28

    invoke-static/range {v17 .. v22}, Lz/j;->b(Lz/j;Landroidx/compose/ui/e;FZILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v0

    invoke-virtual {v9, v15, v8}, Lla/a;->d(LT/l;I)Lra/a;

    move-result-object v1

    invoke-virtual {v1}, Lra/a;->a()Lra/b;

    move-result-object v1

    invoke-virtual {v1}, Lra/b;->a()Lra/b$a$a;

    move-result-object v1

    invoke-virtual {v1}, Lra/b$a$a;->d()F

    move-result v1

    invoke-virtual {v9, v15, v8}, Lla/a;->d(LT/l;I)Lra/a;

    move-result-object v3

    invoke-virtual {v3}, Lra/a;->a()Lra/b;

    move-result-object v3

    invoke-virtual {v3}, Lra/b;->a()Lra/b$a$a;

    move-result-object v3

    invoke-virtual {v3}, Lra/b$a$a;->d()F

    move-result v3

    invoke-static {}, LHf/f;->f()I

    move-result v4

    int-to-float v4, v4

    invoke-static {v4}, LY0/h;->j(F)F

    move-result v4

    const/16 v5, 0x10

    int-to-float v5, v5

    invoke-static {v5}, LY0/h;->j(F)F

    move-result v13

    invoke-static {v0, v1, v4, v3, v13}, Landroidx/compose/foundation/layout/o;->l(Landroidx/compose/ui/e;FFFF)Landroidx/compose/ui/e;

    move-result-object v0

    invoke-virtual/range {v26 .. v26}, Lf0/c$a;->g()Lf0/c$b;

    move-result-object v1

    invoke-static {v5}, LY0/h;->j(F)F

    move-result v3

    invoke-virtual {v2, v3}, Lz/c;->n(F)Lz/c$f;

    move-result-object v2

    const/16 v3, 0x36

    invoke-static {v2, v1, v15, v3}, Lz/h;->a(Lz/c$m;Lf0/c$b;LT/l;I)LC0/C;

    move-result-object v1

    const/4 v5, 0x0

    invoke-static {v15, v5}, LT/j;->a(LT/l;I)I

    move-result v2

    invoke-interface/range {p2 .. p2}, LT/l;->G()LT/x;

    move-result-object v3

    invoke-static {v15, v0}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v0

    invoke-virtual/range {v27 .. v27}, LE0/g$a;->a()Lmh/a;

    move-result-object v4

    invoke-interface/range {p2 .. p2}, LT/l;->x()LT/f;

    move-result-object v13

    if-nez v13, :cond_9

    invoke-static {}, LT/j;->c()V

    :cond_9
    invoke-interface/range {p2 .. p2}, LT/l;->u()V

    invoke-interface/range {p2 .. p2}, LT/l;->o()Z

    move-result v13

    if-eqz v13, :cond_a

    invoke-interface {v15, v4}, LT/l;->D(Lmh/a;)V

    goto :goto_4

    :cond_a
    invoke-interface/range {p2 .. p2}, LT/l;->I()V

    :goto_4
    invoke-static/range {p2 .. p2}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v4

    invoke-virtual/range {v27 .. v27}, LE0/g$a;->e()Lmh/p;

    move-result-object v13

    invoke-static {v4, v1, v13}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v27 .. v27}, LE0/g$a;->g()Lmh/p;

    move-result-object v1

    invoke-static {v4, v3, v1}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v27 .. v27}, LE0/g$a;->b()Lmh/p;

    move-result-object v1

    invoke-interface {v4}, LT/l;->o()Z

    move-result v3

    if-nez v3, :cond_b

    invoke-interface {v4}, LT/l;->f()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v3, v13}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_c

    :cond_b
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v4, v3}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v4, v2, v1}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_c
    invoke-virtual/range {v27 .. v27}, LE0/g$a;->f()Lmh/p;

    move-result-object v1

    invoke-static {v4, v0, v1}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v0, LPe/b;->a:LPe/b;

    invoke-virtual {v0}, LPe/b;->b()Ls9/c$a;

    move-result-object v0

    invoke-static {}, LHf/f;->d()I

    move-result v1

    int-to-float v1, v1

    invoke-static {v1}, LY0/h;->j(F)F

    move-result v1

    invoke-static {v14, v1}, Landroidx/compose/foundation/layout/r;->v(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v1

    const/16 v2, 0xc

    int-to-float v2, v2

    invoke-static {v2}, LY0/h;->j(F)F

    move-result v2

    invoke-static {v2}, LE/h;->d(F)LE/g;

    move-result-object v2

    invoke-static {v1, v2}, Lj0/e;->a(Landroidx/compose/ui/e;Lm0/i1;)Landroidx/compose/ui/e;

    move-result-object v1

    const/4 v13, 0x6

    const/16 v17, 0x3e

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/16 v18, 0x0

    const-wide/16 v19, 0x0

    move-object/from16 p3, v14

    move v14, v5

    move/from16 v5, v18

    move-object/from16 p1, v7

    move-wide/from16 v6, v19

    move v11, v8

    move-object/from16 v8, p2

    move-object/from16 v29, v9

    move v9, v13

    move-object v13, v10

    move/from16 v10, v17

    invoke-static/range {v0 .. v10}, LBe/w;->b(Ls9/a;Landroidx/compose/ui/e;Ls9/a$b;Ls9/a$b;Ljava/lang/String;FJLT/l;II)V

    invoke-virtual/range {p1 .. p1}, LHf/d;->getTitle()LLi/N;

    move-result-object v0

    invoke-static {v0, v13, v15, v14, v12}, LT/o1;->b(LLi/N;Ldh/i;LT/l;II)LT/z1;

    move-result-object v0

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ls9/d;

    const v1, -0x65c5d3b4

    invoke-interface {v15, v1}, LT/l;->U(I)V

    if-nez v0, :cond_d

    move/from16 v31, v11

    move-object/from16 v30, v29

    goto :goto_5

    :cond_d
    invoke-static {v0, v15, v14}, Lsa/a;->a(Ls9/d;LT/l;I)LL0/d;

    move-result-object v0

    move-object/from16 v9, v29

    invoke-virtual {v9, v15, v11}, Lla/a;->c(LT/l;I)Lpa/c;

    move-result-object v1

    invoke-virtual {v1}, Lpa/c;->a()Lpa/b;

    move-result-object v1

    invoke-virtual {v1}, Lpa/b;->d()LL0/U;

    move-result-object v21

    invoke-virtual {v9, v15, v11}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v1

    invoke-virtual {v1}, Lma/a;->f()Lma/a$f;

    move-result-object v1

    invoke-virtual {v1}, Lma/a$f;->a()J

    move-result-wide v2

    sget-object v1, LW0/j;->b:LW0/j$a;

    invoke-virtual {v1}, LW0/j$a;->a()I

    move-result v1

    invoke-static {v1}, LW0/j;->h(I)LW0/j;

    move-result-object v1

    move v10, v12

    move-object v12, v1

    const/16 v24, 0x0

    const v25, 0x1fdfa

    const/4 v1, 0x0

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const-wide/16 v19, 0x0

    move-object/from16 v30, v9

    move-wide/from16 v9, v19

    const/16 v17, 0x0

    move/from16 v31, v11

    move-object/from16 v11, v17

    const-wide/16 v17, 0x0

    move-wide/from16 v13, v17

    const/16 v16, 0x0

    move/from16 v15, v16

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v23, 0x0

    move-object/from16 v22, p2

    invoke-static/range {v0 .. v25}, LN/a1;->c(LL0/d;Landroidx/compose/ui/e;JJLQ0/v;LQ0/A;LQ0/k;JLW0/k;LW0/j;JIZIILjava/util/Map;Lmh/l;LL0/U;LT/l;III)V

    sget-object v0, LYg/J;->a:LYg/J;

    :goto_5
    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    invoke-virtual/range {p1 .. p1}, LHf/d;->q0()LLi/N;

    move-result-object v0

    move-object/from16 v15, p2

    const/4 v11, 0x0

    const/4 v13, 0x1

    const/4 v14, 0x0

    invoke-static {v0, v14, v15, v11, v13}, LT/o1;->b(LLi/N;Ldh/i;LT/l;II)LT/z1;

    move-result-object v0

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ls9/d;

    const v1, -0x65c5a8b3

    invoke-interface {v15, v1}, LT/l;->U(I)V

    if-nez v0, :cond_e

    move-object/from16 v32, v30

    move/from16 v33, v31

    goto :goto_6

    :cond_e
    invoke-static {v0, v15, v11}, Lsa/a;->a(Ls9/d;LT/l;I)LL0/d;

    move-result-object v0

    move-object/from16 v9, v30

    move/from16 v10, v31

    invoke-virtual {v9, v15, v10}, Lla/a;->c(LT/l;I)Lpa/c;

    move-result-object v1

    invoke-virtual {v1}, Lpa/c;->b()Lpa/b;

    move-result-object v1

    invoke-virtual {v1}, Lpa/b;->a()LL0/U;

    move-result-object v21

    invoke-virtual {v9, v15, v10}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v1

    invoke-virtual {v1}, Lma/a;->f()Lma/a$f;

    move-result-object v1

    invoke-virtual {v1}, Lma/a$f;->a()J

    move-result-wide v2

    sget-object v1, LW0/j;->b:LW0/j$a;

    invoke-virtual {v1}, LW0/j$a;->a()I

    move-result v1

    invoke-static {v1}, LW0/j;->h(I)LW0/j;

    move-result-object v12

    const/16 v24, 0x0

    const v25, 0x1fdfa

    const/4 v1, 0x0

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const-wide/16 v16, 0x0

    move-object/from16 v32, v9

    move/from16 v33, v10

    move-wide/from16 v9, v16

    const/16 v16, 0x0

    move-object/from16 v11, v16

    const-wide/16 v16, 0x0

    move-wide/from16 v13, v16

    const/16 v16, 0x0

    move/from16 v15, v16

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v23, 0x0

    move-object/from16 v22, p2

    invoke-static/range {v0 .. v25}, LN/a1;->c(LL0/d;Landroidx/compose/ui/e;JJLQ0/v;LQ0/A;LQ0/k;JLW0/k;LW0/j;JIZIILjava/util/Map;Lmh/l;LL0/U;LT/l;III)V

    sget-object v0, LYg/J;->a:LYg/J;

    :goto_6
    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    const/4 v10, 0x2

    const/4 v11, 0x0

    const/high16 v8, 0x3f800000    # 1.0f

    const/4 v9, 0x0

    move-object/from16 v6, v28

    move-object/from16 v7, p3

    invoke-static/range {v6 .. v11}, Lz/j;->b(Lz/j;Landroidx/compose/ui/e;FZILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v0

    const/4 v11, 0x0

    const/4 v12, 0x1

    const/4 v13, 0x0

    invoke-static {v0, v11, v12, v13}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v0

    invoke-virtual/range {v26 .. v26}, Lf0/c$a;->e()Lf0/c;

    move-result-object v1

    const/4 v14, 0x0

    invoke-static {v1, v14}, Landroidx/compose/foundation/layout/d;->h(Lf0/c;Z)LC0/C;

    move-result-object v1

    move-object/from16 v15, p2

    invoke-static {v15, v14}, LT/j;->a(LT/l;I)I

    move-result v2

    invoke-interface/range {p2 .. p2}, LT/l;->G()LT/x;

    move-result-object v3

    invoke-static {v15, v0}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v0

    invoke-virtual/range {v27 .. v27}, LE0/g$a;->a()Lmh/a;

    move-result-object v4

    invoke-interface/range {p2 .. p2}, LT/l;->x()LT/f;

    move-result-object v5

    if-nez v5, :cond_f

    invoke-static {}, LT/j;->c()V

    :cond_f
    invoke-interface/range {p2 .. p2}, LT/l;->u()V

    invoke-interface/range {p2 .. p2}, LT/l;->o()Z

    move-result v5

    if-eqz v5, :cond_10

    invoke-interface {v15, v4}, LT/l;->D(Lmh/a;)V

    goto :goto_7

    :cond_10
    invoke-interface/range {p2 .. p2}, LT/l;->I()V

    :goto_7
    invoke-static/range {p2 .. p2}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v4

    invoke-virtual/range {v27 .. v27}, LE0/g$a;->e()Lmh/p;

    move-result-object v5

    invoke-static {v4, v1, v5}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v27 .. v27}, LE0/g$a;->g()Lmh/p;

    move-result-object v1

    invoke-static {v4, v3, v1}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v27 .. v27}, LE0/g$a;->b()Lmh/p;

    move-result-object v1

    invoke-interface {v4}, LT/l;->o()Z

    move-result v3

    if-nez v3, :cond_11

    invoke-interface {v4}, LT/l;->f()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v3, v5}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_12

    :cond_11
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v4, v3}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v4, v2, v1}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_12
    invoke-virtual/range {v27 .. v27}, LE0/g$a;->f()Lmh/p;

    move-result-object v1

    invoke-static {v4, v0, v1}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v0, Landroidx/compose/foundation/layout/f;->a:Landroidx/compose/foundation/layout/f;

    invoke-virtual/range {p1 .. p1}, LHf/d;->p0()LLi/N;

    move-result-object v0

    invoke-static {v0, v13, v15, v14, v12}, LT/o1;->b(LLi/N;Ldh/i;LT/l;II)LT/z1;

    move-result-object v0

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ls9/c;

    const v1, 0x3530ef91

    invoke-interface {v15, v1}, LT/l;->U(I)V

    if-nez v0, :cond_13

    move-object/from16 v34, p3

    goto :goto_8

    :cond_13
    invoke-static {}, LHf/f;->e()I

    move-result v1

    int-to-float v1, v1

    invoke-static {v1}, LY0/h;->j(F)F

    move-result v1

    move-object/from16 v10, p3

    invoke-static {v10, v1}, Landroidx/compose/foundation/layout/r;->v(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v1

    const/16 v9, 0x30

    const/16 v16, 0x3e

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const-wide/16 v6, 0x0

    move-object/from16 v8, p2

    move-object/from16 v34, v10

    move/from16 v10, v16

    invoke-static/range {v0 .. v10}, LBe/w;->b(Ls9/a;Landroidx/compose/ui/e;Ls9/a$b;Ls9/a$b;Ljava/lang/String;FJLT/l;II)V

    sget-object v0, LYg/J;->a:LYg/J;

    :goto_8
    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    invoke-interface/range {p2 .. p2}, LT/l;->R()V

    invoke-interface/range {p2 .. p2}, LT/l;->R()V

    invoke-virtual/range {p1 .. p1}, LHf/d;->n0()LLi/N;

    move-result-object v0

    invoke-static {v0, v13, v15, v14, v12}, LT/o1;->b(LLi/N;Ldh/i;LT/l;II)LT/z1;

    move-result-object v0

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ls9/d;

    const v1, -0x2358e479

    invoke-interface {v15, v1}, LT/l;->U(I)V

    const/16 v10, 0x20

    if-nez v0, :cond_14

    move-object/from16 v36, v32

    move/from16 v35, v33

    move-object/from16 v37, v34

    goto/16 :goto_9

    :cond_14
    move-object/from16 v9, v34

    invoke-static {v9, v11, v12, v13}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    move-object/from16 v8, v32

    move/from16 v7, v33

    invoke-virtual {v8, v15, v7}, Lla/a;->d(LT/l;I)Lra/a;

    move-result-object v2

    invoke-virtual {v2}, Lra/a;->a()Lra/b;

    move-result-object v2

    invoke-virtual {v2}, Lra/b;->a()Lra/b$a$a;

    move-result-object v2

    int-to-float v3, v10

    invoke-static {v3}, LY0/h;->j(F)F

    move-result v3

    invoke-virtual {v2, v3}, Lra/b$a;->a(F)F

    move-result v2

    const/4 v6, 0x2

    invoke-static {v1, v2, v11, v6, v13}, Landroidx/compose/foundation/layout/o;->k(Landroidx/compose/ui/e;FFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    invoke-static {v0, v15, v14}, Lsa/a;->b(Ls9/d;LT/l;I)Ljava/lang/String;

    move-result-object v16

    const v0, -0x65c527fc

    invoke-interface {v15, v0}, LT/l;->U(I)V

    move-object/from16 v5, p1

    invoke-interface {v15, v5}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v0

    invoke-interface/range {p2 .. p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v2

    if-nez v0, :cond_15

    sget-object v0, LT/l;->a:LT/l$a;

    invoke-virtual {v0}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v2, v0, :cond_16

    :cond_15
    new-instance v2, LHf/f$a$a;

    invoke-direct {v2, v5}, LHf/f$a$a;-><init>(Ljava/lang/Object;)V

    invoke-interface {v15, v2}, LT/l;->K(Ljava/lang/Object;)V

    :cond_16
    check-cast v2, Lth/g;

    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    check-cast v2, Lmh/a;

    const/16 v17, 0x0

    const/16 v18, 0xbc

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    move-object v0, v1

    move-object v1, v2

    move v2, v3

    move v3, v4

    move-object/from16 v4, v19

    move-object/from16 p1, v5

    move-object/from16 v5, v20

    move-object/from16 v6, v16

    move/from16 v35, v7

    move-object/from16 v7, v21

    move-object/from16 v36, v8

    move-object/from16 v8, p2

    move-object/from16 v37, v9

    move/from16 v9, v17

    move/from16 v10, v18

    invoke-static/range {v0 .. v10}, Lw9/r;->b(Landroidx/compose/ui/e;Lmh/a;ZZLs9/b;Lw9/p;Ljava/lang/String;LL0/U;LT/l;II)V

    sget-object v0, LYg/J;->a:LYg/J;

    :goto_9
    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    invoke-virtual/range {p1 .. p1}, LHf/d;->o0()LLi/N;

    move-result-object v0

    invoke-static {v0, v13, v15, v14, v12}, LT/o1;->b(LLi/N;Ldh/i;LT/l;II)LT/z1;

    move-result-object v0

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ls9/d;

    const v1, -0x2358b239

    invoke-interface {v15, v1}, LT/l;->U(I)V

    if-nez v0, :cond_17

    goto :goto_a

    :cond_17
    move-object/from16 v1, v37

    invoke-static {v1, v11, v12, v13}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    move/from16 v3, v35

    move-object/from16 v2, v36

    invoke-virtual {v2, v15, v3}, Lla/a;->d(LT/l;I)Lra/a;

    move-result-object v2

    invoke-virtual {v2}, Lra/a;->a()Lra/b;

    move-result-object v2

    invoke-virtual {v2}, Lra/b;->a()Lra/b$a$a;

    move-result-object v2

    const/16 v3, 0x20

    int-to-float v3, v3

    invoke-static {v3}, LY0/h;->j(F)F

    move-result v3

    invoke-virtual {v2, v3}, Lra/b$a;->a(F)F

    move-result v2

    const/4 v3, 0x2

    invoke-static {v1, v2, v11, v3, v13}, Landroidx/compose/foundation/layout/o;->k(Landroidx/compose/ui/e;FFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    invoke-static {v0, v15, v14}, Lsa/a;->b(Ls9/d;LT/l;I)Ljava/lang/String;

    move-result-object v5

    const v0, -0x65c4f5fa

    invoke-interface {v15, v0}, LT/l;->U(I)V

    move-object/from16 v0, p1

    invoke-interface {v15, v0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v2

    invoke-interface/range {p2 .. p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_18

    sget-object v2, LT/l;->a:LT/l$a;

    invoke-virtual {v2}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v3, v2, :cond_19

    :cond_18
    new-instance v3, LHf/f$a$b;

    invoke-direct {v3, v0}, LHf/f$a$b;-><init>(Ljava/lang/Object;)V

    invoke-interface {v15, v3}, LT/l;->K(Ljava/lang/Object;)V

    :cond_19
    check-cast v3, Lth/g;

    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    move-object v2, v3

    check-cast v2, Lmh/a;

    const/4 v7, 0x0

    const/16 v8, 0x1c

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    move-object v0, v1

    move-object v1, v2

    move v2, v3

    move v3, v4

    move-object v4, v6

    move-object/from16 v6, p2

    invoke-static/range {v0 .. v8}, Lw9/o;->c(Landroidx/compose/ui/e;Lmh/a;ZZLs9/b;Ljava/lang/String;LT/l;II)V

    sget-object v0, LYg/J;->a:LYg/J;

    :goto_a
    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    invoke-interface/range {p2 .. p2}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_1a

    invoke-static {}, LT/o;->P()V

    :cond_1a
    :goto_b
    return-void
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lz/N;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, LHf/f$a;->a(Lz/N;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
