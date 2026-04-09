.class public Lorg/snmp4j/smi/VariableBinding;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;
.implements Lorg/snmp4j/asn1/BERSerializable;
.implements Ljava/lang/Cloneable;


# static fields
.field private static final serialVersionUID:J = 0xe54ec3a5fa3ca01L


# instance fields
.field private oid:Lorg/snmp4j/smi/OID;

.field private variable:Lorg/snmp4j/smi/Variable;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Lorg/snmp4j/smi/OID;

    invoke-direct {v0}, Lorg/snmp4j/smi/OID;-><init>()V

    iput-object v0, p0, Lorg/snmp4j/smi/VariableBinding;->oid:Lorg/snmp4j/smi/OID;

    .line 3
    sget-object v0, Lorg/snmp4j/smi/Null;->instance:Lorg/snmp4j/smi/Null;

    iput-object v0, p0, Lorg/snmp4j/smi/VariableBinding;->variable:Lorg/snmp4j/smi/Variable;

    return-void
.end method

.method public constructor <init>(Lorg/snmp4j/smi/OID;)V
    .locals 0

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    invoke-virtual {p0, p1}, Lorg/snmp4j/smi/VariableBinding;->setOid(Lorg/snmp4j/smi/OID;)V

    .line 6
    sget-object p1, Lorg/snmp4j/smi/Null;->instance:Lorg/snmp4j/smi/Null;

    iput-object p1, p0, Lorg/snmp4j/smi/VariableBinding;->variable:Lorg/snmp4j/smi/Variable;

    return-void
.end method

.method public constructor <init>(Lorg/snmp4j/smi/OID;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/text/ParseException;
        }
    .end annotation

    .line 10
    invoke-static {}, Lorg/snmp4j/SNMP4JSettings;->getVariableTextFormat()Lorg/snmp4j/util/VariableTextFormat;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lorg/snmp4j/util/VariableTextFormat;->parse(Lorg/snmp4j/smi/OID;Ljava/lang/String;)Lorg/snmp4j/smi/Variable;

    move-result-object p2

    invoke-direct {p0, p1, p2}, Lorg/snmp4j/smi/VariableBinding;-><init>(Lorg/snmp4j/smi/OID;Lorg/snmp4j/smi/Variable;)V

    return-void
.end method

.method public constructor <init>(Lorg/snmp4j/smi/OID;Lorg/snmp4j/smi/Variable;)V
    .locals 0

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    invoke-virtual {p0, p1}, Lorg/snmp4j/smi/VariableBinding;->setOid(Lorg/snmp4j/smi/OID;)V

    .line 9
    invoke-virtual {p0, p2}, Lorg/snmp4j/smi/VariableBinding;->setVariable(Lorg/snmp4j/smi/Variable;)V

    return-void
.end method

