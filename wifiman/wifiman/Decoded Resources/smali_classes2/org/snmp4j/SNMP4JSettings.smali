.class public final Lorg/snmp4j/SNMP4JSettings;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/snmp4j/SNMP4JSettings$Snmp4jStatistics;,
        Lorg/snmp4j/SNMP4JSettings$ReportSecurityLevelStrategy;
    }
.end annotation


# static fields
.field public static final AGENTPP_ENTERPRISE_ID:I = 0x1370

.field private static allowSNMPv2InV1:Z = false

.field private static checkUsmUserPassphraseLength:Z = false

.field private static enterpriseID:I = 0x0

.field private static extensibilityEnabled:Z = false

.field private static volatile forwardRuntimeExceptions:Z = false

.field private static maxEngineIdCacheSize:I = 0xc350

.field private static noGetBulk:Z

.field private static oidTextFormat:Lorg/snmp4j/util/OIDTextFormat;

.field private static reportSecurityLevelStrategy:Lorg/snmp4j/SNMP4JSettings$ReportSecurityLevelStrategy;

.field private static snmp4jStatistics:Lorg/snmp4j/SNMP4JSettings$Snmp4jStatistics;

.field private static threadFactory:Lorg/snmp4j/util/ThreadFactory;

.field private static threadJoinTimeout:J

.field private static timerFactory:Lorg/snmp4j/util/TimerFactory;

.field private static variableTextFormat:Lorg/snmp4j/util/VariableTextFormat;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lorg/snmp4j/util/DefaultThreadFactory;

    invoke-direct {v0}, Lorg/snmp4j/util/DefaultThreadFactory;-><init>()V

    sput-object v0, Lorg/snmp4j/SNMP4JSettings;->threadFactory:Lorg/snmp4j/util/ThreadFactory;

    new-instance v0, Lorg/snmp4j/util/DefaultTimerFactory;

    invoke-direct {v0}, Lorg/snmp4j/util/DefaultTimerFactory;-><init>()V

    sput-object v0, Lorg/snmp4j/SNMP4JSettings;->timerFactory:Lorg/snmp4j/util/TimerFactory;

    new-instance v0, Lorg/snmp4j/util/SimpleOIDTextFormat;

    invoke-direct {v0}, Lorg/snmp4j/util/SimpleOIDTextFormat;-><init>()V

    sput-object v0, Lorg/snmp4j/SNMP4JSettings;->oidTextFormat:Lorg/snmp4j/util/OIDTextFormat;

    new-instance v0, Lorg/snmp4j/util/SimpleVariableTextFormat;

    invoke-direct {v0}, Lorg/snmp4j/util/SimpleVariableTextFormat;-><init>()V

    sput-object v0, Lorg/snmp4j/SNMP4JSettings;->variableTextFormat:Lorg/snmp4j/util/VariableTextFormat;

    const-wide/32 v0, 0xea60

    sput-wide v0, Lorg/snmp4j/SNMP4JSettings;->threadJoinTimeout:J

    const/4 v0, 0x0

    sput-boolean v0, Lorg/snmp4j/SNMP4JSettings;->allowSNMPv2InV1:Z

    sput-boolean v0, Lorg/snmp4j/SNMP4JSettings;->noGetBulk:Z

    sget-object v0, Lorg/snmp4j/SNMP4JSettings$ReportSecurityLevelStrategy;->standard:Lorg/snmp4j/SNMP4JSettings$ReportSecurityLevelStrategy;

    sput-object v0, Lorg/snmp4j/SNMP4JSettings;->reportSecurityLevelStrategy:Lorg/snmp4j/SNMP4JSettings$ReportSecurityLevelStrategy;

    const/16 v0, 0x1370

    sput v0, Lorg/snmp4j/SNMP4JSettings;->enterpriseID:I

    sget-object v0, Lorg/snmp4j/SNMP4JSettings$Snmp4jStatistics;->basic:Lorg/snmp4j/SNMP4JSettings$Snmp4jStatistics;

    sput-object v0, Lorg/snmp4j/SNMP4JSettings;->snmp4jStatistics:Lorg/snmp4j/SNMP4JSettings$Snmp4jStatistics;

    const/4 v0, 0x1

    sput-boolean v0, Lorg/snmp4j/SNMP4JSettings;->checkUsmUserPassphraseLength:Z

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getEnterpriseID()I
    .locals 1

    sget v0, Lorg/snmp4j/SNMP4JSettings;->enterpriseID:I

    return v0
.end method

.method public static getMaxEngineIdCacheSize()I
    .locals 1

    sget v0, Lorg/snmp4j/SNMP4JSettings;->maxEngineIdCacheSize:I

    return v0
.end method

.method public static getOIDTextFormat()Lorg/snmp4j/util/OIDTextFormat;
    .locals 1

    sget-object v0, Lorg/snmp4j/SNMP4JSettings;->oidTextFormat:Lorg/snmp4j/util/OIDTextFormat;

    return-object v0
.end method

.method public static getReportSecurityLevelStrategy()Lorg/snmp4j/SNMP4JSettings$ReportSecurityLevelStrategy;
    .locals 1

    sget-object v0, Lorg/snmp4j/SNMP4JSettings;->reportSecurityLevelStrategy:Lorg/snmp4j/SNMP4JSettings$ReportSecurityLevelStrategy;

    return-object v0
.end method

.method public static getSnmp4jStatistics()Lorg/snmp4j/SNMP4JSettings$Snmp4jStatistics;
    .locals 1

    sget-object v0, Lorg/snmp4j/SNMP4JSettings;->snmp4jStatistics:Lorg/snmp4j/SNMP4JSettings$Snmp4jStatistics;

    return-object v0
