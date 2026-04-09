.class public Lorg/snmp4j/security/SecurityModels;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static instance:Lorg/snmp4j/security/SecurityModels;


# instance fields
.field private securityModels:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lorg/snmp4j/smi/Integer32;",
            "Lorg/snmp4j/security/SecurityModel;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/Hashtable;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Ljava/util/Hashtable;-><init>(I)V

    iput-object v0, p0, Lorg/snmp4j/security/SecurityModels;->securityModels:Ljava/util/Map;

    return-void
.end method

.method public static getCollection([Lorg/snmp4j/security/SecurityModel;)Lorg/snmp4j/security/SecurityModels;
    .locals 4

    new-instance v0, Lorg/snmp4j/security/SecurityModels;

    invoke-direct {v0}, Lorg/snmp4j/security/SecurityModels;-><init>()V

    array-length v1, p0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, p0, v2

    invoke-virtual {v0, v3}, Lorg/snmp4j/security/SecurityModels;->addSecurityModel(Lorg/snmp4j/security/SecurityModel;)Lorg/snmp4j/security/SecurityModels;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public static declared-synchronized getInstance()Lorg/snmp4j/security/SecurityModels;
    .locals 2

    const-class v0, Lorg/snmp4j/security/SecurityModels;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lorg/snmp4j/security/SecurityModels;->instance:Lorg/snmp4j/security/SecurityModels;

    if-nez v1, :cond_0

    new-instance v1, Lorg/snmp4j/security/SecurityModels;

    invoke-direct {v1}, Lorg/snmp4j/security/SecurityModels;-><init>()V

    sput-object v1, Lorg/snmp4j/security/SecurityModels;->instance:Lorg/snmp4j/security/SecurityModels;

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    sget-object v1, Lorg/snmp4j/security/SecurityModels;->instance:Lorg/snmp4j/security/SecurityModels;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method


# virtual methods
.method public addSecurityModel(Lorg/snmp4j/security/SecurityModel;)Lorg/snmp4j/security/SecurityModels;
    .locals 3

    iget-object v0, p0, Lorg/snmp4j/security/SecurityModels;->securityModels:Ljava/util/Map;

    new-instance v1, Lorg/snmp4j/smi/Integer32;

    invoke-interface {p1}, Lorg/snmp4j/security/SecurityModel;->getID()I

    move-result v2

    invoke-direct {v1, v2}, Lorg/snmp4j/smi/Integer32;-><init>(I)V

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method

.method public getSecurityModel(Lorg/snmp4j/smi/Integer32;)Lorg/snmp4j/security/SecurityModel;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/security/SecurityModels;->securityModels:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lorg/snmp4j/security/SecurityModel;

    return-object p1
.end method

.method public removeSecurityModel(Lorg/snmp4j/smi/Integer32;)Lorg/snmp4j/security/SecurityModel;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/security/SecurityModels;->securityModels:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lorg/snmp4j/security/SecurityModel;

    return-object p1
.end method
