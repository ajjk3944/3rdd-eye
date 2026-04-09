.class public final LRa/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ui/sso/api/UiAccountApi;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LRa/a$b;
    }
.end annotation


# instance fields
.field private final a:Lcom/ui/sso/api/UiAccountApi$c;

.field private final b:Lcom/ui/sso/api/UiAccountApi$d;

.field private final c:Lcom/ui/sso/account/UIAccountManager;

.field private final d:LTa/d;

.field private final e:Lcom/ui/sso/auth/UiAuthSerializer;

.field private final f:LLi/g;

.field private final g:LLi/g;

.field private final h:LLi/g;


# direct methods
.method public constructor <init>(Lcom/ui/sso/api/UiAccountApi$c;Lcom/ui/sso/api/UiAccountApi$d;Lcom/ui/sso/account/UIAccountManager;LTa/d;Lcom/ui/sso/auth/UiAuthSerializer;LIi/J;LIi/N;)V
    .locals 8

    const-string/jumbo v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "supportFile"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "accountManager"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "deviceIdentifiersService"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "authSerializer"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "dispatcherDefault"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "externalScope"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LRa/a;->a:Lcom/ui/sso/api/UiAccountApi$c;

    iput-object p2, p0, LRa/a;->b:Lcom/ui/sso/api/UiAccountApi$d;

    iput-object p3, p0, LRa/a;->c:Lcom/ui/sso/account/UIAccountManager;

    iput-object p4, p0, LRa/a;->d:LTa/d;

    iput-object p5, p0, LRa/a;->e:Lcom/ui/sso/auth/UiAuthSerializer;

    new-instance p1, LRa/a$a;

    invoke-direct {p1, p0}, LRa/a$a;-><init>(LRa/a;)V

    invoke-static {p1}, LUa/a;->e(Lmh/a;)V

    new-instance p1, LRa/a$h;

    const/4 p2, 0x0

    invoke-direct {p1, p0, p2}, LRa/a$h;-><init>(LRa/a;Ldh/e;)V

    invoke-static {p1}, LLi/i;->e(Lmh/p;)LLi/g;

    move-result-object p1

    invoke-static {p1, p6}, LLi/i;->C(LLi/g;Ldh/i;)LLi/g;

    move-result-object v0

    sget-object p1, LLi/J;->a:LLi/J$a;

    const/4 v6, 0x3

    const/4 v7, 0x0

    const-wide/16 v2, 0x0

    const-wide/16 v4, 0x0

    move-object v1, p1

    invoke-static/range {v1 .. v7}, LLi/J$a;->b(LLi/J$a;JJILjava/lang/Object;)LLi/J;

    move-result-object v2

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v3, 0x0

    move-object v1, p7

    invoke-static/range {v0 .. v5}, LLi/i;->L(LLi/g;LIi/N;LLi/J;IILjava/lang/Object;)LLi/D;

    move-result-object p3

    iput-object p3, p0, LRa/a;->f:LLi/g;

    new-instance p4, LRa/a$c;

    invoke-direct {p4, p2}, LRa/a$c;-><init>(Ldh/e;)V

    invoke-static {p3, p4}, LLi/i;->J(LLi/g;Lmh/p;)LLi/g;

    move-result-object p4

    new-instance p5, LRa/a$i;

    invoke-direct {p5, p4}, LRa/a$i;-><init>(LLi/g;)V

    new-instance p4, LRa/a$d;

    invoke-direct {p4, p0, p2}, LRa/a$d;-><init>(LRa/a;Ldh/e;)V

    invoke-static {p5, p4}, LLi/i;->E(LLi/g;Lmh/p;)LLi/g;

    move-result-object p2

    invoke-static {p2}, LLi/i;->n(LLi/g;)LLi/g;

    move-result-object p2

    invoke-static {p2, p6}, LLi/i;->C(LLi/g;Ldh/i;)LLi/g;

    move-result-object p2

    const-wide/16 v2, 0x0

    const-wide/16 v4, 0x0

    move-object v1, p1

    invoke-static/range {v1 .. v7}, LLi/J$a;->b(LLi/J$a;JJILjava/lang/Object;)LLi/J;

    move-result-object p4

    const/4 p5, 0x1

    invoke-static {p2, p7, p4, p5}, LWa/c;->a(LLi/g;LIi/N;LLi/J;I)LLi/g;

    move-result-object p2

    iput-object p2, p0, LRa/a;->g:LLi/g;

    new-instance p2, LRa/a$j;

    invoke-direct {p2, p3}, LRa/a$j;-><init>(LLi/g;)V

    new-instance p3, LRa/a$k;

    invoke-direct {p3, p2}, LRa/a$k;-><init>(LLi/g;)V

    invoke-static {p3, p6}, LLi/i;->C(LLi/g;Ldh/i;)LLi/g;

    move-result-object v0

    invoke-static/range {v1 .. v7}, LLi/J$a;->b(LLi/J$a;JJILjava/lang/Object;)LLi/J;

    move-result-object v2

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v3, 0x0

    move-object v1, p7

    invoke-static/range {v0 .. v5}, LWa/c;->b(LLi/g;LIi/N;LLi/J;IILjava/lang/Object;)LLi/g;

    move-result-object p1

    iput-object p1, p0, LRa/a;->h:LLi/g;

    return-void
