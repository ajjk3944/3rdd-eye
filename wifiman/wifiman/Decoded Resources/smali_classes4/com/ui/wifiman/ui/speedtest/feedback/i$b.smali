.class final Lcom/ui/wifiman/ui/speedtest/feedback/i$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/ui/speedtest/feedback/i;->g(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/speedtest/feedback/e;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/ui/e;

.field final synthetic b:Lcom/ui/wifiman/ui/speedtest/feedback/e;


# direct methods
.method constructor <init>(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/speedtest/feedback/e;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/ui/speedtest/feedback/i$b;->a:Landroidx/compose/ui/e;

    iput-object p2, p0, Lcom/ui/wifiman/ui/speedtest/feedback/i$b;->b:Lcom/ui/wifiman/ui/speedtest/feedback/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lz/j;LT/l;I)V
    .locals 31

    move-object/from16 v0, p0

    move-object/from16 v13, p2

    move/from16 v1, p3

    const-string v2, "$this$ModalScaffold"

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

    goto/16 :goto_2

    :cond_1
    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, -0x1

    const-string v3, "com.ui.wifiman.ui.speedtest.feedback.SpeedtestFeedbackUi.<anonymous> (SpeedtestFeedbackUi.kt:66)"

    const v4, 0x56e994d3

    invoke-static {v4, v1, v2, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    iget-object v1, v0, Lcom/ui/wifiman/ui/speedtest/feedback/i$b;->a:Landroidx/compose/ui/e;

    const/4 v14, 0x0

    const/4 v15, 0x1

    const/4 v12, 0x0

    invoke-static {v1, v14, v15, v12}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v2

    const/4 v11, 0x0

    invoke-static {v11, v13, v11, v15}, Landroidx/compose/foundation/m;->a(ILT/l;II)Landroidx/compose/foundation/o;

    move-result-object v3

    const/16 v7, 0xe

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v2 .. v8}, Landroidx/compose/foundation/m;->d(Landroidx/compose/ui/e;Landroidx/compose/foundation/o;ZLw/n;ZILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    iget-object v10, v0, Lcom/ui/wifiman/ui/speedtest/feedback/i$b;->b:Lcom/ui/wifiman/ui/speedtest/feedback/e;

    sget-object v2, Lz/c;->a:Lz/c;

    invoke-virtual {v2}, Lz/c;->g()Lz/c$m;

    move-result-object v2

    sget-object v3, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v3}, Lf0/c$a;->k()Lf0/c$b;

    move-result-object v3

    invoke-static {v2, v3, v13, v11}, Lz/h;->a(Lz/c$m;Lf0/c$b;LT/l;I)LC0/C;

    move-result-object v2

    invoke-static {v13, v11}, LT/j;->a(LT/l;I)I

    move-result v3

    invoke-interface/range {p2 .. p2}, LT/l;->G()LT/x;

    move-result-object v4

    invoke-static {v13, v1}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v1

    sget-object v5, LE0/g;->K:LE0/g$a;

    invoke-virtual {v5}, LE0/g$a;->a()Lmh/a;

    move-result-object v6

    invoke-interface/range {p2 .. p2}, LT/l;->x()LT/f;

    move-result-object v7

    if-nez v7, :cond_3

    invoke-static {}, LT/j;->c()V

    :cond_3
    invoke-interface/range {p2 .. p2}, LT/l;->u()V

    invoke-interface/range {p2 .. p2}, LT/l;->o()Z

    move-result v7

    if-eqz v7, :cond_4

    invoke-interface {v13, v6}, LT/l;->D(Lmh/a;)V

    goto :goto_1

    :cond_4
    invoke-interface/range {p2 .. p2}, LT/l;->I()V

    :goto_1
    invoke-static/range {p2 .. p2}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v6

    invoke-virtual {v5}, LE0/g$a;->e()Lmh/p;

    move-result-object v7

    invoke-static {v6, v2, v7}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v5}, LE0/g$a;->g()Lmh/p;

    move-result-object v2

    invoke-static {v6, v4, v2}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v5}, LE0/g$a;->b()Lmh/p;

    move-result-object v2

    invoke-interface {v6}, LT/l;->o()Z

    move-result v4

    if-nez v4, :cond_5

    invoke-interface {v6}, LT/l;->f()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v4, v7}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_6

    :cond_5
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v6, v4}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v6, v3, v2}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_6
    invoke-virtual {v5}, LE0/g$a;->f()Lmh/p;

    move-result-object v2

    invoke-static {v6, v1, v2}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v1, Lz/k;->a:Lz/k;

    invoke-static {v12, v13, v11, v15}, LBe/v0;->b(Landroidx/compose/ui/e;LT/l;II)V

    sget-object v9, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    invoke-static {v9, v14, v15, v12}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    sget-object v8, Lla/a;->a:Lla/a;

    sget v7, Lla/a;->b:I

    invoke-virtual {v8, v13, v7}, Lla/a;->d(LT/l;I)Lra/a;

    move-result-object v2

    invoke-virtual {v2}, Lra/a;->a()Lra/b;

    move-result-object v2

    invoke-virtual {v2}, Lra/b;->a()Lra/b$a$a;

    move-result-object v2

    invoke-virtual {v2}, Lra/b$a$a;->c()F

    move-result v2

    const/4 v6, 0x2

    invoke-static {v1, v2, v14, v6, v12}, Landroidx/compose/foundation/layout/o;->k(Landroidx/compose/ui/e;FFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    new-instance v2, Lcom/ui/wifiman/ui/speedtest/feedback/i$b$a;

    invoke-direct {v2, v10}, Lcom/ui/wifiman/ui/speedtest/feedback/i$b$a;-><init>(Lcom/ui/wifiman/ui/speedtest/feedback/e;)V

    const v3, -0x6a896955

    const/16 v5, 0x36

    invoke-static {v3, v15, v2, v13, v5}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v16

    const/high16 v17, 0x6000000

    const/16 v18, 0xfe

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    move-object/from16 v5, v19

    move-object/from16 v6, v20

    move/from16 v23, v7

    move-object/from16 v7, v21

    move-object/from16 v24, v8

    move-object/from16 v8, v22

    move-object/from16 v25, v9

    move-object/from16 v9, v16

    move-object/from16 v26, v10

    move-object/from16 v10, p2

    move v14, v11

    move/from16 v11, v17

    move-object v0, v12

    move/from16 v12, v18

    invoke-static/range {v1 .. v12}, LB9/h;->i(Landroidx/compose/ui/e;Ljava/lang/String;Ljava/lang/String;Ls9/a;Lmh/a;Lmh/a;LB9/b;LB9/b;Lmh/q;LT/l;II)V

    invoke-static {v0, v13, v14, v15}, LBe/v0;->b(Landroidx/compose/ui/e;LT/l;II)V

    move-object/from16 v12, v25

    const/4 v1, 0x0

    invoke-static {v12, v1, v15, v0}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v2

    move/from16 v10, v23

    move-object/from16 v11, v24

    invoke-virtual {v11, v13, v10}, Lla/a;->d(LT/l;I)Lra/a;

    move-result-object v3

    invoke-virtual {v3}, Lra/a;->a()Lra/b;

    move-result-object v3

    invoke-virtual {v3}, Lra/b;->a()Lra/b$a$a;

    move-result-object v3

    invoke-virtual {v3}, Lra/b$a$a;->c()F

    move-result v3

    const/4 v9, 0x2

    invoke-static {v2, v3, v1, v9, v0}, Landroidx/compose/foundation/layout/o;->k(Landroidx/compose/ui/e;FFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v2

    sget v1, Lm8/c;->X2:I

    invoke-static {v1, v13, v14}, LH0/f;->a(ILT/l;I)Ljava/lang/String;

    move-result-object v3

    new-instance v1, Lcom/ui/wifiman/ui/speedtest/feedback/i$b$b;

    move-object/from16 v8, v26

    invoke-direct {v1, v8}, Lcom/ui/wifiman/ui/speedtest/feedback/i$b$b;-><init>(Lcom/ui/wifiman/ui/speedtest/feedback/e;)V

    const v4, 0x183e5b14

    const/16 v5, 0x36

    invoke-static {v4, v15, v1, v13, v5}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v16

    const/16 v18, 0xfc

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v1, v2

    move-object v2, v3

    move-object v3, v4

    move-object v4, v5

    move-object v5, v6

    move-object v6, v7

    move-object/from16 v7, v19

    move-object/from16 v27, v8

    move-object/from16 v8, v20

    move-object/from16 v9, v16

    move/from16 v28, v10

    move-object/from16 v10, p2

    move-object/from16 v29, v11

    move/from16 v11, v17

    move-object/from16 v30, v12

    move/from16 v12, v18

    invoke-static/range {v1 .. v12}, LB9/h;->i(Landroidx/compose/ui/e;Ljava/lang/String;Ljava/lang/String;Ls9/a;Lmh/a;Lmh/a;LB9/b;LB9/b;Lmh/q;LT/l;II)V

    invoke-static {v0, v13, v14, v15}, LBe/v0;->b(Landroidx/compose/ui/e;LT/l;II)V

    move-object/from16 v2, v30

    const/4 v1, 0x0

    invoke-static {v2, v1, v15, v0}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v2

    move/from16 v4, v28

    move-object/from16 v3, v29

    invoke-virtual {v3, v13, v4}, Lla/a;->d(LT/l;I)Lra/a;

    move-result-object v3

    invoke-virtual {v3}, Lra/a;->a()Lra/b;

    move-result-object v3

    invoke-virtual {v3}, Lra/b;->a()Lra/b$a$a;

    move-result-object v3

    invoke-virtual {v3}, Lra/b$a$a;->c()F

    move-result v3

    const/4 v4, 0x2

    invoke-static {v2, v3, v1, v4, v0}, Landroidx/compose/foundation/layout/o;->k(Landroidx/compose/ui/e;FFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    sget v2, Lm8/c;->c3:I

    invoke-static {v2, v13, v14}, LH0/f;->a(ILT/l;I)Ljava/lang/String;

    move-result-object v7

    const v2, -0x365c3f6d

    invoke-interface {v13, v2}, LT/l;->U(I)V

    move-object/from16 v2, v27

    invoke-interface {v13, v2}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v3

    invoke-interface/range {p2 .. p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_7

    sget-object v3, LT/l;->a:LT/l$a;

    invoke-virtual {v3}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v3

    if-ne v4, v3, :cond_8

    :cond_7
    new-instance v4, Lcom/ui/wifiman/ui/speedtest/feedback/i$b$c;

    invoke-direct {v4, v2}, Lcom/ui/wifiman/ui/speedtest/feedback/i$b$c;-><init>(Ljava/lang/Object;)V

    invoke-interface {v13, v4}, LT/l;->K(Ljava/lang/Object;)V

    :cond_8
    check-cast v4, Lth/g;

    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    invoke-virtual {v2}, Lcom/ui/wifiman/ui/speedtest/feedback/e;->p0()LLi/N;

    move-result-object v2

    invoke-static {v2, v0, v13, v14, v15}, LT/o1;->b(LLi/N;Ldh/i;LT/l;II)LT/z1;

    move-result-object v2

    invoke-interface {v2}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    move-object v2, v4

    check-cast v2, Lmh/a;

    const/4 v10, 0x0

    const/16 v11, 0xb8

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    move-object/from16 v9, p2

    invoke-static/range {v1 .. v11}, Lw9/r;->b(Landroidx/compose/ui/e;Lmh/a;ZZLs9/b;Lw9/p;Ljava/lang/String;LL0/U;LT/l;II)V

    invoke-static {v0, v13, v14, v15}, LBe/v0;->b(Landroidx/compose/ui/e;LT/l;II)V

    invoke-interface/range {p2 .. p2}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-static {}, LT/o;->P()V

    :cond_9
    :goto_2
    return-void
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lz/j;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lcom/ui/wifiman/ui/speedtest/feedback/i$b;->a(Lz/j;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
