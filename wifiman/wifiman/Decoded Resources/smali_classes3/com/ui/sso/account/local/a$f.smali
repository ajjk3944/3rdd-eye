.class final Lcom/ui/sso/account/local/a$f;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/sso/account/local/a;->a(Landroid/content/Context;ZLdh/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field final synthetic b:Lcom/ui/sso/account/local/a;

.field final synthetic c:Landroid/content/Context;

.field final synthetic d:Z


# direct methods
.method constructor <init>(Lcom/ui/sso/account/local/a;Landroid/content/Context;ZLdh/e;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/sso/account/local/a$f;->b:Lcom/ui/sso/account/local/a;

    iput-object p2, p0, Lcom/ui/sso/account/local/a$f;->c:Landroid/content/Context;

    iput-boolean p3, p0, Lcom/ui/sso/account/local/a$f;->d:Z

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 3

    new-instance p1, Lcom/ui/sso/account/local/a$f;

    iget-object v0, p0, Lcom/ui/sso/account/local/a$f;->b:Lcom/ui/sso/account/local/a;

    iget-object v1, p0, Lcom/ui/sso/account/local/a$f;->c:Landroid/content/Context;

    iget-boolean v2, p0, Lcom/ui/sso/account/local/a$f;->d:Z

    invoke-direct {p1, v0, v1, v2, p2}, Lcom/ui/sso/account/local/a$f;-><init>(Lcom/ui/sso/account/local/a;Landroid/content/Context;ZLdh/e;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIi/N;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, Lcom/ui/sso/account/local/a$f;->n(LIi/N;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lcom/ui/sso/account/local/a$f;->a:I

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

    :try_start_0
    iget-object p1, p0, Lcom/ui/sso/account/local/a$f;->b:Lcom/ui/sso/account/local/a;

    iget-object v1, p0, Lcom/ui/sso/account/local/a$f;->c:Landroid/content/Context;

    invoke-virtual {p1, v1}, Lcom/ui/sso/account/local/a;->d(Landroid/content/Context;)Landroidx/security/crypto/b;

    move-result-object p1

    iget-object v1, p0, Lcom/ui/sso/account/local/a$f;->b:Lcom/ui/sso/account/local/a;

    iget-object v3, p0, Lcom/ui/sso/account/local/a$f;->c:Landroid/content/Context;

    invoke-virtual {v1, p1, v3}, Lcom/ui/sso/account/local/a;->c(Landroidx/security/crypto/b;Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object p1
    :try_end_0
    .catch Lcom/ui/sso/account/local/UiAccountSharedPrefProvider$Error; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    iget-boolean v1, p0, Lcom/ui/sso/account/local/a$f;->d:Z

    if-eqz v1, :cond_3

    iget-object p1, p0, Lcom/ui/sso/account/local/a$f;->b:Lcom/ui/sso/account/local/a;

    iget-object v1, p0, Lcom/ui/sso/account/local/a$f;->c:Landroid/content/Context;

    iput v2, p0, Lcom/ui/sso/account/local/a$f;->a:I

    const-string/jumbo v2, "ui_sso_local_storage"

    invoke-virtual {p1, v1, v2, p0}, Lcom/ui/sso/account/local/a;->b(Landroid/content/Context;Ljava/lang/String;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    iget-object p1, p0, Lcom/ui/sso/account/local/a$f;->b:Lcom/ui/sso/account/local/a;

    iget-object v0, p0, Lcom/ui/sso/account/local/a$f;->c:Landroid/content/Context;

    invoke-virtual {p1, v0}, Lcom/ui/sso/account/local/a;->d(Landroid/content/Context;)Landroidx/security/crypto/b;

    move-result-object p1

    iget-object v0, p0, Lcom/ui/sso/account/local/a$f;->b:Lcom/ui/sso/account/local/a;

    iget-object v1, p0, Lcom/ui/sso/account/local/a$f;->c:Landroid/content/Context;

    invoke-virtual {v0, p1, v1}, Lcom/ui/sso/account/local/a;->c(Landroidx/security/crypto/b;Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object p1

    return-object p1

    :cond_3
    throw p1
.end method

.method public final n(LIi/N;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/ui/sso/account/local/a$f;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, Lcom/ui/sso/account/local/a$f;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, Lcom/ui/sso/account/local/a$f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
