.class public final Lcom/ui/sso/api/UiAccountApi$Error$CallerSignCertMismatch;
.super Lcom/ui/sso/api/UiAccountApi$Error;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/sso/api/UiAccountApi$Error;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "CallerSignCertMismatch"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0006\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/ui/sso/api/UiAccountApi$Error$CallerSignCertMismatch;",
        "Lcom/ui/sso/api/UiAccountApi$Error;",
        "<init>",
        "()V",
        "",
        "a",
        "Ljava/lang/String;",
        "getMessage",
        "()Ljava/lang/String;",
        "message",
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


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/ui/sso/api/UiAccountApi$Error;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    const-string v0, "API package with requested Account type not recognise cert of this package. This should never happen for GA build. For proper configuration of Internal builds, please visit docs https://github.com/ubiquiti/shared-utils.android-sso/wiki/Internal-Build-Configuration"

    iput-object v0, p0, Lcom/ui/sso/api/UiAccountApi$Error$CallerSignCertMismatch;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getMessage()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ui/sso/api/UiAccountApi$Error$CallerSignCertMismatch;->a:Ljava/lang/String;

    return-object v0
.end method
