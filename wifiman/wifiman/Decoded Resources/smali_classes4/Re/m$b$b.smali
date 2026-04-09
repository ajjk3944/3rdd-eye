.class final LRe/m$b$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LRe/m$b;->a(Lz/N;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ls9/b$b;

.field final synthetic b:Ls9/b;

.field final synthetic c:LIi/N;

.field final synthetic d:LRe/a;


# direct methods
.method constructor <init>(Ls9/b$b;Ls9/b;LIi/N;LRe/a;)V
    .locals 0

    iput-object p1, p0, LRe/m$b$b;->a:Ls9/b$b;

    iput-object p2, p0, LRe/m$b$b;->b:Ls9/b;

    iput-object p3, p0, LRe/m$b$b;->c:LIi/N;

    iput-object p4, p0, LRe/m$b$b;->d:LRe/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(LIi/N;LRe/a;)LYg/J;
    .locals 0

    invoke-static {p0, p1}, LRe/m$b$b;->k(LIi/N;LRe/a;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(LIi/N;LRe/a;)LYg/J;
    .locals 0

    invoke-static {p0, p1}, LRe/m$b$b;->j(LIi/N;LRe/a;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(LIi/N;LRe/a;)LYg/J;
    .locals 0

    invoke-static {p0, p1}, LRe/m$b$b;->i(LIi/N;LRe/a;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(LIi/N;LRe/a;)LYg/J;
    .locals 0

    invoke-static {p0, p1}, LRe/m$b$b;->h(LIi/N;LRe/a;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method private static final h(LIi/N;LRe/a;)LYg/J;
    .locals 6

    new-instance v3, LRe/m$b$b$a;

    const/4 v0, 0x0

    invoke-direct {v3, p1, v0}, LRe/m$b$b$a;-><init>(LRe/a;Ldh/e;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v5}, LIi/i;->d(LIi/N;Ldh/i;LIi/P;Lmh/p;ILjava/lang/Object;)LIi/y0;

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final i(LIi/N;LRe/a;)LYg/J;
    .locals 6

    new-instance v3, LRe/m$b$b$b;

    const/4 v0, 0x0

    invoke-direct {v3, p1, v0}, LRe/m$b$b$b;-><init>(LRe/a;Ldh/e;)V

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

    new-instance v3, LRe/m$b$b$c;

    const/4 v0, 0x0

    invoke-direct {v3, p1, v0}, LRe/m$b$b$c;-><init>(LRe/a;Ldh/e;)V

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

    new-instance v3, LRe/m$b$b$d;

    const/4 v0, 0x0

    invoke-direct {v3, p1, v0}, LRe/m$b$b$d;-><init>(LRe/a;Ldh/e;)V

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
.method public final f(LA9/i;LT/l;I)V
    .locals 26

    move-object/from16 v0, p0

    move-object/from16 v15, p2

    const-string v1, "$this$UiSettingsCard"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.ui.wifiman.ui.settings.AppSettings.<anonymous>.<anonymous>.<anonymous> (AppSettingsUi.kt:152)"

    const v3, 0x7d5cb588

    move/from16 v4, p3

    invoke-static {v3, v4, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    sget-object v7, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/4 v6, 0x0

    const/4 v3, 0x1

    const/4 v2, 0x0

    invoke-static {v7, v6, v3, v2}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    sget-object v19, LN9/b;->a:LN9/b;

    invoke-virtual/range {v19 .. v19}, LN9/b;->D()Ls9/b;

    move-result-object v4

    iget-object v5, v0, LRe/m$b$b;->a:Ls9/b$b;

    invoke-virtual {v4, v5}, Ls9/b;->f(Ls9/b$b;)Ls9/b;

    move-result-object v20

    sget v4, Lm8/c;->c2:I

    const/4 v14, 0x0

    invoke-static {v4, v15, v14}, LH0/f;->a(ILT/l;I)Ljava/lang/String;

    move-result-object v21

    sget-object v22, LF9/r;->DEFAULT_WITH_BLUE_ICON:LF9/r;

    iget-object v13, v0, LRe/m$b$b;->b:Ls9/b;

    const v4, -0x72e45b8f

    invoke-interface {v15, v4}, LT/l;->U(I)V

    iget-object v4, v0, LRe/m$b$b;->c:LIi/N;

    invoke-interface {v15, v4}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v4

    iget-object v5, v0, LRe/m$b$b;->d:LRe/a;

    invoke-interface {v15, v5}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v4, v5

    iget-object v5, v0, LRe/m$b$b;->c:LIi/N;

    iget-object v8, v0, LRe/m$b$b;->d:LRe/a;

    invoke-interface/range {p2 .. p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v9

    if-nez v4, :cond_1

    sget-object v4, LT/l;->a:LT/l$a;

    invoke-virtual {v4}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v4

    if-ne v9, v4, :cond_2

    :cond_1
    new-instance v9, LRe/p;

    invoke-direct {v9, v5, v8}, LRe/p;-><init>(LIi/N;LRe/a;)V

    invoke-interface {v15, v9}, LT/l;->K(Ljava/lang/Object;)V

    :cond_2
    move-object v11, v9

    check-cast v11, Lmh/a;

    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    const/16 v17, 0x0

    const/16 v18, 0x3b18

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v8, 0x1

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/16 v16, 0x0

    move-object/from16 v23, v13

    move/from16 v13, v16

    const/16 v16, 0x0

    move-object/from16 v14, v16

    const v16, 0xd80006

    move-object/from16 v2, v20

    move-object/from16 v3, v21

    move-object/from16 v6, v23

    move-object/from16 v24, v7

    move-object/from16 v7, v22

    move-object/from16 v15, p2

    invoke-static/range {v1 .. v18}, LF9/u;->c(Landroidx/compose/ui/e;Ls9/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ls9/b;LF9/r;ZLjava/lang/Boolean;Ljava/lang/String;Lmh/a;Lmh/a;FLmh/q;LT/l;III)V

    move-object/from16 v15, v24

    const/4 v4, 0x0

    const/4 v6, 0x1

    const/4 v7, 0x0

    invoke-static {v15, v7, v6, v4}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    sget-object v2, LPe/a;->a:LPe/a;

    invoke-virtual {v2}, LPe/a;->p()Ls9/b;

    move-result-object v2

    iget-object v3, v0, LRe/m$b$b;->a:Ls9/b$b;

    invoke-virtual {v2, v3}, Ls9/b;->f(Ls9/b$b;)Ls9/b;

    move-result-object v2

    sget v3, Lm8/c;->g2:I

    move-object/from16 v14, p2

    const/4 v13, 0x0

    invoke-static {v3, v14, v13}, LH0/f;->a(ILT/l;I)Ljava/lang/String;

    move-result-object v3

    sget v5, Lm8/c;->h2:I

    invoke-static {v5, v14, v13}, LH0/f;->a(ILT/l;I)Ljava/lang/String;

    move-result-object v20

    iget-object v12, v0, LRe/m$b$b;->b:Ls9/b;

    const v5, -0x72e40e4e

    invoke-interface {v14, v5}, LT/l;->U(I)V

    iget-object v5, v0, LRe/m$b$b;->c:LIi/N;

    invoke-interface {v14, v5}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v5

    iget-object v8, v0, LRe/m$b$b;->d:LRe/a;

    invoke-interface {v14, v8}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v8

    or-int/2addr v5, v8

    iget-object v8, v0, LRe/m$b$b;->c:LIi/N;

    iget-object v9, v0, LRe/m$b$b;->d:LRe/a;

    invoke-interface/range {p2 .. p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v10

    if-nez v5, :cond_3

    sget-object v5, LT/l;->a:LT/l$a;

    invoke-virtual {v5}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v5

    if-ne v10, v5, :cond_4

    :cond_3
    new-instance v10, LRe/q;

    invoke-direct {v10, v8, v9}, LRe/q;-><init>(LIi/N;LRe/a;)V

    invoke-interface {v14, v10}, LT/l;->K(Ljava/lang/Object;)V

    :cond_4
    move-object v11, v10

    check-cast v11, Lmh/a;

    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    const/16 v17, 0x0

    const/16 v18, 0x3b10

    const/4 v5, 0x0

    const/4 v8, 0x1

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/16 v16, 0x0

    move-object/from16 v21, v12

    move-object/from16 v12, v16

    const/16 v16, 0x0

    move/from16 v13, v16

    const/16 v16, 0x0

    move-object/from16 v14, v16

    const v16, 0xd80006

    move-object/from16 v4, v20

    move-object/from16 v6, v21

    move-object/from16 v7, v22

    move-object v0, v15

    move-object/from16 v15, p2

    invoke-static/range {v1 .. v18}, LF9/u;->c(Landroidx/compose/ui/e;Ls9/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ls9/b;LF9/r;ZLjava/lang/Boolean;Ljava/lang/String;Lmh/a;Lmh/a;FLmh/q;LT/l;III)V

    const/4 v6, 0x0

    const/4 v7, 0x1

    const/4 v15, 0x0

    invoke-static {v0, v15, v7, v6}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    invoke-virtual/range {v19 .. v19}, LN9/b;->N()Ls9/b;

    move-result-object v2

    move-object v3, v0

    move-object/from16 v0, p0

    iget-object v4, v0, LRe/m$b$b;->a:Ls9/b$b;

    invoke-virtual {v2, v4}, Ls9/b;->f(Ls9/b$b;)Ls9/b;

    move-result-object v2

    sget v4, Lm8/c;->i2:I

    move-object/from16 v14, p2

    const/4 v13, 0x0

    invoke-static {v4, v14, v13}, LH0/f;->a(ILT/l;I)Ljava/lang/String;

    move-result-object v20

    iget-object v12, v0, LRe/m$b$b;->b:Ls9/b;

    const v4, -0x72e3cc91

    invoke-interface {v14, v4}, LT/l;->U(I)V

    iget-object v4, v0, LRe/m$b$b;->c:LIi/N;

    invoke-interface {v14, v4}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v4

    iget-object v5, v0, LRe/m$b$b;->d:LRe/a;

    invoke-interface {v14, v5}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v4, v5

    iget-object v5, v0, LRe/m$b$b;->c:LIi/N;

    iget-object v8, v0, LRe/m$b$b;->d:LRe/a;

    invoke-interface/range {p2 .. p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v9

    if-nez v4, :cond_5

    sget-object v4, LT/l;->a:LT/l$a;

    invoke-virtual {v4}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v4

    if-ne v9, v4, :cond_6

    :cond_5
    new-instance v9, LRe/r;

    invoke-direct {v9, v5, v8}, LRe/r;-><init>(LIi/N;LRe/a;)V

    invoke-interface {v14, v9}, LT/l;->K(Ljava/lang/Object;)V

    :cond_6
    move-object v11, v9

    check-cast v11, Lmh/a;

    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    const/16 v17, 0x0

    const/16 v18, 0x3b18

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v8, 0x1

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/16 v16, 0x0

    move-object/from16 v21, v12

    move-object/from16 v12, v16

    const/16 v16, 0x0

    move/from16 v13, v16

    const/16 v16, 0x0

    move-object/from16 v14, v16

    const v16, 0xd80006

    move-object/from16 v25, v3

    move-object/from16 v3, v20

    move-object/from16 v6, v21

    move-object/from16 v7, v22

    move v0, v15

    move-object/from16 v15, p2

    invoke-static/range {v1 .. v18}, LF9/u;->c(Landroidx/compose/ui/e;Ls9/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ls9/b;LF9/r;ZLjava/lang/Boolean;Ljava/lang/String;Lmh/a;Lmh/a;FLmh/q;LT/l;III)V

    move-object/from16 v1, v25

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v1, v0, v2, v3}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    invoke-virtual/range {v19 .. v19}, LN9/b;->n()Ls9/b;

    move-result-object v0

    move-object/from16 v15, p0

    iget-object v2, v15, LRe/m$b$b;->a:Ls9/b$b;

    invoke-virtual {v0, v2}, Ls9/b;->f(Ls9/b$b;)Ls9/b;

    move-result-object v2

    sget v0, Lm8/c;->e2:I

    move-object/from16 v7, p2

    const/4 v3, 0x0

    invoke-static {v0, v7, v3}, LH0/f;->a(ILT/l;I)Ljava/lang/String;

    move-result-object v3

    iget-object v6, v15, LRe/m$b$b;->b:Ls9/b;

    const v0, -0x72e38c4f

    invoke-interface {v7, v0}, LT/l;->U(I)V

    iget-object v0, v15, LRe/m$b$b;->c:LIi/N;

    invoke-interface {v7, v0}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v0

    iget-object v4, v15, LRe/m$b$b;->d:LRe/a;

    invoke-interface {v7, v4}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v0, v4

    iget-object v4, v15, LRe/m$b$b;->c:LIi/N;

    iget-object v5, v15, LRe/m$b$b;->d:LRe/a;

    invoke-interface/range {p2 .. p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v8

    if-nez v0, :cond_7

    sget-object v0, LT/l;->a:LT/l$a;

    invoke-virtual {v0}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v8, v0, :cond_8

    :cond_7
    new-instance v8, LRe/s;

    invoke-direct {v8, v4, v5}, LRe/s;-><init>(LIi/N;LRe/a;)V

    invoke-interface {v7, v8}, LT/l;->K(Ljava/lang/Object;)V

    :cond_8
    move-object v11, v8

    check-cast v11, Lmh/a;

    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    const/16 v17, 0x0

    const/16 v18, 0x3b18

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v8, 0x1

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const v16, 0xd80006

    move-object/from16 v7, v22

    move-object/from16 v15, p2

    invoke-static/range {v1 .. v18}, LF9/u;->c(Landroidx/compose/ui/e;Ls9/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ls9/b;LF9/r;ZLjava/lang/Boolean;Ljava/lang/String;Lmh/a;Lmh/a;FLmh/q;LT/l;III)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-static {}, LT/o;->P()V

    :cond_9
    return-void
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LA9/i;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, LRe/m$b$b;->f(LA9/i;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
