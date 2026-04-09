.class public final Lcom/ui/sso/api/UiAccountApiFactory$AccountApiUnavailableException;
.super Ljava/lang/Exception;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0007\u0010\u0008R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\n\u001a\u0004\u0008\u000b\u0010\u000cR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u000e\u001a\u0004\u0008\t\u0010\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "com/ui/sso/api/UiAccountApiFactory$AccountApiUnavailableException",
        "Ljava/lang/Exception;",
        "Lkotlin/Exception;",
        "",
        "message",
        "Lcom/ui/sso/api/UiAccountApi$Error;",
        "cause",
        "<init>",
        "(Ljava/lang/String;Lcom/ui/sso/api/UiAccountApi$Error;)V",
        "a",
        "Ljava/lang/String;",
        "getMessage",
        "()Ljava/lang/String;",
        "b",
        "Lcom/ui/sso/api/UiAccountApi$Error;",
        "()Lcom/ui/sso/api/UiAccountApi$Error;",
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
.field private final a:Ljava/lang/String;

.field private final b:Lcom/ui/sso/api/UiAccountApi$Error;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/ui/sso/api/UiAccountApi$Error;)V
    .locals 1

    const-string/jumbo v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "cause"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Exception;-><init>()V

    iput-object p1, p0, Lcom/ui/sso/api/UiAccountApiFactory$AccountApiUnavailableException;->a:Ljava/lang/String;

    iput-object p2, p0, Lcom/ui/sso/api/UiAccountApiFactory$AccountApiUnavailableException;->b:Lcom/ui/sso/api/UiAccountApi$Error;

    return-void
.end method


# virtual methods
.method public a()Lcom/ui/sso/api/UiAccountApi$Error;
    .locals 1

    iget-object v0, p0, Lcom/ui/sso/api/UiAccountApiFactory$AccountApiUnavailableException;->b:Lcom/ui/sso/api/UiAccountApi$Error;

    return-object v0
.end method

.method public bridge synthetic getCause()Ljava/lang/Throwable;
    .locals 1

    invoke-virtual {p0}, Lcom/ui/sso/api/UiAccountApiFactory$AccountApiUnavailableException;->a()Lcom/ui/sso/api/UiAccountApi$Error;

    move-result-object v0

    return-object v0
.end method

.method public getMessage()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ui/sso/api/UiAccountApiFactory$AccountApiUnavailableException;->a:Ljava/lang/String;

    return-object v0
.end method
