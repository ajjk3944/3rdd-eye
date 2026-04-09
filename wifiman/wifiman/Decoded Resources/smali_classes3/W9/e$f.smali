.class final LW9/e$f;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LW9/e;->q0(Lcom/ui/core/ui/sso/UiSSO$a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field final synthetic b:LW9/e;

.field final synthetic c:Lcom/ui/core/ui/sso/UiSSO$a;


# direct methods
.method constructor <init>(LW9/e;Lcom/ui/core/ui/sso/UiSSO$a;Ldh/e;)V
    .locals 0

    iput-object p1, p0, LW9/e$f;->b:LW9/e;

    iput-object p2, p0, LW9/e$f;->c:Lcom/ui/core/ui/sso/UiSSO$a;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 2

    new-instance p1, LW9/e$f;

    iget-object v0, p0, LW9/e$f;->b:LW9/e;

    iget-object v1, p0, LW9/e$f;->c:Lcom/ui/core/ui/sso/UiSSO$a;

    invoke-direct {p1, v0, v1, p2}, LW9/e$f;-><init>(LW9/e;Lcom/ui/core/ui/sso/UiSSO$a;Ldh/e;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIi/N;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, LW9/e$f;->n(LIi/N;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LW9/e$f;->a:I

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

    iget-object p1, p0, LW9/e$f;->b:LW9/e;

    invoke-virtual {p1}, LW9/e;->p0()Lcom/ui/core/ui/sso/c;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ui/core/ui/sso/c;->c()Lcom/ui/core/ui/sso/c$a;

    move-result-object p1

    iget-object v1, p0, LW9/e$f;->c:Lcom/ui/core/ui/sso/UiSSO$a;

    iput v2, p0, LW9/e$f;->a:I

    invoke-interface {p1, v1, p0}, Lcom/ui/core/ui/sso/c$a;->G(Lcom/ui/core/ui/sso/UiSSO$a;Ldh/e;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, LW9/e$f;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, LW9/e$f;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, LW9/e$f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
