.class final LC/t$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LC/t;->a(Lmh/a;LC/C;Lz/N;ZLw/q;IFLC/g;Lf0/c$b;Lf0/c$c;Lx/j;LIi/N;Lmh/a;LT/l;II)Lmh/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LC/C;

.field final synthetic b:Lw/q;

.field final synthetic c:Lz/N;

.field final synthetic d:Z

.field final synthetic e:F

.field final synthetic f:LC/g;

.field final synthetic g:Lmh/a;

.field final synthetic h:Lmh/a;

.field final synthetic i:Lf0/c$c;

.field final synthetic j:Lf0/c$b;

.field final synthetic k:I

.field final synthetic l:Lx/j;

.field final synthetic m:LIi/N;


# direct methods
.method constructor <init>(LC/C;Lw/q;Lz/N;ZFLC/g;Lmh/a;Lmh/a;Lf0/c$c;Lf0/c$b;ILx/j;LIi/N;)V
    .locals 0

    iput-object p1, p0, LC/t$a;->a:LC/C;

    iput-object p2, p0, LC/t$a;->b:Lw/q;

    iput-object p3, p0, LC/t$a;->c:Lz/N;

    iput-boolean p4, p0, LC/t$a;->d:Z

    iput p5, p0, LC/t$a;->e:F

    iput-object p6, p0, LC/t$a;->f:LC/g;

    iput-object p7, p0, LC/t$a;->g:Lmh/a;

    iput-object p8, p0, LC/t$a;->h:Lmh/a;

    iput-object p9, p0, LC/t$a;->i:Lf0/c$c;

    iput-object p10, p0, LC/t$a;->j:Lf0/c$b;

    iput p11, p0, LC/t$a;->k:I

    iput-object p12, p0, LC/t$a;->l:Lx/j;

    iput-object p13, p0, LC/t$a;->m:LIi/N;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LB/x;J)LC/u;
    .locals 37

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-wide/from16 v4, p2

    iget-object v2, v1, LC/t$a;->a:LC/C;

    invoke-virtual {v2}, LC/C;->D()LT/q0;

    move-result-object v2

    invoke-static {v2}, LB/M;->a(LT/q0;)V

    iget-object v2, v1, LC/t$a;->b:Lw/q;

    sget-object v3, Lw/q;->Vertical:Lw/q;

    const/4 v15, 0x0

    if-ne v2, v3, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    move v2, v15

    :goto_0
    if-eqz v2, :cond_1

    move-object v6, v3

    goto :goto_1

    :cond_1
    sget-object v6, Lw/q;->Horizontal:Lw/q;

    :goto_1
    invoke-static {v4, v5, v6}, Ls/j;->a(JLw/q;)V

    if-eqz v2, :cond_2

    iget-object v6, v1, LC/t$a;->c:Lz/N;

    invoke-interface/range {p1 .. p1}, LC0/o;->getLayoutDirection()LY0/t;

    move-result-object v7

    invoke-interface {v6, v7}, Lz/N;->a(LY0/t;)F

    move-result v6

    invoke-interface {v0, v6}, LY0/d;->x1(F)I

    move-result v6

    goto :goto_2

    :cond_2
    iget-object v6, v1, LC/t$a;->c:Lz/N;

    invoke-interface/range {p1 .. p1}, LC0/o;->getLayoutDirection()LY0/t;

    move-result-object v7

    invoke-static {v6, v7}, Landroidx/compose/foundation/layout/o;->g(Lz/N;LY0/t;)F

    move-result v6

    invoke-interface {v0, v6}, LY0/d;->x1(F)I

    move-result v6

    :goto_2
    if-eqz v2, :cond_3

    iget-object v7, v1, LC/t$a;->c:Lz/N;

    invoke-interface/range {p1 .. p1}, LC0/o;->getLayoutDirection()LY0/t;

    move-result-object v8

    invoke-interface {v7, v8}, Lz/N;->b(LY0/t;)F

    move-result v7

    invoke-interface {v0, v7}, LY0/d;->x1(F)I

    move-result v7

    goto :goto_3

    :cond_3
    iget-object v7, v1, LC/t$a;->c:Lz/N;

    invoke-interface/range {p1 .. p1}, LC0/o;->getLayoutDirection()LY0/t;

    move-result-object v8

    invoke-static {v7, v8}, Landroidx/compose/foundation/layout/o;->f(Lz/N;LY0/t;)F

    move-result v7

    invoke-interface {v0, v7}, LY0/d;->x1(F)I

    move-result v7

    :goto_3
    iget-object v8, v1, LC/t$a;->c:Lz/N;

    invoke-interface {v8}, Lz/N;->d()F

    move-result v8

    invoke-interface {v0, v8}, LY0/d;->x1(F)I

    move-result v8

    iget-object v9, v1, LC/t$a;->c:Lz/N;

    invoke-interface {v9}, Lz/N;->c()F

    move-result v9

    invoke-interface {v0, v9}, LY0/d;->x1(F)I

    move-result v9

    add-int v10, v8, v9

    add-int v11, v6, v7

    if-eqz v2, :cond_4

    move v12, v10

    goto :goto_4

    :cond_4
    move v12, v11

    :goto_4
    if-eqz v2, :cond_5

    iget-boolean v13, v1, LC/t$a;->d:Z

    if-nez v13, :cond_5

    move v13, v8

    goto :goto_5

    :cond_5
    if-eqz v2, :cond_6

    iget-boolean v13, v1, LC/t$a;->d:Z

    if-eqz v13, :cond_6

    move v13, v9

    goto :goto_5

    :cond_6
    if-nez v2, :cond_7

    iget-boolean v9, v1, LC/t$a;->d:Z

    if-nez v9, :cond_7

    move v13, v6

    goto :goto_5

    :cond_7
    move v13, v7

    :goto_5
    sub-int v14, v12, v13

    neg-int v7, v11

    neg-int v9, v10

    invoke-static {v4, v5, v7, v9}, LY0/c;->n(JII)J

    move-result-wide v32

    iget-object v7, v1, LC/t$a;->a:LC/C;

    invoke-virtual {v7, v0}, LC/C;->c0(LY0/d;)V

    iget v7, v1, LC/t$a;->e:F

    invoke-interface {v0, v7}, LY0/d;->x1(F)I

    move-result v12

    if-eqz v2, :cond_8

    invoke-static/range {p2 .. p3}, LY0/b;->k(J)I

    move-result v7

    sub-int/2addr v7, v10

    goto :goto_6

    :cond_8
    invoke-static/range {p2 .. p3}, LY0/b;->l(J)I

    move-result v7

    sub-int/2addr v7, v11

    :goto_6
    iget-boolean v9, v1, LC/t$a;->d:Z

    if-eqz v9, :cond_c

    if-lez v7, :cond_9

    goto :goto_9

    :cond_9
    if-eqz v2, :cond_a

    goto :goto_7

    :cond_a
    add-int/2addr v6, v7

    :goto_7
    if-eqz v2, :cond_b

    add-int/2addr v8, v7

    :cond_b
    invoke-static {v6, v8}, LY0/o;->a(II)J

    move-result-wide v8

    :goto_8
    move-wide/from16 v34, v8

    goto :goto_a

    :cond_c
    :goto_9
    invoke-static {v6, v8}, LY0/o;->a(II)J

    move-result-wide v8

    goto :goto_8

    :goto_a
    iget-object v2, v1, LC/t$a;->f:LC/g;

    invoke-interface {v2, v0, v7, v12}, LC/g;->a(LY0/d;II)I

    move-result v2

    invoke-static {v2, v15}, Lsh/m;->d(II)I

    move-result v25

    iget-object v2, v1, LC/t$a;->a:LC/C;

    iget-object v6, v1, LC/t$a;->b:Lw/q;

    if-ne v6, v3, :cond_d

    invoke-static/range {v32 .. v33}, LY0/b;->l(J)I

    move-result v6

    move/from16 v17, v6

    goto :goto_b

    :cond_d
    move/from16 v17, v25

    :goto_b
    iget-object v6, v1, LC/t$a;->b:Lw/q;

    if-eq v6, v3, :cond_e

    invoke-static/range {v32 .. v33}, LY0/b;->k(J)I

    move-result v3

    move/from16 v19, v3

    goto :goto_c

    :cond_e
    move/from16 v19, v25

    :goto_c
    const/16 v20, 0x5

    const/16 v21, 0x0

    const/16 v16, 0x0

    const/16 v18, 0x0

    invoke-static/range {v16 .. v21}, LY0/c;->b(IIIIILjava/lang/Object;)J

    move-result-wide v8

    invoke-virtual {v2, v8, v9}, LC/C;->d0(J)V

    iget-object v2, v1, LC/t$a;->g:Lmh/a;

    invoke-interface {v2}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object v2

    move-object v8, v2

    check-cast v8, LC/r;

    sget-object v2, Landroidx/compose/runtime/snapshots/g;->e:Landroidx/compose/runtime/snapshots/g$a;

    iget-object v3, v1, LC/t$a;->a:LC/C;

    iget-object v6, v1, LC/t$a;->l:Lx/j;

    invoke-virtual {v2}, Landroidx/compose/runtime/snapshots/g$a;->d()Landroidx/compose/runtime/snapshots/g;

    move-result-object v9

    const/4 v0, 0x0

    if-eqz v9, :cond_f

    invoke-virtual {v9}, Landroidx/compose/runtime/snapshots/g;->h()Lmh/l;

    move-result-object v16

    move-object/from16 v15, v16

    goto :goto_d

    :cond_f
    move-object v15, v0

    :goto_d
    invoke-virtual {v2, v9}, Landroidx/compose/runtime/snapshots/g$a;->f(Landroidx/compose/runtime/snapshots/g;)Landroidx/compose/runtime/snapshots/g;

    move-result-object v4

    :try_start_0
    invoke-virtual {v3}, LC/C;->v()I

    move-result v5

    invoke-virtual {v3, v8, v5}, LC/C;->U(LC/r;I)I

    move-result v36

    invoke-virtual {v3}, LC/C;->v()I

    move-result v22

    invoke-virtual {v3}, LC/C;->w()F

    move-result v23

    invoke-virtual {v3}, LC/C;->F()I

    move-result v24

    move-object/from16 v16, v6

    move/from16 v17, v7

    move/from16 v18, v25

    move/from16 v19, v12

    move/from16 v20, v13

    move/from16 v21, v14

    invoke-static/range {v16 .. v24}, LC/m;->d(Lx/j;IIIIIIFI)I

    move-result v16

    sget-object v3, LYg/J;->a:LYg/J;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v2, v9, v4, v15}, Landroidx/compose/runtime/snapshots/g$a;->m(Landroidx/compose/runtime/snapshots/g;Landroidx/compose/runtime/snapshots/g;Lmh/l;)V

    iget-object v2, v1, LC/t$a;->a:LC/C;

    invoke-virtual {v2}, LC/C;->J()LB/E;

    move-result-object v2

    iget-object v3, v1, LC/t$a;->a:LC/C;

    invoke-virtual {v3}, LC/C;->u()LB/j;

    move-result-object v3

    invoke-static {v8, v2, v3}, LB/n;->a(LB/t;LB/E;LB/j;)Ljava/util/List;

    move-result-object v27

    iget-object v2, v1, LC/t$a;->h:Lmh/a;

    invoke-interface {v2}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v9

    iget-object v2, v1, LC/t$a;->a:LC/C;

    invoke-virtual {v2}, LC/C;->K()LT/q0;

    move-result-object v29

    iget-object v2, v1, LC/t$a;->b:Lw/q;

    move-object/from16 v19, v2

    iget-object v2, v1, LC/t$a;->i:Lf0/c$c;

    move-object/from16 v20, v2

    iget-object v2, v1, LC/t$a;->j:Lf0/c$b;

    move-object/from16 v21, v2

    iget-boolean v2, v1, LC/t$a;->d:Z

    move/from16 v22, v2

    iget v2, v1, LC/t$a;->k:I

    move/from16 v26, v2

    iget-object v2, v1, LC/t$a;->l:Lx/j;

    move-object/from16 v28, v2

    iget-object v2, v1, LC/t$a;->m:LIi/N;

    move-object/from16 v30, v2

    new-instance v2, LC/t$a$a;

    move-object/from16 v31, v2

    move-object/from16 v3, p1

    move-wide/from16 v4, p2

    move v6, v11

    move v11, v7

    move v7, v10

    invoke-direct/range {v2 .. v7}, LC/t$a$a;-><init>(LB/x;JII)V

    move-object v2, v8

    move-object/from16 v8, p1

    move-object v10, v2

    move v2, v12

    move v12, v13

    move v13, v14

    move v14, v2

    const/4 v2, 0x0

    move/from16 v15, v36

    move-wide/from16 v17, v32

    move-wide/from16 v23, v34

    invoke-static/range {v8 .. v31}, LC/s;->h(LB/x;ILC/r;IIIIIIJLw/q;Lf0/c$c;Lf0/c$b;ZJIILjava/util/List;Lx/j;LT/q0;LIi/N;Lmh/q;)LC/u;

    move-result-object v3

    iget-object v4, v1, LC/t$a;->a:LC/C;

    const/4 v5, 0x2

    invoke-static {v4, v3, v2, v5, v0}, LC/C;->p(LC/C;LC/u;ZILjava/lang/Object;)V

    return-object v3

    :catchall_0
    move-exception v0

    invoke-virtual {v2, v9, v4, v15}, Landroidx/compose/runtime/snapshots/g$a;->m(Landroidx/compose/runtime/snapshots/g;Landroidx/compose/runtime/snapshots/g;Lmh/l;)V

    throw v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, LB/x;

    check-cast p2, LY0/b;

    invoke-virtual {p2}, LY0/b;->r()J

    move-result-wide v0

    invoke-virtual {p0, p1, v0, v1}, LC/t$a;->a(LB/x;J)LC/u;

    move-result-object p1

    return-object p1
.end method