.end method

.method public static final synthetic j(LRa/a;)Lcom/ui/sso/account/UIAccountManager;
    .locals 0

    iget-object p0, p0, LRa/a;->c:Lcom/ui/sso/account/UIAccountManager;

    return-object p0
.end method

.method private final k(Lcom/ui/sso/account/UIAccountManager$Error;Ljava/lang/String;)Lcom/ui/sso/api/UiAccountApi$Error;
    .locals 3

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ": "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    move-object p2, v0

    :cond_1
    :goto_0
    instance-of v0, p1, Lcom/ui/sso/account/UIAccountManager$Error$AccessRestricted;

    if-eqz v0, :cond_2

    new-instance p1, Lcom/ui/sso/api/UiAccountApi$Error$AccountManager$AccessRestricted;

    invoke-direct {p1, p2}, Lcom/ui/sso/api/UiAccountApi$Error$AccountManager$AccessRestricted;-><init>(Ljava/lang/String;)V

    goto :goto_1

    :cond_2
    instance-of v0, p1, Lcom/ui/sso/account/UIAccountManager$Error$NotFound;

    if-eqz v0, :cond_3

    new-instance p1, Lcom/ui/sso/api/UiAccountApi$Error$AccountManager$AccountNotFound;

    invoke-direct {p1, p2}, Lcom/ui/sso/api/UiAccountApi$Error$AccountManager$AccountNotFound;-><init>(Ljava/lang/String;)V

    goto :goto_1

    :cond_3
    instance-of p1, p1, Lcom/ui/sso/account/UIAccountManager$Error$IO;

    if-eqz p1, :cond_4

    new-instance p1, Lcom/ui/sso/api/UiAccountApi$Error$AccountManager$IO;

    invoke-direct {p1, p2}, Lcom/ui/sso/api/UiAccountApi$Error$AccountManager$IO;-><init>(Ljava/lang/String;)V

    :goto_1
    return-object p1

    :cond_4
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method


# virtual methods
.method public a()LLi/g;
    .locals 1

    iget-object v0, p0, LRa/a;->g:LLi/g;

    return-object v0
.end method

