.class final LRa/a$h;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LRa/a;-><init>(Lcom/ui/sso/api/UiAccountApi$c;Lcom/ui/sso/api/UiAccountApi$d;Lcom/ui/sso/account/UIAccountManager;LTa/d;Lcom/ui/sso/auth/UiAuthSerializer;LIi/J;LIi/N;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field private synthetic b:Ljava/lang/Object;

.field final synthetic c:LRa/a;


# direct methods
.method constructor <init>(LRa/a;Ldh/e;)V
    .locals 0

    iput-object p1, p0, LRa/a$h;->c:LRa/a;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 2

    new-instance v0, LRa/a$h;

    iget-object v1, p0, LRa/a$h;->c:LRa/a;

    invoke-direct {v0, v1, p2}, LRa/a$h;-><init>(LRa/a;Ldh/e;)V

    iput-object p1, v0, LRa/a$h;->b:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LKi/t;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, LRa/a$h;->n(LKi/t;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LRa/a$h;->a:I

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

    iget-object p1, p0, LRa/a$h;->b:Ljava/lang/Object;

    check-cast p1, LKi/t;

    new-instance v1, LRa/a$h$b;

    invoke-direct {v1, p1}, LRa/a$h$b;-><init>(LKi/t;)V

    iget-object v3, p0, LRa/a$h;->c:LRa/a;

    invoke-static {v3}, LRa/a;->j(LRa/a;)Lcom/ui/sso/account/UIAccountManager;

    move-result-object v3

    invoke-interface {v3, v1}, Lcom/ui/sso/account/UIAccountManager;->g(Lcom/ui/sso/account/UIAccountManager$a;)V

    new-instance v1, LRa/a$h$a;

    iget-object v3, p0, LRa/a$h;->c:LRa/a;

    invoke-direct {v1, v3}, LRa/a$h$a;-><init>(LRa/a;)V

    iput v2, p0, LRa/a$h;->a:I

    invoke-static {p1, v1, p0}, LKi/r;->a(LKi/t;Lmh/a;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public final n(LKi/t;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LRa/a$h;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, LRa/a$h;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, LRa/a$h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
