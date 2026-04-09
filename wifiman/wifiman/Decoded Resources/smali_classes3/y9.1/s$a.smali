.class final Ly9/s$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ly9/s;->b(Ly9/f;JLandroidx/compose/ui/window/i;Lmh/a;Lmh/p;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ly9/s$a$b;
    }
.end annotation


# instance fields
.field final synthetic a:Ly9/f;

.field final synthetic b:Lmh/a;

.field final synthetic c:J

.field final synthetic d:Lmh/p;


# direct methods
.method constructor <init>(Ly9/f;Lmh/a;JLmh/p;)V
    .locals 0

    iput-object p1, p0, Ly9/s$a;->a:Ly9/f;

    iput-object p2, p0, Ly9/s$a;->b:Lmh/a;

    iput-wide p3, p0, Ly9/s$a;->c:J

    iput-object p5, p0, Ly9/s$a;->d:Lmh/p;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LT/l;I)V
    .locals 26

    move-object/from16 v0, p0

    move-object/from16 v13, p1

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

    goto/16 :goto_8

    :cond_1
    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, -0x1

    const-string/jumbo v4, "com.ui.core.ui.component.dialog.UiDialog.<anonymous> (UiDialog.kt:56)"

    const v5, 0x10641aee

    invoke-static {v5, v1, v2, v4}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    iget-object v1, v0, Ly9/s$a;->a:Ly9/f;

    sget-object v2, Ly9/s$a$b;->a:[I

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v1, v2, v1

    const/16 v4, 0x10

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/4 v12, 0x1

    const/4 v5, 0x3

    if-eq v1, v12, :cond_5

    if-eq v1, v3, :cond_4

    if-ne v1, v5, :cond_3

    goto :goto_1

    :cond_3
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :cond_4
    :goto_1
    sget-object v1, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    invoke-static {v1, v15, v12, v14}, Landroidx/compose/foundation/layout/r;->f(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    goto :goto_2

    :cond_5
    sget-object v1, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    int-to-float v6, v4

    invoke-static {v6}, LY0/h;->j(F)F

    move-result v6

    invoke-static {v1, v6, v15, v3, v14}, Landroidx/compose/foundation/layout/o;->k(Landroidx/compose/ui/e;FFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    :goto_2
    iget-object v11, v0, Ly9/s$a;->a:Ly9/f;

    iget-object v10, v0, Ly9/s$a;->b:Lmh/a;

    iget-wide v6, v0, Ly9/s$a;->c:J

    iget-object v8, v0, Ly9/s$a;->d:Lmh/p;

    sget-object v9, Lz/c;->a:Lz/c;

    invoke-virtual {v9}, Lz/c;->g()Lz/c$m;

    move-result-object v9

    sget-object v16, Lf0/c;->a:Lf0/c$a;

    invoke-virtual/range {v16 .. v16}, Lf0/c$a;->k()Lf0/c$b;

    move-result-object v5

    const/4 v3, 0x0

    invoke-static {v9, v5, v13, v3}, Lz/h;->a(Lz/c$m;Lf0/c$b;LT/l;I)LC0/C;

    move-result-object v5

    invoke-static {v13, v3}, LT/j;->a(LT/l;I)I

    move-result v9

    invoke-interface/range {p1 .. p1}, LT/l;->G()LT/x;

    move-result-object v4

    invoke-static {v13, v1}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v1

    sget-object v16, LE0/g;->K:LE0/g$a;

    invoke-virtual/range {v16 .. v16}, LE0/g$a;->a()Lmh/a;

    move-result-object v3

    invoke-interface/range {p1 .. p1}, LT/l;->x()LT/f;

    move-result-object v17

    if-nez v17, :cond_6

    invoke-static {}, LT/j;->c()V

    :cond_6
    invoke-interface/range {p1 .. p1}, LT/l;->u()V

    invoke-interface/range {p1 .. p1}, LT/l;->o()Z

    move-result v17

    if-eqz v17, :cond_7

    invoke-interface {v13, v3}, LT/l;->D(Lmh/a;)V

    goto :goto_3

    :cond_7
    invoke-interface/range {p1 .. p1}, LT/l;->I()V

    :goto_3
    invoke-static/range {p1 .. p1}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v3

    invoke-virtual/range {v16 .. v16}, LE0/g$a;->e()Lmh/p;

    move-result-object v12

    invoke-static {v3, v5, v12}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v16 .. v16}, LE0/g$a;->g()Lmh/p;

    move-result-object v5

    invoke-static {v3, v4, v5}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v16 .. v16}, LE0/g$a;->b()Lmh/p;

    move-result-object v4

    invoke-interface {v3}, LT/l;->o()Z

    move-result v5

    if-nez v5, :cond_8

    invoke-interface {v3}, LT/l;->f()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v5, v12}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_9

    :cond_8
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v3, v5}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v3, v5, v4}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_9
    invoke-virtual/range {v16 .. v16}, LE0/g$a;->f()Lmh/p;

    move-result-object v4

    invoke-static {v3, v1, v4}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v12, Lz/k;->a:Lz/k;

    const v1, 0x1851be2f

    invoke-interface {v13, v1}, LT/l;->U(I)V

    sget-object v9, Ly9/f;->DEFAULT:Ly9/f;

    const/high16 v5, 0x3f800000    # 1.0f

    if-eq v11, v9, :cond_d

    sget-object v1, Ly9/f;->TOP:Ly9/f;

    if-ne v11, v1, :cond_a

    goto :goto_4

    :cond_a
    sget-object v1, Ly9/f;->BOTTOM:Ly9/f;

    if-ne v11, v1, :cond_c

    sget-object v1, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/4 v3, 0x1

    invoke-static {v1, v15, v3, v14}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    invoke-interface {v12, v1, v5, v3}, Lz/j;->a(Landroidx/compose/ui/e;FZ)Landroidx/compose/ui/e;

    move-result-object v16

    const v1, 0x1851fcde

    invoke-interface {v13, v1}, LT/l;->U(I)V

    invoke-interface/range {p1 .. p1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v1

    sget-object v3, LT/l;->a:LT/l$a;

    invoke-virtual {v3}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v3

    if-ne v1, v3, :cond_b

    invoke-static {}, Ly/l;->a()Ly/m;

    move-result-object v1

    invoke-interface {v13, v1}, LT/l;->K(Ljava/lang/Object;)V

    :cond_b
    move-object/from16 v17, v1

    check-cast v17, Ly/m;

    invoke-interface/range {p1 .. p1}, LT/l;->J()V

    const/16 v23, 0x18

    const/16 v24, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x1

    const/16 v20, 0x0

    const/16 v21, 0x0

    move-object/from16 v22, v10

    invoke-static/range {v16 .. v24}, Landroidx/compose/foundation/d;->b(Landroidx/compose/ui/e;Ly/m;Ls/G;ZLjava/lang/String;LJ0/g;Lmh/a;ILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    const/4 v3, 0x0

    invoke-static {v1, v13, v3}, Lz/a0;->a(Landroidx/compose/ui/e;LT/l;I)V

    goto :goto_4

    :cond_c
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :cond_d
    :goto_4
    invoke-interface/range {p1 .. p1}, LT/l;->J()V

    const/16 v1, 0x10

    int-to-float v1, v1

    invoke-static {v1}, LY0/h;->j(F)F

    move-result v1

    invoke-virtual {v11}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v2, v2, v3

    const/4 v3, 0x1

    if-eq v2, v3, :cond_10

    const/4 v3, 0x2

    if-eq v2, v3, :cond_f

    const/4 v3, 0x3

    if-ne v2, v3, :cond_e

    const/4 v3, 0x0

    int-to-float v2, v3

    invoke-static {v2}, LY0/h;->j(F)F

    move-result v4

    invoke-static {v2}, LY0/h;->j(F)F

    move-result v2

    invoke-static {v4, v2, v1, v1}, LE/h;->e(FFFF)LE/g;

    move-result-object v1

    :goto_5
    move-object v2, v1

    goto :goto_6

    :cond_e
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :cond_f
    const/4 v3, 0x0

    int-to-float v2, v3

    invoke-static {v2}, LY0/h;->j(F)F

    move-result v4

    invoke-static {v2}, LY0/h;->j(F)F

    move-result v2

    invoke-static {v1, v1, v2, v4}, LE/h;->e(FFFF)LE/g;

    move-result-object v1

    goto :goto_5

    :cond_10
    const/4 v3, 0x0

    invoke-static {v1}, LE/h;->d(F)LE/g;

    move-result-object v1

    goto :goto_5

    :goto_6
    const/16 v1, 0x8

    int-to-float v1, v1

    invoke-static {v1}, LY0/h;->j(F)F

    move-result v16

    new-instance v1, Ly9/s$a$a;

    invoke-direct {v1, v8}, Ly9/s$a$a;-><init>(Lmh/p;)V

    const/16 v4, 0x36

    const v8, 0x702af075

    const/4 v14, 0x1

    invoke-static {v8, v14, v1, v13, v4}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v17

    const/high16 v18, 0x1b0000

    const/16 v19, 0x19

    const/4 v1, 0x0

    const-wide/16 v20, 0x0

    const/4 v8, 0x0

    move v14, v3

    move-wide v3, v6

    move v7, v5

    move-wide/from16 v5, v20

    move v14, v7

    move-object v7, v8

    move/from16 v8, v16

    move-object v14, v9

    move-object/from16 v9, v17

    move-object/from16 v22, v10

    move-object/from16 v10, p1

    move-object v15, v11

    move/from16 v11, v18

    move-object/from16 v25, v12

    const/4 v0, 0x1

    move/from16 v12, v19

    invoke-static/range {v1 .. v12}, LN/h;->a(Landroidx/compose/ui/e;Lm0/i1;JJLs/g;FLmh/p;LT/l;II)V

    const v1, 0x18528ccf

    invoke-interface {v13, v1}, LT/l;->U(I)V

    if-eq v15, v14, :cond_14

    sget-object v1, Ly9/f;->BOTTOM:Ly9/f;

    if-ne v15, v1, :cond_11

    goto :goto_7

    :cond_11
    sget-object v1, Ly9/f;->TOP:Ly9/f;

    if-ne v15, v1, :cond_13

    sget-object v1, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v1, v3, v0, v2}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    move-object/from16 v2, v25

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-interface {v2, v1, v3, v0}, Lz/j;->a(Landroidx/compose/ui/e;FZ)Landroidx/compose/ui/e;

    move-result-object v16

    const v0, 0x1852cb7e

    invoke-interface {v13, v0}, LT/l;->U(I)V

    invoke-interface/range {p1 .. p1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, LT/l;->a:LT/l$a;

    invoke-virtual {v1}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v0, v1, :cond_12

    invoke-static {}, Ly/l;->a()Ly/m;

    move-result-object v0

    invoke-interface {v13, v0}, LT/l;->K(Ljava/lang/Object;)V

    :cond_12
    move-object/from16 v17, v0

    check-cast v17, Ly/m;

    invoke-interface/range {p1 .. p1}, LT/l;->J()V

    const/16 v23, 0x18

    const/16 v24, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x1

    const/16 v20, 0x0

    const/16 v21, 0x0

    invoke-static/range {v16 .. v24}, Landroidx/compose/foundation/d;->b(Landroidx/compose/ui/e;Ly/m;Ls/G;ZLjava/lang/String;LJ0/g;Lmh/a;ILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v13, v1}, Lz/a0;->a(Landroidx/compose/ui/e;LT/l;I)V

    goto :goto_7

    :cond_13
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_14
    :goto_7
    invoke-interface/range {p1 .. p1}, LT/l;->J()V

    invoke-interface/range {p1 .. p1}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_15

    invoke-static {}, LT/o;->P()V

    :cond_15
    :goto_8
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Ly9/s$a;->a(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
