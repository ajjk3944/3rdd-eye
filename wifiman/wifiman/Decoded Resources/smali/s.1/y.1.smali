.class final Ls/y;
.super Landroidx/compose/ui/e$c;
.source "SourceFile"


# instance fields
.field private n:Ly/m;

.field private o:Ly/d;

.field private final p:Z


# direct methods
.method public constructor <init>(Ly/m;)V
    .locals 0

    invoke-direct {p0}, Landroidx/compose/ui/e$c;-><init>()V

    iput-object p1, p0, Ls/y;->n:Ly/m;

    return-void
.end method

.method private final D2()V
    .locals 3

    iget-object v0, p0, Ls/y;->n:Ly/m;

    if-eqz v0, :cond_0

    iget-object v1, p0, Ls/y;->o:Ly/d;

    if-eqz v1, :cond_0

    new-instance v2, Ly/e;

    invoke-direct {v2, v1}, Ly/e;-><init>(Ly/d;)V

    invoke-interface {v0, v2}, Ly/m;->c(Ly/j;)Z

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Ls/y;->o:Ly/d;

    return-void
.end method

.method private final E2(Ly/m;Ly/j;)V
    .locals 8

    invoke-virtual {p0}, Landroidx/compose/ui/e$c;->k2()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Landroidx/compose/ui/e$c;->d2()LIi/N;

    move-result-object v0

    invoke-interface {v0}, LIi/N;->getCoroutineContext()Ldh/i;

    move-result-object v0

    sget-object v1, LIi/y0;->O:LIi/y0$b;

    invoke-interface {v0, v1}, Ldh/i;->get(Ldh/i$c;)Ldh/i$b;

    move-result-object v0

    check-cast v0, LIi/y0;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    new-instance v2, Ls/y$b;

    invoke-direct {v2, p1, p2}, Ls/y$b;-><init>(Ly/m;Ly/j;)V

    invoke-interface {v0, v2}, LIi/y0;->invokeOnCompletion(Lmh/l;)LIi/e0;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    invoke-virtual {p0}, Landroidx/compose/ui/e$c;->d2()LIi/N;

    move-result-object v2

    new-instance v5, Ls/y$a;

    invoke-direct {v5, p1, p2, v0, v1}, Ls/y$a;-><init>(Ly/m;Ly/j;LIi/e0;Ldh/e;)V

    const/4 v6, 0x3

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v2 .. v7}, LIi/i;->d(LIi/N;Ldh/i;LIi/P;Lmh/p;ILjava/lang/Object;)LIi/y0;

    goto :goto_1

    :cond_1
    invoke-interface {p1, p2}, Ly/m;->c(Ly/j;)Z

    :goto_1
    return-void
.end method


# virtual methods
.method public final F2(Z)V
    .locals 3

    iget-object v0, p0, Ls/y;->n:Ly/m;

    if-eqz v0, :cond_2

    const/4 v1, 0x0

    if-eqz p1, :cond_1

    iget-object p1, p0, Ls/y;->o:Ly/d;

    if-eqz p1, :cond_0

    new-instance v2, Ly/e;

    invoke-direct {v2, p1}, Ly/e;-><init>(Ly/d;)V

    invoke-direct {p0, v0, v2}, Ls/y;->E2(Ly/m;Ly/j;)V

    iput-object v1, p0, Ls/y;->o:Ly/d;

    :cond_0
    new-instance p1, Ly/d;

    invoke-direct {p1}, Ly/d;-><init>()V

    invoke-direct {p0, v0, p1}, Ls/y;->E2(Ly/m;Ly/j;)V

    iput-object p1, p0, Ls/y;->o:Ly/d;

    goto :goto_0

    :cond_1
    iget-object p1, p0, Ls/y;->o:Ly/d;

    if-eqz p1, :cond_2

    new-instance v2, Ly/e;

    invoke-direct {v2, p1}, Ly/e;-><init>(Ly/d;)V

    invoke-direct {p0, v0, v2}, Ls/y;->E2(Ly/m;Ly/j;)V

    iput-object v1, p0, Ls/y;->o:Ly/d;

    :cond_2
    :goto_0
    return-void
.end method

.method public final G2(Ly/m;)V
    .locals 1

    iget-object v0, p0, Ls/y;->n:Ly/m;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0}, Ls/y;->D2()V

    iput-object p1, p0, Ls/y;->n:Ly/m;

    :cond_0
    return-void
.end method

.method public i2()Z
    .locals 1

    iget-boolean v0, p0, Ls/y;->p:Z

    return v0
.end method
