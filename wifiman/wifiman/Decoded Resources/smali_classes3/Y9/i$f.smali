.class final LY9/i$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LY9/i;->r(LY9/k;ZLT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LIi/N;

.field final synthetic b:LY9/k;

.field final synthetic c:Z


# direct methods
.method constructor <init>(LIi/N;LY9/k;Z)V
    .locals 0

    iput-object p1, p0, LY9/i$f;->a:LIi/N;

    iput-object p2, p0, LY9/i$f;->b:LY9/k;

    iput-boolean p3, p0, LY9/i$f;->c:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(LIi/N;LY9/k;)LYg/J;
    .locals 0

    invoke-static {p0, p1}, LY9/i$f;->c(LIi/N;LY9/k;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method private static final c(LIi/N;LY9/k;)LYg/J;
    .locals 6

    new-instance v3, LY9/i$f$a;

    const/4 v0, 0x0

    invoke-direct {v3, p1, v0}, LY9/i$f$a;-><init>(LY9/k;Ldh/e;)V

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

    goto/16 :goto_3

    :cond_1
    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, -0x1

    const-string/jumbo v3, "com.ui.core.ui.sso.mfa.auth.push.PushAuthLayout.<anonymous> (PushAuthLayout.kt:54)"

    const v4, -0x76045165

    invoke-static {v4, v1, v2, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    sget-object v3, LL9/d$a;->b:LL9/d$a;

    const v1, -0x1bbe403d

    invoke-interface {v15, v1}, LT/l;->U(I)V

    iget-object v1, v0, LY9/i$f;->a:LIi/N;

    invoke-interface {v15, v1}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v1

    iget-object v2, v0, LY9/i$f;->b:LY9/k;

    invoke-interface {v15, v2}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v1, v2

    iget-object v2, v0, LY9/i$f;->a:LIi/N;

    iget-object v4, v0, LY9/i$f;->b:LY9/k;

    invoke-interface/range {p1 .. p1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v5

    if-nez v1, :cond_3

    sget-object v1, LT/l;->a:LT/l$a;

    invoke-virtual {v1}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v5, v1, :cond_4

    :cond_3
    new-instance v5, LY9/j;

    invoke-direct {v5, v2, v4}, LY9/j;-><init>(LIi/N;LY9/k;)V

    invoke-interface {v15, v5}, LT/l;->K(Ljava/lang/Object;)V

    :cond_4
    move-object v4, v5

    check-cast v4, Lmh/a;

    invoke-interface/range {p1 .. p1}, LT/l;->J()V

    iget-boolean v1, v0, LY9/i$f;->c:Z

    if-eqz v1, :cond_5

    sget-object v1, LL9/w;->a:LL9/w;

    invoke-virtual {v1}, LL9/w;->c()F

    move-result v1

    :goto_1
    move v12, v1

    goto :goto_2

    :cond_5
    sget-object v1, LL9/w;->a:LL9/w;

    invoke-virtual {v1}, LL9/w;->d()F

    move-result v1

    goto :goto_1

    :goto_2
    sget v1, LL9/d$a;->c:I

    shl-int/lit8 v16, v1, 0x6

    const/16 v17, 0x0

    const/16 v18, 0x6f3

    const/4 v1, 0x0

    const/4 v2, 0x0

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

    if-eqz v1, :cond_6

    invoke-static {}, LT/o;->P()V

    :cond_6
    :goto_3
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LY9/i$f;->b(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
