.class final LRe/m$b$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LRe/m$b$a;->b(LA9/i;LT/l;I)V
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

    iput-object p1, p0, LRe/m$b$a$a;->a:Ls9/b$b;

    iput-object p2, p0, LRe/m$b$a$a;->b:Ls9/b;

    iput-object p3, p0, LRe/m$b$a$a;->c:LIi/N;

    iput-object p4, p0, LRe/m$b$a$a;->d:LRe/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(LIi/N;LRe/a;)LYg/J;
    .locals 0

    invoke-static {p0, p1}, LRe/m$b$a$a;->c(LIi/N;LRe/a;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method private static final c(LIi/N;LRe/a;)LYg/J;
    .locals 6

    new-instance v3, LRe/m$b$a$a$a;

    const/4 v0, 0x0

    invoke-direct {v3, p1, v0}, LRe/m$b$a$a$a;-><init>(LRe/a;Ldh/e;)V

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
.method public final b(LT/l;I)V
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v15, p1

    move/from16 v1, p2

    and-int/lit8 v2, v1, 0x3

    const/4 v3, 0x2

    if-ne v2, v3, :cond_1

    invoke-interface/range {p1 .. p1}, LT/l;->v()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface/range {p1 .. p1}, LT/l;->C()V

    goto/16 :goto_1

    :cond_1
    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, -0x1

    const-string v3, "com.ui.wifiman.ui.settings.AppSettings.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AppSettingsUi.kt:124)"

    const v4, -0x2afd46cb

    invoke-static {v4, v1, v2, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    sget-object v1, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static {v1, v4, v2, v3}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    sget-object v2, LN9/b;->a:LN9/b;

    invoke-virtual {v2}, LN9/b;->a()Ls9/b;

    move-result-object v2

    iget-object v3, v0, LRe/m$b$a$a;->a:Ls9/b$b;

    invoke-virtual {v2, v3}, Ls9/b;->f(Ls9/b$b;)Ls9/b;

    move-result-object v2

    sget v3, Lm8/c;->U1:I

    const/4 v4, 0x0

    invoke-static {v3, v15, v4}, LH0/f;->a(ILT/l;I)Ljava/lang/String;

    move-result-object v3

    iget-object v6, v0, LRe/m$b$a$a;->b:Ls9/b;

    sget-object v7, LF9/r;->DEFAULT_WITH_BLUE_ICON:LF9/r;

    const v4, 0x1acb38f2

    invoke-interface {v15, v4}, LT/l;->U(I)V

    iget-object v4, v0, LRe/m$b$a$a;->c:LIi/N;

    invoke-interface {v15, v4}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v4

    iget-object v5, v0, LRe/m$b$a$a;->d:LRe/a;

    invoke-interface {v15, v5}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v4, v5

    iget-object v5, v0, LRe/m$b$a$a;->c:LIi/N;

    iget-object v8, v0, LRe/m$b$a$a;->d:LRe/a;

    invoke-interface/range {p1 .. p1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v9

    if-nez v4, :cond_3

    sget-object v4, LT/l;->a:LT/l$a;

    invoke-virtual {v4}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v4

    if-ne v9, v4, :cond_4

    :cond_3
    new-instance v9, LRe/o;

    invoke-direct {v9, v5, v8}, LRe/o;-><init>(LIi/N;LRe/a;)V

    invoke-interface {v15, v9}, LT/l;->K(Ljava/lang/Object;)V

    :cond_4
    move-object v11, v9

    check-cast v11, Lmh/a;

    invoke-interface/range {p1 .. p1}, LT/l;->J()V

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

    move-object/from16 v15, p1

    invoke-static/range {v1 .. v18}, LF9/u;->c(Landroidx/compose/ui/e;Ls9/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ls9/b;LF9/r;ZLjava/lang/Boolean;Ljava/lang/String;Lmh/a;Lmh/a;FLmh/q;LT/l;III)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-static {}, LT/o;->P()V

    :cond_5
    :goto_1
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LRe/m$b$a$a;->b(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
