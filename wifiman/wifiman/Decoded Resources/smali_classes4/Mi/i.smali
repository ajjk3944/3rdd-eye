.class public final LMi/i;
.super LMi/d;
.source "SourceFile"


# instance fields
.field private final d:Ljava/lang/Iterable;


# direct methods
.method public constructor <init>(Ljava/lang/Iterable;Ldh/i;ILKi/a;)V
    .locals 0

    .line 4
    invoke-direct {p0, p2, p3, p4}, LMi/d;-><init>(Ldh/i;ILKi/a;)V

    .line 5
    iput-object p1, p0, LMi/i;->d:Ljava/lang/Iterable;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Iterable;Ldh/i;ILKi/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_0

    .line 1
    sget-object p2, Ldh/j;->a:Ldh/j;

    :cond_0
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_1

    const/4 p3, -0x2

    :cond_1
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_2

    .line 2
    sget-object p4, LKi/a;->SUSPEND:LKi/a;

    .line 3
    :cond_2
    invoke-direct {p0, p1, p2, p3, p4}, LMi/i;-><init>(Ljava/lang/Iterable;Ldh/i;ILKi/a;)V

    return-void
.end method


# virtual methods
.method protected g(LKi/t;Ldh/e;)Ljava/lang/Object;
    .locals 8

    new-instance p2, LMi/x;

    invoke-direct {p2, p1}, LMi/x;-><init>(LKi/w;)V

    iget-object v0, p0, LMi/i;->d:Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LLi/g;

    new-instance v5, LMi/i$a;

    const/4 v2, 0x0

    invoke-direct {v5, v1, p2, v2}, LMi/i$a;-><init>(LLi/g;LMi/x;Ldh/e;)V

    const/4 v6, 0x3

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v2, p1

    invoke-static/range {v2 .. v7}, LIi/i;->d(LIi/N;Ldh/i;LIi/P;Lmh/p;ILjava/lang/Object;)LIi/y0;

    goto :goto_0

    :cond_0
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method protected i(Ldh/i;ILKi/a;)LMi/d;
    .locals 2

    new-instance v0, LMi/i;

    iget-object v1, p0, LMi/i;->d:Ljava/lang/Iterable;

    invoke-direct {v0, v1, p1, p2, p3}, LMi/i;-><init>(Ljava/lang/Iterable;Ldh/i;ILKi/a;)V

    return-object v0
.end method

.method public o(LIi/N;)LKi/v;
    .locals 3

    iget-object v0, p0, LMi/d;->a:Ldh/i;

    iget v1, p0, LMi/d;->b:I

    invoke-virtual {p0}, LMi/d;->m()Lmh/p;

    move-result-object v2

    invoke-static {p1, v0, v1, v2}, LKi/r;->c(LIi/N;Ldh/i;ILmh/p;)LKi/v;

    move-result-object p1

    return-object p1
.end method
