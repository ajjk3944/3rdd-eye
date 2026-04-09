.class public final Lga/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lga/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lga/a;

    invoke-direct {v0}, Lga/a;-><init>()V

    sput-object v0, Lga/a;->a:Lga/a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic b(Lga/a;LEb/r;LGb/f;Lcom/ui/core/ui/sso/UiSSO$e;ZILjava/lang/Object;)Lcom/ui/core/ui/sso/UiSSO$a;
    .locals 0

    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    const/4 p4, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2, p3, p4}, Lga/a;->a(LEb/r;LGb/f;Lcom/ui/core/ui/sso/UiSSO$e;Z)Lcom/ui/core/ui/sso/UiSSO$a;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(LEb/r;LGb/f;Lcom/ui/core/ui/sso/UiSSO$e;Z)Lcom/ui/core/ui/sso/UiSSO$a;
    .locals 10

    const-string/jumbo v0, "user"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "ssoStorage"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p2}, LGb/f;->s()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_5

    invoke-interface {p2}, LGb/f;->r()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_4

    invoke-interface {p2}, LGb/f;->j()Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_3

    invoke-static {p3}, Lia/a;->a(Lcom/ui/core/ui/sso/UiSSO$e;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p0, p2}, Lga/a;->c(LGb/f;)Lcom/ui/core/ui/sso/UiSSO$b;

    move-result-object v6

    if-eqz p3, :cond_1

    invoke-virtual {p3}, Lcom/ui/core/ui/sso/UiSSO$e;->a()Ljava/lang/String;

    move-result-object v8

    if-eqz v8, :cond_1

    invoke-interface {p2}, LGb/f;->x()Ljava/lang/String;

    move-result-object v9

    if-eqz v9, :cond_0

    new-instance p2, Lcom/ui/core/ui/sso/UiSSO$a$c;

    move-object v1, p2

    move-object v2, p1

    move v7, p4

    invoke-direct/range {v1 .. v9}, Lcom/ui/core/ui/sso/UiSSO$a$c;-><init>(LEb/r;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ui/core/ui/sso/UiSSO$b;ZLjava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    new-instance p1, Lcom/ui/core/ui/sso/UiSSO$Error$InvalidMFAParams;

    const-string/jumbo p2, "missing pkceCodeVerifier after successful authentication"

    invoke-direct {p1, p2}, Lcom/ui/core/ui/sso/UiSSO$Error$InvalidMFAParams;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Lcom/ui/core/ui/sso/UiSSO$Error$InvalidMFAParams;

    const-string/jumbo p2, "missing method after successful authentication"

    invoke-direct {p1, p2}, Lcom/ui/core/ui/sso/UiSSO$Error$InvalidMFAParams;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    new-instance p3, Lcom/ui/core/ui/sso/UiSSO$a$b;

    invoke-virtual {p0, p2}, Lga/a;->c(LGb/f;)Lcom/ui/core/ui/sso/UiSSO$b;

    move-result-object v6

    move-object v1, p3

    move-object v2, p1

    move v7, p4

    invoke-direct/range {v1 .. v7}, Lcom/ui/core/ui/sso/UiSSO$a$b;-><init>(LEb/r;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ui/core/ui/sso/UiSSO$b;Z)V

    move-object p2, p3

    :goto_0
    return-object p2

    :cond_3
    new-instance p1, Lcom/ui/core/ui/sso/UiSSO$Error$MissingSsoPassword;

    invoke-direct {p1}, Lcom/ui/core/ui/sso/UiSSO$Error$MissingSsoPassword;-><init>()V

    throw p1

    :cond_4
    new-instance p1, Lcom/ui/core/ui/sso/UiSSO$Error$InvalidMFAParams;

    const-string/jumbo p2, "missing oAuthToken after successful authentication"

    invoke-direct {p1, p2}, Lcom/ui/core/ui/sso/UiSSO$Error$InvalidMFAParams;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    new-instance p1, Lcom/ui/core/ui/sso/UiSSO$Error$InvalidMFAParams;

    const-string/jumbo p2, "missing UBIC_AUTH cookie after successful authentication"

    invoke-direct {p1, p2}, Lcom/ui/core/ui/sso/UiSSO$Error$InvalidMFAParams;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final c(LGb/f;)Lcom/ui/core/ui/sso/UiSSO$b;
    .locals 3

    const-string/jumbo v0, "ssoStorage"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/ui/core/ui/sso/UiSSO$b;

    invoke-interface {p1}, LGb/f;->p()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, LGb/f;->a()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-interface {p1}, LGb/f;->A()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-direct {v0, v1, v2, p1}, Lcom/ui/core/ui/sso/UiSSO$b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    :cond_0
    new-instance p1, Lcom/ui/core/ui/sso/UiSSO$Error$InvalidMFAParams;

    const-string/jumbo v0, "missing deviceModel after successful authentication"

    invoke-direct {p1, v0}, Lcom/ui/core/ui/sso/UiSSO$Error$InvalidMFAParams;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Lcom/ui/core/ui/sso/UiSSO$Error$InvalidMFAParams;

    const-string/jumbo v0, "missing deviceName after successful authentication"

    invoke-direct {p1, v0}, Lcom/ui/core/ui/sso/UiSSO$Error$InvalidMFAParams;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    new-instance p1, Lcom/ui/core/ui/sso/UiSSO$Error$InvalidMFAParams;

    const-string/jumbo v0, "missing deviceId after successful authentication"

    invoke-direct {p1, v0}, Lcom/ui/core/ui/sso/UiSSO$Error$InvalidMFAParams;-><init>(Ljava/lang/String;)V

    throw p1
.end method
