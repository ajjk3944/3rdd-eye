.class final Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LGb/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a$b$a;
    }
.end annotation


# static fields
.field public static final d:Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a$b$a;


# instance fields
.field private final a:Ljava/util/UUID;

.field private final b:Lcom/ui/sso/api/UiAccountApi;

.field private c:Lcom/ui/sso/auth/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a$b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a$b$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a$b;->d:Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a$b$a;

    return-void
.end method

.method private constructor <init>(Ljava/util/UUID;Lcom/ui/sso/api/UiAccountApi;Lcom/ui/sso/auth/a;)V
    .locals 1

    const-string v0, "accountId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "api"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a$b;->a:Ljava/util/UUID;

    .line 4
    iput-object p2, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a$b;->b:Lcom/ui/sso/api/UiAccountApi;

    .line 5
    iput-object p3, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a$b;->c:Lcom/ui/sso/auth/a;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/UUID;Lcom/ui/sso/api/UiAccountApi;Lcom/ui/sso/auth/a;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a$b;-><init>(Ljava/util/UUID;Lcom/ui/sso/api/UiAccountApi;Lcom/ui/sso/auth/a;)V

    return-void
.end method

.method public static final synthetic c(Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a$b;)Ljava/util/UUID;
    .locals 0

    iget-object p0, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a$b;->a:Ljava/util/UUID;

    return-object p0
.end method

.method public static final synthetic d(Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a$b;)Lcom/ui/sso/api/UiAccountApi;
    .locals 0

    iget-object p0, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a$b;->b:Lcom/ui/sso/api/UiAccountApi;

    return-object p0
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 5

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sessionCookies"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x2

    const/4 v2, 0x0

    if-eqz v0, :cond_4

    const-string v0, "CookieSession - Storage SET Cookie auth requested"

    invoke-static {v0, v2, v1, v2}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    if-eqz p2, :cond_1

    invoke-static {p2}, Lkotlin/text/t;->m0(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    const-string v0, "CookieSession - Storage storing cookie"

    invoke-static {v0, v2, v1, v2}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    :try_start_0
    sget-object v0, Lcom/ui/sso/auth/c;->d:Lcom/ui/sso/auth/c$a;

    invoke-virtual {v0, p2}, Lcom/ui/sso/auth/c$a;->a(Ljava/lang/String;)Lcom/ui/sso/auth/c;

    move-result-object v0
    :try_end_0
    .catch Lcom/ui/sso/auth/UiCookieAuthError$InvalidCookieFormat; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v3, "CookieSession - Failed to parse incoming UBIC_AUTH cookie"

    const/4 v4, 0x4

    invoke-static {v3, v0, v2, v4, v2}, LZ7/b;->e(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;ILjava/lang/Object;)V

    move-object v0, v2

    :goto_0
    if-eqz v0, :cond_2

    invoke-virtual {p0, v0}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a$b;->g(Lcom/ui/sso/auth/a;)V

    goto :goto_2

    :cond_1
    :goto_1
    invoke-virtual {p0, v2}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a$b;->g(Lcom/ui/sso/auth/a;)V

    :cond_2
    :goto_2
    if-eqz p2, :cond_3

    invoke-virtual {p2}, Ljava/lang/Object;->hashCode()I

    move-result p2

    goto :goto_3

    :cond_3
    const/4 p2, 0x0

    :goto_3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "CookieSession - SET "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " -> hash:"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " Success"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v2, v1, v2}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    goto :goto_4

    :cond_4
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "CookieSession -  Storage SET "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " IGNORED"

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v2, v1, v2}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    :goto_4
    return-void
.end method

