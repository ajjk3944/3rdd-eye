.class final Ljf/l$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ljf/l;->e(Landroidx/compose/ui/e;Ljf/h;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/ui/e;

.field final synthetic b:Ljf/g;

.field final synthetic c:Ljf/h;


# direct methods
.method constructor <init>(Landroidx/compose/ui/e;Ljf/g;Ljf/h;)V
    .locals 0

    iput-object p1, p0, Ljf/l$a;->a:Landroidx/compose/ui/e;

    iput-object p2, p0, Ljf/l$a;->b:Ljf/g;

    iput-object p3, p0, Ljf/l$a;->c:Ljf/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lhf/k;Ljf/h;)LYg/J;
    .locals 0

    invoke-static {p0, p1}, Ljf/l$a;->c(Lhf/k;Ljf/h;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Lhf/k;Ljf/h;)LYg/J;
    .locals 1

    invoke-virtual {p0}, Lhf/k;->a()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lhf/k;->a()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Ljf/h;->s0(Ljava/lang/String;)V

    :cond_0
    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method


# virtual methods
.method public final b(Lz/j;LT/l;I)V
    .locals 21

    move-object/from16 v0, p0

    move-object/from16 v9, p2

    move/from16 v1, p3

    const-string v2, "$this$UiContentCard"

    move-object/from16 v3, p1

    invoke-static {v3, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v2, v1, 0x11

    const/16 v3, 0x10

    if-ne v2, v3, :cond_1

    invoke-interface/range {p2 .. p2}, LT/l;->v()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface/range {p2 .. p2}, LT/l;->C()V

    goto/16 :goto_7

    :cond_1
    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, -0x1

    const-string v4, "com.ui.wifiman.ui.speedtest.result.SpeedtestResultDetailContentUi.<anonymous>.<anonymous>.<anonymous> (SpeedtestResultDetailContentUi.kt:63)"

    const v5, 0x7298ed60

    invoke-static {v5, v1, v2, v4}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    iget-object v1, v0, Ljf/l$a;->a:Landroidx/compose/ui/e;

    int-to-float v10, v3

    invoke-static {v10}, LY0/h;->j(F)F

    move-result v2

    invoke-static {v1, v2}, Landroidx/compose/foundation/layout/r;->l(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v1

    const/4 v11, 0x0

    invoke-static {v1, v9, v11}, Lz/a0;->a(Landroidx/compose/ui/e;LT/l;I)V

    sget-object v12, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/4 v13, 0x0

    const/4 v14, 0x1

    const/4 v15, 0x0

    invoke-static {v12, v13, v14, v15}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    sget-object v8, Lz/c;->a:Lz/c;

    const/4 v2, 0x4

    int-to-float v7, v2

    invoke-static {v7}, LY0/h;->j(F)F

    move-result v2

    invoke-virtual {v8, v2}, Lz/c;->n(F)Lz/c$f;

    move-result-object v2

    iget-object v6, v0, Ljf/l$a;->b:Ljf/g;

    iget-object v3, v0, Ljf/l$a;->a:Landroidx/compose/ui/e;

    iget-object v5, v0, Ljf/l$a;->c:Ljf/h;

    sget-object v16, Lf0/c;->a:Lf0/c$a;

    invoke-virtual/range {v16 .. v16}, Lf0/c$a;->k()Lf0/c$b;

    move-result-object v4

    const/4 v13, 0x6

    invoke-static {v2, v4, v9, v13}, Lz/h;->a(Lz/c$m;Lf0/c$b;LT/l;I)LC0/C;

    move-result-object v2

    invoke-static {v9, v11}, LT/j;->a(LT/l;I)I

    move-result v4

    invoke-interface/range {p2 .. p2}, LT/l;->G()LT/x;

    move-result-object v11

    invoke-static {v9, v1}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v1

    sget-object v17, LE0/g;->K:LE0/g$a;

    invoke-virtual/range {v17 .. v17}, LE0/g$a;->a()Lmh/a;

    move-result-object v13

    invoke-interface/range {p2 .. p2}, LT/l;->x()LT/f;

    move-result-object v18

    if-nez v18, :cond_3

    invoke-static {}, LT/j;->c()V

    :cond_3
    invoke-interface/range {p2 .. p2}, LT/l;->u()V

    invoke-interface/range {p2 .. p2}, LT/l;->o()Z

    move-result v18

    if-eqz v18, :cond_4

    invoke-interface {v9, v13}, LT/l;->D(Lmh/a;)V

    goto :goto_1

    :cond_4
    invoke-interface/range {p2 .. p2}, LT/l;->I()V

    :goto_1
    invoke-static/range {p2 .. p2}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v13

    invoke-virtual/range {v17 .. v17}, LE0/g$a;->e()Lmh/p;

    move-result-object v14

    invoke-static {v13, v2, v14}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v17 .. v17}, LE0/g$a;->g()Lmh/p;

    move-result-object v2

    invoke-static {v13, v11, v2}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v17 .. v17}, LE0/g$a;->b()Lmh/p;

    move-result-object v2

    invoke-interface {v13}, LT/l;->o()Z

    move-result v11

    if-nez v11, :cond_5

    invoke-interface {v13}, LT/l;->f()Ljava/lang/Object;

    move-result-object v11

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v11, v14}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_6

    :cond_5
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-interface {v13, v11}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v13, v4, v2}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_6
    invoke-virtual/range {v17 .. v17}, LE0/g$a;->f()Lmh/p;

    move-result-object v2

    invoke-static {v13, v1, v2}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v1, Lz/k;->a:Lz/k;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {v12, v1, v2, v15}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v4

    invoke-static {v10}, LY0/h;->j(F)F

    move-result v11

    const/16 v13, 0x8

    int-to-float v13, v13

    invoke-static {v13}, LY0/h;->j(F)F

    move-result v14

    invoke-static {v4, v11, v14}, Landroidx/compose/foundation/layout/o;->j(Landroidx/compose/ui/e;FF)Landroidx/compose/ui/e;

    move-result-object v4

    const/4 v11, 0x0

    const/4 v14, 0x6

    invoke-static {v4, v6, v9, v14, v11}, Ljf/l;->g(Landroidx/compose/ui/e;Ljf/g;LT/l;II)V

    invoke-static {v12, v1, v2, v15}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v4

    invoke-static {v10}, LY0/h;->j(F)F

    move-result v11

    invoke-static {v13}, LY0/h;->j(F)F

    move-result v1

    invoke-static {v4, v11, v1}, Landroidx/compose/foundation/layout/o;->j(Landroidx/compose/ui/e;FF)Landroidx/compose/ui/e;

    move-result-object v1

    invoke-virtual {v6}, Ljf/g;->g()Lhf/t$a;

    move-result-object v4

    invoke-static {v1, v4, v9, v14}, Lhf/J;->E(Landroidx/compose/ui/e;Lhf/t$a;LT/l;I)V

    invoke-virtual {v6}, Ljf/g;->c()Ls9/d;

    move-result-object v1

    if-eqz v1, :cond_7

    const v1, -0x6d39e473

    invoke-interface {v9, v1}, LT/l;->U(I)V

    const/4 v1, 0x0

    invoke-static {v3, v1, v2, v15}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v3

    invoke-static {v10}, LY0/h;->j(F)F

    move-result v1

    invoke-static {v13}, LY0/h;->j(F)F

    move-result v2

    invoke-static {v3, v1, v2}, Landroidx/compose/foundation/layout/o;->j(Landroidx/compose/ui/e;FF)Landroidx/compose/ui/e;

    move-result-object v1

    sget-object v2, LN9/b;->a:LN9/b;

    invoke-virtual {v2}, LN9/b;->A()Ls9/b;

    move-result-object v4

    invoke-virtual {v6}, Ljf/g;->c()Ls9/d;

    move-result-object v11

    sget-object v2, Lla/a;->a:Lla/a;

    sget v3, Lla/a;->b:I

    invoke-virtual {v2, v9, v3}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v2

    invoke-virtual {v2}, Lma/a;->a()Lma/a$a;

    move-result-object v2

    invoke-virtual {v2}, Lma/a$a;->b()Lr9/a$a;

    move-result-object v2

    invoke-virtual {v2}, Lr9/a$a;->f()J

    move-result-wide v2

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-object/from16 v19, v5

    move-object v5, v11

    move-object v11, v6

    move-object/from16 v6, p2

    move/from16 v20, v7

    move v7, v13

    move-object v13, v8

    move v8, v14

    invoke-static/range {v1 .. v8}, LBe/y;->b(Landroidx/compose/ui/e;JLs9/b;Ls9/d;LT/l;II)V

    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    :goto_2
    const/4 v1, 0x0

    const/4 v2, 0x1

    goto :goto_3

    :cond_7
    move-object/from16 v19, v5

    move-object v11, v6

    move/from16 v20, v7

    move-object v13, v8

    const v1, -0x6d30ead1

    invoke-interface {v9, v1}, LT/l;->U(I)V

    const/16 v1, 0x1e

    int-to-float v1, v1

    invoke-static {v1}, LY0/h;->j(F)F

    move-result v1

    invoke-static {v12, v1}, Landroidx/compose/foundation/layout/r;->i(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v1

    const/4 v2, 0x6

    invoke-static {v1, v9, v2}, Lz/a0;->a(Landroidx/compose/ui/e;LT/l;I)V

    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    goto :goto_2

    :goto_3
    invoke-static {v12, v1, v2, v15}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v3

    const/16 v2, 0xd2

    int-to-float v2, v2

    invoke-static {v2}, LY0/h;->j(F)F

    move-result v2

    const/4 v4, 0x2

    invoke-static {v3, v2, v1, v4, v15}, Landroidx/compose/foundation/layout/r;->k(Landroidx/compose/ui/e;FFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v2

    invoke-virtual {v13}, Lz/c;->g()Lz/c$m;

    move-result-object v1

    invoke-virtual/range {v16 .. v16}, Lf0/c$a;->k()Lf0/c$b;

    move-result-object v3

    const/4 v8, 0x0

    invoke-static {v1, v3, v9, v8}, Lz/h;->a(Lz/c$m;Lf0/c$b;LT/l;I)LC0/C;

    move-result-object v1

    invoke-static {v9, v8}, LT/j;->a(LT/l;I)I

    move-result v3

    invoke-interface/range {p2 .. p2}, LT/l;->G()LT/x;

    move-result-object v4

    invoke-static {v9, v2}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v2

    invoke-virtual/range {v17 .. v17}, LE0/g$a;->a()Lmh/a;

    move-result-object v5

    invoke-interface/range {p2 .. p2}, LT/l;->x()LT/f;

    move-result-object v6

    if-nez v6, :cond_8

    invoke-static {}, LT/j;->c()V

    :cond_8
    invoke-interface/range {p2 .. p2}, LT/l;->u()V

    invoke-interface/range {p2 .. p2}, LT/l;->o()Z

    move-result v6

    if-eqz v6, :cond_9

    invoke-interface {v9, v5}, LT/l;->D(Lmh/a;)V

    goto :goto_4

    :cond_9
    invoke-interface/range {p2 .. p2}, LT/l;->I()V

    :goto_4
    invoke-static/range {p2 .. p2}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v5

    invoke-virtual/range {v17 .. v17}, LE0/g$a;->e()Lmh/p;

    move-result-object v6

    invoke-static {v5, v1, v6}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v17 .. v17}, LE0/g$a;->g()Lmh/p;

    move-result-object v1

    invoke-static {v5, v4, v1}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v17 .. v17}, LE0/g$a;->b()Lmh/p;

    move-result-object v1

    invoke-interface {v5}, LT/l;->o()Z

    move-result v4

    if-nez v4, :cond_a

    invoke-interface {v5}, LT/l;->f()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v4, v6}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_b

    :cond_a
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v5, v4}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v5, v3, v1}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_b
    invoke-virtual/range {v17 .. v17}, LE0/g$a;->f()Lmh/p;

    move-result-object v1

    invoke-static {v5, v2, v1}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    const v1, -0x62e10af4

    invoke-interface {v9, v1}, LT/l;->U(I)V

    invoke-virtual {v11}, Ljf/g;->d()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_5
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_f

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lhf/k;

    sget-object v2, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/4 v12, 0x0

    const/4 v13, 0x1

    invoke-static {v2, v12, v13, v15}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v2

    invoke-static {v10}, LY0/h;->j(F)F

    move-result v3

    invoke-static/range {v20 .. v20}, LY0/h;->j(F)F

    move-result v4

    invoke-static {v2, v3, v4}, Landroidx/compose/foundation/layout/o;->j(Landroidx/compose/ui/e;FF)Landroidx/compose/ui/e;

    move-result-object v2

    invoke-virtual {v1}, Lhf/k;->b()Ls9/d;

    move-result-object v3

    invoke-virtual {v1}, Lhf/k;->c()Ls9/d;

    move-result-object v4

    invoke-virtual {v1}, Lhf/k;->a()Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_c

    move v5, v13

    goto :goto_6

    :cond_c
    move v5, v8

    :goto_6
    const v6, 0x78ff64a5

    invoke-interface {v9, v6}, LT/l;->U(I)V

    invoke-interface {v9, v1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v6

    move-object/from16 v14, v19

    invoke-interface {v9, v14}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v7

    or-int/2addr v6, v7

    invoke-interface/range {p2 .. p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v7

    if-nez v6, :cond_d

    sget-object v6, LT/l;->a:LT/l$a;

    invoke-virtual {v6}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v6

    if-ne v7, v6, :cond_e

    :cond_d
    new-instance v7, Ljf/k;

    invoke-direct {v7, v1, v14}, Ljf/k;-><init>(Lhf/k;Ljf/h;)V

    invoke-interface {v9, v7}, LT/l;->K(Ljava/lang/Object;)V

    :cond_e
    move-object v6, v7

    check-cast v6, Lmh/a;

    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    const/4 v7, 0x6

    move-object v1, v2

    move-object v2, v3

    move-object v3, v4

    move v4, v5

    move-object v5, v6

    move-object/from16 v6, p2

    invoke-static/range {v1 .. v7}, Lhf/m;->b(Landroidx/compose/ui/e;Ls9/d;Ls9/d;ZLmh/a;LT/l;I)V

    move-object/from16 v19, v14

    goto :goto_5

    :cond_f
    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    invoke-interface/range {p2 .. p2}, LT/l;->R()V

    invoke-interface/range {p2 .. p2}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_10

    invoke-static {}, LT/o;->P()V

    :cond_10
    :goto_7
    return-void
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lz/j;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Ljf/l$a;->b(Lz/j;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
