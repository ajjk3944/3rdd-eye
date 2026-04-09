.class public final LOa/c;
.super Landroid/accounts/AbstractAccountAuthenticator;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LOa/c$a;
    }
.end annotation


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:LYg/m;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const-string/jumbo v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Landroid/accounts/AbstractAccountAuthenticator;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, LOa/c;->a:Landroid/content/Context;

    new-instance p1, LOa/c$d;

    invoke-direct {p1, p0}, LOa/c$d;-><init>(LOa/c;)V

    invoke-static {p1}, LYg/n;->b(Lmh/a;)LYg/m;

    move-result-object p1

    iput-object p1, p0, LOa/c;->b:LYg/m;

    return-void
.end method

.method private final a(Landroid/accounts/Account;)Z
    .locals 5

    sget-object v0, LOa/c$b;->a:LOa/c$b;

    invoke-static {v0}, LUa/a;->e(Lmh/a;)V

    iget-object v0, p0, LOa/c;->a:Landroid/content/Context;

    invoke-static {v0}, Landroid/accounts/AccountManager;->get(Landroid/content/Context;)Landroid/accounts/AccountManager;

    move-result-object v0

    iget-object v1, p1, Landroid/accounts/Account;->type:Ljava/lang/String;

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

    invoke-static {v4, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    return v2
.end method

.method private final b()Landroid/accounts/AccountManager;
    .locals 2

    iget-object v0, p0, LOa/c;->b:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    const-string/jumbo v1, "getValue(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/accounts/AccountManager;

    return-object v0
.end method


# virtual methods
.method public addAccount(Landroid/accounts/AccountAuthenticatorResponse;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;
    .locals 0

    sget-object p2, LOa/c$c;->a:LOa/c$c;

    invoke-static {p2}, LUa/a;->e(Lmh/a;)V

    new-instance p2, Landroid/os/Bundle;

    invoke-direct {p2}, Landroid/os/Bundle;-><init>()V

    sget-object p3, LMa/a;->a:LMa/a;

    invoke-virtual {p3}, LMa/a;->c()Lmh/q;

    move-result-object p3

    iget-object p4, p0, LOa/c;->a:Landroid/content/Context;

    const/4 p5, 0x0

    invoke-interface {p3, p4, p5, p5}, Lmh/q;->s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Landroid/content/Intent;

    const-string/jumbo p4, "accountAuthenticatorResponse"

    invoke-virtual {p3, p4, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    const-string/jumbo p1, "intent"

    invoke-virtual {p2, p1, p3}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    return-object p2
.end method

.method public final c()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, LOa/c;->a:Landroid/content/Context;

    return-object v0
.end method

.method public confirmCredentials(Landroid/accounts/AccountAuthenticatorResponse;Landroid/accounts/Account;Landroid/os/Bundle;)Landroid/os/Bundle;
    .locals 0

    sget-object p1, LOa/c$e;->a:LOa/c$e;

    invoke-static {p1}, LUa/a;->e(Lmh/a;)V

    sget-object p1, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    const-string/jumbo p2, "EMPTY"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public editProperties(Landroid/accounts/AccountAuthenticatorResponse;Ljava/lang/String;)Landroid/os/Bundle;
    .locals 0

    sget-object p1, LOa/c$f;->a:LOa/c$f;

    invoke-static {p1}, LUa/a;->e(Lmh/a;)V

    sget-object p1, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    const-string/jumbo p2, "EMPTY"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public getAuthToken(Landroid/accounts/AccountAuthenticatorResponse;Landroid/accounts/Account;Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;
    .locals 2

    sget-object p4, LOa/c$g;->a:LOa/c$g;

    invoke-static {p4}, LUa/a;->e(Lmh/a;)V

    new-instance p4, Landroid/os/Bundle;

    invoke-direct {p4}, Landroid/os/Bundle;-><init>()V

    if-eqz p2, :cond_1

    invoke-direct {p0, p2}, LOa/c;->a(Landroid/accounts/Account;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-direct {p0}, LOa/c;->b()Landroid/accounts/AccountManager;

    move-result-object v0

    invoke-virtual {v0, p2, p3}, Landroid/accounts/AccountManager;->peekAuthToken(Landroid/accounts/Account;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    if-eqz p3, :cond_0

    const-string/jumbo p1, "authAccount"

    iget-object v0, p2, Landroid/accounts/Account;->name:Ljava/lang/String;

    invoke-virtual {p4, p1, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string/jumbo p1, "accountType"

    iget-object p2, p2, Landroid/accounts/Account;->type:Ljava/lang/String;

    invoke-virtual {p4, p1, p2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string/jumbo p1, "authtoken"

    invoke-virtual {p4, p1, p3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    sget-object p3, LMa/a;->a:LMa/a;

    invoke-virtual {p3}, LMa/a;->c()Lmh/q;

    move-result-object p3

    iget-object v0, p0, LOa/c;->a:Landroid/content/Context;

    iget-object p2, p2, Landroid/accounts/Account;->name:Ljava/lang/String;

    const/4 v1, 0x0

    invoke-interface {p3, v0, p2, v1}, Lmh/q;->s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/content/Intent;

    const-string/jumbo p3, "accountAuthenticatorResponse"

    invoke-virtual {p2, p3, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    const-string/jumbo p1, "intent"

    invoke-virtual {p4, p1, p2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    goto :goto_0

    :cond_1
    sget-object p1, LOa/c$a;->ACCOUNT_NOT_EXIST:LOa/c$a;

    invoke-virtual {p1}, LOa/c$a;->getId()I

    move-result p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    const-string/jumbo p2, "errorCode"

    invoke-virtual {p4, p2, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string/jumbo p1, "errorMessage"

    const-string p2, "Account doesn\'t exist"

    invoke-virtual {p4, p1, p2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    return-object p4
.end method

.method public getAuthTokenLabel(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    sget-object v0, LOa/c$h;->a:LOa/c$h;

    invoke-static {v0}, LUa/a;->e(Lmh/a;)V

    sget-object v0, Lcom/ui/sso/auth/a$a;->UBIC:Lcom/ui/sso/auth/a$a;

    invoke-virtual {v0}, Lcom/ui/sso/auth/a$a;->getId()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    const-string/jumbo v0, "getString(...)"

    if-eqz p1, :cond_0

    iget-object p1, p0, LOa/c;->a:Landroid/content/Context;

    sget v1, LNa/a;->a:I

    invoke-virtual {p1, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, LOa/c;->a:Landroid/content/Context;

    sget v1, LNa/a;->b:I

    invoke-virtual {p1, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    return-object p1
.end method

.method public hasFeatures(Landroid/accounts/AccountAuthenticatorResponse;Landroid/accounts/Account;[Ljava/lang/String;)Landroid/os/Bundle;
    .locals 0

    sget-object p1, LOa/c$i;->a:LOa/c$i;

    invoke-static {p1}, LUa/a;->e(Lmh/a;)V

    sget-object p1, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    const-string/jumbo p2, "EMPTY"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public updateCredentials(Landroid/accounts/AccountAuthenticatorResponse;Landroid/accounts/Account;Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;
    .locals 0

    sget-object p1, LOa/c$j;->a:LOa/c$j;

    invoke-static {p1}, LUa/a;->e(Lmh/a;)V

    sget-object p1, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    const-string/jumbo p2, "EMPTY"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
