.class final LM/z$d;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LM/z;->h(Lmh/a;LT/l;I)LT/z1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field private synthetic b:Ljava/lang/Object;

.field final synthetic c:LT/z1;

.field final synthetic d:Lr/a;


# direct methods
.method constructor <init>(LT/z1;Lr/a;Ldh/e;)V
    .locals 0

    iput-object p1, p0, LM/z$d;->c:LT/z1;

    iput-object p2, p0, LM/z$d;->d:Lr/a;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 3

    new-instance v0, LM/z$d;

    iget-object v1, p0, LM/z$d;->c:LT/z1;

    iget-object v2, p0, LM/z$d;->d:Lr/a;

    invoke-direct {v0, v1, v2, p2}, LM/z$d;-><init>(LT/z1;Lr/a;Ldh/e;)V

    iput-object p1, v0, LM/z$d;->b:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIi/N;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, LM/z$d;->n(LIi/N;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LM/z$d;->a:I

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

    iget-object p1, p0, LM/z$d;->b:Ljava/lang/Object;

    check-cast p1, LIi/N;

    new-instance v1, LM/z$d$a;

    iget-object v3, p0, LM/z$d;->c:LT/z1;

    invoke-direct {v1, v3}, LM/z$d$a;-><init>(LT/z1;)V

    invoke-static {v1}, LT/o1;->o(Lmh/a;)LLi/g;

    move-result-object v1

    new-instance v3, LM/z$d$b;

    iget-object v4, p0, LM/z$d;->d:Lr/a;

    invoke-direct {v3, v4, p1}, LM/z$d$b;-><init>(Lr/a;LIi/N;)V

    iput v2, p0, LM/z$d;->a:I

    invoke-interface {v1, v3, p0}, LLi/g;->b(LLi/h;Ldh/e;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, LM/z$d;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, LM/z$d;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, LM/z$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
