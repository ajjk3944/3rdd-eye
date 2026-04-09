.class final LOa/d$r;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LOa/d;->h(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;Ldh/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field final synthetic b:LOa/d;

.field final synthetic c:Ljava/util/UUID;

.field final synthetic d:Ljava/lang/String;

.field final synthetic e:Ljava/lang/String;


# direct methods
.method constructor <init>(LOa/d;Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;Ldh/e;)V
    .locals 0

    iput-object p1, p0, LOa/d$r;->b:LOa/d;

    iput-object p2, p0, LOa/d$r;->c:Ljava/util/UUID;

    iput-object p3, p0, LOa/d$r;->d:Ljava/lang/String;

    iput-object p4, p0, LOa/d$r;->e:Ljava/lang/String;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 6

    new-instance p1, LOa/d$r;

    iget-object v1, p0, LOa/d$r;->b:LOa/d;

    iget-object v2, p0, LOa/d$r;->c:Ljava/util/UUID;

    iget-object v3, p0, LOa/d$r;->d:Ljava/lang/String;

    iget-object v4, p0, LOa/d$r;->e:Ljava/lang/String;

    move-object v0, p1

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, LOa/d$r;-><init>(LOa/d;Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;Ldh/e;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIi/N;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, LOa/d$r;->n(LIi/N;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    iget v0, p0, LOa/d$r;->a:I

    if-nez v0, :cond_0

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LOa/d$r;->b:LOa/d;

    iget-object v0, p0, LOa/d$r;->c:Ljava/util/UUID;

    iget-object v1, p0, LOa/d$r;->d:Ljava/lang/String;

    iget-object v2, p0, LOa/d$r;->e:Ljava/lang/String;

    monitor-enter p1

    :try_start_0
    invoke-static {p1}, LOa/d;->k(LOa/d;)V

    invoke-static {p1, v0}, LOa/d;->o(LOa/d;Ljava/util/UUID;)LNa/b;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    invoke-static {p1}, LOa/d;->m(LOa/d;)Landroid/accounts/AccountManager;

    move-result-object v3

    invoke-virtual {p1, v0}, LOa/d;->z(LNa/b;)Landroid/accounts/Account;

    move-result-object v0

    invoke-virtual {v3, v0, v1, v2}, Landroid/accounts/AccountManager;->setAuthToken(Landroid/accounts/Account;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/SecurityException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    sget-object v0, LYg/J;->a:LYg/J;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit p1

    new-instance p1, LOa/d$r$b;

    iget-object v0, p0, LOa/d$r;->c:Ljava/util/UUID;

    iget-object v1, p0, LOa/d$r;->d:Ljava/lang/String;

    invoke-direct {p1, v0, v1}, LOa/d$r$b;-><init>(Ljava/util/UUID;Ljava/lang/String;)V

    invoke-static {p1}, LUa/a;->e(Lmh/a;)V

    iget-object p1, p0, LOa/d$r;->b:LOa/d;

    invoke-static {p1}, LOa/d;->n(LOa/d;)LOa/a;

    move-result-object p1

    iget-object v0, p0, LOa/d$r;->c:Ljava/util/UUID;

    invoke-interface {p1, v0}, LOa/a;->a(Ljava/util/UUID;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1

    :catchall_0
    move-exception v0

    goto :goto_0

    :catch_0
    move-exception v0

    :try_start_3
    sget-object v1, LOa/d$r$a;->a:LOa/d$r$a;

    invoke-static {v1, v0}, LUa/a;->f(Lmh/a;Ljava/lang/Throwable;)V

    new-instance v1, Lcom/ui/sso/account/UIAccountManager$Error$AccessRestricted;

    invoke-direct {v1, v0}, Lcom/ui/sso/account/UIAccountManager$Error$AccessRestricted;-><init>(Ljava/lang/SecurityException;)V

    throw v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :goto_0
    monitor-exit p1

    throw v0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string/jumbo v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final n(LIi/N;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LOa/d$r;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, LOa/d$r;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, LOa/d$r;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
