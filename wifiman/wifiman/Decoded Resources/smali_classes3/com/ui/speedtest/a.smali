.class public abstract Lcom/ui/speedtest/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lspeedtest/SpeedtestError;)Lcom/ui/speedtest/UiSpeedtestLib$Error;
    .locals 6

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lspeedtest/SpeedtestError;->getID()J

    move-result-wide v0

    const-wide/16 v2, 0x1

    cmp-long v2, v0, v2

    const-string/jumbo v3, "message"

    if-nez v2, :cond_0

    new-instance v0, Lcom/ui/speedtest/UiSpeedtestLib$Error$Unknown;

    invoke-virtual {p0}, Lspeedtest/SpeedtestError;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, p0}, Lcom/ui/speedtest/UiSpeedtestLib$Error$Unknown;-><init>(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    const-wide/16 v4, 0x5

    cmp-long v2, v0, v4

    if-nez v2, :cond_1

    new-instance v0, Lcom/ui/speedtest/UiSpeedtestLib$Error$IO;

    invoke-virtual {p0}, Lspeedtest/SpeedtestError;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, p0}, Lcom/ui/speedtest/UiSpeedtestLib$Error$IO;-><init>(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    const-wide/16 v4, 0x3

    cmp-long v2, v0, v4

    if-nez v2, :cond_2

    new-instance v0, Lcom/ui/speedtest/UiSpeedtestLib$Error$Http;

    invoke-virtual {p0}, Lspeedtest/SpeedtestError;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, p0}, Lcom/ui/speedtest/UiSpeedtestLib$Error$Http;-><init>(Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    const-wide/16 v4, 0x4

    cmp-long v2, v0, v4

    if-nez v2, :cond_3

    new-instance v0, Lcom/ui/speedtest/UiSpeedtestLib$Error$HttpResponseInvalid;

    invoke-virtual {p0}, Lspeedtest/SpeedtestError;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, p0}, Lcom/ui/speedtest/UiSpeedtestLib$Error$HttpResponseInvalid;-><init>(Ljava/lang/String;)V

    goto :goto_0

    :cond_3
    const-wide/16 v4, 0x6

    cmp-long v2, v0, v4

    if-nez v2, :cond_4

    new-instance v0, Lcom/ui/speedtest/UiSpeedtestLib$Error$NoSpeedtestServersAvailable;

    invoke-virtual {p0}, Lspeedtest/SpeedtestError;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, p0}, Lcom/ui/speedtest/UiSpeedtestLib$Error$NoSpeedtestServersAvailable;-><init>(Ljava/lang/String;)V

    goto :goto_0

    :cond_4
    const-wide/16 v4, 0x7

    cmp-long v0, v0, v4

    if-nez v0, :cond_5

    new-instance v0, Lcom/ui/speedtest/UiSpeedtestLib$Error$Internal;

    invoke-virtual {p0}, Lspeedtest/SpeedtestError;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, p0}, Lcom/ui/speedtest/UiSpeedtestLib$Error$Internal;-><init>(Ljava/lang/String;)V

    goto :goto_0

    :cond_5
    new-instance v0, Lcom/ui/speedtest/UiSpeedtestLib$Error$Unknown;

    invoke-virtual {p0}, Lspeedtest/SpeedtestError;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, p0}, Lcom/ui/speedtest/UiSpeedtestLib$Error$Unknown;-><init>(Ljava/lang/String;)V

    :goto_0
    return-object v0
.end method
