.class final LZe/c$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LZe/c;->b(Landroidx/compose/ui/e;LZe/a;Lof/a$c;Lcom/ui/wifiman/ui/component/network/c$b;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/ui/e;

.field final synthetic b:LZe/a;


# direct methods
.method constructor <init>(Landroidx/compose/ui/e;LZe/a;)V
    .locals 0

    iput-object p1, p0, LZe/c$b;->a:Landroidx/compose/ui/e;

    iput-object p2, p0, LZe/c$b;->b:LZe/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lz/N;LT/l;I)V
    .locals 28

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v11, p2

    const-string v2, "padding"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v12, 0x6

    and-int/lit8 v2, p3, 0x6

    if-nez v2, :cond_1

    invoke-interface {v11, v1}, LT/l;->T(Ljava/lang/Object;)Z

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

    goto/16 :goto_8

    :cond_3
    :goto_2
    invoke-static {}, LT/o;->H()Z

    move-result v3

    if-eqz v3, :cond_4

    const/4 v3, -0x1

    const-string v4, "com.ui.wifiman.ui.speed.SpeedTabUi.<anonymous> (SpeedTabUi.kt:51)"

    const v5, -0x4ed574b7

    invoke-static {v5, v2, v3, v4}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_4
    iget-object v2, v0, LZe/c$b;->a:Landroidx/compose/ui/e;

    const/4 v13, 0x0

    const/4 v14, 0x1

    const/4 v15, 0x0

    invoke-static {v2, v13, v14, v15}, Landroidx/compose/foundation/layout/r;->f(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v2

    invoke-static {v2, v1}, Landroidx/compose/foundation/layout/o;->h(Landroidx/compose/ui/e;Lz/N;)Landroidx/compose/ui/e;

    move-result-object v1

    iget-object v2, v0, LZe/c$b;->a:Landroidx/compose/ui/e;

    iget-object v10, v0, LZe/c$b;->b:LZe/a;

    sget-object v3, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v3}, Lf0/c$a;->o()Lf0/c;

    move-result-object v4

    const/4 v9, 0x0

    invoke-static {v4, v9}, Landroidx/compose/foundation/layout/d;->h(Lf0/c;Z)LC0/C;

    move-result-object v4

    invoke-static {v11, v9}, LT/j;->a(LT/l;I)I

    move-result v5

    invoke-interface/range {p2 .. p2}, LT/l;->G()LT/x;

    move-result-object v6

    invoke-static {v11, v1}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v1

    sget-object v7, LE0/g;->K:LE0/g$a;

    invoke-virtual {v7}, LE0/g$a;->a()Lmh/a;

    move-result-object v8

    invoke-interface/range {p2 .. p2}, LT/l;->x()LT/f;

    move-result-object v16

    if-nez v16, :cond_5

    invoke-static {}, LT/j;->c()V

    :cond_5
    invoke-interface/range {p2 .. p2}, LT/l;->u()V

    invoke-interface/range {p2 .. p2}, LT/l;->o()Z

    move-result v16

    if-eqz v16, :cond_6

    invoke-interface {v11, v8}, LT/l;->D(Lmh/a;)V

    goto :goto_3

    :cond_6
    invoke-interface/range {p2 .. p2}, LT/l;->I()V

    :goto_3
    invoke-static/range {p2 .. p2}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v8

    invoke-virtual {v7}, LE0/g$a;->e()Lmh/p;

    move-result-object v12

    invoke-static {v8, v4, v12}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v7}, LE0/g$a;->g()Lmh/p;

    move-result-object v4

    invoke-static {v8, v6, v4}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v7}, LE0/g$a;->b()Lmh/p;

    move-result-object v4

    invoke-interface {v8}, LT/l;->o()Z

    move-result v6

    if-nez v6, :cond_7

    invoke-interface {v8}, LT/l;->f()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v6, v12}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_8

    :cond_7
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v8, v6}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v8, v5, v4}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_8
    invoke-virtual {v7}, LE0/g$a;->f()Lmh/p;

    move-result-object v4

    invoke-static {v8, v1, v4}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v1, Landroidx/compose/foundation/layout/f;->a:Landroidx/compose/foundation/layout/f;

    invoke-static {v2, v13, v14, v15}, Landroidx/compose/foundation/layout/r;->f(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v17

    invoke-static {v9, v11, v9, v14}, Landroidx/compose/foundation/m;->a(ILT/l;II)Landroidx/compose/foundation/o;

    move-result-object v18

    const/16 v22, 0xe

    const/16 v23, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    invoke-static/range {v17 .. v23}, Landroidx/compose/foundation/m;->d(Landroidx/compose/ui/e;Landroidx/compose/foundation/o;ZLw/n;ZILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    sget-object v2, Lz/c;->a:Lz/c;

    const/16 v4, 0x8

    int-to-float v12, v4

    invoke-static {v12}, LY0/h;->j(F)F

    move-result v4

    invoke-virtual {v2, v4}, Lz/c;->n(F)Lz/c$f;

    move-result-object v2

    invoke-virtual {v3}, Lf0/c$a;->k()Lf0/c$b;

    move-result-object v3

    const/4 v4, 0x6

    invoke-static {v2, v3, v11, v4}, Lz/h;->a(Lz/c$m;Lf0/c$b;LT/l;I)LC0/C;

    move-result-object v2

    invoke-static {v11, v9}, LT/j;->a(LT/l;I)I

    move-result v3

    invoke-interface/range {p2 .. p2}, LT/l;->G()LT/x;

    move-result-object v4

    invoke-static {v11, v1}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v1

    invoke-virtual {v7}, LE0/g$a;->a()Lmh/a;

    move-result-object v5

    invoke-interface/range {p2 .. p2}, LT/l;->x()LT/f;

    move-result-object v6

    if-nez v6, :cond_9

    invoke-static {}, LT/j;->c()V

    :cond_9
    invoke-interface/range {p2 .. p2}, LT/l;->u()V

    invoke-interface/range {p2 .. p2}, LT/l;->o()Z

    move-result v6

    if-eqz v6, :cond_a

    invoke-interface {v11, v5}, LT/l;->D(Lmh/a;)V

    goto :goto_4

    :cond_a
    invoke-interface/range {p2 .. p2}, LT/l;->I()V

    :goto_4
    invoke-static/range {p2 .. p2}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v5

    invoke-virtual {v7}, LE0/g$a;->e()Lmh/p;

    move-result-object v6

    invoke-static {v5, v2, v6}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v7}, LE0/g$a;->g()Lmh/p;

    move-result-object v2

    invoke-static {v5, v4, v2}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v7}, LE0/g$a;->b()Lmh/p;

    move-result-object v2

    invoke-interface {v5}, LT/l;->o()Z

    move-result v4

    if-nez v4, :cond_b

    invoke-interface {v5}, LT/l;->f()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v4, v6}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_c

    :cond_b
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v5, v4}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v5, v3, v2}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_c
    invoke-virtual {v7}, LE0/g$a;->f()Lmh/p;

    move-result-object v2

    invoke-static {v5, v1, v2}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v17, Lz/k;->a:Lz/k;

    sget-object v8, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    sget-object v7, Lla/a;->a:Lla/a;

    sget v6, Lla/a;->b:I

    invoke-virtual {v7, v11, v6}, Lla/a;->d(LT/l;I)Lra/a;

    move-result-object v1

    invoke-virtual {v1}, Lra/a;->a()Lra/b;

    move-result-object v1

    invoke-virtual {v1}, Lra/b;->b()Lra/b$a$b;

    move-result-object v1

    invoke-virtual {v1}, Lra/b$a$b;->e()F

    move-result v1

    invoke-static {v8, v1}, Landroidx/compose/foundation/layout/r;->i(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v1

    invoke-static {v1, v11, v9}, Lz/a0;->a(Landroidx/compose/ui/e;LT/l;I)V

    invoke-virtual {v10}, LZe/a;->o0()LLi/N;

    move-result-object v1

    invoke-static {v1, v15, v11, v9, v14}, LT/o1;->b(LLi/N;Ldh/i;LT/l;II)LT/z1;

    move-result-object v1

    invoke-interface {v1}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Laf/I;

    if-eqz v1, :cond_d

    move v2, v14

    goto :goto_5

    :cond_d
    move v2, v9

    :goto_5
    new-instance v3, LZe/c$b$a;

    invoke-direct {v3, v1, v10}, LZe/c$b$a;-><init>(Laf/I;LZe/a;)V

    const v1, 0x3044d3f5

    const/16 v5, 0x36

    invoke-static {v1, v14, v3, v11, v5}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v18

    const/16 v19, 0x1e

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const v22, 0x180006

    move-object/from16 v1, v17

    move-object/from16 v5, v20

    move/from16 v24, v6

    move-object/from16 v6, v21

    move-object/from16 v25, v7

    move-object/from16 v7, v18

    move-object/from16 v26, v8

    move-object/from16 v8, p2

    move/from16 v9, v22

    move-object/from16 p1, v10

    move/from16 v10, v19

    invoke-static/range {v1 .. v10}, Lq/d;->d(Lz/j;ZLandroidx/compose/ui/e;Landroidx/compose/animation/i;Landroidx/compose/animation/k;Ljava/lang/String;Lmh/q;LT/l;II)V

    move-object/from16 v10, v26

    invoke-static {v10, v13, v14, v15}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    invoke-virtual/range {p1 .. p1}, LZe/a;->s0()LLi/N;

    move-result-object v2

    const/4 v9, 0x0

    invoke-static {v2, v15, v11, v9, v14}, LT/o1;->b(LLi/N;Ldh/i;LT/l;II)LT/z1;

    move-result-object v2

    invoke-interface {v2}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Laf/q0;

    const v3, -0x1e7e4b4

    invoke-interface {v11, v3}, LT/l;->U(I)V

    move-object/from16 v8, p1

    invoke-interface {v11, v8}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v3

    invoke-interface/range {p2 .. p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_e

    sget-object v3, LT/l;->a:LT/l$a;

    invoke-virtual {v3}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v3

    if-ne v4, v3, :cond_f

    :cond_e
    new-instance v4, LZe/c$b$d;

    invoke-direct {v4, v8}, LZe/c$b$d;-><init>(Ljava/lang/Object;)V

    invoke-interface {v11, v4}, LT/l;->K(Ljava/lang/Object;)V

    :cond_f
    check-cast v4, Lth/g;

    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    move-object v3, v4

    check-cast v3, Lmh/l;

    const v4, -0x1e7dbbd

    invoke-interface {v11, v4}, LT/l;->U(I)V

    invoke-interface {v11, v8}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v4

    invoke-interface/range {p2 .. p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v5

    if-nez v4, :cond_10

    sget-object v4, LT/l;->a:LT/l$a;

    invoke-virtual {v4}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v4

    if-ne v5, v4, :cond_11

    :cond_10
    new-instance v5, LZe/c$b$e;

    invoke-direct {v5, v8}, LZe/c$b$e;-><init>(Ljava/lang/Object;)V

    invoke-interface {v11, v5}, LT/l;->K(Ljava/lang/Object;)V

    :cond_11
    check-cast v5, Lth/g;

    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    move-object v4, v5

    check-cast v4, Lmh/l;

    const/4 v6, 0x6

    move-object/from16 v5, p2

    invoke-static/range {v1 .. v6}, Laf/u0;->h(Landroidx/compose/ui/e;Laf/q0;Lmh/l;Lmh/l;LT/l;I)V

    invoke-static {v12}, LY0/h;->j(F)F

    move-result v1

    invoke-static {v10, v1}, Landroidx/compose/foundation/layout/r;->i(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v1

    const/4 v2, 0x6

    invoke-static {v1, v11, v2}, Lz/a0;->a(Landroidx/compose/ui/e;LT/l;I)V

    invoke-static {v10, v13, v14, v15}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    invoke-virtual {v8}, LZe/a;->r0()LLi/N;

    move-result-object v2

    invoke-static {v2, v15, v11, v9, v14}, LT/o1;->b(LLi/N;Ldh/i;LT/l;II)LT/z1;

    move-result-object v2

    invoke-interface {v2}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Laf/e0$a;

    const v3, -0x1e7b1db

    invoke-interface {v11, v3}, LT/l;->U(I)V

    invoke-interface {v11, v8}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v3

    invoke-interface/range {p2 .. p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_12

    sget-object v3, LT/l;->a:LT/l$a;

    invoke-virtual {v3}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v3

    if-ne v4, v3, :cond_13

    :cond_12
    new-instance v4, LZe/c$b$f;

    invoke-direct {v4, v8}, LZe/c$b$f;-><init>(Ljava/lang/Object;)V

    invoke-interface {v11, v4}, LT/l;->K(Ljava/lang/Object;)V

    :cond_13
    check-cast v4, Lth/g;

    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    move-object v3, v4

    check-cast v3, Lmh/a;

    const v4, -0x1e7a8ba

    invoke-interface {v11, v4}, LT/l;->U(I)V

    invoke-interface {v11, v8}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v4

    invoke-interface/range {p2 .. p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v5

    if-nez v4, :cond_14

    sget-object v4, LT/l;->a:LT/l$a;

    invoke-virtual {v4}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v4

    if-ne v5, v4, :cond_15

    :cond_14
    new-instance v5, LZe/c$b$g;

    invoke-direct {v5, v8}, LZe/c$b$g;-><init>(Ljava/lang/Object;)V

    invoke-interface {v11, v5}, LT/l;->K(Ljava/lang/Object;)V

    :cond_15
    check-cast v5, Lth/g;

    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    move-object v4, v5

    check-cast v4, Lmh/a;

    const v5, -0x1e79f99

    invoke-interface {v11, v5}, LT/l;->U(I)V

    invoke-interface {v11, v8}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v5

    invoke-interface/range {p2 .. p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v6

    if-nez v5, :cond_16

    sget-object v5, LT/l;->a:LT/l$a;

    invoke-virtual {v5}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v5

    if-ne v6, v5, :cond_17

    :cond_16
    new-instance v6, LZe/c$b$h;

    invoke-direct {v6, v8}, LZe/c$b$h;-><init>(Ljava/lang/Object;)V

    invoke-interface {v11, v6}, LT/l;->K(Ljava/lang/Object;)V

    :cond_17
    check-cast v6, Lth/g;

    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    move-object v5, v6

    check-cast v5, Lmh/a;

    const v6, -0x1e795fa

    invoke-interface {v11, v6}, LT/l;->U(I)V

    invoke-interface {v11, v8}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v6

    invoke-interface/range {p2 .. p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v7

    if-nez v6, :cond_18

    sget-object v6, LT/l;->a:LT/l$a;

    invoke-virtual {v6}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v6

    if-ne v7, v6, :cond_19

    :cond_18
    new-instance v7, LZe/c$b$i;

    invoke-direct {v7, v8}, LZe/c$b$i;-><init>(Ljava/lang/Object;)V

    invoke-interface {v11, v7}, LT/l;->K(Ljava/lang/Object;)V

    :cond_19
    check-cast v7, Lth/g;

    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    move-object v6, v7

    check-cast v6, Lmh/a;

    const v7, -0x1e78cb1

    invoke-interface {v11, v7}, LT/l;->U(I)V

    invoke-interface {v11, v8}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v7

    invoke-interface/range {p2 .. p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v9

    if-nez v7, :cond_1a

    sget-object v7, LT/l;->a:LT/l$a;

    invoke-virtual {v7}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v7

    if-ne v9, v7, :cond_1b

    :cond_1a
    new-instance v9, LZe/c$b$j;

    invoke-direct {v9, v8}, LZe/c$b$j;-><init>(Ljava/lang/Object;)V

    invoke-interface {v11, v9}, LT/l;->K(Ljava/lang/Object;)V

    :cond_1b
    check-cast v9, Lth/g;

    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    move-object v7, v9

    check-cast v7, Lmh/l;

    const/4 v9, 0x6

    move-object/from16 p1, v8

    move-object/from16 v8, p2

    const/4 v13, 0x0

    invoke-static/range {v1 .. v9}, Laf/m0;->q(Landroidx/compose/ui/e;Laf/e0$a;Lmh/a;Lmh/a;Lmh/a;Lmh/a;Lmh/l;LT/l;I)V

    invoke-static {v12}, LY0/h;->j(F)F

    move-result v1

    invoke-static {v10, v1}, Landroidx/compose/foundation/layout/r;->i(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v1

    const/4 v2, 0x6

    invoke-static {v1, v11, v2}, Lz/a0;->a(Landroidx/compose/ui/e;LT/l;I)V

    invoke-virtual/range {p1 .. p1}, LZe/a;->q0()LLi/N;

    move-result-object v1

    invoke-static {v1, v15, v11, v13, v14}, LT/o1;->b(LLi/N;Ldh/i;LT/l;II)LT/z1;

    move-result-object v1

    invoke-interface {v1}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Laf/P;

    if-eqz v1, :cond_1c

    move v2, v14

    goto :goto_6

    :cond_1c
    move v2, v13

    :goto_6
    new-instance v3, LZe/c$b$k;

    move-object/from16 v12, p1

    invoke-direct {v3, v1, v12}, LZe/c$b$k;-><init>(Laf/P;LZe/a;)V

    const v1, 0x3471319e

    const/16 v9, 0x36

    invoke-static {v1, v14, v3, v11, v9}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v7

    const/16 v18, 0x1e

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object/from16 v1, v17

    move-object/from16 v8, p2

    move/from16 v9, v22

    move-object/from16 v27, v10

    move/from16 v10, v18

    invoke-static/range {v1 .. v10}, Lq/d;->d(Lz/j;ZLandroidx/compose/ui/e;Landroidx/compose/animation/i;Landroidx/compose/animation/k;Ljava/lang/String;Lmh/q;LT/l;II)V

    invoke-virtual {v12}, LZe/a;->p0()LLi/N;

    move-result-object v1

    invoke-static {v1, v15, v11, v13, v14}, LT/o1;->b(LLi/N;Ldh/i;LT/l;II)LT/z1;

    move-result-object v1

    invoke-interface {v1}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Laf/P;

    if-eqz v1, :cond_1d

    move v2, v14

    goto :goto_7

    :cond_1d
    move v2, v13

    :goto_7
    new-instance v3, LZe/c$b$b;

    invoke-direct {v3, v1, v12}, LZe/c$b$b;-><init>(Laf/P;LZe/a;)V

    const v1, 0x7a406b7d

    const/16 v4, 0x36

    invoke-static {v1, v14, v3, v11, v4}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v7

    const/16 v10, 0x1e

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object/from16 v1, v17

    move-object/from16 v8, p2

    move/from16 v9, v22

    invoke-static/range {v1 .. v10}, Lq/d;->d(Lz/j;ZLandroidx/compose/ui/e;Landroidx/compose/animation/i;Landroidx/compose/animation/k;Ljava/lang/String;Lmh/q;LT/l;II)V

    move-object/from16 v2, v27

    const/4 v1, 0x0

    invoke-static {v2, v1, v14, v15}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    invoke-virtual {v12}, LZe/a;->n0()LLi/N;

    move-result-object v3

    invoke-static {v3, v15, v11, v13, v14}, LT/o1;->b(LLi/N;Ldh/i;LT/l;II)LT/z1;

    move-result-object v3

    invoke-interface {v3}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Laf/B;

    const v4, -0x1e6da7e

    invoke-interface {v11, v4}, LT/l;->U(I)V

    invoke-interface {v11, v12}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v4

    invoke-interface/range {p2 .. p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v5

    if-nez v4, :cond_1e

    sget-object v4, LT/l;->a:LT/l$a;

    invoke-virtual {v4}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v4

    if-ne v5, v4, :cond_1f

    :cond_1e
    new-instance v5, LZe/c$b$c;

    invoke-direct {v5, v12}, LZe/c$b$c;-><init>(Ljava/lang/Object;)V

    invoke-interface {v11, v5}, LT/l;->K(Ljava/lang/Object;)V

    :cond_1f
    check-cast v5, Lth/g;

    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    check-cast v5, Lmh/a;

    const/4 v4, 0x6

    invoke-static {v1, v3, v5, v11, v4}, Laf/H;->o(Landroidx/compose/ui/e;Laf/B;Lmh/a;LT/l;I)V

    const/16 v1, 0x28

    int-to-float v1, v1

    invoke-static {v1}, LY0/h;->j(F)F

    move-result v1

    invoke-static {v2, v1}, Landroidx/compose/foundation/layout/r;->i(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v1

    invoke-static {v1, v11, v4}, Lz/a0;->a(Landroidx/compose/ui/e;LT/l;I)V

    invoke-interface/range {p2 .. p2}, LT/l;->R()V

    move/from16 v2, v24

    move-object/from16 v1, v25

    invoke-virtual {v1, v11, v2}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v1

    invoke-virtual {v1}, Lma/a;->e()Lma/a$e;

    move-result-object v1

    invoke-virtual {v1}, Lma/a$e;->b()J

    move-result-wide v2

    const/4 v5, 0x0

    const/4 v6, 0x1

    const/4 v1, 0x0

    move-object/from16 v4, p2

    invoke-static/range {v1 .. v6}, LEe/B;->b(Landroidx/compose/ui/e;JLT/l;II)V

    invoke-interface/range {p2 .. p2}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_20

    invoke-static {}, LT/o;->P()V

    :cond_20
    :goto_8
    return-void
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lz/N;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, LZe/c$b;->a(Lz/N;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
