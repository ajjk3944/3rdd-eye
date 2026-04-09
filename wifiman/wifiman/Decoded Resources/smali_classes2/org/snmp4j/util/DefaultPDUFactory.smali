.class public Lorg/snmp4j/util/DefaultPDUFactory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/snmp4j/util/PDUFactory;


# static fields
.field public static final GETBULK_DEFAULT_MAX_REPETITIONS:I = 0x5

.field public static final GETBULK_DEFAULT_NON_REPEATERS:I


# instance fields
.field private contextEngineID:Lorg/snmp4j/smi/OctetString;

.field private contextName:Lorg/snmp4j/smi/OctetString;

.field private maxRepetitions:I

.field private nonRepeaters:I

.field private pduType:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, -0x60

    .line 2
    iput v0, p0, Lorg/snmp4j/util/DefaultPDUFactory;->pduType:I

    const/4 v0, 0x5

    .line 3
    iput v0, p0, Lorg/snmp4j/util/DefaultPDUFactory;->maxRepetitions:I

    const/4 v0, 0x0

    .line 4
    iput v0, p0, Lorg/snmp4j/util/DefaultPDUFactory;->nonRepeaters:I

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, -0x60

    .line 6
    iput v0, p0, Lorg/snmp4j/util/DefaultPDUFactory;->pduType:I

    const/4 v0, 0x5

    .line 7
    iput v0, p0, Lorg/snmp4j/util/DefaultPDUFactory;->maxRepetitions:I

    const/4 v0, 0x0

    .line 8
    iput v0, p0, Lorg/snmp4j/util/DefaultPDUFactory;->nonRepeaters:I

    .line 9
    invoke-virtual {p0, p1}, Lorg/snmp4j/util/DefaultPDUFactory;->setPduType(I)V

    .line 10
    new-instance p1, Lorg/snmp4j/smi/OctetString;

    invoke-direct {p1}, Lorg/snmp4j/smi/OctetString;-><init>()V

    iput-object p1, p0, Lorg/snmp4j/util/DefaultPDUFactory;->contextEngineID:Lorg/snmp4j/smi/OctetString;

    .line 11
    new-instance p1, Lorg/snmp4j/smi/OctetString;

    invoke-direct {p1}, Lorg/snmp4j/smi/OctetString;-><init>()V

    iput-object p1, p0, Lorg/snmp4j/util/DefaultPDUFactory;->contextName:Lorg/snmp4j/smi/OctetString;

    return-void
.end method

.method public constructor <init>(ILorg/snmp4j/smi/OctetString;Lorg/snmp4j/smi/OctetString;)V
    .locals 0

    .line 12
    invoke-direct {p0, p1}, Lorg/snmp4j/util/DefaultPDUFactory;-><init>(I)V

    .line 13
    iput-object p2, p0, Lorg/snmp4j/util/DefaultPDUFactory;->contextEngineID:Lorg/snmp4j/smi/OctetString;

    .line 14
    iput-object p3, p0, Lorg/snmp4j/util/DefaultPDUFactory;->contextName:Lorg/snmp4j/smi/OctetString;

    return-void
.end method

.method public static createPDU(I)Lorg/snmp4j/PDU;
    .locals 1

    if-eqz p0, :cond_1

    const/4 v0, 0x3

    if-eq p0, v0, :cond_0

    .line 8
    new-instance p0, Lorg/snmp4j/PDU;

    invoke-direct {p0}, Lorg/snmp4j/PDU;-><init>()V

    goto :goto_0

    .line 9
    :cond_0
    new-instance p0, Lorg/snmp4j/ScopedPDU;

    invoke-direct {p0}, Lorg/snmp4j/ScopedPDU;-><init>()V

    goto :goto_0

    .line 10
    :cond_1
    new-instance p0, Lorg/snmp4j/PDUv1;

    invoke-direct {p0}, Lorg/snmp4j/PDUv1;-><init>()V

    :goto_0
    return-object p0
.end method

.method public static createPDU(Lorg/snmp4j/Target;I)Lorg/snmp4j/PDU;
    .locals 2

    const/4 v0, 0x5

    const/4 v1, 0x0

    .line 3
    invoke-static {p0, p1, v0, v1}, Lorg/snmp4j/util/DefaultPDUFactory;->createPDU(Lorg/snmp4j/Target;III)Lorg/snmp4j/PDU;

    move-result-object p0

    return-object p0
.end method

.method public static createPDU(Lorg/snmp4j/Target;III)Lorg/snmp4j/PDU;
    .locals 1

    .line 4
    invoke-interface {p0}, Lorg/snmp4j/Target;->getVersion()I

    move-result p0

    invoke-static {p0}, Lorg/snmp4j/util/DefaultPDUFactory;->createPDU(I)Lorg/snmp4j/PDU;

    move-result-object p0

    .line 5
    invoke-virtual {p0, p1}, Lorg/snmp4j/PDU;->setType(I)V

    const/16 v0, -0x5b

    if-ne p1, v0, :cond_0

    .line 6
    invoke-virtual {p0, p2}, Lorg/snmp4j/PDU;->setMaxRepetitions(I)V

    .line 7
    invoke-virtual {p0, p3}, Lorg/snmp4j/PDU;->setNonRepeaters(I)V

    :cond_0
    return-object p0
.end method

.method public static createPDU(Lorg/snmp4j/mp/MessageProcessingModel;I)Lorg/snmp4j/PDU;
    .locals 0

    .line 13
    invoke-static {p0}, Lorg/snmp4j/util/DefaultPDUFactory;->createPduByMP(Lorg/snmp4j/mp/MessageProcessingModel;)Lorg/snmp4j/PDU;

    move-result-object p0

    .line 14
    invoke-virtual {p0, p1}, Lorg/snmp4j/PDU;->setType(I)V

    return-object p0
