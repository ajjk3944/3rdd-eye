.class final LN/G$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN/G;->a(Lmh/q;Landroidx/compose/ui/e;LN/H;ZLm0/i1;FJJJLmh/p;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LN/H;

.field final synthetic b:Z

.field final synthetic c:LIi/N;

.field final synthetic d:J

.field final synthetic e:Lm0/i1;

.field final synthetic f:J

.field final synthetic g:J

.field final synthetic h:F

.field final synthetic i:Lmh/p;

.field final synthetic j:Lmh/q;


# direct methods
.method constructor <init>(LN/H;ZLIi/N;JLm0/i1;JJFLmh/p;Lmh/q;)V
    .locals 0

    iput-object p1, p0, LN/G$a;->a:LN/H;

    iput-boolean p2, p0, LN/G$a;->b:Z

    iput-object p3, p0, LN/G$a;->c:LIi/N;

    iput-wide p4, p0, LN/G$a;->d:J

    iput-object p6, p0, LN/G$a;->e:Lm0/i1;

    iput-wide p7, p0, LN/G$a;->f:J

    iput-wide p9, p0, LN/G$a;->g:J

    iput p11, p0, LN/G$a;->h:F

    iput-object p12, p0, LN/G$a;->i:Lmh/p;

    iput-object p13, p0, LN/G$a;->j:Lmh/q;

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lz/f;LT/l;I)V
    .locals 28

    move-object/from16 v0, p0

    move-object/from16 v13, p2

    const/4 v8, 0x6

    and-int/lit8 v1, p3, 0x6

    if-nez v1, :cond_1

    move-object/from16 v1, p1

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
    move-object/from16 v1, p1

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

    goto/16 :goto_6

    :cond_3
    :goto_2
    invoke-static {}, LT/o;->H()Z

    move-result v3

    if-eqz v3, :cond_4

    const/4 v3, -0x1

    const-string v4, "androidx.compose.material.ModalDrawer.<anonymous> (Drawer.kt:503)"

    const v5, 0x30ad78b7

    invoke-static {v5, v2, v3, v4}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_4
    invoke-interface/range {p1 .. p1}, Lz/f;->d()J

    move-result-wide v9

    invoke-static {v9, v10}, LY0/b;->h(J)Z

    move-result v1

    if-eqz v1, :cond_19

    invoke-static {v9, v10}, LY0/b;->l(J)I

    move-result v1

    int-to-float v1, v1

    neg-float v1, v1

    invoke-static {}, Landroidx/compose/ui/platform/k0;->g()LT/H0;

    move-result-object v2

    invoke-interface {v13, v2}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LY0/d;

    iget-object v3, v0, LN/G$a;->a:LN/H;

    invoke-interface {v13, v3}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v3

    invoke-interface {v13, v2}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v3, v4

    invoke-interface {v13, v1}, LT/l;->g(F)Z

    move-result v4

    or-int/2addr v3, v4

    iget-object v4, v0, LN/G$a;->a:LN/H;

    invoke-interface/range {p2 .. p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v5

    const/4 v6, 0x0

    if-nez v3, :cond_5

    sget-object v3, LT/l;->a:LT/l$a;

    invoke-virtual {v3}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v3

    if-ne v5, v3, :cond_6

    :cond_5
    new-instance v5, LN/G$a$a;

    invoke-direct {v5, v4, v2, v1, v6}, LN/G$a$a;-><init>(LN/H;LY0/d;FF)V

    invoke-interface {v13, v5}, LT/l;->K(Ljava/lang/Object;)V

    :cond_6
    check-cast v5, Lmh/a;

    const/4 v11, 0x0

    invoke-static {v5, v13, v11}, LT/O;->g(Lmh/a;LT/l;I)V

    invoke-static {}, Landroidx/compose/ui/platform/k0;->m()LT/H0;

    move-result-object v2

    invoke-interface {v13, v2}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v2

    sget-object v3, LY0/t;->Rtl:LY0/t;

    if-ne v2, v3, :cond_7

    const/16 v18, 0x1

    goto :goto_3

    :cond_7
    move/from16 v18, v11

    :goto_3
    sget-object v7, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    iget-object v2, v0, LN/G$a;->a:LN/H;

    invoke-virtual {v2}, LN/H;->c()LN/b;

    move-result-object v15

    sget-object v16, Lw/q;->Horizontal:Lw/q;

    iget-boolean v2, v0, LN/G$a;->b:Z

    const/16 v21, 0x30

    const/16 v22, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    move-object v14, v7

    move/from16 v17, v2

    invoke-static/range {v14 .. v22}, Landroidx/compose/material/a;->e(Landroidx/compose/ui/e;LN/b;Lw/q;ZZLy/m;ZILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v2

    iget-object v14, v0, LN/G$a;->a:LN/H;

    iget-boolean v3, v0, LN/G$a;->b:Z

    iget-object v15, v0, LN/G$a;->c:LIi/N;

    iget-wide v4, v0, LN/G$a;->d:J

    iget-object v12, v0, LN/G$a;->e:Lm0/i1;

    move-wide/from16 v17, v9

    iget-wide v8, v0, LN/G$a;->f:J

    move-object v10, v7

    iget-wide v6, v0, LN/G$a;->g:J

    move-wide/from16 v19, v6

    iget v7, v0, LN/G$a;->h:F

    iget-object v6, v0, LN/G$a;->i:Lmh/p;

    move/from16 v21, v7

    iget-object v7, v0, LN/G$a;->j:Lmh/q;

    sget-object v22, Lf0/c;->a:Lf0/c$a;

    invoke-virtual/range {v22 .. v22}, Lf0/c$a;->o()Lf0/c;

    move-result-object v0

    invoke-static {v0, v11}, Landroidx/compose/foundation/layout/d;->h(Lf0/c;Z)LC0/C;

    move-result-object v0

    invoke-static {v13, v11}, LT/j;->a(LT/l;I)I

    move-result v23

    invoke-interface/range {p2 .. p2}, LT/l;->G()LT/x;

    move-result-object v11

    invoke-static {v13, v2}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v2

    sget-object v24, LE0/g;->K:LE0/g$a;

    move-object/from16 v25, v7

    invoke-virtual/range {v24 .. v24}, LE0/g$a;->a()Lmh/a;

    move-result-object v7

    invoke-interface/range {p2 .. p2}, LT/l;->x()LT/f;

    move-result-object v26

    if-nez v26, :cond_8

    invoke-static {}, LT/j;->c()V

    :cond_8
    invoke-interface/range {p2 .. p2}, LT/l;->u()V

    invoke-interface/range {p2 .. p2}, LT/l;->o()Z

    move-result v26

    if-eqz v26, :cond_9

    invoke-interface {v13, v7}, LT/l;->D(Lmh/a;)V

    goto :goto_4

    :cond_9
    invoke-interface/range {p2 .. p2}, LT/l;->I()V

    :goto_4
    invoke-static/range {p2 .. p2}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v7

    move-wide/from16 v26, v8

    invoke-virtual/range {v24 .. v24}, LE0/g$a;->e()Lmh/p;

    move-result-object v8

    invoke-static {v7, v0, v8}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v24 .. v24}, LE0/g$a;->g()Lmh/p;

    move-result-object v0

    invoke-static {v7, v11, v0}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v24 .. v24}, LE0/g$a;->b()Lmh/p;

    move-result-object v0

    invoke-interface {v7}, LT/l;->o()Z

    move-result v8

    if-nez v8, :cond_a

    invoke-interface {v7}, LT/l;->f()Ljava/lang/Object;

    move-result-object v8

    invoke-static/range {v23 .. v23}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v8, v9}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_b

    :cond_a
    invoke-static/range {v23 .. v23}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-interface {v7, v8}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static/range {v23 .. v23}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-interface {v7, v8, v0}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_b
    invoke-virtual/range {v24 .. v24}, LE0/g$a;->f()Lmh/p;

    move-result-object v0

    invoke-static {v7, v2, v0}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v0, Landroidx/compose/foundation/layout/f;->a:Landroidx/compose/foundation/layout/f;

    invoke-virtual/range {v22 .. v22}, Lf0/c$a;->o()Lf0/c;

    move-result-object v0

    const/4 v2, 0x0

    invoke-static {v0, v2}, Landroidx/compose/foundation/layout/d;->h(Lf0/c;Z)LC0/C;

    move-result-object v0

    invoke-static {v13, v2}, LT/j;->a(LT/l;I)I

    move-result v7

    invoke-interface/range {p2 .. p2}, LT/l;->G()LT/x;

    move-result-object v2

    invoke-static {v13, v10}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v8

    invoke-virtual/range {v24 .. v24}, LE0/g$a;->a()Lmh/a;

    move-result-object v9

    invoke-interface/range {p2 .. p2}, LT/l;->x()LT/f;

    move-result-object v11

    if-nez v11, :cond_c

    invoke-static {}, LT/j;->c()V

    :cond_c
    invoke-interface/range {p2 .. p2}, LT/l;->u()V

    invoke-interface/range {p2 .. p2}, LT/l;->o()Z

    move-result v11

    if-eqz v11, :cond_d

    invoke-interface {v13, v9}, LT/l;->D(Lmh/a;)V

    goto :goto_5

    :cond_d
    invoke-interface/range {p2 .. p2}, LT/l;->I()V

    :goto_5
    invoke-static/range {p2 .. p2}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v9

    invoke-virtual/range {v24 .. v24}, LE0/g$a;->e()Lmh/p;

    move-result-object v11

    invoke-static {v9, v0, v11}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v24 .. v24}, LE0/g$a;->g()Lmh/p;

    move-result-object v0

    invoke-static {v9, v2, v0}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v24 .. v24}, LE0/g$a;->b()Lmh/p;

    move-result-object v0

    invoke-interface {v9}, LT/l;->o()Z

    move-result v2

    if-nez v2, :cond_e

    invoke-interface {v9}, LT/l;->f()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v2, v11}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_f

    :cond_e
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v9, v2}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v9, v2, v0}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_f
    invoke-virtual/range {v24 .. v24}, LE0/g$a;->f()Lmh/p;

    move-result-object v0

    invoke-static {v9, v8, v0}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v6, v13, v2}, Lmh/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface/range {p2 .. p2}, LT/l;->R()V

    invoke-virtual {v14}, LN/H;->e()Z

    move-result v0

    invoke-interface {v13, v3}, LT/l;->c(Z)Z

    move-result v2

    invoke-interface {v13, v14}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v6

    or-int/2addr v2, v6

    invoke-interface {v13, v15}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v6

    or-int/2addr v2, v6

    invoke-interface/range {p2 .. p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v6

    if-nez v2, :cond_10

    sget-object v2, LT/l;->a:LT/l$a;

    invoke-virtual {v2}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v6, v2, :cond_11

    :cond_10
    new-instance v6, LN/G$a$b;

    invoke-direct {v6, v3, v14, v15}, LN/G$a$b;-><init>(ZLN/H;LIi/N;)V

    invoke-interface {v13, v6}, LT/l;->K(Ljava/lang/Object;)V

    :cond_11
    move-object v2, v6

    check-cast v2, Lmh/a;

    invoke-interface {v13, v1}, LT/l;->g(F)Z

    move-result v3

    invoke-interface {v13, v14}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v6

    or-int/2addr v3, v6

    invoke-interface/range {p2 .. p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v6

    if-nez v3, :cond_12

    sget-object v3, LT/l;->a:LT/l$a;

    invoke-virtual {v3}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v3

    if-ne v6, v3, :cond_13

    :cond_12
    new-instance v6, LN/G$a$c;

    const/4 v3, 0x0

    invoke-direct {v6, v1, v3, v14}, LN/G$a$c;-><init>(FFLN/H;)V

    invoke-interface {v13, v6}, LT/l;->K(Ljava/lang/Object;)V

    :cond_13
    move-object v3, v6

    check-cast v3, Lmh/a;

    const/4 v7, 0x0

    move v1, v0

    move-wide/from16 v8, v19

    move-object/from16 v6, p2

    move-object v0, v10

    move/from16 v10, v21

    move-object/from16 v11, v25

    invoke-static/range {v1 .. v7}, LN/G;->c(ZLmh/a;Lmh/a;JLT/l;I)V

    sget-object v1, LN/M0;->a:LN/M0$a;

    invoke-virtual {v1}, LN/M0$a;->e()I

    move-result v1

    const/4 v2, 0x6

    invoke-static {v1, v13, v2}, LN/N0;->a(ILT/l;I)Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Landroidx/compose/ui/platform/k0;->g()LT/H0;

    move-result-object v2

    invoke-interface {v13, v2}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LY0/d;

    invoke-static/range {v17 .. v18}, LY0/b;->n(J)I

    move-result v3

    invoke-interface {v2, v3}, LY0/d;->x(I)F

    move-result v3

    invoke-static/range {v17 .. v18}, LY0/b;->m(J)I

    move-result v4

    invoke-interface {v2, v4}, LY0/d;->x(I)F

    move-result v4

    invoke-static/range {v17 .. v18}, LY0/b;->l(J)I

    move-result v5

    invoke-interface {v2, v5}, LY0/d;->x(I)F

    move-result v5

    invoke-static/range {v17 .. v18}, LY0/b;->k(J)I

    move-result v6

    invoke-interface {v2, v6}, LY0/d;->x(I)F

    move-result v2

    invoke-static {v0, v3, v4, v5, v2}, Landroidx/compose/foundation/layout/r;->x(Landroidx/compose/ui/e;FFFF)Landroidx/compose/ui/e;

    move-result-object v0

    invoke-interface {v13, v14}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v2

    invoke-interface/range {p2 .. p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_14

    sget-object v2, LT/l;->a:LT/l$a;

    invoke-virtual {v2}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v3, v2, :cond_15

    :cond_14
    new-instance v3, LN/G$a$d;

    invoke-direct {v3, v14}, LN/G$a$d;-><init>(LN/H;)V

    invoke-interface {v13, v3}, LT/l;->K(Ljava/lang/Object;)V

    :cond_15
    check-cast v3, Lmh/l;

    invoke-static {v0, v3}, Landroidx/compose/foundation/layout/l;->a(Landroidx/compose/ui/e;Lmh/l;)Landroidx/compose/ui/e;

    move-result-object v16

    invoke-static {}, LN/G;->h()F

    move-result v19

    const/16 v21, 0xb

    const/16 v22, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v20, 0x0

    invoke-static/range {v16 .. v22}, Landroidx/compose/foundation/layout/o;->m(Landroidx/compose/ui/e;FFFFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v0

    invoke-interface {v13, v1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v2

    invoke-interface {v13, v14}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v2, v3

    invoke-interface {v13, v15}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v2, v3

    invoke-interface/range {p2 .. p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_16

    sget-object v2, LT/l;->a:LT/l$a;

    invoke-virtual {v2}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v3, v2, :cond_17

    :cond_16
    new-instance v3, LN/G$a$e;

    invoke-direct {v3, v1, v14, v15}, LN/G$a$e;-><init>(Ljava/lang/String;LN/H;LIi/N;)V

    invoke-interface {v13, v3}, LT/l;->K(Ljava/lang/Object;)V

    :cond_17
    check-cast v3, Lmh/l;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x1

    invoke-static {v0, v2, v3, v4, v1}, LJ0/m;->c(Landroidx/compose/ui/e;ZLmh/l;ILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    new-instance v0, LN/G$a$f;

    invoke-direct {v0, v11}, LN/G$a$f;-><init>(Lmh/q;)V

    const/16 v2, 0x36

    const v3, -0x73b4e307

    invoke-static {v3, v4, v0, v13, v2}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v0

    const/high16 v11, 0x180000

    const/16 v14, 0x10

    const/4 v7, 0x0

    move-object v2, v12

    move-wide/from16 v3, v26

    move-wide v5, v8

    move v8, v10

    move-object v9, v0

    move-object/from16 v10, p2

    move v12, v14

    invoke-static/range {v1 .. v12}, LN/O0;->a(Landroidx/compose/ui/e;Lm0/i1;JJLs/g;FLmh/p;LT/l;II)V

    invoke-interface/range {p2 .. p2}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_18

    invoke-static {}, LT/o;->P()V

    :cond_18
    :goto_6
    return-void

    :cond_19
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Drawer shouldn\'t have infinite width"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lz/f;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, LN/G$a;->a(Lz/f;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
