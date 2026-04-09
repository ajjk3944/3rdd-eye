.class public final Lspeedtest/SpeedTestApiTestReportClientInfo;
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

    invoke-static {}, Lspeedtest/SpeedTestApiTestReportClientInfo;->__New()I

    move-result v0

    iput v0, p0, Lspeedtest/SpeedTestApiTestReportClientInfo;->refnum:I

    invoke-static {v0, p0}, Lgo/Seq;->trackGoRef(ILgo/Seq$GoObject;)V

    return-void
.end method

.method constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lspeedtest/SpeedTestApiTestReportClientInfo;->refnum:I

    invoke-static {p1, p0}, Lgo/Seq;->trackGoRef(ILgo/Seq$GoObject;)V

    return-void
.end method

.method private static native __New()I
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x0

    if-eqz p1, :cond_11

    instance-of v1, p1, Lspeedtest/SpeedTestApiTestReportClientInfo;

    if-nez v1, :cond_0

    goto/16 :goto_0

    :cond_0
    check-cast p1, Lspeedtest/SpeedTestApiTestReportClientInfo;

    invoke-virtual {p0}, Lspeedtest/SpeedTestApiTestReportClientInfo;->getSource()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lspeedtest/SpeedTestApiTestReportClientInfo;->getSource()Ljava/lang/String;

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
    invoke-virtual {p0}, Lspeedtest/SpeedTestApiTestReportClientInfo;->getPlatform()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lspeedtest/SpeedTestApiTestReportClientInfo;->getPlatform()Ljava/lang/String;

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
    invoke-virtual {p0}, Lspeedtest/SpeedTestApiTestReportClientInfo;->getAppName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lspeedtest/SpeedTestApiTestReportClientInfo;->getAppName()Ljava/lang/String;

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
    invoke-virtual {p0}, Lspeedtest/SpeedTestApiTestReportClientInfo;->getAppVersion()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lspeedtest/SpeedTestApiTestReportClientInfo;->getAppVersion()Ljava/lang/String;

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
    invoke-virtual {p0}, Lspeedtest/SpeedTestApiTestReportClientInfo;->getDeviceModel()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lspeedtest/SpeedTestApiTestReportClientInfo;->getDeviceModel()Ljava/lang/String;

    move-result-object v2

    if-nez v1, :cond_9

    if-eqz v2, :cond_a

    return v0

    :cond_9
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v0

    :cond_a
    invoke-virtual {p0}, Lspeedtest/SpeedTestApiTestReportClientInfo;->getDeviceManufacturer()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lspeedtest/SpeedTestApiTestReportClientInfo;->getDeviceManufacturer()Ljava/lang/String;

    move-result-object v2

    if-nez v1, :cond_b

    if-eqz v2, :cond_c

    return v0

    :cond_b
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v0

    :cond_c
    invoke-virtual {p0}, Lspeedtest/SpeedTestApiTestReportClientInfo;->getOs()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lspeedtest/SpeedTestApiTestReportClientInfo;->getOs()Ljava/lang/String;

    move-result-object v2

    if-nez v1, :cond_d

    if-eqz v2, :cond_e

    return v0

    :cond_d
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    return v0

    :cond_e
    invoke-virtual {p0}, Lspeedtest/SpeedTestApiTestReportClientInfo;->getOsVersion()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lspeedtest/SpeedTestApiTestReportClientInfo;->getOsVersion()Ljava/lang/String;

    move-result-object p1

    if-nez v1, :cond_f

    if-eqz p1, :cond_10

    return v0

    :cond_f
    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_10

    return v0

    :cond_10
    const/4 p1, 0x1

    return p1

    :cond_11
    :goto_0
    return v0
.end method

.method public final native getAppName()Ljava/lang/String;
.end method

.method public final native getAppVersion()Ljava/lang/String;
.end method

.method public final native getDeviceManufacturer()Ljava/lang/String;
.end method

.method public final native getDeviceModel()Ljava/lang/String;
.end method

.method public final native getOs()Ljava/lang/String;
.end method

.method public final native getOsVersion()Ljava/lang/String;
.end method

.method public final native getPlatform()Ljava/lang/String;
.end method

.method public final native getSource()Ljava/lang/String;
.end method

.method public hashCode()I
    .locals 8

    invoke-virtual {p0}, Lspeedtest/SpeedTestApiTestReportClientInfo;->getSource()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lspeedtest/SpeedTestApiTestReportClientInfo;->getPlatform()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lspeedtest/SpeedTestApiTestReportClientInfo;->getAppName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lspeedtest/SpeedTestApiTestReportClientInfo;->getAppVersion()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Lspeedtest/SpeedTestApiTestReportClientInfo;->getDeviceModel()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0}, Lspeedtest/SpeedTestApiTestReportClientInfo;->getDeviceManufacturer()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p0}, Lspeedtest/SpeedTestApiTestReportClientInfo;->getOs()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p0}, Lspeedtest/SpeedTestApiTestReportClientInfo;->getOsVersion()Ljava/lang/String;

    move-result-object v7

    filled-new-array/range {v0 .. v7}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final incRefnum()I
    .locals 1

    iget v0, p0, Lspeedtest/SpeedTestApiTestReportClientInfo;->refnum:I

    invoke-static {v0, p0}, Lgo/Seq;->incGoRef(ILgo/Seq$GoObject;)V

    iget v0, p0, Lspeedtest/SpeedTestApiTestReportClientInfo;->refnum:I

    return v0
.end method

.method public final native setAppName(Ljava/lang/String;)V
.end method

.method public final native setAppVersion(Ljava/lang/String;)V
.end method

.method public final native setDeviceManufacturer(Ljava/lang/String;)V
.end method

.method public final native setDeviceModel(Ljava/lang/String;)V
.end method

.method public final native setOs(Ljava/lang/String;)V
.end method

.method public final native setOsVersion(Ljava/lang/String;)V
.end method

.method public final native setPlatform(Ljava/lang/String;)V
.end method

.method public final native setSource(Ljava/lang/String;)V
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "SpeedTestApiTestReportClientInfo"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "{"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "Source:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lspeedtest/SpeedTestApiTestReportClientInfo;->getSource()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ","

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "Platform:"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lspeedtest/SpeedTestApiTestReportClientInfo;->getPlatform()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "AppName:"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lspeedtest/SpeedTestApiTestReportClientInfo;->getAppName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "AppVersion:"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lspeedtest/SpeedTestApiTestReportClientInfo;->getAppVersion()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "DeviceModel:"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lspeedtest/SpeedTestApiTestReportClientInfo;->getDeviceModel()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "DeviceManufacturer:"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lspeedtest/SpeedTestApiTestReportClientInfo;->getDeviceManufacturer()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "Os:"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lspeedtest/SpeedTestApiTestReportClientInfo;->getOs()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "OsVersion:"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lspeedtest/SpeedTestApiTestReportClientInfo;->getOsVersion()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
