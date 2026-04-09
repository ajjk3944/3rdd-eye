.class public abstract Lcom/ui/wmw/WMWizard$Error$RequirementNotMet;
.super Lcom/ui/wmw/WMWizard$Error;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/wmw/WMWizard$Error;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "RequirementNotMet"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ui/wmw/WMWizard$Error$RequirementNotMet$BluetoothAdapterDisabled;,
        Lcom/ui/wmw/WMWizard$Error$RequirementNotMet$BluetoothAdapterUnavailable;,
        Lcom/ui/wmw/WMWizard$Error$RequirementNotMet$InsufficientPermission;,
        Lcom/ui/wmw/WMWizard$Error$RequirementNotMet$LocationDisabled;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00086\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\u0008\u0004\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u0082\u0001\u0004\u0008\t\n\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/ui/wmw/WMWizard$Error$RequirementNotMet;",
        "Lcom/ui/wmw/WMWizard$Error;",
        "<init>",
        "()V",
        "LocationDisabled",
        "InsufficientPermission",
        "BluetoothAdapterUnavailable",
        "BluetoothAdapterDisabled",
        "Lcom/ui/wmw/WMWizard$Error$RequirementNotMet$BluetoothAdapterDisabled;",
        "Lcom/ui/wmw/WMWizard$Error$RequirementNotMet$BluetoothAdapterUnavailable;",
        "Lcom/ui/wmw/WMWizard$Error$RequirementNotMet$InsufficientPermission;",
        "Lcom/ui/wmw/WMWizard$Error$RequirementNotMet$LocationDisabled;",
        "wifiman-wizard_release"
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
.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Lcom/ui/wmw/WMWizard$Error;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/ui/wmw/WMWizard$Error$RequirementNotMet;-><init>()V

    return-void
.end method
