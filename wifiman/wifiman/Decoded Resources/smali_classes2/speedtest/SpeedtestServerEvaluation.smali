.class public final Lspeedtest/SpeedtestServerEvaluation;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgo/Seq$Proxy;


# instance fields
.field private final refnum:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    invoke-static {}, Lspeedtest/Speedtest;->touch()V

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lspeedtest/SpeedtestServerEvaluation;->__New()I

    move-result v0

    iput v0, p0, Lspeedtest/SpeedtestServerEvaluation;->refnum:I

    invoke-static {v0, p0}, Lgo/Seq;->trackGoRef(ILgo/Seq$GoObject;)V

    return-void
.end method

.method constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lspeedtest/SpeedtestServerEvaluation;->refnum:I

    invoke-static {p1, p0}, Lgo/Seq;->trackGoRef(ILgo/Seq$GoObject;)V

    return-void
.end method

.method private static native __New()I
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x0

    if-eqz p1, :cond_c

    instance-of v1, p1, Lspeedtest/SpeedtestServerEvaluation;

    if-nez v1, :cond_0

    goto/16 :goto_0

    :cond_0
    check-cast p1, Lspeedtest/SpeedtestServerEvaluation;

    invoke-virtual {p0}, Lspeedtest/SpeedtestServerEvaluation;->getUrl()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lspeedtest/SpeedtestServerEvaluation;->getUrl()Ljava/lang/String;

    move-result-object v2

    if-nez v1, :cond_1

    if-eqz v2, :cond_2

    return v0

    :cond_1
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v0

    :cond_2
    invoke-virtual {p0}, Lspeedtest/SpeedtestServerEvaluation;->getVersion()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lspeedtest/SpeedtestServerEvaluation;->getVersion()Ljava/lang/String;

    move-result-object v2

    if-nez v1, :cond_3

    if-eqz v2, :cond_4

    return v0

    :cond_3
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v0

    :cond_4
    invoke-virtual {p0}, Lspeedtest/SpeedtestServerEvaluation;->getLatency()Lspeedtest/Duration;

    move-result-object v1

    invoke-virtual {p1}, Lspeedtest/SpeedtestServerEvaluation;->getLatency()Lspeedtest/Duration;

    move-result-object v2

    if-nez v1, :cond_5

    if-eqz v2, :cond_6

    return v0

    :cond_5
    invoke-virtual {v1, v2}, Lspeedtest/Duration;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v0

    :cond_6
    invoke-virtual {p0}, Lspeedtest/SpeedtestServerEvaluation;->getJitter()Lspeedtest/Duration;

    move-result-object v1

    invoke-virtual {p1}, Lspeedtest/SpeedtestServerEvaluation;->getJitter()Lspeedtest/Duration;

    move-result-object v2

    if-nez v1, :cond_7

    if-eqz v2, :cond_8

    return v0

    :cond_7
    invoke-virtual {v1, v2}, Lspeedtest/Duration;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v0

    :cond_8
    invoke-virtual {p0}, Lspeedtest/SpeedtestServerEvaluation;->getPacketLoss()Z

    move-result v1

    invoke-virtual {p1}, Lspeedtest/SpeedtestServerEvaluation;->getPacketLoss()Z

    move-result v2

    if-eq v1, v2, :cond_9

    return v0

    :cond_9
    invoke-virtual {p0}, Lspeedtest/SpeedtestServerEvaluation;->getErr()Lspeedtest/SpeedtestError;

    move-result-object v1

    invoke-virtual {p1}, Lspeedtest/SpeedtestServerEvaluation;->getErr()Lspeedtest/SpeedtestError;

    move-result-object p1

    if-nez v1, :cond_a

    if-eqz p1, :cond_b

    return v0

    :cond_a
    invoke-virtual {v1, p1}, Lspeedtest/SpeedtestError;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_b

    return v0

    :cond_b
    const/4 p1, 0x1

    return p1

    :cond_c
    :goto_0
    return v0
.end method

.method public final native getErr()Lspeedtest/SpeedtestError;
.end method

.method public final native getJitter()Lspeedtest/Duration;
.end method

.method public final native getLatency()Lspeedtest/Duration;
.end method

.method public final native getPacketLoss()Z
.end method

.method public final native getUrl()Ljava/lang/String;
.end method

.method public final native getVersion()Ljava/lang/String;
.end method

.method public hashCode()I
    .locals 6

    invoke-virtual {p0}, Lspeedtest/SpeedtestServerEvaluation;->getUrl()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lspeedtest/SpeedtestServerEvaluation;->getVersion()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lspeedtest/SpeedtestServerEvaluation;->getLatency()Lspeedtest/Duration;

    move-result-object v2

    invoke-virtual {p0}, Lspeedtest/SpeedtestServerEvaluation;->getJitter()Lspeedtest/Duration;

    move-result-object v3

    invoke-virtual {p0}, Lspeedtest/SpeedtestServerEvaluation;->getPacketLoss()Z

    move-result v4

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    invoke-virtual {p0}, Lspeedtest/SpeedtestServerEvaluation;->getErr()Lspeedtest/SpeedtestError;

    move-result-object v5

    filled-new-array/range {v0 .. v5}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final incRefnum()I
    .locals 1

    iget v0, p0, Lspeedtest/SpeedtestServerEvaluation;->refnum:I

    invoke-static {v0, p0}, Lgo/Seq;->incGoRef(ILgo/Seq$GoObject;)V

    iget v0, p0, Lspeedtest/SpeedtestServerEvaluation;->refnum:I

    return v0
.end method

.method public final native setErr(Lspeedtest/SpeedtestError;)V
.end method

.method public final native setJitter(Lspeedtest/Duration;)V
.end method

.method public final native setLatency(Lspeedtest/Duration;)V
.end method

.method public final native setPacketLoss(Z)V
.end method

.method public final native setUrl(Ljava/lang/String;)V
.end method

.method public final native setVersion(Ljava/lang/String;)V
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "SpeedtestServerEvaluation"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "{"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "Url:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lspeedtest/SpeedtestServerEvaluation;->getUrl()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ","

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "Version:"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lspeedtest/SpeedtestServerEvaluation;->getVersion()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "Latency:"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lspeedtest/SpeedtestServerEvaluation;->getLatency()Lspeedtest/Duration;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "Jitter:"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lspeedtest/SpeedtestServerEvaluation;->getJitter()Lspeedtest/Duration;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "PacketLoss:"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lspeedtest/SpeedtestServerEvaluation;->getPacketLoss()Z

    move-result v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "Err:"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lspeedtest/SpeedtestServerEvaluation;->getErr()Lspeedtest/SpeedtestError;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
