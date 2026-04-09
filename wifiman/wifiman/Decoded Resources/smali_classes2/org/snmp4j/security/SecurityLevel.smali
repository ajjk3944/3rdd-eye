.class public final enum Lorg/snmp4j/security/SecurityLevel;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lorg/snmp4j/security/SecurityLevel;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lorg/snmp4j/security/SecurityLevel;

.field public static final AUTH_NOPRIV:I = 0x2

.field public static final AUTH_PRIV:I = 0x3

.field public static final NOAUTH_NOPRIV:I = 0x1

.field public static final enum authNoPriv:Lorg/snmp4j/security/SecurityLevel;

.field public static final enum authPriv:Lorg/snmp4j/security/SecurityLevel;

.field public static final enum noAuthNoPriv:Lorg/snmp4j/security/SecurityLevel;

.field public static final enum undefined:Lorg/snmp4j/security/SecurityLevel;


# instance fields
.field private snmpValue:I


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lorg/snmp4j/security/SecurityLevel;

    const-string v1, "undefined"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lorg/snmp4j/security/SecurityLevel;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lorg/snmp4j/security/SecurityLevel;->undefined:Lorg/snmp4j/security/SecurityLevel;

    new-instance v1, Lorg/snmp4j/security/SecurityLevel;

    const-string v2, "noAuthNoPriv"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3, v3}, Lorg/snmp4j/security/SecurityLevel;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lorg/snmp4j/security/SecurityLevel;->noAuthNoPriv:Lorg/snmp4j/security/SecurityLevel;

    new-instance v2, Lorg/snmp4j/security/SecurityLevel;

    const-string v3, "authNoPriv"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4, v4}, Lorg/snmp4j/security/SecurityLevel;-><init>(Ljava/lang/String;II)V

    sput-object v2, Lorg/snmp4j/security/SecurityLevel;->authNoPriv:Lorg/snmp4j/security/SecurityLevel;

    new-instance v3, Lorg/snmp4j/security/SecurityLevel;

    const-string v4, "authPriv"

    const/4 v5, 0x3

    invoke-direct {v3, v4, v5, v5}, Lorg/snmp4j/security/SecurityLevel;-><init>(Ljava/lang/String;II)V

    sput-object v3, Lorg/snmp4j/security/SecurityLevel;->authPriv:Lorg/snmp4j/security/SecurityLevel;

    filled-new-array {v0, v1, v2, v3}, [Lorg/snmp4j/security/SecurityLevel;

    move-result-object v0

    sput-object v0, Lorg/snmp4j/security/SecurityLevel;->$VALUES:[Lorg/snmp4j/security/SecurityLevel;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lorg/snmp4j/security/SecurityLevel;->snmpValue:I

    return-void
.end method

.method public static get(I)Lorg/snmp4j/security/SecurityLevel;
    .locals 1

    const/4 v0, 0x1

    if-eq p0, v0, :cond_2

    const/4 v0, 0x2

    if-eq p0, v0, :cond_1

    const/4 v0, 0x3

    if-eq p0, v0, :cond_0

    sget-object p0, Lorg/snmp4j/security/SecurityLevel;->undefined:Lorg/snmp4j/security/SecurityLevel;

    return-object p0

    :cond_0
    sget-object p0, Lorg/snmp4j/security/SecurityLevel;->authPriv:Lorg/snmp4j/security/SecurityLevel;

    return-object p0

    :cond_1
    sget-object p0, Lorg/snmp4j/security/SecurityLevel;->authNoPriv:Lorg/snmp4j/security/SecurityLevel;

    return-object p0

    :cond_2
    sget-object p0, Lorg/snmp4j/security/SecurityLevel;->noAuthNoPriv:Lorg/snmp4j/security/SecurityLevel;

    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lorg/snmp4j/security/SecurityLevel;
    .locals 1

    const-class v0, Lorg/snmp4j/security/SecurityLevel;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lorg/snmp4j/security/SecurityLevel;

    return-object p0
.end method

.method public static values()[Lorg/snmp4j/security/SecurityLevel;
    .locals 1

    sget-object v0, Lorg/snmp4j/security/SecurityLevel;->$VALUES:[Lorg/snmp4j/security/SecurityLevel;

    invoke-virtual {v0}, [Lorg/snmp4j/security/SecurityLevel;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lorg/snmp4j/security/SecurityLevel;

    return-object v0
.end method


# virtual methods
.method public getSnmpValue()I
    .locals 1

    iget v0, p0, Lorg/snmp4j/security/SecurityLevel;->snmpValue:I

    return v0
.end method
