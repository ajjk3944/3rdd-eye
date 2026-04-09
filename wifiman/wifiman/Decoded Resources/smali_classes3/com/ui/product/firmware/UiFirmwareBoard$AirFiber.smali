.class public abstract Lcom/ui/product/firmware/UiFirmwareBoard$AirFiber;
.super Lcom/ui/product/firmware/UiFirmwareBoard;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/product/firmware/UiFirmwareBoard;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "AirFiber"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ui/product/firmware/UiFirmwareBoard$AirFiber$AF5XHD;,
        Lcom/ui/product/firmware/UiFirmwareBoard$AirFiber$AF60;,
        Lcom/ui/product/firmware/UiFirmwareBoard$AirFiber$AFLTU;,
        Lcom/ui/product/firmware/UiFirmwareBoard$AirFiber$AFLTUPTP;,
        Lcom/ui/product/firmware/UiFirmwareBoard$AirFiber$AFLTUROCKET;,
        Lcom/ui/product/firmware/UiFirmwareBoard$AirFiber$GMP;,
        Lcom/ui/product/firmware/UiFirmwareBoard$AirFiber$GP;,
        Lcom/ui/product/firmware/UiFirmwareBoard$AirFiber$XR;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00086\u0018\u00002\u00020\u0001:\u0008\u0008\t\n\u000b\u000c\r\u000e\u000fB\u0011\u0008\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007\u0082\u0001\u0008\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u00a8\u0006\u0018"
    }
    d2 = {
        "Lcom/ui/product/firmware/UiFirmwareBoard$AirFiber;",
        "Lcom/ui/product/firmware/UiFirmwareBoard;",
        "id",
        "",
        "<init>",
        "(Ljava/lang/String;)V",
        "getId",
        "()Ljava/lang/String;",
        "AF5XHD",
        "AFLTU",
        "AFLTUPTP",
        "AFLTUROCKET",
        "GP",
        "GMP",
        "AF60",
        "XR",
        "Lcom/ui/product/firmware/UiFirmwareBoard$AirFiber$AF5XHD;",
        "Lcom/ui/product/firmware/UiFirmwareBoard$AirFiber$AF60;",
        "Lcom/ui/product/firmware/UiFirmwareBoard$AirFiber$AFLTU;",
        "Lcom/ui/product/firmware/UiFirmwareBoard$AirFiber$AFLTUPTP;",
        "Lcom/ui/product/firmware/UiFirmwareBoard$AirFiber$AFLTUROCKET;",
        "Lcom/ui/product/firmware/UiFirmwareBoard$AirFiber$GMP;",
        "Lcom/ui/product/firmware/UiFirmwareBoard$AirFiber$GP;",
        "Lcom/ui/product/firmware/UiFirmwareBoard$AirFiber$XR;",
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


# instance fields
.field private final id:Ljava/lang/String;


# direct methods
.method private constructor <init>(Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Lcom/ui/product/firmware/UiFirmwareBoard;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lcom/ui/product/firmware/UiFirmwareBoard$AirFiber;->id:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/ui/product/firmware/UiFirmwareBoard$AirFiber;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ui/product/firmware/UiFirmwareBoard$AirFiber;->id:Ljava/lang/String;

    return-object v0
.end method