.method public b(LNa/b;Ldh/e;)Ljava/lang/Object;
    .locals 7

    instance-of v0, p2, LRa/a$l;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, LRa/a$l;

    iget v1, v0, LRa/a$l;->d:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LRa/a$l;->d:I

    goto :goto_0

    :cond_0
    new-instance v0, LRa/a$l;

    invoke-direct {v0, p0, p2}, LRa/a$l;-><init>(LRa/a;Ldh/e;)V

    :goto_0
    iget-object p2, v0, LRa/a$l;->b:Ljava/lang/Object;

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LRa/a$l;->d:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, LRa/a$l;->a:Ljava/lang/Object;

    check-cast p1, LRa/a;

    :try_start_0
    invoke-static {p2}, LYg/v;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Lcom/ui/sso/account/UIAccountManager$Error; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p2

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string/jumbo p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, LYg/v;->b(Ljava/lang/Object;)V

    :try_start_1
    iget-object p2, p0, LRa/a;->c:Lcom/ui/sso/account/UIAccountManager;

    invoke-virtual {p1}, LNa/b;->c()Ljava/util/UUID;

    move-result-object v2

    invoke-virtual {p1}, LNa/b;->d()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, LNa/b;->b()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1}, LNa/b;->a()Ljava/lang/String;

    move-result-object p1

    new-instance v6, LNa/b;

    invoke-direct {v6, v2, v5, v4, p1}, LNa/b;-><init>(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iput-object p0, v0, LRa/a$l;->a:Ljava/lang/Object;

    iput v3, v0, LRa/a$l;->d:I

    invoke-interface {p2, v6, v0}, Lcom/ui/sso/account/UIAccountManager;->b(LNa/b;Ldh/e;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catch Lcom/ui/sso/account/UIAccountManager$Error; {:try_start_1 .. :try_end_1} :catch_1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1

    :catch_1
    move-exception p2

    move-object p1, p0

    :goto_2
    const-string/jumbo v0, "Failed create an account"

    invoke-direct {p1, p2, v0}, LRa/a;->k(Lcom/ui/sso/account/UIAccountManager$Error;Ljava/lang/String;)Lcom/ui/sso/api/UiAccountApi$Error;

    move-result-object p1

    throw p1
.end method

.method public c(Ljava/util/UUID;Ldh/e;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p2, LRa/a$e;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, LRa/a$e;

    iget v1, v0, LRa/a$e;->d:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LRa/a$e;->d:I

    goto :goto_0

    :cond_0
    new-instance v0, LRa/a$e;

    invoke-direct {v0, p0, p2}, LRa/a$e;-><init>(LRa/a;Ldh/e;)V

    :goto_0
    iget-object p2, v0, LRa/a$e;->b:Ljava/lang/Object;

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LRa/a$e;->d:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, LRa/a$e;->a:Ljava/lang/Object;

    check-cast p1, LRa/a;

    :try_start_0
    invoke-static {p2}, LYg/v;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Lcom/ui/sso/account/UIAccountManager$Error; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p2

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string/jumbo p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, LYg/v;->b(Ljava/lang/Object;)V

    :try_start_1
    iget-object p2, p0, LRa/a;->c:Lcom/ui/sso/account/UIAccountManager;

    iput-object p0, v0, LRa/a$e;->a:Ljava/lang/Object;

    iput v3, v0, LRa/a$e;->d:I

    invoke-interface {p2, p1, v0}, Lcom/ui/sso/account/UIAccountManager;->c(Ljava/util/UUID;Ldh/e;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catch Lcom/ui/sso/account/UIAccountManager$Error; {:try_start_1 .. :try_end_1} :catch_1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1

    :catch_1
    move-exception p2

    move-object p1, p0

    :goto_2
    const-string/jumbo v0, "Failed delete an account"

    invoke-direct {p1, p2, v0}, LRa/a;->k(Lcom/ui/sso/account/UIAccountManager$Error;Ljava/lang/String;)Lcom/ui/sso/api/UiAccountApi$Error;

    move-result-object p1

    throw p1
.end method

.method public d(Ljava/util/UUID;Lcom/ui/sso/auth/a$a;Ldh/e;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p3, LRa/a$g;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, LRa/a$g;

    iget v1, v0, LRa/a$g;->d:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LRa/a$g;->d:I

    goto :goto_0

    :cond_0
    new-instance v0, LRa/a$g;

    invoke-direct {v0, p0, p3}, LRa/a$g;-><init>(LRa/a;Ldh/e;)V

    :goto_0
    iget-object p3, v0, LRa/a$g;->b:Ljava/lang/Object;

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LRa/a$g;->d:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, LRa/a$g;->a:Ljava/lang/Object;

    check-cast p1, LRa/a;

    :try_start_0
    invoke-static {p3}, LYg/v;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Lcom/ui/sso/account/UIAccountManager$Error; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p2

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string/jumbo p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, LYg/v;->b(Ljava/lang/Object;)V

    :try_start_1
    iget-object p3, p0, LRa/a;->c:Lcom/ui/sso/account/UIAccountManager;

    invoke-virtual {p2}, Lcom/ui/sso/auth/a$a;->getId()Ljava/lang/String;

    move-result-object p2

    iput-object p0, v0, LRa/a$g;->a:Ljava/lang/Object;

    iput v3, v0, LRa/a$g;->d:I

    invoke-interface {p3, p1, p2, v0}, Lcom/ui/sso/account/UIAccountManager;->j(Ljava/util/UUID;Ljava/lang/String;Ldh/e;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catch Lcom/ui/sso/account/UIAccountManager$Error; {:try_start_1 .. :try_end_1} :catch_1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1

    :catch_1
    move-exception p2

    move-object p1, p0

    :goto_2
    const-string/jumbo p3, "Failed to invalidate Auth token"

    invoke-direct {p1, p2, p3}, LRa/a;->k(Lcom/ui/sso/account/UIAccountManager$Error;Ljava/lang/String;)Lcom/ui/sso/api/UiAccountApi$Error;

    move-result-object p1

    throw p1
.end method

.method public e(Ljava/util/UUID;Lcom/ui/sso/auth/a$a;Ldh/e;)Ljava/lang/Object;
    .locals 5

    instance-of v0, p3, LRa/a$f;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, LRa/a$f;

    iget v1, v0, LRa/a$f;->e:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LRa/a$f;->e:I

    goto :goto_0

    :cond_0
    new-instance v0, LRa/a$f;

    invoke-direct {v0, p0, p3}, LRa/a$f;-><init>(LRa/a;Ldh/e;)V

    :goto_0
    iget-object p3, v0, LRa/a$f;->c:Ljava/lang/Object;

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LRa/a$f;->e:I

    const-string/jumbo v3, "Failed to get Auth token"

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v4, :cond_1

    iget-object p1, v0, LRa/a$f;->b:Ljava/lang/Object;

    move-object p2, p1

    check-cast p2, Lcom/ui/sso/auth/a$a;

    iget-object p1, v0, LRa/a$f;->a:Ljava/lang/Object;

    check-cast p1, LRa/a;

    :try_start_0
    invoke-static {p3}, LYg/v;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Lcom/ui/sso/account/UIAccountManager$Error; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lcom/ui/sso/auth/UiAuthSerializer$Error; {:try_start_0 .. :try_end_0} :catch_2

    goto :goto_1

    :catch_0
    move-exception p2

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string/jumbo p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, LYg/v;->b(Ljava/lang/Object;)V

    :try_start_1
    iget-object p3, p0, LRa/a;->c:Lcom/ui/sso/account/UIAccountManager;

    invoke-virtual {p2}, Lcom/ui/sso/auth/a$a;->getId()Ljava/lang/String;

    move-result-object v2

    iput-object p0, v0, LRa/a$f;->a:Ljava/lang/Object;

    iput-object p2, v0, LRa/a$f;->b:Ljava/lang/Object;

    iput v4, v0, LRa/a$f;->e:I

    invoke-interface {p3, p1, v2, v0}, Lcom/ui/sso/account/UIAccountManager;->i(Ljava/util/UUID;Ljava/lang/String;Ldh/e;)Ljava/lang/Object;

    move-result-object p3
    :try_end_1
    .catch Lcom/ui/sso/account/UIAccountManager$Error; {:try_start_1 .. :try_end_1} :catch_1
    .catch Lcom/ui/sso/auth/UiAuthSerializer$Error; {:try_start_1 .. :try_end_1} :catch_2

    if-ne p3, v1, :cond_3

    return-object v1

    :cond_3
    move-object p1, p0

    :goto_1
    :try_start_2
    check-cast p3, Ljava/lang/String;

    if-eqz p3, :cond_4

    iget-object v0, p1, LRa/a;->e:Lcom/ui/sso/auth/UiAuthSerializer;

    invoke-interface {v0, p3, p2}, Lcom/ui/sso/auth/UiAuthSerializer;->b(Ljava/lang/String;Lcom/ui/sso/auth/a$a;)Lcom/ui/sso/auth/a;

    move-result-object p1
    :try_end_2
    .catch Lcom/ui/sso/account/UIAccountManager$Error; {:try_start_2 .. :try_end_2} :catch_0
    .catch Lcom/ui/sso/auth/UiAuthSerializer$Error; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_2

    :cond_4
    const/4 p1, 0x0

    :goto_2
    return-object p1

    :catch_1
    move-exception p2

    move-object p1, p0

    goto :goto_3

    :catch_2
    new-instance p1, Lcom/ui/sso/api/UiAccountApi$Error$AccountManager$IO;

    invoke-direct {p1, v3}, Lcom/ui/sso/api/UiAccountApi$Error$AccountManager$IO;-><init>(Ljava/lang/String;)V

    throw p1

    :goto_3
    invoke-direct {p1, p2, v3}, LRa/a;->k(Lcom/ui/sso/account/UIAccountManager$Error;Ljava/lang/String;)Lcom/ui/sso/api/UiAccountApi$Error;

    move-result-object p1

    throw p1
.end method

.method public f()LLi/g;
    .locals 1

    iget-object v0, p0, LRa/a;->h:LLi/g;

    return-object v0
.end method

.method public g(Ljava/util/UUID;Lcom/ui/sso/auth/a;Ldh/e;)Ljava/lang/Object;
    .locals 5

    instance-of v0, p3, LRa/a$m;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, LRa/a$m;

    iget v1, v0, LRa/a$m;->d:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LRa/a$m;->d:I

    goto :goto_0

    :cond_0
    new-instance v0, LRa/a$m;

    invoke-direct {v0, p0, p3}, LRa/a$m;-><init>(LRa/a;Ldh/e;)V

    :goto_0
    iget-object p3, v0, LRa/a$m;->b:Ljava/lang/Object;

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LRa/a$m;->d:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, LRa/a$m;->a:Ljava/lang/Object;

    check-cast p1, LRa/a;

    :try_start_0
    invoke-static {p3}, LYg/v;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Lcom/ui/sso/account/UIAccountManager$Error; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p2

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string/jumbo p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, LYg/v;->b(Ljava/lang/Object;)V

    :try_start_1
    iget-object p3, p0, LRa/a;->c:Lcom/ui/sso/account/UIAccountManager;

    invoke-virtual {p2}, Lcom/ui/sso/auth/a;->b()Lcom/ui/sso/auth/a$a;

    move-result-object v2

    invoke-virtual {v2}, Lcom/ui/sso/auth/a$a;->getId()Ljava/lang/String;

    move-result-object v2

    iget-object v4, p0, LRa/a;->e:Lcom/ui/sso/auth/UiAuthSerializer;

    invoke-interface {v4, p2}, Lcom/ui/sso/auth/UiAuthSerializer;->a(Lcom/ui/sso/auth/a;)Ljava/lang/String;

    move-result-object p2

    iput-object p0, v0, LRa/a$m;->a:Ljava/lang/Object;

    iput v3, v0, LRa/a$m;->d:I

    invoke-interface {p3, p1, v2, p2, v0}, Lcom/ui/sso/account/UIAccountManager;->h(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;Ldh/e;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catch Lcom/ui/sso/account/UIAccountManager$Error; {:try_start_1 .. :try_end_1} :catch_1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1

    :catch_1
    move-exception p2

    move-object p1, p0

    :goto_2
    const-string/jumbo p3, "Failed to update Auth token"

    invoke-direct {p1, p2, p3}, LRa/a;->k(Lcom/ui/sso/account/UIAccountManager$Error;Ljava/lang/String;)Lcom/ui/sso/api/UiAccountApi$Error;

    move-result-object p1

    throw p1
.end method

.method public getState()Lcom/ui/sso/api/UiAccountApi$c;
    .locals 1

    iget-object v0, p0, LRa/a;->a:Lcom/ui/sso/api/UiAccountApi$c;

    return-object v0
.end method

.method public h(Ldh/e;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LRa/a;->d:LTa/d;

    invoke-interface {v0, p1}, LTa/d;->a(Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public i()Lcom/ui/sso/api/UiAccountApi$d;
    .locals 1

    iget-object v0, p0, LRa/a;->b:Lcom/ui/sso/api/UiAccountApi$d;

    return-object v0
.end method
