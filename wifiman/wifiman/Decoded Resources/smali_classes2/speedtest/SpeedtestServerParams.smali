.class public final Lspeedtest/SpeedtestServerParams;
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

    invoke-static {}, Lspeedtest/SpeedtestServerParams;->__New()I

    move-result v0

    iput v0, p0, Lspeedtest/SpeedtestServerParams;->refnum:I

    invoke-static {v0, p0}, Lgo/Seq;->trackGoRef(ILgo/Seq$GoObject;)V

    return-void
.end method

.method constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lspeedtest/SpeedtestServerParams;->refnum:I

    invoke-static {p1, p0}, Lgo/Seq;->trackGoRef(ILgo/Seq$GoObject;)V

    return-void
.end method

.method private static native __New()I
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x0

    if-eqz p1, :cond_5

    instance-of v1, p1, Lspeedtest/SpeedtestServerParams;

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    check-cast p1, Lspeedtest/SpeedtestServerParams;

    invoke-virtual {p0}, Lspeedtest/SpeedtestServerParams;->getDiscovery()Lspeedtest/SpeedtestServerDiscoveryParams;

    move-result-object v1

    invoke-virtual {p1}, Lspeedtest/SpeedtestServerParams;->getDiscovery()Lspeedtest/SpeedtestServerDiscoveryParams;

    move-result-object v2

    if-nez v1, :cond_1

    if-eqz v2, :cond_2

    return v0

    :cond_1
    invoke-virtual {v1, v2}, Lspeedtest/SpeedtestServerDiscoveryParams;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v0

    :cond_2
    invoke-virtual {p0}, Lspeedtest/SpeedtestServerParams;->getHttpServer()Z

    move-result v1

    invoke-virtual {p1}, Lspeedtest/SpeedtestServerParams;->getHttpServer()Z

    move-result v2

    if-eq v1, v2, :cond_3

    return v0

    :cond_3
    invoke-virtual {p0}, Lspeedtest/SpeedtestServerParams;->getTcpServer()Z

    move-result v1

    invoke-virtual {p1}, Lspeedtest/SpeedtestServerParams;->getTcpServer()Z

    move-result p1

    if-eq v1, p1, :cond_4

    return v0

    :cond_4
    const/4 p1, 0x1

    return p1

    :cond_5
    :goto_0
    return v0
.end method

.method public final native getDiscovery()Lspeedtest/SpeedtestServerDiscoveryParams;
.end method

.method public final native getHttpServer()Z
.end method

.method public final native getTcpServer()Z
.end method

.method public hashCode()I
    .locals 3

    invoke-virtual {p0}, Lspeedtest/SpeedtestServerParams;->getDiscovery()Lspeedtest/SpeedtestServerDiscoveryParams;

    move-result-object v0

    invoke-virtual {p0}, Lspeedtest/SpeedtestServerParams;->getHttpServer()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {p0}, Lspeedtest/SpeedtestServerParams;->getTcpServer()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    filled-new-array {v0, v1, v2}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final incRefnum()I
    .locals 1

    iget v0, p0, Lspeedtest/SpeedtestServerParams;->refnum:I

    invoke-static {v0, p0}, Lgo/Seq;->incGoRef(ILgo/Seq$GoObject;)V

    iget v0, p0, Lspeedtest/SpeedtestServerParams;->refnum:I

    return v0
.end method

.method public final native setDiscovery(Lspeedtest/SpeedtestServerDiscoveryParams;)V
.end method

.method public final native setHttpServer(Z)V
.end method

.method public final native setTcpServer(Z)V
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "SpeedtestServerParams"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "{"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "Discovery:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lspeedtest/SpeedtestServerParams;->getDiscovery()Lspeedtest/SpeedtestServerDiscoveryParams;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ","

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "HttpServer:"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lspeedtest/SpeedtestServerParams;->getHttpServer()Z

    move-result v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "TcpServer:"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lspeedtest/SpeedtestServerParams;->getTcpServer()Z

    move-result v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
