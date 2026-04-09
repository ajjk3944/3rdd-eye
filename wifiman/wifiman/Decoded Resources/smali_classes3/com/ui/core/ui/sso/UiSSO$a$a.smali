.class public final Lcom/ui/core/ui/sso/UiSSO$a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/core/ui/sso/UiSSO$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/ui/core/ui/sso/UiSSO$a$a;-><init>()V

    return-void
.end method

.method private final synthetic b()LVi/b;
    .locals 1

    invoke-static {}, Lcom/ui/core/ui/sso/UiSSO$a;->c()LYg/m;

    move-result-object v0

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LVi/b;

    return-object v0
.end method


# virtual methods
.method public final a(Landroid/os/Bundle;)Lcom/ui/core/ui/sso/UiSSO$a;
    .locals 2

    const-string/jumbo v0, "bundle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "auth_response"

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    sget-object v0, Laj/b;->d:Laj/b$a;

    invoke-virtual {v0}, Laj/b;->a()Lcj/e;

    sget-object v1, Lcom/ui/core/ui/sso/UiSSO$a;->Companion:Lcom/ui/core/ui/sso/UiSSO$a$a;

    invoke-virtual {v1}, Lcom/ui/core/ui/sso/UiSSO$a$a;->serializer()LVi/b;

    move-result-object v1

    invoke-static {v1}, LWi/a;->u(LVi/b;)LVi/b;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Laj/b;->b(LVi/a;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ui/core/ui/sso/UiSSO$a;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public final serializer()LVi/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LVi/b;"
        }
    .end annotation

    invoke-direct {p0}, Lcom/ui/core/ui/sso/UiSSO$a$a;->b()LVi/b;

    move-result-object v0

    return-object v0
.end method
