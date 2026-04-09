.class public Lorg/snmp4j/PDU;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/snmp4j/asn1/BERSerializable;
.implements Ljava/io/Serializable;


# static fields
.field public static final GET:I = -0x60

.field public static final GETBULK:I = -0x5b

.field public static final GETNEXT:I = -0x5f

.field public static final INFORM:I = -0x5a

.field public static final NOTIFICATION:I = -0x59

.field public static final REPORT:I = -0x58

.field public static final RESPONSE:I = -0x5e

.field public static final SET:I = -0x5d

.field public static final TRAP:I = -0x59

.field public static final V1TRAP:I = -0x5c

.field public static final authorizationError:I = 0x10

.field public static final badValue:I = 0x3

.field public static final commitFailed:I = 0xe

.field public static final genErr:I = 0x5

.field public static final inconsistentName:I = 0x12

.field public static final inconsistentValue:I = 0xc

.field public static final noAccess:I = 0x6

.field public static final noCreation:I = 0xb

.field public static final noError:I = 0x0

.field public static final noSuchName:I = 0x2

.field public static final notWritable:I = 0x11

.field public static final readOnly:I = 0x4

.field public static final resourceUnavailable:I = 0xd

.field private static final serialVersionUID:J = 0x6993e1cf356b5a30L

.field public static final tooBig:I = 0x1

.field public static final undoFailed:I = 0xf

.field public static final wrongEncoding:I = 0x9

.field public static final wrongLength:I = 0x8

.field public static final wrongType:I = 0x7

.field public static final wrongValue:I = 0xa


# instance fields
.field protected errorIndex:Lorg/snmp4j/smi/Integer32;

.field protected errorStatus:Lorg/snmp4j/smi/Integer32;

.field protected requestID:Lorg/snmp4j/smi/Integer32;

.field protected type:I

.field protected variableBindings:Ljava/util/Vector;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Vector<",
            "Lorg/snmp4j/smi/VariableBinding;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/Vector;

    invoke-direct {v0}, Ljava/util/Vector;-><init>()V

    iput-object v0, p0, Lorg/snmp4j/PDU;->variableBindings:Ljava/util/Vector;

    .line 3
    new-instance v0, Lorg/snmp4j/smi/Integer32;

    invoke-direct {v0}, Lorg/snmp4j/smi/Integer32;-><init>()V

    iput-object v0, p0, Lorg/snmp4j/PDU;->errorStatus:Lorg/snmp4j/smi/Integer32;

    .line 4
    new-instance v0, Lorg/snmp4j/smi/Integer32;

    invoke-direct {v0}, Lorg/snmp4j/smi/Integer32;-><init>()V

    iput-object v0, p0, Lorg/snmp4j/PDU;->errorIndex:Lorg/snmp4j/smi/Integer32;

    .line 5
    new-instance v0, Lorg/snmp4j/smi/Integer32;

    invoke-direct {v0}, Lorg/snmp4j/smi/Integer32;-><init>()V

    iput-object v0, p0, Lorg/snmp4j/PDU;->requestID:Lorg/snmp4j/smi/Integer32;

    const/16 v0, -0x60

    .line 6
    iput v0, p0, Lorg/snmp4j/PDU;->type:I

    return-void
.end method

.method public constructor <init>(ILjava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "+",
            "Lorg/snmp4j/smi/VariableBinding;",
            ">;)V"
        }
    .end annotation

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    new-instance v0, Ljava/util/Vector;

    invoke-direct {v0}, Ljava/util/Vector;-><init>()V

    iput-object v0, p0, Lorg/snmp4j/PDU;->variableBindings:Ljava/util/Vector;

    .line 23
    new-instance v0, Lorg/snmp4j/smi/Integer32;

    invoke-direct {v0}, Lorg/snmp4j/smi/Integer32;-><init>()V

    iput-object v0, p0, Lorg/snmp4j/PDU;->errorStatus:Lorg/snmp4j/smi/Integer32;

    .line 24
    new-instance v0, Lorg/snmp4j/smi/Integer32;

    invoke-direct {v0}, Lorg/snmp4j/smi/Integer32;-><init>()V

    iput-object v0, p0, Lorg/snmp4j/PDU;->errorIndex:Lorg/snmp4j/smi/Integer32;

    .line 25
    new-instance v0, Lorg/snmp4j/smi/Integer32;

    invoke-direct {v0}, Lorg/snmp4j/smi/Integer32;-><init>()V

    iput-object v0, p0, Lorg/snmp4j/PDU;->requestID:Lorg/snmp4j/smi/Integer32;

    .line 26
    iput p1, p0, Lorg/snmp4j/PDU;->type:I

    .line 27
    new-instance p1, Ljava/util/Vector;

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    invoke-direct {p1, v0}, Ljava/util/Vector;-><init>(I)V

    iput-object p1, p0, Lorg/snmp4j/PDU;->variableBindings:Ljava/util/Vector;

    .line 28
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lorg/snmp4j/smi/VariableBinding;

    .line 29
    iget-object v0, p0, Lorg/snmp4j/PDU;->variableBindings:Ljava/util/Vector;

    invoke-virtual {p2}, Lorg/snmp4j/smi/VariableBinding;->clone()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lorg/snmp4j/smi/VariableBinding;

    invoke-virtual {v0, p2}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-void
