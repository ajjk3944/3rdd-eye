.class final LN/b$c;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN/b;->j(Ls/L;Lmh/q;Ldh/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field final synthetic b:LN/b;

.field final synthetic c:Lmh/q;


# direct methods
.method constructor <init>(LN/b;Lmh/q;Ldh/e;)V
    .locals 0

    iput-object p1, p0, LN/b$c;->b:LN/b;

    iput-object p2, p0, LN/b$c;->c:Lmh/q;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ldh/e;)Ldh/e;
    .locals 3

    new-instance v0, LN/b$c;

    iget-object v1, p0, LN/b$c;->b:LN/b;

    iget-object v2, p0, LN/b$c;->c:Lmh/q;

    invoke-direct {v0, v1, v2, p1}, LN/b$c;-><init>(LN/b;Lmh/q;Ldh/e;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ldh/e;

    invoke-virtual {p0, p1}, LN/b$c;->n(Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LN/b$c;->a:I

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

    new-instance p1, LN/b$c$a;

    iget-object v1, p0, LN/b$c;->b:LN/b;

    invoke-direct {p1, v1}, LN/b$c$a;-><init>(LN/b;)V

    new-instance v1, LN/b$c$b;

    iget-object v3, p0, LN/b$c;->c:Lmh/q;

    iget-object v4, p0, LN/b$c;->b:LN/b;

    const/4 v5, 0x0

    invoke-direct {v1, v3, v4, v5}, LN/b$c$b;-><init>(Lmh/q;LN/b;Ldh/e;)V

    iput v2, p0, LN/b$c;->a:I

    invoke-static {p1, v1, p0}, Landroidx/compose/material/a;->c(Lmh/a;Lmh/p;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public final n(Ldh/e;)Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0, p1}, LN/b$c;->create(Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, LN/b$c;

    sget-object v0, LYg/J;->a:LYg/J;

    invoke-virtual {p1, v0}, LN/b$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
