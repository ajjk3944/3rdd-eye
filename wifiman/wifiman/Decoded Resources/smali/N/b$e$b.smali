.class final LN/b$e$b;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN/b$e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field synthetic b:Ljava/lang/Object;

.field final synthetic c:Lmh/r;

.field final synthetic d:LN/b;


# direct methods
.method constructor <init>(Lmh/r;LN/b;Ldh/e;)V
    .locals 0

    iput-object p1, p0, LN/b$e$b;->c:Lmh/r;

    iput-object p2, p0, LN/b$e$b;->d:LN/b;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 3

    new-instance v0, LN/b$e$b;

    iget-object v1, p0, LN/b$e$b;->c:Lmh/r;

    iget-object v2, p0, LN/b$e$b;->d:LN/b;

    invoke-direct {v0, v1, v2, p2}, LN/b$e$b;-><init>(Lmh/r;LN/b;Ldh/e;)V

    iput-object p1, v0, LN/b$e$b;->b:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LYg/s;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, LN/b$e$b;->n(LYg/s;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LN/b$e$b;->a:I

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

    iget-object p1, p0, LN/b$e$b;->b:Ljava/lang/Object;

    check-cast p1, LYg/s;

    invoke-virtual {p1}, LYg/s;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LN/D;

    invoke-virtual {p1}, LYg/s;->c()Ljava/lang/Object;

    move-result-object p1

    iget-object v3, p0, LN/b$e$b;->c:Lmh/r;

    iget-object v4, p0, LN/b$e$b;->d:LN/b;

    invoke-static {v4}, LN/b;->c(LN/b;)LN/a;

    move-result-object v4

    iput v2, p0, LN/b$e$b;->a:I

    invoke-interface {v3, v4, v1, p1, p0}, Lmh/r;->y(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public final n(LYg/s;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LN/b$e$b;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, LN/b$e$b;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, LN/b$e$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
