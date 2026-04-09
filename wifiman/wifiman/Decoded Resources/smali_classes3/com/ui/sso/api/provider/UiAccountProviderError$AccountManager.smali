.class public final Lcom/ui/sso/api/provider/UiAccountProviderError$AccountManager;
.super Lcom/ui/sso/api/provider/UiAccountProviderError;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/sso/api/provider/UiAccountProviderError;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "AccountManager"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\u0008\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u000c\u001a\u0004\u0008\r\u0010\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Lcom/ui/sso/api/provider/UiAccountProviderError$AccountManager;",
        "Lcom/ui/sso/api/provider/UiAccountProviderError;",
        "",
        "message",
        "Lcom/ui/sso/account/UIAccountManager$Error;",
        "cause",
        "<init>",
        "(Ljava/lang/String;Lcom/ui/sso/account/UIAccountManager$Error;)V",
        "a",
        "Lcom/ui/sso/account/UIAccountManager$Error;",
        "()Lcom/ui/sso/account/UIAccountManager$Error;",
        "b",
        "Ljava/lang/String;",
        "getMessage",
        "()Ljava/lang/String;",
        "account_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final a:Lcom/ui/sso/account/UIAccountManager$Error;

.field private final b:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/ui/sso/account/UIAccountManager$Error;)V
    .locals 1

    const-string/jumbo v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "cause"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/ui/sso/api/provider/UiAccountProviderError;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p2, p0, Lcom/ui/sso/api/provider/UiAccountProviderError$AccountManager;->a:Lcom/ui/sso/account/UIAccountManager$Error;

    invoke-virtual {p0}, Lcom/ui/sso/api/provider/UiAccountProviderError$AccountManager;->a()Lcom/ui/sso/account/UIAccountManager$Error;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p2

    if-nez p2, :cond_0

    const-string p2, ""

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ": "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/ui/sso/api/provider/UiAccountProviderError$AccountManager;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a()Lcom/ui/sso/account/UIAccountManager$Error;
    .locals 1

    iget-object v0, p0, Lcom/ui/sso/api/provider/UiAccountProviderError$AccountManager;->a:Lcom/ui/sso/account/UIAccountManager$Error;

    return-object v0
.end method

.method public bridge synthetic getCause()Ljava/lang/Throwable;
    .locals 1

    invoke-virtual {p0}, Lcom/ui/sso/api/provider/UiAccountProviderError$AccountManager;->a()Lcom/ui/sso/account/UIAccountManager$Error;

    move-result-object v0

    return-object v0
.end method

.method public getMessage()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ui/sso/api/provider/UiAccountProviderError$AccountManager;->b:Ljava/lang/String;

    return-object v0
.end method
