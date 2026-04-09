.class public abstract Lcom/ui/product/firmware/UiFirmwareBoard$UFiber;
.super Lcom/ui/product/firmware/UiFirmwareBoard;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/product/firmware/UiFirmwareBoard;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "UFiber"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ui/product/firmware/UiFirmwareBoard$UFiber$Olt;,
        Lcom/ui/product/firmware/UiFirmwareBoard$UFiber$Onu;,
        Lcom/ui/product/firmware/UiFirmwareBoard$UFiber$UISPFIBEROLTXGS;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00086\u0018\u00002\u00020\u0001:\u0003\u0008\t\nB\u0011\u0008\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007\u0082\u0001\u0003\u000b\u000c\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lcom/ui/product/firmware/UiFirmwareBoard$UFiber;",
        "Lcom/ui/product/firmware/UiFirmwareBoard;",
        "id",
        "",
        "<init>",
        "(Ljava/lang/String;)V",
        "getId",
        "()Ljava/lang/String;",
        "Olt",
        "Onu",
        "UISPFIBEROLTXGS",
        "Lcom/ui/product/firmware/UiFirmwareBoard$UFiber$Olt;",
        "Lcom/ui/product/firmware/UiFirmwareBoard$UFiber$Onu;",
        "Lcom/ui/product/firmware/UiFirmwareBoard$UFiber$UISPFIBEROLTXGS;",
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

    iput-object p1, p0, Lcom/ui/product/firmware/UiFirmwareBoard$UFiber;->id:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/ui/product/firmware/UiFirmwareBoard$UFiber;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ui/product/firmware/UiFirmwareBoard$UFiber;->id:Ljava/lang/String;

    return-object v0
.end method
