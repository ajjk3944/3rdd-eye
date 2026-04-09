.class final Lcom/ui/sso/api/provider/a$c$a$a$c;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/sso/api/provider/a$c$a$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field final synthetic b:Landroid/net/Uri;

.field final synthetic c:Lcom/ui/sso/api/provider/a$c;


# direct methods
.method constructor <init>(Landroid/net/Uri;Lcom/ui/sso/api/provider/a$c;Ldh/e;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/sso/api/provider/a$c$a$a$c;->b:Landroid/net/Uri;

    iput-object p2, p0, Lcom/ui/sso/api/provider/a$c$a$a$c;->c:Lcom/ui/sso/api/provider/a$c;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 2

    new-instance p1, Lcom/ui/sso/api/provider/a$c$a$a$c;

    iget-object v0, p0, Lcom/ui/sso/api/provider/a$c$a$a$c;->b:Landroid/net/Uri;

    iget-object v1, p0, Lcom/ui/sso/api/provider/a$c$a$a$c;->c:Lcom/ui/sso/api/provider/a$c;

    invoke-direct {p1, v0, v1, p2}, Lcom/ui/sso/api/provider/a$c$a$a$c;-><init>(Landroid/net/Uri;Lcom/ui/sso/api/provider/a$c;Ldh/e;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIi/N;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, Lcom/ui/sso/api/provider/a$c$a$a$c;->n(LIi/N;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lcom/ui/sso/api/provider/a$c$a$a$c;->a:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string/jumbo v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/ui/sso/api/provider/a$c$a$a$c;->b:Landroid/net/Uri;

    invoke-virtual {p1}, Landroid/net/Uri;->getPathSegments()Ljava/util/List;

    move-result-object p1

    const-string/jumbo v1, "getPathSegments(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LZg/v;->D0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_2

    iget-object v1, p0, Lcom/ui/sso/api/provider/a$c$a$a$c;->c:Lcom/ui/sso/api/provider/a$c;

    :try_start_0
    invoke-static {p1}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    sget-object p1, Lcom/ui/sso/api/provider/a$c$a$a$c$a;->a:Lcom/ui/sso/api/provider/a$c$a$a$c$a;

    const/4 v3, 0x2

    const/4 v4, 0x0

    invoke-static {p1, v4, v3, v4}, LUa/a;->g(Lmh/a;Ljava/lang/Throwable;ILjava/lang/Object;)V

    move-object p1, v4

    :goto_0
    if-eqz p1, :cond_2

    invoke-virtual {v1}, Lcom/ui/sso/api/provider/a$c;->d()LLi/y;

    move-result-object v1

    new-instance v3, Lcom/ui/sso/api/provider/a$b$b;

    invoke-direct {v3, p1}, Lcom/ui/sso/api/provider/a$b$b;-><init>(Ljava/util/UUID;)V

    iput v2, p0, Lcom/ui/sso/api/provider/a$c$a$a$c;->a:I

    invoke-interface {v1, v3, p0}, LLi/y;->a(Ljava/lang/Object;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_1
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public final n(LIi/N;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/ui/sso/api/provider/a$c$a$a$c;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, Lcom/ui/sso/api/provider/a$c$a$a$c;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, Lcom/ui/sso/api/provider/a$c$a$a$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
