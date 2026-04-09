.class public abstract Lorg/snmp4j/util/AbstractSnmpUtility;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field protected pduFactory:Lorg/snmp4j/util/PDUFactory;

.field protected session:Lorg/snmp4j/Session;


# direct methods
.method public constructor <init>(Lorg/snmp4j/Session;Lorg/snmp4j/util/PDUFactory;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lorg/snmp4j/util/AbstractSnmpUtility;->session:Lorg/snmp4j/Session;

    iput-object p2, p0, Lorg/snmp4j/util/AbstractSnmpUtility;->pduFactory:Lorg/snmp4j/util/PDUFactory;

    return-void
.end method
