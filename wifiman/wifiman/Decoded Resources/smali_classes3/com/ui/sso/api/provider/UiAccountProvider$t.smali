.class final Lcom/ui/sso/api/provider/UiAccountProvider$t;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/sso/api/provider/UiAccountProvider;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field final synthetic b:Lcom/ui/sso/api/provider/UiAccountProvider;

.field final synthetic c:Landroid/net/Uri;


# direct methods
.method constructor <init>(Lcom/ui/sso/api/provider/UiAccountProvider;Landroid/net/Uri;Ldh/e;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/sso/api/provider/UiAccountProvider$t;->b:Lcom/ui/sso/api/provider/UiAccountProvider;

    iput-object p2, p0, Lcom/ui/sso/api/provider/UiAccountProvider$t;->c:Landroid/net/Uri;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 2

    new-instance p1, Lcom/ui/sso/api/provider/UiAccountProvider$t;

    iget-object v0, p0, Lcom/ui/sso/api/provider/UiAccountProvider$t;->b:Lcom/ui/sso/api/provider/UiAccountProvider;

    iget-object v1, p0, Lcom/ui/sso/api/provider/UiAccountProvider$t;->c:Landroid/net/Uri;

    invoke-direct {p1, v0, v1, p2}, Lcom/ui/sso/api/provider/UiAccountProvider$t;-><init>(Lcom/ui/sso/api/provider/UiAccountProvider;Landroid/net/Uri;Ldh/e;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIi/N;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, Lcom/ui/sso/api/provider/UiAccountProvider$t;->n(LIi/N;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lcom/ui/sso/api/provider/UiAccountProvider$t;->a:I

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

    iget-object p1, p0, Lcom/ui/sso/api/provider/UiAccountProvider$t;->b:Lcom/ui/sso/api/provider/UiAccountProvider;

    new-instance v1, Lcom/ui/sso/api/provider/UiAccountProvider$t$a;

    iget-object v3, p0, Lcom/ui/sso/api/provider/UiAccountProvider$t;->c:Landroid/net/Uri;

    const/4 v4, 0x0

    invoke-direct {v1, p1, v3, v4}, Lcom/ui/sso/api/provider/UiAccountProvider$t$a;-><init>(Lcom/ui/sso/api/provider/UiAccountProvider;Landroid/net/Uri;Ldh/e;)V

    iput v2, p0, Lcom/ui/sso/api/provider/UiAccountProvider$t;->a:I

    invoke-static {p1, v1, p0}, Lcom/ui/sso/api/provider/UiAccountProvider;->l(Lcom/ui/sso/api/provider/UiAccountProvider;Lmh/l;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    move-object v0, p1

    check-cast v0, Landroid/database/Cursor;

    sget-object v0, Lcom/ui/sso/api/provider/UiAccountProvider$t$b;->a:Lcom/ui/sso/api/provider/UiAccountProvider$t$b;

    invoke-static {v0}, LUa/a;->e(Lmh/a;)V

    return-object p1
.end method

.method public final n(LIi/N;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/ui/sso/api/provider/UiAccountProvider$t;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, Lcom/ui/sso/api/provider/UiAccountProvider$t;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, Lcom/ui/sso/api/provider/UiAccountProvider$t;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
