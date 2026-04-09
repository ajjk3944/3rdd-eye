.class final LOa/d$q;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LOa/d;->b(LNa/b;Ldh/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field final synthetic b:LOa/d;

.field final synthetic c:LNa/b;


# direct methods
.method constructor <init>(LOa/d;LNa/b;Ldh/e;)V
    .locals 0

    iput-object p1, p0, LOa/d$q;->b:LOa/d;

    iput-object p2, p0, LOa/d$q;->c:LNa/b;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 2

    new-instance p1, LOa/d$q;

    iget-object v0, p0, LOa/d$q;->b:LOa/d;

    iget-object v1, p0, LOa/d$q;->c:LNa/b;

    invoke-direct {p1, v0, v1, p2}, LOa/d$q;-><init>(LOa/d;LNa/b;Ldh/e;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIi/N;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, LOa/d$q;->n(LIi/N;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    iget v0, p0, LOa/d$q;->a:I

    if-nez v0, :cond_7

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LOa/d$q;->b:LOa/d;

    iget-object v0, p0, LOa/d$q;->c:LNa/b;

    monitor-enter p1

    :try_start_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    new-instance v3, LOa/d$q$a;

    invoke-direct {v3, v0}, LOa/d$q$a;-><init>(LNa/b;)V

    invoke-static {v3}, LUa/a;->e(Lmh/a;)V

    invoke-static {p1}, LOa/d;->k(LOa/d;)V

    invoke-static {p1}, LOa/d;->l(LOa/d;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v3, 0x0

    :try_start_1
    invoke-virtual {v0}, LNa/b;->c()Ljava/util/UUID;

    move-result-object v4

    invoke-static {p1, v4}, LOa/d;->o(LOa/d;Ljava/util/UUID;)LNa/b;

    move-result-object v4
    :try_end_1
    .catch Lcom/ui/sso/account/UIAccountManager$Error$NotFound; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto/16 :goto_3

    :catch_0
    move-object v4, v3

    :goto_0
    :try_start_2
    invoke-static {v4, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    new-instance v1, LOa/d$q$b;

    invoke-direct {v1, v0}, LOa/d$q$b;-><init>(LNa/b;)V

    invoke-static {v1}, LUa/a;->e(Lmh/a;)V

    sget-object v0, LYg/J;->a:LYg/J;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit p1

    return-object v0

    :cond_0
    if-eqz v4, :cond_1

    :try_start_3
    invoke-static {p1, v4}, LOa/d;->q(LOa/d;LNa/b;)Ljava/lang/String;

    move-result-object v5

    invoke-static {p1, v0}, LOa/d;->q(LOa/d;LNa/b;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_1

    const/4 v5, 0x1

    goto :goto_1

    :cond_1
    const/4 v5, 0x0

    :goto_1
    if-eqz v5, :cond_2

    new-instance v6, LOa/d$q$c;

    invoke-direct {v6, v0}, LOa/d$q$c;-><init>(LNa/b;)V

    invoke-static {v6}, LUa/a;->e(Lmh/a;)V

    :cond_2
    invoke-virtual {p1, v0}, LOa/d;->z(LNa/b;)Landroid/accounts/Account;

    move-result-object v6
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    if-eqz v4, :cond_3

    if-eqz v5, :cond_5

    :cond_3
    :try_start_4
    invoke-static {p1}, LOa/d;->m(LOa/d;)Landroid/accounts/AccountManager;

    move-result-object v7

    invoke-virtual {v7, v6, v3, v3}, Landroid/accounts/AccountManager;->addAccountExplicitly(Landroid/accounts/Account;Ljava/lang/String;Landroid/os/Bundle;)Z

    move-result v6
    :try_end_4
    .catch Ljava/lang/SecurityException; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    if-nez v6, :cond_5

    :try_start_5
    invoke-static {p1, v0}, LOa/d;->q(LOa/d;LNa/b;)Ljava/lang/String;

    move-result-object v6

    invoke-static {p1, v6}, LOa/d;->a(LOa/d;Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_4

    goto :goto_2

    :cond_4
    new-instance v0, Lcom/ui/sso/account/UIAccountManager$Error$IO;

    const-string/jumbo v1, "Failed to update system account"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v3, v2, v3}, Lcom/ui/sso/account/UIAccountManager$Error$IO;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw v0

    :cond_5
    :goto_2
    invoke-static {p1, v0}, LOa/d;->s(LOa/d;LNa/b;)V

    if-eqz v4, :cond_6

    if-eqz v5, :cond_6

    invoke-static {p1, v4, v0}, LOa/d;->r(LOa/d;LNa/b;LNa/b;)V

    :cond_6
    new-instance v3, LOa/d$q$e;

    invoke-direct {v3, v0, v1, v2}, LOa/d$q$e;-><init>(LNa/b;J)V

    invoke-static {v3}, LUa/a;->e(Lmh/a;)V

    sget-object v0, LYg/J;->a:LYg/J;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    monitor-exit p1

    iget-object p1, p0, LOa/d$q;->b:LOa/d;

    invoke-static {p1}, LOa/d;->n(LOa/d;)LOa/a;

    move-result-object p1

    invoke-interface {p1}, LOa/a;->b()V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1

    :catch_1
    move-exception v0

    :try_start_6
    sget-object v1, LOa/d$q$d;->a:LOa/d$q$d;

    invoke-static {v1, v0}, LUa/a;->f(Lmh/a;Ljava/lang/Throwable;)V

    new-instance v1, Lcom/ui/sso/account/UIAccountManager$Error$AccessRestricted;

    invoke-direct {v1, v0}, Lcom/ui/sso/account/UIAccountManager$Error$AccessRestricted;-><init>(Ljava/lang/SecurityException;)V

    throw v1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    :goto_3
    monitor-exit p1

    throw v0

    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string/jumbo v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final n(LIi/N;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LOa/d$q;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, LOa/d$q;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, LOa/d$q;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
