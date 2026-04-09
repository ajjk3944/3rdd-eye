.class public final enum Lorg/snmp4j/transport/tls/SecurityNameMapping$CertMappingType;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/snmp4j/transport/tls/SecurityNameMapping;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "CertMappingType"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lorg/snmp4j/transport/tls/SecurityNameMapping$CertMappingType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lorg/snmp4j/transport/tls/SecurityNameMapping$CertMappingType;

.field public static final enum CommonName:Lorg/snmp4j/transport/tls/SecurityNameMapping$CertMappingType;

.field public static final enum SANAny:Lorg/snmp4j/transport/tls/SecurityNameMapping$CertMappingType;

.field public static final enum SANDNSName:Lorg/snmp4j/transport/tls/SecurityNameMapping$CertMappingType;

.field public static final enum SANIpAddress:Lorg/snmp4j/transport/tls/SecurityNameMapping$CertMappingType;

.field public static final enum SANRFC822Name:Lorg/snmp4j/transport/tls/SecurityNameMapping$CertMappingType;

.field public static final enum Specified:Lorg/snmp4j/transport/tls/SecurityNameMapping$CertMappingType;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    new-instance v0, Lorg/snmp4j/transport/tls/SecurityNameMapping$CertMappingType;

    const-string v1, "Specified"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lorg/snmp4j/transport/tls/SecurityNameMapping$CertMappingType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/snmp4j/transport/tls/SecurityNameMapping$CertMappingType;->Specified:Lorg/snmp4j/transport/tls/SecurityNameMapping$CertMappingType;

    new-instance v1, Lorg/snmp4j/transport/tls/SecurityNameMapping$CertMappingType;

    const-string v2, "SANRFC822Name"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Lorg/snmp4j/transport/tls/SecurityNameMapping$CertMappingType;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lorg/snmp4j/transport/tls/SecurityNameMapping$CertMappingType;->SANRFC822Name:Lorg/snmp4j/transport/tls/SecurityNameMapping$CertMappingType;

    new-instance v2, Lorg/snmp4j/transport/tls/SecurityNameMapping$CertMappingType;

    const-string v3, "SANDNSName"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Lorg/snmp4j/transport/tls/SecurityNameMapping$CertMappingType;-><init>(Ljava/lang/String;I)V

    sput-object v2, Lorg/snmp4j/transport/tls/SecurityNameMapping$CertMappingType;->SANDNSName:Lorg/snmp4j/transport/tls/SecurityNameMapping$CertMappingType;

    new-instance v3, Lorg/snmp4j/transport/tls/SecurityNameMapping$CertMappingType;

    const-string v4, "SANIpAddress"

    const/4 v5, 0x3

    invoke-direct {v3, v4, v5}, Lorg/snmp4j/transport/tls/SecurityNameMapping$CertMappingType;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lorg/snmp4j/transport/tls/SecurityNameMapping$CertMappingType;->SANIpAddress:Lorg/snmp4j/transport/tls/SecurityNameMapping$CertMappingType;

    new-instance v4, Lorg/snmp4j/transport/tls/SecurityNameMapping$CertMappingType;

    const-string v5, "SANAny"

    const/4 v6, 0x4

    invoke-direct {v4, v5, v6}, Lorg/snmp4j/transport/tls/SecurityNameMapping$CertMappingType;-><init>(Ljava/lang/String;I)V

    sput-object v4, Lorg/snmp4j/transport/tls/SecurityNameMapping$CertMappingType;->SANAny:Lorg/snmp4j/transport/tls/SecurityNameMapping$CertMappingType;

    new-instance v5, Lorg/snmp4j/transport/tls/SecurityNameMapping$CertMappingType;

    const-string v6, "CommonName"

    const/4 v7, 0x5

    invoke-direct {v5, v6, v7}, Lorg/snmp4j/transport/tls/SecurityNameMapping$CertMappingType;-><init>(Ljava/lang/String;I)V

    sput-object v5, Lorg/snmp4j/transport/tls/SecurityNameMapping$CertMappingType;->CommonName:Lorg/snmp4j/transport/tls/SecurityNameMapping$CertMappingType;

    filled-new-array/range {v0 .. v5}, [Lorg/snmp4j/transport/tls/SecurityNameMapping$CertMappingType;

    move-result-object v0

    sput-object v0, Lorg/snmp4j/transport/tls/SecurityNameMapping$CertMappingType;->$VALUES:[Lorg/snmp4j/transport/tls/SecurityNameMapping$CertMappingType;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lorg/snmp4j/transport/tls/SecurityNameMapping$CertMappingType;
    .locals 1

    const-class v0, Lorg/snmp4j/transport/tls/SecurityNameMapping$CertMappingType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lorg/snmp4j/transport/tls/SecurityNameMapping$CertMappingType;

    return-object p0
.end method

.method public static values()[Lorg/snmp4j/transport/tls/SecurityNameMapping$CertMappingType;
    .locals 1

    sget-object v0, Lorg/snmp4j/transport/tls/SecurityNameMapping$CertMappingType;->$VALUES:[Lorg/snmp4j/transport/tls/SecurityNameMapping$CertMappingType;

    invoke-virtual {v0}, [Lorg/snmp4j/transport/tls/SecurityNameMapping$CertMappingType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lorg/snmp4j/transport/tls/SecurityNameMapping$CertMappingType;

    return-object v0
.end method
