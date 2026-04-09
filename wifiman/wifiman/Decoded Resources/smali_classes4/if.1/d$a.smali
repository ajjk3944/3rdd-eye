.class final Lif/d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lif/d;->b(Landroidx/compose/ui/e;Lif/b;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lif/b;


# direct methods
.method constructor <init>(Lif/b;)V
    .locals 0

    iput-object p1, p0, Lif/d$a;->a:Lif/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lz/j;LT/l;I)V
    .locals 14

    move-object v0, p0

    move-object/from16 v10, p2

    move/from16 v1, p3

    const-string v2, "$this$ModalScaffold"

    move-object v3, p1

    invoke-static {p1, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v2, v1, 0x11

    const/16 v3, 0x10

    if-ne v2, v3, :cond_1

    invoke-interface/range {p2 .. p2}, LT/l;->v()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface/range {p2 .. p2}, LT/l;->C()V

    goto/16 :goto_1

    :cond_1
    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, -0x1

    const-string v3, "com.ui.wifiman.ui.speedtest.error.SpeedtestFailedUi.<anonymous> (SpeedtestFailedUi.kt:21)"

    const v4, -0x648fe88

    invoke-static {v4, v1, v2, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    sget-object v1, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    sget-object v2, LPe/a;->a:LPe/a;

    invoke-virtual {v2}, LPe/a;->L()Ls9/b;

    move-result-object v2

    iget-object v5, v0, Lif/d$a;->a:Lif/b;

    invoke-virtual {v5}, Lif/b;->getTitle()LLi/N;

    move-result-object v5

    const/4 v6, 0x0

    invoke-static {v5, v4, v10, v6, v3}, LT/o1;->b(LLi/N;Ldh/i;LT/l;II)LT/z1;

    move-result-object v5

    invoke-interface {v5}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ls9/d;

    iget-object v7, v0, Lif/d$a;->a:Lif/b;

    invoke-virtual {v7}, Lif/b;->o0()LLi/N;

    move-result-object v7

    invoke-static {v7, v4, v10, v6, v3}, LT/o1;->b(LLi/N;Ldh/i;LT/l;II)LT/z1;

    move-result-object v3

    invoke-interface {v3}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Ls9/d;

    new-instance v6, Ls9/d$b;

    sget v3, Lm8/c;->f:I

    invoke-direct {v6, v3}, Ls9/d$b;-><init>(I)V

    iget-object v3, v0, Lif/d$a;->a:Lif/b;

    const v7, -0x45ffc93b

    invoke-interface {v10, v7}, LT/l;->U(I)V

    invoke-interface {v10, v3}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v7

    invoke-interface/range {p2 .. p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v8

    if-nez v7, :cond_3

    sget-object v7, LT/l;->a:LT/l$a;

    invoke-virtual {v7}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v7

    if-ne v8, v7, :cond_4

    :cond_3
    new-instance v8, Lif/d$a$a;

    invoke-direct {v8, v3}, Lif/d$a$a;-><init>(Ljava/lang/Object;)V

    invoke-interface {v10, v8}, LT/l;->K(Ljava/lang/Object;)V

    :cond_4
    check-cast v8, Lth/g;

    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    move-object v7, v8

    check-cast v7, Lmh/a;

    const/16 v11, 0x36

    const/16 v12, 0x190

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v13, 0x0

    move-object v3, v5

    move-object v5, v8

    move-object v8, v9

    move-object v9, v13

    move-object/from16 v10, p2

    invoke-static/range {v1 .. v12}, LBe/o;->f(Landroidx/compose/ui/e;Ls9/a;Ls9/d;Ls9/d;Lmh/l;Ls9/d;Lmh/a;Ls9/d;Lmh/a;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-static {}, LT/o;->P()V

    :cond_5
    :goto_1
    return-void
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lz/j;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lif/d$a;->a(Lz/j;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
