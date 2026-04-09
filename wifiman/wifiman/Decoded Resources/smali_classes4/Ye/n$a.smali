.class final LYe/n$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYe/n;->b(Landroidx/compose/ui/e;LYe/d$b;LYe/f;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LYe/d$b;

.field final synthetic b:Landroidx/compose/ui/e;

.field final synthetic c:LYe/f;


# direct methods
.method constructor <init>(LYe/d$b;Landroidx/compose/ui/e;LYe/f;)V
    .locals 0

    iput-object p1, p0, LYe/n$a;->a:LYe/d$b;

    iput-object p2, p0, LYe/n$a;->b:Landroidx/compose/ui/e;

    iput-object p3, p0, LYe/n$a;->c:LYe/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lz/N;LT/l;I)V
    .locals 15

    move-object v0, p0

    move-object/from16 v1, p1

    move-object/from16 v13, p2

    const-string v2, "scaffoldPadding"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v2, p3, 0x6

    const/4 v3, 0x2

    if-nez v2, :cond_1

    invoke-interface {v13, v1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    move v2, v3

    :goto_0
    or-int v2, p3, v2

    goto :goto_1

    :cond_1
    move/from16 v2, p3

    :goto_1
    and-int/lit8 v4, v2, 0x13

    const/16 v5, 0x12

    if-ne v4, v5, :cond_3

    invoke-interface/range {p2 .. p2}, LT/l;->v()Z

    move-result v4

    if-nez v4, :cond_2

    goto :goto_2

    :cond_2
    invoke-interface/range {p2 .. p2}, LT/l;->C()V

    goto/16 :goto_b

    :cond_3
    :goto_2
    invoke-static {}, LT/o;->H()Z

    move-result v4

    if-eqz v4, :cond_4

    const/4 v4, -0x1

    const-string v5, "com.ui.wifiman.ui.signal.floorplan.scan.FloorplanMapperUnavailableUi.<anonymous> (FloorplanMapperUnavailableUi.kt:44)"

    const v6, -0x2eda9f90

    invoke-static {v6, v2, v4, v5}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_4
    iget-object v2, v0, LYe/n$a;->a:LYe/d$b;

    instance-of v4, v2, LYe/d$b$a;

    if-nez v4, :cond_1b

    instance-of v2, v2, LYe/d$b$b;

    if-eqz v2, :cond_1a

    iget-object v2, v0, LYe/n$a;->b:Landroidx/compose/ui/e;

    const/4 v4, 0x0

    const/4 v5, 0x1

    const/4 v6, 0x0

    invoke-static {v2, v4, v5, v6}, Landroidx/compose/foundation/layout/r;->f(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v2

    invoke-static {v2, v1}, Landroidx/compose/foundation/layout/o;->h(Landroidx/compose/ui/e;Lz/N;)Landroidx/compose/ui/e;

    move-result-object v1

    sget-object v2, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v2}, Lf0/c$a;->e()Lf0/c;

    move-result-object v2

    iget-object v7, v0, LYe/n$a;->a:LYe/d$b;

    iget-object v8, v0, LYe/n$a;->c:LYe/f;

    const/4 v9, 0x0

    invoke-static {v2, v9}, Landroidx/compose/foundation/layout/d;->h(Lf0/c;Z)LC0/C;

    move-result-object v2

    invoke-static {v13, v9}, LT/j;->a(LT/l;I)I

    move-result v9

    invoke-interface/range {p2 .. p2}, LT/l;->G()LT/x;

    move-result-object v10

    invoke-static {v13, v1}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v1

    sget-object v11, LE0/g;->K:LE0/g$a;

    invoke-virtual {v11}, LE0/g$a;->a()Lmh/a;

    move-result-object v12

    invoke-interface/range {p2 .. p2}, LT/l;->x()LT/f;

    move-result-object v14

    if-nez v14, :cond_5

    invoke-static {}, LT/j;->c()V

    :cond_5
    invoke-interface/range {p2 .. p2}, LT/l;->u()V

    invoke-interface/range {p2 .. p2}, LT/l;->o()Z

    move-result v14

    if-eqz v14, :cond_6

    invoke-interface {v13, v12}, LT/l;->D(Lmh/a;)V

    goto :goto_3

    :cond_6
    invoke-interface/range {p2 .. p2}, LT/l;->I()V

    :goto_3
    invoke-static/range {p2 .. p2}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v12

    invoke-virtual {v11}, LE0/g$a;->e()Lmh/p;

    move-result-object v14

    invoke-static {v12, v2, v14}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v11}, LE0/g$a;->g()Lmh/p;

    move-result-object v2

    invoke-static {v12, v10, v2}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v11}, LE0/g$a;->b()Lmh/p;

    move-result-object v2

    invoke-interface {v12}, LT/l;->o()Z

    move-result v10

    if-nez v10, :cond_7

    invoke-interface {v12}, LT/l;->f()Ljava/lang/Object;

    move-result-object v10

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v10, v14}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_8

    :cond_7
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-interface {v12, v10}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-interface {v12, v9, v2}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_8
    invoke-virtual {v11}, LE0/g$a;->f()Lmh/p;

    move-result-object v2

    invoke-static {v12, v1, v2}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v1, Landroidx/compose/foundation/layout/f;->a:Landroidx/compose/foundation/layout/f;

    sget-object v1, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    invoke-static {v1, v4, v5, v6}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    sget-object v2, Lla/a;->a:Lla/a;

    sget v4, Lla/a;->b:I

    invoke-virtual {v2, v13, v4}, Lla/a;->d(LT/l;I)Lra/a;

    move-result-object v5

    invoke-virtual {v5}, Lra/a;->a()Lra/b;

    move-result-object v5

    invoke-virtual {v5}, Lra/b;->a()Lra/b$a$a;

    move-result-object v5

    const/16 v9, 0x20

    int-to-float v9, v9

    invoke-static {v9}, LY0/h;->j(F)F

    move-result v9

    invoke-virtual {v5, v9}, Lra/b$a;->a(F)F

    move-result v5

    invoke-virtual {v2, v13, v4}, Lla/a;->d(LT/l;I)Lra/a;

    move-result-object v2

    invoke-virtual {v2}, Lra/a;->a()Lra/b;

    move-result-object v2

    invoke-virtual {v2}, Lra/b;->b()Lra/b$a$b;

    move-result-object v2

    invoke-virtual {v2}, Lra/b$a$b;->d()F

    move-result v2

    invoke-static {v1, v5, v2}, Landroidx/compose/foundation/layout/o;->j(Landroidx/compose/ui/e;FF)Landroidx/compose/ui/e;

    move-result-object v1

    check-cast v7, LYe/d$b$b;

    instance-of v2, v7, LYe/d$b$b$a;

    if-eqz v2, :cond_9

    new-instance v4, Ls9/c$a;

    sget v5, Lm8/a;->n0:I

    invoke-direct {v4, v5, v6, v3, v6}, Ls9/c$a;-><init>(ILs9/d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v3, v4

    goto :goto_5

    :cond_9
    instance-of v3, v7, LYe/d$b$b$b;

    if-nez v3, :cond_b

    instance-of v3, v7, LYe/d$b$b$c;

    if-nez v3, :cond_b

    instance-of v3, v7, LYe/d$b$b$d;

    if-eqz v3, :cond_a

    goto :goto_4

    :cond_a
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :cond_b
    :goto_4
    sget-object v3, LN9/b;->a:LN9/b;

    invoke-virtual {v3}, LN9/b;->c()Ls9/b;

    move-result-object v3

    :goto_5
    instance-of v4, v7, LYe/d$b$b$b;

    if-eqz v4, :cond_c

    new-instance v5, Ls9/d$b;

    sget v9, Lm8/c;->I0:I

    invoke-direct {v5, v9}, Ls9/d$b;-><init>(I)V

    goto :goto_6

    :cond_c
    if-eqz v2, :cond_d

    new-instance v5, Ls9/d$b;

    sget v9, Lm8/c;->F0:I

    invoke-direct {v5, v9}, Ls9/d$b;-><init>(I)V

    goto :goto_6

    :cond_d
    instance-of v5, v7, LYe/d$b$b$c;

    if-eqz v5, :cond_e

    new-instance v5, Ls9/d$b;

    sget v9, Lm8/c;->M0:I

    invoke-direct {v5, v9}, Ls9/d$b;-><init>(I)V

    goto :goto_6

    :cond_e
    instance-of v5, v7, LYe/d$b$b$d;

    if-eqz v5, :cond_19

    new-instance v5, Ls9/d$b;

    sget v9, Lm8/c;->T0:I

    invoke-direct {v5, v9}, Ls9/d$b;-><init>(I)V

    :goto_6
    if-eqz v4, :cond_f

    new-instance v9, Ls9/d$b;

    sget v10, Lm8/c;->H0:I

    invoke-direct {v9, v10}, Ls9/d$b;-><init>(I)V

    goto :goto_7

    :cond_f
    if-eqz v2, :cond_10

    new-instance v9, Ls9/d$b;

    sget v10, Lm8/c;->E0:I

    invoke-direct {v9, v10}, Ls9/d$b;-><init>(I)V

    goto :goto_7

    :cond_10
    instance-of v9, v7, LYe/d$b$b$c;

    if-eqz v9, :cond_11

    new-instance v9, Ls9/d$b;

    sget v10, Lm8/c;->L0:I

    invoke-direct {v9, v10}, Ls9/d$b;-><init>(I)V

    goto :goto_7

    :cond_11
    instance-of v9, v7, LYe/d$b$b$d;

    if-eqz v9, :cond_18

    new-instance v9, Ls9/d$b;

    sget v10, Lm8/c;->S0:I

    invoke-direct {v9, v10}, Ls9/d$b;-><init>(I)V

    :goto_7
    if-eqz v4, :cond_12

    new-instance v2, Ls9/d$b;

    sget v4, Lm8/c;->G0:I

    invoke-direct {v2, v4}, Ls9/d$b;-><init>(I)V

    :goto_8
    move-object v6, v2

    goto :goto_9

    :cond_12
    if-eqz v2, :cond_13

    new-instance v2, Ls9/d$b;

    sget v4, Lm8/c;->D0:I

    invoke-direct {v2, v4}, Ls9/d$b;-><init>(I)V

    goto :goto_8

    :cond_13
    instance-of v2, v7, LYe/d$b$b$c;

    if-eqz v2, :cond_14

    new-instance v2, Ls9/d$b;

    sget v4, Lm8/c;->K0:I

    invoke-direct {v2, v4}, Ls9/d$b;-><init>(I)V

    goto :goto_8

    :cond_14
    instance-of v2, v7, LYe/d$b$b$d;

    if-eqz v2, :cond_17

    :goto_9
    const v2, 0x6cb33787

    invoke-interface {v13, v2}, LT/l;->U(I)V

    invoke-interface {v13, v8}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v2

    invoke-interface/range {p2 .. p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v4

    if-nez v2, :cond_15

    sget-object v2, LT/l;->a:LT/l$a;

    invoke-virtual {v2}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v4, v2, :cond_16

    :cond_15
    new-instance v4, LYe/n$a$a;

    invoke-direct {v4, v8}, LYe/n$a$a;-><init>(Ljava/lang/Object;)V

    invoke-interface {v13, v4}, LT/l;->K(Ljava/lang/Object;)V

    :cond_16
    check-cast v4, Lth/g;

    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    move-object v7, v4

    check-cast v7, Lmh/a;

    const/4 v11, 0x0

    const/16 v12, 0x190

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v14, 0x0

    move-object v2, v3

    move-object v3, v5

    move-object v4, v9

    move-object v5, v8

    move-object v8, v10

    move-object v9, v14

    move-object/from16 v10, p2

    invoke-static/range {v1 .. v12}, LBe/o;->f(Landroidx/compose/ui/e;Ls9/a;Ls9/d;Ls9/d;Lmh/l;Ls9/d;Lmh/a;Ls9/d;Lmh/a;LT/l;II)V

    invoke-interface/range {p2 .. p2}, LT/l;->R()V

    goto :goto_a

    :cond_17
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :cond_18
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :cond_19
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :cond_1a
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :cond_1b
    :goto_a
    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_1c

    invoke-static {}, LT/o;->P()V

    :cond_1c
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

    invoke-virtual {p0, p1, p2, p3}, LYe/n$a;->a(Lz/N;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
