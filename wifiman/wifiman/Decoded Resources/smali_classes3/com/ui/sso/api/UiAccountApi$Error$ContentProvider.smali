.class public abstract Lcom/ui/sso/api/UiAccountApi$Error$ContentProvider;
.super Lcom/ui/sso/api/UiAccountApi$Error;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/sso/api/UiAccountApi$Error;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "ContentProvider"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ui/sso/api/UiAccountApi$Error$ContentProvider$IllegalState;,
        Lcom/ui/sso/api/UiAccountApi$Error$ContentProvider$ProviderUnavailable;,
        Lcom/ui/sso/api/UiAccountApi$Error$ContentProvider$ReceivedInvalidResponse;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00086\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\u0008\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lcom/ui/sso/api/UiAccountApi$Error$ContentProvider;",
        "Lcom/ui/sso/api/UiAccountApi$Error;",
        "()V",
        "IllegalState",
        "ProviderUnavailable",
        "ReceivedInvalidResponse",
        "Lcom/ui/sso/api/UiAccountApi$Error$ContentProvider$IllegalState;",
        "Lcom/ui/sso/api/UiAccountApi$Error$ContentProvider$ProviderUnavailable;",
        "Lcom/ui/sso/api/UiAccountApi$Error$ContentProvider$ReceivedInvalidResponse;",
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
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Lcom/ui/sso/api/UiAccountApi$Error;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/ui/sso/api/UiAccountApi$Error$ContentProvider;-><init>()V

    return-void
.end method
