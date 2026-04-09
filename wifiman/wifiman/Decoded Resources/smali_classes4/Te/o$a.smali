.class final LTe/o$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LTe/o;->d(Landroidx/compose/ui/e;LTe/k;Lmh/a;Lmh/a;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LTe/k;

.field final synthetic b:Lmh/a;

.field final synthetic c:Lmh/a;


# direct methods
.method constructor <init>(LTe/k;Lmh/a;Lmh/a;)V
    .locals 0

    iput-object p1, p0, LTe/o$a;->a:LTe/k;

    iput-object p2, p0, LTe/o$a;->b:Lmh/a;

    iput-object p3, p0, LTe/o$a;->c:Lmh/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LT/l;I)V
    .locals 41

    move-object/from16 v0, p0

    move-object/from16 v15, p1

    move/from16 v1, p2

    and-int/lit8 v2, v1, 0x3

    const/4 v14, 0x2

    if-ne v2, v14, :cond_1

    invoke-interface/range {p1 .. p1}, LT/l;->v()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface/range {p1 .. p1}, LT/l;->C()V

    goto/16 :goto_3

    :cond_1
    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, -0x1

    const-string v3, "com.ui.wifiman.ui.signal.components.SignalMapperDeviceFoundOverlay.<anonymous> (FloorplanDeviceFoundOverlay.kt:63)"

    const v4, 0x20d0fdc0

    invoke-static {v4, v1, v2, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    sget-object v13, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/4 v12, 0x0

    const/4 v10, 0x1

    const/4 v11, 0x0

    invoke-static {v13, v12, v10, v11}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    sget-object v27, Lf0/c;->a:Lf0/c$a;

    invoke-virtual/range {v27 .. v27}, Lf0/c$a;->g()Lf0/c$b;

    move-result-object v2

    iget-object v8, v0, LTe/o$a;->a:LTe/k;

    iget-object v9, v0, LTe/o$a;->b:Lmh/a;

    iget-object v6, v0, LTe/o$a;->c:Lmh/a;

    sget-object v7, Lz/c;->a:Lz/c;

    invoke-virtual {v7}, Lz/c;->g()Lz/c$m;

    move-result-object v3

    const/16 v4, 0x30

    invoke-static {v3, v2, v15, v4}, Lz/h;->a(Lz/c$m;Lf0/c$b;LT/l;I)LC0/C;

    move-result-object v2

    const/4 v4, 0x0

    invoke-static {v15, v4}, LT/j;->a(LT/l;I)I

    move-result v3

    invoke-interface/range {p1 .. p1}, LT/l;->G()LT/x;

    move-result-object v5

    invoke-static {v15, v1}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v1

    sget-object v28, LE0/g;->K:LE0/g$a;

    invoke-virtual/range {v28 .. v28}, LE0/g$a;->a()Lmh/a;

    move-result-object v4

    invoke-interface/range {p1 .. p1}, LT/l;->x()LT/f;

    move-result-object v16

    if-nez v16, :cond_3

    invoke-static {}, LT/j;->c()V

    :cond_3
    invoke-interface/range {p1 .. p1}, LT/l;->u()V

    invoke-interface/range {p1 .. p1}, LT/l;->o()Z

    move-result v16

    if-eqz v16, :cond_4

    invoke-interface {v15, v4}, LT/l;->D(Lmh/a;)V

    goto :goto_1

    :cond_4
    invoke-interface/range {p1 .. p1}, LT/l;->I()V

    :goto_1
    invoke-static/range {p1 .. p1}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v4

    invoke-virtual/range {v28 .. v28}, LE0/g$a;->e()Lmh/p;

    move-result-object v14

    invoke-static {v4, v2, v14}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v28 .. v28}, LE0/g$a;->g()Lmh/p;

    move-result-object v2

    invoke-static {v4, v5, v2}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v28 .. v28}, LE0/g$a;->b()Lmh/p;

    move-result-object v2

    invoke-interface {v4}, LT/l;->o()Z

    move-result v5

    if-nez v5, :cond_5

    invoke-interface {v4}, LT/l;->f()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v5, v14}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_6

    :cond_5
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v4, v5}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v4, v3, v2}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_6
    invoke-virtual/range {v28 .. v28}, LE0/g$a;->f()Lmh/p;

    move-result-object v2

    invoke-static {v4, v1, v2}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v1, Lz/k;->a:Lz/k;

    invoke-static {v13, v12, v10, v11}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    new-instance v2, LTe/o$a$a;

    invoke-direct {v2, v9}, LTe/o$a$a;-><init>(Lmh/a;)V

    const v3, -0x1fb2185a

    const/16 v14, 0x36

    invoke-static {v3, v10, v2, v15, v14}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v5

    const/16 v17, 0x0

    const/16 v18, 0x7ee

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const-wide/16 v19, 0x0

    move-object/from16 v30, v6

    move-object/from16 v31, v7

    move-wide/from16 v6, v19

    move-object/from16 v32, v8

    move-object/from16 v33, v9

    move-wide/from16 v8, v19

    move-wide/from16 v10, v19

    const/16 v19, 0x0

    move/from16 v12, v19

    const/16 v19, 0x0

    move-object/from16 v36, v13

    move-object/from16 v13, v19

    const/16 v19, 0x0

    move/from16 v14, v19

    const/16 v16, 0x6006

    move-object v0, v15

    move-object/from16 v15, p1

    invoke-static/range {v1 .. v18}, LL9/E;->i(Landroidx/compose/ui/e;Ljava/lang/String;LL9/d;Lmh/a;Lmh/q;JJJFLz/N;FLT/l;III)V

    invoke-virtual/range {v32 .. v32}, LTe/k;->a()Ls9/a;

    move-result-object v1

    const/16 v2, 0x8c

    int-to-float v2, v2

    invoke-static {v2}, LY0/h;->j(F)F

    move-result v2

    move-object/from16 v14, v36

    invoke-static {v14, v2}, Landroidx/compose/foundation/layout/r;->v(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v2

    const/16 v10, 0x30

    const/16 v11, 0x3e

    const/4 v5, 0x0

    const/4 v6, 0x0

    const-wide/16 v7, 0x0

    move-object/from16 v9, p1

    invoke-static/range {v1 .. v11}, LBe/w;->b(Ls9/a;Landroidx/compose/ui/e;Ls9/a$b;Ls9/a$b;Ljava/lang/String;FJLT/l;II)V

    const/16 v1, 0x8

    int-to-float v15, v1

    invoke-static {v15}, LY0/h;->j(F)F

    move-result v1

    invoke-static {v14, v1}, Landroidx/compose/foundation/layout/r;->i(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v1

    const/4 v12, 0x6

    invoke-static {v1, v0, v12}, Lz/a0;->a(Landroidx/compose/ui/e;LT/l;I)V

    const/16 v1, 0x10

    int-to-float v10, v1

    invoke-static {v10}, LY0/h;->j(F)F

    move-result v1

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x2

    invoke-static {v14, v1, v9, v11, v8}, Landroidx/compose/foundation/layout/o;->k(Landroidx/compose/ui/e;FFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v2

    invoke-virtual/range {v32 .. v32}, LTe/k;->c()Ls9/d;

    move-result-object v1

    const/4 v7, 0x0

    invoke-static {v1, v0, v7}, Lsa/a;->a(Ls9/d;LT/l;I)LL0/d;

    move-result-object v1

    sget-object v5, Lla/a;->a:Lla/a;

    sget v6, Lla/a;->b:I

    invoke-virtual {v5, v0, v6}, Lla/a;->c(LT/l;I)Lpa/c;

    move-result-object v3

    invoke-virtual {v3}, Lpa/c;->a()Lpa/b;

    move-result-object v3

    invoke-virtual {v3}, Lpa/b;->b()LL0/U;

    move-result-object v22

    invoke-virtual {v5, v0, v6}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v3

    invoke-virtual {v3}, Lma/a;->f()Lma/a$f;

    move-result-object v3

    invoke-virtual {v3}, Lma/a$f;->a()J

    move-result-wide v3

    sget-object v29, LW0/j;->b:LW0/j$a;

    invoke-virtual/range {v29 .. v29}, LW0/j$a;->a()I

    move-result v13

    invoke-static {v13}, LW0/j;->h(I)LW0/j;

    move-result-object v13

    const/16 v25, 0x0

    const v26, 0x1fdf8

    const-wide/16 v16, 0x0

    move-object/from16 v37, v5

    move/from16 v38, v6

    move-wide/from16 v5, v16

    const/16 v16, 0x0

    move-object/from16 v7, v16

    move-object/from16 v8, v16

    move-object/from16 v9, v16

    const-wide/16 v16, 0x0

    move/from16 v34, v10

    move-wide/from16 v10, v16

    const/16 v16, 0x0

    move-object/from16 v12, v16

    const-wide/16 v16, 0x0

    move-object/from16 v39, v14

    move/from16 v35, v15

    move-wide/from16 v14, v16

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v24, 0x30

    move-object/from16 v23, p1

    invoke-static/range {v1 .. v26}, LN/a1;->c(LL0/d;Landroidx/compose/ui/e;JJLQ0/v;LQ0/A;LQ0/k;JLW0/k;LW0/j;JIZIILjava/util/Map;Lmh/l;LL0/U;LT/l;III)V

    const/4 v1, 0x2

    int-to-float v2, v1

    invoke-static {v2}, LY0/h;->j(F)F

    move-result v2

    move-object/from16 v14, v39

    invoke-static {v14, v2}, Landroidx/compose/foundation/layout/r;->i(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v2

    const/4 v3, 0x6

    invoke-static {v2, v0, v3}, Lz/a0;->a(Landroidx/compose/ui/e;LT/l;I)V

    invoke-static/range {v34 .. v34}, LY0/h;->j(F)F

    move-result v2

    const/4 v12, 0x0

    const/4 v15, 0x0

    invoke-static {v14, v2, v15, v1, v12}, Landroidx/compose/foundation/layout/o;->k(Landroidx/compose/ui/e;FFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v2

    invoke-virtual/range {v32 .. v32}, LTe/k;->b()Ls9/d;

    move-result-object v1

    const/4 v10, 0x0

    invoke-static {v1, v0, v10}, Lsa/a;->a(Ls9/d;LT/l;I)LL0/d;

    move-result-object v1

    move-object/from16 v3, v37

    move/from16 v4, v38

    invoke-virtual {v3, v0, v4}, Lla/a;->c(LT/l;I)Lpa/c;

    move-result-object v3

    invoke-virtual {v3}, Lpa/c;->b()Lpa/b;

    move-result-object v3

    invoke-virtual {v3}, Lpa/b;->a()LL0/U;

    move-result-object v22

    invoke-virtual/range {v29 .. v29}, LW0/j$a;->a()I

    move-result v3

    invoke-static {v3}, LW0/j;->h(I)LW0/j;

    move-result-object v13

    const v26, 0x1fdfc

    const-wide/16 v3, 0x0

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const-wide/16 v16, 0x0

    move-wide/from16 v10, v16

    const/16 v16, 0x0

    move-object/from16 v12, v16

    const-wide/16 v16, 0x0

    move-object/from16 v40, v14

    move-wide/from16 v14, v16

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-static/range {v1 .. v26}, LN/a1;->c(LL0/d;Landroidx/compose/ui/e;JJLQ0/v;LQ0/A;LQ0/k;JLW0/k;LW0/j;JIZIILjava/util/Map;Lmh/l;LL0/U;LT/l;III)V

    move-object/from16 v10, v40

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v11, 0x1

    invoke-static {v10, v1, v11, v2}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    invoke-static/range {v34 .. v34}, LY0/h;->j(F)F

    move-result v2

    invoke-static/range {v35 .. v35}, LY0/h;->j(F)F

    move-result v3

    invoke-static {v1, v2, v3}, Landroidx/compose/foundation/layout/o;->j(Landroidx/compose/ui/e;FF)Landroidx/compose/ui/e;

    move-result-object v1

    invoke-static/range {v34 .. v34}, LY0/h;->j(F)F

    move-result v2

    move-object/from16 v3, v31

    invoke-virtual {v3, v2}, Lz/c;->n(F)Lz/c$f;

    move-result-object v2

    invoke-virtual/range {v27 .. v27}, Lf0/c$a;->i()Lf0/c$c;

    move-result-object v3

    const/16 v4, 0x36

    invoke-static {v2, v3, v0, v4}, Lz/W;->b(Lz/c$e;Lf0/c$c;LT/l;I)LC0/C;

    move-result-object v2

    const/4 v12, 0x0

    invoke-static {v0, v12}, LT/j;->a(LT/l;I)I

    move-result v3

    invoke-interface/range {p1 .. p1}, LT/l;->G()LT/x;

    move-result-object v4

    invoke-static {v0, v1}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v1

    invoke-virtual/range {v28 .. v28}, LE0/g$a;->a()Lmh/a;

    move-result-object v5

    invoke-interface/range {p1 .. p1}, LT/l;->x()LT/f;

    move-result-object v6

    if-nez v6, :cond_7

    invoke-static {}, LT/j;->c()V

    :cond_7
    invoke-interface/range {p1 .. p1}, LT/l;->u()V

    invoke-interface/range {p1 .. p1}, LT/l;->o()Z

    move-result v6

    if-eqz v6, :cond_8

    invoke-interface {v0, v5}, LT/l;->D(Lmh/a;)V

    goto :goto_2

    :cond_8
    invoke-interface/range {p1 .. p1}, LT/l;->I()V

    :goto_2
    invoke-static/range {p1 .. p1}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v5

    invoke-virtual/range {v28 .. v28}, LE0/g$a;->e()Lmh/p;

    move-result-object v6

    invoke-static {v5, v2, v6}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v28 .. v28}, LE0/g$a;->g()Lmh/p;

    move-result-object v2

    invoke-static {v5, v4, v2}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v28 .. v28}, LE0/g$a;->b()Lmh/p;

    move-result-object v2

    invoke-interface {v5}, LT/l;->o()Z

    move-result v4

    if-nez v4, :cond_9

    invoke-interface {v5}, LT/l;->f()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v4, v6}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_a

    :cond_9
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v5, v4}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v5, v3, v2}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_a
    invoke-virtual/range {v28 .. v28}, LE0/g$a;->f()Lmh/p;

    move-result-object v2

    invoke-static {v5, v1, v2}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v13, Lz/Z;->a:Lz/Z;

    const/high16 v14, 0x3f800000    # 1.0f

    invoke-interface {v13, v10, v14, v11}, Lz/Y;->a(Landroidx/compose/ui/e;FZ)Landroidx/compose/ui/e;

    move-result-object v1

    sget v2, Lm8/c;->J0:I

    invoke-static {v2, v0, v12}, LH0/f;->a(ILT/l;I)Ljava/lang/String;

    move-result-object v6

    const/4 v8, 0x0

    const/16 v9, 0x1c

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object/from16 v2, v33

    move-object/from16 v7, p1

    invoke-static/range {v1 .. v9}, Lw9/t;->b(Landroidx/compose/ui/e;Lmh/a;ZZLs9/b;Ljava/lang/String;LT/l;II)V

    invoke-interface {v13, v10, v14, v11}, Lz/Y;->a(Landroidx/compose/ui/e;FZ)Landroidx/compose/ui/e;

    move-result-object v1

    sget v2, Lm8/c;->f:I

    invoke-static {v2, v0, v12}, LH0/f;->a(ILT/l;I)Ljava/lang/String;

    move-result-object v7

    const/4 v10, 0x0

    const/16 v11, 0xbc

    const/4 v6, 0x0

    const/4 v8, 0x0

    move-object/from16 v2, v30

    move-object/from16 v9, p1

    invoke-static/range {v1 .. v11}, Lw9/r;->b(Landroidx/compose/ui/e;Lmh/a;ZZLs9/b;Lw9/p;Ljava/lang/String;LL0/U;LT/l;II)V

    invoke-interface/range {p1 .. p1}, LT/l;->R()V

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

    invoke-virtual {p0, p1, p2}, LTe/o$a;->a(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
