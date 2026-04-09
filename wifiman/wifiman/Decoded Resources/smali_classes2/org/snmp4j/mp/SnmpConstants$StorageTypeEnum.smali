.class public final enum Lorg/snmp4j/mp/SnmpConstants$StorageTypeEnum;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/snmp4j/mp/SnmpConstants;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "StorageTypeEnum"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lorg/snmp4j/mp/SnmpConstants$StorageTypeEnum;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lorg/snmp4j/mp/SnmpConstants$StorageTypeEnum;

.field public static final enum _volatile:Lorg/snmp4j/mp/SnmpConstants$StorageTypeEnum;

.field public static final enum nonVolatile:Lorg/snmp4j/mp/SnmpConstants$StorageTypeEnum;

.field public static final enum other:Lorg/snmp4j/mp/SnmpConstants$StorageTypeEnum;

.field public static final enum permanent:Lorg/snmp4j/mp/SnmpConstants$StorageTypeEnum;

.field public static final enum readOnly:Lorg/snmp4j/mp/SnmpConstants$StorageTypeEnum;


# instance fields
.field private smiValue:I


# direct methods
.method static constructor <clinit>()V
    .locals 8

    new-instance v0, Lorg/snmp4j/mp/SnmpConstants$StorageTypeEnum;

    const-string v1, "other"

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lorg/snmp4j/mp/SnmpConstants$StorageTypeEnum;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lorg/snmp4j/mp/SnmpConstants$StorageTypeEnum;->other:Lorg/snmp4j/mp/SnmpConstants$StorageTypeEnum;

    new-instance v1, Lorg/snmp4j/mp/SnmpConstants$StorageTypeEnum;

    const-string v2, "_volatile"

    const/4 v4, 0x2

    invoke-direct {v1, v2, v3, v4}, Lorg/snmp4j/mp/SnmpConstants$StorageTypeEnum;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lorg/snmp4j/mp/SnmpConstants$StorageTypeEnum;->_volatile:Lorg/snmp4j/mp/SnmpConstants$StorageTypeEnum;

    new-instance v2, Lorg/snmp4j/mp/SnmpConstants$StorageTypeEnum;

    const-string v3, "nonVolatile"

    const/4 v5, 0x3

    invoke-direct {v2, v3, v4, v5}, Lorg/snmp4j/mp/SnmpConstants$StorageTypeEnum;-><init>(Ljava/lang/String;II)V

    sput-object v2, Lorg/snmp4j/mp/SnmpConstants$StorageTypeEnum;->nonVolatile:Lorg/snmp4j/mp/SnmpConstants$StorageTypeEnum;

    new-instance v3, Lorg/snmp4j/mp/SnmpConstants$StorageTypeEnum;

    const-string v4, "permanent"

    const/4 v6, 0x4

    invoke-direct {v3, v4, v5, v6}, Lorg/snmp4j/mp/SnmpConstants$StorageTypeEnum;-><init>(Ljava/lang/String;II)V

    sput-object v3, Lorg/snmp4j/mp/SnmpConstants$StorageTypeEnum;->permanent:Lorg/snmp4j/mp/SnmpConstants$StorageTypeEnum;

    new-instance v4, Lorg/snmp4j/mp/SnmpConstants$StorageTypeEnum;

    const-string v5, "readOnly"

    const/4 v7, 0x5

    invoke-direct {v4, v5, v6, v7}, Lorg/snmp4j/mp/SnmpConstants$StorageTypeEnum;-><init>(Ljava/lang/String;II)V

    sput-object v4, Lorg/snmp4j/mp/SnmpConstants$StorageTypeEnum;->readOnly:Lorg/snmp4j/mp/SnmpConstants$StorageTypeEnum;

    filled-new-array {v0, v1, v2, v3, v4}, [Lorg/snmp4j/mp/SnmpConstants$StorageTypeEnum;

    move-result-object v0

    sput-object v0, Lorg/snmp4j/mp/SnmpConstants$StorageTypeEnum;->$VALUES:[Lorg/snmp4j/mp/SnmpConstants$StorageTypeEnum;

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

    iput p3, p0, Lorg/snmp4j/mp/SnmpConstants$StorageTypeEnum;->smiValue:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lorg/snmp4j/mp/SnmpConstants$StorageTypeEnum;
    .locals 1

    const-class v0, Lorg/snmp4j/mp/SnmpConstants$StorageTypeEnum;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lorg/snmp4j/mp/SnmpConstants$StorageTypeEnum;

    return-object p0
.end method

.method public static values()[Lorg/snmp4j/mp/SnmpConstants$StorageTypeEnum;
    .locals 1

    sget-object v0, Lorg/snmp4j/mp/SnmpConstants$StorageTypeEnum;->$VALUES:[Lorg/snmp4j/mp/SnmpConstants$StorageTypeEnum;

    invoke-virtual {v0}, [Lorg/snmp4j/mp/SnmpConstants$StorageTypeEnum;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lorg/snmp4j/mp/SnmpConstants$StorageTypeEnum;

    return-object v0
.end method


# virtual methods
.method public getSmiValue()I
    .locals 1

    iget v0, p0, Lorg/snmp4j/mp/SnmpConstants$StorageTypeEnum;->smiValue:I

    return v0
.end method
