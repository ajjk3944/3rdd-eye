.class final Lcom/ui/sso/api/provider/a$c$a$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/sso/api/provider/a$c$a;->onChange(ZLandroid/net/Uri;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field private synthetic b:Ljava/lang/Object;

.field final synthetic c:Landroid/net/Uri;

.field final synthetic d:Lcom/ui/sso/api/provider/a$c;


# direct methods
.method constructor <init>(Landroid/net/Uri;Lcom/ui/sso/api/provider/a$c;Ldh/e;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/sso/api/provider/a$c$a$a;->c:Landroid/net/Uri;

    iput-object p2, p0, Lcom/ui/sso/api/provider/a$c$a$a;->d:Lcom/ui/sso/api/provider/a$c;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 3

    new-instance v0, Lcom/ui/sso/api/provider/a$c$a$a;

    iget-object v1, p0, Lcom/ui/sso/api/provider/a$c$a$a;->c:Landroid/net/Uri;

    iget-object v2, p0, Lcom/ui/sso/api/provider/a$c$a$a;->d:Lcom/ui/sso/api/provider/a$c;

    invoke-direct {v0, v1, v2, p2}, Lcom/ui/sso/api/provider/a$c$a$a;-><init>(Landroid/net/Uri;Lcom/ui/sso/api/provider/a$c;Ldh/e;)V

    iput-object p1, v0, Lcom/ui/sso/api/provider/a$c$a$a;->b:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIi/N;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, Lcom/ui/sso/api/provider/a$c$a$a;->n(LIi/N;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    iget v0, p0, Lcom/ui/sso/api/provider/a$c$a$a;->a:I

    if-nez v0, :cond_3

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/ui/sso/api/provider/a$c$a$a;->b:Ljava/lang/Object;

    move-object v0, p1

    check-cast v0, LIi/N;

    new-instance p1, Lcom/ui/sso/api/provider/a$c$a$a$a;

    iget-object v1, p0, Lcom/ui/sso/api/provider/a$c$a$a;->c:Landroid/net/Uri;

    invoke-direct {p1, v1}, Lcom/ui/sso/api/provider/a$c$a$a$a;-><init>(Landroid/net/Uri;)V

    invoke-static {p1}, LUa/a;->e(Lmh/a;)V

    iget-object p1, p0, Lcom/ui/sso/api/provider/a$c$a$a;->c:Landroid/net/Uri;

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/net/Uri;->getPathSegments()Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-static {p1}, LZg/v;->s0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    const-string/jumbo v2, "accounts"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    iget-object p1, p0, Lcom/ui/sso/api/provider/a$c$a$a;->d:Lcom/ui/sso/api/provider/a$c;

    invoke-virtual {p1}, Lcom/ui/sso/api/provider/a$c;->c()LIi/J;

    move-result-object p1

    new-instance v3, Lcom/ui/sso/api/provider/a$c$a$a$b;

    iget-object v2, p0, Lcom/ui/sso/api/provider/a$c$a$a;->d:Lcom/ui/sso/api/provider/a$c;

    invoke-direct {v3, v2, v1}, Lcom/ui/sso/api/provider/a$c$a$a$b;-><init>(Lcom/ui/sso/api/provider/a$c;Ldh/e;)V

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v2, 0x0

    move-object v1, p1

    invoke-static/range {v0 .. v5}, LIi/i;->d(LIi/N;Ldh/i;LIi/P;Lmh/p;ILjava/lang/Object;)LIi/y0;

    move-result-object p1

    goto :goto_1

    :cond_1
    const-string/jumbo v2, "auth"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Lcom/ui/sso/api/provider/a$c$a$a;->d:Lcom/ui/sso/api/provider/a$c;

    invoke-virtual {p1}, Lcom/ui/sso/api/provider/a$c;->c()LIi/J;

    move-result-object p1

    new-instance v3, Lcom/ui/sso/api/provider/a$c$a$a$c;

    iget-object v2, p0, Lcom/ui/sso/api/provider/a$c$a$a;->c:Landroid/net/Uri;

    iget-object v4, p0, Lcom/ui/sso/api/provider/a$c$a$a;->d:Lcom/ui/sso/api/provider/a$c;

    invoke-direct {v3, v2, v4, v1}, Lcom/ui/sso/api/provider/a$c$a$a$c;-><init>(Landroid/net/Uri;Lcom/ui/sso/api/provider/a$c;Ldh/e;)V

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v2, 0x0

    move-object v1, p1

    invoke-static/range {v0 .. v5}, LIi/i;->d(LIi/N;Ldh/i;LIi/P;Lmh/p;ILjava/lang/Object;)LIi/y0;

    move-result-object p1

    goto :goto_1

    :cond_2
    new-instance p1, Lcom/ui/sso/api/provider/a$c$a$a$d;

    iget-object v0, p0, Lcom/ui/sso/api/provider/a$c$a$a;->c:Landroid/net/Uri;

    invoke-direct {p1, v0}, Lcom/ui/sso/api/provider/a$c$a$a$d;-><init>(Landroid/net/Uri;)V

    const/4 v0, 0x2

    invoke-static {p1, v1, v0, v1}, LUa/a;->g(Lmh/a;Ljava/lang/Throwable;ILjava/lang/Object;)V

    sget-object p1, LYg/J;->a:LYg/J;

    :goto_1
    return-object p1

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string/jumbo v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final n(LIi/N;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/ui/sso/api/provider/a$c$a$a;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, Lcom/ui/sso/api/provider/a$c$a$a;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, Lcom/ui/sso/api/provider/a$c$a$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