.method public static createFromOIDs([Lorg/snmp4j/smi/OID;)[Lorg/snmp4j/smi/VariableBinding;
    .locals 4

    array-length v0, p0

    new-array v0, v0, [Lorg/snmp4j/smi/VariableBinding;

    const/4 v1, 0x0

    :goto_0
    array-length v2, p0

    if-ge v1, v2, :cond_0

    new-instance v2, Lorg/snmp4j/smi/VariableBinding;

    aget-object v3, p0, v1

    invoke-direct {v2, v3}, Lorg/snmp4j/smi/VariableBinding;-><init>(Lorg/snmp4j/smi/OID;)V

    aput-object v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method


# virtual methods
.method public clone()Ljava/lang/Object;
    .locals 3

    new-instance v0, Lorg/snmp4j/smi/VariableBinding;

    iget-object v1, p0, Lorg/snmp4j/smi/VariableBinding;->oid:Lorg/snmp4j/smi/OID;

    iget-object v2, p0, Lorg/snmp4j/smi/VariableBinding;->variable:Lorg/snmp4j/smi/Variable;

    invoke-direct {v0, v1, v2}, Lorg/snmp4j/smi/VariableBinding;-><init>(Lorg/snmp4j/smi/OID;Lorg/snmp4j/smi/Variable;)V

    return-object v0
.end method

.method public final decodeBER(Lorg/snmp4j/asn1/BERInputStream;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    new-instance v0, Lorg/snmp4j/asn1/BER$MutableByte;

    invoke-direct {v0}, Lorg/snmp4j/asn1/BER$MutableByte;-><init>()V

    invoke-static {p1, v0}, Lorg/snmp4j/asn1/BER;->decodeHeader(Lorg/snmp4j/asn1/BERInputStream;Lorg/snmp4j/asn1/BER$MutableByte;)I

    move-result v1

    invoke-virtual {p1}, Lorg/snmp4j/asn1/BERInputStream;->getPosition()J

    move-result-wide v2

    invoke-virtual {v0}, Lorg/snmp4j/asn1/BER$MutableByte;->getValue()B

    move-result v4

    const/16 v5, 0x30

    if-ne v4, v5, :cond_1

    iget-object v0, p0, Lorg/snmp4j/smi/VariableBinding;->oid:Lorg/snmp4j/smi/OID;

    invoke-virtual {v0, p1}, Lorg/snmp4j/smi/OID;->decodeBER(Lorg/snmp4j/asn1/BERInputStream;)V

    invoke-static {p1}, Lorg/snmp4j/smi/AbstractVariable;->createFromBER(Lorg/snmp4j/asn1/BERInputStream;)Lorg/snmp4j/smi/Variable;

    move-result-object v0

    iput-object v0, p0, Lorg/snmp4j/smi/VariableBinding;->variable:Lorg/snmp4j/smi/Variable;

    invoke-static {}, Lorg/snmp4j/asn1/BER;->isCheckSequenceLength()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lorg/snmp4j/asn1/BERInputStream;->getPosition()J

    move-result-wide v4

    sub-long/2addr v4, v2

    long-to-int p1, v4

    invoke-static {v1, p1, p0}, Lorg/snmp4j/asn1/BER;->checkSequenceLength(IILorg/snmp4j/asn1/BERSerializable;)V

    :cond_0
    return-void

    :cond_1
    new-instance p1, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Invalid sequence encoding: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lorg/snmp4j/asn1/BER$MutableByte;->getValue()B

    move-result v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final encodeBER(Ljava/io/OutputStream;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-virtual {p0}, Lorg/snmp4j/smi/VariableBinding;->getBERPayloadLength()I

    move-result v0

    const/16 v1, 0x30

    invoke-static {p1, v1, v0}, Lorg/snmp4j/asn1/BER;->encodeHeader(Ljava/io/OutputStream;II)V

    iget-object v0, p0, Lorg/snmp4j/smi/VariableBinding;->oid:Lorg/snmp4j/smi/OID;

    invoke-virtual {v0, p1}, Lorg/snmp4j/smi/OID;->encodeBER(Ljava/io/OutputStream;)V

    iget-object v0, p0, Lorg/snmp4j/smi/VariableBinding;->variable:Lorg/snmp4j/smi/Variable;

    invoke-interface {v0, p1}, Lorg/snmp4j/asn1/BERSerializable;->encodeBER(Ljava/io/OutputStream;)V

    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Lorg/snmp4j/smi/VariableBinding;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, Lorg/snmp4j/smi/VariableBinding;

    iget-object v0, p0, Lorg/snmp4j/smi/VariableBinding;->oid:Lorg/snmp4j/smi/OID;

    invoke-virtual {p1}, Lorg/snmp4j/smi/VariableBinding;->getOid()Lorg/snmp4j/smi/OID;

    move-result-object v2

    invoke-virtual {v0, v2}, Lorg/snmp4j/smi/OID;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/snmp4j/smi/VariableBinding;->variable:Lorg/snmp4j/smi/Variable;

    invoke-virtual {p1}, Lorg/snmp4j/smi/VariableBinding;->getVariable()Lorg/snmp4j/smi/Variable;

    move-result-object p1

    invoke-interface {v0, p1}, Lorg/snmp4j/smi/Variable;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1
.end method

.method public final getBERLength()I
    .locals 2

    invoke-virtual {p0}, Lorg/snmp4j/smi/VariableBinding;->getBERPayloadLength()I

    move-result v0

    invoke-static {v0}, Lorg/snmp4j/asn1/BER;->getBERLengthOfLength(I)I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    add-int/2addr v0, v1

    return v0
.end method

.method public final getBERPayloadLength()I
    .locals 2

    iget-object v0, p0, Lorg/snmp4j/smi/VariableBinding;->oid:Lorg/snmp4j/smi/OID;

    invoke-virtual {v0}, Lorg/snmp4j/smi/OID;->getBERLength()I

    move-result v0

    iget-object v1, p0, Lorg/snmp4j/smi/VariableBinding;->variable:Lorg/snmp4j/smi/Variable;

    invoke-interface {v1}, Lorg/snmp4j/asn1/BERSerializable;->getBERLength()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public getOid()Lorg/snmp4j/smi/OID;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/smi/VariableBinding;->oid:Lorg/snmp4j/smi/OID;

    return-object v0
.end method

.method public final getSyntax()I
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/smi/VariableBinding;->variable:Lorg/snmp4j/smi/Variable;

    invoke-interface {v0}, Lorg/snmp4j/smi/Variable;->getSyntax()I

    move-result v0

    return v0
.end method

.method public getVariable()Lorg/snmp4j/smi/Variable;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/smi/VariableBinding;->variable:Lorg/snmp4j/smi/Variable;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/smi/VariableBinding;->oid:Lorg/snmp4j/smi/OID;

    invoke-virtual {v0}, Lorg/snmp4j/smi/OID;->hashCode()I

    move-result v0

    return v0
.end method

.method public isException()Z
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/smi/VariableBinding;->variable:Lorg/snmp4j/smi/Variable;

    invoke-interface {v0}, Lorg/snmp4j/smi/Variable;->isException()Z

    move-result v0

    return v0
.end method

.method public setOid(Lorg/snmp4j/smi/OID;)V
    .locals 1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lorg/snmp4j/smi/OID;->clone()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lorg/snmp4j/smi/OID;

    iput-object p1, p0, Lorg/snmp4j/smi/VariableBinding;->oid:Lorg/snmp4j/smi/OID;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "OID of a VariableBinding must not be null"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setVariable(Lorg/snmp4j/smi/Variable;)V
    .locals 1

    if-eqz p1, :cond_0

    invoke-interface {p1}, Lorg/snmp4j/smi/Variable;->clone()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lorg/snmp4j/smi/Variable;

    iput-object p1, p0, Lorg/snmp4j/smi/VariableBinding;->variable:Lorg/snmp4j/smi/Variable;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Variable of a VariableBinding must not be null"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    invoke-static {}, Lorg/snmp4j/SNMP4JSettings;->getVariableTextFormat()Lorg/snmp4j/util/VariableTextFormat;

    move-result-object v0

    iget-object v1, p0, Lorg/snmp4j/smi/VariableBinding;->oid:Lorg/snmp4j/smi/OID;

    iget-object v2, p0, Lorg/snmp4j/smi/VariableBinding;->variable:Lorg/snmp4j/smi/Variable;

    const/4 v3, 0x1

    invoke-interface {v0, v1, v2, v3}, Lorg/snmp4j/util/VariableTextFormat;->format(Lorg/snmp4j/smi/OID;Lorg/snmp4j/smi/Variable;Z)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public toValueString()Ljava/lang/String;
    .locals 4

    invoke-static {}, Lorg/snmp4j/SNMP4JSettings;->getVariableTextFormat()Lorg/snmp4j/util/VariableTextFormat;

    move-result-object v0

    iget-object v1, p0, Lorg/snmp4j/smi/VariableBinding;->oid:Lorg/snmp4j/smi/OID;

    iget-object v2, p0, Lorg/snmp4j/smi/VariableBinding;->variable:Lorg/snmp4j/smi/Variable;

    const/4 v3, 0x0

    invoke-interface {v0, v1, v2, v3}, Lorg/snmp4j/util/VariableTextFormat;->format(Lorg/snmp4j/smi/OID;Lorg/snmp4j/smi/Variable;Z)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
