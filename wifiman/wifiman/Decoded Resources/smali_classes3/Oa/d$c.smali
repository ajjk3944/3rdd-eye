.class final LOa/d$c;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LOa/d;->c(Ljava/util/UUID;Ldh/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field final synthetic b:LOa/d;

.field final synthetic c:Ljava/util/UUID;


# direct methods
.method constructor <init>(LOa/d;Ljava/util/UUID;Ldh/e;)V
    .locals 0

    iput-object p1, p0, LOa/d$c;->b:LOa/d;

    iput-object p2, p0, LOa/d$c;->c:Ljava/util/UUID;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 2

    new-instance p1, LOa/d$c;

    iget-object v0, p0, LOa/d$c;->b:LOa/d;

    iget-object v1, p0, LOa/d$c;->c:Ljava/util/UUID;

    invoke-direct {p1, v0, v1, p2}, LOa/d$c;-><init>(LOa/d;Ljava/util/UUID;Ldh/e;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIi/N;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, LOa/d$c;->n(LIi/N;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    iget v0, p0, LOa/d$c;->a:I

    if-nez v0, :cond_2

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LOa/d$c;->b:LOa/d;

    iget-object v0, p0, LOa/d$c;->c:Ljava/util/UUID;

    monitor-enter p1

    :try_start_0
    invoke-static {p1}, LOa/d;->k(LOa/d;)V

    invoke-static {p1, v0}, LOa/d;->o(LOa/d;Ljava/util/UUID;)LNa/b;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    invoke-static {p1}, LOa/d;->m(LOa/d;)Landroid/accounts/AccountManager;

    move-result-object v1

    invoke-virtual {p1, v0}, LOa/d;->z(LNa/b;)Landroid/accounts/Account;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/accounts/AccountManager;->removeAccountExplicitly(Landroid/accounts/Account;)Z

    move-result v1
    :try_end_1
    .catch Ljava/lang/SecurityException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez v1, :cond_1

    :try_start_2
    invoke-static {p1, v0}, LOa/d;->q(LOa/d;LNa/b;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, LOa/d;->a(LOa/d;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/ui/sso/account/UIAccountManager$Error$IO;

    const-string/jumbo v1, "Failed to delete system account"

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-direct {v0, v1, v3, v2, v3}, Lcom/ui/sso/account/UIAccountManager$Error$IO;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw v0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    :goto_0
    sget-object v0, LYg/J;->a:LYg/J;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit p1

    iget-object p1, p0, LOa/d$c;->b:LOa/d;

    invoke-static {p1}, LOa/d;->n(LOa/d;)LOa/a;

    move-result-object p1

    invoke-interface {p1}, LOa/a;->b()V

    iget-object p1, p0, LOa/d$c;->b:LOa/d;

    invoke-static {p1}, LOa/d;->n(LOa/d;)LOa/a;

    move-result-object p1

    iget-object v0, p0, LOa/d$c;->c:Ljava/util/UUID;

    invoke-interface {p1, v0}, LOa/a;->a(Ljava/util/UUID;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1

    :catch_0
    move-exception v0

    :try_start_3
    sget-object v1, LOa/d$c$a;->a:LOa/d$c$a;

    invoke-static {v1, v0}, LUa/a;->f(Lmh/a;Ljava/lang/Throwable;)V

    new-instance v1, Lcom/ui/sso/account/UIAccountManager$Error$AccessRestricted;

    invoke-direct {v1, v0}, Lcom/ui/sso/account/UIAccountManager$Error$AccessRestricted;-><init>(Ljava/lang/SecurityException;)V

    throw v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :goto_1
    monitor-exit p1

    throw v0

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string/jumbo v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final n(LIi/N;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LOa/d$c;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, LOa/d$c;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, LOa/d$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
