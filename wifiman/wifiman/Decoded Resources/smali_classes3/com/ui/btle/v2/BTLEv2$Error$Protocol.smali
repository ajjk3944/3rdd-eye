.class public abstract Lcom/ui/btle/v2/BTLEv2$Error$Protocol;
.super Lcom/ui/btle/v2/BTLEv2$Error;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/btle/v2/BTLEv2$Error;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "Protocol"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ui/btle/v2/BTLEv2$Error$Protocol$InvalidPacketContent;,
        Lcom/ui/btle/v2/BTLEv2$Error$Protocol$InvalidPacketFragmentLength;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00086\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\u0008\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lcom/ui/btle/v2/BTLEv2$Error$Protocol;",
        "Lcom/ui/btle/v2/BTLEv2$Error;",
        "()V",
        "InvalidPacketContent",
        "InvalidPacketFragmentLength",
        "Lcom/ui/btle/v2/BTLEv2$Error$Protocol$InvalidPacketContent;",
        "Lcom/ui/btle/v2/BTLEv2$Error$Protocol$InvalidPacketFragmentLength;",
        "btle-v2_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Lcom/ui/btle/v2/BTLEv2$Error;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/ui/btle/v2/BTLEv2$Error$Protocol;-><init>()V

    return-void
.end method
