.class final Lcom/ui/wifiman/ui/speedtest/feedback/i$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/ui/speedtest/feedback/i$b;->a(Lz/j;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/ui/speedtest/feedback/e;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/ui/speedtest/feedback/e;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/ui/speedtest/feedback/i$b$a;->a:Lcom/ui/wifiman/ui/speedtest/feedback/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lcom/ui/wifiman/ui/speedtest/feedback/e;Z)LYg/J;
    .locals 0

    invoke-static {p0, p1}, Lcom/ui/wifiman/ui/speedtest/feedback/i$b$a;->h(Lcom/ui/wifiman/ui/speedtest/feedback/e;Z)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/ui/wifiman/ui/speedtest/feedback/e;Z)LYg/J;
    .locals 0

    invoke-static {p0, p1}, Lcom/ui/wifiman/ui/speedtest/feedback/i$b$a;->i(Lcom/ui/wifiman/ui/speedtest/feedback/e;Z)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lcom/ui/wifiman/ui/speedtest/feedback/e;Z)LYg/J;
    .locals 0

    invoke-static {p0, p1}, Lcom/ui/wifiman/ui/speedtest/feedback/i$b$a;->j(Lcom/ui/wifiman/ui/speedtest/feedback/e;Z)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lcom/ui/wifiman/ui/speedtest/feedback/e;Z)LYg/J;
    .locals 0

    invoke-static {p0, p1}, Lcom/ui/wifiman/ui/speedtest/feedback/i$b$a;->k(Lcom/ui/wifiman/ui/speedtest/feedback/e;Z)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method private static final h(Lcom/ui/wifiman/ui/speedtest/feedback/e;Z)LYg/J;
    .locals 0

    sget-object p1, Lcom/ui/wifiman/ui/speedtest/feedback/d;->CONNECTIVITY:Lcom/ui/wifiman/ui/speedtest/feedback/d;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/ui/speedtest/feedback/e;->r0(Lcom/ui/wifiman/ui/speedtest/feedback/d;)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final i(Lcom/ui/wifiman/ui/speedtest/feedback/e;Z)LYg/J;
    .locals 0

    sget-object p1, Lcom/ui/wifiman/ui/speedtest/feedback/d;->LATENCY:Lcom/ui/wifiman/ui/speedtest/feedback/d;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/ui/speedtest/feedback/e;->r0(Lcom/ui/wifiman/ui/speedtest/feedback/d;)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final j(Lcom/ui/wifiman/ui/speedtest/feedback/e;Z)LYg/J;
    .locals 0

    sget-object p1, Lcom/ui/wifiman/ui/speedtest/feedback/d;->THROUGHPUT:Lcom/ui/wifiman/ui/speedtest/feedback/d;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/ui/speedtest/feedback/e;->r0(Lcom/ui/wifiman/ui/speedtest/feedback/d;)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final k(Lcom/ui/wifiman/ui/speedtest/feedback/e;Z)LYg/J;
    .locals 0

    sget-object p1, Lcom/ui/wifiman/ui/speedtest/feedback/d;->NOT_AS_EXPECTED:Lcom/ui/wifiman/ui/speedtest/feedback/d;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/ui/speedtest/feedback/e;->r0(Lcom/ui/wifiman/ui/speedtest/feedback/d;)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method


