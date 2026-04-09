.class abstract Lcom/ui/wifiman/model/ubiquiti/console/UnifiCloudConsoleServiceImpl$InternalError;
.super Ljava/lang/RuntimeException;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/wifiman/model/ubiquiti/console/UnifiCloudConsoleServiceImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x40a
    name = "InternalError"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ui/wifiman/model/ubiquiti/console/UnifiCloudConsoleServiceImpl$InternalError$NetworkConnectionUnavailable;,
        Lcom/ui/wifiman/model/ubiquiti/console/UnifiCloudConsoleServiceImpl$InternalError$SSOSessionUnavailable;
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
    invoke-direct {p0}, Lcom/ui/wifiman/model/ubiquiti/console/UnifiCloudConsoleServiceImpl$InternalError;-><init>()V

    return-void
.end method
