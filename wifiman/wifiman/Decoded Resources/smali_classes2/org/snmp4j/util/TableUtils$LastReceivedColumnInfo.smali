.class Lorg/snmp4j/util/TableUtils$LastReceivedColumnInfo;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/snmp4j/util/TableUtils;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "LastReceivedColumnInfo"
.end annotation


# instance fields
.field private basedOn:Lorg/snmp4j/util/TableUtils$Row;

.field private oid:Lorg/snmp4j/smi/OID;

.field final synthetic this$0:Lorg/snmp4j/util/TableUtils;


# direct methods
.method public constructor <init>(Lorg/snmp4j/util/TableUtils;Lorg/snmp4j/smi/OID;Lorg/snmp4j/util/TableUtils$Row;)V
    .locals 0

    iput-object p1, p0, Lorg/snmp4j/util/TableUtils$LastReceivedColumnInfo;->this$0:Lorg/snmp4j/util/TableUtils;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lorg/snmp4j/util/TableUtils$LastReceivedColumnInfo;->oid:Lorg/snmp4j/smi/OID;

    iput-object p3, p0, Lorg/snmp4j/util/TableUtils$LastReceivedColumnInfo;->basedOn:Lorg/snmp4j/util/TableUtils$Row;

    return-void
.end method


# virtual methods
.method public getBasedOn()Lorg/snmp4j/util/TableUtils$Row;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/util/TableUtils$LastReceivedColumnInfo;->basedOn:Lorg/snmp4j/util/TableUtils$Row;

    return-object v0
.end method

.method public getOid()Lorg/snmp4j/smi/OID;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/util/TableUtils$LastReceivedColumnInfo;->oid:Lorg/snmp4j/smi/OID;

    return-object v0
.end method
