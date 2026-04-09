.class public abstract Lcom/ui/sso/api/provider/UiAccountProviderError;
.super Ljava/lang/RuntimeException;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ui/sso/api/provider/UiAccountProviderError$AccountManager;,
        Lcom/ui/sso/api/provider/UiAccountProviderError$CallerSignCertMismatch;,
        Lcom/ui/sso/api/provider/UiAccountProviderError$IllegalState;,
        Lcom/ui/sso/api/provider/UiAccountProviderError$InterprocessWrapper;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00080\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0004\u0004\u0005\u0006\u0007B\u0007\u0008\u0004\u00a2\u0006\u0002\u0010\u0003\u0082\u0001\u0003\u0008\t\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/ui/sso/api/provider/UiAccountProviderError;",
        "Ljava/lang/RuntimeException;",
        "Lkotlin/RuntimeException;",
        "()V",
        "AccountManager",
        "CallerSignCertMismatch",
        "IllegalState",
        "InterprocessWrapper",
        "Lcom/ui/sso/api/provider/UiAccountProviderError$AccountManager;",
        "Lcom/ui/sso/api/provider/UiAccountProviderError$CallerSignCertMismatch;",
        "Lcom/ui/sso/api/provider/UiAccountProviderError$IllegalState;",
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


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/RuntimeException;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/ui/sso/api/provider/UiAccountProviderError;-><init>()V

    return-void
.end method
