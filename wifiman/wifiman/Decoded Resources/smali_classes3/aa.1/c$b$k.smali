.class public final Laa/c$b$k;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Laa/c$b;->a(Lz/N;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LT/q0;

.field final synthetic b:Lb1/l;

.field final synthetic c:Lmh/a;

.field final synthetic d:Laa/d;

.field final synthetic e:LIi/N;


# direct methods
.method public constructor <init>(LT/q0;Lb1/l;Lmh/a;Laa/d;LIi/N;)V
    .locals 0

    iput-object p1, p0, Laa/c$b$k;->a:LT/q0;

    iput-object p2, p0, Laa/c$b$k;->b:Lb1/l;

    iput-object p3, p0, Laa/c$b$k;->c:Lmh/a;

    iput-object p4, p0, Laa/c$b$k;->d:Laa/d;

    iput-object p5, p0, Laa/c$b$k;->e:LIi/N;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LT/l;I)V
    .locals 38

    move-object/from16 v0, p0

    move-object/from16 v14, p1

    move/from16 v1, p2

    and-int/lit8 v2, v1, 0x3

    const/4 v3, 0x2

    if-ne v2, v3, :cond_1

    invoke-interface/range {p1 .. p1}, LT/l;->v()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface/range {p1 .. p1}, LT/l;->C()V

    goto/16 :goto_2

    :cond_1
    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, -0x1

    const-string/jumbo v3, "androidx.constraintlayout.compose.ConstraintLayout.<anonymous> (ConstraintLayout.kt:454)"

    const v4, 0x478ef317

    invoke-static {v4, v1, v2, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    iget-object v1, v0, Laa/c$b$k;->a:LT/q0;

    sget-object v2, LYg/J;->a:LYg/J;

    invoke-interface {v1, v2}, LT/q0;->setValue(Ljava/lang/Object;)V

    iget-object v1, v0, Laa/c$b$k;->b:Lb1/l;

    invoke-virtual {v1}, Lb1/i;->e()I

    move-result v15

    iget-object v1, v0, Laa/c$b$k;->b:Lb1/l;

    invoke-virtual {v1}, Lb1/l;->f()V

    iget-object v13, v0, Laa/c$b$k;->b:Lb1/l;

    const v1, -0x5de3efb9

    invoke-interface {v14, v1}, LT/l;->U(I)V

    invoke-virtual {v13}, Lb1/l;->j()Lb1/l$b;

    move-result-object v1

    invoke-virtual {v1}, Lb1/l$b;->a()Lb1/f;

    move-result-object v12

    invoke-virtual {v1}, Lb1/l$b;->b()Lb1/f;

    move-result-object v10

    invoke-virtual {v1}, Lb1/l$b;->c()Lb1/f;

    move-result-object v11

    invoke-virtual {v1}, Lb1/l$b;->d()Lb1/f;

    move-result-object v9

    sget-object v1, Lla/a;->a:Lla/a;

    sget v2, Lla/a;->b:I

    invoke-virtual {v1, v14, v2}, Lla/a;->d(LT/l;I)Lra/a;

    move-result-object v3

    invoke-virtual {v3}, Lra/a;->a()Lra/b;

    move-result-object v3

    invoke-virtual {v3}, Lra/b;->a()Lra/b$a$a;

    move-result-object v3

    invoke-virtual {v3}, Lra/b$a$a;->c()F

    move-result v8

    invoke-virtual {v1, v14, v2}, Lla/a;->d(LT/l;I)Lra/a;

    move-result-object v3

    invoke-virtual {v3}, Lra/a;->a()Lra/b;

    move-result-object v3

    invoke-virtual {v3}, Lra/b;->b()Lra/b$a$b;

    move-result-object v3

    invoke-virtual {v3}, Lra/b$a$b;->d()F

    move-result v7

    invoke-virtual {v1, v14, v2}, Lla/a;->d(LT/l;I)Lra/a;

    move-result-object v1

    invoke-virtual {v1}, Lra/a;->a()Lra/b;

    move-result-object v1

    invoke-virtual {v1}, Lra/b;->a()Lra/b$a$a;

    move-result-object v1

    const/16 v2, 0x20

    int-to-float v2, v2

    invoke-static {v2}, LY0/h;->j(F)F

    move-result v2

    invoke-virtual {v1, v2}, Lra/b$a;->a(F)F

    move-result v5

    sget-object v6, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const v1, 0x15bf001e

    invoke-interface {v14, v1}, LT/l;->U(I)V

    invoke-interface {v14, v8}, LT/l;->g(F)Z

    move-result v1

    invoke-interface {v14, v7}, LT/l;->g(F)Z

    move-result v2

    or-int/2addr v1, v2

    invoke-interface/range {p1 .. p1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_3

    sget-object v1, LT/l;->a:LT/l$a;

    invoke-virtual {v1}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v2, v1, :cond_4

    :cond_3
    new-instance v2, Laa/c$b$a;

    invoke-direct {v2, v8, v7}, Laa/c$b$a;-><init>(FF)V

    invoke-interface {v14, v2}, LT/l;->K(Ljava/lang/Object;)V

    :cond_4
    check-cast v2, Lmh/l;

    invoke-interface/range {p1 .. p1}, LT/l;->J()V

    invoke-virtual {v13, v6, v12, v2}, Lb1/l;->h(Landroidx/compose/ui/e;Lb1/f;Lmh/l;)Landroidx/compose/ui/e;

    move-result-object v2

    iget-object v1, v0, Laa/c$b$k;->d:Laa/d;

    invoke-virtual {v1}, Laa/d;->L()LLi/N;

    move-result-object v1

    const/4 v3, 0x0

    const/4 v4, 0x0

    move/from16 p2, v15

    const/4 v15, 0x1

    invoke-static {v1, v3, v14, v4, v15}, LT/o1;->b(LLi/N;Ldh/i;LT/l;II)LT/z1;

    move-result-object v1

    invoke-interface {v1}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ls9/d;

    invoke-static {v1, v14, v4}, Lsa/a;->a(Ls9/d;LT/l;I)LL0/d;

    move-result-object v1

    invoke-virtual {v1}, LL0/d;->toString()Ljava/lang/String;

    move-result-object v1

    const/16 v23, 0x0

    const v24, 0xfffc

    const-wide/16 v16, 0x0

    move-wide/from16 v3, v16

    move/from16 v25, v5

    move-object/from16 v26, v6

    move-wide/from16 v5, v16

    const/16 v16, 0x0

    move/from16 v27, v7

    move-object/from16 v7, v16

    move/from16 v28, v8

    move-object/from16 v8, v16

    move-object/from16 v29, v9

    move-object/from16 v9, v16

    const-wide/16 v16, 0x0

    move-object/from16 v30, v10

    move-object/from16 v31, v11

    move-wide/from16 v10, v16

    const/16 v16, 0x0

    move-object/from16 v32, v12

    move-object/from16 v12, v16

    move-object/from16 v33, v13

    move-object/from16 v13, v16

    const-wide/16 v16, 0x0

    move/from16 v34, p2

    move-wide/from16 v14, v16

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v22, 0x0

    move-object/from16 v21, p1

    invoke-static/range {v1 .. v24}, LZ9/k;->c(Ljava/lang/String;Landroidx/compose/ui/e;JJLQ0/v;LQ0/A;LQ0/k;JLW0/k;LW0/j;JIZILmh/l;LL0/U;LT/l;III)V

    iget-object v1, v0, Laa/c$b$k;->d:Laa/d;

    invoke-virtual {v1}, Laa/d;->g0()LLi/N;

    move-result-object v1

    move-object/from16 v13, p1

    const/4 v12, 0x1

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-static {v1, v14, v13, v15, v12}, LT/o1;->b(LLi/N;Ldh/i;LT/l;II)LT/z1;

    move-result-object v1

    invoke-interface {v1}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v11

    iget-object v1, v0, Laa/c$b$k;->d:Laa/d;

    invoke-virtual {v1}, Laa/d;->i0()LLi/N;

    move-result-object v1

    invoke-static {v1, v14, v13, v15, v12}, LT/o1;->b(LLi/N;Ldh/i;LT/l;II)LT/z1;

    move-result-object v1

    invoke-interface {v1}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    const v2, 0x15bf497b

    invoke-interface {v13, v2}, LT/l;->U(I)V

    move-object/from16 v2, v32

    invoke-interface {v13, v2}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v3

    invoke-interface {v13, v11}, LT/l;->c(Z)Z

    move-result v4

    or-int/2addr v3, v4

    move-object/from16 v10, v31

    invoke-interface {v13, v10}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v3, v4

    move-object/from16 v9, v29

    invoke-interface {v13, v9}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v3, v4

    invoke-interface/range {p1 .. p1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_5

    sget-object v3, LT/l;->a:LT/l$a;

    invoke-virtual {v3}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v3

    if-ne v4, v3, :cond_6

    :cond_5
    new-instance v4, Laa/c$b$b;

    invoke-direct {v4, v2, v11, v10, v9}, Laa/c$b$b;-><init>(Lb1/f;ZLb1/f;Lb1/f;)V

    invoke-interface {v13, v4}, LT/l;->K(Ljava/lang/Object;)V

    :cond_6
    check-cast v4, Lmh/l;

    invoke-interface/range {p1 .. p1}, LT/l;->J()V

    move-object/from16 v7, v26

    move-object/from16 v2, v30

    move-object/from16 v8, v33

    invoke-virtual {v8, v7, v2, v4}, Lb1/l;->h(Landroidx/compose/ui/e;Lb1/f;Lmh/l;)Landroidx/compose/ui/e;

    move-result-object v2

    move/from16 v6, v27

    move/from16 v3, v28

    invoke-static {v3, v6}, Landroidx/compose/foundation/layout/o;->b(FF)Lz/N;

    move-result-object v3

    sget-object v4, Lz/c;->a:Lz/c;

    const/16 v5, 0x10

    int-to-float v5, v5

    invoke-static {v5}, LY0/h;->j(F)F

    move-result v5

    invoke-virtual {v4, v5}, Lz/c;->n(F)Lz/c$f;

    move-result-object v5

    const v4, 0x15bf9bfd

    invoke-interface {v13, v4}, LT/l;->U(I)V

    invoke-interface {v13, v1}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v4

    iget-object v12, v0, Laa/c$b$k;->e:LIi/N;

    invoke-interface {v13, v12}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v12

    or-int/2addr v4, v12

    iget-object v12, v0, Laa/c$b$k;->d:Laa/d;

    invoke-interface {v13, v12}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v12

    or-int/2addr v4, v12

    invoke-interface/range {p1 .. p1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v12

    if-nez v4, :cond_7

    sget-object v4, LT/l;->a:LT/l$a;

    invoke-virtual {v4}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v4

    if-ne v12, v4, :cond_8

    :cond_7
    new-instance v12, Laa/c$b$c;

    iget-object v4, v0, Laa/c$b$k;->e:LIi/N;

    iget-object v14, v0, Laa/c$b$k;->d:Laa/d;

    invoke-direct {v12, v1, v4, v14}, Laa/c$b$c;-><init>(Ljava/util/List;LIi/N;Laa/d;)V

    invoke-interface {v13, v12}, LT/l;->K(Ljava/lang/Object;)V

    :cond_8
    check-cast v12, Lmh/l;

    invoke-interface/range {p1 .. p1}, LT/l;->J()V

    const/16 v14, 0x6000

    const/16 v16, 0xea

    const/4 v4, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    move-object v1, v2

    move-object v2, v4

    move/from16 v4, v17

    move v15, v6

    move-object/from16 v6, v18

    move-object/from16 v35, v7

    move-object/from16 v7, v19

    move-object/from16 v36, v8

    move/from16 v8, v20

    move-object/from16 v37, v9

    move-object v9, v12

    move-object v12, v10

    move-object/from16 v10, p1

    move/from16 v17, v11

    move v11, v14

    move-object v14, v12

    move/from16 v12, v16

    invoke-static/range {v1 .. v12}, LA/b;->a(Landroidx/compose/ui/e;LA/B;Lz/N;ZLz/c$m;Lf0/c$b;Lw/n;ZLmh/l;LT/l;II)V

    const v1, 0x15bfd849

    invoke-interface {v13, v1}, LT/l;->U(I)V

    if-eqz v17, :cond_d

    const v1, 0x15bfe888

    invoke-interface {v13, v1}, LT/l;->U(I)V

    move/from16 v10, v25

    invoke-interface {v13, v10}, LT/l;->g(F)Z

    move-result v1

    move-object/from16 v11, v37

    invoke-interface {v13, v11}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v1, v2

    invoke-interface {v13, v15}, LT/l;->g(F)Z

    move-result v2

    or-int/2addr v1, v2

    invoke-interface/range {p1 .. p1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_9

    sget-object v1, LT/l;->a:LT/l$a;

    invoke-virtual {v1}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v2, v1, :cond_a

    :cond_9
    new-instance v2, Laa/c$b$d;

    invoke-direct {v2, v10, v11, v15}, Laa/c$b$d;-><init>(FLb1/f;F)V

    invoke-interface {v13, v2}, LT/l;->K(Ljava/lang/Object;)V

    :cond_a
    check-cast v2, Lmh/l;

    invoke-interface/range {p1 .. p1}, LT/l;->J()V

    move-object/from16 v9, v35

    move-object/from16 v12, v36

    invoke-virtual {v12, v9, v14, v2}, Lb1/l;->h(Landroidx/compose/ui/e;Lb1/f;Lmh/l;)Landroidx/compose/ui/e;

    move-result-object v1

    iget-object v2, v0, Laa/c$b$k;->d:Laa/d;

    invoke-virtual {v2}, Laa/d;->h0()LLi/N;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v14, 0x1

    invoke-static {v2, v3, v13, v4, v14}, LT/o1;->b(LLi/N;Ldh/i;LT/l;II)LT/z1;

    move-result-object v2

    invoke-interface {v2}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ls9/d;

    invoke-static {v2, v13, v4}, Lsa/a;->b(Ls9/d;LT/l;I)Ljava/lang/String;

    move-result-object v6

    const v2, 0x15c01dca

    invoke-interface {v13, v2}, LT/l;->U(I)V

    iget-object v2, v0, Laa/c$b$k;->e:LIi/N;

    invoke-interface {v13, v2}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v2

    iget-object v3, v0, Laa/c$b$k;->d:Laa/d;

    invoke-interface {v13, v3}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v2, v3

    invoke-interface/range {p1 .. p1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_b

    sget-object v2, LT/l;->a:LT/l$a;

    invoke-virtual {v2}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v3, v2, :cond_c

    :cond_b
    new-instance v3, Laa/c$b$e;

    iget-object v2, v0, Laa/c$b$k;->e:LIi/N;

    iget-object v4, v0, Laa/c$b$k;->d:Laa/d;

    invoke-direct {v3, v2, v4}, Laa/c$b$e;-><init>(LIi/N;Laa/d;)V

    invoke-interface {v13, v3}, LT/l;->K(Ljava/lang/Object;)V

    :cond_c
    move-object v2, v3

    check-cast v2, Lmh/a;

    invoke-interface/range {p1 .. p1}, LT/l;->J()V

    const/4 v8, 0x0

    const/16 v16, 0x1c

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object/from16 v7, p1

    move-object v14, v9

    move/from16 v9, v16

    invoke-static/range {v1 .. v9}, Lw9/o;->c(Landroidx/compose/ui/e;Lmh/a;ZZLs9/b;Ljava/lang/String;LT/l;II)V

    goto :goto_1

    :cond_d
    move/from16 v10, v25

    move-object/from16 v14, v35

    move-object/from16 v12, v36

    move-object/from16 v11, v37

    :goto_1
    invoke-interface/range {p1 .. p1}, LT/l;->J()V

    const v1, 0x15c044e4

    invoke-interface {v13, v1}, LT/l;->U(I)V

    invoke-interface {v13, v10}, LT/l;->g(F)Z

    move-result v1

    invoke-interface {v13, v15}, LT/l;->g(F)Z

    move-result v2

    or-int/2addr v1, v2

    invoke-interface/range {p1 .. p1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_e

    sget-object v1, LT/l;->a:LT/l$a;

    invoke-virtual {v1}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v2, v1, :cond_f

    :cond_e
    new-instance v2, Laa/c$b$f;

    invoke-direct {v2, v10, v15}, Laa/c$b$f;-><init>(FF)V

    invoke-interface {v13, v2}, LT/l;->K(Ljava/lang/Object;)V

    :cond_f
    check-cast v2, Lmh/l;

    invoke-interface/range {p1 .. p1}, LT/l;->J()V

    invoke-virtual {v12, v14, v11, v2}, Lb1/l;->h(Landroidx/compose/ui/e;Lb1/f;Lmh/l;)Landroidx/compose/ui/e;

    move-result-object v1

    iget-object v2, v0, Laa/c$b$k;->d:Laa/d;

    invoke-virtual {v2}, Laa/d;->f0()LLi/N;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x1

    invoke-static {v2, v3, v13, v4, v5}, LT/o1;->b(LLi/N;Ldh/i;LT/l;II)LT/z1;

    move-result-object v2

    invoke-interface {v2}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ls9/d;

    invoke-static {v2, v13, v4}, Lsa/a;->b(Ls9/d;LT/l;I)Ljava/lang/String;

    move-result-object v6

    iget-object v2, v0, Laa/c$b$k;->d:Laa/d;

    invoke-virtual {v2}, Laa/d;->e0()LLi/N;

    move-result-object v2

    invoke-static {v2, v3, v13, v4, v5}, LT/o1;->b(LLi/N;Ldh/i;LT/l;II)LT/z1;

    move-result-object v2

    invoke-interface {v2}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    const v2, 0x15c07ec4

    invoke-interface {v13, v2}, LT/l;->U(I)V

    iget-object v2, v0, Laa/c$b$k;->e:LIi/N;

    invoke-interface {v13, v2}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v2

    iget-object v4, v0, Laa/c$b$k;->d:Laa/d;

    invoke-interface {v13, v4}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v2, v4

    invoke-interface/range {p1 .. p1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v4

    if-nez v2, :cond_10

    sget-object v2, LT/l;->a:LT/l$a;

    invoke-virtual {v2}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v4, v2, :cond_11

    :cond_10
    new-instance v4, Laa/c$b$g;

    iget-object v2, v0, Laa/c$b$k;->e:LIi/N;

    iget-object v5, v0, Laa/c$b$k;->d:Laa/d;

    invoke-direct {v4, v2, v5}, Laa/c$b$g;-><init>(LIi/N;Laa/d;)V

    invoke-interface {v13, v4}, LT/l;->K(Ljava/lang/Object;)V

    :cond_11
    move-object v2, v4

    check-cast v2, Lmh/a;

    invoke-interface/range {p1 .. p1}, LT/l;->J()V

    const/4 v8, 0x0

    const/16 v9, 0x18

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object/from16 v7, p1

    invoke-static/range {v1 .. v9}, Lw9/o;->c(Landroidx/compose/ui/e;Lmh/a;ZZLs9/b;Ljava/lang/String;LT/l;II)V

    invoke-interface/range {p1 .. p1}, LT/l;->J()V

    iget-object v1, v0, Laa/c$b$k;->b:Lb1/l;

    invoke-virtual {v1}, Lb1/i;->e()I

    move-result v1

    move/from16 v2, v34

    if-eq v1, v2, :cond_12

    iget-object v1, v0, Laa/c$b$k;->c:Lmh/a;

    const/4 v2, 0x6

    invoke-static {v1, v13, v2}, LT/O;->g(Lmh/a;LT/l;I)V

    :cond_12
    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_13

    invoke-static {}, LT/o;->P()V

    :cond_13
    :goto_2
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Laa/c$b$k;->a(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
