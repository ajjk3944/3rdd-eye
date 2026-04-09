.class public final Lcom/ui/sso/api/provider/e$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/sso/api/provider/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "f"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ui/sso/api/provider/e$f$a;
    }
.end annotation


# static fields
.field public static final b:Lcom/ui/sso/api/provider/e$f$a;


# instance fields
.field private final a:Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/ui/sso/api/provider/e$f$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ui/sso/api/provider/e$f$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/ui/sso/api/provider/e$f;->b:Lcom/ui/sso/api/provider/e$f$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer$a;

    const-class v1, Lcom/ui/sso/api/provider/e;

    invoke-static {v1}, Lkotlin/jvm/internal/O;->l(Ljava/lang/Class;)Lth/p;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer$a;-><init>(Lth/p;)V

    iput-object v0, p0, Lcom/ui/sso/api/provider/e$f;->a:Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer$a;

    return-void
.end method

.method private final c(Lcom/ui/sso/api/provider/e$h;)Lcom/ui/sso/api/provider/e$g;
    .locals 4

    invoke-virtual {p1}, Lcom/ui/sso/api/provider/e$h;->e()I

    move-result v0

    invoke-virtual {p1}, Lcom/ui/sso/api/provider/e$h;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/ui/sso/api/provider/e$h;->f()Z

    move-result v2

    invoke-virtual {p1}, Lcom/ui/sso/api/provider/e$h;->d()Ljava/lang/String;

    move-result-object p1

    new-instance v3, Lcom/ui/sso/api/provider/e$g;

    invoke-direct {v3, v0, v1, p1, v2}, Lcom/ui/sso/api/provider/e$g;-><init>(ILjava/lang/String;Ljava/lang/String;Z)V

    return-object v3
.end method

.method private final d(Lcom/ui/sso/api/provider/e$g;)Lcom/ui/sso/api/provider/e$h;
    .locals 8

    new-instance v7, Lcom/ui/sso/api/provider/e$h;

    invoke-virtual {p1}, Lcom/ui/sso/api/provider/e$g;->e()I

    move-result v1

    invoke-virtual {p1}, Lcom/ui/sso/api/provider/e$g;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/ui/sso/api/provider/e$g;->f()Z

    move-result v3

    invoke-virtual {p1}, Lcom/ui/sso/api/provider/e$g;->d()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Lcom/ui/sso/api/provider/e$h;-><init>(ILjava/lang/String;ZLjava/lang/String;ZZ)V

    return-object v7
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)Landroid/os/Bundle;
    .locals 0

    check-cast p1, Lcom/ui/sso/api/provider/e;

    invoke-virtual {p0, p1}, Lcom/ui/sso/api/provider/e$f;->g(Lcom/ui/sso/api/provider/e;)Landroid/os/Bundle;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic b(Landroid/os/Bundle;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/ui/sso/api/provider/e$f;->e(Landroid/os/Bundle;)Lcom/ui/sso/api/provider/e;

    move-result-object p1

    return-object p1
.end method

.method public e(Landroid/os/Bundle;)Lcom/ui/sso/api/provider/e;
    .locals 4

    const-string/jumbo v0, "bundle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "response"

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    const/4 v2, 0x0

    if-eqz v0, :cond_5

    new-instance v3, Lcom/ui/sso/api/provider/e$f$b;

    invoke-direct {v3, v0}, Lcom/ui/sso/api/provider/e$f$b;-><init>(Ljava/lang/String;)V

    invoke-static {v3}, LUa/a;->e(Lmh/a;)V

    iget-object v3, p0, Lcom/ui/sso/api/provider/e$f;->a:Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer$a;

    invoke-virtual {v3, v0}, Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer$a;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ui/sso/api/provider/e;

    instance-of v3, v0, Lcom/ui/sso/api/provider/e$g;

    if-eqz v3, :cond_2

    const-string/jumbo v3, "responseV2"

    invoke-virtual {p1, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_1

    iget-object v3, p0, Lcom/ui/sso/api/provider/e$f;->a:Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer$a;

    invoke-virtual {v3, p1}, Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer$a;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ui/sso/api/provider/e;

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    move-object v0, p1

    goto :goto_1

    :cond_1
    :goto_0
    check-cast v0, Lcom/ui/sso/api/provider/e$g;

    invoke-direct {p0, v0}, Lcom/ui/sso/api/provider/e$f;->d(Lcom/ui/sso/api/provider/e$g;)Lcom/ui/sso/api/provider/e$h;

    move-result-object v0

    :cond_2
    :goto_1
    if-eqz v0, :cond_3

    goto :goto_2

    :cond_3
    move-object v0, v2

    :goto_2
    if-eqz v0, :cond_4

    return-object v0

    :cond_4
    new-instance p1, Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer$SerializationError;

    const-string/jumbo v0, "Received response of unexpected type"

    invoke-direct {p1, v0, v2, v1, v2}, Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer$SerializationError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw p1

    :cond_5
    new-instance p1, Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer$SerializationError;

    const-string/jumbo v0, "Key response not found in response bundle"

    invoke-direct {p1, v0, v2, v1, v2}, Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer$SerializationError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw p1
.end method

.method public final f()Landroid/os/Bundle;
    .locals 1

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    return-object v0
.end method

.method public g(Lcom/ui/sso/api/provider/e;)Landroid/os/Bundle;
    .locals 4

    const-string/jumbo v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/ui/sso/api/provider/e$f;->f()Landroid/os/Bundle;

    move-result-object v0

    instance-of v1, p1, Lcom/ui/sso/api/provider/e$h;

    const-string/jumbo v2, "response"

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/ui/sso/api/provider/e$f;->a:Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer$a;

    invoke-virtual {v1, p1}, Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer$a;->b(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string/jumbo v3, "responseV2"

    invoke-virtual {v0, v3, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/ui/sso/api/provider/e$f;->a:Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer$a;

    check-cast p1, Lcom/ui/sso/api/provider/e$h;

    invoke-direct {p0, p1}, Lcom/ui/sso/api/provider/e$f;->c(Lcom/ui/sso/api/provider/e$h;)Lcom/ui/sso/api/provider/e$g;

    move-result-object p1

    const-string/jumbo v3, "null cannot be cast to non-null type com.ui.sso.api.provider.UiAccountProviderResponse"

    invoke-static {p1, v3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer$a;->b(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v2, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/ui/sso/api/provider/e$f;->a:Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer$a;

    invoke-virtual {v1, p1}, Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer$a;->b(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v2, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    return-object v0
.end method
