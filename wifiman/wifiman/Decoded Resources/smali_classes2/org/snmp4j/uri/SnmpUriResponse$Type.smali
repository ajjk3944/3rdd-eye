.class public final enum Lorg/snmp4j/uri/SnmpUriResponse$Type;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/snmp4j/uri/SnmpUriResponse;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "Type"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lorg/snmp4j/uri/SnmpUriResponse$Type;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lorg/snmp4j/uri/SnmpUriResponse$Type;

.field public static final enum FINAL:Lorg/snmp4j/uri/SnmpUriResponse$Type;

.field public static final enum IO_ERROR:Lorg/snmp4j/uri/SnmpUriResponse$Type;

.field public static final enum LEXICOGRAPHIC_ORDER_ERROR:Lorg/snmp4j/uri/SnmpUriResponse$Type;

.field public static final enum NEXT:Lorg/snmp4j/uri/SnmpUriResponse$Type;

.field public static final enum SECURITY_ERROR:Lorg/snmp4j/uri/SnmpUriResponse$Type;

.field public static final enum SNMP_ERROR:Lorg/snmp4j/uri/SnmpUriResponse$Type;

.field public static final enum TIMEOUT:Lorg/snmp4j/uri/SnmpUriResponse$Type;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    new-instance v0, Lorg/snmp4j/uri/SnmpUriResponse$Type;

    const-string v1, "FINAL"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lorg/snmp4j/uri/SnmpUriResponse$Type;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/snmp4j/uri/SnmpUriResponse$Type;->FINAL:Lorg/snmp4j/uri/SnmpUriResponse$Type;

    new-instance v1, Lorg/snmp4j/uri/SnmpUriResponse$Type;

    const-string v2, "NEXT"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Lorg/snmp4j/uri/SnmpUriResponse$Type;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lorg/snmp4j/uri/SnmpUriResponse$Type;->NEXT:Lorg/snmp4j/uri/SnmpUriResponse$Type;

    new-instance v2, Lorg/snmp4j/uri/SnmpUriResponse$Type;

    const-string v3, "TIMEOUT"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Lorg/snmp4j/uri/SnmpUriResponse$Type;-><init>(Ljava/lang/String;I)V

    sput-object v2, Lorg/snmp4j/uri/SnmpUriResponse$Type;->TIMEOUT:Lorg/snmp4j/uri/SnmpUriResponse$Type;

    new-instance v3, Lorg/snmp4j/uri/SnmpUriResponse$Type;

    const-string v4, "SNMP_ERROR"

    const/4 v5, 0x3

    invoke-direct {v3, v4, v5}, Lorg/snmp4j/uri/SnmpUriResponse$Type;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lorg/snmp4j/uri/SnmpUriResponse$Type;->SNMP_ERROR:Lorg/snmp4j/uri/SnmpUriResponse$Type;

    new-instance v4, Lorg/snmp4j/uri/SnmpUriResponse$Type;

    const-string v5, "IO_ERROR"

    const/4 v6, 0x4

    invoke-direct {v4, v5, v6}, Lorg/snmp4j/uri/SnmpUriResponse$Type;-><init>(Ljava/lang/String;I)V

    sput-object v4, Lorg/snmp4j/uri/SnmpUriResponse$Type;->IO_ERROR:Lorg/snmp4j/uri/SnmpUriResponse$Type;

    new-instance v5, Lorg/snmp4j/uri/SnmpUriResponse$Type;

    const-string v6, "SECURITY_ERROR"

    const/4 v7, 0x5

    invoke-direct {v5, v6, v7}, Lorg/snmp4j/uri/SnmpUriResponse$Type;-><init>(Ljava/lang/String;I)V

    sput-object v5, Lorg/snmp4j/uri/SnmpUriResponse$Type;->SECURITY_ERROR:Lorg/snmp4j/uri/SnmpUriResponse$Type;

    new-instance v6, Lorg/snmp4j/uri/SnmpUriResponse$Type;

    const-string v7, "LEXICOGRAPHIC_ORDER_ERROR"

    const/4 v8, 0x6

    invoke-direct {v6, v7, v8}, Lorg/snmp4j/uri/SnmpUriResponse$Type;-><init>(Ljava/lang/String;I)V

    sput-object v6, Lorg/snmp4j/uri/SnmpUriResponse$Type;->LEXICOGRAPHIC_ORDER_ERROR:Lorg/snmp4j/uri/SnmpUriResponse$Type;

    filled-new-array/range {v0 .. v6}, [Lorg/snmp4j/uri/SnmpUriResponse$Type;

    move-result-object v0

    sput-object v0, Lorg/snmp4j/uri/SnmpUriResponse$Type;->$VALUES:[Lorg/snmp4j/uri/SnmpUriResponse$Type;

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

.method public static valueOf(Ljava/lang/String;)Lorg/snmp4j/uri/SnmpUriResponse$Type;
    .locals 1

    const-class v0, Lorg/snmp4j/uri/SnmpUriResponse$Type;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lorg/snmp4j/uri/SnmpUriResponse$Type;

    return-object p0
.end method

.method public static values()[Lorg/snmp4j/uri/SnmpUriResponse$Type;
    .locals 1

    sget-object v0, Lorg/snmp4j/uri/SnmpUriResponse$Type;->$VALUES:[Lorg/snmp4j/uri/SnmpUriResponse$Type;

    invoke-virtual {v0}, [Lorg/snmp4j/uri/SnmpUriResponse$Type;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lorg/snmp4j/uri/SnmpUriResponse$Type;

    return-object v0
.end method