.end method

.method public constructor <init>(Lorg/snmp4j/PDU;)V
    .locals 3

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    new-instance v0, Ljava/util/Vector;

    invoke-direct {v0}, Ljava/util/Vector;-><init>()V

    iput-object v0, p0, Lorg/snmp4j/PDU;->variableBindings:Ljava/util/Vector;

    .line 9
    new-instance v0, Lorg/snmp4j/smi/Integer32;

    invoke-direct {v0}, Lorg/snmp4j/smi/Integer32;-><init>()V

    iput-object v0, p0, Lorg/snmp4j/PDU;->errorStatus:Lorg/snmp4j/smi/Integer32;

    .line 10
    new-instance v0, Lorg/snmp4j/smi/Integer32;

    invoke-direct {v0}, Lorg/snmp4j/smi/Integer32;-><init>()V

    iput-object v0, p0, Lorg/snmp4j/PDU;->errorIndex:Lorg/snmp4j/smi/Integer32;

    .line 11
    new-instance v0, Lorg/snmp4j/smi/Integer32;

    invoke-direct {v0}, Lorg/snmp4j/smi/Integer32;-><init>()V

    iput-object v0, p0, Lorg/snmp4j/PDU;->requestID:Lorg/snmp4j/smi/Integer32;

    const/16 v0, -0x60

    .line 12
    iput v0, p0, Lorg/snmp4j/PDU;->type:I

    .line 13
    new-instance v0, Ljava/util/Vector;

    invoke-virtual {p1}, Lorg/snmp4j/PDU;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/Vector;-><init>(I)V

    iput-object v0, p0, Lorg/snmp4j/PDU;->variableBindings:Ljava/util/Vector;

    .line 14
    iget-object v0, p1, Lorg/snmp4j/PDU;->variableBindings:Ljava/util/Vector;

    invoke-virtual {v0}, Ljava/util/Vector;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/snmp4j/smi/VariableBinding;

    .line 15
    iget-object v2, p0, Lorg/snmp4j/PDU;->variableBindings:Ljava/util/Vector;

    invoke-virtual {v1}, Lorg/snmp4j/smi/VariableBinding;->clone()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/snmp4j/smi/VariableBinding;

    invoke-virtual {v2, v1}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 16
    :cond_0
    iget-object v0, p1, Lorg/snmp4j/PDU;->errorIndex:Lorg/snmp4j/smi/Integer32;

    invoke-virtual {v0}, Lorg/snmp4j/smi/Integer32;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/snmp4j/smi/Integer32;

    iput-object v0, p0, Lorg/snmp4j/PDU;->errorIndex:Lorg/snmp4j/smi/Integer32;

    .line 17
    iget-object v0, p1, Lorg/snmp4j/PDU;->errorStatus:Lorg/snmp4j/smi/Integer32;

    invoke-virtual {v0}, Lorg/snmp4j/smi/Integer32;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/snmp4j/smi/Integer32;

    iput-object v0, p0, Lorg/snmp4j/PDU;->errorStatus:Lorg/snmp4j/smi/Integer32;

    .line 18
    iget v0, p1, Lorg/snmp4j/PDU;->type:I

    iput v0, p0, Lorg/snmp4j/PDU;->type:I

    .line 19
    iget-object p1, p1, Lorg/snmp4j/PDU;->requestID:Lorg/snmp4j/smi/Integer32;

    if-eqz p1, :cond_1

    .line 20
    invoke-virtual {p1}, Lorg/snmp4j/smi/Integer32;->clone()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lorg/snmp4j/smi/Integer32;

    iput-object p1, p0, Lorg/snmp4j/PDU;->requestID:Lorg/snmp4j/smi/Integer32;

    :cond_1
    return-void