.method public b(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/4 v1, 0x0

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_3

    :sswitch_0
    const-string v0, "deviceId"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    goto/16 :goto_3

    :cond_0
    iget-object p1, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a$b;->c:Lcom/ui/sso/auth/a;

    instance-of v0, p1, Lcom/ui/sso/auth/d;

    if-eqz v0, :cond_1

    check-cast p1, Lcom/ui/sso/auth/d;

    goto :goto_0

    :cond_1
    move-object p1, v1

    :goto_0
    if-eqz p1, :cond_8

    invoke-virtual {p1}, Lcom/ui/sso/auth/d;->c()Lcom/ui/sso/auth/d$b;

    move-result-object p1

    if-eqz p1, :cond_8

    invoke-virtual {p1}, Lcom/ui/sso/auth/d$b;->b()Ljava/lang/String;

    move-result-object v1

    goto/16 :goto_3

    :sswitch_1
    const-string v0, "deviceName"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    goto/16 :goto_3

    :cond_2
    iget-object p1, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a$b;->c:Lcom/ui/sso/auth/a;

    instance-of v0, p1, Lcom/ui/sso/auth/d;

    if-eqz v0, :cond_3

    check-cast p1, Lcom/ui/sso/auth/d;

    goto :goto_1

    :cond_3
    move-object p1, v1

    :goto_1
    if-eqz p1, :cond_8

    invoke-virtual {p1}, Lcom/ui/sso/auth/d;->c()Lcom/ui/sso/auth/d$b;

    move-result-object p1

    if-eqz p1, :cond_8

    invoke-virtual {p1}, Lcom/ui/sso/auth/d$b;->c()Ljava/lang/String;

    move-result-object v1

    goto :goto_3

    :sswitch_2
    const-string v0, "uiAuthToken"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    goto :goto_3

    :cond_4
    iget-object p1, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a$b;->c:Lcom/ui/sso/auth/a;

    if-eqz p1, :cond_8

    invoke-virtual {p1}, Lcom/ui/sso/auth/a;->a()Ljava/lang/String;

    move-result-object v1

    goto :goto_3

    :sswitch_3
    const-string v0, "pkceCodeVerifier"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    goto :goto_3

    :cond_5
    iget-object p1, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a$b;->c:Lcom/ui/sso/auth/a;

    instance-of v0, p1, Lcom/ui/sso/auth/d;

    if-eqz v0, :cond_6

    check-cast p1, Lcom/ui/sso/auth/d;

    goto :goto_2

    :cond_6
    move-object p1, v1

    :goto_2
    if-eqz p1, :cond_8

    invoke-virtual {p1}, Lcom/ui/sso/auth/d;->c()Lcom/ui/sso/auth/d$b;

    move-result-object p1

    if-eqz p1, :cond_8

    invoke-virtual {p1}, Lcom/ui/sso/auth/d$b;->a()Ljava/lang/String;

    move-result-object v1

    goto :goto_3

    :sswitch_4
    const-string v0, "sessionCookies"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    goto :goto_3

    :cond_7
    iget-object p1, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a$b;->c:Lcom/ui/sso/auth/a;

    if-eqz p1, :cond_8

    invoke-virtual {p1}, Lcom/ui/sso/auth/a;->a()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_8

    sget-object v0, LP9/n;->a:LP9/n;

    invoke-virtual {v0}, LP9/n;->e()LAb/h;

    move-result-object v0

    invoke-virtual {v0}, LAb/h;->getUbicAuthCookieName()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    :cond_8
    :goto_3
    return-object v1

    :sswitch_data_0
    .sparse-switch
        -0x5d9c9ce7 -> :sswitch_4
        -0x43b0b3e0 -> :sswitch_3
        0xc8d6cfd -> :sswitch_2
        0x2e8cf201 -> :sswitch_1
        0x421cea11 -> :sswitch_0
    .end sparse-switch
.end method

.method public final e()Lcom/ui/sso/auth/a;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a$b;->c:Lcom/ui/sso/auth/a;

    return-object v0
.end method

.method public final f()Lgg/b;
    .locals 2

    new-instance v0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a$b$d;

    invoke-direct {v0, p0}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a$b$d;-><init>(Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a$b;)V

    invoke-static {v0}, Lgg/b;->r(Lgg/e;)Lgg/b;

    move-result-object v0

    const-string v1, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final g(Lcom/ui/sso/auth/a;)V
    .locals 8

    const/4 v0, 0x4

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz p1, :cond_0

    :try_start_0
    new-instance v3, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a$b$b;

    invoke-direct {v3, p0, p1, v2}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a$b$b;-><init>(Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a$b;Lcom/ui/sso/auth/a;Ldh/e;)V

    invoke-static {v2, v3, v1, v2}, LIi/i;->f(Ldh/i;Lmh/p;ILjava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Lcom/ui/sso/api/UiAccountApi$Error; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_3

    goto :goto_1

    :catch_0
    move-exception v1

    const-string v3, "CookieSession - Failed to update Auth Cookie"

    invoke-static {v3, v1, v2, v0, v2}, LZ7/b;->e(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;ILjava/lang/Object;)V

    goto :goto_1

    :cond_0
    const-string v3, "CookieSession - Storage invalidating token"

    const/4 v4, 0x2

    invoke-static {v3, v2, v4, v2}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    invoke-static {}, Lcom/ui/sso/auth/a$a;->getEntries()Lfh/a;

    move-result-object v3

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :catch_1
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/ui/sso/auth/a$a;

    :try_start_1
    new-instance v5, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a$b$c;

    invoke-direct {v5, p0, v4, v2}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a$b$c;-><init>(Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a$b;Lcom/ui/sso/auth/a$a;Ldh/e;)V

    invoke-static {v2, v5, v1, v2}, LIi/i;->f(Ldh/i;Lmh/p;ILjava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catch Lcom/ui/sso/api/UiAccountApi$Error; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    :catch_2
    move-exception v5

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "CookieSession -  Failed to invalidate Auth Cookie type "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v5, v2, v0, v2}, LZ7/b;->e(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;ILjava/lang/Object;)V

    goto :goto_0

    :catch_3
    :cond_1
    :goto_1
    iput-object p1, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a$b;->c:Lcom/ui/sso/auth/a;

    return-void
.end method
