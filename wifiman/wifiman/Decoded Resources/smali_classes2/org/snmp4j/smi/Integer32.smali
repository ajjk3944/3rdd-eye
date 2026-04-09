.class public Lorg/snmp4j/smi/Integer32;
.super Lorg/snmp4j/smi/AbstractVariable;
.source "SourceFile"

# interfaces
.implements Lorg/snmp4j/smi/AssignableFromInteger;
.implements Lorg/snmp4j/smi/AssignableFromString;


# static fields
.field private static final serialVersionUID:J = 0x460776aea10a6dc0L


# instance fields
.field private value:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lorg/snmp4j/smi/AbstractVariable;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lorg/snmp4j/smi/Integer32;->value:I

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    .line 3
    invoke-direct {p0}, Lorg/snmp4j/smi/AbstractVariable;-><init>()V

    const/4 v0, 0x0

    .line 4
    iput v0, p0, Lorg/snmp4j/smi/Integer32;->value:I

    .line 5
    invoke-virtual {p0, p1}, Lorg/snmp4j/smi/Integer32;->setValue(I)V

    return-void
.end method


# virtual methods
.method public clone()Ljava/lang/Object;
    .locals 2

    new-instance v0, Lorg/snmp4j/smi/Integer32;

    iget v1, p0, Lorg/snmp4j/smi/Integer32;->value:I

    invoke-direct {v0, v1}, Lorg/snmp4j/smi/Integer32;-><init>(I)V

    return-object v0
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Lorg/snmp4j/smi/Variable;

    invoke-virtual {p0, p1}, Lorg/snmp4j/smi/Integer32;->compareTo(Lorg/snmp4j/smi/Variable;)I

    move-result p1

    return p1
.end method

.method public compareTo(Lorg/snmp4j/smi/Variable;)I
    .locals 1

    .line 2
    iget v0, p0, Lorg/snmp4j/smi/Integer32;->value:I

    check-cast p1, Lorg/snmp4j/smi/Integer32;

    iget p1, p1, Lorg/snmp4j/smi/Integer32;->value:I

    sub-int/2addr v0, p1

    return v0
.end method

.method public decodeBER(Lorg/snmp4j/asn1/BERInputStream;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    new-instance v0, Lorg/snmp4j/asn1/BER$MutableByte;

    invoke-direct {v0}, Lorg/snmp4j/asn1/BER$MutableByte;-><init>()V

    invoke-static {p1, v0}, Lorg/snmp4j/asn1/BER;->decodeInteger(Lorg/snmp4j/asn1/BERInputStream;Lorg/snmp4j/asn1/BER$MutableByte;)I

    move-result p1

    invoke-virtual {v0}, Lorg/snmp4j/asn1/BER$MutableByte;->getValue()B

    move-result v1

    const/4 v2, 0x2

    if-ne v1, v2, :cond_0

    invoke-virtual {p0, p1}, Lorg/snmp4j/smi/Integer32;->setValue(I)V

    return-void

    :cond_0
    new-instance p1, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Wrong type encountered when decoding Counter: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lorg/snmp4j/asn1/BER$MutableByte;->getValue()B

    move-result v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public encodeBER(Ljava/io/OutputStream;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x2

    iget v1, p0, Lorg/snmp4j/smi/Integer32;->value:I

    invoke-static {p1, v0, v1}, Lorg/snmp4j/asn1/BER;->encodeInteger(Ljava/io/OutputStream;BI)V

    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Lorg/snmp4j/smi/Integer32;

    if-eqz v0, :cond_0

    check-cast p1, Lorg/snmp4j/smi/Integer32;

    iget p1, p1, Lorg/snmp4j/smi/Integer32;->value:I

    iget v0, p0, Lorg/snmp4j/smi/Integer32;->value:I

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public fromSubIndex(Lorg/snmp4j/smi/OID;Z)V
    .locals 0

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lorg/snmp4j/smi/OID;->get(I)I

    move-result p1

    invoke-virtual {p0, p1}, Lorg/snmp4j/smi/Integer32;->setValue(I)V

    return-void
.end method

.method public getBERLength()I
    .locals 2

    iget v0, p0, Lorg/snmp4j/smi/Integer32;->value:I

    const/16 v1, 0x80

    if-ge v0, v1, :cond_0

    const/16 v1, -0x80

    if-lt v0, v1, :cond_0

    const/4 v0, 0x3

    return v0

    :cond_0
    const v1, 0x8000

    if-ge v0, v1, :cond_1

    const/16 v1, -0x8000

    if-lt v0, v1, :cond_1

    const/4 v0, 0x4

    return v0

    :cond_1
    const/high16 v1, 0x800000

    if-ge v0, v1, :cond_2

    const/high16 v1, -0x800000    # Float.NEGATIVE_INFINITY

    if-lt v0, v1, :cond_2

    const/4 v0, 0x5

    return v0

    :cond_2
    const/4 v0, 0x6

    return v0
.end method

.method public getSyntax()I
    .locals 1

    const/4 v0, 0x2

    return v0
.end method

.method public final getValue()I
    .locals 1

    iget v0, p0, Lorg/snmp4j/smi/Integer32;->value:I

    return v0
.end method

.method public hashCode()I
    .locals 1

    iget v0, p0, Lorg/snmp4j/smi/Integer32;->value:I

    return v0
.end method

.method public final setValue(I)V
    .locals 0

    .line 2
    iput p1, p0, Lorg/snmp4j/smi/Integer32;->value:I

    return-void
.end method

.method public final setValue(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p1

    iput p1, p0, Lorg/snmp4j/smi/Integer32;->value:I

    return-void
.end method

.method public final toInt()I
    .locals 1

    invoke-virtual {p0}, Lorg/snmp4j/smi/Integer32;->getValue()I

    move-result v0

    return v0
.end method

.method public final toLong()J
    .locals 2

    invoke-virtual {p0}, Lorg/snmp4j/smi/Integer32;->getValue()I

    move-result v0

    int-to-long v0, v0

    return-wide v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget v0, p0, Lorg/snmp4j/smi/Integer32;->value:I

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public toSubIndex(Z)Lorg/snmp4j/smi/OID;
    .locals 1

    new-instance p1, Lorg/snmp4j/smi/OID;

    iget v0, p0, Lorg/snmp4j/smi/Integer32;->value:I

    filled-new-array {v0}, [I

    move-result-object v0

    invoke-direct {p1, v0}, Lorg/snmp4j/smi/OID;-><init>([I)V

    return-object p1
.end method
