.class final LT9/j$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LT9/j;->h(Lcom/ui/core/ui/sso/login/g;ZLjava/lang/String;Lmh/a;ZLT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/core/ui/sso/login/g;

.field final synthetic b:LIi/N;

.field final synthetic c:Landroidx/compose/ui/platform/n1;


# direct methods
.method constructor <init>(Lcom/ui/core/ui/sso/login/g;LIi/N;Landroidx/compose/ui/platform/n1;)V
    .locals 0

    iput-object p1, p0, LT9/j$b;->a:Lcom/ui/core/ui/sso/login/g;

    iput-object p2, p0, LT9/j$b;->b:LIi/N;

    iput-object p3, p0, LT9/j$b;->c:Landroidx/compose/ui/platform/n1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(LIi/N;Landroidx/compose/ui/platform/n1;Lcom/ui/core/ui/sso/login/g;Lmh/a;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, LT9/j$b;->c(LIi/N;Landroidx/compose/ui/platform/n1;Lcom/ui/core/ui/sso/login/g;Lmh/a;)V

    return-void
.end method

.method private static final c(LIi/N;Landroidx/compose/ui/platform/n1;Lcom/ui/core/ui/sso/login/g;Lmh/a;)V
    .locals 7

    const-string/jumbo v0, "it"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v4, LT9/j$b$a;

    const/4 p3, 0x0

    invoke-direct {v4, p2, p3}, LT9/j$b$a;-><init>(Lcom/ui/core/ui/sso/login/g;Ldh/e;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v1, p0

    invoke-static/range {v1 .. v6}, LIi/i;->d(LIi/N;Ldh/i;LIi/P;Lmh/p;ILjava/lang/Object;)LIi/y0;

    if-eqz p1, :cond_0

    invoke-interface {p1}, Landroidx/compose/ui/platform/n1;->c()V

    :cond_0
    return-void
.end method


# virtual methods
.method public final b(LA9/i;LT/l;I)V
    .locals 31

    move-object/from16 v0, p0

    move-object/from16 v15, p2

    const-string v1, "$this$UiColumnWithDividers"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string/jumbo v2, "com.ui.core.ui.sso.login.UiLoginLayout.<anonymous>.<anonymous>.<anonymous> (UiLoginLayout.kt:134)"

    const v3, 0x54567b02

    move/from16 v4, p3

    invoke-static {v3, v4, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    sget-object v12, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const-string/jumbo v1, "sign_in_email"

    invoke-static {v12, v1}, LM9/i;->g(Landroidx/compose/ui/e;Ljava/lang/String;)Landroidx/compose/ui/e;

    move-result-object v1

    sget v2, LP9/b;->q:I

    const/4 v13, 0x0

    invoke-static {v2, v15, v13}, LH0/f;->a(ILT/l;I)Ljava/lang/String;

    move-result-object v2

    iget-object v3, v0, LT9/j$b;->a:Lcom/ui/core/ui/sso/login/g;

    invoke-virtual {v3}, Lcom/ui/core/ui/sso/login/g;->l0()LH/l;

    move-result-object v4

    sget-object v3, Lg0/j;->Username:Lg0/j;

    filled-new-array {v3}, [Lg0/j;

    move-result-object v3

    invoke-static {v3}, LCi/a;->e([Ljava/lang/Object;)LCi/h;

    move-result-object v14

    new-instance v18, LF/D;

    move-object/from16 v17, v18

    sget-object v28, LR0/y;->b:LR0/y$a;

    invoke-virtual/range {v28 .. v28}, LR0/y$a;->c()I

    move-result v21

    sget-object v29, LR0/r;->b:LR0/r$a;

    invoke-virtual/range {v29 .. v29}, LR0/r$a;->d()I

    move-result v22

    const/16 v26, 0x73

    const/16 v27, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    invoke-direct/range {v18 .. v27}, LF/D;-><init>(ILjava/lang/Boolean;IILR0/K;Ljava/lang/Boolean;LS0/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const v22, 0x30180

    const v23, 0x36ff4

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const-wide/16 v18, 0x0

    move-object/from16 v30, v12

    move-wide/from16 v12, v18

    const/16 v16, 0x0

    move/from16 v15, v16

    const/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v21, 0x0

    move-object/from16 v20, p2

    invoke-static/range {v1 .. v23}, LF9/c0;->c(Landroidx/compose/ui/e;Ljava/lang/String;Ljava/lang/String;LH/l;LH/b;Lmh/a;ZLjava/lang/String;ILjava/lang/String;Ljava/lang/String;JLCi/e;ZLm0/l0;LF/D;LH/d;Landroidx/compose/ui/focus/o;LT/l;III)V

    const-string/jumbo v1, "sign_in_password"

    move-object/from16 v2, v30

    invoke-static {v2, v1}, LM9/i;->g(Landroidx/compose/ui/e;Ljava/lang/String;)Landroidx/compose/ui/e;

    move-result-object v1

    sget v2, LP9/b;->o:I

    move-object/from16 v10, p2

    const/4 v3, 0x0

    invoke-static {v2, v10, v3}, LH0/f;->a(ILT/l;I)Ljava/lang/String;

    move-result-object v2

    iget-object v3, v0, LT9/j$b;->a:Lcom/ui/core/ui/sso/login/g;

    invoke-virtual {v3}, Lcom/ui/core/ui/sso/login/g;->k0()LH/l;

    move-result-object v4

    sget-object v3, Lg0/j;->Password:Lg0/j;

    filled-new-array {v3}, [Lg0/j;

    move-result-object v3

    invoke-static {v3}, LCi/a;->e([Ljava/lang/Object;)LCi/h;

    move-result-object v17

    const v3, -0x686592d5

    invoke-interface {v10, v3}, LT/l;->U(I)V

    iget-object v3, v0, LT9/j$b;->b:LIi/N;

    invoke-interface {v10, v3}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v3

    iget-object v5, v0, LT9/j$b;->a:Lcom/ui/core/ui/sso/login/g;

    invoke-interface {v10, v5}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v3, v5

    iget-object v5, v0, LT9/j$b;->c:Landroidx/compose/ui/platform/n1;

    invoke-interface {v10, v5}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v3, v5

    iget-object v5, v0, LT9/j$b;->b:LIi/N;

    iget-object v6, v0, LT9/j$b;->c:Landroidx/compose/ui/platform/n1;

    iget-object v7, v0, LT9/j$b;->a:Lcom/ui/core/ui/sso/login/g;

    invoke-interface/range {p2 .. p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v8

    if-nez v3, :cond_1

    sget-object v3, LT/l;->a:LT/l$a;

    invoke-virtual {v3}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v3

    if-ne v8, v3, :cond_2

    :cond_1
    new-instance v8, LT9/k;

    invoke-direct {v8, v5, v6, v7}, LT9/k;-><init>(LIi/N;Landroidx/compose/ui/platform/n1;Lcom/ui/core/ui/sso/login/g;)V

    invoke-interface {v10, v8}, LT/l;->K(Ljava/lang/Object;)V

    :cond_2
    move-object v15, v8

    check-cast v15, LH/d;

    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    new-instance v18, LF/D;

    move-object/from16 v14, v18

    invoke-virtual/range {v28 .. v28}, LR0/y$a;->f()I

    move-result v21

    invoke-virtual/range {v29 .. v29}, LR0/r$a;->b()I

    move-result v22

    const/16 v26, 0x73

    const/16 v27, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    invoke-direct/range {v18 .. v27}, LF/D;-><init>(ILjava/lang/Boolean;IILR0/K;Ljava/lang/Boolean;LS0/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v19, 0xc00

    const v20, 0x9df4

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/16 v16, 0x0

    const/high16 v18, 0x30000000

    move-object/from16 v10, v17

    move-object/from16 v17, p2

    invoke-static/range {v1 .. v20}, LF9/X;->e(Landroidx/compose/ui/e;Ljava/lang/String;Ljava/lang/String;LH/l;Lmh/a;ZLjava/lang/String;ILjava/lang/String;LCi/e;ZLm0/l0;ILF/D;LH/d;Landroidx/compose/ui/focus/o;LT/l;III)V

    const v1, -0x68655879

    move-object/from16 v2, p2

    invoke-interface {v2, v1}, LT/l;->U(I)V

    iget-object v1, v0, LT9/j$b;->a:Lcom/ui/core/ui/sso/login/g;

    invoke-interface {v2, v1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v1

    iget-object v3, v0, LT9/j$b;->a:Lcom/ui/core/ui/sso/login/g;

    invoke-interface/range {p2 .. p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v4

    if-nez v1, :cond_3

    sget-object v1, LT/l;->a:LT/l$a;

    invoke-virtual {v1}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v4, v1, :cond_4

    :cond_3
    new-instance v4, LT9/j$b$b;

    const/4 v1, 0x0

    invoke-direct {v4, v3, v1}, LT9/j$b$b;-><init>(Lcom/ui/core/ui/sso/login/g;Ldh/e;)V

    invoke-interface {v2, v4}, LT/l;->K(Ljava/lang/Object;)V

    :cond_4
    check-cast v4, Lmh/p;

    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    const/4 v1, 0x6

    const-string/jumbo v3, "credentials"

    invoke-static {v3, v4, v2, v1}, LT/O;->f(Ljava/lang/Object;Lmh/p;LT/l;I)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-static {}, LT/o;->P()V

    :cond_5
    return-void
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LA9/i;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, LT9/j$b;->b(LA9/i;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
