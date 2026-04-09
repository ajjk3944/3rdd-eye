.class public final Lcom/ui/sso/account/local/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ui/sso/account/local/UiAccountSharedPrefProvider;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ui/sso/account/local/a$a;
    }
.end annotation


# static fields
.field public static final b:Lcom/ui/sso/account/local/a$a;


# instance fields
.field private final a:LIi/J;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/ui/sso/account/local/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ui/sso/account/local/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/ui/sso/account/local/a;->b:Lcom/ui/sso/account/local/a$a;

    return-void
.end method

.method public constructor <init>(LIi/J;)V
    .locals 1

    const-string/jumbo v0, "dispatcherIO"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ui/sso/account/local/a;->a:LIi/J;

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;ZLdh/e;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lcom/ui/sso/account/local/a;->a:LIi/J;

    new-instance v1, Lcom/ui/sso/account/local/a$f;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, p2, v2}, Lcom/ui/sso/account/local/a$f;-><init>(Lcom/ui/sso/account/local/a;Landroid/content/Context;ZLdh/e;)V

    invoke-static {v0, v1, p3}, LIi/i;->g(Ldh/i;Lmh/p;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final b(Landroid/content/Context;Ljava/lang/String;Ldh/e;)Ljava/lang/Object;
    .locals 7

    instance-of v0, p3, Lcom/ui/sso/account/local/a$b;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lcom/ui/sso/account/local/a$b;

    iget v1, v0, Lcom/ui/sso/account/local/a$b;->d:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/ui/sso/account/local/a$b;->d:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/ui/sso/account/local/a$b;

    invoke-direct {v0, p0, p3}, Lcom/ui/sso/account/local/a$b;-><init>(Lcom/ui/sso/account/local/a;Ldh/e;)V

    :goto_0
    iget-object p3, v0, Lcom/ui/sso/account/local/a$b;->b:Ljava/lang/Object;

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/ui/sso/account/local/a$b;->d:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-wide p1, v0, Lcom/ui/sso/account/local/a$b;->a:J

    invoke-static {p3}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string/jumbo p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, LYg/v;->b(Ljava/lang/Object;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    sget-object p3, Lcom/ui/sso/account/local/a$c;->a:Lcom/ui/sso/account/local/a$c;

    invoke-static {p3}, LUa/a;->e(Lmh/a;)V

    iget-object p3, p0, Lcom/ui/sso/account/local/a;->a:LIi/J;

    new-instance v2, Lcom/ui/sso/account/local/a$d;

    const/4 v6, 0x0

    invoke-direct {v2, p1, p2, v6}, Lcom/ui/sso/account/local/a$d;-><init>(Landroid/content/Context;Ljava/lang/String;Ldh/e;)V

    iput-wide v4, v0, Lcom/ui/sso/account/local/a$b;->a:J

    iput v3, v0, Lcom/ui/sso/account/local/a$b;->d:I

    invoke-static {p3, v2, v0}, LIi/i;->g(Ldh/i;Lmh/p;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    move-wide p1, v4

    :goto_1
    new-instance p3, Lcom/ui/sso/account/local/a$e;

    invoke-direct {p3, p1, p2}, Lcom/ui/sso/account/local/a$e;-><init>(J)V

    invoke-static {p3}, LUa/a;->e(Lmh/a;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public final c(Landroidx/security/crypto/b;Landroid/content/Context;)Landroid/content/SharedPreferences;
    .locals 3

    const-string/jumbo v0, "masterKey"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "context"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    const-string/jumbo v0, "ui_sso_local_storage"

    sget-object v1, Landroidx/security/crypto/a$d;->AES256_SIV:Landroidx/security/crypto/a$d;

    sget-object v2, Landroidx/security/crypto/a$e;->AES256_GCM:Landroidx/security/crypto/a$e;

    invoke-static {p2, v0, p1, v1, v2}, Landroidx/security/crypto/a;->a(Landroid/content/Context;Ljava/lang/String;Landroidx/security/crypto/b;Landroidx/security/crypto/a$d;Landroidx/security/crypto/a$e;)Landroid/content/SharedPreferences;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    goto :goto_1

    :goto_0
    new-instance p2, Lcom/ui/sso/account/local/UiAccountSharedPrefProvider$Error;

    const-string/jumbo v0, "fileName can not be used"

    invoke-direct {p2, v0, p1}, Lcom/ui/sso/account/local/UiAccountSharedPrefProvider$Error;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2

    :goto_1
    new-instance p2, Lcom/ui/sso/account/local/UiAccountSharedPrefProvider$Error;

    const-string/jumbo v0, "a bad master key or key set has been attempted"

    invoke-direct {p2, v0, p1}, Lcom/ui/sso/account/local/UiAccountSharedPrefProvider$Error;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2
.end method

.method public final d(Landroid/content/Context;)Landroidx/security/crypto/b;
    .locals 3

    const-string/jumbo v0, "KeyStore master key build failed"

    const-string/jumbo v1, "context"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    new-instance v1, Landroidx/security/crypto/b$b;

    const-string/jumbo v2, "_com_ui_sso_local_storage_"

    invoke-direct {v1, p1, v2}, Landroidx/security/crypto/b$b;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    sget-object p1, Landroidx/security/crypto/b$c;->AES256_GCM:Landroidx/security/crypto/b$c;

    invoke-virtual {v1, p1}, Landroidx/security/crypto/b$b;->b(Landroidx/security/crypto/b$c;)Landroidx/security/crypto/b$b;

    move-result-object p1

    const-string/jumbo v1, "setKeyScheme(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1c

    if-lt v1, v2, :cond_0

    const/4 v1, 0x1

    invoke-virtual {p1, v1}, Landroidx/security/crypto/b$b;->c(Z)Landroidx/security/crypto/b$b;

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_1

    :catch_1
    move-exception p1

    goto :goto_2

    :cond_0
    :goto_0
    invoke-virtual {p1}, Landroidx/security/crypto/b$b;->a()Landroidx/security/crypto/b;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :goto_1
    new-instance v1, Lcom/ui/sso/account/local/UiAccountSharedPrefProvider$Error;

    invoke-direct {v1, v0, p1}, Lcom/ui/sso/account/local/UiAccountSharedPrefProvider$Error;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :goto_2
    new-instance v1, Lcom/ui/sso/account/local/UiAccountSharedPrefProvider$Error;

    invoke-direct {v1, v0, p1}, Lcom/ui/sso/account/local/UiAccountSharedPrefProvider$Error;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method
