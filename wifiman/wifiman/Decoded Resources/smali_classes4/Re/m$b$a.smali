.class final LRe/m$b$a;
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
.field final synthetic a:Lof/a$c;

.field final synthetic b:Ls9/b$b;

.field final synthetic c:Ls9/b;

.field final synthetic d:LIi/N;

.field final synthetic e:LRe/a;


# direct methods
.method constructor <init>(Lof/a$c;Ls9/b$b;Ls9/b;LIi/N;LRe/a;)V
    .locals 0

    iput-object p1, p0, LRe/m$b$a;->a:Lof/a$c;

    iput-object p2, p0, LRe/m$b$a;->b:Ls9/b$b;

    iput-object p3, p0, LRe/m$b$a;->c:Ls9/b;

    iput-object p4, p0, LRe/m$b$a;->d:LIi/N;

    iput-object p5, p0, LRe/m$b$a;->e:LRe/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(LIi/N;LRe/a;)LYg/J;
    .locals 0

    invoke-static {p0, p1}, LRe/m$b$a;->c(LIi/N;LRe/a;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method private static final c(LIi/N;LRe/a;)LYg/J;
    .locals 6

    new-instance v3, LRe/m$b$a$b;

    const/4 v0, 0x0

    invoke-direct {v3, p1, v0}, LRe/m$b$a$b;-><init>(LRe/a;Ldh/e;)V

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
.method public final b(LA9/i;LT/l;I)V
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v15, p2

    move/from16 v1, p3

    const-string v2, "$this$UiSettingsCard"

    move-object/from16 v3, p1

    invoke-static {v3, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, -0x1

    const-string v4, "com.ui.wifiman.ui.settings.AppSettings.<anonymous>.<anonymous>.<anonymous> (AppSettingsUi.kt:120)"

    const v5, 0x6c414891

    invoke-static {v5, v1, v2, v4}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    sget-object v2, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/4 v4, 0x0

    const/4 v5, 0x1

    const/4 v6, 0x0

    invoke-static {v2, v4, v5, v6}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v2

    iget-object v4, v0, LRe/m$b$a;->a:Lof/a$c;

    invoke-virtual {v4}, Lof/a$c;->n0()LLi/N;

    move-result-object v4

    const/4 v7, 0x0

    invoke-static {v4, v6, v15, v7, v5}, LT/o1;->b(LLi/N;Ldh/i;LT/l;II)LT/z1;

    move-result-object v4

    invoke-interface {v4}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v4

    sget-object v6, Lof/a$a;->LOGGED_IN:Lof/a$a;

    if-ne v4, v6, :cond_1

    move v4, v5

    goto :goto_0

    :cond_1
    move v4, v7

    :goto_0
    new-instance v6, LRe/m$b$a$a;

    iget-object v8, v0, LRe/m$b$a;->b:Ls9/b$b;

    iget-object v9, v0, LRe/m$b$a;->c:Ls9/b;

    iget-object v10, v0, LRe/m$b$a;->d:LIi/N;

    iget-object v11, v0, LRe/m$b$a;->e:LRe/a;

    invoke-direct {v6, v8, v9, v10, v11}, LRe/m$b$a$a;-><init>(Ls9/b$b;Ls9/b;LIi/N;LRe/a;)V

    const/16 v8, 0x36

    const v9, -0x2afd46cb

    invoke-static {v9, v5, v6, v15, v8}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v5

    shl-int/lit8 v1, v1, 0x9

    and-int/lit16 v1, v1, 0x1c00

    or-int/lit16 v6, v1, 0x186

    move-object/from16 v1, p1

    move v3, v4

    move-object v4, v5

    move-object/from16 v5, p2

    invoke-interface/range {v1 .. v6}, LA9/i;->a(Landroidx/compose/ui/e;ZLmh/p;LT/l;I)V

    sget-object v1, LN9/b;->a:LN9/b;

    invoke-virtual {v1}, LN9/b;->y()Ls9/b;

    move-result-object v1

    iget-object v2, v0, LRe/m$b$a;->b:Ls9/b$b;

    invoke-virtual {v1, v2}, Ls9/b;->f(Ls9/b$b;)Ls9/b;

    move-result-object v2

    sget v1, Lm8/c;->w:I

    invoke-static {v1, v15, v7}, LH0/f;->a(ILT/l;I)Ljava/lang/String;

    move-result-object v3

    sget-object v7, LF9/r;->DEFAULT_WITH_BLUE_ICON:LF9/r;

    iget-object v6, v0, LRe/m$b$a;->c:Ls9/b;

    const v1, -0x72e4c3cf

    invoke-interface {v15, v1}, LT/l;->U(I)V

    iget-object v1, v0, LRe/m$b$a;->d:LIi/N;

    invoke-interface {v15, v1}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v1

    iget-object v4, v0, LRe/m$b$a;->e:LRe/a;

    invoke-interface {v15, v4}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v1, v4

    iget-object v4, v0, LRe/m$b$a;->d:LIi/N;

    iget-object v5, v0, LRe/m$b$a;->e:LRe/a;

    invoke-interface/range {p2 .. p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v8

    if-nez v1, :cond_2

    sget-object v1, LT/l;->a:LT/l$a;

    invoke-virtual {v1}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v8, v1, :cond_3

    :cond_2
    new-instance v8, LRe/n;

    invoke-direct {v8, v4, v5}, LRe/n;-><init>(LIi/N;LRe/a;)V

    invoke-interface {v15, v8}, LT/l;->K(Ljava/lang/Object;)V

    :cond_3
    move-object v11, v8

    check-cast v11, Lmh/a;

    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    const/16 v17, 0x0

    const/16 v18, 0x3b19

    const/4 v1, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v8, 0x1

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/high16 v16, 0xd80000

    move-object/from16 v15, p2

    invoke-static/range {v1 .. v18}, LF9/u;->c(Landroidx/compose/ui/e;Ls9/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ls9/b;LF9/r;ZLjava/lang/Boolean;Ljava/lang/String;Lmh/a;Lmh/a;FLmh/q;LT/l;III)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-static {}, LT/o;->P()V

    :cond_4
    return-void
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LA9/i;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, LRe/m$b$a;->b(LA9/i;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
