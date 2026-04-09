.class public Lorg/snmp4j/log/LogLevel;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final ALL:Lorg/snmp4j/log/LogLevel;

.field public static final DEBUG:Lorg/snmp4j/log/LogLevel;

.field public static final ERROR:Lorg/snmp4j/log/LogLevel;

.field public static final FATAL:Lorg/snmp4j/log/LogLevel;

.field public static final INFO:Lorg/snmp4j/log/LogLevel;

.field public static final LEVEL_ALL:I = 0x2

.field public static final LEVEL_DEBUG:I = 0x4

.field public static final LEVEL_ERROR:I = 0x7

.field public static final LEVEL_FATAL:I = 0x8

.field public static final LEVEL_INFO:I = 0x5

.field public static final LEVEL_NONE:I = 0x0

.field public static final LEVEL_OFF:I = 0x1

.field private static final LEVEL_STRINGS:[Ljava/lang/String;

.field public static final LEVEL_TRACE:I = 0x3

.field public static final LEVEL_WARN:I = 0x6

.field public static final NONE:Lorg/snmp4j/log/LogLevel;

.field public static final OFF:Lorg/snmp4j/log/LogLevel;

.field public static final TRACE:Lorg/snmp4j/log/LogLevel;

.field public static final WARN:Lorg/snmp4j/log/LogLevel;


# instance fields
.field private level:I


# direct methods
.method static constructor <clinit>()V
    .locals 9

    const-string v7, "ERROR"

    const-string v8, "FATAL"

    const-string v0, "NONE"

    const-string v1, "OFF"

    const-string v2, "ALL"

    const-string v3, "TRACE"

    const-string v4, "DEBUG"

    const-string v5, "INFO"

    const-string v6, "WARN"

    filled-new-array/range {v0 .. v8}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lorg/snmp4j/log/LogLevel;->LEVEL_STRINGS:[Ljava/lang/String;

    new-instance v0, Lorg/snmp4j/log/LogLevel;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lorg/snmp4j/log/LogLevel;-><init>(I)V

    sput-object v0, Lorg/snmp4j/log/LogLevel;->NONE:Lorg/snmp4j/log/LogLevel;

    new-instance v0, Lorg/snmp4j/log/LogLevel;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lorg/snmp4j/log/LogLevel;-><init>(I)V

    sput-object v0, Lorg/snmp4j/log/LogLevel;->OFF:Lorg/snmp4j/log/LogLevel;

    new-instance v0, Lorg/snmp4j/log/LogLevel;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Lorg/snmp4j/log/LogLevel;-><init>(I)V

    sput-object v0, Lorg/snmp4j/log/LogLevel;->ALL:Lorg/snmp4j/log/LogLevel;

    new-instance v0, Lorg/snmp4j/log/LogLevel;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Lorg/snmp4j/log/LogLevel;-><init>(I)V

    sput-object v0, Lorg/snmp4j/log/LogLevel;->TRACE:Lorg/snmp4j/log/LogLevel;

    new-instance v0, Lorg/snmp4j/log/LogLevel;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Lorg/snmp4j/log/LogLevel;-><init>(I)V

    sput-object v0, Lorg/snmp4j/log/LogLevel;->DEBUG:Lorg/snmp4j/log/LogLevel;

    new-instance v0, Lorg/snmp4j/log/LogLevel;

    const/4 v1, 0x5

    invoke-direct {v0, v1}, Lorg/snmp4j/log/LogLevel;-><init>(I)V

    sput-object v0, Lorg/snmp4j/log/LogLevel;->INFO:Lorg/snmp4j/log/LogLevel;

    new-instance v0, Lorg/snmp4j/log/LogLevel;

    const/4 v1, 0x6

    invoke-direct {v0, v1}, Lorg/snmp4j/log/LogLevel;-><init>(I)V

    sput-object v0, Lorg/snmp4j/log/LogLevel;->WARN:Lorg/snmp4j/log/LogLevel;

    new-instance v0, Lorg/snmp4j/log/LogLevel;

    const/4 v1, 0x7

    invoke-direct {v0, v1}, Lorg/snmp4j/log/LogLevel;-><init>(I)V

    sput-object v0, Lorg/snmp4j/log/LogLevel;->ERROR:Lorg/snmp4j/log/LogLevel;

    new-instance v0, Lorg/snmp4j/log/LogLevel;

    const/16 v1, 0x8

    invoke-direct {v0, v1}, Lorg/snmp4j/log/LogLevel;-><init>(I)V

    sput-object v0, Lorg/snmp4j/log/LogLevel;->FATAL:Lorg/snmp4j/log/LogLevel;

    return-void
.end method

.method public constructor <init>(I)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-ltz p1, :cond_0

    const/16 v0, 0x8

    if-gt p1, v0, :cond_0

    .line 2
    iput p1, p0, Lorg/snmp4j/log/LogLevel;->level:I

    return-void

    .line 3
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unknown log level "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 4
    invoke-static {p1}, Lorg/snmp4j/log/LogLevel;->levelFromString(Ljava/lang/String;)I

    move-result p1

    invoke-direct {p0, p1}, Lorg/snmp4j/log/LogLevel;-><init>(I)V

    return-void
.end method

.method public static levelFromString(Ljava/lang/String;)I
    .locals 3

    const/4 v0, 0x0

    :goto_0
    sget-object v1, Lorg/snmp4j/log/LogLevel;->LEVEL_STRINGS:[Ljava/lang/String;

    array-length v2, v1

    if-ge v0, v2, :cond_1

    aget-object v1, v1, v0

    invoke-virtual {v1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, -0x1

    :goto_1
    return v0
.end method

.method public static toLevel(Ljava/lang/String;)Lorg/snmp4j/log/LogLevel;
    .locals 1

    new-instance v0, Lorg/snmp4j/log/LogLevel;

    invoke-static {p0}, Lorg/snmp4j/log/LogLevel;->levelFromString(Ljava/lang/String;)I

    move-result p0

    invoke-direct {v0, p0}, Lorg/snmp4j/log/LogLevel;-><init>(I)V

    return-object v0
.end method


# virtual methods
.method public getLevel()I
    .locals 1

    iget v0, p0, Lorg/snmp4j/log/LogLevel;->level:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    sget-object v0, Lorg/snmp4j/log/LogLevel;->LEVEL_STRINGS:[Ljava/lang/String;

    iget v1, p0, Lorg/snmp4j/log/LogLevel;->level:I

    aget-object v0, v0, v1

    return-object v0
.end method
