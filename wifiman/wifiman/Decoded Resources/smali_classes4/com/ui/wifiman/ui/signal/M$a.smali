.class final Lcom/ui/wifiman/ui/signal/M$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/r;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/ui/signal/M;->c(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/signal/N;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/ui/signal/N;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/ui/signal/N;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/ui/signal/M$a;->a:Lcom/ui/wifiman/ui/signal/N;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lcom/ui/wifiman/ui/signal/N;LTe/K0;)LYg/J;
    .locals 0

    invoke-static {p0, p1}, Lcom/ui/wifiman/ui/signal/M$a;->h(Lcom/ui/wifiman/ui/signal/N;LTe/K0;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/ui/wifiman/ui/signal/N;LJ9/a;)LYg/J;
    .locals 0

    invoke-static {p0, p1}, Lcom/ui/wifiman/ui/signal/M$a;->f(Lcom/ui/wifiman/ui/signal/N;LJ9/a;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lcom/ui/wifiman/ui/signal/N;LTe/K0;)LYg/J;
    .locals 0

    invoke-static {p0, p1}, Lcom/ui/wifiman/ui/signal/M$a;->i(Lcom/ui/wifiman/ui/signal/N;LTe/K0;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method private static final f(Lcom/ui/wifiman/ui/signal/N;LJ9/a;)LYg/J;
    .locals 4

    const-string v0, "tab"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lgc/b;->getEntries()Lfh/a;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lgc/b;

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    invoke-virtual {p1}, LJ9/a;->c()I

    move-result v3

    if-ne v2, v3, :cond_0

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    check-cast v1, Lgc/b;

    if-eqz v1, :cond_2

    invoke-virtual {p0, v1}, Lcom/ui/wifiman/ui/signal/N;->r0(Lgc/b;)V

    :cond_2
    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final h(Lcom/ui/wifiman/ui/signal/N;LTe/K0;)LYg/J;
    .locals 0

    check-cast p1, LTe/K0$h;

    invoke-virtual {p1}, LTe/K0$h;->a()LTe/b0;

    move-result-object p1

    invoke-virtual {p1}, LTe/b0;->c()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/ui/signal/N;->t0(Ljava/lang/String;)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final i(Lcom/ui/wifiman/ui/signal/N;LTe/K0;)LYg/J;
    .locals 0

    check-cast p1, LTe/K0$f;

    invoke-virtual {p1}, LTe/K0$f;->getId()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/ui/signal/N;->s0(Ljava/lang/String;)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method


# virtual methods
.method public final e(Landroidx/compose/ui/e;LTe/K0;LT/l;I)V
    .locals 22

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v8, p2

    move-object/from16 v10, p3

    const-string v2, "itemModifier"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "item"

    invoke-static {v8, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x6

    and-int/lit8 v3, p4, 0x6

    const/4 v4, 0x4

    const/4 v5, 0x2

    if-nez v3, :cond_1

    invoke-interface {v10, v1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    move v3, v4

    goto :goto_0

    :cond_0
    move v3, v5

    :goto_0
    or-int v3, p4, v3

    goto :goto_1

    :cond_1
    move/from16 v3, p4

    :goto_1
    and-int/lit8 v6, p4, 0x30

    const/16 v7, 0x20

    const/16 v9, 0x10

    if-nez v6, :cond_4

    and-int/lit8 v6, p4, 0x40

    if-nez v6, :cond_2

    invoke-interface {v10, v8}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v6

    goto :goto_2

    :cond_2
    invoke-interface {v10, v8}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v6

    :goto_2
    if-eqz v6, :cond_3

    move v6, v7

    goto :goto_3

    :cond_3
    move v6, v9

    :goto_3
    or-int/2addr v3, v6

    :cond_4
    and-int/lit16 v6, v3, 0x93

    const/16 v11, 0x92

    if-ne v6, v11, :cond_6

    invoke-interface/range {p3 .. p3}, LT/l;->v()Z

    move-result v6

    if-nez v6, :cond_5

    goto :goto_4

    :cond_5
    invoke-interface/range {p3 .. p3}, LT/l;->C()V

    goto/16 :goto_9

    :cond_6
    :goto_4
    invoke-static {}, LT/o;->H()Z

    move-result v6

    if-eqz v6, :cond_7

    const/4 v6, -0x1

    const-string v11, "com.ui.wifiman.ui.signal.SignalMapperTabSignalUi.<anonymous> (SignalTabSignalStrengthUi.kt:81)"

    const v12, -0x19b2ab3b

    invoke-static {v12, v3, v6, v11}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_7
    instance-of v6, v8, LTe/K0$j;

    if-eqz v6, :cond_a

    const v2, -0x5c04c5ad

    invoke-interface {v10, v2}, LT/l;->U(I)V

    sget-object v2, Lla/a;->a:Lla/a;

    sget v3, Lla/a;->b:I

    invoke-virtual {v2, v10, v3}, Lla/a;->d(LT/l;I)Lra/a;

    move-result-object v4

    invoke-virtual {v4}, Lra/a;->a()Lra/b;

    move-result-object v4

    invoke-virtual {v4}, Lra/b;->a()Lra/b$a$a;

    move-result-object v4

    invoke-virtual {v4}, Lra/b$a$a;->c()F

    move-result v4

    invoke-virtual {v2, v10, v3}, Lla/a;->d(LT/l;I)Lra/a;

    move-result-object v2

    invoke-virtual {v2}, Lra/a;->a()Lra/b;

    move-result-object v2

    invoke-virtual {v2}, Lra/b;->b()Lra/b$a$b;

    move-result-object v2

    invoke-virtual {v2}, Lra/b$a$b;->d()F

    move-result v2

    invoke-static {v1, v4, v2}, Landroidx/compose/foundation/layout/o;->j(Landroidx/compose/ui/e;FF)Landroidx/compose/ui/e;

    move-result-object v1

    move-object v2, v8

    check-cast v2, LTe/K0$j;

    invoke-virtual {v2}, LTe/K0$j;->a()LTe/x0;

    move-result-object v2

    iget-object v3, v0, Lcom/ui/wifiman/ui/signal/M$a;->a:Lcom/ui/wifiman/ui/signal/N;

    const v4, -0x5c049e03

    invoke-interface {v10, v4}, LT/l;->U(I)V

    invoke-interface {v10, v3}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v4

    invoke-interface/range {p3 .. p3}, LT/l;->f()Ljava/lang/Object;

    move-result-object v5

    if-nez v4, :cond_8

    sget-object v4, LT/l;->a:LT/l$a;

    invoke-virtual {v4}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v4

    if-ne v5, v4, :cond_9

    :cond_8
    new-instance v5, Lcom/ui/wifiman/ui/signal/M$a$a;

    invoke-direct {v5, v3}, Lcom/ui/wifiman/ui/signal/M$a$a;-><init>(Ljava/lang/Object;)V

    invoke-interface {v10, v5}, LT/l;->K(Ljava/lang/Object;)V

    :cond_9
    check-cast v5, Lth/g;

    invoke-interface/range {p3 .. p3}, LT/l;->J()V

    move-object v3, v5

    check-cast v3, Lmh/l;

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object/from16 v4, p3

    invoke-static/range {v1 .. v6}, LTe/A0;->c(Landroidx/compose/ui/e;LTe/x0;Lmh/l;LT/l;II)V

    invoke-interface/range {p3 .. p3}, LT/l;->J()V

    goto/16 :goto_8

    :cond_a
    instance-of v6, v8, LTe/K0$a;

    const/4 v11, 0x0

    const/16 v12, 0x8

    const/4 v13, 0x0

    const/4 v14, 0x0

    if-eqz v6, :cond_d

    const v2, -0x5c04909f

    invoke-interface {v10, v2}, LT/l;->U(I)V

    sget-object v2, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v2}, Lf0/c$a;->k()Lf0/c$b;

    move-result-object v2

    invoke-static {v1, v2, v14, v5, v13}, Landroidx/compose/foundation/layout/r;->H(Landroidx/compose/ui/e;Lf0/c$b;ZILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    int-to-float v2, v9

    invoke-static {v2}, LY0/h;->j(F)F

    move-result v2

    invoke-static {v1, v2, v11, v5, v13}, Landroidx/compose/foundation/layout/o;->k(Landroidx/compose/ui/e;FFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v14

    int-to-float v1, v12

    invoke-static {v1}, LY0/h;->j(F)F

    move-result v16

    const/16 v19, 0xd

    const/16 v20, 0x0

    const/4 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    invoke-static/range {v14 .. v20}, Landroidx/compose/foundation/layout/o;->m(Landroidx/compose/ui/e;FFFFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    move-object v2, v8

    check-cast v2, LTe/K0$a;

    invoke-virtual {v2}, LTe/K0$a;->a()Ls9/d;

    move-result-object v2

    iget-object v3, v0, Lcom/ui/wifiman/ui/signal/M$a;->a:Lcom/ui/wifiman/ui/signal/N;

    const v4, -0x5c046f22

    invoke-interface {v10, v4}, LT/l;->U(I)V

    invoke-interface {v10, v3}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v4

    invoke-interface/range {p3 .. p3}, LT/l;->f()Ljava/lang/Object;

    move-result-object v5

    if-nez v4, :cond_b

    sget-object v4, LT/l;->a:LT/l$a;

    invoke-virtual {v4}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v4

    if-ne v5, v4, :cond_c

    :cond_b
    new-instance v5, Lcom/ui/wifiman/ui/signal/M$a$b;

    invoke-direct {v5, v3}, Lcom/ui/wifiman/ui/signal/M$a$b;-><init>(Ljava/lang/Object;)V

    invoke-interface {v10, v5}, LT/l;->K(Ljava/lang/Object;)V

    :cond_c
    check-cast v5, Lth/g;

    invoke-interface/range {p3 .. p3}, LT/l;->J()V

    move-object v3, v5

    check-cast v3, Lmh/a;

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object/from16 v4, p3

    invoke-static/range {v1 .. v6}, LTe/j0;->c(Landroidx/compose/ui/e;Ls9/d;Lmh/a;LT/l;II)V

    invoke-interface/range {p3 .. p3}, LT/l;->J()V

    goto/16 :goto_8

    :cond_d
    instance-of v5, v8, LTe/K0$e;

    if-eqz v5, :cond_e

    const v2, -0x5c0461fb

    invoke-interface {v10, v2}, LT/l;->U(I)V

    int-to-float v2, v9

    invoke-static {v2}, LY0/h;->j(F)F

    move-result v3

    invoke-static {v2}, LY0/h;->j(F)F

    move-result v2

    int-to-float v4, v12

    invoke-static {v4}, LY0/h;->j(F)F

    move-result v5

    invoke-static {v4}, LY0/h;->j(F)F

    move-result v4

    invoke-static {v1, v3, v5, v2, v4}, Landroidx/compose/foundation/layout/o;->l(Landroidx/compose/ui/e;FFFF)Landroidx/compose/ui/e;

    move-result-object v1

    move-object v2, v8

    check-cast v2, LTe/K0$e;

    invoke-virtual {v2}, LTe/K0$e;->a()LTe/l0;

    move-result-object v2

    invoke-static {v1, v2, v10, v14}, LTe/w0;->o(Landroidx/compose/ui/e;LTe/l0;LT/l;I)V

    invoke-interface/range {p3 .. p3}, LT/l;->J()V

    goto/16 :goto_8

    :cond_e
    instance-of v5, v8, LTe/K0$b;

    const/4 v6, 0x1

    if-eqz v5, :cond_15

    const v3, -0x5c043087

    invoke-interface {v10, v3}, LT/l;->U(I)V

    int-to-float v3, v9

    invoke-static {v3}, LY0/h;->j(F)F

    move-result v3

    int-to-float v4, v12

    invoke-static {v4}, LY0/h;->j(F)F

    move-result v4

    invoke-static {v1, v3, v4}, Landroidx/compose/foundation/layout/o;->j(Landroidx/compose/ui/e;FF)Landroidx/compose/ui/e;

    move-result-object v1

    iget-object v3, v0, Lcom/ui/wifiman/ui/signal/M$a;->a:Lcom/ui/wifiman/ui/signal/N;

    sget-object v4, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v4}, Lf0/c$a;->o()Lf0/c;

    move-result-object v4

    invoke-static {v4, v14}, Landroidx/compose/foundation/layout/d;->h(Lf0/c;Z)LC0/C;

    move-result-object v4

    invoke-static {v10, v14}, LT/j;->a(LT/l;I)I

    move-result v5

    invoke-interface/range {p3 .. p3}, LT/l;->G()LT/x;

    move-result-object v7

    invoke-static {v10, v1}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v1

    sget-object v9, LE0/g;->K:LE0/g$a;

    invoke-virtual {v9}, LE0/g$a;->a()Lmh/a;

    move-result-object v12

    invoke-interface/range {p3 .. p3}, LT/l;->x()LT/f;

    move-result-object v15

    if-nez v15, :cond_f

    invoke-static {}, LT/j;->c()V

    :cond_f
    invoke-interface/range {p3 .. p3}, LT/l;->u()V

    invoke-interface/range {p3 .. p3}, LT/l;->o()Z

    move-result v15

    if-eqz v15, :cond_10

    invoke-interface {v10, v12}, LT/l;->D(Lmh/a;)V

    goto :goto_5

    :cond_10
    invoke-interface/range {p3 .. p3}, LT/l;->I()V

    :goto_5
    invoke-static/range {p3 .. p3}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v12

    invoke-virtual {v9}, LE0/g$a;->e()Lmh/p;

    move-result-object v15

    invoke-static {v12, v4, v15}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v9}, LE0/g$a;->g()Lmh/p;

    move-result-object v4

    invoke-static {v12, v7, v4}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v9}, LE0/g$a;->b()Lmh/p;

    move-result-object v4

    invoke-interface {v12}, LT/l;->o()Z

    move-result v7

    if-nez v7, :cond_11

    invoke-interface {v12}, LT/l;->f()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-static {v7, v15}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_12

    :cond_11
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v12, v7}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v12, v5, v4}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_12
    invoke-virtual {v9}, LE0/g$a;->f()Lmh/p;

    move-result-object v4

    invoke-static {v12, v1, v4}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v1, Landroidx/compose/foundation/layout/f;->a:Landroidx/compose/foundation/layout/f;

    invoke-virtual {v3}, Lcom/ui/wifiman/ui/signal/N;->n0()LLi/N;

    move-result-object v1

    invoke-static {v1, v13, v10, v14, v6}, LT/o1;->b(LLi/N;Ldh/i;LT/l;II)LT/z1;

    move-result-object v1

    invoke-interface {v1}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LTe/J;

    sget-object v3, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    invoke-static {v3, v11, v6, v13}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v3

    if-nez v1, :cond_13

    new-instance v1, LTe/J;

    sget-object v16, Lgc/b;->SIGNAL:Lgc/b;

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v17

    sget-object v18, LTe/M$b$b;->a:LTe/M$b$b;

    new-instance v4, LTe/L;

    const/high16 v5, 0x3f800000    # 1.0f

    invoke-direct {v4, v11, v5}, LTe/L;-><init>(FF)V

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v20

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v21

    move-object v15, v1

    move-object/from16 v19, v4

    invoke-direct/range {v15 .. v21}, LTe/J;-><init>(Lgc/b;Ljava/util/List;LTe/M;LTe/L;Ljava/util/List;Ljava/util/List;)V

    :cond_13
    invoke-static {v3, v1, v10, v2}, LTe/Q;->c(Landroidx/compose/ui/e;LTe/J;LT/l;I)V

    move-object v1, v8

    check-cast v1, LTe/K0$b;

    invoke-virtual {v1}, LTe/K0$b;->a()LTe/S;

    move-result-object v1

    if-eqz v1, :cond_14

    move v1, v6

    goto :goto_6

    :cond_14
    move v1, v14

    :goto_6
    const/4 v2, 0x3

    invoke-static {v13, v11, v2, v13}, Landroidx/compose/animation/g;->o(Lr/H;FILjava/lang/Object;)Landroidx/compose/animation/i;

    move-result-object v3

    invoke-static {v13, v11, v2, v13}, Landroidx/compose/animation/g;->q(Lr/H;FILjava/lang/Object;)Landroidx/compose/animation/k;

    move-result-object v4

    new-instance v2, Lcom/ui/wifiman/ui/signal/M$a$c;

    invoke-direct {v2, v8}, Lcom/ui/wifiman/ui/signal/M$a$c;-><init>(LTe/K0;)V

    const/16 v5, 0x36

    const v7, -0x5568aa58

    invoke-static {v7, v6, v2, v10, v5}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v6

    const v8, 0x30d80

    const/16 v9, 0x12

    const/4 v2, 0x0

    const/4 v5, 0x0

    move-object/from16 v7, p3

    invoke-static/range {v1 .. v9}, Lq/d;->f(ZLandroidx/compose/ui/e;Landroidx/compose/animation/i;Landroidx/compose/animation/k;Ljava/lang/String;Lmh/q;LT/l;II)V

    invoke-interface/range {p3 .. p3}, LT/l;->R()V

    invoke-interface/range {p3 .. p3}, LT/l;->J()V

    goto/16 :goto_8

    :cond_15
    instance-of v2, v8, LTe/K0$d;

    if-eqz v2, :cond_16

    const v2, -0x5c0391c0

    invoke-interface {v10, v2}, LT/l;->U(I)V

    int-to-float v2, v9

    invoke-static {v2}, LY0/h;->j(F)F

    move-result v2

    int-to-float v3, v12

    invoke-static {v3}, LY0/h;->j(F)F

    move-result v3

    invoke-static {v1, v2, v3}, Landroidx/compose/foundation/layout/o;->j(Landroidx/compose/ui/e;FF)Landroidx/compose/ui/e;

    move-result-object v1

    invoke-static {v1, v10, v14}, LTe/M0;->b(Landroidx/compose/ui/e;LT/l;I)V

    invoke-interface/range {p3 .. p3}, LT/l;->J()V

    goto/16 :goto_8

    :cond_16
    instance-of v2, v8, LTe/K0$k;

    if-eqz v2, :cond_19

    const v2, -0x246a51fe

    invoke-interface {v10, v2}, LT/l;->U(I)V

    int-to-float v2, v9

    invoke-static {v2}, LY0/h;->j(F)F

    move-result v2

    int-to-float v3, v4

    invoke-static {v3}, LY0/h;->j(F)F

    move-result v3

    invoke-static {v1, v2, v3}, Landroidx/compose/foundation/layout/o;->j(Landroidx/compose/ui/e;FF)Landroidx/compose/ui/e;

    move-result-object v1

    sget-object v4, LJ9/i;->DARK_BACKGROUND:LJ9/i;

    move-object v2, v8

    check-cast v2, LTe/K0$k;

    invoke-static {v2}, Lcom/ui/wifiman/ui/signal/M;->f(LTe/K0$k;)LJ9/j;

    move-result-object v2

    const v3, -0x5c0347ca    # -2.7399911E-17f

    invoke-interface {v10, v3}, LT/l;->U(I)V

    iget-object v3, v0, Lcom/ui/wifiman/ui/signal/M$a;->a:Lcom/ui/wifiman/ui/signal/N;

    invoke-interface {v10, v3}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v3

    iget-object v5, v0, Lcom/ui/wifiman/ui/signal/M$a;->a:Lcom/ui/wifiman/ui/signal/N;

    invoke-interface/range {p3 .. p3}, LT/l;->f()Ljava/lang/Object;

    move-result-object v6

    if-nez v3, :cond_17

    sget-object v3, LT/l;->a:LT/l$a;

    invoke-virtual {v3}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v3

    if-ne v6, v3, :cond_18

    :cond_17
    new-instance v6, Lcom/ui/wifiman/ui/signal/J;

    invoke-direct {v6, v5}, Lcom/ui/wifiman/ui/signal/J;-><init>(Lcom/ui/wifiman/ui/signal/N;)V

    invoke-interface {v10, v6}, LT/l;->K(Ljava/lang/Object;)V

    :cond_18
    move-object v5, v6

    check-cast v5, Lmh/l;

    invoke-interface/range {p3 .. p3}, LT/l;->J()V

    const/16 v7, 0xc00

    const/4 v8, 0x4

    const/4 v3, 0x0

    move-object/from16 v6, p3

    invoke-static/range {v1 .. v8}, LJ9/h;->g(Landroidx/compose/ui/e;LJ9/j;ZLJ9/i;Lmh/l;LT/l;II)V

    invoke-interface/range {p3 .. p3}, LT/l;->J()V

    goto/16 :goto_8

    :cond_19
    instance-of v2, v8, LTe/K0$c;

    if-eqz v2, :cond_1a

    const v2, -0x5c032d06

    invoke-interface {v10, v2}, LT/l;->U(I)V

    int-to-float v2, v9

    invoke-static {v2}, LY0/h;->j(F)F

    move-result v2

    int-to-float v3, v12

    invoke-static {v3}, LY0/h;->j(F)F

    move-result v3

    invoke-static {v1, v2, v3}, Landroidx/compose/foundation/layout/o;->j(Landroidx/compose/ui/e;FF)Landroidx/compose/ui/e;

    move-result-object v1

    move-object v2, v8

    check-cast v2, LTe/K0$c;

    invoke-virtual {v2}, LTe/K0$c;->a()LTe/B0;

    move-result-object v2

    invoke-static {v1, v2, v10, v14}, LTe/D0;->b(Landroidx/compose/ui/e;LTe/B0;LT/l;I)V

    invoke-interface/range {p3 .. p3}, LT/l;->J()V

    goto/16 :goto_8

    :cond_1a
    instance-of v2, v8, LTe/K0$l;

    if-eqz v2, :cond_1b

    const v2, -0x5c030762

    invoke-interface {v10, v2}, LT/l;->U(I)V

    int-to-float v2, v9

    invoke-static {v2}, LY0/h;->j(F)F

    move-result v2

    int-to-float v3, v12

    invoke-static {v3}, LY0/h;->j(F)F

    move-result v3

    invoke-static {v1, v2, v3}, Landroidx/compose/foundation/layout/o;->j(Landroidx/compose/ui/e;FF)Landroidx/compose/ui/e;

    move-result-object v1

    move-object v2, v8

    check-cast v2, LTe/K0$l;

    invoke-virtual {v2}, LTe/K0$l;->a()LTe/F0;

    move-result-object v2

    invoke-static {v1, v2, v10, v14}, LTe/J0;->h(Landroidx/compose/ui/e;LTe/F0;LT/l;I)V

    invoke-interface/range {p3 .. p3}, LT/l;->J()V

    goto/16 :goto_8

    :cond_1b
    instance-of v2, v8, LTe/K0$h;

    if-eqz v2, :cond_20

    const v2, -0x5c02e227

    invoke-interface {v10, v2}, LT/l;->U(I)V

    const v2, -0x5c02d6f7

    invoke-interface {v10, v2}, LT/l;->U(I)V

    iget-object v2, v0, Lcom/ui/wifiman/ui/signal/M$a;->a:Lcom/ui/wifiman/ui/signal/N;

    invoke-interface {v10, v2}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v2

    and-int/lit8 v4, v3, 0x70

    if-eq v4, v7, :cond_1d

    and-int/lit8 v3, v3, 0x40

    if-eqz v3, :cond_1c

    invoke-interface {v10, v8}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1c

    goto :goto_7

    :cond_1c
    move v6, v14

    :cond_1d
    :goto_7
    or-int/2addr v2, v6

    iget-object v3, v0, Lcom/ui/wifiman/ui/signal/M$a;->a:Lcom/ui/wifiman/ui/signal/N;

    invoke-interface/range {p3 .. p3}, LT/l;->f()Ljava/lang/Object;

    move-result-object v4

    if-nez v2, :cond_1e

    sget-object v2, LT/l;->a:LT/l$a;

    invoke-virtual {v2}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v4, v2, :cond_1f

    :cond_1e
    new-instance v4, Lcom/ui/wifiman/ui/signal/K;

    invoke-direct {v4, v3, v8}, Lcom/ui/wifiman/ui/signal/K;-><init>(Lcom/ui/wifiman/ui/signal/N;LTe/K0;)V

    invoke-interface {v10, v4}, LT/l;->K(Ljava/lang/Object;)V

    :cond_1f
    move-object v5, v4

    check-cast v5, Lmh/a;

    invoke-interface/range {p3 .. p3}, LT/l;->J()V

    const/4 v6, 0x7

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object/from16 v1, p1

    invoke-static/range {v1 .. v7}, Landroidx/compose/foundation/d;->d(Landroidx/compose/ui/e;ZLjava/lang/String;LJ0/g;Lmh/a;ILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    move-object v2, v8

    check-cast v2, LTe/K0$h;

    invoke-virtual {v2}, LTe/K0$h;->a()LTe/b0;

    move-result-object v2

    invoke-static {v1, v2, v10, v14}, LTe/d0;->b(Landroidx/compose/ui/e;LTe/b0;LT/l;I)V

    invoke-interface/range {p3 .. p3}, LT/l;->J()V

    goto/16 :goto_8

    :cond_20
    instance-of v2, v8, LTe/K0$f;

    if-eqz v2, :cond_25

    const v2, -0x5c02c378

    invoke-interface {v10, v2}, LT/l;->U(I)V

    move-object v2, v8

    check-cast v2, LTe/K0$f;

    invoke-virtual {v2}, LTe/K0$f;->c()Ls9/d;

    move-result-object v4

    invoke-virtual {v2}, LTe/K0$f;->b()Ls9/d;

    move-result-object v5

    invoke-virtual {v2}, LTe/K0$f;->a()Ls9/d;

    move-result-object v9

    const v2, -0x5c02aab3

    invoke-interface {v10, v2}, LT/l;->U(I)V

    iget-object v2, v0, Lcom/ui/wifiman/ui/signal/M$a;->a:Lcom/ui/wifiman/ui/signal/N;

    invoke-interface {v10, v2}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v2

    and-int/lit8 v11, v3, 0x70

    if-eq v11, v7, :cond_21

    and-int/lit8 v7, v3, 0x40

    if-eqz v7, :cond_22

    invoke-interface {v10, v8}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_22

    :cond_21
    move v14, v6

    :cond_22
    or-int/2addr v2, v14

    iget-object v6, v0, Lcom/ui/wifiman/ui/signal/M$a;->a:Lcom/ui/wifiman/ui/signal/N;

    invoke-interface/range {p3 .. p3}, LT/l;->f()Ljava/lang/Object;

    move-result-object v7

    if-nez v2, :cond_23

    sget-object v2, LT/l;->a:LT/l$a;

    invoke-virtual {v2}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v7, v2, :cond_24

    :cond_23
    new-instance v7, Lcom/ui/wifiman/ui/signal/L;

    invoke-direct {v7, v6, v8}, Lcom/ui/wifiman/ui/signal/L;-><init>(Lcom/ui/wifiman/ui/signal/N;LTe/K0;)V

    invoke-interface {v10, v7}, LT/l;->K(Ljava/lang/Object;)V

    :cond_24
    move-object v6, v7

    check-cast v6, Lmh/a;

    invoke-interface/range {p3 .. p3}, LT/l;->J()V

    and-int/lit8 v7, v3, 0xe

    const/4 v8, 0x0

    move-object/from16 v1, p1

    move-object v2, v4

    move-object v3, v5

    move-object v4, v9

    move-object v5, v6

    move-object/from16 v6, p3

    invoke-static/range {v1 .. v8}, LTe/a0;->c(Landroidx/compose/ui/e;Ls9/d;Ls9/d;Ls9/d;Lmh/a;LT/l;II)V

    invoke-interface/range {p3 .. p3}, LT/l;->J()V

    goto :goto_8

    :cond_25
    instance-of v2, v8, LTe/K0$g;

    if-eqz v2, :cond_26

    const v2, -0x5c029d4a

    invoke-interface {v10, v2}, LT/l;->U(I)V

    move-object v2, v8

    check-cast v2, LTe/K0$g;

    invoke-virtual {v2}, LTe/K0$g;->a()Ls9/d;

    move-result-object v2

    and-int/lit8 v3, v3, 0xe

    invoke-static {v1, v2, v10, v3}, LEe/F;->b(Landroidx/compose/ui/e;Ls9/d;LT/l;I)V

    invoke-interface/range {p3 .. p3}, LT/l;->J()V

    goto :goto_8

    :cond_26
    instance-of v2, v8, LTe/K0$i;

    if-eqz v2, :cond_28

    const v2, -0x5c02888a

    invoke-interface {v10, v2}, LT/l;->U(I)V

    move-object v2, v8

    check-cast v2, LTe/K0$i;

    invoke-virtual {v2}, LTe/K0$i;->a()LTe/a;

    move-result-object v2

    and-int/lit8 v3, v3, 0xe

    invoke-static {v1, v2, v10, v3}, LTe/e;->d(Landroidx/compose/ui/e;LTe/a;LT/l;I)V

    invoke-interface/range {p3 .. p3}, LT/l;->J()V

    :goto_8
    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_27

    invoke-static {}, LT/o;->P()V

    :cond_27
    :goto_9
    return-void

    :cond_28
    const v1, -0x5c04be9d

    invoke-interface {v10, v1}, LT/l;->U(I)V

    invoke-interface/range {p3 .. p3}, LT/l;->J()V

    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1
.end method

.method public bridge synthetic y(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/ui/e;

    check-cast p2, LTe/K0;

    check-cast p3, LT/l;

    check-cast p4, Ljava/lang/Number;

    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    move-result p4

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/ui/wifiman/ui/signal/M$a;->e(Landroidx/compose/ui/e;LTe/K0;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
