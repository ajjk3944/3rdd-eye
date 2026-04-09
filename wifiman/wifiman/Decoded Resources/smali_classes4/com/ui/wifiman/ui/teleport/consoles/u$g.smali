.class public final Lcom/ui/wifiman/ui/teleport/consoles/u$g;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/r;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/ui/teleport/consoles/u;->t(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/teleport/consoles/i;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/util/List;

.field final synthetic b:LIi/N;

.field final synthetic c:Lcom/ui/wifiman/ui/teleport/consoles/i;

.field final synthetic d:F


# direct methods
.method public constructor <init>(Ljava/util/List;LIi/N;Lcom/ui/wifiman/ui/teleport/consoles/i;F)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/ui/teleport/consoles/u$g;->a:Ljava/util/List;

    iput-object p2, p0, Lcom/ui/wifiman/ui/teleport/consoles/u$g;->b:LIi/N;

    iput-object p3, p0, Lcom/ui/wifiman/ui/teleport/consoles/u$g;->c:Lcom/ui/wifiman/ui/teleport/consoles/i;

    iput p4, p0, Lcom/ui/wifiman/ui/teleport/consoles/u$g;->d:F

    const/4 p1, 0x4

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LA/c;ILT/l;I)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p2

    move-object/from16 v7, p3

    and-int/lit8 v3, p4, 0x6

    const/4 v4, 0x2

    if-nez v3, :cond_1

    invoke-interface {v7, v1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x4

    goto :goto_0

    :cond_0
    move v3, v4

    :goto_0
    or-int v3, p4, v3

    goto :goto_1

    :cond_1
    move/from16 v3, p4

    :goto_1
    and-int/lit8 v5, p4, 0x30

    if-nez v5, :cond_3

    invoke-interface {v7, v2}, LT/l;->i(I)Z

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

    const v8, -0x25b7f321

    invoke-static {v8, v3, v5, v6}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_6
    iget-object v3, v0, Lcom/ui/wifiman/ui/teleport/consoles/u$g;->a:Ljava/util/List;

    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ui/wifiman/ui/teleport/consoles/h;

    const v3, 0x50067d7

    invoke-interface {v7, v3}, LT/l;->U(I)V

    instance-of v3, v2, Lcom/ui/wifiman/ui/teleport/consoles/h$a;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x1

    const/4 v9, 0x0

    if-eqz v3, :cond_b

    const v3, 0x500d209

    invoke-interface {v7, v3}, LT/l;->U(I)V

    sget-object v10, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    move-object v3, v2

    check-cast v3, Lcom/ui/wifiman/ui/teleport/consoles/h$a;

    invoke-virtual {v3}, Lcom/ui/wifiman/ui/teleport/consoles/h$a;->e()Z

    move-result v4

    xor-int/lit8 v11, v4, 0x1

    const v4, 0x29731c

    invoke-interface {v7, v4}, LT/l;->U(I)V

    iget-object v4, v0, Lcom/ui/wifiman/ui/teleport/consoles/u$g;->b:LIi/N;

    invoke-interface {v7, v4}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v4

    iget-object v6, v0, Lcom/ui/wifiman/ui/teleport/consoles/u$g;->c:Lcom/ui/wifiman/ui/teleport/consoles/i;

    invoke-interface {v7, v6}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v6

    or-int/2addr v4, v6

    invoke-interface {v7, v2}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v6

    or-int/2addr v4, v6

    invoke-interface/range {p3 .. p3}, LT/l;->f()Ljava/lang/Object;

    move-result-object v6

    if-nez v4, :cond_7

    sget-object v4, LT/l;->a:LT/l$a;

    invoke-virtual {v4}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v4

    if-ne v6, v4, :cond_8

    :cond_7
    new-instance v6, Lcom/ui/wifiman/ui/teleport/consoles/u$c;

    iget-object v4, v0, Lcom/ui/wifiman/ui/teleport/consoles/u$g;->b:LIi/N;

    iget-object v12, v0, Lcom/ui/wifiman/ui/teleport/consoles/u$g;->c:Lcom/ui/wifiman/ui/teleport/consoles/i;

    invoke-direct {v6, v4, v12, v2}, Lcom/ui/wifiman/ui/teleport/consoles/u$c;-><init>(LIi/N;Lcom/ui/wifiman/ui/teleport/consoles/i;Lcom/ui/wifiman/ui/teleport/consoles/h;)V

    invoke-interface {v7, v6}, LT/l;->K(Ljava/lang/Object;)V

    :cond_8
    move-object v14, v6

    check-cast v14, Lmh/a;

    invoke-interface/range {p3 .. p3}, LT/l;->J()V

    const/4 v15, 0x6

    const/16 v16, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-static/range {v10 .. v16}, Landroidx/compose/foundation/d;->d(Landroidx/compose/ui/e;ZLjava/lang/String;LJ0/g;Lmh/a;ILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v4

    invoke-static {v4, v5, v8, v9}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v4

    invoke-static {v1, v4, v9, v8, v9}, LA/c;->b(LA/c;Landroidx/compose/ui/e;Lr/H;ILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    iget v4, v0, Lcom/ui/wifiman/ui/teleport/consoles/u$g;->d:F

    const v5, 0x29acbb

    invoke-interface {v7, v5}, LT/l;->U(I)V

    iget-object v5, v0, Lcom/ui/wifiman/ui/teleport/consoles/u$g;->c:Lcom/ui/wifiman/ui/teleport/consoles/i;

    invoke-interface {v7, v5}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v5

    invoke-interface {v7, v2}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v6

    or-int/2addr v5, v6

    invoke-interface/range {p3 .. p3}, LT/l;->f()Ljava/lang/Object;

    move-result-object v6

    if-nez v5, :cond_9

    sget-object v5, LT/l;->a:LT/l$a;

    invoke-virtual {v5}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v5

    if-ne v6, v5, :cond_a

    :cond_9
    new-instance v6, Lcom/ui/wifiman/ui/teleport/consoles/u$d;

    iget-object v5, v0, Lcom/ui/wifiman/ui/teleport/consoles/u$g;->c:Lcom/ui/wifiman/ui/teleport/consoles/i;

    invoke-direct {v6, v5, v2}, Lcom/ui/wifiman/ui/teleport/consoles/u$d;-><init>(Lcom/ui/wifiman/ui/teleport/consoles/i;Lcom/ui/wifiman/ui/teleport/consoles/h;)V

    invoke-interface {v7, v6}, LT/l;->K(Ljava/lang/Object;)V

    :cond_a
    move-object v5, v6

    check-cast v5, Lmh/a;

    invoke-interface/range {p3 .. p3}, LT/l;->J()V

    const/4 v6, 0x0

    move v2, v4

    move-object v4, v5

    move-object/from16 v5, p3

    invoke-static/range {v1 .. v6}, Lcom/ui/wifiman/ui/teleport/consoles/u;->F(Landroidx/compose/ui/e;FLcom/ui/wifiman/ui/teleport/consoles/h$a;Lmh/a;LT/l;I)V

    invoke-interface/range {p3 .. p3}, LT/l;->J()V

    goto :goto_4

    :cond_b
    instance-of v3, v2, Lcom/ui/wifiman/ui/teleport/consoles/h$b;

    if-eqz v3, :cond_c

    const v2, 0x50e276d

    invoke-interface {v7, v2}, LT/l;->U(I)V

    sget-object v2, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    invoke-static {v2, v5, v8, v9}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v2

    iget v3, v0, Lcom/ui/wifiman/ui/teleport/consoles/u$g;->d:F

    invoke-static {v2, v3, v5, v4, v9}, Landroidx/compose/foundation/layout/o;->k(Landroidx/compose/ui/e;FFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v2

    invoke-static {v1, v2, v9, v8, v9}, LA/c;->b(LA/c;Landroidx/compose/ui/e;Lr/H;ILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    invoke-static {v1, v7, v6}, Lcom/ui/wifiman/ui/teleport/consoles/u;->G(Landroidx/compose/ui/e;LT/l;I)V

    invoke-interface/range {p3 .. p3}, LT/l;->J()V

    goto :goto_4

    :cond_c
    instance-of v3, v2, Lcom/ui/wifiman/ui/teleport/consoles/h$d;

    const/16 v4, 0xc

    if-eqz v3, :cond_d

    const v2, 0x5137c65

    invoke-interface {v7, v2}, LT/l;->U(I)V

    sget-object v2, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    invoke-static {v2, v5, v8, v9}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v2

    iget v3, v0, Lcom/ui/wifiman/ui/teleport/consoles/u$g;->d:F

    int-to-float v4, v4

    invoke-static {v4}, LY0/h;->j(F)F

    move-result v4

    invoke-static {v2, v3, v4}, Landroidx/compose/foundation/layout/o;->j(Landroidx/compose/ui/e;FF)Landroidx/compose/ui/e;

    move-result-object v2

    invoke-static {v1, v2, v9, v8, v9}, LA/c;->b(LA/c;Landroidx/compose/ui/e;Lr/H;ILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    iget-object v2, v0, Lcom/ui/wifiman/ui/teleport/consoles/u$g;->c:Lcom/ui/wifiman/ui/teleport/consoles/i;

    invoke-static {v1, v2, v7, v6}, Lcom/ui/wifiman/ui/teleport/consoles/u;->E(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/teleport/consoles/i;LT/l;I)V

    invoke-interface/range {p3 .. p3}, LT/l;->J()V

    goto :goto_4

    :cond_d
    instance-of v3, v2, Lcom/ui/wifiman/ui/teleport/consoles/h$c;

    if-eqz v3, :cond_f

    const v3, 0x51ab867

    invoke-interface {v7, v3}, LT/l;->U(I)V

    sget-object v3, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    invoke-static {v3, v5, v8, v9}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v3

    iget v5, v0, Lcom/ui/wifiman/ui/teleport/consoles/u$g;->d:F

    int-to-float v4, v4

    invoke-static {v4}, LY0/h;->j(F)F

    move-result v4

    invoke-static {v3, v5, v4}, Landroidx/compose/foundation/layout/o;->j(Landroidx/compose/ui/e;FF)Landroidx/compose/ui/e;

    move-result-object v3

    invoke-static {v1, v3, v9, v8, v9}, LA/c;->b(LA/c;Landroidx/compose/ui/e;Lr/H;ILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    check-cast v2, Lcom/ui/wifiman/ui/teleport/consoles/h$c;

    invoke-static {v1, v2, v7, v6}, Lcom/ui/wifiman/ui/teleport/consoles/u;->D(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/teleport/consoles/h$c;LT/l;I)V

    invoke-interface/range {p3 .. p3}, LT/l;->J()V

    :goto_4
    invoke-interface/range {p3 .. p3}, LT/l;->J()V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_e

    invoke-static {}, LT/o;->P()V

    :cond_e
    :goto_5
    return-void

    :cond_f
    const v1, 0x294dac

    invoke-interface {v7, v1}, LT/l;->U(I)V

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

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/ui/wifiman/ui/teleport/consoles/u$g;->a(LA/c;ILT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
