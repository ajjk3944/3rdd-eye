.class final Lcom/ui/sso/api/provider/a$s;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/sso/api/provider/a;-><init>(Lcom/ui/sso/api/UiAccountApi$c;Lcom/ui/sso/api/UiAccountApi$d;Landroid/content/ContentResolver;Lcom/ui/sso/api/provider/f;LWa/a;Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer;Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer;Lcom/ui/sso/api/provider/UiAccountProviderCursor$Serializer;Lcom/ui/sso/auth/UiAuthSerializer;LIi/N;LIi/J;LIi/J;Lcom/ui/sso/api/provider/a$b$c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field private synthetic b:Ljava/lang/Object;

.field final synthetic c:Lcom/ui/sso/api/provider/a;


# direct methods
.method constructor <init>(Lcom/ui/sso/api/provider/a;Ldh/e;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/sso/api/provider/a$s;->c:Lcom/ui/sso/api/provider/a;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 2

    new-instance v0, Lcom/ui/sso/api/provider/a$s;

    iget-object v1, p0, Lcom/ui/sso/api/provider/a$s;->c:Lcom/ui/sso/api/provider/a;

    invoke-direct {v0, v1, p2}, Lcom/ui/sso/api/provider/a$s;-><init>(Lcom/ui/sso/api/provider/a;Ldh/e;)V

    iput-object p1, v0, Lcom/ui/sso/api/provider/a$s;->b:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LKi/t;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, Lcom/ui/sso/api/provider/a$s;->n(LKi/t;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lcom/ui/sso/api/provider/a$s;->a:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto/16 :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string/jumbo v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/ui/sso/api/provider/a$s;->b:Ljava/lang/Object;

    check-cast p1, LKi/t;

    sget-object v1, Lcom/ui/sso/api/provider/a$s$a;->a:Lcom/ui/sso/api/provider/a$s$a;

    invoke-static {v1}, LUa/a;->e(Lmh/a;)V

    iget-object v1, p0, Lcom/ui/sso/api/provider/a$s;->c:Lcom/ui/sso/api/provider/a;

    invoke-static {v1}, Lcom/ui/sso/api/provider/a;->n(Lcom/ui/sso/api/provider/a;)Lcom/ui/sso/api/provider/a$b$c;

    move-result-object v1

    invoke-interface {v1}, Lcom/ui/sso/api/provider/a$b$c;->start()Landroid/database/ContentObserver;

    move-result-object v1

    iget-object v3, p0, Lcom/ui/sso/api/provider/a$s;->c:Lcom/ui/sso/api/provider/a;

    invoke-static {v3}, Lcom/ui/sso/api/provider/a;->n(Lcom/ui/sso/api/provider/a;)Lcom/ui/sso/api/provider/a$b$c;

    move-result-object v3

    invoke-interface {v3}, Lcom/ui/sso/api/provider/a$b$c;->a()LLi/D;

    move-result-object v3

    new-instance v4, Lcom/ui/sso/api/provider/a$s$e;

    const/4 v5, 0x0

    invoke-direct {v4, p1, v5}, Lcom/ui/sso/api/provider/a$s$e;-><init>(LKi/t;Ldh/e;)V

    invoke-static {v3, v4}, LLi/i;->I(LLi/g;Lmh/p;)LLi/g;

    move-result-object v3

    new-instance v4, Lcom/ui/sso/api/provider/a$s$f;

    invoke-direct {v4, p1, v5}, Lcom/ui/sso/api/provider/a$s$f;-><init>(LKi/t;Ldh/e;)V

    invoke-static {v3, v4}, LLi/i;->f(LLi/g;Lmh/q;)LLi/g;

    move-result-object v3

    invoke-static {v3, p1}, LLi/i;->D(LLi/g;LIi/N;)LIi/y0;

    move-result-object v3

    iget-object v4, p0, Lcom/ui/sso/api/provider/a$s;->c:Lcom/ui/sso/api/provider/a;

    invoke-static {v4}, Lcom/ui/sso/api/provider/a;->p(Lcom/ui/sso/api/provider/a;)Landroid/content/ContentResolver;

    move-result-object v4

    iget-object v5, p0, Lcom/ui/sso/api/provider/a$s;->c:Lcom/ui/sso/api/provider/a;

    invoke-static {v5}, Lcom/ui/sso/api/provider/a;->s(Lcom/ui/sso/api/provider/a;)Lcom/ui/sso/api/provider/f;

    move-result-object v5

    invoke-interface {v5}, Lcom/ui/sso/api/provider/f;->a()Landroid/net/Uri;

    move-result-object v5

    const/4 v6, 0x0

    invoke-virtual {v4, v5, v6, v1}, Landroid/content/ContentResolver;->registerContentObserver(Landroid/net/Uri;ZLandroid/database/ContentObserver;)V

    iget-object v4, p0, Lcom/ui/sso/api/provider/a$s;->c:Lcom/ui/sso/api/provider/a;

    invoke-static {v4}, Lcom/ui/sso/api/provider/a;->p(Lcom/ui/sso/api/provider/a;)Landroid/content/ContentResolver;

    move-result-object v4

    iget-object v5, p0, Lcom/ui/sso/api/provider/a$s;->c:Lcom/ui/sso/api/provider/a;

    invoke-static {v5}, Lcom/ui/sso/api/provider/a;->s(Lcom/ui/sso/api/provider/a;)Lcom/ui/sso/api/provider/f;

    move-result-object v5

    invoke-interface {v5}, Lcom/ui/sso/api/provider/f;->e()Landroid/net/Uri;

    move-result-object v5

    invoke-virtual {v4, v5, v2, v1}, Landroid/content/ContentResolver;->registerContentObserver(Landroid/net/Uri;ZLandroid/database/ContentObserver;)V

    sget-object v4, Lcom/ui/sso/api/provider/a$s$b;->a:Lcom/ui/sso/api/provider/a$s$b;

    invoke-static {v4}, LUa/a;->e(Lmh/a;)V

    sget-object v4, Lcom/ui/sso/api/provider/a$s$c;->a:Lcom/ui/sso/api/provider/a$s$c;

    invoke-static {v4}, LUa/a;->e(Lmh/a;)V

    new-instance v4, Lcom/ui/sso/api/provider/a$s$d;

    iget-object v5, p0, Lcom/ui/sso/api/provider/a$s;->c:Lcom/ui/sso/api/provider/a;

    invoke-direct {v4, v5, v3, v1}, Lcom/ui/sso/api/provider/a$s$d;-><init>(Lcom/ui/sso/api/provider/a;LIi/y0;Landroid/database/ContentObserver;)V

    iput v2, p0, Lcom/ui/sso/api/provider/a$s;->a:I

    invoke-static {p1, v4, p0}, LKi/r;->a(LKi/t;Lmh/a;Ldh/e;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcom/ui/sso/api/provider/a$s;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, Lcom/ui/sso/api/provider/a$s;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, Lcom/ui/sso/api/provider/a$s;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
