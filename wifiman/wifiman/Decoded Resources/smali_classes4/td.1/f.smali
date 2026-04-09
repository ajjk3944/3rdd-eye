.class public abstract Ltd/f;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lcom/ui/speedtest/UiSpeedtestLib$Error;)Lcom/ui/wifiman/model/speedtest/Speedtest$Error;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Lcom/ui/speedtest/UiSpeedtestLib$Error$Unknown;

    if-eqz v0, :cond_0

    new-instance v0, Lcom/ui/wifiman/model/speedtest/Speedtest$Error$Unexpected;

    invoke-direct {v0, p0}, Lcom/ui/wifiman/model/speedtest/Speedtest$Error$Unexpected;-><init>(Ljava/lang/Throwable;)V

    goto :goto_1

    :cond_0
    instance-of v0, p0, Lcom/ui/speedtest/UiSpeedtestLib$Error$Internal;

    if-eqz v0, :cond_1

    new-instance v0, Lcom/ui/wifiman/model/speedtest/Speedtest$Error$Internal;

    invoke-direct {v0, p0}, Lcom/ui/wifiman/model/speedtest/Speedtest$Error$Internal;-><init>(Ljava/lang/Throwable;)V

    goto :goto_1

    :cond_1
    instance-of v0, p0, Lcom/ui/speedtest/UiSpeedtestLib$Error$NoSpeedtestServersAvailable;

    if-nez v0, :cond_3

    instance-of v0, p0, Lcom/ui/speedtest/UiSpeedtestLib$Error$Http;

    if-nez v0, :cond_3

    instance-of v0, p0, Lcom/ui/speedtest/UiSpeedtestLib$Error$IO;

    if-nez v0, :cond_3

    instance-of v0, p0, Lcom/ui/speedtest/UiSpeedtestLib$Error$HttpResponseInvalid;

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_3
    :goto_0
    new-instance v0, Lcom/ui/wifiman/model/speedtest/Speedtest$Error$NetworkConnection;

    invoke-direct {v0, p0}, Lcom/ui/wifiman/model/speedtest/Speedtest$Error$NetworkConnection;-><init>(Ljava/lang/Throwable;)V

    :goto_1
    return-object v0
.end method
