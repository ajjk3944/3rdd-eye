.class final Lcom/ui/wifiman/ui/settings/feedback/e$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/ui/settings/feedback/e;->b(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/settings/feedback/a;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/ui/e;

.field final synthetic b:Lcom/ui/wifiman/ui/settings/feedback/a;


# direct methods
.method constructor <init>(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/settings/feedback/a;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/ui/settings/feedback/e$a;->a:Landroidx/compose/ui/e;

    iput-object p2, p0, Lcom/ui/wifiman/ui/settings/feedback/e$a;->b:Lcom/ui/wifiman/ui/settings/feedback/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a()LT/q0;
    .locals 1

    invoke-static {}, Lcom/ui/wifiman/ui/settings/feedback/e$a;->e()LT/q0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic b(LT/q0;Lcom/ui/wifiman/ui/settings/feedback/a;LR0/Q;)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/ui/wifiman/ui/settings/feedback/e$a;->f(LT/q0;Lcom/ui/wifiman/ui/settings/feedback/a;LR0/Q;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method private static final e()LT/q0;
    .locals 8

    new-instance v7, LR0/Q;

    const/4 v5, 0x7

    const/4 v6, 0x0

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    const/4 v4, 0x0

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, LR0/Q;-><init>(Ljava/lang/String;JLL0/S;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {v7, v0, v1, v0}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object v0

    return-object v0
.end method

.method private static final f(LT/q0;Lcom/ui/wifiman/ui/settings/feedback/a;LR0/Q;)LYg/J;
    .locals 1

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p2}, LT/q0;->setValue(Ljava/lang/Object;)V

    invoke-virtual {p2}, LR0/Q;->i()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Lcom/ui/wifiman/ui/settings/feedback/a;->o0(Ljava/lang/String;)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method


# virtual methods
.method public final c(Lz/j;LT/l;I)V
    .locals 58

    move-object/from16 v0, p0

    move-object/from16 v14, p2

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

    const-string v4, "com.ui.wifiman.ui.settings.feedback.AppFeedbackFormUi.<anonymous> (AppFeedbackFormUi.kt:49)"

    const v5, -0x9e224f3

    invoke-static {v5, v1, v2, v4}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    iget-object v1, v0, Lcom/ui/wifiman/ui/settings/feedback/e$a;->a:Landroidx/compose/ui/e;

    const/4 v15, 0x0

    const/4 v13, 0x1

    const/4 v12, 0x0

    invoke-static {v1, v15, v13, v12}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    sget-object v10, Lla/a;->a:Lla/a;

    sget v11, Lla/a;->b:I

    invoke-virtual {v10, v14, v11}, Lla/a;->d(LT/l;I)Lra/a;

    move-result-object v2

    invoke-virtual {v2}, Lra/a;->a()Lra/b;

    move-result-object v2

    invoke-virtual {v2}, Lra/b;->b()Lra/b$a$b;

    move-result-object v2

    invoke-virtual {v2}, Lra/b$a$b;->d()F

    move-result v2

    invoke-virtual {v10, v14, v11}, Lla/a;->d(LT/l;I)Lra/a;

    move-result-object v4

    invoke-virtual {v4}, Lra/a;->a()Lra/b;

    move-result-object v4

    invoke-virtual {v4}, Lra/b;->a()Lra/b$a$a;

    move-result-object v4

    invoke-virtual {v4}, Lra/b$a$a;->d()F

    move-result v4

    invoke-static {v1, v4, v2}, Landroidx/compose/foundation/layout/o;->j(Landroidx/compose/ui/e;FF)Landroidx/compose/ui/e;

    move-result-object v1

    sget-object v2, Lz/c;->a:Lz/c;

    int-to-float v3, v3

    invoke-static {v3}, LY0/h;->j(F)F

    move-result v3

    invoke-virtual {v2, v3}, Lz/c;->n(F)Lz/c$f;

    move-result-object v2

    iget-object v9, v0, Lcom/ui/wifiman/ui/settings/feedback/e$a;->b:Lcom/ui/wifiman/ui/settings/feedback/a;

    sget-object v3, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v3}, Lf0/c$a;->k()Lf0/c$b;

    move-result-object v3

    const/4 v4, 0x6

    invoke-static {v2, v3, v14, v4}, Lz/h;->a(Lz/c$m;Lf0/c$b;LT/l;I)LC0/C;

    move-result-object v2

    const/4 v8, 0x0

    invoke-static {v14, v8}, LT/j;->a(LT/l;I)I

    move-result v3

    invoke-interface/range {p2 .. p2}, LT/l;->G()LT/x;

    move-result-object v4

    invoke-static {v14, v1}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

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

    invoke-interface {v14, v6}, LT/l;->D(Lmh/a;)V

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

    sget-object v7, Lz/k;->a:Lz/k;

    new-instance v1, Ls9/d$b;

    sget v2, Lm8/c;->q:I

    invoke-direct {v1, v2}, Ls9/d$b;-><init>(I)V

    invoke-static {v1, v14, v8}, Lsa/a;->a(Ls9/d;LT/l;I)LL0/d;

    move-result-object v1

    invoke-virtual {v10, v14, v11}, Lla/a;->c(LT/l;I)Lpa/c;

    move-result-object v2

    invoke-virtual {v2}, Lpa/c;->b()Lpa/b;

    move-result-object v2

    invoke-virtual {v2}, Lpa/b;->a()LL0/U;

    move-result-object v22

    invoke-virtual {v10, v14, v11}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v2

    invoke-virtual {v2}, Lma/a;->f()Lma/a$f;

    move-result-object v2

    invoke-virtual {v2}, Lma/a$f;->b()J

    move-result-wide v3

    const/16 v25, 0x0

    const v26, 0x1fffa

    const/4 v2, 0x0

    const-wide/16 v5, 0x0

    const/16 v16, 0x0

    move-object/from16 v49, v7

    move-object/from16 v7, v16

    move-object/from16 v8, v16

    move-object/from16 v51, v9

    move-object/from16 v9, v16

    const-wide/16 v16, 0x0

    move-object/from16 v52, v10

    move/from16 v53, v11

    move-wide/from16 v10, v16

    const/16 v16, 0x0

    move-object/from16 v12, v16

    move-object/from16 v13, v16

    const-wide/16 v16, 0x0

    move-wide/from16 v14, v16

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v24, 0x0

    move-object/from16 v23, p2

    invoke-static/range {v1 .. v26}, LN/a1;->c(LL0/d;Landroidx/compose/ui/e;JJLQ0/v;LQ0/A;LQ0/k;JLW0/k;LW0/j;JIZIILjava/util/Map;Lmh/l;LL0/U;LT/l;III)V

    const/4 v14, 0x0

    new-array v1, v14, [Ljava/lang/Object;

    sget-object v2, LR0/Q;->d:LR0/Q$c;

    invoke-virtual {v2}, LR0/Q$c;->a()Lc0/k;

    move-result-object v2

    const v3, 0x1fc0a39e

    move-object/from16 v15, p2

    invoke-interface {v15, v3}, LT/l;->U(I)V

    invoke-interface/range {p2 .. p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v3

    sget-object v50, LT/l;->a:LT/l$a;

    invoke-virtual/range {v50 .. v50}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v4

    if-ne v3, v4, :cond_7

    new-instance v3, Lcom/ui/wifiman/ui/settings/feedback/c;

    invoke-direct {v3}, Lcom/ui/wifiman/ui/settings/feedback/c;-><init>()V

    invoke-interface {v15, v3}, LT/l;->K(Ljava/lang/Object;)V

    :cond_7
    move-object v4, v3

    check-cast v4, Lmh/a;

    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    const/16 v6, 0xc00

    const/4 v7, 0x4

    const/4 v3, 0x0

    move-object/from16 v5, p2

    invoke-static/range {v1 .. v7}, Lc0/c;->d([Ljava/lang/Object;Lc0/k;Ljava/lang/String;Lmh/a;LT/l;II)LT/q0;

    move-result-object v12

    sget-object v13, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/4 v6, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x1

    invoke-static {v13, v10, v11, v6}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    const/high16 v2, 0x3f800000    # 1.0f

    move-object/from16 v3, v49

    invoke-interface {v3, v1, v2, v14}, Lz/j;->a(Landroidx/compose/ui/e;FZ)Landroidx/compose/ui/e;

    move-result-object v49

    invoke-interface {v12}, LT/q0;->getValue()Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v54, v1

    check-cast v54, LR0/Q;

    move-object/from16 v4, v52

    move/from16 v5, v53

    invoke-virtual {v4, v15, v5}, Lla/a;->c(LT/l;I)Lpa/c;

    move-result-object v1

    invoke-virtual {v1}, Lpa/c;->b()Lpa/b;

    move-result-object v1

    invoke-virtual {v1}, Lpa/b;->b()LL0/U;

    move-result-object v52

    const/4 v1, 0x4

    int-to-float v1, v1

    invoke-static {v1}, LY0/h;->j(F)F

    move-result v1

    invoke-static {v1}, LE/h;->d(F)LE/g;

    move-result-object v53

    sget-object v1, LN/T0;->a:LN/T0;

    invoke-virtual {v4, v15, v5}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v2

    invoke-virtual {v2}, Lma/a;->f()Lma/a$f;

    move-result-object v2

    invoke-virtual {v2}, Lma/a$f;->b()J

    move-result-wide v2

    invoke-virtual {v4, v15, v5}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v7

    invoke-virtual {v7}, Lma/a;->f()Lma/a$f;

    move-result-object v7

    invoke-virtual {v7}, Lma/a$f;->b()J

    move-result-wide v8

    invoke-virtual {v4, v15, v5}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v4

    invoke-virtual {v4}, Lma/a;->f()Lma/a$f;

    move-result-object v4

    invoke-virtual {v4}, Lma/a$f;->c()J

    move-result-wide v40

    const/16 v47, 0x30

    const v48, 0x17fff6

    const-wide/16 v4, 0x0

    const-wide/16 v16, 0x0

    move-wide/from16 v6, v16

    move-wide/from16 v10, v16

    move-object/from16 v55, v12

    move-object/from16 v56, v13

    move-wide/from16 v12, v16

    move-wide/from16 v14, v16

    const-wide/16 v18, 0x0

    const-wide/16 v20, 0x0

    const-wide/16 v22, 0x0

    const-wide/16 v24, 0x0

    const-wide/16 v26, 0x0

    const-wide/16 v28, 0x0

    const-wide/16 v30, 0x0

    const-wide/16 v32, 0x0

    const-wide/16 v34, 0x0

    const-wide/16 v36, 0x0

    const-wide/16 v38, 0x0

    const-wide/16 v42, 0x0

    const/16 v45, 0x0

    const/16 v46, 0x0

    move-object/from16 v44, p2

    invoke-virtual/range {v1 .. v48}, LN/T0;->f(JJJJJJJJJJJJJJJJJJJJJLT/l;IIII)LN/S0;

    move-result-object v20

    const v1, 0x1fc0fdfb

    move-object/from16 v6, p2

    invoke-interface {v6, v1}, LT/l;->U(I)V

    move-object/from16 v1, v55

    invoke-interface {v6, v1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v2

    move-object/from16 v3, v51

    invoke-interface {v6, v3}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v2, v4

    invoke-interface/range {p2 .. p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v4

    if-nez v2, :cond_8

    invoke-virtual/range {v50 .. v50}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v4, v2, :cond_9

    :cond_8
    new-instance v4, Lcom/ui/wifiman/ui/settings/feedback/d;

    invoke-direct {v4, v1, v3}, Lcom/ui/wifiman/ui/settings/feedback/d;-><init>(LT/q0;Lcom/ui/wifiman/ui/settings/feedback/a;)V

    invoke-interface {v6, v4}, LT/l;->K(Ljava/lang/Object;)V

    :cond_9
    move-object v2, v4

    check-cast v2, Lmh/l;

    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    sget-object v1, Lcom/ui/wifiman/ui/settings/feedback/f;->a:Lcom/ui/wifiman/ui/settings/feedback/f;

    invoke-virtual {v1}, Lcom/ui/wifiman/ui/settings/feedback/f;->b()Lmh/p;

    move-result-object v8

    const/high16 v23, 0x180000

    const v24, 0x2ff58

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0xf

    const/16 v18, 0x0

    const/high16 v22, 0xc00000

    move-object/from16 v1, v54

    move-object/from16 v57, v3

    move-object/from16 v3, v49

    move-object/from16 v6, v52

    move-object/from16 v19, v53

    move-object/from16 v21, p2

    invoke-static/range {v1 .. v24}, LN/q0;->a(LR0/Q;Lmh/l;Landroidx/compose/ui/e;ZZLL0/U;Lmh/p;Lmh/p;Lmh/p;Lmh/p;ZLR0/c0;LF/D;LF/C;ZIILy/m;Lm0/i1;LN/S0;LT/l;III)V

    move-object/from16 v4, v56

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v4, v1, v2, v3}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    sget v4, Lm8/c;->o:I

    move-object/from16 v12, p2

    const/4 v5, 0x0

    invoke-static {v4, v12, v5}, LH0/f;->a(ILT/l;I)Ljava/lang/String;

    move-result-object v7

    const v4, 0x1fc14a0d

    invoke-interface {v12, v4}, LT/l;->U(I)V

    move-object/from16 v4, v57

    invoke-interface {v12, v4}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v6

    invoke-interface/range {p2 .. p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v8

    if-nez v6, :cond_a

    invoke-virtual/range {v50 .. v50}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v6

    if-ne v8, v6, :cond_b

    :cond_a
    new-instance v8, Lcom/ui/wifiman/ui/settings/feedback/e$a$a;

    invoke-direct {v8, v4}, Lcom/ui/wifiman/ui/settings/feedback/e$a$a;-><init>(Ljava/lang/Object;)V

    invoke-interface {v12, v8}, LT/l;->K(Ljava/lang/Object;)V

    :cond_b
    check-cast v8, Lth/g;

    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    invoke-virtual {v4}, Lcom/ui/wifiman/ui/settings/feedback/a;->n0()LLi/N;

    move-result-object v4

    invoke-static {v4, v3, v12, v5, v2}, LT/o1;->b(LLi/N;Ldh/i;LT/l;II)LT/z1;

    move-result-object v2

    invoke-interface {v2}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    move-object v2, v8

    check-cast v2, Lmh/a;

    const/4 v10, 0x6

    const/16 v11, 0xb8

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    move-object/from16 v9, p2

    invoke-static/range {v1 .. v11}, Lw9/r;->b(Landroidx/compose/ui/e;Lmh/a;ZZLs9/b;Lw9/p;Ljava/lang/String;LL0/U;LT/l;II)V

    invoke-interface/range {p2 .. p2}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_c

    invoke-static {}, LT/o;->P()V

    :cond_c
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

    invoke-virtual {p0, p1, p2, p3}, Lcom/ui/wifiman/ui/settings/feedback/e$a;->c(Lz/j;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
