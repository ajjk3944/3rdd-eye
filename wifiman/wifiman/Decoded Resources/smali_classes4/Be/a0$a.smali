.class final LBe/a0$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LBe/a0;->g(Landroidx/compose/ui/e;LJ9/j;Lmh/l;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/ui/e;

.field final synthetic b:LJ9/j;

.field final synthetic c:Lmh/l;

.field final synthetic d:LBe/V;


# direct methods
.method constructor <init>(Landroidx/compose/ui/e;LJ9/j;Lmh/l;LBe/V;)V
    .locals 0

    iput-object p1, p0, LBe/a0$a;->a:Landroidx/compose/ui/e;

    iput-object p2, p0, LBe/a0$a;->b:LJ9/j;

    iput-object p3, p0, LBe/a0$a;->c:Lmh/l;

    iput-object p4, p0, LBe/a0$a;->d:LBe/V;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lmh/l;LJ9/a;)LYg/J;
    .locals 0

    invoke-static {p0, p1}, LBe/a0$a;->c(Lmh/l;LJ9/a;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Lmh/l;LJ9/a;)LYg/J;
    .locals 0

    invoke-interface {p0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method


# virtual methods
.method public final b(LT/l;I)V
    .locals 24

    move-object/from16 v0, p0

    move-object/from16 v8, p1

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

    const-string v3, "com.ui.wifiman.ui.component.UiNavigationBarLayout.<anonymous> (UiNavigationBar.kt:93)"

    const v4, -0x483ba1eb

    invoke-static {v4, v1, v2, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    sget-object v1, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/4 v9, 0x0

    const/4 v10, 0x1

    const/4 v11, 0x0

    invoke-static {v1, v9, v10, v11}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v2

    iget-object v3, v0, LBe/a0$a;->a:Landroidx/compose/ui/e;

    iget-object v4, v0, LBe/a0$a;->b:LJ9/j;

    iget-object v12, v0, LBe/a0$a;->c:Lmh/l;

    iget-object v13, v0, LBe/a0$a;->d:LBe/V;

    sget-object v5, Lz/c;->a:Lz/c;

    invoke-virtual {v5}, Lz/c;->g()Lz/c$m;

    move-result-object v6

    sget-object v7, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v7}, Lf0/c$a;->k()Lf0/c$b;

    move-result-object v14

    const/4 v15, 0x0

    invoke-static {v6, v14, v8, v15}, Lz/h;->a(Lz/c$m;Lf0/c$b;LT/l;I)LC0/C;

    move-result-object v6

    invoke-static {v8, v15}, LT/j;->a(LT/l;I)I

    move-result v14

    invoke-interface/range {p1 .. p1}, LT/l;->G()LT/x;

    move-result-object v15

    invoke-static {v8, v2}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v2

    sget-object v16, LE0/g;->K:LE0/g$a;

    invoke-virtual/range {v16 .. v16}, LE0/g$a;->a()Lmh/a;

    move-result-object v9

    invoke-interface/range {p1 .. p1}, LT/l;->x()LT/f;

    move-result-object v17

    if-nez v17, :cond_3

    invoke-static {}, LT/j;->c()V

    :cond_3
    invoke-interface/range {p1 .. p1}, LT/l;->u()V

    invoke-interface/range {p1 .. p1}, LT/l;->o()Z

    move-result v17

    if-eqz v17, :cond_4

    invoke-interface {v8, v9}, LT/l;->D(Lmh/a;)V

    goto :goto_1

    :cond_4
    invoke-interface/range {p1 .. p1}, LT/l;->I()V

    :goto_1
    invoke-static/range {p1 .. p1}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v9

    invoke-virtual/range {v16 .. v16}, LE0/g$a;->e()Lmh/p;

    move-result-object v10

    invoke-static {v9, v6, v10}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v16 .. v16}, LE0/g$a;->g()Lmh/p;

    move-result-object v6

    invoke-static {v9, v15, v6}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v16 .. v16}, LE0/g$a;->b()Lmh/p;

    move-result-object v6

    invoke-interface {v9}, LT/l;->o()Z

    move-result v10

    if-nez v10, :cond_5

    invoke-interface {v9}, LT/l;->f()Ljava/lang/Object;

    move-result-object v10

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-static {v10, v15}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_6

    :cond_5
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-interface {v9, v10}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-interface {v9, v10, v6}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_6
    invoke-virtual/range {v16 .. v16}, LE0/g$a;->f()Lmh/p;

    move-result-object v6

    invoke-static {v9, v2, v6}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v2, Lz/k;->a:Lz/k;

    const/4 v2, 0x0

    const/4 v6, 0x1

    invoke-static {v3, v2, v6, v11}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v3

    int-to-float v2, v6

    invoke-static {v2}, LY0/h;->j(F)F

    move-result v2

    invoke-static {v3, v2}, Landroidx/compose/foundation/layout/r;->i(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v18

    sget-object v2, Lla/a;->a:Lla/a;

    sget v3, Lla/a;->b:I

    invoke-virtual {v2, v8, v3}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v6

    invoke-virtual {v6}, Lma/a;->a()Lma/a$a;

    move-result-object v6

    invoke-virtual {v6}, Lma/a$a;->g()Lr9/a$b;

    move-result-object v6

    invoke-virtual {v6}, Lr9/a$b;->f()J

    move-result-wide v19

    const/16 v22, 0x2

    const/16 v23, 0x0

    const/16 v21, 0x0

    invoke-static/range {v18 .. v23}, Landroidx/compose/foundation/b;->d(Landroidx/compose/ui/e;JLm0/i1;ILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v6

    const/4 v9, 0x0

    invoke-static {v6, v8, v9}, Lz/a0;->a(Landroidx/compose/ui/e;LT/l;I)V

    const/4 v6, 0x0

    const/4 v9, 0x1

    invoke-static {v1, v6, v9, v11}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    invoke-virtual {v2, v8, v3}, Lla/a;->d(LT/l;I)Lra/a;

    move-result-object v2

    invoke-virtual {v2}, Lra/a;->a()Lra/b;

    move-result-object v2

    invoke-virtual {v2}, Lra/b;->a()Lra/b$a$a;

    move-result-object v2

    invoke-virtual {v2}, Lra/b$a$a;->c()F

    move-result v2

    const/4 v3, 0x4

    int-to-float v3, v3

    invoke-static {v3}, LY0/h;->j(F)F

    move-result v6

    invoke-static {v1, v2, v6}, Landroidx/compose/foundation/layout/o;->j(Landroidx/compose/ui/e;FF)Landroidx/compose/ui/e;

    move-result-object v1

    invoke-static {v3}, LY0/h;->j(F)F

    move-result v2

    invoke-virtual {v5, v2}, Lz/c;->n(F)Lz/c$f;

    move-result-object v2

    invoke-virtual {v7}, Lf0/c$a;->l()Lf0/c$c;

    move-result-object v3

    const/4 v5, 0x6

    invoke-static {v2, v3, v8, v5}, Lz/W;->b(Lz/c$e;Lf0/c$c;LT/l;I)LC0/C;

    move-result-object v2

    const/4 v3, 0x0

    invoke-static {v8, v3}, LT/j;->a(LT/l;I)I

    move-result v3

    invoke-interface/range {p1 .. p1}, LT/l;->G()LT/x;

    move-result-object v5

    invoke-static {v8, v1}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v1

    invoke-virtual/range {v16 .. v16}, LE0/g$a;->a()Lmh/a;

    move-result-object v6

    invoke-interface/range {p1 .. p1}, LT/l;->x()LT/f;

    move-result-object v7

    if-nez v7, :cond_7

    invoke-static {}, LT/j;->c()V

    :cond_7
    invoke-interface/range {p1 .. p1}, LT/l;->u()V

    invoke-interface/range {p1 .. p1}, LT/l;->o()Z

    move-result v7

    if-eqz v7, :cond_8

    invoke-interface {v8, v6}, LT/l;->D(Lmh/a;)V

    goto :goto_2

    :cond_8
    invoke-interface/range {p1 .. p1}, LT/l;->I()V

    :goto_2
    invoke-static/range {p1 .. p1}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v6

    invoke-virtual/range {v16 .. v16}, LE0/g$a;->e()Lmh/p;

    move-result-object v7

    invoke-static {v6, v2, v7}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v16 .. v16}, LE0/g$a;->g()Lmh/p;

    move-result-object v2

    invoke-static {v6, v5, v2}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v16 .. v16}, LE0/g$a;->b()Lmh/p;

    move-result-object v2

    invoke-interface {v6}, LT/l;->o()Z

    move-result v5

    if-nez v5, :cond_9

    invoke-interface {v6}, LT/l;->f()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v5, v7}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_a

    :cond_9
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v6, v5}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v6, v3, v2}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_a
    invoke-virtual/range {v16 .. v16}, LE0/g$a;->f()Lmh/p;

    move-result-object v2

    invoke-static {v6, v1, v2}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v9, Lz/Z;->a:Lz/Z;

    const v1, -0x7a339123

    invoke-interface {v8, v1}, LT/l;->U(I)V

    invoke-virtual {v4}, LJ9/j;->a()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_3
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_d

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, LJ9/a;

    sget-object v1, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/16 v3, 0x3a

    int-to-float v3, v3

    invoke-static {v3}, LY0/h;->j(F)F

    move-result v3

    const/4 v14, 0x0

    const/4 v15, 0x1

    invoke-static {v1, v14, v3, v15, v11}, Landroidx/compose/foundation/layout/r;->b(Landroidx/compose/ui/e;FFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-interface {v9, v1, v3, v15}, Lz/Y;->a(Landroidx/compose/ui/e;FZ)Landroidx/compose/ui/e;

    move-result-object v1

    const v3, 0x3895b0ec

    invoke-interface {v8, v3}, LT/l;->U(I)V

    invoke-interface {v8, v12}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v3

    invoke-interface {v8, v2}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v3, v4

    invoke-interface/range {p1 .. p1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_b

    sget-object v3, LT/l;->a:LT/l$a;

    invoke-virtual {v3}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v3

    if-ne v4, v3, :cond_c

    :cond_b
    new-instance v4, LBe/Z;

    invoke-direct {v4, v12, v2}, LBe/Z;-><init>(Lmh/l;LJ9/a;)V

    invoke-interface {v8, v4}, LT/l;->K(Ljava/lang/Object;)V

    :cond_c
    move-object v3, v4

    check-cast v3, Lmh/a;

    invoke-interface/range {p1 .. p1}, LT/l;->J()V

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v4, v13

    move-object/from16 v5, p1

    invoke-static/range {v1 .. v7}, LBe/a0;->i(Landroidx/compose/ui/e;LJ9/a;Lmh/a;LBe/V;LT/l;II)V

    goto :goto_3

    :cond_d
    invoke-interface/range {p1 .. p1}, LT/l;->J()V

    invoke-interface/range {p1 .. p1}, LT/l;->R()V

    invoke-interface/range {p1 .. p1}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_e

    invoke-static {}, LT/o;->P()V

    :cond_e
    :goto_4
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LBe/a0$a;->b(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