.end method

.method public static getBERLength(Ljava/util/List;)I
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lorg/snmp4j/smi/VariableBinding;",
            ">;)I"
        }
    .end annotation

    .line 3
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    const/4 v0, 0x0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/snmp4j/smi/VariableBinding;

    .line 4
    invoke-virtual {v1}, Lorg/snmp4j/smi/VariableBinding;->getBERLength()I

    move-result v1

    add-int/2addr v0, v1

    goto :goto_0

    :cond_0
    return v0
.end method

.method public static getTypeFromString(Ljava/lang/String;)I
    .locals 1

    const-string v0, "GET"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/16 p0, -0x60

    return p0

    :cond_0
    const-string v0, "SET"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/16 p0, -0x5d

    return p0

    :cond_1
    const-string v0, "GETNEXT"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/16 p0, -0x5f

    return p0

    :cond_2
    const-string v0, "GETBULK"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    const/16 p0, -0x5b

    return p0

    :cond_3
    const-string v0, "INFORM"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    const/16 p0, -0x5a

    return p0

    :cond_4
    const-string v0, "RESPONSE"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    const/16 p0, -0x5e

    return p0

    :cond_5
    const-string v0, "TRAP"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/16 p0, -0x59

    return p0

    :cond_6
    const-string v0, "V1TRAP"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    const/16 p0, -0x5c

    return p0

    :cond_7
    const-string v0, "REPORT"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_8

    const/16 p0, -0x58

    return p0

    :cond_8
    const/high16 p0, -0x80000000

    return p0
.end method

