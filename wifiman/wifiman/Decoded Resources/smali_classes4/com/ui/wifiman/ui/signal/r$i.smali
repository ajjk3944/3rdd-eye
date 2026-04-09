.class public final Lcom/ui/wifiman/ui/signal/r$i;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/r;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/ui/signal/r;->e(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/signal/m;Lcom/ui/wifiman/ui/signal/l$a;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/util/List;

.field final synthetic b:Lcom/ui/wifiman/ui/signal/m;


# direct methods
.method public constructor <init>(Ljava/util/List;Lcom/ui/wifiman/ui/signal/m;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/ui/signal/r$i;->a:Ljava/util/List;

    iput-object p2, p0, Lcom/ui/wifiman/ui/signal/r$i;->b:Lcom/ui/wifiman/ui/signal/m;

    const/4 p1, 0x4

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LA/c;ILT/l;I)V
    .locals 14

    move-object v0, p0

    move-object v1, p1

    move/from16 v2, p2

    move-object/from16 v13, p3

    and-int/lit8 v3, p4, 0x6

    const/4 v4, 0x4

    if-nez v3, :cond_1

    invoke-interface {v13, p1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    move v3, v4

    goto :goto_0

    :cond_0
    const/4 v3, 0x2

    :goto_0
    or-int v3, p4, v3

    goto :goto_1

    :cond_1
    move/from16 v3, p4

    :goto_1
    and-int/lit8 v5, p4, 0x30

    if-nez v5, :cond_3

    invoke-interface {v13, v2}, LT/l;->i(I)Z

    move-result v5

    if-eqz v5, :cond_2

    const/16 v5, 0x20

    goto :goto_2

    :cond_2
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v3, v5

    :cond_3
    and-int/lit16 v5, v3, 0x93

    const/16 v6, 0x92

    if-ne v5, v6, :cond_5

    invoke-interface/range {p3 .. p3}, LT/l;->v()Z

    move-result v5

    if-nez v5, :cond_4

    goto :goto_3

    :cond_4
    invoke-interface/range {p3 .. p3}, LT/l;->C()V

    goto/16 :goto_5

    :cond_5
    :goto_3
    invoke-static {}, LT/o;->H()Z

    move-result v5

    if-eqz v5, :cond_6

    const/4 v5, -0x1

    const-string v6, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:152)"

    const v7, -0x25b7f321

    invoke-static {v7, v3, v5, v6}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_6
    iget-object v3, v0, Lcom/ui/wifiman/ui/signal/r$i;->a:Ljava/util/List;

    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ui/wifiman/ui/signal/c;

    const v3, -0x7257f0dd

    invoke-interface {v13, v3}, LT/l;->U(I)V

    instance-of v3, v2, Lcom/ui/wifiman/ui/signal/c$d;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x1

    if-eqz v3, :cond_9

    const v3, -0x72582afe

    invoke-interface {v13, v3}, LT/l;->U(I)V

    sget-object v3, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    invoke-static {v3, v5, v8, v7}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v3

    sget-object v4, Lla/a;->a:Lla/a;

    sget v5, Lla/a;->b:I

    invoke-virtual {v4, v13, v5}, Lla/a;->d(LT/l;I)Lra/a;

    move-result-object v9

    invoke-virtual {v9}, Lra/a;->a()Lra/b;

    move-result-object v9

    invoke-virtual {v9}, Lra/b;->a()Lra/b$a$a;

    move-result-object v9

    invoke-virtual {v9}, Lra/b$a$a;->d()F

    move-result v9

    invoke-virtual {v4, v13, v5}, Lla/a;->d(LT/l;I)Lra/a;

    move-result-object v10

    invoke-virtual {v10}, Lra/a;->a()Lra/b;

    move-result-object v10

    invoke-virtual {v10}, Lra/b;->a()Lra/b$a$a;

    move-result-object v10

    invoke-virtual {v10}, Lra/b$a$a;->d()F

    move-result v10

    invoke-virtual {v4, v13, v5}, Lla/a;->d(LT/l;I)Lra/a;

    move-result-object v11

    invoke-virtual {v11}, Lra/a;->a()Lra/b;

    move-result-object v11

    invoke-virtual {v11}, Lra/b;->b()Lra/b$a$b;

    move-result-object v11

    invoke-virtual {v11}, Lra/b$a$b;->d()F

    move-result v11

    invoke-virtual {v4, v13, v5}, Lla/a;->d(LT/l;I)Lra/a;

    move-result-object v4

    invoke-virtual {v4}, Lra/a;->a()Lra/b;

    move-result-object v4

    invoke-virtual {v4}, Lra/b;->b()Lra/b$a$b;

    move-result-object v4

    invoke-virtual {v4}, Lra/b$a$b;->c()F

    move-result v4

    invoke-static {v3, v9, v11, v10, v4}, Landroidx/compose/foundation/layout/o;->l(Landroidx/compose/ui/e;FFFF)Landroidx/compose/ui/e;

    move-result-object v3

    invoke-static {p1, v3, v7, v8, v7}, LA/c;->b(LA/c;Landroidx/compose/ui/e;Lr/H;ILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    sget v3, Lm8/c;->s2:I

    invoke-static {v3, v13, v6}, LH0/f;->a(ILT/l;I)Ljava/lang/String;

    move-result-object v7

    const v3, -0x1c76260c

    invoke-interface {v13, v3}, LT/l;->U(I)V

    iget-object v3, v0, Lcom/ui/wifiman/ui/signal/r$i;->b:Lcom/ui/wifiman/ui/signal/m;

    invoke-interface {v13, v3}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v3

    invoke-interface/range {p3 .. p3}, LT/l;->f()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_7

    sget-object v3, LT/l;->a:LT/l$a;

    invoke-virtual {v3}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v3

    if-ne v4, v3, :cond_8

    :cond_7
    new-instance v4, Lcom/ui/wifiman/ui/signal/r$a;

    iget-object v3, v0, Lcom/ui/wifiman/ui/signal/r$i;->b:Lcom/ui/wifiman/ui/signal/m;

    invoke-direct {v4, v3}, Lcom/ui/wifiman/ui/signal/r$a;-><init>(Ljava/lang/Object;)V

    invoke-interface {v13, v4}, LT/l;->K(Ljava/lang/Object;)V

    :cond_8
    check-cast v4, Lth/g;

    invoke-interface/range {p3 .. p3}, LT/l;->J()V

    check-cast v2, Lcom/ui/wifiman/ui/signal/c$d;

    invoke-virtual {v2}, Lcom/ui/wifiman/ui/signal/c$d;->c()Z

    move-result v3

    move-object v2, v4

    check-cast v2, Lmh/a;

    const/4 v10, 0x0

    const/16 v11, 0xb8

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    move-object/from16 v9, p3

    invoke-static/range {v1 .. v11}, Lw9/r;->b(Landroidx/compose/ui/e;Lmh/a;ZZLs9/b;Lw9/p;Ljava/lang/String;LL0/U;LT/l;II)V

    invoke-interface/range {p3 .. p3}, LT/l;->J()V

    goto/16 :goto_4

    :cond_9
    instance-of v3, v2, Lcom/ui/wifiman/ui/signal/c$b;

    if-eqz v3, :cond_12

    const v3, -0x724bf704

    invoke-interface {v13, v3}, LT/l;->U(I)V

    sget-object v3, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    invoke-static {v3, v5, v8, v7}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v3

    invoke-static {p1, v3, v7, v8, v7}, LA/c;->b(LA/c;Landroidx/compose/ui/e;Lr/H;ILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    move-object v3, v2

    check-cast v3, Lcom/ui/wifiman/ui/signal/c$b;

    invoke-virtual {v3}, Lcom/ui/wifiman/ui/signal/c$b;->c()LTe/p;

    move-result-object v3

    const v4, -0x1c75ed89

    invoke-interface {v13, v4}, LT/l;->U(I)V

    iget-object v4, v0, Lcom/ui/wifiman/ui/signal/r$i;->b:Lcom/ui/wifiman/ui/signal/m;

    invoke-interface {v13, v4}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v4

    invoke-interface/range {p3 .. p3}, LT/l;->f()Ljava/lang/Object;

    move-result-object v5

    if-nez v4, :cond_a

    sget-object v4, LT/l;->a:LT/l$a;

    invoke-virtual {v4}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v4

    if-ne v5, v4, :cond_b

    :cond_a
    new-instance v5, Lcom/ui/wifiman/ui/signal/r$b;

    iget-object v4, v0, Lcom/ui/wifiman/ui/signal/r$i;->b:Lcom/ui/wifiman/ui/signal/m;

    invoke-direct {v5, v4}, Lcom/ui/wifiman/ui/signal/r$b;-><init>(Lcom/ui/wifiman/ui/signal/m;)V

    invoke-interface {v13, v5}, LT/l;->K(Ljava/lang/Object;)V

    :cond_b
    move-object v4, v5

    check-cast v4, Lmh/a;

    invoke-interface/range {p3 .. p3}, LT/l;->J()V

    const v5, -0x1c75e45f

    invoke-interface {v13, v5}, LT/l;->U(I)V

    iget-object v5, v0, Lcom/ui/wifiman/ui/signal/r$i;->b:Lcom/ui/wifiman/ui/signal/m;

    invoke-interface {v13, v5}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v5

    invoke-interface {v13, v2}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v6

    or-int/2addr v5, v6

    invoke-interface/range {p3 .. p3}, LT/l;->f()Ljava/lang/Object;

    move-result-object v6

    if-nez v5, :cond_c

    sget-object v5, LT/l;->a:LT/l$a;

    invoke-virtual {v5}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v5

    if-ne v6, v5, :cond_d

    :cond_c
    new-instance v6, Lcom/ui/wifiman/ui/signal/r$c;

    iget-object v5, v0, Lcom/ui/wifiman/ui/signal/r$i;->b:Lcom/ui/wifiman/ui/signal/m;

    invoke-direct {v6, v5, v2}, Lcom/ui/wifiman/ui/signal/r$c;-><init>(Lcom/ui/wifiman/ui/signal/m;Lcom/ui/wifiman/ui/signal/c;)V

    invoke-interface {v13, v6}, LT/l;->K(Ljava/lang/Object;)V

    :cond_d
    move-object v5, v6

    check-cast v5, Lmh/a;

    invoke-interface/range {p3 .. p3}, LT/l;->J()V

    const v6, -0x1c75d9bd

    invoke-interface {v13, v6}, LT/l;->U(I)V

    iget-object v6, v0, Lcom/ui/wifiman/ui/signal/r$i;->b:Lcom/ui/wifiman/ui/signal/m;

    invoke-interface {v13, v6}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v6

    invoke-interface {v13, v2}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v7

    or-int/2addr v6, v7

    invoke-interface/range {p3 .. p3}, LT/l;->f()Ljava/lang/Object;

    move-result-object v7

    if-nez v6, :cond_e

    sget-object v6, LT/l;->a:LT/l$a;

    invoke-virtual {v6}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v6

    if-ne v7, v6, :cond_f

    :cond_e
    new-instance v7, Lcom/ui/wifiman/ui/signal/r$d;

    iget-object v6, v0, Lcom/ui/wifiman/ui/signal/r$i;->b:Lcom/ui/wifiman/ui/signal/m;

    invoke-direct {v7, v6, v2}, Lcom/ui/wifiman/ui/signal/r$d;-><init>(Lcom/ui/wifiman/ui/signal/m;Lcom/ui/wifiman/ui/signal/c;)V

    invoke-interface {v13, v7}, LT/l;->K(Ljava/lang/Object;)V

    :cond_f
    move-object v6, v7

    check-cast v6, Lmh/a;

    invoke-interface/range {p3 .. p3}, LT/l;->J()V

    const v7, -0x1c75cefe

    invoke-interface {v13, v7}, LT/l;->U(I)V

    iget-object v7, v0, Lcom/ui/wifiman/ui/signal/r$i;->b:Lcom/ui/wifiman/ui/signal/m;

    invoke-interface {v13, v7}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v7

    invoke-interface {v13, v2}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v8

    or-int/2addr v7, v8

    invoke-interface/range {p3 .. p3}, LT/l;->f()Ljava/lang/Object;

    move-result-object v8

    if-nez v7, :cond_10

    sget-object v7, LT/l;->a:LT/l$a;

    invoke-virtual {v7}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v7

    if-ne v8, v7, :cond_11

    :cond_10
    new-instance v8, Lcom/ui/wifiman/ui/signal/r$e;

    iget-object v7, v0, Lcom/ui/wifiman/ui/signal/r$i;->b:Lcom/ui/wifiman/ui/signal/m;

    invoke-direct {v8, v7, v2}, Lcom/ui/wifiman/ui/signal/r$e;-><init>(Lcom/ui/wifiman/ui/signal/m;Lcom/ui/wifiman/ui/signal/c;)V

    invoke-interface {v13, v8}, LT/l;->K(Ljava/lang/Object;)V

    :cond_11
    move-object v7, v8

    check-cast v7, Lmh/a;

    invoke-interface/range {p3 .. p3}, LT/l;->J()V

    const/4 v8, 0x0

    move-object v2, v3

    move-object v3, v4

    move-object v4, v5

    move-object v5, v6

    move-object v6, v7

    move-object/from16 v7, p3

    invoke-static/range {v1 .. v8}, LTe/t;->f(Landroidx/compose/ui/e;LTe/p;Lmh/a;Lmh/a;Lmh/a;Lmh/a;LT/l;I)V

    invoke-interface/range {p3 .. p3}, LT/l;->J()V

    goto :goto_4

    :cond_12
    instance-of v3, v2, Lcom/ui/wifiman/ui/signal/c$a;

    if-eqz v3, :cond_13

    const v2, -0x1c75befa

    invoke-interface {v13, v2}, LT/l;->U(I)V

    sget-object v2, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    invoke-static {v2, v5, v8, v7}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v2

    invoke-static {p1, v2, v7, v8, v7}, LA/c;->b(LA/c;Landroidx/compose/ui/e;Lr/H;ILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    invoke-static {v1, v13, v6}, LTe/x;->f(Landroidx/compose/ui/e;LT/l;I)V

    invoke-interface/range {p3 .. p3}, LT/l;->J()V

    goto :goto_4

    :cond_13
    instance-of v3, v2, Lcom/ui/wifiman/ui/signal/c$c;

    if-eqz v3, :cond_15

    const v3, -0x723e3df7

    invoke-interface {v13, v3}, LT/l;->U(I)V

    sget-object v3, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    invoke-static {v3, v5, v8, v7}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v3

    sget-object v5, Lla/a;->a:Lla/a;

    sget v6, Lla/a;->b:I

    invoke-virtual {v5, v13, v6}, Lla/a;->d(LT/l;I)Lra/a;

    move-result-object v5

    invoke-virtual {v5}, Lra/a;->a()Lra/b;

    move-result-object v5

    invoke-virtual {v5}, Lra/b;->a()Lra/b$a$a;

    move-result-object v5

    invoke-virtual {v5}, Lra/b$a$a;->c()F

    move-result v5

    int-to-float v4, v4

    invoke-static {v4}, LY0/h;->j(F)F

    move-result v4

    invoke-static {v3, v5, v4}, Landroidx/compose/foundation/layout/o;->j(Landroidx/compose/ui/e;FF)Landroidx/compose/ui/e;

    move-result-object v3

    invoke-static {p1, v3, v7, v8, v7}, LA/c;->b(LA/c;Landroidx/compose/ui/e;Lr/H;ILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    new-instance v3, Lcom/ui/wifiman/ui/signal/r$f;

    iget-object v4, v0, Lcom/ui/wifiman/ui/signal/r$i;->b:Lcom/ui/wifiman/ui/signal/m;

    invoke-direct {v3, v2, v4}, Lcom/ui/wifiman/ui/signal/r$f;-><init>(Lcom/ui/wifiman/ui/signal/c;Lcom/ui/wifiman/ui/signal/m;)V

    const/16 v2, 0x36

    const v4, 0x23a5333

    invoke-static {v4, v8, v3, v13, v2}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v9

    const/high16 v11, 0x6000000

    const/16 v12, 0xfe

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object/from16 v10, p3

    invoke-static/range {v1 .. v12}, LB9/h;->i(Landroidx/compose/ui/e;Ljava/lang/String;Ljava/lang/String;Ls9/a;Lmh/a;Lmh/a;LB9/b;LB9/b;Lmh/q;LT/l;II)V

    invoke-interface/range {p3 .. p3}, LT/l;->J()V

    :goto_4
    invoke-interface/range {p3 .. p3}, LT/l;->J()V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_14

    invoke-static {}, LT/o;->P()V

    :cond_14
    :goto_5
    return-void

    :cond_15
    const v1, -0x1c767320

    invoke-interface {v13, v1}, LT/l;->U(I)V

    invoke-interface/range {p3 .. p3}, LT/l;->J()V

    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1
.end method

.method public bridge synthetic y(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LA/c;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    check-cast p3, LT/l;

    check-cast p4, Ljava/lang/Number;

    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    move-result p4

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/ui/wifiman/ui/signal/r$i;->a(LA/c;ILT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
