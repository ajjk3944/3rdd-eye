.class final LO1/l$g;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LO1/l;-><init>(Lmh/a;LO1/j;Ljava/util/List;LO1/a;LIi/N;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field private synthetic b:Ljava/lang/Object;

.field final synthetic c:LO1/l;


# direct methods
.method constructor <init>(LO1/l;Ldh/e;)V
    .locals 0

    iput-object p1, p0, LO1/l$g;->c:LO1/l;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 2

    new-instance v0, LO1/l$g;

    iget-object v1, p0, LO1/l$g;->c:LO1/l;

    invoke-direct {v0, v1, p2}, LO1/l$g;-><init>(LO1/l;Ldh/e;)V

    iput-object p1, v0, LO1/l$g;->b:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LLi/h;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, LO1/l$g;->n(LLi/h;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LO1/l$g;->a:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LO1/l$g;->b:Ljava/lang/Object;

    check-cast p1, LLi/h;

    iget-object v1, p0, LO1/l$g;->c:LO1/l;

    invoke-static {v1}, LO1/l;->f(LO1/l;)LLi/z;

    move-result-object v1

    invoke-interface {v1}, LLi/z;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LO1/m;

    instance-of v3, v1, LO1/b;

    if-nez v3, :cond_2

    iget-object v3, p0, LO1/l$g;->c:LO1/l;

    invoke-static {v3}, LO1/l;->e(LO1/l;)LO1/k;

    move-result-object v3

    new-instance v4, LO1/l$b$a;

    invoke-direct {v4, v1}, LO1/l$b$a;-><init>(LO1/m;)V

    invoke-virtual {v3, v4}, LO1/k;->e(Ljava/lang/Object;)V

    :cond_2
    iget-object v3, p0, LO1/l$g;->c:LO1/l;

    invoke-static {v3}, LO1/l;->f(LO1/l;)LLi/z;

    move-result-object v3

    new-instance v4, LO1/l$g$a;

    const/4 v5, 0x0

    invoke-direct {v4, v1, v5}, LO1/l$g$a;-><init>(LO1/m;Ldh/e;)V

    invoke-static {v3, v4}, LLi/i;->r(LLi/g;Lmh/p;)LLi/g;

    move-result-object v1

    new-instance v3, LO1/l$g$b;

    invoke-direct {v3, v1}, LO1/l$g$b;-><init>(LLi/g;)V

    iput v2, p0, LO1/l$g;->a:I

    invoke-static {p1, v3, p0}, LLi/i;->t(LLi/h;LLi/g;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    :goto_0
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public final n(LLi/h;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LO1/l$g;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, LO1/l$g;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, LO1/l$g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
