.class final Lye/d$e;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lye/d;->d(Lgg/b;Lye/g;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:Ljava/lang/Object;

.field b:I

.field final synthetic c:Lgg/b;


# direct methods
.method constructor <init>(Lgg/b;Ldh/e;)V
    .locals 0

    iput-object p1, p0, Lye/d$e;->c:Lgg/b;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 1

    new-instance p1, Lye/d$e;

    iget-object v0, p0, Lye/d$e;->c:Lgg/b;

    invoke-direct {p1, v0, p2}, Lye/d$e;-><init>(Lgg/b;Ldh/e;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIi/N;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, Lye/d$e;->n(LIi/N;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lye/d$e;->b:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lye/d$e;->a:Ljava/lang/Object;

    check-cast v0, Lgg/b;

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lye/d$e;->c:Lgg/b;

    iput-object p1, p0, Lye/d$e;->a:Ljava/lang/Object;

    iput v2, p0, Lye/d$e;->b:I

    new-instance v1, LIi/p;

    invoke-static {p0}, Leh/b;->d(Ldh/e;)Ldh/e;

    move-result-object v3

    invoke-direct {v1, v3, v2}, LIi/p;-><init>(Ldh/e;I)V

    invoke-virtual {v1}, LIi/p;->A()V

    invoke-virtual {p1}, Lgg/b;->S()Lhg/c;

    move-result-object p1

    const-string v2, "subscribe(...)"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lye/d$e$a;

    invoke-direct {v2, p1}, Lye/d$e$a;-><init>(Lhg/c;)V

    invoke-interface {v1, v2}, LIi/n;->B(Lmh/l;)V

    invoke-virtual {v1}, LIi/p;->u()Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v1

    if-ne p1, v1, :cond_2

    invoke-static {p0}, Lkotlin/coroutines/jvm/internal/h;->c(Ldh/e;)V

    :cond_2
    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    :goto_0
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public final n(LIi/N;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lye/d$e;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, Lye/d$e;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, Lye/d$e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
