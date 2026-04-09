.class public Lorg/snmp4j/security/TsmSecurityStateReference;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/snmp4j/security/SecurityStateReference;


# instance fields
.field private tmStateReference:Lorg/snmp4j/TransportStateReference;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getTmStateReference()Lorg/snmp4j/TransportStateReference;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/security/TsmSecurityStateReference;->tmStateReference:Lorg/snmp4j/TransportStateReference;

    return-object v0
.end method

.method public setTmStateReference(Lorg/snmp4j/TransportStateReference;)V
    .locals 0

    iput-object p1, p0, Lorg/snmp4j/security/TsmSecurityStateReference;->tmStateReference:Lorg/snmp4j/TransportStateReference;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "TsmSecurityStateReference[tmStateReference="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lorg/snmp4j/security/TsmSecurityStateReference;->tmStateReference:Lorg/snmp4j/TransportStateReference;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x5d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
