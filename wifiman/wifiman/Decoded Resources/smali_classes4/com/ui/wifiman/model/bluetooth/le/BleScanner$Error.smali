.class public abstract Lcom/ui/wifiman/model/bluetooth/le/BleScanner$Error;
.super Ljava/lang/Exception;
.source "SourceFile"

# interfaces
.implements LWc/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/wifiman/model/bluetooth/le/BleScanner;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "Error"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ui/wifiman/model/bluetooth/le/BleScanner$Error$ApplicationRegistrationFailed;,
        Lcom/ui/wifiman/model/bluetooth/le/BleScanner$Error$BluetoothNotAvailableOnDevice;,
        Lcom/ui/wifiman/model/bluetooth/le/BleScanner$Error$FeatureUnsupported;,
        Lcom/ui/wifiman/model/bluetooth/le/BleScanner$Error$InternalError;,
        Lcom/ui/wifiman/model/bluetooth/le/BleScanner$Error$MultipleScanningAtOnceNotSupported;,
        Lcom/ui/wifiman/model/bluetooth/le/BleScanner$Error$Unknown;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00086\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u0003:\u0006\u0008\t\n\u000b\u000c\rB\u0011\u0008\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u0082\u0001\u0006\u000e\u000f\u0010\u0011\u0012\u0013\u00a8\u0006\u0014"
    }
    d2 = {
        "Lcom/ui/wifiman/model/bluetooth/le/BleScanner$Error;",
        "Ljava/lang/Exception;",
        "Lkotlin/Exception;",
        "LWc/d;",
        "",
        "message",
        "<init>",
        "(Ljava/lang/String;)V",
        "InternalError",
        "ApplicationRegistrationFailed",
        "FeatureUnsupported",
        "MultipleScanningAtOnceNotSupported",
        "BluetoothNotAvailableOnDevice",
        "Unknown",
        "Lcom/ui/wifiman/model/bluetooth/le/BleScanner$Error$ApplicationRegistrationFailed;",
        "Lcom/ui/wifiman/model/bluetooth/le/BleScanner$Error$BluetoothNotAvailableOnDevice;",
        "Lcom/ui/wifiman/model/bluetooth/le/BleScanner$Error$FeatureUnsupported;",
        "Lcom/ui/wifiman/model/bluetooth/le/BleScanner$Error$InternalError;",
        "Lcom/ui/wifiman/model/bluetooth/le/BleScanner$Error$MultipleScanningAtOnceNotSupported;",
        "Lcom/ui/wifiman/model/bluetooth/le/BleScanner$Error$Unknown;",
        "app-model_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method private constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/ui/wifiman/model/bluetooth/le/BleScanner$Error;-><init>(Ljava/lang/String;)V

    return-void
.end method
