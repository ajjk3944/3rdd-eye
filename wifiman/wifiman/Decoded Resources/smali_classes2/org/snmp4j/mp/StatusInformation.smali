.class public Lorg/snmp4j/mp/StatusInformation;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field private static final serialVersionUID:J = 0x7da4269c363a17b7L


# instance fields
.field private contextEngineID:[B

.field private contextName:[B

.field private errorIndication:Lorg/snmp4j/smi/VariableBinding;

.field private securityLevel:Lorg/snmp4j/smi/Integer32;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lorg/snmp4j/smi/VariableBinding;[B[BLorg/snmp4j/smi/Integer32;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lorg/snmp4j/mp/StatusInformation;->errorIndication:Lorg/snmp4j/smi/VariableBinding;

    .line 4
    iput-object p2, p0, Lorg/snmp4j/mp/StatusInformation;->contextName:[B

    .line 5
    iput-object p3, p0, Lorg/snmp4j/mp/StatusInformation;->contextEngineID:[B

    .line 6
    iput-object p4, p0, Lorg/snmp4j/mp/StatusInformation;->securityLevel:Lorg/snmp4j/smi/Integer32;

    return-void
.end method


# virtual methods
.method public getContextEngineID()[B
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/mp/StatusInformation;->contextEngineID:[B

    return-object v0
.end method

.method public getContextName()[B
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/mp/StatusInformation;->contextName:[B

    return-object v0
.end method

.method public getErrorIndication()Lorg/snmp4j/smi/VariableBinding;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/mp/StatusInformation;->errorIndication:Lorg/snmp4j/smi/VariableBinding;

    return-object v0
.end method

.method public getSecurityLevel()Lorg/snmp4j/smi/Integer32;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/mp/StatusInformation;->securityLevel:Lorg/snmp4j/smi/Integer32;

    return-object v0
.end method

.method public setContextEngineID([B)V
    .locals 0

    iput-object p1, p0, Lorg/snmp4j/mp/StatusInformation;->contextEngineID:[B

    return-void
.end method

.method public setContextName([B)V
    .locals 0

    iput-object p1, p0, Lorg/snmp4j/mp/StatusInformation;->contextName:[B

    return-void
.end method

.method public setErrorIndication(Lorg/snmp4j/smi/VariableBinding;)V
    .locals 0

    iput-object p1, p0, Lorg/snmp4j/mp/StatusInformation;->errorIndication:Lorg/snmp4j/smi/VariableBinding;

    return-void
.end method

.method public setSecurityLevel(Lorg/snmp4j/smi/Integer32;)V
    .locals 0

    iput-object p1, p0, Lorg/snmp4j/mp/StatusInformation;->securityLevel:Lorg/snmp4j/smi/Integer32;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/mp/StatusInformation;->errorIndication:Lorg/snmp4j/smi/VariableBinding;

    if-nez v0, :cond_0

    const-string v0, "noError"

    return-object v0

    :cond_0
    invoke-virtual {v0}, Lorg/snmp4j/smi/VariableBinding;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
