.class final LRe/e$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LRe/e;->c(Landroidx/compose/ui/e;LRe/a;Lof/a$c;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lof/a$c;

.field final synthetic b:LIi/N;

.field final synthetic c:LRe/a;


# direct methods
.method constructor <init>(Lof/a$c;LIi/N;LRe/a;)V
    .locals 0

    iput-object p1, p0, LRe/e$a;->a:Lof/a$c;

    iput-object p2, p0, LRe/e$a;->b:LIi/N;

    iput-object p3, p0, LRe/e$a;->c:LRe/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(LIi/N;LRe/a;)LYg/J;
    .locals 0

    invoke-static {p0, p1}, LRe/e$a;->c(LIi/N;LRe/a;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method private static final c(LIi/N;LRe/a;)LYg/J;
    .locals 6

    new-instance v3, LRe/e$a$a;

    const/4 v0, 0x0

    invoke-direct {v3, p1, v0}, LRe/e$a$a;-><init>(LRe/a;Ldh/e;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v5}, LIi/i;->d(LIi/N;Ldh/i;LIi/P;Lmh/p;ILjava/lang/Object;)LIi/y0;

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method


# virtual methods
.method public final b(Lq/e;LT/l;I)V
    .locals 58

    move-object/from16 v0, p0

    move-object/from16 v2, p2

    const-string v1, "$this$AnimatedVisibility"

    move-object/from16 v3, p1

    invoke-static {v3, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v3, "com.ui.wifiman.ui.settings.AppSettingsAccountLayout.<anonymous>.<anonymous> (AppSettingsAccountLayout.kt:88)"

    const v4, 0x50167dec

    move/from16 v5, p3

    invoke-static {v4, v5, v1, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    sget-object v1, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/4 v3, 0x0

    const/4 v14, 0x1

    const/4 v15, 0x0

    invoke-static {v1, v3, v14, v15}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v3

    sget-object v4, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v4}, Lf0/c$a;->g()Lf0/c$b;

    move-result-object v4

    iget-object v12, v0, LRe/e$a;->a:Lof/a$c;

    iget-object v10, v0, LRe/e$a;->b:LIi/N;

    iget-object v11, v0, LRe/e$a;->c:LRe/a;

    sget-object v5, Lz/c;->a:Lz/c;

    invoke-virtual {v5}, Lz/c;->g()Lz/c$m;

    move-result-object v5

    const/16 v6, 0x30

    invoke-static {v5, v4, v2, v6}, Lz/h;->a(Lz/c$m;Lf0/c$b;LT/l;I)LC0/C;

    move-result-object v4

    const/4 v9, 0x0

    invoke-static {v2, v9}, LT/j;->a(LT/l;I)I

    move-result v5

    invoke-interface/range {p2 .. p2}, LT/l;->G()LT/x;

    move-result-object v6

    invoke-static {v2, v3}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v3

    sget-object v7, LE0/g;->K:LE0/g$a;

    invoke-virtual {v7}, LE0/g$a;->a()Lmh/a;

    move-result-object v8

    invoke-interface/range {p2 .. p2}, LT/l;->x()LT/f;

    move-result-object v13

    if-nez v13, :cond_1

    invoke-static {}, LT/j;->c()V

    :cond_1
    invoke-interface/range {p2 .. p2}, LT/l;->u()V

    invoke-interface/range {p2 .. p2}, LT/l;->o()Z

    move-result v13

    if-eqz v13, :cond_2

    invoke-interface {v2, v8}, LT/l;->D(Lmh/a;)V

    goto :goto_0

    :cond_2
    invoke-interface/range {p2 .. p2}, LT/l;->I()V

    :goto_0
    invoke-static/range {p2 .. p2}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v8

    invoke-virtual {v7}, LE0/g$a;->e()Lmh/p;

    move-result-object v13

    invoke-static {v8, v4, v13}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v7}, LE0/g$a;->g()Lmh/p;

    move-result-object v4

    invoke-static {v8, v6, v4}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v7}, LE0/g$a;->b()Lmh/p;

    move-result-object v4

    invoke-interface {v8}, LT/l;->o()Z

    move-result v6

    if-nez v6, :cond_3

    invoke-interface {v8}, LT/l;->f()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v6, v13}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_4

    :cond_3
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v8, v6}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v8, v5, v4}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_4
    invoke-virtual {v7}, LE0/g$a;->f()Lmh/p;

    move-result-object v4

    invoke-static {v8, v3, v4}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v3, Lz/k;->a:Lz/k;

    invoke-virtual {v12}, Lof/a$c;->q0()LLi/N;

    move-result-object v3

    invoke-static {v3, v15, v2, v9, v14}, LT/o1;->b(LLi/N;Ldh/i;LT/l;II)LT/z1;

    move-result-object v3

    invoke-interface {v3}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ls9/d;

    const v4, -0x39e15001    # -10155.999f

    invoke-interface {v2, v4}, LT/l;->U(I)V

    if-nez v3, :cond_5

    move-object v3, v15

    goto :goto_1

    :cond_5
    invoke-static {v3, v2, v9}, Lsa/a;->a(Ls9/d;LT/l;I)LL0/d;

    move-result-object v3

    :goto_1
    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    if-nez v3, :cond_6

    new-instance v3, LL0/d;

    const/16 v20, 0x6

    const/16 v21, 0x0

    const-string v17, ""

    const/16 v18, 0x0

    const/16 v19, 0x0

    move-object/from16 v16, v3

    invoke-direct/range {v16 .. v21}, LL0/d;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :cond_6
    move-object/from16 v23, v3

    sget-object v3, Lla/a;->a:Lla/a;

    sget v4, Lla/a;->b:I

    invoke-virtual {v3, v2, v4}, Lla/a;->c(LT/l;I)Lpa/c;

    move-result-object v5

    invoke-virtual {v5}, Lpa/c;->a()Lpa/b;

    move-result-object v5

    invoke-virtual {v5}, Lpa/b;->e()LL0/U;

    move-result-object v24

    const/16 v5, 0x18

    invoke-static {v5}, LY0/w;->g(I)J

    move-result-wide v27

    const v54, 0xfffffd

    const/16 v55, 0x0

    const-wide/16 v25, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const-wide/16 v34, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const-wide/16 v39, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const/16 v45, 0x0

    const-wide/16 v46, 0x0

    const/16 v48, 0x0

    const/16 v49, 0x0

    const/16 v50, 0x0

    const/16 v51, 0x0

    const/16 v52, 0x0

    const/16 v53, 0x0

    invoke-static/range {v24 .. v55}, LL0/U;->c(LL0/U;JJLQ0/A;LQ0/v;LQ0/w;LQ0/k;Ljava/lang/String;JLW0/a;LW0/o;LS0/e;JLW0/k;Lm0/g1;Lo0/g;IIJLW0/q;LL0/B;LW0/h;IILW0/s;ILjava/lang/Object;)LL0/U;

    move-result-object v22

    sget-object v5, LW0/j;->b:LW0/j$a;

    invoke-virtual {v5}, LW0/j$a;->a()I

    move-result v5

    invoke-virtual {v3, v2, v4}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v3

    invoke-virtual {v3}, Lma/a;->f()Lma/a$f;

    move-result-object v3

    invoke-virtual {v3}, Lma/a$f;->a()J

    move-result-wide v3

    invoke-static {v5}, LW0/j;->h(I)LW0/j;

    move-result-object v13

    const/16 v25, 0x0

    const v26, 0x1fdf8

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/16 v16, 0x0

    move-object/from16 v9, v16

    const-wide/16 v16, 0x0

    move-object/from16 v56, v10

    move-object/from16 v57, v11

    move-wide/from16 v10, v16

    const/16 v16, 0x0

    move-object/from16 v27, v12

    move-object/from16 v12, v16

    const-wide/16 v16, 0x0

    move-wide/from16 v14, v16

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v24, 0x30

    move-object/from16 p1, v1

    move-object/from16 v1, v23

    move-object/from16 v2, p1

    move-object/from16 v23, p2

    invoke-static/range {v1 .. v26}, LN/a1;->c(LL0/d;Landroidx/compose/ui/e;JJLQ0/v;LQ0/A;LQ0/k;JLW0/k;LW0/j;JIZIILjava/util/Map;Lmh/l;LL0/U;LT/l;III)V

    invoke-virtual/range {v27 .. v27}, Lof/a$c;->p0()LLi/N;

    move-result-object v1

    move-object/from16 v2, p2

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static {v1, v4, v2, v5, v3}, LT/o1;->b(LLi/N;Ldh/i;LT/l;II)LT/z1;

    move-result-object v1

    invoke-interface {v1}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ls9/d;

    if-nez v1, :cond_7

    new-instance v1, Ls9/d$c;

    const-string v3, ""

    invoke-direct {v1, v3}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    :cond_7
    const v3, -0x39e112a2

    invoke-interface {v2, v3}, LT/l;->U(I)V

    move-object/from16 v3, v56

    invoke-interface {v2, v3}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v4

    move-object/from16 v5, v57

    invoke-interface {v2, v5}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v6

    or-int/2addr v4, v6

    invoke-interface/range {p2 .. p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v6

    if-nez v4, :cond_8

    sget-object v4, LT/l;->a:LT/l$a;

    invoke-virtual {v4}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v4

    if-ne v6, v4, :cond_9

    :cond_8
    new-instance v6, LRe/d;

    invoke-direct {v6, v3, v5}, LRe/d;-><init>(LIi/N;LRe/a;)V

    invoke-interface {v2, v6}, LT/l;->K(Ljava/lang/Object;)V

    :cond_9
    check-cast v6, Lmh/a;

    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    const/4 v3, 0x6

    move-object/from16 v4, p1

    invoke-static {v4, v1, v6, v2, v3}, LRe/e;->g(Landroidx/compose/ui/e;Ls9/d;Lmh/a;LT/l;I)V

    invoke-interface/range {p2 .. p2}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_a

    invoke-static {}, LT/o;->P()V

    :cond_a
    return-void
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lq/e;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, LRe/e$a;->b(Lq/e;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
