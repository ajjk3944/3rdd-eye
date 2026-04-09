.class final LS6/i$c;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS6/i;->i(Lmh/l;Ldh/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field private synthetic b:Ljava/lang/Object;

.field final synthetic c:Lmh/l;


# direct methods
.method constructor <init>(Lmh/l;Ldh/e;)V
    .locals 0

    iput-object p1, p0, LS6/i$c;->c:Lmh/l;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 2

    new-instance v0, LS6/i$c;

    iget-object v1, p0, LS6/i$c;->c:Lmh/l;

    invoke-direct {v0, v1, p2}, LS6/i$c;-><init>(Lmh/l;Ldh/e;)V

    iput-object p1, v0, LS6/i$c;->b:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LLi/h;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, LS6/i$c;->n(LLi/h;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LS6/i$c;->a:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string/jumbo v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v1, p0, LS6/i$c;->b:Ljava/lang/Object;

    check-cast v1, LLi/h;

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LS6/i$c;->b:Ljava/lang/Object;

    move-object v1, p1

    check-cast v1, LLi/h;

    iget-object p1, p0, LS6/i$c;->c:Lmh/l;

    iput-object v1, p0, LS6/i$c;->b:Ljava/lang/Object;

    iput v3, p0, LS6/i$c;->a:I

    invoke-interface {p1, p0}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    :goto_0
    check-cast p1, LLi/g;

    const/4 v3, 0x0

    iput-object v3, p0, LS6/i$c;->b:Ljava/lang/Object;

    iput v2, p0, LS6/i$c;->a:I

    invoke-static {v1, p1, p0}, LLi/i;->t(LLi/h;LLi/g;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    return-object v0

    :cond_4
    :goto_1
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public final n(LLi/h;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LS6/i$c;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, LS6/i$c;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, LS6/i$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
