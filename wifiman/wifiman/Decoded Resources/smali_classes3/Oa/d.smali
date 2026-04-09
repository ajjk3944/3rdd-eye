.class public final LOa/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ui/sso/account/UIAccountManager;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LOa/d$a;,
        LOa/d$b;
    }
.end annotation


# static fields
.field public static final g:LOa/d$a;


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Landroid/accounts/AccountManager;

.field private final c:LOa/a;

.field private final d:LIi/J;

.field private final e:LNa/c;

.field private f:Lcom/ui/sso/account/UIAccountManager$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LOa/d$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LOa/d$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LOa/d;->g:LOa/d$a;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Landroid/accounts/AccountManager;LOa/a;LIi/J;)V
    .locals 1

    const-string/jumbo v0, "accountType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "accountManager"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "accountManagerChangeRegistry"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "dispatcherIO"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, LOa/d;->a:Ljava/lang/String;

    .line 3
    iput-object p2, p0, LOa/d;->b:Landroid/accounts/AccountManager;

    .line 4
    iput-object p3, p0, LOa/d;->c:LOa/a;

    .line 5
    iput-object p4, p0, LOa/d;->d:LIi/J;

    .line 6
    sget-object p1, LNa/c;->ANDROID:LNa/c;

    iput-object p1, p0, LOa/d;->e:LNa/c;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Landroid/accounts/AccountManager;LOa/a;LIi/J;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_0

    .line 7
    sget-object p3, LOa/a;->a:LOa/a$a;

    invoke-virtual {p3}, LOa/a$a;->a()LOa/a;

    move-result-object p3

    :cond_0
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_1

    .line 8
    invoke-static {}, LIi/c0;->b()LIi/J;

    move-result-object p4

    .line 9
    :cond_1
    invoke-direct {p0, p1, p2, p3, p4}, LOa/d;-><init>(Ljava/lang/String;Landroid/accounts/AccountManager;LOa/a;LIi/J;)V

    return-void
.end method

