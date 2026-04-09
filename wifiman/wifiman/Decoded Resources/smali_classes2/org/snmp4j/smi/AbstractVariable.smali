.class public abstract Lorg/snmp4j/smi/AbstractVariable;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/snmp4j/smi/Variable;
.implements Ljava/io/Serializable;


# static fields
.field public static final SMISYNTAXES_PROPERTIES:Ljava/lang/String; = "org.snmp4j.smisyntaxes"

.field private static final SMISYNTAXES_PROPERTIES_DEFAULT:Ljava/lang/String; = "smisyntaxes.properties"

.field private static final SYNTAX_NAME_MAPPING:[[Ljava/lang/Object;

.field private static final logger:Lorg/snmp4j/log/LogAdapter;

.field private static registeredSyntaxes:Ljava/util/Hashtable; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Hashtable<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Class<",
            "+",
            "Lorg/snmp4j/smi/Variable;",
            ">;>;"
        }
    .end annotation
.end field

.field private static final serialVersionUID:J = 0x135f05c4f032ae88L


# direct methods
.method static constructor <clinit>()V
    .locals 17

    const/4 v0, 0x2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const-string v1, "Integer32"

    filled-new-array {v1, v0}, [Ljava/lang/Object;

    move-result-object v2

    const/4 v0, 0x3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const-string v1, "BIT STRING"

    filled-new-array {v1, v0}, [Ljava/lang/Object;

    move-result-object v3

    const/4 v0, 0x4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const-string v1, "OCTET STRING"

    filled-new-array {v1, v0}, [Ljava/lang/Object;

    move-result-object v4

    const/4 v0, 0x6

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const-string v1, "OBJECT IDENTIFIER"

    filled-new-array {v1, v0}, [Ljava/lang/Object;

    move-result-object v5

    const/16 v0, 0x43

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const-string v1, "TimeTicks"

    filled-new-array {v1, v0}, [Ljava/lang/Object;

    move-result-object v6

    const/16 v0, 0x41

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const-string v1, "Counter"

    filled-new-array {v1, v0}, [Ljava/lang/Object;

    move-result-object v7

    const/16 v0, 0x46

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const-string v1, "Counter64"

    filled-new-array {v1, v0}, [Ljava/lang/Object;

    move-result-object v8

    const/16 v0, 0x82

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const-string v1, "EndOfMibView"

    filled-new-array {v1, v0}, [Ljava/lang/Object;

    move-result-object v9

    const/16 v0, 0x42

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const-string v1, "Gauge"

    filled-new-array {v1, v0}, [Ljava/lang/Object;

    move-result-object v10

    const-string v1, "Unsigned32"

    filled-new-array {v1, v0}, [Ljava/lang/Object;

    move-result-object v11

    const/16 v0, 0x40

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const-string v1, "IpAddress"

    filled-new-array {v1, v0}, [Ljava/lang/Object;

    move-result-object v12

    const/16 v0, 0x81

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const-string v1, "NoSuchInstance"

    filled-new-array {v1, v0}, [Ljava/lang/Object;

    move-result-object v13

    const/16 v0, 0x80

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const-string v1, "NoSuchObject"

    filled-new-array {v1, v0}, [Ljava/lang/Object;

    move-result-object v14

    const/4 v0, 0x5

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const-string v1, "Null"

    filled-new-array {v1, v0}, [Ljava/lang/Object;

    move-result-object v15

    const/16 v0, 0x44

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const-string v1, "Opaque"

    filled-new-array {v1, v0}, [Ljava/lang/Object;

    move-result-object v16

    filled-new-array/range {v2 .. v16}, [[Ljava/lang/Object;

    move-result-object v0

    sput-object v0, Lorg/snmp4j/smi/AbstractVariable;->SYNTAX_NAME_MAPPING:[[Ljava/lang/Object;

    const/4 v0, 0x0

    sput-object v0, Lorg/snmp4j/smi/AbstractVariable;->registeredSyntaxes:Ljava/util/Hashtable;

    const-class v0, Lorg/snmp4j/smi/AbstractVariable;

    invoke-static {v0}, Lorg/snmp4j/log/LogFactory;->getLogger(Ljava/lang/Class;)Lorg/snmp4j/log/LogAdapter;

    move-result-object v0

    sput-object v0, Lorg/snmp4j/smi/AbstractVariable;->logger:Lorg/snmp4j/log/LogAdapter;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static createFromBER(Lorg/snmp4j/asn1/BERInputStream;)Lorg/snmp4j/smi/Variable;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-virtual {p0}, Lorg/snmp4j/asn1/BERInputStream;->markSupported()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {}, Lorg/snmp4j/SNMP4JSettings;->isExtensibilityEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lorg/snmp4j/smi/AbstractVariable;->registeredSyntaxes:Ljava/util/Hashtable;

    if-nez v0, :cond_0

    invoke-static {}, Lorg/snmp4j/smi/AbstractVariable;->registerSyntaxes()V

    :cond_0
    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Lorg/snmp4j/asn1/BERInputStream;->mark(I)V

    invoke-virtual {p0}, Lorg/snmp4j/asn1/BERInputStream;->read()I

    move-result v0

    invoke-static {}, Lorg/snmp4j/SNMP4JSettings;->isExtensibilityEnabled()Z

    move-result v1

    if-eqz v1, :cond_2

    sget-object v1, Lorg/snmp4j/smi/AbstractVariable;->registeredSyntaxes:Ljava/util/Hashtable;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Class;

    if-eqz v1, :cond_1

    :try_start_0
    invoke-virtual {v1}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/snmp4j/smi/Variable;
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    new-instance p0, Ljava/io/IOException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Could not instantiate variable syntax class for: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    :catch_1
    new-instance p0, Ljava/io/IOException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Could not access variable syntax class for: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    new-instance p0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Encountered unsupported variable syntax: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {v0}, Lorg/snmp4j/smi/AbstractVariable;->createVariable(I)Lorg/snmp4j/smi/Variable;

    move-result-object v0

    :goto_0
    invoke-virtual {p0}, Lorg/snmp4j/asn1/BERInputStream;->reset()V

    invoke-interface {v0, p0}, Lorg/snmp4j/asn1/BERSerializable;->decodeBER(Lorg/snmp4j/asn1/BERInputStream;)V

    return-object v0

    :cond_3
    new-instance p0, Ljava/io/IOException;

    const-string v0, "InputStream for decoding a Variable must support marks"

    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static createFromSyntax(I)Lorg/snmp4j/smi/Variable;
    .locals 3

    invoke-static {}, Lorg/snmp4j/SNMP4JSettings;->isExtensibilityEnabled()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p0}, Lorg/snmp4j/smi/AbstractVariable;->createVariable(I)Lorg/snmp4j/smi/Variable;

    move-result-object p0

    return-object p0

    :cond_0
    sget-object v0, Lorg/snmp4j/smi/AbstractVariable;->registeredSyntaxes:Ljava/util/Hashtable;

    if-nez v0, :cond_1

    invoke-static {}, Lorg/snmp4j/smi/AbstractVariable;->registerSyntaxes()V

    :cond_1
    sget-object v0, Lorg/snmp4j/smi/AbstractVariable;->registeredSyntaxes:Ljava/util/Hashtable;

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Class;

    if-eqz v0, :cond_2

    :try_start_0
    invoke-virtual {v0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lorg/snmp4j/smi/Variable;
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    new-instance p0, Ljava/lang/RuntimeException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Could not instantiate variable syntax class for: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p0

    :catch_1
    new-instance p0, Ljava/lang/RuntimeException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Could not access variable syntax class for: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unsupported variable syntax: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private static createVariable(I)Lorg/snmp4j/smi/Variable;
    .locals 3

    const/4 v0, 0x2

    if-eq p0, v0, :cond_4

    const/16 v0, 0x46

    if-eq p0, v0, :cond_3

    const/4 v0, 0x4

    if-eq p0, v0, :cond_2

    const/4 v0, 0x5

    if-eq p0, v0, :cond_1

    const/4 v0, 0x6

    if-eq p0, v0, :cond_0

    packed-switch p0, :pswitch_data_0

    packed-switch p0, :pswitch_data_1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unsupported variable syntax: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    new-instance p0, Lorg/snmp4j/smi/Null;

    const/16 v0, 0x82

    invoke-direct {p0, v0}, Lorg/snmp4j/smi/Null;-><init>(I)V

    return-object p0

    :pswitch_1
    new-instance p0, Lorg/snmp4j/smi/Null;

    const/16 v0, 0x81

    invoke-direct {p0, v0}, Lorg/snmp4j/smi/Null;-><init>(I)V

    return-object p0

    :pswitch_2
    new-instance p0, Lorg/snmp4j/smi/Null;

    const/16 v0, 0x80

    invoke-direct {p0, v0}, Lorg/snmp4j/smi/Null;-><init>(I)V

    return-object p0

    :pswitch_3
    new-instance p0, Lorg/snmp4j/smi/Opaque;

    invoke-direct {p0}, Lorg/snmp4j/smi/Opaque;-><init>()V

    return-object p0

    :pswitch_4
    new-instance p0, Lorg/snmp4j/smi/TimeTicks;

    invoke-direct {p0}, Lorg/snmp4j/smi/TimeTicks;-><init>()V

    return-object p0

    :pswitch_5
    new-instance p0, Lorg/snmp4j/smi/Gauge32;

    invoke-direct {p0}, Lorg/snmp4j/smi/Gauge32;-><init>()V

    return-object p0

    :pswitch_6
    new-instance p0, Lorg/snmp4j/smi/Counter32;

    invoke-direct {p0}, Lorg/snmp4j/smi/Counter32;-><init>()V

    return-object p0

    :pswitch_7
    new-instance p0, Lorg/snmp4j/smi/IpAddress;

    invoke-direct {p0}, Lorg/snmp4j/smi/IpAddress;-><init>()V

    return-object p0

    :cond_0
    new-instance p0, Lorg/snmp4j/smi/OID;

    invoke-direct {p0}, Lorg/snmp4j/smi/OID;-><init>()V

    return-object p0

    :cond_1
    new-instance p0, Lorg/snmp4j/smi/Null;

    invoke-direct {p0}, Lorg/snmp4j/smi/Null;-><init>()V

    return-object p0

    :cond_2
    new-instance p0, Lorg/snmp4j/smi/OctetString;

    invoke-direct {p0}, Lorg/snmp4j/smi/OctetString;-><init>()V

    return-object p0

    :cond_3
    new-instance p0, Lorg/snmp4j/smi/Counter64;

    invoke-direct {p0}, Lorg/snmp4j/smi/Counter64;-><init>()V

    return-object p0

    :cond_4
    new-instance p0, Lorg/snmp4j/smi/Integer32;

    invoke-direct {p0}, Lorg/snmp4j/smi/Integer32;-><init>()V

    return-object p0

    nop

    :pswitch_data_0
    .packed-switch 0x40
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x80
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static equal(Lorg/snmp4j/smi/AbstractVariable;Lorg/snmp4j/smi/AbstractVariable;)Z
    .locals 0

    if-nez p0, :cond_1

    if-nez p1, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_0

    :cond_1
    invoke-virtual {p0, p1}, Lorg/snmp4j/smi/AbstractVariable;->equals(Ljava/lang/Object;)Z

    move-result p0

    :goto_0
    return p0
.end method

.method public static getSyntaxFromString(Ljava/lang/String;)I
    .locals 6

    sget-object v0, Lorg/snmp4j/smi/AbstractVariable;->SYNTAX_NAME_MAPPING:[[Ljava/lang/Object;

    array-length v1, v0

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_1

    aget-object v4, v0, v3

    aget-object v5, v4, v2

    invoke-virtual {v5, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    const/4 p0, 0x1

    aget-object p0, v4, p0

    check-cast p0, Ljava/lang/Integer;

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    return p0

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x5

    return p0
.end method

.method public static getSyntaxString(I)Ljava/lang/String;
    .locals 1

    const/4 v0, 0x2

    if-eq p0, v0, :cond_5

    const/4 v0, 0x3

    if-eq p0, v0, :cond_4

    const/4 v0, 0x4

    if-eq p0, v0, :cond_3

    const/4 v0, 0x5

    if-eq p0, v0, :cond_2

    const/4 v0, 0x6

    if-eq p0, v0, :cond_1

    const/16 v0, 0x46

    if-eq p0, v0, :cond_0

    packed-switch p0, :pswitch_data_0

    packed-switch p0, :pswitch_data_1

    .line 1
    const-string p0, "?"

    return-object p0

    .line 2
    :pswitch_0
    const-string p0, "EndOfMibView"

    return-object p0

    .line 3
    :pswitch_1
    const-string p0, "NoSuchInstance"

    return-object p0

    .line 4
    :pswitch_2
    const-string p0, "NoSuchObject"

    return-object p0

    .line 5
    :pswitch_3
    const-string p0, "Opaque"

    return-object p0

    .line 6
    :pswitch_4
    const-string p0, "TimeTicks"

    return-object p0

    .line 7
    :pswitch_5
    const-string p0, "Gauge"

    return-object p0

    .line 8
    :pswitch_6
    const-string p0, "Counter"

    return-object p0

    .line 9
    :pswitch_7
    const-string p0, "IpAddress"

    return-object p0

    .line 10
    :cond_0
    const-string p0, "Counter64"

    return-object p0

    .line 11
    :cond_1
    const-string p0, "OBJECT IDENTIFIER"

    return-object p0

    .line 12
    :cond_2
    const-string p0, "Null"

    return-object p0

    .line 13
    :cond_3
    const-string p0, "OCTET STRING"

    return-object p0

    .line 14
    :cond_4
    const-string p0, "BIT STRING"

    return-object p0

    .line 15
    :cond_5
    const-string p0, "Integer32"

    return-object p0

    :pswitch_data_0
    .packed-switch 0x40
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x80
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private static declared-synchronized registerSyntaxes()V
    .locals 9

    const-class v0, Lorg/snmp4j/smi/AbstractVariable;

    monitor-enter v0

    :try_start_0
    const-string v1, "org.snmp4j.smisyntaxes"

    const-string v2, "smisyntaxes.properties"

    invoke-static {v1, v2}, Ljava/lang/System;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-class v2, Lorg/snmp4j/smi/Variable;

    invoke-virtual {v2, v1}, Ljava/lang/Class;->getResourceAsStream(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v2

    if-eqz v2, :cond_1

    new-instance v3, Ljava/util/Properties;

    invoke-direct {v3}, Ljava/util/Properties;-><init>()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    invoke-virtual {v3, v2}, Ljava/util/Properties;->load(Ljava/io/InputStream;)V

    new-instance v4, Ljava/util/Hashtable;

    invoke-virtual {v3}, Ljava/util/Properties;->size()I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/Hashtable;-><init>(I)V

    invoke-virtual {v3}, Ljava/util/Properties;->propertyNames()Ljava/util/Enumeration;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v6

    if-eqz v6, :cond_0

    invoke-interface {v5}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3, v6}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-static {v7}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v7

    new-instance v8, Ljava/lang/Integer;

    invoke-direct {v8, v6}, Ljava/lang/Integer;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v8, v7}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catch Ljava/lang/ClassNotFoundException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/ClassCastException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_5

    :catch_0
    move-exception v3

    goto :goto_4

    :catch_1
    move-exception v6

    goto :goto_1

    :catch_2
    move-exception v6

    goto :goto_2

    :goto_1
    :try_start_3
    sget-object v7, Lorg/snmp4j/smi/AbstractVariable;->logger:Lorg/snmp4j/log/LogAdapter;

    invoke-interface {v7, v6}, Lorg/snmp4j/log/LogAdapter;->error(Ljava/io/Serializable;)V

    goto :goto_0

    :goto_2
    sget-object v7, Lorg/snmp4j/smi/AbstractVariable;->logger:Lorg/snmp4j/log/LogAdapter;

    invoke-interface {v7, v6}, Lorg/snmp4j/log/LogAdapter;->error(Ljava/io/Serializable;)V

    goto :goto_0

    :cond_0
    sput-object v4, Lorg/snmp4j/smi/AbstractVariable;->registeredSyntaxes:Ljava/util/Hashtable;
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception v1

    goto :goto_7

    :catch_3
    move-exception v1

    :try_start_5
    sget-object v2, Lorg/snmp4j/smi/AbstractVariable;->logger:Lorg/snmp4j/log/LogAdapter;

    invoke-interface {v2, v1}, Lorg/snmp4j/log/LogAdapter;->warn(Ljava/io/Serializable;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    :goto_3
    monitor-exit v0

    return-void

    :goto_4
    :try_start_6
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Could not read \'"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\': "

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    sget-object v3, Lorg/snmp4j/smi/AbstractVariable;->logger:Lorg/snmp4j/log/LogAdapter;

    invoke-interface {v3, v1}, Lorg/snmp4j/log/LogAdapter;->error(Ljava/io/Serializable;)V

    new-instance v3, Ljava/lang/InternalError;

    invoke-direct {v3, v1}, Ljava/lang/InternalError;-><init>(Ljava/lang/String;)V

    throw v3
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    :goto_5
    :try_start_7
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_4
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    goto :goto_6

    :catch_4
    move-exception v2

    :try_start_8
    sget-object v3, Lorg/snmp4j/smi/AbstractVariable;->logger:Lorg/snmp4j/log/LogAdapter;

    invoke-interface {v3, v2}, Lorg/snmp4j/log/LogAdapter;->warn(Ljava/io/Serializable;)V

    :goto_6
    throw v1

    :cond_1
    new-instance v2, Ljava/lang/InternalError;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Could not read \'"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\' from classpath!"

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Ljava/lang/InternalError;-><init>(Ljava/lang/String;)V

    throw v2

    :goto_7
    monitor-exit v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    throw v1
.end method


# virtual methods
.method public abstract clone()Ljava/lang/Object;
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Lorg/snmp4j/smi/Variable;

    invoke-virtual {p0, p1}, Lorg/snmp4j/smi/AbstractVariable;->compareTo(Lorg/snmp4j/smi/Variable;)I

    move-result p1

    return p1
.end method

.method public abstract compareTo(Lorg/snmp4j/smi/Variable;)I
.end method

.method public abstract decodeBER(Lorg/snmp4j/asn1/BERInputStream;)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public abstract encodeBER(Ljava/io/OutputStream;)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public abstract equals(Ljava/lang/Object;)Z
.end method

.method public abstract fromSubIndex(Lorg/snmp4j/smi/OID;Z)V
.end method

.method public abstract getBERLength()I
.end method

.method public getBERPayloadLength()I
    .locals 1

    invoke-virtual {p0}, Lorg/snmp4j/smi/AbstractVariable;->getBERLength()I

    move-result v0

    return v0
.end method

.method public abstract getSyntax()I
.end method

.method public final getSyntaxString()Ljava/lang/String;
    .locals 1

    .line 16
    invoke-virtual {p0}, Lorg/snmp4j/smi/AbstractVariable;->getSyntax()I

    move-result v0

    invoke-static {v0}, Lorg/snmp4j/smi/AbstractVariable;->getSyntaxString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public abstract hashCode()I
.end method

.method public isDynamic()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public isException()Z
    .locals 1

    invoke-virtual {p0}, Lorg/snmp4j/smi/AbstractVariable;->getSyntax()I

    move-result v0

    invoke-static {v0}, Lorg/snmp4j/smi/Null;->isExceptionSyntax(I)Z

    move-result v0

    return v0
.end method

.method public abstract toInt()I
.end method

.method public abstract toLong()J
.end method

.method public abstract toString()Ljava/lang/String;
.end method

.method public abstract toSubIndex(Z)Lorg/snmp4j/smi/OID;
.end method
