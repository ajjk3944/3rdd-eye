.class public Lorg/snmp4j/smi/Null;
.super Lorg/snmp4j/smi/AbstractVariable;
.source "SourceFile"


# static fields
.field public static final endOfMibView:Lorg/snmp4j/smi/Null;

.field public static final instance:Lorg/snmp4j/smi/Null;

.field public static final noSuchInstance:Lorg/snmp4j/smi/Null;

.field public static final noSuchObject:Lorg/snmp4j/smi/Null;

.field private static final serialVersionUID:J = 0x5fdde065c174e10cL


# instance fields
.field private syntax:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lorg/snmp4j/smi/Null;

    const/16 v1, 0x80

    invoke-direct {v0, v1}, Lorg/snmp4j/smi/Null;-><init>(I)V

    sput-object v0, Lorg/snmp4j/smi/Null;->noSuchObject:Lorg/snmp4j/smi/Null;

    new-instance v0, Lorg/snmp4j/smi/Null;

    const/16 v1, 0x81

    invoke-direct {v0, v1}, Lorg/snmp4j/smi/Null;-><init>(I)V

    sput-object v0, Lorg/snmp4j/smi/Null;->noSuchInstance:Lorg/snmp4j/smi/Null;

    new-instance v0, Lorg/snmp4j/smi/Null;

    const/16 v1, 0x82

    invoke-direct {v0, v1}, Lorg/snmp4j/smi/Null;-><init>(I)V

    sput-object v0, Lorg/snmp4j/smi/Null;->endOfMibView:Lorg/snmp4j/smi/Null;

    new-instance v0, Lorg/snmp4j/smi/Null;

    const/4 v1, 0x5

    invoke-direct {v0, v1}, Lorg/snmp4j/smi/Null;-><init>(I)V

    sput-object v0, Lorg/snmp4j/smi/Null;->instance:Lorg/snmp4j/smi/Null;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lorg/snmp4j/smi/AbstractVariable;-><init>()V

    const/4 v0, 0x5

    .line 2
    iput v0, p0, Lorg/snmp4j/smi/Null;->syntax:I

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    .line 3
    invoke-direct {p0}, Lorg/snmp4j/smi/AbstractVariable;-><init>()V

    const/4 v0, 0x5

    .line 4
    iput v0, p0, Lorg/snmp4j/smi/Null;->syntax:I

    .line 5
    invoke-virtual {p0, p1}, Lorg/snmp4j/smi/Null;->setSyntax(I)V

    return-void
.end method

.method public static isExceptionSyntax(I)Z
    .locals 0

    packed-switch p0, :pswitch_data_0

    const/4 p0, 0x0

    return p0

    :pswitch_0
    const/4 p0, 0x1

    return p0

    nop

    :pswitch_data_0
    .packed-switch 0x80
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public clone()Ljava/lang/Object;
    .locals 2

    new-instance v0, Lorg/snmp4j/smi/Null;

    iget v1, p0, Lorg/snmp4j/smi/Null;->syntax:I

    invoke-direct {v0, v1}, Lorg/snmp4j/smi/Null;-><init>(I)V

    return-object v0
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Lorg/snmp4j/smi/Variable;

    invoke-virtual {p0, p1}, Lorg/snmp4j/smi/Null;->compareTo(Lorg/snmp4j/smi/Variable;)I

    move-result p1

    return p1
.end method

.method public compareTo(Lorg/snmp4j/smi/Variable;)I
    .locals 1

    .line 2
    invoke-virtual {p0}, Lorg/snmp4j/smi/Null;->getSyntax()I

    move-result v0

    invoke-interface {p1}, Lorg/snmp4j/smi/Variable;->getSyntax()I

    move-result p1

    sub-int/2addr v0, p1

    return v0
.end method

.method public decodeBER(Lorg/snmp4j/asn1/BERInputStream;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    new-instance v0, Lorg/snmp4j/asn1/BER$MutableByte;

    invoke-direct {v0}, Lorg/snmp4j/asn1/BER$MutableByte;-><init>()V

    invoke-static {p1, v0}, Lorg/snmp4j/asn1/BER;->decodeNull(Lorg/snmp4j/asn1/BERInputStream;Lorg/snmp4j/asn1/BER$MutableByte;)V

    invoke-virtual {v0}, Lorg/snmp4j/asn1/BER$MutableByte;->getValue()B

    move-result p1

    and-int/lit16 p1, p1, 0xff

    iput p1, p0, Lorg/snmp4j/smi/Null;->syntax:I

    return-void
.end method

.method public encodeBER(Ljava/io/OutputStream;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-virtual {p0}, Lorg/snmp4j/smi/Null;->getSyntax()I

    move-result v0

    int-to-byte v0, v0

    const/4 v1, 0x0

    invoke-static {p1, v0, v1}, Lorg/snmp4j/asn1/BER;->encodeHeader(Ljava/io/OutputStream;II)V

    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Lorg/snmp4j/smi/Null;

    if-eqz v0, :cond_0

    check-cast p1, Lorg/snmp4j/smi/Null;

    invoke-virtual {p1}, Lorg/snmp4j/smi/Null;->getSyntax()I

    move-result p1

    invoke-virtual {p0}, Lorg/snmp4j/smi/Null;->getSyntax()I

    move-result v0

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

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public getBERLength()I
    .locals 1

    const/4 v0, 0x2

    return v0
.end method

.method public getSyntax()I
    .locals 1

    iget v0, p0, Lorg/snmp4j/smi/Null;->syntax:I

    return v0
.end method

.method public hashCode()I
    .locals 1

    invoke-virtual {p0}, Lorg/snmp4j/smi/Null;->getSyntax()I

    move-result v0

    return v0
.end method

.method public setSyntax(I)V
    .locals 3

    const/4 v0, 0x5

    if-eq p1, v0, :cond_1

    invoke-static {p1}, Lorg/snmp4j/smi/Null;->isExceptionSyntax(I)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Syntax "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " is incompatible with Null type"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    iput p1, p0, Lorg/snmp4j/smi/Null;->syntax:I

    return-void
.end method

.method public final toInt()I
    .locals 1

    invoke-virtual {p0}, Lorg/snmp4j/smi/Null;->getSyntax()I

    move-result v0

    return v0
.end method

.method public final toLong()J
    .locals 2

    invoke-virtual {p0}, Lorg/snmp4j/smi/Null;->getSyntax()I

    move-result v0

    int-to-long v0, v0

    return-wide v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lorg/snmp4j/smi/Null;->getSyntax()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    const-string v0, "Null"

    return-object v0

    :pswitch_0
    const-string v0, "endOfMibView"

    return-object v0

    :pswitch_1
    const-string v0, "noSuchInstance"

    return-object v0

    :pswitch_2
    const-string v0, "noSuchObject"

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x80
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public toSubIndex(Z)Lorg/snmp4j/smi/OID;
    .locals 0

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method
