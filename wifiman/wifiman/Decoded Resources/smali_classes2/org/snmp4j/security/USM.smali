.class public Lorg/snmp4j/security/USM;
.super Lorg/snmp4j/security/SNMPv3SecurityModel;
.source "SourceFile"


# static fields
.field private static final MAXLEN_USMUSERNAME:I = 0x20

.field private static final logger:Lorg/snmp4j/log/LogAdapter;


# instance fields
.field private counterSupport:Lorg/snmp4j/mp/CounterSupport;

.field private engineDiscoveryEnabled:Z

.field private securityProtocols:Lorg/snmp4j/security/SecurityProtocols;

.field private timeTable:Lorg/snmp4j/security/UsmTimeTable;

.field private userTable:Lorg/snmp4j/security/UsmUserTable;

.field private transient usmUserListeners:Ljava/util/Vector;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Vector<",
            "Lorg/snmp4j/event/UsmUserListener;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lorg/snmp4j/security/USM;

    invoke-static {v0}, Lorg/snmp4j/log/LogFactory;->getLogger(Ljava/lang/Class;)Lorg/snmp4j/log/LogAdapter;

    move-result-object v0

    sput-object v0, Lorg/snmp4j/security/USM;->logger:Lorg/snmp4j/log/LogAdapter;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 8
    invoke-static {}, Lorg/snmp4j/security/SecurityProtocols;->getInstance()Lorg/snmp4j/security/SecurityProtocols;

    move-result-object v0

    invoke-virtual {v0}, Lorg/snmp4j/security/SecurityProtocols;->addDefaultProtocols()Lorg/snmp4j/security/SecurityProtocols;

    move-result-object v0

    new-instance v1, Lorg/snmp4j/smi/OctetString;

    .line 9
    invoke-static {}, Lorg/snmp4j/security/USM;->randomID()Lorg/snmp4j/smi/OctetString;

    move-result-object v2

    invoke-static {v2}, Lorg/snmp4j/mp/MPv3;->createLocalEngineID(Lorg/snmp4j/smi/OctetString;)[B

    move-result-object v2

    invoke-direct {v1, v2}, Lorg/snmp4j/smi/OctetString;-><init>([B)V

    const/4 v2, 0x0

    .line 10
    invoke-direct {p0, v0, v1, v2}, Lorg/snmp4j/security/USM;-><init>(Lorg/snmp4j/security/SecurityProtocols;Lorg/snmp4j/smi/OctetString;I)V

    return-void
.end method

.method public constructor <init>(Lorg/snmp4j/security/SecurityProtocols;Lorg/snmp4j/smi/OctetString;I)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lorg/snmp4j/security/SNMPv3SecurityModel;-><init>()V

    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lorg/snmp4j/security/USM;->engineDiscoveryEnabled:Z

    .line 3
    iput-object p2, p0, Lorg/snmp4j/security/SNMPv3SecurityModel;->localEngineID:Lorg/snmp4j/smi/OctetString;

    .line 4
    new-instance v0, Lorg/snmp4j/security/UsmTimeTable;

    invoke-direct {v0, p2, p3}, Lorg/snmp4j/security/UsmTimeTable;-><init>(Lorg/snmp4j/smi/OctetString;I)V

    iput-object v0, p0, Lorg/snmp4j/security/USM;->timeTable:Lorg/snmp4j/security/UsmTimeTable;

    .line 5
    new-instance p2, Lorg/snmp4j/security/UsmUserTable;

    invoke-direct {p2}, Lorg/snmp4j/security/UsmUserTable;-><init>()V

    iput-object p2, p0, Lorg/snmp4j/security/USM;->userTable:Lorg/snmp4j/security/UsmUserTable;

    .line 6
    iput-object p1, p0, Lorg/snmp4j/security/USM;->securityProtocols:Lorg/snmp4j/security/SecurityProtocols;

    .line 7
    invoke-static {}, Lorg/snmp4j/mp/CounterSupport;->getInstance()Lorg/snmp4j/mp/CounterSupport;

    move-result-object p1

    iput-object p1, p0, Lorg/snmp4j/security/USM;->counterSupport:Lorg/snmp4j/mp/CounterSupport;

    return-void
.end method

.method private getSecurityName(Lorg/snmp4j/smi/OctetString;Lorg/snmp4j/smi/OctetString;)Lorg/snmp4j/smi/OctetString;
    .locals 1

    invoke-virtual {p2}, Lorg/snmp4j/smi/OctetString;->length()I

    move-result v0

    if-nez v0, :cond_0

    return-object p2

    :cond_0
    iget-object v0, p0, Lorg/snmp4j/security/USM;->userTable:Lorg/snmp4j/security/UsmUserTable;

    invoke-virtual {v0, p1, p2}, Lorg/snmp4j/security/UsmUserTable;->getUser(Lorg/snmp4j/smi/OctetString;Lorg/snmp4j/smi/OctetString;)Lorg/snmp4j/security/UsmUserEntry;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lorg/snmp4j/security/UsmUserEntry;->getUsmUser()Lorg/snmp4j/security/UsmUser;

    move-result-object p1

    invoke-virtual {p1}, Lorg/snmp4j/security/UsmUser;->getSecurityName()Lorg/snmp4j/smi/OctetString;

    move-result-object p1

    return-object p1

    :cond_1
    invoke-virtual {p0}, Lorg/snmp4j/security/USM;->isEngineDiscoveryEnabled()Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Lorg/snmp4j/security/USM;->userTable:Lorg/snmp4j/security/UsmUserTable;

    invoke-virtual {p1, p2}, Lorg/snmp4j/security/UsmUserTable;->getUser(Lorg/snmp4j/smi/OctetString;)Lorg/snmp4j/security/UsmUserEntry;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lorg/snmp4j/security/UsmUserEntry;->getUsmUser()Lorg/snmp4j/security/UsmUser;

    move-result-object p1

    invoke-virtual {p1}, Lorg/snmp4j/security/UsmUser;->getSecurityName()Lorg/snmp4j/smi/OctetString;

    move-result-object p1

    return-object p1

    :cond_2
    const/4 p1, 0x0

    return-object p1
.end method

.method private static randomID()Lorg/snmp4j/smi/OctetString;
    .locals 2

    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    const/16 v1, 0x8

    new-array v1, v1, [B

    invoke-virtual {v0, v1}, Ljava/util/Random;->nextBytes([B)V

    new-instance v0, Lorg/snmp4j/smi/OctetString;

    invoke-direct {v0, v1}, Lorg/snmp4j/smi/OctetString;-><init>([B)V

    return-object v0
.end method


# virtual methods
.method public addLocalizedUser([BLorg/snmp4j/smi/OctetString;Lorg/snmp4j/smi/OID;[BLorg/snmp4j/smi/OID;[B)Lorg/snmp4j/security/UsmUserEntry;
    .locals 8

    new-instance v7, Lorg/snmp4j/security/UsmUserEntry;

    move-object v0, v7

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    invoke-direct/range {v0 .. v6}, Lorg/snmp4j/security/UsmUserEntry;-><init>([BLorg/snmp4j/smi/OctetString;Lorg/snmp4j/smi/OID;[BLorg/snmp4j/smi/OID;[B)V

    iget-object p1, p0, Lorg/snmp4j/security/USM;->userTable:Lorg/snmp4j/security/UsmUserTable;

    invoke-virtual {p1, v7}, Lorg/snmp4j/security/UsmUserTable;->addUser(Lorg/snmp4j/security/UsmUserEntry;)Lorg/snmp4j/security/UsmUserEntry;

    new-instance p1, Lorg/snmp4j/event/UsmUserEvent;

    const/4 p2, 0x1

    invoke-direct {p1, p0, v7, p2}, Lorg/snmp4j/event/UsmUserEvent;-><init>(Lorg/snmp4j/security/SecurityModel;Lorg/snmp4j/security/UsmUserEntry;I)V

    invoke-virtual {p0, p1}, Lorg/snmp4j/security/USM;->fireUsmUserChange(Lorg/snmp4j/event/UsmUserEvent;)V

    return-object v7
.end method

.method public addUser(Lorg/snmp4j/security/UsmUser;)V
    .locals 2

    .line 2
    invoke-virtual {p1}, Lorg/snmp4j/security/UsmUser;->getSecurityName()Lorg/snmp4j/smi/OctetString;

    move-result-object v0

    new-instance v1, Lorg/snmp4j/smi/OctetString;

    invoke-direct {v1}, Lorg/snmp4j/smi/OctetString;-><init>()V

    invoke-virtual {p0, v0, v1, p1}, Lorg/snmp4j/security/USM;->addUser(Lorg/snmp4j/smi/OctetString;Lorg/snmp4j/smi/OctetString;Lorg/snmp4j/security/UsmUser;)V

    return-void
.end method

.method public addUser(Lorg/snmp4j/smi/OctetString;Lorg/snmp4j/security/UsmUser;)V
    .locals 1

    .line 1
    new-instance v0, Lorg/snmp4j/smi/OctetString;

    invoke-direct {v0}, Lorg/snmp4j/smi/OctetString;-><init>()V

    invoke-virtual {p0, p1, v0, p2}, Lorg/snmp4j/security/USM;->addUser(Lorg/snmp4j/smi/OctetString;Lorg/snmp4j/smi/OctetString;Lorg/snmp4j/security/UsmUser;)V

    return-void
.end method

.method public addUser(Lorg/snmp4j/smi/OctetString;Lorg/snmp4j/smi/OctetString;Lorg/snmp4j/security/UsmUser;)V
    .locals 7

    .line 3
    invoke-virtual {p3}, Lorg/snmp4j/security/UsmUser;->getSecurityName()Lorg/snmp4j/smi/OctetString;

    move-result-object v0

    invoke-virtual {v0}, Lorg/snmp4j/smi/OctetString;->length()I

    move-result v0

    const-string v1, "User \'"

    const/16 v2, 0x20

    if-gt v0, v2, :cond_7

    const/4 v0, 0x0

    if-eqz p2, :cond_4

    .line 4
    invoke-virtual {p2}, Lorg/snmp4j/smi/OctetString;->length()I

    move-result v3

    if-lez v3, :cond_4

    .line 5
    invoke-virtual {p2}, Lorg/snmp4j/smi/OctetString;->length()I

    move-result v3

    const/4 v4, 0x5

    if-lt v3, v4, :cond_3

    invoke-virtual {p2}, Lorg/snmp4j/smi/OctetString;->length()I

    move-result v3

    if-gt v3, v2, :cond_3

    .line 6
    invoke-virtual {p3}, Lorg/snmp4j/security/UsmUser;->getAuthenticationProtocol()Lorg/snmp4j/smi/OID;

    move-result-object v1

    if-eqz v1, :cond_4

    .line 7
    invoke-virtual {p3}, Lorg/snmp4j/security/UsmUser;->isLocalized()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 8
    invoke-virtual {p3}, Lorg/snmp4j/security/UsmUser;->getAuthenticationPassphrase()Lorg/snmp4j/smi/OctetString;

    move-result-object v1

    invoke-virtual {v1}, Lorg/snmp4j/smi/OctetString;->getValue()[B

    move-result-object v1

    goto :goto_0

    .line 9
    :cond_0
    iget-object v1, p0, Lorg/snmp4j/security/USM;->securityProtocols:Lorg/snmp4j/security/SecurityProtocols;

    .line 10
    invoke-virtual {p3}, Lorg/snmp4j/security/UsmUser;->getAuthenticationProtocol()Lorg/snmp4j/smi/OID;

    move-result-object v2

    .line 11
    invoke-virtual {p3}, Lorg/snmp4j/security/UsmUser;->getAuthenticationPassphrase()Lorg/snmp4j/smi/OctetString;

    move-result-object v3

    .line 12
    invoke-virtual {p2}, Lorg/snmp4j/smi/OctetString;->getValue()[B

    move-result-object v4

    .line 13
    invoke-virtual {v1, v2, v3, v4}, Lorg/snmp4j/security/SecurityProtocols;->passwordToKey(Lorg/snmp4j/smi/OID;Lorg/snmp4j/smi/OctetString;[B)[B

    move-result-object v1

    .line 14
    :goto_0
    invoke-virtual {p3}, Lorg/snmp4j/security/UsmUser;->getPrivacyProtocol()Lorg/snmp4j/smi/OID;

    move-result-object v2

    if-eqz v2, :cond_1

    .line 15
    invoke-virtual {p3}, Lorg/snmp4j/security/UsmUser;->isLocalized()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 16
    invoke-virtual {p3}, Lorg/snmp4j/security/UsmUser;->getPrivacyPassphrase()Lorg/snmp4j/smi/OctetString;

    move-result-object v0

    invoke-virtual {v0}, Lorg/snmp4j/smi/OctetString;->getValue()[B

    move-result-object v0

    :cond_1
    :goto_1
    move-object v6, v1

    move-object v1, v0

    move-object v0, v6

    goto :goto_2

    .line 17
    :cond_2
    iget-object v0, p0, Lorg/snmp4j/security/USM;->securityProtocols:Lorg/snmp4j/security/SecurityProtocols;

    .line 18
    invoke-virtual {p3}, Lorg/snmp4j/security/UsmUser;->getPrivacyProtocol()Lorg/snmp4j/smi/OID;

    move-result-object v2

    .line 19
    invoke-virtual {p3}, Lorg/snmp4j/security/UsmUser;->getAuthenticationProtocol()Lorg/snmp4j/smi/OID;

    move-result-object v3

    .line 20
    invoke-virtual {p3}, Lorg/snmp4j/security/UsmUser;->getPrivacyPassphrase()Lorg/snmp4j/smi/OctetString;

    move-result-object v4

    .line 21
    invoke-virtual {p2}, Lorg/snmp4j/smi/OctetString;->getValue()[B

    move-result-object v5

    .line 22
    invoke-virtual {v0, v2, v3, v4, v5}, Lorg/snmp4j/security/SecurityProtocols;->passwordToKey(Lorg/snmp4j/smi/OID;Lorg/snmp4j/smi/OID;Lorg/snmp4j/smi/OctetString;[B)[B

    move-result-object v0

    goto :goto_1

    .line 23
    :cond_3
    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, "\' not added because of an engine ID of incorrect length "

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    invoke-virtual {p2}, Lorg/snmp4j/smi/OctetString;->length()I

    move-result p1

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 25
    sget-object p2, Lorg/snmp4j/security/USM;->logger:Lorg/snmp4j/log/LogAdapter;

    invoke-interface {p2, p1}, Lorg/snmp4j/log/LogAdapter;->warn(Ljava/io/Serializable;)V

    .line 26
    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_4
    move-object v1, v0

    .line 27
    :goto_2
    invoke-virtual {p3}, Lorg/snmp4j/security/UsmUser;->isLocalized()Z

    move-result v2

    if-eqz v2, :cond_5

    .line 28
    invoke-virtual {p3}, Lorg/snmp4j/security/UsmUser;->getLocalizationEngineID()Lorg/snmp4j/smi/OctetString;

    move-result-object p2

    goto :goto_3

    :cond_5
    if-nez p2, :cond_6

    .line 29
    new-instance p2, Lorg/snmp4j/smi/OctetString;

    invoke-direct {p2}, Lorg/snmp4j/smi/OctetString;-><init>()V

    .line 30
    :cond_6
    :goto_3
    new-instance v2, Lorg/snmp4j/security/UsmUserEntry;

    invoke-direct {v2, p1, p2, p3}, Lorg/snmp4j/security/UsmUserEntry;-><init>(Lorg/snmp4j/smi/OctetString;Lorg/snmp4j/smi/OctetString;Lorg/snmp4j/security/UsmUser;)V

    .line 31
    invoke-virtual {v2, v0}, Lorg/snmp4j/security/UsmUserEntry;->setAuthenticationKey([B)V

    .line 32
    invoke-virtual {v2, v1}, Lorg/snmp4j/security/UsmUserEntry;->setPrivacyKey([B)V

    .line 33
    invoke-virtual {p0, v2}, Lorg/snmp4j/security/USM;->addUsmUserEntry(Lorg/snmp4j/security/UsmUserEntry;)V

    return-void

    .line 34
    :cond_7
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Lorg/snmp4j/security/UsmUser;->getSecurityName()Lorg/snmp4j/smi/OctetString;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, "\' not added because of its too long security name with length "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    invoke-virtual {p3}, Lorg/snmp4j/security/UsmUser;->getSecurityName()Lorg/snmp4j/smi/OctetString;

    move-result-object p2

    invoke-virtual {p2}, Lorg/snmp4j/smi/OctetString;->length()I

    move-result p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 36
    sget-object p2, Lorg/snmp4j/security/USM;->logger:Lorg/snmp4j/log/LogAdapter;

    invoke-interface {p2, p1}, Lorg/snmp4j/log/LogAdapter;->warn(Ljava/io/Serializable;)V

    .line 37
    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public addUsmUserEntry(Lorg/snmp4j/security/UsmUserEntry;)V
    .locals 2

    iget-object v0, p0, Lorg/snmp4j/security/USM;->userTable:Lorg/snmp4j/security/UsmUserTable;

    invoke-virtual {v0, p1}, Lorg/snmp4j/security/UsmUserTable;->addUser(Lorg/snmp4j/security/UsmUserEntry;)Lorg/snmp4j/security/UsmUserEntry;

    new-instance v0, Lorg/snmp4j/event/UsmUserEvent;

    const/4 v1, 0x1

    invoke-direct {v0, p0, p1, v1}, Lorg/snmp4j/event/UsmUserEvent;-><init>(Lorg/snmp4j/security/SecurityModel;Lorg/snmp4j/security/UsmUserEntry;I)V

    invoke-virtual {p0, v0}, Lorg/snmp4j/security/USM;->fireUsmUserChange(Lorg/snmp4j/event/UsmUserEvent;)V

    return-void
.end method

.method public declared-synchronized addUsmUserListener(Lorg/snmp4j/event/UsmUserListener;)V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lorg/snmp4j/security/USM;->usmUserListeners:Ljava/util/Vector;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/Vector;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Ljava/util/Vector;-><init>(I)V

    iput-object v0, p0, Lorg/snmp4j/security/USM;->usmUserListeners:Ljava/util/Vector;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    iget-object v0, p0, Lorg/snmp4j/security/USM;->usmUserListeners:Ljava/util/Vector;

    invoke-virtual {v0, p1}, Ljava/util/Vector;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lorg/snmp4j/security/USM;->usmUserListeners:Ljava/util/Vector;

    invoke-virtual {v0, p1}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    monitor-exit p0

    return-void

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method protected fireIncrementCounter(Lorg/snmp4j/event/CounterEvent;)V
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/security/USM;->counterSupport:Lorg/snmp4j/mp/CounterSupport;

    invoke-virtual {v0, p1}, Lorg/snmp4j/mp/CounterSupport;->fireIncrementCounter(Lorg/snmp4j/event/CounterEvent;)V

    return-void
.end method

.method protected fireUsmUserChange(Lorg/snmp4j/event/UsmUserEvent;)V
    .locals 2

    iget-object v0, p0, Lorg/snmp4j/security/USM;->usmUserListeners:Ljava/util/Vector;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/util/Vector;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/snmp4j/event/UsmUserListener;

    invoke-interface {v1, p1}, Lorg/snmp4j/event/UsmUserListener;->usmUserChange(Lorg/snmp4j/event/UsmUserEvent;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public generateRequestMessage(I[BII[B[BILorg/snmp4j/asn1/BERInputStream;Lorg/snmp4j/security/SecurityParameters;Lorg/snmp4j/asn1/BEROutputStream;Lorg/snmp4j/TransportStateReference;)I
    .locals 12
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v9, 0x0

    move-object v0, p0

    move v1, p1

    move-object v2, p2

    move v3, p3

    move/from16 v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move/from16 v7, p7

    move-object/from16 v8, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    invoke-virtual/range {v0 .. v11}, Lorg/snmp4j/security/USM;->generateResponseMessage(I[BII[B[BILorg/snmp4j/asn1/BERInputStream;Lorg/snmp4j/security/SecurityStateReference;Lorg/snmp4j/security/SecurityParameters;Lorg/snmp4j/asn1/BEROutputStream;)I

    move-result v0

    return v0
.end method

.method public generateResponseMessage(I[BII[B[BILorg/snmp4j/asn1/BERInputStream;Lorg/snmp4j/security/SecurityStateReference;Lorg/snmp4j/security/SecurityParameters;Lorg/snmp4j/asn1/BEROutputStream;)I
    .locals 18
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    move-object/from16 v0, p0

    move/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p5

    move-object/from16 v4, p6

    move/from16 v5, p7

    move-object/from16 v6, p10

    check-cast v6, Lorg/snmp4j/security/UsmSecurityParameters;

    const/16 v7, 0x20

    if-eqz p9, :cond_3

    move-object/from16 v8, p9

    check-cast v8, Lorg/snmp4j/security/UsmSecurityStateReference;

    invoke-virtual {v8}, Lorg/snmp4j/security/UsmSecurityStateReference;->getSecurityEngineID()[B

    move-result-object v9

    if-nez v9, :cond_0

    invoke-virtual {v6, v3}, Lorg/snmp4j/security/UsmSecurityParameters;->setAuthoritativeEngineID([B)V

    invoke-virtual {v8, v3}, Lorg/snmp4j/security/UsmSecurityStateReference;->setSecurityEngineID([B)V

    :cond_0
    invoke-virtual {v8}, Lorg/snmp4j/security/UsmSecurityStateReference;->getSecurityName()[B

    move-result-object v9

    if-nez v9, :cond_1

    new-instance v9, Lorg/snmp4j/smi/OctetString;

    invoke-direct {v9, v4}, Lorg/snmp4j/smi/OctetString;-><init>([B)V

    invoke-virtual {v9}, Lorg/snmp4j/smi/OctetString;->getValue()[B

    move-result-object v10

    invoke-virtual {v8, v10}, Lorg/snmp4j/security/UsmSecurityStateReference;->setSecurityName([B)V

    invoke-virtual {v6, v9}, Lorg/snmp4j/security/UsmSecurityParameters;->setUserName(Lorg/snmp4j/smi/OctetString;)V

    new-instance v10, Lorg/snmp4j/smi/OctetString;

    invoke-direct {v10, v3}, Lorg/snmp4j/smi/OctetString;-><init>([B)V

    invoke-direct {v0, v10, v9}, Lorg/snmp4j/security/USM;->getSecurityName(Lorg/snmp4j/smi/OctetString;Lorg/snmp4j/smi/OctetString;)Lorg/snmp4j/smi/OctetString;

    move-result-object v9

    if-eqz v9, :cond_2

    invoke-virtual {v9}, Lorg/snmp4j/smi/OctetString;->length()I

    move-result v10

    if-gt v10, v7, :cond_2

    invoke-virtual {v6, v9}, Lorg/snmp4j/security/UsmSecurityParameters;->setUserName(Lorg/snmp4j/smi/OctetString;)V

    goto :goto_0

    :cond_1
    new-instance v9, Lorg/snmp4j/smi/OctetString;

    invoke-virtual {v8}, Lorg/snmp4j/security/UsmSecurityStateReference;->getSecurityName()[B

    move-result-object v10

    invoke-direct {v9, v10}, Lorg/snmp4j/smi/OctetString;-><init>([B)V

    invoke-virtual {v6, v9}, Lorg/snmp4j/security/UsmSecurityParameters;->setUserName(Lorg/snmp4j/smi/OctetString;)V

    :cond_2
    :goto_0
    invoke-virtual {v8}, Lorg/snmp4j/security/UsmSecurityStateReference;->getAuthenticationProtocol()Lorg/snmp4j/security/AuthenticationProtocol;

    move-result-object v9

    invoke-virtual {v6, v9}, Lorg/snmp4j/security/UsmSecurityParameters;->setAuthenticationProtocol(Lorg/snmp4j/security/AuthenticationProtocol;)V

    invoke-virtual {v8}, Lorg/snmp4j/security/UsmSecurityStateReference;->getPrivacyProtocol()Lorg/snmp4j/security/PrivacyProtocol;

    move-result-object v9

    invoke-virtual {v6, v9}, Lorg/snmp4j/security/UsmSecurityParameters;->setPrivacyProtocol(Lorg/snmp4j/security/PrivacyProtocol;)V

    invoke-virtual {v8}, Lorg/snmp4j/security/UsmSecurityStateReference;->getAuthenticationKey()[B

    move-result-object v9

    invoke-virtual {v6, v9}, Lorg/snmp4j/security/UsmSecurityParameters;->setAuthenticationKey([B)V

    invoke-virtual {v8}, Lorg/snmp4j/security/UsmSecurityStateReference;->getPrivacyKey()[B

    move-result-object v8

    invoke-virtual {v6, v8}, Lorg/snmp4j/security/UsmSecurityParameters;->setPrivacyKey([B)V

    goto/16 :goto_2

    :cond_3
    new-instance v8, Lorg/snmp4j/smi/OctetString;

    invoke-direct {v8}, Lorg/snmp4j/smi/OctetString;-><init>()V

    if-eqz v3, :cond_4

    invoke-virtual {v8, v3}, Lorg/snmp4j/smi/OctetString;->setValue([B)V

    :cond_4
    new-instance v9, Lorg/snmp4j/smi/OctetString;

    invoke-direct {v9, v4}, Lorg/snmp4j/smi/OctetString;-><init>([B)V

    invoke-virtual {v8}, Lorg/snmp4j/smi/OctetString;->length()I

    move-result v10

    if-nez v10, :cond_7

    invoke-virtual/range {p0 .. p0}, Lorg/snmp4j/security/USM;->isEngineDiscoveryEnabled()Z

    move-result v10

    if-eqz v10, :cond_5

    const/4 v10, 0x0

    invoke-virtual {v0, v10, v9}, Lorg/snmp4j/security/USM;->hasUser(Lorg/snmp4j/smi/OctetString;Lorg/snmp4j/smi/OctetString;)Z

    move-result v11

    if-eqz v11, :cond_8

    new-instance v10, Lorg/snmp4j/security/UsmUserEntry;

    invoke-direct {v10}, Lorg/snmp4j/security/UsmUserEntry;-><init>()V

    goto :goto_1

    :cond_5
    sget-object v1, Lorg/snmp4j/security/USM;->logger:Lorg/snmp4j/log/LogAdapter;

    invoke-interface {v1}, Lorg/snmp4j/log/LogAdapter;->isDebugEnabled()Z

    move-result v2

    if-eqz v2, :cond_6

    const-string v2, "Engine ID unknown and discovery disabled"

    invoke-interface {v1, v2}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    :cond_6
    const/16 v1, 0x582

    return v1

    :cond_7
    invoke-virtual {v0, v8, v9}, Lorg/snmp4j/security/USM;->getUser(Lorg/snmp4j/smi/OctetString;Lorg/snmp4j/smi/OctetString;)Lorg/snmp4j/security/UsmUserEntry;

    move-result-object v10

    :cond_8
    :goto_1
    if-nez v10, :cond_a

    sget-object v1, Lorg/snmp4j/security/USM;->logger:Lorg/snmp4j/log/LogAdapter;

    invoke-interface {v1}, Lorg/snmp4j/log/LogAdapter;->isDebugEnabled()Z

    move-result v2

    if-eqz v2, :cond_9

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Security name not found for engineID="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Lorg/snmp4j/smi/OctetString;->toHexString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ", securityName="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Lorg/snmp4j/smi/OctetString;->toHexString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    :cond_9
    const/16 v1, 0x57c

    return v1

    :cond_a
    iget-object v9, v0, Lorg/snmp4j/security/USM;->securityProtocols:Lorg/snmp4j/security/SecurityProtocols;

    invoke-virtual {v10}, Lorg/snmp4j/security/UsmUserEntry;->getUsmUser()Lorg/snmp4j/security/UsmUser;

    move-result-object v11

    invoke-virtual {v11}, Lorg/snmp4j/security/UsmUser;->getAuthenticationProtocol()Lorg/snmp4j/smi/OID;

    move-result-object v11

    invoke-virtual {v9, v11}, Lorg/snmp4j/security/SecurityProtocols;->getAuthenticationProtocol(Lorg/snmp4j/smi/OID;)Lorg/snmp4j/security/AuthenticationProtocol;

    move-result-object v9

    iget-object v11, v0, Lorg/snmp4j/security/USM;->securityProtocols:Lorg/snmp4j/security/SecurityProtocols;

    invoke-virtual {v10}, Lorg/snmp4j/security/UsmUserEntry;->getUsmUser()Lorg/snmp4j/security/UsmUser;

    move-result-object v12

    invoke-virtual {v12}, Lorg/snmp4j/security/UsmUser;->getPrivacyProtocol()Lorg/snmp4j/smi/OID;

    move-result-object v12

    invoke-virtual {v11, v12}, Lorg/snmp4j/security/SecurityProtocols;->getPrivacyProtocol(Lorg/snmp4j/smi/OID;)Lorg/snmp4j/security/PrivacyProtocol;

    move-result-object v11

    invoke-virtual {v6, v9}, Lorg/snmp4j/security/UsmSecurityParameters;->setAuthenticationProtocol(Lorg/snmp4j/security/AuthenticationProtocol;)V

    invoke-virtual {v6, v11}, Lorg/snmp4j/security/UsmSecurityParameters;->setPrivacyProtocol(Lorg/snmp4j/security/PrivacyProtocol;)V

    invoke-virtual {v10}, Lorg/snmp4j/security/UsmUserEntry;->getAuthenticationKey()[B

    move-result-object v9

    invoke-virtual {v6, v9}, Lorg/snmp4j/security/UsmSecurityParameters;->setAuthenticationKey([B)V

    invoke-virtual {v10}, Lorg/snmp4j/security/UsmUserEntry;->getPrivacyKey()[B

    move-result-object v9

    invoke-virtual {v6, v9}, Lorg/snmp4j/security/UsmSecurityParameters;->setPrivacyKey([B)V

    invoke-virtual {v10}, Lorg/snmp4j/security/UsmUserEntry;->getUsmUser()Lorg/snmp4j/security/UsmUser;

    move-result-object v9

    invoke-virtual {v9}, Lorg/snmp4j/security/UsmUser;->getSecurityName()Lorg/snmp4j/smi/OctetString;

    move-result-object v9

    invoke-virtual {v6, v9}, Lorg/snmp4j/security/UsmSecurityParameters;->setUserName(Lorg/snmp4j/smi/OctetString;)V

    invoke-virtual {v8}, Lorg/snmp4j/smi/OctetString;->getValue()[B

    move-result-object v8

    invoke-virtual {v6, v8}, Lorg/snmp4j/security/UsmSecurityParameters;->setAuthoritativeEngineID([B)V

    :goto_2
    invoke-virtual {v6}, Lorg/snmp4j/security/UsmSecurityParameters;->getAuthoritativeEngineID()[B

    move-result-object v8

    array-length v8, v8

    const-string v9, " for "

    const-string v10, ">"

    if-le v8, v7, :cond_b

    sget-object v1, Lorg/snmp4j/security/USM;->logger:Lorg/snmp4j/log/LogAdapter;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Engine ID too long: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Lorg/snmp4j/security/UsmSecurityParameters;->getAuthoritativeEngineID()[B

    move-result-object v3

    array-length v3, v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v3, Lorg/snmp4j/smi/OctetString;

    invoke-virtual {v6}, Lorg/snmp4j/security/UsmSecurityParameters;->getAuthoritativeEngineID()[B

    move-result-object v4

    invoke-direct {v3, v4}, Lorg/snmp4j/smi/OctetString;-><init>([B)V

    invoke-virtual {v3}, Lorg/snmp4j/smi/OctetString;->toHexString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Lorg/snmp4j/log/LogAdapter;->error(Ljava/io/Serializable;)V

    const/16 v1, 0x587

    return v1

    :cond_b
    array-length v8, v4

    if-le v8, v7, :cond_c

    sget-object v1, Lorg/snmp4j/security/USM;->logger:Lorg/snmp4j/log/LogAdapter;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Security name too long: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Lorg/snmp4j/security/UsmSecurityParameters;->getAuthoritativeEngineID()[B

    move-result-object v3

    array-length v3, v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v3, Lorg/snmp4j/smi/OctetString;

    invoke-direct {v3, v4}, Lorg/snmp4j/smi/OctetString;-><init>([B)V

    invoke-virtual {v3}, Lorg/snmp4j/smi/OctetString;->toHexString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Lorg/snmp4j/log/LogAdapter;->error(Ljava/io/Serializable;)V

    const/16 v1, 0x588

    return v1

    :cond_c
    const/4 v4, 0x2

    if-lt v5, v4, :cond_f

    if-eqz p9, :cond_d

    invoke-virtual/range {p0 .. p0}, Lorg/snmp4j/security/USM;->getEngineBoots()I

    move-result v3

    invoke-virtual {v6, v3}, Lorg/snmp4j/security/UsmSecurityParameters;->setAuthoritativeEngineBoots(I)V

    invoke-virtual/range {p0 .. p0}, Lorg/snmp4j/security/USM;->getEngineTime()I

    move-result v3

    invoke-virtual {v6, v3}, Lorg/snmp4j/security/UsmSecurityParameters;->setAuthoritativeEngineTime(I)V

    goto :goto_3

    :cond_d
    new-instance v7, Lorg/snmp4j/smi/OctetString;

    invoke-direct {v7, v3}, Lorg/snmp4j/smi/OctetString;-><init>([B)V

    iget-object v3, v0, Lorg/snmp4j/security/USM;->timeTable:Lorg/snmp4j/security/UsmTimeTable;

    invoke-virtual {v3, v7}, Lorg/snmp4j/security/UsmTimeTable;->getTime(Lorg/snmp4j/smi/OctetString;)Lorg/snmp4j/security/UsmTimeEntry;

    move-result-object v3

    if-nez v3, :cond_e

    new-instance v3, Lorg/snmp4j/security/UsmTimeEntry;

    invoke-virtual {v6}, Lorg/snmp4j/security/UsmSecurityParameters;->getAuthoritativeEngineBoots()I

    move-result v8

    invoke-virtual {v6}, Lorg/snmp4j/security/UsmSecurityParameters;->getAuthoritativeEngineTime()I

    move-result v9

    invoke-direct {v3, v7, v8, v9}, Lorg/snmp4j/security/UsmTimeEntry;-><init>(Lorg/snmp4j/smi/OctetString;II)V

    iget-object v7, v0, Lorg/snmp4j/security/USM;->timeTable:Lorg/snmp4j/security/UsmTimeTable;

    invoke-virtual {v7, v3}, Lorg/snmp4j/security/UsmTimeTable;->addEntry(Lorg/snmp4j/security/UsmTimeEntry;)V

    goto :goto_3

    :cond_e
    invoke-virtual {v3}, Lorg/snmp4j/security/UsmTimeEntry;->getEngineBoots()I

    move-result v7

    invoke-virtual {v6, v7}, Lorg/snmp4j/security/UsmSecurityParameters;->setAuthoritativeEngineBoots(I)V

    invoke-virtual {v3}, Lorg/snmp4j/security/UsmTimeEntry;->getLatestReceivedTime()I

    move-result v3

    invoke-virtual {v6, v3}, Lorg/snmp4j/security/UsmSecurityParameters;->setAuthoritativeEngineTime(I)V

    :cond_f
    :goto_3
    const/16 v3, 0x57b

    if-lt v5, v4, :cond_10

    invoke-virtual {v6}, Lorg/snmp4j/security/UsmSecurityParameters;->getAuthenticationProtocol()Lorg/snmp4j/security/AuthenticationProtocol;

    move-result-object v7

    if-nez v7, :cond_10

    return v3

    :cond_10
    invoke-static/range {p8 .. p8}, Lorg/snmp4j/security/SNMPv3SecurityModel;->buildMessageBuffer(Lorg/snmp4j/asn1/BERInputStream;)[B

    move-result-object v9

    const/4 v7, 0x3

    if-ne v5, v7, :cond_15

    invoke-virtual {v6}, Lorg/snmp4j/security/UsmSecurityParameters;->getPrivacyProtocol()Lorg/snmp4j/security/PrivacyProtocol;

    move-result-object v7

    if-nez v7, :cond_12

    sget-object v1, Lorg/snmp4j/security/USM;->logger:Lorg/snmp4j/log/LogAdapter;

    invoke-interface {v1}, Lorg/snmp4j/log/LogAdapter;->isDebugEnabled()Z

    move-result v2

    if-eqz v2, :cond_11

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Unsupported security level (missing or unsupported privacy protocol): Security params are "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    :cond_11
    return v3

    :cond_12
    sget-object v3, Lorg/snmp4j/security/USM;->logger:Lorg/snmp4j/log/LogAdapter;

    const-string v7, "RFC3414 \u00a73.1.4.a Outgoing message needs to be encrypted"

    invoke-interface {v3, v7}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    new-instance v7, Lorg/snmp4j/security/DecryptParams;

    invoke-direct {v7}, Lorg/snmp4j/security/DecryptParams;-><init>()V

    invoke-virtual {v6}, Lorg/snmp4j/security/UsmSecurityParameters;->getPrivacyProtocol()Lorg/snmp4j/security/PrivacyProtocol;

    move-result-object v8

    array-length v11, v9

    invoke-virtual {v6}, Lorg/snmp4j/security/UsmSecurityParameters;->getPrivacyKey()[B

    move-result-object v12

    invoke-virtual {v6}, Lorg/snmp4j/security/UsmSecurityParameters;->getAuthoritativeEngineBoots()I

    move-result v10

    int-to-long v13, v10

    invoke-virtual {v6}, Lorg/snmp4j/security/UsmSecurityParameters;->getAuthoritativeEngineTime()I

    move-result v10

    int-to-long v4, v10

    const/4 v10, 0x0

    move-wide v15, v4

    move-object/from16 v17, v7

    invoke-interface/range {v8 .. v17}, Lorg/snmp4j/security/PrivacyProtocol;->encrypt([BII[BJJLorg/snmp4j/security/DecryptParams;)[B

    move-result-object v4

    if-nez v4, :cond_14

    invoke-interface {v3}, Lorg/snmp4j/log/LogAdapter;->isDebugEnabled()Z

    move-result v1

    if-eqz v1, :cond_13

    const-string v1, "Encryption error"

    invoke-interface {v3, v1}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    :cond_13
    const/16 v1, 0x57d

    return v1

    :cond_14
    new-instance v3, Lorg/snmp4j/smi/OctetString;

    iget-object v5, v7, Lorg/snmp4j/security/DecryptParams;->array:[B

    invoke-direct {v3, v5}, Lorg/snmp4j/smi/OctetString;-><init>([B)V

    invoke-virtual {v6, v3}, Lorg/snmp4j/security/UsmSecurityParameters;->setPrivacyParameters(Lorg/snmp4j/smi/OctetString;)V

    new-instance v3, Lorg/snmp4j/smi/OctetString;

    invoke-direct {v3, v4}, Lorg/snmp4j/smi/OctetString;-><init>([B)V

    new-instance v4, Lorg/snmp4j/asn1/BEROutputStream;

    invoke-virtual {v3}, Lorg/snmp4j/smi/OctetString;->getBERLength()I

    move-result v5

    invoke-static {v5}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v5

    invoke-direct {v4, v5}, Lorg/snmp4j/asn1/BEROutputStream;-><init>(Ljava/nio/ByteBuffer;)V

    invoke-virtual {v3, v4}, Lorg/snmp4j/smi/OctetString;->encodeBER(Ljava/io/OutputStream;)V

    invoke-virtual {v4}, Lorg/snmp4j/asn1/BEROutputStream;->getBuffer()Ljava/nio/ByteBuffer;

    move-result-object v3

    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v9

    goto :goto_4

    :cond_15
    sget-object v3, Lorg/snmp4j/security/USM;->logger:Lorg/snmp4j/log/LogAdapter;

    const-string v4, "RFC3414 \u00a73.1.4.b Outgoing message is not encrypted"

    invoke-interface {v3, v4}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    new-instance v3, Lorg/snmp4j/smi/OctetString;

    invoke-direct {v3}, Lorg/snmp4j/smi/OctetString;-><init>()V

    invoke-virtual {v6, v3}, Lorg/snmp4j/security/UsmSecurityParameters;->setPrivacyParameters(Lorg/snmp4j/smi/OctetString;)V

    :goto_4
    const/4 v3, 0x0

    move/from16 v4, p7

    const/4 v5, 0x2

    if-lt v4, v5, :cond_17

    invoke-virtual {v6}, Lorg/snmp4j/security/UsmSecurityParameters;->getAuthenticationProtocol()Lorg/snmp4j/security/AuthenticationProtocol;

    move-result-object v4

    invoke-interface {v4}, Lorg/snmp4j/security/AuthenticationProtocol;->getAuthenticationCodeLength()I

    move-result v5

    new-array v5, v5, [B

    new-instance v7, Lorg/snmp4j/smi/OctetString;

    invoke-direct {v7, v5}, Lorg/snmp4j/smi/OctetString;-><init>([B)V

    invoke-virtual {v6, v7}, Lorg/snmp4j/security/UsmSecurityParameters;->setAuthenticationParameters(Lorg/snmp4j/smi/OctetString;)V

    new-instance v5, Lorg/snmp4j/smi/Integer32;

    invoke-direct {v5, v1}, Lorg/snmp4j/smi/Integer32;-><init>(I)V

    invoke-static {v5, v9, v2, v6}, Lorg/snmp4j/security/SNMPv3SecurityModel;->buildWholeMessage(Lorg/snmp4j/smi/Integer32;[B[BLorg/snmp4j/security/SecurityParameters;)[B

    move-result-object v1

    invoke-virtual {v6}, Lorg/snmp4j/security/UsmSecurityParameters;->getAuthParametersPosition()I

    move-result v2

    invoke-virtual {v6}, Lorg/snmp4j/security/UsmSecurityParameters;->getSecurityParametersPosition()I

    move-result v5

    add-int/2addr v2, v5

    invoke-virtual {v6}, Lorg/snmp4j/security/UsmSecurityParameters;->getAuthenticationProtocol()Lorg/snmp4j/security/AuthenticationProtocol;

    move-result-object v5

    invoke-virtual {v6}, Lorg/snmp4j/security/UsmSecurityParameters;->getAuthenticationKey()[B

    move-result-object v6

    array-length v7, v1

    new-instance v8, Lorg/snmp4j/security/ByteArrayWindow;

    invoke-interface {v4}, Lorg/snmp4j/security/AuthenticationProtocol;->getAuthenticationCodeLength()I

    move-result v4

    invoke-direct {v8, v1, v2, v4}, Lorg/snmp4j/security/ByteArrayWindow;-><init>([BII)V

    const/4 v2, 0x0

    move-object/from16 p1, v5

    move-object/from16 p2, v6

    move-object/from16 p3, v1

    move/from16 p4, v2

    move/from16 p5, v7

    move-object/from16 p6, v8

    invoke-interface/range {p1 .. p6}, Lorg/snmp4j/security/AuthenticationProtocol;->authenticate([B[BIILorg/snmp4j/security/ByteArrayWindow;)Z

    move-result v2

    if-nez v2, :cond_18

    sget-object v1, Lorg/snmp4j/security/USM;->logger:Lorg/snmp4j/log/LogAdapter;

    invoke-interface {v1}, Lorg/snmp4j/log/LogAdapter;->isDebugEnabled()Z

    move-result v2

    if-eqz v2, :cond_16

    const-string v2, "Outgoing message could not be authenticated"

    invoke-interface {v1, v2}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    :cond_16
    const/16 v1, 0x57f

    return v1

    :cond_17
    invoke-virtual {v6, v3}, Lorg/snmp4j/security/UsmSecurityParameters;->setAuthoritativeEngineBoots(I)V

    new-instance v4, Lorg/snmp4j/smi/OctetString;

    invoke-direct {v4}, Lorg/snmp4j/smi/OctetString;-><init>()V

    invoke-virtual {v6, v4}, Lorg/snmp4j/security/UsmSecurityParameters;->setAuthenticationParameters(Lorg/snmp4j/smi/OctetString;)V

    invoke-virtual {v6, v3}, Lorg/snmp4j/security/UsmSecurityParameters;->setAuthoritativeEngineTime(I)V

    new-instance v4, Lorg/snmp4j/smi/Integer32;

    invoke-direct {v4, v1}, Lorg/snmp4j/smi/Integer32;-><init>(I)V

    invoke-static {v4, v9, v2, v6}, Lorg/snmp4j/security/SNMPv3SecurityModel;->buildWholeMessage(Lorg/snmp4j/smi/Integer32;[B[BLorg/snmp4j/security/SecurityParameters;)[B

    move-result-object v1

    :cond_18
    invoke-static {v1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v2

    array-length v1, v1

    invoke-virtual {v2, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    move-result-object v1

    check-cast v1, Ljava/nio/ByteBuffer;

    move-object/from16 v2, p11

    invoke-virtual {v2, v1}, Lorg/snmp4j/asn1/BEROutputStream;->setBuffer(Ljava/nio/ByteBuffer;)V

    return v3
.end method

.method public getCounterSupport()Lorg/snmp4j/mp/CounterSupport;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/security/USM;->counterSupport:Lorg/snmp4j/mp/CounterSupport;

    return-object v0
.end method

.method public getEngineBoots()I
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/security/USM;->timeTable:Lorg/snmp4j/security/UsmTimeTable;

    invoke-virtual {v0}, Lorg/snmp4j/security/UsmTimeTable;->getEngineBoots()I

    move-result v0

    return v0
.end method

.method public getEngineTime()I
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/security/USM;->timeTable:Lorg/snmp4j/security/UsmTimeTable;

    invoke-virtual {v0}, Lorg/snmp4j/security/UsmTimeTable;->getEngineTime()I

    move-result v0

    return v0
.end method

.method public getID()I
    .locals 1

    const/4 v0, 0x3

    return v0
.end method

.method public getSecurityProtocols()Lorg/snmp4j/security/SecurityProtocols;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/security/USM;->securityProtocols:Lorg/snmp4j/security/SecurityProtocols;

    return-object v0
.end method

.method public getTimeTable()Lorg/snmp4j/security/UsmTimeTable;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/security/USM;->timeTable:Lorg/snmp4j/security/UsmTimeTable;

    return-object v0
.end method

.method public getUser(Lorg/snmp4j/smi/OctetString;Lorg/snmp4j/smi/OctetString;)Lorg/snmp4j/security/UsmUserEntry;
    .locals 10

    sget-object v0, Lorg/snmp4j/security/USM;->logger:Lorg/snmp4j/log/LogAdapter;

    invoke-interface {v0}, Lorg/snmp4j/log/LogAdapter;->isDebugEnabled()Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getUser(engineID="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lorg/snmp4j/smi/OctetString;->toHexString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ", securityName="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Lorg/snmp4j/smi/OctetString;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ")"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    :cond_0
    iget-object v1, p0, Lorg/snmp4j/security/USM;->userTable:Lorg/snmp4j/security/UsmUserTable;

    invoke-virtual {v1, p1, p2}, Lorg/snmp4j/security/UsmUserTable;->getUser(Lorg/snmp4j/smi/OctetString;Lorg/snmp4j/smi/OctetString;)Lorg/snmp4j/security/UsmUserEntry;

    move-result-object v1

    if-nez v1, :cond_8

    iget-object v1, p0, Lorg/snmp4j/security/USM;->userTable:Lorg/snmp4j/security/UsmUserTable;

    invoke-virtual {v1, p2}, Lorg/snmp4j/security/UsmUserTable;->getUser(Lorg/snmp4j/smi/OctetString;)Lorg/snmp4j/security/UsmUserEntry;

    move-result-object v1

    const/4 v2, 0x0

    if-nez v1, :cond_2

    invoke-virtual {p2}, Lorg/snmp4j/smi/OctetString;->length()I

    move-result v3

    if-lez v3, :cond_2

    invoke-interface {v0}, Lorg/snmp4j/log/LogAdapter;->isDebugEnabled()Z

    move-result p1

    if-eqz p1, :cond_1

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "USM.getUser - User \'"

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, "\' unknown"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    :cond_1
    return-object v2

    :cond_2
    if-eqz v1, :cond_7

    invoke-virtual {p1}, Lorg/snmp4j/smi/OctetString;->length()I

    move-result v0

    if-nez v0, :cond_3

    goto/16 :goto_4

    :cond_3
    invoke-virtual {v1}, Lorg/snmp4j/security/UsmUserEntry;->getUsmUser()Lorg/snmp4j/security/UsmUser;

    move-result-object v0

    invoke-virtual {v0}, Lorg/snmp4j/security/UsmUser;->getAuthenticationProtocol()Lorg/snmp4j/smi/OID;

    move-result-object v6

    invoke-virtual {v1}, Lorg/snmp4j/security/UsmUserEntry;->getUsmUser()Lorg/snmp4j/security/UsmUser;

    move-result-object v0

    invoke-virtual {v0}, Lorg/snmp4j/security/UsmUser;->getPrivacyProtocol()Lorg/snmp4j/smi/OID;

    move-result-object v8

    if-eqz v6, :cond_8

    invoke-virtual {v1}, Lorg/snmp4j/security/UsmUserEntry;->getUsmUser()Lorg/snmp4j/security/UsmUser;

    move-result-object v0

    invoke-virtual {v0}, Lorg/snmp4j/security/UsmUser;->isLocalized()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {v1}, Lorg/snmp4j/security/UsmUserEntry;->getUsmUser()Lorg/snmp4j/security/UsmUser;

    move-result-object v0

    invoke-virtual {v0}, Lorg/snmp4j/security/UsmUser;->getAuthenticationPassphrase()Lorg/snmp4j/smi/OctetString;

    move-result-object v0

    invoke-virtual {v0}, Lorg/snmp4j/smi/OctetString;->getValue()[B

    move-result-object v0

    :goto_0
    move-object v7, v0

    goto :goto_1

    :cond_4
    iget-object v0, p0, Lorg/snmp4j/security/USM;->securityProtocols:Lorg/snmp4j/security/SecurityProtocols;

    invoke-virtual {v1}, Lorg/snmp4j/security/UsmUserEntry;->getUsmUser()Lorg/snmp4j/security/UsmUser;

    move-result-object v3

    invoke-virtual {v3}, Lorg/snmp4j/security/UsmUser;->getAuthenticationPassphrase()Lorg/snmp4j/smi/OctetString;

    move-result-object v3

    invoke-virtual {p1}, Lorg/snmp4j/smi/OctetString;->getValue()[B

    move-result-object v4

    invoke-virtual {v0, v6, v3, v4}, Lorg/snmp4j/security/SecurityProtocols;->passwordToKey(Lorg/snmp4j/smi/OID;Lorg/snmp4j/smi/OctetString;[B)[B

    move-result-object v0

    goto :goto_0

    :goto_1
    if-eqz v8, :cond_5

    invoke-virtual {v1}, Lorg/snmp4j/security/UsmUserEntry;->getUsmUser()Lorg/snmp4j/security/UsmUser;

    move-result-object v0

    invoke-virtual {v0}, Lorg/snmp4j/security/UsmUser;->isLocalized()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-virtual {v1}, Lorg/snmp4j/security/UsmUserEntry;->getUsmUser()Lorg/snmp4j/security/UsmUser;

    move-result-object v0

    invoke-virtual {v0}, Lorg/snmp4j/security/UsmUser;->getPrivacyPassphrase()Lorg/snmp4j/smi/OctetString;

    move-result-object v0

    invoke-virtual {v0}, Lorg/snmp4j/smi/OctetString;->getValue()[B

    move-result-object v2

    :cond_5
    :goto_2
    move-object v9, v2

    goto :goto_3

    :cond_6
    iget-object v0, p0, Lorg/snmp4j/security/USM;->securityProtocols:Lorg/snmp4j/security/SecurityProtocols;

    invoke-virtual {v1}, Lorg/snmp4j/security/UsmUserEntry;->getUsmUser()Lorg/snmp4j/security/UsmUser;

    move-result-object v1

    invoke-virtual {v1}, Lorg/snmp4j/security/UsmUser;->getPrivacyPassphrase()Lorg/snmp4j/smi/OctetString;

    move-result-object v1

    invoke-virtual {p1}, Lorg/snmp4j/smi/OctetString;->getValue()[B

    move-result-object v2

    invoke-virtual {v0, v8, v6, v1, v2}, Lorg/snmp4j/security/SecurityProtocols;->passwordToKey(Lorg/snmp4j/smi/OID;Lorg/snmp4j/smi/OID;Lorg/snmp4j/smi/OctetString;[B)[B

    move-result-object v2

    goto :goto_2

    :goto_3
    invoke-virtual {p1}, Lorg/snmp4j/smi/OctetString;->getValue()[B

    move-result-object v4

    move-object v3, p0

    move-object v5, p2

    invoke-virtual/range {v3 .. v9}, Lorg/snmp4j/security/USM;->addLocalizedUser([BLorg/snmp4j/smi/OctetString;Lorg/snmp4j/smi/OID;[BLorg/snmp4j/smi/OID;[B)Lorg/snmp4j/security/UsmUserEntry;

    move-result-object v1

    goto :goto_5

    :cond_7
    :goto_4
    new-instance p1, Lorg/snmp4j/security/UsmUserEntry;

    invoke-direct {p1}, Lorg/snmp4j/security/UsmUserEntry;-><init>()V

    invoke-virtual {p1, p2}, Lorg/snmp4j/security/UsmUserEntry;->setUserName(Lorg/snmp4j/smi/OctetString;)V

    new-instance v6, Lorg/snmp4j/security/UsmUser;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, v6

    move-object v1, p2

    invoke-direct/range {v0 .. v5}, Lorg/snmp4j/security/UsmUser;-><init>(Lorg/snmp4j/smi/OctetString;Lorg/snmp4j/smi/OID;Lorg/snmp4j/smi/OctetString;Lorg/snmp4j/smi/OID;Lorg/snmp4j/smi/OctetString;)V

    invoke-virtual {p1, v6}, Lorg/snmp4j/security/UsmUserEntry;->setUsmUser(Lorg/snmp4j/security/UsmUser;)V

    return-object p1

    :cond_8
    :goto_5
    return-object v1
.end method

.method public getUserTable()Lorg/snmp4j/security/UsmUserTable;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/security/USM;->userTable:Lorg/snmp4j/security/UsmUserTable;

    return-object v0
.end method

.method public hasAuthoritativeEngineID()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public hasUser(Lorg/snmp4j/smi/OctetString;Lorg/snmp4j/smi/OctetString;)Z
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/security/USM;->userTable:Lorg/snmp4j/security/UsmUserTable;

    invoke-virtual {v0, p1, p2}, Lorg/snmp4j/security/UsmUserTable;->getUser(Lorg/snmp4j/smi/OctetString;Lorg/snmp4j/smi/OctetString;)Lorg/snmp4j/security/UsmUserEntry;

    move-result-object p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lorg/snmp4j/security/USM;->userTable:Lorg/snmp4j/security/UsmUserTable;

    invoke-virtual {p1, p2}, Lorg/snmp4j/security/UsmUserTable;->getUser(Lorg/snmp4j/smi/OctetString;)Lorg/snmp4j/security/UsmUserEntry;

    move-result-object p1

    if-nez p1, :cond_0

    invoke-virtual {p2}, Lorg/snmp4j/smi/OctetString;->length()I

    move-result p1

    if-lez p1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    const/4 p1, 0x1

    return p1
.end method

.method public isEngineDiscoveryEnabled()Z
    .locals 1

    iget-boolean v0, p0, Lorg/snmp4j/security/USM;->engineDiscoveryEnabled:Z

    return v0
.end method

.method public newSecurityParametersInstance()Lorg/snmp4j/security/SecurityParameters;
    .locals 1

    new-instance v0, Lorg/snmp4j/security/UsmSecurityParameters;

    invoke-direct {v0}, Lorg/snmp4j/security/UsmSecurityParameters;-><init>()V

    return-object v0
.end method

.method public newSecurityStateReference()Lorg/snmp4j/security/SecurityStateReference;
    .locals 1

    new-instance v0, Lorg/snmp4j/security/UsmSecurityStateReference;

    invoke-direct {v0}, Lorg/snmp4j/security/UsmSecurityStateReference;-><init>()V

    return-object v0
.end method

.method public processIncomingMsg(IILorg/snmp4j/security/SecurityParameters;Lorg/snmp4j/security/SecurityModel;ILorg/snmp4j/asn1/BERInputStream;Lorg/snmp4j/TransportStateReference;Lorg/snmp4j/smi/OctetString;Lorg/snmp4j/smi/OctetString;Lorg/snmp4j/asn1/BEROutputStream;Lorg/snmp4j/smi/Integer32;Lorg/snmp4j/security/SecurityStateReference;Lorg/snmp4j/mp/StatusInformation;)I
    .locals 21
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    move-object/from16 v1, p0

    move/from16 v0, p5

    move-object/from16 v2, p8

    move-object/from16 v3, p9

    move-object/from16 v4, p10

    move-object/from16 v5, p13

    move-object/from16 v6, p3

    check-cast v6, Lorg/snmp4j/security/UsmSecurityParameters;

    move-object/from16 v7, p12

    check-cast v7, Lorg/snmp4j/security/UsmSecurityStateReference;

    invoke-virtual {v6}, Lorg/snmp4j/security/UsmSecurityParameters;->getAuthoritativeEngineID()[B

    move-result-object v8

    invoke-virtual {v2, v8}, Lorg/snmp4j/smi/OctetString;->setValue([B)V

    invoke-static/range {p6 .. p6}, Lorg/snmp4j/security/SNMPv3SecurityModel;->buildMessageBuffer(Lorg/snmp4j/asn1/BERInputStream;)[B

    move-result-object v8

    invoke-virtual/range {p8 .. p8}, Lorg/snmp4j/smi/OctetString;->length()I

    move-result v9

    if-eqz v9, :cond_1c

    iget-object v9, v1, Lorg/snmp4j/security/USM;->timeTable:Lorg/snmp4j/security/UsmTimeTable;

    invoke-virtual/range {p0 .. p0}, Lorg/snmp4j/security/USM;->isEngineDiscoveryEnabled()Z

    move-result v10

    invoke-virtual {v6}, Lorg/snmp4j/security/UsmSecurityParameters;->getAuthoritativeEngineBoots()I

    move-result v11

    invoke-virtual {v6}, Lorg/snmp4j/security/UsmSecurityParameters;->getAuthoritativeEngineTime()I

    move-result v12

    invoke-virtual {v9, v2, v10, v11, v12}, Lorg/snmp4j/security/UsmTimeTable;->checkEngineID(Lorg/snmp4j/smi/OctetString;ZII)I

    move-result v9

    if-eqz v9, :cond_0

    goto/16 :goto_6

    :cond_0
    invoke-virtual {v6}, Lorg/snmp4j/security/UsmSecurityParameters;->getUserName()Lorg/snmp4j/smi/OctetString;

    move-result-object v9

    invoke-virtual {v9}, Lorg/snmp4j/smi/OctetString;->getValue()[B

    move-result-object v9

    invoke-virtual {v3, v9}, Lorg/snmp4j/smi/OctetString;->setValue([B)V

    invoke-virtual {v6}, Lorg/snmp4j/security/UsmSecurityParameters;->getScopedPduPosition()I

    move-result v14

    invoke-virtual {v6}, Lorg/snmp4j/security/UsmSecurityParameters;->getUserName()Lorg/snmp4j/smi/OctetString;

    move-result-object v9

    invoke-virtual {v9}, Lorg/snmp4j/smi/OctetString;->length()I

    move-result v9

    const/16 v10, 0x57c

    const-string v11, "RFC3414 \u00a73.2.4 Unknown security name: "

    const/4 v13, 0x0

    const/4 v12, 0x1

    if-gtz v9, :cond_3

    if-le v0, v12, :cond_1

    goto :goto_0

    :cond_1
    sget-object v9, Lorg/snmp4j/security/USM;->logger:Lorg/snmp4j/log/LogAdapter;

    invoke-interface {v9}, Lorg/snmp4j/log/LogAdapter;->isDebugEnabled()Z

    move-result v16

    if-eqz v16, :cond_2

    const-string v15, "Accepting zero length security name"

    invoke-interface {v9, v15}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    :cond_2
    new-array v9, v13, [B

    invoke-virtual {v3, v9}, Lorg/snmp4j/smi/OctetString;->setValue([B)V

    goto :goto_1

    :cond_3
    :goto_0
    invoke-virtual {v6}, Lorg/snmp4j/security/UsmSecurityParameters;->getUserName()Lorg/snmp4j/smi/OctetString;

    move-result-object v9

    invoke-direct {v1, v2, v9}, Lorg/snmp4j/security/USM;->getSecurityName(Lorg/snmp4j/smi/OctetString;Lorg/snmp4j/smi/OctetString;)Lorg/snmp4j/smi/OctetString;

    move-result-object v9

    if-nez v9, :cond_6

    sget-object v0, Lorg/snmp4j/security/USM;->logger:Lorg/snmp4j/log/LogAdapter;

    invoke-interface {v0}, Lorg/snmp4j/log/LogAdapter;->isDebugEnabled()Z

    move-result v2

    if-eqz v2, :cond_4

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual/range {p9 .. p9}, Lorg/snmp4j/smi/OctetString;->toHexString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, " ("

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, ")"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    :cond_4
    if-eqz v5, :cond_5

    new-instance v0, Lorg/snmp4j/event/CounterEvent;

    sget-object v2, Lorg/snmp4j/mp/SnmpConstants;->usmStatsUnknownUserNames:Lorg/snmp4j/smi/OID;

    invoke-direct {v0, v1, v2}, Lorg/snmp4j/event/CounterEvent;-><init>(Ljava/lang/Object;Lorg/snmp4j/smi/OID;)V

    invoke-virtual {v1, v0}, Lorg/snmp4j/security/USM;->fireIncrementCounter(Lorg/snmp4j/event/CounterEvent;)V

    new-instance v2, Lorg/snmp4j/smi/Integer32;

    invoke-direct {v2, v12}, Lorg/snmp4j/smi/Integer32;-><init>(I)V

    invoke-virtual {v5, v2}, Lorg/snmp4j/mp/StatusInformation;->setSecurityLevel(Lorg/snmp4j/smi/Integer32;)V

    new-instance v2, Lorg/snmp4j/smi/VariableBinding;

    invoke-virtual {v0}, Lorg/snmp4j/event/CounterEvent;->getOid()Lorg/snmp4j/smi/OID;

    move-result-object v3

    invoke-virtual {v0}, Lorg/snmp4j/event/CounterEvent;->getCurrentValue()Lorg/snmp4j/smi/Variable;

    move-result-object v0

    invoke-direct {v2, v3, v0}, Lorg/snmp4j/smi/VariableBinding;-><init>(Lorg/snmp4j/smi/OID;Lorg/snmp4j/smi/Variable;)V

    invoke-virtual {v5, v2}, Lorg/snmp4j/mp/StatusInformation;->setErrorIndication(Lorg/snmp4j/smi/VariableBinding;)V

    :cond_5
    return v10

    :cond_6
    :goto_1
    invoke-virtual {v6}, Lorg/snmp4j/security/UsmSecurityParameters;->getUserName()Lorg/snmp4j/smi/OctetString;

    move-result-object v9

    invoke-virtual {v9}, Lorg/snmp4j/smi/OctetString;->length()I

    move-result v9

    if-gtz v9, :cond_8

    if-le v0, v12, :cond_7

    goto :goto_2

    :cond_7
    array-length v2, v8

    sub-int/2addr v2, v14

    invoke-static {v8, v14, v2}, Ljava/nio/ByteBuffer;->wrap([BII)Ljava/nio/ByteBuffer;

    move-result-object v2

    invoke-virtual {v4, v2}, Lorg/snmp4j/asn1/BEROutputStream;->setFilledBuffer(Ljava/nio/ByteBuffer;)V

    move/from16 v19, v13

    goto/16 :goto_5

    :cond_8
    :goto_2
    invoke-virtual {v1, v2, v3}, Lorg/snmp4j/security/USM;->getUser(Lorg/snmp4j/smi/OctetString;Lorg/snmp4j/smi/OctetString;)Lorg/snmp4j/security/UsmUserEntry;

    move-result-object v15

    if-nez v15, :cond_c

    sget-object v0, Lorg/snmp4j/security/USM;->logger:Lorg/snmp4j/log/LogAdapter;

    invoke-interface {v0}, Lorg/snmp4j/log/LogAdapter;->isDebugEnabled()Z

    move-result v4

    if-eqz v4, :cond_9

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual/range {p9 .. p9}, Lorg/snmp4j/smi/OctetString;->toHexString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, "( "

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, ") for engine ID "

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual/range {p8 .. p8}, Lorg/snmp4j/smi/OctetString;->toHexString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    :cond_9
    new-instance v0, Lorg/snmp4j/event/CounterEvent;

    sget-object v2, Lorg/snmp4j/mp/SnmpConstants;->usmStatsUnknownUserNames:Lorg/snmp4j/smi/OID;

    invoke-direct {v0, v1, v2}, Lorg/snmp4j/event/CounterEvent;-><init>(Ljava/lang/Object;Lorg/snmp4j/smi/OID;)V

    invoke-virtual {v1, v0}, Lorg/snmp4j/security/USM;->fireIncrementCounter(Lorg/snmp4j/event/CounterEvent;)V

    if-eqz v5, :cond_b

    invoke-static {}, Lorg/snmp4j/SNMP4JSettings;->getReportSecurityLevelStrategy()Lorg/snmp4j/SNMP4JSettings$ReportSecurityLevelStrategy;

    move-result-object v2

    sget-object v3, Lorg/snmp4j/SNMP4JSettings$ReportSecurityLevelStrategy;->noAuthNoPrivIfNeeded:Lorg/snmp4j/SNMP4JSettings$ReportSecurityLevelStrategy;

    if-ne v2, v3, :cond_a

    new-instance v2, Lorg/snmp4j/smi/Integer32;

    invoke-direct {v2, v12}, Lorg/snmp4j/smi/Integer32;-><init>(I)V

    invoke-virtual {v5, v2}, Lorg/snmp4j/mp/StatusInformation;->setSecurityLevel(Lorg/snmp4j/smi/Integer32;)V

    :cond_a
    new-instance v2, Lorg/snmp4j/smi/VariableBinding;

    invoke-virtual {v0}, Lorg/snmp4j/event/CounterEvent;->getOid()Lorg/snmp4j/smi/OID;

    move-result-object v3

    invoke-virtual {v0}, Lorg/snmp4j/event/CounterEvent;->getCurrentValue()Lorg/snmp4j/smi/Variable;

    move-result-object v0

    invoke-direct {v2, v3, v0}, Lorg/snmp4j/smi/VariableBinding;-><init>(Lorg/snmp4j/smi/OID;Lorg/snmp4j/smi/Variable;)V

    invoke-virtual {v5, v2}, Lorg/snmp4j/mp/StatusInformation;->setErrorIndication(Lorg/snmp4j/smi/VariableBinding;)V

    :cond_b
    return v10

    :cond_c
    invoke-virtual {v15}, Lorg/snmp4j/security/UsmUserEntry;->getUserName()Lorg/snmp4j/smi/OctetString;

    move-result-object v9

    invoke-virtual {v9}, Lorg/snmp4j/smi/OctetString;->getValue()[B

    move-result-object v9

    invoke-virtual {v7, v9}, Lorg/snmp4j/security/UsmSecurityStateReference;->setUserName([B)V

    iget-object v9, v1, Lorg/snmp4j/security/USM;->securityProtocols:Lorg/snmp4j/security/SecurityProtocols;

    invoke-virtual {v15}, Lorg/snmp4j/security/UsmUserEntry;->getUsmUser()Lorg/snmp4j/security/UsmUser;

    move-result-object v10

    invoke-virtual {v10}, Lorg/snmp4j/security/UsmUser;->getAuthenticationProtocol()Lorg/snmp4j/smi/OID;

    move-result-object v10

    invoke-virtual {v9, v10}, Lorg/snmp4j/security/SecurityProtocols;->getAuthenticationProtocol(Lorg/snmp4j/smi/OID;)Lorg/snmp4j/security/AuthenticationProtocol;

    move-result-object v9

    iget-object v10, v1, Lorg/snmp4j/security/USM;->securityProtocols:Lorg/snmp4j/security/SecurityProtocols;

    invoke-virtual {v15}, Lorg/snmp4j/security/UsmUserEntry;->getUsmUser()Lorg/snmp4j/security/UsmUser;

    move-result-object v11

    invoke-virtual {v11}, Lorg/snmp4j/security/UsmUser;->getPrivacyProtocol()Lorg/snmp4j/smi/OID;

    move-result-object v11

    invoke-virtual {v10, v11}, Lorg/snmp4j/security/SecurityProtocols;->getPrivacyProtocol(Lorg/snmp4j/smi/OID;)Lorg/snmp4j/security/PrivacyProtocol;

    move-result-object v11

    invoke-virtual {v15}, Lorg/snmp4j/security/UsmUserEntry;->getAuthenticationKey()[B

    move-result-object v10

    invoke-virtual {v7, v10}, Lorg/snmp4j/security/UsmSecurityStateReference;->setAuthenticationKey([B)V

    invoke-virtual {v15}, Lorg/snmp4j/security/UsmUserEntry;->getPrivacyKey()[B

    move-result-object v10

    invoke-virtual {v7, v10}, Lorg/snmp4j/security/UsmSecurityStateReference;->setPrivacyKey([B)V

    invoke-virtual {v7, v9}, Lorg/snmp4j/security/UsmSecurityStateReference;->setAuthenticationProtocol(Lorg/snmp4j/security/AuthenticationProtocol;)V

    invoke-virtual {v7, v11}, Lorg/snmp4j/security/UsmSecurityStateReference;->setPrivacyProtocol(Lorg/snmp4j/security/PrivacyProtocol;)V

    const/4 v10, 0x2

    if-lt v0, v10, :cond_d

    if-eqz v9, :cond_e

    :cond_d
    const/4 v10, 0x3

    if-lt v0, v10, :cond_11

    if-nez v11, :cond_11

    :cond_e
    sget-object v2, Lorg/snmp4j/security/USM;->logger:Lorg/snmp4j/log/LogAdapter;

    invoke-interface {v2}, Lorg/snmp4j/log/LogAdapter;->isDebugEnabled()Z

    move-result v3

    if-eqz v3, :cond_f

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "RFC3414 \u00a73.2.5 - Unsupported security level: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " by user "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v2, v0}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    :cond_f
    new-instance v0, Lorg/snmp4j/event/CounterEvent;

    sget-object v2, Lorg/snmp4j/mp/SnmpConstants;->usmStatsUnsupportedSecLevels:Lorg/snmp4j/smi/OID;

    invoke-direct {v0, v1, v2}, Lorg/snmp4j/event/CounterEvent;-><init>(Ljava/lang/Object;Lorg/snmp4j/smi/OID;)V

    invoke-virtual {v1, v0}, Lorg/snmp4j/security/USM;->fireIncrementCounter(Lorg/snmp4j/event/CounterEvent;)V

    invoke-static {}, Lorg/snmp4j/SNMP4JSettings;->getReportSecurityLevelStrategy()Lorg/snmp4j/SNMP4JSettings$ReportSecurityLevelStrategy;

    move-result-object v2

    sget-object v3, Lorg/snmp4j/SNMP4JSettings$ReportSecurityLevelStrategy;->noAuthNoPrivIfNeeded:Lorg/snmp4j/SNMP4JSettings$ReportSecurityLevelStrategy;

    if-ne v2, v3, :cond_10

    new-instance v2, Lorg/snmp4j/smi/Integer32;

    invoke-direct {v2, v12}, Lorg/snmp4j/smi/Integer32;-><init>(I)V

    invoke-virtual {v5, v2}, Lorg/snmp4j/mp/StatusInformation;->setSecurityLevel(Lorg/snmp4j/smi/Integer32;)V

    :cond_10
    new-instance v2, Lorg/snmp4j/smi/VariableBinding;

    invoke-virtual {v0}, Lorg/snmp4j/event/CounterEvent;->getOid()Lorg/snmp4j/smi/OID;

    move-result-object v3

    invoke-virtual {v0}, Lorg/snmp4j/event/CounterEvent;->getCurrentValue()Lorg/snmp4j/smi/Variable;

    move-result-object v0

    invoke-direct {v2, v3, v0}, Lorg/snmp4j/smi/VariableBinding;-><init>(Lorg/snmp4j/smi/OID;Lorg/snmp4j/smi/Variable;)V

    invoke-virtual {v5, v2}, Lorg/snmp4j/mp/StatusInformation;->setErrorIndication(Lorg/snmp4j/smi/VariableBinding;)V

    const/16 v0, 0x57b

    return v0

    :cond_11
    const/4 v10, 0x2

    if-lt v0, v10, :cond_1b

    if-eqz v5, :cond_19

    invoke-virtual {v6}, Lorg/snmp4j/security/UsmSecurityParameters;->getAuthParametersPosition()I

    move-result v16

    invoke-virtual {v6}, Lorg/snmp4j/security/UsmSecurityParameters;->getSecurityParametersPosition()I

    move-result v17

    add-int v10, v16, v17

    invoke-virtual {v15}, Lorg/snmp4j/security/UsmUserEntry;->getAuthenticationKey()[B

    move-result-object v16

    array-length v13, v8

    new-instance v12, Lorg/snmp4j/security/ByteArrayWindow;

    move-object/from16 p12, v11

    invoke-interface {v9}, Lorg/snmp4j/security/AuthenticationProtocol;->getAuthenticationCodeLength()I

    move-result v11

    invoke-direct {v12, v8, v10, v11}, Lorg/snmp4j/security/ByteArrayWindow;-><init>([BII)V

    const/16 v17, 0x0

    const/4 v11, 0x2

    move-object/from16 v10, v16

    move-object/from16 v16, p12

    move v3, v11

    move-object v11, v8

    move-object/from16 v18, v12

    const/4 v3, 0x1

    move/from16 v12, v17

    move/from16 v20, v14

    move-object/from16 v14, v18

    invoke-interface/range {v9 .. v14}, Lorg/snmp4j/security/AuthenticationProtocol;->isAuthentic([B[BIILorg/snmp4j/security/ByteArrayWindow;)Z

    move-result v9

    if-nez v9, :cond_14

    sget-object v0, Lorg/snmp4j/security/USM;->logger:Lorg/snmp4j/log/LogAdapter;

    invoke-interface {v0}, Lorg/snmp4j/log/LogAdapter;->isDebugEnabled()Z

    move-result v2

    if-eqz v2, :cond_12

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "RFC3414 \u00a73.2.6 Wrong digest -> authentication failure: "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Lorg/snmp4j/security/UsmSecurityParameters;->getAuthenticationParameters()Lorg/snmp4j/smi/OctetString;

    move-result-object v4

    invoke-virtual {v4}, Lorg/snmp4j/smi/OctetString;->toHexString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    :cond_12
    new-instance v0, Lorg/snmp4j/event/CounterEvent;

    sget-object v2, Lorg/snmp4j/mp/SnmpConstants;->usmStatsWrongDigests:Lorg/snmp4j/smi/OID;

    invoke-direct {v0, v1, v2}, Lorg/snmp4j/event/CounterEvent;-><init>(Ljava/lang/Object;Lorg/snmp4j/smi/OID;)V

    invoke-virtual {v1, v0}, Lorg/snmp4j/security/USM;->fireIncrementCounter(Lorg/snmp4j/event/CounterEvent;)V

    invoke-static {}, Lorg/snmp4j/SNMP4JSettings;->getReportSecurityLevelStrategy()Lorg/snmp4j/SNMP4JSettings$ReportSecurityLevelStrategy;

    move-result-object v2

    sget-object v4, Lorg/snmp4j/SNMP4JSettings$ReportSecurityLevelStrategy;->noAuthNoPrivIfNeeded:Lorg/snmp4j/SNMP4JSettings$ReportSecurityLevelStrategy;

    if-ne v2, v4, :cond_13

    new-instance v2, Lorg/snmp4j/smi/Integer32;

    invoke-direct {v2, v3}, Lorg/snmp4j/smi/Integer32;-><init>(I)V

    invoke-virtual {v5, v2}, Lorg/snmp4j/mp/StatusInformation;->setSecurityLevel(Lorg/snmp4j/smi/Integer32;)V

    :cond_13
    new-instance v2, Lorg/snmp4j/smi/VariableBinding;

    invoke-virtual {v0}, Lorg/snmp4j/event/CounterEvent;->getOid()Lorg/snmp4j/smi/OID;

    move-result-object v3

    invoke-virtual {v0}, Lorg/snmp4j/event/CounterEvent;->getCurrentValue()Lorg/snmp4j/smi/Variable;

    move-result-object v0

    invoke-direct {v2, v3, v0}, Lorg/snmp4j/smi/VariableBinding;-><init>(Lorg/snmp4j/smi/OID;Lorg/snmp4j/smi/Variable;)V

    invoke-virtual {v5, v2}, Lorg/snmp4j/mp/StatusInformation;->setErrorIndication(Lorg/snmp4j/smi/VariableBinding;)V

    const/16 v0, 0x580

    return v0

    :cond_14
    iget-object v9, v1, Lorg/snmp4j/security/USM;->timeTable:Lorg/snmp4j/security/UsmTimeTable;

    new-instance v10, Lorg/snmp4j/security/UsmTimeEntry;

    invoke-virtual {v6}, Lorg/snmp4j/security/UsmSecurityParameters;->getAuthoritativeEngineBoots()I

    move-result v11

    invoke-virtual {v6}, Lorg/snmp4j/security/UsmSecurityParameters;->getAuthoritativeEngineTime()I

    move-result v12

    invoke-direct {v10, v2, v11, v12}, Lorg/snmp4j/security/UsmTimeEntry;-><init>(Lorg/snmp4j/smi/OctetString;II)V

    invoke-virtual {v9, v10}, Lorg/snmp4j/security/UsmTimeTable;->checkTime(Lorg/snmp4j/security/UsmTimeEntry;)I

    move-result v9

    const/16 v10, 0x582

    if-eq v9, v10, :cond_16

    const/16 v3, 0x583

    if-eq v9, v3, :cond_15

    :goto_3
    const/4 v2, 0x3

    goto/16 :goto_4

    :cond_15
    sget-object v0, Lorg/snmp4j/security/USM;->logger:Lorg/snmp4j/log/LogAdapter;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "RFC3414 \u00a73.2.7.a Not in time window; engineID=\'"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, "\', engineBoots="

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Lorg/snmp4j/security/UsmSecurityParameters;->getAuthoritativeEngineBoots()I

    move-result v2

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", engineTime="

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Lorg/snmp4j/security/UsmSecurityParameters;->getAuthoritativeEngineTime()I

    move-result v2

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    new-instance v0, Lorg/snmp4j/event/CounterEvent;

    sget-object v2, Lorg/snmp4j/mp/SnmpConstants;->usmStatsNotInTimeWindows:Lorg/snmp4j/smi/OID;

    invoke-direct {v0, v1, v2}, Lorg/snmp4j/event/CounterEvent;-><init>(Ljava/lang/Object;Lorg/snmp4j/smi/OID;)V

    invoke-virtual {v1, v0}, Lorg/snmp4j/security/USM;->fireIncrementCounter(Lorg/snmp4j/event/CounterEvent;)V

    new-instance v2, Lorg/snmp4j/smi/Integer32;

    const/4 v3, 0x2

    invoke-direct {v2, v3}, Lorg/snmp4j/smi/Integer32;-><init>(I)V

    invoke-virtual {v5, v2}, Lorg/snmp4j/mp/StatusInformation;->setSecurityLevel(Lorg/snmp4j/smi/Integer32;)V

    new-instance v2, Lorg/snmp4j/smi/VariableBinding;

    invoke-virtual {v0}, Lorg/snmp4j/event/CounterEvent;->getOid()Lorg/snmp4j/smi/OID;

    move-result-object v3

    invoke-virtual {v0}, Lorg/snmp4j/event/CounterEvent;->getCurrentValue()Lorg/snmp4j/smi/Variable;

    move-result-object v0

    invoke-direct {v2, v3, v0}, Lorg/snmp4j/smi/VariableBinding;-><init>(Lorg/snmp4j/smi/OID;Lorg/snmp4j/smi/Variable;)V

    invoke-virtual {v5, v2}, Lorg/snmp4j/mp/StatusInformation;->setErrorIndication(Lorg/snmp4j/smi/VariableBinding;)V

    return v9

    :cond_16
    sget-object v0, Lorg/snmp4j/security/USM;->logger:Lorg/snmp4j/log/LogAdapter;

    invoke-interface {v0}, Lorg/snmp4j/log/LogAdapter;->isDebugEnabled()Z

    move-result v4

    if-eqz v4, :cond_17

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "RFC3414 \u00a73.2.7.b - Unknown engine ID: "

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    :cond_17
    new-instance v0, Lorg/snmp4j/event/CounterEvent;

    sget-object v2, Lorg/snmp4j/mp/SnmpConstants;->usmStatsUnknownEngineIDs:Lorg/snmp4j/smi/OID;

    invoke-direct {v0, v1, v2}, Lorg/snmp4j/event/CounterEvent;-><init>(Ljava/lang/Object;Lorg/snmp4j/smi/OID;)V

    invoke-virtual {v1, v0}, Lorg/snmp4j/security/USM;->fireIncrementCounter(Lorg/snmp4j/event/CounterEvent;)V

    invoke-static {}, Lorg/snmp4j/SNMP4JSettings;->getReportSecurityLevelStrategy()Lorg/snmp4j/SNMP4JSettings$ReportSecurityLevelStrategy;

    move-result-object v2

    sget-object v4, Lorg/snmp4j/SNMP4JSettings$ReportSecurityLevelStrategy;->noAuthNoPrivIfNeeded:Lorg/snmp4j/SNMP4JSettings$ReportSecurityLevelStrategy;

    if-ne v2, v4, :cond_18

    new-instance v2, Lorg/snmp4j/smi/Integer32;

    invoke-direct {v2, v3}, Lorg/snmp4j/smi/Integer32;-><init>(I)V

    invoke-virtual {v5, v2}, Lorg/snmp4j/mp/StatusInformation;->setSecurityLevel(Lorg/snmp4j/smi/Integer32;)V

    :cond_18
    new-instance v2, Lorg/snmp4j/smi/VariableBinding;

    invoke-virtual {v0}, Lorg/snmp4j/event/CounterEvent;->getOid()Lorg/snmp4j/smi/OID;

    move-result-object v3

    invoke-virtual {v0}, Lorg/snmp4j/event/CounterEvent;->getCurrentValue()Lorg/snmp4j/smi/Variable;

    move-result-object v0

    invoke-direct {v2, v3, v0}, Lorg/snmp4j/smi/VariableBinding;-><init>(Lorg/snmp4j/smi/OID;Lorg/snmp4j/smi/Variable;)V

    invoke-virtual {v5, v2}, Lorg/snmp4j/mp/StatusInformation;->setErrorIndication(Lorg/snmp4j/smi/VariableBinding;)V

    return v9

    :cond_19
    move-object/from16 v16, v11

    move/from16 v20, v14

    goto/16 :goto_3

    :goto_4
    if-lt v0, v2, :cond_1a

    invoke-virtual {v6}, Lorg/snmp4j/security/UsmSecurityParameters;->getPrivacyParameters()Lorg/snmp4j/smi/OctetString;

    move-result-object v2

    new-instance v3, Lorg/snmp4j/security/DecryptParams;

    invoke-virtual {v2}, Lorg/snmp4j/smi/OctetString;->getValue()[B

    move-result-object v5

    invoke-virtual {v2}, Lorg/snmp4j/smi/OctetString;->length()I

    move-result v2

    const/4 v14, 0x0

    invoke-direct {v3, v5, v14, v2}, Lorg/snmp4j/security/DecryptParams;-><init>([BII)V

    :try_start_0
    array-length v2, v8

    move/from16 v5, v20

    sub-int/2addr v2, v5

    invoke-static {v8, v5, v2}, Ljava/nio/ByteBuffer;->wrap([BII)Ljava/nio/ByteBuffer;

    move-result-object v2

    new-instance v9, Lorg/snmp4j/asn1/BERInputStream;

    invoke-direct {v9, v2}, Lorg/snmp4j/asn1/BERInputStream;-><init>(Ljava/nio/ByteBuffer;)V

    invoke-virtual {v9}, Lorg/snmp4j/asn1/BERInputStream;->getPosition()J

    move-result-wide v10

    new-instance v2, Lorg/snmp4j/asn1/BER$MutableByte;

    invoke-direct {v2}, Lorg/snmp4j/asn1/BER$MutableByte;-><init>()V

    invoke-static {v9, v2}, Lorg/snmp4j/asn1/BER;->decodeHeader(Lorg/snmp4j/asn1/BERInputStream;Lorg/snmp4j/asn1/BER$MutableByte;)I

    move-result v12

    invoke-virtual {v9}, Lorg/snmp4j/asn1/BERInputStream;->getPosition()J

    move-result-wide v17

    sub-long v10, v17, v10

    long-to-int v2, v10

    add-int v11, v5, v2

    invoke-virtual {v9}, Lorg/snmp4j/asn1/BERInputStream;->close()V

    invoke-virtual {v15}, Lorg/snmp4j/security/UsmUserEntry;->getPrivacyKey()[B

    move-result-object v13

    invoke-virtual {v6}, Lorg/snmp4j/security/UsmSecurityParameters;->getAuthoritativeEngineBoots()I

    move-result v2

    int-to-long v9, v2

    invoke-virtual {v6}, Lorg/snmp4j/security/UsmSecurityParameters;->getAuthoritativeEngineTime()I

    move-result v2

    int-to-long v1, v2

    move-wide/from16 v17, v9

    move-object/from16 v9, v16

    move-object v10, v8

    move/from16 v19, v14

    move-wide/from16 v14, v17

    move-wide/from16 v16, v1

    move-object/from16 v18, v3

    invoke-interface/range {v9 .. v18}, Lorg/snmp4j/security/PrivacyProtocol;->decrypt([BII[BJJLorg/snmp4j/security/DecryptParams;)[B

    move-result-object v1

    invoke-static {v1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v1

    invoke-virtual {v4, v1}, Lorg/snmp4j/asn1/BEROutputStream;->setFilledBuffer(Ljava/nio/ByteBuffer;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_5

    :catch_0
    move-exception v0

    sget-object v1, Lorg/snmp4j/security/USM;->logger:Lorg/snmp4j/log/LogAdapter;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "RFC 3414 \u00a73.2.8 Decryption error: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v0}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    const/16 v0, 0x57e

    return v0

    :cond_1a
    move/from16 v5, v20

    const/16 v19, 0x0

    array-length v1, v8

    sub-int/2addr v1, v5

    invoke-static {v8, v5, v1}, Ljava/nio/ByteBuffer;->wrap([BII)Ljava/nio/ByteBuffer;

    move-result-object v1

    invoke-virtual {v4, v1}, Lorg/snmp4j/asn1/BEROutputStream;->setFilledBuffer(Ljava/nio/ByteBuffer;)V

    goto :goto_5

    :cond_1b
    move/from16 v19, v13

    move v5, v14

    array-length v1, v8

    sub-int/2addr v1, v5

    invoke-static {v8, v5, v1}, Ljava/nio/ByteBuffer;->wrap([BII)Ljava/nio/ByteBuffer;

    move-result-object v1

    invoke-virtual {v4, v1}, Lorg/snmp4j/asn1/BEROutputStream;->setFilledBuffer(Ljava/nio/ByteBuffer;)V

    :goto_5
    invoke-virtual {v6, v0}, Lorg/snmp4j/security/UsmSecurityParameters;->getBERMaxLength(I)I

    move-result v0

    sub-int v0, p2, v0

    move-object/from16 v1, p11

    invoke-virtual {v1, v0}, Lorg/snmp4j/smi/Integer32;->setValue(I)V

    invoke-virtual/range {p9 .. p9}, Lorg/snmp4j/smi/OctetString;->getValue()[B

    move-result-object v0

    invoke-virtual {v7, v0}, Lorg/snmp4j/security/UsmSecurityStateReference;->setSecurityName([B)V

    return v19

    :cond_1c
    :goto_6
    sget-object v1, Lorg/snmp4j/security/USM;->logger:Lorg/snmp4j/log/LogAdapter;

    invoke-interface {v1}, Lorg/snmp4j/log/LogAdapter;->isDebugEnabled()Z

    move-result v3

    if-eqz v3, :cond_1d

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "RFC3414 \u00a73.2.3 Unknown engine ID: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual/range {p8 .. p8}, Lorg/snmp4j/smi/OctetString;->toHexString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v3}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    :cond_1d
    invoke-virtual {v6}, Lorg/snmp4j/security/UsmSecurityParameters;->getAuthoritativeEngineID()[B

    move-result-object v1

    invoke-virtual {v2, v1}, Lorg/snmp4j/smi/OctetString;->setValue([B)V

    invoke-virtual {v6}, Lorg/snmp4j/security/UsmSecurityParameters;->getUserName()Lorg/snmp4j/smi/OctetString;

    move-result-object v1

    invoke-virtual {v1}, Lorg/snmp4j/smi/OctetString;->getValue()[B

    move-result-object v1

    move-object/from16 v2, p9

    invoke-virtual {v2, v1}, Lorg/snmp4j/smi/OctetString;->setValue([B)V

    if-eqz v5, :cond_1e

    new-instance v1, Lorg/snmp4j/event/CounterEvent;

    sget-object v2, Lorg/snmp4j/mp/SnmpConstants;->usmStatsUnknownEngineIDs:Lorg/snmp4j/smi/OID;

    move-object/from16 v3, p0

    invoke-direct {v1, v3, v2}, Lorg/snmp4j/event/CounterEvent;-><init>(Ljava/lang/Object;Lorg/snmp4j/smi/OID;)V

    invoke-virtual {v3, v1}, Lorg/snmp4j/security/USM;->fireIncrementCounter(Lorg/snmp4j/event/CounterEvent;)V

    new-instance v2, Lorg/snmp4j/smi/Integer32;

    invoke-direct {v2, v0}, Lorg/snmp4j/smi/Integer32;-><init>(I)V

    invoke-virtual {v5, v2}, Lorg/snmp4j/mp/StatusInformation;->setSecurityLevel(Lorg/snmp4j/smi/Integer32;)V

    new-instance v0, Lorg/snmp4j/smi/VariableBinding;

    invoke-virtual {v1}, Lorg/snmp4j/event/CounterEvent;->getOid()Lorg/snmp4j/smi/OID;

    move-result-object v2

    invoke-virtual {v1}, Lorg/snmp4j/event/CounterEvent;->getCurrentValue()Lorg/snmp4j/smi/Variable;

    move-result-object v1

    invoke-direct {v0, v2, v1}, Lorg/snmp4j/smi/VariableBinding;-><init>(Lorg/snmp4j/smi/OID;Lorg/snmp4j/smi/Variable;)V

    invoke-virtual {v5, v0}, Lorg/snmp4j/mp/StatusInformation;->setErrorIndication(Lorg/snmp4j/smi/VariableBinding;)V

    :goto_7
    const/16 v0, 0x582

    goto :goto_8

    :cond_1e
    move-object/from16 v3, p0

    goto :goto_7

    :goto_8
    return v0
.end method

.method public removeAllUsers(Lorg/snmp4j/smi/OctetString;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/snmp4j/smi/OctetString;",
            ")",
            "Ljava/util/List<",
            "Lorg/snmp4j/security/UsmUser;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    .line 8
    invoke-virtual {p0, p1, v0}, Lorg/snmp4j/security/USM;->removeAllUsers(Lorg/snmp4j/smi/OctetString;Lorg/snmp4j/smi/OctetString;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public removeAllUsers(Lorg/snmp4j/smi/OctetString;Lorg/snmp4j/smi/OctetString;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/snmp4j/smi/OctetString;",
            "Lorg/snmp4j/smi/OctetString;",
            ")",
            "Ljava/util/List<",
            "Lorg/snmp4j/security/UsmUser;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lorg/snmp4j/security/USM;->userTable:Lorg/snmp4j/security/UsmUserTable;

    invoke-virtual {v0, p1, p2}, Lorg/snmp4j/security/UsmUserTable;->removeAllUsers(Lorg/snmp4j/smi/OctetString;Lorg/snmp4j/smi/OctetString;)Ljava/util/List;

    move-result-object p1

    .line 2
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_1

    .line 3
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 4
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/snmp4j/security/UsmUserEntry;

    .line 5
    invoke-virtual {v0}, Lorg/snmp4j/security/UsmUserEntry;->getUsmUser()Lorg/snmp4j/security/UsmUser;

    move-result-object v1

    invoke-interface {p2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 6
    new-instance v1, Lorg/snmp4j/event/UsmUserEvent;

    const/4 v2, 0x2

    invoke-direct {v1, p0, v0, v2}, Lorg/snmp4j/event/UsmUserEvent;-><init>(Lorg/snmp4j/security/SecurityModel;Lorg/snmp4j/security/UsmUserEntry;I)V

    invoke-virtual {p0, v1}, Lorg/snmp4j/security/USM;->fireUsmUserChange(Lorg/snmp4j/event/UsmUserEvent;)V

    goto :goto_0

    :cond_0
    return-object p2

    .line 7
    :cond_1
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public removeAllUsers()V
    .locals 3

    .line 9
    iget-object v0, p0, Lorg/snmp4j/security/USM;->userTable:Lorg/snmp4j/security/UsmUserTable;

    invoke-virtual {v0}, Lorg/snmp4j/security/UsmUserTable;->clear()V

    .line 10
    new-instance v0, Lorg/snmp4j/event/UsmUserEvent;

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-direct {v0, p0, v1, v2}, Lorg/snmp4j/event/UsmUserEvent;-><init>(Lorg/snmp4j/security/SecurityModel;Lorg/snmp4j/security/UsmUserEntry;I)V

    invoke-virtual {p0, v0}, Lorg/snmp4j/security/USM;->fireUsmUserChange(Lorg/snmp4j/event/UsmUserEvent;)V

    return-void
.end method

.method public removeEngineTime(Lorg/snmp4j/smi/OctetString;)V
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/security/USM;->timeTable:Lorg/snmp4j/security/UsmTimeTable;

    invoke-virtual {v0, p1}, Lorg/snmp4j/security/UsmTimeTable;->removeEntry(Lorg/snmp4j/smi/OctetString;)V

    return-void
.end method

.method public removeUser(Lorg/snmp4j/smi/OctetString;Lorg/snmp4j/smi/OctetString;)Lorg/snmp4j/security/UsmUser;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/security/USM;->userTable:Lorg/snmp4j/security/UsmUserTable;

    invoke-virtual {v0, p1, p2}, Lorg/snmp4j/security/UsmUserTable;->removeUser(Lorg/snmp4j/smi/OctetString;Lorg/snmp4j/smi/OctetString;)Lorg/snmp4j/security/UsmUserEntry;

    move-result-object p1

    if-eqz p1, :cond_0

    new-instance p2, Lorg/snmp4j/event/UsmUserEvent;

    const/4 v0, 0x2

    invoke-direct {p2, p0, p1, v0}, Lorg/snmp4j/event/UsmUserEvent;-><init>(Lorg/snmp4j/security/SecurityModel;Lorg/snmp4j/security/UsmUserEntry;I)V

    invoke-virtual {p0, p2}, Lorg/snmp4j/security/USM;->fireUsmUserChange(Lorg/snmp4j/event/UsmUserEvent;)V

    invoke-virtual {p1}, Lorg/snmp4j/security/UsmUserEntry;->getUsmUser()Lorg/snmp4j/security/UsmUser;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public declared-synchronized removeUsmUserListener(Lorg/snmp4j/event/UsmUserListener;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lorg/snmp4j/security/USM;->usmUserListeners:Ljava/util/Vector;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Ljava/util/Vector;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/snmp4j/security/USM;->usmUserListeners:Ljava/util/Vector;

    invoke-virtual {v0, p1}, Ljava/util/Vector;->remove(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit p0

    return-void

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public setCounterSupport(Lorg/snmp4j/mp/CounterSupport;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lorg/snmp4j/security/USM;->counterSupport:Lorg/snmp4j/mp/CounterSupport;

    return-void
.end method

.method public setEngineBoots(I)V
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/security/USM;->timeTable:Lorg/snmp4j/security/UsmTimeTable;

    invoke-virtual {v0, p1}, Lorg/snmp4j/security/UsmTimeTable;->setEngineBoots(I)V

    return-void
.end method

.method public setEngineDiscoveryEnabled(Z)V
    .locals 0

    iput-boolean p1, p0, Lorg/snmp4j/security/USM;->engineDiscoveryEnabled:Z

    return-void
.end method

.method public setLocalEngine(Lorg/snmp4j/smi/OctetString;II)V
    .locals 2

    iput-object p1, p0, Lorg/snmp4j/security/SNMPv3SecurityModel;->localEngineID:Lorg/snmp4j/smi/OctetString;

    iget-object v0, p0, Lorg/snmp4j/security/USM;->timeTable:Lorg/snmp4j/security/UsmTimeTable;

    new-instance v1, Lorg/snmp4j/security/UsmTimeEntry;

    invoke-direct {v1, p1, p2, p3}, Lorg/snmp4j/security/UsmTimeEntry;-><init>(Lorg/snmp4j/smi/OctetString;II)V

    invoke-virtual {v0, v1}, Lorg/snmp4j/security/UsmTimeTable;->setLocalTime(Lorg/snmp4j/security/UsmTimeEntry;)V

    return-void
.end method

.method public setUsers([Lorg/snmp4j/security/UsmUser;)V
    .locals 6

    if-eqz p1, :cond_2

    array-length v0, p1

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    new-instance v0, Ljava/util/Vector;

    array-length v1, p1

    invoke-direct {v0, v1}, Ljava/util/Vector;-><init>(I)V

    array-length v1, p1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, p1, v2

    new-instance v4, Lorg/snmp4j/security/UsmUserEntry;

    invoke-virtual {v3}, Lorg/snmp4j/security/UsmUser;->getSecurityName()Lorg/snmp4j/smi/OctetString;

    move-result-object v5

    invoke-virtual {v3}, Lorg/snmp4j/security/UsmUser;->clone()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lorg/snmp4j/security/UsmUser;

    invoke-direct {v4, v5, v3}, Lorg/snmp4j/security/UsmUserEntry;-><init>(Lorg/snmp4j/smi/OctetString;Lorg/snmp4j/security/UsmUser;)V

    invoke-virtual {v0, v4}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lorg/snmp4j/security/USM;->userTable:Lorg/snmp4j/security/UsmUserTable;

    invoke-virtual {p1, v0}, Lorg/snmp4j/security/UsmUserTable;->setUsers(Ljava/util/Collection;)V

    goto :goto_2

    :cond_2
    :goto_1
    iget-object p1, p0, Lorg/snmp4j/security/USM;->userTable:Lorg/snmp4j/security/UsmUserTable;

    invoke-virtual {p1}, Lorg/snmp4j/security/UsmUserTable;->clear()V

    :goto_2
    return-void
.end method

.method public supportsEngineIdDiscovery()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public updateUser(Lorg/snmp4j/security/UsmUserEntry;)V
    .locals 2

    iget-object v0, p0, Lorg/snmp4j/security/USM;->userTable:Lorg/snmp4j/security/UsmUserTable;

    invoke-virtual {v0, p1}, Lorg/snmp4j/security/UsmUserTable;->addUser(Lorg/snmp4j/security/UsmUserEntry;)Lorg/snmp4j/security/UsmUserEntry;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lorg/snmp4j/security/UsmUserEntry;->getStorageType()Lorg/snmp4j/mp/SnmpConstants$StorageTypeEnum;

    move-result-object v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, Lorg/snmp4j/security/UsmUserEntry;->getStorageType()Lorg/snmp4j/mp/SnmpConstants$StorageTypeEnum;

    move-result-object v1

    invoke-virtual {p1, v1}, Lorg/snmp4j/security/UsmUserEntry;->setStorageType(Lorg/snmp4j/mp/SnmpConstants$StorageTypeEnum;)V

    :cond_0
    new-instance v1, Lorg/snmp4j/event/UsmUserEvent;

    if-nez v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x3

    :goto_0
    invoke-direct {v1, p0, p1, v0}, Lorg/snmp4j/event/UsmUserEvent;-><init>(Lorg/snmp4j/security/SecurityModel;Lorg/snmp4j/security/UsmUserEntry;I)V

    invoke-virtual {p0, v1}, Lorg/snmp4j/security/USM;->fireUsmUserChange(Lorg/snmp4j/event/UsmUserEvent;)V

    return-void
.end method
