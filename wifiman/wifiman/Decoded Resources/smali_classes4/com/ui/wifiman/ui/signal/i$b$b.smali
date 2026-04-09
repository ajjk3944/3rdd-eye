.class final Lcom/ui/wifiman/ui/signal/i$b$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/r;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/ui/signal/i$b;->b(Lz/j;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/ui/signal/g;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/ui/signal/g;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/ui/signal/i$b$b;->a:Lcom/ui/wifiman/ui/signal/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lcom/ui/wifiman/ui/signal/g;LTe/k0;)LYg/J;
    .locals 0

    invoke-static {p0, p1}, Lcom/ui/wifiman/ui/signal/i$b$b;->c(Lcom/ui/wifiman/ui/signal/g;LTe/k0;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Lcom/ui/wifiman/ui/signal/g;LTe/k0;)LYg/J;
    .locals 0

    check-cast p1, LTe/k0$a;

    invoke-virtual {p1}, LTe/k0$a;->getId()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/ui/signal/g;->q0(Ljava/lang/String;)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method


# virtual methods
.method public final b(Landroidx/compose/ui/e;LTe/k0;LT/l;I)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    const-string v4, "modifier"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "item"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v4, p4, 0x6

    if-nez v4, :cond_1

    invoke-interface {v3, v1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 v4, 0x4

    goto :goto_0

    :cond_0
    const/4 v4, 0x2

    :goto_0
    or-int v4, p4, v4

    goto :goto_1

    :cond_1
    move/from16 v4, p4

    :goto_1
    and-int/lit8 v5, p4, 0x30

    const/16 v6, 0x20

    if-nez v5, :cond_4

    and-int/lit8 v5, p4, 0x40

    if-nez v5, :cond_2

    invoke-interface {v3, v2}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v5

    goto :goto_2

    :cond_2
    invoke-interface {v3, v2}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v5

    :goto_2
    if-eqz v5, :cond_3

    move v5, v6

    goto :goto_3

    :cond_3
    const/16 v5, 0x10

    :goto_3
    or-int/2addr v4, v5

    :cond_4
    and-int/lit16 v5, v4, 0x93

    const/16 v7, 0x92

    if-ne v5, v7, :cond_6

    invoke-interface/range {p3 .. p3}, LT/l;->v()Z

    move-result v5

    if-nez v5, :cond_5

    goto :goto_4

    :cond_5
    invoke-interface/range {p3 .. p3}, LT/l;->C()V

    goto/16 :goto_7

    :cond_6
    :goto_4
    invoke-static {}, LT/o;->H()Z

    move-result v5

    if-eqz v5, :cond_7

    const/4 v5, -0x1

    const-string v7, "com.ui.wifiman.ui.signal.SignalTabApComparisonConfigUi.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SignalTabApComparisonConfigUi.kt:117)"

    const v8, -0x67a2573b

    invoke-static {v8, v4, v5, v7}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_7
    instance-of v5, v2, LTe/k0$a;

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x1

    if-eqz v5, :cond_c

    const v5, -0x5c25c1ff

    invoke-interface {v3, v5}, LT/l;->U(I)V

    invoke-static {v1, v8, v9, v7}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v10

    move-object v1, v2

    check-cast v1, LTe/k0$a;

    invoke-virtual {v1}, LTe/k0$a;->a()LTe/e0;

    move-result-object v5

    invoke-virtual {v5}, LTe/e0;->c()Z

    move-result v11

    const v5, -0x5c25a8e3

    invoke-interface {v3, v5}, LT/l;->U(I)V

    iget-object v5, v0, Lcom/ui/wifiman/ui/signal/i$b$b;->a:Lcom/ui/wifiman/ui/signal/g;

    invoke-interface {v3, v5}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v5

    and-int/lit8 v7, v4, 0x70

    const/4 v8, 0x0

    if-eq v7, v6, :cond_9

    and-int/lit8 v4, v4, 0x40

    if-eqz v4, :cond_8

    invoke-interface {v3, v2}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_8

    goto :goto_5

    :cond_8
    move v9, v8

    :cond_9
    :goto_5
    or-int v4, v5, v9

    iget-object v5, v0, Lcom/ui/wifiman/ui/signal/i$b$b;->a:Lcom/ui/wifiman/ui/signal/g;

    invoke-interface/range {p3 .. p3}, LT/l;->f()Ljava/lang/Object;

    move-result-object v6

    if-nez v4, :cond_a

    sget-object v4, LT/l;->a:LT/l$a;

    invoke-virtual {v4}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v4

    if-ne v6, v4, :cond_b

    :cond_a
    new-instance v6, Lcom/ui/wifiman/ui/signal/k;

    invoke-direct {v6, v5, v2}, Lcom/ui/wifiman/ui/signal/k;-><init>(Lcom/ui/wifiman/ui/signal/g;LTe/k0;)V

    invoke-interface {v3, v6}, LT/l;->K(Ljava/lang/Object;)V

    :cond_b
    move-object v14, v6

    check-cast v14, Lmh/a;

    invoke-interface/range {p3 .. p3}, LT/l;->J()V

    const/4 v15, 0x6

    const/16 v16, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-static/range {v10 .. v16}, Landroidx/compose/foundation/d;->d(Landroidx/compose/ui/e;ZLjava/lang/String;LJ0/g;Lmh/a;ILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v2

    invoke-virtual {v1}, LTe/k0$a;->a()LTe/e0;

    move-result-object v1

    invoke-static {v2, v1, v3, v8, v8}, LTe/g0;->b(Landroidx/compose/ui/e;LTe/e0;LT/l;II)V

    invoke-interface/range {p3 .. p3}, LT/l;->J()V

    goto :goto_6

    :cond_c
    instance-of v4, v2, LTe/k0$b;

    if-eqz v4, :cond_e

    const v4, -0x288b7d14

    invoke-interface {v3, v4}, LT/l;->U(I)V

    invoke-static {v1, v8, v9, v7}, Landroidx/compose/foundation/layout/r;->d(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    sget-object v4, LPe/a;->a:LPe/a;

    invoke-virtual {v4}, LPe/a;->E()Ls9/b;

    move-result-object v4

    check-cast v2, LTe/k0$b;

    invoke-virtual {v2}, LTe/k0$b;->a()Ls9/d;

    move-result-object v2

    const/16 v5, 0x180

    invoke-static {v1, v2, v4, v3, v5}, LEe/D;->b(Landroidx/compose/ui/e;Ls9/d;Ls9/b;LT/l;I)V

    invoke-interface/range {p3 .. p3}, LT/l;->J()V

    :goto_6
    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_d

    invoke-static {}, LT/o;->P()V

    :cond_d
    :goto_7
    return-void

    :cond_e
    const v1, -0x5c25c9f0

    invoke-interface {v3, v1}, LT/l;->U(I)V

    invoke-interface/range {p3 .. p3}, LT/l;->J()V

    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1
.end method

.method public bridge synthetic y(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/ui/e;

    check-cast p2, LTe/k0;

    check-cast p3, LT/l;

    check-cast p4, Ljava/lang/Number;

    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    move-result p4

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/ui/wifiman/ui/signal/i$b$b;->b(Landroidx/compose/ui/e;LTe/k0;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
