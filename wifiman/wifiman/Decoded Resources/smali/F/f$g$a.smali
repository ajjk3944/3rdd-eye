.class final LF/f$g$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF/f$g;->a(LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LH/k;

.field final synthetic b:LI/l1;

.field final synthetic c:LL0/U;

.field final synthetic d:Z

.field final synthetic e:Z

.field final synthetic f:Z

.field final synthetic g:LI/o1;

.field final synthetic h:LJ/j;

.field final synthetic i:Lm0/l0;

.field final synthetic j:Z

.field final synthetic k:Z

.field final synthetic l:Landroidx/compose/foundation/o;

.field final synthetic m:Lw/q;

.field final synthetic n:Z

.field final synthetic o:Lmh/p;


# direct methods
.method constructor <init>(LH/k;LI/l1;LL0/U;ZZZLI/o1;LJ/j;Lm0/l0;ZZLandroidx/compose/foundation/o;Lw/q;ZLmh/p;)V
    .locals 0

    iput-object p1, p0, LF/f$g$a;->a:LH/k;

    iput-object p2, p0, LF/f$g$a;->b:LI/l1;

    iput-object p3, p0, LF/f$g$a;->c:LL0/U;

    iput-boolean p4, p0, LF/f$g$a;->d:Z

    iput-boolean p5, p0, LF/f$g$a;->e:Z

    iput-boolean p6, p0, LF/f$g$a;->f:Z

    iput-object p7, p0, LF/f$g$a;->g:LI/o1;

    iput-object p8, p0, LF/f$g$a;->h:LJ/j;

    iput-object p9, p0, LF/f$g$a;->i:Lm0/l0;

    iput-boolean p10, p0, LF/f$g$a;->j:Z

    iput-boolean p11, p0, LF/f$g$a;->k:Z

    iput-object p12, p0, LF/f$g$a;->l:Landroidx/compose/foundation/o;

    iput-object p13, p0, LF/f$g$a;->m:Lw/q;

    iput-boolean p14, p0, LF/f$g$a;->n:Z

    iput-object p15, p0, LF/f$g$a;->o:Lmh/p;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LT/l;I)V
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p2

    and-int/lit8 v3, v2, 0x3

    const/4 v4, 0x2

    if-ne v3, v4, :cond_1

    invoke-interface/range {p1 .. p1}, LT/l;->v()Z

    move-result v3

    if-nez v3, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface/range {p1 .. p1}, LT/l;->C()V

    goto/16 :goto_7

    :cond_1
    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result v3

    if-eqz v3, :cond_2

    const/4 v3, -0x1

    const-string v5, "androidx.compose.foundation.text.BasicTextField.<anonymous>.<anonymous>.<anonymous> (BasicTextField.kt:346)"

    const v6, 0x755f253e

    invoke-static {v6, v2, v3, v5}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    iget-object v2, v0, LF/f$g$a;->a:LH/k;

    instance-of v3, v2, LH/k$b;

    const/4 v5, 0x1

    if-eqz v3, :cond_3

    check-cast v2, LH/k$b;

    invoke-virtual {v2}, LH/k$b;->b()I

    move-result v2

    iget-object v3, v0, LF/f$g$a;->a:LH/k;

    check-cast v3, LH/k$b;

    invoke-virtual {v3}, LH/k$b;->a()I

    move-result v3

    goto :goto_1

    :cond_3
    move v2, v5

    move v3, v2

    :goto_1
    sget-object v6, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    iget-object v7, v0, LF/f$g$a;->b:LI/l1;

    invoke-virtual {v7}, LI/l1;->g()F

    move-result v7

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static {v6, v7, v8, v4, v9}, Landroidx/compose/foundation/layout/r;->k(Landroidx/compose/ui/e;FFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v4

    iget-object v7, v0, LF/f$g$a;->c:LL0/U;

    invoke-static {v4, v7, v2, v3}, LF/r;->a(Landroidx/compose/ui/e;LL0/U;II)Landroidx/compose/ui/e;

    move-result-object v2

    iget-object v3, v0, LF/f$g$a;->c:LL0/U;

    invoke-static {v2, v3}, LF/h0;->a(Landroidx/compose/ui/e;LL0/U;)Landroidx/compose/ui/e;

    move-result-object v2

    invoke-static {v2}, Lj0/e;->b(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v2

    new-instance v3, Landroidx/compose/foundation/text/input/internal/TextFieldCoreModifier;

    iget-boolean v4, v0, LF/f$g$a;->d:Z

    const/4 v15, 0x0

    if-eqz v4, :cond_4

    iget-boolean v4, v0, LF/f$g$a;->e:Z

    if-eqz v4, :cond_4

    move v8, v5

    goto :goto_2

    :cond_4
    move v8, v15

    :goto_2
    iget-boolean v9, v0, LF/f$g$a;->f:Z

    iget-object v10, v0, LF/f$g$a;->b:LI/l1;

    iget-object v11, v0, LF/f$g$a;->g:LI/o1;

    iget-object v12, v0, LF/f$g$a;->h:LJ/j;

    iget-object v13, v0, LF/f$g$a;->i:Lm0/l0;

    iget-boolean v4, v0, LF/f$g$a;->j:Z

    if-eqz v4, :cond_5

    iget-boolean v4, v0, LF/f$g$a;->k:Z

    if-nez v4, :cond_5

    move v14, v5

    goto :goto_3

    :cond_5
    move v14, v15

    :goto_3
    iget-object v4, v0, LF/f$g$a;->l:Landroidx/compose/foundation/o;

    iget-object v7, v0, LF/f$g$a;->m:Lw/q;

    move-object/from16 v16, v7

    move-object v7, v3

    move-object v15, v4

    invoke-direct/range {v7 .. v16}, Landroidx/compose/foundation/text/input/internal/TextFieldCoreModifier;-><init>(ZZLI/l1;LI/o1;LJ/j;Lm0/l0;ZLandroidx/compose/foundation/o;Lw/q;)V

    invoke-interface {v2, v3}, Landroidx/compose/ui/e;->b0(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v2

    iget-object v8, v0, LF/f$g$a;->b:LI/l1;

    iget-object v9, v0, LF/f$g$a;->g:LI/o1;

    iget-object v10, v0, LF/f$g$a;->c:LL0/U;

    iget-boolean v11, v0, LF/f$g$a;->n:Z

    iget-object v12, v0, LF/f$g$a;->o:Lmh/p;

    iget-boolean v3, v0, LF/f$g$a;->j:Z

    iget-boolean v4, v0, LF/f$g$a;->d:Z

    iget-boolean v13, v0, LF/f$g$a;->e:Z

    iget-object v14, v0, LF/f$g$a;->h:LJ/j;

    iget-boolean v15, v0, LF/f$g$a;->k:Z

    sget-object v7, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v7}, Lf0/c$a;->o()Lf0/c;

    move-result-object v7

    invoke-static {v7, v5}, Landroidx/compose/foundation/layout/d;->h(Lf0/c;Z)LC0/C;

    move-result-object v5

    const/4 v7, 0x0

    invoke-static {v1, v7}, LT/j;->a(LT/l;I)I

    move-result v16

    invoke-interface/range {p1 .. p1}, LT/l;->G()LT/x;

    move-result-object v7

    invoke-static {v1, v2}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v2

    sget-object v17, LE0/g;->K:LE0/g$a;

    invoke-virtual/range {v17 .. v17}, LE0/g$a;->a()Lmh/a;

    move-result-object v0

    invoke-interface/range {p1 .. p1}, LT/l;->x()LT/f;

    move-result-object v18

    if-nez v18, :cond_6

    invoke-static {}, LT/j;->c()V

    :cond_6
    invoke-interface/range {p1 .. p1}, LT/l;->u()V

    invoke-interface/range {p1 .. p1}, LT/l;->o()Z

    move-result v18

    if-eqz v18, :cond_7

    invoke-interface {v1, v0}, LT/l;->D(Lmh/a;)V

    goto :goto_4

    :cond_7
    invoke-interface/range {p1 .. p1}, LT/l;->I()V

    :goto_4
    invoke-static/range {p1 .. p1}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v0

    move/from16 v18, v15

    invoke-virtual/range {v17 .. v17}, LE0/g$a;->e()Lmh/p;

    move-result-object v15

    invoke-static {v0, v5, v15}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v17 .. v17}, LE0/g$a;->g()Lmh/p;

    move-result-object v5

    invoke-static {v0, v7, v5}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v17 .. v17}, LE0/g$a;->b()Lmh/p;

    move-result-object v5

    invoke-interface {v0}, LT/l;->o()Z

    move-result v7

    if-nez v7, :cond_8

    invoke-interface {v0}, LT/l;->f()Ljava/lang/Object;

    move-result-object v7

    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-static {v7, v15}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_9

    :cond_8
    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v0, v7}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v0, v7, v5}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_9
    invoke-virtual/range {v17 .. v17}, LE0/g$a;->f()Lmh/p;

    move-result-object v5

    invoke-static {v0, v2, v5}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v0, Landroidx/compose/foundation/layout/f;->a:Landroidx/compose/foundation/layout/f;

    invoke-virtual {v8}, LI/l1;->c()LD/b;

    move-result-object v0

    invoke-static {v6, v0}, Landroidx/compose/foundation/relocation/b;->b(Landroidx/compose/ui/e;LD/b;)Landroidx/compose/ui/e;

    move-result-object v0

    new-instance v2, Landroidx/compose/foundation/text/input/internal/TextFieldTextLayoutModifier;

    const/4 v5, 0x0

    move-object v7, v2

    invoke-direct/range {v7 .. v12}, Landroidx/compose/foundation/text/input/internal/TextFieldTextLayoutModifier;-><init>(LI/l1;LI/o1;LL0/U;ZLmh/p;)V

    invoke-interface {v0, v2}, Landroidx/compose/ui/e;->b0(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v0

    invoke-static {v0, v1, v5}, Landroidx/compose/foundation/layout/d;->a(Landroidx/compose/ui/e;LT/l;I)V

    if-eqz v3, :cond_b

    if-eqz v4, :cond_b

    if-eqz v13, :cond_b

    invoke-virtual {v14}, LJ/j;->j0()Z

    move-result v0

    if-eqz v0, :cond_b

    const v0, -0x4f01fe46

    invoke-interface {v1, v0}, LT/l;->U(I)V

    invoke-static {v14, v1, v5}, LF/f;->k(LJ/j;LT/l;I)V

    if-nez v18, :cond_a

    const v0, -0x4eff42f5

    invoke-interface {v1, v0}, LT/l;->U(I)V

    invoke-static {v14, v1, v5}, LF/f;->i(LJ/j;LT/l;I)V

    invoke-interface/range {p1 .. p1}, LT/l;->J()V

    goto :goto_5

    :cond_a
    const v0, -0x4efc9b80

    invoke-interface {v1, v0}, LT/l;->U(I)V

    invoke-interface/range {p1 .. p1}, LT/l;->J()V

    :goto_5
    invoke-interface/range {p1 .. p1}, LT/l;->J()V

    goto :goto_6

    :cond_b
    const v0, -0x4efc4640

    invoke-interface {v1, v0}, LT/l;->U(I)V

    invoke-interface/range {p1 .. p1}, LT/l;->J()V

    :goto_6
    invoke-interface/range {p1 .. p1}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_c

    invoke-static {}, LT/o;->P()V

    :cond_c
    :goto_7
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LF/f$g$a;->a(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
