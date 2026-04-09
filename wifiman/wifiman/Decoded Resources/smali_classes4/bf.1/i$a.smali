.class final Lbf/i$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lbf/i;->e(Landroidx/compose/ui/e;Lbf/e;ZLbf/a;Lmh/l;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lbf/i$a$d;
    }
.end annotation


# instance fields
.field final synthetic a:Lbf/a;

.field final synthetic b:Z

.field final synthetic c:Lbf/e;

.field final synthetic d:Lmh/l;


# direct methods
.method constructor <init>(Lbf/a;ZLbf/e;Lmh/l;)V
    .locals 0

    iput-object p1, p0, Lbf/i$a;->a:Lbf/a;

    iput-boolean p2, p0, Lbf/i$a;->b:Z

    iput-object p3, p0, Lbf/i$a;->c:Lbf/e;

    iput-object p4, p0, Lbf/i$a;->d:Lmh/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LT/l;I)V
    .locals 34

    move-object/from16 v0, p0

    move-object/from16 v14, p1

    move/from16 v1, p2

    and-int/lit8 v2, v1, 0x3

    const/4 v12, 0x2

    if-ne v2, v12, :cond_1

    invoke-interface/range {p1 .. p1}, LT/l;->v()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface/range {p1 .. p1}, LT/l;->C()V

    goto/16 :goto_8

    :cond_1
    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, -0x1

    const-string v3, "com.ui.wifiman.ui.speed.hosts.NetworkHostlistItem.<anonymous> (NetworkHostListItem.kt:91)"

    const v4, 0x7daf675f

    invoke-static {v4, v1, v2, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    sget-object v13, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/4 v11, 0x0

    const/4 v15, 0x1

    const/4 v10, 0x0

    invoke-static {v13, v11, v15, v10}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    sget-object v9, Lz/c;->a:Lz/c;

    invoke-virtual {v9}, Lz/c;->b()Lz/c$f;

    move-result-object v2

    iget-object v3, v0, Lbf/i$a;->a:Lbf/a;

    iget-boolean v8, v0, Lbf/i$a;->b:Z

    iget-object v7, v0, Lbf/i$a;->c:Lbf/e;

    iget-object v6, v0, Lbf/i$a;->d:Lmh/l;

    sget-object v16, Lf0/c;->a:Lf0/c$a;

    invoke-virtual/range {v16 .. v16}, Lf0/c$a;->k()Lf0/c$b;

    move-result-object v4

    const/4 v5, 0x6

    invoke-static {v2, v4, v14, v5}, Lz/h;->a(Lz/c$m;Lf0/c$b;LT/l;I)LC0/C;

    move-result-object v2

    const/4 v4, 0x0

    invoke-static {v14, v4}, LT/j;->a(LT/l;I)I

    move-result v17

    invoke-interface/range {p1 .. p1}, LT/l;->G()LT/x;

    move-result-object v4

    invoke-static {v14, v1}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v1

    sget-object v18, LE0/g;->K:LE0/g$a;

    invoke-virtual/range {v18 .. v18}, LE0/g$a;->a()Lmh/a;

    move-result-object v5

    invoke-interface/range {p1 .. p1}, LT/l;->x()LT/f;

    move-result-object v20

    if-nez v20, :cond_3

    invoke-static {}, LT/j;->c()V

    :cond_3
    invoke-interface/range {p1 .. p1}, LT/l;->u()V

    invoke-interface/range {p1 .. p1}, LT/l;->o()Z

    move-result v20

    if-eqz v20, :cond_4

    invoke-interface {v14, v5}, LT/l;->D(Lmh/a;)V

    goto :goto_1

    :cond_4
    invoke-interface/range {p1 .. p1}, LT/l;->I()V

    :goto_1
    invoke-static/range {p1 .. p1}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v5

    invoke-virtual/range {v18 .. v18}, LE0/g$a;->e()Lmh/p;

    move-result-object v10

    invoke-static {v5, v2, v10}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v18 .. v18}, LE0/g$a;->g()Lmh/p;

    move-result-object v2

    invoke-static {v5, v4, v2}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v18 .. v18}, LE0/g$a;->b()Lmh/p;

    move-result-object v2

    invoke-interface {v5}, LT/l;->o()Z

    move-result v4

    if-nez v4, :cond_5

    invoke-interface {v5}, LT/l;->f()Ljava/lang/Object;

    move-result-object v4

    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v4, v10}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_6

    :cond_5
    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v5, v4}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v5, v4, v2}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_6
    invoke-virtual/range {v18 .. v18}, LE0/g$a;->f()Lmh/p;

    move-result-object v2

    invoke-static {v5, v1, v2}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v27, Lz/k;->a:Lz/k;

    sget-object v1, Lbf/i$a$d;->a:[I

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v1, v1, v2

    const/4 v10, 0x4

    if-eq v1, v15, :cond_9

    if-eq v1, v12, :cond_9

    const/4 v2, 0x3

    if-eq v1, v2, :cond_8

    if-eq v1, v10, :cond_8

    const/4 v2, 0x5

    if-ne v1, v2, :cond_7

    goto :goto_2

    :cond_7
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :cond_8
    :goto_2
    const/4 v2, 0x0

    goto :goto_3

    :cond_9
    move v2, v15

    :goto_3
    sget-object v28, Lbf/b;->a:Lbf/b;

    invoke-virtual/range {v28 .. v28}, Lbf/b;->a()Lmh/q;

    move-result-object v17

    const v21, 0x180006

    const/16 v22, 0x1e

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/16 v23, 0x0

    move-object/from16 v1, v27

    move-object/from16 v31, v6

    move-object/from16 v6, v23

    move-object/from16 p2, v7

    move-object/from16 v7, v17

    move/from16 v32, v8

    move-object/from16 v8, p1

    move-object/from16 v33, v9

    move/from16 v9, v21

    const/4 v15, 0x0

    move/from16 v10, v22

    invoke-static/range {v1 .. v10}, Lq/d;->d(Lz/j;ZLandroidx/compose/ui/e;Landroidx/compose/animation/i;Landroidx/compose/animation/k;Ljava/lang/String;Lmh/q;LT/l;II)V

    const/16 v1, 0x3c

    int-to-float v1, v1

    invoke-static {v1}, LY0/h;->j(F)F

    move-result v1

    invoke-static {v13, v1, v11, v12, v15}, Landroidx/compose/foundation/layout/r;->k(Landroidx/compose/ui/e;FFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    const/4 v2, 0x1

    invoke-static {v1, v11, v2, v15}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    const/16 v2, 0x10

    int-to-float v2, v2

    invoke-static {v2}, LY0/h;->j(F)F

    move-result v3

    const/4 v4, 0x4

    int-to-float v4, v4

    invoke-static {v4}, LY0/h;->j(F)F

    move-result v4

    invoke-static {v1, v3, v4}, Landroidx/compose/foundation/layout/o;->j(Landroidx/compose/ui/e;FF)Landroidx/compose/ui/e;

    move-result-object v1

    invoke-static {v2}, LY0/h;->j(F)F

    move-result v2

    move-object/from16 v15, v33

    invoke-virtual {v15, v2}, Lz/c;->n(F)Lz/c$f;

    move-result-object v2

    invoke-virtual/range {v16 .. v16}, Lf0/c$a;->i()Lf0/c$c;

    move-result-object v3

    const/16 v11, 0x36

    invoke-static {v2, v3, v14, v11}, Lz/W;->b(Lz/c$e;Lf0/c$c;LT/l;I)LC0/C;

    move-result-object v2

    const/4 v10, 0x0

    invoke-static {v14, v10}, LT/j;->a(LT/l;I)I

    move-result v3

    invoke-interface/range {p1 .. p1}, LT/l;->G()LT/x;

    move-result-object v4

    invoke-static {v14, v1}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v1

    invoke-virtual/range {v18 .. v18}, LE0/g$a;->a()Lmh/a;

    move-result-object v5

    invoke-interface/range {p1 .. p1}, LT/l;->x()LT/f;

    move-result-object v6

    if-nez v6, :cond_a

    invoke-static {}, LT/j;->c()V

    :cond_a
    invoke-interface/range {p1 .. p1}, LT/l;->u()V

    invoke-interface/range {p1 .. p1}, LT/l;->o()Z

    move-result v6

    if-eqz v6, :cond_b

    invoke-interface {v14, v5}, LT/l;->D(Lmh/a;)V

    goto :goto_4

    :cond_b
    invoke-interface/range {p1 .. p1}, LT/l;->I()V

    :goto_4
    invoke-static/range {p1 .. p1}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v5

    invoke-virtual/range {v18 .. v18}, LE0/g$a;->e()Lmh/p;

    move-result-object v6

    invoke-static {v5, v2, v6}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v18 .. v18}, LE0/g$a;->g()Lmh/p;

    move-result-object v2

    invoke-static {v5, v4, v2}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v18 .. v18}, LE0/g$a;->b()Lmh/p;

    move-result-object v2

    invoke-interface {v5}, LT/l;->o()Z

    move-result v4

    if-nez v4, :cond_c

    invoke-interface {v5}, LT/l;->f()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v4, v6}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_d

    :cond_c
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v5, v4}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v5, v3, v2}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_d
    invoke-virtual/range {v18 .. v18}, LE0/g$a;->f()Lmh/p;

    move-result-object v2

    invoke-static {v5, v1, v2}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v9, Lz/Z;->a:Lz/Z;

    if-eqz v32, :cond_e

    invoke-virtual/range {p2 .. p2}, Lbf/e;->d()Z

    move-result v1

    if-eqz v1, :cond_e

    const/4 v2, 0x1

    goto :goto_5

    :cond_e
    move v2, v10

    :goto_5
    new-instance v1, Lbf/i$a$a;

    move-object/from16 v8, p2

    move-object/from16 v3, v31

    invoke-direct {v1, v3, v8}, Lbf/i$a$a;-><init>(Lmh/l;Lbf/e;)V

    const v3, -0x1e074aef

    const/4 v4, 0x1

    invoke-static {v3, v4, v1, v14, v11}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v7

    const/16 v19, 0x1e

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const v29, 0x180006

    move-object v1, v9

    move-object/from16 v8, p1

    move-object v12, v9

    move/from16 v9, v29

    move/from16 v10, v19

    invoke-static/range {v1 .. v10}, Lq/d;->e(Lz/Y;ZLandroidx/compose/ui/e;Landroidx/compose/animation/i;Landroidx/compose/animation/k;Ljava/lang/String;Lmh/q;LT/l;II)V

    invoke-virtual/range {p2 .. p2}, Lbf/e;->a()Ls9/a;

    move-result-object v1

    const/16 v2, 0x18

    int-to-float v2, v2

    invoke-static {v2}, LY0/h;->j(F)F

    move-result v2

    invoke-static {v13, v2}, Landroidx/compose/foundation/layout/r;->v(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v2

    const/16 v10, 0x30

    const/16 v19, 0x3e

    const/4 v6, 0x0

    const-wide/16 v7, 0x0

    move-object/from16 v9, p1

    move v0, v11

    move/from16 v11, v19

    invoke-static/range {v1 .. v11}, LBe/w;->b(Ls9/a;Landroidx/compose/ui/e;Ls9/a$b;Ls9/a$b;Ljava/lang/String;FJLT/l;II)V

    const/high16 v1, 0x3f800000    # 1.0f

    const/4 v10, 0x1

    invoke-interface {v12, v13, v1, v10}, Lz/Y;->a(Landroidx/compose/ui/e;FZ)Landroidx/compose/ui/e;

    move-result-object v1

    const/4 v2, 0x2

    int-to-float v2, v2

    invoke-static {v2}, LY0/h;->j(F)F

    move-result v2

    invoke-virtual {v15, v2}, Lz/c;->n(F)Lz/c$f;

    move-result-object v2

    invoke-virtual/range {v16 .. v16}, Lf0/c$a;->k()Lf0/c$b;

    move-result-object v3

    const/4 v4, 0x6

    invoke-static {v2, v3, v14, v4}, Lz/h;->a(Lz/c$m;Lf0/c$b;LT/l;I)LC0/C;

    move-result-object v2

    const/4 v15, 0x0

    invoke-static {v14, v15}, LT/j;->a(LT/l;I)I

    move-result v3

    invoke-interface/range {p1 .. p1}, LT/l;->G()LT/x;

    move-result-object v4

    invoke-static {v14, v1}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v1

    invoke-virtual/range {v18 .. v18}, LE0/g$a;->a()Lmh/a;

    move-result-object v5

    invoke-interface/range {p1 .. p1}, LT/l;->x()LT/f;

    move-result-object v6

    if-nez v6, :cond_f

    invoke-static {}, LT/j;->c()V

    :cond_f
    invoke-interface/range {p1 .. p1}, LT/l;->u()V

    invoke-interface/range {p1 .. p1}, LT/l;->o()Z

    move-result v6

    if-eqz v6, :cond_10

    invoke-interface {v14, v5}, LT/l;->D(Lmh/a;)V

    goto :goto_6

    :cond_10
    invoke-interface/range {p1 .. p1}, LT/l;->I()V

    :goto_6
    invoke-static/range {p1 .. p1}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v5

    invoke-virtual/range {v18 .. v18}, LE0/g$a;->e()Lmh/p;

    move-result-object v6

    invoke-static {v5, v2, v6}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v18 .. v18}, LE0/g$a;->g()Lmh/p;

    move-result-object v2

    invoke-static {v5, v4, v2}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v18 .. v18}, LE0/g$a;->b()Lmh/p;

    move-result-object v2

    invoke-interface {v5}, LT/l;->o()Z

    move-result v4

    if-nez v4, :cond_11

    invoke-interface {v5}, LT/l;->f()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v4, v6}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_12

    :cond_11
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v5, v4}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v5, v3, v2}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_12
    invoke-virtual/range {v18 .. v18}, LE0/g$a;->f()Lmh/p;

    move-result-object v2

    invoke-static {v5, v1, v2}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {p2 .. p2}, Lbf/e;->g()Ls9/d;

    move-result-object v1

    invoke-static {v1, v14, v15}, Lsa/a;->a(Ls9/d;LT/l;I)LL0/d;

    move-result-object v1

    sget-object v2, Lla/a;->a:Lla/a;

    sget v3, Lla/a;->b:I

    invoke-virtual {v2, v14, v3}, Lla/a;->c(LT/l;I)Lpa/c;

    move-result-object v4

    invoke-virtual {v4}, Lpa/c;->a()Lpa/b;

    move-result-object v4

    invoke-virtual {v4}, Lpa/b;->b()LL0/U;

    move-result-object v22

    invoke-virtual {v2, v14, v3}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v2

    invoke-virtual {v2}, Lma/a;->f()Lma/a$f;

    move-result-object v2

    invoke-virtual {v2}, Lma/a$f;->a()J

    move-result-wide v3

    const/16 v25, 0x0

    const v26, 0x1fffa

    const/4 v2, 0x0

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const-wide/16 v16, 0x0

    move/from16 v18, v10

    move-wide/from16 v10, v16

    const/4 v13, 0x0

    move-object/from16 v30, v12

    move-object v12, v13

    move/from16 v31, v15

    move-wide/from16 v14, v16

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v24, 0x0

    move-object/from16 v23, p1

    invoke-static/range {v1 .. v26}, LN/a1;->c(LL0/d;Landroidx/compose/ui/e;JJLQ0/v;LQ0/A;LQ0/k;JLW0/k;LW0/j;JIZIILjava/util/Map;Lmh/l;LL0/U;LT/l;III)V

    invoke-virtual/range {p2 .. p2}, Lbf/e;->f()Ls9/d;

    move-result-object v1

    if-eqz v1, :cond_13

    const/4 v2, 0x1

    goto :goto_7

    :cond_13
    move/from16 v2, v31

    :goto_7
    new-instance v1, Lbf/i$a$b;

    move-object/from16 v11, p2

    invoke-direct {v1, v11}, Lbf/i$a$b;-><init>(Lbf/e;)V

    const v3, -0x7b007df9

    move-object/from16 v12, p1

    const/4 v13, 0x1

    invoke-static {v3, v13, v1, v12, v0}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v7

    const v9, 0x180006

    const/16 v10, 0x1e

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object/from16 v1, v27

    move-object/from16 v8, p1

    invoke-static/range {v1 .. v10}, Lq/d;->d(Lz/j;ZLandroidx/compose/ui/e;Landroidx/compose/animation/i;Landroidx/compose/animation/k;Ljava/lang/String;Lmh/q;LT/l;II)V

    invoke-interface/range {p1 .. p1}, LT/l;->R()V

    xor-int/lit8 v2, v32, 0x1

    new-instance v1, Lbf/i$a$c;

    invoke-direct {v1, v11}, Lbf/i$a$c;-><init>(Lbf/e;)V

    const v3, 0x15a4a288

    invoke-static {v3, v13, v1, v12, v0}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v7

    const/16 v10, 0x1e

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object/from16 v1, v30

    move-object/from16 v8, p1

    move/from16 v9, v29

    invoke-static/range {v1 .. v10}, Lq/d;->e(Lz/Y;ZLandroidx/compose/ui/e;Landroidx/compose/animation/i;Landroidx/compose/animation/k;Ljava/lang/String;Lmh/q;LT/l;II)V

    invoke-virtual/range {v28 .. v28}, Lbf/b;->b()Lmh/q;

    move-result-object v7

    move/from16 v2, v32

    invoke-static/range {v1 .. v10}, Lq/d;->e(Lz/Y;ZLandroidx/compose/ui/e;Landroidx/compose/animation/i;Landroidx/compose/animation/k;Ljava/lang/String;Lmh/q;LT/l;II)V

    invoke-interface/range {p1 .. p1}, LT/l;->R()V

    invoke-interface/range {p1 .. p1}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_14

    invoke-static {}, LT/o;->P()V

    :cond_14
    :goto_8
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lbf/i$a;->a(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
