.class final Laf/H$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Laf/H;->o(Landroidx/compose/ui/e;Laf/B;Lmh/a;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Laf/B;


# direct methods
.method constructor <init>(Laf/B;)V
    .locals 0

    iput-object p1, p0, Laf/H$b;->a:Laf/B;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LT/l;I)V
    .locals 18

    move-object/from16 v10, p1

    move/from16 v0, p2

    and-int/lit8 v1, v0, 0x3

    const/4 v2, 0x2

    if-ne v1, v2, :cond_1

    invoke-interface/range {p1 .. p1}, LT/l;->v()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface/range {p1 .. p1}, LT/l;->C()V

    move-object/from16 v11, p0

    goto/16 :goto_3

    :cond_1
    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v1, -0x1

    const-string v3, "com.ui.wifiman.ui.speed.component.SpeedTabLatencyCardUi.<anonymous> (SpeedTabLatencyCardUi.kt:77)"

    const v4, 0x20a5edee

    invoke-static {v4, v0, v1, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    sget-object v0, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/16 v1, 0x10

    int-to-float v1, v1

    invoke-static {v1}, LY0/h;->j(F)F

    move-result v3

    const/16 v4, 0x8

    int-to-float v4, v4

    invoke-static {v4}, LY0/h;->j(F)F

    move-result v5

    invoke-static {v0, v3, v5}, Landroidx/compose/foundation/layout/o;->j(Landroidx/compose/ui/e;FF)Landroidx/compose/ui/e;

    move-result-object v3

    const/16 v5, 0x3c

    int-to-float v5, v5

    invoke-static {v5}, LY0/h;->j(F)F

    move-result v5

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static {v3, v5, v6, v2, v7}, Landroidx/compose/foundation/layout/r;->k(Landroidx/compose/ui/e;FFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v3

    const/4 v8, 0x1

    invoke-static {v3, v6, v8, v7}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v3

    const/4 v5, 0x3

    invoke-static {v3, v7, v7, v5, v7}, Landroidx/compose/animation/f;->b(Landroidx/compose/ui/e;Lr/H;Lmh/p;ILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v3

    sget-object v5, Lz/c;->a:Lz/c;

    invoke-static {v1}, LY0/h;->j(F)F

    move-result v9

    invoke-virtual {v5, v9}, Lz/c;->n(F)Lz/c$f;

    move-result-object v9

    move-object/from16 v11, p0

    iget-object v12, v11, Laf/H$b;->a:Laf/B;

    sget-object v13, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v13}, Lf0/c$a;->k()Lf0/c$b;

    move-result-object v14

    const/4 v15, 0x6

    invoke-static {v9, v14, v10, v15}, Lz/h;->a(Lz/c$m;Lf0/c$b;LT/l;I)LC0/C;

    move-result-object v9

    const/4 v14, 0x0

    invoke-static {v10, v14}, LT/j;->a(LT/l;I)I

    move-result v15

    invoke-interface/range {p1 .. p1}, LT/l;->G()LT/x;

    move-result-object v14

    invoke-static {v10, v3}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v3

    sget-object v16, LE0/g;->K:LE0/g$a;

    invoke-virtual/range {v16 .. v16}, LE0/g$a;->a()Lmh/a;

    move-result-object v2

    invoke-interface/range {p1 .. p1}, LT/l;->x()LT/f;

    move-result-object v17

    if-nez v17, :cond_3

    invoke-static {}, LT/j;->c()V

    :cond_3
    invoke-interface/range {p1 .. p1}, LT/l;->u()V

    invoke-interface/range {p1 .. p1}, LT/l;->o()Z

    move-result v17

    if-eqz v17, :cond_4

    invoke-interface {v10, v2}, LT/l;->D(Lmh/a;)V

    goto :goto_1

    :cond_4
    invoke-interface/range {p1 .. p1}, LT/l;->I()V

    :goto_1
    invoke-static/range {p1 .. p1}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v2

    invoke-virtual/range {v16 .. v16}, LE0/g$a;->e()Lmh/p;

    move-result-object v6

    invoke-static {v2, v9, v6}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v16 .. v16}, LE0/g$a;->g()Lmh/p;

    move-result-object v6

    invoke-static {v2, v14, v6}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v16 .. v16}, LE0/g$a;->b()Lmh/p;

    move-result-object v6

    invoke-interface {v2}, LT/l;->o()Z

    move-result v9

    if-nez v9, :cond_5

    invoke-interface {v2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v9, v14}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_6

    :cond_5
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-interface {v2, v9}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-interface {v2, v9, v6}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_6
    invoke-virtual/range {v16 .. v16}, LE0/g$a;->f()Lmh/p;

    move-result-object v6

    invoke-static {v2, v3, v6}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v6, Lz/k;->a:Lz/k;

    const/4 v2, 0x0

    invoke-static {v0, v2, v8, v7}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v3

    invoke-static {v4}, LY0/h;->j(F)F

    move-result v4

    const/4 v9, 0x2

    invoke-static {v3, v4, v2, v9, v7}, Landroidx/compose/foundation/layout/o;->k(Landroidx/compose/ui/e;FFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v2

    invoke-static {v1}, LY0/h;->j(F)F

    move-result v1

    invoke-virtual {v5, v1}, Lz/c;->n(F)Lz/c$f;

    move-result-object v1

    invoke-virtual {v13}, Lf0/c$a;->i()Lf0/c$c;

    move-result-object v3

    const/16 v9, 0x36

    invoke-static {v1, v3, v10, v9}, Lz/W;->b(Lz/c$e;Lf0/c$c;LT/l;I)LC0/C;

    move-result-object v1

    const/4 v3, 0x0

    invoke-static {v10, v3}, LT/j;->a(LT/l;I)I

    move-result v4

    invoke-interface/range {p1 .. p1}, LT/l;->G()LT/x;

    move-result-object v3

    invoke-static {v10, v2}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v2

    invoke-virtual/range {v16 .. v16}, LE0/g$a;->a()Lmh/a;

    move-result-object v5

    invoke-interface/range {p1 .. p1}, LT/l;->x()LT/f;

    move-result-object v13

    if-nez v13, :cond_7

    invoke-static {}, LT/j;->c()V

    :cond_7
    invoke-interface/range {p1 .. p1}, LT/l;->u()V

    invoke-interface/range {p1 .. p1}, LT/l;->o()Z

    move-result v13

    if-eqz v13, :cond_8

    invoke-interface {v10, v5}, LT/l;->D(Lmh/a;)V

    goto :goto_2

    :cond_8
    invoke-interface/range {p1 .. p1}, LT/l;->I()V

    :goto_2
    invoke-static/range {p1 .. p1}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v5

    invoke-virtual/range {v16 .. v16}, LE0/g$a;->e()Lmh/p;

    move-result-object v13

    invoke-static {v5, v1, v13}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v16 .. v16}, LE0/g$a;->g()Lmh/p;

    move-result-object v1

    invoke-static {v5, v3, v1}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v16 .. v16}, LE0/g$a;->b()Lmh/p;

    move-result-object v1

    invoke-interface {v5}, LT/l;->o()Z

    move-result v3

    if-nez v3, :cond_9

    invoke-interface {v5}, LT/l;->f()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v3, v13}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_a

    :cond_9
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v5, v3}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v5, v3, v1}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_a
    invoke-virtual/range {v16 .. v16}, LE0/g$a;->f()Lmh/p;

    move-result-object v1

    invoke-static {v5, v2, v1}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v1, Lz/Z;->a:Lz/Z;

    sget-object v2, Laf/z;->a:Laf/z;

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-interface {v1, v0, v3, v8}, Lz/Y;->a(Landroidx/compose/ui/e;FZ)Landroidx/compose/ui/e;

    move-result-object v1

    new-instance v3, Ls9/d$b;

    sget v0, Lm8/c;->z1:I

    invoke-direct {v3, v0}, Ls9/d$b;-><init>(I)V

    const/16 v4, 0x180

    const/4 v5, 0x0

    move-object v0, v2

    move-object v2, v3

    move-object/from16 v3, p1

    invoke-virtual/range {v0 .. v5}, Laf/z;->b(Landroidx/compose/ui/e;Ls9/d;LT/l;II)V

    const/4 v0, 0x0

    invoke-static {v7, v10, v0, v8}, LEe/K;->b(Landroidx/compose/ui/e;LT/l;II)V

    invoke-interface/range {p1 .. p1}, LT/l;->R()V

    instance-of v1, v12, Laf/B$a;

    new-instance v0, Laf/H$b$a;

    invoke-direct {v0, v12}, Laf/H$b$a;-><init>(Laf/B;)V

    const v2, -0x5b7aa920

    invoke-static {v2, v8, v0, v10, v9}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v7

    const v8, 0x180006

    const/16 v9, 0x1e

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, v6

    move-object v6, v7

    move-object/from16 v7, p1

    invoke-static/range {v0 .. v9}, Lq/d;->d(Lz/j;ZLandroidx/compose/ui/e;Landroidx/compose/animation/i;Landroidx/compose/animation/k;Ljava/lang/String;Lmh/q;LT/l;II)V

    invoke-interface/range {p1 .. p1}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-static {}, LT/o;->P()V

    :cond_b
    :goto_3
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Laf/H$b;->a(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
