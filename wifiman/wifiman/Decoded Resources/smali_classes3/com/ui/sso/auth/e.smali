.class public final Lcom/ui/sso/auth/e;
.super Lcom/ui/sso/auth/a;
.source "SourceFile"


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Lcom/ui/sso/auth/a$a;

.field private final c:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    const-string/jumbo v0, "password"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/ui/sso/auth/a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lcom/ui/sso/auth/e;->a:Ljava/lang/String;

    sget-object v0, Lcom/ui/sso/auth/a$a;->SSO_PASSWORD:Lcom/ui/sso/auth/a$a;

    iput-object v0, p0, Lcom/ui/sso/auth/e;->b:Lcom/ui/sso/auth/a$a;

    iput-object p1, p0, Lcom/ui/sso/auth/e;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ui/sso/auth/e;->c:Ljava/lang/String;

    return-object v0
.end method

.method public b()Lcom/ui/sso/auth/a$a;
    .locals 1

    iget-object v0, p0, Lcom/ui/sso/auth/e;->b:Lcom/ui/sso/auth/a$a;

    return-object v0
.end method
