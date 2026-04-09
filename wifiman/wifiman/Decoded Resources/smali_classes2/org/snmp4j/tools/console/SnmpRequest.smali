.class public Lorg/snmp4j/tools/console/SnmpRequest;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/snmp4j/CommandResponder;
.implements Lorg/snmp4j/util/PDUFactory;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/snmp4j/tools/console/SnmpRequest$WalkCounts;,
        Lorg/snmp4j/tools/console/SnmpRequest$TextTableListener;,
        Lorg/snmp4j/tools/console/SnmpRequest$CVSTableListener;
    }
.end annotation


# static fields
.field public static final CVS_TABLE:I = 0x4

.field public static final DEFAULT:I = 0x0

.field public static final LISTEN:I = 0x2

.field public static final SNAPSHOT_CREATION:I = 0x6

.field public static final SNAPSHOT_DUMP:I = 0x7

.field public static final TABLE:I = 0x3

.field public static final TIME_BASED_CVS_TABLE:I = 0x5

.field public static final WALK:I = 0x1


# instance fields
.field address:Lorg/snmp4j/smi/Address;

.field authPassphrase:Lorg/snmp4j/smi/OctetString;

.field authProtocol:Lorg/snmp4j/smi/OID;

.field authoritativeEngineID:Lorg/snmp4j/smi/OctetString;

.field community:Lorg/snmp4j/smi/OctetString;

.field contextEngineID:Lorg/snmp4j/smi/OctetString;

.field contextName:Lorg/snmp4j/smi/OctetString;

.field engineBootCount:I

.field localEngineID:Lorg/snmp4j/smi/OctetString;

.field lowerBoundIndex:Lorg/snmp4j/smi/OID;

.field maxRepetitions:I

.field maxSizeResponsePDU:I

.field nonRepeaters:I

.field numDispatcherThreads:I

.field protected operation:I

.field pduType:I

.field privPassphrase:Lorg/snmp4j/smi/OctetString;

.field privProtocol:Lorg/snmp4j/smi/OID;

.field retries:I

.field securityName:Lorg/snmp4j/smi/OctetString;

.field snapshotFile:Ljava/io/File;

.field sysUpTime:Lorg/snmp4j/smi/TimeTicks;

.field target:Lorg/snmp4j/Target;

.field timeout:I

.field trapOID:Lorg/snmp4j/smi/OID;

.field upperBoundIndex:Lorg/snmp4j/smi/OID;

.field useDenseTableOperation:Z

.field v1TrapPDU:Lorg/snmp4j/PDUv1;

.field vbs:Ljava/util/Vector;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Vector<",
            "Lorg/snmp4j/smi/VariableBinding;",
            ">;"
        }
    .end annotation
.end field

.field version:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lorg/snmp4j/log/ConsoleLogFactory;

    invoke-direct {v0}, Lorg/snmp4j/log/ConsoleLogFactory;-><init>()V

    invoke-static {v0}, Lorg/snmp4j/log/LogFactory;->setLogFactory(Lorg/snmp4j/log/LogFactory;)V

    const/4 v0, 0x0

    invoke-static {v0}, Lorg/snmp4j/asn1/BER;->setCheckSequenceLength(Z)V

    return-void
.end method

