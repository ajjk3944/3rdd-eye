.class public abstract Lcom/ui/product/firmware/UiFirmwareBoard$AirMax$AC;
.super Lcom/ui/product/firmware/UiFirmwareBoard$AirMax;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/product/firmware/UiFirmwareBoard$AirMax;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "AC"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ui/product/firmware/UiFirmwareBoard$AirMax$AC$Gen1;,
        Lcom/ui/product/firmware/UiFirmwareBoard$AirMax$AC$Gen2;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00086\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\u0008\u0004\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/ui/product/firmware/UiFirmwareBoard$AirMax$AC;",
        "Lcom/ui/product/firmware/UiFirmwareBoard$AirMax;",
        "<init>",
        "()V",
        "Gen1",
        "Gen2",
        "Lcom/ui/product/firmware/UiFirmwareBoard$AirMax$AC$Gen1;",
        "Lcom/ui/product/firmware/UiFirmwareBoard$AirMax$AC$Gen2;",
        "product"
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
    invoke-direct {p0, v0}, Lcom/ui/product/firmware/UiFirmwareBoard$AirMax;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/ui/product/firmware/UiFirmwareBoard$AirMax$AC;-><init>()V

    return-void
.end method
