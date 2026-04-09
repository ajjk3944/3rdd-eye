.class public final Lspeedtest/SpeedtestApiIpStats;
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

    invoke-static {}, Lspeedtest/SpeedtestApiIpStats;->__New()I

    move-result v0

    iput v0, p0, Lspeedtest/SpeedtestApiIpStats;->refnum:I

    invoke-static {v0, p0}, Lgo/Seq;->trackGoRef(ILgo/Seq$GoObject;)V

    return-void
.end method

.method constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lspeedtest/SpeedtestApiIpStats;->refnum:I

    invoke-static {p1, p0}, Lgo/Seq;->trackGoRef(ILgo/Seq$GoObject;)V

    return-void
.end method

.method private static native __New()I
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x0

    if-eqz p1, :cond_13

    instance-of v1, p1, Lspeedtest/SpeedtestApiIpStats;

    if-nez v1, :cond_0

    goto/16 :goto_0

    :cond_0
    check-cast p1, Lspeedtest/SpeedtestApiIpStats;

    invoke-virtual {p0}, Lspeedtest/SpeedtestApiIpStats;->getIp()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lspeedtest/SpeedtestApiIpStats;->getIp()Ljava/lang/String;

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
    invoke-virtual {p0}, Lspeedtest/SpeedtestApiIpStats;->getIsp()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lspeedtest/SpeedtestApiIpStats;->getIsp()Ljava/lang/String;

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
    invoke-virtual {p0}, Lspeedtest/SpeedtestApiIpStats;->getIspIcon()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lspeedtest/SpeedtestApiIpStats;->getIspIcon()Ljava/lang/String;

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
    invoke-virtual {p0}, Lspeedtest/SpeedtestApiIpStats;->getOrganization()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lspeedtest/SpeedtestApiIpStats;->getOrganization()Ljava/lang/String;

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
    invoke-virtual {p0}, Lspeedtest/SpeedtestApiIpStats;->getCountry()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lspeedtest/SpeedtestApiIpStats;->getCountry()Ljava/lang/String;

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
    invoke-virtual {p0}, Lspeedtest/SpeedtestApiIpStats;->getCountryCode()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lspeedtest/SpeedtestApiIpStats;->getCountryCode()Ljava/lang/String;

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
    invoke-virtual {p0}, Lspeedtest/SpeedtestApiIpStats;->getLocation()Lspeedtest/LocationCoordinates;

    move-result-object v1

    invoke-virtual {p1}, Lspeedtest/SpeedtestApiIpStats;->getLocation()Lspeedtest/LocationCoordinates;

    move-result-object v2

    if-nez v1, :cond_d

    if-eqz v2, :cond_e

    return v0

    :cond_d
    invoke-virtual {v1, v2}, Lspeedtest/LocationCoordinates;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    return v0

    :cond_e
    invoke-virtual {p0}, Lspeedtest/SpeedtestApiIpStats;->getTimezone()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lspeedtest/SpeedtestApiIpStats;->getTimezone()Ljava/lang/String;

    move-result-object v2

    if-nez v1, :cond_f

    if-eqz v2, :cond_10

    return v0

    :cond_f
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_10

    return v0

    :cond_10
    invoke-virtual {p0}, Lspeedtest/SpeedtestApiIpStats;->getError()Lspeedtest/SpeedtestError;

    move-result-object v1

    invoke-virtual {p1}, Lspeedtest/SpeedtestApiIpStats;->getError()Lspeedtest/SpeedtestError;

    move-result-object p1

    if-nez v1, :cond_11

    if-eqz p1, :cond_12

    return v0

    :cond_11
    invoke-virtual {v1, p1}, Lspeedtest/SpeedtestError;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_12

    return v0

    :cond_12
    const/4 p1, 0x1

    return p1

    :cond_13
    :goto_0
    return v0
.end method

.method public final native getCountry()Ljava/lang/String;
.end method

.method public final native getCountryCode()Ljava/lang/String;
.end method

.method public final native getError()Lspeedtest/SpeedtestError;
.end method

.method public final native getIp()Ljava/lang/String;
.end method

.method public final native getIsp()Ljava/lang/String;
.end method

.method public final native getIspIcon()Ljava/lang/String;
.end method

.method public final native getLocation()Lspeedtest/LocationCoordinates;
.end method

.method public final native getOrganization()Ljava/lang/String;
.end method

.method public final native getTimezone()Ljava/lang/String;
.end method

.method public hashCode()I
    .locals 9

    invoke-virtual {p0}, Lspeedtest/SpeedtestApiIpStats;->getIp()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lspeedtest/SpeedtestApiIpStats;->getIsp()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lspeedtest/SpeedtestApiIpStats;->getIspIcon()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lspeedtest/SpeedtestApiIpStats;->getOrganization()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Lspeedtest/SpeedtestApiIpStats;->getCountry()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0}, Lspeedtest/SpeedtestApiIpStats;->getCountryCode()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p0}, Lspeedtest/SpeedtestApiIpStats;->getLocation()Lspeedtest/LocationCoordinates;

    move-result-object v6

    invoke-virtual {p0}, Lspeedtest/SpeedtestApiIpStats;->getTimezone()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p0}, Lspeedtest/SpeedtestApiIpStats;->getError()Lspeedtest/SpeedtestError;

    move-result-object v8

    filled-new-array/range {v0 .. v8}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final incRefnum()I
    .locals 1

    iget v0, p0, Lspeedtest/SpeedtestApiIpStats;->refnum:I

    invoke-static {v0, p0}, Lgo/Seq;->incGoRef(ILgo/Seq$GoObject;)V

    iget v0, p0, Lspeedtest/SpeedtestApiIpStats;->refnum:I

    return v0
.end method

.method public final native setCountry(Ljava/lang/String;)V
.end method

.method public final native setCountryCode(Ljava/lang/String;)V
.end method

.method public final native setError(Lspeedtest/SpeedtestError;)V
.end method

.method public final native setIp(Ljava/lang/String;)V
.end method

.method public final native setIsp(Ljava/lang/String;)V
.end method

.method public final native setIspIcon(Ljava/lang/String;)V
.end method

.method public final native setLocation(Lspeedtest/LocationCoordinates;)V
.end method

.method public final native setOrganization(Ljava/lang/String;)V
.end method

.method public final native setTimezone(Ljava/lang/String;)V
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "SpeedtestApiIpStats"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "{"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "Ip:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lspeedtest/SpeedtestApiIpStats;->getIp()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ","

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "Isp:"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lspeedtest/SpeedtestApiIpStats;->getIsp()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "IspIcon:"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lspeedtest/SpeedtestApiIpStats;->getIspIcon()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "Organization:"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lspeedtest/SpeedtestApiIpStats;->getOrganization()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "Country:"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lspeedtest/SpeedtestApiIpStats;->getCountry()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "CountryCode:"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lspeedtest/SpeedtestApiIpStats;->getCountryCode()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "Location:"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lspeedtest/SpeedtestApiIpStats;->getLocation()Lspeedtest/LocationCoordinates;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "Timezone:"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lspeedtest/SpeedtestApiIpStats;->getTimezone()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "Error:"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lspeedtest/SpeedtestApiIpStats;->getError()Lspeedtest/SpeedtestError;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
