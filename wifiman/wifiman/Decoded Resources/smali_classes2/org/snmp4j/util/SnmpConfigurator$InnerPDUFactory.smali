.class public Lorg/snmp4j/util/SnmpConfigurator$InnerPDUFactory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/snmp4j/util/PDUFactory;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/snmp4j/util/SnmpConfigurator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "InnerPDUFactory"
.end annotation


# instance fields
.field private settings:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation
.end field

.field final synthetic this$0:Lorg/snmp4j/util/SnmpConfigurator;


# direct methods
.method public constructor <init>(Lorg/snmp4j/util/SnmpConfigurator;Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;>;)V"
        }
    .end annotation

    iput-object p1, p0, Lorg/snmp4j/util/SnmpConfigurator$InnerPDUFactory;->this$0:Lorg/snmp4j/util/SnmpConfigurator;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lorg/snmp4j/util/SnmpConfigurator$InnerPDUFactory;->settings:Ljava/util/Map;

    return-void
.end method

.method private configurePDU(ILorg/snmp4j/PDU;)V
    .locals 6

    const/16 v0, -0x5c

    if-ne p1, v0, :cond_1

    instance-of v1, p2, Lorg/snmp4j/PDUv1;

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "V1TRAP can only be sent using SNMPv1"

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    const/16 v1, -0x5b

    const/4 v2, 0x0

    if-ne p1, v1, :cond_3

    invoke-virtual {p0}, Lorg/snmp4j/util/SnmpConfigurator$InnerPDUFactory;->getMaxRepetitions()Ljava/lang/Integer;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {p2, p1}, Lorg/snmp4j/PDU;->setMaxRepetitions(I)V

    :cond_2
    invoke-virtual {p0}, Lorg/snmp4j/util/SnmpConfigurator$InnerPDUFactory;->getNonRepeaters()Ljava/lang/Integer;

    move-result-object p1

    if-eqz p1, :cond_a

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {p2, p1}, Lorg/snmp4j/PDU;->setNonRepeaters(I)V

    goto/16 :goto_2

    :cond_3
    const/16 v1, -0x59

    if-eq p1, v1, :cond_8

    const/16 v1, -0x5a

    if-ne p1, v1, :cond_4

    goto :goto_1

    :cond_4
    if-ne p1, v0, :cond_a

    move-object p1, p2

    check-cast p1, Lorg/snmp4j/PDUv1;

    iget-object v0, p0, Lorg/snmp4j/util/SnmpConfigurator$InnerPDUFactory;->settings:Ljava/util/Map;

    iget-object v1, p0, Lorg/snmp4j/util/SnmpConfigurator$InnerPDUFactory;->this$0:Lorg/snmp4j/util/SnmpConfigurator;

    invoke-static {v1}, Lorg/snmp4j/util/SnmpConfigurator;->access$200(Lorg/snmp4j/util/SnmpConfigurator;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, v2}, Lorg/snmp4j/util/ArgumentParser;->getValue(Ljava/util/Map;Ljava/lang/String;I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_5

    new-instance v1, Lorg/snmp4j/smi/IpAddress;

    invoke-direct {v1, v0}, Lorg/snmp4j/smi/IpAddress;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v1}, Lorg/snmp4j/PDUv1;->setAgentAddress(Lorg/snmp4j/smi/IpAddress;)V

    :cond_5
    iget-object v0, p0, Lorg/snmp4j/util/SnmpConfigurator$InnerPDUFactory;->settings:Ljava/util/Map;

    iget-object v1, p0, Lorg/snmp4j/util/SnmpConfigurator$InnerPDUFactory;->this$0:Lorg/snmp4j/util/SnmpConfigurator;

    invoke-static {v1}, Lorg/snmp4j/util/SnmpConfigurator;->access$300(Lorg/snmp4j/util/SnmpConfigurator;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, v2}, Lorg/snmp4j/util/ArgumentParser;->getValue(Ljava/util/Map;Ljava/lang/String;I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    if-eqz v0, :cond_6

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p1, v0}, Lorg/snmp4j/PDUv1;->setGenericTrap(I)V

    :cond_6
    iget-object v0, p0, Lorg/snmp4j/util/SnmpConfigurator$InnerPDUFactory;->settings:Ljava/util/Map;

    iget-object v1, p0, Lorg/snmp4j/util/SnmpConfigurator$InnerPDUFactory;->this$0:Lorg/snmp4j/util/SnmpConfigurator;

    invoke-static {v1}, Lorg/snmp4j/util/SnmpConfigurator;->access$400(Lorg/snmp4j/util/SnmpConfigurator;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, v2}, Lorg/snmp4j/util/ArgumentParser;->getValue(Ljava/util/Map;Ljava/lang/String;I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    if-eqz v0, :cond_7

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p1, v0}, Lorg/snmp4j/PDUv1;->setSpecificTrap(I)V

    :cond_7
    iget-object v0, p0, Lorg/snmp4j/util/SnmpConfigurator$InnerPDUFactory;->settings:Ljava/util/Map;

    iget-object v1, p0, Lorg/snmp4j/util/SnmpConfigurator$InnerPDUFactory;->this$0:Lorg/snmp4j/util/SnmpConfigurator;

    invoke-static {v1}, Lorg/snmp4j/util/SnmpConfigurator;->access$500(Lorg/snmp4j/util/SnmpConfigurator;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, v2}, Lorg/snmp4j/util/ArgumentParser;->getValue(Ljava/util/Map;Ljava/lang/String;I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_a

    new-instance v1, Lorg/snmp4j/smi/OID;

    invoke-direct {v1, v0}, Lorg/snmp4j/smi/OID;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v1}, Lorg/snmp4j/PDUv1;->setEnterprise(Lorg/snmp4j/smi/OID;)V

    goto :goto_2

    :cond_8
    :goto_1
    iget-object p1, p0, Lorg/snmp4j/util/SnmpConfigurator$InnerPDUFactory;->settings:Ljava/util/Map;

    iget-object v0, p0, Lorg/snmp4j/util/SnmpConfigurator$InnerPDUFactory;->this$0:Lorg/snmp4j/util/SnmpConfigurator;

    invoke-static {v0}, Lorg/snmp4j/util/SnmpConfigurator;->access$000(Lorg/snmp4j/util/SnmpConfigurator;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0, v2}, Lorg/snmp4j/util/ArgumentParser;->getValue(Ljava/util/Map;Ljava/lang/String;I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    if-eqz p1, :cond_9

    new-instance v0, Lorg/snmp4j/smi/VariableBinding;

    sget-object v1, Lorg/snmp4j/mp/SnmpConstants;->sysUpTime:Lorg/snmp4j/smi/OID;

    new-instance v3, Lorg/snmp4j/smi/TimeTicks;

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v4

    invoke-direct {v3, v4, v5}, Lorg/snmp4j/smi/TimeTicks;-><init>(J)V

    invoke-direct {v0, v1, v3}, Lorg/snmp4j/smi/VariableBinding;-><init>(Lorg/snmp4j/smi/OID;Lorg/snmp4j/smi/Variable;)V

    invoke-virtual {p2, v0}, Lorg/snmp4j/PDU;->add(Lorg/snmp4j/smi/VariableBinding;)V

    :cond_9
    iget-object p1, p0, Lorg/snmp4j/util/SnmpConfigurator$InnerPDUFactory;->settings:Ljava/util/Map;

    iget-object v0, p0, Lorg/snmp4j/util/SnmpConfigurator$InnerPDUFactory;->this$0:Lorg/snmp4j/util/SnmpConfigurator;

    invoke-static {v0}, Lorg/snmp4j/util/SnmpConfigurator;->access$100(Lorg/snmp4j/util/SnmpConfigurator;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0, v2}, Lorg/snmp4j/util/ArgumentParser;->getValue(Ljava/util/Map;Ljava/lang/String;I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_a

    new-instance v0, Lorg/snmp4j/smi/VariableBinding;

    sget-object v1, Lorg/snmp4j/mp/SnmpConstants;->snmpTrapOID:Lorg/snmp4j/smi/OID;

    new-instance v3, Lorg/snmp4j/smi/OID;

    invoke-direct {v3, p1}, Lorg/snmp4j/smi/OID;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1, v3}, Lorg/snmp4j/smi/VariableBinding;-><init>(Lorg/snmp4j/smi/OID;Lorg/snmp4j/smi/Variable;)V

    invoke-virtual {p2, v0}, Lorg/snmp4j/PDU;->add(Lorg/snmp4j/smi/VariableBinding;)V

    :cond_a
    :goto_2
    instance-of p1, p2, Lorg/snmp4j/ScopedPDU;

    if-eqz p1, :cond_c

    check-cast p2, Lorg/snmp4j/ScopedPDU;

    iget-object p1, p0, Lorg/snmp4j/util/SnmpConfigurator$InnerPDUFactory;->settings:Ljava/util/Map;

    iget-object v0, p0, Lorg/snmp4j/util/SnmpConfigurator$InnerPDUFactory;->this$0:Lorg/snmp4j/util/SnmpConfigurator;

    invoke-static {v0}, Lorg/snmp4j/util/SnmpConfigurator;->access$600(Lorg/snmp4j/util/SnmpConfigurator;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0, v2}, Lorg/snmp4j/util/ArgumentParser;->getValue(Ljava/util/Map;Ljava/lang/String;I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    const/4 v0, 0x0

    if-eqz p1, :cond_b

    invoke-static {p1, v0}, Lorg/snmp4j/util/SnmpConfigurator;->createOctetString(Ljava/lang/String;Ljava/lang/String;)Lorg/snmp4j/smi/OctetString;

    move-result-object p1

    invoke-virtual {p2, p1}, Lorg/snmp4j/ScopedPDU;->setContextEngineID(Lorg/snmp4j/smi/OctetString;)V

    :cond_b
    iget-object p1, p0, Lorg/snmp4j/util/SnmpConfigurator$InnerPDUFactory;->settings:Ljava/util/Map;

    iget-object v1, p0, Lorg/snmp4j/util/SnmpConfigurator$InnerPDUFactory;->this$0:Lorg/snmp4j/util/SnmpConfigurator;

    invoke-static {v1}, Lorg/snmp4j/util/SnmpConfigurator;->access$700(Lorg/snmp4j/util/SnmpConfigurator;)Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1, v2}, Lorg/snmp4j/util/ArgumentParser;->getValue(Ljava/util/Map;Ljava/lang/String;I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_c

    invoke-static {p1, v0}, Lorg/snmp4j/util/SnmpConfigurator;->createOctetString(Ljava/lang/String;Ljava/lang/String;)Lorg/snmp4j/smi/OctetString;

    move-result-object p1

    invoke-virtual {p2, p1}, Lorg/snmp4j/ScopedPDU;->setContextName(Lorg/snmp4j/smi/OctetString;)V

    :cond_c
    return-void
.end method

.method private getPduType()I
    .locals 3

    iget-object v0, p0, Lorg/snmp4j/util/SnmpConfigurator$InnerPDUFactory;->settings:Ljava/util/Map;

    iget-object v1, p0, Lorg/snmp4j/util/SnmpConfigurator$InnerPDUFactory;->this$0:Lorg/snmp4j/util/SnmpConfigurator;

    invoke-static {v1}, Lorg/snmp4j/util/SnmpConfigurator;->access$800(Lorg/snmp4j/util/SnmpConfigurator;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lorg/snmp4j/util/ArgumentParser;->getValue(Ljava/util/Map;Ljava/lang/String;I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-nez v0, :cond_0

    const-string v0, "GET"

    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lorg/snmp4j/PDU;->getTypeFromString(Ljava/lang/String;)I

    move-result v0

    return v0
.end method


# virtual methods
.method public createPDU(Lorg/snmp4j/Target;)Lorg/snmp4j/PDU;
    .locals 1

    .line 1
    invoke-direct {p0}, Lorg/snmp4j/util/SnmpConfigurator$InnerPDUFactory;->getPduType()I

    move-result v0

    .line 2
    invoke-static {p1, v0}, Lorg/snmp4j/util/DefaultPDUFactory;->createPDU(Lorg/snmp4j/Target;I)Lorg/snmp4j/PDU;

    move-result-object p1

    .line 3
    invoke-direct {p0, v0, p1}, Lorg/snmp4j/util/SnmpConfigurator$InnerPDUFactory;->configurePDU(ILorg/snmp4j/PDU;)V

    return-object p1
.end method

.method public createPDU(Lorg/snmp4j/mp/MessageProcessingModel;)Lorg/snmp4j/PDU;
    .locals 1

    .line 4
    invoke-direct {p0}, Lorg/snmp4j/util/SnmpConfigurator$InnerPDUFactory;->getPduType()I

    move-result v0

    .line 5
    invoke-static {p1, v0}, Lorg/snmp4j/util/DefaultPDUFactory;->createPDU(Lorg/snmp4j/mp/MessageProcessingModel;I)Lorg/snmp4j/PDU;

    move-result-object p1

    .line 6
    invoke-direct {p0, v0, p1}, Lorg/snmp4j/util/SnmpConfigurator$InnerPDUFactory;->configurePDU(ILorg/snmp4j/PDU;)V

    return-object p1
.end method

.method public getMaxRepetitions()Ljava/lang/Integer;
    .locals 3

    iget-object v0, p0, Lorg/snmp4j/util/SnmpConfigurator$InnerPDUFactory;->settings:Ljava/util/Map;

    iget-object v1, p0, Lorg/snmp4j/util/SnmpConfigurator$InnerPDUFactory;->this$0:Lorg/snmp4j/util/SnmpConfigurator;

    invoke-static {v1}, Lorg/snmp4j/util/SnmpConfigurator;->access$900(Lorg/snmp4j/util/SnmpConfigurator;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lorg/snmp4j/util/ArgumentParser;->getValue(Ljava/util/Map;Ljava/lang/String;I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    return-object v0
.end method

.method public getNonRepeaters()Ljava/lang/Integer;
    .locals 3

    iget-object v0, p0, Lorg/snmp4j/util/SnmpConfigurator$InnerPDUFactory;->settings:Ljava/util/Map;

    iget-object v1, p0, Lorg/snmp4j/util/SnmpConfigurator$InnerPDUFactory;->this$0:Lorg/snmp4j/util/SnmpConfigurator;

    invoke-static {v1}, Lorg/snmp4j/util/SnmpConfigurator;->access$1000(Lorg/snmp4j/util/SnmpConfigurator;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lorg/snmp4j/util/ArgumentParser;->getValue(Ljava/util/Map;Ljava/lang/String;I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    return-object v0
.end method
