.class public abstract Lcom/ui/product/firmware/UiFirmwareBoard;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ui/product/firmware/UiFirmwareBoard$AirCube;,
        Lcom/ui/product/firmware/UiFirmwareBoard$AirFiber;,
        Lcom/ui/product/firmware/UiFirmwareBoard$AirMax;,
        Lcom/ui/product/firmware/UiFirmwareBoard$Companion;,
        Lcom/ui/product/firmware/UiFirmwareBoard$EdgeMax;,
        Lcom/ui/product/firmware/UiFirmwareBoard$SunMax;,
        Lcom/ui/product/firmware/UiFirmwareBoard$UFiber;,
        Lcom/ui/product/firmware/UiFirmwareBoard$Uisp;,
        Lcom/ui/product/firmware/UiFirmwareBoard$Unknown;,
        Lcom/ui/product/firmware/UiFirmwareBoard$Unms;,
        Lcom/ui/product/firmware/UiFirmwareBoard$Wave;,
        Lcom/ui/product/firmware/UiFirmwareBoard$WiFiman;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00086\u0018\u0000 \u00132\u00020\u0001:\u000c\u0008\t\n\u000b\u000c\r\u000e\u000f\u0010\u0011\u0012\u0013B\t\u0008\u0004\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u00020\u0005X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0006\u0010\u0007\u0082\u0001\u000b\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u00a8\u0006\u001f"
    }
    d2 = {
        "Lcom/ui/product/firmware/UiFirmwareBoard;",
        "Ljava/io/Serializable;",
        "<init>",
        "()V",
        "id",
        "",
        "getId",
        "()Ljava/lang/String;",
        "AirMax",
        "AirFiber",
        "Wave",
        "EdgeMax",
        "Unms",
        "Uisp",
        "AirCube",
        "UFiber",
        "SunMax",
        "WiFiman",
        "Unknown",
        "Companion",
        "Lcom/ui/product/firmware/UiFirmwareBoard$AirCube;",
        "Lcom/ui/product/firmware/UiFirmwareBoard$AirFiber;",
        "Lcom/ui/product/firmware/UiFirmwareBoard$AirMax;",
        "Lcom/ui/product/firmware/UiFirmwareBoard$EdgeMax;",
        "Lcom/ui/product/firmware/UiFirmwareBoard$SunMax;",
        "Lcom/ui/product/firmware/UiFirmwareBoard$UFiber;",
        "Lcom/ui/product/firmware/UiFirmwareBoard$Uisp;",
        "Lcom/ui/product/firmware/UiFirmwareBoard$Unknown;",
        "Lcom/ui/product/firmware/UiFirmwareBoard$Unms;",
        "Lcom/ui/product/firmware/UiFirmwareBoard$Wave;",
        "Lcom/ui/product/firmware/UiFirmwareBoard$WiFiman;",
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


# static fields
.field public static final Companion:Lcom/ui/product/firmware/UiFirmwareBoard$Companion;

.field private static final values$delegate:LYg/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYg/m;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/ui/product/firmware/UiFirmwareBoard$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ui/product/firmware/UiFirmwareBoard$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/ui/product/firmware/UiFirmwareBoard;->Companion:Lcom/ui/product/firmware/UiFirmwareBoard$Companion;

    new-instance v0, LDa/a;

    invoke-direct {v0}, LDa/a;-><init>()V

    invoke-static {v0}, LYg/n;->b(Lmh/a;)LYg/m;

    move-result-object v0

    sput-object v0, Lcom/ui/product/firmware/UiFirmwareBoard;->values$delegate:LYg/m;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/ui/product/firmware/UiFirmwareBoard;-><init>()V

    return-void
.end method

.method public static synthetic a()Ljava/util/List;
    .locals 1

    invoke-static {}, Lcom/ui/product/firmware/UiFirmwareBoard;->values_delegate$lambda$1()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$getValues$delegate$cp()LYg/m;
    .locals 1

    sget-object v0, Lcom/ui/product/firmware/UiFirmwareBoard;->values$delegate:LYg/m;

    return-object v0
.end method

.method public static final fromId(Ljava/lang/String;)Lcom/ui/product/firmware/UiFirmwareBoard;
    .locals 1

    sget-object v0, Lcom/ui/product/firmware/UiFirmwareBoard;->Companion:Lcom/ui/product/firmware/UiFirmwareBoard$Companion;

    invoke-virtual {v0, p0}, Lcom/ui/product/firmware/UiFirmwareBoard$Companion;->fromId(Ljava/lang/String;)Lcom/ui/product/firmware/UiFirmwareBoard;

    move-result-object p0

    return-object p0
.end method

.method private static final values_delegate$lambda$1()Ljava/util/List;
    .locals 3

    const-class v0, Lcom/ui/product/firmware/UiFirmwareBoard;

    invoke-static {v0}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lth/d;

    move-result-object v0

    invoke-static {v0}, LHa/a;->a(Lth/d;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lth/d;

    invoke-interface {v2}, Lth/d;->B()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ui/product/firmware/UiFirmwareBoard;

    if-eqz v2, :cond_0

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v1
.end method


# virtual methods
.method public abstract getId()Ljava/lang/String;
.end method
