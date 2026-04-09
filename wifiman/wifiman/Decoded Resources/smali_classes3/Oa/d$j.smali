.class final LOa/d$j;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LOa/d;->i(Ljava/util/UUID;Ljava/lang/String;Ldh/e;)Ljava/lang/Object;
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


# direct methods
.method constructor <init>(LOa/d;Ljava/util/UUID;Ljava/lang/String;Ldh/e;)V
    .locals 0

    iput-object p1, p0, LOa/d$j;->b:LOa/d;

    iput-object p2, p0, LOa/d$j;->c:Ljava/util/UUID;

    iput-object p3, p0, LOa/d$j;->d:Ljava/lang/String;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 3

    new-instance p1, LOa/d$j;

    iget-object v0, p0, LOa/d$j;->b:LOa/d;

    iget-object v1, p0, LOa/d$j;->c:Ljava/util/UUID;

    iget-object v2, p0, LOa/d$j;->d:Ljava/lang/String;

    invoke-direct {p1, v0, v1, v2, p2}, LOa/d$j;-><init>(LOa/d;Ljava/util/UUID;Ljava/lang/String;Ldh/e;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIi/N;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, LOa/d$j;->n(LIi/N;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    iget v0, p0, LOa/d$j;->a:I

    if-nez v0, :cond_0

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LOa/d$j;->b:LOa/d;

    iget-object v0, p0, LOa/d$j;->c:Ljava/util/UUID;

    iget-object v1, p0, LOa/d$j;->d:Ljava/lang/String;

    monitor-enter p1

    :try_start_0
    invoke-static {p1}, LOa/d;->k(LOa/d;)V

    invoke-static {p1, v0}, LOa/d;->o(LOa/d;Ljava/util/UUID;)LNa/b;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    invoke-static {p1}, LOa/d;->m(LOa/d;)Landroid/accounts/AccountManager;

    move-result-object v2

    invoke-virtual {p1, v0}, LOa/d;->z(LNa/b;)Landroid/accounts/Account;

    move-result-object v0

    invoke-virtual {v2, v0, v1}, Landroid/accounts/AccountManager;->peekAuthToken(Landroid/accounts/Account;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0
    :try_end_1
    .catch Ljava/lang/SecurityException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p1

    return-object v0

    :catchall_0
    move-exception v0

    goto :goto_0

    :catch_0
    move-exception v0

    :try_start_2
    sget-object v1, LOa/d$j$a;->a:LOa/d$j$a;

    invoke-static {v1, v0}, LUa/a;->f(Lmh/a;Ljava/lang/Throwable;)V

    new-instance v1, Lcom/ui/sso/account/UIAccountManager$Error$AccessRestricted;

    invoke-direct {v1, v0}, Lcom/ui/sso/account/UIAccountManager$Error$AccessRestricted;-><init>(Ljava/lang/SecurityException;)V

    throw v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

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

    invoke-virtual {p0, p1, p2}, LOa/d$j;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, LOa/d$j;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, LOa/d$j;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