.method private final A(LNa/b;)Ljava/lang/String;
    .locals 0

    invoke-virtual {p1}, LNa/b;->b()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private final B(Landroid/accounts/Account;)LNa/b;
    .locals 7

    new-instance v0, LOa/d$k;

    invoke-direct {v0, p1}, LOa/d$k;-><init>(Landroid/accounts/Account;)V

    invoke-static {v0}, LUa/a;->e(Lmh/a;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    :try_start_0
    iget-object v2, p0, LOa/d;->b:Landroid/accounts/AccountManager;

    const-string/jumbo v3, "uuid"

    invoke-virtual {v2, p1, v3}, Landroid/accounts/AccountManager;->getUserData(Landroid/accounts/Account;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-static {v2}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v2
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    iget-object v3, p0, LOa/d;->b:Landroid/accounts/AccountManager;

    const-string/jumbo v4, "username"

    invoke-virtual {v3, p1, v4}, Landroid/accounts/AccountManager;->getUserData(Landroid/accounts/Account;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_1

    iget-object v4, p0, LOa/d;->b:Landroid/accounts/AccountManager;

    const-string/jumbo v5, "email"

    invoke-virtual {v4, p1, v5}, Landroid/accounts/AccountManager;->getUserData(Landroid/accounts/Account;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_0

    iget-object v5, p0, LOa/d;->b:Landroid/accounts/AccountManager;

    const-string/jumbo v6, "avatar"

    invoke-virtual {v5, p1, v6}, Landroid/accounts/AccountManager;->getUserData(Landroid/accounts/Account;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    new-instance v6, LNa/b;

    invoke-static {v2}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-direct {v6, v2, v4, v3, v5}, LNa/b;-><init>(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/SecurityException; {:try_start_1 .. :try_end_1} :catch_0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    sub-long/2addr v2, v0

    new-instance v0, LOa/d$l;

    invoke-direct {v0, p1, v2, v3}, LOa/d$l;-><init>(Landroid/accounts/Account;J)V

    invoke-static {v0}, LUa/a;->e(Lmh/a;)V

    return-object v6

    :catch_0
    move-exception p1

    goto :goto_0

    :cond_0
    :try_start_2
    new-instance p1, LOa/d$b;

    const-string/jumbo v0, "Email unavailable"

    invoke-direct {p1, v0}, LOa/d$b;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, LOa/d$b;

    const-string/jumbo v0, "Username unavailable"

    invoke-direct {p1, v0}, LOa/d$b;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_2
    .catch Ljava/lang/SecurityException; {:try_start_2 .. :try_end_2} :catch_0

    :cond_2
    :try_start_3
    new-instance p1, LOa/d$b;

    const-string/jumbo v0, "UUID unavailable"

    invoke-direct {p1, v0}, LOa/d$b;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_3
    .catch Ljava/lang/IllegalArgumentException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/lang/SecurityException; {:try_start_3 .. :try_end_3} :catch_0

    :catch_1
    :try_start_4
    new-instance p1, LOa/d$b;

    const-string/jumbo v0, "UUID format error"

    invoke-direct {p1, v0}, LOa/d$b;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_4
    .catch Ljava/lang/SecurityException; {:try_start_4 .. :try_end_4} :catch_0

    :goto_0
    new-instance v0, Lcom/ui/sso/account/UIAccountManager$Error$AccessRestricted;

    invoke-direct {v0, p1}, Lcom/ui/sso/account/UIAccountManager$Error$AccessRestricted;-><init>(Ljava/lang/SecurityException;)V

    throw v0
.end method

.method private final C(LNa/b;LNa/b;)V
    .locals 4

    invoke-virtual {p0, p1}, LOa/d;->z(LNa/b;)Landroid/accounts/Account;

    move-result-object p1

    invoke-virtual {p0, p2}, LOa/d;->z(LNa/b;)Landroid/accounts/Account;

    move-result-object p2

    invoke-static {}, Lcom/ui/sso/auth/a$a;->getEntries()Lfh/a;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ui/sso/auth/a$a;

    iget-object v2, p0, LOa/d;->b:Landroid/accounts/AccountManager;

    invoke-virtual {v1}, Lcom/ui/sso/auth/a$a;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, p1, v3}, Landroid/accounts/AccountManager;->peekAuthToken(Landroid/accounts/Account;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-static {v2}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    iget-object v3, p0, LOa/d;->b:Landroid/accounts/AccountManager;

    invoke-virtual {v1}, Lcom/ui/sso/auth/a$a;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, p2, v1, v2}, Landroid/accounts/AccountManager;->setAuthToken(Landroid/accounts/Account;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    iget-object p2, p0, LOa/d;->b:Landroid/accounts/AccountManager;

    invoke-virtual {p2, p1}, Landroid/accounts/AccountManager;->removeAccountExplicitly(Landroid/accounts/Account;)Z

    return-void
.end method

.method private final D(LNa/b;)V
    .locals 6

    invoke-virtual {p0, p1}, LOa/d;->z(LNa/b;)Landroid/accounts/Account;

    move-result-object v0

    new-instance v1, LOa/d$o;

    invoke-direct {v1, p1}, LOa/d$o;-><init>(LNa/b;)V

    invoke-static {v1}, LUa/a;->e(Lmh/a;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    :try_start_0
    iget-object v3, p0, LOa/d;->b:Landroid/accounts/AccountManager;

    const-string/jumbo v4, "uuid"

    invoke-virtual {p1}, LNa/b;->c()Ljava/util/UUID;

    move-result-object v5

    invoke-virtual {v5}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v0, v4, v5}, Landroid/accounts/AccountManager;->setUserData(Landroid/accounts/Account;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v3, p0, LOa/d;->b:Landroid/accounts/AccountManager;

    const-string/jumbo v4, "username"

    invoke-virtual {p1}, LNa/b;->d()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v0, v4, v5}, Landroid/accounts/AccountManager;->setUserData(Landroid/accounts/Account;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v3, p0, LOa/d;->b:Landroid/accounts/AccountManager;

    const-string/jumbo v4, "email"

    invoke-virtual {p1}, LNa/b;->b()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v0, v4, v5}, Landroid/accounts/AccountManager;->setUserData(Landroid/accounts/Account;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v3, p0, LOa/d;->b:Landroid/accounts/AccountManager;

    const-string/jumbo v4, "avatar"

    invoke-virtual {p1}, LNa/b;->a()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v0, v4, v5}, Landroid/accounts/AccountManager;->setUserData(Landroid/accounts/Account;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    sub-long/2addr v3, v1

    new-instance v0, LOa/d$p;

    invoke-direct {v0, p1, v3, v4}, LOa/d$p;-><init>(LNa/b;J)V

    invoke-static {v0}, LUa/a;->e(Lmh/a;)V

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lcom/ui/sso/account/UIAccountManager$Error$AccessRestricted;

    invoke-direct {v0, p1}, Lcom/ui/sso/account/UIAccountManager$Error$AccessRestricted;-><init>(Ljava/lang/SecurityException;)V

    throw v0
.end method

.method public static final synthetic a(LOa/d;Ljava/lang/String;)Z
    .locals 0

    invoke-direct {p0, p1}, LOa/d;->t(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic k(LOa/d;)V
    .locals 0

    invoke-direct {p0}, LOa/d;->u()V

    return-void
.end method

.method public static final synthetic l(LOa/d;)V
    .locals 0

    invoke-direct {p0}, LOa/d;->v()V

    return-void
.end method

.method public static final synthetic m(LOa/d;)Landroid/accounts/AccountManager;
    .locals 0

    iget-object p0, p0, LOa/d;->b:Landroid/accounts/AccountManager;

    return-object p0
.end method

.method public static final synthetic n(LOa/d;)LOa/a;
    .locals 0

    iget-object p0, p0, LOa/d;->c:LOa/a;

    return-object p0
.end method

.method public static final synthetic o(LOa/d;Ljava/util/UUID;)LNa/b;
    .locals 0

    invoke-direct {p0, p1}, LOa/d;->x(Ljava/util/UUID;)LNa/b;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic p(LOa/d;)Ljava/util/List;
    .locals 0

    invoke-direct {p0}, LOa/d;->y()Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic q(LOa/d;LNa/b;)Ljava/lang/String;
    .locals 0

    invoke-direct {p0, p1}, LOa/d;->A(LNa/b;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic r(LOa/d;LNa/b;LNa/b;)V
    .locals 0

    invoke-direct {p0, p1, p2}, LOa/d;->C(LNa/b;LNa/b;)V

    return-void
.end method

.method public static final synthetic s(LOa/d;LNa/b;)V
    .locals 0

    invoke-direct {p0, p1}, LOa/d;->D(LNa/b;)V

    return-void
.end method

.method private final t(Ljava/lang/String;)Z
    .locals 6

    iget-object v0, p0, LOa/d;->b:Landroid/accounts/AccountManager;

    iget-object v1, p0, LOa/d;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/accounts/AccountManager;->getAccountsByType(Ljava/lang/String;)[Landroid/accounts/Account;

    move-result-object v0

    const-string/jumbo v1, "getAccountsByType(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v1, v0

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_1

    aget-object v4, v0, v3

    iget-object v5, v4, Landroid/accounts/Account;->name:Ljava/lang/String;

    invoke-static {v5, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    :goto_1
    if-eqz v4, :cond_2

    const/4 v2, 0x1

    :cond_2
    return v2
.end method

.method private final u()V
    .locals 4

    :try_start_0
    iget-object v0, p0, LOa/d;->b:Landroid/accounts/AccountManager;

    new-instance v1, Landroid/accounts/Account;

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, LOa/d;->a:Ljava/lang/String;

    invoke-direct {v1, v2, v3}, Landroid/accounts/Account;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/accounts/AccountManager;->clearPassword(Landroid/accounts/Account;)V
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    new-instance v1, LOa/d$d;

    invoke-direct {v1, p0, v0}, LOa/d$d;-><init>(LOa/d;Ljava/lang/SecurityException;)V

    invoke-static {v1}, LUa/a;->e(Lmh/a;)V

    new-instance v1, Lcom/ui/sso/account/UIAccountManager$Error$AccessRestricted;

    invoke-direct {v1, v0}, Lcom/ui/sso/account/UIAccountManager$Error$AccessRestricted;-><init>(Ljava/lang/SecurityException;)V

    throw v1
.end method

.method private final v()V
    .locals 4

    sget-object v0, LOa/d$e;->a:LOa/d$e;

    invoke-static {v0}, LUa/a;->e(Lmh/a;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-direct {p0}, LOa/d;->y()Ljava/util/List;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    sub-long/2addr v2, v0

    new-instance v0, LOa/d$f;

    invoke-direct {v0, v2, v3}, LOa/d$f;-><init>(J)V

    invoke-static {v0}, LUa/a;->e(Lmh/a;)V

    return-void
.end method

.method private final x(Ljava/util/UUID;)LNa/b;
    .locals 3

    invoke-direct {p0}, LOa/d;->y()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, LNa/b;

    invoke-virtual {v2}, LNa/b;->c()Ljava/util/UUID;

    move-result-object v2

    invoke-static {v2, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    check-cast v1, LNa/b;

    if-eqz v1, :cond_2

    return-object v1

    :cond_2
    new-instance v0, Lcom/ui/sso/account/UIAccountManager$Error$NotFound;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "No Account "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " found "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/ui/sso/account/UIAccountManager$Error$NotFound;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private final y()Ljava/util/List;
    .locals 8

    invoke-static {}, LZg/v;->c()Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, LOa/d;->b:Landroid/accounts/AccountManager;

    iget-object v2, p0, LOa/d;->a:Ljava/lang/String;

    invoke-virtual {v1, v2}, Landroid/accounts/AccountManager;->getAccountsByType(Ljava/lang/String;)[Landroid/accounts/Account;

    move-result-object v1

    const-string/jumbo v2, "getAccountsByType(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v1, v3

    :try_start_0
    invoke-static {v4}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-direct {p0, v4}, LOa/d;->B(Landroid/accounts/Account;)LNa/b;

    move-result-object v5

    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch LOa/d$b; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    :try_start_1
    iget-object v5, p0, LOa/d;->b:Landroid/accounts/AccountManager;

    invoke-virtual {v5, v4}, Landroid/accounts/AccountManager;->removeAccountExplicitly(Landroid/accounts/Account;)Z

    move-result v5

    if-nez v5, :cond_0

    new-instance v5, LOa/d$h;

    invoke-direct {v5, v4}, LOa/d$h;-><init>(Landroid/accounts/Account;)V

    const/4 v6, 0x2

    const/4 v7, 0x0

    invoke-static {v5, v7, v6, v7}, LUa/a;->d(Lmh/a;Ljava/lang/Throwable;ILjava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v5

    new-instance v6, LOa/d$i;

    invoke-direct {v6, v4}, LOa/d$i;-><init>(Landroid/accounts/Account;)V

    invoke-static {v6, v5}, LUa/a;->c(Lmh/a;Ljava/lang/Throwable;)V

    :cond_0
    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    invoke-static {v0}, LZg/v;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public b(LNa/b;Ldh/e;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, LOa/d;->d:LIi/J;

    new-instance v1, LOa/d$q;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, LOa/d$q;-><init>(LOa/d;LNa/b;Ldh/e;)V

    invoke-static {v0, v1, p2}, LIi/i;->g(Ldh/i;Lmh/p;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public c(Ljava/util/UUID;Ldh/e;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, LOa/d;->d:LIi/J;

    new-instance v1, LOa/d$c;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, LOa/d$c;-><init>(LOa/d;Ljava/util/UUID;Ldh/e;)V

    invoke-static {v0, v1, p2}, LIi/i;->g(Ldh/i;Lmh/p;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public d()LNa/c;
    .locals 1

    iget-object v0, p0, LOa/d;->e:LNa/c;

    return-object v0
.end method

.method public e(Ldh/e;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, LOa/d;->d:LIi/J;

    new-instance v1, LOa/d$n;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, LOa/d$n;-><init>(LOa/d;Ldh/e;)V

    invoke-static {v0, v1, p1}, LIi/i;->g(Ldh/i;Lmh/p;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public f(Ldh/e;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, LOa/d;->d:LIi/J;

    new-instance v1, LOa/d$g;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, LOa/d$g;-><init>(LOa/d;Ldh/e;)V

    invoke-static {v0, v1, p1}, LIi/i;->g(Ldh/i;Lmh/p;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public g(Lcom/ui/sso/account/UIAccountManager$a;)V
    .locals 2

    if-eqz p1, :cond_0

    iget-object v0, p0, LOa/d;->c:LOa/a;

    invoke-interface {v0, p1}, LOa/a;->d(Lcom/ui/sso/account/UIAccountManager$a;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, LOa/d;->f:Lcom/ui/sso/account/UIAccountManager$a;

    if-eqz v0, :cond_1

    iget-object v1, p0, LOa/d;->c:LOa/a;

    invoke-interface {v1, v0}, LOa/a;->c(Lcom/ui/sso/account/UIAccountManager$a;)V

    :cond_1
    :goto_0
    iput-object p1, p0, LOa/d;->f:Lcom/ui/sso/account/UIAccountManager$a;

    return-void
.end method

.method public h(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;Ldh/e;)Ljava/lang/Object;
    .locals 8

    iget-object v0, p0, LOa/d;->d:LIi/J;

    new-instance v7, LOa/d$r;

    const/4 v6, 0x0

    move-object v1, v7

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    invoke-direct/range {v1 .. v6}, LOa/d$r;-><init>(LOa/d;Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;Ldh/e;)V

    invoke-static {v0, v7, p4}, LIi/i;->g(Ldh/i;Lmh/p;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public i(Ljava/util/UUID;Ljava/lang/String;Ldh/e;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, LOa/d;->d:LIi/J;

    new-instance v1, LOa/d$j;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, p2, v2}, LOa/d$j;-><init>(LOa/d;Ljava/util/UUID;Ljava/lang/String;Ldh/e;)V

    invoke-static {v0, v1, p3}, LIi/i;->g(Ldh/i;Lmh/p;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public j(Ljava/util/UUID;Ljava/lang/String;Ldh/e;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, LOa/d;->d:LIi/J;

    new-instance v1, LOa/d$m;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, p2, v2}, LOa/d$m;-><init>(LOa/d;Ljava/util/UUID;Ljava/lang/String;Ldh/e;)V

    invoke-static {v0, v1, p3}, LIi/i;->g(Ldh/i;Lmh/p;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public final w()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LOa/d;->a:Ljava/lang/String;

    return-object v0
.end method

.method public final z(LNa/b;)Landroid/accounts/Account;
    .locals 2

    const-string/jumbo v0, "acc"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Landroid/accounts/Account;

    invoke-direct {p0, p1}, LOa/d;->A(LNa/b;)Ljava/lang/String;

    move-result-object p1

    iget-object v1, p0, LOa/d;->a:Ljava/lang/String;

    invoke-direct {v0, p1, v1}, Landroid/accounts/Account;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method
