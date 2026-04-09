.class final Lef/j$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lef/j;->o(Landroidx/compose/ui/e;Lef/c;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lef/c;


# direct methods
.method constructor <init>(Lef/c;)V
    .locals 0

    iput-object p1, p0, Lef/j$b;->a:Lef/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lz/j;LT/l;I)V
    .locals 14

    move-object/from16 v6, p2

    move/from16 v0, p3

    const-string v1, "$this$ModalScaffold"

    move-object v2, p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v1, v0, 0x11

    const/16 v2, 0x10

    if-ne v1, v2, :cond_1

    invoke-interface/range {p2 .. p2}, LT/l;->v()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface/range {p2 .. p2}, LT/l;->C()V

    move-object v10, p0

    goto/16 :goto_3

    :cond_1
    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v1, -0x1

    const-string v3, "com.ui.wifiman.ui.speed.speedfactor.SpeedFactorExplanationUi.<anonymous> (SpeedFactorExplanationUi.kt:56)"

    const v4, 0x5ec949c

    invoke-static {v4, v0, v1, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    sget-object v0, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/4 v7, 0x0

    const/4 v8, 0x1

    const/4 v9, 0x0

    invoke-static {v0, v7, v8, v9}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v0

    sget-object v1, Lz/c;->a:Lz/c;

    int-to-float v2, v2

    invoke-static {v2}, LY0/h;->j(F)F

    move-result v2

    invoke-virtual {v1, v2}, Lz/c;->n(F)Lz/c$f;

    move-result-object v1

    move-object v10, p0

    iget-object v11, v10, Lef/j$b;->a:Lef/c;

    sget-object v2, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v2}, Lf0/c$a;->k()Lf0/c$b;

    move-result-object v2

    const/4 v3, 0x6

    invoke-static {v1, v2, v6, v3}, Lz/h;->a(Lz/c$m;Lf0/c$b;LT/l;I)LC0/C;

    move-result-object v1

    const/4 v12, 0x0

    invoke-static {v6, v12}, LT/j;->a(LT/l;I)I

    move-result v2

    invoke-interface/range {p2 .. p2}, LT/l;->G()LT/x;

    move-result-object v3

    invoke-static {v6, v0}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v0

    sget-object v4, LE0/g;->K:LE0/g$a;

    invoke-virtual {v4}, LE0/g$a;->a()Lmh/a;

    move-result-object v5

    invoke-interface/range {p2 .. p2}, LT/l;->x()LT/f;

    move-result-object v13

    if-nez v13, :cond_3

    invoke-static {}, LT/j;->c()V

    :cond_3
    invoke-interface/range {p2 .. p2}, LT/l;->u()V

    invoke-interface/range {p2 .. p2}, LT/l;->o()Z

    move-result v13

    if-eqz v13, :cond_4

    invoke-interface {v6, v5}, LT/l;->D(Lmh/a;)V

    goto :goto_1

    :cond_4
    invoke-interface/range {p2 .. p2}, LT/l;->I()V

    :goto_1
    invoke-static/range {p2 .. p2}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v5

    invoke-virtual {v4}, LE0/g$a;->e()Lmh/p;

    move-result-object v13

    invoke-static {v5, v1, v13}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

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

    move-result-object v13

    invoke-static {v3, v13}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

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

    const v0, 0x69a83829

    invoke-interface {v6, v0}, LT/l;->U(I)V

    invoke-virtual {v11}, Lef/c;->n0()LLi/N;

    move-result-object v0

    invoke-static {v0, v9, v6, v12, v8}, LT/o1;->b(LLi/N;Ldh/i;LT/l;II)LT/z1;

    move-result-object v0

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :goto_2
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_d

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lef/a;

    instance-of v1, v0, Lef/a$b;

    const/4 v2, 0x2

    if-eqz v1, :cond_9

    const v1, -0x3b60dc9

    invoke-interface {v6, v1}, LT/l;->U(I)V

    sget-object v1, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    invoke-static {v1, v7, v8, v9}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    sget-object v3, Lla/a;->a:Lla/a;

    sget v4, Lla/a;->b:I

    invoke-virtual {v3, v6, v4}, Lla/a;->d(LT/l;I)Lra/a;

    move-result-object v3

    invoke-virtual {v3}, Lra/a;->a()Lra/b;

    move-result-object v3

    invoke-virtual {v3}, Lra/b;->a()Lra/b$a$a;

    move-result-object v3

    invoke-virtual {v3}, Lra/b$a$a;->d()F

    move-result v3

    invoke-static {v1, v3, v7, v2, v9}, Landroidx/compose/foundation/layout/o;->k(Landroidx/compose/ui/e;FFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    move-object v2, v0

    check-cast v2, Lef/a$b;

    const v0, -0x3b5ecef

    invoke-interface {v6, v0}, LT/l;->U(I)V

    invoke-interface {v6, v11}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v0

    invoke-interface/range {p2 .. p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v3

    if-nez v0, :cond_7

    sget-object v0, LT/l;->a:LT/l$a;

    invoke-virtual {v0}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v3, v0, :cond_8

    :cond_7
    new-instance v3, Lef/j$b$a;

    invoke-direct {v3, v11}, Lef/j$b$a;-><init>(Ljava/lang/Object;)V

    invoke-interface {v6, v3}, LT/l;->K(Ljava/lang/Object;)V

    :cond_8
    check-cast v3, Lth/g;

    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    check-cast v3, Lmh/l;

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, v1

    move-object v1, v2

    move-object v2, v3

    move-object/from16 v3, p2

    invoke-static/range {v0 .. v5}, Lef/j;->r(Landroidx/compose/ui/e;Lef/a$b;Lmh/l;LT/l;II)V

    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    goto :goto_2

    :cond_9
    instance-of v1, v0, Lef/a$a;

    if-eqz v1, :cond_c

    const v1, -0x3b5ddaa

    invoke-interface {v6, v1}, LT/l;->U(I)V

    sget-object v1, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    invoke-static {v1, v7, v8, v9}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    sget-object v3, Lla/a;->a:Lla/a;

    sget v4, Lla/a;->b:I

    invoke-virtual {v3, v6, v4}, Lla/a;->d(LT/l;I)Lra/a;

    move-result-object v3

    invoke-virtual {v3}, Lra/a;->a()Lra/b;

    move-result-object v3

    invoke-virtual {v3}, Lra/b;->a()Lra/b$a$a;

    move-result-object v3

    invoke-virtual {v3}, Lra/b$a$a;->d()F

    move-result v3

    invoke-static {v1, v3, v7, v2, v9}, Landroidx/compose/foundation/layout/o;->k(Landroidx/compose/ui/e;FFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    move-object v2, v0

    check-cast v2, Lef/a$a;

    const v0, -0x3b5bcef

    invoke-interface {v6, v0}, LT/l;->U(I)V

    invoke-interface {v6, v11}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v0

    invoke-interface/range {p2 .. p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v3

    if-nez v0, :cond_a

    sget-object v0, LT/l;->a:LT/l$a;

    invoke-virtual {v0}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v3, v0, :cond_b

    :cond_a
    new-instance v3, Lef/j$b$b;

    invoke-direct {v3, v11}, Lef/j$b$b;-><init>(Ljava/lang/Object;)V

    invoke-interface {v6, v3}, LT/l;->K(Ljava/lang/Object;)V

    :cond_b
    check-cast v3, Lth/g;

    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    check-cast v3, Lmh/l;

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, v1

    move-object v1, v2

    move-object v2, v3

    move-object/from16 v3, p2

    invoke-static/range {v0 .. v5}, Lef/j;->q(Landroidx/compose/ui/e;Lef/a$a;Lmh/l;LT/l;II)V

    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    goto/16 :goto_2

    :cond_c
    const v0, -0x3b615a9

    invoke-interface {v6, v0}, LT/l;->U(I)V

    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_d
    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    invoke-static {v9, v6, v12, v8}, LBe/v0;->b(Landroidx/compose/ui/e;LT/l;II)V

    invoke-interface/range {p2 .. p2}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_e

    invoke-static {}, LT/o;->P()V

    :cond_e
    :goto_3
    return-void
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lz/j;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lef/j$b;->a(Lz/j;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
