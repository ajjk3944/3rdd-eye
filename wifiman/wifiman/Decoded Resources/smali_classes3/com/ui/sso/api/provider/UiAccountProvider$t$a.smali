.class final Lcom/ui/sso/api/provider/UiAccountProvider$t$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/sso/api/provider/UiAccountProvider$t;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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

    iput-object p1, p0, Lcom/ui/sso/api/provider/UiAccountProvider$t$a;->b:Lcom/ui/sso/api/provider/UiAccountProvider;

    iput-object p2, p0, Lcom/ui/sso/api/provider/UiAccountProvider$t$a;->c:Landroid/net/Uri;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ldh/e;)Ldh/e;
    .locals 3

    new-instance v0, Lcom/ui/sso/api/provider/UiAccountProvider$t$a;

    iget-object v1, p0, Lcom/ui/sso/api/provider/UiAccountProvider$t$a;->b:Lcom/ui/sso/api/provider/UiAccountProvider;

    iget-object v2, p0, Lcom/ui/sso/api/provider/UiAccountProvider$t$a;->c:Landroid/net/Uri;

    invoke-direct {v0, v1, v2, p1}, Lcom/ui/sso/api/provider/UiAccountProvider$t$a;-><init>(Lcom/ui/sso/api/provider/UiAccountProvider;Landroid/net/Uri;Ldh/e;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ldh/e;

    invoke-virtual {p0, p1}, Lcom/ui/sso/api/provider/UiAccountProvider$t$a;->n(Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lcom/ui/sso/api/provider/UiAccountProvider$t$a;->a:I

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

    iget-object p1, p0, Lcom/ui/sso/api/provider/UiAccountProvider$t$a;->b:Lcom/ui/sso/api/provider/UiAccountProvider;

    invoke-static {p1}, Lcom/ui/sso/api/provider/UiAccountProvider;->d(Lcom/ui/sso/api/provider/UiAccountProvider;)V

    iget-object p1, p0, Lcom/ui/sso/api/provider/UiAccountProvider$t$a;->b:Lcom/ui/sso/api/provider/UiAccountProvider;

    invoke-virtual {p1}, Lcom/ui/sso/api/provider/UiAccountProvider;->F()Landroid/content/UriMatcher;

    move-result-object p1

    iget-object v1, p0, Lcom/ui/sso/api/provider/UiAccountProvider$t$a;->c:Landroid/net/Uri;

    invoke-virtual {p1, v1}, Landroid/content/UriMatcher;->match(Landroid/net/Uri;)I

    move-result p1

    if-nez p1, :cond_3

    iget-object p1, p0, Lcom/ui/sso/api/provider/UiAccountProvider$t$a;->b:Lcom/ui/sso/api/provider/UiAccountProvider;

    iput v2, p0, Lcom/ui/sso/api/provider/UiAccountProvider$t$a;->a:I

    invoke-static {p1, p0}, Lcom/ui/sso/api/provider/UiAccountProvider;->g(Lcom/ui/sso/api/provider/UiAccountProvider;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    check-cast p1, Landroid/database/Cursor;

    return-object p1

    :cond_3
    new-instance p1, Lcom/ui/sso/api/provider/UiAccountProviderError$IllegalState;

    iget-object v0, p0, Lcom/ui/sso/api/provider/UiAccountProvider$t$a;->c:Landroid/net/Uri;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "unknown query uri: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-direct {p1, v0, v2, v1, v2}, Lcom/ui/sso/api/provider/UiAccountProviderError$IllegalState;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw p1
.end method

.method public final n(Ldh/e;)Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/ui/sso/api/provider/UiAccountProvider$t$a;->create(Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, Lcom/ui/sso/api/provider/UiAccountProvider$t$a;

    sget-object v0, LYg/J;->a:LYg/J;

    invoke-virtual {p1, v0}, Lcom/ui/sso/api/provider/UiAccountProvider$t$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
