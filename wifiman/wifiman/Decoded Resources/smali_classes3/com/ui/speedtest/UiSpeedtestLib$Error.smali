.class public abstract Lcom/ui/speedtest/UiSpeedtestLib$Error;
.super Ljava/lang/RuntimeException;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/speedtest/UiSpeedtestLib;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "Error"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ui/speedtest/UiSpeedtestLib$Error$Http;,
        Lcom/ui/speedtest/UiSpeedtestLib$Error$HttpResponseInvalid;,
        Lcom/ui/speedtest/UiSpeedtestLib$Error$IO;,
        Lcom/ui/speedtest/UiSpeedtestLib$Error$Internal;,
        Lcom/ui/speedtest/UiSpeedtestLib$Error$NoSpeedtestServersAvailable;,
        Lcom/ui/speedtest/UiSpeedtestLib$Error$Unknown;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00086\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0006\u0004\u0005\u0006\u0007\u0008\tB\u0007\u0008\u0004\u00a2\u0006\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\u000c\r\u000e\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "Lcom/ui/speedtest/UiSpeedtestLib$Error;",
        "Ljava/lang/RuntimeException;",
        "Lkotlin/RuntimeException;",
        "()V",
        "Http",
        "HttpResponseInvalid",
        "IO",
        "Internal",
        "NoSpeedtestServersAvailable",
        "Unknown",
        "Lcom/ui/speedtest/UiSpeedtestLib$Error$Http;",
        "Lcom/ui/speedtest/UiSpeedtestLib$Error$HttpResponseInvalid;",
        "Lcom/ui/speedtest/UiSpeedtestLib$Error$IO;",
        "Lcom/ui/speedtest/UiSpeedtestLib$Error$Internal;",
        "Lcom/ui/speedtest/UiSpeedtestLib$Error$NoSpeedtestServersAvailable;",
        "Lcom/ui/speedtest/UiSpeedtestLib$Error$Unknown;",
        "speedtest_release"
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
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/RuntimeException;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/ui/speedtest/UiSpeedtestLib$Error;-><init>()V

    return-void
.end method
