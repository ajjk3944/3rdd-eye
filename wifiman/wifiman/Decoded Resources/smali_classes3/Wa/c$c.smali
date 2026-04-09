.class final LWa/c$c;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LWa/c;->a(LLi/g;LIi/N;LLi/J;I)LLi/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field private synthetic b:Ljava/lang/Object;

.field synthetic c:Ljava/lang/Object;


# direct methods
.method constructor <init>(Ldh/e;)V
    .locals 1

    const/4 v0, 0x3

    invoke-direct {p0, v0, p1}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LWa/c$c;->a:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string/jumbo v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LWa/c$c;->b:Ljava/lang/Object;

    check-cast p1, LLi/h;

    iget-object v1, p0, LWa/c$c;->c:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Throwable;

    new-instance v3, LWa/d$b;

    invoke-direct {v3, v1}, LWa/d$b;-><init>(Ljava/lang/Throwable;)V

    const/4 v1, 0x0

    iput-object v1, p0, LWa/c$c;->b:Ljava/lang/Object;

    iput v2, p0, LWa/c$c;->a:I

    invoke-interface {p1, v3, p0}, LLi/h;->a(Ljava/lang/Object;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public final n(LLi/h;Ljava/lang/Throwable;Ldh/e;)Ljava/lang/Object;
    .locals 1

    new-instance v0, LWa/c$c;

    invoke-direct {v0, p3}, LWa/c$c;-><init>(Ldh/e;)V

    iput-object p1, v0, LWa/c$c;->b:Ljava/lang/Object;

    iput-object p2, v0, LWa/c$c;->c:Ljava/lang/Object;

    sget-object p1, LYg/J;->a:LYg/J;

    invoke-virtual {v0, p1}, LWa/c$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LLi/h;

    check-cast p2, Ljava/lang/Throwable;

    check-cast p3, Ldh/e;

    invoke-virtual {p0, p1, p2, p3}, LWa/c$c;->n(LLi/h;Ljava/lang/Throwable;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
