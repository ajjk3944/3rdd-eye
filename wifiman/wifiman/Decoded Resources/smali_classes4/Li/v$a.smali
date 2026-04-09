.class final LLi/v$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LLi/v;->d(LIi/N;Ldh/i;LLi/g;LLi/y;LLi/J;Ljava/lang/Object;)LIi/y0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field final synthetic b:LLi/J;

.field final synthetic c:LLi/g;

.field final synthetic d:LLi/y;

.field final synthetic e:Ljava/lang/Object;


# direct methods
.method constructor <init>(LLi/J;LLi/g;LLi/y;Ljava/lang/Object;Ldh/e;)V
    .locals 0

    iput-object p1, p0, LLi/v$a;->b:LLi/J;

    iput-object p2, p0, LLi/v$a;->c:LLi/g;

    iput-object p3, p0, LLi/v$a;->d:LLi/y;

    iput-object p4, p0, LLi/v$a;->e:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 6

    new-instance p1, LLi/v$a;

    iget-object v1, p0, LLi/v$a;->b:LLi/J;

    iget-object v2, p0, LLi/v$a;->c:LLi/g;

    iget-object v3, p0, LLi/v$a;->d:LLi/y;

    iget-object v4, p0, LLi/v$a;->e:Ljava/lang/Object;

    move-object v0, p1

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, LLi/v$a;-><init>(LLi/J;LLi/g;LLi/y;Ljava/lang/Object;Ldh/e;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIi/N;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, LLi/v$a;->n(LIi/N;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LLi/v$a;->a:I

    const/4 v2, 0x4

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v1, :cond_3

    if-eq v1, v5, :cond_2

    if-eq v1, v4, :cond_1

    if-eq v1, v3, :cond_2

    if-ne v1, v2, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    :goto_0
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LLi/v$a;->b:LLi/J;

    sget-object v1, LLi/J;->a:LLi/J$a;

    invoke-virtual {v1}, LLi/J$a;->c()LLi/J;

    move-result-object v6

    if-ne p1, v6, :cond_4

    iget-object p1, p0, LLi/v$a;->c:LLi/g;

    iget-object v1, p0, LLi/v$a;->d:LLi/y;

    iput v5, p0, LLi/v$a;->a:I

    invoke-interface {p1, v1, p0}, LLi/g;->b(LLi/h;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_7

    return-object v0

    :cond_4
    iget-object p1, p0, LLi/v$a;->b:LLi/J;

    invoke-virtual {v1}, LLi/J$a;->d()LLi/J;

    move-result-object v1

    const/4 v5, 0x0

    if-ne p1, v1, :cond_6

    iget-object p1, p0, LLi/v$a;->d:LLi/y;

    invoke-interface {p1}, LLi/y;->l()LLi/N;

    move-result-object p1

    new-instance v1, LLi/v$a$a;

    invoke-direct {v1, v5}, LLi/v$a$a;-><init>(Ldh/e;)V

    iput v4, p0, LLi/v$a;->a:I

    invoke-static {p1, v1, p0}, LLi/i;->y(LLi/g;Lmh/p;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    return-object v0

    :cond_5
    :goto_1
    iget-object p1, p0, LLi/v$a;->c:LLi/g;

    iget-object v1, p0, LLi/v$a;->d:LLi/y;

    iput v3, p0, LLi/v$a;->a:I

    invoke-interface {p1, v1, p0}, LLi/g;->b(LLi/h;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_7

    return-object v0

    :cond_6
    iget-object p1, p0, LLi/v$a;->b:LLi/J;

    iget-object v1, p0, LLi/v$a;->d:LLi/y;

    invoke-interface {v1}, LLi/y;->l()LLi/N;

    move-result-object v1

    invoke-interface {p1, v1}, LLi/J;->a(LLi/N;)LLi/g;

    move-result-object p1

    invoke-static {p1}, LLi/i;->n(LLi/g;)LLi/g;

    move-result-object p1

    new-instance v1, LLi/v$a$b;

    iget-object v3, p0, LLi/v$a;->c:LLi/g;

    iget-object v4, p0, LLi/v$a;->d:LLi/y;

    iget-object v6, p0, LLi/v$a;->e:Ljava/lang/Object;

    invoke-direct {v1, v3, v4, v6, v5}, LLi/v$a$b;-><init>(LLi/g;LLi/y;Ljava/lang/Object;Ldh/e;)V

    iput v2, p0, LLi/v$a;->a:I

    invoke-static {p1, v1, p0}, LLi/i;->i(LLi/g;Lmh/p;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_7

    return-object v0

    :cond_7
    :goto_2
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public final n(LIi/N;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LLi/v$a;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, LLi/v$a;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, LLi/v$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
