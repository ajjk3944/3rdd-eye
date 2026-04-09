.class abstract Lcom/ui/wifiman/model/ubiquiti/uisp/UispControllerDiscoveryImpl$Error;
.super Ljava/io/IOException;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/wifiman/model/ubiquiti/uisp/UispControllerDiscoveryImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x40a
    name = "Error"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ui/wifiman/model/ubiquiti/uisp/UispControllerDiscoveryImpl$Error$RequestFailed;,
        Lcom/ui/wifiman/model/ubiquiti/uisp/UispControllerDiscoveryImpl$Error$ResponseValidation;
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/io/IOException;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/ui/wifiman/model/ubiquiti/uisp/UispControllerDiscoveryImpl$Error;-><init>()V

    return-void
.end method
