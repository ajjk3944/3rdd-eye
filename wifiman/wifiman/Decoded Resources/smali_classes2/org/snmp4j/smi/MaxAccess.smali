.class public final enum Lorg/snmp4j/smi/MaxAccess;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lorg/snmp4j/smi/MaxAccess;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lorg/snmp4j/smi/MaxAccess;

.field public static final enum accessibleForNotify:Lorg/snmp4j/smi/MaxAccess;

.field public static final enum notAccessible:Lorg/snmp4j/smi/MaxAccess;

.field public static final enum readCreate:Lorg/snmp4j/smi/MaxAccess;

.field public static final enum readOnly:Lorg/snmp4j/smi/MaxAccess;

.field public static final enum readWrite:Lorg/snmp4j/smi/MaxAccess;

.field public static final enum writeOnly:Lorg/snmp4j/smi/MaxAccess;


# instance fields
.field private smiValue:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    new-instance v0, Lorg/snmp4j/smi/MaxAccess;

    const/4 v1, 0x0

    const-string v2, "not-accessible"

    const-string v3, "notAccessible"

    invoke-direct {v0, v3, v1, v2}, Lorg/snmp4j/smi/MaxAccess;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lorg/snmp4j/smi/MaxAccess;->notAccessible:Lorg/snmp4j/smi/MaxAccess;

    new-instance v1, Lorg/snmp4j/smi/MaxAccess;

    const/4 v2, 0x1

    const-string v3, "accessible-for-notify"

    const-string v4, "accessibleForNotify"

    invoke-direct {v1, v4, v2, v3}, Lorg/snmp4j/smi/MaxAccess;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Lorg/snmp4j/smi/MaxAccess;->accessibleForNotify:Lorg/snmp4j/smi/MaxAccess;

    new-instance v2, Lorg/snmp4j/smi/MaxAccess;

    const/4 v3, 0x2

    const-string v4, "write-only"

    const-string v5, "writeOnly"

    invoke-direct {v2, v5, v3, v4}, Lorg/snmp4j/smi/MaxAccess;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v2, Lorg/snmp4j/smi/MaxAccess;->writeOnly:Lorg/snmp4j/smi/MaxAccess;

    new-instance v3, Lorg/snmp4j/smi/MaxAccess;

    const/4 v4, 0x3

    const-string v5, "read-only"

    const-string v6, "readOnly"

    invoke-direct {v3, v6, v4, v5}, Lorg/snmp4j/smi/MaxAccess;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v3, Lorg/snmp4j/smi/MaxAccess;->readOnly:Lorg/snmp4j/smi/MaxAccess;

    new-instance v4, Lorg/snmp4j/smi/MaxAccess;

    const/4 v5, 0x4

    const-string v6, "read-write"

    const-string v7, "readWrite"

    invoke-direct {v4, v7, v5, v6}, Lorg/snmp4j/smi/MaxAccess;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v4, Lorg/snmp4j/smi/MaxAccess;->readWrite:Lorg/snmp4j/smi/MaxAccess;

    new-instance v5, Lorg/snmp4j/smi/MaxAccess;

    const/4 v6, 0x5

    const-string v7, "read-create"

    const-string v8, "readCreate"

    invoke-direct {v5, v8, v6, v7}, Lorg/snmp4j/smi/MaxAccess;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v5, Lorg/snmp4j/smi/MaxAccess;->readCreate:Lorg/snmp4j/smi/MaxAccess;

    filled-new-array/range {v0 .. v5}, [Lorg/snmp4j/smi/MaxAccess;

    move-result-object v0

    sput-object v0, Lorg/snmp4j/smi/MaxAccess;->$VALUES:[Lorg/snmp4j/smi/MaxAccess;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lorg/snmp4j/smi/MaxAccess;->smiValue:Ljava/lang/String;

    return-void
.end method

.method public static fromSmiValue(Ljava/lang/String;)Lorg/snmp4j/smi/MaxAccess;
    .locals 5

    invoke-static {}, Lorg/snmp4j/smi/MaxAccess;->values()[Lorg/snmp4j/smi/MaxAccess;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    invoke-virtual {v3}, Lorg/snmp4j/smi/MaxAccess;->getSmiValue()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    return-object v3

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lorg/snmp4j/smi/MaxAccess;
    .locals 1

    const-class v0, Lorg/snmp4j/smi/MaxAccess;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lorg/snmp4j/smi/MaxAccess;

    return-object p0
.end method

.method public static values()[Lorg/snmp4j/smi/MaxAccess;
    .locals 1

    sget-object v0, Lorg/snmp4j/smi/MaxAccess;->$VALUES:[Lorg/snmp4j/smi/MaxAccess;

    invoke-virtual {v0}, [Lorg/snmp4j/smi/MaxAccess;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lorg/snmp4j/smi/MaxAccess;

    return-object v0
.end method


# virtual methods
.method public getSmiValue()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/smi/MaxAccess;->smiValue:Ljava/lang/String;

    return-object v0
.end method

.method public isCreatable()Z
    .locals 1

    sget-object v0, Lorg/snmp4j/smi/MaxAccess;->readCreate:Lorg/snmp4j/smi/MaxAccess;

    if-ne p0, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public isReadOnly()Z
    .locals 1

    sget-object v0, Lorg/snmp4j/smi/MaxAccess;->readOnly:Lorg/snmp4j/smi/MaxAccess;

    if-ne p0, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public isWritable()Z
    .locals 2

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    sget-object v1, Lorg/snmp4j/smi/MaxAccess;->readWrite:Lorg/snmp4j/smi/MaxAccess;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
