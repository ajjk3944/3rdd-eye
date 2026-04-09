.class public final enum Lorg/snmp4j/uri/SnmpURI$SnmpUriType;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/snmp4j/uri/SnmpURI;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "SnmpUriType"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lorg/snmp4j/uri/SnmpURI$SnmpUriType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lorg/snmp4j/uri/SnmpURI$SnmpUriType;

.field public static final enum GET:Lorg/snmp4j/uri/SnmpURI$SnmpUriType;

.field public static final enum NEXT:Lorg/snmp4j/uri/SnmpURI$SnmpUriType;

.field public static final enum SUBTREE:Lorg/snmp4j/uri/SnmpURI$SnmpUriType;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lorg/snmp4j/uri/SnmpURI$SnmpUriType;

    const-string v1, "GET"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lorg/snmp4j/uri/SnmpURI$SnmpUriType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/snmp4j/uri/SnmpURI$SnmpUriType;->GET:Lorg/snmp4j/uri/SnmpURI$SnmpUriType;

    new-instance v1, Lorg/snmp4j/uri/SnmpURI$SnmpUriType;

    const-string v2, "NEXT"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Lorg/snmp4j/uri/SnmpURI$SnmpUriType;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lorg/snmp4j/uri/SnmpURI$SnmpUriType;->NEXT:Lorg/snmp4j/uri/SnmpURI$SnmpUriType;

    new-instance v2, Lorg/snmp4j/uri/SnmpURI$SnmpUriType;

    const-string v3, "SUBTREE"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Lorg/snmp4j/uri/SnmpURI$SnmpUriType;-><init>(Ljava/lang/String;I)V

    sput-object v2, Lorg/snmp4j/uri/SnmpURI$SnmpUriType;->SUBTREE:Lorg/snmp4j/uri/SnmpURI$SnmpUriType;

    filled-new-array {v0, v1, v2}, [Lorg/snmp4j/uri/SnmpURI$SnmpUriType;

    move-result-object v0

    sput-object v0, Lorg/snmp4j/uri/SnmpURI$SnmpUriType;->$VALUES:[Lorg/snmp4j/uri/SnmpURI$SnmpUriType;

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

.method public static valueOf(Ljava/lang/String;)Lorg/snmp4j/uri/SnmpURI$SnmpUriType;
    .locals 1

    const-class v0, Lorg/snmp4j/uri/SnmpURI$SnmpUriType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lorg/snmp4j/uri/SnmpURI$SnmpUriType;

    return-object p0
.end method

.method public static values()[Lorg/snmp4j/uri/SnmpURI$SnmpUriType;
    .locals 1

    sget-object v0, Lorg/snmp4j/uri/SnmpURI$SnmpUriType;->$VALUES:[Lorg/snmp4j/uri/SnmpURI$SnmpUriType;

    invoke-virtual {v0}, [Lorg/snmp4j/uri/SnmpURI$SnmpUriType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lorg/snmp4j/uri/SnmpURI$SnmpUriType;

    return-object v0
.end method