.end method

.method private static createPduByMP(Lorg/snmp4j/mp/MessageProcessingModel;)Lorg/snmp4j/PDU;
    .locals 1

    invoke-interface {p0}, Lorg/snmp4j/mp/MessageProcessingModel;->getID()I

    move-result p0

    if-eqz p0, :cond_1

    const/4 v0, 0x3

    if-eq p0, v0, :cond_0

    new-instance p0, Lorg/snmp4j/PDU;

    invoke-direct {p0}, Lorg/snmp4j/PDU;-><init>()V

    goto :goto_0

    :cond_0
    new-instance p0, Lorg/snmp4j/ScopedPDU;

    invoke-direct {p0}, Lorg/snmp4j/ScopedPDU;-><init>()V

    goto :goto_0

    :cond_1
    new-instance p0, Lorg/snmp4j/PDUv1;

    invoke-direct {p0}, Lorg/snmp4j/PDUv1;-><init>()V

    :goto_0
    return-object p0
.end method


# virtual methods
.method protected applyContextInfoToScopedPDU(Lorg/snmp4j/PDU;)V
    .locals 1

    instance-of v0, p1, Lorg/snmp4j/ScopedPDU;

    if-eqz v0, :cond_0

    check-cast p1, Lorg/snmp4j/ScopedPDU;

    iget-object v0, p0, Lorg/snmp4j/util/DefaultPDUFactory;->contextEngineID:Lorg/snmp4j/smi/OctetString;

    invoke-virtual {p1, v0}, Lorg/snmp4j/ScopedPDU;->setContextEngineID(Lorg/snmp4j/smi/OctetString;)V

    iget-object v0, p0, Lorg/snmp4j/util/DefaultPDUFactory;->contextName:Lorg/snmp4j/smi/OctetString;

    invoke-virtual {p1, v0}, Lorg/snmp4j/ScopedPDU;->setContextName(Lorg/snmp4j/smi/OctetString;)V

    :cond_0
    return-void
.end method

.method public createPDU(Lorg/snmp4j/Target;)Lorg/snmp4j/PDU;
    .locals 1

    .line 1
    iget v0, p0, Lorg/snmp4j/util/DefaultPDUFactory;->pduType:I

    invoke-static {p1, v0}, Lorg/snmp4j/util/DefaultPDUFactory;->createPDU(Lorg/snmp4j/Target;I)Lorg/snmp4j/PDU;

    move-result-object p1

    .line 2
    invoke-virtual {p0, p1}, Lorg/snmp4j/util/DefaultPDUFactory;->applyContextInfoToScopedPDU(Lorg/snmp4j/PDU;)V

    return-object p1
.end method

.method public createPDU(Lorg/snmp4j/mp/MessageProcessingModel;)Lorg/snmp4j/PDU;
    .locals 0

    .line 11
    invoke-static {p1}, Lorg/snmp4j/util/DefaultPDUFactory;->createPduByMP(Lorg/snmp4j/mp/MessageProcessingModel;)Lorg/snmp4j/PDU;

    move-result-object p1

    .line 12
    invoke-virtual {p0, p1}, Lorg/snmp4j/util/DefaultPDUFactory;->applyContextInfoToScopedPDU(Lorg/snmp4j/PDU;)V

    return-object p1
.end method

.method public getContextEngineID()Lorg/snmp4j/smi/OctetString;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/util/DefaultPDUFactory;->contextEngineID:Lorg/snmp4j/smi/OctetString;

    return-object v0
.end method

.method public getContextName()Lorg/snmp4j/smi/OctetString;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/util/DefaultPDUFactory;->contextName:Lorg/snmp4j/smi/OctetString;

    return-object v0
.end method

.method public getMaxRepetitions()I
    .locals 1

    iget v0, p0, Lorg/snmp4j/util/DefaultPDUFactory;->maxRepetitions:I

    return v0
.end method

.method public getNonRepeaters()I
    .locals 1

    iget v0, p0, Lorg/snmp4j/util/DefaultPDUFactory;->nonRepeaters:I

    return v0
.end method

.method public getPduType()I
    .locals 1

    iget v0, p0, Lorg/snmp4j/util/DefaultPDUFactory;->pduType:I

    return v0
.end method

.method public setContextEngineID(Lorg/snmp4j/smi/OctetString;)V
    .locals 0

    iput-object p1, p0, Lorg/snmp4j/util/DefaultPDUFactory;->contextEngineID:Lorg/snmp4j/smi/OctetString;

    return-void
.end method

.method public setContextName(Lorg/snmp4j/smi/OctetString;)V
    .locals 0

    iput-object p1, p0, Lorg/snmp4j/util/DefaultPDUFactory;->contextName:Lorg/snmp4j/smi/OctetString;

    return-void
.end method

.method public setMaxRepetitions(I)V
    .locals 0

    iput p1, p0, Lorg/snmp4j/util/DefaultPDUFactory;->maxRepetitions:I

    return-void
.end method

.method public setNonRepeaters(I)V
    .locals 0

    iput p1, p0, Lorg/snmp4j/util/DefaultPDUFactory;->nonRepeaters:I

    return-void
.end method

.method public setPduType(I)V
    .locals 0

    iput p1, p0, Lorg/snmp4j/util/DefaultPDUFactory;->pduType:I

    return-void
.end method