.method public static getTypeString(I)Ljava/lang/String;
    .locals 0

    packed-switch p0, :pswitch_data_0

    const-string p0, "unknown"

    return-object p0

    :pswitch_0
    const-string p0, "REPORT"

    return-object p0

    :pswitch_1
    const-string p0, "TRAP"

    return-object p0

    :pswitch_2
    const-string p0, "INFORM"

    return-object p0

    :pswitch_3
    const-string p0, "GETBULK"

    return-object p0

    :pswitch_4
    const-string p0, "V1TRAP"

    return-object p0

    :pswitch_5
    const-string p0, "SET"

    return-object p0

    :pswitch_6
    const-string p0, "RESPONSE"

    return-object p0

    :pswitch_7
    const-string p0, "GETNEXT"

    return-object p0

    :pswitch_8
    const-string p0, "GET"

    return-object p0

    nop

    :pswitch_data_0
    .packed-switch -0x60
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static toErrorStatusText(I)Ljava/lang/String;
    .locals 2

    if-gez p0, :cond_0

    :try_start_0
    sget-object v0, Lorg/snmp4j/mp/SnmpConstants;->SNMP_TP_ERROR_MESSAGES:[Ljava/lang/String;

    invoke-static {p0}, Ljava/lang/Math;->abs(I)I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    aget-object p0, v0, v1

    return-object p0

    :cond_0
    sget-object v0, Lorg/snmp4j/mp/SnmpConstants;->SNMP_ERROR_MESSAGES:[Ljava/lang/String;

    aget-object p0, v0, p0
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unknown error: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public add(Lorg/snmp4j/smi/VariableBinding;)V
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/PDU;->variableBindings:Ljava/util/Vector;

    invoke-virtual {v0, p1}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public addAll(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lorg/snmp4j/smi/VariableBinding;",
            ">;)V"
        }
    .end annotation

    .line 4
    iget-object v0, p0, Lorg/snmp4j/PDU;->variableBindings:Ljava/util/Vector;

    invoke-virtual {v0, p1}, Ljava/util/Vector;->addAll(Ljava/util/Collection;)Z

    return-void
.end method

.method public addAll([Lorg/snmp4j/smi/VariableBinding;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lorg/snmp4j/PDU;->variableBindings:Ljava/util/Vector;

    invoke-virtual {v0}, Ljava/util/Vector;->size()I

    move-result v1

    array-length v2, p1

    add-int/2addr v1, v2

    invoke-virtual {v0, v1}, Ljava/util/Vector;->ensureCapacity(I)V

    .line 2
    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    aget-object v2, p1, v1

    .line 3
    invoke-virtual {p0, v2}, Lorg/snmp4j/PDU;->add(Lorg/snmp4j/smi/VariableBinding;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public addAllOIDs([Lorg/snmp4j/smi/VariableBinding;)V
    .locals 3

    iget-object v0, p0, Lorg/snmp4j/PDU;->variableBindings:Ljava/util/Vector;

    invoke-virtual {v0}, Ljava/util/Vector;->size()I

    move-result v1

    array-length v2, p1

    add-int/2addr v1, v2

    invoke-virtual {v0, v1}, Ljava/util/Vector;->ensureCapacity(I)V

    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    aget-object v2, p1, v1

    invoke-virtual {p0, v2}, Lorg/snmp4j/PDU;->addOID(Lorg/snmp4j/smi/VariableBinding;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public addOID(Lorg/snmp4j/smi/VariableBinding;)V
    .locals 1

    new-instance v0, Lorg/snmp4j/smi/VariableBinding;

    invoke-virtual {p1}, Lorg/snmp4j/smi/VariableBinding;->getOid()Lorg/snmp4j/smi/OID;

    move-result-object p1

    invoke-direct {v0, p1}, Lorg/snmp4j/smi/VariableBinding;-><init>(Lorg/snmp4j/smi/OID;)V

    iget-object p1, p0, Lorg/snmp4j/PDU;->variableBindings:Ljava/util/Vector;

    invoke-virtual {p1, v0}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public clear()V
    .locals 2

    iget-object v0, p0, Lorg/snmp4j/PDU;->variableBindings:Ljava/util/Vector;

    invoke-virtual {v0}, Ljava/util/Vector;->clear()V

    new-instance v0, Lorg/snmp4j/smi/Integer32;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lorg/snmp4j/smi/Integer32;-><init>(I)V

    invoke-virtual {p0, v0}, Lorg/snmp4j/PDU;->setRequestID(Lorg/snmp4j/smi/Integer32;)V

    return-void
.end method

.method public clone()Ljava/lang/Object;
    .locals 1

    new-instance v0, Lorg/snmp4j/PDU;

    invoke-direct {v0, p0}, Lorg/snmp4j/PDU;-><init>(Lorg/snmp4j/PDU;)V

    return-object v0
.end method

.method public decodeBER(Lorg/snmp4j/asn1/BERInputStream;)V
    .locals 10
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

    long-to-int v2, v2

    invoke-virtual {v0}, Lorg/snmp4j/asn1/BER$MutableByte;->getValue()B

    move-result v3

    packed-switch v3, :pswitch_data_0

    :pswitch_0
    new-instance p1, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unsupported PDU type: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lorg/snmp4j/asn1/BER$MutableByte;->getValue()B

    move-result v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_1
    invoke-virtual {v0}, Lorg/snmp4j/asn1/BER$MutableByte;->getValue()B

    move-result v0

    iput v0, p0, Lorg/snmp4j/PDU;->type:I

    iget-object v0, p0, Lorg/snmp4j/PDU;->requestID:Lorg/snmp4j/smi/Integer32;

    invoke-virtual {v0, p1}, Lorg/snmp4j/smi/Integer32;->decodeBER(Lorg/snmp4j/asn1/BERInputStream;)V

    iget-object v0, p0, Lorg/snmp4j/PDU;->errorStatus:Lorg/snmp4j/smi/Integer32;

    invoke-virtual {v0, p1}, Lorg/snmp4j/smi/Integer32;->decodeBER(Lorg/snmp4j/asn1/BERInputStream;)V

    iget-object v0, p0, Lorg/snmp4j/PDU;->errorIndex:Lorg/snmp4j/smi/Integer32;

    invoke-virtual {v0, p1}, Lorg/snmp4j/smi/Integer32;->decodeBER(Lorg/snmp4j/asn1/BERInputStream;)V

    new-instance v0, Lorg/snmp4j/asn1/BER$MutableByte;

    invoke-direct {v0}, Lorg/snmp4j/asn1/BER$MutableByte;-><init>()V

    invoke-static {p1, v0}, Lorg/snmp4j/asn1/BER;->decodeHeader(Lorg/snmp4j/asn1/BERInputStream;Lorg/snmp4j/asn1/BER$MutableByte;)I

    move-result v3

    invoke-virtual {v0}, Lorg/snmp4j/asn1/BER$MutableByte;->getValue()B

    move-result v4

    const/16 v5, 0x30

    if-ne v4, v5, :cond_3

    invoke-virtual {p1}, Lorg/snmp4j/asn1/BERInputStream;->getPosition()J

    move-result-wide v4

    long-to-int v0, v4

    new-instance v4, Ljava/util/Vector;

    invoke-direct {v4}, Ljava/util/Vector;-><init>()V

    iput-object v4, p0, Lorg/snmp4j/PDU;->variableBindings:Ljava/util/Vector;

    :goto_0
    invoke-virtual {p1}, Lorg/snmp4j/asn1/BERInputStream;->getPosition()J

    move-result-wide v4

    int-to-long v6, v0

    sub-long/2addr v4, v6

    int-to-long v8, v3

    cmp-long v4, v4, v8

    if-gez v4, :cond_0

    new-instance v4, Lorg/snmp4j/smi/VariableBinding;

    invoke-direct {v4}, Lorg/snmp4j/smi/VariableBinding;-><init>()V

    invoke-virtual {v4, p1}, Lorg/snmp4j/smi/VariableBinding;->decodeBER(Lorg/snmp4j/asn1/BERInputStream;)V

    iget-object v5, p0, Lorg/snmp4j/PDU;->variableBindings:Ljava/util/Vector;

    invoke-virtual {v5, v4}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lorg/snmp4j/asn1/BERInputStream;->getPosition()J

    move-result-wide v4

    sub-long/2addr v4, v6

    cmp-long v4, v4, v8

    if-nez v4, :cond_2

    invoke-static {}, Lorg/snmp4j/asn1/BER;->isCheckSequenceLength()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lorg/snmp4j/asn1/BERInputStream;->getPosition()J

    move-result-wide v3

    long-to-int p1, v3

    sub-int/2addr p1, v2

    invoke-static {v1, p1, p0}, Lorg/snmp4j/asn1/BER;->checkSequenceLength(IILorg/snmp4j/asn1/BERSerializable;)V

    :cond_1
    return-void

    :cond_2
    new-instance v1, Ljava/io/IOException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Length of VB sequence ("

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, ") does not match real length: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lorg/snmp4j/asn1/BERInputStream;->getPosition()J

    move-result-wide v3

    long-to-int p1, v3

    sub-int/2addr p1, v0

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_3
    new-instance p1, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Encountered invalid tag, SEQUENCE expected: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lorg/snmp4j/asn1/BER$MutableByte;->getValue()B

    move-result v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_data_0
    .packed-switch -0x60
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method

.method public encodeBER(Ljava/io/OutputStream;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget v0, p0, Lorg/snmp4j/PDU;->type:I

    invoke-virtual {p0}, Lorg/snmp4j/PDU;->getBERPayloadLengthPDU()I

    move-result v1

    invoke-static {p1, v0, v1}, Lorg/snmp4j/asn1/BER;->encodeHeader(Ljava/io/OutputStream;II)V

    iget-object v0, p0, Lorg/snmp4j/PDU;->requestID:Lorg/snmp4j/smi/Integer32;

    invoke-virtual {v0, p1}, Lorg/snmp4j/smi/Integer32;->encodeBER(Ljava/io/OutputStream;)V

    iget-object v0, p0, Lorg/snmp4j/PDU;->errorStatus:Lorg/snmp4j/smi/Integer32;

    invoke-virtual {v0, p1}, Lorg/snmp4j/smi/Integer32;->encodeBER(Ljava/io/OutputStream;)V

    iget-object v0, p0, Lorg/snmp4j/PDU;->errorIndex:Lorg/snmp4j/smi/Integer32;

    invoke-virtual {v0, p1}, Lorg/snmp4j/smi/Integer32;->encodeBER(Ljava/io/OutputStream;)V

    iget-object v0, p0, Lorg/snmp4j/PDU;->variableBindings:Ljava/util/Vector;

    invoke-virtual {v0}, Ljava/util/Vector;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lorg/snmp4j/smi/VariableBinding;

    invoke-virtual {v2}, Lorg/snmp4j/smi/VariableBinding;->getBERLength()I

    move-result v2

    add-int/2addr v1, v2

    goto :goto_0

    :cond_0
    const/16 v0, 0x30

    invoke-static {p1, v0, v1}, Lorg/snmp4j/asn1/BER;->encodeHeader(Ljava/io/OutputStream;II)V

    iget-object v0, p0, Lorg/snmp4j/PDU;->variableBindings:Ljava/util/Vector;

    invoke-virtual {v0}, Ljava/util/Vector;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/snmp4j/smi/VariableBinding;

    invoke-virtual {v1, p1}, Lorg/snmp4j/smi/VariableBinding;->encodeBER(Ljava/io/OutputStream;)V

    goto :goto_1

    :cond_1
    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Lorg/snmp4j/PDU;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, Lorg/snmp4j/PDU;

    iget v0, p0, Lorg/snmp4j/PDU;->type:I

    iget v2, p1, Lorg/snmp4j/PDU;->type:I

    if-ne v0, v2, :cond_0

    iget-object v0, p0, Lorg/snmp4j/PDU;->requestID:Lorg/snmp4j/smi/Integer32;

    iget-object v2, p1, Lorg/snmp4j/PDU;->requestID:Lorg/snmp4j/smi/Integer32;

    invoke-static {v0, v2}, Lorg/snmp4j/smi/AbstractVariable;->equal(Lorg/snmp4j/smi/AbstractVariable;Lorg/snmp4j/smi/AbstractVariable;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/snmp4j/PDU;->errorStatus:Lorg/snmp4j/smi/Integer32;

    iget-object v2, p1, Lorg/snmp4j/PDU;->errorStatus:Lorg/snmp4j/smi/Integer32;

    invoke-static {v0, v2}, Lorg/snmp4j/smi/AbstractVariable;->equal(Lorg/snmp4j/smi/AbstractVariable;Lorg/snmp4j/smi/AbstractVariable;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/snmp4j/PDU;->errorIndex:Lorg/snmp4j/smi/Integer32;

    iget-object v2, p1, Lorg/snmp4j/PDU;->errorIndex:Lorg/snmp4j/smi/Integer32;

    invoke-static {v0, v2}, Lorg/snmp4j/smi/AbstractVariable;->equal(Lorg/snmp4j/smi/AbstractVariable;Lorg/snmp4j/smi/AbstractVariable;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/snmp4j/PDU;->variableBindings:Ljava/util/Vector;

    iget-object p1, p1, Lorg/snmp4j/PDU;->variableBindings:Ljava/util/Vector;

    invoke-virtual {v0, p1}, Ljava/util/Vector;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1
.end method

.method public get(I)Lorg/snmp4j/smi/VariableBinding;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/PDU;->variableBindings:Ljava/util/Vector;

    invoke-virtual {v0, p1}, Ljava/util/Vector;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lorg/snmp4j/smi/VariableBinding;

    return-object p1
.end method

.method public getBERLength()I
    .locals 2

    .line 1
    invoke-virtual {p0}, Lorg/snmp4j/PDU;->getBERPayloadLengthPDU()I

    move-result v0

    .line 2
    invoke-static {v0}, Lorg/snmp4j/asn1/BER;->getBERLengthOfLength(I)I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    add-int/2addr v0, v1

    return v0
.end method

.method public getBERPayloadLength()I
    .locals 1

    invoke-virtual {p0}, Lorg/snmp4j/PDU;->getBERPayloadLengthPDU()I

    move-result v0

    return v0
.end method

.method protected getBERPayloadLengthPDU()I
    .locals 3

    iget-object v0, p0, Lorg/snmp4j/PDU;->variableBindings:Ljava/util/Vector;

    invoke-static {v0}, Lorg/snmp4j/PDU;->getBERLength(Ljava/util/List;)I

    move-result v0

    invoke-static {v0}, Lorg/snmp4j/asn1/BER;->getBERLengthOfLength(I)I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    add-int/2addr v0, v1

    new-instance v1, Lorg/snmp4j/smi/Integer32;

    iget-object v2, p0, Lorg/snmp4j/PDU;->requestID:Lorg/snmp4j/smi/Integer32;

    invoke-virtual {v2}, Lorg/snmp4j/smi/Integer32;->getValue()I

    move-result v2

    invoke-direct {v1, v2}, Lorg/snmp4j/smi/Integer32;-><init>(I)V

    invoke-virtual {v1}, Lorg/snmp4j/smi/Integer32;->getBERLength()I

    move-result v1

    add-int/2addr v0, v1

    iget-object v1, p0, Lorg/snmp4j/PDU;->errorStatus:Lorg/snmp4j/smi/Integer32;

    invoke-virtual {v1}, Lorg/snmp4j/smi/Integer32;->getBERLength()I

    move-result v1

    add-int/2addr v0, v1

    iget-object v1, p0, Lorg/snmp4j/PDU;->errorIndex:Lorg/snmp4j/smi/Integer32;

    invoke-virtual {v1}, Lorg/snmp4j/smi/Integer32;->getBERLength()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public getBindingList(Lorg/snmp4j/smi/OID;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/snmp4j/smi/OID;",
            ")",
            "Ljava/util/List<",
            "Lorg/snmp4j/smi/VariableBinding;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lorg/snmp4j/PDU;->variableBindings:Ljava/util/Vector;

    invoke-virtual {v1}, Ljava/util/Vector;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iget-object v1, p0, Lorg/snmp4j/PDU;->variableBindings:Ljava/util/Vector;

    invoke-virtual {v1}, Ljava/util/Vector;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lorg/snmp4j/smi/VariableBinding;

    invoke-virtual {v2}, Lorg/snmp4j/smi/VariableBinding;->getOid()Lorg/snmp4j/smi/OID;

    move-result-object v3

    invoke-virtual {v3, p1}, Lorg/snmp4j/smi/OID;->startsWith(Lorg/snmp4j/smi/OID;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public getErrorIndex()I
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/PDU;->errorIndex:Lorg/snmp4j/smi/Integer32;

    invoke-virtual {v0}, Lorg/snmp4j/smi/Integer32;->getValue()I

    move-result v0

    return v0
.end method

.method public getErrorStatus()I
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/PDU;->errorStatus:Lorg/snmp4j/smi/Integer32;

    invoke-virtual {v0}, Lorg/snmp4j/smi/Integer32;->getValue()I

    move-result v0

    return v0
.end method

.method public getErrorStatusText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/PDU;->errorStatus:Lorg/snmp4j/smi/Integer32;

    invoke-virtual {v0}, Lorg/snmp4j/smi/Integer32;->getValue()I

    move-result v0

    invoke-static {v0}, Lorg/snmp4j/PDU;->toErrorStatusText(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getMaxRepetitions()I
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/PDU;->errorIndex:Lorg/snmp4j/smi/Integer32;

    invoke-virtual {v0}, Lorg/snmp4j/smi/Integer32;->getValue()I

    move-result v0

    return v0
.end method

.method public getNonRepeaters()I
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/PDU;->errorStatus:Lorg/snmp4j/smi/Integer32;

    invoke-virtual {v0}, Lorg/snmp4j/smi/Integer32;->getValue()I

    move-result v0

    return v0
.end method

.method public getRequestID()Lorg/snmp4j/smi/Integer32;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/PDU;->requestID:Lorg/snmp4j/smi/Integer32;

    return-object v0
.end method

.method public getType()I
    .locals 1

    iget v0, p0, Lorg/snmp4j/PDU;->type:I

    return v0
.end method

.method public getVariable(Lorg/snmp4j/smi/OID;)Lorg/snmp4j/smi/Variable;
    .locals 3

    iget-object v0, p0, Lorg/snmp4j/PDU;->variableBindings:Ljava/util/Vector;

    invoke-virtual {v0}, Ljava/util/Vector;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/snmp4j/smi/VariableBinding;

    invoke-virtual {v1}, Lorg/snmp4j/smi/VariableBinding;->getOid()Lorg/snmp4j/smi/OID;

    move-result-object v2

    invoke-virtual {v2, p1}, Lorg/snmp4j/smi/OID;->startsWith(Lorg/snmp4j/smi/OID;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v1}, Lorg/snmp4j/smi/VariableBinding;->getVariable()Lorg/snmp4j/smi/Variable;

    move-result-object p1

    return-object p1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public getVariableBindings()Ljava/util/Vector;
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

    iget-object v0, p0, Lorg/snmp4j/PDU;->variableBindings:Ljava/util/Vector;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    invoke-super {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public isConfirmedPdu()Z
    .locals 2

    iget v0, p0, Lorg/snmp4j/PDU;->type:I

    const/16 v1, -0x58

    if-eq v0, v1, :cond_0

    const/16 v1, -0x5e

    if-eq v0, v1, :cond_0

    const/16 v1, -0x59

    if-eq v0, v1, :cond_0

    const/16 v1, -0x5c

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public isResponsePdu()Z
    .locals 2

    iget v0, p0, Lorg/snmp4j/PDU;->type:I

    const/16 v1, -0x5e

    if-eq v0, v1, :cond_1

    const/16 v1, -0x58

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public remove(I)V
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/PDU;->variableBindings:Ljava/util/Vector;

    invoke-virtual {v0, p1}, Ljava/util/Vector;->remove(I)Ljava/lang/Object;

    return-void
.end method

.method public set(ILorg/snmp4j/smi/VariableBinding;)Lorg/snmp4j/smi/VariableBinding;
    .locals 1

    if-eqz p2, :cond_0

    iget-object v0, p0, Lorg/snmp4j/PDU;->variableBindings:Ljava/util/Vector;

    invoke-virtual {v0, p1, p2}, Ljava/util/Vector;->set(ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lorg/snmp4j/smi/VariableBinding;

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "Variable binding must not be null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setErrorIndex(I)V
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/PDU;->errorIndex:Lorg/snmp4j/smi/Integer32;

    invoke-virtual {v0, p1}, Lorg/snmp4j/smi/Integer32;->setValue(I)V

    return-void
.end method

.method public setErrorStatus(I)V
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/PDU;->errorStatus:Lorg/snmp4j/smi/Integer32;

    invoke-virtual {v0, p1}, Lorg/snmp4j/smi/Integer32;->setValue(I)V

    return-void
.end method

.method public setMaxRepetitions(I)V
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/PDU;->errorIndex:Lorg/snmp4j/smi/Integer32;

    invoke-virtual {v0, p1}, Lorg/snmp4j/smi/Integer32;->setValue(I)V

    return-void
.end method

.method public setNonRepeaters(I)V
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/PDU;->errorStatus:Lorg/snmp4j/smi/Integer32;

    invoke-virtual {v0, p1}, Lorg/snmp4j/smi/Integer32;->setValue(I)V

    return-void
.end method

.method public setRequestID(Lorg/snmp4j/smi/Integer32;)V
    .locals 0

    iput-object p1, p0, Lorg/snmp4j/PDU;->requestID:Lorg/snmp4j/smi/Integer32;

    return-void
.end method

.method public setType(I)V
    .locals 0

    iput p1, p0, Lorg/snmp4j/PDU;->type:I

    return-void
.end method

.method public setVariableBindings(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lorg/snmp4j/smi/VariableBinding;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Ljava/util/Vector;

    invoke-direct {v0, p1}, Ljava/util/Vector;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lorg/snmp4j/PDU;->variableBindings:Ljava/util/Vector;

    return-void
.end method

.method public size()I
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/PDU;->variableBindings:Ljava/util/Vector;

    invoke-virtual {v0}, Ljava/util/Vector;->size()I

    move-result v0

    return v0
.end method

.method public toArray()[Lorg/snmp4j/smi/VariableBinding;
    .locals 2

    iget-object v0, p0, Lorg/snmp4j/PDU;->variableBindings:Ljava/util/Vector;

    invoke-virtual {v0}, Ljava/util/Vector;->size()I

    move-result v0

    new-array v0, v0, [Lorg/snmp4j/smi/VariableBinding;

    iget-object v1, p0, Lorg/snmp4j/PDU;->variableBindings:Ljava/util/Vector;

    invoke-virtual {v1, v0}, Ljava/util/Vector;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget v1, p0, Lorg/snmp4j/PDU;->type:I

    invoke-static {v1}, Lorg/snmp4j/PDU;->getTypeString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "[requestID="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lorg/snmp4j/PDU;->requestID:Lorg/snmp4j/smi/Integer32;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", errorStatus="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lorg/snmp4j/PDU;->getErrorStatusText()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lorg/snmp4j/PDU;->errorStatus:Lorg/snmp4j/smi/Integer32;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", errorIndex="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lorg/snmp4j/PDU;->errorIndex:Lorg/snmp4j/smi/Integer32;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", VBS["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v1, 0x0

    :cond_0
    :goto_0
    iget-object v2, p0, Lorg/snmp4j/PDU;->variableBindings:Ljava/util/Vector;

    invoke-virtual {v2}, Ljava/util/Vector;->size()I

    move-result v2

    if-ge v1, v2, :cond_1

    iget-object v2, p0, Lorg/snmp4j/PDU;->variableBindings:Ljava/util/Vector;

    invoke-virtual {v2, v1}, Ljava/util/Vector;->get(I)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    add-int/lit8 v1, v1, 0x1

    iget-object v2, p0, Lorg/snmp4j/PDU;->variableBindings:Ljava/util/Vector;

    invoke-virtual {v2}, Ljava/util/Vector;->size()I

    move-result v2

    if-ge v1, v2, :cond_0

    const-string v2, "; "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_1
    const-string v1, "]]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public trim()V
    .locals 2

    iget-object v0, p0, Lorg/snmp4j/PDU;->variableBindings:Ljava/util/Vector;

    invoke-virtual {v0}, Ljava/util/Vector;->size()I

    move-result v0

    if-lez v0, :cond_0

    iget-object v0, p0, Lorg/snmp4j/PDU;->variableBindings:Ljava/util/Vector;

    invoke-virtual {v0}, Ljava/util/Vector;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, Ljava/util/Vector;->remove(I)Ljava/lang/Object;

    :cond_0
    return-void
.end method
