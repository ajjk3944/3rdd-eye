.class public Lorg/snmp4j/transport/DefaultSshTransportMapping$SessionID;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/snmp4j/transport/DefaultSshTransportMapping;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4
    name = "SessionID"
.end annotation


# instance fields
.field private address:Lorg/snmp4j/smi/SshAddress;

.field final synthetic this$0:Lorg/snmp4j/transport/DefaultSshTransportMapping;

.field private tmSecurityName:Lorg/snmp4j/smi/OctetString;


# direct methods
.method public constructor <init>(Lorg/snmp4j/transport/DefaultSshTransportMapping;Lorg/snmp4j/smi/OctetString;Lorg/snmp4j/smi/SshAddress;)V
    .locals 0

    iput-object p1, p0, Lorg/snmp4j/transport/DefaultSshTransportMapping$SessionID;->this$0:Lorg/snmp4j/transport/DefaultSshTransportMapping;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lorg/snmp4j/transport/DefaultSshTransportMapping$SessionID;->tmSecurityName:Lorg/snmp4j/smi/OctetString;

    iput-object p3, p0, Lorg/snmp4j/transport/DefaultSshTransportMapping$SessionID;->address:Lorg/snmp4j/smi/SshAddress;

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_7

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_3

    :cond_1
    check-cast p1, Lorg/snmp4j/transport/DefaultSshTransportMapping$SessionID;

    iget-object v2, p0, Lorg/snmp4j/transport/DefaultSshTransportMapping$SessionID;->address:Lorg/snmp4j/smi/SshAddress;

    if-eqz v2, :cond_2

    iget-object v3, p1, Lorg/snmp4j/transport/DefaultSshTransportMapping$SessionID;->address:Lorg/snmp4j/smi/SshAddress;

    invoke-virtual {v2, v3}, Lorg/snmp4j/smi/SshAddress;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    goto :goto_0

    :cond_2
    iget-object v2, p1, Lorg/snmp4j/transport/DefaultSshTransportMapping$SessionID;->address:Lorg/snmp4j/smi/SshAddress;

    if-eqz v2, :cond_3

    :goto_0
    return v1

    :cond_3
    iget-object v2, p0, Lorg/snmp4j/transport/DefaultSshTransportMapping$SessionID;->tmSecurityName:Lorg/snmp4j/smi/OctetString;

    if-eqz v2, :cond_4

    iget-object p1, p1, Lorg/snmp4j/transport/DefaultSshTransportMapping$SessionID;->tmSecurityName:Lorg/snmp4j/smi/OctetString;

    invoke-virtual {v2, p1}, Lorg/snmp4j/smi/OctetString;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    goto :goto_1

    :cond_4
    iget-object p1, p1, Lorg/snmp4j/transport/DefaultSshTransportMapping$SessionID;->tmSecurityName:Lorg/snmp4j/smi/OctetString;

    if-nez p1, :cond_5

    goto :goto_2

    :cond_5
    :goto_1
    move v0, v1

    :cond_6
    :goto_2
    return v0

    :cond_7
    :goto_3
    return v1
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lorg/snmp4j/transport/DefaultSshTransportMapping$SessionID;->tmSecurityName:Lorg/snmp4j/smi/OctetString;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lorg/snmp4j/smi/OctetString;->hashCode()I

    move-result v0

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lorg/snmp4j/transport/DefaultSshTransportMapping$SessionID;->address:Lorg/snmp4j/smi/SshAddress;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Lorg/snmp4j/smi/SshAddress;->hashCode()I

    move-result v1

    :cond_1
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "DefaultSshTransportMapping.SessionID[tmSecurityName="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lorg/snmp4j/transport/DefaultSshTransportMapping$SessionID;->tmSecurityName:Lorg/snmp4j/smi/OctetString;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", address="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lorg/snmp4j/transport/DefaultSshTransportMapping$SessionID;->address:Lorg/snmp4j/smi/SshAddress;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x5d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
