.class final LT/r1$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LT/r1;->b(LLi/g;Ljava/lang/Object;Ldh/i;LT/l;II)LT/z1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field private synthetic b:Ljava/lang/Object;

.field final synthetic c:Ldh/i;

.field final synthetic d:LLi/g;


# direct methods
.method constructor <init>(Ldh/i;LLi/g;Ldh/e;)V
    .locals 0

    iput-object p1, p0, LT/r1$a;->c:Ldh/i;

    iput-object p2, p0, LT/r1$a;->d:LLi/g;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 3

    new-instance v0, LT/r1$a;

    iget-object v1, p0, LT/r1$a;->c:Ldh/i;

    iget-object v2, p0, LT/r1$a;->d:LLi/g;

    invoke-direct {v0, v1, v2, p2}, LT/r1$a;-><init>(Ldh/i;LLi/g;Ldh/e;)V

    iput-object p1, v0, LT/r1$a;->b:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/F0;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, LT/r1$a;->n(LT/F0;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LT/r1$a;->a:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LT/r1$a;->b:Ljava/lang/Object;

    check-cast p1, LT/F0;

    iget-object v1, p0, LT/r1$a;->c:Ldh/i;

    sget-object v4, Ldh/j;->a:Ldh/j;

    invoke-static {v1, v4}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p0, LT/r1$a;->d:LLi/g;

    new-instance v2, LT/r1$a$a;

    invoke-direct {v2, p1}, LT/r1$a$a;-><init>(LT/F0;)V

    iput v3, p0, LT/r1$a;->a:I

    invoke-interface {v1, v2, p0}, LLi/g;->b(LLi/h;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    return-object v0

    :cond_3
    iget-object v1, p0, LT/r1$a;->c:Ldh/i;

    new-instance v3, LT/r1$a$b;

    iget-object v4, p0, LT/r1$a;->d:LLi/g;

    const/4 v5, 0x0

    invoke-direct {v3, v4, p1, v5}, LT/r1$a$b;-><init>(LLi/g;LT/F0;Ldh/e;)V

    iput v2, p0, LT/r1$a;->a:I

    invoke-static {v1, v3, p0}, LIi/i;->g(Ldh/i;Lmh/p;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    return-object v0

    :cond_4
    :goto_1
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public final n(LT/F0;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LT/r1$a;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, LT/r1$a;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, LT/r1$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
