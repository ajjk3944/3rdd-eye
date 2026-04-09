.class final LX9/o$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LX9/o;->b(LX9/p;Lu9/d;ZLCi/e;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Z

.field final synthetic b:LX9/p;

.field final synthetic c:LIi/N;


# direct methods
.method constructor <init>(ZLX9/p;LIi/N;)V
    .locals 0

    iput-boolean p1, p0, LX9/o$a;->a:Z

    iput-object p2, p0, LX9/o$a;->b:LX9/p;

    iput-object p3, p0, LX9/o$a;->c:LIi/N;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(LIi/N;LX9/p;)LYg/J;
    .locals 0

    invoke-static {p0, p1}, LX9/o$a;->c(LIi/N;LX9/p;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method private static final c(LIi/N;LX9/p;)LYg/J;
    .locals 6

    new-instance v3, LX9/o$a$a;

    const/4 v0, 0x0

    invoke-direct {v3, p1, v0}, LX9/o$a$a;-><init>(LX9/p;Ldh/e;)V

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

    goto/16 :goto_4

    :cond_1
    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, -0x1

    const-string/jumbo v3, "com.ui.core.ui.sso.mfa.auth.code.UiMFAAuthCodeLayout.<anonymous> (UiMFAAuthCodeLayout.kt:88)"

    const v4, 0x665ba0eb

    invoke-static {v4, v1, v2, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    sget-object v3, LL9/d$a;->b:LL9/d$a;

    iget-boolean v1, v0, LX9/o$a;->a:Z

    if-eqz v1, :cond_3

    sget-object v1, LL9/w;->a:LL9/w;

    invoke-virtual {v1}, LL9/w;->c()F

    move-result v1

    :goto_1
    move v12, v1

    goto :goto_2

    :cond_3
    sget-object v1, LL9/w;->a:LL9/w;

    invoke-virtual {v1}, LL9/w;->d()F

    move-result v1

    goto :goto_1

    :goto_2
    iget-object v1, v0, LX9/o$a;->b:LX9/p;

    invoke-interface {v1}, LX9/p;->c()LLi/N;

    move-result-object v1

    const/4 v2, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static {v1, v4, v15, v5, v2}, LT/o1;->b(LLi/N;Ldh/i;LT/l;II)LT/z1;

    move-result-object v1

    invoke-interface {v1}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ls9/d;

    const v2, 0x186a0f87

    invoke-interface {v15, v2}, LT/l;->U(I)V

    if-nez v1, :cond_4

    move-object v2, v4

    goto :goto_3

    :cond_4
    invoke-static {v1, v15, v5}, Lsa/a;->b(Ls9/d;LT/l;I)Ljava/lang/String;

    move-result-object v1

    move-object v2, v1

    :goto_3
    invoke-interface/range {p1 .. p1}, LT/l;->J()V

    const v1, 0x1869f627

    invoke-interface {v15, v1}, LT/l;->U(I)V

    iget-object v1, v0, LX9/o$a;->c:LIi/N;

    invoke-interface {v15, v1}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v1

    iget-object v4, v0, LX9/o$a;->b:LX9/p;

    invoke-interface {v15, v4}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v1, v4

    iget-object v4, v0, LX9/o$a;->c:LIi/N;

    iget-object v5, v0, LX9/o$a;->b:LX9/p;

    invoke-interface/range {p1 .. p1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v6

    if-nez v1, :cond_5

    sget-object v1, LT/l;->a:LT/l$a;

    invoke-virtual {v1}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v6, v1, :cond_6

    :cond_5
    new-instance v6, LX9/n;

    invoke-direct {v6, v4, v5}, LX9/n;-><init>(LIi/N;LX9/p;)V

    invoke-interface {v15, v6}, LT/l;->K(Ljava/lang/Object;)V

    :cond_6
    move-object v4, v6

    check-cast v4, Lmh/a;

    invoke-interface/range {p1 .. p1}, LT/l;->J()V

    sget v1, LL9/d$a;->c:I

    shl-int/lit8 v16, v1, 0x6

    const/16 v17, 0x0

    const/16 v18, 0x6f1

    const/4 v1, 0x0

    const/4 v5, 0x0

    const-wide/16 v6, 0x0

    const-wide/16 v8, 0x0

    const-wide/16 v10, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-object/from16 v15, p1

    invoke-static/range {v1 .. v18}, LL9/E;->i(Landroidx/compose/ui/e;Ljava/lang/String;LL9/d;Lmh/a;Lmh/q;JJJFLz/N;FLT/l;III)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-static {}, LT/o;->P()V

    :cond_7
    :goto_4
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LX9/o$a;->b(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
