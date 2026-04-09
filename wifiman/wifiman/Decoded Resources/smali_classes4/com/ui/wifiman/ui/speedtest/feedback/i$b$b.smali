.class final Lcom/ui/wifiman/ui/speedtest/feedback/i$b$b;
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

    iput-object p1, p0, Lcom/ui/wifiman/ui/speedtest/feedback/i$b$b;->a:Lcom/ui/wifiman/ui/speedtest/feedback/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(LT/q0;Lcom/ui/wifiman/ui/speedtest/feedback/e;LR0/Q;)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/ui/wifiman/ui/speedtest/feedback/i$b$b;->c(LT/q0;Lcom/ui/wifiman/ui/speedtest/feedback/e;LR0/Q;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method private static final c(LT/q0;Lcom/ui/wifiman/ui/speedtest/feedback/e;LR0/Q;)LYg/J;
    .locals 1

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p2}, LT/q0;->setValue(Ljava/lang/Object;)V

    invoke-virtual {p2}, LR0/Q;->i()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Lcom/ui/wifiman/ui/speedtest/feedback/e;->q0(Ljava/lang/String;)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method


# virtual methods
.method public final b(Lz/j;LT/l;I)V
    .locals 48

    move-object/from16 v0, p0

    move-object/from16 v15, p2

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

    goto/16 :goto_1

    :cond_1
    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, -0x1

    const-string v4, "com.ui.wifiman.ui.speedtest.feedback.SpeedtestFeedbackUi.<anonymous>.<anonymous>.<anonymous> (SpeedtestFeedbackUi.kt:125)"

    const v5, 0x183e5b14

    invoke-static {v5, v1, v2, v4}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    const v1, 0x713416c

    invoke-interface {v15, v1}, LT/l;->U(I)V

    invoke-interface/range {p2 .. p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v1

    sget-object v2, LT/l;->a:LT/l$a;

    invoke-virtual {v2}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v4

    const/4 v5, 0x0

    if-ne v1, v4, :cond_3

    new-instance v1, LR0/Q;

    const/4 v11, 0x7

    const/4 v12, 0x0

    const/4 v7, 0x0

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    move-object v6, v1

    invoke-direct/range {v6 .. v12}, LR0/Q;-><init>(Ljava/lang/String;JLL0/S;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v4, 0x2

    invoke-static {v1, v5, v4, v5}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object v1

    invoke-interface {v15, v1}, LT/l;->K(Ljava/lang/Object;)V

    :cond_3
    check-cast v1, LT/q0;

    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    sget-object v4, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/4 v6, 0x0

    const/4 v7, 0x1

    invoke-static {v4, v6, v7, v5}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v4

    const/16 v6, 0x78

    int-to-float v6, v6

    invoke-static {v6}, LY0/h;->j(F)F

    move-result v6

    invoke-static {v4, v6}, Landroidx/compose/foundation/layout/r;->i(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v4

    int-to-float v3, v3

    invoke-static {v3}, LY0/h;->j(F)F

    move-result v6

    invoke-static {v3}, LY0/h;->j(F)F

    move-result v3

    invoke-static {v4, v6, v3}, Landroidx/compose/foundation/layout/o;->j(Landroidx/compose/ui/e;FF)Landroidx/compose/ui/e;

    move-result-object v3

    invoke-interface {v1}, LT/q0;->getValue()Ljava/lang/Object;

    move-result-object v4

    move-object v6, v4

    check-cast v6, LR0/Q;

    new-instance v14, Lm0/j1;

    sget-object v4, Lla/a;->a:Lla/a;

    sget v7, Lla/a;->b:I

    invoke-virtual {v4, v15, v7}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v8

    invoke-virtual {v8}, Lma/a;->f()Lma/a$f;

    move-result-object v8

    invoke-virtual {v8}, Lma/a$f;->a()J

    move-result-wide v8

    invoke-direct {v14, v8, v9, v5}, Lm0/j1;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v4, v15, v7}, Lla/a;->c(LT/l;I)Lpa/c;

    move-result-object v5

    invoke-virtual {v5}, Lpa/c;->b()Lpa/b;

    move-result-object v5

    invoke-virtual {v5}, Lpa/b;->a()LL0/U;

    move-result-object v16

    invoke-virtual {v4, v15, v7}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v4

    invoke-virtual {v4}, Lma/a;->f()Lma/a$f;

    move-result-object v4

    invoke-virtual {v4}, Lma/a$f;->a()J

    move-result-wide v17

    const v46, 0xfffffe

    const/16 v47, 0x0

    const-wide/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const-wide/16 v26, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const-wide/16 v31, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const-wide/16 v38, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const/16 v45, 0x0

    invoke-static/range {v16 .. v47}, LL0/U;->c(LL0/U;JJLQ0/A;LQ0/v;LQ0/w;LQ0/k;Ljava/lang/String;JLW0/a;LW0/o;LS0/e;JLW0/k;Lm0/g1;Lo0/g;IIJLW0/q;LL0/B;LW0/h;IILW0/s;ILjava/lang/Object;)LL0/U;

    move-result-object v17

    const v4, 0x7137aac

    invoke-interface {v15, v4}, LT/l;->U(I)V

    iget-object v4, v0, Lcom/ui/wifiman/ui/speedtest/feedback/i$b$b;->a:Lcom/ui/wifiman/ui/speedtest/feedback/e;

    invoke-interface {v15, v4}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v4

    iget-object v5, v0, Lcom/ui/wifiman/ui/speedtest/feedback/i$b$b;->a:Lcom/ui/wifiman/ui/speedtest/feedback/e;

    invoke-interface/range {p2 .. p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v7

    if-nez v4, :cond_4

    invoke-virtual {v2}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v7, v2, :cond_5

    :cond_4
    new-instance v7, Lcom/ui/wifiman/ui/speedtest/feedback/n;

    invoke-direct {v7, v1, v5}, Lcom/ui/wifiman/ui/speedtest/feedback/n;-><init>(LT/q0;Lcom/ui/wifiman/ui/speedtest/feedback/e;)V

    invoke-interface {v15, v7}, LT/l;->K(Ljava/lang/Object;)V

    :cond_5
    move-object v2, v7

    check-cast v2, Lmh/l;

    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    const/16 v19, 0x0

    const v20, 0xbfd8

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v1, 0x0

    move-object/from16 v21, v14

    move-object v14, v1

    const/16 v16, 0x0

    const/16 v18, 0x180

    move-object v1, v6

    move-object/from16 v6, v17

    move-object/from16 v15, v21

    move-object/from16 v17, p2

    invoke-static/range {v1 .. v20}, LF/f;->c(LR0/Q;Lmh/l;Landroidx/compose/ui/e;ZZLL0/U;LF/D;LF/C;ZIILR0/c0;Lmh/l;Ly/m;Lm0/l0;Lmh/q;LT/l;III)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-static {}, LT/o;->P()V

    :cond_6
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

    invoke-virtual {p0, p1, p2, p3}, Lcom/ui/wifiman/ui/speedtest/feedback/i$b$b;->b(Lz/j;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
