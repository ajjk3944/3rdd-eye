.class final LRe/m$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LRe/m;->e(Landroidx/compose/ui/e;LRe/a;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LRe/a;

.field final synthetic b:LIi/N;


# direct methods
.method constructor <init>(LRe/a;LIi/N;)V
    .locals 0

    iput-object p1, p0, LRe/m$c;->a:LRe/a;

    iput-object p2, p0, LRe/m$c;->b:LIi/N;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(LIi/N;LRe/a;)LYg/J;
    .locals 0

    invoke-static {p0, p1}, LRe/m$c;->j(LIi/N;LRe/a;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b()LYg/J;
    .locals 1

    invoke-static {}, LRe/m$c;->h()LYg/J;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c(LIi/N;LRe/a;)LYg/J;
    .locals 0

    invoke-static {p0, p1}, LRe/m$c;->k(LIi/N;LRe/a;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(LIi/N;LRe/a;)LYg/J;
    .locals 0

    invoke-static {p0, p1}, LRe/m$c;->i(LIi/N;LRe/a;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method private static final h()LYg/J;
    .locals 1

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method

.method private static final i(LIi/N;LRe/a;)LYg/J;
    .locals 6

    new-instance v3, LRe/m$c$b;

    const/4 v0, 0x0

    invoke-direct {v3, p1, v0}, LRe/m$c$b;-><init>(LRe/a;Ldh/e;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v5}, LIi/i;->d(LIi/N;Ldh/i;LIi/P;Lmh/p;ILjava/lang/Object;)LIi/y0;

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final j(LIi/N;LRe/a;)LYg/J;
    .locals 6

    new-instance v3, LRe/m$c$c;

    const/4 v0, 0x0

    invoke-direct {v3, p1, v0}, LRe/m$c$c;-><init>(LRe/a;Ldh/e;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v5}, LIi/i;->d(LIi/N;Ldh/i;LIi/P;Lmh/p;ILjava/lang/Object;)LIi/y0;

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final k(LIi/N;LRe/a;)LYg/J;
    .locals 6

    new-instance v3, LRe/m$c$d;

    const/4 v0, 0x0

    invoke-direct {v3, p1, v0}, LRe/m$c$d;-><init>(LRe/a;Ldh/e;)V

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
.method public final f(Lz/A;LT/l;I)V
    .locals 28

    move-object/from16 v0, p0

    move-object/from16 v14, p2

    move/from16 v1, p3

    const-string v2, "$this$FlowRow"

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

    const-string v3, "com.ui.wifiman.ui.settings.FooterRow.<anonymous> (AppSettingsUi.kt:251)"

    const v4, 0x177331e5

    invoke-static {v4, v1, v2, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    sget-object v15, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    sget v1, Lm8/c;->d2:I

    const/4 v3, 0x0

    invoke-static {v1, v14, v3}, LH0/f;->a(ILT/l;I)Ljava/lang/String;

    move-result-object v19

    iget-object v1, v0, LRe/m$c;->a:LRe/a;

    const v2, -0x3078f1b1

    invoke-interface {v14, v2}, LT/l;->U(I)V

    invoke-interface {v14, v1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v2

    invoke-interface/range {p2 .. p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v4

    if-nez v2, :cond_3

    sget-object v2, LT/l;->a:LT/l$a;

    invoke-virtual {v2}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v4, v2, :cond_4

    :cond_3
    new-instance v4, LRe/m$c$a;

    invoke-direct {v4, v1}, LRe/m$c$a;-><init>(Ljava/lang/Object;)V

    invoke-interface {v14, v4}, LT/l;->K(Ljava/lang/Object;)V

    :cond_4
    check-cast v4, Lth/g;

    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    move-object/from16 v20, v4

    check-cast v20, Lmh/a;

    const v1, -0x30790c04

    invoke-interface {v14, v1}, LT/l;->U(I)V

    invoke-interface/range {p2 .. p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v1

    sget-object v27, LT/l;->a:LT/l$a;

    invoke-virtual/range {v27 .. v27}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v1, v2, :cond_5

    new-instance v1, LRe/v;

    invoke-direct {v1}, LRe/v;-><init>()V

    invoke-interface {v14, v1}, LT/l;->K(Ljava/lang/Object;)V

    :cond_5
    move-object/from16 v22, v1

    check-cast v22, Lmh/a;

    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    const/16 v23, 0x26

    const/16 v24, 0x0

    const/16 v16, 0x1

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v21, 0x0

    invoke-static/range {v15 .. v24}, Landroidx/compose/foundation/d;->h(Landroidx/compose/ui/e;ZLjava/lang/String;LJ0/g;Ljava/lang/String;Lmh/a;Lmh/a;Lmh/a;ILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v2

    iget-object v1, v0, LRe/m$c;->a:LRe/a;

    invoke-virtual {v1}, LRe/a;->n0()LLi/N;

    move-result-object v1

    const/4 v4, 0x0

    const/4 v5, 0x1

    invoke-static {v1, v4, v14, v3, v5}, LT/o1;->b(LLi/N;Ldh/i;LT/l;II)LT/z1;

    move-result-object v1

    invoke-interface {v1}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ls9/d;

    invoke-static {v1, v14, v3}, Lsa/a;->a(Ls9/d;LT/l;I)LL0/d;

    move-result-object v1

    sget-object v3, Lla/a;->a:Lla/a;

    sget v4, Lla/a;->b:I

    invoke-virtual {v3, v14, v4}, Lla/a;->c(LT/l;I)Lpa/c;

    move-result-object v5

    invoke-virtual {v5}, Lpa/c;->b()Lpa/b;

    move-result-object v5

    invoke-virtual {v5}, Lpa/b;->f()LL0/U;

    move-result-object v22

    invoke-virtual {v3, v14, v4}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v3

    invoke-virtual {v3}, Lma/a;->f()Lma/a$f;

    move-result-object v3

    invoke-virtual {v3}, Lma/a$f;->c()J

    move-result-wide v3

    const/16 v25, 0x0

    const v26, 0x1fff8

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const-wide/16 v15, 0x0

    move-wide v14, v15

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v24, 0x0

    move-object/from16 v23, p2

    invoke-static/range {v1 .. v26}, LN/a1;->c(LL0/d;Landroidx/compose/ui/e;JJLQ0/v;LQ0/A;LQ0/k;JLW0/k;LW0/j;JIZIILjava/util/Map;Lmh/l;LL0/U;LT/l;III)V

    new-instance v2, Ls9/d$b;

    sget v1, Lm8/c;->f2:I

    invoke-direct {v2, v1}, Ls9/d$b;-><init>(I)V

    const v1, -0x3078c677

    move-object/from16 v7, p2

    invoke-interface {v7, v1}, LT/l;->U(I)V

    iget-object v1, v0, LRe/m$c;->b:LIi/N;

    invoke-interface {v7, v1}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v1

    iget-object v3, v0, LRe/m$c;->a:LRe/a;

    invoke-interface {v7, v3}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v1, v3

    iget-object v3, v0, LRe/m$c;->b:LIi/N;

    iget-object v4, v0, LRe/m$c;->a:LRe/a;

    invoke-interface/range {p2 .. p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v5

    if-nez v1, :cond_6

    invoke-virtual/range {v27 .. v27}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v5, v1, :cond_7

    :cond_6
    new-instance v5, LRe/w;

    invoke-direct {v5, v3, v4}, LRe/w;-><init>(LIi/N;LRe/a;)V

    invoke-interface {v7, v5}, LT/l;->K(Ljava/lang/Object;)V

    :cond_7
    move-object v3, v5

    check-cast v3, Lmh/a;

    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    const/4 v5, 0x0

    const/4 v6, 0x1

    const/4 v1, 0x0

    move-object/from16 v4, p2

    invoke-static/range {v1 .. v6}, LRe/h;->b(Landroidx/compose/ui/e;Ls9/d;Lmh/a;LT/l;II)V

    new-instance v2, Ls9/d$b;

    sget v1, Lm8/c;->b2:I

    invoke-direct {v2, v1}, Ls9/d$b;-><init>(I)V

    const v1, -0x3078aaf4

    invoke-interface {v7, v1}, LT/l;->U(I)V

    iget-object v1, v0, LRe/m$c;->b:LIi/N;

    invoke-interface {v7, v1}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v1

    iget-object v3, v0, LRe/m$c;->a:LRe/a;

    invoke-interface {v7, v3}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v1, v3

    iget-object v3, v0, LRe/m$c;->b:LIi/N;

    iget-object v4, v0, LRe/m$c;->a:LRe/a;

    invoke-interface/range {p2 .. p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v5

    if-nez v1, :cond_8

    invoke-virtual/range {v27 .. v27}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v5, v1, :cond_9

    :cond_8
    new-instance v5, LRe/x;

    invoke-direct {v5, v3, v4}, LRe/x;-><init>(LIi/N;LRe/a;)V

    invoke-interface {v7, v5}, LT/l;->K(Ljava/lang/Object;)V

    :cond_9
    move-object v3, v5

    check-cast v3, Lmh/a;

    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    const/4 v5, 0x0

    const/4 v6, 0x1

    const/4 v1, 0x0

    move-object/from16 v4, p2

    invoke-static/range {v1 .. v6}, LRe/h;->b(Landroidx/compose/ui/e;Ls9/d;Lmh/a;LT/l;II)V

    new-instance v2, Ls9/d$b;

    sget v1, Lm8/c;->a2:I

    invoke-direct {v2, v1}, Ls9/d$b;-><init>(I)V

    const v1, -0x30788ed1

    invoke-interface {v7, v1}, LT/l;->U(I)V

    iget-object v1, v0, LRe/m$c;->b:LIi/N;

    invoke-interface {v7, v1}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v1

    iget-object v3, v0, LRe/m$c;->a:LRe/a;

    invoke-interface {v7, v3}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v1, v3

    iget-object v3, v0, LRe/m$c;->b:LIi/N;

    iget-object v4, v0, LRe/m$c;->a:LRe/a;

    invoke-interface/range {p2 .. p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v5

    if-nez v1, :cond_a

    invoke-virtual/range {v27 .. v27}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v5, v1, :cond_b

    :cond_a
    new-instance v5, LRe/y;

    invoke-direct {v5, v3, v4}, LRe/y;-><init>(LIi/N;LRe/a;)V

    invoke-interface {v7, v5}, LT/l;->K(Ljava/lang/Object;)V

    :cond_b
    move-object v3, v5

    check-cast v3, Lmh/a;

    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    const/4 v5, 0x0

    const/4 v6, 0x1

    const/4 v1, 0x0

    move-object/from16 v4, p2

    invoke-static/range {v1 .. v6}, LRe/h;->b(Landroidx/compose/ui/e;Ls9/d;Lmh/a;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_c

    invoke-static {}, LT/o;->P()V

    :cond_c
    :goto_1
    return-void
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lz/A;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, LRe/m$c;->f(Lz/A;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
