.class final Ldf/h$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ldf/h;->j(Landroidx/compose/ui/e;Ldf/c;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ldf/c;


# direct methods
.method constructor <init>(Ldf/c;)V
    .locals 0

    iput-object p1, p0, Ldf/h$a;->a:Ldf/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lz/j;LT/l;I)V
    .locals 29

    move-object/from16 v15, p2

    move/from16 v0, p3

    const-string v1, "$this$ModalScaffold"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v1, v0, 0x11

    const/16 v11, 0x10

    if-ne v1, v11, :cond_1

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

    const-string v2, "com.ui.wifiman.ui.speed.isp.IspDetailUi.<anonymous> (IspDetailUi.kt:64)"

    const v3, -0x5daffbde

    invoke-static {v3, v0, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    sget-object v13, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    sget-object v12, Lla/a;->a:Lla/a;

    sget v14, Lla/a;->b:I

    invoke-virtual {v12, v15, v14}, Lla/a;->d(LT/l;I)Lra/a;

    move-result-object v0

    invoke-virtual {v0}, Lra/a;->a()Lra/b;

    move-result-object v0

    invoke-virtual {v0}, Lra/b;->a()Lra/b$a$a;

    move-result-object v0

    invoke-virtual {v0}, Lra/b$a$a;->d()F

    move-result v0

    const/4 v1, 0x2

    const/4 v10, 0x0

    const/4 v9, 0x0

    invoke-static {v13, v0, v10, v1, v9}, Landroidx/compose/foundation/layout/o;->k(Landroidx/compose/ui/e;FFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v2

    invoke-virtual {v12, v15, v14}, Lla/a;->d(LT/l;I)Lra/a;

    move-result-object v0

    invoke-virtual {v0}, Lra/a;->a()Lra/b;

    move-result-object v0

    invoke-virtual {v0}, Lra/b;->b()Lra/b$a$b;

    move-result-object v0

    const/16 v1, 0x18

    int-to-float v1, v1

    invoke-static {v1}, LY0/h;->j(F)F

    move-result v1

    invoke-virtual {v0, v1}, Lra/b$a;->a(F)F

    move-result v6

    const/4 v7, 0x7

    const/4 v8, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v8}, Landroidx/compose/foundation/layout/o;->m(Landroidx/compose/ui/e;FFFFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v0

    sget-object v1, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v1}, Lf0/c$a;->g()Lf0/c$b;

    move-result-object v1

    sget-object v2, Lz/c;->a:Lz/c;

    invoke-virtual {v2}, Lz/c;->g()Lz/c$m;

    move-result-object v2

    move-object/from16 v8, p0

    iget-object v6, v8, Ldf/h$a;->a:Ldf/c;

    const/16 v7, 0x36

    invoke-static {v2, v1, v15, v7}, Lz/h;->a(Lz/c$m;Lf0/c$b;LT/l;I)LC0/C;

    move-result-object v1

    const/4 v5, 0x0

    invoke-static {v15, v5}, LT/j;->a(LT/l;I)I

    move-result v2

    invoke-interface/range {p2 .. p2}, LT/l;->G()LT/x;

    move-result-object v3

    invoke-static {v15, v0}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v0

    sget-object v4, LE0/g;->K:LE0/g$a;

    invoke-virtual {v4}, LE0/g$a;->a()Lmh/a;

    move-result-object v7

    invoke-interface/range {p2 .. p2}, LT/l;->x()LT/f;

    move-result-object v16

    if-nez v16, :cond_3

    invoke-static {}, LT/j;->c()V

    :cond_3
    invoke-interface/range {p2 .. p2}, LT/l;->u()V

    invoke-interface/range {p2 .. p2}, LT/l;->o()Z

    move-result v16

    if-eqz v16, :cond_4

    invoke-interface {v15, v7}, LT/l;->D(Lmh/a;)V

    goto :goto_1

    :cond_4
    invoke-interface/range {p2 .. p2}, LT/l;->I()V

    :goto_1
    invoke-static/range {p2 .. p2}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v7

    invoke-virtual {v4}, LE0/g$a;->e()Lmh/p;

    move-result-object v10

    invoke-static {v7, v1, v10}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v4}, LE0/g$a;->g()Lmh/p;

    move-result-object v1

    invoke-static {v7, v3, v1}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v4}, LE0/g$a;->b()Lmh/p;

    move-result-object v1

    invoke-interface {v7}, LT/l;->o()Z

    move-result v3

    if-nez v3, :cond_5

    invoke-interface {v7}, LT/l;->f()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v3, v10}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_6

    :cond_5
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v7, v3}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v7, v2, v1}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_6
    invoke-virtual {v4}, LE0/g$a;->f()Lmh/p;

    move-result-object v1

    invoke-static {v7, v0, v1}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v26, Lz/k;->a:Lz/k;

    invoke-virtual {v12, v15, v14}, Lla/a;->d(LT/l;I)Lra/a;

    move-result-object v0

    invoke-virtual {v0}, Lra/a;->a()Lra/b;

    move-result-object v0

    invoke-virtual {v0}, Lra/b;->b()Lra/b$a$b;

    move-result-object v0

    const/16 v1, 0x20

    int-to-float v1, v1

    invoke-static {v1}, LY0/h;->j(F)F

    move-result v1

    invoke-virtual {v0, v1}, Lra/b$a;->a(F)F

    move-result v0

    invoke-static {v13, v0}, Landroidx/compose/foundation/layout/r;->i(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v0

    invoke-static {v0, v15, v5}, Lz/a0;->a(Landroidx/compose/ui/e;LT/l;I)V

    invoke-virtual {v6}, Ldf/c;->p0()LLi/N;

    move-result-object v0

    const/4 v10, 0x1

    invoke-static {v0, v9, v15, v5, v10}, LT/o1;->b(LLi/N;Ldh/i;LT/l;II)LT/z1;

    move-result-object v0

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ls9/a;

    if-nez v0, :cond_7

    sget-object v0, LN9/b;->a:LN9/b;

    invoke-virtual {v0}, LN9/b;->B()Ls9/b;

    move-result-object v0

    :cond_7
    const/16 v1, 0x40

    int-to-float v1, v1

    invoke-static {v1}, LY0/h;->j(F)F

    move-result v1

    invoke-static {v13, v1}, Landroidx/compose/foundation/layout/r;->v(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v1

    sget-object v2, LN9/b;->a:LN9/b;

    invoke-virtual {v2}, LN9/b;->B()Ls9/b;

    move-result-object v3

    const/16 v16, 0x30

    const/16 v17, 0x3a

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v7, 0x0

    const-wide/16 v18, 0x0

    move v5, v7

    move-object/from16 v27, v6

    move-wide/from16 v6, v18

    move-object/from16 v8, p2

    move/from16 v9, v16

    move/from16 v10, v17

    invoke-static/range {v0 .. v10}, LBe/w;->b(Ls9/a;Landroidx/compose/ui/e;Ls9/a$b;Ls9/a$b;Ljava/lang/String;FJLT/l;II)V

    int-to-float v0, v11

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v0

    invoke-static {v13, v0}, Landroidx/compose/foundation/layout/r;->i(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v0

    const/4 v11, 0x6

    invoke-static {v0, v15, v11}, Lz/a0;->a(Landroidx/compose/ui/e;LT/l;I)V

    invoke-virtual/range {v27 .. v27}, Ldf/c;->q0()LLi/N;

    move-result-object v0

    const/4 v8, 0x1

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static {v0, v9, v15, v10, v8}, LT/o1;->b(LLi/N;Ldh/i;LT/l;II)LT/z1;

    move-result-object v0

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ls9/d;

    if-nez v0, :cond_8

    new-instance v0, Ls9/d$b;

    sget v1, Lm8/c;->k1:I

    invoke-direct {v0, v1}, Ls9/d$b;-><init>(I)V

    :cond_8
    invoke-static {v0, v15, v10}, Lsa/a;->a(Ls9/d;LT/l;I)LL0/d;

    move-result-object v0

    invoke-virtual {v12, v15, v14}, Lla/a;->c(LT/l;I)Lpa/c;

    move-result-object v1

    invoke-virtual {v1}, Lpa/c;->a()Lpa/b;

    move-result-object v1

    invoke-virtual {v1}, Lpa/b;->b()LL0/U;

    move-result-object v21

    invoke-virtual {v12, v15, v14}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v1

    invoke-virtual {v1}, Lma/a;->f()Lma/a$f;

    move-result-object v1

    invoke-virtual {v1}, Lma/a$f;->a()J

    move-result-wide v2

    const/16 v24, 0x0

    const v25, 0x1fffa

    const/4 v1, 0x0

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v12, 0x0

    move v14, v8

    move-object v8, v12

    const-wide/16 v16, 0x0

    move-object v12, v9

    move-wide/from16 v9, v16

    const/16 v16, 0x0

    move-object/from16 v11, v16

    move-object/from16 v12, v16

    const-wide/16 v16, 0x0

    move-object/from16 v28, v13

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

    const/4 v0, 0x6

    int-to-float v1, v0

    invoke-static {v1}, LY0/h;->j(F)F

    move-result v1

    move-object/from16 v8, v28

    invoke-static {v8, v1}, Landroidx/compose/foundation/layout/r;->i(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v1

    move-object/from16 v10, p2

    invoke-static {v1, v10, v0}, Lz/a0;->a(Landroidx/compose/ui/e;LT/l;I)V

    invoke-virtual/range {v27 .. v27}, Ldf/c;->n0()LLi/N;

    move-result-object v0

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x1

    invoke-static {v0, v9, v10, v11, v12}, LT/o1;->b(LLi/N;Ldh/i;LT/l;II)LT/z1;

    move-result-object v0

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ldf/a;

    const/4 v13, 0x0

    invoke-static {v8, v13, v12, v9}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    invoke-virtual {v0}, Ldf/a;->a()Lb8/a;

    move-result-object v2

    instance-of v2, v2, Lb8/a$b;

    xor-int/2addr v2, v12

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    new-instance v3, Ldf/h$a$a;

    invoke-direct {v3, v0}, Ldf/h$a$a;-><init>(Ldf/a;)V

    const v0, 0xc519797

    const/16 v14, 0x36

    invoke-static {v0, v12, v3, v10, v14}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v4

    const/16 v6, 0x6c30

    const/4 v7, 0x4

    const/4 v3, 0x0

    const-string v5, "crossfade"

    move-object v0, v2

    move-object v2, v3

    move-object v3, v5

    move-object/from16 v5, p2

    invoke-static/range {v0 .. v7}, Lq/j;->a(Ljava/lang/Object;Landroidx/compose/ui/e;Lr/H;Ljava/lang/String;Lmh/q;LT/l;II)V

    invoke-virtual/range {v27 .. v27}, Ldf/c;->o0()LLi/N;

    move-result-object v0

    invoke-static {v0, v9, v10, v11, v12}, LT/o1;->b(LLi/N;Ldh/i;LT/l;II)LT/z1;

    move-result-object v0

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LCi/c;

    invoke-static {v8, v13, v12, v9}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v2

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    xor-int/2addr v1, v12

    new-instance v3, Ldf/h$a$b;

    move-object/from16 v4, v27

    invoke-direct {v3, v0, v4}, Ldf/h$a$b;-><init>(LCi/c;Ldf/c;)V

    const v0, 0x5de0a7f0

    invoke-static {v0, v12, v3, v10, v14}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v6

    const v8, 0x180186

    const/16 v9, 0x1c

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object/from16 v0, v26

    move-object/from16 v7, p2

    invoke-static/range {v0 .. v9}, Lq/d;->d(Lz/j;ZLandroidx/compose/ui/e;Landroidx/compose/animation/i;Landroidx/compose/animation/k;Ljava/lang/String;Lmh/q;LT/l;II)V

    invoke-interface/range {p2 .. p2}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-static {}, LT/o;->P()V

    :cond_9
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

    invoke-virtual {p0, p1, p2, p3}, Ldf/h$a;->a(Lz/j;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
