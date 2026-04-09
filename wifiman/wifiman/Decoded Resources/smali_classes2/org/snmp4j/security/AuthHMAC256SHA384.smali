.class public Lorg/snmp4j/security/AuthHMAC256SHA384;
.super Lorg/snmp4j/security/AuthSHA2;
.source "SourceFile"


# static fields
.field private static final AUTH_CODE_LENGTH:I = 0x20

.field private static final DIGEST_LENGTH:I = 0x30

.field private static final HMAC_BLOCK_SIZE:I = 0x80

.field public static final ID:Lorg/snmp4j/smi/OID;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lorg/snmp4j/smi/OID;

    const/16 v1, 0xa

    new-array v1, v1, [I

    fill-array-data v1, :array_0

    invoke-direct {v0, v1}, Lorg/snmp4j/smi/OID;-><init>([I)V

    sput-object v0, Lorg/snmp4j/security/AuthHMAC256SHA384;->ID:Lorg/snmp4j/smi/OID;

    return-void

    nop

    :array_0
    .array-data 4
        0x1
        0x3
        0x6
        0x1
        0x6
        0x3
        0xa
        0x1
        0x1
        0x6
    .end array-data
.end method

.method public constructor <init>()V
    .locals 6

    sget-object v2, Lorg/snmp4j/security/AuthHMAC256SHA384;->ID:Lorg/snmp4j/smi/OID;

    const/16 v4, 0x20

    const/16 v5, 0x80

    const-string v1, "SHA-384"

    const/16 v3, 0x30

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lorg/snmp4j/security/AuthSHA2;-><init>(Ljava/lang/String;Lorg/snmp4j/smi/OID;III)V

    return-void
.end method