.method public constructor <init>([Ljava/lang/String;)V
    .locals 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lorg/snmp4j/smi/OctetString;

    const-string v1, "public"

    invoke-direct {v0, v1}, Lorg/snmp4j/smi/OctetString;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lorg/snmp4j/tools/console/SnmpRequest;->community:Lorg/snmp4j/smi/OctetString;

    new-instance v0, Lorg/snmp4j/smi/OctetString;

    invoke-direct {v0}, Lorg/snmp4j/smi/OctetString;-><init>()V

    iput-object v0, p0, Lorg/snmp4j/tools/console/SnmpRequest;->contextName:Lorg/snmp4j/smi/OctetString;

    new-instance v0, Lorg/snmp4j/smi/OctetString;

    invoke-direct {v0}, Lorg/snmp4j/smi/OctetString;-><init>()V

    iput-object v0, p0, Lorg/snmp4j/tools/console/SnmpRequest;->securityName:Lorg/snmp4j/smi/OctetString;

    new-instance v0, Lorg/snmp4j/smi/OctetString;

    invoke-static {}, Lorg/snmp4j/mp/MPv3;->createLocalEngineID()[B

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/snmp4j/smi/OctetString;-><init>([B)V

    iput-object v0, p0, Lorg/snmp4j/tools/console/SnmpRequest;->localEngineID:Lorg/snmp4j/smi/OctetString;

    new-instance v0, Lorg/snmp4j/smi/TimeTicks;

    const-wide/16 v1, 0x0

    invoke-direct {v0, v1, v2}, Lorg/snmp4j/smi/TimeTicks;-><init>(J)V

    iput-object v0, p0, Lorg/snmp4j/tools/console/SnmpRequest;->sysUpTime:Lorg/snmp4j/smi/TimeTicks;

    sget-object v0, Lorg/snmp4j/mp/SnmpConstants;->coldStart:Lorg/snmp4j/smi/OID;

    iput-object v0, p0, Lorg/snmp4j/tools/console/SnmpRequest;->trapOID:Lorg/snmp4j/smi/OID;

    new-instance v0, Lorg/snmp4j/PDUv1;

    invoke-direct {v0}, Lorg/snmp4j/PDUv1;-><init>()V

    iput-object v0, p0, Lorg/snmp4j/tools/console/SnmpRequest;->v1TrapPDU:Lorg/snmp4j/PDUv1;

    const/4 v0, 0x3

    iput v0, p0, Lorg/snmp4j/tools/console/SnmpRequest;->version:I

    const/4 v0, 0x0

    iput v0, p0, Lorg/snmp4j/tools/console/SnmpRequest;->engineBootCount:I

    const/4 v1, 0x1

    iput v1, p0, Lorg/snmp4j/tools/console/SnmpRequest;->retries:I

    const/16 v2, 0x3e8

    iput v2, p0, Lorg/snmp4j/tools/console/SnmpRequest;->timeout:I

    const/16 v2, -0x5f

    iput v2, p0, Lorg/snmp4j/tools/console/SnmpRequest;->pduType:I

    const/16 v2, 0xa

    iput v2, p0, Lorg/snmp4j/tools/console/SnmpRequest;->maxRepetitions:I

    iput v0, p0, Lorg/snmp4j/tools/console/SnmpRequest;->nonRepeaters:I

    const v2, 0xffff

    iput v2, p0, Lorg/snmp4j/tools/console/SnmpRequest;->maxSizeResponsePDU:I

    new-instance v2, Ljava/util/Vector;

    invoke-direct {v2}, Ljava/util/Vector;-><init>()V

    iput-object v2, p0, Lorg/snmp4j/tools/console/SnmpRequest;->vbs:Ljava/util/Vector;

    iput v0, p0, Lorg/snmp4j/tools/console/SnmpRequest;->operation:I

    const/4 v2, 0x2

    iput v2, p0, Lorg/snmp4j/tools/console/SnmpRequest;->numDispatcherThreads:I

    iput-boolean v0, p0, Lorg/snmp4j/tools/console/SnmpRequest;->useDenseTableOperation:Z

    invoke-static {}, Lorg/snmp4j/mp/CounterSupport;->getInstance()Lorg/snmp4j/mp/CounterSupport;

    move-result-object v0

    new-instance v2, Lorg/snmp4j/mp/DefaultCounterListener;

    invoke-direct {v2}, Lorg/snmp4j/mp/DefaultCounterListener;-><init>()V

    invoke-virtual {v0, v2}, Lorg/snmp4j/mp/CounterSupport;->addCounterListener(Lorg/snmp4j/event/CounterListener;)V

    iget-object v0, p0, Lorg/snmp4j/tools/console/SnmpRequest;->vbs:Ljava/util/Vector;

    new-instance v2, Lorg/snmp4j/smi/VariableBinding;

    new-instance v3, Lorg/snmp4j/smi/OID;

    const-string v4, "1.3.6"

    invoke-direct {v3, v4}, Lorg/snmp4j/smi/OID;-><init>(Ljava/lang/String;)V

    invoke-direct {v2, v3}, Lorg/snmp4j/smi/VariableBinding;-><init>(Lorg/snmp4j/smi/OID;)V

    invoke-virtual {v0, v2}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z

    invoke-direct {p0, p1}, Lorg/snmp4j/tools/console/SnmpRequest;->parseArgs([Ljava/lang/String;)I

    move-result v0

    array-length v2, p1

    if-lt v0, v2, :cond_0

    invoke-static {}, Lorg/snmp4j/tools/console/SnmpRequest;->printUsage()V

    invoke-static {v1}, Ljava/lang/System;->exit(I)V

    goto :goto_0

    :cond_0
    iget v1, p0, Lorg/snmp4j/tools/console/SnmpRequest;->operation:I

    const/4 v2, 0x7

    if-eq v1, v2, :cond_1

    invoke-direct {p0}, Lorg/snmp4j/tools/console/SnmpRequest;->checkOptions()V

    add-int/lit8 v1, v0, 0x1

    aget-object v0, p1, v0

    invoke-static {v0}, Lorg/snmp4j/tools/console/SnmpRequest;->getAddress(Ljava/lang/String;)Lorg/snmp4j/smi/Address;

    move-result-object v0

    iput-object v0, p0, Lorg/snmp4j/tools/console/SnmpRequest;->address:Lorg/snmp4j/smi/Address;

    invoke-static {p1, v1}, Lorg/snmp4j/tools/console/SnmpRequest;->getVariableBindings([Ljava/lang/String;I)Ljava/util/Vector;

    move-result-object p1

    invoke-direct {p0, p1}, Lorg/snmp4j/tools/console/SnmpRequest;->checkTrapVariables(Ljava/util/Vector;)V

    invoke-virtual {p1}, Ljava/util/Vector;->size()I

    move-result v0

    if-lez v0, :cond_1

    iput-object p1, p0, Lorg/snmp4j/tools/console/SnmpRequest;->vbs:Ljava/util/Vector;

    :cond_1
    :goto_0
    return-void
.end method

.method private addUsmUser(Lorg/snmp4j/Snmp;)V
    .locals 8

    invoke-virtual {p1}, Lorg/snmp4j/Snmp;->getUSM()Lorg/snmp4j/security/USM;

    move-result-object p1

    iget-object v6, p0, Lorg/snmp4j/tools/console/SnmpRequest;->securityName:Lorg/snmp4j/smi/OctetString;

    new-instance v7, Lorg/snmp4j/security/UsmUser;

    iget-object v2, p0, Lorg/snmp4j/tools/console/SnmpRequest;->authProtocol:Lorg/snmp4j/smi/OID;

    iget-object v3, p0, Lorg/snmp4j/tools/console/SnmpRequest;->authPassphrase:Lorg/snmp4j/smi/OctetString;

    iget-object v4, p0, Lorg/snmp4j/tools/console/SnmpRequest;->privProtocol:Lorg/snmp4j/smi/OID;

    iget-object v5, p0, Lorg/snmp4j/tools/console/SnmpRequest;->privPassphrase:Lorg/snmp4j/smi/OctetString;

    move-object v0, v7

    move-object v1, v6

    invoke-direct/range {v0 .. v5}, Lorg/snmp4j/security/UsmUser;-><init>(Lorg/snmp4j/smi/OctetString;Lorg/snmp4j/smi/OID;Lorg/snmp4j/smi/OctetString;Lorg/snmp4j/smi/OID;Lorg/snmp4j/smi/OctetString;)V

    invoke-virtual {p1, v6, v7}, Lorg/snmp4j/security/USM;->addUser(Lorg/snmp4j/smi/OctetString;Lorg/snmp4j/security/UsmUser;)V

    return-void
.end method

.method private checkOptions()V
    .locals 4

    iget v0, p0, Lorg/snmp4j/tools/console/SnmpRequest;->operation:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    iget v2, p0, Lorg/snmp4j/tools/console/SnmpRequest;->pduType:I

    const/16 v3, -0x5b

    if-eq v2, v3, :cond_1

    const/16 v3, -0x5f

    if-ne v2, v3, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Walk operation is not supported for PDU type: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lorg/snmp4j/tools/console/SnmpRequest;->pduType:I

    invoke-static {v2}, Lorg/snmp4j/PDU;->getTypeString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    if-ne v0, v1, :cond_3

    iget-object v0, p0, Lorg/snmp4j/tools/console/SnmpRequest;->vbs:Ljava/util/Vector;

    invoke-virtual {v0}, Ljava/util/Vector;->size()I

    move-result v0

    if-ne v0, v1, :cond_2

    goto :goto_1

    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "There must be exactly one OID supplied for walk operations"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    :goto_1
    iget v0, p0, Lorg/snmp4j/tools/console/SnmpRequest;->pduType:I

    const/16 v1, -0x5c

    if-ne v0, v1, :cond_5

    iget v0, p0, Lorg/snmp4j/tools/console/SnmpRequest;->version:I

    if-nez v0, :cond_4

    goto :goto_2

    :cond_4
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "V1TRAP PDU type is only available for SNMP version 1"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5
    :goto_2
    return-void
.end method

.method private checkTrapVariables(Ljava/util/Vector;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Vector<",
            "Lorg/snmp4j/smi/VariableBinding;",
            ">;)V"
        }
    .end annotation

    iget v0, p0, Lorg/snmp4j/tools/console/SnmpRequest;->pduType:I

    const/16 v1, -0x5a

    if-eq v0, v1, :cond_0

    const/16 v1, -0x59

    if-ne v0, v1, :cond_4

    :cond_0
    invoke-virtual {p1}, Ljava/util/Vector;->size()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Ljava/util/Vector;->size()I

    move-result v0

    if-le v0, v2, :cond_2

    invoke-virtual {p1, v1}, Ljava/util/Vector;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/snmp4j/smi/VariableBinding;

    invoke-virtual {v0}, Lorg/snmp4j/smi/VariableBinding;->getOid()Lorg/snmp4j/smi/OID;

    move-result-object v0

    sget-object v3, Lorg/snmp4j/mp/SnmpConstants;->sysUpTime:Lorg/snmp4j/smi/OID;

    invoke-virtual {v0, v3}, Lorg/snmp4j/smi/OID;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    :cond_1
    new-instance v0, Lorg/snmp4j/smi/VariableBinding;

    sget-object v3, Lorg/snmp4j/mp/SnmpConstants;->sysUpTime:Lorg/snmp4j/smi/OID;

    iget-object v4, p0, Lorg/snmp4j/tools/console/SnmpRequest;->sysUpTime:Lorg/snmp4j/smi/TimeTicks;

    invoke-direct {v0, v3, v4}, Lorg/snmp4j/smi/VariableBinding;-><init>(Lorg/snmp4j/smi/OID;Lorg/snmp4j/smi/Variable;)V

    invoke-virtual {p1, v1, v0}, Ljava/util/Vector;->add(ILjava/lang/Object;)V

    :cond_2
    invoke-virtual {p1}, Ljava/util/Vector;->size()I

    move-result v0

    if-eq v0, v2, :cond_3

    invoke-virtual {p1}, Ljava/util/Vector;->size()I

    move-result v0

    const/4 v1, 0x2

    if-le v0, v1, :cond_4

    invoke-virtual {p1, v2}, Ljava/util/Vector;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/snmp4j/smi/VariableBinding;

    invoke-virtual {v0}, Lorg/snmp4j/smi/VariableBinding;->getOid()Lorg/snmp4j/smi/OID;

    move-result-object v0

    sget-object v1, Lorg/snmp4j/mp/SnmpConstants;->snmpTrapOID:Lorg/snmp4j/smi/OID;

    invoke-virtual {v0, v1}, Lorg/snmp4j/smi/OID;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    :cond_3
    new-instance v0, Lorg/snmp4j/smi/VariableBinding;

    sget-object v1, Lorg/snmp4j/mp/SnmpConstants;->snmpTrapOID:Lorg/snmp4j/smi/OID;

    iget-object v3, p0, Lorg/snmp4j/tools/console/SnmpRequest;->trapOID:Lorg/snmp4j/smi/OID;

    invoke-direct {v0, v1, v3}, Lorg/snmp4j/smi/VariableBinding;-><init>(Lorg/snmp4j/smi/OID;Lorg/snmp4j/smi/Variable;)V

    invoke-virtual {p1, v2, v0}, Ljava/util/Vector;->add(ILjava/lang/Object;)V

    :cond_4
    return-void
.end method

.method private static createOctetString(Ljava/lang/String;)Lorg/snmp4j/smi/OctetString;
    .locals 1

    const-string v0, "0x"

    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    const/16 v0, 0x3a

    invoke-static {p0, v0}, Lorg/snmp4j/smi/OctetString;->fromHexString(Ljava/lang/String;C)Lorg/snmp4j/smi/OctetString;

    move-result-object p0

    goto :goto_0

    :cond_0
    new-instance v0, Lorg/snmp4j/smi/OctetString;

    invoke-direct {v0, p0}, Lorg/snmp4j/smi/OctetString;-><init>(Ljava/lang/String;)V

    move-object p0, v0

    :goto_0
    return-object p0
.end method

.method private createSnapshot(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lorg/snmp4j/smi/VariableBinding;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x0

    :try_start_0
    new-instance v1, Ljava/io/FileOutputStream;

    iget-object v2, p0, Lorg/snmp4j/tools/console/SnmpRequest;->snapshotFile:Ljava/io/File;

    invoke-direct {v1, v2}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    new-instance v0, Ljava/io/ObjectOutputStream;

    invoke-direct {v0, v1}, Ljava/io/ObjectOutputStream;-><init>(Ljava/io/OutputStream;)V

    invoke-virtual {v0, p1}, Ljava/io/ObjectOutputStream;->writeObject(Ljava/lang/Object;)V

    invoke-virtual {v0}, Ljava/io/ObjectOutputStream;->flush()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    goto :goto_1

    :catchall_0
    move-exception p1

    move-object v0, v1

    goto :goto_2

    :catch_1
    move-exception p1

    move-object v0, v1

    goto :goto_0

    :catchall_1
    move-exception p1

    goto :goto_2

    :catch_2
    move-exception p1

    :goto_0
    :try_start_3
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    if-eqz v0, :cond_0

    :try_start_4
    invoke-virtual {v0}, Ljava/io/FileOutputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    :cond_0
    :goto_1
    return-void

    :goto_2
    if-eqz v0, :cond_1

    :try_start_5
    invoke-virtual {v0}, Ljava/io/FileOutputStream;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_3

    goto :goto_3

    :catch_3
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_1
    :goto_3
    throw p1
.end method

.method private createSnmpSession()Lorg/snmp4j/Snmp;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object v0, p0, Lorg/snmp4j/tools/console/SnmpRequest;->address:Lorg/snmp4j/smi/Address;

    instance-of v1, v0, Lorg/snmp4j/smi/TlsAddress;

    if-eqz v1, :cond_0

    new-instance v0, Lorg/snmp4j/transport/TLSTM;

    invoke-direct {v0}, Lorg/snmp4j/transport/TLSTM;-><init>()V

    goto :goto_0

    :cond_0
    instance-of v0, v0, Lorg/snmp4j/smi/TcpAddress;

    if-eqz v0, :cond_1

    new-instance v0, Lorg/snmp4j/transport/DefaultTcpTransportMapping;

    invoke-direct {v0}, Lorg/snmp4j/transport/DefaultTcpTransportMapping;-><init>()V

    goto :goto_0

    :cond_1
    new-instance v0, Lorg/snmp4j/transport/DefaultUdpTransportMapping;

    invoke-direct {v0}, Lorg/snmp4j/transport/DefaultUdpTransportMapping;-><init>()V

    :goto_0
    new-instance v1, Lorg/snmp4j/Snmp;

    invoke-direct {v1, v0}, Lorg/snmp4j/Snmp;-><init>(Lorg/snmp4j/TransportMapping;)V

    const/4 v0, 0x3

    invoke-virtual {v1, v0}, Lorg/snmp4j/Snmp;->getMessageProcessingModel(I)Lorg/snmp4j/mp/MessageProcessingModel;

    move-result-object v2

    check-cast v2, Lorg/snmp4j/mp/MPv3;

    iget-object v3, p0, Lorg/snmp4j/tools/console/SnmpRequest;->localEngineID:Lorg/snmp4j/smi/OctetString;

    invoke-virtual {v3}, Lorg/snmp4j/smi/OctetString;->getValue()[B

    move-result-object v3

    invoke-virtual {v2, v3}, Lorg/snmp4j/mp/MPv3;->setLocalEngineID([B)V

    iget v3, p0, Lorg/snmp4j/tools/console/SnmpRequest;->engineBootCount:I

    invoke-static {v3}, Lorg/snmp4j/mp/MPv3;->randomMsgID(I)I

    move-result v3

    invoke-virtual {v2, v3}, Lorg/snmp4j/mp/MPv3;->setCurrentMsgID(I)V

    iget v2, p0, Lorg/snmp4j/tools/console/SnmpRequest;->version:I

    if-ne v2, v0, :cond_2

    new-instance v0, Lorg/snmp4j/security/USM;

    invoke-static {}, Lorg/snmp4j/security/SecurityProtocols;->getInstance()Lorg/snmp4j/security/SecurityProtocols;

    move-result-object v2

    iget-object v3, p0, Lorg/snmp4j/tools/console/SnmpRequest;->localEngineID:Lorg/snmp4j/smi/OctetString;

    iget v4, p0, Lorg/snmp4j/tools/console/SnmpRequest;->engineBootCount:I

    invoke-direct {v0, v2, v3, v4}, Lorg/snmp4j/security/USM;-><init>(Lorg/snmp4j/security/SecurityProtocols;Lorg/snmp4j/smi/OctetString;I)V

    invoke-static {}, Lorg/snmp4j/security/SecurityModels;->getInstance()Lorg/snmp4j/security/SecurityModels;

    move-result-object v2

    invoke-virtual {v2, v0}, Lorg/snmp4j/security/SecurityModels;->addSecurityModel(Lorg/snmp4j/security/SecurityModel;)Lorg/snmp4j/security/SecurityModels;

    invoke-direct {p0, v1}, Lorg/snmp4j/tools/console/SnmpRequest;->addUsmUser(Lorg/snmp4j/Snmp;)V

    invoke-static {}, Lorg/snmp4j/security/SecurityModels;->getInstance()Lorg/snmp4j/security/SecurityModels;

    move-result-object v0

    new-instance v2, Lorg/snmp4j/security/TSM;

    iget-object v3, p0, Lorg/snmp4j/tools/console/SnmpRequest;->localEngineID:Lorg/snmp4j/smi/OctetString;

    const/4 v4, 0x0

    invoke-direct {v2, v3, v4}, Lorg/snmp4j/security/TSM;-><init>(Lorg/snmp4j/smi/OctetString;Z)V

    invoke-virtual {v0, v2}, Lorg/snmp4j/security/SecurityModels;->addSecurityModel(Lorg/snmp4j/security/SecurityModel;)Lorg/snmp4j/security/SecurityModels;

    :cond_2
    return-object v1
.end method

.method private createTarget()Lorg/snmp4j/Target;
    .locals 3

    iget v0, p0, Lorg/snmp4j/tools/console/SnmpRequest;->version:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_4

    new-instance v0, Lorg/snmp4j/UserTarget;

    invoke-direct {v0}, Lorg/snmp4j/UserTarget;-><init>()V

    iget-object v2, p0, Lorg/snmp4j/tools/console/SnmpRequest;->authPassphrase:Lorg/snmp4j/smi/OctetString;

    if-eqz v2, :cond_1

    iget-object v2, p0, Lorg/snmp4j/tools/console/SnmpRequest;->privPassphrase:Lorg/snmp4j/smi/OctetString;

    if-eqz v2, :cond_0

    invoke-virtual {v0, v1}, Lorg/snmp4j/AbstractTarget;->setSecurityLevel(I)V

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lorg/snmp4j/AbstractTarget;->setSecurityLevel(I)V

    goto :goto_0

    :cond_1
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lorg/snmp4j/AbstractTarget;->setSecurityLevel(I)V

    :goto_0
    iget-object v1, p0, Lorg/snmp4j/tools/console/SnmpRequest;->securityName:Lorg/snmp4j/smi/OctetString;

    invoke-virtual {v0, v1}, Lorg/snmp4j/AbstractTarget;->setSecurityName(Lorg/snmp4j/smi/OctetString;)V

    iget-object v1, p0, Lorg/snmp4j/tools/console/SnmpRequest;->authoritativeEngineID:Lorg/snmp4j/smi/OctetString;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lorg/snmp4j/smi/OctetString;->getValue()[B

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/snmp4j/UserTarget;->setAuthoritativeEngineID([B)V

    :cond_2
    iget-object v1, p0, Lorg/snmp4j/tools/console/SnmpRequest;->address:Lorg/snmp4j/smi/Address;

    instance-of v1, v1, Lorg/snmp4j/smi/TlsAddress;

    if-eqz v1, :cond_3

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lorg/snmp4j/AbstractTarget;->setSecurityModel(I)V

    :cond_3
    return-object v0

    :cond_4
    new-instance v0, Lorg/snmp4j/CommunityTarget;

    invoke-direct {v0}, Lorg/snmp4j/CommunityTarget;-><init>()V

    iget-object v1, p0, Lorg/snmp4j/tools/console/SnmpRequest;->community:Lorg/snmp4j/smi/OctetString;

    invoke-virtual {v0, v1}, Lorg/snmp4j/CommunityTarget;->setCommunity(Lorg/snmp4j/smi/OctetString;)V

    return-object v0
.end method

.method private dumpSnapshot()V
    .locals 8

    const/4 v0, 0x0

    :try_start_0
    new-instance v1, Ljava/io/FileInputStream;

    iget-object v2, p0, Lorg/snmp4j/tools/console/SnmpRequest;->snapshotFile:Ljava/io/File;

    invoke-direct {v1, v2}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    new-instance v0, Ljava/io/ObjectInputStream;

    invoke-direct {v0, v1}, Ljava/io/ObjectInputStream;-><init>(Ljava/io/InputStream;)V

    invoke-virtual {v0}, Ljava/io/ObjectInputStream;->readObject()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Dumping snapshot file \'"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, p0, Lorg/snmp4j/tools/console/SnmpRequest;->snapshotFile:Ljava/io/File;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v4, "\':"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const/4 v3, 0x1

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    sget-object v4, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, ""

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v6, ": "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_4

    :catch_0
    move-exception v0

    goto :goto_2

    :cond_0
    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v2}, Ljava/io/PrintStream;->println()V

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Dumped "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " variable bindings."

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_1
    :try_start_2
    invoke-virtual {v1}, Ljava/io/FileInputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_3

    :catchall_1
    move-exception v1

    move-object v7, v1

    move-object v1, v0

    move-object v0, v7

    goto :goto_4

    :catch_1
    move-exception v1

    move-object v7, v1

    move-object v1, v0

    move-object v0, v7

    :goto_2
    :try_start_3
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    if-eqz v1, :cond_1

    goto :goto_1

    :catch_2
    :cond_1
    :goto_3
    return-void

    :goto_4
    if-eqz v1, :cond_2

    :try_start_4
    invoke-virtual {v1}, Ljava/io/FileInputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3

    :catch_3
    :cond_2
    throw v0
.end method

.method private static getAddress(Ljava/lang/String;)Lorg/snmp4j/smi/Address;
    .locals 3

    const/16 v0, 0x3a

    .line 2
    invoke-virtual {p0, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    .line 3
    const-string v1, "udp"

    if-lez v0, :cond_0

    const/4 v2, 0x0

    .line 4
    invoke-virtual {p0, v2, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    add-int/lit8 v0, v0, 0x1

    .line 5
    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_0
    move-object v2, v1

    :goto_0
    const/16 v0, 0x2f

    .line 6
    invoke-virtual {p0, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    if-gez v0, :cond_1

    .line 7
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "/161"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    .line 8
    :cond_1
    invoke-virtual {v2, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 9
    new-instance v0, Lorg/snmp4j/smi/UdpAddress;

    invoke-direct {v0, p0}, Lorg/snmp4j/smi/UdpAddress;-><init>(Ljava/lang/String;)V

    return-object v0

    .line 10
    :cond_2
    const-string v0, "tcp"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 11
    new-instance v0, Lorg/snmp4j/smi/TcpAddress;

    invoke-direct {v0, p0}, Lorg/snmp4j/smi/TcpAddress;-><init>(Ljava/lang/String;)V

    return-object v0

    .line 12
    :cond_3
    const-string v0, "tls"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 13
    new-instance v0, Lorg/snmp4j/smi/TlsAddress;

    invoke-direct {v0, p0}, Lorg/snmp4j/smi/TlsAddress;-><init>(Ljava/lang/String;)V

    return-object v0

    .line 14
    :cond_4
    new-instance p0, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unknown transport "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static getVariableBindings([Ljava/lang/String;I)Ljava/util/Vector;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/String;",
            "I)",
            "Ljava/util/Vector<",
            "Lorg/snmp4j/smi/VariableBinding;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/Vector;

    array-length v1, p0

    sub-int/2addr v1, p1

    add-int/lit8 v1, v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/Vector;-><init>(I)V

    :goto_0
    array-length v1, p0

    if-ge p1, v1, :cond_c

    aget-object v1, p0, p1

    const-string v2, "={"

    invoke-virtual {v1, v2}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v2

    const/4 v3, 0x0

    const/16 v4, 0x69

    const/4 v5, 0x2

    if-lez v2, :cond_0

    aget-object v1, p0, p1

    invoke-virtual {v1, v3, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    aget-object v3, p0, p1

    add-int/lit8 v2, v2, 0x2

    invoke-virtual {v3, v2}, Ljava/lang/String;->charAt(I)C

    move-result v2

    aget-object v3, p0, p1

    const/16 v6, 0x7d

    invoke-virtual {v3, v6}, Ljava/lang/String;->indexOf(I)I

    move-result v6

    add-int/lit8 v6, v6, 0x1

    invoke-virtual {v3, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v3

    goto/16 :goto_2

    :cond_0
    const/16 v2, 0x2d

    invoke-virtual {v1, v2}, Ljava/lang/String;->indexOf(I)I

    move-result v2

    if-lez v2, :cond_2

    new-instance v2, Ljava/util/StringTokenizer;

    const-string v4, "-"

    invoke-direct {v2, v1, v4}, Ljava/util/StringTokenizer;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/util/StringTokenizer;->countTokens()I

    move-result v4

    if-ne v4, v5, :cond_1

    invoke-virtual {v2}, Ljava/util/StringTokenizer;->nextToken()Ljava/lang/String;

    move-result-object v1

    new-instance v4, Lorg/snmp4j/smi/VariableBinding;

    new-instance v5, Lorg/snmp4j/smi/OID;

    invoke-direct {v5, v1}, Lorg/snmp4j/smi/OID;-><init>(Ljava/lang/String;)V

    invoke-direct {v4, v5}, Lorg/snmp4j/smi/VariableBinding;-><init>(Lorg/snmp4j/smi/OID;)V

    invoke-virtual {v0, v4}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z

    invoke-virtual {v2}, Ljava/util/StringTokenizer;->nextToken()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v1

    invoke-virtual {v4}, Lorg/snmp4j/smi/VariableBinding;->getOid()Lorg/snmp4j/smi/OID;

    move-result-object v5

    invoke-virtual {v5}, Lorg/snmp4j/smi/OID;->lastUnsigned()J

    move-result-wide v5

    const-wide/16 v7, 0x1

    :goto_1
    add-long/2addr v5, v7

    cmp-long v9, v5, v1

    if-gtz v9, :cond_b

    new-instance v9, Lorg/snmp4j/smi/OID;

    invoke-virtual {v4}, Lorg/snmp4j/smi/VariableBinding;->getOid()Lorg/snmp4j/smi/OID;

    move-result-object v10

    invoke-virtual {v10}, Lorg/snmp4j/smi/OID;->getValue()[I

    move-result-object v10

    invoke-virtual {v4}, Lorg/snmp4j/smi/VariableBinding;->getOid()Lorg/snmp4j/smi/OID;

    move-result-object v11

    invoke-virtual {v11}, Lorg/snmp4j/smi/OID;->size()I

    move-result v11

    add-int/lit8 v11, v11, -0x1

    invoke-direct {v9, v10, v3, v11}, Lorg/snmp4j/smi/OID;-><init>([III)V

    invoke-virtual {v9, v5, v6}, Lorg/snmp4j/smi/OID;->appendUnsigned(J)Lorg/snmp4j/smi/OID;

    new-instance v10, Lorg/snmp4j/smi/VariableBinding;

    invoke-direct {v10, v9}, Lorg/snmp4j/smi/VariableBinding;-><init>(Lorg/snmp4j/smi/OID;)V

    invoke-virtual {v0, v10}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Illegal OID range specified: \'"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    const/4 v3, 0x0

    move v2, v4

    :goto_2
    new-instance v6, Lorg/snmp4j/smi/VariableBinding;

    new-instance v7, Lorg/snmp4j/smi/OID;

    invoke-direct {v7, v1}, Lorg/snmp4j/smi/OID;-><init>(Ljava/lang/String;)V

    invoke-direct {v6, v7}, Lorg/snmp4j/smi/VariableBinding;-><init>(Lorg/snmp4j/smi/OID;)V

    if-eqz v3, :cond_a

    const/16 v1, 0x61

    if-eq v2, v1, :cond_9

    const/16 v1, 0x62

    if-eq v2, v1, :cond_8

    const/16 v1, 0x64

    if-eq v2, v1, :cond_7

    if-eq v2, v4, :cond_6

    const/16 v1, 0x78

    if-eq v2, v1, :cond_5

    const/16 v1, 0x6e

    if-eq v2, v1, :cond_4

    const/16 v1, 0x6f

    if-eq v2, v1, :cond_3

    packed-switch v2, :pswitch_data_0

    new-instance p0, Ljava/lang/IllegalArgumentException;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Variable type "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v0, " not supported"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :pswitch_0
    new-instance v1, Lorg/snmp4j/smi/UnsignedInteger32;

    invoke-static {v3}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v2

    invoke-direct {v1, v2, v3}, Lorg/snmp4j/smi/UnsignedInteger32;-><init>(J)V

    goto :goto_3

    :pswitch_1
    new-instance v1, Lorg/snmp4j/smi/TimeTicks;

    invoke-static {v3}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v2

    invoke-direct {v1, v2, v3}, Lorg/snmp4j/smi/TimeTicks;-><init>(J)V

    goto :goto_3

    :pswitch_2
    new-instance v1, Lorg/snmp4j/smi/OctetString;

    invoke-direct {v1, v3}, Lorg/snmp4j/smi/OctetString;-><init>(Ljava/lang/String;)V

    goto :goto_3

    :cond_3
    new-instance v1, Lorg/snmp4j/smi/OID;

    invoke-direct {v1, v3}, Lorg/snmp4j/smi/OID;-><init>(Ljava/lang/String;)V

    goto :goto_3

    :cond_4
    new-instance v1, Lorg/snmp4j/smi/Null;

    invoke-direct {v1}, Lorg/snmp4j/smi/Null;-><init>()V

    goto :goto_3

    :cond_5
    const/16 v1, 0x3a

    const/16 v2, 0x10

    invoke-static {v3, v1, v2}, Lorg/snmp4j/smi/OctetString;->fromString(Ljava/lang/String;CI)Lorg/snmp4j/smi/OctetString;

    move-result-object v1

    goto :goto_3

    :cond_6
    new-instance v1, Lorg/snmp4j/smi/Integer32;

    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    invoke-direct {v1, v2}, Lorg/snmp4j/smi/Integer32;-><init>(I)V

    goto :goto_3

    :cond_7
    const/16 v1, 0x2e

    const/16 v2, 0xa

    invoke-static {v3, v1, v2}, Lorg/snmp4j/smi/OctetString;->fromString(Ljava/lang/String;CI)Lorg/snmp4j/smi/OctetString;

    move-result-object v1

    goto :goto_3

    :cond_8
    const/16 v1, 0x20

    invoke-static {v3, v1, v5}, Lorg/snmp4j/smi/OctetString;->fromString(Ljava/lang/String;CI)Lorg/snmp4j/smi/OctetString;

    move-result-object v1

    goto :goto_3

    :cond_9
    new-instance v1, Lorg/snmp4j/smi/IpAddress;

    invoke-direct {v1, v3}, Lorg/snmp4j/smi/IpAddress;-><init>(Ljava/lang/String;)V

    :goto_3
    invoke-virtual {v6, v1}, Lorg/snmp4j/smi/VariableBinding;->setVariable(Lorg/snmp4j/smi/Variable;)V

    :cond_a
    invoke-virtual {v0, v6}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z

    :cond_b
    add-int/lit8 p1, p1, 0x1

    goto/16 :goto_0

    :cond_c
    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x73
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static main([Ljava/lang/String;)V
    .locals 7

    :try_start_0
    new-instance v0, Lorg/snmp4j/tools/console/SnmpRequest;

    invoke-direct {v0, p0}, Lorg/snmp4j/tools/console/SnmpRequest;-><init>([Ljava/lang/String;)V

    iget p0, v0, Lorg/snmp4j/tools/console/SnmpRequest;->operation:I

    const/4 v1, 0x7

    if-ne p0, v1, :cond_0

    invoke-direct {v0}, Lorg/snmp4j/tools/console/SnmpRequest;->dumpSnapshot()V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_4

    :catch_0
    move-exception p0

    goto/16 :goto_3

    :cond_0
    const/4 v1, 0x2

    if-ne p0, v1, :cond_1

    :try_start_1
    invoke-virtual {v0}, Lorg/snmp4j/tools/console/SnmpRequest;->listen()V

    goto/16 :goto_4

    :catch_1
    move-exception p0

    goto/16 :goto_2

    :cond_1
    const/4 v1, 0x3

    if-eq p0, v1, :cond_8

    const/4 v1, 0x4

    if-eq p0, v1, :cond_8

    const/4 v1, 0x5

    if-ne p0, v1, :cond_2

    goto/16 :goto_1

    :cond_2
    invoke-virtual {v0}, Lorg/snmp4j/tools/console/SnmpRequest;->send()Lorg/snmp4j/PDU;

    move-result-object p0

    invoke-virtual {v0}, Lorg/snmp4j/tools/console/SnmpRequest;->getPduType()I

    move-result v1

    const/16 v2, -0x59

    if-eq v1, v2, :cond_7

    invoke-virtual {v0}, Lorg/snmp4j/tools/console/SnmpRequest;->getPduType()I

    move-result v1

    const/16 v2, -0x58

    if-eq v1, v2, :cond_7

    invoke-virtual {v0}, Lorg/snmp4j/tools/console/SnmpRequest;->getPduType()I

    move-result v1

    const/16 v3, -0x5c

    if-eq v1, v3, :cond_7

    invoke-virtual {v0}, Lorg/snmp4j/tools/console/SnmpRequest;->getPduType()I

    move-result v1

    const/16 v3, -0x5e

    if-ne v1, v3, :cond_3

    goto/16 :goto_0

    :cond_3
    if-nez p0, :cond_4

    iget p0, v0, Lorg/snmp4j/tools/console/SnmpRequest;->operation:I

    const/4 v0, 0x1

    if-eq p0, v0, :cond_9

    sget-object p0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string v0, "Request timed out."

    invoke-virtual {p0, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    goto/16 :goto_4

    :cond_4
    invoke-virtual {p0}, Lorg/snmp4j/PDU;->getType()I

    move-result v1

    if-ne v1, v2, :cond_5

    invoke-static {p0}, Lorg/snmp4j/tools/console/SnmpRequest;->printReport(Lorg/snmp4j/PDU;)V

    goto/16 :goto_4

    :cond_5
    iget v0, v0, Lorg/snmp4j/tools/console/SnmpRequest;->operation:I
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_0

    const-string v1, ")"

    const-string v2, "("

    const-string v3, ", errorStatus="

    const-string v4, ", errorIndex="

    if-nez v0, :cond_6

    :try_start_2
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Response received with requestID="

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lorg/snmp4j/PDU;->getRequestID()Lorg/snmp4j/smi/Integer32;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lorg/snmp4j/PDU;->getErrorIndex()I

    move-result v4

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lorg/snmp4j/PDU;->getErrorStatusText()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lorg/snmp4j/PDU;->getErrorStatus()I

    move-result v2

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    invoke-static {p0}, Lorg/snmp4j/tools/console/SnmpRequest;->printVariableBindings(Lorg/snmp4j/PDU;)V

    goto/16 :goto_4

    :cond_6
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Received something strange: requestID="

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lorg/snmp4j/PDU;->getRequestID()Lorg/snmp4j/smi/Integer32;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lorg/snmp4j/PDU;->getErrorIndex()I

    move-result v4

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lorg/snmp4j/PDU;->getErrorStatusText()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lorg/snmp4j/PDU;->getErrorStatus()I

    move-result v2

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    invoke-static {p0}, Lorg/snmp4j/tools/console/SnmpRequest;->printVariableBindings(Lorg/snmp4j/PDU;)V

    goto :goto_4

    :cond_7
    :goto_0
    sget-object p0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, Lorg/snmp4j/tools/console/SnmpRequest;->getPduType()I

    move-result v0

    invoke-static {v0}, Lorg/snmp4j/PDU;->getTypeString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " sent successfully"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    goto :goto_4

    :cond_8
    :goto_1
    invoke-virtual {v0}, Lorg/snmp4j/tools/console/SnmpRequest;->table()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_4

    :goto_2
    :try_start_3
    sget-object v0, Ljava/lang/System;->err:Ljava/io/PrintStream;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Error while trying to send request: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_3
    .catch Ljava/lang/IllegalArgumentException; {:try_start_3 .. :try_end_3} :catch_0

    goto :goto_4

    :goto_3
    sget-object v0, Ljava/lang/System;->err:Ljava/io/PrintStream;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Error: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->print(Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_9
    :goto_4
    return-void
.end method

.method private static nextOption([Ljava/lang/String;I)Ljava/lang/String;
    .locals 3

    add-int/lit8 v0, p1, 0x1

    array-length v1, p0

    if-ge v0, v1, :cond_0

    aget-object p0, p0, v0

    return-object p0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Missing option value for "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    aget-object p0, p0, p1

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private parseArgs([Ljava/lang/String;)I
    .locals 7

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    array-length v2, p1

    if-ge v1, v2, :cond_39

    aget-object v2, p1, v1

    const-string v3, "-a"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    const/4 v3, 0x1

    if-eqz v2, :cond_4

    add-int/lit8 v2, v1, 0x1

    invoke-static {p1, v1}, Lorg/snmp4j/tools/console/SnmpRequest;->nextOption([Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v1

    const-string v4, "MD5"

    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    sget-object v1, Lorg/snmp4j/security/AuthMD5;->ID:Lorg/snmp4j/smi/OID;

    iput-object v1, p0, Lorg/snmp4j/tools/console/SnmpRequest;->authProtocol:Lorg/snmp4j/smi/OID;

    goto :goto_1

    :cond_0
    const-string v4, "SHA"

    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    sget-object v1, Lorg/snmp4j/security/AuthSHA;->ID:Lorg/snmp4j/smi/OID;

    iput-object v1, p0, Lorg/snmp4j/tools/console/SnmpRequest;->authProtocol:Lorg/snmp4j/smi/OID;

    goto :goto_1

    :cond_1
    const-string v4, "SHA256"

    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    sget-object v1, Lorg/snmp4j/security/AuthHMAC192SHA256;->ID:Lorg/snmp4j/smi/OID;

    iput-object v1, p0, Lorg/snmp4j/tools/console/SnmpRequest;->authProtocol:Lorg/snmp4j/smi/OID;

    goto :goto_1

    :cond_2
    const-string v4, "SHA512"

    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    sget-object v1, Lorg/snmp4j/security/AuthHMAC384SHA512;->ID:Lorg/snmp4j/smi/OID;

    iput-object v1, p0, Lorg/snmp4j/tools/console/SnmpRequest;->authProtocol:Lorg/snmp4j/smi/OID;

    :goto_1
    move v1, v2

    goto/16 :goto_7

    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Authentication protocol unsupported: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    aget-object v2, p1, v1

    const-string v4, "-A"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    add-int/lit8 v2, v1, 0x1

    invoke-static {p1, v1}, Lorg/snmp4j/tools/console/SnmpRequest;->nextOption([Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lorg/snmp4j/tools/console/SnmpRequest;->createOctetString(Ljava/lang/String;)Lorg/snmp4j/smi/OctetString;

    move-result-object v1

    iput-object v1, p0, Lorg/snmp4j/tools/console/SnmpRequest;->authPassphrase:Lorg/snmp4j/smi/OctetString;

    goto :goto_1

    :cond_5
    aget-object v2, p1, v1

    const-string v4, "-X"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_38

    aget-object v2, p1, v1

    const-string v4, "-P"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    goto/16 :goto_6

    :cond_6
    aget-object v2, p1, v1

    const-string v4, "-c"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_7

    add-int/lit8 v2, v1, 0x1

    invoke-static {p1, v1}, Lorg/snmp4j/tools/console/SnmpRequest;->nextOption([Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lorg/snmp4j/tools/console/SnmpRequest;->createOctetString(Ljava/lang/String;)Lorg/snmp4j/smi/OctetString;

    move-result-object v1

    iput-object v1, p0, Lorg/snmp4j/tools/console/SnmpRequest;->community:Lorg/snmp4j/smi/OctetString;

    goto :goto_1

    :cond_7
    aget-object v2, p1, v1

    const-string v4, "-b"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_8

    add-int/lit8 v2, v1, 0x1

    invoke-static {p1, v1}, Lorg/snmp4j/tools/console/SnmpRequest;->nextOption([Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v1

    iput v1, p0, Lorg/snmp4j/tools/console/SnmpRequest;->engineBootCount:I

    goto :goto_1

    :cond_8
    aget-object v2, p1, v1

    const-string v4, "-d"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_9

    add-int/lit8 v2, v1, 0x1

    invoke-static {p1, v1}, Lorg/snmp4j/tools/console/SnmpRequest;->nextOption([Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Lorg/snmp4j/log/LogFactory;->getLogFactory()Lorg/snmp4j/log/LogFactory;

    move-result-object v4

    invoke-virtual {v4}, Lorg/snmp4j/log/LogFactory;->getRootLogger()Lorg/snmp4j/log/LogAdapter;

    move-result-object v4

    invoke-static {v1}, Lorg/snmp4j/log/LogLevel;->toLevel(Ljava/lang/String;)Lorg/snmp4j/log/LogLevel;

    move-result-object v1

    invoke-interface {v4, v1}, Lorg/snmp4j/log/LogAdapter;->setLogLevel(Lorg/snmp4j/log/LogLevel;)V

    goto/16 :goto_1

    :cond_9
    aget-object v2, p1, v1

    const-string v4, "-l"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_a

    add-int/lit8 v2, v1, 0x1

    invoke-static {p1, v1}, Lorg/snmp4j/tools/console/SnmpRequest;->nextOption([Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lorg/snmp4j/tools/console/SnmpRequest;->createOctetString(Ljava/lang/String;)Lorg/snmp4j/smi/OctetString;

    move-result-object v1

    iput-object v1, p0, Lorg/snmp4j/tools/console/SnmpRequest;->localEngineID:Lorg/snmp4j/smi/OctetString;

    goto/16 :goto_1

    :cond_a
    aget-object v2, p1, v1

    const-string v4, "-e"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_b

    add-int/lit8 v2, v1, 0x1

    invoke-static {p1, v1}, Lorg/snmp4j/tools/console/SnmpRequest;->nextOption([Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lorg/snmp4j/tools/console/SnmpRequest;->createOctetString(Ljava/lang/String;)Lorg/snmp4j/smi/OctetString;

    move-result-object v1

    iput-object v1, p0, Lorg/snmp4j/tools/console/SnmpRequest;->authoritativeEngineID:Lorg/snmp4j/smi/OctetString;

    goto/16 :goto_1

    :cond_b
    aget-object v2, p1, v1

    const-string v4, "-E"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_c

    add-int/lit8 v2, v1, 0x1

    invoke-static {p1, v1}, Lorg/snmp4j/tools/console/SnmpRequest;->nextOption([Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lorg/snmp4j/tools/console/SnmpRequest;->createOctetString(Ljava/lang/String;)Lorg/snmp4j/smi/OctetString;

    move-result-object v1

    iput-object v1, p0, Lorg/snmp4j/tools/console/SnmpRequest;->contextEngineID:Lorg/snmp4j/smi/OctetString;

    goto/16 :goto_1

    :cond_c
    aget-object v2, p1, v1

    const-string v4, "-h"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_d

    invoke-static {}, Lorg/snmp4j/tools/console/SnmpRequest;->printUsage()V

    invoke-static {v0}, Ljava/lang/System;->exit(I)V

    goto/16 :goto_7

    :cond_d
    aget-object v2, p1, v1

    const-string v4, "-n"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_e

    add-int/lit8 v2, v1, 0x1

    invoke-static {p1, v1}, Lorg/snmp4j/tools/console/SnmpRequest;->nextOption([Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lorg/snmp4j/tools/console/SnmpRequest;->createOctetString(Ljava/lang/String;)Lorg/snmp4j/smi/OctetString;

    move-result-object v1

    iput-object v1, p0, Lorg/snmp4j/tools/console/SnmpRequest;->contextName:Lorg/snmp4j/smi/OctetString;

    goto/16 :goto_1

    :cond_e
    aget-object v2, p1, v1

    const-string v4, "-m"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_f

    add-int/lit8 v2, v1, 0x1

    invoke-static {p1, v1}, Lorg/snmp4j/tools/console/SnmpRequest;->nextOption([Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    iput v1, p0, Lorg/snmp4j/tools/console/SnmpRequest;->maxSizeResponsePDU:I

    goto/16 :goto_1

    :cond_f
    aget-object v2, p1, v1

    const-string v4, "-r"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_10

    add-int/lit8 v2, v1, 0x1

    invoke-static {p1, v1}, Lorg/snmp4j/tools/console/SnmpRequest;->nextOption([Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    iput v1, p0, Lorg/snmp4j/tools/console/SnmpRequest;->retries:I

    goto/16 :goto_1

    :cond_10
    aget-object v2, p1, v1

    const-string v4, "-t"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_11

    add-int/lit8 v2, v1, 0x1

    invoke-static {p1, v1}, Lorg/snmp4j/tools/console/SnmpRequest;->nextOption([Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    iput v1, p0, Lorg/snmp4j/tools/console/SnmpRequest;->timeout:I

    goto/16 :goto_1

    :cond_11
    aget-object v2, p1, v1

    const-string v4, "-u"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_12

    add-int/lit8 v2, v1, 0x1

    invoke-static {p1, v1}, Lorg/snmp4j/tools/console/SnmpRequest;->nextOption([Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lorg/snmp4j/tools/console/SnmpRequest;->createOctetString(Ljava/lang/String;)Lorg/snmp4j/smi/OctetString;

    move-result-object v1

    iput-object v1, p0, Lorg/snmp4j/tools/console/SnmpRequest;->securityName:Lorg/snmp4j/smi/OctetString;

    goto/16 :goto_1

    :cond_12
    aget-object v2, p1, v1

    const-string v4, "-V"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_13

    invoke-static {}, Lorg/snmp4j/tools/console/SnmpRequest;->printVersion()V

    invoke-static {v0}, Ljava/lang/System;->exit(I)V

    goto/16 :goto_7

    :cond_13
    aget-object v2, p1, v1

    const-string v4, "-Cr"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_14

    add-int/lit8 v2, v1, 0x1

    invoke-static {p1, v1}, Lorg/snmp4j/tools/console/SnmpRequest;->nextOption([Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    iput v1, p0, Lorg/snmp4j/tools/console/SnmpRequest;->maxRepetitions:I

    goto/16 :goto_1

    :cond_14
    aget-object v2, p1, v1

    const-string v4, "-Cn"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_15

    add-int/lit8 v2, v1, 0x1

    invoke-static {p1, v1}, Lorg/snmp4j/tools/console/SnmpRequest;->nextOption([Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    iput v1, p0, Lorg/snmp4j/tools/console/SnmpRequest;->nonRepeaters:I

    goto/16 :goto_1

    :cond_15
    aget-object v2, p1, v1

    const-string v4, "-Ce"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_17

    iget-object v2, p0, Lorg/snmp4j/tools/console/SnmpRequest;->v1TrapPDU:Lorg/snmp4j/PDUv1;

    new-instance v4, Lorg/snmp4j/smi/OID;

    add-int/lit8 v5, v1, 0x1

    invoke-static {p1, v1}, Lorg/snmp4j/tools/console/SnmpRequest;->nextOption([Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v4, v1}, Lorg/snmp4j/smi/OID;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v4}, Lorg/snmp4j/PDUv1;->setEnterprise(Lorg/snmp4j/smi/OID;)V

    :cond_16
    :goto_2
    move v1, v5

    goto/16 :goto_7

    :cond_17
    aget-object v2, p1, v1

    const-string v4, "-Ct"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_18

    new-instance v2, Lorg/snmp4j/smi/OID;

    add-int/lit8 v4, v1, 0x1

    invoke-static {p1, v1}, Lorg/snmp4j/tools/console/SnmpRequest;->nextOption([Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Lorg/snmp4j/smi/OID;-><init>(Ljava/lang/String;)V

    iput-object v2, p0, Lorg/snmp4j/tools/console/SnmpRequest;->trapOID:Lorg/snmp4j/smi/OID;

    :goto_3
    move v1, v4

    goto/16 :goto_7

    :cond_18
    aget-object v2, p1, v1

    const-string v4, "-Cg"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_19

    iget-object v2, p0, Lorg/snmp4j/tools/console/SnmpRequest;->v1TrapPDU:Lorg/snmp4j/PDUv1;

    add-int/lit8 v4, v1, 0x1

    invoke-static {p1, v1}, Lorg/snmp4j/tools/console/SnmpRequest;->nextOption([Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v2, v1}, Lorg/snmp4j/PDUv1;->setGenericTrap(I)V

    goto :goto_3

    :cond_19
    aget-object v2, p1, v1

    const-string v4, "-Cs"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1a

    iget-object v2, p0, Lorg/snmp4j/tools/console/SnmpRequest;->v1TrapPDU:Lorg/snmp4j/PDUv1;

    add-int/lit8 v4, v1, 0x1

    invoke-static {p1, v1}, Lorg/snmp4j/tools/console/SnmpRequest;->nextOption([Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v2, v1}, Lorg/snmp4j/PDUv1;->setSpecificTrap(I)V

    goto :goto_3

    :cond_1a
    aget-object v2, p1, v1

    const-string v4, "-Ca"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1b

    iget-object v2, p0, Lorg/snmp4j/tools/console/SnmpRequest;->v1TrapPDU:Lorg/snmp4j/PDUv1;

    new-instance v4, Lorg/snmp4j/smi/IpAddress;

    add-int/lit8 v5, v1, 0x1

    invoke-static {p1, v1}, Lorg/snmp4j/tools/console/SnmpRequest;->nextOption([Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v4, v1}, Lorg/snmp4j/smi/IpAddress;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v4}, Lorg/snmp4j/PDUv1;->setAgentAddress(Lorg/snmp4j/smi/IpAddress;)V

    goto :goto_2

    :cond_1b
    aget-object v2, p1, v1

    const-string v4, "-Cu"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1c

    add-int/lit8 v2, v1, 0x1

    invoke-static {p1, v1}, Lorg/snmp4j/tools/console/SnmpRequest;->nextOption([Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v1

    iget-object v4, p0, Lorg/snmp4j/tools/console/SnmpRequest;->v1TrapPDU:Lorg/snmp4j/PDUv1;

    invoke-static {v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v5

    invoke-virtual {v4, v5, v6}, Lorg/snmp4j/PDUv1;->setTimestamp(J)V

    iget-object v4, p0, Lorg/snmp4j/tools/console/SnmpRequest;->sysUpTime:Lorg/snmp4j/smi/TimeTicks;

    invoke-static {v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v5

    invoke-virtual {v4, v5, v6}, Lorg/snmp4j/smi/UnsignedInteger32;->setValue(J)V

    goto/16 :goto_1

    :cond_1c
    aget-object v2, p1, v1

    const-string v4, "-Ow"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1d

    iput v3, p0, Lorg/snmp4j/tools/console/SnmpRequest;->operation:I

    goto/16 :goto_7

    :cond_1d
    aget-object v2, p1, v1

    const-string v4, "-Ocs"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    const-string v4, "Snapshot file \'"

    if-eqz v2, :cond_1f

    const/4 v2, 0x6

    iput v2, p0, Lorg/snmp4j/tools/console/SnmpRequest;->operation:I

    new-instance v2, Ljava/io/File;

    add-int/lit8 v5, v1, 0x1

    invoke-static {p1, v1}, Lorg/snmp4j/tools/console/SnmpRequest;->nextOption([Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    iput-object v2, p0, Lorg/snmp4j/tools/console/SnmpRequest;->snapshotFile:Ljava/io/File;

    invoke-virtual {v2}, Ljava/io/File;->canWrite()Z

    move-result v1

    if-nez v1, :cond_16

    iget-object v1, p0, Lorg/snmp4j/tools/console/SnmpRequest;->snapshotFile:Ljava/io/File;

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v1

    if-nez v1, :cond_1e

    goto/16 :goto_2

    :cond_1e
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lorg/snmp4j/tools/console/SnmpRequest;->snapshotFile:Ljava/io/File;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "\' cannot be written"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1f
    aget-object v2, p1, v1

    const-string v5, "-Ods"

    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_21

    const/4 v2, 0x7

    iput v2, p0, Lorg/snmp4j/tools/console/SnmpRequest;->operation:I

    new-instance v2, Ljava/io/File;

    add-int/lit8 v5, v1, 0x1

    invoke-static {p1, v1}, Lorg/snmp4j/tools/console/SnmpRequest;->nextOption([Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    iput-object v2, p0, Lorg/snmp4j/tools/console/SnmpRequest;->snapshotFile:Ljava/io/File;

    invoke-virtual {v2}, Ljava/io/File;->canRead()Z

    move-result v1

    if-eqz v1, :cond_20

    goto/16 :goto_2

    :cond_20
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lorg/snmp4j/tools/console/SnmpRequest;->snapshotFile:Ljava/io/File;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "\' cannot be read"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_21
    aget-object v2, p1, v1

    const-string v4, "-Ol"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_22

    const/4 v2, 0x2

    iput v2, p0, Lorg/snmp4j/tools/console/SnmpRequest;->operation:I

    goto/16 :goto_7

    :cond_22
    aget-object v2, p1, v1

    const-string v4, "-OtCSV"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_23

    const/4 v2, 0x4

    iput v2, p0, Lorg/snmp4j/tools/console/SnmpRequest;->operation:I

    goto/16 :goto_7

    :cond_23
    aget-object v2, p1, v1

    const-string v4, "-OttCSV"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_24

    const/4 v2, 0x5

    iput v2, p0, Lorg/snmp4j/tools/console/SnmpRequest;->operation:I

    goto/16 :goto_7

    :cond_24
    aget-object v2, p1, v1

    const-string v4, "-Ot"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    const/4 v4, 0x3

    if-eqz v2, :cond_25

    iput v4, p0, Lorg/snmp4j/tools/console/SnmpRequest;->operation:I

    goto/16 :goto_7

    :cond_25
    aget-object v2, p1, v1

    const-string v5, "-Otd"

    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_26

    iput v4, p0, Lorg/snmp4j/tools/console/SnmpRequest;->operation:I

    iput-boolean v3, p0, Lorg/snmp4j/tools/console/SnmpRequest;->useDenseTableOperation:Z

    goto/16 :goto_7

    :cond_26
    aget-object v2, p1, v1

    const-string v5, "-Cil"

    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_27

    new-instance v2, Lorg/snmp4j/smi/OID;

    add-int/lit8 v4, v1, 0x1

    invoke-static {p1, v1}, Lorg/snmp4j/tools/console/SnmpRequest;->nextOption([Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Lorg/snmp4j/smi/OID;-><init>(Ljava/lang/String;)V

    iput-object v2, p0, Lorg/snmp4j/tools/console/SnmpRequest;->lowerBoundIndex:Lorg/snmp4j/smi/OID;

    goto/16 :goto_3

    :cond_27
    aget-object v2, p1, v1

    const-string v5, "-Ciu"

    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_28

    new-instance v2, Lorg/snmp4j/smi/OID;

    add-int/lit8 v4, v1, 0x1

    invoke-static {p1, v1}, Lorg/snmp4j/tools/console/SnmpRequest;->nextOption([Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Lorg/snmp4j/smi/OID;-><init>(Ljava/lang/String;)V

    iput-object v2, p0, Lorg/snmp4j/tools/console/SnmpRequest;->upperBoundIndex:Lorg/snmp4j/smi/OID;

    goto/16 :goto_3

    :cond_28
    aget-object v2, p1, v1

    const-string v5, "-v"

    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    const-string v5, " not supported"

    if-eqz v2, :cond_2c

    add-int/lit8 v2, v1, 0x1

    invoke-static {p1, v1}, Lorg/snmp4j/tools/console/SnmpRequest;->nextOption([Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v1

    const-string v6, "1"

    invoke-virtual {v1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_29

    iput v0, p0, Lorg/snmp4j/tools/console/SnmpRequest;->version:I

    goto/16 :goto_1

    :cond_29
    const-string v6, "2c"

    invoke-virtual {v1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2a

    iput v3, p0, Lorg/snmp4j/tools/console/SnmpRequest;->version:I

    goto/16 :goto_1

    :cond_2a
    const-string v6, "3"

    invoke-virtual {v1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2b

    iput v4, p0, Lorg/snmp4j/tools/console/SnmpRequest;->version:I

    goto/16 :goto_1

    :cond_2b
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Version "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2c
    aget-object v2, p1, v1

    const-string v4, "-x"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_34

    add-int/lit8 v2, v1, 0x1

    invoke-static {p1, v1}, Lorg/snmp4j/tools/console/SnmpRequest;->nextOption([Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v1

    const-string v4, "DES"

    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2d

    sget-object v1, Lorg/snmp4j/security/PrivDES;->ID:Lorg/snmp4j/smi/OID;

    iput-object v1, p0, Lorg/snmp4j/tools/console/SnmpRequest;->privProtocol:Lorg/snmp4j/smi/OID;

    goto/16 :goto_1

    :cond_2d
    const-string v4, "AES128"

    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_33

    const-string v4, "AES"

    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2e

    goto :goto_5

    :cond_2e
    const-string v4, "AES192"

    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2f

    sget-object v1, Lorg/snmp4j/security/PrivAES192;->ID:Lorg/snmp4j/smi/OID;

    iput-object v1, p0, Lorg/snmp4j/tools/console/SnmpRequest;->privProtocol:Lorg/snmp4j/smi/OID;

    goto/16 :goto_1

    :cond_2f
    const-string v4, "AES256"

    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_30

    sget-object v1, Lorg/snmp4j/security/PrivAES256;->ID:Lorg/snmp4j/smi/OID;

    iput-object v1, p0, Lorg/snmp4j/tools/console/SnmpRequest;->privProtocol:Lorg/snmp4j/smi/OID;

    goto/16 :goto_1

    :cond_30
    const-string v4, "3DES"

    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_32

    const-string v4, "DESEDE"

    invoke-virtual {v1, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_31

    goto :goto_4

    :cond_31
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Privacy protocol "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_32
    :goto_4
    sget-object v1, Lorg/snmp4j/security/Priv3DES;->ID:Lorg/snmp4j/smi/OID;

    iput-object v1, p0, Lorg/snmp4j/tools/console/SnmpRequest;->privProtocol:Lorg/snmp4j/smi/OID;

    goto/16 :goto_1

    :cond_33
    :goto_5
    sget-object v1, Lorg/snmp4j/security/PrivAES128;->ID:Lorg/snmp4j/smi/OID;

    iput-object v1, p0, Lorg/snmp4j/tools/console/SnmpRequest;->privProtocol:Lorg/snmp4j/smi/OID;

    goto/16 :goto_1

    :cond_34
    aget-object v2, p1, v1

    const-string v4, "-p"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_36

    add-int/lit8 v2, v1, 0x1

    invoke-static {p1, v1}, Lorg/snmp4j/tools/console/SnmpRequest;->nextOption([Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lorg/snmp4j/PDU;->getTypeFromString(Ljava/lang/String;)I

    move-result v4

    iput v4, p0, Lorg/snmp4j/tools/console/SnmpRequest;->pduType:I

    const/high16 v5, -0x80000000

    if-eq v4, v5, :cond_35

    goto/16 :goto_1

    :cond_35
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unknown PDU type "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_36
    aget-object v0, p1, v1

    const-string v2, "-"

    invoke-virtual {v0, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_37

    return v1

    :cond_37
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Unknown option "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    aget-object p1, p1, v1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_38
    :goto_6
    add-int/lit8 v2, v1, 0x1

    invoke-static {p1, v1}, Lorg/snmp4j/tools/console/SnmpRequest;->nextOption([Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lorg/snmp4j/tools/console/SnmpRequest;->createOctetString(Ljava/lang/String;)Lorg/snmp4j/smi/OctetString;

    move-result-object v1

    iput-object v1, p0, Lorg/snmp4j/tools/console/SnmpRequest;->privPassphrase:Lorg/snmp4j/smi/OctetString;

    goto/16 :goto_1

    :goto_7
    add-int/2addr v1, v3

    goto/16 :goto_0

    :cond_39
    return v0
.end method

.method protected static printReport(Lorg/snmp4j/PDU;)V
    .locals 4

    invoke-virtual {p0}, Lorg/snmp4j/PDU;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ge v0, v1, :cond_0

    sget-object p0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string v0, "REPORT PDU does not contain a variable binding."

    invoke-virtual {p0, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    return-void

    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lorg/snmp4j/PDU;->get(I)Lorg/snmp4j/smi/VariableBinding;

    move-result-object p0

    invoke-virtual {p0}, Lorg/snmp4j/smi/VariableBinding;->getOid()Lorg/snmp4j/smi/OID;

    move-result-object v0

    sget-object v1, Lorg/snmp4j/mp/SnmpConstants;->usmStatsUnsupportedSecLevels:Lorg/snmp4j/smi/OID;

    invoke-virtual {v1, v0}, Lorg/snmp4j/smi/OID;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string v1, "REPORT: Unsupported Security Level."

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->print(Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_1
    sget-object v1, Lorg/snmp4j/mp/SnmpConstants;->usmStatsNotInTimeWindows:Lorg/snmp4j/smi/OID;

    invoke-virtual {v1, v0}, Lorg/snmp4j/smi/OID;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string v1, "REPORT: Message not within time window."

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->print(Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_2
    sget-object v1, Lorg/snmp4j/mp/SnmpConstants;->usmStatsUnknownUserNames:Lorg/snmp4j/smi/OID;

    invoke-virtual {v1, v0}, Lorg/snmp4j/smi/OID;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string v1, "REPORT: Unknown user name."

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->print(Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_3
    sget-object v1, Lorg/snmp4j/mp/SnmpConstants;->usmStatsUnknownEngineIDs:Lorg/snmp4j/smi/OID;

    invoke-virtual {v1, v0}, Lorg/snmp4j/smi/OID;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string v1, "REPORT: Unknown engine id."

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->print(Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_4
    sget-object v1, Lorg/snmp4j/mp/SnmpConstants;->usmStatsWrongDigests:Lorg/snmp4j/smi/OID;

    invoke-virtual {v1, v0}, Lorg/snmp4j/smi/OID;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string v1, "REPORT: Wrong digest."

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->print(Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_5
    sget-object v1, Lorg/snmp4j/mp/SnmpConstants;->usmStatsDecryptionErrors:Lorg/snmp4j/smi/OID;

    invoke-virtual {v1, v0}, Lorg/snmp4j/smi/OID;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string v1, "REPORT: Decryption error."

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->print(Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_6
    sget-object v1, Lorg/snmp4j/mp/SnmpConstants;->snmpUnknownSecurityModels:Lorg/snmp4j/smi/OID;

    invoke-virtual {v1, v0}, Lorg/snmp4j/smi/OID;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7

    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string v1, "REPORT: Unknown security model."

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->print(Ljava/lang/String;)V

    goto :goto_0

    :cond_7
    sget-object v1, Lorg/snmp4j/mp/SnmpConstants;->snmpInvalidMsgs:Lorg/snmp4j/smi/OID;

    invoke-virtual {v1, v0}, Lorg/snmp4j/smi/OID;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_8

    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string v1, "REPORT: Invalid message."

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->print(Ljava/lang/String;)V

    goto :goto_0

    :cond_8
    sget-object v1, Lorg/snmp4j/mp/SnmpConstants;->snmpUnknownPDUHandlers:Lorg/snmp4j/smi/OID;

    invoke-virtual {v1, v0}, Lorg/snmp4j/smi/OID;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_9

    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string v1, "REPORT: Unknown PDU handler."

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->print(Ljava/lang/String;)V

    goto :goto_0

    :cond_9
    sget-object v1, Lorg/snmp4j/mp/SnmpConstants;->snmpUnavailableContexts:Lorg/snmp4j/smi/OID;

    invoke-virtual {v1, v0}, Lorg/snmp4j/smi/OID;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_a

    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string v1, "REPORT: Unavailable context."

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->print(Ljava/lang/String;)V

    goto :goto_0

    :cond_a
    sget-object v1, Lorg/snmp4j/mp/SnmpConstants;->snmpUnknownContexts:Lorg/snmp4j/smi/OID;

    invoke-virtual {v1, v0}, Lorg/snmp4j/smi/OID;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_b

    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string v1, "REPORT: Unknown context."

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->print(Ljava/lang/String;)V

    goto :goto_0

    :cond_b
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "REPORT contains unknown OID ("

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lorg/snmp4j/smi/OID;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")."

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->print(Ljava/lang/String;)V

    :goto_0
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, " Current counter value is "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lorg/snmp4j/smi/VariableBinding;->getVariable()Lorg/snmp4j/smi/Variable;

    move-result-object p0

    invoke-interface {p0}, Lorg/snmp4j/smi/Variable;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "."

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    return-void
.end method

.method protected static printUsage()V
    .locals 150

    const-string v148, "  1.3.6.1.2.1.2.2.1.16"

    const-string v149, ""

    const-string v0, ""

    const-string v1, "Usage: SNMP4J [options] [transport:]address [OID[={type}value] ...]"

    const-string v2, ""

    const-string v3, "  -a  authProtocol      Sets the authentication protocol used to"

    const-string v4, "                        authenticate SNMPv3 messages. Valid values are"

    const-string v5, "                        MD5 and SHA."

    const-string v6, "  -A  authPassphrase    Sets the authentication pass phrase for authenticated"

    const-string v7, "                        SNMPv3 messages."

    const-string v8, "  -b  engineBootCount   Sets the engine boot count to the specified value"

    const-string v9, "                        greater or equal to zero. Default is zero."

    const-string v10, "  -c  community         Sets the community for SNMPv1/v2c messages."

    const-string v11, "  -Ca agentAddress      Sets the agent address field of a V1TRAP PDU."

    const-string v12, "                        The default value is \'0.0.0.0\'."

    const-string v13, "  -Cg genericID         Sets the generic ID for SNMPv1 TRAPs (V1TRAP)."

    const-string v14, "                        The default is 0 (coldStart)."

    const-string v15, "  -Ce enterpriseOID     Sets the enterprise OID field of a V1TRAP PDU."

    const-string v16, "  -Cil lowerBoundIndex  Sets the lower bound index for TABLE operations."

    const-string v17, "  -Ciu upperBoundIndex  Sets the upper bound index for TABLE operations."

    const-string v18, "  -Cn non-repeaters     Sets  the  non-repeaters field for GETBULK PDUs."

    const-string v19, "                        It specifies the number of supplied variables that"

    const-string v20, "                        should not be iterated over. The default is 0."

    const-string v21, "  -Cr max-repetitions   Sets the max-repetitions field for GETBULK PDUs."

    const-string v22, "                        This specifies the maximum number of iterations"

    const-string v23, "                        over the repeating variables. The default is 10."

    const-string v24, "  -Cs specificID        Sets the specific ID for V1TRAP PDU. The default is 0."

    const-string v25, "  -Ct trapOID           Sets the trapOID (1.3.6.1.6.3.1.1.4.1.0) of an INFORM"

    const-string v26, "                        or TRAP PDU. The default is 1.3.6.1.6.3.1.1.5.1."

    const-string v27, "  -Cu upTime            Sets the sysUpTime field of an INFORM, TRAP, or"

    const-string v28, "                        V1TRAP PDU."

    const-string v29, "  -d  debugLevel        Sets the global debug level for Log4J logging output."

    const-string v30, "                        Valid values are OFF, ERROR, WARN, INFO, and DEBUG."

    const-string v31, "  -e  engineID          Sets the authoritative engine ID of the command"

    const-string v32, "                        responder used for SNMPv3 request messages. If not"

    const-string v33, "                        supplied, the engine ID will be discovered."

    const-string v34, "  -E  contextEngineID   Sets the context engine ID used for the SNMPv3 scoped"

    const-string v35, "                        PDU. The authoritative engine ID will be used for the"

    const-string v36, "                        context engine ID, if the latter is not specified."

    const-string v37, "  -h                    Displays this message and then exits the application."

    const-string v38, "  -l  localEngineID     Sets the local engine ID of the command generator"

    const-string v39, "                        and the notification receiver (thus this SNMP4J-Tool)"

    const-string v40, "                        used for SNMPv3 request messages. This option can be"

    const-string v41, "                        used to avoid engine ID clashes through duplicate IDs"

    const-string v42, "                        leading to usmStatsNotInTimeWindows reports."

    const-string v43, "  -n  contextName       Sets the target context name for SNMPv3 messages. "

    const-string v44, "                        Default is the empty string."

    const-string v45, "  -m  maxSizeRespPDU    The maximum size of the response PDU in bytes."

    const-string v46, "  -Ocs <file>           Same as -Ow except that the retrieved values are also"

    const-string v47, "                        written as a serialized ArrayList of VariableBinding"

    const-string v48, "                        instances to the specified file. The snapshot format"

    const-string v49, "                        can be read later by other applications, for example"

    const-string v50, "                        MIB Explorer Pro 2.2 or later. See also -Ods."

    const-string v51, "  -Ods <file>           Reads the snapshot file and dumps its contents on"

    const-string v52, "                        standard out. No SNMP operation will be done."

    const-string v53, "                        See also -Ocs."

    const-string v54, "  -Ol                   Activates listen operation mode. In this mode, the"

    const-string v55, "                        application will listen for incoming TRAPs and INFORMs"

    const-string v56, "                        on the supplied address. Received request will be"

    const-string v57, "                        dumped to the console until the application is stopped."

    const-string v58, "  -Ot                   Activates table operation mode. In this mode, the"

    const-string v59, "                        application receives tabular data from the column"

    const-string v60, "                        OIDs specified as parameters. The retrieved rows will"

    const-string v61, "                        be dumped to the console ordered by their index values."

    const-string v62, "  -Otd                  Activates dense table operation mode. In this mode, the"

    const-string v63, "                        application receives tabular data from the column"

    const-string v64, "                        OIDs specified as parameters. The retrieved rows will"

    const-string v65, "                        be dumped to the console ordered by their index values."

    const-string v66, "                        In contrast to -Ot this option must not be used with"

    const-string v67, "                        sparse tables. "

    const-string v68, "  -OtCSV                Same as -Ot except that for each SNMP row received"

    const-string v69, "                        exactly one row of comma separated values will printed"

    const-string v70, "                        to the console where the first column contains the row"

    const-string v71, "                        index."

    const-string v72, "  -OttCSV               Same as -OtCSV except that each row\'s first column"

    const-string v73, "                        will report the current time (millis after 1.1.1970)"

    const-string v74, "                        when the request has been sent."

    const-string v75, "  -Ow                   Activates walk operation mode for GETNEXT and GETBULK"

    const-string v76, "                        PDUs. If activated, the GETNEXT and GETBULK operations"

    const-string v77, "                        will be repeated until all instances within the"

    const-string v78, "                        OID subtree of the supplied OID have been retrieved"

    const-string v79, "                        successfully or until an error occurred."

    const-string v80, "  -p  pduType           Specifies the PDU type to be used for the message."

    const-string v81, "                        Valid types are GET, GETNEXT, GETBULK (SNMPv2c/v3),"

    const-string v82, "                        SET, INFORM, TRAP, and V1TRAP (SNMPv1)."

    const-string v83, "  -P  privacyPassphrase Sets the privacy pass phrase for encrypted"

    const-string v84, "                        SNMPv3 messages (same as -X)."

    const-string v85, "  -r  retries           Sets the number of retries used for requests. A zero"

    const-string v86, "                        value will send out a request exactly once."

    const-string v87, "                        Default is 1."

    const-string v88, "  -t  timeout           Sets the timeout in milliseconds between retries."

    const-string v89, "                        Default is 1000 milliseconds."

    const-string v90, "  -u  securityName      Sets the security name for authenticated v3 messages."

    const-string v91, "  -v  1|2c|3            Sets the SNMP protocol version to be used."

    const-string v92, "                        Default is 3."

    const-string v93, "  -V                    Displays version information and then exits."

    const-string v94, "  -x  privacyProtocol   Sets the privacy protocol to be used to encrypt"

    const-string v95, "                        SNMPv3 messages. Valid values are DES, AES (AES128),"

    const-string v96, "                        AES192, AES256, and 3DES(DESEDE)."

    const-string v97, "  -X  privacyPassphrase Sets the privacy pass phrase for encrypted"

    const-string v98, "                        SNMPv3 messages (same as -P)."

    const-string v99, ""

    const-string v100, "The address of the target SNMP engine is parsed according to the"

    const-string v101, "specified <transport> selector (default selector is udp):"

    const-string v102, ""

    const-string v103, "  udp | tcp | tls       hostname[/port]"

    const-string v104, "                        ipv4Address[/port]"

    const-string v105, "                        ipv6Address[/port]"

    const-string v106, ""

    const-string v107, "The OIDs have to be specified in numerical form where strings may beenclosed in single quotes (\'), for example:"

    const-string v108, "  1.3.6.1.2.1.1.5.0  (which will return the sysName.0 instance with a GET)"

    const-string v109, "  1.3.6.1.6.3.16.1.2.1.3.2.6.\'public\'  (which will return the "

    const-string v110, "    vacmGroupName.2.6.112.117.98.108.105.99 instance with a GET)"

    const-string v111, "To request multiple instances, add additional OIDs with a space as"

    const-string v112, "separator. For the last sub-identifier of a plain OID (without an assigned"

    const-string v113, "value) a range can be specified, for example \'1.3.6.1.2.1.2.2.1-10\' will"

    const-string v114, "has the same effect as enumerating all OIDs from \'1.3.6.1.2.1.2.2.1\' to"

    const-string v115, "\'1.3.6.1.2.1.2.2.10\'."

    const-string v116, "For SET and INFORM request, you can specify a value for each OID by"

    const-string v117, "using the following form: OID={type}value where <type> is one of"

    const-string v118, "the following single characters enclosed by \'{\' and \'}\':"

    const-string v119, "  i                     Integer32"

    const-string v120, "  u                     UnsingedInteger32, Gauge32"

    const-string v121, "  s                     OCTET STRING"

    const-string v122, "  x                     OCTET STRING specified as hex string where"

    const-string v123, "                        bytes separated by colons (\':\')."

    const-string v124, "  d                     OCTET STRING specified as decimal string"

    const-string v125, "                        where bytes are separated by dots (\'.\')."

    const-string v126, "  n                     Null"

    const-string v127, "  o                     OBJECT IDENTIFIER"

    const-string v128, "  t                     TimeTicks"

    const-string v129, "  a                     IpAddress"

    const-string v130, "  b                     OCTET STRING specified as binary string where"

    const-string v131, "                        bytes are separated by spaces."

    const-string v132, ""

    const-string v133, "An example for a complete SNMPv2c SET request to set sysName:"

    const-string v134, " SNMP4J -c private -v 2c -p SET udp:localhost/161 \"1.3.6.1.2.1.1.5.0={s}SNMP4J\""

    const-string v135, ""

    const-string v136, "To walk the whole MIB tree with GETBULK and using SNMPv3 MD5 authentication:"

    const-string v137, " SNMP4J -a MD5 -A MD5UserAuthPassword -u MD5User -p GETBULK -Ow 127.0.0.1/161"

    const-string v138, ""

    const-string v139, "Listen for unauthenticated SNMPv3 INFORMs and TRAPs and all v1/v2c TRAPs:"

    const-string v140, " SNMP4J -u aSecurityName -Ol 0.0.0.0/162"

    const-string v141, ""

    const-string v142, "Send an unauthenticated SNMPv3 notification (trap):"

    const-string v143, " SNMP4J -p TRAP -v 3 -u aSecurityName 127.0.0.1/162 \"1.3.6.1.2.1.1.3.0={t}0\" \\"

    const-string v144, "  \"1.3.6.1.6.3.1.1.4.1.0={o}1.3.6.1.6.3.1.1.5.1\" \\"

    const-string v145, "  \"1.3.6.1.2.1.1.1.0={s}System XYZ, Version N.M\""

    const-string v146, "Retrieve rows of the columnar objects ifDescr to ifInOctets and ifOutOctets:"

    const-string v147, " SNMP4J -c public -v 2c -Ot localhost 1.3.6.1.2.1.2.2.1.2-10\\"

    filled-new-array/range {v0 .. v149}, [Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    :goto_0
    const/16 v2, 0x96

    if-ge v1, v2, :cond_0

    aget-object v2, v0, v1

    sget-object v3, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v3, v2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method protected static printVariableBindings(Lorg/snmp4j/PDU;)V
    .locals 3

    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p0}, Lorg/snmp4j/PDU;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    invoke-virtual {p0, v0}, Lorg/snmp4j/PDU;->get(I)Lorg/snmp4j/smi/VariableBinding;

    move-result-object v1

    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1}, Lorg/snmp4j/smi/VariableBinding;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method protected static printVersion()V
    .locals 3

    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v0}, Ljava/io/PrintStream;->println()V

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "SNMP4J Command Line Tool v"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lorg/snmp4j/version/VersionInfo;->getVersion()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " Copyright "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0xa9

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, " 2004-2011, Frank Fock and Jochen Katz"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    const-string v1, "http://www.snmp4j.org"

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/PrintStream;->println()V

    const-string v1, "SNMP4J is licensed under the Apache License 2.0:"

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    const-string v1, "http://www.apache.org/licenses/LICENSE-2.0.txt"

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/PrintStream;->println()V

    return-void
.end method

.method private walk(Lorg/snmp4j/Snmp;Lorg/snmp4j/PDU;Lorg/snmp4j/Target;Ljava/util/List;)Lorg/snmp4j/PDU;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/snmp4j/Snmp;",
            "Lorg/snmp4j/PDU;",
            "Lorg/snmp4j/Target;",
            "Ljava/util/List<",
            "Lorg/snmp4j/smi/VariableBinding;",
            ">;)",
            "Lorg/snmp4j/PDU;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    invoke-virtual {p2, v0}, Lorg/snmp4j/PDU;->setNonRepeaters(I)V

    invoke-virtual {p2, v0}, Lorg/snmp4j/PDU;->get(I)Lorg/snmp4j/smi/VariableBinding;

    move-result-object p2

    invoke-virtual {p2}, Lorg/snmp4j/smi/VariableBinding;->getOid()Lorg/snmp4j/smi/OID;

    move-result-object p2

    new-instance v2, Lorg/snmp4j/tools/console/SnmpRequest$WalkCounts;

    invoke-direct {v2, p0}, Lorg/snmp4j/tools/console/SnmpRequest$WalkCounts;-><init>(Lorg/snmp4j/tools/console/SnmpRequest;)V

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v4

    new-instance v6, Lorg/snmp4j/util/TreeUtils;

    invoke-direct {v6, p1, p0}, Lorg/snmp4j/util/TreeUtils;-><init>(Lorg/snmp4j/Session;Lorg/snmp4j/util/PDUFactory;)V

    new-instance p1, Lorg/snmp4j/tools/console/SnmpRequest$1;

    move-object v0, p1

    move-object v1, p0

    move-object v3, p4

    invoke-direct/range {v0 .. v5}, Lorg/snmp4j/tools/console/SnmpRequest$1;-><init>(Lorg/snmp4j/tools/console/SnmpRequest;Lorg/snmp4j/tools/console/SnmpRequest$WalkCounts;Ljava/util/List;J)V

    monitor-enter p1

    const/4 p4, 0x0

    :try_start_0
    invoke-virtual {v6, p3, p2, p4, p1}, Lorg/snmp4j/util/TreeUtils;->getSubtree(Lorg/snmp4j/Target;Lorg/snmp4j/smi/OID;Ljava/lang/Object;Lorg/snmp4j/util/TreeListener;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    invoke-virtual {p1}, Ljava/lang/Object;->wait()V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p2

    goto :goto_1

    :catch_0
    move-exception p2

    :try_start_2
    sget-object p3, Ljava/lang/System;->err:Ljava/io/PrintStream;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Tree retrieval interrupted: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p3, p2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Thread;->interrupt()V

    :goto_0
    monitor-exit p1

    return-object p4

    :goto_1
    monitor-exit p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p2
.end method


# virtual methods
.method public createPDU(Lorg/snmp4j/Target;)Lorg/snmp4j/PDU;
    .locals 1

    .line 1
    invoke-interface {p1}, Lorg/snmp4j/Target;->getVersion()I

    move-result p1

    const/4 v0, 0x3

    if-ne p1, v0, :cond_1

    .line 2
    new-instance p1, Lorg/snmp4j/ScopedPDU;

    invoke-direct {p1}, Lorg/snmp4j/ScopedPDU;-><init>()V

    .line 3
    iget-object v0, p0, Lorg/snmp4j/tools/console/SnmpRequest;->contextEngineID:Lorg/snmp4j/smi/OctetString;

    if-eqz v0, :cond_0

    .line 4
    invoke-virtual {p1, v0}, Lorg/snmp4j/ScopedPDU;->setContextEngineID(Lorg/snmp4j/smi/OctetString;)V

    .line 5
    :cond_0
    iget-object v0, p0, Lorg/snmp4j/tools/console/SnmpRequest;->contextName:Lorg/snmp4j/smi/OctetString;

    if-eqz v0, :cond_3

    .line 6
    invoke-virtual {p1, v0}, Lorg/snmp4j/ScopedPDU;->setContextName(Lorg/snmp4j/smi/OctetString;)V

    goto :goto_0

    .line 7
    :cond_1
    iget p1, p0, Lorg/snmp4j/tools/console/SnmpRequest;->pduType:I

    const/16 v0, -0x5c

    if-ne p1, v0, :cond_2

    .line 8
    iget-object p1, p0, Lorg/snmp4j/tools/console/SnmpRequest;->v1TrapPDU:Lorg/snmp4j/PDUv1;

    goto :goto_0

    .line 9
    :cond_2
    new-instance p1, Lorg/snmp4j/PDU;

    invoke-direct {p1}, Lorg/snmp4j/PDU;-><init>()V

    .line 10
    :cond_3
    :goto_0
    iget v0, p0, Lorg/snmp4j/tools/console/SnmpRequest;->pduType:I

    invoke-virtual {p1, v0}, Lorg/snmp4j/PDU;->setType(I)V

    return-object p1
.end method

.method public createPDU(Lorg/snmp4j/mp/MessageProcessingModel;)Lorg/snmp4j/PDU;
    .locals 0

    const/4 p1, 0x0

    .line 11
    invoke-virtual {p0, p1}, Lorg/snmp4j/tools/console/SnmpRequest;->createPDU(Lorg/snmp4j/Target;)Lorg/snmp4j/PDU;

    move-result-object p1

    return-object p1
.end method

.method public getAddress()Lorg/snmp4j/smi/Address;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/snmp4j/tools/console/SnmpRequest;->address:Lorg/snmp4j/smi/Address;

    return-object v0
.end method

.method public getAuthPassphrase()Lorg/snmp4j/smi/OctetString;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/tools/console/SnmpRequest;->authPassphrase:Lorg/snmp4j/smi/OctetString;

    return-object v0
.end method

.method public getAuthProtocol()Lorg/snmp4j/smi/OID;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/tools/console/SnmpRequest;->authProtocol:Lorg/snmp4j/smi/OID;

    return-object v0
.end method

.method public getAuthoritativeEngineID()Lorg/snmp4j/smi/OctetString;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/tools/console/SnmpRequest;->authoritativeEngineID:Lorg/snmp4j/smi/OctetString;

    return-object v0
.end method

.method public getCommunity()Lorg/snmp4j/smi/OctetString;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/tools/console/SnmpRequest;->community:Lorg/snmp4j/smi/OctetString;

    return-object v0
.end method

.method public getContextEngineID()Lorg/snmp4j/smi/OctetString;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/tools/console/SnmpRequest;->contextEngineID:Lorg/snmp4j/smi/OctetString;

    return-object v0
.end method

.method public getContextName()Lorg/snmp4j/smi/OctetString;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/tools/console/SnmpRequest;->contextName:Lorg/snmp4j/smi/OctetString;

    return-object v0
.end method

.method public getLowerBoundIndex()Lorg/snmp4j/smi/OID;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/tools/console/SnmpRequest;->lowerBoundIndex:Lorg/snmp4j/smi/OID;

    return-object v0
.end method

.method public getMaxRepetitions()I
    .locals 1

    iget v0, p0, Lorg/snmp4j/tools/console/SnmpRequest;->maxRepetitions:I

    return v0
.end method

.method public getNonRepeaters()I
    .locals 1

    iget v0, p0, Lorg/snmp4j/tools/console/SnmpRequest;->nonRepeaters:I

    return v0
.end method

.method public getNumDispatcherThreads()I
    .locals 1

    iget v0, p0, Lorg/snmp4j/tools/console/SnmpRequest;->numDispatcherThreads:I

    return v0
.end method

.method public getOperation()I
    .locals 1

    iget v0, p0, Lorg/snmp4j/tools/console/SnmpRequest;->operation:I

    return v0
.end method

.method public getPduType()I
    .locals 1

    iget v0, p0, Lorg/snmp4j/tools/console/SnmpRequest;->pduType:I

    return v0
.end method

.method public getPrivPassphrase()Lorg/snmp4j/smi/OctetString;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/tools/console/SnmpRequest;->privPassphrase:Lorg/snmp4j/smi/OctetString;

    return-object v0
.end method

.method public getPrivProtocol()Lorg/snmp4j/smi/OID;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/tools/console/SnmpRequest;->privProtocol:Lorg/snmp4j/smi/OID;

    return-object v0
.end method

.method public getRetries()I
    .locals 1

    iget v0, p0, Lorg/snmp4j/tools/console/SnmpRequest;->retries:I

    return v0
.end method

.method public getSecurityName()Lorg/snmp4j/smi/OctetString;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/tools/console/SnmpRequest;->securityName:Lorg/snmp4j/smi/OctetString;

    return-object v0
.end method

.method public getSysUpTime()Lorg/snmp4j/smi/TimeTicks;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/tools/console/SnmpRequest;->sysUpTime:Lorg/snmp4j/smi/TimeTicks;

    return-object v0
.end method

.method public getTarget()Lorg/snmp4j/Target;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/tools/console/SnmpRequest;->target:Lorg/snmp4j/Target;

    return-object v0
.end method

.method public getTimeout()I
    .locals 1

    iget v0, p0, Lorg/snmp4j/tools/console/SnmpRequest;->timeout:I

    return v0
.end method

.method public getTrapOID()Lorg/snmp4j/smi/OID;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/tools/console/SnmpRequest;->trapOID:Lorg/snmp4j/smi/OID;

    return-object v0
.end method

.method public getUpperBoundIndex()Lorg/snmp4j/smi/OID;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/tools/console/SnmpRequest;->upperBoundIndex:Lorg/snmp4j/smi/OID;

    return-object v0
.end method

.method public getVbs()Ljava/util/Vector;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Vector<",
            "+",
            "Lorg/snmp4j/smi/VariableBinding;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lorg/snmp4j/tools/console/SnmpRequest;->vbs:Ljava/util/Vector;

    return-object v0
.end method

.method public getVersion()I
    .locals 1

    iget v0, p0, Lorg/snmp4j/tools/console/SnmpRequest;->version:I

    return v0
.end method

.method public isUseDenseTableOperation()Z
    .locals 1

    iget-boolean v0, p0, Lorg/snmp4j/tools/console/SnmpRequest;->useDenseTableOperation:Z

    return v0
.end method

.method public declared-synchronized listen()V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lorg/snmp4j/tools/console/SnmpRequest;->address:Lorg/snmp4j/smi/Address;

    instance-of v0, v0, Lorg/snmp4j/smi/TcpAddress;

    if-eqz v0, :cond_0

    new-instance v0, Lorg/snmp4j/transport/DefaultTcpTransportMapping;

    iget-object v1, p0, Lorg/snmp4j/tools/console/SnmpRequest;->address:Lorg/snmp4j/smi/Address;

    check-cast v1, Lorg/snmp4j/smi/TcpAddress;

    invoke-direct {v0, v1}, Lorg/snmp4j/transport/DefaultTcpTransportMapping;-><init>(Lorg/snmp4j/smi/TcpAddress;)V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto/16 :goto_3

    :cond_0
    new-instance v0, Lorg/snmp4j/transport/DefaultUdpTransportMapping;

    iget-object v1, p0, Lorg/snmp4j/tools/console/SnmpRequest;->address:Lorg/snmp4j/smi/Address;

    check-cast v1, Lorg/snmp4j/smi/UdpAddress;

    invoke-direct {v0, v1}, Lorg/snmp4j/transport/DefaultUdpTransportMapping;-><init>(Lorg/snmp4j/smi/UdpAddress;)V

    :goto_0
    const-string v1, "DispatcherPool"

    iget v2, p0, Lorg/snmp4j/tools/console/SnmpRequest;->numDispatcherThreads:I

    invoke-static {v1, v2}, Lorg/snmp4j/util/ThreadPool;->create(Ljava/lang/String;I)Lorg/snmp4j/util/ThreadPool;

    move-result-object v1

    new-instance v2, Lorg/snmp4j/util/MultiThreadedMessageDispatcher;

    new-instance v3, Lorg/snmp4j/MessageDispatcherImpl;

    invoke-direct {v3}, Lorg/snmp4j/MessageDispatcherImpl;-><init>()V

    invoke-direct {v2, v1, v3}, Lorg/snmp4j/util/MultiThreadedMessageDispatcher;-><init>(Lorg/snmp4j/util/WorkerPool;Lorg/snmp4j/MessageDispatcher;)V

    new-instance v1, Lorg/snmp4j/mp/MPv1;

    invoke-direct {v1}, Lorg/snmp4j/mp/MPv1;-><init>()V

    invoke-interface {v2, v1}, Lorg/snmp4j/MessageDispatcher;->addMessageProcessingModel(Lorg/snmp4j/mp/MessageProcessingModel;)V

    new-instance v1, Lorg/snmp4j/mp/MPv2c;

    invoke-direct {v1}, Lorg/snmp4j/mp/MPv2c;-><init>()V

    invoke-interface {v2, v1}, Lorg/snmp4j/MessageDispatcher;->addMessageProcessingModel(Lorg/snmp4j/mp/MessageProcessingModel;)V

    new-instance v1, Lorg/snmp4j/mp/MPv3;

    iget-object v3, p0, Lorg/snmp4j/tools/console/SnmpRequest;->localEngineID:Lorg/snmp4j/smi/OctetString;

    invoke-virtual {v3}, Lorg/snmp4j/smi/OctetString;->getValue()[B

    move-result-object v3

    invoke-direct {v1, v3}, Lorg/snmp4j/mp/MPv3;-><init>([B)V

    invoke-interface {v2, v1}, Lorg/snmp4j/MessageDispatcher;->addMessageProcessingModel(Lorg/snmp4j/mp/MessageProcessingModel;)V

    invoke-static {}, Lorg/snmp4j/security/SecurityProtocols;->getInstance()Lorg/snmp4j/security/SecurityProtocols;

    move-result-object v1

    invoke-virtual {v1}, Lorg/snmp4j/security/SecurityProtocols;->addDefaultProtocols()Lorg/snmp4j/security/SecurityProtocols;

    invoke-static {}, Lorg/snmp4j/security/SecurityProtocols;->getInstance()Lorg/snmp4j/security/SecurityProtocols;

    move-result-object v1

    new-instance v3, Lorg/snmp4j/security/Priv3DES;

    invoke-direct {v3}, Lorg/snmp4j/security/Priv3DES;-><init>()V

    invoke-virtual {v1, v3}, Lorg/snmp4j/security/SecurityProtocols;->addPrivacyProtocol(Lorg/snmp4j/security/PrivacyProtocol;)V

    new-instance v1, Lorg/snmp4j/Snmp;

    invoke-direct {v1, v2, v0}, Lorg/snmp4j/Snmp;-><init>(Lorg/snmp4j/MessageDispatcher;Lorg/snmp4j/TransportMapping;)V

    iget v2, p0, Lorg/snmp4j/tools/console/SnmpRequest;->version:I

    const/4 v3, 0x3

    if-ne v2, v3, :cond_1

    new-instance v2, Lorg/snmp4j/security/USM;

    invoke-static {}, Lorg/snmp4j/security/SecurityProtocols;->getInstance()Lorg/snmp4j/security/SecurityProtocols;

    move-result-object v3

    iget-object v4, p0, Lorg/snmp4j/tools/console/SnmpRequest;->localEngineID:Lorg/snmp4j/smi/OctetString;

    const/4 v5, 0x0

    invoke-direct {v2, v3, v4, v5}, Lorg/snmp4j/security/USM;-><init>(Lorg/snmp4j/security/SecurityProtocols;Lorg/snmp4j/smi/OctetString;I)V

    invoke-static {}, Lorg/snmp4j/security/SecurityModels;->getInstance()Lorg/snmp4j/security/SecurityModels;

    move-result-object v3

    invoke-virtual {v3, v2}, Lorg/snmp4j/security/SecurityModels;->addSecurityModel(Lorg/snmp4j/security/SecurityModel;)Lorg/snmp4j/security/SecurityModels;

    invoke-direct {p0, v1}, Lorg/snmp4j/tools/console/SnmpRequest;->addUsmUser(Lorg/snmp4j/Snmp;)V

    goto :goto_1

    :cond_1
    new-instance v2, Lorg/snmp4j/CommunityTarget;

    invoke-direct {v2}, Lorg/snmp4j/CommunityTarget;-><init>()V

    iget-object v3, p0, Lorg/snmp4j/tools/console/SnmpRequest;->community:Lorg/snmp4j/smi/OctetString;

    invoke-virtual {v2, v3}, Lorg/snmp4j/CommunityTarget;->setCommunity(Lorg/snmp4j/smi/OctetString;)V

    iput-object v2, p0, Lorg/snmp4j/tools/console/SnmpRequest;->target:Lorg/snmp4j/Target;

    :goto_1
    invoke-virtual {v1, p0}, Lorg/snmp4j/Snmp;->addCommandResponder(Lorg/snmp4j/CommandResponder;)V

    invoke-virtual {v0}, Lorg/snmp4j/transport/AbstractTransportMapping;->listen()V

    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Listening on "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lorg/snmp4j/tools/console/SnmpRequest;->address:Lorg/snmp4j/smi/Address;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    invoke-virtual {p0}, Ljava/lang/Object;->wait()V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_2

    :catch_0
    :try_start_2
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :goto_2
    monitor-exit p0

    return-void

    :goto_3
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw v0
.end method

.method public declared-synchronized processPdu(Lorg/snmp4j/CommandResponderEvent;)V
    .locals 9

    monitor-enter p0

    :try_start_0
    invoke-virtual {p1}, Lorg/snmp4j/CommandResponderEvent;->getPDU()Lorg/snmp4j/PDU;

    move-result-object v5

    if-eqz v5, :cond_0

    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v5}, Lorg/snmp4j/PDU;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    invoke-virtual {v5}, Lorg/snmp4j/PDU;->getType()I

    move-result v0

    const/16 v1, -0x59

    if-eq v0, v1, :cond_0

    invoke-virtual {v5}, Lorg/snmp4j/PDU;->getType()I

    move-result v0

    const/16 v1, -0x5c

    if-eq v0, v1, :cond_0

    invoke-virtual {v5}, Lorg/snmp4j/PDU;->getType()I

    move-result v0

    const/16 v1, -0x58

    if-eq v0, v1, :cond_0

    invoke-virtual {v5}, Lorg/snmp4j/PDU;->getType()I

    move-result v0

    const/16 v1, -0x5e

    if-eq v0, v1, :cond_0

    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Lorg/snmp4j/PDU;->setErrorIndex(I)V

    invoke-virtual {v5, v0}, Lorg/snmp4j/PDU;->setErrorStatus(I)V

    invoke-virtual {v5, v1}, Lorg/snmp4j/PDU;->setType(I)V

    new-instance v8, Lorg/snmp4j/mp/StatusInformation;

    invoke-direct {v8}, Lorg/snmp4j/mp/StatusInformation;-><init>()V

    invoke-virtual {p1}, Lorg/snmp4j/CommandResponderEvent;->getStateReference()Lorg/snmp4j/mp/StateReference;

    move-result-object v7
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    invoke-virtual {p1}, Lorg/snmp4j/CommandResponderEvent;->getMessageDispatcher()Lorg/snmp4j/MessageDispatcher;

    move-result-object v0

    invoke-virtual {p1}, Lorg/snmp4j/CommandResponderEvent;->getMessageProcessingModel()I

    move-result v1

    invoke-virtual {p1}, Lorg/snmp4j/CommandResponderEvent;->getSecurityModel()I

    move-result v2

    invoke-virtual {p1}, Lorg/snmp4j/CommandResponderEvent;->getSecurityName()[B

    move-result-object v3

    invoke-virtual {p1}, Lorg/snmp4j/CommandResponderEvent;->getSecurityLevel()I

    move-result v4

    invoke-virtual {p1}, Lorg/snmp4j/CommandResponderEvent;->getMaxSizeResponsePDU()I

    move-result v6

    invoke-interface/range {v0 .. v8}, Lorg/snmp4j/MessageDispatcher;->returnResponsePdu(II[BILorg/snmp4j/PDU;ILorg/snmp4j/mp/StateReference;Lorg/snmp4j/mp/StatusInformation;)I
    :try_end_1
    .catch Lorg/snmp4j/MessageException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :catch_0
    move-exception p1

    :try_start_2
    sget-object v0, Ljava/lang/System;->err:Ljava/io/PrintStream;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Error while sending response: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    const-class v0, Lorg/snmp4j/tools/console/SnmpRequest;

    invoke-static {v0}, Lorg/snmp4j/log/LogFactory;->getLogger(Ljava/lang/Class;)Lorg/snmp4j/log/LogAdapter;

    move-result-object v0

    invoke-interface {v0, p1}, Lorg/snmp4j/log/LogAdapter;->error(Ljava/io/Serializable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :cond_0
    :goto_0
    monitor-exit p0

    return-void

    :goto_1
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw p1
.end method

.method public send()Lorg/snmp4j/PDU;
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-direct {p0}, Lorg/snmp4j/tools/console/SnmpRequest;->createSnmpSession()Lorg/snmp4j/Snmp;

    move-result-object v0

    invoke-direct {p0}, Lorg/snmp4j/tools/console/SnmpRequest;->createTarget()Lorg/snmp4j/Target;

    move-result-object v1

    iput-object v1, p0, Lorg/snmp4j/tools/console/SnmpRequest;->target:Lorg/snmp4j/Target;

    iget v2, p0, Lorg/snmp4j/tools/console/SnmpRequest;->version:I

    invoke-interface {v1, v2}, Lorg/snmp4j/Target;->setVersion(I)V

    iget-object v1, p0, Lorg/snmp4j/tools/console/SnmpRequest;->target:Lorg/snmp4j/Target;

    iget-object v2, p0, Lorg/snmp4j/tools/console/SnmpRequest;->address:Lorg/snmp4j/smi/Address;

    invoke-interface {v1, v2}, Lorg/snmp4j/Target;->setAddress(Lorg/snmp4j/smi/Address;)V

    iget-object v1, p0, Lorg/snmp4j/tools/console/SnmpRequest;->target:Lorg/snmp4j/Target;

    iget v2, p0, Lorg/snmp4j/tools/console/SnmpRequest;->retries:I

    invoke-interface {v1, v2}, Lorg/snmp4j/Target;->setRetries(I)V

    iget-object v1, p0, Lorg/snmp4j/tools/console/SnmpRequest;->target:Lorg/snmp4j/Target;

    iget v2, p0, Lorg/snmp4j/tools/console/SnmpRequest;->timeout:I

    int-to-long v2, v2

    invoke-interface {v1, v2, v3}, Lorg/snmp4j/Target;->setTimeout(J)V

    iget-object v1, p0, Lorg/snmp4j/tools/console/SnmpRequest;->target:Lorg/snmp4j/Target;

    iget v2, p0, Lorg/snmp4j/tools/console/SnmpRequest;->maxSizeResponsePDU:I

    invoke-interface {v1, v2}, Lorg/snmp4j/Target;->setMaxSizeRequestPDU(I)V

    invoke-virtual {v0}, Lorg/snmp4j/Snmp;->listen()V

    iget-object v1, p0, Lorg/snmp4j/tools/console/SnmpRequest;->target:Lorg/snmp4j/Target;

    invoke-virtual {p0, v1}, Lorg/snmp4j/tools/console/SnmpRequest;->createPDU(Lorg/snmp4j/Target;)Lorg/snmp4j/PDU;

    move-result-object v1

    invoke-virtual {v1}, Lorg/snmp4j/PDU;->getType()I

    move-result v2

    const/16 v3, -0x5b

    if-ne v2, v3, :cond_0

    iget v2, p0, Lorg/snmp4j/tools/console/SnmpRequest;->maxRepetitions:I

    invoke-virtual {v1, v2}, Lorg/snmp4j/PDU;->setMaxRepetitions(I)V

    iget v2, p0, Lorg/snmp4j/tools/console/SnmpRequest;->nonRepeaters:I

    invoke-virtual {v1, v2}, Lorg/snmp4j/PDU;->setNonRepeaters(I)V

    :cond_0
    iget-object v2, p0, Lorg/snmp4j/tools/console/SnmpRequest;->vbs:Ljava/util/Vector;

    invoke-virtual {v2}, Ljava/util/Vector;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lorg/snmp4j/smi/VariableBinding;

    invoke-virtual {v1, v3}, Lorg/snmp4j/PDU;->add(Lorg/snmp4j/smi/VariableBinding;)V

    goto :goto_0

    :cond_1
    iget v2, p0, Lorg/snmp4j/tools/console/SnmpRequest;->operation:I

    const/4 v3, 0x1

    const/4 v4, 0x6

    const/4 v5, 0x0

    if-eq v2, v3, :cond_4

    if-ne v2, v4, :cond_2

    goto :goto_1

    :cond_2
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v2

    iget-object v4, p0, Lorg/snmp4j/tools/console/SnmpRequest;->target:Lorg/snmp4j/Target;

    invoke-virtual {v0, v1, v4}, Lorg/snmp4j/Snmp;->send(Lorg/snmp4j/PDU;Lorg/snmp4j/Target;)Lorg/snmp4j/event/ResponseEvent;

    move-result-object v1

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Lorg/snmp4j/event/ResponseEvent;->getResponse()Lorg/snmp4j/PDU;

    move-result-object v5

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Received response after "

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v6

    sub-long/2addr v6, v2

    const-wide/32 v2, 0xf4240

    div-long/2addr v6, v2

    invoke-virtual {v4, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, " milliseconds"

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    :cond_3
    invoke-virtual {v0}, Lorg/snmp4j/Snmp;->close()V

    return-object v5

    :cond_4
    :goto_1
    if-ne v2, v4, :cond_5

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    goto :goto_2

    :cond_5
    move-object v2, v5

    :goto_2
    iget-object v3, p0, Lorg/snmp4j/tools/console/SnmpRequest;->target:Lorg/snmp4j/Target;

    invoke-direct {p0, v0, v1, v3, v2}, Lorg/snmp4j/tools/console/SnmpRequest;->walk(Lorg/snmp4j/Snmp;Lorg/snmp4j/PDU;Lorg/snmp4j/Target;Ljava/util/List;)Lorg/snmp4j/PDU;

    if-eqz v2, :cond_6

    invoke-direct {p0, v2}, Lorg/snmp4j/tools/console/SnmpRequest;->createSnapshot(Ljava/util/List;)V

    :cond_6
    return-object v5
.end method

.method public setAddress(Lorg/snmp4j/smi/Address;)V
    .locals 0

    iput-object p1, p0, Lorg/snmp4j/tools/console/SnmpRequest;->address:Lorg/snmp4j/smi/Address;

    return-void
.end method

.method public setAuthPassphrase(Lorg/snmp4j/smi/OctetString;)V
    .locals 0

    iput-object p1, p0, Lorg/snmp4j/tools/console/SnmpRequest;->authPassphrase:Lorg/snmp4j/smi/OctetString;

    return-void
.end method

.method public setAuthProtocol(Lorg/snmp4j/smi/OID;)V
    .locals 0

    iput-object p1, p0, Lorg/snmp4j/tools/console/SnmpRequest;->authProtocol:Lorg/snmp4j/smi/OID;

    return-void
.end method

.method public setAuthoritativeEngineID(Lorg/snmp4j/smi/OctetString;)V
    .locals 0

    iput-object p1, p0, Lorg/snmp4j/tools/console/SnmpRequest;->authoritativeEngineID:Lorg/snmp4j/smi/OctetString;

    return-void
.end method

.method public setCommunity(Lorg/snmp4j/smi/OctetString;)V
    .locals 0

    iput-object p1, p0, Lorg/snmp4j/tools/console/SnmpRequest;->community:Lorg/snmp4j/smi/OctetString;

    return-void
.end method

.method public setContextEngineID(Lorg/snmp4j/smi/OctetString;)V
    .locals 0

    iput-object p1, p0, Lorg/snmp4j/tools/console/SnmpRequest;->contextEngineID:Lorg/snmp4j/smi/OctetString;

    return-void
.end method

.method public setContextName(Lorg/snmp4j/smi/OctetString;)V
    .locals 0

    iput-object p1, p0, Lorg/snmp4j/tools/console/SnmpRequest;->contextName:Lorg/snmp4j/smi/OctetString;

    return-void
.end method

.method public setLowerBoundIndex(Lorg/snmp4j/smi/OID;)V
    .locals 0

    iput-object p1, p0, Lorg/snmp4j/tools/console/SnmpRequest;->lowerBoundIndex:Lorg/snmp4j/smi/OID;

    return-void
.end method

.method public setMaxRepetitions(I)V
    .locals 0

    iput p1, p0, Lorg/snmp4j/tools/console/SnmpRequest;->maxRepetitions:I

    return-void
.end method

.method public setNonRepeaters(I)V
    .locals 0

    iput p1, p0, Lorg/snmp4j/tools/console/SnmpRequest;->nonRepeaters:I

    return-void
.end method

.method public setNumDispatcherThreads(I)V
    .locals 0

    iput p1, p0, Lorg/snmp4j/tools/console/SnmpRequest;->numDispatcherThreads:I

    return-void
.end method

.method public setOperation(I)V
    .locals 0

    iput p1, p0, Lorg/snmp4j/tools/console/SnmpRequest;->operation:I

    return-void
.end method

.method public setPduType(I)V
    .locals 0

    iput p1, p0, Lorg/snmp4j/tools/console/SnmpRequest;->pduType:I

    return-void
.end method

.method public setPrivPassphrase(Lorg/snmp4j/smi/OctetString;)V
    .locals 0

    iput-object p1, p0, Lorg/snmp4j/tools/console/SnmpRequest;->privPassphrase:Lorg/snmp4j/smi/OctetString;

    return-void
.end method

.method public setPrivProtocol(Lorg/snmp4j/smi/OID;)V
    .locals 0

    iput-object p1, p0, Lorg/snmp4j/tools/console/SnmpRequest;->privProtocol:Lorg/snmp4j/smi/OID;

    return-void
.end method

.method public setRetries(I)V
    .locals 0

    iput p1, p0, Lorg/snmp4j/tools/console/SnmpRequest;->retries:I

    return-void
.end method

.method public setSecurityName(Lorg/snmp4j/smi/OctetString;)V
    .locals 0

    iput-object p1, p0, Lorg/snmp4j/tools/console/SnmpRequest;->securityName:Lorg/snmp4j/smi/OctetString;

    return-void
.end method

.method public setSysUpTime(Lorg/snmp4j/smi/TimeTicks;)V
    .locals 0

    iput-object p1, p0, Lorg/snmp4j/tools/console/SnmpRequest;->sysUpTime:Lorg/snmp4j/smi/TimeTicks;

    return-void
.end method

.method public setTarget(Lorg/snmp4j/Target;)V
    .locals 0

    iput-object p1, p0, Lorg/snmp4j/tools/console/SnmpRequest;->target:Lorg/snmp4j/Target;

    return-void
.end method

.method public setTimeout(I)V
    .locals 0

    iput p1, p0, Lorg/snmp4j/tools/console/SnmpRequest;->timeout:I

    return-void
.end method

.method public setTrapOID(Lorg/snmp4j/smi/OID;)V
    .locals 0

    iput-object p1, p0, Lorg/snmp4j/tools/console/SnmpRequest;->trapOID:Lorg/snmp4j/smi/OID;

    return-void
.end method

.method public setUpperBoundIndex(Lorg/snmp4j/smi/OID;)V
    .locals 0

    iput-object p1, p0, Lorg/snmp4j/tools/console/SnmpRequest;->upperBoundIndex:Lorg/snmp4j/smi/OID;

    return-void
.end method

.method public setUseDenseTableOperation(Z)V
    .locals 0

    iput-boolean p1, p0, Lorg/snmp4j/tools/console/SnmpRequest;->useDenseTableOperation:Z

    return-void
.end method

.method public setVbs(Ljava/util/Vector;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Vector<",
            "Lorg/snmp4j/smi/VariableBinding;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lorg/snmp4j/tools/console/SnmpRequest;->vbs:Ljava/util/Vector;

    return-void
.end method

.method public setVersion(I)V
    .locals 0

    iput p1, p0, Lorg/snmp4j/tools/console/SnmpRequest;->version:I

    return-void
.end method

.method public table()V
    .locals 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-direct {p0}, Lorg/snmp4j/tools/console/SnmpRequest;->createSnmpSession()Lorg/snmp4j/Snmp;

    move-result-object v0

    invoke-direct {p0}, Lorg/snmp4j/tools/console/SnmpRequest;->createTarget()Lorg/snmp4j/Target;

    move-result-object v1

    iput-object v1, p0, Lorg/snmp4j/tools/console/SnmpRequest;->target:Lorg/snmp4j/Target;

    iget v2, p0, Lorg/snmp4j/tools/console/SnmpRequest;->version:I

    invoke-interface {v1, v2}, Lorg/snmp4j/Target;->setVersion(I)V

    iget-object v1, p0, Lorg/snmp4j/tools/console/SnmpRequest;->target:Lorg/snmp4j/Target;

    iget-object v2, p0, Lorg/snmp4j/tools/console/SnmpRequest;->address:Lorg/snmp4j/smi/Address;

    invoke-interface {v1, v2}, Lorg/snmp4j/Target;->setAddress(Lorg/snmp4j/smi/Address;)V

    iget-object v1, p0, Lorg/snmp4j/tools/console/SnmpRequest;->target:Lorg/snmp4j/Target;

    iget v2, p0, Lorg/snmp4j/tools/console/SnmpRequest;->retries:I

    invoke-interface {v1, v2}, Lorg/snmp4j/Target;->setRetries(I)V

    iget-object v1, p0, Lorg/snmp4j/tools/console/SnmpRequest;->target:Lorg/snmp4j/Target;

    iget v2, p0, Lorg/snmp4j/tools/console/SnmpRequest;->timeout:I

    int-to-long v2, v2

    invoke-interface {v1, v2, v3}, Lorg/snmp4j/Target;->setTimeout(J)V

    invoke-virtual {v0}, Lorg/snmp4j/Snmp;->listen()V

    new-instance v4, Lorg/snmp4j/util/TableUtils;

    invoke-direct {v4, v0, p0}, Lorg/snmp4j/util/TableUtils;-><init>(Lorg/snmp4j/Session;Lorg/snmp4j/util/PDUFactory;)V

    iget v1, p0, Lorg/snmp4j/tools/console/SnmpRequest;->maxRepetitions:I

    invoke-virtual {v4, v1}, Lorg/snmp4j/util/TableUtils;->setMaxNumRowsPerPDU(I)V

    new-instance v1, Lorg/snmp4j/smi/Counter32;

    invoke-direct {v1}, Lorg/snmp4j/smi/Counter32;-><init>()V

    iget-object v2, p0, Lorg/snmp4j/tools/console/SnmpRequest;->vbs:Ljava/util/Vector;

    invoke-virtual {v2}, Ljava/util/Vector;->size()I

    move-result v2

    new-array v6, v2, [Lorg/snmp4j/smi/OID;

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_0

    iget-object v5, p0, Lorg/snmp4j/tools/console/SnmpRequest;->vbs:Ljava/util/Vector;

    invoke-virtual {v5, v3}, Ljava/util/Vector;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lorg/snmp4j/smi/VariableBinding;

    invoke-virtual {v5}, Lorg/snmp4j/smi/VariableBinding;->getOid()Lorg/snmp4j/smi/OID;

    move-result-object v5

    aput-object v5, v6, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v2

    monitor-enter v1

    :try_start_0
    iget v5, p0, Lorg/snmp4j/tools/console/SnmpRequest;->operation:I

    const/4 v7, 0x3

    if-ne v5, v7, :cond_1

    new-instance v5, Lorg/snmp4j/tools/console/SnmpRequest$TextTableListener;

    invoke-direct {v5, p0}, Lorg/snmp4j/tools/console/SnmpRequest$TextTableListener;-><init>(Lorg/snmp4j/tools/console/SnmpRequest;)V

    :goto_1
    move-object v7, v5

    goto :goto_2

    :catchall_0
    move-exception v0

    goto :goto_5

    :cond_1
    new-instance v5, Lorg/snmp4j/tools/console/SnmpRequest$CVSTableListener;

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v7

    invoke-direct {v5, p0, v7, v8}, Lorg/snmp4j/tools/console/SnmpRequest$CVSTableListener;-><init>(Lorg/snmp4j/tools/console/SnmpRequest;J)V

    goto :goto_1

    :goto_2
    iget-boolean v5, p0, Lorg/snmp4j/tools/console/SnmpRequest;->useDenseTableOperation:Z

    if-eqz v5, :cond_2

    iget-object v5, p0, Lorg/snmp4j/tools/console/SnmpRequest;->target:Lorg/snmp4j/Target;

    iget-object v9, p0, Lorg/snmp4j/tools/console/SnmpRequest;->lowerBoundIndex:Lorg/snmp4j/smi/OID;

    iget-object v10, p0, Lorg/snmp4j/tools/console/SnmpRequest;->upperBoundIndex:Lorg/snmp4j/smi/OID;

    move-object v8, v1

    invoke-virtual/range {v4 .. v10}, Lorg/snmp4j/util/TableUtils;->getDenseTable(Lorg/snmp4j/Target;[Lorg/snmp4j/smi/OID;Lorg/snmp4j/util/TableListener;Ljava/lang/Object;Lorg/snmp4j/smi/OID;Lorg/snmp4j/smi/OID;)V

    goto :goto_3

    :cond_2
    iget-object v5, p0, Lorg/snmp4j/tools/console/SnmpRequest;->target:Lorg/snmp4j/Target;

    iget-object v9, p0, Lorg/snmp4j/tools/console/SnmpRequest;->lowerBoundIndex:Lorg/snmp4j/smi/OID;

    iget-object v10, p0, Lorg/snmp4j/tools/console/SnmpRequest;->upperBoundIndex:Lorg/snmp4j/smi/OID;

    move-object v8, v1

    invoke-virtual/range {v4 .. v10}, Lorg/snmp4j/util/TableUtils;->getTable(Lorg/snmp4j/Target;[Lorg/snmp4j/smi/OID;Lorg/snmp4j/util/TableListener;Ljava/lang/Object;Lorg/snmp4j/smi/OID;Lorg/snmp4j/smi/OID;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_3
    :try_start_1
    iget v4, p0, Lorg/snmp4j/tools/console/SnmpRequest;->timeout:I

    int-to-long v4, v4

    invoke-virtual {v1, v4, v5}, Ljava/lang/Object;->wait(J)V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_4

    :catch_0
    :try_start_2
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Thread;->interrupt()V

    :goto_4
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Table received in "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v5

    sub-long/2addr v5, v2

    const-wide/32 v2, 0xf4240

    div-long/2addr v5, v2

    invoke-virtual {v4, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, " milliseconds."

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    invoke-virtual {v0}, Lorg/snmp4j/Snmp;->close()V

    return-void

    :goto_5
    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw v0
.end method
