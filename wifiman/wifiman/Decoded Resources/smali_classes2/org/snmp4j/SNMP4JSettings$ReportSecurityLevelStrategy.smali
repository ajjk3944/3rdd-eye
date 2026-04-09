.class public final enum Lorg/snmp4j/SNMP4JSettings$ReportSecurityLevelStrategy;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/snmp4j/SNMP4JSettings;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "ReportSecurityLevelStrategy"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lorg/snmp4j/SNMP4JSettings$ReportSecurityLevelStrategy;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lorg/snmp4j/SNMP4JSettings$ReportSecurityLevelStrategy;

.field public static final enum neverNoAuthNoPriv:Lorg/snmp4j/SNMP4JSettings$ReportSecurityLevelStrategy;

.field public static final enum noAuthNoPrivIfNeeded:Lorg/snmp4j/SNMP4JSettings$ReportSecurityLevelStrategy;

.field public static final enum standard:Lorg/snmp4j/SNMP4JSettings$ReportSecurityLevelStrategy;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lorg/snmp4j/SNMP4JSettings$ReportSecurityLevelStrategy;

    const-string v1, "noAuthNoPrivIfNeeded"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lorg/snmp4j/SNMP4JSettings$ReportSecurityLevelStrategy;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/snmp4j/SNMP4JSettings$ReportSecurityLevelStrategy;->noAuthNoPrivIfNeeded:Lorg/snmp4j/SNMP4JSettings$ReportSecurityLevelStrategy;

    new-instance v1, Lorg/snmp4j/SNMP4JSettings$ReportSecurityLevelStrategy;

    const-string v2, "standard"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Lorg/snmp4j/SNMP4JSettings$ReportSecurityLevelStrategy;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lorg/snmp4j/SNMP4JSettings$ReportSecurityLevelStrategy;->standard:Lorg/snmp4j/SNMP4JSettings$ReportSecurityLevelStrategy;

    new-instance v2, Lorg/snmp4j/SNMP4JSettings$ReportSecurityLevelStrategy;

    const-string v3, "neverNoAuthNoPriv"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Lorg/snmp4j/SNMP4JSettings$ReportSecurityLevelStrategy;-><init>(Ljava/lang/String;I)V

    sput-object v2, Lorg/snmp4j/SNMP4JSettings$ReportSecurityLevelStrategy;->neverNoAuthNoPriv:Lorg/snmp4j/SNMP4JSettings$ReportSecurityLevelStrategy;

    filled-new-array {v0, v1, v2}, [Lorg/snmp4j/SNMP4JSettings$ReportSecurityLevelStrategy;

    move-result-object v0

    sput-object v0, Lorg/snmp4j/SNMP4JSettings$ReportSecurityLevelStrategy;->$VALUES:[Lorg/snmp4j/SNMP4JSettings$ReportSecurityLevelStrategy;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lorg/snmp4j/SNMP4JSettings$ReportSecurityLevelStrategy;
    .locals 1

    const-class v0, Lorg/snmp4j/SNMP4JSettings$ReportSecurityLevelStrategy;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lorg/snmp4j/SNMP4JSettings$ReportSecurityLevelStrategy;

    return-object p0
.end method

.method public static values()[Lorg/snmp4j/SNMP4JSettings$ReportSecurityLevelStrategy;
    .locals 1

    sget-object v0, Lorg/snmp4j/SNMP4JSettings$ReportSecurityLevelStrategy;->$VALUES:[Lorg/snmp4j/SNMP4JSettings$ReportSecurityLevelStrategy;

    invoke-virtual {v0}, [Lorg/snmp4j/SNMP4JSettings$ReportSecurityLevelStrategy;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lorg/snmp4j/SNMP4JSettings$ReportSecurityLevelStrategy;

    return-object v0
.end method
