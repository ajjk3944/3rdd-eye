.class final LFe/g$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LFe/g;->b(Landroidx/compose/ui/e;JLmh/q;ZFLmh/q;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Z

.field final synthetic b:Lmh/q;

.field final synthetic c:Lmh/q;


# direct methods
.method constructor <init>(ZLmh/q;Lmh/q;)V
    .locals 0

    iput-boolean p1, p0, LFe/g$a;->a:Z

    iput-object p2, p0, LFe/g$a;->b:Lmh/q;

    iput-object p3, p0, LFe/g$a;->c:Lmh/q;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LT/l;I)V
    .locals 18

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

    goto/16 :goto_6

    :cond_1
    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result v3

    if-eqz v3, :cond_2

    const/4 v3, -0x1

    const-string v4, "com.ui.wifiman.ui.component.modal.ModalScaffold.<anonymous> (ModalScaffold.kt:38)"

    const v5, -0x589a670c

    invoke-static {v5, v2, v3, v4}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    iget-boolean v2, v0, LFe/g$a;->a:Z

    const/4 v3, 0x6

    const/4 v4, 0x0

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x0

    if-nez v2, :cond_7

    const v2, 0xef5ccf2

    invoke-interface {v1, v2}, LT/l;->U(I)V

    sget-object v2, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    invoke-static {v2, v6, v5, v4}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v2

    iget-object v4, v0, LFe/g$a;->b:Lmh/q;

    iget-object v5, v0, LFe/g$a;->c:Lmh/q;

    sget-object v6, Lz/c;->a:Lz/c;

    invoke-virtual {v6}, Lz/c;->g()Lz/c$m;

    move-result-object v6

    sget-object v8, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v8}, Lf0/c$a;->k()Lf0/c$b;

    move-result-object v8

    invoke-static {v6, v8, v1, v7}, Lz/h;->a(Lz/c$m;Lf0/c$b;LT/l;I)LC0/C;

    move-result-object v6

    invoke-static {v1, v7}, LT/j;->a(LT/l;I)I

    move-result v7

    invoke-interface/range {p1 .. p1}, LT/l;->G()LT/x;

    move-result-object v8

    invoke-static {v1, v2}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v2

    sget-object v9, LE0/g;->K:LE0/g$a;

    invoke-virtual {v9}, LE0/g$a;->a()Lmh/a;

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

    invoke-interface {v1, v10}, LT/l;->D(Lmh/a;)V

    goto :goto_1

    :cond_4
    invoke-interface/range {p1 .. p1}, LT/l;->I()V

    :goto_1
    invoke-static/range {p1 .. p1}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v10

    invoke-virtual {v9}, LE0/g$a;->e()Lmh/p;

    move-result-object v11

    invoke-static {v10, v6, v11}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v9}, LE0/g$a;->g()Lmh/p;

    move-result-object v6

    invoke-static {v10, v8, v6}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v9}, LE0/g$a;->b()Lmh/p;

    move-result-object v6

    invoke-interface {v10}, LT/l;->o()Z

    move-result v8

    if-nez v8, :cond_5

    invoke-interface {v10}, LT/l;->f()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v8, v11}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_6

    :cond_5
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-interface {v10, v8}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v10, v7, v6}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_6
    invoke-virtual {v9}, LE0/g$a;->f()Lmh/p;

    move-result-object v6

    invoke-static {v10, v2, v6}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v2, Lz/k;->a:Lz/k;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v4, v2, v1, v6}, Lmh/q;->s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v5, v2, v1, v3}, Lmh/q;->s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface/range {p1 .. p1}, LT/l;->R()V

    invoke-interface/range {p1 .. p1}, LT/l;->J()V

    goto/16 :goto_5

    :cond_7
    const v2, 0xef87901

    invoke-interface {v1, v2}, LT/l;->U(I)V

    sget-object v2, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    invoke-static {v2, v6, v5, v4}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v8

    iget-object v9, v0, LFe/g$a;->b:Lmh/q;

    iget-object v10, v0, LFe/g$a;->c:Lmh/q;

    sget-object v11, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v11}, Lf0/c$a;->o()Lf0/c;

    move-result-object v12

    invoke-static {v12, v7}, Landroidx/compose/foundation/layout/d;->h(Lf0/c;Z)LC0/C;

    move-result-object v12

    invoke-static {v1, v7}, LT/j;->a(LT/l;I)I

    move-result v13

    invoke-interface/range {p1 .. p1}, LT/l;->G()LT/x;

    move-result-object v14

    invoke-static {v1, v8}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v8

    sget-object v15, LE0/g;->K:LE0/g$a;

    invoke-virtual {v15}, LE0/g$a;->a()Lmh/a;

    move-result-object v3

    invoke-interface/range {p1 .. p1}, LT/l;->x()LT/f;

    move-result-object v16

    if-nez v16, :cond_8

    invoke-static {}, LT/j;->c()V

    :cond_8
    invoke-interface/range {p1 .. p1}, LT/l;->u()V

    invoke-interface/range {p1 .. p1}, LT/l;->o()Z

    move-result v16

    if-eqz v16, :cond_9

    invoke-interface {v1, v3}, LT/l;->D(Lmh/a;)V

    goto :goto_2

    :cond_9
    invoke-interface/range {p1 .. p1}, LT/l;->I()V

    :goto_2
    invoke-static/range {p1 .. p1}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v3

    invoke-virtual {v15}, LE0/g$a;->e()Lmh/p;

    move-result-object v7

    invoke-static {v3, v12, v7}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v15}, LE0/g$a;->g()Lmh/p;

    move-result-object v7

    invoke-static {v3, v14, v7}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v15}, LE0/g$a;->b()Lmh/p;

    move-result-object v7

    invoke-interface {v3}, LT/l;->o()Z

    move-result v12

    if-nez v12, :cond_a

    invoke-interface {v3}, LT/l;->f()Ljava/lang/Object;

    move-result-object v12

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v12, v14}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_b

    :cond_a
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-interface {v3, v12}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-interface {v3, v12, v7}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_b
    invoke-virtual {v15}, LE0/g$a;->f()Lmh/p;

    move-result-object v7

    invoke-static {v3, v8, v7}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v3, Landroidx/compose/foundation/layout/f;->a:Landroidx/compose/foundation/layout/f;

    invoke-static {v2, v6, v5, v4}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v3

    sget-object v7, Lz/c;->a:Lz/c;

    invoke-virtual {v7}, Lz/c;->g()Lz/c$m;

    move-result-object v8

    invoke-virtual {v11}, Lf0/c$a;->k()Lf0/c$b;

    move-result-object v12

    const/4 v13, 0x0

    invoke-static {v8, v12, v1, v13}, Lz/h;->a(Lz/c$m;Lf0/c$b;LT/l;I)LC0/C;

    move-result-object v8

    invoke-static {v1, v13}, LT/j;->a(LT/l;I)I

    move-result v12

    invoke-interface/range {p1 .. p1}, LT/l;->G()LT/x;

    move-result-object v13

    invoke-static {v1, v3}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v3

    invoke-virtual {v15}, LE0/g$a;->a()Lmh/a;

    move-result-object v14

    invoke-interface/range {p1 .. p1}, LT/l;->x()LT/f;

    move-result-object v17

    if-nez v17, :cond_c

    invoke-static {}, LT/j;->c()V

    :cond_c
    invoke-interface/range {p1 .. p1}, LT/l;->u()V

    invoke-interface/range {p1 .. p1}, LT/l;->o()Z

    move-result v17

    if-eqz v17, :cond_d

    invoke-interface {v1, v14}, LT/l;->D(Lmh/a;)V

    goto :goto_3

    :cond_d
    invoke-interface/range {p1 .. p1}, LT/l;->I()V

    :goto_3
    invoke-static/range {p1 .. p1}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v14

    invoke-virtual {v15}, LE0/g$a;->e()Lmh/p;

    move-result-object v4

    invoke-static {v14, v8, v4}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v15}, LE0/g$a;->g()Lmh/p;

    move-result-object v4

    invoke-static {v14, v13, v4}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v15}, LE0/g$a;->b()Lmh/p;

    move-result-object v4

    invoke-interface {v14}, LT/l;->o()Z

    move-result v8

    if-nez v8, :cond_e

    invoke-interface {v14}, LT/l;->f()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v8, v13}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_f

    :cond_e
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-interface {v14, v8}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-interface {v14, v8, v4}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_f
    invoke-virtual {v15}, LE0/g$a;->f()Lmh/p;

    move-result-object v4

    invoke-static {v14, v3, v4}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v3, Lz/k;->a:Lz/k;

    const/4 v4, 0x6

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-interface {v9, v3, v1, v8}, Lmh/q;->s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface/range {p1 .. p1}, LT/l;->R()V

    const/4 v4, 0x0

    invoke-static {v2, v6, v5, v4}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v2

    invoke-virtual {v7}, Lz/c;->g()Lz/c$m;

    move-result-object v4

    invoke-virtual {v11}, Lf0/c$a;->k()Lf0/c$b;

    move-result-object v5

    const/4 v6, 0x0

    invoke-static {v4, v5, v1, v6}, Lz/h;->a(Lz/c$m;Lf0/c$b;LT/l;I)LC0/C;

    move-result-object v4

    invoke-static {v1, v6}, LT/j;->a(LT/l;I)I

    move-result v5

    invoke-interface/range {p1 .. p1}, LT/l;->G()LT/x;

    move-result-object v6

    invoke-static {v1, v2}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v2

    invoke-virtual {v15}, LE0/g$a;->a()Lmh/a;

    move-result-object v7

    invoke-interface/range {p1 .. p1}, LT/l;->x()LT/f;

    move-result-object v8

    if-nez v8, :cond_10

    invoke-static {}, LT/j;->c()V

    :cond_10
    invoke-interface/range {p1 .. p1}, LT/l;->u()V

    invoke-interface/range {p1 .. p1}, LT/l;->o()Z

    move-result v8

    if-eqz v8, :cond_11

    invoke-interface {v1, v7}, LT/l;->D(Lmh/a;)V

    goto :goto_4

    :cond_11
    invoke-interface/range {p1 .. p1}, LT/l;->I()V

    :goto_4
    invoke-static/range {p1 .. p1}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v7

    invoke-virtual {v15}, LE0/g$a;->e()Lmh/p;

    move-result-object v8

    invoke-static {v7, v4, v8}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v15}, LE0/g$a;->g()Lmh/p;

    move-result-object v4

    invoke-static {v7, v6, v4}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v15}, LE0/g$a;->b()Lmh/p;

    move-result-object v4

    invoke-interface {v7}, LT/l;->o()Z

    move-result v6

    if-nez v6, :cond_12

    invoke-interface {v7}, LT/l;->f()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v6, v8}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_13

    :cond_12
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v7, v6}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v7, v5, v4}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_13
    invoke-virtual {v15}, LE0/g$a;->f()Lmh/p;

    move-result-object v4

    invoke-static {v7, v2, v4}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    const/4 v2, 0x6

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v10, v3, v1, v2}, Lmh/q;->s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface/range {p1 .. p1}, LT/l;->R()V

    invoke-interface/range {p1 .. p1}, LT/l;->R()V

    invoke-interface/range {p1 .. p1}, LT/l;->J()V

    :goto_5
    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_14

    invoke-static {}, LT/o;->P()V

    :cond_14
    :goto_6
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LFe/g$a;->a(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
