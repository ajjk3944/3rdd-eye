.class final LM/t$h;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LM/t;->m(Landroidx/compose/ui/e;LM/i;LF/U;)Landroidx/compose/ui/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field private synthetic b:Ljava/lang/Object;

.field final synthetic c:LM/i;

.field final synthetic d:LF/U;


# direct methods
.method constructor <init>(LM/i;LF/U;Ldh/e;)V
    .locals 0

    iput-object p1, p0, LM/t$h;->c:LM/i;

    iput-object p2, p0, LM/t$h;->d:LF/U;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 3

    new-instance v0, LM/t$h;

    iget-object v1, p0, LM/t$h;->c:LM/i;

    iget-object v2, p0, LM/t$h;->d:LF/U;

    invoke-direct {v0, v1, v2, p2}, LM/t$h;-><init>(LM/i;LF/U;Ldh/e;)V

    iput-object p1, v0, LM/t$h;->b:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ly0/G;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, LM/t$h;->n(Ly0/G;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LM/t$h;->a:I

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

    iget-object p1, p0, LM/t$h;->b:Ljava/lang/Object;

    check-cast p1, Ly0/G;

    new-instance v1, LM/d;

    invoke-interface {p1}, Ly0/G;->getViewConfiguration()Landroidx/compose/ui/platform/w1;

    move-result-object v3

    invoke-direct {v1, v3}, LM/d;-><init>(Landroidx/compose/ui/platform/w1;)V

    new-instance v3, LM/t$h$a;

    iget-object v4, p0, LM/t$h;->c:LM/i;

    iget-object v5, p0, LM/t$h;->d:LF/U;

    const/4 v6, 0x0

    invoke-direct {v3, v4, v1, v5, v6}, LM/t$h$a;-><init>(LM/i;LM/d;LF/U;Ldh/e;)V

    iput v2, p0, LM/t$h;->a:I

    invoke-static {p1, v3, p0}, Lw/o;->d(Ly0/G;Lmh/p;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public final n(Ly0/G;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LM/t$h;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, LM/t$h;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, LM/t$h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
