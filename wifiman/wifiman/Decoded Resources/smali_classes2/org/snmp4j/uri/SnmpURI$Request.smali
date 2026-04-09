.class Lorg/snmp4j/uri/SnmpURI$Request;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/snmp4j/uri/SnmpURI;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "Request"
.end annotation


# instance fields
.field private oids:[Lorg/snmp4j/smi/OID;

.field private pdu:Lorg/snmp4j/PDU;

.field private target:Lorg/snmp4j/Target;

.field final synthetic this$0:Lorg/snmp4j/uri/SnmpURI;

.field type:Lorg/snmp4j/uri/SnmpURI$SnmpUriType;


# direct methods
.method private constructor <init>(Lorg/snmp4j/uri/SnmpURI;Lorg/snmp4j/Target;Lorg/snmp4j/PDU;[Lorg/snmp4j/smi/OID;)V
    .locals 0

    .line 2
    iput-object p1, p0, Lorg/snmp4j/uri/SnmpURI$Request;->this$0:Lorg/snmp4j/uri/SnmpURI;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    sget-object p1, Lorg/snmp4j/uri/SnmpURI$SnmpUriType;->GET:Lorg/snmp4j/uri/SnmpURI$SnmpUriType;

    iput-object p1, p0, Lorg/snmp4j/uri/SnmpURI$Request;->type:Lorg/snmp4j/uri/SnmpURI$SnmpUriType;

    .line 4
    iput-object p2, p0, Lorg/snmp4j/uri/SnmpURI$Request;->target:Lorg/snmp4j/Target;

    .line 5
    iput-object p3, p0, Lorg/snmp4j/uri/SnmpURI$Request;->pdu:Lorg/snmp4j/PDU;

    .line 6
    iput-object p4, p0, Lorg/snmp4j/uri/SnmpURI$Request;->oids:[Lorg/snmp4j/smi/OID;

    return-void
.end method

.method private constructor <init>(Lorg/snmp4j/uri/SnmpURI;Lorg/snmp4j/Target;Lorg/snmp4j/PDU;[Lorg/snmp4j/smi/OID;Lorg/snmp4j/uri/SnmpURI$SnmpUriType;)V
    .locals 0

    .line 7
    invoke-direct {p0, p1, p2, p3, p4}, Lorg/snmp4j/uri/SnmpURI$Request;-><init>(Lorg/snmp4j/uri/SnmpURI;Lorg/snmp4j/Target;Lorg/snmp4j/PDU;[Lorg/snmp4j/smi/OID;)V

    .line 8
    iput-object p5, p0, Lorg/snmp4j/uri/SnmpURI$Request;->type:Lorg/snmp4j/uri/SnmpURI$SnmpUriType;

    return-void
.end method

.method synthetic constructor <init>(Lorg/snmp4j/uri/SnmpURI;Lorg/snmp4j/Target;Lorg/snmp4j/PDU;[Lorg/snmp4j/smi/OID;Lorg/snmp4j/uri/SnmpURI$SnmpUriType;Lorg/snmp4j/uri/SnmpURI$1;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p5}, Lorg/snmp4j/uri/SnmpURI$Request;-><init>(Lorg/snmp4j/uri/SnmpURI;Lorg/snmp4j/Target;Lorg/snmp4j/PDU;[Lorg/snmp4j/smi/OID;Lorg/snmp4j/uri/SnmpURI$SnmpUriType;)V

    return-void
.end method


# virtual methods
.method public getOIDs()[Lorg/snmp4j/smi/OID;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/uri/SnmpURI$Request;->oids:[Lorg/snmp4j/smi/OID;

    return-object v0
.end method

.method public getPdu()Lorg/snmp4j/PDU;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/uri/SnmpURI$Request;->pdu:Lorg/snmp4j/PDU;

    return-object v0
.end method

.method public getTarget()Lorg/snmp4j/Target;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/uri/SnmpURI$Request;->target:Lorg/snmp4j/Target;

    return-object v0
.end method

.method public getType()Lorg/snmp4j/uri/SnmpURI$SnmpUriType;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/uri/SnmpURI$Request;->type:Lorg/snmp4j/uri/SnmpURI$SnmpUriType;

    return-object v0
.end method
