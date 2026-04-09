.class public final LWa/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LWa/b$a;
    }
.end annotation


# static fields
.field public static final a:LWa/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LWa/b;

    invoke-direct {v0}, LWa/b;-><init>()V

    sput-object v0, LWa/b;->a:LWa/b;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)LWa/b$a;
    .locals 9

    const-string/jumbo v0, "cookieString"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x2

    const/4 v1, 0x0

    :try_start_0
    invoke-static {p1}, Ljava/net/HttpCookie;->parse(Ljava/lang/String;)Ljava/util/List;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-static {v2}, LZg/v;->s0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/net/HttpCookie;
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    const-string v3, "\'"

    if-eqz v2, :cond_6

    :try_start_1
    invoke-virtual {v2}, Ljava/net/HttpCookie;->getValue()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_1

    invoke-static {v4}, Lkotlin/text/t;->m0(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_0

    :cond_0
    const/4 v5, 0x0

    goto :goto_1

    :catch_0
    move-exception v2

    goto :goto_4

    :cond_1
    :goto_0
    const/4 v5, 0x1

    :goto_1
    if-nez v5, :cond_2

    goto :goto_2

    :cond_2
    move-object v4, v1

    :goto_2
    if-eqz v4, :cond_5

    invoke-virtual {v2}, Ljava/net/HttpCookie;->getMaxAge()J

    move-result-wide v5

    const-wide/16 v7, 0x0

    cmp-long v3, v5, v7

    if-lez v3, :cond_3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    invoke-virtual {v2}, Ljava/net/HttpCookie;->getMaxAge()J

    move-result-wide v2

    const/16 v7, 0x3e8

    int-to-long v7, v7

    mul-long/2addr v2, v7

    add-long/2addr v5, v2

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/net/HttpCookie;->hasExpired()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    goto :goto_3

    :cond_4
    move-object v2, v1

    :goto_3
    new-instance v3, LWa/b$a;

    invoke-direct {v3, v4, v2}, LWa/b$a;-><init>(Ljava/lang/String;Ljava/lang/Long;)V

    return-object v3

    :cond_5
    new-instance v2, Lcom/ui/sso/auth/UiCookieAuthError$InvalidCookieFormat;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v5, "Invalid cookie. No token found \'"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3, v1, v0, v1}, Lcom/ui/sso/auth/UiCookieAuthError$InvalidCookieFormat;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw v2

    :cond_6
    new-instance v2, Lcom/ui/sso/auth/UiCookieAuthError$InvalidCookieFormat;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v5, "Invalid cookie. No Cookie Found in \'"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3, v1, v0, v1}, Lcom/ui/sso/auth/UiCookieAuthError$InvalidCookieFormat;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw v2
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_0

    :goto_4
    new-instance v3, LWa/b$b;

    invoke-direct {v3, p1}, LWa/b$b;-><init>(Ljava/lang/String;)V

    invoke-static {v3, v1, v0, v1}, LUa/a;->g(Lmh/a;Ljava/lang/Throwable;ILjava/lang/Object;)V

    new-instance p1, Lcom/ui/sso/auth/UiCookieAuthError$InvalidCookieFormat;

    const-string/jumbo v0, "Invalid cookie format"

    invoke-direct {p1, v0, v2}, Lcom/ui/sso/auth/UiCookieAuthError$InvalidCookieFormat;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1
.end method
