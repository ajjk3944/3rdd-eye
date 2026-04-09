.class final LTe/D$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LTe/D;->n(Landroidx/compose/ui/e;LTe/W;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LTe/W;


# direct methods
.method constructor <init>(LTe/W;)V
    .locals 0

    iput-object p1, p0, LTe/D$a;->a:LTe/W;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LT/l;I)V
    .locals 24

    move-object/from16 v0, p1

    move/from16 v1, p2

    const/4 v2, 0x1

    and-int/lit8 v3, v1, 0x3

    const/4 v4, 0x2

    if-ne v3, v4, :cond_1

    invoke-interface/range {p1 .. p1}, LT/l;->v()Z

    move-result v3

    if-nez v3, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface/range {p1 .. p1}, LT/l;->C()V

    move-object/from16 v13, p0

    goto/16 :goto_7

    :cond_1
    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result v3

    if-eqz v3, :cond_2

    const/4 v3, -0x1

    const-string v5, "com.ui.wifiman.ui.signal.components.SignalMapperScale.<anonymous> (FloorplanScale.kt:96)"

    const v6, -0x32c2fb08

    invoke-static {v6, v1, v3, v5}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    sget-object v1, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/4 v3, 0x0

    const/4 v5, 0x0

    invoke-static {v1, v3, v2, v5}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v6

    move-object/from16 v13, p0

    iget-object v14, v13, LTe/D$a;->a:LTe/W;

    sget-object v15, Lz/c;->a:Lz/c;

    invoke-virtual {v15}, Lz/c;->f()Lz/c$e;

    move-result-object v7

    sget-object v16, Lf0/c;->a:Lf0/c$a;

    invoke-virtual/range {v16 .. v16}, Lf0/c$a;->l()Lf0/c$c;

    move-result-object v8

    const/4 v12, 0x0

    invoke-static {v7, v8, v0, v12}, Lz/W;->b(Lz/c$e;Lf0/c$c;LT/l;I)LC0/C;

    move-result-object v7

    invoke-static {v0, v12}, LT/j;->a(LT/l;I)I

    move-result v8

    invoke-interface/range {p1 .. p1}, LT/l;->G()LT/x;

    move-result-object v9

    invoke-static {v0, v6}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v6

    sget-object v17, LE0/g;->K:LE0/g$a;

    invoke-virtual/range {v17 .. v17}, LE0/g$a;->a()Lmh/a;

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

    invoke-interface {v0, v10}, LT/l;->D(Lmh/a;)V

    goto :goto_1

    :cond_4
    invoke-interface/range {p1 .. p1}, LT/l;->I()V

    :goto_1
    invoke-static/range {p1 .. p1}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v10

    invoke-virtual/range {v17 .. v17}, LE0/g$a;->e()Lmh/p;

    move-result-object v11

    invoke-static {v10, v7, v11}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v17 .. v17}, LE0/g$a;->g()Lmh/p;

    move-result-object v7

    invoke-static {v10, v9, v7}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v17 .. v17}, LE0/g$a;->b()Lmh/p;

    move-result-object v7

    invoke-interface {v10}, LT/l;->o()Z

    move-result v9

    if-nez v9, :cond_5

    invoke-interface {v10}, LT/l;->f()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v9, v11}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_6

    :cond_5
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-interface {v10, v9}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-interface {v10, v8, v7}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_6
    invoke-virtual/range {v17 .. v17}, LE0/g$a;->f()Lmh/p;

    move-result-object v7

    invoke-static {v10, v6, v7}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v6, Lz/Z;->a:Lz/Z;

    invoke-virtual {v14}, LTe/W;->b()Ljava/util/List;

    move-result-object v7

    invoke-static {v7}, LZg/v;->q0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, LTe/X;

    invoke-virtual {v7}, LTe/X;->b()J

    move-result-wide v8

    const/4 v11, 0x2

    const/16 v18, 0x0

    const/4 v10, 0x0

    move-object v7, v1

    move v2, v12

    move-object/from16 v12, v18

    invoke-static/range {v7 .. v12}, Landroidx/compose/foundation/b;->d(Landroidx/compose/ui/e;JLm0/i1;ILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v7

    const/16 v8, 0x10

    int-to-float v8, v8

    invoke-static {v8}, LY0/h;->j(F)F

    move-result v8

    invoke-static {v7, v8, v3, v4, v5}, Landroidx/compose/foundation/layout/o;->k(Landroidx/compose/ui/e;FFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v4

    invoke-virtual {v14}, LTe/W;->c()Ls9/d;

    move-result-object v7

    invoke-static {v4, v7, v0, v2}, LTe/D;->s(Landroidx/compose/ui/e;Ls9/d;LT/l;I)V

    const/high16 v4, 0x3f800000    # 1.0f

    const/4 v7, 0x1

    invoke-interface {v6, v1, v4, v7}, Lz/Y;->a(Landroidx/compose/ui/e;FZ)Landroidx/compose/ui/e;

    move-result-object v8

    invoke-virtual/range {v16 .. v16}, Lf0/c$a;->o()Lf0/c;

    move-result-object v7

    invoke-static {v7, v2}, Landroidx/compose/foundation/layout/d;->h(Lf0/c;Z)LC0/C;

    move-result-object v7

    invoke-static {v0, v2}, LT/j;->a(LT/l;I)I

    move-result v9

    invoke-interface/range {p1 .. p1}, LT/l;->G()LT/x;

    move-result-object v10

    invoke-static {v0, v8}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v8

    invoke-virtual/range {v17 .. v17}, LE0/g$a;->a()Lmh/a;

    move-result-object v11

    invoke-interface/range {p1 .. p1}, LT/l;->x()LT/f;

    move-result-object v12

    if-nez v12, :cond_7

    invoke-static {}, LT/j;->c()V

    :cond_7
    invoke-interface/range {p1 .. p1}, LT/l;->u()V

    invoke-interface/range {p1 .. p1}, LT/l;->o()Z

    move-result v12

    if-eqz v12, :cond_8

    invoke-interface {v0, v11}, LT/l;->D(Lmh/a;)V

    goto :goto_2

    :cond_8
    invoke-interface/range {p1 .. p1}, LT/l;->I()V

    :goto_2
    invoke-static/range {p1 .. p1}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v11

    invoke-virtual/range {v17 .. v17}, LE0/g$a;->e()Lmh/p;

    move-result-object v12

    invoke-static {v11, v7, v12}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v17 .. v17}, LE0/g$a;->g()Lmh/p;

    move-result-object v7

    invoke-static {v11, v10, v7}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v17 .. v17}, LE0/g$a;->b()Lmh/p;

    move-result-object v7

    invoke-interface {v11}, LT/l;->o()Z

    move-result v10

    if-nez v10, :cond_9

    invoke-interface {v11}, LT/l;->f()Ljava/lang/Object;

    move-result-object v10

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v10, v12}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_a

    :cond_9
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-interface {v11, v10}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-interface {v11, v9, v7}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_a
    invoke-virtual/range {v17 .. v17}, LE0/g$a;->f()Lmh/p;

    move-result-object v7

    invoke-static {v11, v8, v7}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v7, Landroidx/compose/foundation/layout/f;->a:Landroidx/compose/foundation/layout/f;

    const/4 v7, 0x1

    invoke-static {v1, v3, v7, v5}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    invoke-virtual {v15}, Lz/c;->f()Lz/c$e;

    move-result-object v7

    invoke-virtual/range {v16 .. v16}, Lf0/c$a;->l()Lf0/c$c;

    move-result-object v8

    invoke-static {v7, v8, v0, v2}, Lz/W;->b(Lz/c$e;Lf0/c$c;LT/l;I)LC0/C;

    move-result-object v7

    invoke-static {v0, v2}, LT/j;->a(LT/l;I)I

    move-result v8

    invoke-interface/range {p1 .. p1}, LT/l;->G()LT/x;

    move-result-object v9

    invoke-static {v0, v1}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v1

    invoke-virtual/range {v17 .. v17}, LE0/g$a;->a()Lmh/a;

    move-result-object v10

    invoke-interface/range {p1 .. p1}, LT/l;->x()LT/f;

    move-result-object v11

    if-nez v11, :cond_b

    invoke-static {}, LT/j;->c()V

    :cond_b
    invoke-interface/range {p1 .. p1}, LT/l;->u()V

    invoke-interface/range {p1 .. p1}, LT/l;->o()Z

    move-result v11

    if-eqz v11, :cond_c

    invoke-interface {v0, v10}, LT/l;->D(Lmh/a;)V

    goto :goto_3

    :cond_c
    invoke-interface/range {p1 .. p1}, LT/l;->I()V

    :goto_3
    invoke-static/range {p1 .. p1}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v10

    invoke-virtual/range {v17 .. v17}, LE0/g$a;->e()Lmh/p;

    move-result-object v11

    invoke-static {v10, v7, v11}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v17 .. v17}, LE0/g$a;->g()Lmh/p;

    move-result-object v7

    invoke-static {v10, v9, v7}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v17 .. v17}, LE0/g$a;->b()Lmh/p;

    move-result-object v7

    invoke-interface {v10}, LT/l;->o()Z

    move-result v9

    if-nez v9, :cond_d

    invoke-interface {v10}, LT/l;->f()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v9, v11}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_e

    :cond_d
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-interface {v10, v9}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-interface {v10, v8, v7}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_e
    invoke-virtual/range {v17 .. v17}, LE0/g$a;->f()Lmh/p;

    move-result-object v7

    invoke-static {v10, v1, v7}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    const v1, 0x3b1f57e0

    invoke-interface {v0, v1}, LT/l;->U(I)V

    invoke-virtual {v14}, LTe/W;->b()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    move v12, v2

    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_12

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    const/4 v8, 0x1

    add-int/lit8 v9, v12, 0x1

    if-gez v12, :cond_f

    invoke-static {}, LZg/v;->v()V

    :cond_f
    check-cast v7, LTe/X;

    const v8, 0x3b1f5d08

    invoke-interface {v0, v8}, LT/l;->U(I)V

    if-nez v12, :cond_10

    sget-object v19, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/16 v22, 0x2

    const/16 v23, 0x0

    const/high16 v20, 0x3f000000    # 0.5f

    const/16 v21, 0x0

    move-object/from16 v18, v6

    invoke-static/range {v18 .. v23}, Lz/Y;->b(Lz/Y;Landroidx/compose/ui/e;FZILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v8

    new-instance v10, Lm0/j1;

    invoke-virtual {v7}, LTe/X;->b()J

    move-result-wide v3

    invoke-direct {v10, v3, v4, v5}, Lm0/j1;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v8, v10, v0, v2}, LTe/D;->q(Landroidx/compose/ui/e;Lm0/l0;LT/l;I)V

    :cond_10
    invoke-interface/range {p1 .. p1}, LT/l;->J()V

    sget-object v3, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/high16 v4, 0x3f800000    # 1.0f

    const/4 v8, 0x1

    invoke-interface {v6, v3, v4, v8}, Lz/Y;->a(Landroidx/compose/ui/e;FZ)Landroidx/compose/ui/e;

    move-result-object v10

    invoke-static {v10, v7, v0, v2}, LTe/D;->p(Landroidx/compose/ui/e;LTe/X;LT/l;I)V

    const v4, 0x3b1f97d9

    invoke-interface {v0, v4}, LT/l;->U(I)V

    invoke-virtual {v14}, LTe/W;->b()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    sub-int/2addr v4, v8

    if-ne v12, v4, :cond_11

    const/16 v22, 0x2

    const/16 v23, 0x0

    const/high16 v20, 0x3f000000    # 0.5f

    const/16 v21, 0x0

    move-object/from16 v18, v6

    move-object/from16 v19, v3

    invoke-static/range {v18 .. v23}, Lz/Y;->b(Lz/Y;Landroidx/compose/ui/e;FZILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v3

    new-instance v4, Lm0/j1;

    invoke-virtual {v7}, LTe/X;->a()J

    move-result-wide v7

    invoke-direct {v4, v7, v8, v5}, Lm0/j1;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v3, v4, v0, v2}, LTe/D;->q(Landroidx/compose/ui/e;Lm0/l0;LT/l;I)V

    :cond_11
    invoke-interface/range {p1 .. p1}, LT/l;->J()V

    move v12, v9

    const/4 v3, 0x0

    const/high16 v4, 0x3f800000    # 1.0f

    goto :goto_4

    :cond_12
    invoke-interface/range {p1 .. p1}, LT/l;->J()V

    invoke-interface/range {p1 .. p1}, LT/l;->R()V

    sget-object v1, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/4 v3, 0x0

    const/4 v4, 0x1

    invoke-static {v1, v3, v4, v5}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    sget-object v3, Lz/c;->a:Lz/c;

    invoke-virtual {v3}, Lz/c;->f()Lz/c$e;

    move-result-object v3

    sget-object v4, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v4}, Lf0/c$a;->l()Lf0/c$c;

    move-result-object v4

    invoke-static {v3, v4, v0, v2}, Lz/W;->b(Lz/c$e;Lf0/c$c;LT/l;I)LC0/C;

    move-result-object v3

    invoke-static {v0, v2}, LT/j;->a(LT/l;I)I

    move-result v4

    invoke-interface/range {p1 .. p1}, LT/l;->G()LT/x;

    move-result-object v5

    invoke-static {v0, v1}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v1

    sget-object v6, LE0/g;->K:LE0/g$a;

    invoke-virtual {v6}, LE0/g$a;->a()Lmh/a;

    move-result-object v7

    invoke-interface/range {p1 .. p1}, LT/l;->x()LT/f;

    move-result-object v8

    if-nez v8, :cond_13

    invoke-static {}, LT/j;->c()V

    :cond_13
    invoke-interface/range {p1 .. p1}, LT/l;->u()V

    invoke-interface/range {p1 .. p1}, LT/l;->o()Z

    move-result v8

    if-eqz v8, :cond_14

    invoke-interface {v0, v7}, LT/l;->D(Lmh/a;)V

    goto :goto_5

    :cond_14
    invoke-interface/range {p1 .. p1}, LT/l;->I()V

    :goto_5
    invoke-static/range {p1 .. p1}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v7

    invoke-virtual {v6}, LE0/g$a;->e()Lmh/p;

    move-result-object v8

    invoke-static {v7, v3, v8}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v6}, LE0/g$a;->g()Lmh/p;

    move-result-object v3

    invoke-static {v7, v5, v3}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v6}, LE0/g$a;->b()Lmh/p;

    move-result-object v3

    invoke-interface {v7}, LT/l;->o()Z

    move-result v5

    if-nez v5, :cond_15

    invoke-interface {v7}, LT/l;->f()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v5, v8}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_16

    :cond_15
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v7, v5}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v7, v4, v3}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_16
    invoke-virtual {v6}, LE0/g$a;->f()Lmh/p;

    move-result-object v3

    invoke-static {v7, v1, v3}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v1, Lz/Z;->a:Lz/Z;

    const v3, 0x3b1fd24c

    invoke-interface {v0, v3}, LT/l;->U(I)V

    invoke-virtual {v14}, LTe/W;->b()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_6
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_17

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LTe/X;

    sget-object v5, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/high16 v6, 0x3f800000    # 1.0f

    const/4 v7, 0x1

    invoke-interface {v1, v5, v6, v7}, Lz/Y;->a(Landroidx/compose/ui/e;FZ)Landroidx/compose/ui/e;

    move-result-object v5

    invoke-static {v5, v4, v0, v2}, LTe/D;->r(Landroidx/compose/ui/e;LTe/X;LT/l;I)V

    goto :goto_6

    :cond_17
    const/high16 v6, 0x3f800000    # 1.0f

    const/4 v7, 0x1

    invoke-interface/range {p1 .. p1}, LT/l;->J()V

    sget-object v3, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    invoke-interface {v1, v3, v6, v7}, Lz/Y;->a(Landroidx/compose/ui/e;FZ)Landroidx/compose/ui/e;

    move-result-object v1

    new-instance v3, Ls9/d$c;

    invoke-virtual {v14}, LTe/W;->b()Ljava/util/List;

    move-result-object v4

    invoke-static {v4}, LZg/v;->B0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LTe/X;

    invoke-virtual {v4}, LTe/X;->c()Lsh/i;

    move-result-object v4

    invoke-virtual {v4}, Lsh/g;->j()I

    move-result v4

    invoke-static {v4}, Lvf/g;->a(I)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    invoke-static {v1, v3, v0, v2}, LTe/D;->s(Landroidx/compose/ui/e;Ls9/d;LT/l;I)V

    invoke-interface/range {p1 .. p1}, LT/l;->R()V

    invoke-interface/range {p1 .. p1}, LT/l;->R()V

    invoke-interface/range {p1 .. p1}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_18

    invoke-static {}, LT/o;->P()V

    :cond_18
    :goto_7
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LTe/D$a;->a(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
