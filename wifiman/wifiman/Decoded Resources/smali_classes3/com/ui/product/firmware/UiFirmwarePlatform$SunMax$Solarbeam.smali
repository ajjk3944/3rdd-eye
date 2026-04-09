.class public final Lcom/ui/product/firmware/UiFirmwarePlatform$SunMax$Solarbeam;
.super Lcom/ui/product/firmware/UiFirmwarePlatform$SunMax;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/product/firmware/UiFirmwarePlatform$SunMax;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Solarbeam"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Lcom/ui/product/firmware/UiFirmwarePlatform$SunMax$Solarbeam;",
        "Lcom/ui/product/firmware/UiFirmwarePlatform$SunMax;",
        "<init>",
        "()V",
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
.field public static final INSTANCE:Lcom/ui/product/firmware/UiFirmwarePlatform$SunMax$Solarbeam;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ui/product/firmware/UiFirmwarePlatform$SunMax$Solarbeam;

    invoke-direct {v0}, Lcom/ui/product/firmware/UiFirmwarePlatform$SunMax$Solarbeam;-><init>()V

    sput-object v0, Lcom/ui/product/firmware/UiFirmwarePlatform$SunMax$Solarbeam;->INSTANCE:Lcom/ui/product/firmware/UiFirmwarePlatform$SunMax$Solarbeam;

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    const-string/jumbo v0, "solarbeam"

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lcom/ui/product/firmware/UiFirmwarePlatform$SunMax;-><init>(Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method
