.class public Lorg/snmp4j/security/TsmSecurityParameters;
.super Lorg/snmp4j/smi/OctetString;
.source "SourceFile"

# interfaces
.implements Lorg/snmp4j/security/SecurityParameters;


# instance fields
.field private decodedLength:I

.field private securityParametersPosition:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lorg/snmp4j/smi/OctetString;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lorg/snmp4j/security/TsmSecurityParameters;->decodedLength:I

    return-void
.end method


# virtual methods
.method public decodeBER(Lorg/snmp4j/asn1/BERInputStream;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-virtual {p1}, Lorg/snmp4j/asn1/BERInputStream;->getPosition()J

    move-result-wide v0

    invoke-super {p0, p1}, Lorg/snmp4j/smi/OctetString;->decodeBER(Lorg/snmp4j/asn1/BERInputStream;)V

    invoke-virtual {p1}, Lorg/snmp4j/asn1/BERInputStream;->getPosition()J

    move-result-wide v2

    sub-long/2addr v2, v0

    long-to-int p1, v2

    iput p1, p0, Lorg/snmp4j/security/TsmSecurityParameters;->decodedLength:I

    return-void
.end method

.method public getBERMaxLength(I)I
    .locals 0

    invoke-virtual {p0}, Lorg/snmp4j/smi/OctetString;->getBERLength()I

    move-result p1

    return p1
.end method

.method public getScopedPduPosition()I
    .locals 2

    iget v0, p0, Lorg/snmp4j/security/TsmSecurityParameters;->decodedLength:I

    if-ltz v0, :cond_0

    invoke-virtual {p0}, Lorg/snmp4j/security/TsmSecurityParameters;->getSecurityParametersPosition()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    return v0

    :cond_0
    invoke-virtual {p0}, Lorg/snmp4j/security/TsmSecurityParameters;->getSecurityParametersPosition()I

    move-result v0

    invoke-virtual {p0}, Lorg/snmp4j/smi/OctetString;->getBERLength()I

    move-result v1

    goto :goto_0
.end method

.method public getSecurityParametersPosition()I
    .locals 1

    iget v0, p0, Lorg/snmp4j/security/TsmSecurityParameters;->securityParametersPosition:I

    return v0
.end method

.method public setSecurityParametersPosition(I)V
    .locals 0

    iput p1, p0, Lorg/snmp4j/security/TsmSecurityParameters;->securityParametersPosition:I

    return-void
.end method
