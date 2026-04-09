.class abstract Lcom/ui/core/ui/sso/login/UiLoginVMImpl$LoginProcessError;
.super Ljava/lang/RuntimeException;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/core/ui/sso/login/UiLoginVMImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x40a
    name = "LoginProcessError"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ui/core/ui/sso/login/UiLoginVMImpl$LoginProcessError$EmailNotVerified;,
        Lcom/ui/core/ui/sso/login/UiLoginVMImpl$LoginProcessError$InvalidCredentials;,
        Lcom/ui/core/ui/sso/login/UiLoginVMImpl$LoginProcessError$Network;,
        Lcom/ui/core/ui/sso/login/UiLoginVMImpl$LoginProcessError$TwoFARequired;
    }
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
    invoke-direct {p0}, Lcom/ui/core/ui/sso/login/UiLoginVMImpl$LoginProcessError;-><init>()V

    return-void
.end method
