.class final LA/p$b;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LA/p;->b(Lmh/a;LA/B;Lz/N;ZZILf0/c$b;Lf0/c$c;Lz/c$e;Lz/c$m;LIi/N;Lm0/H0;ZLT/l;II)Lmh/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LA/B;

.field final synthetic b:Z

.field final synthetic c:Lz/N;

.field final synthetic d:Z

.field final synthetic e:Lmh/a;

.field final synthetic f:Lz/c$m;

.field final synthetic g:Lz/c$e;

.field final synthetic h:Z

.field final synthetic i:I

.field final synthetic j:LIi/N;

.field final synthetic k:Lm0/H0;

.field final synthetic l:Lf0/c$b;

.field final synthetic m:Lf0/c$c;


# direct methods
.method constructor <init>(LA/B;ZLz/N;ZLmh/a;Lz/c$m;Lz/c$e;ZILIi/N;Lm0/H0;Lf0/c$b;Lf0/c$c;)V
    .locals 0

    iput-object p1, p0, LA/p$b;->a:LA/B;

    iput-boolean p2, p0, LA/p$b;->b:Z

    iput-object p3, p0, LA/p$b;->c:Lz/N;

    iput-boolean p4, p0, LA/p$b;->d:Z

    iput-object p5, p0, LA/p$b;->e:Lmh/a;

    iput-object p6, p0, LA/p$b;->f:Lz/c$m;

    iput-object p7, p0, LA/p$b;->g:Lz/c$e;

    iput-boolean p8, p0, LA/p$b;->h:Z

    iput p9, p0, LA/p$b;->i:I

    iput-object p10, p0, LA/p$b;->j:LIi/N;

    iput-object p11, p0, LA/p$b;->k:Lm0/H0;

    iput-object p12, p0, LA/p$b;->l:Lf0/c$b;

    iput-object p13, p0, LA/p$b;->m:Lf0/c$c;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LB/x;J)LA/s;
    .locals 42

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-wide/from16 v14, p2

    iget-object v2, v1, LA/p$b;->a:LA/B;

    invoke-virtual {v2}, LA/B;->x()LT/q0;

    move-result-object v2

    invoke-static {v2}, LB/M;->a(LT/q0;)V

    iget-object v2, v1, LA/p$b;->a:LA/B;

    invoke-virtual {v2}, LA/B;->t()Z

    move-result v2

    if-nez v2, :cond_1

    invoke-interface/range {p1 .. p1}, LC0/o;->a1()Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_1

    :cond_0
    const/4 v2, 0x0

    :goto_0
    move/from16 v28, v2

    goto :goto_2

    :cond_1
    :goto_1
    const/4 v2, 0x1

    goto :goto_0

    :goto_2
    iget-boolean v2, v1, LA/p$b;->b:Z

    if-eqz v2, :cond_2

    sget-object v2, Lw/q;->Vertical:Lw/q;

    goto :goto_3

    :cond_2
    sget-object v2, Lw/q;->Horizontal:Lw/q;

    :goto_3
    invoke-static {v14, v15, v2}, Ls/j;->a(JLw/q;)V

    iget-boolean v2, v1, LA/p$b;->b:Z

    if-eqz v2, :cond_3

    iget-object v2, v1, LA/p$b;->c:Lz/N;

    invoke-interface/range {p1 .. p1}, LC0/o;->getLayoutDirection()LY0/t;

    move-result-object v3

    invoke-interface {v2, v3}, Lz/N;->a(LY0/t;)F

    move-result v2

    invoke-interface {v0, v2}, LY0/d;->x1(F)I

    move-result v2

    goto :goto_4

    :cond_3
    iget-object v2, v1, LA/p$b;->c:Lz/N;

    invoke-interface/range {p1 .. p1}, LC0/o;->getLayoutDirection()LY0/t;

    move-result-object v3

    invoke-static {v2, v3}, Landroidx/compose/foundation/layout/o;->g(Lz/N;LY0/t;)F

    move-result v2

    invoke-interface {v0, v2}, LY0/d;->x1(F)I

    move-result v2

    :goto_4
    iget-boolean v3, v1, LA/p$b;->b:Z

    if-eqz v3, :cond_4

    iget-object v3, v1, LA/p$b;->c:Lz/N;

    invoke-interface/range {p1 .. p1}, LC0/o;->getLayoutDirection()LY0/t;

    move-result-object v4

    invoke-interface {v3, v4}, Lz/N;->b(LY0/t;)F

    move-result v3

    invoke-interface {v0, v3}, LY0/d;->x1(F)I

    move-result v3

    goto :goto_5

    :cond_4
    iget-object v3, v1, LA/p$b;->c:Lz/N;

    invoke-interface/range {p1 .. p1}, LC0/o;->getLayoutDirection()LY0/t;

    move-result-object v4

    invoke-static {v3, v4}, Landroidx/compose/foundation/layout/o;->f(Lz/N;LY0/t;)F

    move-result v3

    invoke-interface {v0, v3}, LY0/d;->x1(F)I

    move-result v3

    :goto_5
    iget-object v4, v1, LA/p$b;->c:Lz/N;

    invoke-interface {v4}, Lz/N;->d()F

    move-result v4

    invoke-interface {v0, v4}, LY0/d;->x1(F)I

    move-result v4

    iget-object v5, v1, LA/p$b;->c:Lz/N;

    invoke-interface {v5}, Lz/N;->c()F

    move-result v5

    invoke-interface {v0, v5}, LY0/d;->x1(F)I

    move-result v5

    add-int v13, v4, v5

    add-int v12, v2, v3

    iget-boolean v6, v1, LA/p$b;->b:Z

    if-eqz v6, :cond_5

    move v7, v13

    goto :goto_6

    :cond_5
    move v7, v12

    :goto_6
    if-eqz v6, :cond_6

    iget-boolean v8, v1, LA/p$b;->d:Z

    if-nez v8, :cond_6

    move/from16 v18, v4

    goto :goto_7

    :cond_6
    if-eqz v6, :cond_7

    iget-boolean v8, v1, LA/p$b;->d:Z

    if-eqz v8, :cond_7

    move/from16 v18, v5

    goto :goto_7

    :cond_7
    if-nez v6, :cond_8

    iget-boolean v5, v1, LA/p$b;->d:Z

    if-nez v5, :cond_8

    move/from16 v18, v2

    goto :goto_7

    :cond_8
    move/from16 v18, v3

    :goto_7
    sub-int v20, v7, v18

    neg-int v3, v12

    neg-int v5, v13

    invoke-static {v14, v15, v3, v5}, LY0/c;->n(JII)J

    move-result-wide v35

    iget-object v3, v1, LA/p$b;->e:Lmh/a;

    invoke-interface {v3}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object v3

    move-object v11, v3

    check-cast v11, LA/m;

    invoke-interface {v11}, LA/m;->e()LA/d;

    move-result-object v3

    invoke-static/range {v35 .. v36}, LY0/b;->l(J)I

    move-result v5

    invoke-static/range {v35 .. v36}, LY0/b;->k(J)I

    move-result v6

    invoke-virtual {v3, v5, v6}, LA/d;->d(II)V

    iget-boolean v3, v1, LA/p$b;->b:Z

    if-eqz v3, :cond_a

    iget-object v3, v1, LA/p$b;->f:Lz/c$m;

    if-eqz v3, :cond_9

    invoke-interface {v3}, Lz/c$m;->a()F

    move-result v3

    goto :goto_8

    :cond_9
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v2, "null verticalArrangement when isVertical == true"

    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_a
    iget-object v3, v1, LA/p$b;->g:Lz/c$e;

    if-eqz v3, :cond_14

    invoke-interface {v3}, Lz/c$e;->a()F

    move-result v3

    :goto_8
    invoke-interface {v0, v3}, LY0/d;->x1(F)I

    move-result v24

    invoke-interface {v11}, LB/t;->a()I

    move-result v27

    iget-boolean v3, v1, LA/p$b;->b:Z

    if-eqz v3, :cond_b

    invoke-static/range {p2 .. p3}, LY0/b;->k(J)I

    move-result v3

    sub-int/2addr v3, v13

    :goto_9
    move/from16 v37, v3

    goto :goto_a

    :cond_b
    invoke-static/range {p2 .. p3}, LY0/b;->l(J)I

    move-result v3

    sub-int/2addr v3, v12

    goto :goto_9

    :goto_a
    iget-boolean v3, v1, LA/p$b;->d:Z

    if-eqz v3, :cond_f

    if-lez v37, :cond_c

    goto :goto_d

    :cond_c
    iget-boolean v3, v1, LA/p$b;->b:Z

    if-eqz v3, :cond_d

    goto :goto_b

    :cond_d
    add-int v2, v2, v37

    :goto_b
    if-eqz v3, :cond_e

    add-int v4, v4, v37

    :cond_e
    invoke-static {v2, v4}, LY0/o;->a(II)J

    move-result-wide v2

    :goto_c
    move-wide/from16 v16, v2

    goto :goto_e

    :cond_f
    :goto_d
    invoke-static {v2, v4}, LY0/o;->a(II)J

    move-result-wide v2

    goto :goto_c

    :goto_e
    new-instance v38, LA/p$b$b;

    iget-boolean v5, v1, LA/p$b;->b:Z

    iget-object v10, v1, LA/p$b;->l:Lf0/c$b;

    iget-object v9, v1, LA/p$b;->m:Lf0/c$c;

    iget-boolean v8, v1, LA/p$b;->d:Z

    iget-object v7, v1, LA/p$b;->a:LA/B;

    move-object/from16 v2, v38

    move-wide/from16 v3, v35

    move-object v6, v11

    move-object/from16 v19, v7

    move-object/from16 v7, p1

    move/from16 v21, v8

    move/from16 v8, v27

    move-object/from16 v22, v9

    move/from16 v9, v24

    move-object v0, v11

    move-object/from16 v11, v22

    move/from16 v39, v12

    move/from16 v12, v21

    move/from16 v40, v13

    move/from16 v13, v18

    move/from16 v14, v20

    move-wide/from16 v15, v16

    move-object/from16 v17, v19

    invoke-direct/range {v2 .. v17}, LA/p$b$b;-><init>(JZLA/m;LB/x;IILf0/c$b;Lf0/c$c;ZIIJLA/B;)V

    sget-object v2, Landroidx/compose/runtime/snapshots/g;->e:Landroidx/compose/runtime/snapshots/g$a;

    iget-object v3, v1, LA/p$b;->a:LA/B;

    invoke-virtual {v2}, Landroidx/compose/runtime/snapshots/g$a;->d()Landroidx/compose/runtime/snapshots/g;

    move-result-object v4

    if-eqz v4, :cond_10

    invoke-virtual {v4}, Landroidx/compose/runtime/snapshots/g;->h()Lmh/l;

    move-result-object v5

    goto :goto_f

    :cond_10
    const/4 v5, 0x0

    :goto_f
    invoke-virtual {v2, v4}, Landroidx/compose/runtime/snapshots/g$a;->f(Landroidx/compose/runtime/snapshots/g;)Landroidx/compose/runtime/snapshots/g;

    move-result-object v6

    :try_start_0
    invoke-virtual {v3}, LA/B;->r()I

    move-result v7

    invoke-virtual {v3, v0, v7}, LA/B;->P(LA/m;I)I

    move-result v14

    invoke-virtual {v3}, LA/B;->s()I

    move-result v15

    sget-object v3, LYg/J;->a:LYg/J;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v2, v4, v6, v5}, Landroidx/compose/runtime/snapshots/g$a;->m(Landroidx/compose/runtime/snapshots/g;Landroidx/compose/runtime/snapshots/g;Lmh/l;)V

    iget-object v2, v1, LA/p$b;->a:LA/B;

    invoke-virtual {v2}, LA/B;->z()LB/E;

    move-result-object v2

    iget-object v3, v1, LA/p$b;->a:LA/B;

    invoke-virtual {v3}, LA/B;->p()LB/j;

    move-result-object v3

    invoke-static {v0, v2, v3}, LB/n;->a(LB/t;LB/E;LB/j;)Ljava/util/List;

    move-result-object v41

    invoke-interface/range {p1 .. p1}, LC0/o;->a1()Z

    move-result v2

    if-nez v2, :cond_12

    if-nez v28, :cond_11

    goto :goto_11

    :cond_11
    iget-object v2, v1, LA/p$b;->a:LA/B;

    invoke-virtual {v2}, LA/B;->F()F

    move-result v2

    :goto_10
    move/from16 v16, v2

    goto :goto_12

    :cond_12
    :goto_11
    iget-object v2, v1, LA/p$b;->a:LA/B;

    invoke-virtual {v2}, LA/B;->G()F

    move-result v2

    goto :goto_10

    :goto_12
    iget-boolean v2, v1, LA/p$b;->h:Z

    if-eqz v2, :cond_13

    invoke-interface {v0}, LA/m;->g()Ljava/util/List;

    move-result-object v0

    goto :goto_13

    :cond_13
    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v0

    :goto_13
    iget-boolean v2, v1, LA/p$b;->b:Z

    move/from16 v19, v2

    iget-object v2, v1, LA/p$b;->f:Lz/c$m;

    move-object/from16 v21, v2

    iget-object v2, v1, LA/p$b;->g:Lz/c$e;

    move-object/from16 v22, v2

    iget-boolean v2, v1, LA/p$b;->d:Z

    move/from16 v23, v2

    iget-object v2, v1, LA/p$b;->a:LA/B;

    invoke-virtual {v2}, LA/B;->v()Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;

    move-result-object v25

    iget v2, v1, LA/p$b;->i:I

    move/from16 v26, v2

    invoke-interface/range {p1 .. p1}, LC0/o;->a1()Z

    move-result v29

    iget-object v2, v1, LA/p$b;->a:LA/B;

    invoke-virtual {v2}, LA/B;->B()LA/s;

    move-result-object v30

    iget-object v2, v1, LA/p$b;->j:LIi/N;

    move-object/from16 v31, v2

    iget-object v2, v1, LA/p$b;->a:LA/B;

    invoke-virtual {v2}, LA/B;->A()LT/q0;

    move-result-object v32

    iget-object v2, v1, LA/p$b;->k:Lm0/H0;

    move-object/from16 v33, v2

    new-instance v2, LA/p$b$a;

    move-object/from16 v34, v2

    move-object/from16 v3, p1

    move-wide/from16 v4, p2

    move/from16 v6, v39

    move/from16 v7, v40

    invoke-direct/range {v2 .. v7}, LA/p$b$a;-><init>(LB/x;JII)V

    move/from16 v8, v27

    move-object/from16 v9, v38

    move/from16 v10, v37

    move/from16 v11, v18

    move/from16 v12, v20

    move/from16 v13, v24

    move-wide/from16 v17, v35

    move-object/from16 v20, v0

    move-object/from16 v24, p1

    move-object/from16 v27, v41

    invoke-static/range {v8 .. v34}, LA/r;->e(ILA/u;IIIIIIFJZLjava/util/List;Lz/c$m;Lz/c$e;ZLY0/d;Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;ILjava/util/List;ZZLA/q;LIi/N;LT/q0;Lm0/H0;Lmh/q;)LA/s;

    move-result-object v0

    iget-object v3, v1, LA/p$b;->a:LA/B;

    invoke-interface/range {p1 .. p1}, LC0/o;->a1()Z

    move-result v5

    const/4 v7, 0x4

    const/4 v8, 0x0

    const/4 v6, 0x0

    move-object v4, v0

    invoke-static/range {v3 .. v8}, LA/B;->n(LA/B;LA/s;ZZILjava/lang/Object;)V

    return-object v0

    :catchall_0
    move-exception v0

    invoke-virtual {v2, v4, v6, v5}, Landroidx/compose/runtime/snapshots/g$a;->m(Landroidx/compose/runtime/snapshots/g;Landroidx/compose/runtime/snapshots/g;Lmh/l;)V

    throw v0

    :cond_14
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v2, "null horizontalAlignment when isVertical == false"

    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, LB/x;

    check-cast p2, LY0/b;

    invoke-virtual {p2}, LY0/b;->r()J

    move-result-wide v0

    invoke-virtual {p0, p1, v0, v1}, LA/p$b;->a(LB/x;J)LA/s;

    move-result-object p1

    return-object p1
.end method
