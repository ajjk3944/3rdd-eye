.class final Luf/e$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Luf/e;->c(Luf/a;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Luf/a;


# direct methods
.method constructor <init>(Luf/a;)V
    .locals 0

    iput-object p1, p0, Luf/e$b;->a:Luf/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lz/j;LT/l;I)V
    .locals 34

    move-object/from16 v15, p2

    move/from16 v0, p3

    const-string v1, "$this$ModalScaffold"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v1, v0, 0x11

    const/16 v7, 0x10

    if-ne v1, v7, :cond_1

    invoke-interface/range {p2 .. p2}, LT/l;->v()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface/range {p2 .. p2}, LT/l;->C()V

    goto/16 :goto_2

    :cond_1
    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v1, -0x1

    const-string v2, "com.ui.wifiman.ui.ubiquiti.console.DirectConsoleConnectionPopupUi.<anonymous> (DirectConsoleConnectionPopupUi.kt:83)"

    const v3, -0x1b706d0d

    invoke-static {v3, v0, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    sget-object v13, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/4 v14, 0x0

    const/4 v11, 0x1

    const/4 v9, 0x0

    invoke-static {v13, v14, v11, v9}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v0

    sget-object v1, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v1}, Lf0/c$a;->g()Lf0/c$b;

    move-result-object v1

    move-object/from16 v10, p0

    iget-object v8, v10, Luf/e$b;->a:Luf/a;

    sget-object v2, Lz/c;->a:Lz/c;

    invoke-virtual {v2}, Lz/c;->g()Lz/c$m;

    move-result-object v2

    const/16 v3, 0x30

    invoke-static {v2, v1, v15, v3}, Lz/h;->a(Lz/c$m;Lf0/c$b;LT/l;I)LC0/C;

    move-result-object v1

    const/4 v12, 0x0

    invoke-static {v15, v12}, LT/j;->a(LT/l;I)I

    move-result v2

    invoke-interface/range {p2 .. p2}, LT/l;->G()LT/x;

    move-result-object v3

    invoke-static {v15, v0}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v0

    sget-object v4, LE0/g;->K:LE0/g$a;

    invoke-virtual {v4}, LE0/g$a;->a()Lmh/a;

    move-result-object v5

    invoke-interface/range {p2 .. p2}, LT/l;->x()LT/f;

    move-result-object v6

    if-nez v6, :cond_3

    invoke-static {}, LT/j;->c()V

    :cond_3
    invoke-interface/range {p2 .. p2}, LT/l;->u()V

    invoke-interface/range {p2 .. p2}, LT/l;->o()Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-interface {v15, v5}, LT/l;->D(Lmh/a;)V

    goto :goto_1

    :cond_4
    invoke-interface/range {p2 .. p2}, LT/l;->I()V

    :goto_1
    invoke-static/range {p2 .. p2}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v5

    invoke-virtual {v4}, LE0/g$a;->e()Lmh/p;

    move-result-object v6

    invoke-static {v5, v1, v6}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v4}, LE0/g$a;->g()Lmh/p;

    move-result-object v1

    invoke-static {v5, v3, v1}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v4}, LE0/g$a;->b()Lmh/p;

    move-result-object v1

    invoke-interface {v5}, LT/l;->o()Z

    move-result v3

    if-nez v3, :cond_5

    invoke-interface {v5}, LT/l;->f()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v3, v6}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_6

    :cond_5
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v5, v3}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v5, v2, v1}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_6
    invoke-virtual {v4}, LE0/g$a;->f()Lmh/p;

    move-result-object v1

    invoke-static {v5, v0, v1}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v0, Lz/k;->a:Lz/k;

    const/16 v0, 0x8

    int-to-float v0, v0

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v0

    invoke-static {v13, v0}, Landroidx/compose/foundation/layout/r;->i(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v0

    const/4 v6, 0x6

    invoke-static {v0, v15, v6}, Lz/a0;->a(Landroidx/compose/ui/e;LT/l;I)V

    sget-object v0, LPe/a;->a:LPe/a;

    invoke-virtual {v0}, LPe/a;->i()Ls9/b;

    move-result-object v0

    const/16 v1, 0x50

    int-to-float v1, v1

    invoke-static {v1}, LY0/h;->j(F)F

    move-result v1

    invoke-static {v13, v1}, Landroidx/compose/foundation/layout/r;->v(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v1

    sget-object v5, Lla/a;->a:Lla/a;

    sget v4, Lla/a;->b:I

    invoke-virtual {v5, v15, v4}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v2

    invoke-virtual {v2}, Lma/a;->a()Lma/a$a;

    move-result-object v2

    invoke-virtual {v2}, Lma/a$a;->b()Lr9/a$a;

    move-result-object v2

    invoke-virtual {v2}, Lr9/a$a;->b()J

    move-result-wide v2

    invoke-static {v2, v3}, Lm0/v0;->g(J)Lm0/v0;

    move-result-object v2

    const/16 v16, 0x36

    const/16 v17, 0x4

    const/4 v3, 0x0

    move v10, v4

    move-object/from16 v4, p2

    move-object/from16 v26, v5

    move/from16 v5, v16

    move v14, v6

    move/from16 v6, v17

    invoke-static/range {v0 .. v6}, Lta/c;->c(Ls9/b;Landroidx/compose/ui/e;Lm0/v0;Ljava/lang/String;LT/l;II)V

    int-to-float v7, v7

    invoke-static {v7}, LY0/h;->j(F)F

    move-result v0

    invoke-static {v13, v0}, Landroidx/compose/foundation/layout/r;->i(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v0

    invoke-static {v0, v15, v14}, Lz/a0;->a(Landroidx/compose/ui/e;LT/l;I)V

    invoke-virtual {v8}, Luf/a;->n0()LLi/N;

    move-result-object v0

    invoke-static {v0, v9, v15, v12, v11}, LT/o1;->b(LLi/N;Ldh/i;LT/l;II)LT/z1;

    move-result-object v0

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const/4 v6, 0x0

    invoke-static {v13, v6, v11, v9}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    move-object/from16 v4, v26

    invoke-virtual {v4, v15, v10}, Lla/a;->d(LT/l;I)Lra/a;

    move-result-object v2

    invoke-virtual {v2}, Lra/a;->a()Lra/b;

    move-result-object v2

    invoke-virtual {v2}, Lra/b;->a()Lra/b$a$a;

    move-result-object v2

    invoke-virtual {v2}, Lra/b$a$a;->d()F

    move-result v2

    const/4 v5, 0x2

    invoke-static {v1, v2, v6, v5, v9}, Landroidx/compose/foundation/layout/o;->k(Landroidx/compose/ui/e;FFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    sget-object v2, Luf/b;->a:Luf/b;

    sget v3, Lm8/c;->T:I

    const/16 v5, 0x180

    invoke-virtual {v2, v0, v3, v15, v5}, Luf/b;->a(Ljava/lang/String;ILT/l;I)LL0/d;

    move-result-object v0

    invoke-virtual {v4, v15, v10}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v2

    invoke-virtual {v2}, Lma/a;->f()Lma/a$f;

    move-result-object v2

    invoke-virtual {v2}, Lma/a$f;->b()J

    move-result-wide v2

    sget-object v5, LW0/j;->b:LW0/j$a;

    invoke-virtual {v5}, LW0/j$a;->d()I

    move-result v5

    invoke-virtual {v4, v15, v10}, Lla/a;->c(LT/l;I)Lpa/c;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Lpa/c;->b()Lpa/b;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Lpa/b;->a()LL0/U;

    move-result-object v21

    invoke-static {v5}, LW0/j;->h(I)LW0/j;

    move-result-object v5

    move-object v12, v5

    const/16 v24, 0x0

    const v25, 0x1fdf8

    const-wide/16 v16, 0x0

    move-object/from16 v27, v4

    move-wide/from16 v4, v16

    const/16 v16, 0x0

    move/from16 v17, v6

    move-object/from16 v6, v16

    move/from16 v26, v7

    move-object/from16 v7, v16

    move-object/from16 v28, v8

    move-object/from16 v8, v16

    const-wide/16 v18, 0x0

    move/from16 v29, v10

    move-wide/from16 v9, v18

    move-object/from16 v11, v16

    move-object/from16 v30, v13

    move-wide/from16 v13, v18

    const/16 v16, 0x0

    move/from16 v15, v16

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v23, 0x0

    move-object/from16 v22, p2

    invoke-static/range {v0 .. v25}, LN/a1;->c(LL0/d;Landroidx/compose/ui/e;JJLQ0/v;LQ0/A;LQ0/k;JLW0/k;LW0/j;JIZIILjava/util/Map;Lmh/l;LL0/U;LT/l;III)V

    invoke-static/range {v26 .. v26}, LY0/h;->j(F)F

    move-result v0

    move-object/from16 v11, v30

    invoke-static {v11, v0}, Landroidx/compose/foundation/layout/r;->i(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v0

    move-object/from16 v12, p2

    const/4 v1, 0x6

    invoke-static {v0, v12, v1}, Lz/a0;->a(Landroidx/compose/ui/e;LT/l;I)V

    const/4 v13, 0x0

    const/4 v14, 0x1

    const/4 v15, 0x0

    invoke-static {v11, v13, v14, v15}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v0

    move-object/from16 v10, v27

    move/from16 v9, v29

    invoke-virtual {v10, v12, v9}, Lla/a;->d(LT/l;I)Lra/a;

    move-result-object v1

    invoke-virtual {v1}, Lra/a;->a()Lra/b;

    move-result-object v1

    invoke-virtual {v1}, Lra/b;->a()Lra/b$a$a;

    move-result-object v1

    invoke-virtual {v1}, Lra/b$a$a;->d()F

    move-result v1

    const/4 v8, 0x2

    invoke-static {v0, v1, v13, v8, v15}, Landroidx/compose/foundation/layout/o;->k(Landroidx/compose/ui/e;FFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v0

    sget v1, Lm8/c;->R:I

    const/4 v7, 0x0

    invoke-static {v1, v12, v7}, LH0/f;->a(ILT/l;I)Ljava/lang/String;

    move-result-object v6

    const v1, -0x54292503

    invoke-interface {v12, v1}, LT/l;->U(I)V

    move-object/from16 v5, v28

    invoke-interface {v12, v5}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v1

    invoke-interface/range {p2 .. p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_7

    sget-object v1, LT/l;->a:LT/l$a;

    invoke-virtual {v1}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v2, v1, :cond_8

    :cond_7
    new-instance v2, Luf/e$b$a;

    invoke-direct {v2, v5}, Luf/e$b$a;-><init>(Ljava/lang/Object;)V

    invoke-interface {v12, v2}, LT/l;->K(Ljava/lang/Object;)V

    :cond_8
    check-cast v2, Lth/g;

    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    move-object v1, v2

    check-cast v1, Lmh/a;

    const/16 v16, 0x0

    const/16 v17, 0xbc

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    move-object/from16 v31, v5

    move-object/from16 v5, v18

    move-object/from16 v7, v19

    move-object/from16 v8, p2

    move/from16 v32, v9

    move/from16 v9, v16

    move-object/from16 v33, v10

    move/from16 v10, v17

    invoke-static/range {v0 .. v10}, Lw9/r;->b(Landroidx/compose/ui/e;Lmh/a;ZZLs9/b;Lw9/p;Ljava/lang/String;LL0/U;LT/l;II)V

    invoke-static {v11, v13, v14, v15}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v0

    move/from16 v2, v32

    move-object/from16 v1, v33

    invoke-virtual {v1, v12, v2}, Lla/a;->d(LT/l;I)Lra/a;

    move-result-object v1

    invoke-virtual {v1}, Lra/a;->a()Lra/b;

    move-result-object v1

    invoke-virtual {v1}, Lra/b;->a()Lra/b$a$a;

    move-result-object v1

    invoke-virtual {v1}, Lra/b$a$a;->d()F

    move-result v1

    const/4 v2, 0x2

    invoke-static {v0, v1, v13, v2, v15}, Landroidx/compose/foundation/layout/o;->k(Landroidx/compose/ui/e;FFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v0

    sget v1, Lm8/c;->S:I

    const/4 v9, 0x0

    invoke-static {v1, v12, v9}, LH0/f;->a(ILT/l;I)Ljava/lang/String;

    move-result-object v5

    const v1, -0x5428f9fa

    invoke-interface {v12, v1}, LT/l;->U(I)V

    move-object/from16 v1, v31

    invoke-interface {v12, v1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v2

    invoke-interface/range {p2 .. p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_9

    sget-object v2, LT/l;->a:LT/l$a;

    invoke-virtual {v2}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v3, v2, :cond_a

    :cond_9
    new-instance v3, Luf/e$b$b;

    invoke-direct {v3, v1}, Luf/e$b$b;-><init>(Ljava/lang/Object;)V

    invoke-interface {v12, v3}, LT/l;->K(Ljava/lang/Object;)V

    :cond_a
    check-cast v3, Lth/g;

    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    move-object v1, v3

    check-cast v1, Lmh/a;

    const/4 v7, 0x0

    const/16 v8, 0x1c

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object/from16 v6, p2

    invoke-static/range {v0 .. v8}, Lw9/o;->c(Landroidx/compose/ui/e;Lmh/a;ZZLs9/b;Ljava/lang/String;LT/l;II)V

    invoke-static {v15, v12, v9, v14}, LBe/v0;->b(Landroidx/compose/ui/e;LT/l;II)V

    invoke-interface/range {p2 .. p2}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-static {}, LT/o;->P()V

    :cond_b
    :goto_2
    return-void
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lz/j;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Luf/e$b;->a(Lz/j;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
