.class final LI/c1$c;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LI/c1;->W2()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field final synthetic b:LI/c1;


# direct methods
.method constructor <init>(LI/c1;Ldh/e;)V
    .locals 0

    iput-object p1, p0, LI/c1$c;->b:LI/c1;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 1

    new-instance p1, LI/c1$c;

    iget-object v0, p0, LI/c1$c;->b:LI/c1;

    invoke-direct {p1, v0, p2}, LI/c1$c;-><init>(LI/c1;Ldh/e;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIi/N;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, LI/c1$c;->n(LIi/N;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LI/c1$c;->a:I

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

    new-instance p1, Lkotlin/jvm/internal/L;

    invoke-direct {p1}, Lkotlin/jvm/internal/L;-><init>()V

    iput v2, p1, Lkotlin/jvm/internal/L;->a:I

    new-instance v1, LI/c1$c$a;

    iget-object v3, p0, LI/c1$c;->b:LI/c1;

    invoke-direct {v1, v3, p1}, LI/c1$c$a;-><init>(LI/c1;Lkotlin/jvm/internal/L;)V

    invoke-static {v1}, LT/o1;->o(Lmh/a;)LLi/g;

    move-result-object p1

    new-instance v1, LI/c1$c$b;

    iget-object v3, p0, LI/c1$c;->b:LI/c1;

    const/4 v4, 0x0

    invoke-direct {v1, v3, v4}, LI/c1$c$b;-><init>(LI/c1;Ldh/e;)V

    iput v2, p0, LI/c1$c;->a:I

    invoke-static {p1, v1, p0}, LLi/i;->i(LLi/g;Lmh/p;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public final n(LIi/N;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LI/c1$c;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, LI/c1$c;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, LI/c1$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
