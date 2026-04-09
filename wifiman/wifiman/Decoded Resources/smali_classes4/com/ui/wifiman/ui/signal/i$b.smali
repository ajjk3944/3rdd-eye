.class final Lcom/ui/wifiman/ui/signal/i$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/ui/signal/i;->b(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/signal/g;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/ui/signal/g;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/ui/signal/g;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/ui/signal/i$b;->a:Lcom/ui/wifiman/ui/signal/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lcom/ui/wifiman/ui/signal/g;LJ9/a;)LYg/J;
    .locals 0

    invoke-static {p0, p1}, Lcom/ui/wifiman/ui/signal/i$b;->c(Lcom/ui/wifiman/ui/signal/g;LJ9/a;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Lcom/ui/wifiman/ui/signal/g;LJ9/a;)LYg/J;
    .locals 1

    const-string v0, "tab"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LJ9/a;->c()I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/ui/signal/g;->r0(I)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method


# virtual methods
.method public final b(Lz/j;LT/l;I)V
    .locals 31

    move-object/from16 v15, p2

    move/from16 v0, p3

    const-string v1, "$this$ModalScaffold"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v1, v0, 0x11

    const/16 v8, 0x10

    if-ne v1, v8, :cond_1

    invoke-interface/range {p2 .. p2}, LT/l;->v()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface/range {p2 .. p2}, LT/l;->C()V

    goto/16 :goto_5

    :cond_1
    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v1, -0x1

    const-string v2, "com.ui.wifiman.ui.signal.SignalTabApComparisonConfigUi.<anonymous> (SignalTabApComparisonConfigUi.kt:75)"

    const v3, -0x5ade275f

    invoke-static {v3, v0, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    sget-object v14, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/4 v13, 0x0

    const/4 v12, 0x1

    const/4 v11, 0x0

    invoke-static {v14, v13, v12, v11}, Landroidx/compose/foundation/layout/r;->f(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v0

    move-object/from16 v10, p0

    iget-object v9, v10, Lcom/ui/wifiman/ui/signal/i$b;->a:Lcom/ui/wifiman/ui/signal/g;

    sget-object v7, Lz/c;->a:Lz/c;

    invoke-virtual {v7}, Lz/c;->g()Lz/c$m;

    move-result-object v1

    sget-object v25, Lf0/c;->a:Lf0/c$a;

    invoke-virtual/range {v25 .. v25}, Lf0/c$a;->k()Lf0/c$b;

    move-result-object v2

    const/4 v6, 0x0

    invoke-static {v1, v2, v15, v6}, Lz/h;->a(Lz/c$m;Lf0/c$b;LT/l;I)LC0/C;

    move-result-object v1

    invoke-static {v15, v6}, LT/j;->a(LT/l;I)I

    move-result v2

    invoke-interface/range {p2 .. p2}, LT/l;->G()LT/x;

    move-result-object v3

    invoke-static {v15, v0}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v0

    sget-object v26, LE0/g;->K:LE0/g$a;

    invoke-virtual/range {v26 .. v26}, LE0/g$a;->a()Lmh/a;

    move-result-object v4

    invoke-interface/range {p2 .. p2}, LT/l;->x()LT/f;

    move-result-object v5

    if-nez v5, :cond_3

    invoke-static {}, LT/j;->c()V

    :cond_3
    invoke-interface/range {p2 .. p2}, LT/l;->u()V

    invoke-interface/range {p2 .. p2}, LT/l;->o()Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-interface {v15, v4}, LT/l;->D(Lmh/a;)V

    goto :goto_1

    :cond_4
    invoke-interface/range {p2 .. p2}, LT/l;->I()V

    :goto_1
    invoke-static/range {p2 .. p2}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v4

    invoke-virtual/range {v26 .. v26}, LE0/g$a;->e()Lmh/p;

    move-result-object v5

    invoke-static {v4, v1, v5}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v26 .. v26}, LE0/g$a;->g()Lmh/p;

    move-result-object v1

    invoke-static {v4, v3, v1}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v26 .. v26}, LE0/g$a;->b()Lmh/p;

    move-result-object v1

    invoke-interface {v4}, LT/l;->o()Z

    move-result v3

    if-nez v3, :cond_5

    invoke-interface {v4}, LT/l;->f()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v3, v5}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_6

    :cond_5
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v4, v3}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v4, v2, v1}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_6
    invoke-virtual/range {v26 .. v26}, LE0/g$a;->f()Lmh/p;

    move-result-object v1

    invoke-static {v4, v0, v1}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v27, Lz/k;->a:Lz/k;

    sget-object v5, Lla/a;->a:Lla/a;

    sget v4, Lla/a;->b:I

    invoke-virtual {v5, v15, v4}, Lla/a;->d(LT/l;I)Lra/a;

    move-result-object v0

    invoke-virtual {v0}, Lra/a;->a()Lra/b;

    move-result-object v0

    invoke-virtual {v0}, Lra/b;->b()Lra/b$a$b;

    move-result-object v0

    const/16 v1, 0xc

    int-to-float v1, v1

    invoke-static {v1}, LY0/h;->j(F)F

    move-result v1

    invoke-virtual {v0, v1}, Lra/b$a;->a(F)F

    move-result v0

    invoke-static {v14, v0}, Landroidx/compose/foundation/layout/r;->i(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v0

    invoke-static {v0, v15, v6}, Lz/a0;->a(Landroidx/compose/ui/e;LT/l;I)V

    invoke-virtual {v5, v15, v4}, Lla/a;->d(LT/l;I)Lra/a;

    move-result-object v0

    invoke-virtual {v0}, Lra/a;->a()Lra/b;

    move-result-object v0

    invoke-virtual {v0}, Lra/b;->a()Lra/b$a$a;

    move-result-object v0

    invoke-virtual {v0}, Lra/b$a$a;->c()F

    move-result v0

    const/4 v3, 0x2

    invoke-static {v14, v0, v13, v3, v11}, Landroidx/compose/foundation/layout/o;->k(Landroidx/compose/ui/e;FFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v0

    invoke-virtual {v9}, Lcom/ui/wifiman/ui/signal/g;->n0()LLi/N;

    move-result-object v1

    invoke-static {v1, v11, v15, v6, v12}, LT/o1;->b(LLi/N;Ldh/i;LT/l;II)LT/z1;

    move-result-object v1

    invoke-interface {v1}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LJ9/j;

    const v2, -0x15f6e305

    invoke-interface {v15, v2}, LT/l;->U(I)V

    invoke-interface {v15, v9}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v2

    invoke-interface/range {p2 .. p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_7

    sget-object v2, LT/l;->a:LT/l$a;

    invoke-virtual {v2}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v3, v2, :cond_8

    :cond_7
    new-instance v3, Lcom/ui/wifiman/ui/signal/j;

    invoke-direct {v3, v9}, Lcom/ui/wifiman/ui/signal/j;-><init>(Lcom/ui/wifiman/ui/signal/g;)V

    invoke-interface {v15, v3}, LT/l;->K(Ljava/lang/Object;)V

    :cond_8
    move-object/from16 v16, v3

    check-cast v16, Lmh/l;

    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    const/16 v17, 0x0

    const/16 v18, 0xc

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v12, 0x2

    move v11, v4

    move-object/from16 v4, v16

    move-object v12, v5

    move-object/from16 v5, p2

    move/from16 v6, v17

    move-object/from16 v28, v7

    move/from16 v7, v18

    invoke-static/range {v0 .. v7}, LJ9/h;->g(Landroidx/compose/ui/e;LJ9/j;ZLJ9/i;Lmh/l;LT/l;II)V

    int-to-float v0, v8

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v1

    invoke-static {v14, v1}, Landroidx/compose/foundation/layout/r;->i(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v1

    const/4 v2, 0x6

    invoke-static {v1, v15, v2}, Lz/a0;->a(Landroidx/compose/ui/e;LT/l;I)V

    invoke-virtual {v12, v15, v11}, Lla/a;->d(LT/l;I)Lra/a;

    move-result-object v1

    invoke-virtual {v1}, Lra/a;->a()Lra/b;

    move-result-object v1

    invoke-virtual {v1}, Lra/b;->a()Lra/b$a$a;

    move-result-object v1

    invoke-virtual {v1}, Lra/b$a$a;->d()F

    move-result v1

    const/4 v3, 0x0

    const/4 v4, 0x2

    invoke-static {v14, v1, v13, v4, v3}, Landroidx/compose/foundation/layout/o;->k(Landroidx/compose/ui/e;FFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v0

    move-object/from16 v3, v28

    invoke-virtual {v3, v0}, Lz/c;->n(F)Lz/c$f;

    move-result-object v0

    invoke-virtual/range {v25 .. v25}, Lf0/c$a;->l()Lf0/c$c;

    move-result-object v3

    invoke-static {v0, v3, v15, v2}, Lz/W;->b(Lz/c$e;Lf0/c$c;LT/l;I)LC0/C;

    move-result-object v0

    const/4 v8, 0x0

    invoke-static {v15, v8}, LT/j;->a(LT/l;I)I

    move-result v2

    invoke-interface/range {p2 .. p2}, LT/l;->G()LT/x;

    move-result-object v3

    invoke-static {v15, v1}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v1

    invoke-virtual/range {v26 .. v26}, LE0/g$a;->a()Lmh/a;

    move-result-object v4

    invoke-interface/range {p2 .. p2}, LT/l;->x()LT/f;

    move-result-object v5

    if-nez v5, :cond_9

    invoke-static {}, LT/j;->c()V

    :cond_9
    invoke-interface/range {p2 .. p2}, LT/l;->u()V

    invoke-interface/range {p2 .. p2}, LT/l;->o()Z

    move-result v5

    if-eqz v5, :cond_a

    invoke-interface {v15, v4}, LT/l;->D(Lmh/a;)V

    goto :goto_2

    :cond_a
    invoke-interface/range {p2 .. p2}, LT/l;->I()V

    :goto_2
    invoke-static/range {p2 .. p2}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v4

    invoke-virtual/range {v26 .. v26}, LE0/g$a;->e()Lmh/p;

    move-result-object v5

    invoke-static {v4, v0, v5}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v26 .. v26}, LE0/g$a;->g()Lmh/p;

    move-result-object v0

    invoke-static {v4, v3, v0}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v26 .. v26}, LE0/g$a;->b()Lmh/p;

    move-result-object v0

    invoke-interface {v4}, LT/l;->o()Z

    move-result v3

    if-nez v3, :cond_b

    invoke-interface {v4}, LT/l;->f()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v3, v5}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_c

    :cond_b
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v4, v3}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v4, v2, v0}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_c
    invoke-virtual/range {v26 .. v26}, LE0/g$a;->f()Lmh/p;

    move-result-object v0

    invoke-static {v4, v1, v0}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v7, Lz/Z;->a:Lz/Z;

    invoke-virtual {v9}, Lcom/ui/wifiman/ui/signal/g;->p0()LLi/N;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {v0, v2, v15, v8, v1}, LT/o1;->b(LLi/N;Ldh/i;LT/l;II)LT/z1;

    move-result-object v0

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/ui/wifiman/ui/signal/f;

    const/4 v0, 0x2

    const/4 v3, 0x0

    const/high16 v4, 0x3f800000    # 1.0f

    const/4 v5, 0x0

    move-object/from16 p1, v9

    move-object v9, v7

    move-object v10, v14

    move v2, v11

    move v11, v4

    move v4, v1

    move-object v1, v12

    move v12, v5

    move v5, v13

    move v13, v0

    move-object v0, v14

    move-object v14, v3

    invoke-static/range {v9 .. v14}, Lz/Y;->b(Lz/Y;Landroidx/compose/ui/e;FZILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v3

    move-object v9, v1

    move-object v1, v3

    sget v3, Lm8/c;->k2:I

    invoke-static {v3, v15, v8}, LH0/f;->a(ILT/l;I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v6}, Lcom/ui/wifiman/ui/signal/f;->a()I

    move-result v10

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    filled-new-array {v10}, [Ljava/lang/Object;

    move-result-object v10

    invoke-static {v10, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v10

    invoke-static {v3, v10}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    move-object v13, v0

    move-object v0, v3

    const-string v10, "format(...)"

    invoke-static {v3, v10}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v9, v15, v2}, Lla/a;->c(LT/l;I)Lpa/c;

    move-result-object v3

    invoke-virtual {v3}, Lpa/c;->b()Lpa/b;

    move-result-object v3

    invoke-virtual {v3}, Lpa/b;->a()LL0/U;

    move-result-object v20

    invoke-virtual {v9, v15, v2}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v2

    invoke-virtual {v2}, Lma/a;->f()Lma/a$f;

    move-result-object v2

    invoke-virtual {v2}, Lma/a$f;->b()J

    move-result-wide v2

    const/4 v14, 0x0

    const/16 v23, 0x0

    const v24, 0xfff8

    const-wide/16 v9, 0x0

    move v11, v4

    move v12, v5

    move-wide v4, v9

    const/4 v9, 0x0

    move-object v10, v6

    move-object v6, v9

    move-object/from16 v29, v7

    move-object v7, v9

    move-object v8, v9

    const-wide/16 v16, 0x0

    move-object/from16 p3, v10

    move-wide/from16 v9, v16

    const/16 v16, 0x0

    move-object/from16 v11, v16

    move-object/from16 v12, v16

    const-wide/16 v16, 0x0

    move-object/from16 v30, v13

    move-wide/from16 v13, v16

    const/16 v16, 0x0

    move/from16 v15, v16

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v22, 0x0

    move-object/from16 v21, p2

    invoke-static/range {v0 .. v24}, LN/a1;->b(Ljava/lang/String;Landroidx/compose/ui/e;JJLQ0/v;LQ0/A;LQ0/k;JLW0/k;LW0/j;JIZIILmh/l;LL0/U;LT/l;III)V

    invoke-virtual/range {p3 .. p3}, Lcom/ui/wifiman/ui/signal/f;->b()I

    move-result v0

    if-lez v0, :cond_d

    const/4 v1, 0x1

    goto :goto_3

    :cond_d
    const/4 v1, 0x0

    :goto_3
    new-instance v0, Lcom/ui/wifiman/ui/signal/i$b$a;

    move-object/from16 v3, p3

    move-object/from16 v2, v29

    invoke-direct {v0, v2, v3}, Lcom/ui/wifiman/ui/signal/i$b$a;-><init>(Lz/Y;Lcom/ui/wifiman/ui/signal/f;)V

    const v3, 0x7c1231af

    const/16 v10, 0x36

    move-object/from16 v11, p2

    const/4 v12, 0x1

    invoke-static {v3, v12, v0, v11, v10}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v6

    const v8, 0x180006

    const/16 v9, 0x1e

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    move-object v0, v2

    move-object v2, v3

    move-object v3, v4

    move-object v4, v5

    move-object v5, v7

    move-object/from16 v7, p2

    invoke-static/range {v0 .. v9}, Lq/d;->e(Lz/Y;ZLandroidx/compose/ui/e;Landroidx/compose/animation/i;Landroidx/compose/animation/k;Ljava/lang/String;Lmh/q;LT/l;II)V

    invoke-interface/range {p2 .. p2}, LT/l;->R()V

    move-object/from16 v0, v30

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v0, v1, v12, v2}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v16

    const/16 v19, 0x2

    const/16 v20, 0x0

    const/high16 v17, 0x3f800000    # 1.0f

    const/16 v18, 0x0

    move-object/from16 v15, v27

    invoke-static/range {v15 .. v20}, Lz/j;->b(Lz/j;Landroidx/compose/ui/e;FZILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v3

    invoke-virtual/range {v25 .. v25}, Lf0/c$a;->o()Lf0/c;

    move-result-object v4

    const/4 v5, 0x0

    invoke-static {v4, v5}, Landroidx/compose/foundation/layout/d;->h(Lf0/c;Z)LC0/C;

    move-result-object v4

    invoke-static {v11, v5}, LT/j;->a(LT/l;I)I

    move-result v6

    invoke-interface/range {p2 .. p2}, LT/l;->G()LT/x;

    move-result-object v7

    invoke-static {v11, v3}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v3

    invoke-virtual/range {v26 .. v26}, LE0/g$a;->a()Lmh/a;

    move-result-object v8

    invoke-interface/range {p2 .. p2}, LT/l;->x()LT/f;

    move-result-object v9

    if-nez v9, :cond_e

    invoke-static {}, LT/j;->c()V

    :cond_e
    invoke-interface/range {p2 .. p2}, LT/l;->u()V

    invoke-interface/range {p2 .. p2}, LT/l;->o()Z

    move-result v9

    if-eqz v9, :cond_f

    invoke-interface {v11, v8}, LT/l;->D(Lmh/a;)V

    goto :goto_4

    :cond_f
    invoke-interface/range {p2 .. p2}, LT/l;->I()V

    :goto_4
    invoke-static/range {p2 .. p2}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v8

    invoke-virtual/range {v26 .. v26}, LE0/g$a;->e()Lmh/p;

    move-result-object v9

    invoke-static {v8, v4, v9}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v26 .. v26}, LE0/g$a;->g()Lmh/p;

    move-result-object v4

    invoke-static {v8, v7, v4}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v26 .. v26}, LE0/g$a;->b()Lmh/p;

    move-result-object v4

    invoke-interface {v8}, LT/l;->o()Z

    move-result v7

    if-nez v7, :cond_10

    invoke-interface {v8}, LT/l;->f()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v7, v9}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_11

    :cond_10
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v8, v7}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v8, v6, v4}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_11
    invoke-virtual/range {v26 .. v26}, LE0/g$a;->f()Lmh/p;

    move-result-object v4

    invoke-static {v8, v3, v4}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v3, Landroidx/compose/foundation/layout/f;->a:Landroidx/compose/foundation/layout/f;

    invoke-static {v0, v1, v12, v2}, Landroidx/compose/foundation/layout/r;->f(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v0

    invoke-virtual/range {p1 .. p1}, Lcom/ui/wifiman/ui/signal/g;->o0()LLi/N;

    move-result-object v1

    invoke-static {v1, v2, v11, v5, v12}, LT/o1;->b(LLi/N;Ldh/i;LT/l;II)LT/z1;

    move-result-object v1

    invoke-interface {v1}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LEe/g;

    new-instance v2, Lcom/ui/wifiman/ui/signal/i$b$b;

    move-object/from16 v3, p1

    invoke-direct {v2, v3}, Lcom/ui/wifiman/ui/signal/i$b$b;-><init>(Lcom/ui/wifiman/ui/signal/g;)V

    const v3, -0x67a2573b

    invoke-static {v3, v12, v2, v11, v10}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v7

    const v9, 0xc00006

    const/16 v10, 0x7c

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object/from16 v8, p2

    invoke-static/range {v0 .. v10}, LEe/z;->L(Landroidx/compose/ui/e;LEe/g;LA/B;ZZLmh/r;Lmh/l;Lmh/r;LT/l;II)V

    const/4 v5, 0x3

    const/4 v0, 0x0

    const-wide/16 v1, 0x0

    move-object/from16 v3, p2

    invoke-static/range {v0 .. v5}, LEe/B;->b(Landroidx/compose/ui/e;JLT/l;II)V

    invoke-interface/range {p2 .. p2}, LT/l;->R()V

    invoke-interface/range {p2 .. p2}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_12

    invoke-static {}, LT/o;->P()V

    :cond_12
    :goto_5
    return-void
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lz/j;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lcom/ui/wifiman/ui/signal/i$b;->b(Lz/j;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
