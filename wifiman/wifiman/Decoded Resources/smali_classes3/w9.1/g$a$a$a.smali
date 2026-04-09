.class final Lw9/g$a$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lw9/g$a$a;->a(LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lw9/b;

.field final synthetic b:Lz/N;

.field final synthetic c:Lz/c$e;

.field final synthetic d:Ls/G;

.field final synthetic e:Z

.field final synthetic f:Lmh/a;

.field final synthetic g:Z

.field final synthetic h:Ls9/b;

.field final synthetic i:J

.field final synthetic j:Ljava/lang/String;

.field final synthetic k:F

.field final synthetic l:J

.field final synthetic m:LL0/U;


# direct methods
.method constructor <init>(Lw9/b;Lz/N;Lz/c$e;Ls/G;ZLmh/a;ZLs9/b;JLjava/lang/String;FJLL0/U;)V
    .locals 0

    iput-object p1, p0, Lw9/g$a$a$a;->a:Lw9/b;

    iput-object p2, p0, Lw9/g$a$a$a;->b:Lz/N;

    iput-object p3, p0, Lw9/g$a$a$a;->c:Lz/c$e;

    iput-object p4, p0, Lw9/g$a$a$a;->d:Ls/G;

    iput-boolean p5, p0, Lw9/g$a$a$a;->e:Z

    iput-object p6, p0, Lw9/g$a$a$a;->f:Lmh/a;

    iput-boolean p7, p0, Lw9/g$a$a$a;->g:Z

    iput-object p8, p0, Lw9/g$a$a$a;->h:Ls9/b;

    iput-wide p9, p0, Lw9/g$a$a$a;->i:J

    iput-object p11, p0, Lw9/g$a$a$a;->j:Ljava/lang/String;

    iput p12, p0, Lw9/g$a$a$a;->k:F

    iput-wide p13, p0, Lw9/g$a$a$a;->l:J

    iput-object p15, p0, Lw9/g$a$a$a;->m:LL0/U;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LT/l;I)V
    .locals 26

    move-object/from16 v0, p0

    move-object/from16 v14, p1

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

    const-string/jumbo v3, "com.ui.core.ui.component.button.UiButton.<anonymous>.<anonymous>.<anonymous> (UiButton.kt:114)"

    const v4, -0x5e0b175f

    invoke-static {v4, v1, v2, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    const v1, -0x77233a9e

    invoke-interface {v14, v1}, LT/l;->U(I)V

    sget-object v11, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    iget-object v1, v0, Lw9/g$a$a$a;->a:Lw9/b;

    invoke-virtual {v1}, Lw9/b;->g()F

    move-result v1

    iget-object v2, v0, Lw9/g$a$a$a;->a:Lw9/b;

    invoke-virtual {v2}, Lw9/b;->e()F

    move-result v2

    invoke-static {v11, v1, v2}, Landroidx/compose/foundation/layout/r;->a(Landroidx/compose/ui/e;FF)Landroidx/compose/ui/e;

    move-result-object v1

    iget-object v2, v0, Lw9/g$a$a$a;->b:Lz/N;

    invoke-static {v1, v2}, Landroidx/compose/foundation/layout/o;->h(Landroidx/compose/ui/e;Lz/N;)Landroidx/compose/ui/e;

    move-result-object v15

    iget-object v1, v0, Lw9/g$a$a$a;->d:Ls/G;

    iget-boolean v2, v0, Lw9/g$a$a$a;->e:Z

    iget-object v3, v0, Lw9/g$a$a$a;->f:Lmh/a;

    const v4, -0x7723369a

    invoke-interface {v14, v4}, LT/l;->U(I)V

    if-eqz v1, :cond_4

    const v4, -0x3bc8cc4

    invoke-interface {v14, v4}, LT/l;->U(I)V

    invoke-interface/range {p1 .. p1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v4

    sget-object v5, LT/l;->a:LT/l$a;

    invoke-virtual {v5}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v5

    if-ne v4, v5, :cond_3

    invoke-static {}, Ly/l;->a()Ly/m;

    move-result-object v4

    invoke-interface {v14, v4}, LT/l;->K(Ljava/lang/Object;)V

    :cond_3
    move-object/from16 v16, v4

    check-cast v16, Ly/m;

    invoke-interface/range {p1 .. p1}, LT/l;->J()V

    const/16 v22, 0x18

    const/16 v23, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    move-object/from16 v17, v1

    move/from16 v18, v2

    move-object/from16 v21, v3

    invoke-static/range {v15 .. v23}, Landroidx/compose/foundation/d;->b(Landroidx/compose/ui/e;Ly/m;Ls/G;ZLjava/lang/String;LJ0/g;Lmh/a;ILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v15

    :cond_4
    invoke-interface/range {p1 .. p1}, LT/l;->J()V

    invoke-interface/range {p1 .. p1}, LT/l;->J()V

    iget-object v1, v0, Lw9/g$a$a$a;->c:Lz/c$e;

    sget-object v2, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v2}, Lf0/c$a;->i()Lf0/c$c;

    move-result-object v2

    iget-boolean v3, v0, Lw9/g$a$a$a;->g:Z

    iget-object v12, v0, Lw9/g$a$a$a;->h:Ls9/b;

    iget-object v13, v0, Lw9/g$a$a$a;->a:Lw9/b;

    iget-wide v9, v0, Lw9/g$a$a$a;->i:J

    iget-object v8, v0, Lw9/g$a$a$a;->j:Ljava/lang/String;

    iget v4, v0, Lw9/g$a$a$a;->k:F

    iget-wide v5, v0, Lw9/g$a$a$a;->l:J

    iget-object v7, v0, Lw9/g$a$a$a;->m:LL0/U;

    const/16 v0, 0x30

    invoke-static {v1, v2, v14, v0}, Lz/W;->b(Lz/c$e;Lf0/c$c;LT/l;I)LC0/C;

    move-result-object v0

    const/4 v2, 0x0

    invoke-static {v14, v2}, LT/j;->a(LT/l;I)I

    move-result v1

    invoke-interface/range {p1 .. p1}, LT/l;->G()LT/x;

    move-result-object v2

    invoke-static {v14, v15}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v15

    sget-object v16, LE0/g;->K:LE0/g$a;

    move-object/from16 v17, v7

    invoke-virtual/range {v16 .. v16}, LE0/g$a;->a()Lmh/a;

    move-result-object v7

    invoke-interface/range {p1 .. p1}, LT/l;->x()LT/f;

    move-result-object v18

    if-nez v18, :cond_5

    invoke-static {}, LT/j;->c()V

    :cond_5
    invoke-interface/range {p1 .. p1}, LT/l;->u()V

    invoke-interface/range {p1 .. p1}, LT/l;->o()Z

    move-result v18

    if-eqz v18, :cond_6

    invoke-interface {v14, v7}, LT/l;->D(Lmh/a;)V

    goto :goto_1

    :cond_6
    invoke-interface/range {p1 .. p1}, LT/l;->I()V

    :goto_1
    invoke-static/range {p1 .. p1}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v7

    move-object/from16 v18, v8

    invoke-virtual/range {v16 .. v16}, LE0/g$a;->e()Lmh/p;

    move-result-object v8

    invoke-static {v7, v0, v8}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v16 .. v16}, LE0/g$a;->g()Lmh/p;

    move-result-object v0

    invoke-static {v7, v2, v0}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v16 .. v16}, LE0/g$a;->b()Lmh/p;

    move-result-object v0

    invoke-interface {v7}, LT/l;->o()Z

    move-result v2

    if-nez v2, :cond_7

    invoke-interface {v7}, LT/l;->f()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v2, v8}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_8

    :cond_7
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v7, v2}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v7, v1, v0}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_8
    invoke-virtual/range {v16 .. v16}, LE0/g$a;->f()Lmh/p;

    move-result-object v0

    invoke-static {v7, v15, v0}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v1, Lz/Z;->a:Lz/Z;

    const/16 v23, 0xf

    const/16 v24, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    invoke-static/range {v19 .. v24}, Landroidx/compose/animation/g;->k(Lr/H;Lf0/c;ZLmh/l;ILjava/lang/Object;)Landroidx/compose/animation/i;

    move-result-object v0

    invoke-static/range {v19 .. v24}, Landroidx/compose/animation/g;->w(Lr/H;Lf0/c;ZLmh/l;ILjava/lang/Object;)Landroidx/compose/animation/k;

    move-result-object v7

    new-instance v2, Lw9/g$a$a$a$a;

    invoke-direct {v2, v4, v5, v6}, Lw9/g$a$a$a$a;-><init>(FJ)V

    const/16 v4, 0x36

    const v5, -0x3caee81b

    const/4 v6, 0x1

    invoke-static {v5, v6, v2, v14, v4}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v8

    const v15, 0x186c06

    const/16 v16, 0x12

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v5, 0x0

    move v2, v3

    move-object v3, v4

    move-object v4, v0

    move v0, v5

    move-object v5, v7

    move-object/from16 v21, v17

    move-object v7, v8

    move-object/from16 v22, v18

    move-object/from16 v8, p1

    move-wide/from16 v17, v9

    move v9, v15

    move/from16 v10, v16

    invoke-static/range {v1 .. v10}, Lq/d;->e(Lz/Y;ZLandroidx/compose/ui/e;Landroidx/compose/animation/i;Landroidx/compose/animation/k;Ljava/lang/String;Lmh/q;LT/l;II)V

    const v1, -0x3bc1225

    invoke-interface {v14, v1}, LT/l;->U(I)V

    if-nez v12, :cond_9

    goto :goto_2

    :cond_9
    invoke-virtual {v13}, Lw9/b;->f()F

    move-result v1

    invoke-static {v11, v1}, Landroidx/compose/foundation/layout/r;->v(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v2

    invoke-static/range {v17 .. v18}, Lm0/v0;->g(J)Lm0/v0;

    move-result-object v3

    const/4 v6, 0x0

    const/4 v7, 0x4

    const/4 v4, 0x0

    move-object v1, v12

    move-object/from16 v5, p1

    invoke-static/range {v1 .. v7}, Lta/c;->c(Ls9/b;Landroidx/compose/ui/e;Lm0/v0;Ljava/lang/String;LT/l;II)V

    :goto_2
    invoke-interface/range {p1 .. p1}, LT/l;->J()V

    const v1, -0x3bbfea1

    invoke-interface {v14, v1}, LT/l;->U(I)V

    if-eqz v12, :cond_a

    if-eqz v22, :cond_a

    invoke-virtual {v13}, Lw9/b;->c()F

    move-result v1

    invoke-static {v11, v1}, Landroidx/compose/foundation/layout/r;->z(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v1

    invoke-static {v1, v14, v0}, Lz/a0;->a(Landroidx/compose/ui/e;LT/l;I)V

    :cond_a
    invoke-interface/range {p1 .. p1}, LT/l;->J()V

    const v0, -0x3bbe9c1

    invoke-interface {v14, v0}, LT/l;->U(I)V

    if-nez v22, :cond_b

    goto :goto_3

    :cond_b
    const/16 v24, 0x0

    const v25, 0xfffe

    const/4 v2, 0x0

    const-wide/16 v3, 0x0

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const-wide/16 v0, 0x0

    move-wide v14, v0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v23, 0x0

    move-object/from16 v1, v22

    move-object/from16 v22, p1

    invoke-static/range {v1 .. v25}, LN/a1;->b(Ljava/lang/String;Landroidx/compose/ui/e;JJLQ0/v;LQ0/A;LQ0/k;JLW0/k;LW0/j;JIZIILmh/l;LL0/U;LT/l;III)V

    :goto_3
    invoke-interface/range {p1 .. p1}, LT/l;->J()V

    invoke-interface/range {p1 .. p1}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_c

    invoke-static {}, LT/o;->P()V

    :cond_c
    :goto_4
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lw9/g$a$a$a;->a(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
