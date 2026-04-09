.class final Landroidx/compose/foundation/i;
.super Landroidx/compose/ui/e$c;
.source "SourceFile"

# interfaces
.implements LE0/s0;


# instance fields
.field private n:Ly/m;

.field private o:Ly/g;


# direct methods
.method public constructor <init>(Ly/m;)V
    .locals 0

    invoke-direct {p0}, Landroidx/compose/ui/e$c;-><init>()V

    iput-object p1, p0, Landroidx/compose/foundation/i;->n:Ly/m;

    return-void
.end method

.method public static final synthetic D2(Landroidx/compose/foundation/i;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Landroidx/compose/foundation/i;->F2(Ldh/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic E2(Landroidx/compose/foundation/i;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Landroidx/compose/foundation/i;->G2(Ldh/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final F2(Ldh/e;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p1, Landroidx/compose/foundation/i$a;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Landroidx/compose/foundation/i$a;

    iget v1, v0, Landroidx/compose/foundation/i$a;->e:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Landroidx/compose/foundation/i$a;->e:I

    goto :goto_0

    :cond_0
    new-instance v0, Landroidx/compose/foundation/i$a;

    invoke-direct {v0, p0, p1}, Landroidx/compose/foundation/i$a;-><init>(Landroidx/compose/foundation/i;Ldh/e;)V

    :goto_0
    iget-object p1, v0, Landroidx/compose/foundation/i$a;->c:Ljava/lang/Object;

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Landroidx/compose/foundation/i$a;->e:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object v1, v0, Landroidx/compose/foundation/i$a;->b:Ljava/lang/Object;

    check-cast v1, Ly/g;

    iget-object v0, v0, Landroidx/compose/foundation/i$a;->a:Ljava/lang/Object;

    check-cast v0, Landroidx/compose/foundation/i;

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Landroidx/compose/foundation/i;->o:Ly/g;

    if-nez p1, :cond_4

    new-instance p1, Ly/g;

    invoke-direct {p1}, Ly/g;-><init>()V

    iget-object v2, p0, Landroidx/compose/foundation/i;->n:Ly/m;

    iput-object p0, v0, Landroidx/compose/foundation/i$a;->a:Ljava/lang/Object;

    iput-object p1, v0, Landroidx/compose/foundation/i$a;->b:Ljava/lang/Object;

    iput v3, v0, Landroidx/compose/foundation/i$a;->e:I

    invoke-interface {v2, p1, v0}, Ly/m;->a(Ly/j;Ldh/e;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_3

    return-object v1

    :cond_3
    move-object v0, p0

    move-object v1, p1

    :goto_1
    iput-object v1, v0, Landroidx/compose/foundation/i;->o:Ly/g;

    :cond_4
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method private final G2(Ldh/e;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p1, Landroidx/compose/foundation/i$b;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Landroidx/compose/foundation/i$b;

    iget v1, v0, Landroidx/compose/foundation/i$b;->d:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Landroidx/compose/foundation/i$b;->d:I

    goto :goto_0

    :cond_0
    new-instance v0, Landroidx/compose/foundation/i$b;

    invoke-direct {v0, p0, p1}, Landroidx/compose/foundation/i$b;-><init>(Landroidx/compose/foundation/i;Ldh/e;)V

    :goto_0
    iget-object p1, v0, Landroidx/compose/foundation/i$b;->b:Ljava/lang/Object;

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Landroidx/compose/foundation/i$b;->d:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object v0, v0, Landroidx/compose/foundation/i$b;->a:Ljava/lang/Object;

    check-cast v0, Landroidx/compose/foundation/i;

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Landroidx/compose/foundation/i;->o:Ly/g;

    if-eqz p1, :cond_4

    new-instance v2, Ly/h;

    invoke-direct {v2, p1}, Ly/h;-><init>(Ly/g;)V

    iget-object p1, p0, Landroidx/compose/foundation/i;->n:Ly/m;

    iput-object p0, v0, Landroidx/compose/foundation/i$b;->a:Ljava/lang/Object;

    iput v3, v0, Landroidx/compose/foundation/i$b;->d:I

    invoke-interface {p1, v2, v0}, Ly/m;->a(Ly/j;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    move-object v0, p0

    :goto_1
    const/4 p1, 0x0

    iput-object p1, v0, Landroidx/compose/foundation/i;->o:Ly/g;

    :cond_4
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method private final H2()V
    .locals 2

    iget-object v0, p0, Landroidx/compose/foundation/i;->o:Ly/g;

    if-eqz v0, :cond_0

    new-instance v1, Ly/h;

    invoke-direct {v1, v0}, Ly/h;-><init>(Ly/g;)V

    iget-object v0, p0, Landroidx/compose/foundation/i;->n:Ly/m;

    invoke-interface {v0, v1}, Ly/m;->c(Ly/j;)Z

    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/compose/foundation/i;->o:Ly/g;

    :cond_0
    return-void
.end method


# virtual methods
.method public C0()V
    .locals 0

    invoke-direct {p0}, Landroidx/compose/foundation/i;->H2()V

    return-void
.end method

.method public final I2(Ly/m;)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/i;->n:Ly/m;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0}, Landroidx/compose/foundation/i;->H2()V

    iput-object p1, p0, Landroidx/compose/foundation/i;->n:Ly/m;

    :cond_0
    return-void
.end method

.method public o2()V
    .locals 0

    invoke-direct {p0}, Landroidx/compose/foundation/i;->H2()V

    return-void
.end method

.method public s0(Ly0/n;Ly0/p;J)V
    .locals 6

    sget-object p3, Ly0/p;->Main:Ly0/p;

    if-ne p2, p3, :cond_1

    invoke-virtual {p1}, Ly0/n;->f()I

    move-result p1

    sget-object p2, Ly0/q;->a:Ly0/q$a;

    invoke-virtual {p2}, Ly0/q$a;->a()I

    move-result p3

    invoke-static {p1, p3}, Ly0/q;->i(II)Z

    move-result p3

    const/4 p4, 0x0

    if-eqz p3, :cond_0

    invoke-virtual {p0}, Landroidx/compose/ui/e$c;->d2()LIi/N;

    move-result-object v0

    new-instance v3, Landroidx/compose/foundation/i$c;

    invoke-direct {v3, p0, p4}, Landroidx/compose/foundation/i$c;-><init>(Landroidx/compose/foundation/i;Ldh/e;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, LIi/i;->d(LIi/N;Ldh/i;LIi/P;Lmh/p;ILjava/lang/Object;)LIi/y0;

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Ly0/q$a;->b()I

    move-result p2

    invoke-static {p1, p2}, Ly0/q;->i(II)Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Landroidx/compose/ui/e$c;->d2()LIi/N;

    move-result-object v0

    new-instance v3, Landroidx/compose/foundation/i$d;

    invoke-direct {v3, p0, p4}, Landroidx/compose/foundation/i$d;-><init>(Landroidx/compose/foundation/i;Ldh/e;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, LIi/i;->d(LIi/N;Ldh/i;LIi/P;Lmh/p;ILjava/lang/Object;)LIi/y0;

    :cond_1
    :goto_0
    return-void
.end method
