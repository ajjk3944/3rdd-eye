.class public final Lspeedtest/SpeedtestServerDiscoveryParams;
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

    invoke-static {}, Lspeedtest/SpeedtestServerDiscoveryParams;->__New()I

    move-result v0

    iput v0, p0, Lspeedtest/SpeedtestServerDiscoveryParams;->refnum:I

    invoke-static {v0, p0}, Lgo/Seq;->trackGoRef(ILgo/Seq$GoObject;)V

    return-void
.end method

.method constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lspeedtest/SpeedtestServerDiscoveryParams;->refnum:I

    invoke-static {p1, p0}, Lgo/Seq;->trackGoRef(ILgo/Seq$GoObject;)V

    return-void
.end method

.method private static native __New()I
.end method


# virtual methods
.method public native additionalTxtRecord(Ljava/lang/String;Ljava/lang/String;)V
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x0

    if-eqz p1, :cond_b

    instance-of v1, p1, Lspeedtest/SpeedtestServerDiscoveryParams;

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    check-cast p1, Lspeedtest/SpeedtestServerDiscoveryParams;

    invoke-virtual {p0}, Lspeedtest/SpeedtestServerDiscoveryParams;->getIp()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lspeedtest/SpeedtestServerDiscoveryParams;->getIp()Ljava/lang/String;

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
    invoke-virtual {p0}, Lspeedtest/SpeedtestServerDiscoveryParams;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lspeedtest/SpeedtestServerDiscoveryParams;->getName()Ljava/lang/String;

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
    invoke-virtual {p0}, Lspeedtest/SpeedtestServerDiscoveryParams;->getVersion()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lspeedtest/SpeedtestServerDiscoveryParams;->getVersion()Ljava/lang/String;

    move-result-object v2

    if-nez v1, :cond_5

    if-eqz v2, :cond_6

    return v0

    :cond_5
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v0

    :cond_6
    invoke-virtual {p0}, Lspeedtest/SpeedtestServerDiscoveryParams;->getModel()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lspeedtest/SpeedtestServerDiscoveryParams;->getModel()Ljava/lang/String;

    move-result-object v2

    if-nez v1, :cond_7

    if-eqz v2, :cond_8

    return v0

    :cond_7
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v0

    :cond_8
    invoke-virtual {p0}, Lspeedtest/SpeedtestServerDiscoveryParams;->getType()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lspeedtest/SpeedtestServerDiscoveryParams;->getType()Ljava/lang/String;

    move-result-object p1

    if-nez v1, :cond_9

    if-eqz p1, :cond_a

    return v0

    :cond_9
    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_a

    return v0

    :cond_a
    const/4 p1, 0x1

    return p1

    :cond_b
    :goto_0
    return v0
.end method

.method public final native getIp()Ljava/lang/String;
.end method

.method public final native getModel()Ljava/lang/String;
.end method

.method public final native getName()Ljava/lang/String;
.end method

.method public final native getType()Ljava/lang/String;
.end method

.method public final native getVersion()Ljava/lang/String;
.end method

.method public hashCode()I
    .locals 5

    invoke-virtual {p0}, Lspeedtest/SpeedtestServerDiscoveryParams;->getIp()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lspeedtest/SpeedtestServerDiscoveryParams;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lspeedtest/SpeedtestServerDiscoveryParams;->getVersion()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lspeedtest/SpeedtestServerDiscoveryParams;->getModel()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Lspeedtest/SpeedtestServerDiscoveryParams;->getType()Ljava/lang/String;

    move-result-object v4

    filled-new-array {v0, v1, v2, v3, v4}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final incRefnum()I
    .locals 1

    iget v0, p0, Lspeedtest/SpeedtestServerDiscoveryParams;->refnum:I

    invoke-static {v0, p0}, Lgo/Seq;->incGoRef(ILgo/Seq$GoObject;)V

    iget v0, p0, Lspeedtest/SpeedtestServerDiscoveryParams;->refnum:I

    return v0
.end method

.method public final native setIp(Ljava/lang/String;)V
.end method

.method public final native setModel(Ljava/lang/String;)V
.end method

.method public final native setName(Ljava/lang/String;)V
.end method

.method public final native setType(Ljava/lang/String;)V
.end method

.method public final native setVersion(Ljava/lang/String;)V
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "SpeedtestServerDiscoveryParams"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "{"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "Ip:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lspeedtest/SpeedtestServerDiscoveryParams;->getIp()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ","

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "Name:"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lspeedtest/SpeedtestServerDiscoveryParams;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "Version:"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lspeedtest/SpeedtestServerDiscoveryParams;->getVersion()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "Model:"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lspeedtest/SpeedtestServerDiscoveryParams;->getModel()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "Type:"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lspeedtest/SpeedtestServerDiscoveryParams;->getType()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
