.class final LYe/i$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYe/i;->e(Landroidx/compose/ui/e;LYe/f;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/ui/e;

.field final synthetic b:LYe/f;


# direct methods
.method constructor <init>(Landroidx/compose/ui/e;LYe/f;)V
    .locals 0

    iput-object p1, p0, LYe/i$c;->a:Landroidx/compose/ui/e;

    iput-object p2, p0, LYe/i$c;->b:LYe/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lxe/f$b;)LYg/J;
    .locals 0

    invoke-static {p0}, LYe/i$c;->c(Lxe/f$b;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Lxe/f$b;)LYg/J;
    .locals 0

    invoke-interface {p0}, Lxe/f$b;->a()V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method


# virtual methods
.method public final b(LT/l;I)V
    .locals 25

    move-object/from16 v0, p0

    move-object/from16 v15, p1

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

    goto/16 :goto_4

    :cond_1
    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, -0x1

    const-string v3, "com.ui.wifiman.ui.signal.floorplan.scan.FloorplanMapperAvailableUi.<anonymous> (FloorplanMapperAvailableUi.kt:54)"

    const v4, 0x3f366056

    invoke-static {v4, v1, v2, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    iget-object v1, v0, LYe/i$c;->a:Landroidx/compose/ui/e;

    const/4 v3, 0x0

    const/4 v2, 0x1

    const/4 v14, 0x0

    invoke-static {v1, v3, v2, v14}, Landroidx/compose/foundation/layout/r;->f(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    iget-object v4, v0, LYe/i$c;->a:Landroidx/compose/ui/e;

    iget-object v13, v0, LYe/i$c;->b:LYe/f;

    sget-object v5, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v5}, Lf0/c$a;->o()Lf0/c;

    move-result-object v6

    const/4 v12, 0x0

    invoke-static {v6, v12}, Landroidx/compose/foundation/layout/d;->h(Lf0/c;Z)LC0/C;

    move-result-object v6

    invoke-static {v15, v12}, LT/j;->a(LT/l;I)I

    move-result v7

    invoke-interface/range {p1 .. p1}, LT/l;->G()LT/x;

    move-result-object v8

    invoke-static {v15, v1}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v1

    sget-object v9, LE0/g;->K:LE0/g$a;

    invoke-virtual {v9}, LE0/g$a;->a()Lmh/a;

    move-result-object v10

    invoke-interface/range {p1 .. p1}, LT/l;->x()LT/f;

    move-result-object v11

    if-nez v11, :cond_3

    invoke-static {}, LT/j;->c()V

    :cond_3
    invoke-interface/range {p1 .. p1}, LT/l;->u()V

    invoke-interface/range {p1 .. p1}, LT/l;->o()Z

    move-result v11

    if-eqz v11, :cond_4

    invoke-interface {v15, v10}, LT/l;->D(Lmh/a;)V

    goto :goto_1

    :cond_4
    invoke-interface/range {p1 .. p1}, LT/l;->I()V

    :goto_1
    invoke-static/range {p1 .. p1}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v10

    invoke-virtual {v9}, LE0/g$a;->e()Lmh/p;

    move-result-object v11

    invoke-static {v10, v6, v11}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v9}, LE0/g$a;->g()Lmh/p;

    move-result-object v6

    invoke-static {v10, v8, v6}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v9}, LE0/g$a;->b()Lmh/p;

    move-result-object v6

    invoke-interface {v10}, LT/l;->o()Z

    move-result v8

    if-nez v8, :cond_5

    invoke-interface {v10}, LT/l;->f()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v8, v11}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_6

    :cond_5
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-interface {v10, v8}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v10, v7, v6}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_6
    invoke-virtual {v9}, LE0/g$a;->f()Lmh/p;

    move-result-object v6

    invoke-static {v10, v1, v6}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v1, Landroidx/compose/foundation/layout/f;->a:Landroidx/compose/foundation/layout/f;

    invoke-static {v4, v3, v2, v14}, Landroidx/compose/foundation/layout/r;->f(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    sget-object v4, Lz/c;->a:Lz/c;

    invoke-virtual {v4}, Lz/c;->g()Lz/c$m;

    move-result-object v6

    invoke-virtual {v5}, Lf0/c$a;->k()Lf0/c$b;

    move-result-object v7

    invoke-static {v6, v7, v15, v12}, Lz/h;->a(Lz/c$m;Lf0/c$b;LT/l;I)LC0/C;

    move-result-object v6

    invoke-static {v15, v12}, LT/j;->a(LT/l;I)I

    move-result v7

    invoke-interface/range {p1 .. p1}, LT/l;->G()LT/x;

    move-result-object v8

    invoke-static {v15, v1}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v1

    invoke-virtual {v9}, LE0/g$a;->a()Lmh/a;

    move-result-object v10

    invoke-interface/range {p1 .. p1}, LT/l;->x()LT/f;

    move-result-object v11

    if-nez v11, :cond_7

    invoke-static {}, LT/j;->c()V

    :cond_7
    invoke-interface/range {p1 .. p1}, LT/l;->u()V

    invoke-interface/range {p1 .. p1}, LT/l;->o()Z

    move-result v11

    if-eqz v11, :cond_8

    invoke-interface {v15, v10}, LT/l;->D(Lmh/a;)V

    goto :goto_2

    :cond_8
    invoke-interface/range {p1 .. p1}, LT/l;->I()V

    :goto_2
    invoke-static/range {p1 .. p1}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v10

    invoke-virtual {v9}, LE0/g$a;->e()Lmh/p;

    move-result-object v11

    invoke-static {v10, v6, v11}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v9}, LE0/g$a;->g()Lmh/p;

    move-result-object v6

    invoke-static {v10, v8, v6}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v9}, LE0/g$a;->b()Lmh/p;

    move-result-object v6

    invoke-interface {v10}, LT/l;->o()Z

    move-result v8

    if-nez v8, :cond_9

    invoke-interface {v10}, LT/l;->f()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v8, v11}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_a

    :cond_9
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-interface {v10, v8}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v10, v7, v6}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_a
    invoke-virtual {v9}, LE0/g$a;->f()Lmh/p;

    move-result-object v6

    invoke-static {v10, v1, v6}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v1, Lz/k;->a:Lz/k;

    sget-object v10, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    invoke-static {v10, v3, v2, v14}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v6

    const/high16 v7, 0x3f800000    # 1.0f

    invoke-interface {v1, v6, v7, v2}, Lz/j;->a(Landroidx/compose/ui/e;FZ)Landroidx/compose/ui/e;

    move-result-object v6

    invoke-static {v6, v13, v15, v12, v12}, LYe/i;->g(Landroidx/compose/ui/e;LYe/f;LT/l;II)V

    invoke-static {v10, v3, v2, v14}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v6

    sget-object v7, Lla/a;->a:Lla/a;

    sget v8, Lla/a;->b:I

    invoke-virtual {v7, v15, v8}, Lla/a;->d(LT/l;I)Lra/a;

    move-result-object v11

    invoke-virtual {v11}, Lra/a;->a()Lra/b;

    move-result-object v11

    invoke-virtual {v11}, Lra/b;->a()Lra/b$a$a;

    move-result-object v11

    invoke-virtual {v11}, Lra/b$a$a;->c()F

    move-result v11

    invoke-virtual {v7, v15, v8}, Lla/a;->d(LT/l;I)Lra/a;

    move-result-object v7

    invoke-virtual {v7}, Lra/a;->a()Lra/b;

    move-result-object v7

    invoke-virtual {v7}, Lra/b;->b()Lra/b$a$b;

    move-result-object v7

    invoke-virtual {v7}, Lra/b$a$b;->c()F

    move-result v7

    invoke-static {v6, v11, v7}, Landroidx/compose/foundation/layout/o;->j(Landroidx/compose/ui/e;FF)Landroidx/compose/ui/e;

    move-result-object v6

    invoke-virtual {v13}, LYe/f;->u0()LLi/N;

    move-result-object v7

    invoke-static {v7, v14, v15, v12, v2}, LT/o1;->b(LLi/N;Ldh/i;LT/l;II)LT/z1;

    move-result-object v7

    invoke-interface {v7}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, LTe/B0;

    invoke-static {v6, v7, v15, v12}, LTe/D0;->b(Landroidx/compose/ui/e;LTe/B0;LT/l;I)V

    invoke-interface/range {p1 .. p1}, LT/l;->R()V

    invoke-static {v10, v3, v2, v14}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v6

    invoke-virtual {v4}, Lz/c;->g()Lz/c$m;

    move-result-object v4

    invoke-virtual {v5}, Lf0/c$a;->k()Lf0/c$b;

    move-result-object v5

    invoke-static {v4, v5, v15, v12}, Lz/h;->a(Lz/c$m;Lf0/c$b;LT/l;I)LC0/C;

    move-result-object v4

    invoke-static {v15, v12}, LT/j;->a(LT/l;I)I

    move-result v5

    invoke-interface/range {p1 .. p1}, LT/l;->G()LT/x;

    move-result-object v7

    invoke-static {v15, v6}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v6

    invoke-virtual {v9}, LE0/g$a;->a()Lmh/a;

    move-result-object v8

    invoke-interface/range {p1 .. p1}, LT/l;->x()LT/f;

    move-result-object v11

    if-nez v11, :cond_b

    invoke-static {}, LT/j;->c()V

    :cond_b
    invoke-interface/range {p1 .. p1}, LT/l;->u()V

    invoke-interface/range {p1 .. p1}, LT/l;->o()Z

    move-result v11

    if-eqz v11, :cond_c

    invoke-interface {v15, v8}, LT/l;->D(Lmh/a;)V

    goto :goto_3

    :cond_c
    invoke-interface/range {p1 .. p1}, LT/l;->I()V

    :goto_3
    invoke-static/range {p1 .. p1}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v8

    invoke-virtual {v9}, LE0/g$a;->e()Lmh/p;

    move-result-object v11

    invoke-static {v8, v4, v11}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v9}, LE0/g$a;->g()Lmh/p;

    move-result-object v4

    invoke-static {v8, v7, v4}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v9}, LE0/g$a;->b()Lmh/p;

    move-result-object v4

    invoke-interface {v8}, LT/l;->o()Z

    move-result v7

    if-nez v7, :cond_d

    invoke-interface {v8}, LT/l;->f()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v7, v11}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_e

    :cond_d
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v8, v7}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v8, v5, v4}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_e
    invoke-virtual {v9}, LE0/g$a;->f()Lmh/p;

    move-result-object v4

    invoke-static {v8, v6, v4}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-static {}, Lxe/B;->K()LT/H0;

    move-result-object v4

    invoke-interface {v15, v4}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lxe/f$b;

    invoke-static {v10, v3, v2, v14}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v5

    invoke-static {v5}, Lz/j0;->c(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v19

    sget-object v20, LL9/d$a;->b:LL9/d$a;

    sget v5, Lm8/c;->e1:I

    invoke-static {v5, v15, v12}, LH0/f;->a(ILT/l;I)Ljava/lang/String;

    move-result-object v21

    const v5, -0x7f2a7d06

    invoke-interface {v15, v5}, LT/l;->U(I)V

    invoke-interface {v15, v4}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v5

    invoke-interface/range {p1 .. p1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v6

    if-nez v5, :cond_f

    sget-object v5, LT/l;->a:LT/l$a;

    invoke-virtual {v5}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v5

    if-ne v6, v5, :cond_10

    :cond_f
    new-instance v6, LYe/j;

    invoke-direct {v6, v4}, LYe/j;-><init>(Lxe/f$b;)V

    invoke-interface {v15, v6}, LT/l;->K(Ljava/lang/Object;)V

    :cond_10
    move-object v4, v6

    check-cast v4, Lmh/a;

    invoke-interface/range {p1 .. p1}, LT/l;->J()V

    new-instance v5, LYe/i$c$a;

    invoke-direct {v5, v13}, LYe/i$c$a;-><init>(LYe/f;)V

    const v6, 0x279f96f9

    const/16 v11, 0x36

    invoke-static {v6, v2, v5, v15, v11}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v5

    sget v6, LL9/d$a;->c:I

    shl-int/lit8 v6, v6, 0x6

    or-int/lit16 v6, v6, 0x6000

    move/from16 v16, v6

    const/16 v17, 0x0

    const/16 v18, 0x7e0

    const-wide/16 v6, 0x0

    const-wide/16 v8, 0x0

    const-wide/16 v22, 0x0

    move-object/from16 v24, v10

    move-wide/from16 v10, v22

    const/16 v22, 0x0

    move/from16 v12, v22

    const/16 v22, 0x0

    move-object/from16 v23, v13

    move-object/from16 v13, v22

    const/16 v22, 0x0

    move/from16 v14, v22

    move-object/from16 v22, v1

    move-object/from16 v1, v19

    move-object/from16 v2, v21

    move-object/from16 v3, v20

    move-object v0, v15

    move-object/from16 v15, p1

    invoke-static/range {v1 .. v18}, LL9/E;->i(Landroidx/compose/ui/e;Ljava/lang/String;LL9/d;Lmh/a;Lmh/q;JJJFLz/N;FLT/l;III)V

    invoke-virtual/range {v23 .. v23}, LYe/f;->t0()LLi/N;

    move-result-object v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static {v1, v3, v0, v4, v2}, LT/o1;->b(LLi/N;Ldh/i;LT/l;II)LT/z1;

    move-result-object v1

    invoke-interface {v1}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ls9/d;

    move-object/from16 v6, v24

    const/4 v5, 0x0

    invoke-static {v6, v5, v2, v3}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v3

    if-eqz v1, :cond_11

    move v4, v2

    :cond_11
    new-instance v5, LYe/i$c$b;

    invoke-direct {v5, v1}, LYe/i$c$b;-><init>(Ls9/d;)V

    const v1, -0x321dfb1f    # -4.7399632E8f

    const/16 v6, 0x36

    invoke-static {v1, v2, v5, v0, v6}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v7

    const v9, 0x180186

    const/16 v10, 0x1c

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    move-object/from16 v1, v22

    move v2, v4

    move-object v4, v5

    move-object v5, v6

    move-object v6, v8

    move-object/from16 v8, p1

    invoke-static/range {v1 .. v10}, Lq/d;->d(Lz/j;ZLandroidx/compose/ui/e;Landroidx/compose/animation/i;Landroidx/compose/animation/k;Ljava/lang/String;Lmh/q;LT/l;II)V

    invoke-interface/range {p1 .. p1}, LT/l;->R()V

    invoke-interface/range {p1 .. p1}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_12

    invoke-static {}, LT/o;->P()V

    :cond_12
    :goto_4
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LYe/i$c;->b(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