.end method

.method public static getThreadFactory()Lorg/snmp4j/util/ThreadFactory;
    .locals 1

    sget-object v0, Lorg/snmp4j/SNMP4JSettings;->threadFactory:Lorg/snmp4j/util/ThreadFactory;

    return-object v0
.end method

.method public static getThreadJoinTimeout()J
    .locals 2

    sget-wide v0, Lorg/snmp4j/SNMP4JSettings;->threadJoinTimeout:J

    return-wide v0
.end method

.method public static getTimerFactory()Lorg/snmp4j/util/TimerFactory;
    .locals 1

    sget-object v0, Lorg/snmp4j/SNMP4JSettings;->timerFactory:Lorg/snmp4j/util/TimerFactory;

    return-object v0
.end method

.method public static getVariableTextFormat()Lorg/snmp4j/util/VariableTextFormat;
    .locals 1

    sget-object v0, Lorg/snmp4j/SNMP4JSettings;->variableTextFormat:Lorg/snmp4j/util/VariableTextFormat;

    return-object v0
.end method

.method public static isAllowSNMPv2InV1()Z
    .locals 1

    sget-boolean v0, Lorg/snmp4j/SNMP4JSettings;->allowSNMPv2InV1:Z

    return v0
.end method

.method public static isCheckUsmUserPassphraseLength()Z
    .locals 1

    sget-boolean v0, Lorg/snmp4j/SNMP4JSettings;->checkUsmUserPassphraseLength:Z

    return v0
.end method

.method public static isExtensibilityEnabled()Z
    .locals 1

    sget-boolean v0, Lorg/snmp4j/SNMP4JSettings;->extensibilityEnabled:Z

    return v0
.end method

.method public static isForwardRuntimeExceptions()Z
    .locals 1

    sget-boolean v0, Lorg/snmp4j/SNMP4JSettings;->forwardRuntimeExceptions:Z

    return v0
.end method

.method public static isNoGetBulk()Z
    .locals 1

    sget-boolean v0, Lorg/snmp4j/SNMP4JSettings;->noGetBulk:Z

    return v0
.end method

.method public static setAllowSNMPv2InV1(Z)V
    .locals 0

    sput-boolean p0, Lorg/snmp4j/SNMP4JSettings;->allowSNMPv2InV1:Z

    return-void
.end method

.method public static setCheckUsmUserPassphraseLength(Z)V
    .locals 0

    sput-boolean p0, Lorg/snmp4j/SNMP4JSettings;->checkUsmUserPassphraseLength:Z

    return-void
.end method

.method public static setEnterpriseID(I)V
    .locals 0

    sput p0, Lorg/snmp4j/SNMP4JSettings;->enterpriseID:I

    return-void
.end method

.method public static setExtensibilityEnabled(Z)V
    .locals 0

    sput-boolean p0, Lorg/snmp4j/SNMP4JSettings;->extensibilityEnabled:Z

    return-void
.end method

.method public static setForwardRuntimeExceptions(Z)V
    .locals 0

    sput-boolean p0, Lorg/snmp4j/SNMP4JSettings;->forwardRuntimeExceptions:Z

    return-void
.end method

.method public static setMaxEngineIdCacheSize(I)V
    .locals 0

    sput p0, Lorg/snmp4j/SNMP4JSettings;->maxEngineIdCacheSize:I

    return-void
.end method

.method public static setNoGetBulk(Z)V
    .locals 0

    sput-boolean p0, Lorg/snmp4j/SNMP4JSettings;->noGetBulk:Z

    return-void
.end method

.method public static setOIDTextFormat(Lorg/snmp4j/util/OIDTextFormat;)V
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sput-object p0, Lorg/snmp4j/SNMP4JSettings;->oidTextFormat:Lorg/snmp4j/util/OIDTextFormat;

    return-void
.end method

.method public static setReportSecurityLevelStrategy(Lorg/snmp4j/SNMP4JSettings$ReportSecurityLevelStrategy;)V
    .locals 0

    sput-object p0, Lorg/snmp4j/SNMP4JSettings;->reportSecurityLevelStrategy:Lorg/snmp4j/SNMP4JSettings$ReportSecurityLevelStrategy;

    return-void
.end method

.method public static setSnmp4jStatistics(Lorg/snmp4j/SNMP4JSettings$Snmp4jStatistics;)V
    .locals 0

    sput-object p0, Lorg/snmp4j/SNMP4JSettings;->snmp4jStatistics:Lorg/snmp4j/SNMP4JSettings$Snmp4jStatistics;

    return-void
.end method

.method public static setThreadFactory(Lorg/snmp4j/util/ThreadFactory;)V
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sput-object p0, Lorg/snmp4j/SNMP4JSettings;->threadFactory:Lorg/snmp4j/util/ThreadFactory;

    return-void
.end method

.method public static setThreadJoinTimeout(J)V
    .locals 0

    sput-wide p0, Lorg/snmp4j/SNMP4JSettings;->threadJoinTimeout:J

    return-void
.end method

.method public static setTimerFactory(Lorg/snmp4j/util/TimerFactory;)V
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sput-object p0, Lorg/snmp4j/SNMP4JSettings;->timerFactory:Lorg/snmp4j/util/TimerFactory;

    return-void
.end method

.method public static setVariableTextFormat(Lorg/snmp4j/util/VariableTextFormat;)V
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sput-object p0, Lorg/snmp4j/SNMP4JSettings;->variableTextFormat:Lorg/snmp4j/util/VariableTextFormat;

    return-void
.end method
