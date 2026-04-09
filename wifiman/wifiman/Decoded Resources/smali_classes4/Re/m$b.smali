.class final LRe/m$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LRe/m;->c(LRe/a;Lof/a$c;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LRe/a;

.field final synthetic b:Lof/a$c;

.field final synthetic c:LIi/N;


# direct methods
.method constructor <init>(LRe/a;Lof/a$c;LIi/N;)V
    .locals 0

    iput-object p1, p0, LRe/m$b;->a:LRe/a;

    iput-object p2, p0, LRe/m$b;->b:Lof/a$c;

    iput-object p3, p0, LRe/m$b;->c:LIi/N;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lz/N;LT/l;I)V
    .locals 34

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v13, p2

    const-string v2, "scaffoldPadding"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v2, p3, 0x6

    if-nez v2, :cond_1

    invoke-interface {v13, v1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    :goto_0
    or-int v2, p3, v2

    goto :goto_1

    :cond_1
    move/from16 v2, p3

    :goto_1
    and-int/lit8 v3, v2, 0x13

    const/16 v4, 0x12

    if-ne v3, v4, :cond_3

    invoke-interface/range {p2 .. p2}, LT/l;->v()Z

    move-result v3

    if-nez v3, :cond_2

    goto :goto_2

    :cond_2
    invoke-interface/range {p2 .. p2}, LT/l;->C()V

    goto/16 :goto_5

    :cond_3
    :goto_2
    invoke-static {}, LT/o;->H()Z

    move-result v3

    if-eqz v3, :cond_4

    const/4 v3, -0x1

    const-string v4, "com.ui.wifiman.ui.settings.AppSettings.<anonymous> (AppSettingsUi.kt:85)"

    const v5, -0x6ac7e5dd

    invoke-static {v5, v2, v3, v4}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_4
    const/4 v14, 0x0

    const/4 v15, 0x1

    invoke-static {v14, v13, v14, v15}, Landroidx/compose/foundation/m;->a(ILT/l;II)Landroidx/compose/foundation/o;

    move-result-object v3

    sget-object v12, Lla/a;->a:Lla/a;

    sget v11, Lla/a;->b:I

    invoke-virtual {v12, v13, v11}, Lla/a;->d(LT/l;I)Lra/a;

    move-result-object v2

    invoke-virtual {v2}, Lra/a;->a()Lra/b;

    move-result-object v2

    invoke-virtual {v2}, Lra/b;->a()Lra/b$a$a;

    move-result-object v2

    invoke-virtual {v2}, Lra/b$a$a;->c()F

    move-result v10

    invoke-virtual {v12, v13, v11}, Lla/a;->d(LT/l;I)Lra/a;

    move-result-object v2

    invoke-virtual {v2}, Lra/a;->a()Lra/b;

    move-result-object v2

    invoke-virtual {v2}, Lra/b;->b()Lra/b$a$b;

    move-result-object v2

    invoke-virtual {v2}, Lra/b$a$b;->c()F

    move-result v9

    invoke-virtual {v12, v13, v11}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v2

    invoke-virtual {v2}, Lma/a;->a()Lma/a$a;

    move-result-object v2

    invoke-virtual {v2}, Lma/a$a;->b()Lr9/a$a;

    move-result-object v2

    invoke-virtual {v2}, Lr9/a$a;->f()J

    move-result-wide v4

    const-string v2, "blue6"

    invoke-static {v4, v5, v2}, Lta/c;->g(JLjava/lang/String;)Ls9/b$b;

    move-result-object v8

    sget-object v2, LN9/b;->a:LN9/b;

    invoke-virtual {v2}, LN9/b;->k()Ls9/b;

    move-result-object v7

    sget-object v6, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/4 v5, 0x0

    const/4 v4, 0x0

    invoke-static {v6, v5, v15, v4}, Landroidx/compose/foundation/layout/r;->f(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v2

    const/16 v16, 0xe

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    move-object/from16 p3, v12

    move-object v12, v4

    move/from16 v4, v18

    move/from16 v22, v11

    move v11, v5

    move-object/from16 v5, v19

    move-object/from16 v23, v6

    move/from16 v6, v20

    move-object/from16 v24, v7

    move/from16 v7, v16

    move-object/from16 v25, v8

    move-object/from16 v8, v17

    invoke-static/range {v2 .. v8}, Landroidx/compose/foundation/m;->d(Landroidx/compose/ui/e;Landroidx/compose/foundation/o;ZLw/n;ZILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v2

    invoke-static {v2, v1}, Landroidx/compose/foundation/layout/o;->h(Landroidx/compose/ui/e;Lz/N;)Landroidx/compose/ui/e;

    move-result-object v1

    const v2, -0xdc7d41e

    invoke-interface {v13, v2}, LT/l;->U(I)V

    iget-object v2, v0, LRe/m$b;->a:LRe/a;

    invoke-virtual {v2}, LRe/a;->o0()LLi/N;

    move-result-object v2

    invoke-static {v2, v12, v13, v14, v15}, LT/o1;->b(LLi/N;Ldh/i;LT/l;II)LT/z1;

    move-result-object v2

    invoke-interface {v2}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v2

    sget-object v8, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v2, v8}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-static {v13, v14}, LRe/m;->h(LT/l;I)Lz/c$m;

    move-result-object v2

    goto :goto_3

    :cond_5
    sget-object v2, Lz/c;->a:Lz/c;

    invoke-virtual {v2}, Lz/c;->g()Lz/c$m;

    move-result-object v2

    :goto_3
    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    sget-object v3, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v3}, Lf0/c$a;->g()Lf0/c$b;

    move-result-object v3

    iget-object v7, v0, LRe/m$b;->a:LRe/a;

    iget-object v6, v0, LRe/m$b;->b:Lof/a$c;

    iget-object v5, v0, LRe/m$b;->c:LIi/N;

    const/16 v4, 0x30

    invoke-static {v2, v3, v13, v4}, Lz/h;->a(Lz/c$m;Lf0/c$b;LT/l;I)LC0/C;

    move-result-object v2

    invoke-static {v13, v14}, LT/j;->a(LT/l;I)I

    move-result v3

    invoke-interface/range {p2 .. p2}, LT/l;->G()LT/x;

    move-result-object v4

    invoke-static {v13, v1}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v1

    sget-object v16, LE0/g;->K:LE0/g$a;

    invoke-virtual/range {v16 .. v16}, LE0/g$a;->a()Lmh/a;

    move-result-object v14

    invoke-interface/range {p2 .. p2}, LT/l;->x()LT/f;

    move-result-object v17

    if-nez v17, :cond_6

    invoke-static {}, LT/j;->c()V

    :cond_6
    invoke-interface/range {p2 .. p2}, LT/l;->u()V

    invoke-interface/range {p2 .. p2}, LT/l;->o()Z

    move-result v17

    if-eqz v17, :cond_7

    invoke-interface {v13, v14}, LT/l;->D(Lmh/a;)V

    goto :goto_4

    :cond_7
    invoke-interface/range {p2 .. p2}, LT/l;->I()V

    :goto_4
    invoke-static/range {p2 .. p2}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v14

    invoke-virtual/range {v16 .. v16}, LE0/g$a;->e()Lmh/p;

    move-result-object v11

    invoke-static {v14, v2, v11}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v16 .. v16}, LE0/g$a;->g()Lmh/p;

    move-result-object v2

    invoke-static {v14, v4, v2}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v16 .. v16}, LE0/g$a;->b()Lmh/p;

    move-result-object v2

    invoke-interface {v14}, LT/l;->o()Z

    move-result v4

    if-nez v4, :cond_8

    invoke-interface {v14}, LT/l;->f()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v4, v11}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_9

    :cond_8
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v14, v4}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v14, v3, v2}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_9
    invoke-virtual/range {v16 .. v16}, LE0/g$a;->f()Lmh/p;

    move-result-object v2

    invoke-static {v14, v1, v2}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v14, Lz/k;->a:Lz/k;

    const/4 v11, 0x6

    const/16 v16, 0x0

    move-object/from16 v1, v23

    move-object v2, v7

    move-object v3, v6

    const/16 v12, 0x30

    move-object/from16 v4, p2

    move-object/from16 p1, v5

    move v5, v11

    move-object v11, v6

    move/from16 v6, v16

    invoke-static/range {v1 .. v6}, LRe/e;->c(Landroidx/compose/ui/e;LRe/a;Lof/a$c;LT/l;II)V

    int-to-float v1, v12

    invoke-static {v1}, LY0/h;->j(F)F

    move-result v1

    move-object/from16 v12, v23

    invoke-static {v12, v1}, Landroidx/compose/foundation/layout/r;->i(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v1

    const/4 v2, 0x6

    invoke-static {v1, v13, v2}, Lz/a0;->a(Landroidx/compose/ui/e;LT/l;I)V

    invoke-static {v12, v10, v9}, Landroidx/compose/foundation/layout/o;->j(Landroidx/compose/ui/e;FF)Landroidx/compose/ui/e;

    move-result-object v1

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static {v1, v6, v15, v5}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    new-instance v2, LRe/m$b$a;

    move-object/from16 v16, v2

    move-object/from16 v17, v11

    move-object/from16 v18, v25

    move-object/from16 v19, v24

    move-object/from16 v20, p1

    move-object/from16 v21, v7

    invoke-direct/range {v16 .. v21}, LRe/m$b$a;-><init>(Lof/a$c;Ls9/b$b;Ls9/b;LIi/N;LRe/a;)V

    const v3, 0x6c414891

    const/16 v11, 0x36

    invoke-static {v3, v15, v2, v13, v11}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v16

    const/high16 v17, 0x6000000

    const/16 v18, 0xfe

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v23, 0x0

    move-object/from16 v26, v5

    move-object/from16 v5, v19

    move/from16 v19, v6

    move-object/from16 v6, v20

    move-object/from16 v27, v7

    move-object/from16 v7, v21

    move-object/from16 v28, v8

    move-object/from16 v8, v23

    move v15, v9

    move-object/from16 v9, v16

    move/from16 v29, v10

    move-object/from16 v10, p2

    move/from16 v30, v22

    move/from16 v11, v17

    move-object v0, v12

    move-object/from16 v16, v14

    move-object/from16 v14, v26

    move/from16 v12, v18

    invoke-static/range {v1 .. v12}, LF9/x;->c(Landroidx/compose/ui/e;Ljava/lang/String;LB9/b;LB9/b;Ls9/a;Lmh/a;Ljava/lang/String;Lmh/a;Lmh/q;LT/l;II)V

    move/from16 v12, v29

    invoke-static {v0, v12, v15}, Landroidx/compose/foundation/layout/o;->j(Landroidx/compose/ui/e;FF)Landroidx/compose/ui/e;

    move-result-object v1

    const/4 v2, 0x1

    const/4 v11, 0x0

    invoke-static {v1, v11, v2, v14}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    new-instance v3, LRe/m$b$b;

    move-object/from16 v9, p1

    move-object/from16 v5, v24

    move-object/from16 v4, v25

    move-object/from16 v10, v27

    invoke-direct {v3, v4, v5, v9, v10}, LRe/m$b$b;-><init>(Ls9/b$b;Ls9/b;LIi/N;LRe/a;)V

    const v4, 0x7d5cb588

    const/16 v8, 0x36

    invoke-static {v4, v2, v3, v13, v8}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v17

    const/high16 v18, 0x6000000

    const/16 v19, 0xfe

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object/from16 v8, v21

    move-object/from16 v31, v9

    move-object/from16 v9, v17

    move-object/from16 v10, p2

    move/from16 v11, v18

    move/from16 v32, v12

    move/from16 v12, v19

    invoke-static/range {v1 .. v12}, LF9/x;->c(Landroidx/compose/ui/e;Ljava/lang/String;LB9/b;LB9/b;Ls9/a;Lmh/a;Ljava/lang/String;Lmh/a;Lmh/q;LT/l;II)V

    invoke-virtual/range {v27 .. v27}, LRe/a;->p0()LLi/N;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-static {v1, v14, v13, v2, v3}, LT/o1;->b(LLi/N;Ldh/i;LT/l;II)LT/z1;

    move-result-object v1

    invoke-interface {v1}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    new-instance v1, LRe/m$b$c;

    move-object/from16 v12, v27

    move-object/from16 v10, v31

    move/from16 v11, v32

    invoke-direct {v1, v11, v15, v10, v12}, LRe/m$b$c;-><init>(FFLIi/N;LRe/a;)V

    const v4, -0x4567940f

    const/16 v9, 0x36

    invoke-static {v4, v3, v1, v13, v9}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v7

    const/16 v17, 0x1e

    const/4 v3, 0x0

    const/4 v4, 0x0

    const v18, 0x180006

    move-object/from16 v1, v16

    move-object/from16 v8, p2

    move/from16 v9, v18

    move-object/from16 v33, v10

    move/from16 v10, v17

    invoke-static/range {v1 .. v10}, Lq/d;->d(Lz/j;ZLandroidx/compose/ui/e;Landroidx/compose/animation/i;Landroidx/compose/animation/k;Ljava/lang/String;Lmh/q;LT/l;II)V

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {v0, v2, v1, v14}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v0

    move-object/from16 v1, p3

    move/from16 v2, v30

    invoke-virtual {v1, v13, v2}, Lla/a;->d(LT/l;I)Lra/a;

    move-result-object v3

    invoke-virtual {v3}, Lra/a;->a()Lra/b;

    move-result-object v3

    invoke-virtual {v3}, Lra/b;->a()Lra/b$a$a;

    move-result-object v3

    const/16 v4, 0x20

    int-to-float v4, v4

    invoke-static {v4}, LY0/h;->j(F)F

    move-result v4

    invoke-virtual {v3, v4}, Lra/b$a;->a(F)F

    move-result v3

    invoke-virtual {v1, v13, v2}, Lla/a;->d(LT/l;I)Lra/a;

    move-result-object v1

    invoke-virtual {v1}, Lra/a;->a()Lra/b;

    move-result-object v1

    invoke-virtual {v1}, Lra/b;->b()Lra/b$a$b;

    move-result-object v1

    invoke-virtual {v1}, Lra/b$a$b;->e()F

    move-result v1

    invoke-static {v0, v3, v1}, Landroidx/compose/foundation/layout/o;->j(Landroidx/compose/ui/e;FF)Landroidx/compose/ui/e;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v12, v13, v1, v1}, LRe/m;->g(Landroidx/compose/ui/e;LRe/a;LT/l;II)V

    invoke-virtual {v12}, LRe/a;->o0()LLi/N;

    move-result-object v0

    const/4 v2, 0x1

    invoke-static {v0, v14, v13, v1, v2}, LT/o1;->b(LLi/N;Ldh/i;LT/l;II)LT/z1;

    move-result-object v0

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v1, v28

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    new-instance v1, LRe/m$b$d;

    move-object/from16 v3, v33

    invoke-direct {v1, v11, v15, v3, v12}, LRe/m$b$d;-><init>(FFLIi/N;LRe/a;)V

    const v3, -0x6d877f18

    const/16 v4, 0x36

    invoke-static {v3, v2, v1, v13, v4}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v7

    const/16 v10, 0x1e

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object/from16 v1, v16

    move v2, v0

    invoke-static/range {v1 .. v10}, Lq/d;->d(Lz/j;ZLandroidx/compose/ui/e;Landroidx/compose/animation/i;Landroidx/compose/animation/k;Ljava/lang/String;Lmh/q;LT/l;II)V

    invoke-interface/range {p2 .. p2}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-static {}, LT/o;->P()V

    :cond_a
    :goto_5
    return-void
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lz/N;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, LRe/m$b;->a(Lz/N;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
