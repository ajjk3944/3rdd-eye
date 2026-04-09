.class final LN/b$h$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN/b$h;->a(Ls/L;Lmh/p;Ldh/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field final synthetic b:LN/b$h;

.field final synthetic c:Lmh/p;


# direct methods
.method constructor <init>(LN/b$h;Lmh/p;Ldh/e;)V
    .locals 0

    iput-object p1, p0, LN/b$h$a;->b:LN/b$h;

    iput-object p2, p0, LN/b$h$a;->c:Lmh/p;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LN/b$h$a;->a:I

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

    iget-object p1, p0, LN/b$h$a;->b:LN/b$h;

    invoke-static {p1}, LN/b$h;->c(LN/b$h;)LN/b$h$b;

    move-result-object p1

    iget-object v1, p0, LN/b$h$a;->c:Lmh/p;

    iput v2, p0, LN/b$h$a;->a:I

    invoke-interface {v1, p1, p0}, Lmh/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public final n(LN/a;LN/D;Ldh/e;)Ljava/lang/Object;
    .locals 1

    new-instance p1, LN/b$h$a;

    iget-object p2, p0, LN/b$h$a;->b:LN/b$h;

    iget-object v0, p0, LN/b$h$a;->c:Lmh/p;

    invoke-direct {p1, p2, v0, p3}, LN/b$h$a;-><init>(LN/b$h;Lmh/p;Ldh/e;)V

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, LN/b$h$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LN/a;

    check-cast p2, LN/D;

    check-cast p3, Ldh/e;

    invoke-virtual {p0, p1, p2, p3}, LN/b$h$a;->n(LN/a;LN/D;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