# virtual methods
.method public final f(Lz/j;LT/l;I)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v10, p2

    move/from16 v1, p3

    const-string v2, "$this$UiContentCard"

    move-object/from16 v3, p1

    invoke-static {v3, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v2, v1, 0x11

    const/16 v3, 0x10

    if-ne v2, v3, :cond_1

    invoke-interface/range {p2 .. p2}, LT/l;->v()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface/range {p2 .. p2}, LT/l;->C()V

    goto/16 :goto_5

    :cond_1
    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, -0x1

    const-string v3, "com.ui.wifiman.ui.speedtest.feedback.SpeedtestFeedbackUi.<anonymous>.<anonymous>.<anonymous> (SpeedtestFeedbackUi.kt:83)"

    const v4, -0x6a896955

    invoke-static {v4, v1, v2, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    iget-object v1, v0, Lcom/ui/wifiman/ui/speedtest/feedback/i$b$a;->a:Lcom/ui/wifiman/ui/speedtest/feedback/e;

    invoke-virtual {v1}, Lcom/ui/wifiman/ui/speedtest/feedback/e;->o0()LLi/N;

    move-result-object v1

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x1

    invoke-static {v1, v11, v10, v12, v13}, LT/o1;->b(LLi/N;Ldh/i;LT/l;II)LT/z1;

    move-result-object v1

    invoke-interface {v1}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v1

    move-object v14, v1

    check-cast v14, Lcom/ui/wifiman/ui/speedtest/feedback/d;

    sget-object v15, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/4 v9, 0x0

    invoke-static {v15, v9, v13, v11}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    new-instance v3, Ls9/d$b;

    sget v2, Lm8/c;->Y2:I

    invoke-direct {v3, v2}, Ls9/d$b;-><init>(I)V

    sget-object v2, Lcom/ui/wifiman/ui/speedtest/feedback/d;->CONNECTIVITY:Lcom/ui/wifiman/ui/speedtest/feedback/d;

    if-ne v14, v2, :cond_3

    move v2, v13

    goto :goto_1

    :cond_3
    move v2, v12

    :goto_1
    const v4, 0x71250fc

    invoke-interface {v10, v4}, LT/l;->U(I)V

    iget-object v4, v0, Lcom/ui/wifiman/ui/speedtest/feedback/i$b$a;->a:Lcom/ui/wifiman/ui/speedtest/feedback/e;

    invoke-interface {v10, v4}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v4

    iget-object v5, v0, Lcom/ui/wifiman/ui/speedtest/feedback/i$b$a;->a:Lcom/ui/wifiman/ui/speedtest/feedback/e;

    invoke-interface/range {p2 .. p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v6

    if-nez v4, :cond_4

    sget-object v4, LT/l;->a:LT/l$a;

    invoke-virtual {v4}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v4

    if-ne v6, v4, :cond_5

    :cond_4
    new-instance v6, Lcom/ui/wifiman/ui/speedtest/feedback/j;

    invoke-direct {v6, v5}, Lcom/ui/wifiman/ui/speedtest/feedback/j;-><init>(Lcom/ui/wifiman/ui/speedtest/feedback/e;)V

    invoke-interface {v10, v6}, LT/l;->K(Ljava/lang/Object;)V

    :cond_5
    move-object v4, v6

    check-cast v4, Lmh/l;

    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    const/4 v6, 0x6

    move-object/from16 v5, p2

    invoke-static/range {v1 .. v6}, Lcom/ui/wifiman/ui/speedtest/feedback/i;->i(Landroidx/compose/ui/e;ZLs9/d;Lmh/l;LT/l;I)V

    invoke-static {v15, v9, v13, v11}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    const/4 v8, 0x6

    const/16 v16, 0x1e

    const-wide/16 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object/from16 v7, p2

    move v12, v9

    move/from16 v9, v16

    invoke-static/range {v1 .. v9}, Lz9/b;->b(Landroidx/compose/ui/e;JFFFLT/l;II)V

    invoke-static {v15, v12, v13, v11}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    new-instance v3, Ls9/d$b;

    sget v2, Lm8/c;->a3:I

    invoke-direct {v3, v2}, Ls9/d$b;-><init>(I)V

    sget-object v2, Lcom/ui/wifiman/ui/speedtest/feedback/d;->LATENCY:Lcom/ui/wifiman/ui/speedtest/feedback/d;

    if-ne v14, v2, :cond_6

    move v2, v13

    goto :goto_2

    :cond_6
    const/4 v2, 0x0

    :goto_2
    const v4, 0x71289b7

    invoke-interface {v10, v4}, LT/l;->U(I)V

    iget-object v4, v0, Lcom/ui/wifiman/ui/speedtest/feedback/i$b$a;->a:Lcom/ui/wifiman/ui/speedtest/feedback/e;

    invoke-interface {v10, v4}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v4

    iget-object v5, v0, Lcom/ui/wifiman/ui/speedtest/feedback/i$b$a;->a:Lcom/ui/wifiman/ui/speedtest/feedback/e;

    invoke-interface/range {p2 .. p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v6

    if-nez v4, :cond_7

    sget-object v4, LT/l;->a:LT/l$a;

    invoke-virtual {v4}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v4

    if-ne v6, v4, :cond_8

    :cond_7
    new-instance v6, Lcom/ui/wifiman/ui/speedtest/feedback/k;

    invoke-direct {v6, v5}, Lcom/ui/wifiman/ui/speedtest/feedback/k;-><init>(Lcom/ui/wifiman/ui/speedtest/feedback/e;)V

    invoke-interface {v10, v6}, LT/l;->K(Ljava/lang/Object;)V

    :cond_8
    move-object v4, v6

    check-cast v4, Lmh/l;

    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    const/4 v6, 0x6

    move-object/from16 v5, p2

    invoke-static/range {v1 .. v6}, Lcom/ui/wifiman/ui/speedtest/feedback/i;->i(Landroidx/compose/ui/e;ZLs9/d;Lmh/l;LT/l;I)V

    invoke-static {v15, v12, v13, v11}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    const/4 v8, 0x6

    const/16 v9, 0x1e

    const-wide/16 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object/from16 v7, p2

    invoke-static/range {v1 .. v9}, Lz9/b;->b(Landroidx/compose/ui/e;JFFFLT/l;II)V

    invoke-static {v15, v12, v13, v11}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    new-instance v3, Ls9/d$b;

    sget v2, Lm8/c;->b3:I

    invoke-direct {v3, v2}, Ls9/d$b;-><init>(I)V

    sget-object v2, Lcom/ui/wifiman/ui/speedtest/feedback/d;->THROUGHPUT:Lcom/ui/wifiman/ui/speedtest/feedback/d;

    if-ne v14, v2, :cond_9

    move v2, v13

    goto :goto_3

    :cond_9
    const/4 v2, 0x0

    :goto_3
    const v4, 0x712c29a

    invoke-interface {v10, v4}, LT/l;->U(I)V

    iget-object v4, v0, Lcom/ui/wifiman/ui/speedtest/feedback/i$b$a;->a:Lcom/ui/wifiman/ui/speedtest/feedback/e;

    invoke-interface {v10, v4}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v4

    iget-object v5, v0, Lcom/ui/wifiman/ui/speedtest/feedback/i$b$a;->a:Lcom/ui/wifiman/ui/speedtest/feedback/e;

    invoke-interface/range {p2 .. p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v6

    if-nez v4, :cond_a

    sget-object v4, LT/l;->a:LT/l$a;

    invoke-virtual {v4}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v4

    if-ne v6, v4, :cond_b

    :cond_a
    new-instance v6, Lcom/ui/wifiman/ui/speedtest/feedback/l;

    invoke-direct {v6, v5}, Lcom/ui/wifiman/ui/speedtest/feedback/l;-><init>(Lcom/ui/wifiman/ui/speedtest/feedback/e;)V

    invoke-interface {v10, v6}, LT/l;->K(Ljava/lang/Object;)V

    :cond_b
    move-object v4, v6

    check-cast v4, Lmh/l;

    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    const/4 v6, 0x6

    move-object/from16 v5, p2

    invoke-static/range {v1 .. v6}, Lcom/ui/wifiman/ui/speedtest/feedback/i;->i(Landroidx/compose/ui/e;ZLs9/d;Lmh/l;LT/l;I)V

    invoke-static {v15, v12, v13, v11}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    const/4 v8, 0x6

    const/16 v9, 0x1e

    const-wide/16 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object/from16 v7, p2

    invoke-static/range {v1 .. v9}, Lz9/b;->b(Landroidx/compose/ui/e;JFFFLT/l;II)V

    invoke-static {v15, v12, v13, v11}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    new-instance v3, Ls9/d$b;

    sget v2, Lm8/c;->Z2:I

    invoke-direct {v3, v2}, Ls9/d$b;-><init>(I)V

    sget-object v2, Lcom/ui/wifiman/ui/speedtest/feedback/d;->NOT_AS_EXPECTED:Lcom/ui/wifiman/ui/speedtest/feedback/d;

    if-ne v14, v2, :cond_c

    move v2, v13

    goto :goto_4

    :cond_c
    const/4 v2, 0x0

    :goto_4
    const v4, 0x712fc7f

    invoke-interface {v10, v4}, LT/l;->U(I)V

    iget-object v4, v0, Lcom/ui/wifiman/ui/speedtest/feedback/i$b$a;->a:Lcom/ui/wifiman/ui/speedtest/feedback/e;

    invoke-interface {v10, v4}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v4

    iget-object v5, v0, Lcom/ui/wifiman/ui/speedtest/feedback/i$b$a;->a:Lcom/ui/wifiman/ui/speedtest/feedback/e;

    invoke-interface/range {p2 .. p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v6

    if-nez v4, :cond_d

    sget-object v4, LT/l;->a:LT/l$a;

    invoke-virtual {v4}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v4

    if-ne v6, v4, :cond_e

    :cond_d
    new-instance v6, Lcom/ui/wifiman/ui/speedtest/feedback/m;

    invoke-direct {v6, v5}, Lcom/ui/wifiman/ui/speedtest/feedback/m;-><init>(Lcom/ui/wifiman/ui/speedtest/feedback/e;)V

    invoke-interface {v10, v6}, LT/l;->K(Ljava/lang/Object;)V

    :cond_e
    move-object v4, v6

    check-cast v4, Lmh/l;

    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    const/4 v6, 0x6

    move-object/from16 v5, p2

    invoke-static/range {v1 .. v6}, Lcom/ui/wifiman/ui/speedtest/feedback/i;->i(Landroidx/compose/ui/e;ZLs9/d;Lmh/l;LT/l;I)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_f

    invoke-static {}, LT/o;->P()V

    :cond_f
    :goto_5
    return-void
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lz/j;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lcom/ui/wifiman/ui/speedtest/feedback/i$b$a;->f(Lz/j;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
